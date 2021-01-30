package com.huaweicloud.sdk.cloudtest.v1;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
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
     * 项目下创建计划
     * 项目下创建计划
     *
     * @param CreatePlanRequest 请求对象
     * @return AsyncInvoker<CreatePlanRequest, CreatePlanResponse>
     */
    public AsyncInvoker<CreatePlanRequest, CreatePlanResponse> createPlanAsyncInvoker(CreatePlanRequest request) {
        return new AsyncInvoker<CreatePlanRequest, CreatePlanResponse>(request, CloudtestMeta.createPlan, hcClient);
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
     * 计划中批量添加测试用例
     * 计划中批量添加测试用例
     *
     * @param CreateTestCaseInPlanRequest 请求对象
     * @return AsyncInvoker<CreateTestCaseInPlanRequest, CreateTestCaseInPlanResponse>
     */
    public AsyncInvoker<CreateTestCaseInPlanRequest, CreateTestCaseInPlanResponse> createTestCaseInPlanAsyncInvoker(CreateTestCaseInPlanRequest request) {
        return new AsyncInvoker<CreateTestCaseInPlanRequest, CreateTestCaseInPlanResponse>(request, CloudtestMeta.createTestCaseInPlan, hcClient);
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
     * 新测试类型服务注册到云测
     * 新测试类型服务注册到云测
     *
     * @param CreateServiceRequest 请求对象
     * @return AsyncInvoker<CreateServiceRequest, CreateServiceResponse>
     */
    public AsyncInvoker<CreateServiceRequest, CreateServiceResponse> createServiceAsyncInvoker(CreateServiceRequest request) {
        return new AsyncInvoker<CreateServiceRequest, CreateServiceResponse>(request, CloudtestMeta.createService, hcClient);
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
     * 删除已注册服务
     * 删除已注册服务
     *
     * @param DeleteServiceRequest 请求对象
     * @return AsyncInvoker<DeleteServiceRequest, DeleteServiceResponse>
     */
    public AsyncInvoker<DeleteServiceRequest, DeleteServiceResponse> deleteServiceAsyncInvoker(DeleteServiceRequest request) {
        return new AsyncInvoker<DeleteServiceRequest, DeleteServiceResponse>(request, CloudtestMeta.deleteService, hcClient);
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
     * 用户获取自己当前已经注册的服务
     * 用户获取自己当前已经注册的服务
     *
     * @param ShowRegisterServiceRequest 请求对象
     * @return AsyncInvoker<ShowRegisterServiceRequest, ShowRegisterServiceResponse>
     */
    public AsyncInvoker<ShowRegisterServiceRequest, ShowRegisterServiceResponse> showRegisterServiceAsyncInvoker(ShowRegisterServiceRequest request) {
        return new AsyncInvoker<ShowRegisterServiceRequest, ShowRegisterServiceResponse>(request, CloudtestMeta.showRegisterService, hcClient);
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
     * 更新已注册服务
     * 更新已注册服务
     *
     * @param UpdateServiceRequest 请求对象
     * @return AsyncInvoker<UpdateServiceRequest, UpdateServiceResponse>
     */
    public AsyncInvoker<UpdateServiceRequest, UpdateServiceResponse> updateServiceAsyncInvoker(UpdateServiceRequest request) {
        return new AsyncInvoker<UpdateServiceRequest, UpdateServiceResponse>(request, CloudtestMeta.updateService, hcClient);
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
     * 批量删除测试用例
     * 批量删除测试用例
     *
     * @param BatchDeleteTestCaseRequest 请求对象
     * @return AsyncInvoker<BatchDeleteTestCaseRequest, BatchDeleteTestCaseResponse>
     */
    public AsyncInvoker<BatchDeleteTestCaseRequest, BatchDeleteTestCaseResponse> batchDeleteTestCaseAsyncInvoker(BatchDeleteTestCaseRequest request) {
        return new AsyncInvoker<BatchDeleteTestCaseRequest, BatchDeleteTestCaseResponse>(request, CloudtestMeta.batchDeleteTestCase, hcClient);
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
     * 创建测试用例
     * 创建测试用例
     *
     * @param CreateTestCaseRequest 请求对象
     * @return AsyncInvoker<CreateTestCaseRequest, CreateTestCaseResponse>
     */
    public AsyncInvoker<CreateTestCaseRequest, CreateTestCaseResponse> createTestCaseAsyncInvoker(CreateTestCaseRequest request) {
        return new AsyncInvoker<CreateTestCaseRequest, CreateTestCaseResponse>(request, CloudtestMeta.createTestCase, hcClient);
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
     * 批量执行测试用例
     * 批量执行测试用例
     *
     * @param RunTestCaseRequest 请求对象
     * @return AsyncInvoker<RunTestCaseRequest, RunTestCaseResponse>
     */
    public AsyncInvoker<RunTestCaseRequest, RunTestCaseResponse> runTestCaseAsyncInvoker(RunTestCaseRequest request) {
        return new AsyncInvoker<RunTestCaseRequest, RunTestCaseResponse>(request, CloudtestMeta.runTestCase, hcClient);
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
     * 获取测试用例详情
     * 获取测试用例详情
     *
     * @param ShowTestCaseDetailRequest 请求对象
     * @return AsyncInvoker<ShowTestCaseDetailRequest, ShowTestCaseDetailResponse>
     */
    public AsyncInvoker<ShowTestCaseDetailRequest, ShowTestCaseDetailResponse> showTestCaseDetailAsyncInvoker(ShowTestCaseDetailRequest request) {
        return new AsyncInvoker<ShowTestCaseDetailRequest, ShowTestCaseDetailResponse>(request, CloudtestMeta.showTestCaseDetail, hcClient);
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
     * 通过用例编号或用例ID获取测试用例详情
     * 通过用例编号或用例ID获取测试用例详情
     *
     * @param ShowTestCaseDetailV2Request 请求对象
     * @return AsyncInvoker<ShowTestCaseDetailV2Request, ShowTestCaseDetailV2Response>
     */
    public AsyncInvoker<ShowTestCaseDetailV2Request, ShowTestCaseDetailV2Response> showTestCaseDetailV2AsyncInvoker(ShowTestCaseDetailV2Request request) {
        return new AsyncInvoker<ShowTestCaseDetailV2Request, ShowTestCaseDetailV2Response>(request, CloudtestMeta.showTestCaseDetailV2, hcClient);
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
     * 更新测试用例接口
     * 更新测试用例接口
     *
     * @param UpdateTestCaseRequest 请求对象
     * @return AsyncInvoker<UpdateTestCaseRequest, UpdateTestCaseResponse>
     */
    public AsyncInvoker<UpdateTestCaseRequest, UpdateTestCaseResponse> updateTestCaseAsyncInvoker(UpdateTestCaseRequest request) {
        return new AsyncInvoker<UpdateTestCaseRequest, UpdateTestCaseResponse>(request, CloudtestMeta.updateTestCase, hcClient);
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

    /**
     * 批量更新测试用例结果
     * 批量更新测试用例结果
     *
     * @param UpdateTestCaseResultRequest 请求对象
     * @return AsyncInvoker<UpdateTestCaseResultRequest, UpdateTestCaseResultResponse>
     */
    public AsyncInvoker<UpdateTestCaseResultRequest, UpdateTestCaseResultResponse> updateTestCaseResultAsyncInvoker(UpdateTestCaseResultRequest request) {
        return new AsyncInvoker<UpdateTestCaseResultRequest, UpdateTestCaseResultResponse>(request, CloudtestMeta.updateTestCaseResult, hcClient);
    }

}