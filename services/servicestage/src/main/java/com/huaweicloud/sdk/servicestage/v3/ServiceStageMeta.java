package com.huaweicloud.sdk.servicestage.v3;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.servicestage.v3.model.ApplicationConfigModify;
import com.huaweicloud.sdk.servicestage.v3.model.ApplicationCreate;
import com.huaweicloud.sdk.servicestage.v3.model.ApplicationModify;
import com.huaweicloud.sdk.servicestage.v3.model.ComponentAction;
import com.huaweicloud.sdk.servicestage.v3.model.ComponentCreate;
import com.huaweicloud.sdk.servicestage.v3.model.ComponentModify;
import com.huaweicloud.sdk.servicestage.v3.model.CreateApplicationRequest;
import com.huaweicloud.sdk.servicestage.v3.model.CreateApplicationResponse;
import com.huaweicloud.sdk.servicestage.v3.model.CreateComponentRequest;
import com.huaweicloud.sdk.servicestage.v3.model.CreateComponentResponse;
import com.huaweicloud.sdk.servicestage.v3.model.CreateEnvironmentRequest;
import com.huaweicloud.sdk.servicestage.v3.model.CreateEnvironmentResponse;
import com.huaweicloud.sdk.servicestage.v3.model.DeleteApplicationConfigurationRequest;
import com.huaweicloud.sdk.servicestage.v3.model.DeleteApplicationConfigurationResponse;
import com.huaweicloud.sdk.servicestage.v3.model.DeleteApplicationRequest;
import com.huaweicloud.sdk.servicestage.v3.model.DeleteApplicationResponse;
import com.huaweicloud.sdk.servicestage.v3.model.DeleteComponentRequest;
import com.huaweicloud.sdk.servicestage.v3.model.DeleteComponentResponse;
import com.huaweicloud.sdk.servicestage.v3.model.DeleteEnvironmentRequest;
import com.huaweicloud.sdk.servicestage.v3.model.DeleteEnvironmentResponse;
import com.huaweicloud.sdk.servicestage.v3.model.EnvironmentCreate;
import com.huaweicloud.sdk.servicestage.v3.model.EnvironmentModify;
import com.huaweicloud.sdk.servicestage.v3.model.EnvironmentResourceModify;
import com.huaweicloud.sdk.servicestage.v3.model.ModifyApplicationConfigurationRequest;
import com.huaweicloud.sdk.servicestage.v3.model.ModifyApplicationConfigurationResponse;
import com.huaweicloud.sdk.servicestage.v3.model.ModifyApplicationRequest;
import com.huaweicloud.sdk.servicestage.v3.model.ModifyApplicationResponse;
import com.huaweicloud.sdk.servicestage.v3.model.ModifyComponentRequest;
import com.huaweicloud.sdk.servicestage.v3.model.ModifyComponentResponse;
import com.huaweicloud.sdk.servicestage.v3.model.ModifyEnvironmentRequest;
import com.huaweicloud.sdk.servicestage.v3.model.ModifyEnvironmentResponse;
import com.huaweicloud.sdk.servicestage.v3.model.ModifyResourceInEnvironmentRequest;
import com.huaweicloud.sdk.servicestage.v3.model.ModifyResourceInEnvironmentResponse;
import com.huaweicloud.sdk.servicestage.v3.model.ShowApplicationConfigurationRequest;
import com.huaweicloud.sdk.servicestage.v3.model.ShowApplicationConfigurationResponse;
import com.huaweicloud.sdk.servicestage.v3.model.ShowApplicationInfoRequest;
import com.huaweicloud.sdk.servicestage.v3.model.ShowApplicationInfoResponse;
import com.huaweicloud.sdk.servicestage.v3.model.ShowApplicationsRequest;
import com.huaweicloud.sdk.servicestage.v3.model.ShowApplicationsResponse;
import com.huaweicloud.sdk.servicestage.v3.model.ShowComponentInfoRequest;
import com.huaweicloud.sdk.servicestage.v3.model.ShowComponentInfoResponse;
import com.huaweicloud.sdk.servicestage.v3.model.ShowComponentRecordsRequest;
import com.huaweicloud.sdk.servicestage.v3.model.ShowComponentRecordsResponse;
import com.huaweicloud.sdk.servicestage.v3.model.ShowComponentsInApplicationRequest;
import com.huaweicloud.sdk.servicestage.v3.model.ShowComponentsInApplicationResponse;
import com.huaweicloud.sdk.servicestage.v3.model.ShowComponentsRequest;
import com.huaweicloud.sdk.servicestage.v3.model.ShowComponentsResponse;
import com.huaweicloud.sdk.servicestage.v3.model.ShowEnvironmentInfoRequest;
import com.huaweicloud.sdk.servicestage.v3.model.ShowEnvironmentInfoResponse;
import com.huaweicloud.sdk.servicestage.v3.model.ShowEnvironmentResourcesRequest;
import com.huaweicloud.sdk.servicestage.v3.model.ShowEnvironmentResourcesResponse;
import com.huaweicloud.sdk.servicestage.v3.model.ShowEnvironmentsRequest;
import com.huaweicloud.sdk.servicestage.v3.model.ShowEnvironmentsResponse;
import com.huaweicloud.sdk.servicestage.v3.model.ShowJobInfoRequest;
import com.huaweicloud.sdk.servicestage.v3.model.ShowJobInfoResponse;
import com.huaweicloud.sdk.servicestage.v3.model.ShowRuntimeStacksRequest;
import com.huaweicloud.sdk.servicestage.v3.model.ShowRuntimeStacksResponse;
import com.huaweicloud.sdk.servicestage.v3.model.UpdateComponentActionRequest;
import com.huaweicloud.sdk.servicestage.v3.model.UpdateComponentActionResponse;

