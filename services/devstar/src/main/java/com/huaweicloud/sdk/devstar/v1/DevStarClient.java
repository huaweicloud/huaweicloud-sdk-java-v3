package com.huaweicloud.sdk.devstar.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.devstar.v1.model.CheckRepositoryDuplicateNameRequest;
import com.huaweicloud.sdk.devstar.v1.model.CheckRepositoryDuplicateNameResponse;
import com.huaweicloud.sdk.devstar.v1.model.ConfirmDeploymentJobRequest;
import com.huaweicloud.sdk.devstar.v1.model.ConfirmDeploymentJobResponse;
import com.huaweicloud.sdk.devstar.v1.model.CreateDeploymentJobsRequest;
import com.huaweicloud.sdk.devstar.v1.model.CreateDeploymentJobsResponse;
import com.huaweicloud.sdk.devstar.v1.model.CreateTemplateViewHistoriesRequest;
import com.huaweicloud.sdk.devstar.v1.model.CreateTemplateViewHistoriesResponse;
import com.huaweicloud.sdk.devstar.v1.model.DeleteApplicationV4Request;
import com.huaweicloud.sdk.devstar.v1.model.DeleteApplicationV4Response;
import com.huaweicloud.sdk.devstar.v1.model.DownloadApplicationCodeRequest;
import com.huaweicloud.sdk.devstar.v1.model.DownloadApplicationCodeResponse;
import com.huaweicloud.sdk.devstar.v1.model.ListApplicationsV6Request;
import com.huaweicloud.sdk.devstar.v1.model.ListApplicationsV6Response;
import com.huaweicloud.sdk.devstar.v1.model.ListPipelineTemplatesRequest;
import com.huaweicloud.sdk.devstar.v1.model.ListPipelineTemplatesResponse;
import com.huaweicloud.sdk.devstar.v1.model.ListProjectsV4Request;
import com.huaweicloud.sdk.devstar.v1.model.ListProjectsV4Response;
import com.huaweicloud.sdk.devstar.v1.model.ListPublishedTemplatesRequest;
import com.huaweicloud.sdk.devstar.v1.model.ListPublishedTemplatesResponse;
import com.huaweicloud.sdk.devstar.v1.model.ListTemplateViewHistoriesRequest;
import com.huaweicloud.sdk.devstar.v1.model.ListTemplateViewHistoriesResponse;
import com.huaweicloud.sdk.devstar.v1.model.ListTemplatesRequest;
import com.huaweicloud.sdk.devstar.v1.model.ListTemplatesResponse;
import com.huaweicloud.sdk.devstar.v1.model.ListTemplatesV2Request;
import com.huaweicloud.sdk.devstar.v1.model.ListTemplatesV2Response;
import com.huaweicloud.sdk.devstar.v1.model.RunCodehubTemplateJobRequest;
import com.huaweicloud.sdk.devstar.v1.model.RunCodehubTemplateJobResponse;
import com.huaweicloud.sdk.devstar.v1.model.RunDevstarTemplateJobRequest;
import com.huaweicloud.sdk.devstar.v1.model.RunDevstarTemplateJobResponse;
import com.huaweicloud.sdk.devstar.v1.model.ShowApplicationDependentResourcesRequest;
import com.huaweicloud.sdk.devstar.v1.model.ShowApplicationDependentResourcesResponse;
import com.huaweicloud.sdk.devstar.v1.model.ShowApplicationReleaseRepositoriesRequest;
import com.huaweicloud.sdk.devstar.v1.model.ShowApplicationReleaseRepositoriesResponse;
import com.huaweicloud.sdk.devstar.v1.model.ShowApplicationResDeleteStatusRequest;
import com.huaweicloud.sdk.devstar.v1.model.ShowApplicationResDeleteStatusResponse;
import com.huaweicloud.sdk.devstar.v1.model.ShowApplicationV3Request;
import com.huaweicloud.sdk.devstar.v1.model.ShowApplicationV3Response;
import com.huaweicloud.sdk.devstar.v1.model.ShowDeploymentJobsRequest;
import com.huaweicloud.sdk.devstar.v1.model.ShowDeploymentJobsResponse;
import com.huaweicloud.sdk.devstar.v1.model.ShowJobDetailRequest;
import com.huaweicloud.sdk.devstar.v1.model.ShowJobDetailResponse;
import com.huaweicloud.sdk.devstar.v1.model.ShowPipelineLastStatusV2Request;
import com.huaweicloud.sdk.devstar.v1.model.ShowPipelineLastStatusV2Response;
import com.huaweicloud.sdk.devstar.v1.model.ShowRepositoryByCloudIdeRequest;
import com.huaweicloud.sdk.devstar.v1.model.ShowRepositoryByCloudIdeResponse;
import com.huaweicloud.sdk.devstar.v1.model.ShowRepositoryStatisticalDataV2Request;
import com.huaweicloud.sdk.devstar.v1.model.ShowRepositoryStatisticalDataV2Response;
import com.huaweicloud.sdk.devstar.v1.model.ShowTemplateDetailRequest;
import com.huaweicloud.sdk.devstar.v1.model.ShowTemplateDetailResponse;
import com.huaweicloud.sdk.devstar.v1.model.ShowTemplateFileRequest;
import com.huaweicloud.sdk.devstar.v1.model.ShowTemplateFileResponse;
import com.huaweicloud.sdk.devstar.v1.model.ShowTemplateV3Request;
import com.huaweicloud.sdk.devstar.v1.model.ShowTemplateV3Response;
import com.huaweicloud.sdk.devstar.v1.model.StartPipelineRequest;
import com.huaweicloud.sdk.devstar.v1.model.StartPipelineResponse;
import com.huaweicloud.sdk.devstar.v1.model.UpdateApplicationRequest;
import com.huaweicloud.sdk.devstar.v1.model.UpdateApplicationResponse;

