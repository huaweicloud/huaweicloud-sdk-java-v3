package com.huaweicloud.sdk.ocr.v1.region;

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

public class OcrRegion {

    public static final Region CN_NORTH_4 =
        new Region("cn-north-4", "https://ocr.cn-north-4.myhuaweicloud.com", "https://ocr.cn-north-4.myhuaweicloud.cn");

    public static final Region CN_SOUTH_1 =
        new Region("cn-south-1", "https://ocr.cn-south-1.myhuaweicloud.com", "https://ocr.cn-south-1.myhuaweicloud.cn");

    public static final Region CN_EAST_3 =
        new Region("cn-east-3", "https://ocr.cn-east-3.myhuaweicloud.com", "https://ocr.cn-east-3.myhuaweicloud.cn");

    public static final Region CN_NORTH_1 =
        new Region("cn-north-1", "https://ocr.cn-north-1.myhuaweicloud.com", "https://ocr.cn-north-1.myhuaweicloud.cn");

    public static final Region AP_SOUTHEAST_2 = new Region("ap-southeast-2",
        "https://ocr.ap-southeast-2.myhuaweicloud.com", "https://ocr.ap-southeast-2.myhuaweicloud.cn");

    public static final Region CN_SOUTHWEST_2 = new Region("cn-southwest-2",
        "https://ocr.cn-southwest-2.myhuaweicloud.com", "https://ocr.cn-southwest-2.myhuaweicloud.cn");

    public static final Region AP_SOUTHEAST_1 = new Region("ap-southeast-1",
        "https://ocr.ap-southeast-1.myhuaweicloud.com", "https://ocr.ap-southeast-1.myhuaweicloud.cn");

    public static final Region AP_SOUTHEAST_3 = new Region("ap-southeast-3",
        "https://ocr.ap-southeast-3.myhuaweicloud.com", "https://ocr.ap-southeast-3.myhuaweicloud.cn");

    public static final Region LA_SOUTH_2 =
        new Region("la-south-2", "https://ocr.la-south-2.myhuaweicloud.com", "https://ocr.la-south-2.myhuaweicloud.cn");

    public static final Region AF_SOUTH_1 =
        new Region("af-south-1", "https://ocr.af-south-1.myhuaweicloud.com", "https://ocr.af-south-1.myhuaweicloud.cn");

    public static final Region LA_NORTH_2 = new Region("la-north-2", "https://ocr.la-north-2.myhuaweicloud.com");

    private static final IRegionProvider PROVIDER = RegionProviderChain.getDefaultRegionProviderChain("OCR");

    private static final Map<String, Region> STATIC_FIELDS = createStaticFields();

    private static Map<String, Region> createStaticFields() {
        Map<String, Region> map = new HashMap<>();
        map.put("cn-north-4", CN_NORTH_4);
        map.put("cn-south-1", CN_SOUTH_1);
        map.put("cn-east-3", CN_EAST_3);
        map.put("cn-north-1", CN_NORTH_1);
        map.put("ap-southeast-2", AP_SOUTHEAST_2);
        map.put("cn-southwest-2", CN_SOUTHWEST_2);
        map.put("ap-southeast-1", AP_SOUTHEAST_1);
        map.put("ap-southeast-3", AP_SOUTHEAST_3);
        map.put("la-south-2", LA_SOUTH_2);
        map.put("af-south-1", AF_SOUTH_1);
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
            "region id '%s' is not in the following supported regions of service OCR: [%s]",
            regionId,
            STATIC_FIELDS.keySet().stream().sorted().collect(Collectors.joining(", "))));
    }
}
