/*
 * Copyright (c) Huawei Technologies Co., Ltd. 2025-2025. All rights reserved.
 *
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package com.huaweicloud.sdk.core.impl;

import com.huaweicloud.sdk.core.Constants;
import com.huaweicloud.sdk.core.http.UserAgent;
import com.huaweicloud.sdk.core.utils.PathUtils;
import com.huaweicloud.sdk.core.utils.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.attribute.PosixFilePermissions;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * Generate default user agent
 *
 * @author HuaweiCloud_SDK
 */
public final class DefaultUserAgent implements UserAgent {
    private static final Logger LOGGER = LoggerFactory.getLogger(DefaultUserAgent.class);

    private static final String DEFAULT_APPLICATION_ID_FILE_NAME = "application_id";

    private static final Pattern UUID_PATTERN = Pattern.compile("^[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}$");

    private static final FileAttribute<Set<PosixFilePermission>> DIR_DEFAULT_PERMISSION =
            PosixFilePermissions.asFileAttribute(PosixFilePermissions.fromString("rwxr-x---"));

    private static final FileAttribute<Set<PosixFilePermission>> FILE_DEFAULT_PERMISSION =
            PosixFilePermissions.asFileAttribute(PosixFilePermissions.fromString("rw-r-----"));

    private static volatile DefaultUserAgent instance;

    private final String userAgent;
    private final String osInfo;
    private final String javaInfo;
    private final String vmInfo;
    private final String langInfo;
    private final String appId;

    private DefaultUserAgent() {
        this.osInfo = concat(Arrays.asList(JavaProperty.OS_NAME, JavaProperty.OS_VERSION, JavaProperty.OS_ARCH));
        this.javaInfo = concat(Arrays.asList(JavaProperty.VENDOR, JavaProperty.VERSION));
        this.vmInfo = concat(Arrays.asList(JavaProperty.VM_NAME, JavaProperty.VM_VERSION));
        this.langInfo = getLangInfo();
        this.appId = appId();
        this.userAgent = generateUserAgentString();
    }

    public static String userAgentString() {
        if (instance == null) {
            synchronized (DefaultUserAgent.class) {
                if (instance == null) {
                    instance = new DefaultUserAgent();
                }
            }
        }
        return instance.userAgent();
    }

    @Override
    public String userAgent() {
        return userAgent;
    }

    private String concat(List<JavaProperty> properties) {
        return properties.stream().map(JavaProperty::value).collect(Collectors.joining(HASH));
    }

    private String getLangInfo() {
        String language = JavaProperty.USER_LANGUAGE.value();
        String country = JavaProperty.USER_COUNTRY.value();
        String value = null;
        if (StringUtils.isNotEmpty(language) && StringUtils.isNotEmpty(country)) {
            value = language + UNDERLINE + country;
        }
        return value;
    }

    private String appId() {
        Path filePath = getAppFilePath();
        if (filePath != null) {
            String hisAppId = readAppId(filePath);
            if (StringUtils.isNotEmpty(hisAppId) && UUID_PATTERN.matcher(hisAppId).matches()) {
                return hisAppId;
            }
            String newAppId = UUID.randomUUID().toString();
            if (storeAppId(newAppId, filePath)) {
                return newAppId;
            }
        }
        return null;
    }

    private Path getAppFilePath() {
        String userHome = PathUtils.getUserHomePath();
        if (StringUtils.isEmpty(userHome)) {
            return null;
        }

        try {
            return Paths.get(userHome).toRealPath().resolve(
                    Constants.DEFAULT_PROFILE_DIR_NAME + File.separator + DEFAULT_APPLICATION_ID_FILE_NAME);
        } catch (Exception e) {
            LOGGER.warn("The user directory is not a valid path.");
            return null;
        }
    }

    private String readAppId(Path filePath) {
        String firstLine = null;
        if (PathUtils.isValidFile(filePath.toFile())) {
            try (BufferedReader reader = Files.newBufferedReader(filePath, StandardCharsets.UTF_8)) {
                firstLine = reader.readLine();
            } catch (Exception ignored) {
                return null;
            }
        }
        return firstLine;
    }

    private boolean storeAppId(String appId, Path filePath) {
        try {
            Path parentDir = filePath.getParent();
            try {
                Files.createDirectories(parentDir, DIR_DEFAULT_PERMISSION);
            } catch (UnsupportedOperationException e) {
                Files.createDirectories(parentDir);
            }

            if (!Files.exists(filePath)) {
                try {
                    Files.createFile(filePath, FILE_DEFAULT_PERMISSION);
                } catch (UnsupportedOperationException e) {
                    Files.createFile(filePath);
                }
            }
            Files.write(filePath, appId.getBytes(StandardCharsets.UTF_8));
            return true;
        } catch (Exception ignored) {
            return false;
        }
    }

    private String generateUserAgentString() {
        StringBuilder uaString = new StringBuilder(255);
        appendNonEmptyValue(uaString, OS_META, this.osInfo, SPACE);
        appendNonEmptyValue(uaString, JAVA_META, this.javaInfo, SPACE);
        appendNonEmptyValue(uaString, VM_META, this.vmInfo, SPACE);
        appendNonEmptyValue(uaString, METADATA, this.langInfo, SPACE);
        appendNonEmptyValue(uaString, APPID_META, this.appId, SEMICOLON);

        return uaString.toString();
    }

    private void appendNonEmptyValue(StringBuilder builder, String prefix, String value, String delimiter) {
        if (StringUtils.isEmpty(value)) {
            return;
        }
        if (builder.length() > 0) {
            builder.append(delimiter);
        }
        builder.append(prefix).append(SLASH).append(USER_AGENT_VALUE_PATTERN.matcher(value).replaceAll(UNDERLINE));
    }


    /**
     * JavaProperty
     *
     * @since 2025-08-19
     */
    private enum JavaProperty {
        VENDOR("java.vendor"),
        VERSION("java.version"),
        VM_NAME("java.vm.name"),
        VM_VERSION("java.vm.version"),

        OS_NAME("os.name"),
        OS_VERSION("os.version"),
        OS_ARCH("os.arch"),

        USER_LANGUAGE("user.language"),
        USER_COUNTRY("user.country");

        private final String key;

        JavaProperty(String key) {
            this.key = key;
        }

        String value() {
            try {
                return Optional.ofNullable(System.getProperty(key)).orElse("");
            } catch (Exception ignored) {
                return "";
            }
        }
    }
}