public class DevStarClient {

    protected HcClient hcClient;

    public DevStarClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<DevStarClient> newBuilder() {
        ClientBuilder<DevStarClient> clientBuilder = new ClientBuilder<>(DevStarClient::new, "GlobalCredentials");
        return clientBuilder;
    }

    /**
     * 通过应用Id获取软件发布仓库列表 
     *
     * 通过应用Id获取软件发布仓库列表 
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowApplicationReleaseRepositoriesRequest 请求对象
     * @return ShowApplicationReleaseRepositoriesResponse
     */
    public ShowApplicationReleaseRepositoriesResponse showApplicationReleaseRepositories(
        ShowApplicationReleaseRepositoriesRequest request) {
        return hcClient.syncInvokeHttp(request, DevStarMeta.showApplicationReleaseRepositories);
    }

    /**
     * 通过应用Id获取软件发布仓库列表 
     *
     * 通过应用Id获取软件发布仓库列表 
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowApplicationReleaseRepositoriesRequest 请求对象
     * @return SyncInvoker<ShowApplicationReleaseRepositoriesRequest, ShowApplicationReleaseRepositoriesResponse>
     */
    public SyncInvoker<ShowApplicationReleaseRepositoriesRequest, ShowApplicationReleaseRepositoriesResponse> showApplicationReleaseRepositoriesInvoker(
        ShowApplicationReleaseRepositoriesRequest request) {
        return new SyncInvoker<>(request, DevStarMeta.showApplicationReleaseRepositories, hcClient);
    }

    /**
     * 查询应用关联资源删除状态
     *
     * 根据应用Id查询应用关联的代码仓、流水线删除状态 使用场景：用户删除应用关联的资源（如代码仓、流水线...）后，通过该接口实时查询代码仓、流水线删除状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowApplicationResDeleteStatusRequest 请求对象
     * @return ShowApplicationResDeleteStatusResponse
     */
    public ShowApplicationResDeleteStatusResponse showApplicationResDeleteStatus(
        ShowApplicationResDeleteStatusRequest request) {
        return hcClient.syncInvokeHttp(request, DevStarMeta.showApplicationResDeleteStatus);
    }

    /**
     * 查询应用关联资源删除状态
     *
     * 根据应用Id查询应用关联的代码仓、流水线删除状态 使用场景：用户删除应用关联的资源（如代码仓、流水线...）后，通过该接口实时查询代码仓、流水线删除状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowApplicationResDeleteStatusRequest 请求对象
     * @return SyncInvoker<ShowApplicationResDeleteStatusRequest, ShowApplicationResDeleteStatusResponse>
     */
    public SyncInvoker<ShowApplicationResDeleteStatusRequest, ShowApplicationResDeleteStatusResponse> showApplicationResDeleteStatusInvoker(
        ShowApplicationResDeleteStatusRequest request) {
        return new SyncInvoker<>(request, DevStarMeta.showApplicationResDeleteStatus, hcClient);
    }

    /**
     * 获取应用依赖元数据资源
     *
     * 根据应用Id获取依赖元数据资源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowApplicationDependentResourcesRequest 请求对象
     * @return ShowApplicationDependentResourcesResponse
     */
    public ShowApplicationDependentResourcesResponse showApplicationDependentResources(
        ShowApplicationDependentResourcesRequest request) {
        return hcClient.syncInvokeHttp(request, DevStarMeta.showApplicationDependentResources);
    }

    /**
     * 获取应用依赖元数据资源
     *
     * 根据应用Id获取依赖元数据资源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowApplicationDependentResourcesRequest 请求对象
     * @return SyncInvoker<ShowApplicationDependentResourcesRequest, ShowApplicationDependentResourcesResponse>
     */
    public SyncInvoker<ShowApplicationDependentResourcesRequest, ShowApplicationDependentResourcesResponse> showApplicationDependentResourcesInvoker(
        ShowApplicationDependentResourcesRequest request) {
        return new SyncInvoker<>(request, DevStarMeta.showApplicationDependentResources, hcClient);
    }

