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
import com.huaweicloud.sdk.codeartsdeploy.v2.model.CheckDeployStatusRequest;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.CheckDeployStatusResponse;
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
import com.huaweicloud.sdk.codeartsdeploy.v2.model.StopDeployTaskRequest;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.StopDeployTaskResponse;
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
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;

import java.util.concurrent.CompletableFuture;

public class CodeArtsDeployAsyncClient {

    protected HcClient hcClient;

    public CodeArtsDeployAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<CodeArtsDeployAsyncClient> newBuilder() {
        ClientBuilder<CodeArtsDeployAsyncClient> clientBuilder = new ClientBuilder<>(CodeArtsDeployAsyncClient::new);
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
     * @return CompletableFuture<CreateAppGroupsResponse>
     */
    public CompletableFuture<CreateAppGroupsResponse> createAppGroupsAsync(CreateAppGroupsRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsDeployMeta.createAppGroups);
    }

    /**
     * 创建分组
     *
     * 创建分组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAppGroupsRequest 请求对象
     * @return AsyncInvoker<CreateAppGroupsRequest, CreateAppGroupsResponse>
     */
    public AsyncInvoker<CreateAppGroupsRequest, CreateAppGroupsResponse> createAppGroupsAsyncInvoker(
        CreateAppGroupsRequest request) {
        return new AsyncInvoker<>(request, CodeArtsDeployMeta.createAppGroups, hcClient);
    }

