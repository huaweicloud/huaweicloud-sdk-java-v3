package com.huaweicloud.sdk.cae.v1.region;

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

public class CaeRegion {

    public static final Region CN_NORTH_4 =
        new Region("cn-north-4", "https://cae.cn-north-4.myhuaweicloud.com", "https://cae.cn-north-4.myhuaweicloud.cn");

    public static final Region CN_EAST_3 =
        new Region("cn-east-3", "https://cae.cn-east-3.myhuaweicloud.com", "https://cae.cn-east-3.myhuaweicloud.cn");

    public static final Region CN_SOUTH_1 =
        new Region("cn-south-1", "https://cae.cn-south-1.myhuaweicloud.com", "https://cae.cn-south-1.myhuaweicloud.cn");

    public static final Region AP_SOUTHEAST_3 = new Region("ap-southeast-3",
        "https://cae.ap-southeast-3.myhuaweicloud.com", "https://cae.ap-southeast-3.myhuaweicloud.cn");

    public static final Region AF_SOUTH_1 =
        new Region("af-south-1", "https://cae.af-south-1.myhuaweicloud.com", "https://cae.af-south-1.myhuaweicloud.cn");

    private static final IRegionProvider PROVIDER = RegionProviderChain.getDefaultRegionProviderChain("CAE");

    private static final Map<String, Region> STATIC_FIELDS = createStaticFields();

    private static Map<String, Region> createStaticFields() {
        Map<String, Region> map = new HashMap<>();
        map.put("cn-north-4", CN_NORTH_4);
        map.put("cn-east-3", CN_EAST_3);
        map.put("cn-south-1", CN_SOUTH_1);
        map.put("ap-southeast-3", AP_SOUTHEAST_3);
        map.put("af-south-1", AF_SOUTH_1);
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
            "region id '%s' is not in the following supported regions of service CAE: [%s]",
            regionId,
            STATIC_FIELDS.keySet().stream().sorted().collect(Collectors.joining(", "))));
    }
}
