package com.huaweicloud.sdk.codeartsdeploy.v2;

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
import com.huaweicloud.sdk.codeartsdeploy.v2.model.DeleteHostFromEnvironmentRequest;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.DeleteHostFromEnvironmentResponse;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.ImportHostToEnvironmentRequest;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.ImportHostToEnvironmentResponse;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.ListAllAppRequest;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.ListAllAppResponse;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.ListDeployTaskHistoryByDateRequest;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.ListDeployTaskHistoryByDateResponse;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.ListDeployTasksRequest;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.ListDeployTasksResponse;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.ListEnvironmentsRequest;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.ListEnvironmentsResponse;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.ListHostClustersRequest;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.ListHostClustersResponse;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.ListHostGroupsRequest;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.ListHostGroupsResponse;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.ListHostsRequest;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.ListHostsResponse;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.ListNewHostsRequest;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.ListNewHostsResponse;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.ListTaskSuccessRateRequest;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.ListTaskSuccessRateResponse;
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
import com.huaweicloud.sdk.codeartsdeploy.v2.model.ShowHostClusterDetailRequest;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.ShowHostClusterDetailResponse;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.ShowHostDetailRequest;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.ShowHostDetailResponse;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.ShowProjectSuccessRateRequest;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.ShowProjectSuccessRateResponse;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.StartDeployTaskRequest;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.StartDeployTaskResponse;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.UpdateDeploymentGroupRequest;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.UpdateDeploymentGroupResponse;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.UpdateDeploymentHostRequest;
import com.huaweicloud.sdk.codeartsdeploy.v2.model.UpdateDeploymentHostResponse;
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
     * 新建应用
     *
     * 新建应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateAppRequest 请求对象
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
     * @param CreateAppRequest 请求对象
     * @return AsyncInvoker<CreateAppRequest, CreateAppResponse>
     */
    public AsyncInvoker<CreateAppRequest, CreateAppResponse> createAppAsyncInvoker(CreateAppRequest request) {
        return new AsyncInvoker<CreateAppRequest, CreateAppResponse>(request, CodeArtsDeployMeta.createApp, hcClient);
    }

    /**
     * 通过模板新建应用
     *
     * 通过模板新建应用。该接口于2024年09月30日后不再维护，推荐使用新版CreateApp接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateDeployTaskByTemplateRequest 请求对象
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
     * @param CreateDeployTaskByTemplateRequest 请求对象
     * @return AsyncInvoker<CreateDeployTaskByTemplateRequest, CreateDeployTaskByTemplateResponse>
     */
    public AsyncInvoker<CreateDeployTaskByTemplateRequest, CreateDeployTaskByTemplateResponse> createDeployTaskByTemplateAsyncInvoker(
        CreateDeployTaskByTemplateRequest request) {
        return new AsyncInvoker<CreateDeployTaskByTemplateRequest, CreateDeployTaskByTemplateResponse>(request,
            CodeArtsDeployMeta.createDeployTaskByTemplate, hcClient);
    }

    /**
     * 删除应用
     *
     * 根据应用id删除应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteApplicationRequest 请求对象
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
     * @param DeleteApplicationRequest 请求对象
     * @return AsyncInvoker<DeleteApplicationRequest, DeleteApplicationResponse>
     */
    public AsyncInvoker<DeleteApplicationRequest, DeleteApplicationResponse> deleteApplicationAsyncInvoker(
        DeleteApplicationRequest request) {
        return new AsyncInvoker<DeleteApplicationRequest, DeleteApplicationResponse>(request,
            CodeArtsDeployMeta.deleteApplication, hcClient);
    }

    /**
     * 删除应用
     *
     * 根据部署任务id删除应用。该接口于2024年09月30日后不再维护，推荐使用新版DeleteApplication接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteDeployTaskRequest 请求对象
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
     * @param DeleteDeployTaskRequest 请求对象
     * @return AsyncInvoker<DeleteDeployTaskRequest, DeleteDeployTaskResponse>
     */
    public AsyncInvoker<DeleteDeployTaskRequest, DeleteDeployTaskResponse> deleteDeployTaskAsyncInvoker(
        DeleteDeployTaskRequest request) {
        return new AsyncInvoker<DeleteDeployTaskRequest, DeleteDeployTaskResponse>(request,
            CodeArtsDeployMeta.deleteDeployTask, hcClient);
    }

    /**
     * 获取应用列表
     *
     * 查询项目下应用列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAllAppRequest 请求对象
     * @return CompletableFuture<ListAllAppResponse>
     */
    public CompletableFuture<ListAllAppResponse> listAllAppAsync(ListAllAppRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsDeployMeta.listAllApp);
    }

    /**
     * 获取应用列表
     *
     * 查询项目下应用列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAllAppRequest 请求对象
     * @return AsyncInvoker<ListAllAppRequest, ListAllAppResponse>
     */
    public AsyncInvoker<ListAllAppRequest, ListAllAppResponse> listAllAppAsyncInvoker(ListAllAppRequest request) {
        return new AsyncInvoker<ListAllAppRequest, ListAllAppResponse>(request, CodeArtsDeployMeta.listAllApp,
            hcClient);
    }

    /**
     * 根据开始时间和结束时间查询项目下指定应用的历史部署记录列表
     *
     * 根据开始时间和结束时间查询项目下指定应用的历史部署记录列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDeployTaskHistoryByDateRequest 请求对象
     * @return CompletableFuture<ListDeployTaskHistoryByDateResponse>
     */
    public CompletableFuture<ListDeployTaskHistoryByDateResponse> listDeployTaskHistoryByDateAsync(
        ListDeployTaskHistoryByDateRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsDeployMeta.listDeployTaskHistoryByDate);
    }

    /**
     * 根据开始时间和结束时间查询项目下指定应用的历史部署记录列表
     *
     * 根据开始时间和结束时间查询项目下指定应用的历史部署记录列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDeployTaskHistoryByDateRequest 请求对象
     * @return AsyncInvoker<ListDeployTaskHistoryByDateRequest, ListDeployTaskHistoryByDateResponse>
     */
    public AsyncInvoker<ListDeployTaskHistoryByDateRequest, ListDeployTaskHistoryByDateResponse> listDeployTaskHistoryByDateAsyncInvoker(
        ListDeployTaskHistoryByDateRequest request) {
        return new AsyncInvoker<ListDeployTaskHistoryByDateRequest, ListDeployTaskHistoryByDateResponse>(request,
            CodeArtsDeployMeta.listDeployTaskHistoryByDate, hcClient);
    }

    /**
     * 获取应用列表
     *
     * 查询项目下应用列表。该接口于2024年09月30日后不再维护，推荐使用新版ListAllApp接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDeployTasksRequest 请求对象
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
     * @param ListDeployTasksRequest 请求对象
     * @return AsyncInvoker<ListDeployTasksRequest, ListDeployTasksResponse>
     */
    public AsyncInvoker<ListDeployTasksRequest, ListDeployTasksResponse> listDeployTasksAsyncInvoker(
        ListDeployTasksRequest request) {
        return new AsyncInvoker<ListDeployTasksRequest, ListDeployTasksResponse>(request,
            CodeArtsDeployMeta.listDeployTasks, hcClient);
    }

    /**
     * 获取应用详情
     *
     * 根据应用id获取应用详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAppDetailByIdRequest 请求对象
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
     * @param ShowAppDetailByIdRequest 请求对象
     * @return AsyncInvoker<ShowAppDetailByIdRequest, ShowAppDetailByIdResponse>
     */
    public AsyncInvoker<ShowAppDetailByIdRequest, ShowAppDetailByIdResponse> showAppDetailByIdAsyncInvoker(
        ShowAppDetailByIdRequest request) {
        return new AsyncInvoker<ShowAppDetailByIdRequest, ShowAppDetailByIdResponse>(request,
            CodeArtsDeployMeta.showAppDetailById, hcClient);
    }

    /**
     * 获取应用详情
     *
     * 根据部署任务id获取应用详情。该接口于2024年09月30日后不再维护，推荐使用新版ShowAppDetailById接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDeployTaskDetailRequest 请求对象
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
     * @param ShowDeployTaskDetailRequest 请求对象
     * @return AsyncInvoker<ShowDeployTaskDetailRequest, ShowDeployTaskDetailResponse>
     */
    public AsyncInvoker<ShowDeployTaskDetailRequest, ShowDeployTaskDetailResponse> showDeployTaskDetailAsyncInvoker(
        ShowDeployTaskDetailRequest request) {
        return new AsyncInvoker<ShowDeployTaskDetailRequest, ShowDeployTaskDetailResponse>(request,
            CodeArtsDeployMeta.showDeployTaskDetail, hcClient);
    }

    /**
     * 部署应用
     *
     * 根据部署任务id部署应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StartDeployTaskRequest 请求对象
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
     * @param StartDeployTaskRequest 请求对象
     * @return AsyncInvoker<StartDeployTaskRequest, StartDeployTaskResponse>
     */
    public AsyncInvoker<StartDeployTaskRequest, StartDeployTaskResponse> startDeployTaskAsyncInvoker(
        StartDeployTaskRequest request) {
        return new AsyncInvoker<StartDeployTaskRequest, StartDeployTaskResponse>(request,
            CodeArtsDeployMeta.startDeployTask, hcClient);
    }

    /**
     * 应用下创建环境
     *
     * 应用下创建环境
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateEnvironmentRequest 请求对象
     * @return CompletableFuture<CreateEnvironmentResponse>
     */
    public CompletableFuture<CreateEnvironmentResponse> createEnvironmentAsync(CreateEnvironmentRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsDeployMeta.createEnvironment);
    }

    /**
     * 应用下创建环境
     *
     * 应用下创建环境
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateEnvironmentRequest 请求对象
     * @return AsyncInvoker<CreateEnvironmentRequest, CreateEnvironmentResponse>
     */
    public AsyncInvoker<CreateEnvironmentRequest, CreateEnvironmentResponse> createEnvironmentAsyncInvoker(
        CreateEnvironmentRequest request) {
        return new AsyncInvoker<CreateEnvironmentRequest, CreateEnvironmentResponse>(request,
            CodeArtsDeployMeta.createEnvironment, hcClient);
    }

    /**
     * 删除应用下的环境
     *
     * 删除应用下的环境
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteEnvironmentRequest 请求对象
     * @return CompletableFuture<DeleteEnvironmentResponse>
     */
    public CompletableFuture<DeleteEnvironmentResponse> deleteEnvironmentAsync(DeleteEnvironmentRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsDeployMeta.deleteEnvironment);
    }

    /**
     * 删除应用下的环境
     *
     * 删除应用下的环境
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteEnvironmentRequest 请求对象
     * @return AsyncInvoker<DeleteEnvironmentRequest, DeleteEnvironmentResponse>
     */
    public AsyncInvoker<DeleteEnvironmentRequest, DeleteEnvironmentResponse> deleteEnvironmentAsyncInvoker(
        DeleteEnvironmentRequest request) {
        return new AsyncInvoker<DeleteEnvironmentRequest, DeleteEnvironmentResponse>(request,
            CodeArtsDeployMeta.deleteEnvironment, hcClient);
    }

    /**
     * 环境下删除主机
     *
     * 环境下删除主机
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteHostFromEnvironmentRequest 请求对象
     * @return CompletableFuture<DeleteHostFromEnvironmentResponse>
     */
    public CompletableFuture<DeleteHostFromEnvironmentResponse> deleteHostFromEnvironmentAsync(
        DeleteHostFromEnvironmentRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsDeployMeta.deleteHostFromEnvironment);
    }

    /**
     * 环境下删除主机
     *
     * 环境下删除主机
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteHostFromEnvironmentRequest 请求对象
     * @return AsyncInvoker<DeleteHostFromEnvironmentRequest, DeleteHostFromEnvironmentResponse>
     */
    public AsyncInvoker<DeleteHostFromEnvironmentRequest, DeleteHostFromEnvironmentResponse> deleteHostFromEnvironmentAsyncInvoker(
        DeleteHostFromEnvironmentRequest request) {
        return new AsyncInvoker<DeleteHostFromEnvironmentRequest, DeleteHostFromEnvironmentResponse>(request,
            CodeArtsDeployMeta.deleteHostFromEnvironment, hcClient);
    }

    /**
     * 环境下导入主机
     *
     * 环境下导入主机
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ImportHostToEnvironmentRequest 请求对象
     * @return CompletableFuture<ImportHostToEnvironmentResponse>
     */
    public CompletableFuture<ImportHostToEnvironmentResponse> importHostToEnvironmentAsync(
        ImportHostToEnvironmentRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsDeployMeta.importHostToEnvironment);
    }

    /**
     * 环境下导入主机
     *
     * 环境下导入主机
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ImportHostToEnvironmentRequest 请求对象
     * @return AsyncInvoker<ImportHostToEnvironmentRequest, ImportHostToEnvironmentResponse>
     */
    public AsyncInvoker<ImportHostToEnvironmentRequest, ImportHostToEnvironmentResponse> importHostToEnvironmentAsyncInvoker(
        ImportHostToEnvironmentRequest request) {
        return new AsyncInvoker<ImportHostToEnvironmentRequest, ImportHostToEnvironmentResponse>(request,
            CodeArtsDeployMeta.importHostToEnvironment, hcClient);
    }

    /**
     * 查询应用下环境列表
     *
     * 查询应用下环境列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListEnvironmentsRequest 请求对象
     * @return CompletableFuture<ListEnvironmentsResponse>
     */
    public CompletableFuture<ListEnvironmentsResponse> listEnvironmentsAsync(ListEnvironmentsRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsDeployMeta.listEnvironments);
    }

    /**
     * 查询应用下环境列表
     *
     * 查询应用下环境列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListEnvironmentsRequest 请求对象
     * @return AsyncInvoker<ListEnvironmentsRequest, ListEnvironmentsResponse>
     */
    public AsyncInvoker<ListEnvironmentsRequest, ListEnvironmentsResponse> listEnvironmentsAsyncInvoker(
        ListEnvironmentsRequest request) {
        return new AsyncInvoker<ListEnvironmentsRequest, ListEnvironmentsResponse>(request,
            CodeArtsDeployMeta.listEnvironments, hcClient);
    }

    /**
     * 查询环境详情
     *
     * 查询环境详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowEnvironmentDetailRequest 请求对象
     * @return CompletableFuture<ShowEnvironmentDetailResponse>
     */
    public CompletableFuture<ShowEnvironmentDetailResponse> showEnvironmentDetailAsync(
        ShowEnvironmentDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsDeployMeta.showEnvironmentDetail);
    }

    /**
     * 查询环境详情
     *
     * 查询环境详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowEnvironmentDetailRequest 请求对象
     * @return AsyncInvoker<ShowEnvironmentDetailRequest, ShowEnvironmentDetailResponse>
     */
    public AsyncInvoker<ShowEnvironmentDetailRequest, ShowEnvironmentDetailResponse> showEnvironmentDetailAsyncInvoker(
        ShowEnvironmentDetailRequest request) {
        return new AsyncInvoker<ShowEnvironmentDetailRequest, ShowEnvironmentDetailResponse>(request,
            CodeArtsDeployMeta.showEnvironmentDetail, hcClient);
    }

    /**
     * 新建主机
     *
     * 在指定主机集群下新建主机。该接口于2024年09月30日后不再维护，推荐使用新版CreateHost接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateDeploymentHostRequest 请求对象
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
     * @param CreateDeploymentHostRequest 请求对象
     * @return AsyncInvoker<CreateDeploymentHostRequest, CreateDeploymentHostResponse>
     */
    public AsyncInvoker<CreateDeploymentHostRequest, CreateDeploymentHostResponse> createDeploymentHostAsyncInvoker(
        CreateDeploymentHostRequest request) {
        return new AsyncInvoker<CreateDeploymentHostRequest, CreateDeploymentHostResponse>(request,
            CodeArtsDeployMeta.createDeploymentHost, hcClient);
    }

    /**
     * 新建主机
     *
     * 在指定主机集群下新建主机。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateHostRequest 请求对象
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
     * @param CreateHostRequest 请求对象
     * @return AsyncInvoker<CreateHostRequest, CreateHostResponse>
     */
    public AsyncInvoker<CreateHostRequest, CreateHostResponse> createHostAsyncInvoker(CreateHostRequest request) {
        return new AsyncInvoker<CreateHostRequest, CreateHostResponse>(request, CodeArtsDeployMeta.createHost,
            hcClient);
    }

    /**
     * 删除主机
     *
     * 根据主机id删除主机。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteDeploymentHostRequest 请求对象
     * @return CompletableFuture<DeleteDeploymentHostResponse>
     */
    public CompletableFuture<DeleteDeploymentHostResponse> deleteDeploymentHostAsync(
        DeleteDeploymentHostRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsDeployMeta.deleteDeploymentHost);
    }

    /**
     * 删除主机
     *
     * 根据主机id删除主机。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteDeploymentHostRequest 请求对象
     * @return AsyncInvoker<DeleteDeploymentHostRequest, DeleteDeploymentHostResponse>
     */
    public AsyncInvoker<DeleteDeploymentHostRequest, DeleteDeploymentHostResponse> deleteDeploymentHostAsyncInvoker(
        DeleteDeploymentHostRequest request) {
        return new AsyncInvoker<DeleteDeploymentHostRequest, DeleteDeploymentHostResponse>(request,
            CodeArtsDeployMeta.deleteDeploymentHost, hcClient);
    }

    /**
     * 查询主机列表
     *
     * 根据主机集群id查询指定主机集群下的主机列表。该接口于2024年09月30日后不再维护，推荐使用新版ListNewHosts接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListHostsRequest 请求对象
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
     * @param ListHostsRequest 请求对象
     * @return AsyncInvoker<ListHostsRequest, ListHostsResponse>
     */
    public AsyncInvoker<ListHostsRequest, ListHostsResponse> listHostsAsyncInvoker(ListHostsRequest request) {
        return new AsyncInvoker<ListHostsRequest, ListHostsResponse>(request, CodeArtsDeployMeta.listHosts, hcClient);
    }

    /**
     * 查询主机列表
     *
     * 根据主机集群id查询指定主机集群下的主机列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListNewHostsRequest 请求对象
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
     * @param ListNewHostsRequest 请求对象
     * @return AsyncInvoker<ListNewHostsRequest, ListNewHostsResponse>
     */
    public AsyncInvoker<ListNewHostsRequest, ListNewHostsResponse> listNewHostsAsyncInvoker(
        ListNewHostsRequest request) {
        return new AsyncInvoker<ListNewHostsRequest, ListNewHostsResponse>(request, CodeArtsDeployMeta.listNewHosts,
            hcClient);
    }

    /**
     * 查询主机详情
     *
     * 根据主机id查询主机详情。该接口于2024年09月30日后不再维护，推荐使用新版ShowHostDetail接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDeploymentHostDetailRequest 请求对象
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
     * @param ShowDeploymentHostDetailRequest 请求对象
     * @return AsyncInvoker<ShowDeploymentHostDetailRequest, ShowDeploymentHostDetailResponse>
     */
    public AsyncInvoker<ShowDeploymentHostDetailRequest, ShowDeploymentHostDetailResponse> showDeploymentHostDetailAsyncInvoker(
        ShowDeploymentHostDetailRequest request) {
        return new AsyncInvoker<ShowDeploymentHostDetailRequest, ShowDeploymentHostDetailResponse>(request,
            CodeArtsDeployMeta.showDeploymentHostDetail, hcClient);
    }

    /**
     * 查询主机详情
     *
     * 根据主机id查询主机详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowHostDetailRequest 请求对象
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
     * @param ShowHostDetailRequest 请求对象
     * @return AsyncInvoker<ShowHostDetailRequest, ShowHostDetailResponse>
     */
    public AsyncInvoker<ShowHostDetailRequest, ShowHostDetailResponse> showHostDetailAsyncInvoker(
        ShowHostDetailRequest request) {
        return new AsyncInvoker<ShowHostDetailRequest, ShowHostDetailResponse>(request,
            CodeArtsDeployMeta.showHostDetail, hcClient);
    }

    /**
     * 修改主机
     *
     * 根据主机id修改主机信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateDeploymentHostRequest 请求对象
     * @return CompletableFuture<UpdateDeploymentHostResponse>
     */
    public CompletableFuture<UpdateDeploymentHostResponse> updateDeploymentHostAsync(
        UpdateDeploymentHostRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsDeployMeta.updateDeploymentHost);
    }

    /**
     * 修改主机
     *
     * 根据主机id修改主机信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateDeploymentHostRequest 请求对象
     * @return AsyncInvoker<UpdateDeploymentHostRequest, UpdateDeploymentHostResponse>
     */
    public AsyncInvoker<UpdateDeploymentHostRequest, UpdateDeploymentHostResponse> updateDeploymentHostAsyncInvoker(
        UpdateDeploymentHostRequest request) {
        return new AsyncInvoker<UpdateDeploymentHostRequest, UpdateDeploymentHostResponse>(request,
            CodeArtsDeployMeta.updateDeploymentHost, hcClient);
    }

    /**
     * 新建主机集群
     *
     * 在项目下新建主机集群。该接口于2024年09月30日后不再维护，推荐使用新版CreateHostCluster接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateDeploymentGroupRequest 请求对象
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
     * @param CreateDeploymentGroupRequest 请求对象
     * @return AsyncInvoker<CreateDeploymentGroupRequest, CreateDeploymentGroupResponse>
     */
    public AsyncInvoker<CreateDeploymentGroupRequest, CreateDeploymentGroupResponse> createDeploymentGroupAsyncInvoker(
        CreateDeploymentGroupRequest request) {
        return new AsyncInvoker<CreateDeploymentGroupRequest, CreateDeploymentGroupResponse>(request,
            CodeArtsDeployMeta.createDeploymentGroup, hcClient);
    }

    /**
     * 新建主机集群
     *
     * 在项目下新建主机集群。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateHostClusterRequest 请求对象
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
     * @param CreateHostClusterRequest 请求对象
     * @return AsyncInvoker<CreateHostClusterRequest, CreateHostClusterResponse>
     */
    public AsyncInvoker<CreateHostClusterRequest, CreateHostClusterResponse> createHostClusterAsyncInvoker(
        CreateHostClusterRequest request) {
        return new AsyncInvoker<CreateHostClusterRequest, CreateHostClusterResponse>(request,
            CodeArtsDeployMeta.createHostCluster, hcClient);
    }

    /**
     * 删除主机集群
     *
     * 根据主机集群id删除主机集群。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteDeploymentGroupRequest 请求对象
     * @return CompletableFuture<DeleteDeploymentGroupResponse>
     */
    public CompletableFuture<DeleteDeploymentGroupResponse> deleteDeploymentGroupAsync(
        DeleteDeploymentGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsDeployMeta.deleteDeploymentGroup);
    }

    /**
     * 删除主机集群
     *
     * 根据主机集群id删除主机集群。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteDeploymentGroupRequest 请求对象
     * @return AsyncInvoker<DeleteDeploymentGroupRequest, DeleteDeploymentGroupResponse>
     */
    public AsyncInvoker<DeleteDeploymentGroupRequest, DeleteDeploymentGroupResponse> deleteDeploymentGroupAsyncInvoker(
        DeleteDeploymentGroupRequest request) {
        return new AsyncInvoker<DeleteDeploymentGroupRequest, DeleteDeploymentGroupResponse>(request,
            CodeArtsDeployMeta.deleteDeploymentGroup, hcClient);
    }

    /**
     * 查询主机集群列表
     *
     * 按条件查询主机集群列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListHostClustersRequest 请求对象
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
     * @param ListHostClustersRequest 请求对象
     * @return AsyncInvoker<ListHostClustersRequest, ListHostClustersResponse>
     */
    public AsyncInvoker<ListHostClustersRequest, ListHostClustersResponse> listHostClustersAsyncInvoker(
        ListHostClustersRequest request) {
        return new AsyncInvoker<ListHostClustersRequest, ListHostClustersResponse>(request,
            CodeArtsDeployMeta.listHostClusters, hcClient);
    }

    /**
     * 查询主机集群列表
     *
     * 按条件查询主机集群列表。该接口于2024年09月30日后不再维护，推荐使用新版ListHostClusters接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListHostGroupsRequest 请求对象
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
     * @param ListHostGroupsRequest 请求对象
     * @return AsyncInvoker<ListHostGroupsRequest, ListHostGroupsResponse>
     */
    public AsyncInvoker<ListHostGroupsRequest, ListHostGroupsResponse> listHostGroupsAsyncInvoker(
        ListHostGroupsRequest request) {
        return new AsyncInvoker<ListHostGroupsRequest, ListHostGroupsResponse>(request,
            CodeArtsDeployMeta.listHostGroups, hcClient);
    }

    /**
     * 查询主机集群
     *
     * 根据主机集群id查询主机集群详情。该接口于2024年09月30日后不再维护，推荐使用新版ShowHostClusterDetail接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDeploymentGroupDetailRequest 请求对象
     * @return CompletableFuture<ShowDeploymentGroupDetailResponse>
     */
    public CompletableFuture<ShowDeploymentGroupDetailResponse> showDeploymentGroupDetailAsync(
        ShowDeploymentGroupDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsDeployMeta.showDeploymentGroupDetail);
    }

    /**
     * 查询主机集群
     *
     * 根据主机集群id查询主机集群详情。该接口于2024年09月30日后不再维护，推荐使用新版ShowHostClusterDetail接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDeploymentGroupDetailRequest 请求对象
     * @return AsyncInvoker<ShowDeploymentGroupDetailRequest, ShowDeploymentGroupDetailResponse>
     */
    public AsyncInvoker<ShowDeploymentGroupDetailRequest, ShowDeploymentGroupDetailResponse> showDeploymentGroupDetailAsyncInvoker(
        ShowDeploymentGroupDetailRequest request) {
        return new AsyncInvoker<ShowDeploymentGroupDetailRequest, ShowDeploymentGroupDetailResponse>(request,
            CodeArtsDeployMeta.showDeploymentGroupDetail, hcClient);
    }

    /**
     * 查询主机集群
     *
     * 根据主机集群id查询主机集群详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowHostClusterDetailRequest 请求对象
     * @return CompletableFuture<ShowHostClusterDetailResponse>
     */
    public CompletableFuture<ShowHostClusterDetailResponse> showHostClusterDetailAsync(
        ShowHostClusterDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsDeployMeta.showHostClusterDetail);
    }

    /**
     * 查询主机集群
     *
     * 根据主机集群id查询主机集群详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowHostClusterDetailRequest 请求对象
     * @return AsyncInvoker<ShowHostClusterDetailRequest, ShowHostClusterDetailResponse>
     */
    public AsyncInvoker<ShowHostClusterDetailRequest, ShowHostClusterDetailResponse> showHostClusterDetailAsyncInvoker(
        ShowHostClusterDetailRequest request) {
        return new AsyncInvoker<ShowHostClusterDetailRequest, ShowHostClusterDetailResponse>(request,
            CodeArtsDeployMeta.showHostClusterDetail, hcClient);
    }

    /**
     * 修改主机集群
     *
     * 根据主机集群id修改主机集群信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateDeploymentGroupRequest 请求对象
     * @return CompletableFuture<UpdateDeploymentGroupResponse>
     */
    public CompletableFuture<UpdateDeploymentGroupResponse> updateDeploymentGroupAsync(
        UpdateDeploymentGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsDeployMeta.updateDeploymentGroup);
    }

    /**
     * 修改主机集群
     *
     * 根据主机集群id修改主机集群信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateDeploymentGroupRequest 请求对象
     * @return AsyncInvoker<UpdateDeploymentGroupRequest, UpdateDeploymentGroupResponse>
     */
    public AsyncInvoker<UpdateDeploymentGroupRequest, UpdateDeploymentGroupResponse> updateDeploymentGroupAsyncInvoker(
        UpdateDeploymentGroupRequest request) {
        return new AsyncInvoker<UpdateDeploymentGroupRequest, UpdateDeploymentGroupResponse>(request,
            CodeArtsDeployMeta.updateDeploymentGroup, hcClient);
    }

    /**
     * 获取指定应用的应用部署成功率
     *
     * 获取指定应用的应用部署成功率
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTaskSuccessRateRequest 请求对象
     * @return CompletableFuture<ListTaskSuccessRateResponse>
     */
    public CompletableFuture<ListTaskSuccessRateResponse> listTaskSuccessRateAsync(ListTaskSuccessRateRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsDeployMeta.listTaskSuccessRate);
    }

    /**
     * 获取指定应用的应用部署成功率
     *
     * 获取指定应用的应用部署成功率
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTaskSuccessRateRequest 请求对象
     * @return AsyncInvoker<ListTaskSuccessRateRequest, ListTaskSuccessRateResponse>
     */
    public AsyncInvoker<ListTaskSuccessRateRequest, ListTaskSuccessRateResponse> listTaskSuccessRateAsyncInvoker(
        ListTaskSuccessRateRequest request) {
        return new AsyncInvoker<ListTaskSuccessRateRequest, ListTaskSuccessRateResponse>(request,
            CodeArtsDeployMeta.listTaskSuccessRate, hcClient);
    }

    /**
     * 获取指定项目的应用部署成功率
     *
     * 获取指定项目的应用部署成功率
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowProjectSuccessRateRequest 请求对象
     * @return CompletableFuture<ShowProjectSuccessRateResponse>
     */
    public CompletableFuture<ShowProjectSuccessRateResponse> showProjectSuccessRateAsync(
        ShowProjectSuccessRateRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsDeployMeta.showProjectSuccessRate);
    }

    /**
     * 获取指定项目的应用部署成功率
     *
     * 获取指定项目的应用部署成功率
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowProjectSuccessRateRequest 请求对象
     * @return AsyncInvoker<ShowProjectSuccessRateRequest, ShowProjectSuccessRateResponse>
     */
    public AsyncInvoker<ShowProjectSuccessRateRequest, ShowProjectSuccessRateResponse> showProjectSuccessRateAsyncInvoker(
        ShowProjectSuccessRateRequest request) {
        return new AsyncInvoker<ShowProjectSuccessRateRequest, ShowProjectSuccessRateResponse>(request,
            CodeArtsDeployMeta.showProjectSuccessRate, hcClient);
    }

}
