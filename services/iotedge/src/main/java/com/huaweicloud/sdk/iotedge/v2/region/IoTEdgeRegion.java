package com.huaweicloud.sdk.iotedge.v2.region;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.huaweicloud.sdk.core.region.Region;
import com.huaweicloud.sdk.core.utils.StringUtils;

public class IoTEdgeRegion {
    public static final Region CN_NORTH_4 = new Region("cn-north-4", "https://iotedge-api.cn-north-4.myhuaweicloud.com");
    
    private static final Map<String, Region> STATIC_FIELDS = createStaticFields();

    private static Map<String, Region> createStaticFields() {
        Map<String, Region> map = new HashMap<>();
        map.put("cn-north-4", CN_NORTH_4);
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