    /**
     * 获取应用详情
     *
     * 根据应用Id获取应用详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowApplicationV3Request 请求对象
     * @return ShowApplicationV3Response
     */
    public ShowApplicationV3Response showApplicationV3(ShowApplicationV3Request request) {
        return hcClient.syncInvokeHttp(request, DevStarMeta.showApplicationV3);
    }

    /**
     * 获取应用详情
     *
     * 根据应用Id获取应用详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowApplicationV3Request 请求对象
     * @return SyncInvoker<ShowApplicationV3Request, ShowApplicationV3Response>
     */
    public SyncInvoker<ShowApplicationV3Request, ShowApplicationV3Response> showApplicationV3Invoker(
        ShowApplicationV3Request request) {
        return new SyncInvoker<>(request, DevStarMeta.showApplicationV3, hcClient);
    }

    /**
     * 更新应用信息
     *
     * 根据应用Id更新对应有权限的应用信息
     * - 允许更新信息的信息包含
     * name,description,icon
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateApplicationRequest 请求对象
     * @return UpdateApplicationResponse
     */
    public UpdateApplicationResponse updateApplication(UpdateApplicationRequest request) {
        return hcClient.syncInvokeHttp(request, DevStarMeta.updateApplication);
    }

    /**
     * 更新应用信息
     *
     * 根据应用Id更新对应有权限的应用信息
     * - 允许更新信息的信息包含
     * name,description,icon
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateApplicationRequest 请求对象
     * @return SyncInvoker<UpdateApplicationRequest, UpdateApplicationResponse>
     */
    public SyncInvoker<UpdateApplicationRequest, UpdateApplicationResponse> updateApplicationInvoker(
        UpdateApplicationRequest request) {
        return new SyncInvoker<>(request, DevStarMeta.updateApplication, hcClient);
    }

    /**
     * 删除应用信息
     *
     * 根据应用Id删除应用，并可以选择删除其关联的代码仓、流水线资源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteApplicationV4Request 请求对象
     * @return DeleteApplicationV4Response
     */
    public DeleteApplicationV4Response deleteApplicationV4(DeleteApplicationV4Request request) {
        return hcClient.syncInvokeHttp(request, DevStarMeta.deleteApplicationV4);
    }

    /**
     * 删除应用信息
     *
     * 根据应用Id删除应用，并可以选择删除其关联的代码仓、流水线资源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteApplicationV4Request 请求对象
     * @return SyncInvoker<DeleteApplicationV4Request, DeleteApplicationV4Response>
     */
    public SyncInvoker<DeleteApplicationV4Request, DeleteApplicationV4Response> deleteApplicationV4Invoker(
        DeleteApplicationV4Request request) {
        return new SyncInvoker<>(request, DevStarMeta.deleteApplicationV4, hcClient);
    }

    /**
     * 获取应用列表
     *
     * 获取我创建的应用列表
     * 当前只支持查询我创建的应用，其中请求参数is_created_by_self需为true
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApplicationsV6Request 请求对象
     * @return ListApplicationsV6Response
     */
    public ListApplicationsV6Response listApplicationsV6(ListApplicationsV6Request request) {
        return hcClient.syncInvokeHttp(request, DevStarMeta.listApplicationsV6);
    }

    /**
     * 获取应用列表
     *
     * 获取我创建的应用列表
     * 当前只支持查询我创建的应用，其中请求参数is_created_by_self需为true
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApplicationsV6Request 请求对象
     * @return SyncInvoker<ListApplicationsV6Request, ListApplicationsV6Response>
     */
    public SyncInvoker<ListApplicationsV6Request, ListApplicationsV6Response> listApplicationsV6Invoker(
        ListApplicationsV6Request request) {
        return new SyncInvoker<>(request, DevStarMeta.listApplicationsV6, hcClient);
    }

    /**
     * 下载模板产物
     *
     * 下载模板产物。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadApplicationCodeRequest 请求对象
     * @return DownloadApplicationCodeResponse
     */
    public DownloadApplicationCodeResponse downloadApplicationCode(DownloadApplicationCodeRequest request) {
        return hcClient.syncInvokeHttp(request, DevStarMeta.downloadApplicationCode);
    }

    /**
     * 下载模板产物
     *
     * 下载模板产物。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadApplicationCodeRequest 请求对象
     * @return SyncInvoker<DownloadApplicationCodeRequest, DownloadApplicationCodeResponse>
     */
    public SyncInvoker<DownloadApplicationCodeRequest, DownloadApplicationCodeResponse> downloadApplicationCodeInvoker(
        DownloadApplicationCodeRequest request) {
        return new SyncInvoker<>(request, DevStarMeta.downloadApplicationCode, hcClient);
    }

    /**
     * 部署任务执行变更人工审核
     *
     * 部署任务执行变更人工审核，终止或者继续部署任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ConfirmDeploymentJobRequest 请求对象
     * @return ConfirmDeploymentJobResponse
     */
    public ConfirmDeploymentJobResponse confirmDeploymentJob(ConfirmDeploymentJobRequest request) {
        return hcClient.syncInvokeHttp(request, DevStarMeta.confirmDeploymentJob);
    }

