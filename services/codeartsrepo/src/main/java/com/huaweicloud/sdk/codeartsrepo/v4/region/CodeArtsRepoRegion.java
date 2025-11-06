package com.huaweicloud.sdk.codeartsrepo.v4.region;

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

public class CodeArtsRepoRegion {

    public static final Region CN_EAST_2 = new Region("cn-east-2", "https://codehub-ext.cn-east-2.myhuaweicloud.com");

    public static final Region CN_SOUTH_1 =
        new Region("cn-south-1", "https://codehub-ext.cn-south-1.myhuaweicloud.com");

    public static final Region CN_EAST_3 = new Region("cn-east-3", "https://codehub-ext.cn-east-3.myhuaweicloud.com");

    public static final Region CN_NORTH_4 =
        new Region("cn-north-4", "https://codehub-ext.cn-north-4.myhuaweicloud.com");

    public static final Region CN_NORTH_1 =
        new Region("cn-north-1", "https://codehub-ext.cn-north-1.myhuaweicloud.com");

    public static final Region CN_SOUTH_2 =
        new Region("cn-south-2", "https://codehub-ext.cn-south-2.myhuaweicloud.com");

    public static final Region CN_SOUTHWEST_2 =
        new Region("cn-southwest-2", "https://codehub-ext.cn-southwest-2.myhuaweicloud.com");

    public static final Region SA_BRAZIL_1 =
        new Region("sa-brazil-1", "https://codehub-ext.sa-brazil-1.myhuaweicloud.com");

    public static final Region LA_NORTH_2 =
        new Region("la-north-2", "https://codehub-ext.la-north-2.myhuaweicloud.com");

    public static final Region AP_SOUTHEAST_3 =
        new Region("ap-southeast-3", "https://codehub-ext.ap-southeast-3.myhuaweicloud.com");

    public static final Region LA_SOUTH_2 =
        new Region("la-south-2", "https://codeartsrepo-ext.la-south-2.myhuaweicloud.com");

    public static final Region ME_EAST_1 = new Region("me-east-1", "https://repo.me-east-1.myhuaweicloud.com");

    public static final Region TR_WEST_1 =
        new Region("tr-west-1", "https://codeartsrepo-ext.tr-west-1.myhuaweicloud.com");

    public static final Region AF_SOUTH_1 = new Region("af-south-1", "https://repo.af-south-1.myhuaweicloud.com");

    public static final Region AF_NORTH_1 = new Region("af-north-1", "https://repo.af-north-1.myhuaweicloud.com");

    private static final IRegionProvider PROVIDER = RegionProviderChain.getDefaultRegionProviderChain("CODEARTSREPO");

    private static final Map<String, Region> STATIC_FIELDS = createStaticFields();

    private static Map<String, Region> createStaticFields() {
        Map<String, Region> map = new HashMap<>();
        map.put("cn-east-2", CN_EAST_2);
        map.put("cn-south-1", CN_SOUTH_1);
        map.put("cn-east-3", CN_EAST_3);
        map.put("cn-north-4", CN_NORTH_4);
        map.put("cn-north-1", CN_NORTH_1);
        map.put("cn-south-2", CN_SOUTH_2);
        map.put("cn-southwest-2", CN_SOUTHWEST_2);
        map.put("sa-brazil-1", SA_BRAZIL_1);
        map.put("la-north-2", LA_NORTH_2);
        map.put("ap-southeast-3", AP_SOUTHEAST_3);
        map.put("la-south-2", LA_SOUTH_2);
        map.put("me-east-1", ME_EAST_1);
        map.put("tr-west-1", TR_WEST_1);
        map.put("af-south-1", AF_SOUTH_1);
        map.put("af-north-1", AF_NORTH_1);
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
            "region id '%s' is not in the following supported regions of service CodeArtsRepo: [%s]",
            regionId,
            STATIC_FIELDS.keySet().stream().sorted().collect(Collectors.joining(", "))));
    }
}
