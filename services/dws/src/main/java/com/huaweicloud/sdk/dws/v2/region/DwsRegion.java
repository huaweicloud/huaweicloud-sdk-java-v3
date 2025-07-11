package com.huaweicloud.sdk.dws.v2.region;

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

public class DwsRegion {

    public static final Region EU_WEST_101 = new Region("eu-west-101", "https://dws.eu-west-101.myhuaweicloud.eu");

    public static final Region CN_NORTH_9 = new Region("cn-north-9", "https://dws.cn-north-9.myhuaweicloud.com");

    public static final Region CN_EAST_3 = new Region("cn-east-3", "https://dws.cn-east-3.myhuaweicloud.com");

    public static final Region CN_EAST_2 = new Region("cn-east-2", "https://dws.cn-east-2.myhuaweicloud.com");

    public static final Region CN_NORTH_1 = new Region("cn-north-1", "https://dws.cn-north-1.myhuaweicloud.com");

    public static final Region CN_NORTH_4 = new Region("cn-north-4", "https://dws.cn-north-4.myhuaweicloud.com");

    public static final Region CN_SOUTHWEST_2 =
        new Region("cn-southwest-2", "https://dws.cn-southwest-2.myhuaweicloud.com");

    public static final Region CN_NORTH_2 = new Region("cn-north-2", "https://dws.cn-north-2.myhuaweicloud.com");

    public static final Region CN_SOUTH_1 = new Region("cn-south-1", "https://dws.cn-south-1.myhuaweicloud.com");

    public static final Region CN_SOUTH_4 = new Region("cn-south-4", "https://dws.cn-south-4.myhuaweicloud.cn");

    public static final Region CN_NORTH_12 = new Region("cn-north-12", "https://dws.cn-north-12.myhuaweicloud.cn");

    public static final Region CN_EAST_4 = new Region("cn-east-4", "https://dws.cn-east-4.myhuaweicloud.cn");

    public static final Region AP_SOUTHEAST_1 =
        new Region("ap-southeast-1", "https://dws.ap-southeast-1.myhuaweicloud.com");

    public static final Region AP_SOUTHEAST_2 =
        new Region("ap-southeast-2", "https://dws.ap-southeast-2.myhuaweicloud.com");

    public static final Region AP_SOUTHEAST_3 =
        new Region("ap-southeast-3", "https://dws.ap-southeast-3.myhuaweicloud.com");

    public static final Region AF_SOUTH_1 = new Region("af-south-1", "https://dws.af-south-1.myhuaweicloud.com");

    public static final Region LA_SOUTH_2 = new Region("la-south-2", "https://dws.la-south-2.myhuaweicloud.com");

    public static final Region SA_BRAZIL_1 = new Region("sa-brazil-1", "https://dws.sa-brazil-1.myhuaweicloud.com");

    public static final Region NA_MEXICO_1 = new Region("na-mexico-1", "https://dws.na-mexico-1.myhuaweicloud.com");

    public static final Region LA_NORTH_2 = new Region("la-north-2", "https://dws.la-north-2.myhuaweicloud.com");

    public static final Region TR_WEST_1 = new Region("tr-west-1", "https://dws.tr-west-1.myhuaweicloud.cn");

    public static final Region AP_SOUTHEAST_4 =
        new Region("ap-southeast-4", "https://dws.ap-southeast-4.myhuaweicloud.cn");

    public static final Region CN_EAST_5 = new Region("cn-east-5", "https://dws.cn-east-5.myhuaweicloud.com");

    public static final Region AF_NORTH_1 = new Region("af-north-1", "https://dws.af-north-1.myhuaweicloud.com");

    public static final Region RU_MOSCOW_1 = new Region("ru-moscow-1", "https://dws.ru-moscow-1.myhuaweicloud.com");

    public static final Region AE_AD_1 = new Region("ae-ad-1", "https://dws.ae-ad-1.myhuaweicloud.com");

    public static final Region MY_KUALALUMPUR_1 =
        new Region("my-kualalumpur-1", "https://dws.my-kualalumpur-1.myhuaweicloud.com");

    private static final IRegionProvider PROVIDER = RegionProviderChain.getDefaultRegionProviderChain("DWS");

    private static final Map<String, Region> STATIC_FIELDS = createStaticFields();

    private static Map<String, Region> createStaticFields() {
        Map<String, Region> map = new HashMap<>();
        map.put("eu-west-101", EU_WEST_101);
        map.put("cn-north-9", CN_NORTH_9);
        map.put("cn-east-3", CN_EAST_3);
        map.put("cn-east-2", CN_EAST_2);
        map.put("cn-north-1", CN_NORTH_1);
        map.put("cn-north-4", CN_NORTH_4);
        map.put("cn-southwest-2", CN_SOUTHWEST_2);
        map.put("cn-north-2", CN_NORTH_2);
        map.put("cn-south-1", CN_SOUTH_1);
        map.put("cn-south-4", CN_SOUTH_4);
        map.put("cn-north-12", CN_NORTH_12);
        map.put("cn-east-4", CN_EAST_4);
        map.put("ap-southeast-1", AP_SOUTHEAST_1);
        map.put("ap-southeast-2", AP_SOUTHEAST_2);
        map.put("ap-southeast-3", AP_SOUTHEAST_3);
        map.put("af-south-1", AF_SOUTH_1);
        map.put("la-south-2", LA_SOUTH_2);
        map.put("sa-brazil-1", SA_BRAZIL_1);
        map.put("na-mexico-1", NA_MEXICO_1);
        map.put("la-north-2", LA_NORTH_2);
        map.put("tr-west-1", TR_WEST_1);
        map.put("ap-southeast-4", AP_SOUTHEAST_4);
        map.put("cn-east-5", CN_EAST_5);
        map.put("af-north-1", AF_NORTH_1);
        map.put("ru-moscow-1", RU_MOSCOW_1);
        map.put("ae-ad-1", AE_AD_1);
        map.put("my-kualalumpur-1", MY_KUALALUMPUR_1);
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
            "region id '%s' is not in the following supported regions of service DWS: [%s]",
            regionId,
            STATIC_FIELDS.keySet().stream().sorted().collect(Collectors.joining(", "))));
    }
}
