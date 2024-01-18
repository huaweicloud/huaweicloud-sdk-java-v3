package com.huaweicloud.sdk.projectman.v4;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.projectman.v4.model.AddApplyJoinProjectForAgcRequest;
import com.huaweicloud.sdk.projectman.v4.model.AddApplyJoinProjectForAgcResponse;
import com.huaweicloud.sdk.projectman.v4.model.AddIssueWorkHoursRequest;
import com.huaweicloud.sdk.projectman.v4.model.AddIssueWorkHoursRequestBody;
import com.huaweicloud.sdk.projectman.v4.model.AddIssueWorkHoursResponse;
import com.huaweicloud.sdk.projectman.v4.model.AddMemberRequestV4;
import com.huaweicloud.sdk.projectman.v4.model.AddMemberV4Request;
import com.huaweicloud.sdk.projectman.v4.model.AddMemberV4Response;
import com.huaweicloud.sdk.projectman.v4.model.BatchAddMembersV4Request;
import com.huaweicloud.sdk.projectman.v4.model.BatchAddMembersV4RequestBody;
import com.huaweicloud.sdk.projectman.v4.model.BatchAddMembersV4Response;
import com.huaweicloud.sdk.projectman.v4.model.BatchDelelteIssuesRequestV4;
import com.huaweicloud.sdk.projectman.v4.model.BatchDeleteIssuesV4Request;
import com.huaweicloud.sdk.projectman.v4.model.BatchDeleteIssuesV4Response;
import com.huaweicloud.sdk.projectman.v4.model.BatchDeleteIterationsV4Request;
import com.huaweicloud.sdk.projectman.v4.model.BatchDeleteIterationsV4RequestBody;
import com.huaweicloud.sdk.projectman.v4.model.BatchDeleteIterationsV4Response;
import com.huaweicloud.sdk.projectman.v4.model.BatchDeleteMembersV4Request;
import com.huaweicloud.sdk.projectman.v4.model.BatchDeleteMembersV4RequestBody;
import com.huaweicloud.sdk.projectman.v4.model.BatchDeleteMembersV4Response;
import com.huaweicloud.sdk.projectman.v4.model.BatchUpdateChildNickNamesRequest;
import com.huaweicloud.sdk.projectman.v4.model.BatchUpdateChildNickNamesResponse;
import com.huaweicloud.sdk.projectman.v4.model.BatchUpdateChildUserNickNamesRequestBody;
import com.huaweicloud.sdk.projectman.v4.model.CancelProjectDomainRequest;
import com.huaweicloud.sdk.projectman.v4.model.CancelProjectDomainResponse;
import com.huaweicloud.sdk.projectman.v4.model.CheckProjectNameRequestV4;
import com.huaweicloud.sdk.projectman.v4.model.CheckProjectNameV4Request;
import com.huaweicloud.sdk.projectman.v4.model.CheckProjectNameV4Response;
import com.huaweicloud.sdk.projectman.v4.model.CreateCustomfieldV1Req;
import com.huaweicloud.sdk.projectman.v4.model.CreateCustomfieldsRequest;
import com.huaweicloud.sdk.projectman.v4.model.CreateCustomfieldsResponse;
import com.huaweicloud.sdk.projectman.v4.model.CreateIssueRequestV4;
import com.huaweicloud.sdk.projectman.v4.model.CreateIssueV4Request;
import com.huaweicloud.sdk.projectman.v4.model.CreateIssueV4Response;
import com.huaweicloud.sdk.projectman.v4.model.CreateIterationRequestV4;
import com.huaweicloud.sdk.projectman.v4.model.CreateIterationV4Request;
import com.huaweicloud.sdk.projectman.v4.model.CreateIterationV4Response;
import com.huaweicloud.sdk.projectman.v4.model.CreateProjectDomainRequest;
import com.huaweicloud.sdk.projectman.v4.model.CreateProjectDomainRequestBody;
import com.huaweicloud.sdk.projectman.v4.model.CreateProjectDomainResponse;
import com.huaweicloud.sdk.projectman.v4.model.CreateProjectModuleRequest;
import com.huaweicloud.sdk.projectman.v4.model.CreateProjectModuleRequestBody;
import com.huaweicloud.sdk.projectman.v4.model.CreateProjectModuleResponse;
import com.huaweicloud.sdk.projectman.v4.model.CreateProjectV4Request;
import com.huaweicloud.sdk.projectman.v4.model.CreateProjectV4RequestBody;
import com.huaweicloud.sdk.projectman.v4.model.CreateProjectV4Response;
import com.huaweicloud.sdk.projectman.v4.model.CreateSystemIssueRequestV4;
import com.huaweicloud.sdk.projectman.v4.model.CreateSystemIssueV4Request;
import com.huaweicloud.sdk.projectman.v4.model.CreateSystemIssueV4Response;
import com.huaweicloud.sdk.projectman.v4.model.DeleteAttachmentRequest;
import com.huaweicloud.sdk.projectman.v4.model.DeleteAttachmentResponse;
import com.huaweicloud.sdk.projectman.v4.model.DeleteIssueV4Request;
import com.huaweicloud.sdk.projectman.v4.model.DeleteIssueV4Response;
import com.huaweicloud.sdk.projectman.v4.model.DeleteIterationV4Request;
import com.huaweicloud.sdk.projectman.v4.model.DeleteIterationV4Response;
import com.huaweicloud.sdk.projectman.v4.model.DeleteProjectModuleRequest;
import com.huaweicloud.sdk.projectman.v4.model.DeleteProjectModuleResponse;
import com.huaweicloud.sdk.projectman.v4.model.DeleteProjectV4Request;
import com.huaweicloud.sdk.projectman.v4.model.DeleteProjectV4Response;
import com.huaweicloud.sdk.projectman.v4.model.DownloadAttachmentRequest;
import com.huaweicloud.sdk.projectman.v4.model.DownloadAttachmentResponse;
import com.huaweicloud.sdk.projectman.v4.model.DownloadImageFileRequest;
import com.huaweicloud.sdk.projectman.v4.model.DownloadImageFileResponse;
import com.huaweicloud.sdk.projectman.v4.model.IssueRequestV4;
import com.huaweicloud.sdk.projectman.v4.model.ListAssociatedIssuesRequest;
import com.huaweicloud.sdk.projectman.v4.model.ListAssociatedIssuesResponse;
import com.huaweicloud.sdk.projectman.v4.model.ListAssociatedTestCasesRequest;
import com.huaweicloud.sdk.projectman.v4.model.ListAssociatedTestCasesResponse;
import com.huaweicloud.sdk.projectman.v4.model.ListAssociatedWikisRequest;
import com.huaweicloud.sdk.projectman.v4.model.ListAssociatedWikisResponse;
import com.huaweicloud.sdk.projectman.v4.model.ListChildIssuesV4Request;
import com.huaweicloud.sdk.projectman.v4.model.ListChildIssuesV4Response;
import com.huaweicloud.sdk.projectman.v4.model.ListDomainNotAddedProjectsV4Request;
import com.huaweicloud.sdk.projectman.v4.model.ListDomainNotAddedProjectsV4Response;
import com.huaweicloud.sdk.projectman.v4.model.ListIssueAssociatedCommitsRequest;
import com.huaweicloud.sdk.projectman.v4.model.ListIssueAssociatedCommitsResponse;
import com.huaweicloud.sdk.projectman.v4.model.ListIssueCommentsV4Request;
import com.huaweicloud.sdk.projectman.v4.model.ListIssueCommentsV4Response;
import com.huaweicloud.sdk.projectman.v4.model.ListIssueCustomFieldsRequest;
import com.huaweicloud.sdk.projectman.v4.model.ListIssueCustomFieldsRequestBody;
import com.huaweicloud.sdk.projectman.v4.model.ListIssueCustomFieldsResponse;
import com.huaweicloud.sdk.projectman.v4.model.ListIssueRecordsV4Request;
import com.huaweicloud.sdk.projectman.v4.model.ListIssueRecordsV4Response;
import com.huaweicloud.sdk.projectman.v4.model.ListIssueRequestV4;
import com.huaweicloud.sdk.projectman.v4.model.ListIssuesSfV4Request;
import com.huaweicloud.sdk.projectman.v4.model.ListIssuesSfV4Response;
import com.huaweicloud.sdk.projectman.v4.model.ListIssuesV4Request;
import com.huaweicloud.sdk.projectman.v4.model.ListIssuesV4Response;
import com.huaweicloud.sdk.projectman.v4.model.ListIterationHistoriesRequest;
import com.huaweicloud.sdk.projectman.v4.model.ListIterationHistoriesResponse;
import com.huaweicloud.sdk.projectman.v4.model.ListProjectBugStaticsV4Request;
import com.huaweicloud.sdk.projectman.v4.model.ListProjectBugStaticsV4Response;
import com.huaweicloud.sdk.projectman.v4.model.ListProjectDemandStaticV4Request;
import com.huaweicloud.sdk.projectman.v4.model.ListProjectDemandStaticV4Response;
import com.huaweicloud.sdk.projectman.v4.model.ListProjectDomainsRequest;
import com.huaweicloud.sdk.projectman.v4.model.ListProjectDomainsResponse;
import com.huaweicloud.sdk.projectman.v4.model.ListProjectIssuesRecordsV4Request;
import com.huaweicloud.sdk.projectman.v4.model.ListProjectIssuesRecordsV4Response;
import com.huaweicloud.sdk.projectman.v4.model.ListProjectIterationsV4Request;
import com.huaweicloud.sdk.projectman.v4.model.ListProjectIterationsV4Response;
import com.huaweicloud.sdk.projectman.v4.model.ListProjectMembersV4Request;
import com.huaweicloud.sdk.projectman.v4.model.ListProjectMembersV4Response;
import com.huaweicloud.sdk.projectman.v4.model.ListProjectModulesRequest;
import com.huaweicloud.sdk.projectman.v4.model.ListProjectModulesResponse;
import com.huaweicloud.sdk.projectman.v4.model.ListProjectWorkHoursRequest;
import com.huaweicloud.sdk.projectman.v4.model.ListProjectWorkHoursRequestBody;
import com.huaweicloud.sdk.projectman.v4.model.ListProjectWorkHoursResponse;
import com.huaweicloud.sdk.projectman.v4.model.ListProjectWorkHoursTypeRequest;
import com.huaweicloud.sdk.projectman.v4.model.ListProjectWorkHoursTypeResponse;
import com.huaweicloud.sdk.projectman.v4.model.ListProjectsV4Request;
import com.huaweicloud.sdk.projectman.v4.model.ListProjectsV4Response;
import com.huaweicloud.sdk.projectman.v4.model.ListScrumProjectStatusesRequest;
import com.huaweicloud.sdk.projectman.v4.model.ListScrumProjectStatusesResponse;
import com.huaweicloud.sdk.projectman.v4.model.ListSpecIssueStayTimesRequest;
import com.huaweicloud.sdk.projectman.v4.model.ListSpecIssueStayTimesRequestBody;
import com.huaweicloud.sdk.projectman.v4.model.ListSpecIssueStayTimesResponse;
import com.huaweicloud.sdk.projectman.v4.model.ListStatusStatisticRequest;
import com.huaweicloud.sdk.projectman.v4.model.ListStatusStatisticResponse;
import com.huaweicloud.sdk.projectman.v4.model.ListTemplatesRequest;
import com.huaweicloud.sdk.projectman.v4.model.ListTemplatesResponse;
import com.huaweicloud.sdk.projectman.v4.model.ListWorkTableIssueRequestV4RequestBody;
import com.huaweicloud.sdk.projectman.v4.model.ListWorkitemStatusRecordsV4Request;
import com.huaweicloud.sdk.projectman.v4.model.ListWorkitemStatusRecordsV4Response;
import com.huaweicloud.sdk.projectman.v4.model.ListWorkitemsRequest;
import com.huaweicloud.sdk.projectman.v4.model.ListWorkitemsResponse;
import com.huaweicloud.sdk.projectman.v4.model.MetricRequest2;
import com.huaweicloud.sdk.projectman.v4.model.MetricRequest3;
import com.huaweicloud.sdk.projectman.v4.model.MetricRequestV2;
import com.huaweicloud.sdk.projectman.v4.model.RemoveProjectRequest;
import com.huaweicloud.sdk.projectman.v4.model.RemoveProjectResponse;
import com.huaweicloud.sdk.projectman.v4.model.SearchIssuesRequest;
import com.huaweicloud.sdk.projectman.v4.model.SearchIssuesResponse;
import com.huaweicloud.sdk.projectman.v4.model.ShowBugDensityV2Request;
import com.huaweicloud.sdk.projectman.v4.model.ShowBugDensityV2Response;
import com.huaweicloud.sdk.projectman.v4.model.ShowBugsPerDeveloperRequest;
import com.huaweicloud.sdk.projectman.v4.model.ShowBugsPerDeveloperResponse;
import com.huaweicloud.sdk.projectman.v4.model.ShowCompletionRateRequest;
import com.huaweicloud.sdk.projectman.v4.model.ShowCompletionRateResponse;
import com.huaweicloud.sdk.projectman.v4.model.ShowCurUserInfoRequest;
import com.huaweicloud.sdk.projectman.v4.model.ShowCurUserInfoResponse;
import com.huaweicloud.sdk.projectman.v4.model.ShowCurUserRoleRequest;
import com.huaweicloud.sdk.projectman.v4.model.ShowCurUserRoleResponse;
import com.huaweicloud.sdk.projectman.v4.model.ShowIssueCompletionRateRequest;
import com.huaweicloud.sdk.projectman.v4.model.ShowIssueCompletionRateResponse;
import com.huaweicloud.sdk.projectman.v4.model.ShowIssueV4Request;
import com.huaweicloud.sdk.projectman.v4.model.ShowIssueV4Response;
import com.huaweicloud.sdk.projectman.v4.model.ShowIssuesWrokFlowConfigRequest;
import com.huaweicloud.sdk.projectman.v4.model.ShowIssuesWrokFlowConfigResponse;
import com.huaweicloud.sdk.projectman.v4.model.ShowIterationV4Request;
import com.huaweicloud.sdk.projectman.v4.model.ShowIterationV4Response;
import com.huaweicloud.sdk.projectman.v4.model.ShowProjectInfoV4Request;
import com.huaweicloud.sdk.projectman.v4.model.ShowProjectInfoV4Response;
import com.huaweicloud.sdk.projectman.v4.model.ShowProjectSummaryV4Request;
import com.huaweicloud.sdk.projectman.v4.model.ShowProjectSummaryV4Response;
import com.huaweicloud.sdk.projectman.v4.model.ShowProjectWorkHoursRequest;
import com.huaweicloud.sdk.projectman.v4.model.ShowProjectWorkHoursRequestBody;
import com.huaweicloud.sdk.projectman.v4.model.ShowProjectWorkHoursResponse;
import com.huaweicloud.sdk.projectman.v4.model.ShowWorkItemWrokflowConfigRequest;
import com.huaweicloud.sdk.projectman.v4.model.ShowWorkItemWrokflowConfigResponse;
import com.huaweicloud.sdk.projectman.v4.model.UpdateIssueV4Request;
import com.huaweicloud.sdk.projectman.v4.model.UpdateIssueV4Response;
import com.huaweicloud.sdk.projectman.v4.model.UpdateIterationRequestV4;
import com.huaweicloud.sdk.projectman.v4.model.UpdateIterationV4Request;
import com.huaweicloud.sdk.projectman.v4.model.UpdateIterationV4Response;
import com.huaweicloud.sdk.projectman.v4.model.UpdateMembesRoleV4Request;
import com.huaweicloud.sdk.projectman.v4.model.UpdateMembesRoleV4RequestBody;
import com.huaweicloud.sdk.projectman.v4.model.UpdateMembesRoleV4Response;
import com.huaweicloud.sdk.projectman.v4.model.UpdateNickNameV4Request;
import com.huaweicloud.sdk.projectman.v4.model.UpdateNickNameV4Response;
import com.huaweicloud.sdk.projectman.v4.model.UpdateProjectDomainRequest;
import com.huaweicloud.sdk.projectman.v4.model.UpdateProjectDomainResponse;
import com.huaweicloud.sdk.projectman.v4.model.UpdateProjectModuleRequest;
import com.huaweicloud.sdk.projectman.v4.model.UpdateProjectModuleRequestBody;
import com.huaweicloud.sdk.projectman.v4.model.UpdateProjectModuleResponse;
import com.huaweicloud.sdk.projectman.v4.model.UpdateProjectRequestV4;
import com.huaweicloud.sdk.projectman.v4.model.UpdateProjectV4Request;
import com.huaweicloud.sdk.projectman.v4.model.UpdateProjectV4Response;
import com.huaweicloud.sdk.projectman.v4.model.UpdateUserNickNameRequestV4;
import com.huaweicloud.sdk.projectman.v4.model.UploadAttachmentsRequest;
import com.huaweicloud.sdk.projectman.v4.model.UploadAttachmentsRequestBody;
import com.huaweicloud.sdk.projectman.v4.model.UploadAttachmentsResponse;
import com.huaweicloud.sdk.projectman.v4.model.UploadIssueImgRequest;
import com.huaweicloud.sdk.projectman.v4.model.UploadIssueImgRequestBody;
import com.huaweicloud.sdk.projectman.v4.model.UploadIssueImgResponse;
import com.huaweicloud.sdk.projectman.v4.model.UserStatusStatistic;

