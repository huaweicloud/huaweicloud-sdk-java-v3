package com.huaweicloud.sdk.cloudtest.v1;

import com.huaweicloud.sdk.cloudtest.v1.model.BatchAddRelationsByOneCaseRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.BatchAddRelationsByOneCaseResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.BatchDeleteTestCaseRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.BatchDeleteTestCaseResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.BatchDeleteTestReportRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.BatchDeleteTestReportResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.CheckPermissionRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.CheckPermissionResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.CreateApiTestSuiteByRepoFileRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.CreateApiTestSuiteByRepoFileResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.CreatePlanRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.CreatePlanResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.CreateRelationsByOneCaseRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.CreateRelationsByOneCaseResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.CreateResourceUriRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.CreateResourceUriResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.CreateServiceRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.CreateServiceResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.CreateTestCaseInPlanRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.CreateTestCaseInPlanResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.CreateTestCaseRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.CreateTestCaseResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.DeleteRelationsByOneCaseRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.DeleteRelationsByOneCaseResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.DeleteServiceRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.DeleteServiceResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ListAlertGroupsByConditionRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ListAlertGroupsByConditionResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ListAlertTemplatesRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ListAlertTemplatesResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ListAllBranchesRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ListAllBranchesResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ListAllConfigItemByTypeRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ListAllConfigItemByTypeResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ListAllIteratorsRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ListAllIteratorsResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ListAttachmentsRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ListAttachmentsResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ListBasicAwRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ListBasicAwResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ListBranchesRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ListBranchesResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ListEnvironmentsRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ListEnvironmentsResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ListIssueTreeRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ListIssueTreeResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ListProjectFieldConfigsRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ListProjectFieldConfigsResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ListProjectTestCaseFieldsRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ListProjectTestCaseFieldsResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ListPublicLibAndAwsRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ListPublicLibAndAwsResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ListReportsRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ListReportsResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ListResourcePoolsRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ListResourcePoolsResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ListTaskTestCasesRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ListTaskTestCasesResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ListTestCaseHistoriesRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ListTestCaseHistoriesResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ListTestCasesRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ListTestCasesResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ListTestReportsByConditionRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ListTestReportsByConditionResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ListTestTypesRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ListTestTypesResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ListTestcasesByProjectIssuesRelationRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ListTestcasesByProjectIssuesRelationResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ListUsageInfosRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ListUsageInfosResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ListUserDnsMappingRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ListUserDnsMappingResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ListUserPackageUsageRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ListUserPackageUsageResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ListUserPopupInfoRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ListUserPopupInfoResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ListVariablesRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ListVariablesResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.RunTestCaseRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.RunTestCaseResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.SaveTaskSettingRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.SaveTaskSettingResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowAllConfigValueByTypeAndKeyRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowAllConfigValueByTypeAndKeyResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowAllFeatureChildrenRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowAllFeatureChildrenResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowApiTestcaseHistoriesRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowApiTestcaseHistoriesResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowBackgroundInfoRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowBackgroundInfoResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowDisclaimerRecordRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowDisclaimerRecordResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowDomainInfoRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowDomainInfoResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowFeatureChildrenRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowFeatureChildrenResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowFreeDeclarationRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowFreeDeclarationResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowIfTaskNameRepeatRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowIfTaskNameRepeatResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowIfUserNameRepeatRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowIfUserNameRepeatResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowIssuesByPlanIdRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowIssuesByPlanIdResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowIteratorByDefectRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowIteratorByDefectResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowMindmapByPageRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowMindmapByPageResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowMindmapCreatorNameRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowMindmapCreatorNameResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowPlanJournalsRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowPlanJournalsResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowPlanListRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowPlanListResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowPlansRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowPlansResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowProgressRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowProgressResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowProjectDataDashboardRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowProjectDataDashboardResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowRegisterServiceRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowRegisterServiceResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowReportRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowReportResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowRequirementsOverviewRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowRequirementsOverviewResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowSystemConfigsRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowSystemConfigsResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowTestCaseAndDefectInfoRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowTestCaseAndDefectInfoResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowTestCaseDetailRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowTestCaseDetailResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowTestCaseDetailV2Request;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowTestCaseDetailV2Response;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowTestCaseRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowTestCaseResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowUserAccessInfoRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowUserAccessInfoResponse;
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
     * 添加需求/缺陷和多个用例关联关系
     *
     * 添加需求/缺陷和多个用例关联关系
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchAddRelationsByOneCaseRequest 请求对象
     * @return BatchAddRelationsByOneCaseResponse
     */
    public BatchAddRelationsByOneCaseResponse batchAddRelationsByOneCase(BatchAddRelationsByOneCaseRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.batchAddRelationsByOneCase);
    }

    /**
     * 添加需求/缺陷和多个用例关联关系
     *
     * 添加需求/缺陷和多个用例关联关系
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchAddRelationsByOneCaseRequest 请求对象
     * @return SyncInvoker<BatchAddRelationsByOneCaseRequest, BatchAddRelationsByOneCaseResponse>
     */
    public SyncInvoker<BatchAddRelationsByOneCaseRequest, BatchAddRelationsByOneCaseResponse> batchAddRelationsByOneCaseInvoker(
        BatchAddRelationsByOneCaseRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.batchAddRelationsByOneCase, hcClient);
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
     * 根据测试报告uri列表，删除测试报告
     *
     * 根据测试报告uri列表，删除测试报告
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteTestReportRequest 请求对象
     * @return BatchDeleteTestReportResponse
     */
    public BatchDeleteTestReportResponse batchDeleteTestReport(BatchDeleteTestReportRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.batchDeleteTestReport);
    }

    /**
     * 根据测试报告uri列表，删除测试报告
     *
     * 根据测试报告uri列表，删除测试报告
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteTestReportRequest 请求对象
     * @return SyncInvoker<BatchDeleteTestReportRequest, BatchDeleteTestReportResponse>
     */
    public SyncInvoker<BatchDeleteTestReportRequest, BatchDeleteTestReportResponse> batchDeleteTestReportInvoker(
        BatchDeleteTestReportRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.batchDeleteTestReport, hcClient);
    }

    /**
     * 检查项目权限
     *
     * 检查项目权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckPermissionRequest 请求对象
     * @return CheckPermissionResponse
     */
    public CheckPermissionResponse checkPermission(CheckPermissionRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.checkPermission);
    }

    /**
     * 检查项目权限
     *
     * 检查项目权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckPermissionRequest 请求对象
     * @return SyncInvoker<CheckPermissionRequest, CheckPermissionResponse>
     */
    public SyncInvoker<CheckPermissionRequest, CheckPermissionResponse> checkPermissionInvoker(
        CheckPermissionRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.checkPermission, hcClient);
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
     * 添加一个用例和多个需求/缺陷关联关系
     *
     * 添加一个用例和多个需求/缺陷关联关系
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateRelationsByOneCaseRequest 请求对象
     * @return CreateRelationsByOneCaseResponse
     */
    public CreateRelationsByOneCaseResponse createRelationsByOneCase(CreateRelationsByOneCaseRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.createRelationsByOneCase);
    }

    /**
     * 添加一个用例和多个需求/缺陷关联关系
     *
     * 添加一个用例和多个需求/缺陷关联关系
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateRelationsByOneCaseRequest 请求对象
     * @return SyncInvoker<CreateRelationsByOneCaseRequest, CreateRelationsByOneCaseResponse>
     */
    public SyncInvoker<CreateRelationsByOneCaseRequest, CreateRelationsByOneCaseResponse> createRelationsByOneCaseInvoker(
        CreateRelationsByOneCaseRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.createRelationsByOneCase, hcClient);
    }

    /**
     * 生成资源URI
     *
     * 生成资源URI
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateResourceUriRequest 请求对象
     * @return CreateResourceUriResponse
     */
    public CreateResourceUriResponse createResourceUri(CreateResourceUriRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.createResourceUri);
    }

    /**
     * 生成资源URI
     *
     * 生成资源URI
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateResourceUriRequest 请求对象
     * @return SyncInvoker<CreateResourceUriRequest, CreateResourceUriResponse>
     */
    public SyncInvoker<CreateResourceUriRequest, CreateResourceUriResponse> createResourceUriInvoker(
        CreateResourceUriRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.createResourceUri, hcClient);
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
     * 删除一个用例和多个需求/缺陷关联关系
     *
     * 删除一个用例和多个需求/缺陷关联关系
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteRelationsByOneCaseRequest 请求对象
     * @return DeleteRelationsByOneCaseResponse
     */
    public DeleteRelationsByOneCaseResponse deleteRelationsByOneCase(DeleteRelationsByOneCaseRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.deleteRelationsByOneCase);
    }

    /**
     * 删除一个用例和多个需求/缺陷关联关系
     *
     * 删除一个用例和多个需求/缺陷关联关系
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteRelationsByOneCaseRequest 请求对象
     * @return SyncInvoker<DeleteRelationsByOneCaseRequest, DeleteRelationsByOneCaseResponse>
     */
    public SyncInvoker<DeleteRelationsByOneCaseRequest, DeleteRelationsByOneCaseResponse> deleteRelationsByOneCaseInvoker(
        DeleteRelationsByOneCaseRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.deleteRelationsByOneCase, hcClient);
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
     * @param request ListAllBranchesRequest 请求对象
     * @return ListAllBranchesResponse
     */
    public ListAllBranchesResponse listAllBranches(ListAllBranchesRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.listAllBranches);
    }

    /**
     * 获取分支列表
     *
     * 获取分支列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAllBranchesRequest 请求对象
     * @return SyncInvoker<ListAllBranchesRequest, ListAllBranchesResponse>
     */
    public SyncInvoker<ListAllBranchesRequest, ListAllBranchesResponse> listAllBranchesInvoker(
        ListAllBranchesRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.listAllBranches, hcClient);
    }

    /**
     * 查询项目下所有迭代计划
     *
     * 查询项目下所有迭代计划
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAllIteratorsRequest 请求对象
     * @return ListAllIteratorsResponse
     */
    public ListAllIteratorsResponse listAllIterators(ListAllIteratorsRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.listAllIterators);
    }

    /**
     * 查询项目下所有迭代计划
     *
     * 查询项目下所有迭代计划
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAllIteratorsRequest 请求对象
     * @return SyncInvoker<ListAllIteratorsRequest, ListAllIteratorsResponse>
     */
    public SyncInvoker<ListAllIteratorsRequest, ListAllIteratorsResponse> listAllIteratorsInvoker(
        ListAllIteratorsRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.listAllIterators, hcClient);
    }

    /**
     * 查询附件列表
     *
     * 查询附件列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAttachmentsRequest 请求对象
     * @return ListAttachmentsResponse
     */
    public ListAttachmentsResponse listAttachments(ListAttachmentsRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.listAttachments);
    }

    /**
     * 查询附件列表
     *
     * 查询附件列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAttachmentsRequest 请求对象
     * @return SyncInvoker<ListAttachmentsRequest, ListAttachmentsResponse>
     */
    public SyncInvoker<ListAttachmentsRequest, ListAttachmentsResponse> listAttachmentsInvoker(
        ListAttachmentsRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.listAttachments, hcClient);
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
     * 查询需求树
     *
     * 查询需求树
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListIssueTreeRequest 请求对象
     * @return ListIssueTreeResponse
     */
    public ListIssueTreeResponse listIssueTree(ListIssueTreeRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.listIssueTree);
    }

    /**
     * 查询需求树
     *
     * 查询需求树
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListIssueTreeRequest 请求对象
     * @return SyncInvoker<ListIssueTreeRequest, ListIssueTreeResponse>
     */
    public SyncInvoker<ListIssueTreeRequest, ListIssueTreeResponse> listIssueTreeInvoker(ListIssueTreeRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.listIssueTree, hcClient);
    }

    /**
     * 查询项目字段配置
     *
     * 查询项目字段配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectFieldConfigsRequest 请求对象
     * @return ListProjectFieldConfigsResponse
     */
    public ListProjectFieldConfigsResponse listProjectFieldConfigs(ListProjectFieldConfigsRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.listProjectFieldConfigs);
    }

    /**
     * 查询项目字段配置
     *
     * 查询项目字段配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectFieldConfigsRequest 请求对象
     * @return SyncInvoker<ListProjectFieldConfigsRequest, ListProjectFieldConfigsResponse>
     */
    public SyncInvoker<ListProjectFieldConfigsRequest, ListProjectFieldConfigsResponse> listProjectFieldConfigsInvoker(
        ListProjectFieldConfigsRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.listProjectFieldConfigs, hcClient);
    }

    /**
     * 获取项目测试用例自定义字段列表
     *
     * 获取项目测试用例自定义字段列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectTestCaseFieldsRequest 请求对象
     * @return ListProjectTestCaseFieldsResponse
     */
    public ListProjectTestCaseFieldsResponse listProjectTestCaseFields(ListProjectTestCaseFieldsRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.listProjectTestCaseFields);
    }

    /**
     * 获取项目测试用例自定义字段列表
     *
     * 获取项目测试用例自定义字段列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectTestCaseFieldsRequest 请求对象
     * @return SyncInvoker<ListProjectTestCaseFieldsRequest, ListProjectTestCaseFieldsResponse>
     */
    public SyncInvoker<ListProjectTestCaseFieldsRequest, ListProjectTestCaseFieldsResponse> listProjectTestCaseFieldsInvoker(
        ListProjectTestCaseFieldsRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.listProjectTestCaseFields, hcClient);
    }

    /**
     * 页面报表展示
     *
     * 页面报表展示
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListReportsRequest 请求对象
     * @return ListReportsResponse
     */
    public ListReportsResponse listReports(ListReportsRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.listReports);
    }

    /**
     * 页面报表展示
     *
     * 页面报表展示
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListReportsRequest 请求对象
     * @return SyncInvoker<ListReportsRequest, ListReportsResponse>
     */
    public SyncInvoker<ListReportsRequest, ListReportsResponse> listReportsInvoker(ListReportsRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.listReports, hcClient);
    }

    /**
     * 获取资源池列表
     *
     * 获取资源池列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListResourcePoolsRequest 请求对象
     * @return ListResourcePoolsResponse
     */
    public ListResourcePoolsResponse listResourcePools(ListResourcePoolsRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.listResourcePools);
    }

    /**
     * 获取资源池列表
     *
     * 获取资源池列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListResourcePoolsRequest 请求对象
     * @return SyncInvoker<ListResourcePoolsRequest, ListResourcePoolsResponse>
     */
    public SyncInvoker<ListResourcePoolsRequest, ListResourcePoolsResponse> listResourcePoolsInvoker(
        ListResourcePoolsRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.listResourcePools, hcClient);
    }

    /**
     * 查询用例关联的测试任务列表
     *
     * 查询用例关联的测试任务列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTaskTestCasesRequest 请求对象
     * @return ListTaskTestCasesResponse
     */
    public ListTaskTestCasesResponse listTaskTestCases(ListTaskTestCasesRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.listTaskTestCases);
    }

    /**
     * 查询用例关联的测试任务列表
     *
     * 查询用例关联的测试任务列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTaskTestCasesRequest 请求对象
     * @return SyncInvoker<ListTaskTestCasesRequest, ListTaskTestCasesResponse>
     */
    public SyncInvoker<ListTaskTestCasesRequest, ListTaskTestCasesResponse> listTaskTestCasesInvoker(
        ListTaskTestCasesRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.listTaskTestCases, hcClient);
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
     * 根据查询条件获取测试报告列表
     *
     * 根据查询条件获取测试报告列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTestReportsByConditionRequest 请求对象
     * @return ListTestReportsByConditionResponse
     */
    public ListTestReportsByConditionResponse listTestReportsByCondition(ListTestReportsByConditionRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.listTestReportsByCondition);
    }

    /**
     * 根据查询条件获取测试报告列表
     *
     * 根据查询条件获取测试报告列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTestReportsByConditionRequest 请求对象
     * @return SyncInvoker<ListTestReportsByConditionRequest, ListTestReportsByConditionResponse>
     */
    public SyncInvoker<ListTestReportsByConditionRequest, ListTestReportsByConditionResponse> listTestReportsByConditionInvoker(
        ListTestReportsByConditionRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.listTestReportsByCondition, hcClient);
    }

    /**
     * 获取测试类型列表
     *
     * 获取测试类型列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTestTypesRequest 请求对象
     * @return ListTestTypesResponse
     */
    public ListTestTypesResponse listTestTypes(ListTestTypesRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.listTestTypes);
    }

    /**
     * 获取测试类型列表
     *
     * 获取测试类型列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTestTypesRequest 请求对象
     * @return SyncInvoker<ListTestTypesRequest, ListTestTypesResponse>
     */
    public SyncInvoker<ListTestTypesRequest, ListTestTypesResponse> listTestTypesInvoker(ListTestTypesRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.listTestTypes, hcClient);
    }

    /**
     * 查询项目下关联了需求的用例列表
     *
     * 查询项目下关联了需求的用例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTestcasesByProjectIssuesRelationRequest 请求对象
     * @return ListTestcasesByProjectIssuesRelationResponse
     */
    public ListTestcasesByProjectIssuesRelationResponse listTestcasesByProjectIssuesRelation(
        ListTestcasesByProjectIssuesRelationRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.listTestcasesByProjectIssuesRelation);
    }

    /**
     * 查询项目下关联了需求的用例列表
     *
     * 查询项目下关联了需求的用例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTestcasesByProjectIssuesRelationRequest 请求对象
     * @return SyncInvoker<ListTestcasesByProjectIssuesRelationRequest, ListTestcasesByProjectIssuesRelationResponse>
     */
    public SyncInvoker<ListTestcasesByProjectIssuesRelationRequest, ListTestcasesByProjectIssuesRelationResponse> listTestcasesByProjectIssuesRelationInvoker(
        ListTestcasesByProjectIssuesRelationRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.listTestcasesByProjectIssuesRelation, hcClient);
    }

    /**
     * 获取租户订单已用资源信息
     *
     * 获取租户订单已用资源信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUsageInfosRequest 请求对象
     * @return ListUsageInfosResponse
     */
    public ListUsageInfosResponse listUsageInfos(ListUsageInfosRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.listUsageInfos);
    }

    /**
     * 获取租户订单已用资源信息
     *
     * 获取租户订单已用资源信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUsageInfosRequest 请求对象
     * @return SyncInvoker<ListUsageInfosRequest, ListUsageInfosResponse>
     */
    public SyncInvoker<ListUsageInfosRequest, ListUsageInfosResponse> listUsageInfosInvoker(
        ListUsageInfosRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.listUsageInfos, hcClient);
    }

    /**
     * ListUserPackageUsage
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUserPackageUsageRequest 请求对象
     * @return ListUserPackageUsageResponse
     */
    public ListUserPackageUsageResponse listUserPackageUsage(ListUserPackageUsageRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.listUserPackageUsage);
    }

    /**
     * ListUserPackageUsage
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUserPackageUsageRequest 请求对象
     * @return SyncInvoker<ListUserPackageUsageRequest, ListUserPackageUsageResponse>
     */
    public SyncInvoker<ListUserPackageUsageRequest, ListUserPackageUsageResponse> listUserPackageUsageInvoker(
        ListUserPackageUsageRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.listUserPackageUsage, hcClient);
    }

    /**
     * ListUserPopupInfo
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUserPopupInfoRequest 请求对象
     * @return ListUserPopupInfoResponse
     */
    public ListUserPopupInfoResponse listUserPopupInfo(ListUserPopupInfoRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.listUserPopupInfo);
    }

    /**
     * ListUserPopupInfo
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUserPopupInfoRequest 请求对象
     * @return SyncInvoker<ListUserPopupInfoRequest, ListUserPopupInfoResponse>
     */
    public SyncInvoker<ListUserPopupInfoRequest, ListUserPopupInfoResponse> listUserPopupInfoInvoker(
        ListUserPopupInfoRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.listUserPopupInfo, hcClient);
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
     * 获取特性树V5
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAllFeatureChildrenRequest 请求对象
     * @return ShowAllFeatureChildrenResponse
     */
    public ShowAllFeatureChildrenResponse showAllFeatureChildren(ShowAllFeatureChildrenRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.showAllFeatureChildren);
    }

    /**
     * 获取特性树V5
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAllFeatureChildrenRequest 请求对象
     * @return SyncInvoker<ShowAllFeatureChildrenRequest, ShowAllFeatureChildrenResponse>
     */
    public SyncInvoker<ShowAllFeatureChildrenRequest, ShowAllFeatureChildrenResponse> showAllFeatureChildrenInvoker(
        ShowAllFeatureChildrenRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.showAllFeatureChildren, hcClient);
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
     * 获取测试报告的模板设置
     *
     * 获取测试报告的模板设置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBackgroundInfoRequest 请求对象
     * @return ShowBackgroundInfoResponse
     */
    public ShowBackgroundInfoResponse showBackgroundInfo(ShowBackgroundInfoRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.showBackgroundInfo);
    }

    /**
     * 获取测试报告的模板设置
     *
     * 获取测试报告的模板设置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBackgroundInfoRequest 请求对象
     * @return SyncInvoker<ShowBackgroundInfoRequest, ShowBackgroundInfoResponse>
     */
    public SyncInvoker<ShowBackgroundInfoRequest, ShowBackgroundInfoResponse> showBackgroundInfoInvoker(
        ShowBackgroundInfoRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.showBackgroundInfo, hcClient);
    }

    /**
     * 查询用户免责声明
     *
     * 查询用户免责声明
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDisclaimerRecordRequest 请求对象
     * @return ShowDisclaimerRecordResponse
     */
    public ShowDisclaimerRecordResponse showDisclaimerRecord(ShowDisclaimerRecordRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.showDisclaimerRecord);
    }

    /**
     * 查询用户免责声明
     *
     * 查询用户免责声明
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDisclaimerRecordRequest 请求对象
     * @return SyncInvoker<ShowDisclaimerRecordRequest, ShowDisclaimerRecordResponse>
     */
    public SyncInvoker<ShowDisclaimerRecordRequest, ShowDisclaimerRecordResponse> showDisclaimerRecordInvoker(
        ShowDisclaimerRecordRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.showDisclaimerRecord, hcClient);
    }

    /**
     * 根据domainId获取加密的testbirdkey
     *
     * 根据domainId获取加密的testbirdkey
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDomainInfoRequest 请求对象
     * @return ShowDomainInfoResponse
     */
    public ShowDomainInfoResponse showDomainInfo(ShowDomainInfoRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.showDomainInfo);
    }

    /**
     * 根据domainId获取加密的testbirdkey
     *
     * 根据domainId获取加密的testbirdkey
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDomainInfoRequest 请求对象
     * @return SyncInvoker<ShowDomainInfoRequest, ShowDomainInfoResponse>
     */
    public SyncInvoker<ShowDomainInfoRequest, ShowDomainInfoResponse> showDomainInfoInvoker(
        ShowDomainInfoRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.showDomainInfo, hcClient);
    }

    /**
     * 获取目录\\特性树
     *
     * 获取目录\\特性树
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFeatureChildrenRequest 请求对象
     * @return ShowFeatureChildrenResponse
     */
    public ShowFeatureChildrenResponse showFeatureChildren(ShowFeatureChildrenRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.showFeatureChildren);
    }

    /**
     * 获取目录\\特性树
     *
     * 获取目录\\特性树
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFeatureChildrenRequest 请求对象
     * @return SyncInvoker<ShowFeatureChildrenRequest, ShowFeatureChildrenResponse>
     */
    public SyncInvoker<ShowFeatureChildrenRequest, ShowFeatureChildrenResponse> showFeatureChildrenInvoker(
        ShowFeatureChildrenRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.showFeatureChildren, hcClient);
    }

    /**
     * 查询限时免费用户免责声明记录
     *
     * 查询限时免费用户免责声明记录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFreeDeclarationRequest 请求对象
     * @return ShowFreeDeclarationResponse
     */
    public ShowFreeDeclarationResponse showFreeDeclaration(ShowFreeDeclarationRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.showFreeDeclaration);
    }

    /**
     * 查询限时免费用户免责声明记录
     *
     * 查询限时免费用户免责声明记录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFreeDeclarationRequest 请求对象
     * @return SyncInvoker<ShowFreeDeclarationRequest, ShowFreeDeclarationResponse>
     */
    public SyncInvoker<ShowFreeDeclarationRequest, ShowFreeDeclarationResponse> showFreeDeclarationInvoker(
        ShowFreeDeclarationRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.showFreeDeclaration, hcClient);
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
     * 查询缺陷相关联测试计划
     *
     * 查询缺陷相关联测试计划
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowIteratorByDefectRequest 请求对象
     * @return ShowIteratorByDefectResponse
     */
    public ShowIteratorByDefectResponse showIteratorByDefect(ShowIteratorByDefectRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.showIteratorByDefect);
    }

    /**
     * 查询缺陷相关联测试计划
     *
     * 查询缺陷相关联测试计划
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowIteratorByDefectRequest 请求对象
     * @return SyncInvoker<ShowIteratorByDefectRequest, ShowIteratorByDefectResponse>
     */
    public SyncInvoker<ShowIteratorByDefectRequest, ShowIteratorByDefectResponse> showIteratorByDefectInvoker(
        ShowIteratorByDefectRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.showIteratorByDefect, hcClient);
    }

    /**
     * 根据条件分页获取脑图对象V3
     *
     * 根据条件分页获取脑图对象V3
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMindmapByPageRequest 请求对象
     * @return ShowMindmapByPageResponse
     */
    public ShowMindmapByPageResponse showMindmapByPage(ShowMindmapByPageRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.showMindmapByPage);
    }

    /**
     * 根据条件分页获取脑图对象V3
     *
     * 根据条件分页获取脑图对象V3
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMindmapByPageRequest 请求对象
     * @return SyncInvoker<ShowMindmapByPageRequest, ShowMindmapByPageResponse>
     */
    public SyncInvoker<ShowMindmapByPageRequest, ShowMindmapByPageResponse> showMindmapByPageInvoker(
        ShowMindmapByPageRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.showMindmapByPage, hcClient);
    }

    /**
     * 获取脑图创建人V2
     *
     * 获取脑图创建人V2
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMindmapCreatorNameRequest 请求对象
     * @return ShowMindmapCreatorNameResponse
     */
    public ShowMindmapCreatorNameResponse showMindmapCreatorName(ShowMindmapCreatorNameRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.showMindmapCreatorName);
    }

    /**
     * 获取脑图创建人V2
     *
     * 获取脑图创建人V2
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMindmapCreatorNameRequest 请求对象
     * @return SyncInvoker<ShowMindmapCreatorNameRequest, ShowMindmapCreatorNameResponse>
     */
    public SyncInvoker<ShowMindmapCreatorNameRequest, ShowMindmapCreatorNameResponse> showMindmapCreatorNameInvoker(
        ShowMindmapCreatorNameRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.showMindmapCreatorName, hcClient);
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
     * 获取异步进度
     *
     * 获取异步进度
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowProgressRequest 请求对象
     * @return ShowProgressResponse
     */
    public ShowProgressResponse showProgress(ShowProgressRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.showProgress);
    }

    /**
     * 获取异步进度
     *
     * 获取异步进度
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowProgressRequest 请求对象
     * @return SyncInvoker<ShowProgressRequest, ShowProgressResponse>
     */
    public SyncInvoker<ShowProgressRequest, ShowProgressResponse> showProgressInvoker(ShowProgressRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.showProgress, hcClient);
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
     * 质量报告需求测试情况统计
     *
     * 质量报告需求测试情况统计
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRequirementsOverviewRequest 请求对象
     * @return ShowRequirementsOverviewResponse
     */
    public ShowRequirementsOverviewResponse showRequirementsOverview(ShowRequirementsOverviewRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.showRequirementsOverview);
    }

    /**
     * 质量报告需求测试情况统计
     *
     * 质量报告需求测试情况统计
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRequirementsOverviewRequest 请求对象
     * @return SyncInvoker<ShowRequirementsOverviewRequest, ShowRequirementsOverviewResponse>
     */
    public SyncInvoker<ShowRequirementsOverviewRequest, ShowRequirementsOverviewResponse> showRequirementsOverviewInvoker(
        ShowRequirementsOverviewRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.showRequirementsOverview, hcClient);
    }

    /**
     * 根据入参动态查询系统配置中的信息
     *
     * 根据入参动态查询系统配置中的信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSystemConfigsRequest 请求对象
     * @return ShowSystemConfigsResponse
     */
    public ShowSystemConfigsResponse showSystemConfigs(ShowSystemConfigsRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.showSystemConfigs);
    }

    /**
     * 根据入参动态查询系统配置中的信息
     *
     * 根据入参动态查询系统配置中的信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSystemConfigsRequest 请求对象
     * @return SyncInvoker<ShowSystemConfigsRequest, ShowSystemConfigsResponse>
     */
    public SyncInvoker<ShowSystemConfigsRequest, ShowSystemConfigsResponse> showSystemConfigsInvoker(
        ShowSystemConfigsRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.showSystemConfigs, hcClient);
    }

    /**
     * 查询用例详情
     *
     * 查询用例详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTestCaseRequest 请求对象
     * @return ShowTestCaseResponse
     */
    public ShowTestCaseResponse showTestCase(ShowTestCaseRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.showTestCase);
    }

    /**
     * 查询用例详情
     *
     * 查询用例详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTestCaseRequest 请求对象
     * @return SyncInvoker<ShowTestCaseRequest, ShowTestCaseResponse>
     */
    public SyncInvoker<ShowTestCaseRequest, ShowTestCaseResponse> showTestCaseInvoker(ShowTestCaseRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.showTestCase, hcClient);
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
     * 获取租户订单信息
     *
     * 获取租户订单信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowUserAccessInfoRequest 请求对象
     * @return ShowUserAccessInfoResponse
     */
    public ShowUserAccessInfoResponse showUserAccessInfo(ShowUserAccessInfoRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.showUserAccessInfo);
    }

    /**
     * 获取租户订单信息
     *
     * 获取租户订单信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowUserAccessInfoRequest 请求对象
     * @return SyncInvoker<ShowUserAccessInfoRequest, ShowUserAccessInfoResponse>
     */
    public SyncInvoker<ShowUserAccessInfoRequest, ShowUserAccessInfoResponse> showUserAccessInfoInvoker(
        ShowUserAccessInfoRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.showUserAccessInfo, hcClient);
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
     * 查询告警组列表
     *
     * 查询告警组列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAlertGroupsByConditionRequest 请求对象
     * @return ListAlertGroupsByConditionResponse
     */
    public ListAlertGroupsByConditionResponse listAlertGroupsByCondition(ListAlertGroupsByConditionRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.listAlertGroupsByCondition);
    }

    /**
     * 查询告警组列表
     *
     * 查询告警组列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAlertGroupsByConditionRequest 请求对象
     * @return SyncInvoker<ListAlertGroupsByConditionRequest, ListAlertGroupsByConditionResponse>
     */
    public SyncInvoker<ListAlertGroupsByConditionRequest, ListAlertGroupsByConditionResponse> listAlertGroupsByConditionInvoker(
        ListAlertGroupsByConditionRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.listAlertGroupsByCondition, hcClient);
    }

    /**
     * 查询告警模板
     *
     * 查询告警模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAlertTemplatesRequest 请求对象
     * @return ListAlertTemplatesResponse
     */
    public ListAlertTemplatesResponse listAlertTemplates(ListAlertTemplatesRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.listAlertTemplates);
    }

    /**
     * 查询告警模板
     *
     * 查询告警模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAlertTemplatesRequest 请求对象
     * @return SyncInvoker<ListAlertTemplatesRequest, ListAlertTemplatesResponse>
     */
    public SyncInvoker<ListAlertTemplatesRequest, ListAlertTemplatesResponse> listAlertTemplatesInvoker(
        ListAlertTemplatesRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.listAlertTemplates, hcClient);
    }

    /**
     * 查询任务告警信息
     *
     * 查询任务告警信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAllConfigItemByTypeRequest 请求对象
     * @return ListAllConfigItemByTypeResponse
     */
    public ListAllConfigItemByTypeResponse listAllConfigItemByType(ListAllConfigItemByTypeRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.listAllConfigItemByType);
    }

    /**
     * 查询任务告警信息
     *
     * 查询任务告警信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAllConfigItemByTypeRequest 请求对象
     * @return SyncInvoker<ListAllConfigItemByTypeRequest, ListAllConfigItemByTypeResponse>
     */
    public SyncInvoker<ListAllConfigItemByTypeRequest, ListAllConfigItemByTypeResponse> listAllConfigItemByTypeInvoker(
        ListAllConfigItemByTypeRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.listAllConfigItemByType, hcClient);
    }

    /**
     * 保存任务配置
     *
     * 保存任务配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SaveTaskSettingRequest 请求对象
     * @return SaveTaskSettingResponse
     */
    public SaveTaskSettingResponse saveTaskSetting(SaveTaskSettingRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.saveTaskSetting);
    }

    /**
     * 保存任务配置
     *
     * 保存任务配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SaveTaskSettingRequest 请求对象
     * @return SyncInvoker<SaveTaskSettingRequest, SaveTaskSettingResponse>
     */
    public SyncInvoker<SaveTaskSettingRequest, SaveTaskSettingResponse> saveTaskSettingInvoker(
        SaveTaskSettingRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.saveTaskSetting, hcClient);
    }

    /**
     * 查询任务配置
     *
     * 查询任务配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAllConfigValueByTypeAndKeyRequest 请求对象
     * @return ShowAllConfigValueByTypeAndKeyResponse
     */
    public ShowAllConfigValueByTypeAndKeyResponse showAllConfigValueByTypeAndKey(
        ShowAllConfigValueByTypeAndKeyRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.showAllConfigValueByTypeAndKey);
    }

    /**
     * 查询任务配置
     *
     * 查询任务配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAllConfigValueByTypeAndKeyRequest 请求对象
     * @return SyncInvoker<ShowAllConfigValueByTypeAndKeyRequest, ShowAllConfigValueByTypeAndKeyResponse>
     */
    public SyncInvoker<ShowAllConfigValueByTypeAndKeyRequest, ShowAllConfigValueByTypeAndKeyResponse> showAllConfigValueByTypeAndKeyInvoker(
        ShowAllConfigValueByTypeAndKeyRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.showAllConfigValueByTypeAndKey, hcClient);
    }

    /**
     * 查询告警模板名称是否重复
     *
     * 查询告警模板名称是否重复
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowIfTaskNameRepeatRequest 请求对象
     * @return ShowIfTaskNameRepeatResponse
     */
    public ShowIfTaskNameRepeatResponse showIfTaskNameRepeat(ShowIfTaskNameRepeatRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.showIfTaskNameRepeat);
    }

    /**
     * 查询告警模板名称是否重复
     *
     * 查询告警模板名称是否重复
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowIfTaskNameRepeatRequest 请求对象
     * @return SyncInvoker<ShowIfTaskNameRepeatRequest, ShowIfTaskNameRepeatResponse>
     */
    public SyncInvoker<ShowIfTaskNameRepeatRequest, ShowIfTaskNameRepeatResponse> showIfTaskNameRepeatInvoker(
        ShowIfTaskNameRepeatRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.showIfTaskNameRepeat, hcClient);
    }

    /**
     * 查询告警组用户名是否重复
     *
     * 查询告警组用户名是否重复
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowIfUserNameRepeatRequest 请求对象
     * @return ShowIfUserNameRepeatResponse
     */
    public ShowIfUserNameRepeatResponse showIfUserNameRepeat(ShowIfUserNameRepeatRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.showIfUserNameRepeat);
    }

    /**
     * 查询告警组用户名是否重复
     *
     * 查询告警组用户名是否重复
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowIfUserNameRepeatRequest 请求对象
     * @return SyncInvoker<ShowIfUserNameRepeatRequest, ShowIfUserNameRepeatResponse>
     */
    public SyncInvoker<ShowIfUserNameRepeatRequest, ShowIfUserNameRepeatResponse> showIfUserNameRepeatInvoker(
        ShowIfUserNameRepeatRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.showIfUserNameRepeat, hcClient);
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

    /**
     * 根据id获取单个basicAW信息
     *
     * 根据id获取单个basicAW信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBasicAwRequest 请求对象
     * @return ListBasicAwResponse
     */
    public ListBasicAwResponse listBasicAw(ListBasicAwRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.listBasicAw);
    }

    /**
     * 根据id获取单个basicAW信息
     *
     * 根据id获取单个basicAW信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBasicAwRequest 请求对象
     * @return SyncInvoker<ListBasicAwRequest, ListBasicAwResponse>
     */
    public SyncInvoker<ListBasicAwRequest, ListBasicAwResponse> listBasicAwInvoker(ListBasicAwRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.listBasicAw, hcClient);
    }

    /**
     * 获取工程关联的公共aw信息和公共aw所属公共aw库信息
     *
     * 获取工程关联的公共aw信息和公共aw所属公共aw库信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPublicLibAndAwsRequest 请求对象
     * @return ListPublicLibAndAwsResponse
     */
    public ListPublicLibAndAwsResponse listPublicLibAndAws(ListPublicLibAndAwsRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.listPublicLibAndAws);
    }

    /**
     * 获取工程关联的公共aw信息和公共aw所属公共aw库信息
     *
     * 获取工程关联的公共aw信息和公共aw所属公共aw库信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPublicLibAndAwsRequest 请求对象
     * @return SyncInvoker<ListPublicLibAndAwsRequest, ListPublicLibAndAwsResponse>
     */
    public SyncInvoker<ListPublicLibAndAwsRequest, ListPublicLibAndAwsResponse> listPublicLibAndAwsInvoker(
        ListPublicLibAndAwsRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.listPublicLibAndAws, hcClient);
    }

    /**
     * 查询用户DNS映射
     *
     * 查询用户DNS映射
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUserDnsMappingRequest 请求对象
     * @return ListUserDnsMappingResponse
     */
    public ListUserDnsMappingResponse listUserDnsMapping(ListUserDnsMappingRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.listUserDnsMapping);
    }

    /**
     * 查询用户DNS映射
     *
     * 查询用户DNS映射
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUserDnsMappingRequest 请求对象
     * @return SyncInvoker<ListUserDnsMappingRequest, ListUserDnsMappingResponse>
     */
    public SyncInvoker<ListUserDnsMappingRequest, ListUserDnsMappingResponse> listUserDnsMappingInvoker(
        ListUserDnsMappingRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.listUserDnsMapping, hcClient);
    }

    /**
     * 查询全局变量参数列表V4
     *
     * 查询全局变量参数列表V4
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVariablesRequest 请求对象
     * @return ListVariablesResponse
     */
    public ListVariablesResponse listVariables(ListVariablesRequest request) {
        return hcClient.syncInvokeHttp(request, CloudtestMeta.listVariables);
    }

    /**
     * 查询全局变量参数列表V4
     *
     * 查询全局变量参数列表V4
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVariablesRequest 请求对象
     * @return SyncInvoker<ListVariablesRequest, ListVariablesResponse>
     */
    public SyncInvoker<ListVariablesRequest, ListVariablesResponse> listVariablesInvoker(ListVariablesRequest request) {
        return new SyncInvoker<>(request, CloudtestMeta.listVariables, hcClient);
    }

}
