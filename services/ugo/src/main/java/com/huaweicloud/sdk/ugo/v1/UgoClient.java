package com.huaweicloud.sdk.ugo.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.ugo.v1.model.*;

public class UgoClient {

    protected HcClient hcClient;

    public UgoClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<UgoClient> newBuilder() {
        return new ClientBuilder<>(UgoClient::new);
    }

    /**
     * 目标库权限检查。
     *
     * 目标库权限检查。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CheckPermissionRequest 请求对象
     * @return CheckPermissionResponse
     */
    public CheckPermissionResponse checkPermission(CheckPermissionRequest request) {
        return hcClient.syncInvokeHttp(request, UgoMeta.checkPermission);
    }

    /**
     * 目标库权限检查。
     *
     * 目标库权限检查。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CheckPermissionRequest 请求对象
     * @return SyncInvoker<CheckPermissionRequest, CheckPermissionResponse>
     */
    public SyncInvoker<CheckPermissionRequest, CheckPermissionResponse> checkPermissionInvoker(
        CheckPermissionRequest request) {
        return new SyncInvoker<CheckPermissionRequest, CheckPermissionResponse>(request, UgoMeta.checkPermission,
            hcClient);
    }

    /**
     * 提交语法转换
     *
     * 提交语法转换。只有migration_project_status为\&quot;READY\&quot;时才能调用该接口。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CommitSyntaxConversionRequest 请求对象
     * @return CommitSyntaxConversionResponse
     */
    public CommitSyntaxConversionResponse commitSyntaxConversion(CommitSyntaxConversionRequest request) {
        return hcClient.syncInvokeHttp(request, UgoMeta.commitSyntaxConversion);
    }

    /**
     * 提交语法转换
     *
     * 提交语法转换。只有migration_project_status为\&quot;READY\&quot;时才能调用该接口。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CommitSyntaxConversionRequest 请求对象
     * @return SyncInvoker<CommitSyntaxConversionRequest, CommitSyntaxConversionResponse>
     */
    public SyncInvoker<CommitSyntaxConversionRequest, CommitSyntaxConversionResponse> commitSyntaxConversionInvoker(
        CommitSyntaxConversionRequest request) {
        return new SyncInvoker<CommitSyntaxConversionRequest, CommitSyntaxConversionResponse>(request,
            UgoMeta.commitSyntaxConversion, hcClient);
    }

    /**
     * 提交验证。
     *
     * 提交验证。语法转换完成后，才能调用该接口。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CommitVerificationRequest 请求对象
     * @return CommitVerificationResponse
     */
    public CommitVerificationResponse commitVerification(CommitVerificationRequest request) {
        return hcClient.syncInvokeHttp(request, UgoMeta.commitVerification);
    }

    /**
     * 提交验证。
     *
     * 提交验证。语法转换完成后，才能调用该接口。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CommitVerificationRequest 请求对象
     * @return SyncInvoker<CommitVerificationRequest, CommitVerificationResponse>
     */
    public SyncInvoker<CommitVerificationRequest, CommitVerificationResponse> commitVerificationInvoker(
        CommitVerificationRequest request) {
        return new SyncInvoker<CommitVerificationRequest, CommitVerificationResponse>(request,
            UgoMeta.commitVerification, hcClient);
    }

    /**
     * 评估项目确认目标数据库类型。
     *
     * 评估项目确认目标数据库类型。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ConfirmTargetDbTypeRequest 请求对象
     * @return ConfirmTargetDbTypeResponse
     */
    public ConfirmTargetDbTypeResponse confirmTargetDbType(ConfirmTargetDbTypeRequest request) {
        return hcClient.syncInvokeHttp(request, UgoMeta.confirmTargetDbType);
    }

