package com.huaweicloud.sdk.workspace.v2;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.workspace.v2.model.ActionsOfUsersInGroupRequest;
import com.huaweicloud.sdk.workspace.v2.model.AddDesktopsVolumesReq;
import com.huaweicloud.sdk.workspace.v2.model.AddVolumesRequest;
import com.huaweicloud.sdk.workspace.v2.model.AddVolumesResponse;
import com.huaweicloud.sdk.workspace.v2.model.ApplyDesktopsInternetReq;
import com.huaweicloud.sdk.workspace.v2.model.ApplyDesktopsInternetRequest;
import com.huaweicloud.sdk.workspace.v2.model.ApplyDesktopsInternetResponse;
import com.huaweicloud.sdk.workspace.v2.model.ApplyWorkspaceReq;
import com.huaweicloud.sdk.workspace.v2.model.ApplyWorkspaceRequest;
import com.huaweicloud.sdk.workspace.v2.model.ApplyWorkspaceResponse;
import com.huaweicloud.sdk.workspace.v2.model.AssistAuthMethodConfigRequest;
import com.huaweicloud.sdk.workspace.v2.model.AssociateDesktopsEipReq;
import com.huaweicloud.sdk.workspace.v2.model.AssociateDesktopsEipRequest;
import com.huaweicloud.sdk.workspace.v2.model.AssociateDesktopsEipResponse;
import com.huaweicloud.sdk.workspace.v2.model.BatchActionDesktopsReq;
import com.huaweicloud.sdk.workspace.v2.model.BatchAddDesktopsTagsReq;
import com.huaweicloud.sdk.workspace.v2.model.BatchAddDesktopsTagsRequest;
import com.huaweicloud.sdk.workspace.v2.model.BatchAddDesktopsTagsResponse;
import com.huaweicloud.sdk.workspace.v2.model.BatchChangeTagsRequest;
import com.huaweicloud.sdk.workspace.v2.model.BatchChangeTagsResponse;
import com.huaweicloud.sdk.workspace.v2.model.BatchCreateUsersReq;
import com.huaweicloud.sdk.workspace.v2.model.BatchCreateUsersRequest;
import com.huaweicloud.sdk.workspace.v2.model.BatchCreateUsersResponse;
import com.huaweicloud.sdk.workspace.v2.model.BatchDeleteAccessPoliciesReq;
import com.huaweicloud.sdk.workspace.v2.model.BatchDeleteAccessPoliciesRequest;
import com.huaweicloud.sdk.workspace.v2.model.BatchDeleteAccessPoliciesResponse;
import com.huaweicloud.sdk.workspace.v2.model.BatchDeleteDesktopsRequest;
import com.huaweicloud.sdk.workspace.v2.model.BatchDeleteDesktopsResponse;
import com.huaweicloud.sdk.workspace.v2.model.BatchDeleteDesktopsTagsReq;
import com.huaweicloud.sdk.workspace.v2.model.BatchDeleteDesktopsTagsRequest;
import com.huaweicloud.sdk.workspace.v2.model.BatchDeleteDesktopsTagsResponse;
import com.huaweicloud.sdk.workspace.v2.model.BatchDeleteOtpDevicesRequest;
import com.huaweicloud.sdk.workspace.v2.model.BatchDeleteOtpDevicesResponse;
import com.huaweicloud.sdk.workspace.v2.model.BatchDeleteUserGroupsReq;
import com.huaweicloud.sdk.workspace.v2.model.BatchDeleteUserGroupsRequest;
import com.huaweicloud.sdk.workspace.v2.model.BatchDeleteUserGroupsResponse;
import com.huaweicloud.sdk.workspace.v2.model.BatchDisassociateDesktopsEipReq;
import com.huaweicloud.sdk.workspace.v2.model.BatchDisassociateDesktopsEipRequest;
import com.huaweicloud.sdk.workspace.v2.model.BatchDisassociateDesktopsEipResponse;
import com.huaweicloud.sdk.workspace.v2.model.BatchLogoffDesktopsRequest;
import com.huaweicloud.sdk.workspace.v2.model.BatchLogoffDesktopsResponse;
import com.huaweicloud.sdk.workspace.v2.model.BatchRebuildDesktopsSystemDiskRequest;
import com.huaweicloud.sdk.workspace.v2.model.BatchRebuildDesktopsSystemDiskResponse;
import com.huaweicloud.sdk.workspace.v2.model.BatchRunDesktopsRequest;
import com.huaweicloud.sdk.workspace.v2.model.BatchRunDesktopsResponse;
import com.huaweicloud.sdk.workspace.v2.model.CancelWorkspaceRequest;
import com.huaweicloud.sdk.workspace.v2.model.CancelWorkspaceResponse;
import com.huaweicloud.sdk.workspace.v2.model.ChangeDesktopNetworkReq;
import com.huaweicloud.sdk.workspace.v2.model.ChangeDesktopNetworkRequest;
import com.huaweicloud.sdk.workspace.v2.model.ChangeDesktopNetworkResponse;
import com.huaweicloud.sdk.workspace.v2.model.ChangeUserStatusRequest;
import com.huaweicloud.sdk.workspace.v2.model.ChangeUserStatusResponse;
import com.huaweicloud.sdk.workspace.v2.model.CreateAccessPolicyReq;
import com.huaweicloud.sdk.workspace.v2.model.CreateAccessPolicyRequest;
import com.huaweicloud.sdk.workspace.v2.model.CreateAccessPolicyResponse;
import com.huaweicloud.sdk.workspace.v2.model.CreateDesktopReq;
import com.huaweicloud.sdk.workspace.v2.model.CreateDesktopRequest;
import com.huaweicloud.sdk.workspace.v2.model.CreateDesktopResponse;
import com.huaweicloud.sdk.workspace.v2.model.CreateDesktopUserRequest;
import com.huaweicloud.sdk.workspace.v2.model.CreateDesktopUserResponse;
import com.huaweicloud.sdk.workspace.v2.model.CreateTagReq;
import com.huaweicloud.sdk.workspace.v2.model.CreateTagRequest;
import com.huaweicloud.sdk.workspace.v2.model.CreateTagResponse;
import com.huaweicloud.sdk.workspace.v2.model.CreateTerminalsBindingDesktopsRequest;
import com.huaweicloud.sdk.workspace.v2.model.CreateTerminalsBindingDesktopsRequestBody;
import com.huaweicloud.sdk.workspace.v2.model.CreateTerminalsBindingDesktopsResponse;
import com.huaweicloud.sdk.workspace.v2.model.CreateUserGroupReq;
import com.huaweicloud.sdk.workspace.v2.model.CreateUserGroupRequest;
import com.huaweicloud.sdk.workspace.v2.model.CreateUserGroupResponse;
import com.huaweicloud.sdk.workspace.v2.model.CreateUserRequest;
import com.huaweicloud.sdk.workspace.v2.model.DelOtpDevicesReq;
import com.huaweicloud.sdk.workspace.v2.model.DeleteDesktopRequest;
import com.huaweicloud.sdk.workspace.v2.model.DeleteDesktopResponse;
import com.huaweicloud.sdk.workspace.v2.model.DeleteDesktopVolumesRequest;
import com.huaweicloud.sdk.workspace.v2.model.DeleteDesktopVolumesResponse;
import com.huaweicloud.sdk.workspace.v2.model.DeleteDesktopsReq;
import com.huaweicloud.sdk.workspace.v2.model.DeleteTagRequest;
import com.huaweicloud.sdk.workspace.v2.model.DeleteTagResponse;
import com.huaweicloud.sdk.workspace.v2.model.DeleteTerminalsBindingDesktopsRequest;
import com.huaweicloud.sdk.workspace.v2.model.DeleteTerminalsBindingDesktopsRequestBody;
import com.huaweicloud.sdk.workspace.v2.model.DeleteTerminalsBindingDesktopsResponse;
import com.huaweicloud.sdk.workspace.v2.model.DeleteUserGroupRequest;
import com.huaweicloud.sdk.workspace.v2.model.DeleteUserGroupResponse;
import com.huaweicloud.sdk.workspace.v2.model.DeleteUserRequest;
import com.huaweicloud.sdk.workspace.v2.model.DeleteUserResponse;
import com.huaweicloud.sdk.workspace.v2.model.DeleteVolumesReq;
import com.huaweicloud.sdk.workspace.v2.model.EditUserGroupRequest;
import com.huaweicloud.sdk.workspace.v2.model.EditUserReq;
import com.huaweicloud.sdk.workspace.v2.model.ExpandDesktopsVolumesReq;
import com.huaweicloud.sdk.workspace.v2.model.ExpandVolumesRequest;
import com.huaweicloud.sdk.workspace.v2.model.ExpandVolumesResponse;
import com.huaweicloud.sdk.workspace.v2.model.ExportUserLoginInfoNewRequest;
import com.huaweicloud.sdk.workspace.v2.model.ExportUserLoginInfoNewResponse;
import com.huaweicloud.sdk.workspace.v2.model.ListAccessPoliciesRequest;
import com.huaweicloud.sdk.workspace.v2.model.ListAccessPoliciesResponse;
import com.huaweicloud.sdk.workspace.v2.model.ListAccessPolicyObjectsRequest;
import com.huaweicloud.sdk.workspace.v2.model.ListAccessPolicyObjectsResponse;
import com.huaweicloud.sdk.workspace.v2.model.ListAvailabilityZonesRequest;
import com.huaweicloud.sdk.workspace.v2.model.ListAvailabilityZonesResponse;
import com.huaweicloud.sdk.workspace.v2.model.ListDesktopByTagsRequest;
import com.huaweicloud.sdk.workspace.v2.model.ListDesktopByTagsResponse;
import com.huaweicloud.sdk.workspace.v2.model.ListDesktopsDetailRequest;
import com.huaweicloud.sdk.workspace.v2.model.ListDesktopsDetailResponse;
import com.huaweicloud.sdk.workspace.v2.model.ListDesktopsEipsRequest;
import com.huaweicloud.sdk.workspace.v2.model.ListDesktopsEipsResponse;
import com.huaweicloud.sdk.workspace.v2.model.ListDesktopsRequest;
import com.huaweicloud.sdk.workspace.v2.model.ListDesktopsResponse;
import com.huaweicloud.sdk.workspace.v2.model.ListHistoryOnlineInfoNewRequest;
import com.huaweicloud.sdk.workspace.v2.model.ListHistoryOnlineInfoNewResponse;
import com.huaweicloud.sdk.workspace.v2.model.ListImagesRequest;
import com.huaweicloud.sdk.workspace.v2.model.ListImagesResponse;
import com.huaweicloud.sdk.workspace.v2.model.ListItaSubJobsRequest;
import com.huaweicloud.sdk.workspace.v2.model.ListItaSubJobsResponse;
import com.huaweicloud.sdk.workspace.v2.model.ListLoginRecordsNewRequest;
import com.huaweicloud.sdk.workspace.v2.model.ListLoginRecordsNewResponse;
import com.huaweicloud.sdk.workspace.v2.model.ListOtpDevicesByUserIdRequest;
import com.huaweicloud.sdk.workspace.v2.model.ListOtpDevicesByUserIdResponse;
import com.huaweicloud.sdk.workspace.v2.model.ListProductsRequest;
import com.huaweicloud.sdk.workspace.v2.model.ListProductsResponse;
import com.huaweicloud.sdk.workspace.v2.model.ListProjectTagsRequest;
import com.huaweicloud.sdk.workspace.v2.model.ListProjectTagsResponse;
import com.huaweicloud.sdk.workspace.v2.model.ListTerminalsBindingDesktopsConfigRequest;
import com.huaweicloud.sdk.workspace.v2.model.ListTerminalsBindingDesktopsConfigResponse;
import com.huaweicloud.sdk.workspace.v2.model.ListTerminalsBindingDesktopsRequest;
import com.huaweicloud.sdk.workspace.v2.model.ListTerminalsBindingDesktopsResponse;
import com.huaweicloud.sdk.workspace.v2.model.ListUnusedDesktopsRequest;
import com.huaweicloud.sdk.workspace.v2.model.ListUnusedDesktopsResponse;
import com.huaweicloud.sdk.workspace.v2.model.ListUsedDesktopInfoReq;
import com.huaweicloud.sdk.workspace.v2.model.ListUsedDesktopInfoRequest;
import com.huaweicloud.sdk.workspace.v2.model.ListUsedDesktopInfoResponse;
import com.huaweicloud.sdk.workspace.v2.model.ListUserDetailRequest;
import com.huaweicloud.sdk.workspace.v2.model.ListUserDetailResponse;
import com.huaweicloud.sdk.workspace.v2.model.ListUserGroupsRequest;
import com.huaweicloud.sdk.workspace.v2.model.ListUserGroupsResponse;
import com.huaweicloud.sdk.workspace.v2.model.ListUsersOfGroupRequest;
import com.huaweicloud.sdk.workspace.v2.model.ListUsersOfGroupResponse;
import com.huaweicloud.sdk.workspace.v2.model.ListUsersRequest;
import com.huaweicloud.sdk.workspace.v2.model.ListUsersResponse;
import com.huaweicloud.sdk.workspace.v2.model.ListWorkspacesRequest;
import com.huaweicloud.sdk.workspace.v2.model.ListWorkspacesResponse;
import com.huaweicloud.sdk.workspace.v2.model.LogoffDesktopsReq;
import com.huaweicloud.sdk.workspace.v2.model.ModifyWorkspaceAttributesReq;
import com.huaweicloud.sdk.workspace.v2.model.OperateUserReq;
import com.huaweicloud.sdk.workspace.v2.model.QueryDesktopByTagReq;
import com.huaweicloud.sdk.workspace.v2.model.RebuildDesktopsReq;
import com.huaweicloud.sdk.workspace.v2.model.ResetRandomPasswordRequest;
import com.huaweicloud.sdk.workspace.v2.model.ResetRandomPasswordResponse;
import com.huaweicloud.sdk.workspace.v2.model.ResizeDesktopReq;
import com.huaweicloud.sdk.workspace.v2.model.ResizeDesktopRequest;
import com.huaweicloud.sdk.workspace.v2.model.ResizeDesktopResponse;
import com.huaweicloud.sdk.workspace.v2.model.RunActionsOnGroupRequest;
import com.huaweicloud.sdk.workspace.v2.model.RunActionsOnGroupResponse;
import com.huaweicloud.sdk.workspace.v2.model.ShowAssistAuthConfigRequest;
import com.huaweicloud.sdk.workspace.v2.model.ShowAssistAuthConfigResponse;
import com.huaweicloud.sdk.workspace.v2.model.ShowDesktopDetailRequest;
import com.huaweicloud.sdk.workspace.v2.model.ShowDesktopDetailResponse;
import com.huaweicloud.sdk.workspace.v2.model.ShowDesktopNetworkRequest;
import com.huaweicloud.sdk.workspace.v2.model.ShowDesktopNetworkResponse;
import com.huaweicloud.sdk.workspace.v2.model.ShowQuotasRequest;
import com.huaweicloud.sdk.workspace.v2.model.ShowQuotasResponse;
import com.huaweicloud.sdk.workspace.v2.model.ShowTagByDesktopIdRequest;
import com.huaweicloud.sdk.workspace.v2.model.ShowTagByDesktopIdResponse;
import com.huaweicloud.sdk.workspace.v2.model.ShowWorkspaceLockRequest;
import com.huaweicloud.sdk.workspace.v2.model.ShowWorkspaceLockResponse;
import com.huaweicloud.sdk.workspace.v2.model.TagsReq;
import com.huaweicloud.sdk.workspace.v2.model.TerminalsBindingDesktopsConfig;
import com.huaweicloud.sdk.workspace.v2.model.UnlockWorkspaceRequest;
import com.huaweicloud.sdk.workspace.v2.model.UnlockWorkspaceRequestBody;
import com.huaweicloud.sdk.workspace.v2.model.UnlockWorkspaceResponse;
import com.huaweicloud.sdk.workspace.v2.model.UpdateAccessPolicyObjectsReq;
import com.huaweicloud.sdk.workspace.v2.model.UpdateAccessPolicyObjectsRequest;
import com.huaweicloud.sdk.workspace.v2.model.UpdateAccessPolicyObjectsResponse;
import com.huaweicloud.sdk.workspace.v2.model.UpdateAssistAuthMethodConfigRequest;
import com.huaweicloud.sdk.workspace.v2.model.UpdateAssistAuthMethodConfigResponse;
import com.huaweicloud.sdk.workspace.v2.model.UpdateTerminalsBindingDesktopsConfigRequest;
import com.huaweicloud.sdk.workspace.v2.model.UpdateTerminalsBindingDesktopsConfigResponse;
import com.huaweicloud.sdk.workspace.v2.model.UpdateTerminalsBindingDesktopsRequest;
import com.huaweicloud.sdk.workspace.v2.model.UpdateTerminalsBindingDesktopsRequestBody;
import com.huaweicloud.sdk.workspace.v2.model.UpdateTerminalsBindingDesktopsResponse;
import com.huaweicloud.sdk.workspace.v2.model.UpdateUserGroupRequest;
import com.huaweicloud.sdk.workspace.v2.model.UpdateUserGroupResponse;
import com.huaweicloud.sdk.workspace.v2.model.UpdateUserInfoRequest;
import com.huaweicloud.sdk.workspace.v2.model.UpdateUserInfoResponse;
import com.huaweicloud.sdk.workspace.v2.model.UpdateWorkspaceRequest;
import com.huaweicloud.sdk.workspace.v2.model.UpdateWorkspaceResponse;

