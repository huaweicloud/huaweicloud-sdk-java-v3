package com.huaweicloud.sdk.devstar.v1;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.devstar.v1.model.*;

public class DevStarAsyncClient {
    protected HcClient hcClient;

    public DevStarAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<DevStarAsyncClient> newBuilder() {
        return new ClientBuilder<>(DevStarAsyncClient::new, "GlobalCredentials");
    }


    /**
     * 下载模板产物
     * 下载模板产物。
     *
     * @param DownloadApplicationCodeRequest 请求对象
     * @return CompletableFuture<DownloadApplicationCodeResponse>
     */
    public CompletableFuture<DownloadApplicationCodeResponse> downloadApplicationCodeAsync(DownloadApplicationCodeRequest request) {
        return hcClient.asyncInvokeHttp(request, DevStarMeta.downloadApplicationCode);
    }

    /**
     * 下载模板产物
     * 下载模板产物。
     *
     * @param DownloadApplicationCodeRequest 请求对象
     * @return AsyncInvoker<DownloadApplicationCodeRequest, DownloadApplicationCodeResponse>
     */
    public AsyncInvoker<DownloadApplicationCodeRequest, DownloadApplicationCodeResponse> downloadApplicationCodeAsyncInvoker(DownloadApplicationCodeRequest request) {
        return new AsyncInvoker<DownloadApplicationCodeRequest, DownloadApplicationCodeResponse>(request, DevStarMeta.downloadApplicationCode, hcClient);
    }

    /**
     * CodeHub 模板生成代码
     * 使用CodeHub模板创建应用代码。  通过 Codehub 模板创建生成应用代码的任务，并将应用代码存储于指定的 CodeHub 仓库中或者生成代码压缩包，可以通过返回的任务 ID 查询相关任务状态。  - 接口鉴权方式 通过华为云服务获取的用户token。  - 代码生成位置 应用代码生成后的地址，目前支持codehub地址和压缩包下载地址。
     *
     * @param RunCodehubTemplateJobRequest 请求对象
     * @return CompletableFuture<RunCodehubTemplateJobResponse>
     */
    public CompletableFuture<RunCodehubTemplateJobResponse> runCodehubTemplateJobAsync(RunCodehubTemplateJobRequest request) {
        return hcClient.asyncInvokeHttp(request, DevStarMeta.runCodehubTemplateJob);
    }

    /**
     * CodeHub 模板生成代码
     * 使用CodeHub模板创建应用代码。  通过 Codehub 模板创建生成应用代码的任务，并将应用代码存储于指定的 CodeHub 仓库中或者生成代码压缩包，可以通过返回的任务 ID 查询相关任务状态。  - 接口鉴权方式 通过华为云服务获取的用户token。  - 代码生成位置 应用代码生成后的地址，目前支持codehub地址和压缩包下载地址。
     *
     * @param RunCodehubTemplateJobRequest 请求对象
     * @return AsyncInvoker<RunCodehubTemplateJobRequest, RunCodehubTemplateJobResponse>
     */
    public AsyncInvoker<RunCodehubTemplateJobRequest, RunCodehubTemplateJobResponse> runCodehubTemplateJobAsyncInvoker(RunCodehubTemplateJobRequest request) {
        return new AsyncInvoker<RunCodehubTemplateJobRequest, RunCodehubTemplateJobResponse>(request, DevStarMeta.runCodehubTemplateJob, hcClient);
    }

    /**
     * Devstar 模板生成代码
     * 使用DevStar的模板创建应用代码。  通过 DevStar 模板创建生成应用代码的任务，并将应用代码存储于指定的 CodeHub 仓库中，可以通过返回的任务 ID 查询相关任务状态。  - 接口鉴权方式 通过华为云服务获取的用户token。  - 代码生成位置 应用代码生成后的地址，目前支持codehub地址和压缩包下载地址。
     *
     * @param RunDevstarTemplateJobRequest 请求对象
     * @return CompletableFuture<RunDevstarTemplateJobResponse>
     */
    public CompletableFuture<RunDevstarTemplateJobResponse> runDevstarTemplateJobAsync(RunDevstarTemplateJobRequest request) {
        return hcClient.asyncInvokeHttp(request, DevStarMeta.runDevstarTemplateJob);
    }

    /**
     * Devstar 模板生成代码
     * 使用DevStar的模板创建应用代码。  通过 DevStar 模板创建生成应用代码的任务，并将应用代码存储于指定的 CodeHub 仓库中，可以通过返回的任务 ID 查询相关任务状态。  - 接口鉴权方式 通过华为云服务获取的用户token。  - 代码生成位置 应用代码生成后的地址，目前支持codehub地址和压缩包下载地址。
     *
     * @param RunDevstarTemplateJobRequest 请求对象
     * @return AsyncInvoker<RunDevstarTemplateJobRequest, RunDevstarTemplateJobResponse>
     */
    public AsyncInvoker<RunDevstarTemplateJobRequest, RunDevstarTemplateJobResponse> runDevstarTemplateJobAsyncInvoker(RunDevstarTemplateJobRequest request) {
        return new AsyncInvoker<RunDevstarTemplateJobRequest, RunDevstarTemplateJobResponse>(request, DevStarMeta.runDevstarTemplateJob, hcClient);
    }

