package com.huaweicloud.sdk.cloudbuild.v3.region;

import com.huaweicloud.sdk.core.region.Region;
import com.huaweicloud.sdk.core.utils.StringUtils;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class CloudBuildRegion {

    public static final Region CN_NORTH_4 =
        new Region("cn-north-4", "https://cloudbuild-ext.cn-north-4.myhuaweicloud.com");

    public static final Region CN_NORTH_1 =
        new Region("cn-north-1", "https://cloudbuild-ext.cn-north-1.myhuaweicloud.com");

    public static final Region CN_EAST_2 =
        new Region("cn-east-2", "https://cloudbuild-ext.cn-east-2.myhuaweicloud.com");

    public static final Region CN_SOUTH_1 =
        new Region("cn-south-1", "https://cloudbuild-ext.cn-south-1.myhuaweicloud.com");

    private static final Map<String, Region> STATIC_FIELDS = createStaticFields();

    private static Map<String, Region> createStaticFields() {
        Map<String, Region> map = new HashMap<>();
        map.put("cn-north-4", CN_NORTH_4);
        map.put("cn-north-1", CN_NORTH_1);
        map.put("cn-east-2", CN_EAST_2);
        map.put("cn-south-1", CN_SOUTH_1);
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
