package com.huaweicloud.sdk.cloudtest.v1;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
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
     * 通过导入仓库中的文件生成接口测试套
     * 通过导入仓库中的文件生成接口测试套
     *
     * @param CreateApiTestSuiteByRepoFileRequest 请求对象
     * @return CreateApiTestSuiteByRepoFileResponse
     */
    public CreateApiTestSuiteByRepoFileResponse createApiTestSuiteByRepoFile(CreateApiTestSuiteByRepoFileRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.createApiTestSuiteByRepoFile);
    }

    /**
     * 通过导入仓库中的文件生成接口测试套
     * 通过导入仓库中的文件生成接口测试套
     *
     * @param CreateApiTestSuiteByRepoFileRequest 请求对象
     * @return SyncInvoker<CreateApiTestSuiteByRepoFileRequest, CreateApiTestSuiteByRepoFileResponse>
     */
    public SyncInvoker<CreateApiTestSuiteByRepoFileRequest, CreateApiTestSuiteByRepoFileResponse> createApiTestSuiteByRepoFileInvoker(CreateApiTestSuiteByRepoFileRequest request) {
        return new SyncInvoker<CreateApiTestSuiteByRepoFileRequest, CreateApiTestSuiteByRepoFileResponse>(request, CloudtestMeta.createApiTestSuiteByRepoFile, hcClient);
    }

    /**
     * 获取云测的环境参数分组列表
     * 获取云测的环境参数分组列表
     *
     * @param ListEnvironmentsRequest 请求对象
     * @return ListEnvironmentsResponse
     */
    public ListEnvironmentsResponse listEnvironments(ListEnvironmentsRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.listEnvironments);
    }

    /**
     * 获取云测的环境参数分组列表
     * 获取云测的环境参数分组列表
     *
     * @param ListEnvironmentsRequest 请求对象
     * @return SyncInvoker<ListEnvironmentsRequest, ListEnvironmentsResponse>
     */
    public SyncInvoker<ListEnvironmentsRequest, ListEnvironmentsResponse> listEnvironmentsInvoker(ListEnvironmentsRequest request) {
        return new SyncInvoker<ListEnvironmentsRequest, ListEnvironmentsResponse>(request, CloudtestMeta.listEnvironments, hcClient);
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
     * 项目下创建计划
     * 项目下创建计划
     *
     * @param CreatePlanRequest 请求对象
     * @return SyncInvoker<CreatePlanRequest, CreatePlanResponse>
     */
    public SyncInvoker<CreatePlanRequest, CreatePlanResponse> createPlanInvoker(CreatePlanRequest request) {
        return new SyncInvoker<CreatePlanRequest, CreatePlanResponse>(request, CloudtestMeta.createPlan, hcClient);
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
     * 计划中批量添加测试用例
     * 计划中批量添加测试用例
     *
     * @param CreateTestCaseInPlanRequest 请求对象
     * @return SyncInvoker<CreateTestCaseInPlanRequest, CreateTestCaseInPlanResponse>
     */
    public SyncInvoker<CreateTestCaseInPlanRequest, CreateTestCaseInPlanResponse> createTestCaseInPlanInvoker(CreateTestCaseInPlanRequest request) {
        return new SyncInvoker<CreateTestCaseInPlanRequest, CreateTestCaseInPlanResponse>(request, CloudtestMeta.createTestCaseInPlan, hcClient);
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
     * 新测试类型服务注册到云测
     * 新测试类型服务注册到云测
     *
     * @param CreateServiceRequest 请求对象
     * @return SyncInvoker<CreateServiceRequest, CreateServiceResponse>
     */
    public SyncInvoker<CreateServiceRequest, CreateServiceResponse> createServiceInvoker(CreateServiceRequest request) {
        return new SyncInvoker<CreateServiceRequest, CreateServiceResponse>(request, CloudtestMeta.createService, hcClient);
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
     * 删除已注册服务
     * 删除已注册服务
     *
     * @param DeleteServiceRequest 请求对象
     * @return SyncInvoker<DeleteServiceRequest, DeleteServiceResponse>
     */
    public SyncInvoker<DeleteServiceRequest, DeleteServiceResponse> deleteServiceInvoker(DeleteServiceRequest request) {
        return new SyncInvoker<DeleteServiceRequest, DeleteServiceResponse>(request, CloudtestMeta.deleteService, hcClient);
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
     * 用户获取自己当前已经注册的服务
     * 用户获取自己当前已经注册的服务
     *
     * @param ShowRegisterServiceRequest 请求对象
     * @return SyncInvoker<ShowRegisterServiceRequest, ShowRegisterServiceResponse>
     */
    public SyncInvoker<ShowRegisterServiceRequest, ShowRegisterServiceResponse> showRegisterServiceInvoker(ShowRegisterServiceRequest request) {
        return new SyncInvoker<ShowRegisterServiceRequest, ShowRegisterServiceResponse>(request, CloudtestMeta.showRegisterService, hcClient);
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
     * 更新已注册服务
     * 更新已注册服务
     *
     * @param UpdateServiceRequest 请求对象
     * @return SyncInvoker<UpdateServiceRequest, UpdateServiceResponse>
     */
    public SyncInvoker<UpdateServiceRequest, UpdateServiceResponse> updateServiceInvoker(UpdateServiceRequest request) {
        return new SyncInvoker<UpdateServiceRequest, UpdateServiceResponse>(request, CloudtestMeta.updateService, hcClient);
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
     * 批量删除测试用例
     * 批量删除测试用例
     *
     * @param BatchDeleteTestCaseRequest 请求对象
     * @return SyncInvoker<BatchDeleteTestCaseRequest, BatchDeleteTestCaseResponse>
     */
    public SyncInvoker<BatchDeleteTestCaseRequest, BatchDeleteTestCaseResponse> batchDeleteTestCaseInvoker(BatchDeleteTestCaseRequest request) {
        return new SyncInvoker<BatchDeleteTestCaseRequest, BatchDeleteTestCaseResponse>(request, CloudtestMeta.batchDeleteTestCase, hcClient);
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
     * 创建测试用例
     * 创建测试用例
     *
     * @param CreateTestCaseRequest 请求对象
     * @return SyncInvoker<CreateTestCaseRequest, CreateTestCaseResponse>
     */
    public SyncInvoker<CreateTestCaseRequest, CreateTestCaseResponse> createTestCaseInvoker(CreateTestCaseRequest request) {
        return new SyncInvoker<CreateTestCaseRequest, CreateTestCaseResponse>(request, CloudtestMeta.createTestCase, hcClient);
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
     * 批量执行测试用例
     * 批量执行测试用例
     *
     * @param RunTestCaseRequest 请求对象
     * @return SyncInvoker<RunTestCaseRequest, RunTestCaseResponse>
     */
    public SyncInvoker<RunTestCaseRequest, RunTestCaseResponse> runTestCaseInvoker(RunTestCaseRequest request) {
        return new SyncInvoker<RunTestCaseRequest, RunTestCaseResponse>(request, CloudtestMeta.runTestCase, hcClient);
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
     * 获取测试用例详情
     * 获取测试用例详情
     *
     * @param ShowTestCaseDetailRequest 请求对象
     * @return SyncInvoker<ShowTestCaseDetailRequest, ShowTestCaseDetailResponse>
     */
    public SyncInvoker<ShowTestCaseDetailRequest, ShowTestCaseDetailResponse> showTestCaseDetailInvoker(ShowTestCaseDetailRequest request) {
        return new SyncInvoker<ShowTestCaseDetailRequest, ShowTestCaseDetailResponse>(request, CloudtestMeta.showTestCaseDetail, hcClient);
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
     * 通过用例编号或用例ID获取测试用例详情
     * 通过用例编号或用例ID获取测试用例详情
     *
     * @param ShowTestCaseDetailV2Request 请求对象
     * @return SyncInvoker<ShowTestCaseDetailV2Request, ShowTestCaseDetailV2Response>
     */
    public SyncInvoker<ShowTestCaseDetailV2Request, ShowTestCaseDetailV2Response> showTestCaseDetailV2Invoker(ShowTestCaseDetailV2Request request) {
        return new SyncInvoker<ShowTestCaseDetailV2Request, ShowTestCaseDetailV2Response>(request, CloudtestMeta.showTestCaseDetailV2, hcClient);
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
     * 更新测试用例接口
     * 更新测试用例接口
     *
     * @param UpdateTestCaseRequest 请求对象
     * @return SyncInvoker<UpdateTestCaseRequest, UpdateTestCaseResponse>
     */
    public SyncInvoker<UpdateTestCaseRequest, UpdateTestCaseResponse> updateTestCaseInvoker(UpdateTestCaseRequest request) {
        return new SyncInvoker<UpdateTestCaseRequest, UpdateTestCaseResponse>(request, CloudtestMeta.updateTestCase, hcClient);
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

    /**
     * 批量更新测试用例结果
     * 批量更新测试用例结果
     *
     * @param UpdateTestCaseResultRequest 请求对象
     * @return SyncInvoker<UpdateTestCaseResultRequest, UpdateTestCaseResultResponse>
     */
    public SyncInvoker<UpdateTestCaseResultRequest, UpdateTestCaseResultResponse> updateTestCaseResultInvoker(UpdateTestCaseResultRequest request) {
        return new SyncInvoker<UpdateTestCaseResultRequest, UpdateTestCaseResultResponse>(request, CloudtestMeta.updateTestCaseResult, hcClient);
    }

}