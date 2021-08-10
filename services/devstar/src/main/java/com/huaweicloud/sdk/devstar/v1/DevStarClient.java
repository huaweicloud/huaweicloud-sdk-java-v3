package com.huaweicloud.sdk.devstar.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.devstar.v1.model.*;

public class DevStarClient {

    protected HcClient hcClient;

    public DevStarClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<DevStarClient> newBuilder() {
        return new ClientBuilder<>(DevStarClient::new, "GlobalCredentials");
    }

    /** 下载模板产物 下载模板产物。
     *
     * @param DownloadApplicationCodeRequest 请求对象
     * @return DownloadApplicationCodeResponse */
    public DownloadApplicationCodeResponse downloadApplicationCode(DownloadApplicationCodeRequest request) {
        return hcClient.syncInvokeHttp(request, DevStarMeta.downloadApplicationCode);
    }

    /** 下载模板产物 下载模板产物。
     *
     * @param DownloadApplicationCodeRequest 请求对象
     * @return SyncInvoker<DownloadApplicationCodeRequest, DownloadApplicationCodeResponse> */
    public SyncInvoker<DownloadApplicationCodeRequest, DownloadApplicationCodeResponse> downloadApplicationCodeInvoker(
        DownloadApplicationCodeRequest request) {
        return new SyncInvoker<DownloadApplicationCodeRequest, DownloadApplicationCodeResponse>(request,
            DevStarMeta.downloadApplicationCode, hcClient);
    }

    /** CodeHub 模板生成代码 使用CodeHub模板创建应用代码。 通过 Codehub 模板创建生成应用代码的任务，并将应用代码存储于指定的 CodeHub 仓库中或者生成代码压缩包，可以通过返回的任务 ID
     * 查询相关任务状态。 - 接口鉴权方式 通过华为云服务获取的用户token。 - 代码生成位置 应用代码生成后的地址，目前支持codehub地址和压缩包下载地址。
     *
     * @param RunCodehubTemplateJobRequest 请求对象
     * @return RunCodehubTemplateJobResponse */
    public RunCodehubTemplateJobResponse runCodehubTemplateJob(RunCodehubTemplateJobRequest request) {
        return hcClient.syncInvokeHttp(request, DevStarMeta.runCodehubTemplateJob);
    }

    /** CodeHub 模板生成代码 使用CodeHub模板创建应用代码。 通过 Codehub 模板创建生成应用代码的任务，并将应用代码存储于指定的 CodeHub 仓库中或者生成代码压缩包，可以通过返回的任务 ID
     * 查询相关任务状态。 - 接口鉴权方式 通过华为云服务获取的用户token。 - 代码生成位置 应用代码生成后的地址，目前支持codehub地址和压缩包下载地址。
     *
     * @param RunCodehubTemplateJobRequest 请求对象
     * @return SyncInvoker<RunCodehubTemplateJobRequest, RunCodehubTemplateJobResponse> */
    public SyncInvoker<RunCodehubTemplateJobRequest, RunCodehubTemplateJobResponse> runCodehubTemplateJobInvoker(
        RunCodehubTemplateJobRequest request) {
        return new SyncInvoker<RunCodehubTemplateJobRequest, RunCodehubTemplateJobResponse>(request,
            DevStarMeta.runCodehubTemplateJob, hcClient);
    }

    /** Devstar 模板生成代码 使用DevStar的模板创建应用代码。 通过 DevStar 模板创建生成应用代码的任务，并将应用代码存储于指定的 CodeHub 仓库中，可以通过返回的任务 ID 查询相关任务状态。 -
     * 接口鉴权方式 通过华为云服务获取的用户token。 - 代码生成位置 应用代码生成后的地址，目前支持codehub地址和压缩包下载地址。
     *
     * @param RunDevstarTemplateJobRequest 请求对象
     * @return RunDevstarTemplateJobResponse */
    public RunDevstarTemplateJobResponse runDevstarTemplateJob(RunDevstarTemplateJobRequest request) {
        return hcClient.syncInvokeHttp(request, DevStarMeta.runDevstarTemplateJob);
    }

    /** Devstar 模板生成代码 使用DevStar的模板创建应用代码。 通过 DevStar 模板创建生成应用代码的任务，并将应用代码存储于指定的 CodeHub 仓库中，可以通过返回的任务 ID 查询相关任务状态。 -
     * 接口鉴权方式 通过华为云服务获取的用户token。 - 代码生成位置 应用代码生成后的地址，目前支持codehub地址和压缩包下载地址。
     *
     * @param RunDevstarTemplateJobRequest 请求对象
     * @return SyncInvoker<RunDevstarTemplateJobRequest, RunDevstarTemplateJobResponse> */
    public SyncInvoker<RunDevstarTemplateJobRequest, RunDevstarTemplateJobResponse> runDevstarTemplateJobInvoker(
        RunDevstarTemplateJobRequest request) {
        return new SyncInvoker<RunDevstarTemplateJobRequest, RunDevstarTemplateJobResponse>(request,
            DevStarMeta.runDevstarTemplateJob, hcClient);
    }

