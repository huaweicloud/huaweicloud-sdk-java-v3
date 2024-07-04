package com.huaweicloud.sdk.bcs.v2.region;

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

public class BcsRegion {

    public static final Region CN_NORTH_1 =
        new Region("cn-north-1", "https://bcs.cn-north-1.myhuaweicloud.com", "https://bcs.cn-north-1.myhuaweicloud.cn");

    public static final Region CN_NORTH_4 =
        new Region("cn-north-4", "https://bcs.cn-north-4.myhuaweicloud.com", "https://bcs.cn-north-4.myhuaweicloud.cn");

    public static final Region CN_SOUTH_1 =
        new Region("cn-south-1", "https://bcs.cn-south-1.myhuaweicloud.com", "https://bcs.cn-south-1.myhuaweicloud.cn");

    public static final Region CN_EAST_2 =
        new Region("cn-east-2", "https://bcs.cn-east-2.myhuaweicloud.com", "https://bcs.cn-east-2.myhuaweicloud.cn");

    private static final IRegionProvider PROVIDER = RegionProviderChain.getDefaultRegionProviderChain("BCS");

    private static final Map<String, Region> STATIC_FIELDS = createStaticFields();

    private static Map<String, Region> createStaticFields() {
        Map<String, Region> map = new HashMap<>();
        map.put("cn-north-1", CN_NORTH_1);
        map.put("cn-north-4", CN_NORTH_4);
        map.put("cn-south-1", CN_SOUTH_1);
        map.put("cn-east-2", CN_EAST_2);
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
            "region id '%s' is not in the following supported regions of service BCS: [%s]",
            regionId,
            STATIC_FIELDS.keySet().stream().sorted().collect(Collectors.joining(", "))));
    }
}
