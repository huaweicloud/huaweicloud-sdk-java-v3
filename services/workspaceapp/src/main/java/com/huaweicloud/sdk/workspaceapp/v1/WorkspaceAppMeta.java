package com.huaweicloud.sdk.workspaceapp.v1;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.workspaceapp.v1.model.AddAppGroupAuthorizationRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.AddAppGroupAuthorizationResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.AppGroupAuthorizeReq;
import com.huaweicloud.sdk.workspaceapp.v1.model.AssignShareFolderReq;
import com.huaweicloud.sdk.workspaceapp.v1.model.AssignUserFolderReq;
import com.huaweicloud.sdk.workspaceapp.v1.model.AttachImageServerAppRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.AttachImageServerAppResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.AttachServerAppReq;
import com.huaweicloud.sdk.workspaceapp.v1.model.AuthorizeObsReq;
import com.huaweicloud.sdk.workspaceapp.v1.model.AuthorizeObsRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.AuthorizeObsResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.BatchDeleteAppGroupAuthorizationRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.BatchDeleteAppGroupAuthorizationResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.BatchDeleteAppGroupRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.BatchDeleteAppGroupResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.BatchDeleteImageServerReq;
import com.huaweicloud.sdk.workspaceapp.v1.model.BatchDeleteImageServerRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.BatchDeleteImageServerResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.BatchDeleteServerReq;
import com.huaweicloud.sdk.workspaceapp.v1.model.BatchDeleteServerRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.BatchDeleteServerResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.BatchDeleteWarehouseAppReq;
import com.huaweicloud.sdk.workspaceapp.v1.model.BatchDeleteWarehouseAppRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.BatchDeleteWarehouseAppResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.BatchMigrateHostsServerRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.BatchMigrateHostsServerResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.BatchMigrateServerReq;
import com.huaweicloud.sdk.workspaceapp.v1.model.BatchRebootServerRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.BatchRebootServerResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.BatchRejoinDomainReq;
import com.huaweicloud.sdk.workspaceapp.v1.model.BatchRejoinDomainRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.BatchRejoinDomainResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.BatchStartServerReq;
import com.huaweicloud.sdk.workspaceapp.v1.model.BatchStartServerRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.BatchStartServerResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.BatchStopServerRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.BatchStopServerResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.BatchUpdateTsviRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.BatchUpdateTsviResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.ChangeServerImageReq;
import com.huaweicloud.sdk.workspaceapp.v1.model.ChangeServerImageRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.ChangeServerImageResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.CheckQuotaRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.CheckQuotaResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.CreateAppGroupReq;
import com.huaweicloud.sdk.workspaceapp.v1.model.CreateAppGroupRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.CreateAppGroupResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.CreateAppServerReq;
import com.huaweicloud.sdk.workspaceapp.v1.model.CreateAppServersRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.CreateAppServersResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.CreateImageServerReq;
import com.huaweicloud.sdk.workspaceapp.v1.model.CreateImageServerRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.CreateImageServerResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.CreateOrUpdateStoragePolicyStatementReq;
import com.huaweicloud.sdk.workspaceapp.v1.model.CreateOrUpdateStoragePolicyStatementRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.CreateOrUpdateStoragePolicyStatementResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.CreatePersistentStorageReq;
import com.huaweicloud.sdk.workspaceapp.v1.model.CreatePersistentStorageRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.CreatePersistentStorageResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.CreatePolicyGroupReq;
import com.huaweicloud.sdk.workspaceapp.v1.model.CreatePolicyGroupRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.CreatePolicyGroupResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.CreatePolicyTemplateReq;
import com.huaweicloud.sdk.workspaceapp.v1.model.CreatePolicyTemplateRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.CreatePolicyTemplateResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.CreateServerGroupReq;
import com.huaweicloud.sdk.workspaceapp.v1.model.CreateServerGroupRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.CreateServerGroupResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.CreateServerImageReq;
import com.huaweicloud.sdk.workspaceapp.v1.model.CreateShareFolderReq;
import com.huaweicloud.sdk.workspaceapp.v1.model.CreateShareFolderRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.CreateShareFolderResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.CreateWarehouseAppReq;
import com.huaweicloud.sdk.workspaceapp.v1.model.CreateWarehouseAppRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.CreateWarehouseAppResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.DeleteAppGroupReq;
import com.huaweicloud.sdk.workspaceapp.v1.model.DeletePersistentStorageRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.DeletePersistentStorageResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.DeletePolicyGroupRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.DeletePolicyGroupResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.DeletePolicyTemplateRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.DeletePolicyTemplateResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.DeleteServerGroupsRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.DeleteServerGroupsResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.DeleteStorageClaimReq;
import com.huaweicloud.sdk.workspaceapp.v1.model.DeleteStorageClaimRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.DeleteStorageClaimResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.DeleteUserStorageAttachmentReq;
import com.huaweicloud.sdk.workspaceapp.v1.model.DeleteUserStorageAttachmentRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.DeleteUserStorageAttachmentResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListAppConnectionReq;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListAppConnectionRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListAppConnectionResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListAppGroupAuthorizationRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListAppGroupAuthorizationResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListAppGroupRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListAppGroupResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListAvailabilityZoneRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListAvailabilityZoneResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListImageServersRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListImageServersResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListLatestAttachedServerAppRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListLatestAttachedServerAppResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListPersistentStorageRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListPersistentStorageResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListPolicyGroupRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListPolicyGroupResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListPolicyTemplateRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListPolicyTemplateResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListProductRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListProductResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListPublishedAppRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListPublishedAppResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListServerGroupsRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListServerGroupsResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListServerMetricDataRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListServerMetricDataResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListServersRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListServersResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListSessionByUserNameRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListSessionByUserNameResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListSessionTypeRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListSessionTypeResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListSessionsRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListSessionsResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListShareFolderRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListShareFolderResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListStorageAssignmentRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListStorageAssignmentResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListStoragePolicyStatementRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListStoragePolicyStatementResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListTargetsOfPolicyGroupRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListTargetsOfPolicyGroupResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListUserConnectionReq;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListUserConnectionRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListUserConnectionResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListVolumeTypeRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListVolumeTypeResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListWarehouseAppsRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListWarehouseAppsResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.LogoffUserSessionReq;
import com.huaweicloud.sdk.workspaceapp.v1.model.LogoffUserSessionRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.LogoffUserSessionResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.PublishAppReq;
import com.huaweicloud.sdk.workspaceapp.v1.model.PublishAppRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.PublishAppResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.RecreateServerImageRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.RecreateServerImageResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.ReinstallServerReq;
import com.huaweicloud.sdk.workspaceapp.v1.model.ReinstallServerRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.ReinstallServerResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.ServerHaltReq;
import com.huaweicloud.sdk.workspaceapp.v1.model.ShowImageJobRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.ShowImageJobResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.ShowJobDetailRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.ShowJobDetailResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.ShowJobRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.ShowJobResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.ShowOriginalPolicyInfoRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.ShowOriginalPolicyInfoResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.ShowPublishableAppRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.ShowPublishableAppResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.ShowServerVncRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.ShowServerVncResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.UnpublishAppReq;
import com.huaweicloud.sdk.workspaceapp.v1.model.UnpublishAppRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.UnpublishAppResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.UpdateAppGroupReq;
import com.huaweicloud.sdk.workspaceapp.v1.model.UpdateAppGroupRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.UpdateAppGroupResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.UpdateAppReq;
import com.huaweicloud.sdk.workspaceapp.v1.model.UpdateAppRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.UpdateAppResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.UpdateImageServerReq;
import com.huaweicloud.sdk.workspaceapp.v1.model.UpdateImageServerRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.UpdateImageServerResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.UpdatePolicyGroupReq;
import com.huaweicloud.sdk.workspaceapp.v1.model.UpdatePolicyGroupRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.UpdatePolicyGroupResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.UpdatePolicyTemplateReq;
import com.huaweicloud.sdk.workspaceapp.v1.model.UpdatePolicyTemplateRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.UpdatePolicyTemplateResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.UpdateServerGroupReq;
import com.huaweicloud.sdk.workspaceapp.v1.model.UpdateServerGroupRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.UpdateServerGroupResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.UpdateServerReq;
import com.huaweicloud.sdk.workspaceapp.v1.model.UpdateServerRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.UpdateServerResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.UpdateShareFolderAssignmentRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.UpdateShareFolderAssignmentResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.UpdateTsviReq;
import com.huaweicloud.sdk.workspaceapp.v1.model.UpdateUserFolderAssignmentRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.UpdateUserFolderAssignmentResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.UpdateWarehouseAppReq;
import com.huaweicloud.sdk.workspaceapp.v1.model.UpdateWarehouseAppRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.UpdateWarehouseAppResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.UploadAppIconRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.UploadAppIconRequestBody;
import com.huaweicloud.sdk.workspaceapp.v1.model.UploadAppIconResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.UploadWarehouseAppIconRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.UploadWarehouseAppIconRequestBody;
import com.huaweicloud.sdk.workspaceapp.v1.model.UploadWarehouseAppIconResponse;

@SuppressWarnings("unchecked")
public class WorkspaceAppMeta {

    public static final HttpRequestDef<AuthorizeObsRequest, AuthorizeObsResponse> authorizeObs = genForAuthorizeObs();

    private static HttpRequestDef<AuthorizeObsRequest, AuthorizeObsResponse> genForAuthorizeObs() {
        // basic
        HttpRequestDef.Builder<AuthorizeObsRequest, AuthorizeObsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AuthorizeObsRequest.class, AuthorizeObsResponse.class)
                .withName("AuthorizeObs")
                .withUri("/v1/{project_id}/app-warehouse/action/authorize")
                .withContentType("application/json");

