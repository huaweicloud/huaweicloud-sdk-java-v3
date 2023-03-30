package com.huaweicloud.sdk.eihealth.v1;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.eihealth.v1.model.*;

import java.util.List;
import java.util.Map;

@SuppressWarnings("unchecked")
public class EiHealthMeta {

    public static final HttpRequestDef<ShowAdmetPropertiesRequest, ShowAdmetPropertiesResponse> showAdmetProperties =
        genForshowAdmetProperties();

    private static HttpRequestDef<ShowAdmetPropertiesRequest, ShowAdmetPropertiesResponse> genForshowAdmetProperties() {
        // basic
        HttpRequestDef.Builder<ShowAdmetPropertiesRequest, ShowAdmetPropertiesResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ShowAdmetPropertiesRequest.class, ShowAdmetPropertiesResponse.class)
                .withName("ShowAdmetProperties")
                .withUri("/v1/{project_id}/admet")
                .withContentType("application/json");

        // requests
        builder.<AdmetRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AdmetRequest.class),
            f -> f.withMarshaller(ShowAdmetPropertiesRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response
        builder.<Map<String, Object>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Map.class),
            f -> f.withMarshaller(ShowAdmetPropertiesResponse::getBody, (response, data) -> {
                response.setBody(data);
            }).withInnerContainerType(Object.class));

        return builder.build();
    }

    public static final HttpRequestDef<CreateCpiTaskRequest, CreateCpiTaskResponse> createCpiTask =
        genForcreateCpiTask();

    private static HttpRequestDef<CreateCpiTaskRequest, CreateCpiTaskResponse> genForcreateCpiTask() {
        // basic
        HttpRequestDef.Builder<CreateCpiTaskRequest, CreateCpiTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateCpiTaskRequest.class, CreateCpiTaskResponse.class)
                .withName("CreateCpiTask")
                .withUri("/v1/{project_id}/task/cpi")
                .withContentType("application/json");

        // requests
        builder.<CpiTaskData>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CpiTaskData.class),
            f -> f.withMarshaller(CreateCpiTaskRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateCpiTaskResponse::getBody, (response, data) -> {
                response.setBody(data);
            }));

        return builder.build();
    }

    public static final HttpRequestDef<ShowCpiTaskResultRequest, ShowCpiTaskResultResponse> showCpiTaskResult =
        genForshowCpiTaskResult();

    private static HttpRequestDef<ShowCpiTaskResultRequest, ShowCpiTaskResultResponse> genForshowCpiTaskResult() {
        // basic
        HttpRequestDef.Builder<ShowCpiTaskResultRequest, ShowCpiTaskResultResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowCpiTaskResultRequest.class, ShowCpiTaskResultResponse.class)
                .withName("ShowCpiTaskResult")
                .withUri("/v1/{project_id}/task/cpi/{task_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCpiTaskResultRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateGenerationTaskRequest, CreateGenerationTaskResponse> createGenerationTask =
        genForcreateGenerationTask();

    private static HttpRequestDef<CreateGenerationTaskRequest, CreateGenerationTaskResponse> genForcreateGenerationTask() {
        // basic
        HttpRequestDef.Builder<CreateGenerationTaskRequest, CreateGenerationTaskResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateGenerationTaskRequest.class, CreateGenerationTaskResponse.class)
            .withName("CreateGenerationTask")
            .withUri("/v1/{project_id}/task/generation")
            .withContentType("application/json");

        // requests
        builder.<GenerationTaskData>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(GenerationTaskData.class),
            f -> f.withMarshaller(CreateGenerationTaskRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateGenerationTaskResponse::getBody, (response, data) -> {
                response.setBody(data);
            }));

        return builder.build();
    }

    public static final HttpRequestDef<ShowGenerationTaskResultRequest, ShowGenerationTaskResultResponse> showGenerationTaskResult =
        genForshowGenerationTaskResult();

    private static HttpRequestDef<ShowGenerationTaskResultRequest, ShowGenerationTaskResultResponse> genForshowGenerationTaskResult() {
        // basic
        HttpRequestDef.Builder<ShowGenerationTaskResultRequest, ShowGenerationTaskResultResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ShowGenerationTaskResultRequest.class, ShowGenerationTaskResultResponse.class)
                .withName("ShowGenerationTaskResult")
                .withUri("/v1/{project_id}/task/generation/{task_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGenerationTaskResultRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchImportAppRequest, BatchImportAppResponse> batchImportApp =
        genForbatchImportApp();

    private static HttpRequestDef<BatchImportAppRequest, BatchImportAppResponse> genForbatchImportApp() {
        // basic
        HttpRequestDef.Builder<BatchImportAppRequest, BatchImportAppResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchImportAppRequest.class, BatchImportAppResponse.class)
                .withName("BatchImportApp")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/apps/batch-import")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchImportAppRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<BatchImportAppReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchImportAppReq.class),
            f -> f.withMarshaller(BatchImportAppRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response
        builder.<List<ImportAppRsp>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(BatchImportAppResponse::getBody, (response, data) -> {
                response.setBody(data);
            }).withInnerContainerType(ImportAppRsp.class));

        return builder.build();
    }

    public static final HttpRequestDef<CreateAppRequest, CreateAppResponse> createApp = genForcreateApp();

    private static HttpRequestDef<CreateAppRequest, CreateAppResponse> genForcreateApp() {
        // basic
        HttpRequestDef.Builder<CreateAppRequest, CreateAppResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateAppRequest.class, CreateAppResponse.class)
                .withName("CreateApp")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/apps")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateAppRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<AppDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AppDto.class),
            f -> f.withMarshaller(CreateAppRequest::getBody, (req, v) -> {
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
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/apps/{app_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("app_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAppRequest::getAppId, (req, v) -> {
                req.setAppId(v);
            }));
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAppRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAppRequest, ListAppResponse> listApp = genForlistApp();

    private static HttpRequestDef<ListAppRequest, ListAppResponse> genForlistApp() {
        // basic
        HttpRequestDef.Builder<ListAppRequest, ListAppResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAppRequest.class, ListAppResponse.class)
                .withName("ListApp")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/apps")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<String>withRequestField("version",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppRequest::getVersion, (req, v) -> {
                req.setVersion(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<PublishAppRequest, PublishAppResponse> publishApp = genForpublishApp();

    private static HttpRequestDef<PublishAppRequest, PublishAppResponse> genForpublishApp() {
        // basic
        HttpRequestDef.Builder<PublishAppRequest, PublishAppResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, PublishAppRequest.class, PublishAppResponse.class)
                .withName("PublishApp")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/apps/{app_id}/publish")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(PublishAppRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<String>withRequestField("app_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(PublishAppRequest::getAppId, (req, v) -> {
                req.setAppId(v);
            }));
        builder.<PublishAppReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PublishAppReq.class),
            f -> f.withMarshaller(PublishAppRequest::getBody, (req, v) -> {
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
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/apps/{app_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("app_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAppRequest::getAppId, (req, v) -> {
                req.setAppId(v);
            }));
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAppRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SubscribeAppRequest, SubscribeAppResponse> subscribeApp = genForsubscribeApp();

    private static HttpRequestDef<SubscribeAppRequest, SubscribeAppResponse> genForsubscribeApp() {
        // basic
        HttpRequestDef.Builder<SubscribeAppRequest, SubscribeAppResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, SubscribeAppRequest.class, SubscribeAppResponse.class)
                .withName("SubscribeApp")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/apps/subscribe")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SubscribeAppRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<SubscribeAppReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SubscribeAppReq.class),
            f -> f.withMarshaller(SubscribeAppRequest::getBody, (req, v) -> {
                req.setBody(v);
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
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/apps/{app_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("app_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAppRequest::getAppId, (req, v) -> {
                req.setAppId(v);
            }));
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAppRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<AppDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AppDto.class),
            f -> f.withMarshaller(UpdateAppRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteAssetVersionRequest, DeleteAssetVersionResponse> deleteAssetVersion =
        genFordeleteAssetVersion();

    private static HttpRequestDef<DeleteAssetVersionRequest, DeleteAssetVersionResponse> genFordeleteAssetVersion() {
        // basic
        HttpRequestDef.Builder<DeleteAssetVersionRequest, DeleteAssetVersionResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteAssetVersionRequest.class, DeleteAssetVersionResponse.class)
                .withName("DeleteAssetVersion")
                .withUri("/v1/{project_id}/assets/{asset_id}/versions/{version}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("asset_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAssetVersionRequest::getAssetId, (req, v) -> {
                req.setAssetId(v);
            }));
        builder.<String>withRequestField("version",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAssetVersionRequest::getVersion, (req, v) -> {
                req.setVersion(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExecuteAssetActionRequest, ExecuteAssetActionResponse> executeAssetAction =
        genForexecuteAssetAction();

    private static HttpRequestDef<ExecuteAssetActionRequest, ExecuteAssetActionResponse> genForexecuteAssetAction() {
        // basic
        HttpRequestDef.Builder<ExecuteAssetActionRequest, ExecuteAssetActionResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ExecuteAssetActionRequest.class, ExecuteAssetActionResponse.class)
                .withName("ExecuteAssetAction")
                .withUri("/v1/{project_id}/assets/{asset_id}/versions/{version}/action")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("asset_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExecuteAssetActionRequest::getAssetId, (req, v) -> {
                req.setAssetId(v);
            }));
        builder.<String>withRequestField("version",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExecuteAssetActionRequest::getVersion, (req, v) -> {
                req.setVersion(v);
            }));
        builder.<ManageAssetReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ManageAssetReq.class),
            f -> f.withMarshaller(ExecuteAssetActionRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAssetRequest, ListAssetResponse> listAsset = genForlistAsset();

    private static HttpRequestDef<ListAssetRequest, ListAssetResponse> genForlistAsset() {
        // basic
        HttpRequestDef.Builder<ListAssetRequest, ListAssetResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAssetRequest.class, ListAssetResponse.class)
                .withName("ListAsset")
                .withUri("/v1/{project_id}/assets")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("categories",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAssetRequest::getCategories, (req, v) -> {
                req.setCategories(v);
            }));
        builder.<String>withRequestField("key_word",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAssetRequest::getKeyWord, (req, v) -> {
                req.setKeyWord(v);
            }));
        builder.<String>withRequestField("labels",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAssetRequest::getLabels, (req, v) -> {
                req.setLabels(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAssetRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAssetRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("publishers",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAssetRequest::getPublishers, (req, v) -> {
                req.setPublishers(v);
            }));
        builder.<String>withRequestField("scope",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAssetRequest::getScope, (req, v) -> {
                req.setScope(v);
            }));
        builder.<String>withRequestField("vendor_ids",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAssetRequest::getVendorIds, (req, v) -> {
                req.setVendorIds(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPropertyRequest, ListPropertyResponse> listProperty = genForlistProperty();

    private static HttpRequestDef<ListPropertyRequest, ListPropertyResponse> genForlistProperty() {
        // basic
        HttpRequestDef.Builder<ListPropertyRequest, ListPropertyResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListPropertyRequest.class, ListPropertyResponse.class)
                .withName("ListProperty")
                .withUri("/v1/{project_id}/assets/properties")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("property",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPropertyRequest::getProperty, (req, v) -> {
                req.setProperty(v);
            }));

        // response
        builder.<List<String>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPropertyResponse::getBody, (response, data) -> {
                response.setBody(data);
            }).withInnerContainerType(String.class));

        return builder.build();
    }

    public static final HttpRequestDef<ShowAssetRequest, ShowAssetResponse> showAsset = genForshowAsset();

    private static HttpRequestDef<ShowAssetRequest, ShowAssetResponse> genForshowAsset() {
        // basic
        HttpRequestDef.Builder<ShowAssetRequest, ShowAssetResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowAssetRequest.class, ShowAssetResponse.class)
                .withName("ShowAsset")
                .withUri("/v1/{project_id}/assets/{asset_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("asset_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAssetRequest::getAssetId, (req, v) -> {
                req.setAssetId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAssetVersionRequest, ShowAssetVersionResponse> showAssetVersion =
        genForshowAssetVersion();

    private static HttpRequestDef<ShowAssetVersionRequest, ShowAssetVersionResponse> genForshowAssetVersion() {
        // basic
        HttpRequestDef.Builder<ShowAssetVersionRequest, ShowAssetVersionResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowAssetVersionRequest.class, ShowAssetVersionResponse.class)
                .withName("ShowAssetVersion")
                .withUri("/v1/{project_id}/assets/{asset_id}/versions/{version}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("asset_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAssetVersionRequest::getAssetId, (req, v) -> {
                req.setAssetId(v);
            }));
        builder.<String>withRequestField("version",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAssetVersionRequest::getVersion, (req, v) -> {
                req.setVersion(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateAssetVersionRequest, UpdateAssetVersionResponse> updateAssetVersion =
        genForupdateAssetVersion();

    private static HttpRequestDef<UpdateAssetVersionRequest, UpdateAssetVersionResponse> genForupdateAssetVersion() {
        // basic
        HttpRequestDef.Builder<UpdateAssetVersionRequest, UpdateAssetVersionResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateAssetVersionRequest.class, UpdateAssetVersionResponse.class)
                .withName("UpdateAssetVersion")
                .withUri("/v1/{project_id}/assets/{asset_id}/versions/{version}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("asset_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAssetVersionRequest::getAssetId, (req, v) -> {
                req.setAssetId(v);
            }));
        builder.<String>withRequestField("version",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAssetVersionRequest::getVersion, (req, v) -> {
                req.setVersion(v);
            }));
        builder.<UpdateAssetReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateAssetReq.class),
            f -> f.withMarshaller(UpdateAssetVersionRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateAutoJobRequest, CreateAutoJobResponse> createAutoJob =
        genForcreateAutoJob();

    private static HttpRequestDef<CreateAutoJobRequest, CreateAutoJobResponse> genForcreateAutoJob() {
        // basic
        HttpRequestDef.Builder<CreateAutoJobRequest, CreateAutoJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateAutoJobRequest.class, CreateAutoJobResponse.class)
                .withName("CreateAutoJob")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/auto-jobs")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateAutoJobRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<CreateAutJobReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateAutJobReq.class),
            f -> f.withMarshaller(CreateAutoJobRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteAutoJobRequest, DeleteAutoJobResponse> deleteAutoJob =
        genFordeleteAutoJob();

    private static HttpRequestDef<DeleteAutoJobRequest, DeleteAutoJobResponse> genFordeleteAutoJob() {
        // basic
        HttpRequestDef.Builder<DeleteAutoJobRequest, DeleteAutoJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteAutoJobRequest.class, DeleteAutoJobResponse.class)
                .withName("DeleteAutoJob")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/auto-jobs/{auto_job_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAutoJobRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<String>withRequestField("auto_job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAutoJobRequest::getAutoJobId, (req, v) -> {
                req.setAutoJobId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAutoJobRequest, ListAutoJobResponse> listAutoJob = genForlistAutoJob();

    private static HttpRequestDef<ListAutoJobRequest, ListAutoJobResponse> genForlistAutoJob() {
        // basic
        HttpRequestDef.Builder<ListAutoJobRequest, ListAutoJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAutoJobRequest.class, ListAutoJobResponse.class)
                .withName("ListAutoJob")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/auto-jobs")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAutoJobRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAutoJobRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAutoJobRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAutoJobRequest::getSortKey, (req, v) -> {
                req.setSortKey(v);
            }));
        builder.<String>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAutoJobRequest::getSortDir, (req, v) -> {
                req.setSortDir(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAutoJobRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAutoJobRequest, ShowAutoJobResponse> showAutoJob = genForshowAutoJob();

    private static HttpRequestDef<ShowAutoJobRequest, ShowAutoJobResponse> genForshowAutoJob() {
        // basic
        HttpRequestDef.Builder<ShowAutoJobRequest, ShowAutoJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowAutoJobRequest.class, ShowAutoJobResponse.class)
                .withName("ShowAutoJob")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/auto-jobs/{auto_job_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAutoJobRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<String>withRequestField("auto_job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAutoJobRequest::getAutoJobId, (req, v) -> {
                req.setAutoJobId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StartAutoJobRequest, StartAutoJobResponse> startAutoJob = genForstartAutoJob();

    private static HttpRequestDef<StartAutoJobRequest, StartAutoJobResponse> genForstartAutoJob() {
        // basic
        HttpRequestDef.Builder<StartAutoJobRequest, StartAutoJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, StartAutoJobRequest.class, StartAutoJobResponse.class)
                .withName("StartAutoJob")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/auto-jobs/{auto_job_id}/start")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StartAutoJobRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<String>withRequestField("auto_job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StartAutoJobRequest::getAutoJobId, (req, v) -> {
                req.setAutoJobId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StopAutoJobRequest, StopAutoJobResponse> stopAutoJob = genForstopAutoJob();

    private static HttpRequestDef<StopAutoJobRequest, StopAutoJobResponse> genForstopAutoJob() {
        // basic
        HttpRequestDef.Builder<StopAutoJobRequest, StopAutoJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, StopAutoJobRequest.class, StopAutoJobResponse.class)
                .withName("StopAutoJob")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/auto-jobs/{auto_job_id}/stop")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StopAutoJobRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<String>withRequestField("auto_job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StopAutoJobRequest::getAutoJobId, (req, v) -> {
                req.setAutoJobId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateAutoJobRequest, UpdateAutoJobResponse> updateAutoJob =
        genForupdateAutoJob();

    private static HttpRequestDef<UpdateAutoJobRequest, UpdateAutoJobResponse> genForupdateAutoJob() {
        // basic
        HttpRequestDef.Builder<UpdateAutoJobRequest, UpdateAutoJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateAutoJobRequest.class, UpdateAutoJobResponse.class)
                .withName("UpdateAutoJob")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/auto-jobs/{auto_job_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAutoJobRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<String>withRequestField("auto_job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAutoJobRequest::getAutoJobId, (req, v) -> {
                req.setAutoJobId(v);
            }));
        builder.<CreateAutJobReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateAutJobReq.class),
            f -> f.withMarshaller(UpdateAutoJobRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateComputingResourceRequest, CreateComputingResourceResponse> createComputingResource =
        genForcreateComputingResource();

    private static HttpRequestDef<CreateComputingResourceRequest, CreateComputingResourceResponse> genForcreateComputingResource() {
        // basic
        HttpRequestDef.Builder<CreateComputingResourceRequest, CreateComputingResourceResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateComputingResourceRequest.class, CreateComputingResourceResponse.class)
            .withName("CreateComputingResource")
            .withUri("/v1/{project_id}/system/computing-resources")
            .withContentType("application/json");

        // requests
        builder.<CreateComputingResourceReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CreateComputingResourceReq.class),
            f -> f.withMarshaller(CreateComputingResourceRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteComputingResourceRequest, DeleteComputingResourceResponse> deleteComputingResource =
        genFordeleteComputingResource();

    private static HttpRequestDef<DeleteComputingResourceRequest, DeleteComputingResourceResponse> genFordeleteComputingResource() {
        // basic
        HttpRequestDef.Builder<DeleteComputingResourceRequest, DeleteComputingResourceResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteComputingResourceRequest.class, DeleteComputingResourceResponse.class)
            .withName("DeleteComputingResource")
            .withUri("/v1/{project_id}/system/computing-resources/{id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteComputingResourceRequest::getId, (req, v) -> {
                req.setId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListComputingResourceFlavorsRequest, ListComputingResourceFlavorsResponse> listComputingResourceFlavors =
        genForlistComputingResourceFlavors();

    private static HttpRequestDef<ListComputingResourceFlavorsRequest, ListComputingResourceFlavorsResponse> genForlistComputingResourceFlavors() {
        // basic
        HttpRequestDef.Builder<ListComputingResourceFlavorsRequest, ListComputingResourceFlavorsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListComputingResourceFlavorsRequest.class,
                    ListComputingResourceFlavorsResponse.class)
                .withName("ListComputingResourceFlavors")
                .withUri("/v1/{project_id}/system/computing-resources/flavors")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("availability_zone_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListComputingResourceFlavorsRequest::getAvailabilityZoneId, (req, v) -> {
                req.setAvailabilityZoneId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListComputingResourcesRequest, ListComputingResourcesResponse> listComputingResources =
        genForlistComputingResources();

    private static HttpRequestDef<ListComputingResourcesRequest, ListComputingResourcesResponse> genForlistComputingResources() {
        // basic
        HttpRequestDef.Builder<ListComputingResourcesRequest, ListComputingResourcesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListComputingResourcesRequest.class, ListComputingResourcesResponse.class)
            .withName("ListComputingResources")
            .withUri("/v1/{project_id}/system/computing-resources")
            .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RebootNodeRequest, RebootNodeResponse> rebootNode = genForrebootNode();

    private static HttpRequestDef<RebootNodeRequest, RebootNodeResponse> genForrebootNode() {
        // basic
        HttpRequestDef.Builder<RebootNodeRequest, RebootNodeResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RebootNodeRequest.class, RebootNodeResponse.class)
                .withName("RebootNode")
                .withUri("/v1/{project_id}/system/computing-resources/{id}/reboot")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RebootNodeRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<Boolean>withRequestField("force",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(RebootNodeRequest::getForce, (req, v) -> {
                req.setForce(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowBmsDevicesRequest, ShowBmsDevicesResponse> showBmsDevices =
        genForshowBmsDevices();

    private static HttpRequestDef<ShowBmsDevicesRequest, ShowBmsDevicesResponse> genForshowBmsDevices() {
        // basic
        HttpRequestDef.Builder<ShowBmsDevicesRequest, ShowBmsDevicesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowBmsDevicesRequest.class, ShowBmsDevicesResponse.class)
                .withName("ShowBmsDevices")
                .withUri("/v1/{project_id}/system/computing-resources/{id}/devices")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowBmsDevicesRequest::getId, (req, v) -> {
                req.setId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowEvsQuotaRequest, ShowEvsQuotaResponse> showEvsQuota = genForshowEvsQuota();

    private static HttpRequestDef<ShowEvsQuotaRequest, ShowEvsQuotaResponse> genForshowEvsQuota() {
        // basic
        HttpRequestDef.Builder<ShowEvsQuotaRequest, ShowEvsQuotaResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowEvsQuotaRequest.class, ShowEvsQuotaResponse.class)
                .withName("ShowEvsQuota")
                .withUri("/v1/{project_id}/system/computing-resources/evs-quota")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowLeftQuotaRequest, ShowLeftQuotaResponse> showLeftQuota =
        genForshowLeftQuota();

    private static HttpRequestDef<ShowLeftQuotaRequest, ShowLeftQuotaResponse> genForshowLeftQuota() {
        // basic
        HttpRequestDef.Builder<ShowLeftQuotaRequest, ShowLeftQuotaResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowLeftQuotaRequest.class, ShowLeftQuotaResponse.class)
                .withName("ShowLeftQuota")
                .withUri("/v1/{project_id}/system/computing-resources/quota")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowScheduleRequest, ShowScheduleResponse> showSchedule = genForshowSchedule();

    private static HttpRequestDef<ShowScheduleRequest, ShowScheduleResponse> genForshowSchedule() {
        // basic
        HttpRequestDef.Builder<ShowScheduleRequest, ShowScheduleResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowScheduleRequest.class, ShowScheduleResponse.class)
                .withName("ShowSchedule")
                .withUri("/v1/{project_id}/system/computing-resources/{id}/schedule")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowScheduleRequest::getId, (req, v) -> {
                req.setId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StartNodeRequest, StartNodeResponse> startNode = genForstartNode();

    private static HttpRequestDef<StartNodeRequest, StartNodeResponse> genForstartNode() {
        // basic
        HttpRequestDef.Builder<StartNodeRequest, StartNodeResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, StartNodeRequest.class, StartNodeResponse.class)
                .withName("StartNode")
                .withUri("/v1/{project_id}/system/computing-resources/{id}/start")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StartNodeRequest::getId, (req, v) -> {
                req.setId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StopNodeRequest, StopNodeResponse> stopNode = genForstopNode();

    private static HttpRequestDef<StopNodeRequest, StopNodeResponse> genForstopNode() {
        // basic
        HttpRequestDef.Builder<StopNodeRequest, StopNodeResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, StopNodeRequest.class, StopNodeResponse.class)
                .withName("StopNode")
                .withUri("/v1/{project_id}/system/computing-resources/{id}/stop")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StopNodeRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<Boolean>withRequestField("force",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(StopNodeRequest::getForce, (req, v) -> {
                req.setForce(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateScheduleRequest, UpdateScheduleResponse> updateSchedule =
        genForupdateSchedule();

    private static HttpRequestDef<UpdateScheduleRequest, UpdateScheduleResponse> genForupdateSchedule() {
        // basic
        HttpRequestDef.Builder<UpdateScheduleRequest, UpdateScheduleResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateScheduleRequest.class, UpdateScheduleResponse.class)
                .withName("UpdateSchedule")
                .withUri("/v1/{project_id}/system/computing-resources/{id}/schedule")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateScheduleRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<UpdateScheduleReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateScheduleReq.class),
            f -> f.withMarshaller(UpdateScheduleRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateBackupRequest, CreateBackupResponse> createBackup = genForcreateBackup();

    private static HttpRequestDef<CreateBackupRequest, CreateBackupResponse> genForcreateBackup() {
        // basic
        HttpRequestDef.Builder<CreateBackupRequest, CreateBackupResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateBackupRequest.class, CreateBackupResponse.class)
                .withName("CreateBackup")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/backups")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateBackupRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<CreateBackupReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateBackupReq.class),
            f -> f.withMarshaller(CreateBackupRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteBackupRequest, DeleteBackupResponse> deleteBackup = genFordeleteBackup();

    private static HttpRequestDef<DeleteBackupRequest, DeleteBackupResponse> genFordeleteBackup() {
        // basic
        HttpRequestDef.Builder<DeleteBackupRequest, DeleteBackupResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteBackupRequest.class, DeleteBackupResponse.class)
                .withName("DeleteBackup")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/backups/{backup_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("backup_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteBackupRequest::getBackupId, (req, v) -> {
                req.setBackupId(v);
            }));
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteBackupRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListBackupRequest, ListBackupResponse> listBackup = genForlistBackup();

    private static HttpRequestDef<ListBackupRequest, ListBackupResponse> genForlistBackup() {
        // basic
        HttpRequestDef.Builder<ListBackupRequest, ListBackupResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListBackupRequest.class, ListBackupResponse.class)
                .withName("ListBackup")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/backups")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBackupRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListBackupRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListBackupRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBackupRequest::getSortDir, (req, v) -> {
                req.setSortDir(v);
            }));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBackupRequest::getSortKey, (req, v) -> {
                req.setSortKey(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RestoreBackupRequest, RestoreBackupResponse> restoreBackup =
        genForrestoreBackup();

    private static HttpRequestDef<RestoreBackupRequest, RestoreBackupResponse> genForrestoreBackup() {
        // basic
        HttpRequestDef.Builder<RestoreBackupRequest, RestoreBackupResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RestoreBackupRequest.class, RestoreBackupResponse.class)
                .withName("RestoreBackup")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/backups/{backup_id}/restore")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("backup_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RestoreBackupRequest::getBackupId, (req, v) -> {
                req.setBackupId(v);
            }));
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RestoreBackupRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<RestoreBackupReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RestoreBackupReq.class),
            f -> f.withMarshaller(RestoreBackupRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowBackupPathRequest, ShowBackupPathResponse> showBackupPath =
        genForshowBackupPath();

    private static HttpRequestDef<ShowBackupPathRequest, ShowBackupPathResponse> genForshowBackupPath() {
        // basic
        HttpRequestDef.Builder<ShowBackupPathRequest, ShowBackupPathResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowBackupPathRequest.class, ShowBackupPathResponse.class)
                .withName("ShowBackupPath")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/backups/{backup_id}/paths")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("backup_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowBackupPathRequest::getBackupId, (req, v) -> {
                req.setBackupId(v);
            }));
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowBackupPathRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteDataRequest, BatchDeleteDataResponse> batchDeleteData =
        genForbatchDeleteData();

    private static HttpRequestDef<BatchDeleteDataRequest, BatchDeleteDataResponse> genForbatchDeleteData() {
        // basic
        HttpRequestDef.Builder<BatchDeleteDataRequest, BatchDeleteDataResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchDeleteDataRequest.class, BatchDeleteDataResponse.class)
                .withName("BatchDeleteData")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/datas/batch-delete")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeleteDataRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<BatchDeleteDataReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchDeleteDataReq.class),
            f -> f.withMarshaller(BatchDeleteDataRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CopyDataRequest, CopyDataResponse> copyData = genForcopyData();

    private static HttpRequestDef<CopyDataRequest, CopyDataResponse> genForcopyData() {
        // basic
        HttpRequestDef.Builder<CopyDataRequest, CopyDataResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CopyDataRequest.class, CopyDataResponse.class)
                .withName("CopyData")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/datas/clone")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CopyDataRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<CloneDataReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CloneDataReq.class),
            f -> f.withMarshaller(CopyDataRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateDataRequest, CreateDataResponse> createData = genForcreateData();

    private static HttpRequestDef<CreateDataRequest, CreateDataResponse> genForcreateData() {
        // basic
        HttpRequestDef.Builder<CreateDataRequest, CreateDataResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateDataRequest.class, CreateDataResponse.class)
                .withName("CreateData")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/datas")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateDataRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<CreateDataReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateDataReq.class),
            f -> f.withMarshaller(CreateDataRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ImportDataRequest, ImportDataResponse> importData = genForimportData();

    private static HttpRequestDef<ImportDataRequest, ImportDataResponse> genForimportData() {
        // basic
        HttpRequestDef.Builder<ImportDataRequest, ImportDataResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ImportDataRequest.class, ImportDataResponse.class)
                .withName("ImportData")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/datas/import")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ImportDataRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<ImportDataReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ImportDataReq.class),
            f -> f.withMarshaller(ImportDataRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ImportNetworkDataRequest, ImportNetworkDataResponse> importNetworkData =
        genForimportNetworkData();

    private static HttpRequestDef<ImportNetworkDataRequest, ImportNetworkDataResponse> genForimportNetworkData() {
        // basic
        HttpRequestDef.Builder<ImportNetworkDataRequest, ImportNetworkDataResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ImportNetworkDataRequest.class, ImportNetworkDataResponse.class)
                .withName("ImportNetworkData")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/datas/import-from-network")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ImportNetworkDataRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<ImportNetworkDataReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ImportNetworkDataReq.class),
            f -> f.withMarshaller(ImportNetworkDataRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListBucketRequest, ListBucketResponse> listBucket = genForlistBucket();

    private static HttpRequestDef<ListBucketRequest, ListBucketResponse> genForlistBucket() {
        // basic
        HttpRequestDef.Builder<ListBucketRequest, ListBucketResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListBucketRequest.class, ListBucketResponse.class)
                .withName("ListBucket")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/buckets")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBucketRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDataRequest, ListDataResponse> listData = genForlistData();

    private static HttpRequestDef<ListDataRequest, ListDataResponse> genForlistData() {
        // basic
        HttpRequestDef.Builder<ListDataRequest, ListDataResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListDataRequest.class, ListDataResponse.class)
                .withName("ListData")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/datas")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDataRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDataRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDataRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("path",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDataRequest::getPath, (req, v) -> {
                req.setPath(v);
            }));
        builder.<String>withRequestField("search_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDataRequest::getSearchKey, (req, v) -> {
                req.setSearchKey(v);
            }));
        builder.<String>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDataRequest::getSortDir, (req, v) -> {
                req.setSortDir(v);
            }));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDataRequest::getSortKey, (req, v) -> {
                req.setSortKey(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDataRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<PublishDataRequest, PublishDataResponse> publishData = genForpublishData();

    private static HttpRequestDef<PublishDataRequest, PublishDataResponse> genForpublishData() {
        // basic
        HttpRequestDef.Builder<PublishDataRequest, PublishDataResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, PublishDataRequest.class, PublishDataResponse.class)
                .withName("PublishData")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/datas/publish")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(PublishDataRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<PublishDataReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PublishDataReq.class),
            f -> f.withMarshaller(PublishDataRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<QuoteDataRequest, QuoteDataResponse> quoteData = genForquoteData();

    private static HttpRequestDef<QuoteDataRequest, QuoteDataResponse> genForquoteData() {
        // basic
        HttpRequestDef.Builder<QuoteDataRequest, QuoteDataResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, QuoteDataRequest.class, QuoteDataResponse.class)
                .withName("QuoteData")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/datas/quote")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(QuoteDataRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<QuoteDataReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(QuoteDataReq.class),
            f -> f.withMarshaller(QuoteDataRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowBucketStorageRequest, ShowBucketStorageResponse> showBucketStorage =
        genForshowBucketStorage();

    private static HttpRequestDef<ShowBucketStorageRequest, ShowBucketStorageResponse> genForshowBucketStorage() {
        // basic
        HttpRequestDef.Builder<ShowBucketStorageRequest, ShowBucketStorageResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowBucketStorageRequest.class, ShowBucketStorageResponse.class)
                .withName("ShowBucketStorage")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/datas/bucket-storage")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowBucketStorageRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDataRequest, ShowDataResponse> showData = genForshowData();

    private static HttpRequestDef<ShowDataRequest, ShowDataResponse> genForshowData() {
        // basic
        HttpRequestDef.Builder<ShowDataRequest, ShowDataResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowDataRequest.class, ShowDataResponse.class)
                .withName("ShowData")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/datas/{path}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDataRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<String>withRequestField("path",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDataRequest::getPath, (req, v) -> {
                req.setPath(v);
            }));
        builder.<Boolean>withRequestField("X-Need-Content",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ShowDataRequest::getXNeedContent, (req, v) -> {
                req.setXNeedContent(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDataPolicyRequest, ShowDataPolicyResponse> showDataPolicy =
        genForshowDataPolicy();

    private static HttpRequestDef<ShowDataPolicyRequest, ShowDataPolicyResponse> genForshowDataPolicy() {
        // basic
        HttpRequestDef.Builder<ShowDataPolicyRequest, ShowDataPolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowDataPolicyRequest.class, ShowDataPolicyResponse.class)
                .withName("ShowDataPolicy")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/datas/policy")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDataPolicyRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SubscribeDataRequest, SubscribeDataResponse> subscribeData =
        genForsubscribeData();

    private static HttpRequestDef<SubscribeDataRequest, SubscribeDataResponse> genForsubscribeData() {
        // basic
        HttpRequestDef.Builder<SubscribeDataRequest, SubscribeDataResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, SubscribeDataRequest.class, SubscribeDataResponse.class)
                .withName("SubscribeData")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/datas/subscribe")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SubscribeDataRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<SubscribeDataReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SubscribeDataReq.class),
            f -> f.withMarshaller(SubscribeDataRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateDataPathPolicyRequest, UpdateDataPathPolicyResponse> updateDataPathPolicy =
        genForupdateDataPathPolicy();

    private static HttpRequestDef<UpdateDataPathPolicyRequest, UpdateDataPathPolicyResponse> genForupdateDataPathPolicy() {
        // basic
        HttpRequestDef.Builder<UpdateDataPathPolicyRequest, UpdateDataPathPolicyResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateDataPathPolicyRequest.class, UpdateDataPathPolicyResponse.class)
            .withName("UpdateDataPathPolicy")
            .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/datas/{path}/policy")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDataPathPolicyRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<String>withRequestField("path",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDataPathPolicyRequest::getPath, (req, v) -> {
                req.setPath(v);
            }));
        builder.<DataPolicyReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DataPolicyReq.class),
            f -> f.withMarshaller(UpdateDataPathPolicyRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateDataPolicyRequest, UpdateDataPolicyResponse> updateDataPolicy =
        genForupdateDataPolicy();

    private static HttpRequestDef<UpdateDataPolicyRequest, UpdateDataPolicyResponse> genForupdateDataPolicy() {
        // basic
        HttpRequestDef.Builder<UpdateDataPolicyRequest, UpdateDataPolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateDataPolicyRequest.class, UpdateDataPolicyResponse.class)
                .withName("UpdateDataPolicy")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/datas/policy")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDataPolicyRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<UpdateDataPolicyReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateDataPolicyReq.class),
            f -> f.withMarshaller(UpdateDataPolicyRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UploadDataRequest, UploadDataResponse> uploadData = genForuploadData();

    private static HttpRequestDef<UploadDataRequest, UploadDataResponse> genForuploadData() {
        // basic
        HttpRequestDef.Builder<UploadDataRequest, UploadDataResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UploadDataRequest.class, UploadDataResponse.class)
                .withName("UploadData")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/datas/upload")
                .withContentType("multipart/form-data");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UploadDataRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<String>withRequestField("target_folder",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UploadDataRequest::getTargetFolder, (req, v) -> {
                req.setTargetFolder(v);
            }));
        builder.<Integer>withRequestField("part_number",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(UploadDataRequest::getPartNumber, (req, v) -> {
                req.setPartNumber(v);
            }));
        builder.<Integer>withRequestField("total_part",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(UploadDataRequest::getTotalPart, (req, v) -> {
                req.setTotalPart(v);
            }));
        builder.<String>withRequestField("multipart_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UploadDataRequest::getMultipartId, (req, v) -> {
                req.setMultipartId(v);
            }));
        builder.<String>withRequestField("file_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UploadDataRequest::getFileName, (req, v) -> {
                req.setFileName(v);
            }));
        builder.<String>withRequestField("md5",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UploadDataRequest::getMd5, (req, v) -> {
                req.setMd5(v);
            }));
        builder.<UploadDataRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UploadDataRequestBody.class),
            f -> f.withMarshaller(UploadDataRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CancelDataJobRequest, CancelDataJobResponse> cancelDataJob =
        genForcancelDataJob();

    private static HttpRequestDef<CancelDataJobRequest, CancelDataJobResponse> genForcancelDataJob() {
        // basic
        HttpRequestDef.Builder<CancelDataJobRequest, CancelDataJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CancelDataJobRequest.class, CancelDataJobResponse.class)
                .withName("CancelDataJob")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/data-jobs/{data_job_id}/cancel")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("data_job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CancelDataJobRequest::getDataJobId, (req, v) -> {
                req.setDataJobId(v);
            }));
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CancelDataJobRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteDataJobRequest, DeleteDataJobResponse> deleteDataJob =
        genFordeleteDataJob();

    private static HttpRequestDef<DeleteDataJobRequest, DeleteDataJobResponse> genFordeleteDataJob() {
        // basic
        HttpRequestDef.Builder<DeleteDataJobRequest, DeleteDataJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteDataJobRequest.class, DeleteDataJobResponse.class)
                .withName("DeleteDataJob")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/data-jobs/{data_job_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("data_job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDataJobRequest::getDataJobId, (req, v) -> {
                req.setDataJobId(v);
            }));
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDataJobRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DownloadDataJobLogRequest, DownloadDataJobLogResponse> downloadDataJobLog =
        genFordownloadDataJobLog();

    private static HttpRequestDef<DownloadDataJobLogRequest, DownloadDataJobLogResponse> genFordownloadDataJobLog() {
        // basic
        HttpRequestDef.Builder<DownloadDataJobLogRequest, DownloadDataJobLogResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, DownloadDataJobLogRequest.class, DownloadDataJobLogResponse.class)
                .withName("DownloadDataJobLog")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/data-jobs/{data_job_id}/logs")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DownloadDataJobLogRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<String>withRequestField("data_job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DownloadDataJobLogRequest::getDataJobId, (req, v) -> {
                req.setDataJobId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCheckpointRequest, ListCheckpointResponse> listCheckpoint =
        genForlistCheckpoint();

    private static HttpRequestDef<ListCheckpointRequest, ListCheckpointResponse> genForlistCheckpoint() {
        // basic
        HttpRequestDef.Builder<ListCheckpointRequest, ListCheckpointResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListCheckpointRequest.class, ListCheckpointResponse.class)
                .withName("ListCheckpoint")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/data-jobs/{data_job_id}/checkpoints")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("data_job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCheckpointRequest::getDataJobId, (req, v) -> {
                req.setDataJobId(v);
            }));
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCheckpointRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDataJobRequest, ListDataJobResponse> listDataJob = genForlistDataJob();

    private static HttpRequestDef<ListDataJobRequest, ListDataJobResponse> genForlistDataJob() {
        // basic
        HttpRequestDef.Builder<ListDataJobRequest, ListDataJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListDataJobRequest.class, ListDataJobResponse.class)
                .withName("ListDataJob")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/data-jobs")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDataJobRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<String>withRequestField("creator",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDataJobRequest::getCreator, (req, v) -> {
                req.setCreator(v);
            }));
        builder.<Long>withRequestField("from_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListDataJobRequest::getFromTime, (req, v) -> {
                req.setFromTime(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDataJobRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDataJobRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDataJobRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDataJobRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            }));
        builder.<Long>withRequestField("to_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListDataJobRequest::getToTime, (req, v) -> {
                req.setToTime(v);
            }));
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDataJobRequest::getType, (req, v) -> {
                req.setType(v);
            }));
        builder.<Long>withRequestField("finish_from_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListDataJobRequest::getFinishFromTime, (req, v) -> {
                req.setFinishFromTime(v);
            }));
        builder.<Long>withRequestField("finish_to_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListDataJobRequest::getFinishToTime, (req, v) -> {
                req.setFinishToTime(v);
            }));
        builder.<String>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDataJobRequest::getSortDir, (req, v) -> {
                req.setSortDir(v);
            }));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDataJobRequest::getSortKey, (req, v) -> {
                req.setSortKey(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RetryDataJobRequest, RetryDataJobResponse> retryDataJob = genForretryDataJob();

    private static HttpRequestDef<RetryDataJobRequest, RetryDataJobResponse> genForretryDataJob() {
        // basic
        HttpRequestDef.Builder<RetryDataJobRequest, RetryDataJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RetryDataJobRequest.class, RetryDataJobResponse.class)
                .withName("RetryDataJob")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/data-jobs/{data_job_id}/retry")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("data_job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RetryDataJobRequest::getDataJobId, (req, v) -> {
                req.setDataJobId(v);
            }));
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RetryDataJobRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDataJobRequest, ShowDataJobResponse> showDataJob = genForshowDataJob();

    private static HttpRequestDef<ShowDataJobRequest, ShowDataJobResponse> genForshowDataJob() {
        // basic
        HttpRequestDef.Builder<ShowDataJobRequest, ShowDataJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowDataJobRequest.class, ShowDataJobResponse.class)
                .withName("ShowDataJob")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/data-jobs/{data_job_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("data_job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDataJobRequest::getDataJobId, (req, v) -> {
                req.setDataJobId(v);
            }));
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDataJobRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateDatabaseDataRequest, CreateDatabaseDataResponse> createDatabaseData =
        genForcreateDatabaseData();

    private static HttpRequestDef<CreateDatabaseDataRequest, CreateDatabaseDataResponse> genForcreateDatabaseData() {
        // basic
        HttpRequestDef.Builder<CreateDatabaseDataRequest, CreateDatabaseDataResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateDatabaseDataRequest.class, CreateDatabaseDataResponse.class)
                .withName("CreateDatabaseData")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/databases/{database_id}/data/insert")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateDatabaseDataRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<String>withRequestField("database_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateDatabaseDataRequest::getDatabaseId, (req, v) -> {
                req.setDatabaseId(v);
            }));
        builder.<RowDataReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RowDataReq.class),
            f -> f.withMarshaller(CreateDatabaseDataRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateInstanceRequest, CreateInstanceResponse> createInstance =
        genForcreateInstance();

    private static HttpRequestDef<CreateInstanceRequest, CreateInstanceResponse> genForcreateInstance() {
        // basic
        HttpRequestDef.Builder<CreateInstanceRequest, CreateInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateInstanceRequest.class, CreateInstanceResponse.class)
                .withName("CreateInstance")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/databases")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateInstanceRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<CreateDatabaseReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateDatabaseReq.class),
            f -> f.withMarshaller(CreateInstanceRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteDatabaseDataRequest, DeleteDatabaseDataResponse> deleteDatabaseData =
        genFordeleteDatabaseData();

    private static HttpRequestDef<DeleteDatabaseDataRequest, DeleteDatabaseDataResponse> genFordeleteDatabaseData() {
        // basic
        HttpRequestDef.Builder<DeleteDatabaseDataRequest, DeleteDatabaseDataResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteDatabaseDataRequest.class, DeleteDatabaseDataResponse.class)
                .withName("DeleteDatabaseData")
                .withUri(
                    "/v1/{project_id}/eihealth-projects/{eihealth_project_id}/databases/{database_id}/data/{row_num}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDatabaseDataRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<String>withRequestField("database_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDatabaseDataRequest::getDatabaseId, (req, v) -> {
                req.setDatabaseId(v);
            }));
        builder.<Long>withRequestField("row_num",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(DeleteDatabaseDataRequest::getRowNum, (req, v) -> {
                req.setRowNum(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteInstanceRequest, DeleteInstanceResponse> deleteInstance =
        genFordeleteInstance();

    private static HttpRequestDef<DeleteInstanceRequest, DeleteInstanceResponse> genFordeleteInstance() {
        // basic
        HttpRequestDef.Builder<DeleteInstanceRequest, DeleteInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteInstanceRequest.class, DeleteInstanceResponse.class)
                .withName("DeleteInstance")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/databases/{database_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteInstanceRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<String>withRequestField("database_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteInstanceRequest::getDatabaseId, (req, v) -> {
                req.setDatabaseId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ImportDatabaseDataRequest, ImportDatabaseDataResponse> importDatabaseData =
        genForimportDatabaseData();

    private static HttpRequestDef<ImportDatabaseDataRequest, ImportDatabaseDataResponse> genForimportDatabaseData() {
        // basic
        HttpRequestDef.Builder<ImportDatabaseDataRequest, ImportDatabaseDataResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ImportDatabaseDataRequest.class, ImportDatabaseDataResponse.class)
                .withName("ImportDatabaseData")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/databases/{database_id}/data")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ImportDatabaseDataRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<String>withRequestField("database_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ImportDatabaseDataRequest::getDatabaseId, (req, v) -> {
                req.setDatabaseId(v);
            }));
        builder.<ImportDatabaseDataReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ImportDatabaseDataReq.class),
            f -> f.withMarshaller(ImportDatabaseDataRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDatabaseDataRequest, ListDatabaseDataResponse> listDatabaseData =
        genForlistDatabaseData();

    private static HttpRequestDef<ListDatabaseDataRequest, ListDatabaseDataResponse> genForlistDatabaseData() {
        // basic
        HttpRequestDef.Builder<ListDatabaseDataRequest, ListDatabaseDataResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListDatabaseDataRequest.class, ListDatabaseDataResponse.class)
                .withName("ListDatabaseData")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/databases/{database_id}/data")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDatabaseDataRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<String>withRequestField("database_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDatabaseDataRequest::getDatabaseId, (req, v) -> {
                req.setDatabaseId(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDatabaseDataRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("query",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDatabaseDataRequest::getQuery, (req, v) -> {
                req.setQuery(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDatabaseDataRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDatabaseDataRequest::getSortKey, (req, v) -> {
                req.setSortKey(v);
            }));
        builder.<String>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDatabaseDataRequest::getSortDir, (req, v) -> {
                req.setSortDir(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListInstanceRequest, ListInstanceResponse> listInstance = genForlistInstance();

    private static HttpRequestDef<ListInstanceRequest, ListInstanceResponse> genForlistInstance() {
        // basic
        HttpRequestDef.Builder<ListInstanceRequest, ListInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListInstanceRequest.class, ListInstanceResponse.class)
                .withName("ListInstance")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/databases")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstanceRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<QuoteInstanceRequest, QuoteInstanceResponse> quoteInstance =
        genForquoteInstance();

    private static HttpRequestDef<QuoteInstanceRequest, QuoteInstanceResponse> genForquoteInstance() {
        // basic
        HttpRequestDef.Builder<QuoteInstanceRequest, QuoteInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, QuoteInstanceRequest.class, QuoteInstanceResponse.class)
                .withName("QuoteInstance")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/databases/batch-quote")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(QuoteInstanceRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<QuoteDatabaseReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(QuoteDatabaseReq.class),
            f -> f.withMarshaller(QuoteInstanceRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response
        builder.<List<QuoteDatabaseResultRsp>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(QuoteInstanceResponse::getBody, (response, data) -> {
                response.setBody(data);
            }).withInnerContainerType(QuoteDatabaseResultRsp.class));

        return builder.build();
    }

    public static final HttpRequestDef<ShowInstanceRequest, ShowInstanceResponse> showInstance = genForshowInstance();

    private static HttpRequestDef<ShowInstanceRequest, ShowInstanceResponse> genForshowInstance() {
        // basic
        HttpRequestDef.Builder<ShowInstanceRequest, ShowInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowInstanceRequest.class, ShowInstanceResponse.class)
                .withName("ShowInstance")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/databases/{database_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowInstanceRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<String>withRequestField("database_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowInstanceRequest::getDatabaseId, (req, v) -> {
                req.setDatabaseId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateDatabaseDataRequest, UpdateDatabaseDataResponse> updateDatabaseData =
        genForupdateDatabaseData();

    private static HttpRequestDef<UpdateDatabaseDataRequest, UpdateDatabaseDataResponse> genForupdateDatabaseData() {
        // basic
        HttpRequestDef.Builder<UpdateDatabaseDataRequest, UpdateDatabaseDataResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateDatabaseDataRequest.class, UpdateDatabaseDataResponse.class)
                .withName("UpdateDatabaseData")
                .withUri(
                    "/v1/{project_id}/eihealth-projects/{eihealth_project_id}/databases/{database_id}/data/{row_num}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDatabaseDataRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<String>withRequestField("database_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDatabaseDataRequest::getDatabaseId, (req, v) -> {
                req.setDatabaseId(v);
            }));
        builder.<Long>withRequestField("row_num",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(UpdateDatabaseDataRequest::getRowNum, (req, v) -> {
                req.setRowNum(v);
            }));
        builder.<RowDataReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RowDataReq.class),
            f -> f.withMarshaller(UpdateDatabaseDataRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateDatabaseResourceRequest, CreateDatabaseResourceResponse> createDatabaseResource =
        genForcreateDatabaseResource();

    private static HttpRequestDef<CreateDatabaseResourceRequest, CreateDatabaseResourceResponse> genForcreateDatabaseResource() {
        // basic
        HttpRequestDef.Builder<CreateDatabaseResourceRequest, CreateDatabaseResourceResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateDatabaseResourceRequest.class, CreateDatabaseResourceResponse.class)
            .withName("CreateDatabaseResource")
            .withUri("/v1/{project_id}/system/database-resources")
            .withContentType("application/json");

        // requests
        builder.<CreateDatabaseResourceReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CreateDatabaseResourceReq.class),
            f -> f.withMarshaller(CreateDatabaseResourceRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteDatabaseResourceRequest, DeleteDatabaseResourceResponse> deleteDatabaseResource =
        genFordeleteDatabaseResource();

    private static HttpRequestDef<DeleteDatabaseResourceRequest, DeleteDatabaseResourceResponse> genFordeleteDatabaseResource() {
        // basic
        HttpRequestDef.Builder<DeleteDatabaseResourceRequest, DeleteDatabaseResourceResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteDatabaseResourceRequest.class, DeleteDatabaseResourceResponse.class)
            .withName("DeleteDatabaseResource")
            .withUri("/v1/{project_id}/system/database-resources/{id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDatabaseResourceRequest::getId, (req, v) -> {
                req.setId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDatabaseResourceRequest, ListDatabaseResourceResponse> listDatabaseResource =
        genForlistDatabaseResource();

    private static HttpRequestDef<ListDatabaseResourceRequest, ListDatabaseResourceResponse> genForlistDatabaseResource() {
        // basic
        HttpRequestDef.Builder<ListDatabaseResourceRequest, ListDatabaseResourceResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListDatabaseResourceRequest.class, ListDatabaseResourceResponse.class)
            .withName("ListDatabaseResource")
            .withUri("/v1/{project_id}/system/database-resources")
            .withContentType("application/json");

        // requests

        // response

        builder.<String>withResponseField("X-Resource-Mappings",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListDatabaseResourceResponse::getXResourceMappings,
                ListDatabaseResourceResponse::setXResourceMappings));
        return builder.build();
    }

    public static final HttpRequestDef<ListDatabaseResourceFlavorRequest, ListDatabaseResourceFlavorResponse> listDatabaseResourceFlavor =
        genForlistDatabaseResourceFlavor();

    private static HttpRequestDef<ListDatabaseResourceFlavorRequest, ListDatabaseResourceFlavorResponse> genForlistDatabaseResourceFlavor() {
        // basic
        HttpRequestDef.Builder<ListDatabaseResourceFlavorRequest, ListDatabaseResourceFlavorResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListDatabaseResourceFlavorRequest.class,
                    ListDatabaseResourceFlavorResponse.class)
                .withName("ListDatabaseResourceFlavor")
                .withUri("/v1/{project_id}/system/database-resources/flavors")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteTagRequest, BatchDeleteTagResponse> batchDeleteTag =
        genForbatchDeleteTag();

    private static HttpRequestDef<BatchDeleteTagRequest, BatchDeleteTagResponse> genForbatchDeleteTag() {
        // basic
        HttpRequestDef.Builder<BatchDeleteTagRequest, BatchDeleteTagResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchDeleteTagRequest.class, BatchDeleteTagResponse.class)
                .withName("BatchDeleteTag")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/images/{image_id}/tags/batch-delete")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeleteTagRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<String>withRequestField("image_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeleteTagRequest::getImageId, (req, v) -> {
                req.setImageId(v);
            }));
        builder.<BatchDeleteTagReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchDeleteTagReq.class),
            f -> f.withMarshaller(BatchDeleteTagRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response
        builder.<List<DeleteTagRsp>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(BatchDeleteTagResponse::getBody, (response, data) -> {
                response.setBody(data);
            }).withInnerContainerType(DeleteTagRsp.class));

        return builder.build();
    }

    public static final HttpRequestDef<CreateImageRequest, CreateImageResponse> createImage = genForcreateImage();

    private static HttpRequestDef<CreateImageRequest, CreateImageResponse> genForcreateImage() {
        // basic
        HttpRequestDef.Builder<CreateImageRequest, CreateImageResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateImageRequest.class, CreateImageResponse.class)
                .withName("CreateImage")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/images")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateImageRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<CreateImageReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateImageReq.class),
            f -> f.withMarshaller(CreateImageRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteImageRequest, DeleteImageResponse> deleteImage = genFordeleteImage();

    private static HttpRequestDef<DeleteImageRequest, DeleteImageResponse> genFordeleteImage() {
        // basic
        HttpRequestDef.Builder<DeleteImageRequest, DeleteImageResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteImageRequest.class, DeleteImageResponse.class)
                .withName("DeleteImage")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/images/{image_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteImageRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<String>withRequestField("image_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteImageRequest::getImageId, (req, v) -> {
                req.setImageId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteTagRequest, DeleteTagResponse> deleteTag = genFordeleteTag();

    private static HttpRequestDef<DeleteTagRequest, DeleteTagResponse> genFordeleteTag() {
        // basic
        HttpRequestDef.Builder<DeleteTagRequest, DeleteTagResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteTagRequest.class, DeleteTagResponse.class)
                .withName("DeleteTag")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/images/{image_id}/tags/{tag}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTagRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<String>withRequestField("image_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTagRequest::getImageId, (req, v) -> {
                req.setImageId(v);
            }));
        builder.<String>withRequestField("tag",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTagRequest::getTag, (req, v) -> {
                req.setTag(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ImportImageRequest, ImportImageResponse> importImage = genForimportImage();

    private static HttpRequestDef<ImportImageRequest, ImportImageResponse> genForimportImage() {
        // basic
        HttpRequestDef.Builder<ImportImageRequest, ImportImageResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ImportImageRequest.class, ImportImageResponse.class)
                .withName("ImportImage")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/images/import")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ImportImageRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<ImportImageReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ImportImageReq.class),
            f -> f.withMarshaller(ImportImageRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListImageRequest, ListImageResponse> listImage = genForlistImage();

    private static HttpRequestDef<ListImageRequest, ListImageResponse> genForlistImage() {
        // basic
        HttpRequestDef.Builder<ListImageRequest, ListImageResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListImageRequest.class, ListImageResponse.class)
                .withName("ListImage")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/images")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImageRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImageRequest::getType, (req, v) -> {
                req.setType(v);
            }));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImageRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<Boolean>withRequestField("show_empty",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListImageRequest::getShowEmpty, (req, v) -> {
                req.setShowEmpty(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListImageTagRequest, ListImageTagResponse> listImageTag = genForlistImageTag();

    private static HttpRequestDef<ListImageTagRequest, ListImageTagResponse> genForlistImageTag() {
        // basic
        HttpRequestDef.Builder<ListImageTagRequest, ListImageTagResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListImageTagRequest.class, ListImageTagResponse.class)
                .withName("ListImageTag")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/images/{image_id}/tags")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImageTagRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<String>withRequestField("image_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImageTagRequest::getImageId, (req, v) -> {
                req.setImageId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<PublishImageRequest, PublishImageResponse> publishImage = genForpublishImage();

    private static HttpRequestDef<PublishImageRequest, PublishImageResponse> genForpublishImage() {
        // basic
        HttpRequestDef.Builder<PublishImageRequest, PublishImageResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, PublishImageRequest.class, PublishImageResponse.class)
                .withName("PublishImage")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/images/publish")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(PublishImageRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<PublishAssetReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PublishAssetReq.class),
            f -> f.withMarshaller(PublishImageRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDockerLoginRequest, ShowDockerLoginResponse> showDockerLogin =
        genForshowDockerLogin();

    private static HttpRequestDef<ShowDockerLoginRequest, ShowDockerLoginResponse> genForshowDockerLogin() {
        // basic
        HttpRequestDef.Builder<ShowDockerLoginRequest, ShowDockerLoginResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowDockerLoginRequest.class, ShowDockerLoginResponse.class)
                .withName("ShowDockerLogin")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/images/docker-login-cmd")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDockerLoginRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SubscribeImageRequest, SubscribeImageResponse> subscribeImage =
        genForsubscribeImage();

    private static HttpRequestDef<SubscribeImageRequest, SubscribeImageResponse> genForsubscribeImage() {
        // basic
        HttpRequestDef.Builder<SubscribeImageRequest, SubscribeImageResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, SubscribeImageRequest.class, SubscribeImageResponse.class)
                .withName("SubscribeImage")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/images/subscribe")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SubscribeImageRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<SubscribeImageReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SubscribeImageReq.class),
            f -> f.withMarshaller(SubscribeImageRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateImageRequest, UpdateImageResponse> updateImage = genForupdateImage();

    private static HttpRequestDef<UpdateImageRequest, UpdateImageResponse> genForupdateImage() {
        // basic
        HttpRequestDef.Builder<UpdateImageRequest, UpdateImageResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateImageRequest.class, UpdateImageResponse.class)
                .withName("UpdateImage")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/images/{image_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateImageRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<String>withRequestField("image_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateImageRequest::getImageId, (req, v) -> {
                req.setImageId(v);
            }));
        builder.<UpdateImageReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateImageReq.class),
            f -> f.withMarshaller(UpdateImageRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowJobConfigRequest, ShowJobConfigResponse> showJobConfig =
        genForshowJobConfig();

    private static HttpRequestDef<ShowJobConfigRequest, ShowJobConfigResponse> genForshowJobConfig() {
        // basic
        HttpRequestDef.Builder<ShowJobConfigRequest, ShowJobConfigResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowJobConfigRequest.class, ShowJobConfigResponse.class)
                .withName("ShowJobConfig")
                .withUri("/v1/{project_id}/system/job-config")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateJobConfigRequest, UpdateJobConfigResponse> updateJobConfig =
        genForupdateJobConfig();

    private static HttpRequestDef<UpdateJobConfigRequest, UpdateJobConfigResponse> genForupdateJobConfig() {
        // basic
        HttpRequestDef.Builder<UpdateJobConfigRequest, UpdateJobConfigResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateJobConfigRequest.class, UpdateJobConfigResponse.class)
                .withName("UpdateJobConfig")
                .withUri("/v1/{project_id}/system/job-config")
                .withContentType("application/json");

        // requests
        builder.<UpdateJobConfigReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateJobConfigReq.class),
            f -> f.withMarshaller(UpdateJobConfigRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchCancelJobRequest, BatchCancelJobResponse> batchCancelJob =
        genForbatchCancelJob();

    private static HttpRequestDef<BatchCancelJobRequest, BatchCancelJobResponse> genForbatchCancelJob() {
        // basic
        HttpRequestDef.Builder<BatchCancelJobRequest, BatchCancelJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchCancelJobRequest.class, BatchCancelJobResponse.class)
                .withName("BatchCancelJob")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/jobs/batch-terminate")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchCancelJobRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<Boolean>withRequestField("X-Force",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(BatchCancelJobRequest::getXForce, (req, v) -> {
                req.setXForce(v);
            }));
        builder.<BatchOperateJobReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchOperateJobReq.class),
            f -> f.withMarshaller(BatchCancelJobRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response
        builder.<List<BatchOperateJobRsp>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(BatchCancelJobResponse::getBody, (response, data) -> {
                response.setBody(data);
            }).withInnerContainerType(BatchOperateJobRsp.class));

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteJobRequest, BatchDeleteJobResponse> batchDeleteJob =
        genForbatchDeleteJob();

    private static HttpRequestDef<BatchDeleteJobRequest, BatchDeleteJobResponse> genForbatchDeleteJob() {
        // basic
        HttpRequestDef.Builder<BatchDeleteJobRequest, BatchDeleteJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchDeleteJobRequest.class, BatchDeleteJobResponse.class)
                .withName("BatchDeleteJob")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/jobs/batch-delete")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeleteJobRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<BatchOperateJobReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchOperateJobReq.class),
            f -> f.withMarshaller(BatchDeleteJobRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response
        builder.<List<BatchOperateJobRsp>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(BatchDeleteJobResponse::getBody, (response, data) -> {
                response.setBody(data);
            }).withInnerContainerType(BatchOperateJobRsp.class));

        return builder.build();
    }

    public static final HttpRequestDef<BatchRetryJobRequest, BatchRetryJobResponse> batchRetryJob =
        genForbatchRetryJob();

    private static HttpRequestDef<BatchRetryJobRequest, BatchRetryJobResponse> genForbatchRetryJob() {
        // basic
        HttpRequestDef.Builder<BatchRetryJobRequest, BatchRetryJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchRetryJobRequest.class, BatchRetryJobResponse.class)
                .withName("BatchRetryJob")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/jobs/batch-retry")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchRetryJobRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<BatchOperateJobReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchOperateJobReq.class),
            f -> f.withMarshaller(BatchRetryJobRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response
        builder.<List<BatchOperateJobRsp>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(BatchRetryJobResponse::getBody, (response, data) -> {
                response.setBody(data);
            }).withInnerContainerType(BatchOperateJobRsp.class));

        return builder.build();
    }

    public static final HttpRequestDef<CancelJobRequest, CancelJobResponse> cancelJob = genForcancelJob();

    private static HttpRequestDef<CancelJobRequest, CancelJobResponse> genForcancelJob() {
        // basic
        HttpRequestDef.Builder<CancelJobRequest, CancelJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CancelJobRequest.class, CancelJobResponse.class)
                .withName("CancelJob")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/jobs/{job_id}/terminate")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CancelJobRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CancelJobRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));
        builder.<TerminateJobReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(TerminateJobReq.class),
            f -> f.withMarshaller(CancelJobRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteJobRequest, DeleteJobResponse> deleteJob = genFordeleteJob();

    private static HttpRequestDef<DeleteJobRequest, DeleteJobResponse> genFordeleteJob() {
        // basic
        HttpRequestDef.Builder<DeleteJobRequest, DeleteJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteJobRequest.class, DeleteJobResponse.class)
                .withName("DeleteJob")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/jobs/{job_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteJobRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteJobRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExecuteJobRequest, ExecuteJobResponse> executeJob = genForexecuteJob();

    private static HttpRequestDef<ExecuteJobRequest, ExecuteJobResponse> genForexecuteJob() {
        // basic
        HttpRequestDef.Builder<ExecuteJobRequest, ExecuteJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ExecuteJobRequest.class, ExecuteJobResponse.class)
                .withName("ExecuteJob")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/jobs")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExecuteJobRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<JobDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(JobDto.class),
            f -> f.withMarshaller(ExecuteJobRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListJobRequest, ListJobResponse> listJob = genForlistJob();

    private static HttpRequestDef<ListJobRequest, ListJobResponse> genForlistJob() {
        // basic
        HttpRequestDef.Builder<ListJobRequest, ListJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListJobRequest.class, ListJobResponse.class)
                .withName("ListJob")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/jobs")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListJobRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<Long>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListJobRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            }));
        builder.<String>withRequestField("job_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListJobRequest::getJobName, (req, v) -> {
                req.setJobName(v);
            }));
        builder.<List<String>>withRequestField("labels",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListJobRequest::getLabels, (req, v) -> {
                req.setLabels(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListJobRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListJobRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListJobRequest::getSortDir, (req, v) -> {
                req.setSortDir(v);
            }));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListJobRequest::getSortKey, (req, v) -> {
                req.setSortKey(v);
            }));
        builder.<Long>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListJobRequest::getStartTime, (req, v) -> {
                req.setStartTime(v);
            }));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListJobRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            }));
        builder.<String>withRequestField("tool_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListJobRequest::getToolName, (req, v) -> {
                req.setToolName(v);
            }));
        builder.<String>withRequestField("user_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListJobRequest::getUserName, (req, v) -> {
                req.setUserName(v);
            }));
        builder.<Long>withRequestField("finish_start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListJobRequest::getFinishStartTime, (req, v) -> {
                req.setFinishStartTime(v);
            }));
        builder.<Long>withRequestField("finish_end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListJobRequest::getFinishEndTime, (req, v) -> {
                req.setFinishEndTime(v);
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
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/jobs/{job_id}/retry")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RetryJobRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
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
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/jobs/{job_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJobRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJobRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));
        builder.<String>withRequestField("X-Addition-Info",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJobRequest::getXAdditionInfo, (req, v) -> {
                req.setXAdditionInfo(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowJobEventRequest, ShowJobEventResponse> showJobEvent = genForshowJobEvent();

    private static HttpRequestDef<ShowJobEventRequest, ShowJobEventResponse> genForshowJobEvent() {
        // basic
        HttpRequestDef.Builder<ShowJobEventRequest, ShowJobEventResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowJobEventRequest.class, ShowJobEventResponse.class)
                .withName("ShowJobEvent")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/jobs/{job_id}/events")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJobEventRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJobEventRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJobEventRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowJobLogRequest, ShowJobLogResponse> showJobLog = genForshowJobLog();

    private static HttpRequestDef<ShowJobLogRequest, ShowJobLogResponse> genForshowJobLog() {
        // basic
        HttpRequestDef.Builder<ShowJobLogRequest, ShowJobLogResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowJobLogRequest.class, ShowJobLogResponse.class)
                .withName("ShowJobLog")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/jobs/{job_id}/logs")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJobLogRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJobLogRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));
        builder.<String>withRequestField("task_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJobLogRequest::getTaskName, (req, v) -> {
                req.setTaskName(v);
            }));
        builder.<String>withRequestField("task_index",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJobLogRequest::getTaskIndex, (req, v) -> {
                req.setTaskIndex(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTaskEventsRequest, ShowTaskEventsResponse> showTaskEvents =
        genForshowTaskEvents();

    private static HttpRequestDef<ShowTaskEventsRequest, ShowTaskEventsResponse> genForshowTaskEvents() {
        // basic
        HttpRequestDef.Builder<ShowTaskEventsRequest, ShowTaskEventsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowTaskEventsRequest.class, ShowTaskEventsResponse.class)
                .withName("ShowTaskEvents")
                .withUri(
                    "/v1/{project_id}/eihealth-projects/{eihealth_project_id}/jobs/{job_id}/tasks/{task_name}/events")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTaskEventsRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTaskEventsRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));
        builder.<String>withRequestField("task_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTaskEventsRequest::getTaskName, (req, v) -> {
                req.setTaskName(v);
            }));
        builder.<String>withRequestField("task_index",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTaskEventsRequest::getTaskIndex, (req, v) -> {
                req.setTaskIndex(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTaskInstanceEventsRequest, ShowTaskInstanceEventsResponse> showTaskInstanceEvents =
        genForshowTaskInstanceEvents();

    private static HttpRequestDef<ShowTaskInstanceEventsRequest, ShowTaskInstanceEventsResponse> genForshowTaskInstanceEvents() {
        // basic
        HttpRequestDef.Builder<ShowTaskInstanceEventsRequest, ShowTaskInstanceEventsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowTaskInstanceEventsRequest.class, ShowTaskInstanceEventsResponse.class)
            .withName("ShowTaskInstanceEvents")
            .withUri(
                "/v1/{project_id}/eihealth-projects/{eihealth_project_id}/jobs/{job_id}/tasks/{task_name}/instances/{instance_name}/events")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTaskInstanceEventsRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTaskInstanceEventsRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));
        builder.<String>withRequestField("task_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTaskInstanceEventsRequest::getTaskName, (req, v) -> {
                req.setTaskName(v);
            }));
        builder.<String>withRequestField("instance_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTaskInstanceEventsRequest::getInstanceName, (req, v) -> {
                req.setInstanceName(v);
            }));
        builder.<String>withRequestField("task_index",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTaskInstanceEventsRequest::getTaskIndex, (req, v) -> {
                req.setTaskIndex(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTaskInstanceMetricDataRequest, ShowTaskInstanceMetricDataResponse> showTaskInstanceMetricData =
        genForshowTaskInstanceMetricData();

    private static HttpRequestDef<ShowTaskInstanceMetricDataRequest, ShowTaskInstanceMetricDataResponse> genForshowTaskInstanceMetricData() {
        // basic
        HttpRequestDef.Builder<ShowTaskInstanceMetricDataRequest, ShowTaskInstanceMetricDataResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowTaskInstanceMetricDataRequest.class,
                    ShowTaskInstanceMetricDataResponse.class)
                .withName("ShowTaskInstanceMetricData")
                .withUri(
                    "/v1/{project_id}/eihealth-projects/{eihealth_project_id}/jobs/{job_id}/tasks/{task_name}/instances/{instance_name}/metric-data")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTaskInstanceMetricDataRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTaskInstanceMetricDataRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));
        builder.<String>withRequestField("task_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTaskInstanceMetricDataRequest::getTaskName, (req, v) -> {
                req.setTaskName(v);
            }));
        builder.<String>withRequestField("instance_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTaskInstanceMetricDataRequest::getInstanceName, (req, v) -> {
                req.setInstanceName(v);
            }));
        builder.<String>withRequestField("task_index",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTaskInstanceMetricDataRequest::getTaskIndex, (req, v) -> {
                req.setTaskIndex(v);
            }));
        builder.<Long>withRequestField("from_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowTaskInstanceMetricDataRequest::getFromTime, (req, v) -> {
                req.setFromTime(v);
            }));
        builder.<Long>withRequestField("to_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowTaskInstanceMetricDataRequest::getToTime, (req, v) -> {
                req.setToTime(v);
            }));
        builder.<String>withRequestField("method",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTaskInstanceMetricDataRequest::getMethod, (req, v) -> {
                req.setMethod(v);
            }));
        builder.<String>withRequestField("metric_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTaskInstanceMetricDataRequest::getMetricName, (req, v) -> {
                req.setMetricName(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTaskInstancePodRequest, ShowTaskInstancePodResponse> showTaskInstancePod =
        genForshowTaskInstancePod();

    private static HttpRequestDef<ShowTaskInstancePodRequest, ShowTaskInstancePodResponse> genForshowTaskInstancePod() {
        // basic
        HttpRequestDef.Builder<ShowTaskInstancePodRequest, ShowTaskInstancePodResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowTaskInstancePodRequest.class, ShowTaskInstancePodResponse.class)
            .withName("ShowTaskInstancePod")
            .withUri(
                "/v1/{project_id}/eihealth-projects/{eihealth_project_id}/jobs/{job_id}/tasks/{task_name}/instances/{instance_name}/pod")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTaskInstancePodRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTaskInstancePodRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));
        builder.<String>withRequestField("task_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTaskInstancePodRequest::getTaskName, (req, v) -> {
                req.setTaskName(v);
            }));
        builder.<String>withRequestField("instance_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTaskInstancePodRequest::getInstanceName, (req, v) -> {
                req.setInstanceName(v);
            }));
        builder.<String>withRequestField("task_index",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTaskInstancePodRequest::getTaskIndex, (req, v) -> {
                req.setTaskIndex(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTaskInstancesRequest, ShowTaskInstancesResponse> showTaskInstances =
        genForshowTaskInstances();

    private static HttpRequestDef<ShowTaskInstancesRequest, ShowTaskInstancesResponse> genForshowTaskInstances() {
        // basic
        HttpRequestDef.Builder<ShowTaskInstancesRequest, ShowTaskInstancesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowTaskInstancesRequest.class, ShowTaskInstancesResponse.class)
            .withName("ShowTaskInstances")
            .withUri(
                "/v1/{project_id}/eihealth-projects/{eihealth_project_id}/jobs/{job_id}/tasks/{task_name}/instances")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTaskInstancesRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTaskInstancesRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));
        builder.<String>withRequestField("task_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTaskInstancesRequest::getTaskName, (req, v) -> {
                req.setTaskName(v);
            }));
        builder.<String>withRequestField("task_index",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTaskInstancesRequest::getTaskIndex, (req, v) -> {
                req.setTaskIndex(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateJobRequest, UpdateJobResponse> updateJob = genForupdateJob();

    private static HttpRequestDef<UpdateJobRequest, UpdateJobResponse> genForupdateJob() {
        // basic
        HttpRequestDef.Builder<UpdateJobRequest, UpdateJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateJobRequest.class, UpdateJobResponse.class)
                .withName("UpdateJob")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/jobs/{job_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateJobRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateJobRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));
        builder.<UpdateJobReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateJobReq.class),
            f -> f.withMarshaller(UpdateJobRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteLabelRequest, BatchDeleteLabelResponse> batchDeleteLabel =
        genForbatchDeleteLabel();

    private static HttpRequestDef<BatchDeleteLabelRequest, BatchDeleteLabelResponse> genForbatchDeleteLabel() {
        // basic
        HttpRequestDef.Builder<BatchDeleteLabelRequest, BatchDeleteLabelResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchDeleteLabelRequest.class, BatchDeleteLabelResponse.class)
                .withName("BatchDeleteLabel")
                .withUri("/v1/{project_id}/system/labels/batch-delete")
                .withContentType("application/json");

        // requests
        builder.<BatchDeleteLabelReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchDeleteLabelReq.class),
            f -> f.withMarshaller(BatchDeleteLabelRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateLabelRequest, CreateLabelResponse> createLabel = genForcreateLabel();

    private static HttpRequestDef<CreateLabelRequest, CreateLabelResponse> genForcreateLabel() {
        // basic
        HttpRequestDef.Builder<CreateLabelRequest, CreateLabelResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateLabelRequest.class, CreateLabelResponse.class)
                .withName("CreateLabel")
                .withUri("/v1/{project_id}/system/labels")
                .withContentType("application/json");

        // requests
        builder.<CreateLabelReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateLabelReq.class),
            f -> f.withMarshaller(CreateLabelRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteLabelRequest, DeleteLabelResponse> deleteLabel = genFordeleteLabel();

    private static HttpRequestDef<DeleteLabelRequest, DeleteLabelResponse> genFordeleteLabel() {
        // basic
        HttpRequestDef.Builder<DeleteLabelRequest, DeleteLabelResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteLabelRequest.class, DeleteLabelResponse.class)
                .withName("DeleteLabel")
                .withUri("/v1/{project_id}/system/labels/{label_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("label_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteLabelRequest::getLabelId, (req, v) -> {
                req.setLabelId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListLabelRequest, ListLabelResponse> listLabel = genForlistLabel();

    private static HttpRequestDef<ListLabelRequest, ListLabelResponse> genForlistLabel() {
        // basic
        HttpRequestDef.Builder<ListLabelRequest, ListLabelResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListLabelRequest.class, ListLabelResponse.class)
                .withName("ListLabel")
                .withUri("/v1/{project_id}/system/labels")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateLabelPageRequest, CreateLabelPageResponse> createLabelPage =
        genForcreateLabelPage();

    private static HttpRequestDef<CreateLabelPageRequest, CreateLabelPageResponse> genForcreateLabelPage() {
        // basic
        HttpRequestDef.Builder<CreateLabelPageRequest, CreateLabelPageResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateLabelPageRequest.class, CreateLabelPageResponse.class)
                .withName("CreateLabelPage")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/label-pages")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateLabelPageRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<CreateLabelPageReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateLabelPageReq.class),
            f -> f.withMarshaller(CreateLabelPageRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteLabelPageRequest, DeleteLabelPageResponse> deleteLabelPage =
        genFordeleteLabelPage();

    private static HttpRequestDef<DeleteLabelPageRequest, DeleteLabelPageResponse> genFordeleteLabelPage() {
        // basic
        HttpRequestDef.Builder<DeleteLabelPageRequest, DeleteLabelPageResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteLabelPageRequest.class, DeleteLabelPageResponse.class)
                .withName("DeleteLabelPage")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/label-pages/{label_page_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteLabelPageRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<String>withRequestField("label_page_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteLabelPageRequest::getLabelPageId, (req, v) -> {
                req.setLabelPageId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListLabelPageRequest, ListLabelPageResponse> listLabelPage =
        genForlistLabelPage();

    private static HttpRequestDef<ListLabelPageRequest, ListLabelPageResponse> genForlistLabelPage() {
        // basic
        HttpRequestDef.Builder<ListLabelPageRequest, ListLabelPageResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListLabelPageRequest.class, ListLabelPageResponse.class)
                .withName("ListLabelPage")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/label-pages")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLabelPageRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteNoticeRequest, BatchDeleteNoticeResponse> batchDeleteNotice =
        genForbatchDeleteNotice();

    private static HttpRequestDef<BatchDeleteNoticeRequest, BatchDeleteNoticeResponse> genForbatchDeleteNotice() {
        // basic
        HttpRequestDef.Builder<BatchDeleteNoticeRequest, BatchDeleteNoticeResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchDeleteNoticeRequest.class, BatchDeleteNoticeResponse.class)
                .withName("BatchDeleteNotice")
                .withUri("/v1/{project_id}/notices/batch-delete")
                .withContentType("application/json");

        // requests
        builder.<BatchDeleteNoticeReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchDeleteNoticeReq.class),
            f -> f.withMarshaller(BatchDeleteNoticeRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchUpdateNoticeRequest, BatchUpdateNoticeResponse> batchUpdateNotice =
        genForbatchUpdateNotice();

    private static HttpRequestDef<BatchUpdateNoticeRequest, BatchUpdateNoticeResponse> genForbatchUpdateNotice() {
        // basic
        HttpRequestDef.Builder<BatchUpdateNoticeRequest, BatchUpdateNoticeResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchUpdateNoticeRequest.class, BatchUpdateNoticeResponse.class)
                .withName("BatchUpdateNotice")
                .withUri("/v1/{project_id}/notices/batch-update")
                .withContentType("application/json");

        // requests
        builder.<BatchUpdateNoticeReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchUpdateNoticeReq.class),
            f -> f.withMarshaller(BatchUpdateNoticeRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CheckEmailConnectionRequest, CheckEmailConnectionResponse> checkEmailConnection =
        genForcheckEmailConnection();

    private static HttpRequestDef<CheckEmailConnectionRequest, CheckEmailConnectionResponse> genForcheckEmailConnection() {
        // basic
        HttpRequestDef.Builder<CheckEmailConnectionRequest, CheckEmailConnectionResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CheckEmailConnectionRequest.class, CheckEmailConnectionResponse.class)
            .withName("CheckEmailConnection")
            .withUri("/v1/{project_id}/messages/email-connection-test")
            .withContentType("application/json");

        // requests
        builder.<TryEmailConnectionReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(TryEmailConnectionReq.class),
            f -> f.withMarshaller(CheckEmailConnectionRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteMessageEmailConfigRequest, DeleteMessageEmailConfigResponse> deleteMessageEmailConfig =
        genFordeleteMessageEmailConfig();

    private static HttpRequestDef<DeleteMessageEmailConfigRequest, DeleteMessageEmailConfigResponse> genFordeleteMessageEmailConfig() {
        // basic
        HttpRequestDef.Builder<DeleteMessageEmailConfigRequest, DeleteMessageEmailConfigResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteMessageEmailConfigRequest.class,
                    DeleteMessageEmailConfigResponse.class)
                .withName("DeleteMessageEmailConfig")
                .withUri("/v1/{project_id}/messages/email-server-config")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListMessageRequest, ListMessageResponse> listMessage = genForlistMessage();

    private static HttpRequestDef<ListMessageRequest, ListMessageResponse> genForlistMessage() {
        // basic
        HttpRequestDef.Builder<ListMessageRequest, ListMessageResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListMessageRequest.class, ListMessageResponse.class)
                .withName("ListMessage")
                .withUri("/v1/{project_id}/messages")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMessageRequest::getEihealthProjectName, (req, v) -> {
                req.setEihealthProjectName(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListMessageRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("message_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMessageRequest::getMessageType, (req, v) -> {
                req.setMessageType(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListMessageRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("operator",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMessageRequest::getOperator, (req, v) -> {
                req.setOperator(v);
            }));
        builder.<String>withRequestField("resource_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMessageRequest::getResourceType, (req, v) -> {
                req.setResourceType(v);
            }));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMessageRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListMessageStatisticsRequest, ListMessageStatisticsResponse> listMessageStatistics =
        genForlistMessageStatistics();

    private static HttpRequestDef<ListMessageStatisticsRequest, ListMessageStatisticsResponse> genForlistMessageStatistics() {
        // basic
        HttpRequestDef.Builder<ListMessageStatisticsRequest, ListMessageStatisticsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListMessageStatisticsRequest.class, ListMessageStatisticsResponse.class)
            .withName("ListMessageStatistics")
            .withUri("/v1/{project_id}/messages/statistics")
            .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListNoticeRequest, ListNoticeResponse> listNotice = genForlistNotice();

    private static HttpRequestDef<ListNoticeRequest, ListNoticeResponse> genForlistNotice() {
        // basic
        HttpRequestDef.Builder<ListNoticeRequest, ListNoticeResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListNoticeRequest.class, ListNoticeResponse.class)
                .withName("ListNotice")
                .withUri("/v1/{project_id}/notices")
                .withContentType("application/json");

        // requests
        builder.<Boolean>withRequestField("is_read",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListNoticeRequest::getIsRead, (req, v) -> {
                req.setIsRead(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListNoticeRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListNoticeRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowMessageClearRuleRequest, ShowMessageClearRuleResponse> showMessageClearRule =
        genForshowMessageClearRule();

    private static HttpRequestDef<ShowMessageClearRuleRequest, ShowMessageClearRuleResponse> genForshowMessageClearRule() {
        // basic
        HttpRequestDef.Builder<ShowMessageClearRuleRequest, ShowMessageClearRuleResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowMessageClearRuleRequest.class, ShowMessageClearRuleResponse.class)
            .withName("ShowMessageClearRule")
            .withUri("/v1/{project_id}/messages/rules")
            .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowMessageEmailConfigRequest, ShowMessageEmailConfigResponse> showMessageEmailConfig =
        genForshowMessageEmailConfig();

    private static HttpRequestDef<ShowMessageEmailConfigRequest, ShowMessageEmailConfigResponse> genForshowMessageEmailConfig() {
        // basic
        HttpRequestDef.Builder<ShowMessageEmailConfigRequest, ShowMessageEmailConfigResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowMessageEmailConfigRequest.class, ShowMessageEmailConfigResponse.class)
            .withName("ShowMessageEmailConfig")
            .withUri("/v1/{project_id}/messages/email-server-config")
            .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowMessageReceiveConfigRequest, ShowMessageReceiveConfigResponse> showMessageReceiveConfig =
        genForshowMessageReceiveConfig();

    private static HttpRequestDef<ShowMessageReceiveConfigRequest, ShowMessageReceiveConfigResponse> genForshowMessageReceiveConfig() {
        // basic
        HttpRequestDef.Builder<ShowMessageReceiveConfigRequest, ShowMessageReceiveConfigResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ShowMessageReceiveConfigRequest.class, ShowMessageReceiveConfigResponse.class)
                .withName("ShowMessageReceiveConfig")
                .withUri("/v1/{project_id}/messages/email-client-config")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateMessageClearRuleRequest, UpdateMessageClearRuleResponse> updateMessageClearRule =
        genForupdateMessageClearRule();

    private static HttpRequestDef<UpdateMessageClearRuleRequest, UpdateMessageClearRuleResponse> genForupdateMessageClearRule() {
        // basic
        HttpRequestDef.Builder<UpdateMessageClearRuleRequest, UpdateMessageClearRuleResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateMessageClearRuleRequest.class, UpdateMessageClearRuleResponse.class)
            .withName("UpdateMessageClearRule")
            .withUri("/v1/{project_id}/messages/rules")
            .withContentType("application/json");

        // requests
        builder.<SetMessageClearRuleReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SetMessageClearRuleReq.class),
            f -> f.withMarshaller(UpdateMessageClearRuleRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateMessageEmailConfigRequest, UpdateMessageEmailConfigResponse> updateMessageEmailConfig =
        genForupdateMessageEmailConfig();

    private static HttpRequestDef<UpdateMessageEmailConfigRequest, UpdateMessageEmailConfigResponse> genForupdateMessageEmailConfig() {
        // basic
        HttpRequestDef.Builder<UpdateMessageEmailConfigRequest, UpdateMessageEmailConfigResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT, UpdateMessageEmailConfigRequest.class, UpdateMessageEmailConfigResponse.class)
                .withName("UpdateMessageEmailConfig")
                .withUri("/v1/{project_id}/messages/email-server-config")
                .withContentType("application/json");

        // requests
        builder.<SetMessageEmailConfigReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SetMessageEmailConfigReq.class),
            f -> f.withMarshaller(UpdateMessageEmailConfigRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateMessageReceiveConfigRequest, UpdateMessageReceiveConfigResponse> updateMessageReceiveConfig =
        genForupdateMessageReceiveConfig();

    private static HttpRequestDef<UpdateMessageReceiveConfigRequest, UpdateMessageReceiveConfigResponse> genForupdateMessageReceiveConfig() {
        // basic
        HttpRequestDef.Builder<UpdateMessageReceiveConfigRequest, UpdateMessageReceiveConfigResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateMessageReceiveConfigRequest.class,
                    UpdateMessageReceiveConfigResponse.class)
                .withName("UpdateMessageReceiveConfig")
                .withUri("/v1/{project_id}/messages/email-client-config")
                .withContentType("application/json");

        // requests
        builder.<SetMessageReceiveConfigReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SetMessageReceiveConfigReq.class),
            f -> f.withMarshaller(UpdateMessageReceiveConfigRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchUpdateNodeLabelRequest, BatchUpdateNodeLabelResponse> batchUpdateNodeLabel =
        genForbatchUpdateNodeLabel();

    private static HttpRequestDef<BatchUpdateNodeLabelRequest, BatchUpdateNodeLabelResponse> genForbatchUpdateNodeLabel() {
        // basic
        HttpRequestDef.Builder<BatchUpdateNodeLabelRequest, BatchUpdateNodeLabelResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, BatchUpdateNodeLabelRequest.class, BatchUpdateNodeLabelResponse.class)
            .withName("BatchUpdateNodeLabel")
            .withUri("/v1/{project_id}/system/nodes/{server_id}/labels")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("server_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchUpdateNodeLabelRequest::getServerId, (req, v) -> {
                req.setServerId(v);
            }));
        builder.<BatchUpdateNodeLabelReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchUpdateNodeLabelReq.class),
            f -> f.withMarshaller(BatchUpdateNodeLabelRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListClusterAllNodeLabelRequest, ListClusterAllNodeLabelResponse> listClusterAllNodeLabel =
        genForlistClusterAllNodeLabel();

    private static HttpRequestDef<ListClusterAllNodeLabelRequest, ListClusterAllNodeLabelResponse> genForlistClusterAllNodeLabel() {
        // basic
        HttpRequestDef.Builder<ListClusterAllNodeLabelRequest, ListClusterAllNodeLabelResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListClusterAllNodeLabelRequest.class, ListClusterAllNodeLabelResponse.class)
            .withName("ListClusterAllNodeLabel")
            .withUri("/v1/{project_id}/system/cluster/labels")
            .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListNodeLabelRequest, ListNodeLabelResponse> listNodeLabel =
        genForlistNodeLabel();

    private static HttpRequestDef<ListNodeLabelRequest, ListNodeLabelResponse> genForlistNodeLabel() {
        // basic
        HttpRequestDef.Builder<ListNodeLabelRequest, ListNodeLabelResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListNodeLabelRequest.class, ListNodeLabelResponse.class)
                .withName("ListNodeLabel")
                .withUri("/v1/{project_id}/system/nodes/{server_id}/labels")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("server_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNodeLabelRequest::getServerId, (req, v) -> {
                req.setServerId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPresetLabelRequest, ListPresetLabelResponse> listPresetLabel =
        genForlistPresetLabel();

    private static HttpRequestDef<ListPresetLabelRequest, ListPresetLabelResponse> genForlistPresetLabel() {
        // basic
        HttpRequestDef.Builder<ListPresetLabelRequest, ListPresetLabelResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListPresetLabelRequest.class, ListPresetLabelResponse.class)
                .withName("ListPresetLabel")
                .withUri("/v1/{project_id}/system/preset-labels")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateNotebookRequest, CreateNotebookResponse> createNotebook =
        genForcreateNotebook();

    private static HttpRequestDef<CreateNotebookRequest, CreateNotebookResponse> genForcreateNotebook() {
        // basic
        HttpRequestDef.Builder<CreateNotebookRequest, CreateNotebookResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateNotebookRequest.class, CreateNotebookResponse.class)
                .withName("CreateNotebook")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/notebooks")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateNotebookRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<CreateNotebookReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateNotebookReq.class),
            f -> f.withMarshaller(CreateNotebookRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteNotebookRequest, DeleteNotebookResponse> deleteNotebook =
        genFordeleteNotebook();

    private static HttpRequestDef<DeleteNotebookRequest, DeleteNotebookResponse> genFordeleteNotebook() {
        // basic
        HttpRequestDef.Builder<DeleteNotebookRequest, DeleteNotebookResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteNotebookRequest.class, DeleteNotebookResponse.class)
                .withName("DeleteNotebook")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/notebooks/{notebook_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteNotebookRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<String>withRequestField("notebook_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteNotebookRequest::getNotebookId, (req, v) -> {
                req.setNotebookId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListNotebookRequest, ListNotebookResponse> listNotebook = genForlistNotebook();

    private static HttpRequestDef<ListNotebookRequest, ListNotebookResponse> genForlistNotebook() {
        // basic
        HttpRequestDef.Builder<ListNotebookRequest, ListNotebookResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListNotebookRequest.class, ListNotebookResponse.class)
                .withName("ListNotebook")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/notebooks")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNotebookRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListNotebookRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNotebookRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListNotebookRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNotebookRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListNotebookToolRequest, ListNotebookToolResponse> listNotebookTool =
        genForlistNotebookTool();

    private static HttpRequestDef<ListNotebookToolRequest, ListNotebookToolResponse> genForlistNotebookTool() {
        // basic
        HttpRequestDef.Builder<ListNotebookToolRequest, ListNotebookToolResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListNotebookToolRequest.class, ListNotebookToolResponse.class)
                .withName("ListNotebookTool")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/notebooks/tools")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNotebookToolRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowNotebookRequest, ShowNotebookResponse> showNotebook = genForshowNotebook();

    private static HttpRequestDef<ShowNotebookRequest, ShowNotebookResponse> genForshowNotebook() {
        // basic
        HttpRequestDef.Builder<ShowNotebookRequest, ShowNotebookResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowNotebookRequest.class, ShowNotebookResponse.class)
                .withName("ShowNotebook")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/notebooks/{notebook_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowNotebookRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<String>withRequestField("notebook_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowNotebookRequest::getNotebookId, (req, v) -> {
                req.setNotebookId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowNotebookTokenRequest, ShowNotebookTokenResponse> showNotebookToken =
        genForshowNotebookToken();

    private static HttpRequestDef<ShowNotebookTokenRequest, ShowNotebookTokenResponse> genForshowNotebookToken() {
        // basic
        HttpRequestDef.Builder<ShowNotebookTokenRequest, ShowNotebookTokenResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowNotebookTokenRequest.class, ShowNotebookTokenResponse.class)
                .withName("ShowNotebookToken")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/notebooks/{notebook_id}/token")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowNotebookTokenRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<String>withRequestField("notebook_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowNotebookTokenRequest::getNotebookId, (req, v) -> {
                req.setNotebookId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StopOrStartNotebookRequest, StopOrStartNotebookResponse> stopOrStartNotebook =
        genForstopOrStartNotebook();

    private static HttpRequestDef<StopOrStartNotebookRequest, StopOrStartNotebookResponse> genForstopOrStartNotebook() {
        // basic
        HttpRequestDef.Builder<StopOrStartNotebookRequest, StopOrStartNotebookResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, StopOrStartNotebookRequest.class, StopOrStartNotebookResponse.class)
                .withName("StopOrStartNotebook")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/notebooks/{notebook_id}/action")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StopOrStartNotebookRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<String>withRequestField("notebook_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StopOrStartNotebookRequest::getNotebookId, (req, v) -> {
                req.setNotebookId(v);
            }));
        builder.<NotebookActionReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(NotebookActionReq.class),
            f -> f.withMarshaller(StopOrStartNotebookRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateNotebookRequest, UpdateNotebookResponse> updateNotebook =
        genForupdateNotebook();

    private static HttpRequestDef<UpdateNotebookRequest, UpdateNotebookResponse> genForupdateNotebook() {
        // basic
        HttpRequestDef.Builder<UpdateNotebookRequest, UpdateNotebookResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateNotebookRequest.class, UpdateNotebookResponse.class)
                .withName("UpdateNotebook")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/notebooks/{notebook_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateNotebookRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<String>withRequestField("notebook_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateNotebookRequest::getNotebookId, (req, v) -> {
                req.setNotebookId(v);
            }));
        builder.<UpdateNotebookReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateNotebookReq.class),
            f -> f.withMarshaller(UpdateNotebookRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListObsBucketRequest, ListObsBucketResponse> listObsBucket =
        genForlistObsBucket();

    private static HttpRequestDef<ListObsBucketRequest, ListObsBucketResponse> genForlistObsBucket() {
        // basic
        HttpRequestDef.Builder<ListObsBucketRequest, ListObsBucketResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListObsBucketRequest.class, ListObsBucketResponse.class)
                .withName("ListObsBucket")
                .withUri("/v1/{project_id}/customer-buckets")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListObsBucketRequest::getType, (req, v) -> {
                req.setType(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListObsBucketObjectRequest, ListObsBucketObjectResponse> listObsBucketObject =
        genForlistObsBucketObject();

    private static HttpRequestDef<ListObsBucketObjectRequest, ListObsBucketObjectResponse> genForlistObsBucketObject() {
        // basic
        HttpRequestDef.Builder<ListObsBucketObjectRequest, ListObsBucketObjectResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListObsBucketObjectRequest.class, ListObsBucketObjectResponse.class)
                .withName("ListObsBucketObject")
                .withUri("/v1/{project_id}/customer-buckets/{bucket_name}/objects")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("bucket_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListObsBucketObjectRequest::getBucketName, (req, v) -> {
                req.setBucketName(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListObsBucketObjectRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListObsBucketObjectRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("path",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListObsBucketObjectRequest::getPath, (req, v) -> {
                req.setPath(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowOverviewRequest, ShowOverviewResponse> showOverview = genForshowOverview();

    private static HttpRequestDef<ShowOverviewRequest, ShowOverviewResponse> genForshowOverview() {
        // basic
        HttpRequestDef.Builder<ShowOverviewRequest, ShowOverviewResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowOverviewRequest.class, ShowOverviewResponse.class)
                .withName("ShowOverview")
                .withUri("/v1/{project_id}/system/overview")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreatePerformanceResourceRequest, CreatePerformanceResourceResponse> createPerformanceResource =
        genForcreatePerformanceResource();

    private static HttpRequestDef<CreatePerformanceResourceRequest, CreatePerformanceResourceResponse> genForcreatePerformanceResource() {
        // basic
        HttpRequestDef.Builder<CreatePerformanceResourceRequest, CreatePerformanceResourceResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreatePerformanceResourceRequest.class,
                    CreatePerformanceResourceResponse.class)
                .withName("CreatePerformanceResource")
                .withUri("/v1/{project_id}/system/performance-resources")
                .withContentType("application/json");

        // requests
        builder.<CreatePerformanceResourceReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CreatePerformanceResourceReq.class),
            f -> f.withMarshaller(CreatePerformanceResourceRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeletePerformanceResourceRequest, DeletePerformanceResourceResponse> deletePerformanceResource =
        genFordeletePerformanceResource();

    private static HttpRequestDef<DeletePerformanceResourceRequest, DeletePerformanceResourceResponse> genFordeletePerformanceResource() {
        // basic
        HttpRequestDef.Builder<DeletePerformanceResourceRequest, DeletePerformanceResourceResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeletePerformanceResourceRequest.class,
                    DeletePerformanceResourceResponse.class)
                .withName("DeletePerformanceResource")
                .withUri("/v1/{project_id}/system/performance-resources/{id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletePerformanceResourceRequest::getId, (req, v) -> {
                req.setId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPerformanceResourcesRequest, ListPerformanceResourcesResponse> listPerformanceResources =
        genForlistPerformanceResources();

    private static HttpRequestDef<ListPerformanceResourcesRequest, ListPerformanceResourcesResponse> genForlistPerformanceResources() {
        // basic
        HttpRequestDef.Builder<ListPerformanceResourcesRequest, ListPerformanceResourcesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ListPerformanceResourcesRequest.class, ListPerformanceResourcesResponse.class)
                .withName("ListPerformanceResources")
                .withUri("/v1/{project_id}/system/performance-resources")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdatePerformanceResourceRequest, UpdatePerformanceResourceResponse> updatePerformanceResource =
        genForupdatePerformanceResource();

    private static HttpRequestDef<UpdatePerformanceResourceRequest, UpdatePerformanceResourceResponse> genForupdatePerformanceResource() {
        // basic
        HttpRequestDef.Builder<UpdatePerformanceResourceRequest, UpdatePerformanceResourceResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdatePerformanceResourceRequest.class,
                    UpdatePerformanceResourceResponse.class)
                .withName("UpdatePerformanceResource")
                .withUri("/v1/{project_id}/system/performance-resources/{id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePerformanceResourceRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<UpdatePerformanceResourceReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdatePerformanceResourceReq.class),
            f -> f.withMarshaller(UpdatePerformanceResourceRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteMemberRequest, BatchDeleteMemberResponse> batchDeleteMember =
        genForbatchDeleteMember();

    private static HttpRequestDef<BatchDeleteMemberRequest, BatchDeleteMemberResponse> genForbatchDeleteMember() {
        // basic
        HttpRequestDef.Builder<BatchDeleteMemberRequest, BatchDeleteMemberResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchDeleteMemberRequest.class, BatchDeleteMemberResponse.class)
                .withName("BatchDeleteMember")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/members/batch-delete")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeleteMemberRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<BatchDeleteMemberReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchDeleteMemberReq.class),
            f -> f.withMarshaller(BatchDeleteMemberRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response
        builder.<List<BatchDeleteMemberRsp>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(BatchDeleteMemberResponse::getBody, (response, data) -> {
                response.setBody(data);
            }).withInnerContainerType(BatchDeleteMemberRsp.class));

        return builder.build();
    }

    public static final HttpRequestDef<CreateProjectRequest, CreateProjectResponse> createProject =
        genForcreateProject();

    private static HttpRequestDef<CreateProjectRequest, CreateProjectResponse> genForcreateProject() {
        // basic
        HttpRequestDef.Builder<CreateProjectRequest, CreateProjectResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateProjectRequest.class, CreateProjectResponse.class)
                .withName("CreateProject")
                .withUri("/v1/{project_id}/eihealth-projects")
                .withContentType("application/json");

        // requests
        builder.<CreateProjectReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateProjectReq.class),
            f -> f.withMarshaller(CreateProjectRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteMemberRequest, DeleteMemberResponse> deleteMember = genFordeleteMember();

    private static HttpRequestDef<DeleteMemberRequest, DeleteMemberResponse> genFordeleteMember() {
        // basic
        HttpRequestDef.Builder<DeleteMemberRequest, DeleteMemberResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteMemberRequest.class, DeleteMemberResponse.class)
                .withName("DeleteMember")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/members/{user_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteMemberRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<String>withRequestField("user_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteMemberRequest::getUserId, (req, v) -> {
                req.setUserId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteProjectRequest, DeleteProjectResponse> deleteProject =
        genFordeleteProject();

    private static HttpRequestDef<DeleteProjectRequest, DeleteProjectResponse> genFordeleteProject() {
        // basic
        HttpRequestDef.Builder<DeleteProjectRequest, DeleteProjectResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteProjectRequest.class, DeleteProjectResponse.class)
                .withName("DeleteProject")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteProjectRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<Boolean>withRequestField("X-Delete-Now",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(DeleteProjectRequest::getXDeleteNow, (req, v) -> {
                req.setXDeleteNow(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListProjectRequest, ListProjectResponse> listProject = genForlistProject();

    private static HttpRequestDef<ListProjectRequest, ListProjectResponse> genForlistProject() {
        // basic
        HttpRequestDef.Builder<ListProjectRequest, ListProjectResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListProjectRequest.class, ListProjectResponse.class)
                .withName("ListProject")
                .withUri("/v1/{project_id}/eihealth-projects")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowProjectRequest, ShowProjectResponse> showProject = genForshowProject();

    private static HttpRequestDef<ShowProjectRequest, ShowProjectResponse> genForshowProject() {
        // basic
        HttpRequestDef.Builder<ShowProjectRequest, ShowProjectResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowProjectRequest.class, ShowProjectResponse.class)
                .withName("ShowProject")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowProjectRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<String>withRequestField("X-Bucket-Name",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowProjectRequest::getXBucketName, (req, v) -> {
                req.setXBucketName(v);
            }));
        builder.<String>withRequestField("X-Namespace-Name",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowProjectRequest::getXNamespaceName, (req, v) -> {
                req.setXNamespaceName(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<TransferProjectRequest, TransferProjectResponse> transferProject =
        genFortransferProject();

    private static HttpRequestDef<TransferProjectRequest, TransferProjectResponse> genFortransferProject() {
        // basic
        HttpRequestDef.Builder<TransferProjectRequest, TransferProjectResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, TransferProjectRequest.class, TransferProjectResponse.class)
                .withName("TransferProject")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/transfer")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(TransferProjectRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<TransferProjectReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(TransferProjectReq.class),
            f -> f.withMarshaller(TransferProjectRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateMemberRequest, UpdateMemberResponse> updateMember = genForupdateMember();

    private static HttpRequestDef<UpdateMemberRequest, UpdateMemberResponse> genForupdateMember() {
        // basic
        HttpRequestDef.Builder<UpdateMemberRequest, UpdateMemberResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateMemberRequest.class, UpdateMemberResponse.class)
                .withName("UpdateMember")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/members/{user_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateMemberRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<String>withRequestField("user_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateMemberRequest::getUserId, (req, v) -> {
                req.setUserId(v);
            }));
        builder.<UpdateMemberReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateMemberReq.class),
            f -> f.withMarshaller(UpdateMemberRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateProjectRequest, UpdateProjectResponse> updateProject =
        genForupdateProject();

    private static HttpRequestDef<UpdateProjectRequest, UpdateProjectResponse> genForupdateProject() {
        // basic
        HttpRequestDef.Builder<UpdateProjectRequest, UpdateProjectResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateProjectRequest.class, UpdateProjectResponse.class)
                .withName("UpdateProject")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateProjectRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<UpdateProjectReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateProjectReq.class),
            f -> f.withMarshaller(UpdateProjectRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DownloadDataTraceRequest, DownloadDataTraceResponse> downloadDataTrace =
        genFordownloadDataTrace();

    private static HttpRequestDef<DownloadDataTraceRequest, DownloadDataTraceResponse> genFordownloadDataTrace() {
        // basic
        HttpRequestDef.Builder<DownloadDataTraceRequest, DownloadDataTraceResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, DownloadDataTraceRequest.class, DownloadDataTraceResponse.class)
                .withName("DownloadDataTrace")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/data-traces")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DownloadDataTraceRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DownloadDataTraceRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowProjectTraceRequest, ShowProjectTraceResponse> showProjectTrace =
        genForshowProjectTrace();

    private static HttpRequestDef<ShowProjectTraceRequest, ShowProjectTraceResponse> genForshowProjectTrace() {
        // basic
        HttpRequestDef.Builder<ShowProjectTraceRequest, ShowProjectTraceResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowProjectTraceRequest.class, ShowProjectTraceResponse.class)
                .withName("ShowProjectTrace")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/project-traces")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowProjectTraceRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<String>withRequestField("path",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowProjectTraceRequest::getPath, (req, v) -> {
                req.setPath(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowProjectTraceRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowProjectTraceRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowProjectTraceDataRequest, ShowProjectTraceDataResponse> showProjectTraceData =
        genForshowProjectTraceData();

    private static HttpRequestDef<ShowProjectTraceDataRequest, ShowProjectTraceDataResponse> genForshowProjectTraceData() {
        // basic
        HttpRequestDef.Builder<ShowProjectTraceDataRequest, ShowProjectTraceDataResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowProjectTraceDataRequest.class, ShowProjectTraceDataResponse.class)
            .withName("ShowProjectTraceData")
            .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/project-traces/{path}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowProjectTraceDataRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<String>withRequestField("path",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowProjectTraceDataRequest::getPath, (req, v) -> {
                req.setPath(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowProjectTrackerRequest, ShowProjectTrackerResponse> showProjectTracker =
        genForshowProjectTracker();

    private static HttpRequestDef<ShowProjectTrackerRequest, ShowProjectTrackerResponse> genForshowProjectTracker() {
        // basic
        HttpRequestDef.Builder<ShowProjectTrackerRequest, ShowProjectTrackerResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowProjectTrackerRequest.class, ShowProjectTrackerResponse.class)
                .withName("ShowProjectTracker")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/project-tracker")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowProjectTrackerRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateProjectTrackerRequest, UpdateProjectTrackerResponse> updateProjectTracker =
        genForupdateProjectTracker();

    private static HttpRequestDef<UpdateProjectTrackerRequest, UpdateProjectTrackerResponse> genForupdateProjectTracker() {
        // basic
        HttpRequestDef.Builder<UpdateProjectTrackerRequest, UpdateProjectTrackerResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateProjectTrackerRequest.class, UpdateProjectTrackerResponse.class)
            .withName("UpdateProjectTracker")
            .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/project-tracker")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateProjectTrackerRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<UpdateTrackerReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateTrackerReq.class),
            f -> f.withMarshaller(UpdateProjectTrackerRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDownloadResourceStatDataRequest, BatchDownloadResourceStatDataResponse> batchDownloadResourceStatData =
        genForbatchDownloadResourceStatData();

    private static HttpRequestDef<BatchDownloadResourceStatDataRequest, BatchDownloadResourceStatDataResponse> genForbatchDownloadResourceStatData() {
        // basic
        HttpRequestDef.Builder<BatchDownloadResourceStatDataRequest, BatchDownloadResourceStatDataResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    BatchDownloadResourceStatDataRequest.class,
                    BatchDownloadResourceStatDataResponse.class)
                .withName("BatchDownloadResourceStatData")
                .withUri("/v1/{project_id}/metric-data/batch-stat-metric-data")
                .withContentType("application/json");

        // requests
        builder.<BatchQueryStatReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchQueryStatReq.class),
            f -> f.withMarshaller(BatchDownloadResourceStatDataRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowResourceMetricDataRequest, ShowResourceMetricDataResponse> showResourceMetricData =
        genForshowResourceMetricData();

    private static HttpRequestDef<ShowResourceMetricDataRequest, ShowResourceMetricDataResponse> genForshowResourceMetricData() {
        // basic
        HttpRequestDef.Builder<ShowResourceMetricDataRequest, ShowResourceMetricDataResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowResourceMetricDataRequest.class, ShowResourceMetricDataResponse.class)
            .withName("ShowResourceMetricData")
            .withUri("/v1/{project_id}/metric-data")
            .withContentType("application/json");

        // requests
        builder.<Long>withRequestField("from_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowResourceMetricDataRequest::getFromTime, (req, v) -> {
                req.setFromTime(v);
            }));
        builder.<Long>withRequestField("to_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowResourceMetricDataRequest::getToTime, (req, v) -> {
                req.setToTime(v);
            }));
        builder.<String>withRequestField("period",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowResourceMetricDataRequest::getPeriod, (req, v) -> {
                req.setPeriod(v);
            }));
        builder.<String>withRequestField("method",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowResourceMetricDataRequest::getMethod, (req, v) -> {
                req.setMethod(v);
            }));
        builder.<String>withRequestField("metric_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowResourceMetricDataRequest::getMetricName, (req, v) -> {
                req.setMetricName(v);
            }));
        builder.<String>withRequestField("resource_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowResourceMetricDataRequest::getResourceId, (req, v) -> {
                req.setResourceId(v);
            }));
        builder.<String>withRequestField("device_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowResourceMetricDataRequest::getDeviceId, (req, v) -> {
                req.setDeviceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteStarRequest, DeleteStarResponse> deleteStar = genFordeleteStar();

    private static HttpRequestDef<DeleteStarRequest, DeleteStarResponse> genFordeleteStar() {
        // basic
        HttpRequestDef.Builder<DeleteStarRequest, DeleteStarResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteStarRequest.class, DeleteStarResponse.class)
                .withName("DeleteStar")
                .withUri("/v1/{project_id}/assets/{asset_id}/stars")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("asset_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteStarRequest::getAssetId, (req, v) -> {
                req.setAssetId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListStarRequest, ListStarResponse> listStar = genForlistStar();

    private static HttpRequestDef<ListStarRequest, ListStarResponse> genForlistStar() {
        // basic
        HttpRequestDef.Builder<ListStarRequest, ListStarResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListStarRequest.class, ListStarResponse.class)
                .withName("ListStar")
                .withUri("/v1/{project_id}/assets/stars")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateStarRequest, UpdateStarResponse> updateStar = genForupdateStar();

    private static HttpRequestDef<UpdateStarRequest, UpdateStarResponse> genForupdateStar() {
        // basic
        HttpRequestDef.Builder<UpdateStarRequest, UpdateStarResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateStarRequest.class, UpdateStarResponse.class)
                .withName("UpdateStar")
                .withUri("/v1/{project_id}/assets/{asset_id}/stars")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("asset_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateStarRequest::getAssetId, (req, v) -> {
                req.setAssetId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListGlobalWorkflowStatisticRequest, ListGlobalWorkflowStatisticResponse> listGlobalWorkflowStatistic =
        genForlistGlobalWorkflowStatistic();

    private static HttpRequestDef<ListGlobalWorkflowStatisticRequest, ListGlobalWorkflowStatisticResponse> genForlistGlobalWorkflowStatistic() {
        // basic
        HttpRequestDef.Builder<ListGlobalWorkflowStatisticRequest, ListGlobalWorkflowStatisticResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListGlobalWorkflowStatisticRequest.class,
                    ListGlobalWorkflowStatisticResponse.class)
                .withName("ListGlobalWorkflowStatistic")
                .withUri("/v1/{project_id}/eihealth-projects/workflow-statistics")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPerformanceResourceStatRequest, ListPerformanceResourceStatResponse> listPerformanceResourceStat =
        genForlistPerformanceResourceStat();

    private static HttpRequestDef<ListPerformanceResourceStatRequest, ListPerformanceResourceStatResponse> genForlistPerformanceResourceStat() {
        // basic
        HttpRequestDef.Builder<ListPerformanceResourceStatRequest, ListPerformanceResourceStatResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListPerformanceResourceStatRequest.class,
                    ListPerformanceResourceStatResponse.class)
                .withName("ListPerformanceResourceStat")
                .withUri("/v1/{project_id}/eihealth-projects/performance-resources-statistics")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPerformanceResourceStatRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPerformanceResourceStatRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListWorkflowStatisticRequest, ListWorkflowStatisticResponse> listWorkflowStatistic =
        genForlistWorkflowStatistic();

    private static HttpRequestDef<ListWorkflowStatisticRequest, ListWorkflowStatisticResponse> genForlistWorkflowStatistic() {
        // basic
        HttpRequestDef.Builder<ListWorkflowStatisticRequest, ListWorkflowStatisticResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListWorkflowStatisticRequest.class, ListWorkflowStatisticResponse.class)
            .withName("ListWorkflowStatistic")
            .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/statistics")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWorkflowStatisticRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListStorageResourcesRequest, ListStorageResourcesResponse> listStorageResources =
        genForlistStorageResources();

    private static HttpRequestDef<ListStorageResourcesRequest, ListStorageResourcesResponse> genForlistStorageResources() {
        // basic
        HttpRequestDef.Builder<ListStorageResourcesRequest, ListStorageResourcesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListStorageResourcesRequest.class, ListStorageResourcesResponse.class)
            .withName("ListStorageResources")
            .withUri("/v1/{project_id}/system/storage-resources")
            .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateStudyRequest, CreateStudyResponse> createStudy = genForcreateStudy();

    private static HttpRequestDef<CreateStudyRequest, CreateStudyResponse> genForcreateStudy() {
        // basic
        HttpRequestDef.Builder<CreateStudyRequest, CreateStudyResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateStudyRequest.class, CreateStudyResponse.class)
                .withName("CreateStudy")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/studies")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateStudyRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<CreateStudyReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateStudyReq.class),
            f -> f.withMarshaller(CreateStudyRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateStudyJobRequest, CreateStudyJobResponse> createStudyJob =
        genForcreateStudyJob();

    private static HttpRequestDef<CreateStudyJobRequest, CreateStudyJobResponse> genForcreateStudyJob() {
        // basic
        HttpRequestDef.Builder<CreateStudyJobRequest, CreateStudyJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateStudyJobRequest.class, CreateStudyJobResponse.class)
                .withName("CreateStudyJob")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/studies/{study_id}/jobs")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateStudyJobRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<String>withRequestField("study_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateStudyJobRequest::getStudyId, (req, v) -> {
                req.setStudyId(v);
            }));
        builder.<CreateStudyJobReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateStudyJobReq.class),
            f -> f.withMarshaller(CreateStudyJobRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteStudyRequest, DeleteStudyResponse> deleteStudy = genFordeleteStudy();

    private static HttpRequestDef<DeleteStudyRequest, DeleteStudyResponse> genFordeleteStudy() {
        // basic
        HttpRequestDef.Builder<DeleteStudyRequest, DeleteStudyResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteStudyRequest.class, DeleteStudyResponse.class)
                .withName("DeleteStudy")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/studies/{study_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteStudyRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<String>withRequestField("study_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteStudyRequest::getStudyId, (req, v) -> {
                req.setStudyId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListStudyRequest, ListStudyResponse> listStudy = genForlistStudy();

    private static HttpRequestDef<ListStudyRequest, ListStudyResponse> genForlistStudy() {
        // basic
        HttpRequestDef.Builder<ListStudyRequest, ListStudyResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListStudyRequest.class, ListStudyResponse.class)
                .withName("ListStudy")
                .withUri("/v1/{project_id}/studies")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListStudyJobRequest, ListStudyJobResponse> listStudyJob = genForlistStudyJob();

    private static HttpRequestDef<ListStudyJobRequest, ListStudyJobResponse> genForlistStudyJob() {
        // basic
        HttpRequestDef.Builder<ListStudyJobRequest, ListStudyJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListStudyJobRequest.class, ListStudyJobResponse.class)
                .withName("ListStudyJob")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/studies/{study_id}/jobs")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStudyJobRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<String>withRequestField("study_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStudyJobRequest::getStudyId, (req, v) -> {
                req.setStudyId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<Show3dStructureContentRequest, Show3dStructureContentResponse> show3dStructureContent =
        genForshow3dStructureContent();

    private static HttpRequestDef<Show3dStructureContentRequest, Show3dStructureContentResponse> genForshow3dStructureContent() {
        // basic
        HttpRequestDef.Builder<Show3dStructureContentRequest, Show3dStructureContentResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, Show3dStructureContentRequest.class, Show3dStructureContentResponse.class)
            .withName("Show3dStructureContent")
            .withUri(
                "/v1/{project_id}/eihealth-projects/{eihealth_project_id}/studies/{study_id}/jobs/{job_id}/3d-structure")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(Show3dStructureContentRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<String>withRequestField("study_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(Show3dStructureContentRequest::getStudyId, (req, v) -> {
                req.setStudyId(v);
            }));
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(Show3dStructureContentRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));
        builder.<String>withRequestField("ligand",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(Show3dStructureContentRequest::getLigand, (req, v) -> {
                req.setLigand(v);
            }));
        builder.<String>withRequestField("receptor",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(Show3dStructureContentRequest::getReceptor, (req, v) -> {
                req.setReceptor(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowExtremumInfoRequest, ShowExtremumInfoResponse> showExtremumInfo =
        genForshowExtremumInfo();

    private static HttpRequestDef<ShowExtremumInfoRequest, ShowExtremumInfoResponse> genForshowExtremumInfo() {
        // basic
        HttpRequestDef.Builder<ShowExtremumInfoRequest, ShowExtremumInfoResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowExtremumInfoRequest.class, ShowExtremumInfoResponse.class)
            .withName("ShowExtremumInfo")
            .withUri(
                "/v1/{project_id}/eihealth-projects/{eihealth_project_id}/studies/{study_id}/jobs/{job_id}/extremum")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowExtremumInfoRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<String>withRequestField("study_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowExtremumInfoRequest::getStudyId, (req, v) -> {
                req.setStudyId(v);
            }));
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowExtremumInfoRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListArchiveConfigsRequest, ListArchiveConfigsResponse> listArchiveConfigs =
        genForlistArchiveConfigs();

    private static HttpRequestDef<ListArchiveConfigsRequest, ListArchiveConfigsResponse> genForlistArchiveConfigs() {
        // basic
        HttpRequestDef.Builder<ListArchiveConfigsRequest, ListArchiveConfigsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListArchiveConfigsRequest.class, ListArchiveConfigsResponse.class)
                .withName("ListArchiveConfigs")
                .withUri("/v1/{project_id}/system/archive-configs")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowEnvRequest, ShowEnvResponse> showEnv = genForshowEnv();

    private static HttpRequestDef<ShowEnvRequest, ShowEnvResponse> genForshowEnv() {
        // basic
        HttpRequestDef.Builder<ShowEnvRequest, ShowEnvResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowEnvRequest.class, ShowEnvResponse.class)
                .withName("ShowEnv")
                .withUri("/v1/{project_id}/system/configs")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowVendorRequest, ShowVendorResponse> showVendor = genForshowVendor();

    private static HttpRequestDef<ShowVendorRequest, ShowVendorResponse> genForshowVendor() {
        // basic
        HttpRequestDef.Builder<ShowVendorRequest, ShowVendorResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowVendorRequest.class, ShowVendorResponse.class)
                .withName("ShowVendor")
                .withUri("/v1/{project_id}/system/vendor-config")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateArchiveConfigRequest, UpdateArchiveConfigResponse> updateArchiveConfig =
        genForupdateArchiveConfig();

    private static HttpRequestDef<UpdateArchiveConfigRequest, UpdateArchiveConfigResponse> genForupdateArchiveConfig() {
        // basic
        HttpRequestDef.Builder<UpdateArchiveConfigRequest, UpdateArchiveConfigResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateArchiveConfigRequest.class, UpdateArchiveConfigResponse.class)
                .withName("UpdateArchiveConfig")
                .withUri("/v1/{project_id}/system/archive-configs/{region_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("region_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateArchiveConfigRequest::getRegionId, (req, v) -> {
                req.setRegionId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateVendorRequest, UpdateVendorResponse> updateVendor = genForupdateVendor();

    private static HttpRequestDef<UpdateVendorRequest, UpdateVendorResponse> genForupdateVendor() {
        // basic
        HttpRequestDef.Builder<UpdateVendorRequest, UpdateVendorResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateVendorRequest.class, UpdateVendorResponse.class)
                .withName("UpdateVendor")
                .withUri("/v1/{project_id}/system/vendor-config")
                .withContentType("multipart/form-data");

        // requests
        builder.<UpdateVendorRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateVendorRequestBody.class),
            f -> f.withMarshaller(UpdateVendorRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListQuotaRequest, ListQuotaResponse> listQuota = genForlistQuota();

    private static HttpRequestDef<ListQuotaRequest, ListQuotaResponse> genForlistQuota() {
        // basic
        HttpRequestDef.Builder<ListQuotaRequest, ListQuotaResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListQuotaRequest.class, ListQuotaResponse.class)
                .withName("ListQuota")
                .withUri("/v1/{project_id}/quotas")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateTemplateRequest, CreateTemplateResponse> createTemplate =
        genForcreateTemplate();

    private static HttpRequestDef<CreateTemplateRequest, CreateTemplateResponse> genForcreateTemplate() {
        // basic
        HttpRequestDef.Builder<CreateTemplateRequest, CreateTemplateResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateTemplateRequest.class, CreateTemplateResponse.class)
                .withName("CreateTemplate")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/templates")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateTemplateRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<CreateTemplateReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateTemplateReq.class),
            f -> f.withMarshaller(CreateTemplateRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteTemplateRequest, DeleteTemplateResponse> deleteTemplate =
        genFordeleteTemplate();

    private static HttpRequestDef<DeleteTemplateRequest, DeleteTemplateResponse> genFordeleteTemplate() {
        // basic
        HttpRequestDef.Builder<DeleteTemplateRequest, DeleteTemplateResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteTemplateRequest.class, DeleteTemplateResponse.class)
                .withName("DeleteTemplate")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/templates/{template_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTemplateRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<String>withRequestField("template_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTemplateRequest::getTemplateId, (req, v) -> {
                req.setTemplateId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ImportTemplateRequest, ImportTemplateResponse> importTemplate =
        genForimportTemplate();

    private static HttpRequestDef<ImportTemplateRequest, ImportTemplateResponse> genForimportTemplate() {
        // basic
        HttpRequestDef.Builder<ImportTemplateRequest, ImportTemplateResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ImportTemplateRequest.class, ImportTemplateResponse.class)
                .withName("ImportTemplate")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/templates/batch-import")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ImportTemplateRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<ImportTemplateReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ImportTemplateReq.class),
            f -> f.withMarshaller(ImportTemplateRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response
        builder.<List<ImportTemplateResultRsp>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ImportTemplateResponse::getBody, (response, data) -> {
                response.setBody(data);
            }).withInnerContainerType(ImportTemplateResultRsp.class));

        return builder.build();
    }

    public static final HttpRequestDef<ListTemplateRequest, ListTemplateResponse> listTemplate = genForlistTemplate();

    private static HttpRequestDef<ListTemplateRequest, ListTemplateResponse> genForlistTemplate() {
        // basic
        HttpRequestDef.Builder<ListTemplateRequest, ListTemplateResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListTemplateRequest.class, ListTemplateResponse.class)
                .withName("ListTemplate")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/templates")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTemplateRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTemplateRequest, ShowTemplateResponse> showTemplate = genForshowTemplate();

    private static HttpRequestDef<ShowTemplateRequest, ShowTemplateResponse> genForshowTemplate() {
        // basic
        HttpRequestDef.Builder<ShowTemplateRequest, ShowTemplateResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowTemplateRequest.class, ShowTemplateResponse.class)
                .withName("ShowTemplate")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/templates/{template_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTemplateRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<String>withRequestField("template_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTemplateRequest::getTemplateId, (req, v) -> {
                req.setTemplateId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UploadTemplateRequest, UploadTemplateResponse> uploadTemplate =
        genForuploadTemplate();

    private static HttpRequestDef<UploadTemplateRequest, UploadTemplateResponse> genForuploadTemplate() {
        // basic
        HttpRequestDef.Builder<UploadTemplateRequest, UploadTemplateResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UploadTemplateRequest.class, UploadTemplateResponse.class)
                .withName("UploadTemplate")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/templates/upload")
                .withContentType("multipart/form-data");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UploadTemplateRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<UploadTemplateRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UploadTemplateRequestBody.class),
            f -> f.withMarshaller(UploadTemplateRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ChangePasswordRequest, ChangePasswordResponse> changePassword =
        genForchangePassword();

    private static HttpRequestDef<ChangePasswordRequest, ChangePasswordResponse> genForchangePassword() {
        // basic
        HttpRequestDef.Builder<ChangePasswordRequest, ChangePasswordResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ChangePasswordRequest.class, ChangePasswordResponse.class)
                .withName("ChangePassword")
                .withUri("/v1/{project_id}/users/{user_id}/password")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("user_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ChangePasswordRequest::getUserId, (req, v) -> {
                req.setUserId(v);
            }));
        builder.<ChangePasswordReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ChangePasswordReq.class),
            f -> f.withMarshaller(ChangePasswordRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CheckTokenVerificationRequest, CheckTokenVerificationResponse> checkTokenVerification =
        genForcheckTokenVerification();

    private static HttpRequestDef<CheckTokenVerificationRequest, CheckTokenVerificationResponse> genForcheckTokenVerification() {
        // basic
        HttpRequestDef.Builder<CheckTokenVerificationRequest, CheckTokenVerificationResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, CheckTokenVerificationRequest.class, CheckTokenVerificationResponse.class)
            .withName("CheckTokenVerification")
            .withUri("/v1/{project_id}/users/token-verification")
            .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateCodeRequest, CreateCodeResponse> createCode = genForcreateCode();

    private static HttpRequestDef<CreateCodeRequest, CreateCodeResponse> genForcreateCode() {
        // basic
        HttpRequestDef.Builder<CreateCodeRequest, CreateCodeResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateCodeRequest.class, CreateCodeResponse.class)
                .withName("CreateCode")
                .withUri("/v1/{project_id}/users/{user_id}/verification-code")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("user_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateCodeRequest::getUserId, (req, v) -> {
                req.setUserId(v);
            }));
        builder.<SendCodeReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SendCodeReq.class),
            f -> f.withMarshaller(CreateCodeRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateUserRequest, CreateUserResponse> createUser = genForcreateUser();

    private static HttpRequestDef<CreateUserRequest, CreateUserResponse> genForcreateUser() {
        // basic
        HttpRequestDef.Builder<CreateUserRequest, CreateUserResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateUserRequest.class, CreateUserResponse.class)
                .withName("CreateUser")
                .withUri("/v1/{project_id}/users")
                .withContentType("application/json");

        // requests
        builder.<CreateUserReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateUserReq.class),
            f -> f.withMarshaller(CreateUserRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteUserRequest, DeleteUserResponse> deleteUser = genFordeleteUser();

    private static HttpRequestDef<DeleteUserRequest, DeleteUserResponse> genFordeleteUser() {
        // basic
        HttpRequestDef.Builder<DeleteUserRequest, DeleteUserResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteUserRequest.class, DeleteUserResponse.class)
                .withName("DeleteUser")
                .withUri("/v1/{project_id}/users/{user_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("user_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteUserRequest::getUserId, (req, v) -> {
                req.setUserId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ImportUserRequest, ImportUserResponse> importUser = genForimportUser();

    private static HttpRequestDef<ImportUserRequest, ImportUserResponse> genForimportUser() {
        // basic
        HttpRequestDef.Builder<ImportUserRequest, ImportUserResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ImportUserRequest.class, ImportUserResponse.class)
                .withName("ImportUser")
                .withUri("/v1/{project_id}/users/import")
                .withContentType("application/json");

        // requests
        builder.<ImportUserReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ImportUserReq.class),
            f -> f.withMarshaller(ImportUserRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response
        builder.<List<UserIdRsp>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ImportUserResponse::getBody, (response, data) -> {
                response.setBody(data);
            }).withInnerContainerType(UserIdRsp.class));

        return builder.build();
    }

    public static final HttpRequestDef<ListMfaRequest, ListMfaResponse> listMfa = genForlistMfa();

    private static HttpRequestDef<ListMfaRequest, ListMfaResponse> genForlistMfa() {
        // basic
        HttpRequestDef.Builder<ListMfaRequest, ListMfaResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListMfaRequest.class, ListMfaResponse.class)
                .withName("ListMfa")
                .withUri("/v1/{project_id}/users/{user_id}/mfa/methods")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("user_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMfaRequest::getUserId, (req, v) -> {
                req.setUserId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListUserRequest, ListUserResponse> listUser = genForlistUser();

    private static HttpRequestDef<ListUserRequest, ListUserResponse> genForlistUser() {
        // basic
        HttpRequestDef.Builder<ListUserRequest, ListUserResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListUserRequest.class, ListUserResponse.class)
                .withName("ListUser")
                .withUri("/v1/{project_id}/users")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowUserRequest, ShowUserResponse> showUser = genForshowUser();

    private static HttpRequestDef<ShowUserRequest, ShowUserResponse> genForshowUser() {
        // basic
        HttpRequestDef.Builder<ShowUserRequest, ShowUserResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowUserRequest.class, ShowUserResponse.class)
                .withName("ShowUser")
                .withUri("/v1/{project_id}/users/{user_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("user_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowUserRequest::getUserId, (req, v) -> {
                req.setUserId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowUserSettingRequest, ShowUserSettingResponse> showUserSetting =
        genForshowUserSetting();

    private static HttpRequestDef<ShowUserSettingRequest, ShowUserSettingResponse> genForshowUserSetting() {
        // basic
        HttpRequestDef.Builder<ShowUserSettingRequest, ShowUserSettingResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowUserSettingRequest.class, ShowUserSettingResponse.class)
                .withName("ShowUserSetting")
                .withUri("/v1/{project_id}/users/{user_id}/settings")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("user_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowUserSettingRequest::getUserId, (req, v) -> {
                req.setUserId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateInitPasswordRequest, UpdateInitPasswordResponse> updateInitPassword =
        genForupdateInitPassword();

    private static HttpRequestDef<UpdateInitPasswordRequest, UpdateInitPasswordResponse> genForupdateInitPassword() {
        // basic
        HttpRequestDef.Builder<UpdateInitPasswordRequest, UpdateInitPasswordResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateInitPasswordRequest.class, UpdateInitPasswordResponse.class)
                .withName("UpdateInitPassword")
                .withUri("/v1/{project_id}/users/{user_id}/init-password")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("user_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateInitPasswordRequest::getUserId, (req, v) -> {
                req.setUserId(v);
            }));
        builder.<ResetPasswordReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ResetPasswordReq.class),
            f -> f.withMarshaller(UpdateInitPasswordRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateUserRequest, UpdateUserResponse> updateUser = genForupdateUser();

    private static HttpRequestDef<UpdateUserRequest, UpdateUserResponse> genForupdateUser() {
        // basic
        HttpRequestDef.Builder<UpdateUserRequest, UpdateUserResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateUserRequest.class, UpdateUserResponse.class)
                .withName("UpdateUser")
                .withUri("/v1/{project_id}/users/{user_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("user_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateUserRequest::getUserId, (req, v) -> {
                req.setUserId(v);
            }));
        builder.<UpdateUserReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateUserReq.class),
            f -> f.withMarshaller(UpdateUserRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateUserByDomainRequest, UpdateUserByDomainResponse> updateUserByDomain =
        genForupdateUserByDomain();

    private static HttpRequestDef<UpdateUserByDomainRequest, UpdateUserByDomainResponse> genForupdateUserByDomain() {
        // basic
        HttpRequestDef.Builder<UpdateUserByDomainRequest, UpdateUserByDomainResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateUserByDomainRequest.class, UpdateUserByDomainResponse.class)
                .withName("UpdateUserByDomain")
                .withUri("/v1/{project_id}/users/{user_id}/domain-change-info")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("user_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateUserByDomainRequest::getUserId, (req, v) -> {
                req.setUserId(v);
            }));
        builder.<UpdateUserByDomainReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateUserByDomainReq.class),
            f -> f.withMarshaller(UpdateUserByDomainRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateUserRoleRequest, UpdateUserRoleResponse> updateUserRole =
        genForupdateUserRole();

    private static HttpRequestDef<UpdateUserRoleRequest, UpdateUserRoleResponse> genForupdateUserRole() {
        // basic
        HttpRequestDef.Builder<UpdateUserRoleRequest, UpdateUserRoleResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateUserRoleRequest.class, UpdateUserRoleResponse.class)
                .withName("UpdateUserRole")
                .withUri("/v1/{project_id}/users/{user_id}/role")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("user_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateUserRoleRequest::getUserId, (req, v) -> {
                req.setUserId(v);
            }));
        builder.<UpdateUserRoleReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateUserRoleReq.class),
            f -> f.withMarshaller(UpdateUserRoleRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateUserSettingRequest, UpdateUserSettingResponse> updateUserSetting =
        genForupdateUserSetting();

    private static HttpRequestDef<UpdateUserSettingRequest, UpdateUserSettingResponse> genForupdateUserSetting() {
        // basic
        HttpRequestDef.Builder<UpdateUserSettingRequest, UpdateUserSettingResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateUserSettingRequest.class, UpdateUserSettingResponse.class)
                .withName("UpdateUserSetting")
                .withUri("/v1/{project_id}/users/{user_id}/settings")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("user_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateUserSettingRequest::getUserId, (req, v) -> {
                req.setUserId(v);
            }));
        builder.<UpdateUserSettingReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateUserSettingReq.class),
            f -> f.withMarshaller(UpdateUserSettingRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ValidateCodeRequest, ValidateCodeResponse> validateCode = genForvalidateCode();

    private static HttpRequestDef<ValidateCodeRequest, ValidateCodeResponse> genForvalidateCode() {
        // basic
        HttpRequestDef.Builder<ValidateCodeRequest, ValidateCodeResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ValidateCodeRequest.class, ValidateCodeResponse.class)
                .withName("ValidateCode")
                .withUri("/v1/{project_id}/users/{user_id}/code-verify")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("user_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ValidateCodeRequest::getUserId, (req, v) -> {
                req.setUserId(v);
            }));
        builder.<CodeVerifyReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CodeVerifyReq.class),
            f -> f.withMarshaller(ValidateCodeRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListVendorRequest, ListVendorResponse> listVendor = genForlistVendor();

    private static HttpRequestDef<ListVendorRequest, ListVendorResponse> genForlistVendor() {
        // basic
        HttpRequestDef.Builder<ListVendorRequest, ListVendorResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListVendorRequest.class, ListVendorResponse.class)
                .withName("ListVendor")
                .withUri("/v1/{project_id}/vendors")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateWorkflowRequest, CreateWorkflowResponse> createWorkflow =
        genForcreateWorkflow();

    private static HttpRequestDef<CreateWorkflowRequest, CreateWorkflowResponse> genForcreateWorkflow() {
        // basic
        HttpRequestDef.Builder<CreateWorkflowRequest, CreateWorkflowResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateWorkflowRequest.class, CreateWorkflowResponse.class)
                .withName("CreateWorkflow")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/workflows")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateWorkflowRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<WorkflowDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(WorkflowDto.class),
            f -> f.withMarshaller(CreateWorkflowRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteWorkflowRequest, DeleteWorkflowResponse> deleteWorkflow =
        genFordeleteWorkflow();

    private static HttpRequestDef<DeleteWorkflowRequest, DeleteWorkflowResponse> genFordeleteWorkflow() {
        // basic
        HttpRequestDef.Builder<DeleteWorkflowRequest, DeleteWorkflowResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteWorkflowRequest.class, DeleteWorkflowResponse.class)
                .withName("DeleteWorkflow")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/workflows/{workflow_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteWorkflowRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<String>withRequestField("workflow_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteWorkflowRequest::getWorkflowId, (req, v) -> {
                req.setWorkflowId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ImportWorkflowRequest, ImportWorkflowResponse> importWorkflow =
        genForimportWorkflow();

    private static HttpRequestDef<ImportWorkflowRequest, ImportWorkflowResponse> genForimportWorkflow() {
        // basic
        HttpRequestDef.Builder<ImportWorkflowRequest, ImportWorkflowResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ImportWorkflowRequest.class, ImportWorkflowResponse.class)
                .withName("ImportWorkflow")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/workflows/import")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ImportWorkflowRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<ImportWorkflowReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ImportWorkflowReq.class),
            f -> f.withMarshaller(ImportWorkflowRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListWorkflowRequest, ListWorkflowResponse> listWorkflow = genForlistWorkflow();

    private static HttpRequestDef<ListWorkflowRequest, ListWorkflowResponse> genForlistWorkflow() {
        // basic
        HttpRequestDef.Builder<ListWorkflowRequest, ListWorkflowResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListWorkflowRequest.class, ListWorkflowResponse.class)
                .withName("ListWorkflow")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/workflows")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWorkflowRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWorkflowRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<String>withRequestField("version",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWorkflowRequest::getVersion, (req, v) -> {
                req.setVersion(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<PublishWorkflowRequest, PublishWorkflowResponse> publishWorkflow =
        genForpublishWorkflow();

    private static HttpRequestDef<PublishWorkflowRequest, PublishWorkflowResponse> genForpublishWorkflow() {
        // basic
        HttpRequestDef.Builder<PublishWorkflowRequest, PublishWorkflowResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, PublishWorkflowRequest.class, PublishWorkflowResponse.class)
                .withName("PublishWorkflow")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/workflows/{workflow_id}/publish")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(PublishWorkflowRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<String>withRequestField("workflow_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(PublishWorkflowRequest::getWorkflowId, (req, v) -> {
                req.setWorkflowId(v);
            }));
        builder.<PublishWorkflowReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PublishWorkflowReq.class),
            f -> f.withMarshaller(PublishWorkflowRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowWorkflowRequest, ShowWorkflowResponse> showWorkflow = genForshowWorkflow();

    private static HttpRequestDef<ShowWorkflowRequest, ShowWorkflowResponse> genForshowWorkflow() {
        // basic
        HttpRequestDef.Builder<ShowWorkflowRequest, ShowWorkflowResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowWorkflowRequest.class, ShowWorkflowResponse.class)
                .withName("ShowWorkflow")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/workflows/{workflow_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowWorkflowRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<String>withRequestField("workflow_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowWorkflowRequest::getWorkflowId, (req, v) -> {
                req.setWorkflowId(v);
            }));
        builder.<Boolean>withRequestField("Show-Param-Detail",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ShowWorkflowRequest::getShowParamDetail, (req, v) -> {
                req.setShowParamDetail(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SubscribeWorkflowRequest, SubscribeWorkflowResponse> subscribeWorkflow =
        genForsubscribeWorkflow();

    private static HttpRequestDef<SubscribeWorkflowRequest, SubscribeWorkflowResponse> genForsubscribeWorkflow() {
        // basic
        HttpRequestDef.Builder<SubscribeWorkflowRequest, SubscribeWorkflowResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, SubscribeWorkflowRequest.class, SubscribeWorkflowResponse.class)
                .withName("SubscribeWorkflow")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/workflows/subscribe")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SubscribeWorkflowRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<SubscribeWorkflowReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SubscribeWorkflowReq.class),
            f -> f.withMarshaller(SubscribeWorkflowRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateWorkflowRequest, UpdateWorkflowResponse> updateWorkflow =
        genForupdateWorkflow();

    private static HttpRequestDef<UpdateWorkflowRequest, UpdateWorkflowResponse> genForupdateWorkflow() {
        // basic
        HttpRequestDef.Builder<UpdateWorkflowRequest, UpdateWorkflowResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateWorkflowRequest.class, UpdateWorkflowResponse.class)
                .withName("UpdateWorkflow")
                .withUri("/v1/{project_id}/eihealth-projects/{eihealth_project_id}/workflows/{workflow_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eihealth_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateWorkflowRequest::getEihealthProjectId, (req, v) -> {
                req.setEihealthProjectId(v);
            }));
        builder.<String>withRequestField("workflow_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateWorkflowRequest::getWorkflowId, (req, v) -> {
                req.setWorkflowId(v);
            }));
        builder.<WorkflowDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(WorkflowDto.class),
            f -> f.withMarshaller(UpdateWorkflowRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateOptimizationTaskRequest, CreateOptimizationTaskResponse> createOptimizationTask =
        genForcreateOptimizationTask();

    private static HttpRequestDef<CreateOptimizationTaskRequest, CreateOptimizationTaskResponse> genForcreateOptimizationTask() {
        // basic
        HttpRequestDef.Builder<CreateOptimizationTaskRequest, CreateOptimizationTaskResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateOptimizationTaskRequest.class, CreateOptimizationTaskResponse.class)
            .withName("CreateOptimizationTask")
            .withUri("/v1/{project_id}/task/optimization")
            .withContentType("application/json");

        // requests
        builder.<OptimizationTaskData>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(OptimizationTaskData.class),
            f -> f.withMarshaller(CreateOptimizationTaskRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateOptimizationTaskResponse::getBody, (response, data) -> {
                response.setBody(data);
            }));

        return builder.build();
    }

    public static final HttpRequestDef<ShowOptimizationTaskResultRequest, ShowOptimizationTaskResultResponse> showOptimizationTaskResult =
        genForshowOptimizationTaskResult();

    private static HttpRequestDef<ShowOptimizationTaskResultRequest, ShowOptimizationTaskResultResponse> genForshowOptimizationTaskResult() {
        // basic
        HttpRequestDef.Builder<ShowOptimizationTaskResultRequest, ShowOptimizationTaskResultResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowOptimizationTaskResultRequest.class,
                    ShowOptimizationTaskResultResponse.class)
                .withName("ShowOptimizationTaskResult")
                .withUri("/v1/{project_id}/task/optimization/{task_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowOptimizationTaskResultRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateSearchTaskRequest, CreateSearchTaskResponse> createSearchTask =
        genForcreateSearchTask();

    private static HttpRequestDef<CreateSearchTaskRequest, CreateSearchTaskResponse> genForcreateSearchTask() {
        // basic
        HttpRequestDef.Builder<CreateSearchTaskRequest, CreateSearchTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateSearchTaskRequest.class, CreateSearchTaskResponse.class)
                .withName("CreateSearchTask")
                .withUri("/v1/{project_id}/task/search")
                .withContentType("application/json");

        // requests
        builder.<SearchTaskData>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SearchTaskData.class),
            f -> f.withMarshaller(CreateSearchTaskRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateSearchTaskResponse::getBody, (response, data) -> {
                response.setBody(data);
            }));

        return builder.build();
    }

    public static final HttpRequestDef<ShowSearchTaskResultRequest, ShowSearchTaskResultResponse> showSearchTaskResult =
        genForshowSearchTaskResult();

    private static HttpRequestDef<ShowSearchTaskResultRequest, ShowSearchTaskResultResponse> genForshowSearchTaskResult() {
        // basic
        HttpRequestDef.Builder<ShowSearchTaskResultRequest, ShowSearchTaskResultResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowSearchTaskResultRequest.class, ShowSearchTaskResultResponse.class)
            .withName("ShowSearchTaskResult")
            .withUri("/v1/{project_id}/task/search/{task_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSearchTaskResultRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            }));

        // response

        return builder.build();
    }

}
