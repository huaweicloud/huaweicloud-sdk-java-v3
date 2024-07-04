package com.huaweicloud.sdk.vias.v2.region;

import com.huaweicloud.sdk.core.region.IRegionProvider;
import com.huaweicloud.sdk.core.region.Region;
import com.huaweicloud.sdk.core.region.RegionProviderChain;
import com.huaweicloud.sdk.core.utils.StringUtils;

import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class ViasRegion {

    public static final Region CN_NORTH_4 = new Region("cn-north-4", "https://vias.cn-north-4.myhuaweicloud.com");

    public static final Region CN_EAST_3 = new Region("cn-east-3", "https://vias.cn-east-3.myhuaweicloud.com");

    public static final Region CN_SOUTH_1 = new Region("cn-south-1", "https://vias.cn-south-1.myhuaweicloud.com");

    public static final Region AP_SOUTHEAST_1 =
        new Region("ap-southeast-1", "https://vias.ap-southeast-1.myhuaweicloud.com");

    public static final Region AP_SOUTHEAST_3 =
        new Region("ap-southeast-3", "https://vias.ap-southeast-3.myhuaweicloud.com");

    public static final Region AP_SOUTHEAST_4 =
        new Region("ap-southeast-4", "https://vias.ap-southeast-4.myhuaweicloud.com");

    private static final IRegionProvider PROVIDER = RegionProviderChain.getDefaultRegionProviderChain("VIAS");

    private static final Map<String, Region> STATIC_FIELDS = createStaticFields();

    private static Map<String, Region> createStaticFields() {
        Map<String, Region> map = new HashMap<>();
        map.put("cn-north-4", CN_NORTH_4);
        map.put("cn-east-3", CN_EAST_3);
        map.put("cn-south-1", CN_SOUTH_1);
        map.put("ap-southeast-1", AP_SOUTHEAST_1);
        map.put("ap-southeast-3", AP_SOUTHEAST_3);
        map.put("ap-southeast-4", AP_SOUTHEAST_4);
        return Collections.unmodifiableMap(map);
    }

    public static Region valueOf(String regionId) {
        if (StringUtils.isEmpty(regionId)) {
            throw new IllegalArgumentException("Unexpected empty parameter: regionId.");
        }

        Region result = PROVIDER.getRegion(regionId);
        if (Objects.nonNull(result)) {
            return result;
        }

        result = STATIC_FIELDS.get(regionId);
        if (Objects.nonNull(result)) {
            return result;
        }

        throw new IllegalArgumentException(String.format(Locale.ROOT,
            "region id '%s' is not in the following supported regions of service VIAS: [%s]",
            regionId,
            STATIC_FIELDS.keySet().stream().sorted().collect(Collectors.joining(", "))));
    }
}
