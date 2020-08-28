package com.huaweicloud.sdk.projectman.v4;

import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.projectman.v4.model.*;
import java.util.List;
import java.util.Map;
import java.time.OffsetDateTime;

@SuppressWarnings("unchecked")
public class ProjectManMeta {

    public static final HttpRequestDef<CreateProjectV4Request, CreateProjectV4Response> createProjectV4 = genForcreateProjectV4();

    private static HttpRequestDef<CreateProjectV4Request, CreateProjectV4Response> genForcreateProjectV4() {
        // basic
        HttpRequestDef.Builder<CreateProjectV4Request, CreateProjectV4Response> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateProjectV4Request.class, CreateProjectV4Response.class)
                .withUri("/v4/project")
                .withContentType("application/json");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            CreateProjectV4RequestBody.class,
            f -> f.withMarshaller(CreateProjectV4Request::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDomainNotAddedProjectsV4Request, ListDomainNotAddedProjectsV4Response> listDomainNotAddedProjectsV4 = genForlistDomainNotAddedProjectsV4();

    private static HttpRequestDef<ListDomainNotAddedProjectsV4Request, ListDomainNotAddedProjectsV4Response> genForlistDomainNotAddedProjectsV4() {
        // basic
        HttpRequestDef.Builder<ListDomainNotAddedProjectsV4Request, ListDomainNotAddedProjectsV4Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListDomainNotAddedProjectsV4Request.class, ListDomainNotAddedProjectsV4Response.class)
                .withUri("/v4/projects/domain/not-added");

        // requests
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListDomainNotAddedProjectsV4Request::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListDomainNotAddedProjectsV4Request::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListIssueCommentsV4Request, ListIssueCommentsV4Response> listIssueCommentsV4 = genForlistIssueCommentsV4();

    private static HttpRequestDef<ListIssueCommentsV4Request, ListIssueCommentsV4Response> genForlistIssueCommentsV4() {
        // basic
        HttpRequestDef.Builder<ListIssueCommentsV4Request, ListIssueCommentsV4Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListIssueCommentsV4Request.class, ListIssueCommentsV4Response.class)
                .withUri("/v4/projects/{project_id}/issues/{issue_id}/comments");

        // requests
        builder.withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListIssueCommentsV4Request::getProjectId, (req, v) -> {
                req.setProjectId(v);
            })
        );
        builder.withRequestField("issue_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            Integer.class,
            f -> f.withMarshaller(ListIssueCommentsV4Request::getIssueId, (req, v) -> {
                req.setIssueId(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListIssueCommentsV4Request::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListIssueCommentsV4Request::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListIssueRecordsV4Request, ListIssueRecordsV4Response> listIssueRecordsV4 = genForlistIssueRecordsV4();

    private static HttpRequestDef<ListIssueRecordsV4Request, ListIssueRecordsV4Response> genForlistIssueRecordsV4() {
        // basic
        HttpRequestDef.Builder<ListIssueRecordsV4Request, ListIssueRecordsV4Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListIssueRecordsV4Request.class, ListIssueRecordsV4Response.class)
                .withUri("/v4/projects/{project_id}/issue/{issue_id}/records");

        // requests
        builder.withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListIssueRecordsV4Request::getProjectId, (req, v) -> {
                req.setProjectId(v);
            })
        );
        builder.withRequestField("issue_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            Integer.class,
            f -> f.withMarshaller(ListIssueRecordsV4Request::getIssueId, (req, v) -> {
                req.setIssueId(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListIssueRecordsV4Request::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListIssueRecordsV4Request::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListProjectMembersV4Request, ListProjectMembersV4Response> listProjectMembersV4 = genForlistProjectMembersV4();

    private static HttpRequestDef<ListProjectMembersV4Request, ListProjectMembersV4Response> genForlistProjectMembersV4() {
        // basic
        HttpRequestDef.Builder<ListProjectMembersV4Request, ListProjectMembersV4Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListProjectMembersV4Request.class, ListProjectMembersV4Response.class)
                .withUri("/v4/projects/{project_id}/members");

        // requests
        builder.withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListProjectMembersV4Request::getProjectId, (req, v) -> {
                req.setProjectId(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListProjectMembersV4Request::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListProjectMembersV4Request::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListProjectVersionsV4Request, ListProjectVersionsV4Response> listProjectVersionsV4 = genForlistProjectVersionsV4();

    private static HttpRequestDef<ListProjectVersionsV4Request, ListProjectVersionsV4Response> genForlistProjectVersionsV4() {
        // basic
        HttpRequestDef.Builder<ListProjectVersionsV4Request, ListProjectVersionsV4Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListProjectVersionsV4Request.class, ListProjectVersionsV4Response.class)
                .withUri("/v4/projects/{project_id}/iterations");

        // requests
        builder.withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListProjectVersionsV4Request::getProjectId, (req, v) -> {
                req.setProjectId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListProjectWorkHoursRequest, ListProjectWorkHoursResponse> listProjectWorkHours = genForlistProjectWorkHours();

    private static HttpRequestDef<ListProjectWorkHoursRequest, ListProjectWorkHoursResponse> genForlistProjectWorkHours() {
        // basic
        HttpRequestDef.Builder<ListProjectWorkHoursRequest, ListProjectWorkHoursResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListProjectWorkHoursRequest.class, ListProjectWorkHoursResponse.class)
                .withUri("/v4/projects/work-hours")
                .withContentType("application/json");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            ListProjectWorkHoursRequestBody.class,
            f -> f.withMarshaller(ListProjectWorkHoursRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListProjectsV4Request, ListProjectsV4Response> listProjectsV4 = genForlistProjectsV4();

    private static HttpRequestDef<ListProjectsV4Request, ListProjectsV4Response> genForlistProjectsV4() {
        // basic
        HttpRequestDef.Builder<ListProjectsV4Request, ListProjectsV4Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListProjectsV4Request.class, ListProjectsV4Response.class)
                .withUri("/v4/projects");

        // requests
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            Integer.class,
            f -> f.withMarshaller(ListProjectsV4Request::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            Integer.class,
            f -> f.withMarshaller(ListProjectsV4Request::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("search",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListProjectsV4Request::getSearch, (req, v) -> {
                req.setSearch(v);
            })
        );
        builder.withRequestField("project_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListProjectsV4Request::getProjectType, (req, v) -> {
                req.setProjectType(v);
            })
        );
        builder.withRequestField("sort",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListProjectsV4Request::getSort, (req, v) -> {
                req.setSort(v);
            })
        );
        builder.withRequestField("archive",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListProjectsV4Request::getArchive, (req, v) -> {
                req.setArchive(v);
            })
        );
        builder.withRequestField("query_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListProjectsV4Request::getQueryType, (req, v) -> {
                req.setQueryType(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RemoveProjectRequest, RemoveProjectResponse> removeProject = genForremoveProject();

    private static HttpRequestDef<RemoveProjectRequest, RemoveProjectResponse> genForremoveProject() {
        // basic
        HttpRequestDef.Builder<RemoveProjectRequest, RemoveProjectResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, RemoveProjectRequest.class, RemoveProjectResponse.class)
                .withUri("/v4/projects/{project_id}/quit");

        // requests
        builder.withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(RemoveProjectRequest::getProjectId, (req, v) -> {
                req.setProjectId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowCurUserInfoRequest, ShowCurUserInfoResponse> showCurUserInfo = genForshowCurUserInfo();

    private static HttpRequestDef<ShowCurUserInfoRequest, ShowCurUserInfoResponse> genForshowCurUserInfo() {
        // basic
        HttpRequestDef.Builder<ShowCurUserInfoRequest, ShowCurUserInfoResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowCurUserInfoRequest.class, ShowCurUserInfoResponse.class)
                .withUri("/v4/user");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowCurUserRoleRequest, ShowCurUserRoleResponse> showCurUserRole = genForshowCurUserRole();

    private static HttpRequestDef<ShowCurUserRoleRequest, ShowCurUserRoleResponse> genForshowCurUserRole() {
        // basic
        HttpRequestDef.Builder<ShowCurUserRoleRequest, ShowCurUserRoleResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowCurUserRoleRequest.class, ShowCurUserRoleResponse.class)
                .withUri("/v4/projects/{project_id}/user-role");

        // requests
        builder.withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowCurUserRoleRequest::getProjectId, (req, v) -> {
                req.setProjectId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowProjectWorkHoursRequest, ShowProjectWorkHoursResponse> showProjectWorkHours = genForshowProjectWorkHours();

    private static HttpRequestDef<ShowProjectWorkHoursRequest, ShowProjectWorkHoursResponse> genForshowProjectWorkHours() {
        // basic
        HttpRequestDef.Builder<ShowProjectWorkHoursRequest, ShowProjectWorkHoursResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ShowProjectWorkHoursRequest.class, ShowProjectWorkHoursResponse.class)
                .withUri("/v4/projects/{project_id}/work-hours")
                .withContentType("application/json");

        // requests
        builder.withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowProjectWorkHoursRequest::getProjectId, (req, v) -> {
                req.setProjectId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            ShowProjectWorkHoursRequestBody.class,
            f -> f.withMarshaller(ShowProjectWorkHoursRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowtIssueCompletionRateRequest, ShowtIssueCompletionRateResponse> showtIssueCompletionRate = genForshowtIssueCompletionRate();

    private static HttpRequestDef<ShowtIssueCompletionRateRequest, ShowtIssueCompletionRateResponse> genForshowtIssueCompletionRate() {
        // basic
        HttpRequestDef.Builder<ShowtIssueCompletionRateRequest, ShowtIssueCompletionRateResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowtIssueCompletionRateRequest.class, ShowtIssueCompletionRateResponse.class)
                .withUri("/v4/projects/{project_id}/issue-completion-rate");

        // requests
        builder.withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowtIssueCompletionRateRequest::getProjectId, (req, v) -> {
                req.setProjectId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateMembesRoleV4Request, UpdateMembesRoleV4Response> updateMembesRoleV4 = genForupdateMembesRoleV4();

    private static HttpRequestDef<UpdateMembesRoleV4Request, UpdateMembesRoleV4Response> genForupdateMembesRoleV4() {
        // basic
        HttpRequestDef.Builder<UpdateMembesRoleV4Request, UpdateMembesRoleV4Response> builder =
            HttpRequestDef.builder(HttpMethod.POST, UpdateMembesRoleV4Request.class, UpdateMembesRoleV4Response.class)
                .withUri("/v4/projects/{project_id}/members/role")
                .withContentType("application/json");

        // requests
        builder.withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateMembesRoleV4Request::getProjectId, (req, v) -> {
                req.setProjectId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            UpdateMembesRoleV4RequestBody.class,
            f -> f.withMarshaller(UpdateMembesRoleV4Request::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

}
