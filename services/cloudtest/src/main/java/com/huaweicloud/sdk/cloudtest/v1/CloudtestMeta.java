package com.huaweicloud.sdk.cloudtest.v1;

import com.huaweicloud.sdk.cloudtest.v1.model.BatchDeleteTestCaseRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.BatchDeleteTestCaseRequestBody;
import com.huaweicloud.sdk.cloudtest.v1.model.BatchDeleteTestCaseResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.CreateApiTestSuiteByRepoFileRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.CreateApiTestSuiteByRepoFileResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.CreatePlanRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.CreatePlanRequestBody;
import com.huaweicloud.sdk.cloudtest.v1.model.CreatePlanResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.CreateServiceRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.CreateServiceResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.CreateTestCaseInPlanRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.CreateTestCaseInPlanRequestBody;
import com.huaweicloud.sdk.cloudtest.v1.model.CreateTestCaseInPlanResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.CreateTestCaseRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.CreateTestCaseRequestBody;
import com.huaweicloud.sdk.cloudtest.v1.model.CreateTestCaseResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.CreateTestSuitByRepoFileInfo;
import com.huaweicloud.sdk.cloudtest.v1.model.DeleteServiceRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.DeleteServiceResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.GenerateReportInfo;
import com.huaweicloud.sdk.cloudtest.v1.model.ListBranchesRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ListBranchesResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ListEnvironmentsRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ListEnvironmentsResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ListTestCaseHistoriesRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ListTestCaseHistoriesRequestBody;
import com.huaweicloud.sdk.cloudtest.v1.model.ListTestCaseHistoriesResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ListTestCasesRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ListTestCasesRequestBody;
import com.huaweicloud.sdk.cloudtest.v1.model.ListTestCasesResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ListTestcasesByProjectIssuesRelationRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ListTestcasesByProjectIssuesRelationResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.QueryProjectIssuesRelationTestCasesInfo;
import com.huaweicloud.sdk.cloudtest.v1.model.RunTestCaseRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.RunTestCaseRequestBody;
import com.huaweicloud.sdk.cloudtest.v1.model.RunTestCaseResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ServiceRequestBody;
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
import com.huaweicloud.sdk.cloudtest.v1.model.ShowTestCaseAndDefectInfoRequestBody;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowTestCaseAndDefectInfoResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowTestCaseDetailRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowTestCaseDetailResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowTestCaseDetailV2Request;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowTestCaseDetailV2Response;
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

}
