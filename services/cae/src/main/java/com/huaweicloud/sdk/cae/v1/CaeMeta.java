package com.huaweicloud.sdk.cae.v1;

import com.huaweicloud.sdk.cae.v1.model.Agency;
import com.huaweicloud.sdk.cae.v1.model.CertReq;
import com.huaweicloud.sdk.cae.v1.model.CreateAgencyRequest;
import com.huaweicloud.sdk.cae.v1.model.CreateAgencyResponse;
import com.huaweicloud.sdk.cae.v1.model.CreateApplicationRequest;
import com.huaweicloud.sdk.cae.v1.model.CreateApplicationRequestBody;
import com.huaweicloud.sdk.cae.v1.model.CreateApplicationResponse;
import com.huaweicloud.sdk.cae.v1.model.CreateCertificateRequest;
import com.huaweicloud.sdk.cae.v1.model.CreateCertificateResponse;
import com.huaweicloud.sdk.cae.v1.model.CreateComponentConfigurationRequest;
import com.huaweicloud.sdk.cae.v1.model.CreateComponentConfigurationRequestBody;
import com.huaweicloud.sdk.cae.v1.model.CreateComponentConfigurationResponse;
import com.huaweicloud.sdk.cae.v1.model.CreateComponentRequest;
import com.huaweicloud.sdk.cae.v1.model.CreateComponentRequestBody;
import com.huaweicloud.sdk.cae.v1.model.CreateComponentResponse;
import com.huaweicloud.sdk.cae.v1.model.CreateDomainReq;
import com.huaweicloud.sdk.cae.v1.model.CreateDomainRequest;
import com.huaweicloud.sdk.cae.v1.model.CreateDomainResponse;
import com.huaweicloud.sdk.cae.v1.model.CreateEnvironmentRequest;
import com.huaweicloud.sdk.cae.v1.model.CreateEnvironmentRequestBody;
import com.huaweicloud.sdk.cae.v1.model.CreateEnvironmentResponse;
import com.huaweicloud.sdk.cae.v1.model.CreateMonitorSystemRequest;
import com.huaweicloud.sdk.cae.v1.model.CreateMonitorSystemResponse;
import com.huaweicloud.sdk.cae.v1.model.CreateTimerRuleReq;
import com.huaweicloud.sdk.cae.v1.model.CreateTimerRuleRequest;
import com.huaweicloud.sdk.cae.v1.model.CreateTimerRuleResponse;
import com.huaweicloud.sdk.cae.v1.model.CreateVolumeReq;
import com.huaweicloud.sdk.cae.v1.model.CreateVolumeRequest;
import com.huaweicloud.sdk.cae.v1.model.CreateVolumeResponse;
import com.huaweicloud.sdk.cae.v1.model.DeleteApplicationRequest;
import com.huaweicloud.sdk.cae.v1.model.DeleteApplicationResponse;
import com.huaweicloud.sdk.cae.v1.model.DeleteCertificateRequest;
import com.huaweicloud.sdk.cae.v1.model.DeleteCertificateResponse;
import com.huaweicloud.sdk.cae.v1.model.DeleteComponentConfigurationRequest;
import com.huaweicloud.sdk.cae.v1.model.DeleteComponentConfigurationResponse;
import com.huaweicloud.sdk.cae.v1.model.DeleteComponentRequest;
import com.huaweicloud.sdk.cae.v1.model.DeleteComponentResponse;
import com.huaweicloud.sdk.cae.v1.model.DeleteDomainRequest;
import com.huaweicloud.sdk.cae.v1.model.DeleteDomainResponse;
import com.huaweicloud.sdk.cae.v1.model.DeleteEnvironmentRequest;
import com.huaweicloud.sdk.cae.v1.model.DeleteEnvironmentResponse;
import com.huaweicloud.sdk.cae.v1.model.DeleteTimerRuleRequest;
import com.huaweicloud.sdk.cae.v1.model.DeleteTimerRuleResponse;
import com.huaweicloud.sdk.cae.v1.model.DeleteVolumeRequest;
import com.huaweicloud.sdk.cae.v1.model.DeleteVolumeResponse;
import com.huaweicloud.sdk.cae.v1.model.ExecuteActionRequest;
import com.huaweicloud.sdk.cae.v1.model.ExecuteActionRequestBody;
import com.huaweicloud.sdk.cae.v1.model.ExecuteActionResponse;
import com.huaweicloud.sdk.cae.v1.model.ListAgenciesRequest;
import com.huaweicloud.sdk.cae.v1.model.ListAgenciesResponse;
import com.huaweicloud.sdk.cae.v1.model.ListApplicationsRequest;
import com.huaweicloud.sdk.cae.v1.model.ListApplicationsResponse;
import com.huaweicloud.sdk.cae.v1.model.ListCertificatesRequest;
import com.huaweicloud.sdk.cae.v1.model.ListCertificatesResponse;
import com.huaweicloud.sdk.cae.v1.model.ListComponentConfigurationsRequest;
import com.huaweicloud.sdk.cae.v1.model.ListComponentConfigurationsResponse;
import com.huaweicloud.sdk.cae.v1.model.ListComponentEventsRequest;
import com.huaweicloud.sdk.cae.v1.model.ListComponentEventsResponse;
import com.huaweicloud.sdk.cae.v1.model.ListComponentInstancesRequest;
import com.huaweicloud.sdk.cae.v1.model.ListComponentInstancesResponse;
import com.huaweicloud.sdk.cae.v1.model.ListComponentSnapshotsRequest;
import com.huaweicloud.sdk.cae.v1.model.ListComponentSnapshotsResponse;
import com.huaweicloud.sdk.cae.v1.model.ListComponentsRequest;
import com.huaweicloud.sdk.cae.v1.model.ListComponentsResponse;
import com.huaweicloud.sdk.cae.v1.model.ListDomainsRequest;
import com.huaweicloud.sdk.cae.v1.model.ListDomainsResponse;
import com.huaweicloud.sdk.cae.v1.model.ListEipsRequest;
import com.huaweicloud.sdk.cae.v1.model.ListEipsResponse;
import com.huaweicloud.sdk.cae.v1.model.ListEnvironmentsRequest;
import com.huaweicloud.sdk.cae.v1.model.ListEnvironmentsResponse;
import com.huaweicloud.sdk.cae.v1.model.ListTimerRulesRequest;
import com.huaweicloud.sdk.cae.v1.model.ListTimerRulesResponse;
import com.huaweicloud.sdk.cae.v1.model.ListVolumesRequest;
import com.huaweicloud.sdk.cae.v1.model.ListVolumesResponse;
import com.huaweicloud.sdk.cae.v1.model.MonitorSystemRequestBody;
import com.huaweicloud.sdk.cae.v1.model.RetryJobRequest;
import com.huaweicloud.sdk.cae.v1.model.RetryJobResponse;
import com.huaweicloud.sdk.cae.v1.model.ShowApplicationRequest;
import com.huaweicloud.sdk.cae.v1.model.ShowApplicationResponse;
import com.huaweicloud.sdk.cae.v1.model.ShowComponentRequest;
import com.huaweicloud.sdk.cae.v1.model.ShowComponentResponse;
import com.huaweicloud.sdk.cae.v1.model.ShowExecutionResultRequest;
import com.huaweicloud.sdk.cae.v1.model.ShowExecutionResultResponse;
import com.huaweicloud.sdk.cae.v1.model.ShowJobRequest;
import com.huaweicloud.sdk.cae.v1.model.ShowJobResponse;
import com.huaweicloud.sdk.cae.v1.model.ShowMonitorSystemRequest;
import com.huaweicloud.sdk.cae.v1.model.ShowMonitorSystemResponse;
import com.huaweicloud.sdk.cae.v1.model.UpdateCertReq;
import com.huaweicloud.sdk.cae.v1.model.UpdateCertificateRequest;
import com.huaweicloud.sdk.cae.v1.model.UpdateCertificateResponse;
import com.huaweicloud.sdk.cae.v1.model.UpdateComponentRequest;
import com.huaweicloud.sdk.cae.v1.model.UpdateComponentRequestBody;
import com.huaweicloud.sdk.cae.v1.model.UpdateComponentResponse;
import com.huaweicloud.sdk.cae.v1.model.UpdateEipRequest;
import com.huaweicloud.sdk.cae.v1.model.UpdateEipRequestBody;
import com.huaweicloud.sdk.cae.v1.model.UpdateEipResponse;
import com.huaweicloud.sdk.cae.v1.model.UpdateMonitorSystemRequest;
import com.huaweicloud.sdk.cae.v1.model.UpdateMonitorSystemResponse;
import com.huaweicloud.sdk.cae.v1.model.UpdateTimerRuleReq;
import com.huaweicloud.sdk.cae.v1.model.UpdateTimerRuleRequest;
import com.huaweicloud.sdk.cae.v1.model.UpdateTimerRuleResponse;
import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;