    /** 查询任务详情 查询任务的详情。 通过任务ID可以查看任务的状态 当任务结束时返回应用代码存放的位置。 - 接口鉴权方式 通过华为云服务获取的用户token。 - 代码生成位置
     * 应用代码生成后的地址，目前支持codehub地址和压缩包下载地址。
     *
     * @param ShowJobDetailRequest 请求对象
     * @return ShowJobDetailResponse */
    public ShowJobDetailResponse showJobDetail(ShowJobDetailRequest request) {
        return hcClient.syncInvokeHttp(request, DevStarMeta.showJobDetail);
    }

    /** 查询任务详情 查询任务的详情。 通过任务ID可以查看任务的状态 当任务结束时返回应用代码存放的位置。 - 接口鉴权方式 通过华为云服务获取的用户token。 - 代码生成位置
     * 应用代码生成后的地址，目前支持codehub地址和压缩包下载地址。
     *
     * @param ShowJobDetailRequest 请求对象
     * @return SyncInvoker<ShowJobDetailRequest, ShowJobDetailResponse> */
    public SyncInvoker<ShowJobDetailRequest, ShowJobDetailResponse> showJobDetailInvoker(ShowJobDetailRequest request) {
        return new SyncInvoker<ShowJobDetailRequest, ShowJobDetailResponse>(request, DevStarMeta.showJobDetail,
            hcClient);
    }

    /** 读取模板文件 该接口可以用于模板作者或模板维护人读取模板文件内容。
     *
     * @param ShowTemplateFileRequest 请求对象
     * @return ShowTemplateFileResponse */
    public ShowTemplateFileResponse showTemplateFile(ShowTemplateFileRequest request) {
        return hcClient.syncInvokeHttp(request, DevStarMeta.showTemplateFile);
    }

    /** 读取模板文件 该接口可以用于模板作者或模板维护人读取模板文件内容。
     *
     * @param ShowTemplateFileRequest 请求对象
     * @return SyncInvoker<ShowTemplateFileRequest, ShowTemplateFileResponse> */
    public SyncInvoker<ShowTemplateFileRequest, ShowTemplateFileResponse> showTemplateFileInvoker(
        ShowTemplateFileRequest request) {
        return new SyncInvoker<ShowTemplateFileRequest, ShowTemplateFileResponse>(request, DevStarMeta.showTemplateFile,
            hcClient);
    }

    /** 同步模板浏览记录 未登录状态下，将用户浏览过的模板缓存在浏览器中，登录时，调用该接口同步模板浏览记录。
     *
     * @param CreateTemplateViewHistoriesRequest 请求对象
     * @return CreateTemplateViewHistoriesResponse */
    public CreateTemplateViewHistoriesResponse createTemplateViewHistories(CreateTemplateViewHistoriesRequest request) {
        return hcClient.syncInvokeHttp(request, DevStarMeta.createTemplateViewHistories);
    }

    /** 同步模板浏览记录 未登录状态下，将用户浏览过的模板缓存在浏览器中，登录时，调用该接口同步模板浏览记录。
     *
     * @param CreateTemplateViewHistoriesRequest 请求对象
     * @return SyncInvoker<CreateTemplateViewHistoriesRequest, CreateTemplateViewHistoriesResponse> */
    public SyncInvoker<CreateTemplateViewHistoriesRequest, CreateTemplateViewHistoriesResponse> createTemplateViewHistoriesInvoker(
        CreateTemplateViewHistoriesRequest request) {
        return new SyncInvoker<CreateTemplateViewHistoriesRequest, CreateTemplateViewHistoriesResponse>(request,
            DevStarMeta.createTemplateViewHistories, hcClient);
    }

    /** 查询模板列表（V1） 查询模板列表，推荐使用V2版本接口。
     *
     * @param ListPublishedTemplatesRequest 请求对象
     * @return ListPublishedTemplatesResponse */
    public ListPublishedTemplatesResponse listPublishedTemplates(ListPublishedTemplatesRequest request) {
        return hcClient.syncInvokeHttp(request, DevStarMeta.listPublishedTemplates);
    }