    /**
     * 评估项目确认目标数据库类型。
     *
     * 评估项目确认目标数据库类型。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ConfirmTargetDbTypeRequest 请求对象
     * @return SyncInvoker<ConfirmTargetDbTypeRequest, ConfirmTargetDbTypeResponse>
     */
    public SyncInvoker<ConfirmTargetDbTypeRequest, ConfirmTargetDbTypeResponse> confirmTargetDbTypeInvoker(
        ConfirmTargetDbTypeRequest request) {
        return new SyncInvoker<ConfirmTargetDbTypeRequest, ConfirmTargetDbTypeResponse>(request,
            UgoMeta.confirmTargetDbType, hcClient);
    }

    /**
     * 创建评估项目。
     *
     * 创建评估项目。评估项目分2个阶段：采集、评估。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateEvaluationProjectRequest 请求对象
     * @return CreateEvaluationProjectResponse
     */
    public CreateEvaluationProjectResponse createEvaluationProject(CreateEvaluationProjectRequest request) {
        return hcClient.syncInvokeHttp(request, UgoMeta.createEvaluationProject);
    }

    /**
     * 创建评估项目。
     *
     * 创建评估项目。评估项目分2个阶段：采集、评估。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateEvaluationProjectRequest 请求对象
     * @return SyncInvoker<CreateEvaluationProjectRequest, CreateEvaluationProjectResponse>
     */
    public SyncInvoker<CreateEvaluationProjectRequest, CreateEvaluationProjectResponse> createEvaluationProjectInvoker(
        CreateEvaluationProjectRequest request) {
        return new SyncInvoker<CreateEvaluationProjectRequest, CreateEvaluationProjectResponse>(request,
            UgoMeta.createEvaluationProject, hcClient);
    }

    /**
     * 创建迁移项目。
     *
     * 创建迁移项目。创建迁移项目需要关联状态为“COMPLETED”的评估项目。迁移项目依次经历以下几个阶段：目标库权限检查、语法转换、验证、下载迁移失败的报告、删除。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateMigrationProjectRequest 请求对象
     * @return CreateMigrationProjectResponse
     */
    public CreateMigrationProjectResponse createMigrationProject(CreateMigrationProjectRequest request) {
        return hcClient.syncInvokeHttp(request, UgoMeta.createMigrationProject);
    }

    /**
     * 创建迁移项目。
     *
     * 创建迁移项目。创建迁移项目需要关联状态为“COMPLETED”的评估项目。迁移项目依次经历以下几个阶段：目标库权限检查、语法转换、验证、下载迁移失败的报告、删除。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateMigrationProjectRequest 请求对象
     * @return SyncInvoker<CreateMigrationProjectRequest, CreateMigrationProjectResponse>
     */
    public SyncInvoker<CreateMigrationProjectRequest, CreateMigrationProjectResponse> createMigrationProjectInvoker(
        CreateMigrationProjectRequest request) {
        return new SyncInvoker<CreateMigrationProjectRequest, CreateMigrationProjectResponse>(request,
            UgoMeta.createMigrationProject, hcClient);
    }

    /**
     * 删除评估项目。
     *
     * 删除评估项目。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteEvaluationProjectRequest 请求对象
     * @return DeleteEvaluationProjectResponse
     */
    public DeleteEvaluationProjectResponse deleteEvaluationProject(DeleteEvaluationProjectRequest request) {
        return hcClient.syncInvokeHttp(request, UgoMeta.deleteEvaluationProject);
    }

    /**
     * 删除评估项目。
     *
     * 删除评估项目。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteEvaluationProjectRequest 请求对象
     * @return SyncInvoker<DeleteEvaluationProjectRequest, DeleteEvaluationProjectResponse>
     */
    public SyncInvoker<DeleteEvaluationProjectRequest, DeleteEvaluationProjectResponse> deleteEvaluationProjectInvoker(
        DeleteEvaluationProjectRequest request) {
        return new SyncInvoker<DeleteEvaluationProjectRequest, DeleteEvaluationProjectResponse>(request,
            UgoMeta.deleteEvaluationProject, hcClient);
    }