        // requests
        builder.<AuthorizeObsReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AuthorizeObsReq.class),
            f -> f.withMarshaller(AuthorizeObsRequest::getBody, AuthorizeObsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteWarehouseAppRequest, BatchDeleteWarehouseAppResponse> batchDeleteWarehouseApp =
        genForBatchDeleteWarehouseApp();

    private static HttpRequestDef<BatchDeleteWarehouseAppRequest, BatchDeleteWarehouseAppResponse> genForBatchDeleteWarehouseApp() {
        // basic
        HttpRequestDef.Builder<BatchDeleteWarehouseAppRequest, BatchDeleteWarehouseAppResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, BatchDeleteWarehouseAppRequest.class, BatchDeleteWarehouseAppResponse.class)
            .withName("BatchDeleteWarehouseApp")
            .withUri("/v1/{project_id}/app-warehouse/actions/batch-delete")
            .withContentType("application/json");

        // requests
        builder.<BatchDeleteWarehouseAppReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchDeleteWarehouseAppReq.class),
            f -> f.withMarshaller(BatchDeleteWarehouseAppRequest::getBody, BatchDeleteWarehouseAppRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateWarehouseAppRequest, CreateWarehouseAppResponse> createWarehouseApp =
        genForCreateWarehouseApp();

    private static HttpRequestDef<CreateWarehouseAppRequest, CreateWarehouseAppResponse> genForCreateWarehouseApp() {
        // basic
        HttpRequestDef.Builder<CreateWarehouseAppRequest, CreateWarehouseAppResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateWarehouseAppRequest.class, CreateWarehouseAppResponse.class)
                .withName("CreateWarehouseApp")
                .withUri("/v1/{project_id}/app-warehouse/apps")
                .withContentType("application/json");

        // requests
        builder.<CreateWarehouseAppReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateWarehouseAppReq.class),
            f -> f.withMarshaller(CreateWarehouseAppRequest::getBody, CreateWarehouseAppRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListWarehouseAppsRequest, ListWarehouseAppsResponse> listWarehouseApps =
        genForListWarehouseApps();

    private static HttpRequestDef<ListWarehouseAppsRequest, ListWarehouseAppsResponse> genForListWarehouseApps() {
        // basic
        HttpRequestDef.Builder<ListWarehouseAppsRequest, ListWarehouseAppsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListWarehouseAppsRequest.class, ListWarehouseAppsResponse.class)
                .withName("ListWarehouseApps")
                .withUri("/v1/{project_id}/app-warehouse/apps")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListWarehouseAppsRequest::getLimit, ListWarehouseAppsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListWarehouseAppsRequest::getOffset, ListWarehouseAppsRequest::setOffset));
        builder.<String>withRequestField("verify_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWarehouseAppsRequest::getVerifyStatus,
                ListWarehouseAppsRequest::setVerifyStatus));
        builder.<String>withRequestField("app_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWarehouseAppsRequest::getAppId, ListWarehouseAppsRequest::setAppId));
        builder.<String>withRequestField("app_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWarehouseAppsRequest::getAppName, ListWarehouseAppsRequest::setAppName));
        builder.<String>withRequestField("app_category",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWarehouseAppsRequest::getAppCategory, ListWarehouseAppsRequest::setAppCategory));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateWarehouseAppRequest, UpdateWarehouseAppResponse> updateWarehouseApp =
        genForUpdateWarehouseApp();

    private static HttpRequestDef<UpdateWarehouseAppRequest, UpdateWarehouseAppResponse> genForUpdateWarehouseApp() {
        // basic
        HttpRequestDef.Builder<UpdateWarehouseAppRequest, UpdateWarehouseAppResponse> builder =
            HttpRequestDef.builder(HttpMethod.PATCH, UpdateWarehouseAppRequest.class, UpdateWarehouseAppResponse.class)
                .withName("UpdateWarehouseApp")
                .withUri("/v1/{project_id}/app-warehouse/apps/{id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateWarehouseAppRequest::getId, UpdateWarehouseAppRequest::setId));
        builder.<UpdateWarehouseAppReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateWarehouseAppReq.class),
            f -> f.withMarshaller(UpdateWarehouseAppRequest::getBody, UpdateWarehouseAppRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UploadWarehouseAppIconRequest, UploadWarehouseAppIconResponse> uploadWarehouseAppIcon =
        genForUploadWarehouseAppIcon();

    private static HttpRequestDef<UploadWarehouseAppIconRequest, UploadWarehouseAppIconResponse> genForUploadWarehouseAppIcon() {
        // basic
        HttpRequestDef.Builder<UploadWarehouseAppIconRequest, UploadWarehouseAppIconResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, UploadWarehouseAppIconRequest.class, UploadWarehouseAppIconResponse.class)
            .withName("UploadWarehouseAppIcon")
            .withUri("/v1/{project_id}/app-warehouse/apps/icon")
            .withContentType("multipart/form-data");

        // requests
        builder.<UploadWarehouseAppIconRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UploadWarehouseAppIconRequestBody.class),
            f -> f.withMarshaller(UploadWarehouseAppIconRequest::getBody, UploadWarehouseAppIconRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPublishedAppRequest, ListPublishedAppResponse> listPublishedApp =
        genForListPublishedApp();

    private static HttpRequestDef<ListPublishedAppRequest, ListPublishedAppResponse> genForListPublishedApp() {
        // basic
        HttpRequestDef.Builder<ListPublishedAppRequest, ListPublishedAppResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListPublishedAppRequest.class, ListPublishedAppResponse.class)
                .withName("ListPublishedApp")
                .withUri("/v1/{project_id}/app-groups/{app_group_id}/apps")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("app_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPublishedAppRequest::getAppGroupId, ListPublishedAppRequest::setAppGroupId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPublishedAppRequest::getLimit, ListPublishedAppRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPublishedAppRequest::getOffset, ListPublishedAppRequest::setOffset));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPublishedAppRequest::getName, ListPublishedAppRequest::setName));
        builder.<String>withRequestField("state",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPublishedAppRequest::getState, ListPublishedAppRequest::setState));
        builder.<String>withRequestField("app_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPublishedAppRequest::getAppId, ListPublishedAppRequest::setAppId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<PublishAppRequest, PublishAppResponse> publishApp = genForPublishApp();

    private static HttpRequestDef<PublishAppRequest, PublishAppResponse> genForPublishApp() {
        // basic
        HttpRequestDef.Builder<PublishAppRequest, PublishAppResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, PublishAppRequest.class, PublishAppResponse.class)
                .withName("PublishApp")
                .withUri("/v1/{project_id}/app-groups/{app_group_id}/apps")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("app_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(PublishAppRequest::getAppGroupId, PublishAppRequest::setAppGroupId));
        builder.<PublishAppReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PublishAppReq.class),
            f -> f.withMarshaller(PublishAppRequest::getBody, PublishAppRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowPublishableAppRequest, ShowPublishableAppResponse> showPublishableApp =
        genForShowPublishableApp();

    private static HttpRequestDef<ShowPublishableAppRequest, ShowPublishableAppResponse> genForShowPublishableApp() {
        // basic
        HttpRequestDef.Builder<ShowPublishableAppRequest, ShowPublishableAppResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowPublishableAppRequest.class, ShowPublishableAppResponse.class)
                .withName("ShowPublishableApp")
                .withUri("/v1/{project_id}/app-groups/{app_group_id}/publishable-app")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("app_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPublishableAppRequest::getAppGroupId, ShowPublishableAppRequest::setAppGroupId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UnpublishAppRequest, UnpublishAppResponse> unpublishApp = genForUnpublishApp();

    private static HttpRequestDef<UnpublishAppRequest, UnpublishAppResponse> genForUnpublishApp() {
        // basic
        HttpRequestDef.Builder<UnpublishAppRequest, UnpublishAppResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UnpublishAppRequest.class, UnpublishAppResponse.class)
                .withName("UnpublishApp")
                .withUri("/v1/{project_id}/app-groups/{app_group_id}/apps/batch-unpublish")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("app_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UnpublishAppRequest::getAppGroupId, UnpublishAppRequest::setAppGroupId));
        builder.<UnpublishAppReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UnpublishAppReq.class),
            f -> f.withMarshaller(UnpublishAppRequest::getBody, UnpublishAppRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateAppRequest, UpdateAppResponse> updateApp = genForUpdateApp();

    private static HttpRequestDef<UpdateAppRequest, UpdateAppResponse> genForUpdateApp() {
        // basic
        HttpRequestDef.Builder<UpdateAppRequest, UpdateAppResponse> builder =
            HttpRequestDef.builder(HttpMethod.PATCH, UpdateAppRequest.class, UpdateAppResponse.class)
                .withName("UpdateApp")
                .withUri("/v1/{project_id}/app-groups/{app_group_id}/apps/{app_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("app_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAppRequest::getAppGroupId, UpdateAppRequest::setAppGroupId));
        builder.<String>withRequestField("app_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAppRequest::getAppId, UpdateAppRequest::setAppId));
        builder.<UpdateAppReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateAppReq.class),
            f -> f.withMarshaller(UpdateAppRequest::getBody, UpdateAppRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UploadAppIconRequest, UploadAppIconResponse> uploadAppIcon =
        genForUploadAppIcon();

    private static HttpRequestDef<UploadAppIconRequest, UploadAppIconResponse> genForUploadAppIcon() {
        // basic
        HttpRequestDef.Builder<UploadAppIconRequest, UploadAppIconResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UploadAppIconRequest.class, UploadAppIconResponse.class)
                .withName("UploadAppIcon")
                .withUri("/v1/{project_id}/app-groups/{app_group_id}/apps/{app_id}/icon")
                .withContentType("multipart/form-data");

        // requests
        builder.<String>withRequestField("app_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UploadAppIconRequest::getAppGroupId, UploadAppIconRequest::setAppGroupId));
        builder.<String>withRequestField("app_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UploadAppIconRequest::getAppId, UploadAppIconRequest::setAppId));
        builder.<UploadAppIconRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UploadAppIconRequestBody.class),
            f -> f.withMarshaller(UploadAppIconRequest::getBody, UploadAppIconRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteAppGroupRequest, BatchDeleteAppGroupResponse> batchDeleteAppGroup =
        genForBatchDeleteAppGroup();

    private static HttpRequestDef<BatchDeleteAppGroupRequest, BatchDeleteAppGroupResponse> genForBatchDeleteAppGroup() {
        // basic
        HttpRequestDef.Builder<BatchDeleteAppGroupRequest, BatchDeleteAppGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchDeleteAppGroupRequest.class, BatchDeleteAppGroupResponse.class)
                .withName("BatchDeleteAppGroup")
                .withUri("/v1/{project_id}/app-groups/batch-delete")
                .withContentType("application/json");

        // requests
        builder.<DeleteAppGroupReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteAppGroupReq.class),
            f -> f.withMarshaller(BatchDeleteAppGroupRequest::getBody, BatchDeleteAppGroupRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateAppGroupRequest, CreateAppGroupResponse> createAppGroup =
        genForCreateAppGroup();

    private static HttpRequestDef<CreateAppGroupRequest, CreateAppGroupResponse> genForCreateAppGroup() {
        // basic
        HttpRequestDef.Builder<CreateAppGroupRequest, CreateAppGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateAppGroupRequest.class, CreateAppGroupResponse.class)
                .withName("CreateAppGroup")
                .withUri("/v1/{project_id}/app-groups")
                .withContentType("application/json");

        // requests
        builder.<CreateAppGroupReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateAppGroupReq.class),
            f -> f.withMarshaller(CreateAppGroupRequest::getBody, CreateAppGroupRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAppGroupRequest, ListAppGroupResponse> listAppGroup = genForListAppGroup();

    private static HttpRequestDef<ListAppGroupRequest, ListAppGroupResponse> genForListAppGroup() {
        // basic
        HttpRequestDef.Builder<ListAppGroupRequest, ListAppGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAppGroupRequest.class, ListAppGroupResponse.class)
                .withName("ListAppGroup")
                .withUri("/v1/{project_id}/app-groups")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAppGroupRequest::getLimit, ListAppGroupRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAppGroupRequest::getOffset, ListAppGroupRequest::setOffset));
        builder.<String>withRequestField("app_server_group_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppGroupRequest::getAppServerGroupId, ListAppGroupRequest::setAppServerGroupId));
        builder.<String>withRequestField("app_group_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppGroupRequest::getAppGroupId, ListAppGroupRequest::setAppGroupId));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppGroupRequest::getName, ListAppGroupRequest::setName));
        builder.<String>withRequestField("authorization_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppGroupRequest::getAuthorizationType,
                ListAppGroupRequest::setAuthorizationType));
        builder.<String>withRequestField("app_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppGroupRequest::getAppType, ListAppGroupRequest::setAppType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateAppGroupRequest, UpdateAppGroupResponse> updateAppGroup =
        genForUpdateAppGroup();

    private static HttpRequestDef<UpdateAppGroupRequest, UpdateAppGroupResponse> genForUpdateAppGroup() {
        // basic
        HttpRequestDef.Builder<UpdateAppGroupRequest, UpdateAppGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.PATCH, UpdateAppGroupRequest.class, UpdateAppGroupResponse.class)
                .withName("UpdateAppGroup")
                .withUri("/v1/{project_id}/app-groups/{app_group_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("app_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAppGroupRequest::getAppGroupId, UpdateAppGroupRequest::setAppGroupId));
        builder.<UpdateAppGroupReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateAppGroupReq.class),
            f -> f.withMarshaller(UpdateAppGroupRequest::getBody, UpdateAppGroupRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListProductRequest, ListProductResponse> listProduct = genForListProduct();

    private static HttpRequestDef<ListProductRequest, ListProductResponse> genForListProduct() {
        // basic
        HttpRequestDef.Builder<ListProductRequest, ListProductResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListProductRequest.class, ListProductResponse.class)
                .withName("ListProduct")
                .withUri("/v1/{project_id}/product")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("product_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProductRequest::getProductId, ListProductRequest::setProductId));
        builder.<String>withRequestField("flavor_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProductRequest::getFlavorId, ListProductRequest::setFlavorId));
        builder.<String>withRequestField("availability_zone",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProductRequest::getAvailabilityZone, ListProductRequest::setAvailabilityZone));
        builder.<String>withRequestField("os_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProductRequest::getOsType, ListProductRequest::setOsType));
        builder.<String>withRequestField("charge_mode",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProductRequest::getChargeMode, ListProductRequest::setChargeMode));
        builder.<String>withRequestField("architecture",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProductRequest::getArchitecture, ListProductRequest::setArchitecture));
        builder.<String>withRequestField("package_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProductRequest::getPackageType, ListProductRequest::setPackageType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSessionTypeRequest, ListSessionTypeResponse> listSessionType =
        genForListSessionType();

    private static HttpRequestDef<ListSessionTypeRequest, ListSessionTypeResponse> genForListSessionType() {
        // basic
        HttpRequestDef.Builder<ListSessionTypeRequest, ListSessionTypeResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListSessionTypeRequest.class, ListSessionTypeResponse.class)
                .withName("ListSessionType")
                .withUri("/v1/{project_id}/session-type")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddAppGroupAuthorizationRequest, AddAppGroupAuthorizationResponse> addAppGroupAuthorization =
        genForAddAppGroupAuthorization();

    private static HttpRequestDef<AddAppGroupAuthorizationRequest, AddAppGroupAuthorizationResponse> genForAddAppGroupAuthorization() {
        // basic
        HttpRequestDef.Builder<AddAppGroupAuthorizationRequest, AddAppGroupAuthorizationResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, AddAppGroupAuthorizationRequest.class, AddAppGroupAuthorizationResponse.class)
                .withName("AddAppGroupAuthorization")
                .withUri("/v1/{project_id}/app-groups/authorizations")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddAppGroupAuthorizationRequest::getXLanguage,
                AddAppGroupAuthorizationRequest::setXLanguage));
        builder.<AppGroupAuthorizeReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AppGroupAuthorizeReq.class),
            f -> f.withMarshaller(AddAppGroupAuthorizationRequest::getBody, AddAppGroupAuthorizationRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteAppGroupAuthorizationRequest, BatchDeleteAppGroupAuthorizationResponse> batchDeleteAppGroupAuthorization =
        genForBatchDeleteAppGroupAuthorization();

    private static HttpRequestDef<BatchDeleteAppGroupAuthorizationRequest, BatchDeleteAppGroupAuthorizationResponse> genForBatchDeleteAppGroupAuthorization() {
        // basic
        HttpRequestDef.Builder<BatchDeleteAppGroupAuthorizationRequest, BatchDeleteAppGroupAuthorizationResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    BatchDeleteAppGroupAuthorizationRequest.class,
                    BatchDeleteAppGroupAuthorizationResponse.class)
                .withName("BatchDeleteAppGroupAuthorization")
                .withUri("/v1/{project_id}/app-groups/actions/batch-delete-authorization")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeleteAppGroupAuthorizationRequest::getXLanguage,
                BatchDeleteAppGroupAuthorizationRequest::setXLanguage));
        builder.<AppGroupAuthorizeReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AppGroupAuthorizeReq.class),
            f -> f.withMarshaller(BatchDeleteAppGroupAuthorizationRequest::getBody,
                BatchDeleteAppGroupAuthorizationRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAppGroupAuthorizationRequest, ListAppGroupAuthorizationResponse> listAppGroupAuthorization =
        genForListAppGroupAuthorization();

    private static HttpRequestDef<ListAppGroupAuthorizationRequest, ListAppGroupAuthorizationResponse> genForListAppGroupAuthorization() {
        // basic
        HttpRequestDef.Builder<ListAppGroupAuthorizationRequest, ListAppGroupAuthorizationResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListAppGroupAuthorizationRequest.class,
                    ListAppGroupAuthorizationResponse.class)
                .withName("ListAppGroupAuthorization")
                .withUri("/v1/{project_id}/app-groups/actions/list-authorizations")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAppGroupAuthorizationRequest::getLimit,
                ListAppGroupAuthorizationRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAppGroupAuthorizationRequest::getOffset,
                ListAppGroupAuthorizationRequest::setOffset));
        builder.<String>withRequestField("app_group_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppGroupAuthorizationRequest::getAppGroupId,
                ListAppGroupAuthorizationRequest::setAppGroupId));
        builder.<String>withRequestField("account",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppGroupAuthorizationRequest::getAccount,
                ListAppGroupAuthorizationRequest::setAccount));
        builder.<String>withRequestField("account_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppGroupAuthorizationRequest::getAccountType,
                ListAppGroupAuthorizationRequest::setAccountType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAvailabilityZoneRequest, ListAvailabilityZoneResponse> listAvailabilityZone =
        genForListAvailabilityZone();

    private static HttpRequestDef<ListAvailabilityZoneRequest, ListAvailabilityZoneResponse> genForListAvailabilityZone() {
        // basic
        HttpRequestDef.Builder<ListAvailabilityZoneRequest, ListAvailabilityZoneResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListAvailabilityZoneRequest.class, ListAvailabilityZoneResponse.class)
            .withName("ListAvailabilityZone")
            .withUri("/v1/{project_id}/availability-zone")
            .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AttachImageServerAppRequest, AttachImageServerAppResponse> attachImageServerApp =
        genForAttachImageServerApp();

    private static HttpRequestDef<AttachImageServerAppRequest, AttachImageServerAppResponse> genForAttachImageServerApp() {
        // basic
        HttpRequestDef.Builder<AttachImageServerAppRequest, AttachImageServerAppResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, AttachImageServerAppRequest.class, AttachImageServerAppResponse.class)
            .withName("AttachImageServerApp")
            .withUri("/v1/{project_id}/image-servers/{server_id}/actions/attach-app")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("server_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AttachImageServerAppRequest::getServerId, AttachImageServerAppRequest::setServerId));
        builder.<AttachServerAppReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AttachServerAppReq.class),
            f -> f.withMarshaller(AttachImageServerAppRequest::getBody, AttachImageServerAppRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteImageServerRequest, BatchDeleteImageServerResponse> batchDeleteImageServer =
        genForBatchDeleteImageServer();

    private static HttpRequestDef<BatchDeleteImageServerRequest, BatchDeleteImageServerResponse> genForBatchDeleteImageServer() {
        // basic
        HttpRequestDef.Builder<BatchDeleteImageServerRequest, BatchDeleteImageServerResponse> builder = HttpRequestDef
            .builder(HttpMethod.PATCH, BatchDeleteImageServerRequest.class, BatchDeleteImageServerResponse.class)
            .withName("BatchDeleteImageServer")
            .withUri("/v1/{project_id}/image-servers/actions/batch-delete")
            .withContentType("application/json");

        // requests
        builder.<BatchDeleteImageServerReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchDeleteImageServerReq.class),
            f -> f.withMarshaller(BatchDeleteImageServerRequest::getBody, BatchDeleteImageServerRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateImageServerRequest, CreateImageServerResponse> createImageServer =
        genForCreateImageServer();

    private static HttpRequestDef<CreateImageServerRequest, CreateImageServerResponse> genForCreateImageServer() {
        // basic
        HttpRequestDef.Builder<CreateImageServerRequest, CreateImageServerResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateImageServerRequest.class, CreateImageServerResponse.class)
                .withName("CreateImageServer")
                .withUri("/v1/{project_id}/image-servers")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("Service-Transaction-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateImageServerRequest::getServiceTransactionId,
                CreateImageServerRequest::setServiceTransactionId));
        builder.<CreateImageServerReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateImageServerReq.class),
            f -> f.withMarshaller(CreateImageServerRequest::getBody, CreateImageServerRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListImageServersRequest, ListImageServersResponse> listImageServers =
        genForListImageServers();

    private static HttpRequestDef<ListImageServersRequest, ListImageServersResponse> genForListImageServers() {
        // basic
        HttpRequestDef.Builder<ListImageServersRequest, ListImageServersResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListImageServersRequest.class, ListImageServersResponse.class)
                .withName("ListImageServers")
                .withUri("/v1/{project_id}/image-servers")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListImageServersRequest::getOffset, ListImageServersRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListImageServersRequest::getLimit, ListImageServersRequest::setLimit));
        builder.<String>withRequestField("server_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImageServersRequest::getServerName, ListImageServersRequest::setServerName));
        builder.<String>withRequestField("server_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImageServersRequest::getServerId, ListImageServersRequest::setServerId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImageServersRequest::getEnterpriseProjectId,
                ListImageServersRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListLatestAttachedServerAppRequest, ListLatestAttachedServerAppResponse> listLatestAttachedServerApp =
        genForListLatestAttachedServerApp();

    private static HttpRequestDef<ListLatestAttachedServerAppRequest, ListLatestAttachedServerAppResponse> genForListLatestAttachedServerApp() {
        // basic
        HttpRequestDef.Builder<ListLatestAttachedServerAppRequest, ListLatestAttachedServerAppResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListLatestAttachedServerAppRequest.class,
                    ListLatestAttachedServerAppResponse.class)
                .withName("ListLatestAttachedServerApp")
                .withUri("/v1/{project_id}/image-servers/{server_id}/actions/latest-attached-app")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("server_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLatestAttachedServerAppRequest::getServerId,
                ListLatestAttachedServerAppRequest::setServerId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RecreateServerImageRequest, RecreateServerImageResponse> recreateServerImage =
        genForRecreateServerImage();

    private static HttpRequestDef<RecreateServerImageRequest, RecreateServerImageResponse> genForRecreateServerImage() {
        // basic
        HttpRequestDef.Builder<RecreateServerImageRequest, RecreateServerImageResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RecreateServerImageRequest.class, RecreateServerImageResponse.class)
                .withName("RecreateServerImage")
                .withUri("/v1/{project_id}/image-servers/{server_id}/actions/recreate-image")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("server_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RecreateServerImageRequest::getServerId, RecreateServerImageRequest::setServerId));
        builder.<CreateServerImageReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateServerImageReq.class),
            f -> f.withMarshaller(RecreateServerImageRequest::getBody, RecreateServerImageRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateImageServerRequest, UpdateImageServerResponse> updateImageServer =
        genForUpdateImageServer();

    private static HttpRequestDef<UpdateImageServerRequest, UpdateImageServerResponse> genForUpdateImageServer() {
        // basic
        HttpRequestDef.Builder<UpdateImageServerRequest, UpdateImageServerResponse> builder =
            HttpRequestDef.builder(HttpMethod.PATCH, UpdateImageServerRequest.class, UpdateImageServerResponse.class)
                .withName("UpdateImageServer")
                .withUri("/v1/{project_id}/image-servers/{server_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("server_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateImageServerRequest::getServerId, UpdateImageServerRequest::setServerId));
        builder.<UpdateImageServerReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateImageServerReq.class),
            f -> f.withMarshaller(UpdateImageServerRequest::getBody, UpdateImageServerRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowImageJobRequest, ShowImageJobResponse> showImageJob = genForShowImageJob();

    private static HttpRequestDef<ShowImageJobRequest, ShowImageJobResponse> genForShowImageJob() {
        // basic
        HttpRequestDef.Builder<ShowImageJobRequest, ShowImageJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowImageJobRequest.class, ShowImageJobResponse.class)
                .withName("ShowImageJob")
                .withUri("/v1/{project_id}/image-server-jobs/{job_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowImageJobRequest::getJobId, ShowImageJobRequest::setJobId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowJobRequest, ShowJobResponse> showJob = genForShowJob();

    private static HttpRequestDef<ShowJobRequest, ShowJobResponse> genForShowJob() {
        // basic
        HttpRequestDef.Builder<ShowJobRequest, ShowJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowJobRequest.class, ShowJobResponse.class)
                .withName("ShowJob")
                .withUri("/v1/{project_id}/job/{job_id}")
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

    public static final HttpRequestDef<ShowJobDetailRequest, ShowJobDetailResponse> showJobDetail =
        genForShowJobDetail();

    private static HttpRequestDef<ShowJobDetailRequest, ShowJobDetailResponse> genForShowJobDetail() {
        // basic
        HttpRequestDef.Builder<ShowJobDetailRequest, ShowJobDetailResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowJobDetailRequest.class, ShowJobDetailResponse.class)
                .withName("ShowJobDetail")
                .withUri("/v2/{project_id}/job/{job_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJobDetailRequest::getJobId, ShowJobDetailRequest::setJobId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateOrUpdateStoragePolicyStatementRequest, CreateOrUpdateStoragePolicyStatementResponse> createOrUpdateStoragePolicyStatement =
        genForCreateOrUpdateStoragePolicyStatement();

    private static HttpRequestDef<CreateOrUpdateStoragePolicyStatementRequest, CreateOrUpdateStoragePolicyStatementResponse> genForCreateOrUpdateStoragePolicyStatement() {
        // basic
        HttpRequestDef.Builder<CreateOrUpdateStoragePolicyStatementRequest, CreateOrUpdateStoragePolicyStatementResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    CreateOrUpdateStoragePolicyStatementRequest.class,
                    CreateOrUpdateStoragePolicyStatementResponse.class)
                .withName("CreateOrUpdateStoragePolicyStatement")
                .withUri("/v1/{project_id}/storages-policy/actions/create-statements")
                .withContentType("application/json");

        // requests
        builder.<CreateOrUpdateStoragePolicyStatementReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateOrUpdateStoragePolicyStatementReq.class),
            f -> f.withMarshaller(CreateOrUpdateStoragePolicyStatementRequest::getBody,
                CreateOrUpdateStoragePolicyStatementRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreatePersistentStorageRequest, CreatePersistentStorageResponse> createPersistentStorage =
        genForCreatePersistentStorage();

    private static HttpRequestDef<CreatePersistentStorageRequest, CreatePersistentStorageResponse> genForCreatePersistentStorage() {
        // basic
        HttpRequestDef.Builder<CreatePersistentStorageRequest, CreatePersistentStorageResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreatePersistentStorageRequest.class, CreatePersistentStorageResponse.class)
            .withName("CreatePersistentStorage")
            .withUri("/v1/{project_id}/persistent-storages")
            .withContentType("application/json");

        // requests
        builder.<CreatePersistentStorageReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreatePersistentStorageReq.class),
            f -> f.withMarshaller(CreatePersistentStorageRequest::getBody, CreatePersistentStorageRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateShareFolderRequest, CreateShareFolderResponse> createShareFolder =
        genForCreateShareFolder();

    private static HttpRequestDef<CreateShareFolderRequest, CreateShareFolderResponse> genForCreateShareFolder() {
        // basic
        HttpRequestDef.Builder<CreateShareFolderRequest, CreateShareFolderResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateShareFolderRequest.class, CreateShareFolderResponse.class)
                .withName("CreateShareFolder")
                .withUri("/v1/{project_id}/persistent-storages/{storage_id}/actions/create-share-folder")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("storage_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateShareFolderRequest::getStorageId, CreateShareFolderRequest::setStorageId));
        builder.<CreateShareFolderReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateShareFolderReq.class),
            f -> f.withMarshaller(CreateShareFolderRequest::getBody, CreateShareFolderRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeletePersistentStorageRequest, DeletePersistentStorageResponse> deletePersistentStorage =
        genForDeletePersistentStorage();

    private static HttpRequestDef<DeletePersistentStorageRequest, DeletePersistentStorageResponse> genForDeletePersistentStorage() {
        // basic
        HttpRequestDef.Builder<DeletePersistentStorageRequest, DeletePersistentStorageResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeletePersistentStorageRequest.class, DeletePersistentStorageResponse.class)
            .withName("DeletePersistentStorage")
            .withUri("/v1/{project_id}/persistent-storages/{storage_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("storage_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletePersistentStorageRequest::getStorageId,
                DeletePersistentStorageRequest::setStorageId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteStorageClaimRequest, DeleteStorageClaimResponse> deleteStorageClaim =
        genForDeleteStorageClaim();

    private static HttpRequestDef<DeleteStorageClaimRequest, DeleteStorageClaimResponse> genForDeleteStorageClaim() {
        // basic
        HttpRequestDef.Builder<DeleteStorageClaimRequest, DeleteStorageClaimResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, DeleteStorageClaimRequest.class, DeleteStorageClaimResponse.class)
                .withName("DeleteStorageClaim")
                .withUri("/v1/{project_id}/persistent-storages/{storage_id}/actions/delete-storage-claim")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("storage_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteStorageClaimRequest::getStorageId, DeleteStorageClaimRequest::setStorageId));
        builder.<DeleteStorageClaimReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteStorageClaimReq.class),
            f -> f.withMarshaller(DeleteStorageClaimRequest::getBody, DeleteStorageClaimRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteUserStorageAttachmentRequest, DeleteUserStorageAttachmentResponse> deleteUserStorageAttachment =
        genForDeleteUserStorageAttachment();

    private static HttpRequestDef<DeleteUserStorageAttachmentRequest, DeleteUserStorageAttachmentResponse> genForDeleteUserStorageAttachment() {
        // basic
        HttpRequestDef.Builder<DeleteUserStorageAttachmentRequest, DeleteUserStorageAttachmentResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    DeleteUserStorageAttachmentRequest.class,
                    DeleteUserStorageAttachmentResponse.class)
                .withName("DeleteUserStorageAttachment")
                .withUri("/v1/{project_id}/persistent-storages/{storage_id}/actions/delete-user-attachment")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("storage_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteUserStorageAttachmentRequest::getStorageId,
                DeleteUserStorageAttachmentRequest::setStorageId));
        builder.<DeleteUserStorageAttachmentReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteUserStorageAttachmentReq.class),
            f -> f.withMarshaller(DeleteUserStorageAttachmentRequest::getBody,
                DeleteUserStorageAttachmentRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPersistentStorageRequest, ListPersistentStorageResponse> listPersistentStorage =
        genForListPersistentStorage();

    private static HttpRequestDef<ListPersistentStorageRequest, ListPersistentStorageResponse> genForListPersistentStorage() {
        // basic
        HttpRequestDef.Builder<ListPersistentStorageRequest, ListPersistentStorageResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListPersistentStorageRequest.class, ListPersistentStorageResponse.class)
            .withName("ListPersistentStorage")
            .withUri("/v1/{project_id}/persistent-storages")
            .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPersistentStorageRequest::getOffset, ListPersistentStorageRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPersistentStorageRequest::getLimit, ListPersistentStorageRequest::setLimit));
        builder.<String>withRequestField("storage_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPersistentStorageRequest::getStorageId,
                ListPersistentStorageRequest::setStorageId));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPersistentStorageRequest::getName, ListPersistentStorageRequest::setName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListShareFolderRequest, ListShareFolderResponse> listShareFolder =
        genForListShareFolder();

    private static HttpRequestDef<ListShareFolderRequest, ListShareFolderResponse> genForListShareFolder() {
        // basic
        HttpRequestDef.Builder<ListShareFolderRequest, ListShareFolderResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListShareFolderRequest.class, ListShareFolderResponse.class)
                .withName("ListShareFolder")
                .withUri("/v1/{project_id}/persistent-storages/actions/list-share-folders")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListShareFolderRequest::getOffset, ListShareFolderRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListShareFolderRequest::getLimit, ListShareFolderRequest::setLimit));
        builder.<String>withRequestField("storage_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListShareFolderRequest::getStorageId, ListShareFolderRequest::setStorageId));
        builder.<String>withRequestField("storage_claim_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListShareFolderRequest::getStorageClaimId,
                ListShareFolderRequest::setStorageClaimId));
        builder.<String>withRequestField("path",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListShareFolderRequest::getPath, ListShareFolderRequest::setPath));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListStorageAssignmentRequest, ListStorageAssignmentResponse> listStorageAssignment =
        genForListStorageAssignment();

    private static HttpRequestDef<ListStorageAssignmentRequest, ListStorageAssignmentResponse> genForListStorageAssignment() {
        // basic
        HttpRequestDef.Builder<ListStorageAssignmentRequest, ListStorageAssignmentResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListStorageAssignmentRequest.class, ListStorageAssignmentResponse.class)
            .withName("ListStorageAssignment")
            .withUri("/v1/{project_id}/persistent-storages/actions/list-attachments")
            .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListStorageAssignmentRequest::getOffset, ListStorageAssignmentRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListStorageAssignmentRequest::getLimit, ListStorageAssignmentRequest::setLimit));
        builder.<String>withRequestField("storage_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStorageAssignmentRequest::getStorageId,
                ListStorageAssignmentRequest::setStorageId));
        builder.<String>withRequestField("claim_mode",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStorageAssignmentRequest::getClaimMode,
                ListStorageAssignmentRequest::setClaimMode));
        builder.<String>withRequestField("storage_claim_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStorageAssignmentRequest::getStorageClaimId,
                ListStorageAssignmentRequest::setStorageClaimId));
        builder.<String>withRequestField("attach",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStorageAssignmentRequest::getAttach, ListStorageAssignmentRequest::setAttach));
        builder.<String>withRequestField("attach_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStorageAssignmentRequest::getAttachType,
                ListStorageAssignmentRequest::setAttachType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListStoragePolicyStatementRequest, ListStoragePolicyStatementResponse> listStoragePolicyStatement =
        genForListStoragePolicyStatement();

    private static HttpRequestDef<ListStoragePolicyStatementRequest, ListStoragePolicyStatementResponse> genForListStoragePolicyStatement() {
        // basic
        HttpRequestDef.Builder<ListStoragePolicyStatementRequest, ListStoragePolicyStatementResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListStoragePolicyStatementRequest.class,
                    ListStoragePolicyStatementResponse.class)
                .withName("ListStoragePolicyStatement")
                .withUri("/v1/{project_id}/storages-policy/actions/list-statements")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListStoragePolicyStatementRequest::getOffset,
                ListStoragePolicyStatementRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListStoragePolicyStatementRequest::getLimit,
                ListStoragePolicyStatementRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateShareFolderAssignmentRequest, UpdateShareFolderAssignmentResponse> updateShareFolderAssignment =
        genForUpdateShareFolderAssignment();

    private static HttpRequestDef<UpdateShareFolderAssignmentRequest, UpdateShareFolderAssignmentResponse> genForUpdateShareFolderAssignment() {
        // basic
        HttpRequestDef.Builder<UpdateShareFolderAssignmentRequest, UpdateShareFolderAssignmentResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    UpdateShareFolderAssignmentRequest.class,
                    UpdateShareFolderAssignmentResponse.class)
                .withName("UpdateShareFolderAssignment")
                .withUri("/v1/{project_id}/persistent-storages/{storage_id}/actions/assign-share-folder")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("storage_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateShareFolderAssignmentRequest::getStorageId,
                UpdateShareFolderAssignmentRequest::setStorageId));
        builder.<AssignShareFolderReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AssignShareFolderReq.class),
            f -> f.withMarshaller(UpdateShareFolderAssignmentRequest::getBody,
                UpdateShareFolderAssignmentRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateUserFolderAssignmentRequest, UpdateUserFolderAssignmentResponse> updateUserFolderAssignment =
        genForUpdateUserFolderAssignment();

    private static HttpRequestDef<UpdateUserFolderAssignmentRequest, UpdateUserFolderAssignmentResponse> genForUpdateUserFolderAssignment() {
        // basic
        HttpRequestDef.Builder<UpdateUserFolderAssignmentRequest, UpdateUserFolderAssignmentResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    UpdateUserFolderAssignmentRequest.class,
                    UpdateUserFolderAssignmentResponse.class)
                .withName("UpdateUserFolderAssignment")
                .withUri("/v1/{project_id}/persistent-storages/{storage_id}/actions/assign-folder")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("storage_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateUserFolderAssignmentRequest::getStorageId,
                UpdateUserFolderAssignmentRequest::setStorageId));
        builder.<AssignUserFolderReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AssignUserFolderReq.class),
            f -> f.withMarshaller(UpdateUserFolderAssignmentRequest::getBody,
                UpdateUserFolderAssignmentRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreatePolicyGroupRequest, CreatePolicyGroupResponse> createPolicyGroup =
        genForCreatePolicyGroup();

    private static HttpRequestDef<CreatePolicyGroupRequest, CreatePolicyGroupResponse> genForCreatePolicyGroup() {
        // basic
        HttpRequestDef.Builder<CreatePolicyGroupRequest, CreatePolicyGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreatePolicyGroupRequest.class, CreatePolicyGroupResponse.class)
                .withName("CreatePolicyGroup")
                .withUri("/v1/{project_id}/policy-groups")
                .withContentType("application/json");

        // requests
        builder.<CreatePolicyGroupReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreatePolicyGroupReq.class),
            f -> f.withMarshaller(CreatePolicyGroupRequest::getBody, CreatePolicyGroupRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreatePolicyTemplateRequest, CreatePolicyTemplateResponse> createPolicyTemplate =
        genForCreatePolicyTemplate();

    private static HttpRequestDef<CreatePolicyTemplateRequest, CreatePolicyTemplateResponse> genForCreatePolicyTemplate() {
        // basic
        HttpRequestDef.Builder<CreatePolicyTemplateRequest, CreatePolicyTemplateResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreatePolicyTemplateRequest.class, CreatePolicyTemplateResponse.class)
            .withName("CreatePolicyTemplate")
            .withUri("/v1/{project_id}/policy-templates")
            .withContentType("application/json");

        // requests
        builder.<CreatePolicyTemplateReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreatePolicyTemplateReq.class),
            f -> f.withMarshaller(CreatePolicyTemplateRequest::getBody, CreatePolicyTemplateRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeletePolicyGroupRequest, DeletePolicyGroupResponse> deletePolicyGroup =
        genForDeletePolicyGroup();

    private static HttpRequestDef<DeletePolicyGroupRequest, DeletePolicyGroupResponse> genForDeletePolicyGroup() {
        // basic
        HttpRequestDef.Builder<DeletePolicyGroupRequest, DeletePolicyGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeletePolicyGroupRequest.class, DeletePolicyGroupResponse.class)
                .withName("DeletePolicyGroup")
                .withUri("/v1/{project_id}/policy-groups/{policy_group_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletePolicyGroupRequest::getPolicyGroupId,
                DeletePolicyGroupRequest::setPolicyGroupId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeletePolicyTemplateRequest, DeletePolicyTemplateResponse> deletePolicyTemplate =
        genForDeletePolicyTemplate();

    private static HttpRequestDef<DeletePolicyTemplateRequest, DeletePolicyTemplateResponse> genForDeletePolicyTemplate() {
        // basic
        HttpRequestDef.Builder<DeletePolicyTemplateRequest, DeletePolicyTemplateResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeletePolicyTemplateRequest.class, DeletePolicyTemplateResponse.class)
            .withName("DeletePolicyTemplate")
            .withUri("/v1/{project_id}/policy-templates/{policy_template_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_template_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletePolicyTemplateRequest::getPolicyTemplateId,
                DeletePolicyTemplateRequest::setPolicyTemplateId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPolicyGroupRequest, ListPolicyGroupResponse> listPolicyGroup =
        genForListPolicyGroup();

    private static HttpRequestDef<ListPolicyGroupRequest, ListPolicyGroupResponse> genForListPolicyGroup() {
        // basic
        HttpRequestDef.Builder<ListPolicyGroupRequest, ListPolicyGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListPolicyGroupRequest.class, ListPolicyGroupResponse.class)
                .withName("ListPolicyGroup")
                .withUri("/v1/{project_id}/policy-groups")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPolicyGroupRequest::getOffset, ListPolicyGroupRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPolicyGroupRequest::getLimit, ListPolicyGroupRequest::setLimit));
        builder.<String>withRequestField("policy_group_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPolicyGroupRequest::getPolicyGroupName,
                ListPolicyGroupRequest::setPolicyGroupName));
        builder.<Integer>withRequestField("policy_group_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPolicyGroupRequest::getPolicyGroupType,
                ListPolicyGroupRequest::setPolicyGroupType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPolicyTemplateRequest, ListPolicyTemplateResponse> listPolicyTemplate =
        genForListPolicyTemplate();

    private static HttpRequestDef<ListPolicyTemplateRequest, ListPolicyTemplateResponse> genForListPolicyTemplate() {
        // basic
        HttpRequestDef.Builder<ListPolicyTemplateRequest, ListPolicyTemplateResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListPolicyTemplateRequest.class, ListPolicyTemplateResponse.class)
                .withName("ListPolicyTemplate")
                .withUri("/v1/{project_id}/policy-templates")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPolicyTemplateRequest::getOffset, ListPolicyTemplateRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPolicyTemplateRequest::getLimit, ListPolicyTemplateRequest::setLimit));
        builder.<String>withRequestField("policy_group_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPolicyTemplateRequest::getPolicyGroupName,
                ListPolicyTemplateRequest::setPolicyGroupName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTargetsOfPolicyGroupRequest, ListTargetsOfPolicyGroupResponse> listTargetsOfPolicyGroup =
        genForListTargetsOfPolicyGroup();

    private static HttpRequestDef<ListTargetsOfPolicyGroupRequest, ListTargetsOfPolicyGroupResponse> genForListTargetsOfPolicyGroup() {
        // basic
        HttpRequestDef.Builder<ListTargetsOfPolicyGroupRequest, ListTargetsOfPolicyGroupResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ListTargetsOfPolicyGroupRequest.class, ListTargetsOfPolicyGroupResponse.class)
                .withName("ListTargetsOfPolicyGroup")
                .withUri("/v1/{project_id}/policy-groups/{policy_group_id}/target")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTargetsOfPolicyGroupRequest::getPolicyGroupId,
                ListTargetsOfPolicyGroupRequest::setPolicyGroupId));
        builder.<String>withRequestField("target_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTargetsOfPolicyGroupRequest::getTargetType,
                ListTargetsOfPolicyGroupRequest::setTargetType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowOriginalPolicyInfoRequest, ShowOriginalPolicyInfoResponse> showOriginalPolicyInfo =
        genForShowOriginalPolicyInfo();

    private static HttpRequestDef<ShowOriginalPolicyInfoRequest, ShowOriginalPolicyInfoResponse> genForShowOriginalPolicyInfo() {
        // basic
        HttpRequestDef.Builder<ShowOriginalPolicyInfoRequest, ShowOriginalPolicyInfoResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowOriginalPolicyInfoRequest.class, ShowOriginalPolicyInfoResponse.class)
            .withName("ShowOriginalPolicyInfo")
            .withUri("/v1/{project_id}/policy-groups/actions/list-original-policy")
            .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdatePolicyGroupRequest, UpdatePolicyGroupResponse> updatePolicyGroup =
        genForUpdatePolicyGroup();

    private static HttpRequestDef<UpdatePolicyGroupRequest, UpdatePolicyGroupResponse> genForUpdatePolicyGroup() {
        // basic
        HttpRequestDef.Builder<UpdatePolicyGroupRequest, UpdatePolicyGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.PATCH, UpdatePolicyGroupRequest.class, UpdatePolicyGroupResponse.class)
                .withName("UpdatePolicyGroup")
                .withUri("/v1/{project_id}/policy-groups/{policy_group_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePolicyGroupRequest::getPolicyGroupId,
                UpdatePolicyGroupRequest::setPolicyGroupId));
        builder.<UpdatePolicyGroupReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdatePolicyGroupReq.class),
            f -> f.withMarshaller(UpdatePolicyGroupRequest::getBody, UpdatePolicyGroupRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdatePolicyTemplateRequest, UpdatePolicyTemplateResponse> updatePolicyTemplate =
        genForUpdatePolicyTemplate();

    private static HttpRequestDef<UpdatePolicyTemplateRequest, UpdatePolicyTemplateResponse> genForUpdatePolicyTemplate() {
        // basic
        HttpRequestDef.Builder<UpdatePolicyTemplateRequest, UpdatePolicyTemplateResponse> builder = HttpRequestDef
            .builder(HttpMethod.PATCH, UpdatePolicyTemplateRequest.class, UpdatePolicyTemplateResponse.class)
            .withName("UpdatePolicyTemplate")
            .withUri("/v1/{project_id}/policy-templates/{policy_template_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_template_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePolicyTemplateRequest::getPolicyTemplateId,
                UpdatePolicyTemplateRequest::setPolicyTemplateId));
        builder.<UpdatePolicyTemplateReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdatePolicyTemplateReq.class),
            f -> f.withMarshaller(UpdatePolicyTemplateRequest::getBody, UpdatePolicyTemplateRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CheckQuotaRequest, CheckQuotaResponse> checkQuota = genForCheckQuota();

    private static HttpRequestDef<CheckQuotaRequest, CheckQuotaResponse> genForCheckQuota() {
        // basic
        HttpRequestDef.Builder<CheckQuotaRequest, CheckQuotaResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, CheckQuotaRequest.class, CheckQuotaResponse.class)
                .withName("CheckQuota")
                .withUri("/v1/{project_id}/check/quota")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("product_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CheckQuotaRequest::getProductId, CheckQuotaRequest::setProductId));
        builder.<String>withRequestField("flavor_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CheckQuotaRequest::getFlavorId, CheckQuotaRequest::setFlavorId));
        builder.<Integer>withRequestField("subscription_num",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(CheckQuotaRequest::getSubscriptionNum, CheckQuotaRequest::setSubscriptionNum));
        builder.<Integer>withRequestField("disk_size",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(CheckQuotaRequest::getDiskSize, CheckQuotaRequest::setDiskSize));
        builder.<Integer>withRequestField("disk_num",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(CheckQuotaRequest::getDiskNum, CheckQuotaRequest::setDiskNum));
        builder.<Boolean>withRequestField("is_period",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(CheckQuotaRequest::getIsPeriod, CheckQuotaRequest::setIsPeriod));
        builder.<String>withRequestField("deh_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CheckQuotaRequest::getDehId, CheckQuotaRequest::setDehId));
        builder.<String>withRequestField("cluster_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CheckQuotaRequest::getClusterId, CheckQuotaRequest::setClusterId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteServerRequest, BatchDeleteServerResponse> batchDeleteServer =
        genForBatchDeleteServer();

    private static HttpRequestDef<BatchDeleteServerRequest, BatchDeleteServerResponse> genForBatchDeleteServer() {
        // basic
        HttpRequestDef.Builder<BatchDeleteServerRequest, BatchDeleteServerResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchDeleteServerRequest.class, BatchDeleteServerResponse.class)
                .withName("BatchDeleteServer")
                .withUri("/v1/{project_id}/app-servers/actions/batch-delete")
                .withContentType("application/json");

        // requests
        builder.<BatchDeleteServerReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchDeleteServerReq.class),
            f -> f.withMarshaller(BatchDeleteServerRequest::getBody, BatchDeleteServerRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchMigrateHostsServerRequest, BatchMigrateHostsServerResponse> batchMigrateHostsServer =
        genForBatchMigrateHostsServer();

    private static HttpRequestDef<BatchMigrateHostsServerRequest, BatchMigrateHostsServerResponse> genForBatchMigrateHostsServer() {
        // basic
        HttpRequestDef.Builder<BatchMigrateHostsServerRequest, BatchMigrateHostsServerResponse> builder = HttpRequestDef
            .builder(HttpMethod.PATCH, BatchMigrateHostsServerRequest.class, BatchMigrateHostsServerResponse.class)
            .withName("BatchMigrateHostsServer")
            .withUri("/v1/{project_id}/app-servers/hosts/batch-migrate")
            .withContentType("application/json");

        // requests
        builder.<BatchMigrateServerReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchMigrateServerReq.class),
            f -> f.withMarshaller(BatchMigrateHostsServerRequest::getBody, BatchMigrateHostsServerRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchRebootServerRequest, BatchRebootServerResponse> batchRebootServer =
        genForBatchRebootServer();

    private static HttpRequestDef<BatchRebootServerRequest, BatchRebootServerResponse> genForBatchRebootServer() {
        // basic
        HttpRequestDef.Builder<BatchRebootServerRequest, BatchRebootServerResponse> builder =
            HttpRequestDef.builder(HttpMethod.PATCH, BatchRebootServerRequest.class, BatchRebootServerResponse.class)
                .withName("BatchRebootServer")
                .withUri("/v1/{project_id}/app-servers/actions/batch-reboot")
                .withContentType("application/json");

        // requests
        builder.<ServerHaltReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ServerHaltReq.class),
            f -> f.withMarshaller(BatchRebootServerRequest::getBody, BatchRebootServerRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchRejoinDomainRequest, BatchRejoinDomainResponse> batchRejoinDomain =
        genForBatchRejoinDomain();

    private static HttpRequestDef<BatchRejoinDomainRequest, BatchRejoinDomainResponse> genForBatchRejoinDomain() {
        // basic
        HttpRequestDef.Builder<BatchRejoinDomainRequest, BatchRejoinDomainResponse> builder =
            HttpRequestDef.builder(HttpMethod.PATCH, BatchRejoinDomainRequest.class, BatchRejoinDomainResponse.class)
                .withName("BatchRejoinDomain")
                .withUri("/v1/{project_id}/app-servers/actions/batch-rejoin-domain")
                .withContentType("application/json");

        // requests
        builder.<BatchRejoinDomainReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchRejoinDomainReq.class),
            f -> f.withMarshaller(BatchRejoinDomainRequest::getBody, BatchRejoinDomainRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchStartServerRequest, BatchStartServerResponse> batchStartServer =
        genForBatchStartServer();

    private static HttpRequestDef<BatchStartServerRequest, BatchStartServerResponse> genForBatchStartServer() {
        // basic
        HttpRequestDef.Builder<BatchStartServerRequest, BatchStartServerResponse> builder =
            HttpRequestDef.builder(HttpMethod.PATCH, BatchStartServerRequest.class, BatchStartServerResponse.class)
                .withName("BatchStartServer")
                .withUri("/v1/{project_id}/app-servers/actions/batch-start")
                .withContentType("application/json");

        // requests
        builder.<BatchStartServerReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchStartServerReq.class),
            f -> f.withMarshaller(BatchStartServerRequest::getBody, BatchStartServerRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchStopServerRequest, BatchStopServerResponse> batchStopServer =
        genForBatchStopServer();

    private static HttpRequestDef<BatchStopServerRequest, BatchStopServerResponse> genForBatchStopServer() {
        // basic
        HttpRequestDef.Builder<BatchStopServerRequest, BatchStopServerResponse> builder =
            HttpRequestDef.builder(HttpMethod.PATCH, BatchStopServerRequest.class, BatchStopServerResponse.class)
                .withName("BatchStopServer")
                .withUri("/v1/{project_id}/app-servers/actions/batch-stop")
                .withContentType("application/json");

        // requests
        builder.<ServerHaltReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ServerHaltReq.class),
            f -> f.withMarshaller(BatchStopServerRequest::getBody, BatchStopServerRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchUpdateTsviRequest, BatchUpdateTsviResponse> batchUpdateTsvi =
        genForBatchUpdateTsvi();

    private static HttpRequestDef<BatchUpdateTsviRequest, BatchUpdateTsviResponse> genForBatchUpdateTsvi() {
        // basic
        HttpRequestDef.Builder<BatchUpdateTsviRequest, BatchUpdateTsviResponse> builder =
            HttpRequestDef.builder(HttpMethod.PATCH, BatchUpdateTsviRequest.class, BatchUpdateTsviResponse.class)
                .withName("BatchUpdateTsvi")
                .withUri("/v1/{project_id}/app-servers/actions/batch-update-tsvi")
                .withContentType("application/json");

        // requests
        builder.<UpdateTsviReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateTsviReq.class),
            f -> f.withMarshaller(BatchUpdateTsviRequest::getBody, BatchUpdateTsviRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ChangeServerImageRequest, ChangeServerImageResponse> changeServerImage =
        genForChangeServerImage();

    private static HttpRequestDef<ChangeServerImageRequest, ChangeServerImageResponse> genForChangeServerImage() {
        // basic
        HttpRequestDef.Builder<ChangeServerImageRequest, ChangeServerImageResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ChangeServerImageRequest.class, ChangeServerImageResponse.class)
                .withName("ChangeServerImage")
                .withUri("/v1/{project_id}/app-servers/{server_id}/actions/change-image")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("server_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ChangeServerImageRequest::getServerId, ChangeServerImageRequest::setServerId));
        builder.<ChangeServerImageReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ChangeServerImageReq.class),
            f -> f.withMarshaller(ChangeServerImageRequest::getBody, ChangeServerImageRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateAppServersRequest, CreateAppServersResponse> createAppServers =
        genForCreateAppServers();

    private static HttpRequestDef<CreateAppServersRequest, CreateAppServersResponse> genForCreateAppServers() {
        // basic
        HttpRequestDef.Builder<CreateAppServersRequest, CreateAppServersResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateAppServersRequest.class, CreateAppServersResponse.class)
                .withName("CreateAppServers")
                .withUri("/v1/{project_id}/app-servers/actions/create")
                .withContentType("application/json");

        // requests
        builder.<CreateAppServerReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateAppServerReq.class),
            f -> f.withMarshaller(CreateAppServersRequest::getBody, CreateAppServersRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListServerMetricDataRequest, ListServerMetricDataResponse> listServerMetricData =
        genForListServerMetricData();

    private static HttpRequestDef<ListServerMetricDataRequest, ListServerMetricDataResponse> genForListServerMetricData() {
        // basic
        HttpRequestDef.Builder<ListServerMetricDataRequest, ListServerMetricDataResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListServerMetricDataRequest.class, ListServerMetricDataResponse.class)
            .withName("ListServerMetricData")
            .withUri("/v1/{project_id}/app-servers/server-metric-data/{server_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("server_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListServerMetricDataRequest::getServerId, ListServerMetricDataRequest::setServerId));
        builder.<String>withRequestField("namespace",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListServerMetricDataRequest::getNamespace,
                ListServerMetricDataRequest::setNamespace));
        builder.<String>withRequestField("metric_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListServerMetricDataRequest::getMetricName,
                ListServerMetricDataRequest::setMetricName));
        builder.<String>withRequestField("from",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListServerMetricDataRequest::getFrom, ListServerMetricDataRequest::setFrom));
        builder.<String>withRequestField("to",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListServerMetricDataRequest::getTo, ListServerMetricDataRequest::setTo));
        builder.<Integer>withRequestField("period",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListServerMetricDataRequest::getPeriod, ListServerMetricDataRequest::setPeriod));
        builder.<String>withRequestField("filter",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListServerMetricDataRequest::getFilter, ListServerMetricDataRequest::setFilter));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListServersRequest, ListServersResponse> listServers = genForListServers();

    private static HttpRequestDef<ListServersRequest, ListServersResponse> genForListServers() {
        // basic
        HttpRequestDef.Builder<ListServersRequest, ListServersResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListServersRequest.class, ListServersResponse.class)
                .withName("ListServers")
                .withUri("/v1/{project_id}/app-servers")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListServersRequest::getOffset, ListServersRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListServersRequest::getLimit, ListServersRequest::setLimit));
        builder.<String>withRequestField("server_group_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListServersRequest::getServerGroupId, ListServersRequest::setServerGroupId));
        builder.<String>withRequestField("server_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListServersRequest::getServerName, ListServersRequest::setServerName));
        builder.<String>withRequestField("server_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListServersRequest::getServerId, ListServersRequest::setServerId));
        builder.<String>withRequestField("maintain_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListServersRequest::getMaintainStatus, ListServersRequest::setMaintainStatus));
        builder.<String>withRequestField("scaling_auto_create",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListServersRequest::getScalingAutoCreate, ListServersRequest::setScalingAutoCreate));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ReinstallServerRequest, ReinstallServerResponse> reinstallServer =
        genForReinstallServer();

    private static HttpRequestDef<ReinstallServerRequest, ReinstallServerResponse> genForReinstallServer() {
        // basic
        HttpRequestDef.Builder<ReinstallServerRequest, ReinstallServerResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ReinstallServerRequest.class, ReinstallServerResponse.class)
                .withName("ReinstallServer")
                .withUri("/v1/{project_id}/app-servers/{server_id}/actions/reinstall")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("server_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ReinstallServerRequest::getServerId, ReinstallServerRequest::setServerId));
        builder.<ReinstallServerReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ReinstallServerReq.class),
            f -> f.withMarshaller(ReinstallServerRequest::getBody, ReinstallServerRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowServerVncRequest, ShowServerVncResponse> showServerVnc =
        genForShowServerVnc();

    private static HttpRequestDef<ShowServerVncRequest, ShowServerVncResponse> genForShowServerVnc() {
        // basic
        HttpRequestDef.Builder<ShowServerVncRequest, ShowServerVncResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowServerVncRequest.class, ShowServerVncResponse.class)
                .withName("ShowServerVnc")
                .withUri("/v1/{project_id}/app-servers/{server_id}/actions/vnc")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("server_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowServerVncRequest::getServerId, ShowServerVncRequest::setServerId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateServerRequest, UpdateServerResponse> updateServer = genForUpdateServer();

    private static HttpRequestDef<UpdateServerRequest, UpdateServerResponse> genForUpdateServer() {
        // basic
        HttpRequestDef.Builder<UpdateServerRequest, UpdateServerResponse> builder =
            HttpRequestDef.builder(HttpMethod.PATCH, UpdateServerRequest.class, UpdateServerResponse.class)
                .withName("UpdateServer")
                .withUri("/v1/{project_id}/app-servers/{server_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("server_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateServerRequest::getServerId, UpdateServerRequest::setServerId));
        builder.<UpdateServerReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateServerReq.class),
            f -> f.withMarshaller(UpdateServerRequest::getBody, UpdateServerRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateServerGroupRequest, CreateServerGroupResponse> createServerGroup =
        genForCreateServerGroup();

    private static HttpRequestDef<CreateServerGroupRequest, CreateServerGroupResponse> genForCreateServerGroup() {
        // basic
        HttpRequestDef.Builder<CreateServerGroupRequest, CreateServerGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateServerGroupRequest.class, CreateServerGroupResponse.class)
                .withName("CreateServerGroup")
                .withUri("/v1/{project_id}/app-server-groups")
                .withContentType("application/json");

        // requests
        builder.<CreateServerGroupReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateServerGroupReq.class),
            f -> f.withMarshaller(CreateServerGroupRequest::getBody, CreateServerGroupRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteServerGroupsRequest, DeleteServerGroupsResponse> deleteServerGroups =
        genForDeleteServerGroups();

    private static HttpRequestDef<DeleteServerGroupsRequest, DeleteServerGroupsResponse> genForDeleteServerGroups() {
        // basic
        HttpRequestDef.Builder<DeleteServerGroupsRequest, DeleteServerGroupsResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteServerGroupsRequest.class, DeleteServerGroupsResponse.class)
                .withName("DeleteServerGroups")
                .withUri("/v1/{project_id}/app-server-groups/{server_group_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("server_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteServerGroupsRequest::getServerGroupId,
                DeleteServerGroupsRequest::setServerGroupId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListServerGroupsRequest, ListServerGroupsResponse> listServerGroups =
        genForListServerGroups();

    private static HttpRequestDef<ListServerGroupsRequest, ListServerGroupsResponse> genForListServerGroups() {
        // basic
        HttpRequestDef.Builder<ListServerGroupsRequest, ListServerGroupsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListServerGroupsRequest.class, ListServerGroupsResponse.class)
                .withName("ListServerGroups")
                .withUri("/v1/{project_id}/app-server-groups")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListServerGroupsRequest::getOffset, ListServerGroupsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListServerGroupsRequest::getLimit, ListServerGroupsRequest::setLimit));
        builder.<String>withRequestField("server_group_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListServerGroupsRequest::getServerGroupName,
                ListServerGroupsRequest::setServerGroupName));
        builder.<String>withRequestField("server_group_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListServerGroupsRequest::getServerGroupId,
                ListServerGroupsRequest::setServerGroupId));
        builder.<String>withRequestField("app_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListServerGroupsRequest::getAppType, ListServerGroupsRequest::setAppType));
        builder.<String>withRequestField("tags",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListServerGroupsRequest::getTags, ListServerGroupsRequest::setTags));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListServerGroupsRequest::getEnterpriseProjectId,
                ListServerGroupsRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("is_secondary_server_group",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListServerGroupsRequest::getIsSecondaryServerGroup,
                ListServerGroupsRequest::setIsSecondaryServerGroup));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateServerGroupRequest, UpdateServerGroupResponse> updateServerGroup =
        genForUpdateServerGroup();

    private static HttpRequestDef<UpdateServerGroupRequest, UpdateServerGroupResponse> genForUpdateServerGroup() {
        // basic
        HttpRequestDef.Builder<UpdateServerGroupRequest, UpdateServerGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.PATCH, UpdateServerGroupRequest.class, UpdateServerGroupResponse.class)
                .withName("UpdateServerGroup")
                .withUri("/v1/{project_id}/app-server-groups/{server_group_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("server_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateServerGroupRequest::getServerGroupId,
                UpdateServerGroupRequest::setServerGroupId));
        builder.<UpdateServerGroupReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateServerGroupReq.class),
            f -> f.withMarshaller(UpdateServerGroupRequest::getBody, UpdateServerGroupRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAppConnectionRequest, ListAppConnectionResponse> listAppConnection =
        genForListAppConnection();

    private static HttpRequestDef<ListAppConnectionRequest, ListAppConnectionResponse> genForListAppConnection() {
        // basic
        HttpRequestDef.Builder<ListAppConnectionRequest, ListAppConnectionResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListAppConnectionRequest.class, ListAppConnectionResponse.class)
                .withName("ListAppConnection")
                .withUri("/v1/{project_id}/session/app-connection")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAppConnectionRequest::getLimit, ListAppConnectionRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAppConnectionRequest::getOffset, ListAppConnectionRequest::setOffset));
        builder.<ListAppConnectionReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListAppConnectionReq.class),
            f -> f.withMarshaller(ListAppConnectionRequest::getBody, ListAppConnectionRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSessionByUserNameRequest, ListSessionByUserNameResponse> listSessionByUserName =
        genForListSessionByUserName();

    private static HttpRequestDef<ListSessionByUserNameRequest, ListSessionByUserNameResponse> genForListSessionByUserName() {
        // basic
        HttpRequestDef.Builder<ListSessionByUserNameRequest, ListSessionByUserNameResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListSessionByUserNameRequest.class, ListSessionByUserNameResponse.class)
            .withName("ListSessionByUserName")
            .withUri("/v1/{project_id}/session/user-session-info")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("user_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSessionByUserNameRequest::getUserName,
                ListSessionByUserNameRequest::setUserName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSessionsRequest, ListSessionsResponse> listSessions = genForListSessions();

    private static HttpRequestDef<ListSessionsRequest, ListSessionsResponse> genForListSessions() {
        // basic
        HttpRequestDef.Builder<ListSessionsRequest, ListSessionsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListSessionsRequest.class, ListSessionsResponse.class)
                .withName("ListSessions")
                .withUri("/v1/{project_id}/session/list-sessions")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSessionsRequest::getLimit, ListSessionsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSessionsRequest::getOffset, ListSessionsRequest::setOffset));
        builder.<String>withRequestField("user_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSessionsRequest::getUserName, ListSessionsRequest::setUserName));
        builder.<String>withRequestField("query_begin_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSessionsRequest::getQueryBeginTime, ListSessionsRequest::setQueryBeginTime));
        builder.<String>withRequestField("query_end_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSessionsRequest::getQueryEndTime, ListSessionsRequest::setQueryEndTime));
        builder.<String>withRequestField("app_server_group_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSessionsRequest::getAppServerGroupId, ListSessionsRequest::setAppServerGroupId));
        builder.<String>withRequestField("vm_ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSessionsRequest::getVmIp, ListSessionsRequest::setVmIp));
        builder.<String>withRequestField("machine_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSessionsRequest::getMachineName, ListSessionsRequest::setMachineName));
        builder.<String>withRequestField("session_state",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSessionsRequest::getSessionState, ListSessionsRequest::setSessionState));
        builder.<String>withRequestField("is_success",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSessionsRequest::getIsSuccess, ListSessionsRequest::setIsSuccess));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListUserConnectionRequest, ListUserConnectionResponse> listUserConnection =
        genForListUserConnection();

    private static HttpRequestDef<ListUserConnectionRequest, ListUserConnectionResponse> genForListUserConnection() {
        // basic
        HttpRequestDef.Builder<ListUserConnectionRequest, ListUserConnectionResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListUserConnectionRequest.class, ListUserConnectionResponse.class)
                .withName("ListUserConnection")
                .withUri("/v1/{project_id}/session/user-connection")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListUserConnectionRequest::getLimit, ListUserConnectionRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListUserConnectionRequest::getOffset, ListUserConnectionRequest::setOffset));
        builder.<ListUserConnectionReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListUserConnectionReq.class),
            f -> f.withMarshaller(ListUserConnectionRequest::getBody, ListUserConnectionRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<LogoffUserSessionRequest, LogoffUserSessionResponse> logoffUserSession =
        genForLogoffUserSession();

    private static HttpRequestDef<LogoffUserSessionRequest, LogoffUserSessionResponse> genForLogoffUserSession() {
        // basic
        HttpRequestDef.Builder<LogoffUserSessionRequest, LogoffUserSessionResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, LogoffUserSessionRequest.class, LogoffUserSessionResponse.class)
                .withName("LogoffUserSession")
                .withUri("/v1/{project_id}/session/logoff")
                .withContentType("application/json");

        // requests
        builder.<LogoffUserSessionReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(LogoffUserSessionReq.class),
            f -> f.withMarshaller(LogoffUserSessionRequest::getBody, LogoffUserSessionRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListVolumeTypeRequest, ListVolumeTypeResponse> listVolumeType =
        genForListVolumeType();

    private static HttpRequestDef<ListVolumeTypeRequest, ListVolumeTypeResponse> genForListVolumeType() {
        // basic
        HttpRequestDef.Builder<ListVolumeTypeRequest, ListVolumeTypeResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListVolumeTypeRequest.class, ListVolumeTypeResponse.class)
                .withName("ListVolumeType")
                .withUri("/v1/{project_id}/volume-type")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

}
