package com.huaweicloud.sdk.cloudtest.v1;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.cloudtest.v1.model.*;

public class CloudtestClient {
    protected HcClient hcClient;

    public CloudtestClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<CloudtestClient> newBuilder() {
        return new ClientBuilder<>(CloudtestClient::new);
    }


    /**
     * 项目下创建计划
     * 项目下创建计划
     *
     * @param CreatePlanRequest 请求对象
     * @return CreatePlanResponse
     */
    public CreatePlanResponse createPlan(CreatePlanRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.createPlan);
    }

    /**
     * 计划中批量添加测试用例
     * 计划中批量添加测试用例
     *
     * @param CreateTestCaseInPlanRequest 请求对象
     * @return CreateTestCaseInPlanResponse
     */
    public CreateTestCaseInPlanResponse createTestCaseInPlan(CreateTestCaseInPlanRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.createTestCaseInPlan);
    }

    /**
     * 新测试类型服务注册到云测
     * 新测试类型服务注册到云测
     *
     * @param CreateServiceRequest 请求对象
     * @return CreateServiceResponse
     */
    public CreateServiceResponse createService(CreateServiceRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.createService);
    }

    /**
     * 删除已注册服务
     * 删除已注册服务
     *
     * @param DeleteServiceRequest 请求对象
     * @return DeleteServiceResponse
     */
    public DeleteServiceResponse deleteService(DeleteServiceRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.deleteService);
    }

    /**
     * 用户获取自己当前已经注册的服务
     * 用户获取自己当前已经注册的服务
     *
     * @param ShowRegisterServiceRequest 请求对象
     * @return ShowRegisterServiceResponse
     */
    public ShowRegisterServiceResponse showRegisterService(ShowRegisterServiceRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.showRegisterService);
    }

    /**
     * 更新已注册服务
     * 更新已注册服务
     *
     * @param UpdateServiceRequest 请求对象
     * @return UpdateServiceResponse
     */
    public UpdateServiceResponse updateService(UpdateServiceRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.updateService);
    }

    /**
     * 批量删除测试用例
     * 批量删除测试用例
     *
     * @param BatchDeleteTestCaseRequest 请求对象
     * @return BatchDeleteTestCaseResponse
     */
    public BatchDeleteTestCaseResponse batchDeleteTestCase(BatchDeleteTestCaseRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.batchDeleteTestCase);
    }

    /**
     * 创建测试用例
     * 创建测试用例
     *
     * @param CreateTestCaseRequest 请求对象
     * @return CreateTestCaseResponse
     */
    public CreateTestCaseResponse createTestCase(CreateTestCaseRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.createTestCase);
    }

    /**
     * 批量执行测试用例
     * 批量执行测试用例
     *
     * @param RunTestCaseRequest 请求对象
     * @return RunTestCaseResponse
     */
    public RunTestCaseResponse runTestCase(RunTestCaseRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.runTestCase);
    }

    /**
     * 获取测试用例详情
     * 获取测试用例详情
     *
     * @param ShowTestCaseDetailRequest 请求对象
     * @return ShowTestCaseDetailResponse
     */
    public ShowTestCaseDetailResponse showTestCaseDetail(ShowTestCaseDetailRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.showTestCaseDetail);
    }

    /**
     * 通过用例编号或用例ID获取测试用例详情
     * 通过用例编号或用例ID获取测试用例详情
     *
     * @param ShowTestCaseDetailV2Request 请求对象
     * @return ShowTestCaseDetailV2Response
     */
    public ShowTestCaseDetailV2Response showTestCaseDetailV2(ShowTestCaseDetailV2Request request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.showTestCaseDetailV2);
    }

    /**
     * 更新测试用例接口
     * 更新测试用例接口
     *
     * @param UpdateTestCaseRequest 请求对象
     * @return UpdateTestCaseResponse
     */
    public UpdateTestCaseResponse updateTestCase(UpdateTestCaseRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.updateTestCase);
    }

    /**
     * 批量更新测试用例结果
     * 批量更新测试用例结果
     *
     * @param UpdateTestCaseResultRequest 请求对象
     * @return UpdateTestCaseResultResponse
     */
    public UpdateTestCaseResultResponse updateTestCaseResult(UpdateTestCaseResultRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.updateTestCaseResult);
    }

}