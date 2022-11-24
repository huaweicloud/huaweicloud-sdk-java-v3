package com.huaweicloud.sdk.devstar.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.devstar.v1.model.*;

import java.util.concurrent.CompletableFuture;

public class DevStarAsyncClient {

    protected HcClient hcClient;

    public DevStarAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<DevStarAsyncClient> newBuilder() {
        return new ClientBuilder<>(DevStarAsyncClient::new, "GlobalCredentials");
    }

    /**
     * 通过应用Id获取软件发布仓库列表 
     *
     * 通过应用Id获取软件发布仓库列表 
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowApplicationReleaseRepositoriesRequest 请求对象
     * @return CompletableFuture<ShowApplicationReleaseRepositoriesResponse>
     */
    public CompletableFuture<ShowApplicationReleaseRepositoriesResponse> showApplicationReleaseRepositoriesAsync(
        ShowApplicationReleaseRepositoriesRequest request) {
        return hcClient.asyncInvokeHttp(request, DevStarMeta.showApplicationReleaseRepositories);
    }

    /**
     * 通过应用Id获取软件发布仓库列表 
     *
     * 通过应用Id获取软件发布仓库列表 
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowApplicationReleaseRepositoriesRequest 请求对象
     * @return AsyncInvoker<ShowApplicationReleaseRepositoriesRequest, ShowApplicationReleaseRepositoriesResponse>
     */
    public AsyncInvoker<ShowApplicationReleaseRepositoriesRequest, ShowApplicationReleaseRepositoriesResponse> showApplicationReleaseRepositoriesAsyncInvoker(
        ShowApplicationReleaseRepositoriesRequest request) {
        return new AsyncInvoker<ShowApplicationReleaseRepositoriesRequest, ShowApplicationReleaseRepositoriesResponse>(
            request, DevStarMeta.showApplicationReleaseRepositories, hcClient);
    }

