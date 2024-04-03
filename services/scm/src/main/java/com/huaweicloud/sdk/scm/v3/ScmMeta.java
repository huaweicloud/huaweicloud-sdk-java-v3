package com.huaweicloud.sdk.scm.v3;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.scm.v3.model.ApplyCertificateRequest;
import com.huaweicloud.sdk.scm.v3.model.ApplyCertificateRequestBody;
import com.huaweicloud.sdk.scm.v3.model.ApplyCertificateResponse;
import com.huaweicloud.sdk.scm.v3.model.BatchPushCertificateRequest;
import com.huaweicloud.sdk.scm.v3.model.BatchPushCertificateRequestBody;
import com.huaweicloud.sdk.scm.v3.model.BatchPushCertificateResponse;
import com.huaweicloud.sdk.scm.v3.model.DeleteCertificateRequest;
import com.huaweicloud.sdk.scm.v3.model.DeleteCertificateResponse;
import com.huaweicloud.sdk.scm.v3.model.DeployCertificateRequest;
import com.huaweicloud.sdk.scm.v3.model.DeployCertificateRequestBody;
import com.huaweicloud.sdk.scm.v3.model.DeployCertificateResponse;
import com.huaweicloud.sdk.scm.v3.model.ExportCertificateRequest;
import com.huaweicloud.sdk.scm.v3.model.ExportCertificateResponse;
import com.huaweicloud.sdk.scm.v3.model.ImportCertificateRequest;
import com.huaweicloud.sdk.scm.v3.model.ImportCertificateRequestBody;
import com.huaweicloud.sdk.scm.v3.model.ImportCertificateResponse;
import com.huaweicloud.sdk.scm.v3.model.ListCertificatesRequest;
import com.huaweicloud.sdk.scm.v3.model.ListCertificatesResponse;
import com.huaweicloud.sdk.scm.v3.model.ListDeployedResourcesRequest;
import com.huaweicloud.sdk.scm.v3.model.ListDeployedResourcesRequestBody;
import com.huaweicloud.sdk.scm.v3.model.ListDeployedResourcesResponse;
import com.huaweicloud.sdk.scm.v3.model.PurchaseCertificateRequestBody;
import com.huaweicloud.sdk.scm.v3.model.PushCertificateRequest;
import com.huaweicloud.sdk.scm.v3.model.PushCertificateRequestBody;
import com.huaweicloud.sdk.scm.v3.model.PushCertificateResponse;
import com.huaweicloud.sdk.scm.v3.model.ShowCertificateRequest;
import com.huaweicloud.sdk.scm.v3.model.ShowCertificateResponse;
import com.huaweicloud.sdk.scm.v3.model.SubscribeCertificateRequest;
import com.huaweicloud.sdk.scm.v3.model.SubscribeCertificateResponse;
import com.huaweicloud.sdk.scm.v3.model.UnsubscribeCertificateRequest;
import com.huaweicloud.sdk.scm.v3.model.UnsubscribeCertificateResponse;

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

}
