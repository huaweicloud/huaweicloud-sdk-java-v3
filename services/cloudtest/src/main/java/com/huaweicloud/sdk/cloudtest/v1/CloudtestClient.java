package com.huaweicloud.sdk.cloudtest.v1;

import com.huaweicloud.sdk.cloudtest.v1.model.BatchDeleteTestCaseRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.BatchDeleteTestCaseResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.CreateApiTestSuiteByRepoFileRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.CreateApiTestSuiteByRepoFileResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.CreatePlanRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.CreatePlanResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.CreateServiceRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.CreateServiceResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.CreateTestCaseInPlanRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.CreateTestCaseInPlanResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.CreateTestCaseRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.CreateTestCaseResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.DeleteServiceRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.DeleteServiceResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ListBranchesRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ListBranchesResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ListEnvironmentsRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ListEnvironmentsResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ListTestCaseHistoriesRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ListTestCaseHistoriesResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ListTestCasesRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ListTestCasesResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.RunTestCaseRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.RunTestCaseResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowApiTestcaseHistoriesRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowApiTestcaseHistoriesResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowIssuesByPlanIdRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowIssuesByPlanIdResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowPlanJournalsRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowPlanJournalsResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowPlanListRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowPlanListResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowPlansRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowPlansResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowProjectDataDashboardRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowProjectDataDashboardResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowRegisterServiceRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowRegisterServiceResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowReportRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowReportResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowTestCaseAndDefectInfoRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowTestCaseAndDefectInfoResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowTestCaseDetailRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowTestCaseDetailResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowTestCaseDetailV2Request;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowTestCaseDetailV2Response;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowUserExecuteTestCaseInfoRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowUserExecuteTestCaseInfoResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.UpdateServiceRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.UpdateServiceResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.UpdateTestCaseRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.UpdateTestCaseResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.UpdateTestCaseResultRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.UpdateTestCaseResultResponse;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;

public class CloudtestClient {

    protected HcClient hcClient;

    public CloudtestClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<CloudtestClient> newBuilder() {
        ClientBuilder<CloudtestClient> clientBuilder = new ClientBuilder<>(CloudtestClient::new);
        return clientBuilder;
    }