    /**
     * 部署任务执行变更人工审核
     *
     * 部署任务执行变更人工审核，终止或者继续部署任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ConfirmDeploymentJobRequest 请求对象
     * @return SyncInvoker<ConfirmDeploymentJobRequest, ConfirmDeploymentJobResponse>
     */
    public SyncInvoker<ConfirmDeploymentJobRequest, ConfirmDeploymentJobResponse> confirmDeploymentJobInvoker(
        ConfirmDeploymentJobRequest request) {
        return new SyncInvoker<>(request, DevStarMeta.confirmDeploymentJob, hcClient);
    }

    /**
     * 创建部署任务
     *
     * 创建部署任务，并触发任务执行，当前只支持函数部署。
     * 其中，报文中file_id为查询软件版本包接口返回版本包id;
     * handler为在函数部署方式下，入口函数名称，从应用代码中获取，格式为“包名.类名.函数名称”，例如：com.example.demo.APIGTrigger.handler。
     * 也可以从应用详情接口返回结构template_deployment中直接获取。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDeploymentJobsRequest 请求对象
     * @return CreateDeploymentJobsResponse
     */
    public CreateDeploymentJobsResponse createDeploymentJobs(CreateDeploymentJobsRequest request) {
        return hcClient.syncInvokeHttp(request, DevStarMeta.createDeploymentJobs);
    }

    /**
     * 创建部署任务
     *
     * 创建部署任务，并触发任务执行，当前只支持函数部署。
     * 其中，报文中file_id为查询软件版本包接口返回版本包id;
     * handler为在函数部署方式下，入口函数名称，从应用代码中获取，格式为“包名.类名.函数名称”，例如：com.example.demo.APIGTrigger.handler。
     * 也可以从应用详情接口返回结构template_deployment中直接获取。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDeploymentJobsRequest 请求对象
     * @return SyncInvoker<CreateDeploymentJobsRequest, CreateDeploymentJobsResponse>
     */
    public SyncInvoker<CreateDeploymentJobsRequest, CreateDeploymentJobsResponse> createDeploymentJobsInvoker(
        CreateDeploymentJobsRequest request) {
        return new SyncInvoker<>(request, DevStarMeta.createDeploymentJobs, hcClient);
    }

    /**
     * 查询应用环境部署任务详情
     *
     * 查询应用环境部署任务详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDeploymentJobsRequest 请求对象
     * @return ShowDeploymentJobsResponse
     */
    public ShowDeploymentJobsResponse showDeploymentJobs(ShowDeploymentJobsRequest request) {
        return hcClient.syncInvokeHttp(request, DevStarMeta.showDeploymentJobs);
    }

    /**
     * 查询应用环境部署任务详情
     *
     * 查询应用环境部署任务详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDeploymentJobsRequest 请求对象
     * @return SyncInvoker<ShowDeploymentJobsRequest, ShowDeploymentJobsResponse>
     */
    public SyncInvoker<ShowDeploymentJobsRequest, ShowDeploymentJobsResponse> showDeploymentJobsInvoker(
        ShowDeploymentJobsRequest request) {
        return new SyncInvoker<>(request, DevStarMeta.showDeploymentJobs, hcClient);
    }

    /**
     * CodeHub 模板生成代码
     *
     * 使用CodeHub模板创建应用代码。
     * 
     * 通过 Codehub 模板创建生成应用代码的任务，并将应用代码存储于指定的 CodeHub 仓库中或者生成代码压缩包，可以通过返回的任务 ID 查询相关任务状态。
     * 
     * - 接口鉴权方式
     * 通过华为云服务获取的用户token。
     * 
     * - 代码生成位置
     * 应用代码生成后的地址，目前支持codehub地址和压缩包下载地址。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RunCodehubTemplateJobRequest 请求对象
     * @return RunCodehubTemplateJobResponse
     */
    public RunCodehubTemplateJobResponse runCodehubTemplateJob(RunCodehubTemplateJobRequest request) {
        return hcClient.syncInvokeHttp(request, DevStarMeta.runCodehubTemplateJob);
    }

    /**
     * CodeHub 模板生成代码
     *
     * 使用CodeHub模板创建应用代码。
     * 
     * 通过 Codehub 模板创建生成应用代码的任务，并将应用代码存储于指定的 CodeHub 仓库中或者生成代码压缩包，可以通过返回的任务 ID 查询相关任务状态。
     * 
     * - 接口鉴权方式
     * 通过华为云服务获取的用户token。
     * 
     * - 代码生成位置
     * 应用代码生成后的地址，目前支持codehub地址和压缩包下载地址。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RunCodehubTemplateJobRequest 请求对象
     * @return SyncInvoker<RunCodehubTemplateJobRequest, RunCodehubTemplateJobResponse>
     */
    public SyncInvoker<RunCodehubTemplateJobRequest, RunCodehubTemplateJobResponse> runCodehubTemplateJobInvoker(
        RunCodehubTemplateJobRequest request) {
        return new SyncInvoker<>(request, DevStarMeta.runCodehubTemplateJob, hcClient);
    }

