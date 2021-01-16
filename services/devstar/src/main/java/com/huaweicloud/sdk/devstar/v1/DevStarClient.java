package com.huaweicloud.sdk.devstar.v1;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.devstar.v1.model.*;

public class DevStarClient {
    protected HcClient hcClient;

    public DevStarClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<DevStarClient> newBuilder() {
        return new ClientBuilder<>(DevStarClient::new, "GlobalCredentials");
    }


    /**
     * 下载代码工程
     * 通过任务ID下载ZIP格式的代码工程。
     *
     * @param DownloadApplicationCodeRequest 请求对象
     * @return DownloadApplicationCodeResponse
     */
    public DownloadApplicationCodeResponse downloadApplicationCode(DownloadApplicationCodeRequest request) {
        return hcClient.syncInvokeHttp(request, DevStarMeta.downloadApplicationCode);
    }

    /**
     * CodeHub 模板生成代码
     * 通过 Codehub 的模板进行应用代码创建  通过 Codehub 模板创建生成应用代码的任务，并将应用代码存储于指定的 CodeHub 仓库中或者生成代码压缩包，可以通过返回的任务 ID 查询相关任务状态  - 接口鉴权方式 通过华为云服务获取的用户token  - 代码生成位置 应用代码生成后的地址，目前支持codehub地址和压缩包下载地址。
     *
     * @param RunCodehubTemplateJobRequest 请求对象
     * @return RunCodehubTemplateJobResponse
     */
    public RunCodehubTemplateJobResponse runCodehubTemplateJob(RunCodehubTemplateJobRequest request) {
        return hcClient.syncInvokeHttp(request, DevStarMeta.runCodehubTemplateJob);
    }

    /**
     * Devstar 模板生成代码
     * 通过DevStar的模板进行应用代码创建  通过 DevStar 模板创建生成应用代码的任务，并将应用代码存储于指定的 CodeHub 仓库中，可以通过返回的任务 ID 查询相关任务状态  - 接口鉴权方式 通过华为云服务获取的用户token  - 代码生成位置 应用代码生成后的地址，目前支持codehub地址和压缩包下载地址。
     *
     * @param RunDevstarTemplateJobRequest 请求对象
     * @return RunDevstarTemplateJobResponse
     */
    public RunDevstarTemplateJobResponse runDevstarTemplateJob(RunDevstarTemplateJobRequest request) {
        return hcClient.syncInvokeHttp(request, DevStarMeta.runDevstarTemplateJob);
    }

    /**
     * 查询任务详情
     * 查询任务的详情  通过任务ID可以查看任务的状态 当任务结束时返回应用代码存放的位置  - 接口鉴权方式 通过华为云服务获取的用户token  - 代码生成位置 应用代码生成后的地址，目前支持codehub地址和压缩包下载地址
     *
     * @param ShowJobDetailRequest 请求对象
     * @return ShowJobDetailResponse
     */
    public ShowJobDetailResponse showJobDetail(ShowJobDetailRequest request) {
        return hcClient.syncInvokeHttp(request, DevStarMeta.showJobDetail);
    }

    /**
     * 读取模板文件
     * 读取模板文件
     *
     * @param ShowTemplateFileRequest 请求对象
     * @return ShowTemplateFileResponse
     */
    public ShowTemplateFileResponse showTemplateFile(ShowTemplateFileRequest request) {
        return hcClient.syncInvokeHttp(request, DevStarMeta.showTemplateFile);
    }

    /**
     * 生成模板浏览历史记录
     * 生成模板浏览记录 
     *
     * @param CreateTemplateViewHistoriesRequest 请求对象
     * @return CreateTemplateViewHistoriesResponse
     */
    public CreateTemplateViewHistoriesResponse createTemplateViewHistories(CreateTemplateViewHistoriesRequest request) {
        return hcClient.syncInvokeHttp(request, DevStarMeta.createTemplateViewHistories);
    }

    /**
     * 查询模板列表
     * 查询模板列表
     *
     * @param ListPublishedTemplatesRequest 请求对象
     * @return ListPublishedTemplatesResponse
     */
    public ListPublishedTemplatesResponse listPublishedTemplates(ListPublishedTemplatesRequest request) {
        return hcClient.syncInvokeHttp(request, DevStarMeta.listPublishedTemplates);
    }

    /**
     * 我浏览的模板记录
     * 查询用户浏览过的模板(只返回最近浏览的5个模板) 
     *
     * @param ListTemplateViewHistoriesRequest 请求对象
     * @return ListTemplateViewHistoriesResponse
     */
    public ListTemplateViewHistoriesResponse listTemplateViewHistories(ListTemplateViewHistoriesRequest request) {
        return hcClient.syncInvokeHttp(request, DevStarMeta.listTemplateViewHistories);
    }

    /**
     * 查询模板列表
     * 查询模板列表
     *
     * @param ListTemplatesV2Request 请求对象
     * @return ListTemplatesV2Response
     */
    public ListTemplatesV2Response listTemplatesV2(ListTemplatesV2Request request) {
        return hcClient.syncInvokeHttp(request, DevStarMeta.listTemplatesV2);
    }

    /**
     * 模板详情
     * 获取模板详情-模板id、名称、描述、作者、标签、上架时间等信息。 
     *
     * @param ShowTemplateV3Request 请求对象
     * @return ShowTemplateV3Response
     */
    public ShowTemplateV3Response showTemplateV3(ShowTemplateV3Request request) {
        return hcClient.syncInvokeHttp(request, DevStarMeta.showTemplateV3);
    }

    /**
     * 查询模板详情
     * 查询模板详情
     *
     * @param ShowTemplateDetailRequest 请求对象
     * @return ShowTemplateDetailResponse
     */
    public ShowTemplateDetailResponse showTemplateDetail(ShowTemplateDetailRequest request) {
        return hcClient.syncInvokeHttp(request, DevStarMeta.showTemplateDetail);
    }

}