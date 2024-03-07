package com.huaweicloud.sdk.workspace.v2;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.workspace.v2.model.AddMetricNotifyRuleRequest;
import com.huaweicloud.sdk.workspace.v2.model.AddMetricNotifyRuleResponse;
import com.huaweicloud.sdk.workspace.v2.model.AddVolumesRequest;
import com.huaweicloud.sdk.workspace.v2.model.AddVolumesResponse;
import com.huaweicloud.sdk.workspace.v2.model.ApplyDesktopsInternetRequest;
import com.huaweicloud.sdk.workspace.v2.model.ApplyDesktopsInternetResponse;
import com.huaweicloud.sdk.workspace.v2.model.ApplyWorkspaceRequest;
import com.huaweicloud.sdk.workspace.v2.model.ApplyWorkspaceResponse;
import com.huaweicloud.sdk.workspace.v2.model.AssociateDesktopsEipRequest;
import com.huaweicloud.sdk.workspace.v2.model.AssociateDesktopsEipResponse;
import com.huaweicloud.sdk.workspace.v2.model.AttachInstancesRequest;
import com.huaweicloud.sdk.workspace.v2.model.AttachInstancesResponse;
import com.huaweicloud.sdk.workspace.v2.model.BatchAddDesktopsTagsRequest;
import com.huaweicloud.sdk.workspace.v2.model.BatchAddDesktopsTagsResponse;
import com.huaweicloud.sdk.workspace.v2.model.BatchChangeTagsRequest;
import com.huaweicloud.sdk.workspace.v2.model.BatchChangeTagsResponse;
import com.huaweicloud.sdk.workspace.v2.model.BatchCreateUsersRequest;
import com.huaweicloud.sdk.workspace.v2.model.BatchCreateUsersResponse;
import com.huaweicloud.sdk.workspace.v2.model.BatchDeleteAccessPoliciesRequest;
import com.huaweicloud.sdk.workspace.v2.model.BatchDeleteAccessPoliciesResponse;
import com.huaweicloud.sdk.workspace.v2.model.BatchDeleteDesktopNamePolicyRequest;
import com.huaweicloud.sdk.workspace.v2.model.BatchDeleteDesktopNamePolicyResponse;
import com.huaweicloud.sdk.workspace.v2.model.BatchDeleteDesktopsRequest;
import com.huaweicloud.sdk.workspace.v2.model.BatchDeleteDesktopsResponse;
import com.huaweicloud.sdk.workspace.v2.model.BatchDeleteDesktopsTagsRequest;
import com.huaweicloud.sdk.workspace.v2.model.BatchDeleteDesktopsTagsResponse;
import com.huaweicloud.sdk.workspace.v2.model.BatchDeleteOtpDevicesRequest;
import com.huaweicloud.sdk.workspace.v2.model.BatchDeleteOtpDevicesResponse;
import com.huaweicloud.sdk.workspace.v2.model.BatchDeleteScheduledTasksRequest;
import com.huaweicloud.sdk.workspace.v2.model.BatchDeleteScheduledTasksResponse;
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
import com.huaweicloud.sdk.workspace.v2.model.CreateAgenciesRequest;
import com.huaweicloud.sdk.workspace.v2.model.CreateAgenciesResponse;
import com.huaweicloud.sdk.workspace.v2.model.CreateDesktopNamePolicyRequest;
import com.huaweicloud.sdk.workspace.v2.model.CreateDesktopNamePolicyResponse;
import com.huaweicloud.sdk.workspace.v2.model.CreateDesktopRequest;
import com.huaweicloud.sdk.workspace.v2.model.CreateDesktopResponse;
import com.huaweicloud.sdk.workspace.v2.model.CreateDesktopUserRequest;
import com.huaweicloud.sdk.workspace.v2.model.CreateDesktopUserResponse;
import com.huaweicloud.sdk.workspace.v2.model.CreateScheduledTasksRequest;
import com.huaweicloud.sdk.workspace.v2.model.CreateScheduledTasksResponse;
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
import com.huaweicloud.sdk.workspace.v2.model.DeleteMetricNotifyRuleRequest;
import com.huaweicloud.sdk.workspace.v2.model.DeleteMetricNotifyRuleResponse;
import com.huaweicloud.sdk.workspace.v2.model.DeleteScheduledTasksRequest;
import com.huaweicloud.sdk.workspace.v2.model.DeleteScheduledTasksResponse;
import com.huaweicloud.sdk.workspace.v2.model.DeleteTagRequest;
import com.huaweicloud.sdk.workspace.v2.model.DeleteTagResponse;
import com.huaweicloud.sdk.workspace.v2.model.DeleteTerminalsBindingDesktopsRequest;
import com.huaweicloud.sdk.workspace.v2.model.DeleteTerminalsBindingDesktopsResponse;
import com.huaweicloud.sdk.workspace.v2.model.DeleteUserGroupRequest;
import com.huaweicloud.sdk.workspace.v2.model.DeleteUserGroupResponse;
import com.huaweicloud.sdk.workspace.v2.model.DeleteUserRequest;
import com.huaweicloud.sdk.workspace.v2.model.DeleteUserResponse;
import com.huaweicloud.sdk.workspace.v2.model.DetachInstancesRequest;
import com.huaweicloud.sdk.workspace.v2.model.DetachInstancesResponse;
import com.huaweicloud.sdk.workspace.v2.model.ExpandVolumesRequest;
import com.huaweicloud.sdk.workspace.v2.model.ExpandVolumesResponse;
import com.huaweicloud.sdk.workspace.v2.model.ExportUserLoginInfoNewRequest;
import com.huaweicloud.sdk.workspace.v2.model.ExportUserLoginInfoNewResponse;
import com.huaweicloud.sdk.workspace.v2.model.ListAccessPoliciesRequest;
import com.huaweicloud.sdk.workspace.v2.model.ListAccessPoliciesResponse;
import com.huaweicloud.sdk.workspace.v2.model.ListAccessPolicyObjectsRequest;
import com.huaweicloud.sdk.workspace.v2.model.ListAccessPolicyObjectsResponse;
import com.huaweicloud.sdk.workspace.v2.model.ListAgenciesRequest;
import com.huaweicloud.sdk.workspace.v2.model.ListAgenciesResponse;
import com.huaweicloud.sdk.workspace.v2.model.ListAvailabilityZonesRequest;
import com.huaweicloud.sdk.workspace.v2.model.ListAvailabilityZonesResponse;
import com.huaweicloud.sdk.workspace.v2.model.ListDesktopByTagsRequest;
import com.huaweicloud.sdk.workspace.v2.model.ListDesktopByTagsResponse;
import com.huaweicloud.sdk.workspace.v2.model.ListDesktopNamePolicyRequest;
import com.huaweicloud.sdk.workspace.v2.model.ListDesktopNamePolicyResponse;
import com.huaweicloud.sdk.workspace.v2.model.ListDesktopUsageMetricRequest;
import com.huaweicloud.sdk.workspace.v2.model.ListDesktopUsageMetricResponse;
import com.huaweicloud.sdk.workspace.v2.model.ListDesktopsDetailRequest;
import com.huaweicloud.sdk.workspace.v2.model.ListDesktopsDetailResponse;
import com.huaweicloud.sdk.workspace.v2.model.ListDesktopsEipsRequest;
import com.huaweicloud.sdk.workspace.v2.model.ListDesktopsEipsResponse;
import com.huaweicloud.sdk.workspace.v2.model.ListDesktopsRequest;
import com.huaweicloud.sdk.workspace.v2.model.ListDesktopsResponse;
import com.huaweicloud.sdk.workspace.v2.model.ListFutureExecutionsRequest;
import com.huaweicloud.sdk.workspace.v2.model.ListFutureExecutionsResponse;
import com.huaweicloud.sdk.workspace.v2.model.ListHistoryOnlineInfoNewRequest;
import com.huaweicloud.sdk.workspace.v2.model.ListHistoryOnlineInfoNewResponse;
import com.huaweicloud.sdk.workspace.v2.model.ListImagesRequest;
import com.huaweicloud.sdk.workspace.v2.model.ListImagesResponse;
import com.huaweicloud.sdk.workspace.v2.model.ListItaSubJobsRequest;
import com.huaweicloud.sdk.workspace.v2.model.ListItaSubJobsResponse;
import com.huaweicloud.sdk.workspace.v2.model.ListLoginRecordsNewRequest;
import com.huaweicloud.sdk.workspace.v2.model.ListLoginRecordsNewResponse;
import com.huaweicloud.sdk.workspace.v2.model.ListMetricNotifyRecordRequest;
import com.huaweicloud.sdk.workspace.v2.model.ListMetricNotifyRecordResponse;
import com.huaweicloud.sdk.workspace.v2.model.ListMetricNotifyRuleRequest;
import com.huaweicloud.sdk.workspace.v2.model.ListMetricNotifyRuleResponse;
import com.huaweicloud.sdk.workspace.v2.model.ListOtpDevicesByUserIdRequest;
import com.huaweicloud.sdk.workspace.v2.model.ListOtpDevicesByUserIdResponse;
import com.huaweicloud.sdk.workspace.v2.model.ListProductsRequest;
import com.huaweicloud.sdk.workspace.v2.model.ListProductsResponse;
import com.huaweicloud.sdk.workspace.v2.model.ListProjectTagsRequest;
import com.huaweicloud.sdk.workspace.v2.model.ListProjectTagsResponse;
import com.huaweicloud.sdk.workspace.v2.model.ListScheduledTasksRecordsDetailsRequest;
import com.huaweicloud.sdk.workspace.v2.model.ListScheduledTasksRecordsDetailsResponse;
import com.huaweicloud.sdk.workspace.v2.model.ListScheduledTasksRecordsRequest;
import com.huaweicloud.sdk.workspace.v2.model.ListScheduledTasksRecordsResponse;
import com.huaweicloud.sdk.workspace.v2.model.ListScheduledTasksRequest;
import com.huaweicloud.sdk.workspace.v2.model.ListScheduledTasksResponse;
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
import com.huaweicloud.sdk.workspace.v2.model.ListUserUsageMetricRequest;
import com.huaweicloud.sdk.workspace.v2.model.ListUserUsageMetricResponse;
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
import com.huaweicloud.sdk.workspace.v2.model.ShowScheduledTasksRequest;
import com.huaweicloud.sdk.workspace.v2.model.ShowScheduledTasksResponse;
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
import com.huaweicloud.sdk.workspace.v2.model.UpdateDesktopNamePolicyRequest;
import com.huaweicloud.sdk.workspace.v2.model.UpdateDesktopNamePolicyResponse;
import com.huaweicloud.sdk.workspace.v2.model.UpdateMetricNotifyRuleRequest;
import com.huaweicloud.sdk.workspace.v2.model.UpdateMetricNotifyRuleResponse;
import com.huaweicloud.sdk.workspace.v2.model.UpdateScheduledTasksRequest;
import com.huaweicloud.sdk.workspace.v2.model.UpdateScheduledTasksResponse;
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
     * @param request BatchDeleteAccessPoliciesRequest 请求对象
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
     * @param request BatchDeleteAccessPoliciesRequest 请求对象
     * @return SyncInvoker<BatchDeleteAccessPoliciesRequest, BatchDeleteAccessPoliciesResponse>
     */
    public SyncInvoker<BatchDeleteAccessPoliciesRequest, BatchDeleteAccessPoliciesResponse> batchDeleteAccessPoliciesInvoker(
        BatchDeleteAccessPoliciesRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.batchDeleteAccessPolicies, hcClient);
    }

    /**
     * 创建接入策略
     *
     * 该接口用于创建接入策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAccessPolicyRequest 请求对象
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
     * @param request CreateAccessPolicyRequest 请求对象
     * @return SyncInvoker<CreateAccessPolicyRequest, CreateAccessPolicyResponse>
     */
    public SyncInvoker<CreateAccessPolicyRequest, CreateAccessPolicyResponse> createAccessPolicyInvoker(
        CreateAccessPolicyRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.createAccessPolicy, hcClient);
    }

    /**
     * 查询接入策略
     *
     * 该接口用于查询接入策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAccessPoliciesRequest 请求对象
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
     * @param request ListAccessPoliciesRequest 请求对象
     * @return SyncInvoker<ListAccessPoliciesRequest, ListAccessPoliciesResponse>
     */
    public SyncInvoker<ListAccessPoliciesRequest, ListAccessPoliciesResponse> listAccessPoliciesInvoker(
        ListAccessPoliciesRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.listAccessPolicies, hcClient);
    }

    /**
     * 查询指定接入策略的应用对象
     *
     * 该接口用于查询指定接入策略的应用对象。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAccessPolicyObjectsRequest 请求对象
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
     * @param request ListAccessPolicyObjectsRequest 请求对象
     * @return SyncInvoker<ListAccessPolicyObjectsRequest, ListAccessPolicyObjectsResponse>
     */
    public SyncInvoker<ListAccessPolicyObjectsRequest, ListAccessPolicyObjectsResponse> listAccessPolicyObjectsInvoker(
        ListAccessPolicyObjectsRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.listAccessPolicyObjects, hcClient);
    }

    /**
     * 更新指定接入策略的应用对象
     *
     * 该接口用于更新指定接入策略的应用对象。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAccessPolicyObjectsRequest 请求对象
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
     * @param request UpdateAccessPolicyObjectsRequest 请求对象
     * @return SyncInvoker<UpdateAccessPolicyObjectsRequest, UpdateAccessPolicyObjectsResponse>
     */
    public SyncInvoker<UpdateAccessPolicyObjectsRequest, UpdateAccessPolicyObjectsResponse> updateAccessPolicyObjectsInvoker(
        UpdateAccessPolicyObjectsRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.updateAccessPolicyObjects, hcClient);
    }

    /**
     * 开通委托功能
     *
     * 开通委托功能
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAgenciesRequest 请求对象
     * @return CreateAgenciesResponse
     */
    public CreateAgenciesResponse createAgencies(CreateAgenciesRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.createAgencies);
    }

    /**
     * 开通委托功能
     *
     * 开通委托功能
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAgenciesRequest 请求对象
     * @return SyncInvoker<CreateAgenciesRequest, CreateAgenciesResponse>
     */
    public SyncInvoker<CreateAgenciesRequest, CreateAgenciesResponse> createAgenciesInvoker(
        CreateAgenciesRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.createAgencies, hcClient);
    }

    /**
     * 查询委托功能
     *
     * 查询委托功能
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAgenciesRequest 请求对象
     * @return ListAgenciesResponse
     */
    public ListAgenciesResponse listAgencies(ListAgenciesRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.listAgencies);
    }

    /**
     * 查询委托功能
     *
     * 查询委托功能
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAgenciesRequest 请求对象
     * @return SyncInvoker<ListAgenciesRequest, ListAgenciesResponse>
     */
    public SyncInvoker<ListAgenciesRequest, ListAgenciesResponse> listAgenciesInvoker(ListAgenciesRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.listAgencies, hcClient);
    }

    /**
     * 查询辅助认证配置
     *
     * 查询辅助认证的配置信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAssistAuthConfigRequest 请求对象
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
     * @param request ShowAssistAuthConfigRequest 请求对象
     * @return SyncInvoker<ShowAssistAuthConfigRequest, ShowAssistAuthConfigResponse>
     */
    public SyncInvoker<ShowAssistAuthConfigRequest, ShowAssistAuthConfigResponse> showAssistAuthConfigInvoker(
        ShowAssistAuthConfigRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.showAssistAuthConfig, hcClient);
    }

    /**
     * 更新辅助认证策略配置
     *
     * 更新辅助认证策略配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAssistAuthMethodConfigRequest 请求对象
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
     * @param request UpdateAssistAuthMethodConfigRequest 请求对象
     * @return SyncInvoker<UpdateAssistAuthMethodConfigRequest, UpdateAssistAuthMethodConfigResponse>
     */
    public SyncInvoker<UpdateAssistAuthMethodConfigRequest, UpdateAssistAuthMethodConfigResponse> updateAssistAuthMethodConfigInvoker(
        UpdateAssistAuthMethodConfigRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.updateAssistAuthMethodConfig, hcClient);
    }

    /**
     * 查询可用分区列表
     *
     * 该接口用于查询云桌面支持的可用分区列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAvailabilityZonesRequest 请求对象
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
     * @param request ListAvailabilityZonesRequest 请求对象
     * @return SyncInvoker<ListAvailabilityZonesRequest, ListAvailabilityZonesResponse>
     */
    public SyncInvoker<ListAvailabilityZonesRequest, ListAvailabilityZonesResponse> listAvailabilityZonesInvoker(
        ListAvailabilityZonesRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.listAvailabilityZones, hcClient);
    }

    /**
     * 导出连接记录
     *
     * 该接口用于导出连接记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportUserLoginInfoNewRequest 请求对象
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
     * @param request ExportUserLoginInfoNewRequest 请求对象
     * @return SyncInvoker<ExportUserLoginInfoNewRequest, ExportUserLoginInfoNewResponse>
     */
    public SyncInvoker<ExportUserLoginInfoNewRequest, ExportUserLoginInfoNewResponse> exportUserLoginInfoNewInvoker(
        ExportUserLoginInfoNewRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.exportUserLoginInfoNew, hcClient);
    }

    /**
     * 查询登录人数
     *
     * 该接口用于查询登录人数，注意查询参数不可全空。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHistoryOnlineInfoNewRequest 请求对象
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
     * @param request ListHistoryOnlineInfoNewRequest 请求对象
     * @return SyncInvoker<ListHistoryOnlineInfoNewRequest, ListHistoryOnlineInfoNewResponse>
     */
    public SyncInvoker<ListHistoryOnlineInfoNewRequest, ListHistoryOnlineInfoNewResponse> listHistoryOnlineInfoNewInvoker(
        ListHistoryOnlineInfoNewRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.listHistoryOnlineInfoNew, hcClient);
    }

    /**
     * 查询登录信息
     *
     * 该接口用于查询登录信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLoginRecordsNewRequest 请求对象
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
     * @param request ListLoginRecordsNewRequest 请求对象
     * @return SyncInvoker<ListLoginRecordsNewRequest, ListLoginRecordsNewResponse>
     */
    public SyncInvoker<ListLoginRecordsNewRequest, ListLoginRecordsNewResponse> listLoginRecordsNewInvoker(
        ListLoginRecordsNewRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.listLoginRecordsNew, hcClient);
    }

    /**
     * 分配用户
     *
     * 将桌面分配给用户
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AttachInstancesRequest 请求对象
     * @return AttachInstancesResponse
     */
    public AttachInstancesResponse attachInstances(AttachInstancesRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.attachInstances);
    }

    /**
     * 分配用户
     *
     * 将桌面分配给用户
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AttachInstancesRequest 请求对象
     * @return SyncInvoker<AttachInstancesRequest, AttachInstancesResponse>
     */
    public SyncInvoker<AttachInstancesRequest, AttachInstancesResponse> attachInstancesInvoker(
        AttachInstancesRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.attachInstances, hcClient);
    }

    /**
     * 批量删除桌面
     *
     * 批量删除桌面，删除后无法恢复。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteDesktopsRequest 请求对象
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
     * @param request BatchDeleteDesktopsRequest 请求对象
     * @return SyncInvoker<BatchDeleteDesktopsRequest, BatchDeleteDesktopsResponse>
     */
    public SyncInvoker<BatchDeleteDesktopsRequest, BatchDeleteDesktopsResponse> batchDeleteDesktopsInvoker(
        BatchDeleteDesktopsRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.batchDeleteDesktops, hcClient);
    }

    /**
     * 批量注销桌面
     *
     * 批量注销桌面。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchLogoffDesktopsRequest 请求对象
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
     * @param request BatchLogoffDesktopsRequest 请求对象
     * @return SyncInvoker<BatchLogoffDesktopsRequest, BatchLogoffDesktopsResponse>
     */
    public SyncInvoker<BatchLogoffDesktopsRequest, BatchLogoffDesktopsResponse> batchLogoffDesktopsInvoker(
        BatchLogoffDesktopsRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.batchLogoffDesktops, hcClient);
    }

    /**
     * 重建桌面
     *
     * 批量重建桌面系统盘。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchRebuildDesktopsSystemDiskRequest 请求对象
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
     * @param request BatchRebuildDesktopsSystemDiskRequest 请求对象
     * @return SyncInvoker<BatchRebuildDesktopsSystemDiskRequest, BatchRebuildDesktopsSystemDiskResponse>
     */
    public SyncInvoker<BatchRebuildDesktopsSystemDiskRequest, BatchRebuildDesktopsSystemDiskResponse> batchRebuildDesktopsSystemDiskInvoker(
        BatchRebuildDesktopsSystemDiskRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.batchRebuildDesktopsSystemDisk, hcClient);
    }

    /**
     * 操作桌面
     *
     * 批量操作桌面，用于批量开机、关机和重启。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchRunDesktopsRequest 请求对象
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
     * @param request BatchRunDesktopsRequest 请求对象
     * @return SyncInvoker<BatchRunDesktopsRequest, BatchRunDesktopsResponse>
     */
    public SyncInvoker<BatchRunDesktopsRequest, BatchRunDesktopsResponse> batchRunDesktopsInvoker(
        BatchRunDesktopsRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.batchRunDesktops, hcClient);
    }

    /**
     * 切换桌面网络
     *
     * 切换桌面vpc、子网、ip、安全组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeDesktopNetworkRequest 请求对象
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
     * @param request ChangeDesktopNetworkRequest 请求对象
     * @return SyncInvoker<ChangeDesktopNetworkRequest, ChangeDesktopNetworkResponse>
     */
    public SyncInvoker<ChangeDesktopNetworkRequest, ChangeDesktopNetworkResponse> changeDesktopNetworkInvoker(
        ChangeDesktopNetworkRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.changeDesktopNetwork, hcClient);
    }

    /**
     * 创建桌面
     *
     * 创建桌面，并将此桌面分配给用户，当桌面创建成功后用户可以登录使用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDesktopRequest 请求对象
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
     * @param request CreateDesktopRequest 请求对象
     * @return SyncInvoker<CreateDesktopRequest, CreateDesktopResponse>
     */
    public SyncInvoker<CreateDesktopRequest, CreateDesktopResponse> createDesktopInvoker(CreateDesktopRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.createDesktop, hcClient);
    }

    /**
     * 删除单个桌面
     *
     * 删除单个桌面，删除后无法恢复。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDesktopRequest 请求对象
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
     * @param request DeleteDesktopRequest 请求对象
     * @return SyncInvoker<DeleteDesktopRequest, DeleteDesktopResponse>
     */
    public SyncInvoker<DeleteDesktopRequest, DeleteDesktopResponse> deleteDesktopInvoker(DeleteDesktopRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.deleteDesktop, hcClient);
    }

    /**
     * 解绑用户
     *
     * 将桌面和用户解绑
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DetachInstancesRequest 请求对象
     * @return DetachInstancesResponse
     */
    public DetachInstancesResponse detachInstances(DetachInstancesRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.detachInstances);
    }

    /**
     * 解绑用户
     *
     * 将桌面和用户解绑
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DetachInstancesRequest 请求对象
     * @return SyncInvoker<DetachInstancesRequest, DetachInstancesResponse>
     */
    public SyncInvoker<DetachInstancesRequest, DetachInstancesResponse> detachInstancesInvoker(
        DetachInstancesRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.detachInstances, hcClient);
    }

    /**
     * 查询桌面列表
     *
     * 该接口用于查询桌面虚拟机列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDesktopsRequest 请求对象
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
     * @param request ListDesktopsRequest 请求对象
     * @return SyncInvoker<ListDesktopsRequest, ListDesktopsResponse>
     */
    public SyncInvoker<ListDesktopsRequest, ListDesktopsResponse> listDesktopsInvoker(ListDesktopsRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.listDesktops, hcClient);
    }

    /**
     * 查询桌面详情列表
     *
     * 查询桌面详情信息列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDesktopsDetailRequest 请求对象
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
     * @param request ListDesktopsDetailRequest 请求对象
     * @return SyncInvoker<ListDesktopsDetailRequest, ListDesktopsDetailResponse>
     */
    public SyncInvoker<ListDesktopsDetailRequest, ListDesktopsDetailResponse> listDesktopsDetailInvoker(
        ListDesktopsDetailRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.listDesktopsDetail, hcClient);
    }

    /**
     * 变更规格
     *
     * 变更云桌面规格，只支持变更CPU和内存，不支持变更磁盘，不支持同规格互相变更。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResizeDesktopRequest 请求对象
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
     * @param request ResizeDesktopRequest 请求对象
     * @return SyncInvoker<ResizeDesktopRequest, ResizeDesktopResponse>
     */
    public SyncInvoker<ResizeDesktopRequest, ResizeDesktopResponse> resizeDesktopInvoker(ResizeDesktopRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.resizeDesktop, hcClient);
    }

    /**
     * 查询单个桌面详情
     *
     * 指定桌面Id查询详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDesktopDetailRequest 请求对象
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
     * @param request ShowDesktopDetailRequest 请求对象
     * @return SyncInvoker<ShowDesktopDetailRequest, ShowDesktopDetailResponse>
     */
    public SyncInvoker<ShowDesktopDetailRequest, ShowDesktopDetailResponse> showDesktopDetailInvoker(
        ShowDesktopDetailRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.showDesktopDetail, hcClient);
    }

    /**
     * 查询桌面网络
     *
     * 查询桌面vpc、子网、privateIp、EIP、安全组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDesktopNetworkRequest 请求对象
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
     * @param request ShowDesktopNetworkRequest 请求对象
     * @return SyncInvoker<ShowDesktopNetworkRequest, ShowDesktopNetworkResponse>
     */
    public SyncInvoker<ShowDesktopNetworkRequest, ShowDesktopNetworkResponse> showDesktopNetworkInvoker(
        ShowDesktopNetworkRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.showDesktopNetwork, hcClient);
    }

    /**
     * 批量删除桌面名称策略
     *
     * 批量删除桌面名称策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteDesktopNamePolicyRequest 请求对象
     * @return BatchDeleteDesktopNamePolicyResponse
     */
    public BatchDeleteDesktopNamePolicyResponse batchDeleteDesktopNamePolicy(
        BatchDeleteDesktopNamePolicyRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.batchDeleteDesktopNamePolicy);
    }

    /**
     * 批量删除桌面名称策略
     *
     * 批量删除桌面名称策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteDesktopNamePolicyRequest 请求对象
     * @return SyncInvoker<BatchDeleteDesktopNamePolicyRequest, BatchDeleteDesktopNamePolicyResponse>
     */
    public SyncInvoker<BatchDeleteDesktopNamePolicyRequest, BatchDeleteDesktopNamePolicyResponse> batchDeleteDesktopNamePolicyInvoker(
        BatchDeleteDesktopNamePolicyRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.batchDeleteDesktopNamePolicy, hcClient);
    }

    /**
     * 创建桌面名称策略
     *
     * 创建桌面名称策略，用于自动生成桌面名称，最多允许50个。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDesktopNamePolicyRequest 请求对象
     * @return CreateDesktopNamePolicyResponse
     */
    public CreateDesktopNamePolicyResponse createDesktopNamePolicy(CreateDesktopNamePolicyRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.createDesktopNamePolicy);
    }

    /**
     * 创建桌面名称策略
     *
     * 创建桌面名称策略，用于自动生成桌面名称，最多允许50个。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDesktopNamePolicyRequest 请求对象
     * @return SyncInvoker<CreateDesktopNamePolicyRequest, CreateDesktopNamePolicyResponse>
     */
    public SyncInvoker<CreateDesktopNamePolicyRequest, CreateDesktopNamePolicyResponse> createDesktopNamePolicyInvoker(
        CreateDesktopNamePolicyRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.createDesktopNamePolicy, hcClient);
    }

    /**
     * 获取桌面名称策略
     *
     * 获取桌面名称策略，用于自动生成桌面名称。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDesktopNamePolicyRequest 请求对象
     * @return ListDesktopNamePolicyResponse
     */
    public ListDesktopNamePolicyResponse listDesktopNamePolicy(ListDesktopNamePolicyRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.listDesktopNamePolicy);
    }

    /**
     * 获取桌面名称策略
     *
     * 获取桌面名称策略，用于自动生成桌面名称。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDesktopNamePolicyRequest 请求对象
     * @return SyncInvoker<ListDesktopNamePolicyRequest, ListDesktopNamePolicyResponse>
     */
    public SyncInvoker<ListDesktopNamePolicyRequest, ListDesktopNamePolicyResponse> listDesktopNamePolicyInvoker(
        ListDesktopNamePolicyRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.listDesktopNamePolicy, hcClient);
    }

    /**
     * 更新桌面名称策略
     *
     * 更新桌面名称策略，用于自动生成桌面名称。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDesktopNamePolicyRequest 请求对象
     * @return UpdateDesktopNamePolicyResponse
     */
    public UpdateDesktopNamePolicyResponse updateDesktopNamePolicy(UpdateDesktopNamePolicyRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.updateDesktopNamePolicy);
    }

    /**
     * 更新桌面名称策略
     *
     * 更新桌面名称策略，用于自动生成桌面名称。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDesktopNamePolicyRequest 请求对象
     * @return SyncInvoker<UpdateDesktopNamePolicyRequest, UpdateDesktopNamePolicyResponse>
     */
    public SyncInvoker<UpdateDesktopNamePolicyRequest, UpdateDesktopNamePolicyResponse> updateDesktopNamePolicyInvoker(
        UpdateDesktopNamePolicyRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.updateDesktopNamePolicy, hcClient);
    }

    /**
     * 查询在指定时间段未使用的桌面
     *
     * 查询在指定时间段未使用的桌面。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUnusedDesktopsRequest 请求对象
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
     * @param request ListUnusedDesktopsRequest 请求对象
     * @return SyncInvoker<ListUnusedDesktopsRequest, ListUnusedDesktopsResponse>
     */
    public SyncInvoker<ListUnusedDesktopsRequest, ListUnusedDesktopsResponse> listUnusedDesktopsInvoker(
        ListUnusedDesktopsRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.listUnusedDesktops, hcClient);
    }

    /**
     * 查询使用桌面的时长
     *
     * 查询使用桌面的时长。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUsedDesktopInfoRequest 请求对象
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
     * @param request ListUsedDesktopInfoRequest 请求对象
     * @return SyncInvoker<ListUsedDesktopInfoRequest, ListUsedDesktopInfoResponse>
     */
    public SyncInvoker<ListUsedDesktopInfoRequest, ListUsedDesktopInfoResponse> listUsedDesktopInfoInvoker(
        ListUsedDesktopInfoRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.listUsedDesktopInfo, hcClient);
    }

    /**
     * 批量添加多个桌面标签
     *
     * 同时对多个桌面批量添加标签，如果创建的标签已经存在（key相同）则覆，最大支持100个桌面，每个桌面最大20个标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchAddDesktopsTagsRequest 请求对象
     * @return BatchAddDesktopsTagsResponse
     */
    public BatchAddDesktopsTagsResponse batchAddDesktopsTags(BatchAddDesktopsTagsRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.batchAddDesktopsTags);
    }

    /**
     * 批量添加多个桌面标签
     *
     * 同时对多个桌面批量添加标签，如果创建的标签已经存在（key相同）则覆，最大支持100个桌面，每个桌面最大20个标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchAddDesktopsTagsRequest 请求对象
     * @return SyncInvoker<BatchAddDesktopsTagsRequest, BatchAddDesktopsTagsResponse>
     */
    public SyncInvoker<BatchAddDesktopsTagsRequest, BatchAddDesktopsTagsResponse> batchAddDesktopsTagsInvoker(
        BatchAddDesktopsTagsRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.batchAddDesktopsTags, hcClient);
    }

    /**
     * 批量添加删除标签
     *
     * 为指定桌面批量添加或删除标签。创建时，如果创建的标签已经存在（key相同），则覆盖。删除时，如果删除的标签不存在，默认处理成功
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchChangeTagsRequest 请求对象
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
     * @param request BatchChangeTagsRequest 请求对象
     * @return SyncInvoker<BatchChangeTagsRequest, BatchChangeTagsResponse>
     */
    public SyncInvoker<BatchChangeTagsRequest, BatchChangeTagsResponse> batchChangeTagsInvoker(
        BatchChangeTagsRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.batchChangeTags, hcClient);
    }

    /**
     * 批量删除多个桌面标签
     *
     * 同时对多个桌面批量添加标签，删除时，如果删除的标签不存在默认处理成功，最大支持100个桌面，每个桌面最大20个标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteDesktopsTagsRequest 请求对象
     * @return BatchDeleteDesktopsTagsResponse
     */
    public BatchDeleteDesktopsTagsResponse batchDeleteDesktopsTags(BatchDeleteDesktopsTagsRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.batchDeleteDesktopsTags);
    }

    /**
     * 批量删除多个桌面标签
     *
     * 同时对多个桌面批量添加标签，删除时，如果删除的标签不存在默认处理成功，最大支持100个桌面，每个桌面最大20个标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteDesktopsTagsRequest 请求对象
     * @return SyncInvoker<BatchDeleteDesktopsTagsRequest, BatchDeleteDesktopsTagsResponse>
     */
    public SyncInvoker<BatchDeleteDesktopsTagsRequest, BatchDeleteDesktopsTagsResponse> batchDeleteDesktopsTagsInvoker(
        BatchDeleteDesktopsTagsRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.batchDeleteDesktopsTags, hcClient);
    }

    /**
     * 创建桌面标签
     *
     * 该接口用于为桌面创建标签，一个桌面上最多有10个标签。创建时，如果创建的标签已经存在（key相同），则覆盖。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTagRequest 请求对象
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
     * @param request CreateTagRequest 请求对象
     * @return SyncInvoker<CreateTagRequest, CreateTagResponse>
     */
    public SyncInvoker<CreateTagRequest, CreateTagResponse> createTagInvoker(CreateTagRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.createTag, hcClient);
    }

    /**
     * 删除桌面标签
     *
     * 该接口用于删除桌面标签。删除时，如果删除的标签不存在，默认处理成功。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTagRequest 请求对象
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
     * @param request DeleteTagRequest 请求对象
     * @return SyncInvoker<DeleteTagRequest, DeleteTagResponse>
     */
    public SyncInvoker<DeleteTagRequest, DeleteTagResponse> deleteTagInvoker(DeleteTagRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.deleteTag, hcClient);
    }

    /**
     * 使用标签过滤桌面
     *
     * 使用标签过滤桌面
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDesktopByTagsRequest 请求对象
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
     * @param request ListDesktopByTagsRequest 请求对象
     * @return SyncInvoker<ListDesktopByTagsRequest, ListDesktopByTagsResponse>
     */
    public SyncInvoker<ListDesktopByTagsRequest, ListDesktopByTagsResponse> listDesktopByTagsInvoker(
        ListDesktopByTagsRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.listDesktopByTags, hcClient);
    }

    /**
     * 查询项目标签
     *
     * 查询租户的所有标签集合
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectTagsRequest 请求对象
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
     * @param request ListProjectTagsRequest 请求对象
     * @return SyncInvoker<ListProjectTagsRequest, ListProjectTagsResponse>
     */
    public SyncInvoker<ListProjectTagsRequest, ListProjectTagsResponse> listProjectTagsInvoker(
        ListProjectTagsRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.listProjectTags, hcClient);
    }

    /**
     * 查询桌面标签
     *
     * 查询指定桌面的标签信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTagByDesktopIdRequest 请求对象
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
     * @param request ShowTagByDesktopIdRequest 请求对象
     * @return SyncInvoker<ShowTagByDesktopIdRequest, ShowTagByDesktopIdResponse>
     */
    public SyncInvoker<ShowTagByDesktopIdRequest, ShowTagByDesktopIdResponse> showTagByDesktopIdInvoker(
        ShowTagByDesktopIdRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.showTagByDesktopId, hcClient);
    }

    /**
     * 批量删除用户组
     *
     * 该接口用于批量删除用户组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteUserGroupsRequest 请求对象
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
     * @param request BatchDeleteUserGroupsRequest 请求对象
     * @return SyncInvoker<BatchDeleteUserGroupsRequest, BatchDeleteUserGroupsResponse>
     */
    public SyncInvoker<BatchDeleteUserGroupsRequest, BatchDeleteUserGroupsResponse> batchDeleteUserGroupsInvoker(
        BatchDeleteUserGroupsRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.batchDeleteUserGroups, hcClient);
    }

    /**
     * 创建用户组
     *
     * 该接口用于创建用户组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateUserGroupRequest 请求对象
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
     * @param request CreateUserGroupRequest 请求对象
     * @return SyncInvoker<CreateUserGroupRequest, CreateUserGroupResponse>
     */
    public SyncInvoker<CreateUserGroupRequest, CreateUserGroupResponse> createUserGroupInvoker(
        CreateUserGroupRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.createUserGroup, hcClient);
    }

    /**
     * 删除用户组
     *
     * 删除用户组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteUserGroupRequest 请求对象
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
     * @param request DeleteUserGroupRequest 请求对象
     * @return SyncInvoker<DeleteUserGroupRequest, DeleteUserGroupResponse>
     */
    public SyncInvoker<DeleteUserGroupRequest, DeleteUserGroupResponse> deleteUserGroupInvoker(
        DeleteUserGroupRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.deleteUserGroup, hcClient);
    }

    /**
     * 查询用户组列表
     *
     * 查询用户组列表，支持分页。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUserGroupsRequest 请求对象
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
     * @param request ListUserGroupsRequest 请求对象
     * @return SyncInvoker<ListUserGroupsRequest, ListUserGroupsResponse>
     */
    public SyncInvoker<ListUserGroupsRequest, ListUserGroupsResponse> listUserGroupsInvoker(
        ListUserGroupsRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.listUserGroups, hcClient);
    }

    /**
     * 查询用户组中的用户
     *
     * 该接口用于查询用户组中的用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUsersOfGroupRequest 请求对象
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
     * @param request ListUsersOfGroupRequest 请求对象
     * @return SyncInvoker<ListUsersOfGroupRequest, ListUsersOfGroupResponse>
     */
    public SyncInvoker<ListUsersOfGroupRequest, ListUsersOfGroupResponse> listUsersOfGroupInvoker(
        ListUsersOfGroupRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.listUsersOfGroup, hcClient);
    }

    /**
     * 操作用户组
     *
     * 操作用户组，如添加用户、删除用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RunActionsOnGroupRequest 请求对象
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
     * @param request RunActionsOnGroupRequest 请求对象
     * @return SyncInvoker<RunActionsOnGroupRequest, RunActionsOnGroupResponse>
     */
    public SyncInvoker<RunActionsOnGroupRequest, RunActionsOnGroupResponse> runActionsOnGroupInvoker(
        RunActionsOnGroupRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.runActionsOnGroup, hcClient);
    }

    /**
     * 修改用户组信息
     *
     * 该接口用于修改用户组信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateUserGroupRequest 请求对象
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
     * @param request UpdateUserGroupRequest 请求对象
     * @return SyncInvoker<UpdateUserGroupRequest, UpdateUserGroupResponse>
     */
    public SyncInvoker<UpdateUserGroupRequest, UpdateUserGroupResponse> updateUserGroupInvoker(
        UpdateUserGroupRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.updateUserGroup, hcClient);
    }

    /**
     * 查询产品镜像列表
     *
     * 该接口用于查询云桌面支持的产品镜像列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListImagesRequest 请求对象
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
     * @param request ListImagesRequest 请求对象
     * @return SyncInvoker<ListImagesRequest, ListImagesResponse>
     */
    public SyncInvoker<ListImagesRequest, ListImagesResponse> listImagesInvoker(ListImagesRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.listImages, hcClient);
    }

    /**
     * 子任务查询
     *
     * 该接口用于查询异步任务执行情况，比如查询创建桌面的执行状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListItaSubJobsRequest 请求对象
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
     * @param request ListItaSubJobsRequest 请求对象
     * @return SyncInvoker<ListItaSubJobsRequest, ListItaSubJobsResponse>
     */
    public SyncInvoker<ListItaSubJobsRequest, ListItaSubJobsResponse> listItaSubJobsInvoker(
        ListItaSubJobsRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.listItaSubJobs, hcClient);
    }

    /**
     * 开通桌面上网功能
     *
     * 开通桌面上网功能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ApplyDesktopsInternetRequest 请求对象
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
     * @param request ApplyDesktopsInternetRequest 请求对象
     * @return SyncInvoker<ApplyDesktopsInternetRequest, ApplyDesktopsInternetResponse>
     */
    public SyncInvoker<ApplyDesktopsInternetRequest, ApplyDesktopsInternetResponse> applyDesktopsInternetInvoker(
        ApplyDesktopsInternetRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.applyDesktopsInternet, hcClient);
    }

    /**
     * 桌面绑定EIP
     *
     * 桌面绑定EIP。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AssociateDesktopsEipRequest 请求对象
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
     * @param request AssociateDesktopsEipRequest 请求对象
     * @return SyncInvoker<AssociateDesktopsEipRequest, AssociateDesktopsEipResponse>
     */
    public SyncInvoker<AssociateDesktopsEipRequest, AssociateDesktopsEipResponse> associateDesktopsEipInvoker(
        AssociateDesktopsEipRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.associateDesktopsEip, hcClient);
    }

    /**
     * 批量桌面解绑EIP
     *
     * 批量桌面解绑EIP。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDisassociateDesktopsEipRequest 请求对象
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
     * @param request BatchDisassociateDesktopsEipRequest 请求对象
     * @return SyncInvoker<BatchDisassociateDesktopsEipRequest, BatchDisassociateDesktopsEipResponse>
     */
    public SyncInvoker<BatchDisassociateDesktopsEipRequest, BatchDisassociateDesktopsEipResponse> batchDisassociateDesktopsEipInvoker(
        BatchDisassociateDesktopsEipRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.batchDisassociateDesktopsEip, hcClient);
    }

    /**
     * 查询已绑定桌面和未绑定的Eip
     *
     * 查询已绑定桌面和未绑定的Eip。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDesktopsEipsRequest 请求对象
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
     * @param request ListDesktopsEipsRequest 请求对象
     * @return SyncInvoker<ListDesktopsEipsRequest, ListDesktopsEipsResponse>
     */
    public SyncInvoker<ListDesktopsEipsRequest, ListDesktopsEipsResponse> listDesktopsEipsInvoker(
        ListDesktopsEipsRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.listDesktopsEips, hcClient);
    }

    /**
     * 查询产品套餐列表
     *
     * 该接口用于查询云桌面支持的产品套餐列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProductsRequest 请求对象
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
     * @param request ListProductsRequest 请求对象
     * @return SyncInvoker<ListProductsRequest, ListProductsResponse>
     */
    public SyncInvoker<ListProductsRequest, ListProductsResponse> listProductsInvoker(ListProductsRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.listProducts, hcClient);
    }

    /**
     * 查询租户配额
     *
     * Console Framework和WKSDesktopManager调用该接口查询租户配额。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowQuotasRequest 请求对象
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
     * @param request ShowQuotasRequest 请求对象
     * @return SyncInvoker<ShowQuotasRequest, ShowQuotasResponse>
     */
    public SyncInvoker<ShowQuotasRequest, ShowQuotasResponse> showQuotasInvoker(ShowQuotasRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.showQuotas, hcClient);
    }

    /**
     * 批量删除定时任务
     *
     * 批量删除定时任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteScheduledTasksRequest 请求对象
     * @return BatchDeleteScheduledTasksResponse
     */
    public BatchDeleteScheduledTasksResponse batchDeleteScheduledTasks(BatchDeleteScheduledTasksRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.batchDeleteScheduledTasks);
    }

    /**
     * 批量删除定时任务
     *
     * 批量删除定时任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteScheduledTasksRequest 请求对象
     * @return SyncInvoker<BatchDeleteScheduledTasksRequest, BatchDeleteScheduledTasksResponse>
     */
    public SyncInvoker<BatchDeleteScheduledTasksRequest, BatchDeleteScheduledTasksResponse> batchDeleteScheduledTasksInvoker(
        BatchDeleteScheduledTasksRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.batchDeleteScheduledTasks, hcClient);
    }

    /**
     * 创建定时任务
     *
     * 创建定时任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateScheduledTasksRequest 请求对象
     * @return CreateScheduledTasksResponse
     */
    public CreateScheduledTasksResponse createScheduledTasks(CreateScheduledTasksRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.createScheduledTasks);
    }

    /**
     * 创建定时任务
     *
     * 创建定时任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateScheduledTasksRequest 请求对象
     * @return SyncInvoker<CreateScheduledTasksRequest, CreateScheduledTasksResponse>
     */
    public SyncInvoker<CreateScheduledTasksRequest, CreateScheduledTasksResponse> createScheduledTasksInvoker(
        CreateScheduledTasksRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.createScheduledTasks, hcClient);
    }

    /**
     * 删除定时任务
     *
     * 删除定时任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteScheduledTasksRequest 请求对象
     * @return DeleteScheduledTasksResponse
     */
    public DeleteScheduledTasksResponse deleteScheduledTasks(DeleteScheduledTasksRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.deleteScheduledTasks);
    }

    /**
     * 删除定时任务
     *
     * 删除定时任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteScheduledTasksRequest 请求对象
     * @return SyncInvoker<DeleteScheduledTasksRequest, DeleteScheduledTasksResponse>
     */
    public SyncInvoker<DeleteScheduledTasksRequest, DeleteScheduledTasksResponse> deleteScheduledTasksInvoker(
        DeleteScheduledTasksRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.deleteScheduledTasks, hcClient);
    }

    /**
     * 未来执行的具体时间列表
     *
     * 未来执行的具体时间列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFutureExecutionsRequest 请求对象
     * @return ListFutureExecutionsResponse
     */
    public ListFutureExecutionsResponse listFutureExecutions(ListFutureExecutionsRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.listFutureExecutions);
    }

    /**
     * 未来执行的具体时间列表
     *
     * 未来执行的具体时间列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFutureExecutionsRequest 请求对象
     * @return SyncInvoker<ListFutureExecutionsRequest, ListFutureExecutionsResponse>
     */
    public SyncInvoker<ListFutureExecutionsRequest, ListFutureExecutionsResponse> listFutureExecutionsInvoker(
        ListFutureExecutionsRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.listFutureExecutions, hcClient);
    }

    /**
     * 查询定时任务列表
     *
     * 查询定时任务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListScheduledTasksRequest 请求对象
     * @return ListScheduledTasksResponse
     */
    public ListScheduledTasksResponse listScheduledTasks(ListScheduledTasksRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.listScheduledTasks);
    }

    /**
     * 查询定时任务列表
     *
     * 查询定时任务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListScheduledTasksRequest 请求对象
     * @return SyncInvoker<ListScheduledTasksRequest, ListScheduledTasksResponse>
     */
    public SyncInvoker<ListScheduledTasksRequest, ListScheduledTasksResponse> listScheduledTasksInvoker(
        ListScheduledTasksRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.listScheduledTasks, hcClient);
    }

    /**
     * 查询定时任务执行记录
     *
     * 查询定时任务执行记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListScheduledTasksRecordsRequest 请求对象
     * @return ListScheduledTasksRecordsResponse
     */
    public ListScheduledTasksRecordsResponse listScheduledTasksRecords(ListScheduledTasksRecordsRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.listScheduledTasksRecords);
    }

    /**
     * 查询定时任务执行记录
     *
     * 查询定时任务执行记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListScheduledTasksRecordsRequest 请求对象
     * @return SyncInvoker<ListScheduledTasksRecordsRequest, ListScheduledTasksRecordsResponse>
     */
    public SyncInvoker<ListScheduledTasksRecordsRequest, ListScheduledTasksRecordsResponse> listScheduledTasksRecordsInvoker(
        ListScheduledTasksRecordsRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.listScheduledTasksRecords, hcClient);
    }

    /**
     * 查询定时任务执行记录详情
     *
     * 查询定时任务执行记录详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListScheduledTasksRecordsDetailsRequest 请求对象
     * @return ListScheduledTasksRecordsDetailsResponse
     */
    public ListScheduledTasksRecordsDetailsResponse listScheduledTasksRecordsDetails(
        ListScheduledTasksRecordsDetailsRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.listScheduledTasksRecordsDetails);
    }

    /**
     * 查询定时任务执行记录详情
     *
     * 查询定时任务执行记录详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListScheduledTasksRecordsDetailsRequest 请求对象
     * @return SyncInvoker<ListScheduledTasksRecordsDetailsRequest, ListScheduledTasksRecordsDetailsResponse>
     */
    public SyncInvoker<ListScheduledTasksRecordsDetailsRequest, ListScheduledTasksRecordsDetailsResponse> listScheduledTasksRecordsDetailsInvoker(
        ListScheduledTasksRecordsDetailsRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.listScheduledTasksRecordsDetails, hcClient);
    }

    /**
     * 查询定时任务详情
     *
     * 查询定时任务详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowScheduledTasksRequest 请求对象
     * @return ShowScheduledTasksResponse
     */
    public ShowScheduledTasksResponse showScheduledTasks(ShowScheduledTasksRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.showScheduledTasks);
    }

    /**
     * 查询定时任务详情
     *
     * 查询定时任务详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowScheduledTasksRequest 请求对象
     * @return SyncInvoker<ShowScheduledTasksRequest, ShowScheduledTasksResponse>
     */
    public SyncInvoker<ShowScheduledTasksRequest, ShowScheduledTasksResponse> showScheduledTasksInvoker(
        ShowScheduledTasksRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.showScheduledTasks, hcClient);
    }

    /**
     * 修改定时任务
     *
     * 修改定时任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateScheduledTasksRequest 请求对象
     * @return UpdateScheduledTasksResponse
     */
    public UpdateScheduledTasksResponse updateScheduledTasks(UpdateScheduledTasksRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.updateScheduledTasks);
    }

    /**
     * 修改定时任务
     *
     * 修改定时任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateScheduledTasksRequest 请求对象
     * @return SyncInvoker<UpdateScheduledTasksRequest, UpdateScheduledTasksResponse>
     */
    public SyncInvoker<UpdateScheduledTasksRequest, UpdateScheduledTasksResponse> updateScheduledTasksInvoker(
        UpdateScheduledTasksRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.updateScheduledTasks, hcClient);
    }

    /**
     * 新增通知规则
     *
     * 新增对应指标的通知规则;对应指标满足相应的规则条件时发送通知
     * 同一指标的规则不允许重复;
     * 统计指标名称，目前仅支持固定值：desktop_idle_duration
     *   * &#x60;desktop_idle_duration&#x60; -  桌面空闲时长, 仅允许设置 &#39;&gt;&#x3D;&#39; 阈值
     * 注：需先为云服务添加委托授权，否则无法正常发送通知到SMN
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddMetricNotifyRuleRequest 请求对象
     * @return AddMetricNotifyRuleResponse
     */
    public AddMetricNotifyRuleResponse addMetricNotifyRule(AddMetricNotifyRuleRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.addMetricNotifyRule);
    }

    /**
     * 新增通知规则
     *
     * 新增对应指标的通知规则;对应指标满足相应的规则条件时发送通知
     * 同一指标的规则不允许重复;
     * 统计指标名称，目前仅支持固定值：desktop_idle_duration
     *   * &#x60;desktop_idle_duration&#x60; -  桌面空闲时长, 仅允许设置 &#39;&gt;&#x3D;&#39; 阈值
     * 注：需先为云服务添加委托授权，否则无法正常发送通知到SMN
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddMetricNotifyRuleRequest 请求对象
     * @return SyncInvoker<AddMetricNotifyRuleRequest, AddMetricNotifyRuleResponse>
     */
    public SyncInvoker<AddMetricNotifyRuleRequest, AddMetricNotifyRuleResponse> addMetricNotifyRuleInvoker(
        AddMetricNotifyRuleRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.addMetricNotifyRule, hcClient);
    }

    /**
     * 删除通知规则
     *
     * 删除对应指标的通知规则;对应指标满足相应的规则条件时发送通知
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteMetricNotifyRuleRequest 请求对象
     * @return DeleteMetricNotifyRuleResponse
     */
    public DeleteMetricNotifyRuleResponse deleteMetricNotifyRule(DeleteMetricNotifyRuleRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.deleteMetricNotifyRule);
    }

    /**
     * 删除通知规则
     *
     * 删除对应指标的通知规则;对应指标满足相应的规则条件时发送通知
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteMetricNotifyRuleRequest 请求对象
     * @return SyncInvoker<DeleteMetricNotifyRuleRequest, DeleteMetricNotifyRuleResponse>
     */
    public SyncInvoker<DeleteMetricNotifyRuleRequest, DeleteMetricNotifyRuleResponse> deleteMetricNotifyRuleInvoker(
        DeleteMetricNotifyRuleRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.deleteMetricNotifyRule, hcClient);
    }

    /**
     * 查询桌面使用情况统计数据
     *
     * 查询桌面使用统计信息;
     * 云服务每天凌晨02:00进行聚合运算前一天00:00:00~23:59:59的使用时长,并将周期范围内的数据聚合到周期边界上
     * 跨天的记录会按照统计周期进行计算
     * 假设一天内桌面登录多次，09:00~12:00,13:00~21:00,22:00~01:00(次日):
     * 则当天的累计使用时长数据会被汇聚到23:59:59这个点;总使用时长为 3hours(09:00~12:00)+8hours(13:00~21:00)+2hours(22:00~00:00)
     * 仅能查询最近180天已进行汇聚计算的数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDesktopUsageMetricRequest 请求对象
     * @return ListDesktopUsageMetricResponse
     */
    public ListDesktopUsageMetricResponse listDesktopUsageMetric(ListDesktopUsageMetricRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.listDesktopUsageMetric);
    }

    /**
     * 查询桌面使用情况统计数据
     *
     * 查询桌面使用统计信息;
     * 云服务每天凌晨02:00进行聚合运算前一天00:00:00~23:59:59的使用时长,并将周期范围内的数据聚合到周期边界上
     * 跨天的记录会按照统计周期进行计算
     * 假设一天内桌面登录多次，09:00~12:00,13:00~21:00,22:00~01:00(次日):
     * 则当天的累计使用时长数据会被汇聚到23:59:59这个点;总使用时长为 3hours(09:00~12:00)+8hours(13:00~21:00)+2hours(22:00~00:00)
     * 仅能查询最近180天已进行汇聚计算的数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDesktopUsageMetricRequest 请求对象
     * @return SyncInvoker<ListDesktopUsageMetricRequest, ListDesktopUsageMetricResponse>
     */
    public SyncInvoker<ListDesktopUsageMetricRequest, ListDesktopUsageMetricResponse> listDesktopUsageMetricInvoker(
        ListDesktopUsageMetricRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.listDesktopUsageMetric, hcClient);
    }

    /**
     * 查询对应指标维度是否存在满足通知规则的记录
     *
     * 查询对应指标维度是否存在满足通知规则的记录;
     * 查询结果仅表示满足相应指标维度下对应通知规则可产生的通知记录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMetricNotifyRecordRequest 请求对象
     * @return ListMetricNotifyRecordResponse
     */
    public ListMetricNotifyRecordResponse listMetricNotifyRecord(ListMetricNotifyRecordRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.listMetricNotifyRecord);
    }

    /**
     * 查询对应指标维度是否存在满足通知规则的记录
     *
     * 查询对应指标维度是否存在满足通知规则的记录;
     * 查询结果仅表示满足相应指标维度下对应通知规则可产生的通知记录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMetricNotifyRecordRequest 请求对象
     * @return SyncInvoker<ListMetricNotifyRecordRequest, ListMetricNotifyRecordResponse>
     */
    public SyncInvoker<ListMetricNotifyRecordRequest, ListMetricNotifyRecordResponse> listMetricNotifyRecordInvoker(
        ListMetricNotifyRecordRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.listMetricNotifyRecord, hcClient);
    }

    /**
     * 查询通知规则
     *
     * 查询对应指标的通知规则;
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMetricNotifyRuleRequest 请求对象
     * @return ListMetricNotifyRuleResponse
     */
    public ListMetricNotifyRuleResponse listMetricNotifyRule(ListMetricNotifyRuleRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.listMetricNotifyRule);
    }

    /**
     * 查询通知规则
     *
     * 查询对应指标的通知规则;
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMetricNotifyRuleRequest 请求对象
     * @return SyncInvoker<ListMetricNotifyRuleRequest, ListMetricNotifyRuleResponse>
     */
    public SyncInvoker<ListMetricNotifyRuleRequest, ListMetricNotifyRuleResponse> listMetricNotifyRuleInvoker(
        ListMetricNotifyRuleRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.listMetricNotifyRule, hcClient);
    }

    /**
     * 查询用户使用统计数据
     *
     * 查询用户使用统计信息;
     * 最多查询30天内的数据;
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUserUsageMetricRequest 请求对象
     * @return ListUserUsageMetricResponse
     */
    public ListUserUsageMetricResponse listUserUsageMetric(ListUserUsageMetricRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.listUserUsageMetric);
    }

    /**
     * 查询用户使用统计数据
     *
     * 查询用户使用统计信息;
     * 最多查询30天内的数据;
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUserUsageMetricRequest 请求对象
     * @return SyncInvoker<ListUserUsageMetricRequest, ListUserUsageMetricResponse>
     */
    public SyncInvoker<ListUserUsageMetricRequest, ListUserUsageMetricResponse> listUserUsageMetricInvoker(
        ListUserUsageMetricRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.listUserUsageMetric, hcClient);
    }

    /**
     * 更新通知规则
     *
     * 更新对应指标的通知规则;对应指标满足相应的规则条件时发送通知
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateMetricNotifyRuleRequest 请求对象
     * @return UpdateMetricNotifyRuleResponse
     */
    public UpdateMetricNotifyRuleResponse updateMetricNotifyRule(UpdateMetricNotifyRuleRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.updateMetricNotifyRule);
    }

    /**
     * 更新通知规则
     *
     * 更新对应指标的通知规则;对应指标满足相应的规则条件时发送通知
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateMetricNotifyRuleRequest 请求对象
     * @return SyncInvoker<UpdateMetricNotifyRuleRequest, UpdateMetricNotifyRuleResponse>
     */
    public SyncInvoker<UpdateMetricNotifyRuleRequest, UpdateMetricNotifyRuleResponse> updateMetricNotifyRuleInvoker(
        UpdateMetricNotifyRuleRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.updateMetricNotifyRule, hcClient);
    }

    /**
     * 增加终端与桌面绑定配置
     *
     * 增加终端与桌面绑定配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTerminalsBindingDesktopsRequest 请求对象
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
     * @param request CreateTerminalsBindingDesktopsRequest 请求对象
     * @return SyncInvoker<CreateTerminalsBindingDesktopsRequest, CreateTerminalsBindingDesktopsResponse>
     */
    public SyncInvoker<CreateTerminalsBindingDesktopsRequest, CreateTerminalsBindingDesktopsResponse> createTerminalsBindingDesktopsInvoker(
        CreateTerminalsBindingDesktopsRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.createTerminalsBindingDesktops, hcClient);
    }

    /**
     * 删除终端与桌面绑定配置
     *
     * 删除终端与桌面绑定配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTerminalsBindingDesktopsRequest 请求对象
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
     * @param request DeleteTerminalsBindingDesktopsRequest 请求对象
     * @return SyncInvoker<DeleteTerminalsBindingDesktopsRequest, DeleteTerminalsBindingDesktopsResponse>
     */
    public SyncInvoker<DeleteTerminalsBindingDesktopsRequest, DeleteTerminalsBindingDesktopsResponse> deleteTerminalsBindingDesktopsInvoker(
        DeleteTerminalsBindingDesktopsRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.deleteTerminalsBindingDesktops, hcClient);
    }

    /**
     * 查询终端与桌面绑定配置列表
     *
     * 查询终端与桌面绑定配置列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTerminalsBindingDesktopsRequest 请求对象
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
     * @param request ListTerminalsBindingDesktopsRequest 请求对象
     * @return SyncInvoker<ListTerminalsBindingDesktopsRequest, ListTerminalsBindingDesktopsResponse>
     */
    public SyncInvoker<ListTerminalsBindingDesktopsRequest, ListTerminalsBindingDesktopsResponse> listTerminalsBindingDesktopsInvoker(
        ListTerminalsBindingDesktopsRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.listTerminalsBindingDesktops, hcClient);
    }

    /**
     * 查询终端与桌面绑定的开关配置信息
     *
     * 查询终端与桌面绑定的开关配置信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTerminalsBindingDesktopsConfigRequest 请求对象
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
     * @param request ListTerminalsBindingDesktopsConfigRequest 请求对象
     * @return SyncInvoker<ListTerminalsBindingDesktopsConfigRequest, ListTerminalsBindingDesktopsConfigResponse>
     */
    public SyncInvoker<ListTerminalsBindingDesktopsConfigRequest, ListTerminalsBindingDesktopsConfigResponse> listTerminalsBindingDesktopsConfigInvoker(
        ListTerminalsBindingDesktopsConfigRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.listTerminalsBindingDesktopsConfig, hcClient);
    }

    /**
     * 修改终端与桌面绑定配置
     *
     * 修改终端与桌面绑定配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTerminalsBindingDesktopsRequest 请求对象
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
     * @param request UpdateTerminalsBindingDesktopsRequest 请求对象
     * @return SyncInvoker<UpdateTerminalsBindingDesktopsRequest, UpdateTerminalsBindingDesktopsResponse>
     */
    public SyncInvoker<UpdateTerminalsBindingDesktopsRequest, UpdateTerminalsBindingDesktopsResponse> updateTerminalsBindingDesktopsInvoker(
        UpdateTerminalsBindingDesktopsRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.updateTerminalsBindingDesktops, hcClient);
    }

    /**
     * 设置终端与桌面绑定的开关配置
     *
     * 设置终端与桌面绑定的开关配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTerminalsBindingDesktopsConfigRequest 请求对象
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
     * @param request UpdateTerminalsBindingDesktopsConfigRequest 请求对象
     * @return SyncInvoker<UpdateTerminalsBindingDesktopsConfigRequest, UpdateTerminalsBindingDesktopsConfigResponse>
     */
    public SyncInvoker<UpdateTerminalsBindingDesktopsConfigRequest, UpdateTerminalsBindingDesktopsConfigResponse> updateTerminalsBindingDesktopsConfigInvoker(
        UpdateTerminalsBindingDesktopsConfigRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.updateTerminalsBindingDesktopsConfig, hcClient);
    }

    /**
     * 批量创建用户
     *
     * 该接口用于批量创建用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateUsersRequest 请求对象
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
     * @param request BatchCreateUsersRequest 请求对象
     * @return SyncInvoker<BatchCreateUsersRequest, BatchCreateUsersResponse>
     */
    public SyncInvoker<BatchCreateUsersRequest, BatchCreateUsersResponse> batchCreateUsersInvoker(
        BatchCreateUsersRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.batchCreateUsers, hcClient);
    }

    /**
     * 解绑OTP设备
     *
     * 该接口用于解绑用户的OTP设备。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteOtpDevicesRequest 请求对象
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
     * @param request BatchDeleteOtpDevicesRequest 请求对象
     * @return SyncInvoker<BatchDeleteOtpDevicesRequest, BatchDeleteOtpDevicesResponse>
     */
    public SyncInvoker<BatchDeleteOtpDevicesRequest, BatchDeleteOtpDevicesResponse> batchDeleteOtpDevicesInvoker(
        BatchDeleteOtpDevicesRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.batchDeleteOtpDevices, hcClient);
    }

    /**
     * 操作用户
     *
     * 该接口用于操作用户，包含三种操作：锁定、解锁和重置密码（重置密码建议使用/v2/{project_id}/users/{user_id}/random-password接口，在没有通知方式的情况下必须使用/v2/{project_id}/users/{user_id}/random-password接口）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeUserStatusRequest 请求对象
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
     * @param request ChangeUserStatusRequest 请求对象
     * @return SyncInvoker<ChangeUserStatusRequest, ChangeUserStatusResponse>
     */
    public SyncInvoker<ChangeUserStatusRequest, ChangeUserStatusResponse> changeUserStatusInvoker(
        ChangeUserStatusRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.changeUserStatus, hcClient);
    }

    /**
     * 创建用户
     *
     * 该接口用于创建桌面用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDesktopUserRequest 请求对象
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
     * @param request CreateDesktopUserRequest 请求对象
     * @return SyncInvoker<CreateDesktopUserRequest, CreateDesktopUserResponse>
     */
    public SyncInvoker<CreateDesktopUserRequest, CreateDesktopUserResponse> createDesktopUserInvoker(
        CreateDesktopUserRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.createDesktopUser, hcClient);
    }

    /**
     * 删除指定用户
     *
     * 删除指定的桌面用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteUserRequest 请求对象
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
     * @param request DeleteUserRequest 请求对象
     * @return SyncInvoker<DeleteUserRequest, DeleteUserResponse>
     */
    public SyncInvoker<DeleteUserRequest, DeleteUserResponse> deleteUserInvoker(DeleteUserRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.deleteUser, hcClient);
    }

    /**
     * 查询OTP设备
     *
     * 该接口用于查询相应用户下面的OTP设备。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListOtpDevicesByUserIdRequest 请求对象
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
     * @param request ListOtpDevicesByUserIdRequest 请求对象
     * @return SyncInvoker<ListOtpDevicesByUserIdRequest, ListOtpDevicesByUserIdResponse>
     */
    public SyncInvoker<ListOtpDevicesByUserIdRequest, ListOtpDevicesByUserIdResponse> listOtpDevicesByUserIdInvoker(
        ListOtpDevicesByUserIdRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.listOtpDevicesByUserId, hcClient);
    }

    /**
     * 查询用户详情信息
     *
     * 该接口用于查询指定的桌面用户详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUserDetailRequest 请求对象
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
     * @param request ListUserDetailRequest 请求对象
     * @return SyncInvoker<ListUserDetailRequest, ListUserDetailResponse>
     */
    public SyncInvoker<ListUserDetailRequest, ListUserDetailResponse> listUserDetailInvoker(
        ListUserDetailRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.listUserDetail, hcClient);
    }

    /**
     * 查询用户列表
     *
     * 该接口用于查询桌面用户列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUsersRequest 请求对象
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
     * @param request ListUsersRequest 请求对象
     * @return SyncInvoker<ListUsersRequest, ListUsersResponse>
     */
    public SyncInvoker<ListUsersRequest, ListUsersResponse> listUsersInvoker(ListUsersRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.listUsers, hcClient);
    }

    /**
     * 给用户重置随机密码
     *
     * 该接口用于给用户重置一个密码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResetRandomPasswordRequest 请求对象
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
     * @param request ResetRandomPasswordRequest 请求对象
     * @return SyncInvoker<ResetRandomPasswordRequest, ResetRandomPasswordResponse>
     */
    public SyncInvoker<ResetRandomPasswordRequest, ResetRandomPasswordResponse> resetRandomPasswordInvoker(
        ResetRandomPasswordRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.resetRandomPassword, hcClient);
    }

    /**
     * 修改用户信息
     *
     * 该接口用于修改桌面用户信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateUserInfoRequest 请求对象
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
     * @param request UpdateUserInfoRequest 请求对象
     * @return SyncInvoker<UpdateUserInfoRequest, UpdateUserInfoResponse>
     */
    public SyncInvoker<UpdateUserInfoRequest, UpdateUserInfoResponse> updateUserInfoInvoker(
        UpdateUserInfoRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.updateUserInfo, hcClient);
    }

    /**
     * 增加桌面磁盘
     *
     * 增加桌面磁盘。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddVolumesRequest 请求对象
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
     * @param request AddVolumesRequest 请求对象
     * @return SyncInvoker<AddVolumesRequest, AddVolumesResponse>
     */
    public SyncInvoker<AddVolumesRequest, AddVolumesResponse> addVolumesInvoker(AddVolumesRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.addVolumes, hcClient);
    }

    /**
     * 删除桌面数据盘
     *
     * 删除桌面数据盘，删除后无法恢复。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDesktopVolumesRequest 请求对象
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
     * @param request DeleteDesktopVolumesRequest 请求对象
     * @return SyncInvoker<DeleteDesktopVolumesRequest, DeleteDesktopVolumesResponse>
     */
    public SyncInvoker<DeleteDesktopVolumesRequest, DeleteDesktopVolumesResponse> deleteDesktopVolumesInvoker(
        DeleteDesktopVolumesRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.deleteDesktopVolumes, hcClient);
    }

    /**
     * 扩容桌面磁盘
     *
     * 扩容桌面磁盘。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExpandVolumesRequest 请求对象
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
     * @param request ExpandVolumesRequest 请求对象
     * @return SyncInvoker<ExpandVolumesRequest, ExpandVolumesResponse>
     */
    public SyncInvoker<ExpandVolumesRequest, ExpandVolumesResponse> expandVolumesInvoker(ExpandVolumesRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.expandVolumes, hcClient);
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
     * @param request ApplyWorkspaceRequest 请求对象
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
     * @param request ApplyWorkspaceRequest 请求对象
     * @return SyncInvoker<ApplyWorkspaceRequest, ApplyWorkspaceResponse>
     */
    public SyncInvoker<ApplyWorkspaceRequest, ApplyWorkspaceResponse> applyWorkspaceInvoker(
        ApplyWorkspaceRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.applyWorkspace, hcClient);
    }

    /**
     * 注销云办公服务
     *
     * 该接口用于注销云办公服务。注销前请确保当前用户下的云桌面已经删除，注销后无法恢复。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CancelWorkspaceRequest 请求对象
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
     * @param request CancelWorkspaceRequest 请求对象
     * @return SyncInvoker<CancelWorkspaceRequest, CancelWorkspaceResponse>
     */
    public SyncInvoker<CancelWorkspaceRequest, CancelWorkspaceResponse> cancelWorkspaceInvoker(
        CancelWorkspaceRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.cancelWorkspace, hcClient);
    }

    /**
     * 查询云办公服务详情
     *
     * 该接口用于查询云办公服务详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWorkspacesRequest 请求对象
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
     * @param request ListWorkspacesRequest 请求对象
     * @return SyncInvoker<ListWorkspacesRequest, ListWorkspacesResponse>
     */
    public SyncInvoker<ListWorkspacesRequest, ListWorkspacesResponse> listWorkspacesInvoker(
        ListWorkspacesRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.listWorkspaces, hcClient);
    }

    /**
     * 查询云办公服务是否被锁定
     *
     * 查询云办公服务是否被锁定。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowWorkspaceLockRequest 请求对象
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
     * @param request ShowWorkspaceLockRequest 请求对象
     * @return SyncInvoker<ShowWorkspaceLockRequest, ShowWorkspaceLockResponse>
     */
    public SyncInvoker<ShowWorkspaceLockRequest, ShowWorkspaceLockResponse> showWorkspaceLockInvoker(
        ShowWorkspaceLockRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.showWorkspaceLock, hcClient);
    }

    /**
     * 解除云办公服务锁定状态
     *
     * 该接口目前支持解除云办公服务锁定状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UnlockWorkspaceRequest 请求对象
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
     * @param request UnlockWorkspaceRequest 请求对象
     * @return SyncInvoker<UnlockWorkspaceRequest, UnlockWorkspaceResponse>
     */
    public SyncInvoker<UnlockWorkspaceRequest, UnlockWorkspaceResponse> unlockWorkspaceInvoker(
        UnlockWorkspaceRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.unlockWorkspace, hcClient);
    }

    /**
     * 修改云办公服务属性
     *
     * 该接口目前支持修改云办公服务属性。单次请求仅支持修改一种属性类型。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateWorkspaceRequest 请求对象
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
     * @param request UpdateWorkspaceRequest 请求对象
     * @return SyncInvoker<UpdateWorkspaceRequest, UpdateWorkspaceResponse>
     */
    public SyncInvoker<UpdateWorkspaceRequest, UpdateWorkspaceResponse> updateWorkspaceInvoker(
        UpdateWorkspaceRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.updateWorkspace, hcClient);
    }

}
