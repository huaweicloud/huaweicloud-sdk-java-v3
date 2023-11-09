package com.huaweicloud.sdk.workspace.v2;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
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

import java.util.concurrent.CompletableFuture;

public class WorkspaceAsyncClient {

    protected HcClient hcClient;

    public WorkspaceAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<WorkspaceAsyncClient> newBuilder() {
        ClientBuilder<WorkspaceAsyncClient> clientBuilder = new ClientBuilder<>(WorkspaceAsyncClient::new);
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
     * @return CompletableFuture<BatchDeleteAccessPoliciesResponse>
     */
    public CompletableFuture<BatchDeleteAccessPoliciesResponse> batchDeleteAccessPoliciesAsync(
        BatchDeleteAccessPoliciesRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.batchDeleteAccessPolicies);
    }

    /**
     * 删除接入策略
     *
     * 该接口用于删除指定接入策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchDeleteAccessPoliciesRequest 请求对象
     * @return AsyncInvoker<BatchDeleteAccessPoliciesRequest, BatchDeleteAccessPoliciesResponse>
     */
    public AsyncInvoker<BatchDeleteAccessPoliciesRequest, BatchDeleteAccessPoliciesResponse> batchDeleteAccessPoliciesAsyncInvoker(
        BatchDeleteAccessPoliciesRequest request) {
        return new AsyncInvoker<BatchDeleteAccessPoliciesRequest, BatchDeleteAccessPoliciesResponse>(request,
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
     * @return CompletableFuture<CreateAccessPolicyResponse>
     */
    public CompletableFuture<CreateAccessPolicyResponse> createAccessPolicyAsync(CreateAccessPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.createAccessPolicy);
    }

    /**
     * 创建接入策略
     *
     * 该接口用于创建接入策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateAccessPolicyRequest 请求对象
     * @return AsyncInvoker<CreateAccessPolicyRequest, CreateAccessPolicyResponse>
     */
    public AsyncInvoker<CreateAccessPolicyRequest, CreateAccessPolicyResponse> createAccessPolicyAsyncInvoker(
        CreateAccessPolicyRequest request) {
        return new AsyncInvoker<CreateAccessPolicyRequest, CreateAccessPolicyResponse>(request,
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
     * @return CompletableFuture<ListAccessPoliciesResponse>
     */
    public CompletableFuture<ListAccessPoliciesResponse> listAccessPoliciesAsync(ListAccessPoliciesRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.listAccessPolicies);
    }

    /**
     * 查询接入策略
     *
     * 该接口用于查询接入策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAccessPoliciesRequest 请求对象
     * @return AsyncInvoker<ListAccessPoliciesRequest, ListAccessPoliciesResponse>
     */
    public AsyncInvoker<ListAccessPoliciesRequest, ListAccessPoliciesResponse> listAccessPoliciesAsyncInvoker(
        ListAccessPoliciesRequest request) {
        return new AsyncInvoker<ListAccessPoliciesRequest, ListAccessPoliciesResponse>(request,
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
     * @return CompletableFuture<ListAccessPolicyObjectsResponse>
     */
    public CompletableFuture<ListAccessPolicyObjectsResponse> listAccessPolicyObjectsAsync(
        ListAccessPolicyObjectsRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.listAccessPolicyObjects);
    }

    /**
     * 查询指定接入策略的应用对象
     *
     * 该接口用于查询指定接入策略的应用对象。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAccessPolicyObjectsRequest 请求对象
     * @return AsyncInvoker<ListAccessPolicyObjectsRequest, ListAccessPolicyObjectsResponse>
     */
    public AsyncInvoker<ListAccessPolicyObjectsRequest, ListAccessPolicyObjectsResponse> listAccessPolicyObjectsAsyncInvoker(
        ListAccessPolicyObjectsRequest request) {
        return new AsyncInvoker<ListAccessPolicyObjectsRequest, ListAccessPolicyObjectsResponse>(request,
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
     * @return CompletableFuture<UpdateAccessPolicyObjectsResponse>
     */
    public CompletableFuture<UpdateAccessPolicyObjectsResponse> updateAccessPolicyObjectsAsync(
        UpdateAccessPolicyObjectsRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.updateAccessPolicyObjects);
    }

    /**
     * 更新指定接入策略的应用对象
     *
     * 该接口用于更新指定接入策略的应用对象。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateAccessPolicyObjectsRequest 请求对象
     * @return AsyncInvoker<UpdateAccessPolicyObjectsRequest, UpdateAccessPolicyObjectsResponse>
     */
    public AsyncInvoker<UpdateAccessPolicyObjectsRequest, UpdateAccessPolicyObjectsResponse> updateAccessPolicyObjectsAsyncInvoker(
        UpdateAccessPolicyObjectsRequest request) {
        return new AsyncInvoker<UpdateAccessPolicyObjectsRequest, UpdateAccessPolicyObjectsResponse>(request,
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
     * @return CompletableFuture<ShowAssistAuthConfigResponse>
     */
    public CompletableFuture<ShowAssistAuthConfigResponse> showAssistAuthConfigAsync(
        ShowAssistAuthConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.showAssistAuthConfig);
    }

    /**
     * 查询辅助认证配置
     *
     * 查询辅助认证的配置信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAssistAuthConfigRequest 请求对象
     * @return AsyncInvoker<ShowAssistAuthConfigRequest, ShowAssistAuthConfigResponse>
     */
    public AsyncInvoker<ShowAssistAuthConfigRequest, ShowAssistAuthConfigResponse> showAssistAuthConfigAsyncInvoker(
        ShowAssistAuthConfigRequest request) {
        return new AsyncInvoker<ShowAssistAuthConfigRequest, ShowAssistAuthConfigResponse>(request,
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
     * @return CompletableFuture<UpdateAssistAuthMethodConfigResponse>
     */
    public CompletableFuture<UpdateAssistAuthMethodConfigResponse> updateAssistAuthMethodConfigAsync(
        UpdateAssistAuthMethodConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.updateAssistAuthMethodConfig);
    }

    /**
     * 更新辅助认证策略配置
     *
     * 更新辅助认证策略配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateAssistAuthMethodConfigRequest 请求对象
     * @return AsyncInvoker<UpdateAssistAuthMethodConfigRequest, UpdateAssistAuthMethodConfigResponse>
     */
    public AsyncInvoker<UpdateAssistAuthMethodConfigRequest, UpdateAssistAuthMethodConfigResponse> updateAssistAuthMethodConfigAsyncInvoker(
        UpdateAssistAuthMethodConfigRequest request) {
        return new AsyncInvoker<UpdateAssistAuthMethodConfigRequest, UpdateAssistAuthMethodConfigResponse>(request,
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
     * @return CompletableFuture<ListAvailabilityZonesResponse>
     */
    public CompletableFuture<ListAvailabilityZonesResponse> listAvailabilityZonesAsync(
        ListAvailabilityZonesRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.listAvailabilityZones);
    }

    /**
     * 查询可用分区列表
     *
     * 该接口用于查询云桌面支持的可用分区列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAvailabilityZonesRequest 请求对象
     * @return AsyncInvoker<ListAvailabilityZonesRequest, ListAvailabilityZonesResponse>
     */
    public AsyncInvoker<ListAvailabilityZonesRequest, ListAvailabilityZonesResponse> listAvailabilityZonesAsyncInvoker(
        ListAvailabilityZonesRequest request) {
        return new AsyncInvoker<ListAvailabilityZonesRequest, ListAvailabilityZonesResponse>(request,
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
     * @return CompletableFuture<ExportUserLoginInfoNewResponse>
     */
    public CompletableFuture<ExportUserLoginInfoNewResponse> exportUserLoginInfoNewAsync(
        ExportUserLoginInfoNewRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.exportUserLoginInfoNew);
    }

    /**
     * 导出连接记录
     *
     * 该接口用于导出连接记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ExportUserLoginInfoNewRequest 请求对象
     * @return AsyncInvoker<ExportUserLoginInfoNewRequest, ExportUserLoginInfoNewResponse>
     */
    public AsyncInvoker<ExportUserLoginInfoNewRequest, ExportUserLoginInfoNewResponse> exportUserLoginInfoNewAsyncInvoker(
        ExportUserLoginInfoNewRequest request) {
        return new AsyncInvoker<ExportUserLoginInfoNewRequest, ExportUserLoginInfoNewResponse>(request,
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
     * @return CompletableFuture<ListHistoryOnlineInfoNewResponse>
     */
    public CompletableFuture<ListHistoryOnlineInfoNewResponse> listHistoryOnlineInfoNewAsync(
        ListHistoryOnlineInfoNewRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.listHistoryOnlineInfoNew);
    }

    /**
     * 查询登录人数
     *
     * 该接口用于查询登录人数，注意查询参数不可全空。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListHistoryOnlineInfoNewRequest 请求对象
     * @return AsyncInvoker<ListHistoryOnlineInfoNewRequest, ListHistoryOnlineInfoNewResponse>
     */
    public AsyncInvoker<ListHistoryOnlineInfoNewRequest, ListHistoryOnlineInfoNewResponse> listHistoryOnlineInfoNewAsyncInvoker(
        ListHistoryOnlineInfoNewRequest request) {
        return new AsyncInvoker<ListHistoryOnlineInfoNewRequest, ListHistoryOnlineInfoNewResponse>(request,
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
     * @return CompletableFuture<ListLoginRecordsNewResponse>
     */
    public CompletableFuture<ListLoginRecordsNewResponse> listLoginRecordsNewAsync(ListLoginRecordsNewRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.listLoginRecordsNew);
    }

    /**
     * 查询登录信息
     *
     * 该接口用于查询登录信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListLoginRecordsNewRequest 请求对象
     * @return AsyncInvoker<ListLoginRecordsNewRequest, ListLoginRecordsNewResponse>
     */
    public AsyncInvoker<ListLoginRecordsNewRequest, ListLoginRecordsNewResponse> listLoginRecordsNewAsyncInvoker(
        ListLoginRecordsNewRequest request) {
        return new AsyncInvoker<ListLoginRecordsNewRequest, ListLoginRecordsNewResponse>(request,
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
     * @return CompletableFuture<BatchDeleteDesktopsResponse>
     */
    public CompletableFuture<BatchDeleteDesktopsResponse> batchDeleteDesktopsAsync(BatchDeleteDesktopsRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.batchDeleteDesktops);
    }

    /**
     * 批量删除桌面
     *
     * 批量删除桌面，删除后无法恢复。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchDeleteDesktopsRequest 请求对象
     * @return AsyncInvoker<BatchDeleteDesktopsRequest, BatchDeleteDesktopsResponse>
     */
    public AsyncInvoker<BatchDeleteDesktopsRequest, BatchDeleteDesktopsResponse> batchDeleteDesktopsAsyncInvoker(
        BatchDeleteDesktopsRequest request) {
        return new AsyncInvoker<BatchDeleteDesktopsRequest, BatchDeleteDesktopsResponse>(request,
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
     * @return CompletableFuture<BatchLogoffDesktopsResponse>
     */
    public CompletableFuture<BatchLogoffDesktopsResponse> batchLogoffDesktopsAsync(BatchLogoffDesktopsRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.batchLogoffDesktops);
    }

    /**
     * 批量注销桌面
     *
     * 批量注销桌面。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchLogoffDesktopsRequest 请求对象
     * @return AsyncInvoker<BatchLogoffDesktopsRequest, BatchLogoffDesktopsResponse>
     */
    public AsyncInvoker<BatchLogoffDesktopsRequest, BatchLogoffDesktopsResponse> batchLogoffDesktopsAsyncInvoker(
        BatchLogoffDesktopsRequest request) {
        return new AsyncInvoker<BatchLogoffDesktopsRequest, BatchLogoffDesktopsResponse>(request,
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
     * @return CompletableFuture<BatchRebuildDesktopsSystemDiskResponse>
     */
    public CompletableFuture<BatchRebuildDesktopsSystemDiskResponse> batchRebuildDesktopsSystemDiskAsync(
        BatchRebuildDesktopsSystemDiskRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.batchRebuildDesktopsSystemDisk);
    }

    /**
     * 重建桌面
     *
     * 批量重建桌面系统盘。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchRebuildDesktopsSystemDiskRequest 请求对象
     * @return AsyncInvoker<BatchRebuildDesktopsSystemDiskRequest, BatchRebuildDesktopsSystemDiskResponse>
     */
    public AsyncInvoker<BatchRebuildDesktopsSystemDiskRequest, BatchRebuildDesktopsSystemDiskResponse> batchRebuildDesktopsSystemDiskAsyncInvoker(
        BatchRebuildDesktopsSystemDiskRequest request) {
        return new AsyncInvoker<BatchRebuildDesktopsSystemDiskRequest, BatchRebuildDesktopsSystemDiskResponse>(request,
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
     * @return CompletableFuture<BatchRunDesktopsResponse>
     */
    public CompletableFuture<BatchRunDesktopsResponse> batchRunDesktopsAsync(BatchRunDesktopsRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.batchRunDesktops);
    }

    /**
     * 操作桌面
     *
     * 批量操作桌面，用于批量开机、关机和重启。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchRunDesktopsRequest 请求对象
     * @return AsyncInvoker<BatchRunDesktopsRequest, BatchRunDesktopsResponse>
     */
    public AsyncInvoker<BatchRunDesktopsRequest, BatchRunDesktopsResponse> batchRunDesktopsAsyncInvoker(
        BatchRunDesktopsRequest request) {
        return new AsyncInvoker<BatchRunDesktopsRequest, BatchRunDesktopsResponse>(request,
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
     * @return CompletableFuture<ChangeDesktopNetworkResponse>
     */
    public CompletableFuture<ChangeDesktopNetworkResponse> changeDesktopNetworkAsync(
        ChangeDesktopNetworkRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.changeDesktopNetwork);
    }

    /**
     * 切换桌面网络
     *
     * 切换桌面vpc、子网、ip、安全组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ChangeDesktopNetworkRequest 请求对象
     * @return AsyncInvoker<ChangeDesktopNetworkRequest, ChangeDesktopNetworkResponse>
     */
    public AsyncInvoker<ChangeDesktopNetworkRequest, ChangeDesktopNetworkResponse> changeDesktopNetworkAsyncInvoker(
        ChangeDesktopNetworkRequest request) {
        return new AsyncInvoker<ChangeDesktopNetworkRequest, ChangeDesktopNetworkResponse>(request,
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
     * @return CompletableFuture<CreateDesktopResponse>
     */
    public CompletableFuture<CreateDesktopResponse> createDesktopAsync(CreateDesktopRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.createDesktop);
    }

    /**
     * 创建桌面
     *
     * 创建桌面，并将此桌面分配给用户，当桌面创建成功后用户可以登录使用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateDesktopRequest 请求对象
     * @return AsyncInvoker<CreateDesktopRequest, CreateDesktopResponse>
     */
    public AsyncInvoker<CreateDesktopRequest, CreateDesktopResponse> createDesktopAsyncInvoker(
        CreateDesktopRequest request) {
        return new AsyncInvoker<CreateDesktopRequest, CreateDesktopResponse>(request, WorkspaceMeta.createDesktop,
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
     * @return CompletableFuture<DeleteDesktopResponse>
     */
    public CompletableFuture<DeleteDesktopResponse> deleteDesktopAsync(DeleteDesktopRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.deleteDesktop);
    }

    /**
     * 删除单个桌面
     *
     * 删除单个桌面，删除后无法恢复。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteDesktopRequest 请求对象
     * @return AsyncInvoker<DeleteDesktopRequest, DeleteDesktopResponse>
     */
    public AsyncInvoker<DeleteDesktopRequest, DeleteDesktopResponse> deleteDesktopAsyncInvoker(
        DeleteDesktopRequest request) {
        return new AsyncInvoker<DeleteDesktopRequest, DeleteDesktopResponse>(request, WorkspaceMeta.deleteDesktop,
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
     * @return CompletableFuture<ListDesktopsResponse>
     */
    public CompletableFuture<ListDesktopsResponse> listDesktopsAsync(ListDesktopsRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.listDesktops);
    }

    /**
     * 查询桌面列表
     *
     * 该接口用于查询桌面虚拟机列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDesktopsRequest 请求对象
     * @return AsyncInvoker<ListDesktopsRequest, ListDesktopsResponse>
     */
    public AsyncInvoker<ListDesktopsRequest, ListDesktopsResponse> listDesktopsAsyncInvoker(
        ListDesktopsRequest request) {
        return new AsyncInvoker<ListDesktopsRequest, ListDesktopsResponse>(request, WorkspaceMeta.listDesktops,
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
     * @return CompletableFuture<ListDesktopsDetailResponse>
     */
    public CompletableFuture<ListDesktopsDetailResponse> listDesktopsDetailAsync(ListDesktopsDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.listDesktopsDetail);
    }

    /**
     * 查询桌面详情列表
     *
     * 查询桌面详情信息列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDesktopsDetailRequest 请求对象
     * @return AsyncInvoker<ListDesktopsDetailRequest, ListDesktopsDetailResponse>
     */
    public AsyncInvoker<ListDesktopsDetailRequest, ListDesktopsDetailResponse> listDesktopsDetailAsyncInvoker(
        ListDesktopsDetailRequest request) {
        return new AsyncInvoker<ListDesktopsDetailRequest, ListDesktopsDetailResponse>(request,
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
     * @return CompletableFuture<ResizeDesktopResponse>
     */
    public CompletableFuture<ResizeDesktopResponse> resizeDesktopAsync(ResizeDesktopRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.resizeDesktop);
    }

    /**
     * 变更规格
     *
     * 变更云桌面规格，只支持变更CPU和内存，不支持变更磁盘，不支持同规格互相变更。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ResizeDesktopRequest 请求对象
     * @return AsyncInvoker<ResizeDesktopRequest, ResizeDesktopResponse>
     */
    public AsyncInvoker<ResizeDesktopRequest, ResizeDesktopResponse> resizeDesktopAsyncInvoker(
        ResizeDesktopRequest request) {
        return new AsyncInvoker<ResizeDesktopRequest, ResizeDesktopResponse>(request, WorkspaceMeta.resizeDesktop,
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
     * @return CompletableFuture<ShowDesktopDetailResponse>
     */
    public CompletableFuture<ShowDesktopDetailResponse> showDesktopDetailAsync(ShowDesktopDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.showDesktopDetail);
    }

    /**
     * 查询单个桌面详情
     *
     * 指定桌面Id查询详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDesktopDetailRequest 请求对象
     * @return AsyncInvoker<ShowDesktopDetailRequest, ShowDesktopDetailResponse>
     */
    public AsyncInvoker<ShowDesktopDetailRequest, ShowDesktopDetailResponse> showDesktopDetailAsyncInvoker(
        ShowDesktopDetailRequest request) {
        return new AsyncInvoker<ShowDesktopDetailRequest, ShowDesktopDetailResponse>(request,
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
     * @return CompletableFuture<ShowDesktopNetworkResponse>
     */
    public CompletableFuture<ShowDesktopNetworkResponse> showDesktopNetworkAsync(ShowDesktopNetworkRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.showDesktopNetwork);
    }

    /**
     * 查询桌面网络
     *
     * 查询桌面vpc、子网、privateIp、EIP、安全组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDesktopNetworkRequest 请求对象
     * @return AsyncInvoker<ShowDesktopNetworkRequest, ShowDesktopNetworkResponse>
     */
    public AsyncInvoker<ShowDesktopNetworkRequest, ShowDesktopNetworkResponse> showDesktopNetworkAsyncInvoker(
        ShowDesktopNetworkRequest request) {
        return new AsyncInvoker<ShowDesktopNetworkRequest, ShowDesktopNetworkResponse>(request,
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
     * @return CompletableFuture<ListUnusedDesktopsResponse>
     */
    public CompletableFuture<ListUnusedDesktopsResponse> listUnusedDesktopsAsync(ListUnusedDesktopsRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.listUnusedDesktops);
    }

    /**
     * 查询在指定时间段未使用的桌面
     *
     * 查询在指定时间段未使用的桌面。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListUnusedDesktopsRequest 请求对象
     * @return AsyncInvoker<ListUnusedDesktopsRequest, ListUnusedDesktopsResponse>
     */
    public AsyncInvoker<ListUnusedDesktopsRequest, ListUnusedDesktopsResponse> listUnusedDesktopsAsyncInvoker(
        ListUnusedDesktopsRequest request) {
        return new AsyncInvoker<ListUnusedDesktopsRequest, ListUnusedDesktopsResponse>(request,
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
     * @return CompletableFuture<ListUsedDesktopInfoResponse>
     */
    public CompletableFuture<ListUsedDesktopInfoResponse> listUsedDesktopInfoAsync(ListUsedDesktopInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.listUsedDesktopInfo);
    }

    /**
     * 查询使用桌面的时长
     *
     * 查询使用桌面的时长。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListUsedDesktopInfoRequest 请求对象
     * @return AsyncInvoker<ListUsedDesktopInfoRequest, ListUsedDesktopInfoResponse>
     */
    public AsyncInvoker<ListUsedDesktopInfoRequest, ListUsedDesktopInfoResponse> listUsedDesktopInfoAsyncInvoker(
        ListUsedDesktopInfoRequest request) {
        return new AsyncInvoker<ListUsedDesktopInfoRequest, ListUsedDesktopInfoResponse>(request,
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
     * @return CompletableFuture<BatchChangeTagsResponse>
     */
    public CompletableFuture<BatchChangeTagsResponse> batchChangeTagsAsync(BatchChangeTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.batchChangeTags);
    }

    /**
     * 批量添加删除标签
     *
     * 为指定桌面批量添加或删除标签。创建时，如果创建的标签已经存在（key相同），则覆盖。删除时，如果删除的标签不存在，默认处理成功
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchChangeTagsRequest 请求对象
     * @return AsyncInvoker<BatchChangeTagsRequest, BatchChangeTagsResponse>
     */
    public AsyncInvoker<BatchChangeTagsRequest, BatchChangeTagsResponse> batchChangeTagsAsyncInvoker(
        BatchChangeTagsRequest request) {
        return new AsyncInvoker<BatchChangeTagsRequest, BatchChangeTagsResponse>(request, WorkspaceMeta.batchChangeTags,
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
     * @return CompletableFuture<CreateTagResponse>
     */
    public CompletableFuture<CreateTagResponse> createTagAsync(CreateTagRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.createTag);
    }

    /**
     * 创建桌面标签
     *
     * 该接口用于为桌面创建标签，一个桌面上最多有10个标签。创建时，如果创建的标签已经存在（key相同），则覆盖。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateTagRequest 请求对象
     * @return AsyncInvoker<CreateTagRequest, CreateTagResponse>
     */
    public AsyncInvoker<CreateTagRequest, CreateTagResponse> createTagAsyncInvoker(CreateTagRequest request) {
        return new AsyncInvoker<CreateTagRequest, CreateTagResponse>(request, WorkspaceMeta.createTag, hcClient);
    }

    /**
     * 删除桌面标签
     *
     * 该接口用于删除桌面标签。删除时，如果删除的标签不存在，默认处理成功。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteTagRequest 请求对象
     * @return CompletableFuture<DeleteTagResponse>
     */
    public CompletableFuture<DeleteTagResponse> deleteTagAsync(DeleteTagRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.deleteTag);
    }

    /**
     * 删除桌面标签
     *
     * 该接口用于删除桌面标签。删除时，如果删除的标签不存在，默认处理成功。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteTagRequest 请求对象
     * @return AsyncInvoker<DeleteTagRequest, DeleteTagResponse>
     */
    public AsyncInvoker<DeleteTagRequest, DeleteTagResponse> deleteTagAsyncInvoker(DeleteTagRequest request) {
        return new AsyncInvoker<DeleteTagRequest, DeleteTagResponse>(request, WorkspaceMeta.deleteTag, hcClient);
    }

    /**
     * 使用标签过滤桌面
     *
     * 使用标签过滤桌面
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDesktopByTagsRequest 请求对象
     * @return CompletableFuture<ListDesktopByTagsResponse>
     */
    public CompletableFuture<ListDesktopByTagsResponse> listDesktopByTagsAsync(ListDesktopByTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.listDesktopByTags);
    }

    /**
     * 使用标签过滤桌面
     *
     * 使用标签过滤桌面
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDesktopByTagsRequest 请求对象
     * @return AsyncInvoker<ListDesktopByTagsRequest, ListDesktopByTagsResponse>
     */
    public AsyncInvoker<ListDesktopByTagsRequest, ListDesktopByTagsResponse> listDesktopByTagsAsyncInvoker(
        ListDesktopByTagsRequest request) {
        return new AsyncInvoker<ListDesktopByTagsRequest, ListDesktopByTagsResponse>(request,
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
     * @return CompletableFuture<ListProjectTagsResponse>
     */
    public CompletableFuture<ListProjectTagsResponse> listProjectTagsAsync(ListProjectTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.listProjectTags);
    }

    /**
     * 查询项目标签
     *
     * 查询租户的所有标签集合
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListProjectTagsRequest 请求对象
     * @return AsyncInvoker<ListProjectTagsRequest, ListProjectTagsResponse>
     */
    public AsyncInvoker<ListProjectTagsRequest, ListProjectTagsResponse> listProjectTagsAsyncInvoker(
        ListProjectTagsRequest request) {
        return new AsyncInvoker<ListProjectTagsRequest, ListProjectTagsResponse>(request, WorkspaceMeta.listProjectTags,
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
     * @return CompletableFuture<ShowTagByDesktopIdResponse>
     */
    public CompletableFuture<ShowTagByDesktopIdResponse> showTagByDesktopIdAsync(ShowTagByDesktopIdRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.showTagByDesktopId);
    }

    /**
     * 查询桌面标签
     *
     * 查询指定桌面的标签信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowTagByDesktopIdRequest 请求对象
     * @return AsyncInvoker<ShowTagByDesktopIdRequest, ShowTagByDesktopIdResponse>
     */
    public AsyncInvoker<ShowTagByDesktopIdRequest, ShowTagByDesktopIdResponse> showTagByDesktopIdAsyncInvoker(
        ShowTagByDesktopIdRequest request) {
        return new AsyncInvoker<ShowTagByDesktopIdRequest, ShowTagByDesktopIdResponse>(request,
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
     * @return CompletableFuture<BatchDeleteUserGroupsResponse>
     */
    public CompletableFuture<BatchDeleteUserGroupsResponse> batchDeleteUserGroupsAsync(
        BatchDeleteUserGroupsRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.batchDeleteUserGroups);
    }

    /**
     * 批量删除用户组
     *
     * 该接口用于批量删除用户组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchDeleteUserGroupsRequest 请求对象
     * @return AsyncInvoker<BatchDeleteUserGroupsRequest, BatchDeleteUserGroupsResponse>
     */
    public AsyncInvoker<BatchDeleteUserGroupsRequest, BatchDeleteUserGroupsResponse> batchDeleteUserGroupsAsyncInvoker(
        BatchDeleteUserGroupsRequest request) {
        return new AsyncInvoker<BatchDeleteUserGroupsRequest, BatchDeleteUserGroupsResponse>(request,
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
     * @return CompletableFuture<CreateUserGroupResponse>
     */
    public CompletableFuture<CreateUserGroupResponse> createUserGroupAsync(CreateUserGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.createUserGroup);
    }

    /**
     * 创建用户组
     *
     * 该接口用于创建用户组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateUserGroupRequest 请求对象
     * @return AsyncInvoker<CreateUserGroupRequest, CreateUserGroupResponse>
     */
    public AsyncInvoker<CreateUserGroupRequest, CreateUserGroupResponse> createUserGroupAsyncInvoker(
        CreateUserGroupRequest request) {
        return new AsyncInvoker<CreateUserGroupRequest, CreateUserGroupResponse>(request, WorkspaceMeta.createUserGroup,
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
     * @return CompletableFuture<DeleteUserGroupResponse>
     */
    public CompletableFuture<DeleteUserGroupResponse> deleteUserGroupAsync(DeleteUserGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.deleteUserGroup);
    }

    /**
     * 删除用户组
     *
     * 删除用户组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteUserGroupRequest 请求对象
     * @return AsyncInvoker<DeleteUserGroupRequest, DeleteUserGroupResponse>
     */
    public AsyncInvoker<DeleteUserGroupRequest, DeleteUserGroupResponse> deleteUserGroupAsyncInvoker(
        DeleteUserGroupRequest request) {
        return new AsyncInvoker<DeleteUserGroupRequest, DeleteUserGroupResponse>(request, WorkspaceMeta.deleteUserGroup,
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
     * @return CompletableFuture<ListUserGroupsResponse>
     */
    public CompletableFuture<ListUserGroupsResponse> listUserGroupsAsync(ListUserGroupsRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.listUserGroups);
    }

    /**
     * 查询用户组列表
     *
     * 查询用户组列表，支持分页。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListUserGroupsRequest 请求对象
     * @return AsyncInvoker<ListUserGroupsRequest, ListUserGroupsResponse>
     */
    public AsyncInvoker<ListUserGroupsRequest, ListUserGroupsResponse> listUserGroupsAsyncInvoker(
        ListUserGroupsRequest request) {
        return new AsyncInvoker<ListUserGroupsRequest, ListUserGroupsResponse>(request, WorkspaceMeta.listUserGroups,
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
     * @return CompletableFuture<ListUsersOfGroupResponse>
     */
    public CompletableFuture<ListUsersOfGroupResponse> listUsersOfGroupAsync(ListUsersOfGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.listUsersOfGroup);
    }

    /**
     * 查询用户组中的用户
     *
     * 该接口用于查询用户组中的用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListUsersOfGroupRequest 请求对象
     * @return AsyncInvoker<ListUsersOfGroupRequest, ListUsersOfGroupResponse>
     */
    public AsyncInvoker<ListUsersOfGroupRequest, ListUsersOfGroupResponse> listUsersOfGroupAsyncInvoker(
        ListUsersOfGroupRequest request) {
        return new AsyncInvoker<ListUsersOfGroupRequest, ListUsersOfGroupResponse>(request,
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
     * @return CompletableFuture<RunActionsOnGroupResponse>
     */
    public CompletableFuture<RunActionsOnGroupResponse> runActionsOnGroupAsync(RunActionsOnGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.runActionsOnGroup);
    }

    /**
     * 操作用户组
     *
     * 操作用户组，如添加用户、删除用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RunActionsOnGroupRequest 请求对象
     * @return AsyncInvoker<RunActionsOnGroupRequest, RunActionsOnGroupResponse>
     */
    public AsyncInvoker<RunActionsOnGroupRequest, RunActionsOnGroupResponse> runActionsOnGroupAsyncInvoker(
        RunActionsOnGroupRequest request) {
        return new AsyncInvoker<RunActionsOnGroupRequest, RunActionsOnGroupResponse>(request,
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
     * @return CompletableFuture<UpdateUserGroupResponse>
     */
    public CompletableFuture<UpdateUserGroupResponse> updateUserGroupAsync(UpdateUserGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.updateUserGroup);
    }

    /**
     * 修改用户组信息
     *
     * 该接口用于修改用户组信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateUserGroupRequest 请求对象
     * @return AsyncInvoker<UpdateUserGroupRequest, UpdateUserGroupResponse>
     */
    public AsyncInvoker<UpdateUserGroupRequest, UpdateUserGroupResponse> updateUserGroupAsyncInvoker(
        UpdateUserGroupRequest request) {
        return new AsyncInvoker<UpdateUserGroupRequest, UpdateUserGroupResponse>(request, WorkspaceMeta.updateUserGroup,
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
     * @return CompletableFuture<ListImagesResponse>
     */
    public CompletableFuture<ListImagesResponse> listImagesAsync(ListImagesRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.listImages);
    }

    /**
     * 查询产品镜像列表
     *
     * 该接口用于查询云桌面支持的产品镜像列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListImagesRequest 请求对象
     * @return AsyncInvoker<ListImagesRequest, ListImagesResponse>
     */
    public AsyncInvoker<ListImagesRequest, ListImagesResponse> listImagesAsyncInvoker(ListImagesRequest request) {
        return new AsyncInvoker<ListImagesRequest, ListImagesResponse>(request, WorkspaceMeta.listImages, hcClient);
    }

    /**
     * 子任务查询
     *
     * 该接口用于查询异步任务执行情况，比如查询创建桌面的执行状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListItaSubJobsRequest 请求对象
     * @return CompletableFuture<ListItaSubJobsResponse>
     */
    public CompletableFuture<ListItaSubJobsResponse> listItaSubJobsAsync(ListItaSubJobsRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.listItaSubJobs);
    }

    /**
     * 子任务查询
     *
     * 该接口用于查询异步任务执行情况，比如查询创建桌面的执行状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListItaSubJobsRequest 请求对象
     * @return AsyncInvoker<ListItaSubJobsRequest, ListItaSubJobsResponse>
     */
    public AsyncInvoker<ListItaSubJobsRequest, ListItaSubJobsResponse> listItaSubJobsAsyncInvoker(
        ListItaSubJobsRequest request) {
        return new AsyncInvoker<ListItaSubJobsRequest, ListItaSubJobsResponse>(request, WorkspaceMeta.listItaSubJobs,
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
     * @return CompletableFuture<ApplyDesktopsInternetResponse>
     */
    public CompletableFuture<ApplyDesktopsInternetResponse> applyDesktopsInternetAsync(
        ApplyDesktopsInternetRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.applyDesktopsInternet);
    }

    /**
     * 开通桌面上网功能
     *
     * 开通桌面上网功能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ApplyDesktopsInternetRequest 请求对象
     * @return AsyncInvoker<ApplyDesktopsInternetRequest, ApplyDesktopsInternetResponse>
     */
    public AsyncInvoker<ApplyDesktopsInternetRequest, ApplyDesktopsInternetResponse> applyDesktopsInternetAsyncInvoker(
        ApplyDesktopsInternetRequest request) {
        return new AsyncInvoker<ApplyDesktopsInternetRequest, ApplyDesktopsInternetResponse>(request,
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
     * @return CompletableFuture<AssociateDesktopsEipResponse>
     */
    public CompletableFuture<AssociateDesktopsEipResponse> associateDesktopsEipAsync(
        AssociateDesktopsEipRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.associateDesktopsEip);
    }

    /**
     * 桌面绑定EIP
     *
     * 桌面绑定EIP。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AssociateDesktopsEipRequest 请求对象
     * @return AsyncInvoker<AssociateDesktopsEipRequest, AssociateDesktopsEipResponse>
     */
    public AsyncInvoker<AssociateDesktopsEipRequest, AssociateDesktopsEipResponse> associateDesktopsEipAsyncInvoker(
        AssociateDesktopsEipRequest request) {
        return new AsyncInvoker<AssociateDesktopsEipRequest, AssociateDesktopsEipResponse>(request,
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
     * @return CompletableFuture<BatchDisassociateDesktopsEipResponse>
     */
    public CompletableFuture<BatchDisassociateDesktopsEipResponse> batchDisassociateDesktopsEipAsync(
        BatchDisassociateDesktopsEipRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.batchDisassociateDesktopsEip);
    }

    /**
     * 批量桌面解绑EIP
     *
     * 批量桌面解绑EIP。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchDisassociateDesktopsEipRequest 请求对象
     * @return AsyncInvoker<BatchDisassociateDesktopsEipRequest, BatchDisassociateDesktopsEipResponse>
     */
    public AsyncInvoker<BatchDisassociateDesktopsEipRequest, BatchDisassociateDesktopsEipResponse> batchDisassociateDesktopsEipAsyncInvoker(
        BatchDisassociateDesktopsEipRequest request) {
        return new AsyncInvoker<BatchDisassociateDesktopsEipRequest, BatchDisassociateDesktopsEipResponse>(request,
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
     * @return CompletableFuture<ListDesktopsEipsResponse>
     */
    public CompletableFuture<ListDesktopsEipsResponse> listDesktopsEipsAsync(ListDesktopsEipsRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.listDesktopsEips);
    }

    /**
     * 查询已绑定桌面和未绑定的Eip
     *
     * 查询已绑定桌面和未绑定的Eip。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDesktopsEipsRequest 请求对象
     * @return AsyncInvoker<ListDesktopsEipsRequest, ListDesktopsEipsResponse>
     */
    public AsyncInvoker<ListDesktopsEipsRequest, ListDesktopsEipsResponse> listDesktopsEipsAsyncInvoker(
        ListDesktopsEipsRequest request) {
        return new AsyncInvoker<ListDesktopsEipsRequest, ListDesktopsEipsResponse>(request,
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
     * @return CompletableFuture<ListProductsResponse>
     */
    public CompletableFuture<ListProductsResponse> listProductsAsync(ListProductsRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.listProducts);
    }

    /**
     * 查询产品套餐列表
     *
     * 该接口用于查询云桌面支持的产品套餐列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListProductsRequest 请求对象
     * @return AsyncInvoker<ListProductsRequest, ListProductsResponse>
     */
    public AsyncInvoker<ListProductsRequest, ListProductsResponse> listProductsAsyncInvoker(
        ListProductsRequest request) {
        return new AsyncInvoker<ListProductsRequest, ListProductsResponse>(request, WorkspaceMeta.listProducts,
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
     * @return CompletableFuture<ShowQuotasResponse>
     */
    public CompletableFuture<ShowQuotasResponse> showQuotasAsync(ShowQuotasRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.showQuotas);
    }

    /**
     * 查询租户配额
     *
     * Console Framework和WKSDesktopManager调用该接口查询租户配额。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowQuotasRequest 请求对象
     * @return AsyncInvoker<ShowQuotasRequest, ShowQuotasResponse>
     */
    public AsyncInvoker<ShowQuotasRequest, ShowQuotasResponse> showQuotasAsyncInvoker(ShowQuotasRequest request) {
        return new AsyncInvoker<ShowQuotasRequest, ShowQuotasResponse>(request, WorkspaceMeta.showQuotas, hcClient);
    }

    /**
     * 增加终端与桌面绑定配置
     *
     * 增加终端与桌面绑定配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateTerminalsBindingDesktopsRequest 请求对象
     * @return CompletableFuture<CreateTerminalsBindingDesktopsResponse>
     */
    public CompletableFuture<CreateTerminalsBindingDesktopsResponse> createTerminalsBindingDesktopsAsync(
        CreateTerminalsBindingDesktopsRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.createTerminalsBindingDesktops);
    }

    /**
     * 增加终端与桌面绑定配置
     *
     * 增加终端与桌面绑定配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateTerminalsBindingDesktopsRequest 请求对象
     * @return AsyncInvoker<CreateTerminalsBindingDesktopsRequest, CreateTerminalsBindingDesktopsResponse>
     */
    public AsyncInvoker<CreateTerminalsBindingDesktopsRequest, CreateTerminalsBindingDesktopsResponse> createTerminalsBindingDesktopsAsyncInvoker(
        CreateTerminalsBindingDesktopsRequest request) {
        return new AsyncInvoker<CreateTerminalsBindingDesktopsRequest, CreateTerminalsBindingDesktopsResponse>(request,
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
     * @return CompletableFuture<DeleteTerminalsBindingDesktopsResponse>
     */
    public CompletableFuture<DeleteTerminalsBindingDesktopsResponse> deleteTerminalsBindingDesktopsAsync(
        DeleteTerminalsBindingDesktopsRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.deleteTerminalsBindingDesktops);
    }

    /**
     * 删除终端与桌面绑定配置
     *
     * 删除终端与桌面绑定配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteTerminalsBindingDesktopsRequest 请求对象
     * @return AsyncInvoker<DeleteTerminalsBindingDesktopsRequest, DeleteTerminalsBindingDesktopsResponse>
     */
    public AsyncInvoker<DeleteTerminalsBindingDesktopsRequest, DeleteTerminalsBindingDesktopsResponse> deleteTerminalsBindingDesktopsAsyncInvoker(
        DeleteTerminalsBindingDesktopsRequest request) {
        return new AsyncInvoker<DeleteTerminalsBindingDesktopsRequest, DeleteTerminalsBindingDesktopsResponse>(request,
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
     * @return CompletableFuture<ListTerminalsBindingDesktopsResponse>
     */
    public CompletableFuture<ListTerminalsBindingDesktopsResponse> listTerminalsBindingDesktopsAsync(
        ListTerminalsBindingDesktopsRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.listTerminalsBindingDesktops);
    }

    /**
     * 查询终端与桌面绑定配置列表
     *
     * 查询终端与桌面绑定配置列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTerminalsBindingDesktopsRequest 请求对象
     * @return AsyncInvoker<ListTerminalsBindingDesktopsRequest, ListTerminalsBindingDesktopsResponse>
     */
    public AsyncInvoker<ListTerminalsBindingDesktopsRequest, ListTerminalsBindingDesktopsResponse> listTerminalsBindingDesktopsAsyncInvoker(
        ListTerminalsBindingDesktopsRequest request) {
        return new AsyncInvoker<ListTerminalsBindingDesktopsRequest, ListTerminalsBindingDesktopsResponse>(request,
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
     * @return CompletableFuture<ListTerminalsBindingDesktopsConfigResponse>
     */
    public CompletableFuture<ListTerminalsBindingDesktopsConfigResponse> listTerminalsBindingDesktopsConfigAsync(
        ListTerminalsBindingDesktopsConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.listTerminalsBindingDesktopsConfig);
    }

    /**
     * 查询终端与桌面绑定的开关配置信息
     *
     * 查询终端与桌面绑定的开关配置信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTerminalsBindingDesktopsConfigRequest 请求对象
     * @return AsyncInvoker<ListTerminalsBindingDesktopsConfigRequest, ListTerminalsBindingDesktopsConfigResponse>
     */
    public AsyncInvoker<ListTerminalsBindingDesktopsConfigRequest, ListTerminalsBindingDesktopsConfigResponse> listTerminalsBindingDesktopsConfigAsyncInvoker(
        ListTerminalsBindingDesktopsConfigRequest request) {
        return new AsyncInvoker<ListTerminalsBindingDesktopsConfigRequest, ListTerminalsBindingDesktopsConfigResponse>(
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
     * @return CompletableFuture<UpdateTerminalsBindingDesktopsResponse>
     */
    public CompletableFuture<UpdateTerminalsBindingDesktopsResponse> updateTerminalsBindingDesktopsAsync(
        UpdateTerminalsBindingDesktopsRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.updateTerminalsBindingDesktops);
    }

    /**
     * 修改终端与桌面绑定配置
     *
     * 修改终端与桌面绑定配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateTerminalsBindingDesktopsRequest 请求对象
     * @return AsyncInvoker<UpdateTerminalsBindingDesktopsRequest, UpdateTerminalsBindingDesktopsResponse>
     */
    public AsyncInvoker<UpdateTerminalsBindingDesktopsRequest, UpdateTerminalsBindingDesktopsResponse> updateTerminalsBindingDesktopsAsyncInvoker(
        UpdateTerminalsBindingDesktopsRequest request) {
        return new AsyncInvoker<UpdateTerminalsBindingDesktopsRequest, UpdateTerminalsBindingDesktopsResponse>(request,
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
     * @return CompletableFuture<UpdateTerminalsBindingDesktopsConfigResponse>
     */
    public CompletableFuture<UpdateTerminalsBindingDesktopsConfigResponse> updateTerminalsBindingDesktopsConfigAsync(
        UpdateTerminalsBindingDesktopsConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.updateTerminalsBindingDesktopsConfig);
    }

    /**
     * 设置终端与桌面绑定的开关配置
     *
     * 设置终端与桌面绑定的开关配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateTerminalsBindingDesktopsConfigRequest 请求对象
     * @return AsyncInvoker<UpdateTerminalsBindingDesktopsConfigRequest, UpdateTerminalsBindingDesktopsConfigResponse>
     */
    public AsyncInvoker<UpdateTerminalsBindingDesktopsConfigRequest, UpdateTerminalsBindingDesktopsConfigResponse> updateTerminalsBindingDesktopsConfigAsyncInvoker(
        UpdateTerminalsBindingDesktopsConfigRequest request) {
        return new AsyncInvoker<UpdateTerminalsBindingDesktopsConfigRequest, UpdateTerminalsBindingDesktopsConfigResponse>(
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
     * @return CompletableFuture<BatchCreateUsersResponse>
     */
    public CompletableFuture<BatchCreateUsersResponse> batchCreateUsersAsync(BatchCreateUsersRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.batchCreateUsers);
    }

    /**
     * 批量创建用户
     *
     * 该接口用于批量创建用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchCreateUsersRequest 请求对象
     * @return AsyncInvoker<BatchCreateUsersRequest, BatchCreateUsersResponse>
     */
    public AsyncInvoker<BatchCreateUsersRequest, BatchCreateUsersResponse> batchCreateUsersAsyncInvoker(
        BatchCreateUsersRequest request) {
        return new AsyncInvoker<BatchCreateUsersRequest, BatchCreateUsersResponse>(request,
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
     * @return CompletableFuture<BatchDeleteOtpDevicesResponse>
     */
    public CompletableFuture<BatchDeleteOtpDevicesResponse> batchDeleteOtpDevicesAsync(
        BatchDeleteOtpDevicesRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.batchDeleteOtpDevices);
    }

    /**
     * 解绑OTP设备
     *
     * 该接口用于解绑用户的OTP设备。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchDeleteOtpDevicesRequest 请求对象
     * @return AsyncInvoker<BatchDeleteOtpDevicesRequest, BatchDeleteOtpDevicesResponse>
     */
    public AsyncInvoker<BatchDeleteOtpDevicesRequest, BatchDeleteOtpDevicesResponse> batchDeleteOtpDevicesAsyncInvoker(
        BatchDeleteOtpDevicesRequest request) {
        return new AsyncInvoker<BatchDeleteOtpDevicesRequest, BatchDeleteOtpDevicesResponse>(request,
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
     * @return CompletableFuture<ChangeUserStatusResponse>
     */
    public CompletableFuture<ChangeUserStatusResponse> changeUserStatusAsync(ChangeUserStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.changeUserStatus);
    }

    /**
     * 操作用户
     *
     * 该接口用于操作用户，包含三种操作：锁定、解锁和重置密码（重置密码建议使用/v2/{project_id}/users/{user_id}/random-password接口，在没有通知方式的情况下必须使用/v2/{project_id}/users/{user_id}/random-password接口）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ChangeUserStatusRequest 请求对象
     * @return AsyncInvoker<ChangeUserStatusRequest, ChangeUserStatusResponse>
     */
    public AsyncInvoker<ChangeUserStatusRequest, ChangeUserStatusResponse> changeUserStatusAsyncInvoker(
        ChangeUserStatusRequest request) {
        return new AsyncInvoker<ChangeUserStatusRequest, ChangeUserStatusResponse>(request,
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
     * @return CompletableFuture<CreateDesktopUserResponse>
     */
    public CompletableFuture<CreateDesktopUserResponse> createDesktopUserAsync(CreateDesktopUserRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.createDesktopUser);
    }

    /**
     * 创建用户
     *
     * 该接口用于创建桌面用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateDesktopUserRequest 请求对象
     * @return AsyncInvoker<CreateDesktopUserRequest, CreateDesktopUserResponse>
     */
    public AsyncInvoker<CreateDesktopUserRequest, CreateDesktopUserResponse> createDesktopUserAsyncInvoker(
        CreateDesktopUserRequest request) {
        return new AsyncInvoker<CreateDesktopUserRequest, CreateDesktopUserResponse>(request,
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
     * @return CompletableFuture<DeleteUserResponse>
     */
    public CompletableFuture<DeleteUserResponse> deleteUserAsync(DeleteUserRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.deleteUser);
    }

    /**
     * 删除指定用户
     *
     * 删除指定的桌面用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteUserRequest 请求对象
     * @return AsyncInvoker<DeleteUserRequest, DeleteUserResponse>
     */
    public AsyncInvoker<DeleteUserRequest, DeleteUserResponse> deleteUserAsyncInvoker(DeleteUserRequest request) {
        return new AsyncInvoker<DeleteUserRequest, DeleteUserResponse>(request, WorkspaceMeta.deleteUser, hcClient);
    }

    /**
     * 查询OTP设备
     *
     * 该接口用于查询相应用户下面的OTP设备。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListOtpDevicesByUserIdRequest 请求对象
     * @return CompletableFuture<ListOtpDevicesByUserIdResponse>
     */
    public CompletableFuture<ListOtpDevicesByUserIdResponse> listOtpDevicesByUserIdAsync(
        ListOtpDevicesByUserIdRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.listOtpDevicesByUserId);
    }

    /**
     * 查询OTP设备
     *
     * 该接口用于查询相应用户下面的OTP设备。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListOtpDevicesByUserIdRequest 请求对象
     * @return AsyncInvoker<ListOtpDevicesByUserIdRequest, ListOtpDevicesByUserIdResponse>
     */
    public AsyncInvoker<ListOtpDevicesByUserIdRequest, ListOtpDevicesByUserIdResponse> listOtpDevicesByUserIdAsyncInvoker(
        ListOtpDevicesByUserIdRequest request) {
        return new AsyncInvoker<ListOtpDevicesByUserIdRequest, ListOtpDevicesByUserIdResponse>(request,
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
     * @return CompletableFuture<ListUserDetailResponse>
     */
    public CompletableFuture<ListUserDetailResponse> listUserDetailAsync(ListUserDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.listUserDetail);
    }

    /**
     * 查询用户详情信息
     *
     * 该接口用于查询指定的桌面用户详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListUserDetailRequest 请求对象
     * @return AsyncInvoker<ListUserDetailRequest, ListUserDetailResponse>
     */
    public AsyncInvoker<ListUserDetailRequest, ListUserDetailResponse> listUserDetailAsyncInvoker(
        ListUserDetailRequest request) {
        return new AsyncInvoker<ListUserDetailRequest, ListUserDetailResponse>(request, WorkspaceMeta.listUserDetail,
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
     * @return CompletableFuture<ListUsersResponse>
     */
    public CompletableFuture<ListUsersResponse> listUsersAsync(ListUsersRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.listUsers);
    }

    /**
     * 查询用户列表
     *
     * 该接口用于查询桌面用户列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListUsersRequest 请求对象
     * @return AsyncInvoker<ListUsersRequest, ListUsersResponse>
     */
    public AsyncInvoker<ListUsersRequest, ListUsersResponse> listUsersAsyncInvoker(ListUsersRequest request) {
        return new AsyncInvoker<ListUsersRequest, ListUsersResponse>(request, WorkspaceMeta.listUsers, hcClient);
    }

    /**
     * 给用户重置随机密码
     *
     * 该接口用于给用户重置一个密码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ResetRandomPasswordRequest 请求对象
     * @return CompletableFuture<ResetRandomPasswordResponse>
     */
    public CompletableFuture<ResetRandomPasswordResponse> resetRandomPasswordAsync(ResetRandomPasswordRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.resetRandomPassword);
    }

    /**
     * 给用户重置随机密码
     *
     * 该接口用于给用户重置一个密码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ResetRandomPasswordRequest 请求对象
     * @return AsyncInvoker<ResetRandomPasswordRequest, ResetRandomPasswordResponse>
     */
    public AsyncInvoker<ResetRandomPasswordRequest, ResetRandomPasswordResponse> resetRandomPasswordAsyncInvoker(
        ResetRandomPasswordRequest request) {
        return new AsyncInvoker<ResetRandomPasswordRequest, ResetRandomPasswordResponse>(request,
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
     * @return CompletableFuture<UpdateUserInfoResponse>
     */
    public CompletableFuture<UpdateUserInfoResponse> updateUserInfoAsync(UpdateUserInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.updateUserInfo);
    }

    /**
     * 修改用户信息
     *
     * 该接口用于修改桌面用户信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateUserInfoRequest 请求对象
     * @return AsyncInvoker<UpdateUserInfoRequest, UpdateUserInfoResponse>
     */
    public AsyncInvoker<UpdateUserInfoRequest, UpdateUserInfoResponse> updateUserInfoAsyncInvoker(
        UpdateUserInfoRequest request) {
        return new AsyncInvoker<UpdateUserInfoRequest, UpdateUserInfoResponse>(request, WorkspaceMeta.updateUserInfo,
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
     * @return CompletableFuture<AddVolumesResponse>
     */
    public CompletableFuture<AddVolumesResponse> addVolumesAsync(AddVolumesRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.addVolumes);
    }

    /**
     * 增加桌面磁盘
     *
     * 增加桌面磁盘。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AddVolumesRequest 请求对象
     * @return AsyncInvoker<AddVolumesRequest, AddVolumesResponse>
     */
    public AsyncInvoker<AddVolumesRequest, AddVolumesResponse> addVolumesAsyncInvoker(AddVolumesRequest request) {
        return new AsyncInvoker<AddVolumesRequest, AddVolumesResponse>(request, WorkspaceMeta.addVolumes, hcClient);
    }

    /**
     * 删除桌面数据盘
     *
     * 删除桌面数据盘，删除后无法恢复。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteDesktopVolumesRequest 请求对象
     * @return CompletableFuture<DeleteDesktopVolumesResponse>
     */
    public CompletableFuture<DeleteDesktopVolumesResponse> deleteDesktopVolumesAsync(
        DeleteDesktopVolumesRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.deleteDesktopVolumes);
    }

    /**
     * 删除桌面数据盘
     *
     * 删除桌面数据盘，删除后无法恢复。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteDesktopVolumesRequest 请求对象
     * @return AsyncInvoker<DeleteDesktopVolumesRequest, DeleteDesktopVolumesResponse>
     */
    public AsyncInvoker<DeleteDesktopVolumesRequest, DeleteDesktopVolumesResponse> deleteDesktopVolumesAsyncInvoker(
        DeleteDesktopVolumesRequest request) {
        return new AsyncInvoker<DeleteDesktopVolumesRequest, DeleteDesktopVolumesResponse>(request,
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
     * @return CompletableFuture<ExpandVolumesResponse>
     */
    public CompletableFuture<ExpandVolumesResponse> expandVolumesAsync(ExpandVolumesRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.expandVolumes);
    }

    /**
     * 扩容桌面磁盘
     *
     * 扩容桌面磁盘。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ExpandVolumesRequest 请求对象
     * @return AsyncInvoker<ExpandVolumesRequest, ExpandVolumesResponse>
     */
    public AsyncInvoker<ExpandVolumesRequest, ExpandVolumesResponse> expandVolumesAsyncInvoker(
        ExpandVolumesRequest request) {
        return new AsyncInvoker<ExpandVolumesRequest, ExpandVolumesResponse>(request, WorkspaceMeta.expandVolumes,
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
     * @return CompletableFuture<ApplyWorkspaceResponse>
     */
    public CompletableFuture<ApplyWorkspaceResponse> applyWorkspaceAsync(ApplyWorkspaceRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.applyWorkspace);
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
     * @return AsyncInvoker<ApplyWorkspaceRequest, ApplyWorkspaceResponse>
     */
    public AsyncInvoker<ApplyWorkspaceRequest, ApplyWorkspaceResponse> applyWorkspaceAsyncInvoker(
        ApplyWorkspaceRequest request) {
        return new AsyncInvoker<ApplyWorkspaceRequest, ApplyWorkspaceResponse>(request, WorkspaceMeta.applyWorkspace,
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
     * @return CompletableFuture<CancelWorkspaceResponse>
     */
    public CompletableFuture<CancelWorkspaceResponse> cancelWorkspaceAsync(CancelWorkspaceRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.cancelWorkspace);
    }

    /**
     * 注销云办公服务
     *
     * 该接口用于注销云办公服务。注销前请确保当前用户下的云桌面已经删除，注销后无法恢复。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CancelWorkspaceRequest 请求对象
     * @return AsyncInvoker<CancelWorkspaceRequest, CancelWorkspaceResponse>
     */
    public AsyncInvoker<CancelWorkspaceRequest, CancelWorkspaceResponse> cancelWorkspaceAsyncInvoker(
        CancelWorkspaceRequest request) {
        return new AsyncInvoker<CancelWorkspaceRequest, CancelWorkspaceResponse>(request, WorkspaceMeta.cancelWorkspace,
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
     * @return CompletableFuture<ListWorkspacesResponse>
     */
    public CompletableFuture<ListWorkspacesResponse> listWorkspacesAsync(ListWorkspacesRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.listWorkspaces);
    }

    /**
     * 查询云办公服务详情
     *
     * 该接口用于查询云办公服务详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListWorkspacesRequest 请求对象
     * @return AsyncInvoker<ListWorkspacesRequest, ListWorkspacesResponse>
     */
    public AsyncInvoker<ListWorkspacesRequest, ListWorkspacesResponse> listWorkspacesAsyncInvoker(
        ListWorkspacesRequest request) {
        return new AsyncInvoker<ListWorkspacesRequest, ListWorkspacesResponse>(request, WorkspaceMeta.listWorkspaces,
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
     * @return CompletableFuture<ShowWorkspaceLockResponse>
     */
    public CompletableFuture<ShowWorkspaceLockResponse> showWorkspaceLockAsync(ShowWorkspaceLockRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.showWorkspaceLock);
    }

    /**
     * 查询云办公服务是否被锁定
     *
     * 查询云办公服务是否被锁定。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowWorkspaceLockRequest 请求对象
     * @return AsyncInvoker<ShowWorkspaceLockRequest, ShowWorkspaceLockResponse>
     */
    public AsyncInvoker<ShowWorkspaceLockRequest, ShowWorkspaceLockResponse> showWorkspaceLockAsyncInvoker(
        ShowWorkspaceLockRequest request) {
        return new AsyncInvoker<ShowWorkspaceLockRequest, ShowWorkspaceLockResponse>(request,
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
     * @return CompletableFuture<UnlockWorkspaceResponse>
     */
    public CompletableFuture<UnlockWorkspaceResponse> unlockWorkspaceAsync(UnlockWorkspaceRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.unlockWorkspace);
    }

    /**
     * 解除云办公服务锁定状态
     *
     * 该接口目前支持解除云办公服务锁定状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UnlockWorkspaceRequest 请求对象
     * @return AsyncInvoker<UnlockWorkspaceRequest, UnlockWorkspaceResponse>
     */
    public AsyncInvoker<UnlockWorkspaceRequest, UnlockWorkspaceResponse> unlockWorkspaceAsyncInvoker(
        UnlockWorkspaceRequest request) {
        return new AsyncInvoker<UnlockWorkspaceRequest, UnlockWorkspaceResponse>(request, WorkspaceMeta.unlockWorkspace,
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
     * @return CompletableFuture<UpdateWorkspaceResponse>
     */
    public CompletableFuture<UpdateWorkspaceResponse> updateWorkspaceAsync(UpdateWorkspaceRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.updateWorkspace);
    }

    /**
     * 修改云办公服务属性
     *
     * 该接口目前支持修改云办公服务属性。单次请求仅支持修改一种属性类型。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateWorkspaceRequest 请求对象
     * @return AsyncInvoker<UpdateWorkspaceRequest, UpdateWorkspaceResponse>
     */
    public AsyncInvoker<UpdateWorkspaceRequest, UpdateWorkspaceResponse> updateWorkspaceAsyncInvoker(
        UpdateWorkspaceRequest request) {
        return new AsyncInvoker<UpdateWorkspaceRequest, UpdateWorkspaceResponse>(request, WorkspaceMeta.updateWorkspace,
            hcClient);
    }

}
