package com.huaweicloud.sdk.cph.v1;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.cph.v1.model.AddImageMemberRequest;
import com.huaweicloud.sdk.cph.v1.model.AddImageMemberRequestBody;
import com.huaweicloud.sdk.cph.v1.model.AddImageMemberResponse;
import com.huaweicloud.sdk.cph.v1.model.BatchCreateTagsRequest;
import com.huaweicloud.sdk.cph.v1.model.BatchCreateTagsRequestBody;
import com.huaweicloud.sdk.cph.v1.model.BatchCreateTagsResponse;
import com.huaweicloud.sdk.cph.v1.model.BatchDeleteTagsRequest;
import com.huaweicloud.sdk.cph.v1.model.BatchDeleteTagsRequestBody;
import com.huaweicloud.sdk.cph.v1.model.BatchDeleteTagsResponse;
import com.huaweicloud.sdk.cph.v1.model.BatchExportCloudPhoneDataRequest;
import com.huaweicloud.sdk.cph.v1.model.BatchExportCloudPhoneDataRequestBody;
import com.huaweicloud.sdk.cph.v1.model.BatchExportCloudPhoneDataResponse;
import com.huaweicloud.sdk.cph.v1.model.BatchImportCloudPhoneDataRequest;
import com.huaweicloud.sdk.cph.v1.model.BatchImportCloudPhoneDataRequestBody;
import com.huaweicloud.sdk.cph.v1.model.BatchImportCloudPhoneDataResponse;
import com.huaweicloud.sdk.cph.v1.model.BatchShowPhoneConnectInfosRequest;
import com.huaweicloud.sdk.cph.v1.model.BatchShowPhoneConnectInfosResponse;
import com.huaweicloud.sdk.cph.v1.model.ChangeCloudPhoneServerModelRequest;
import com.huaweicloud.sdk.cph.v1.model.ChangeCloudPhoneServerModelRequestBody;
import com.huaweicloud.sdk.cph.v1.model.ChangeCloudPhoneServerModelResponse;
import com.huaweicloud.sdk.cph.v1.model.ChangeCloudPhoneServerRequest;
import com.huaweicloud.sdk.cph.v1.model.ChangeCloudPhoneServerRequestBody;
import com.huaweicloud.sdk.cph.v1.model.ChangeCloudPhoneServerResponse;
import com.huaweicloud.sdk.cph.v1.model.ConnectionRequestBody;
import com.huaweicloud.sdk.cph.v1.model.CreateNet2CloudPhoneServerRequest;
import com.huaweicloud.sdk.cph.v1.model.CreateNet2CloudPhoneServerRequestBody;
import com.huaweicloud.sdk.cph.v1.model.CreateNet2CloudPhoneServerResponse;
import com.huaweicloud.sdk.cph.v1.model.DeleteCloudPhoneServerRequest;
import com.huaweicloud.sdk.cph.v1.model.DeleteCloudPhoneServerRequestBody;
import com.huaweicloud.sdk.cph.v1.model.DeleteCloudPhoneServerResponse;
import com.huaweicloud.sdk.cph.v1.model.DeleteImageMemberRequest;
import com.huaweicloud.sdk.cph.v1.model.DeleteImageMemberResponse;
import com.huaweicloud.sdk.cph.v1.model.DeleteImageRequest;
import com.huaweicloud.sdk.cph.v1.model.DeleteImageResponse;
import com.huaweicloud.sdk.cph.v1.model.DeleteShareAppsRequest;
import com.huaweicloud.sdk.cph.v1.model.DeleteShareAppsRequestBody;
import com.huaweicloud.sdk.cph.v1.model.DeleteShareAppsResponse;
import com.huaweicloud.sdk.cph.v1.model.DeleteShareFilesRequest;
import com.huaweicloud.sdk.cph.v1.model.DeleteShareFilesRequestBody;
import com.huaweicloud.sdk.cph.v1.model.DeleteShareFilesResponse;
import com.huaweicloud.sdk.cph.v1.model.ImportTrafficRequest;
import com.huaweicloud.sdk.cph.v1.model.ImportTrafficRequestBody;
import com.huaweicloud.sdk.cph.v1.model.ImportTrafficResponse;
import com.huaweicloud.sdk.cph.v1.model.InstallApkRequest;
import com.huaweicloud.sdk.cph.v1.model.InstallApkRequestBody;
import com.huaweicloud.sdk.cph.v1.model.InstallApkResponse;
import com.huaweicloud.sdk.cph.v1.model.ListCloudPhoneImagesRequest;
import com.huaweicloud.sdk.cph.v1.model.ListCloudPhoneImagesResponse;
import com.huaweicloud.sdk.cph.v1.model.ListCloudPhoneModelsRequest;
import com.huaweicloud.sdk.cph.v1.model.ListCloudPhoneModelsResponse;
import com.huaweicloud.sdk.cph.v1.model.ListCloudPhoneServerModelsRequest;
import com.huaweicloud.sdk.cph.v1.model.ListCloudPhoneServerModelsResponse;
import com.huaweicloud.sdk.cph.v1.model.ListCloudPhoneServersRequest;
import com.huaweicloud.sdk.cph.v1.model.ListCloudPhoneServersResponse;
import com.huaweicloud.sdk.cph.v1.model.ListCloudPhonesRequest;
import com.huaweicloud.sdk.cph.v1.model.ListCloudPhonesResponse;
import com.huaweicloud.sdk.cph.v1.model.ListEncodeServersRequest;
import com.huaweicloud.sdk.cph.v1.model.ListEncodeServersResponse;
import com.huaweicloud.sdk.cph.v1.model.ListImageMembersRequest;
import com.huaweicloud.sdk.cph.v1.model.ListImageMembersResponse;
import com.huaweicloud.sdk.cph.v1.model.ListImagesRequest;
import com.huaweicloud.sdk.cph.v1.model.ListImagesResponse;
import com.huaweicloud.sdk.cph.v1.model.ListJobsRequest;
import com.huaweicloud.sdk.cph.v1.model.ListJobsResponse;
import com.huaweicloud.sdk.cph.v1.model.ListProjectTagsRequest;
import com.huaweicloud.sdk.cph.v1.model.ListProjectTagsResponse;
import com.huaweicloud.sdk.cph.v1.model.ListResourceInstancesRequest;
import com.huaweicloud.sdk.cph.v1.model.ListResourceInstancesRequestBody;
import com.huaweicloud.sdk.cph.v1.model.ListResourceInstancesResponse;
import com.huaweicloud.sdk.cph.v1.model.ListResourceTagsRequest;
import com.huaweicloud.sdk.cph.v1.model.ListResourceTagsResponse;
import com.huaweicloud.sdk.cph.v1.model.ListShareFilesRequest;
import com.huaweicloud.sdk.cph.v1.model.ListShareFilesResponse;
import com.huaweicloud.sdk.cph.v1.model.PushFileRequest;
import com.huaweicloud.sdk.cph.v1.model.PushFileRequestBody;
import com.huaweicloud.sdk.cph.v1.model.PushFileResponse;
import com.huaweicloud.sdk.cph.v1.model.PushShareAppsRequest;
import com.huaweicloud.sdk.cph.v1.model.PushShareAppsRequestBody;
import com.huaweicloud.sdk.cph.v1.model.PushShareAppsResponse;
import com.huaweicloud.sdk.cph.v1.model.PushShareFilesRequest;
import com.huaweicloud.sdk.cph.v1.model.PushShareFilesRequestBody;
import com.huaweicloud.sdk.cph.v1.model.PushShareFilesResponse;
import com.huaweicloud.sdk.cph.v1.model.ResetCloudPhoneRequest;
import com.huaweicloud.sdk.cph.v1.model.ResetCloudPhoneRequestBody;
import com.huaweicloud.sdk.cph.v1.model.ResetCloudPhoneResponse;
import com.huaweicloud.sdk.cph.v1.model.RestartCloudPhoneRequest;
import com.huaweicloud.sdk.cph.v1.model.RestartCloudPhoneRequestBody;
import com.huaweicloud.sdk.cph.v1.model.RestartCloudPhoneResponse;
import com.huaweicloud.sdk.cph.v1.model.RestartCloudPhoneServerRequest;
import com.huaweicloud.sdk.cph.v1.model.RestartCloudPhoneServerRequestBody;
import com.huaweicloud.sdk.cph.v1.model.RestartCloudPhoneServerResponse;
import com.huaweicloud.sdk.cph.v1.model.RestartEncodeServerRequest;
import com.huaweicloud.sdk.cph.v1.model.RestartEncodeServerRequestBody;
import com.huaweicloud.sdk.cph.v1.model.RestartEncodeServerResponse;
import com.huaweicloud.sdk.cph.v1.model.RunShellCommandRequest;
import com.huaweicloud.sdk.cph.v1.model.RunShellCommandRequestBody;
import com.huaweicloud.sdk.cph.v1.model.RunShellCommandResponse;
import com.huaweicloud.sdk.cph.v1.model.RunSyncCommandRequest;
import com.huaweicloud.sdk.cph.v1.model.RunSyncCommandRequestBody;
import com.huaweicloud.sdk.cph.v1.model.RunSyncCommandResponse;
import com.huaweicloud.sdk.cph.v1.model.ShowBandwidthDetailRequest;
import com.huaweicloud.sdk.cph.v1.model.ShowBandwidthDetailResponse;
import com.huaweicloud.sdk.cph.v1.model.ShowCloudPhoneDetailRequest;
import com.huaweicloud.sdk.cph.v1.model.ShowCloudPhoneDetailResponse;
import com.huaweicloud.sdk.cph.v1.model.ShowCloudPhoneServerDetailRequest;
import com.huaweicloud.sdk.cph.v1.model.ShowCloudPhoneServerDetailResponse;
import com.huaweicloud.sdk.cph.v1.model.ShowJobRequest;
import com.huaweicloud.sdk.cph.v1.model.ShowJobResponse;
import com.huaweicloud.sdk.cph.v1.model.StopCloudPhoneRequest;
import com.huaweicloud.sdk.cph.v1.model.StopCloudPhoneRequestBody;
import com.huaweicloud.sdk.cph.v1.model.StopCloudPhoneResponse;
import com.huaweicloud.sdk.cph.v1.model.UninstallApkRequest;
import com.huaweicloud.sdk.cph.v1.model.UninstallApkRequestBody;
import com.huaweicloud.sdk.cph.v1.model.UninstallApkResponse;
import com.huaweicloud.sdk.cph.v1.model.UpdateBandwidthRequest;
import com.huaweicloud.sdk.cph.v1.model.UpdateBandwidthRequestBody;
import com.huaweicloud.sdk.cph.v1.model.UpdateBandwidthResponse;
import com.huaweicloud.sdk.cph.v1.model.UpdateCloudPhonePropertyRequest;
import com.huaweicloud.sdk.cph.v1.model.UpdateCloudPhonePropertyRequestBody;
import com.huaweicloud.sdk.cph.v1.model.UpdateCloudPhonePropertyResponse;
import com.huaweicloud.sdk.cph.v1.model.UpdateKeypairRequest;
import com.huaweicloud.sdk.cph.v1.model.UpdateKeypairRequestBody;
import com.huaweicloud.sdk.cph.v1.model.UpdateKeypairResponse;
import com.huaweicloud.sdk.cph.v1.model.UpdatePhoneNameRequest;
import com.huaweicloud.sdk.cph.v1.model.UpdatePhoneNameRequestBody;
import com.huaweicloud.sdk.cph.v1.model.UpdatePhoneNameResponse;
import com.huaweicloud.sdk.cph.v1.model.UpdateServerNameRequest;
import com.huaweicloud.sdk.cph.v1.model.UpdateServerNameRequestBody;
import com.huaweicloud.sdk.cph.v1.model.UpdateServerNameResponse;

