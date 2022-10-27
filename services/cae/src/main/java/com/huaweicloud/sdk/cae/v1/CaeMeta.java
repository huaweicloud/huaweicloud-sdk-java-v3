package com.huaweicloud.sdk.cae.v1;

import com.huaweicloud.sdk.cae.v1.model.*;
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

    public static final HttpRequestDef<ShowAgencyRequest, ShowAgencyResponse> showAgency = genForshowAgency();

    private static HttpRequestDef<ShowAgencyRequest, ShowAgencyResponse> genForshowAgency() {
        // basic
        HttpRequestDef.Builder<ShowAgencyRequest, ShowAgencyResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowAgencyRequest.class, ShowAgencyResponse.class)
                .withName("ShowAgency")
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
        builder.<String>withRequestField("X-Environment-ID",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateApplicationRequest::getXEnvironmentID, (req, v) -> {
                req.setXEnvironmentID(v);
            }));
        builder.<String>withRequestField("X-Enterprise-Project-ID",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateApplicationRequest::getXEnterpriseProjectID, (req, v) -> {
                req.setXEnterpriseProjectID(v);
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
        builder.<String>withRequestField("X-Environment-ID",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteApplicationRequest::getXEnvironmentID, (req, v) -> {
                req.setXEnvironmentID(v);
            }));
        builder.<String>withRequestField("X-Enterprise-Project-ID",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteApplicationRequest::getXEnterpriseProjectID, (req, v) -> {
                req.setXEnterpriseProjectID(v);
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
        builder.<String>withRequestField("X-Environment-ID",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApplicationsRequest::getXEnvironmentID, (req, v) -> {
                req.setXEnvironmentID(v);
            }));
        builder.<String>withRequestField("X-Enterprise-Project-ID",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApplicationsRequest::getXEnterpriseProjectID, (req, v) -> {
                req.setXEnterpriseProjectID(v);
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
        builder.<String>withRequestField("X-Environment-ID",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowApplicationRequest::getXEnvironmentID, (req, v) -> {
                req.setXEnvironmentID(v);
            }));
        builder.<String>withRequestField("X-Enterprise-Project-ID",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowApplicationRequest::getXEnterpriseProjectID, (req, v) -> {
                req.setXEnterpriseProjectID(v);
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
        builder.<String>withRequestField("X-Environment-ID",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateComponentRequest::getXEnvironmentID, (req, v) -> {
                req.setXEnvironmentID(v);
            }));
        builder.<String>withRequestField("X-Enterprise-Project-ID",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateComponentRequest::getXEnterpriseProjectID, (req, v) -> {
                req.setXEnterpriseProjectID(v);
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
        builder.<String>withRequestField("component_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteComponentRequest::getComponentId, (req, v) -> {
                req.setComponentId(v);
            }));
        builder.<String>withRequestField("application_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteComponentRequest::getApplicationId, (req, v) -> {
                req.setApplicationId(v);
            }));
        builder.<String>withRequestField("X-Environment-ID",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteComponentRequest::getXEnvironmentID, (req, v) -> {
                req.setXEnvironmentID(v);
            }));
        builder.<String>withRequestField("X-Enterprise-Project-ID",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteComponentRequest::getXEnterpriseProjectID, (req, v) -> {
                req.setXEnterpriseProjectID(v);
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
        builder.<String>withRequestField("component_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExecuteActionRequest::getComponentId, (req, v) -> {
                req.setComponentId(v);
            }));
        builder.<String>withRequestField("application_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExecuteActionRequest::getApplicationId, (req, v) -> {
                req.setApplicationId(v);
            }));
        builder.<String>withRequestField("X-Environment-ID",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExecuteActionRequest::getXEnvironmentID, (req, v) -> {
                req.setXEnvironmentID(v);
            }));
        builder.<String>withRequestField("X-Enterprise-Project-ID",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExecuteActionRequest::getXEnterpriseProjectID, (req, v) -> {
                req.setXEnterpriseProjectID(v);
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
        builder.<String>withRequestField("component_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListComponentSnapshotsRequest::getComponentId, (req, v) -> {
                req.setComponentId(v);
            }));
        builder.<String>withRequestField("application_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListComponentSnapshotsRequest::getApplicationId, (req, v) -> {
                req.setApplicationId(v);
            }));
        builder.<String>withRequestField("X-Environment-ID",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListComponentSnapshotsRequest::getXEnvironmentID, (req, v) -> {
                req.setXEnvironmentID(v);
            }));
        builder.<String>withRequestField("X-Enterprise-Project-ID",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListComponentSnapshotsRequest::getXEnterpriseProjectID, (req, v) -> {
                req.setXEnterpriseProjectID(v);
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
        builder.<String>withRequestField("X-Environment-ID",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListComponentsRequest::getXEnvironmentID, (req, v) -> {
                req.setXEnvironmentID(v);
            }));
        builder.<String>withRequestField("X-Enterprise-Project-ID",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListComponentsRequest::getXEnterpriseProjectID, (req, v) -> {
                req.setXEnterpriseProjectID(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListEventsRequest, ListEventsResponse> listEvents = genForlistEvents();

    private static HttpRequestDef<ListEventsRequest, ListEventsResponse> genForlistEvents() {
        // basic
        HttpRequestDef.Builder<ListEventsRequest, ListEventsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListEventsRequest.class, ListEventsResponse.class)
                .withName("ListEvents")
                .withUri("/v1/{project_id}/cae/applications/{application_id}/components/{component_id}/events")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("component_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEventsRequest::getComponentId, (req, v) -> {
                req.setComponentId(v);
            }));
        builder.<String>withRequestField("application_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEventsRequest::getApplicationId, (req, v) -> {
                req.setApplicationId(v);
            }));
        builder.<String>withRequestField("X-Environment-ID",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEventsRequest::getXEnvironmentID, (req, v) -> {
                req.setXEnvironmentID(v);
            }));
        builder.<String>withRequestField("X-Enterprise-Project-ID",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEventsRequest::getXEnterpriseProjectID, (req, v) -> {
                req.setXEnterpriseProjectID(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListInstancesRequest, ListInstancesResponse> listInstances =
        genForlistInstances();

    private static HttpRequestDef<ListInstancesRequest, ListInstancesResponse> genForlistInstances() {
        // basic
        HttpRequestDef.Builder<ListInstancesRequest, ListInstancesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListInstancesRequest.class, ListInstancesResponse.class)
                .withName("ListInstances")
                .withUri("/v1/{project_id}/cae/applications/{application_id}/components/{component_id}/instances")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("component_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstancesRequest::getComponentId, (req, v) -> {
                req.setComponentId(v);
            }));
        builder.<String>withRequestField("application_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstancesRequest::getApplicationId, (req, v) -> {
                req.setApplicationId(v);
            }));
        builder.<String>withRequestField("X-Environment-ID",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstancesRequest::getXEnvironmentID, (req, v) -> {
                req.setXEnvironmentID(v);
            }));
        builder.<String>withRequestField("X-Enterprise-Project-ID",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstancesRequest::getXEnterpriseProjectID, (req, v) -> {
                req.setXEnterpriseProjectID(v);
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
        builder.<String>withRequestField("component_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowComponentRequest::getComponentId, (req, v) -> {
                req.setComponentId(v);
            }));
        builder.<String>withRequestField("application_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowComponentRequest::getApplicationId, (req, v) -> {
                req.setApplicationId(v);
            }));
        builder.<String>withRequestField("X-Environment-ID",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowComponentRequest::getXEnvironmentID, (req, v) -> {
                req.setXEnvironmentID(v);
            }));
        builder.<String>withRequestField("X-Enterprise-Project-ID",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowComponentRequest::getXEnterpriseProjectID, (req, v) -> {
                req.setXEnterpriseProjectID(v);
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
        builder.<String>withRequestField("component_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateComponentRequest::getComponentId, (req, v) -> {
                req.setComponentId(v);
            }));
        builder.<String>withRequestField("application_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateComponentRequest::getApplicationId, (req, v) -> {
                req.setApplicationId(v);
            }));
        builder.<String>withRequestField("X-Environment-ID",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateComponentRequest::getXEnvironmentID, (req, v) -> {
                req.setXEnvironmentID(v);
            }));
        builder.<String>withRequestField("X-Enterprise-Project-ID",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateComponentRequest::getXEnterpriseProjectID, (req, v) -> {
                req.setXEnterpriseProjectID(v);
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
        builder.<String>withRequestField("component_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateComponentConfigurationRequest::getComponentId, (req, v) -> {
                req.setComponentId(v);
            }));
        builder.<String>withRequestField("application_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateComponentConfigurationRequest::getApplicationId, (req, v) -> {
                req.setApplicationId(v);
            }));
        builder.<String>withRequestField("X-Environment-ID",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateComponentConfigurationRequest::getXEnvironmentID, (req, v) -> {
                req.setXEnvironmentID(v);
            }));
        builder.<String>withRequestField("X-Enterprise-Project-ID",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateComponentConfigurationRequest::getXEnterpriseProjectID, (req, v) -> {
                req.setXEnterpriseProjectID(v);
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
        builder.<String>withRequestField("component_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteComponentConfigurationRequest::getComponentId, (req, v) -> {
                req.setComponentId(v);
            }));
        builder.<String>withRequestField("application_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteComponentConfigurationRequest::getApplicationId, (req, v) -> {
                req.setApplicationId(v);
            }));
        builder.<String>withRequestField("X-Environment-ID",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteComponentConfigurationRequest::getXEnvironmentID, (req, v) -> {
                req.setXEnvironmentID(v);
            }));
        builder.<String>withRequestField("X-Enterprise-Project-ID",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteComponentConfigurationRequest::getXEnterpriseProjectID, (req, v) -> {
                req.setXEnterpriseProjectID(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListConfigurationsRequest, ListConfigurationsResponse> listConfigurations =
        genForlistConfigurations();

    private static HttpRequestDef<ListConfigurationsRequest, ListConfigurationsResponse> genForlistConfigurations() {
        // basic
        HttpRequestDef.Builder<ListConfigurationsRequest, ListConfigurationsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListConfigurationsRequest.class, ListConfigurationsResponse.class)
                .withName("ListConfigurations")
                .withUri("/v1/{project_id}/cae/applications/{application_id}/components/{component_id}/configurations")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("component_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListConfigurationsRequest::getComponentId, (req, v) -> {
                req.setComponentId(v);
            }));
        builder.<String>withRequestField("application_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListConfigurationsRequest::getApplicationId, (req, v) -> {
                req.setApplicationId(v);
            }));
        builder.<String>withRequestField("X-Environment-ID",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListConfigurationsRequest::getXEnvironmentID, (req, v) -> {
                req.setXEnvironmentID(v);
            }));
        builder.<String>withRequestField("X-Enterprise-Project-ID",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListConfigurationsRequest::getXEnterpriseProjectID, (req, v) -> {
                req.setXEnterpriseProjectID(v);
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
        builder.<String>withRequestField("X-Environment-ID",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateVolumeRequest::getXEnvironmentID, (req, v) -> {
                req.setXEnvironmentID(v);
            }));
        builder.<String>withRequestField("X-Enterprise-Project-ID",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateVolumeRequest::getXEnterpriseProjectID, (req, v) -> {
                req.setXEnterpriseProjectID(v);
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
        builder.<String>withRequestField("X-Environment-ID",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteVolumeRequest::getXEnvironmentID, (req, v) -> {
                req.setXEnvironmentID(v);
            }));
        builder.<String>withRequestField("X-Enterprise-Project-ID",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteVolumeRequest::getXEnterpriseProjectID, (req, v) -> {
                req.setXEnterpriseProjectID(v);
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
        builder.<ListVolumesRequest.ResourceTypeEnum>withRequestField("resource_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListVolumesRequest.ResourceTypeEnum.class),
            f -> f.withMarshaller(ListVolumesRequest::getResourceType, (req, v) -> {
                req.setResourceType(v);
            }));
        builder.<String>withRequestField("X-Environment-ID",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVolumesRequest::getXEnvironmentID, (req, v) -> {
                req.setXEnvironmentID(v);
            }));
        builder.<String>withRequestField("X-Enterprise-Project-ID",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVolumesRequest::getXEnterpriseProjectID, (req, v) -> {
                req.setXEnterpriseProjectID(v);
            }));

        // response

        return builder.build();
    }

}
