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
import com.huaweicloud.sdk.cae.v1.model.CreateComponentWithConfigurationRequest;
import com.huaweicloud.sdk.cae.v1.model.CreateComponentWithConfigurationRequestBody;
import com.huaweicloud.sdk.cae.v1.model.CreateComponentWithConfigurationResponse;
import com.huaweicloud.sdk.cae.v1.model.CreateDomainReq;
import com.huaweicloud.sdk.cae.v1.model.CreateDomainRequest;
import com.huaweicloud.sdk.cae.v1.model.CreateDomainResponse;
import com.huaweicloud.sdk.cae.v1.model.CreateEnvironmentRequest;
import com.huaweicloud.sdk.cae.v1.model.CreateEnvironmentRequestBody;
import com.huaweicloud.sdk.cae.v1.model.CreateEnvironmentResponse;
import com.huaweicloud.sdk.cae.v1.model.CreateMonitorSystemRequest;
import com.huaweicloud.sdk.cae.v1.model.CreateMonitorSystemResponse;
import com.huaweicloud.sdk.cae.v1.model.CreateNoticeRuleReq;
import com.huaweicloud.sdk.cae.v1.model.CreateNoticeRuleRequest;
import com.huaweicloud.sdk.cae.v1.model.CreateNoticeRuleResponse;
import com.huaweicloud.sdk.cae.v1.model.CreateTimerRuleReq;
import com.huaweicloud.sdk.cae.v1.model.CreateTimerRuleRequest;
import com.huaweicloud.sdk.cae.v1.model.CreateTimerRuleResponse;
import com.huaweicloud.sdk.cae.v1.model.CreateVolumeReq;
import com.huaweicloud.sdk.cae.v1.model.CreateVolumeRequest;
import com.huaweicloud.sdk.cae.v1.model.CreateVolumeResponse;
import com.huaweicloud.sdk.cae.v1.model.CreateVpcEgressRequest;
import com.huaweicloud.sdk.cae.v1.model.CreateVpcEgressResponse;
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
import com.huaweicloud.sdk.cae.v1.model.DeleteNoticeRuleRequest;
import com.huaweicloud.sdk.cae.v1.model.DeleteNoticeRuleResponse;
import com.huaweicloud.sdk.cae.v1.model.DeleteTimerRuleRequest;
import com.huaweicloud.sdk.cae.v1.model.DeleteTimerRuleResponse;
import com.huaweicloud.sdk.cae.v1.model.DeleteVolumeRequest;
import com.huaweicloud.sdk.cae.v1.model.DeleteVolumeResponse;
import com.huaweicloud.sdk.cae.v1.model.DeleteVpcEgressRequest;
import com.huaweicloud.sdk.cae.v1.model.DeleteVpcEgressResponse;
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
import com.huaweicloud.sdk.cae.v1.model.ListNoticeRulesRequest;
import com.huaweicloud.sdk.cae.v1.model.ListNoticeRulesResponse;
import com.huaweicloud.sdk.cae.v1.model.ListTimerRulesRequest;
import com.huaweicloud.sdk.cae.v1.model.ListTimerRulesResponse;
import com.huaweicloud.sdk.cae.v1.model.ListVolumesRequest;
import com.huaweicloud.sdk.cae.v1.model.ListVolumesResponse;
import com.huaweicloud.sdk.cae.v1.model.ListVpcEgressRequest;
import com.huaweicloud.sdk.cae.v1.model.ListVpcEgressResponse;
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
import com.huaweicloud.sdk.cae.v1.model.ShowNoticeRuleRequest;
import com.huaweicloud.sdk.cae.v1.model.ShowNoticeRuleResponse;
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
import com.huaweicloud.sdk.cae.v1.model.UpdateNoticeRuleReq;
import com.huaweicloud.sdk.cae.v1.model.UpdateNoticeRuleRequest;
import com.huaweicloud.sdk.cae.v1.model.UpdateNoticeRuleResponse;
import com.huaweicloud.sdk.cae.v1.model.UpdateTimerRuleReq;
import com.huaweicloud.sdk.cae.v1.model.UpdateTimerRuleRequest;
import com.huaweicloud.sdk.cae.v1.model.UpdateTimerRuleResponse;
import com.huaweicloud.sdk.cae.v1.model.VpcEgressRequestBody;
import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;

@SuppressWarnings("unchecked")
public class CaeMeta {

    public static final HttpRequestDef<CreateAgencyRequest, CreateAgencyResponse> createAgency = genForCreateAgency();

    private static HttpRequestDef<CreateAgencyRequest, CreateAgencyResponse> genForCreateAgency() {
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
            f -> f.withMarshaller(CreateAgencyRequest::getBody, CreateAgencyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAgenciesRequest, ListAgenciesResponse> listAgencies = genForListAgencies();

    private static HttpRequestDef<ListAgenciesRequest, ListAgenciesResponse> genForListAgencies() {
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
        genForCreateApplication();

    private static HttpRequestDef<CreateApplicationRequest, CreateApplicationResponse> genForCreateApplication() {
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
            f -> f.withMarshaller(CreateApplicationRequest::getXEnterpriseProjectID,
                CreateApplicationRequest::setXEnterpriseProjectID));
        builder.<String>withRequestField("X-Environment-ID",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateApplicationRequest::getXEnvironmentID,
                CreateApplicationRequest::setXEnvironmentID));
        builder.<CreateApplicationRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateApplicationRequestBody.class),
            f -> f.withMarshaller(CreateApplicationRequest::getBody, CreateApplicationRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteApplicationRequest, DeleteApplicationResponse> deleteApplication =
        genForDeleteApplication();

    private static HttpRequestDef<DeleteApplicationRequest, DeleteApplicationResponse> genForDeleteApplication() {
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
            f -> f.withMarshaller(DeleteApplicationRequest::getApplicationId,
                DeleteApplicationRequest::setApplicationId));
        builder.<String>withRequestField("X-Enterprise-Project-ID",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteApplicationRequest::getXEnterpriseProjectID,
                DeleteApplicationRequest::setXEnterpriseProjectID));
        builder.<String>withRequestField("X-Environment-ID",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteApplicationRequest::getXEnvironmentID,
                DeleteApplicationRequest::setXEnvironmentID));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListApplicationsRequest, ListApplicationsResponse> listApplications =
        genForListApplications();