    /**
     * 查询任务详情
     * 查询任务的详情。  通过任务ID可以查看任务的状态 当任务结束时返回应用代码存放的位置。  - 接口鉴权方式 通过华为云服务获取的用户token。  - 代码生成位置 应用代码生成后的地址，目前支持codehub地址和压缩包下载地址。
     *
     * @param ShowJobDetailRequest 请求对象
     * @return CompletableFuture<ShowJobDetailResponse>
     */
    public CompletableFuture<ShowJobDetailResponse> showJobDetailAsync(ShowJobDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, DevStarMeta.showJobDetail);
    }

    /**
     * 查询任务详情
     * 查询任务的详情。  通过任务ID可以查看任务的状态 当任务结束时返回应用代码存放的位置。  - 接口鉴权方式 通过华为云服务获取的用户token。  - 代码生成位置 应用代码生成后的地址，目前支持codehub地址和压缩包下载地址。
     *
     * @param ShowJobDetailRequest 请求对象
     * @return AsyncInvoker<ShowJobDetailRequest, ShowJobDetailResponse>
     */
    public AsyncInvoker<ShowJobDetailRequest, ShowJobDetailResponse> showJobDetailAsyncInvoker(ShowJobDetailRequest request) {
        return new AsyncInvoker<ShowJobDetailRequest, ShowJobDetailResponse>(request, DevStarMeta.showJobDetail, hcClient);
    }

    /**
     * 读取模板文件
     * 该接口可以用于模板作者或模板维护人读取模板文件内容。
     *
     * @param ShowTemplateFileRequest 请求对象
     * @return CompletableFuture<ShowTemplateFileResponse>
     */
    public CompletableFuture<ShowTemplateFileResponse> showTemplateFileAsync(ShowTemplateFileRequest request) {
        return hcClient.asyncInvokeHttp(request, DevStarMeta.showTemplateFile);
    }

    /**
     * 读取模板文件
     * 该接口可以用于模板作者或模板维护人读取模板文件内容。
     *
     * @param ShowTemplateFileRequest 请求对象
     * @return AsyncInvoker<ShowTemplateFileRequest, ShowTemplateFileResponse>
     */
    public AsyncInvoker<ShowTemplateFileRequest, ShowTemplateFileResponse> showTemplateFileAsyncInvoker(ShowTemplateFileRequest request) {
        return new AsyncInvoker<ShowTemplateFileRequest, ShowTemplateFileResponse>(request, DevStarMeta.showTemplateFile, hcClient);
    }

    /**
     * 同步模板浏览记录
     * 未登录状态下，将用户浏览过的模板缓存在浏览器中，登录时，调用该接口同步模板浏览记录。 
     *
     * @param CreateTemplateViewHistoriesRequest 请求对象
     * @return CompletableFuture<CreateTemplateViewHistoriesResponse>
     */
    public CompletableFuture<CreateTemplateViewHistoriesResponse> createTemplateViewHistoriesAsync(CreateTemplateViewHistoriesRequest request) {
        return hcClient.asyncInvokeHttp(request, DevStarMeta.createTemplateViewHistories);
    }

    /**
     * 同步模板浏览记录
     * 未登录状态下，将用户浏览过的模板缓存在浏览器中，登录时，调用该接口同步模板浏览记录。 
     *
     * @param CreateTemplateViewHistoriesRequest 请求对象
     * @return AsyncInvoker<CreateTemplateViewHistoriesRequest, CreateTemplateViewHistoriesResponse>
     */
    public AsyncInvoker<CreateTemplateViewHistoriesRequest, CreateTemplateViewHistoriesResponse> createTemplateViewHistoriesAsyncInvoker(CreateTemplateViewHistoriesRequest request) {
        return new AsyncInvoker<CreateTemplateViewHistoriesRequest, CreateTemplateViewHistoriesResponse>(request, DevStarMeta.createTemplateViewHistories, hcClient);
    }

    /**
     * 查询模板列表（V1）
     * 查询模板列表，推荐使用V2版本接口。
     *
     * @param ListPublishedTemplatesRequest 请求对象
     * @return CompletableFuture<ListPublishedTemplatesResponse>
     */
    public CompletableFuture<ListPublishedTemplatesResponse> listPublishedTemplatesAsync(ListPublishedTemplatesRequest request) {
        return hcClient.asyncInvokeHttp(request, DevStarMeta.listPublishedTemplates);
    }

    /**
     * 查询模板列表（V1）
     * 查询模板列表，推荐使用V2版本接口。
     *
     * @param ListPublishedTemplatesRequest 请求对象
     * @return AsyncInvoker<ListPublishedTemplatesRequest, ListPublishedTemplatesResponse>
     */
    public AsyncInvoker<ListPublishedTemplatesRequest, ListPublishedTemplatesResponse> listPublishedTemplatesAsyncInvoker(ListPublishedTemplatesRequest request) {
        return new AsyncInvoker<ListPublishedTemplatesRequest, ListPublishedTemplatesResponse>(request, DevStarMeta.listPublishedTemplates, hcClient);
    }

    /**
     * 我浏览的模板记录
     * 查询DevStar或者CodeLabs登录用户浏览过的模板（只返回最近浏览的5个模板）。 
     *
     * @param ListTemplateViewHistoriesRequest 请求对象
     * @return CompletableFuture<ListTemplateViewHistoriesResponse>
     */
    public CompletableFuture<ListTemplateViewHistoriesResponse> listTemplateViewHistoriesAsync(ListTemplateViewHistoriesRequest request) {
        return hcClient.asyncInvokeHttp(request, DevStarMeta.listTemplateViewHistories);
    }

    /**
     * 我浏览的模板记录
     * 查询DevStar或者CodeLabs登录用户浏览过的模板（只返回最近浏览的5个模板）。 
     *
     * @param ListTemplateViewHistoriesRequest 请求对象
     * @return AsyncInvoker<ListTemplateViewHistoriesRequest, ListTemplateViewHistoriesResponse>
     */
    public AsyncInvoker<ListTemplateViewHistoriesRequest, ListTemplateViewHistoriesResponse> listTemplateViewHistoriesAsyncInvoker(ListTemplateViewHistoriesRequest request) {
        return new AsyncInvoker<ListTemplateViewHistoriesRequest, ListTemplateViewHistoriesResponse>(request, DevStarMeta.listTemplateViewHistories, hcClient);
    }

    /**
     * 查询模板列表（V2）
     * 查询模板列表。
     *
     * @param ListTemplatesV2Request 请求对象
     * @return CompletableFuture<ListTemplatesV2Response>
     */
    public CompletableFuture<ListTemplatesV2Response> listTemplatesV2Async(ListTemplatesV2Request request) {
        return hcClient.asyncInvokeHttp(request, DevStarMeta.listTemplatesV2);
    }

    /**
     * 查询模板列表（V2）
     * 查询模板列表。
     *
     * @param ListTemplatesV2Request 请求对象
     * @return AsyncInvoker<ListTemplatesV2Request, ListTemplatesV2Response>
     */
    public AsyncInvoker<ListTemplatesV2Request, ListTemplatesV2Response> listTemplatesV2AsyncInvoker(ListTemplatesV2Request request) {
        return new AsyncInvoker<ListTemplatesV2Request, ListTemplatesV2Response>(request, DevStarMeta.listTemplatesV2, hcClient);
    }

    /**
     * 查询模板详情（V3）
     * 获取指定模板详情，包括模板id、名称、描述、作者、标签、上架时间等信息。 
     *
     * @param ShowTemplateV3Request 请求对象
     * @return CompletableFuture<ShowTemplateV3Response>
     */
    public CompletableFuture<ShowTemplateV3Response> showTemplateV3Async(ShowTemplateV3Request request) {
        return hcClient.asyncInvokeHttp(request, DevStarMeta.showTemplateV3);
    }

    /**
     * 查询模板详情（V3）
     * 获取指定模板详情，包括模板id、名称、描述、作者、标签、上架时间等信息。 
     *
     * @param ShowTemplateV3Request 请求对象
     * @return AsyncInvoker<ShowTemplateV3Request, ShowTemplateV3Response>
     */
    public AsyncInvoker<ShowTemplateV3Request, ShowTemplateV3Response> showTemplateV3AsyncInvoker(ShowTemplateV3Request request) {
        return new AsyncInvoker<ShowTemplateV3Request, ShowTemplateV3Response>(request, DevStarMeta.showTemplateV3, hcClient);
    }

    /**
     * 查询模板详情（V1）
     * 查询模板详情，推荐使用V3版本接口。
     *
     * @param ShowTemplateDetailRequest 请求对象
     * @return CompletableFuture<ShowTemplateDetailResponse>
     */
    public CompletableFuture<ShowTemplateDetailResponse> showTemplateDetailAsync(ShowTemplateDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, DevStarMeta.showTemplateDetail);
    }

    /**
     * 查询模板详情（V1）
     * 查询模板详情，推荐使用V3版本接口。
     *
     * @param ShowTemplateDetailRequest 请求对象
     * @return AsyncInvoker<ShowTemplateDetailRequest, ShowTemplateDetailResponse>
     */
    public AsyncInvoker<ShowTemplateDetailRequest, ShowTemplateDetailResponse> showTemplateDetailAsyncInvoker(ShowTemplateDetailRequest request) {
        return new AsyncInvoker<ShowTemplateDetailRequest, ShowTemplateDetailResponse>(request, DevStarMeta.showTemplateDetail, hcClient);
    }

}