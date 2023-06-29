package com.huaweicloud.sdk.imagesearch.v1.region;

import com.huaweicloud.sdk.core.region.IRegionProvider;
import com.huaweicloud.sdk.core.region.Region;
import com.huaweicloud.sdk.core.region.RegionProviderChain;
import com.huaweicloud.sdk.core.utils.StringUtils;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class ImageSearchRegion {

    public static final Region CN_NORTH_4 = new Region("cn-north-4", "https://imagesearch.cn-north-4.myhuaweicloud.com",
        "https://imagesearch.cn-north-4.myhuaweicloud.cn");

    public static final Region CN_NORTH_1 = new Region("cn-north-1", "https://imagesearch.cn-north-1.myhuaweicloud.com",
        "https://imagesearch.cn-north-1.myhuaweicloud.cn");

    public static final Region AP_SOUTHEAST_1 = new Region("ap-southeast-1",
        "https://imagesearch.ap-southeast-1.myhuaweicloud.com", "https://imagesearch.ap-southeast-1.myhuaweicloud.cn");

    private static final IRegionProvider PROVIDER = RegionProviderChain.getDefaultRegionProviderChain("IMAGESEARCH");

    private static final Map<String, Region> STATIC_FIELDS = createStaticFields();

    private static Map<String, Region> createStaticFields() {
        Map<String, Region> map = new HashMap<>();
        map.put("cn-north-4", CN_NORTH_4);
        map.put("cn-north-1", CN_NORTH_1);
        map.put("ap-southeast-1", AP_SOUTHEAST_1);
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
