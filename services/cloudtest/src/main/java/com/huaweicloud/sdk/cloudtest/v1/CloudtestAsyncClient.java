package com.huaweicloud.sdk.cloudtest.v1;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

import com.huaweicloud.sdk.cloudtest.v1.model.*;

public class CloudtestAsyncClient {
    protected HcClient hcClient;

    public CloudtestAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<CloudtestAsyncClient> newBuilder() {
        return new ClientBuilder<>(CloudtestAsyncClient::new);
    }


    /**
     * 项目下创建计划
     * 项目下创建计划
     *
     * @param CreatePlanRequest 请求对象
     * @return CompletableFuture<CreatePlanResponse>
     */
    public CompletableFuture<CreatePlanResponse> createPlanAsync(CreatePlanRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.createPlan);
    }

    /**
     * 计划中批量添加测试用例
     * 计划中批量添加测试用例
     *
     * @param CreateTestCaseInPlanRequest 请求对象
     * @return CompletableFuture<CreateTestCaseInPlanResponse>
     */
    public CompletableFuture<CreateTestCaseInPlanResponse> createTestCaseInPlanAsync(CreateTestCaseInPlanRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.createTestCaseInPlan);
    }

    /**
     * 新测试类型服务注册到云测
     * 新测试类型服务注册到云测
     *
     * @param CreateServiceRequest 请求对象
     * @return CompletableFuture<CreateServiceResponse>
     */
    public CompletableFuture<CreateServiceResponse> createServiceAsync(CreateServiceRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.createService);
    }

    /**
     * 删除已注册服务
     * 删除已注册服务
     *
     * @param DeleteServiceRequest 请求对象
     * @return CompletableFuture<DeleteServiceResponse>
     */
    public CompletableFuture<DeleteServiceResponse> deleteServiceAsync(DeleteServiceRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.deleteService);
    }

    /**
     * 用户获取自己当前已经注册的服务
     * 用户获取自己当前已经注册的服务
     *
     * @param ShowRegisterServiceRequest 请求对象
     * @return CompletableFuture<ShowRegisterServiceResponse>
     */
    public CompletableFuture<ShowRegisterServiceResponse> showRegisterServiceAsync(ShowRegisterServiceRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.showRegisterService);
    }

    /**
     * 更新已注册服务
     * 更新已注册服务
     *
     * @param UpdateServiceRequest 请求对象
     * @return CompletableFuture<UpdateServiceResponse>
     */
    public CompletableFuture<UpdateServiceResponse> updateServiceAsync(UpdateServiceRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.updateService);
    }

    /**
     * 批量删除测试用例
     * 批量删除测试用例
     *
     * @param BatchDeleteTestCaseRequest 请求对象
     * @return CompletableFuture<BatchDeleteTestCaseResponse>
     */
    public CompletableFuture<BatchDeleteTestCaseResponse> batchDeleteTestCaseAsync(BatchDeleteTestCaseRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.batchDeleteTestCase);
    }

    /**
     * 创建测试用例
     * 创建测试用例
     *
     * @param CreateTestCaseRequest 请求对象
     * @return CompletableFuture<CreateTestCaseResponse>
     */
    public CompletableFuture<CreateTestCaseResponse> createTestCaseAsync(CreateTestCaseRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.createTestCase);
    }

    /**
     * 批量执行测试用例
     * 批量执行测试用例
     *
     * @param RunTestCaseRequest 请求对象
     * @return CompletableFuture<RunTestCaseResponse>
     */
    public CompletableFuture<RunTestCaseResponse> runTestCaseAsync(RunTestCaseRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.runTestCase);
    }

    /**
     * 获取测试用例详情
     * 获取测试用例详情
     *
     * @param ShowTestCaseDetailRequest 请求对象
     * @return CompletableFuture<ShowTestCaseDetailResponse>
     */
    public CompletableFuture<ShowTestCaseDetailResponse> showTestCaseDetailAsync(ShowTestCaseDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.showTestCaseDetail);
    }

    /**
     * 通过用例编号或用例ID获取测试用例详情
     * 通过用例编号或用例ID获取测试用例详情
     *
     * @param ShowTestCaseDetailV2Request 请求对象
     * @return CompletableFuture<ShowTestCaseDetailV2Response>
     */
    public CompletableFuture<ShowTestCaseDetailV2Response> showTestCaseDetailV2Async(ShowTestCaseDetailV2Request request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.showTestCaseDetailV2);
    }

    /**
     * 更新测试用例接口
     * 更新测试用例接口
     *
     * @param UpdateTestCaseRequest 请求对象
     * @return CompletableFuture<UpdateTestCaseResponse>
     */
    public CompletableFuture<UpdateTestCaseResponse> updateTestCaseAsync(UpdateTestCaseRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.updateTestCase);
    }

    /**
     * 批量更新测试用例结果
     * 批量更新测试用例结果
     *
     * @param UpdateTestCaseResultRequest 请求对象
     * @return CompletableFuture<UpdateTestCaseResultResponse>
     */
    public CompletableFuture<UpdateTestCaseResultResponse> updateTestCaseResultAsync(UpdateTestCaseResultRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.updateTestCaseResult);
    }

}