    /**
     * 查询应用关联资源删除状态
     *
     * 根据应用Id查询应用关联的代码仓、流水线删除状态 使用场景：用户删除应用关联的资源（如代码仓、流水线...）后，通过该接口实时查询代码仓、流水线删除状态
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowApplicationResDeleteStatusRequest 请求对象
     * @return CompletableFuture<ShowApplicationResDeleteStatusResponse>
     */
    public CompletableFuture<ShowApplicationResDeleteStatusResponse> showApplicationResDeleteStatusAsync(
        ShowApplicationResDeleteStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, DevStarMeta.showApplicationResDeleteStatus);
    }

    /**
     * 查询应用关联资源删除状态
     *
     * 根据应用Id查询应用关联的代码仓、流水线删除状态 使用场景：用户删除应用关联的资源（如代码仓、流水线...）后，通过该接口实时查询代码仓、流水线删除状态
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowApplicationResDeleteStatusRequest 请求对象
     * @return AsyncInvoker<ShowApplicationResDeleteStatusRequest, ShowApplicationResDeleteStatusResponse>
     */
    public AsyncInvoker<ShowApplicationResDeleteStatusRequest, ShowApplicationResDeleteStatusResponse> showApplicationResDeleteStatusAsyncInvoker(
        ShowApplicationResDeleteStatusRequest request) {
        return new AsyncInvoker<ShowApplicationResDeleteStatusRequest, ShowApplicationResDeleteStatusResponse>(request,
            DevStarMeta.showApplicationResDeleteStatus, hcClient);
    }

    /**
     * 获取应用依赖元数据资源
     *
     * 根据应用Id获取依赖元数据资源
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowApplicationDependentResourcesRequest 请求对象
     * @return CompletableFuture<ShowApplicationDependentResourcesResponse>
     */
    public CompletableFuture<ShowApplicationDependentResourcesResponse> showApplicationDependentResourcesAsync(
        ShowApplicationDependentResourcesRequest request) {
        return hcClient.asyncInvokeHttp(request, DevStarMeta.showApplicationDependentResources);
    }

    /**
     * 获取应用依赖元数据资源
     *
     * 根据应用Id获取依赖元数据资源
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowApplicationDependentResourcesRequest 请求对象
     * @return AsyncInvoker<ShowApplicationDependentResourcesRequest, ShowApplicationDependentResourcesResponse>
     */
    public AsyncInvoker<ShowApplicationDependentResourcesRequest, ShowApplicationDependentResourcesResponse> showApplicationDependentResourcesAsyncInvoker(
        ShowApplicationDependentResourcesRequest request) {
        return new AsyncInvoker<ShowApplicationDependentResourcesRequest, ShowApplicationDependentResourcesResponse>(
            request, DevStarMeta.showApplicationDependentResources, hcClient);
    }

    /**
     * 获取应用详情
     *
     * 根据应用Id获取应用详情
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowApplicationV3Request 请求对象
     * @return CompletableFuture<ShowApplicationV3Response>
     */
    public CompletableFuture<ShowApplicationV3Response> showApplicationV3Async(ShowApplicationV3Request request) {
        return hcClient.asyncInvokeHttp(request, DevStarMeta.showApplicationV3);
    }

    /**
     * 获取应用详情
     *
     * 根据应用Id获取应用详情
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowApplicationV3Request 请求对象
     * @return AsyncInvoker<ShowApplicationV3Request, ShowApplicationV3Response>
     */
    public AsyncInvoker<ShowApplicationV3Request, ShowApplicationV3Response> showApplicationV3AsyncInvoker(
        ShowApplicationV3Request request) {
        return new AsyncInvoker<ShowApplicationV3Request, ShowApplicationV3Response>(request,
            DevStarMeta.showApplicationV3, hcClient);
    }

    /**
     * 更新应用信息
     *
     * 根据应用Id更新对应有权限的应用信息
     * - 允许更新信息的信息包含
     * name,description,icon
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateApplicationRequest 请求对象
     * @return CompletableFuture<UpdateApplicationResponse>
     */
    public CompletableFuture<UpdateApplicationResponse> updateApplicationAsync(UpdateApplicationRequest request) {
        return hcClient.asyncInvokeHttp(request, DevStarMeta.updateApplication);
    }

    /**
     * 更新应用信息
     *
     * 根据应用Id更新对应有权限的应用信息
     * - 允许更新信息的信息包含
     * name,description,icon
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateApplicationRequest 请求对象
     * @return AsyncInvoker<UpdateApplicationRequest, UpdateApplicationResponse>
     */
    public AsyncInvoker<UpdateApplicationRequest, UpdateApplicationResponse> updateApplicationAsyncInvoker(
        UpdateApplicationRequest request) {
        return new AsyncInvoker<UpdateApplicationRequest, UpdateApplicationResponse>(request,
            DevStarMeta.updateApplication, hcClient);
    }

    /**
     * 删除应用信息
     *
     * 根据应用Id删除应用，并可以选择删除其关联的代码仓、流水线资源
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteApplicationV4Request 请求对象
     * @return CompletableFuture<DeleteApplicationV4Response>
     */
    public CompletableFuture<DeleteApplicationV4Response> deleteApplicationV4Async(DeleteApplicationV4Request request) {
        return hcClient.asyncInvokeHttp(request, DevStarMeta.deleteApplicationV4);
    }

    /**
     * 删除应用信息
     *
     * 根据应用Id删除应用，并可以选择删除其关联的代码仓、流水线资源
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteApplicationV4Request 请求对象
     * @return AsyncInvoker<DeleteApplicationV4Request, DeleteApplicationV4Response>
     */
    public AsyncInvoker<DeleteApplicationV4Request, DeleteApplicationV4Response> deleteApplicationV4AsyncInvoker(
        DeleteApplicationV4Request request) {
        return new AsyncInvoker<DeleteApplicationV4Request, DeleteApplicationV4Response>(request,
            DevStarMeta.deleteApplicationV4, hcClient);
    }

    /**
     * 获取应用列表
     *
     * 获取我创建的应用列表
     * 当前只支持查询我创建的应用，其中请求参数is_created_by_self需为true
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListApplicationsV6Request 请求对象
     * @return CompletableFuture<ListApplicationsV6Response>
     */
    public CompletableFuture<ListApplicationsV6Response> listApplicationsV6Async(ListApplicationsV6Request request) {
        return hcClient.asyncInvokeHttp(request, DevStarMeta.listApplicationsV6);
    }

    /**
     * 获取应用列表
     *
     * 获取我创建的应用列表
     * 当前只支持查询我创建的应用，其中请求参数is_created_by_self需为true
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListApplicationsV6Request 请求对象
     * @return AsyncInvoker<ListApplicationsV6Request, ListApplicationsV6Response>
     */
    public AsyncInvoker<ListApplicationsV6Request, ListApplicationsV6Response> listApplicationsV6AsyncInvoker(
        ListApplicationsV6Request request) {
        return new AsyncInvoker<ListApplicationsV6Request, ListApplicationsV6Response>(request,
            DevStarMeta.listApplicationsV6, hcClient);
    }

    /**
     * 下载模板产物
     *
     * 下载模板产物。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DownloadApplicationCodeRequest 请求对象
     * @return CompletableFuture<DownloadApplicationCodeResponse>
     */
    public CompletableFuture<DownloadApplicationCodeResponse> downloadApplicationCodeAsync(
        DownloadApplicationCodeRequest request) {
        return hcClient.asyncInvokeHttp(request, DevStarMeta.downloadApplicationCode);
    }

    /**
     * 下载模板产物
     *
     * 下载模板产物。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DownloadApplicationCodeRequest 请求对象
     * @return AsyncInvoker<DownloadApplicationCodeRequest, DownloadApplicationCodeResponse>
     */
    public AsyncInvoker<DownloadApplicationCodeRequest, DownloadApplicationCodeResponse> downloadApplicationCodeAsyncInvoker(
        DownloadApplicationCodeRequest request) {
        return new AsyncInvoker<DownloadApplicationCodeRequest, DownloadApplicationCodeResponse>(request,
            DevStarMeta.downloadApplicationCode, hcClient);
    }

    /**
     * 部署任务执行变更人工审核
     *
     * 部署任务执行变更人工审核，终止或者继续部署任务
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ConfirmDeploymentJobRequest 请求对象
     * @return CompletableFuture<ConfirmDeploymentJobResponse>
     */
    public CompletableFuture<ConfirmDeploymentJobResponse> confirmDeploymentJobAsync(
        ConfirmDeploymentJobRequest request) {
        return hcClient.asyncInvokeHttp(request, DevStarMeta.confirmDeploymentJob);
    }

    /**
     * 部署任务执行变更人工审核
     *
     * 部署任务执行变更人工审核，终止或者继续部署任务
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ConfirmDeploymentJobRequest 请求对象
     * @return AsyncInvoker<ConfirmDeploymentJobRequest, ConfirmDeploymentJobResponse>
     */
    public AsyncInvoker<ConfirmDeploymentJobRequest, ConfirmDeploymentJobResponse> confirmDeploymentJobAsyncInvoker(
        ConfirmDeploymentJobRequest request) {
        return new AsyncInvoker<ConfirmDeploymentJobRequest, ConfirmDeploymentJobResponse>(request,
            DevStarMeta.confirmDeploymentJob, hcClient);
    }

    /**
     * 创建部署任务
     *
     * 创建部署任务，并触发任务执行，当前只支持函数部署。
     * 其中，报文中file_id为查询软件版本包接口返回版本包id;
     * handler为在函数部署方式下，入口函数名称，从应用代码中获取，格式为“包名.类名.函数名称”，例如：com.example.demo.APIGTrigger.handler。
     * 也可以从应用详情接口返回结构template_deployment中直接获取。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateDeploymentJobsRequest 请求对象
     * @return CompletableFuture<CreateDeploymentJobsResponse>
     */
    public CompletableFuture<CreateDeploymentJobsResponse> createDeploymentJobsAsync(
        CreateDeploymentJobsRequest request) {
        return hcClient.asyncInvokeHttp(request, DevStarMeta.createDeploymentJobs);
    }

    /**
     * 创建部署任务
     *
     * 创建部署任务，并触发任务执行，当前只支持函数部署。
     * 其中，报文中file_id为查询软件版本包接口返回版本包id;
     * handler为在函数部署方式下，入口函数名称，从应用代码中获取，格式为“包名.类名.函数名称”，例如：com.example.demo.APIGTrigger.handler。
     * 也可以从应用详情接口返回结构template_deployment中直接获取。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateDeploymentJobsRequest 请求对象
     * @return AsyncInvoker<CreateDeploymentJobsRequest, CreateDeploymentJobsResponse>
     */
    public AsyncInvoker<CreateDeploymentJobsRequest, CreateDeploymentJobsResponse> createDeploymentJobsAsyncInvoker(
        CreateDeploymentJobsRequest request) {
        return new AsyncInvoker<CreateDeploymentJobsRequest, CreateDeploymentJobsResponse>(request,
            DevStarMeta.createDeploymentJobs, hcClient);
    }

    /**
     * 查询应用环境部署任务详情
     *
     * 查询应用环境部署任务详情
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowDeploymentJobsRequest 请求对象
     * @return CompletableFuture<ShowDeploymentJobsResponse>
     */
    public CompletableFuture<ShowDeploymentJobsResponse> showDeploymentJobsAsync(ShowDeploymentJobsRequest request) {
        return hcClient.asyncInvokeHttp(request, DevStarMeta.showDeploymentJobs);
    }

    /**
     * 查询应用环境部署任务详情
     *
     * 查询应用环境部署任务详情
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowDeploymentJobsRequest 请求对象
     * @return AsyncInvoker<ShowDeploymentJobsRequest, ShowDeploymentJobsResponse>
     */
    public AsyncInvoker<ShowDeploymentJobsRequest, ShowDeploymentJobsResponse> showDeploymentJobsAsyncInvoker(
        ShowDeploymentJobsRequest request) {
        return new AsyncInvoker<ShowDeploymentJobsRequest, ShowDeploymentJobsResponse>(request,
            DevStarMeta.showDeploymentJobs, hcClient);
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RunCodehubTemplateJobRequest 请求对象
     * @return CompletableFuture<RunCodehubTemplateJobResponse>
     */
    public CompletableFuture<RunCodehubTemplateJobResponse> runCodehubTemplateJobAsync(
        RunCodehubTemplateJobRequest request) {
        return hcClient.asyncInvokeHttp(request, DevStarMeta.runCodehubTemplateJob);
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RunCodehubTemplateJobRequest 请求对象
     * @return AsyncInvoker<RunCodehubTemplateJobRequest, RunCodehubTemplateJobResponse>
     */
    public AsyncInvoker<RunCodehubTemplateJobRequest, RunCodehubTemplateJobResponse> runCodehubTemplateJobAsyncInvoker(
        RunCodehubTemplateJobRequest request) {
        return new AsyncInvoker<RunCodehubTemplateJobRequest, RunCodehubTemplateJobResponse>(request,
            DevStarMeta.runCodehubTemplateJob, hcClient);
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RunDevstarTemplateJobRequest 请求对象
     * @return CompletableFuture<RunDevstarTemplateJobResponse>
     */
    public CompletableFuture<RunDevstarTemplateJobResponse> runDevstarTemplateJobAsync(
        RunDevstarTemplateJobRequest request) {
        return hcClient.asyncInvokeHttp(request, DevStarMeta.runDevstarTemplateJob);
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RunDevstarTemplateJobRequest 请求对象
     * @return AsyncInvoker<RunDevstarTemplateJobRequest, RunDevstarTemplateJobResponse>
     */
    public AsyncInvoker<RunDevstarTemplateJobRequest, RunDevstarTemplateJobResponse> runDevstarTemplateJobAsyncInvoker(
        RunDevstarTemplateJobRequest request) {
        return new AsyncInvoker<RunDevstarTemplateJobRequest, RunDevstarTemplateJobResponse>(request,
            DevStarMeta.runDevstarTemplateJob, hcClient);
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowJobDetailRequest 请求对象
     * @return CompletableFuture<ShowJobDetailResponse>
     */
    public CompletableFuture<ShowJobDetailResponse> showJobDetailAsync(ShowJobDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, DevStarMeta.showJobDetail);
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowJobDetailRequest 请求对象
     * @return AsyncInvoker<ShowJobDetailRequest, ShowJobDetailResponse>
     */
    public AsyncInvoker<ShowJobDetailRequest, ShowJobDetailResponse> showJobDetailAsyncInvoker(
        ShowJobDetailRequest request) {
        return new AsyncInvoker<ShowJobDetailRequest, ShowJobDetailResponse>(request, DevStarMeta.showJobDetail,
            hcClient);
    }

    /**
     * 流水线模板列表查询
     *
     * 流水线模板列表查询
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListPipelineTemplatesRequest 请求对象
     * @return CompletableFuture<ListPipelineTemplatesResponse>
     */
    public CompletableFuture<ListPipelineTemplatesResponse> listPipelineTemplatesAsync(
        ListPipelineTemplatesRequest request) {
        return hcClient.asyncInvokeHttp(request, DevStarMeta.listPipelineTemplates);
    }

    /**
     * 流水线模板列表查询
     *
     * 流水线模板列表查询
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListPipelineTemplatesRequest 请求对象
     * @return AsyncInvoker<ListPipelineTemplatesRequest, ListPipelineTemplatesResponse>
     */
    public AsyncInvoker<ListPipelineTemplatesRequest, ListPipelineTemplatesResponse> listPipelineTemplatesAsyncInvoker(
        ListPipelineTemplatesRequest request) {
        return new AsyncInvoker<ListPipelineTemplatesRequest, ListPipelineTemplatesResponse>(request,
            DevStarMeta.listPipelineTemplates, hcClient);
    }

    /**
     * 查询流水线最近一次运行状态查询接口
     *
     * 查询应用流水线最近一次运行状态查询接口
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowPipelineLastStatusV2Request 请求对象
     * @return CompletableFuture<ShowPipelineLastStatusV2Response>
     */
    public CompletableFuture<ShowPipelineLastStatusV2Response> showPipelineLastStatusV2Async(
        ShowPipelineLastStatusV2Request request) {
        return hcClient.asyncInvokeHttp(request, DevStarMeta.showPipelineLastStatusV2);
    }

    /**
     * 查询流水线最近一次运行状态查询接口
     *
     * 查询应用流水线最近一次运行状态查询接口
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowPipelineLastStatusV2Request 请求对象
     * @return AsyncInvoker<ShowPipelineLastStatusV2Request, ShowPipelineLastStatusV2Response>
     */
    public AsyncInvoker<ShowPipelineLastStatusV2Request, ShowPipelineLastStatusV2Response> showPipelineLastStatusV2AsyncInvoker(
        ShowPipelineLastStatusV2Request request) {
        return new AsyncInvoker<ShowPipelineLastStatusV2Request, ShowPipelineLastStatusV2Response>(request,
            DevStarMeta.showPipelineLastStatusV2, hcClient);
    }

    /**
     * 根据流水线Id操作流水线启动
     *
     * 根据流水线Id操作流水线启动
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param StartPipelineRequest 请求对象
     * @return CompletableFuture<StartPipelineResponse>
     */
    public CompletableFuture<StartPipelineResponse> startPipelineAsync(StartPipelineRequest request) {
        return hcClient.asyncInvokeHttp(request, DevStarMeta.startPipeline);
    }

    /**
     * 根据流水线Id操作流水线启动
     *
     * 根据流水线Id操作流水线启动
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param StartPipelineRequest 请求对象
     * @return AsyncInvoker<StartPipelineRequest, StartPipelineResponse>
     */
    public AsyncInvoker<StartPipelineRequest, StartPipelineResponse> startPipelineAsyncInvoker(
        StartPipelineRequest request) {
        return new AsyncInvoker<StartPipelineRequest, StartPipelineResponse>(request, DevStarMeta.startPipeline,
            hcClient);
    }

    /**
     * 获取用户有权限的DevStar存量DevCloud项目列表
     *
     * 获取用户有权限的DevStar存量DevCloud项目列表。
     * 来源包括：1.DevStar创建的DevCloud项目；2.DevStar应用有关联DevCloud项目。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListProjectsV4Request 请求对象
     * @return CompletableFuture<ListProjectsV4Response>
     */
    public CompletableFuture<ListProjectsV4Response> listProjectsV4Async(ListProjectsV4Request request) {
        return hcClient.asyncInvokeHttp(request, DevStarMeta.listProjectsV4);
    }

    /**
     * 获取用户有权限的DevStar存量DevCloud项目列表
     *
     * 获取用户有权限的DevStar存量DevCloud项目列表。
     * 来源包括：1.DevStar创建的DevCloud项目；2.DevStar应用有关联DevCloud项目。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListProjectsV4Request 请求对象
     * @return AsyncInvoker<ListProjectsV4Request, ListProjectsV4Response>
     */
    public AsyncInvoker<ListProjectsV4Request, ListProjectsV4Response> listProjectsV4AsyncInvoker(
        ListProjectsV4Request request) {
        return new AsyncInvoker<ListProjectsV4Request, ListProjectsV4Response>(request, DevStarMeta.listProjectsV4,
            hcClient);
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CheckRepositoryDuplicateNameRequest 请求对象
     * @return CompletableFuture<CheckRepositoryDuplicateNameResponse>
     */
    public CompletableFuture<CheckRepositoryDuplicateNameResponse> checkRepositoryDuplicateNameAsync(
        CheckRepositoryDuplicateNameRequest request) {
        return hcClient.asyncInvokeHttp(request, DevStarMeta.checkRepositoryDuplicateName);
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CheckRepositoryDuplicateNameRequest 请求对象
     * @return AsyncInvoker<CheckRepositoryDuplicateNameRequest, CheckRepositoryDuplicateNameResponse>
     */
    public AsyncInvoker<CheckRepositoryDuplicateNameRequest, CheckRepositoryDuplicateNameResponse> checkRepositoryDuplicateNameAsyncInvoker(
        CheckRepositoryDuplicateNameRequest request) {
        return new AsyncInvoker<CheckRepositoryDuplicateNameRequest, CheckRepositoryDuplicateNameResponse>(request,
            DevStarMeta.checkRepositoryDuplicateName, hcClient);
    }

    /**
     * 使用 CloudIDE 实例打开应用代码
     *
     * 使用 CloudIDE 实例打开应用代码。CloudIDE会保存用户项目数据，相同用户使用同一个CloudIDE，使用要求：
     * - 用户需为登录状态。
     * - 拥有仓库权限。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowRepositoryByCloudIdeRequest 请求对象
     * @return CompletableFuture<ShowRepositoryByCloudIdeResponse>
     */
    public CompletableFuture<ShowRepositoryByCloudIdeResponse> showRepositoryByCloudIdeAsync(
        ShowRepositoryByCloudIdeRequest request) {
        return hcClient.asyncInvokeHttp(request, DevStarMeta.showRepositoryByCloudIde);
    }

    /**
     * 使用 CloudIDE 实例打开应用代码
     *
     * 使用 CloudIDE 实例打开应用代码。CloudIDE会保存用户项目数据，相同用户使用同一个CloudIDE，使用要求：
     * - 用户需为登录状态。
     * - 拥有仓库权限。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowRepositoryByCloudIdeRequest 请求对象
     * @return AsyncInvoker<ShowRepositoryByCloudIdeRequest, ShowRepositoryByCloudIdeResponse>
     */
    public AsyncInvoker<ShowRepositoryByCloudIdeRequest, ShowRepositoryByCloudIdeResponse> showRepositoryByCloudIdeAsyncInvoker(
        ShowRepositoryByCloudIdeRequest request) {
        return new AsyncInvoker<ShowRepositoryByCloudIdeRequest, ShowRepositoryByCloudIdeResponse>(request,
            DevStarMeta.showRepositoryByCloudIde, hcClient);
    }

    /**
     * 应用代码仓库统计信息
     *
     * 查询代码仓库的统计信息,包括代码仓的名称,代码行数等信息
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowRepositoryStatisticalDataV2Request 请求对象
     * @return CompletableFuture<ShowRepositoryStatisticalDataV2Response>
     */
    public CompletableFuture<ShowRepositoryStatisticalDataV2Response> showRepositoryStatisticalDataV2Async(
        ShowRepositoryStatisticalDataV2Request request) {
        return hcClient.asyncInvokeHttp(request, DevStarMeta.showRepositoryStatisticalDataV2);
    }

    /**
     * 应用代码仓库统计信息
     *
     * 查询代码仓库的统计信息,包括代码仓的名称,代码行数等信息
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowRepositoryStatisticalDataV2Request 请求对象
     * @return AsyncInvoker<ShowRepositoryStatisticalDataV2Request, ShowRepositoryStatisticalDataV2Response>
     */
    public AsyncInvoker<ShowRepositoryStatisticalDataV2Request, ShowRepositoryStatisticalDataV2Response> showRepositoryStatisticalDataV2AsyncInvoker(
        ShowRepositoryStatisticalDataV2Request request) {
        return new AsyncInvoker<ShowRepositoryStatisticalDataV2Request, ShowRepositoryStatisticalDataV2Response>(
            request, DevStarMeta.showRepositoryStatisticalDataV2, hcClient);
    }

    /**
     * 读取模板文件
     *
     * 该接口可以用于模板作者或模板维护人读取模板文件内容。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowTemplateFileRequest 请求对象
     * @return CompletableFuture<ShowTemplateFileResponse>
     */
    public CompletableFuture<ShowTemplateFileResponse> showTemplateFileAsync(ShowTemplateFileRequest request) {
        return hcClient.asyncInvokeHttp(request, DevStarMeta.showTemplateFile);
    }

    /**
     * 读取模板文件
     *
     * 该接口可以用于模板作者或模板维护人读取模板文件内容。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowTemplateFileRequest 请求对象
     * @return AsyncInvoker<ShowTemplateFileRequest, ShowTemplateFileResponse>
     */
    public AsyncInvoker<ShowTemplateFileRequest, ShowTemplateFileResponse> showTemplateFileAsyncInvoker(
        ShowTemplateFileRequest request) {
        return new AsyncInvoker<ShowTemplateFileRequest, ShowTemplateFileResponse>(request,
            DevStarMeta.showTemplateFile, hcClient);
    }

    /**
     * 同步模板浏览记录
     *
     * 未登录状态下，将用户浏览过的模板缓存在浏览器中，登录时，调用该接口同步模板浏览记录。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateTemplateViewHistoriesRequest 请求对象
     * @return CompletableFuture<CreateTemplateViewHistoriesResponse>
     */
    public CompletableFuture<CreateTemplateViewHistoriesResponse> createTemplateViewHistoriesAsync(
        CreateTemplateViewHistoriesRequest request) {
        return hcClient.asyncInvokeHttp(request, DevStarMeta.createTemplateViewHistories);
    }

    /**
     * 同步模板浏览记录
     *
     * 未登录状态下，将用户浏览过的模板缓存在浏览器中，登录时，调用该接口同步模板浏览记录。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateTemplateViewHistoriesRequest 请求对象
     * @return AsyncInvoker<CreateTemplateViewHistoriesRequest, CreateTemplateViewHistoriesResponse>
     */
    public AsyncInvoker<CreateTemplateViewHistoriesRequest, CreateTemplateViewHistoriesResponse> createTemplateViewHistoriesAsyncInvoker(
        CreateTemplateViewHistoriesRequest request) {
        return new AsyncInvoker<CreateTemplateViewHistoriesRequest, CreateTemplateViewHistoriesResponse>(request,
            DevStarMeta.createTemplateViewHistories, hcClient);
    }

    /**
     * 查询模板列表（V1）
     *
     * 查询模板列表，推荐使用/v1/templates/query接口。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListPublishedTemplatesRequest 请求对象
     * @return CompletableFuture<ListPublishedTemplatesResponse>
     */
    public CompletableFuture<ListPublishedTemplatesResponse> listPublishedTemplatesAsync(
        ListPublishedTemplatesRequest request) {
        return hcClient.asyncInvokeHttp(request, DevStarMeta.listPublishedTemplates);
    }

    /**
     * 查询模板列表（V1）
     *
     * 查询模板列表，推荐使用/v1/templates/query接口。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListPublishedTemplatesRequest 请求对象
     * @return AsyncInvoker<ListPublishedTemplatesRequest, ListPublishedTemplatesResponse>
     */
    public AsyncInvoker<ListPublishedTemplatesRequest, ListPublishedTemplatesResponse> listPublishedTemplatesAsyncInvoker(
        ListPublishedTemplatesRequest request) {
        return new AsyncInvoker<ListPublishedTemplatesRequest, ListPublishedTemplatesResponse>(request,
            DevStarMeta.listPublishedTemplates, hcClient);
    }

    /**
     * 我浏览的模板记录
     *
     * 查询DevStar或者CodeLabs登录用户浏览过的模板（只返回最近浏览的5个模板）。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListTemplateViewHistoriesRequest 请求对象
     * @return CompletableFuture<ListTemplateViewHistoriesResponse>
     */
    public CompletableFuture<ListTemplateViewHistoriesResponse> listTemplateViewHistoriesAsync(
        ListTemplateViewHistoriesRequest request) {
        return hcClient.asyncInvokeHttp(request, DevStarMeta.listTemplateViewHistories);
    }

    /**
     * 我浏览的模板记录
     *
     * 查询DevStar或者CodeLabs登录用户浏览过的模板（只返回最近浏览的5个模板）。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListTemplateViewHistoriesRequest 请求对象
     * @return AsyncInvoker<ListTemplateViewHistoriesRequest, ListTemplateViewHistoriesResponse>
     */
    public AsyncInvoker<ListTemplateViewHistoriesRequest, ListTemplateViewHistoriesResponse> listTemplateViewHistoriesAsyncInvoker(
        ListTemplateViewHistoriesRequest request) {
        return new AsyncInvoker<ListTemplateViewHistoriesRequest, ListTemplateViewHistoriesResponse>(request,
            DevStarMeta.listTemplateViewHistories, hcClient);
    }

    /**
     * 查询模板列表
     *
     * 查询模板列表。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListTemplatesRequest 请求对象
     * @return CompletableFuture<ListTemplatesResponse>
     */
    public CompletableFuture<ListTemplatesResponse> listTemplatesAsync(ListTemplatesRequest request) {
        return hcClient.asyncInvokeHttp(request, DevStarMeta.listTemplates);
    }

    /**
     * 查询模板列表
     *
     * 查询模板列表。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListTemplatesRequest 请求对象
     * @return AsyncInvoker<ListTemplatesRequest, ListTemplatesResponse>
     */
    public AsyncInvoker<ListTemplatesRequest, ListTemplatesResponse> listTemplatesAsyncInvoker(
        ListTemplatesRequest request) {
        return new AsyncInvoker<ListTemplatesRequest, ListTemplatesResponse>(request, DevStarMeta.listTemplates,
            hcClient);
    }

    /**
     * 查询模板列表（V2）
     *
     * 查询模板列表。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListTemplatesV2Request 请求对象
     * @return CompletableFuture<ListTemplatesV2Response>
     */
    public CompletableFuture<ListTemplatesV2Response> listTemplatesV2Async(ListTemplatesV2Request request) {
        return hcClient.asyncInvokeHttp(request, DevStarMeta.listTemplatesV2);
    }

    /**
     * 查询模板列表（V2）
     *
     * 查询模板列表。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListTemplatesV2Request 请求对象
     * @return AsyncInvoker<ListTemplatesV2Request, ListTemplatesV2Response>
     */
    public AsyncInvoker<ListTemplatesV2Request, ListTemplatesV2Response> listTemplatesV2AsyncInvoker(
        ListTemplatesV2Request request) {
        return new AsyncInvoker<ListTemplatesV2Request, ListTemplatesV2Response>(request, DevStarMeta.listTemplatesV2,
            hcClient);
    }

    /**
     * 查询模板详情（V3）
     *
     * 获取指定模板详情，包括模板id、名称、描述、作者、标签、上架时间等信息。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowTemplateV3Request 请求对象
     * @return CompletableFuture<ShowTemplateV3Response>
     */
    public CompletableFuture<ShowTemplateV3Response> showTemplateV3Async(ShowTemplateV3Request request) {
        return hcClient.asyncInvokeHttp(request, DevStarMeta.showTemplateV3);
    }

    /**
     * 查询模板详情（V3）
     *
     * 获取指定模板详情，包括模板id、名称、描述、作者、标签、上架时间等信息。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowTemplateV3Request 请求对象
     * @return AsyncInvoker<ShowTemplateV3Request, ShowTemplateV3Response>
     */
    public AsyncInvoker<ShowTemplateV3Request, ShowTemplateV3Response> showTemplateV3AsyncInvoker(
        ShowTemplateV3Request request) {
        return new AsyncInvoker<ShowTemplateV3Request, ShowTemplateV3Response>(request, DevStarMeta.showTemplateV3,
            hcClient);
    }

    /**
     * 查询模板详情（V1）
     *
     * 查询模板详情，推荐使用V3版本接口。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowTemplateDetailRequest 请求对象
     * @return CompletableFuture<ShowTemplateDetailResponse>
     */
    public CompletableFuture<ShowTemplateDetailResponse> showTemplateDetailAsync(ShowTemplateDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, DevStarMeta.showTemplateDetail);
    }

    /**
     * 查询模板详情（V1）
     *
     * 查询模板详情，推荐使用V3版本接口。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowTemplateDetailRequest 请求对象
     * @return AsyncInvoker<ShowTemplateDetailRequest, ShowTemplateDetailResponse>
     */
    public AsyncInvoker<ShowTemplateDetailRequest, ShowTemplateDetailResponse> showTemplateDetailAsyncInvoker(
        ShowTemplateDetailRequest request) {
        return new AsyncInvoker<ShowTemplateDetailRequest, ShowTemplateDetailResponse>(request,
            DevStarMeta.showTemplateDetail, hcClient);
    }

}