    /**
     * 删除迁移项目
     *
     * 删除迁移项目。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteMigrationProjectRequest 请求对象
     * @return DeleteMigrationProjectResponse
     */
    public DeleteMigrationProjectResponse deleteMigrationProject(DeleteMigrationProjectRequest request) {
        return hcClient.syncInvokeHttp(request, UgoMeta.deleteMigrationProject);
    }

    /**
     * 删除迁移项目
     *
     * 删除迁移项目。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteMigrationProjectRequest 请求对象
     * @return SyncInvoker<DeleteMigrationProjectRequest, DeleteMigrationProjectResponse>
     */
    public SyncInvoker<DeleteMigrationProjectRequest, DeleteMigrationProjectResponse> deleteMigrationProjectInvoker(
        DeleteMigrationProjectRequest request) {
        return new SyncInvoker<DeleteMigrationProjectRequest, DeleteMigrationProjectResponse>(request,
            UgoMeta.deleteMigrationProject, hcClient);
    }

    /**
     * 下载迁移错误报告。
     *
     * 下载迁移错误报告。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DownloadFailureReportRequest 请求对象
     * @return DownloadFailureReportResponse
     */
    public DownloadFailureReportResponse downloadFailureReport(DownloadFailureReportRequest request) {
        return hcClient.syncInvokeHttp(request, UgoMeta.downloadFailureReport);
    }

    /**
     * 下载迁移错误报告。
     *
     * 下载迁移错误报告。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DownloadFailureReportRequest 请求对象
     * @return SyncInvoker<DownloadFailureReportRequest, DownloadFailureReportResponse>
     */
    public SyncInvoker<DownloadFailureReportRequest, DownloadFailureReportResponse> downloadFailureReportInvoker(
        DownloadFailureReportRequest request) {
        return new SyncInvoker<DownloadFailureReportRequest, DownloadFailureReportResponse>(request,
            UgoMeta.downloadFailureReport, hcClient);
    }

    /**
     * 查询评估项目列表。
     *
     * 查询评估项目列表。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListEvaluationProjectsRequest 请求对象
     * @return ListEvaluationProjectsResponse
     */
    public ListEvaluationProjectsResponse listEvaluationProjects(ListEvaluationProjectsRequest request) {
        return hcClient.syncInvokeHttp(request, UgoMeta.listEvaluationProjects);
    }

    /**
     * 查询评估项目列表。
     *
     * 查询评估项目列表。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListEvaluationProjectsRequest 请求对象
     * @return SyncInvoker<ListEvaluationProjectsRequest, ListEvaluationProjectsResponse>
     */
    public SyncInvoker<ListEvaluationProjectsRequest, ListEvaluationProjectsResponse> listEvaluationProjectsInvoker(
        ListEvaluationProjectsRequest request) {
        return new SyncInvoker<ListEvaluationProjectsRequest, ListEvaluationProjectsResponse>(request,
            UgoMeta.listEvaluationProjects, hcClient);
    }

    /**
     * 查询迁移项目列表。
     *
     * 查询迁移项目列表。创建迁移项目之后，调用该接口，根据项目名称，获取项目ID。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListMigrationProjectsRequest 请求对象
     * @return ListMigrationProjectsResponse
     */
    public ListMigrationProjectsResponse listMigrationProjects(ListMigrationProjectsRequest request) {
        return hcClient.syncInvokeHttp(request, UgoMeta.listMigrationProjects);
    }

    /**
     * 查询迁移项目列表。
     *
     * 查询迁移项目列表。创建迁移项目之后，调用该接口，根据项目名称，获取项目ID。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListMigrationProjectsRequest 请求对象
     * @return SyncInvoker<ListMigrationProjectsRequest, ListMigrationProjectsResponse>
     */
    public SyncInvoker<ListMigrationProjectsRequest, ListMigrationProjectsResponse> listMigrationProjectsInvoker(
        ListMigrationProjectsRequest request) {
        return new SyncInvoker<ListMigrationProjectsRequest, ListMigrationProjectsResponse>(request,
            UgoMeta.listMigrationProjects, hcClient);
    }

