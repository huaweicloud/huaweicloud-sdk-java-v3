package com.huaweicloud.sdk.obs.v1;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.obs.v1.model.CopyObjectRequest;
import com.huaweicloud.sdk.obs.v1.model.CopyObjectResponse;
import com.huaweicloud.sdk.obs.v1.model.CreateBucketRequest;
import com.huaweicloud.sdk.obs.v1.model.CreateBucketRequestBody;
import com.huaweicloud.sdk.obs.v1.model.CreateBucketResponse;
import com.huaweicloud.sdk.obs.v1.model.DeleteBucketCustomdomainRequest;
import com.huaweicloud.sdk.obs.v1.model.DeleteBucketCustomdomainResponse;
import com.huaweicloud.sdk.obs.v1.model.DeleteBucketRequest;
import com.huaweicloud.sdk.obs.v1.model.DeleteBucketResponse;
import com.huaweicloud.sdk.obs.v1.model.DeleteObjectRequest;
import com.huaweicloud.sdk.obs.v1.model.DeleteObjectResponse;
import com.huaweicloud.sdk.obs.v1.model.DeleteObjectsRequest;
import com.huaweicloud.sdk.obs.v1.model.DeleteObjectsRequestBody;
import com.huaweicloud.sdk.obs.v1.model.DeleteObjectsResponse;
import com.huaweicloud.sdk.obs.v1.model.GetBucketAclRequest;
import com.huaweicloud.sdk.obs.v1.model.GetBucketAclResponse;
import com.huaweicloud.sdk.obs.v1.model.GetBucketCustomdomainRequest;
import com.huaweicloud.sdk.obs.v1.model.GetBucketCustomdomainResponse;
import com.huaweicloud.sdk.obs.v1.model.GetBucketMetadataRequest;
import com.huaweicloud.sdk.obs.v1.model.GetBucketMetadataResponse;
import com.huaweicloud.sdk.obs.v1.model.GetBucketNotificationRequest;
import com.huaweicloud.sdk.obs.v1.model.GetBucketNotificationResponse;
import com.huaweicloud.sdk.obs.v1.model.GetObjectMetadataRequest;
import com.huaweicloud.sdk.obs.v1.model.GetObjectMetadataResponse;
import com.huaweicloud.sdk.obs.v1.model.GetObjectRequest;
import com.huaweicloud.sdk.obs.v1.model.GetObjectResponse;
import com.huaweicloud.sdk.obs.v1.model.ListBucketsRequest;
import com.huaweicloud.sdk.obs.v1.model.ListBucketsResponse;
import com.huaweicloud.sdk.obs.v1.model.ListObjectsRequest;
import com.huaweicloud.sdk.obs.v1.model.ListObjectsResponse;
import com.huaweicloud.sdk.obs.v1.model.PutObjectRequest;
import com.huaweicloud.sdk.obs.v1.model.PutObjectResponse;
import com.huaweicloud.sdk.obs.v1.model.SetBucketAclRequest;
import com.huaweicloud.sdk.obs.v1.model.SetBucketAclRequestBody;
import com.huaweicloud.sdk.obs.v1.model.SetBucketAclResponse;
import com.huaweicloud.sdk.obs.v1.model.SetBucketCustomDomainBody;
import com.huaweicloud.sdk.obs.v1.model.SetBucketCustomedomainRequest;
import com.huaweicloud.sdk.obs.v1.model.SetBucketCustomedomainResponse;
import com.huaweicloud.sdk.obs.v1.model.SetBucketNotificationRequest;
import com.huaweicloud.sdk.obs.v1.model.SetBucketNotificationRequestBody;
import com.huaweicloud.sdk.obs.v1.model.SetBucketNotificationResponse;

@SuppressWarnings("unchecked")
public class ObsMeta {

    public static final HttpRequestDef<CopyObjectRequest, CopyObjectResponse> copyObject = genForcopyObject();

