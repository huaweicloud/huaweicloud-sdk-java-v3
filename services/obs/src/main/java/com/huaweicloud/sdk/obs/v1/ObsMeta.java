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

    public static final HttpRequestDef<CopyObjectRequest, CopyObjectResponse> copyObject = genForCopyObject();

    private static HttpRequestDef<CopyObjectRequest, CopyObjectResponse> genForCopyObject() {
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
            f -> f.withMarshaller(CopyObjectRequest::getObjectKey, CopyObjectRequest::setObjectKey));
        builder.<String>withRequestField("bucket_name",
            LocationType.Cname,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CopyObjectRequest::getBucketName, CopyObjectRequest::setBucketName));
        builder.<String>withRequestField("Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CopyObjectRequest::getDate, CopyObjectRequest::setDate));
        builder.<String>withRequestField("x-obs-acl",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CopyObjectRequest::getXObsAcl, CopyObjectRequest::setXObsAcl));
        builder.<String>withRequestField("x-obs-grant-read",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CopyObjectRequest::getXObsGrantRead, CopyObjectRequest::setXObsGrantRead));
        builder.<String>withRequestField("x-obs-grant-read-acp",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CopyObjectRequest::getXObsGrantReadAcp, CopyObjectRequest::setXObsGrantReadAcp));
        builder.<String>withRequestField("x-obs-grant-write-acp",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CopyObjectRequest::getXObsGrantWriteAcp, CopyObjectRequest::setXObsGrantWriteAcp));
        builder.<String>withRequestField("x-obs-grant-full-control",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CopyObjectRequest::getXObsGrantFullControl,
                CopyObjectRequest::setXObsGrantFullControl));
        builder.<String>withRequestField("x-obs-copy-source",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CopyObjectRequest::getXObsCopySource, CopyObjectRequest::setXObsCopySource));
        builder.<CopyObjectRequest.XObsMetadataDirectiveEnum>withRequestField("x-obs-metadata-directive",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CopyObjectRequest.XObsMetadataDirectiveEnum.class),
            f -> f.withMarshaller(CopyObjectRequest::getXObsMetadataDirective,
                CopyObjectRequest::setXObsMetadataDirective));
        builder.<String>withRequestField("x-obs-copy-source-if-match",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CopyObjectRequest::getXObsCopySourceIfMatch,
                CopyObjectRequest::setXObsCopySourceIfMatch));
        builder.<String>withRequestField("x-obs-copy-source-if-none-match",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CopyObjectRequest::getXObsCopySourceIfNoneMatch,
                CopyObjectRequest::setXObsCopySourceIfNoneMatch));
        builder.<String>withRequestField("x-obs-copy-source-if-unmodified-since",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CopyObjectRequest::getXObsCopySourceIfUnmodifiedSince,
                CopyObjectRequest::setXObsCopySourceIfUnmodifiedSince));
        builder.<String>withRequestField("x-obs-copy-source-if-modified-since",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CopyObjectRequest::getXObsCopySourceIfModifiedSince,
                CopyObjectRequest::setXObsCopySourceIfModifiedSince));
        builder.<String>withRequestField("x-obs-storage-class",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CopyObjectRequest::getXObsStorageClass, CopyObjectRequest::setXObsStorageClass));
        builder.<String>withRequestField("x-obs-persistent-headers",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CopyObjectRequest::getXObsPersistentHeaders,
                CopyObjectRequest::setXObsPersistentHeaders));
        builder.<String>withRequestField("x-obs-website-redirect-location",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CopyObjectRequest::getXObsWebsiteRedirectLocation,
                CopyObjectRequest::setXObsWebsiteRedirectLocation));
        builder.<String>withRequestField("x-obs-server-side-encryption",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CopyObjectRequest::getXObsServerSideEncryption,
                CopyObjectRequest::setXObsServerSideEncryption));
        builder.<String>withRequestField("x-obs-server-side-encryption-kms-key-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CopyObjectRequest::getXObsServerSideEncryptionKmsKeyId,
                CopyObjectRequest::setXObsServerSideEncryptionKmsKeyId));
        builder.<String>withRequestField("x-obs-server-side-encryption-customer-algorithm",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CopyObjectRequest::getXObsServerSideEncryptionCustomerAlgorithm,
                CopyObjectRequest::setXObsServerSideEncryptionCustomerAlgorithm));
        builder.<String>withRequestField("x-obs-server-side-encryption-customer-key",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CopyObjectRequest::getXObsServerSideEncryptionCustomerKey,
                CopyObjectRequest::setXObsServerSideEncryptionCustomerKey));
        builder.<String>withRequestField("x-obs-server-side-encryption-customer-key-MD5",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CopyObjectRequest::getXObsServerSideEncryptionCustomerKeyMD5,
                CopyObjectRequest::setXObsServerSideEncryptionCustomerKeyMD5));
        builder.<String>withRequestField("x-obs-copy-source-server-side-encryption-customer-algorithm",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CopyObjectRequest::getXObsCopySourceServerSideEncryptionCustomerAlgorithm,
                CopyObjectRequest::setXObsCopySourceServerSideEncryptionCustomerAlgorithm));
        builder.<String>withRequestField("x-obs-copy-source-server-side-encryption-customer-key",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CopyObjectRequest::getXObsCopySourceServerSideEncryptionCustomerKey,
                CopyObjectRequest::setXObsCopySourceServerSideEncryptionCustomerKey));
        builder.<String>withRequestField("x-obs-copy-source-server-side-encryption-customer-key-MD5",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CopyObjectRequest::getXObsCopySourceServerSideEncryptionCustomerKeyMD5,
                CopyObjectRequest::setXObsCopySourceServerSideEncryptionCustomerKeyMD5));
        builder.<String>withRequestField("success_action_redirect",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CopyObjectRequest::getSuccessActionRedirect,
                CopyObjectRequest::setSuccessActionRedirect));

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

    public static final HttpRequestDef<CreateBucketRequest, CreateBucketResponse> createBucket = genForCreateBucket();

    private static HttpRequestDef<CreateBucketRequest, CreateBucketResponse> genForCreateBucket() {
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
            f -> f.withMarshaller(CreateBucketRequest::getBucketName, CreateBucketRequest::setBucketName));
        builder.<String>withRequestField("Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateBucketRequest::getDate, CreateBucketRequest::setDate));
        builder.<String>withRequestField("x-obs-acl",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateBucketRequest::getXObsAcl, CreateBucketRequest::setXObsAcl));
        builder.<CreateBucketRequest.XObsStorageClassEnum>withRequestField("x-obs-storage-class",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CreateBucketRequest.XObsStorageClassEnum.class),
            f -> f.withMarshaller(CreateBucketRequest::getXObsStorageClass, CreateBucketRequest::setXObsStorageClass));
        builder.<String>withRequestField("x-obs-grant-read",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateBucketRequest::getXObsGrantRead, CreateBucketRequest::setXObsGrantRead));
        builder.<String>withRequestField("x-obs-grant-write",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateBucketRequest::getXObsGrantWrite, CreateBucketRequest::setXObsGrantWrite));
        builder.<String>withRequestField("x-obs-grant-read-acp",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateBucketRequest::getXObsGrantReadAcp, CreateBucketRequest::setXObsGrantReadAcp));
        builder.<String>withRequestField("x-obs-grant-write-acp",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateBucketRequest::getXObsGrantWriteAcp,
                CreateBucketRequest::setXObsGrantWriteAcp));
        builder.<String>withRequestField("x-obs-grant-full-control",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateBucketRequest::getXObsGrantFullControl,
                CreateBucketRequest::setXObsGrantFullControl));
        builder.<String>withRequestField("x-obs-grant-read-delivered",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateBucketRequest::getXObsGrantReadDelivered,
                CreateBucketRequest::setXObsGrantReadDelivered));
        builder.<String>withRequestField("x-obs-grant-full-control-delivered",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateBucketRequest::getXObsGrantFullControlDelivered,
                CreateBucketRequest::setXObsGrantFullControlDelivered));
        builder.<CreateBucketRequest.XObsAzRedundancyEnum>withRequestField("x-obs-az-redundancy",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CreateBucketRequest.XObsAzRedundancyEnum.class),
            f -> f.withMarshaller(CreateBucketRequest::getXObsAzRedundancy, CreateBucketRequest::setXObsAzRedundancy));
        builder.<CreateBucketRequest.XObsFsFileInterfaceEnum>withRequestField("x-obs-fs-file-interface",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CreateBucketRequest.XObsFsFileInterfaceEnum.class),
            f -> f.withMarshaller(CreateBucketRequest::getXObsFsFileInterface,
                CreateBucketRequest::setXObsFsFileInterface));
        builder.<String>withRequestField("x-obs-epid",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateBucketRequest::getXObsEpid, CreateBucketRequest::setXObsEpid));
        builder.<CreateBucketRequest.XObsClusterTypeEnum>withRequestField("x-obs-cluster-type",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CreateBucketRequest.XObsClusterTypeEnum.class),
            f -> f.withMarshaller(CreateBucketRequest::getXObsClusterType, CreateBucketRequest::setXObsClusterType));
        builder.<String>withRequestField("x-obs-location-clustergroup-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateBucketRequest::getXObsLocationClustergroupId,
                CreateBucketRequest::setXObsLocationClustergroupId));
        builder.<String>withRequestField("x-obs-ies-location",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateBucketRequest::getXObsIesLocation, CreateBucketRequest::setXObsIesLocation));
        builder.<CreateBucketRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CreateBucketRequestBody.class),
            f -> f.withMarshaller(CreateBucketRequest::getBody, CreateBucketRequest::setBody));

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

    public static final HttpRequestDef<DeleteBucketRequest, DeleteBucketResponse> deleteBucket = genForDeleteBucket();

    private static HttpRequestDef<DeleteBucketRequest, DeleteBucketResponse> genForDeleteBucket() {
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
            f -> f.withMarshaller(DeleteBucketRequest::getBucketName, DeleteBucketRequest::setBucketName));
        builder.<String>withRequestField("Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteBucketRequest::getDate, DeleteBucketRequest::setDate));

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
        genForDeleteBucketCustomdomain();

    private static HttpRequestDef<DeleteBucketCustomdomainRequest, DeleteBucketCustomdomainResponse> genForDeleteBucketCustomdomain() {
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
            f -> f.withMarshaller(DeleteBucketCustomdomainRequest::getBucketName,
                DeleteBucketCustomdomainRequest::setBucketName));
        builder.<String>withRequestField("customdomain",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteBucketCustomdomainRequest::getCustomdomain,
                DeleteBucketCustomdomainRequest::setCustomdomain));
        builder.<String>withRequestField("Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteBucketCustomdomainRequest::getDate, DeleteBucketCustomdomainRequest::setDate));

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

    public static final HttpRequestDef<DeleteObjectRequest, DeleteObjectResponse> deleteObject = genForDeleteObject();

    private static HttpRequestDef<DeleteObjectRequest, DeleteObjectResponse> genForDeleteObject() {
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
            f -> f.withMarshaller(DeleteObjectRequest::getObjectKey, DeleteObjectRequest::setObjectKey));
        builder.<String>withRequestField("bucket_name",
            LocationType.Cname,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteObjectRequest::getBucketName, DeleteObjectRequest::setBucketName));
        builder.<String>withRequestField("versionId",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteObjectRequest::getVersionId, DeleteObjectRequest::setVersionId));
        builder.<String>withRequestField("Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteObjectRequest::getDate, DeleteObjectRequest::setDate));

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
        genForDeleteObjects();

    private static HttpRequestDef<DeleteObjectsRequest, DeleteObjectsResponse> genForDeleteObjects() {
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
            f -> f.withMarshaller(DeleteObjectsRequest::getBucketName, DeleteObjectsRequest::setBucketName));
        builder.<String>withRequestField("delete",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteObjectsRequest::getDelete, DeleteObjectsRequest::setDelete));
        builder.<String>withRequestField("Content-MD5",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteObjectsRequest::getContentMD5, DeleteObjectsRequest::setContentMD5));
        builder.<String>withRequestField("Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteObjectsRequest::getDate, DeleteObjectsRequest::setDate));
        builder.<DeleteObjectsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteObjectsRequestBody.class),
            f -> f.withMarshaller(DeleteObjectsRequest::getBody, DeleteObjectsRequest::setBody));

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

    public static final HttpRequestDef<GetBucketAclRequest, GetBucketAclResponse> getBucketAcl = genForGetBucketAcl();

    private static HttpRequestDef<GetBucketAclRequest, GetBucketAclResponse> genForGetBucketAcl() {
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
            f -> f.withMarshaller(GetBucketAclRequest::getBucketName, GetBucketAclRequest::setBucketName));
        builder.<String>withRequestField("acl",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetBucketAclRequest::getAcl, GetBucketAclRequest::setAcl));
        builder.<String>withRequestField("Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetBucketAclRequest::getDate, GetBucketAclRequest::setDate));

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
        genForGetBucketCustomdomain();

    private static HttpRequestDef<GetBucketCustomdomainRequest, GetBucketCustomdomainResponse> genForGetBucketCustomdomain() {
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
            f -> f.withMarshaller(GetBucketCustomdomainRequest::getBucketName,
                GetBucketCustomdomainRequest::setBucketName));
        builder.<String>withRequestField("customdomain",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetBucketCustomdomainRequest::getCustomdomain,
                GetBucketCustomdomainRequest::setCustomdomain));
        builder.<String>withRequestField("Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetBucketCustomdomainRequest::getDate, GetBucketCustomdomainRequest::setDate));

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
        genForGetBucketMetadata();

    private static HttpRequestDef<GetBucketMetadataRequest, GetBucketMetadataResponse> genForGetBucketMetadata() {
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
            f -> f.withMarshaller(GetBucketMetadataRequest::getBucketName, GetBucketMetadataRequest::setBucketName));
        builder.<String>withRequestField("Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetBucketMetadataRequest::getDate, GetBucketMetadataRequest::setDate));
        builder.<String>withRequestField("Origin",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetBucketMetadataRequest::getOrigin, GetBucketMetadataRequest::setOrigin));
        builder.<String>withRequestField("Access-Control-Request-Headers",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetBucketMetadataRequest::getAccessControlRequestHeaders,
                GetBucketMetadataRequest::setAccessControlRequestHeaders));

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
        genForGetBucketNotification();

    private static HttpRequestDef<GetBucketNotificationRequest, GetBucketNotificationResponse> genForGetBucketNotification() {
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
            f -> f.withMarshaller(GetBucketNotificationRequest::getBucketName,
                GetBucketNotificationRequest::setBucketName));
        builder.<String>withRequestField("notification",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetBucketNotificationRequest::getNotification,
                GetBucketNotificationRequest::setNotification));
        builder.<String>withRequestField("Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetBucketNotificationRequest::getDate, GetBucketNotificationRequest::setDate));

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

    public static final HttpRequestDef<GetObjectRequest, GetObjectResponse> getObject = genForGetObject();

    private static HttpRequestDef<GetObjectRequest, GetObjectResponse> genForGetObject() {
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
            f -> f.withMarshaller(GetObjectRequest::getObjectKey, GetObjectRequest::setObjectKey));
        builder.<String>withRequestField("bucket_name",
            LocationType.Cname,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetObjectRequest::getBucketName, GetObjectRequest::setBucketName));
        builder.<String>withRequestField("response-content-type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetObjectRequest::getResponseContentType, GetObjectRequest::setResponseContentType));
        builder.<String>withRequestField("response-content-language",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetObjectRequest::getResponseContentLanguage,
                GetObjectRequest::setResponseContentLanguage));
        builder.<String>withRequestField("response-expires",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetObjectRequest::getResponseExpires, GetObjectRequest::setResponseExpires));
        builder.<String>withRequestField("response-cache-control",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetObjectRequest::getResponseCacheControl,
                GetObjectRequest::setResponseCacheControl));
        builder.<String>withRequestField("response-content-disposition",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetObjectRequest::getResponseContentDisposition,
                GetObjectRequest::setResponseContentDisposition));
        builder.<String>withRequestField("response-content-encoding",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetObjectRequest::getResponseContentEncoding,
                GetObjectRequest::setResponseContentEncoding));
        builder.<String>withRequestField("versionId",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetObjectRequest::getVersionId, GetObjectRequest::setVersionId));
        builder.<String>withRequestField("x-image-process",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetObjectRequest::getXImageProcess, GetObjectRequest::setXImageProcess));
        builder.<String>withRequestField("attname",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetObjectRequest::getAttname, GetObjectRequest::setAttname));
        builder.<String>withRequestField("Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetObjectRequest::getDate, GetObjectRequest::setDate));
        builder.<String>withRequestField("Range",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetObjectRequest::getRange, GetObjectRequest::setRange));
        builder.<String>withRequestField("If-Modified-Since",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetObjectRequest::getIfModifiedSince, GetObjectRequest::setIfModifiedSince));
        builder.<String>withRequestField("If-Unmodified-Since",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetObjectRequest::getIfUnmodifiedSince, GetObjectRequest::setIfUnmodifiedSince));
        builder.<String>withRequestField("If-Match",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetObjectRequest::getIfMatch, GetObjectRequest::setIfMatch));
        builder.<String>withRequestField("If-None-Match",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetObjectRequest::getIfNoneMatch, GetObjectRequest::setIfNoneMatch));
        builder.<String>withRequestField("x-obs-server-side-encryption-customer-algorithm",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetObjectRequest::getXObsServerSideEncryptionCustomerAlgorithm,
                GetObjectRequest::setXObsServerSideEncryptionCustomerAlgorithm));
        builder.<String>withRequestField("x-obs-server-side-encryption-customer-key",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetObjectRequest::getXObsServerSideEncryptionCustomerKey,
                GetObjectRequest::setXObsServerSideEncryptionCustomerKey));
        builder.<String>withRequestField("x-obs-server-side-encryption-customer-key-MD5",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetObjectRequest::getXObsServerSideEncryptionCustomerKeyMD5,
                GetObjectRequest::setXObsServerSideEncryptionCustomerKeyMD5));

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
        genForGetObjectMetadata();

    private static HttpRequestDef<GetObjectMetadataRequest, GetObjectMetadataResponse> genForGetObjectMetadata() {
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
            f -> f.withMarshaller(GetObjectMetadataRequest::getObjectKey, GetObjectMetadataRequest::setObjectKey));
        builder.<String>withRequestField("bucket_name",
            LocationType.Cname,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetObjectMetadataRequest::getBucketName, GetObjectMetadataRequest::setBucketName));
        builder.<String>withRequestField("versionId",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetObjectMetadataRequest::getVersionId, GetObjectMetadataRequest::setVersionId));
        builder.<String>withRequestField("Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetObjectMetadataRequest::getDate, GetObjectMetadataRequest::setDate));
        builder.<String>withRequestField("Origin",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetObjectMetadataRequest::getOrigin, GetObjectMetadataRequest::setOrigin));
        builder.<String>withRequestField("Access-Control-Request-Headers",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetObjectMetadataRequest::getAccessControlRequestHeaders,
                GetObjectMetadataRequest::setAccessControlRequestHeaders));
        builder.<String>withRequestField("x-obs-server-side-encryption-customer-algorithm",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetObjectMetadataRequest::getXObsServerSideEncryptionCustomerAlgorithm,
                GetObjectMetadataRequest::setXObsServerSideEncryptionCustomerAlgorithm));
        builder.<String>withRequestField("x-obs-server-side-encryption-customer-key",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetObjectMetadataRequest::getXObsServerSideEncryptionCustomerKey,
                GetObjectMetadataRequest::setXObsServerSideEncryptionCustomerKey));
        builder.<String>withRequestField("x-obs-server-side-encryption-customer-key-MD5",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetObjectMetadataRequest::getXObsServerSideEncryptionCustomerKeyMD5,
                GetObjectMetadataRequest::setXObsServerSideEncryptionCustomerKeyMD5));
        builder.<String>withRequestField("success-action-redirect",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetObjectMetadataRequest::getSuccessActionRedirect,
                GetObjectMetadataRequest::setSuccessActionRedirect));
        builder.<Integer>withRequestField("x-obs-expires",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(GetObjectMetadataRequest::getXObsExpires, GetObjectMetadataRequest::setXObsExpires));

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

    public static final HttpRequestDef<ListBucketsRequest, ListBucketsResponse> listBuckets = genForListBuckets();

    private static HttpRequestDef<ListBucketsRequest, ListBucketsResponse> genForListBuckets() {
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
            f -> f.withMarshaller(ListBucketsRequest::getDate, ListBucketsRequest::setDate));
        builder.<ListBucketsRequest.XObsBucketTypeEnum>withRequestField("x-obs-bucket-type",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListBucketsRequest.XObsBucketTypeEnum.class),
            f -> f.withMarshaller(ListBucketsRequest::getXObsBucketType, ListBucketsRequest::setXObsBucketType));

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

    public static final HttpRequestDef<ListObjectsRequest, ListObjectsResponse> listObjects = genForListObjects();

    private static HttpRequestDef<ListObjectsRequest, ListObjectsResponse> genForListObjects() {
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
            f -> f.withMarshaller(ListObjectsRequest::getBucketName, ListObjectsRequest::setBucketName));
        builder.<String>withRequestField("prefix",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListObjectsRequest::getPrefix, ListObjectsRequest::setPrefix));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListObjectsRequest::getMarker, ListObjectsRequest::setMarker));
        builder.<Integer>withRequestField("max-keys",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListObjectsRequest::getMaxKeys, ListObjectsRequest::setMaxKeys));
        builder.<String>withRequestField("delimiter",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListObjectsRequest::getDelimiter, ListObjectsRequest::setDelimiter));
        builder.<String>withRequestField("key-marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListObjectsRequest::getKeyMarker, ListObjectsRequest::setKeyMarker));
        builder.<String>withRequestField("version-id-marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListObjectsRequest::getVersionIdMarker, ListObjectsRequest::setVersionIdMarker));
        builder.<String>withRequestField("encoding-type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListObjectsRequest::getEncodingType, ListObjectsRequest::setEncodingType));
        builder.<String>withRequestField("Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListObjectsRequest::getDate, ListObjectsRequest::setDate));

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

    public static final HttpRequestDef<PutObjectRequest, PutObjectResponse> putObject = genForPutObject();

    private static HttpRequestDef<PutObjectRequest, PutObjectResponse> genForPutObject() {
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
            f -> f.withMarshaller(PutObjectRequest::getObjectKey, PutObjectRequest::setObjectKey));
        builder.<String>withRequestField("bucket_name",
            LocationType.Cname,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(PutObjectRequest::getBucketName, PutObjectRequest::setBucketName));
        builder.<String>withRequestField("Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(PutObjectRequest::getDate, PutObjectRequest::setDate));
        builder.<String>withRequestField("Content-MD5",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(PutObjectRequest::getContentMD5, PutObjectRequest::setContentMD5));
        builder.<String>withRequestField("x-obs-acl",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(PutObjectRequest::getXObsAcl, PutObjectRequest::setXObsAcl));
        builder.<String>withRequestField("x-obs-grant-read",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(PutObjectRequest::getXObsGrantRead, PutObjectRequest::setXObsGrantRead));
        builder.<String>withRequestField("x-obs-grant-read-acp",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(PutObjectRequest::getXObsGrantReadAcp, PutObjectRequest::setXObsGrantReadAcp));
        builder.<String>withRequestField("x-obs-grant-write-acp",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(PutObjectRequest::getXObsGrantWriteAcp, PutObjectRequest::setXObsGrantWriteAcp));
        builder.<String>withRequestField("x-obs-grant-full-control",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(PutObjectRequest::getXObsGrantFullControl,
                PutObjectRequest::setXObsGrantFullControl));
        builder.<PutObjectRequest.XObsStorageClassEnum>withRequestField("x-obs-storage-class",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(PutObjectRequest.XObsStorageClassEnum.class),
            f -> f.withMarshaller(PutObjectRequest::getXObsStorageClass, PutObjectRequest::setXObsStorageClass));
        builder.<String>withRequestField("x-obs-meta-xxx",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(PutObjectRequest::getXObsMetaXxx, PutObjectRequest::setXObsMetaXxx));
        builder.<String>withRequestField("x-obs-persistent-headers",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(PutObjectRequest::getXObsPersistentHeaders,
                PutObjectRequest::setXObsPersistentHeaders));
        builder.<String>withRequestField("x-obs-website-redirect-location",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(PutObjectRequest::getXObsWebsiteRedirectLocation,
                PutObjectRequest::setXObsWebsiteRedirectLocation));
        builder.<String>withRequestField("x-obs-server-side-encryption",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(PutObjectRequest::getXObsServerSideEncryption,
                PutObjectRequest::setXObsServerSideEncryption));
        builder.<String>withRequestField("x-obs-server-side-encryption-kms-key-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(PutObjectRequest::getXObsServerSideEncryptionKmsKeyId,
                PutObjectRequest::setXObsServerSideEncryptionKmsKeyId));
        builder.<String>withRequestField("x-obs-server-side-encryption-customer-algorithm",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(PutObjectRequest::getXObsServerSideEncryptionCustomerAlgorithm,
                PutObjectRequest::setXObsServerSideEncryptionCustomerAlgorithm));
        builder.<String>withRequestField("x-obs-server-side-encryption-customer-key",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(PutObjectRequest::getXObsServerSideEncryptionCustomerKey,
                PutObjectRequest::setXObsServerSideEncryptionCustomerKey));
        builder.<String>withRequestField("x-obs-server-side-encryption-customer-key-MD5",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(PutObjectRequest::getXObsServerSideEncryptionCustomerKeyMD5,
                PutObjectRequest::setXObsServerSideEncryptionCustomerKeyMD5));
        builder.<String>withRequestField("success-action-redirect",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(PutObjectRequest::getSuccessActionRedirect,
                PutObjectRequest::setSuccessActionRedirect));
        builder.<Integer>withRequestField("x-obs-expires",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(PutObjectRequest::getXObsExpires, PutObjectRequest::setXObsExpires));

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

    public static final HttpRequestDef<SetBucketAclRequest, SetBucketAclResponse> setBucketAcl = genForSetBucketAcl();

    private static HttpRequestDef<SetBucketAclRequest, SetBucketAclResponse> genForSetBucketAcl() {
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
            f -> f.withMarshaller(SetBucketAclRequest::getBucketName, SetBucketAclRequest::setBucketName));
        builder.<String>withRequestField("acl",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SetBucketAclRequest::getAcl, SetBucketAclRequest::setAcl));
        builder.<String>withRequestField("Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SetBucketAclRequest::getDate, SetBucketAclRequest::setDate));
        builder.<SetBucketAclRequest.XObsAclEnum>withRequestField("x-obs-acl",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(SetBucketAclRequest.XObsAclEnum.class),
            f -> f.withMarshaller(SetBucketAclRequest::getXObsAcl, SetBucketAclRequest::setXObsAcl));
        builder.<SetBucketAclRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(SetBucketAclRequestBody.class),
            f -> f.withMarshaller(SetBucketAclRequest::getBody, SetBucketAclRequest::setBody));

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
        genForSetBucketCustomedomain();

    private static HttpRequestDef<SetBucketCustomedomainRequest, SetBucketCustomedomainResponse> genForSetBucketCustomedomain() {
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
            f -> f.withMarshaller(SetBucketCustomedomainRequest::getBucketName,
                SetBucketCustomedomainRequest::setBucketName));
        builder.<String>withRequestField("customdomain",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SetBucketCustomedomainRequest::getCustomdomain,
                SetBucketCustomedomainRequest::setCustomdomain));
        builder.<String>withRequestField("Content-MD5",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SetBucketCustomedomainRequest::getContentMD5,
                SetBucketCustomedomainRequest::setContentMD5));
        builder.<String>withRequestField("Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SetBucketCustomedomainRequest::getDate, SetBucketCustomedomainRequest::setDate));
        builder.<SetBucketCustomDomainBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(SetBucketCustomDomainBody.class),
            f -> f.withMarshaller(SetBucketCustomedomainRequest::getBody, SetBucketCustomedomainRequest::setBody));

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
        genForSetBucketNotification();

    private static HttpRequestDef<SetBucketNotificationRequest, SetBucketNotificationResponse> genForSetBucketNotification() {
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
            f -> f.withMarshaller(SetBucketNotificationRequest::getBucketName,
                SetBucketNotificationRequest::setBucketName));
        builder.<String>withRequestField("notification",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SetBucketNotificationRequest::getNotification,
                SetBucketNotificationRequest::setNotification));
        builder.<String>withRequestField("Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SetBucketNotificationRequest::getDate, SetBucketNotificationRequest::setDate));
        builder.<SetBucketNotificationRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SetBucketNotificationRequestBody.class),
            f -> f.withMarshaller(SetBucketNotificationRequest::getBody, SetBucketNotificationRequest::setBody));

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
