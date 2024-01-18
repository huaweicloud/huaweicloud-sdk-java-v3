package com.huaweicloud.sdk.ivs.v2;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.ivs.v2.model.DetectExtentionByIdCardImageRequest;
import com.huaweicloud.sdk.ivs.v2.model.DetectExtentionByIdCardImageResponse;
import com.huaweicloud.sdk.ivs.v2.model.DetectExtentionByNameAndIdRequest;
import com.huaweicloud.sdk.ivs.v2.model.DetectExtentionByNameAndIdResponse;
import com.huaweicloud.sdk.ivs.v2.model.DetectStandardByIdCardImageRequest;
import com.huaweicloud.sdk.ivs.v2.model.DetectStandardByIdCardImageResponse;
import com.huaweicloud.sdk.ivs.v2.model.DetectStandardByNameAndIdRequest;
import com.huaweicloud.sdk.ivs.v2.model.DetectStandardByNameAndIdResponse;
import com.huaweicloud.sdk.ivs.v2.model.DetectStandardByVideoAndIdCardImageRequest;
import com.huaweicloud.sdk.ivs.v2.model.DetectStandardByVideoAndIdCardImageResponse;
import com.huaweicloud.sdk.ivs.v2.model.DetectStandardByVideoAndNameAndIdRequest;
import com.huaweicloud.sdk.ivs.v2.model.DetectStandardByVideoAndNameAndIdResponse;
import com.huaweicloud.sdk.ivs.v2.model.IvsExtentionByIdCardImageRequestBody;
import com.huaweicloud.sdk.ivs.v2.model.IvsExtentionByNameAndIdRequestBody;
import com.huaweicloud.sdk.ivs.v2.model.IvsStandardByIdCardImageRequestBody;
import com.huaweicloud.sdk.ivs.v2.model.IvsStandardByNameAndIdRequestBody;
import com.huaweicloud.sdk.ivs.v2.model.IvsStandardByVideoAndIdCardImageRequestBody;
import com.huaweicloud.sdk.ivs.v2.model.IvsStandardByVideoAndNameAndIdRequestBody;

@SuppressWarnings("unchecked")
public class IvsMeta {

    public static final HttpRequestDef<DetectExtentionByIdCardImageRequest, DetectExtentionByIdCardImageResponse> detectExtentionByIdCardImage =
        genForDetectExtentionByIdCardImage();