    /**
     * Devstar 模板生成代码
     *
     * 使用DevStar的模板创建应用代码。
     * 
     * 通过 DevStar 模板创建生成应用代码的任务，并将应用代码存储于指定的 CodeHub 仓库中，可以通过返回的任务 ID 查询相关任务状态。
     * 
     * - 接口鉴权方式
     * 通过华为云服务获取的用户token。
     * 
     * - 代码生成位置
     * 应用代码生成后的地址，目前支持codehub地址和压缩包下载地址。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RunDevstarTemplateJobRequest 请求对象
     * @return RunDevstarTemplateJobResponse
     */
    public RunDevstarTemplateJobResponse runDevstarTemplateJob(RunDevstarTemplateJobRequest request) {
        return hcClient.syncInvokeHttp(request, DevStarMeta.runDevstarTemplateJob);
    }

    /**
     * Devstar 模板生成代码
     *
     * 使用DevStar的模板创建应用代码。
     * 
     * 通过 DevStar 模板创建生成应用代码的任务，并将应用代码存储于指定的 CodeHub 仓库中，可以通过返回的任务 ID 查询相关任务状态。
     * 
     * - 接口鉴权方式
     * 通过华为云服务获取的用户token。
     * 
     * - 代码生成位置
     * 应用代码生成后的地址，目前支持codehub地址和压缩包下载地址。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RunDevstarTemplateJobRequest 请求对象
     * @return SyncInvoker<RunDevstarTemplateJobRequest, RunDevstarTemplateJobResponse>
     */
    public SyncInvoker<RunDevstarTemplateJobRequest, RunDevstarTemplateJobResponse> runDevstarTemplateJobInvoker(
        RunDevstarTemplateJobRequest request) {
        return new SyncInvoker<>(request, DevStarMeta.runDevstarTemplateJob, hcClient);
    }

    /**
     * 查询任务详情
     *
     * 查询任务的详情。
     * 
     * 通过任务ID可以查看任务的状态
     * 当任务结束时返回应用代码存放的位置。
     * 
     * - 接口鉴权方式
     * 通过华为云服务获取的用户token。
     * 
     * - 代码生成位置
     * 应用代码生成后的地址，目前支持codehub地址和压缩包下载地址。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowJobDetailRequest 请求对象
     * @return ShowJobDetailResponse
     */
    public ShowJobDetailResponse showJobDetail(ShowJobDetailRequest request) {
        return hcClient.syncInvokeHttp(request, DevStarMeta.showJobDetail);
    }

    /**
     * 查询任务详情
     *
     * 查询任务的详情。
     * 
     * 通过任务ID可以查看任务的状态
     * 当任务结束时返回应用代码存放的位置。
     * 
     * - 接口鉴权方式
     * 通过华为云服务获取的用户token。
     * 
     * - 代码生成位置
     * 应用代码生成后的地址，目前支持codehub地址和压缩包下载地址。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowJobDetailRequest 请求对象
     * @return SyncInvoker<ShowJobDetailRequest, ShowJobDetailResponse>
     */
    public SyncInvoker<ShowJobDetailRequest, ShowJobDetailResponse> showJobDetailInvoker(ShowJobDetailRequest request) {
        return new SyncInvoker<>(request, DevStarMeta.showJobDetail, hcClient);
    }

    /**
     * 流水线模板列表查询
     *
     * 流水线模板列表查询
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPipelineTemplatesRequest 请求对象
     * @return ListPipelineTemplatesResponse
     */
    public ListPipelineTemplatesResponse listPipelineTemplates(ListPipelineTemplatesRequest request) {
        return hcClient.syncInvokeHttp(request, DevStarMeta.listPipelineTemplates);
    }

    /**
     * 流水线模板列表查询
     *
     * 流水线模板列表查询
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPipelineTemplatesRequest 请求对象
     * @return SyncInvoker<ListPipelineTemplatesRequest, ListPipelineTemplatesResponse>
     */
    public SyncInvoker<ListPipelineTemplatesRequest, ListPipelineTemplatesResponse> listPipelineTemplatesInvoker(
        ListPipelineTemplatesRequest request) {
        return new SyncInvoker<>(request, DevStarMeta.listPipelineTemplates, hcClient);
    }

    /**
     * 查询流水线最近一次运行状态查询接口
     *
     * 查询应用流水线最近一次运行状态查询接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPipelineLastStatusV2Request 请求对象
     * @return ShowPipelineLastStatusV2Response
     */
    public ShowPipelineLastStatusV2Response showPipelineLastStatusV2(ShowPipelineLastStatusV2Request request) {
        return hcClient.syncInvokeHttp(request, DevStarMeta.showPipelineLastStatusV2);
    }

