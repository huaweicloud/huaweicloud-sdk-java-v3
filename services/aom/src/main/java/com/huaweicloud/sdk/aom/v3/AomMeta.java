package com.huaweicloud.sdk.aom.v3;

import com.huaweicloud.sdk.aom.v3.model.BizAppParam;
import com.huaweicloud.sdk.aom.v3.model.ComponentParam;
import com.huaweicloud.sdk.aom.v3.model.ComponentUpdateParam;
import com.huaweicloud.sdk.aom.v3.model.CreateAppRequest;
import com.huaweicloud.sdk.aom.v3.model.CreateAppResponse;
import com.huaweicloud.sdk.aom.v3.model.CreateComponentRequest;
import com.huaweicloud.sdk.aom.v3.model.CreateComponentResponse;
import com.huaweicloud.sdk.aom.v3.model.CreateEnvRequest;
import com.huaweicloud.sdk.aom.v3.model.CreateEnvResponse;
import com.huaweicloud.sdk.aom.v3.model.CreateSubAppRequest;
import com.huaweicloud.sdk.aom.v3.model.CreateSubAppResponse;
import com.huaweicloud.sdk.aom.v3.model.DeleteAppRequest;
import com.huaweicloud.sdk.aom.v3.model.DeleteAppResponse;
import com.huaweicloud.sdk.aom.v3.model.DeleteComponentRequest;
import com.huaweicloud.sdk.aom.v3.model.DeleteComponentResponse;
import com.huaweicloud.sdk.aom.v3.model.DeleteEnvRequest;
import com.huaweicloud.sdk.aom.v3.model.DeleteEnvResponse;
import com.huaweicloud.sdk.aom.v3.model.DeleteSubAppRequest;
import com.huaweicloud.sdk.aom.v3.model.DeleteSubAppResponse;
import com.huaweicloud.sdk.aom.v3.model.EnvParam;
import com.huaweicloud.sdk.aom.v3.model.ListResourceUnderNodeRequest;
import com.huaweicloud.sdk.aom.v3.model.ListResourceUnderNodeResponse;
import com.huaweicloud.sdk.aom.v3.model.PageResourceListParam;
import com.huaweicloud.sdk.aom.v3.model.ShowAppByNameRequest;
import com.huaweicloud.sdk.aom.v3.model.ShowAppByNameResponse;
import com.huaweicloud.sdk.aom.v3.model.ShowAppRequest;
import com.huaweicloud.sdk.aom.v3.model.ShowAppResponse;
import com.huaweicloud.sdk.aom.v3.model.ShowComponentByNameRequest;
import com.huaweicloud.sdk.aom.v3.model.ShowComponentByNameResponse;
import com.huaweicloud.sdk.aom.v3.model.ShowComponentRequest;
import com.huaweicloud.sdk.aom.v3.model.ShowComponentResponse;
import com.huaweicloud.sdk.aom.v3.model.ShowEnvByNameRequest;
import com.huaweicloud.sdk.aom.v3.model.ShowEnvByNameResponse;
import com.huaweicloud.sdk.aom.v3.model.ShowEnvRequest;
import com.huaweicloud.sdk.aom.v3.model.ShowEnvResponse;
import com.huaweicloud.sdk.aom.v3.model.SubAppCreateParam;
import com.huaweicloud.sdk.aom.v3.model.SubAppUpdateParam;
import com.huaweicloud.sdk.aom.v3.model.UpdateAppRequest;
import com.huaweicloud.sdk.aom.v3.model.UpdateAppResponse;
import com.huaweicloud.sdk.aom.v3.model.UpdateComponentRequest;
import com.huaweicloud.sdk.aom.v3.model.UpdateComponentResponse;
import com.huaweicloud.sdk.aom.v3.model.UpdateEnvRequest;
import com.huaweicloud.sdk.aom.v3.model.UpdateEnvResponse;
import com.huaweicloud.sdk.aom.v3.model.UpdateSubAppRequest;
import com.huaweicloud.sdk.aom.v3.model.UpdateSubAppResponse;
import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;

