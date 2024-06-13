package com.huaweicloud.sdk.cloudtest.v1;

import com.huaweicloud.sdk.cloudtest.v1.model.AddRelationsInfo;
import com.huaweicloud.sdk.cloudtest.v1.model.BatchAddRelationsByOneCaseRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.BatchAddRelationsByOneCaseResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.BatchDeleteTestCaseRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.BatchDeleteTestCaseRequestBody;
import com.huaweicloud.sdk.cloudtest.v1.model.BatchDeleteTestCaseResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.BatchDeleteTestReportRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.BatchDeleteTestReportResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.CheckPermissionRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.CheckPermissionResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.CommRequestMindmapPageParamV3;
import com.huaweicloud.sdk.cloudtest.v1.model.CommRequestSystemConfig;
import com.huaweicloud.sdk.cloudtest.v1.model.CreateApiTestSuiteByRepoFileRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.CreateApiTestSuiteByRepoFileResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.CreatePlanRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.CreatePlanRequestBody;
import com.huaweicloud.sdk.cloudtest.v1.model.CreatePlanResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.CreateRelationsByOneCaseRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.CreateRelationsByOneCaseResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.CreateResourceUriRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.CreateResourceUriResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.CreateServiceRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.CreateServiceResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.CreateTestCaseInPlanRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.CreateTestCaseInPlanRequestBody;
import com.huaweicloud.sdk.cloudtest.v1.model.CreateTestCaseInPlanResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.CreateTestCaseRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.CreateTestCaseRequestBody;
import com.huaweicloud.sdk.cloudtest.v1.model.CreateTestCaseResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.CreateTestSuitByRepoFileInfo;
import com.huaweicloud.sdk.cloudtest.v1.model.DeleteRelationsByOneCaseInfo;
import com.huaweicloud.sdk.cloudtest.v1.model.DeleteRelationsByOneCaseRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.DeleteRelationsByOneCaseResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.DeleteServiceRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.DeleteServiceResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.GenerateReportInfo;
import com.huaweicloud.sdk.cloudtest.v1.model.ListAlertGroupsByConditionRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ListAlertGroupsByConditionRequestBody;
import com.huaweicloud.sdk.cloudtest.v1.model.ListAlertGroupsByConditionResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ListAlertTemplatesRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ListAlertTemplatesResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ListAllBranchesRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ListAllBranchesResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ListAllConfigItemByTypeRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ListAllConfigItemByTypeRequestBody;
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
import com.huaweicloud.sdk.cloudtest.v1.model.ListTestCaseHistoriesRequestBody;
import com.huaweicloud.sdk.cloudtest.v1.model.ListTestCaseHistoriesResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ListTestCasesRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ListTestCasesRequestBody;
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
import com.huaweicloud.sdk.cloudtest.v1.model.QueryIssueTreeInfo;
import com.huaweicloud.sdk.cloudtest.v1.model.QueryProjectIssuesRelationTestCasesInfo;
import com.huaweicloud.sdk.cloudtest.v1.model.QueryRequirementsOverviewInfo;
import com.huaweicloud.sdk.cloudtest.v1.model.QueryTaskTestCasesInfo;
import com.huaweicloud.sdk.cloudtest.v1.model.QueryTestItemTreeInfo;
import com.huaweicloud.sdk.cloudtest.v1.model.RunTestCaseRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.RunTestCaseRequestBody;
import com.huaweicloud.sdk.cloudtest.v1.model.RunTestCaseResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.SaveTaskSettingRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.SaveTaskSettingRequestBody;
import com.huaweicloud.sdk.cloudtest.v1.model.SaveTaskSettingResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ServiceRequestBody;
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
import com.huaweicloud.sdk.cloudtest.v1.model.ShowTestCaseAndDefectInfoRequestBody;
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
import com.huaweicloud.sdk.cloudtest.v1.model.ShowUserExecuteTestCaseInfoRequestBody;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowUserExecuteTestCaseInfoResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.TestPlanDetail;
import com.huaweicloud.sdk.cloudtest.v1.model.TestPlanIssueDetail;
import com.huaweicloud.sdk.cloudtest.v1.model.TestPlanJournalList;
import com.huaweicloud.sdk.cloudtest.v1.model.TestReportInfoRequestBody;
import com.huaweicloud.sdk.cloudtest.v1.model.UpdateServiceRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.UpdateServiceResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.UpdateTestCaseRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.UpdateTestCaseRequestBody;
import com.huaweicloud.sdk.cloudtest.v1.model.UpdateTestCaseResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.UpdateTestCaseResultRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.UpdateTestCaseResultRequestBody;
import com.huaweicloud.sdk.cloudtest.v1.model.UpdateTestCaseResultResponse;
import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;

import java.util.List;

@SuppressWarnings("unchecked")
public class CloudtestMeta {

    public static final HttpRequestDef<BatchAddRelationsByOneCaseRequest, BatchAddRelationsByOneCaseResponse> batchAddRelationsByOneCase =
        genForBatchAddRelationsByOneCase();