    /**
     * 查询流水线最近一次运行状态查询接口
     *
     * 查询应用流水线最近一次运行状态查询接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPipelineLastStatusV2Request 请求对象
     * @return SyncInvoker<ShowPipelineLastStatusV2Request, ShowPipelineLastStatusV2Response>
     */
    public SyncInvoker<ShowPipelineLastStatusV2Request, ShowPipelineLastStatusV2Response> showPipelineLastStatusV2Invoker(
        ShowPipelineLastStatusV2Request request) {
        return new SyncInvoker<>(request, DevStarMeta.showPipelineLastStatusV2, hcClient);
    }

    /**
     * 根据流水线Id操作流水线启动
     *
     * 根据流水线Id操作流水线启动
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartPipelineRequest 请求对象
     * @return StartPipelineResponse
     */
    public StartPipelineResponse startPipeline(StartPipelineRequest request) {
        return hcClient.syncInvokeHttp(request, DevStarMeta.startPipeline);
    }

    /**
     * 根据流水线Id操作流水线启动
     *
     * 根据流水线Id操作流水线启动
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartPipelineRequest 请求对象
     * @return SyncInvoker<StartPipelineRequest, StartPipelineResponse>
     */
    public SyncInvoker<StartPipelineRequest, StartPipelineResponse> startPipelineInvoker(StartPipelineRequest request) {
        return new SyncInvoker<>(request, DevStarMeta.startPipeline, hcClient);
    }

    /**
     * 获取用户有权限的DevStar存量DevCloud项目列表
     *
     * 获取用户有权限的DevStar存量DevCloud项目列表。
     * 来源包括：1.DevStar创建的DevCloud项目；2.DevStar应用有关联DevCloud项目。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectsV4Request 请求对象
     * @return ListProjectsV4Response
     */
    public ListProjectsV4Response listProjectsV4(ListProjectsV4Request request) {
        return hcClient.syncInvokeHttp(request, DevStarMeta.listProjectsV4);
    }

    /**
     * 获取用户有权限的DevStar存量DevCloud项目列表
     *
     * 获取用户有权限的DevStar存量DevCloud项目列表。
     * 来源包括：1.DevStar创建的DevCloud项目；2.DevStar应用有关联DevCloud项目。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectsV4Request 请求对象
     * @return SyncInvoker<ListProjectsV4Request, ListProjectsV4Response>
     */
    public SyncInvoker<ListProjectsV4Request, ListProjectsV4Response> listProjectsV4Invoker(
        ListProjectsV4Request request) {
        return new SyncInvoker<>(request, DevStarMeta.listProjectsV4, hcClient);
    }

    /**
     * 检查仓库名称是否重名
     *
     * 检查仓库名称是否重名
     * - 校验规则
     *     同一个项目下的仓库名称不能存在重复,当结果为true时,校验通过,仓库名称可用,否则,校验不通过,当前项目下的仓库名称已存在,不可用
     * - 必传参数
     *     project_id,name,region_id
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckRepositoryDuplicateNameRequest 请求对象
     * @return CheckRepositoryDuplicateNameResponse
     */
    public CheckRepositoryDuplicateNameResponse checkRepositoryDuplicateName(
        CheckRepositoryDuplicateNameRequest request) {
        return hcClient.syncInvokeHttp(request, DevStarMeta.checkRepositoryDuplicateName);
    }

    /**
     * 检查仓库名称是否重名
     *
     * 检查仓库名称是否重名
     * - 校验规则
     *     同一个项目下的仓库名称不能存在重复,当结果为true时,校验通过,仓库名称可用,否则,校验不通过,当前项目下的仓库名称已存在,不可用
     * - 必传参数
     *     project_id,name,region_id
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckRepositoryDuplicateNameRequest 请求对象
     * @return SyncInvoker<CheckRepositoryDuplicateNameRequest, CheckRepositoryDuplicateNameResponse>
     */
    public SyncInvoker<CheckRepositoryDuplicateNameRequest, CheckRepositoryDuplicateNameResponse> checkRepositoryDuplicateNameInvoker(
        CheckRepositoryDuplicateNameRequest request) {
        return new SyncInvoker<>(request, DevStarMeta.checkRepositoryDuplicateName, hcClient);
    }

    /**
     * 使用 CloudIDE 实例打开应用代码
     *
     * 使用 CloudIDE 实例打开应用代码。CloudIDE会保存用户项目数据，相同用户使用同一个CloudIDE，使用要求：
     * - 用户需为登录状态。
     * - 拥有仓库权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRepositoryByCloudIdeRequest 请求对象
     * @return ShowRepositoryByCloudIdeResponse
     */
    public ShowRepositoryByCloudIdeResponse showRepositoryByCloudIde(ShowRepositoryByCloudIdeRequest request) {
        return hcClient.syncInvokeHttp(request, DevStarMeta.showRepositoryByCloudIde);
    }