    private static HttpRequestDef<DetectExtentionByIdCardImageRequest, DetectExtentionByIdCardImageResponse> genForDetectExtentionByIdCardImage() {
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
            f -> f.withMarshaller(DetectExtentionByIdCardImageRequest::getEnterpriseProjectId,
                DetectExtentionByIdCardImageRequest::setEnterpriseProjectId));
        builder.<IvsExtentionByIdCardImageRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(IvsExtentionByIdCardImageRequestBody.class),
            f -> f.withMarshaller(DetectExtentionByIdCardImageRequest::getBody,
                DetectExtentionByIdCardImageRequest::setBody));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DetectExtentionByIdCardImageResponse::getXRequestId,
                DetectExtentionByIdCardImageResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<DetectExtentionByNameAndIdRequest, DetectExtentionByNameAndIdResponse> detectExtentionByNameAndId =
        genForDetectExtentionByNameAndId();

    private static HttpRequestDef<DetectExtentionByNameAndIdRequest, DetectExtentionByNameAndIdResponse> genForDetectExtentionByNameAndId() {
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
            f -> f.withMarshaller(DetectExtentionByNameAndIdRequest::getEnterpriseProjectId,
                DetectExtentionByNameAndIdRequest::setEnterpriseProjectId));
        builder.<IvsExtentionByNameAndIdRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(IvsExtentionByNameAndIdRequestBody.class),
            f -> f.withMarshaller(DetectExtentionByNameAndIdRequest::getBody,
                DetectExtentionByNameAndIdRequest::setBody));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DetectExtentionByNameAndIdResponse::getXRequestId,
                DetectExtentionByNameAndIdResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<DetectStandardByIdCardImageRequest, DetectStandardByIdCardImageResponse> detectStandardByIdCardImage =
        genForDetectStandardByIdCardImage();

    private static HttpRequestDef<DetectStandardByIdCardImageRequest, DetectStandardByIdCardImageResponse> genForDetectStandardByIdCardImage() {
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
            f -> f.withMarshaller(DetectStandardByIdCardImageRequest::getEnterpriseProjectId,
                DetectStandardByIdCardImageRequest::setEnterpriseProjectId));
        builder.<IvsStandardByIdCardImageRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(IvsStandardByIdCardImageRequestBody.class),
            f -> f.withMarshaller(DetectStandardByIdCardImageRequest::getBody,
                DetectStandardByIdCardImageRequest::setBody));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DetectStandardByIdCardImageResponse::getXRequestId,
                DetectStandardByIdCardImageResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<DetectStandardByNameAndIdRequest, DetectStandardByNameAndIdResponse> detectStandardByNameAndId =
        genForDetectStandardByNameAndId();

    private static HttpRequestDef<DetectStandardByNameAndIdRequest, DetectStandardByNameAndIdResponse> genForDetectStandardByNameAndId() {
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
            f -> f.withMarshaller(DetectStandardByNameAndIdRequest::getEnterpriseProjectId,
                DetectStandardByNameAndIdRequest::setEnterpriseProjectId));
        builder.<IvsStandardByNameAndIdRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(IvsStandardByNameAndIdRequestBody.class),
            f -> f.withMarshaller(DetectStandardByNameAndIdRequest::getBody,
                DetectStandardByNameAndIdRequest::setBody));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DetectStandardByNameAndIdResponse::getXRequestId,
                DetectStandardByNameAndIdResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<DetectStandardByVideoAndIdCardImageRequest, DetectStandardByVideoAndIdCardImageResponse> detectStandardByVideoAndIdCardImage =
        genForDetectStandardByVideoAndIdCardImage();

    private static HttpRequestDef<DetectStandardByVideoAndIdCardImageRequest, DetectStandardByVideoAndIdCardImageResponse> genForDetectStandardByVideoAndIdCardImage() {
        // basic
        HttpRequestDef.Builder<DetectStandardByVideoAndIdCardImageRequest, DetectStandardByVideoAndIdCardImageResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    DetectStandardByVideoAndIdCardImageRequest.class,
                    DetectStandardByVideoAndIdCardImageResponse.class)
                .withName("DetectStandardByVideoAndIdCardImage")
                .withUri("/v2.0/ivs-standard")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("Enterprise-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DetectStandardByVideoAndIdCardImageRequest::getEnterpriseProjectId,
                DetectStandardByVideoAndIdCardImageRequest::setEnterpriseProjectId));
        builder.<IvsStandardByVideoAndIdCardImageRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(IvsStandardByVideoAndIdCardImageRequestBody.class),
            f -> f.withMarshaller(DetectStandardByVideoAndIdCardImageRequest::getBody,
                DetectStandardByVideoAndIdCardImageRequest::setBody));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DetectStandardByVideoAndIdCardImageResponse::getXRequestId,
                DetectStandardByVideoAndIdCardImageResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<DetectStandardByVideoAndNameAndIdRequest, DetectStandardByVideoAndNameAndIdResponse> detectStandardByVideoAndNameAndId =
        genForDetectStandardByVideoAndNameAndId();

    private static HttpRequestDef<DetectStandardByVideoAndNameAndIdRequest, DetectStandardByVideoAndNameAndIdResponse> genForDetectStandardByVideoAndNameAndId() {
        // basic
        HttpRequestDef.Builder<DetectStandardByVideoAndNameAndIdRequest, DetectStandardByVideoAndNameAndIdResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    DetectStandardByVideoAndNameAndIdRequest.class,
                    DetectStandardByVideoAndNameAndIdResponse.class)
                .withName("DetectStandardByVideoAndNameAndId")
                .withUri("/v2.0/ivs-standard")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("Enterprise-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DetectStandardByVideoAndNameAndIdRequest::getEnterpriseProjectId,
                DetectStandardByVideoAndNameAndIdRequest::setEnterpriseProjectId));
        builder.<IvsStandardByVideoAndNameAndIdRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(IvsStandardByVideoAndNameAndIdRequestBody.class),
            f -> f.withMarshaller(DetectStandardByVideoAndNameAndIdRequest::getBody,
                DetectStandardByVideoAndNameAndIdRequest::setBody));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DetectStandardByVideoAndNameAndIdResponse::getXRequestId,
                DetectStandardByVideoAndNameAndIdResponse::setXRequestId));
        return builder.build();
    }

}
