package com.huaweicloud.sdk.cph.v1;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.cph.v1.model.*;

@SuppressWarnings("unchecked")
public class CphMeta {

    public static final HttpRequestDef<BatchExportCloudPhoneDataRequest, BatchExportCloudPhoneDataResponse> batchExportCloudPhoneData =
        genForbatchExportCloudPhoneData();

    private static HttpRequestDef<BatchExportCloudPhoneDataRequest, BatchExportCloudPhoneDataResponse> genForbatchExportCloudPhoneData() {
        // basic
        HttpRequestDef.Builder<BatchExportCloudPhoneDataRequest, BatchExportCloudPhoneDataResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    BatchExportCloudPhoneDataRequest.class,
                    BatchExportCloudPhoneDataResponse.class)
                .withName("BatchExportCloudPhoneData")
                .withUri("/v1/{project_id}/cloud-phone/phones/batch-storage")
                .withContentType("application/json");

        // requests
        builder.<BatchExportCloudPhoneDataRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchExportCloudPhoneDataRequestBody.class),
            f -> f.withMarshaller(BatchExportCloudPhoneDataRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchImportCloudPhoneDataRequest, BatchImportCloudPhoneDataResponse> batchImportCloudPhoneData =
        genForbatchImportCloudPhoneData();

    private static HttpRequestDef<BatchImportCloudPhoneDataRequest, BatchImportCloudPhoneDataResponse> genForbatchImportCloudPhoneData() {
        // basic
        HttpRequestDef.Builder<BatchImportCloudPhoneDataRequest, BatchImportCloudPhoneDataResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    BatchImportCloudPhoneDataRequest.class,
                    BatchImportCloudPhoneDataResponse.class)
                .withName("BatchImportCloudPhoneData")
                .withUri("/v1/{project_id}/cloud-phone/phones/batch-restore")
                .withContentType("application/json");

        // requests
        builder.<BatchImportCloudPhoneDataRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchImportCloudPhoneDataRequestBody.class),
            f -> f.withMarshaller(BatchImportCloudPhoneDataRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchMigrateCloudPhoneRequest, BatchMigrateCloudPhoneResponse> batchMigrateCloudPhone =
        genForbatchMigrateCloudPhone();

    private static HttpRequestDef<BatchMigrateCloudPhoneRequest, BatchMigrateCloudPhoneResponse> genForbatchMigrateCloudPhone() {
        // basic
        HttpRequestDef.Builder<BatchMigrateCloudPhoneRequest, BatchMigrateCloudPhoneResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, BatchMigrateCloudPhoneRequest.class, BatchMigrateCloudPhoneResponse.class)
            .withName("BatchMigrateCloudPhone")
            .withUri("/v1/{project_id}/cloud-phone/phones/batch-migrate")
            .withContentType("application/json");

        // requests
        builder.<BatchMigrateCloudPhoneRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchMigrateCloudPhoneRequestBody.class),
            f -> f.withMarshaller(BatchMigrateCloudPhoneRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ChangeCloudPhoneServerModelRequest, ChangeCloudPhoneServerModelResponse> changeCloudPhoneServerModel =
        genForchangeCloudPhoneServerModel();

    private static HttpRequestDef<ChangeCloudPhoneServerModelRequest, ChangeCloudPhoneServerModelResponse> genForchangeCloudPhoneServerModel() {
        // basic
        HttpRequestDef.Builder<ChangeCloudPhoneServerModelRequest, ChangeCloudPhoneServerModelResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ChangeCloudPhoneServerModelRequest.class,
                    ChangeCloudPhoneServerModelResponse.class)
                .withName("ChangeCloudPhoneServerModel")
                .withUri("/v1/{project_id}/cloud-phone/servers/change-server-model")
                .withContentType("application/json");

        // requests
        builder.<ChangeCloudPhoneServerModelRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ChangeCloudPhoneServerModelRequestBody.class),
            f -> f.withMarshaller(ChangeCloudPhoneServerModelRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateCloudPhoneServerRequest, CreateCloudPhoneServerResponse> createCloudPhoneServer =
        genForcreateCloudPhoneServer();

    private static HttpRequestDef<CreateCloudPhoneServerRequest, CreateCloudPhoneServerResponse> genForcreateCloudPhoneServer() {
        // basic
        HttpRequestDef.Builder<CreateCloudPhoneServerRequest, CreateCloudPhoneServerResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateCloudPhoneServerRequest.class, CreateCloudPhoneServerResponse.class)
            .withName("CreateCloudPhoneServer")
            .withUri("/v1/{project_id}/cloud-phone/phones")
            .withContentType("application/json");

        // requests
        builder.<CreateCloudPhoneServerRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateCloudPhoneServerRequestBody.class),
            f -> f.withMarshaller(CreateCloudPhoneServerRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateNet2CloudPhoneServerRequest, CreateNet2CloudPhoneServerResponse> createNet2CloudPhoneServer =
        genForcreateNet2CloudPhoneServer();

    private static HttpRequestDef<CreateNet2CloudPhoneServerRequest, CreateNet2CloudPhoneServerResponse> genForcreateNet2CloudPhoneServer() {
        // basic
        HttpRequestDef.Builder<CreateNet2CloudPhoneServerRequest, CreateNet2CloudPhoneServerResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateNet2CloudPhoneServerRequest.class,
                    CreateNet2CloudPhoneServerResponse.class)
                .withName("CreateNet2CloudPhoneServer")
                .withUri("/v2/{project_id}/cloud-phone/servers")
                .withContentType("application/json");

        // requests
        builder.<CreateNet2CloudPhoneServerRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateNet2CloudPhoneServerRequestBody.class),
            f -> f.withMarshaller(CreateNet2CloudPhoneServerRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteShareAppsRequest, DeleteShareAppsResponse> deleteShareApps =
        genFordeleteShareApps();

    private static HttpRequestDef<DeleteShareAppsRequest, DeleteShareAppsResponse> genFordeleteShareApps() {
        // basic
        HttpRequestDef.Builder<DeleteShareAppsRequest, DeleteShareAppsResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteShareAppsRequest.class, DeleteShareAppsResponse.class)
                .withName("DeleteShareApps")
                .withUri("/v1/{project_id}/cloud-phone/phones/share-apps")
                .withContentType("application/json");

        // requests
        builder.<DeleteShareAppsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteShareAppsRequestBody.class),
            f -> f.withMarshaller(DeleteShareAppsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ImportTrafficRequest, ImportTrafficResponse> importTraffic =
        genForimportTraffic();

    private static HttpRequestDef<ImportTrafficRequest, ImportTrafficResponse> genForimportTraffic() {
        // basic
        HttpRequestDef.Builder<ImportTrafficRequest, ImportTrafficResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ImportTrafficRequest.class, ImportTrafficResponse.class)
                .withName("ImportTraffic")
                .withUri("/v1/{project_id}/cloud-phone/phones-traffic")
                .withContentType("application/json");

        // requests
        builder.<ImportTrafficRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ImportTrafficRequestBody.class),
            f -> f.withMarshaller(ImportTrafficRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCloudPhoneImagesRequest, ListCloudPhoneImagesResponse> listCloudPhoneImages =
        genForlistCloudPhoneImages();

    private static HttpRequestDef<ListCloudPhoneImagesRequest, ListCloudPhoneImagesResponse> genForlistCloudPhoneImages() {
        // basic
        HttpRequestDef.Builder<ListCloudPhoneImagesRequest, ListCloudPhoneImagesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListCloudPhoneImagesRequest.class, ListCloudPhoneImagesResponse.class)
            .withName("ListCloudPhoneImages")
            .withUri("/v1/{project_id}/cloud-phone/phone-images")
            .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCloudPhoneModelsRequest, ListCloudPhoneModelsResponse> listCloudPhoneModels =
        genForlistCloudPhoneModels();

    private static HttpRequestDef<ListCloudPhoneModelsRequest, ListCloudPhoneModelsResponse> genForlistCloudPhoneModels() {
        // basic
        HttpRequestDef.Builder<ListCloudPhoneModelsRequest, ListCloudPhoneModelsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListCloudPhoneModelsRequest.class, ListCloudPhoneModelsResponse.class)
            .withName("ListCloudPhoneModels")
            .withUri("/v1/{project_id}/cloud-phone/phone-models")
            .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCloudPhoneServerModelsRequest, ListCloudPhoneServerModelsResponse> listCloudPhoneServerModels =
        genForlistCloudPhoneServerModels();

    private static HttpRequestDef<ListCloudPhoneServerModelsRequest, ListCloudPhoneServerModelsResponse> genForlistCloudPhoneServerModels() {
        // basic
        HttpRequestDef.Builder<ListCloudPhoneServerModelsRequest, ListCloudPhoneServerModelsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListCloudPhoneServerModelsRequest.class,
                    ListCloudPhoneServerModelsResponse.class)
                .withName("ListCloudPhoneServerModels")
                .withUri("/v1/{project_id}/cloud-phone/server-models")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("product_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCloudPhoneServerModelsRequest::getProductType, (req, v) -> {
                req.setProductType(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCloudPhoneServersRequest, ListCloudPhoneServersResponse> listCloudPhoneServers =
        genForlistCloudPhoneServers();

    private static HttpRequestDef<ListCloudPhoneServersRequest, ListCloudPhoneServersResponse> genForlistCloudPhoneServers() {
        // basic
        HttpRequestDef.Builder<ListCloudPhoneServersRequest, ListCloudPhoneServersResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListCloudPhoneServersRequest.class, ListCloudPhoneServersResponse.class)
            .withName("ListCloudPhoneServers")
            .withUri("/v1/{project_id}/cloud-phone/servers")
            .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCloudPhoneServersRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCloudPhoneServersRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("server_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCloudPhoneServersRequest::getServerName, (req, v) -> {
                req.setServerName(v);
            }));
        builder.<String>withRequestField("server_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCloudPhoneServersRequest::getServerId, (req, v) -> {
                req.setServerId(v);
            }));
        builder.<String>withRequestField("network_version",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCloudPhoneServersRequest::getNetworkVersion, (req, v) -> {
                req.setNetworkVersion(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCloudPhonesRequest, ListCloudPhonesResponse> listCloudPhones =
        genForlistCloudPhones();

    private static HttpRequestDef<ListCloudPhonesRequest, ListCloudPhonesResponse> genForlistCloudPhones() {
        // basic
        HttpRequestDef.Builder<ListCloudPhonesRequest, ListCloudPhonesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListCloudPhonesRequest.class, ListCloudPhonesResponse.class)
                .withName("ListCloudPhones")
                .withUri("/v1/{project_id}/cloud-phone/phones")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCloudPhonesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCloudPhonesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("phone_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCloudPhonesRequest::getPhoneName, (req, v) -> {
                req.setPhoneName(v);
            }));
        builder.<String>withRequestField("server_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCloudPhonesRequest::getServerId, (req, v) -> {
                req.setServerId(v);
            }));
        builder.<Integer>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCloudPhonesRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            }));
        builder.<Integer>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCloudPhonesRequest::getType, (req, v) -> {
                req.setType(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListEncodeServersRequest, ListEncodeServersResponse> listEncodeServers =
        genForlistEncodeServers();

    private static HttpRequestDef<ListEncodeServersRequest, ListEncodeServersResponse> genForlistEncodeServers() {
        // basic
        HttpRequestDef.Builder<ListEncodeServersRequest, ListEncodeServersResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListEncodeServersRequest.class, ListEncodeServersResponse.class)
                .withName("ListEncodeServers")
                .withUri("/v1/{project_id}/cloud-phone/encode-servers")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEncodeServersRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEncodeServersRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEncodeServersRequest::getType, (req, v) -> {
                req.setType(v);
            }));
        builder.<Integer>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEncodeServersRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            }));
        builder.<String>withRequestField("server_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEncodeServersRequest::getServerId, (req, v) -> {
                req.setServerId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListJobsRequest, ListJobsResponse> listJobs = genForlistJobs();

    private static HttpRequestDef<ListJobsRequest, ListJobsResponse> genForlistJobs() {
        // basic
        HttpRequestDef.Builder<ListJobsRequest, ListJobsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListJobsRequest.class, ListJobsResponse.class)
                .withName("ListJobs")
                .withUri("/v1/{project_id}/cloud-phone/jobs")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("request_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListJobsRequest::getRequestId, (req, v) -> {
                req.setRequestId(v);
            }));
        builder.<String>withRequestField("request_ids",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListJobsRequest::getRequestIds, (req, v) -> {
                req.setRequestIds(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListShareFilesRequest, ListShareFilesResponse> listShareFiles =
        genForlistShareFiles();

    private static HttpRequestDef<ListShareFilesRequest, ListShareFilesResponse> genForlistShareFiles() {
        // basic
        HttpRequestDef.Builder<ListShareFilesRequest, ListShareFilesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListShareFilesRequest.class, ListShareFilesResponse.class)
                .withName("ListShareFiles")
                .withUri("/v1/{project_id}/cloud-phone/servers/share-files")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListShareFilesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListShareFilesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("server_ids",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListShareFilesRequest::getServerIds, (req, v) -> {
                req.setServerIds(v);
            }));
        builder.<String>withRequestField("path",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListShareFilesRequest::getPath, (req, v) -> {
                req.setPath(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<PushShareAppsRequest, PushShareAppsResponse> pushShareApps =
        genForpushShareApps();

    private static HttpRequestDef<PushShareAppsRequest, PushShareAppsResponse> genForpushShareApps() {
        // basic
        HttpRequestDef.Builder<PushShareAppsRequest, PushShareAppsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, PushShareAppsRequest.class, PushShareAppsResponse.class)
                .withName("PushShareApps")
                .withUri("/v1/{project_id}/cloud-phone/phones/share-apps")
                .withContentType("application/json");

        // requests
        builder.<PushShareAppsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PushShareAppsRequestBody.class),
            f -> f.withMarshaller(PushShareAppsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<PushShareFilesRequest, PushShareFilesResponse> pushShareFiles =
        genForpushShareFiles();

    private static HttpRequestDef<PushShareFilesRequest, PushShareFilesResponse> genForpushShareFiles() {
        // basic
        HttpRequestDef.Builder<PushShareFilesRequest, PushShareFilesResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, PushShareFilesRequest.class, PushShareFilesResponse.class)
                .withName("PushShareFiles")
                .withUri("/v1/{project_id}/cloud-phone/phones/share-files")
                .withContentType("application/json");

        // requests
        builder.<PushShareFilesRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PushShareFilesRequestBody.class),
            f -> f.withMarshaller(PushShareFilesRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ResetCloudPhoneRequest, ResetCloudPhoneResponse> resetCloudPhone =
        genForresetCloudPhone();

    private static HttpRequestDef<ResetCloudPhoneRequest, ResetCloudPhoneResponse> genForresetCloudPhone() {
        // basic
        HttpRequestDef.Builder<ResetCloudPhoneRequest, ResetCloudPhoneResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ResetCloudPhoneRequest.class, ResetCloudPhoneResponse.class)
                .withName("ResetCloudPhone")
                .withUri("/v1/{project_id}/cloud-phone/phones/batch-reset")
                .withContentType("application/json");

        // requests
        builder.<ResetRestartRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ResetRestartRequestBody.class),
            f -> f.withMarshaller(ResetCloudPhoneRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RestartCloudPhoneRequest, RestartCloudPhoneResponse> restartCloudPhone =
        genForrestartCloudPhone();

    private static HttpRequestDef<RestartCloudPhoneRequest, RestartCloudPhoneResponse> genForrestartCloudPhone() {
        // basic
        HttpRequestDef.Builder<RestartCloudPhoneRequest, RestartCloudPhoneResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RestartCloudPhoneRequest.class, RestartCloudPhoneResponse.class)
                .withName("RestartCloudPhone")
                .withUri("/v1/{project_id}/cloud-phone/phones/batch-restart")
                .withContentType("application/json");

        // requests
        builder.<ResetRestartRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ResetRestartRequestBody.class),
            f -> f.withMarshaller(RestartCloudPhoneRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RestartCloudPhoneServerRequest, RestartCloudPhoneServerResponse> restartCloudPhoneServer =
        genForrestartCloudPhoneServer();

    private static HttpRequestDef<RestartCloudPhoneServerRequest, RestartCloudPhoneServerResponse> genForrestartCloudPhoneServer() {
        // basic
        HttpRequestDef.Builder<RestartCloudPhoneServerRequest, RestartCloudPhoneServerResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, RestartCloudPhoneServerRequest.class, RestartCloudPhoneServerResponse.class)
            .withName("RestartCloudPhoneServer")
            .withUri("/v1/{project_id}/cloud-phone/servers/batch-restart")
            .withContentType("application/json");

        // requests
        builder.<RestartCloudPhoneServerRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RestartCloudPhoneServerRequestBody.class),
            f -> f.withMarshaller(RestartCloudPhoneServerRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RestartEncodeServerRequest, RestartEncodeServerResponse> restartEncodeServer =
        genForrestartEncodeServer();

    private static HttpRequestDef<RestartEncodeServerRequest, RestartEncodeServerResponse> genForrestartEncodeServer() {
        // basic
        HttpRequestDef.Builder<RestartEncodeServerRequest, RestartEncodeServerResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RestartEncodeServerRequest.class, RestartEncodeServerResponse.class)
                .withName("RestartEncodeServer")
                .withUri("/v1/{project_id}/cloud-phone/encode-servers/batch-restart")
                .withContentType("application/json");

        // requests
        builder.<RestartEncodeServerRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RestartEncodeServerRequestBody.class),
            f -> f.withMarshaller(RestartEncodeServerRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowBandwidthDetailRequest, ShowBandwidthDetailResponse> showBandwidthDetail =
        genForshowBandwidthDetail();

    private static HttpRequestDef<ShowBandwidthDetailRequest, ShowBandwidthDetailResponse> genForshowBandwidthDetail() {
        // basic
        HttpRequestDef.Builder<ShowBandwidthDetailRequest, ShowBandwidthDetailResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowBandwidthDetailRequest.class, ShowBandwidthDetailResponse.class)
                .withName("ShowBandwidthDetail")
                .withUri("/v1/{project_id}/cloud-phone/bandwidths")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowCloudPhoneDetailRequest, ShowCloudPhoneDetailResponse> showCloudPhoneDetail =
        genForshowCloudPhoneDetail();

    private static HttpRequestDef<ShowCloudPhoneDetailRequest, ShowCloudPhoneDetailResponse> genForshowCloudPhoneDetail() {
        // basic
        HttpRequestDef.Builder<ShowCloudPhoneDetailRequest, ShowCloudPhoneDetailResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowCloudPhoneDetailRequest.class, ShowCloudPhoneDetailResponse.class)
            .withName("ShowCloudPhoneDetail")
            .withUri("/v1/{project_id}/cloud-phone/phones/{phone_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("phone_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCloudPhoneDetailRequest::getPhoneId, (req, v) -> {
                req.setPhoneId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowCloudPhoneServerDetailRequest, ShowCloudPhoneServerDetailResponse> showCloudPhoneServerDetail =
        genForshowCloudPhoneServerDetail();

    private static HttpRequestDef<ShowCloudPhoneServerDetailRequest, ShowCloudPhoneServerDetailResponse> genForshowCloudPhoneServerDetail() {
        // basic
        HttpRequestDef.Builder<ShowCloudPhoneServerDetailRequest, ShowCloudPhoneServerDetailResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowCloudPhoneServerDetailRequest.class,
                    ShowCloudPhoneServerDetailResponse.class)
                .withName("ShowCloudPhoneServerDetail")
                .withUri("/v1/{project_id}/cloud-phone/servers/{server_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("server_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCloudPhoneServerDetailRequest::getServerId, (req, v) -> {
                req.setServerId(v);
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
                .withUri("/v1/{project_id}/cloud-phone/jobs/{job_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJobRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StopCloudPhoneRequest, StopCloudPhoneResponse> stopCloudPhone =
        genForstopCloudPhone();

    private static HttpRequestDef<StopCloudPhoneRequest, StopCloudPhoneResponse> genForstopCloudPhone() {
        // basic
        HttpRequestDef.Builder<StopCloudPhoneRequest, StopCloudPhoneResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, StopCloudPhoneRequest.class, StopCloudPhoneResponse.class)
                .withName("StopCloudPhone")
                .withUri("/v1/{project_id}/cloud-phone/phones/batch-stop")
                .withContentType("application/json");

        // requests
        builder.<StopCloudPhoneRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(StopCloudPhoneRequestBody.class),
            f -> f.withMarshaller(StopCloudPhoneRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateBandwidthRequest, UpdateBandwidthResponse> updateBandwidth =
        genForupdateBandwidth();

    private static HttpRequestDef<UpdateBandwidthRequest, UpdateBandwidthResponse> genForupdateBandwidth() {
        // basic
        HttpRequestDef.Builder<UpdateBandwidthRequest, UpdateBandwidthResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateBandwidthRequest.class, UpdateBandwidthResponse.class)
                .withName("UpdateBandwidth")
                .withUri("/v1/{project_id}/cloud-phone/bandwidths/{band_width_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("band_width_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateBandwidthRequest::getBandWidthId, (req, v) -> {
                req.setBandWidthId(v);
            }));
        builder.<UpdateBandwidthRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateBandwidthRequestBody.class),
            f -> f.withMarshaller(UpdateBandwidthRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateCloudPhonePropertyRequest, UpdateCloudPhonePropertyResponse> updateCloudPhoneProperty =
        genForupdateCloudPhoneProperty();

    private static HttpRequestDef<UpdateCloudPhonePropertyRequest, UpdateCloudPhonePropertyResponse> genForupdateCloudPhoneProperty() {
        // basic
        HttpRequestDef.Builder<UpdateCloudPhonePropertyRequest, UpdateCloudPhonePropertyResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, UpdateCloudPhonePropertyRequest.class, UpdateCloudPhonePropertyResponse.class)
                .withName("UpdateCloudPhoneProperty")
                .withUri("/v1/{project_id}/cloud-phone/phones/batch-update-property")
                .withContentType("application/json");

        // requests
        builder.<Phones>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Phones.class),
            f -> f.withMarshaller(UpdateCloudPhonePropertyRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateKeypairRequest, UpdateKeypairResponse> updateKeypair =
        genForupdateKeypair();

    private static HttpRequestDef<UpdateKeypairRequest, UpdateKeypairResponse> genForupdateKeypair() {
        // basic
        HttpRequestDef.Builder<UpdateKeypairRequest, UpdateKeypairResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateKeypairRequest.class, UpdateKeypairResponse.class)
                .withName("UpdateKeypair")
                .withUri("/v1/{project_id}/cloud-phone/servers/open-access")
                .withContentType("application/json");

        // requests
        builder.<UpdateKeypairRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateKeypairRequestBody.class),
            f -> f.withMarshaller(UpdateKeypairRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdatePhoneNameRequest, UpdatePhoneNameResponse> updatePhoneName =
        genForupdatePhoneName();

    private static HttpRequestDef<UpdatePhoneNameRequest, UpdatePhoneNameResponse> genForupdatePhoneName() {
        // basic
        HttpRequestDef.Builder<UpdatePhoneNameRequest, UpdatePhoneNameResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdatePhoneNameRequest.class, UpdatePhoneNameResponse.class)
                .withName("UpdatePhoneName")
                .withUri("/v1/{project_id}/cloud-phone/phones/{phone_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("phone_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePhoneNameRequest::getPhoneId, (req, v) -> {
                req.setPhoneId(v);
            }));
        builder.<UpdatePhoneNameRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdatePhoneNameRequestBody.class),
            f -> f.withMarshaller(UpdatePhoneNameRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateServerNameRequest, UpdateServerNameResponse> updateServerName =
        genForupdateServerName();

    private static HttpRequestDef<UpdateServerNameRequest, UpdateServerNameResponse> genForupdateServerName() {
        // basic
        HttpRequestDef.Builder<UpdateServerNameRequest, UpdateServerNameResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateServerNameRequest.class, UpdateServerNameResponse.class)
                .withName("UpdateServerName")
                .withUri("/v1/{project_id}/cloud-phone/servers/{server_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("server_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateServerNameRequest::getServerId, (req, v) -> {
                req.setServerId(v);
            }));
        builder.<UpdateServerNameRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateServerNameRequestBody.class),
            f -> f.withMarshaller(UpdateServerNameRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RunShellCommandRequest, RunShellCommandResponse> runShellCommand =
        genForrunShellCommand();

    private static HttpRequestDef<RunShellCommandRequest, RunShellCommandResponse> genForrunShellCommand() {
        // basic
        HttpRequestDef.Builder<RunShellCommandRequest, RunShellCommandResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RunShellCommandRequest.class, RunShellCommandResponse.class)
                .withName("RunShellCommand")
                .withUri("/v1/{project_id}/cloud-phone/phones/commands")
                .withContentType("application/json");

        // requests
        builder.<RunShellCommandRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RunShellCommandRequestBody.class),
            f -> f.withMarshaller(RunShellCommandRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RunSyncCommandRequest, RunSyncCommandResponse> runSyncCommand =
        genForrunSyncCommand();

    private static HttpRequestDef<RunSyncCommandRequest, RunSyncCommandResponse> genForrunSyncCommand() {
        // basic
        HttpRequestDef.Builder<RunSyncCommandRequest, RunSyncCommandResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RunSyncCommandRequest.class, RunSyncCommandResponse.class)
                .withName("RunSyncCommand")
                .withUri("/v1/{project_id}/cloud-phone/phones/sync-commands")
                .withContentType("application/json");

        // requests
        builder.<RunSyncCommandRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RunSyncCommandRequestBody.class),
            f -> f.withMarshaller(RunSyncCommandRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

}
