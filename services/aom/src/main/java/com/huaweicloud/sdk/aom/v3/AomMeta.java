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
import com.huaweicloud.sdk.aom.v3.model.DeleteAppRequest;
import com.huaweicloud.sdk.aom.v3.model.DeleteAppResponse;
import com.huaweicloud.sdk.aom.v3.model.DeleteComponentRequest;
import com.huaweicloud.sdk.aom.v3.model.DeleteComponentResponse;
import com.huaweicloud.sdk.aom.v3.model.DeleteEnvRequest;
import com.huaweicloud.sdk.aom.v3.model.DeleteEnvResponse;
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
import com.huaweicloud.sdk.aom.v3.model.UpdateAppRequest;
import com.huaweicloud.sdk.aom.v3.model.UpdateAppResponse;
import com.huaweicloud.sdk.aom.v3.model.UpdateComponentRequest;
import com.huaweicloud.sdk.aom.v3.model.UpdateComponentResponse;
import com.huaweicloud.sdk.aom.v3.model.UpdateEnvRequest;
import com.huaweicloud.sdk.aom.v3.model.UpdateEnvResponse;
import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;

@SuppressWarnings("unchecked")
public class AomMeta {

    public static final HttpRequestDef<CreateAppRequest, CreateAppResponse> createApp = genForcreateApp();

    private static HttpRequestDef<CreateAppRequest, CreateAppResponse> genForcreateApp() {
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
            f -> f.withMarshaller(CreateAppRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateAppResponse::getBody, (response, data) -> {
                response.setBody(data);
            }));

