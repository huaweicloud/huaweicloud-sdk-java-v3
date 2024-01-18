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
import com.huaweicloud.sdk.workspace.v2.model.BatchDeleteDesktopNamePolicyReq;
import com.huaweicloud.sdk.workspace.v2.model.BatchDeleteDesktopNamePolicyRequest;
import com.huaweicloud.sdk.workspace.v2.model.BatchDeleteDesktopNamePolicyResponse;
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
import com.huaweicloud.sdk.workspace.v2.model.CreateDesktopNamePolicyReq;
import com.huaweicloud.sdk.workspace.v2.model.CreateDesktopNamePolicyRequest;
import com.huaweicloud.sdk.workspace.v2.model.CreateDesktopNamePolicyResponse;
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
import com.huaweicloud.sdk.workspace.v2.model.ListDesktopNamePolicyRequest;
import com.huaweicloud.sdk.workspace.v2.model.ListDesktopNamePolicyResponse;
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
import com.huaweicloud.sdk.workspace.v2.model.UpdateDesktopNamePolicyReq;
import com.huaweicloud.sdk.workspace.v2.model.UpdateDesktopNamePolicyRequest;
import com.huaweicloud.sdk.workspace.v2.model.UpdateDesktopNamePolicyResponse;
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
        genForBatchDeleteAccessPolicies();

    private static HttpRequestDef<BatchDeleteAccessPoliciesRequest, BatchDeleteAccessPoliciesResponse> genForBatchDeleteAccessPolicies() {
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
            f -> f.withMarshaller(BatchDeleteAccessPoliciesRequest::getBody,
                BatchDeleteAccessPoliciesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateAccessPolicyRequest, CreateAccessPolicyResponse> createAccessPolicy =
        genForCreateAccessPolicy();

    private static HttpRequestDef<CreateAccessPolicyRequest, CreateAccessPolicyResponse> genForCreateAccessPolicy() {
        // basic
        HttpRequestDef.Builder<CreateAccessPolicyRequest, CreateAccessPolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateAccessPolicyRequest.class, CreateAccessPolicyResponse.class)
                .withName("CreateAccessPolicy")
                .withUri("/v2/{project_id}/access-policy")
                .withContentType("application/json");

        // requests
        builder.<CreateAccessPolicyReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateAccessPolicyReq.class),
            f -> f.withMarshaller(CreateAccessPolicyRequest::getBody, CreateAccessPolicyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAccessPoliciesRequest, ListAccessPoliciesResponse> listAccessPolicies =
        genForListAccessPolicies();

    private static HttpRequestDef<ListAccessPoliciesRequest, ListAccessPoliciesResponse> genForListAccessPolicies() {
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
            f -> f.withMarshaller(ListAccessPoliciesRequest::getLimit, ListAccessPoliciesRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAccessPoliciesRequest::getOffset, ListAccessPoliciesRequest::setOffset));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAccessPolicyObjectsRequest, ListAccessPolicyObjectsResponse> listAccessPolicyObjects =
        genForListAccessPolicyObjects();

    private static HttpRequestDef<ListAccessPolicyObjectsRequest, ListAccessPolicyObjectsResponse> genForListAccessPolicyObjects() {
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
            f -> f.withMarshaller(ListAccessPolicyObjectsRequest::getAccessPolicyId,
                ListAccessPolicyObjectsRequest::setAccessPolicyId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAccessPolicyObjectsRequest::getLimit, ListAccessPolicyObjectsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAccessPolicyObjectsRequest::getOffset,
                ListAccessPolicyObjectsRequest::setOffset));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateAccessPolicyObjectsRequest, UpdateAccessPolicyObjectsResponse> updateAccessPolicyObjects =
        genForUpdateAccessPolicyObjects();

    private static HttpRequestDef<UpdateAccessPolicyObjectsRequest, UpdateAccessPolicyObjectsResponse> genForUpdateAccessPolicyObjects() {
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
            f -> f.withMarshaller(UpdateAccessPolicyObjectsRequest::getAccessPolicyId,
                UpdateAccessPolicyObjectsRequest::setAccessPolicyId));
        builder.<UpdateAccessPolicyObjectsReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdateAccessPolicyObjectsReq.class),
            f -> f.withMarshaller(UpdateAccessPolicyObjectsRequest::getBody,
                UpdateAccessPolicyObjectsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAssistAuthConfigRequest, ShowAssistAuthConfigResponse> showAssistAuthConfig =
        genForShowAssistAuthConfig();

    private static HttpRequestDef<ShowAssistAuthConfigRequest, ShowAssistAuthConfigResponse> genForShowAssistAuthConfig() {
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
        genForUpdateAssistAuthMethodConfig();

    private static HttpRequestDef<UpdateAssistAuthMethodConfigRequest, UpdateAssistAuthMethodConfigResponse> genForUpdateAssistAuthMethodConfig() {
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
            f -> f.withMarshaller(UpdateAssistAuthMethodConfigRequest::getBody,
                UpdateAssistAuthMethodConfigRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAvailabilityZonesRequest, ListAvailabilityZonesResponse> listAvailabilityZones =
        genForListAvailabilityZones();

    private static HttpRequestDef<ListAvailabilityZonesRequest, ListAvailabilityZonesResponse> genForListAvailabilityZones() {
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
        genForExportUserLoginInfoNew();

    private static HttpRequestDef<ExportUserLoginInfoNewRequest, ExportUserLoginInfoNewResponse> genForExportUserLoginInfoNew() {
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
            f -> f.withMarshaller(ExportUserLoginInfoNewRequest::getStartTime,
                ExportUserLoginInfoNewRequest::setStartTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportUserLoginInfoNewRequest::getEndTime,
                ExportUserLoginInfoNewRequest::setEndTime));
        builder.<String>withRequestField("user_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportUserLoginInfoNewRequest::getUserName,
                ExportUserLoginInfoNewRequest::setUserName));
        builder.<String>withRequestField("computer_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportUserLoginInfoNewRequest::getComputerName,
                ExportUserLoginInfoNewRequest::setComputerName));
        builder.<String>withRequestField("terminal_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportUserLoginInfoNewRequest::getTerminalType,
                ExportUserLoginInfoNewRequest::setTerminalType));
        builder.<String>withRequestField("language",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportUserLoginInfoNewRequest::getLanguage,
                ExportUserLoginInfoNewRequest::setLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListHistoryOnlineInfoNewRequest, ListHistoryOnlineInfoNewResponse> listHistoryOnlineInfoNew =
        genForListHistoryOnlineInfoNew();

    private static HttpRequestDef<ListHistoryOnlineInfoNewRequest, ListHistoryOnlineInfoNewResponse> genForListHistoryOnlineInfoNew() {
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
            f -> f.withMarshaller(ListHistoryOnlineInfoNewRequest::getStartTime,
                ListHistoryOnlineInfoNewRequest::setStartTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHistoryOnlineInfoNewRequest::getEndTime,
                ListHistoryOnlineInfoNewRequest::setEndTime));
        builder.<String>withRequestField("query_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHistoryOnlineInfoNewRequest::getQueryType,
                ListHistoryOnlineInfoNewRequest::setQueryType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListLoginRecordsNewRequest, ListLoginRecordsNewResponse> listLoginRecordsNew =
        genForListLoginRecordsNew();

    private static HttpRequestDef<ListLoginRecordsNewRequest, ListLoginRecordsNewResponse> genForListLoginRecordsNew() {
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
            f -> f.withMarshaller(ListLoginRecordsNewRequest::getStartTime, ListLoginRecordsNewRequest::setStartTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLoginRecordsNewRequest::getEndTime, ListLoginRecordsNewRequest::setEndTime));
        builder.<String>withRequestField("user_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLoginRecordsNewRequest::getUserName, ListLoginRecordsNewRequest::setUserName));
        builder.<String>withRequestField("computer_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLoginRecordsNewRequest::getComputerName,
                ListLoginRecordsNewRequest::setComputerName));
        builder.<String>withRequestField("terminal_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLoginRecordsNewRequest::getTerminalType,
                ListLoginRecordsNewRequest::setTerminalType));
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLoginRecordsNewRequest::getLimit, ListLoginRecordsNewRequest::setLimit));
        builder.<String>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLoginRecordsNewRequest::getOffset, ListLoginRecordsNewRequest::setOffset));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteDesktopsRequest, BatchDeleteDesktopsResponse> batchDeleteDesktops =
        genForBatchDeleteDesktops();

    private static HttpRequestDef<BatchDeleteDesktopsRequest, BatchDeleteDesktopsResponse> genForBatchDeleteDesktops() {
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
            f -> f.withMarshaller(BatchDeleteDesktopsRequest::getBody, BatchDeleteDesktopsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchLogoffDesktopsRequest, BatchLogoffDesktopsResponse> batchLogoffDesktops =
        genForBatchLogoffDesktops();

    private static HttpRequestDef<BatchLogoffDesktopsRequest, BatchLogoffDesktopsResponse> genForBatchLogoffDesktops() {
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
            f -> f.withMarshaller(BatchLogoffDesktopsRequest::getBody, BatchLogoffDesktopsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchRebuildDesktopsSystemDiskRequest, BatchRebuildDesktopsSystemDiskResponse> batchRebuildDesktopsSystemDisk =
        genForBatchRebuildDesktopsSystemDisk();

    private static HttpRequestDef<BatchRebuildDesktopsSystemDiskRequest, BatchRebuildDesktopsSystemDiskResponse> genForBatchRebuildDesktopsSystemDisk() {
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
            f -> f.withMarshaller(BatchRebuildDesktopsSystemDiskRequest::getBody,
                BatchRebuildDesktopsSystemDiskRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchRunDesktopsRequest, BatchRunDesktopsResponse> batchRunDesktops =
        genForBatchRunDesktops();

    private static HttpRequestDef<BatchRunDesktopsRequest, BatchRunDesktopsResponse> genForBatchRunDesktops() {
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
            f -> f.withMarshaller(BatchRunDesktopsRequest::getBody, BatchRunDesktopsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ChangeDesktopNetworkRequest, ChangeDesktopNetworkResponse> changeDesktopNetwork =
        genForChangeDesktopNetwork();

    private static HttpRequestDef<ChangeDesktopNetworkRequest, ChangeDesktopNetworkResponse> genForChangeDesktopNetwork() {
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
            f -> f.withMarshaller(ChangeDesktopNetworkRequest::getDesktopId,
                ChangeDesktopNetworkRequest::setDesktopId));
        builder.<ChangeDesktopNetworkReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ChangeDesktopNetworkReq.class),
            f -> f.withMarshaller(ChangeDesktopNetworkRequest::getBody, ChangeDesktopNetworkRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateDesktopRequest, CreateDesktopResponse> createDesktop =
        genForCreateDesktop();

    private static HttpRequestDef<CreateDesktopRequest, CreateDesktopResponse> genForCreateDesktop() {
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
            f -> f.withMarshaller(CreateDesktopRequest::getBody, CreateDesktopRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteDesktopRequest, DeleteDesktopResponse> deleteDesktop =
        genForDeleteDesktop();

    private static HttpRequestDef<DeleteDesktopRequest, DeleteDesktopResponse> genForDeleteDesktop() {
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
            f -> f.withMarshaller(DeleteDesktopRequest::getDesktopId, DeleteDesktopRequest::setDesktopId));
        builder.<Boolean>withRequestField("delete_users",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(DeleteDesktopRequest::getDeleteUsers, DeleteDesktopRequest::setDeleteUsers));
        builder.<Boolean>withRequestField("email_notification",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(DeleteDesktopRequest::getEmailNotification,
                DeleteDesktopRequest::setEmailNotification));
        builder.<Boolean>withRequestField("is_force_delete",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(DeleteDesktopRequest::getIsForceDelete, DeleteDesktopRequest::setIsForceDelete));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDesktopsRequest, ListDesktopsResponse> listDesktops = genForListDesktops();

    private static HttpRequestDef<ListDesktopsRequest, ListDesktopsResponse> genForListDesktops() {
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
            f -> f.withMarshaller(ListDesktopsRequest::getUserName, ListDesktopsRequest::setUserName));
        builder.<String>withRequestField("computer_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDesktopsRequest::getComputerName, ListDesktopsRequest::setComputerName));
        builder.<String>withRequestField("desktop_ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDesktopsRequest::getDesktopIp, ListDesktopsRequest::setDesktopIp));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDesktopsRequest::getOffset, ListDesktopsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDesktopsRequest::getLimit, ListDesktopsRequest::setLimit));
        builder.<String>withRequestField("pool_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDesktopsRequest::getPoolId, ListDesktopsRequest::setPoolId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDesktopsRequest::getEnterpriseProjectId,
                ListDesktopsRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("desktop_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDesktopsRequest::getDesktopType, ListDesktopsRequest::setDesktopType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDesktopsDetailRequest, ListDesktopsDetailResponse> listDesktopsDetail =
        genForListDesktopsDetail();

    private static HttpRequestDef<ListDesktopsDetailRequest, ListDesktopsDetailResponse> genForListDesktopsDetail() {
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
            f -> f.withMarshaller(ListDesktopsDetailRequest::getStatus, ListDesktopsDetailRequest::setStatus));
        builder.<String>withRequestField("user_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDesktopsDetailRequest::getUserName, ListDesktopsDetailRequest::setUserName));
        builder.<List<String>>withRequestField("user_names",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListDesktopsDetailRequest::getUserNames, ListDesktopsDetailRequest::setUserNames));
        builder.<ListDesktopsDetailRequest.SortFieldEnum>withRequestField("sort_field",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListDesktopsDetailRequest.SortFieldEnum.class),
            f -> f.withMarshaller(ListDesktopsDetailRequest::getSortField, ListDesktopsDetailRequest::setSortField));
        builder.<ListDesktopsDetailRequest.SortTypeEnum>withRequestField("sort_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListDesktopsDetailRequest.SortTypeEnum.class),
            f -> f.withMarshaller(ListDesktopsDetailRequest::getSortType, ListDesktopsDetailRequest::setSortType));
        builder.<String>withRequestField("computer_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDesktopsDetailRequest::getComputerName,
                ListDesktopsDetailRequest::setComputerName));
        builder.<String>withRequestField("desktop_ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDesktopsDetailRequest::getDesktopIp, ListDesktopsDetailRequest::setDesktopIp));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDesktopsDetailRequest::getOffset, ListDesktopsDetailRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDesktopsDetailRequest::getLimit, ListDesktopsDetailRequest::setLimit));
        builder.<List<String>>withRequestField("desktop_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListDesktopsDetailRequest::getDesktopId, ListDesktopsDetailRequest::setDesktopId));
        builder.<String>withRequestField("desktop_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDesktopsDetailRequest::getDesktopType,
                ListDesktopsDetailRequest::setDesktopType));
        builder.<String>withRequestField("tag",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDesktopsDetailRequest::getTag, ListDesktopsDetailRequest::setTag));
        builder.<String>withRequestField("pool_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDesktopsDetailRequest::getPoolId, ListDesktopsDetailRequest::setPoolId));
        builder.<Boolean>withRequestField("user_attached",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListDesktopsDetailRequest::getUserAttached,
                ListDesktopsDetailRequest::setUserAttached));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDesktopsDetailRequest::getEnterpriseProjectId,
                ListDesktopsDetailRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("image_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDesktopsDetailRequest::getImageId, ListDesktopsDetailRequest::setImageId));
        builder.<String>withRequestField("charge_mode",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDesktopsDetailRequest::getChargeMode, ListDesktopsDetailRequest::setChargeMode));
        builder.<Boolean>withRequestField("in_maintenance_mode",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListDesktopsDetailRequest::getInMaintenanceMode,
                ListDesktopsDetailRequest::setInMaintenanceMode));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ResizeDesktopRequest, ResizeDesktopResponse> resizeDesktop =
        genForResizeDesktop();

    private static HttpRequestDef<ResizeDesktopRequest, ResizeDesktopResponse> genForResizeDesktop() {
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
            f -> f.withMarshaller(ResizeDesktopRequest::getBody, ResizeDesktopRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDesktopDetailRequest, ShowDesktopDetailResponse> showDesktopDetail =
        genForShowDesktopDetail();

    private static HttpRequestDef<ShowDesktopDetailRequest, ShowDesktopDetailResponse> genForShowDesktopDetail() {
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
            f -> f.withMarshaller(ShowDesktopDetailRequest::getDesktopId, ShowDesktopDetailRequest::setDesktopId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDesktopNetworkRequest, ShowDesktopNetworkResponse> showDesktopNetwork =
        genForShowDesktopNetwork();

    private static HttpRequestDef<ShowDesktopNetworkRequest, ShowDesktopNetworkResponse> genForShowDesktopNetwork() {
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
            f -> f.withMarshaller(ShowDesktopNetworkRequest::getDesktopId, ShowDesktopNetworkRequest::setDesktopId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteDesktopNamePolicyRequest, BatchDeleteDesktopNamePolicyResponse> batchDeleteDesktopNamePolicy =
        genForBatchDeleteDesktopNamePolicy();

    private static HttpRequestDef<BatchDeleteDesktopNamePolicyRequest, BatchDeleteDesktopNamePolicyResponse> genForBatchDeleteDesktopNamePolicy() {
        // basic
        HttpRequestDef.Builder<BatchDeleteDesktopNamePolicyRequest, BatchDeleteDesktopNamePolicyResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    BatchDeleteDesktopNamePolicyRequest.class,
                    BatchDeleteDesktopNamePolicyResponse.class)
                .withName("BatchDeleteDesktopNamePolicy")
                .withUri("/v2/{project_id}/desktop-name-policies/batch-delete")
                .withContentType("application/json");

        // requests
        builder.<BatchDeleteDesktopNamePolicyReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchDeleteDesktopNamePolicyReq.class),
            f -> f.withMarshaller(BatchDeleteDesktopNamePolicyRequest::getBody,
                BatchDeleteDesktopNamePolicyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateDesktopNamePolicyRequest, CreateDesktopNamePolicyResponse> createDesktopNamePolicy =
        genForCreateDesktopNamePolicy();

    private static HttpRequestDef<CreateDesktopNamePolicyRequest, CreateDesktopNamePolicyResponse> genForCreateDesktopNamePolicy() {
        // basic
        HttpRequestDef.Builder<CreateDesktopNamePolicyRequest, CreateDesktopNamePolicyResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateDesktopNamePolicyRequest.class, CreateDesktopNamePolicyResponse.class)
            .withName("CreateDesktopNamePolicy")
            .withUri("/v2/{project_id}/desktop-name-policies")
            .withContentType("application/json");

        // requests
        builder.<CreateDesktopNamePolicyReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateDesktopNamePolicyReq.class),
            f -> f.withMarshaller(CreateDesktopNamePolicyRequest::getBody, CreateDesktopNamePolicyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDesktopNamePolicyRequest, ListDesktopNamePolicyResponse> listDesktopNamePolicy =
        genForListDesktopNamePolicy();

    private static HttpRequestDef<ListDesktopNamePolicyRequest, ListDesktopNamePolicyResponse> genForListDesktopNamePolicy() {
        // basic
        HttpRequestDef.Builder<ListDesktopNamePolicyRequest, ListDesktopNamePolicyResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListDesktopNamePolicyRequest.class, ListDesktopNamePolicyResponse.class)
            .withName("ListDesktopNamePolicy")
            .withUri("/v2/{project_id}/desktop-name-policies")
            .withContentType("application/json");

        // requests
        builder.<Boolean>withRequestField("is_contain_user",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListDesktopNamePolicyRequest::getIsContainUser,
                ListDesktopNamePolicyRequest::setIsContainUser));
        builder.<String>withRequestField("policy_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDesktopNamePolicyRequest::getPolicyName,
                ListDesktopNamePolicyRequest::setPolicyName));
        builder.<String>withRequestField("policy_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDesktopNamePolicyRequest::getPolicyId,
                ListDesktopNamePolicyRequest::setPolicyId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDesktopNamePolicyRequest::getOffset, ListDesktopNamePolicyRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDesktopNamePolicyRequest::getLimit, ListDesktopNamePolicyRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateDesktopNamePolicyRequest, UpdateDesktopNamePolicyResponse> updateDesktopNamePolicy =
        genForUpdateDesktopNamePolicy();

    private static HttpRequestDef<UpdateDesktopNamePolicyRequest, UpdateDesktopNamePolicyResponse> genForUpdateDesktopNamePolicy() {
        // basic
        HttpRequestDef.Builder<UpdateDesktopNamePolicyRequest, UpdateDesktopNamePolicyResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateDesktopNamePolicyRequest.class, UpdateDesktopNamePolicyResponse.class)
            .withName("UpdateDesktopNamePolicy")
            .withUri("/v2/{project_id}/desktop-name-policies/{policy_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDesktopNamePolicyRequest::getPolicyId,
                UpdateDesktopNamePolicyRequest::setPolicyId));
        builder.<UpdateDesktopNamePolicyReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateDesktopNamePolicyReq.class),
            f -> f.withMarshaller(UpdateDesktopNamePolicyRequest::getBody, UpdateDesktopNamePolicyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListUnusedDesktopsRequest, ListUnusedDesktopsResponse> listUnusedDesktops =
        genForListUnusedDesktops();

    private static HttpRequestDef<ListUnusedDesktopsRequest, ListUnusedDesktopsResponse> genForListUnusedDesktops() {
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
            f -> f.withMarshaller(ListUnusedDesktopsRequest::getOffset, ListUnusedDesktopsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListUnusedDesktopsRequest::getLimit, ListUnusedDesktopsRequest::setLimit));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUnusedDesktopsRequest::getStartTime, ListUnusedDesktopsRequest::setStartTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUnusedDesktopsRequest::getEndTime, ListUnusedDesktopsRequest::setEndTime));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListUsedDesktopInfoRequest, ListUsedDesktopInfoResponse> listUsedDesktopInfo =
        genForListUsedDesktopInfo();

    private static HttpRequestDef<ListUsedDesktopInfoRequest, ListUsedDesktopInfoResponse> genForListUsedDesktopInfo() {
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
            f -> f.withMarshaller(ListUsedDesktopInfoRequest::getBody, ListUsedDesktopInfoRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchAddDesktopsTagsRequest, BatchAddDesktopsTagsResponse> batchAddDesktopsTags =
        genForBatchAddDesktopsTags();

    private static HttpRequestDef<BatchAddDesktopsTagsRequest, BatchAddDesktopsTagsResponse> genForBatchAddDesktopsTags() {
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
            f -> f.withMarshaller(BatchAddDesktopsTagsRequest::getBody, BatchAddDesktopsTagsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchChangeTagsRequest, BatchChangeTagsResponse> batchChangeTags =
        genForBatchChangeTags();

    private static HttpRequestDef<BatchChangeTagsRequest, BatchChangeTagsResponse> genForBatchChangeTags() {
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
            f -> f.withMarshaller(BatchChangeTagsRequest::getDesktopId, BatchChangeTagsRequest::setDesktopId));
        builder.<TagsReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(TagsReq.class),
            f -> f.withMarshaller(BatchChangeTagsRequest::getBody, BatchChangeTagsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteDesktopsTagsRequest, BatchDeleteDesktopsTagsResponse> batchDeleteDesktopsTags =
        genForBatchDeleteDesktopsTags();

    private static HttpRequestDef<BatchDeleteDesktopsTagsRequest, BatchDeleteDesktopsTagsResponse> genForBatchDeleteDesktopsTags() {
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
            f -> f.withMarshaller(BatchDeleteDesktopsTagsRequest::getBody, BatchDeleteDesktopsTagsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateTagRequest, CreateTagResponse> createTag = genForCreateTag();

    private static HttpRequestDef<CreateTagRequest, CreateTagResponse> genForCreateTag() {
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
            f -> f.withMarshaller(CreateTagRequest::getDesktopId, CreateTagRequest::setDesktopId));
        builder.<CreateTagReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateTagReq.class),
            f -> f.withMarshaller(CreateTagRequest::getBody, CreateTagRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteTagRequest, DeleteTagResponse> deleteTag = genForDeleteTag();

    private static HttpRequestDef<DeleteTagRequest, DeleteTagResponse> genForDeleteTag() {
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
            f -> f.withMarshaller(DeleteTagRequest::getDesktopId, DeleteTagRequest::setDesktopId));
        builder.<String>withRequestField("key",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTagRequest::getKey, DeleteTagRequest::setKey));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDesktopByTagsRequest, ListDesktopByTagsResponse> listDesktopByTags =
        genForListDesktopByTags();

    private static HttpRequestDef<ListDesktopByTagsRequest, ListDesktopByTagsResponse> genForListDesktopByTags() {
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
            f -> f.withMarshaller(ListDesktopByTagsRequest::getBody, ListDesktopByTagsRequest::setBody));

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
                .withUri("/v2/{project_id}/desktops/tags")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTagByDesktopIdRequest, ShowTagByDesktopIdResponse> showTagByDesktopId =
        genForShowTagByDesktopId();

    private static HttpRequestDef<ShowTagByDesktopIdRequest, ShowTagByDesktopIdResponse> genForShowTagByDesktopId() {
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
            f -> f.withMarshaller(ShowTagByDesktopIdRequest::getDesktopId, ShowTagByDesktopIdRequest::setDesktopId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteUserGroupsRequest, BatchDeleteUserGroupsResponse> batchDeleteUserGroups =
        genForBatchDeleteUserGroups();

    private static HttpRequestDef<BatchDeleteUserGroupsRequest, BatchDeleteUserGroupsResponse> genForBatchDeleteUserGroups() {
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
            f -> f.withMarshaller(BatchDeleteUserGroupsRequest::getBody, BatchDeleteUserGroupsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateUserGroupRequest, CreateUserGroupResponse> createUserGroup =
        genForCreateUserGroup();

    private static HttpRequestDef<CreateUserGroupRequest, CreateUserGroupResponse> genForCreateUserGroup() {
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
            f -> f.withMarshaller(CreateUserGroupRequest::getBody, CreateUserGroupRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteUserGroupRequest, DeleteUserGroupResponse> deleteUserGroup =
        genForDeleteUserGroup();

    private static HttpRequestDef<DeleteUserGroupRequest, DeleteUserGroupResponse> genForDeleteUserGroup() {
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
            f -> f.withMarshaller(DeleteUserGroupRequest::getGroupId, DeleteUserGroupRequest::setGroupId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListUserGroupsRequest, ListUserGroupsResponse> listUserGroups =
        genForListUserGroups();

    private static HttpRequestDef<ListUserGroupsRequest, ListUserGroupsResponse> genForListUserGroups() {
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
            f -> f.withMarshaller(ListUserGroupsRequest::getLimit, ListUserGroupsRequest::setLimit));
        builder.<String>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUserGroupsRequest::getOffset, ListUserGroupsRequest::setOffset));
        builder.<String>withRequestField("keyword",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUserGroupsRequest::getKeyword, ListUserGroupsRequest::setKeyword));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListUsersOfGroupRequest, ListUsersOfGroupResponse> listUsersOfGroup =
        genForListUsersOfGroup();

    private static HttpRequestDef<ListUsersOfGroupRequest, ListUsersOfGroupResponse> genForListUsersOfGroup() {
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
            f -> f.withMarshaller(ListUsersOfGroupRequest::getGroupId, ListUsersOfGroupRequest::setGroupId));
        builder.<String>withRequestField("user_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUsersOfGroupRequest::getUserName, ListUsersOfGroupRequest::setUserName));
        builder.<String>withRequestField("description",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUsersOfGroupRequest::getDescription, ListUsersOfGroupRequest::setDescription));
        builder.<ListUsersOfGroupRequest.ActiveTypeEnum>withRequestField("active_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListUsersOfGroupRequest.ActiveTypeEnum.class),
            f -> f.withMarshaller(ListUsersOfGroupRequest::getActiveType, ListUsersOfGroupRequest::setActiveType));
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUsersOfGroupRequest::getLimit, ListUsersOfGroupRequest::setLimit));
        builder.<String>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUsersOfGroupRequest::getOffset, ListUsersOfGroupRequest::setOffset));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RunActionsOnGroupRequest, RunActionsOnGroupResponse> runActionsOnGroup =
        genForRunActionsOnGroup();

    private static HttpRequestDef<RunActionsOnGroupRequest, RunActionsOnGroupResponse> genForRunActionsOnGroup() {
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
            f -> f.withMarshaller(RunActionsOnGroupRequest::getGroupId, RunActionsOnGroupRequest::setGroupId));
        builder.<ActionsOfUsersInGroupRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ActionsOfUsersInGroupRequest.class),
            f -> f.withMarshaller(RunActionsOnGroupRequest::getBody, RunActionsOnGroupRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateUserGroupRequest, UpdateUserGroupResponse> updateUserGroup =
        genForUpdateUserGroup();

    private static HttpRequestDef<UpdateUserGroupRequest, UpdateUserGroupResponse> genForUpdateUserGroup() {
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
            f -> f.withMarshaller(UpdateUserGroupRequest::getGroupId, UpdateUserGroupRequest::setGroupId));
        builder.<EditUserGroupRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(EditUserGroupRequest.class),
            f -> f.withMarshaller(UpdateUserGroupRequest::getBody, UpdateUserGroupRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListImagesRequest, ListImagesResponse> listImages = genForListImages();

    private static HttpRequestDef<ListImagesRequest, ListImagesResponse> genForListImages() {
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
            f -> f.withMarshaller(ListImagesRequest::getOsType, ListImagesRequest::setOsType));
        builder.<String>withRequestField("image_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImagesRequest::getImageType, ListImagesRequest::setImageType));
        builder.<String>withRequestField("platform",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImagesRequest::getPlatform, ListImagesRequest::setPlatform));
        builder.<String>withRequestField("architecture",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImagesRequest::getArchitecture, ListImagesRequest::setArchitecture));
        builder.<String>withRequestField("package_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImagesRequest::getPackageType, ListImagesRequest::setPackageType));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListImagesRequest::getLimit, ListImagesRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListImagesRequest::getOffset, ListImagesRequest::setOffset));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListItaSubJobsRequest, ListItaSubJobsResponse> listItaSubJobs =
        genForListItaSubJobs();

    private static HttpRequestDef<ListItaSubJobsRequest, ListItaSubJobsResponse> genForListItaSubJobs() {
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
            f -> f.withMarshaller(ListItaSubJobsRequest::getStatus, ListItaSubJobsRequest::setStatus));
        builder.<String>withRequestField("job_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListItaSubJobsRequest::getJobId, ListItaSubJobsRequest::setJobId));
        builder.<String>withRequestField("job_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListItaSubJobsRequest::getJobType, ListItaSubJobsRequest::setJobType));
        builder.<String>withRequestField("desktop_pool_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListItaSubJobsRequest::getDesktopPoolId, ListItaSubJobsRequest::setDesktopPoolId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListItaSubJobsRequest::getLimit, ListItaSubJobsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListItaSubJobsRequest::getOffset, ListItaSubJobsRequest::setOffset));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ApplyDesktopsInternetRequest, ApplyDesktopsInternetResponse> applyDesktopsInternet =
        genForApplyDesktopsInternet();

    private static HttpRequestDef<ApplyDesktopsInternetRequest, ApplyDesktopsInternetResponse> genForApplyDesktopsInternet() {
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
            f -> f.withMarshaller(ApplyDesktopsInternetRequest::getBody, ApplyDesktopsInternetRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AssociateDesktopsEipRequest, AssociateDesktopsEipResponse> associateDesktopsEip =
        genForAssociateDesktopsEip();

    private static HttpRequestDef<AssociateDesktopsEipRequest, AssociateDesktopsEipResponse> genForAssociateDesktopsEip() {
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
            f -> f.withMarshaller(AssociateDesktopsEipRequest::getBody, AssociateDesktopsEipRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDisassociateDesktopsEipRequest, BatchDisassociateDesktopsEipResponse> batchDisassociateDesktopsEip =
        genForBatchDisassociateDesktopsEip();

    private static HttpRequestDef<BatchDisassociateDesktopsEipRequest, BatchDisassociateDesktopsEipResponse> genForBatchDisassociateDesktopsEip() {
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
            f -> f.withMarshaller(BatchDisassociateDesktopsEipRequest::getBody,
                BatchDisassociateDesktopsEipRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDesktopsEipsRequest, ListDesktopsEipsResponse> listDesktopsEips =
        genForListDesktopsEips();

    private static HttpRequestDef<ListDesktopsEipsRequest, ListDesktopsEipsResponse> genForListDesktopsEips() {
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
            f -> f.withMarshaller(ListDesktopsEipsRequest::getEnterpriseProjectId,
                ListDesktopsEipsRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("desktop_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDesktopsEipsRequest::getDesktopId, ListDesktopsEipsRequest::setDesktopId));
        builder.<String>withRequestField("desktop_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDesktopsEipsRequest::getDesktopName, ListDesktopsEipsRequest::setDesktopName));
        builder.<String>withRequestField("user_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDesktopsEipsRequest::getUserName, ListDesktopsEipsRequest::setUserName));
        builder.<String>withRequestField("address",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDesktopsEipsRequest::getAddress, ListDesktopsEipsRequest::setAddress));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDesktopsEipsRequest::getOffset, ListDesktopsEipsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDesktopsEipsRequest::getLimit, ListDesktopsEipsRequest::setLimit));
        builder.<String>withRequestField("state",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDesktopsEipsRequest::getState, ListDesktopsEipsRequest::setState));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListProductsRequest, ListProductsResponse> listProducts = genForListProducts();

    private static HttpRequestDef<ListProductsRequest, ListProductsResponse> genForListProducts() {
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
            f -> f.withMarshaller(ListProductsRequest::getProductId, ListProductsRequest::setProductId));
        builder.<String>withRequestField("availability_zone",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProductsRequest::getAvailabilityZone, ListProductsRequest::setAvailabilityZone));
        builder.<String>withRequestField("os_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProductsRequest::getOsType, ListProductsRequest::setOsType));
        builder.<String>withRequestField("charge_mode",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProductsRequest::getChargeMode, ListProductsRequest::setChargeMode));
        builder.<String>withRequestField("architecture",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProductsRequest::getArchitecture, ListProductsRequest::setArchitecture));
        builder.<String>withRequestField("package_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProductsRequest::getPackageType, ListProductsRequest::setPackageType));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListProductsRequest::getLimit, ListProductsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListProductsRequest::getOffset, ListProductsRequest::setOffset));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowQuotasRequest, ShowQuotasResponse> showQuotas = genForShowQuotas();

    private static HttpRequestDef<ShowQuotasRequest, ShowQuotasResponse> genForShowQuotas() {
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
        genForCreateTerminalsBindingDesktops();

    private static HttpRequestDef<CreateTerminalsBindingDesktopsRequest, CreateTerminalsBindingDesktopsResponse> genForCreateTerminalsBindingDesktops() {
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
            f -> f.withMarshaller(CreateTerminalsBindingDesktopsRequest::getBody,
                CreateTerminalsBindingDesktopsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteTerminalsBindingDesktopsRequest, DeleteTerminalsBindingDesktopsResponse> deleteTerminalsBindingDesktops =
        genForDeleteTerminalsBindingDesktops();

    private static HttpRequestDef<DeleteTerminalsBindingDesktopsRequest, DeleteTerminalsBindingDesktopsResponse> genForDeleteTerminalsBindingDesktops() {
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
            f -> f.withMarshaller(DeleteTerminalsBindingDesktopsRequest::getBody,
                DeleteTerminalsBindingDesktopsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTerminalsBindingDesktopsRequest, ListTerminalsBindingDesktopsResponse> listTerminalsBindingDesktops =
        genForListTerminalsBindingDesktops();

    private static HttpRequestDef<ListTerminalsBindingDesktopsRequest, ListTerminalsBindingDesktopsResponse> genForListTerminalsBindingDesktops() {
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
            f -> f.withMarshaller(ListTerminalsBindingDesktopsRequest::getComputerName,
                ListTerminalsBindingDesktopsRequest::setComputerName));
        builder.<String>withRequestField("mac",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTerminalsBindingDesktopsRequest::getMac,
                ListTerminalsBindingDesktopsRequest::setMac));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTerminalsBindingDesktopsRequest::getOffset,
                ListTerminalsBindingDesktopsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTerminalsBindingDesktopsRequest::getLimit,
                ListTerminalsBindingDesktopsRequest::setLimit));
        builder.<Boolean>withRequestField("count_only",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListTerminalsBindingDesktopsRequest::getCountOnly,
                ListTerminalsBindingDesktopsRequest::setCountOnly));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTerminalsBindingDesktopsConfigRequest, ListTerminalsBindingDesktopsConfigResponse> listTerminalsBindingDesktopsConfig =
        genForListTerminalsBindingDesktopsConfig();

    private static HttpRequestDef<ListTerminalsBindingDesktopsConfigRequest, ListTerminalsBindingDesktopsConfigResponse> genForListTerminalsBindingDesktopsConfig() {
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
        genForUpdateTerminalsBindingDesktops();

    private static HttpRequestDef<UpdateTerminalsBindingDesktopsRequest, UpdateTerminalsBindingDesktopsResponse> genForUpdateTerminalsBindingDesktops() {
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
            f -> f.withMarshaller(UpdateTerminalsBindingDesktopsRequest::getBody,
                UpdateTerminalsBindingDesktopsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateTerminalsBindingDesktopsConfigRequest, UpdateTerminalsBindingDesktopsConfigResponse> updateTerminalsBindingDesktopsConfig =
        genForUpdateTerminalsBindingDesktopsConfig();

    private static HttpRequestDef<UpdateTerminalsBindingDesktopsConfigRequest, UpdateTerminalsBindingDesktopsConfigResponse> genForUpdateTerminalsBindingDesktopsConfig() {
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
            f -> f.withMarshaller(UpdateTerminalsBindingDesktopsConfigRequest::getBody,
                UpdateTerminalsBindingDesktopsConfigRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchCreateUsersRequest, BatchCreateUsersResponse> batchCreateUsers =
        genForBatchCreateUsers();

    private static HttpRequestDef<BatchCreateUsersRequest, BatchCreateUsersResponse> genForBatchCreateUsers() {
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
            f -> f.withMarshaller(BatchCreateUsersRequest::getBody, BatchCreateUsersRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteOtpDevicesRequest, BatchDeleteOtpDevicesResponse> batchDeleteOtpDevices =
        genForBatchDeleteOtpDevices();

    private static HttpRequestDef<BatchDeleteOtpDevicesRequest, BatchDeleteOtpDevicesResponse> genForBatchDeleteOtpDevices() {
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
            f -> f.withMarshaller(BatchDeleteOtpDevicesRequest::getUserId, BatchDeleteOtpDevicesRequest::setUserId));
        builder.<DelOtpDevicesReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DelOtpDevicesReq.class),
            f -> f.withMarshaller(BatchDeleteOtpDevicesRequest::getBody, BatchDeleteOtpDevicesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ChangeUserStatusRequest, ChangeUserStatusResponse> changeUserStatus =
        genForChangeUserStatus();

    private static HttpRequestDef<ChangeUserStatusRequest, ChangeUserStatusResponse> genForChangeUserStatus() {
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
            f -> f.withMarshaller(ChangeUserStatusRequest::getUserId, ChangeUserStatusRequest::setUserId));
        builder.<OperateUserReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(OperateUserReq.class),
            f -> f.withMarshaller(ChangeUserStatusRequest::getBody, ChangeUserStatusRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateDesktopUserRequest, CreateDesktopUserResponse> createDesktopUser =
        genForCreateDesktopUser();

    private static HttpRequestDef<CreateDesktopUserRequest, CreateDesktopUserResponse> genForCreateDesktopUser() {
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
            f -> f.withMarshaller(CreateDesktopUserRequest::getBody, CreateDesktopUserRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteUserRequest, DeleteUserResponse> deleteUser = genForDeleteUser();

    private static HttpRequestDef<DeleteUserRequest, DeleteUserResponse> genForDeleteUser() {
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
            f -> f.withMarshaller(DeleteUserRequest::getUserId, DeleteUserRequest::setUserId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListOtpDevicesByUserIdRequest, ListOtpDevicesByUserIdResponse> listOtpDevicesByUserId =
        genForListOtpDevicesByUserId();

    private static HttpRequestDef<ListOtpDevicesByUserIdRequest, ListOtpDevicesByUserIdResponse> genForListOtpDevicesByUserId() {
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
            f -> f.withMarshaller(ListOtpDevicesByUserIdRequest::getUserId, ListOtpDevicesByUserIdRequest::setUserId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListUserDetailRequest, ListUserDetailResponse> listUserDetail =
        genForListUserDetail();

    private static HttpRequestDef<ListUserDetailRequest, ListUserDetailResponse> genForListUserDetail() {
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
            f -> f.withMarshaller(ListUserDetailRequest::getUserId, ListUserDetailRequest::setUserId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListUsersRequest, ListUsersResponse> listUsers = genForListUsers();

    private static HttpRequestDef<ListUsersRequest, ListUsersResponse> genForListUsers() {
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
            f -> f.withMarshaller(ListUsersRequest::getUserName, ListUsersRequest::setUserName));
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUsersRequest::getLimit, ListUsersRequest::setLimit));
        builder.<String>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUsersRequest::getOffset, ListUsersRequest::setOffset));
        builder.<String>withRequestField("description",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUsersRequest::getDescription, ListUsersRequest::setDescription));
        builder.<String>withRequestField("active_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUsersRequest::getActiveType, ListUsersRequest::setActiveType));
        builder.<String>withRequestField("group_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUsersRequest::getGroupName, ListUsersRequest::setGroupName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ResetRandomPasswordRequest, ResetRandomPasswordResponse> resetRandomPassword =
        genForResetRandomPassword();

    private static HttpRequestDef<ResetRandomPasswordRequest, ResetRandomPasswordResponse> genForResetRandomPassword() {
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
            f -> f.withMarshaller(ResetRandomPasswordRequest::getUserId, ResetRandomPasswordRequest::setUserId));
        builder.<String>withRequestField("notification_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ResetRandomPasswordRequest::getNotificationType,
                ResetRandomPasswordRequest::setNotificationType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateUserInfoRequest, UpdateUserInfoResponse> updateUserInfo =
        genForUpdateUserInfo();

    private static HttpRequestDef<UpdateUserInfoRequest, UpdateUserInfoResponse> genForUpdateUserInfo() {
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
            f -> f.withMarshaller(UpdateUserInfoRequest::getUserId, UpdateUserInfoRequest::setUserId));
        builder.<EditUserReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(EditUserReq.class),
            f -> f.withMarshaller(UpdateUserInfoRequest::getBody, UpdateUserInfoRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddVolumesRequest, AddVolumesResponse> addVolumes = genForAddVolumes();

    private static HttpRequestDef<AddVolumesRequest, AddVolumesResponse> genForAddVolumes() {
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
            f -> f.withMarshaller(AddVolumesRequest::getBody, AddVolumesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteDesktopVolumesRequest, DeleteDesktopVolumesResponse> deleteDesktopVolumes =
        genForDeleteDesktopVolumes();

    private static HttpRequestDef<DeleteDesktopVolumesRequest, DeleteDesktopVolumesResponse> genForDeleteDesktopVolumes() {
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
            f -> f.withMarshaller(DeleteDesktopVolumesRequest::getDesktopId,
                DeleteDesktopVolumesRequest::setDesktopId));
        builder.<DeleteVolumesReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteVolumesReq.class),
            f -> f.withMarshaller(DeleteDesktopVolumesRequest::getBody, DeleteDesktopVolumesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExpandVolumesRequest, ExpandVolumesResponse> expandVolumes =
        genForExpandVolumes();

    private static HttpRequestDef<ExpandVolumesRequest, ExpandVolumesResponse> genForExpandVolumes() {
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
            f -> f.withMarshaller(ExpandVolumesRequest::getBody, ExpandVolumesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ApplyWorkspaceRequest, ApplyWorkspaceResponse> applyWorkspace =
        genForApplyWorkspace();

    private static HttpRequestDef<ApplyWorkspaceRequest, ApplyWorkspaceResponse> genForApplyWorkspace() {
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
            f -> f.withMarshaller(ApplyWorkspaceRequest::getBody, ApplyWorkspaceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CancelWorkspaceRequest, CancelWorkspaceResponse> cancelWorkspace =
        genForCancelWorkspace();

    private static HttpRequestDef<CancelWorkspaceRequest, CancelWorkspaceResponse> genForCancelWorkspace() {
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
        genForListWorkspaces();

    private static HttpRequestDef<ListWorkspacesRequest, ListWorkspacesResponse> genForListWorkspaces() {
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
        genForShowWorkspaceLock();

    private static HttpRequestDef<ShowWorkspaceLockRequest, ShowWorkspaceLockResponse> genForShowWorkspaceLock() {
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
        genForUnlockWorkspace();

    private static HttpRequestDef<UnlockWorkspaceRequest, UnlockWorkspaceResponse> genForUnlockWorkspace() {
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
            f -> f.withMarshaller(UnlockWorkspaceRequest::getBody, UnlockWorkspaceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateWorkspaceRequest, UpdateWorkspaceResponse> updateWorkspace =
        genForUpdateWorkspace();

    private static HttpRequestDef<UpdateWorkspaceRequest, UpdateWorkspaceResponse> genForUpdateWorkspace() {
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
            f -> f.withMarshaller(UpdateWorkspaceRequest::getBody, UpdateWorkspaceRequest::setBody));

        // response

        return builder.build();
    }

}
