package com.huaweicloud.sdk.servicestage.v3;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.servicestage.v3.model.*;

@SuppressWarnings("unchecked")
public class ServiceStageMeta {

    public static final HttpRequestDef<CreateApplicationRequest, CreateApplicationResponse> createApplication =
        genForcreateApplication();

    private static HttpRequestDef<CreateApplicationRequest, CreateApplicationResponse> genForcreateApplication() {
        // basic
        HttpRequestDef.Builder<CreateApplicationRequest, CreateApplicationResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateApplicationRequest.class, CreateApplicationResponse.class)
                .withName("CreateApplication")
                .withUri("/v3/{project_id}/cas/applications")
                .withContentType("application/json");

        // requests
        builder.<ApplicationCreate>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ApplicationCreate.class),
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
                .withUri("/v3/{project_id}/cas/applications/{application_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("application_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteApplicationRequest::getApplicationId, (req, v) -> {
                req.setApplicationId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteApplicationConfigurationRequest, DeleteApplicationConfigurationResponse> deleteApplicationConfiguration =
        genFordeleteApplicationConfiguration();

    private static HttpRequestDef<DeleteApplicationConfigurationRequest, DeleteApplicationConfigurationResponse> genFordeleteApplicationConfiguration() {
        // basic
        HttpRequestDef.Builder<DeleteApplicationConfigurationRequest, DeleteApplicationConfigurationResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteApplicationConfigurationRequest.class,
                    DeleteApplicationConfigurationResponse.class)
                .withName("DeleteApplicationConfiguration")
                .withUri("/v3/{project_id}/cas/applications/{application_id}/configuration")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("application_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteApplicationConfigurationRequest::getApplicationId, (req, v) -> {
                req.setApplicationId(v);
            }));
        builder.<String>withRequestField("environment_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteApplicationConfigurationRequest::getEnvironmentId, (req, v) -> {
                req.setEnvironmentId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ModifyApplicationRequest, ModifyApplicationResponse> modifyApplication =
        genFormodifyApplication();

    private static HttpRequestDef<ModifyApplicationRequest, ModifyApplicationResponse> genFormodifyApplication() {
        // basic
        HttpRequestDef.Builder<ModifyApplicationRequest, ModifyApplicationResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, ModifyApplicationRequest.class, ModifyApplicationResponse.class)
                .withName("ModifyApplication")
                .withUri("/v3/{project_id}/cas/applications/{application_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("application_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ModifyApplicationRequest::getApplicationId, (req, v) -> {
                req.setApplicationId(v);
            }));
        builder.<ApplicationModify>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ApplicationModify.class),
            f -> f.withMarshaller(ModifyApplicationRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ModifyApplicationConfigurationRequest, ModifyApplicationConfigurationResponse> modifyApplicationConfiguration =
        genFormodifyApplicationConfiguration();

    private static HttpRequestDef<ModifyApplicationConfigurationRequest, ModifyApplicationConfigurationResponse> genFormodifyApplicationConfiguration() {
        // basic
        HttpRequestDef.Builder<ModifyApplicationConfigurationRequest, ModifyApplicationConfigurationResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    ModifyApplicationConfigurationRequest.class,
                    ModifyApplicationConfigurationResponse.class)
                .withName("ModifyApplicationConfiguration")
                .withUri("/v3/{project_id}/cas/applications/{application_id}/configuration")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("application_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ModifyApplicationConfigurationRequest::getApplicationId, (req, v) -> {
                req.setApplicationId(v);
            }));
        builder.<ApplicationConfigModify>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ApplicationConfigModify.class),
            f -> f.withMarshaller(ModifyApplicationConfigurationRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowApplicationConfigurationRequest, ShowApplicationConfigurationResponse> showApplicationConfiguration =
        genForshowApplicationConfiguration();

    private static HttpRequestDef<ShowApplicationConfigurationRequest, ShowApplicationConfigurationResponse> genForshowApplicationConfiguration() {
        // basic
        HttpRequestDef.Builder<ShowApplicationConfigurationRequest, ShowApplicationConfigurationResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowApplicationConfigurationRequest.class,
                    ShowApplicationConfigurationResponse.class)
                .withName("ShowApplicationConfiguration")
                .withUri("/v3/{project_id}/cas/applications/{application_id}/configuration")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("application_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowApplicationConfigurationRequest::getApplicationId, (req, v) -> {
                req.setApplicationId(v);
            }));
        builder.<String>withRequestField("environment_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowApplicationConfigurationRequest::getEnvironmentId, (req, v) -> {
                req.setEnvironmentId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowApplicationInfoRequest, ShowApplicationInfoResponse> showApplicationInfo =
        genForshowApplicationInfo();

    private static HttpRequestDef<ShowApplicationInfoRequest, ShowApplicationInfoResponse> genForshowApplicationInfo() {
        // basic
        HttpRequestDef.Builder<ShowApplicationInfoRequest, ShowApplicationInfoResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowApplicationInfoRequest.class, ShowApplicationInfoResponse.class)
                .withName("ShowApplicationInfo")
                .withUri("/v3/{project_id}/cas/applications/{application_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("application_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowApplicationInfoRequest::getApplicationId, (req, v) -> {
                req.setApplicationId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowApplicationsRequest, ShowApplicationsResponse> showApplications =
        genForshowApplications();

    private static HttpRequestDef<ShowApplicationsRequest, ShowApplicationsResponse> genForshowApplications() {
        // basic
        HttpRequestDef.Builder<ShowApplicationsRequest, ShowApplicationsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowApplicationsRequest.class, ShowApplicationsResponse.class)
                .withName("ShowApplications")
                .withUri("/v3/{project_id}/cas/applications")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowApplicationsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowApplicationsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("order_by",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowApplicationsRequest::getOrderBy, (req, v) -> {
                req.setOrderBy(v);
            }));
        builder.<ShowApplicationsRequest.OrderEnum>withRequestField("order",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowApplicationsRequest.OrderEnum.class),
            f -> f.withMarshaller(ShowApplicationsRequest::getOrder, (req, v) -> {
                req.setOrder(v);
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
                .withUri("/v3/{project_id}/cas/applications/{application_id}/components")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("application_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateComponentRequest::getApplicationId, (req, v) -> {
                req.setApplicationId(v);
            }));
        builder.<ComponentCreate>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ComponentCreate.class),
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
                .withUri("/v3/{project_id}/cas/applications/{application_id}/components/{component_id}")
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

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ModifyComponentRequest, ModifyComponentResponse> modifyComponent =
        genFormodifyComponent();

    private static HttpRequestDef<ModifyComponentRequest, ModifyComponentResponse> genFormodifyComponent() {
        // basic
        HttpRequestDef.Builder<ModifyComponentRequest, ModifyComponentResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, ModifyComponentRequest.class, ModifyComponentResponse.class)
                .withName("ModifyComponent")
                .withUri("/v3/{project_id}/cas/applications/{application_id}/components/{component_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("application_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ModifyComponentRequest::getApplicationId, (req, v) -> {
                req.setApplicationId(v);
            }));
        builder.<String>withRequestField("component_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ModifyComponentRequest::getComponentId, (req, v) -> {
                req.setComponentId(v);
            }));
        builder.<ComponentModify>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ComponentModify.class),
            f -> f.withMarshaller(ModifyComponentRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowComponentInfoRequest, ShowComponentInfoResponse> showComponentInfo =
        genForshowComponentInfo();

    private static HttpRequestDef<ShowComponentInfoRequest, ShowComponentInfoResponse> genForshowComponentInfo() {
        // basic
        HttpRequestDef.Builder<ShowComponentInfoRequest, ShowComponentInfoResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowComponentInfoRequest.class, ShowComponentInfoResponse.class)
                .withName("ShowComponentInfo")
                .withUri("/v3/{project_id}/cas/applications/{application_id}/components/{component_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("component_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowComponentInfoRequest::getComponentId, (req, v) -> {
                req.setComponentId(v);
            }));
        builder.<String>withRequestField("application_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowComponentInfoRequest::getApplicationId, (req, v) -> {
                req.setApplicationId(v);
            }));
        builder.<String>withRequestField("expect_fields",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowComponentInfoRequest::getExpectFields, (req, v) -> {
                req.setExpectFields(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowComponentRecordsRequest, ShowComponentRecordsResponse> showComponentRecords =
        genForshowComponentRecords();

    private static HttpRequestDef<ShowComponentRecordsRequest, ShowComponentRecordsResponse> genForshowComponentRecords() {
        // basic
        HttpRequestDef.Builder<ShowComponentRecordsRequest, ShowComponentRecordsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowComponentRecordsRequest.class, ShowComponentRecordsResponse.class)
            .withName("ShowComponentRecords")
            .withUri("/v3/{project_id}/cas/applications/{application_id}/components/{component_id}/records")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("component_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowComponentRecordsRequest::getComponentId, (req, v) -> {
                req.setComponentId(v);
            }));
        builder.<String>withRequestField("application_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowComponentRecordsRequest::getApplicationId, (req, v) -> {
                req.setApplicationId(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowComponentRecordsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowComponentRecordsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("order_by",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowComponentRecordsRequest::getOrderBy, (req, v) -> {
                req.setOrderBy(v);
            }));
        builder.<ShowComponentRecordsRequest.OrderEnum>withRequestField("order",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowComponentRecordsRequest.OrderEnum.class),
            f -> f.withMarshaller(ShowComponentRecordsRequest::getOrder, (req, v) -> {
                req.setOrder(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowComponentsRequest, ShowComponentsResponse> showComponents =
        genForshowComponents();

    private static HttpRequestDef<ShowComponentsRequest, ShowComponentsResponse> genForshowComponents() {
        // basic
        HttpRequestDef.Builder<ShowComponentsRequest, ShowComponentsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowComponentsRequest.class, ShowComponentsResponse.class)
                .withName("ShowComponents")
                .withUri("/v3/{project_id}/cas/components")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowComponentsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowComponentsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("order_by",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowComponentsRequest::getOrderBy, (req, v) -> {
                req.setOrderBy(v);
            }));
        builder.<ShowComponentsRequest.OrderEnum>withRequestField("order",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowComponentsRequest.OrderEnum.class),
            f -> f.withMarshaller(ShowComponentsRequest::getOrder, (req, v) -> {
                req.setOrder(v);
            }));
        builder.<String>withRequestField("application_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowComponentsRequest::getApplicationName, (req, v) -> {
                req.setApplicationName(v);
            }));
        builder.<String>withRequestField("component_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowComponentsRequest::getComponentName, (req, v) -> {
                req.setComponentName(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowComponentsInApplicationRequest, ShowComponentsInApplicationResponse> showComponentsInApplication =
        genForshowComponentsInApplication();

    private static HttpRequestDef<ShowComponentsInApplicationRequest, ShowComponentsInApplicationResponse> genForshowComponentsInApplication() {
        // basic
        HttpRequestDef.Builder<ShowComponentsInApplicationRequest, ShowComponentsInApplicationResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowComponentsInApplicationRequest.class,
                    ShowComponentsInApplicationResponse.class)
                .withName("ShowComponentsInApplication")
                .withUri("/v3/{project_id}/cas/applications/{application_id}/components")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("application_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowComponentsInApplicationRequest::getApplicationId, (req, v) -> {
                req.setApplicationId(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowComponentsInApplicationRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowComponentsInApplicationRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("order_by",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowComponentsInApplicationRequest::getOrderBy, (req, v) -> {
                req.setOrderBy(v);
            }));
        builder.<ShowComponentsInApplicationRequest.OrderEnum>withRequestField("order",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowComponentsInApplicationRequest.OrderEnum.class),
            f -> f.withMarshaller(ShowComponentsInApplicationRequest::getOrder, (req, v) -> {
                req.setOrder(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateComponentActionRequest, UpdateComponentActionResponse> updateComponentAction =
        genForupdateComponentAction();

    private static HttpRequestDef<UpdateComponentActionRequest, UpdateComponentActionResponse> genForupdateComponentAction() {
        // basic
        HttpRequestDef.Builder<UpdateComponentActionRequest, UpdateComponentActionResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, UpdateComponentActionRequest.class, UpdateComponentActionResponse.class)
            .withName("UpdateComponentAction")
            .withUri("/v3/{project_id}/cas/applications/{application_id}/components/{component_id}/action")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("application_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateComponentActionRequest::getApplicationId, (req, v) -> {
                req.setApplicationId(v);
            }));
        builder.<String>withRequestField("component_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateComponentActionRequest::getComponentId, (req, v) -> {
                req.setComponentId(v);
            }));
        builder.<ComponentAction>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ComponentAction.class),
            f -> f.withMarshaller(UpdateComponentActionRequest::getBody, (req, v) -> {
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
                .withUri("/v3/{project_id}/cas/environments")
                .withContentType("application/json");

        // requests
        builder.<EnvironmentCreate>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(EnvironmentCreate.class),
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
                .withUri("/v3/{project_id}/cas/environments/{environment_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("environment_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteEnvironmentRequest::getEnvironmentId, (req, v) -> {
                req.setEnvironmentId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ModifyEnvironmentRequest, ModifyEnvironmentResponse> modifyEnvironment =
        genFormodifyEnvironment();

    private static HttpRequestDef<ModifyEnvironmentRequest, ModifyEnvironmentResponse> genFormodifyEnvironment() {
        // basic
        HttpRequestDef.Builder<ModifyEnvironmentRequest, ModifyEnvironmentResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, ModifyEnvironmentRequest.class, ModifyEnvironmentResponse.class)
                .withName("ModifyEnvironment")
                .withUri("/v3/{project_id}/cas/environments/{environment_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("environment_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ModifyEnvironmentRequest::getEnvironmentId, (req, v) -> {
                req.setEnvironmentId(v);
            }));
        builder.<EnvironmentModify>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(EnvironmentModify.class),
            f -> f.withMarshaller(ModifyEnvironmentRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ModifyResourceInEnvironmentRequest, ModifyResourceInEnvironmentResponse> modifyResourceInEnvironment =
        genFormodifyResourceInEnvironment();

    private static HttpRequestDef<ModifyResourceInEnvironmentRequest, ModifyResourceInEnvironmentResponse> genFormodifyResourceInEnvironment() {
        // basic
        HttpRequestDef.Builder<ModifyResourceInEnvironmentRequest, ModifyResourceInEnvironmentResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    ModifyResourceInEnvironmentRequest.class,
                    ModifyResourceInEnvironmentResponse.class)
                .withName("ModifyResourceInEnvironment")
                .withUri("/v3/{project_id}/cas/environments/{environment_id}/resources")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("environment_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ModifyResourceInEnvironmentRequest::getEnvironmentId, (req, v) -> {
                req.setEnvironmentId(v);
            }));
        builder.<EnvironmentResourceModify>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(EnvironmentResourceModify.class),
            f -> f.withMarshaller(ModifyResourceInEnvironmentRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowEnvironmentInfoRequest, ShowEnvironmentInfoResponse> showEnvironmentInfo =
        genForshowEnvironmentInfo();

    private static HttpRequestDef<ShowEnvironmentInfoRequest, ShowEnvironmentInfoResponse> genForshowEnvironmentInfo() {
        // basic
        HttpRequestDef.Builder<ShowEnvironmentInfoRequest, ShowEnvironmentInfoResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowEnvironmentInfoRequest.class, ShowEnvironmentInfoResponse.class)
                .withName("ShowEnvironmentInfo")
                .withUri("/v3/{project_id}/cas/environments/{environment_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("environment_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowEnvironmentInfoRequest::getEnvironmentId, (req, v) -> {
                req.setEnvironmentId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowEnvironmentResourcesRequest, ShowEnvironmentResourcesResponse> showEnvironmentResources =
        genForshowEnvironmentResources();

    private static HttpRequestDef<ShowEnvironmentResourcesRequest, ShowEnvironmentResourcesResponse> genForshowEnvironmentResources() {
        // basic
        HttpRequestDef.Builder<ShowEnvironmentResourcesRequest, ShowEnvironmentResourcesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ShowEnvironmentResourcesRequest.class, ShowEnvironmentResourcesResponse.class)
                .withName("ShowEnvironmentResources")
                .withUri("/v3/{project_id}/cas/environments/{environment_id}/resources")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("environment_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowEnvironmentResourcesRequest::getEnvironmentId, (req, v) -> {
                req.setEnvironmentId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowEnvironmentsRequest, ShowEnvironmentsResponse> showEnvironments =
        genForshowEnvironments();

    private static HttpRequestDef<ShowEnvironmentsRequest, ShowEnvironmentsResponse> genForshowEnvironments() {
        // basic
        HttpRequestDef.Builder<ShowEnvironmentsRequest, ShowEnvironmentsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowEnvironmentsRequest.class, ShowEnvironmentsResponse.class)
                .withName("ShowEnvironments")
                .withUri("/v3/{project_id}/cas/environments")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowEnvironmentsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowEnvironmentsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("order_by",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowEnvironmentsRequest::getOrderBy, (req, v) -> {
                req.setOrderBy(v);
            }));
        builder.<ShowEnvironmentsRequest.OrderEnum>withRequestField("order",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowEnvironmentsRequest.OrderEnum.class),
            f -> f.withMarshaller(ShowEnvironmentsRequest::getOrder, (req, v) -> {
                req.setOrder(v);
            }));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowEnvironmentsRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<String>withRequestField("environment_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowEnvironmentsRequest::getEnvironmentId, (req, v) -> {
                req.setEnvironmentId(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowEnvironmentsRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowJobInfoRequest, ShowJobInfoResponse> showJobInfo = genForshowJobInfo();

    private static HttpRequestDef<ShowJobInfoRequest, ShowJobInfoResponse> genForshowJobInfo() {
        // basic
        HttpRequestDef.Builder<ShowJobInfoRequest, ShowJobInfoResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowJobInfoRequest.class, ShowJobInfoResponse.class)
                .withName("ShowJobInfo")
                .withUri("/v3/{project_id}/cas/jobs/{job_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJobInfoRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));
        builder.<String>withRequestField("instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJobInfoRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJobInfoRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJobInfoRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("desc",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJobInfoRequest::getDesc, (req, v) -> {
                req.setDesc(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowRuntimeStacksRequest, ShowRuntimeStacksResponse> showRuntimeStacks =
        genForshowRuntimeStacks();

    private static HttpRequestDef<ShowRuntimeStacksRequest, ShowRuntimeStacksResponse> genForshowRuntimeStacks() {
        // basic
        HttpRequestDef.Builder<ShowRuntimeStacksRequest, ShowRuntimeStacksResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowRuntimeStacksRequest.class, ShowRuntimeStacksResponse.class)
                .withName("ShowRuntimeStacks")
                .withUri("/v3/{project_id}/cas/runtimestacks")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

}
