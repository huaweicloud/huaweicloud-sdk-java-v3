package com.huaweicloud.sdk.iotedge.v3;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.iotedge.v3.model.CreateAppInstanceRequest;
import com.huaweicloud.sdk.iotedge.v3.model.CreateAppInstanceRequestDTO;
import com.huaweicloud.sdk.iotedge.v3.model.CreateAppInstanceResponse;
import com.huaweicloud.sdk.iotedge.v3.model.CreateAppRequest;
import com.huaweicloud.sdk.iotedge.v3.model.CreateAppRequestDTO;
import com.huaweicloud.sdk.iotedge.v3.model.CreateAppResponse;
import com.huaweicloud.sdk.iotedge.v3.model.CreateAppVersionRequest;
import com.huaweicloud.sdk.iotedge.v3.model.CreateAppVersionRequestBody;
import com.huaweicloud.sdk.iotedge.v3.model.CreateAppVersionResponse;
import com.huaweicloud.sdk.iotedge.v3.model.CreateClusterInstallCmdRequest;
import com.huaweicloud.sdk.iotedge.v3.model.CreateClusterInstallCmdResponse;
import com.huaweicloud.sdk.iotedge.v3.model.CreateClusterRequest;
import com.huaweicloud.sdk.iotedge.v3.model.CreateClusterRequestDTO;
import com.huaweicloud.sdk.iotedge.v3.model.CreateClusterResponse;
import com.huaweicloud.sdk.iotedge.v3.model.DeleteAppInstanceRequest;
import com.huaweicloud.sdk.iotedge.v3.model.DeleteAppInstanceResponse;
import com.huaweicloud.sdk.iotedge.v3.model.DeleteAppRequest;
import com.huaweicloud.sdk.iotedge.v3.model.DeleteAppResponse;
import com.huaweicloud.sdk.iotedge.v3.model.DeleteAppVersionRequest;
import com.huaweicloud.sdk.iotedge.v3.model.DeleteAppVersionResponse;
import com.huaweicloud.sdk.iotedge.v3.model.DeleteClusterRequest;
import com.huaweicloud.sdk.iotedge.v3.model.DeleteClusterResponse;
import com.huaweicloud.sdk.iotedge.v3.model.DownloadAppVersionRequest;
import com.huaweicloud.sdk.iotedge.v3.model.DownloadAppVersionResponse;
import com.huaweicloud.sdk.iotedge.v3.model.ListAppImageRequest;
import com.huaweicloud.sdk.iotedge.v3.model.ListAppImageResponse;
import com.huaweicloud.sdk.iotedge.v3.model.ListAppInstanceHistoryRequest;
import com.huaweicloud.sdk.iotedge.v3.model.ListAppInstanceHistoryResponse;
import com.huaweicloud.sdk.iotedge.v3.model.ListAppInstancesRequest;
import com.huaweicloud.sdk.iotedge.v3.model.ListAppInstancesResponse;
import com.huaweicloud.sdk.iotedge.v3.model.ListAppVersionsRequest;
import com.huaweicloud.sdk.iotedge.v3.model.ListAppVersionsResponse;
import com.huaweicloud.sdk.iotedge.v3.model.ListAppsRequest;
import com.huaweicloud.sdk.iotedge.v3.model.ListAppsResponse;
import com.huaweicloud.sdk.iotedge.v3.model.ListClustersRequest;
import com.huaweicloud.sdk.iotedge.v3.model.ListClustersResponse;
import com.huaweicloud.sdk.iotedge.v3.model.ShowAppRequest;
import com.huaweicloud.sdk.iotedge.v3.model.ShowAppResponse;
import com.huaweicloud.sdk.iotedge.v3.model.ShowAppVersionRequest;
import com.huaweicloud.sdk.iotedge.v3.model.ShowAppVersionResponse;
import com.huaweicloud.sdk.iotedge.v3.model.ShowClusterRequest;
import com.huaweicloud.sdk.iotedge.v3.model.ShowClusterResponse;
import com.huaweicloud.sdk.iotedge.v3.model.UpdateAppInstanceRequest;
import com.huaweicloud.sdk.iotedge.v3.model.UpdateAppInstanceRequestDTO;
import com.huaweicloud.sdk.iotedge.v3.model.UpdateAppInstanceResponse;

@SuppressWarnings("unchecked")
public class IoTEdgeMeta {

    public static final HttpRequestDef<CreateAppRequest, CreateAppResponse> createApp = genForcreateApp();

    private static HttpRequestDef<CreateAppRequest, CreateAppResponse> genForcreateApp() {
        // basic
        HttpRequestDef.Builder<CreateAppRequest, CreateAppResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateAppRequest.class, CreateAppResponse.class)
                .withName("CreateApp")
                .withUri("/v3/{project_id}/apps")
                .withContentType("application/json");

