package com.huaweicloud.sdk.codeartsdeploy.v2;

import com.huaweicloud.sdk.codeartsdeploy.v2.model.BatchDeleteAppRequest;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.BatchDeleteAppResponse;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.BatchDeleteHostsRequest;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.BatchDeleteHostsResponse;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.BatchUpdateApplicationPermissionsRequest;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.BatchUpdateApplicationPermissionsResponse;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.BatchUpdatePermissionLevelRequest;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.BatchUpdatePermissionLevelResponse;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.CheckCanCreateRequest;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.CheckCanCreateResponse;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.CheckIsDuplicateAppNameRequest;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.CheckIsDuplicateAppNameResponse;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.CheckWhetherHostGroupCanBeCreatedRequest;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.CheckWhetherHostGroupCanBeCreatedResponse;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.CopyApplicationRequest;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.CopyApplicationResponse;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.CopyHostsToTargetRequest;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.CopyHostsToTargetResponse;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.CreateAppGroupsRequest;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.CreateAppGroupsResponse;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.CreateAppRequest;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.CreateAppResponse;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.CreateDeployTaskByTemplateRequest;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.CreateDeployTaskByTemplateResponse;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.CreateDeploymentGroupRequest;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.CreateDeploymentGroupResponse;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.CreateDeploymentHostRequest;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.CreateDeploymentHostResponse;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.CreateEnvironmentRequest;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.CreateEnvironmentResponse;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.CreateHostClusterRequest;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.CreateHostClusterResponse;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.CreateHostRequest;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.CreateHostResponse;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.DeleteAppGroupsRequest;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.DeleteAppGroupsResponse;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.DeleteApplicationRequest;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.DeleteApplicationResponse;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.DeleteDeployTaskRequest;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.DeleteDeployTaskResponse;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.DeleteDeploymentGroupRequest;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.DeleteDeploymentGroupResponse;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.DeleteDeploymentHostRequest;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.DeleteDeploymentHostResponse;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.DeleteEnvironmentRequest;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.DeleteEnvironmentResponse;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.DeleteHostClusterRequest;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.DeleteHostClusterResponse;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.DeleteHostFromEnvironmentRequest;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.DeleteHostFromEnvironmentResponse;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.DeleteHostRequest;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.DeleteHostResponse;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.ImportHostToEnvironmentRequest;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.ImportHostToEnvironmentResponse;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.ListAllAppRequest;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.ListAllAppResponse;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.ListAppGroupsRequest;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.ListAppGroupsResponse;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.ListApplicationPermissionsRequest;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.ListApplicationPermissionsResponse;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.ListAssociateEnvironmentsInfosRequest;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.ListAssociateEnvironmentsInfosResponse;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.ListDeployTaskHistoryByDateRequest;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.ListDeployTaskHistoryByDateResponse;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.ListDeployTasksRequest;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.ListDeployTasksResponse;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.ListEnvironmentHostsRequest;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.ListEnvironmentHostsResponse;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.ListEnvironmentPermissionsRequest;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.ListEnvironmentPermissionsResponse;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.ListEnvironmentsRequest;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.ListEnvironmentsResponse;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.ListHostClustersRequest;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.ListHostClustersResponse;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.ListHostGroupBaseInfosRequest;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.ListHostGroupBaseInfosResponse;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.ListHostGroupPermissionsRequest;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.ListHostGroupPermissionsResponse;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.ListHostGroupsRequest;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.ListHostGroupsResponse;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.ListHostsRequest;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.ListHostsResponse;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.ListNewHostsRequest;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.ListNewHostsResponse;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.ListTaskSuccessRateRequest;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.ListTaskSuccessRateResponse;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.MoveAppGroupsRequest;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.MoveAppGroupsResponse;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.MoveAppToGroupRequest;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.MoveAppToGroupResponse;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.ShowAppDetailByIdRequest;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.ShowAppDetailByIdResponse;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.ShowDeployTaskDetailRequest;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.ShowDeployTaskDetailResponse;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.ShowDeploymentGroupDetailRequest;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.ShowDeploymentGroupDetailResponse;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.ShowDeploymentHostDetailRequest;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.ShowDeploymentHostDetailResponse;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.ShowEnvironmentDetailRequest;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.ShowEnvironmentDetailResponse;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.ShowExecutionParamsRequest;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.ShowExecutionParamsResponse;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.ShowHostClusterDetailRequest;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.ShowHostClusterDetailResponse;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.ShowHostDetailRequest;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.ShowHostDetailResponse;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.ShowProjectSuccessRateRequest;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.ShowProjectSuccessRateResponse;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.StartDeployTaskRequest;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.StartDeployTaskResponse;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.UpdateAppDisableStatusRequest;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.UpdateAppDisableStatusResponse;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.UpdateAppGroupsRequest;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.UpdateAppGroupsResponse;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.UpdateAppInfoRequest;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.UpdateAppInfoResponse;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.UpdateDeploymentGroupRequest;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.UpdateDeploymentGroupResponse;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.UpdateDeploymentHostRequest;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.UpdateDeploymentHostResponse;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.UpdateEnvironmentPermissionRequest;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.UpdateEnvironmentPermissionResponse;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.UpdateEnvironmentRequest;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.UpdateEnvironmentResponse;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.UpdateHostClusterRequest;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.UpdateHostClusterResponse;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.UpdateHostGroupPermissionsRequest;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.UpdateHostGroupPermissionsResponse;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.UpdateHostInfoRequest;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.UpdateHostInfoResponse;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;

public class CodeArtsDeployClient {

    protected HcClient hcClient;

    public CodeArtsDeployClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<CodeArtsDeployClient> newBuilder() {
        ClientBuilder<CodeArtsDeployClient> clientBuilder = new ClientBuilder<>(CodeArtsDeployClient::new);
        return clientBuilder;
    }

