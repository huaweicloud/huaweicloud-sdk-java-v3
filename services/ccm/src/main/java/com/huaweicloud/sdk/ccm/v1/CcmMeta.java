package com.huaweicloud.sdk.ccm.v1;

import com.huaweicloud.sdk.ccm.v1.model.BatchCreateCaTagsRequest;
import com.huaweicloud.sdk.ccm.v1.model.BatchCreateCaTagsResponse;
import com.huaweicloud.sdk.ccm.v1.model.BatchCreateCertTagsRequest;
import com.huaweicloud.sdk.ccm.v1.model.BatchCreateCertTagsResponse;
import com.huaweicloud.sdk.ccm.v1.model.BatchDeleteCaTagsRequest;
import com.huaweicloud.sdk.ccm.v1.model.BatchDeleteCaTagsResponse;
import com.huaweicloud.sdk.ccm.v1.model.BatchDeleteCertTagsRequest;
import com.huaweicloud.sdk.ccm.v1.model.BatchDeleteCertTagsResponse;
import com.huaweicloud.sdk.ccm.v1.model.BatchOperateTagRequestBody;
import com.huaweicloud.sdk.ccm.v1.model.CountCaResourceInstancesRequest;
import com.huaweicloud.sdk.ccm.v1.model.CountCaResourceInstancesResponse;
import com.huaweicloud.sdk.ccm.v1.model.CountCertResourceInstancesRequest;
import com.huaweicloud.sdk.ccm.v1.model.CountCertResourceInstancesResponse;
import com.huaweicloud.sdk.ccm.v1.model.CreateAgencyRequest;
import com.huaweicloud.sdk.ccm.v1.model.CreateAgencyResponse;
import com.huaweicloud.sdk.ccm.v1.model.CreateCaTagRequest;
import com.huaweicloud.sdk.ccm.v1.model.CreateCaTagResponse;
import com.huaweicloud.sdk.ccm.v1.model.CreateCertTagRequest;
import com.huaweicloud.sdk.ccm.v1.model.CreateCertTagResponse;
import com.huaweicloud.sdk.ccm.v1.model.CreateCertificateAuthorityObsAgencyRequest;
import com.huaweicloud.sdk.ccm.v1.model.CreateCertificateAuthorityObsAgencyResponse;
import com.huaweicloud.sdk.ccm.v1.model.CreateCertificateAuthorityOrderRequest;
import com.huaweicloud.sdk.ccm.v1.model.CreateCertificateAuthorityOrderRequestBody;
import com.huaweicloud.sdk.ccm.v1.model.CreateCertificateAuthorityOrderResponse;
import com.huaweicloud.sdk.ccm.v1.model.CreateCertificateAuthorityRequest;
import com.huaweicloud.sdk.ccm.v1.model.CreateCertificateAuthorityRequestBody;
import com.huaweicloud.sdk.ccm.v1.model.CreateCertificateAuthorityResponse;
import com.huaweicloud.sdk.ccm.v1.model.CreateCertificateByCsrRequest;
import com.huaweicloud.sdk.ccm.v1.model.CreateCertificateByCsrRequestBody;
import com.huaweicloud.sdk.ccm.v1.model.CreateCertificateByCsrResponse;
import com.huaweicloud.sdk.ccm.v1.model.CreateCertificateRequest;
import com.huaweicloud.sdk.ccm.v1.model.CreateCertificateRequestBody;
import com.huaweicloud.sdk.ccm.v1.model.CreateCertificateResponse;
import com.huaweicloud.sdk.ccm.v1.model.DeleteCertificateAuthorityRequest;
import com.huaweicloud.sdk.ccm.v1.model.DeleteCertificateAuthorityResponse;
import com.huaweicloud.sdk.ccm.v1.model.DeleteCertificateRequest;
import com.huaweicloud.sdk.ccm.v1.model.DeleteCertificateResponse;
import com.huaweicloud.sdk.ccm.v1.model.DisableCertificateAuthorityCrlRequest;
import com.huaweicloud.sdk.ccm.v1.model.DisableCertificateAuthorityCrlResponse;
import com.huaweicloud.sdk.ccm.v1.model.DisableCertificateAuthorityRequest;
import com.huaweicloud.sdk.ccm.v1.model.DisableCertificateAuthorityResponse;
import com.huaweicloud.sdk.ccm.v1.model.EnableCertificateAuthorityCrlRequest;
import com.huaweicloud.sdk.ccm.v1.model.EnableCertificateAuthorityCrlRequestBody;
import com.huaweicloud.sdk.ccm.v1.model.EnableCertificateAuthorityCrlResponse;
import com.huaweicloud.sdk.ccm.v1.model.EnableCertificateAuthorityRequest;
import com.huaweicloud.sdk.ccm.v1.model.EnableCertificateAuthorityResponse;
import com.huaweicloud.sdk.ccm.v1.model.ExportCertificateAuthorityCertificateRequest;
import com.huaweicloud.sdk.ccm.v1.model.ExportCertificateAuthorityCertificateResponse;
import com.huaweicloud.sdk.ccm.v1.model.ExportCertificateAuthorityCsrRequest;
import com.huaweicloud.sdk.ccm.v1.model.ExportCertificateAuthorityCsrResponse;
import com.huaweicloud.sdk.ccm.v1.model.ExportCertificateRequest;
import com.huaweicloud.sdk.ccm.v1.model.ExportCertificateRequestBody;
import com.huaweicloud.sdk.ccm.v1.model.ExportCertificateResponse;
import com.huaweicloud.sdk.ccm.v1.model.ImportCertificateAuthorityCertificateRequest;
import com.huaweicloud.sdk.ccm.v1.model.ImportCertificateAuthorityCertificateRequestBody;
import com.huaweicloud.sdk.ccm.v1.model.ImportCertificateAuthorityCertificateResponse;
import com.huaweicloud.sdk.ccm.v1.model.IssueCertificateAuthorityCertificateRequest;
import com.huaweicloud.sdk.ccm.v1.model.IssueCertificateAuthorityCertificateRequestBody;
import com.huaweicloud.sdk.ccm.v1.model.IssueCertificateAuthorityCertificateResponse;
import com.huaweicloud.sdk.ccm.v1.model.ListCaResourceInstancesRequest;
import com.huaweicloud.sdk.ccm.v1.model.ListCaResourceInstancesResponse;
import com.huaweicloud.sdk.ccm.v1.model.ListCaTagsRequest;
import com.huaweicloud.sdk.ccm.v1.model.ListCaTagsResponse;
import com.huaweicloud.sdk.ccm.v1.model.ListCertResourceInstancesRequest;
import com.huaweicloud.sdk.ccm.v1.model.ListCertResourceInstancesResponse;
import com.huaweicloud.sdk.ccm.v1.model.ListCertTagsRequest;
import com.huaweicloud.sdk.ccm.v1.model.ListCertTagsResponse;
import com.huaweicloud.sdk.ccm.v1.model.ListCertificateAuthorityObsBucketRequest;
import com.huaweicloud.sdk.ccm.v1.model.ListCertificateAuthorityObsBucketResponse;
import com.huaweicloud.sdk.ccm.v1.model.ListCertificateAuthorityRequest;
import com.huaweicloud.sdk.ccm.v1.model.ListCertificateAuthorityResponse;
import com.huaweicloud.sdk.ccm.v1.model.ListCertificateRequest;
import com.huaweicloud.sdk.ccm.v1.model.ListCertificateResponse;
import com.huaweicloud.sdk.ccm.v1.model.ListDomainCaTagsRequest;
import com.huaweicloud.sdk.ccm.v1.model.ListDomainCaTagsResponse;
import com.huaweicloud.sdk.ccm.v1.model.ListDomainCertTagsRequest;
import com.huaweicloud.sdk.ccm.v1.model.ListDomainCertTagsResponse;
import com.huaweicloud.sdk.ccm.v1.model.ListResourceInstancesRequestBody;
import com.huaweicloud.sdk.ccm.v1.model.ParseCertificateSigningRequestRequest;
import com.huaweicloud.sdk.ccm.v1.model.ParseCertificateSigningRequestRequestBody;
import com.huaweicloud.sdk.ccm.v1.model.ParseCertificateSigningRequestResponse;
import com.huaweicloud.sdk.ccm.v1.model.ResourceTagRequestBody;
import com.huaweicloud.sdk.ccm.v1.model.RestoreCertificateAuthorityRequest;
import com.huaweicloud.sdk.ccm.v1.model.RestoreCertificateAuthorityResponse;
import com.huaweicloud.sdk.ccm.v1.model.RevokeCertificateAuthorityRequest;
import com.huaweicloud.sdk.ccm.v1.model.RevokeCertificateAuthorityResponse;
import com.huaweicloud.sdk.ccm.v1.model.RevokeCertificateRequest;
import com.huaweicloud.sdk.ccm.v1.model.RevokeCertificateRequestBody;
import com.huaweicloud.sdk.ccm.v1.model.RevokeCertificateResponse;
import com.huaweicloud.sdk.ccm.v1.model.ShowAgencyRequest;
import com.huaweicloud.sdk.ccm.v1.model.ShowAgencyResponse;
import com.huaweicloud.sdk.ccm.v1.model.ShowCertificateAuthorityObsAgencyRequest;
import com.huaweicloud.sdk.ccm.v1.model.ShowCertificateAuthorityObsAgencyResponse;
import com.huaweicloud.sdk.ccm.v1.model.ShowCertificateAuthorityQuotaRequest;
import com.huaweicloud.sdk.ccm.v1.model.ShowCertificateAuthorityQuotaResponse;
import com.huaweicloud.sdk.ccm.v1.model.ShowCertificateAuthorityRequest;
import com.huaweicloud.sdk.ccm.v1.model.ShowCertificateAuthorityResponse;
import com.huaweicloud.sdk.ccm.v1.model.ShowCertificateQuotaRequest;
import com.huaweicloud.sdk.ccm.v1.model.ShowCertificateQuotaResponse;
import com.huaweicloud.sdk.ccm.v1.model.ShowCertificateRequest;
import com.huaweicloud.sdk.ccm.v1.model.ShowCertificateResponse;
import com.huaweicloud.sdk.ccm.v1.model.ShowConsoleConfigRequest;
import com.huaweicloud.sdk.ccm.v1.model.ShowConsoleConfigResponse;
import com.huaweicloud.sdk.ccm.v1.model.UpdateOcspSwitchRequest;
import com.huaweicloud.sdk.ccm.v1.model.UpdateOcspSwitchRequestBody;
import com.huaweicloud.sdk.ccm.v1.model.UpdateOcspSwitchResponse;
import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;

