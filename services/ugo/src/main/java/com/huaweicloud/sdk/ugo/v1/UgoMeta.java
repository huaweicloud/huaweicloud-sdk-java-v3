package com.huaweicloud.sdk.ugo.v1;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.ugo.v1.model.CheckPermissionRequest;
import com.huaweicloud.sdk.ugo.v1.model.CheckPermissionResponse;
import com.huaweicloud.sdk.ugo.v1.model.CommitSyntaxConversionRequest;
import com.huaweicloud.sdk.ugo.v1.model.CommitSyntaxConversionResponse;
import com.huaweicloud.sdk.ugo.v1.model.CommitVerificationRequest;
import com.huaweicloud.sdk.ugo.v1.model.CommitVerificationResponse;
import com.huaweicloud.sdk.ugo.v1.model.ConfirmTargetDBReq;
import com.huaweicloud.sdk.ugo.v1.model.ConfirmTargetDbTypeRequest;
import com.huaweicloud.sdk.ugo.v1.model.ConfirmTargetDbTypeResponse;
import com.huaweicloud.sdk.ugo.v1.model.CreateEvaluationProjectReq;
import com.huaweicloud.sdk.ugo.v1.model.CreateEvaluationProjectRequest;
import com.huaweicloud.sdk.ugo.v1.model.CreateEvaluationProjectResponse;
import com.huaweicloud.sdk.ugo.v1.model.CreateMigrationProject;
import com.huaweicloud.sdk.ugo.v1.model.CreateMigrationProjectRequest;
import com.huaweicloud.sdk.ugo.v1.model.CreateMigrationProjectResponse;
import com.huaweicloud.sdk.ugo.v1.model.DeleteEvaluationProjectRequest;
import com.huaweicloud.sdk.ugo.v1.model.DeleteEvaluationProjectResponse;
import com.huaweicloud.sdk.ugo.v1.model.DeleteMigrationProjectRequest;
import com.huaweicloud.sdk.ugo.v1.model.DeleteMigrationProjectResponse;
import com.huaweicloud.sdk.ugo.v1.model.DownloadFailureReportRequest;
import com.huaweicloud.sdk.ugo.v1.model.DownloadFailureReportResponse;
import com.huaweicloud.sdk.ugo.v1.model.ListApiVersionsRequest;
import com.huaweicloud.sdk.ugo.v1.model.ListApiVersionsResponse;
import com.huaweicloud.sdk.ugo.v1.model.ListEvaluationProjectsRequest;
import com.huaweicloud.sdk.ugo.v1.model.ListEvaluationProjectsResponse;
import com.huaweicloud.sdk.ugo.v1.model.ListMigrationProjectsRequest;
import com.huaweicloud.sdk.ugo.v1.model.ListMigrationProjectsResponse;
import com.huaweicloud.sdk.ugo.v1.model.ListPermissionCheckResultRequest;
import com.huaweicloud.sdk.ugo.v1.model.ListPermissionCheckResultResponse;
import com.huaweicloud.sdk.ugo.v1.model.ListQuotasRequest;
import com.huaweicloud.sdk.ugo.v1.model.ListQuotasResponse;
import com.huaweicloud.sdk.ugo.v1.model.ListSyntaxConversionProgressRequest;
import com.huaweicloud.sdk.ugo.v1.model.ListSyntaxConversionProgressResponse;
import com.huaweicloud.sdk.ugo.v1.model.ListVerificationProgressRequest;
import com.huaweicloud.sdk.ugo.v1.model.ListVerificationProgressResponse;
import com.huaweicloud.sdk.ugo.v1.model.RunSqlConversionRequest;
import com.huaweicloud.sdk.ugo.v1.model.RunSqlConversionResponse;
import com.huaweicloud.sdk.ugo.v1.model.ShowApiVersionInfoRequest;
import com.huaweicloud.sdk.ugo.v1.model.ShowApiVersionInfoResponse;
import com.huaweicloud.sdk.ugo.v1.model.ShowEvaluationProjectDetailRequest;
import com.huaweicloud.sdk.ugo.v1.model.ShowEvaluationProjectDetailResponse;
import com.huaweicloud.sdk.ugo.v1.model.ShowEvaluationProjectStatusRequest;
import com.huaweicloud.sdk.ugo.v1.model.ShowEvaluationProjectStatusResponse;
import com.huaweicloud.sdk.ugo.v1.model.ShowMigrationProjectDetailRequest;
import com.huaweicloud.sdk.ugo.v1.model.ShowMigrationProjectDetailResponse;
import com.huaweicloud.sdk.ugo.v1.model.ShowMigrationProjectStatusRequest;
import com.huaweicloud.sdk.ugo.v1.model.ShowMigrationProjectStatusResponse;
import com.huaweicloud.sdk.ugo.v1.model.SqlConvertReq;