    /**
     * 批量删除自定义测试服务类型用例
     *
     * 批量删除自定义测试服务类型用例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteTestCaseRequest 请求对象
     * @return BatchDeleteTestCaseResponse
     */
    public BatchDeleteTestCaseResponse batchDeleteTestCase(BatchDeleteTestCaseRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.batchDeleteTestCase);
    }

    /**
     * 批量删除自定义测试服务类型用例
     *
     * 批量删除自定义测试服务类型用例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteTestCaseRequest 请求对象
     * @return SyncInvoker<BatchDeleteTestCaseRequest, BatchDeleteTestCaseResponse>
     */
    public SyncInvoker<BatchDeleteTestCaseRequest, BatchDeleteTestCaseResponse> batchDeleteTestCaseInvoker(
        BatchDeleteTestCaseRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.batchDeleteTestCase, hcClient);
    }

    /**
     * 项目下创建计划
     *
     * 项目下创建计划
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePlanRequest 请求对象
     * @return CreatePlanResponse
     */
    public CreatePlanResponse createPlan(CreatePlanRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.createPlan);
    }

    /**
     * 项目下创建计划
     *
     * 项目下创建计划
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePlanRequest 请求对象
     * @return SyncInvoker<CreatePlanRequest, CreatePlanResponse>
     */
    public SyncInvoker<CreatePlanRequest, CreatePlanResponse> createPlanInvoker(CreatePlanRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.createPlan, hcClient);
    }

    /**
     * 新测试类型服务注册
     *
     * 通过接口CreateService注册成为自定义服务。 注册完成后界面将会出现此自定义测试类型。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateServiceRequest 请求对象
     * @return CreateServiceResponse
     */
    public CreateServiceResponse createService(CreateServiceRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.createService);
    }

    /**
     * 新测试类型服务注册
     *
     * 通过接口CreateService注册成为自定义服务。 注册完成后界面将会出现此自定义测试类型。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateServiceRequest 请求对象
     * @return SyncInvoker<CreateServiceRequest, CreateServiceResponse>
     */
    public SyncInvoker<CreateServiceRequest, CreateServiceResponse> createServiceInvoker(CreateServiceRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.createService, hcClient);
    }

    /**
     * 创建自定义测试服务类型用例
     *
     * 创建自定义测试服务类型用例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTestCaseRequest 请求对象
     * @return CreateTestCaseResponse
     */
    public CreateTestCaseResponse createTestCase(CreateTestCaseRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.createTestCase);
    }

    /**
     * 创建自定义测试服务类型用例
     *
     * 创建自定义测试服务类型用例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTestCaseRequest 请求对象
     * @return SyncInvoker<CreateTestCaseRequest, CreateTestCaseResponse>
     */
    public SyncInvoker<CreateTestCaseRequest, CreateTestCaseResponse> createTestCaseInvoker(
        CreateTestCaseRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.createTestCase, hcClient);
    }

    /**
     * 计划中批量添加测试用例
     *
     * 计划中批量添加测试用例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTestCaseInPlanRequest 请求对象
     * @return CreateTestCaseInPlanResponse
     */
    public CreateTestCaseInPlanResponse createTestCaseInPlan(CreateTestCaseInPlanRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.createTestCaseInPlan);
    }

    /**
     * 计划中批量添加测试用例
     *
     * 计划中批量添加测试用例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTestCaseInPlanRequest 请求对象
     * @return SyncInvoker<CreateTestCaseInPlanRequest, CreateTestCaseInPlanResponse>
     */
    public SyncInvoker<CreateTestCaseInPlanRequest, CreateTestCaseInPlanResponse> createTestCaseInPlanInvoker(
        CreateTestCaseInPlanRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.createTestCaseInPlan, hcClient);
    }

    /**
     * 删除已注册服务
     *
     * 删除已注册服务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteServiceRequest 请求对象
     * @return DeleteServiceResponse
     */
    public DeleteServiceResponse deleteService(DeleteServiceRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.deleteService);
    }

    /**
     * 删除已注册服务
     *
     * 删除已注册服务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteServiceRequest 请求对象
     * @return SyncInvoker<DeleteServiceRequest, DeleteServiceResponse>
     */
    public SyncInvoker<DeleteServiceRequest, DeleteServiceResponse> deleteServiceInvoker(DeleteServiceRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.deleteService, hcClient);
    }

    /**
     * 获取分支列表
     *
     * 获取分支列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBranchesRequest 请求对象
     * @return ListBranchesResponse
     */
    public ListBranchesResponse listBranches(ListBranchesRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.listBranches);
    }

    /**
     * 获取分支列表
     *
     * 获取分支列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBranchesRequest 请求对象
     * @return SyncInvoker<ListBranchesRequest, ListBranchesResponse>
     */
    public SyncInvoker<ListBranchesRequest, ListBranchesResponse> listBranchesInvoker(ListBranchesRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.listBranches, hcClient);
    }

    /**
     * 查询用例修改历史记录
     *
     * 查询用例修改历史记录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTestCaseHistoriesRequest 请求对象
     * @return ListTestCaseHistoriesResponse
     */
    public ListTestCaseHistoriesResponse listTestCaseHistories(ListTestCaseHistoriesRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.listTestCaseHistories);
    }

    /**
     * 查询用例修改历史记录
     *
     * 查询用例修改历史记录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTestCaseHistoriesRequest 请求对象
     * @return SyncInvoker<ListTestCaseHistoriesRequest, ListTestCaseHistoriesResponse>
     */
    public SyncInvoker<ListTestCaseHistoriesRequest, ListTestCaseHistoriesResponse> listTestCaseHistoriesInvoker(
        ListTestCaseHistoriesRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.listTestCaseHistories, hcClient);
    }

    /**
     * 查询用例列表
     *
     * 查询用例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTestCasesRequest 请求对象
     * @return ListTestCasesResponse
     */
    public ListTestCasesResponse listTestCases(ListTestCasesRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.listTestCases);
    }

    /**
     * 查询用例列表
     *
     * 查询用例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTestCasesRequest 请求对象
     * @return SyncInvoker<ListTestCasesRequest, ListTestCasesResponse>
     */
    public SyncInvoker<ListTestCasesRequest, ListTestCasesResponse> listTestCasesInvoker(ListTestCasesRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.listTestCases, hcClient);
    }

    /**
     * 批量执行测试用例
     *
     * 批量执行测试用例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RunTestCaseRequest 请求对象
     * @return RunTestCaseResponse
     */
    public RunTestCaseResponse runTestCase(RunTestCaseRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.runTestCase);
    }

    /**
     * 批量执行测试用例
     *
     * 批量执行测试用例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RunTestCaseRequest 请求对象
     * @return SyncInvoker<RunTestCaseRequest, RunTestCaseResponse>
     */
    public SyncInvoker<RunTestCaseRequest, RunTestCaseResponse> runTestCaseInvoker(RunTestCaseRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.runTestCase, hcClient);
    }

    /**
     * 获取用例历史执行数据
     *
     * 获取用例历史执行数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowApiTestcaseHistoriesRequest 请求对象
     * @return ShowApiTestcaseHistoriesResponse
     */
    public ShowApiTestcaseHistoriesResponse showApiTestcaseHistories(ShowApiTestcaseHistoriesRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.showApiTestcaseHistories);
    }

    /**
     * 获取用例历史执行数据
     *
     * 获取用例历史执行数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowApiTestcaseHistoriesRequest 请求对象
     * @return SyncInvoker<ShowApiTestcaseHistoriesRequest, ShowApiTestcaseHistoriesResponse>
     */
    public SyncInvoker<ShowApiTestcaseHistoriesRequest, ShowApiTestcaseHistoriesResponse> showApiTestcaseHistoriesInvoker(
        ShowApiTestcaseHistoriesRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.showApiTestcaseHistories, hcClient);
    }

    /**
     * 查询某个测试计划下的需求树
     *
     * 查询某个测试计划下的需求列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowIssuesByPlanIdRequest 请求对象
     * @return ShowIssuesByPlanIdResponse
     */
    public ShowIssuesByPlanIdResponse showIssuesByPlanId(ShowIssuesByPlanIdRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.showIssuesByPlanId);
    }

    /**
     * 查询某个测试计划下的需求树
     *
     * 查询某个测试计划下的需求列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowIssuesByPlanIdRequest 请求对象
     * @return SyncInvoker<ShowIssuesByPlanIdRequest, ShowIssuesByPlanIdResponse>
     */
    public SyncInvoker<ShowIssuesByPlanIdRequest, ShowIssuesByPlanIdResponse> showIssuesByPlanIdInvoker(
        ShowIssuesByPlanIdRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.showIssuesByPlanId, hcClient);
    }

    /**
     * 查询某测试计划下的操作历史
     *
     * 查询某测试计划下的操作历史
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPlanJournalsRequest 请求对象
     * @return ShowPlanJournalsResponse
     */
    public ShowPlanJournalsResponse showPlanJournals(ShowPlanJournalsRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.showPlanJournals);
    }

    /**
     * 查询某测试计划下的操作历史
     *
     * 查询某测试计划下的操作历史
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPlanJournalsRequest 请求对象
     * @return SyncInvoker<ShowPlanJournalsRequest, ShowPlanJournalsResponse>
     */
    public SyncInvoker<ShowPlanJournalsRequest, ShowPlanJournalsResponse> showPlanJournalsInvoker(
        ShowPlanJournalsRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.showPlanJournals, hcClient);
    }

    /**
     * 项目下查询测试计划列表v2
     *
     * 项目下查询测试计划列表v2
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPlanListRequest 请求对象
     * @return ShowPlanListResponse
     */
    public ShowPlanListResponse showPlanList(ShowPlanListRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.showPlanList);
    }

    /**
     * 项目下查询测试计划列表v2
     *
     * 项目下查询测试计划列表v2
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPlanListRequest 请求对象
     * @return SyncInvoker<ShowPlanListRequest, ShowPlanListResponse>
     */
    public SyncInvoker<ShowPlanListRequest, ShowPlanListResponse> showPlanListInvoker(ShowPlanListRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.showPlanList, hcClient);
    }

    /**
     * 项目下查询测试计划列表
     *
     * 项目下查询测试计划列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPlansRequest 请求对象
     * @return ShowPlansResponse
     */
    public ShowPlansResponse showPlans(ShowPlansRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.showPlans);
    }

    /**
     * 项目下查询测试计划列表
     *
     * 项目下查询测试计划列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPlansRequest 请求对象
     * @return SyncInvoker<ShowPlansRequest, ShowPlansResponse>
     */
    public SyncInvoker<ShowPlansRequest, ShowPlansResponse> showPlansInvoker(ShowPlansRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.showPlans, hcClient);
    }

    /**
     * 查询质量报告看板统计信息
     *
     * 查询质量报告看板统计信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowProjectDataDashboardRequest 请求对象
     * @return ShowProjectDataDashboardResponse
     */
    public ShowProjectDataDashboardResponse showProjectDataDashboard(ShowProjectDataDashboardRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.showProjectDataDashboard);
    }

    /**
     * 查询质量报告看板统计信息
     *
     * 查询质量报告看板统计信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowProjectDataDashboardRequest 请求对象
     * @return SyncInvoker<ShowProjectDataDashboardRequest, ShowProjectDataDashboardResponse>
     */
    public SyncInvoker<ShowProjectDataDashboardRequest, ShowProjectDataDashboardResponse> showProjectDataDashboardInvoker(
        ShowProjectDataDashboardRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.showProjectDataDashboard, hcClient);
    }

    /**
     * 用户获取自己当前已经注册的服务
     *
     * 用户获取自己当前已经注册的服务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRegisterServiceRequest 请求对象
     * @return ShowRegisterServiceResponse
     */
    public ShowRegisterServiceResponse showRegisterService(ShowRegisterServiceRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.showRegisterService);
    }

    /**
     * 用户获取自己当前已经注册的服务
     *
     * 用户获取自己当前已经注册的服务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRegisterServiceRequest 请求对象
     * @return SyncInvoker<ShowRegisterServiceRequest, ShowRegisterServiceResponse>
     */
    public SyncInvoker<ShowRegisterServiceRequest, ShowRegisterServiceResponse> showRegisterServiceInvoker(
        ShowRegisterServiceRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.showRegisterService, hcClient);
    }

    /**
     * 实时计算单个自定义报表
     *
     * 实时计算单个自定义报表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowReportRequest 请求对象
     * @return ShowReportResponse
     */
    public ShowReportResponse showReport(ShowReportRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.showReport);
    }

    /**
     * 实时计算单个自定义报表
     *
     * 实时计算单个自定义报表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowReportRequest 请求对象
     * @return SyncInvoker<ShowReportRequest, ShowReportResponse>
     */
    public SyncInvoker<ShowReportRequest, ShowReportResponse> showReportInvoker(ShowReportRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.showReport, hcClient);
    }

    /**
     * 查询用户用例关联缺陷的统计信息
     *
     * 查询用户用例关联缺陷的统计信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTestCaseAndDefectInfoRequest 请求对象
     * @return ShowTestCaseAndDefectInfoResponse
     */
    public ShowTestCaseAndDefectInfoResponse showTestCaseAndDefectInfo(ShowTestCaseAndDefectInfoRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.showTestCaseAndDefectInfo);
    }

    /**
     * 查询用户用例关联缺陷的统计信息
     *
     * 查询用户用例关联缺陷的统计信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTestCaseAndDefectInfoRequest 请求对象
     * @return SyncInvoker<ShowTestCaseAndDefectInfoRequest, ShowTestCaseAndDefectInfoResponse>
     */
    public SyncInvoker<ShowTestCaseAndDefectInfoRequest, ShowTestCaseAndDefectInfoResponse> showTestCaseAndDefectInfoInvoker(
        ShowTestCaseAndDefectInfoRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.showTestCaseAndDefectInfo, hcClient);
    }

    /**
     * 获取测试用例详情
     *
     * 获取测试用例详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTestCaseDetailRequest 请求对象
     * @return ShowTestCaseDetailResponse
     */
    public ShowTestCaseDetailResponse showTestCaseDetail(ShowTestCaseDetailRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.showTestCaseDetail);
    }

    /**
     * 获取测试用例详情
     *
     * 获取测试用例详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTestCaseDetailRequest 请求对象
     * @return SyncInvoker<ShowTestCaseDetailRequest, ShowTestCaseDetailResponse>
     */
    public SyncInvoker<ShowTestCaseDetailRequest, ShowTestCaseDetailResponse> showTestCaseDetailInvoker(
        ShowTestCaseDetailRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.showTestCaseDetail, hcClient);
    }

    /**
     * 通过用例编号获取测试用例详情
     *
     * 通过用例编号获取测试用例详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTestCaseDetailV2Request 请求对象
     * @return ShowTestCaseDetailV2Response
     */
    public ShowTestCaseDetailV2Response showTestCaseDetailV2(ShowTestCaseDetailV2Request request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.showTestCaseDetailV2);
    }

    /**
     * 通过用例编号获取测试用例详情
     *
     * 通过用例编号获取测试用例详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTestCaseDetailV2Request 请求对象
     * @return SyncInvoker<ShowTestCaseDetailV2Request, ShowTestCaseDetailV2Response>
     */
    public SyncInvoker<ShowTestCaseDetailV2Request, ShowTestCaseDetailV2Response> showTestCaseDetailV2Invoker(
        ShowTestCaseDetailV2Request request) {
        return new SyncInvoker<>(request, CloudtestMeta.showTestCaseDetailV2, hcClient);
    }

    /**
     * 查询时段内用例的执行情况
     *
     * 查询时段内用例的执行情况
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowUserExecuteTestCaseInfoRequest 请求对象
     * @return ShowUserExecuteTestCaseInfoResponse
     */
    public ShowUserExecuteTestCaseInfoResponse showUserExecuteTestCaseInfo(ShowUserExecuteTestCaseInfoRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.showUserExecuteTestCaseInfo);
    }

    /**
     * 查询时段内用例的执行情况
     *
     * 查询时段内用例的执行情况
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowUserExecuteTestCaseInfoRequest 请求对象
     * @return SyncInvoker<ShowUserExecuteTestCaseInfoRequest, ShowUserExecuteTestCaseInfoResponse>
     */
    public SyncInvoker<ShowUserExecuteTestCaseInfoRequest, ShowUserExecuteTestCaseInfoResponse> showUserExecuteTestCaseInfoInvoker(
        ShowUserExecuteTestCaseInfoRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.showUserExecuteTestCaseInfo, hcClient);
    }

    /**
     * 更新已注册服务
     *
     * 更新已注册服务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateServiceRequest 请求对象
     * @return UpdateServiceResponse
     */
    public UpdateServiceResponse updateService(UpdateServiceRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.updateService);
    }

    /**
     * 更新已注册服务
     *
     * 更新已注册服务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateServiceRequest 请求对象
     * @return SyncInvoker<UpdateServiceRequest, UpdateServiceResponse>
     */
    public SyncInvoker<UpdateServiceRequest, UpdateServiceResponse> updateServiceInvoker(UpdateServiceRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.updateService, hcClient);
    }

    /**
     * 更新自定义测试服务类型用例
     *
     * 更新自定义测试服务类型用例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTestCaseRequest 请求对象
     * @return UpdateTestCaseResponse
     */
    public UpdateTestCaseResponse updateTestCase(UpdateTestCaseRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.updateTestCase);
    }

    /**
     * 更新自定义测试服务类型用例
     *
     * 更新自定义测试服务类型用例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTestCaseRequest 请求对象
     * @return SyncInvoker<UpdateTestCaseRequest, UpdateTestCaseResponse>
     */
    public SyncInvoker<UpdateTestCaseRequest, UpdateTestCaseResponse> updateTestCaseInvoker(
        UpdateTestCaseRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.updateTestCase, hcClient);
    }

    /**
     * 批量更新测试用例结果
     *
     * 批量更新测试用例结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTestCaseResultRequest 请求对象
     * @return UpdateTestCaseResultResponse
     */
    public UpdateTestCaseResultResponse updateTestCaseResult(UpdateTestCaseResultRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.updateTestCaseResult);
    }

    /**
     * 批量更新测试用例结果
     *
     * 批量更新测试用例结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTestCaseResultRequest 请求对象
     * @return SyncInvoker<UpdateTestCaseResultRequest, UpdateTestCaseResultResponse>
     */
    public SyncInvoker<UpdateTestCaseResultRequest, UpdateTestCaseResultResponse> updateTestCaseResultInvoker(
        UpdateTestCaseResultRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.updateTestCaseResult, hcClient);
    }

    /**
     * 通过导入仓库中的文件生成接口测试套
     *
     * 通过导入仓库中的文件生成接口测试套
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateApiTestSuiteByRepoFileRequest 请求对象
     * @return CreateApiTestSuiteByRepoFileResponse
     */
    public CreateApiTestSuiteByRepoFileResponse createApiTestSuiteByRepoFile(
        CreateApiTestSuiteByRepoFileRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.createApiTestSuiteByRepoFile);
    }

    /**
     * 通过导入仓库中的文件生成接口测试套
     *
     * 通过导入仓库中的文件生成接口测试套
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateApiTestSuiteByRepoFileRequest 请求对象
     * @return SyncInvoker<CreateApiTestSuiteByRepoFileRequest, CreateApiTestSuiteByRepoFileResponse>
     */
    public SyncInvoker<CreateApiTestSuiteByRepoFileRequest, CreateApiTestSuiteByRepoFileResponse> createApiTestSuiteByRepoFileInvoker(
        CreateApiTestSuiteByRepoFileRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.createApiTestSuiteByRepoFile, hcClient);
    }

    /**
     * 获取环境参数分组列表
     *
     * 获取环境参数分组列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEnvironmentsRequest 请求对象
     * @return ListEnvironmentsResponse
     */
    public ListEnvironmentsResponse listEnvironments(ListEnvironmentsRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.listEnvironments);
    }

    /**
     * 获取环境参数分组列表
     *
     * 获取环境参数分组列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEnvironmentsRequest 请求对象
     * @return SyncInvoker<ListEnvironmentsRequest, ListEnvironmentsResponse>
     */
    public SyncInvoker<ListEnvironmentsRequest, ListEnvironmentsResponse> listEnvironmentsInvoker(
        ListEnvironmentsRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.listEnvironments, hcClient);
    }

}
