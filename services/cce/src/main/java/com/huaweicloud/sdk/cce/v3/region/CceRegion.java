package com.huaweicloud.sdk.cce.v3.region;

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

public class CceRegion {

    public static final Region CN_NORTH_1 = new Region("cn-north-1", "https://cce.cn-north-1.myhuaweicloud.com");

    public static final Region CN_NORTH_2 = new Region("cn-north-2", "https://cce.cn-north-2.myhuaweicloud.com");

    public static final Region CN_NORTH_4 = new Region("cn-north-4", "https://cce.cn-north-4.myhuaweicloud.com");

    public static final Region CN_NORTH_9 = new Region("cn-north-9", "https://cce.cn-north-9.myhuaweicloud.com");

    public static final Region CN_SOUTH_1 = new Region("cn-south-1", "https://cce.cn-south-1.myhuaweicloud.com");

    public static final Region CN_SOUTH_2 = new Region("cn-south-2", "https://cce.cn-south-2.myhuaweicloud.com");

    public static final Region CN_SOUTH_4 = new Region("cn-south-4", "https://cce.cn-south-4.myhuaweicloud.com");

    public static final Region CN_EAST_2 = new Region("cn-east-2", "https://cce.cn-east-2.myhuaweicloud.com");

    public static final Region CN_EAST_3 = new Region("cn-east-3", "https://cce.cn-east-3.myhuaweicloud.com");

    public static final Region CN_SOUTHWEST_2 =
        new Region("cn-southwest-2", "https://cce.cn-southwest-2.myhuaweicloud.com");

    public static final Region AP_SOUTHEAST_1 =
        new Region("ap-southeast-1", "https://cce.ap-southeast-1.myhuaweicloud.com");

    public static final Region AP_SOUTHEAST_2 =
        new Region("ap-southeast-2", "https://cce.ap-southeast-2.myhuaweicloud.com");

    public static final Region AP_SOUTHEAST_3 =
        new Region("ap-southeast-3", "https://cce.ap-southeast-3.myhuaweicloud.com");

    public static final Region AF_SOUTH_1 = new Region("af-south-1", "https://cce.af-south-1.myhuaweicloud.com");

    public static final Region SA_BRAZIL_1 = new Region("sa-brazil-1", "https://cce.sa-brazil-1.myhuaweicloud.com");

    public static final Region LA_SOUTH_2 = new Region("la-south-2", "https://cce.la-south-2.myhuaweicloud.com");

    public static final Region LA_NORTH_2 = new Region("la-north-2", "https://cce.la-north-2.myhuaweicloud.com");

    public static final Region NA_MEXICO_1 = new Region("na-mexico-1", "https://cce.na-mexico-1.myhuaweicloud.com");

    public static final Region RU_NORTHWEST_2 =
        new Region("ru-northwest-2", "https://cce.ru-northwest-2.myhuaweicloud.com");

    public static final Region AP_SOUTHEAST_4 =
        new Region("ap-southeast-4", "https://cce.ap-southeast-4.myhuaweicloud.com");

    public static final Region TR_WEST_1 = new Region("tr-west-1", "https://cce.tr-west-1.myhuaweicloud.com");

    public static final Region AE_AD_1 = new Region("ae-ad-1", "https://cce.ae-ad-1.myhuaweicloud.com");

    public static final Region EU_WEST_101 = new Region("eu-west-101", "https://cce.eu-west-101.myhuaweicloud.eu");

    public static final Region CN_NORTH_11 = new Region("cn-north-11", "https://cce.cn-north-11.myhuaweicloud.com");

    public static final Region MY_KUALALUMPUR_1 =
        new Region("my-kualalumpur-1", "https://cce.my-kualalumpur-1.myhuaweicloud.com");

    public static final Region EU_WEST_0 = new Region("eu-west-0", "https://cce.eu-west-0.myhuaweicloud.com");

    public static final Region RU_MOSCOW_1 = new Region("ru-moscow-1", "https://cce.ru-moscow-1.myhuaweicloud.com");

    public static final Region ME_EAST_1 = new Region("me-east-1", "https://cce.me-east-1.myhuaweicloud.com");

    private static final IRegionProvider PROVIDER = RegionProviderChain.getDefaultRegionProviderChain("CCE");

    private static final Map<String, Region> STATIC_FIELDS = createStaticFields();

    private static Map<String, Region> createStaticFields() {
        Map<String, Region> map = new HashMap<>();
        map.put("cn-north-1", CN_NORTH_1);
        map.put("cn-north-2", CN_NORTH_2);
        map.put("cn-north-4", CN_NORTH_4);
        map.put("cn-north-9", CN_NORTH_9);
        map.put("cn-south-1", CN_SOUTH_1);
        map.put("cn-south-2", CN_SOUTH_2);
        map.put("cn-south-4", CN_SOUTH_4);
        map.put("cn-east-2", CN_EAST_2);
        map.put("cn-east-3", CN_EAST_3);
        map.put("cn-southwest-2", CN_SOUTHWEST_2);
        map.put("ap-southeast-1", AP_SOUTHEAST_1);
        map.put("ap-southeast-2", AP_SOUTHEAST_2);
        map.put("ap-southeast-3", AP_SOUTHEAST_3);
        map.put("af-south-1", AF_SOUTH_1);
        map.put("sa-brazil-1", SA_BRAZIL_1);
        map.put("la-south-2", LA_SOUTH_2);
        map.put("la-north-2", LA_NORTH_2);
        map.put("na-mexico-1", NA_MEXICO_1);
        map.put("ru-northwest-2", RU_NORTHWEST_2);
        map.put("ap-southeast-4", AP_SOUTHEAST_4);
        map.put("tr-west-1", TR_WEST_1);
        map.put("ae-ad-1", AE_AD_1);
        map.put("eu-west-101", EU_WEST_101);
        map.put("cn-north-11", CN_NORTH_11);
        map.put("my-kualalumpur-1", MY_KUALALUMPUR_1);
        map.put("eu-west-0", EU_WEST_0);
        map.put("ru-moscow-1", RU_MOSCOW_1);
        map.put("me-east-1", ME_EAST_1);
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
            "region id '%s' is not in the following supported regions of service CCE: [%s]",
            regionId,
            STATIC_FIELDS.keySet().stream().sorted().collect(Collectors.joining(", "))));
    }
}