@SuppressWarnings("unchecked")
public class UgoMeta {

    public static final HttpRequestDef<CheckPermissionRequest, CheckPermissionResponse> checkPermission =
        genForCheckPermission();

    private static HttpRequestDef<CheckPermissionRequest, CheckPermissionResponse> genForCheckPermission() {
        // basic
        HttpRequestDef.Builder<CheckPermissionRequest, CheckPermissionResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CheckPermissionRequest.class, CheckPermissionResponse.class)
                .withName("CheckPermission")
                .withUri("/v1/{project_id}/migration-projects/{migration_project_id}/permission-check")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("migration_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CheckPermissionRequest::getMigrationProjectId,
                CheckPermissionRequest::setMigrationProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CommitSyntaxConversionRequest, CommitSyntaxConversionResponse> commitSyntaxConversion =
        genForCommitSyntaxConversion();

    private static HttpRequestDef<CommitSyntaxConversionRequest, CommitSyntaxConversionResponse> genForCommitSyntaxConversion() {
        // basic
        HttpRequestDef.Builder<CommitSyntaxConversionRequest, CommitSyntaxConversionResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CommitSyntaxConversionRequest.class, CommitSyntaxConversionResponse.class)
            .withName("CommitSyntaxConversion")
            .withUri("/v1/{project_id}/migration-projects/{migration_project_id}/syntax-conversion")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("migration_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CommitSyntaxConversionRequest::getMigrationProjectId,
                CommitSyntaxConversionRequest::setMigrationProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CommitVerificationRequest, CommitVerificationResponse> commitVerification =
        genForCommitVerification();

    private static HttpRequestDef<CommitVerificationRequest, CommitVerificationResponse> genForCommitVerification() {
        // basic
        HttpRequestDef.Builder<CommitVerificationRequest, CommitVerificationResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CommitVerificationRequest.class, CommitVerificationResponse.class)
                .withName("CommitVerification")
                .withUri("/v1/{project_id}/migration-projects/{migration_project_id}/verification")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("migration_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CommitVerificationRequest::getMigrationProjectId,
                CommitVerificationRequest::setMigrationProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ConfirmTargetDbTypeRequest, ConfirmTargetDbTypeResponse> confirmTargetDbType =
        genForConfirmTargetDbType();

    private static HttpRequestDef<ConfirmTargetDbTypeRequest, ConfirmTargetDbTypeResponse> genForConfirmTargetDbType() {
        // basic
        HttpRequestDef.Builder<ConfirmTargetDbTypeRequest, ConfirmTargetDbTypeResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ConfirmTargetDbTypeRequest.class, ConfirmTargetDbTypeResponse.class)
                .withName("ConfirmTargetDbType")
                .withUri("/v1/{project_id}/evaluation-projects/target-confirmation")
                .withContentType("application/json");

        // requests
        builder.<ConfirmTargetDBReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ConfirmTargetDBReq.class),
            f -> f.withMarshaller(ConfirmTargetDbTypeRequest::getBody, ConfirmTargetDbTypeRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateEvaluationProjectRequest, CreateEvaluationProjectResponse> createEvaluationProject =
        genForCreateEvaluationProject();

    private static HttpRequestDef<CreateEvaluationProjectRequest, CreateEvaluationProjectResponse> genForCreateEvaluationProject() {
        // basic
        HttpRequestDef.Builder<CreateEvaluationProjectRequest, CreateEvaluationProjectResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateEvaluationProjectRequest.class, CreateEvaluationProjectResponse.class)
            .withName("CreateEvaluationProject")
            .withUri("/v1/{project_id}/evaluation-projects")
            .withContentType("application/json");

        // requests
        builder.<CreateEvaluationProjectReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateEvaluationProjectReq.class),
            f -> f.withMarshaller(CreateEvaluationProjectRequest::getBody, CreateEvaluationProjectRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateMigrationProjectRequest, CreateMigrationProjectResponse> createMigrationProject =
        genForCreateMigrationProject();

    private static HttpRequestDef<CreateMigrationProjectRequest, CreateMigrationProjectResponse> genForCreateMigrationProject() {
        // basic
        HttpRequestDef.Builder<CreateMigrationProjectRequest, CreateMigrationProjectResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateMigrationProjectRequest.class, CreateMigrationProjectResponse.class)
            .withName("CreateMigrationProject")
            .withUri("/v1/{project_id}/migration-projects")
            .withContentType("application/json");

        // requests
        builder.<CreateMigrationProject>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateMigrationProject.class),
            f -> f.withMarshaller(CreateMigrationProjectRequest::getBody, CreateMigrationProjectRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteEvaluationProjectRequest, DeleteEvaluationProjectResponse> deleteEvaluationProject =
        genForDeleteEvaluationProject();

    private static HttpRequestDef<DeleteEvaluationProjectRequest, DeleteEvaluationProjectResponse> genForDeleteEvaluationProject() {
        // basic
        HttpRequestDef.Builder<DeleteEvaluationProjectRequest, DeleteEvaluationProjectResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteEvaluationProjectRequest.class, DeleteEvaluationProjectResponse.class)
            .withName("DeleteEvaluationProject")
            .withUri("/v1/{project_id}/evaluation-projects/{evaluation_project_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("evaluation_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteEvaluationProjectRequest::getEvaluationProjectId,
                DeleteEvaluationProjectRequest::setEvaluationProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteMigrationProjectRequest, DeleteMigrationProjectResponse> deleteMigrationProject =
        genForDeleteMigrationProject();

    private static HttpRequestDef<DeleteMigrationProjectRequest, DeleteMigrationProjectResponse> genForDeleteMigrationProject() {
        // basic
        HttpRequestDef.Builder<DeleteMigrationProjectRequest, DeleteMigrationProjectResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteMigrationProjectRequest.class, DeleteMigrationProjectResponse.class)
            .withName("DeleteMigrationProject")
            .withUri("/v1/{project_id}/migration-projects/{migration_project_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("migration_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteMigrationProjectRequest::getMigrationProjectId,
                DeleteMigrationProjectRequest::setMigrationProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DownloadFailureReportRequest, DownloadFailureReportResponse> downloadFailureReport =
        genForDownloadFailureReport();

    private static HttpRequestDef<DownloadFailureReportRequest, DownloadFailureReportResponse> genForDownloadFailureReport() {
        // basic
        HttpRequestDef.Builder<DownloadFailureReportRequest, DownloadFailureReportResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, DownloadFailureReportRequest.class, DownloadFailureReportResponse.class)
            .withName("DownloadFailureReport")
            .withUri("/v1/{project_id}/migration-projects/{migration_project_id}/download-failure-report")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("migration_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DownloadFailureReportRequest::getMigrationProjectId,
                DownloadFailureReportRequest::setMigrationProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListEvaluationProjectsRequest, ListEvaluationProjectsResponse> listEvaluationProjects =
        genForListEvaluationProjects();

    private static HttpRequestDef<ListEvaluationProjectsRequest, ListEvaluationProjectsResponse> genForListEvaluationProjects() {
        // basic
        HttpRequestDef.Builder<ListEvaluationProjectsRequest, ListEvaluationProjectsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListEvaluationProjectsRequest.class, ListEvaluationProjectsResponse.class)
            .withName("ListEvaluationProjects")
            .withUri("/v1/{project_id}/evaluation-projects")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("evaluation_project_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEvaluationProjectsRequest::getEvaluationProjectName,
                ListEvaluationProjectsRequest::setEvaluationProjectName));
        builder.<ListEvaluationProjectsRequest.EvaluationProjectStatusEnum>withRequestField("evaluation_project_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListEvaluationProjectsRequest.EvaluationProjectStatusEnum.class),
            f -> f.withMarshaller(ListEvaluationProjectsRequest::getEvaluationProjectStatus,
                ListEvaluationProjectsRequest::setEvaluationProjectStatus));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEvaluationProjectsRequest::getOffset, ListEvaluationProjectsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEvaluationProjectsRequest::getLimit, ListEvaluationProjectsRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListMigrationProjectsRequest, ListMigrationProjectsResponse> listMigrationProjects =
        genForListMigrationProjects();

    private static HttpRequestDef<ListMigrationProjectsRequest, ListMigrationProjectsResponse> genForListMigrationProjects() {
        // basic
        HttpRequestDef.Builder<ListMigrationProjectsRequest, ListMigrationProjectsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListMigrationProjectsRequest.class, ListMigrationProjectsResponse.class)
            .withName("ListMigrationProjects")
            .withUri("/v1/{project_id}/migration-projects")
            .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListMigrationProjectsRequest::getOffset, ListMigrationProjectsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListMigrationProjectsRequest::getLimit, ListMigrationProjectsRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPermissionCheckResultRequest, ListPermissionCheckResultResponse> listPermissionCheckResult =
        genForListPermissionCheckResult();

    private static HttpRequestDef<ListPermissionCheckResultRequest, ListPermissionCheckResultResponse> genForListPermissionCheckResult() {
        // basic
        HttpRequestDef.Builder<ListPermissionCheckResultRequest, ListPermissionCheckResultResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListPermissionCheckResultRequest.class,
                    ListPermissionCheckResultResponse.class)
                .withName("ListPermissionCheckResult")
                .withUri("/v1/{project_id}/migration-projects/{migration_project_id}/permission-result")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("migration_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPermissionCheckResultRequest::getMigrationProjectId,
                ListPermissionCheckResultRequest::setMigrationProjectId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPermissionCheckResultRequest::getOffset,
                ListPermissionCheckResultRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPermissionCheckResultRequest::getLimit,
                ListPermissionCheckResultRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListQuotasRequest, ListQuotasResponse> listQuotas = genForListQuotas();

    private static HttpRequestDef<ListQuotasRequest, ListQuotasResponse> genForListQuotas() {
        // basic
        HttpRequestDef.Builder<ListQuotasRequest, ListQuotasResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListQuotasRequest.class, ListQuotasResponse.class)
                .withName("ListQuotas")
                .withUri("/v1/{project_id}/quotas")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSyntaxConversionProgressRequest, ListSyntaxConversionProgressResponse> listSyntaxConversionProgress =
        genForListSyntaxConversionProgress();

    private static HttpRequestDef<ListSyntaxConversionProgressRequest, ListSyntaxConversionProgressResponse> genForListSyntaxConversionProgress() {
        // basic
        HttpRequestDef.Builder<ListSyntaxConversionProgressRequest, ListSyntaxConversionProgressResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListSyntaxConversionProgressRequest.class,
                    ListSyntaxConversionProgressResponse.class)
                .withName("ListSyntaxConversionProgress")
                .withUri("/v1/{project_id}/migration-projects/{migration_project_id}/syntax-conversion-progress")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("migration_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSyntaxConversionProgressRequest::getMigrationProjectId,
                ListSyntaxConversionProgressRequest::setMigrationProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListVerificationProgressRequest, ListVerificationProgressResponse> listVerificationProgress =
        genForListVerificationProgress();

    private static HttpRequestDef<ListVerificationProgressRequest, ListVerificationProgressResponse> genForListVerificationProgress() {
        // basic
        HttpRequestDef.Builder<ListVerificationProgressRequest, ListVerificationProgressResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ListVerificationProgressRequest.class, ListVerificationProgressResponse.class)
                .withName("ListVerificationProgress")
                .withUri("/v1/{project_id}/migration-projects/{migration_project_id}/verification-progress")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("migration_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVerificationProgressRequest::getMigrationProjectId,
                ListVerificationProgressRequest::setMigrationProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowEvaluationProjectDetailRequest, ShowEvaluationProjectDetailResponse> showEvaluationProjectDetail =
        genForShowEvaluationProjectDetail();

    private static HttpRequestDef<ShowEvaluationProjectDetailRequest, ShowEvaluationProjectDetailResponse> genForShowEvaluationProjectDetail() {
        // basic
        HttpRequestDef.Builder<ShowEvaluationProjectDetailRequest, ShowEvaluationProjectDetailResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowEvaluationProjectDetailRequest.class,
                    ShowEvaluationProjectDetailResponse.class)
                .withName("ShowEvaluationProjectDetail")
                .withUri("/v1/{project_id}/evaluation-projects/{evaluation_project_id}/detail")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("evaluation_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowEvaluationProjectDetailRequest::getEvaluationProjectId,
                ShowEvaluationProjectDetailRequest::setEvaluationProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowEvaluationProjectStatusRequest, ShowEvaluationProjectStatusResponse> showEvaluationProjectStatus =
        genForShowEvaluationProjectStatus();

    private static HttpRequestDef<ShowEvaluationProjectStatusRequest, ShowEvaluationProjectStatusResponse> genForShowEvaluationProjectStatus() {
        // basic
        HttpRequestDef.Builder<ShowEvaluationProjectStatusRequest, ShowEvaluationProjectStatusResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowEvaluationProjectStatusRequest.class,
                    ShowEvaluationProjectStatusResponse.class)
                .withName("ShowEvaluationProjectStatus")
                .withUri("/v1/{project_id}/evaluation-projects/{evaluation_project_id}/status")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("evaluation_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowEvaluationProjectStatusRequest::getEvaluationProjectId,
                ShowEvaluationProjectStatusRequest::setEvaluationProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowMigrationProjectDetailRequest, ShowMigrationProjectDetailResponse> showMigrationProjectDetail =
        genForShowMigrationProjectDetail();

    private static HttpRequestDef<ShowMigrationProjectDetailRequest, ShowMigrationProjectDetailResponse> genForShowMigrationProjectDetail() {
        // basic
        HttpRequestDef.Builder<ShowMigrationProjectDetailRequest, ShowMigrationProjectDetailResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowMigrationProjectDetailRequest.class,
                    ShowMigrationProjectDetailResponse.class)
                .withName("ShowMigrationProjectDetail")
                .withUri("/v1/{project_id}/migration-projects/{migration_project_id}/detail")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("migration_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMigrationProjectDetailRequest::getMigrationProjectId,
                ShowMigrationProjectDetailRequest::setMigrationProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowMigrationProjectStatusRequest, ShowMigrationProjectStatusResponse> showMigrationProjectStatus =
        genForShowMigrationProjectStatus();

    private static HttpRequestDef<ShowMigrationProjectStatusRequest, ShowMigrationProjectStatusResponse> genForShowMigrationProjectStatus() {
        // basic
        HttpRequestDef.Builder<ShowMigrationProjectStatusRequest, ShowMigrationProjectStatusResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowMigrationProjectStatusRequest.class,
                    ShowMigrationProjectStatusResponse.class)
                .withName("ShowMigrationProjectStatus")
                .withUri("/v1/{project_id}/migration-projects/{migration_project_id}/status")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("migration_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMigrationProjectStatusRequest::getMigrationProjectId,
                ShowMigrationProjectStatusRequest::setMigrationProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListApiVersionsRequest, ListApiVersionsResponse> listApiVersions =
        genForListApiVersions();

    private static HttpRequestDef<ListApiVersionsRequest, ListApiVersionsResponse> genForListApiVersions() {
        // basic
        HttpRequestDef.Builder<ListApiVersionsRequest, ListApiVersionsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListApiVersionsRequest.class, ListApiVersionsResponse.class)
                .withName("ListApiVersions")
                .withUri("/")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowApiVersionInfoRequest, ShowApiVersionInfoResponse> showApiVersionInfo =
        genForShowApiVersionInfo();

    private static HttpRequestDef<ShowApiVersionInfoRequest, ShowApiVersionInfoResponse> genForShowApiVersionInfo() {
        // basic
        HttpRequestDef.Builder<ShowApiVersionInfoRequest, ShowApiVersionInfoResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowApiVersionInfoRequest.class, ShowApiVersionInfoResponse.class)
                .withName("ShowApiVersionInfo")
                .withUri("/{api_version}")
                .withContentType("application/json");

        // requests
        builder.<ShowApiVersionInfoRequest.ApiVersionEnum>withRequestField("api_version",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ShowApiVersionInfoRequest.ApiVersionEnum.class),
            f -> f.withMarshaller(ShowApiVersionInfoRequest::getApiVersion, ShowApiVersionInfoRequest::setApiVersion));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RunSqlConversionRequest, RunSqlConversionResponse> runSqlConversion =
        genForRunSqlConversion();

    private static HttpRequestDef<RunSqlConversionRequest, RunSqlConversionResponse> genForRunSqlConversion() {
        // basic
        HttpRequestDef.Builder<RunSqlConversionRequest, RunSqlConversionResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RunSqlConversionRequest.class, RunSqlConversionResponse.class)
                .withName("RunSqlConversion")
                .withUri("/v1/{project_id}/sql-conversion")
                .withContentType("application/json");

        // requests
        builder.<SqlConvertReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SqlConvertReq.class),
            f -> f.withMarshaller(RunSqlConversionRequest::getBody, RunSqlConversionRequest::setBody));

        // response

        return builder.build();
    }

}