    /**
     * 查询权限检查结果。
     *
     * 查询权限检查结果。permission_check_status 为 \&quot;SUCCESS\&quot; 或者 \&quot;FAILED\&quot; 时，才能调用该接口。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListPermissionCheckResultRequest 请求对象
     * @return ListPermissionCheckResultResponse
     */
    public ListPermissionCheckResultResponse listPermissionCheckResult(ListPermissionCheckResultRequest request) {
        return hcClient.syncInvokeHttp(request, UgoMeta.listPermissionCheckResult);
    }

    /**
     * 查询权限检查结果。
     *
     * 查询权限检查结果。permission_check_status 为 \&quot;SUCCESS\&quot; 或者 \&quot;FAILED\&quot; 时，才能调用该接口。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListPermissionCheckResultRequest 请求对象
     * @return SyncInvoker<ListPermissionCheckResultRequest, ListPermissionCheckResultResponse>
     */
    public SyncInvoker<ListPermissionCheckResultRequest, ListPermissionCheckResultResponse> listPermissionCheckResultInvoker(
        ListPermissionCheckResultRequest request) {
        return new SyncInvoker<ListPermissionCheckResultRequest, ListPermissionCheckResultResponse>(request,
            UgoMeta.listPermissionCheckResult, hcClient);
    }

    /**
     * 查询配额。
     *
     * 查询单租户的配额，包括评估项目配额、迁移项目配额。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListQuotasRequest 请求对象
     * @return ListQuotasResponse
     */
    public ListQuotasResponse listQuotas(ListQuotasRequest request) {
        return hcClient.syncInvokeHttp(request, UgoMeta.listQuotas);
    }

    /**
     * 查询配额。
     *
     * 查询单租户的配额，包括评估项目配额、迁移项目配额。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListQuotasRequest 请求对象
     * @return SyncInvoker<ListQuotasRequest, ListQuotasResponse>
     */
    public SyncInvoker<ListQuotasRequest, ListQuotasResponse> listQuotasInvoker(ListQuotasRequest request) {
        return new SyncInvoker<ListQuotasRequest, ListQuotasResponse>(request, UgoMeta.listQuotas, hcClient);
    }

    /**
     * 查询语法转换的进度。
     *
     * 查询语法转换的进度。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListSyntaxConversionProgressRequest 请求对象
     * @return ListSyntaxConversionProgressResponse
     */
    public ListSyntaxConversionProgressResponse listSyntaxConversionProgress(
        ListSyntaxConversionProgressRequest request) {
        return hcClient.syncInvokeHttp(request, UgoMeta.listSyntaxConversionProgress);
    }

    /**
     * 查询语法转换的进度。
     *
     * 查询语法转换的进度。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListSyntaxConversionProgressRequest 请求对象
     * @return SyncInvoker<ListSyntaxConversionProgressRequest, ListSyntaxConversionProgressResponse>
     */
    public SyncInvoker<ListSyntaxConversionProgressRequest, ListSyntaxConversionProgressResponse> listSyntaxConversionProgressInvoker(
        ListSyntaxConversionProgressRequest request) {
        return new SyncInvoker<ListSyntaxConversionProgressRequest, ListSyntaxConversionProgressResponse>(request,
            UgoMeta.listSyntaxConversionProgress, hcClient);
    }

    /**
     * 查询验证进度。
     *
     * 查询验证进度。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListVerificationProgressRequest 请求对象
     * @return ListVerificationProgressResponse
     */
    public ListVerificationProgressResponse listVerificationProgress(ListVerificationProgressRequest request) {
        return hcClient.syncInvokeHttp(request, UgoMeta.listVerificationProgress);
    }

