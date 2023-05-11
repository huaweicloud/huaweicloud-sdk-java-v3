package com.huaweicloud.sdk.eihealth.v2;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.eihealth.v2.model.*;

@SuppressWarnings("unchecked")
public class EiHealthMeta {

    public static final HttpRequestDef<ShowAdmetWithCustomPropsRequest, ShowAdmetWithCustomPropsResponse> showAdmetWithCustomProps =
        genForshowAdmetWithCustomProps();

    private static HttpRequestDef<ShowAdmetWithCustomPropsRequest, ShowAdmetWithCustomPropsResponse> genForshowAdmetWithCustomProps() {
        // basic
        HttpRequestDef.Builder<ShowAdmetWithCustomPropsRequest, ShowAdmetWithCustomPropsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, ShowAdmetWithCustomPropsRequest.class, ShowAdmetWithCustomPropsResponse.class)
                .withName("ShowAdmetWithCustomProps")
                .withUri("/v2/{project_id}/admet")
                .withContentType("application/json");

        // requests
        builder.<AdmetWithCustomRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AdmetWithCustomRequest.class),
            f -> f.withMarshaller(ShowAdmetWithCustomPropsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

}
