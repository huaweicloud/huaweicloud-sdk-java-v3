package com.huaweicloud.sdk.lts.v2.region;

import com.huaweicloud.sdk.core.region.IRegionProvider;
import com.huaweicloud.sdk.core.region.Region;
import com.huaweicloud.sdk.core.region.RegionProviderChain;
import com.huaweicloud.sdk.core.utils.StringUtils;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class LtsRegion {

    public static final Region CN_EAST_2 = new Region("cn-east-2", "https://lts.cn-east-2.myhuaweicloud.com");

    public static final Region CN_EAST_3 = new Region("cn-east-3", "https://lts.cn-east-3.myhuaweicloud.com");

    public static final Region CN_NORTH_1 = new Region("cn-north-1", "https://lts.cn-north-1.myhuaweicloud.com");

    public static final Region CN_NORTH_2 = new Region("cn-north-2", "https://lts.cn-north-2.myhuaweicloud.com");

    public static final Region CN_NORTH_4 = new Region("cn-north-4", "https://lts.cn-north-4.myhuaweicloud.com");

    public static final Region CN_SOUTH_1 = new Region("cn-south-1", "https://lts.cn-south-1.myhuaweicloud.com");

    public static final Region CN_SOUTHWEST_2 =
        new Region("cn-southwest-2", "https://lts.cn-southwest-2.myhuaweicloud.com");

    public static final Region AF_SOUTH_1 = new Region("af-south-1", "https://lts.af-south-1.myhuaweicloud.com");

    public static final Region AP_SOUTHEAST_1 =
        new Region("ap-southeast-1", "https://lts.ap-southeast-1.myhuaweicloud.com");

    public static final Region AP_SOUTHEAST_2 =
        new Region("ap-southeast-2", "https://lts.ap-southeast-2.myhuaweicloud.com");

    public static final Region AP_SOUTHEAST_3 =
        new Region("ap-southeast-3", "https://lts.ap-southeast-3.myhuaweicloud.com");

    public static final Region LA_SOUTH_2 = new Region("la-south-2", "https://lts.la-south-2.myhuaweicloud.com");

    public static final Region SA_BRAZIL_1 = new Region("sa-brazil-1", "https://lts.sa-brazil-1.myhuaweicloud.com");

    public static final Region LA_NORTH_2 = new Region("la-north-2", "https://lts.la-north-2.myhuaweicloud.com");

    public static final Region CN_NORTH_9 = new Region("cn-north-9", "https://lts.cn-north-9.myhuaweicloud.com");

    public static final Region CN_SOUTH_2 = new Region("cn-south-2", "https://lts.cn-south-2.myhuaweicloud.com");

    public static final Region NA_MEXICO_1 = new Region("na-mexico-1", "https://lts.na-mexico-1.myhuaweicloud.com");

    public static final Region AP_SOUTHEAST_4 =
        new Region("ap-southeast-4", "https://lts.ap-southeast-4.myhuaweicloud.com");

    public static final Region AE_AD_1 = new Region("ae-ad-1", "https://lts.ae-ad-1.myhuaweicloud.com");

    private static final IRegionProvider PROVIDER = RegionProviderChain.getDefaultRegionProviderChain("LTS");

    private static final Map<String, Region> STATIC_FIELDS = createStaticFields();

    private static Map<String, Region> createStaticFields() {
        Map<String, Region> map = new HashMap<>();
        map.put("cn-east-2", CN_EAST_2);
        map.put("cn-east-3", CN_EAST_3);
        map.put("cn-north-1", CN_NORTH_1);
        map.put("cn-north-2", CN_NORTH_2);
        map.put("cn-north-4", CN_NORTH_4);
        map.put("cn-south-1", CN_SOUTH_1);
        map.put("cn-southwest-2", CN_SOUTHWEST_2);
        map.put("af-south-1", AF_SOUTH_1);
        map.put("ap-southeast-1", AP_SOUTHEAST_1);
        map.put("ap-southeast-2", AP_SOUTHEAST_2);
        map.put("ap-southeast-3", AP_SOUTHEAST_3);
        map.put("la-south-2", LA_SOUTH_2);
        map.put("sa-brazil-1", SA_BRAZIL_1);
        map.put("la-north-2", LA_NORTH_2);
        map.put("cn-north-9", CN_NORTH_9);
        map.put("cn-south-2", CN_SOUTH_2);
        map.put("na-mexico-1", NA_MEXICO_1);
        map.put("ap-southeast-4", AP_SOUTHEAST_4);
        map.put("ae-ad-1", AE_AD_1);
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
        throw new IllegalArgumentException("Unexpected regionId: " + regionId);
    }
}
