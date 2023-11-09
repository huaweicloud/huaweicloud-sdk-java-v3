package com.huaweicloud.sdk.workspace.v2;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.workspace.v2.model.AddVolumesRequest;
import com.huaweicloud.sdk.workspace.v2.model.AddVolumesResponse;
import com.huaweicloud.sdk.workspace.v2.model.ApplyDesktopsInternetRequest;
import com.huaweicloud.sdk.workspace.v2.model.ApplyDesktopsInternetResponse;
import com.huaweicloud.sdk.workspace.v2.model.ApplyWorkspaceRequest;
import com.huaweicloud.sdk.workspace.v2.model.ApplyWorkspaceResponse;
import com.huaweicloud.sdk.workspace.v2.model.AssociateDesktopsEipRequest;
import com.huaweicloud.sdk.workspace.v2.model.AssociateDesktopsEipResponse;
import com.huaweicloud.sdk.workspace.v2.model.BatchChangeTagsRequest;
import com.huaweicloud.sdk.workspace.v2.model.BatchChangeTagsResponse;
import com.huaweicloud.sdk.workspace.v2.model.BatchCreateUsersRequest;
import com.huaweicloud.sdk.workspace.v2.model.BatchCreateUsersResponse;
import com.huaweicloud.sdk.workspace.v2.model.BatchDeleteAccessPoliciesRequest;
import com.huaweicloud.sdk.workspace.v2.model.BatchDeleteAccessPoliciesResponse;
import com.huaweicloud.sdk.workspace.v2.model.BatchDeleteDesktopsRequest;
import com.huaweicloud.sdk.workspace.v2.model.BatchDeleteDesktopsResponse;
import com.huaweicloud.sdk.workspace.v2.model.BatchDeleteOtpDevicesRequest;
import com.huaweicloud.sdk.workspace.v2.model.BatchDeleteOtpDevicesResponse;
import com.huaweicloud.sdk.workspace.v2.model.BatchDeleteUserGroupsRequest;
import com.huaweicloud.sdk.workspace.v2.model.BatchDeleteUserGroupsResponse;
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
import com.huaweicloud.sdk.workspace.v2.model.ChangeDesktopNetworkRequest;
import com.huaweicloud.sdk.workspace.v2.model.ChangeDesktopNetworkResponse;
import com.huaweicloud.sdk.workspace.v2.model.ChangeUserStatusRequest;
import com.huaweicloud.sdk.workspace.v2.model.ChangeUserStatusResponse;
import com.huaweicloud.sdk.workspace.v2.model.CreateAccessPolicyRequest;
import com.huaweicloud.sdk.workspace.v2.model.CreateAccessPolicyResponse;
import com.huaweicloud.sdk.workspace.v2.model.CreateDesktopRequest;
import com.huaweicloud.sdk.workspace.v2.model.CreateDesktopResponse;
import com.huaweicloud.sdk.workspace.v2.model.CreateDesktopUserRequest;
import com.huaweicloud.sdk.workspace.v2.model.CreateDesktopUserResponse;
import com.huaweicloud.sdk.workspace.v2.model.CreateTagRequest;
import com.huaweicloud.sdk.workspace.v2.model.CreateTagResponse;
import com.huaweicloud.sdk.workspace.v2.model.CreateTerminalsBindingDesktopsRequest;
import com.huaweicloud.sdk.workspace.v2.model.CreateTerminalsBindingDesktopsResponse;
import com.huaweicloud.sdk.workspace.v2.model.CreateUserGroupRequest;
import com.huaweicloud.sdk.workspace.v2.model.CreateUserGroupResponse;
import com.huaweicloud.sdk.workspace.v2.model.DeleteDesktopRequest;
import com.huaweicloud.sdk.workspace.v2.model.DeleteDesktopResponse;
import com.huaweicloud.sdk.workspace.v2.model.DeleteDesktopVolumesRequest;
import com.huaweicloud.sdk.workspace.v2.model.DeleteDesktopVolumesResponse;
import com.huaweicloud.sdk.workspace.v2.model.DeleteTagRequest;
import com.huaweicloud.sdk.workspace.v2.model.DeleteTagResponse;
import com.huaweicloud.sdk.workspace.v2.model.DeleteTerminalsBindingDesktopsRequest;
import com.huaweicloud.sdk.workspace.v2.model.DeleteTerminalsBindingDesktopsResponse;
import com.huaweicloud.sdk.workspace.v2.model.DeleteUserGroupRequest;
import com.huaweicloud.sdk.workspace.v2.model.DeleteUserGroupResponse;
import com.huaweicloud.sdk.workspace.v2.model.DeleteUserRequest;
import com.huaweicloud.sdk.workspace.v2.model.DeleteUserResponse;
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
import com.huaweicloud.sdk.workspace.v2.model.ResetRandomPasswordRequest;
import com.huaweicloud.sdk.workspace.v2.model.ResetRandomPasswordResponse;
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
import com.huaweicloud.sdk.workspace.v2.model.UnlockWorkspaceRequest;
import com.huaweicloud.sdk.workspace.v2.model.UnlockWorkspaceResponse;
import com.huaweicloud.sdk.workspace.v2.model.UpdateAccessPolicyObjectsRequest;
import com.huaweicloud.sdk.workspace.v2.model.UpdateAccessPolicyObjectsResponse;
import com.huaweicloud.sdk.workspace.v2.model.UpdateAssistAuthMethodConfigRequest;
import com.huaweicloud.sdk.workspace.v2.model.UpdateAssistAuthMethodConfigResponse;
import com.huaweicloud.sdk.workspace.v2.model.UpdateTerminalsBindingDesktopsConfigRequest;
import com.huaweicloud.sdk.workspace.v2.model.UpdateTerminalsBindingDesktopsConfigResponse;
import com.huaweicloud.sdk.workspace.v2.model.UpdateTerminalsBindingDesktopsRequest;
import com.huaweicloud.sdk.workspace.v2.model.UpdateTerminalsBindingDesktopsResponse;
import com.huaweicloud.sdk.workspace.v2.model.UpdateUserGroupRequest;
import com.huaweicloud.sdk.workspace.v2.model.UpdateUserGroupResponse;
import com.huaweicloud.sdk.workspace.v2.model.UpdateUserInfoRequest;
import com.huaweicloud.sdk.workspace.v2.model.UpdateUserInfoResponse;
import com.huaweicloud.sdk.workspace.v2.model.UpdateWorkspaceRequest;
import com.huaweicloud.sdk.workspace.v2.model.UpdateWorkspaceResponse;

public class WorkspaceClient {

    protected HcClient hcClient;

    public WorkspaceClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<WorkspaceClient> newBuilder() {
        ClientBuilder<WorkspaceClient> clientBuilder = new ClientBuilder<>(WorkspaceClient::new);
        return clientBuilder;
    }