    private static HttpRequestDef<CopyObjectRequest, CopyObjectResponse> genForcopyObject() {
        // basic
        HttpRequestDef.Builder<CopyObjectRequest, CopyObjectResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, CopyObjectRequest.class, CopyObjectResponse.class)
                .withName("CopyObject")
                .withUri("/{object_key}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("object_key",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CopyObjectRequest::getObjectKey, (req, v) -> {
                req.setObjectKey(v);
            }));
        builder.<String>withRequestField("bucket_name",
            LocationType.Cname,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CopyObjectRequest::getBucketName, (req, v) -> {
                req.setBucketName(v);
            }));
        builder.<String>withRequestField("Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CopyObjectRequest::getDate, (req, v) -> {
                req.setDate(v);
            }));
        builder.<String>withRequestField("x-obs-acl",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CopyObjectRequest::getXObsAcl, (req, v) -> {
                req.setXObsAcl(v);
            }));
        builder.<String>withRequestField("x-obs-grant-read",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CopyObjectRequest::getXObsGrantRead, (req, v) -> {
                req.setXObsGrantRead(v);
            }));
        builder.<String>withRequestField("x-obs-grant-read-acp",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CopyObjectRequest::getXObsGrantReadAcp, (req, v) -> {
                req.setXObsGrantReadAcp(v);
            }));
        builder.<String>withRequestField("x-obs-grant-write-acp",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CopyObjectRequest::getXObsGrantWriteAcp, (req, v) -> {
                req.setXObsGrantWriteAcp(v);
            }));
        builder.<String>withRequestField("x-obs-grant-full-control",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CopyObjectRequest::getXObsGrantFullControl, (req, v) -> {
                req.setXObsGrantFullControl(v);
            }));
        builder.<String>withRequestField("x-obs-copy-source",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CopyObjectRequest::getXObsCopySource, (req, v) -> {
                req.setXObsCopySource(v);
            }));
        builder.<CopyObjectRequest.XObsMetadataDirectiveEnum>withRequestField("x-obs-metadata-directive",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CopyObjectRequest.XObsMetadataDirectiveEnum.class),
            f -> f.withMarshaller(CopyObjectRequest::getXObsMetadataDirective, (req, v) -> {
                req.setXObsMetadataDirective(v);
            }));
        builder.<String>withRequestField("x-obs-copy-source-if-match",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CopyObjectRequest::getXObsCopySourceIfMatch, (req, v) -> {
                req.setXObsCopySourceIfMatch(v);
            }));
        builder.<String>withRequestField("x-obs-copy-source-if-none-match",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CopyObjectRequest::getXObsCopySourceIfNoneMatch, (req, v) -> {
                req.setXObsCopySourceIfNoneMatch(v);
            }));
        builder.<String>withRequestField("x-obs-copy-source-if-unmodified-since",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CopyObjectRequest::getXObsCopySourceIfUnmodifiedSince, (req, v) -> {
                req.setXObsCopySourceIfUnmodifiedSince(v);
            }));
        builder.<String>withRequestField("x-obs-copy-source-if-modified-since",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CopyObjectRequest::getXObsCopySourceIfModifiedSince, (req, v) -> {
                req.setXObsCopySourceIfModifiedSince(v);
            }));
        builder.<String>withRequestField("x-obs-storage-class",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CopyObjectRequest::getXObsStorageClass, (req, v) -> {
                req.setXObsStorageClass(v);
            }));
        builder.<String>withRequestField("x-obs-persistent-headers",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CopyObjectRequest::getXObsPersistentHeaders, (req, v) -> {
                req.setXObsPersistentHeaders(v);
            }));
        builder.<String>withRequestField("x-obs-website-redirect-location",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CopyObjectRequest::getXObsWebsiteRedirectLocation, (req, v) -> {
                req.setXObsWebsiteRedirectLocation(v);
            }));
        builder.<String>withRequestField("x-obs-server-side-encryption",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CopyObjectRequest::getXObsServerSideEncryption, (req, v) -> {
                req.setXObsServerSideEncryption(v);
            }));
        builder.<String>withRequestField("x-obs-server-side-encryption-kms-key-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CopyObjectRequest::getXObsServerSideEncryptionKmsKeyId, (req, v) -> {
                req.setXObsServerSideEncryptionKmsKeyId(v);
            }));
        builder.<String>withRequestField("x-obs-server-side-encryption-customer-algorithm",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CopyObjectRequest::getXObsServerSideEncryptionCustomerAlgorithm, (req, v) -> {
                req.setXObsServerSideEncryptionCustomerAlgorithm(v);
            }));
        builder.<String>withRequestField("x-obs-server-side-encryption-customer-key",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CopyObjectRequest::getXObsServerSideEncryptionCustomerKey, (req, v) -> {
                req.setXObsServerSideEncryptionCustomerKey(v);
            }));
        builder.<String>withRequestField("x-obs-server-side-encryption-customer-key-MD5",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CopyObjectRequest::getXObsServerSideEncryptionCustomerKeyMD5, (req, v) -> {
                req.setXObsServerSideEncryptionCustomerKeyMD5(v);
            }));
        builder.<String>withRequestField("x-obs-copy-source-server-side-encryption-customer-algorithm",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CopyObjectRequest::getXObsCopySourceServerSideEncryptionCustomerAlgorithm,
                (req, v) -> {
                    req.setXObsCopySourceServerSideEncryptionCustomerAlgorithm(v);
                }));
        builder.<String>withRequestField("x-obs-copy-source-server-side-encryption-customer-key",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CopyObjectRequest::getXObsCopySourceServerSideEncryptionCustomerKey, (req, v) -> {
                req.setXObsCopySourceServerSideEncryptionCustomerKey(v);
            }));
        builder.<String>withRequestField("x-obs-copy-source-server-side-encryption-customer-key-MD5",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CopyObjectRequest::getXObsCopySourceServerSideEncryptionCustomerKeyMD5, (req, v) -> {
                req.setXObsCopySourceServerSideEncryptionCustomerKeyMD5(v);
            }));
        builder.<String>withRequestField("success_action_redirect",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CopyObjectRequest::getSuccessActionRedirect, (req, v) -> {
                req.setSuccessActionRedirect(v);
            }));

        // response

        builder.<String>withResponseField("x-obs-id-2",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CopyObjectResponse::getXObsId2, CopyObjectResponse::setXObsId2));
        builder.<String>withResponseField("x-obs-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CopyObjectResponse::getXObsRequestId, CopyObjectResponse::setXObsRequestId));
        builder.<String>withResponseField("x-obs-server-side-encryption",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CopyObjectResponse::getXObsServerSideEncryption,
                CopyObjectResponse::setXObsServerSideEncryption));
        builder.<String>withResponseField("Connection",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CopyObjectResponse::getConnection, CopyObjectResponse::setConnection));
        builder.<String>withResponseField("x-obs-server-side-encryption-customer-key-MD5",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CopyObjectResponse::getXObsServerSideEncryptionCustomerKeyMD5,
                CopyObjectResponse::setXObsServerSideEncryptionCustomerKeyMD5));
        builder.<String>withResponseField("Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CopyObjectResponse::getDate, CopyObjectResponse::setDate));
        builder.<String>withResponseField("ETag",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CopyObjectResponse::getEtag, CopyObjectResponse::setEtag));
        builder.<String>withResponseField("x-obs-server-side-encryption-customer-algorithm",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CopyObjectResponse::getXObsServerSideEncryptionCustomerAlgorithm,
                CopyObjectResponse::setXObsServerSideEncryptionCustomerAlgorithm));
        builder.<String>withResponseField("x-obs-copy-source-version-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CopyObjectResponse::getXObsCopySourceVersionId,
                CopyObjectResponse::setXObsCopySourceVersionId));
        builder.<String>withResponseField("x-obs-storage-class",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CopyObjectResponse::getXObsStorageClass, CopyObjectResponse::setXObsStorageClass));
        builder.<String>withResponseField("x-obs-server-side-encryption-kms-key-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CopyObjectResponse::getXObsServerSideEncryptionKmsKeyId,
                CopyObjectResponse::setXObsServerSideEncryptionKmsKeyId));
        builder.<String>withResponseField("Content-Length",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CopyObjectResponse::getContentLength, CopyObjectResponse::setContentLength));
        builder.<String>withResponseField("x-obs-version-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CopyObjectResponse::getXObsVersionId, CopyObjectResponse::setXObsVersionId));
        return builder.build();
    }

    public static final HttpRequestDef<CreateBucketRequest, CreateBucketResponse> createBucket = genForcreateBucket();

    private static HttpRequestDef<CreateBucketRequest, CreateBucketResponse> genForcreateBucket() {
        // basic
        HttpRequestDef.Builder<CreateBucketRequest, CreateBucketResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, CreateBucketRequest.class, CreateBucketResponse.class)
                .withName("CreateBucket")
                .withUri("/")
                .withContentType("application/xml");

        // requests
        builder.<String>withRequestField("bucket_name",
            LocationType.Cname,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateBucketRequest::getBucketName, (req, v) -> {
                req.setBucketName(v);
            }));
        builder.<String>withRequestField("Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateBucketRequest::getDate, (req, v) -> {
                req.setDate(v);
            }));
        builder.<String>withRequestField("x-obs-acl",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateBucketRequest::getXObsAcl, (req, v) -> {
                req.setXObsAcl(v);
            }));
        builder.<CreateBucketRequest.XObsStorageClassEnum>withRequestField("x-obs-storage-class",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CreateBucketRequest.XObsStorageClassEnum.class),
            f -> f.withMarshaller(CreateBucketRequest::getXObsStorageClass, (req, v) -> {
                req.setXObsStorageClass(v);
            }));
        builder.<String>withRequestField("x-obs-grant-read",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateBucketRequest::getXObsGrantRead, (req, v) -> {
                req.setXObsGrantRead(v);
            }));
        builder.<String>withRequestField("x-obs-grant-write",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateBucketRequest::getXObsGrantWrite, (req, v) -> {
                req.setXObsGrantWrite(v);
            }));
        builder.<String>withRequestField("x-obs-grant-read-acp",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateBucketRequest::getXObsGrantReadAcp, (req, v) -> {
                req.setXObsGrantReadAcp(v);
            }));
        builder.<String>withRequestField("x-obs-grant-write-acp",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateBucketRequest::getXObsGrantWriteAcp, (req, v) -> {
                req.setXObsGrantWriteAcp(v);
            }));
        builder.<String>withRequestField("x-obs-grant-full-control",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateBucketRequest::getXObsGrantFullControl, (req, v) -> {
                req.setXObsGrantFullControl(v);
            }));
        builder.<String>withRequestField("x-obs-grant-read-delivered",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateBucketRequest::getXObsGrantReadDelivered, (req, v) -> {
                req.setXObsGrantReadDelivered(v);
            }));
        builder.<String>withRequestField("x-obs-grant-full-control-delivered",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateBucketRequest::getXObsGrantFullControlDelivered, (req, v) -> {
                req.setXObsGrantFullControlDelivered(v);
            }));
        builder.<CreateBucketRequest.XObsAzRedundancyEnum>withRequestField("x-obs-az-redundancy",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CreateBucketRequest.XObsAzRedundancyEnum.class),
            f -> f.withMarshaller(CreateBucketRequest::getXObsAzRedundancy, (req, v) -> {
                req.setXObsAzRedundancy(v);
            }));
        builder.<CreateBucketRequest.XObsFsFileInterfaceEnum>withRequestField("x-obs-fs-file-interface",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CreateBucketRequest.XObsFsFileInterfaceEnum.class),
            f -> f.withMarshaller(CreateBucketRequest::getXObsFsFileInterface, (req, v) -> {
                req.setXObsFsFileInterface(v);
            }));
        builder.<String>withRequestField("x-obs-epid",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateBucketRequest::getXObsEpid, (req, v) -> {
                req.setXObsEpid(v);
            }));
        builder.<CreateBucketRequest.XObsClusterTypeEnum>withRequestField("x-obs-cluster-type",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CreateBucketRequest.XObsClusterTypeEnum.class),
            f -> f.withMarshaller(CreateBucketRequest::getXObsClusterType, (req, v) -> {
                req.setXObsClusterType(v);
            }));
        builder.<String>withRequestField("x-obs-location-clustergroup-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateBucketRequest::getXObsLocationClustergroupId, (req, v) -> {
                req.setXObsLocationClustergroupId(v);
            }));
        builder.<String>withRequestField("x-obs-ies-location",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateBucketRequest::getXObsIesLocation, (req, v) -> {
                req.setXObsIesLocation(v);
            }));
        builder.<CreateBucketRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CreateBucketRequestBody.class),
            f -> f.withMarshaller(CreateBucketRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        builder.<String>withResponseField("x-obs-id-2",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateBucketResponse::getXObsId2, CreateBucketResponse::setXObsId2));
        builder.<String>withResponseField("x-obs-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateBucketResponse::getXObsRequestId, CreateBucketResponse::setXObsRequestId));
        builder.<String>withResponseField("ETag",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateBucketResponse::getEtag, CreateBucketResponse::setEtag));
        builder.<String>withResponseField("Connection",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateBucketResponse::getConnection, CreateBucketResponse::setConnection));
        builder.<String>withResponseField("Content-Length",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateBucketResponse::getContentLength, CreateBucketResponse::setContentLength));
        builder.<String>withResponseField("Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateBucketResponse::getDate, CreateBucketResponse::setDate));
        return builder.build();
    }

    public static final HttpRequestDef<DeleteBucketRequest, DeleteBucketResponse> deleteBucket = genFordeleteBucket();

    private static HttpRequestDef<DeleteBucketRequest, DeleteBucketResponse> genFordeleteBucket() {
        // basic
        HttpRequestDef.Builder<DeleteBucketRequest, DeleteBucketResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteBucketRequest.class, DeleteBucketResponse.class)
                .withName("DeleteBucket")
                .withUri("/")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("bucket_name",
            LocationType.Cname,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteBucketRequest::getBucketName, (req, v) -> {
                req.setBucketName(v);
            }));
        builder.<String>withRequestField("Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteBucketRequest::getDate, (req, v) -> {
                req.setDate(v);
            }));

        // response

        builder.<String>withResponseField("x-obs-id-2",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteBucketResponse::getXObsId2, DeleteBucketResponse::setXObsId2));
        builder.<String>withResponseField("x-obs-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteBucketResponse::getXObsRequestId, DeleteBucketResponse::setXObsRequestId));
        builder.<String>withResponseField("ETag",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteBucketResponse::getEtag, DeleteBucketResponse::setEtag));
        builder.<String>withResponseField("Connection",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteBucketResponse::getConnection, DeleteBucketResponse::setConnection));
        builder.<String>withResponseField("Content-Length",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteBucketResponse::getContentLength, DeleteBucketResponse::setContentLength));
        builder.<String>withResponseField("Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteBucketResponse::getDate, DeleteBucketResponse::setDate));
        return builder.build();
    }

    public static final HttpRequestDef<DeleteBucketCustomdomainRequest, DeleteBucketCustomdomainResponse> deleteBucketCustomdomain =
        genFordeleteBucketCustomdomain();

    private static HttpRequestDef<DeleteBucketCustomdomainRequest, DeleteBucketCustomdomainResponse> genFordeleteBucketCustomdomain() {
        // basic
        HttpRequestDef.Builder<DeleteBucketCustomdomainRequest, DeleteBucketCustomdomainResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteBucketCustomdomainRequest.class,
                    DeleteBucketCustomdomainResponse.class)
                .withName("DeleteBucketCustomdomain")
                .withUri("/")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("bucket_name",
            LocationType.Cname,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteBucketCustomdomainRequest::getBucketName, (req, v) -> {
                req.setBucketName(v);
            }));
        builder.<String>withRequestField("customdomain",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteBucketCustomdomainRequest::getCustomdomain, (req, v) -> {
                req.setCustomdomain(v);
            }));
        builder.<String>withRequestField("Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteBucketCustomdomainRequest::getDate, (req, v) -> {
                req.setDate(v);
            }));

        // response

        builder.<String>withResponseField("x-obs-id-2",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteBucketCustomdomainResponse::getXObsId2,
                DeleteBucketCustomdomainResponse::setXObsId2));
        builder.<String>withResponseField("x-obs-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteBucketCustomdomainResponse::getXObsRequestId,
                DeleteBucketCustomdomainResponse::setXObsRequestId));
        builder.<String>withResponseField("ETag",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteBucketCustomdomainResponse::getEtag,
                DeleteBucketCustomdomainResponse::setEtag));
        builder.<String>withResponseField("Connection",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteBucketCustomdomainResponse::getConnection,
                DeleteBucketCustomdomainResponse::setConnection));
        builder.<String>withResponseField("Content-Length",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteBucketCustomdomainResponse::getContentLength,
                DeleteBucketCustomdomainResponse::setContentLength));
        builder.<String>withResponseField("Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteBucketCustomdomainResponse::getDate,
                DeleteBucketCustomdomainResponse::setDate));
        return builder.build();
    }

    public static final HttpRequestDef<DeleteObjectRequest, DeleteObjectResponse> deleteObject = genFordeleteObject();

    private static HttpRequestDef<DeleteObjectRequest, DeleteObjectResponse> genFordeleteObject() {
        // basic
        HttpRequestDef.Builder<DeleteObjectRequest, DeleteObjectResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteObjectRequest.class, DeleteObjectResponse.class)
                .withName("DeleteObject")
                .withUri("/{object_key}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("object_key",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteObjectRequest::getObjectKey, (req, v) -> {
                req.setObjectKey(v);
            }));
        builder.<String>withRequestField("bucket_name",
            LocationType.Cname,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteObjectRequest::getBucketName, (req, v) -> {
                req.setBucketName(v);
            }));
        builder.<String>withRequestField("versionId",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteObjectRequest::getVersionId, (req, v) -> {
                req.setVersionId(v);
            }));
        builder.<String>withRequestField("Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteObjectRequest::getDate, (req, v) -> {
                req.setDate(v);
            }));

        // response

        builder.<String>withResponseField("x-obs-id-2",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteObjectResponse::getXObsId2, DeleteObjectResponse::setXObsId2));
        builder.<String>withResponseField("x-obs-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteObjectResponse::getXObsRequestId, DeleteObjectResponse::setXObsRequestId));
        builder.<String>withResponseField("ETag",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteObjectResponse::getEtag, DeleteObjectResponse::setEtag));
        builder.<String>withResponseField("Connection",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteObjectResponse::getConnection, DeleteObjectResponse::setConnection));
        builder.<String>withResponseField("Content-Length",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteObjectResponse::getContentLength, DeleteObjectResponse::setContentLength));
        builder.<String>withResponseField("Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteObjectResponse::getDate, DeleteObjectResponse::setDate));
        builder.<String>withResponseField("x-obs-delete-marker",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteObjectResponse::getXObsDeleteMarker,
                DeleteObjectResponse::setXObsDeleteMarker));
        builder.<String>withResponseField("x-obs-version-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteObjectResponse::getXObsVersionId, DeleteObjectResponse::setXObsVersionId));
        return builder.build();
    }

    public static final HttpRequestDef<DeleteObjectsRequest, DeleteObjectsResponse> deleteObjects =
        genFordeleteObjects();

    private static HttpRequestDef<DeleteObjectsRequest, DeleteObjectsResponse> genFordeleteObjects() {
        // basic
        HttpRequestDef.Builder<DeleteObjectsRequest, DeleteObjectsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, DeleteObjectsRequest.class, DeleteObjectsResponse.class)
                .withName("DeleteObjects")
                .withUri("/")
                .withContentType("application/xml");

        // requests
        builder.<String>withRequestField("bucket_name",
            LocationType.Cname,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteObjectsRequest::getBucketName, (req, v) -> {
                req.setBucketName(v);
            }));
        builder.<String>withRequestField("delete",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteObjectsRequest::getDelete, (req, v) -> {
                req.setDelete(v);
            }));
        builder.<String>withRequestField("Content-MD5",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteObjectsRequest::getContentMD5, (req, v) -> {
                req.setContentMD5(v);
            }));
        builder.<String>withRequestField("Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteObjectsRequest::getDate, (req, v) -> {
                req.setDate(v);
            }));
        builder.<DeleteObjectsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteObjectsRequestBody.class),
            f -> f.withMarshaller(DeleteObjectsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        builder.<String>withResponseField("x-obs-id-2",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteObjectsResponse::getXObsId2, DeleteObjectsResponse::setXObsId2));
        builder.<String>withResponseField("x-obs-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteObjectsResponse::getXObsRequestId, DeleteObjectsResponse::setXObsRequestId));
        builder.<String>withResponseField("ETag",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteObjectsResponse::getEtag, DeleteObjectsResponse::setEtag));
        builder.<String>withResponseField("Connection",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteObjectsResponse::getConnection, DeleteObjectsResponse::setConnection));
        builder.<String>withResponseField("Content-Length",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteObjectsResponse::getContentLength, DeleteObjectsResponse::setContentLength));
        builder.<String>withResponseField("Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteObjectsResponse::getDate, DeleteObjectsResponse::setDate));
        return builder.build();
    }

    public static final HttpRequestDef<GetBucketAclRequest, GetBucketAclResponse> getBucketAcl = genForgetBucketAcl();

    private static HttpRequestDef<GetBucketAclRequest, GetBucketAclResponse> genForgetBucketAcl() {
        // basic
        HttpRequestDef.Builder<GetBucketAclRequest, GetBucketAclResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, GetBucketAclRequest.class, GetBucketAclResponse.class)
                .withName("GetBucketAcl")
                .withUri("/")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("bucket_name",
            LocationType.Cname,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetBucketAclRequest::getBucketName, (req, v) -> {
                req.setBucketName(v);
            }));
        builder.<String>withRequestField("acl",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetBucketAclRequest::getAcl, (req, v) -> {
                req.setAcl(v);
            }));
        builder.<String>withRequestField("Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetBucketAclRequest::getDate, (req, v) -> {
                req.setDate(v);
            }));

        // response

        builder.<String>withResponseField("x-obs-id-2",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(GetBucketAclResponse::getXObsId2, GetBucketAclResponse::setXObsId2));
        builder.<String>withResponseField("x-obs-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(GetBucketAclResponse::getXObsRequestId, GetBucketAclResponse::setXObsRequestId));
        builder.<String>withResponseField("ETag",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(GetBucketAclResponse::getEtag, GetBucketAclResponse::setEtag));
        builder.<String>withResponseField("Connection",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(GetBucketAclResponse::getConnection, GetBucketAclResponse::setConnection));
        builder.<String>withResponseField("Content-Length",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(GetBucketAclResponse::getContentLength, GetBucketAclResponse::setContentLength));
        builder.<String>withResponseField("Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(GetBucketAclResponse::getDate, GetBucketAclResponse::setDate));
        return builder.build();
    }

    public static final HttpRequestDef<GetBucketCustomdomainRequest, GetBucketCustomdomainResponse> getBucketCustomdomain =
        genForgetBucketCustomdomain();

    private static HttpRequestDef<GetBucketCustomdomainRequest, GetBucketCustomdomainResponse> genForgetBucketCustomdomain() {
        // basic
        HttpRequestDef.Builder<GetBucketCustomdomainRequest, GetBucketCustomdomainResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, GetBucketCustomdomainRequest.class, GetBucketCustomdomainResponse.class)
            .withName("GetBucketCustomdomain")
            .withUri("/")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("bucket_name",
            LocationType.Cname,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetBucketCustomdomainRequest::getBucketName, (req, v) -> {
                req.setBucketName(v);
            }));
        builder.<String>withRequestField("customdomain",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetBucketCustomdomainRequest::getCustomdomain, (req, v) -> {
                req.setCustomdomain(v);
            }));
        builder.<String>withRequestField("Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetBucketCustomdomainRequest::getDate, (req, v) -> {
                req.setDate(v);
            }));

        // response

        builder.<String>withResponseField("x-obs-id-2",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(GetBucketCustomdomainResponse::getXObsId2,
                GetBucketCustomdomainResponse::setXObsId2));
        builder.<String>withResponseField("x-obs-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(GetBucketCustomdomainResponse::getXObsRequestId,
                GetBucketCustomdomainResponse::setXObsRequestId));
        builder.<String>withResponseField("ETag",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(GetBucketCustomdomainResponse::getEtag, GetBucketCustomdomainResponse::setEtag));
        builder.<String>withResponseField("Connection",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(GetBucketCustomdomainResponse::getConnection,
                GetBucketCustomdomainResponse::setConnection));
        builder.<String>withResponseField("Content-Length",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(GetBucketCustomdomainResponse::getContentLength,
                GetBucketCustomdomainResponse::setContentLength));
        builder.<String>withResponseField("Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(GetBucketCustomdomainResponse::getDate, GetBucketCustomdomainResponse::setDate));
        return builder.build();
    }

    public static final HttpRequestDef<GetBucketMetadataRequest, GetBucketMetadataResponse> getBucketMetadata =
        genForgetBucketMetadata();

    private static HttpRequestDef<GetBucketMetadataRequest, GetBucketMetadataResponse> genForgetBucketMetadata() {
        // basic
        HttpRequestDef.Builder<GetBucketMetadataRequest, GetBucketMetadataResponse> builder =
            HttpRequestDef.builder(HttpMethod.HEAD, GetBucketMetadataRequest.class, GetBucketMetadataResponse.class)
                .withName("GetBucketMetadata")
                .withUri("/")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("bucket_name",
            LocationType.Cname,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetBucketMetadataRequest::getBucketName, (req, v) -> {
                req.setBucketName(v);
            }));
        builder.<String>withRequestField("Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetBucketMetadataRequest::getDate, (req, v) -> {
                req.setDate(v);
            }));
        builder.<String>withRequestField("Origin",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetBucketMetadataRequest::getOrigin, (req, v) -> {
                req.setOrigin(v);
            }));
        builder.<String>withRequestField("Access-Control-Request-Headers",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetBucketMetadataRequest::getAccessControlRequestHeaders, (req, v) -> {
                req.setAccessControlRequestHeaders(v);
            }));

        // response

        builder.<String>withResponseField("x-obs-id-2",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(GetBucketMetadataResponse::getXObsId2, GetBucketMetadataResponse::setXObsId2));
        builder.<String>withResponseField("x-obs-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(GetBucketMetadataResponse::getXObsRequestId,
                GetBucketMetadataResponse::setXObsRequestId));
        builder.<String>withResponseField("x-obs-fs-file-interface",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(GetBucketMetadataResponse::getXObsFsFileInterface,
                GetBucketMetadataResponse::setXObsFsFileInterface));
        builder.<String>withResponseField("x-obs-version",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(GetBucketMetadataResponse::getXObsVersion,
                GetBucketMetadataResponse::setXObsVersion));
        builder.<String>withResponseField("Access-Control-Allow-Origin",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(GetBucketMetadataResponse::getAccessControlAllowOrigin,
                GetBucketMetadataResponse::setAccessControlAllowOrigin));
        builder.<String>withResponseField("Access-Control-Allow-Methods",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(GetBucketMetadataResponse::getAccessControlAllowMethods,
                GetBucketMetadataResponse::setAccessControlAllowMethods));
        builder.<String>withResponseField("x-obs-bucket-location",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(GetBucketMetadataResponse::getXObsBucketLocation,
                GetBucketMetadataResponse::setXObsBucketLocation));
        builder.<String>withResponseField("Connection",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(GetBucketMetadataResponse::getConnection, GetBucketMetadataResponse::setConnection));
        builder.<String>withResponseField("x-obs-epid",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(GetBucketMetadataResponse::getXObsEpid, GetBucketMetadataResponse::setXObsEpid));
        builder.<String>withResponseField("Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(GetBucketMetadataResponse::getDate, GetBucketMetadataResponse::setDate));
        builder.<String>withResponseField("Access-Control-Allow-Headers",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(GetBucketMetadataResponse::getAccessControlAllowHeaders,
                GetBucketMetadataResponse::setAccessControlAllowHeaders));
        builder.<String>withResponseField("Access-Control-Expose-Headers",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(GetBucketMetadataResponse::getAccessControlExposeHeaders,
                GetBucketMetadataResponse::setAccessControlExposeHeaders));
        builder.<String>withResponseField("ETag",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(GetBucketMetadataResponse::getEtag, GetBucketMetadataResponse::setEtag));
        builder.<String>withResponseField("x-obs-storage-class",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(GetBucketMetadataResponse::getXObsStorageClass,
                GetBucketMetadataResponse::setXObsStorageClass));
        builder.<String>withResponseField("x-obs-az-redundancy",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(GetBucketMetadataResponse::getXObsAzRedundancy,
                GetBucketMetadataResponse::setXObsAzRedundancy));
        builder.<String>withResponseField("Content-Length",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(GetBucketMetadataResponse::getContentLength,
                GetBucketMetadataResponse::setContentLength));
        builder.<Integer>withResponseField("Access-Control-Max-Age",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(GetBucketMetadataResponse::getAccessControlMaxAge,
                GetBucketMetadataResponse::setAccessControlMaxAge));
        builder.<String>withResponseField("x-obs-ies-location",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(GetBucketMetadataResponse::getXObsIesLocation,
                GetBucketMetadataResponse::setXObsIesLocation));
        return builder.build();
    }

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

    public static final HttpRequestDef<GetObjectMetadataRequest, GetObjectMetadataResponse> getObjectMetadata =
        genForgetObjectMetadata();

    private static HttpRequestDef<GetObjectMetadataRequest, GetObjectMetadataResponse> genForgetObjectMetadata() {
        // basic
        HttpRequestDef.Builder<GetObjectMetadataRequest, GetObjectMetadataResponse> builder =
            HttpRequestDef.builder(HttpMethod.HEAD, GetObjectMetadataRequest.class, GetObjectMetadataResponse.class)
                .withName("GetObjectMetadata")
                .withUri("/{object_key}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("object_key",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetObjectMetadataRequest::getObjectKey, (req, v) -> {
                req.setObjectKey(v);
            }));
        builder.<String>withRequestField("bucket_name",
            LocationType.Cname,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetObjectMetadataRequest::getBucketName, (req, v) -> {
                req.setBucketName(v);
            }));
        builder.<String>withRequestField("versionId",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetObjectMetadataRequest::getVersionId, (req, v) -> {
                req.setVersionId(v);
            }));
        builder.<String>withRequestField("Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetObjectMetadataRequest::getDate, (req, v) -> {
                req.setDate(v);
            }));
        builder.<String>withRequestField("Origin",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetObjectMetadataRequest::getOrigin, (req, v) -> {
                req.setOrigin(v);
            }));
        builder.<String>withRequestField("Access-Control-Request-Headers",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetObjectMetadataRequest::getAccessControlRequestHeaders, (req, v) -> {
                req.setAccessControlRequestHeaders(v);
            }));
        builder.<String>withRequestField("x-obs-server-side-encryption-customer-algorithm",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetObjectMetadataRequest::getXObsServerSideEncryptionCustomerAlgorithm, (req, v) -> {
                req.setXObsServerSideEncryptionCustomerAlgorithm(v);
            }));
        builder.<String>withRequestField("x-obs-server-side-encryption-customer-key",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetObjectMetadataRequest::getXObsServerSideEncryptionCustomerKey, (req, v) -> {
                req.setXObsServerSideEncryptionCustomerKey(v);
            }));
        builder.<String>withRequestField("x-obs-server-side-encryption-customer-key-MD5",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetObjectMetadataRequest::getXObsServerSideEncryptionCustomerKeyMD5, (req, v) -> {
                req.setXObsServerSideEncryptionCustomerKeyMD5(v);
            }));
        builder.<String>withRequestField("success-action-redirect",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetObjectMetadataRequest::getSuccessActionRedirect, (req, v) -> {
                req.setSuccessActionRedirect(v);
            }));
        builder.<Integer>withRequestField("x-obs-expires",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(GetObjectMetadataRequest::getXObsExpires, (req, v) -> {
                req.setXObsExpires(v);
            }));

        // response

        builder.<String>withResponseField("x-obs-id-2",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(GetObjectMetadataResponse::getXObsId2, GetObjectMetadataResponse::setXObsId2));
        builder.<String>withResponseField("x-obs-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(GetObjectMetadataResponse::getXObsRequestId,
                GetObjectMetadataResponse::setXObsRequestId));
        builder.<String>withResponseField("x-obs-hash-crc64ecma",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(GetObjectMetadataResponse::getXObsHashCrc64ecma,
                GetObjectMetadataResponse::setXObsHashCrc64ecma));
        builder.<String>withResponseField("Access-Control-Allow-Origin",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(GetObjectMetadataResponse::getAccessControlAllowOrigin,
                GetObjectMetadataResponse::setAccessControlAllowOrigin));
        builder.<String>withResponseField("x-obs-server-side-encryption",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(GetObjectMetadataResponse::getXObsServerSideEncryption,
                GetObjectMetadataResponse::setXObsServerSideEncryption));
        builder.<String>withResponseField("x-obs-restore",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(GetObjectMetadataResponse::getXObsRestore,
                GetObjectMetadataResponse::setXObsRestore));
        builder.<String>withResponseField("x-obs-object-type",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(GetObjectMetadataResponse::getXObsObjectType,
                GetObjectMetadataResponse::setXObsObjectType));
        builder.<Integer>withResponseField("x-obs-next-append-position",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(GetObjectMetadataResponse::getXObsNextAppendPosition,
                GetObjectMetadataResponse::setXObsNextAppendPosition));
        builder.<String>withResponseField("Access-Control-Allow-Methods",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(GetObjectMetadataResponse::getAccessControlAllowMethods,
                GetObjectMetadataResponse::setAccessControlAllowMethods));
        builder.<String>withResponseField("Connection",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(GetObjectMetadataResponse::getConnection, GetObjectMetadataResponse::setConnection));
        builder.<String>withResponseField("x-obs-server-side-encryption-customer-key-MD5",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(GetObjectMetadataResponse::getXObsServerSideEncryptionCustomerKeyMD5,
                GetObjectMetadataResponse::setXObsServerSideEncryptionCustomerKeyMD5));
        builder.<String>withResponseField("x-obs-expiration",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(GetObjectMetadataResponse::getXObsExpiration,
                GetObjectMetadataResponse::setXObsExpiration));
        builder.<String>withResponseField("Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(GetObjectMetadataResponse::getDate, GetObjectMetadataResponse::setDate));
        builder.<String>withResponseField("Access-Control-Allow-Headers",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(GetObjectMetadataResponse::getAccessControlAllowHeaders,
                GetObjectMetadataResponse::setAccessControlAllowHeaders));
        builder.<String>withResponseField("x-obs-uploadId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(GetObjectMetadataResponse::getXObsUploadId,
                GetObjectMetadataResponse::setXObsUploadId));
        builder.<String>withResponseField("Access-Control-Expose-Headers",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(GetObjectMetadataResponse::getAccessControlExposeHeaders,
                GetObjectMetadataResponse::setAccessControlExposeHeaders));
        builder.<String>withResponseField("ETag",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(GetObjectMetadataResponse::getEtag, GetObjectMetadataResponse::setEtag));
        builder.<String>withResponseField("x-obs-server-side-encryption-customer-algorithm",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(GetObjectMetadataResponse::getXObsServerSideEncryptionCustomerAlgorithm,
                GetObjectMetadataResponse::setXObsServerSideEncryptionCustomerAlgorithm));
        builder.<String>withResponseField("x-obs-storage-class",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(GetObjectMetadataResponse::getXObsStorageClass,
                GetObjectMetadataResponse::setXObsStorageClass));
        builder.<String>withResponseField("x-obs-server-side-encryption-kms-key-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(GetObjectMetadataResponse::getXObsServerSideEncryptionKmsKeyId,
                GetObjectMetadataResponse::setXObsServerSideEncryptionKmsKeyId));
        builder.<String>withResponseField("Content-Length",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(GetObjectMetadataResponse::getContentLength,
                GetObjectMetadataResponse::setContentLength));
        builder.<Integer>withResponseField("Access-Control-Max-Age",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(GetObjectMetadataResponse::getAccessControlMaxAge,
                GetObjectMetadataResponse::setAccessControlMaxAge));
        builder.<String>withResponseField("x-obs-website-redirect-location",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(GetObjectMetadataResponse::getXObsWebsiteRedirectLocation,
                GetObjectMetadataResponse::setXObsWebsiteRedirectLocation));
        builder.<String>withResponseField("x-obs-version-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(GetObjectMetadataResponse::getXObsVersionId,
                GetObjectMetadataResponse::setXObsVersionId));
        return builder.build();
    }

    public static final HttpRequestDef<ListBucketsRequest, ListBucketsResponse> listBuckets = genForlistBuckets();

    private static HttpRequestDef<ListBucketsRequest, ListBucketsResponse> genForlistBuckets() {
        // basic
        HttpRequestDef.Builder<ListBucketsRequest, ListBucketsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListBucketsRequest.class, ListBucketsResponse.class)
                .withName("ListBuckets")
                .withUri("/")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBucketsRequest::getDate, (req, v) -> {
                req.setDate(v);
            }));
        builder.<ListBucketsRequest.XObsBucketTypeEnum>withRequestField("x-obs-bucket-type",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListBucketsRequest.XObsBucketTypeEnum.class),
            f -> f.withMarshaller(ListBucketsRequest::getXObsBucketType, (req, v) -> {
                req.setXObsBucketType(v);
            }));

        // response

        builder.<String>withResponseField("x-obs-id-2",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListBucketsResponse::getXObsId2, ListBucketsResponse::setXObsId2));
        builder.<String>withResponseField("x-obs-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListBucketsResponse::getXObsRequestId, ListBucketsResponse::setXObsRequestId));
        builder.<String>withResponseField("ETag",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListBucketsResponse::getEtag, ListBucketsResponse::setEtag));
        builder.<String>withResponseField("x-obs-bucket-type",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListBucketsResponse::getXObsBucketType, ListBucketsResponse::setXObsBucketType));
        builder.<String>withResponseField("Connection",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListBucketsResponse::getConnection, ListBucketsResponse::setConnection));
        builder.<String>withResponseField("Content-Length",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListBucketsResponse::getContentLength, ListBucketsResponse::setContentLength));
        builder.<String>withResponseField("Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListBucketsResponse::getDate, ListBucketsResponse::setDate));
        return builder.build();
    }

    public static final HttpRequestDef<ListObjectsRequest, ListObjectsResponse> listObjects = genForlistObjects();

    private static HttpRequestDef<ListObjectsRequest, ListObjectsResponse> genForlistObjects() {
        // basic
        HttpRequestDef.Builder<ListObjectsRequest, ListObjectsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListObjectsRequest.class, ListObjectsResponse.class)
                .withName("ListObjects")
                .withUri("/")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("bucket_name",
            LocationType.Cname,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListObjectsRequest::getBucketName, (req, v) -> {
                req.setBucketName(v);
            }));
        builder.<String>withRequestField("prefix",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListObjectsRequest::getPrefix, (req, v) -> {
                req.setPrefix(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListObjectsRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));
        builder.<Integer>withRequestField("max-keys",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListObjectsRequest::getMaxKeys, (req, v) -> {
                req.setMaxKeys(v);
            }));
        builder.<String>withRequestField("delimiter",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListObjectsRequest::getDelimiter, (req, v) -> {
                req.setDelimiter(v);
            }));
        builder.<String>withRequestField("key-marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListObjectsRequest::getKeyMarker, (req, v) -> {
                req.setKeyMarker(v);
            }));
        builder.<String>withRequestField("version-id-marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListObjectsRequest::getVersionIdMarker, (req, v) -> {
                req.setVersionIdMarker(v);
            }));
        builder.<String>withRequestField("encoding-type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListObjectsRequest::getEncodingType, (req, v) -> {
                req.setEncodingType(v);
            }));
        builder.<String>withRequestField("Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListObjectsRequest::getDate, (req, v) -> {
                req.setDate(v);
            }));

        // response

        builder.<String>withResponseField("x-obs-id-2",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListObjectsResponse::getXObsId2, ListObjectsResponse::setXObsId2));
        builder.<String>withResponseField("x-obs-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListObjectsResponse::getXObsRequestId, ListObjectsResponse::setXObsRequestId));
        builder.<String>withResponseField("ETag",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListObjectsResponse::getEtag, ListObjectsResponse::setEtag));
        builder.<String>withResponseField("x-obs-bucket-type",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListObjectsResponse::getXObsBucketType, ListObjectsResponse::setXObsBucketType));
        builder.<String>withResponseField("Connection",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListObjectsResponse::getConnection, ListObjectsResponse::setConnection));
        builder.<String>withResponseField("Content-Length",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListObjectsResponse::getContentLength, ListObjectsResponse::setContentLength));
        builder.<String>withResponseField("Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListObjectsResponse::getDate, ListObjectsResponse::setDate));
        return builder.build();
    }

    public static final HttpRequestDef<PutObjectRequest, PutObjectResponse> putObject = genForputObject();

    private static HttpRequestDef<PutObjectRequest, PutObjectResponse> genForputObject() {
        // basic
        HttpRequestDef.Builder<PutObjectRequest, PutObjectResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, PutObjectRequest.class, PutObjectResponse.class)
                .withName("PutObject")
                .withUri("/{object_key}")
                .withContentType("application/octet-stream");

        // requests
        builder.<String>withRequestField("object_key",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(PutObjectRequest::getObjectKey, (req, v) -> {
                req.setObjectKey(v);
            }));
        builder.<String>withRequestField("bucket_name",
            LocationType.Cname,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(PutObjectRequest::getBucketName, (req, v) -> {
                req.setBucketName(v);
            }));
        builder.<String>withRequestField("Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(PutObjectRequest::getDate, (req, v) -> {
                req.setDate(v);
            }));
        builder.<String>withRequestField("Content-MD5",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(PutObjectRequest::getContentMD5, (req, v) -> {
                req.setContentMD5(v);
            }));
        builder.<String>withRequestField("x-obs-acl",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(PutObjectRequest::getXObsAcl, (req, v) -> {
                req.setXObsAcl(v);
            }));
        builder.<String>withRequestField("x-obs-grant-read",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(PutObjectRequest::getXObsGrantRead, (req, v) -> {
                req.setXObsGrantRead(v);
            }));
        builder.<String>withRequestField("x-obs-grant-read-acp",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(PutObjectRequest::getXObsGrantReadAcp, (req, v) -> {
                req.setXObsGrantReadAcp(v);
            }));
        builder.<String>withRequestField("x-obs-grant-write-acp",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(PutObjectRequest::getXObsGrantWriteAcp, (req, v) -> {
                req.setXObsGrantWriteAcp(v);
            }));
        builder.<String>withRequestField("x-obs-grant-full-control",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(PutObjectRequest::getXObsGrantFullControl, (req, v) -> {
                req.setXObsGrantFullControl(v);
            }));
        builder.<PutObjectRequest.XObsStorageClassEnum>withRequestField("x-obs-storage-class",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(PutObjectRequest.XObsStorageClassEnum.class),
            f -> f.withMarshaller(PutObjectRequest::getXObsStorageClass, (req, v) -> {
                req.setXObsStorageClass(v);
            }));
        builder.<String>withRequestField("x-obs-meta-xxx",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(PutObjectRequest::getXObsMetaXxx, (req, v) -> {
                req.setXObsMetaXxx(v);
            }));
        builder.<String>withRequestField("x-obs-persistent-headers",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(PutObjectRequest::getXObsPersistentHeaders, (req, v) -> {
                req.setXObsPersistentHeaders(v);
            }));
        builder.<String>withRequestField("x-obs-website-redirect-location",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(PutObjectRequest::getXObsWebsiteRedirectLocation, (req, v) -> {
                req.setXObsWebsiteRedirectLocation(v);
            }));
        builder.<String>withRequestField("x-obs-server-side-encryption",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(PutObjectRequest::getXObsServerSideEncryption, (req, v) -> {
                req.setXObsServerSideEncryption(v);
            }));
        builder.<String>withRequestField("x-obs-server-side-encryption-kms-key-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(PutObjectRequest::getXObsServerSideEncryptionKmsKeyId, (req, v) -> {
                req.setXObsServerSideEncryptionKmsKeyId(v);
            }));
        builder.<String>withRequestField("x-obs-server-side-encryption-customer-algorithm",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(PutObjectRequest::getXObsServerSideEncryptionCustomerAlgorithm, (req, v) -> {
                req.setXObsServerSideEncryptionCustomerAlgorithm(v);
            }));
        builder.<String>withRequestField("x-obs-server-side-encryption-customer-key",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(PutObjectRequest::getXObsServerSideEncryptionCustomerKey, (req, v) -> {
                req.setXObsServerSideEncryptionCustomerKey(v);
            }));
        builder.<String>withRequestField("x-obs-server-side-encryption-customer-key-MD5",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(PutObjectRequest::getXObsServerSideEncryptionCustomerKeyMD5, (req, v) -> {
                req.setXObsServerSideEncryptionCustomerKeyMD5(v);
            }));
        builder.<String>withRequestField("success-action-redirect",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(PutObjectRequest::getSuccessActionRedirect, (req, v) -> {
                req.setSuccessActionRedirect(v);
            }));
        builder.<Integer>withRequestField("x-obs-expires",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(PutObjectRequest::getXObsExpires, (req, v) -> {
                req.setXObsExpires(v);
            }));

        // response

        builder.<String>withResponseField("x-obs-id-2",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(PutObjectResponse::getXObsId2, PutObjectResponse::setXObsId2));
        builder.<String>withResponseField("x-obs-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(PutObjectResponse::getXObsRequestId, PutObjectResponse::setXObsRequestId));
        builder.<String>withResponseField("ETag",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(PutObjectResponse::getEtag, PutObjectResponse::setEtag));
        builder.<String>withResponseField("x-obs-server-side-encryption",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(PutObjectResponse::getXObsServerSideEncryption,
                PutObjectResponse::setXObsServerSideEncryption));
        builder.<String>withResponseField("x-obs-server-side-encryption-customer-algorithm",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(PutObjectResponse::getXObsServerSideEncryptionCustomerAlgorithm,
                PutObjectResponse::setXObsServerSideEncryptionCustomerAlgorithm));
        builder.<String>withResponseField("x-obs-storage-class",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(PutObjectResponse::getXObsStorageClass, PutObjectResponse::setXObsStorageClass));
        builder.<String>withResponseField("Connection",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(PutObjectResponse::getConnection, PutObjectResponse::setConnection));
        builder.<String>withResponseField("x-obs-server-side-encryption-customer-key-MD5",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(PutObjectResponse::getXObsServerSideEncryptionCustomerKeyMD5,
                PutObjectResponse::setXObsServerSideEncryptionCustomerKeyMD5));
        builder.<String>withResponseField("x-obs-server-side-encryption-kms-key-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(PutObjectResponse::getXObsServerSideEncryptionKmsKeyId,
                PutObjectResponse::setXObsServerSideEncryptionKmsKeyId));
        builder.<String>withResponseField("Content-Length",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(PutObjectResponse::getContentLength, PutObjectResponse::setContentLength));
        builder.<String>withResponseField("Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(PutObjectResponse::getDate, PutObjectResponse::setDate));
        builder.<String>withResponseField("x-obs-version-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(PutObjectResponse::getXObsVersionId, PutObjectResponse::setXObsVersionId));
        return builder.build();
    }

    public static final HttpRequestDef<SetBucketAclRequest, SetBucketAclResponse> setBucketAcl = genForsetBucketAcl();

    private static HttpRequestDef<SetBucketAclRequest, SetBucketAclResponse> genForsetBucketAcl() {
        // basic
        HttpRequestDef.Builder<SetBucketAclRequest, SetBucketAclResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, SetBucketAclRequest.class, SetBucketAclResponse.class)
                .withName("SetBucketAcl")
                .withUri("/")
                .withContentType("application/xml");

        // requests
        builder.<String>withRequestField("bucket_name",
            LocationType.Cname,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SetBucketAclRequest::getBucketName, (req, v) -> {
                req.setBucketName(v);
            }));
        builder.<String>withRequestField("acl",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SetBucketAclRequest::getAcl, (req, v) -> {
                req.setAcl(v);
            }));
        builder.<String>withRequestField("Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SetBucketAclRequest::getDate, (req, v) -> {
                req.setDate(v);
            }));
        builder.<SetBucketAclRequest.XObsAclEnum>withRequestField("x-obs-acl",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(SetBucketAclRequest.XObsAclEnum.class),
            f -> f.withMarshaller(SetBucketAclRequest::getXObsAcl, (req, v) -> {
                req.setXObsAcl(v);
            }));
        builder.<SetBucketAclRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(SetBucketAclRequestBody.class),
            f -> f.withMarshaller(SetBucketAclRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        builder.<String>withResponseField("x-obs-id-2",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(SetBucketAclResponse::getXObsId2, SetBucketAclResponse::setXObsId2));
        builder.<String>withResponseField("x-obs-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(SetBucketAclResponse::getXObsRequestId, SetBucketAclResponse::setXObsRequestId));
        builder.<String>withResponseField("ETag",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(SetBucketAclResponse::getEtag, SetBucketAclResponse::setEtag));
        builder.<String>withResponseField("Connection",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(SetBucketAclResponse::getConnection, SetBucketAclResponse::setConnection));
        builder.<String>withResponseField("Content-Length",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(SetBucketAclResponse::getContentLength, SetBucketAclResponse::setContentLength));
        builder.<String>withResponseField("Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(SetBucketAclResponse::getDate, SetBucketAclResponse::setDate));
        return builder.build();
    }

    public static final HttpRequestDef<SetBucketCustomedomainRequest, SetBucketCustomedomainResponse> setBucketCustomedomain =
        genForsetBucketCustomedomain();

    private static HttpRequestDef<SetBucketCustomedomainRequest, SetBucketCustomedomainResponse> genForsetBucketCustomedomain() {
        // basic
        HttpRequestDef.Builder<SetBucketCustomedomainRequest, SetBucketCustomedomainResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, SetBucketCustomedomainRequest.class, SetBucketCustomedomainResponse.class)
            .withName("SetBucketCustomedomain")
            .withUri("/")
            .withContentType("application/xml");

        // requests
        builder.<String>withRequestField("bucket_name",
            LocationType.Cname,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SetBucketCustomedomainRequest::getBucketName, (req, v) -> {
                req.setBucketName(v);
            }));
        builder.<String>withRequestField("customdomain",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SetBucketCustomedomainRequest::getCustomdomain, (req, v) -> {
                req.setCustomdomain(v);
            }));
        builder.<String>withRequestField("Content-MD5",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SetBucketCustomedomainRequest::getContentMD5, (req, v) -> {
                req.setContentMD5(v);
            }));
        builder.<String>withRequestField("Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SetBucketCustomedomainRequest::getDate, (req, v) -> {
                req.setDate(v);
            }));
        builder.<SetBucketCustomDomainBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(SetBucketCustomDomainBody.class),
            f -> f.withMarshaller(SetBucketCustomedomainRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        builder.<String>withResponseField("x-obs-id-2",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(SetBucketCustomedomainResponse::getXObsId2,
                SetBucketCustomedomainResponse::setXObsId2));
        builder.<String>withResponseField("x-obs-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(SetBucketCustomedomainResponse::getXObsRequestId,
                SetBucketCustomedomainResponse::setXObsRequestId));
        builder.<String>withResponseField("ETag",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(SetBucketCustomedomainResponse::getEtag, SetBucketCustomedomainResponse::setEtag));
        builder.<String>withResponseField("Connection",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(SetBucketCustomedomainResponse::getConnection,
                SetBucketCustomedomainResponse::setConnection));
        builder.<String>withResponseField("Content-Length",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(SetBucketCustomedomainResponse::getContentLength,
                SetBucketCustomedomainResponse::setContentLength));
        builder.<String>withResponseField("Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(SetBucketCustomedomainResponse::getDate, SetBucketCustomedomainResponse::setDate));
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
