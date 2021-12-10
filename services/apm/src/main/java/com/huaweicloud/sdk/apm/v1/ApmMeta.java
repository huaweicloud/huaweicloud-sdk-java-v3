package com.huaweicloud.sdk.apm.v1;

import com.huaweicloud.sdk.apm.v1.model.*;
import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;

@SuppressWarnings("unchecked")
public class ApmMeta {

    public static final HttpRequestDef<ListAkSkRequest, ListAkSkResponse> listAkSk = genForlistAkSk();

    private static HttpRequestDef<ListAkSkRequest, ListAkSkResponse> genForlistAkSk() {
        // basic
        HttpRequestDef.Builder<ListAkSkRequest, ListAkSkResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAkSkRequest.class, ListAkSkResponse.class)
                .withName("ListAkSk")
                .withUri("/v1/apm2/openapi/systemmng/get-ak-sk-list")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListBusinessRequest, ListBusinessResponse> listBusiness = genForlistBusiness();

    private static HttpRequestDef<ListBusinessRequest, ListBusinessResponse> genForlistBusiness() {
        // basic
        HttpRequestDef.Builder<ListBusinessRequest, ListBusinessResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListBusinessRequest.class, ListBusinessResponse.class)
                .withName("ListBusiness")
                .withUri("/v1/apm2/openapi/cmdb/business/get-business-list")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowMasterAddressRequest, ShowMasterAddressResponse> showMasterAddress =
        genForshowMasterAddress();

    private static HttpRequestDef<ShowMasterAddressRequest, ShowMasterAddressResponse> genForshowMasterAddress() {
        // basic
        HttpRequestDef.Builder<ShowMasterAddressRequest, ShowMasterAddressResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowMasterAddressRequest.class, ShowMasterAddressResponse.class)
                .withName("ShowMasterAddress")
                .withUri("/v1/apm2/openapi/systemmng/get-master-address")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("region_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMasterAddressRequest::getRegionName, (req, v) -> {
                req.setRegionName(v);
            }));

        // response

        return builder.build();
    }

}
