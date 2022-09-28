package com.huaweicloud.sdk.gaussdbforopengauss.v3.region;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.huaweicloud.sdk.core.region.IRegionProvider;
import com.huaweicloud.sdk.core.region.Region;
import com.huaweicloud.sdk.core.region.RegionProviderChain;
import com.huaweicloud.sdk.core.utils.StringUtils;

public class GaussDBforopenGaussRegion {
    public static final Region CN_NORTH_4 = new Region("cn-north-4", "https://gaussdb-opengauss.cn-north-4.myhuaweicloud.com");
    public static final Region CN_SOUTHWEST_2 = new Region("cn-southwest-2", "https://gaussdb-opengauss.cn-southwest-2.myhuaweicloud.com");
    public static final Region CN_SOUTH_1 = new Region("cn-south-1", "https://gaussdb-opengauss.cn-south-1.myhuaweicloud.com");
    public static final Region RU_NORTHWEST_2 = new Region("ru-northwest-2", "https://gaussdb-opengauss.ru-northwest-2.myhuaweicloud.com");
    public static final Region AP_SOUTHEAST_3 = new Region("ap-southeast-3", "https://gaussdb-opengauss.ap-southeast-3.myhuaweicloud.com");
    public static final Region CN_NORTH_2 = new Region("cn-north-2", "https://gaussdb-opengauss.cn-north-2.myhuaweicloud.com");
    public static final Region AP_SOUTHEAST_2 = new Region("ap-southeast-2", "https://gaussdb-opengauss.ap-southeast-2.myhuaweicloud.com");
    public static final Region AP_SOUTHEAST_1 = new Region("ap-southeast-1", "https://gaussdb-opengauss.ap-southeast-1.myhuaweicloud.com");
    public static final Region CN_EAST_3 = new Region("cn-east-3", "https://gaussdb-opengauss.cn-east-3.myhuaweicloud.com");
    public static final Region SA_BRAZIL_1 = new Region("sa-brazil-1", "https://gaussdb-opengauss.sa-brazil-1.myhuaweicloud.com");
    public static final Region LA_SOUTH_2 = new Region("la-south-2", "https://gaussdb-opengauss.la-south-2.myhuaweicloud.com");
    public static final Region LA_NORTH_2 = new Region("la-north-2", "https://gaussdb-opengauss.la-north-2.myhuaweicloud.com");
    public static final Region AF_SOUTH_1 = new Region("af-south-1", "https://gaussdb-opengauss.af-south-1.myhuaweicloud.com");
    
    private static final IRegionProvider PROVIDER = RegionProviderChain.getDefaultRegionProviderChain("GAUSSDBFOROPENGAUSS");

    private static final Map<String, Region> STATIC_FIELDS = createStaticFields();

    private static Map<String, Region> createStaticFields() {
        Map<String, Region> map = new HashMap<>();
        map.put("cn-north-4", CN_NORTH_4);
        map.put("cn-southwest-2", CN_SOUTHWEST_2);
        map.put("cn-south-1", CN_SOUTH_1);
        map.put("ru-northwest-2", RU_NORTHWEST_2);
        map.put("ap-southeast-3", AP_SOUTHEAST_3);
        map.put("cn-north-2", CN_NORTH_2);
        map.put("ap-southeast-2", AP_SOUTHEAST_2);
        map.put("ap-southeast-1", AP_SOUTHEAST_1);
        map.put("cn-east-3", CN_EAST_3);
        map.put("sa-brazil-1", SA_BRAZIL_1);
        map.put("la-south-2", LA_SOUTH_2);
        map.put("la-north-2", LA_NORTH_2);
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
        throw new IllegalArgumentException("Unexpected regionId: " + regionId);
    }
}