        return builder.build();
    }

    public static final HttpRequestDef<CreateComponentRequest, CreateComponentResponse> createComponent =
        genForcreateComponent();

    private static HttpRequestDef<CreateComponentRequest, CreateComponentResponse> genForcreateComponent() {
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
            f -> f.withMarshaller(CreateComponentRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateEnvRequest, CreateEnvResponse> createEnv = genForcreateEnv();

    private static HttpRequestDef<CreateEnvRequest, CreateEnvResponse> genForcreateEnv() {
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
            f -> f.withMarshaller(CreateEnvRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteAppRequest, DeleteAppResponse> deleteApp = genFordeleteApp();

    private static HttpRequestDef<DeleteAppRequest, DeleteAppResponse> genFordeleteApp() {
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
            f -> f.withMarshaller(DeleteAppRequest::getApplicationId, (req, v) -> {
                req.setApplicationId(v);
            }));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteAppResponse::getBody, (response, data) -> {
                response.setBody(data);
            }));

        return builder.build();
    }

    public static final HttpRequestDef<DeleteComponentRequest, DeleteComponentResponse> deleteComponent =
        genFordeleteComponent();

    private static HttpRequestDef<DeleteComponentRequest, DeleteComponentResponse> genFordeleteComponent() {
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
            f -> f.withMarshaller(DeleteComponentRequest::getComponentId, (req, v) -> {
                req.setComponentId(v);
            }));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteComponentResponse::getBody, (response, data) -> {
                response.setBody(data);
            }));

        return builder.build();
    }

    public static final HttpRequestDef<DeleteEnvRequest, DeleteEnvResponse> deleteEnv = genFordeleteEnv();

    private static HttpRequestDef<DeleteEnvRequest, DeleteEnvResponse> genFordeleteEnv() {
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
            f -> f.withMarshaller(DeleteEnvRequest::getEnvironmentId, (req, v) -> {
                req.setEnvironmentId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListResourceUnderNodeRequest, ListResourceUnderNodeResponse> listResourceUnderNode =
        genForlistResourceUnderNode();

    private static HttpRequestDef<ListResourceUnderNodeRequest, ListResourceUnderNodeResponse> genForlistResourceUnderNode() {
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
            f -> f.withMarshaller(ListResourceUnderNodeRequest::getRfResourceType, (req, v) -> {
                req.setRfResourceType(v);
            }));
        builder.<String>withRequestField("type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResourceUnderNodeRequest::getType, (req, v) -> {
                req.setType(v);
            }));
        builder.<PageResourceListParam>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PageResourceListParam.class),
            f -> f.withMarshaller(ListResourceUnderNodeRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAppRequest, ShowAppResponse> showApp = genForshowApp();

    private static HttpRequestDef<ShowAppRequest, ShowAppResponse> genForshowApp() {
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
            f -> f.withMarshaller(ShowAppRequest::getApplicationId, (req, v) -> {
                req.setApplicationId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAppByNameRequest, ShowAppByNameResponse> showAppByName =
        genForshowAppByName();

    private static HttpRequestDef<ShowAppByNameRequest, ShowAppByNameResponse> genForshowAppByName() {
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
            f -> f.withMarshaller(ShowAppByNameRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<String>withRequestField("display_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAppByNameRequest::getDisplayName, (req, v) -> {
                req.setDisplayName(v);
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
                .withUri("/v1/components/{component_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("component_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowComponentRequest::getComponentId, (req, v) -> {
                req.setComponentId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowComponentByNameRequest, ShowComponentByNameResponse> showComponentByName =
        genForshowComponentByName();

    private static HttpRequestDef<ShowComponentByNameRequest, ShowComponentByNameResponse> genForshowComponentByName() {
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
            f -> f.withMarshaller(ShowComponentByNameRequest::getApplicationId, (req, v) -> {
                req.setApplicationId(v);
            }));
        builder.<String>withRequestField("component_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowComponentByNameRequest::getComponentName, (req, v) -> {
                req.setComponentName(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowEnvRequest, ShowEnvResponse> showEnv = genForshowEnv();

    private static HttpRequestDef<ShowEnvRequest, ShowEnvResponse> genForshowEnv() {
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
            f -> f.withMarshaller(ShowEnvRequest::getEnvironmentId, (req, v) -> {
                req.setEnvironmentId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowEnvByNameRequest, ShowEnvByNameResponse> showEnvByName =
        genForshowEnvByName();

    private static HttpRequestDef<ShowEnvByNameRequest, ShowEnvByNameResponse> genForshowEnvByName() {
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
            f -> f.withMarshaller(ShowEnvByNameRequest::getEnvironmentName, (req, v) -> {
                req.setEnvironmentName(v);
            }));
        builder.<String>withRequestField("region",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowEnvByNameRequest::getRegion, (req, v) -> {
                req.setRegion(v);
            }));
        builder.<String>withRequestField("component_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowEnvByNameRequest::getComponentId, (req, v) -> {
                req.setComponentId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateAppRequest, UpdateAppResponse> updateApp = genForupdateApp();

    private static HttpRequestDef<UpdateAppRequest, UpdateAppResponse> genForupdateApp() {
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
            f -> f.withMarshaller(UpdateAppRequest::getApplicationId, (req, v) -> {
                req.setApplicationId(v);
            }));
        builder.<BizAppParam>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BizAppParam.class),
            f -> f.withMarshaller(UpdateAppRequest::getBody, (req, v) -> {
                req.setBody(v);
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
                .withUri("/v1/components/{component_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("component_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateComponentRequest::getComponentId, (req, v) -> {
                req.setComponentId(v);
            }));
        builder.<ComponentUpdateParam>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ComponentUpdateParam.class),
            f -> f.withMarshaller(UpdateComponentRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateEnvRequest, UpdateEnvResponse> updateEnv = genForupdateEnv();

    private static HttpRequestDef<UpdateEnvRequest, UpdateEnvResponse> genForupdateEnv() {
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
            f -> f.withMarshaller(UpdateEnvRequest::getEnvironmentId, (req, v) -> {
                req.setEnvironmentId(v);
            }));
        builder.<EnvParam>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(EnvParam.class),
            f -> f.withMarshaller(UpdateEnvRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

}