@SuppressWarnings("unchecked")
public class ServiceStageMeta {

    public static final HttpRequestDef<CreateApplicationRequest, CreateApplicationResponse> createApplication =
        genForCreateApplication();

    private static HttpRequestDef<CreateApplicationRequest, CreateApplicationResponse> genForCreateApplication() {
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
                .withUri("/v3/{project_id}/cas/applications/{application_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("application_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteApplicationRequest::getApplicationId,
                DeleteApplicationRequest::setApplicationId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteApplicationConfigurationRequest, DeleteApplicationConfigurationResponse> deleteApplicationConfiguration =
        genForDeleteApplicationConfiguration();

    private static HttpRequestDef<DeleteApplicationConfigurationRequest, DeleteApplicationConfigurationResponse> genForDeleteApplicationConfiguration() {
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
            f -> f.withMarshaller(DeleteApplicationConfigurationRequest::getApplicationId,
                DeleteApplicationConfigurationRequest::setApplicationId));
        builder.<String>withRequestField("environment_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteApplicationConfigurationRequest::getEnvironmentId,
                DeleteApplicationConfigurationRequest::setEnvironmentId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ModifyApplicationRequest, ModifyApplicationResponse> modifyApplication =
        genForModifyApplication();

    private static HttpRequestDef<ModifyApplicationRequest, ModifyApplicationResponse> genForModifyApplication() {
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
            f -> f.withMarshaller(ModifyApplicationRequest::getApplicationId,
                ModifyApplicationRequest::setApplicationId));
        builder.<ApplicationModify>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ApplicationModify.class),
            f -> f.withMarshaller(ModifyApplicationRequest::getBody, ModifyApplicationRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ModifyApplicationConfigurationRequest, ModifyApplicationConfigurationResponse> modifyApplicationConfiguration =
        genForModifyApplicationConfiguration();

    private static HttpRequestDef<ModifyApplicationConfigurationRequest, ModifyApplicationConfigurationResponse> genForModifyApplicationConfiguration() {
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
            f -> f.withMarshaller(ModifyApplicationConfigurationRequest::getApplicationId,
                ModifyApplicationConfigurationRequest::setApplicationId));
        builder.<ApplicationConfigModify>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ApplicationConfigModify.class),
            f -> f.withMarshaller(ModifyApplicationConfigurationRequest::getBody,
                ModifyApplicationConfigurationRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowApplicationConfigurationRequest, ShowApplicationConfigurationResponse> showApplicationConfiguration =
        genForShowApplicationConfiguration();

    private static HttpRequestDef<ShowApplicationConfigurationRequest, ShowApplicationConfigurationResponse> genForShowApplicationConfiguration() {
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
            f -> f.withMarshaller(ShowApplicationConfigurationRequest::getApplicationId,
                ShowApplicationConfigurationRequest::setApplicationId));
        builder.<String>withRequestField("environment_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowApplicationConfigurationRequest::getEnvironmentId,
                ShowApplicationConfigurationRequest::setEnvironmentId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowApplicationInfoRequest, ShowApplicationInfoResponse> showApplicationInfo =
        genForShowApplicationInfo();

    private static HttpRequestDef<ShowApplicationInfoRequest, ShowApplicationInfoResponse> genForShowApplicationInfo() {
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
            f -> f.withMarshaller(ShowApplicationInfoRequest::getApplicationId,
                ShowApplicationInfoRequest::setApplicationId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowApplicationsRequest, ShowApplicationsResponse> showApplications =
        genForShowApplications();

    private static HttpRequestDef<ShowApplicationsRequest, ShowApplicationsResponse> genForShowApplications() {
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
            f -> f.withMarshaller(ShowApplicationsRequest::getLimit, ShowApplicationsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowApplicationsRequest::getOffset, ShowApplicationsRequest::setOffset));
        builder.<String>withRequestField("order_by",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowApplicationsRequest::getOrderBy, ShowApplicationsRequest::setOrderBy));
        builder.<ShowApplicationsRequest.OrderEnum>withRequestField("order",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowApplicationsRequest.OrderEnum.class),
            f -> f.withMarshaller(ShowApplicationsRequest::getOrder, ShowApplicationsRequest::setOrder));

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
                .withUri("/v3/{project_id}/cas/applications/{application_id}/components")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("application_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateComponentRequest::getApplicationId, CreateComponentRequest::setApplicationId));
        builder.<ComponentCreate>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ComponentCreate.class),
            f -> f.withMarshaller(CreateComponentRequest::getBody, CreateComponentRequest::setBody));

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
                .withUri("/v3/{project_id}/cas/applications/{application_id}/components/{component_id}")
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

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ModifyComponentRequest, ModifyComponentResponse> modifyComponent =
        genForModifyComponent();

    private static HttpRequestDef<ModifyComponentRequest, ModifyComponentResponse> genForModifyComponent() {
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
            f -> f.withMarshaller(ModifyComponentRequest::getApplicationId, ModifyComponentRequest::setApplicationId));
        builder.<String>withRequestField("component_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ModifyComponentRequest::getComponentId, ModifyComponentRequest::setComponentId));
        builder.<ComponentModify>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ComponentModify.class),
            f -> f.withMarshaller(ModifyComponentRequest::getBody, ModifyComponentRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowComponentInfoRequest, ShowComponentInfoResponse> showComponentInfo =
        genForShowComponentInfo();

    private static HttpRequestDef<ShowComponentInfoRequest, ShowComponentInfoResponse> genForShowComponentInfo() {
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
            f -> f.withMarshaller(ShowComponentInfoRequest::getComponentId, ShowComponentInfoRequest::setComponentId));
        builder.<String>withRequestField("application_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowComponentInfoRequest::getApplicationId,
                ShowComponentInfoRequest::setApplicationId));
        builder.<String>withRequestField("expect_fields",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowComponentInfoRequest::getExpectFields,
                ShowComponentInfoRequest::setExpectFields));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowComponentRecordsRequest, ShowComponentRecordsResponse> showComponentRecords =
        genForShowComponentRecords();

    private static HttpRequestDef<ShowComponentRecordsRequest, ShowComponentRecordsResponse> genForShowComponentRecords() {
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
            f -> f.withMarshaller(ShowComponentRecordsRequest::getComponentId,
                ShowComponentRecordsRequest::setComponentId));
        builder.<String>withRequestField("application_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowComponentRecordsRequest::getApplicationId,
                ShowComponentRecordsRequest::setApplicationId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowComponentRecordsRequest::getLimit, ShowComponentRecordsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowComponentRecordsRequest::getOffset, ShowComponentRecordsRequest::setOffset));
        builder.<String>withRequestField("order_by",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowComponentRecordsRequest::getOrderBy, ShowComponentRecordsRequest::setOrderBy));
        builder.<ShowComponentRecordsRequest.OrderEnum>withRequestField("order",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowComponentRecordsRequest.OrderEnum.class),
            f -> f.withMarshaller(ShowComponentRecordsRequest::getOrder, ShowComponentRecordsRequest::setOrder));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowComponentsRequest, ShowComponentsResponse> showComponents =
        genForShowComponents();

    private static HttpRequestDef<ShowComponentsRequest, ShowComponentsResponse> genForShowComponents() {
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
            f -> f.withMarshaller(ShowComponentsRequest::getLimit, ShowComponentsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowComponentsRequest::getOffset, ShowComponentsRequest::setOffset));
        builder.<String>withRequestField("order_by",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowComponentsRequest::getOrderBy, ShowComponentsRequest::setOrderBy));
        builder.<ShowComponentsRequest.OrderEnum>withRequestField("order",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowComponentsRequest.OrderEnum.class),
            f -> f.withMarshaller(ShowComponentsRequest::getOrder, ShowComponentsRequest::setOrder));
        builder.<String>withRequestField("application_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowComponentsRequest::getApplicationName,
                ShowComponentsRequest::setApplicationName));
        builder.<String>withRequestField("component_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowComponentsRequest::getComponentName, ShowComponentsRequest::setComponentName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowComponentsInApplicationRequest, ShowComponentsInApplicationResponse> showComponentsInApplication =
        genForShowComponentsInApplication();

    private static HttpRequestDef<ShowComponentsInApplicationRequest, ShowComponentsInApplicationResponse> genForShowComponentsInApplication() {
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
            f -> f.withMarshaller(ShowComponentsInApplicationRequest::getApplicationId,
                ShowComponentsInApplicationRequest::setApplicationId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowComponentsInApplicationRequest::getLimit,
                ShowComponentsInApplicationRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowComponentsInApplicationRequest::getOffset,
                ShowComponentsInApplicationRequest::setOffset));
        builder.<String>withRequestField("order_by",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowComponentsInApplicationRequest::getOrderBy,
                ShowComponentsInApplicationRequest::setOrderBy));
        builder.<ShowComponentsInApplicationRequest.OrderEnum>withRequestField("order",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowComponentsInApplicationRequest.OrderEnum.class),
            f -> f.withMarshaller(ShowComponentsInApplicationRequest::getOrder,
                ShowComponentsInApplicationRequest::setOrder));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateComponentActionRequest, UpdateComponentActionResponse> updateComponentAction =
        genForUpdateComponentAction();

    private static HttpRequestDef<UpdateComponentActionRequest, UpdateComponentActionResponse> genForUpdateComponentAction() {
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
            f -> f.withMarshaller(UpdateComponentActionRequest::getApplicationId,
                UpdateComponentActionRequest::setApplicationId));
        builder.<String>withRequestField("component_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateComponentActionRequest::getComponentId,
                UpdateComponentActionRequest::setComponentId));
        builder.<ComponentAction>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ComponentAction.class),
            f -> f.withMarshaller(UpdateComponentActionRequest::getBody, UpdateComponentActionRequest::setBody));

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
                .withUri("/v3/{project_id}/cas/environments")
                .withContentType("application/json");

        // requests
        builder.<EnvironmentCreate>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(EnvironmentCreate.class),
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
                .withUri("/v3/{project_id}/cas/environments/{environment_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("environment_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteEnvironmentRequest::getEnvironmentId,
                DeleteEnvironmentRequest::setEnvironmentId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ModifyEnvironmentRequest, ModifyEnvironmentResponse> modifyEnvironment =
        genForModifyEnvironment();

    private static HttpRequestDef<ModifyEnvironmentRequest, ModifyEnvironmentResponse> genForModifyEnvironment() {
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
            f -> f.withMarshaller(ModifyEnvironmentRequest::getEnvironmentId,
                ModifyEnvironmentRequest::setEnvironmentId));
        builder.<EnvironmentModify>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(EnvironmentModify.class),
            f -> f.withMarshaller(ModifyEnvironmentRequest::getBody, ModifyEnvironmentRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ModifyResourceInEnvironmentRequest, ModifyResourceInEnvironmentResponse> modifyResourceInEnvironment =
        genForModifyResourceInEnvironment();

    private static HttpRequestDef<ModifyResourceInEnvironmentRequest, ModifyResourceInEnvironmentResponse> genForModifyResourceInEnvironment() {
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
            f -> f.withMarshaller(ModifyResourceInEnvironmentRequest::getEnvironmentId,
                ModifyResourceInEnvironmentRequest::setEnvironmentId));
        builder.<EnvironmentResourceModify>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(EnvironmentResourceModify.class),
            f -> f.withMarshaller(ModifyResourceInEnvironmentRequest::getBody,
                ModifyResourceInEnvironmentRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowEnvironmentInfoRequest, ShowEnvironmentInfoResponse> showEnvironmentInfo =
        genForShowEnvironmentInfo();

    private static HttpRequestDef<ShowEnvironmentInfoRequest, ShowEnvironmentInfoResponse> genForShowEnvironmentInfo() {
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
            f -> f.withMarshaller(ShowEnvironmentInfoRequest::getEnvironmentId,
                ShowEnvironmentInfoRequest::setEnvironmentId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowEnvironmentResourcesRequest, ShowEnvironmentResourcesResponse> showEnvironmentResources =
        genForShowEnvironmentResources();

    private static HttpRequestDef<ShowEnvironmentResourcesRequest, ShowEnvironmentResourcesResponse> genForShowEnvironmentResources() {
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
            f -> f.withMarshaller(ShowEnvironmentResourcesRequest::getEnvironmentId,
                ShowEnvironmentResourcesRequest::setEnvironmentId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowEnvironmentsRequest, ShowEnvironmentsResponse> showEnvironments =
        genForShowEnvironments();

    private static HttpRequestDef<ShowEnvironmentsRequest, ShowEnvironmentsResponse> genForShowEnvironments() {
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
            f -> f.withMarshaller(ShowEnvironmentsRequest::getLimit, ShowEnvironmentsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowEnvironmentsRequest::getOffset, ShowEnvironmentsRequest::setOffset));
        builder.<String>withRequestField("order_by",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowEnvironmentsRequest::getOrderBy, ShowEnvironmentsRequest::setOrderBy));
        builder.<ShowEnvironmentsRequest.OrderEnum>withRequestField("order",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowEnvironmentsRequest.OrderEnum.class),
            f -> f.withMarshaller(ShowEnvironmentsRequest::getOrder, ShowEnvironmentsRequest::setOrder));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowEnvironmentsRequest::getName, ShowEnvironmentsRequest::setName));
        builder.<String>withRequestField("environment_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowEnvironmentsRequest::getEnvironmentId,
                ShowEnvironmentsRequest::setEnvironmentId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowEnvironmentsRequest::getEnterpriseProjectId,
                ShowEnvironmentsRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowJobInfoRequest, ShowJobInfoResponse> showJobInfo = genForShowJobInfo();

    private static HttpRequestDef<ShowJobInfoRequest, ShowJobInfoResponse> genForShowJobInfo() {
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
            f -> f.withMarshaller(ShowJobInfoRequest::getJobId, ShowJobInfoRequest::setJobId));
        builder.<String>withRequestField("instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJobInfoRequest::getInstanceId, ShowJobInfoRequest::setInstanceId));
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJobInfoRequest::getLimit, ShowJobInfoRequest::setLimit));
        builder.<String>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJobInfoRequest::getOffset, ShowJobInfoRequest::setOffset));
        builder.<String>withRequestField("desc",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJobInfoRequest::getDesc, ShowJobInfoRequest::setDesc));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowRuntimeStacksRequest, ShowRuntimeStacksResponse> showRuntimeStacks =
        genForShowRuntimeStacks();

    private static HttpRequestDef<ShowRuntimeStacksRequest, ShowRuntimeStacksResponse> genForShowRuntimeStacks() {
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
