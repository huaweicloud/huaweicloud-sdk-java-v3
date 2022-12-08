package com.huaweicloud.sdk.projectman.v4;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.projectman.v4.model.*;

import java.util.List;

@SuppressWarnings("unchecked")
public class ProjectManMeta {

    public static final HttpRequestDef<AddApplyJoinProjectForAgcRequest, AddApplyJoinProjectForAgcResponse> addApplyJoinProjectForAgc =
        genForaddApplyJoinProjectForAgc();

    private static HttpRequestDef<AddApplyJoinProjectForAgcRequest, AddApplyJoinProjectForAgcResponse> genForaddApplyJoinProjectForAgc() {
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
            f -> f.withMarshaller(AddApplyJoinProjectForAgcRequest::getProjectId, (req, v) -> {
                req.setProjectId(v);
            }));
        builder.<String>withRequestField("Domain-Id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddApplyJoinProjectForAgcRequest::getDomainId, (req, v) -> {
                req.setDomainId(v);
            }));
        builder.<String>withRequestField("User-Id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddApplyJoinProjectForAgcRequest::getUserId, (req, v) -> {
                req.setUserId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddMemberV4Request, AddMemberV4Response> addMemberV4 = genForaddMemberV4();

    private static HttpRequestDef<AddMemberV4Request, AddMemberV4Response> genForaddMemberV4() {
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
            f -> f.withMarshaller(AddMemberV4Request::getProjectId, (req, v) -> {
                req.setProjectId(v);
            }));
        builder.<AddMemberRequestV4>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AddMemberRequestV4.class),
            f -> f.withMarshaller(AddMemberV4Request::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchAddMembersV4Request, BatchAddMembersV4Response> batchAddMembersV4 =
        genForbatchAddMembersV4();

    private static HttpRequestDef<BatchAddMembersV4Request, BatchAddMembersV4Response> genForbatchAddMembersV4() {
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
            f -> f.withMarshaller(BatchAddMembersV4Request::getProjectId, (req, v) -> {
                req.setProjectId(v);
            }));
        builder.<BatchAddMembersV4RequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchAddMembersV4RequestBody.class),
            f -> f.withMarshaller(BatchAddMembersV4Request::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteMembersV4Request, BatchDeleteMembersV4Response> batchDeleteMembersV4 =
        genForbatchDeleteMembersV4();

    private static HttpRequestDef<BatchDeleteMembersV4Request, BatchDeleteMembersV4Response> genForbatchDeleteMembersV4() {
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
            f -> f.withMarshaller(BatchDeleteMembersV4Request::getProjectId, (req, v) -> {
                req.setProjectId(v);
            }));
        builder.<BatchDeleteMembersV4RequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchDeleteMembersV4RequestBody.class),
            f -> f.withMarshaller(BatchDeleteMembersV4Request::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchUpdateChildNickNamesRequest, BatchUpdateChildNickNamesResponse> batchUpdateChildNickNames =
        genForbatchUpdateChildNickNames();

    private static HttpRequestDef<BatchUpdateChildNickNamesRequest, BatchUpdateChildNickNamesResponse> genForbatchUpdateChildNickNames() {
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
            f -> f.withMarshaller(BatchUpdateChildNickNamesRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CheckProjectNameV4Request, CheckProjectNameV4Response> checkProjectNameV4 =
        genForcheckProjectNameV4();

    private static HttpRequestDef<CheckProjectNameV4Request, CheckProjectNameV4Response> genForcheckProjectNameV4() {
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
            f -> f.withMarshaller(CheckProjectNameV4Request::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateProjectV4Request, CreateProjectV4Response> createProjectV4 =
        genForcreateProjectV4();

    private static HttpRequestDef<CreateProjectV4Request, CreateProjectV4Response> genForcreateProjectV4() {
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
            f -> f.withMarshaller(CreateProjectV4Request::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteProjectV4Request, DeleteProjectV4Response> deleteProjectV4 =
        genFordeleteProjectV4();

    private static HttpRequestDef<DeleteProjectV4Request, DeleteProjectV4Response> genFordeleteProjectV4() {
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
            f -> f.withMarshaller(DeleteProjectV4Request::getProjectId, (req, v) -> {
                req.setProjectId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDomainNotAddedProjectsV4Request, ListDomainNotAddedProjectsV4Response> listDomainNotAddedProjectsV4 =
        genForlistDomainNotAddedProjectsV4();

    private static HttpRequestDef<ListDomainNotAddedProjectsV4Request, ListDomainNotAddedProjectsV4Response> genForlistDomainNotAddedProjectsV4() {
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
            f -> f.withMarshaller(ListDomainNotAddedProjectsV4Request::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDomainNotAddedProjectsV4Request::getLimit, (req, v) -> {
                req.setLimit(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListProjectBugStaticsV4Request, ListProjectBugStaticsV4Response> listProjectBugStaticsV4 =
        genForlistProjectBugStaticsV4();

    private static HttpRequestDef<ListProjectBugStaticsV4Request, ListProjectBugStaticsV4Response> genForlistProjectBugStaticsV4() {
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
            f -> f.withMarshaller(ListProjectBugStaticsV4Request::getProjectId, (req, v) -> {
                req.setProjectId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListProjectDemandStaticV4Request, ListProjectDemandStaticV4Response> listProjectDemandStaticV4 =
        genForlistProjectDemandStaticV4();

    private static HttpRequestDef<ListProjectDemandStaticV4Request, ListProjectDemandStaticV4Response> genForlistProjectDemandStaticV4() {
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
            f -> f.withMarshaller(ListProjectDemandStaticV4Request::getProjectId, (req, v) -> {
                req.setProjectId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListProjectMembersV4Request, ListProjectMembersV4Response> listProjectMembersV4 =
        genForlistProjectMembersV4();

    private static HttpRequestDef<ListProjectMembersV4Request, ListProjectMembersV4Response> genForlistProjectMembersV4() {
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
            f -> f.withMarshaller(ListProjectMembersV4Request::getProjectId, (req, v) -> {
                req.setProjectId(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListProjectMembersV4Request::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListProjectMembersV4Request::getLimit, (req, v) -> {
                req.setLimit(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListProjectsV4Request, ListProjectsV4Response> listProjectsV4 =
        genForlistProjectsV4();

    private static HttpRequestDef<ListProjectsV4Request, ListProjectsV4Response> genForlistProjectsV4() {
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
            f -> f.withMarshaller(ListProjectsV4Request::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListProjectsV4Request::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("search",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProjectsV4Request::getSearch, (req, v) -> {
                req.setSearch(v);
            }));
        builder.<String>withRequestField("project_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProjectsV4Request::getProjectType, (req, v) -> {
                req.setProjectType(v);
            }));
        builder.<String>withRequestField("sort",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProjectsV4Request::getSort, (req, v) -> {
                req.setSort(v);
            }));
        builder.<String>withRequestField("archive",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProjectsV4Request::getArchive, (req, v) -> {
                req.setArchive(v);
            }));
        builder.<String>withRequestField("query_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProjectsV4Request::getQueryType, (req, v) -> {
                req.setQueryType(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListWorkitemStatusRecordsV4Request, ListWorkitemStatusRecordsV4Response> listWorkitemStatusRecordsV4 =
        genForlistWorkitemStatusRecordsV4();

    private static HttpRequestDef<ListWorkitemStatusRecordsV4Request, ListWorkitemStatusRecordsV4Response> genForlistWorkitemStatusRecordsV4() {
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
            f -> f.withMarshaller(ListWorkitemStatusRecordsV4Request::getProjectId, (req, v) -> {
                req.setProjectId(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListWorkitemStatusRecordsV4Request::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListWorkitemStatusRecordsV4Request::getLimit, (req, v) -> {
                req.setLimit(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListWorkitemsRequest, ListWorkitemsResponse> listWorkitems =
        genForlistWorkitems();

    private static HttpRequestDef<ListWorkitemsRequest, ListWorkitemsResponse> genForlistWorkitems() {
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
            f -> f.withMarshaller(ListWorkitemsRequest::getProjectId, (req, v) -> {
                req.setProjectId(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListWorkitemsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListWorkitemsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("created_time_interval",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWorkitemsRequest::getCreatedTimeInterval, (req, v) -> {
                req.setCreatedTimeInterval(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RemoveProjectRequest, RemoveProjectResponse> removeProject =
        genForremoveProject();

    private static HttpRequestDef<RemoveProjectRequest, RemoveProjectResponse> genForremoveProject() {
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
            f -> f.withMarshaller(RemoveProjectRequest::getProjectId, (req, v) -> {
                req.setProjectId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowBugDensityV2Request, ShowBugDensityV2Response> showBugDensityV2 =
        genForshowBugDensityV2();

    private static HttpRequestDef<ShowBugDensityV2Request, ShowBugDensityV2Response> genForshowBugDensityV2() {
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
            f -> f.withMarshaller(ShowBugDensityV2Request::getProjectId, (req, v) -> {
                req.setProjectId(v);
            }));
        builder.<MetricRequestV2>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(MetricRequestV2.class),
            f -> f.withMarshaller(ShowBugDensityV2Request::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowBugsPerDeveloperRequest, ShowBugsPerDeveloperResponse> showBugsPerDeveloper =
        genForshowBugsPerDeveloper();

    private static HttpRequestDef<ShowBugsPerDeveloperRequest, ShowBugsPerDeveloperResponse> genForshowBugsPerDeveloper() {
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
            f -> f.withMarshaller(ShowBugsPerDeveloperRequest::getProjectId, (req, v) -> {
                req.setProjectId(v);
            }));
        builder.<MetricRequest2>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(MetricRequest2.class),
            f -> f.withMarshaller(ShowBugsPerDeveloperRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowCompletionRateRequest, ShowCompletionRateResponse> showCompletionRate =
        genForshowCompletionRate();

    private static HttpRequestDef<ShowCompletionRateRequest, ShowCompletionRateResponse> genForshowCompletionRate() {
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
            f -> f.withMarshaller(ShowCompletionRateRequest::getProjectId, (req, v) -> {
                req.setProjectId(v);
            }));
        builder.<MetricRequest3>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(MetricRequest3.class),
            f -> f.withMarshaller(ShowCompletionRateRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowCurUserInfoRequest, ShowCurUserInfoResponse> showCurUserInfo =
        genForshowCurUserInfo();

    private static HttpRequestDef<ShowCurUserInfoRequest, ShowCurUserInfoResponse> genForshowCurUserInfo() {
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
        genForshowCurUserRole();

    private static HttpRequestDef<ShowCurUserRoleRequest, ShowCurUserRoleResponse> genForshowCurUserRole() {
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
            f -> f.withMarshaller(ShowCurUserRoleRequest::getProjectId, (req, v) -> {
                req.setProjectId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowProjectInfoV4Request, ShowProjectInfoV4Response> showProjectInfoV4 =
        genForshowProjectInfoV4();

    private static HttpRequestDef<ShowProjectInfoV4Request, ShowProjectInfoV4Response> genForshowProjectInfoV4() {
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
            f -> f.withMarshaller(ShowProjectInfoV4Request::getProjectId, (req, v) -> {
                req.setProjectId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowProjectSummaryV4Request, ShowProjectSummaryV4Response> showProjectSummaryV4 =
        genForshowProjectSummaryV4();

    private static HttpRequestDef<ShowProjectSummaryV4Request, ShowProjectSummaryV4Response> genForshowProjectSummaryV4() {
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
            f -> f.withMarshaller(ShowProjectSummaryV4Request::getProjectId, (req, v) -> {
                req.setProjectId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowWorkItemWrokflowConfigRequest, ShowWorkItemWrokflowConfigResponse> showWorkItemWrokflowConfig =
        genForshowWorkItemWrokflowConfig();

    private static HttpRequestDef<ShowWorkItemWrokflowConfigRequest, ShowWorkItemWrokflowConfigResponse> genForshowWorkItemWrokflowConfig() {
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
            f -> f.withMarshaller(ShowWorkItemWrokflowConfigRequest::getProjectId, (req, v) -> {
                req.setProjectId(v);
            }));
        builder.<String>withRequestField("board_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowWorkItemWrokflowConfigRequest::getBoardId, (req, v) -> {
                req.setBoardId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateMembesRoleV4Request, UpdateMembesRoleV4Response> updateMembesRoleV4 =
        genForupdateMembesRoleV4();

    private static HttpRequestDef<UpdateMembesRoleV4Request, UpdateMembesRoleV4Response> genForupdateMembesRoleV4() {
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
            f -> f.withMarshaller(UpdateMembesRoleV4Request::getProjectId, (req, v) -> {
                req.setProjectId(v);
            }));
        builder.<UpdateMembesRoleV4RequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateMembesRoleV4RequestBody.class),
            f -> f.withMarshaller(UpdateMembesRoleV4Request::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateNickNameV4Request, UpdateNickNameV4Response> updateNickNameV4 =
        genForupdateNickNameV4();

    private static HttpRequestDef<UpdateNickNameV4Request, UpdateNickNameV4Response> genForupdateNickNameV4() {
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
            f -> f.withMarshaller(UpdateNickNameV4Request::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateProjectV4Request, UpdateProjectV4Response> updateProjectV4 =
        genForupdateProjectV4();

    private static HttpRequestDef<UpdateProjectV4Request, UpdateProjectV4Response> genForupdateProjectV4() {
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
            f -> f.withMarshaller(UpdateProjectV4Request::getProjectId, (req, v) -> {
                req.setProjectId(v);
            }));
        builder.<UpdateProjectRequestV4>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateProjectRequestV4.class),
            f -> f.withMarshaller(UpdateProjectV4Request::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteIssuesV4Request, BatchDeleteIssuesV4Response> batchDeleteIssuesV4 =
        genForbatchDeleteIssuesV4();

    private static HttpRequestDef<BatchDeleteIssuesV4Request, BatchDeleteIssuesV4Response> genForbatchDeleteIssuesV4() {
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
            f -> f.withMarshaller(BatchDeleteIssuesV4Request::getProjectId, (req, v) -> {
                req.setProjectId(v);
            }));
        builder.<BatchDelelteIssuesRequestV4>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchDelelteIssuesRequestV4.class),
            f -> f.withMarshaller(BatchDeleteIssuesV4Request::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteIterationsV4Request, BatchDeleteIterationsV4Response> batchDeleteIterationsV4 =
        genForbatchDeleteIterationsV4();

    private static HttpRequestDef<BatchDeleteIterationsV4Request, BatchDeleteIterationsV4Response> genForbatchDeleteIterationsV4() {
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
            f -> f.withMarshaller(BatchDeleteIterationsV4Request::getProjectId, (req, v) -> {
                req.setProjectId(v);
            }));
        builder.<BatchDeleteIterationsV4RequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchDeleteIterationsV4RequestBody.class),
            f -> f.withMarshaller(BatchDeleteIterationsV4Request::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CancelProjectDomainRequest, CancelProjectDomainResponse> cancelProjectDomain =
        genForcancelProjectDomain();

    private static HttpRequestDef<CancelProjectDomainRequest, CancelProjectDomainResponse> genForcancelProjectDomain() {
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
            f -> f.withMarshaller(CancelProjectDomainRequest::getProjectId, (req, v) -> {
                req.setProjectId(v);
            }));
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CancelProjectDomainRequest::getDomainId, (req, v) -> {
                req.setDomainId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateCustomfieldsRequest, CreateCustomfieldsResponse> createCustomfields =
        genForcreateCustomfields();

    private static HttpRequestDef<CreateCustomfieldsRequest, CreateCustomfieldsResponse> genForcreateCustomfields() {
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
            f -> f.withMarshaller(CreateCustomfieldsRequest::getProjectId, (req, v) -> {
                req.setProjectId(v);
            }));
        builder.<CreateCustomfieldV1Req>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateCustomfieldV1Req.class),
            f -> f.withMarshaller(CreateCustomfieldsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateIssueV4Request, CreateIssueV4Response> createIssueV4 =
        genForcreateIssueV4();

    private static HttpRequestDef<CreateIssueV4Request, CreateIssueV4Response> genForcreateIssueV4() {
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
            f -> f.withMarshaller(CreateIssueV4Request::getProjectId, (req, v) -> {
                req.setProjectId(v);
            }));
        builder.<CreateIssueRequestV4>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateIssueRequestV4.class),
            f -> f.withMarshaller(CreateIssueV4Request::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateIterationV4Request, CreateIterationV4Response> createIterationV4 =
        genForcreateIterationV4();

    private static HttpRequestDef<CreateIterationV4Request, CreateIterationV4Response> genForcreateIterationV4() {
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
            f -> f.withMarshaller(CreateIterationV4Request::getProjectId, (req, v) -> {
                req.setProjectId(v);
            }));
        builder.<CreateIterationRequestV4>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateIterationRequestV4.class),
            f -> f.withMarshaller(CreateIterationV4Request::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateProjectDomainRequest, CreateProjectDomainResponse> createProjectDomain =
        genForcreateProjectDomain();

    private static HttpRequestDef<CreateProjectDomainRequest, CreateProjectDomainResponse> genForcreateProjectDomain() {
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
            f -> f.withMarshaller(CreateProjectDomainRequest::getProjectId, (req, v) -> {
                req.setProjectId(v);
            }));
        builder.<CreateProjectDomainRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateProjectDomainRequestBody.class),
            f -> f.withMarshaller(CreateProjectDomainRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateProjectModuleRequest, CreateProjectModuleResponse> createProjectModule =
        genForcreateProjectModule();

    private static HttpRequestDef<CreateProjectModuleRequest, CreateProjectModuleResponse> genForcreateProjectModule() {
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
            f -> f.withMarshaller(CreateProjectModuleRequest::getProjectId, (req, v) -> {
                req.setProjectId(v);
            }));
        builder.<CreateProjectModuleRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateProjectModuleRequestBody.class),
            f -> f.withMarshaller(CreateProjectModuleRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateSystemIssueV4Request, CreateSystemIssueV4Response> createSystemIssueV4 =
        genForcreateSystemIssueV4();

    private static HttpRequestDef<CreateSystemIssueV4Request, CreateSystemIssueV4Response> genForcreateSystemIssueV4() {
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
            f -> f.withMarshaller(CreateSystemIssueV4Request::getProjectId, (req, v) -> {
                req.setProjectId(v);
            }));
        builder.<CreateSystemIssueRequestV4>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateSystemIssueRequestV4.class),
            f -> f.withMarshaller(CreateSystemIssueV4Request::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteAttachmentRequest, DeleteAttachmentResponse> deleteAttachment =
        genFordeleteAttachment();

    private static HttpRequestDef<DeleteAttachmentRequest, DeleteAttachmentResponse> genFordeleteAttachment() {
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
            f -> f.withMarshaller(DeleteAttachmentRequest::getProjectId, (req, v) -> {
                req.setProjectId(v);
            }));
        builder.<String>withRequestField("issue_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAttachmentRequest::getIssueId, (req, v) -> {
                req.setIssueId(v);
            }));
        builder.<String>withRequestField("attachment_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAttachmentRequest::getAttachmentId, (req, v) -> {
                req.setAttachmentId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteIssueV4Request, DeleteIssueV4Response> deleteIssueV4 =
        genFordeleteIssueV4();

    private static HttpRequestDef<DeleteIssueV4Request, DeleteIssueV4Response> genFordeleteIssueV4() {
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
            f -> f.withMarshaller(DeleteIssueV4Request::getProjectId, (req, v) -> {
                req.setProjectId(v);
            }));
        builder.<Integer>withRequestField("issue_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(DeleteIssueV4Request::getIssueId, (req, v) -> {
                req.setIssueId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteIterationV4Request, DeleteIterationV4Response> deleteIterationV4 =
        genFordeleteIterationV4();

    private static HttpRequestDef<DeleteIterationV4Request, DeleteIterationV4Response> genFordeleteIterationV4() {
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
            f -> f.withMarshaller(DeleteIterationV4Request::getProjectId, (req, v) -> {
                req.setProjectId(v);
            }));
        builder.<Integer>withRequestField("iteration_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(DeleteIterationV4Request::getIterationId, (req, v) -> {
                req.setIterationId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteProjectModuleRequest, DeleteProjectModuleResponse> deleteProjectModule =
        genFordeleteProjectModule();

    private static HttpRequestDef<DeleteProjectModuleRequest, DeleteProjectModuleResponse> genFordeleteProjectModule() {
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
            f -> f.withMarshaller(DeleteProjectModuleRequest::getProjectId, (req, v) -> {
                req.setProjectId(v);
            }));
        builder.<Integer>withRequestField("module_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(DeleteProjectModuleRequest::getModuleId, (req, v) -> {
                req.setModuleId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DownloadAttachmentRequest, DownloadAttachmentResponse> downloadAttachment =
        genFordownloadAttachment();

    private static HttpRequestDef<DownloadAttachmentRequest, DownloadAttachmentResponse> genFordownloadAttachment() {
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
            f -> f.withMarshaller(DownloadAttachmentRequest::getProjectId, (req, v) -> {
                req.setProjectId(v);
            }));
        builder.<String>withRequestField("issue_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DownloadAttachmentRequest::getIssueId, (req, v) -> {
                req.setIssueId(v);
            }));
        builder.<String>withRequestField("attachment_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DownloadAttachmentRequest::getAttachmentId, (req, v) -> {
                req.setAttachmentId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DownloadImageFileRequest, DownloadImageFileResponse> downloadImageFile =
        genFordownloadImageFile();

    private static HttpRequestDef<DownloadImageFileRequest, DownloadImageFileResponse> genFordownloadImageFile() {
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
            f -> f.withMarshaller(DownloadImageFileRequest::getProjectId, (req, v) -> {
                req.setProjectId(v);
            }));
        builder.<String>withRequestField("image_uri",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DownloadImageFileRequest::getImageUri, (req, v) -> {
                req.setImageUri(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAssociatedIssuesRequest, ListAssociatedIssuesResponse> listAssociatedIssues =
        genForlistAssociatedIssues();

    private static HttpRequestDef<ListAssociatedIssuesRequest, ListAssociatedIssuesResponse> genForlistAssociatedIssues() {
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
            f -> f.withMarshaller(ListAssociatedIssuesRequest::getProjectId, (req, v) -> {
                req.setProjectId(v);
            }));
        builder.<Integer>withRequestField("issue_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAssociatedIssuesRequest::getIssueId, (req, v) -> {
                req.setIssueId(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAssociatedIssuesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAssociatedIssuesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAssociatedTestCasesRequest, ListAssociatedTestCasesResponse> listAssociatedTestCases =
        genForlistAssociatedTestCases();

    private static HttpRequestDef<ListAssociatedTestCasesRequest, ListAssociatedTestCasesResponse> genForlistAssociatedTestCases() {
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
            f -> f.withMarshaller(ListAssociatedTestCasesRequest::getProjectId, (req, v) -> {
                req.setProjectId(v);
            }));
        builder.<Integer>withRequestField("issue_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAssociatedTestCasesRequest::getIssueId, (req, v) -> {
                req.setIssueId(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAssociatedTestCasesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAssociatedTestCasesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAssociatedWikisRequest, ListAssociatedWikisResponse> listAssociatedWikis =
        genForlistAssociatedWikis();

    private static HttpRequestDef<ListAssociatedWikisRequest, ListAssociatedWikisResponse> genForlistAssociatedWikis() {
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
            f -> f.withMarshaller(ListAssociatedWikisRequest::getProjectId, (req, v) -> {
                req.setProjectId(v);
            }));
        builder.<Integer>withRequestField("issue_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAssociatedWikisRequest::getIssueId, (req, v) -> {
                req.setIssueId(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAssociatedWikisRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAssociatedWikisRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListChildIssuesV4Request, ListChildIssuesV4Response> listChildIssuesV4 =
        genForlistChildIssuesV4();

    private static HttpRequestDef<ListChildIssuesV4Request, ListChildIssuesV4Response> genForlistChildIssuesV4() {
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
            f -> f.withMarshaller(ListChildIssuesV4Request::getProjectId, (req, v) -> {
                req.setProjectId(v);
            }));
        builder.<Integer>withRequestField("issue_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListChildIssuesV4Request::getIssueId, (req, v) -> {
                req.setIssueId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListIssueAssociatedCommitsRequest, ListIssueAssociatedCommitsResponse> listIssueAssociatedCommits =
        genForlistIssueAssociatedCommits();

    private static HttpRequestDef<ListIssueAssociatedCommitsRequest, ListIssueAssociatedCommitsResponse> genForlistIssueAssociatedCommits() {
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
            f -> f.withMarshaller(ListIssueAssociatedCommitsRequest::getProjectId, (req, v) -> {
                req.setProjectId(v);
            }));
        builder.<Integer>withRequestField("issue_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListIssueAssociatedCommitsRequest::getIssueId, (req, v) -> {
                req.setIssueId(v);
            }));
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListIssueAssociatedCommitsRequest::getType, (req, v) -> {
                req.setType(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListIssueAssociatedCommitsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListIssueAssociatedCommitsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListIssueCommentsV4Request, ListIssueCommentsV4Response> listIssueCommentsV4 =
        genForlistIssueCommentsV4();

    private static HttpRequestDef<ListIssueCommentsV4Request, ListIssueCommentsV4Response> genForlistIssueCommentsV4() {
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
            f -> f.withMarshaller(ListIssueCommentsV4Request::getProjectId, (req, v) -> {
                req.setProjectId(v);
            }));
        builder.<Integer>withRequestField("issue_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListIssueCommentsV4Request::getIssueId, (req, v) -> {
                req.setIssueId(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListIssueCommentsV4Request::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListIssueCommentsV4Request::getLimit, (req, v) -> {
                req.setLimit(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListIssueCustomFieldsRequest, ListIssueCustomFieldsResponse> listIssueCustomFields =
        genForlistIssueCustomFields();

    private static HttpRequestDef<ListIssueCustomFieldsRequest, ListIssueCustomFieldsResponse> genForlistIssueCustomFields() {
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
            f -> f.withMarshaller(ListIssueCustomFieldsRequest::getProjectId, (req, v) -> {
                req.setProjectId(v);
            }));
        builder.<ListIssueCustomFieldsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListIssueCustomFieldsRequestBody.class),
            f -> f.withMarshaller(ListIssueCustomFieldsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListIssueRecordsV4Request, ListIssueRecordsV4Response> listIssueRecordsV4 =
        genForlistIssueRecordsV4();

    private static HttpRequestDef<ListIssueRecordsV4Request, ListIssueRecordsV4Response> genForlistIssueRecordsV4() {
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
            f -> f.withMarshaller(ListIssueRecordsV4Request::getProjectId, (req, v) -> {
                req.setProjectId(v);
            }));
        builder.<Integer>withRequestField("issue_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListIssueRecordsV4Request::getIssueId, (req, v) -> {
                req.setIssueId(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListIssueRecordsV4Request::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListIssueRecordsV4Request::getLimit, (req, v) -> {
                req.setLimit(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListIssuesSfV4Request, ListIssuesSfV4Response> listIssuesSfV4 =
        genForlistIssuesSfV4();

    private static HttpRequestDef<ListIssuesSfV4Request, ListIssuesSfV4Response> genForlistIssuesSfV4() {
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
            f -> f.withMarshaller(ListIssuesSfV4Request::getProjectId, (req, v) -> {
                req.setProjectId(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListIssuesSfV4Request::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListIssuesSfV4Request::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<ListIssuesSfV4Request.TrackerIdEnum>withRequestField("tracker_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListIssuesSfV4Request.TrackerIdEnum.class),
            f -> f.withMarshaller(ListIssuesSfV4Request::getTrackerId, (req, v) -> {
                req.setTrackerId(v);
            }));
        builder.<String>withRequestField("created_time_interval",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListIssuesSfV4Request::getCreatedTimeInterval, (req, v) -> {
                req.setCreatedTimeInterval(v);
            }));
        builder.<String>withRequestField("updated_time_interval",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListIssuesSfV4Request::getUpdatedTimeInterval, (req, v) -> {
                req.setUpdatedTimeInterval(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListIssuesV4Request, ListIssuesV4Response> listIssuesV4 = genForlistIssuesV4();

    private static HttpRequestDef<ListIssuesV4Request, ListIssuesV4Response> genForlistIssuesV4() {
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
            f -> f.withMarshaller(ListIssuesV4Request::getProjectId, (req, v) -> {
                req.setProjectId(v);
            }));
        builder.<ListIssueRequestV4>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListIssueRequestV4.class),
            f -> f.withMarshaller(ListIssuesV4Request::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListIterationHistoriesRequest, ListIterationHistoriesResponse> listIterationHistories =
        genForlistIterationHistories();

    private static HttpRequestDef<ListIterationHistoriesRequest, ListIterationHistoriesResponse> genForlistIterationHistories() {
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
            f -> f.withMarshaller(ListIterationHistoriesRequest::getIterationId, (req, v) -> {
                req.setIterationId(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListIterationHistoriesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListIterationHistoriesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListProjectDomainsRequest, ListProjectDomainsResponse> listProjectDomains =
        genForlistProjectDomains();

    private static HttpRequestDef<ListProjectDomainsRequest, ListProjectDomainsResponse> genForlistProjectDomains() {
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
            f -> f.withMarshaller(ListProjectDomainsRequest::getProjectId, (req, v) -> {
                req.setProjectId(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListProjectDomainsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListProjectDomainsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListProjectIssuesRecordsV4Request, ListProjectIssuesRecordsV4Response> listProjectIssuesRecordsV4 =
        genForlistProjectIssuesRecordsV4();

    private static HttpRequestDef<ListProjectIssuesRecordsV4Request, ListProjectIssuesRecordsV4Response> genForlistProjectIssuesRecordsV4() {
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
            f -> f.withMarshaller(ListProjectIssuesRecordsV4Request::getProjectId, (req, v) -> {
                req.setProjectId(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListProjectIssuesRecordsV4Request::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListProjectIssuesRecordsV4Request::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("operated_time_interval",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProjectIssuesRecordsV4Request::getOperatedTimeInterval, (req, v) -> {
                req.setOperatedTimeInterval(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListProjectIterationsV4Request, ListProjectIterationsV4Response> listProjectIterationsV4 =
        genForlistProjectIterationsV4();

    private static HttpRequestDef<ListProjectIterationsV4Request, ListProjectIterationsV4Response> genForlistProjectIterationsV4() {
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
            f -> f.withMarshaller(ListProjectIterationsV4Request::getProjectId, (req, v) -> {
                req.setProjectId(v);
            }));
        builder.<String>withRequestField("updated_time_interval",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProjectIterationsV4Request::getUpdatedTimeInterval, (req, v) -> {
                req.setUpdatedTimeInterval(v);
            }));
        builder.<Boolean>withRequestField("include_deleted",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListProjectIterationsV4Request::getIncludeDeleted, (req, v) -> {
                req.setIncludeDeleted(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListProjectModulesRequest, ListProjectModulesResponse> listProjectModules =
        genForlistProjectModules();

    private static HttpRequestDef<ListProjectModulesRequest, ListProjectModulesResponse> genForlistProjectModules() {
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
            f -> f.withMarshaller(ListProjectModulesRequest::getProjectId, (req, v) -> {
                req.setProjectId(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListProjectModulesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListProjectModulesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListProjectWorkHoursRequest, ListProjectWorkHoursResponse> listProjectWorkHours =
        genForlistProjectWorkHours();

    private static HttpRequestDef<ListProjectWorkHoursRequest, ListProjectWorkHoursResponse> genForlistProjectWorkHours() {
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
            f -> f.withMarshaller(ListProjectWorkHoursRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListScrumProjectStatusesRequest, ListScrumProjectStatusesResponse> listScrumProjectStatuses =
        genForlistScrumProjectStatuses();

    private static HttpRequestDef<ListScrumProjectStatusesRequest, ListScrumProjectStatusesResponse> genForlistScrumProjectStatuses() {
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
            f -> f.withMarshaller(ListScrumProjectStatusesRequest::getProjectId, (req, v) -> {
                req.setProjectId(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListScrumProjectStatusesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListScrumProjectStatusesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("tracker_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListScrumProjectStatusesRequest::getTrackerId, (req, v) -> {
                req.setTrackerId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListStatusStatisticRequest, ListStatusStatisticResponse> listStatusStatistic =
        genForlistStatusStatistic();

    private static HttpRequestDef<ListStatusStatisticRequest, ListStatusStatisticResponse> genForlistStatusStatistic() {
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
            f -> f.withMarshaller(ListStatusStatisticRequest::getProjectId, (req, v) -> {
                req.setProjectId(v);
            }));
        builder.<Integer>withRequestField("iteration_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListStatusStatisticRequest::getIterationId, (req, v) -> {
                req.setIterationId(v);
            }));
        builder.<Integer>withRequestField("tracker_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListStatusStatisticRequest::getTrackerId, (req, v) -> {
                req.setTrackerId(v);
            }));
        builder.<Integer>withRequestField("status_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListStatusStatisticRequest::getStatusId, (req, v) -> {
                req.setStatusId(v);
            }));

        // response
        builder.<List<UserStatusStatistic>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListStatusStatisticResponse::getBody, (response, data) -> {
                response.setBody(data);
            }).withInnerContainerType(UserStatusStatistic.class));

        return builder.build();
    }

    public static final HttpRequestDef<ShowIssueCompletionRateRequest, ShowIssueCompletionRateResponse> showIssueCompletionRate =
        genForshowIssueCompletionRate();

    private static HttpRequestDef<ShowIssueCompletionRateRequest, ShowIssueCompletionRateResponse> genForshowIssueCompletionRate() {
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
            f -> f.withMarshaller(ShowIssueCompletionRateRequest::getProjectId, (req, v) -> {
                req.setProjectId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowIssueV4Request, ShowIssueV4Response> showIssueV4 = genForshowIssueV4();

    private static HttpRequestDef<ShowIssueV4Request, ShowIssueV4Response> genForshowIssueV4() {
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
            f -> f.withMarshaller(ShowIssueV4Request::getProjectId, (req, v) -> {
                req.setProjectId(v);
            }));
        builder.<Integer>withRequestField("issue_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowIssueV4Request::getIssueId, (req, v) -> {
                req.setIssueId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowIssuesWrokFlowConfigRequest, ShowIssuesWrokFlowConfigResponse> showIssuesWrokFlowConfig =
        genForshowIssuesWrokFlowConfig();

    private static HttpRequestDef<ShowIssuesWrokFlowConfigRequest, ShowIssuesWrokFlowConfigResponse> genForshowIssuesWrokFlowConfig() {
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
            f -> f.withMarshaller(ShowIssuesWrokFlowConfigRequest::getProjectId, (req, v) -> {
                req.setProjectId(v);
            }));
        builder.<Integer>withRequestField("tracker_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowIssuesWrokFlowConfigRequest::getTrackerId, (req, v) -> {
                req.setTrackerId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowIterationV4Request, ShowIterationV4Response> showIterationV4 =
        genForshowIterationV4();

    private static HttpRequestDef<ShowIterationV4Request, ShowIterationV4Response> genForshowIterationV4() {
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
            f -> f.withMarshaller(ShowIterationV4Request::getIterationId, (req, v) -> {
                req.setIterationId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowProjectWorkHoursRequest, ShowProjectWorkHoursResponse> showProjectWorkHours =
        genForshowProjectWorkHours();

    private static HttpRequestDef<ShowProjectWorkHoursRequest, ShowProjectWorkHoursResponse> genForshowProjectWorkHours() {
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
            f -> f.withMarshaller(ShowProjectWorkHoursRequest::getProjectId, (req, v) -> {
                req.setProjectId(v);
            }));
        builder.<ShowProjectWorkHoursRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ShowProjectWorkHoursRequestBody.class),
            f -> f.withMarshaller(ShowProjectWorkHoursRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateIssueV4Request, UpdateIssueV4Response> updateIssueV4 =
        genForupdateIssueV4();

    private static HttpRequestDef<UpdateIssueV4Request, UpdateIssueV4Response> genForupdateIssueV4() {
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
            f -> f.withMarshaller(UpdateIssueV4Request::getProjectId, (req, v) -> {
                req.setProjectId(v);
            }));
        builder.<Integer>withRequestField("issue_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(UpdateIssueV4Request::getIssueId, (req, v) -> {
                req.setIssueId(v);
            }));
        builder.<IssueRequestV4>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(IssueRequestV4.class),
            f -> f.withMarshaller(UpdateIssueV4Request::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateIterationV4Request, UpdateIterationV4Response> updateIterationV4 =
        genForupdateIterationV4();

    private static HttpRequestDef<UpdateIterationV4Request, UpdateIterationV4Response> genForupdateIterationV4() {
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
            f -> f.withMarshaller(UpdateIterationV4Request::getProjectId, (req, v) -> {
                req.setProjectId(v);
            }));
        builder.<Integer>withRequestField("iteration_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(UpdateIterationV4Request::getIterationId, (req, v) -> {
                req.setIterationId(v);
            }));
        builder.<UpdateIterationRequestV4>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateIterationRequestV4.class),
            f -> f.withMarshaller(UpdateIterationV4Request::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateProjectDomainRequest, UpdateProjectDomainResponse> updateProjectDomain =
        genForupdateProjectDomain();

    private static HttpRequestDef<UpdateProjectDomainRequest, UpdateProjectDomainResponse> genForupdateProjectDomain() {
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
            f -> f.withMarshaller(UpdateProjectDomainRequest::getProjectId, (req, v) -> {
                req.setProjectId(v);
            }));
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateProjectDomainRequest::getDomainId, (req, v) -> {
                req.setDomainId(v);
            }));
        builder.<CreateProjectDomainRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateProjectDomainRequestBody.class),
            f -> f.withMarshaller(UpdateProjectDomainRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateProjectModuleRequest, UpdateProjectModuleResponse> updateProjectModule =
        genForupdateProjectModule();

    private static HttpRequestDef<UpdateProjectModuleRequest, UpdateProjectModuleResponse> genForupdateProjectModule() {
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
            f -> f.withMarshaller(UpdateProjectModuleRequest::getProjectId, (req, v) -> {
                req.setProjectId(v);
            }));
        builder.<Integer>withRequestField("module_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(UpdateProjectModuleRequest::getModuleId, (req, v) -> {
                req.setModuleId(v);
            }));
        builder.<UpdateProjectModuleRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateProjectModuleRequestBody.class),
            f -> f.withMarshaller(UpdateProjectModuleRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UploadAttachmentsRequest, UploadAttachmentsResponse> uploadAttachments =
        genForuploadAttachments();

    private static HttpRequestDef<UploadAttachmentsRequest, UploadAttachmentsResponse> genForuploadAttachments() {
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
            f -> f.withMarshaller(UploadAttachmentsRequest::getProjectId, (req, v) -> {
                req.setProjectId(v);
            }));
        builder.<String>withRequestField("issue_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UploadAttachmentsRequest::getIssueId, (req, v) -> {
                req.setIssueId(v);
            }));
        builder.<UploadAttachmentsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UploadAttachmentsRequestBody.class),
            f -> f.withMarshaller(UploadAttachmentsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UploadIssueImgRequest, UploadIssueImgResponse> uploadIssueImg =
        genForuploadIssueImg();

    private static HttpRequestDef<UploadIssueImgRequest, UploadIssueImgResponse> genForuploadIssueImg() {
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
            f -> f.withMarshaller(UploadIssueImgRequest::getProjectId, (req, v) -> {
                req.setProjectId(v);
            }));
        builder.<UploadIssueImgRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UploadIssueImgRequestBody.class),
            f -> f.withMarshaller(UploadIssueImgRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

}
