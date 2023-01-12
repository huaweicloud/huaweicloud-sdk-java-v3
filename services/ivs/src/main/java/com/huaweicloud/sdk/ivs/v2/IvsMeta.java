package com.huaweicloud.sdk.ivs.v2;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.ivs.v2.model.*;

@SuppressWarnings("unchecked")
public class IvsMeta {

    public static final HttpRequestDef<DetectExtentionByIdCardImageRequest, DetectExtentionByIdCardImageResponse> detectExtentionByIdCardImage =
        genFordetectExtentionByIdCardImage();

    private static HttpRequestDef<DetectExtentionByIdCardImageRequest, DetectExtentionByIdCardImageResponse> genFordetectExtentionByIdCardImage() {
        // basic
        HttpRequestDef.Builder<DetectExtentionByIdCardImageRequest, DetectExtentionByIdCardImageResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    DetectExtentionByIdCardImageRequest.class,
                    DetectExtentionByIdCardImageResponse.class)
                .withName("DetectExtentionByIdCardImage")
                .withUri("/v2.0/ivs-idcard-extention")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("Enterprise-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DetectExtentionByIdCardImageRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<IvsExtentionByIdCardImageRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(IvsExtentionByIdCardImageRequestBody.class),
            f -> f.withMarshaller(DetectExtentionByIdCardImageRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DetectExtentionByNameAndIdRequest, DetectExtentionByNameAndIdResponse> detectExtentionByNameAndId =
        genFordetectExtentionByNameAndId();

    private static HttpRequestDef<DetectExtentionByNameAndIdRequest, DetectExtentionByNameAndIdResponse> genFordetectExtentionByNameAndId() {
        // basic
        HttpRequestDef.Builder<DetectExtentionByNameAndIdRequest, DetectExtentionByNameAndIdResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    DetectExtentionByNameAndIdRequest.class,
                    DetectExtentionByNameAndIdResponse.class)
                .withName("DetectExtentionByNameAndId")
                .withUri("/v2.0/ivs-idcard-extention")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("Enterprise-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DetectExtentionByNameAndIdRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<IvsExtentionByNameAndIdRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(IvsExtentionByNameAndIdRequestBody.class),
            f -> f.withMarshaller(DetectExtentionByNameAndIdRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DetectStandardByIdCardImageRequest, DetectStandardByIdCardImageResponse> detectStandardByIdCardImage =
        genFordetectStandardByIdCardImage();

    private static HttpRequestDef<DetectStandardByIdCardImageRequest, DetectStandardByIdCardImageResponse> genFordetectStandardByIdCardImage() {
        // basic
        HttpRequestDef.Builder<DetectStandardByIdCardImageRequest, DetectStandardByIdCardImageResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    DetectStandardByIdCardImageRequest.class,
                    DetectStandardByIdCardImageResponse.class)
                .withName("DetectStandardByIdCardImage")
                .withUri("/v2.0/ivs-standard")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("Enterprise-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DetectStandardByIdCardImageRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<IvsStandardByIdCardImageRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(IvsStandardByIdCardImageRequestBody.class),
            f -> f.withMarshaller(DetectStandardByIdCardImageRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DetectStandardByNameAndIdRequest, DetectStandardByNameAndIdResponse> detectStandardByNameAndId =
        genFordetectStandardByNameAndId();

    private static HttpRequestDef<DetectStandardByNameAndIdRequest, DetectStandardByNameAndIdResponse> genFordetectStandardByNameAndId() {
        // basic
        HttpRequestDef.Builder<DetectStandardByNameAndIdRequest, DetectStandardByNameAndIdResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    DetectStandardByNameAndIdRequest.class,
                    DetectStandardByNameAndIdResponse.class)
                .withName("DetectStandardByNameAndId")
                .withUri("/v2.0/ivs-standard")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("Enterprise-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DetectStandardByNameAndIdRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<IvsStandardByNameAndIdRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(IvsStandardByNameAndIdRequestBody.class),
            f -> f.withMarshaller(DetectStandardByNameAndIdRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

}
