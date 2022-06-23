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

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import com.huaweicloud.sdk.core.exception.SdkException;
import com.huaweicloud.sdk.core.utils.StringUtils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public class ProfileRegionCache {
    private static final ProfileRegionCache INSTANCE = createInstance();

    private static final String DEFAULT_REGIONS_FILE_DIR_NAME = ".huaweicloud";

    private static final String DEFAULT_REGIONS_FILE_NAME = "regions.yaml";

    private static final String REGIONS_FILE_ENV = "HUAWEICLOUD_SDK_REGIONS_FILE";

    protected final Map<String, Region> value;

    private ProfileRegionCache(Map<String, Region> value) {
        this.value = value;
    }

    protected static ProfileRegionCache getInstance() {
        return INSTANCE;
    }

    private static ProfileRegionCache createInstance() {
        Map<String, Region> result = new LinkedHashMap<>();
        String regionsFilePath = getRegionsFilePath();
        if (!isPathExist(regionsFilePath)) {
            return new ProfileRegionCache(Collections.unmodifiableMap(result));
        }

        ObjectMapper mapper = new ObjectMapper(new YAMLFactory());
        Map<String, List<Region>> map;
        try {
            map = mapper.readValue(new File(regionsFilePath), new TypeReference<Map<String, List<Region>>>() {
            });
        } catch (IOException e) {
            throw new SdkException("failed to resolve file: " + regionsFilePath, e);
        }

        Iterator<Map.Entry<String, List<Region>>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, List<Region>> entry = iterator.next();
            for (Region region : entry.getValue()) {
                result.put(entry.getKey().toUpperCase(Locale.ROOT) + region.getId(), region);
            }
        }
        return new ProfileRegionCache(Collections.unmodifiableMap(result));
    }

    private static String getRegionsFilePath() {
        String regionsFile = System.getenv(REGIONS_FILE_ENV);
        return StringUtils.isEmpty(regionsFile) ? System.getProperty("user.home") + File.separator
                + DEFAULT_REGIONS_FILE_DIR_NAME + File.separator + DEFAULT_REGIONS_FILE_NAME : regionsFile;
    }

    private static boolean isPathExist(String path) {
        return Files.exists(Paths.get(path));
    }
}
