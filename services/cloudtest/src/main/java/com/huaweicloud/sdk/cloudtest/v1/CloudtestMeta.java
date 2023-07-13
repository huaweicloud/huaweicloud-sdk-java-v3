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
import com.huaweicloud.sdk.cloudtest.v1.model.ListEnvironmentsRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ListEnvironmentsResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.RunTestCaseRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.RunTestCaseRequestBody;
import com.huaweicloud.sdk.cloudtest.v1.model.RunTestCaseResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ServiceRequestBody;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowIssuesByPlanIdRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowIssuesByPlanIdResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowPlanJournalsRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowPlanJournalsResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowPlanListRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowPlanListResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowPlansRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowPlansResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowRegisterServiceRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowRegisterServiceResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowReportRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowReportResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowTestCaseDetailRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowTestCaseDetailResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowTestCaseDetailV2Request;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowTestCaseDetailV2Response;
import com.huaweicloud.sdk.cloudtest.v1.model.TestPlanDetail;
import com.huaweicloud.sdk.cloudtest.v1.model.TestPlanIssueDetail;
import com.huaweicloud.sdk.cloudtest.v1.model.TestPlanJournalList;
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
        genForbatchDeleteTestCase();

    private static HttpRequestDef<BatchDeleteTestCaseRequest, BatchDeleteTestCaseResponse> genForbatchDeleteTestCase() {
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
            f -> f.withMarshaller(BatchDeleteTestCaseRequest::getProjectId, (req, v) -> {
                req.setProjectId(v);
            }));
        builder.<BatchDeleteTestCaseRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchDeleteTestCaseRequestBody.class),
            f -> f.withMarshaller(BatchDeleteTestCaseRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreatePlanRequest, CreatePlanResponse> createPlan = genForcreatePlan();

    private static HttpRequestDef<CreatePlanRequest, CreatePlanResponse> genForcreatePlan() {
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
            f -> f.withMarshaller(CreatePlanRequest::getProjectId, (req, v) -> {
                req.setProjectId(v);
            }));
        builder.<CreatePlanRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreatePlanRequestBody.class),
            f -> f.withMarshaller(CreatePlanRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateServiceRequest, CreateServiceResponse> createService =
        genForcreateService();

    private static HttpRequestDef<CreateServiceRequest, CreateServiceResponse> genForcreateService() {
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
            f -> f.withMarshaller(CreateServiceRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateTestCaseRequest, CreateTestCaseResponse> createTestCase =
        genForcreateTestCase();

    private static HttpRequestDef<CreateTestCaseRequest, CreateTestCaseResponse> genForcreateTestCase() {
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
            f -> f.withMarshaller(CreateTestCaseRequest::getProjectId, (req, v) -> {
                req.setProjectId(v);
            }));
        builder.<CreateTestCaseRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateTestCaseRequestBody.class),
            f -> f.withMarshaller(CreateTestCaseRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateTestCaseInPlanRequest, CreateTestCaseInPlanResponse> createTestCaseInPlan =
        genForcreateTestCaseInPlan();

    private static HttpRequestDef<CreateTestCaseInPlanRequest, CreateTestCaseInPlanResponse> genForcreateTestCaseInPlan() {
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
            f -> f.withMarshaller(CreateTestCaseInPlanRequest::getProjectId, (req, v) -> {
                req.setProjectId(v);
            }));
        builder.<String>withRequestField("plan_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateTestCaseInPlanRequest::getPlanId, (req, v) -> {
                req.setPlanId(v);
            }));
        builder.<CreateTestCaseInPlanRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateTestCaseInPlanRequestBody.class),
            f -> f.withMarshaller(CreateTestCaseInPlanRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteServiceRequest, DeleteServiceResponse> deleteService =
        genFordeleteService();

    private static HttpRequestDef<DeleteServiceRequest, DeleteServiceResponse> genFordeleteService() {
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
            f -> f.withMarshaller(DeleteServiceRequest::getServiceId, (req, v) -> {
                req.setServiceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RunTestCaseRequest, RunTestCaseResponse> runTestCase = genForrunTestCase();

    private static HttpRequestDef<RunTestCaseRequest, RunTestCaseResponse> genForrunTestCase() {
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
            f -> f.withMarshaller(RunTestCaseRequest::getProjectId, (req, v) -> {
                req.setProjectId(v);
            }));
        builder.<RunTestCaseRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RunTestCaseRequestBody.class),
            f -> f.withMarshaller(RunTestCaseRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowIssuesByPlanIdRequest, ShowIssuesByPlanIdResponse> showIssuesByPlanId =
        genForshowIssuesByPlanId();

    private static HttpRequestDef<ShowIssuesByPlanIdRequest, ShowIssuesByPlanIdResponse> genForshowIssuesByPlanId() {
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
            f -> f.withMarshaller(ShowIssuesByPlanIdRequest::getProjectId, (req, v) -> {
                req.setProjectId(v);
            }));
        builder.<String>withRequestField("plan_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowIssuesByPlanIdRequest::getPlanId, (req, v) -> {
                req.setPlanId(v);
            }));
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowIssuesByPlanIdRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Long>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowIssuesByPlanIdRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));

        // response
        builder.<List<TestPlanIssueDetail>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ShowIssuesByPlanIdResponse::getBody, (response, data) -> {
                response.setBody(data);
            }).withInnerContainerType(TestPlanIssueDetail.class));

        return builder.build();
    }

    public static final HttpRequestDef<ShowPlanJournalsRequest, ShowPlanJournalsResponse> showPlanJournals =
        genForshowPlanJournals();

    private static HttpRequestDef<ShowPlanJournalsRequest, ShowPlanJournalsResponse> genForshowPlanJournals() {
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
            f -> f.withMarshaller(ShowPlanJournalsRequest::getProjectId, (req, v) -> {
                req.setProjectId(v);
            }));
        builder.<String>withRequestField("plan_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPlanJournalsRequest::getPlanId, (req, v) -> {
                req.setPlanId(v);
            }));
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowPlanJournalsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Long>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowPlanJournalsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));

        // response
        builder.<List<TestPlanJournalList>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ShowPlanJournalsResponse::getBody, (response, data) -> {
                response.setBody(data);
            }).withInnerContainerType(TestPlanJournalList.class));

        return builder.build();
    }

    public static final HttpRequestDef<ShowPlanListRequest, ShowPlanListResponse> showPlanList = genForshowPlanList();

    private static HttpRequestDef<ShowPlanListRequest, ShowPlanListResponse> genForshowPlanList() {
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
            f -> f.withMarshaller(ShowPlanListRequest::getProjectId, (req, v) -> {
                req.setProjectId(v);
            }));
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowPlanListRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Long>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowPlanListRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPlanListRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<String>withRequestField("current_stage",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPlanListRequest::getCurrentStage, (req, v) -> {
                req.setCurrentStage(v);
            }));

        // response
        builder.<List<TestPlanDetail>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ShowPlanListResponse::getBody, (response, data) -> {
                response.setBody(data);
            }).withInnerContainerType(TestPlanDetail.class));

        return builder.build();
    }

    public static final HttpRequestDef<ShowPlansRequest, ShowPlansResponse> showPlans = genForshowPlans();

    private static HttpRequestDef<ShowPlansRequest, ShowPlansResponse> genForshowPlans() {
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
            f -> f.withMarshaller(ShowPlansRequest::getProjectId, (req, v) -> {
                req.setProjectId(v);
            }));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPlansRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<String>withRequestField("current_stage",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPlansRequest::getCurrentStage, (req, v) -> {
                req.setCurrentStage(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowPlansRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowPlansRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));

        // response
        builder.<List<TestPlanDetail>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ShowPlansResponse::getBody, (response, data) -> {
                response.setBody(data);
            }).withInnerContainerType(TestPlanDetail.class));

        return builder.build();
    }

    public static final HttpRequestDef<ShowRegisterServiceRequest, ShowRegisterServiceResponse> showRegisterService =
        genForshowRegisterService();

    private static HttpRequestDef<ShowRegisterServiceRequest, ShowRegisterServiceResponse> genForshowRegisterService() {
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

    public static final HttpRequestDef<ShowReportRequest, ShowReportResponse> showReport = genForshowReport();

    private static HttpRequestDef<ShowReportRequest, ShowReportResponse> genForshowReport() {
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
            f -> f.withMarshaller(ShowReportRequest::getProjectId, (req, v) -> {
                req.setProjectId(v);
            }));
        builder.<String>withRequestField("plan_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowReportRequest::getPlanId, (req, v) -> {
                req.setPlanId(v);
            }));
        builder.<GenerateReportInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(GenerateReportInfo.class),
            f -> f.withMarshaller(ShowReportRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTestCaseDetailRequest, ShowTestCaseDetailResponse> showTestCaseDetail =
        genForshowTestCaseDetail();

    private static HttpRequestDef<ShowTestCaseDetailRequest, ShowTestCaseDetailResponse> genForshowTestCaseDetail() {
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
            f -> f.withMarshaller(ShowTestCaseDetailRequest::getProjectId, (req, v) -> {
                req.setProjectId(v);
            }));
        builder.<String>withRequestField("testcase_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTestCaseDetailRequest::getTestcaseId, (req, v) -> {
                req.setTestcaseId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTestCaseDetailV2Request, ShowTestCaseDetailV2Response> showTestCaseDetailV2 =
        genForshowTestCaseDetailV2();

    private static HttpRequestDef<ShowTestCaseDetailV2Request, ShowTestCaseDetailV2Response> genForshowTestCaseDetailV2() {
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
            f -> f.withMarshaller(ShowTestCaseDetailV2Request::getProjectId, (req, v) -> {
                req.setProjectId(v);
            }));
        builder.<String>withRequestField("testcase_number",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTestCaseDetailV2Request::getTestcaseNumber, (req, v) -> {
                req.setTestcaseNumber(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateServiceRequest, UpdateServiceResponse> updateService =
        genForupdateService();

    private static HttpRequestDef<UpdateServiceRequest, UpdateServiceResponse> genForupdateService() {
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
            f -> f.withMarshaller(UpdateServiceRequest::getServiceId, (req, v) -> {
                req.setServiceId(v);
            }));
        builder.<ServiceRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ServiceRequestBody.class),
            f -> f.withMarshaller(UpdateServiceRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateTestCaseRequest, UpdateTestCaseResponse> updateTestCase =
        genForupdateTestCase();

    private static HttpRequestDef<UpdateTestCaseRequest, UpdateTestCaseResponse> genForupdateTestCase() {
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
            f -> f.withMarshaller(UpdateTestCaseRequest::getProjectId, (req, v) -> {
                req.setProjectId(v);
            }));
        builder.<String>withRequestField("testcase_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateTestCaseRequest::getTestcaseId, (req, v) -> {
                req.setTestcaseId(v);
            }));
        builder.<UpdateTestCaseRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateTestCaseRequestBody.class),
            f -> f.withMarshaller(UpdateTestCaseRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateTestCaseResultRequest, UpdateTestCaseResultResponse> updateTestCaseResult =
        genForupdateTestCaseResult();

    private static HttpRequestDef<UpdateTestCaseResultRequest, UpdateTestCaseResultResponse> genForupdateTestCaseResult() {
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
            f -> f.withMarshaller(UpdateTestCaseResultRequest::getProjectId, (req, v) -> {
                req.setProjectId(v);
            }));
        builder.<UpdateTestCaseResultRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateTestCaseResultRequestBody.class),
            f -> f.withMarshaller(UpdateTestCaseResultRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateApiTestSuiteByRepoFileRequest, CreateApiTestSuiteByRepoFileResponse> createApiTestSuiteByRepoFile =
        genForcreateApiTestSuiteByRepoFile();

    private static HttpRequestDef<CreateApiTestSuiteByRepoFileRequest, CreateApiTestSuiteByRepoFileResponse> genForcreateApiTestSuiteByRepoFile() {
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
            f -> f.withMarshaller(CreateApiTestSuiteByRepoFileRequest::getProjectId, (req, v) -> {
                req.setProjectId(v);
            }));
        builder.<CreateTestSuitByRepoFileInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateTestSuitByRepoFileInfo.class),
            f -> f.withMarshaller(CreateApiTestSuiteByRepoFileRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListEnvironmentsRequest, ListEnvironmentsResponse> listEnvironments =
        genForlistEnvironments();

    private static HttpRequestDef<ListEnvironmentsRequest, ListEnvironmentsResponse> genForlistEnvironments() {
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
            f -> f.withMarshaller(ListEnvironmentsRequest::getProjectId, (req, v) -> {
                req.setProjectId(v);
            }));
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListEnvironmentsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Long>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListEnvironmentsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));

        // response

        return builder.build();
    }

}