@SuppressWarnings("unchecked")
public class AomMeta {

    public static final HttpRequestDef<CreateAppRequest, CreateAppResponse> createApp = genForCreateApp();

    private static HttpRequestDef<CreateAppRequest, CreateAppResponse> genForCreateApp() {
        // basic
        HttpRequestDef.Builder<CreateAppRequest, CreateAppResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateAppRequest.class, CreateAppResponse.class)
                .withName("CreateApp")
                .withUri("/v1/applications")
                .withContentType("application/json");

        // requests
        builder.<BizAppParam>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BizAppParam.class),
            f -> f.withMarshaller(CreateAppRequest::getBody, CreateAppRequest::setBody));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateAppResponse::getBody, CreateAppResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<CreateComponentRequest, CreateComponentResponse> createComponent =
        genForCreateComponent();

    private static HttpRequestDef<CreateComponentRequest, CreateComponentResponse> genForCreateComponent() {
        // basic
        HttpRequestDef.Builder<CreateComponentRequest, CreateComponentResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateComponentRequest.class, CreateComponentResponse.class)
                .withName("CreateComponent")
                .withUri("/v1/components")
                .withContentType("application/json");

        // requests
        builder.<ComponentParam>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ComponentParam.class),
            f -> f.withMarshaller(CreateComponentRequest::getBody, CreateComponentRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateEnvRequest, CreateEnvResponse> createEnv = genForCreateEnv();

    private static HttpRequestDef<CreateEnvRequest, CreateEnvResponse> genForCreateEnv() {
        // basic
        HttpRequestDef.Builder<CreateEnvRequest, CreateEnvResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateEnvRequest.class, CreateEnvResponse.class)
                .withName("CreateEnv")
                .withUri("/v1/environments")
                .withContentType("application/json");

        // requests
        builder.<EnvParam>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(EnvParam.class),
            f -> f.withMarshaller(CreateEnvRequest::getBody, CreateEnvRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateSubAppRequest, CreateSubAppResponse> createSubApp = genForCreateSubApp();

    private static HttpRequestDef<CreateSubAppRequest, CreateSubAppResponse> genForCreateSubApp() {
        // basic
        HttpRequestDef.Builder<CreateSubAppRequest, CreateSubAppResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateSubAppRequest.class, CreateSubAppResponse.class)
                .withName("CreateSubApp")
                .withUri("/v1/sub-applications")
                .withContentType("application/json");

        // requests
        builder.<SubAppCreateParam>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SubAppCreateParam.class),
            f -> f.withMarshaller(CreateSubAppRequest::getBody, CreateSubAppRequest::setBody));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateSubAppResponse::getBody, CreateSubAppResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<DeleteAppRequest, DeleteAppResponse> deleteApp = genForDeleteApp();

    private static HttpRequestDef<DeleteAppRequest, DeleteAppResponse> genForDeleteApp() {
        // basic
        HttpRequestDef.Builder<DeleteAppRequest, DeleteAppResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteAppRequest.class, DeleteAppResponse.class)
                .withName("DeleteApp")
                .withUri("/v1/applications/{application_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("application_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAppRequest::getApplicationId, DeleteAppRequest::setApplicationId));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteAppResponse::getBody, DeleteAppResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<DeleteComponentRequest, DeleteComponentResponse> deleteComponent =
        genForDeleteComponent();

    private static HttpRequestDef<DeleteComponentRequest, DeleteComponentResponse> genForDeleteComponent() {
        // basic
        HttpRequestDef.Builder<DeleteComponentRequest, DeleteComponentResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteComponentRequest.class, DeleteComponentResponse.class)
                .withName("DeleteComponent")
                .withUri("/v1/components/{component_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("component_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteComponentRequest::getComponentId, DeleteComponentRequest::setComponentId));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteComponentResponse::getBody, DeleteComponentResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<DeleteEnvRequest, DeleteEnvResponse> deleteEnv = genForDeleteEnv();

    private static HttpRequestDef<DeleteEnvRequest, DeleteEnvResponse> genForDeleteEnv() {
        // basic
        HttpRequestDef.Builder<DeleteEnvRequest, DeleteEnvResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteEnvRequest.class, DeleteEnvResponse.class)
                .withName("DeleteEnv")
                .withUri("/v1/environments/{environment_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("environment_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteEnvRequest::getEnvironmentId, DeleteEnvRequest::setEnvironmentId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteSubAppRequest, DeleteSubAppResponse> deleteSubApp = genForDeleteSubApp();

    private static HttpRequestDef<DeleteSubAppRequest, DeleteSubAppResponse> genForDeleteSubApp() {
        // basic
        HttpRequestDef.Builder<DeleteSubAppRequest, DeleteSubAppResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteSubAppRequest.class, DeleteSubAppResponse.class)
                .withName("DeleteSubApp")
                .withUri("/v1/sub-applications/{sub_app_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("sub_app_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteSubAppRequest::getSubAppId, DeleteSubAppRequest::setSubAppId));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteSubAppResponse::getBody, DeleteSubAppResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<ListResourceUnderNodeRequest, ListResourceUnderNodeResponse> listResourceUnderNode =
        genForListResourceUnderNode();

    private static HttpRequestDef<ListResourceUnderNodeRequest, ListResourceUnderNodeResponse> genForListResourceUnderNode() {
        // basic
        HttpRequestDef.Builder<ListResourceUnderNodeRequest, ListResourceUnderNodeResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ListResourceUnderNodeRequest.class, ListResourceUnderNodeResponse.class)
            .withName("ListResourceUnderNode")
            .withUri("/v1/resource/{rf_resource_type}/type/{type}/ci-relationships")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("rf_resource_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResourceUnderNodeRequest::getRfResourceType,
                ListResourceUnderNodeRequest::setRfResourceType));
        builder.<String>withRequestField("type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResourceUnderNodeRequest::getType, ListResourceUnderNodeRequest::setType));
        builder.<PageResourceListParam>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PageResourceListParam.class),
            f -> f.withMarshaller(ListResourceUnderNodeRequest::getBody, ListResourceUnderNodeRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAppRequest, ShowAppResponse> showApp = genForShowApp();

    private static HttpRequestDef<ShowAppRequest, ShowAppResponse> genForShowApp() {
        // basic
        HttpRequestDef.Builder<ShowAppRequest, ShowAppResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowAppRequest.class, ShowAppResponse.class)
                .withName("ShowApp")
                .withUri("/v1/applications/{application_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("application_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAppRequest::getApplicationId, ShowAppRequest::setApplicationId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAppByNameRequest, ShowAppByNameResponse> showAppByName =
        genForShowAppByName();

    private static HttpRequestDef<ShowAppByNameRequest, ShowAppByNameResponse> genForShowAppByName() {
        // basic
        HttpRequestDef.Builder<ShowAppByNameRequest, ShowAppByNameResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowAppByNameRequest.class, ShowAppByNameResponse.class)
                .withName("ShowAppByName")
                .withUri("/v1/applications")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAppByNameRequest::getName, ShowAppByNameRequest::setName));
        builder.<String>withRequestField("display_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAppByNameRequest::getDisplayName, ShowAppByNameRequest::setDisplayName));

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
                .withUri("/v1/components/{component_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("component_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowComponentRequest::getComponentId, ShowComponentRequest::setComponentId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowComponentByNameRequest, ShowComponentByNameResponse> showComponentByName =
        genForShowComponentByName();

    private static HttpRequestDef<ShowComponentByNameRequest, ShowComponentByNameResponse> genForShowComponentByName() {
        // basic
        HttpRequestDef.Builder<ShowComponentByNameRequest, ShowComponentByNameResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowComponentByNameRequest.class, ShowComponentByNameResponse.class)
                .withName("ShowComponentByName")
                .withUri("/v1/components/application/{application_id}/name/{component_name}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("application_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowComponentByNameRequest::getApplicationId,
                ShowComponentByNameRequest::setApplicationId));
        builder.<String>withRequestField("component_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowComponentByNameRequest::getComponentName,
                ShowComponentByNameRequest::setComponentName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowEnvRequest, ShowEnvResponse> showEnv = genForShowEnv();

    private static HttpRequestDef<ShowEnvRequest, ShowEnvResponse> genForShowEnv() {
        // basic
        HttpRequestDef.Builder<ShowEnvRequest, ShowEnvResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowEnvRequest.class, ShowEnvResponse.class)
                .withName("ShowEnv")
                .withUri("/v1/environments/{environment_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("environment_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowEnvRequest::getEnvironmentId, ShowEnvRequest::setEnvironmentId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowEnvByNameRequest, ShowEnvByNameResponse> showEnvByName =
        genForShowEnvByName();

    private static HttpRequestDef<ShowEnvByNameRequest, ShowEnvByNameResponse> genForShowEnvByName() {
        // basic
        HttpRequestDef.Builder<ShowEnvByNameRequest, ShowEnvByNameResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowEnvByNameRequest.class, ShowEnvByNameResponse.class)
                .withName("ShowEnvByName")
                .withUri("/v1/environments/name/{environment_name}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("environment_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowEnvByNameRequest::getEnvironmentName, ShowEnvByNameRequest::setEnvironmentName));
        builder.<String>withRequestField("region",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowEnvByNameRequest::getRegion, ShowEnvByNameRequest::setRegion));
        builder.<String>withRequestField("component_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowEnvByNameRequest::getComponentId, ShowEnvByNameRequest::setComponentId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateAppRequest, UpdateAppResponse> updateApp = genForUpdateApp();

    private static HttpRequestDef<UpdateAppRequest, UpdateAppResponse> genForUpdateApp() {
        // basic
        HttpRequestDef.Builder<UpdateAppRequest, UpdateAppResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateAppRequest.class, UpdateAppResponse.class)
                .withName("UpdateApp")
                .withUri("/v1/applications/{application_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("application_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAppRequest::getApplicationId, UpdateAppRequest::setApplicationId));
        builder.<BizAppParam>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BizAppParam.class),
            f -> f.withMarshaller(UpdateAppRequest::getBody, UpdateAppRequest::setBody));

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
                .withUri("/v1/components/{component_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("component_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateComponentRequest::getComponentId, UpdateComponentRequest::setComponentId));
        builder.<ComponentUpdateParam>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ComponentUpdateParam.class),
            f -> f.withMarshaller(UpdateComponentRequest::getBody, UpdateComponentRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateEnvRequest, UpdateEnvResponse> updateEnv = genForUpdateEnv();

    private static HttpRequestDef<UpdateEnvRequest, UpdateEnvResponse> genForUpdateEnv() {
        // basic
        HttpRequestDef.Builder<UpdateEnvRequest, UpdateEnvResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateEnvRequest.class, UpdateEnvResponse.class)
                .withName("UpdateEnv")
                .withUri("/v1/environments/{environment_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("environment_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateEnvRequest::getEnvironmentId, UpdateEnvRequest::setEnvironmentId));
        builder.<EnvParam>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(EnvParam.class),
            f -> f.withMarshaller(UpdateEnvRequest::getBody, UpdateEnvRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateSubAppRequest, UpdateSubAppResponse> updateSubApp = genForUpdateSubApp();

    private static HttpRequestDef<UpdateSubAppRequest, UpdateSubAppResponse> genForUpdateSubApp() {
        // basic
        HttpRequestDef.Builder<UpdateSubAppRequest, UpdateSubAppResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateSubAppRequest.class, UpdateSubAppResponse.class)
                .withName("UpdateSubApp")
                .withUri("/v1/sub-applications/{sub_app_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("sub_app_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateSubAppRequest::getSubAppId, UpdateSubAppRequest::setSubAppId));
        builder.<SubAppUpdateParam>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SubAppUpdateParam.class),
            f -> f.withMarshaller(UpdateSubAppRequest::getBody, UpdateSubAppRequest::setBody));

        // response

        return builder.build();
    }

}