    private static HttpRequestDef<BatchAddRelationsByOneCaseRequest, BatchAddRelationsByOneCaseResponse> genForBatchAddRelationsByOneCase() {
        // basic
        HttpRequestDef.Builder<BatchAddRelationsByOneCaseRequest, BatchAddRelationsByOneCaseResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    BatchAddRelationsByOneCaseRequest.class,
                    BatchAddRelationsByOneCaseResponse.class)
                .withName("BatchAddRelationsByOneCase")
                .withUri("/testrelation/v4/workitems/{workitem_id}/relations")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workitem_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchAddRelationsByOneCaseRequest::getWorkitemId,
                BatchAddRelationsByOneCaseRequest::setWorkitemId));
        builder.<AddRelationsInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AddRelationsInfo.class),
            f -> f.withMarshaller(BatchAddRelationsByOneCaseRequest::getBody,
                BatchAddRelationsByOneCaseRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteTestCaseRequest, BatchDeleteTestCaseResponse> batchDeleteTestCase =
        genForBatchDeleteTestCase();

    private static HttpRequestDef<BatchDeleteTestCaseRequest, BatchDeleteTestCaseResponse> genForBatchDeleteTestCase() {
        // basic
        HttpRequestDef.Builder<BatchDeleteTestCaseRequest, BatchDeleteTestCaseResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchDeleteTestCaseRequest.class, BatchDeleteTestCaseResponse.class)
                .withName("BatchDeleteTestCase")
                .withUri("/v1/projects/{project_id}/testcases/batch-delete")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeleteTestCaseRequest::getProjectId, BatchDeleteTestCaseRequest::setProjectId));
        builder.<BatchDeleteTestCaseRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchDeleteTestCaseRequestBody.class),
            f -> f.withMarshaller(BatchDeleteTestCaseRequest::getBody, BatchDeleteTestCaseRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteTestReportRequest, BatchDeleteTestReportResponse> batchDeleteTestReport =
        genForBatchDeleteTestReport();

    private static HttpRequestDef<BatchDeleteTestReportRequest, BatchDeleteTestReportResponse> genForBatchDeleteTestReport() {
        // basic
        HttpRequestDef.Builder<BatchDeleteTestReportRequest, BatchDeleteTestReportResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, BatchDeleteTestReportRequest.class, BatchDeleteTestReportResponse.class)
            .withName("BatchDeleteTestReport")
            .withUri("/testreport/v4/{project_id}/test-reports/batch-delete")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeleteTestReportRequest::getProjectId,
                BatchDeleteTestReportRequest::setProjectId));
        builder.<List<String>>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(BatchDeleteTestReportRequest::getBody, BatchDeleteTestReportRequest::setBody)
                .withInnerContainerType(String.class));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CheckPermissionRequest, CheckPermissionResponse> checkPermission =
        genForCheckPermission();

    private static HttpRequestDef<CheckPermissionRequest, CheckPermissionResponse> genForCheckPermission() {
        // basic
        HttpRequestDef.Builder<CheckPermissionRequest, CheckPermissionResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, CheckPermissionRequest.class, CheckPermissionResponse.class)
                .withName("CheckPermission")
                .withUri("/v1/{project_id}/permission/{id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CheckPermissionRequest::getProjectId, CheckPermissionRequest::setProjectId));
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CheckPermissionRequest::getId, CheckPermissionRequest::setId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreatePlanRequest, CreatePlanResponse> createPlan = genForCreatePlan();

    private static HttpRequestDef<CreatePlanRequest, CreatePlanResponse> genForCreatePlan() {
        // basic
        HttpRequestDef.Builder<CreatePlanRequest, CreatePlanResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreatePlanRequest.class, CreatePlanResponse.class)
                .withName("CreatePlan")
                .withUri("/v1/projects/{project_id}/plans")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreatePlanRequest::getProjectId, CreatePlanRequest::setProjectId));
        builder.<CreatePlanRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreatePlanRequestBody.class),
            f -> f.withMarshaller(CreatePlanRequest::getBody, CreatePlanRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateRelationsByOneCaseRequest, CreateRelationsByOneCaseResponse> createRelationsByOneCase =
        genForCreateRelationsByOneCase();

    private static HttpRequestDef<CreateRelationsByOneCaseRequest, CreateRelationsByOneCaseResponse> genForCreateRelationsByOneCase() {
        // basic
        HttpRequestDef.Builder<CreateRelationsByOneCaseRequest, CreateRelationsByOneCaseResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, CreateRelationsByOneCaseRequest.class, CreateRelationsByOneCaseResponse.class)
                .withName("CreateRelationsByOneCase")
                .withUri("/testrelation/v4/testcases/{case_id}/relations")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("case_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateRelationsByOneCaseRequest::getCaseId,
                CreateRelationsByOneCaseRequest::setCaseId));
        builder.<AddRelationsInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AddRelationsInfo.class),
            f -> f.withMarshaller(CreateRelationsByOneCaseRequest::getBody, CreateRelationsByOneCaseRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateResourceUriRequest, CreateResourceUriResponse> createResourceUri =
        genForCreateResourceUri();

    private static HttpRequestDef<CreateResourceUriRequest, CreateResourceUriResponse> genForCreateResourceUri() {
        // basic
        HttpRequestDef.Builder<CreateResourceUriRequest, CreateResourceUriResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateResourceUriRequest.class, CreateResourceUriResponse.class)
                .withName("CreateResourceUri")
                .withUri("/GT3KServer/v4/{project_id}/resource-uri")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateResourceUriRequest::getProjectId, CreateResourceUriRequest::setProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateServiceRequest, CreateServiceResponse> createService =
        genForCreateService();

    private static HttpRequestDef<CreateServiceRequest, CreateServiceResponse> genForCreateService() {
        // basic
        HttpRequestDef.Builder<CreateServiceRequest, CreateServiceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateServiceRequest.class, CreateServiceResponse.class)
                .withName("CreateService")
                .withUri("/v1/services")
                .withContentType("application/json");

        // requests
        builder.<ServiceRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ServiceRequestBody.class),
            f -> f.withMarshaller(CreateServiceRequest::getBody, CreateServiceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateTestCaseRequest, CreateTestCaseResponse> createTestCase =
        genForCreateTestCase();

    private static HttpRequestDef<CreateTestCaseRequest, CreateTestCaseResponse> genForCreateTestCase() {
        // basic
        HttpRequestDef.Builder<CreateTestCaseRequest, CreateTestCaseResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateTestCaseRequest.class, CreateTestCaseResponse.class)
                .withName("CreateTestCase")
                .withUri("/v1/projects/{project_id}/testcases")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateTestCaseRequest::getProjectId, CreateTestCaseRequest::setProjectId));
        builder.<CreateTestCaseRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateTestCaseRequestBody.class),
            f -> f.withMarshaller(CreateTestCaseRequest::getBody, CreateTestCaseRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateTestCaseInPlanRequest, CreateTestCaseInPlanResponse> createTestCaseInPlan =
        genForCreateTestCaseInPlan();

    private static HttpRequestDef<CreateTestCaseInPlanRequest, CreateTestCaseInPlanResponse> genForCreateTestCaseInPlan() {
        // basic
        HttpRequestDef.Builder<CreateTestCaseInPlanRequest, CreateTestCaseInPlanResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateTestCaseInPlanRequest.class, CreateTestCaseInPlanResponse.class)
            .withName("CreateTestCaseInPlan")
            .withUri("/v1/projects/{project_id}/plans/{plan_id}/testcases/batch-add")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateTestCaseInPlanRequest::getProjectId,
                CreateTestCaseInPlanRequest::setProjectId));
        builder.<String>withRequestField("plan_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateTestCaseInPlanRequest::getPlanId, CreateTestCaseInPlanRequest::setPlanId));
        builder.<CreateTestCaseInPlanRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateTestCaseInPlanRequestBody.class),
            f -> f.withMarshaller(CreateTestCaseInPlanRequest::getBody, CreateTestCaseInPlanRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteRelationsByOneCaseRequest, DeleteRelationsByOneCaseResponse> deleteRelationsByOneCase =
        genForDeleteRelationsByOneCase();

    private static HttpRequestDef<DeleteRelationsByOneCaseRequest, DeleteRelationsByOneCaseResponse> genForDeleteRelationsByOneCase() {
        // basic
        HttpRequestDef.Builder<DeleteRelationsByOneCaseRequest, DeleteRelationsByOneCaseResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteRelationsByOneCaseRequest.class,
                    DeleteRelationsByOneCaseResponse.class)
                .withName("DeleteRelationsByOneCase")
                .withUri("/testrelation/v4/testcases/{case_id}/relations")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("case_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteRelationsByOneCaseRequest::getCaseId,
                DeleteRelationsByOneCaseRequest::setCaseId));
        builder.<DeleteRelationsByOneCaseInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteRelationsByOneCaseInfo.class),
            f -> f.withMarshaller(DeleteRelationsByOneCaseRequest::getBody, DeleteRelationsByOneCaseRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteServiceRequest, DeleteServiceResponse> deleteService =
        genForDeleteService();

    private static HttpRequestDef<DeleteServiceRequest, DeleteServiceResponse> genForDeleteService() {
        // basic
        HttpRequestDef.Builder<DeleteServiceRequest, DeleteServiceResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteServiceRequest.class, DeleteServiceResponse.class)
                .withName("DeleteService")
                .withUri("/v1/services/{service_id}")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("service_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(DeleteServiceRequest::getServiceId, DeleteServiceRequest::setServiceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAllBranchesRequest, ListAllBranchesResponse> listAllBranches =
        genForListAllBranches();

    private static HttpRequestDef<ListAllBranchesRequest, ListAllBranchesResponse> genForListAllBranches() {
        // basic
        HttpRequestDef.Builder<ListAllBranchesRequest, ListAllBranchesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAllBranchesRequest.class, ListAllBranchesResponse.class)
                .withName("ListAllBranches")
                .withUri("/GT3KServer/v4/branches")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_uuid",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAllBranchesRequest::getProjectUuid, ListAllBranchesRequest::setProjectUuid));
        builder.<String>withRequestField("sort_field",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAllBranchesRequest::getSortField, ListAllBranchesRequest::setSortField));
        builder.<String>withRequestField("sort_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAllBranchesRequest::getSortType, ListAllBranchesRequest::setSortType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAllIteratorsRequest, ListAllIteratorsResponse> listAllIterators =
        genForListAllIterators();

    private static HttpRequestDef<ListAllIteratorsRequest, ListAllIteratorsResponse> genForListAllIterators() {
        // basic
        HttpRequestDef.Builder<ListAllIteratorsRequest, ListAllIteratorsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAllIteratorsRequest.class, ListAllIteratorsResponse.class)
                .withName("ListAllIterators")
                .withUri("/GT3KServer/v4/projects/{project_id}/iterator-infos")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAllIteratorsRequest::getProjectId, ListAllIteratorsRequest::setProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAttachmentsRequest, ListAttachmentsResponse> listAttachments =
        genForListAttachments();

    private static HttpRequestDef<ListAttachmentsRequest, ListAttachmentsResponse> genForListAttachments() {
        // basic
        HttpRequestDef.Builder<ListAttachmentsRequest, ListAttachmentsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAttachmentsRequest.class, ListAttachmentsResponse.class)
                .withName("ListAttachments")
                .withUri("/GT3KServer/v4/{project_id}/resources/{resource_uri}/attachments")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAttachmentsRequest::getProjectId, ListAttachmentsRequest::setProjectId));
        builder.<String>withRequestField("resource_uri",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAttachmentsRequest::getResourceUri, ListAttachmentsRequest::setResourceUri));
        builder.<String>withRequestField("resource_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAttachmentsRequest::getResourceType, ListAttachmentsRequest::setResourceType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListBranchesRequest, ListBranchesResponse> listBranches = genForListBranches();

    private static HttpRequestDef<ListBranchesRequest, ListBranchesResponse> genForListBranches() {
        // basic
        HttpRequestDef.Builder<ListBranchesRequest, ListBranchesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListBranchesRequest.class, ListBranchesResponse.class)
                .withName("ListBranches")
                .withUri("/v1/{project_id}/branches")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBranchesRequest::getProjectId, ListBranchesRequest::setProjectId));
        builder.<ListBranchesRequest.SortFieldEnum>withRequestField("sort_field",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListBranchesRequest.SortFieldEnum.class),
            f -> f.withMarshaller(ListBranchesRequest::getSortField, ListBranchesRequest::setSortField));
        builder.<ListBranchesRequest.SortTypeEnum>withRequestField("sort_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListBranchesRequest.SortTypeEnum.class),
            f -> f.withMarshaller(ListBranchesRequest::getSortType, ListBranchesRequest::setSortType));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListBranchesRequest::getOffset, ListBranchesRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListBranchesRequest::getLimit, ListBranchesRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListIssueTreeRequest, ListIssueTreeResponse> listIssueTree =
        genForListIssueTree();

    private static HttpRequestDef<ListIssueTreeRequest, ListIssueTreeResponse> genForListIssueTree() {
        // basic
        HttpRequestDef.Builder<ListIssueTreeRequest, ListIssueTreeResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListIssueTreeRequest.class, ListIssueTreeResponse.class)
                .withName("ListIssueTree")
                .withUri("/GT3KServer/v4/{project_id}/versions/{version_id}/issue-tree")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListIssueTreeRequest::getProjectId, ListIssueTreeRequest::setProjectId));
        builder.<String>withRequestField("version_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListIssueTreeRequest::getVersionId, ListIssueTreeRequest::setVersionId));
        builder.<QueryIssueTreeInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(QueryIssueTreeInfo.class),
            f -> f.withMarshaller(ListIssueTreeRequest::getBody, ListIssueTreeRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListProjectFieldConfigsRequest, ListProjectFieldConfigsResponse> listProjectFieldConfigs =
        genForListProjectFieldConfigs();

    private static HttpRequestDef<ListProjectFieldConfigsRequest, ListProjectFieldConfigsResponse> genForListProjectFieldConfigs() {
        // basic
        HttpRequestDef.Builder<ListProjectFieldConfigsRequest, ListProjectFieldConfigsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListProjectFieldConfigsRequest.class, ListProjectFieldConfigsResponse.class)
            .withName("ListProjectFieldConfigs")
            .withUri("/GT3KServer/v4/projects/{project_id}/field-configs")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProjectFieldConfigsRequest::getProjectId,
                ListProjectFieldConfigsRequest::setProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListProjectTestCaseFieldsRequest, ListProjectTestCaseFieldsResponse> listProjectTestCaseFields =
        genForListProjectTestCaseFields();

    private static HttpRequestDef<ListProjectTestCaseFieldsRequest, ListProjectTestCaseFieldsResponse> genForListProjectTestCaseFields() {
        // basic
        HttpRequestDef.Builder<ListProjectTestCaseFieldsRequest, ListProjectTestCaseFieldsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListProjectTestCaseFieldsRequest.class,
                    ListProjectTestCaseFieldsResponse.class)
                .withName("ListProjectTestCaseFields")
                .withUri("/GT3KServer/v4/{project_id}/testcase/field/batch-query")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProjectTestCaseFieldsRequest::getProjectId,
                ListProjectTestCaseFieldsRequest::setProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListReportsRequest, ListReportsResponse> listReports = genForListReports();

    private static HttpRequestDef<ListReportsRequest, ListReportsResponse> genForListReports() {
        // basic
        HttpRequestDef.Builder<ListReportsRequest, ListReportsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListReportsRequest.class, ListReportsResponse.class)
                .withName("ListReports")
                .withUri("/testreport/v4/{project_id}/versions/{version_id}/custom-reports")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListReportsRequest::getProjectId, ListReportsRequest::setProjectId));
        builder.<String>withRequestField("version_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListReportsRequest::getVersionId, ListReportsRequest::setVersionId));
        builder.<Long>withRequestField("page_size",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListReportsRequest::getPageSize, ListReportsRequest::setPageSize));
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListReportsRequest::getOffset, ListReportsRequest::setOffset));
        builder.<Integer>withRequestField("type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListReportsRequest::getType, ListReportsRequest::setType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListResourcePoolsRequest, ListResourcePoolsResponse> listResourcePools =
        genForListResourcePools();

    private static HttpRequestDef<ListResourcePoolsRequest, ListResourcePoolsResponse> genForListResourcePools() {
        // basic
        HttpRequestDef.Builder<ListResourcePoolsRequest, ListResourcePoolsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListResourcePoolsRequest.class, ListResourcePoolsResponse.class)
                .withName("ListResourcePools")
                .withUri("/testexecutor/v4/{project_id}/resource-pools")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResourcePoolsRequest::getProjectId, ListResourcePoolsRequest::setProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTaskTestCasesRequest, ListTaskTestCasesResponse> listTaskTestCases =
        genForListTaskTestCases();

    private static HttpRequestDef<ListTaskTestCasesRequest, ListTaskTestCasesResponse> genForListTaskTestCases() {
        // basic
        HttpRequestDef.Builder<ListTaskTestCasesRequest, ListTaskTestCasesResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListTaskTestCasesRequest.class, ListTaskTestCasesResponse.class)
                .withName("ListTaskTestCases")
                .withUri("/GT3KServer/v4/{project_id}/testcases/tasks/batch-query")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTaskTestCasesRequest::getProjectId, ListTaskTestCasesRequest::setProjectId));
        builder.<QueryTaskTestCasesInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(QueryTaskTestCasesInfo.class),
            f -> f.withMarshaller(ListTaskTestCasesRequest::getBody, ListTaskTestCasesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTestCaseHistoriesRequest, ListTestCaseHistoriesResponse> listTestCaseHistories =
        genForListTestCaseHistories();

    private static HttpRequestDef<ListTestCaseHistoriesRequest, ListTestCaseHistoriesResponse> genForListTestCaseHistories() {
        // basic
        HttpRequestDef.Builder<ListTestCaseHistoriesRequest, ListTestCaseHistoriesResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ListTestCaseHistoriesRequest.class, ListTestCaseHistoriesResponse.class)
            .withName("ListTestCaseHistories")
            .withUri("/v1/{project_id}/testcases/{testcase_id}/histories/batch-query")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTestCaseHistoriesRequest::getProjectId,
                ListTestCaseHistoriesRequest::setProjectId));
        builder.<String>withRequestField("testcase_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTestCaseHistoriesRequest::getTestcaseId,
                ListTestCaseHistoriesRequest::setTestcaseId));
        builder.<ListTestCaseHistoriesRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListTestCaseHistoriesRequestBody.class),
            f -> f.withMarshaller(ListTestCaseHistoriesRequest::getBody, ListTestCaseHistoriesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTestCasesRequest, ListTestCasesResponse> listTestCases =
        genForListTestCases();

    private static HttpRequestDef<ListTestCasesRequest, ListTestCasesResponse> genForListTestCases() {
        // basic
        HttpRequestDef.Builder<ListTestCasesRequest, ListTestCasesResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListTestCasesRequest.class, ListTestCasesResponse.class)
                .withName("ListTestCases")
                .withUri("/v1/{project_id}/testcases/batch-query")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTestCasesRequest::getProjectId, ListTestCasesRequest::setProjectId));
        builder.<ListTestCasesRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListTestCasesRequestBody.class),
            f -> f.withMarshaller(ListTestCasesRequest::getBody, ListTestCasesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTestReportsByConditionRequest, ListTestReportsByConditionResponse> listTestReportsByCondition =
        genForListTestReportsByCondition();

    private static HttpRequestDef<ListTestReportsByConditionRequest, ListTestReportsByConditionResponse> genForListTestReportsByCondition() {
        // basic
        HttpRequestDef.Builder<ListTestReportsByConditionRequest, ListTestReportsByConditionResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListTestReportsByConditionRequest.class,
                    ListTestReportsByConditionResponse.class)
                .withName("ListTestReportsByCondition")
                .withUri("/testreport/v4/{project_id}/test-reports")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTestReportsByConditionRequest::getProjectId,
                ListTestReportsByConditionRequest::setProjectId));
        builder.<Long>withRequestField("page_size",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListTestReportsByConditionRequest::getPageSize,
                ListTestReportsByConditionRequest::setPageSize));
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListTestReportsByConditionRequest::getOffset,
                ListTestReportsByConditionRequest::setOffset));
        builder.<String>withRequestField("key_word",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTestReportsByConditionRequest::getKeyWord,
                ListTestReportsByConditionRequest::setKeyWord));
        builder.<Boolean>withRequestField("own",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListTestReportsByConditionRequest::getOwn,
                ListTestReportsByConditionRequest::setOwn));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTestTypesRequest, ListTestTypesResponse> listTestTypes =
        genForListTestTypes();

    private static HttpRequestDef<ListTestTypesRequest, ListTestTypesResponse> genForListTestTypes() {
        // basic
        HttpRequestDef.Builder<ListTestTypesRequest, ListTestTypesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListTestTypesRequest.class, ListTestTypesResponse.class)
                .withName("ListTestTypes")
                .withUri("/GT3KServer/v4/{project_id}/test-types")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTestTypesRequest::getProjectId, ListTestTypesRequest::setProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTestcasesByProjectIssuesRelationRequest, ListTestcasesByProjectIssuesRelationResponse> listTestcasesByProjectIssuesRelation =
        genForListTestcasesByProjectIssuesRelation();

    private static HttpRequestDef<ListTestcasesByProjectIssuesRelationRequest, ListTestcasesByProjectIssuesRelationResponse> genForListTestcasesByProjectIssuesRelation() {
        // basic
        HttpRequestDef.Builder<ListTestcasesByProjectIssuesRelationRequest, ListTestcasesByProjectIssuesRelationResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ListTestcasesByProjectIssuesRelationRequest.class,
                    ListTestcasesByProjectIssuesRelationResponse.class)
                .withName("ListTestcasesByProjectIssuesRelation")
                .withUri("/v1/{project_id}/issues/testcases/batch-query")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTestcasesByProjectIssuesRelationRequest::getProjectId,
                ListTestcasesByProjectIssuesRelationRequest::setProjectId));
        builder.<QueryProjectIssuesRelationTestCasesInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(QueryProjectIssuesRelationTestCasesInfo.class),
            f -> f.withMarshaller(ListTestcasesByProjectIssuesRelationRequest::getBody,
                ListTestcasesByProjectIssuesRelationRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListUsageInfosRequest, ListUsageInfosResponse> listUsageInfos =
        genForListUsageInfos();

    private static HttpRequestDef<ListUsageInfosRequest, ListUsageInfosResponse> genForListUsageInfos() {
        // basic
        HttpRequestDef.Builder<ListUsageInfosRequest, ListUsageInfosResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListUsageInfosRequest.class, ListUsageInfosResponse.class)
                .withName("ListUsageInfos")
                .withUri("/GT3KServer/v4/domain/usage")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_uuid",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUsageInfosRequest::getProjectUuid, ListUsageInfosRequest::setProjectUuid));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListUserPackageUsageRequest, ListUserPackageUsageResponse> listUserPackageUsage =
        genForListUserPackageUsage();

    private static HttpRequestDef<ListUserPackageUsageRequest, ListUserPackageUsageResponse> genForListUserPackageUsage() {
        // basic
        HttpRequestDef.Builder<ListUserPackageUsageRequest, ListUserPackageUsageResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListUserPackageUsageRequest.class, ListUserPackageUsageResponse.class)
            .withName("ListUserPackageUsage")
            .withUri("/v1/projects/{project_id}/package-usage")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUserPackageUsageRequest::getProjectId,
                ListUserPackageUsageRequest::setProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListUserPopupInfoRequest, ListUserPopupInfoResponse> listUserPopupInfo =
        genForListUserPopupInfo();

    private static HttpRequestDef<ListUserPopupInfoRequest, ListUserPopupInfoResponse> genForListUserPopupInfo() {
        // basic
        HttpRequestDef.Builder<ListUserPopupInfoRequest, ListUserPopupInfoResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListUserPopupInfoRequest.class, ListUserPopupInfoResponse.class)
                .withName("ListUserPopupInfo")
                .withUri("/v1/projects/{project_id}/package-charge/popup")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUserPopupInfoRequest::getProjectId, ListUserPopupInfoRequest::setProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RunTestCaseRequest, RunTestCaseResponse> runTestCase = genForRunTestCase();

    private static HttpRequestDef<RunTestCaseRequest, RunTestCaseResponse> genForRunTestCase() {
        // basic
        HttpRequestDef.Builder<RunTestCaseRequest, RunTestCaseResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RunTestCaseRequest.class, RunTestCaseResponse.class)
                .withName("RunTestCase")
                .withUri("/v1/projects/{project_id}/testcases/execution")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RunTestCaseRequest::getProjectId, RunTestCaseRequest::setProjectId));
        builder.<RunTestCaseRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RunTestCaseRequestBody.class),
            f -> f.withMarshaller(RunTestCaseRequest::getBody, RunTestCaseRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAllFeatureChildrenRequest, ShowAllFeatureChildrenResponse> showAllFeatureChildren =
        genForShowAllFeatureChildren();

    private static HttpRequestDef<ShowAllFeatureChildrenRequest, ShowAllFeatureChildrenResponse> genForShowAllFeatureChildren() {
        // basic
        HttpRequestDef.Builder<ShowAllFeatureChildrenRequest, ShowAllFeatureChildrenResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ShowAllFeatureChildrenRequest.class, ShowAllFeatureChildrenResponse.class)
            .withName("ShowAllFeatureChildren")
            .withUri("/GT3KServer/v5/features/{feature_id}/children")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("feature_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAllFeatureChildrenRequest::getFeatureId,
                ShowAllFeatureChildrenRequest::setFeatureId));
        builder.<QueryTestItemTreeInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(QueryTestItemTreeInfo.class),
            f -> f.withMarshaller(ShowAllFeatureChildrenRequest::getBody, ShowAllFeatureChildrenRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowApiTestcaseHistoriesRequest, ShowApiTestcaseHistoriesResponse> showApiTestcaseHistories =
        genForShowApiTestcaseHistories();

    private static HttpRequestDef<ShowApiTestcaseHistoriesRequest, ShowApiTestcaseHistoriesResponse> genForShowApiTestcaseHistories() {
        // basic
        HttpRequestDef.Builder<ShowApiTestcaseHistoriesRequest, ShowApiTestcaseHistoriesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ShowApiTestcaseHistoriesRequest.class, ShowApiTestcaseHistoriesResponse.class)
                .withName("ShowApiTestcaseHistories")
                .withUri("/v1/{project_id}/api-testcases/{testcase_id}/execute-histories")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("testcase_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowApiTestcaseHistoriesRequest::getTestcaseId,
                ShowApiTestcaseHistoriesRequest::setTestcaseId));
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowApiTestcaseHistoriesRequest::getProjectId,
                ShowApiTestcaseHistoriesRequest::setProjectId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowApiTestcaseHistoriesRequest::getOffset,
                ShowApiTestcaseHistoriesRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowApiTestcaseHistoriesRequest::getLimit,
                ShowApiTestcaseHistoriesRequest::setLimit));
        builder.<String>withRequestField("plan_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowApiTestcaseHistoriesRequest::getPlanId,
                ShowApiTestcaseHistoriesRequest::setPlanId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowBackgroundInfoRequest, ShowBackgroundInfoResponse> showBackgroundInfo =
        genForShowBackgroundInfo();

    private static HttpRequestDef<ShowBackgroundInfoRequest, ShowBackgroundInfoResponse> genForShowBackgroundInfo() {
        // basic
        HttpRequestDef.Builder<ShowBackgroundInfoRequest, ShowBackgroundInfoResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowBackgroundInfoRequest.class, ShowBackgroundInfoResponse.class)
                .withName("ShowBackgroundInfo")
                .withUri("/GT3KServer/v4/{project_id}/background")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowBackgroundInfoRequest::getProjectId, ShowBackgroundInfoRequest::setProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDisclaimerRecordRequest, ShowDisclaimerRecordResponse> showDisclaimerRecord =
        genForShowDisclaimerRecord();

    private static HttpRequestDef<ShowDisclaimerRecordRequest, ShowDisclaimerRecordResponse> genForShowDisclaimerRecord() {
        // basic
        HttpRequestDef.Builder<ShowDisclaimerRecordRequest, ShowDisclaimerRecordResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowDisclaimerRecordRequest.class, ShowDisclaimerRecordResponse.class)
            .withName("ShowDisclaimerRecord")
            .withUri("/GT3KServer/v4/disclaimer")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDisclaimerRecordRequest::getType, ShowDisclaimerRecordRequest::setType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDomainInfoRequest, ShowDomainInfoResponse> showDomainInfo =
        genForShowDomainInfo();

    private static HttpRequestDef<ShowDomainInfoRequest, ShowDomainInfoResponse> genForShowDomainInfo() {
        // basic
        HttpRequestDef.Builder<ShowDomainInfoRequest, ShowDomainInfoResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowDomainInfoRequest.class, ShowDomainInfoResponse.class)
                .withName("ShowDomainInfo")
                .withUri("/GT3KServer/v4/user-info/domain")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowFeatureChildrenRequest, ShowFeatureChildrenResponse> showFeatureChildren =
        genForShowFeatureChildren();

    private static HttpRequestDef<ShowFeatureChildrenRequest, ShowFeatureChildrenResponse> genForShowFeatureChildren() {
        // basic
        HttpRequestDef.Builder<ShowFeatureChildrenRequest, ShowFeatureChildrenResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ShowFeatureChildrenRequest.class, ShowFeatureChildrenResponse.class)
                .withName("ShowFeatureChildren")
                .withUri("/GT3KServer/v4/features/{feature_id}/children")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("feature_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowFeatureChildrenRequest::getFeatureId, ShowFeatureChildrenRequest::setFeatureId));
        builder.<QueryTestItemTreeInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(QueryTestItemTreeInfo.class),
            f -> f.withMarshaller(ShowFeatureChildrenRequest::getBody, ShowFeatureChildrenRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowFreeDeclarationRequest, ShowFreeDeclarationResponse> showFreeDeclaration =
        genForShowFreeDeclaration();

    private static HttpRequestDef<ShowFreeDeclarationRequest, ShowFreeDeclarationResponse> genForShowFreeDeclaration() {
        // basic
        HttpRequestDef.Builder<ShowFreeDeclarationRequest, ShowFreeDeclarationResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowFreeDeclarationRequest.class, ShowFreeDeclarationResponse.class)
                .withName("ShowFreeDeclaration")
                .withUri("/GT3KServer/v4/free-declaration")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowIssuesByPlanIdRequest, ShowIssuesByPlanIdResponse> showIssuesByPlanId =
        genForShowIssuesByPlanId();

    private static HttpRequestDef<ShowIssuesByPlanIdRequest, ShowIssuesByPlanIdResponse> genForShowIssuesByPlanId() {
        // basic
        HttpRequestDef.Builder<ShowIssuesByPlanIdRequest, ShowIssuesByPlanIdResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowIssuesByPlanIdRequest.class, ShowIssuesByPlanIdResponse.class)
                .withName("ShowIssuesByPlanId")
                .withUri("/v1/projects/{project_id}/plans/{plan_id}/issues")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowIssuesByPlanIdRequest::getProjectId, ShowIssuesByPlanIdRequest::setProjectId));
        builder.<String>withRequestField("plan_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowIssuesByPlanIdRequest::getPlanId, ShowIssuesByPlanIdRequest::setPlanId));
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowIssuesByPlanIdRequest::getOffset, ShowIssuesByPlanIdRequest::setOffset));
        builder.<Long>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowIssuesByPlanIdRequest::getLimit, ShowIssuesByPlanIdRequest::setLimit));

        // response
        builder.<List<TestPlanIssueDetail>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ShowIssuesByPlanIdResponse::getBody, ShowIssuesByPlanIdResponse::setBody)
                .withInnerContainerType(TestPlanIssueDetail.class));

        return builder.build();
    }

    public static final HttpRequestDef<ShowIteratorByDefectRequest, ShowIteratorByDefectResponse> showIteratorByDefect =
        genForShowIteratorByDefect();

    private static HttpRequestDef<ShowIteratorByDefectRequest, ShowIteratorByDefectResponse> genForShowIteratorByDefect() {
        // basic
        HttpRequestDef.Builder<ShowIteratorByDefectRequest, ShowIteratorByDefectResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowIteratorByDefectRequest.class, ShowIteratorByDefectResponse.class)
            .withName("ShowIteratorByDefect")
            .withUri("/GT3KServer/v4/{project_id}/defects/{defect_id}/iterators")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowIteratorByDefectRequest::getProjectId,
                ShowIteratorByDefectRequest::setProjectId));
        builder.<String>withRequestField("defect_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowIteratorByDefectRequest::getDefectId, ShowIteratorByDefectRequest::setDefectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowMindmapByPageRequest, ShowMindmapByPageResponse> showMindmapByPage =
        genForShowMindmapByPage();

    private static HttpRequestDef<ShowMindmapByPageRequest, ShowMindmapByPageResponse> genForShowMindmapByPage() {
        // basic
        HttpRequestDef.Builder<ShowMindmapByPageRequest, ShowMindmapByPageResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ShowMindmapByPageRequest.class, ShowMindmapByPageResponse.class)
                .withName("ShowMindmapByPage")
                .withUri("/v3/{project_id}/mindmaps/page")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMindmapByPageRequest::getProjectId, ShowMindmapByPageRequest::setProjectId));
        builder.<CommRequestMindmapPageParamV3>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CommRequestMindmapPageParamV3.class),
            f -> f.withMarshaller(ShowMindmapByPageRequest::getBody, ShowMindmapByPageRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowMindmapCreatorNameRequest, ShowMindmapCreatorNameResponse> showMindmapCreatorName =
        genForShowMindmapCreatorName();

    private static HttpRequestDef<ShowMindmapCreatorNameRequest, ShowMindmapCreatorNameResponse> genForShowMindmapCreatorName() {
        // basic
        HttpRequestDef.Builder<ShowMindmapCreatorNameRequest, ShowMindmapCreatorNameResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowMindmapCreatorNameRequest.class, ShowMindmapCreatorNameResponse.class)
            .withName("ShowMindmapCreatorName")
            .withUri("/v2/{project_id}/mindmap-creator-name")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMindmapCreatorNameRequest::getProjectId,
                ShowMindmapCreatorNameRequest::setProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowPlanJournalsRequest, ShowPlanJournalsResponse> showPlanJournals =
        genForShowPlanJournals();

    private static HttpRequestDef<ShowPlanJournalsRequest, ShowPlanJournalsResponse> genForShowPlanJournals() {
        // basic
        HttpRequestDef.Builder<ShowPlanJournalsRequest, ShowPlanJournalsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowPlanJournalsRequest.class, ShowPlanJournalsResponse.class)
                .withName("ShowPlanJournals")
                .withUri("/v1/projects/{project_id}/plans/{plan_id}/journals")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPlanJournalsRequest::getProjectId, ShowPlanJournalsRequest::setProjectId));
        builder.<String>withRequestField("plan_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPlanJournalsRequest::getPlanId, ShowPlanJournalsRequest::setPlanId));
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowPlanJournalsRequest::getOffset, ShowPlanJournalsRequest::setOffset));
        builder.<Long>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowPlanJournalsRequest::getLimit, ShowPlanJournalsRequest::setLimit));

        // response
        builder.<List<TestPlanJournalList>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ShowPlanJournalsResponse::getBody, ShowPlanJournalsResponse::setBody)
                .withInnerContainerType(TestPlanJournalList.class));

        return builder.build();
    }

    public static final HttpRequestDef<ShowPlanListRequest, ShowPlanListResponse> showPlanList = genForShowPlanList();

    private static HttpRequestDef<ShowPlanListRequest, ShowPlanListResponse> genForShowPlanList() {
        // basic
        HttpRequestDef.Builder<ShowPlanListRequest, ShowPlanListResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowPlanListRequest.class, ShowPlanListResponse.class)
                .withName("ShowPlanList")
                .withUri("/v2/projects/{project_id}/plans")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPlanListRequest::getProjectId, ShowPlanListRequest::setProjectId));
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowPlanListRequest::getOffset, ShowPlanListRequest::setOffset));
        builder.<Long>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowPlanListRequest::getLimit, ShowPlanListRequest::setLimit));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPlanListRequest::getName, ShowPlanListRequest::setName));
        builder.<String>withRequestField("current_stage",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPlanListRequest::getCurrentStage, ShowPlanListRequest::setCurrentStage));
        builder.<String>withRequestField("branch_uri",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPlanListRequest::getBranchUri, ShowPlanListRequest::setBranchUri));
        builder.<Boolean>withRequestField("query_all_version",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ShowPlanListRequest::getQueryAllVersion, ShowPlanListRequest::setQueryAllVersion));
        builder.<String>withRequestField("fix_version_ids",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPlanListRequest::getFixVersionIds, ShowPlanListRequest::setFixVersionIds));

        // response
        builder.<List<TestPlanDetail>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ShowPlanListResponse::getBody, ShowPlanListResponse::setBody)
                .withInnerContainerType(TestPlanDetail.class));

        return builder.build();
    }

    public static final HttpRequestDef<ShowPlansRequest, ShowPlansResponse> showPlans = genForShowPlans();

    private static HttpRequestDef<ShowPlansRequest, ShowPlansResponse> genForShowPlans() {
        // basic
        HttpRequestDef.Builder<ShowPlansRequest, ShowPlansResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowPlansRequest.class, ShowPlansResponse.class)
                .withName("ShowPlans")
                .withUri("/v1/projects/{project_id}/plans")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPlansRequest::getProjectId, ShowPlansRequest::setProjectId));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPlansRequest::getName, ShowPlansRequest::setName));
        builder.<String>withRequestField("current_stage",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPlansRequest::getCurrentStage, ShowPlansRequest::setCurrentStage));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowPlansRequest::getOffset, ShowPlansRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowPlansRequest::getLimit, ShowPlansRequest::setLimit));

        // response
        builder.<List<TestPlanDetail>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ShowPlansResponse::getBody, ShowPlansResponse::setBody)
                .withInnerContainerType(TestPlanDetail.class));

        return builder.build();
    }

    public static final HttpRequestDef<ShowProgressRequest, ShowProgressResponse> showProgress = genForShowProgress();

    private static HttpRequestDef<ShowProgressRequest, ShowProgressResponse> genForShowProgress() {
        // basic
        HttpRequestDef.Builder<ShowProgressRequest, ShowProgressResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowProgressRequest.class, ShowProgressResponse.class)
                .withName("ShowProgress")
                .withUri("/GT3KServer/v4/progress/{operation_uri}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("operation_uri",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowProgressRequest::getOperationUri, ShowProgressRequest::setOperationUri));
        builder.<String>withRequestField("project_uuid",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowProgressRequest::getProjectUuid, ShowProgressRequest::setProjectUuid));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowProjectDataDashboardRequest, ShowProjectDataDashboardResponse> showProjectDataDashboard =
        genForShowProjectDataDashboard();

    private static HttpRequestDef<ShowProjectDataDashboardRequest, ShowProjectDataDashboardResponse> genForShowProjectDataDashboard() {
        // basic
        HttpRequestDef.Builder<ShowProjectDataDashboardRequest, ShowProjectDataDashboardResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, ShowProjectDataDashboardRequest.class, ShowProjectDataDashboardResponse.class)
                .withName("ShowProjectDataDashboard")
                .withUri("/v1/{project_id}/data-dashboard/overview")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowProjectDataDashboardRequest::getProjectId,
                ShowProjectDataDashboardRequest::setProjectId));
        builder.<TestReportInfoRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(TestReportInfoRequestBody.class),
            f -> f.withMarshaller(ShowProjectDataDashboardRequest::getBody, ShowProjectDataDashboardRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowRegisterServiceRequest, ShowRegisterServiceResponse> showRegisterService =
        genForShowRegisterService();

    private static HttpRequestDef<ShowRegisterServiceRequest, ShowRegisterServiceResponse> genForShowRegisterService() {
        // basic
        HttpRequestDef.Builder<ShowRegisterServiceRequest, ShowRegisterServiceResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowRegisterServiceRequest.class, ShowRegisterServiceResponse.class)
                .withName("ShowRegisterService")
                .withUri("/v1/services")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowReportRequest, ShowReportResponse> showReport = genForShowReport();

    private static HttpRequestDef<ShowReportRequest, ShowReportResponse> genForShowReport() {
        // basic
        HttpRequestDef.Builder<ShowReportRequest, ShowReportResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ShowReportRequest.class, ShowReportResponse.class)
                .withName("ShowReport")
                .withUri("/v4/{project_id}/versions/{plan_id}/custom-reports/generate")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowReportRequest::getProjectId, ShowReportRequest::setProjectId));
        builder.<String>withRequestField("plan_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowReportRequest::getPlanId, ShowReportRequest::setPlanId));
        builder.<GenerateReportInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(GenerateReportInfo.class),
            f -> f.withMarshaller(ShowReportRequest::getBody, ShowReportRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowRequirementsOverviewRequest, ShowRequirementsOverviewResponse> showRequirementsOverview =
        genForShowRequirementsOverview();

    private static HttpRequestDef<ShowRequirementsOverviewRequest, ShowRequirementsOverviewResponse> genForShowRequirementsOverview() {
        // basic
        HttpRequestDef.Builder<ShowRequirementsOverviewRequest, ShowRequirementsOverviewResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, ShowRequirementsOverviewRequest.class, ShowRequirementsOverviewResponse.class)
                .withName("ShowRequirementsOverview")
                .withUri("/testreport/v4/{project_id}/versions/{version_id}/requirements/overview")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRequirementsOverviewRequest::getProjectId,
                ShowRequirementsOverviewRequest::setProjectId));
        builder.<String>withRequestField("version_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRequirementsOverviewRequest::getVersionId,
                ShowRequirementsOverviewRequest::setVersionId));
        builder.<QueryRequirementsOverviewInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(QueryRequirementsOverviewInfo.class),
            f -> f.withMarshaller(ShowRequirementsOverviewRequest::getBody, ShowRequirementsOverviewRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowSystemConfigsRequest, ShowSystemConfigsResponse> showSystemConfigs =
        genForShowSystemConfigs();

    private static HttpRequestDef<ShowSystemConfigsRequest, ShowSystemConfigsResponse> genForShowSystemConfigs() {
        // basic
        HttpRequestDef.Builder<ShowSystemConfigsRequest, ShowSystemConfigsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ShowSystemConfigsRequest.class, ShowSystemConfigsResponse.class)
                .withName("ShowSystemConfigs")
                .withUri("/v1/{project_id}/system-config/find-all")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSystemConfigsRequest::getProjectId, ShowSystemConfigsRequest::setProjectId));
        builder.<CommRequestSystemConfig>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CommRequestSystemConfig.class),
            f -> f.withMarshaller(ShowSystemConfigsRequest::getBody, ShowSystemConfigsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTestCaseRequest, ShowTestCaseResponse> showTestCase = genForShowTestCase();

    private static HttpRequestDef<ShowTestCaseRequest, ShowTestCaseResponse> genForShowTestCase() {
        // basic
        HttpRequestDef.Builder<ShowTestCaseRequest, ShowTestCaseResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowTestCaseRequest.class, ShowTestCaseResponse.class)
                .withName("ShowTestCase")
                .withUri("/GT3KServer/v4/testcases/{testcase_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("testcase_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTestCaseRequest::getTestcaseId, ShowTestCaseRequest::setTestcaseId));
        builder.<String>withRequestField("version_uri",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTestCaseRequest::getVersionUri, ShowTestCaseRequest::setVersionUri));
        builder.<String>withRequestField("project_uuid",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTestCaseRequest::getProjectUuid, ShowTestCaseRequest::setProjectUuid));
        builder.<String>withRequestField("task_uri",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTestCaseRequest::getTaskUri, ShowTestCaseRequest::setTaskUri));
        builder.<Boolean>withRequestField("refresh",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ShowTestCaseRequest::getRefresh, ShowTestCaseRequest::setRefresh));
        builder.<Boolean>withRequestField("is_recycle",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ShowTestCaseRequest::getIsRecycle, ShowTestCaseRequest::setIsRecycle));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTestCaseAndDefectInfoRequest, ShowTestCaseAndDefectInfoResponse> showTestCaseAndDefectInfo =
        genForShowTestCaseAndDefectInfo();

    private static HttpRequestDef<ShowTestCaseAndDefectInfoRequest, ShowTestCaseAndDefectInfoResponse> genForShowTestCaseAndDefectInfo() {
        // basic
        HttpRequestDef.Builder<ShowTestCaseAndDefectInfoRequest, ShowTestCaseAndDefectInfoResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ShowTestCaseAndDefectInfoRequest.class,
                    ShowTestCaseAndDefectInfoResponse.class)
                .withName("ShowTestCaseAndDefectInfo")
                .withUri("/v1/{project_id}/testcases/defect-info/list-by-creation-time")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTestCaseAndDefectInfoRequest::getProjectId,
                ShowTestCaseAndDefectInfoRequest::setProjectId));
        builder.<ShowTestCaseAndDefectInfoRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ShowTestCaseAndDefectInfoRequestBody.class),
            f -> f.withMarshaller(ShowTestCaseAndDefectInfoRequest::getBody,
                ShowTestCaseAndDefectInfoRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTestCaseDetailRequest, ShowTestCaseDetailResponse> showTestCaseDetail =
        genForShowTestCaseDetail();

    private static HttpRequestDef<ShowTestCaseDetailRequest, ShowTestCaseDetailResponse> genForShowTestCaseDetail() {
        // basic
        HttpRequestDef.Builder<ShowTestCaseDetailRequest, ShowTestCaseDetailResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowTestCaseDetailRequest.class, ShowTestCaseDetailResponse.class)
                .withName("ShowTestCaseDetail")
                .withUri("/v1/projects/{project_id}/testcases/{testcase_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTestCaseDetailRequest::getProjectId, ShowTestCaseDetailRequest::setProjectId));
        builder.<String>withRequestField("testcase_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTestCaseDetailRequest::getTestcaseId, ShowTestCaseDetailRequest::setTestcaseId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTestCaseDetailV2Request, ShowTestCaseDetailV2Response> showTestCaseDetailV2 =
        genForShowTestCaseDetailV2();

    private static HttpRequestDef<ShowTestCaseDetailV2Request, ShowTestCaseDetailV2Response> genForShowTestCaseDetailV2() {
        // basic
        HttpRequestDef.Builder<ShowTestCaseDetailV2Request, ShowTestCaseDetailV2Response> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowTestCaseDetailV2Request.class, ShowTestCaseDetailV2Response.class)
            .withName("ShowTestCaseDetailV2")
            .withUri("/v1/projects/{project_id}/testcase")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTestCaseDetailV2Request::getProjectId,
                ShowTestCaseDetailV2Request::setProjectId));
        builder.<String>withRequestField("testcase_number",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTestCaseDetailV2Request::getTestcaseNumber,
                ShowTestCaseDetailV2Request::setTestcaseNumber));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowUserAccessInfoRequest, ShowUserAccessInfoResponse> showUserAccessInfo =
        genForShowUserAccessInfo();

    private static HttpRequestDef<ShowUserAccessInfoRequest, ShowUserAccessInfoResponse> genForShowUserAccessInfo() {
        // basic
        HttpRequestDef.Builder<ShowUserAccessInfoRequest, ShowUserAccessInfoResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowUserAccessInfoRequest.class, ShowUserAccessInfoResponse.class)
                .withName("ShowUserAccessInfo")
                .withUri("/GT3KServer/v4/domain/info")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_uuid",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowUserAccessInfoRequest::getProjectUuid,
                ShowUserAccessInfoRequest::setProjectUuid));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowUserExecuteTestCaseInfoRequest, ShowUserExecuteTestCaseInfoResponse> showUserExecuteTestCaseInfo =
        genForShowUserExecuteTestCaseInfo();

    private static HttpRequestDef<ShowUserExecuteTestCaseInfoRequest, ShowUserExecuteTestCaseInfoResponse> genForShowUserExecuteTestCaseInfo() {
        // basic
        HttpRequestDef.Builder<ShowUserExecuteTestCaseInfoRequest, ShowUserExecuteTestCaseInfoResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ShowUserExecuteTestCaseInfoRequest.class,
                    ShowUserExecuteTestCaseInfoResponse.class)
                .withName("ShowUserExecuteTestCaseInfo")
                .withUri("/v1/{project_id}/testcases/execute-info/statistic-by-user")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowUserExecuteTestCaseInfoRequest::getProjectId,
                ShowUserExecuteTestCaseInfoRequest::setProjectId));
        builder.<ShowUserExecuteTestCaseInfoRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ShowUserExecuteTestCaseInfoRequestBody.class),
            f -> f.withMarshaller(ShowUserExecuteTestCaseInfoRequest::getBody,
                ShowUserExecuteTestCaseInfoRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateServiceRequest, UpdateServiceResponse> updateService =
        genForUpdateService();

    private static HttpRequestDef<UpdateServiceRequest, UpdateServiceResponse> genForUpdateService() {
        // basic
        HttpRequestDef.Builder<UpdateServiceRequest, UpdateServiceResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateServiceRequest.class, UpdateServiceResponse.class)
                .withName("UpdateService")
                .withUri("/v1/services/{service_id}")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("service_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(UpdateServiceRequest::getServiceId, UpdateServiceRequest::setServiceId));
        builder.<ServiceRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ServiceRequestBody.class),
            f -> f.withMarshaller(UpdateServiceRequest::getBody, UpdateServiceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateTestCaseRequest, UpdateTestCaseResponse> updateTestCase =
        genForUpdateTestCase();

    private static HttpRequestDef<UpdateTestCaseRequest, UpdateTestCaseResponse> genForUpdateTestCase() {
        // basic
        HttpRequestDef.Builder<UpdateTestCaseRequest, UpdateTestCaseResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateTestCaseRequest.class, UpdateTestCaseResponse.class)
                .withName("UpdateTestCase")
                .withUri("/v1/projects/{project_id}/testcases/{testcase_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateTestCaseRequest::getProjectId, UpdateTestCaseRequest::setProjectId));
        builder.<String>withRequestField("testcase_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateTestCaseRequest::getTestcaseId, UpdateTestCaseRequest::setTestcaseId));
        builder.<UpdateTestCaseRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateTestCaseRequestBody.class),
            f -> f.withMarshaller(UpdateTestCaseRequest::getBody, UpdateTestCaseRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateTestCaseResultRequest, UpdateTestCaseResultResponse> updateTestCaseResult =
        genForUpdateTestCaseResult();

    private static HttpRequestDef<UpdateTestCaseResultRequest, UpdateTestCaseResultResponse> genForUpdateTestCaseResult() {
        // basic
        HttpRequestDef.Builder<UpdateTestCaseResultRequest, UpdateTestCaseResultResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, UpdateTestCaseResultRequest.class, UpdateTestCaseResultResponse.class)
            .withName("UpdateTestCaseResult")
            .withUri("/v1/projects/{project_id}/testcases/result")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateTestCaseResultRequest::getProjectId,
                UpdateTestCaseResultRequest::setProjectId));
        builder.<UpdateTestCaseResultRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateTestCaseResultRequestBody.class),
            f -> f.withMarshaller(UpdateTestCaseResultRequest::getBody, UpdateTestCaseResultRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateApiTestSuiteByRepoFileRequest, CreateApiTestSuiteByRepoFileResponse> createApiTestSuiteByRepoFile =
        genForCreateApiTestSuiteByRepoFile();

    private static HttpRequestDef<CreateApiTestSuiteByRepoFileRequest, CreateApiTestSuiteByRepoFileResponse> genForCreateApiTestSuiteByRepoFile() {
        // basic
        HttpRequestDef.Builder<CreateApiTestSuiteByRepoFileRequest, CreateApiTestSuiteByRepoFileResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateApiTestSuiteByRepoFileRequest.class,
                    CreateApiTestSuiteByRepoFileResponse.class)
                .withName("CreateApiTestSuiteByRepoFile")
                .withUri("/v1/projects/{project_id}/repository/testsuites")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateApiTestSuiteByRepoFileRequest::getProjectId,
                CreateApiTestSuiteByRepoFileRequest::setProjectId));
        builder.<CreateTestSuitByRepoFileInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateTestSuitByRepoFileInfo.class),
            f -> f.withMarshaller(CreateApiTestSuiteByRepoFileRequest::getBody,
                CreateApiTestSuiteByRepoFileRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAlertGroupsByConditionRequest, ListAlertGroupsByConditionResponse> listAlertGroupsByCondition =
        genForListAlertGroupsByCondition();

    private static HttpRequestDef<ListAlertGroupsByConditionRequest, ListAlertGroupsByConditionResponse> genForListAlertGroupsByCondition() {
        // basic
        HttpRequestDef.Builder<ListAlertGroupsByConditionRequest, ListAlertGroupsByConditionResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ListAlertGroupsByConditionRequest.class,
                    ListAlertGroupsByConditionResponse.class)
                .withName("ListAlertGroupsByCondition")
                .withUri("/v1/projects/{service_id}/alert/group/users")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("service_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAlertGroupsByConditionRequest::getServiceId,
                ListAlertGroupsByConditionRequest::setServiceId));
        builder.<ListAlertGroupsByConditionRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListAlertGroupsByConditionRequestBody.class),
            f -> f.withMarshaller(ListAlertGroupsByConditionRequest::getBody,
                ListAlertGroupsByConditionRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAlertTemplatesRequest, ListAlertTemplatesResponse> listAlertTemplates =
        genForListAlertTemplates();

    private static HttpRequestDef<ListAlertTemplatesRequest, ListAlertTemplatesResponse> genForListAlertTemplates() {
        // basic
        HttpRequestDef.Builder<ListAlertTemplatesRequest, ListAlertTemplatesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAlertTemplatesRequest.class, ListAlertTemplatesResponse.class)
                .withName("ListAlertTemplates")
                .withUri("/v1/projects/{service_id}/alert-templates")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("service_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAlertTemplatesRequest::getServiceId, ListAlertTemplatesRequest::setServiceId));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAlertTemplatesRequest::getName, ListAlertTemplatesRequest::setName));
        builder.<Integer>withRequestField("pageNum",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAlertTemplatesRequest::getPageNum, ListAlertTemplatesRequest::setPageNum));
        builder.<Integer>withRequestField("pageSize",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAlertTemplatesRequest::getPageSize, ListAlertTemplatesRequest::setPageSize));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAllConfigItemByTypeRequest, ListAllConfigItemByTypeResponse> listAllConfigItemByType =
        genForListAllConfigItemByType();

    private static HttpRequestDef<ListAllConfigItemByTypeRequest, ListAllConfigItemByTypeResponse> genForListAllConfigItemByType() {
        // basic
        HttpRequestDef.Builder<ListAllConfigItemByTypeRequest, ListAllConfigItemByTypeResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ListAllConfigItemByTypeRequest.class, ListAllConfigItemByTypeResponse.class)
            .withName("ListAllConfigItemByType")
            .withUri("/v1/projects/{service_id}/service/configs")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("service_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAllConfigItemByTypeRequest::getServiceId,
                ListAllConfigItemByTypeRequest::setServiceId));
        builder.<ListAllConfigItemByTypeRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListAllConfigItemByTypeRequestBody.class),
            f -> f.withMarshaller(ListAllConfigItemByTypeRequest::getBody, ListAllConfigItemByTypeRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SaveTaskSettingRequest, SaveTaskSettingResponse> saveTaskSetting =
        genForSaveTaskSetting();

    private static HttpRequestDef<SaveTaskSettingRequest, SaveTaskSettingResponse> genForSaveTaskSetting() {
        // basic
        HttpRequestDef.Builder<SaveTaskSettingRequest, SaveTaskSettingResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, SaveTaskSettingRequest.class, SaveTaskSettingResponse.class)
                .withName("SaveTaskSetting")
                .withUri("/v1/projects/{service_id}/task/settings")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("service_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SaveTaskSettingRequest::getServiceId, SaveTaskSettingRequest::setServiceId));
        builder.<SaveTaskSettingRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SaveTaskSettingRequestBody.class),
            f -> f.withMarshaller(SaveTaskSettingRequest::getBody, SaveTaskSettingRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAllConfigValueByTypeAndKeyRequest, ShowAllConfigValueByTypeAndKeyResponse> showAllConfigValueByTypeAndKey =
        genForShowAllConfigValueByTypeAndKey();

    private static HttpRequestDef<ShowAllConfigValueByTypeAndKeyRequest, ShowAllConfigValueByTypeAndKeyResponse> genForShowAllConfigValueByTypeAndKey() {
        // basic
        HttpRequestDef.Builder<ShowAllConfigValueByTypeAndKeyRequest, ShowAllConfigValueByTypeAndKeyResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowAllConfigValueByTypeAndKeyRequest.class,
                    ShowAllConfigValueByTypeAndKeyResponse.class)
                .withName("ShowAllConfigValueByTypeAndKey")
                .withUri("/v1/projects/{service_id}/service/config")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("service_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAllConfigValueByTypeAndKeyRequest::getServiceId,
                ShowAllConfigValueByTypeAndKeyRequest::setServiceId));
        builder.<String>withRequestField("key",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAllConfigValueByTypeAndKeyRequest::getKey,
                ShowAllConfigValueByTypeAndKeyRequest::setKey));
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAllConfigValueByTypeAndKeyRequest::getType,
                ShowAllConfigValueByTypeAndKeyRequest::setType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowIfTaskNameRepeatRequest, ShowIfTaskNameRepeatResponse> showIfTaskNameRepeat =
        genForShowIfTaskNameRepeat();

    private static HttpRequestDef<ShowIfTaskNameRepeatRequest, ShowIfTaskNameRepeatResponse> genForShowIfTaskNameRepeat() {
        // basic
        HttpRequestDef.Builder<ShowIfTaskNameRepeatRequest, ShowIfTaskNameRepeatResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowIfTaskNameRepeatRequest.class, ShowIfTaskNameRepeatResponse.class)
            .withName("ShowIfTaskNameRepeat")
            .withUri("/v1/projects/{service_id}/alert-templates/name")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("service_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowIfTaskNameRepeatRequest::getServiceId,
                ShowIfTaskNameRepeatRequest::setServiceId));
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowIfTaskNameRepeatRequest::getId, ShowIfTaskNameRepeatRequest::setId));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowIfTaskNameRepeatRequest::getName, ShowIfTaskNameRepeatRequest::setName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowIfUserNameRepeatRequest, ShowIfUserNameRepeatResponse> showIfUserNameRepeat =
        genForShowIfUserNameRepeat();

    private static HttpRequestDef<ShowIfUserNameRepeatRequest, ShowIfUserNameRepeatResponse> genForShowIfUserNameRepeat() {
        // basic
        HttpRequestDef.Builder<ShowIfUserNameRepeatRequest, ShowIfUserNameRepeatResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowIfUserNameRepeatRequest.class, ShowIfUserNameRepeatResponse.class)
            .withName("ShowIfUserNameRepeat")
            .withUri("/v1/projects/{service_id}/alert/user/name")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("service_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowIfUserNameRepeatRequest::getServiceId,
                ShowIfUserNameRepeatRequest::setServiceId));
        builder.<String>withRequestField("userId",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowIfUserNameRepeatRequest::getUserId, ShowIfUserNameRepeatRequest::setUserId));
        builder.<String>withRequestField("userName",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowIfUserNameRepeatRequest::getUserName, ShowIfUserNameRepeatRequest::setUserName));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowIfUserNameRepeatResponse::getBody, ShowIfUserNameRepeatResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<ListEnvironmentsRequest, ListEnvironmentsResponse> listEnvironments =
        genForListEnvironments();

    private static HttpRequestDef<ListEnvironmentsRequest, ListEnvironmentsResponse> genForListEnvironments() {
        // basic
        HttpRequestDef.Builder<ListEnvironmentsRequest, ListEnvironmentsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListEnvironmentsRequest.class, ListEnvironmentsResponse.class)
                .withName("ListEnvironments")
                .withUri("/v1/projects/{project_id}/environments")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEnvironmentsRequest::getProjectId, ListEnvironmentsRequest::setProjectId));
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListEnvironmentsRequest::getOffset, ListEnvironmentsRequest::setOffset));
        builder.<Long>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListEnvironmentsRequest::getLimit, ListEnvironmentsRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListBasicAwRequest, ListBasicAwResponse> listBasicAw = genForListBasicAw();

    private static HttpRequestDef<ListBasicAwRequest, ListBasicAwResponse> genForListBasicAw() {
        // basic
        HttpRequestDef.Builder<ListBasicAwRequest, ListBasicAwResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListBasicAwRequest.class, ListBasicAwResponse.class)
                .withName("ListBasicAw")
                .withUri("/v3/{project_id}/basic-aw/{aw_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBasicAwRequest::getProjectId, ListBasicAwRequest::setProjectId));
        builder.<String>withRequestField("aw_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBasicAwRequest::getAwId, ListBasicAwRequest::setAwId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPublicLibAndAwsRequest, ListPublicLibAndAwsResponse> listPublicLibAndAws =
        genForListPublicLibAndAws();

    private static HttpRequestDef<ListPublicLibAndAwsRequest, ListPublicLibAndAwsResponse> genForListPublicLibAndAws() {
        // basic
        HttpRequestDef.Builder<ListPublicLibAndAwsRequest, ListPublicLibAndAwsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListPublicLibAndAwsRequest.class, ListPublicLibAndAwsResponse.class)
                .withName("ListPublicLibAndAws")
                .withUri("/v1/project/{project_id}/public_aw_lib_and_aws")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPublicLibAndAwsRequest::getProjectId, ListPublicLibAndAwsRequest::setProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListUserDnsMappingRequest, ListUserDnsMappingResponse> listUserDnsMapping =
        genForListUserDnsMapping();

    private static HttpRequestDef<ListUserDnsMappingRequest, ListUserDnsMappingResponse> genForListUserDnsMapping() {
        // basic
        HttpRequestDef.Builder<ListUserDnsMappingRequest, ListUserDnsMappingResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListUserDnsMappingRequest.class, ListUserDnsMappingResponse.class)
                .withName("ListUserDnsMapping")
                .withUri("/v1/{project_id}/dns-mapping")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUserDnsMappingRequest::getProjectId, ListUserDnsMappingRequest::setProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListVariablesRequest, ListVariablesResponse> listVariables =
        genForListVariables();

    private static HttpRequestDef<ListVariablesRequest, ListVariablesResponse> genForListVariables() {
        // basic
        HttpRequestDef.Builder<ListVariablesRequest, ListVariablesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListVariablesRequest.class, ListVariablesResponse.class)
                .withName("ListVariables")
                .withUri("/v4/{project_id}/variables")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVariablesRequest::getProjectId, ListVariablesRequest::setProjectId));
        builder.<String>withRequestField("group_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVariablesRequest::getGroupId, ListVariablesRequest::setGroupId));
        builder.<String>withRequestField("page_no",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVariablesRequest::getPageNo, ListVariablesRequest::setPageNo));
        builder.<String>withRequestField("page_size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVariablesRequest::getPageSize, ListVariablesRequest::setPageSize));

        // response

        return builder.build();
    }

}