    /**
     * 删除接入策略
     *
     * 该接口用于删除指定接入策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchDeleteAccessPoliciesRequest 请求对象
     * @return BatchDeleteAccessPoliciesResponse
     */
    public BatchDeleteAccessPoliciesResponse batchDeleteAccessPolicies(BatchDeleteAccessPoliciesRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.batchDeleteAccessPolicies);
    }

    /**
     * 删除接入策略
     *
     * 该接口用于删除指定接入策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchDeleteAccessPoliciesRequest 请求对象
     * @return SyncInvoker<BatchDeleteAccessPoliciesRequest, BatchDeleteAccessPoliciesResponse>
     */
    public SyncInvoker<BatchDeleteAccessPoliciesRequest, BatchDeleteAccessPoliciesResponse> batchDeleteAccessPoliciesInvoker(
        BatchDeleteAccessPoliciesRequest request) {
        return new SyncInvoker<BatchDeleteAccessPoliciesRequest, BatchDeleteAccessPoliciesResponse>(request,
            WorkspaceMeta.batchDeleteAccessPolicies, hcClient);
    }

    /**
     * 创建接入策略
     *
     * 该接口用于创建接入策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateAccessPolicyRequest 请求对象
     * @return CreateAccessPolicyResponse
     */
    public CreateAccessPolicyResponse createAccessPolicy(CreateAccessPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.createAccessPolicy);
    }

    /**
     * 创建接入策略
     *
     * 该接口用于创建接入策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateAccessPolicyRequest 请求对象
     * @return SyncInvoker<CreateAccessPolicyRequest, CreateAccessPolicyResponse>
     */
    public SyncInvoker<CreateAccessPolicyRequest, CreateAccessPolicyResponse> createAccessPolicyInvoker(
        CreateAccessPolicyRequest request) {
        return new SyncInvoker<CreateAccessPolicyRequest, CreateAccessPolicyResponse>(request,
            WorkspaceMeta.createAccessPolicy, hcClient);
    }

    /**
     * 查询接入策略
     *
     * 该接口用于查询接入策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAccessPoliciesRequest 请求对象
     * @return ListAccessPoliciesResponse
     */
    public ListAccessPoliciesResponse listAccessPolicies(ListAccessPoliciesRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.listAccessPolicies);
    }

    /**
     * 查询接入策略
     *
     * 该接口用于查询接入策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAccessPoliciesRequest 请求对象
     * @return SyncInvoker<ListAccessPoliciesRequest, ListAccessPoliciesResponse>
     */
    public SyncInvoker<ListAccessPoliciesRequest, ListAccessPoliciesResponse> listAccessPoliciesInvoker(
        ListAccessPoliciesRequest request) {
        return new SyncInvoker<ListAccessPoliciesRequest, ListAccessPoliciesResponse>(request,
            WorkspaceMeta.listAccessPolicies, hcClient);
    }

    /**
     * 查询指定接入策略的应用对象
     *
     * 该接口用于查询指定接入策略的应用对象。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAccessPolicyObjectsRequest 请求对象
     * @return ListAccessPolicyObjectsResponse
     */
    public ListAccessPolicyObjectsResponse listAccessPolicyObjects(ListAccessPolicyObjectsRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.listAccessPolicyObjects);
    }

    /**
     * 查询指定接入策略的应用对象
     *
     * 该接口用于查询指定接入策略的应用对象。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAccessPolicyObjectsRequest 请求对象
     * @return SyncInvoker<ListAccessPolicyObjectsRequest, ListAccessPolicyObjectsResponse>
     */
    public SyncInvoker<ListAccessPolicyObjectsRequest, ListAccessPolicyObjectsResponse> listAccessPolicyObjectsInvoker(
        ListAccessPolicyObjectsRequest request) {
        return new SyncInvoker<ListAccessPolicyObjectsRequest, ListAccessPolicyObjectsResponse>(request,
            WorkspaceMeta.listAccessPolicyObjects, hcClient);
    }

    /**
     * 更新指定接入策略的应用对象
     *
     * 该接口用于更新指定接入策略的应用对象。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateAccessPolicyObjectsRequest 请求对象
     * @return UpdateAccessPolicyObjectsResponse
     */
    public UpdateAccessPolicyObjectsResponse updateAccessPolicyObjects(UpdateAccessPolicyObjectsRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.updateAccessPolicyObjects);
    }

    /**
     * 更新指定接入策略的应用对象
     *
     * 该接口用于更新指定接入策略的应用对象。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateAccessPolicyObjectsRequest 请求对象
     * @return SyncInvoker<UpdateAccessPolicyObjectsRequest, UpdateAccessPolicyObjectsResponse>
     */
    public SyncInvoker<UpdateAccessPolicyObjectsRequest, UpdateAccessPolicyObjectsResponse> updateAccessPolicyObjectsInvoker(
        UpdateAccessPolicyObjectsRequest request) {
        return new SyncInvoker<UpdateAccessPolicyObjectsRequest, UpdateAccessPolicyObjectsResponse>(request,
            WorkspaceMeta.updateAccessPolicyObjects, hcClient);
    }

    /**
     * 查询辅助认证配置
     *
     * 查询辅助认证的配置信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAssistAuthConfigRequest 请求对象
     * @return ShowAssistAuthConfigResponse
     */
    public ShowAssistAuthConfigResponse showAssistAuthConfig(ShowAssistAuthConfigRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.showAssistAuthConfig);
    }

    /**
     * 查询辅助认证配置
     *
     * 查询辅助认证的配置信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAssistAuthConfigRequest 请求对象
     * @return SyncInvoker<ShowAssistAuthConfigRequest, ShowAssistAuthConfigResponse>
     */
    public SyncInvoker<ShowAssistAuthConfigRequest, ShowAssistAuthConfigResponse> showAssistAuthConfigInvoker(
        ShowAssistAuthConfigRequest request) {
        return new SyncInvoker<ShowAssistAuthConfigRequest, ShowAssistAuthConfigResponse>(request,
            WorkspaceMeta.showAssistAuthConfig, hcClient);
    }

    /**
     * 更新辅助认证策略配置
     *
     * 更新辅助认证策略配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateAssistAuthMethodConfigRequest 请求对象
     * @return UpdateAssistAuthMethodConfigResponse
     */
    public UpdateAssistAuthMethodConfigResponse updateAssistAuthMethodConfig(
        UpdateAssistAuthMethodConfigRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.updateAssistAuthMethodConfig);
    }

    /**
     * 更新辅助认证策略配置
     *
     * 更新辅助认证策略配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateAssistAuthMethodConfigRequest 请求对象
     * @return SyncInvoker<UpdateAssistAuthMethodConfigRequest, UpdateAssistAuthMethodConfigResponse>
     */
    public SyncInvoker<UpdateAssistAuthMethodConfigRequest, UpdateAssistAuthMethodConfigResponse> updateAssistAuthMethodConfigInvoker(
        UpdateAssistAuthMethodConfigRequest request) {
        return new SyncInvoker<UpdateAssistAuthMethodConfigRequest, UpdateAssistAuthMethodConfigResponse>(request,
            WorkspaceMeta.updateAssistAuthMethodConfig, hcClient);
    }

    /**
     * 查询可用分区列表
     *
     * 该接口用于查询云桌面支持的可用分区列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAvailabilityZonesRequest 请求对象
     * @return ListAvailabilityZonesResponse
     */
    public ListAvailabilityZonesResponse listAvailabilityZones(ListAvailabilityZonesRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.listAvailabilityZones);
    }

    /**
     * 查询可用分区列表
     *
     * 该接口用于查询云桌面支持的可用分区列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAvailabilityZonesRequest 请求对象
     * @return SyncInvoker<ListAvailabilityZonesRequest, ListAvailabilityZonesResponse>
     */
    public SyncInvoker<ListAvailabilityZonesRequest, ListAvailabilityZonesResponse> listAvailabilityZonesInvoker(
        ListAvailabilityZonesRequest request) {
        return new SyncInvoker<ListAvailabilityZonesRequest, ListAvailabilityZonesResponse>(request,
            WorkspaceMeta.listAvailabilityZones, hcClient);
    }

    /**
     * 导出连接记录
     *
     * 该接口用于导出连接记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ExportUserLoginInfoNewRequest 请求对象
     * @return ExportUserLoginInfoNewResponse
     */
    public ExportUserLoginInfoNewResponse exportUserLoginInfoNew(ExportUserLoginInfoNewRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.exportUserLoginInfoNew);
    }

    /**
     * 导出连接记录
     *
     * 该接口用于导出连接记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ExportUserLoginInfoNewRequest 请求对象
     * @return SyncInvoker<ExportUserLoginInfoNewRequest, ExportUserLoginInfoNewResponse>
     */
    public SyncInvoker<ExportUserLoginInfoNewRequest, ExportUserLoginInfoNewResponse> exportUserLoginInfoNewInvoker(
        ExportUserLoginInfoNewRequest request) {
        return new SyncInvoker<ExportUserLoginInfoNewRequest, ExportUserLoginInfoNewResponse>(request,
            WorkspaceMeta.exportUserLoginInfoNew, hcClient);
    }

    /**
     * 查询登录人数
     *
     * 该接口用于查询登录人数，注意查询参数不可全空。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListHistoryOnlineInfoNewRequest 请求对象
     * @return ListHistoryOnlineInfoNewResponse
     */
    public ListHistoryOnlineInfoNewResponse listHistoryOnlineInfoNew(ListHistoryOnlineInfoNewRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.listHistoryOnlineInfoNew);
    }

    /**
     * 查询登录人数
     *
     * 该接口用于查询登录人数，注意查询参数不可全空。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListHistoryOnlineInfoNewRequest 请求对象
     * @return SyncInvoker<ListHistoryOnlineInfoNewRequest, ListHistoryOnlineInfoNewResponse>
     */
    public SyncInvoker<ListHistoryOnlineInfoNewRequest, ListHistoryOnlineInfoNewResponse> listHistoryOnlineInfoNewInvoker(
        ListHistoryOnlineInfoNewRequest request) {
        return new SyncInvoker<ListHistoryOnlineInfoNewRequest, ListHistoryOnlineInfoNewResponse>(request,
            WorkspaceMeta.listHistoryOnlineInfoNew, hcClient);
    }

    /**
     * 查询登录信息
     *
     * 该接口用于查询登录信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListLoginRecordsNewRequest 请求对象
     * @return ListLoginRecordsNewResponse
     */
    public ListLoginRecordsNewResponse listLoginRecordsNew(ListLoginRecordsNewRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.listLoginRecordsNew);
    }

    /**
     * 查询登录信息
     *
     * 该接口用于查询登录信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListLoginRecordsNewRequest 请求对象
     * @return SyncInvoker<ListLoginRecordsNewRequest, ListLoginRecordsNewResponse>
     */
    public SyncInvoker<ListLoginRecordsNewRequest, ListLoginRecordsNewResponse> listLoginRecordsNewInvoker(
        ListLoginRecordsNewRequest request) {
        return new SyncInvoker<ListLoginRecordsNewRequest, ListLoginRecordsNewResponse>(request,
            WorkspaceMeta.listLoginRecordsNew, hcClient);
    }

    /**
     * 批量删除桌面
     *
     * 批量删除桌面，删除后无法恢复。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchDeleteDesktopsRequest 请求对象
     * @return BatchDeleteDesktopsResponse
     */
    public BatchDeleteDesktopsResponse batchDeleteDesktops(BatchDeleteDesktopsRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.batchDeleteDesktops);
    }

    /**
     * 批量删除桌面
     *
     * 批量删除桌面，删除后无法恢复。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchDeleteDesktopsRequest 请求对象
     * @return SyncInvoker<BatchDeleteDesktopsRequest, BatchDeleteDesktopsResponse>
     */
    public SyncInvoker<BatchDeleteDesktopsRequest, BatchDeleteDesktopsResponse> batchDeleteDesktopsInvoker(
        BatchDeleteDesktopsRequest request) {
        return new SyncInvoker<BatchDeleteDesktopsRequest, BatchDeleteDesktopsResponse>(request,
            WorkspaceMeta.batchDeleteDesktops, hcClient);
    }

    /**
     * 批量注销桌面
     *
     * 批量注销桌面。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchLogoffDesktopsRequest 请求对象
     * @return BatchLogoffDesktopsResponse
     */
    public BatchLogoffDesktopsResponse batchLogoffDesktops(BatchLogoffDesktopsRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.batchLogoffDesktops);
    }

    /**
     * 批量注销桌面
     *
     * 批量注销桌面。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchLogoffDesktopsRequest 请求对象
     * @return SyncInvoker<BatchLogoffDesktopsRequest, BatchLogoffDesktopsResponse>
     */
    public SyncInvoker<BatchLogoffDesktopsRequest, BatchLogoffDesktopsResponse> batchLogoffDesktopsInvoker(
        BatchLogoffDesktopsRequest request) {
        return new SyncInvoker<BatchLogoffDesktopsRequest, BatchLogoffDesktopsResponse>(request,
            WorkspaceMeta.batchLogoffDesktops, hcClient);
    }

    /**
     * 重建桌面
     *
     * 批量重建桌面系统盘。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchRebuildDesktopsSystemDiskRequest 请求对象
     * @return BatchRebuildDesktopsSystemDiskResponse
     */
    public BatchRebuildDesktopsSystemDiskResponse batchRebuildDesktopsSystemDisk(
        BatchRebuildDesktopsSystemDiskRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.batchRebuildDesktopsSystemDisk);
    }

    /**
     * 重建桌面
     *
     * 批量重建桌面系统盘。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchRebuildDesktopsSystemDiskRequest 请求对象
     * @return SyncInvoker<BatchRebuildDesktopsSystemDiskRequest, BatchRebuildDesktopsSystemDiskResponse>
     */
    public SyncInvoker<BatchRebuildDesktopsSystemDiskRequest, BatchRebuildDesktopsSystemDiskResponse> batchRebuildDesktopsSystemDiskInvoker(
        BatchRebuildDesktopsSystemDiskRequest request) {
        return new SyncInvoker<BatchRebuildDesktopsSystemDiskRequest, BatchRebuildDesktopsSystemDiskResponse>(request,
            WorkspaceMeta.batchRebuildDesktopsSystemDisk, hcClient);
    }

    /**
     * 操作桌面
     *
     * 批量操作桌面，用于批量开机、关机和重启。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchRunDesktopsRequest 请求对象
     * @return BatchRunDesktopsResponse
     */
    public BatchRunDesktopsResponse batchRunDesktops(BatchRunDesktopsRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.batchRunDesktops);
    }

    /**
     * 操作桌面
     *
     * 批量操作桌面，用于批量开机、关机和重启。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchRunDesktopsRequest 请求对象
     * @return SyncInvoker<BatchRunDesktopsRequest, BatchRunDesktopsResponse>
     */
    public SyncInvoker<BatchRunDesktopsRequest, BatchRunDesktopsResponse> batchRunDesktopsInvoker(
        BatchRunDesktopsRequest request) {
        return new SyncInvoker<BatchRunDesktopsRequest, BatchRunDesktopsResponse>(request,
            WorkspaceMeta.batchRunDesktops, hcClient);
    }

    /**
     * 切换桌面网络
     *
     * 切换桌面vpc、子网、ip、安全组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ChangeDesktopNetworkRequest 请求对象
     * @return ChangeDesktopNetworkResponse
     */
    public ChangeDesktopNetworkResponse changeDesktopNetwork(ChangeDesktopNetworkRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.changeDesktopNetwork);
    }

    /**
     * 切换桌面网络
     *
     * 切换桌面vpc、子网、ip、安全组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ChangeDesktopNetworkRequest 请求对象
     * @return SyncInvoker<ChangeDesktopNetworkRequest, ChangeDesktopNetworkResponse>
     */
    public SyncInvoker<ChangeDesktopNetworkRequest, ChangeDesktopNetworkResponse> changeDesktopNetworkInvoker(
        ChangeDesktopNetworkRequest request) {
        return new SyncInvoker<ChangeDesktopNetworkRequest, ChangeDesktopNetworkResponse>(request,
            WorkspaceMeta.changeDesktopNetwork, hcClient);
    }

    /**
     * 创建桌面
     *
     * 创建桌面，并将此桌面分配给用户，当桌面创建成功后用户可以登录使用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateDesktopRequest 请求对象
     * @return CreateDesktopResponse
     */
    public CreateDesktopResponse createDesktop(CreateDesktopRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.createDesktop);
    }

    /**
     * 创建桌面
     *
     * 创建桌面，并将此桌面分配给用户，当桌面创建成功后用户可以登录使用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateDesktopRequest 请求对象
     * @return SyncInvoker<CreateDesktopRequest, CreateDesktopResponse>
     */
    public SyncInvoker<CreateDesktopRequest, CreateDesktopResponse> createDesktopInvoker(CreateDesktopRequest request) {
        return new SyncInvoker<CreateDesktopRequest, CreateDesktopResponse>(request, WorkspaceMeta.createDesktop,
            hcClient);
    }

    /**
     * 删除单个桌面
     *
     * 删除单个桌面，删除后无法恢复。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteDesktopRequest 请求对象
     * @return DeleteDesktopResponse
     */
    public DeleteDesktopResponse deleteDesktop(DeleteDesktopRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.deleteDesktop);
    }

    /**
     * 删除单个桌面
     *
     * 删除单个桌面，删除后无法恢复。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteDesktopRequest 请求对象
     * @return SyncInvoker<DeleteDesktopRequest, DeleteDesktopResponse>
     */
    public SyncInvoker<DeleteDesktopRequest, DeleteDesktopResponse> deleteDesktopInvoker(DeleteDesktopRequest request) {
        return new SyncInvoker<DeleteDesktopRequest, DeleteDesktopResponse>(request, WorkspaceMeta.deleteDesktop,
            hcClient);
    }

    /**
     * 查询桌面列表
     *
     * 该接口用于查询桌面虚拟机列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDesktopsRequest 请求对象
     * @return ListDesktopsResponse
     */
    public ListDesktopsResponse listDesktops(ListDesktopsRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.listDesktops);
    }

    /**
     * 查询桌面列表
     *
     * 该接口用于查询桌面虚拟机列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDesktopsRequest 请求对象
     * @return SyncInvoker<ListDesktopsRequest, ListDesktopsResponse>
     */
    public SyncInvoker<ListDesktopsRequest, ListDesktopsResponse> listDesktopsInvoker(ListDesktopsRequest request) {
        return new SyncInvoker<ListDesktopsRequest, ListDesktopsResponse>(request, WorkspaceMeta.listDesktops,
            hcClient);
    }

    /**
     * 查询桌面详情列表
     *
     * 查询桌面详情信息列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDesktopsDetailRequest 请求对象
     * @return ListDesktopsDetailResponse
     */
    public ListDesktopsDetailResponse listDesktopsDetail(ListDesktopsDetailRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.listDesktopsDetail);
    }

    /**
     * 查询桌面详情列表
     *
     * 查询桌面详情信息列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDesktopsDetailRequest 请求对象
     * @return SyncInvoker<ListDesktopsDetailRequest, ListDesktopsDetailResponse>
     */
    public SyncInvoker<ListDesktopsDetailRequest, ListDesktopsDetailResponse> listDesktopsDetailInvoker(
        ListDesktopsDetailRequest request) {
        return new SyncInvoker<ListDesktopsDetailRequest, ListDesktopsDetailResponse>(request,
            WorkspaceMeta.listDesktopsDetail, hcClient);
    }

    /**
     * 变更规格
     *
     * 变更云桌面规格，只支持变更CPU和内存，不支持变更磁盘，不支持同规格互相变更。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ResizeDesktopRequest 请求对象
     * @return ResizeDesktopResponse
     */
    public ResizeDesktopResponse resizeDesktop(ResizeDesktopRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.resizeDesktop);
    }

    /**
     * 变更规格
     *
     * 变更云桌面规格，只支持变更CPU和内存，不支持变更磁盘，不支持同规格互相变更。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ResizeDesktopRequest 请求对象
     * @return SyncInvoker<ResizeDesktopRequest, ResizeDesktopResponse>
     */
    public SyncInvoker<ResizeDesktopRequest, ResizeDesktopResponse> resizeDesktopInvoker(ResizeDesktopRequest request) {
        return new SyncInvoker<ResizeDesktopRequest, ResizeDesktopResponse>(request, WorkspaceMeta.resizeDesktop,
            hcClient);
    }

    /**
     * 查询单个桌面详情
     *
     * 指定桌面Id查询详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDesktopDetailRequest 请求对象
     * @return ShowDesktopDetailResponse
     */
    public ShowDesktopDetailResponse showDesktopDetail(ShowDesktopDetailRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.showDesktopDetail);
    }

    /**
     * 查询单个桌面详情
     *
     * 指定桌面Id查询详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDesktopDetailRequest 请求对象
     * @return SyncInvoker<ShowDesktopDetailRequest, ShowDesktopDetailResponse>
     */
    public SyncInvoker<ShowDesktopDetailRequest, ShowDesktopDetailResponse> showDesktopDetailInvoker(
        ShowDesktopDetailRequest request) {
        return new SyncInvoker<ShowDesktopDetailRequest, ShowDesktopDetailResponse>(request,
            WorkspaceMeta.showDesktopDetail, hcClient);
    }

    /**
     * 查询桌面网络
     *
     * 查询桌面vpc、子网、privateIp、EIP、安全组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDesktopNetworkRequest 请求对象
     * @return ShowDesktopNetworkResponse
     */
    public ShowDesktopNetworkResponse showDesktopNetwork(ShowDesktopNetworkRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.showDesktopNetwork);
    }

    /**
     * 查询桌面网络
     *
     * 查询桌面vpc、子网、privateIp、EIP、安全组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDesktopNetworkRequest 请求对象
     * @return SyncInvoker<ShowDesktopNetworkRequest, ShowDesktopNetworkResponse>
     */
    public SyncInvoker<ShowDesktopNetworkRequest, ShowDesktopNetworkResponse> showDesktopNetworkInvoker(
        ShowDesktopNetworkRequest request) {
        return new SyncInvoker<ShowDesktopNetworkRequest, ShowDesktopNetworkResponse>(request,
            WorkspaceMeta.showDesktopNetwork, hcClient);
    }

    /**
     * 查询在指定时间段未使用的桌面
     *
     * 查询在指定时间段未使用的桌面。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListUnusedDesktopsRequest 请求对象
     * @return ListUnusedDesktopsResponse
     */
    public ListUnusedDesktopsResponse listUnusedDesktops(ListUnusedDesktopsRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.listUnusedDesktops);
    }

    /**
     * 查询在指定时间段未使用的桌面
     *
     * 查询在指定时间段未使用的桌面。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListUnusedDesktopsRequest 请求对象
     * @return SyncInvoker<ListUnusedDesktopsRequest, ListUnusedDesktopsResponse>
     */
    public SyncInvoker<ListUnusedDesktopsRequest, ListUnusedDesktopsResponse> listUnusedDesktopsInvoker(
        ListUnusedDesktopsRequest request) {
        return new SyncInvoker<ListUnusedDesktopsRequest, ListUnusedDesktopsResponse>(request,
            WorkspaceMeta.listUnusedDesktops, hcClient);
    }

    /**
     * 查询使用桌面的时长
     *
     * 查询使用桌面的时长。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListUsedDesktopInfoRequest 请求对象
     * @return ListUsedDesktopInfoResponse
     */
    public ListUsedDesktopInfoResponse listUsedDesktopInfo(ListUsedDesktopInfoRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.listUsedDesktopInfo);
    }

    /**
     * 查询使用桌面的时长
     *
     * 查询使用桌面的时长。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListUsedDesktopInfoRequest 请求对象
     * @return SyncInvoker<ListUsedDesktopInfoRequest, ListUsedDesktopInfoResponse>
     */
    public SyncInvoker<ListUsedDesktopInfoRequest, ListUsedDesktopInfoResponse> listUsedDesktopInfoInvoker(
        ListUsedDesktopInfoRequest request) {
        return new SyncInvoker<ListUsedDesktopInfoRequest, ListUsedDesktopInfoResponse>(request,
            WorkspaceMeta.listUsedDesktopInfo, hcClient);
    }

    /**
     * 批量添加删除标签
     *
     * 为指定桌面批量添加或删除标签。创建时，如果创建的标签已经存在（key相同），则覆盖。删除时，如果删除的标签不存在，默认处理成功
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchChangeTagsRequest 请求对象
     * @return BatchChangeTagsResponse
     */
    public BatchChangeTagsResponse batchChangeTags(BatchChangeTagsRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.batchChangeTags);
    }

    /**
     * 批量添加删除标签
     *
     * 为指定桌面批量添加或删除标签。创建时，如果创建的标签已经存在（key相同），则覆盖。删除时，如果删除的标签不存在，默认处理成功
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchChangeTagsRequest 请求对象
     * @return SyncInvoker<BatchChangeTagsRequest, BatchChangeTagsResponse>
     */
    public SyncInvoker<BatchChangeTagsRequest, BatchChangeTagsResponse> batchChangeTagsInvoker(
        BatchChangeTagsRequest request) {
        return new SyncInvoker<BatchChangeTagsRequest, BatchChangeTagsResponse>(request, WorkspaceMeta.batchChangeTags,
            hcClient);
    }

    /**
     * 创建桌面标签
     *
     * 该接口用于为桌面创建标签，一个桌面上最多有10个标签。创建时，如果创建的标签已经存在（key相同），则覆盖。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateTagRequest 请求对象
     * @return CreateTagResponse
     */
    public CreateTagResponse createTag(CreateTagRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.createTag);
    }

    /**
     * 创建桌面标签
     *
     * 该接口用于为桌面创建标签，一个桌面上最多有10个标签。创建时，如果创建的标签已经存在（key相同），则覆盖。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateTagRequest 请求对象
     * @return SyncInvoker<CreateTagRequest, CreateTagResponse>
     */
    public SyncInvoker<CreateTagRequest, CreateTagResponse> createTagInvoker(CreateTagRequest request) {
        return new SyncInvoker<CreateTagRequest, CreateTagResponse>(request, WorkspaceMeta.createTag, hcClient);
    }

    /**
     * 删除桌面标签
     *
     * 该接口用于删除桌面标签。删除时，如果删除的标签不存在，默认处理成功。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteTagRequest 请求对象
     * @return DeleteTagResponse
     */
    public DeleteTagResponse deleteTag(DeleteTagRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.deleteTag);
    }

    /**
     * 删除桌面标签
     *
     * 该接口用于删除桌面标签。删除时，如果删除的标签不存在，默认处理成功。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteTagRequest 请求对象
     * @return SyncInvoker<DeleteTagRequest, DeleteTagResponse>
     */
    public SyncInvoker<DeleteTagRequest, DeleteTagResponse> deleteTagInvoker(DeleteTagRequest request) {
        return new SyncInvoker<DeleteTagRequest, DeleteTagResponse>(request, WorkspaceMeta.deleteTag, hcClient);
    }

    /**
     * 使用标签过滤桌面
     *
     * 使用标签过滤桌面
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDesktopByTagsRequest 请求对象
     * @return ListDesktopByTagsResponse
     */
    public ListDesktopByTagsResponse listDesktopByTags(ListDesktopByTagsRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.listDesktopByTags);
    }

    /**
     * 使用标签过滤桌面
     *
     * 使用标签过滤桌面
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDesktopByTagsRequest 请求对象
     * @return SyncInvoker<ListDesktopByTagsRequest, ListDesktopByTagsResponse>
     */
    public SyncInvoker<ListDesktopByTagsRequest, ListDesktopByTagsResponse> listDesktopByTagsInvoker(
        ListDesktopByTagsRequest request) {
        return new SyncInvoker<ListDesktopByTagsRequest, ListDesktopByTagsResponse>(request,
            WorkspaceMeta.listDesktopByTags, hcClient);
    }

    /**
     * 查询项目标签
     *
     * 查询租户的所有标签集合
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListProjectTagsRequest 请求对象
     * @return ListProjectTagsResponse
     */
    public ListProjectTagsResponse listProjectTags(ListProjectTagsRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.listProjectTags);
    }

    /**
     * 查询项目标签
     *
     * 查询租户的所有标签集合
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListProjectTagsRequest 请求对象
     * @return SyncInvoker<ListProjectTagsRequest, ListProjectTagsResponse>
     */
    public SyncInvoker<ListProjectTagsRequest, ListProjectTagsResponse> listProjectTagsInvoker(
        ListProjectTagsRequest request) {
        return new SyncInvoker<ListProjectTagsRequest, ListProjectTagsResponse>(request, WorkspaceMeta.listProjectTags,
            hcClient);
    }

    /**
     * 查询桌面标签
     *
     * 查询指定桌面的标签信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowTagByDesktopIdRequest 请求对象
     * @return ShowTagByDesktopIdResponse
     */
    public ShowTagByDesktopIdResponse showTagByDesktopId(ShowTagByDesktopIdRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.showTagByDesktopId);
    }

    /**
     * 查询桌面标签
     *
     * 查询指定桌面的标签信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowTagByDesktopIdRequest 请求对象
     * @return SyncInvoker<ShowTagByDesktopIdRequest, ShowTagByDesktopIdResponse>
     */
    public SyncInvoker<ShowTagByDesktopIdRequest, ShowTagByDesktopIdResponse> showTagByDesktopIdInvoker(
        ShowTagByDesktopIdRequest request) {
        return new SyncInvoker<ShowTagByDesktopIdRequest, ShowTagByDesktopIdResponse>(request,
            WorkspaceMeta.showTagByDesktopId, hcClient);
    }

    /**
     * 批量删除用户组
     *
     * 该接口用于批量删除用户组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchDeleteUserGroupsRequest 请求对象
     * @return BatchDeleteUserGroupsResponse
     */
    public BatchDeleteUserGroupsResponse batchDeleteUserGroups(BatchDeleteUserGroupsRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.batchDeleteUserGroups);
    }

    /**
     * 批量删除用户组
     *
     * 该接口用于批量删除用户组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchDeleteUserGroupsRequest 请求对象
     * @return SyncInvoker<BatchDeleteUserGroupsRequest, BatchDeleteUserGroupsResponse>
     */
    public SyncInvoker<BatchDeleteUserGroupsRequest, BatchDeleteUserGroupsResponse> batchDeleteUserGroupsInvoker(
        BatchDeleteUserGroupsRequest request) {
        return new SyncInvoker<BatchDeleteUserGroupsRequest, BatchDeleteUserGroupsResponse>(request,
            WorkspaceMeta.batchDeleteUserGroups, hcClient);
    }

    /**
     * 创建用户组
     *
     * 该接口用于创建用户组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateUserGroupRequest 请求对象
     * @return CreateUserGroupResponse
     */
    public CreateUserGroupResponse createUserGroup(CreateUserGroupRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.createUserGroup);
    }

    /**
     * 创建用户组
     *
     * 该接口用于创建用户组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateUserGroupRequest 请求对象
     * @return SyncInvoker<CreateUserGroupRequest, CreateUserGroupResponse>
     */
    public SyncInvoker<CreateUserGroupRequest, CreateUserGroupResponse> createUserGroupInvoker(
        CreateUserGroupRequest request) {
        return new SyncInvoker<CreateUserGroupRequest, CreateUserGroupResponse>(request, WorkspaceMeta.createUserGroup,
            hcClient);
    }

    /**
     * 删除用户组
     *
     * 删除用户组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteUserGroupRequest 请求对象
     * @return DeleteUserGroupResponse
     */
    public DeleteUserGroupResponse deleteUserGroup(DeleteUserGroupRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.deleteUserGroup);
    }

    /**
     * 删除用户组
     *
     * 删除用户组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteUserGroupRequest 请求对象
     * @return SyncInvoker<DeleteUserGroupRequest, DeleteUserGroupResponse>
     */
    public SyncInvoker<DeleteUserGroupRequest, DeleteUserGroupResponse> deleteUserGroupInvoker(
        DeleteUserGroupRequest request) {
        return new SyncInvoker<DeleteUserGroupRequest, DeleteUserGroupResponse>(request, WorkspaceMeta.deleteUserGroup,
            hcClient);
    }

    /**
     * 查询用户组列表
     *
     * 查询用户组列表，支持分页。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListUserGroupsRequest 请求对象
     * @return ListUserGroupsResponse
     */
    public ListUserGroupsResponse listUserGroups(ListUserGroupsRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.listUserGroups);
    }

    /**
     * 查询用户组列表
     *
     * 查询用户组列表，支持分页。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListUserGroupsRequest 请求对象
     * @return SyncInvoker<ListUserGroupsRequest, ListUserGroupsResponse>
     */
    public SyncInvoker<ListUserGroupsRequest, ListUserGroupsResponse> listUserGroupsInvoker(
        ListUserGroupsRequest request) {
        return new SyncInvoker<ListUserGroupsRequest, ListUserGroupsResponse>(request, WorkspaceMeta.listUserGroups,
            hcClient);
    }

    /**
     * 查询用户组中的用户
     *
     * 该接口用于查询用户组中的用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListUsersOfGroupRequest 请求对象
     * @return ListUsersOfGroupResponse
     */
    public ListUsersOfGroupResponse listUsersOfGroup(ListUsersOfGroupRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.listUsersOfGroup);
    }

    /**
     * 查询用户组中的用户
     *
     * 该接口用于查询用户组中的用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListUsersOfGroupRequest 请求对象
     * @return SyncInvoker<ListUsersOfGroupRequest, ListUsersOfGroupResponse>
     */
    public SyncInvoker<ListUsersOfGroupRequest, ListUsersOfGroupResponse> listUsersOfGroupInvoker(
        ListUsersOfGroupRequest request) {
        return new SyncInvoker<ListUsersOfGroupRequest, ListUsersOfGroupResponse>(request,
            WorkspaceMeta.listUsersOfGroup, hcClient);
    }

    /**
     * 操作用户组
     *
     * 操作用户组，如添加用户、删除用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RunActionsOnGroupRequest 请求对象
     * @return RunActionsOnGroupResponse
     */
    public RunActionsOnGroupResponse runActionsOnGroup(RunActionsOnGroupRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.runActionsOnGroup);
    }

    /**
     * 操作用户组
     *
     * 操作用户组，如添加用户、删除用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RunActionsOnGroupRequest 请求对象
     * @return SyncInvoker<RunActionsOnGroupRequest, RunActionsOnGroupResponse>
     */
    public SyncInvoker<RunActionsOnGroupRequest, RunActionsOnGroupResponse> runActionsOnGroupInvoker(
        RunActionsOnGroupRequest request) {
        return new SyncInvoker<RunActionsOnGroupRequest, RunActionsOnGroupResponse>(request,
            WorkspaceMeta.runActionsOnGroup, hcClient);
    }

    /**
     * 修改用户组信息
     *
     * 该接口用于修改用户组信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateUserGroupRequest 请求对象
     * @return UpdateUserGroupResponse
     */
    public UpdateUserGroupResponse updateUserGroup(UpdateUserGroupRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.updateUserGroup);
    }

    /**
     * 修改用户组信息
     *
     * 该接口用于修改用户组信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateUserGroupRequest 请求对象
     * @return SyncInvoker<UpdateUserGroupRequest, UpdateUserGroupResponse>
     */
    public SyncInvoker<UpdateUserGroupRequest, UpdateUserGroupResponse> updateUserGroupInvoker(
        UpdateUserGroupRequest request) {
        return new SyncInvoker<UpdateUserGroupRequest, UpdateUserGroupResponse>(request, WorkspaceMeta.updateUserGroup,
            hcClient);
    }

    /**
     * 查询产品镜像列表
     *
     * 该接口用于查询云桌面支持的产品镜像列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListImagesRequest 请求对象
     * @return ListImagesResponse
     */
    public ListImagesResponse listImages(ListImagesRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.listImages);
    }

    /**
     * 查询产品镜像列表
     *
     * 该接口用于查询云桌面支持的产品镜像列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListImagesRequest 请求对象
     * @return SyncInvoker<ListImagesRequest, ListImagesResponse>
     */
    public SyncInvoker<ListImagesRequest, ListImagesResponse> listImagesInvoker(ListImagesRequest request) {
        return new SyncInvoker<ListImagesRequest, ListImagesResponse>(request, WorkspaceMeta.listImages, hcClient);
    }

    /**
     * 子任务查询
     *
     * 该接口用于查询异步任务执行情况，比如查询创建桌面的执行状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListItaSubJobsRequest 请求对象
     * @return ListItaSubJobsResponse
     */
    public ListItaSubJobsResponse listItaSubJobs(ListItaSubJobsRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.listItaSubJobs);
    }

    /**
     * 子任务查询
     *
     * 该接口用于查询异步任务执行情况，比如查询创建桌面的执行状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListItaSubJobsRequest 请求对象
     * @return SyncInvoker<ListItaSubJobsRequest, ListItaSubJobsResponse>
     */
    public SyncInvoker<ListItaSubJobsRequest, ListItaSubJobsResponse> listItaSubJobsInvoker(
        ListItaSubJobsRequest request) {
        return new SyncInvoker<ListItaSubJobsRequest, ListItaSubJobsResponse>(request, WorkspaceMeta.listItaSubJobs,
            hcClient);
    }

    /**
     * 开通桌面上网功能
     *
     * 开通桌面上网功能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ApplyDesktopsInternetRequest 请求对象
     * @return ApplyDesktopsInternetResponse
     */
    public ApplyDesktopsInternetResponse applyDesktopsInternet(ApplyDesktopsInternetRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.applyDesktopsInternet);
    }

    /**
     * 开通桌面上网功能
     *
     * 开通桌面上网功能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ApplyDesktopsInternetRequest 请求对象
     * @return SyncInvoker<ApplyDesktopsInternetRequest, ApplyDesktopsInternetResponse>
     */
    public SyncInvoker<ApplyDesktopsInternetRequest, ApplyDesktopsInternetResponse> applyDesktopsInternetInvoker(
        ApplyDesktopsInternetRequest request) {
        return new SyncInvoker<ApplyDesktopsInternetRequest, ApplyDesktopsInternetResponse>(request,
            WorkspaceMeta.applyDesktopsInternet, hcClient);
    }

    /**
     * 桌面绑定EIP
     *
     * 桌面绑定EIP。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AssociateDesktopsEipRequest 请求对象
     * @return AssociateDesktopsEipResponse
     */
    public AssociateDesktopsEipResponse associateDesktopsEip(AssociateDesktopsEipRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.associateDesktopsEip);
    }

    /**
     * 桌面绑定EIP
     *
     * 桌面绑定EIP。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AssociateDesktopsEipRequest 请求对象
     * @return SyncInvoker<AssociateDesktopsEipRequest, AssociateDesktopsEipResponse>
     */
    public SyncInvoker<AssociateDesktopsEipRequest, AssociateDesktopsEipResponse> associateDesktopsEipInvoker(
        AssociateDesktopsEipRequest request) {
        return new SyncInvoker<AssociateDesktopsEipRequest, AssociateDesktopsEipResponse>(request,
            WorkspaceMeta.associateDesktopsEip, hcClient);
    }

    /**
     * 批量桌面解绑EIP
     *
     * 批量桌面解绑EIP。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchDisassociateDesktopsEipRequest 请求对象
     * @return BatchDisassociateDesktopsEipResponse
     */
    public BatchDisassociateDesktopsEipResponse batchDisassociateDesktopsEip(
        BatchDisassociateDesktopsEipRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.batchDisassociateDesktopsEip);
    }

    /**
     * 批量桌面解绑EIP
     *
     * 批量桌面解绑EIP。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchDisassociateDesktopsEipRequest 请求对象
     * @return SyncInvoker<BatchDisassociateDesktopsEipRequest, BatchDisassociateDesktopsEipResponse>
     */
    public SyncInvoker<BatchDisassociateDesktopsEipRequest, BatchDisassociateDesktopsEipResponse> batchDisassociateDesktopsEipInvoker(
        BatchDisassociateDesktopsEipRequest request) {
        return new SyncInvoker<BatchDisassociateDesktopsEipRequest, BatchDisassociateDesktopsEipResponse>(request,
            WorkspaceMeta.batchDisassociateDesktopsEip, hcClient);
    }

    /**
     * 查询已绑定桌面和未绑定的Eip
     *
     * 查询已绑定桌面和未绑定的Eip。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDesktopsEipsRequest 请求对象
     * @return ListDesktopsEipsResponse
     */
    public ListDesktopsEipsResponse listDesktopsEips(ListDesktopsEipsRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.listDesktopsEips);
    }

    /**
     * 查询已绑定桌面和未绑定的Eip
     *
     * 查询已绑定桌面和未绑定的Eip。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDesktopsEipsRequest 请求对象
     * @return SyncInvoker<ListDesktopsEipsRequest, ListDesktopsEipsResponse>
     */
    public SyncInvoker<ListDesktopsEipsRequest, ListDesktopsEipsResponse> listDesktopsEipsInvoker(
        ListDesktopsEipsRequest request) {
        return new SyncInvoker<ListDesktopsEipsRequest, ListDesktopsEipsResponse>(request,
            WorkspaceMeta.listDesktopsEips, hcClient);
    }

    /**
     * 查询产品套餐列表
     *
     * 该接口用于查询云桌面支持的产品套餐列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListProductsRequest 请求对象
     * @return ListProductsResponse
     */
    public ListProductsResponse listProducts(ListProductsRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.listProducts);
    }

    /**
     * 查询产品套餐列表
     *
     * 该接口用于查询云桌面支持的产品套餐列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListProductsRequest 请求对象
     * @return SyncInvoker<ListProductsRequest, ListProductsResponse>
     */
    public SyncInvoker<ListProductsRequest, ListProductsResponse> listProductsInvoker(ListProductsRequest request) {
        return new SyncInvoker<ListProductsRequest, ListProductsResponse>(request, WorkspaceMeta.listProducts,
            hcClient);
    }

    /**
     * 查询租户配额
     *
     * Console Framework和WKSDesktopManager调用该接口查询租户配额。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowQuotasRequest 请求对象
     * @return ShowQuotasResponse
     */
    public ShowQuotasResponse showQuotas(ShowQuotasRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.showQuotas);
    }

    /**
     * 查询租户配额
     *
     * Console Framework和WKSDesktopManager调用该接口查询租户配额。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowQuotasRequest 请求对象
     * @return SyncInvoker<ShowQuotasRequest, ShowQuotasResponse>
     */
    public SyncInvoker<ShowQuotasRequest, ShowQuotasResponse> showQuotasInvoker(ShowQuotasRequest request) {
        return new SyncInvoker<ShowQuotasRequest, ShowQuotasResponse>(request, WorkspaceMeta.showQuotas, hcClient);
    }

    /**
     * 增加终端与桌面绑定配置
     *
     * 增加终端与桌面绑定配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateTerminalsBindingDesktopsRequest 请求对象
     * @return CreateTerminalsBindingDesktopsResponse
     */
    public CreateTerminalsBindingDesktopsResponse createTerminalsBindingDesktops(
        CreateTerminalsBindingDesktopsRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.createTerminalsBindingDesktops);
    }

    /**
     * 增加终端与桌面绑定配置
     *
     * 增加终端与桌面绑定配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateTerminalsBindingDesktopsRequest 请求对象
     * @return SyncInvoker<CreateTerminalsBindingDesktopsRequest, CreateTerminalsBindingDesktopsResponse>
     */
    public SyncInvoker<CreateTerminalsBindingDesktopsRequest, CreateTerminalsBindingDesktopsResponse> createTerminalsBindingDesktopsInvoker(
        CreateTerminalsBindingDesktopsRequest request) {
        return new SyncInvoker<CreateTerminalsBindingDesktopsRequest, CreateTerminalsBindingDesktopsResponse>(request,
            WorkspaceMeta.createTerminalsBindingDesktops, hcClient);
    }

    /**
     * 删除终端与桌面绑定配置
     *
     * 删除终端与桌面绑定配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteTerminalsBindingDesktopsRequest 请求对象
     * @return DeleteTerminalsBindingDesktopsResponse
     */
    public DeleteTerminalsBindingDesktopsResponse deleteTerminalsBindingDesktops(
        DeleteTerminalsBindingDesktopsRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.deleteTerminalsBindingDesktops);
    }

    /**
     * 删除终端与桌面绑定配置
     *
     * 删除终端与桌面绑定配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteTerminalsBindingDesktopsRequest 请求对象
     * @return SyncInvoker<DeleteTerminalsBindingDesktopsRequest, DeleteTerminalsBindingDesktopsResponse>
     */
    public SyncInvoker<DeleteTerminalsBindingDesktopsRequest, DeleteTerminalsBindingDesktopsResponse> deleteTerminalsBindingDesktopsInvoker(
        DeleteTerminalsBindingDesktopsRequest request) {
        return new SyncInvoker<DeleteTerminalsBindingDesktopsRequest, DeleteTerminalsBindingDesktopsResponse>(request,
            WorkspaceMeta.deleteTerminalsBindingDesktops, hcClient);
    }

    /**
     * 查询终端与桌面绑定配置列表
     *
     * 查询终端与桌面绑定配置列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTerminalsBindingDesktopsRequest 请求对象
     * @return ListTerminalsBindingDesktopsResponse
     */
    public ListTerminalsBindingDesktopsResponse listTerminalsBindingDesktops(
        ListTerminalsBindingDesktopsRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.listTerminalsBindingDesktops);
    }

    /**
     * 查询终端与桌面绑定配置列表
     *
     * 查询终端与桌面绑定配置列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTerminalsBindingDesktopsRequest 请求对象
     * @return SyncInvoker<ListTerminalsBindingDesktopsRequest, ListTerminalsBindingDesktopsResponse>
     */
    public SyncInvoker<ListTerminalsBindingDesktopsRequest, ListTerminalsBindingDesktopsResponse> listTerminalsBindingDesktopsInvoker(
        ListTerminalsBindingDesktopsRequest request) {
        return new SyncInvoker<ListTerminalsBindingDesktopsRequest, ListTerminalsBindingDesktopsResponse>(request,
            WorkspaceMeta.listTerminalsBindingDesktops, hcClient);
    }

    /**
     * 查询终端与桌面绑定的开关配置信息
     *
     * 查询终端与桌面绑定的开关配置信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTerminalsBindingDesktopsConfigRequest 请求对象
     * @return ListTerminalsBindingDesktopsConfigResponse
     */
    public ListTerminalsBindingDesktopsConfigResponse listTerminalsBindingDesktopsConfig(
        ListTerminalsBindingDesktopsConfigRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.listTerminalsBindingDesktopsConfig);
    }

    /**
     * 查询终端与桌面绑定的开关配置信息
     *
     * 查询终端与桌面绑定的开关配置信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTerminalsBindingDesktopsConfigRequest 请求对象
     * @return SyncInvoker<ListTerminalsBindingDesktopsConfigRequest, ListTerminalsBindingDesktopsConfigResponse>
     */
    public SyncInvoker<ListTerminalsBindingDesktopsConfigRequest, ListTerminalsBindingDesktopsConfigResponse> listTerminalsBindingDesktopsConfigInvoker(
        ListTerminalsBindingDesktopsConfigRequest request) {
        return new SyncInvoker<ListTerminalsBindingDesktopsConfigRequest, ListTerminalsBindingDesktopsConfigResponse>(
            request, WorkspaceMeta.listTerminalsBindingDesktopsConfig, hcClient);
    }

    /**
     * 修改终端与桌面绑定配置
     *
     * 修改终端与桌面绑定配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateTerminalsBindingDesktopsRequest 请求对象
     * @return UpdateTerminalsBindingDesktopsResponse
     */
    public UpdateTerminalsBindingDesktopsResponse updateTerminalsBindingDesktops(
        UpdateTerminalsBindingDesktopsRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.updateTerminalsBindingDesktops);
    }

    /**
     * 修改终端与桌面绑定配置
     *
     * 修改终端与桌面绑定配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateTerminalsBindingDesktopsRequest 请求对象
     * @return SyncInvoker<UpdateTerminalsBindingDesktopsRequest, UpdateTerminalsBindingDesktopsResponse>
     */
    public SyncInvoker<UpdateTerminalsBindingDesktopsRequest, UpdateTerminalsBindingDesktopsResponse> updateTerminalsBindingDesktopsInvoker(
        UpdateTerminalsBindingDesktopsRequest request) {
        return new SyncInvoker<UpdateTerminalsBindingDesktopsRequest, UpdateTerminalsBindingDesktopsResponse>(request,
            WorkspaceMeta.updateTerminalsBindingDesktops, hcClient);
    }

    /**
     * 设置终端与桌面绑定的开关配置
     *
     * 设置终端与桌面绑定的开关配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateTerminalsBindingDesktopsConfigRequest 请求对象
     * @return UpdateTerminalsBindingDesktopsConfigResponse
     */
    public UpdateTerminalsBindingDesktopsConfigResponse updateTerminalsBindingDesktopsConfig(
        UpdateTerminalsBindingDesktopsConfigRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.updateTerminalsBindingDesktopsConfig);
    }

    /**
     * 设置终端与桌面绑定的开关配置
     *
     * 设置终端与桌面绑定的开关配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateTerminalsBindingDesktopsConfigRequest 请求对象
     * @return SyncInvoker<UpdateTerminalsBindingDesktopsConfigRequest, UpdateTerminalsBindingDesktopsConfigResponse>
     */
    public SyncInvoker<UpdateTerminalsBindingDesktopsConfigRequest, UpdateTerminalsBindingDesktopsConfigResponse> updateTerminalsBindingDesktopsConfigInvoker(
        UpdateTerminalsBindingDesktopsConfigRequest request) {
        return new SyncInvoker<UpdateTerminalsBindingDesktopsConfigRequest, UpdateTerminalsBindingDesktopsConfigResponse>(
            request, WorkspaceMeta.updateTerminalsBindingDesktopsConfig, hcClient);
    }

    /**
     * 批量创建用户
     *
     * 该接口用于批量创建用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchCreateUsersRequest 请求对象
     * @return BatchCreateUsersResponse
     */
    public BatchCreateUsersResponse batchCreateUsers(BatchCreateUsersRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.batchCreateUsers);
    }

    /**
     * 批量创建用户
     *
     * 该接口用于批量创建用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchCreateUsersRequest 请求对象
     * @return SyncInvoker<BatchCreateUsersRequest, BatchCreateUsersResponse>
     */
    public SyncInvoker<BatchCreateUsersRequest, BatchCreateUsersResponse> batchCreateUsersInvoker(
        BatchCreateUsersRequest request) {
        return new SyncInvoker<BatchCreateUsersRequest, BatchCreateUsersResponse>(request,
            WorkspaceMeta.batchCreateUsers, hcClient);
    }

    /**
     * 解绑OTP设备
     *
     * 该接口用于解绑用户的OTP设备。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchDeleteOtpDevicesRequest 请求对象
     * @return BatchDeleteOtpDevicesResponse
     */
    public BatchDeleteOtpDevicesResponse batchDeleteOtpDevices(BatchDeleteOtpDevicesRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.batchDeleteOtpDevices);
    }

    /**
     * 解绑OTP设备
     *
     * 该接口用于解绑用户的OTP设备。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchDeleteOtpDevicesRequest 请求对象
     * @return SyncInvoker<BatchDeleteOtpDevicesRequest, BatchDeleteOtpDevicesResponse>
     */
    public SyncInvoker<BatchDeleteOtpDevicesRequest, BatchDeleteOtpDevicesResponse> batchDeleteOtpDevicesInvoker(
        BatchDeleteOtpDevicesRequest request) {
        return new SyncInvoker<BatchDeleteOtpDevicesRequest, BatchDeleteOtpDevicesResponse>(request,
            WorkspaceMeta.batchDeleteOtpDevices, hcClient);
    }

    /**
     * 操作用户
     *
     * 该接口用于操作用户，包含三种操作：锁定、解锁和重置密码（重置密码建议使用/v2/{project_id}/users/{user_id}/random-password接口，在没有通知方式的情况下必须使用/v2/{project_id}/users/{user_id}/random-password接口）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ChangeUserStatusRequest 请求对象
     * @return ChangeUserStatusResponse
     */
    public ChangeUserStatusResponse changeUserStatus(ChangeUserStatusRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.changeUserStatus);
    }

    /**
     * 操作用户
     *
     * 该接口用于操作用户，包含三种操作：锁定、解锁和重置密码（重置密码建议使用/v2/{project_id}/users/{user_id}/random-password接口，在没有通知方式的情况下必须使用/v2/{project_id}/users/{user_id}/random-password接口）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ChangeUserStatusRequest 请求对象
     * @return SyncInvoker<ChangeUserStatusRequest, ChangeUserStatusResponse>
     */
    public SyncInvoker<ChangeUserStatusRequest, ChangeUserStatusResponse> changeUserStatusInvoker(
        ChangeUserStatusRequest request) {
        return new SyncInvoker<ChangeUserStatusRequest, ChangeUserStatusResponse>(request,
            WorkspaceMeta.changeUserStatus, hcClient);
    }

    /**
     * 创建用户
     *
     * 该接口用于创建桌面用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateDesktopUserRequest 请求对象
     * @return CreateDesktopUserResponse
     */
    public CreateDesktopUserResponse createDesktopUser(CreateDesktopUserRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.createDesktopUser);
    }

    /**
     * 创建用户
     *
     * 该接口用于创建桌面用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateDesktopUserRequest 请求对象
     * @return SyncInvoker<CreateDesktopUserRequest, CreateDesktopUserResponse>
     */
    public SyncInvoker<CreateDesktopUserRequest, CreateDesktopUserResponse> createDesktopUserInvoker(
        CreateDesktopUserRequest request) {
        return new SyncInvoker<CreateDesktopUserRequest, CreateDesktopUserResponse>(request,
            WorkspaceMeta.createDesktopUser, hcClient);
    }

    /**
     * 删除指定用户
     *
     * 删除指定的桌面用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteUserRequest 请求对象
     * @return DeleteUserResponse
     */
    public DeleteUserResponse deleteUser(DeleteUserRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.deleteUser);
    }

    /**
     * 删除指定用户
     *
     * 删除指定的桌面用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteUserRequest 请求对象
     * @return SyncInvoker<DeleteUserRequest, DeleteUserResponse>
     */
    public SyncInvoker<DeleteUserRequest, DeleteUserResponse> deleteUserInvoker(DeleteUserRequest request) {
        return new SyncInvoker<DeleteUserRequest, DeleteUserResponse>(request, WorkspaceMeta.deleteUser, hcClient);
    }

    /**
     * 查询OTP设备
     *
     * 该接口用于查询相应用户下面的OTP设备。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListOtpDevicesByUserIdRequest 请求对象
     * @return ListOtpDevicesByUserIdResponse
     */
    public ListOtpDevicesByUserIdResponse listOtpDevicesByUserId(ListOtpDevicesByUserIdRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.listOtpDevicesByUserId);
    }

    /**
     * 查询OTP设备
     *
     * 该接口用于查询相应用户下面的OTP设备。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListOtpDevicesByUserIdRequest 请求对象
     * @return SyncInvoker<ListOtpDevicesByUserIdRequest, ListOtpDevicesByUserIdResponse>
     */
    public SyncInvoker<ListOtpDevicesByUserIdRequest, ListOtpDevicesByUserIdResponse> listOtpDevicesByUserIdInvoker(
        ListOtpDevicesByUserIdRequest request) {
        return new SyncInvoker<ListOtpDevicesByUserIdRequest, ListOtpDevicesByUserIdResponse>(request,
            WorkspaceMeta.listOtpDevicesByUserId, hcClient);
    }

    /**
     * 查询用户详情信息
     *
     * 该接口用于查询指定的桌面用户详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListUserDetailRequest 请求对象
     * @return ListUserDetailResponse
     */
    public ListUserDetailResponse listUserDetail(ListUserDetailRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.listUserDetail);
    }

    /**
     * 查询用户详情信息
     *
     * 该接口用于查询指定的桌面用户详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListUserDetailRequest 请求对象
     * @return SyncInvoker<ListUserDetailRequest, ListUserDetailResponse>
     */
    public SyncInvoker<ListUserDetailRequest, ListUserDetailResponse> listUserDetailInvoker(
        ListUserDetailRequest request) {
        return new SyncInvoker<ListUserDetailRequest, ListUserDetailResponse>(request, WorkspaceMeta.listUserDetail,
            hcClient);
    }

    /**
     * 查询用户列表
     *
     * 该接口用于查询桌面用户列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListUsersRequest 请求对象
     * @return ListUsersResponse
     */
    public ListUsersResponse listUsers(ListUsersRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.listUsers);
    }

    /**
     * 查询用户列表
     *
     * 该接口用于查询桌面用户列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListUsersRequest 请求对象
     * @return SyncInvoker<ListUsersRequest, ListUsersResponse>
     */
    public SyncInvoker<ListUsersRequest, ListUsersResponse> listUsersInvoker(ListUsersRequest request) {
        return new SyncInvoker<ListUsersRequest, ListUsersResponse>(request, WorkspaceMeta.listUsers, hcClient);
    }

    /**
     * 给用户重置随机密码
     *
     * 该接口用于给用户重置一个密码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ResetRandomPasswordRequest 请求对象
     * @return ResetRandomPasswordResponse
     */
    public ResetRandomPasswordResponse resetRandomPassword(ResetRandomPasswordRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.resetRandomPassword);
    }

    /**
     * 给用户重置随机密码
     *
     * 该接口用于给用户重置一个密码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ResetRandomPasswordRequest 请求对象
     * @return SyncInvoker<ResetRandomPasswordRequest, ResetRandomPasswordResponse>
     */
    public SyncInvoker<ResetRandomPasswordRequest, ResetRandomPasswordResponse> resetRandomPasswordInvoker(
        ResetRandomPasswordRequest request) {
        return new SyncInvoker<ResetRandomPasswordRequest, ResetRandomPasswordResponse>(request,
            WorkspaceMeta.resetRandomPassword, hcClient);
    }

    /**
     * 修改用户信息
     *
     * 该接口用于修改桌面用户信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateUserInfoRequest 请求对象
     * @return UpdateUserInfoResponse
     */
    public UpdateUserInfoResponse updateUserInfo(UpdateUserInfoRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.updateUserInfo);
    }

    /**
     * 修改用户信息
     *
     * 该接口用于修改桌面用户信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateUserInfoRequest 请求对象
     * @return SyncInvoker<UpdateUserInfoRequest, UpdateUserInfoResponse>
     */
    public SyncInvoker<UpdateUserInfoRequest, UpdateUserInfoResponse> updateUserInfoInvoker(
        UpdateUserInfoRequest request) {
        return new SyncInvoker<UpdateUserInfoRequest, UpdateUserInfoResponse>(request, WorkspaceMeta.updateUserInfo,
            hcClient);
    }

    /**
     * 增加桌面磁盘
     *
     * 增加桌面磁盘。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AddVolumesRequest 请求对象
     * @return AddVolumesResponse
     */
    public AddVolumesResponse addVolumes(AddVolumesRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.addVolumes);
    }

    /**
     * 增加桌面磁盘
     *
     * 增加桌面磁盘。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AddVolumesRequest 请求对象
     * @return SyncInvoker<AddVolumesRequest, AddVolumesResponse>
     */
    public SyncInvoker<AddVolumesRequest, AddVolumesResponse> addVolumesInvoker(AddVolumesRequest request) {
        return new SyncInvoker<AddVolumesRequest, AddVolumesResponse>(request, WorkspaceMeta.addVolumes, hcClient);
    }

    /**
     * 删除桌面数据盘
     *
     * 删除桌面数据盘，删除后无法恢复。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteDesktopVolumesRequest 请求对象
     * @return DeleteDesktopVolumesResponse
     */
    public DeleteDesktopVolumesResponse deleteDesktopVolumes(DeleteDesktopVolumesRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.deleteDesktopVolumes);
    }

    /**
     * 删除桌面数据盘
     *
     * 删除桌面数据盘，删除后无法恢复。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteDesktopVolumesRequest 请求对象
     * @return SyncInvoker<DeleteDesktopVolumesRequest, DeleteDesktopVolumesResponse>
     */
    public SyncInvoker<DeleteDesktopVolumesRequest, DeleteDesktopVolumesResponse> deleteDesktopVolumesInvoker(
        DeleteDesktopVolumesRequest request) {
        return new SyncInvoker<DeleteDesktopVolumesRequest, DeleteDesktopVolumesResponse>(request,
            WorkspaceMeta.deleteDesktopVolumes, hcClient);
    }

    /**
     * 扩容桌面磁盘
     *
     * 扩容桌面磁盘。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ExpandVolumesRequest 请求对象
     * @return ExpandVolumesResponse
     */
    public ExpandVolumesResponse expandVolumes(ExpandVolumesRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.expandVolumes);
    }

    /**
     * 扩容桌面磁盘
     *
     * 扩容桌面磁盘。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ExpandVolumesRequest 请求对象
     * @return SyncInvoker<ExpandVolumesRequest, ExpandVolumesResponse>
     */
    public SyncInvoker<ExpandVolumesRequest, ExpandVolumesResponse> expandVolumesInvoker(ExpandVolumesRequest request) {
        return new SyncInvoker<ExpandVolumesRequest, ExpandVolumesResponse>(request, WorkspaceMeta.expandVolumes,
            hcClient);
    }

    /**
     * 开通云办公服务
     *
     * 该接口用于开通云办公服务。
     * 
     * 作为异步接口，调用成功说明云办公服务后台收到了开通请求，但服务是否开通成功需要通过任务查询接口(GET /v2/{project_id}/workspace-sub-jobs)查询该任务的执行状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ApplyWorkspaceRequest 请求对象
     * @return ApplyWorkspaceResponse
     */
    public ApplyWorkspaceResponse applyWorkspace(ApplyWorkspaceRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.applyWorkspace);
    }

    /**
     * 开通云办公服务
     *
     * 该接口用于开通云办公服务。
     * 
     * 作为异步接口，调用成功说明云办公服务后台收到了开通请求，但服务是否开通成功需要通过任务查询接口(GET /v2/{project_id}/workspace-sub-jobs)查询该任务的执行状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ApplyWorkspaceRequest 请求对象
     * @return SyncInvoker<ApplyWorkspaceRequest, ApplyWorkspaceResponse>
     */
    public SyncInvoker<ApplyWorkspaceRequest, ApplyWorkspaceResponse> applyWorkspaceInvoker(
        ApplyWorkspaceRequest request) {
        return new SyncInvoker<ApplyWorkspaceRequest, ApplyWorkspaceResponse>(request, WorkspaceMeta.applyWorkspace,
            hcClient);
    }

    /**
     * 注销云办公服务
     *
     * 该接口用于注销云办公服务。注销前请确保当前用户下的云桌面已经删除，注销后无法恢复。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CancelWorkspaceRequest 请求对象
     * @return CancelWorkspaceResponse
     */
    public CancelWorkspaceResponse cancelWorkspace(CancelWorkspaceRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.cancelWorkspace);
    }

    /**
     * 注销云办公服务
     *
     * 该接口用于注销云办公服务。注销前请确保当前用户下的云桌面已经删除，注销后无法恢复。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CancelWorkspaceRequest 请求对象
     * @return SyncInvoker<CancelWorkspaceRequest, CancelWorkspaceResponse>
     */
    public SyncInvoker<CancelWorkspaceRequest, CancelWorkspaceResponse> cancelWorkspaceInvoker(
        CancelWorkspaceRequest request) {
        return new SyncInvoker<CancelWorkspaceRequest, CancelWorkspaceResponse>(request, WorkspaceMeta.cancelWorkspace,
            hcClient);
    }

    /**
     * 查询云办公服务详情
     *
     * 该接口用于查询云办公服务详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListWorkspacesRequest 请求对象
     * @return ListWorkspacesResponse
     */
    public ListWorkspacesResponse listWorkspaces(ListWorkspacesRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.listWorkspaces);
    }

    /**
     * 查询云办公服务详情
     *
     * 该接口用于查询云办公服务详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListWorkspacesRequest 请求对象
     * @return SyncInvoker<ListWorkspacesRequest, ListWorkspacesResponse>
     */
    public SyncInvoker<ListWorkspacesRequest, ListWorkspacesResponse> listWorkspacesInvoker(
        ListWorkspacesRequest request) {
        return new SyncInvoker<ListWorkspacesRequest, ListWorkspacesResponse>(request, WorkspaceMeta.listWorkspaces,
            hcClient);
    }

    /**
     * 查询云办公服务是否被锁定
     *
     * 查询云办公服务是否被锁定。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowWorkspaceLockRequest 请求对象
     * @return ShowWorkspaceLockResponse
     */
    public ShowWorkspaceLockResponse showWorkspaceLock(ShowWorkspaceLockRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.showWorkspaceLock);
    }

    /**
     * 查询云办公服务是否被锁定
     *
     * 查询云办公服务是否被锁定。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowWorkspaceLockRequest 请求对象
     * @return SyncInvoker<ShowWorkspaceLockRequest, ShowWorkspaceLockResponse>
     */
    public SyncInvoker<ShowWorkspaceLockRequest, ShowWorkspaceLockResponse> showWorkspaceLockInvoker(
        ShowWorkspaceLockRequest request) {
        return new SyncInvoker<ShowWorkspaceLockRequest, ShowWorkspaceLockResponse>(request,
            WorkspaceMeta.showWorkspaceLock, hcClient);
    }

    /**
     * 解除云办公服务锁定状态
     *
     * 该接口目前支持解除云办公服务锁定状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UnlockWorkspaceRequest 请求对象
     * @return UnlockWorkspaceResponse
     */
    public UnlockWorkspaceResponse unlockWorkspace(UnlockWorkspaceRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.unlockWorkspace);
    }

    /**
     * 解除云办公服务锁定状态
     *
     * 该接口目前支持解除云办公服务锁定状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UnlockWorkspaceRequest 请求对象
     * @return SyncInvoker<UnlockWorkspaceRequest, UnlockWorkspaceResponse>
     */
    public SyncInvoker<UnlockWorkspaceRequest, UnlockWorkspaceResponse> unlockWorkspaceInvoker(
        UnlockWorkspaceRequest request) {
        return new SyncInvoker<UnlockWorkspaceRequest, UnlockWorkspaceResponse>(request, WorkspaceMeta.unlockWorkspace,
            hcClient);
    }

    /**
     * 修改云办公服务属性
     *
     * 该接口目前支持修改云办公服务属性。单次请求仅支持修改一种属性类型。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateWorkspaceRequest 请求对象
     * @return UpdateWorkspaceResponse
     */
    public UpdateWorkspaceResponse updateWorkspace(UpdateWorkspaceRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.updateWorkspace);
    }

    /**
     * 修改云办公服务属性
     *
     * 该接口目前支持修改云办公服务属性。单次请求仅支持修改一种属性类型。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateWorkspaceRequest 请求对象
     * @return SyncInvoker<UpdateWorkspaceRequest, UpdateWorkspaceResponse>
     */
    public SyncInvoker<UpdateWorkspaceRequest, UpdateWorkspaceResponse> updateWorkspaceInvoker(
        UpdateWorkspaceRequest request) {
        return new SyncInvoker<UpdateWorkspaceRequest, UpdateWorkspaceResponse>(request, WorkspaceMeta.updateWorkspace,
            hcClient);
    }

}
