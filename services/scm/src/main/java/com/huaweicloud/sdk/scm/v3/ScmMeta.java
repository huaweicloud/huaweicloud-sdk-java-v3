package com.huaweicloud.sdk.scm.v3;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.scm.v3.model.ApplyCertificateRequest;
import com.huaweicloud.sdk.scm.v3.model.ApplyCertificateRequestBody;
import com.huaweicloud.sdk.scm.v3.model.ApplyCertificateResponse;
import com.huaweicloud.sdk.scm.v3.model.BatchCreateOrDeleteTagsRequest;
import com.huaweicloud.sdk.scm.v3.model.BatchCreateOrDeleteTagsRequestBody;
import com.huaweicloud.sdk.scm.v3.model.BatchCreateOrDeleteTagsResponse;
import com.huaweicloud.sdk.scm.v3.model.BatchPushCertificateRequest;
import com.huaweicloud.sdk.scm.v3.model.BatchPushCertificateRequestBody;
import com.huaweicloud.sdk.scm.v3.model.BatchPushCertificateResponse;
import com.huaweicloud.sdk.scm.v3.model.CancelCertificateRequestRequest;
import com.huaweicloud.sdk.scm.v3.model.CancelCertificateRequestResponse;
import com.huaweicloud.sdk.scm.v3.model.CreateCertificateTagRequest;
import com.huaweicloud.sdk.scm.v3.model.CreateCertificateTagRequestBody;
import com.huaweicloud.sdk.scm.v3.model.CreateCertificateTagResponse;
import com.huaweicloud.sdk.scm.v3.model.CreateCsrRequest;
import com.huaweicloud.sdk.scm.v3.model.CreateCsrRequestBody;
import com.huaweicloud.sdk.scm.v3.model.CreateCsrResponse;
import com.huaweicloud.sdk.scm.v3.model.DeleteCertificateRequest;
import com.huaweicloud.sdk.scm.v3.model.DeleteCertificateResponse;
import com.huaweicloud.sdk.scm.v3.model.DeleteCsrRequest;
import com.huaweicloud.sdk.scm.v3.model.DeleteCsrResponse;
import com.huaweicloud.sdk.scm.v3.model.DeployCertificateRequest;
import com.huaweicloud.sdk.scm.v3.model.DeployCertificateRequestBody;
import com.huaweicloud.sdk.scm.v3.model.DeployCertificateResponse;
import com.huaweicloud.sdk.scm.v3.model.ExportCertificateRequest;
import com.huaweicloud.sdk.scm.v3.model.ExportCertificateResponse;
import com.huaweicloud.sdk.scm.v3.model.ImportCertificateRequest;
import com.huaweicloud.sdk.scm.v3.model.ImportCertificateRequestBody;
import com.huaweicloud.sdk.scm.v3.model.ImportCertificateResponse;
import com.huaweicloud.sdk.scm.v3.model.ListAllTagsRequest;
import com.huaweicloud.sdk.scm.v3.model.ListAllTagsResponse;
import com.huaweicloud.sdk.scm.v3.model.ListCertificatesByTagRequest;
import com.huaweicloud.sdk.scm.v3.model.ListCertificatesByTagRequestBody;
import com.huaweicloud.sdk.scm.v3.model.ListCertificatesByTagResponse;
import com.huaweicloud.sdk.scm.v3.model.ListCertificatesRequest;
import com.huaweicloud.sdk.scm.v3.model.ListCertificatesResponse;
import com.huaweicloud.sdk.scm.v3.model.ListCsrRequest;
import com.huaweicloud.sdk.scm.v3.model.ListCsrResponse;
import com.huaweicloud.sdk.scm.v3.model.ListDeployedResourcesRequest;
import com.huaweicloud.sdk.scm.v3.model.ListDeployedResourcesRequestBody;
import com.huaweicloud.sdk.scm.v3.model.ListDeployedResourcesResponse;
import com.huaweicloud.sdk.scm.v3.model.ListTagsByCertificateRequest;
import com.huaweicloud.sdk.scm.v3.model.ListTagsByCertificateResponse;
import com.huaweicloud.sdk.scm.v3.model.PurchaseCertificateRequestBody;
import com.huaweicloud.sdk.scm.v3.model.PushCertificateRequest;
import com.huaweicloud.sdk.scm.v3.model.PushCertificateRequestBody;
import com.huaweicloud.sdk.scm.v3.model.PushCertificateResponse;
import com.huaweicloud.sdk.scm.v3.model.ShowCertificateRequest;
import com.huaweicloud.sdk.scm.v3.model.ShowCertificateResponse;
import com.huaweicloud.sdk.scm.v3.model.ShowCsrPrivateKeyRequest;
import com.huaweicloud.sdk.scm.v3.model.ShowCsrPrivateKeyResponse;
import com.huaweicloud.sdk.scm.v3.model.ShowCsrRequest;
import com.huaweicloud.sdk.scm.v3.model.ShowCsrResponse;
import com.huaweicloud.sdk.scm.v3.model.SubscribeCertificateRequest;
import com.huaweicloud.sdk.scm.v3.model.SubscribeCertificateResponse;
import com.huaweicloud.sdk.scm.v3.model.UnsubscribeCertificateRequest;
import com.huaweicloud.sdk.scm.v3.model.UnsubscribeCertificateResponse;
import com.huaweicloud.sdk.scm.v3.model.UpdateCSRRequestBody;
import com.huaweicloud.sdk.scm.v3.model.UpdateCsrRequest;
import com.huaweicloud.sdk.scm.v3.model.UpdateCsrResponse;
import com.huaweicloud.sdk.scm.v3.model.UploadCsrRequest;
import com.huaweicloud.sdk.scm.v3.model.UploadCsrRequestBody;
import com.huaweicloud.sdk.scm.v3.model.UploadCsrResponse;

