package com.huaweicloud.sdk.devstar.v1;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.devstar.v1.model.*;

public class DevstarClient {
    protected HcClient hcClient;

    public DevstarClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<DevstarClient> newBuilder() {
        return new ClientBuilder<>(DevstarClient::new);
    }


    /**
     * 下载模板产物
     * 下载模板产物
     *
     * @param DownloadApplicationCodeRequest 请求对象
     * @return DownloadApplicationCodeResponse
    */
    public DownloadApplicationCodeResponse downloadApplicationCode(DownloadApplicationCodeRequest request) {
        return hcClient.syncInvokeHttp(request, DevstarMeta.downloadApplicationCode);
    }

    /**
     * Devstar 模板生成代码
     * 通过DevStar的模板进行应用代码创建  通过 DevStar 模板创建生成应用代码的任务，并将应用代码存储于指定的 CodeHub 仓库中，可以通过返回的任务 ID 查询相关任务状态  - 接口鉴权方式 通过华为云服务获取的用户token  - 代码生成位置 应用代码生成后的地址，目前支持codehub地址和压缩包下载地址。
     *
     * @param RunDevstarTemplateJobRequest 请求对象
     * @return RunDevstarTemplateJobResponse
    */
    public RunDevstarTemplateJobResponse runDevstarTemplateJob(RunDevstarTemplateJobRequest request) {
        return hcClient.syncInvokeHttp(request, DevstarMeta.runDevstarTemplateJob);
    }

    /**
     * 查询任务详情
     * 查询任务的详情  通过任务ID可以查看任务的状态 当任务结束时返回应用代码存放的位置  - 接口鉴权方式 通过华为云服务获取的用户token  - 代码生成位置 应用代码生成后的地址，目前支持codehub地址和压缩包下载地址
     *
     * @param ShowJobDetailRequest 请求对象
     * @return ShowJobDetailResponse
    */
    public ShowJobDetailResponse showJobDetail(ShowJobDetailRequest request) {
        return hcClient.syncInvokeHttp(request, DevstarMeta.showJobDetail);
    }

    /**
     * 查询模板列表
     * 查询模板列表
     *
     * @param ListPublishedTemplatesRequest 请求对象
     * @return ListPublishedTemplatesResponse
    */
    public ListPublishedTemplatesResponse listPublishedTemplates(ListPublishedTemplatesRequest request) {
        return hcClient.syncInvokeHttp(request, DevstarMeta.listPublishedTemplates);
    }

    /**
     * 查询模板详情
     * 查询模板详情
     *
     * @param ShowTemplateDetailRequest 请求对象
     * @return ShowTemplateDetailResponse
    */
    public ShowTemplateDetailResponse showTemplateDetail(ShowTemplateDetailRequest request) {
        return hcClient.syncInvokeHttp(request, DevstarMeta.showTemplateDetail);
    }

}