    /** 查询模板列表（V1） 查询模板列表，推荐使用V2版本接口。
     *
     * @param ListPublishedTemplatesRequest 请求对象
     * @return SyncInvoker<ListPublishedTemplatesRequest, ListPublishedTemplatesResponse> */
    public SyncInvoker<ListPublishedTemplatesRequest, ListPublishedTemplatesResponse> listPublishedTemplatesInvoker(
        ListPublishedTemplatesRequest request) {
        return new SyncInvoker<ListPublishedTemplatesRequest, ListPublishedTemplatesResponse>(request,
            DevStarMeta.listPublishedTemplates, hcClient);
    }

    /** 我浏览的模板记录 查询DevStar或者CodeLabs登录用户浏览过的模板（只返回最近浏览的5个模板）。
     *
     * @param ListTemplateViewHistoriesRequest 请求对象
     * @return ListTemplateViewHistoriesResponse */
    public ListTemplateViewHistoriesResponse listTemplateViewHistories(ListTemplateViewHistoriesRequest request) {
        return hcClient.syncInvokeHttp(request, DevStarMeta.listTemplateViewHistories);
    }

    /** 我浏览的模板记录 查询DevStar或者CodeLabs登录用户浏览过的模板（只返回最近浏览的5个模板）。
     *
     * @param ListTemplateViewHistoriesRequest 请求对象
     * @return SyncInvoker<ListTemplateViewHistoriesRequest, ListTemplateViewHistoriesResponse> */
    public SyncInvoker<ListTemplateViewHistoriesRequest, ListTemplateViewHistoriesResponse> listTemplateViewHistoriesInvoker(
        ListTemplateViewHistoriesRequest request) {
        return new SyncInvoker<ListTemplateViewHistoriesRequest, ListTemplateViewHistoriesResponse>(request,
            DevStarMeta.listTemplateViewHistories, hcClient);
    }

    /** 查询模板列表（V2） 查询模板列表。
     *
     * @param ListTemplatesV2Request 请求对象
     * @return ListTemplatesV2Response */
    public ListTemplatesV2Response listTemplatesV2(ListTemplatesV2Request request) {
        return hcClient.syncInvokeHttp(request, DevStarMeta.listTemplatesV2);
    }

    /** 查询模板列表（V2） 查询模板列表。
     *
     * @param ListTemplatesV2Request 请求对象
     * @return SyncInvoker<ListTemplatesV2Request, ListTemplatesV2Response> */
    public SyncInvoker<ListTemplatesV2Request, ListTemplatesV2Response> listTemplatesV2Invoker(
        ListTemplatesV2Request request) {
        return new SyncInvoker<ListTemplatesV2Request, ListTemplatesV2Response>(request, DevStarMeta.listTemplatesV2,
            hcClient);
    }

    /** 查询模板详情（V3） 获取指定模板详情，包括模板id、名称、描述、作者、标签、上架时间等信息。
     *
     * @param ShowTemplateV3Request 请求对象
     * @return ShowTemplateV3Response */
    public ShowTemplateV3Response showTemplateV3(ShowTemplateV3Request request) {
        return hcClient.syncInvokeHttp(request, DevStarMeta.showTemplateV3);
    }

    /** 查询模板详情（V3） 获取指定模板详情，包括模板id、名称、描述、作者、标签、上架时间等信息。
     *
     * @param ShowTemplateV3Request 请求对象
     * @return SyncInvoker<ShowTemplateV3Request, ShowTemplateV3Response> */
    public SyncInvoker<ShowTemplateV3Request, ShowTemplateV3Response> showTemplateV3Invoker(
        ShowTemplateV3Request request) {
        return new SyncInvoker<ShowTemplateV3Request, ShowTemplateV3Response>(request, DevStarMeta.showTemplateV3,
            hcClient);
    }

    /** 查询模板详情（V1） 查询模板详情，推荐使用V3版本接口。
     *
     * @param ShowTemplateDetailRequest 请求对象
     * @return ShowTemplateDetailResponse */
    public ShowTemplateDetailResponse showTemplateDetail(ShowTemplateDetailRequest request) {
        return hcClient.syncInvokeHttp(request, DevStarMeta.showTemplateDetail);
    }

    /** 查询模板详情（V1） 查询模板详情，推荐使用V3版本接口。
     *
     * @param ShowTemplateDetailRequest 请求对象
     * @return SyncInvoker<ShowTemplateDetailRequest, ShowTemplateDetailResponse> */
    public SyncInvoker<ShowTemplateDetailRequest, ShowTemplateDetailResponse> showTemplateDetailInvoker(
        ShowTemplateDetailRequest request) {
        return new SyncInvoker<ShowTemplateDetailRequest, ShowTemplateDetailResponse>(request,
            DevStarMeta.showTemplateDetail, hcClient);
    }

}