@SuppressWarnings("unchecked")
public class ScmMeta {

    public static final HttpRequestDef<ApplyCertificateRequest, ApplyCertificateResponse> applyCertificate =
        genForApplyCertificate();

    private static HttpRequestDef<ApplyCertificateRequest, ApplyCertificateResponse> genForApplyCertificate() {
        // basic
        HttpRequestDef.Builder<ApplyCertificateRequest, ApplyCertificateResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ApplyCertificateRequest.class, ApplyCertificateResponse.class)
                .withName("ApplyCertificate")
                .withUri("/v3/scm/certificates/{certificate_id}/apply")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("certificate_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ApplyCertificateRequest::getCertificateId,
                ApplyCertificateRequest::setCertificateId));
        builder.<ApplyCertificateRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ApplyCertificateRequestBody.class),
            f -> f.withMarshaller(ApplyCertificateRequest::getBody, ApplyCertificateRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchCreateOrDeleteTagsRequest, BatchCreateOrDeleteTagsResponse> batchCreateOrDeleteTags =
        genForBatchCreateOrDeleteTags();

    private static HttpRequestDef<BatchCreateOrDeleteTagsRequest, BatchCreateOrDeleteTagsResponse> genForBatchCreateOrDeleteTags() {
        // basic
        HttpRequestDef.Builder<BatchCreateOrDeleteTagsRequest, BatchCreateOrDeleteTagsResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, BatchCreateOrDeleteTagsRequest.class, BatchCreateOrDeleteTagsResponse.class)
            .withName("BatchCreateOrDeleteTags")
            .withUri("/v3/scm/{resource_id}/tags/action")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchCreateOrDeleteTagsRequest::getResourceId,
                BatchCreateOrDeleteTagsRequest::setResourceId));
        builder.<BatchCreateOrDeleteTagsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchCreateOrDeleteTagsRequestBody.class),
            f -> f.withMarshaller(BatchCreateOrDeleteTagsRequest::getBody, BatchCreateOrDeleteTagsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchPushCertificateRequest, BatchPushCertificateResponse> batchPushCertificate =
        genForBatchPushCertificate();

    private static HttpRequestDef<BatchPushCertificateRequest, BatchPushCertificateResponse> genForBatchPushCertificate() {
        // basic
        HttpRequestDef.Builder<BatchPushCertificateRequest, BatchPushCertificateResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, BatchPushCertificateRequest.class, BatchPushCertificateResponse.class)
            .withName("BatchPushCertificate")
            .withUri("/v3/scm/certificates/{certificate_id}/batch-push")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("certificate_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchPushCertificateRequest::getCertificateId,
                BatchPushCertificateRequest::setCertificateId));
        builder.<BatchPushCertificateRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchPushCertificateRequestBody.class),
            f -> f.withMarshaller(BatchPushCertificateRequest::getBody, BatchPushCertificateRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CancelCertificateRequestRequest, CancelCertificateRequestResponse> cancelCertificateRequest =
        genForCancelCertificateRequest();

    private static HttpRequestDef<CancelCertificateRequestRequest, CancelCertificateRequestResponse> genForCancelCertificateRequest() {
        // basic
        HttpRequestDef.Builder<CancelCertificateRequestRequest, CancelCertificateRequestResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, CancelCertificateRequestRequest.class, CancelCertificateRequestResponse.class)
                .withName("CancelCertificateRequest")
                .withUri("/v3/scm/certificates/{certificate_id}/cancel-cert")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("certificate_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CancelCertificateRequestRequest::getCertificateId,
                CancelCertificateRequestRequest::setCertificateId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateCertificateTagRequest, CreateCertificateTagResponse> createCertificateTag =
        genForCreateCertificateTag();

    private static HttpRequestDef<CreateCertificateTagRequest, CreateCertificateTagResponse> genForCreateCertificateTag() {
        // basic
        HttpRequestDef.Builder<CreateCertificateTagRequest, CreateCertificateTagResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateCertificateTagRequest.class, CreateCertificateTagResponse.class)
            .withName("CreateCertificateTag")
            .withUri("/v3/scm/{resource_id}/tags")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateCertificateTagRequest::getResourceId,
                CreateCertificateTagRequest::setResourceId));
        builder.<CreateCertificateTagRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateCertificateTagRequestBody.class),
            f -> f.withMarshaller(CreateCertificateTagRequest::getBody, CreateCertificateTagRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteCertificateRequest, DeleteCertificateResponse> deleteCertificate =
        genForDeleteCertificate();

    private static HttpRequestDef<DeleteCertificateRequest, DeleteCertificateResponse> genForDeleteCertificate() {
        // basic
        HttpRequestDef.Builder<DeleteCertificateRequest, DeleteCertificateResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteCertificateRequest.class, DeleteCertificateResponse.class)
                .withName("DeleteCertificate")
                .withUri("/v3/scm/certificates/{certificate_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("certificate_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteCertificateRequest::getCertificateId,
                DeleteCertificateRequest::setCertificateId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeployCertificateRequest, DeployCertificateResponse> deployCertificate =
        genForDeployCertificate();

    private static HttpRequestDef<DeployCertificateRequest, DeployCertificateResponse> genForDeployCertificate() {
        // basic
        HttpRequestDef.Builder<DeployCertificateRequest, DeployCertificateResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, DeployCertificateRequest.class, DeployCertificateResponse.class)
                .withName("DeployCertificate")
                .withUri("/v3/scm/certificates/{certificate_id}/deploy")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("certificate_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeployCertificateRequest::getCertificateId,
                DeployCertificateRequest::setCertificateId));
        builder.<DeployCertificateRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeployCertificateRequestBody.class),
            f -> f.withMarshaller(DeployCertificateRequest::getBody, DeployCertificateRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExportCertificateRequest, ExportCertificateResponse> exportCertificate =
        genForExportCertificate();

    private static HttpRequestDef<ExportCertificateRequest, ExportCertificateResponse> genForExportCertificate() {
        // basic
        HttpRequestDef.Builder<ExportCertificateRequest, ExportCertificateResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ExportCertificateRequest.class, ExportCertificateResponse.class)
                .withName("ExportCertificate")
                .withUri("/v3/scm/certificates/{certificate_id}/export")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("certificate_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportCertificateRequest::getCertificateId,
                ExportCertificateRequest::setCertificateId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ImportCertificateRequest, ImportCertificateResponse> importCertificate =
        genForImportCertificate();

    private static HttpRequestDef<ImportCertificateRequest, ImportCertificateResponse> genForImportCertificate() {
        // basic
        HttpRequestDef.Builder<ImportCertificateRequest, ImportCertificateResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ImportCertificateRequest.class, ImportCertificateResponse.class)
                .withName("ImportCertificate")
                .withUri("/v3/scm/certificates/import")
                .withContentType("application/json");

        // requests
        builder.<ImportCertificateRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ImportCertificateRequestBody.class),
            f -> f.withMarshaller(ImportCertificateRequest::getBody, ImportCertificateRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAllTagsRequest, ListAllTagsResponse> listAllTags = genForListAllTags();

    private static HttpRequestDef<ListAllTagsRequest, ListAllTagsResponse> genForListAllTags() {
        // basic
        HttpRequestDef.Builder<ListAllTagsRequest, ListAllTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAllTagsRequest.class, ListAllTagsResponse.class)
                .withName("ListAllTags")
                .withUri("/v3/scm/tags")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCertificatesRequest, ListCertificatesResponse> listCertificates =
        genForListCertificates();

    private static HttpRequestDef<ListCertificatesRequest, ListCertificatesResponse> genForListCertificates() {
        // basic
        HttpRequestDef.Builder<ListCertificatesRequest, ListCertificatesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListCertificatesRequest.class, ListCertificatesResponse.class)
                .withName("ListCertificates")
                .withUri("/v3/scm/certificates")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCertificatesRequest::getLimit, ListCertificatesRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCertificatesRequest::getOffset, ListCertificatesRequest::setOffset));
        builder.<String>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCertificatesRequest::getSortDir, ListCertificatesRequest::setSortDir));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCertificatesRequest::getSortKey, ListCertificatesRequest::setSortKey));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCertificatesRequest::getStatus, ListCertificatesRequest::setStatus));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCertificatesRequest::getEnterpriseProjectId,
                ListCertificatesRequest::setEnterpriseProjectId));
        builder.<Boolean>withRequestField("deploy_support",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListCertificatesRequest::getDeploySupport,
                ListCertificatesRequest::setDeploySupport));
        builder.<Boolean>withRequestField("owned_by_self",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListCertificatesRequest::getOwnedBySelf, ListCertificatesRequest::setOwnedBySelf));
        builder.<Integer>withRequestField("expired_days_since",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCertificatesRequest::getExpiredDaysSince,
                ListCertificatesRequest::setExpiredDaysSince));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCertificatesByTagRequest, ListCertificatesByTagResponse> listCertificatesByTag =
        genForListCertificatesByTag();

    private static HttpRequestDef<ListCertificatesByTagRequest, ListCertificatesByTagResponse> genForListCertificatesByTag() {
        // basic
        HttpRequestDef.Builder<ListCertificatesByTagRequest, ListCertificatesByTagResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ListCertificatesByTagRequest.class, ListCertificatesByTagResponse.class)
            .withName("ListCertificatesByTag")
            .withUri("/v3/scm/{resource_instances}/action")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("resource_instances",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCertificatesByTagRequest::getResourceInstances,
                ListCertificatesByTagRequest::setResourceInstances));
        builder.<ListCertificatesByTagRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListCertificatesByTagRequestBody.class),
            f -> f.withMarshaller(ListCertificatesByTagRequest::getBody, ListCertificatesByTagRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDeployedResourcesRequest, ListDeployedResourcesResponse> listDeployedResources =
        genForListDeployedResources();

    private static HttpRequestDef<ListDeployedResourcesRequest, ListDeployedResourcesResponse> genForListDeployedResources() {
        // basic
        HttpRequestDef.Builder<ListDeployedResourcesRequest, ListDeployedResourcesResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ListDeployedResourcesRequest.class, ListDeployedResourcesResponse.class)
            .withName("ListDeployedResources")
            .withUri("/v3/scm/deployed-resources")
            .withContentType("application/json");

        // requests
        builder.<ListDeployedResourcesRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListDeployedResourcesRequestBody.class),
            f -> f.withMarshaller(ListDeployedResourcesRequest::getBody, ListDeployedResourcesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTagsByCertificateRequest, ListTagsByCertificateResponse> listTagsByCertificate =
        genForListTagsByCertificate();

    private static HttpRequestDef<ListTagsByCertificateRequest, ListTagsByCertificateResponse> genForListTagsByCertificate() {
        // basic
        HttpRequestDef.Builder<ListTagsByCertificateRequest, ListTagsByCertificateResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListTagsByCertificateRequest.class, ListTagsByCertificateResponse.class)
            .withName("ListTagsByCertificate")
            .withUri("/v3/scm/{resource_id}/tags")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTagsByCertificateRequest::getResourceId,
                ListTagsByCertificateRequest::setResourceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<PushCertificateRequest, PushCertificateResponse> pushCertificate =
        genForPushCertificate();

    private static HttpRequestDef<PushCertificateRequest, PushCertificateResponse> genForPushCertificate() {
        // basic
        HttpRequestDef.Builder<PushCertificateRequest, PushCertificateResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, PushCertificateRequest.class, PushCertificateResponse.class)
                .withName("PushCertificate")
                .withUri("/v3/scm/certificates/{certificate_id}/push")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("certificate_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(PushCertificateRequest::getCertificateId, PushCertificateRequest::setCertificateId));
        builder.<PushCertificateRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PushCertificateRequestBody.class),
            f -> f.withMarshaller(PushCertificateRequest::getBody, PushCertificateRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowCertificateRequest, ShowCertificateResponse> showCertificate =
        genForShowCertificate();

    private static HttpRequestDef<ShowCertificateRequest, ShowCertificateResponse> genForShowCertificate() {
        // basic
        HttpRequestDef.Builder<ShowCertificateRequest, ShowCertificateResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowCertificateRequest.class, ShowCertificateResponse.class)
                .withName("ShowCertificate")
                .withUri("/v3/scm/certificates/{certificate_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("certificate_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCertificateRequest::getCertificateId, ShowCertificateRequest::setCertificateId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SubscribeCertificateRequest, SubscribeCertificateResponse> subscribeCertificate =
        genForSubscribeCertificate();

    private static HttpRequestDef<SubscribeCertificateRequest, SubscribeCertificateResponse> genForSubscribeCertificate() {
        // basic
        HttpRequestDef.Builder<SubscribeCertificateRequest, SubscribeCertificateResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, SubscribeCertificateRequest.class, SubscribeCertificateResponse.class)
            .withName("SubscribeCertificate")
            .withUri("/v3/scm/certificates/buy")
            .withContentType("application/json");

        // requests
        builder.<PurchaseCertificateRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PurchaseCertificateRequestBody.class),
            f -> f.withMarshaller(SubscribeCertificateRequest::getBody, SubscribeCertificateRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UnsubscribeCertificateRequest, UnsubscribeCertificateResponse> unsubscribeCertificate =
        genForUnsubscribeCertificate();

    private static HttpRequestDef<UnsubscribeCertificateRequest, UnsubscribeCertificateResponse> genForUnsubscribeCertificate() {
        // basic
        HttpRequestDef.Builder<UnsubscribeCertificateRequest, UnsubscribeCertificateResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, UnsubscribeCertificateRequest.class, UnsubscribeCertificateResponse.class)
            .withName("UnsubscribeCertificate")
            .withUri("/v3/scm/certificates/{cert_id}/unsubscribe")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cert_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UnsubscribeCertificateRequest::getCertId, UnsubscribeCertificateRequest::setCertId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateCsrRequest, CreateCsrResponse> createCsr = genForCreateCsr();

    private static HttpRequestDef<CreateCsrRequest, CreateCsrResponse> genForCreateCsr() {
        // basic
        HttpRequestDef.Builder<CreateCsrRequest, CreateCsrResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateCsrRequest.class, CreateCsrResponse.class)
                .withName("CreateCsr")
                .withUri("/v3/scm/csr")
                .withContentType("application/json");

        // requests
        builder.<CreateCsrRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateCsrRequestBody.class),
            f -> f.withMarshaller(CreateCsrRequest::getBody, CreateCsrRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteCsrRequest, DeleteCsrResponse> deleteCsr = genForDeleteCsr();

    private static HttpRequestDef<DeleteCsrRequest, DeleteCsrResponse> genForDeleteCsr() {
        // basic
        HttpRequestDef.Builder<DeleteCsrRequest, DeleteCsrResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteCsrRequest.class, DeleteCsrResponse.class)
                .withName("DeleteCsr")
                .withUri("/v3/scm/csr/{id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteCsrRequest::getId, DeleteCsrRequest::setId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCsrRequest, ListCsrResponse> listCsr = genForListCsr();

    private static HttpRequestDef<ListCsrRequest, ListCsrResponse> genForListCsr() {
        // basic
        HttpRequestDef.Builder<ListCsrRequest, ListCsrResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListCsrRequest.class, ListCsrResponse.class)
                .withName("ListCsr")
                .withUri("/v3/scm/csr")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCsrRequest::getLimit, ListCsrRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCsrRequest::getOffset, ListCsrRequest::setOffset));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCsrRequest::getName, ListCsrRequest::setName));
        builder.<String>withRequestField("private_key_algo",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCsrRequest::getPrivateKeyAlgo, ListCsrRequest::setPrivateKeyAlgo));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowCsrRequest, ShowCsrResponse> showCsr = genForShowCsr();

    private static HttpRequestDef<ShowCsrRequest, ShowCsrResponse> genForShowCsr() {
        // basic
        HttpRequestDef.Builder<ShowCsrRequest, ShowCsrResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowCsrRequest.class, ShowCsrResponse.class)
                .withName("ShowCsr")
                .withUri("/v3/scm/csr/{id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCsrRequest::getId, ShowCsrRequest::setId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowCsrPrivateKeyRequest, ShowCsrPrivateKeyResponse> showCsrPrivateKey =
        genForShowCsrPrivateKey();

    private static HttpRequestDef<ShowCsrPrivateKeyRequest, ShowCsrPrivateKeyResponse> genForShowCsrPrivateKey() {
        // basic
        HttpRequestDef.Builder<ShowCsrPrivateKeyRequest, ShowCsrPrivateKeyResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowCsrPrivateKeyRequest.class, ShowCsrPrivateKeyResponse.class)
                .withName("ShowCsrPrivateKey")
                .withUri("/v3/scm/csr/{id}/private-key")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCsrPrivateKeyRequest::getId, ShowCsrPrivateKeyRequest::setId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateCsrRequest, UpdateCsrResponse> updateCsr = genForUpdateCsr();

    private static HttpRequestDef<UpdateCsrRequest, UpdateCsrResponse> genForUpdateCsr() {
        // basic
        HttpRequestDef.Builder<UpdateCsrRequest, UpdateCsrResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateCsrRequest.class, UpdateCsrResponse.class)
                .withName("UpdateCsr")
                .withUri("/v3/scm/csr/{id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateCsrRequest::getId, UpdateCsrRequest::setId));
        builder.<UpdateCSRRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateCSRRequestBody.class),
            f -> f.withMarshaller(UpdateCsrRequest::getBody, UpdateCsrRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UploadCsrRequest, UploadCsrResponse> uploadCsr = genForUploadCsr();

    private static HttpRequestDef<UploadCsrRequest, UploadCsrResponse> genForUploadCsr() {
        // basic
        HttpRequestDef.Builder<UploadCsrRequest, UploadCsrResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UploadCsrRequest.class, UploadCsrResponse.class)
                .withName("UploadCsr")
                .withUri("/v3/scm/csr/upload")
                .withContentType("application/json");

        // requests
        builder.<UploadCsrRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UploadCsrRequestBody.class),
            f -> f.withMarshaller(UploadCsrRequest::getBody, UploadCsrRequest::setBody));

        // response

        return builder.build();
    }

}
