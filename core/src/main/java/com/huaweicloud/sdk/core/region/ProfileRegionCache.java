/*
 * Copyright (c) Huawei Technologies Co., Ltd. 2021-2021. All rights reserved.
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

package com.huaweicloud.sdk.core.region;

import com.huaweicloud.sdk.core.Constants;
import com.huaweicloud.sdk.core.exception.SdkException;
import com.huaweicloud.sdk.core.utils.PathUtils;
import com.huaweicloud.sdk.core.utils.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.yaml.snakeyaml.Yaml;
import org.yaml.snakeyaml.constructor.SafeConstructor;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;

public class ProfileRegionCache {
    private static final String REGIONS_FILE_REG = "^[a-zA-Z0-9._ -]+\\.(yml|yaml)$";

    private static final String DEFAULT_REGIONS_FILE_NAME = "regions.yaml";

    private static final String REGIONS_FILE_ENV = "HUAWEICLOUD_SDK_REGIONS_FILE";

    private static final Logger logger = LoggerFactory.getLogger(ProfileRegionCache.class);

    private static final ProfileRegionCache INSTANCE = createInstance();

    protected final Map<String, Region> value;

    private ProfileRegionCache(Map<String, Region> value) {
        this.value = value;
    }

    protected static ProfileRegionCache getInstance() {
        return INSTANCE;
    }

    private static ProfileRegionCache createInstance() {
        String regionsFilePath = getRegionsFilePath();
        if (Objects.isNull(regionsFilePath) || !PathUtils.isPathExist(regionsFilePath)) {
            return new ProfileRegionCache(Collections.unmodifiableMap(new LinkedHashMap<>()));
        }

        try {
            File file = new File(regionsFilePath).getCanonicalFile();
            if (!isValidRegionsFile(file)) {
                String message = String.format("Invalid regions file path: '%s'", regionsFilePath);
                logger.error(message);
                throw new SdkException(message);
            }
            Map<String, Region> result = resolveRegions(file.getCanonicalPath());
            return new ProfileRegionCache(Collections.unmodifiableMap(result));
        } catch (IOException e) {
            String message = String.format("Failed to resolve file '%s'", regionsFilePath);
            logger.error(message, e);
            throw new SdkException(message, e);
        }
    }

    private static Map<String, Region> resolveRegions(String filepath) {
        Map<String, Region> result = new LinkedHashMap<>();
        Object obj = loadYaml(filepath);
        if (!(obj instanceof Map)) {
            return result;
        }

        try {
            return processRegions(obj);
        } catch (ClassCastException e) {
            String message = String.format("failed to resolve file '%s'", filepath);
            logger.error(message, e);
            throw new SdkException(message, e);
        }
    }

    @SuppressWarnings("unchecked")
    private static Map<String, Region> processRegions(Object obj) {
        Map<String, Region> result = new LinkedHashMap<>();
        if (!(obj instanceof Map)) {
            return result;
        }

        Iterator<? extends Map.Entry<?, ?>> iterator = ((Map<String, ?>) obj).entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<?, ?> next = iterator.next();
            if (!(next.getValue() instanceof List)) {
                continue;
            }
            for (Object o : (List<?>) next.getValue()) {
                if (!(o instanceof Map)) {
                    continue;
                }
                Map<String, ?> regionMap = (Map<String, ?>) o;
                String id = (String) regionMap.get("id");
                if (StringUtils.isEmpty(id)) {
                    continue;
                }

                List<String> endpoints = processEndpoints(regionMap);
                if (endpoints.isEmpty()) {
                    continue;
                }
                Region region = new Region(id, endpoints.toArray(new String[0]));
                result.put(next.getKey().toString().toUpperCase(Locale.US) + id, region);
            }
        }
        return result;
    }

    @SuppressWarnings("unchecked")
    private static List<String> processEndpoints(Map<String, ?> regionMap) {
        String endpoint = (String) regionMap.get("endpoint");
        List<String> endpoints = (List<String>) regionMap.get("endpoints");
        if (Objects.isNull(endpoints)) {
            endpoints = new ArrayList<>();
        }
        if (StringUtils.isNotEmpty(endpoint)) {
            endpoints.add(endpoint);
        }
        return endpoints;
    }

    private static Object loadYaml(String filepath) {
        Yaml yaml = SafeYamlFactory.createSafeYaml();
        try (FileInputStream inputStream = new FileInputStream(filepath)) {
            return yaml.load(inputStream);
        } catch (IOException e) {
            String message = String.format("Failed to resolve file '%s'", filepath);
            logger.error(message, e);
            throw new SdkException(message, e);
        }
    }

    private static String getRegionsFilePath() {
        String regionsFile = System.getenv(REGIONS_FILE_ENV);
        if (StringUtils.isNotEmpty(regionsFile)) {
            return regionsFile;
        }

        String userHomePath = PathUtils.getUserHomePath();
        return StringUtils.isEmpty(userHomePath) ? null : userHomePath + File.separator
                + Constants.DEFAULT_PROFILE_DIR_NAME + File.separator + DEFAULT_REGIONS_FILE_NAME;
    }

    private static boolean isValidRegionsFile(File file) {
        if (!file.getName().matches(REGIONS_FILE_REG)) {
            return false;
        }
        return PathUtils.isValidFile(file);
    }

    static class SafeYamlFactory {
        private static Class<?> loaderOptionsClass;

        static {
            try {
                loaderOptionsClass = Class.forName("org.yaml.snakeyaml.LoaderOptions");
            } catch (ClassNotFoundException e) {
                loaderOptionsClass = null;
            }
        }

        public static Yaml createSafeYaml() {
            return new Yaml(createSafeConstructor());
        }

        private static SafeConstructor createSafeConstructor() {
            try {
                // snakeyaml 1.17
                if (loaderOptionsClass == null) {
                    logger.warn("Initialize Yaml failed due to version conflict," +
                            " use default construct to reinitialize." +
                            " It is recommended that you use org.yaml:snakeyaml v2.0+" +
                            " for better security and compatibility.");
                    return SafeConstructor.class.newInstance();
                }

                // snakeyaml 1.18+
                Object options = loaderOptionsClass.getDeclaredConstructor().newInstance();
                return SafeConstructor.class
                        .getDeclaredConstructor(loaderOptionsClass)
                        .newInstance(options);
            } catch (Exception e) {
                throw new SdkException("Failed to initialize yaml loader.", e);
            }
        }
    }
}