@SuppressWarnings("unchecked")
public class CaeMeta {

    public static final HttpRequestDef<CreateAgencyRequest, CreateAgencyResponse> createAgency = genForcreateAgency();

    private static HttpRequestDef<CreateAgencyRequest, CreateAgencyResponse> genForcreateAgency() {
        // basic
        HttpRequestDef.Builder<CreateAgencyRequest, CreateAgencyResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateAgencyRequest.class, CreateAgencyResponse.class)
                .withName("CreateAgency")
                .withUri("/v1/{project_id}/cae/agencies")
                .withContentType("application/json");

        // requests
        builder.<Agency>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Agency.class),
            f -> f.withMarshaller(CreateAgencyRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAgenciesRequest, ListAgenciesResponse> listAgencies = genForlistAgencies();

    private static HttpRequestDef<ListAgenciesRequest, ListAgenciesResponse> genForlistAgencies() {
        // basic
        HttpRequestDef.Builder<ListAgenciesRequest, ListAgenciesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAgenciesRequest.class, ListAgenciesResponse.class)
                .withName("ListAgencies")
                .withUri("/v1/{project_id}/cae/agencies")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateApplicationRequest, CreateApplicationResponse> createApplication =
        genForcreateApplication();

    private static HttpRequestDef<CreateApplicationRequest, CreateApplicationResponse> genForcreateApplication() {
        // basic
        HttpRequestDef.Builder<CreateApplicationRequest, CreateApplicationResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateApplicationRequest.class, CreateApplicationResponse.class)
                .withName("CreateApplication")
                .withUri("/v1/{project_id}/cae/applications")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("X-Enterprise-Project-ID",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateApplicationRequest::getXEnterpriseProjectID, (req, v) -> {
                req.setXEnterpriseProjectID(v);
            }));
        builder.<String>withRequestField("X-Environment-ID",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateApplicationRequest::getXEnvironmentID, (req, v) -> {
                req.setXEnvironmentID(v);
            }));
        builder.<CreateApplicationRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateApplicationRequestBody.class),
            f -> f.withMarshaller(CreateApplicationRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteApplicationRequest, DeleteApplicationResponse> deleteApplication =
        genFordeleteApplication();

    private static HttpRequestDef<DeleteApplicationRequest, DeleteApplicationResponse> genFordeleteApplication() {
        // basic
        HttpRequestDef.Builder<DeleteApplicationRequest, DeleteApplicationResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteApplicationRequest.class, DeleteApplicationResponse.class)
                .withName("DeleteApplication")
                .withUri("/v1/{project_id}/cae/applications/{application_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("application_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteApplicationRequest::getApplicationId, (req, v) -> {
                req.setApplicationId(v);
            }));
        builder.<String>withRequestField("X-Enterprise-Project-ID",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteApplicationRequest::getXEnterpriseProjectID, (req, v) -> {
                req.setXEnterpriseProjectID(v);
            }));
        builder.<String>withRequestField("X-Environment-ID",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteApplicationRequest::getXEnvironmentID, (req, v) -> {
                req.setXEnvironmentID(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListApplicationsRequest, ListApplicationsResponse> listApplications =
        genForlistApplications();

    private static HttpRequestDef<ListApplicationsRequest, ListApplicationsResponse> genForlistApplications() {
        // basic
        HttpRequestDef.Builder<ListApplicationsRequest, ListApplicationsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListApplicationsRequest.class, ListApplicationsResponse.class)
                .withName("ListApplications")
                .withUri("/v1/{project_id}/cae/applications")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("X-Enterprise-Project-ID",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApplicationsRequest::getXEnterpriseProjectID, (req, v) -> {
                req.setXEnterpriseProjectID(v);
            }));
        builder.<String>withRequestField("X-Environment-ID",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApplicationsRequest::getXEnvironmentID, (req, v) -> {
                req.setXEnvironmentID(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowApplicationRequest, ShowApplicationResponse> showApplication =
        genForshowApplication();

    private static HttpRequestDef<ShowApplicationRequest, ShowApplicationResponse> genForshowApplication() {
        // basic
        HttpRequestDef.Builder<ShowApplicationRequest, ShowApplicationResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowApplicationRequest.class, ShowApplicationResponse.class)
                .withName("ShowApplication")
                .withUri("/v1/{project_id}/cae/applications/{application_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("application_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowApplicationRequest::getApplicationId, (req, v) -> {
                req.setApplicationId(v);
            }));
        builder.<String>withRequestField("X-Enterprise-Project-ID",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowApplicationRequest::getXEnterpriseProjectID, (req, v) -> {
                req.setXEnterpriseProjectID(v);
            }));
        builder.<String>withRequestField("X-Environment-ID",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowApplicationRequest::getXEnvironmentID, (req, v) -> {
                req.setXEnvironmentID(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateCertificateRequest, CreateCertificateResponse> createCertificate =
        genForcreateCertificate();

    private static HttpRequestDef<CreateCertificateRequest, CreateCertificateResponse> genForcreateCertificate() {
        // basic
        HttpRequestDef.Builder<CreateCertificateRequest, CreateCertificateResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateCertificateRequest.class, CreateCertificateResponse.class)
                .withName("CreateCertificate")
                .withUri("/v1/{project_id}/cae/certificates")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("X-Enterprise-Project-ID",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateCertificateRequest::getXEnterpriseProjectID, (req, v) -> {
                req.setXEnterpriseProjectID(v);
            }));
        builder.<String>withRequestField("X-Environment-ID",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateCertificateRequest::getXEnvironmentID, (req, v) -> {
                req.setXEnvironmentID(v);
            }));
        builder.<CertReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CertReq.class),
            f -> f.withMarshaller(CreateCertificateRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteCertificateRequest, DeleteCertificateResponse> deleteCertificate =
        genFordeleteCertificate();

    private static HttpRequestDef<DeleteCertificateRequest, DeleteCertificateResponse> genFordeleteCertificate() {
        // basic
        HttpRequestDef.Builder<DeleteCertificateRequest, DeleteCertificateResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteCertificateRequest.class, DeleteCertificateResponse.class)
                .withName("DeleteCertificate")
                .withUri("/v1/{project_id}/cae/certificates/{certificate_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("certificate_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteCertificateRequest::getCertificateId, (req, v) -> {
                req.setCertificateId(v);
            }));
        builder.<String>withRequestField("X-Enterprise-Project-ID",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteCertificateRequest::getXEnterpriseProjectID, (req, v) -> {
                req.setXEnterpriseProjectID(v);
            }));
        builder.<String>withRequestField("X-Environment-ID",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteCertificateRequest::getXEnvironmentID, (req, v) -> {
                req.setXEnvironmentID(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCertificatesRequest, ListCertificatesResponse> listCertificates =
        genForlistCertificates();

    private static HttpRequestDef<ListCertificatesRequest, ListCertificatesResponse> genForlistCertificates() {
        // basic
        HttpRequestDef.Builder<ListCertificatesRequest, ListCertificatesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListCertificatesRequest.class, ListCertificatesResponse.class)
                .withName("ListCertificates")
                .withUri("/v1/{project_id}/cae/certificates")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("X-Enterprise-Project-ID",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCertificatesRequest::getXEnterpriseProjectID, (req, v) -> {
                req.setXEnterpriseProjectID(v);
            }));
        builder.<String>withRequestField("X-Environment-ID",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCertificatesRequest::getXEnvironmentID, (req, v) -> {
                req.setXEnvironmentID(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateCertificateRequest, UpdateCertificateResponse> updateCertificate =
        genForupdateCertificate();

    private static HttpRequestDef<UpdateCertificateRequest, UpdateCertificateResponse> genForupdateCertificate() {
        // basic
        HttpRequestDef.Builder<UpdateCertificateRequest, UpdateCertificateResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateCertificateRequest.class, UpdateCertificateResponse.class)
                .withName("UpdateCertificate")
                .withUri("/v1/{project_id}/cae/certificates/{certificate_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("certificate_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateCertificateRequest::getCertificateId, (req, v) -> {
                req.setCertificateId(v);
            }));
        builder.<String>withRequestField("X-Enterprise-Project-ID",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateCertificateRequest::getXEnterpriseProjectID, (req, v) -> {
                req.setXEnterpriseProjectID(v);
            }));
        builder.<String>withRequestField("X-Environment-ID",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateCertificateRequest::getXEnvironmentID, (req, v) -> {
                req.setXEnvironmentID(v);
            }));
        builder.<UpdateCertReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateCertReq.class),
            f -> f.withMarshaller(UpdateCertificateRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateComponentRequest, CreateComponentResponse> createComponent =
        genForcreateComponent();

    private static HttpRequestDef<CreateComponentRequest, CreateComponentResponse> genForcreateComponent() {
        // basic
        HttpRequestDef.Builder<CreateComponentRequest, CreateComponentResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateComponentRequest.class, CreateComponentResponse.class)
                .withName("CreateComponent")
                .withUri("/v1/{project_id}/cae/applications/{application_id}/components")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("application_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateComponentRequest::getApplicationId, (req, v) -> {
                req.setApplicationId(v);
            }));
        builder.<String>withRequestField("X-Enterprise-Project-ID",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateComponentRequest::getXEnterpriseProjectID, (req, v) -> {
                req.setXEnterpriseProjectID(v);
            }));
        builder.<String>withRequestField("X-Environment-ID",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateComponentRequest::getXEnvironmentID, (req, v) -> {
                req.setXEnvironmentID(v);
            }));
        builder.<CreateComponentRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateComponentRequestBody.class),
            f -> f.withMarshaller(CreateComponentRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteComponentRequest, DeleteComponentResponse> deleteComponent =
        genFordeleteComponent();

    private static HttpRequestDef<DeleteComponentRequest, DeleteComponentResponse> genFordeleteComponent() {
        // basic
        HttpRequestDef.Builder<DeleteComponentRequest, DeleteComponentResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteComponentRequest.class, DeleteComponentResponse.class)
                .withName("DeleteComponent")
                .withUri("/v1/{project_id}/cae/applications/{application_id}/components/{component_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("application_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteComponentRequest::getApplicationId, (req, v) -> {
                req.setApplicationId(v);
            }));
        builder.<String>withRequestField("component_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteComponentRequest::getComponentId, (req, v) -> {
                req.setComponentId(v);
            }));
        builder.<String>withRequestField("X-Enterprise-Project-ID",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteComponentRequest::getXEnterpriseProjectID, (req, v) -> {
                req.setXEnterpriseProjectID(v);
            }));
        builder.<String>withRequestField("X-Environment-ID",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteComponentRequest::getXEnvironmentID, (req, v) -> {
                req.setXEnvironmentID(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExecuteActionRequest, ExecuteActionResponse> executeAction =
        genForexecuteAction();

    private static HttpRequestDef<ExecuteActionRequest, ExecuteActionResponse> genForexecuteAction() {
        // basic
        HttpRequestDef.Builder<ExecuteActionRequest, ExecuteActionResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ExecuteActionRequest.class, ExecuteActionResponse.class)
                .withName("ExecuteAction")
                .withUri("/v1/{project_id}/cae/applications/{application_id}/components/{component_id}/action")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("application_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExecuteActionRequest::getApplicationId, (req, v) -> {
                req.setApplicationId(v);
            }));
        builder.<String>withRequestField("component_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExecuteActionRequest::getComponentId, (req, v) -> {
                req.setComponentId(v);
            }));
        builder.<String>withRequestField("X-Enterprise-Project-ID",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExecuteActionRequest::getXEnterpriseProjectID, (req, v) -> {
                req.setXEnterpriseProjectID(v);
            }));
        builder.<String>withRequestField("X-Environment-ID",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExecuteActionRequest::getXEnvironmentID, (req, v) -> {
                req.setXEnvironmentID(v);
            }));
        builder.<ExecuteActionRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ExecuteActionRequestBody.class),
            f -> f.withMarshaller(ExecuteActionRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListComponentEventsRequest, ListComponentEventsResponse> listComponentEvents =
        genForlistComponentEvents();

    private static HttpRequestDef<ListComponentEventsRequest, ListComponentEventsResponse> genForlistComponentEvents() {
        // basic
        HttpRequestDef.Builder<ListComponentEventsRequest, ListComponentEventsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListComponentEventsRequest.class, ListComponentEventsResponse.class)
                .withName("ListComponentEvents")
                .withUri("/v1/{project_id}/cae/applications/{application_id}/components/{component_id}/events")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("application_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListComponentEventsRequest::getApplicationId, (req, v) -> {
                req.setApplicationId(v);
            }));
        builder.<String>withRequestField("component_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListComponentEventsRequest::getComponentId, (req, v) -> {
                req.setComponentId(v);
            }));
        builder.<String>withRequestField("X-Enterprise-Project-ID",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListComponentEventsRequest::getXEnterpriseProjectID, (req, v) -> {
                req.setXEnterpriseProjectID(v);
            }));
        builder.<String>withRequestField("X-Environment-ID",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListComponentEventsRequest::getXEnvironmentID, (req, v) -> {
                req.setXEnvironmentID(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListComponentInstancesRequest, ListComponentInstancesResponse> listComponentInstances =
        genForlistComponentInstances();

    private static HttpRequestDef<ListComponentInstancesRequest, ListComponentInstancesResponse> genForlistComponentInstances() {
        // basic
        HttpRequestDef.Builder<ListComponentInstancesRequest, ListComponentInstancesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListComponentInstancesRequest.class, ListComponentInstancesResponse.class)
            .withName("ListComponentInstances")
            .withUri("/v1/{project_id}/cae/applications/{application_id}/components/{component_id}/instances")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("application_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListComponentInstancesRequest::getApplicationId, (req, v) -> {
                req.setApplicationId(v);
            }));
        builder.<String>withRequestField("component_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListComponentInstancesRequest::getComponentId, (req, v) -> {
                req.setComponentId(v);
            }));
        builder.<String>withRequestField("X-Enterprise-Project-ID",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListComponentInstancesRequest::getXEnterpriseProjectID, (req, v) -> {
                req.setXEnterpriseProjectID(v);
            }));
        builder.<String>withRequestField("X-Environment-ID",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListComponentInstancesRequest::getXEnvironmentID, (req, v) -> {
                req.setXEnvironmentID(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListComponentSnapshotsRequest, ListComponentSnapshotsResponse> listComponentSnapshots =
        genForlistComponentSnapshots();

    private static HttpRequestDef<ListComponentSnapshotsRequest, ListComponentSnapshotsResponse> genForlistComponentSnapshots() {
        // basic
        HttpRequestDef.Builder<ListComponentSnapshotsRequest, ListComponentSnapshotsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListComponentSnapshotsRequest.class, ListComponentSnapshotsResponse.class)
            .withName("ListComponentSnapshots")
            .withUri("/v1/{project_id}/cae/applications/{application_id}/components/{component_id}/snapshots")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("application_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListComponentSnapshotsRequest::getApplicationId, (req, v) -> {
                req.setApplicationId(v);
            }));
        builder.<String>withRequestField("component_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListComponentSnapshotsRequest::getComponentId, (req, v) -> {
                req.setComponentId(v);
            }));
        builder.<String>withRequestField("X-Enterprise-Project-ID",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListComponentSnapshotsRequest::getXEnterpriseProjectID, (req, v) -> {
                req.setXEnterpriseProjectID(v);
            }));
        builder.<String>withRequestField("X-Environment-ID",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListComponentSnapshotsRequest::getXEnvironmentID, (req, v) -> {
                req.setXEnvironmentID(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListComponentsRequest, ListComponentsResponse> listComponents =
        genForlistComponents();

    private static HttpRequestDef<ListComponentsRequest, ListComponentsResponse> genForlistComponents() {
        // basic
        HttpRequestDef.Builder<ListComponentsRequest, ListComponentsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListComponentsRequest.class, ListComponentsResponse.class)
                .withName("ListComponents")
                .withUri("/v1/{project_id}/cae/applications/{application_id}/components")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("application_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListComponentsRequest::getApplicationId, (req, v) -> {
                req.setApplicationId(v);
            }));
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListComponentsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListComponentsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("X-Enterprise-Project-ID",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListComponentsRequest::getXEnterpriseProjectID, (req, v) -> {
                req.setXEnterpriseProjectID(v);
            }));
        builder.<String>withRequestField("X-Environment-ID",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListComponentsRequest::getXEnvironmentID, (req, v) -> {
                req.setXEnvironmentID(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowComponentRequest, ShowComponentResponse> showComponent =
        genForshowComponent();

    private static HttpRequestDef<ShowComponentRequest, ShowComponentResponse> genForshowComponent() {
        // basic
        HttpRequestDef.Builder<ShowComponentRequest, ShowComponentResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowComponentRequest.class, ShowComponentResponse.class)
                .withName("ShowComponent")
                .withUri("/v1/{project_id}/cae/applications/{application_id}/components/{component_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("application_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowComponentRequest::getApplicationId, (req, v) -> {
                req.setApplicationId(v);
            }));
        builder.<String>withRequestField("component_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowComponentRequest::getComponentId, (req, v) -> {
                req.setComponentId(v);
            }));
        builder.<String>withRequestField("X-Enterprise-Project-ID",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowComponentRequest::getXEnterpriseProjectID, (req, v) -> {
                req.setXEnterpriseProjectID(v);
            }));
        builder.<String>withRequestField("X-Environment-ID",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowComponentRequest::getXEnvironmentID, (req, v) -> {
                req.setXEnvironmentID(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateComponentRequest, UpdateComponentResponse> updateComponent =
        genForupdateComponent();

    private static HttpRequestDef<UpdateComponentRequest, UpdateComponentResponse> genForupdateComponent() {
        // basic
        HttpRequestDef.Builder<UpdateComponentRequest, UpdateComponentResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateComponentRequest.class, UpdateComponentResponse.class)
                .withName("UpdateComponent")
                .withUri("/v1/{project_id}/cae/applications/{application_id}/components/{component_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("application_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateComponentRequest::getApplicationId, (req, v) -> {
                req.setApplicationId(v);
            }));
        builder.<String>withRequestField("component_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateComponentRequest::getComponentId, (req, v) -> {
                req.setComponentId(v);
            }));
        builder.<String>withRequestField("X-Enterprise-Project-ID",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateComponentRequest::getXEnterpriseProjectID, (req, v) -> {
                req.setXEnterpriseProjectID(v);
            }));
        builder.<String>withRequestField("X-Environment-ID",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateComponentRequest::getXEnvironmentID, (req, v) -> {
                req.setXEnvironmentID(v);
            }));
        builder.<UpdateComponentRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateComponentRequestBody.class),
            f -> f.withMarshaller(UpdateComponentRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateComponentConfigurationRequest, CreateComponentConfigurationResponse> createComponentConfiguration =
        genForcreateComponentConfiguration();

    private static HttpRequestDef<CreateComponentConfigurationRequest, CreateComponentConfigurationResponse> genForcreateComponentConfiguration() {
        // basic
        HttpRequestDef.Builder<CreateComponentConfigurationRequest, CreateComponentConfigurationResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateComponentConfigurationRequest.class,
                    CreateComponentConfigurationResponse.class)
                .withName("CreateComponentConfiguration")
                .withUri("/v1/{project_id}/cae/applications/{application_id}/components/{component_id}/configurations")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("application_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateComponentConfigurationRequest::getApplicationId, (req, v) -> {
                req.setApplicationId(v);
            }));
        builder.<String>withRequestField("component_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateComponentConfigurationRequest::getComponentId, (req, v) -> {
                req.setComponentId(v);
            }));
        builder.<String>withRequestField("X-Enterprise-Project-ID",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateComponentConfigurationRequest::getXEnterpriseProjectID, (req, v) -> {
                req.setXEnterpriseProjectID(v);
            }));
        builder.<String>withRequestField("X-Environment-ID",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateComponentConfigurationRequest::getXEnvironmentID, (req, v) -> {
                req.setXEnvironmentID(v);
            }));
        builder.<CreateComponentConfigurationRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateComponentConfigurationRequestBody.class),
            f -> f.withMarshaller(CreateComponentConfigurationRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteComponentConfigurationRequest, DeleteComponentConfigurationResponse> deleteComponentConfiguration =
        genFordeleteComponentConfiguration();

    private static HttpRequestDef<DeleteComponentConfigurationRequest, DeleteComponentConfigurationResponse> genFordeleteComponentConfiguration() {
        // basic
        HttpRequestDef.Builder<DeleteComponentConfigurationRequest, DeleteComponentConfigurationResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteComponentConfigurationRequest.class,
                    DeleteComponentConfigurationResponse.class)
                .withName("DeleteComponentConfiguration")
                .withUri("/v1/{project_id}/cae/applications/{application_id}/components/{component_id}/configurations")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("application_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteComponentConfigurationRequest::getApplicationId, (req, v) -> {
                req.setApplicationId(v);
            }));
        builder.<String>withRequestField("component_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteComponentConfigurationRequest::getComponentId, (req, v) -> {
                req.setComponentId(v);
            }));
        builder.<String>withRequestField("X-Enterprise-Project-ID",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteComponentConfigurationRequest::getXEnterpriseProjectID, (req, v) -> {
                req.setXEnterpriseProjectID(v);
            }));
        builder.<String>withRequestField("X-Environment-ID",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteComponentConfigurationRequest::getXEnvironmentID, (req, v) -> {
                req.setXEnvironmentID(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListComponentConfigurationsRequest, ListComponentConfigurationsResponse> listComponentConfigurations =
        genForlistComponentConfigurations();

    private static HttpRequestDef<ListComponentConfigurationsRequest, ListComponentConfigurationsResponse> genForlistComponentConfigurations() {
        // basic
        HttpRequestDef.Builder<ListComponentConfigurationsRequest, ListComponentConfigurationsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListComponentConfigurationsRequest.class,
                    ListComponentConfigurationsResponse.class)
                .withName("ListComponentConfigurations")
                .withUri("/v1/{project_id}/cae/applications/{application_id}/components/{component_id}/configurations")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("application_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListComponentConfigurationsRequest::getApplicationId, (req, v) -> {
                req.setApplicationId(v);
            }));
        builder.<String>withRequestField("component_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListComponentConfigurationsRequest::getComponentId, (req, v) -> {
                req.setComponentId(v);
            }));
        builder.<String>withRequestField("X-Enterprise-Project-ID",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListComponentConfigurationsRequest::getXEnterpriseProjectID, (req, v) -> {
                req.setXEnterpriseProjectID(v);
            }));
        builder.<String>withRequestField("X-Environment-ID",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListComponentConfigurationsRequest::getXEnvironmentID, (req, v) -> {
                req.setXEnvironmentID(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateDomainRequest, CreateDomainResponse> createDomain = genForcreateDomain();

    private static HttpRequestDef<CreateDomainRequest, CreateDomainResponse> genForcreateDomain() {
        // basic
        HttpRequestDef.Builder<CreateDomainRequest, CreateDomainResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateDomainRequest.class, CreateDomainResponse.class)
                .withName("CreateDomain")
                .withUri("/v1/{project_id}/cae/domains")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("X-Enterprise-Project-ID",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateDomainRequest::getXEnterpriseProjectID, (req, v) -> {
                req.setXEnterpriseProjectID(v);
            }));
        builder.<String>withRequestField("X-Environment-ID",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateDomainRequest::getXEnvironmentID, (req, v) -> {
                req.setXEnvironmentID(v);
            }));
        builder.<CreateDomainReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateDomainReq.class),
            f -> f.withMarshaller(CreateDomainRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteDomainRequest, DeleteDomainResponse> deleteDomain = genFordeleteDomain();

    private static HttpRequestDef<DeleteDomainRequest, DeleteDomainResponse> genFordeleteDomain() {
        // basic
        HttpRequestDef.Builder<DeleteDomainRequest, DeleteDomainResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteDomainRequest.class, DeleteDomainResponse.class)
                .withName("DeleteDomain")
                .withUri("/v1/{project_id}/cae/domains/{domain_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDomainRequest::getDomainId, (req, v) -> {
                req.setDomainId(v);
            }));
        builder.<String>withRequestField("X-Enterprise-Project-ID",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDomainRequest::getXEnterpriseProjectID, (req, v) -> {
                req.setXEnterpriseProjectID(v);
            }));
        builder.<String>withRequestField("X-Environment-ID",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDomainRequest::getXEnvironmentID, (req, v) -> {
                req.setXEnvironmentID(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDomainsRequest, ListDomainsResponse> listDomains = genForlistDomains();

    private static HttpRequestDef<ListDomainsRequest, ListDomainsResponse> genForlistDomains() {
        // basic
        HttpRequestDef.Builder<ListDomainsRequest, ListDomainsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListDomainsRequest.class, ListDomainsResponse.class)
                .withName("ListDomains")
                .withUri("/v1/{project_id}/cae/domains")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("X-Enterprise-Project-ID",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDomainsRequest::getXEnterpriseProjectID, (req, v) -> {
                req.setXEnterpriseProjectID(v);
            }));
        builder.<String>withRequestField("X-Environment-ID",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDomainsRequest::getXEnvironmentID, (req, v) -> {
                req.setXEnvironmentID(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListEipsRequest, ListEipsResponse> listEips = genForlistEips();

    private static HttpRequestDef<ListEipsRequest, ListEipsResponse> genForlistEips() {
        // basic
        HttpRequestDef.Builder<ListEipsRequest, ListEipsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListEipsRequest.class, ListEipsResponse.class)
                .withName("ListEips")
                .withUri("/v1/{project_id}/cae/eips")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("X-Enterprise-Project-ID",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEipsRequest::getXEnterpriseProjectID, (req, v) -> {
                req.setXEnterpriseProjectID(v);
            }));
        builder.<String>withRequestField("X-Environment-ID",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEipsRequest::getXEnvironmentID, (req, v) -> {
                req.setXEnvironmentID(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateEipRequest, UpdateEipResponse> updateEip = genForupdateEip();

    private static HttpRequestDef<UpdateEipRequest, UpdateEipResponse> genForupdateEip() {
        // basic
        HttpRequestDef.Builder<UpdateEipRequest, UpdateEipResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateEipRequest.class, UpdateEipResponse.class)
                .withName("UpdateEip")
                .withUri("/v1/{project_id}/cae/eips")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("X-Enterprise-Project-ID",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateEipRequest::getXEnterpriseProjectID, (req, v) -> {
                req.setXEnterpriseProjectID(v);
            }));
        builder.<String>withRequestField("X-Environment-ID",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateEipRequest::getXEnvironmentID, (req, v) -> {
                req.setXEnvironmentID(v);
            }));
        builder.<UpdateEipRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateEipRequestBody.class),
            f -> f.withMarshaller(UpdateEipRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateEnvironmentRequest, CreateEnvironmentResponse> createEnvironment =
        genForcreateEnvironment();

    private static HttpRequestDef<CreateEnvironmentRequest, CreateEnvironmentResponse> genForcreateEnvironment() {
        // basic
        HttpRequestDef.Builder<CreateEnvironmentRequest, CreateEnvironmentResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateEnvironmentRequest.class, CreateEnvironmentResponse.class)
                .withName("CreateEnvironment")
                .withUri("/v1/{project_id}/cae/environments")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("X-Enterprise-Project-ID",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateEnvironmentRequest::getXEnterpriseProjectID, (req, v) -> {
                req.setXEnterpriseProjectID(v);
            }));
        builder.<CreateEnvironmentRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateEnvironmentRequestBody.class),
            f -> f.withMarshaller(CreateEnvironmentRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteEnvironmentRequest, DeleteEnvironmentResponse> deleteEnvironment =
        genFordeleteEnvironment();

    private static HttpRequestDef<DeleteEnvironmentRequest, DeleteEnvironmentResponse> genFordeleteEnvironment() {
        // basic
        HttpRequestDef.Builder<DeleteEnvironmentRequest, DeleteEnvironmentResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteEnvironmentRequest.class, DeleteEnvironmentResponse.class)
                .withName("DeleteEnvironment")
                .withUri("/v1/{project_id}/cae/environments/{environment_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("environment_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteEnvironmentRequest::getEnvironmentId, (req, v) -> {
                req.setEnvironmentId(v);
            }));
        builder.<String>withRequestField("X-Enterprise-Project-ID",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteEnvironmentRequest::getXEnterpriseProjectID, (req, v) -> {
                req.setXEnterpriseProjectID(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListEnvironmentsRequest, ListEnvironmentsResponse> listEnvironments =
        genForlistEnvironments();

    private static HttpRequestDef<ListEnvironmentsRequest, ListEnvironmentsResponse> genForlistEnvironments() {
        // basic
        HttpRequestDef.Builder<ListEnvironmentsRequest, ListEnvironmentsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListEnvironmentsRequest.class, ListEnvironmentsResponse.class)
                .withName("ListEnvironments")
                .withUri("/v1/{project_id}/cae/environments")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("X-Enterprise-Project-ID",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEnvironmentsRequest::getXEnterpriseProjectID, (req, v) -> {
                req.setXEnterpriseProjectID(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RetryJobRequest, RetryJobResponse> retryJob = genForretryJob();

    private static HttpRequestDef<RetryJobRequest, RetryJobResponse> genForretryJob() {
        // basic
        HttpRequestDef.Builder<RetryJobRequest, RetryJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RetryJobRequest.class, RetryJobResponse.class)
                .withName("RetryJob")
                .withUri("/v1/{project_id}/cae/jobs/{job_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RetryJobRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));
        builder.<String>withRequestField("X-Enterprise-Project-ID",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RetryJobRequest::getXEnterpriseProjectID, (req, v) -> {
                req.setXEnterpriseProjectID(v);
            }));
        builder.<String>withRequestField("X-Environment-ID",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RetryJobRequest::getXEnvironmentID, (req, v) -> {
                req.setXEnvironmentID(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowJobRequest, ShowJobResponse> showJob = genForshowJob();

    private static HttpRequestDef<ShowJobRequest, ShowJobResponse> genForshowJob() {
        // basic
        HttpRequestDef.Builder<ShowJobRequest, ShowJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowJobRequest.class, ShowJobResponse.class)
                .withName("ShowJob")
                .withUri("/v1/{project_id}/cae/jobs/{job_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJobRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));
        builder.<String>withRequestField("X-Enterprise-Project-ID",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJobRequest::getXEnterpriseProjectID, (req, v) -> {
                req.setXEnterpriseProjectID(v);
            }));
        builder.<String>withRequestField("X-Environment-ID",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJobRequest::getXEnvironmentID, (req, v) -> {
                req.setXEnvironmentID(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateMonitorSystemRequest, CreateMonitorSystemResponse> createMonitorSystem =
        genForcreateMonitorSystem();

    private static HttpRequestDef<CreateMonitorSystemRequest, CreateMonitorSystemResponse> genForcreateMonitorSystem() {
        // basic
        HttpRequestDef.Builder<CreateMonitorSystemRequest, CreateMonitorSystemResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateMonitorSystemRequest.class, CreateMonitorSystemResponse.class)
                .withName("CreateMonitorSystem")
                .withUri("/v1/{project_id}/cae/monitor-system")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("X-Enterprise-Project-ID",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateMonitorSystemRequest::getXEnterpriseProjectID, (req, v) -> {
                req.setXEnterpriseProjectID(v);
            }));
        builder.<String>withRequestField("X-Environment-ID",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateMonitorSystemRequest::getXEnvironmentID, (req, v) -> {
                req.setXEnvironmentID(v);
            }));
        builder.<MonitorSystemRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(MonitorSystemRequestBody.class),
            f -> f.withMarshaller(CreateMonitorSystemRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowMonitorSystemRequest, ShowMonitorSystemResponse> showMonitorSystem =
        genForshowMonitorSystem();

    private static HttpRequestDef<ShowMonitorSystemRequest, ShowMonitorSystemResponse> genForshowMonitorSystem() {
        // basic
        HttpRequestDef.Builder<ShowMonitorSystemRequest, ShowMonitorSystemResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowMonitorSystemRequest.class, ShowMonitorSystemResponse.class)
                .withName("ShowMonitorSystem")
                .withUri("/v1/{project_id}/cae/monitor-system")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("X-Enterprise-Project-ID",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMonitorSystemRequest::getXEnterpriseProjectID, (req, v) -> {
                req.setXEnterpriseProjectID(v);
            }));
        builder.<String>withRequestField("X-Environment-ID",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMonitorSystemRequest::getXEnvironmentID, (req, v) -> {
                req.setXEnvironmentID(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateMonitorSystemRequest, UpdateMonitorSystemResponse> updateMonitorSystem =
        genForupdateMonitorSystem();

    private static HttpRequestDef<UpdateMonitorSystemRequest, UpdateMonitorSystemResponse> genForupdateMonitorSystem() {
        // basic
        HttpRequestDef.Builder<UpdateMonitorSystemRequest, UpdateMonitorSystemResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateMonitorSystemRequest.class, UpdateMonitorSystemResponse.class)
                .withName("UpdateMonitorSystem")
                .withUri("/v1/{project_id}/cae/monitor-system/{monitor_system_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("monitor_system_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateMonitorSystemRequest::getMonitorSystemId, (req, v) -> {
                req.setMonitorSystemId(v);
            }));
        builder.<String>withRequestField("X-Enterprise-Project-ID",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateMonitorSystemRequest::getXEnterpriseProjectID, (req, v) -> {
                req.setXEnterpriseProjectID(v);
            }));
        builder.<String>withRequestField("X-Environment-ID",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateMonitorSystemRequest::getXEnvironmentID, (req, v) -> {
                req.setXEnvironmentID(v);
            }));
        builder.<MonitorSystemRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(MonitorSystemRequestBody.class),
            f -> f.withMarshaller(UpdateMonitorSystemRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateTimerRuleRequest, CreateTimerRuleResponse> createTimerRule =
        genForcreateTimerRule();

    private static HttpRequestDef<CreateTimerRuleRequest, CreateTimerRuleResponse> genForcreateTimerRule() {
        // basic
        HttpRequestDef.Builder<CreateTimerRuleRequest, CreateTimerRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateTimerRuleRequest.class, CreateTimerRuleResponse.class)
                .withName("CreateTimerRule")
                .withUri("/v1/{project_id}/cae/timer-rules")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("X-Enterprise-Project-ID",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateTimerRuleRequest::getXEnterpriseProjectID, (req, v) -> {
                req.setXEnterpriseProjectID(v);
            }));
        builder.<String>withRequestField("X-Environment-ID",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateTimerRuleRequest::getXEnvironmentID, (req, v) -> {
                req.setXEnvironmentID(v);
            }));
        builder.<CreateTimerRuleReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateTimerRuleReq.class),
            f -> f.withMarshaller(CreateTimerRuleRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteTimerRuleRequest, DeleteTimerRuleResponse> deleteTimerRule =
        genFordeleteTimerRule();

    private static HttpRequestDef<DeleteTimerRuleRequest, DeleteTimerRuleResponse> genFordeleteTimerRule() {
        // basic
        HttpRequestDef.Builder<DeleteTimerRuleRequest, DeleteTimerRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteTimerRuleRequest.class, DeleteTimerRuleResponse.class)
                .withName("DeleteTimerRule")
                .withUri("/v1/{project_id}/cae/timer-rules/{timer_rule_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("timer_rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTimerRuleRequest::getTimerRuleId, (req, v) -> {
                req.setTimerRuleId(v);
            }));
        builder.<String>withRequestField("X-Enterprise-Project-ID",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTimerRuleRequest::getXEnterpriseProjectID, (req, v) -> {
                req.setXEnterpriseProjectID(v);
            }));
        builder.<String>withRequestField("X-Environment-ID",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTimerRuleRequest::getXEnvironmentID, (req, v) -> {
                req.setXEnvironmentID(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTimerRulesRequest, ListTimerRulesResponse> listTimerRules =
        genForlistTimerRules();

    private static HttpRequestDef<ListTimerRulesRequest, ListTimerRulesResponse> genForlistTimerRules() {
        // basic
        HttpRequestDef.Builder<ListTimerRulesRequest, ListTimerRulesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListTimerRulesRequest.class, ListTimerRulesResponse.class)
                .withName("ListTimerRules")
                .withUri("/v1/{project_id}/cae/timer-rules")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("X-Enterprise-Project-ID",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTimerRulesRequest::getXEnterpriseProjectID, (req, v) -> {
                req.setXEnterpriseProjectID(v);
            }));
        builder.<String>withRequestField("X-Environment-ID",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTimerRulesRequest::getXEnvironmentID, (req, v) -> {
                req.setXEnvironmentID(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowExecutionResultRequest, ShowExecutionResultResponse> showExecutionResult =
        genForshowExecutionResult();

    private static HttpRequestDef<ShowExecutionResultRequest, ShowExecutionResultResponse> genForshowExecutionResult() {
        // basic
        HttpRequestDef.Builder<ShowExecutionResultRequest, ShowExecutionResultResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowExecutionResultRequest.class, ShowExecutionResultResponse.class)
                .withName("ShowExecutionResult")
                .withUri("/v1/{project_id}/cae/timer-rules/{timer_rule_id}/execution-results")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("timer_rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowExecutionResultRequest::getTimerRuleId, (req, v) -> {
                req.setTimerRuleId(v);
            }));
        builder.<String>withRequestField("X-Enterprise-Project-ID",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowExecutionResultRequest::getXEnterpriseProjectID, (req, v) -> {
                req.setXEnterpriseProjectID(v);
            }));
        builder.<String>withRequestField("X-Environment-ID",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowExecutionResultRequest::getXEnvironmentID, (req, v) -> {
                req.setXEnvironmentID(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateTimerRuleRequest, UpdateTimerRuleResponse> updateTimerRule =
        genForupdateTimerRule();

    private static HttpRequestDef<UpdateTimerRuleRequest, UpdateTimerRuleResponse> genForupdateTimerRule() {
        // basic
        HttpRequestDef.Builder<UpdateTimerRuleRequest, UpdateTimerRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateTimerRuleRequest.class, UpdateTimerRuleResponse.class)
                .withName("UpdateTimerRule")
                .withUri("/v1/{project_id}/cae/timer-rules/{timer_rule_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("timer_rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateTimerRuleRequest::getTimerRuleId, (req, v) -> {
                req.setTimerRuleId(v);
            }));
        builder.<String>withRequestField("X-Enterprise-Project-ID",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateTimerRuleRequest::getXEnterpriseProjectID, (req, v) -> {
                req.setXEnterpriseProjectID(v);
            }));
        builder.<String>withRequestField("X-Environment-ID",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateTimerRuleRequest::getXEnvironmentID, (req, v) -> {
                req.setXEnvironmentID(v);
            }));
        builder.<UpdateTimerRuleReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateTimerRuleReq.class),
            f -> f.withMarshaller(UpdateTimerRuleRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateVolumeRequest, CreateVolumeResponse> createVolume = genForcreateVolume();

    private static HttpRequestDef<CreateVolumeRequest, CreateVolumeResponse> genForcreateVolume() {
        // basic
        HttpRequestDef.Builder<CreateVolumeRequest, CreateVolumeResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateVolumeRequest.class, CreateVolumeResponse.class)
                .withName("CreateVolume")
                .withUri("/v1/{project_id}/cae/volumes")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("X-Enterprise-Project-ID",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateVolumeRequest::getXEnterpriseProjectID, (req, v) -> {
                req.setXEnterpriseProjectID(v);
            }));
        builder.<String>withRequestField("X-Environment-ID",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateVolumeRequest::getXEnvironmentID, (req, v) -> {
                req.setXEnvironmentID(v);
            }));
        builder.<CreateVolumeReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateVolumeReq.class),
            f -> f.withMarshaller(CreateVolumeRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteVolumeRequest, DeleteVolumeResponse> deleteVolume = genFordeleteVolume();

    private static HttpRequestDef<DeleteVolumeRequest, DeleteVolumeResponse> genFordeleteVolume() {
        // basic
        HttpRequestDef.Builder<DeleteVolumeRequest, DeleteVolumeResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteVolumeRequest.class, DeleteVolumeResponse.class)
                .withName("DeleteVolume")
                .withUri("/v1/{project_id}/cae/volumes/{id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteVolumeRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<String>withRequestField("X-Enterprise-Project-ID",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteVolumeRequest::getXEnterpriseProjectID, (req, v) -> {
                req.setXEnterpriseProjectID(v);
            }));
        builder.<String>withRequestField("X-Environment-ID",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteVolumeRequest::getXEnvironmentID, (req, v) -> {
                req.setXEnvironmentID(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListVolumesRequest, ListVolumesResponse> listVolumes = genForlistVolumes();

    private static HttpRequestDef<ListVolumesRequest, ListVolumesResponse> genForlistVolumes() {
        // basic
        HttpRequestDef.Builder<ListVolumesRequest, ListVolumesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListVolumesRequest.class, ListVolumesResponse.class)
                .withName("ListVolumes")
                .withUri("/v1/{project_id}/cae/volumes")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("resource_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVolumesRequest::getResourceType, (req, v) -> {
                req.setResourceType(v);
            }));
        builder.<String>withRequestField("X-Enterprise-Project-ID",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVolumesRequest::getXEnterpriseProjectID, (req, v) -> {
                req.setXEnterpriseProjectID(v);
            }));
        builder.<String>withRequestField("X-Environment-ID",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVolumesRequest::getXEnvironmentID, (req, v) -> {
                req.setXEnvironmentID(v);
            }));

        // response

        return builder.build();
    }

}