    /**
     * 创建分组
     *
     * 创建分组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAppGroupsRequest 请求对象
     * @return CreateAppGroupsResponse
     */
    public CreateAppGroupsResponse createAppGroups(CreateAppGroupsRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsDeployMeta.createAppGroups);
    }

    /**
     * 创建分组
     *
     * 创建分组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAppGroupsRequest 请求对象
     * @return SyncInvoker<CreateAppGroupsRequest, CreateAppGroupsResponse>
     */
    public SyncInvoker<CreateAppGroupsRequest, CreateAppGroupsResponse> createAppGroupsInvoker(
        CreateAppGroupsRequest request) {
        return new SyncInvoker<>(request, CodeArtsDeployMeta.createAppGroups, hcClient);
    }

    /**
     * 删除分组
     *
     * 删除分组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAppGroupsRequest 请求对象
     * @return DeleteAppGroupsResponse
     */
    public DeleteAppGroupsResponse deleteAppGroups(DeleteAppGroupsRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsDeployMeta.deleteAppGroups);
    }

    /**
     * 删除分组
     *
     * 删除分组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAppGroupsRequest 请求对象
     * @return SyncInvoker<DeleteAppGroupsRequest, DeleteAppGroupsResponse>
     */
    public SyncInvoker<DeleteAppGroupsRequest, DeleteAppGroupsResponse> deleteAppGroupsInvoker(
        DeleteAppGroupsRequest request) {
        return new SyncInvoker<>(request, CodeArtsDeployMeta.deleteAppGroups, hcClient);
    }

    /**
     * 查询分组列表
     *
     * 查询分组列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAppGroupsRequest 请求对象
     * @return ListAppGroupsResponse
     */
    public ListAppGroupsResponse listAppGroups(ListAppGroupsRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsDeployMeta.listAppGroups);
    }

    /**
     * 查询分组列表
     *
     * 查询分组列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAppGroupsRequest 请求对象
     * @return SyncInvoker<ListAppGroupsRequest, ListAppGroupsResponse>
     */
    public SyncInvoker<ListAppGroupsRequest, ListAppGroupsResponse> listAppGroupsInvoker(ListAppGroupsRequest request) {
        return new SyncInvoker<>(request, CodeArtsDeployMeta.listAppGroups, hcClient);
    }

    /**
     * 移动分组
     *
     * 往上或者往下移动单个分组,用来在页面上调整分组位置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request MoveAppGroupsRequest 请求对象
     * @return MoveAppGroupsResponse
     */
    public MoveAppGroupsResponse moveAppGroups(MoveAppGroupsRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsDeployMeta.moveAppGroups);
    }

    /**
     * 移动分组
     *
     * 往上或者往下移动单个分组,用来在页面上调整分组位置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request MoveAppGroupsRequest 请求对象
     * @return SyncInvoker<MoveAppGroupsRequest, MoveAppGroupsResponse>
     */
    public SyncInvoker<MoveAppGroupsRequest, MoveAppGroupsResponse> moveAppGroupsInvoker(MoveAppGroupsRequest request) {
        return new SyncInvoker<>(request, CodeArtsDeployMeta.moveAppGroups, hcClient);
    }

    /**
     * 移动应用至指定分组
     *
     * 将应用移动至指定分组（支持批量）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request MoveAppToGroupRequest 请求对象
     * @return MoveAppToGroupResponse
     */
    public MoveAppToGroupResponse moveAppToGroup(MoveAppToGroupRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsDeployMeta.moveAppToGroup);
    }

    /**
     * 移动应用至指定分组
     *
     * 将应用移动至指定分组（支持批量）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request MoveAppToGroupRequest 请求对象
     * @return SyncInvoker<MoveAppToGroupRequest, MoveAppToGroupResponse>
     */
    public SyncInvoker<MoveAppToGroupRequest, MoveAppToGroupResponse> moveAppToGroupInvoker(
        MoveAppToGroupRequest request) {
        return new SyncInvoker<>(request, CodeArtsDeployMeta.moveAppToGroup, hcClient);
    }

    /**
     * 修改分组
     *
     * 修改分组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAppGroupsRequest 请求对象
     * @return UpdateAppGroupsResponse
     */
    public UpdateAppGroupsResponse updateAppGroups(UpdateAppGroupsRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsDeployMeta.updateAppGroups);
    }

    /**
     * 修改分组
     *
     * 修改分组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAppGroupsRequest 请求对象
     * @return SyncInvoker<UpdateAppGroupsRequest, UpdateAppGroupsResponse>
     */
    public SyncInvoker<UpdateAppGroupsRequest, UpdateAppGroupsResponse> updateAppGroupsInvoker(
        UpdateAppGroupsRequest request) {
        return new SyncInvoker<>(request, CodeArtsDeployMeta.updateAppGroups, hcClient);
    }

    /**
     * 批量修改应用权限
     *
     * 批量修改应用权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUpdateApplicationPermissionsRequest 请求对象
     * @return BatchUpdateApplicationPermissionsResponse
     */
    public BatchUpdateApplicationPermissionsResponse batchUpdateApplicationPermissions(
        BatchUpdateApplicationPermissionsRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsDeployMeta.batchUpdateApplicationPermissions);
    }

    /**
     * 批量修改应用权限
     *
     * 批量修改应用权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUpdateApplicationPermissionsRequest 请求对象
     * @return SyncInvoker<BatchUpdateApplicationPermissionsRequest, BatchUpdateApplicationPermissionsResponse>
     */
    public SyncInvoker<BatchUpdateApplicationPermissionsRequest, BatchUpdateApplicationPermissionsResponse> batchUpdateApplicationPermissionsInvoker(
        BatchUpdateApplicationPermissionsRequest request) {
        return new SyncInvoker<>(request, CodeArtsDeployMeta.batchUpdateApplicationPermissions, hcClient);
    }

    /**
     * 批量配置应用下鉴权级别
     *
     * 批量配置应用下鉴权级别为项目级或实例级。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUpdatePermissionLevelRequest 请求对象
     * @return BatchUpdatePermissionLevelResponse
     */
    public BatchUpdatePermissionLevelResponse batchUpdatePermissionLevel(BatchUpdatePermissionLevelRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsDeployMeta.batchUpdatePermissionLevel);
    }

    /**
     * 批量配置应用下鉴权级别
     *
     * 批量配置应用下鉴权级别为项目级或实例级。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUpdatePermissionLevelRequest 请求对象
     * @return SyncInvoker<BatchUpdatePermissionLevelRequest, BatchUpdatePermissionLevelResponse>
     */
    public SyncInvoker<BatchUpdatePermissionLevelRequest, BatchUpdatePermissionLevelResponse> batchUpdatePermissionLevelInvoker(
        BatchUpdatePermissionLevelRequest request) {
        return new SyncInvoker<>(request, CodeArtsDeployMeta.batchUpdatePermissionLevel, hcClient);
    }

    /**
     * 查询当前用户是否有项目下创建应用权限
     *
     * 查询当前用户是否有项目下创建应用权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckCanCreateRequest 请求对象
     * @return CheckCanCreateResponse
     */
    public CheckCanCreateResponse checkCanCreate(CheckCanCreateRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsDeployMeta.checkCanCreate);
    }

    /**
     * 查询当前用户是否有项目下创建应用权限
     *
     * 查询当前用户是否有项目下创建应用权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckCanCreateRequest 请求对象
     * @return SyncInvoker<CheckCanCreateRequest, CheckCanCreateResponse>
     */
    public SyncInvoker<CheckCanCreateRequest, CheckCanCreateResponse> checkCanCreateInvoker(
        CheckCanCreateRequest request) {
        return new SyncInvoker<>(request, CodeArtsDeployMeta.checkCanCreate, hcClient);
    }

    /**
     * 查询应用实例级/项目级权限矩阵
     *
     * 查询应用实例级/项目级权限矩阵，传递app_id时，查询应用实例级权限矩阵；未传app_id，传递project_id时，查询应用项目级权限矩阵。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApplicationPermissionsRequest 请求对象
     * @return ListApplicationPermissionsResponse
     */
    public ListApplicationPermissionsResponse listApplicationPermissions(ListApplicationPermissionsRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsDeployMeta.listApplicationPermissions);
    }

    /**
     * 查询应用实例级/项目级权限矩阵
     *
     * 查询应用实例级/项目级权限矩阵，传递app_id时，查询应用实例级权限矩阵；未传app_id，传递project_id时，查询应用项目级权限矩阵。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApplicationPermissionsRequest 请求对象
     * @return SyncInvoker<ListApplicationPermissionsRequest, ListApplicationPermissionsResponse>
     */
    public SyncInvoker<ListApplicationPermissionsRequest, ListApplicationPermissionsResponse> listApplicationPermissionsInvoker(
        ListApplicationPermissionsRequest request) {
        return new SyncInvoker<>(request, CodeArtsDeployMeta.listApplicationPermissions, hcClient);
    }

    /**
     * 批量删除项目下应用
     *
     * 批量删除项目下应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteAppRequest 请求对象
     * @return BatchDeleteAppResponse
     */
    public BatchDeleteAppResponse batchDeleteApp(BatchDeleteAppRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsDeployMeta.batchDeleteApp);
    }

    /**
     * 批量删除项目下应用
     *
     * 批量删除项目下应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteAppRequest 请求对象
     * @return SyncInvoker<BatchDeleteAppRequest, BatchDeleteAppResponse>
     */
    public SyncInvoker<BatchDeleteAppRequest, BatchDeleteAppResponse> batchDeleteAppInvoker(
        BatchDeleteAppRequest request) {
        return new SyncInvoker<>(request, CodeArtsDeployMeta.batchDeleteApp, hcClient);
    }

    /**
     * 查询项目下是否存在同名应用
     *
     * 查询项目下是否存在同名应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckIsDuplicateAppNameRequest 请求对象
     * @return CheckIsDuplicateAppNameResponse
     */
    public CheckIsDuplicateAppNameResponse checkIsDuplicateAppName(CheckIsDuplicateAppNameRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsDeployMeta.checkIsDuplicateAppName);
    }

    /**
     * 查询项目下是否存在同名应用
     *
     * 查询项目下是否存在同名应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckIsDuplicateAppNameRequest 请求对象
     * @return SyncInvoker<CheckIsDuplicateAppNameRequest, CheckIsDuplicateAppNameResponse>
     */
    public SyncInvoker<CheckIsDuplicateAppNameRequest, CheckIsDuplicateAppNameResponse> checkIsDuplicateAppNameInvoker(
        CheckIsDuplicateAppNameRequest request) {
        return new SyncInvoker<>(request, CodeArtsDeployMeta.checkIsDuplicateAppName, hcClient);
    }

    /**
     * 复制应用
     *
     * 复制应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CopyApplicationRequest 请求对象
     * @return CopyApplicationResponse
     */
    public CopyApplicationResponse copyApplication(CopyApplicationRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsDeployMeta.copyApplication);
    }

    /**
     * 复制应用
     *
     * 复制应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CopyApplicationRequest 请求对象
     * @return SyncInvoker<CopyApplicationRequest, CopyApplicationResponse>
     */
    public SyncInvoker<CopyApplicationRequest, CopyApplicationResponse> copyApplicationInvoker(
        CopyApplicationRequest request) {
        return new SyncInvoker<>(request, CodeArtsDeployMeta.copyApplication, hcClient);
    }

    /**
     * 新建应用
     *
     * 新建应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAppRequest 请求对象
     * @return CreateAppResponse
     */
    public CreateAppResponse createApp(CreateAppRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsDeployMeta.createApp);
    }

    /**
     * 新建应用
     *
     * 新建应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAppRequest 请求对象
     * @return SyncInvoker<CreateAppRequest, CreateAppResponse>
     */
    public SyncInvoker<CreateAppRequest, CreateAppResponse> createAppInvoker(CreateAppRequest request) {
        return new SyncInvoker<>(request, CodeArtsDeployMeta.createApp, hcClient);
    }

    /**
     * 通过模板新建应用
     *
     * 通过模板新建应用。该接口于2024年09月30日后不再维护，推荐使用新版CreateApp接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDeployTaskByTemplateRequest 请求对象
     * @return CreateDeployTaskByTemplateResponse
     */
    public CreateDeployTaskByTemplateResponse createDeployTaskByTemplate(CreateDeployTaskByTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsDeployMeta.createDeployTaskByTemplate);
    }

    /**
     * 通过模板新建应用
     *
     * 通过模板新建应用。该接口于2024年09月30日后不再维护，推荐使用新版CreateApp接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDeployTaskByTemplateRequest 请求对象
     * @return SyncInvoker<CreateDeployTaskByTemplateRequest, CreateDeployTaskByTemplateResponse>
     */
    public SyncInvoker<CreateDeployTaskByTemplateRequest, CreateDeployTaskByTemplateResponse> createDeployTaskByTemplateInvoker(
        CreateDeployTaskByTemplateRequest request) {
        return new SyncInvoker<>(request, CodeArtsDeployMeta.createDeployTaskByTemplate, hcClient);
    }

    /**
     * 删除应用
     *
     * 根据应用id删除应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteApplicationRequest 请求对象
     * @return DeleteApplicationResponse
     */
    public DeleteApplicationResponse deleteApplication(DeleteApplicationRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsDeployMeta.deleteApplication);
    }

    /**
     * 删除应用
     *
     * 根据应用id删除应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteApplicationRequest 请求对象
     * @return SyncInvoker<DeleteApplicationRequest, DeleteApplicationResponse>
     */
    public SyncInvoker<DeleteApplicationRequest, DeleteApplicationResponse> deleteApplicationInvoker(
        DeleteApplicationRequest request) {
        return new SyncInvoker<>(request, CodeArtsDeployMeta.deleteApplication, hcClient);
    }

    /**
     * 删除应用
     *
     * 根据部署任务id删除应用。该接口于2024年09月30日后不再维护，推荐使用新版DeleteApplication接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDeployTaskRequest 请求对象
     * @return DeleteDeployTaskResponse
     */
    public DeleteDeployTaskResponse deleteDeployTask(DeleteDeployTaskRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsDeployMeta.deleteDeployTask);
    }

    /**
     * 删除应用
     *
     * 根据部署任务id删除应用。该接口于2024年09月30日后不再维护，推荐使用新版DeleteApplication接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDeployTaskRequest 请求对象
     * @return SyncInvoker<DeleteDeployTaskRequest, DeleteDeployTaskResponse>
     */
    public SyncInvoker<DeleteDeployTaskRequest, DeleteDeployTaskResponse> deleteDeployTaskInvoker(
        DeleteDeployTaskRequest request) {
        return new SyncInvoker<>(request, CodeArtsDeployMeta.deleteDeployTask, hcClient);
    }

    /**
     * 获取应用列表
     *
     * 查询项目下应用列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAllAppRequest 请求对象
     * @return ListAllAppResponse
     */
    public ListAllAppResponse listAllApp(ListAllAppRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsDeployMeta.listAllApp);
    }

    /**
     * 获取应用列表
     *
     * 查询项目下应用列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAllAppRequest 请求对象
     * @return SyncInvoker<ListAllAppRequest, ListAllAppResponse>
     */
    public SyncInvoker<ListAllAppRequest, ListAllAppResponse> listAllAppInvoker(ListAllAppRequest request) {
        return new SyncInvoker<>(request, CodeArtsDeployMeta.listAllApp, hcClient);
    }

    /**
     * 根据开始时间和结束时间查询项目下指定应用的历史部署记录列表
     *
     * 根据开始时间和结束时间查询项目下指定应用的历史部署记录列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDeployTaskHistoryByDateRequest 请求对象
     * @return ListDeployTaskHistoryByDateResponse
     */
    public ListDeployTaskHistoryByDateResponse listDeployTaskHistoryByDate(ListDeployTaskHistoryByDateRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsDeployMeta.listDeployTaskHistoryByDate);
    }

    /**
     * 根据开始时间和结束时间查询项目下指定应用的历史部署记录列表
     *
     * 根据开始时间和结束时间查询项目下指定应用的历史部署记录列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDeployTaskHistoryByDateRequest 请求对象
     * @return SyncInvoker<ListDeployTaskHistoryByDateRequest, ListDeployTaskHistoryByDateResponse>
     */
    public SyncInvoker<ListDeployTaskHistoryByDateRequest, ListDeployTaskHistoryByDateResponse> listDeployTaskHistoryByDateInvoker(
        ListDeployTaskHistoryByDateRequest request) {
        return new SyncInvoker<>(request, CodeArtsDeployMeta.listDeployTaskHistoryByDate, hcClient);
    }

    /**
     * 获取应用列表
     *
     * 查询项目下应用列表。该接口于2024年09月30日后不再维护，推荐使用新版ListAllApp接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDeployTasksRequest 请求对象
     * @return ListDeployTasksResponse
     */
    public ListDeployTasksResponse listDeployTasks(ListDeployTasksRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsDeployMeta.listDeployTasks);
    }

    /**
     * 获取应用列表
     *
     * 查询项目下应用列表。该接口于2024年09月30日后不再维护，推荐使用新版ListAllApp接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDeployTasksRequest 请求对象
     * @return SyncInvoker<ListDeployTasksRequest, ListDeployTasksResponse>
     */
    public SyncInvoker<ListDeployTasksRequest, ListDeployTasksResponse> listDeployTasksInvoker(
        ListDeployTasksRequest request) {
        return new SyncInvoker<>(request, CodeArtsDeployMeta.listDeployTasks, hcClient);
    }

    /**
     * 获取应用详情
     *
     * 根据应用id获取应用详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAppDetailByIdRequest 请求对象
     * @return ShowAppDetailByIdResponse
     */
    public ShowAppDetailByIdResponse showAppDetailById(ShowAppDetailByIdRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsDeployMeta.showAppDetailById);
    }

    /**
     * 获取应用详情
     *
     * 根据应用id获取应用详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAppDetailByIdRequest 请求对象
     * @return SyncInvoker<ShowAppDetailByIdRequest, ShowAppDetailByIdResponse>
     */
    public SyncInvoker<ShowAppDetailByIdRequest, ShowAppDetailByIdResponse> showAppDetailByIdInvoker(
        ShowAppDetailByIdRequest request) {
        return new SyncInvoker<>(request, CodeArtsDeployMeta.showAppDetailById, hcClient);
    }

    /**
     * 获取应用详情
     *
     * 根据部署任务id获取应用详情。该接口于2024年09月30日后不再维护，推荐使用新版ShowAppDetailById接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDeployTaskDetailRequest 请求对象
     * @return ShowDeployTaskDetailResponse
     */
    public ShowDeployTaskDetailResponse showDeployTaskDetail(ShowDeployTaskDetailRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsDeployMeta.showDeployTaskDetail);
    }

    /**
     * 获取应用详情
     *
     * 根据部署任务id获取应用详情。该接口于2024年09月30日后不再维护，推荐使用新版ShowAppDetailById接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDeployTaskDetailRequest 请求对象
     * @return SyncInvoker<ShowDeployTaskDetailRequest, ShowDeployTaskDetailResponse>
     */
    public SyncInvoker<ShowDeployTaskDetailRequest, ShowDeployTaskDetailResponse> showDeployTaskDetailInvoker(
        ShowDeployTaskDetailRequest request) {
        return new SyncInvoker<>(request, CodeArtsDeployMeta.showDeployTaskDetail, hcClient);
    }

    /**
     * 查询部署记录的执行参数
     *
     * 查询部署记录的执行参数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowExecutionParamsRequest 请求对象
     * @return ShowExecutionParamsResponse
     */
    public ShowExecutionParamsResponse showExecutionParams(ShowExecutionParamsRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsDeployMeta.showExecutionParams);
    }

    /**
     * 查询部署记录的执行参数
     *
     * 查询部署记录的执行参数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowExecutionParamsRequest 请求对象
     * @return SyncInvoker<ShowExecutionParamsRequest, ShowExecutionParamsResponse>
     */
    public SyncInvoker<ShowExecutionParamsRequest, ShowExecutionParamsResponse> showExecutionParamsInvoker(
        ShowExecutionParamsRequest request) {
        return new SyncInvoker<>(request, CodeArtsDeployMeta.showExecutionParams, hcClient);
    }

    /**
     * 部署应用
     *
     * 根据部署任务id部署应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartDeployTaskRequest 请求对象
     * @return StartDeployTaskResponse
     */
    public StartDeployTaskResponse startDeployTask(StartDeployTaskRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsDeployMeta.startDeployTask);
    }

    /**
     * 部署应用
     *
     * 根据部署任务id部署应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartDeployTaskRequest 请求对象
     * @return SyncInvoker<StartDeployTaskRequest, StartDeployTaskResponse>
     */
    public SyncInvoker<StartDeployTaskRequest, StartDeployTaskResponse> startDeployTaskInvoker(
        StartDeployTaskRequest request) {
        return new SyncInvoker<>(request, CodeArtsDeployMeta.startDeployTask, hcClient);
    }

    /**
     * 禁用/取消禁用应用
     *
     * 禁用/取消禁用应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAppDisableStatusRequest 请求对象
     * @return UpdateAppDisableStatusResponse
     */
    public UpdateAppDisableStatusResponse updateAppDisableStatus(UpdateAppDisableStatusRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsDeployMeta.updateAppDisableStatus);
    }

    /**
     * 禁用/取消禁用应用
     *
     * 禁用/取消禁用应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAppDisableStatusRequest 请求对象
     * @return SyncInvoker<UpdateAppDisableStatusRequest, UpdateAppDisableStatusResponse>
     */
    public SyncInvoker<UpdateAppDisableStatusRequest, UpdateAppDisableStatusResponse> updateAppDisableStatusInvoker(
        UpdateAppDisableStatusRequest request) {
        return new SyncInvoker<>(request, CodeArtsDeployMeta.updateAppDisableStatus, hcClient);
    }

    /**
     * 更新应用
     *
     * 更新应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAppInfoRequest 请求对象
     * @return UpdateAppInfoResponse
     */
    public UpdateAppInfoResponse updateAppInfo(UpdateAppInfoRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsDeployMeta.updateAppInfo);
    }

    /**
     * 更新应用
     *
     * 更新应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAppInfoRequest 请求对象
     * @return SyncInvoker<UpdateAppInfoRequest, UpdateAppInfoResponse>
     */
    public SyncInvoker<UpdateAppInfoRequest, UpdateAppInfoResponse> updateAppInfoInvoker(UpdateAppInfoRequest request) {
        return new SyncInvoker<>(request, CodeArtsDeployMeta.updateAppInfo, hcClient);
    }

    /**
     * 应用下创建环境
     *
     * 应用下创建环境。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateEnvironmentRequest 请求对象
     * @return CreateEnvironmentResponse
     */
    public CreateEnvironmentResponse createEnvironment(CreateEnvironmentRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsDeployMeta.createEnvironment);
    }

    /**
     * 应用下创建环境
     *
     * 应用下创建环境。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateEnvironmentRequest 请求对象
     * @return SyncInvoker<CreateEnvironmentRequest, CreateEnvironmentResponse>
     */
    public SyncInvoker<CreateEnvironmentRequest, CreateEnvironmentResponse> createEnvironmentInvoker(
        CreateEnvironmentRequest request) {
        return new SyncInvoker<>(request, CodeArtsDeployMeta.createEnvironment, hcClient);
    }

    /**
     * 删除应用下的环境
     *
     * 删除应用下的环境。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteEnvironmentRequest 请求对象
     * @return DeleteEnvironmentResponse
     */
    public DeleteEnvironmentResponse deleteEnvironment(DeleteEnvironmentRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsDeployMeta.deleteEnvironment);
    }

    /**
     * 删除应用下的环境
     *
     * 删除应用下的环境。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteEnvironmentRequest 请求对象
     * @return SyncInvoker<DeleteEnvironmentRequest, DeleteEnvironmentResponse>
     */
    public SyncInvoker<DeleteEnvironmentRequest, DeleteEnvironmentResponse> deleteEnvironmentInvoker(
        DeleteEnvironmentRequest request) {
        return new SyncInvoker<>(request, CodeArtsDeployMeta.deleteEnvironment, hcClient);
    }

    /**
     * 环境下删除主机
     *
     * 环境下删除主机。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteHostFromEnvironmentRequest 请求对象
     * @return DeleteHostFromEnvironmentResponse
     */
    public DeleteHostFromEnvironmentResponse deleteHostFromEnvironment(DeleteHostFromEnvironmentRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsDeployMeta.deleteHostFromEnvironment);
    }

    /**
     * 环境下删除主机
     *
     * 环境下删除主机。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteHostFromEnvironmentRequest 请求对象
     * @return SyncInvoker<DeleteHostFromEnvironmentRequest, DeleteHostFromEnvironmentResponse>
     */
    public SyncInvoker<DeleteHostFromEnvironmentRequest, DeleteHostFromEnvironmentResponse> deleteHostFromEnvironmentInvoker(
        DeleteHostFromEnvironmentRequest request) {
        return new SyncInvoker<>(request, CodeArtsDeployMeta.deleteHostFromEnvironment, hcClient);
    }

    /**
     * 环境下导入主机
     *
     * 环境下导入主机。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ImportHostToEnvironmentRequest 请求对象
     * @return ImportHostToEnvironmentResponse
     */
    public ImportHostToEnvironmentResponse importHostToEnvironment(ImportHostToEnvironmentRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsDeployMeta.importHostToEnvironment);
    }

    /**
     * 环境下导入主机
     *
     * 环境下导入主机。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ImportHostToEnvironmentRequest 请求对象
     * @return SyncInvoker<ImportHostToEnvironmentRequest, ImportHostToEnvironmentResponse>
     */
    public SyncInvoker<ImportHostToEnvironmentRequest, ImportHostToEnvironmentResponse> importHostToEnvironmentInvoker(
        ImportHostToEnvironmentRequest request) {
        return new SyncInvoker<>(request, CodeArtsDeployMeta.importHostToEnvironment, hcClient);
    }

    /**
     * 查询环境内的主机列表
     *
     * 查询环境内的主机列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEnvironmentHostsRequest 请求对象
     * @return ListEnvironmentHostsResponse
     */
    public ListEnvironmentHostsResponse listEnvironmentHosts(ListEnvironmentHostsRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsDeployMeta.listEnvironmentHosts);
    }

    /**
     * 查询环境内的主机列表
     *
     * 查询环境内的主机列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEnvironmentHostsRequest 请求对象
     * @return SyncInvoker<ListEnvironmentHostsRequest, ListEnvironmentHostsResponse>
     */
    public SyncInvoker<ListEnvironmentHostsRequest, ListEnvironmentHostsResponse> listEnvironmentHostsInvoker(
        ListEnvironmentHostsRequest request) {
        return new SyncInvoker<>(request, CodeArtsDeployMeta.listEnvironmentHosts, hcClient);
    }

    /**
     * 查询应用下环境列表
     *
     * 查询应用下环境列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEnvironmentsRequest 请求对象
     * @return ListEnvironmentsResponse
     */
    public ListEnvironmentsResponse listEnvironments(ListEnvironmentsRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsDeployMeta.listEnvironments);
    }

    /**
     * 查询应用下环境列表
     *
     * 查询应用下环境列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEnvironmentsRequest 请求对象
     * @return SyncInvoker<ListEnvironmentsRequest, ListEnvironmentsResponse>
     */
    public SyncInvoker<ListEnvironmentsRequest, ListEnvironmentsResponse> listEnvironmentsInvoker(
        ListEnvironmentsRequest request) {
        return new SyncInvoker<>(request, CodeArtsDeployMeta.listEnvironments, hcClient);
    }

    /**
     * 查询环境详情
     *
     * 查询环境详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowEnvironmentDetailRequest 请求对象
     * @return ShowEnvironmentDetailResponse
     */
    public ShowEnvironmentDetailResponse showEnvironmentDetail(ShowEnvironmentDetailRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsDeployMeta.showEnvironmentDetail);
    }

    /**
     * 查询环境详情
     *
     * 查询环境详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowEnvironmentDetailRequest 请求对象
     * @return SyncInvoker<ShowEnvironmentDetailRequest, ShowEnvironmentDetailResponse>
     */
    public SyncInvoker<ShowEnvironmentDetailRequest, ShowEnvironmentDetailResponse> showEnvironmentDetailInvoker(
        ShowEnvironmentDetailRequest request) {
        return new SyncInvoker<>(request, CodeArtsDeployMeta.showEnvironmentDetail, hcClient);
    }

    /**
     * 应用下编辑环境
     *
     * 应用下编辑环境。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateEnvironmentRequest 请求对象
     * @return UpdateEnvironmentResponse
     */
    public UpdateEnvironmentResponse updateEnvironment(UpdateEnvironmentRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsDeployMeta.updateEnvironment);
    }

    /**
     * 应用下编辑环境
     *
     * 应用下编辑环境。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateEnvironmentRequest 请求对象
     * @return SyncInvoker<UpdateEnvironmentRequest, UpdateEnvironmentResponse>
     */
    public SyncInvoker<UpdateEnvironmentRequest, UpdateEnvironmentResponse> updateEnvironmentInvoker(
        UpdateEnvironmentRequest request) {
        return new SyncInvoker<>(request, CodeArtsDeployMeta.updateEnvironment, hcClient);
    }

    /**
     * 查询环境权限
     *
     * 查询环境权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEnvironmentPermissionsRequest 请求对象
     * @return ListEnvironmentPermissionsResponse
     */
    public ListEnvironmentPermissionsResponse listEnvironmentPermissions(ListEnvironmentPermissionsRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsDeployMeta.listEnvironmentPermissions);
    }

    /**
     * 查询环境权限
     *
     * 查询环境权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEnvironmentPermissionsRequest 请求对象
     * @return SyncInvoker<ListEnvironmentPermissionsRequest, ListEnvironmentPermissionsResponse>
     */
    public SyncInvoker<ListEnvironmentPermissionsRequest, ListEnvironmentPermissionsResponse> listEnvironmentPermissionsInvoker(
        ListEnvironmentPermissionsRequest request) {
        return new SyncInvoker<>(request, CodeArtsDeployMeta.listEnvironmentPermissions, hcClient);
    }

    /**
     * 编辑环境权限
     *
     * 编辑环境权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateEnvironmentPermissionRequest 请求对象
     * @return UpdateEnvironmentPermissionResponse
     */
    public UpdateEnvironmentPermissionResponse updateEnvironmentPermission(UpdateEnvironmentPermissionRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsDeployMeta.updateEnvironmentPermission);
    }

    /**
     * 编辑环境权限
     *
     * 编辑环境权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateEnvironmentPermissionRequest 请求对象
     * @return SyncInvoker<UpdateEnvironmentPermissionRequest, UpdateEnvironmentPermissionResponse>
     */
    public SyncInvoker<UpdateEnvironmentPermissionRequest, UpdateEnvironmentPermissionResponse> updateEnvironmentPermissionInvoker(
        UpdateEnvironmentPermissionRequest request) {
        return new SyncInvoker<>(request, CodeArtsDeployMeta.updateEnvironmentPermission, hcClient);
    }

    /**
     * 批量删除主机集群下的主机
     *
     * 批量删除主机集群下的主机。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteHostsRequest 请求对象
     * @return BatchDeleteHostsResponse
     */
    public BatchDeleteHostsResponse batchDeleteHosts(BatchDeleteHostsRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsDeployMeta.batchDeleteHosts);
    }

    /**
     * 批量删除主机集群下的主机
     *
     * 批量删除主机集群下的主机。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteHostsRequest 请求对象
     * @return SyncInvoker<BatchDeleteHostsRequest, BatchDeleteHostsResponse>
     */
    public SyncInvoker<BatchDeleteHostsRequest, BatchDeleteHostsResponse> batchDeleteHostsInvoker(
        BatchDeleteHostsRequest request) {
        return new SyncInvoker<>(request, CodeArtsDeployMeta.batchDeleteHosts, hcClient);
    }

    /**
     * 批量复制主机至目标主机集群
     *
     * 批量复制主机至目标主机集群。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CopyHostsToTargetRequest 请求对象
     * @return CopyHostsToTargetResponse
     */
    public CopyHostsToTargetResponse copyHostsToTarget(CopyHostsToTargetRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsDeployMeta.copyHostsToTarget);
    }

    /**
     * 批量复制主机至目标主机集群
     *
     * 批量复制主机至目标主机集群。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CopyHostsToTargetRequest 请求对象
     * @return SyncInvoker<CopyHostsToTargetRequest, CopyHostsToTargetResponse>
     */
    public SyncInvoker<CopyHostsToTargetRequest, CopyHostsToTargetResponse> copyHostsToTargetInvoker(
        CopyHostsToTargetRequest request) {
        return new SyncInvoker<>(request, CodeArtsDeployMeta.copyHostsToTarget, hcClient);
    }

    /**
     * 新建主机
     *
     * 在指定主机集群下新建主机。该接口于2024年09月30日后不再维护，推荐使用新版CreateHost接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDeploymentHostRequest 请求对象
     * @return CreateDeploymentHostResponse
     */
    public CreateDeploymentHostResponse createDeploymentHost(CreateDeploymentHostRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsDeployMeta.createDeploymentHost);
    }

    /**
     * 新建主机
     *
     * 在指定主机集群下新建主机。该接口于2024年09月30日后不再维护，推荐使用新版CreateHost接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDeploymentHostRequest 请求对象
     * @return SyncInvoker<CreateDeploymentHostRequest, CreateDeploymentHostResponse>
     */
    public SyncInvoker<CreateDeploymentHostRequest, CreateDeploymentHostResponse> createDeploymentHostInvoker(
        CreateDeploymentHostRequest request) {
        return new SyncInvoker<>(request, CodeArtsDeployMeta.createDeploymentHost, hcClient);
    }

    /**
     * 新建主机
     *
     * 在指定主机集群下新建主机。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateHostRequest 请求对象
     * @return CreateHostResponse
     */
    public CreateHostResponse createHost(CreateHostRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsDeployMeta.createHost);
    }

    /**
     * 新建主机
     *
     * 在指定主机集群下新建主机。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateHostRequest 请求对象
     * @return SyncInvoker<CreateHostRequest, CreateHostResponse>
     */
    public SyncInvoker<CreateHostRequest, CreateHostResponse> createHostInvoker(CreateHostRequest request) {
        return new SyncInvoker<>(request, CodeArtsDeployMeta.createHost, hcClient);
    }

    /**
     * 删除主机
     *
     * 根据主机id删除主机。该接口于2024年9月30日后不再维护。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDeploymentHostRequest 请求对象
     * @return DeleteDeploymentHostResponse
     */
    public DeleteDeploymentHostResponse deleteDeploymentHost(DeleteDeploymentHostRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsDeployMeta.deleteDeploymentHost);
    }

    /**
     * 删除主机
     *
     * 根据主机id删除主机。该接口于2024年9月30日后不再维护。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDeploymentHostRequest 请求对象
     * @return SyncInvoker<DeleteDeploymentHostRequest, DeleteDeploymentHostResponse>
     */
    public SyncInvoker<DeleteDeploymentHostRequest, DeleteDeploymentHostResponse> deleteDeploymentHostInvoker(
        DeleteDeploymentHostRequest request) {
        return new SyncInvoker<>(request, CodeArtsDeployMeta.deleteDeploymentHost, hcClient);
    }

    /**
     * 删除主机集群下主机
     *
     * 根据主机id删除主机集群下主机。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteHostRequest 请求对象
     * @return DeleteHostResponse
     */
    public DeleteHostResponse deleteHost(DeleteHostRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsDeployMeta.deleteHost);
    }

    /**
     * 删除主机集群下主机
     *
     * 根据主机id删除主机集群下主机。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteHostRequest 请求对象
     * @return SyncInvoker<DeleteHostRequest, DeleteHostResponse>
     */
    public SyncInvoker<DeleteHostRequest, DeleteHostResponse> deleteHostInvoker(DeleteHostRequest request) {
        return new SyncInvoker<>(request, CodeArtsDeployMeta.deleteHost, hcClient);
    }

    /**
     * 查询主机列表
     *
     * 根据主机集群id查询指定主机集群下的主机列表。该接口于2024年09月30日后不再维护，推荐使用新版ListNewHosts接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHostsRequest 请求对象
     * @return ListHostsResponse
     */
    public ListHostsResponse listHosts(ListHostsRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsDeployMeta.listHosts);
    }

    /**
     * 查询主机列表
     *
     * 根据主机集群id查询指定主机集群下的主机列表。该接口于2024年09月30日后不再维护，推荐使用新版ListNewHosts接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHostsRequest 请求对象
     * @return SyncInvoker<ListHostsRequest, ListHostsResponse>
     */
    public SyncInvoker<ListHostsRequest, ListHostsResponse> listHostsInvoker(ListHostsRequest request) {
        return new SyncInvoker<>(request, CodeArtsDeployMeta.listHosts, hcClient);
    }

    /**
     * 查询主机列表
     *
     * 根据主机集群id查询指定主机集群下的主机列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListNewHostsRequest 请求对象
     * @return ListNewHostsResponse
     */
    public ListNewHostsResponse listNewHosts(ListNewHostsRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsDeployMeta.listNewHosts);
    }

    /**
     * 查询主机列表
     *
     * 根据主机集群id查询指定主机集群下的主机列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListNewHostsRequest 请求对象
     * @return SyncInvoker<ListNewHostsRequest, ListNewHostsResponse>
     */
    public SyncInvoker<ListNewHostsRequest, ListNewHostsResponse> listNewHostsInvoker(ListNewHostsRequest request) {
        return new SyncInvoker<>(request, CodeArtsDeployMeta.listNewHosts, hcClient);
    }

    /**
     * 查询主机详情
     *
     * 根据主机id查询主机详情。该接口于2024年09月30日后不再维护，推荐使用新版ShowHostDetail接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDeploymentHostDetailRequest 请求对象
     * @return ShowDeploymentHostDetailResponse
     */
    public ShowDeploymentHostDetailResponse showDeploymentHostDetail(ShowDeploymentHostDetailRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsDeployMeta.showDeploymentHostDetail);
    }

    /**
     * 查询主机详情
     *
     * 根据主机id查询主机详情。该接口于2024年09月30日后不再维护，推荐使用新版ShowHostDetail接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDeploymentHostDetailRequest 请求对象
     * @return SyncInvoker<ShowDeploymentHostDetailRequest, ShowDeploymentHostDetailResponse>
     */
    public SyncInvoker<ShowDeploymentHostDetailRequest, ShowDeploymentHostDetailResponse> showDeploymentHostDetailInvoker(
        ShowDeploymentHostDetailRequest request) {
        return new SyncInvoker<>(request, CodeArtsDeployMeta.showDeploymentHostDetail, hcClient);
    }

    /**
     * 查询主机详情
     *
     * 根据主机id查询主机详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHostDetailRequest 请求对象
     * @return ShowHostDetailResponse
     */
    public ShowHostDetailResponse showHostDetail(ShowHostDetailRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsDeployMeta.showHostDetail);
    }

    /**
     * 查询主机详情
     *
     * 根据主机id查询主机详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHostDetailRequest 请求对象
     * @return SyncInvoker<ShowHostDetailRequest, ShowHostDetailResponse>
     */
    public SyncInvoker<ShowHostDetailRequest, ShowHostDetailResponse> showHostDetailInvoker(
        ShowHostDetailRequest request) {
        return new SyncInvoker<>(request, CodeArtsDeployMeta.showHostDetail, hcClient);
    }

    /**
     * 修改主机
     *
     * 根据主机id修改主机信息。该接口于2024年9月30日后不再维护。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDeploymentHostRequest 请求对象
     * @return UpdateDeploymentHostResponse
     */
    public UpdateDeploymentHostResponse updateDeploymentHost(UpdateDeploymentHostRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsDeployMeta.updateDeploymentHost);
    }

    /**
     * 修改主机
     *
     * 根据主机id修改主机信息。该接口于2024年9月30日后不再维护。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDeploymentHostRequest 请求对象
     * @return SyncInvoker<UpdateDeploymentHostRequest, UpdateDeploymentHostResponse>
     */
    public SyncInvoker<UpdateDeploymentHostRequest, UpdateDeploymentHostResponse> updateDeploymentHostInvoker(
        UpdateDeploymentHostRequest request) {
        return new SyncInvoker<>(request, CodeArtsDeployMeta.updateDeploymentHost, hcClient);
    }

    /**
     * 编辑主机集群下主机信息
     *
     * 根据主机id编辑主机集群下主机信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateHostInfoRequest 请求对象
     * @return UpdateHostInfoResponse
     */
    public UpdateHostInfoResponse updateHostInfo(UpdateHostInfoRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsDeployMeta.updateHostInfo);
    }

    /**
     * 编辑主机集群下主机信息
     *
     * 根据主机id编辑主机集群下主机信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateHostInfoRequest 请求对象
     * @return SyncInvoker<UpdateHostInfoRequest, UpdateHostInfoResponse>
     */
    public SyncInvoker<UpdateHostInfoRequest, UpdateHostInfoResponse> updateHostInfoInvoker(
        UpdateHostInfoRequest request) {
        return new SyncInvoker<>(request, CodeArtsDeployMeta.updateHostInfo, hcClient);
    }

    /**
     * 新建主机集群
     *
     * 在项目下新建主机集群。该接口于2024年09月30日后不再维护，推荐使用新版CreateHostCluster接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDeploymentGroupRequest 请求对象
     * @return CreateDeploymentGroupResponse
     */
    public CreateDeploymentGroupResponse createDeploymentGroup(CreateDeploymentGroupRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsDeployMeta.createDeploymentGroup);
    }

    /**
     * 新建主机集群
     *
     * 在项目下新建主机集群。该接口于2024年09月30日后不再维护，推荐使用新版CreateHostCluster接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDeploymentGroupRequest 请求对象
     * @return SyncInvoker<CreateDeploymentGroupRequest, CreateDeploymentGroupResponse>
     */
    public SyncInvoker<CreateDeploymentGroupRequest, CreateDeploymentGroupResponse> createDeploymentGroupInvoker(
        CreateDeploymentGroupRequest request) {
        return new SyncInvoker<>(request, CodeArtsDeployMeta.createDeploymentGroup, hcClient);
    }

    /**
     * 新建主机集群
     *
     * 在项目下新建主机集群。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateHostClusterRequest 请求对象
     * @return CreateHostClusterResponse
     */
    public CreateHostClusterResponse createHostCluster(CreateHostClusterRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsDeployMeta.createHostCluster);
    }

    /**
     * 新建主机集群
     *
     * 在项目下新建主机集群。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateHostClusterRequest 请求对象
     * @return SyncInvoker<CreateHostClusterRequest, CreateHostClusterResponse>
     */
    public SyncInvoker<CreateHostClusterRequest, CreateHostClusterResponse> createHostClusterInvoker(
        CreateHostClusterRequest request) {
        return new SyncInvoker<>(request, CodeArtsDeployMeta.createHostCluster, hcClient);
    }

    /**
     * 删除主机集群
     *
     * 根据主机集群id删除主机集群。该接口于2024年9月30日后不再维护。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDeploymentGroupRequest 请求对象
     * @return DeleteDeploymentGroupResponse
     */
    public DeleteDeploymentGroupResponse deleteDeploymentGroup(DeleteDeploymentGroupRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsDeployMeta.deleteDeploymentGroup);
    }

    /**
     * 删除主机集群
     *
     * 根据主机集群id删除主机集群。该接口于2024年9月30日后不再维护。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDeploymentGroupRequest 请求对象
     * @return SyncInvoker<DeleteDeploymentGroupRequest, DeleteDeploymentGroupResponse>
     */
    public SyncInvoker<DeleteDeploymentGroupRequest, DeleteDeploymentGroupResponse> deleteDeploymentGroupInvoker(
        DeleteDeploymentGroupRequest request) {
        return new SyncInvoker<>(request, CodeArtsDeployMeta.deleteDeploymentGroup, hcClient);
    }

    /**
     * 删除主机集群
     *
     * 根据主机集群id删除主机集群。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteHostClusterRequest 请求对象
     * @return DeleteHostClusterResponse
     */
    public DeleteHostClusterResponse deleteHostCluster(DeleteHostClusterRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsDeployMeta.deleteHostCluster);
    }

    /**
     * 删除主机集群
     *
     * 根据主机集群id删除主机集群。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteHostClusterRequest 请求对象
     * @return SyncInvoker<DeleteHostClusterRequest, DeleteHostClusterResponse>
     */
    public SyncInvoker<DeleteHostClusterRequest, DeleteHostClusterResponse> deleteHostClusterInvoker(
        DeleteHostClusterRequest request) {
        return new SyncInvoker<>(request, CodeArtsDeployMeta.deleteHostCluster, hcClient);
    }

    /**
     * 查询主机集群关联环境信息
     *
     * 查询主机集群关联环境信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAssociateEnvironmentsInfosRequest 请求对象
     * @return ListAssociateEnvironmentsInfosResponse
     */
    public ListAssociateEnvironmentsInfosResponse listAssociateEnvironmentsInfos(
        ListAssociateEnvironmentsInfosRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsDeployMeta.listAssociateEnvironmentsInfos);
    }

    /**
     * 查询主机集群关联环境信息
     *
     * 查询主机集群关联环境信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAssociateEnvironmentsInfosRequest 请求对象
     * @return SyncInvoker<ListAssociateEnvironmentsInfosRequest, ListAssociateEnvironmentsInfosResponse>
     */
    public SyncInvoker<ListAssociateEnvironmentsInfosRequest, ListAssociateEnvironmentsInfosResponse> listAssociateEnvironmentsInfosInvoker(
        ListAssociateEnvironmentsInfosRequest request) {
        return new SyncInvoker<>(request, CodeArtsDeployMeta.listAssociateEnvironmentsInfos, hcClient);
    }

    /**
     * 查询主机集群列表
     *
     * 按条件查询主机集群列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHostClustersRequest 请求对象
     * @return ListHostClustersResponse
     */
    public ListHostClustersResponse listHostClusters(ListHostClustersRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsDeployMeta.listHostClusters);
    }

    /**
     * 查询主机集群列表
     *
     * 按条件查询主机集群列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHostClustersRequest 请求对象
     * @return SyncInvoker<ListHostClustersRequest, ListHostClustersResponse>
     */
    public SyncInvoker<ListHostClustersRequest, ListHostClustersResponse> listHostClustersInvoker(
        ListHostClustersRequest request) {
        return new SyncInvoker<>(request, CodeArtsDeployMeta.listHostClusters, hcClient);
    }

    /**
     * 查询应用下环境基本信息列表
     *
     * 查询应用下环境基本信息列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHostGroupBaseInfosRequest 请求对象
     * @return ListHostGroupBaseInfosResponse
     */
    public ListHostGroupBaseInfosResponse listHostGroupBaseInfos(ListHostGroupBaseInfosRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsDeployMeta.listHostGroupBaseInfos);
    }

    /**
     * 查询应用下环境基本信息列表
     *
     * 查询应用下环境基本信息列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHostGroupBaseInfosRequest 请求对象
     * @return SyncInvoker<ListHostGroupBaseInfosRequest, ListHostGroupBaseInfosResponse>
     */
    public SyncInvoker<ListHostGroupBaseInfosRequest, ListHostGroupBaseInfosResponse> listHostGroupBaseInfosInvoker(
        ListHostGroupBaseInfosRequest request) {
        return new SyncInvoker<>(request, CodeArtsDeployMeta.listHostGroupBaseInfos, hcClient);
    }

    /**
     * 查询主机集群列表
     *
     * 按条件查询主机集群列表。该接口于2024年09月30日后不再维护，推荐使用新版ListHostClusters接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHostGroupsRequest 请求对象
     * @return ListHostGroupsResponse
     */
    public ListHostGroupsResponse listHostGroups(ListHostGroupsRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsDeployMeta.listHostGroups);
    }

    /**
     * 查询主机集群列表
     *
     * 按条件查询主机集群列表。该接口于2024年09月30日后不再维护，推荐使用新版ListHostClusters接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHostGroupsRequest 请求对象
     * @return SyncInvoker<ListHostGroupsRequest, ListHostGroupsResponse>
     */
    public SyncInvoker<ListHostGroupsRequest, ListHostGroupsResponse> listHostGroupsInvoker(
        ListHostGroupsRequest request) {
        return new SyncInvoker<>(request, CodeArtsDeployMeta.listHostGroups, hcClient);
    }

    /**
     * 查询主机集群详情
     *
     * 根据主机集群id查询主机集群详情。该接口于2024年09月30日后不再维护，推荐使用新版ShowHostClusterDetail接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDeploymentGroupDetailRequest 请求对象
     * @return ShowDeploymentGroupDetailResponse
     */
    public ShowDeploymentGroupDetailResponse showDeploymentGroupDetail(ShowDeploymentGroupDetailRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsDeployMeta.showDeploymentGroupDetail);
    }

    /**
     * 查询主机集群详情
     *
     * 根据主机集群id查询主机集群详情。该接口于2024年09月30日后不再维护，推荐使用新版ShowHostClusterDetail接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDeploymentGroupDetailRequest 请求对象
     * @return SyncInvoker<ShowDeploymentGroupDetailRequest, ShowDeploymentGroupDetailResponse>
     */
    public SyncInvoker<ShowDeploymentGroupDetailRequest, ShowDeploymentGroupDetailResponse> showDeploymentGroupDetailInvoker(
        ShowDeploymentGroupDetailRequest request) {
        return new SyncInvoker<>(request, CodeArtsDeployMeta.showDeploymentGroupDetail, hcClient);
    }

    /**
     * 查询主机集群详情
     *
     * 根据主机集群id查询主机集群详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHostClusterDetailRequest 请求对象
     * @return ShowHostClusterDetailResponse
     */
    public ShowHostClusterDetailResponse showHostClusterDetail(ShowHostClusterDetailRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsDeployMeta.showHostClusterDetail);
    }

    /**
     * 查询主机集群详情
     *
     * 根据主机集群id查询主机集群详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHostClusterDetailRequest 请求对象
     * @return SyncInvoker<ShowHostClusterDetailRequest, ShowHostClusterDetailResponse>
     */
    public SyncInvoker<ShowHostClusterDetailRequest, ShowHostClusterDetailResponse> showHostClusterDetailInvoker(
        ShowHostClusterDetailRequest request) {
        return new SyncInvoker<>(request, CodeArtsDeployMeta.showHostClusterDetail, hcClient);
    }

    /**
     * 修改主机集群
     *
     * 根据主机集群id修改主机集群信息。该接口于2024年9月30日后不再维护。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDeploymentGroupRequest 请求对象
     * @return UpdateDeploymentGroupResponse
     */
    public UpdateDeploymentGroupResponse updateDeploymentGroup(UpdateDeploymentGroupRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsDeployMeta.updateDeploymentGroup);
    }

    /**
     * 修改主机集群
     *
     * 根据主机集群id修改主机集群信息。该接口于2024年9月30日后不再维护。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDeploymentGroupRequest 请求对象
     * @return SyncInvoker<UpdateDeploymentGroupRequest, UpdateDeploymentGroupResponse>
     */
    public SyncInvoker<UpdateDeploymentGroupRequest, UpdateDeploymentGroupResponse> updateDeploymentGroupInvoker(
        UpdateDeploymentGroupRequest request) {
        return new SyncInvoker<>(request, CodeArtsDeployMeta.updateDeploymentGroup, hcClient);
    }

    /**
     * 编辑主机集群
     *
     * 编辑主机集群。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateHostClusterRequest 请求对象
     * @return UpdateHostClusterResponse
     */
    public UpdateHostClusterResponse updateHostCluster(UpdateHostClusterRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsDeployMeta.updateHostCluster);
    }

    /**
     * 编辑主机集群
     *
     * 编辑主机集群。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateHostClusterRequest 请求对象
     * @return SyncInvoker<UpdateHostClusterRequest, UpdateHostClusterResponse>
     */
    public SyncInvoker<UpdateHostClusterRequest, UpdateHostClusterResponse> updateHostClusterInvoker(
        UpdateHostClusterRequest request) {
        return new SyncInvoker<>(request, CodeArtsDeployMeta.updateHostCluster, hcClient);
    }

    /**
     * 判断当前用户在项目下是否有权限创建主机集群
     *
     * 判断当前用户在项目下是否有权限创建主机集群。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckWhetherHostGroupCanBeCreatedRequest 请求对象
     * @return CheckWhetherHostGroupCanBeCreatedResponse
     */
    public CheckWhetherHostGroupCanBeCreatedResponse checkWhetherHostGroupCanBeCreated(
        CheckWhetherHostGroupCanBeCreatedRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsDeployMeta.checkWhetherHostGroupCanBeCreated);
    }

    /**
     * 判断当前用户在项目下是否有权限创建主机集群
     *
     * 判断当前用户在项目下是否有权限创建主机集群。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckWhetherHostGroupCanBeCreatedRequest 请求对象
     * @return SyncInvoker<CheckWhetherHostGroupCanBeCreatedRequest, CheckWhetherHostGroupCanBeCreatedResponse>
     */
    public SyncInvoker<CheckWhetherHostGroupCanBeCreatedRequest, CheckWhetherHostGroupCanBeCreatedResponse> checkWhetherHostGroupCanBeCreatedInvoker(
        CheckWhetherHostGroupCanBeCreatedRequest request) {
        return new SyncInvoker<>(request, CodeArtsDeployMeta.checkWhetherHostGroupCanBeCreated, hcClient);
    }

    /**
     * 查询主机集群权限矩阵
     *
     * 根据主机集群id查询主机集群权限矩阵。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHostGroupPermissionsRequest 请求对象
     * @return ListHostGroupPermissionsResponse
     */
    public ListHostGroupPermissionsResponse listHostGroupPermissions(ListHostGroupPermissionsRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsDeployMeta.listHostGroupPermissions);
    }

    /**
     * 查询主机集群权限矩阵
     *
     * 根据主机集群id查询主机集群权限矩阵。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHostGroupPermissionsRequest 请求对象
     * @return SyncInvoker<ListHostGroupPermissionsRequest, ListHostGroupPermissionsResponse>
     */
    public SyncInvoker<ListHostGroupPermissionsRequest, ListHostGroupPermissionsResponse> listHostGroupPermissionsInvoker(
        ListHostGroupPermissionsRequest request) {
        return new SyncInvoker<>(request, CodeArtsDeployMeta.listHostGroupPermissions, hcClient);
    }

    /**
     * 修改主机集群权限矩阵
     *
     * 根据主机集群id修改主机集群权限矩阵。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateHostGroupPermissionsRequest 请求对象
     * @return UpdateHostGroupPermissionsResponse
     */
    public UpdateHostGroupPermissionsResponse updateHostGroupPermissions(UpdateHostGroupPermissionsRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsDeployMeta.updateHostGroupPermissions);
    }

    /**
     * 修改主机集群权限矩阵
     *
     * 根据主机集群id修改主机集群权限矩阵。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateHostGroupPermissionsRequest 请求对象
     * @return SyncInvoker<UpdateHostGroupPermissionsRequest, UpdateHostGroupPermissionsResponse>
     */
    public SyncInvoker<UpdateHostGroupPermissionsRequest, UpdateHostGroupPermissionsResponse> updateHostGroupPermissionsInvoker(
        UpdateHostGroupPermissionsRequest request) {
        return new SyncInvoker<>(request, CodeArtsDeployMeta.updateHostGroupPermissions, hcClient);
    }

    /**
     * 获取指定应用的应用部署成功率
     *
     * 获取指定应用的应用部署成功率。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTaskSuccessRateRequest 请求对象
     * @return ListTaskSuccessRateResponse
     */
    public ListTaskSuccessRateResponse listTaskSuccessRate(ListTaskSuccessRateRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsDeployMeta.listTaskSuccessRate);
    }

    /**
     * 获取指定应用的应用部署成功率
     *
     * 获取指定应用的应用部署成功率。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTaskSuccessRateRequest 请求对象
     * @return SyncInvoker<ListTaskSuccessRateRequest, ListTaskSuccessRateResponse>
     */
    public SyncInvoker<ListTaskSuccessRateRequest, ListTaskSuccessRateResponse> listTaskSuccessRateInvoker(
        ListTaskSuccessRateRequest request) {
        return new SyncInvoker<>(request, CodeArtsDeployMeta.listTaskSuccessRate, hcClient);
    }

    /**
     * 获取指定项目的应用部署成功率
     *
     * 获取指定项目的应用部署成功率。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowProjectSuccessRateRequest 请求对象
     * @return ShowProjectSuccessRateResponse
     */
    public ShowProjectSuccessRateResponse showProjectSuccessRate(ShowProjectSuccessRateRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsDeployMeta.showProjectSuccessRate);
    }

    /**
     * 获取指定项目的应用部署成功率
     *
     * 获取指定项目的应用部署成功率。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowProjectSuccessRateRequest 请求对象
     * @return SyncInvoker<ShowProjectSuccessRateRequest, ShowProjectSuccessRateResponse>
     */
    public SyncInvoker<ShowProjectSuccessRateRequest, ShowProjectSuccessRateResponse> showProjectSuccessRateInvoker(
        ShowProjectSuccessRateRequest request) {
        return new SyncInvoker<>(request, CodeArtsDeployMeta.showProjectSuccessRate, hcClient);
    }

}
