package com.huaweicloud.sdk.lakeformation.v1.region;

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

public class LakeFormationRegion {

    public static final Region CN_NORTH_4 =
        new Region("cn-north-4", "https://lakeformation.cn-north-4.myhuaweicloud.com");

    public static final Region CN_NORTH_9 =
        new Region("cn-north-9", "https://lakeformation.cn-north-9.myhuaweicloud.com");

    public static final Region CN_EAST_3 = new Region("cn-east-3", "https://lakeformation.cn-east-3.myhuaweicloud.com");

    public static final Region CN_SOUTH_1 =
        new Region("cn-south-1", "https://lakeformation.cn-south-1.myhuaweicloud.com");

    public static final Region CN_NORTH_11 =
        new Region("cn-north-11", "https://lakeformation.cn-north-11.myhuaweicloud.com");

    public static final Region LA_NORTH_2 =
        new Region("la-north-2", "https://lakeformation.la-north-2.myhuaweicloud.com");

    private static final IRegionProvider PROVIDER = RegionProviderChain.getDefaultRegionProviderChain("LAKEFORMATION");

    private static final Map<String, Region> STATIC_FIELDS = createStaticFields();

    private static Map<String, Region> createStaticFields() {
        Map<String, Region> map = new HashMap<>();
        map.put("cn-north-4", CN_NORTH_4);
        map.put("cn-north-9", CN_NORTH_9);
        map.put("cn-east-3", CN_EAST_3);
        map.put("cn-south-1", CN_SOUTH_1);
        map.put("cn-north-11", CN_NORTH_11);
        map.put("la-north-2", LA_NORTH_2);
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
            "region id '%s' is not in the following supported regions of service LakeFormation: [%s]",
            regionId,
            STATIC_FIELDS.keySet().stream().sorted().collect(Collectors.joining(", "))));
    }
}
