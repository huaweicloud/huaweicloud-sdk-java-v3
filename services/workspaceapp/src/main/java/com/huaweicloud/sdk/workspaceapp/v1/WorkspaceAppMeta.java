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
import com.huaweicloud.sdk.workspaceapp.v1.model.BatchDeleteAppGroupAuthorizationRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.BatchDeleteAppGroupAuthorizationResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.BatchDeleteAppGroupRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.BatchDeleteAppGroupResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.BatchDeleteServerReq;
import com.huaweicloud.sdk.workspaceapp.v1.model.BatchDeleteServerRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.BatchDeleteServerResponse;
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
import com.huaweicloud.sdk.workspaceapp.v1.model.CreateShareFolderReq;
import com.huaweicloud.sdk.workspaceapp.v1.model.CreateShareFolderRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.CreateShareFolderResponse;
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
import com.huaweicloud.sdk.workspaceapp.v1.model.ListServersRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListServersResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListSessionByUserNameRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListSessionByUserNameResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListSessionTypeRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListSessionTypeResponse;
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
import com.huaweicloud.sdk.workspaceapp.v1.model.LogoffUserSessionReq;
import com.huaweicloud.sdk.workspaceapp.v1.model.LogoffUserSessionRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.LogoffUserSessionResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.PublishAppReq;
import com.huaweicloud.sdk.workspaceapp.v1.model.PublishAppRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.PublishAppResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.ReinstallServerReq;
import com.huaweicloud.sdk.workspaceapp.v1.model.ReinstallServerRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.ReinstallServerResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.ServerHaltReq;
import com.huaweicloud.sdk.workspaceapp.v1.model.ShowJobRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.ShowJobResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.ShowOriginalPolicyInfoRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.ShowOriginalPolicyInfoResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.ShowPublishableAppRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.ShowPublishableAppResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.UnpublishAppReq;
import com.huaweicloud.sdk.workspaceapp.v1.model.UnpublishAppRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.UnpublishAppResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.UpdateAppGroupReq;
import com.huaweicloud.sdk.workspaceapp.v1.model.UpdateAppGroupRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.UpdateAppGroupResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.UpdateAppReq;
import com.huaweicloud.sdk.workspaceapp.v1.model.UpdateAppRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.UpdateAppResponse;
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
import com.huaweicloud.sdk.workspaceapp.v1.model.UploadAppIconRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.UploadAppIconRequestBody;
import com.huaweicloud.sdk.workspaceapp.v1.model.UploadAppIconResponse;

@SuppressWarnings("unchecked")
public class WorkspaceAppMeta {

    public static final HttpRequestDef<ListPublishedAppRequest, ListPublishedAppResponse> listPublishedApp =
        genForlistPublishedApp();

