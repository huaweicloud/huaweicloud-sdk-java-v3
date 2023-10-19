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
import org.yaml.snakeyaml.LoaderOptions;
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
                throw new SdkException(String.format("invalid regions file path: '%s'", regionsFilePath));
            }
            Map<String, Region> result = resolveRegions(file.getCanonicalPath());
            return new ProfileRegionCache(Collections.unmodifiableMap(result));
        } catch (IOException e) {
            throw new SdkException(String.format("failed to resolve file '%s'", regionsFilePath), e);
        }
    }

    @SuppressWarnings("unchecked")
    private static Map<String, Region> resolveRegions(String filepath) {
        Map<String, Region> result = new LinkedHashMap<>();
        Yaml yaml = new Yaml(new SafeConstructor(new LoaderOptions()));
        Map<?, ?> map;
        try (FileInputStream inputStream = new FileInputStream(filepath)) {
            Object obj = yaml.load(inputStream);
            if (obj instanceof Map) {
                map = (Map<?, ?>) obj;
            } else {
                return result;
            }
        } catch (IOException e) {
            throw new SdkException(String.format("failed to resolve file '%s'", filepath), e);
        }

        Iterator<? extends Map.Entry<?, ?>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<?, ?> next = iterator.next();
            if (!(next.getValue() instanceof List)) {
                continue;
            }
            for (Object o : (List<?>) next.getValue()) {
                if (!(o instanceof Map)) {
                    continue;
                }
                try {
                    Map<?, ?> regionMap = (Map<?, ?>) o;
                    String id = (String) regionMap.get("id");
                    if (StringUtils.isEmpty(id)) {
                        continue;
                    }

                    String endpoint = (String) regionMap.get("endpoint");
                    List<String> endpoints = (List<String>) regionMap.get("endpoints");
                    if (Objects.isNull(endpoints)) {
                        endpoints = new ArrayList<>();
                    }
                    if (!StringUtils.isEmpty(endpoint)) {
                        endpoints.add(endpoint);
                    }

                    if (!endpoints.isEmpty()) {
                        Region region = new Region(id, endpoints.toArray(new String[0]));
                        result.put(next.getKey().toString().toUpperCase(Locale.ROOT) + id, region);
                    }
                } catch (ClassCastException e) {
                    throw new SdkException(String.format("failed to resolve file '%s'", filepath), e);
                }
            }
        }
        return result;
    }

    private static String getRegionsFilePath() {
        String regionsFile = System.getenv(REGIONS_FILE_ENV);
        if (!StringUtils.isEmpty(regionsFile)) {
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
}
