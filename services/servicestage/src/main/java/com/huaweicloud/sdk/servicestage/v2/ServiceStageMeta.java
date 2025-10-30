package com.huaweicloud.sdk.servicestage.v2;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.servicestage.v2.model.AccessPassword;
import com.huaweicloud.sdk.servicestage.v2.model.AccessToken;
import com.huaweicloud.sdk.servicestage.v2.model.ApplicationConfigModify;
import com.huaweicloud.sdk.servicestage.v2.model.ApplicationCreate;
import com.huaweicloud.sdk.servicestage.v2.model.ApplicationModify;
import com.huaweicloud.sdk.servicestage.v2.model.ChangeApplicationConfigurationRequest;
import com.huaweicloud.sdk.servicestage.v2.model.ChangeApplicationConfigurationResponse;
import com.huaweicloud.sdk.servicestage.v2.model.ChangeApplicationRequest;
import com.huaweicloud.sdk.servicestage.v2.model.ChangeApplicationResponse;
import com.huaweicloud.sdk.servicestage.v2.model.ChangeComponentRequest;
import com.huaweicloud.sdk.servicestage.v2.model.ChangeComponentResponse;
import com.huaweicloud.sdk.servicestage.v2.model.ChangeEnvironmentRequest;
import com.huaweicloud.sdk.servicestage.v2.model.ChangeEnvironmentResponse;
import com.huaweicloud.sdk.servicestage.v2.model.ChangeInstanceRequest;
import com.huaweicloud.sdk.servicestage.v2.model.ChangeInstanceResponse;
import com.huaweicloud.sdk.servicestage.v2.model.ChangeResourceInEnvironmentRequest;
import com.huaweicloud.sdk.servicestage.v2.model.ChangeResourceInEnvironmentResponse;
import com.huaweicloud.sdk.servicestage.v2.model.ComponentCreate;
import com.huaweicloud.sdk.servicestage.v2.model.ComponentModify;
import com.huaweicloud.sdk.servicestage.v2.model.CreateApplicationRequest;
import com.huaweicloud.sdk.servicestage.v2.model.CreateApplicationResponse;
import com.huaweicloud.sdk.servicestage.v2.model.CreateComponentRequest;
import com.huaweicloud.sdk.servicestage.v2.model.CreateComponentResponse;
import com.huaweicloud.sdk.servicestage.v2.model.CreateEnvironmentRequest;
import com.huaweicloud.sdk.servicestage.v2.model.CreateEnvironmentResponse;
import com.huaweicloud.sdk.servicestage.v2.model.CreateFileRequest;
import com.huaweicloud.sdk.servicestage.v2.model.CreateFileResponse;
import com.huaweicloud.sdk.servicestage.v2.model.CreateHookRequest;
import com.huaweicloud.sdk.servicestage.v2.model.CreateHookResponse;
import com.huaweicloud.sdk.servicestage.v2.model.CreateInstanceRequest;
import com.huaweicloud.sdk.servicestage.v2.model.CreateInstanceResponse;
import com.huaweicloud.sdk.servicestage.v2.model.CreateOAuthRequest;
import com.huaweicloud.sdk.servicestage.v2.model.CreateOAuthResponse;
import com.huaweicloud.sdk.servicestage.v2.model.CreatePasswordAuthRequest;
import com.huaweicloud.sdk.servicestage.v2.model.CreatePasswordAuthResponse;
import com.huaweicloud.sdk.servicestage.v2.model.CreatePersonalAuthRequest;
import com.huaweicloud.sdk.servicestage.v2.model.CreatePersonalAuthResponse;
import com.huaweicloud.sdk.servicestage.v2.model.CreateProjectRequest;
import com.huaweicloud.sdk.servicestage.v2.model.CreateProjectResponse;
import com.huaweicloud.sdk.servicestage.v2.model.CreateTagRequest;
import com.huaweicloud.sdk.servicestage.v2.model.CreateTagResponse;
import com.huaweicloud.sdk.servicestage.v2.model.DeleteApplicationConfigurationRequest;
import com.huaweicloud.sdk.servicestage.v2.model.DeleteApplicationConfigurationResponse;
import com.huaweicloud.sdk.servicestage.v2.model.DeleteApplicationRequest;
import com.huaweicloud.sdk.servicestage.v2.model.DeleteApplicationResponse;
import com.huaweicloud.sdk.servicestage.v2.model.DeleteAuthorizeRequest;
import com.huaweicloud.sdk.servicestage.v2.model.DeleteAuthorizeResponse;
import com.huaweicloud.sdk.servicestage.v2.model.DeleteComponentRequest;
import com.huaweicloud.sdk.servicestage.v2.model.DeleteComponentResponse;
import com.huaweicloud.sdk.servicestage.v2.model.DeleteEnvironmentRequest;
import com.huaweicloud.sdk.servicestage.v2.model.DeleteEnvironmentResponse;
import com.huaweicloud.sdk.servicestage.v2.model.DeleteFileRequest;
import com.huaweicloud.sdk.servicestage.v2.model.DeleteFileResponse;
import com.huaweicloud.sdk.servicestage.v2.model.DeleteHookRequest;
import com.huaweicloud.sdk.servicestage.v2.model.DeleteHookResponse;
import com.huaweicloud.sdk.servicestage.v2.model.DeleteInstanceRequest;
import com.huaweicloud.sdk.servicestage.v2.model.DeleteInstanceResponse;
import com.huaweicloud.sdk.servicestage.v2.model.DeleteTagRequest;
import com.huaweicloud.sdk.servicestage.v2.model.DeleteTagResponse;
import com.huaweicloud.sdk.servicestage.v2.model.EnvironmentCreate;
import com.huaweicloud.sdk.servicestage.v2.model.EnvironmentModify;
import com.huaweicloud.sdk.servicestage.v2.model.EnvironmentResourceModify;
import com.huaweicloud.sdk.servicestage.v2.model.FileCreate;
import com.huaweicloud.sdk.servicestage.v2.model.FileUpdate;
import com.huaweicloud.sdk.servicestage.v2.model.HookCreate;
import com.huaweicloud.sdk.servicestage.v2.model.InstanceAction;
import com.huaweicloud.sdk.servicestage.v2.model.InstanceCreate;
import com.huaweicloud.sdk.servicestage.v2.model.InstanceModify;
import com.huaweicloud.sdk.servicestage.v2.model.ListApplicationsRequest;
import com.huaweicloud.sdk.servicestage.v2.model.ListApplicationsResponse;
import com.huaweicloud.sdk.servicestage.v2.model.ListAuthorizationsRequest;
import com.huaweicloud.sdk.servicestage.v2.model.ListAuthorizationsResponse;
import com.huaweicloud.sdk.servicestage.v2.model.ListBranchesRequest;
import com.huaweicloud.sdk.servicestage.v2.model.ListBranchesResponse;
import com.huaweicloud.sdk.servicestage.v2.model.ListCommitsRequest;
import com.huaweicloud.sdk.servicestage.v2.model.ListCommitsResponse;
import com.huaweicloud.sdk.servicestage.v2.model.ListComponentOverviewsRequest;
import com.huaweicloud.sdk.servicestage.v2.model.ListComponentOverviewsResponse;
import com.huaweicloud.sdk.servicestage.v2.model.ListComponentsRequest;
import com.huaweicloud.sdk.servicestage.v2.model.ListComponentsResponse;
import com.huaweicloud.sdk.servicestage.v2.model.ListEnvironmentsRequest;
import com.huaweicloud.sdk.servicestage.v2.model.ListEnvironmentsResponse;
import com.huaweicloud.sdk.servicestage.v2.model.ListFlavorsRequest;
import com.huaweicloud.sdk.servicestage.v2.model.ListFlavorsResponse;
import com.huaweicloud.sdk.servicestage.v2.model.ListHooksRequest;
import com.huaweicloud.sdk.servicestage.v2.model.ListHooksResponse;
import com.huaweicloud.sdk.servicestage.v2.model.ListInstanceSnapshotsRequest;
import com.huaweicloud.sdk.servicestage.v2.model.ListInstanceSnapshotsResponse;
import com.huaweicloud.sdk.servicestage.v2.model.ListInstancesRequest;
import com.huaweicloud.sdk.servicestage.v2.model.ListInstancesResponse;
import com.huaweicloud.sdk.servicestage.v2.model.ListNamespacesRequest;
import com.huaweicloud.sdk.servicestage.v2.model.ListNamespacesResponse;
import com.huaweicloud.sdk.servicestage.v2.model.ListProjectsRequest;
import com.huaweicloud.sdk.servicestage.v2.model.ListProjectsResponse;
import com.huaweicloud.sdk.servicestage.v2.model.ListRuntimesRequest;
import com.huaweicloud.sdk.servicestage.v2.model.ListRuntimesResponse;
import com.huaweicloud.sdk.servicestage.v2.model.ListTagsRequest;
import com.huaweicloud.sdk.servicestage.v2.model.ListTagsResponse;
import com.huaweicloud.sdk.servicestage.v2.model.ListTemplatesRequest;
import com.huaweicloud.sdk.servicestage.v2.model.ListTemplatesResponse;
import com.huaweicloud.sdk.servicestage.v2.model.ListTreesRequest;
import com.huaweicloud.sdk.servicestage.v2.model.ListTreesResponse;
import com.huaweicloud.sdk.servicestage.v2.model.OAuth;
import com.huaweicloud.sdk.servicestage.v2.model.ProjectCreate;
import com.huaweicloud.sdk.servicestage.v2.model.ShowApplicationConfigurationRequest;
import com.huaweicloud.sdk.servicestage.v2.model.ShowApplicationConfigurationResponse;
import com.huaweicloud.sdk.servicestage.v2.model.ShowApplicationDetailRequest;
import com.huaweicloud.sdk.servicestage.v2.model.ShowApplicationDetailResponse;
import com.huaweicloud.sdk.servicestage.v2.model.ShowComponentDetailRequest;
import com.huaweicloud.sdk.servicestage.v2.model.ShowComponentDetailResponse;
import com.huaweicloud.sdk.servicestage.v2.model.ShowContentRequest;
import com.huaweicloud.sdk.servicestage.v2.model.ShowContentResponse;
import com.huaweicloud.sdk.servicestage.v2.model.ShowEnvironmentDetailRequest;
import com.huaweicloud.sdk.servicestage.v2.model.ShowEnvironmentDetailResponse;
import com.huaweicloud.sdk.servicestage.v2.model.ShowInstanceDetailRequest;
import com.huaweicloud.sdk.servicestage.v2.model.ShowInstanceDetailResponse;
import com.huaweicloud.sdk.servicestage.v2.model.ShowJobDetailRequest;
import com.huaweicloud.sdk.servicestage.v2.model.ShowJobDetailResponse;
import com.huaweicloud.sdk.servicestage.v2.model.ShowProjectDetailRequest;
import com.huaweicloud.sdk.servicestage.v2.model.ShowProjectDetailResponse;
import com.huaweicloud.sdk.servicestage.v2.model.ShowRedirectUrlRequest;
import com.huaweicloud.sdk.servicestage.v2.model.ShowRedirectUrlResponse;
import com.huaweicloud.sdk.servicestage.v2.model.TagCreate;
import com.huaweicloud.sdk.servicestage.v2.model.UpdateFileRequest;
import com.huaweicloud.sdk.servicestage.v2.model.UpdateFileResponse;
import com.huaweicloud.sdk.servicestage.v2.model.UpdateInstanceActionRequest;
import com.huaweicloud.sdk.servicestage.v2.model.UpdateInstanceActionResponse;

