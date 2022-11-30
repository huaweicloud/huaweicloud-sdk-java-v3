package com.huaweicloud.sdk.codecraft.v5;

import com.huaweicloud.sdk.codecraft.v5.model.*;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;

import java.util.concurrent.CompletableFuture;

public class CodeCraftAsyncClient {

    protected HcClient hcClient;

    public CodeCraftAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<CodeCraftAsyncClient> newBuilder() {
        return new ClientBuilder<>(CodeCraftAsyncClient::new, "GlobalCredentials");
    }

    /**
     * 登记第三方提交的作品信息（得分回调）
     *
     * 针对在第三方提交作品的场景：第三方服务对作品完成判分后，调用该接口将作品信息及作品得分返回给大赛平台
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateCompetitionScoreRequest 请求对象
     * @return CompletableFuture<CreateCompetitionScoreResponse>
     */
    public CompletableFuture<CreateCompetitionScoreResponse> createCompetitionScoreAsync(
        CreateCompetitionScoreRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeCraftMeta.createCompetitionScore);
    }

    /**
     * 登记第三方提交的作品信息（得分回调）
     *
     * 针对在第三方提交作品的场景：第三方服务对作品完成判分后，调用该接口将作品信息及作品得分返回给大赛平台
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateCompetitionScoreRequest 请求对象
     * @return AsyncInvoker<CreateCompetitionScoreRequest, CreateCompetitionScoreResponse>
     */
    public AsyncInvoker<CreateCompetitionScoreRequest, CreateCompetitionScoreResponse> createCompetitionScoreAsyncInvoker(
        CreateCompetitionScoreRequest request) {
        return new AsyncInvoker<CreateCompetitionScoreRequest, CreateCompetitionScoreResponse>(request,
            CodeCraftMeta.createCompetitionScore, hcClient);
    }

    /**
     * 获取指定时间内选手提交的作品
     *
     * 第三方服务获取某个大赛某个阶段中一段时间内提交的作品信息。其中以请求参数read_time作为结束时间，定义向前一天或一小时内的时间作为查询范围
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListCompetitionWorksRequest 请求对象
     * @return CompletableFuture<ListCompetitionWorksResponse>
     */
    public CompletableFuture<ListCompetitionWorksResponse> listCompetitionWorksAsync(
        ListCompetitionWorksRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeCraftMeta.listCompetitionWorks);
    }

    /**
     * 获取指定时间内选手提交的作品
     *
     * 第三方服务获取某个大赛某个阶段中一段时间内提交的作品信息。其中以请求参数read_time作为结束时间，定义向前一天或一小时内的时间作为查询范围
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListCompetitionWorksRequest 请求对象
     * @return AsyncInvoker<ListCompetitionWorksRequest, ListCompetitionWorksResponse>
     */
    public AsyncInvoker<ListCompetitionWorksRequest, ListCompetitionWorksResponse> listCompetitionWorksAsyncInvoker(
        ListCompetitionWorksRequest request) {
        return new AsyncInvoker<ListCompetitionWorksRequest, ListCompetitionWorksResponse>(request,
            CodeCraftMeta.listCompetitionWorks, hcClient);
    }

    /**
     * 验证用户报名信息和团队信息
     *
     * 第三方服务验证用户是否在大赛平台报名、是否组建团队、是否可以提交作品。如果已经报名但是未组建团队，则创建一个虚拟团队，设置为允许提交作品。如果已经组建团队则根据大赛报名截止时间判断是否可以提交作品。返回团队ID、是否可以提交作品
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RegisterCompetitionInfoRequest 请求对象
     * @return CompletableFuture<RegisterCompetitionInfoResponse>
     */
    public CompletableFuture<RegisterCompetitionInfoResponse> registerCompetitionInfoAsync(
        RegisterCompetitionInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeCraftMeta.registerCompetitionInfo);
    }

    /**
     * 验证用户报名信息和团队信息
     *
     * 第三方服务验证用户是否在大赛平台报名、是否组建团队、是否可以提交作品。如果已经报名但是未组建团队，则创建一个虚拟团队，设置为允许提交作品。如果已经组建团队则根据大赛报名截止时间判断是否可以提交作品。返回团队ID、是否可以提交作品
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RegisterCompetitionInfoRequest 请求对象
     * @return AsyncInvoker<RegisterCompetitionInfoRequest, RegisterCompetitionInfoResponse>
     */
    public AsyncInvoker<RegisterCompetitionInfoRequest, RegisterCompetitionInfoResponse> registerCompetitionInfoAsyncInvoker(
        RegisterCompetitionInfoRequest request) {
        return new AsyncInvoker<RegisterCompetitionInfoRequest, RegisterCompetitionInfoResponse>(request,
            CodeCraftMeta.registerCompetitionInfo, hcClient);
    }

    /**
     * 修改平台提交的作品分数（得分回调）
     *
     * 针对在大赛平台提交作品的场景：第三方服务对作品完成判分后，根据作品ID调用该接口将作品分数、作品状态等信息返回给大赛平台
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateCompetitionScoreRequest 请求对象
     * @return CompletableFuture<UpdateCompetitionScoreResponse>
     */
    public CompletableFuture<UpdateCompetitionScoreResponse> updateCompetitionScoreAsync(
        UpdateCompetitionScoreRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeCraftMeta.updateCompetitionScore);
    }

    /**
     * 修改平台提交的作品分数（得分回调）
     *
     * 针对在大赛平台提交作品的场景：第三方服务对作品完成判分后，根据作品ID调用该接口将作品分数、作品状态等信息返回给大赛平台
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateCompetitionScoreRequest 请求对象
     * @return AsyncInvoker<UpdateCompetitionScoreRequest, UpdateCompetitionScoreResponse>
     */
    public AsyncInvoker<UpdateCompetitionScoreRequest, UpdateCompetitionScoreResponse> updateCompetitionScoreAsyncInvoker(
        UpdateCompetitionScoreRequest request) {
        return new AsyncInvoker<UpdateCompetitionScoreRequest, UpdateCompetitionScoreResponse>(request,
            CodeCraftMeta.updateCompetitionScore, hcClient);
    }

}
