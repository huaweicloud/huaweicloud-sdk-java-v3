package com.huaweicloud.sdk.cbh.v1;

import com.huaweicloud.sdk.cbh.v1.model.*;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;

@SuppressWarnings("unchecked")
public class CbhMeta {

    public static final HttpRequestDef<ListCbhInstanceRequest, ListCbhInstanceResponse> listCbhInstance =
        genForlistCbhInstance();

    private static HttpRequestDef<ListCbhInstanceRequest, ListCbhInstanceResponse> genForlistCbhInstance() {
        // basic
        HttpRequestDef.Builder<ListCbhInstanceRequest, ListCbhInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListCbhInstanceRequest.class, ListCbhInstanceResponse.class)
                .withName("ListCbhInstance")
                .withUri("/v1/{project_id}/cbs/instance/list")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

}
