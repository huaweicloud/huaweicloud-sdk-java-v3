/*
 * Copyright (c) Huawei Technologies Co., Ltd. 2022-2022. All rights reserved.
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

package com.huaweicloud.sdk.core.auth;

import com.huaweicloud.sdk.core.Constants;
import com.huaweicloud.sdk.core.exception.SdkException;
import com.huaweicloud.sdk.core.utils.PathUtils;
import com.huaweicloud.sdk.core.utils.StringUtils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ProfileCredentialProvider implements ICredentialProvider {

    private static final String FILE_NAME_REG = "^[a-zA-Z0-9._ -]+\\.(ini|properties)$";

    private static final String CREDENTIALS_FILE_ENV_NAME = "HUAWEICLOUD_SDK_CREDENTIALS_FILE";

    private static final String DEFAULT_CREDENTIALS_FILE_NAME = "credentials";

    private static final Pattern SECTION_PATTERN = Pattern.compile("^\\[([a-z]+)\\]\\s*");

    private static final Pattern KEY_VALUE_PATTERN = Pattern.compile("^(\\S+)\\s?=\\s?(\\S+)\\s*");

    private static final String AK_NAME = "ak";

    private static final String SK_NAME = "sk";

    private static final String PROJECT_ID_NAME = "project_id";

    private static final String DOMAIN_ID_NAME = "domain_id";

    private static final String SECURITY_TOKEN_NAME = "security_token";

    private static final String IAM_ENDPOINT_NAME = "iam_endpoint";

    private static final String IDP_ID_NAME = "idp_id";

    private static final String ID_TOKEN_FILE_NAME = "id_token_file";

    private final String credentialType;

    public ProfileCredentialProvider(String credentialType) {
        this.credentialType = credentialType.toLowerCase(Locale.ROOT);
    }

    public static ProfileCredentialProvider getBasicCredentialProfileProvider() {
        return new ProfileCredentialProvider(Constants.Credentials.BASIC);
    }

    public static ProfileCredentialProvider getGlobalCredentialProfileProvider() {
        return new ProfileCredentialProvider(Constants.Credentials.GLOBAL);
    }

    @Override
    public ICredential getCredentials() {
        if (StringUtils.isEmpty(credentialType)) {
            throw new SdkException("credential type is empty");
        }

        String filePath = getCredentialsFilePath();
        List<String> lines;
        try {
            lines = readFileToLines(filePath);
        } catch (IOException e) {
            throw new SdkException(e);
        }

        Map<String, String> map = profileLinesToMap(lines, filePath);
        return buildAbstractCredentials(map, filePath);
    }

    private Map<String, String> profileLinesToMap(List<String> lines, String filePath) {
        Map<String, String> map = new LinkedHashMap<>();
        Stack<String> sections = new Stack<>();
        sections.push("");
        for (String line : lines) {
            Matcher sectionMatcher = SECTION_PATTERN.matcher(line);
            Matcher kvMatcher = KEY_VALUE_PATTERN.matcher(line);
            if (sectionMatcher.matches() && sectionMatcher.groupCount() == 1) {
                sections.push(sectionMatcher.group(1));
            } else if (kvMatcher.matches() && kvMatcher.groupCount() == 2) {
                map.put(sections.peek() + kvMatcher.group(1), kvMatcher.group(2));
            }
        }

        if (!sections.contains(credentialType)) {
            throw new SdkException(String.format(
                    "credential type '%s' does not exist in credentials file '%s'", credentialType, filePath));
        }
        return map;
    }

    private AbstractCredentials<?> buildAbstractCredentials(Map<String, String> map, String filePath) {
        String ak = map.get(credentialType + AK_NAME);
        String sk = map.get(credentialType + SK_NAME);
        String securityToken = map.get(credentialType + SECURITY_TOKEN_NAME);
        String idpId = map.get(credentialType + IDP_ID_NAME);
        String idTokenFile = map.get(credentialType + ID_TOKEN_FILE_NAME);
        String iamEndpoint = map.get(credentialType + IAM_ENDPOINT_NAME);
        AbstractCredentials<?> credentials;
        if (credentialType.startsWith(Constants.Credentials.BASIC)) {
            credentials = new BasicCredentials().withProjectId(map.get(credentialType + PROJECT_ID_NAME));
        } else if (credentialType.startsWith(Constants.Credentials.GLOBAL)) {
            credentials = new GlobalCredentials().withDomainId(map.get(credentialType + DOMAIN_ID_NAME));
        } else {
            throw new SdkException(String.format("unsupported credential type '%s'", credentialType));
        }

        if (!StringUtils.isEmpty(idpId) && !StringUtils.isEmpty(idTokenFile)) {
            credentials.withIdpId(idpId).withIdTokenFile(idTokenFile);
        } else if (!StringUtils.isEmpty(ak) && !StringUtils.isEmpty(sk)) {
            credentials.withAk(ak).withSk(sk).withSecurityToken(securityToken);
        } else {
            throw new SdkException(String.format("%s&%s or %s&%s does not exist in credentials file '%s'",
                    AK_NAME, SK_NAME, IDP_ID_NAME, ID_TOKEN_FILE_NAME, filePath));
        }
        if (!StringUtils.isEmpty(iamEndpoint)) {
            credentials.withIamEndpoint(iamEndpoint);
        }
        return credentials;
    }

    private static String getCredentialsFilePath() {
        String credentialsFile = System.getenv(CREDENTIALS_FILE_ENV_NAME);
        if (!StringUtils.isEmpty(credentialsFile)) {
            return credentialsFile;
        }

        String userHomePath = PathUtils.getUserHomePath();
        return StringUtils.isEmpty(userHomePath) ? null : PathUtils.getUserHomePath() + File.separator
                + Constants.DEFAULT_PROFILE_DIR_NAME + File.separator + DEFAULT_CREDENTIALS_FILE_NAME;
    }

    private static boolean isValidCredentialsFile(File file) {
        String fileName = file.getName();
        if (fileName.equals(DEFAULT_CREDENTIALS_FILE_NAME) || fileName.matches(FILE_NAME_REG)) {
            return PathUtils.isValidFile(file);
        }
        return false;
    }

    private static List<String> readFileToLines(String filePath) throws IOException {
        File file = new File(filePath).getCanonicalFile();
        if (!file.exists()) {
            throw new IOException(String.format("credentials file '%s' does not exist", filePath));
        }
        if (!isValidCredentialsFile(file)) {
            throw new IOException(String.format("invalid credentials file path: '%s'", filePath));
        }
        return Files.readAllLines(Paths.get(filePath), StandardCharsets.UTF_8);
    }
}