    /**
     * 删除分组
     *
     * 删除分组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAppGroupsRequest 请求对象
     * @return CompletableFuture<DeleteAppGroupsResponse>
     */
    public CompletableFuture<DeleteAppGroupsResponse> deleteAppGroupsAsync(DeleteAppGroupsRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsDeployMeta.deleteAppGroups);
    }

    /**
     * 删除分组
     *
     * 删除分组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAppGroupsRequest 请求对象
     * @return AsyncInvoker<DeleteAppGroupsRequest, DeleteAppGroupsResponse>
     */
    public AsyncInvoker<DeleteAppGroupsRequest, DeleteAppGroupsResponse> deleteAppGroupsAsyncInvoker(
        DeleteAppGroupsRequest request) {
        return new AsyncInvoker<>(request, CodeArtsDeployMeta.deleteAppGroups, hcClient);
    }

    /**
     * 查询分组列表
     *
     * 查询分组列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAppGroupsRequest 请求对象
     * @return CompletableFuture<ListAppGroupsResponse>
     */
    public CompletableFuture<ListAppGroupsResponse> listAppGroupsAsync(ListAppGroupsRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsDeployMeta.listAppGroups);
    }

    /**
     * 查询分组列表
     *
     * 查询分组列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAppGroupsRequest 请求对象
     * @return AsyncInvoker<ListAppGroupsRequest, ListAppGroupsResponse>
     */
    public AsyncInvoker<ListAppGroupsRequest, ListAppGroupsResponse> listAppGroupsAsyncInvoker(
        ListAppGroupsRequest request) {
        return new AsyncInvoker<>(request, CodeArtsDeployMeta.listAppGroups, hcClient);
    }

    /**
     * 移动分组
     *
     * 往上或者往下移动单个分组,用来在页面上调整分组位置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request MoveAppGroupsRequest 请求对象
     * @return CompletableFuture<MoveAppGroupsResponse>
     */
    public CompletableFuture<MoveAppGroupsResponse> moveAppGroupsAsync(MoveAppGroupsRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsDeployMeta.moveAppGroups);
    }

    /**
     * 移动分组
     *
     * 往上或者往下移动单个分组,用来在页面上调整分组位置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request MoveAppGroupsRequest 请求对象
     * @return AsyncInvoker<MoveAppGroupsRequest, MoveAppGroupsResponse>
     */
    public AsyncInvoker<MoveAppGroupsRequest, MoveAppGroupsResponse> moveAppGroupsAsyncInvoker(
        MoveAppGroupsRequest request) {
        return new AsyncInvoker<>(request, CodeArtsDeployMeta.moveAppGroups, hcClient);
    }

    /**
     * 移动应用至指定分组
     *
     * 将应用移动至指定分组（支持批量）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request MoveAppToGroupRequest 请求对象
     * @return CompletableFuture<MoveAppToGroupResponse>
     */
    public CompletableFuture<MoveAppToGroupResponse> moveAppToGroupAsync(MoveAppToGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsDeployMeta.moveAppToGroup);
    }

    /**
     * 移动应用至指定分组
     *
     * 将应用移动至指定分组（支持批量）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request MoveAppToGroupRequest 请求对象
     * @return AsyncInvoker<MoveAppToGroupRequest, MoveAppToGroupResponse>
     */
    public AsyncInvoker<MoveAppToGroupRequest, MoveAppToGroupResponse> moveAppToGroupAsyncInvoker(
        MoveAppToGroupRequest request) {
        return new AsyncInvoker<>(request, CodeArtsDeployMeta.moveAppToGroup, hcClient);
    }

    /**
     * 修改分组
     *
     * 修改分组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAppGroupsRequest 请求对象
     * @return CompletableFuture<UpdateAppGroupsResponse>
     */
    public CompletableFuture<UpdateAppGroupsResponse> updateAppGroupsAsync(UpdateAppGroupsRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsDeployMeta.updateAppGroups);
    }

    /**
     * 修改分组
     *
     * 修改分组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAppGroupsRequest 请求对象
     * @return AsyncInvoker<UpdateAppGroupsRequest, UpdateAppGroupsResponse>
     */
    public AsyncInvoker<UpdateAppGroupsRequest, UpdateAppGroupsResponse> updateAppGroupsAsyncInvoker(
        UpdateAppGroupsRequest request) {
        return new AsyncInvoker<>(request, CodeArtsDeployMeta.updateAppGroups, hcClient);
    }

    /**
     * 批量修改应用权限
     *
     * 批量修改应用权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUpdateApplicationPermissionsRequest 请求对象
     * @return CompletableFuture<BatchUpdateApplicationPermissionsResponse>
     */
    public CompletableFuture<BatchUpdateApplicationPermissionsResponse> batchUpdateApplicationPermissionsAsync(
        BatchUpdateApplicationPermissionsRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsDeployMeta.batchUpdateApplicationPermissions);
    }

    /**
     * 批量修改应用权限
     *
     * 批量修改应用权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUpdateApplicationPermissionsRequest 请求对象
     * @return AsyncInvoker<BatchUpdateApplicationPermissionsRequest, BatchUpdateApplicationPermissionsResponse>
     */
    public AsyncInvoker<BatchUpdateApplicationPermissionsRequest, BatchUpdateApplicationPermissionsResponse> batchUpdateApplicationPermissionsAsyncInvoker(
        BatchUpdateApplicationPermissionsRequest request) {
        return new AsyncInvoker<>(request, CodeArtsDeployMeta.batchUpdateApplicationPermissions, hcClient);
    }

    /**
     * 批量配置应用下鉴权级别
     *
     * 批量配置应用下鉴权级别为项目级或实例级。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUpdatePermissionLevelRequest 请求对象
     * @return CompletableFuture<BatchUpdatePermissionLevelResponse>
     */
    public CompletableFuture<BatchUpdatePermissionLevelResponse> batchUpdatePermissionLevelAsync(
        BatchUpdatePermissionLevelRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsDeployMeta.batchUpdatePermissionLevel);
    }

    /**
     * 批量配置应用下鉴权级别
     *
     * 批量配置应用下鉴权级别为项目级或实例级。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUpdatePermissionLevelRequest 请求对象
     * @return AsyncInvoker<BatchUpdatePermissionLevelRequest, BatchUpdatePermissionLevelResponse>
     */
    public AsyncInvoker<BatchUpdatePermissionLevelRequest, BatchUpdatePermissionLevelResponse> batchUpdatePermissionLevelAsyncInvoker(
        BatchUpdatePermissionLevelRequest request) {
        return new AsyncInvoker<>(request, CodeArtsDeployMeta.batchUpdatePermissionLevel, hcClient);
    }

    /**
     * 查询当前用户是否有项目下创建应用权限
     *
     * 查询当前用户是否有项目下创建应用权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckCanCreateRequest 请求对象
     * @return CompletableFuture<CheckCanCreateResponse>
     */
    public CompletableFuture<CheckCanCreateResponse> checkCanCreateAsync(CheckCanCreateRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsDeployMeta.checkCanCreate);
    }

    /**
     * 查询当前用户是否有项目下创建应用权限
     *
     * 查询当前用户是否有项目下创建应用权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckCanCreateRequest 请求对象
     * @return AsyncInvoker<CheckCanCreateRequest, CheckCanCreateResponse>
     */
    public AsyncInvoker<CheckCanCreateRequest, CheckCanCreateResponse> checkCanCreateAsyncInvoker(
        CheckCanCreateRequest request) {
        return new AsyncInvoker<>(request, CodeArtsDeployMeta.checkCanCreate, hcClient);
    }

    /**
     * 查询应用实例级/项目级权限矩阵
     *
     * 查询应用实例级/项目级权限矩阵，传递app_id时，查询应用实例级权限矩阵；未传app_id，传递project_id时，查询应用项目级权限矩阵。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApplicationPermissionsRequest 请求对象
     * @return CompletableFuture<ListApplicationPermissionsResponse>
     */
    public CompletableFuture<ListApplicationPermissionsResponse> listApplicationPermissionsAsync(
        ListApplicationPermissionsRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsDeployMeta.listApplicationPermissions);
    }

    /**
     * 查询应用实例级/项目级权限矩阵
     *
     * 查询应用实例级/项目级权限矩阵，传递app_id时，查询应用实例级权限矩阵；未传app_id，传递project_id时，查询应用项目级权限矩阵。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApplicationPermissionsRequest 请求对象
     * @return AsyncInvoker<ListApplicationPermissionsRequest, ListApplicationPermissionsResponse>
     */
    public AsyncInvoker<ListApplicationPermissionsRequest, ListApplicationPermissionsResponse> listApplicationPermissionsAsyncInvoker(
        ListApplicationPermissionsRequest request) {
        return new AsyncInvoker<>(request, CodeArtsDeployMeta.listApplicationPermissions, hcClient);
    }

    /**
     * 批量删除项目下应用
     *
     * 批量删除项目下应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteAppRequest 请求对象
     * @return CompletableFuture<BatchDeleteAppResponse>
     */
    public CompletableFuture<BatchDeleteAppResponse> batchDeleteAppAsync(BatchDeleteAppRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsDeployMeta.batchDeleteApp);
    }

    /**
     * 批量删除项目下应用
     *
     * 批量删除项目下应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteAppRequest 请求对象
     * @return AsyncInvoker<BatchDeleteAppRequest, BatchDeleteAppResponse>
     */
    public AsyncInvoker<BatchDeleteAppRequest, BatchDeleteAppResponse> batchDeleteAppAsyncInvoker(
        BatchDeleteAppRequest request) {
        return new AsyncInvoker<>(request, CodeArtsDeployMeta.batchDeleteApp, hcClient);
    }

    /**
     * 查询项目下是否存在同名应用
     *
     * 查询项目下是否存在同名应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckIsDuplicateAppNameRequest 请求对象
     * @return CompletableFuture<CheckIsDuplicateAppNameResponse>
     */
    public CompletableFuture<CheckIsDuplicateAppNameResponse> checkIsDuplicateAppNameAsync(
        CheckIsDuplicateAppNameRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsDeployMeta.checkIsDuplicateAppName);
    }

    /**
     * 查询项目下是否存在同名应用
     *
     * 查询项目下是否存在同名应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckIsDuplicateAppNameRequest 请求对象
     * @return AsyncInvoker<CheckIsDuplicateAppNameRequest, CheckIsDuplicateAppNameResponse>
     */
    public AsyncInvoker<CheckIsDuplicateAppNameRequest, CheckIsDuplicateAppNameResponse> checkIsDuplicateAppNameAsyncInvoker(
        CheckIsDuplicateAppNameRequest request) {
        return new AsyncInvoker<>(request, CodeArtsDeployMeta.checkIsDuplicateAppName, hcClient);
    }

    /**
     * 复制应用
     *
     * 复制应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CopyApplicationRequest 请求对象
     * @return CompletableFuture<CopyApplicationResponse>
     */
    public CompletableFuture<CopyApplicationResponse> copyApplicationAsync(CopyApplicationRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsDeployMeta.copyApplication);
    }

    /**
     * 复制应用
     *
     * 复制应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CopyApplicationRequest 请求对象
     * @return AsyncInvoker<CopyApplicationRequest, CopyApplicationResponse>
     */
    public AsyncInvoker<CopyApplicationRequest, CopyApplicationResponse> copyApplicationAsyncInvoker(
        CopyApplicationRequest request) {
        return new AsyncInvoker<>(request, CodeArtsDeployMeta.copyApplication, hcClient);
    }

    /**
     * 新建应用
     *
     * 新建应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAppRequest 请求对象
     * @return CompletableFuture<CreateAppResponse>
     */
    public CompletableFuture<CreateAppResponse> createAppAsync(CreateAppRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsDeployMeta.createApp);
    }

    /**
     * 新建应用
     *
     * 新建应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAppRequest 请求对象
     * @return AsyncInvoker<CreateAppRequest, CreateAppResponse>
     */
    public AsyncInvoker<CreateAppRequest, CreateAppResponse> createAppAsyncInvoker(CreateAppRequest request) {
        return new AsyncInvoker<>(request, CodeArtsDeployMeta.createApp, hcClient);
    }

    /**
     * 通过模板新建应用
     *
     * 通过模板新建应用。该接口于2024年09月30日后不再维护，推荐使用新版CreateApp接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDeployTaskByTemplateRequest 请求对象
     * @return CompletableFuture<CreateDeployTaskByTemplateResponse>
     */
    public CompletableFuture<CreateDeployTaskByTemplateResponse> createDeployTaskByTemplateAsync(
        CreateDeployTaskByTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsDeployMeta.createDeployTaskByTemplate);
    }

    /**
     * 通过模板新建应用
     *
     * 通过模板新建应用。该接口于2024年09月30日后不再维护，推荐使用新版CreateApp接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDeployTaskByTemplateRequest 请求对象
     * @return AsyncInvoker<CreateDeployTaskByTemplateRequest, CreateDeployTaskByTemplateResponse>
     */
    public AsyncInvoker<CreateDeployTaskByTemplateRequest, CreateDeployTaskByTemplateResponse> createDeployTaskByTemplateAsyncInvoker(
        CreateDeployTaskByTemplateRequest request) {
        return new AsyncInvoker<>(request, CodeArtsDeployMeta.createDeployTaskByTemplate, hcClient);
    }

    /**
     * 删除应用
     *
     * 根据应用id删除应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteApplicationRequest 请求对象
     * @return CompletableFuture<DeleteApplicationResponse>
     */
    public CompletableFuture<DeleteApplicationResponse> deleteApplicationAsync(DeleteApplicationRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsDeployMeta.deleteApplication);
    }

    /**
     * 删除应用
     *
     * 根据应用id删除应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteApplicationRequest 请求对象
     * @return AsyncInvoker<DeleteApplicationRequest, DeleteApplicationResponse>
     */
    public AsyncInvoker<DeleteApplicationRequest, DeleteApplicationResponse> deleteApplicationAsyncInvoker(
        DeleteApplicationRequest request) {
        return new AsyncInvoker<>(request, CodeArtsDeployMeta.deleteApplication, hcClient);
    }

    /**
     * 删除应用
     *
     * 根据部署任务id删除应用。该接口于2024年09月30日后不再维护，推荐使用新版DeleteApplication接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDeployTaskRequest 请求对象
     * @return CompletableFuture<DeleteDeployTaskResponse>
     */
    public CompletableFuture<DeleteDeployTaskResponse> deleteDeployTaskAsync(DeleteDeployTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsDeployMeta.deleteDeployTask);
    }

    /**
     * 删除应用
     *
     * 根据部署任务id删除应用。该接口于2024年09月30日后不再维护，推荐使用新版DeleteApplication接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDeployTaskRequest 请求对象
     * @return AsyncInvoker<DeleteDeployTaskRequest, DeleteDeployTaskResponse>
     */
    public AsyncInvoker<DeleteDeployTaskRequest, DeleteDeployTaskResponse> deleteDeployTaskAsyncInvoker(
        DeleteDeployTaskRequest request) {
        return new AsyncInvoker<>(request, CodeArtsDeployMeta.deleteDeployTask, hcClient);
    }

    /**
     * 获取应用列表
     *
     * 查询项目下应用列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAllAppRequest 请求对象
     * @return CompletableFuture<ListAllAppResponse>
     */
    public CompletableFuture<ListAllAppResponse> listAllAppAsync(ListAllAppRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsDeployMeta.listAllApp);
    }

    /**
     * 获取应用列表
     *
     * 查询项目下应用列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAllAppRequest 请求对象
     * @return AsyncInvoker<ListAllAppRequest, ListAllAppResponse>
     */
    public AsyncInvoker<ListAllAppRequest, ListAllAppResponse> listAllAppAsyncInvoker(ListAllAppRequest request) {
        return new AsyncInvoker<>(request, CodeArtsDeployMeta.listAllApp, hcClient);
    }

    /**
     * 根据开始时间和结束时间查询项目下指定应用的历史部署记录列表
     *
     * 根据开始时间和结束时间查询项目下指定应用的历史部署记录列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDeployTaskHistoryByDateRequest 请求对象
     * @return CompletableFuture<ListDeployTaskHistoryByDateResponse>
     */
    public CompletableFuture<ListDeployTaskHistoryByDateResponse> listDeployTaskHistoryByDateAsync(
        ListDeployTaskHistoryByDateRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsDeployMeta.listDeployTaskHistoryByDate);
    }

    /**
     * 根据开始时间和结束时间查询项目下指定应用的历史部署记录列表
     *
     * 根据开始时间和结束时间查询项目下指定应用的历史部署记录列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDeployTaskHistoryByDateRequest 请求对象
     * @return AsyncInvoker<ListDeployTaskHistoryByDateRequest, ListDeployTaskHistoryByDateResponse>
     */
    public AsyncInvoker<ListDeployTaskHistoryByDateRequest, ListDeployTaskHistoryByDateResponse> listDeployTaskHistoryByDateAsyncInvoker(
        ListDeployTaskHistoryByDateRequest request) {
        return new AsyncInvoker<>(request, CodeArtsDeployMeta.listDeployTaskHistoryByDate, hcClient);
    }

    /**
     * 获取应用列表
     *
     * 查询项目下应用列表。该接口于2024年09月30日后不再维护，推荐使用新版ListAllApp接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDeployTasksRequest 请求对象
     * @return CompletableFuture<ListDeployTasksResponse>
     */
    public CompletableFuture<ListDeployTasksResponse> listDeployTasksAsync(ListDeployTasksRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsDeployMeta.listDeployTasks);
    }

    /**
     * 获取应用列表
     *
     * 查询项目下应用列表。该接口于2024年09月30日后不再维护，推荐使用新版ListAllApp接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDeployTasksRequest 请求对象
     * @return AsyncInvoker<ListDeployTasksRequest, ListDeployTasksResponse>
     */
    public AsyncInvoker<ListDeployTasksRequest, ListDeployTasksResponse> listDeployTasksAsyncInvoker(
        ListDeployTasksRequest request) {
        return new AsyncInvoker<>(request, CodeArtsDeployMeta.listDeployTasks, hcClient);
    }

    /**
     * 获取应用详情
     *
     * 根据应用id获取应用详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAppDetailByIdRequest 请求对象
     * @return CompletableFuture<ShowAppDetailByIdResponse>
     */
    public CompletableFuture<ShowAppDetailByIdResponse> showAppDetailByIdAsync(ShowAppDetailByIdRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsDeployMeta.showAppDetailById);
    }

    /**
     * 获取应用详情
     *
     * 根据应用id获取应用详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAppDetailByIdRequest 请求对象
     * @return AsyncInvoker<ShowAppDetailByIdRequest, ShowAppDetailByIdResponse>
     */
    public AsyncInvoker<ShowAppDetailByIdRequest, ShowAppDetailByIdResponse> showAppDetailByIdAsyncInvoker(
        ShowAppDetailByIdRequest request) {
        return new AsyncInvoker<>(request, CodeArtsDeployMeta.showAppDetailById, hcClient);
    }

    /**
     * 获取应用详情
     *
     * 根据部署任务id获取应用详情。该接口于2024年09月30日后不再维护，推荐使用新版ShowAppDetailById接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDeployTaskDetailRequest 请求对象
     * @return CompletableFuture<ShowDeployTaskDetailResponse>
     */
    public CompletableFuture<ShowDeployTaskDetailResponse> showDeployTaskDetailAsync(
        ShowDeployTaskDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsDeployMeta.showDeployTaskDetail);
    }

    /**
     * 获取应用详情
     *
     * 根据部署任务id获取应用详情。该接口于2024年09月30日后不再维护，推荐使用新版ShowAppDetailById接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDeployTaskDetailRequest 请求对象
     * @return AsyncInvoker<ShowDeployTaskDetailRequest, ShowDeployTaskDetailResponse>
     */
    public AsyncInvoker<ShowDeployTaskDetailRequest, ShowDeployTaskDetailResponse> showDeployTaskDetailAsyncInvoker(
        ShowDeployTaskDetailRequest request) {
        return new AsyncInvoker<>(request, CodeArtsDeployMeta.showDeployTaskDetail, hcClient);
    }

    /**
     * 查询部署记录的执行参数
     *
     * 查询部署记录的执行参数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowExecutionParamsRequest 请求对象
     * @return CompletableFuture<ShowExecutionParamsResponse>
     */
    public CompletableFuture<ShowExecutionParamsResponse> showExecutionParamsAsync(ShowExecutionParamsRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsDeployMeta.showExecutionParams);
    }

    /**
     * 查询部署记录的执行参数
     *
     * 查询部署记录的执行参数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowExecutionParamsRequest 请求对象
     * @return AsyncInvoker<ShowExecutionParamsRequest, ShowExecutionParamsResponse>
     */
    public AsyncInvoker<ShowExecutionParamsRequest, ShowExecutionParamsResponse> showExecutionParamsAsyncInvoker(
        ShowExecutionParamsRequest request) {
        return new AsyncInvoker<>(request, CodeArtsDeployMeta.showExecutionParams, hcClient);
    }

    /**
     * 部署应用
     *
     * 根据部署任务id部署应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartDeployTaskRequest 请求对象
     * @return CompletableFuture<StartDeployTaskResponse>
     */
    public CompletableFuture<StartDeployTaskResponse> startDeployTaskAsync(StartDeployTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsDeployMeta.startDeployTask);
    }

    /**
     * 部署应用
     *
     * 根据部署任务id部署应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartDeployTaskRequest 请求对象
     * @return AsyncInvoker<StartDeployTaskRequest, StartDeployTaskResponse>
     */
    public AsyncInvoker<StartDeployTaskRequest, StartDeployTaskResponse> startDeployTaskAsyncInvoker(
        StartDeployTaskRequest request) {
        return new AsyncInvoker<>(request, CodeArtsDeployMeta.startDeployTask, hcClient);
    }

    /**
     * 禁用/取消禁用应用
     *
     * 禁用/取消禁用应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAppDisableStatusRequest 请求对象
     * @return CompletableFuture<UpdateAppDisableStatusResponse>
     */
    public CompletableFuture<UpdateAppDisableStatusResponse> updateAppDisableStatusAsync(
        UpdateAppDisableStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsDeployMeta.updateAppDisableStatus);
    }

    /**
     * 禁用/取消禁用应用
     *
     * 禁用/取消禁用应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAppDisableStatusRequest 请求对象
     * @return AsyncInvoker<UpdateAppDisableStatusRequest, UpdateAppDisableStatusResponse>
     */
    public AsyncInvoker<UpdateAppDisableStatusRequest, UpdateAppDisableStatusResponse> updateAppDisableStatusAsyncInvoker(
        UpdateAppDisableStatusRequest request) {
        return new AsyncInvoker<>(request, CodeArtsDeployMeta.updateAppDisableStatus, hcClient);
    }

    /**
     * 更新应用
     *
     * 更新应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAppInfoRequest 请求对象
     * @return CompletableFuture<UpdateAppInfoResponse>
     */
    public CompletableFuture<UpdateAppInfoResponse> updateAppInfoAsync(UpdateAppInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsDeployMeta.updateAppInfo);
    }

    /**
     * 更新应用
     *
     * 更新应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAppInfoRequest 请求对象
     * @return AsyncInvoker<UpdateAppInfoRequest, UpdateAppInfoResponse>
     */
    public AsyncInvoker<UpdateAppInfoRequest, UpdateAppInfoResponse> updateAppInfoAsyncInvoker(
        UpdateAppInfoRequest request) {
        return new AsyncInvoker<>(request, CodeArtsDeployMeta.updateAppInfo, hcClient);
    }

    /**
     * 获取部署任务状态
     *
     * 获取部署任务状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckDeployStatusRequest 请求对象
     * @return CompletableFuture<CheckDeployStatusResponse>
     */
    public CompletableFuture<CheckDeployStatusResponse> checkDeployStatusAsync(CheckDeployStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsDeployMeta.checkDeployStatus);
    }

    /**
     * 获取部署任务状态
     *
     * 获取部署任务状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckDeployStatusRequest 请求对象
     * @return AsyncInvoker<CheckDeployStatusRequest, CheckDeployStatusResponse>
     */
    public AsyncInvoker<CheckDeployStatusRequest, CheckDeployStatusResponse> checkDeployStatusAsyncInvoker(
        CheckDeployStatusRequest request) {
        return new AsyncInvoker<>(request, CodeArtsDeployMeta.checkDeployStatus, hcClient);
    }

    /**
     * 应用下创建环境
     *
     * 应用下创建环境。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateEnvironmentRequest 请求对象
     * @return CompletableFuture<CreateEnvironmentResponse>
     */
    public CompletableFuture<CreateEnvironmentResponse> createEnvironmentAsync(CreateEnvironmentRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsDeployMeta.createEnvironment);
    }

    /**
     * 应用下创建环境
     *
     * 应用下创建环境。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateEnvironmentRequest 请求对象
     * @return AsyncInvoker<CreateEnvironmentRequest, CreateEnvironmentResponse>
     */
    public AsyncInvoker<CreateEnvironmentRequest, CreateEnvironmentResponse> createEnvironmentAsyncInvoker(
        CreateEnvironmentRequest request) {
        return new AsyncInvoker<>(request, CodeArtsDeployMeta.createEnvironment, hcClient);
    }

    /**
     * 删除应用下的环境
     *
     * 删除应用下的环境。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteEnvironmentRequest 请求对象
     * @return CompletableFuture<DeleteEnvironmentResponse>
     */
    public CompletableFuture<DeleteEnvironmentResponse> deleteEnvironmentAsync(DeleteEnvironmentRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsDeployMeta.deleteEnvironment);
    }

    /**
     * 删除应用下的环境
     *
     * 删除应用下的环境。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteEnvironmentRequest 请求对象
     * @return AsyncInvoker<DeleteEnvironmentRequest, DeleteEnvironmentResponse>
     */
    public AsyncInvoker<DeleteEnvironmentRequest, DeleteEnvironmentResponse> deleteEnvironmentAsyncInvoker(
        DeleteEnvironmentRequest request) {
        return new AsyncInvoker<>(request, CodeArtsDeployMeta.deleteEnvironment, hcClient);
    }

    /**
     * 环境下删除主机
     *
     * 环境下删除主机。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteHostFromEnvironmentRequest 请求对象
     * @return CompletableFuture<DeleteHostFromEnvironmentResponse>
     */
    public CompletableFuture<DeleteHostFromEnvironmentResponse> deleteHostFromEnvironmentAsync(
        DeleteHostFromEnvironmentRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsDeployMeta.deleteHostFromEnvironment);
    }

    /**
     * 环境下删除主机
     *
     * 环境下删除主机。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteHostFromEnvironmentRequest 请求对象
     * @return AsyncInvoker<DeleteHostFromEnvironmentRequest, DeleteHostFromEnvironmentResponse>
     */
    public AsyncInvoker<DeleteHostFromEnvironmentRequest, DeleteHostFromEnvironmentResponse> deleteHostFromEnvironmentAsyncInvoker(
        DeleteHostFromEnvironmentRequest request) {
        return new AsyncInvoker<>(request, CodeArtsDeployMeta.deleteHostFromEnvironment, hcClient);
    }

    /**
     * 环境下导入主机
     *
     * 环境下导入主机。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ImportHostToEnvironmentRequest 请求对象
     * @return CompletableFuture<ImportHostToEnvironmentResponse>
     */
    public CompletableFuture<ImportHostToEnvironmentResponse> importHostToEnvironmentAsync(
        ImportHostToEnvironmentRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsDeployMeta.importHostToEnvironment);
    }

    /**
     * 环境下导入主机
     *
     * 环境下导入主机。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ImportHostToEnvironmentRequest 请求对象
     * @return AsyncInvoker<ImportHostToEnvironmentRequest, ImportHostToEnvironmentResponse>
     */
    public AsyncInvoker<ImportHostToEnvironmentRequest, ImportHostToEnvironmentResponse> importHostToEnvironmentAsyncInvoker(
        ImportHostToEnvironmentRequest request) {
        return new AsyncInvoker<>(request, CodeArtsDeployMeta.importHostToEnvironment, hcClient);
    }

    /**
     * 查询环境内的主机列表
     *
     * 查询环境内的主机列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEnvironmentHostsRequest 请求对象
     * @return CompletableFuture<ListEnvironmentHostsResponse>
     */
    public CompletableFuture<ListEnvironmentHostsResponse> listEnvironmentHostsAsync(
        ListEnvironmentHostsRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsDeployMeta.listEnvironmentHosts);
    }

    /**
     * 查询环境内的主机列表
     *
     * 查询环境内的主机列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEnvironmentHostsRequest 请求对象
     * @return AsyncInvoker<ListEnvironmentHostsRequest, ListEnvironmentHostsResponse>
     */
    public AsyncInvoker<ListEnvironmentHostsRequest, ListEnvironmentHostsResponse> listEnvironmentHostsAsyncInvoker(
        ListEnvironmentHostsRequest request) {
        return new AsyncInvoker<>(request, CodeArtsDeployMeta.listEnvironmentHosts, hcClient);
    }

    /**
     * 查询应用下环境列表
     *
     * 查询应用下环境列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEnvironmentsRequest 请求对象
     * @return CompletableFuture<ListEnvironmentsResponse>
     */
    public CompletableFuture<ListEnvironmentsResponse> listEnvironmentsAsync(ListEnvironmentsRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsDeployMeta.listEnvironments);
    }

    /**
     * 查询应用下环境列表
     *
     * 查询应用下环境列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEnvironmentsRequest 请求对象
     * @return AsyncInvoker<ListEnvironmentsRequest, ListEnvironmentsResponse>
     */
    public AsyncInvoker<ListEnvironmentsRequest, ListEnvironmentsResponse> listEnvironmentsAsyncInvoker(
        ListEnvironmentsRequest request) {
        return new AsyncInvoker<>(request, CodeArtsDeployMeta.listEnvironments, hcClient);
    }

    /**
     * 查询环境详情
     *
     * 查询环境详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowEnvironmentDetailRequest 请求对象
     * @return CompletableFuture<ShowEnvironmentDetailResponse>
     */
    public CompletableFuture<ShowEnvironmentDetailResponse> showEnvironmentDetailAsync(
        ShowEnvironmentDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsDeployMeta.showEnvironmentDetail);
    }

    /**
     * 查询环境详情
     *
     * 查询环境详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowEnvironmentDetailRequest 请求对象
     * @return AsyncInvoker<ShowEnvironmentDetailRequest, ShowEnvironmentDetailResponse>
     */
    public AsyncInvoker<ShowEnvironmentDetailRequest, ShowEnvironmentDetailResponse> showEnvironmentDetailAsyncInvoker(
        ShowEnvironmentDetailRequest request) {
        return new AsyncInvoker<>(request, CodeArtsDeployMeta.showEnvironmentDetail, hcClient);
    }

    /**
     * 应用下编辑环境
     *
     * 应用下编辑环境。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateEnvironmentRequest 请求对象
     * @return CompletableFuture<UpdateEnvironmentResponse>
     */
    public CompletableFuture<UpdateEnvironmentResponse> updateEnvironmentAsync(UpdateEnvironmentRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsDeployMeta.updateEnvironment);
    }

    /**
     * 应用下编辑环境
     *
     * 应用下编辑环境。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateEnvironmentRequest 请求对象
     * @return AsyncInvoker<UpdateEnvironmentRequest, UpdateEnvironmentResponse>
     */
    public AsyncInvoker<UpdateEnvironmentRequest, UpdateEnvironmentResponse> updateEnvironmentAsyncInvoker(
        UpdateEnvironmentRequest request) {
        return new AsyncInvoker<>(request, CodeArtsDeployMeta.updateEnvironment, hcClient);
    }

    /**
     * 查询环境权限
     *
     * 查询环境权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEnvironmentPermissionsRequest 请求对象
     * @return CompletableFuture<ListEnvironmentPermissionsResponse>
     */
    public CompletableFuture<ListEnvironmentPermissionsResponse> listEnvironmentPermissionsAsync(
        ListEnvironmentPermissionsRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsDeployMeta.listEnvironmentPermissions);
    }

    /**
     * 查询环境权限
     *
     * 查询环境权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEnvironmentPermissionsRequest 请求对象
     * @return AsyncInvoker<ListEnvironmentPermissionsRequest, ListEnvironmentPermissionsResponse>
     */
    public AsyncInvoker<ListEnvironmentPermissionsRequest, ListEnvironmentPermissionsResponse> listEnvironmentPermissionsAsyncInvoker(
        ListEnvironmentPermissionsRequest request) {
        return new AsyncInvoker<>(request, CodeArtsDeployMeta.listEnvironmentPermissions, hcClient);
    }

    /**
     * 编辑环境权限
     *
     * 编辑环境权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateEnvironmentPermissionRequest 请求对象
     * @return CompletableFuture<UpdateEnvironmentPermissionResponse>
     */
    public CompletableFuture<UpdateEnvironmentPermissionResponse> updateEnvironmentPermissionAsync(
        UpdateEnvironmentPermissionRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsDeployMeta.updateEnvironmentPermission);
    }

    /**
     * 编辑环境权限
     *
     * 编辑环境权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateEnvironmentPermissionRequest 请求对象
     * @return AsyncInvoker<UpdateEnvironmentPermissionRequest, UpdateEnvironmentPermissionResponse>
     */
    public AsyncInvoker<UpdateEnvironmentPermissionRequest, UpdateEnvironmentPermissionResponse> updateEnvironmentPermissionAsyncInvoker(
        UpdateEnvironmentPermissionRequest request) {
        return new AsyncInvoker<>(request, CodeArtsDeployMeta.updateEnvironmentPermission, hcClient);
    }

    /**
     * 停止部署任务
     *
     * 停止部署任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopDeployTaskRequest 请求对象
     * @return CompletableFuture<StopDeployTaskResponse>
     */
    public CompletableFuture<StopDeployTaskResponse> stopDeployTaskAsync(StopDeployTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsDeployMeta.stopDeployTask);
    }

    /**
     * 停止部署任务
     *
     * 停止部署任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopDeployTaskRequest 请求对象
     * @return AsyncInvoker<StopDeployTaskRequest, StopDeployTaskResponse>
     */
    public AsyncInvoker<StopDeployTaskRequest, StopDeployTaskResponse> stopDeployTaskAsyncInvoker(
        StopDeployTaskRequest request) {
        return new AsyncInvoker<>(request, CodeArtsDeployMeta.stopDeployTask, hcClient);
    }

    /**
     * 批量删除主机集群下的主机
     *
     * 批量删除主机集群下的主机。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteHostsRequest 请求对象
     * @return CompletableFuture<BatchDeleteHostsResponse>
     */
    public CompletableFuture<BatchDeleteHostsResponse> batchDeleteHostsAsync(BatchDeleteHostsRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsDeployMeta.batchDeleteHosts);
    }

    /**
     * 批量删除主机集群下的主机
     *
     * 批量删除主机集群下的主机。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteHostsRequest 请求对象
     * @return AsyncInvoker<BatchDeleteHostsRequest, BatchDeleteHostsResponse>
     */
    public AsyncInvoker<BatchDeleteHostsRequest, BatchDeleteHostsResponse> batchDeleteHostsAsyncInvoker(
        BatchDeleteHostsRequest request) {
        return new AsyncInvoker<>(request, CodeArtsDeployMeta.batchDeleteHosts, hcClient);
    }

    /**
     * 批量复制主机至目标主机集群
     *
     * 批量复制主机至目标主机集群。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CopyHostsToTargetRequest 请求对象
     * @return CompletableFuture<CopyHostsToTargetResponse>
     */
    public CompletableFuture<CopyHostsToTargetResponse> copyHostsToTargetAsync(CopyHostsToTargetRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsDeployMeta.copyHostsToTarget);
    }

    /**
     * 批量复制主机至目标主机集群
     *
     * 批量复制主机至目标主机集群。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CopyHostsToTargetRequest 请求对象
     * @return AsyncInvoker<CopyHostsToTargetRequest, CopyHostsToTargetResponse>
     */
    public AsyncInvoker<CopyHostsToTargetRequest, CopyHostsToTargetResponse> copyHostsToTargetAsyncInvoker(
        CopyHostsToTargetRequest request) {
        return new AsyncInvoker<>(request, CodeArtsDeployMeta.copyHostsToTarget, hcClient);
    }

    /**
     * 新建主机
     *
     * 在指定主机集群下新建主机。该接口于2024年09月30日后不再维护，推荐使用新版CreateHost接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDeploymentHostRequest 请求对象
     * @return CompletableFuture<CreateDeploymentHostResponse>
     */
    public CompletableFuture<CreateDeploymentHostResponse> createDeploymentHostAsync(
        CreateDeploymentHostRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsDeployMeta.createDeploymentHost);
    }

    /**
     * 新建主机
     *
     * 在指定主机集群下新建主机。该接口于2024年09月30日后不再维护，推荐使用新版CreateHost接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDeploymentHostRequest 请求对象
     * @return AsyncInvoker<CreateDeploymentHostRequest, CreateDeploymentHostResponse>
     */
    public AsyncInvoker<CreateDeploymentHostRequest, CreateDeploymentHostResponse> createDeploymentHostAsyncInvoker(
        CreateDeploymentHostRequest request) {
        return new AsyncInvoker<>(request, CodeArtsDeployMeta.createDeploymentHost, hcClient);
    }

    /**
     * 新建主机
     *
     * 在指定主机集群下新建主机。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateHostRequest 请求对象
     * @return CompletableFuture<CreateHostResponse>
     */
    public CompletableFuture<CreateHostResponse> createHostAsync(CreateHostRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsDeployMeta.createHost);
    }

    /**
     * 新建主机
     *
     * 在指定主机集群下新建主机。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateHostRequest 请求对象
     * @return AsyncInvoker<CreateHostRequest, CreateHostResponse>
     */
    public AsyncInvoker<CreateHostRequest, CreateHostResponse> createHostAsyncInvoker(CreateHostRequest request) {
        return new AsyncInvoker<>(request, CodeArtsDeployMeta.createHost, hcClient);
    }

    /**
     * 删除主机
     *
     * 根据主机id删除主机。该接口于2024年9月30日后不再维护。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDeploymentHostRequest 请求对象
     * @return CompletableFuture<DeleteDeploymentHostResponse>
     */
    public CompletableFuture<DeleteDeploymentHostResponse> deleteDeploymentHostAsync(
        DeleteDeploymentHostRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsDeployMeta.deleteDeploymentHost);
    }

    /**
     * 删除主机
     *
     * 根据主机id删除主机。该接口于2024年9月30日后不再维护。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDeploymentHostRequest 请求对象
     * @return AsyncInvoker<DeleteDeploymentHostRequest, DeleteDeploymentHostResponse>
     */
    public AsyncInvoker<DeleteDeploymentHostRequest, DeleteDeploymentHostResponse> deleteDeploymentHostAsyncInvoker(
        DeleteDeploymentHostRequest request) {
        return new AsyncInvoker<>(request, CodeArtsDeployMeta.deleteDeploymentHost, hcClient);
    }

    /**
     * 删除主机集群下主机
     *
     * 根据主机id删除主机集群下主机。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteHostRequest 请求对象
     * @return CompletableFuture<DeleteHostResponse>
     */
    public CompletableFuture<DeleteHostResponse> deleteHostAsync(DeleteHostRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsDeployMeta.deleteHost);
    }

    /**
     * 删除主机集群下主机
     *
     * 根据主机id删除主机集群下主机。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteHostRequest 请求对象
     * @return AsyncInvoker<DeleteHostRequest, DeleteHostResponse>
     */
    public AsyncInvoker<DeleteHostRequest, DeleteHostResponse> deleteHostAsyncInvoker(DeleteHostRequest request) {
        return new AsyncInvoker<>(request, CodeArtsDeployMeta.deleteHost, hcClient);
    }

    /**
     * 查询主机列表
     *
     * 根据主机集群id查询指定主机集群下的主机列表。该接口于2024年09月30日后不再维护，推荐使用新版ListNewHosts接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHostsRequest 请求对象
     * @return CompletableFuture<ListHostsResponse>
     */
    public CompletableFuture<ListHostsResponse> listHostsAsync(ListHostsRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsDeployMeta.listHosts);
    }

    /**
     * 查询主机列表
     *
     * 根据主机集群id查询指定主机集群下的主机列表。该接口于2024年09月30日后不再维护，推荐使用新版ListNewHosts接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHostsRequest 请求对象
     * @return AsyncInvoker<ListHostsRequest, ListHostsResponse>
     */
    public AsyncInvoker<ListHostsRequest, ListHostsResponse> listHostsAsyncInvoker(ListHostsRequest request) {
        return new AsyncInvoker<>(request, CodeArtsDeployMeta.listHosts, hcClient);
    }

    /**
     * 查询主机列表
     *
     * 根据主机集群id查询指定主机集群下的主机列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListNewHostsRequest 请求对象
     * @return CompletableFuture<ListNewHostsResponse>
     */
    public CompletableFuture<ListNewHostsResponse> listNewHostsAsync(ListNewHostsRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsDeployMeta.listNewHosts);
    }

    /**
     * 查询主机列表
     *
     * 根据主机集群id查询指定主机集群下的主机列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListNewHostsRequest 请求对象
     * @return AsyncInvoker<ListNewHostsRequest, ListNewHostsResponse>
     */
    public AsyncInvoker<ListNewHostsRequest, ListNewHostsResponse> listNewHostsAsyncInvoker(
        ListNewHostsRequest request) {
        return new AsyncInvoker<>(request, CodeArtsDeployMeta.listNewHosts, hcClient);
    }

    /**
     * 查询主机详情
     *
     * 根据主机id查询主机详情。该接口于2024年09月30日后不再维护，推荐使用新版ShowHostDetail接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDeploymentHostDetailRequest 请求对象
     * @return CompletableFuture<ShowDeploymentHostDetailResponse>
     */
    public CompletableFuture<ShowDeploymentHostDetailResponse> showDeploymentHostDetailAsync(
        ShowDeploymentHostDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsDeployMeta.showDeploymentHostDetail);
    }

    /**
     * 查询主机详情
     *
     * 根据主机id查询主机详情。该接口于2024年09月30日后不再维护，推荐使用新版ShowHostDetail接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDeploymentHostDetailRequest 请求对象
     * @return AsyncInvoker<ShowDeploymentHostDetailRequest, ShowDeploymentHostDetailResponse>
     */
    public AsyncInvoker<ShowDeploymentHostDetailRequest, ShowDeploymentHostDetailResponse> showDeploymentHostDetailAsyncInvoker(
        ShowDeploymentHostDetailRequest request) {
        return new AsyncInvoker<>(request, CodeArtsDeployMeta.showDeploymentHostDetail, hcClient);
    }

    /**
     * 查询主机详情
     *
     * 根据主机id查询主机详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHostDetailRequest 请求对象
     * @return CompletableFuture<ShowHostDetailResponse>
     */
    public CompletableFuture<ShowHostDetailResponse> showHostDetailAsync(ShowHostDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsDeployMeta.showHostDetail);
    }

    /**
     * 查询主机详情
     *
     * 根据主机id查询主机详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHostDetailRequest 请求对象
     * @return AsyncInvoker<ShowHostDetailRequest, ShowHostDetailResponse>
     */
    public AsyncInvoker<ShowHostDetailRequest, ShowHostDetailResponse> showHostDetailAsyncInvoker(
        ShowHostDetailRequest request) {
        return new AsyncInvoker<>(request, CodeArtsDeployMeta.showHostDetail, hcClient);
    }

    /**
     * 修改主机
     *
     * 根据主机id修改主机信息。该接口于2024年9月30日后不再维护。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDeploymentHostRequest 请求对象
     * @return CompletableFuture<UpdateDeploymentHostResponse>
     */
    public CompletableFuture<UpdateDeploymentHostResponse> updateDeploymentHostAsync(
        UpdateDeploymentHostRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsDeployMeta.updateDeploymentHost);
    }

    /**
     * 修改主机
     *
     * 根据主机id修改主机信息。该接口于2024年9月30日后不再维护。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDeploymentHostRequest 请求对象
     * @return AsyncInvoker<UpdateDeploymentHostRequest, UpdateDeploymentHostResponse>
     */
    public AsyncInvoker<UpdateDeploymentHostRequest, UpdateDeploymentHostResponse> updateDeploymentHostAsyncInvoker(
        UpdateDeploymentHostRequest request) {
        return new AsyncInvoker<>(request, CodeArtsDeployMeta.updateDeploymentHost, hcClient);
    }

    /**
     * 编辑主机集群下主机信息
     *
     * 根据主机id编辑主机集群下主机信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateHostInfoRequest 请求对象
     * @return CompletableFuture<UpdateHostInfoResponse>
     */
    public CompletableFuture<UpdateHostInfoResponse> updateHostInfoAsync(UpdateHostInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsDeployMeta.updateHostInfo);
    }

    /**
     * 编辑主机集群下主机信息
     *
     * 根据主机id编辑主机集群下主机信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateHostInfoRequest 请求对象
     * @return AsyncInvoker<UpdateHostInfoRequest, UpdateHostInfoResponse>
     */
    public AsyncInvoker<UpdateHostInfoRequest, UpdateHostInfoResponse> updateHostInfoAsyncInvoker(
        UpdateHostInfoRequest request) {
        return new AsyncInvoker<>(request, CodeArtsDeployMeta.updateHostInfo, hcClient);
    }

    /**
     * 新建主机集群
     *
     * 在项目下新建主机集群。该接口于2024年09月30日后不再维护，推荐使用新版CreateHostCluster接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDeploymentGroupRequest 请求对象
     * @return CompletableFuture<CreateDeploymentGroupResponse>
     */
    public CompletableFuture<CreateDeploymentGroupResponse> createDeploymentGroupAsync(
        CreateDeploymentGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsDeployMeta.createDeploymentGroup);
    }

    /**
     * 新建主机集群
     *
     * 在项目下新建主机集群。该接口于2024年09月30日后不再维护，推荐使用新版CreateHostCluster接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDeploymentGroupRequest 请求对象
     * @return AsyncInvoker<CreateDeploymentGroupRequest, CreateDeploymentGroupResponse>
     */
    public AsyncInvoker<CreateDeploymentGroupRequest, CreateDeploymentGroupResponse> createDeploymentGroupAsyncInvoker(
        CreateDeploymentGroupRequest request) {
        return new AsyncInvoker<>(request, CodeArtsDeployMeta.createDeploymentGroup, hcClient);
    }

    /**
     * 新建主机集群
     *
     * 在项目下新建主机集群。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateHostClusterRequest 请求对象
     * @return CompletableFuture<CreateHostClusterResponse>
     */
    public CompletableFuture<CreateHostClusterResponse> createHostClusterAsync(CreateHostClusterRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsDeployMeta.createHostCluster);
    }

    /**
     * 新建主机集群
     *
     * 在项目下新建主机集群。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateHostClusterRequest 请求对象
     * @return AsyncInvoker<CreateHostClusterRequest, CreateHostClusterResponse>
     */
    public AsyncInvoker<CreateHostClusterRequest, CreateHostClusterResponse> createHostClusterAsyncInvoker(
        CreateHostClusterRequest request) {
        return new AsyncInvoker<>(request, CodeArtsDeployMeta.createHostCluster, hcClient);
    }

    /**
     * 删除主机集群
     *
     * 根据主机集群id删除主机集群。该接口于2024年9月30日后不再维护。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDeploymentGroupRequest 请求对象
     * @return CompletableFuture<DeleteDeploymentGroupResponse>
     */
    public CompletableFuture<DeleteDeploymentGroupResponse> deleteDeploymentGroupAsync(
        DeleteDeploymentGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsDeployMeta.deleteDeploymentGroup);
    }

    /**
     * 删除主机集群
     *
     * 根据主机集群id删除主机集群。该接口于2024年9月30日后不再维护。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDeploymentGroupRequest 请求对象
     * @return AsyncInvoker<DeleteDeploymentGroupRequest, DeleteDeploymentGroupResponse>
     */
    public AsyncInvoker<DeleteDeploymentGroupRequest, DeleteDeploymentGroupResponse> deleteDeploymentGroupAsyncInvoker(
        DeleteDeploymentGroupRequest request) {
        return new AsyncInvoker<>(request, CodeArtsDeployMeta.deleteDeploymentGroup, hcClient);
    }

    /**
     * 删除主机集群
     *
     * 根据主机集群id删除主机集群。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteHostClusterRequest 请求对象
     * @return CompletableFuture<DeleteHostClusterResponse>
     */
    public CompletableFuture<DeleteHostClusterResponse> deleteHostClusterAsync(DeleteHostClusterRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsDeployMeta.deleteHostCluster);
    }

    /**
     * 删除主机集群
     *
     * 根据主机集群id删除主机集群。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteHostClusterRequest 请求对象
     * @return AsyncInvoker<DeleteHostClusterRequest, DeleteHostClusterResponse>
     */
    public AsyncInvoker<DeleteHostClusterRequest, DeleteHostClusterResponse> deleteHostClusterAsyncInvoker(
        DeleteHostClusterRequest request) {
        return new AsyncInvoker<>(request, CodeArtsDeployMeta.deleteHostCluster, hcClient);
    }

    /**
     * 查询主机集群关联环境信息
     *
     * 查询主机集群关联环境信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAssociateEnvironmentsInfosRequest 请求对象
     * @return CompletableFuture<ListAssociateEnvironmentsInfosResponse>
     */
    public CompletableFuture<ListAssociateEnvironmentsInfosResponse> listAssociateEnvironmentsInfosAsync(
        ListAssociateEnvironmentsInfosRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsDeployMeta.listAssociateEnvironmentsInfos);
    }

    /**
     * 查询主机集群关联环境信息
     *
     * 查询主机集群关联环境信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAssociateEnvironmentsInfosRequest 请求对象
     * @return AsyncInvoker<ListAssociateEnvironmentsInfosRequest, ListAssociateEnvironmentsInfosResponse>
     */
    public AsyncInvoker<ListAssociateEnvironmentsInfosRequest, ListAssociateEnvironmentsInfosResponse> listAssociateEnvironmentsInfosAsyncInvoker(
        ListAssociateEnvironmentsInfosRequest request) {
        return new AsyncInvoker<>(request, CodeArtsDeployMeta.listAssociateEnvironmentsInfos, hcClient);
    }

    /**
     * 查询主机集群列表
     *
     * 按条件查询主机集群列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHostClustersRequest 请求对象
     * @return CompletableFuture<ListHostClustersResponse>
     */
    public CompletableFuture<ListHostClustersResponse> listHostClustersAsync(ListHostClustersRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsDeployMeta.listHostClusters);
    }

    /**
     * 查询主机集群列表
     *
     * 按条件查询主机集群列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHostClustersRequest 请求对象
     * @return AsyncInvoker<ListHostClustersRequest, ListHostClustersResponse>
     */
    public AsyncInvoker<ListHostClustersRequest, ListHostClustersResponse> listHostClustersAsyncInvoker(
        ListHostClustersRequest request) {
        return new AsyncInvoker<>(request, CodeArtsDeployMeta.listHostClusters, hcClient);
    }

    /**
     * 查询应用下环境基本信息列表
     *
     * 查询应用下环境基本信息列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHostGroupBaseInfosRequest 请求对象
     * @return CompletableFuture<ListHostGroupBaseInfosResponse>
     */
    public CompletableFuture<ListHostGroupBaseInfosResponse> listHostGroupBaseInfosAsync(
        ListHostGroupBaseInfosRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsDeployMeta.listHostGroupBaseInfos);
    }

    /**
     * 查询应用下环境基本信息列表
     *
     * 查询应用下环境基本信息列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHostGroupBaseInfosRequest 请求对象
     * @return AsyncInvoker<ListHostGroupBaseInfosRequest, ListHostGroupBaseInfosResponse>
     */
    public AsyncInvoker<ListHostGroupBaseInfosRequest, ListHostGroupBaseInfosResponse> listHostGroupBaseInfosAsyncInvoker(
        ListHostGroupBaseInfosRequest request) {
        return new AsyncInvoker<>(request, CodeArtsDeployMeta.listHostGroupBaseInfos, hcClient);
    }

    /**
     * 查询主机集群列表
     *
     * 按条件查询主机集群列表。该接口于2024年09月30日后不再维护，推荐使用新版ListHostClusters接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHostGroupsRequest 请求对象
     * @return CompletableFuture<ListHostGroupsResponse>
     */
    public CompletableFuture<ListHostGroupsResponse> listHostGroupsAsync(ListHostGroupsRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsDeployMeta.listHostGroups);
    }

    /**
     * 查询主机集群列表
     *
     * 按条件查询主机集群列表。该接口于2024年09月30日后不再维护，推荐使用新版ListHostClusters接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHostGroupsRequest 请求对象
     * @return AsyncInvoker<ListHostGroupsRequest, ListHostGroupsResponse>
     */
    public AsyncInvoker<ListHostGroupsRequest, ListHostGroupsResponse> listHostGroupsAsyncInvoker(
        ListHostGroupsRequest request) {
        return new AsyncInvoker<>(request, CodeArtsDeployMeta.listHostGroups, hcClient);
    }

    /**
     * 查询主机集群详情
     *
     * 根据主机集群id查询主机集群详情。该接口于2024年09月30日后不再维护，推荐使用新版ShowHostClusterDetail接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDeploymentGroupDetailRequest 请求对象
     * @return CompletableFuture<ShowDeploymentGroupDetailResponse>
     */
    public CompletableFuture<ShowDeploymentGroupDetailResponse> showDeploymentGroupDetailAsync(
        ShowDeploymentGroupDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsDeployMeta.showDeploymentGroupDetail);
    }

    /**
     * 查询主机集群详情
     *
     * 根据主机集群id查询主机集群详情。该接口于2024年09月30日后不再维护，推荐使用新版ShowHostClusterDetail接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDeploymentGroupDetailRequest 请求对象
     * @return AsyncInvoker<ShowDeploymentGroupDetailRequest, ShowDeploymentGroupDetailResponse>
     */
    public AsyncInvoker<ShowDeploymentGroupDetailRequest, ShowDeploymentGroupDetailResponse> showDeploymentGroupDetailAsyncInvoker(
        ShowDeploymentGroupDetailRequest request) {
        return new AsyncInvoker<>(request, CodeArtsDeployMeta.showDeploymentGroupDetail, hcClient);
    }

    /**
     * 查询主机集群详情
     *
     * 根据主机集群id查询主机集群详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHostClusterDetailRequest 请求对象
     * @return CompletableFuture<ShowHostClusterDetailResponse>
     */
    public CompletableFuture<ShowHostClusterDetailResponse> showHostClusterDetailAsync(
        ShowHostClusterDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsDeployMeta.showHostClusterDetail);
    }

    /**
     * 查询主机集群详情
     *
     * 根据主机集群id查询主机集群详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHostClusterDetailRequest 请求对象
     * @return AsyncInvoker<ShowHostClusterDetailRequest, ShowHostClusterDetailResponse>
     */
    public AsyncInvoker<ShowHostClusterDetailRequest, ShowHostClusterDetailResponse> showHostClusterDetailAsyncInvoker(
        ShowHostClusterDetailRequest request) {
        return new AsyncInvoker<>(request, CodeArtsDeployMeta.showHostClusterDetail, hcClient);
    }

    /**
     * 修改主机集群
     *
     * 根据主机集群id修改主机集群信息。该接口于2024年9月30日后不再维护。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDeploymentGroupRequest 请求对象
     * @return CompletableFuture<UpdateDeploymentGroupResponse>
     */
    public CompletableFuture<UpdateDeploymentGroupResponse> updateDeploymentGroupAsync(
        UpdateDeploymentGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsDeployMeta.updateDeploymentGroup);
    }

    /**
     * 修改主机集群
     *
     * 根据主机集群id修改主机集群信息。该接口于2024年9月30日后不再维护。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDeploymentGroupRequest 请求对象
     * @return AsyncInvoker<UpdateDeploymentGroupRequest, UpdateDeploymentGroupResponse>
     */
    public AsyncInvoker<UpdateDeploymentGroupRequest, UpdateDeploymentGroupResponse> updateDeploymentGroupAsyncInvoker(
        UpdateDeploymentGroupRequest request) {
        return new AsyncInvoker<>(request, CodeArtsDeployMeta.updateDeploymentGroup, hcClient);
    }

    /**
     * 编辑主机集群
     *
     * 编辑主机集群。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateHostClusterRequest 请求对象
     * @return CompletableFuture<UpdateHostClusterResponse>
     */
    public CompletableFuture<UpdateHostClusterResponse> updateHostClusterAsync(UpdateHostClusterRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsDeployMeta.updateHostCluster);
    }

    /**
     * 编辑主机集群
     *
     * 编辑主机集群。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateHostClusterRequest 请求对象
     * @return AsyncInvoker<UpdateHostClusterRequest, UpdateHostClusterResponse>
     */
    public AsyncInvoker<UpdateHostClusterRequest, UpdateHostClusterResponse> updateHostClusterAsyncInvoker(
        UpdateHostClusterRequest request) {
        return new AsyncInvoker<>(request, CodeArtsDeployMeta.updateHostCluster, hcClient);
    }

    /**
     * 判断当前用户在项目下是否有权限创建主机集群
     *
     * 判断当前用户在项目下是否有权限创建主机集群。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckWhetherHostGroupCanBeCreatedRequest 请求对象
     * @return CompletableFuture<CheckWhetherHostGroupCanBeCreatedResponse>
     */
    public CompletableFuture<CheckWhetherHostGroupCanBeCreatedResponse> checkWhetherHostGroupCanBeCreatedAsync(
        CheckWhetherHostGroupCanBeCreatedRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsDeployMeta.checkWhetherHostGroupCanBeCreated);
    }

    /**
     * 判断当前用户在项目下是否有权限创建主机集群
     *
     * 判断当前用户在项目下是否有权限创建主机集群。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckWhetherHostGroupCanBeCreatedRequest 请求对象
     * @return AsyncInvoker<CheckWhetherHostGroupCanBeCreatedRequest, CheckWhetherHostGroupCanBeCreatedResponse>
     */
    public AsyncInvoker<CheckWhetherHostGroupCanBeCreatedRequest, CheckWhetherHostGroupCanBeCreatedResponse> checkWhetherHostGroupCanBeCreatedAsyncInvoker(
        CheckWhetherHostGroupCanBeCreatedRequest request) {
        return new AsyncInvoker<>(request, CodeArtsDeployMeta.checkWhetherHostGroupCanBeCreated, hcClient);
    }

    /**
     * 查询主机集群权限矩阵
     *
     * 根据主机集群id查询主机集群权限矩阵。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHostGroupPermissionsRequest 请求对象
     * @return CompletableFuture<ListHostGroupPermissionsResponse>
     */
    public CompletableFuture<ListHostGroupPermissionsResponse> listHostGroupPermissionsAsync(
        ListHostGroupPermissionsRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsDeployMeta.listHostGroupPermissions);
    }

    /**
     * 查询主机集群权限矩阵
     *
     * 根据主机集群id查询主机集群权限矩阵。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHostGroupPermissionsRequest 请求对象
     * @return AsyncInvoker<ListHostGroupPermissionsRequest, ListHostGroupPermissionsResponse>
     */
    public AsyncInvoker<ListHostGroupPermissionsRequest, ListHostGroupPermissionsResponse> listHostGroupPermissionsAsyncInvoker(
        ListHostGroupPermissionsRequest request) {
        return new AsyncInvoker<>(request, CodeArtsDeployMeta.listHostGroupPermissions, hcClient);
    }

    /**
     * 修改主机集群权限矩阵
     *
     * 根据主机集群id修改主机集群权限矩阵。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateHostGroupPermissionsRequest 请求对象
     * @return CompletableFuture<UpdateHostGroupPermissionsResponse>
     */
    public CompletableFuture<UpdateHostGroupPermissionsResponse> updateHostGroupPermissionsAsync(
        UpdateHostGroupPermissionsRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsDeployMeta.updateHostGroupPermissions);
    }

    /**
     * 修改主机集群权限矩阵
     *
     * 根据主机集群id修改主机集群权限矩阵。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateHostGroupPermissionsRequest 请求对象
     * @return AsyncInvoker<UpdateHostGroupPermissionsRequest, UpdateHostGroupPermissionsResponse>
     */
    public AsyncInvoker<UpdateHostGroupPermissionsRequest, UpdateHostGroupPermissionsResponse> updateHostGroupPermissionsAsyncInvoker(
        UpdateHostGroupPermissionsRequest request) {
        return new AsyncInvoker<>(request, CodeArtsDeployMeta.updateHostGroupPermissions, hcClient);
    }

    /**
     * 获取指定应用的应用部署成功率
     *
     * 获取指定应用的应用部署成功率。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTaskSuccessRateRequest 请求对象
     * @return CompletableFuture<ListTaskSuccessRateResponse>
     */
    public CompletableFuture<ListTaskSuccessRateResponse> listTaskSuccessRateAsync(ListTaskSuccessRateRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsDeployMeta.listTaskSuccessRate);
    }

    /**
     * 获取指定应用的应用部署成功率
     *
     * 获取指定应用的应用部署成功率。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTaskSuccessRateRequest 请求对象
     * @return AsyncInvoker<ListTaskSuccessRateRequest, ListTaskSuccessRateResponse>
     */
    public AsyncInvoker<ListTaskSuccessRateRequest, ListTaskSuccessRateResponse> listTaskSuccessRateAsyncInvoker(
        ListTaskSuccessRateRequest request) {
        return new AsyncInvoker<>(request, CodeArtsDeployMeta.listTaskSuccessRate, hcClient);
    }

    /**
     * 获取指定项目的应用部署成功率
     *
     * 获取指定项目的应用部署成功率。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowProjectSuccessRateRequest 请求对象
     * @return CompletableFuture<ShowProjectSuccessRateResponse>
     */
    public CompletableFuture<ShowProjectSuccessRateResponse> showProjectSuccessRateAsync(
        ShowProjectSuccessRateRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsDeployMeta.showProjectSuccessRate);
    }

    /**
     * 获取指定项目的应用部署成功率
     *
     * 获取指定项目的应用部署成功率。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowProjectSuccessRateRequest 请求对象
     * @return AsyncInvoker<ShowProjectSuccessRateRequest, ShowProjectSuccessRateResponse>
     */
    public AsyncInvoker<ShowProjectSuccessRateRequest, ShowProjectSuccessRateResponse> showProjectSuccessRateAsyncInvoker(
        ShowProjectSuccessRateRequest request) {
        return new AsyncInvoker<>(request, CodeArtsDeployMeta.showProjectSuccessRate, hcClient);
    }

}
