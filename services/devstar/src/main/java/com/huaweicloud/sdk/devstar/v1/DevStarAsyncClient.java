package com.huaweicloud.sdk.devstar.v1;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

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
     * 下载模板产物
     *
     * @param DownloadApplicationCodeRequest 请求对象
     * @return CompletableFuture<DownloadApplicationCodeResponse>
     */
    public CompletableFuture<DownloadApplicationCodeResponse> downloadApplicationCodeAsync(DownloadApplicationCodeRequest request) {
        return hcClient.asyncInvokeHttp(request, DevStarMeta.downloadApplicationCode);
    }

    /**
     * Devstar 模板生成代码
     * 通过DevStar的模板进行应用代码创建  通过 DevStar 模板创建生成应用代码的任务，并将应用代码存储于指定的 CodeHub 仓库中，可以通过返回的任务 ID 查询相关任务状态  - 接口鉴权方式 通过华为云服务获取的用户token  - 代码生成位置 应用代码生成后的地址，目前支持codehub地址和压缩包下载地址。
     *
     * @param RunDevstarTemplateJobRequest 请求对象
     * @return CompletableFuture<RunDevstarTemplateJobResponse>
     */
    public CompletableFuture<RunDevstarTemplateJobResponse> runDevstarTemplateJobAsync(RunDevstarTemplateJobRequest request) {
        return hcClient.asyncInvokeHttp(request, DevStarMeta.runDevstarTemplateJob);
    }

    /**
     * 查询任务详情
     * 查询任务的详情  通过任务ID可以查看任务的状态 当任务结束时返回应用代码存放的位置  - 接口鉴权方式 通过华为云服务获取的用户token  - 代码生成位置 应用代码生成后的地址，目前支持codehub地址和压缩包下载地址
     *
     * @param ShowJobDetailRequest 请求对象
     * @return CompletableFuture<ShowJobDetailResponse>
     */
    public CompletableFuture<ShowJobDetailResponse> showJobDetailAsync(ShowJobDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, DevStarMeta.showJobDetail);
    }

    /**
     * 查询模板列表
     * 查询模板列表
     *
     * @param ListPublishedTemplatesRequest 请求对象
     * @return CompletableFuture<ListPublishedTemplatesResponse>
     */
    public CompletableFuture<ListPublishedTemplatesResponse> listPublishedTemplatesAsync(ListPublishedTemplatesRequest request) {
        return hcClient.asyncInvokeHttp(request, DevStarMeta.listPublishedTemplates);
    }

    /**
     * 查询模板详情
     * 查询模板详情
     *
     * @param ShowTemplateDetailRequest 请求对象
     * @return CompletableFuture<ShowTemplateDetailResponse>
     */
    public CompletableFuture<ShowTemplateDetailResponse> showTemplateDetailAsync(ShowTemplateDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, DevStarMeta.showTemplateDetail);
    }

}