import java.util.List;

@SuppressWarnings("unchecked")
public class ProjectManMeta {

    public static final HttpRequestDef<AddApplyJoinProjectForAgcRequest, AddApplyJoinProjectForAgcResponse> addApplyJoinProjectForAgc =
        genForAddApplyJoinProjectForAgc();

    private static HttpRequestDef<AddApplyJoinProjectForAgcRequest, AddApplyJoinProjectForAgcResponse> genForAddApplyJoinProjectForAgc() {
        // basic
        HttpRequestDef.Builder<AddApplyJoinProjectForAgcRequest, AddApplyJoinProjectForAgcResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    AddApplyJoinProjectForAgcRequest.class,
                    AddApplyJoinProjectForAgcResponse.class)
                .withName("AddApplyJoinProjectForAgc")
                .withUri("/v4/projects/{project_id}/members/agc-join")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddApplyJoinProjectForAgcRequest::getProjectId,
                AddApplyJoinProjectForAgcRequest::setProjectId));
        builder.<String>withRequestField("Domain-Id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddApplyJoinProjectForAgcRequest::getDomainId,
                AddApplyJoinProjectForAgcRequest::setDomainId));
        builder.<String>withRequestField("User-Id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddApplyJoinProjectForAgcRequest::getUserId,
                AddApplyJoinProjectForAgcRequest::setUserId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddMemberV4Request, AddMemberV4Response> addMemberV4 = genForAddMemberV4();

    private static HttpRequestDef<AddMemberV4Request, AddMemberV4Response> genForAddMemberV4() {
        // basic
        HttpRequestDef.Builder<AddMemberV4Request, AddMemberV4Response> builder =
            HttpRequestDef.builder(HttpMethod.POST, AddMemberV4Request.class, AddMemberV4Response.class)
                .withName("AddMemberV4")
                .withUri("/v4/projects/{project_id}/member")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddMemberV4Request::getProjectId, AddMemberV4Request::setProjectId));
        builder.<AddMemberRequestV4>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AddMemberRequestV4.class),
            f -> f.withMarshaller(AddMemberV4Request::getBody, AddMemberV4Request::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchAddMembersV4Request, BatchAddMembersV4Response> batchAddMembersV4 =
        genForBatchAddMembersV4();

    private static HttpRequestDef<BatchAddMembersV4Request, BatchAddMembersV4Response> genForBatchAddMembersV4() {
        // basic
        HttpRequestDef.Builder<BatchAddMembersV4Request, BatchAddMembersV4Response> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchAddMembersV4Request.class, BatchAddMembersV4Response.class)
                .withName("BatchAddMembersV4")
                .withUri("/v4/projects/{project_id}/members")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchAddMembersV4Request::getProjectId, BatchAddMembersV4Request::setProjectId));
        builder.<BatchAddMembersV4RequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchAddMembersV4RequestBody.class),
            f -> f.withMarshaller(BatchAddMembersV4Request::getBody, BatchAddMembersV4Request::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteMembersV4Request, BatchDeleteMembersV4Response> batchDeleteMembersV4 =
        genForBatchDeleteMembersV4();

    private static HttpRequestDef<BatchDeleteMembersV4Request, BatchDeleteMembersV4Response> genForBatchDeleteMembersV4() {
        // basic
        HttpRequestDef.Builder<BatchDeleteMembersV4Request, BatchDeleteMembersV4Response> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, BatchDeleteMembersV4Request.class, BatchDeleteMembersV4Response.class)
            .withName("BatchDeleteMembersV4")
            .withUri("/v4/projects/{project_id}/members")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeleteMembersV4Request::getProjectId,
                BatchDeleteMembersV4Request::setProjectId));
        builder.<BatchDeleteMembersV4RequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchDeleteMembersV4RequestBody.class),
            f -> f.withMarshaller(BatchDeleteMembersV4Request::getBody, BatchDeleteMembersV4Request::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchUpdateChildNickNamesRequest, BatchUpdateChildNickNamesResponse> batchUpdateChildNickNames =
        genForBatchUpdateChildNickNames();

    private static HttpRequestDef<BatchUpdateChildNickNamesRequest, BatchUpdateChildNickNamesResponse> genForBatchUpdateChildNickNames() {
        // basic
        HttpRequestDef.Builder<BatchUpdateChildNickNamesRequest, BatchUpdateChildNickNamesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    BatchUpdateChildNickNamesRequest.class,
                    BatchUpdateChildNickNamesResponse.class)
                .withName("BatchUpdateChildNickNames")
                .withUri("/v4/domain/child-users")
                .withContentType("application/json");

        // requests
        builder.<BatchUpdateChildUserNickNamesRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchUpdateChildUserNickNamesRequestBody.class),
            f -> f.withMarshaller(BatchUpdateChildNickNamesRequest::getBody,
                BatchUpdateChildNickNamesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CheckProjectNameV4Request, CheckProjectNameV4Response> checkProjectNameV4 =
        genForCheckProjectNameV4();

    private static HttpRequestDef<CheckProjectNameV4Request, CheckProjectNameV4Response> genForCheckProjectNameV4() {
        // basic
        HttpRequestDef.Builder<CheckProjectNameV4Request, CheckProjectNameV4Response> builder =
            HttpRequestDef.builder(HttpMethod.POST, CheckProjectNameV4Request.class, CheckProjectNameV4Response.class)
                .withName("CheckProjectNameV4")
                .withUri("/v4/projects/check-name")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<CheckProjectNameRequestV4>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CheckProjectNameRequestV4.class),
            f -> f.withMarshaller(CheckProjectNameV4Request::getBody, CheckProjectNameV4Request::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateProjectV4Request, CreateProjectV4Response> createProjectV4 =
        genForCreateProjectV4();

    private static HttpRequestDef<CreateProjectV4Request, CreateProjectV4Response> genForCreateProjectV4() {
        // basic
        HttpRequestDef.Builder<CreateProjectV4Request, CreateProjectV4Response> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateProjectV4Request.class, CreateProjectV4Response.class)
                .withName("CreateProjectV4")
                .withUri("/v4/project")
                .withContentType("application/json");

        // requests
        builder.<CreateProjectV4RequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateProjectV4RequestBody.class),
            f -> f.withMarshaller(CreateProjectV4Request::getBody, CreateProjectV4Request::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteProjectV4Request, DeleteProjectV4Response> deleteProjectV4 =
        genForDeleteProjectV4();

    private static HttpRequestDef<DeleteProjectV4Request, DeleteProjectV4Response> genForDeleteProjectV4() {
        // basic
        HttpRequestDef.Builder<DeleteProjectV4Request, DeleteProjectV4Response> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteProjectV4Request.class, DeleteProjectV4Response.class)
                .withName("DeleteProjectV4")
                .withUri("/v4/projects/{project_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteProjectV4Request::getProjectId, DeleteProjectV4Request::setProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDomainNotAddedProjectsV4Request, ListDomainNotAddedProjectsV4Response> listDomainNotAddedProjectsV4 =
        genForListDomainNotAddedProjectsV4();

    private static HttpRequestDef<ListDomainNotAddedProjectsV4Request, ListDomainNotAddedProjectsV4Response> genForListDomainNotAddedProjectsV4() {
        // basic
        HttpRequestDef.Builder<ListDomainNotAddedProjectsV4Request, ListDomainNotAddedProjectsV4Response> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListDomainNotAddedProjectsV4Request.class,
                    ListDomainNotAddedProjectsV4Response.class)
                .withName("ListDomainNotAddedProjectsV4")
                .withUri("/v4/projects/domain/not-added")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDomainNotAddedProjectsV4Request::getOffset,
                ListDomainNotAddedProjectsV4Request::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDomainNotAddedProjectsV4Request::getLimit,
                ListDomainNotAddedProjectsV4Request::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListProjectBugStaticsV4Request, ListProjectBugStaticsV4Response> listProjectBugStaticsV4 =
        genForListProjectBugStaticsV4();

    private static HttpRequestDef<ListProjectBugStaticsV4Request, ListProjectBugStaticsV4Response> genForListProjectBugStaticsV4() {
        // basic
        HttpRequestDef.Builder<ListProjectBugStaticsV4Request, ListProjectBugStaticsV4Response> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListProjectBugStaticsV4Request.class, ListProjectBugStaticsV4Response.class)
            .withName("ListProjectBugStaticsV4")
            .withUri("/v4/projects/{project_id}/bug-statistic")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProjectBugStaticsV4Request::getProjectId,
                ListProjectBugStaticsV4Request::setProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListProjectDemandStaticV4Request, ListProjectDemandStaticV4Response> listProjectDemandStaticV4 =
        genForListProjectDemandStaticV4();

    private static HttpRequestDef<ListProjectDemandStaticV4Request, ListProjectDemandStaticV4Response> genForListProjectDemandStaticV4() {
        // basic
        HttpRequestDef.Builder<ListProjectDemandStaticV4Request, ListProjectDemandStaticV4Response> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListProjectDemandStaticV4Request.class,
                    ListProjectDemandStaticV4Response.class)
                .withName("ListProjectDemandStaticV4")
                .withUri("/v4/projects/{project_id}/demand-statistic")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProjectDemandStaticV4Request::getProjectId,
                ListProjectDemandStaticV4Request::setProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListProjectMembersV4Request, ListProjectMembersV4Response> listProjectMembersV4 =
        genForListProjectMembersV4();

    private static HttpRequestDef<ListProjectMembersV4Request, ListProjectMembersV4Response> genForListProjectMembersV4() {
        // basic
        HttpRequestDef.Builder<ListProjectMembersV4Request, ListProjectMembersV4Response> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListProjectMembersV4Request.class, ListProjectMembersV4Response.class)
            .withName("ListProjectMembersV4")
            .withUri("/v4/projects/{project_id}/members")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProjectMembersV4Request::getProjectId,
                ListProjectMembersV4Request::setProjectId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListProjectMembersV4Request::getOffset, ListProjectMembersV4Request::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListProjectMembersV4Request::getLimit, ListProjectMembersV4Request::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListProjectsV4Request, ListProjectsV4Response> listProjectsV4 =
        genForListProjectsV4();

    private static HttpRequestDef<ListProjectsV4Request, ListProjectsV4Response> genForListProjectsV4() {
        // basic
        HttpRequestDef.Builder<ListProjectsV4Request, ListProjectsV4Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListProjectsV4Request.class, ListProjectsV4Response.class)
                .withName("ListProjectsV4")
                .withUri("/v4/projects")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListProjectsV4Request::getOffset, ListProjectsV4Request::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListProjectsV4Request::getLimit, ListProjectsV4Request::setLimit));
        builder.<String>withRequestField("search",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProjectsV4Request::getSearch, ListProjectsV4Request::setSearch));
        builder.<String>withRequestField("project_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProjectsV4Request::getProjectType, ListProjectsV4Request::setProjectType));
        builder.<String>withRequestField("sort",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProjectsV4Request::getSort, ListProjectsV4Request::setSort));
        builder.<String>withRequestField("archive",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProjectsV4Request::getArchive, ListProjectsV4Request::setArchive));
        builder.<String>withRequestField("query_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProjectsV4Request::getQueryType, ListProjectsV4Request::setQueryType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTemplatesRequest, ListTemplatesResponse> listTemplates =
        genForListTemplates();

    private static HttpRequestDef<ListTemplatesRequest, ListTemplatesResponse> genForListTemplates() {
        // basic
        HttpRequestDef.Builder<ListTemplatesRequest, ListTemplatesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListTemplatesRequest.class, ListTemplatesResponse.class)
                .withName("ListTemplates")
                .withUri("/v4/projects/{project_id}/templates")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTemplatesRequest::getProjectId, ListTemplatesRequest::setProjectId));
        builder.<String>withRequestField("tracker_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTemplatesRequest::getTrackerId, ListTemplatesRequest::setTrackerId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListWorkitemStatusRecordsV4Request, ListWorkitemStatusRecordsV4Response> listWorkitemStatusRecordsV4 =
        genForListWorkitemStatusRecordsV4();

    private static HttpRequestDef<ListWorkitemStatusRecordsV4Request, ListWorkitemStatusRecordsV4Response> genForListWorkitemStatusRecordsV4() {
        // basic
        HttpRequestDef.Builder<ListWorkitemStatusRecordsV4Request, ListWorkitemStatusRecordsV4Response> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListWorkitemStatusRecordsV4Request.class,
                    ListWorkitemStatusRecordsV4Response.class)
                .withName("ListWorkitemStatusRecordsV4")
                .withUri("/v4/projects/{project_id}/work-items/status-records")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWorkitemStatusRecordsV4Request::getProjectId,
                ListWorkitemStatusRecordsV4Request::setProjectId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListWorkitemStatusRecordsV4Request::getOffset,
                ListWorkitemStatusRecordsV4Request::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListWorkitemStatusRecordsV4Request::getLimit,
                ListWorkitemStatusRecordsV4Request::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListWorkitemsRequest, ListWorkitemsResponse> listWorkitems =
        genForListWorkitems();

    private static HttpRequestDef<ListWorkitemsRequest, ListWorkitemsResponse> genForListWorkitems() {
        // basic
        HttpRequestDef.Builder<ListWorkitemsRequest, ListWorkitemsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListWorkitemsRequest.class, ListWorkitemsResponse.class)
                .withName("ListWorkitems")
                .withUri("/v4/projects/{project_id}/work-items")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWorkitemsRequest::getProjectId, ListWorkitemsRequest::setProjectId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListWorkitemsRequest::getOffset, ListWorkitemsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListWorkitemsRequest::getLimit, ListWorkitemsRequest::setLimit));
        builder.<String>withRequestField("created_time_interval",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWorkitemsRequest::getCreatedTimeInterval,
                ListWorkitemsRequest::setCreatedTimeInterval));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RemoveProjectRequest, RemoveProjectResponse> removeProject =
        genForRemoveProject();

    private static HttpRequestDef<RemoveProjectRequest, RemoveProjectResponse> genForRemoveProject() {
        // basic
        HttpRequestDef.Builder<RemoveProjectRequest, RemoveProjectResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, RemoveProjectRequest.class, RemoveProjectResponse.class)
                .withName("RemoveProject")
                .withUri("/v4/projects/{project_id}/quit")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RemoveProjectRequest::getProjectId, RemoveProjectRequest::setProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowBugDensityV2Request, ShowBugDensityV2Response> showBugDensityV2 =
        genForShowBugDensityV2();

    private static HttpRequestDef<ShowBugDensityV2Request, ShowBugDensityV2Response> genForShowBugDensityV2() {
        // basic
        HttpRequestDef.Builder<ShowBugDensityV2Request, ShowBugDensityV2Response> builder =
            HttpRequestDef.builder(HttpMethod.POST, ShowBugDensityV2Request.class, ShowBugDensityV2Response.class)
                .withName("ShowBugDensityV2")
                .withUri("/v2/{project_id}/bug-density/query")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowBugDensityV2Request::getProjectId, ShowBugDensityV2Request::setProjectId));
        builder.<MetricRequestV2>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(MetricRequestV2.class),
            f -> f.withMarshaller(ShowBugDensityV2Request::getBody, ShowBugDensityV2Request::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowBugsPerDeveloperRequest, ShowBugsPerDeveloperResponse> showBugsPerDeveloper =
        genForShowBugsPerDeveloper();

    private static HttpRequestDef<ShowBugsPerDeveloperRequest, ShowBugsPerDeveloperResponse> genForShowBugsPerDeveloper() {
        // basic
        HttpRequestDef.Builder<ShowBugsPerDeveloperRequest, ShowBugsPerDeveloperResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ShowBugsPerDeveloperRequest.class, ShowBugsPerDeveloperResponse.class)
            .withName("ShowBugsPerDeveloper")
            .withUri("/v1/{project_id}/bugs-per-developer/query")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowBugsPerDeveloperRequest::getProjectId,
                ShowBugsPerDeveloperRequest::setProjectId));
        builder.<MetricRequest2>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(MetricRequest2.class),
            f -> f.withMarshaller(ShowBugsPerDeveloperRequest::getBody, ShowBugsPerDeveloperRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowCompletionRateRequest, ShowCompletionRateResponse> showCompletionRate =
        genForShowCompletionRate();

    private static HttpRequestDef<ShowCompletionRateRequest, ShowCompletionRateResponse> genForShowCompletionRate() {
        // basic
        HttpRequestDef.Builder<ShowCompletionRateRequest, ShowCompletionRateResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ShowCompletionRateRequest.class, ShowCompletionRateResponse.class)
                .withName("ShowCompletionRate")
                .withUri("/v1/{project_id}/completion-rate/query")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCompletionRateRequest::getProjectId, ShowCompletionRateRequest::setProjectId));
        builder.<MetricRequest3>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(MetricRequest3.class),
            f -> f.withMarshaller(ShowCompletionRateRequest::getBody, ShowCompletionRateRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowCurUserInfoRequest, ShowCurUserInfoResponse> showCurUserInfo =
        genForShowCurUserInfo();

    private static HttpRequestDef<ShowCurUserInfoRequest, ShowCurUserInfoResponse> genForShowCurUserInfo() {
        // basic
        HttpRequestDef.Builder<ShowCurUserInfoRequest, ShowCurUserInfoResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowCurUserInfoRequest.class, ShowCurUserInfoResponse.class)
                .withName("ShowCurUserInfo")
                .withUri("/v4/user")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowCurUserRoleRequest, ShowCurUserRoleResponse> showCurUserRole =
        genForShowCurUserRole();

    private static HttpRequestDef<ShowCurUserRoleRequest, ShowCurUserRoleResponse> genForShowCurUserRole() {
        // basic
        HttpRequestDef.Builder<ShowCurUserRoleRequest, ShowCurUserRoleResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowCurUserRoleRequest.class, ShowCurUserRoleResponse.class)
                .withName("ShowCurUserRole")
                .withUri("/v4/projects/{project_id}/user-role")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCurUserRoleRequest::getProjectId, ShowCurUserRoleRequest::setProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowProjectInfoV4Request, ShowProjectInfoV4Response> showProjectInfoV4 =
        genForShowProjectInfoV4();

    private static HttpRequestDef<ShowProjectInfoV4Request, ShowProjectInfoV4Response> genForShowProjectInfoV4() {
        // basic
        HttpRequestDef.Builder<ShowProjectInfoV4Request, ShowProjectInfoV4Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowProjectInfoV4Request.class, ShowProjectInfoV4Response.class)
                .withName("ShowProjectInfoV4")
                .withUri("/v4/projects/{project_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowProjectInfoV4Request::getProjectId, ShowProjectInfoV4Request::setProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowProjectSummaryV4Request, ShowProjectSummaryV4Response> showProjectSummaryV4 =
        genForShowProjectSummaryV4();

    private static HttpRequestDef<ShowProjectSummaryV4Request, ShowProjectSummaryV4Response> genForShowProjectSummaryV4() {
        // basic
        HttpRequestDef.Builder<ShowProjectSummaryV4Request, ShowProjectSummaryV4Response> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowProjectSummaryV4Request.class, ShowProjectSummaryV4Response.class)
            .withName("ShowProjectSummaryV4")
            .withUri("/v4/projects/{project_id}/summary")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowProjectSummaryV4Request::getProjectId,
                ShowProjectSummaryV4Request::setProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowWorkItemWrokflowConfigRequest, ShowWorkItemWrokflowConfigResponse> showWorkItemWrokflowConfig =
        genForShowWorkItemWrokflowConfig();

    private static HttpRequestDef<ShowWorkItemWrokflowConfigRequest, ShowWorkItemWrokflowConfigResponse> genForShowWorkItemWrokflowConfig() {
        // basic
        HttpRequestDef.Builder<ShowWorkItemWrokflowConfigRequest, ShowWorkItemWrokflowConfigResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowWorkItemWrokflowConfigRequest.class,
                    ShowWorkItemWrokflowConfigResponse.class)
                .withName("ShowWorkItemWrokflowConfig")
                .withUri("/v4/projects/{project_id}/work-items/workflow/config")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowWorkItemWrokflowConfigRequest::getProjectId,
                ShowWorkItemWrokflowConfigRequest::setProjectId));
        builder.<String>withRequestField("board_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowWorkItemWrokflowConfigRequest::getBoardId,
                ShowWorkItemWrokflowConfigRequest::setBoardId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateMembesRoleV4Request, UpdateMembesRoleV4Response> updateMembesRoleV4 =
        genForUpdateMembesRoleV4();

    private static HttpRequestDef<UpdateMembesRoleV4Request, UpdateMembesRoleV4Response> genForUpdateMembesRoleV4() {
        // basic
        HttpRequestDef.Builder<UpdateMembesRoleV4Request, UpdateMembesRoleV4Response> builder =
            HttpRequestDef.builder(HttpMethod.POST, UpdateMembesRoleV4Request.class, UpdateMembesRoleV4Response.class)
                .withName("UpdateMembesRoleV4")
                .withUri("/v4/projects/{project_id}/members/role")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateMembesRoleV4Request::getProjectId, UpdateMembesRoleV4Request::setProjectId));
        builder.<UpdateMembesRoleV4RequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateMembesRoleV4RequestBody.class),
            f -> f.withMarshaller(UpdateMembesRoleV4Request::getBody, UpdateMembesRoleV4Request::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateNickNameV4Request, UpdateNickNameV4Response> updateNickNameV4 =
        genForUpdateNickNameV4();

    private static HttpRequestDef<UpdateNickNameV4Request, UpdateNickNameV4Response> genForUpdateNickNameV4() {
        // basic
        HttpRequestDef.Builder<UpdateNickNameV4Request, UpdateNickNameV4Response> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateNickNameV4Request.class, UpdateNickNameV4Response.class)
                .withName("UpdateNickNameV4")
                .withUri("/v4/user")
                .withContentType("application/json");

        // requests
        builder.<UpdateUserNickNameRequestV4>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateUserNickNameRequestV4.class),
            f -> f.withMarshaller(UpdateNickNameV4Request::getBody, UpdateNickNameV4Request::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateProjectV4Request, UpdateProjectV4Response> updateProjectV4 =
        genForUpdateProjectV4();

    private static HttpRequestDef<UpdateProjectV4Request, UpdateProjectV4Response> genForUpdateProjectV4() {
        // basic
        HttpRequestDef.Builder<UpdateProjectV4Request, UpdateProjectV4Response> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateProjectV4Request.class, UpdateProjectV4Response.class)
                .withName("UpdateProjectV4")
                .withUri("/v4/projects/{project_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateProjectV4Request::getProjectId, UpdateProjectV4Request::setProjectId));
        builder.<UpdateProjectRequestV4>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateProjectRequestV4.class),
            f -> f.withMarshaller(UpdateProjectV4Request::getBody, UpdateProjectV4Request::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddIssueWorkHoursRequest, AddIssueWorkHoursResponse> addIssueWorkHours =
        genForAddIssueWorkHours();

    private static HttpRequestDef<AddIssueWorkHoursRequest, AddIssueWorkHoursResponse> genForAddIssueWorkHours() {
        // basic
        HttpRequestDef.Builder<AddIssueWorkHoursRequest, AddIssueWorkHoursResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AddIssueWorkHoursRequest.class, AddIssueWorkHoursResponse.class)
                .withName("AddIssueWorkHours")
                .withUri("/v4/projects/{project_id}/issues/{issue_id}/work-hours")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddIssueWorkHoursRequest::getProjectId, AddIssueWorkHoursRequest::setProjectId));
        builder.<Integer>withRequestField("issue_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(AddIssueWorkHoursRequest::getIssueId, AddIssueWorkHoursRequest::setIssueId));
        builder.<AddIssueWorkHoursRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AddIssueWorkHoursRequestBody.class),
            f -> f.withMarshaller(AddIssueWorkHoursRequest::getBody, AddIssueWorkHoursRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteIssuesV4Request, BatchDeleteIssuesV4Response> batchDeleteIssuesV4 =
        genForBatchDeleteIssuesV4();

    private static HttpRequestDef<BatchDeleteIssuesV4Request, BatchDeleteIssuesV4Response> genForBatchDeleteIssuesV4() {
        // basic
        HttpRequestDef.Builder<BatchDeleteIssuesV4Request, BatchDeleteIssuesV4Response> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, BatchDeleteIssuesV4Request.class, BatchDeleteIssuesV4Response.class)
            .withName("BatchDeleteIssuesV4")
            .withUri("/v4/projects/{project_id}/issues")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeleteIssuesV4Request::getProjectId, BatchDeleteIssuesV4Request::setProjectId));
        builder.<BatchDelelteIssuesRequestV4>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchDelelteIssuesRequestV4.class),
            f -> f.withMarshaller(BatchDeleteIssuesV4Request::getBody, BatchDeleteIssuesV4Request::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteIterationsV4Request, BatchDeleteIterationsV4Response> batchDeleteIterationsV4 =
        genForBatchDeleteIterationsV4();

    private static HttpRequestDef<BatchDeleteIterationsV4Request, BatchDeleteIterationsV4Response> genForBatchDeleteIterationsV4() {
        // basic
        HttpRequestDef.Builder<BatchDeleteIterationsV4Request, BatchDeleteIterationsV4Response> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, BatchDeleteIterationsV4Request.class, BatchDeleteIterationsV4Response.class)
            .withName("BatchDeleteIterationsV4")
            .withUri("/v4/projects/{project_id}/iterations")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeleteIterationsV4Request::getProjectId,
                BatchDeleteIterationsV4Request::setProjectId));
        builder.<BatchDeleteIterationsV4RequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchDeleteIterationsV4RequestBody.class),
            f -> f.withMarshaller(BatchDeleteIterationsV4Request::getBody, BatchDeleteIterationsV4Request::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CancelProjectDomainRequest, CancelProjectDomainResponse> cancelProjectDomain =
        genForCancelProjectDomain();

    private static HttpRequestDef<CancelProjectDomainRequest, CancelProjectDomainResponse> genForCancelProjectDomain() {
        // basic
        HttpRequestDef.Builder<CancelProjectDomainRequest, CancelProjectDomainResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, CancelProjectDomainRequest.class, CancelProjectDomainResponse.class)
            .withName("CancelProjectDomain")
            .withUri("/v4/projects/{project_id}/domains/{domain_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CancelProjectDomainRequest::getProjectId, CancelProjectDomainRequest::setProjectId));
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CancelProjectDomainRequest::getDomainId, CancelProjectDomainRequest::setDomainId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateCustomfieldsRequest, CreateCustomfieldsResponse> createCustomfields =
        genForCreateCustomfields();

    private static HttpRequestDef<CreateCustomfieldsRequest, CreateCustomfieldsResponse> genForCreateCustomfields() {
        // basic
        HttpRequestDef.Builder<CreateCustomfieldsRequest, CreateCustomfieldsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateCustomfieldsRequest.class, CreateCustomfieldsResponse.class)
                .withName("CreateCustomfields")
                .withUri("/v3/{project_id}/custom-fields")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateCustomfieldsRequest::getProjectId, CreateCustomfieldsRequest::setProjectId));
        builder.<CreateCustomfieldV1Req>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateCustomfieldV1Req.class),
            f -> f.withMarshaller(CreateCustomfieldsRequest::getBody, CreateCustomfieldsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateIssueV4Request, CreateIssueV4Response> createIssueV4 =
        genForCreateIssueV4();

    private static HttpRequestDef<CreateIssueV4Request, CreateIssueV4Response> genForCreateIssueV4() {
        // basic
        HttpRequestDef.Builder<CreateIssueV4Request, CreateIssueV4Response> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateIssueV4Request.class, CreateIssueV4Response.class)
                .withName("CreateIssueV4")
                .withUri("/v4/projects/{project_id}/issue")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateIssueV4Request::getProjectId, CreateIssueV4Request::setProjectId));
        builder.<CreateIssueRequestV4>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateIssueRequestV4.class),
            f -> f.withMarshaller(CreateIssueV4Request::getBody, CreateIssueV4Request::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateIterationV4Request, CreateIterationV4Response> createIterationV4 =
        genForCreateIterationV4();

    private static HttpRequestDef<CreateIterationV4Request, CreateIterationV4Response> genForCreateIterationV4() {
        // basic
        HttpRequestDef.Builder<CreateIterationV4Request, CreateIterationV4Response> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateIterationV4Request.class, CreateIterationV4Response.class)
                .withName("CreateIterationV4")
                .withUri("/v4/projects/{project_id}/iteration")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateIterationV4Request::getProjectId, CreateIterationV4Request::setProjectId));
        builder.<CreateIterationRequestV4>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateIterationRequestV4.class),
            f -> f.withMarshaller(CreateIterationV4Request::getBody, CreateIterationV4Request::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateProjectDomainRequest, CreateProjectDomainResponse> createProjectDomain =
        genForCreateProjectDomain();

    private static HttpRequestDef<CreateProjectDomainRequest, CreateProjectDomainResponse> genForCreateProjectDomain() {
        // basic
        HttpRequestDef.Builder<CreateProjectDomainRequest, CreateProjectDomainResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateProjectDomainRequest.class, CreateProjectDomainResponse.class)
                .withName("CreateProjectDomain")
                .withUri("/v4/projects/{project_id}/domain")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateProjectDomainRequest::getProjectId, CreateProjectDomainRequest::setProjectId));
        builder.<CreateProjectDomainRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateProjectDomainRequestBody.class),
            f -> f.withMarshaller(CreateProjectDomainRequest::getBody, CreateProjectDomainRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateProjectModuleRequest, CreateProjectModuleResponse> createProjectModule =
        genForCreateProjectModule();

    private static HttpRequestDef<CreateProjectModuleRequest, CreateProjectModuleResponse> genForCreateProjectModule() {
        // basic
        HttpRequestDef.Builder<CreateProjectModuleRequest, CreateProjectModuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateProjectModuleRequest.class, CreateProjectModuleResponse.class)
                .withName("CreateProjectModule")
                .withUri("/v4/projects/{project_id}/module")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateProjectModuleRequest::getProjectId, CreateProjectModuleRequest::setProjectId));
        builder.<CreateProjectModuleRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateProjectModuleRequestBody.class),
            f -> f.withMarshaller(CreateProjectModuleRequest::getBody, CreateProjectModuleRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateSystemIssueV4Request, CreateSystemIssueV4Response> createSystemIssueV4 =
        genForCreateSystemIssueV4();

    private static HttpRequestDef<CreateSystemIssueV4Request, CreateSystemIssueV4Response> genForCreateSystemIssueV4() {
        // basic
        HttpRequestDef.Builder<CreateSystemIssueV4Request, CreateSystemIssueV4Response> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateSystemIssueV4Request.class, CreateSystemIssueV4Response.class)
                .withName("CreateSystemIssueV4")
                .withUri("/v4/projects/{project_id}/system/issue")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateSystemIssueV4Request::getProjectId, CreateSystemIssueV4Request::setProjectId));
        builder.<CreateSystemIssueRequestV4>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateSystemIssueRequestV4.class),
            f -> f.withMarshaller(CreateSystemIssueV4Request::getBody, CreateSystemIssueV4Request::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteAttachmentRequest, DeleteAttachmentResponse> deleteAttachment =
        genForDeleteAttachment();

    private static HttpRequestDef<DeleteAttachmentRequest, DeleteAttachmentResponse> genForDeleteAttachment() {
        // basic
        HttpRequestDef.Builder<DeleteAttachmentRequest, DeleteAttachmentResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteAttachmentRequest.class, DeleteAttachmentResponse.class)
                .withName("DeleteAttachment")
                .withUri("/v4/projects/{project_id}/issues/{issue_id}/attachments/{attachment_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAttachmentRequest::getProjectId, DeleteAttachmentRequest::setProjectId));
        builder.<String>withRequestField("issue_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAttachmentRequest::getIssueId, DeleteAttachmentRequest::setIssueId));
        builder.<String>withRequestField("attachment_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAttachmentRequest::getAttachmentId, DeleteAttachmentRequest::setAttachmentId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteIssueV4Request, DeleteIssueV4Response> deleteIssueV4 =
        genForDeleteIssueV4();

    private static HttpRequestDef<DeleteIssueV4Request, DeleteIssueV4Response> genForDeleteIssueV4() {
        // basic
        HttpRequestDef.Builder<DeleteIssueV4Request, DeleteIssueV4Response> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteIssueV4Request.class, DeleteIssueV4Response.class)
                .withName("DeleteIssueV4")
                .withUri("/v4/projects/{project_id}/issues/{issue_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteIssueV4Request::getProjectId, DeleteIssueV4Request::setProjectId));
        builder.<Integer>withRequestField("issue_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(DeleteIssueV4Request::getIssueId, DeleteIssueV4Request::setIssueId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteIterationV4Request, DeleteIterationV4Response> deleteIterationV4 =
        genForDeleteIterationV4();

    private static HttpRequestDef<DeleteIterationV4Request, DeleteIterationV4Response> genForDeleteIterationV4() {
        // basic
        HttpRequestDef.Builder<DeleteIterationV4Request, DeleteIterationV4Response> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteIterationV4Request.class, DeleteIterationV4Response.class)
                .withName("DeleteIterationV4")
                .withUri("/v4/projects/{project_id}/iterations/{iteration_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteIterationV4Request::getProjectId, DeleteIterationV4Request::setProjectId));
        builder.<Integer>withRequestField("iteration_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(DeleteIterationV4Request::getIterationId, DeleteIterationV4Request::setIterationId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteProjectModuleRequest, DeleteProjectModuleResponse> deleteProjectModule =
        genForDeleteProjectModule();

    private static HttpRequestDef<DeleteProjectModuleRequest, DeleteProjectModuleResponse> genForDeleteProjectModule() {
        // basic
        HttpRequestDef.Builder<DeleteProjectModuleRequest, DeleteProjectModuleResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteProjectModuleRequest.class, DeleteProjectModuleResponse.class)
            .withName("DeleteProjectModule")
            .withUri("/v4/projects/{project_id}/modules/{module_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteProjectModuleRequest::getProjectId, DeleteProjectModuleRequest::setProjectId));
        builder.<Integer>withRequestField("module_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(DeleteProjectModuleRequest::getModuleId, DeleteProjectModuleRequest::setModuleId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DownloadAttachmentRequest, DownloadAttachmentResponse> downloadAttachment =
        genForDownloadAttachment();

    private static HttpRequestDef<DownloadAttachmentRequest, DownloadAttachmentResponse> genForDownloadAttachment() {
        // basic
        HttpRequestDef.Builder<DownloadAttachmentRequest, DownloadAttachmentResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, DownloadAttachmentRequest.class, DownloadAttachmentResponse.class)
                .withName("DownloadAttachment")
                .withUri("/v4/projects/{project_id}/issues/{issue_id}/attachments/{attachment_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DownloadAttachmentRequest::getProjectId, DownloadAttachmentRequest::setProjectId));
        builder.<String>withRequestField("issue_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DownloadAttachmentRequest::getIssueId, DownloadAttachmentRequest::setIssueId));
        builder.<String>withRequestField("attachment_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DownloadAttachmentRequest::getAttachmentId,
                DownloadAttachmentRequest::setAttachmentId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DownloadImageFileRequest, DownloadImageFileResponse> downloadImageFile =
        genForDownloadImageFile();

    private static HttpRequestDef<DownloadImageFileRequest, DownloadImageFileResponse> genForDownloadImageFile() {
        // basic
        HttpRequestDef.Builder<DownloadImageFileRequest, DownloadImageFileResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, DownloadImageFileRequest.class, DownloadImageFileResponse.class)
                .withName("DownloadImageFile")
                .withUri("/v4/projects/{project_id}/image-file")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DownloadImageFileRequest::getProjectId, DownloadImageFileRequest::setProjectId));
        builder.<String>withRequestField("image_uri",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DownloadImageFileRequest::getImageUri, DownloadImageFileRequest::setImageUri));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAssociatedIssuesRequest, ListAssociatedIssuesResponse> listAssociatedIssues =
        genForListAssociatedIssues();

    private static HttpRequestDef<ListAssociatedIssuesRequest, ListAssociatedIssuesResponse> genForListAssociatedIssues() {
        // basic
        HttpRequestDef.Builder<ListAssociatedIssuesRequest, ListAssociatedIssuesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListAssociatedIssuesRequest.class, ListAssociatedIssuesResponse.class)
            .withName("ListAssociatedIssues")
            .withUri("/v4/projects/{project_id}/issues/{issue_id}/associated-issues")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAssociatedIssuesRequest::getProjectId,
                ListAssociatedIssuesRequest::setProjectId));
        builder.<Integer>withRequestField("issue_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAssociatedIssuesRequest::getIssueId, ListAssociatedIssuesRequest::setIssueId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAssociatedIssuesRequest::getLimit, ListAssociatedIssuesRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAssociatedIssuesRequest::getOffset, ListAssociatedIssuesRequest::setOffset));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAssociatedTestCasesRequest, ListAssociatedTestCasesResponse> listAssociatedTestCases =
        genForListAssociatedTestCases();

    private static HttpRequestDef<ListAssociatedTestCasesRequest, ListAssociatedTestCasesResponse> genForListAssociatedTestCases() {
        // basic
        HttpRequestDef.Builder<ListAssociatedTestCasesRequest, ListAssociatedTestCasesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListAssociatedTestCasesRequest.class, ListAssociatedTestCasesResponse.class)
            .withName("ListAssociatedTestCases")
            .withUri("/v4/projects/{project_id}/issues/{issue_id}/associate-test-cases")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAssociatedTestCasesRequest::getProjectId,
                ListAssociatedTestCasesRequest::setProjectId));
        builder.<Integer>withRequestField("issue_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAssociatedTestCasesRequest::getIssueId,
                ListAssociatedTestCasesRequest::setIssueId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAssociatedTestCasesRequest::getLimit, ListAssociatedTestCasesRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAssociatedTestCasesRequest::getOffset,
                ListAssociatedTestCasesRequest::setOffset));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAssociatedWikisRequest, ListAssociatedWikisResponse> listAssociatedWikis =
        genForListAssociatedWikis();

    private static HttpRequestDef<ListAssociatedWikisRequest, ListAssociatedWikisResponse> genForListAssociatedWikis() {
        // basic
        HttpRequestDef.Builder<ListAssociatedWikisRequest, ListAssociatedWikisResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAssociatedWikisRequest.class, ListAssociatedWikisResponse.class)
                .withName("ListAssociatedWikis")
                .withUri("/v4/projects/{project_id}/issues/{issue_id}/associated-wikis")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAssociatedWikisRequest::getProjectId, ListAssociatedWikisRequest::setProjectId));
        builder.<Integer>withRequestField("issue_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAssociatedWikisRequest::getIssueId, ListAssociatedWikisRequest::setIssueId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAssociatedWikisRequest::getLimit, ListAssociatedWikisRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAssociatedWikisRequest::getOffset, ListAssociatedWikisRequest::setOffset));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListChildIssuesV4Request, ListChildIssuesV4Response> listChildIssuesV4 =
        genForListChildIssuesV4();

    private static HttpRequestDef<ListChildIssuesV4Request, ListChildIssuesV4Response> genForListChildIssuesV4() {
        // basic
        HttpRequestDef.Builder<ListChildIssuesV4Request, ListChildIssuesV4Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListChildIssuesV4Request.class, ListChildIssuesV4Response.class)
                .withName("ListChildIssuesV4")
                .withUri("/v4/projects/{project_id}/issues/{issue_id}/child")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListChildIssuesV4Request::getProjectId, ListChildIssuesV4Request::setProjectId));
        builder.<Integer>withRequestField("issue_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListChildIssuesV4Request::getIssueId, ListChildIssuesV4Request::setIssueId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListIssueAssociatedCommitsRequest, ListIssueAssociatedCommitsResponse> listIssueAssociatedCommits =
        genForListIssueAssociatedCommits();

    private static HttpRequestDef<ListIssueAssociatedCommitsRequest, ListIssueAssociatedCommitsResponse> genForListIssueAssociatedCommits() {
        // basic
        HttpRequestDef.Builder<ListIssueAssociatedCommitsRequest, ListIssueAssociatedCommitsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListIssueAssociatedCommitsRequest.class,
                    ListIssueAssociatedCommitsResponse.class)
                .withName("ListIssueAssociatedCommits")
                .withUri("/v4/projects/{project_id}/issues/{issue_id}/associated-commits")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListIssueAssociatedCommitsRequest::getProjectId,
                ListIssueAssociatedCommitsRequest::setProjectId));
        builder.<Integer>withRequestField("issue_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListIssueAssociatedCommitsRequest::getIssueId,
                ListIssueAssociatedCommitsRequest::setIssueId));
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListIssueAssociatedCommitsRequest::getType,
                ListIssueAssociatedCommitsRequest::setType));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListIssueAssociatedCommitsRequest::getLimit,
                ListIssueAssociatedCommitsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListIssueAssociatedCommitsRequest::getOffset,
                ListIssueAssociatedCommitsRequest::setOffset));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListIssueCommentsV4Request, ListIssueCommentsV4Response> listIssueCommentsV4 =
        genForListIssueCommentsV4();

    private static HttpRequestDef<ListIssueCommentsV4Request, ListIssueCommentsV4Response> genForListIssueCommentsV4() {
        // basic
        HttpRequestDef.Builder<ListIssueCommentsV4Request, ListIssueCommentsV4Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListIssueCommentsV4Request.class, ListIssueCommentsV4Response.class)
                .withName("ListIssueCommentsV4")
                .withUri("/v4/projects/{project_id}/issues/{issue_id}/comments")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListIssueCommentsV4Request::getProjectId, ListIssueCommentsV4Request::setProjectId));
        builder.<Integer>withRequestField("issue_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListIssueCommentsV4Request::getIssueId, ListIssueCommentsV4Request::setIssueId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListIssueCommentsV4Request::getOffset, ListIssueCommentsV4Request::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListIssueCommentsV4Request::getLimit, ListIssueCommentsV4Request::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListIssueCustomFieldsRequest, ListIssueCustomFieldsResponse> listIssueCustomFields =
        genForListIssueCustomFields();

    private static HttpRequestDef<ListIssueCustomFieldsRequest, ListIssueCustomFieldsResponse> genForListIssueCustomFields() {
        // basic
        HttpRequestDef.Builder<ListIssueCustomFieldsRequest, ListIssueCustomFieldsResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ListIssueCustomFieldsRequest.class, ListIssueCustomFieldsResponse.class)
            .withName("ListIssueCustomFields")
            .withUri("/v4/projects/{project_id}/issues/custom-fields")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListIssueCustomFieldsRequest::getProjectId,
                ListIssueCustomFieldsRequest::setProjectId));
        builder.<ListIssueCustomFieldsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListIssueCustomFieldsRequestBody.class),
            f -> f.withMarshaller(ListIssueCustomFieldsRequest::getBody, ListIssueCustomFieldsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListIssueRecordsV4Request, ListIssueRecordsV4Response> listIssueRecordsV4 =
        genForListIssueRecordsV4();

    private static HttpRequestDef<ListIssueRecordsV4Request, ListIssueRecordsV4Response> genForListIssueRecordsV4() {
        // basic
        HttpRequestDef.Builder<ListIssueRecordsV4Request, ListIssueRecordsV4Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListIssueRecordsV4Request.class, ListIssueRecordsV4Response.class)
                .withName("ListIssueRecordsV4")
                .withUri("/v4/projects/{project_id}/issue/{issue_id}/records")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListIssueRecordsV4Request::getProjectId, ListIssueRecordsV4Request::setProjectId));
        builder.<Integer>withRequestField("issue_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListIssueRecordsV4Request::getIssueId, ListIssueRecordsV4Request::setIssueId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListIssueRecordsV4Request::getOffset, ListIssueRecordsV4Request::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListIssueRecordsV4Request::getLimit, ListIssueRecordsV4Request::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListIssuesSfV4Request, ListIssuesSfV4Response> listIssuesSfV4 =
        genForListIssuesSfV4();

    private static HttpRequestDef<ListIssuesSfV4Request, ListIssuesSfV4Response> genForListIssuesSfV4() {
        // basic
        HttpRequestDef.Builder<ListIssuesSfV4Request, ListIssuesSfV4Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListIssuesSfV4Request.class, ListIssuesSfV4Response.class)
                .withName("ListIssuesSfV4")
                .withUri("/v4/projects/{project_id}/issues")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListIssuesSfV4Request::getProjectId, ListIssuesSfV4Request::setProjectId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListIssuesSfV4Request::getOffset, ListIssuesSfV4Request::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListIssuesSfV4Request::getLimit, ListIssuesSfV4Request::setLimit));
        builder.<ListIssuesSfV4Request.TrackerIdEnum>withRequestField("tracker_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListIssuesSfV4Request.TrackerIdEnum.class),
            f -> f.withMarshaller(ListIssuesSfV4Request::getTrackerId, ListIssuesSfV4Request::setTrackerId));
        builder.<String>withRequestField("created_time_interval",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListIssuesSfV4Request::getCreatedTimeInterval,
                ListIssuesSfV4Request::setCreatedTimeInterval));
        builder.<String>withRequestField("updated_time_interval",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListIssuesSfV4Request::getUpdatedTimeInterval,
                ListIssuesSfV4Request::setUpdatedTimeInterval));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListIssuesV4Request, ListIssuesV4Response> listIssuesV4 = genForListIssuesV4();

    private static HttpRequestDef<ListIssuesV4Request, ListIssuesV4Response> genForListIssuesV4() {
        // basic
        HttpRequestDef.Builder<ListIssuesV4Request, ListIssuesV4Response> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListIssuesV4Request.class, ListIssuesV4Response.class)
                .withName("ListIssuesV4")
                .withUri("/v4/projects/{project_id}/issues")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListIssuesV4Request::getProjectId, ListIssuesV4Request::setProjectId));
        builder.<ListIssueRequestV4>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListIssueRequestV4.class),
            f -> f.withMarshaller(ListIssuesV4Request::getBody, ListIssuesV4Request::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListIterationHistoriesRequest, ListIterationHistoriesResponse> listIterationHistories =
        genForListIterationHistories();

    private static HttpRequestDef<ListIterationHistoriesRequest, ListIterationHistoriesResponse> genForListIterationHistories() {
        // basic
        HttpRequestDef.Builder<ListIterationHistoriesRequest, ListIterationHistoriesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListIterationHistoriesRequest.class, ListIterationHistoriesResponse.class)
            .withName("ListIterationHistories")
            .withUri("/v4/iterations/{iteration_id}/histories")
            .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("iteration_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListIterationHistoriesRequest::getIterationId,
                ListIterationHistoriesRequest::setIterationId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListIterationHistoriesRequest::getOffset, ListIterationHistoriesRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListIterationHistoriesRequest::getLimit, ListIterationHistoriesRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListProjectDomainsRequest, ListProjectDomainsResponse> listProjectDomains =
        genForListProjectDomains();

    private static HttpRequestDef<ListProjectDomainsRequest, ListProjectDomainsResponse> genForListProjectDomains() {
        // basic
        HttpRequestDef.Builder<ListProjectDomainsRequest, ListProjectDomainsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListProjectDomainsRequest.class, ListProjectDomainsResponse.class)
                .withName("ListProjectDomains")
                .withUri("/v4/projects/{project_id}/domains")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProjectDomainsRequest::getProjectId, ListProjectDomainsRequest::setProjectId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListProjectDomainsRequest::getOffset, ListProjectDomainsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListProjectDomainsRequest::getLimit, ListProjectDomainsRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListProjectIssuesRecordsV4Request, ListProjectIssuesRecordsV4Response> listProjectIssuesRecordsV4 =
        genForListProjectIssuesRecordsV4();

    private static HttpRequestDef<ListProjectIssuesRecordsV4Request, ListProjectIssuesRecordsV4Response> genForListProjectIssuesRecordsV4() {
        // basic
        HttpRequestDef.Builder<ListProjectIssuesRecordsV4Request, ListProjectIssuesRecordsV4Response> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListProjectIssuesRecordsV4Request.class,
                    ListProjectIssuesRecordsV4Response.class)
                .withName("ListProjectIssuesRecordsV4")
                .withUri("/v4/projects/{project_id}/issues/records")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProjectIssuesRecordsV4Request::getProjectId,
                ListProjectIssuesRecordsV4Request::setProjectId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListProjectIssuesRecordsV4Request::getOffset,
                ListProjectIssuesRecordsV4Request::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListProjectIssuesRecordsV4Request::getLimit,
                ListProjectIssuesRecordsV4Request::setLimit));
        builder.<String>withRequestField("operated_time_interval",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProjectIssuesRecordsV4Request::getOperatedTimeInterval,
                ListProjectIssuesRecordsV4Request::setOperatedTimeInterval));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListProjectIterationsV4Request, ListProjectIterationsV4Response> listProjectIterationsV4 =
        genForListProjectIterationsV4();

    private static HttpRequestDef<ListProjectIterationsV4Request, ListProjectIterationsV4Response> genForListProjectIterationsV4() {
        // basic
        HttpRequestDef.Builder<ListProjectIterationsV4Request, ListProjectIterationsV4Response> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListProjectIterationsV4Request.class, ListProjectIterationsV4Response.class)
            .withName("ListProjectIterationsV4")
            .withUri("/v4/projects/{project_id}/iterations")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProjectIterationsV4Request::getProjectId,
                ListProjectIterationsV4Request::setProjectId));
        builder.<String>withRequestField("updated_time_interval",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProjectIterationsV4Request::getUpdatedTimeInterval,
                ListProjectIterationsV4Request::setUpdatedTimeInterval));
        builder.<Boolean>withRequestField("include_deleted",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListProjectIterationsV4Request::getIncludeDeleted,
                ListProjectIterationsV4Request::setIncludeDeleted));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListProjectModulesRequest, ListProjectModulesResponse> listProjectModules =
        genForListProjectModules();

    private static HttpRequestDef<ListProjectModulesRequest, ListProjectModulesResponse> genForListProjectModules() {
        // basic
        HttpRequestDef.Builder<ListProjectModulesRequest, ListProjectModulesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListProjectModulesRequest.class, ListProjectModulesResponse.class)
                .withName("ListProjectModules")
                .withUri("/v4/projects/{project_id}/modules")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProjectModulesRequest::getProjectId, ListProjectModulesRequest::setProjectId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListProjectModulesRequest::getOffset, ListProjectModulesRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListProjectModulesRequest::getLimit, ListProjectModulesRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListProjectWorkHoursRequest, ListProjectWorkHoursResponse> listProjectWorkHours =
        genForListProjectWorkHours();

    private static HttpRequestDef<ListProjectWorkHoursRequest, ListProjectWorkHoursResponse> genForListProjectWorkHours() {
        // basic
        HttpRequestDef.Builder<ListProjectWorkHoursRequest, ListProjectWorkHoursResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ListProjectWorkHoursRequest.class, ListProjectWorkHoursResponse.class)
            .withName("ListProjectWorkHours")
            .withUri("/v4/projects/work-hours")
            .withContentType("application/json");

        // requests
        builder.<ListProjectWorkHoursRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListProjectWorkHoursRequestBody.class),
            f -> f.withMarshaller(ListProjectWorkHoursRequest::getBody, ListProjectWorkHoursRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListProjectWorkHoursTypeRequest, ListProjectWorkHoursTypeResponse> listProjectWorkHoursType =
        genForListProjectWorkHoursType();

    private static HttpRequestDef<ListProjectWorkHoursTypeRequest, ListProjectWorkHoursTypeResponse> genForListProjectWorkHoursType() {
        // basic
        HttpRequestDef.Builder<ListProjectWorkHoursTypeRequest, ListProjectWorkHoursTypeResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ListProjectWorkHoursTypeRequest.class, ListProjectWorkHoursTypeResponse.class)
                .withName("ListProjectWorkHoursType")
                .withUri("/v4/projects/{project_id}/work-hours-type")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProjectWorkHoursTypeRequest::getProjectId,
                ListProjectWorkHoursTypeRequest::setProjectId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListProjectWorkHoursTypeRequest::getLimit,
                ListProjectWorkHoursTypeRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListProjectWorkHoursTypeRequest::getOffset,
                ListProjectWorkHoursTypeRequest::setOffset));
        builder.<Integer>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListProjectWorkHoursTypeRequest::getStatus,
                ListProjectWorkHoursTypeRequest::setStatus));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListScrumProjectStatusesRequest, ListScrumProjectStatusesResponse> listScrumProjectStatuses =
        genForListScrumProjectStatuses();

    private static HttpRequestDef<ListScrumProjectStatusesRequest, ListScrumProjectStatusesResponse> genForListScrumProjectStatuses() {
        // basic
        HttpRequestDef.Builder<ListScrumProjectStatusesRequest, ListScrumProjectStatusesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ListScrumProjectStatusesRequest.class, ListScrumProjectStatusesResponse.class)
                .withName("ListScrumProjectStatuses")
                .withUri("/v4/projects/{project_id}/statuses")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListScrumProjectStatusesRequest::getProjectId,
                ListScrumProjectStatusesRequest::setProjectId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListScrumProjectStatusesRequest::getOffset,
                ListScrumProjectStatusesRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListScrumProjectStatusesRequest::getLimit,
                ListScrumProjectStatusesRequest::setLimit));
        builder.<Integer>withRequestField("tracker_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListScrumProjectStatusesRequest::getTrackerId,
                ListScrumProjectStatusesRequest::setTrackerId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSpecIssueStayTimesRequest, ListSpecIssueStayTimesResponse> listSpecIssueStayTimes =
        genForListSpecIssueStayTimes();

    private static HttpRequestDef<ListSpecIssueStayTimesRequest, ListSpecIssueStayTimesResponse> genForListSpecIssueStayTimes() {
        // basic
        HttpRequestDef.Builder<ListSpecIssueStayTimesRequest, ListSpecIssueStayTimesResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ListSpecIssueStayTimesRequest.class, ListSpecIssueStayTimesResponse.class)
            .withName("ListSpecIssueStayTimes")
            .withUri("/v4/issues/duration")
            .withContentType("application/json");

        // requests
        builder.<ListSpecIssueStayTimesRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListSpecIssueStayTimesRequestBody.class),
            f -> f.withMarshaller(ListSpecIssueStayTimesRequest::getBody, ListSpecIssueStayTimesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListStatusStatisticRequest, ListStatusStatisticResponse> listStatusStatistic =
        genForListStatusStatistic();

    private static HttpRequestDef<ListStatusStatisticRequest, ListStatusStatisticResponse> genForListStatusStatistic() {
        // basic
        HttpRequestDef.Builder<ListStatusStatisticRequest, ListStatusStatisticResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListStatusStatisticRequest.class, ListStatusStatisticResponse.class)
                .withName("ListStatusStatistic")
                .withUri("/v4/projects/{project_id}/status-statistic")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStatusStatisticRequest::getProjectId, ListStatusStatisticRequest::setProjectId));
        builder.<Integer>withRequestField("iteration_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListStatusStatisticRequest::getIterationId,
                ListStatusStatisticRequest::setIterationId));
        builder.<Integer>withRequestField("tracker_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListStatusStatisticRequest::getTrackerId, ListStatusStatisticRequest::setTrackerId));
        builder.<Integer>withRequestField("status_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListStatusStatisticRequest::getStatusId, ListStatusStatisticRequest::setStatusId));

        // response
        builder.<List<UserStatusStatistic>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListStatusStatisticResponse::getBody, ListStatusStatisticResponse::setBody)
                .withInnerContainerType(UserStatusStatistic.class));

        return builder.build();
    }

    public static final HttpRequestDef<SearchIssuesRequest, SearchIssuesResponse> searchIssues = genForSearchIssues();

    private static HttpRequestDef<SearchIssuesRequest, SearchIssuesResponse> genForSearchIssues() {
        // basic
        HttpRequestDef.Builder<SearchIssuesRequest, SearchIssuesResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, SearchIssuesRequest.class, SearchIssuesResponse.class)
                .withName("SearchIssues")
                .withUri("/v4/issues")
                .withContentType("application/json");

        // requests
        builder.<ListWorkTableIssueRequestV4RequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListWorkTableIssueRequestV4RequestBody.class),
            f -> f.withMarshaller(SearchIssuesRequest::getBody, SearchIssuesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowIssueCompletionRateRequest, ShowIssueCompletionRateResponse> showIssueCompletionRate =
        genForShowIssueCompletionRate();

    private static HttpRequestDef<ShowIssueCompletionRateRequest, ShowIssueCompletionRateResponse> genForShowIssueCompletionRate() {
        // basic
        HttpRequestDef.Builder<ShowIssueCompletionRateRequest, ShowIssueCompletionRateResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowIssueCompletionRateRequest.class, ShowIssueCompletionRateResponse.class)
            .withName("ShowIssueCompletionRate")
            .withUri("/v4/projects/{project_id}/issue-completion-rate")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowIssueCompletionRateRequest::getProjectId,
                ShowIssueCompletionRateRequest::setProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowIssueV4Request, ShowIssueV4Response> showIssueV4 = genForShowIssueV4();

    private static HttpRequestDef<ShowIssueV4Request, ShowIssueV4Response> genForShowIssueV4() {
        // basic
        HttpRequestDef.Builder<ShowIssueV4Request, ShowIssueV4Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowIssueV4Request.class, ShowIssueV4Response.class)
                .withName("ShowIssueV4")
                .withUri("/v4/projects/{project_id}/issues/{issue_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowIssueV4Request::getProjectId, ShowIssueV4Request::setProjectId));
        builder.<Integer>withRequestField("issue_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowIssueV4Request::getIssueId, ShowIssueV4Request::setIssueId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowIssuesWrokFlowConfigRequest, ShowIssuesWrokFlowConfigResponse> showIssuesWrokFlowConfig =
        genForShowIssuesWrokFlowConfig();

    private static HttpRequestDef<ShowIssuesWrokFlowConfigRequest, ShowIssuesWrokFlowConfigResponse> genForShowIssuesWrokFlowConfig() {
        // basic
        HttpRequestDef.Builder<ShowIssuesWrokFlowConfigRequest, ShowIssuesWrokFlowConfigResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ShowIssuesWrokFlowConfigRequest.class, ShowIssuesWrokFlowConfigResponse.class)
                .withName("ShowIssuesWrokFlowConfig")
                .withUri("/v4/projects/{project_id}/issues/workflow/config")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowIssuesWrokFlowConfigRequest::getProjectId,
                ShowIssuesWrokFlowConfigRequest::setProjectId));
        builder.<Integer>withRequestField("tracker_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowIssuesWrokFlowConfigRequest::getTrackerId,
                ShowIssuesWrokFlowConfigRequest::setTrackerId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowIterationV4Request, ShowIterationV4Response> showIterationV4 =
        genForShowIterationV4();

    private static HttpRequestDef<ShowIterationV4Request, ShowIterationV4Response> genForShowIterationV4() {
        // basic
        HttpRequestDef.Builder<ShowIterationV4Request, ShowIterationV4Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowIterationV4Request.class, ShowIterationV4Response.class)
                .withName("ShowIterationV4")
                .withUri("/v4/iterations/{iteration_id}")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("iteration_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowIterationV4Request::getIterationId, ShowIterationV4Request::setIterationId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowProjectWorkHoursRequest, ShowProjectWorkHoursResponse> showProjectWorkHours =
        genForShowProjectWorkHours();

    private static HttpRequestDef<ShowProjectWorkHoursRequest, ShowProjectWorkHoursResponse> genForShowProjectWorkHours() {
        // basic
        HttpRequestDef.Builder<ShowProjectWorkHoursRequest, ShowProjectWorkHoursResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ShowProjectWorkHoursRequest.class, ShowProjectWorkHoursResponse.class)
            .withName("ShowProjectWorkHours")
            .withUri("/v4/projects/{project_id}/work-hours")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowProjectWorkHoursRequest::getProjectId,
                ShowProjectWorkHoursRequest::setProjectId));
        builder.<ShowProjectWorkHoursRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ShowProjectWorkHoursRequestBody.class),
            f -> f.withMarshaller(ShowProjectWorkHoursRequest::getBody, ShowProjectWorkHoursRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateIssueV4Request, UpdateIssueV4Response> updateIssueV4 =
        genForUpdateIssueV4();

    private static HttpRequestDef<UpdateIssueV4Request, UpdateIssueV4Response> genForUpdateIssueV4() {
        // basic
        HttpRequestDef.Builder<UpdateIssueV4Request, UpdateIssueV4Response> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateIssueV4Request.class, UpdateIssueV4Response.class)
                .withName("UpdateIssueV4")
                .withUri("/v4/projects/{project_id}/issues/{issue_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateIssueV4Request::getProjectId, UpdateIssueV4Request::setProjectId));
        builder.<Integer>withRequestField("issue_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(UpdateIssueV4Request::getIssueId, UpdateIssueV4Request::setIssueId));
        builder.<IssueRequestV4>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(IssueRequestV4.class),
            f -> f.withMarshaller(UpdateIssueV4Request::getBody, UpdateIssueV4Request::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateIterationV4Request, UpdateIterationV4Response> updateIterationV4 =
        genForUpdateIterationV4();

    private static HttpRequestDef<UpdateIterationV4Request, UpdateIterationV4Response> genForUpdateIterationV4() {
        // basic
        HttpRequestDef.Builder<UpdateIterationV4Request, UpdateIterationV4Response> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateIterationV4Request.class, UpdateIterationV4Response.class)
                .withName("UpdateIterationV4")
                .withUri("/v4/projects/{project_id}/iterations/{iteration_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateIterationV4Request::getProjectId, UpdateIterationV4Request::setProjectId));
        builder.<Integer>withRequestField("iteration_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(UpdateIterationV4Request::getIterationId, UpdateIterationV4Request::setIterationId));
        builder.<UpdateIterationRequestV4>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateIterationRequestV4.class),
            f -> f.withMarshaller(UpdateIterationV4Request::getBody, UpdateIterationV4Request::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateProjectDomainRequest, UpdateProjectDomainResponse> updateProjectDomain =
        genForUpdateProjectDomain();

    private static HttpRequestDef<UpdateProjectDomainRequest, UpdateProjectDomainResponse> genForUpdateProjectDomain() {
        // basic
        HttpRequestDef.Builder<UpdateProjectDomainRequest, UpdateProjectDomainResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateProjectDomainRequest.class, UpdateProjectDomainResponse.class)
                .withName("UpdateProjectDomain")
                .withUri("/v4/projects/{project_id}/domains/{domain_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateProjectDomainRequest::getProjectId, UpdateProjectDomainRequest::setProjectId));
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateProjectDomainRequest::getDomainId, UpdateProjectDomainRequest::setDomainId));
        builder.<CreateProjectDomainRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateProjectDomainRequestBody.class),
            f -> f.withMarshaller(UpdateProjectDomainRequest::getBody, UpdateProjectDomainRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateProjectModuleRequest, UpdateProjectModuleResponse> updateProjectModule =
        genForUpdateProjectModule();

    private static HttpRequestDef<UpdateProjectModuleRequest, UpdateProjectModuleResponse> genForUpdateProjectModule() {
        // basic
        HttpRequestDef.Builder<UpdateProjectModuleRequest, UpdateProjectModuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateProjectModuleRequest.class, UpdateProjectModuleResponse.class)
                .withName("UpdateProjectModule")
                .withUri("/v4/projects/{project_id}/modules/{module_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateProjectModuleRequest::getProjectId, UpdateProjectModuleRequest::setProjectId));
        builder.<Integer>withRequestField("module_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(UpdateProjectModuleRequest::getModuleId, UpdateProjectModuleRequest::setModuleId));
        builder.<UpdateProjectModuleRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateProjectModuleRequestBody.class),
            f -> f.withMarshaller(UpdateProjectModuleRequest::getBody, UpdateProjectModuleRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UploadAttachmentsRequest, UploadAttachmentsResponse> uploadAttachments =
        genForUploadAttachments();

    private static HttpRequestDef<UploadAttachmentsRequest, UploadAttachmentsResponse> genForUploadAttachments() {
        // basic
        HttpRequestDef.Builder<UploadAttachmentsRequest, UploadAttachmentsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UploadAttachmentsRequest.class, UploadAttachmentsResponse.class)
                .withName("UploadAttachments")
                .withUri("/v4/projects/{project_id}/issues/{issue_id}/attachments/upload")
                .withContentType("multipart/form-data");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UploadAttachmentsRequest::getProjectId, UploadAttachmentsRequest::setProjectId));
        builder.<String>withRequestField("issue_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UploadAttachmentsRequest::getIssueId, UploadAttachmentsRequest::setIssueId));
        builder.<UploadAttachmentsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UploadAttachmentsRequestBody.class),
            f -> f.withMarshaller(UploadAttachmentsRequest::getBody, UploadAttachmentsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UploadIssueImgRequest, UploadIssueImgResponse> uploadIssueImg =
        genForUploadIssueImg();

    private static HttpRequestDef<UploadIssueImgRequest, UploadIssueImgResponse> genForUploadIssueImg() {
        // basic
        HttpRequestDef.Builder<UploadIssueImgRequest, UploadIssueImgResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UploadIssueImgRequest.class, UploadIssueImgResponse.class)
                .withName("UploadIssueImg")
                .withUri("/v2/{project_id}/img")
                .withContentType("multipart/form-data");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UploadIssueImgRequest::getProjectId, UploadIssueImgRequest::setProjectId));
        builder.<UploadIssueImgRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UploadIssueImgRequestBody.class),
            f -> f.withMarshaller(UploadIssueImgRequest::getBody, UploadIssueImgRequest::setBody));

        // response

        return builder.build();
    }

}