@SuppressWarnings("unchecked")
public class CphMeta {

    public static final HttpRequestDef<AddImageMemberRequest, AddImageMemberResponse> addImageMember =
        genForAddImageMember();

    private static HttpRequestDef<AddImageMemberRequest, AddImageMemberResponse> genForAddImageMember() {
        // basic
        HttpRequestDef.Builder<AddImageMemberRequest, AddImageMemberResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AddImageMemberRequest.class, AddImageMemberResponse.class)
                .withName("AddImageMember")
                .withUri("/v1/{project_id}/cloud-phone/images/{image_id}/members")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("image_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddImageMemberRequest::getImageId, AddImageMemberRequest::setImageId));
        builder.<AddImageMemberRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AddImageMemberRequestBody.class),
            f -> f.withMarshaller(AddImageMemberRequest::getBody, AddImageMemberRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchCreateTagsRequest, BatchCreateTagsResponse> batchCreateTags =
        genForBatchCreateTags();

    private static HttpRequestDef<BatchCreateTagsRequest, BatchCreateTagsResponse> genForBatchCreateTags() {
        // basic
        HttpRequestDef.Builder<BatchCreateTagsRequest, BatchCreateTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchCreateTagsRequest.class, BatchCreateTagsResponse.class)
                .withName("BatchCreateTags")
                .withUri("/v1/{project_id}/{resource_type}/{resource_id}/tags/action")
                .withContentType("application/json");

        // requests
        builder.<BatchCreateTagsRequest.ResourceTypeEnum>withRequestField("resource_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchCreateTagsRequest.ResourceTypeEnum.class),
            f -> f.withMarshaller(BatchCreateTagsRequest::getResourceType, BatchCreateTagsRequest::setResourceType));
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchCreateTagsRequest::getResourceId, BatchCreateTagsRequest::setResourceId));
        builder.<BatchCreateTagsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchCreateTagsRequestBody.class),
            f -> f.withMarshaller(BatchCreateTagsRequest::getBody, BatchCreateTagsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteTagsRequest, BatchDeleteTagsResponse> batchDeleteTags =
        genForBatchDeleteTags();

    private static HttpRequestDef<BatchDeleteTagsRequest, BatchDeleteTagsResponse> genForBatchDeleteTags() {
        // basic
        HttpRequestDef.Builder<BatchDeleteTagsRequest, BatchDeleteTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchDeleteTagsRequest.class, BatchDeleteTagsResponse.class)
                .withName("BatchDeleteTags")
                .withUri("/v1/{project_id}/{resource_type}/{resource_id}/tags/action")
                .withContentType("application/json");

        // requests
        builder.<BatchDeleteTagsRequest.ResourceTypeEnum>withRequestField("resource_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchDeleteTagsRequest.ResourceTypeEnum.class),
            f -> f.withMarshaller(BatchDeleteTagsRequest::getResourceType, BatchDeleteTagsRequest::setResourceType));
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeleteTagsRequest::getResourceId, BatchDeleteTagsRequest::setResourceId));
        builder.<BatchDeleteTagsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchDeleteTagsRequestBody.class),
            f -> f.withMarshaller(BatchDeleteTagsRequest::getBody, BatchDeleteTagsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchExportCloudPhoneDataRequest, BatchExportCloudPhoneDataResponse> batchExportCloudPhoneData =
        genForBatchExportCloudPhoneData();

    private static HttpRequestDef<BatchExportCloudPhoneDataRequest, BatchExportCloudPhoneDataResponse> genForBatchExportCloudPhoneData() {
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
            f -> f.withMarshaller(BatchExportCloudPhoneDataRequest::getBody,
                BatchExportCloudPhoneDataRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchImportCloudPhoneDataRequest, BatchImportCloudPhoneDataResponse> batchImportCloudPhoneData =
        genForBatchImportCloudPhoneData();

    private static HttpRequestDef<BatchImportCloudPhoneDataRequest, BatchImportCloudPhoneDataResponse> genForBatchImportCloudPhoneData() {
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
            f -> f.withMarshaller(BatchImportCloudPhoneDataRequest::getBody,
                BatchImportCloudPhoneDataRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchShowPhoneConnectInfosRequest, BatchShowPhoneConnectInfosResponse> batchShowPhoneConnectInfos =
        genForBatchShowPhoneConnectInfos();

    private static HttpRequestDef<BatchShowPhoneConnectInfosRequest, BatchShowPhoneConnectInfosResponse> genForBatchShowPhoneConnectInfos() {
        // basic
        HttpRequestDef.Builder<BatchShowPhoneConnectInfosRequest, BatchShowPhoneConnectInfosResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    BatchShowPhoneConnectInfosRequest.class,
                    BatchShowPhoneConnectInfosResponse.class)
                .withName("BatchShowPhoneConnectInfos")
                .withUri("/v1/{project_id}/cloud-phone/phones/batch-connection")
                .withContentType("application/json");

        // requests
        builder.<ConnectionRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ConnectionRequestBody.class),
            f -> f.withMarshaller(BatchShowPhoneConnectInfosRequest::getBody,
                BatchShowPhoneConnectInfosRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ChangeCloudPhoneServerRequest, ChangeCloudPhoneServerResponse> changeCloudPhoneServer =
        genForChangeCloudPhoneServer();

    private static HttpRequestDef<ChangeCloudPhoneServerRequest, ChangeCloudPhoneServerResponse> genForChangeCloudPhoneServer() {
        // basic
        HttpRequestDef.Builder<ChangeCloudPhoneServerRequest, ChangeCloudPhoneServerResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ChangeCloudPhoneServerRequest.class, ChangeCloudPhoneServerResponse.class)
            .withName("ChangeCloudPhoneServer")
            .withUri("/v2/{project_id}/cloud-phone/servers/{server_id}/change")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("server_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ChangeCloudPhoneServerRequest::getServerId,
                ChangeCloudPhoneServerRequest::setServerId));
        builder.<ChangeCloudPhoneServerRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ChangeCloudPhoneServerRequestBody.class),
            f -> f.withMarshaller(ChangeCloudPhoneServerRequest::getBody, ChangeCloudPhoneServerRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ChangeCloudPhoneServerModelRequest, ChangeCloudPhoneServerModelResponse> changeCloudPhoneServerModel =
        genForChangeCloudPhoneServerModel();

    private static HttpRequestDef<ChangeCloudPhoneServerModelRequest, ChangeCloudPhoneServerModelResponse> genForChangeCloudPhoneServerModel() {
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
            f -> f.withMarshaller(ChangeCloudPhoneServerModelRequest::getBody,
                ChangeCloudPhoneServerModelRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateNet2CloudPhoneServerRequest, CreateNet2CloudPhoneServerResponse> createNet2CloudPhoneServer =
        genForCreateNet2CloudPhoneServer();

    private static HttpRequestDef<CreateNet2CloudPhoneServerRequest, CreateNet2CloudPhoneServerResponse> genForCreateNet2CloudPhoneServer() {
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
            f -> f.withMarshaller(CreateNet2CloudPhoneServerRequest::getBody,
                CreateNet2CloudPhoneServerRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteCloudPhoneServerRequest, DeleteCloudPhoneServerResponse> deleteCloudPhoneServer =
        genForDeleteCloudPhoneServer();

    private static HttpRequestDef<DeleteCloudPhoneServerRequest, DeleteCloudPhoneServerResponse> genForDeleteCloudPhoneServer() {
        // basic
        HttpRequestDef.Builder<DeleteCloudPhoneServerRequest, DeleteCloudPhoneServerResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteCloudPhoneServerRequest.class, DeleteCloudPhoneServerResponse.class)
            .withName("DeleteCloudPhoneServer")
            .withUri("/v2/{project_id}/cloud-phone/servers")
            .withContentType("application/json");

        // requests
        builder.<DeleteCloudPhoneServerRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteCloudPhoneServerRequestBody.class),
            f -> f.withMarshaller(DeleteCloudPhoneServerRequest::getBody, DeleteCloudPhoneServerRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteImageRequest, DeleteImageResponse> deleteImage = genForDeleteImage();

    private static HttpRequestDef<DeleteImageRequest, DeleteImageResponse> genForDeleteImage() {
        // basic
        HttpRequestDef.Builder<DeleteImageRequest, DeleteImageResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteImageRequest.class, DeleteImageResponse.class)
                .withName("DeleteImage")
                .withUri("/v1/{project_id}/cloud-phone/images/{image_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("image_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteImageRequest::getImageId, DeleteImageRequest::setImageId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteImageMemberRequest, DeleteImageMemberResponse> deleteImageMember =
        genForDeleteImageMember();

    private static HttpRequestDef<DeleteImageMemberRequest, DeleteImageMemberResponse> genForDeleteImageMember() {
        // basic
        HttpRequestDef.Builder<DeleteImageMemberRequest, DeleteImageMemberResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteImageMemberRequest.class, DeleteImageMemberResponse.class)
                .withName("DeleteImageMember")
                .withUri("/v1/{project_id}/cloud-phone/images/{image_id}/members/{member_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("image_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteImageMemberRequest::getImageId, DeleteImageMemberRequest::setImageId));
        builder.<String>withRequestField("member_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteImageMemberRequest::getMemberId, DeleteImageMemberRequest::setMemberId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteShareAppsRequest, DeleteShareAppsResponse> deleteShareApps =
        genForDeleteShareApps();

    private static HttpRequestDef<DeleteShareAppsRequest, DeleteShareAppsResponse> genForDeleteShareApps() {
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
            f -> f.withMarshaller(DeleteShareAppsRequest::getBody, DeleteShareAppsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteShareFilesRequest, DeleteShareFilesResponse> deleteShareFiles =
        genForDeleteShareFiles();

    private static HttpRequestDef<DeleteShareFilesRequest, DeleteShareFilesResponse> genForDeleteShareFiles() {
        // basic
        HttpRequestDef.Builder<DeleteShareFilesRequest, DeleteShareFilesResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, DeleteShareFilesRequest.class, DeleteShareFilesResponse.class)
                .withName("DeleteShareFiles")
                .withUri("/v1/{project_id}/cloud-phone/phones/share-files")
                .withContentType("application/json");

        // requests
        builder.<DeleteShareFilesRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteShareFilesRequestBody.class),
            f -> f.withMarshaller(DeleteShareFilesRequest::getBody, DeleteShareFilesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ImportTrafficRequest, ImportTrafficResponse> importTraffic =
        genForImportTraffic();

    private static HttpRequestDef<ImportTrafficRequest, ImportTrafficResponse> genForImportTraffic() {
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
            f -> f.withMarshaller(ImportTrafficRequest::getBody, ImportTrafficRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCloudPhoneImagesRequest, ListCloudPhoneImagesResponse> listCloudPhoneImages =
        genForListCloudPhoneImages();

    private static HttpRequestDef<ListCloudPhoneImagesRequest, ListCloudPhoneImagesResponse> genForListCloudPhoneImages() {
        // basic
        HttpRequestDef.Builder<ListCloudPhoneImagesRequest, ListCloudPhoneImagesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListCloudPhoneImagesRequest.class, ListCloudPhoneImagesResponse.class)
            .withName("ListCloudPhoneImages")
            .withUri("/v1/{project_id}/cloud-phone/phone-images")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("image_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCloudPhoneImagesRequest::getImageType,
                ListCloudPhoneImagesRequest::setImageType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCloudPhoneModelsRequest, ListCloudPhoneModelsResponse> listCloudPhoneModels =
        genForListCloudPhoneModels();

    private static HttpRequestDef<ListCloudPhoneModelsRequest, ListCloudPhoneModelsResponse> genForListCloudPhoneModels() {
        // basic
        HttpRequestDef.Builder<ListCloudPhoneModelsRequest, ListCloudPhoneModelsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListCloudPhoneModelsRequest.class, ListCloudPhoneModelsResponse.class)
            .withName("ListCloudPhoneModels")
            .withUri("/v1/{project_id}/cloud-phone/phone-models")
            .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCloudPhoneModelsRequest::getStatus, ListCloudPhoneModelsRequest::setStatus));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCloudPhoneModelsRequest::getOffset, ListCloudPhoneModelsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCloudPhoneModelsRequest::getLimit, ListCloudPhoneModelsRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCloudPhoneServerModelsRequest, ListCloudPhoneServerModelsResponse> listCloudPhoneServerModels =
        genForListCloudPhoneServerModels();

    private static HttpRequestDef<ListCloudPhoneServerModelsRequest, ListCloudPhoneServerModelsResponse> genForListCloudPhoneServerModels() {
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
            f -> f.withMarshaller(ListCloudPhoneServerModelsRequest::getProductType,
                ListCloudPhoneServerModelsRequest::setProductType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCloudPhoneServersRequest, ListCloudPhoneServersResponse> listCloudPhoneServers =
        genForListCloudPhoneServers();

    private static HttpRequestDef<ListCloudPhoneServersRequest, ListCloudPhoneServersResponse> genForListCloudPhoneServers() {
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
            f -> f.withMarshaller(ListCloudPhoneServersRequest::getOffset, ListCloudPhoneServersRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCloudPhoneServersRequest::getLimit, ListCloudPhoneServersRequest::setLimit));
        builder.<String>withRequestField("server_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCloudPhoneServersRequest::getServerName,
                ListCloudPhoneServersRequest::setServerName));
        builder.<String>withRequestField("server_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCloudPhoneServersRequest::getServerId,
                ListCloudPhoneServersRequest::setServerId));
        builder.<String>withRequestField("network_version",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCloudPhoneServersRequest::getNetworkVersion,
                ListCloudPhoneServersRequest::setNetworkVersion));
        builder.<String>withRequestField("phone_model_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCloudPhoneServersRequest::getPhoneModelName,
                ListCloudPhoneServersRequest::setPhoneModelName));
        builder.<Long>withRequestField("create_since",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListCloudPhoneServersRequest::getCreateSince,
                ListCloudPhoneServersRequest::setCreateSince));
        builder.<Long>withRequestField("create_until",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListCloudPhoneServersRequest::getCreateUntil,
                ListCloudPhoneServersRequest::setCreateUntil));
        builder.<Integer>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCloudPhoneServersRequest::getStatus, ListCloudPhoneServersRequest::setStatus));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCloudPhonesRequest, ListCloudPhonesResponse> listCloudPhones =
        genForListCloudPhones();

    private static HttpRequestDef<ListCloudPhonesRequest, ListCloudPhonesResponse> genForListCloudPhones() {
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
            f -> f.withMarshaller(ListCloudPhonesRequest::getOffset, ListCloudPhonesRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCloudPhonesRequest::getLimit, ListCloudPhonesRequest::setLimit));
        builder.<String>withRequestField("phone_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCloudPhonesRequest::getPhoneName, ListCloudPhonesRequest::setPhoneName));
        builder.<String>withRequestField("server_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCloudPhonesRequest::getServerId, ListCloudPhonesRequest::setServerId));
        builder.<Integer>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCloudPhonesRequest::getStatus, ListCloudPhonesRequest::setStatus));
        builder.<Integer>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCloudPhonesRequest::getType, ListCloudPhonesRequest::setType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListEncodeServersRequest, ListEncodeServersResponse> listEncodeServers =
        genForListEncodeServers();

    private static HttpRequestDef<ListEncodeServersRequest, ListEncodeServersResponse> genForListEncodeServers() {
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
            f -> f.withMarshaller(ListEncodeServersRequest::getOffset, ListEncodeServersRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEncodeServersRequest::getLimit, ListEncodeServersRequest::setLimit));
        builder.<Integer>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEncodeServersRequest::getType, ListEncodeServersRequest::setType));
        builder.<Integer>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEncodeServersRequest::getStatus, ListEncodeServersRequest::setStatus));
        builder.<String>withRequestField("server_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEncodeServersRequest::getServerId, ListEncodeServersRequest::setServerId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListImageMembersRequest, ListImageMembersResponse> listImageMembers =
        genForListImageMembers();

    private static HttpRequestDef<ListImageMembersRequest, ListImageMembersResponse> genForListImageMembers() {
        // basic
        HttpRequestDef.Builder<ListImageMembersRequest, ListImageMembersResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListImageMembersRequest.class, ListImageMembersResponse.class)
                .withName("ListImageMembers")
                .withUri("/v1/{project_id}/cloud-phone/images/{image_id}/members")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("image_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImageMembersRequest::getImageId, ListImageMembersRequest::setImageId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListImagesRequest, ListImagesResponse> listImages = genForListImages();

    private static HttpRequestDef<ListImagesRequest, ListImagesResponse> genForListImages() {
        // basic
        HttpRequestDef.Builder<ListImagesRequest, ListImagesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListImagesRequest.class, ListImagesResponse.class)
                .withName("ListImages")
                .withUri("/v1/{project_id}/cloud-phone/images")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("image_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImagesRequest::getImageType, ListImagesRequest::setImageType));
        builder.<Integer>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListImagesRequest::getStatus, ListImagesRequest::setStatus));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListImagesRequest::getOffset, ListImagesRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListImagesRequest::getLimit, ListImagesRequest::setLimit));
        builder.<String>withRequestField("image_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImagesRequest::getImageId, ListImagesRequest::setImageId));
        builder.<String>withRequestField("image_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImagesRequest::getImageName, ListImagesRequest::setImageName));
        builder.<Long>withRequestField("create_since",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListImagesRequest::getCreateSince, ListImagesRequest::setCreateSince));
        builder.<Long>withRequestField("create_until",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListImagesRequest::getCreateUntil, ListImagesRequest::setCreateUntil));
        builder.<String>withRequestField("src_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImagesRequest::getSrcProjectId, ListImagesRequest::setSrcProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListJobsRequest, ListJobsResponse> listJobs = genForListJobs();

    private static HttpRequestDef<ListJobsRequest, ListJobsResponse> genForListJobs() {
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
            f -> f.withMarshaller(ListJobsRequest::getRequestId, ListJobsRequest::setRequestId));
        builder.<String>withRequestField("request_ids",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListJobsRequest::getRequestIds, ListJobsRequest::setRequestIds));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListJobsRequest::getOffset, ListJobsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListJobsRequest::getLimit, ListJobsRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListProjectTagsRequest, ListProjectTagsResponse> listProjectTags =
        genForListProjectTags();

    private static HttpRequestDef<ListProjectTagsRequest, ListProjectTagsResponse> genForListProjectTags() {
        // basic
        HttpRequestDef.Builder<ListProjectTagsRequest, ListProjectTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListProjectTagsRequest.class, ListProjectTagsResponse.class)
                .withName("ListProjectTags")
                .withUri("/v1/{project_id}/{resource_type}/tags")
                .withContentType("application/json");

        // requests
        builder.<ListProjectTagsRequest.ResourceTypeEnum>withRequestField("resource_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListProjectTagsRequest.ResourceTypeEnum.class),
            f -> f.withMarshaller(ListProjectTagsRequest::getResourceType, ListProjectTagsRequest::setResourceType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListResourceInstancesRequest, ListResourceInstancesResponse> listResourceInstances =
        genForListResourceInstances();

    private static HttpRequestDef<ListResourceInstancesRequest, ListResourceInstancesResponse> genForListResourceInstances() {
        // basic
        HttpRequestDef.Builder<ListResourceInstancesRequest, ListResourceInstancesResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ListResourceInstancesRequest.class, ListResourceInstancesResponse.class)
            .withName("ListResourceInstances")
            .withUri("/v1/{project_id}/{resource_type}/resource_instances/action")
            .withContentType("application/json");

        // requests
        builder.<ListResourceInstancesRequest.ResourceTypeEnum>withRequestField("resource_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListResourceInstancesRequest.ResourceTypeEnum.class),
            f -> f.withMarshaller(ListResourceInstancesRequest::getResourceType,
                ListResourceInstancesRequest::setResourceType));
        builder.<ListResourceInstancesRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListResourceInstancesRequestBody.class),
            f -> f.withMarshaller(ListResourceInstancesRequest::getBody, ListResourceInstancesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListResourceTagsRequest, ListResourceTagsResponse> listResourceTags =
        genForListResourceTags();

    private static HttpRequestDef<ListResourceTagsRequest, ListResourceTagsResponse> genForListResourceTags() {
        // basic
        HttpRequestDef.Builder<ListResourceTagsRequest, ListResourceTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListResourceTagsRequest.class, ListResourceTagsResponse.class)
                .withName("ListResourceTags")
                .withUri("/v1/{project_id}/{resource_type}/{resource_id}/tags")
                .withContentType("application/json");

        // requests
        builder.<ListResourceTagsRequest.ResourceTypeEnum>withRequestField("resource_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListResourceTagsRequest.ResourceTypeEnum.class),
            f -> f.withMarshaller(ListResourceTagsRequest::getResourceType, ListResourceTagsRequest::setResourceType));
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResourceTagsRequest::getResourceId, ListResourceTagsRequest::setResourceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListShareFilesRequest, ListShareFilesResponse> listShareFiles =
        genForListShareFiles();

    private static HttpRequestDef<ListShareFilesRequest, ListShareFilesResponse> genForListShareFiles() {
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
            f -> f.withMarshaller(ListShareFilesRequest::getOffset, ListShareFilesRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListShareFilesRequest::getLimit, ListShareFilesRequest::setLimit));
        builder.<String>withRequestField("server_ids",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListShareFilesRequest::getServerIds, ListShareFilesRequest::setServerIds));
        builder.<String>withRequestField("path",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListShareFilesRequest::getPath, ListShareFilesRequest::setPath));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<PushShareAppsRequest, PushShareAppsResponse> pushShareApps =
        genForPushShareApps();

    private static HttpRequestDef<PushShareAppsRequest, PushShareAppsResponse> genForPushShareApps() {
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
            f -> f.withMarshaller(PushShareAppsRequest::getBody, PushShareAppsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<PushShareFilesRequest, PushShareFilesResponse> pushShareFiles =
        genForPushShareFiles();

    private static HttpRequestDef<PushShareFilesRequest, PushShareFilesResponse> genForPushShareFiles() {
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
            f -> f.withMarshaller(PushShareFilesRequest::getBody, PushShareFilesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ResetCloudPhoneRequest, ResetCloudPhoneResponse> resetCloudPhone =
        genForResetCloudPhone();

    private static HttpRequestDef<ResetCloudPhoneRequest, ResetCloudPhoneResponse> genForResetCloudPhone() {
        // basic
        HttpRequestDef.Builder<ResetCloudPhoneRequest, ResetCloudPhoneResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ResetCloudPhoneRequest.class, ResetCloudPhoneResponse.class)
                .withName("ResetCloudPhone")
                .withUri("/v1/{project_id}/cloud-phone/phones/batch-reset")
                .withContentType("application/json");

        // requests
        builder.<ResetCloudPhoneRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ResetCloudPhoneRequestBody.class),
            f -> f.withMarshaller(ResetCloudPhoneRequest::getBody, ResetCloudPhoneRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RestartCloudPhoneRequest, RestartCloudPhoneResponse> restartCloudPhone =
        genForRestartCloudPhone();

    private static HttpRequestDef<RestartCloudPhoneRequest, RestartCloudPhoneResponse> genForRestartCloudPhone() {
        // basic
        HttpRequestDef.Builder<RestartCloudPhoneRequest, RestartCloudPhoneResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RestartCloudPhoneRequest.class, RestartCloudPhoneResponse.class)
                .withName("RestartCloudPhone")
                .withUri("/v1/{project_id}/cloud-phone/phones/batch-restart")
                .withContentType("application/json");

        // requests
        builder.<RestartCloudPhoneRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RestartCloudPhoneRequestBody.class),
            f -> f.withMarshaller(RestartCloudPhoneRequest::getBody, RestartCloudPhoneRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RestartCloudPhoneServerRequest, RestartCloudPhoneServerResponse> restartCloudPhoneServer =
        genForRestartCloudPhoneServer();

    private static HttpRequestDef<RestartCloudPhoneServerRequest, RestartCloudPhoneServerResponse> genForRestartCloudPhoneServer() {
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
            f -> f.withMarshaller(RestartCloudPhoneServerRequest::getBody, RestartCloudPhoneServerRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RestartEncodeServerRequest, RestartEncodeServerResponse> restartEncodeServer =
        genForRestartEncodeServer();

    private static HttpRequestDef<RestartEncodeServerRequest, RestartEncodeServerResponse> genForRestartEncodeServer() {
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
            f -> f.withMarshaller(RestartEncodeServerRequest::getBody, RestartEncodeServerRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowBandwidthDetailRequest, ShowBandwidthDetailResponse> showBandwidthDetail =
        genForShowBandwidthDetail();

    private static HttpRequestDef<ShowBandwidthDetailRequest, ShowBandwidthDetailResponse> genForShowBandwidthDetail() {
        // basic
        HttpRequestDef.Builder<ShowBandwidthDetailRequest, ShowBandwidthDetailResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowBandwidthDetailRequest.class, ShowBandwidthDetailResponse.class)
                .withName("ShowBandwidthDetail")
                .withUri("/v1/{project_id}/cloud-phone/bandwidths")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowBandwidthDetailRequest::getOffset, ShowBandwidthDetailRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowBandwidthDetailRequest::getLimit, ShowBandwidthDetailRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowCloudPhoneDetailRequest, ShowCloudPhoneDetailResponse> showCloudPhoneDetail =
        genForShowCloudPhoneDetail();

    private static HttpRequestDef<ShowCloudPhoneDetailRequest, ShowCloudPhoneDetailResponse> genForShowCloudPhoneDetail() {
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
            f -> f.withMarshaller(ShowCloudPhoneDetailRequest::getPhoneId, ShowCloudPhoneDetailRequest::setPhoneId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowCloudPhoneServerDetailRequest, ShowCloudPhoneServerDetailResponse> showCloudPhoneServerDetail =
        genForShowCloudPhoneServerDetail();

    private static HttpRequestDef<ShowCloudPhoneServerDetailRequest, ShowCloudPhoneServerDetailResponse> genForShowCloudPhoneServerDetail() {
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
            f -> f.withMarshaller(ShowCloudPhoneServerDetailRequest::getServerId,
                ShowCloudPhoneServerDetailRequest::setServerId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowJobRequest, ShowJobResponse> showJob = genForShowJob();

    private static HttpRequestDef<ShowJobRequest, ShowJobResponse> genForShowJob() {
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
            f -> f.withMarshaller(ShowJobRequest::getJobId, ShowJobRequest::setJobId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StopCloudPhoneRequest, StopCloudPhoneResponse> stopCloudPhone =
        genForStopCloudPhone();

    private static HttpRequestDef<StopCloudPhoneRequest, StopCloudPhoneResponse> genForStopCloudPhone() {
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
            f -> f.withMarshaller(StopCloudPhoneRequest::getBody, StopCloudPhoneRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateBandwidthRequest, UpdateBandwidthResponse> updateBandwidth =
        genForUpdateBandwidth();

    private static HttpRequestDef<UpdateBandwidthRequest, UpdateBandwidthResponse> genForUpdateBandwidth() {
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
            f -> f.withMarshaller(UpdateBandwidthRequest::getBandWidthId, UpdateBandwidthRequest::setBandWidthId));
        builder.<UpdateBandwidthRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateBandwidthRequestBody.class),
            f -> f.withMarshaller(UpdateBandwidthRequest::getBody, UpdateBandwidthRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateCloudPhonePropertyRequest, UpdateCloudPhonePropertyResponse> updateCloudPhoneProperty =
        genForUpdateCloudPhoneProperty();

    private static HttpRequestDef<UpdateCloudPhonePropertyRequest, UpdateCloudPhonePropertyResponse> genForUpdateCloudPhoneProperty() {
        // basic
        HttpRequestDef.Builder<UpdateCloudPhonePropertyRequest, UpdateCloudPhonePropertyResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, UpdateCloudPhonePropertyRequest.class, UpdateCloudPhonePropertyResponse.class)
                .withName("UpdateCloudPhoneProperty")
                .withUri("/v1/{project_id}/cloud-phone/phones/batch-update-property")
                .withContentType("application/json");

        // requests
        builder.<UpdateCloudPhonePropertyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateCloudPhonePropertyRequestBody.class),
            f -> f.withMarshaller(UpdateCloudPhonePropertyRequest::getBody, UpdateCloudPhonePropertyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateKeypairRequest, UpdateKeypairResponse> updateKeypair =
        genForUpdateKeypair();

    private static HttpRequestDef<UpdateKeypairRequest, UpdateKeypairResponse> genForUpdateKeypair() {
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
            f -> f.withMarshaller(UpdateKeypairRequest::getBody, UpdateKeypairRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdatePhoneNameRequest, UpdatePhoneNameResponse> updatePhoneName =
        genForUpdatePhoneName();

    private static HttpRequestDef<UpdatePhoneNameRequest, UpdatePhoneNameResponse> genForUpdatePhoneName() {
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
            f -> f.withMarshaller(UpdatePhoneNameRequest::getPhoneId, UpdatePhoneNameRequest::setPhoneId));
        builder.<UpdatePhoneNameRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdatePhoneNameRequestBody.class),
            f -> f.withMarshaller(UpdatePhoneNameRequest::getBody, UpdatePhoneNameRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateServerNameRequest, UpdateServerNameResponse> updateServerName =
        genForUpdateServerName();

    private static HttpRequestDef<UpdateServerNameRequest, UpdateServerNameResponse> genForUpdateServerName() {
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
            f -> f.withMarshaller(UpdateServerNameRequest::getServerId, UpdateServerNameRequest::setServerId));
        builder.<UpdateServerNameRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateServerNameRequestBody.class),
            f -> f.withMarshaller(UpdateServerNameRequest::getBody, UpdateServerNameRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<InstallApkRequest, InstallApkResponse> installApk = genForInstallApk();

    private static HttpRequestDef<InstallApkRequest, InstallApkResponse> genForInstallApk() {
        // basic
        HttpRequestDef.Builder<InstallApkRequest, InstallApkResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, InstallApkRequest.class, InstallApkResponse.class)
                .withName("InstallApk")
                .withUri("/v1/{project_id}/cloud-phone/phones/commands")
                .withContentType("application/json");

        // requests
        builder.<InstallApkRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(InstallApkRequestBody.class),
            f -> f.withMarshaller(InstallApkRequest::getBody, InstallApkRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<PushFileRequest, PushFileResponse> pushFile = genForPushFile();

    private static HttpRequestDef<PushFileRequest, PushFileResponse> genForPushFile() {
        // basic
        HttpRequestDef.Builder<PushFileRequest, PushFileResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, PushFileRequest.class, PushFileResponse.class)
                .withName("PushFile")
                .withUri("/v1/{project_id}/cloud-phone/phones/commands")
                .withContentType("application/json");

        // requests
        builder.<PushFileRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PushFileRequestBody.class),
            f -> f.withMarshaller(PushFileRequest::getBody, PushFileRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RunShellCommandRequest, RunShellCommandResponse> runShellCommand =
        genForRunShellCommand();

    private static HttpRequestDef<RunShellCommandRequest, RunShellCommandResponse> genForRunShellCommand() {
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
            f -> f.withMarshaller(RunShellCommandRequest::getBody, RunShellCommandRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RunSyncCommandRequest, RunSyncCommandResponse> runSyncCommand =
        genForRunSyncCommand();

    private static HttpRequestDef<RunSyncCommandRequest, RunSyncCommandResponse> genForRunSyncCommand() {
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
            f -> f.withMarshaller(RunSyncCommandRequest::getBody, RunSyncCommandRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UninstallApkRequest, UninstallApkResponse> uninstallApk = genForUninstallApk();

    private static HttpRequestDef<UninstallApkRequest, UninstallApkResponse> genForUninstallApk() {
        // basic
        HttpRequestDef.Builder<UninstallApkRequest, UninstallApkResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UninstallApkRequest.class, UninstallApkResponse.class)
                .withName("UninstallApk")
                .withUri("/v1/{project_id}/cloud-phone/phones/commands")
                .withContentType("application/json");

        // requests
        builder.<UninstallApkRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UninstallApkRequestBody.class),
            f -> f.withMarshaller(UninstallApkRequest::getBody, UninstallApkRequest::setBody));

        // response

        return builder.build();
    }

}