@SuppressWarnings("unchecked")
public class ServiceStageMeta {

    public static final HttpRequestDef<ChangeApplicationRequest, ChangeApplicationResponse> changeApplication =
        genForChangeApplication();

    private static HttpRequestDef<ChangeApplicationRequest, ChangeApplicationResponse> genForChangeApplication() {
        // basic
        HttpRequestDef.Builder<ChangeApplicationRequest, ChangeApplicationResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, ChangeApplicationRequest.class, ChangeApplicationResponse.class)
                .withName("ChangeApplication")
                .withUri("/v2/{project_id}/cas/applications/{application_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("application_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ChangeApplicationRequest::getApplicationId,
                ChangeApplicationRequest::setApplicationId));
        builder.<ApplicationModify>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ApplicationModify.class),
            f -> f.withMarshaller(ChangeApplicationRequest::getBody, ChangeApplicationRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ChangeApplicationConfigurationRequest, ChangeApplicationConfigurationResponse> changeApplicationConfiguration =
        genForChangeApplicationConfiguration();

    private static HttpRequestDef<ChangeApplicationConfigurationRequest, ChangeApplicationConfigurationResponse> genForChangeApplicationConfiguration() {
        // basic
        HttpRequestDef.Builder<ChangeApplicationConfigurationRequest, ChangeApplicationConfigurationResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    ChangeApplicationConfigurationRequest.class,
                    ChangeApplicationConfigurationResponse.class)
                .withName("ChangeApplicationConfiguration")
                .withUri("/v2/{project_id}/cas/applications/{application_id}/configuration")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("application_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ChangeApplicationConfigurationRequest::getApplicationId,
                ChangeApplicationConfigurationRequest::setApplicationId));
        builder.<ApplicationConfigModify>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ApplicationConfigModify.class),
            f -> f.withMarshaller(ChangeApplicationConfigurationRequest::getBody,
                ChangeApplicationConfigurationRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ChangeComponentRequest, ChangeComponentResponse> changeComponent =
        genForChangeComponent();

    private static HttpRequestDef<ChangeComponentRequest, ChangeComponentResponse> genForChangeComponent() {
        // basic
        HttpRequestDef.Builder<ChangeComponentRequest, ChangeComponentResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, ChangeComponentRequest.class, ChangeComponentResponse.class)
                .withName("ChangeComponent")
                .withUri("/v2/{project_id}/cas/applications/{application_id}/components/{component_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("application_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ChangeComponentRequest::getApplicationId, ChangeComponentRequest::setApplicationId));
        builder.<String>withRequestField("component_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ChangeComponentRequest::getComponentId, ChangeComponentRequest::setComponentId));
        builder.<ComponentModify>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ComponentModify.class),
            f -> f.withMarshaller(ChangeComponentRequest::getBody, ChangeComponentRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ChangeEnvironmentRequest, ChangeEnvironmentResponse> changeEnvironment =
        genForChangeEnvironment();

    private static HttpRequestDef<ChangeEnvironmentRequest, ChangeEnvironmentResponse> genForChangeEnvironment() {
        // basic
        HttpRequestDef.Builder<ChangeEnvironmentRequest, ChangeEnvironmentResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, ChangeEnvironmentRequest.class, ChangeEnvironmentResponse.class)
                .withName("ChangeEnvironment")
                .withUri("/v2/{project_id}/cas/environments/{environment_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("environment_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ChangeEnvironmentRequest::getEnvironmentId,
                ChangeEnvironmentRequest::setEnvironmentId));
        builder.<EnvironmentModify>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(EnvironmentModify.class),
            f -> f.withMarshaller(ChangeEnvironmentRequest::getBody, ChangeEnvironmentRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ChangeInstanceRequest, ChangeInstanceResponse> changeInstance =
        genForChangeInstance();

    private static HttpRequestDef<ChangeInstanceRequest, ChangeInstanceResponse> genForChangeInstance() {
        // basic
        HttpRequestDef.Builder<ChangeInstanceRequest, ChangeInstanceResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, ChangeInstanceRequest.class, ChangeInstanceResponse.class)
            .withName("ChangeInstance")
            .withUri(
                "/v2/{project_id}/cas/applications/{application_id}/components/{component_id}/instances/{instance_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("application_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ChangeInstanceRequest::getApplicationId, ChangeInstanceRequest::setApplicationId));
        builder.<String>withRequestField("component_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ChangeInstanceRequest::getComponentId, ChangeInstanceRequest::setComponentId));
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ChangeInstanceRequest::getInstanceId, ChangeInstanceRequest::setInstanceId));
        builder.<InstanceModify>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(InstanceModify.class),
            f -> f.withMarshaller(ChangeInstanceRequest::getBody, ChangeInstanceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ChangeResourceInEnvironmentRequest, ChangeResourceInEnvironmentResponse> changeResourceInEnvironment =
        genForChangeResourceInEnvironment();

    private static HttpRequestDef<ChangeResourceInEnvironmentRequest, ChangeResourceInEnvironmentResponse> genForChangeResourceInEnvironment() {
        // basic
        HttpRequestDef.Builder<ChangeResourceInEnvironmentRequest, ChangeResourceInEnvironmentResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PATCH,
                    ChangeResourceInEnvironmentRequest.class,
                    ChangeResourceInEnvironmentResponse.class)
                .withName("ChangeResourceInEnvironment")
                .withUri("/v2/{project_id}/cas/environments/{environment_id}/resources")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("environment_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ChangeResourceInEnvironmentRequest::getEnvironmentId,
                ChangeResourceInEnvironmentRequest::setEnvironmentId));
        builder.<EnvironmentResourceModify>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(EnvironmentResourceModify.class),
            f -> f.withMarshaller(ChangeResourceInEnvironmentRequest::getBody,
                ChangeResourceInEnvironmentRequest::setBody));

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
                .withUri("/v2/{project_id}/cas/applications")
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

    public static final HttpRequestDef<CreateComponentRequest, CreateComponentResponse> createComponent =
        genForCreateComponent();

    private static HttpRequestDef<CreateComponentRequest, CreateComponentResponse> genForCreateComponent() {
        // basic
        HttpRequestDef.Builder<CreateComponentRequest, CreateComponentResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateComponentRequest.class, CreateComponentResponse.class)
                .withName("CreateComponent")
                .withUri("/v2/{project_id}/cas/applications/{application_id}/components")
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

    public static final HttpRequestDef<CreateEnvironmentRequest, CreateEnvironmentResponse> createEnvironment =
        genForCreateEnvironment();

    private static HttpRequestDef<CreateEnvironmentRequest, CreateEnvironmentResponse> genForCreateEnvironment() {
        // basic
        HttpRequestDef.Builder<CreateEnvironmentRequest, CreateEnvironmentResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateEnvironmentRequest.class, CreateEnvironmentResponse.class)
                .withName("CreateEnvironment")
                .withUri("/v2/{project_id}/cas/environments")
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

    public static final HttpRequestDef<CreateInstanceRequest, CreateInstanceResponse> createInstance =
        genForCreateInstance();

    private static HttpRequestDef<CreateInstanceRequest, CreateInstanceResponse> genForCreateInstance() {
        // basic
        HttpRequestDef.Builder<CreateInstanceRequest, CreateInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateInstanceRequest.class, CreateInstanceResponse.class)
                .withName("CreateInstance")
                .withUri("/v2/{project_id}/cas/applications/{application_id}/components/{component_id}/instances")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("application_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateInstanceRequest::getApplicationId, CreateInstanceRequest::setApplicationId));
        builder.<String>withRequestField("component_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateInstanceRequest::getComponentId, CreateInstanceRequest::setComponentId));
        builder.<InstanceCreate>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(InstanceCreate.class),
            f -> f.withMarshaller(CreateInstanceRequest::getBody, CreateInstanceRequest::setBody));

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
                .withUri("/v2/{project_id}/cas/applications/{application_id}")
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
                .withUri("/v2/{project_id}/cas/applications/{application_id}/configuration")
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

    public static final HttpRequestDef<DeleteComponentRequest, DeleteComponentResponse> deleteComponent =
        genForDeleteComponent();

    private static HttpRequestDef<DeleteComponentRequest, DeleteComponentResponse> genForDeleteComponent() {
        // basic
        HttpRequestDef.Builder<DeleteComponentRequest, DeleteComponentResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteComponentRequest.class, DeleteComponentResponse.class)
                .withName("DeleteComponent")
                .withUri("/v2/{project_id}/cas/applications/{application_id}/components/{component_id}")
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
        builder.<Boolean>withRequestField("force",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(DeleteComponentRequest::getForce, DeleteComponentRequest::setForce));

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
                .withUri("/v2/{project_id}/cas/environments/{environment_id}")
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

    public static final HttpRequestDef<DeleteInstanceRequest, DeleteInstanceResponse> deleteInstance =
        genForDeleteInstance();

    private static HttpRequestDef<DeleteInstanceRequest, DeleteInstanceResponse> genForDeleteInstance() {
        // basic
        HttpRequestDef.Builder<DeleteInstanceRequest, DeleteInstanceResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteInstanceRequest.class, DeleteInstanceResponse.class)
            .withName("DeleteInstance")
            .withUri(
                "/v2/{project_id}/cas/applications/{application_id}/components/{component_id}/instances/{instance_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("application_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteInstanceRequest::getApplicationId, DeleteInstanceRequest::setApplicationId));
        builder.<String>withRequestField("component_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteInstanceRequest::getComponentId, DeleteInstanceRequest::setComponentId));
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteInstanceRequest::getInstanceId, DeleteInstanceRequest::setInstanceId));
        builder.<Boolean>withRequestField("force",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(DeleteInstanceRequest::getForce, DeleteInstanceRequest::setForce));

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
                .withUri("/v2/{project_id}/cas/applications")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListApplicationsRequest::getLimit, ListApplicationsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListApplicationsRequest::getOffset, ListApplicationsRequest::setOffset));
        builder.<String>withRequestField("order_by",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApplicationsRequest::getOrderBy, ListApplicationsRequest::setOrderBy));
        builder.<ListApplicationsRequest.OrderEnum>withRequestField("order",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListApplicationsRequest.OrderEnum.class),
            f -> f.withMarshaller(ListApplicationsRequest::getOrder, ListApplicationsRequest::setOrder));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListComponentOverviewsRequest, ListComponentOverviewsResponse> listComponentOverviews =
        genForListComponentOverviews();

    private static HttpRequestDef<ListComponentOverviewsRequest, ListComponentOverviewsResponse> genForListComponentOverviews() {
        // basic
        HttpRequestDef.Builder<ListComponentOverviewsRequest, ListComponentOverviewsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListComponentOverviewsRequest.class, ListComponentOverviewsResponse.class)
            .withName("ListComponentOverviews")
            .withUri("/v2/{project_id}/cas/applications/{application_id}/components/overviews")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("application_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListComponentOverviewsRequest::getApplicationId,
                ListComponentOverviewsRequest::setApplicationId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListComponentOverviewsRequest::getLimit, ListComponentOverviewsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListComponentOverviewsRequest::getOffset, ListComponentOverviewsRequest::setOffset));
        builder.<String>withRequestField("order_by",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListComponentOverviewsRequest::getOrderBy,
                ListComponentOverviewsRequest::setOrderBy));
        builder.<ListComponentOverviewsRequest.OrderEnum>withRequestField("order",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListComponentOverviewsRequest.OrderEnum.class),
            f -> f.withMarshaller(ListComponentOverviewsRequest::getOrder, ListComponentOverviewsRequest::setOrder));

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
                .withUri("/v2/{project_id}/cas/applications/{application_id}/components")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("application_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListComponentsRequest::getApplicationId, ListComponentsRequest::setApplicationId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListComponentsRequest::getLimit, ListComponentsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListComponentsRequest::getOffset, ListComponentsRequest::setOffset));
        builder.<String>withRequestField("order_by",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListComponentsRequest::getOrderBy, ListComponentsRequest::setOrderBy));
        builder.<ListComponentsRequest.OrderEnum>withRequestField("order",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListComponentsRequest.OrderEnum.class),
            f -> f.withMarshaller(ListComponentsRequest::getOrder, ListComponentsRequest::setOrder));

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
                .withUri("/v2/{project_id}/cas/environments")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEnvironmentsRequest::getLimit, ListEnvironmentsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEnvironmentsRequest::getOffset, ListEnvironmentsRequest::setOffset));
        builder.<String>withRequestField("order_by",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEnvironmentsRequest::getOrderBy, ListEnvironmentsRequest::setOrderBy));
        builder.<ListEnvironmentsRequest.OrderEnum>withRequestField("order",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListEnvironmentsRequest.OrderEnum.class),
            f -> f.withMarshaller(ListEnvironmentsRequest::getOrder, ListEnvironmentsRequest::setOrder));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListInstanceSnapshotsRequest, ListInstanceSnapshotsResponse> listInstanceSnapshots =
        genForListInstanceSnapshots();

    private static HttpRequestDef<ListInstanceSnapshotsRequest, ListInstanceSnapshotsResponse> genForListInstanceSnapshots() {
        // basic
        HttpRequestDef.Builder<ListInstanceSnapshotsRequest, ListInstanceSnapshotsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListInstanceSnapshotsRequest.class, ListInstanceSnapshotsResponse.class)
            .withName("ListInstanceSnapshots")
            .withUri(
                "/v2/{project_id}/cas/applications/{application_id}/components/{component_id}/instances/{instance_id}/snapshots")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("application_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstanceSnapshotsRequest::getApplicationId,
                ListInstanceSnapshotsRequest::setApplicationId));
        builder.<String>withRequestField("component_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstanceSnapshotsRequest::getComponentId,
                ListInstanceSnapshotsRequest::setComponentId));
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstanceSnapshotsRequest::getInstanceId,
                ListInstanceSnapshotsRequest::setInstanceId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInstanceSnapshotsRequest::getLimit, ListInstanceSnapshotsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInstanceSnapshotsRequest::getOffset, ListInstanceSnapshotsRequest::setOffset));
        builder.<String>withRequestField("snapshot_order_by",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstanceSnapshotsRequest::getSnapshotOrderBy,
                ListInstanceSnapshotsRequest::setSnapshotOrderBy));
        builder.<ListInstanceSnapshotsRequest.OrderEnum>withRequestField("order",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListInstanceSnapshotsRequest.OrderEnum.class),
            f -> f.withMarshaller(ListInstanceSnapshotsRequest::getOrder, ListInstanceSnapshotsRequest::setOrder));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListInstancesRequest, ListInstancesResponse> listInstances =
        genForListInstances();

    private static HttpRequestDef<ListInstancesRequest, ListInstancesResponse> genForListInstances() {
        // basic
        HttpRequestDef.Builder<ListInstancesRequest, ListInstancesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListInstancesRequest.class, ListInstancesResponse.class)
                .withName("ListInstances")
                .withUri("/v2/{project_id}/cas/applications/{application_id}/components/{component_id}/instances")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("application_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstancesRequest::getApplicationId, ListInstancesRequest::setApplicationId));
        builder.<String>withRequestField("component_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstancesRequest::getComponentId, ListInstancesRequest::setComponentId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInstancesRequest::getLimit, ListInstancesRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInstancesRequest::getOffset, ListInstancesRequest::setOffset));
        builder.<String>withRequestField("order_by",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstancesRequest::getOrderBy, ListInstancesRequest::setOrderBy));
        builder.<ListInstancesRequest.OrderEnum>withRequestField("order",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListInstancesRequest.OrderEnum.class),
            f -> f.withMarshaller(ListInstancesRequest::getOrder, ListInstancesRequest::setOrder));

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
                .withUri("/v2/{project_id}/cas/applications/{application_id}/configuration")
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

    public static final HttpRequestDef<ShowApplicationDetailRequest, ShowApplicationDetailResponse> showApplicationDetail =
        genForShowApplicationDetail();

    private static HttpRequestDef<ShowApplicationDetailRequest, ShowApplicationDetailResponse> genForShowApplicationDetail() {
        // basic
        HttpRequestDef.Builder<ShowApplicationDetailRequest, ShowApplicationDetailResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowApplicationDetailRequest.class, ShowApplicationDetailResponse.class)
            .withName("ShowApplicationDetail")
            .withUri("/v2/{project_id}/cas/applications/{application_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("application_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowApplicationDetailRequest::getApplicationId,
                ShowApplicationDetailRequest::setApplicationId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowComponentDetailRequest, ShowComponentDetailResponse> showComponentDetail =
        genForShowComponentDetail();

    private static HttpRequestDef<ShowComponentDetailRequest, ShowComponentDetailResponse> genForShowComponentDetail() {
        // basic
        HttpRequestDef.Builder<ShowComponentDetailRequest, ShowComponentDetailResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowComponentDetailRequest.class, ShowComponentDetailResponse.class)
                .withName("ShowComponentDetail")
                .withUri("/v2/{project_id}/cas/applications/{application_id}/components/{component_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("application_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowComponentDetailRequest::getApplicationId,
                ShowComponentDetailRequest::setApplicationId));
        builder.<String>withRequestField("component_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowComponentDetailRequest::getComponentId,
                ShowComponentDetailRequest::setComponentId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowEnvironmentDetailRequest, ShowEnvironmentDetailResponse> showEnvironmentDetail =
        genForShowEnvironmentDetail();

    private static HttpRequestDef<ShowEnvironmentDetailRequest, ShowEnvironmentDetailResponse> genForShowEnvironmentDetail() {
        // basic
        HttpRequestDef.Builder<ShowEnvironmentDetailRequest, ShowEnvironmentDetailResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowEnvironmentDetailRequest.class, ShowEnvironmentDetailResponse.class)
            .withName("ShowEnvironmentDetail")
            .withUri("/v2/{project_id}/cas/environments/{environment_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("environment_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowEnvironmentDetailRequest::getEnvironmentId,
                ShowEnvironmentDetailRequest::setEnvironmentId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowInstanceDetailRequest, ShowInstanceDetailResponse> showInstanceDetail =
        genForShowInstanceDetail();

    private static HttpRequestDef<ShowInstanceDetailRequest, ShowInstanceDetailResponse> genForShowInstanceDetail() {
        // basic
        HttpRequestDef.Builder<ShowInstanceDetailRequest, ShowInstanceDetailResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowInstanceDetailRequest.class, ShowInstanceDetailResponse.class)
            .withName("ShowInstanceDetail")
            .withUri(
                "/v2/{project_id}/cas/applications/{application_id}/components/{component_id}/instances/{instance_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("application_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowInstanceDetailRequest::getApplicationId,
                ShowInstanceDetailRequest::setApplicationId));
        builder.<String>withRequestField("component_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowInstanceDetailRequest::getComponentId,
                ShowInstanceDetailRequest::setComponentId));
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowInstanceDetailRequest::getInstanceId, ShowInstanceDetailRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowJobDetailRequest, ShowJobDetailResponse> showJobDetail =
        genForShowJobDetail();

    private static HttpRequestDef<ShowJobDetailRequest, ShowJobDetailResponse> genForShowJobDetail() {
        // basic
        HttpRequestDef.Builder<ShowJobDetailRequest, ShowJobDetailResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowJobDetailRequest.class, ShowJobDetailResponse.class)
                .withName("ShowJobDetail")
                .withUri("/v2/{project_id}/cas/jobs/{job_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJobDetailRequest::getJobId, ShowJobDetailRequest::setJobId));
        builder.<String>withRequestField("instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJobDetailRequest::getInstanceId, ShowJobDetailRequest::setInstanceId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowJobDetailRequest::getLimit, ShowJobDetailRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowJobDetailRequest::getOffset, ShowJobDetailRequest::setOffset));
        builder.<String>withRequestField("desc",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJobDetailRequest::getDesc, ShowJobDetailRequest::setDesc));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateInstanceActionRequest, UpdateInstanceActionResponse> updateInstanceAction =
        genForUpdateInstanceAction();

    private static HttpRequestDef<UpdateInstanceActionRequest, UpdateInstanceActionResponse> genForUpdateInstanceAction() {
        // basic
        HttpRequestDef.Builder<UpdateInstanceActionRequest, UpdateInstanceActionResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, UpdateInstanceActionRequest.class, UpdateInstanceActionResponse.class)
            .withName("UpdateInstanceAction")
            .withUri(
                "/v2/{project_id}/cas/applications/{application_id}/components/{component_id}/instances/{instance_id}/action")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("application_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateInstanceActionRequest::getApplicationId,
                UpdateInstanceActionRequest::setApplicationId));
        builder.<String>withRequestField("component_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateInstanceActionRequest::getComponentId,
                UpdateInstanceActionRequest::setComponentId));
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateInstanceActionRequest::getInstanceId,
                UpdateInstanceActionRequest::setInstanceId));
        builder.<InstanceAction>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(InstanceAction.class),
            f -> f.withMarshaller(UpdateInstanceActionRequest::getBody, UpdateInstanceActionRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateFileRequest, CreateFileResponse> createFile = genForCreateFile();

    private static HttpRequestDef<CreateFileRequest, CreateFileResponse> genForCreateFile() {
        // basic
        HttpRequestDef.Builder<CreateFileRequest, CreateFileResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateFileRequest.class, CreateFileResponse.class)
                .withName("CreateFile")
                .withUri("/v1/{project_id}/git/files/{namespace}/{project}/{path}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("namespace",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateFileRequest::getNamespace, CreateFileRequest::setNamespace));
        builder.<String>withRequestField("project",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateFileRequest::getProject, CreateFileRequest::setProject));
        builder.<String>withRequestField("path",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateFileRequest::getPath, CreateFileRequest::setPath));
        builder.<String>withRequestField("ref",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateFileRequest::getRef, CreateFileRequest::setRef));
        builder.<String>withRequestField("X-Repo-Auth",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateFileRequest::getXRepoAuth, CreateFileRequest::setXRepoAuth));
        builder.<FileCreate>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(FileCreate.class),
            f -> f.withMarshaller(CreateFileRequest::getBody, CreateFileRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateHookRequest, CreateHookResponse> createHook = genForCreateHook();

    private static HttpRequestDef<CreateHookRequest, CreateHookResponse> genForCreateHook() {
        // basic
        HttpRequestDef.Builder<CreateHookRequest, CreateHookResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateHookRequest.class, CreateHookResponse.class)
                .withName("CreateHook")
                .withUri("/v1/{project_id}/git/repos/{namespace}/{project}/hooks")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("namespace",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateHookRequest::getNamespace, CreateHookRequest::setNamespace));
        builder.<String>withRequestField("project",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateHookRequest::getProject, CreateHookRequest::setProject));
        builder.<String>withRequestField("X-Repo-Auth",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateHookRequest::getXRepoAuth, CreateHookRequest::setXRepoAuth));
        builder.<HookCreate>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(HookCreate.class),
            f -> f.withMarshaller(CreateHookRequest::getBody, CreateHookRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateOAuthRequest, CreateOAuthResponse> createOAuth = genForCreateOAuth();

    private static HttpRequestDef<CreateOAuthRequest, CreateOAuthResponse> genForCreateOAuth() {
        // basic
        HttpRequestDef.Builder<CreateOAuthRequest, CreateOAuthResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateOAuthRequest.class, CreateOAuthResponse.class)
                .withName("CreateOAuth")
                .withUri("/v1/{project_id}/git/auths/{repo_type}/oauth")
                .withContentType("application/json");

        // requests
        builder.<CreateOAuthRequest.RepoTypeEnum>withRequestField("repo_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateOAuthRequest.RepoTypeEnum.class),
            f -> f.withMarshaller(CreateOAuthRequest::getRepoType, CreateOAuthRequest::setRepoType));
        builder.<String>withRequestField("tag",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateOAuthRequest::getTag, CreateOAuthRequest::setTag));
        builder.<OAuth>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(OAuth.class),
            f -> f.withMarshaller(CreateOAuthRequest::getBody, CreateOAuthRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreatePasswordAuthRequest, CreatePasswordAuthResponse> createPasswordAuth =
        genForCreatePasswordAuth();

    private static HttpRequestDef<CreatePasswordAuthRequest, CreatePasswordAuthResponse> genForCreatePasswordAuth() {
        // basic
        HttpRequestDef.Builder<CreatePasswordAuthRequest, CreatePasswordAuthResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreatePasswordAuthRequest.class, CreatePasswordAuthResponse.class)
                .withName("CreatePasswordAuth")
                .withUri("/v1/{project_id}/git/auths/{repo_type}/password")
                .withContentType("application/json");

        // requests
        builder.<CreatePasswordAuthRequest.RepoTypeEnum>withRequestField("repo_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreatePasswordAuthRequest.RepoTypeEnum.class),
            f -> f.withMarshaller(CreatePasswordAuthRequest::getRepoType, CreatePasswordAuthRequest::setRepoType));
        builder.<AccessPassword>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(AccessPassword.class),
            f -> f.withMarshaller(CreatePasswordAuthRequest::getBody, CreatePasswordAuthRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreatePersonalAuthRequest, CreatePersonalAuthResponse> createPersonalAuth =
        genForCreatePersonalAuth();

    private static HttpRequestDef<CreatePersonalAuthRequest, CreatePersonalAuthResponse> genForCreatePersonalAuth() {
        // basic
        HttpRequestDef.Builder<CreatePersonalAuthRequest, CreatePersonalAuthResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreatePersonalAuthRequest.class, CreatePersonalAuthResponse.class)
                .withName("CreatePersonalAuth")
                .withUri("/v1/{project_id}/git/auths/{repo_type}/personal")
                .withContentType("application/json");

        // requests
        builder.<CreatePersonalAuthRequest.RepoTypeEnum>withRequestField("repo_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreatePersonalAuthRequest.RepoTypeEnum.class),
            f -> f.withMarshaller(CreatePersonalAuthRequest::getRepoType, CreatePersonalAuthRequest::setRepoType));
        builder.<AccessToken>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(AccessToken.class),
            f -> f.withMarshaller(CreatePersonalAuthRequest::getBody, CreatePersonalAuthRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateProjectRequest, CreateProjectResponse> createProject =
        genForCreateProject();

    private static HttpRequestDef<CreateProjectRequest, CreateProjectResponse> genForCreateProject() {
        // basic
        HttpRequestDef.Builder<CreateProjectRequest, CreateProjectResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateProjectRequest.class, CreateProjectResponse.class)
                .withName("CreateProject")
                .withUri("/v1/{project_id}/git/repos/{namespace}/projects")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("namespace",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateProjectRequest::getNamespace, CreateProjectRequest::setNamespace));
        builder.<String>withRequestField("X-Repo-Auth",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateProjectRequest::getXRepoAuth, CreateProjectRequest::setXRepoAuth));
        builder.<ProjectCreate>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ProjectCreate.class),
            f -> f.withMarshaller(CreateProjectRequest::getBody, CreateProjectRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateTagRequest, CreateTagResponse> createTag = genForCreateTag();

    private static HttpRequestDef<CreateTagRequest, CreateTagResponse> genForCreateTag() {
        // basic
        HttpRequestDef.Builder<CreateTagRequest, CreateTagResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateTagRequest.class, CreateTagResponse.class)
                .withName("CreateTag")
                .withUri("/v1/{project_id}/git/repos/{namespace}/{project}/tags")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("namespace",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateTagRequest::getNamespace, CreateTagRequest::setNamespace));
        builder.<String>withRequestField("project",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateTagRequest::getProject, CreateTagRequest::setProject));
        builder.<String>withRequestField("ref",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateTagRequest::getRef, CreateTagRequest::setRef));
        builder.<String>withRequestField("X-Repo-Auth",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateTagRequest::getXRepoAuth, CreateTagRequest::setXRepoAuth));
        builder.<TagCreate>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(TagCreate.class),
            f -> f.withMarshaller(CreateTagRequest::getBody, CreateTagRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteAuthorizeRequest, DeleteAuthorizeResponse> deleteAuthorize =
        genForDeleteAuthorize();

    private static HttpRequestDef<DeleteAuthorizeRequest, DeleteAuthorizeResponse> genForDeleteAuthorize() {
        // basic
        HttpRequestDef.Builder<DeleteAuthorizeRequest, DeleteAuthorizeResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteAuthorizeRequest.class, DeleteAuthorizeResponse.class)
                .withName("DeleteAuthorize")
                .withUri("/v1/{project_id}/git/auths/{name}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAuthorizeRequest::getName, DeleteAuthorizeRequest::setName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteFileRequest, DeleteFileResponse> deleteFile = genForDeleteFile();

    private static HttpRequestDef<DeleteFileRequest, DeleteFileResponse> genForDeleteFile() {
        // basic
        HttpRequestDef.Builder<DeleteFileRequest, DeleteFileResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteFileRequest.class, DeleteFileResponse.class)
                .withName("DeleteFile")
                .withUri("/v1/{project_id}/git/files/{namespace}/{project}/{path}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("namespace",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteFileRequest::getNamespace, DeleteFileRequest::setNamespace));
        builder.<String>withRequestField("project",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteFileRequest::getProject, DeleteFileRequest::setProject));
        builder.<String>withRequestField("path",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteFileRequest::getPath, DeleteFileRequest::setPath));
        builder.<String>withRequestField("ref",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteFileRequest::getRef, DeleteFileRequest::setRef));
        builder.<String>withRequestField("message",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteFileRequest::getMessage, DeleteFileRequest::setMessage));
        builder.<String>withRequestField("sha",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteFileRequest::getSha, DeleteFileRequest::setSha));
        builder.<String>withRequestField("X-Repo-Auth",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteFileRequest::getXRepoAuth, DeleteFileRequest::setXRepoAuth));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteHookRequest, DeleteHookResponse> deleteHook = genForDeleteHook();

    private static HttpRequestDef<DeleteHookRequest, DeleteHookResponse> genForDeleteHook() {
        // basic
        HttpRequestDef.Builder<DeleteHookRequest, DeleteHookResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteHookRequest.class, DeleteHookResponse.class)
                .withName("DeleteHook")
                .withUri("/v1/{project_id}/git/repos/{namespace}/{project}/hooks/{hook_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("namespace",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteHookRequest::getNamespace, DeleteHookRequest::setNamespace));
        builder.<String>withRequestField("project",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteHookRequest::getProject, DeleteHookRequest::setProject));
        builder.<String>withRequestField("hook_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteHookRequest::getHookId, DeleteHookRequest::setHookId));
        builder.<String>withRequestField("X-Repo-Auth",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteHookRequest::getXRepoAuth, DeleteHookRequest::setXRepoAuth));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteTagRequest, DeleteTagResponse> deleteTag = genForDeleteTag();

    private static HttpRequestDef<DeleteTagRequest, DeleteTagResponse> genForDeleteTag() {
        // basic
        HttpRequestDef.Builder<DeleteTagRequest, DeleteTagResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteTagRequest.class, DeleteTagResponse.class)
                .withName("DeleteTag")
                .withUri("/v1/{project_id}/git/repos/{namespace}/{project}/tags/{tag_name}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("namespace",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTagRequest::getNamespace, DeleteTagRequest::setNamespace));
        builder.<String>withRequestField("project",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTagRequest::getProject, DeleteTagRequest::setProject));
        builder.<String>withRequestField("tag_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTagRequest::getTagName, DeleteTagRequest::setTagName));
        builder.<String>withRequestField("X-Repo-Auth",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTagRequest::getXRepoAuth, DeleteTagRequest::setXRepoAuth));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAuthorizationsRequest, ListAuthorizationsResponse> listAuthorizations =
        genForListAuthorizations();

    private static HttpRequestDef<ListAuthorizationsRequest, ListAuthorizationsResponse> genForListAuthorizations() {
        // basic
        HttpRequestDef.Builder<ListAuthorizationsRequest, ListAuthorizationsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAuthorizationsRequest.class, ListAuthorizationsResponse.class)
                .withName("ListAuthorizations")
                .withUri("/v1/{project_id}/git/auths")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListBranchesRequest, ListBranchesResponse> listBranches = genForListBranches();

    private static HttpRequestDef<ListBranchesRequest, ListBranchesResponse> genForListBranches() {
        // basic
        HttpRequestDef.Builder<ListBranchesRequest, ListBranchesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListBranchesRequest.class, ListBranchesResponse.class)
                .withName("ListBranches")
                .withUri("/v1/{project_id}/git/repos/{namespace}/{project}/branches")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("namespace",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBranchesRequest::getNamespace, ListBranchesRequest::setNamespace));
        builder.<String>withRequestField("project",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBranchesRequest::getProject, ListBranchesRequest::setProject));
        builder.<String>withRequestField("X-Repo-Auth",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBranchesRequest::getXRepoAuth, ListBranchesRequest::setXRepoAuth));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCommitsRequest, ListCommitsResponse> listCommits = genForListCommits();

    private static HttpRequestDef<ListCommitsRequest, ListCommitsResponse> genForListCommits() {
        // basic
        HttpRequestDef.Builder<ListCommitsRequest, ListCommitsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListCommitsRequest.class, ListCommitsResponse.class)
                .withName("ListCommits")
                .withUri("/v1/{project_id}/git/repos/{namespace}/{project}/commits")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("namespace",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCommitsRequest::getNamespace, ListCommitsRequest::setNamespace));
        builder.<String>withRequestField("project",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCommitsRequest::getProject, ListCommitsRequest::setProject));
        builder.<String>withRequestField("ref",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCommitsRequest::getRef, ListCommitsRequest::setRef));
        builder.<String>withRequestField("X-Repo-Auth",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCommitsRequest::getXRepoAuth, ListCommitsRequest::setXRepoAuth));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListHooksRequest, ListHooksResponse> listHooks = genForListHooks();

    private static HttpRequestDef<ListHooksRequest, ListHooksResponse> genForListHooks() {
        // basic
        HttpRequestDef.Builder<ListHooksRequest, ListHooksResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListHooksRequest.class, ListHooksResponse.class)
                .withName("ListHooks")
                .withUri("/v1/{project_id}/git/repos/{namespace}/{project}/hooks")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("namespace",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHooksRequest::getNamespace, ListHooksRequest::setNamespace));
        builder.<String>withRequestField("project",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHooksRequest::getProject, ListHooksRequest::setProject));
        builder.<String>withRequestField("X-Repo-Auth",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHooksRequest::getXRepoAuth, ListHooksRequest::setXRepoAuth));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListNamespacesRequest, ListNamespacesResponse> listNamespaces =
        genForListNamespaces();

    private static HttpRequestDef<ListNamespacesRequest, ListNamespacesResponse> genForListNamespaces() {
        // basic
        HttpRequestDef.Builder<ListNamespacesRequest, ListNamespacesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListNamespacesRequest.class, ListNamespacesResponse.class)
                .withName("ListNamespaces")
                .withUri("/v1/{project_id}/git/repos/namespaces")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("X-Repo-Auth",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNamespacesRequest::getXRepoAuth, ListNamespacesRequest::setXRepoAuth));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListProjectsRequest, ListProjectsResponse> listProjects = genForListProjects();

    private static HttpRequestDef<ListProjectsRequest, ListProjectsResponse> genForListProjects() {
        // basic
        HttpRequestDef.Builder<ListProjectsRequest, ListProjectsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListProjectsRequest.class, ListProjectsResponse.class)
                .withName("ListProjects")
                .withUri("/v1/{project_id}/git/repos/{namespace}/projects")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("namespace",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProjectsRequest::getNamespace, ListProjectsRequest::setNamespace));
        builder.<String>withRequestField("X-Repo-Auth",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProjectsRequest::getXRepoAuth, ListProjectsRequest::setXRepoAuth));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTagsRequest, ListTagsResponse> listTags = genForListTags();

    private static HttpRequestDef<ListTagsRequest, ListTagsResponse> genForListTags() {
        // basic
        HttpRequestDef.Builder<ListTagsRequest, ListTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListTagsRequest.class, ListTagsResponse.class)
                .withName("ListTags")
                .withUri("/v1/{project_id}/git/repos/{namespace}/{project}/tags")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("namespace",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTagsRequest::getNamespace, ListTagsRequest::setNamespace));
        builder.<String>withRequestField("project",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTagsRequest::getProject, ListTagsRequest::setProject));
        builder.<String>withRequestField("X-Repo-Auth",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTagsRequest::getXRepoAuth, ListTagsRequest::setXRepoAuth));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTreesRequest, ListTreesResponse> listTrees = genForListTrees();

    private static HttpRequestDef<ListTreesRequest, ListTreesResponse> genForListTrees() {
        // basic
        HttpRequestDef.Builder<ListTreesRequest, ListTreesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListTreesRequest.class, ListTreesResponse.class)
                .withName("ListTrees")
                .withUri("/v1/{project_id}/git/files/{namespace}/{project}/trees")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("namespace",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTreesRequest::getNamespace, ListTreesRequest::setNamespace));
        builder.<String>withRequestField("project",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTreesRequest::getProject, ListTreesRequest::setProject));
        builder.<String>withRequestField("ref",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTreesRequest::getRef, ListTreesRequest::setRef));
        builder.<String>withRequestField("X-Repo-Auth",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTreesRequest::getXRepoAuth, ListTreesRequest::setXRepoAuth));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowContentRequest, ShowContentResponse> showContent = genForShowContent();

    private static HttpRequestDef<ShowContentRequest, ShowContentResponse> genForShowContent() {
        // basic
        HttpRequestDef.Builder<ShowContentRequest, ShowContentResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowContentRequest.class, ShowContentResponse.class)
                .withName("ShowContent")
                .withUri("/v1/{project_id}/git/files/{namespace}/{project}/{path}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("namespace",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowContentRequest::getNamespace, ShowContentRequest::setNamespace));
        builder.<String>withRequestField("project",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowContentRequest::getProject, ShowContentRequest::setProject));
        builder.<String>withRequestField("path",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowContentRequest::getPath, ShowContentRequest::setPath));
        builder.<String>withRequestField("ref",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowContentRequest::getRef, ShowContentRequest::setRef));
        builder.<String>withRequestField("X-Repo-Auth",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowContentRequest::getXRepoAuth, ShowContentRequest::setXRepoAuth));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowProjectDetailRequest, ShowProjectDetailResponse> showProjectDetail =
        genForShowProjectDetail();

    private static HttpRequestDef<ShowProjectDetailRequest, ShowProjectDetailResponse> genForShowProjectDetail() {
        // basic
        HttpRequestDef.Builder<ShowProjectDetailRequest, ShowProjectDetailResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowProjectDetailRequest.class, ShowProjectDetailResponse.class)
                .withName("ShowProjectDetail")
                .withUri("/v1/{project_id}/git/repos/project-info")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("clone_url",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowProjectDetailRequest::getCloneUrl, ShowProjectDetailRequest::setCloneUrl));
        builder.<String>withRequestField("X-Repo-Auth",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowProjectDetailRequest::getXRepoAuth, ShowProjectDetailRequest::setXRepoAuth));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowRedirectUrlRequest, ShowRedirectUrlResponse> showRedirectUrl =
        genForShowRedirectUrl();

    private static HttpRequestDef<ShowRedirectUrlRequest, ShowRedirectUrlResponse> genForShowRedirectUrl() {
        // basic
        HttpRequestDef.Builder<ShowRedirectUrlRequest, ShowRedirectUrlResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowRedirectUrlRequest.class, ShowRedirectUrlResponse.class)
                .withName("ShowRedirectUrl")
                .withUri("/v1/{project_id}/git/auths/{repo_type}/redirect")
                .withContentType("application/json");

        // requests
        builder.<ShowRedirectUrlRequest.RepoTypeEnum>withRequestField("repo_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ShowRedirectUrlRequest.RepoTypeEnum.class),
            f -> f.withMarshaller(ShowRedirectUrlRequest::getRepoType, ShowRedirectUrlRequest::setRepoType));
        builder.<String>withRequestField("tag",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRedirectUrlRequest::getTag, ShowRedirectUrlRequest::setTag));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateFileRequest, UpdateFileResponse> updateFile = genForUpdateFile();

    private static HttpRequestDef<UpdateFileRequest, UpdateFileResponse> genForUpdateFile() {
        // basic
        HttpRequestDef.Builder<UpdateFileRequest, UpdateFileResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateFileRequest.class, UpdateFileResponse.class)
                .withName("UpdateFile")
                .withUri("/v1/{project_id}/git/files/{namespace}/{project}/{path}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("namespace",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateFileRequest::getNamespace, UpdateFileRequest::setNamespace));
        builder.<String>withRequestField("project",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateFileRequest::getProject, UpdateFileRequest::setProject));
        builder.<String>withRequestField("path",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateFileRequest::getPath, UpdateFileRequest::setPath));
        builder.<String>withRequestField("ref",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateFileRequest::getRef, UpdateFileRequest::setRef));
        builder.<String>withRequestField("X-Repo-Auth",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateFileRequest::getXRepoAuth, UpdateFileRequest::setXRepoAuth));
        builder.<FileUpdate>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(FileUpdate.class),
            f -> f.withMarshaller(UpdateFileRequest::getBody, UpdateFileRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListFlavorsRequest, ListFlavorsResponse> listFlavors = genForListFlavors();

    private static HttpRequestDef<ListFlavorsRequest, ListFlavorsResponse> genForListFlavors() {
        // basic
        HttpRequestDef.Builder<ListFlavorsRequest, ListFlavorsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListFlavorsRequest.class, ListFlavorsResponse.class)
                .withName("ListFlavors")
                .withUri("/v2/{project_id}/cas/metadata/flavors")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListRuntimesRequest, ListRuntimesResponse> listRuntimes = genForListRuntimes();

    private static HttpRequestDef<ListRuntimesRequest, ListRuntimesResponse> genForListRuntimes() {
        // basic
        HttpRequestDef.Builder<ListRuntimesRequest, ListRuntimesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListRuntimesRequest.class, ListRuntimesResponse.class)
                .withName("ListRuntimes")
                .withUri("/v2/{project_id}/cas/metadata/runtimes")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTemplatesRequest, ListTemplatesResponse> listTemplates =
        genForListTemplates();

    private static HttpRequestDef<ListTemplatesRequest, ListTemplatesResponse> genForListTemplates() {
        // basic
        HttpRequestDef.Builder<ListTemplatesRequest, ListTemplatesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListTemplatesRequest.class, ListTemplatesResponse.class)
                .withName("ListTemplates")
                .withUri("/v2/{project_id}/cas/metadata/templates")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

}
