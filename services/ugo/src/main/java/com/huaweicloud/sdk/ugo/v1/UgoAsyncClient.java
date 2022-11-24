package com.huaweicloud.sdk.ugo.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.ugo.v1.model.*;

import java.util.concurrent.CompletableFuture;

public class UgoAsyncClient {

    protected HcClient hcClient;

    public UgoAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<UgoAsyncClient> newBuilder() {
        return new ClientBuilder<>(UgoAsyncClient::new);
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
     * @return CompletableFuture<CheckPermissionResponse>
     */
    public CompletableFuture<CheckPermissionResponse> checkPermissionAsync(CheckPermissionRequest request) {
        return hcClient.asyncInvokeHttp(request, UgoMeta.checkPermission);
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
     * @return AsyncInvoker<CheckPermissionRequest, CheckPermissionResponse>
     */
    public AsyncInvoker<CheckPermissionRequest, CheckPermissionResponse> checkPermissionAsyncInvoker(
        CheckPermissionRequest request) {
        return new AsyncInvoker<CheckPermissionRequest, CheckPermissionResponse>(request, UgoMeta.checkPermission,
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
     * @return CompletableFuture<CommitSyntaxConversionResponse>
     */
    public CompletableFuture<CommitSyntaxConversionResponse> commitSyntaxConversionAsync(
        CommitSyntaxConversionRequest request) {
        return hcClient.asyncInvokeHttp(request, UgoMeta.commitSyntaxConversion);
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
     * @return AsyncInvoker<CommitSyntaxConversionRequest, CommitSyntaxConversionResponse>
     */
    public AsyncInvoker<CommitSyntaxConversionRequest, CommitSyntaxConversionResponse> commitSyntaxConversionAsyncInvoker(
        CommitSyntaxConversionRequest request) {
        return new AsyncInvoker<CommitSyntaxConversionRequest, CommitSyntaxConversionResponse>(request,
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
     * @return CompletableFuture<CommitVerificationResponse>
     */
    public CompletableFuture<CommitVerificationResponse> commitVerificationAsync(CommitVerificationRequest request) {
        return hcClient.asyncInvokeHttp(request, UgoMeta.commitVerification);
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
     * @return AsyncInvoker<CommitVerificationRequest, CommitVerificationResponse>
     */
    public AsyncInvoker<CommitVerificationRequest, CommitVerificationResponse> commitVerificationAsyncInvoker(
        CommitVerificationRequest request) {
        return new AsyncInvoker<CommitVerificationRequest, CommitVerificationResponse>(request,
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
     * @return CompletableFuture<ConfirmTargetDbTypeResponse>
     */
    public CompletableFuture<ConfirmTargetDbTypeResponse> confirmTargetDbTypeAsync(ConfirmTargetDbTypeRequest request) {
        return hcClient.asyncInvokeHttp(request, UgoMeta.confirmTargetDbType);
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
     * @return AsyncInvoker<ConfirmTargetDbTypeRequest, ConfirmTargetDbTypeResponse>
     */
    public AsyncInvoker<ConfirmTargetDbTypeRequest, ConfirmTargetDbTypeResponse> confirmTargetDbTypeAsyncInvoker(
        ConfirmTargetDbTypeRequest request) {
        return new AsyncInvoker<ConfirmTargetDbTypeRequest, ConfirmTargetDbTypeResponse>(request,
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
     * @return CompletableFuture<CreateEvaluationProjectResponse>
     */
    public CompletableFuture<CreateEvaluationProjectResponse> createEvaluationProjectAsync(
        CreateEvaluationProjectRequest request) {
        return hcClient.asyncInvokeHttp(request, UgoMeta.createEvaluationProject);
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
     * @return AsyncInvoker<CreateEvaluationProjectRequest, CreateEvaluationProjectResponse>
     */
    public AsyncInvoker<CreateEvaluationProjectRequest, CreateEvaluationProjectResponse> createEvaluationProjectAsyncInvoker(
        CreateEvaluationProjectRequest request) {
        return new AsyncInvoker<CreateEvaluationProjectRequest, CreateEvaluationProjectResponse>(request,
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
     * @return CompletableFuture<CreateMigrationProjectResponse>
     */
    public CompletableFuture<CreateMigrationProjectResponse> createMigrationProjectAsync(
        CreateMigrationProjectRequest request) {
        return hcClient.asyncInvokeHttp(request, UgoMeta.createMigrationProject);
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
     * @return AsyncInvoker<CreateMigrationProjectRequest, CreateMigrationProjectResponse>
     */
    public AsyncInvoker<CreateMigrationProjectRequest, CreateMigrationProjectResponse> createMigrationProjectAsyncInvoker(
        CreateMigrationProjectRequest request) {
        return new AsyncInvoker<CreateMigrationProjectRequest, CreateMigrationProjectResponse>(request,
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
     * @return CompletableFuture<DeleteEvaluationProjectResponse>
     */
    public CompletableFuture<DeleteEvaluationProjectResponse> deleteEvaluationProjectAsync(
        DeleteEvaluationProjectRequest request) {
        return hcClient.asyncInvokeHttp(request, UgoMeta.deleteEvaluationProject);
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
     * @return AsyncInvoker<DeleteEvaluationProjectRequest, DeleteEvaluationProjectResponse>
     */
    public AsyncInvoker<DeleteEvaluationProjectRequest, DeleteEvaluationProjectResponse> deleteEvaluationProjectAsyncInvoker(
        DeleteEvaluationProjectRequest request) {
        return new AsyncInvoker<DeleteEvaluationProjectRequest, DeleteEvaluationProjectResponse>(request,
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
     * @return CompletableFuture<DeleteMigrationProjectResponse>
     */
    public CompletableFuture<DeleteMigrationProjectResponse> deleteMigrationProjectAsync(
        DeleteMigrationProjectRequest request) {
        return hcClient.asyncInvokeHttp(request, UgoMeta.deleteMigrationProject);
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
     * @return AsyncInvoker<DeleteMigrationProjectRequest, DeleteMigrationProjectResponse>
     */
    public AsyncInvoker<DeleteMigrationProjectRequest, DeleteMigrationProjectResponse> deleteMigrationProjectAsyncInvoker(
        DeleteMigrationProjectRequest request) {
        return new AsyncInvoker<DeleteMigrationProjectRequest, DeleteMigrationProjectResponse>(request,
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
     * @return CompletableFuture<DownloadFailureReportResponse>
     */
    public CompletableFuture<DownloadFailureReportResponse> downloadFailureReportAsync(
        DownloadFailureReportRequest request) {
        return hcClient.asyncInvokeHttp(request, UgoMeta.downloadFailureReport);
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
     * @return AsyncInvoker<DownloadFailureReportRequest, DownloadFailureReportResponse>
     */
    public AsyncInvoker<DownloadFailureReportRequest, DownloadFailureReportResponse> downloadFailureReportAsyncInvoker(
        DownloadFailureReportRequest request) {
        return new AsyncInvoker<DownloadFailureReportRequest, DownloadFailureReportResponse>(request,
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
     * @return CompletableFuture<ListEvaluationProjectsResponse>
     */
    public CompletableFuture<ListEvaluationProjectsResponse> listEvaluationProjectsAsync(
        ListEvaluationProjectsRequest request) {
        return hcClient.asyncInvokeHttp(request, UgoMeta.listEvaluationProjects);
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
     * @return AsyncInvoker<ListEvaluationProjectsRequest, ListEvaluationProjectsResponse>
     */
    public AsyncInvoker<ListEvaluationProjectsRequest, ListEvaluationProjectsResponse> listEvaluationProjectsAsyncInvoker(
        ListEvaluationProjectsRequest request) {
        return new AsyncInvoker<ListEvaluationProjectsRequest, ListEvaluationProjectsResponse>(request,
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
     * @return CompletableFuture<ListMigrationProjectsResponse>
     */
    public CompletableFuture<ListMigrationProjectsResponse> listMigrationProjectsAsync(
        ListMigrationProjectsRequest request) {
        return hcClient.asyncInvokeHttp(request, UgoMeta.listMigrationProjects);
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
     * @return AsyncInvoker<ListMigrationProjectsRequest, ListMigrationProjectsResponse>
     */
    public AsyncInvoker<ListMigrationProjectsRequest, ListMigrationProjectsResponse> listMigrationProjectsAsyncInvoker(
        ListMigrationProjectsRequest request) {
        return new AsyncInvoker<ListMigrationProjectsRequest, ListMigrationProjectsResponse>(request,
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
     * @return CompletableFuture<ListPermissionCheckResultResponse>
     */
    public CompletableFuture<ListPermissionCheckResultResponse> listPermissionCheckResultAsync(
        ListPermissionCheckResultRequest request) {
        return hcClient.asyncInvokeHttp(request, UgoMeta.listPermissionCheckResult);
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
     * @return AsyncInvoker<ListPermissionCheckResultRequest, ListPermissionCheckResultResponse>
     */
    public AsyncInvoker<ListPermissionCheckResultRequest, ListPermissionCheckResultResponse> listPermissionCheckResultAsyncInvoker(
        ListPermissionCheckResultRequest request) {
        return new AsyncInvoker<ListPermissionCheckResultRequest, ListPermissionCheckResultResponse>(request,
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
     * @return CompletableFuture<ListQuotasResponse>
     */
    public CompletableFuture<ListQuotasResponse> listQuotasAsync(ListQuotasRequest request) {
        return hcClient.asyncInvokeHttp(request, UgoMeta.listQuotas);
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
     * @return AsyncInvoker<ListQuotasRequest, ListQuotasResponse>
     */
    public AsyncInvoker<ListQuotasRequest, ListQuotasResponse> listQuotasAsyncInvoker(ListQuotasRequest request) {
        return new AsyncInvoker<ListQuotasRequest, ListQuotasResponse>(request, UgoMeta.listQuotas, hcClient);
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
     * @return CompletableFuture<ListSyntaxConversionProgressResponse>
     */
    public CompletableFuture<ListSyntaxConversionProgressResponse> listSyntaxConversionProgressAsync(
        ListSyntaxConversionProgressRequest request) {
        return hcClient.asyncInvokeHttp(request, UgoMeta.listSyntaxConversionProgress);
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
     * @return AsyncInvoker<ListSyntaxConversionProgressRequest, ListSyntaxConversionProgressResponse>
     */
    public AsyncInvoker<ListSyntaxConversionProgressRequest, ListSyntaxConversionProgressResponse> listSyntaxConversionProgressAsyncInvoker(
        ListSyntaxConversionProgressRequest request) {
        return new AsyncInvoker<ListSyntaxConversionProgressRequest, ListSyntaxConversionProgressResponse>(request,
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
     * @return CompletableFuture<ListVerificationProgressResponse>
     */
    public CompletableFuture<ListVerificationProgressResponse> listVerificationProgressAsync(
        ListVerificationProgressRequest request) {
        return hcClient.asyncInvokeHttp(request, UgoMeta.listVerificationProgress);
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
     * @return AsyncInvoker<ListVerificationProgressRequest, ListVerificationProgressResponse>
     */
    public AsyncInvoker<ListVerificationProgressRequest, ListVerificationProgressResponse> listVerificationProgressAsyncInvoker(
        ListVerificationProgressRequest request) {
        return new AsyncInvoker<ListVerificationProgressRequest, ListVerificationProgressResponse>(request,
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
     * @return CompletableFuture<ShowEvaluationProjectDetailResponse>
     */
    public CompletableFuture<ShowEvaluationProjectDetailResponse> showEvaluationProjectDetailAsync(
        ShowEvaluationProjectDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, UgoMeta.showEvaluationProjectDetail);
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
     * @return AsyncInvoker<ShowEvaluationProjectDetailRequest, ShowEvaluationProjectDetailResponse>
     */
    public AsyncInvoker<ShowEvaluationProjectDetailRequest, ShowEvaluationProjectDetailResponse> showEvaluationProjectDetailAsyncInvoker(
        ShowEvaluationProjectDetailRequest request) {
        return new AsyncInvoker<ShowEvaluationProjectDetailRequest, ShowEvaluationProjectDetailResponse>(request,
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
     * @return CompletableFuture<ShowEvaluationProjectStatusResponse>
     */
    public CompletableFuture<ShowEvaluationProjectStatusResponse> showEvaluationProjectStatusAsync(
        ShowEvaluationProjectStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, UgoMeta.showEvaluationProjectStatus);
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
     * @return AsyncInvoker<ShowEvaluationProjectStatusRequest, ShowEvaluationProjectStatusResponse>
     */
    public AsyncInvoker<ShowEvaluationProjectStatusRequest, ShowEvaluationProjectStatusResponse> showEvaluationProjectStatusAsyncInvoker(
        ShowEvaluationProjectStatusRequest request) {
        return new AsyncInvoker<ShowEvaluationProjectStatusRequest, ShowEvaluationProjectStatusResponse>(request,
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
     * @return CompletableFuture<ShowMigrationProjectDetailResponse>
     */
    public CompletableFuture<ShowMigrationProjectDetailResponse> showMigrationProjectDetailAsync(
        ShowMigrationProjectDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, UgoMeta.showMigrationProjectDetail);
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
     * @return AsyncInvoker<ShowMigrationProjectDetailRequest, ShowMigrationProjectDetailResponse>
     */
    public AsyncInvoker<ShowMigrationProjectDetailRequest, ShowMigrationProjectDetailResponse> showMigrationProjectDetailAsyncInvoker(
        ShowMigrationProjectDetailRequest request) {
        return new AsyncInvoker<ShowMigrationProjectDetailRequest, ShowMigrationProjectDetailResponse>(request,
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
     * @return CompletableFuture<ShowMigrationProjectStatusResponse>
     */
    public CompletableFuture<ShowMigrationProjectStatusResponse> showMigrationProjectStatusAsync(
        ShowMigrationProjectStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, UgoMeta.showMigrationProjectStatus);
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
     * @return AsyncInvoker<ShowMigrationProjectStatusRequest, ShowMigrationProjectStatusResponse>
     */
    public AsyncInvoker<ShowMigrationProjectStatusRequest, ShowMigrationProjectStatusResponse> showMigrationProjectStatusAsyncInvoker(
        ShowMigrationProjectStatusRequest request) {
        return new AsyncInvoker<ShowMigrationProjectStatusRequest, ShowMigrationProjectStatusResponse>(request,
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
     * @return CompletableFuture<ListApiVersionsResponse>
     */
    public CompletableFuture<ListApiVersionsResponse> listApiVersionsAsync(ListApiVersionsRequest request) {
        return hcClient.asyncInvokeHttp(request, UgoMeta.listApiVersions);
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
     * @return AsyncInvoker<ListApiVersionsRequest, ListApiVersionsResponse>
     */
    public AsyncInvoker<ListApiVersionsRequest, ListApiVersionsResponse> listApiVersionsAsyncInvoker(
        ListApiVersionsRequest request) {
        return new AsyncInvoker<ListApiVersionsRequest, ListApiVersionsResponse>(request, UgoMeta.listApiVersions,
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
     * @return CompletableFuture<ShowApiVersionInfoResponse>
     */
    public CompletableFuture<ShowApiVersionInfoResponse> showApiVersionInfoAsync(ShowApiVersionInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, UgoMeta.showApiVersionInfo);
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
     * @return AsyncInvoker<ShowApiVersionInfoRequest, ShowApiVersionInfoResponse>
     */
    public AsyncInvoker<ShowApiVersionInfoRequest, ShowApiVersionInfoResponse> showApiVersionInfoAsyncInvoker(
        ShowApiVersionInfoRequest request) {
        return new AsyncInvoker<ShowApiVersionInfoRequest, ShowApiVersionInfoResponse>(request,
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
     * @return CompletableFuture<RunSqlConversionResponse>
     */
    public CompletableFuture<RunSqlConversionResponse> runSqlConversionAsync(RunSqlConversionRequest request) {
        return hcClient.asyncInvokeHttp(request, UgoMeta.runSqlConversion);
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
     * @return AsyncInvoker<RunSqlConversionRequest, RunSqlConversionResponse>
     */
    public AsyncInvoker<RunSqlConversionRequest, RunSqlConversionResponse> runSqlConversionAsyncInvoker(
        RunSqlConversionRequest request) {
        return new AsyncInvoker<RunSqlConversionRequest, RunSqlConversionResponse>(request, UgoMeta.runSqlConversion,
            hcClient);
    }

}
