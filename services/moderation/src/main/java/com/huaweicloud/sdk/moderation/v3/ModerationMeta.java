package com.huaweicloud.sdk.moderation.v3;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.moderation.v3.model.*;

@SuppressWarnings("unchecked")
public class ModerationMeta {

    public static final HttpRequestDef<RunTextModerationRequest, RunTextModerationResponse> runTextModeration =
        genForrunTextModeration();

    private static HttpRequestDef<RunTextModerationRequest, RunTextModerationResponse> genForrunTextModeration() {
        // basic
        HttpRequestDef.Builder<RunTextModerationRequest, RunTextModerationResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RunTextModerationRequest.class, RunTextModerationResponse.class)
                .withName("RunTextModeration")
                .withUri("/v3/{project_id}/moderation/text")
                .withContentType("application/json");

        // requests
        builder.<TextDetectionReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(TextDetectionReq.class),
            f -> f.withMarshaller(RunTextModerationRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

}
