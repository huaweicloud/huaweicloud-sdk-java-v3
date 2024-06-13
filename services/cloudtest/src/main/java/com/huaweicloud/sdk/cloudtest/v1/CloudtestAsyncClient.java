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
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;

import java.util.concurrent.CompletableFuture;

public class CloudtestAsyncClient {

    protected HcClient hcClient;

    public CloudtestAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<CloudtestAsyncClient> newBuilder() {
        ClientBuilder<CloudtestAsyncClient> clientBuilder = new ClientBuilder<>(CloudtestAsyncClient::new);
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
     * @return CompletableFuture<BatchAddRelationsByOneCaseResponse>
     */
    public CompletableFuture<BatchAddRelationsByOneCaseResponse> batchAddRelationsByOneCaseAsync(
        BatchAddRelationsByOneCaseRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.batchAddRelationsByOneCase);
    }

    /**
     * 添加需求/缺陷和多个用例关联关系
     *
     * 添加需求/缺陷和多个用例关联关系
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchAddRelationsByOneCaseRequest 请求对象
     * @return AsyncInvoker<BatchAddRelationsByOneCaseRequest, BatchAddRelationsByOneCaseResponse>
     */
    public AsyncInvoker<BatchAddRelationsByOneCaseRequest, BatchAddRelationsByOneCaseResponse> batchAddRelationsByOneCaseAsyncInvoker(
        BatchAddRelationsByOneCaseRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.batchAddRelationsByOneCase, hcClient);
    }

    /**
     * 批量删除自定义测试服务类型用例
     *
     * 批量删除自定义测试服务类型用例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteTestCaseRequest 请求对象
     * @return CompletableFuture<BatchDeleteTestCaseResponse>
     */
    public CompletableFuture<BatchDeleteTestCaseResponse> batchDeleteTestCaseAsync(BatchDeleteTestCaseRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.batchDeleteTestCase);
    }

    /**
     * 批量删除自定义测试服务类型用例
     *
     * 批量删除自定义测试服务类型用例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteTestCaseRequest 请求对象
     * @return AsyncInvoker<BatchDeleteTestCaseRequest, BatchDeleteTestCaseResponse>
     */
    public AsyncInvoker<BatchDeleteTestCaseRequest, BatchDeleteTestCaseResponse> batchDeleteTestCaseAsyncInvoker(
        BatchDeleteTestCaseRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.batchDeleteTestCase, hcClient);
    }

    /**
     * 根据测试报告uri列表，删除测试报告
     *
     * 根据测试报告uri列表，删除测试报告
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteTestReportRequest 请求对象
     * @return CompletableFuture<BatchDeleteTestReportResponse>
     */
    public CompletableFuture<BatchDeleteTestReportResponse> batchDeleteTestReportAsync(
        BatchDeleteTestReportRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.batchDeleteTestReport);
    }

    /**
     * 根据测试报告uri列表，删除测试报告
     *
     * 根据测试报告uri列表，删除测试报告
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteTestReportRequest 请求对象
     * @return AsyncInvoker<BatchDeleteTestReportRequest, BatchDeleteTestReportResponse>
     */
    public AsyncInvoker<BatchDeleteTestReportRequest, BatchDeleteTestReportResponse> batchDeleteTestReportAsyncInvoker(
        BatchDeleteTestReportRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.batchDeleteTestReport, hcClient);
    }

    /**
     * 检查项目权限
     *
     * 检查项目权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckPermissionRequest 请求对象
     * @return CompletableFuture<CheckPermissionResponse>
     */
    public CompletableFuture<CheckPermissionResponse> checkPermissionAsync(CheckPermissionRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.checkPermission);
    }

    /**
     * 检查项目权限
     *
     * 检查项目权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckPermissionRequest 请求对象
     * @return AsyncInvoker<CheckPermissionRequest, CheckPermissionResponse>
     */
    public AsyncInvoker<CheckPermissionRequest, CheckPermissionResponse> checkPermissionAsyncInvoker(
        CheckPermissionRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.checkPermission, hcClient);
    }

    /**
     * 项目下创建计划
     *
     * 项目下创建计划
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePlanRequest 请求对象
     * @return CompletableFuture<CreatePlanResponse>
     */
    public CompletableFuture<CreatePlanResponse> createPlanAsync(CreatePlanRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.createPlan);
    }

    /**
     * 项目下创建计划
     *
     * 项目下创建计划
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePlanRequest 请求对象
     * @return AsyncInvoker<CreatePlanRequest, CreatePlanResponse>
     */
    public AsyncInvoker<CreatePlanRequest, CreatePlanResponse> createPlanAsyncInvoker(CreatePlanRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.createPlan, hcClient);
    }

    /**
     * 添加一个用例和多个需求/缺陷关联关系
     *
     * 添加一个用例和多个需求/缺陷关联关系
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateRelationsByOneCaseRequest 请求对象
     * @return CompletableFuture<CreateRelationsByOneCaseResponse>
     */
    public CompletableFuture<CreateRelationsByOneCaseResponse> createRelationsByOneCaseAsync(
        CreateRelationsByOneCaseRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.createRelationsByOneCase);
    }

    /**
     * 添加一个用例和多个需求/缺陷关联关系
     *
     * 添加一个用例和多个需求/缺陷关联关系
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateRelationsByOneCaseRequest 请求对象
     * @return AsyncInvoker<CreateRelationsByOneCaseRequest, CreateRelationsByOneCaseResponse>
     */
    public AsyncInvoker<CreateRelationsByOneCaseRequest, CreateRelationsByOneCaseResponse> createRelationsByOneCaseAsyncInvoker(
        CreateRelationsByOneCaseRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.createRelationsByOneCase, hcClient);
    }

    /**
     * 生成资源URI
     *
     * 生成资源URI
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateResourceUriRequest 请求对象
     * @return CompletableFuture<CreateResourceUriResponse>
     */
    public CompletableFuture<CreateResourceUriResponse> createResourceUriAsync(CreateResourceUriRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.createResourceUri);
    }

    /**
     * 生成资源URI
     *
     * 生成资源URI
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateResourceUriRequest 请求对象
     * @return AsyncInvoker<CreateResourceUriRequest, CreateResourceUriResponse>
     */
    public AsyncInvoker<CreateResourceUriRequest, CreateResourceUriResponse> createResourceUriAsyncInvoker(
        CreateResourceUriRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.createResourceUri, hcClient);
    }

    /**
     * 新测试类型服务注册
     *
     * 通过接口CreateService注册成为自定义服务。 注册完成后界面将会出现此自定义测试类型。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateServiceRequest 请求对象
     * @return CompletableFuture<CreateServiceResponse>
     */
    public CompletableFuture<CreateServiceResponse> createServiceAsync(CreateServiceRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.createService);
    }

    /**
     * 新测试类型服务注册
     *
     * 通过接口CreateService注册成为自定义服务。 注册完成后界面将会出现此自定义测试类型。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateServiceRequest 请求对象
     * @return AsyncInvoker<CreateServiceRequest, CreateServiceResponse>
     */
    public AsyncInvoker<CreateServiceRequest, CreateServiceResponse> createServiceAsyncInvoker(
        CreateServiceRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.createService, hcClient);
    }

    /**
     * 创建自定义测试服务类型用例
     *
     * 创建自定义测试服务类型用例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTestCaseRequest 请求对象
     * @return CompletableFuture<CreateTestCaseResponse>
     */
    public CompletableFuture<CreateTestCaseResponse> createTestCaseAsync(CreateTestCaseRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.createTestCase);
    }

    /**
     * 创建自定义测试服务类型用例
     *
     * 创建自定义测试服务类型用例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTestCaseRequest 请求对象
     * @return AsyncInvoker<CreateTestCaseRequest, CreateTestCaseResponse>
     */
    public AsyncInvoker<CreateTestCaseRequest, CreateTestCaseResponse> createTestCaseAsyncInvoker(
        CreateTestCaseRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.createTestCase, hcClient);
    }

    /**
     * 计划中批量添加测试用例
     *
     * 计划中批量添加测试用例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTestCaseInPlanRequest 请求对象
     * @return CompletableFuture<CreateTestCaseInPlanResponse>
     */
    public CompletableFuture<CreateTestCaseInPlanResponse> createTestCaseInPlanAsync(
        CreateTestCaseInPlanRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.createTestCaseInPlan);
    }

    /**
     * 计划中批量添加测试用例
     *
     * 计划中批量添加测试用例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTestCaseInPlanRequest 请求对象
     * @return AsyncInvoker<CreateTestCaseInPlanRequest, CreateTestCaseInPlanResponse>
     */
    public AsyncInvoker<CreateTestCaseInPlanRequest, CreateTestCaseInPlanResponse> createTestCaseInPlanAsyncInvoker(
        CreateTestCaseInPlanRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.createTestCaseInPlan, hcClient);
    }

    /**
     * 删除一个用例和多个需求/缺陷关联关系
     *
     * 删除一个用例和多个需求/缺陷关联关系
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteRelationsByOneCaseRequest 请求对象
     * @return CompletableFuture<DeleteRelationsByOneCaseResponse>
     */
    public CompletableFuture<DeleteRelationsByOneCaseResponse> deleteRelationsByOneCaseAsync(
        DeleteRelationsByOneCaseRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.deleteRelationsByOneCase);
    }

    /**
     * 删除一个用例和多个需求/缺陷关联关系
     *
     * 删除一个用例和多个需求/缺陷关联关系
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteRelationsByOneCaseRequest 请求对象
     * @return AsyncInvoker<DeleteRelationsByOneCaseRequest, DeleteRelationsByOneCaseResponse>
     */
    public AsyncInvoker<DeleteRelationsByOneCaseRequest, DeleteRelationsByOneCaseResponse> deleteRelationsByOneCaseAsyncInvoker(
        DeleteRelationsByOneCaseRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.deleteRelationsByOneCase, hcClient);
    }

    /**
     * 删除已注册服务
     *
     * 删除已注册服务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteServiceRequest 请求对象
     * @return CompletableFuture<DeleteServiceResponse>
     */
    public CompletableFuture<DeleteServiceResponse> deleteServiceAsync(DeleteServiceRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.deleteService);
    }

    /**
     * 删除已注册服务
     *
     * 删除已注册服务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteServiceRequest 请求对象
     * @return AsyncInvoker<DeleteServiceRequest, DeleteServiceResponse>
     */
    public AsyncInvoker<DeleteServiceRequest, DeleteServiceResponse> deleteServiceAsyncInvoker(
        DeleteServiceRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.deleteService, hcClient);
    }

    /**
     * 获取分支列表
     *
     * 获取分支列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAllBranchesRequest 请求对象
     * @return CompletableFuture<ListAllBranchesResponse>
     */
    public CompletableFuture<ListAllBranchesResponse> listAllBranchesAsync(ListAllBranchesRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.listAllBranches);
    }

    /**
     * 获取分支列表
     *
     * 获取分支列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAllBranchesRequest 请求对象
     * @return AsyncInvoker<ListAllBranchesRequest, ListAllBranchesResponse>
     */
    public AsyncInvoker<ListAllBranchesRequest, ListAllBranchesResponse> listAllBranchesAsyncInvoker(
        ListAllBranchesRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.listAllBranches, hcClient);
    }

    /**
     * 查询项目下所有迭代计划
     *
     * 查询项目下所有迭代计划
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAllIteratorsRequest 请求对象
     * @return CompletableFuture<ListAllIteratorsResponse>
     */
    public CompletableFuture<ListAllIteratorsResponse> listAllIteratorsAsync(ListAllIteratorsRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.listAllIterators);
    }

    /**
     * 查询项目下所有迭代计划
     *
     * 查询项目下所有迭代计划
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAllIteratorsRequest 请求对象
     * @return AsyncInvoker<ListAllIteratorsRequest, ListAllIteratorsResponse>
     */
    public AsyncInvoker<ListAllIteratorsRequest, ListAllIteratorsResponse> listAllIteratorsAsyncInvoker(
        ListAllIteratorsRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.listAllIterators, hcClient);
    }

    /**
     * 查询附件列表
     *
     * 查询附件列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAttachmentsRequest 请求对象
     * @return CompletableFuture<ListAttachmentsResponse>
     */
    public CompletableFuture<ListAttachmentsResponse> listAttachmentsAsync(ListAttachmentsRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.listAttachments);
    }

    /**
     * 查询附件列表
     *
     * 查询附件列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAttachmentsRequest 请求对象
     * @return AsyncInvoker<ListAttachmentsRequest, ListAttachmentsResponse>
     */
    public AsyncInvoker<ListAttachmentsRequest, ListAttachmentsResponse> listAttachmentsAsyncInvoker(
        ListAttachmentsRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.listAttachments, hcClient);
    }

    /**
     * 获取分支列表
     *
     * 获取分支列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBranchesRequest 请求对象
     * @return CompletableFuture<ListBranchesResponse>
     */
    public CompletableFuture<ListBranchesResponse> listBranchesAsync(ListBranchesRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.listBranches);
    }

    /**
     * 获取分支列表
     *
     * 获取分支列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBranchesRequest 请求对象
     * @return AsyncInvoker<ListBranchesRequest, ListBranchesResponse>
     */
    public AsyncInvoker<ListBranchesRequest, ListBranchesResponse> listBranchesAsyncInvoker(
        ListBranchesRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.listBranches, hcClient);
    }

    /**
     * 查询需求树
     *
     * 查询需求树
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListIssueTreeRequest 请求对象
     * @return CompletableFuture<ListIssueTreeResponse>
     */
    public CompletableFuture<ListIssueTreeResponse> listIssueTreeAsync(ListIssueTreeRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.listIssueTree);
    }

    /**
     * 查询需求树
     *
     * 查询需求树
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListIssueTreeRequest 请求对象
     * @return AsyncInvoker<ListIssueTreeRequest, ListIssueTreeResponse>
     */
    public AsyncInvoker<ListIssueTreeRequest, ListIssueTreeResponse> listIssueTreeAsyncInvoker(
        ListIssueTreeRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.listIssueTree, hcClient);
    }

    /**
     * 查询项目字段配置
     *
     * 查询项目字段配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectFieldConfigsRequest 请求对象
     * @return CompletableFuture<ListProjectFieldConfigsResponse>
     */
    public CompletableFuture<ListProjectFieldConfigsResponse> listProjectFieldConfigsAsync(
        ListProjectFieldConfigsRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.listProjectFieldConfigs);
    }

    /**
     * 查询项目字段配置
     *
     * 查询项目字段配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectFieldConfigsRequest 请求对象
     * @return AsyncInvoker<ListProjectFieldConfigsRequest, ListProjectFieldConfigsResponse>
     */
    public AsyncInvoker<ListProjectFieldConfigsRequest, ListProjectFieldConfigsResponse> listProjectFieldConfigsAsyncInvoker(
        ListProjectFieldConfigsRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.listProjectFieldConfigs, hcClient);
    }

    /**
     * 获取项目测试用例自定义字段列表
     *
     * 获取项目测试用例自定义字段列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectTestCaseFieldsRequest 请求对象
     * @return CompletableFuture<ListProjectTestCaseFieldsResponse>
     */
    public CompletableFuture<ListProjectTestCaseFieldsResponse> listProjectTestCaseFieldsAsync(
        ListProjectTestCaseFieldsRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.listProjectTestCaseFields);
    }

    /**
     * 获取项目测试用例自定义字段列表
     *
     * 获取项目测试用例自定义字段列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectTestCaseFieldsRequest 请求对象
     * @return AsyncInvoker<ListProjectTestCaseFieldsRequest, ListProjectTestCaseFieldsResponse>
     */
    public AsyncInvoker<ListProjectTestCaseFieldsRequest, ListProjectTestCaseFieldsResponse> listProjectTestCaseFieldsAsyncInvoker(
        ListProjectTestCaseFieldsRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.listProjectTestCaseFields, hcClient);
    }

    /**
     * 页面报表展示
     *
     * 页面报表展示
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListReportsRequest 请求对象
     * @return CompletableFuture<ListReportsResponse>
     */
    public CompletableFuture<ListReportsResponse> listReportsAsync(ListReportsRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.listReports);
    }

    /**
     * 页面报表展示
     *
     * 页面报表展示
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListReportsRequest 请求对象
     * @return AsyncInvoker<ListReportsRequest, ListReportsResponse>
     */
    public AsyncInvoker<ListReportsRequest, ListReportsResponse> listReportsAsyncInvoker(ListReportsRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.listReports, hcClient);
    }

    /**
     * 获取资源池列表
     *
     * 获取资源池列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListResourcePoolsRequest 请求对象
     * @return CompletableFuture<ListResourcePoolsResponse>
     */
    public CompletableFuture<ListResourcePoolsResponse> listResourcePoolsAsync(ListResourcePoolsRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.listResourcePools);
    }

    /**
     * 获取资源池列表
     *
     * 获取资源池列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListResourcePoolsRequest 请求对象
     * @return AsyncInvoker<ListResourcePoolsRequest, ListResourcePoolsResponse>
     */
    public AsyncInvoker<ListResourcePoolsRequest, ListResourcePoolsResponse> listResourcePoolsAsyncInvoker(
        ListResourcePoolsRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.listResourcePools, hcClient);
    }

    /**
     * 查询用例关联的测试任务列表
     *
     * 查询用例关联的测试任务列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTaskTestCasesRequest 请求对象
     * @return CompletableFuture<ListTaskTestCasesResponse>
     */
    public CompletableFuture<ListTaskTestCasesResponse> listTaskTestCasesAsync(ListTaskTestCasesRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.listTaskTestCases);
    }

    /**
     * 查询用例关联的测试任务列表
     *
     * 查询用例关联的测试任务列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTaskTestCasesRequest 请求对象
     * @return AsyncInvoker<ListTaskTestCasesRequest, ListTaskTestCasesResponse>
     */
    public AsyncInvoker<ListTaskTestCasesRequest, ListTaskTestCasesResponse> listTaskTestCasesAsyncInvoker(
        ListTaskTestCasesRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.listTaskTestCases, hcClient);
    }

    /**
     * 查询用例修改历史记录
     *
     * 查询用例修改历史记录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTestCaseHistoriesRequest 请求对象
     * @return CompletableFuture<ListTestCaseHistoriesResponse>
     */
    public CompletableFuture<ListTestCaseHistoriesResponse> listTestCaseHistoriesAsync(
        ListTestCaseHistoriesRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.listTestCaseHistories);
    }

    /**
     * 查询用例修改历史记录
     *
     * 查询用例修改历史记录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTestCaseHistoriesRequest 请求对象
     * @return AsyncInvoker<ListTestCaseHistoriesRequest, ListTestCaseHistoriesResponse>
     */
    public AsyncInvoker<ListTestCaseHistoriesRequest, ListTestCaseHistoriesResponse> listTestCaseHistoriesAsyncInvoker(
        ListTestCaseHistoriesRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.listTestCaseHistories, hcClient);
    }

    /**
     * 查询用例列表
     *
     * 查询用例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTestCasesRequest 请求对象
     * @return CompletableFuture<ListTestCasesResponse>
     */
    public CompletableFuture<ListTestCasesResponse> listTestCasesAsync(ListTestCasesRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.listTestCases);
    }

    /**
     * 查询用例列表
     *
     * 查询用例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTestCasesRequest 请求对象
     * @return AsyncInvoker<ListTestCasesRequest, ListTestCasesResponse>
     */
    public AsyncInvoker<ListTestCasesRequest, ListTestCasesResponse> listTestCasesAsyncInvoker(
        ListTestCasesRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.listTestCases, hcClient);
    }

    /**
     * 根据查询条件获取测试报告列表
     *
     * 根据查询条件获取测试报告列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTestReportsByConditionRequest 请求对象
     * @return CompletableFuture<ListTestReportsByConditionResponse>
     */
    public CompletableFuture<ListTestReportsByConditionResponse> listTestReportsByConditionAsync(
        ListTestReportsByConditionRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.listTestReportsByCondition);
    }

    /**
     * 根据查询条件获取测试报告列表
     *
     * 根据查询条件获取测试报告列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTestReportsByConditionRequest 请求对象
     * @return AsyncInvoker<ListTestReportsByConditionRequest, ListTestReportsByConditionResponse>
     */
    public AsyncInvoker<ListTestReportsByConditionRequest, ListTestReportsByConditionResponse> listTestReportsByConditionAsyncInvoker(
        ListTestReportsByConditionRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.listTestReportsByCondition, hcClient);
    }

    /**
     * 获取测试类型列表
     *
     * 获取测试类型列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTestTypesRequest 请求对象
     * @return CompletableFuture<ListTestTypesResponse>
     */
    public CompletableFuture<ListTestTypesResponse> listTestTypesAsync(ListTestTypesRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.listTestTypes);
    }

    /**
     * 获取测试类型列表
     *
     * 获取测试类型列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTestTypesRequest 请求对象
     * @return AsyncInvoker<ListTestTypesRequest, ListTestTypesResponse>
     */
    public AsyncInvoker<ListTestTypesRequest, ListTestTypesResponse> listTestTypesAsyncInvoker(
        ListTestTypesRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.listTestTypes, hcClient);
    }

    /**
     * 查询项目下关联了需求的用例列表
     *
     * 查询项目下关联了需求的用例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTestcasesByProjectIssuesRelationRequest 请求对象
     * @return CompletableFuture<ListTestcasesByProjectIssuesRelationResponse>
     */
    public CompletableFuture<ListTestcasesByProjectIssuesRelationResponse> listTestcasesByProjectIssuesRelationAsync(
        ListTestcasesByProjectIssuesRelationRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.listTestcasesByProjectIssuesRelation);
    }

    /**
     * 查询项目下关联了需求的用例列表
     *
     * 查询项目下关联了需求的用例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTestcasesByProjectIssuesRelationRequest 请求对象
     * @return AsyncInvoker<ListTestcasesByProjectIssuesRelationRequest, ListTestcasesByProjectIssuesRelationResponse>
     */
    public AsyncInvoker<ListTestcasesByProjectIssuesRelationRequest, ListTestcasesByProjectIssuesRelationResponse> listTestcasesByProjectIssuesRelationAsyncInvoker(
        ListTestcasesByProjectIssuesRelationRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.listTestcasesByProjectIssuesRelation, hcClient);
    }

    /**
     * 获取租户订单已用资源信息
     *
     * 获取租户订单已用资源信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUsageInfosRequest 请求对象
     * @return CompletableFuture<ListUsageInfosResponse>
     */
    public CompletableFuture<ListUsageInfosResponse> listUsageInfosAsync(ListUsageInfosRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.listUsageInfos);
    }

    /**
     * 获取租户订单已用资源信息
     *
     * 获取租户订单已用资源信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUsageInfosRequest 请求对象
     * @return AsyncInvoker<ListUsageInfosRequest, ListUsageInfosResponse>
     */
    public AsyncInvoker<ListUsageInfosRequest, ListUsageInfosResponse> listUsageInfosAsyncInvoker(
        ListUsageInfosRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.listUsageInfos, hcClient);
    }

    /**
     * ListUserPackageUsage
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUserPackageUsageRequest 请求对象
     * @return CompletableFuture<ListUserPackageUsageResponse>
     */
    public CompletableFuture<ListUserPackageUsageResponse> listUserPackageUsageAsync(
        ListUserPackageUsageRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.listUserPackageUsage);
    }

    /**
     * ListUserPackageUsage
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUserPackageUsageRequest 请求对象
     * @return AsyncInvoker<ListUserPackageUsageRequest, ListUserPackageUsageResponse>
     */
    public AsyncInvoker<ListUserPackageUsageRequest, ListUserPackageUsageResponse> listUserPackageUsageAsyncInvoker(
        ListUserPackageUsageRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.listUserPackageUsage, hcClient);
    }

    /**
     * ListUserPopupInfo
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUserPopupInfoRequest 请求对象
     * @return CompletableFuture<ListUserPopupInfoResponse>
     */
    public CompletableFuture<ListUserPopupInfoResponse> listUserPopupInfoAsync(ListUserPopupInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.listUserPopupInfo);
    }

    /**
     * ListUserPopupInfo
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUserPopupInfoRequest 请求对象
     * @return AsyncInvoker<ListUserPopupInfoRequest, ListUserPopupInfoResponse>
     */
    public AsyncInvoker<ListUserPopupInfoRequest, ListUserPopupInfoResponse> listUserPopupInfoAsyncInvoker(
        ListUserPopupInfoRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.listUserPopupInfo, hcClient);
    }

    /**
     * 批量执行测试用例
     *
     * 批量执行测试用例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RunTestCaseRequest 请求对象
     * @return CompletableFuture<RunTestCaseResponse>
     */
    public CompletableFuture<RunTestCaseResponse> runTestCaseAsync(RunTestCaseRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.runTestCase);
    }

    /**
     * 批量执行测试用例
     *
     * 批量执行测试用例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RunTestCaseRequest 请求对象
     * @return AsyncInvoker<RunTestCaseRequest, RunTestCaseResponse>
     */
    public AsyncInvoker<RunTestCaseRequest, RunTestCaseResponse> runTestCaseAsyncInvoker(RunTestCaseRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.runTestCase, hcClient);
    }

    /**
     * 获取特性树V5
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAllFeatureChildrenRequest 请求对象
     * @return CompletableFuture<ShowAllFeatureChildrenResponse>
     */
    public CompletableFuture<ShowAllFeatureChildrenResponse> showAllFeatureChildrenAsync(
        ShowAllFeatureChildrenRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.showAllFeatureChildren);
    }

    /**
     * 获取特性树V5
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAllFeatureChildrenRequest 请求对象
     * @return AsyncInvoker<ShowAllFeatureChildrenRequest, ShowAllFeatureChildrenResponse>
     */
    public AsyncInvoker<ShowAllFeatureChildrenRequest, ShowAllFeatureChildrenResponse> showAllFeatureChildrenAsyncInvoker(
        ShowAllFeatureChildrenRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.showAllFeatureChildren, hcClient);
    }

    /**
     * 获取用例历史执行数据
     *
     * 获取用例历史执行数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowApiTestcaseHistoriesRequest 请求对象
     * @return CompletableFuture<ShowApiTestcaseHistoriesResponse>
     */
    public CompletableFuture<ShowApiTestcaseHistoriesResponse> showApiTestcaseHistoriesAsync(
        ShowApiTestcaseHistoriesRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.showApiTestcaseHistories);
    }

    /**
     * 获取用例历史执行数据
     *
     * 获取用例历史执行数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowApiTestcaseHistoriesRequest 请求对象
     * @return AsyncInvoker<ShowApiTestcaseHistoriesRequest, ShowApiTestcaseHistoriesResponse>
     */
    public AsyncInvoker<ShowApiTestcaseHistoriesRequest, ShowApiTestcaseHistoriesResponse> showApiTestcaseHistoriesAsyncInvoker(
        ShowApiTestcaseHistoriesRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.showApiTestcaseHistories, hcClient);
    }

    /**
     * 获取测试报告的模板设置
     *
     * 获取测试报告的模板设置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBackgroundInfoRequest 请求对象
     * @return CompletableFuture<ShowBackgroundInfoResponse>
     */
    public CompletableFuture<ShowBackgroundInfoResponse> showBackgroundInfoAsync(ShowBackgroundInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.showBackgroundInfo);
    }

    /**
     * 获取测试报告的模板设置
     *
     * 获取测试报告的模板设置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBackgroundInfoRequest 请求对象
     * @return AsyncInvoker<ShowBackgroundInfoRequest, ShowBackgroundInfoResponse>
     */
    public AsyncInvoker<ShowBackgroundInfoRequest, ShowBackgroundInfoResponse> showBackgroundInfoAsyncInvoker(
        ShowBackgroundInfoRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.showBackgroundInfo, hcClient);
    }

    /**
     * 查询用户免责声明
     *
     * 查询用户免责声明
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDisclaimerRecordRequest 请求对象
     * @return CompletableFuture<ShowDisclaimerRecordResponse>
     */
    public CompletableFuture<ShowDisclaimerRecordResponse> showDisclaimerRecordAsync(
        ShowDisclaimerRecordRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.showDisclaimerRecord);
    }

    /**
     * 查询用户免责声明
     *
     * 查询用户免责声明
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDisclaimerRecordRequest 请求对象
     * @return AsyncInvoker<ShowDisclaimerRecordRequest, ShowDisclaimerRecordResponse>
     */
    public AsyncInvoker<ShowDisclaimerRecordRequest, ShowDisclaimerRecordResponse> showDisclaimerRecordAsyncInvoker(
        ShowDisclaimerRecordRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.showDisclaimerRecord, hcClient);
    }

    /**
     * 根据domainId获取加密的testbirdkey
     *
     * 根据domainId获取加密的testbirdkey
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDomainInfoRequest 请求对象
     * @return CompletableFuture<ShowDomainInfoResponse>
     */
    public CompletableFuture<ShowDomainInfoResponse> showDomainInfoAsync(ShowDomainInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.showDomainInfo);
    }

    /**
     * 根据domainId获取加密的testbirdkey
     *
     * 根据domainId获取加密的testbirdkey
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDomainInfoRequest 请求对象
     * @return AsyncInvoker<ShowDomainInfoRequest, ShowDomainInfoResponse>
     */
    public AsyncInvoker<ShowDomainInfoRequest, ShowDomainInfoResponse> showDomainInfoAsyncInvoker(
        ShowDomainInfoRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.showDomainInfo, hcClient);
    }

    /**
     * 获取目录\\特性树
     *
     * 获取目录\\特性树
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFeatureChildrenRequest 请求对象
     * @return CompletableFuture<ShowFeatureChildrenResponse>
     */
    public CompletableFuture<ShowFeatureChildrenResponse> showFeatureChildrenAsync(ShowFeatureChildrenRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.showFeatureChildren);
    }

    /**
     * 获取目录\\特性树
     *
     * 获取目录\\特性树
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFeatureChildrenRequest 请求对象
     * @return AsyncInvoker<ShowFeatureChildrenRequest, ShowFeatureChildrenResponse>
     */
    public AsyncInvoker<ShowFeatureChildrenRequest, ShowFeatureChildrenResponse> showFeatureChildrenAsyncInvoker(
        ShowFeatureChildrenRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.showFeatureChildren, hcClient);
    }

    /**
     * 查询限时免费用户免责声明记录
     *
     * 查询限时免费用户免责声明记录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFreeDeclarationRequest 请求对象
     * @return CompletableFuture<ShowFreeDeclarationResponse>
     */
    public CompletableFuture<ShowFreeDeclarationResponse> showFreeDeclarationAsync(ShowFreeDeclarationRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.showFreeDeclaration);
    }

    /**
     * 查询限时免费用户免责声明记录
     *
     * 查询限时免费用户免责声明记录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFreeDeclarationRequest 请求对象
     * @return AsyncInvoker<ShowFreeDeclarationRequest, ShowFreeDeclarationResponse>
     */
    public AsyncInvoker<ShowFreeDeclarationRequest, ShowFreeDeclarationResponse> showFreeDeclarationAsyncInvoker(
        ShowFreeDeclarationRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.showFreeDeclaration, hcClient);
    }

    /**
     * 查询某个测试计划下的需求树
     *
     * 查询某个测试计划下的需求列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowIssuesByPlanIdRequest 请求对象
     * @return CompletableFuture<ShowIssuesByPlanIdResponse>
     */
    public CompletableFuture<ShowIssuesByPlanIdResponse> showIssuesByPlanIdAsync(ShowIssuesByPlanIdRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.showIssuesByPlanId);
    }

    /**
     * 查询某个测试计划下的需求树
     *
     * 查询某个测试计划下的需求列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowIssuesByPlanIdRequest 请求对象
     * @return AsyncInvoker<ShowIssuesByPlanIdRequest, ShowIssuesByPlanIdResponse>
     */
    public AsyncInvoker<ShowIssuesByPlanIdRequest, ShowIssuesByPlanIdResponse> showIssuesByPlanIdAsyncInvoker(
        ShowIssuesByPlanIdRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.showIssuesByPlanId, hcClient);
    }

    /**
     * 查询缺陷相关联测试计划
     *
     * 查询缺陷相关联测试计划
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowIteratorByDefectRequest 请求对象
     * @return CompletableFuture<ShowIteratorByDefectResponse>
     */
    public CompletableFuture<ShowIteratorByDefectResponse> showIteratorByDefectAsync(
        ShowIteratorByDefectRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.showIteratorByDefect);
    }

    /**
     * 查询缺陷相关联测试计划
     *
     * 查询缺陷相关联测试计划
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowIteratorByDefectRequest 请求对象
     * @return AsyncInvoker<ShowIteratorByDefectRequest, ShowIteratorByDefectResponse>
     */
    public AsyncInvoker<ShowIteratorByDefectRequest, ShowIteratorByDefectResponse> showIteratorByDefectAsyncInvoker(
        ShowIteratorByDefectRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.showIteratorByDefect, hcClient);
    }

    /**
     * 根据条件分页获取脑图对象V3
     *
     * 根据条件分页获取脑图对象V3
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMindmapByPageRequest 请求对象
     * @return CompletableFuture<ShowMindmapByPageResponse>
     */
    public CompletableFuture<ShowMindmapByPageResponse> showMindmapByPageAsync(ShowMindmapByPageRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.showMindmapByPage);
    }

    /**
     * 根据条件分页获取脑图对象V3
     *
     * 根据条件分页获取脑图对象V3
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMindmapByPageRequest 请求对象
     * @return AsyncInvoker<ShowMindmapByPageRequest, ShowMindmapByPageResponse>
     */
    public AsyncInvoker<ShowMindmapByPageRequest, ShowMindmapByPageResponse> showMindmapByPageAsyncInvoker(
        ShowMindmapByPageRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.showMindmapByPage, hcClient);
    }

    /**
     * 获取脑图创建人V2
     *
     * 获取脑图创建人V2
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMindmapCreatorNameRequest 请求对象
     * @return CompletableFuture<ShowMindmapCreatorNameResponse>
     */
    public CompletableFuture<ShowMindmapCreatorNameResponse> showMindmapCreatorNameAsync(
        ShowMindmapCreatorNameRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.showMindmapCreatorName);
    }

    /**
     * 获取脑图创建人V2
     *
     * 获取脑图创建人V2
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMindmapCreatorNameRequest 请求对象
     * @return AsyncInvoker<ShowMindmapCreatorNameRequest, ShowMindmapCreatorNameResponse>
     */
    public AsyncInvoker<ShowMindmapCreatorNameRequest, ShowMindmapCreatorNameResponse> showMindmapCreatorNameAsyncInvoker(
        ShowMindmapCreatorNameRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.showMindmapCreatorName, hcClient);
    }

    /**
     * 查询某测试计划下的操作历史
     *
     * 查询某测试计划下的操作历史
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPlanJournalsRequest 请求对象
     * @return CompletableFuture<ShowPlanJournalsResponse>
     */
    public CompletableFuture<ShowPlanJournalsResponse> showPlanJournalsAsync(ShowPlanJournalsRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.showPlanJournals);
    }

    /**
     * 查询某测试计划下的操作历史
     *
     * 查询某测试计划下的操作历史
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPlanJournalsRequest 请求对象
     * @return AsyncInvoker<ShowPlanJournalsRequest, ShowPlanJournalsResponse>
     */
    public AsyncInvoker<ShowPlanJournalsRequest, ShowPlanJournalsResponse> showPlanJournalsAsyncInvoker(
        ShowPlanJournalsRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.showPlanJournals, hcClient);
    }

    /**
     * 项目下查询测试计划列表v2
     *
     * 项目下查询测试计划列表v2
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPlanListRequest 请求对象
     * @return CompletableFuture<ShowPlanListResponse>
     */
    public CompletableFuture<ShowPlanListResponse> showPlanListAsync(ShowPlanListRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.showPlanList);
    }

    /**
     * 项目下查询测试计划列表v2
     *
     * 项目下查询测试计划列表v2
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPlanListRequest 请求对象
     * @return AsyncInvoker<ShowPlanListRequest, ShowPlanListResponse>
     */
    public AsyncInvoker<ShowPlanListRequest, ShowPlanListResponse> showPlanListAsyncInvoker(
        ShowPlanListRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.showPlanList, hcClient);
    }

    /**
     * 项目下查询测试计划列表
     *
     * 项目下查询测试计划列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPlansRequest 请求对象
     * @return CompletableFuture<ShowPlansResponse>
     */
    public CompletableFuture<ShowPlansResponse> showPlansAsync(ShowPlansRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.showPlans);
    }

    /**
     * 项目下查询测试计划列表
     *
     * 项目下查询测试计划列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPlansRequest 请求对象
     * @return AsyncInvoker<ShowPlansRequest, ShowPlansResponse>
     */
    public AsyncInvoker<ShowPlansRequest, ShowPlansResponse> showPlansAsyncInvoker(ShowPlansRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.showPlans, hcClient);
    }

    /**
     * 获取异步进度
     *
     * 获取异步进度
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowProgressRequest 请求对象
     * @return CompletableFuture<ShowProgressResponse>
     */
    public CompletableFuture<ShowProgressResponse> showProgressAsync(ShowProgressRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.showProgress);
    }

    /**
     * 获取异步进度
     *
     * 获取异步进度
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowProgressRequest 请求对象
     * @return AsyncInvoker<ShowProgressRequest, ShowProgressResponse>
     */
    public AsyncInvoker<ShowProgressRequest, ShowProgressResponse> showProgressAsyncInvoker(
        ShowProgressRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.showProgress, hcClient);
    }

    /**
     * 查询质量报告看板统计信息
     *
     * 查询质量报告看板统计信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowProjectDataDashboardRequest 请求对象
     * @return CompletableFuture<ShowProjectDataDashboardResponse>
     */
    public CompletableFuture<ShowProjectDataDashboardResponse> showProjectDataDashboardAsync(
        ShowProjectDataDashboardRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.showProjectDataDashboard);
    }

    /**
     * 查询质量报告看板统计信息
     *
     * 查询质量报告看板统计信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowProjectDataDashboardRequest 请求对象
     * @return AsyncInvoker<ShowProjectDataDashboardRequest, ShowProjectDataDashboardResponse>
     */
    public AsyncInvoker<ShowProjectDataDashboardRequest, ShowProjectDataDashboardResponse> showProjectDataDashboardAsyncInvoker(
        ShowProjectDataDashboardRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.showProjectDataDashboard, hcClient);
    }

    /**
     * 用户获取自己当前已经注册的服务
     *
     * 用户获取自己当前已经注册的服务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRegisterServiceRequest 请求对象
     * @return CompletableFuture<ShowRegisterServiceResponse>
     */
    public CompletableFuture<ShowRegisterServiceResponse> showRegisterServiceAsync(ShowRegisterServiceRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.showRegisterService);
    }

    /**
     * 用户获取自己当前已经注册的服务
     *
     * 用户获取自己当前已经注册的服务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRegisterServiceRequest 请求对象
     * @return AsyncInvoker<ShowRegisterServiceRequest, ShowRegisterServiceResponse>
     */
    public AsyncInvoker<ShowRegisterServiceRequest, ShowRegisterServiceResponse> showRegisterServiceAsyncInvoker(
        ShowRegisterServiceRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.showRegisterService, hcClient);
    }

    /**
     * 实时计算单个自定义报表
     *
     * 实时计算单个自定义报表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowReportRequest 请求对象
     * @return CompletableFuture<ShowReportResponse>
     */
    public CompletableFuture<ShowReportResponse> showReportAsync(ShowReportRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.showReport);
    }

    /**
     * 实时计算单个自定义报表
     *
     * 实时计算单个自定义报表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowReportRequest 请求对象
     * @return AsyncInvoker<ShowReportRequest, ShowReportResponse>
     */
    public AsyncInvoker<ShowReportRequest, ShowReportResponse> showReportAsyncInvoker(ShowReportRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.showReport, hcClient);
    }

    /**
     * 质量报告需求测试情况统计
     *
     * 质量报告需求测试情况统计
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRequirementsOverviewRequest 请求对象
     * @return CompletableFuture<ShowRequirementsOverviewResponse>
     */
    public CompletableFuture<ShowRequirementsOverviewResponse> showRequirementsOverviewAsync(
        ShowRequirementsOverviewRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.showRequirementsOverview);
    }

    /**
     * 质量报告需求测试情况统计
     *
     * 质量报告需求测试情况统计
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRequirementsOverviewRequest 请求对象
     * @return AsyncInvoker<ShowRequirementsOverviewRequest, ShowRequirementsOverviewResponse>
     */
    public AsyncInvoker<ShowRequirementsOverviewRequest, ShowRequirementsOverviewResponse> showRequirementsOverviewAsyncInvoker(
        ShowRequirementsOverviewRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.showRequirementsOverview, hcClient);
    }

    /**
     * 根据入参动态查询系统配置中的信息
     *
     * 根据入参动态查询系统配置中的信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSystemConfigsRequest 请求对象
     * @return CompletableFuture<ShowSystemConfigsResponse>
     */
    public CompletableFuture<ShowSystemConfigsResponse> showSystemConfigsAsync(ShowSystemConfigsRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.showSystemConfigs);
    }

    /**
     * 根据入参动态查询系统配置中的信息
     *
     * 根据入参动态查询系统配置中的信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSystemConfigsRequest 请求对象
     * @return AsyncInvoker<ShowSystemConfigsRequest, ShowSystemConfigsResponse>
     */
    public AsyncInvoker<ShowSystemConfigsRequest, ShowSystemConfigsResponse> showSystemConfigsAsyncInvoker(
        ShowSystemConfigsRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.showSystemConfigs, hcClient);
    }

    /**
     * 查询用例详情
     *
     * 查询用例详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTestCaseRequest 请求对象
     * @return CompletableFuture<ShowTestCaseResponse>
     */
    public CompletableFuture<ShowTestCaseResponse> showTestCaseAsync(ShowTestCaseRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.showTestCase);
    }

    /**
     * 查询用例详情
     *
     * 查询用例详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTestCaseRequest 请求对象
     * @return AsyncInvoker<ShowTestCaseRequest, ShowTestCaseResponse>
     */
    public AsyncInvoker<ShowTestCaseRequest, ShowTestCaseResponse> showTestCaseAsyncInvoker(
        ShowTestCaseRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.showTestCase, hcClient);
    }

    /**
     * 查询用户用例关联缺陷的统计信息
     *
     * 查询用户用例关联缺陷的统计信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTestCaseAndDefectInfoRequest 请求对象
     * @return CompletableFuture<ShowTestCaseAndDefectInfoResponse>
     */
    public CompletableFuture<ShowTestCaseAndDefectInfoResponse> showTestCaseAndDefectInfoAsync(
        ShowTestCaseAndDefectInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.showTestCaseAndDefectInfo);
    }

    /**
     * 查询用户用例关联缺陷的统计信息
     *
     * 查询用户用例关联缺陷的统计信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTestCaseAndDefectInfoRequest 请求对象
     * @return AsyncInvoker<ShowTestCaseAndDefectInfoRequest, ShowTestCaseAndDefectInfoResponse>
     */
    public AsyncInvoker<ShowTestCaseAndDefectInfoRequest, ShowTestCaseAndDefectInfoResponse> showTestCaseAndDefectInfoAsyncInvoker(
        ShowTestCaseAndDefectInfoRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.showTestCaseAndDefectInfo, hcClient);
    }

    /**
     * 获取测试用例详情
     *
     * 获取测试用例详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTestCaseDetailRequest 请求对象
     * @return CompletableFuture<ShowTestCaseDetailResponse>
     */
    public CompletableFuture<ShowTestCaseDetailResponse> showTestCaseDetailAsync(ShowTestCaseDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.showTestCaseDetail);
    }

    /**
     * 获取测试用例详情
     *
     * 获取测试用例详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTestCaseDetailRequest 请求对象
     * @return AsyncInvoker<ShowTestCaseDetailRequest, ShowTestCaseDetailResponse>
     */
    public AsyncInvoker<ShowTestCaseDetailRequest, ShowTestCaseDetailResponse> showTestCaseDetailAsyncInvoker(
        ShowTestCaseDetailRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.showTestCaseDetail, hcClient);
    }

    /**
     * 通过用例编号获取测试用例详情
     *
     * 通过用例编号获取测试用例详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTestCaseDetailV2Request 请求对象
     * @return CompletableFuture<ShowTestCaseDetailV2Response>
     */
    public CompletableFuture<ShowTestCaseDetailV2Response> showTestCaseDetailV2Async(
        ShowTestCaseDetailV2Request request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.showTestCaseDetailV2);
    }

    /**
     * 通过用例编号获取测试用例详情
     *
     * 通过用例编号获取测试用例详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTestCaseDetailV2Request 请求对象
     * @return AsyncInvoker<ShowTestCaseDetailV2Request, ShowTestCaseDetailV2Response>
     */
    public AsyncInvoker<ShowTestCaseDetailV2Request, ShowTestCaseDetailV2Response> showTestCaseDetailV2AsyncInvoker(
        ShowTestCaseDetailV2Request request) {
        return new AsyncInvoker<>(request, CloudtestMeta.showTestCaseDetailV2, hcClient);
    }

    /**
     * 获取租户订单信息
     *
     * 获取租户订单信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowUserAccessInfoRequest 请求对象
     * @return CompletableFuture<ShowUserAccessInfoResponse>
     */
    public CompletableFuture<ShowUserAccessInfoResponse> showUserAccessInfoAsync(ShowUserAccessInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.showUserAccessInfo);
    }

    /**
     * 获取租户订单信息
     *
     * 获取租户订单信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowUserAccessInfoRequest 请求对象
     * @return AsyncInvoker<ShowUserAccessInfoRequest, ShowUserAccessInfoResponse>
     */
    public AsyncInvoker<ShowUserAccessInfoRequest, ShowUserAccessInfoResponse> showUserAccessInfoAsyncInvoker(
        ShowUserAccessInfoRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.showUserAccessInfo, hcClient);
    }

    /**
     * 查询时段内用例的执行情况
     *
     * 查询时段内用例的执行情况
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowUserExecuteTestCaseInfoRequest 请求对象
     * @return CompletableFuture<ShowUserExecuteTestCaseInfoResponse>
     */
    public CompletableFuture<ShowUserExecuteTestCaseInfoResponse> showUserExecuteTestCaseInfoAsync(
        ShowUserExecuteTestCaseInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.showUserExecuteTestCaseInfo);
    }

    /**
     * 查询时段内用例的执行情况
     *
     * 查询时段内用例的执行情况
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowUserExecuteTestCaseInfoRequest 请求对象
     * @return AsyncInvoker<ShowUserExecuteTestCaseInfoRequest, ShowUserExecuteTestCaseInfoResponse>
     */
    public AsyncInvoker<ShowUserExecuteTestCaseInfoRequest, ShowUserExecuteTestCaseInfoResponse> showUserExecuteTestCaseInfoAsyncInvoker(
        ShowUserExecuteTestCaseInfoRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.showUserExecuteTestCaseInfo, hcClient);
    }

    /**
     * 更新已注册服务
     *
     * 更新已注册服务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateServiceRequest 请求对象
     * @return CompletableFuture<UpdateServiceResponse>
     */
    public CompletableFuture<UpdateServiceResponse> updateServiceAsync(UpdateServiceRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.updateService);
    }

    /**
     * 更新已注册服务
     *
     * 更新已注册服务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateServiceRequest 请求对象
     * @return AsyncInvoker<UpdateServiceRequest, UpdateServiceResponse>
     */
    public AsyncInvoker<UpdateServiceRequest, UpdateServiceResponse> updateServiceAsyncInvoker(
        UpdateServiceRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.updateService, hcClient);
    }

    /**
     * 更新自定义测试服务类型用例
     *
     * 更新自定义测试服务类型用例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTestCaseRequest 请求对象
     * @return CompletableFuture<UpdateTestCaseResponse>
     */
    public CompletableFuture<UpdateTestCaseResponse> updateTestCaseAsync(UpdateTestCaseRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.updateTestCase);
    }

    /**
     * 更新自定义测试服务类型用例
     *
     * 更新自定义测试服务类型用例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTestCaseRequest 请求对象
     * @return AsyncInvoker<UpdateTestCaseRequest, UpdateTestCaseResponse>
     */
    public AsyncInvoker<UpdateTestCaseRequest, UpdateTestCaseResponse> updateTestCaseAsyncInvoker(
        UpdateTestCaseRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.updateTestCase, hcClient);
    }

    /**
     * 批量更新测试用例结果
     *
     * 批量更新测试用例结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTestCaseResultRequest 请求对象
     * @return CompletableFuture<UpdateTestCaseResultResponse>
     */
    public CompletableFuture<UpdateTestCaseResultResponse> updateTestCaseResultAsync(
        UpdateTestCaseResultRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.updateTestCaseResult);
    }

    /**
     * 批量更新测试用例结果
     *
     * 批量更新测试用例结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTestCaseResultRequest 请求对象
     * @return AsyncInvoker<UpdateTestCaseResultRequest, UpdateTestCaseResultResponse>
     */
    public AsyncInvoker<UpdateTestCaseResultRequest, UpdateTestCaseResultResponse> updateTestCaseResultAsyncInvoker(
        UpdateTestCaseResultRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.updateTestCaseResult, hcClient);
    }

    /**
     * 通过导入仓库中的文件生成接口测试套
     *
     * 通过导入仓库中的文件生成接口测试套
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateApiTestSuiteByRepoFileRequest 请求对象
     * @return CompletableFuture<CreateApiTestSuiteByRepoFileResponse>
     */
    public CompletableFuture<CreateApiTestSuiteByRepoFileResponse> createApiTestSuiteByRepoFileAsync(
        CreateApiTestSuiteByRepoFileRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.createApiTestSuiteByRepoFile);
    }

    /**
     * 通过导入仓库中的文件生成接口测试套
     *
     * 通过导入仓库中的文件生成接口测试套
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateApiTestSuiteByRepoFileRequest 请求对象
     * @return AsyncInvoker<CreateApiTestSuiteByRepoFileRequest, CreateApiTestSuiteByRepoFileResponse>
     */
    public AsyncInvoker<CreateApiTestSuiteByRepoFileRequest, CreateApiTestSuiteByRepoFileResponse> createApiTestSuiteByRepoFileAsyncInvoker(
        CreateApiTestSuiteByRepoFileRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.createApiTestSuiteByRepoFile, hcClient);
    }

    /**
     * 查询告警组列表
     *
     * 查询告警组列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAlertGroupsByConditionRequest 请求对象
     * @return CompletableFuture<ListAlertGroupsByConditionResponse>
     */
    public CompletableFuture<ListAlertGroupsByConditionResponse> listAlertGroupsByConditionAsync(
        ListAlertGroupsByConditionRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.listAlertGroupsByCondition);
    }

    /**
     * 查询告警组列表
     *
     * 查询告警组列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAlertGroupsByConditionRequest 请求对象
     * @return AsyncInvoker<ListAlertGroupsByConditionRequest, ListAlertGroupsByConditionResponse>
     */
    public AsyncInvoker<ListAlertGroupsByConditionRequest, ListAlertGroupsByConditionResponse> listAlertGroupsByConditionAsyncInvoker(
        ListAlertGroupsByConditionRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.listAlertGroupsByCondition, hcClient);
    }

    /**
     * 查询告警模板
     *
     * 查询告警模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAlertTemplatesRequest 请求对象
     * @return CompletableFuture<ListAlertTemplatesResponse>
     */
    public CompletableFuture<ListAlertTemplatesResponse> listAlertTemplatesAsync(ListAlertTemplatesRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.listAlertTemplates);
    }

    /**
     * 查询告警模板
     *
     * 查询告警模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAlertTemplatesRequest 请求对象
     * @return AsyncInvoker<ListAlertTemplatesRequest, ListAlertTemplatesResponse>
     */
    public AsyncInvoker<ListAlertTemplatesRequest, ListAlertTemplatesResponse> listAlertTemplatesAsyncInvoker(
        ListAlertTemplatesRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.listAlertTemplates, hcClient);
    }

    /**
     * 查询任务告警信息
     *
     * 查询任务告警信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAllConfigItemByTypeRequest 请求对象
     * @return CompletableFuture<ListAllConfigItemByTypeResponse>
     */
    public CompletableFuture<ListAllConfigItemByTypeResponse> listAllConfigItemByTypeAsync(
        ListAllConfigItemByTypeRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.listAllConfigItemByType);
    }

    /**
     * 查询任务告警信息
     *
     * 查询任务告警信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAllConfigItemByTypeRequest 请求对象
     * @return AsyncInvoker<ListAllConfigItemByTypeRequest, ListAllConfigItemByTypeResponse>
     */
    public AsyncInvoker<ListAllConfigItemByTypeRequest, ListAllConfigItemByTypeResponse> listAllConfigItemByTypeAsyncInvoker(
        ListAllConfigItemByTypeRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.listAllConfigItemByType, hcClient);
    }

    /**
     * 保存任务配置
     *
     * 保存任务配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SaveTaskSettingRequest 请求对象
     * @return CompletableFuture<SaveTaskSettingResponse>
     */
    public CompletableFuture<SaveTaskSettingResponse> saveTaskSettingAsync(SaveTaskSettingRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.saveTaskSetting);
    }

    /**
     * 保存任务配置
     *
     * 保存任务配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SaveTaskSettingRequest 请求对象
     * @return AsyncInvoker<SaveTaskSettingRequest, SaveTaskSettingResponse>
     */
    public AsyncInvoker<SaveTaskSettingRequest, SaveTaskSettingResponse> saveTaskSettingAsyncInvoker(
        SaveTaskSettingRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.saveTaskSetting, hcClient);
    }

    /**
     * 查询任务配置
     *
     * 查询任务配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAllConfigValueByTypeAndKeyRequest 请求对象
     * @return CompletableFuture<ShowAllConfigValueByTypeAndKeyResponse>
     */
    public CompletableFuture<ShowAllConfigValueByTypeAndKeyResponse> showAllConfigValueByTypeAndKeyAsync(
        ShowAllConfigValueByTypeAndKeyRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.showAllConfigValueByTypeAndKey);
    }

    /**
     * 查询任务配置
     *
     * 查询任务配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAllConfigValueByTypeAndKeyRequest 请求对象
     * @return AsyncInvoker<ShowAllConfigValueByTypeAndKeyRequest, ShowAllConfigValueByTypeAndKeyResponse>
     */
    public AsyncInvoker<ShowAllConfigValueByTypeAndKeyRequest, ShowAllConfigValueByTypeAndKeyResponse> showAllConfigValueByTypeAndKeyAsyncInvoker(
        ShowAllConfigValueByTypeAndKeyRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.showAllConfigValueByTypeAndKey, hcClient);
    }

    /**
     * 查询告警模板名称是否重复
     *
     * 查询告警模板名称是否重复
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowIfTaskNameRepeatRequest 请求对象
     * @return CompletableFuture<ShowIfTaskNameRepeatResponse>
     */
    public CompletableFuture<ShowIfTaskNameRepeatResponse> showIfTaskNameRepeatAsync(
        ShowIfTaskNameRepeatRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.showIfTaskNameRepeat);
    }

    /**
     * 查询告警模板名称是否重复
     *
     * 查询告警模板名称是否重复
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowIfTaskNameRepeatRequest 请求对象
     * @return AsyncInvoker<ShowIfTaskNameRepeatRequest, ShowIfTaskNameRepeatResponse>
     */
    public AsyncInvoker<ShowIfTaskNameRepeatRequest, ShowIfTaskNameRepeatResponse> showIfTaskNameRepeatAsyncInvoker(
        ShowIfTaskNameRepeatRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.showIfTaskNameRepeat, hcClient);
    }

    /**
     * 查询告警组用户名是否重复
     *
     * 查询告警组用户名是否重复
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowIfUserNameRepeatRequest 请求对象
     * @return CompletableFuture<ShowIfUserNameRepeatResponse>
     */
    public CompletableFuture<ShowIfUserNameRepeatResponse> showIfUserNameRepeatAsync(
        ShowIfUserNameRepeatRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.showIfUserNameRepeat);
    }

    /**
     * 查询告警组用户名是否重复
     *
     * 查询告警组用户名是否重复
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowIfUserNameRepeatRequest 请求对象
     * @return AsyncInvoker<ShowIfUserNameRepeatRequest, ShowIfUserNameRepeatResponse>
     */
    public AsyncInvoker<ShowIfUserNameRepeatRequest, ShowIfUserNameRepeatResponse> showIfUserNameRepeatAsyncInvoker(
        ShowIfUserNameRepeatRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.showIfUserNameRepeat, hcClient);
    }

    /**
     * 获取环境参数分组列表
     *
     * 获取环境参数分组列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEnvironmentsRequest 请求对象
     * @return CompletableFuture<ListEnvironmentsResponse>
     */
    public CompletableFuture<ListEnvironmentsResponse> listEnvironmentsAsync(ListEnvironmentsRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.listEnvironments);
    }

    /**
     * 获取环境参数分组列表
     *
     * 获取环境参数分组列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEnvironmentsRequest 请求对象
     * @return AsyncInvoker<ListEnvironmentsRequest, ListEnvironmentsResponse>
     */
    public AsyncInvoker<ListEnvironmentsRequest, ListEnvironmentsResponse> listEnvironmentsAsyncInvoker(
        ListEnvironmentsRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.listEnvironments, hcClient);
    }

    /**
     * 根据id获取单个basicAW信息
     *
     * 根据id获取单个basicAW信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBasicAwRequest 请求对象
     * @return CompletableFuture<ListBasicAwResponse>
     */
    public CompletableFuture<ListBasicAwResponse> listBasicAwAsync(ListBasicAwRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.listBasicAw);
    }

    /**
     * 根据id获取单个basicAW信息
     *
     * 根据id获取单个basicAW信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBasicAwRequest 请求对象
     * @return AsyncInvoker<ListBasicAwRequest, ListBasicAwResponse>
     */
    public AsyncInvoker<ListBasicAwRequest, ListBasicAwResponse> listBasicAwAsyncInvoker(ListBasicAwRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.listBasicAw, hcClient);
    }

    /**
     * 获取工程关联的公共aw信息和公共aw所属公共aw库信息
     *
     * 获取工程关联的公共aw信息和公共aw所属公共aw库信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPublicLibAndAwsRequest 请求对象
     * @return CompletableFuture<ListPublicLibAndAwsResponse>
     */
    public CompletableFuture<ListPublicLibAndAwsResponse> listPublicLibAndAwsAsync(ListPublicLibAndAwsRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.listPublicLibAndAws);
    }

    /**
     * 获取工程关联的公共aw信息和公共aw所属公共aw库信息
     *
     * 获取工程关联的公共aw信息和公共aw所属公共aw库信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPublicLibAndAwsRequest 请求对象
     * @return AsyncInvoker<ListPublicLibAndAwsRequest, ListPublicLibAndAwsResponse>
     */
    public AsyncInvoker<ListPublicLibAndAwsRequest, ListPublicLibAndAwsResponse> listPublicLibAndAwsAsyncInvoker(
        ListPublicLibAndAwsRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.listPublicLibAndAws, hcClient);
    }

    /**
     * 查询用户DNS映射
     *
     * 查询用户DNS映射
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUserDnsMappingRequest 请求对象
     * @return CompletableFuture<ListUserDnsMappingResponse>
     */
    public CompletableFuture<ListUserDnsMappingResponse> listUserDnsMappingAsync(ListUserDnsMappingRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.listUserDnsMapping);
    }

    /**
     * 查询用户DNS映射
     *
     * 查询用户DNS映射
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUserDnsMappingRequest 请求对象
     * @return AsyncInvoker<ListUserDnsMappingRequest, ListUserDnsMappingResponse>
     */
    public AsyncInvoker<ListUserDnsMappingRequest, ListUserDnsMappingResponse> listUserDnsMappingAsyncInvoker(
        ListUserDnsMappingRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.listUserDnsMapping, hcClient);
    }

    /**
     * 查询全局变量参数列表V4
     *
     * 查询全局变量参数列表V4
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVariablesRequest 请求对象
     * @return CompletableFuture<ListVariablesResponse>
     */
    public CompletableFuture<ListVariablesResponse> listVariablesAsync(ListVariablesRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.listVariables);
    }

    /**
     * 查询全局变量参数列表V4
     *
     * 查询全局变量参数列表V4
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVariablesRequest 请求对象
     * @return AsyncInvoker<ListVariablesRequest, ListVariablesResponse>
     */
    public AsyncInvoker<ListVariablesRequest, ListVariablesResponse> listVariablesAsyncInvoker(
        ListVariablesRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.listVariables, hcClient);
    }

}