    /**
     * 使用 CloudIDE 实例打开应用代码
     *
     * 使用 CloudIDE 实例打开应用代码。CloudIDE会保存用户项目数据，相同用户使用同一个CloudIDE，使用要求：
     * - 用户需为登录状态。
     * - 拥有仓库权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRepositoryByCloudIdeRequest 请求对象
     * @return SyncInvoker<ShowRepositoryByCloudIdeRequest, ShowRepositoryByCloudIdeResponse>
     */
    public SyncInvoker<ShowRepositoryByCloudIdeRequest, ShowRepositoryByCloudIdeResponse> showRepositoryByCloudIdeInvoker(
        ShowRepositoryByCloudIdeRequest request) {
        return new SyncInvoker<>(request, DevStarMeta.showRepositoryByCloudIde, hcClient);
    }

    /**
     * 应用代码仓库统计信息
     *
     * 查询代码仓库的统计信息,包括代码仓的名称,代码行数等信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRepositoryStatisticalDataV2Request 请求对象
     * @return ShowRepositoryStatisticalDataV2Response
     */
    public ShowRepositoryStatisticalDataV2Response showRepositoryStatisticalDataV2(
        ShowRepositoryStatisticalDataV2Request request) {
        return hcClient.syncInvokeHttp(request, DevStarMeta.showRepositoryStatisticalDataV2);
    }

    /**
     * 应用代码仓库统计信息
     *
     * 查询代码仓库的统计信息,包括代码仓的名称,代码行数等信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRepositoryStatisticalDataV2Request 请求对象
     * @return SyncInvoker<ShowRepositoryStatisticalDataV2Request, ShowRepositoryStatisticalDataV2Response>
     */
    public SyncInvoker<ShowRepositoryStatisticalDataV2Request, ShowRepositoryStatisticalDataV2Response> showRepositoryStatisticalDataV2Invoker(
        ShowRepositoryStatisticalDataV2Request request) {
        return new SyncInvoker<>(request, DevStarMeta.showRepositoryStatisticalDataV2, hcClient);
    }

    /**
     * 读取模板文件
     *
     * 该接口可以用于模板作者或模板维护人读取模板文件内容。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTemplateFileRequest 请求对象
     * @return ShowTemplateFileResponse
     */
    public ShowTemplateFileResponse showTemplateFile(ShowTemplateFileRequest request) {
        return hcClient.syncInvokeHttp(request, DevStarMeta.showTemplateFile);
    }

    /**
     * 读取模板文件
     *
     * 该接口可以用于模板作者或模板维护人读取模板文件内容。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTemplateFileRequest 请求对象
     * @return SyncInvoker<ShowTemplateFileRequest, ShowTemplateFileResponse>
     */
    public SyncInvoker<ShowTemplateFileRequest, ShowTemplateFileResponse> showTemplateFileInvoker(
        ShowTemplateFileRequest request) {
        return new SyncInvoker<>(request, DevStarMeta.showTemplateFile, hcClient);
    }

    /**
     * 同步模板浏览记录
     *
     * 未登录状态下，将用户浏览过的模板缓存在浏览器中，登录时，调用该接口同步模板浏览记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTemplateViewHistoriesRequest 请求对象
     * @return CreateTemplateViewHistoriesResponse
     */
    public CreateTemplateViewHistoriesResponse createTemplateViewHistories(CreateTemplateViewHistoriesRequest request) {
        return hcClient.syncInvokeHttp(request, DevStarMeta.createTemplateViewHistories);
    }

    /**
     * 同步模板浏览记录
     *
     * 未登录状态下，将用户浏览过的模板缓存在浏览器中，登录时，调用该接口同步模板浏览记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTemplateViewHistoriesRequest 请求对象
     * @return SyncInvoker<CreateTemplateViewHistoriesRequest, CreateTemplateViewHistoriesResponse>
     */
    public SyncInvoker<CreateTemplateViewHistoriesRequest, CreateTemplateViewHistoriesResponse> createTemplateViewHistoriesInvoker(
        CreateTemplateViewHistoriesRequest request) {
        return new SyncInvoker<>(request, DevStarMeta.createTemplateViewHistories, hcClient);
    }

    /**
     * 查询模板列表（V1）
     *
     * 查询模板列表，推荐使用/v1/templates/query接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPublishedTemplatesRequest 请求对象
     * @return ListPublishedTemplatesResponse
     */
    @Deprecated
    public ListPublishedTemplatesResponse listPublishedTemplates(ListPublishedTemplatesRequest request) {
        return hcClient.syncInvokeHttp(request, DevStarMeta.listPublishedTemplates);
    }

    /**
     * 查询模板列表（V1）
     *
     * 查询模板列表，推荐使用/v1/templates/query接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPublishedTemplatesRequest 请求对象
     * @return SyncInvoker<ListPublishedTemplatesRequest, ListPublishedTemplatesResponse>
     */
    @Deprecated
    public SyncInvoker<ListPublishedTemplatesRequest, ListPublishedTemplatesResponse> listPublishedTemplatesInvoker(
        ListPublishedTemplatesRequest request) {
        return new SyncInvoker<>(request, DevStarMeta.listPublishedTemplates, hcClient);
    }

