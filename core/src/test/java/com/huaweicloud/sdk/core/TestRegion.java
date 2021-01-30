package com.huaweicloud.sdk.core;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.huaweicloud.sdk.core.region.Region;
import com.huaweicloud.sdk.core.utils.StringUtils;

/**
 * TestRegion 为基础类，被 TestRegionEndpoint 和 TestRegionWithoutId 用例使用
 */
public class TestRegion {
    public static final String SERVICE_ENDPOINT = "http://127.0.0.1:10086";
    public static final String TEST_ENDPOINT = "https://test.huaweicloud.com";

    public static final Region CN_NORTH_7 = new Region("cn-north-7", SERVICE_ENDPOINT);
    public static final Region CN_NORTH_201 = new Region("cn-north-201", SERVICE_ENDPOINT);
    public static final Region CN_NORTH_400 = new Region("cn-north-400", SERVICE_ENDPOINT);

    private static final Map<String, Region> STATIC_FIELDS = createStaticFields();

    private static Map<String, Region> createStaticFields() {
        Map<String, Region> map = new HashMap<>();
        map.put("cn-north-7", CN_NORTH_7);
        map.put("cn-north-201", CN_NORTH_201);
        map.put("cn-north-400", CN_NORTH_400);
        return Collections.unmodifiableMap(map);
    }

    public static Region valueOf(String regionId) {
        if (StringUtils.isEmpty(regionId)) {
            throw new IllegalArgumentException("Unexpected empty parameter: regionId.");
        }
        Region result = STATIC_FIELDS.get(regionId);
        if (Objects.nonNull(result)) {
            return result;
        }
        throw new IllegalArgumentException("Unexpected regionId: " + regionId);
    }
}
