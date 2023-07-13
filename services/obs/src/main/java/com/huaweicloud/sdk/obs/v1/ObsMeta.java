package com.huaweicloud.sdk.obs.v1;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.obs.v1.model.GetBucketNotificationRequest;
import com.huaweicloud.sdk.obs.v1.model.GetBucketNotificationResponse;
import com.huaweicloud.sdk.obs.v1.model.GetObjectRequest;
import com.huaweicloud.sdk.obs.v1.model.GetObjectResponse;
import com.huaweicloud.sdk.obs.v1.model.SetBucketNotificationRequest;
import com.huaweicloud.sdk.obs.v1.model.SetBucketNotificationRequestBody;
import com.huaweicloud.sdk.obs.v1.model.SetBucketNotificationResponse;

@SuppressWarnings("unchecked")
public class ObsMeta {

    public static final HttpRequestDef<GetBucketNotificationRequest, GetBucketNotificationResponse> getBucketNotification =
        genForgetBucketNotification();

    private static HttpRequestDef<GetBucketNotificationRequest, GetBucketNotificationResponse> genForgetBucketNotification() {
        // basic
        HttpRequestDef.Builder<GetBucketNotificationRequest, GetBucketNotificationResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, GetBucketNotificationRequest.class, GetBucketNotificationResponse.class)
            .withName("GetBucketNotification")
            .withUri("/")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("bucket_name",
            LocationType.Cname,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetBucketNotificationRequest::getBucketName, (req, v) -> {
                req.setBucketName(v);
            }));
        builder.<String>withRequestField("notification",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetBucketNotificationRequest::getNotification, (req, v) -> {
                req.setNotification(v);
            }));
        builder.<String>withRequestField("Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetBucketNotificationRequest::getDate, (req, v) -> {
                req.setDate(v);
            }));

        // response

        builder.<String>withResponseField("x-obs-id-2",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(GetBucketNotificationResponse::getXObsId2,
                GetBucketNotificationResponse::setXObsId2));
        builder.<String>withResponseField("x-obs-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(GetBucketNotificationResponse::getXObsRequestId,
                GetBucketNotificationResponse::setXObsRequestId));
        builder.<String>withResponseField("ETag",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(GetBucketNotificationResponse::getEtag, GetBucketNotificationResponse::setEtag));
        builder.<String>withResponseField("Connection",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(GetBucketNotificationResponse::getConnection,
                GetBucketNotificationResponse::setConnection));
        builder.<String>withResponseField("Content-Length",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(GetBucketNotificationResponse::getContentLength,
                GetBucketNotificationResponse::setContentLength));
        builder.<String>withResponseField("Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(GetBucketNotificationResponse::getDate, GetBucketNotificationResponse::setDate));
        return builder.build();
    }

    public static final HttpRequestDef<GetObjectRequest, GetObjectResponse> getObject = genForgetObject();

    private static HttpRequestDef<GetObjectRequest, GetObjectResponse> genForgetObject() {
        // basic
        HttpRequestDef.Builder<GetObjectRequest, GetObjectResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, GetObjectRequest.class, GetObjectResponse.class)
                .withName("GetObject")
                .withUri("/{object_key}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("object_key",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetObjectRequest::getObjectKey, (req, v) -> {
                req.setObjectKey(v);
            }));
        builder.<String>withRequestField("bucket_name",
            LocationType.Cname,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetObjectRequest::getBucketName, (req, v) -> {
                req.setBucketName(v);
            }));
        builder.<String>withRequestField("response-content-type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetObjectRequest::getResponseContentType, (req, v) -> {
                req.setResponseContentType(v);
            }));
        builder.<String>withRequestField("response-content-language",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetObjectRequest::getResponseContentLanguage, (req, v) -> {
                req.setResponseContentLanguage(v);
            }));
        builder.<String>withRequestField("response-expires",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetObjectRequest::getResponseExpires, (req, v) -> {
                req.setResponseExpires(v);
            }));
        builder.<String>withRequestField("response-cache-control",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetObjectRequest::getResponseCacheControl, (req, v) -> {
                req.setResponseCacheControl(v);
            }));
        builder.<String>withRequestField("response-content-disposition",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetObjectRequest::getResponseContentDisposition, (req, v) -> {
                req.setResponseContentDisposition(v);
            }));
        builder.<String>withRequestField("response-content-encoding",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetObjectRequest::getResponseContentEncoding, (req, v) -> {
                req.setResponseContentEncoding(v);
            }));
        builder.<String>withRequestField("versionId",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetObjectRequest::getVersionId, (req, v) -> {
                req.setVersionId(v);
            }));
        builder.<String>withRequestField("x-image-process",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetObjectRequest::getXImageProcess, (req, v) -> {
                req.setXImageProcess(v);
            }));
        builder.<String>withRequestField("attname",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetObjectRequest::getAttname, (req, v) -> {
                req.setAttname(v);
            }));
        builder.<String>withRequestField("Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetObjectRequest::getDate, (req, v) -> {
                req.setDate(v);
            }));
        builder.<String>withRequestField("Range",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetObjectRequest::getRange, (req, v) -> {
                req.setRange(v);
            }));
        builder.<String>withRequestField("If-Modified-Since",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetObjectRequest::getIfModifiedSince, (req, v) -> {
                req.setIfModifiedSince(v);
            }));
        builder.<String>withRequestField("If-Unmodified-Since",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetObjectRequest::getIfUnmodifiedSince, (req, v) -> {
                req.setIfUnmodifiedSince(v);
            }));
        builder.<String>withRequestField("If-Match",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetObjectRequest::getIfMatch, (req, v) -> {
                req.setIfMatch(v);
            }));
        builder.<String>withRequestField("If-None-Match",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetObjectRequest::getIfNoneMatch, (req, v) -> {
                req.setIfNoneMatch(v);
            }));
        builder.<String>withRequestField("x-obs-server-side-encryption-customer-algorithm",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetObjectRequest::getXObsServerSideEncryptionCustomerAlgorithm, (req, v) -> {
                req.setXObsServerSideEncryptionCustomerAlgorithm(v);
            }));
        builder.<String>withRequestField("x-obs-server-side-encryption-customer-key",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetObjectRequest::getXObsServerSideEncryptionCustomerKey, (req, v) -> {
                req.setXObsServerSideEncryptionCustomerKey(v);
            }));
        builder.<String>withRequestField("x-obs-server-side-encryption-customer-key-MD5",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetObjectRequest::getXObsServerSideEncryptionCustomerKeyMD5, (req, v) -> {
                req.setXObsServerSideEncryptionCustomerKeyMD5(v);
            }));

        // response

        builder.<String>withResponseField("x-obs-id-2",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(GetObjectResponse::getXObsId2, GetObjectResponse::setXObsId2));
        builder.<String>withResponseField("x-obs-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(GetObjectResponse::getXObsRequestId, GetObjectResponse::setXObsRequestId));
        builder.<String>withResponseField("x-obs-server-side-encryption",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(GetObjectResponse::getXObsServerSideEncryption,
                GetObjectResponse::setXObsServerSideEncryption));
        builder.<String>withResponseField("x-obs-object-type",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(GetObjectResponse::getXObsObjectType, GetObjectResponse::setXObsObjectType));
        builder.<Integer>withResponseField("x-obs-next-append-position",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(GetObjectResponse::getXObsNextAppendPosition,
                GetObjectResponse::setXObsNextAppendPosition));
        builder.<String>withResponseField("Connection",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(GetObjectResponse::getConnection, GetObjectResponse::setConnection));
        builder.<String>withResponseField("x-obs-server-side-encryption-customer-key-MD5",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(GetObjectResponse::getXObsServerSideEncryptionCustomerKeyMD5,
                GetObjectResponse::setXObsServerSideEncryptionCustomerKeyMD5));
        builder.<String>withResponseField("x-obs-expiration",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(GetObjectResponse::getXObsExpiration, GetObjectResponse::setXObsExpiration));
        builder.<String>withResponseField("Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(GetObjectResponse::getDate, GetObjectResponse::setDate));
        builder.<String>withResponseField("ETag",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(GetObjectResponse::getEtag, GetObjectResponse::setEtag));
        builder.<String>withResponseField("x-obs-server-side-encryption-customer-algorithm",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(GetObjectResponse::getXObsServerSideEncryptionCustomerAlgorithm,
                GetObjectResponse::setXObsServerSideEncryptionCustomerAlgorithm));
        builder.<String>withResponseField("x-obs-server-side-encryption-kms-key-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(GetObjectResponse::getXObsServerSideEncryptionKmsKeyId,
                GetObjectResponse::setXObsServerSideEncryptionKmsKeyId));
        builder.<String>withResponseField("Content-Length",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(GetObjectResponse::getContentLength, GetObjectResponse::setContentLength));
        builder.<String>withResponseField("x-obs-website-redirect-location",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(GetObjectResponse::getXObsWebsiteRedirectLocation,
                GetObjectResponse::setXObsWebsiteRedirectLocation));
        builder.<Boolean>withResponseField("x-obs-delete-marker",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            Boolean.class,
            f -> f.withMarshaller(GetObjectResponse::getXObsDeleteMarker, GetObjectResponse::setXObsDeleteMarker));
        builder.<String>withResponseField("x-obs-version-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(GetObjectResponse::getXObsVersionId, GetObjectResponse::setXObsVersionId));
        return builder.build();
    }

    public static final HttpRequestDef<SetBucketNotificationRequest, SetBucketNotificationResponse> setBucketNotification =
        genForsetBucketNotification();

    private static HttpRequestDef<SetBucketNotificationRequest, SetBucketNotificationResponse> genForsetBucketNotification() {
        // basic
        HttpRequestDef.Builder<SetBucketNotificationRequest, SetBucketNotificationResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, SetBucketNotificationRequest.class, SetBucketNotificationResponse.class)
            .withName("SetBucketNotification")
            .withUri("/")
            .withContentType("application/xml");

        // requests
        builder.<String>withRequestField("bucket_name",
            LocationType.Cname,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SetBucketNotificationRequest::getBucketName, (req, v) -> {
                req.setBucketName(v);
            }));
        builder.<String>withRequestField("notification",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SetBucketNotificationRequest::getNotification, (req, v) -> {
                req.setNotification(v);
            }));
        builder.<String>withRequestField("Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SetBucketNotificationRequest::getDate, (req, v) -> {
                req.setDate(v);
            }));
        builder.<SetBucketNotificationRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SetBucketNotificationRequestBody.class),
            f -> f.withMarshaller(SetBucketNotificationRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        builder.<String>withResponseField("x-obs-id-2",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(SetBucketNotificationResponse::getXObsId2,
                SetBucketNotificationResponse::setXObsId2));
        builder.<String>withResponseField("x-obs-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(SetBucketNotificationResponse::getXObsRequestId,
                SetBucketNotificationResponse::setXObsRequestId));
        builder.<String>withResponseField("ETag",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(SetBucketNotificationResponse::getEtag, SetBucketNotificationResponse::setEtag));
        builder.<String>withResponseField("Connection",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(SetBucketNotificationResponse::getConnection,
                SetBucketNotificationResponse::setConnection));
        builder.<String>withResponseField("Content-Length",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(SetBucketNotificationResponse::getContentLength,
                SetBucketNotificationResponse::setContentLength));
        builder.<String>withResponseField("Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(SetBucketNotificationResponse::getDate, SetBucketNotificationResponse::setDate));
        return builder.build();
    }

}