    /**
     * 查询验证进度。
     *
     * 查询验证进度。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListVerificationProgressRequest 请求对象
     * @return SyncInvoker<ListVerificationProgressRequest, ListVerificationProgressResponse>
     */
    public SyncInvoker<ListVerificationProgressRequest, ListVerificationProgressResponse> listVerificationProgressInvoker(
        ListVerificationProgressRequest request) {
        return new SyncInvoker<ListVerificationProgressRequest, ListVerificationProgressResponse>(request,
            UgoMeta.listVerificationProgress, hcClient);
    }

    /**
     * 查询评估项目详情。
     *
     * 查询评估项目详情。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowEvaluationProjectDetailRequest 请求对象
     * @return ShowEvaluationProjectDetailResponse
     */
    public ShowEvaluationProjectDetailResponse showEvaluationProjectDetail(ShowEvaluationProjectDetailRequest request) {
        return hcClient.syncInvokeHttp(request, UgoMeta.showEvaluationProjectDetail);
    }

    /**
     * 查询评估项目详情。
     *
     * 查询评估项目详情。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowEvaluationProjectDetailRequest 请求对象
     * @return SyncInvoker<ShowEvaluationProjectDetailRequest, ShowEvaluationProjectDetailResponse>
     */
    public SyncInvoker<ShowEvaluationProjectDetailRequest, ShowEvaluationProjectDetailResponse> showEvaluationProjectDetailInvoker(
        ShowEvaluationProjectDetailRequest request) {
        return new SyncInvoker<ShowEvaluationProjectDetailRequest, ShowEvaluationProjectDetailResponse>(request,
            UgoMeta.showEvaluationProjectDetail, hcClient);
    }

    /**
     * 查询评估项目状态。
     *
     * 查询评估项目状态。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowEvaluationProjectStatusRequest 请求对象
     * @return ShowEvaluationProjectStatusResponse
     */
    public ShowEvaluationProjectStatusResponse showEvaluationProjectStatus(ShowEvaluationProjectStatusRequest request) {
        return hcClient.syncInvokeHttp(request, UgoMeta.showEvaluationProjectStatus);
    }

    /**
     * 查询评估项目状态。
     *
     * 查询评估项目状态。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowEvaluationProjectStatusRequest 请求对象
     * @return SyncInvoker<ShowEvaluationProjectStatusRequest, ShowEvaluationProjectStatusResponse>
     */
    public SyncInvoker<ShowEvaluationProjectStatusRequest, ShowEvaluationProjectStatusResponse> showEvaluationProjectStatusInvoker(
        ShowEvaluationProjectStatusRequest request) {
        return new SyncInvoker<ShowEvaluationProjectStatusRequest, ShowEvaluationProjectStatusResponse>(request,
            UgoMeta.showEvaluationProjectStatus, hcClient);
    }

    /**
     * 查询迁移项目详情。
     *
     * 查询迁移项目详情。只有migration_project_status为\&quot;READY\&quot;时才能调用该接口。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowMigrationProjectDetailRequest 请求对象
     * @return ShowMigrationProjectDetailResponse
     */
    public ShowMigrationProjectDetailResponse showMigrationProjectDetail(ShowMigrationProjectDetailRequest request) {
        return hcClient.syncInvokeHttp(request, UgoMeta.showMigrationProjectDetail);
    }

    /**
     * 查询迁移项目详情。
     *
     * 查询迁移项目详情。只有migration_project_status为\&quot;READY\&quot;时才能调用该接口。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowMigrationProjectDetailRequest 请求对象
     * @return SyncInvoker<ShowMigrationProjectDetailRequest, ShowMigrationProjectDetailResponse>
     */
    public SyncInvoker<ShowMigrationProjectDetailRequest, ShowMigrationProjectDetailResponse> showMigrationProjectDetailInvoker(
        ShowMigrationProjectDetailRequest request) {
        return new SyncInvoker<ShowMigrationProjectDetailRequest, ShowMigrationProjectDetailResponse>(request,
            UgoMeta.showMigrationProjectDetail, hcClient);
    }

