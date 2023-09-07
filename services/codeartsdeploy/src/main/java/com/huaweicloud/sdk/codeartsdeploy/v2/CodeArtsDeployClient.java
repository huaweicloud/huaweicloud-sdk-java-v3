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
     * 新建应用
     *
     * 新建应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateAppRequest 请求对象
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
     * @param CreateAppRequest 请求对象
     * @return SyncInvoker<CreateAppRequest, CreateAppResponse>
     */
    public SyncInvoker<CreateAppRequest, CreateAppResponse> createAppInvoker(CreateAppRequest request) {
        return new SyncInvoker<CreateAppRequest, CreateAppResponse>(request, CodeArtsDeployMeta.createApp, hcClient);
    }

    /**
     * 通过模板新建应用
     *
     * 通过模板新建应用。该接口于2024年09月30日后不再维护，推荐使用新版CreateApp接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateDeployTaskByTemplateRequest 请求对象
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
     * @param CreateDeployTaskByTemplateRequest 请求对象
     * @return SyncInvoker<CreateDeployTaskByTemplateRequest, CreateDeployTaskByTemplateResponse>
     */
    public SyncInvoker<CreateDeployTaskByTemplateRequest, CreateDeployTaskByTemplateResponse> createDeployTaskByTemplateInvoker(
        CreateDeployTaskByTemplateRequest request) {
        return new SyncInvoker<CreateDeployTaskByTemplateRequest, CreateDeployTaskByTemplateResponse>(request,
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
     * @param DeleteApplicationRequest 请求对象
     * @return SyncInvoker<DeleteApplicationRequest, DeleteApplicationResponse>
     */
    public SyncInvoker<DeleteApplicationRequest, DeleteApplicationResponse> deleteApplicationInvoker(
        DeleteApplicationRequest request) {
        return new SyncInvoker<DeleteApplicationRequest, DeleteApplicationResponse>(request,
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
     * @param DeleteDeployTaskRequest 请求对象
     * @return SyncInvoker<DeleteDeployTaskRequest, DeleteDeployTaskResponse>
     */
    public SyncInvoker<DeleteDeployTaskRequest, DeleteDeployTaskResponse> deleteDeployTaskInvoker(
        DeleteDeployTaskRequest request) {
        return new SyncInvoker<DeleteDeployTaskRequest, DeleteDeployTaskResponse>(request,
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
     * @return ListAllAppResponse
     */
    public ListAllAppResponse listAllApp(ListAllAppRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsDeployMeta.listAllApp);
    }

    /**
     * 获取应用列表
     *
     * 查询项目下应用列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAllAppRequest 请求对象
     * @return SyncInvoker<ListAllAppRequest, ListAllAppResponse>
     */
    public SyncInvoker<ListAllAppRequest, ListAllAppResponse> listAllAppInvoker(ListAllAppRequest request) {
        return new SyncInvoker<ListAllAppRequest, ListAllAppResponse>(request, CodeArtsDeployMeta.listAllApp, hcClient);
    }

    /**
     * 根据开始时间和结束时间查询项目下指定应用的历史部署记录列表
     *
     * 根据开始时间和结束时间查询项目下指定应用的历史部署记录列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDeployTaskHistoryByDateRequest 请求对象
     * @return ListDeployTaskHistoryByDateResponse
     */
    public ListDeployTaskHistoryByDateResponse listDeployTaskHistoryByDate(ListDeployTaskHistoryByDateRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsDeployMeta.listDeployTaskHistoryByDate);
    }

    /**
     * 根据开始时间和结束时间查询项目下指定应用的历史部署记录列表
     *
     * 根据开始时间和结束时间查询项目下指定应用的历史部署记录列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDeployTaskHistoryByDateRequest 请求对象
     * @return SyncInvoker<ListDeployTaskHistoryByDateRequest, ListDeployTaskHistoryByDateResponse>
     */
    public SyncInvoker<ListDeployTaskHistoryByDateRequest, ListDeployTaskHistoryByDateResponse> listDeployTaskHistoryByDateInvoker(
        ListDeployTaskHistoryByDateRequest request) {
        return new SyncInvoker<ListDeployTaskHistoryByDateRequest, ListDeployTaskHistoryByDateResponse>(request,
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
     * @param ListDeployTasksRequest 请求对象
     * @return SyncInvoker<ListDeployTasksRequest, ListDeployTasksResponse>
     */
    public SyncInvoker<ListDeployTasksRequest, ListDeployTasksResponse> listDeployTasksInvoker(
        ListDeployTasksRequest request) {
        return new SyncInvoker<ListDeployTasksRequest, ListDeployTasksResponse>(request,
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
     * @param ShowAppDetailByIdRequest 请求对象
     * @return SyncInvoker<ShowAppDetailByIdRequest, ShowAppDetailByIdResponse>
     */
    public SyncInvoker<ShowAppDetailByIdRequest, ShowAppDetailByIdResponse> showAppDetailByIdInvoker(
        ShowAppDetailByIdRequest request) {
        return new SyncInvoker<ShowAppDetailByIdRequest, ShowAppDetailByIdResponse>(request,
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
     * @param ShowDeployTaskDetailRequest 请求对象
     * @return SyncInvoker<ShowDeployTaskDetailRequest, ShowDeployTaskDetailResponse>
     */
    public SyncInvoker<ShowDeployTaskDetailRequest, ShowDeployTaskDetailResponse> showDeployTaskDetailInvoker(
        ShowDeployTaskDetailRequest request) {
        return new SyncInvoker<ShowDeployTaskDetailRequest, ShowDeployTaskDetailResponse>(request,
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
     * @param StartDeployTaskRequest 请求对象
     * @return SyncInvoker<StartDeployTaskRequest, StartDeployTaskResponse>
     */
    public SyncInvoker<StartDeployTaskRequest, StartDeployTaskResponse> startDeployTaskInvoker(
        StartDeployTaskRequest request) {
        return new SyncInvoker<StartDeployTaskRequest, StartDeployTaskResponse>(request,
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
     * @return CreateEnvironmentResponse
     */
    public CreateEnvironmentResponse createEnvironment(CreateEnvironmentRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsDeployMeta.createEnvironment);
    }

    /**
     * 应用下创建环境
     *
     * 应用下创建环境
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateEnvironmentRequest 请求对象
     * @return SyncInvoker<CreateEnvironmentRequest, CreateEnvironmentResponse>
     */
    public SyncInvoker<CreateEnvironmentRequest, CreateEnvironmentResponse> createEnvironmentInvoker(
        CreateEnvironmentRequest request) {
        return new SyncInvoker<CreateEnvironmentRequest, CreateEnvironmentResponse>(request,
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
     * @return DeleteEnvironmentResponse
     */
    public DeleteEnvironmentResponse deleteEnvironment(DeleteEnvironmentRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsDeployMeta.deleteEnvironment);
    }

    /**
     * 删除应用下的环境
     *
     * 删除应用下的环境
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteEnvironmentRequest 请求对象
     * @return SyncInvoker<DeleteEnvironmentRequest, DeleteEnvironmentResponse>
     */
    public SyncInvoker<DeleteEnvironmentRequest, DeleteEnvironmentResponse> deleteEnvironmentInvoker(
        DeleteEnvironmentRequest request) {
        return new SyncInvoker<DeleteEnvironmentRequest, DeleteEnvironmentResponse>(request,
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
     * @return DeleteHostFromEnvironmentResponse
     */
    public DeleteHostFromEnvironmentResponse deleteHostFromEnvironment(DeleteHostFromEnvironmentRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsDeployMeta.deleteHostFromEnvironment);
    }

    /**
     * 环境下删除主机
     *
     * 环境下删除主机
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteHostFromEnvironmentRequest 请求对象
     * @return SyncInvoker<DeleteHostFromEnvironmentRequest, DeleteHostFromEnvironmentResponse>
     */
    public SyncInvoker<DeleteHostFromEnvironmentRequest, DeleteHostFromEnvironmentResponse> deleteHostFromEnvironmentInvoker(
        DeleteHostFromEnvironmentRequest request) {
        return new SyncInvoker<DeleteHostFromEnvironmentRequest, DeleteHostFromEnvironmentResponse>(request,
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
     * @return ImportHostToEnvironmentResponse
     */
    public ImportHostToEnvironmentResponse importHostToEnvironment(ImportHostToEnvironmentRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsDeployMeta.importHostToEnvironment);
    }

    /**
     * 环境下导入主机
     *
     * 环境下导入主机
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ImportHostToEnvironmentRequest 请求对象
     * @return SyncInvoker<ImportHostToEnvironmentRequest, ImportHostToEnvironmentResponse>
     */
    public SyncInvoker<ImportHostToEnvironmentRequest, ImportHostToEnvironmentResponse> importHostToEnvironmentInvoker(
        ImportHostToEnvironmentRequest request) {
        return new SyncInvoker<ImportHostToEnvironmentRequest, ImportHostToEnvironmentResponse>(request,
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
     * @return ListEnvironmentsResponse
     */
    public ListEnvironmentsResponse listEnvironments(ListEnvironmentsRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsDeployMeta.listEnvironments);
    }

    /**
     * 查询应用下环境列表
     *
     * 查询应用下环境列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListEnvironmentsRequest 请求对象
     * @return SyncInvoker<ListEnvironmentsRequest, ListEnvironmentsResponse>
     */
    public SyncInvoker<ListEnvironmentsRequest, ListEnvironmentsResponse> listEnvironmentsInvoker(
        ListEnvironmentsRequest request) {
        return new SyncInvoker<ListEnvironmentsRequest, ListEnvironmentsResponse>(request,
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
     * @return ShowEnvironmentDetailResponse
     */
    public ShowEnvironmentDetailResponse showEnvironmentDetail(ShowEnvironmentDetailRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsDeployMeta.showEnvironmentDetail);
    }

    /**
     * 查询环境详情
     *
     * 查询环境详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowEnvironmentDetailRequest 请求对象
     * @return SyncInvoker<ShowEnvironmentDetailRequest, ShowEnvironmentDetailResponse>
     */
    public SyncInvoker<ShowEnvironmentDetailRequest, ShowEnvironmentDetailResponse> showEnvironmentDetailInvoker(
        ShowEnvironmentDetailRequest request) {
        return new SyncInvoker<ShowEnvironmentDetailRequest, ShowEnvironmentDetailResponse>(request,
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
     * @param CreateDeploymentHostRequest 请求对象
     * @return SyncInvoker<CreateDeploymentHostRequest, CreateDeploymentHostResponse>
     */
    public SyncInvoker<CreateDeploymentHostRequest, CreateDeploymentHostResponse> createDeploymentHostInvoker(
        CreateDeploymentHostRequest request) {
        return new SyncInvoker<CreateDeploymentHostRequest, CreateDeploymentHostResponse>(request,
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
     * @param CreateHostRequest 请求对象
     * @return SyncInvoker<CreateHostRequest, CreateHostResponse>
     */
    public SyncInvoker<CreateHostRequest, CreateHostResponse> createHostInvoker(CreateHostRequest request) {
        return new SyncInvoker<CreateHostRequest, CreateHostResponse>(request, CodeArtsDeployMeta.createHost, hcClient);
    }

    /**
     * 删除主机
     *
     * 根据主机id删除主机。该接口于2024年9月30日后不再维护。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteDeploymentHostRequest 请求对象
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
     * @param DeleteDeploymentHostRequest 请求对象
     * @return SyncInvoker<DeleteDeploymentHostRequest, DeleteDeploymentHostResponse>
     */
    public SyncInvoker<DeleteDeploymentHostRequest, DeleteDeploymentHostResponse> deleteDeploymentHostInvoker(
        DeleteDeploymentHostRequest request) {
        return new SyncInvoker<DeleteDeploymentHostRequest, DeleteDeploymentHostResponse>(request,
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
     * @param ListHostsRequest 请求对象
     * @return SyncInvoker<ListHostsRequest, ListHostsResponse>
     */
    public SyncInvoker<ListHostsRequest, ListHostsResponse> listHostsInvoker(ListHostsRequest request) {
        return new SyncInvoker<ListHostsRequest, ListHostsResponse>(request, CodeArtsDeployMeta.listHosts, hcClient);
    }

    /**
     * 查询主机列表
     *
     * 根据主机集群id查询指定主机集群下的主机列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListNewHostsRequest 请求对象
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
     * @param ListNewHostsRequest 请求对象
     * @return SyncInvoker<ListNewHostsRequest, ListNewHostsResponse>
     */
    public SyncInvoker<ListNewHostsRequest, ListNewHostsResponse> listNewHostsInvoker(ListNewHostsRequest request) {
        return new SyncInvoker<ListNewHostsRequest, ListNewHostsResponse>(request, CodeArtsDeployMeta.listNewHosts,
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
     * @param ShowDeploymentHostDetailRequest 请求对象
     * @return SyncInvoker<ShowDeploymentHostDetailRequest, ShowDeploymentHostDetailResponse>
     */
    public SyncInvoker<ShowDeploymentHostDetailRequest, ShowDeploymentHostDetailResponse> showDeploymentHostDetailInvoker(
        ShowDeploymentHostDetailRequest request) {
        return new SyncInvoker<ShowDeploymentHostDetailRequest, ShowDeploymentHostDetailResponse>(request,
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
     * @param ShowHostDetailRequest 请求对象
     * @return SyncInvoker<ShowHostDetailRequest, ShowHostDetailResponse>
     */
    public SyncInvoker<ShowHostDetailRequest, ShowHostDetailResponse> showHostDetailInvoker(
        ShowHostDetailRequest request) {
        return new SyncInvoker<ShowHostDetailRequest, ShowHostDetailResponse>(request,
            CodeArtsDeployMeta.showHostDetail, hcClient);
    }

    /**
     * 修改主机
     *
     * 根据主机id修改主机信息。该接口于2024年9月30日后不再维护。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateDeploymentHostRequest 请求对象
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
     * @param UpdateDeploymentHostRequest 请求对象
     * @return SyncInvoker<UpdateDeploymentHostRequest, UpdateDeploymentHostResponse>
     */
    public SyncInvoker<UpdateDeploymentHostRequest, UpdateDeploymentHostResponse> updateDeploymentHostInvoker(
        UpdateDeploymentHostRequest request) {
        return new SyncInvoker<UpdateDeploymentHostRequest, UpdateDeploymentHostResponse>(request,
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
     * @param CreateDeploymentGroupRequest 请求对象
     * @return SyncInvoker<CreateDeploymentGroupRequest, CreateDeploymentGroupResponse>
     */
    public SyncInvoker<CreateDeploymentGroupRequest, CreateDeploymentGroupResponse> createDeploymentGroupInvoker(
        CreateDeploymentGroupRequest request) {
        return new SyncInvoker<CreateDeploymentGroupRequest, CreateDeploymentGroupResponse>(request,
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
     * @param CreateHostClusterRequest 请求对象
     * @return SyncInvoker<CreateHostClusterRequest, CreateHostClusterResponse>
     */
    public SyncInvoker<CreateHostClusterRequest, CreateHostClusterResponse> createHostClusterInvoker(
        CreateHostClusterRequest request) {
        return new SyncInvoker<CreateHostClusterRequest, CreateHostClusterResponse>(request,
            CodeArtsDeployMeta.createHostCluster, hcClient);
    }

    /**
     * 删除主机集群
     *
     * 根据主机集群id删除主机集群。该接口于2024年9月30日后不再维护。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteDeploymentGroupRequest 请求对象
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
     * @param DeleteDeploymentGroupRequest 请求对象
     * @return SyncInvoker<DeleteDeploymentGroupRequest, DeleteDeploymentGroupResponse>
     */
    public SyncInvoker<DeleteDeploymentGroupRequest, DeleteDeploymentGroupResponse> deleteDeploymentGroupInvoker(
        DeleteDeploymentGroupRequest request) {
        return new SyncInvoker<DeleteDeploymentGroupRequest, DeleteDeploymentGroupResponse>(request,
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
     * @param ListHostClustersRequest 请求对象
     * @return SyncInvoker<ListHostClustersRequest, ListHostClustersResponse>
     */
    public SyncInvoker<ListHostClustersRequest, ListHostClustersResponse> listHostClustersInvoker(
        ListHostClustersRequest request) {
        return new SyncInvoker<ListHostClustersRequest, ListHostClustersResponse>(request,
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
     * @param ListHostGroupsRequest 请求对象
     * @return SyncInvoker<ListHostGroupsRequest, ListHostGroupsResponse>
     */
    public SyncInvoker<ListHostGroupsRequest, ListHostGroupsResponse> listHostGroupsInvoker(
        ListHostGroupsRequest request) {
        return new SyncInvoker<ListHostGroupsRequest, ListHostGroupsResponse>(request,
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
     * @return ShowDeploymentGroupDetailResponse
     */
    public ShowDeploymentGroupDetailResponse showDeploymentGroupDetail(ShowDeploymentGroupDetailRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsDeployMeta.showDeploymentGroupDetail);
    }

    /**
     * 查询主机集群
     *
     * 根据主机集群id查询主机集群详情。该接口于2024年09月30日后不再维护，推荐使用新版ShowHostClusterDetail接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDeploymentGroupDetailRequest 请求对象
     * @return SyncInvoker<ShowDeploymentGroupDetailRequest, ShowDeploymentGroupDetailResponse>
     */
    public SyncInvoker<ShowDeploymentGroupDetailRequest, ShowDeploymentGroupDetailResponse> showDeploymentGroupDetailInvoker(
        ShowDeploymentGroupDetailRequest request) {
        return new SyncInvoker<ShowDeploymentGroupDetailRequest, ShowDeploymentGroupDetailResponse>(request,
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
     * @return ShowHostClusterDetailResponse
     */
    public ShowHostClusterDetailResponse showHostClusterDetail(ShowHostClusterDetailRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsDeployMeta.showHostClusterDetail);
    }

    /**
     * 查询主机集群
     *
     * 根据主机集群id查询主机集群详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowHostClusterDetailRequest 请求对象
     * @return SyncInvoker<ShowHostClusterDetailRequest, ShowHostClusterDetailResponse>
     */
    public SyncInvoker<ShowHostClusterDetailRequest, ShowHostClusterDetailResponse> showHostClusterDetailInvoker(
        ShowHostClusterDetailRequest request) {
        return new SyncInvoker<ShowHostClusterDetailRequest, ShowHostClusterDetailResponse>(request,
            CodeArtsDeployMeta.showHostClusterDetail, hcClient);
    }

    /**
     * 修改主机集群
     *
     * 根据主机集群id修改主机集群信息。该接口于2024年9月30日后不再维护。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateDeploymentGroupRequest 请求对象
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
     * @param UpdateDeploymentGroupRequest 请求对象
     * @return SyncInvoker<UpdateDeploymentGroupRequest, UpdateDeploymentGroupResponse>
     */
    public SyncInvoker<UpdateDeploymentGroupRequest, UpdateDeploymentGroupResponse> updateDeploymentGroupInvoker(
        UpdateDeploymentGroupRequest request) {
        return new SyncInvoker<UpdateDeploymentGroupRequest, UpdateDeploymentGroupResponse>(request,
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
     * @return ListTaskSuccessRateResponse
     */
    public ListTaskSuccessRateResponse listTaskSuccessRate(ListTaskSuccessRateRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsDeployMeta.listTaskSuccessRate);
    }

    /**
     * 获取指定应用的应用部署成功率
     *
     * 获取指定应用的应用部署成功率
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTaskSuccessRateRequest 请求对象
     * @return SyncInvoker<ListTaskSuccessRateRequest, ListTaskSuccessRateResponse>
     */
    public SyncInvoker<ListTaskSuccessRateRequest, ListTaskSuccessRateResponse> listTaskSuccessRateInvoker(
        ListTaskSuccessRateRequest request) {
        return new SyncInvoker<ListTaskSuccessRateRequest, ListTaskSuccessRateResponse>(request,
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
     * @return ShowProjectSuccessRateResponse
     */
    public ShowProjectSuccessRateResponse showProjectSuccessRate(ShowProjectSuccessRateRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsDeployMeta.showProjectSuccessRate);
    }

    /**
     * 获取指定项目的应用部署成功率
     *
     * 获取指定项目的应用部署成功率
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowProjectSuccessRateRequest 请求对象
     * @return SyncInvoker<ShowProjectSuccessRateRequest, ShowProjectSuccessRateResponse>
     */
    public SyncInvoker<ShowProjectSuccessRateRequest, ShowProjectSuccessRateResponse> showProjectSuccessRateInvoker(
        ShowProjectSuccessRateRequest request) {
        return new SyncInvoker<ShowProjectSuccessRateRequest, ShowProjectSuccessRateResponse>(request,
            CodeArtsDeployMeta.showProjectSuccessRate, hcClient);
    }

}
