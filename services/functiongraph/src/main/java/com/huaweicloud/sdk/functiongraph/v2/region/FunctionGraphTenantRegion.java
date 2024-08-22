/*
 * Copyright (c) Huawei Technologies Co., Ltd. 2024-2024. All rights reserved.
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

package com.huaweicloud.sdk.functiongraph.v2.region;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.huaweicloud.sdk.core.Constants;
import com.huaweicloud.sdk.core.region.Region;
import com.huaweicloud.sdk.core.utils.StringUtils;

public class FunctionGraphTenantRegion {
    private static final Logger logger = LoggerFactory.getLogger(FunctionGraphTenantRegion.class);

    static {
        System.setProperty("sun.net.spi.nameservice.provider.1", "sun,dns");
    }

    private static final Map<String, Region> REGION_AFTER_INIT = new HashMap<>();

    private static final Object LOCK = new Object();

    /**
     * single instance cache
     * @param regionId region id
     * @return pre-render region
     */
    public static Region valueOf(String regionId) {
        if (StringUtils.isEmpty(regionId)) {
            throw new IllegalArgumentException("Unexpected empty parameter: regionId.");
        }
        Region result = (Region) REGION_AFTER_INIT.get(regionId);
        if (Objects.nonNull(result)) {
            return result;
        }
        Region regionOrigin = FunctionGraphRegion.valueOf(regionId);
        Region region = phraseTenantRegionUrl(regionOrigin);
        // double-checked locking
        result = (Region) REGION_AFTER_INIT.get(regionId);
        if (Objects.nonNull(result)) {
            return result;
        }
        synchronized (LOCK) {
            Region regionAfterInit = processRegion(region);
            REGION_AFTER_INIT.put(regionId, regionAfterInit);
            return regionAfterInit;
        }
    }

    private static Region phraseTenantRegionUrl(Region regionOrigin) {
        // 重新构造新对象，防止对老对象产生影响
        Region region = new Region();
        region.setId(regionOrigin.getId());
        List<String> endpoints = regionOrigin.getEndpoints();
        List<String> tenantEndpoints = endpoints.stream()
            .map(url -> url.replace("functiongraph", "functiongraph-ext"))
            .collect(Collectors.toList());

        region.setEndpoints(tenantEndpoints);
        return region;
    }

    /**
     * parse dns set region endpoint with ip
     * @param region region
     * @return pre-render region
     */
    public static Region processRegion(Region region) {
        if (region.getEndpoints() != null && region.getEndpoints().size() > 0) {
            List<String> endpoints = parseByDns(region.getEndpoints());
            endpoints.add(region.getEndpoints().get(0));
            region.withEndpointsOverride(endpoints);
        }
        return region;
    }

    private static List<String> parseByDns(List<String> domainNames) {
        return domainNames.stream().flatMap(domainName -> parseByDns(domainName).stream()).distinct()
            .collect(Collectors.toList());
    }

    private static List<String> parseByDns(String domainName) {
        String domainReplace = domainName.replace(Constants.HTTPS_SCHEME + "://", "");
        List<String> records = new ArrayList<>();

        try {
            InetAddress[] inetAddress = InetAddress.getAllByName(domainReplace);
            for (InetAddress inetAddressEntry : inetAddress) {
                records.add(Constants.HTTPS_SCHEME + "://" + inetAddressEntry.getHostAddress());
            }
        } catch (UnknownHostException e) {
            logger.error("phrase dns failed,unknown domain name: " + domainName);
        }

        return records;
    }

}