    /**
     * 查询迁移项目状态。
     *
     * 查询迁移项目状态。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowMigrationProjectStatusRequest 请求对象
     * @return ShowMigrationProjectStatusResponse
     */
    public ShowMigrationProjectStatusResponse showMigrationProjectStatus(ShowMigrationProjectStatusRequest request) {
        return hcClient.syncInvokeHttp(request, UgoMeta.showMigrationProjectStatus);
    }

    /**
     * 查询迁移项目状态。
     *
     * 查询迁移项目状态。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowMigrationProjectStatusRequest 请求对象
     * @return SyncInvoker<ShowMigrationProjectStatusRequest, ShowMigrationProjectStatusResponse>
     */
    public SyncInvoker<ShowMigrationProjectStatusRequest, ShowMigrationProjectStatusResponse> showMigrationProjectStatusInvoker(
        ShowMigrationProjectStatusRequest request) {
        return new SyncInvoker<ShowMigrationProjectStatusRequest, ShowMigrationProjectStatusResponse>(request,
            UgoMeta.showMigrationProjectStatus, hcClient);
    }

    /**
     * 查询API版本信息列表。
     *
     * 查询API版本信息列表。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListApiVersionsRequest 请求对象
     * @return ListApiVersionsResponse
     */
    public ListApiVersionsResponse listApiVersions(ListApiVersionsRequest request) {
        return hcClient.syncInvokeHttp(request, UgoMeta.listApiVersions);
    }

    /**
     * 查询API版本信息列表。
     *
     * 查询API版本信息列表。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListApiVersionsRequest 请求对象
     * @return SyncInvoker<ListApiVersionsRequest, ListApiVersionsResponse>
     */
    public SyncInvoker<ListApiVersionsRequest, ListApiVersionsResponse> listApiVersionsInvoker(
        ListApiVersionsRequest request) {
        return new SyncInvoker<ListApiVersionsRequest, ListApiVersionsResponse>(request, UgoMeta.listApiVersions,
            hcClient);
    }

    /**
     * 查询指定版本号的API版本信息。
     *
     * 查询指定版本号的API版本信息。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowApiVersionInfoRequest 请求对象
     * @return ShowApiVersionInfoResponse
     */
    public ShowApiVersionInfoResponse showApiVersionInfo(ShowApiVersionInfoRequest request) {
        return hcClient.syncInvokeHttp(request, UgoMeta.showApiVersionInfo);
    }

    /**
     * 查询指定版本号的API版本信息。
     *
     * 查询指定版本号的API版本信息。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowApiVersionInfoRequest 请求对象
     * @return SyncInvoker<ShowApiVersionInfoRequest, ShowApiVersionInfoResponse>
     */
    public SyncInvoker<ShowApiVersionInfoRequest, ShowApiVersionInfoResponse> showApiVersionInfoInvoker(
        ShowApiVersionInfoRequest request) {
        return new SyncInvoker<ShowApiVersionInfoRequest, ShowApiVersionInfoResponse>(request,
            UgoMeta.showApiVersionInfo, hcClient);
    }

    /**
     * SQL语句转换。
     *
     * SQL语句转换。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RunSqlConversionRequest 请求对象
     * @return RunSqlConversionResponse
     */
    public RunSqlConversionResponse runSqlConversion(RunSqlConversionRequest request) {
        return hcClient.syncInvokeHttp(request, UgoMeta.runSqlConversion);
    }

    /**
     * SQL语句转换。
     *
     * SQL语句转换。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RunSqlConversionRequest 请求对象
     * @return SyncInvoker<RunSqlConversionRequest, RunSqlConversionResponse>
     */
    public SyncInvoker<RunSqlConversionRequest, RunSqlConversionResponse> runSqlConversionInvoker(
        RunSqlConversionRequest request) {
        return new SyncInvoker<RunSqlConversionRequest, RunSqlConversionResponse>(request, UgoMeta.runSqlConversion,
            hcClient);
    }

}
