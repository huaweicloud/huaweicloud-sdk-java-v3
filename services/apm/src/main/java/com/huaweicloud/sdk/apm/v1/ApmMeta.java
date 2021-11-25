package com.huaweicloud.sdk.apm.v1;

import com.huaweicloud.sdk.apm.v1.model.*;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;

@SuppressWarnings("unchecked")
public class ApmMeta {

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

}