    private static HttpRequestDef<ListPublishedAppRequest, ListPublishedAppResponse> genForlistPublishedApp() {
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
            f -> f.withMarshaller(ListPublishedAppRequest::getAppGroupId, (req, v) -> {
                req.setAppGroupId(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPublishedAppRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPublishedAppRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPublishedAppRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<String>withRequestField("state",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPublishedAppRequest::getState, (req, v) -> {
                req.setState(v);
            }));
        builder.<String>withRequestField("app_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPublishedAppRequest::getAppId, (req, v) -> {
                req.setAppId(v);
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
                .withUri("/v1/{project_id}/app-groups/{app_group_id}/apps")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("app_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(PublishAppRequest::getAppGroupId, (req, v) -> {
                req.setAppGroupId(v);
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

    public static final HttpRequestDef<ShowPublishableAppRequest, ShowPublishableAppResponse> showPublishableApp =
        genForshowPublishableApp();

    private static HttpRequestDef<ShowPublishableAppRequest, ShowPublishableAppResponse> genForshowPublishableApp() {
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
            f -> f.withMarshaller(ShowPublishableAppRequest::getAppGroupId, (req, v) -> {
                req.setAppGroupId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UnpublishAppRequest, UnpublishAppResponse> unpublishApp = genForunpublishApp();

    private static HttpRequestDef<UnpublishAppRequest, UnpublishAppResponse> genForunpublishApp() {
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
            f -> f.withMarshaller(UnpublishAppRequest::getAppGroupId, (req, v) -> {
                req.setAppGroupId(v);
            }));
        builder.<UnpublishAppReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UnpublishAppReq.class),
            f -> f.withMarshaller(UnpublishAppRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateAppRequest, UpdateAppResponse> updateApp = genForupdateApp();

    private static HttpRequestDef<UpdateAppRequest, UpdateAppResponse> genForupdateApp() {
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
            f -> f.withMarshaller(UpdateAppRequest::getAppGroupId, (req, v) -> {
                req.setAppGroupId(v);
            }));
        builder.<String>withRequestField("app_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAppRequest::getAppId, (req, v) -> {
                req.setAppId(v);
            }));
        builder.<UpdateAppReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateAppReq.class),
            f -> f.withMarshaller(UpdateAppRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UploadAppIconRequest, UploadAppIconResponse> uploadAppIcon =
        genForuploadAppIcon();

    private static HttpRequestDef<UploadAppIconRequest, UploadAppIconResponse> genForuploadAppIcon() {
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
            f -> f.withMarshaller(UploadAppIconRequest::getAppGroupId, (req, v) -> {
                req.setAppGroupId(v);
            }));
        builder.<String>withRequestField("app_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UploadAppIconRequest::getAppId, (req, v) -> {
                req.setAppId(v);
            }));
        builder.<UploadAppIconRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UploadAppIconRequestBody.class),
            f -> f.withMarshaller(UploadAppIconRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteAppGroupRequest, BatchDeleteAppGroupResponse> batchDeleteAppGroup =
        genForbatchDeleteAppGroup();

    private static HttpRequestDef<BatchDeleteAppGroupRequest, BatchDeleteAppGroupResponse> genForbatchDeleteAppGroup() {
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
            f -> f.withMarshaller(BatchDeleteAppGroupRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateAppGroupRequest, CreateAppGroupResponse> createAppGroup =
        genForcreateAppGroup();

    private static HttpRequestDef<CreateAppGroupRequest, CreateAppGroupResponse> genForcreateAppGroup() {
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
            f -> f.withMarshaller(CreateAppGroupRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAppGroupRequest, ListAppGroupResponse> listAppGroup = genForlistAppGroup();

    private static HttpRequestDef<ListAppGroupRequest, ListAppGroupResponse> genForlistAppGroup() {
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
            f -> f.withMarshaller(ListAppGroupRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAppGroupRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("app_server_group_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppGroupRequest::getAppServerGroupId, (req, v) -> {
                req.setAppServerGroupId(v);
            }));
        builder.<String>withRequestField("app_group_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppGroupRequest::getAppGroupId, (req, v) -> {
                req.setAppGroupId(v);
            }));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppGroupRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<String>withRequestField("authorization_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppGroupRequest::getAuthorizationType, (req, v) -> {
                req.setAuthorizationType(v);
            }));
        builder.<String>withRequestField("app_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppGroupRequest::getAppType, (req, v) -> {
                req.setAppType(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateAppGroupRequest, UpdateAppGroupResponse> updateAppGroup =
        genForupdateAppGroup();

    private static HttpRequestDef<UpdateAppGroupRequest, UpdateAppGroupResponse> genForupdateAppGroup() {
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
            f -> f.withMarshaller(UpdateAppGroupRequest::getAppGroupId, (req, v) -> {
                req.setAppGroupId(v);
            }));
        builder.<UpdateAppGroupReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateAppGroupReq.class),
            f -> f.withMarshaller(UpdateAppGroupRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListProductRequest, ListProductResponse> listProduct = genForlistProduct();

    private static HttpRequestDef<ListProductRequest, ListProductResponse> genForlistProduct() {
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
            f -> f.withMarshaller(ListProductRequest::getProductId, (req, v) -> {
                req.setProductId(v);
            }));
        builder.<String>withRequestField("availability_zone",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProductRequest::getAvailabilityZone, (req, v) -> {
                req.setAvailabilityZone(v);
            }));
        builder.<String>withRequestField("os_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProductRequest::getOsType, (req, v) -> {
                req.setOsType(v);
            }));
        builder.<String>withRequestField("charge_mode",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProductRequest::getChargeMode, (req, v) -> {
                req.setChargeMode(v);
            }));
        builder.<String>withRequestField("architecture",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProductRequest::getArchitecture, (req, v) -> {
                req.setArchitecture(v);
            }));
        builder.<String>withRequestField("package_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProductRequest::getPackageType, (req, v) -> {
                req.setPackageType(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSessionTypeRequest, ListSessionTypeResponse> listSessionType =
        genForlistSessionType();

    private static HttpRequestDef<ListSessionTypeRequest, ListSessionTypeResponse> genForlistSessionType() {
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
        genForaddAppGroupAuthorization();

    private static HttpRequestDef<AddAppGroupAuthorizationRequest, AddAppGroupAuthorizationResponse> genForaddAppGroupAuthorization() {
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
            f -> f.withMarshaller(AddAppGroupAuthorizationRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<AppGroupAuthorizeReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AppGroupAuthorizeReq.class),
            f -> f.withMarshaller(AddAppGroupAuthorizationRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteAppGroupAuthorizationRequest, BatchDeleteAppGroupAuthorizationResponse> batchDeleteAppGroupAuthorization =
        genForbatchDeleteAppGroupAuthorization();

    private static HttpRequestDef<BatchDeleteAppGroupAuthorizationRequest, BatchDeleteAppGroupAuthorizationResponse> genForbatchDeleteAppGroupAuthorization() {
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
            f -> f.withMarshaller(BatchDeleteAppGroupAuthorizationRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<AppGroupAuthorizeReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AppGroupAuthorizeReq.class),
            f -> f.withMarshaller(BatchDeleteAppGroupAuthorizationRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAppGroupAuthorizationRequest, ListAppGroupAuthorizationResponse> listAppGroupAuthorization =
        genForlistAppGroupAuthorization();

    private static HttpRequestDef<ListAppGroupAuthorizationRequest, ListAppGroupAuthorizationResponse> genForlistAppGroupAuthorization() {
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
            f -> f.withMarshaller(ListAppGroupAuthorizationRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAppGroupAuthorizationRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("app_group_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppGroupAuthorizationRequest::getAppGroupId, (req, v) -> {
                req.setAppGroupId(v);
            }));
        builder.<String>withRequestField("account",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppGroupAuthorizationRequest::getAccount, (req, v) -> {
                req.setAccount(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAvailabilityZoneRequest, ListAvailabilityZoneResponse> listAvailabilityZone =
        genForlistAvailabilityZone();

    private static HttpRequestDef<ListAvailabilityZoneRequest, ListAvailabilityZoneResponse> genForlistAvailabilityZone() {
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

    public static final HttpRequestDef<ShowJobRequest, ShowJobResponse> showJob = genForshowJob();

    private static HttpRequestDef<ShowJobRequest, ShowJobResponse> genForshowJob() {
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
            f -> f.withMarshaller(ShowJobRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateOrUpdateStoragePolicyStatementRequest, CreateOrUpdateStoragePolicyStatementResponse> createOrUpdateStoragePolicyStatement =
        genForcreateOrUpdateStoragePolicyStatement();

    private static HttpRequestDef<CreateOrUpdateStoragePolicyStatementRequest, CreateOrUpdateStoragePolicyStatementResponse> genForcreateOrUpdateStoragePolicyStatement() {
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
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CreateOrUpdateStoragePolicyStatementReq.class),
            f -> f.withMarshaller(CreateOrUpdateStoragePolicyStatementRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreatePersistentStorageRequest, CreatePersistentStorageResponse> createPersistentStorage =
        genForcreatePersistentStorage();

    private static HttpRequestDef<CreatePersistentStorageRequest, CreatePersistentStorageResponse> genForcreatePersistentStorage() {
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
            f -> f.withMarshaller(CreatePersistentStorageRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateShareFolderRequest, CreateShareFolderResponse> createShareFolder =
        genForcreateShareFolder();

    private static HttpRequestDef<CreateShareFolderRequest, CreateShareFolderResponse> genForcreateShareFolder() {
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
            f -> f.withMarshaller(CreateShareFolderRequest::getStorageId, (req, v) -> {
                req.setStorageId(v);
            }));
        builder.<CreateShareFolderReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateShareFolderReq.class),
            f -> f.withMarshaller(CreateShareFolderRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeletePersistentStorageRequest, DeletePersistentStorageResponse> deletePersistentStorage =
        genFordeletePersistentStorage();

    private static HttpRequestDef<DeletePersistentStorageRequest, DeletePersistentStorageResponse> genFordeletePersistentStorage() {
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
            f -> f.withMarshaller(DeletePersistentStorageRequest::getStorageId, (req, v) -> {
                req.setStorageId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteStorageClaimRequest, DeleteStorageClaimResponse> deleteStorageClaim =
        genFordeleteStorageClaim();

    private static HttpRequestDef<DeleteStorageClaimRequest, DeleteStorageClaimResponse> genFordeleteStorageClaim() {
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
            f -> f.withMarshaller(DeleteStorageClaimRequest::getStorageId, (req, v) -> {
                req.setStorageId(v);
            }));
        builder.<DeleteStorageClaimReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteStorageClaimReq.class),
            f -> f.withMarshaller(DeleteStorageClaimRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteUserStorageAttachmentRequest, DeleteUserStorageAttachmentResponse> deleteUserStorageAttachment =
        genFordeleteUserStorageAttachment();

    private static HttpRequestDef<DeleteUserStorageAttachmentRequest, DeleteUserStorageAttachmentResponse> genFordeleteUserStorageAttachment() {
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
            f -> f.withMarshaller(DeleteUserStorageAttachmentRequest::getStorageId, (req, v) -> {
                req.setStorageId(v);
            }));
        builder.<DeleteUserStorageAttachmentReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteUserStorageAttachmentReq.class),
            f -> f.withMarshaller(DeleteUserStorageAttachmentRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPersistentStorageRequest, ListPersistentStorageResponse> listPersistentStorage =
        genForlistPersistentStorage();

    private static HttpRequestDef<ListPersistentStorageRequest, ListPersistentStorageResponse> genForlistPersistentStorage() {
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
            f -> f.withMarshaller(ListPersistentStorageRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPersistentStorageRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("storage_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPersistentStorageRequest::getStorageId, (req, v) -> {
                req.setStorageId(v);
            }));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPersistentStorageRequest::getName, (req, v) -> {
                req.setName(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListShareFolderRequest, ListShareFolderResponse> listShareFolder =
        genForlistShareFolder();

    private static HttpRequestDef<ListShareFolderRequest, ListShareFolderResponse> genForlistShareFolder() {
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
            f -> f.withMarshaller(ListShareFolderRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListShareFolderRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("storage_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListShareFolderRequest::getStorageId, (req, v) -> {
                req.setStorageId(v);
            }));
        builder.<String>withRequestField("storage_claim_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListShareFolderRequest::getStorageClaimId, (req, v) -> {
                req.setStorageClaimId(v);
            }));
        builder.<String>withRequestField("path",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListShareFolderRequest::getPath, (req, v) -> {
                req.setPath(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListStorageAssignmentRequest, ListStorageAssignmentResponse> listStorageAssignment =
        genForlistStorageAssignment();

    private static HttpRequestDef<ListStorageAssignmentRequest, ListStorageAssignmentResponse> genForlistStorageAssignment() {
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
            f -> f.withMarshaller(ListStorageAssignmentRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListStorageAssignmentRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("storage_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStorageAssignmentRequest::getStorageId, (req, v) -> {
                req.setStorageId(v);
            }));
        builder.<String>withRequestField("claim_mode",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStorageAssignmentRequest::getClaimMode, (req, v) -> {
                req.setClaimMode(v);
            }));
        builder.<String>withRequestField("storage_claim_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStorageAssignmentRequest::getStorageClaimId, (req, v) -> {
                req.setStorageClaimId(v);
            }));
        builder.<String>withRequestField("attach",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStorageAssignmentRequest::getAttach, (req, v) -> {
                req.setAttach(v);
            }));
        builder.<String>withRequestField("attach_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStorageAssignmentRequest::getAttachType, (req, v) -> {
                req.setAttachType(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListStoragePolicyStatementRequest, ListStoragePolicyStatementResponse> listStoragePolicyStatement =
        genForlistStoragePolicyStatement();

    private static HttpRequestDef<ListStoragePolicyStatementRequest, ListStoragePolicyStatementResponse> genForlistStoragePolicyStatement() {
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
            f -> f.withMarshaller(ListStoragePolicyStatementRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListStoragePolicyStatementRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateShareFolderAssignmentRequest, UpdateShareFolderAssignmentResponse> updateShareFolderAssignment =
        genForupdateShareFolderAssignment();

    private static HttpRequestDef<UpdateShareFolderAssignmentRequest, UpdateShareFolderAssignmentResponse> genForupdateShareFolderAssignment() {
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
            f -> f.withMarshaller(UpdateShareFolderAssignmentRequest::getStorageId, (req, v) -> {
                req.setStorageId(v);
            }));
        builder.<AssignShareFolderReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AssignShareFolderReq.class),
            f -> f.withMarshaller(UpdateShareFolderAssignmentRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateUserFolderAssignmentRequest, UpdateUserFolderAssignmentResponse> updateUserFolderAssignment =
        genForupdateUserFolderAssignment();

    private static HttpRequestDef<UpdateUserFolderAssignmentRequest, UpdateUserFolderAssignmentResponse> genForupdateUserFolderAssignment() {
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
            f -> f.withMarshaller(UpdateUserFolderAssignmentRequest::getStorageId, (req, v) -> {
                req.setStorageId(v);
            }));
        builder.<AssignUserFolderReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AssignUserFolderReq.class),
            f -> f.withMarshaller(UpdateUserFolderAssignmentRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreatePolicyGroupRequest, CreatePolicyGroupResponse> createPolicyGroup =
        genForcreatePolicyGroup();

    private static HttpRequestDef<CreatePolicyGroupRequest, CreatePolicyGroupResponse> genForcreatePolicyGroup() {
        // basic
        HttpRequestDef.Builder<CreatePolicyGroupRequest, CreatePolicyGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreatePolicyGroupRequest.class, CreatePolicyGroupResponse.class)
                .withName("CreatePolicyGroup")
                .withUri("/v1/{project_id}/policy-groups")
                .withContentType("application/json");

        // requests
        builder.<CreatePolicyGroupReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CreatePolicyGroupReq.class),
            f -> f.withMarshaller(CreatePolicyGroupRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreatePolicyTemplateRequest, CreatePolicyTemplateResponse> createPolicyTemplate =
        genForcreatePolicyTemplate();

    private static HttpRequestDef<CreatePolicyTemplateRequest, CreatePolicyTemplateResponse> genForcreatePolicyTemplate() {
        // basic
        HttpRequestDef.Builder<CreatePolicyTemplateRequest, CreatePolicyTemplateResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreatePolicyTemplateRequest.class, CreatePolicyTemplateResponse.class)
            .withName("CreatePolicyTemplate")
            .withUri("/v1/{project_id}/policy-templates")
            .withContentType("application/json");

        // requests
        builder.<CreatePolicyTemplateReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CreatePolicyTemplateReq.class),
            f -> f.withMarshaller(CreatePolicyTemplateRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeletePolicyGroupRequest, DeletePolicyGroupResponse> deletePolicyGroup =
        genFordeletePolicyGroup();

    private static HttpRequestDef<DeletePolicyGroupRequest, DeletePolicyGroupResponse> genFordeletePolicyGroup() {
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
            f -> f.withMarshaller(DeletePolicyGroupRequest::getPolicyGroupId, (req, v) -> {
                req.setPolicyGroupId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeletePolicyTemplateRequest, DeletePolicyTemplateResponse> deletePolicyTemplate =
        genFordeletePolicyTemplate();

    private static HttpRequestDef<DeletePolicyTemplateRequest, DeletePolicyTemplateResponse> genFordeletePolicyTemplate() {
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
            f -> f.withMarshaller(DeletePolicyTemplateRequest::getPolicyTemplateId, (req, v) -> {
                req.setPolicyTemplateId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPolicyGroupRequest, ListPolicyGroupResponse> listPolicyGroup =
        genForlistPolicyGroup();

    private static HttpRequestDef<ListPolicyGroupRequest, ListPolicyGroupResponse> genForlistPolicyGroup() {
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
            f -> f.withMarshaller(ListPolicyGroupRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPolicyGroupRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("policy_group_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPolicyGroupRequest::getPolicyGroupName, (req, v) -> {
                req.setPolicyGroupName(v);
            }));
        builder.<Integer>withRequestField("policy_group_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPolicyGroupRequest::getPolicyGroupType, (req, v) -> {
                req.setPolicyGroupType(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPolicyTemplateRequest, ListPolicyTemplateResponse> listPolicyTemplate =
        genForlistPolicyTemplate();

    private static HttpRequestDef<ListPolicyTemplateRequest, ListPolicyTemplateResponse> genForlistPolicyTemplate() {
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
            f -> f.withMarshaller(ListPolicyTemplateRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPolicyTemplateRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("policy_group_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPolicyTemplateRequest::getPolicyGroupName, (req, v) -> {
                req.setPolicyGroupName(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTargetsOfPolicyGroupRequest, ListTargetsOfPolicyGroupResponse> listTargetsOfPolicyGroup =
        genForlistTargetsOfPolicyGroup();

    private static HttpRequestDef<ListTargetsOfPolicyGroupRequest, ListTargetsOfPolicyGroupResponse> genForlistTargetsOfPolicyGroup() {
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
            f -> f.withMarshaller(ListTargetsOfPolicyGroupRequest::getPolicyGroupId, (req, v) -> {
                req.setPolicyGroupId(v);
            }));
        builder.<String>withRequestField("target_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTargetsOfPolicyGroupRequest::getTargetType, (req, v) -> {
                req.setTargetType(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowOriginalPolicyInfoRequest, ShowOriginalPolicyInfoResponse> showOriginalPolicyInfo =
        genForshowOriginalPolicyInfo();

    private static HttpRequestDef<ShowOriginalPolicyInfoRequest, ShowOriginalPolicyInfoResponse> genForshowOriginalPolicyInfo() {
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
        genForupdatePolicyGroup();

    private static HttpRequestDef<UpdatePolicyGroupRequest, UpdatePolicyGroupResponse> genForupdatePolicyGroup() {
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
            f -> f.withMarshaller(UpdatePolicyGroupRequest::getPolicyGroupId, (req, v) -> {
                req.setPolicyGroupId(v);
            }));
        builder.<UpdatePolicyGroupReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdatePolicyGroupReq.class),
            f -> f.withMarshaller(UpdatePolicyGroupRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdatePolicyTemplateRequest, UpdatePolicyTemplateResponse> updatePolicyTemplate =
        genForupdatePolicyTemplate();

    private static HttpRequestDef<UpdatePolicyTemplateRequest, UpdatePolicyTemplateResponse> genForupdatePolicyTemplate() {
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
            f -> f.withMarshaller(UpdatePolicyTemplateRequest::getPolicyTemplateId, (req, v) -> {
                req.setPolicyTemplateId(v);
            }));
        builder.<UpdatePolicyTemplateReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdatePolicyTemplateReq.class),
            f -> f.withMarshaller(UpdatePolicyTemplateRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CheckQuotaRequest, CheckQuotaResponse> checkQuota = genForcheckQuota();

    private static HttpRequestDef<CheckQuotaRequest, CheckQuotaResponse> genForcheckQuota() {
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
            f -> f.withMarshaller(CheckQuotaRequest::getProductId, (req, v) -> {
                req.setProductId(v);
            }));
        builder.<Integer>withRequestField("subscription_num",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(CheckQuotaRequest::getSubscriptionNum, (req, v) -> {
                req.setSubscriptionNum(v);
            }));
        builder.<Integer>withRequestField("disk_size",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(CheckQuotaRequest::getDiskSize, (req, v) -> {
                req.setDiskSize(v);
            }));
        builder.<Integer>withRequestField("disk_num",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(CheckQuotaRequest::getDiskNum, (req, v) -> {
                req.setDiskNum(v);
            }));
        builder.<Boolean>withRequestField("is_period",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(CheckQuotaRequest::getIsPeriod, (req, v) -> {
                req.setIsPeriod(v);
            }));
        builder.<String>withRequestField("deh_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CheckQuotaRequest::getDehId, (req, v) -> {
                req.setDehId(v);
            }));
        builder.<String>withRequestField("cluster_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CheckQuotaRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteServerRequest, BatchDeleteServerResponse> batchDeleteServer =
        genForbatchDeleteServer();

    private static HttpRequestDef<BatchDeleteServerRequest, BatchDeleteServerResponse> genForbatchDeleteServer() {
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
            f -> f.withMarshaller(BatchDeleteServerRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchMigrateHostsServerRequest, BatchMigrateHostsServerResponse> batchMigrateHostsServer =
        genForbatchMigrateHostsServer();

    private static HttpRequestDef<BatchMigrateHostsServerRequest, BatchMigrateHostsServerResponse> genForbatchMigrateHostsServer() {
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
            f -> f.withMarshaller(BatchMigrateHostsServerRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchRebootServerRequest, BatchRebootServerResponse> batchRebootServer =
        genForbatchRebootServer();

    private static HttpRequestDef<BatchRebootServerRequest, BatchRebootServerResponse> genForbatchRebootServer() {
        // basic
        HttpRequestDef.Builder<BatchRebootServerRequest, BatchRebootServerResponse> builder =
            HttpRequestDef.builder(HttpMethod.PATCH, BatchRebootServerRequest.class, BatchRebootServerResponse.class)
                .withName("BatchRebootServer")
                .withUri("/v1/{project_id}/app-servers/actions/batch-reboot")
                .withContentType("application/json");

        // requests
        builder.<ServerHaltReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ServerHaltReq.class),
            f -> f.withMarshaller(BatchRebootServerRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchRejoinDomainRequest, BatchRejoinDomainResponse> batchRejoinDomain =
        genForbatchRejoinDomain();

    private static HttpRequestDef<BatchRejoinDomainRequest, BatchRejoinDomainResponse> genForbatchRejoinDomain() {
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
            f -> f.withMarshaller(BatchRejoinDomainRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchStartServerRequest, BatchStartServerResponse> batchStartServer =
        genForbatchStartServer();

    private static HttpRequestDef<BatchStartServerRequest, BatchStartServerResponse> genForbatchStartServer() {
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
            f -> f.withMarshaller(BatchStartServerRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchStopServerRequest, BatchStopServerResponse> batchStopServer =
        genForbatchStopServer();

    private static HttpRequestDef<BatchStopServerRequest, BatchStopServerResponse> genForbatchStopServer() {
        // basic
        HttpRequestDef.Builder<BatchStopServerRequest, BatchStopServerResponse> builder =
            HttpRequestDef.builder(HttpMethod.PATCH, BatchStopServerRequest.class, BatchStopServerResponse.class)
                .withName("BatchStopServer")
                .withUri("/v1/{project_id}/app-servers/actions/batch-stop")
                .withContentType("application/json");

        // requests
        builder.<ServerHaltReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ServerHaltReq.class),
            f -> f.withMarshaller(BatchStopServerRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchUpdateTsviRequest, BatchUpdateTsviResponse> batchUpdateTsvi =
        genForbatchUpdateTsvi();

    private static HttpRequestDef<BatchUpdateTsviRequest, BatchUpdateTsviResponse> genForbatchUpdateTsvi() {
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
            f -> f.withMarshaller(BatchUpdateTsviRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ChangeServerImageRequest, ChangeServerImageResponse> changeServerImage =
        genForchangeServerImage();

    private static HttpRequestDef<ChangeServerImageRequest, ChangeServerImageResponse> genForchangeServerImage() {
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
            f -> f.withMarshaller(ChangeServerImageRequest::getServerId, (req, v) -> {
                req.setServerId(v);
            }));
        builder.<ChangeServerImageReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ChangeServerImageReq.class),
            f -> f.withMarshaller(ChangeServerImageRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateAppServersRequest, CreateAppServersResponse> createAppServers =
        genForcreateAppServers();

    private static HttpRequestDef<CreateAppServersRequest, CreateAppServersResponse> genForcreateAppServers() {
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
            f -> f.withMarshaller(CreateAppServersRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListServersRequest, ListServersResponse> listServers = genForlistServers();

    private static HttpRequestDef<ListServersRequest, ListServersResponse> genForlistServers() {
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
            f -> f.withMarshaller(ListServersRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListServersRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("server_group_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListServersRequest::getServerGroupId, (req, v) -> {
                req.setServerGroupId(v);
            }));
        builder.<String>withRequestField("server_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListServersRequest::getServerName, (req, v) -> {
                req.setServerName(v);
            }));
        builder.<String>withRequestField("server_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListServersRequest::getServerId, (req, v) -> {
                req.setServerId(v);
            }));
        builder.<String>withRequestField("maintain_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListServersRequest::getMaintainStatus, (req, v) -> {
                req.setMaintainStatus(v);
            }));
        builder.<String>withRequestField("scaling_auto_create",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListServersRequest::getScalingAutoCreate, (req, v) -> {
                req.setScalingAutoCreate(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ReinstallServerRequest, ReinstallServerResponse> reinstallServer =
        genForreinstallServer();

    private static HttpRequestDef<ReinstallServerRequest, ReinstallServerResponse> genForreinstallServer() {
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
            f -> f.withMarshaller(ReinstallServerRequest::getServerId, (req, v) -> {
                req.setServerId(v);
            }));
        builder.<ReinstallServerReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ReinstallServerReq.class),
            f -> f.withMarshaller(ReinstallServerRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateServerRequest, UpdateServerResponse> updateServer = genForupdateServer();

    private static HttpRequestDef<UpdateServerRequest, UpdateServerResponse> genForupdateServer() {
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
            f -> f.withMarshaller(UpdateServerRequest::getServerId, (req, v) -> {
                req.setServerId(v);
            }));
        builder.<UpdateServerReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateServerReq.class),
            f -> f.withMarshaller(UpdateServerRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateServerGroupRequest, CreateServerGroupResponse> createServerGroup =
        genForcreateServerGroup();

    private static HttpRequestDef<CreateServerGroupRequest, CreateServerGroupResponse> genForcreateServerGroup() {
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
            f -> f.withMarshaller(CreateServerGroupRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteServerGroupsRequest, DeleteServerGroupsResponse> deleteServerGroups =
        genFordeleteServerGroups();

    private static HttpRequestDef<DeleteServerGroupsRequest, DeleteServerGroupsResponse> genFordeleteServerGroups() {
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
            f -> f.withMarshaller(DeleteServerGroupsRequest::getServerGroupId, (req, v) -> {
                req.setServerGroupId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListServerGroupsRequest, ListServerGroupsResponse> listServerGroups =
        genForlistServerGroups();

    private static HttpRequestDef<ListServerGroupsRequest, ListServerGroupsResponse> genForlistServerGroups() {
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
            f -> f.withMarshaller(ListServerGroupsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListServerGroupsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("server_group_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListServerGroupsRequest::getServerGroupName, (req, v) -> {
                req.setServerGroupName(v);
            }));
        builder.<String>withRequestField("server_group_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListServerGroupsRequest::getServerGroupId, (req, v) -> {
                req.setServerGroupId(v);
            }));
        builder.<String>withRequestField("app_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListServerGroupsRequest::getAppType, (req, v) -> {
                req.setAppType(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateServerGroupRequest, UpdateServerGroupResponse> updateServerGroup =
        genForupdateServerGroup();

    private static HttpRequestDef<UpdateServerGroupRequest, UpdateServerGroupResponse> genForupdateServerGroup() {
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
            f -> f.withMarshaller(UpdateServerGroupRequest::getServerGroupId, (req, v) -> {
                req.setServerGroupId(v);
            }));
        builder.<UpdateServerGroupReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateServerGroupReq.class),
            f -> f.withMarshaller(UpdateServerGroupRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAppConnectionRequest, ListAppConnectionResponse> listAppConnection =
        genForlistAppConnection();

    private static HttpRequestDef<ListAppConnectionRequest, ListAppConnectionResponse> genForlistAppConnection() {
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
            f -> f.withMarshaller(ListAppConnectionRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAppConnectionRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<ListAppConnectionReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListAppConnectionReq.class),
            f -> f.withMarshaller(ListAppConnectionRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSessionByUserNameRequest, ListSessionByUserNameResponse> listSessionByUserName =
        genForlistSessionByUserName();

    private static HttpRequestDef<ListSessionByUserNameRequest, ListSessionByUserNameResponse> genForlistSessionByUserName() {
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
            f -> f.withMarshaller(ListSessionByUserNameRequest::getUserName, (req, v) -> {
                req.setUserName(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListUserConnectionRequest, ListUserConnectionResponse> listUserConnection =
        genForlistUserConnection();

    private static HttpRequestDef<ListUserConnectionRequest, ListUserConnectionResponse> genForlistUserConnection() {
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
            f -> f.withMarshaller(ListUserConnectionRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListUserConnectionRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<ListUserConnectionReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListUserConnectionReq.class),
            f -> f.withMarshaller(ListUserConnectionRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<LogoffUserSessionRequest, LogoffUserSessionResponse> logoffUserSession =
        genForlogoffUserSession();

    private static HttpRequestDef<LogoffUserSessionRequest, LogoffUserSessionResponse> genForlogoffUserSession() {
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
            f -> f.withMarshaller(LogoffUserSessionRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListVolumeTypeRequest, ListVolumeTypeResponse> listVolumeType =
        genForlistVolumeType();

    private static HttpRequestDef<ListVolumeTypeRequest, ListVolumeTypeResponse> genForlistVolumeType() {
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