        // requests
        builder.<CreateAppRequestDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateAppRequestDTO.class),
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
                .withUri("/v3/{project_id}/apps/{app_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("app_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAppRequest::getAppId, (req, v) -> {
                req.setAppId(v);
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

    public static final HttpRequestDef<ListAppsRequest, ListAppsResponse> listApps = genForlistApps();

    private static HttpRequestDef<ListAppsRequest, ListAppsResponse> genForlistApps() {
        // basic
        HttpRequestDef.Builder<ListAppsRequest, ListAppsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAppsRequest.class, ListAppsResponse.class)
                .withName("ListApps")
                .withUri("/v3/{project_id}/apps")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("app_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppsRequest::getAppType, (req, v) -> {
                req.setAppType(v);
            }));
        builder.<String>withRequestField("provider_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppsRequest::getProviderType, (req, v) -> {
                req.setProviderType(v);
            }));
        builder.<String>withRequestField("app_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppsRequest::getAppId, (req, v) -> {
                req.setAppId(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAppsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAppsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
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
                .withUri("/v3/{project_id}/apps/{app_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("app_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAppRequest::getAppId, (req, v) -> {
                req.setAppId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateAppInstanceRequest, CreateAppInstanceResponse> createAppInstance =
        genForcreateAppInstance();

    private static HttpRequestDef<CreateAppInstanceRequest, CreateAppInstanceResponse> genForcreateAppInstance() {
        // basic
        HttpRequestDef.Builder<CreateAppInstanceRequest, CreateAppInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateAppInstanceRequest.class, CreateAppInstanceResponse.class)
                .withName("CreateAppInstance")
                .withUri("/v3/{project_id}/clusters/{cluster_id}/app-instances")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateAppInstanceRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));
        builder.<CreateAppInstanceRequestDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateAppInstanceRequestDTO.class),
            f -> f.withMarshaller(CreateAppInstanceRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteAppInstanceRequest, DeleteAppInstanceResponse> deleteAppInstance =
        genFordeleteAppInstance();

    private static HttpRequestDef<DeleteAppInstanceRequest, DeleteAppInstanceResponse> genFordeleteAppInstance() {
        // basic
        HttpRequestDef.Builder<DeleteAppInstanceRequest, DeleteAppInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteAppInstanceRequest.class, DeleteAppInstanceResponse.class)
                .withName("DeleteAppInstance")
                .withUri("/v3/{project_id}/clusters/{cluster_id}/app-instances/{app_instance_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAppInstanceRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));
        builder.<String>withRequestField("app_instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAppInstanceRequest::getAppInstanceId, (req, v) -> {
                req.setAppInstanceId(v);
            }));
        builder.<String>withRequestField("namespace",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAppInstanceRequest::getNamespace, (req, v) -> {
                req.setNamespace(v);
            }));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteAppInstanceResponse::getBody, (response, data) -> {
                response.setBody(data);
            }));

        return builder.build();
    }

    public static final HttpRequestDef<ListAppInstanceHistoryRequest, ListAppInstanceHistoryResponse> listAppInstanceHistory =
        genForlistAppInstanceHistory();

    private static HttpRequestDef<ListAppInstanceHistoryRequest, ListAppInstanceHistoryResponse> genForlistAppInstanceHistory() {
        // basic
        HttpRequestDef.Builder<ListAppInstanceHistoryRequest, ListAppInstanceHistoryResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListAppInstanceHistoryRequest.class, ListAppInstanceHistoryResponse.class)
            .withName("ListAppInstanceHistory")
            .withUri("/v3/{project_id}/clusters/{cluster_id}/app-instances/{app_instance_id}/history")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppInstanceHistoryRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));
        builder.<String>withRequestField("app_instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppInstanceHistoryRequest::getAppInstanceId, (req, v) -> {
                req.setAppInstanceId(v);
            }));
        builder.<String>withRequestField("namespace",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppInstanceHistoryRequest::getNamespace, (req, v) -> {
                req.setNamespace(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAppInstancesRequest, ListAppInstancesResponse> listAppInstances =
        genForlistAppInstances();

    private static HttpRequestDef<ListAppInstancesRequest, ListAppInstancesResponse> genForlistAppInstances() {
        // basic
        HttpRequestDef.Builder<ListAppInstancesRequest, ListAppInstancesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAppInstancesRequest.class, ListAppInstancesResponse.class)
                .withName("ListAppInstances")
                .withUri("/v3/{project_id}/clusters/{cluster_id}/app-instances")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppInstancesRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateAppInstanceRequest, UpdateAppInstanceResponse> updateAppInstance =
        genForupdateAppInstance();

    private static HttpRequestDef<UpdateAppInstanceRequest, UpdateAppInstanceResponse> genForupdateAppInstance() {
        // basic
        HttpRequestDef.Builder<UpdateAppInstanceRequest, UpdateAppInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateAppInstanceRequest.class, UpdateAppInstanceResponse.class)
                .withName("UpdateAppInstance")
                .withUri("/v3/{project_id}/clusters/{cluster_id}/app-instances/{app_instance_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAppInstanceRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));
        builder.<String>withRequestField("app_instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAppInstanceRequest::getAppInstanceId, (req, v) -> {
                req.setAppInstanceId(v);
            }));
        builder.<UpdateAppInstanceRequestDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateAppInstanceRequestDTO.class),
            f -> f.withMarshaller(UpdateAppInstanceRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateAppVersionRequest, CreateAppVersionResponse> createAppVersion =
        genForcreateAppVersion();

    private static HttpRequestDef<CreateAppVersionRequest, CreateAppVersionResponse> genForcreateAppVersion() {
        // basic
        HttpRequestDef.Builder<CreateAppVersionRequest, CreateAppVersionResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateAppVersionRequest.class, CreateAppVersionResponse.class)
                .withName("CreateAppVersion")
                .withUri("/v3/{project_id}/apps/{app_id}/versions")
                .withContentType("multipart/form-data");

        // requests
        builder.<String>withRequestField("app_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateAppVersionRequest::getAppId, (req, v) -> {
                req.setAppId(v);
            }));
        builder.<String>withRequestField("version",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateAppVersionRequest::getVersion, (req, v) -> {
                req.setVersion(v);
            }));
        builder.<CreateAppVersionRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateAppVersionRequestBody.class),
            f -> f.withMarshaller(CreateAppVersionRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteAppVersionRequest, DeleteAppVersionResponse> deleteAppVersion =
        genFordeleteAppVersion();

    private static HttpRequestDef<DeleteAppVersionRequest, DeleteAppVersionResponse> genFordeleteAppVersion() {
        // basic
        HttpRequestDef.Builder<DeleteAppVersionRequest, DeleteAppVersionResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteAppVersionRequest.class, DeleteAppVersionResponse.class)
                .withName("DeleteAppVersion")
                .withUri("/v3/{project_id}/apps/{app_id}/versions/{version}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("app_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAppVersionRequest::getAppId, (req, v) -> {
                req.setAppId(v);
            }));
        builder.<String>withRequestField("version",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAppVersionRequest::getVersion, (req, v) -> {
                req.setVersion(v);
            }));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteAppVersionResponse::getBody, (response, data) -> {
                response.setBody(data);
            }));

        return builder.build();
    }

    public static final HttpRequestDef<DownloadAppVersionRequest, DownloadAppVersionResponse> downloadAppVersion =
        genFordownloadAppVersion();

    private static HttpRequestDef<DownloadAppVersionRequest, DownloadAppVersionResponse> genFordownloadAppVersion() {
        // basic
        HttpRequestDef.Builder<DownloadAppVersionRequest, DownloadAppVersionResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, DownloadAppVersionRequest.class, DownloadAppVersionResponse.class)
                .withName("DownloadAppVersion")
                .withUri("/v3/{project_id}/apps/{app_id}/versions/{version}/archive")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("app_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DownloadAppVersionRequest::getAppId, (req, v) -> {
                req.setAppId(v);
            }));
        builder.<String>withRequestField("version",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DownloadAppVersionRequest::getVersion, (req, v) -> {
                req.setVersion(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAppImageRequest, ListAppImageResponse> listAppImage = genForlistAppImage();

    private static HttpRequestDef<ListAppImageRequest, ListAppImageResponse> genForlistAppImage() {
        // basic
        HttpRequestDef.Builder<ListAppImageRequest, ListAppImageResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAppImageRequest.class, ListAppImageResponse.class)
                .withName("ListAppImage")
                .withUri("/v3/{project_id}/apps/{app_id}/versions/{version}/images")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("app_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppImageRequest::getAppId, (req, v) -> {
                req.setAppId(v);
            }));
        builder.<String>withRequestField("version",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppImageRequest::getVersion, (req, v) -> {
                req.setVersion(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAppImageRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAppImageRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAppVersionsRequest, ListAppVersionsResponse> listAppVersions =
        genForlistAppVersions();

    private static HttpRequestDef<ListAppVersionsRequest, ListAppVersionsResponse> genForlistAppVersions() {
        // basic
        HttpRequestDef.Builder<ListAppVersionsRequest, ListAppVersionsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAppVersionsRequest.class, ListAppVersionsResponse.class)
                .withName("ListAppVersions")
                .withUri("/v3/{project_id}/apps/{app_id}/versions")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("app_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppVersionsRequest::getAppId, (req, v) -> {
                req.setAppId(v);
            }));
        builder.<String>withRequestField("version",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppVersionsRequest::getVersion, (req, v) -> {
                req.setVersion(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAppVersionsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAppVersionsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAppVersionRequest, ShowAppVersionResponse> showAppVersion =
        genForshowAppVersion();

    private static HttpRequestDef<ShowAppVersionRequest, ShowAppVersionResponse> genForshowAppVersion() {
        // basic
        HttpRequestDef.Builder<ShowAppVersionRequest, ShowAppVersionResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowAppVersionRequest.class, ShowAppVersionResponse.class)
                .withName("ShowAppVersion")
                .withUri("/v3/{project_id}/apps/{app_id}/versions/{version}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("app_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAppVersionRequest::getAppId, (req, v) -> {
                req.setAppId(v);
            }));
        builder.<String>withRequestField("version",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAppVersionRequest::getVersion, (req, v) -> {
                req.setVersion(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateClusterRequest, CreateClusterResponse> createCluster =
        genForcreateCluster();

    private static HttpRequestDef<CreateClusterRequest, CreateClusterResponse> genForcreateCluster() {
        // basic
        HttpRequestDef.Builder<CreateClusterRequest, CreateClusterResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateClusterRequest.class, CreateClusterResponse.class)
                .withName("CreateCluster")
                .withUri("/v3/{project_id}/clusters")
                .withContentType("application/json");

        // requests
        builder.<CreateClusterRequestDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateClusterRequestDTO.class),
            f -> f.withMarshaller(CreateClusterRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateClusterInstallCmdRequest, CreateClusterInstallCmdResponse> createClusterInstallCmd =
        genForcreateClusterInstallCmd();

    private static HttpRequestDef<CreateClusterInstallCmdRequest, CreateClusterInstallCmdResponse> genForcreateClusterInstallCmd() {
        // basic
        HttpRequestDef.Builder<CreateClusterInstallCmdRequest, CreateClusterInstallCmdResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateClusterInstallCmdRequest.class, CreateClusterInstallCmdResponse.class)
            .withName("CreateClusterInstallCmd")
            .withUri("/v3/{project_id}/clusters/{cluster_id}/install-cmd")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateClusterInstallCmdRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));
        builder.<String>withRequestField("arch",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateClusterInstallCmdRequest::getArch, (req, v) -> {
                req.setArch(v);
            }));
        builder.<String>withRequestField("os",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateClusterInstallCmdRequest::getOs, (req, v) -> {
                req.setOs(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteClusterRequest, DeleteClusterResponse> deleteCluster =
        genFordeleteCluster();

    private static HttpRequestDef<DeleteClusterRequest, DeleteClusterResponse> genFordeleteCluster() {
        // basic
        HttpRequestDef.Builder<DeleteClusterRequest, DeleteClusterResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteClusterRequest.class, DeleteClusterResponse.class)
                .withName("DeleteCluster")
                .withUri("/v3/{project_id}/clusters/{cluster_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteClusterRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteClusterResponse::getBody, (response, data) -> {
                response.setBody(data);
            }));

        return builder.build();
    }

    public static final HttpRequestDef<ListClustersRequest, ListClustersResponse> listClusters = genForlistClusters();

    private static HttpRequestDef<ListClustersRequest, ListClustersResponse> genForlistClusters() {
        // basic
        HttpRequestDef.Builder<ListClustersRequest, ListClustersResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListClustersRequest.class, ListClustersResponse.class)
                .withName("ListClusters")
                .withUri("/v3/{project_id}/clusters")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListClustersRequest::getClusterName, (req, v) -> {
                req.setClusterName(v);
            }));
        builder.<String>withRequestField("state",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListClustersRequest::getState, (req, v) -> {
                req.setState(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListClustersRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListClustersRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowClusterRequest, ShowClusterResponse> showCluster = genForshowCluster();

    private static HttpRequestDef<ShowClusterRequest, ShowClusterResponse> genForshowCluster() {
        // basic
        HttpRequestDef.Builder<ShowClusterRequest, ShowClusterResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowClusterRequest.class, ShowClusterResponse.class)
                .withName("ShowCluster")
                .withUri("/v3/{project_id}/clusters/{cluster_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowClusterRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));

        // response

        return builder.build();
    }

}
