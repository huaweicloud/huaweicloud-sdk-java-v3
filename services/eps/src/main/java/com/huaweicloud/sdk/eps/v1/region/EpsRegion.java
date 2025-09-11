package com.huaweicloud.sdk.eps.v1.region;

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

public class EpsRegion {

    public static final Region CN_NORTH_4 =
        new Region("cn-north-4", "https://eps.myhuaweicloud.com", "https://eps.myhuaweicloud.cn");

    public static final Region EU_WEST_101 = new Region("eu-west-101", "https://eps.eu-west-101.myhuaweicloud.eu");

    public static final Region RU_MOSCOW_1 = new Region("ru-moscow-1", "https://eps.ru-moscow-1.myhuaweicloud.com",
        "https://eps.ru-moscow-1.myhuaweicloud.cn");

    public static final Region MY_KUALALUMPUR_1 = new Region("my-kualalumpur-1",
        "https://eps.my-kualalumpur-1.myhuaweicloud.com", "https://eps.my-kualalumpur-1.myhuaweicloud.cn");

    private static final IRegionProvider PROVIDER = RegionProviderChain.getDefaultRegionProviderChain("EPS");

    private static final Map<String, Region> STATIC_FIELDS = createStaticFields();

    private static Map<String, Region> createStaticFields() {
        Map<String, Region> map = new HashMap<>();
        map.put("cn-north-4", CN_NORTH_4);
        map.put("eu-west-101", EU_WEST_101);
        map.put("ru-moscow-1", RU_MOSCOW_1);
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
            "region id '%s' is not in the following supported regions of service EPS: [%s]",
            regionId,
            STATIC_FIELDS.keySet().stream().sorted().collect(Collectors.joining(", "))));
    }
}