    /**
     * 我浏览的模板记录
     *
     * 查询DevStar或者CodeLabs登录用户浏览过的模板（只返回最近浏览的5个模板）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTemplateViewHistoriesRequest 请求对象
     * @return ListTemplateViewHistoriesResponse
     */
    public ListTemplateViewHistoriesResponse listTemplateViewHistories(ListTemplateViewHistoriesRequest request) {
        return hcClient.syncInvokeHttp(request, DevStarMeta.listTemplateViewHistories);
    }

    /**
     * 我浏览的模板记录
     *
     * 查询DevStar或者CodeLabs登录用户浏览过的模板（只返回最近浏览的5个模板）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTemplateViewHistoriesRequest 请求对象
     * @return SyncInvoker<ListTemplateViewHistoriesRequest, ListTemplateViewHistoriesResponse>
     */
    public SyncInvoker<ListTemplateViewHistoriesRequest, ListTemplateViewHistoriesResponse> listTemplateViewHistoriesInvoker(
        ListTemplateViewHistoriesRequest request) {
        return new SyncInvoker<>(request, DevStarMeta.listTemplateViewHistories, hcClient);
    }

    /**
     * 查询模板列表
     *
     * 查询模板列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTemplatesRequest 请求对象
     * @return ListTemplatesResponse
     */
    public ListTemplatesResponse listTemplates(ListTemplatesRequest request) {
        return hcClient.syncInvokeHttp(request, DevStarMeta.listTemplates);
    }

    /**
     * 查询模板列表
     *
     * 查询模板列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTemplatesRequest 请求对象
     * @return SyncInvoker<ListTemplatesRequest, ListTemplatesResponse>
     */
    public SyncInvoker<ListTemplatesRequest, ListTemplatesResponse> listTemplatesInvoker(ListTemplatesRequest request) {
        return new SyncInvoker<>(request, DevStarMeta.listTemplates, hcClient);
    }

    /**
     * 查询模板列表（V2）
     *
     * 查询模板列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTemplatesV2Request 请求对象
     * @return ListTemplatesV2Response
     */
    @Deprecated
    public ListTemplatesV2Response listTemplatesV2(ListTemplatesV2Request request) {
        return hcClient.syncInvokeHttp(request, DevStarMeta.listTemplatesV2);
    }

    /**
     * 查询模板列表（V2）
     *
     * 查询模板列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTemplatesV2Request 请求对象
     * @return SyncInvoker<ListTemplatesV2Request, ListTemplatesV2Response>
     */
    @Deprecated
    public SyncInvoker<ListTemplatesV2Request, ListTemplatesV2Response> listTemplatesV2Invoker(
        ListTemplatesV2Request request) {
        return new SyncInvoker<>(request, DevStarMeta.listTemplatesV2, hcClient);
    }

    /**
     * 查询模板详情（V3）
     *
     * 获取指定模板详情，包括模板id、名称、描述、作者、标签、上架时间等信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTemplateV3Request 请求对象
     * @return ShowTemplateV3Response
     */
    public ShowTemplateV3Response showTemplateV3(ShowTemplateV3Request request) {
        return hcClient.syncInvokeHttp(request, DevStarMeta.showTemplateV3);
    }

    /**
     * 查询模板详情（V3）
     *
     * 获取指定模板详情，包括模板id、名称、描述、作者、标签、上架时间等信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTemplateV3Request 请求对象
     * @return SyncInvoker<ShowTemplateV3Request, ShowTemplateV3Response>
     */
    public SyncInvoker<ShowTemplateV3Request, ShowTemplateV3Response> showTemplateV3Invoker(
        ShowTemplateV3Request request) {
        return new SyncInvoker<>(request, DevStarMeta.showTemplateV3, hcClient);
    }

    /**
     * 查询模板详情（V1）
     *
     * 查询模板详情，推荐使用V3版本接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTemplateDetailRequest 请求对象
     * @return ShowTemplateDetailResponse
     */
    public ShowTemplateDetailResponse showTemplateDetail(ShowTemplateDetailRequest request) {
        return hcClient.syncInvokeHttp(request, DevStarMeta.showTemplateDetail);
    }

    /**
     * 查询模板详情（V1）
     *
     * 查询模板详情，推荐使用V3版本接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTemplateDetailRequest 请求对象
     * @return SyncInvoker<ShowTemplateDetailRequest, ShowTemplateDetailResponse>
     */
    public SyncInvoker<ShowTemplateDetailRequest, ShowTemplateDetailResponse> showTemplateDetailInvoker(
        ShowTemplateDetailRequest request) {
        return new SyncInvoker<>(request, DevStarMeta.showTemplateDetail, hcClient);
    }

}