@SuppressWarnings("unchecked")
public class CcmMeta {

    public static final HttpRequestDef<BatchCreateCaTagsRequest, BatchCreateCaTagsResponse> batchCreateCaTags =
        genForBatchCreateCaTags();

    private static HttpRequestDef<BatchCreateCaTagsRequest, BatchCreateCaTagsResponse> genForBatchCreateCaTags() {
        // basic
        HttpRequestDef.Builder<BatchCreateCaTagsRequest, BatchCreateCaTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchCreateCaTagsRequest.class, BatchCreateCaTagsResponse.class)
                .withName("BatchCreateCaTags")
                .withUri("/v1/private-certificate-authorities/{ca_id}/tags/create")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("ca_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchCreateCaTagsRequest::getCaId, BatchCreateCaTagsRequest::setCaId));
        builder.<BatchOperateTagRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchOperateTagRequestBody.class),
            f -> f.withMarshaller(BatchCreateCaTagsRequest::getBody, BatchCreateCaTagsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchCreateCertTagsRequest, BatchCreateCertTagsResponse> batchCreateCertTags =
        genForBatchCreateCertTags();

    private static HttpRequestDef<BatchCreateCertTagsRequest, BatchCreateCertTagsResponse> genForBatchCreateCertTags() {
        // basic
        HttpRequestDef.Builder<BatchCreateCertTagsRequest, BatchCreateCertTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchCreateCertTagsRequest.class, BatchCreateCertTagsResponse.class)
                .withName("BatchCreateCertTags")
                .withUri("/v1/private-certificates/{certificate_id}/tags/create")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("certificate_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchCreateCertTagsRequest::getCertificateId,
                BatchCreateCertTagsRequest::setCertificateId));
        builder.<BatchOperateTagRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchOperateTagRequestBody.class),
            f -> f.withMarshaller(BatchCreateCertTagsRequest::getBody, BatchCreateCertTagsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteCaTagsRequest, BatchDeleteCaTagsResponse> batchDeleteCaTags =
        genForBatchDeleteCaTags();

    private static HttpRequestDef<BatchDeleteCaTagsRequest, BatchDeleteCaTagsResponse> genForBatchDeleteCaTags() {
        // basic
        HttpRequestDef.Builder<BatchDeleteCaTagsRequest, BatchDeleteCaTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, BatchDeleteCaTagsRequest.class, BatchDeleteCaTagsResponse.class)
                .withName("BatchDeleteCaTags")
                .withUri("/v1/private-certificate-authorities/{ca_id}/tags/delete")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("ca_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeleteCaTagsRequest::getCaId, BatchDeleteCaTagsRequest::setCaId));
        builder.<BatchOperateTagRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchOperateTagRequestBody.class),
            f -> f.withMarshaller(BatchDeleteCaTagsRequest::getBody, BatchDeleteCaTagsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteCertTagsRequest, BatchDeleteCertTagsResponse> batchDeleteCertTags =
        genForBatchDeleteCertTags();

    private static HttpRequestDef<BatchDeleteCertTagsRequest, BatchDeleteCertTagsResponse> genForBatchDeleteCertTags() {
        // basic
        HttpRequestDef.Builder<BatchDeleteCertTagsRequest, BatchDeleteCertTagsResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, BatchDeleteCertTagsRequest.class, BatchDeleteCertTagsResponse.class)
            .withName("BatchDeleteCertTags")
            .withUri("/v1/private-certificates/{certificate_id}/tags/delete")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("certificate_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeleteCertTagsRequest::getCertificateId,
                BatchDeleteCertTagsRequest::setCertificateId));
        builder.<BatchOperateTagRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchOperateTagRequestBody.class),
            f -> f.withMarshaller(BatchDeleteCertTagsRequest::getBody, BatchDeleteCertTagsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CountCaResourceInstancesRequest, CountCaResourceInstancesResponse> countCaResourceInstances =
        genForCountCaResourceInstances();

    private static HttpRequestDef<CountCaResourceInstancesRequest, CountCaResourceInstancesResponse> genForCountCaResourceInstances() {
        // basic
        HttpRequestDef.Builder<CountCaResourceInstancesRequest, CountCaResourceInstancesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, CountCaResourceInstancesRequest.class, CountCaResourceInstancesResponse.class)
                .withName("CountCaResourceInstances")
                .withUri("/v1/private-certificate-authorities/resource-instances/count")
                .withContentType("application/json");

        // requests
        builder.<ListResourceInstancesRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListResourceInstancesRequestBody.class),
            f -> f.withMarshaller(CountCaResourceInstancesRequest::getBody, CountCaResourceInstancesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CountCertResourceInstancesRequest, CountCertResourceInstancesResponse> countCertResourceInstances =
        genForCountCertResourceInstances();

    private static HttpRequestDef<CountCertResourceInstancesRequest, CountCertResourceInstancesResponse> genForCountCertResourceInstances() {
        // basic
        HttpRequestDef.Builder<CountCertResourceInstancesRequest, CountCertResourceInstancesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CountCertResourceInstancesRequest.class,
                    CountCertResourceInstancesResponse.class)
                .withName("CountCertResourceInstances")
                .withUri("/v1/private-certificates/resource-instances/count")
                .withContentType("application/json");

        // requests
        builder.<ListResourceInstancesRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListResourceInstancesRequestBody.class),
            f -> f.withMarshaller(CountCertResourceInstancesRequest::getBody,
                CountCertResourceInstancesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateAgencyRequest, CreateAgencyResponse> createAgency = genForCreateAgency();

    private static HttpRequestDef<CreateAgencyRequest, CreateAgencyResponse> genForCreateAgency() {
        // basic
        HttpRequestDef.Builder<CreateAgencyRequest, CreateAgencyResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateAgencyRequest.class, CreateAgencyResponse.class)
                .withName("CreateAgency")
                .withUri("/v1/private-certificate-authorities/agencies")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateCaTagRequest, CreateCaTagResponse> createCaTag = genForCreateCaTag();

    private static HttpRequestDef<CreateCaTagRequest, CreateCaTagResponse> genForCreateCaTag() {
        // basic
        HttpRequestDef.Builder<CreateCaTagRequest, CreateCaTagResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateCaTagRequest.class, CreateCaTagResponse.class)
                .withName("CreateCaTag")
                .withUri("/v1/private-certificate-authorities/{ca_id}/tags")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("ca_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateCaTagRequest::getCaId, CreateCaTagRequest::setCaId));
        builder.<ResourceTagRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ResourceTagRequestBody.class),
            f -> f.withMarshaller(CreateCaTagRequest::getBody, CreateCaTagRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateCertTagRequest, CreateCertTagResponse> createCertTag =
        genForCreateCertTag();

    private static HttpRequestDef<CreateCertTagRequest, CreateCertTagResponse> genForCreateCertTag() {
        // basic
        HttpRequestDef.Builder<CreateCertTagRequest, CreateCertTagResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateCertTagRequest.class, CreateCertTagResponse.class)
                .withName("CreateCertTag")
                .withUri("/v1/private-certificates/{certificate_id}/tags")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("certificate_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateCertTagRequest::getCertificateId, CreateCertTagRequest::setCertificateId));
        builder.<ResourceTagRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ResourceTagRequestBody.class),
            f -> f.withMarshaller(CreateCertTagRequest::getBody, CreateCertTagRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateCertificateRequest, CreateCertificateResponse> createCertificate =
        genForCreateCertificate();

    private static HttpRequestDef<CreateCertificateRequest, CreateCertificateResponse> genForCreateCertificate() {
        // basic
        HttpRequestDef.Builder<CreateCertificateRequest, CreateCertificateResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateCertificateRequest.class, CreateCertificateResponse.class)
                .withName("CreateCertificate")
                .withUri("/v1/private-certificates")
                .withContentType("application/json");

        // requests
        builder.<CreateCertificateRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateCertificateRequestBody.class),
            f -> f.withMarshaller(CreateCertificateRequest::getBody, CreateCertificateRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateCertificateAuthorityObsAgencyRequest, CreateCertificateAuthorityObsAgencyResponse> createCertificateAuthorityObsAgency =
        genForCreateCertificateAuthorityObsAgency();

    private static HttpRequestDef<CreateCertificateAuthorityObsAgencyRequest, CreateCertificateAuthorityObsAgencyResponse> genForCreateCertificateAuthorityObsAgency() {
        // basic
        HttpRequestDef.Builder<CreateCertificateAuthorityObsAgencyRequest, CreateCertificateAuthorityObsAgencyResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateCertificateAuthorityObsAgencyRequest.class,
                    CreateCertificateAuthorityObsAgencyResponse.class)
                .withName("CreateCertificateAuthorityObsAgency")
                .withUri("/v1/private-certificate-authorities/obs/agencies")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateCertificateAuthorityOrderRequest, CreateCertificateAuthorityOrderResponse> createCertificateAuthorityOrder =
        genForCreateCertificateAuthorityOrder();

    private static HttpRequestDef<CreateCertificateAuthorityOrderRequest, CreateCertificateAuthorityOrderResponse> genForCreateCertificateAuthorityOrder() {
        // basic
        HttpRequestDef.Builder<CreateCertificateAuthorityOrderRequest, CreateCertificateAuthorityOrderResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateCertificateAuthorityOrderRequest.class,
                    CreateCertificateAuthorityOrderResponse.class)
                .withName("CreateCertificateAuthorityOrder")
                .withUri("/v1/private-certificate-authorities/order")
                .withContentType("application/json");

        // requests
        builder.<CreateCertificateAuthorityOrderRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateCertificateAuthorityOrderRequestBody.class),
            f -> f.withMarshaller(CreateCertificateAuthorityOrderRequest::getBody,
                CreateCertificateAuthorityOrderRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateCertificateByCsrRequest, CreateCertificateByCsrResponse> createCertificateByCsr =
        genForCreateCertificateByCsr();

    private static HttpRequestDef<CreateCertificateByCsrRequest, CreateCertificateByCsrResponse> genForCreateCertificateByCsr() {
        // basic
        HttpRequestDef.Builder<CreateCertificateByCsrRequest, CreateCertificateByCsrResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateCertificateByCsrRequest.class, CreateCertificateByCsrResponse.class)
            .withName("CreateCertificateByCsr")
            .withUri("/v1/private-certificates/csr")
            .withContentType("application/json");

        // requests
        builder.<CreateCertificateByCsrRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateCertificateByCsrRequestBody.class),
            f -> f.withMarshaller(CreateCertificateByCsrRequest::getBody, CreateCertificateByCsrRequest::setBody));

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
                .withUri("/v1/private-certificates/{certificate_id}")
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

    public static final HttpRequestDef<DisableCertificateAuthorityCrlRequest, DisableCertificateAuthorityCrlResponse> disableCertificateAuthorityCrl =
        genForDisableCertificateAuthorityCrl();

    private static HttpRequestDef<DisableCertificateAuthorityCrlRequest, DisableCertificateAuthorityCrlResponse> genForDisableCertificateAuthorityCrl() {
        // basic
        HttpRequestDef.Builder<DisableCertificateAuthorityCrlRequest, DisableCertificateAuthorityCrlResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    DisableCertificateAuthorityCrlRequest.class,
                    DisableCertificateAuthorityCrlResponse.class)
                .withName("DisableCertificateAuthorityCrl")
                .withUri("/v1/private-certificate-authorities/{ca_id}/crl/disable")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("ca_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DisableCertificateAuthorityCrlRequest::getCaId,
                DisableCertificateAuthorityCrlRequest::setCaId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<EnableCertificateAuthorityCrlRequest, EnableCertificateAuthorityCrlResponse> enableCertificateAuthorityCrl =
        genForEnableCertificateAuthorityCrl();

    private static HttpRequestDef<EnableCertificateAuthorityCrlRequest, EnableCertificateAuthorityCrlResponse> genForEnableCertificateAuthorityCrl() {
        // basic
        HttpRequestDef.Builder<EnableCertificateAuthorityCrlRequest, EnableCertificateAuthorityCrlResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    EnableCertificateAuthorityCrlRequest.class,
                    EnableCertificateAuthorityCrlResponse.class)
                .withName("EnableCertificateAuthorityCrl")
                .withUri("/v1/private-certificate-authorities/{ca_id}/crl/enable")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("ca_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(EnableCertificateAuthorityCrlRequest::getCaId,
                EnableCertificateAuthorityCrlRequest::setCaId));
        builder.<EnableCertificateAuthorityCrlRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(EnableCertificateAuthorityCrlRequestBody.class),
            f -> f.withMarshaller(EnableCertificateAuthorityCrlRequest::getBody,
                EnableCertificateAuthorityCrlRequest::setBody));

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
                .withUri("/v1/private-certificates/{certificate_id}/export")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("certificate_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportCertificateRequest::getCertificateId,
                ExportCertificateRequest::setCertificateId));
        builder.<ExportCertificateRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ExportCertificateRequestBody.class),
            f -> f.withMarshaller(ExportCertificateRequest::getBody, ExportCertificateRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCaResourceInstancesRequest, ListCaResourceInstancesResponse> listCaResourceInstances =
        genForListCaResourceInstances();

    private static HttpRequestDef<ListCaResourceInstancesRequest, ListCaResourceInstancesResponse> genForListCaResourceInstances() {
        // basic
        HttpRequestDef.Builder<ListCaResourceInstancesRequest, ListCaResourceInstancesResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ListCaResourceInstancesRequest.class, ListCaResourceInstancesResponse.class)
            .withName("ListCaResourceInstances")
            .withUri("/v1/private-certificate-authorities/resource-instances/filter")
            .withContentType("application/json");

        // requests
        builder.<ListResourceInstancesRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListResourceInstancesRequestBody.class),
            f -> f.withMarshaller(ListCaResourceInstancesRequest::getBody, ListCaResourceInstancesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCaTagsRequest, ListCaTagsResponse> listCaTags = genForListCaTags();

    private static HttpRequestDef<ListCaTagsRequest, ListCaTagsResponse> genForListCaTags() {
        // basic
        HttpRequestDef.Builder<ListCaTagsRequest, ListCaTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListCaTagsRequest.class, ListCaTagsResponse.class)
                .withName("ListCaTags")
                .withUri("/v1/private-certificate-authorities/{ca_id}/tags")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("ca_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCaTagsRequest::getCaId, ListCaTagsRequest::setCaId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCertResourceInstancesRequest, ListCertResourceInstancesResponse> listCertResourceInstances =
        genForListCertResourceInstances();

    private static HttpRequestDef<ListCertResourceInstancesRequest, ListCertResourceInstancesResponse> genForListCertResourceInstances() {
        // basic
        HttpRequestDef.Builder<ListCertResourceInstancesRequest, ListCertResourceInstancesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ListCertResourceInstancesRequest.class,
                    ListCertResourceInstancesResponse.class)
                .withName("ListCertResourceInstances")
                .withUri("/v1/private-certificates/resource-instances/filter")
                .withContentType("application/json");

        // requests
        builder.<ListResourceInstancesRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListResourceInstancesRequestBody.class),
            f -> f.withMarshaller(ListCertResourceInstancesRequest::getBody,
                ListCertResourceInstancesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCertTagsRequest, ListCertTagsResponse> listCertTags = genForListCertTags();

    private static HttpRequestDef<ListCertTagsRequest, ListCertTagsResponse> genForListCertTags() {
        // basic
        HttpRequestDef.Builder<ListCertTagsRequest, ListCertTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListCertTagsRequest.class, ListCertTagsResponse.class)
                .withName("ListCertTags")
                .withUri("/v1/private-certificates/{certificate_id}/tags")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("certificate_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCertTagsRequest::getCertificateId, ListCertTagsRequest::setCertificateId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCertificateRequest, ListCertificateResponse> listCertificate =
        genForListCertificate();

    private static HttpRequestDef<ListCertificateRequest, ListCertificateResponse> genForListCertificate() {
        // basic
        HttpRequestDef.Builder<ListCertificateRequest, ListCertificateResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListCertificateRequest.class, ListCertificateResponse.class)
                .withName("ListCertificate")
                .withUri("/v1/private-certificates")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCertificateRequest::getLimit, ListCertificateRequest::setLimit));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCertificateRequest::getName, ListCertificateRequest::setName));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCertificateRequest::getOffset, ListCertificateRequest::setOffset));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCertificateRequest::getStatus, ListCertificateRequest::setStatus));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCertificateRequest::getSortKey, ListCertificateRequest::setSortKey));
        builder.<String>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCertificateRequest::getSortDir, ListCertificateRequest::setSortDir));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCertificateAuthorityObsBucketRequest, ListCertificateAuthorityObsBucketResponse> listCertificateAuthorityObsBucket =
        genForListCertificateAuthorityObsBucket();

    private static HttpRequestDef<ListCertificateAuthorityObsBucketRequest, ListCertificateAuthorityObsBucketResponse> genForListCertificateAuthorityObsBucket() {
        // basic
        HttpRequestDef.Builder<ListCertificateAuthorityObsBucketRequest, ListCertificateAuthorityObsBucketResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListCertificateAuthorityObsBucketRequest.class,
                    ListCertificateAuthorityObsBucketResponse.class)
                .withName("ListCertificateAuthorityObsBucket")
                .withUri("/v1/private-certificate-authorities/obs/buckets")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDomainCaTagsRequest, ListDomainCaTagsResponse> listDomainCaTags =
        genForListDomainCaTags();

    private static HttpRequestDef<ListDomainCaTagsRequest, ListDomainCaTagsResponse> genForListDomainCaTags() {
        // basic
        HttpRequestDef.Builder<ListDomainCaTagsRequest, ListDomainCaTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListDomainCaTagsRequest.class, ListDomainCaTagsResponse.class)
                .withName("ListDomainCaTags")
                .withUri("/v1/private-certificate-authorities/tags")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDomainCertTagsRequest, ListDomainCertTagsResponse> listDomainCertTags =
        genForListDomainCertTags();

    private static HttpRequestDef<ListDomainCertTagsRequest, ListDomainCertTagsResponse> genForListDomainCertTags() {
        // basic
        HttpRequestDef.Builder<ListDomainCertTagsRequest, ListDomainCertTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListDomainCertTagsRequest.class, ListDomainCertTagsResponse.class)
                .withName("ListDomainCertTags")
                .withUri("/v1/private-certificates/tags")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ParseCertificateSigningRequestRequest, ParseCertificateSigningRequestResponse> parseCertificateSigningRequest =
        genForParseCertificateSigningRequest();

    private static HttpRequestDef<ParseCertificateSigningRequestRequest, ParseCertificateSigningRequestResponse> genForParseCertificateSigningRequest() {
        // basic
        HttpRequestDef.Builder<ParseCertificateSigningRequestRequest, ParseCertificateSigningRequestResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ParseCertificateSigningRequestRequest.class,
                    ParseCertificateSigningRequestResponse.class)
                .withName("ParseCertificateSigningRequest")
                .withUri("/v1/private-certificates/csr/parse")
                .withContentType("application/json");

        // requests
        builder.<ParseCertificateSigningRequestRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ParseCertificateSigningRequestRequestBody.class),
            f -> f.withMarshaller(ParseCertificateSigningRequestRequest::getBody,
                ParseCertificateSigningRequestRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RevokeCertificateRequest, RevokeCertificateResponse> revokeCertificate =
        genForRevokeCertificate();

    private static HttpRequestDef<RevokeCertificateRequest, RevokeCertificateResponse> genForRevokeCertificate() {
        // basic
        HttpRequestDef.Builder<RevokeCertificateRequest, RevokeCertificateResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RevokeCertificateRequest.class, RevokeCertificateResponse.class)
                .withName("RevokeCertificate")
                .withUri("/v1/private-certificates/{certificate_id}/revoke")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("certificate_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RevokeCertificateRequest::getCertificateId,
                RevokeCertificateRequest::setCertificateId));
        builder.<RevokeCertificateRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RevokeCertificateRequestBody.class),
            f -> f.withMarshaller(RevokeCertificateRequest::getBody, RevokeCertificateRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAgencyRequest, ShowAgencyResponse> showAgency = genForShowAgency();

    private static HttpRequestDef<ShowAgencyRequest, ShowAgencyResponse> genForShowAgency() {
        // basic
        HttpRequestDef.Builder<ShowAgencyRequest, ShowAgencyResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowAgencyRequest.class, ShowAgencyResponse.class)
                .withName("ShowAgency")
                .withUri("/v1/private-certificate-authorities/agency")
                .withContentType("application/json");

        // requests

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
                .withUri("/v1/private-certificates/{certificate_id}")
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

    public static final HttpRequestDef<ShowCertificateAuthorityObsAgencyRequest, ShowCertificateAuthorityObsAgencyResponse> showCertificateAuthorityObsAgency =
        genForShowCertificateAuthorityObsAgency();

    private static HttpRequestDef<ShowCertificateAuthorityObsAgencyRequest, ShowCertificateAuthorityObsAgencyResponse> genForShowCertificateAuthorityObsAgency() {
        // basic
        HttpRequestDef.Builder<ShowCertificateAuthorityObsAgencyRequest, ShowCertificateAuthorityObsAgencyResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowCertificateAuthorityObsAgencyRequest.class,
                    ShowCertificateAuthorityObsAgencyResponse.class)
                .withName("ShowCertificateAuthorityObsAgency")
                .withUri("/v1/private-certificate-authorities/obs/agencies")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowCertificateQuotaRequest, ShowCertificateQuotaResponse> showCertificateQuota =
        genForShowCertificateQuota();

    private static HttpRequestDef<ShowCertificateQuotaRequest, ShowCertificateQuotaResponse> genForShowCertificateQuota() {
        // basic
        HttpRequestDef.Builder<ShowCertificateQuotaRequest, ShowCertificateQuotaResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowCertificateQuotaRequest.class, ShowCertificateQuotaResponse.class)
            .withName("ShowCertificateQuota")
            .withUri("/v1/private-certificates/quotas")
            .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowConsoleConfigRequest, ShowConsoleConfigResponse> showConsoleConfig =
        genForShowConsoleConfig();

    private static HttpRequestDef<ShowConsoleConfigRequest, ShowConsoleConfigResponse> genForShowConsoleConfig() {
        // basic
        HttpRequestDef.Builder<ShowConsoleConfigRequest, ShowConsoleConfigResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowConsoleConfigRequest.class, ShowConsoleConfigResponse.class)
                .withName("ShowConsoleConfig")
                .withUri("/v1/pca/config/console")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateCertificateAuthorityRequest, CreateCertificateAuthorityResponse> createCertificateAuthority =
        genForCreateCertificateAuthority();

    private static HttpRequestDef<CreateCertificateAuthorityRequest, CreateCertificateAuthorityResponse> genForCreateCertificateAuthority() {
        // basic
        HttpRequestDef.Builder<CreateCertificateAuthorityRequest, CreateCertificateAuthorityResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateCertificateAuthorityRequest.class,
                    CreateCertificateAuthorityResponse.class)
                .withName("CreateCertificateAuthority")
                .withUri("/v1/private-certificate-authorities")
                .withContentType("application/json");

        // requests
        builder.<CreateCertificateAuthorityRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateCertificateAuthorityRequestBody.class),
            f -> f.withMarshaller(CreateCertificateAuthorityRequest::getBody,
                CreateCertificateAuthorityRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteCertificateAuthorityRequest, DeleteCertificateAuthorityResponse> deleteCertificateAuthority =
        genForDeleteCertificateAuthority();

    private static HttpRequestDef<DeleteCertificateAuthorityRequest, DeleteCertificateAuthorityResponse> genForDeleteCertificateAuthority() {
        // basic
        HttpRequestDef.Builder<DeleteCertificateAuthorityRequest, DeleteCertificateAuthorityResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteCertificateAuthorityRequest.class,
                    DeleteCertificateAuthorityResponse.class)
                .withName("DeleteCertificateAuthority")
                .withUri("/v1/private-certificate-authorities/{ca_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("ca_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteCertificateAuthorityRequest::getCaId,
                DeleteCertificateAuthorityRequest::setCaId));
        builder.<String>withRequestField("pending_days",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteCertificateAuthorityRequest::getPendingDays,
                DeleteCertificateAuthorityRequest::setPendingDays));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DisableCertificateAuthorityRequest, DisableCertificateAuthorityResponse> disableCertificateAuthority =
        genForDisableCertificateAuthority();

    private static HttpRequestDef<DisableCertificateAuthorityRequest, DisableCertificateAuthorityResponse> genForDisableCertificateAuthority() {
        // basic
        HttpRequestDef.Builder<DisableCertificateAuthorityRequest, DisableCertificateAuthorityResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    DisableCertificateAuthorityRequest.class,
                    DisableCertificateAuthorityResponse.class)
                .withName("DisableCertificateAuthority")
                .withUri("/v1/private-certificate-authorities/{ca_id}/disable")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("ca_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DisableCertificateAuthorityRequest::getCaId,
                DisableCertificateAuthorityRequest::setCaId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<EnableCertificateAuthorityRequest, EnableCertificateAuthorityResponse> enableCertificateAuthority =
        genForEnableCertificateAuthority();

    private static HttpRequestDef<EnableCertificateAuthorityRequest, EnableCertificateAuthorityResponse> genForEnableCertificateAuthority() {
        // basic
        HttpRequestDef.Builder<EnableCertificateAuthorityRequest, EnableCertificateAuthorityResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    EnableCertificateAuthorityRequest.class,
                    EnableCertificateAuthorityResponse.class)
                .withName("EnableCertificateAuthority")
                .withUri("/v1/private-certificate-authorities/{ca_id}/enable")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("ca_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(EnableCertificateAuthorityRequest::getCaId,
                EnableCertificateAuthorityRequest::setCaId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExportCertificateAuthorityCertificateRequest, ExportCertificateAuthorityCertificateResponse> exportCertificateAuthorityCertificate =
        genForExportCertificateAuthorityCertificate();

    private static HttpRequestDef<ExportCertificateAuthorityCertificateRequest, ExportCertificateAuthorityCertificateResponse> genForExportCertificateAuthorityCertificate() {
        // basic
        HttpRequestDef.Builder<ExportCertificateAuthorityCertificateRequest, ExportCertificateAuthorityCertificateResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ExportCertificateAuthorityCertificateRequest.class,
                    ExportCertificateAuthorityCertificateResponse.class)
                .withName("ExportCertificateAuthorityCertificate")
                .withUri("/v1/private-certificate-authorities/{ca_id}/export")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("ca_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportCertificateAuthorityCertificateRequest::getCaId,
                ExportCertificateAuthorityCertificateRequest::setCaId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExportCertificateAuthorityCsrRequest, ExportCertificateAuthorityCsrResponse> exportCertificateAuthorityCsr =
        genForExportCertificateAuthorityCsr();

    private static HttpRequestDef<ExportCertificateAuthorityCsrRequest, ExportCertificateAuthorityCsrResponse> genForExportCertificateAuthorityCsr() {
        // basic
        HttpRequestDef.Builder<ExportCertificateAuthorityCsrRequest, ExportCertificateAuthorityCsrResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ExportCertificateAuthorityCsrRequest.class,
                    ExportCertificateAuthorityCsrResponse.class)
                .withName("ExportCertificateAuthorityCsr")
                .withUri("/v1/private-certificate-authorities/{ca_id}/csr")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("ca_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportCertificateAuthorityCsrRequest::getCaId,
                ExportCertificateAuthorityCsrRequest::setCaId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ImportCertificateAuthorityCertificateRequest, ImportCertificateAuthorityCertificateResponse> importCertificateAuthorityCertificate =
        genForImportCertificateAuthorityCertificate();

    private static HttpRequestDef<ImportCertificateAuthorityCertificateRequest, ImportCertificateAuthorityCertificateResponse> genForImportCertificateAuthorityCertificate() {
        // basic
        HttpRequestDef.Builder<ImportCertificateAuthorityCertificateRequest, ImportCertificateAuthorityCertificateResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ImportCertificateAuthorityCertificateRequest.class,
                    ImportCertificateAuthorityCertificateResponse.class)
                .withName("ImportCertificateAuthorityCertificate")
                .withUri("/v1/private-certificate-authorities/{ca_id}/import")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("ca_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ImportCertificateAuthorityCertificateRequest::getCaId,
                ImportCertificateAuthorityCertificateRequest::setCaId));
        builder.<ImportCertificateAuthorityCertificateRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ImportCertificateAuthorityCertificateRequestBody.class),
            f -> f.withMarshaller(ImportCertificateAuthorityCertificateRequest::getBody,
                ImportCertificateAuthorityCertificateRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<IssueCertificateAuthorityCertificateRequest, IssueCertificateAuthorityCertificateResponse> issueCertificateAuthorityCertificate =
        genForIssueCertificateAuthorityCertificate();

    private static HttpRequestDef<IssueCertificateAuthorityCertificateRequest, IssueCertificateAuthorityCertificateResponse> genForIssueCertificateAuthorityCertificate() {
        // basic
        HttpRequestDef.Builder<IssueCertificateAuthorityCertificateRequest, IssueCertificateAuthorityCertificateResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    IssueCertificateAuthorityCertificateRequest.class,
                    IssueCertificateAuthorityCertificateResponse.class)
                .withName("IssueCertificateAuthorityCertificate")
                .withUri("/v1/private-certificate-authorities/{ca_id}/activate")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("ca_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(IssueCertificateAuthorityCertificateRequest::getCaId,
                IssueCertificateAuthorityCertificateRequest::setCaId));
        builder.<IssueCertificateAuthorityCertificateRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(IssueCertificateAuthorityCertificateRequestBody.class),
            f -> f.withMarshaller(IssueCertificateAuthorityCertificateRequest::getBody,
                IssueCertificateAuthorityCertificateRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCertificateAuthorityRequest, ListCertificateAuthorityResponse> listCertificateAuthority =
        genForListCertificateAuthority();

    private static HttpRequestDef<ListCertificateAuthorityRequest, ListCertificateAuthorityResponse> genForListCertificateAuthority() {
        // basic
        HttpRequestDef.Builder<ListCertificateAuthorityRequest, ListCertificateAuthorityResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ListCertificateAuthorityRequest.class, ListCertificateAuthorityResponse.class)
                .withName("ListCertificateAuthority")
                .withUri("/v1/private-certificate-authorities")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCertificateAuthorityRequest::getLimit,
                ListCertificateAuthorityRequest::setLimit));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCertificateAuthorityRequest::getName, ListCertificateAuthorityRequest::setName));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCertificateAuthorityRequest::getOffset,
                ListCertificateAuthorityRequest::setOffset));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCertificateAuthorityRequest::getStatus,
                ListCertificateAuthorityRequest::setStatus));
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCertificateAuthorityRequest::getType, ListCertificateAuthorityRequest::setType));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCertificateAuthorityRequest::getSortKey,
                ListCertificateAuthorityRequest::setSortKey));
        builder.<String>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCertificateAuthorityRequest::getSortDir,
                ListCertificateAuthorityRequest::setSortDir));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RestoreCertificateAuthorityRequest, RestoreCertificateAuthorityResponse> restoreCertificateAuthority =
        genForRestoreCertificateAuthority();

    private static HttpRequestDef<RestoreCertificateAuthorityRequest, RestoreCertificateAuthorityResponse> genForRestoreCertificateAuthority() {
        // basic
        HttpRequestDef.Builder<RestoreCertificateAuthorityRequest, RestoreCertificateAuthorityResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    RestoreCertificateAuthorityRequest.class,
                    RestoreCertificateAuthorityResponse.class)
                .withName("RestoreCertificateAuthority")
                .withUri("/v1/private-certificate-authorities/{ca_id}/restore")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("ca_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RestoreCertificateAuthorityRequest::getCaId,
                RestoreCertificateAuthorityRequest::setCaId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RevokeCertificateAuthorityRequest, RevokeCertificateAuthorityResponse> revokeCertificateAuthority =
        genForRevokeCertificateAuthority();

    private static HttpRequestDef<RevokeCertificateAuthorityRequest, RevokeCertificateAuthorityResponse> genForRevokeCertificateAuthority() {
        // basic
        HttpRequestDef.Builder<RevokeCertificateAuthorityRequest, RevokeCertificateAuthorityResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    RevokeCertificateAuthorityRequest.class,
                    RevokeCertificateAuthorityResponse.class)
                .withName("RevokeCertificateAuthority")
                .withUri("/v1/private-certificate-authorities/{ca_id}/revoke")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("ca_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RevokeCertificateAuthorityRequest::getCaId,
                RevokeCertificateAuthorityRequest::setCaId));
        builder.<RevokeCertificateRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RevokeCertificateRequestBody.class),
            f -> f.withMarshaller(RevokeCertificateAuthorityRequest::getBody,
                RevokeCertificateAuthorityRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowCertificateAuthorityRequest, ShowCertificateAuthorityResponse> showCertificateAuthority =
        genForShowCertificateAuthority();

    private static HttpRequestDef<ShowCertificateAuthorityRequest, ShowCertificateAuthorityResponse> genForShowCertificateAuthority() {
        // basic
        HttpRequestDef.Builder<ShowCertificateAuthorityRequest, ShowCertificateAuthorityResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ShowCertificateAuthorityRequest.class, ShowCertificateAuthorityResponse.class)
                .withName("ShowCertificateAuthority")
                .withUri("/v1/private-certificate-authorities/{ca_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("ca_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCertificateAuthorityRequest::getCaId, ShowCertificateAuthorityRequest::setCaId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowCertificateAuthorityQuotaRequest, ShowCertificateAuthorityQuotaResponse> showCertificateAuthorityQuota =
        genForShowCertificateAuthorityQuota();

    private static HttpRequestDef<ShowCertificateAuthorityQuotaRequest, ShowCertificateAuthorityQuotaResponse> genForShowCertificateAuthorityQuota() {
        // basic
        HttpRequestDef.Builder<ShowCertificateAuthorityQuotaRequest, ShowCertificateAuthorityQuotaResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowCertificateAuthorityQuotaRequest.class,
                    ShowCertificateAuthorityQuotaResponse.class)
                .withName("ShowCertificateAuthorityQuota")
                .withUri("/v1/private-certificate-authorities/quotas")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateOcspSwitchRequest, UpdateOcspSwitchResponse> updateOcspSwitch =
        genForUpdateOcspSwitch();

    private static HttpRequestDef<UpdateOcspSwitchRequest, UpdateOcspSwitchResponse> genForUpdateOcspSwitch() {
        // basic
        HttpRequestDef.Builder<UpdateOcspSwitchRequest, UpdateOcspSwitchResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UpdateOcspSwitchRequest.class, UpdateOcspSwitchResponse.class)
                .withName("UpdateOcspSwitch")
                .withUri("/v1/private-certificate-authorities/{ca_id}/ocsp/switch")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("ca_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateOcspSwitchRequest::getCaId, UpdateOcspSwitchRequest::setCaId));
        builder.<UpdateOcspSwitchRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateOcspSwitchRequestBody.class),
            f -> f.withMarshaller(UpdateOcspSwitchRequest::getBody, UpdateOcspSwitchRequest::setBody));

        // response

        return builder.build();
    }

}