    private static HttpRequestDef<ListApplicationsRequest, ListApplicationsResponse> genForListApplications() {
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
            f -> f.withMarshaller(ListApplicationsRequest::getXEnterpriseProjectID,
                ListApplicationsRequest::setXEnterpriseProjectID));
        builder.<String>withRequestField("X-Environment-ID",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApplicationsRequest::getXEnvironmentID,
                ListApplicationsRequest::setXEnvironmentID));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowApplicationRequest, ShowApplicationResponse> showApplication =
        genForShowApplication();

    private static HttpRequestDef<ShowApplicationRequest, ShowApplicationResponse> genForShowApplication() {
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
            f -> f.withMarshaller(ShowApplicationRequest::getApplicationId, ShowApplicationRequest::setApplicationId));
        builder.<String>withRequestField("X-Enterprise-Project-ID",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowApplicationRequest::getXEnterpriseProjectID,
                ShowApplicationRequest::setXEnterpriseProjectID));
        builder.<String>withRequestField("X-Environment-ID",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowApplicationRequest::getXEnvironmentID,
                ShowApplicationRequest::setXEnvironmentID));

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
                .withUri("/v1/{project_id}/cae/certificates")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("X-Enterprise-Project-ID",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateCertificateRequest::getXEnterpriseProjectID,
                CreateCertificateRequest::setXEnterpriseProjectID));
        builder.<String>withRequestField("X-Environment-ID",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateCertificateRequest::getXEnvironmentID,
                CreateCertificateRequest::setXEnvironmentID));
        builder.<CertReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CertReq.class),
            f -> f.withMarshaller(CreateCertificateRequest::getBody, CreateCertificateRequest::setBody));

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
                .withUri("/v1/{project_id}/cae/certificates/{certificate_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("certificate_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteCertificateRequest::getCertificateId,
                DeleteCertificateRequest::setCertificateId));
        builder.<String>withRequestField("X-Enterprise-Project-ID",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteCertificateRequest::getXEnterpriseProjectID,
                DeleteCertificateRequest::setXEnterpriseProjectID));
        builder.<String>withRequestField("X-Environment-ID",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteCertificateRequest::getXEnvironmentID,
                DeleteCertificateRequest::setXEnvironmentID));

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
                .withUri("/v1/{project_id}/cae/certificates")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("X-Enterprise-Project-ID",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCertificatesRequest::getXEnterpriseProjectID,
                ListCertificatesRequest::setXEnterpriseProjectID));
        builder.<String>withRequestField("X-Environment-ID",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCertificatesRequest::getXEnvironmentID,
                ListCertificatesRequest::setXEnvironmentID));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateCertificateRequest, UpdateCertificateResponse> updateCertificate =
        genForUpdateCertificate();

    private static HttpRequestDef<UpdateCertificateRequest, UpdateCertificateResponse> genForUpdateCertificate() {
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
            f -> f.withMarshaller(UpdateCertificateRequest::getCertificateId,
                UpdateCertificateRequest::setCertificateId));
        builder.<String>withRequestField("X-Enterprise-Project-ID",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateCertificateRequest::getXEnterpriseProjectID,
                UpdateCertificateRequest::setXEnterpriseProjectID));
        builder.<String>withRequestField("X-Environment-ID",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateCertificateRequest::getXEnvironmentID,
                UpdateCertificateRequest::setXEnvironmentID));
        builder.<UpdateCertReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateCertReq.class),
            f -> f.withMarshaller(UpdateCertificateRequest::getBody, UpdateCertificateRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateComponentRequest, CreateComponentResponse> createComponent =
        genForCreateComponent();

    private static HttpRequestDef<CreateComponentRequest, CreateComponentResponse> genForCreateComponent() {
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
            f -> f.withMarshaller(CreateComponentRequest::getApplicationId, CreateComponentRequest::setApplicationId));
        builder.<String>withRequestField("X-Enterprise-Project-ID",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateComponentRequest::getXEnterpriseProjectID,
                CreateComponentRequest::setXEnterpriseProjectID));
        builder.<String>withRequestField("X-Environment-ID",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateComponentRequest::getXEnvironmentID,
                CreateComponentRequest::setXEnvironmentID));
        builder.<CreateComponentRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateComponentRequestBody.class),
            f -> f.withMarshaller(CreateComponentRequest::getBody, CreateComponentRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateComponentWithConfigurationRequest, CreateComponentWithConfigurationResponse> createComponentWithConfiguration =
        genForCreateComponentWithConfiguration();

    private static HttpRequestDef<CreateComponentWithConfigurationRequest, CreateComponentWithConfigurationResponse> genForCreateComponentWithConfiguration() {
        // basic
        HttpRequestDef.Builder<CreateComponentWithConfigurationRequest, CreateComponentWithConfigurationResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateComponentWithConfigurationRequest.class,
                    CreateComponentWithConfigurationResponse.class)
                .withName("CreateComponentWithConfiguration")
                .withUri("/v1/{project_id}/cae/applications/{application_id}/component-with-configurations")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("application_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateComponentWithConfigurationRequest::getApplicationId,
                CreateComponentWithConfigurationRequest::setApplicationId));
        builder.<String>withRequestField("X-Enterprise-Project-ID",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateComponentWithConfigurationRequest::getXEnterpriseProjectID,
                CreateComponentWithConfigurationRequest::setXEnterpriseProjectID));
        builder.<String>withRequestField("X-Environment-ID",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateComponentWithConfigurationRequest::getXEnvironmentID,
                CreateComponentWithConfigurationRequest::setXEnvironmentID));
        builder.<CreateComponentWithConfigurationRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateComponentWithConfigurationRequestBody.class),
            f -> f.withMarshaller(CreateComponentWithConfigurationRequest::getBody,
                CreateComponentWithConfigurationRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteComponentRequest, DeleteComponentResponse> deleteComponent =
        genForDeleteComponent();

    private static HttpRequestDef<DeleteComponentRequest, DeleteComponentResponse> genForDeleteComponent() {
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
            f -> f.withMarshaller(DeleteComponentRequest::getApplicationId, DeleteComponentRequest::setApplicationId));
        builder.<String>withRequestField("component_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteComponentRequest::getComponentId, DeleteComponentRequest::setComponentId));
        builder.<String>withRequestField("X-Enterprise-Project-ID",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteComponentRequest::getXEnterpriseProjectID,
                DeleteComponentRequest::setXEnterpriseProjectID));
        builder.<String>withRequestField("X-Environment-ID",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteComponentRequest::getXEnvironmentID,
                DeleteComponentRequest::setXEnvironmentID));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExecuteActionRequest, ExecuteActionResponse> executeAction =
        genForExecuteAction();

    private static HttpRequestDef<ExecuteActionRequest, ExecuteActionResponse> genForExecuteAction() {
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
            f -> f.withMarshaller(ExecuteActionRequest::getApplicationId, ExecuteActionRequest::setApplicationId));
        builder.<String>withRequestField("component_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExecuteActionRequest::getComponentId, ExecuteActionRequest::setComponentId));
        builder.<String>withRequestField("X-Enterprise-Project-ID",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExecuteActionRequest::getXEnterpriseProjectID,
                ExecuteActionRequest::setXEnterpriseProjectID));
        builder.<String>withRequestField("X-Environment-ID",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExecuteActionRequest::getXEnvironmentID, ExecuteActionRequest::setXEnvironmentID));
        builder.<ExecuteActionRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ExecuteActionRequestBody.class),
            f -> f.withMarshaller(ExecuteActionRequest::getBody, ExecuteActionRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListComponentInstancesRequest, ListComponentInstancesResponse> listComponentInstances =
        genForListComponentInstances();

    private static HttpRequestDef<ListComponentInstancesRequest, ListComponentInstancesResponse> genForListComponentInstances() {
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
            f -> f.withMarshaller(ListComponentInstancesRequest::getApplicationId,
                ListComponentInstancesRequest::setApplicationId));
        builder.<String>withRequestField("component_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListComponentInstancesRequest::getComponentId,
                ListComponentInstancesRequest::setComponentId));
        builder.<String>withRequestField("X-Enterprise-Project-ID",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListComponentInstancesRequest::getXEnterpriseProjectID,
                ListComponentInstancesRequest::setXEnterpriseProjectID));
        builder.<String>withRequestField("X-Environment-ID",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListComponentInstancesRequest::getXEnvironmentID,
                ListComponentInstancesRequest::setXEnvironmentID));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListComponentSnapshotsRequest, ListComponentSnapshotsResponse> listComponentSnapshots =
        genForListComponentSnapshots();

    private static HttpRequestDef<ListComponentSnapshotsRequest, ListComponentSnapshotsResponse> genForListComponentSnapshots() {
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
            f -> f.withMarshaller(ListComponentSnapshotsRequest::getApplicationId,
                ListComponentSnapshotsRequest::setApplicationId));
        builder.<String>withRequestField("component_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListComponentSnapshotsRequest::getComponentId,
                ListComponentSnapshotsRequest::setComponentId));
        builder.<String>withRequestField("X-Enterprise-Project-ID",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListComponentSnapshotsRequest::getXEnterpriseProjectID,
                ListComponentSnapshotsRequest::setXEnterpriseProjectID));
        builder.<String>withRequestField("X-Environment-ID",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListComponentSnapshotsRequest::getXEnvironmentID,
                ListComponentSnapshotsRequest::setXEnvironmentID));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListComponentsRequest, ListComponentsResponse> listComponents =
        genForListComponents();

    private static HttpRequestDef<ListComponentsRequest, ListComponentsResponse> genForListComponents() {
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
            f -> f.withMarshaller(ListComponentsRequest::getApplicationId, ListComponentsRequest::setApplicationId));
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListComponentsRequest::getLimit, ListComponentsRequest::setLimit));
        builder.<String>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListComponentsRequest::getOffset, ListComponentsRequest::setOffset));
        builder.<String>withRequestField("X-Enterprise-Project-ID",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListComponentsRequest::getXEnterpriseProjectID,
                ListComponentsRequest::setXEnterpriseProjectID));
        builder.<String>withRequestField("X-Environment-ID",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListComponentsRequest::getXEnvironmentID, ListComponentsRequest::setXEnvironmentID));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowComponentRequest, ShowComponentResponse> showComponent =
        genForShowComponent();

    private static HttpRequestDef<ShowComponentRequest, ShowComponentResponse> genForShowComponent() {
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
            f -> f.withMarshaller(ShowComponentRequest::getApplicationId, ShowComponentRequest::setApplicationId));
        builder.<String>withRequestField("component_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowComponentRequest::getComponentId, ShowComponentRequest::setComponentId));
        builder.<String>withRequestField("X-Enterprise-Project-ID",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowComponentRequest::getXEnterpriseProjectID,
                ShowComponentRequest::setXEnterpriseProjectID));
        builder.<String>withRequestField("X-Environment-ID",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowComponentRequest::getXEnvironmentID, ShowComponentRequest::setXEnvironmentID));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateComponentRequest, UpdateComponentResponse> updateComponent =
        genForUpdateComponent();

    private static HttpRequestDef<UpdateComponentRequest, UpdateComponentResponse> genForUpdateComponent() {
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
            f -> f.withMarshaller(UpdateComponentRequest::getApplicationId, UpdateComponentRequest::setApplicationId));
        builder.<String>withRequestField("component_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateComponentRequest::getComponentId, UpdateComponentRequest::setComponentId));
        builder.<String>withRequestField("X-Enterprise-Project-ID",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateComponentRequest::getXEnterpriseProjectID,
                UpdateComponentRequest::setXEnterpriseProjectID));
        builder.<String>withRequestField("X-Environment-ID",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateComponentRequest::getXEnvironmentID,
                UpdateComponentRequest::setXEnvironmentID));
        builder.<UpdateComponentRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateComponentRequestBody.class),
            f -> f.withMarshaller(UpdateComponentRequest::getBody, UpdateComponentRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateComponentConfigurationRequest, CreateComponentConfigurationResponse> createComponentConfiguration =
        genForCreateComponentConfiguration();

    private static HttpRequestDef<CreateComponentConfigurationRequest, CreateComponentConfigurationResponse> genForCreateComponentConfiguration() {
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
            f -> f.withMarshaller(CreateComponentConfigurationRequest::getApplicationId,
                CreateComponentConfigurationRequest::setApplicationId));
        builder.<String>withRequestField("component_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateComponentConfigurationRequest::getComponentId,
                CreateComponentConfigurationRequest::setComponentId));
        builder.<String>withRequestField("X-Enterprise-Project-ID",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateComponentConfigurationRequest::getXEnterpriseProjectID,
                CreateComponentConfigurationRequest::setXEnterpriseProjectID));
        builder.<String>withRequestField("X-Environment-ID",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateComponentConfigurationRequest::getXEnvironmentID,
                CreateComponentConfigurationRequest::setXEnvironmentID));
        builder.<CreateComponentConfigurationRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateComponentConfigurationRequestBody.class),
            f -> f.withMarshaller(CreateComponentConfigurationRequest::getBody,
                CreateComponentConfigurationRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteComponentConfigurationRequest, DeleteComponentConfigurationResponse> deleteComponentConfiguration =
        genForDeleteComponentConfiguration();

    private static HttpRequestDef<DeleteComponentConfigurationRequest, DeleteComponentConfigurationResponse> genForDeleteComponentConfiguration() {
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
            f -> f.withMarshaller(DeleteComponentConfigurationRequest::getApplicationId,
                DeleteComponentConfigurationRequest::setApplicationId));
        builder.<String>withRequestField("component_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteComponentConfigurationRequest::getComponentId,
                DeleteComponentConfigurationRequest::setComponentId));
        builder.<String>withRequestField("X-Enterprise-Project-ID",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteComponentConfigurationRequest::getXEnterpriseProjectID,
                DeleteComponentConfigurationRequest::setXEnterpriseProjectID));
        builder.<String>withRequestField("X-Environment-ID",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteComponentConfigurationRequest::getXEnvironmentID,
                DeleteComponentConfigurationRequest::setXEnvironmentID));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListComponentConfigurationsRequest, ListComponentConfigurationsResponse> listComponentConfigurations =
        genForListComponentConfigurations();

    private static HttpRequestDef<ListComponentConfigurationsRequest, ListComponentConfigurationsResponse> genForListComponentConfigurations() {
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
            f -> f.withMarshaller(ListComponentConfigurationsRequest::getApplicationId,
                ListComponentConfigurationsRequest::setApplicationId));
        builder.<String>withRequestField("component_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListComponentConfigurationsRequest::getComponentId,
                ListComponentConfigurationsRequest::setComponentId));
        builder.<String>withRequestField("X-Enterprise-Project-ID",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListComponentConfigurationsRequest::getXEnterpriseProjectID,
                ListComponentConfigurationsRequest::setXEnterpriseProjectID));
        builder.<String>withRequestField("X-Environment-ID",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListComponentConfigurationsRequest::getXEnvironmentID,
                ListComponentConfigurationsRequest::setXEnvironmentID));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateDomainRequest, CreateDomainResponse> createDomain = genForCreateDomain();

    private static HttpRequestDef<CreateDomainRequest, CreateDomainResponse> genForCreateDomain() {
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
            f -> f.withMarshaller(CreateDomainRequest::getXEnterpriseProjectID,
                CreateDomainRequest::setXEnterpriseProjectID));
        builder.<String>withRequestField("X-Environment-ID",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateDomainRequest::getXEnvironmentID, CreateDomainRequest::setXEnvironmentID));
        builder.<CreateDomainReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateDomainReq.class),
            f -> f.withMarshaller(CreateDomainRequest::getBody, CreateDomainRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteDomainRequest, DeleteDomainResponse> deleteDomain = genForDeleteDomain();

    private static HttpRequestDef<DeleteDomainRequest, DeleteDomainResponse> genForDeleteDomain() {
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
            f -> f.withMarshaller(DeleteDomainRequest::getDomainId, DeleteDomainRequest::setDomainId));
        builder.<String>withRequestField("X-Enterprise-Project-ID",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDomainRequest::getXEnterpriseProjectID,
                DeleteDomainRequest::setXEnterpriseProjectID));
        builder.<String>withRequestField("X-Environment-ID",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDomainRequest::getXEnvironmentID, DeleteDomainRequest::setXEnvironmentID));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDomainsRequest, ListDomainsResponse> listDomains = genForListDomains();

    private static HttpRequestDef<ListDomainsRequest, ListDomainsResponse> genForListDomains() {
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
            f -> f.withMarshaller(ListDomainsRequest::getXEnterpriseProjectID,
                ListDomainsRequest::setXEnterpriseProjectID));
        builder.<String>withRequestField("X-Environment-ID",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDomainsRequest::getXEnvironmentID, ListDomainsRequest::setXEnvironmentID));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListEipsRequest, ListEipsResponse> listEips = genForListEips();

    private static HttpRequestDef<ListEipsRequest, ListEipsResponse> genForListEips() {
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
            f -> f.withMarshaller(ListEipsRequest::getXEnterpriseProjectID, ListEipsRequest::setXEnterpriseProjectID));
        builder.<String>withRequestField("X-Environment-ID",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEipsRequest::getXEnvironmentID, ListEipsRequest::setXEnvironmentID));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateEipRequest, UpdateEipResponse> updateEip = genForUpdateEip();

    private static HttpRequestDef<UpdateEipRequest, UpdateEipResponse> genForUpdateEip() {
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
            f -> f.withMarshaller(UpdateEipRequest::getXEnterpriseProjectID,
                UpdateEipRequest::setXEnterpriseProjectID));
        builder.<String>withRequestField("X-Environment-ID",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateEipRequest::getXEnvironmentID, UpdateEipRequest::setXEnvironmentID));
        builder.<UpdateEipRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateEipRequestBody.class),
            f -> f.withMarshaller(UpdateEipRequest::getBody, UpdateEipRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateEnvironmentRequest, CreateEnvironmentResponse> createEnvironment =
        genForCreateEnvironment();

    private static HttpRequestDef<CreateEnvironmentRequest, CreateEnvironmentResponse> genForCreateEnvironment() {
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
            f -> f.withMarshaller(CreateEnvironmentRequest::getXEnterpriseProjectID,
                CreateEnvironmentRequest::setXEnterpriseProjectID));
        builder.<CreateEnvironmentRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateEnvironmentRequestBody.class),
            f -> f.withMarshaller(CreateEnvironmentRequest::getBody, CreateEnvironmentRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteEnvironmentRequest, DeleteEnvironmentResponse> deleteEnvironment =
        genForDeleteEnvironment();

    private static HttpRequestDef<DeleteEnvironmentRequest, DeleteEnvironmentResponse> genForDeleteEnvironment() {
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
            f -> f.withMarshaller(DeleteEnvironmentRequest::getEnvironmentId,
                DeleteEnvironmentRequest::setEnvironmentId));
        builder.<String>withRequestField("X-Enterprise-Project-ID",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteEnvironmentRequest::getXEnterpriseProjectID,
                DeleteEnvironmentRequest::setXEnterpriseProjectID));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListEnvironmentsRequest, ListEnvironmentsResponse> listEnvironments =
        genForListEnvironments();

    private static HttpRequestDef<ListEnvironmentsRequest, ListEnvironmentsResponse> genForListEnvironments() {
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
            f -> f.withMarshaller(ListEnvironmentsRequest::getXEnterpriseProjectID,
                ListEnvironmentsRequest::setXEnterpriseProjectID));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RetryJobRequest, RetryJobResponse> retryJob = genForRetryJob();

    private static HttpRequestDef<RetryJobRequest, RetryJobResponse> genForRetryJob() {
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
            f -> f.withMarshaller(RetryJobRequest::getJobId, RetryJobRequest::setJobId));
        builder.<String>withRequestField("X-Enterprise-Project-ID",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RetryJobRequest::getXEnterpriseProjectID, RetryJobRequest::setXEnterpriseProjectID));
        builder.<String>withRequestField("X-Environment-ID",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RetryJobRequest::getXEnvironmentID, RetryJobRequest::setXEnvironmentID));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowJobRequest, ShowJobResponse> showJob = genForShowJob();

    private static HttpRequestDef<ShowJobRequest, ShowJobResponse> genForShowJob() {
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
            f -> f.withMarshaller(ShowJobRequest::getJobId, ShowJobRequest::setJobId));
        builder.<String>withRequestField("X-Enterprise-Project-ID",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJobRequest::getXEnterpriseProjectID, ShowJobRequest::setXEnterpriseProjectID));
        builder.<String>withRequestField("X-Environment-ID",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJobRequest::getXEnvironmentID, ShowJobRequest::setXEnvironmentID));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateMonitorSystemRequest, CreateMonitorSystemResponse> createMonitorSystem =
        genForCreateMonitorSystem();

    private static HttpRequestDef<CreateMonitorSystemRequest, CreateMonitorSystemResponse> genForCreateMonitorSystem() {
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
            f -> f.withMarshaller(CreateMonitorSystemRequest::getXEnterpriseProjectID,
                CreateMonitorSystemRequest::setXEnterpriseProjectID));
        builder.<String>withRequestField("X-Environment-ID",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateMonitorSystemRequest::getXEnvironmentID,
                CreateMonitorSystemRequest::setXEnvironmentID));
        builder.<MonitorSystemRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(MonitorSystemRequestBody.class),
            f -> f.withMarshaller(CreateMonitorSystemRequest::getBody, CreateMonitorSystemRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowMonitorSystemRequest, ShowMonitorSystemResponse> showMonitorSystem =
        genForShowMonitorSystem();

    private static HttpRequestDef<ShowMonitorSystemRequest, ShowMonitorSystemResponse> genForShowMonitorSystem() {
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
            f -> f.withMarshaller(ShowMonitorSystemRequest::getXEnterpriseProjectID,
                ShowMonitorSystemRequest::setXEnterpriseProjectID));
        builder.<String>withRequestField("X-Environment-ID",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMonitorSystemRequest::getXEnvironmentID,
                ShowMonitorSystemRequest::setXEnvironmentID));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateMonitorSystemRequest, UpdateMonitorSystemResponse> updateMonitorSystem =
        genForUpdateMonitorSystem();

    private static HttpRequestDef<UpdateMonitorSystemRequest, UpdateMonitorSystemResponse> genForUpdateMonitorSystem() {
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
            f -> f.withMarshaller(UpdateMonitorSystemRequest::getMonitorSystemId,
                UpdateMonitorSystemRequest::setMonitorSystemId));
        builder.<String>withRequestField("X-Enterprise-Project-ID",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateMonitorSystemRequest::getXEnterpriseProjectID,
                UpdateMonitorSystemRequest::setXEnterpriseProjectID));
        builder.<String>withRequestField("X-Environment-ID",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateMonitorSystemRequest::getXEnvironmentID,
                UpdateMonitorSystemRequest::setXEnvironmentID));
        builder.<MonitorSystemRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(MonitorSystemRequestBody.class),
            f -> f.withMarshaller(UpdateMonitorSystemRequest::getBody, UpdateMonitorSystemRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateNoticeRuleRequest, CreateNoticeRuleResponse> createNoticeRule =
        genForCreateNoticeRule();

    private static HttpRequestDef<CreateNoticeRuleRequest, CreateNoticeRuleResponse> genForCreateNoticeRule() {
        // basic
        HttpRequestDef.Builder<CreateNoticeRuleRequest, CreateNoticeRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateNoticeRuleRequest.class, CreateNoticeRuleResponse.class)
                .withName("CreateNoticeRule")
                .withUri("/v1/{project_id}/cae/notice-rules")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("X-Enterprise-Project-ID",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateNoticeRuleRequest::getXEnterpriseProjectID,
                CreateNoticeRuleRequest::setXEnterpriseProjectID));
        builder.<String>withRequestField("X-Environment-ID",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateNoticeRuleRequest::getXEnvironmentID,
                CreateNoticeRuleRequest::setXEnvironmentID));
        builder.<CreateNoticeRuleReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateNoticeRuleReq.class),
            f -> f.withMarshaller(CreateNoticeRuleRequest::getBody, CreateNoticeRuleRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteNoticeRuleRequest, DeleteNoticeRuleResponse> deleteNoticeRule =
        genForDeleteNoticeRule();

    private static HttpRequestDef<DeleteNoticeRuleRequest, DeleteNoticeRuleResponse> genForDeleteNoticeRule() {
        // basic
        HttpRequestDef.Builder<DeleteNoticeRuleRequest, DeleteNoticeRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteNoticeRuleRequest.class, DeleteNoticeRuleResponse.class)
                .withName("DeleteNoticeRule")
                .withUri("/v1/{project_id}/cae/notice-rules/{rule_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteNoticeRuleRequest::getRuleId, DeleteNoticeRuleRequest::setRuleId));
        builder.<String>withRequestField("X-Enterprise-Project-ID",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteNoticeRuleRequest::getXEnterpriseProjectID,
                DeleteNoticeRuleRequest::setXEnterpriseProjectID));
        builder.<String>withRequestField("X-Environment-ID",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteNoticeRuleRequest::getXEnvironmentID,
                DeleteNoticeRuleRequest::setXEnvironmentID));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteNoticeRuleResponse::getBody, DeleteNoticeRuleResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<ListNoticeRulesRequest, ListNoticeRulesResponse> listNoticeRules =
        genForListNoticeRules();

    private static HttpRequestDef<ListNoticeRulesRequest, ListNoticeRulesResponse> genForListNoticeRules() {
        // basic
        HttpRequestDef.Builder<ListNoticeRulesRequest, ListNoticeRulesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListNoticeRulesRequest.class, ListNoticeRulesResponse.class)
                .withName("ListNoticeRules")
                .withUri("/v1/{project_id}/cae/notice-rules")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("X-Enterprise-Project-ID",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNoticeRulesRequest::getXEnterpriseProjectID,
                ListNoticeRulesRequest::setXEnterpriseProjectID));
        builder.<String>withRequestField("X-Environment-ID",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNoticeRulesRequest::getXEnvironmentID,
                ListNoticeRulesRequest::setXEnvironmentID));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowNoticeRuleRequest, ShowNoticeRuleResponse> showNoticeRule =
        genForShowNoticeRule();

    private static HttpRequestDef<ShowNoticeRuleRequest, ShowNoticeRuleResponse> genForShowNoticeRule() {
        // basic
        HttpRequestDef.Builder<ShowNoticeRuleRequest, ShowNoticeRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowNoticeRuleRequest.class, ShowNoticeRuleResponse.class)
                .withName("ShowNoticeRule")
                .withUri("/v1/{project_id}/cae/notice-rules/{rule_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowNoticeRuleRequest::getRuleId, ShowNoticeRuleRequest::setRuleId));
        builder.<String>withRequestField("X-Enterprise-Project-ID",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowNoticeRuleRequest::getXEnterpriseProjectID,
                ShowNoticeRuleRequest::setXEnterpriseProjectID));
        builder.<String>withRequestField("X-Environment-ID",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowNoticeRuleRequest::getXEnvironmentID, ShowNoticeRuleRequest::setXEnvironmentID));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateNoticeRuleRequest, UpdateNoticeRuleResponse> updateNoticeRule =
        genForUpdateNoticeRule();

    private static HttpRequestDef<UpdateNoticeRuleRequest, UpdateNoticeRuleResponse> genForUpdateNoticeRule() {
        // basic
        HttpRequestDef.Builder<UpdateNoticeRuleRequest, UpdateNoticeRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateNoticeRuleRequest.class, UpdateNoticeRuleResponse.class)
                .withName("UpdateNoticeRule")
                .withUri("/v1/{project_id}/cae/notice-rules/{rule_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateNoticeRuleRequest::getRuleId, UpdateNoticeRuleRequest::setRuleId));
        builder.<String>withRequestField("X-Enterprise-Project-ID",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateNoticeRuleRequest::getXEnterpriseProjectID,
                UpdateNoticeRuleRequest::setXEnterpriseProjectID));
        builder.<String>withRequestField("X-Environment-ID",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateNoticeRuleRequest::getXEnvironmentID,
                UpdateNoticeRuleRequest::setXEnvironmentID));
        builder.<UpdateNoticeRuleReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateNoticeRuleReq.class),
            f -> f.withMarshaller(UpdateNoticeRuleRequest::getBody, UpdateNoticeRuleRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateTimerRuleRequest, CreateTimerRuleResponse> createTimerRule =
        genForCreateTimerRule();

    private static HttpRequestDef<CreateTimerRuleRequest, CreateTimerRuleResponse> genForCreateTimerRule() {
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
            f -> f.withMarshaller(CreateTimerRuleRequest::getXEnterpriseProjectID,
                CreateTimerRuleRequest::setXEnterpriseProjectID));
        builder.<String>withRequestField("X-Environment-ID",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateTimerRuleRequest::getXEnvironmentID,
                CreateTimerRuleRequest::setXEnvironmentID));
        builder.<CreateTimerRuleReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateTimerRuleReq.class),
            f -> f.withMarshaller(CreateTimerRuleRequest::getBody, CreateTimerRuleRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteTimerRuleRequest, DeleteTimerRuleResponse> deleteTimerRule =
        genForDeleteTimerRule();

    private static HttpRequestDef<DeleteTimerRuleRequest, DeleteTimerRuleResponse> genForDeleteTimerRule() {
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
            f -> f.withMarshaller(DeleteTimerRuleRequest::getTimerRuleId, DeleteTimerRuleRequest::setTimerRuleId));
        builder.<String>withRequestField("X-Enterprise-Project-ID",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTimerRuleRequest::getXEnterpriseProjectID,
                DeleteTimerRuleRequest::setXEnterpriseProjectID));
        builder.<String>withRequestField("X-Environment-ID",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTimerRuleRequest::getXEnvironmentID,
                DeleteTimerRuleRequest::setXEnvironmentID));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTimerRulesRequest, ListTimerRulesResponse> listTimerRules =
        genForListTimerRules();

    private static HttpRequestDef<ListTimerRulesRequest, ListTimerRulesResponse> genForListTimerRules() {
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
            f -> f.withMarshaller(ListTimerRulesRequest::getXEnterpriseProjectID,
                ListTimerRulesRequest::setXEnterpriseProjectID));
        builder.<String>withRequestField("X-Environment-ID",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTimerRulesRequest::getXEnvironmentID, ListTimerRulesRequest::setXEnvironmentID));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowExecutionResultRequest, ShowExecutionResultResponse> showExecutionResult =
        genForShowExecutionResult();

    private static HttpRequestDef<ShowExecutionResultRequest, ShowExecutionResultResponse> genForShowExecutionResult() {
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
            f -> f.withMarshaller(ShowExecutionResultRequest::getTimerRuleId,
                ShowExecutionResultRequest::setTimerRuleId));
        builder.<String>withRequestField("X-Enterprise-Project-ID",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowExecutionResultRequest::getXEnterpriseProjectID,
                ShowExecutionResultRequest::setXEnterpriseProjectID));
        builder.<String>withRequestField("X-Environment-ID",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowExecutionResultRequest::getXEnvironmentID,
                ShowExecutionResultRequest::setXEnvironmentID));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateTimerRuleRequest, UpdateTimerRuleResponse> updateTimerRule =
        genForUpdateTimerRule();

    private static HttpRequestDef<UpdateTimerRuleRequest, UpdateTimerRuleResponse> genForUpdateTimerRule() {
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
            f -> f.withMarshaller(UpdateTimerRuleRequest::getTimerRuleId, UpdateTimerRuleRequest::setTimerRuleId));
        builder.<String>withRequestField("X-Enterprise-Project-ID",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateTimerRuleRequest::getXEnterpriseProjectID,
                UpdateTimerRuleRequest::setXEnterpriseProjectID));
        builder.<String>withRequestField("X-Environment-ID",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateTimerRuleRequest::getXEnvironmentID,
                UpdateTimerRuleRequest::setXEnvironmentID));
        builder.<UpdateTimerRuleReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateTimerRuleReq.class),
            f -> f.withMarshaller(UpdateTimerRuleRequest::getBody, UpdateTimerRuleRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateVolumeRequest, CreateVolumeResponse> createVolume = genForCreateVolume();

    private static HttpRequestDef<CreateVolumeRequest, CreateVolumeResponse> genForCreateVolume() {
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
            f -> f.withMarshaller(CreateVolumeRequest::getXEnterpriseProjectID,
                CreateVolumeRequest::setXEnterpriseProjectID));
        builder.<String>withRequestField("X-Environment-ID",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateVolumeRequest::getXEnvironmentID, CreateVolumeRequest::setXEnvironmentID));
        builder.<CreateVolumeReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateVolumeReq.class),
            f -> f.withMarshaller(CreateVolumeRequest::getBody, CreateVolumeRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteVolumeRequest, DeleteVolumeResponse> deleteVolume = genForDeleteVolume();

    private static HttpRequestDef<DeleteVolumeRequest, DeleteVolumeResponse> genForDeleteVolume() {
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
            f -> f.withMarshaller(DeleteVolumeRequest::getId, DeleteVolumeRequest::setId));
        builder.<String>withRequestField("X-Enterprise-Project-ID",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteVolumeRequest::getXEnterpriseProjectID,
                DeleteVolumeRequest::setXEnterpriseProjectID));
        builder.<String>withRequestField("X-Environment-ID",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteVolumeRequest::getXEnvironmentID, DeleteVolumeRequest::setXEnvironmentID));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListVolumesRequest, ListVolumesResponse> listVolumes = genForListVolumes();

    private static HttpRequestDef<ListVolumesRequest, ListVolumesResponse> genForListVolumes() {
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
            f -> f.withMarshaller(ListVolumesRequest::getResourceType, ListVolumesRequest::setResourceType));
        builder.<String>withRequestField("X-Enterprise-Project-ID",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVolumesRequest::getXEnterpriseProjectID,
                ListVolumesRequest::setXEnterpriseProjectID));
        builder.<String>withRequestField("X-Environment-ID",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVolumesRequest::getXEnvironmentID, ListVolumesRequest::setXEnvironmentID));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateVpcEgressRequest, CreateVpcEgressResponse> createVpcEgress =
        genForCreateVpcEgress();

    private static HttpRequestDef<CreateVpcEgressRequest, CreateVpcEgressResponse> genForCreateVpcEgress() {
        // basic
        HttpRequestDef.Builder<CreateVpcEgressRequest, CreateVpcEgressResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateVpcEgressRequest.class, CreateVpcEgressResponse.class)
                .withName("CreateVpcEgress")
                .withUri("/v1/{project_id}/cae/vpc-egress")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("X-Enterprise-Project-ID",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateVpcEgressRequest::getXEnterpriseProjectID,
                CreateVpcEgressRequest::setXEnterpriseProjectID));
        builder.<String>withRequestField("X-Environment-ID",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateVpcEgressRequest::getXEnvironmentID,
                CreateVpcEgressRequest::setXEnvironmentID));
        builder.<VpcEgressRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(VpcEgressRequestBody.class),
            f -> f.withMarshaller(CreateVpcEgressRequest::getBody, CreateVpcEgressRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteVpcEgressRequest, DeleteVpcEgressResponse> deleteVpcEgress =
        genForDeleteVpcEgress();

    private static HttpRequestDef<DeleteVpcEgressRequest, DeleteVpcEgressResponse> genForDeleteVpcEgress() {
        // basic
        HttpRequestDef.Builder<DeleteVpcEgressRequest, DeleteVpcEgressResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteVpcEgressRequest.class, DeleteVpcEgressResponse.class)
                .withName("DeleteVpcEgress")
                .withUri("/v1/{project_id}/cae/vpc-egress/{vpc_egress_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("vpc_egress_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteVpcEgressRequest::getVpcEgressId, DeleteVpcEgressRequest::setVpcEgressId));
        builder.<String>withRequestField("X-Enterprise-Project-ID",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteVpcEgressRequest::getXEnterpriseProjectID,
                DeleteVpcEgressRequest::setXEnterpriseProjectID));
        builder.<String>withRequestField("X-Environment-ID",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteVpcEgressRequest::getXEnvironmentID,
                DeleteVpcEgressRequest::setXEnvironmentID));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListVpcEgressRequest, ListVpcEgressResponse> listVpcEgress =
        genForListVpcEgress();

    private static HttpRequestDef<ListVpcEgressRequest, ListVpcEgressResponse> genForListVpcEgress() {
        // basic
        HttpRequestDef.Builder<ListVpcEgressRequest, ListVpcEgressResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListVpcEgressRequest.class, ListVpcEgressResponse.class)
                .withName("ListVpcEgress")
                .withUri("/v1/{project_id}/cae/vpc-egress")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("X-Enterprise-Project-ID",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVpcEgressRequest::getXEnterpriseProjectID,
                ListVpcEgressRequest::setXEnterpriseProjectID));
        builder.<String>withRequestField("X-Environment-ID",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVpcEgressRequest::getXEnvironmentID, ListVpcEgressRequest::setXEnvironmentID));

        // response

        return builder.build();
    }

}