import java.util.List;

@SuppressWarnings("unchecked")
public class WorkspaceMeta {

    public static final HttpRequestDef<BatchDeleteAccessPoliciesRequest, BatchDeleteAccessPoliciesResponse> batchDeleteAccessPolicies =
        genForbatchDeleteAccessPolicies();

    private static HttpRequestDef<BatchDeleteAccessPoliciesRequest, BatchDeleteAccessPoliciesResponse> genForbatchDeleteAccessPolicies() {
        // basic
        HttpRequestDef.Builder<BatchDeleteAccessPoliciesRequest, BatchDeleteAccessPoliciesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    BatchDeleteAccessPoliciesRequest.class,
                    BatchDeleteAccessPoliciesResponse.class)
                .withName("BatchDeleteAccessPolicies")
                .withUri("/v2/{project_id}/access-policy")
                .withContentType("application/json");

        // requests
        builder.<BatchDeleteAccessPoliciesReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchDeleteAccessPoliciesReq.class),
            f -> f.withMarshaller(BatchDeleteAccessPoliciesRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateAccessPolicyRequest, CreateAccessPolicyResponse> createAccessPolicy =
        genForcreateAccessPolicy();

    private static HttpRequestDef<CreateAccessPolicyRequest, CreateAccessPolicyResponse> genForcreateAccessPolicy() {
        // basic
        HttpRequestDef.Builder<CreateAccessPolicyRequest, CreateAccessPolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateAccessPolicyRequest.class, CreateAccessPolicyResponse.class)
                .withName("CreateAccessPolicy")
                .withUri("/v2/{project_id}/access-policy")
                .withContentType("application/json");

        // requests
        builder.<CreateAccessPolicyReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CreateAccessPolicyReq.class),
            f -> f.withMarshaller(CreateAccessPolicyRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAccessPoliciesRequest, ListAccessPoliciesResponse> listAccessPolicies =
        genForlistAccessPolicies();

    private static HttpRequestDef<ListAccessPoliciesRequest, ListAccessPoliciesResponse> genForlistAccessPolicies() {
        // basic
        HttpRequestDef.Builder<ListAccessPoliciesRequest, ListAccessPoliciesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAccessPoliciesRequest.class, ListAccessPoliciesResponse.class)
                .withName("ListAccessPolicies")
                .withUri("/v2/{project_id}/access-policy")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAccessPoliciesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAccessPoliciesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAccessPolicyObjectsRequest, ListAccessPolicyObjectsResponse> listAccessPolicyObjects =
        genForlistAccessPolicyObjects();

    private static HttpRequestDef<ListAccessPolicyObjectsRequest, ListAccessPolicyObjectsResponse> genForlistAccessPolicyObjects() {
        // basic
        HttpRequestDef.Builder<ListAccessPolicyObjectsRequest, ListAccessPolicyObjectsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListAccessPolicyObjectsRequest.class, ListAccessPolicyObjectsResponse.class)
            .withName("ListAccessPolicyObjects")
            .withUri("/v2/{project_id}/access-policy/{access_policy_id}/objects")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("access_policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAccessPolicyObjectsRequest::getAccessPolicyId, (req, v) -> {
                req.setAccessPolicyId(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAccessPolicyObjectsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAccessPolicyObjectsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateAccessPolicyObjectsRequest, UpdateAccessPolicyObjectsResponse> updateAccessPolicyObjects =
        genForupdateAccessPolicyObjects();

    private static HttpRequestDef<UpdateAccessPolicyObjectsRequest, UpdateAccessPolicyObjectsResponse> genForupdateAccessPolicyObjects() {
        // basic
        HttpRequestDef.Builder<UpdateAccessPolicyObjectsRequest, UpdateAccessPolicyObjectsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateAccessPolicyObjectsRequest.class,
                    UpdateAccessPolicyObjectsResponse.class)
                .withName("UpdateAccessPolicyObjects")
                .withUri("/v2/{project_id}/access-policy/{access_policy_id}/objects")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("access_policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAccessPolicyObjectsRequest::getAccessPolicyId, (req, v) -> {
                req.setAccessPolicyId(v);
            }));
        builder.<UpdateAccessPolicyObjectsReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdateAccessPolicyObjectsReq.class),
            f -> f.withMarshaller(UpdateAccessPolicyObjectsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAssistAuthConfigRequest, ShowAssistAuthConfigResponse> showAssistAuthConfig =
        genForshowAssistAuthConfig();

    private static HttpRequestDef<ShowAssistAuthConfigRequest, ShowAssistAuthConfigResponse> genForshowAssistAuthConfig() {
        // basic
        HttpRequestDef.Builder<ShowAssistAuthConfigRequest, ShowAssistAuthConfigResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowAssistAuthConfigRequest.class, ShowAssistAuthConfigResponse.class)
            .withName("ShowAssistAuthConfig")
            .withUri("/v2/{project_id}/assist-auth-config/method-config")
            .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateAssistAuthMethodConfigRequest, UpdateAssistAuthMethodConfigResponse> updateAssistAuthMethodConfig =
        genForupdateAssistAuthMethodConfig();

    private static HttpRequestDef<UpdateAssistAuthMethodConfigRequest, UpdateAssistAuthMethodConfigResponse> genForupdateAssistAuthMethodConfig() {
        // basic
        HttpRequestDef.Builder<UpdateAssistAuthMethodConfigRequest, UpdateAssistAuthMethodConfigResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateAssistAuthMethodConfigRequest.class,
                    UpdateAssistAuthMethodConfigResponse.class)
                .withName("UpdateAssistAuthMethodConfig")
                .withUri("/v2/{project_id}/assist-auth-config/method-config")
                .withContentType("application/json");

        // requests
        builder.<AssistAuthMethodConfigRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AssistAuthMethodConfigRequest.class),
            f -> f.withMarshaller(UpdateAssistAuthMethodConfigRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAvailabilityZonesRequest, ListAvailabilityZonesResponse> listAvailabilityZones =
        genForlistAvailabilityZones();

    private static HttpRequestDef<ListAvailabilityZonesRequest, ListAvailabilityZonesResponse> genForlistAvailabilityZones() {
        // basic
        HttpRequestDef.Builder<ListAvailabilityZonesRequest, ListAvailabilityZonesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListAvailabilityZonesRequest.class, ListAvailabilityZonesResponse.class)
            .withName("ListAvailabilityZones")
            .withUri("/v2/{project_id}/availability-zones")
            .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExportUserLoginInfoNewRequest, ExportUserLoginInfoNewResponse> exportUserLoginInfoNew =
        genForexportUserLoginInfoNew();

    private static HttpRequestDef<ExportUserLoginInfoNewRequest, ExportUserLoginInfoNewResponse> genForexportUserLoginInfoNew() {
        // basic
        HttpRequestDef.Builder<ExportUserLoginInfoNewRequest, ExportUserLoginInfoNewResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ExportUserLoginInfoNewRequest.class, ExportUserLoginInfoNewResponse.class)
            .withName("ExportUserLoginInfoNew")
            .withUri("/v2/{project_id}/connections/desktops/export")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportUserLoginInfoNewRequest::getStartTime, (req, v) -> {
                req.setStartTime(v);
            }));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportUserLoginInfoNewRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            }));
        builder.<String>withRequestField("user_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportUserLoginInfoNewRequest::getUserName, (req, v) -> {
                req.setUserName(v);
            }));
        builder.<String>withRequestField("computer_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportUserLoginInfoNewRequest::getComputerName, (req, v) -> {
                req.setComputerName(v);
            }));
        builder.<String>withRequestField("terminal_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportUserLoginInfoNewRequest::getTerminalType, (req, v) -> {
                req.setTerminalType(v);
            }));
        builder.<String>withRequestField("language",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportUserLoginInfoNewRequest::getLanguage, (req, v) -> {
                req.setLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListHistoryOnlineInfoNewRequest, ListHistoryOnlineInfoNewResponse> listHistoryOnlineInfoNew =
        genForlistHistoryOnlineInfoNew();

    private static HttpRequestDef<ListHistoryOnlineInfoNewRequest, ListHistoryOnlineInfoNewResponse> genForlistHistoryOnlineInfoNew() {
        // basic
        HttpRequestDef.Builder<ListHistoryOnlineInfoNewRequest, ListHistoryOnlineInfoNewResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ListHistoryOnlineInfoNewRequest.class, ListHistoryOnlineInfoNewResponse.class)
                .withName("ListHistoryOnlineInfoNew")
                .withUri("/v2/{project_id}/connections/online-users")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHistoryOnlineInfoNewRequest::getStartTime, (req, v) -> {
                req.setStartTime(v);
            }));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHistoryOnlineInfoNewRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            }));
        builder.<String>withRequestField("query_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHistoryOnlineInfoNewRequest::getQueryType, (req, v) -> {
                req.setQueryType(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListLoginRecordsNewRequest, ListLoginRecordsNewResponse> listLoginRecordsNew =
        genForlistLoginRecordsNew();

    private static HttpRequestDef<ListLoginRecordsNewRequest, ListLoginRecordsNewResponse> genForlistLoginRecordsNew() {
        // basic
        HttpRequestDef.Builder<ListLoginRecordsNewRequest, ListLoginRecordsNewResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListLoginRecordsNewRequest.class, ListLoginRecordsNewResponse.class)
                .withName("ListLoginRecordsNew")
                .withUri("/v2/{project_id}/connections/desktops")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLoginRecordsNewRequest::getStartTime, (req, v) -> {
                req.setStartTime(v);
            }));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLoginRecordsNewRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            }));
        builder.<String>withRequestField("user_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLoginRecordsNewRequest::getUserName, (req, v) -> {
                req.setUserName(v);
            }));
        builder.<String>withRequestField("computer_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLoginRecordsNewRequest::getComputerName, (req, v) -> {
                req.setComputerName(v);
            }));
        builder.<String>withRequestField("terminal_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLoginRecordsNewRequest::getTerminalType, (req, v) -> {
                req.setTerminalType(v);
            }));
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLoginRecordsNewRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLoginRecordsNewRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteDesktopsRequest, BatchDeleteDesktopsResponse> batchDeleteDesktops =
        genForbatchDeleteDesktops();

    private static HttpRequestDef<BatchDeleteDesktopsRequest, BatchDeleteDesktopsResponse> genForbatchDeleteDesktops() {
        // basic
        HttpRequestDef.Builder<BatchDeleteDesktopsRequest, BatchDeleteDesktopsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchDeleteDesktopsRequest.class, BatchDeleteDesktopsResponse.class)
                .withName("BatchDeleteDesktops")
                .withUri("/v2/{project_id}/desktops/batch-delete")
                .withContentType("application/json");

        // requests
        builder.<DeleteDesktopsReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteDesktopsReq.class),
            f -> f.withMarshaller(BatchDeleteDesktopsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchLogoffDesktopsRequest, BatchLogoffDesktopsResponse> batchLogoffDesktops =
        genForbatchLogoffDesktops();

    private static HttpRequestDef<BatchLogoffDesktopsRequest, BatchLogoffDesktopsResponse> genForbatchLogoffDesktops() {
        // basic
        HttpRequestDef.Builder<BatchLogoffDesktopsRequest, BatchLogoffDesktopsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchLogoffDesktopsRequest.class, BatchLogoffDesktopsResponse.class)
                .withName("BatchLogoffDesktops")
                .withUri("/v2/{project_id}/desktops/logoff")
                .withContentType("application/json");

        // requests
        builder.<LogoffDesktopsReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(LogoffDesktopsReq.class),
            f -> f.withMarshaller(BatchLogoffDesktopsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchRebuildDesktopsSystemDiskRequest, BatchRebuildDesktopsSystemDiskResponse> batchRebuildDesktopsSystemDisk =
        genForbatchRebuildDesktopsSystemDisk();

    private static HttpRequestDef<BatchRebuildDesktopsSystemDiskRequest, BatchRebuildDesktopsSystemDiskResponse> genForbatchRebuildDesktopsSystemDisk() {
        // basic
        HttpRequestDef.Builder<BatchRebuildDesktopsSystemDiskRequest, BatchRebuildDesktopsSystemDiskResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    BatchRebuildDesktopsSystemDiskRequest.class,
                    BatchRebuildDesktopsSystemDiskResponse.class)
                .withName("BatchRebuildDesktopsSystemDisk")
                .withUri("/v2/{project_id}/desktops/rebuild")
                .withContentType("application/json");

        // requests
        builder.<RebuildDesktopsReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RebuildDesktopsReq.class),
            f -> f.withMarshaller(BatchRebuildDesktopsSystemDiskRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchRunDesktopsRequest, BatchRunDesktopsResponse> batchRunDesktops =
        genForbatchRunDesktops();

    private static HttpRequestDef<BatchRunDesktopsRequest, BatchRunDesktopsResponse> genForbatchRunDesktops() {
        // basic
        HttpRequestDef.Builder<BatchRunDesktopsRequest, BatchRunDesktopsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchRunDesktopsRequest.class, BatchRunDesktopsResponse.class)
                .withName("BatchRunDesktops")
                .withUri("/v2/{project_id}/desktops/action")
                .withContentType("application/json");

        // requests
        builder.<BatchActionDesktopsReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchActionDesktopsReq.class),
            f -> f.withMarshaller(BatchRunDesktopsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ChangeDesktopNetworkRequest, ChangeDesktopNetworkResponse> changeDesktopNetwork =
        genForchangeDesktopNetwork();

    private static HttpRequestDef<ChangeDesktopNetworkRequest, ChangeDesktopNetworkResponse> genForchangeDesktopNetwork() {
        // basic
        HttpRequestDef.Builder<ChangeDesktopNetworkRequest, ChangeDesktopNetworkResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, ChangeDesktopNetworkRequest.class, ChangeDesktopNetworkResponse.class)
            .withName("ChangeDesktopNetwork")
            .withUri("/v2/{project_id}/desktops/{desktop_id}/networks")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("desktop_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ChangeDesktopNetworkRequest::getDesktopId, (req, v) -> {
                req.setDesktopId(v);
            }));
        builder.<ChangeDesktopNetworkReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ChangeDesktopNetworkReq.class),
            f -> f.withMarshaller(ChangeDesktopNetworkRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateDesktopRequest, CreateDesktopResponse> createDesktop =
        genForcreateDesktop();

    private static HttpRequestDef<CreateDesktopRequest, CreateDesktopResponse> genForcreateDesktop() {
        // basic
        HttpRequestDef.Builder<CreateDesktopRequest, CreateDesktopResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateDesktopRequest.class, CreateDesktopResponse.class)
                .withName("CreateDesktop")
                .withUri("/v2/{project_id}/desktops")
                .withContentType("application/json");

        // requests
        builder.<CreateDesktopReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateDesktopReq.class),
            f -> f.withMarshaller(CreateDesktopRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteDesktopRequest, DeleteDesktopResponse> deleteDesktop =
        genFordeleteDesktop();

    private static HttpRequestDef<DeleteDesktopRequest, DeleteDesktopResponse> genFordeleteDesktop() {
        // basic
        HttpRequestDef.Builder<DeleteDesktopRequest, DeleteDesktopResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteDesktopRequest.class, DeleteDesktopResponse.class)
                .withName("DeleteDesktop")
                .withUri("/v2/{project_id}/desktops/{desktop_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("desktop_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDesktopRequest::getDesktopId, (req, v) -> {
                req.setDesktopId(v);
            }));
        builder.<Boolean>withRequestField("delete_users",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(DeleteDesktopRequest::getDeleteUsers, (req, v) -> {
                req.setDeleteUsers(v);
            }));
        builder.<Boolean>withRequestField("email_notification",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(DeleteDesktopRequest::getEmailNotification, (req, v) -> {
                req.setEmailNotification(v);
            }));
        builder.<Boolean>withRequestField("is_force_delete",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(DeleteDesktopRequest::getIsForceDelete, (req, v) -> {
                req.setIsForceDelete(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDesktopsRequest, ListDesktopsResponse> listDesktops = genForlistDesktops();

    private static HttpRequestDef<ListDesktopsRequest, ListDesktopsResponse> genForlistDesktops() {
        // basic
        HttpRequestDef.Builder<ListDesktopsRequest, ListDesktopsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListDesktopsRequest.class, ListDesktopsResponse.class)
                .withName("ListDesktops")
                .withUri("/v2/{project_id}/desktops")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("user_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDesktopsRequest::getUserName, (req, v) -> {
                req.setUserName(v);
            }));
        builder.<String>withRequestField("computer_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDesktopsRequest::getComputerName, (req, v) -> {
                req.setComputerName(v);
            }));
        builder.<String>withRequestField("desktop_ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDesktopsRequest::getDesktopIp, (req, v) -> {
                req.setDesktopIp(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDesktopsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDesktopsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("pool_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDesktopsRequest::getPoolId, (req, v) -> {
                req.setPoolId(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDesktopsRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<String>withRequestField("desktop_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDesktopsRequest::getDesktopType, (req, v) -> {
                req.setDesktopType(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDesktopsDetailRequest, ListDesktopsDetailResponse> listDesktopsDetail =
        genForlistDesktopsDetail();

    private static HttpRequestDef<ListDesktopsDetailRequest, ListDesktopsDetailResponse> genForlistDesktopsDetail() {
        // basic
        HttpRequestDef.Builder<ListDesktopsDetailRequest, ListDesktopsDetailResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListDesktopsDetailRequest.class, ListDesktopsDetailResponse.class)
                .withName("ListDesktopsDetail")
                .withUri("/v2/{project_id}/desktops/detail")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDesktopsDetailRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            }));
        builder.<String>withRequestField("user_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDesktopsDetailRequest::getUserName, (req, v) -> {
                req.setUserName(v);
            }));
        builder.<List<String>>withRequestField("user_names",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListDesktopsDetailRequest::getUserNames, (req, v) -> {
                req.setUserNames(v);
            }));
        builder.<ListDesktopsDetailRequest.SortFieldEnum>withRequestField("sort_field",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListDesktopsDetailRequest.SortFieldEnum.class),
            f -> f.withMarshaller(ListDesktopsDetailRequest::getSortField, (req, v) -> {
                req.setSortField(v);
            }));
        builder.<ListDesktopsDetailRequest.SortTypeEnum>withRequestField("sort_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListDesktopsDetailRequest.SortTypeEnum.class),
            f -> f.withMarshaller(ListDesktopsDetailRequest::getSortType, (req, v) -> {
                req.setSortType(v);
            }));
        builder.<String>withRequestField("computer_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDesktopsDetailRequest::getComputerName, (req, v) -> {
                req.setComputerName(v);
            }));
        builder.<String>withRequestField("desktop_ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDesktopsDetailRequest::getDesktopIp, (req, v) -> {
                req.setDesktopIp(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDesktopsDetailRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDesktopsDetailRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<List<String>>withRequestField("desktop_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListDesktopsDetailRequest::getDesktopId, (req, v) -> {
                req.setDesktopId(v);
            }));
        builder.<String>withRequestField("desktop_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDesktopsDetailRequest::getDesktopType, (req, v) -> {
                req.setDesktopType(v);
            }));
        builder.<String>withRequestField("tag",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDesktopsDetailRequest::getTag, (req, v) -> {
                req.setTag(v);
            }));
        builder.<String>withRequestField("pool_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDesktopsDetailRequest::getPoolId, (req, v) -> {
                req.setPoolId(v);
            }));
        builder.<Boolean>withRequestField("user_attached",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListDesktopsDetailRequest::getUserAttached, (req, v) -> {
                req.setUserAttached(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDesktopsDetailRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<String>withRequestField("image_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDesktopsDetailRequest::getImageId, (req, v) -> {
                req.setImageId(v);
            }));
        builder.<String>withRequestField("charge_mode",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDesktopsDetailRequest::getChargeMode, (req, v) -> {
                req.setChargeMode(v);
            }));
        builder.<Boolean>withRequestField("in_maintenance_mode",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListDesktopsDetailRequest::getInMaintenanceMode, (req, v) -> {
                req.setInMaintenanceMode(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ResizeDesktopRequest, ResizeDesktopResponse> resizeDesktop =
        genForresizeDesktop();

    private static HttpRequestDef<ResizeDesktopRequest, ResizeDesktopResponse> genForresizeDesktop() {
        // basic
        HttpRequestDef.Builder<ResizeDesktopRequest, ResizeDesktopResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ResizeDesktopRequest.class, ResizeDesktopResponse.class)
                .withName("ResizeDesktop")
                .withUri("/v2/{project_id}/desktops/resize")
                .withContentType("application/json");

        // requests
        builder.<ResizeDesktopReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ResizeDesktopReq.class),
            f -> f.withMarshaller(ResizeDesktopRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDesktopDetailRequest, ShowDesktopDetailResponse> showDesktopDetail =
        genForshowDesktopDetail();

    private static HttpRequestDef<ShowDesktopDetailRequest, ShowDesktopDetailResponse> genForshowDesktopDetail() {
        // basic
        HttpRequestDef.Builder<ShowDesktopDetailRequest, ShowDesktopDetailResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowDesktopDetailRequest.class, ShowDesktopDetailResponse.class)
                .withName("ShowDesktopDetail")
                .withUri("/v2/{project_id}/desktops/{desktop_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("desktop_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDesktopDetailRequest::getDesktopId, (req, v) -> {
                req.setDesktopId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDesktopNetworkRequest, ShowDesktopNetworkResponse> showDesktopNetwork =
        genForshowDesktopNetwork();

    private static HttpRequestDef<ShowDesktopNetworkRequest, ShowDesktopNetworkResponse> genForshowDesktopNetwork() {
        // basic
        HttpRequestDef.Builder<ShowDesktopNetworkRequest, ShowDesktopNetworkResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowDesktopNetworkRequest.class, ShowDesktopNetworkResponse.class)
                .withName("ShowDesktopNetwork")
                .withUri("/v2/{project_id}/desktops/{desktop_id}/networks")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("desktop_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDesktopNetworkRequest::getDesktopId, (req, v) -> {
                req.setDesktopId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListUnusedDesktopsRequest, ListUnusedDesktopsResponse> listUnusedDesktops =
        genForlistUnusedDesktops();

    private static HttpRequestDef<ListUnusedDesktopsRequest, ListUnusedDesktopsResponse> genForlistUnusedDesktops() {
        // basic
        HttpRequestDef.Builder<ListUnusedDesktopsRequest, ListUnusedDesktopsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListUnusedDesktopsRequest.class, ListUnusedDesktopsResponse.class)
                .withName("ListUnusedDesktops")
                .withUri("/v2/{project_id}/desktops/statistics/unused")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListUnusedDesktopsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListUnusedDesktopsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUnusedDesktopsRequest::getStartTime, (req, v) -> {
                req.setStartTime(v);
            }));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUnusedDesktopsRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListUsedDesktopInfoRequest, ListUsedDesktopInfoResponse> listUsedDesktopInfo =
        genForlistUsedDesktopInfo();

    private static HttpRequestDef<ListUsedDesktopInfoRequest, ListUsedDesktopInfoResponse> genForlistUsedDesktopInfo() {
        // basic
        HttpRequestDef.Builder<ListUsedDesktopInfoRequest, ListUsedDesktopInfoResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListUsedDesktopInfoRequest.class, ListUsedDesktopInfoResponse.class)
                .withName("ListUsedDesktopInfo")
                .withUri("/v2/{project_id}/desktops/statistics/used")
                .withContentType("application/json");

        // requests
        builder.<ListUsedDesktopInfoReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListUsedDesktopInfoReq.class),
            f -> f.withMarshaller(ListUsedDesktopInfoRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchAddDesktopsTagsRequest, BatchAddDesktopsTagsResponse> batchAddDesktopsTags =
        genForbatchAddDesktopsTags();

    private static HttpRequestDef<BatchAddDesktopsTagsRequest, BatchAddDesktopsTagsResponse> genForbatchAddDesktopsTags() {
        // basic
        HttpRequestDef.Builder<BatchAddDesktopsTagsRequest, BatchAddDesktopsTagsResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, BatchAddDesktopsTagsRequest.class, BatchAddDesktopsTagsResponse.class)
            .withName("BatchAddDesktopsTags")
            .withUri("/v2/{project_id}/desktops/batch-tags")
            .withContentType("application/json");

        // requests
        builder.<BatchAddDesktopsTagsReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchAddDesktopsTagsReq.class),
            f -> f.withMarshaller(BatchAddDesktopsTagsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchChangeTagsRequest, BatchChangeTagsResponse> batchChangeTags =
        genForbatchChangeTags();

    private static HttpRequestDef<BatchChangeTagsRequest, BatchChangeTagsResponse> genForbatchChangeTags() {
        // basic
        HttpRequestDef.Builder<BatchChangeTagsRequest, BatchChangeTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchChangeTagsRequest.class, BatchChangeTagsResponse.class)
                .withName("BatchChangeTags")
                .withUri("/v2/{project_id}/desktops/{desktop_id}/tags/action")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("desktop_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchChangeTagsRequest::getDesktopId, (req, v) -> {
                req.setDesktopId(v);
            }));
        builder.<TagsReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(TagsReq.class),
            f -> f.withMarshaller(BatchChangeTagsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteDesktopsTagsRequest, BatchDeleteDesktopsTagsResponse> batchDeleteDesktopsTags =
        genForbatchDeleteDesktopsTags();

    private static HttpRequestDef<BatchDeleteDesktopsTagsRequest, BatchDeleteDesktopsTagsResponse> genForbatchDeleteDesktopsTags() {
        // basic
        HttpRequestDef.Builder<BatchDeleteDesktopsTagsRequest, BatchDeleteDesktopsTagsResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, BatchDeleteDesktopsTagsRequest.class, BatchDeleteDesktopsTagsResponse.class)
            .withName("BatchDeleteDesktopsTags")
            .withUri("/v2/{project_id}/desktops/batch-tags")
            .withContentType("application/json");

        // requests
        builder.<BatchDeleteDesktopsTagsReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchDeleteDesktopsTagsReq.class),
            f -> f.withMarshaller(BatchDeleteDesktopsTagsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateTagRequest, CreateTagResponse> createTag = genForcreateTag();

    private static HttpRequestDef<CreateTagRequest, CreateTagResponse> genForcreateTag() {
        // basic
        HttpRequestDef.Builder<CreateTagRequest, CreateTagResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateTagRequest.class, CreateTagResponse.class)
                .withName("CreateTag")
                .withUri("/v2/{project_id}/desktops/{desktop_id}/tags")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("desktop_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateTagRequest::getDesktopId, (req, v) -> {
                req.setDesktopId(v);
            }));
        builder.<CreateTagReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateTagReq.class),
            f -> f.withMarshaller(CreateTagRequest::getBody, (req, v) -> {
                req.setBody(v);
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
                .withUri("/v2/{project_id}/desktops/{desktop_id}/tags/{key}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("desktop_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTagRequest::getDesktopId, (req, v) -> {
                req.setDesktopId(v);
            }));
        builder.<String>withRequestField("key",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTagRequest::getKey, (req, v) -> {
                req.setKey(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDesktopByTagsRequest, ListDesktopByTagsResponse> listDesktopByTags =
        genForlistDesktopByTags();

    private static HttpRequestDef<ListDesktopByTagsRequest, ListDesktopByTagsResponse> genForlistDesktopByTags() {
        // basic
        HttpRequestDef.Builder<ListDesktopByTagsRequest, ListDesktopByTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListDesktopByTagsRequest.class, ListDesktopByTagsResponse.class)
                .withName("ListDesktopByTags")
                .withUri("/v2/{project_id}/desktops/resource_instances/action")
                .withContentType("application/json");

        // requests
        builder.<QueryDesktopByTagReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(QueryDesktopByTagReq.class),
            f -> f.withMarshaller(ListDesktopByTagsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListProjectTagsRequest, ListProjectTagsResponse> listProjectTags =
        genForlistProjectTags();

    private static HttpRequestDef<ListProjectTagsRequest, ListProjectTagsResponse> genForlistProjectTags() {
        // basic
        HttpRequestDef.Builder<ListProjectTagsRequest, ListProjectTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListProjectTagsRequest.class, ListProjectTagsResponse.class)
                .withName("ListProjectTags")
                .withUri("/v2/{project_id}/desktops/tags")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTagByDesktopIdRequest, ShowTagByDesktopIdResponse> showTagByDesktopId =
        genForshowTagByDesktopId();

    private static HttpRequestDef<ShowTagByDesktopIdRequest, ShowTagByDesktopIdResponse> genForshowTagByDesktopId() {
        // basic
        HttpRequestDef.Builder<ShowTagByDesktopIdRequest, ShowTagByDesktopIdResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowTagByDesktopIdRequest.class, ShowTagByDesktopIdResponse.class)
                .withName("ShowTagByDesktopId")
                .withUri("/v2/{project_id}/desktops/{desktop_id}/tags")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("desktop_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTagByDesktopIdRequest::getDesktopId, (req, v) -> {
                req.setDesktopId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteUserGroupsRequest, BatchDeleteUserGroupsResponse> batchDeleteUserGroups =
        genForbatchDeleteUserGroups();

    private static HttpRequestDef<BatchDeleteUserGroupsRequest, BatchDeleteUserGroupsResponse> genForbatchDeleteUserGroups() {
        // basic
        HttpRequestDef.Builder<BatchDeleteUserGroupsRequest, BatchDeleteUserGroupsResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, BatchDeleteUserGroupsRequest.class, BatchDeleteUserGroupsResponse.class)
            .withName("BatchDeleteUserGroups")
            .withUri("/v2/{project_id}/groups/batch-delete")
            .withContentType("application/json");

        // requests
        builder.<BatchDeleteUserGroupsReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchDeleteUserGroupsReq.class),
            f -> f.withMarshaller(BatchDeleteUserGroupsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateUserGroupRequest, CreateUserGroupResponse> createUserGroup =
        genForcreateUserGroup();

    private static HttpRequestDef<CreateUserGroupRequest, CreateUserGroupResponse> genForcreateUserGroup() {
        // basic
        HttpRequestDef.Builder<CreateUserGroupRequest, CreateUserGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateUserGroupRequest.class, CreateUserGroupResponse.class)
                .withName("CreateUserGroup")
                .withUri("/v2/{project_id}/groups")
                .withContentType("application/json");

        // requests
        builder.<CreateUserGroupReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateUserGroupReq.class),
            f -> f.withMarshaller(CreateUserGroupRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteUserGroupRequest, DeleteUserGroupResponse> deleteUserGroup =
        genFordeleteUserGroup();

    private static HttpRequestDef<DeleteUserGroupRequest, DeleteUserGroupResponse> genFordeleteUserGroup() {
        // basic
        HttpRequestDef.Builder<DeleteUserGroupRequest, DeleteUserGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteUserGroupRequest.class, DeleteUserGroupResponse.class)
                .withName("DeleteUserGroup")
                .withUri("/v2/{project_id}/groups/{group_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteUserGroupRequest::getGroupId, (req, v) -> {
                req.setGroupId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListUserGroupsRequest, ListUserGroupsResponse> listUserGroups =
        genForlistUserGroups();

    private static HttpRequestDef<ListUserGroupsRequest, ListUserGroupsResponse> genForlistUserGroups() {
        // basic
        HttpRequestDef.Builder<ListUserGroupsRequest, ListUserGroupsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListUserGroupsRequest.class, ListUserGroupsResponse.class)
                .withName("ListUserGroups")
                .withUri("/v2/{project_id}/groups")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUserGroupsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUserGroupsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("keyword",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUserGroupsRequest::getKeyword, (req, v) -> {
                req.setKeyword(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListUsersOfGroupRequest, ListUsersOfGroupResponse> listUsersOfGroup =
        genForlistUsersOfGroup();

    private static HttpRequestDef<ListUsersOfGroupRequest, ListUsersOfGroupResponse> genForlistUsersOfGroup() {
        // basic
        HttpRequestDef.Builder<ListUsersOfGroupRequest, ListUsersOfGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListUsersOfGroupRequest.class, ListUsersOfGroupResponse.class)
                .withName("ListUsersOfGroup")
                .withUri("/v2/{project_id}/groups/{group_id}/users")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUsersOfGroupRequest::getGroupId, (req, v) -> {
                req.setGroupId(v);
            }));
        builder.<String>withRequestField("user_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUsersOfGroupRequest::getUserName, (req, v) -> {
                req.setUserName(v);
            }));
        builder.<String>withRequestField("description",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUsersOfGroupRequest::getDescription, (req, v) -> {
                req.setDescription(v);
            }));
        builder.<ListUsersOfGroupRequest.ActiveTypeEnum>withRequestField("active_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListUsersOfGroupRequest.ActiveTypeEnum.class),
            f -> f.withMarshaller(ListUsersOfGroupRequest::getActiveType, (req, v) -> {
                req.setActiveType(v);
            }));
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUsersOfGroupRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUsersOfGroupRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RunActionsOnGroupRequest, RunActionsOnGroupResponse> runActionsOnGroup =
        genForrunActionsOnGroup();

    private static HttpRequestDef<RunActionsOnGroupRequest, RunActionsOnGroupResponse> genForrunActionsOnGroup() {
        // basic
        HttpRequestDef.Builder<RunActionsOnGroupRequest, RunActionsOnGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RunActionsOnGroupRequest.class, RunActionsOnGroupResponse.class)
                .withName("RunActionsOnGroup")
                .withUri("/v2/{project_id}/groups/{group_id}/actions")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RunActionsOnGroupRequest::getGroupId, (req, v) -> {
                req.setGroupId(v);
            }));
        builder.<ActionsOfUsersInGroupRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ActionsOfUsersInGroupRequest.class),
            f -> f.withMarshaller(RunActionsOnGroupRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateUserGroupRequest, UpdateUserGroupResponse> updateUserGroup =
        genForupdateUserGroup();

    private static HttpRequestDef<UpdateUserGroupRequest, UpdateUserGroupResponse> genForupdateUserGroup() {
        // basic
        HttpRequestDef.Builder<UpdateUserGroupRequest, UpdateUserGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateUserGroupRequest.class, UpdateUserGroupResponse.class)
                .withName("UpdateUserGroup")
                .withUri("/v2/{project_id}/groups/{group_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateUserGroupRequest::getGroupId, (req, v) -> {
                req.setGroupId(v);
            }));
        builder.<EditUserGroupRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(EditUserGroupRequest.class),
            f -> f.withMarshaller(UpdateUserGroupRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListImagesRequest, ListImagesResponse> listImages = genForlistImages();

    private static HttpRequestDef<ListImagesRequest, ListImagesResponse> genForlistImages() {
        // basic
        HttpRequestDef.Builder<ListImagesRequest, ListImagesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListImagesRequest.class, ListImagesResponse.class)
                .withName("ListImages")
                .withUri("/v2/{project_id}/images")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("os_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImagesRequest::getOsType, (req, v) -> {
                req.setOsType(v);
            }));
        builder.<String>withRequestField("image_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImagesRequest::getImageType, (req, v) -> {
                req.setImageType(v);
            }));
        builder.<String>withRequestField("platform",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImagesRequest::getPlatform, (req, v) -> {
                req.setPlatform(v);
            }));
        builder.<String>withRequestField("architecture",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImagesRequest::getArchitecture, (req, v) -> {
                req.setArchitecture(v);
            }));
        builder.<String>withRequestField("package_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImagesRequest::getPackageType, (req, v) -> {
                req.setPackageType(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListImagesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListImagesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListItaSubJobsRequest, ListItaSubJobsResponse> listItaSubJobs =
        genForlistItaSubJobs();

    private static HttpRequestDef<ListItaSubJobsRequest, ListItaSubJobsResponse> genForlistItaSubJobs() {
        // basic
        HttpRequestDef.Builder<ListItaSubJobsRequest, ListItaSubJobsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListItaSubJobsRequest.class, ListItaSubJobsResponse.class)
                .withName("ListItaSubJobs")
                .withUri("/v2/{project_id}/workspace-sub-jobs")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListItaSubJobsRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            }));
        builder.<String>withRequestField("job_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListItaSubJobsRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));
        builder.<String>withRequestField("job_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListItaSubJobsRequest::getJobType, (req, v) -> {
                req.setJobType(v);
            }));
        builder.<String>withRequestField("desktop_pool_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListItaSubJobsRequest::getDesktopPoolId, (req, v) -> {
                req.setDesktopPoolId(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListItaSubJobsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListItaSubJobsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ApplyDesktopsInternetRequest, ApplyDesktopsInternetResponse> applyDesktopsInternet =
        genForapplyDesktopsInternet();

    private static HttpRequestDef<ApplyDesktopsInternetRequest, ApplyDesktopsInternetResponse> genForapplyDesktopsInternet() {
        // basic
        HttpRequestDef.Builder<ApplyDesktopsInternetRequest, ApplyDesktopsInternetResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ApplyDesktopsInternetRequest.class, ApplyDesktopsInternetResponse.class)
            .withName("ApplyDesktopsInternet")
            .withUri("/v2/{project_id}/eips")
            .withContentType("application/json");

        // requests
        builder.<ApplyDesktopsInternetReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ApplyDesktopsInternetReq.class),
            f -> f.withMarshaller(ApplyDesktopsInternetRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AssociateDesktopsEipRequest, AssociateDesktopsEipResponse> associateDesktopsEip =
        genForassociateDesktopsEip();

    private static HttpRequestDef<AssociateDesktopsEipRequest, AssociateDesktopsEipResponse> genForassociateDesktopsEip() {
        // basic
        HttpRequestDef.Builder<AssociateDesktopsEipRequest, AssociateDesktopsEipResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, AssociateDesktopsEipRequest.class, AssociateDesktopsEipResponse.class)
            .withName("AssociateDesktopsEip")
            .withUri("/v2/{project_id}/eips/binding")
            .withContentType("application/json");

        // requests
        builder.<AssociateDesktopsEipReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AssociateDesktopsEipReq.class),
            f -> f.withMarshaller(AssociateDesktopsEipRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDisassociateDesktopsEipRequest, BatchDisassociateDesktopsEipResponse> batchDisassociateDesktopsEip =
        genForbatchDisassociateDesktopsEip();

    private static HttpRequestDef<BatchDisassociateDesktopsEipRequest, BatchDisassociateDesktopsEipResponse> genForbatchDisassociateDesktopsEip() {
        // basic
        HttpRequestDef.Builder<BatchDisassociateDesktopsEipRequest, BatchDisassociateDesktopsEipResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    BatchDisassociateDesktopsEipRequest.class,
                    BatchDisassociateDesktopsEipResponse.class)
                .withName("BatchDisassociateDesktopsEip")
                .withUri("/v2/{project_id}/eips/unbinding")
                .withContentType("application/json");

        // requests
        builder.<BatchDisassociateDesktopsEipReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchDisassociateDesktopsEipReq.class),
            f -> f.withMarshaller(BatchDisassociateDesktopsEipRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDesktopsEipsRequest, ListDesktopsEipsResponse> listDesktopsEips =
        genForlistDesktopsEips();

    private static HttpRequestDef<ListDesktopsEipsRequest, ListDesktopsEipsResponse> genForlistDesktopsEips() {
        // basic
        HttpRequestDef.Builder<ListDesktopsEipsRequest, ListDesktopsEipsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListDesktopsEipsRequest.class, ListDesktopsEipsResponse.class)
                .withName("ListDesktopsEips")
                .withUri("/v2/{project_id}/eips")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDesktopsEipsRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<String>withRequestField("desktop_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDesktopsEipsRequest::getDesktopId, (req, v) -> {
                req.setDesktopId(v);
            }));
        builder.<String>withRequestField("desktop_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDesktopsEipsRequest::getDesktopName, (req, v) -> {
                req.setDesktopName(v);
            }));
        builder.<String>withRequestField("user_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDesktopsEipsRequest::getUserName, (req, v) -> {
                req.setUserName(v);
            }));
        builder.<String>withRequestField("address",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDesktopsEipsRequest::getAddress, (req, v) -> {
                req.setAddress(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDesktopsEipsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDesktopsEipsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("state",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDesktopsEipsRequest::getState, (req, v) -> {
                req.setState(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListProductsRequest, ListProductsResponse> listProducts = genForlistProducts();

    private static HttpRequestDef<ListProductsRequest, ListProductsResponse> genForlistProducts() {
        // basic
        HttpRequestDef.Builder<ListProductsRequest, ListProductsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListProductsRequest.class, ListProductsResponse.class)
                .withName("ListProducts")
                .withUri("/v2/{project_id}/products")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("product_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProductsRequest::getProductId, (req, v) -> {
                req.setProductId(v);
            }));
        builder.<String>withRequestField("availability_zone",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProductsRequest::getAvailabilityZone, (req, v) -> {
                req.setAvailabilityZone(v);
            }));
        builder.<String>withRequestField("os_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProductsRequest::getOsType, (req, v) -> {
                req.setOsType(v);
            }));
        builder.<String>withRequestField("charge_mode",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProductsRequest::getChargeMode, (req, v) -> {
                req.setChargeMode(v);
            }));
        builder.<String>withRequestField("architecture",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProductsRequest::getArchitecture, (req, v) -> {
                req.setArchitecture(v);
            }));
        builder.<String>withRequestField("package_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProductsRequest::getPackageType, (req, v) -> {
                req.setPackageType(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListProductsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListProductsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowQuotasRequest, ShowQuotasResponse> showQuotas = genForshowQuotas();

    private static HttpRequestDef<ShowQuotasRequest, ShowQuotasResponse> genForshowQuotas() {
        // basic
        HttpRequestDef.Builder<ShowQuotasRequest, ShowQuotasResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowQuotasRequest.class, ShowQuotasResponse.class)
                .withName("ShowQuotas")
                .withUri("/v2/{project_id}/quotas")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateTerminalsBindingDesktopsRequest, CreateTerminalsBindingDesktopsResponse> createTerminalsBindingDesktops =
        genForcreateTerminalsBindingDesktops();

    private static HttpRequestDef<CreateTerminalsBindingDesktopsRequest, CreateTerminalsBindingDesktopsResponse> genForcreateTerminalsBindingDesktops() {
        // basic
        HttpRequestDef.Builder<CreateTerminalsBindingDesktopsRequest, CreateTerminalsBindingDesktopsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateTerminalsBindingDesktopsRequest.class,
                    CreateTerminalsBindingDesktopsResponse.class)
                .withName("CreateTerminalsBindingDesktops")
                .withUri("/v2/{project_id}/terminals/binding-desktops")
                .withContentType("application/json");

        // requests
        builder.<CreateTerminalsBindingDesktopsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateTerminalsBindingDesktopsRequestBody.class),
            f -> f.withMarshaller(CreateTerminalsBindingDesktopsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteTerminalsBindingDesktopsRequest, DeleteTerminalsBindingDesktopsResponse> deleteTerminalsBindingDesktops =
        genFordeleteTerminalsBindingDesktops();

    private static HttpRequestDef<DeleteTerminalsBindingDesktopsRequest, DeleteTerminalsBindingDesktopsResponse> genFordeleteTerminalsBindingDesktops() {
        // basic
        HttpRequestDef.Builder<DeleteTerminalsBindingDesktopsRequest, DeleteTerminalsBindingDesktopsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    DeleteTerminalsBindingDesktopsRequest.class,
                    DeleteTerminalsBindingDesktopsResponse.class)
                .withName("DeleteTerminalsBindingDesktops")
                .withUri("/v2/{project_id}/terminals/binding-desktops/batch-delete")
                .withContentType("application/json");

        // requests
        builder.<DeleteTerminalsBindingDesktopsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteTerminalsBindingDesktopsRequestBody.class),
            f -> f.withMarshaller(DeleteTerminalsBindingDesktopsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTerminalsBindingDesktopsRequest, ListTerminalsBindingDesktopsResponse> listTerminalsBindingDesktops =
        genForlistTerminalsBindingDesktops();

    private static HttpRequestDef<ListTerminalsBindingDesktopsRequest, ListTerminalsBindingDesktopsResponse> genForlistTerminalsBindingDesktops() {
        // basic
        HttpRequestDef.Builder<ListTerminalsBindingDesktopsRequest, ListTerminalsBindingDesktopsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListTerminalsBindingDesktopsRequest.class,
                    ListTerminalsBindingDesktopsResponse.class)
                .withName("ListTerminalsBindingDesktops")
                .withUri("/v2/{project_id}/terminals/binding-desktops")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("computer_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTerminalsBindingDesktopsRequest::getComputerName, (req, v) -> {
                req.setComputerName(v);
            }));
        builder.<String>withRequestField("mac",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTerminalsBindingDesktopsRequest::getMac, (req, v) -> {
                req.setMac(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTerminalsBindingDesktopsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTerminalsBindingDesktopsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Boolean>withRequestField("count_only",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListTerminalsBindingDesktopsRequest::getCountOnly, (req, v) -> {
                req.setCountOnly(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTerminalsBindingDesktopsConfigRequest, ListTerminalsBindingDesktopsConfigResponse> listTerminalsBindingDesktopsConfig =
        genForlistTerminalsBindingDesktopsConfig();

    private static HttpRequestDef<ListTerminalsBindingDesktopsConfigRequest, ListTerminalsBindingDesktopsConfigResponse> genForlistTerminalsBindingDesktopsConfig() {
        // basic
        HttpRequestDef.Builder<ListTerminalsBindingDesktopsConfigRequest, ListTerminalsBindingDesktopsConfigResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListTerminalsBindingDesktopsConfigRequest.class,
                    ListTerminalsBindingDesktopsConfigResponse.class)
                .withName("ListTerminalsBindingDesktopsConfig")
                .withUri("/v2/{project_id}/terminals/binding-desktops/config")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateTerminalsBindingDesktopsRequest, UpdateTerminalsBindingDesktopsResponse> updateTerminalsBindingDesktops =
        genForupdateTerminalsBindingDesktops();

    private static HttpRequestDef<UpdateTerminalsBindingDesktopsRequest, UpdateTerminalsBindingDesktopsResponse> genForupdateTerminalsBindingDesktops() {
        // basic
        HttpRequestDef.Builder<UpdateTerminalsBindingDesktopsRequest, UpdateTerminalsBindingDesktopsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateTerminalsBindingDesktopsRequest.class,
                    UpdateTerminalsBindingDesktopsResponse.class)
                .withName("UpdateTerminalsBindingDesktops")
                .withUri("/v2/{project_id}/terminals/binding-desktops")
                .withContentType("application/json");

        // requests
        builder.<UpdateTerminalsBindingDesktopsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateTerminalsBindingDesktopsRequestBody.class),
            f -> f.withMarshaller(UpdateTerminalsBindingDesktopsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateTerminalsBindingDesktopsConfigRequest, UpdateTerminalsBindingDesktopsConfigResponse> updateTerminalsBindingDesktopsConfig =
        genForupdateTerminalsBindingDesktopsConfig();

    private static HttpRequestDef<UpdateTerminalsBindingDesktopsConfigRequest, UpdateTerminalsBindingDesktopsConfigResponse> genForupdateTerminalsBindingDesktopsConfig() {
        // basic
        HttpRequestDef.Builder<UpdateTerminalsBindingDesktopsConfigRequest, UpdateTerminalsBindingDesktopsConfigResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    UpdateTerminalsBindingDesktopsConfigRequest.class,
                    UpdateTerminalsBindingDesktopsConfigResponse.class)
                .withName("UpdateTerminalsBindingDesktopsConfig")
                .withUri("/v2/{project_id}/terminals/binding-desktops/config")
                .withContentType("application/json");

        // requests
        builder.<TerminalsBindingDesktopsConfig>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(TerminalsBindingDesktopsConfig.class),
            f -> f.withMarshaller(UpdateTerminalsBindingDesktopsConfigRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchCreateUsersRequest, BatchCreateUsersResponse> batchCreateUsers =
        genForbatchCreateUsers();

    private static HttpRequestDef<BatchCreateUsersRequest, BatchCreateUsersResponse> genForbatchCreateUsers() {
        // basic
        HttpRequestDef.Builder<BatchCreateUsersRequest, BatchCreateUsersResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchCreateUsersRequest.class, BatchCreateUsersResponse.class)
                .withName("BatchCreateUsers")
                .withUri("/v2/{project_id}/users/batch-create")
                .withContentType("application/json");

        // requests
        builder.<BatchCreateUsersReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchCreateUsersReq.class),
            f -> f.withMarshaller(BatchCreateUsersRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteOtpDevicesRequest, BatchDeleteOtpDevicesResponse> batchDeleteOtpDevices =
        genForbatchDeleteOtpDevices();

    private static HttpRequestDef<BatchDeleteOtpDevicesRequest, BatchDeleteOtpDevicesResponse> genForbatchDeleteOtpDevices() {
        // basic
        HttpRequestDef.Builder<BatchDeleteOtpDevicesRequest, BatchDeleteOtpDevicesResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, BatchDeleteOtpDevicesRequest.class, BatchDeleteOtpDevicesResponse.class)
            .withName("BatchDeleteOtpDevices")
            .withUri("/v2/{project_id}/users/{user_id}/otp-devices")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("user_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeleteOtpDevicesRequest::getUserId, (req, v) -> {
                req.setUserId(v);
            }));
        builder.<DelOtpDevicesReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DelOtpDevicesReq.class),
            f -> f.withMarshaller(BatchDeleteOtpDevicesRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ChangeUserStatusRequest, ChangeUserStatusResponse> changeUserStatus =
        genForchangeUserStatus();

    private static HttpRequestDef<ChangeUserStatusRequest, ChangeUserStatusResponse> genForchangeUserStatus() {
        // basic
        HttpRequestDef.Builder<ChangeUserStatusRequest, ChangeUserStatusResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ChangeUserStatusRequest.class, ChangeUserStatusResponse.class)
                .withName("ChangeUserStatus")
                .withUri("/v2/{project_id}/users/{user_id}/actions")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("user_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ChangeUserStatusRequest::getUserId, (req, v) -> {
                req.setUserId(v);
            }));
        builder.<OperateUserReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(OperateUserReq.class),
            f -> f.withMarshaller(ChangeUserStatusRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateDesktopUserRequest, CreateDesktopUserResponse> createDesktopUser =
        genForcreateDesktopUser();

    private static HttpRequestDef<CreateDesktopUserRequest, CreateDesktopUserResponse> genForcreateDesktopUser() {
        // basic
        HttpRequestDef.Builder<CreateDesktopUserRequest, CreateDesktopUserResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateDesktopUserRequest.class, CreateDesktopUserResponse.class)
                .withName("CreateDesktopUser")
                .withUri("/v2/{project_id}/users")
                .withContentType("application/json");

        // requests
        builder.<CreateUserRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateUserRequest.class),
            f -> f.withMarshaller(CreateDesktopUserRequest::getBody, (req, v) -> {
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
                .withUri("/v2/{project_id}/users/{user_id}")
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

    public static final HttpRequestDef<ListOtpDevicesByUserIdRequest, ListOtpDevicesByUserIdResponse> listOtpDevicesByUserId =
        genForlistOtpDevicesByUserId();

    private static HttpRequestDef<ListOtpDevicesByUserIdRequest, ListOtpDevicesByUserIdResponse> genForlistOtpDevicesByUserId() {
        // basic
        HttpRequestDef.Builder<ListOtpDevicesByUserIdRequest, ListOtpDevicesByUserIdResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListOtpDevicesByUserIdRequest.class, ListOtpDevicesByUserIdResponse.class)
            .withName("ListOtpDevicesByUserId")
            .withUri("/v2/{project_id}/users/{user_id}/otp-devices")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("user_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListOtpDevicesByUserIdRequest::getUserId, (req, v) -> {
                req.setUserId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListUserDetailRequest, ListUserDetailResponse> listUserDetail =
        genForlistUserDetail();

    private static HttpRequestDef<ListUserDetailRequest, ListUserDetailResponse> genForlistUserDetail() {
        // basic
        HttpRequestDef.Builder<ListUserDetailRequest, ListUserDetailResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListUserDetailRequest.class, ListUserDetailResponse.class)
                .withName("ListUserDetail")
                .withUri("/v2/{project_id}/users/{user_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("user_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUserDetailRequest::getUserId, (req, v) -> {
                req.setUserId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListUsersRequest, ListUsersResponse> listUsers = genForlistUsers();

    private static HttpRequestDef<ListUsersRequest, ListUsersResponse> genForlistUsers() {
        // basic
        HttpRequestDef.Builder<ListUsersRequest, ListUsersResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListUsersRequest.class, ListUsersResponse.class)
                .withName("ListUsers")
                .withUri("/v2/{project_id}/users")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("user_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUsersRequest::getUserName, (req, v) -> {
                req.setUserName(v);
            }));
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUsersRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUsersRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("description",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUsersRequest::getDescription, (req, v) -> {
                req.setDescription(v);
            }));
        builder.<String>withRequestField("active_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUsersRequest::getActiveType, (req, v) -> {
                req.setActiveType(v);
            }));
        builder.<String>withRequestField("group_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUsersRequest::getGroupName, (req, v) -> {
                req.setGroupName(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ResetRandomPasswordRequest, ResetRandomPasswordResponse> resetRandomPassword =
        genForresetRandomPassword();

    private static HttpRequestDef<ResetRandomPasswordRequest, ResetRandomPasswordResponse> genForresetRandomPassword() {
        // basic
        HttpRequestDef.Builder<ResetRandomPasswordRequest, ResetRandomPasswordResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ResetRandomPasswordRequest.class, ResetRandomPasswordResponse.class)
                .withName("ResetRandomPassword")
                .withUri("/v2/{project_id}/users/{user_id}/random-password")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("user_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ResetRandomPasswordRequest::getUserId, (req, v) -> {
                req.setUserId(v);
            }));
        builder.<String>withRequestField("notification_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ResetRandomPasswordRequest::getNotificationType, (req, v) -> {
                req.setNotificationType(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateUserInfoRequest, UpdateUserInfoResponse> updateUserInfo =
        genForupdateUserInfo();

    private static HttpRequestDef<UpdateUserInfoRequest, UpdateUserInfoResponse> genForupdateUserInfo() {
        // basic
        HttpRequestDef.Builder<UpdateUserInfoRequest, UpdateUserInfoResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateUserInfoRequest.class, UpdateUserInfoResponse.class)
                .withName("UpdateUserInfo")
                .withUri("/v2/{project_id}/users/{user_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("user_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateUserInfoRequest::getUserId, (req, v) -> {
                req.setUserId(v);
            }));
        builder.<EditUserReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(EditUserReq.class),
            f -> f.withMarshaller(UpdateUserInfoRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddVolumesRequest, AddVolumesResponse> addVolumes = genForaddVolumes();

    private static HttpRequestDef<AddVolumesRequest, AddVolumesResponse> genForaddVolumes() {
        // basic
        HttpRequestDef.Builder<AddVolumesRequest, AddVolumesResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AddVolumesRequest.class, AddVolumesResponse.class)
                .withName("AddVolumes")
                .withUri("/v2/{project_id}/volumes")
                .withContentType("application/json");

        // requests
        builder.<AddDesktopsVolumesReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AddDesktopsVolumesReq.class),
            f -> f.withMarshaller(AddVolumesRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteDesktopVolumesRequest, DeleteDesktopVolumesResponse> deleteDesktopVolumes =
        genFordeleteDesktopVolumes();

    private static HttpRequestDef<DeleteDesktopVolumesRequest, DeleteDesktopVolumesResponse> genFordeleteDesktopVolumes() {
        // basic
        HttpRequestDef.Builder<DeleteDesktopVolumesRequest, DeleteDesktopVolumesResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, DeleteDesktopVolumesRequest.class, DeleteDesktopVolumesResponse.class)
            .withName("DeleteDesktopVolumes")
            .withUri("/v2/{project_id}/desktops/{desktop_id}/volumes/batch-delete")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("desktop_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDesktopVolumesRequest::getDesktopId, (req, v) -> {
                req.setDesktopId(v);
            }));
        builder.<DeleteVolumesReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteVolumesReq.class),
            f -> f.withMarshaller(DeleteDesktopVolumesRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExpandVolumesRequest, ExpandVolumesResponse> expandVolumes =
        genForexpandVolumes();

    private static HttpRequestDef<ExpandVolumesRequest, ExpandVolumesResponse> genForexpandVolumes() {
        // basic
        HttpRequestDef.Builder<ExpandVolumesRequest, ExpandVolumesResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ExpandVolumesRequest.class, ExpandVolumesResponse.class)
                .withName("ExpandVolumes")
                .withUri("/v2/{project_id}/volumes/expand")
                .withContentType("application/json");

        // requests
        builder.<ExpandDesktopsVolumesReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ExpandDesktopsVolumesReq.class),
            f -> f.withMarshaller(ExpandVolumesRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ApplyWorkspaceRequest, ApplyWorkspaceResponse> applyWorkspace =
        genForapplyWorkspace();

    private static HttpRequestDef<ApplyWorkspaceRequest, ApplyWorkspaceResponse> genForapplyWorkspace() {
        // basic
        HttpRequestDef.Builder<ApplyWorkspaceRequest, ApplyWorkspaceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ApplyWorkspaceRequest.class, ApplyWorkspaceResponse.class)
                .withName("ApplyWorkspace")
                .withUri("/v2/{project_id}/workspaces")
                .withContentType("application/json");

        // requests
        builder.<ApplyWorkspaceReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ApplyWorkspaceReq.class),
            f -> f.withMarshaller(ApplyWorkspaceRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CancelWorkspaceRequest, CancelWorkspaceResponse> cancelWorkspace =
        genForcancelWorkspace();

    private static HttpRequestDef<CancelWorkspaceRequest, CancelWorkspaceResponse> genForcancelWorkspace() {
        // basic
        HttpRequestDef.Builder<CancelWorkspaceRequest, CancelWorkspaceResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, CancelWorkspaceRequest.class, CancelWorkspaceResponse.class)
                .withName("CancelWorkspace")
                .withUri("/v2/{project_id}/workspaces")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListWorkspacesRequest, ListWorkspacesResponse> listWorkspaces =
        genForlistWorkspaces();

    private static HttpRequestDef<ListWorkspacesRequest, ListWorkspacesResponse> genForlistWorkspaces() {
        // basic
        HttpRequestDef.Builder<ListWorkspacesRequest, ListWorkspacesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListWorkspacesRequest.class, ListWorkspacesResponse.class)
                .withName("ListWorkspaces")
                .withUri("/v2/{project_id}/workspaces")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowWorkspaceLockRequest, ShowWorkspaceLockResponse> showWorkspaceLock =
        genForshowWorkspaceLock();

    private static HttpRequestDef<ShowWorkspaceLockRequest, ShowWorkspaceLockResponse> genForshowWorkspaceLock() {
        // basic
        HttpRequestDef.Builder<ShowWorkspaceLockRequest, ShowWorkspaceLockResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowWorkspaceLockRequest.class, ShowWorkspaceLockResponse.class)
                .withName("ShowWorkspaceLock")
                .withUri("/v2/{project_id}/workspaces/lock-status")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UnlockWorkspaceRequest, UnlockWorkspaceResponse> unlockWorkspace =
        genForunlockWorkspace();

    private static HttpRequestDef<UnlockWorkspaceRequest, UnlockWorkspaceResponse> genForunlockWorkspace() {
        // basic
        HttpRequestDef.Builder<UnlockWorkspaceRequest, UnlockWorkspaceResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UnlockWorkspaceRequest.class, UnlockWorkspaceResponse.class)
                .withName("UnlockWorkspace")
                .withUri("/v2/{project_id}/workspaces/lock-status")
                .withContentType("application/json");

        // requests
        builder.<UnlockWorkspaceRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UnlockWorkspaceRequestBody.class),
            f -> f.withMarshaller(UnlockWorkspaceRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateWorkspaceRequest, UpdateWorkspaceResponse> updateWorkspace =
        genForupdateWorkspace();

    private static HttpRequestDef<UpdateWorkspaceRequest, UpdateWorkspaceResponse> genForupdateWorkspace() {
        // basic
        HttpRequestDef.Builder<UpdateWorkspaceRequest, UpdateWorkspaceResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateWorkspaceRequest.class, UpdateWorkspaceResponse.class)
                .withName("UpdateWorkspace")
                .withUri("/v2/{project_id}/workspaces")
                .withContentType("application/json");

        // requests
        builder.<ModifyWorkspaceAttributesReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ModifyWorkspaceAttributesReq.class),
            f -> f.withMarshaller(UpdateWorkspaceRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

}
