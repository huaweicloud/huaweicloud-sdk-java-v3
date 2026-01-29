package com.huaweicloud.sdk.projectman.v4;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.projectman.v4.model.AddApplyJoinProjectForAgcRequest;
import com.huaweicloud.sdk.projectman.v4.model.AddApplyJoinProjectForAgcResponse;
import com.huaweicloud.sdk.projectman.v4.model.AddIssueWorkHoursRequest;
import com.huaweicloud.sdk.projectman.v4.model.AddIssueWorkHoursResponse;
import com.huaweicloud.sdk.projectman.v4.model.AddMemberV4Request;
import com.huaweicloud.sdk.projectman.v4.model.AddMemberV4Response;
import com.huaweicloud.sdk.projectman.v4.model.BatchAddMembersV4Request;
import com.huaweicloud.sdk.projectman.v4.model.BatchAddMembersV4Response;
import com.huaweicloud.sdk.projectman.v4.model.BatchDeleteIssuesV4Request;
import com.huaweicloud.sdk.projectman.v4.model.BatchDeleteIssuesV4Response;
import com.huaweicloud.sdk.projectman.v4.model.BatchDeleteIterationsV4Request;
import com.huaweicloud.sdk.projectman.v4.model.BatchDeleteIterationsV4Response;
import com.huaweicloud.sdk.projectman.v4.model.BatchDeleteMembersV4Request;
import com.huaweicloud.sdk.projectman.v4.model.BatchDeleteMembersV4Response;
import com.huaweicloud.sdk.projectman.v4.model.BatchListAssociatedIssuesRequest;
import com.huaweicloud.sdk.projectman.v4.model.BatchListAssociatedIssuesResponse;
import com.huaweicloud.sdk.projectman.v4.model.BatchUpdateChildNickNamesRequest;
import com.huaweicloud.sdk.projectman.v4.model.BatchUpdateChildNickNamesResponse;
import com.huaweicloud.sdk.projectman.v4.model.CancelProjectDomainRequest;
import com.huaweicloud.sdk.projectman.v4.model.CancelProjectDomainResponse;
import com.huaweicloud.sdk.projectman.v4.model.CheckProjectNameV4Request;
import com.huaweicloud.sdk.projectman.v4.model.CheckProjectNameV4Response;
import com.huaweicloud.sdk.projectman.v4.model.CreateCustomfieldsRequest;
import com.huaweicloud.sdk.projectman.v4.model.CreateCustomfieldsResponse;
import com.huaweicloud.sdk.projectman.v4.model.CreateIpdProjectIssueAttachmentRequest;
import com.huaweicloud.sdk.projectman.v4.model.CreateIpdProjectIssueAttachmentResponse;
import com.huaweicloud.sdk.projectman.v4.model.CreateIpdProjectIssueRequest;
import com.huaweicloud.sdk.projectman.v4.model.CreateIpdProjectIssueResponse;
import com.huaweicloud.sdk.projectman.v4.model.CreateIssueV4Request;
import com.huaweicloud.sdk.projectman.v4.model.CreateIssueV4Response;
import com.huaweicloud.sdk.projectman.v4.model.CreateIterationV4Request;
import com.huaweicloud.sdk.projectman.v4.model.CreateIterationV4Response;
import com.huaweicloud.sdk.projectman.v4.model.CreateProjectDomainRequest;
import com.huaweicloud.sdk.projectman.v4.model.CreateProjectDomainResponse;
import com.huaweicloud.sdk.projectman.v4.model.CreateProjectModuleRequest;
import com.huaweicloud.sdk.projectman.v4.model.CreateProjectModuleResponse;
import com.huaweicloud.sdk.projectman.v4.model.CreateProjectV4Request;
import com.huaweicloud.sdk.projectman.v4.model.CreateProjectV4Response;
import com.huaweicloud.sdk.projectman.v4.model.CreateScrumPlanToProjectRequest;
import com.huaweicloud.sdk.projectman.v4.model.CreateScrumPlanToProjectResponse;
import com.huaweicloud.sdk.projectman.v4.model.CreateSystemIssueV4Request;
import com.huaweicloud.sdk.projectman.v4.model.CreateSystemIssueV4Response;
import com.huaweicloud.sdk.projectman.v4.model.DeleteAttachmentRequest;
import com.huaweicloud.sdk.projectman.v4.model.DeleteAttachmentResponse;
import com.huaweicloud.sdk.projectman.v4.model.DeleteIpdImageInIssueRequest;
import com.huaweicloud.sdk.projectman.v4.model.DeleteIpdImageInIssueResponse;
import com.huaweicloud.sdk.projectman.v4.model.DeleteIssueV4Request;
import com.huaweicloud.sdk.projectman.v4.model.DeleteIssueV4Response;
import com.huaweicloud.sdk.projectman.v4.model.DeleteIterationV4Request;
import com.huaweicloud.sdk.projectman.v4.model.DeleteIterationV4Response;
import com.huaweicloud.sdk.projectman.v4.model.DeleteProjectModuleRequest;
import com.huaweicloud.sdk.projectman.v4.model.DeleteProjectModuleResponse;
import com.huaweicloud.sdk.projectman.v4.model.DeleteProjectV4Request;
import com.huaweicloud.sdk.projectman.v4.model.DeleteProjectV4Response;
import com.huaweicloud.sdk.projectman.v4.model.DeleteScrumPlanInProjectRequest;
import com.huaweicloud.sdk.projectman.v4.model.DeleteScrumPlanInProjectResponse;
import com.huaweicloud.sdk.projectman.v4.model.DownloadAttachmentRequest;
import com.huaweicloud.sdk.projectman.v4.model.DownloadAttachmentResponse;
import com.huaweicloud.sdk.projectman.v4.model.DownloadImageFileRequest;
import com.huaweicloud.sdk.projectman.v4.model.DownloadImageFileResponse;
import com.huaweicloud.sdk.projectman.v4.model.DownloadIpdImageInIssueRequest;
import com.huaweicloud.sdk.projectman.v4.model.DownloadIpdImageInIssueResponse;
import com.huaweicloud.sdk.projectman.v4.model.DownloadIpdIssueAttachmentRequest;
import com.huaweicloud.sdk.projectman.v4.model.DownloadIpdIssueAttachmentResponse;
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
import com.huaweicloud.sdk.projectman.v4.model.ListIpdProjectIssuesRequest;
import com.huaweicloud.sdk.projectman.v4.model.ListIpdProjectIssuesResponse;
import com.huaweicloud.sdk.projectman.v4.model.ListIssueAssociatedCommitsRequest;
import com.huaweicloud.sdk.projectman.v4.model.ListIssueAssociatedCommitsResponse;
import com.huaweicloud.sdk.projectman.v4.model.ListIssueCommentsV4Request;
import com.huaweicloud.sdk.projectman.v4.model.ListIssueCommentsV4Response;
import com.huaweicloud.sdk.projectman.v4.model.ListIssueCustomFieldsRequest;
import com.huaweicloud.sdk.projectman.v4.model.ListIssueCustomFieldsResponse;
import com.huaweicloud.sdk.projectman.v4.model.ListIssueFieldsRequest;
import com.huaweicloud.sdk.projectman.v4.model.ListIssueFieldsResponse;
import com.huaweicloud.sdk.projectman.v4.model.ListIssueRecordsV4Request;
import com.huaweicloud.sdk.projectman.v4.model.ListIssueRecordsV4Response;
import com.huaweicloud.sdk.projectman.v4.model.ListIssueStatuesRequest;
import com.huaweicloud.sdk.projectman.v4.model.ListIssueStatuesResponse;
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
import com.huaweicloud.sdk.projectman.v4.model.ListProjectWorkHoursResponse;
import com.huaweicloud.sdk.projectman.v4.model.ListProjectWorkHoursTypeRequest;
import com.huaweicloud.sdk.projectman.v4.model.ListProjectWorkHoursTypeResponse;
import com.huaweicloud.sdk.projectman.v4.model.ListProjectsV4Request;
import com.huaweicloud.sdk.projectman.v4.model.ListProjectsV4Response;
import com.huaweicloud.sdk.projectman.v4.model.ListScrumProjectStatusesRequest;
import com.huaweicloud.sdk.projectman.v4.model.ListScrumProjectStatusesResponse;
import com.huaweicloud.sdk.projectman.v4.model.ListSpecIssueStayTimesRequest;
import com.huaweicloud.sdk.projectman.v4.model.ListSpecIssueStayTimesResponse;
import com.huaweicloud.sdk.projectman.v4.model.ListStatusStatisticRequest;
import com.huaweicloud.sdk.projectman.v4.model.ListStatusStatisticResponse;
import com.huaweicloud.sdk.projectman.v4.model.ListTemplatesRequest;
import com.huaweicloud.sdk.projectman.v4.model.ListTemplatesResponse;
import com.huaweicloud.sdk.projectman.v4.model.ListWorkitemStatusRecordsV4Request;
import com.huaweicloud.sdk.projectman.v4.model.ListWorkitemStatusRecordsV4Response;
import com.huaweicloud.sdk.projectman.v4.model.ListWorkitemsRequest;
import com.huaweicloud.sdk.projectman.v4.model.ListWorkitemsResponse;
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
import com.huaweicloud.sdk.projectman.v4.model.ShowIpdAttachmentByWorkItemIdRequest;
import com.huaweicloud.sdk.projectman.v4.model.ShowIpdAttachmentByWorkItemIdResponse;
import com.huaweicloud.sdk.projectman.v4.model.ShowIssueCompletionRateRequest;
import com.huaweicloud.sdk.projectman.v4.model.ShowIssueCompletionRateResponse;
import com.huaweicloud.sdk.projectman.v4.model.ShowIssueConfigFieldsRequest;
import com.huaweicloud.sdk.projectman.v4.model.ShowIssueConfigFieldsResponse;
import com.huaweicloud.sdk.projectman.v4.model.ShowIssueDetailRequest;
import com.huaweicloud.sdk.projectman.v4.model.ShowIssueDetailResponse;
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
import com.huaweicloud.sdk.projectman.v4.model.ShowProjectWorkHoursResponse;
import com.huaweicloud.sdk.projectman.v4.model.ShowScrumIssueSeveritiesRequest;
import com.huaweicloud.sdk.projectman.v4.model.ShowScrumIssueSeveritiesResponse;
import com.huaweicloud.sdk.projectman.v4.model.ShowScrumPlansByConditionRequest;
import com.huaweicloud.sdk.projectman.v4.model.ShowScrumPlansByConditionResponse;
import com.huaweicloud.sdk.projectman.v4.model.ShowWorkItemWrokflowConfigRequest;
import com.huaweicloud.sdk.projectman.v4.model.ShowWorkItemWrokflowConfigResponse;
import com.huaweicloud.sdk.projectman.v4.model.ShowWorkflowTemplateRequest;
import com.huaweicloud.sdk.projectman.v4.model.ShowWorkflowTemplateResponse;
import com.huaweicloud.sdk.projectman.v4.model.TransferWorkItemFlowRequest;
import com.huaweicloud.sdk.projectman.v4.model.TransferWorkItemFlowResponse;
import com.huaweicloud.sdk.projectman.v4.model.UpdateIssueV4Request;
import com.huaweicloud.sdk.projectman.v4.model.UpdateIssueV4Response;
import com.huaweicloud.sdk.projectman.v4.model.UpdateIterationV4Request;
import com.huaweicloud.sdk.projectman.v4.model.UpdateIterationV4Response;
import com.huaweicloud.sdk.projectman.v4.model.UpdateMembesRoleV4Request;
import com.huaweicloud.sdk.projectman.v4.model.UpdateMembesRoleV4Response;
import com.huaweicloud.sdk.projectman.v4.model.UpdateNickNameV4Request;
import com.huaweicloud.sdk.projectman.v4.model.UpdateNickNameV4Response;
import com.huaweicloud.sdk.projectman.v4.model.UpdateProjectDomainRequest;
import com.huaweicloud.sdk.projectman.v4.model.UpdateProjectDomainResponse;
import com.huaweicloud.sdk.projectman.v4.model.UpdateProjectModuleRequest;
import com.huaweicloud.sdk.projectman.v4.model.UpdateProjectModuleResponse;
import com.huaweicloud.sdk.projectman.v4.model.UpdateProjectV4Request;
import com.huaweicloud.sdk.projectman.v4.model.UpdateProjectV4Response;
import com.huaweicloud.sdk.projectman.v4.model.UpdateScrumPlanInProjectRequest;
import com.huaweicloud.sdk.projectman.v4.model.UpdateScrumPlanInProjectResponse;
import com.huaweicloud.sdk.projectman.v4.model.UploadAttachmentsRequest;
import com.huaweicloud.sdk.projectman.v4.model.UploadAttachmentsResponse;
import com.huaweicloud.sdk.projectman.v4.model.UploadIpdImageInIssueRequest;
import com.huaweicloud.sdk.projectman.v4.model.UploadIpdImageInIssueResponse;
import com.huaweicloud.sdk.projectman.v4.model.UploadIssueImgRequest;
import com.huaweicloud.sdk.projectman.v4.model.UploadIssueImgResponse;

import java.util.concurrent.CompletableFuture;

public class ProjectManAsyncClient {

    protected HcClient hcClient;

    public ProjectManAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<ProjectManAsyncClient> newBuilder() {
        ClientBuilder<ProjectManAsyncClient> clientBuilder = new ClientBuilder<>(ProjectManAsyncClient::new);
        return clientBuilder;
    }

    /**
     * AGC调用 当前用户申请加入项目
     *
     * AGC调用 当前用户申请加入项目, 申请的用户id写在header中
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddApplyJoinProjectForAgcRequest 请求对象
     * @return CompletableFuture<AddApplyJoinProjectForAgcResponse>
     */
    public CompletableFuture<AddApplyJoinProjectForAgcResponse> addApplyJoinProjectForAgcAsync(
        AddApplyJoinProjectForAgcRequest request) {
        return hcClient.asyncInvokeHttp(request, ProjectManMeta.addApplyJoinProjectForAgc);
    }

    /**
     * AGC调用 当前用户申请加入项目
     *
     * AGC调用 当前用户申请加入项目, 申请的用户id写在header中
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddApplyJoinProjectForAgcRequest 请求对象
     * @return AsyncInvoker<AddApplyJoinProjectForAgcRequest, AddApplyJoinProjectForAgcResponse>
     */
    public AsyncInvoker<AddApplyJoinProjectForAgcRequest, AddApplyJoinProjectForAgcResponse> addApplyJoinProjectForAgcAsyncInvoker(
        AddApplyJoinProjectForAgcRequest request) {
        return new AsyncInvoker<>(request, ProjectManMeta.addApplyJoinProjectForAgc, hcClient);
    }

    /**
     * 添加项目成员
     *
     * 添加项目成员,可以添加跨租户成员
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddMemberV4Request 请求对象
     * @return CompletableFuture<AddMemberV4Response>
     */
    public CompletableFuture<AddMemberV4Response> addMemberV4Async(AddMemberV4Request request) {
        return hcClient.asyncInvokeHttp(request, ProjectManMeta.addMemberV4);
    }

    /**
     * 添加项目成员
     *
     * 添加项目成员,可以添加跨租户成员
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddMemberV4Request 请求对象
     * @return AsyncInvoker<AddMemberV4Request, AddMemberV4Response>
     */
    public AsyncInvoker<AddMemberV4Request, AddMemberV4Response> addMemberV4AsyncInvoker(AddMemberV4Request request) {
        return new AsyncInvoker<>(request, ProjectManMeta.addMemberV4, hcClient);
    }

    /**
     * 批量添加项目成员
     *
     * 批量添加项目成员，只能添加和项目创建者同一租户下的成员，不正确的用户id会略过，添加的用户超过权限的，默认角色设置为7
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchAddMembersV4Request 请求对象
     * @return CompletableFuture<BatchAddMembersV4Response>
     */
    public CompletableFuture<BatchAddMembersV4Response> batchAddMembersV4Async(BatchAddMembersV4Request request) {
        return hcClient.asyncInvokeHttp(request, ProjectManMeta.batchAddMembersV4);
    }

    /**
     * 批量添加项目成员
     *
     * 批量添加项目成员，只能添加和项目创建者同一租户下的成员，不正确的用户id会略过，添加的用户超过权限的，默认角色设置为7
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchAddMembersV4Request 请求对象
     * @return AsyncInvoker<BatchAddMembersV4Request, BatchAddMembersV4Response>
     */
    public AsyncInvoker<BatchAddMembersV4Request, BatchAddMembersV4Response> batchAddMembersV4AsyncInvoker(
        BatchAddMembersV4Request request) {
        return new AsyncInvoker<>(request, ProjectManMeta.batchAddMembersV4, hcClient);
    }

    /**
     * 批量删除项目成员
     *
     * 批量删除项目成员
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteMembersV4Request 请求对象
     * @return CompletableFuture<BatchDeleteMembersV4Response>
     */
    public CompletableFuture<BatchDeleteMembersV4Response> batchDeleteMembersV4Async(
        BatchDeleteMembersV4Request request) {
        return hcClient.asyncInvokeHttp(request, ProjectManMeta.batchDeleteMembersV4);
    }

    /**
     * 批量删除项目成员
     *
     * 批量删除项目成员
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteMembersV4Request 请求对象
     * @return AsyncInvoker<BatchDeleteMembersV4Request, BatchDeleteMembersV4Response>
     */
    public AsyncInvoker<BatchDeleteMembersV4Request, BatchDeleteMembersV4Response> batchDeleteMembersV4AsyncInvoker(
        BatchDeleteMembersV4Request request) {
        return new AsyncInvoker<>(request, ProjectManMeta.batchDeleteMembersV4, hcClient);
    }

    /**
     * 更新子用户昵称
     *
     * 拥有te_admin角色的用户可以更新其他用户的昵称
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUpdateChildNickNamesRequest 请求对象
     * @return CompletableFuture<BatchUpdateChildNickNamesResponse>
     */
    public CompletableFuture<BatchUpdateChildNickNamesResponse> batchUpdateChildNickNamesAsync(
        BatchUpdateChildNickNamesRequest request) {
        return hcClient.asyncInvokeHttp(request, ProjectManMeta.batchUpdateChildNickNames);
    }

    /**
     * 更新子用户昵称
     *
     * 拥有te_admin角色的用户可以更新其他用户的昵称
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUpdateChildNickNamesRequest 请求对象
     * @return AsyncInvoker<BatchUpdateChildNickNamesRequest, BatchUpdateChildNickNamesResponse>
     */
    public AsyncInvoker<BatchUpdateChildNickNamesRequest, BatchUpdateChildNickNamesResponse> batchUpdateChildNickNamesAsyncInvoker(
        BatchUpdateChildNickNamesRequest request) {
        return new AsyncInvoker<>(request, ProjectManMeta.batchUpdateChildNickNames, hcClient);
    }

    /**
     * 检查项目名称是否存在
     *
     * 检查项目名称是否存在
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckProjectNameV4Request 请求对象
     * @return CompletableFuture<CheckProjectNameV4Response>
     */
    public CompletableFuture<CheckProjectNameV4Response> checkProjectNameV4Async(CheckProjectNameV4Request request) {
        return hcClient.asyncInvokeHttp(request, ProjectManMeta.checkProjectNameV4);
    }

    /**
     * 检查项目名称是否存在
     *
     * 检查项目名称是否存在
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckProjectNameV4Request 请求对象
     * @return AsyncInvoker<CheckProjectNameV4Request, CheckProjectNameV4Response>
     */
    public AsyncInvoker<CheckProjectNameV4Request, CheckProjectNameV4Response> checkProjectNameV4AsyncInvoker(
        CheckProjectNameV4Request request) {
        return new AsyncInvoker<>(request, ProjectManMeta.checkProjectNameV4, hcClient);
    }

    /**
     * 创建项目
     *
     * 创建项目
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateProjectV4Request 请求对象
     * @return CompletableFuture<CreateProjectV4Response>
     */
    public CompletableFuture<CreateProjectV4Response> createProjectV4Async(CreateProjectV4Request request) {
        return hcClient.asyncInvokeHttp(request, ProjectManMeta.createProjectV4);
    }

    /**
     * 创建项目
     *
     * 创建项目
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateProjectV4Request 请求对象
     * @return AsyncInvoker<CreateProjectV4Request, CreateProjectV4Response>
     */
    public AsyncInvoker<CreateProjectV4Request, CreateProjectV4Response> createProjectV4AsyncInvoker(
        CreateProjectV4Request request) {
        return new AsyncInvoker<>(request, ProjectManMeta.createProjectV4, hcClient);
    }

    /**
     * 删除项目
     *
     * 删除项目
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteProjectV4Request 请求对象
     * @return CompletableFuture<DeleteProjectV4Response>
     */
    public CompletableFuture<DeleteProjectV4Response> deleteProjectV4Async(DeleteProjectV4Request request) {
        return hcClient.asyncInvokeHttp(request, ProjectManMeta.deleteProjectV4);
    }

    /**
     * 删除项目
     *
     * 删除项目
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteProjectV4Request 请求对象
     * @return AsyncInvoker<DeleteProjectV4Request, DeleteProjectV4Response>
     */
    public AsyncInvoker<DeleteProjectV4Request, DeleteProjectV4Response> deleteProjectV4AsyncInvoker(
        DeleteProjectV4Request request) {
        return new AsyncInvoker<>(request, ProjectManMeta.deleteProjectV4, hcClient);
    }

    /**
     * 获取租户没有加入的项目
     *
     * 获取租户没有加入的项目
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDomainNotAddedProjectsV4Request 请求对象
     * @return CompletableFuture<ListDomainNotAddedProjectsV4Response>
     */
    public CompletableFuture<ListDomainNotAddedProjectsV4Response> listDomainNotAddedProjectsV4Async(
        ListDomainNotAddedProjectsV4Request request) {
        return hcClient.asyncInvokeHttp(request, ProjectManMeta.listDomainNotAddedProjectsV4);
    }

    /**
     * 获取租户没有加入的项目
     *
     * 获取租户没有加入的项目
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDomainNotAddedProjectsV4Request 请求对象
     * @return AsyncInvoker<ListDomainNotAddedProjectsV4Request, ListDomainNotAddedProjectsV4Response>
     */
    public AsyncInvoker<ListDomainNotAddedProjectsV4Request, ListDomainNotAddedProjectsV4Response> listDomainNotAddedProjectsV4AsyncInvoker(
        ListDomainNotAddedProjectsV4Request request) {
        return new AsyncInvoker<>(request, ProjectManMeta.listDomainNotAddedProjectsV4, hcClient);
    }

    /**
     * 获取bug统计信息
     *
     * 获取bug统计信息，按模块统计
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectBugStaticsV4Request 请求对象
     * @return CompletableFuture<ListProjectBugStaticsV4Response>
     */
    public CompletableFuture<ListProjectBugStaticsV4Response> listProjectBugStaticsV4Async(
        ListProjectBugStaticsV4Request request) {
        return hcClient.asyncInvokeHttp(request, ProjectManMeta.listProjectBugStaticsV4);
    }

    /**
     * 获取bug统计信息
     *
     * 获取bug统计信息，按模块统计
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectBugStaticsV4Request 请求对象
     * @return AsyncInvoker<ListProjectBugStaticsV4Request, ListProjectBugStaticsV4Response>
     */
    public AsyncInvoker<ListProjectBugStaticsV4Request, ListProjectBugStaticsV4Response> listProjectBugStaticsV4AsyncInvoker(
        ListProjectBugStaticsV4Request request) {
        return new AsyncInvoker<>(request, ProjectManMeta.listProjectBugStaticsV4, hcClient);
    }

    /**
     * 获取需求统计信息
     *
     * 获取需求统计信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectDemandStaticV4Request 请求对象
     * @return CompletableFuture<ListProjectDemandStaticV4Response>
     */
    public CompletableFuture<ListProjectDemandStaticV4Response> listProjectDemandStaticV4Async(
        ListProjectDemandStaticV4Request request) {
        return hcClient.asyncInvokeHttp(request, ProjectManMeta.listProjectDemandStaticV4);
    }

    /**
     * 获取需求统计信息
     *
     * 获取需求统计信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectDemandStaticV4Request 请求对象
     * @return AsyncInvoker<ListProjectDemandStaticV4Request, ListProjectDemandStaticV4Response>
     */
    public AsyncInvoker<ListProjectDemandStaticV4Request, ListProjectDemandStaticV4Response> listProjectDemandStaticV4AsyncInvoker(
        ListProjectDemandStaticV4Request request) {
        return new AsyncInvoker<>(request, ProjectManMeta.listProjectDemandStaticV4, hcClient);
    }

    /**
     * 获取指定项目的成员用户列表
     *
     * 获取项目成员列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectMembersV4Request 请求对象
     * @return CompletableFuture<ListProjectMembersV4Response>
     */
    public CompletableFuture<ListProjectMembersV4Response> listProjectMembersV4Async(
        ListProjectMembersV4Request request) {
        return hcClient.asyncInvokeHttp(request, ProjectManMeta.listProjectMembersV4);
    }

    /**
     * 获取指定项目的成员用户列表
     *
     * 获取项目成员列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectMembersV4Request 请求对象
     * @return AsyncInvoker<ListProjectMembersV4Request, ListProjectMembersV4Response>
     */
    public AsyncInvoker<ListProjectMembersV4Request, ListProjectMembersV4Response> listProjectMembersV4AsyncInvoker(
        ListProjectMembersV4Request request) {
        return new AsyncInvoker<>(request, ProjectManMeta.listProjectMembersV4, hcClient);
    }

    /**
     * 查询项目列表
     *
     * 查询项目列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectsV4Request 请求对象
     * @return CompletableFuture<ListProjectsV4Response>
     */
    public CompletableFuture<ListProjectsV4Response> listProjectsV4Async(ListProjectsV4Request request) {
        return hcClient.asyncInvokeHttp(request, ProjectManMeta.listProjectsV4);
    }

    /**
     * 查询项目列表
     *
     * 查询项目列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectsV4Request 请求对象
     * @return AsyncInvoker<ListProjectsV4Request, ListProjectsV4Response>
     */
    public AsyncInvoker<ListProjectsV4Request, ListProjectsV4Response> listProjectsV4AsyncInvoker(
        ListProjectsV4Request request) {
        return new AsyncInvoker<>(request, ProjectManMeta.listProjectsV4, hcClient);
    }

    /**
     * 查询项目模板
     *
     * 查询项目模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTemplatesRequest 请求对象
     * @return CompletableFuture<ListTemplatesResponse>
     */
    public CompletableFuture<ListTemplatesResponse> listTemplatesAsync(ListTemplatesRequest request) {
        return hcClient.asyncInvokeHttp(request, ProjectManMeta.listTemplates);
    }

    /**
     * 查询项目模板
     *
     * 查询项目模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTemplatesRequest 请求对象
     * @return AsyncInvoker<ListTemplatesRequest, ListTemplatesResponse>
     */
    public AsyncInvoker<ListTemplatesRequest, ListTemplatesResponse> listTemplatesAsyncInvoker(
        ListTemplatesRequest request) {
        return new AsyncInvoker<>(request, ProjectManMeta.listTemplates, hcClient);
    }

    /**
     * 查询看板项目下工作项的状态历史记录
     *
     * 分页查询看板项目下工作项的状态历史记录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWorkitemStatusRecordsV4Request 请求对象
     * @return CompletableFuture<ListWorkitemStatusRecordsV4Response>
     */
    public CompletableFuture<ListWorkitemStatusRecordsV4Response> listWorkitemStatusRecordsV4Async(
        ListWorkitemStatusRecordsV4Request request) {
        return hcClient.asyncInvokeHttp(request, ProjectManMeta.listWorkitemStatusRecordsV4);
    }

    /**
     * 查询看板项目下工作项的状态历史记录
     *
     * 分页查询看板项目下工作项的状态历史记录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWorkitemStatusRecordsV4Request 请求对象
     * @return AsyncInvoker<ListWorkitemStatusRecordsV4Request, ListWorkitemStatusRecordsV4Response>
     */
    public AsyncInvoker<ListWorkitemStatusRecordsV4Request, ListWorkitemStatusRecordsV4Response> listWorkitemStatusRecordsV4AsyncInvoker(
        ListWorkitemStatusRecordsV4Request request) {
        return new AsyncInvoker<>(request, ProjectManMeta.listWorkitemStatusRecordsV4, hcClient);
    }

    /**
     * 查询看板项目下的工作项
     *
     * 查询看板项目下的工作项
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWorkitemsRequest 请求对象
     * @return CompletableFuture<ListWorkitemsResponse>
     */
    public CompletableFuture<ListWorkitemsResponse> listWorkitemsAsync(ListWorkitemsRequest request) {
        return hcClient.asyncInvokeHttp(request, ProjectManMeta.listWorkitems);
    }

    /**
     * 查询看板项目下的工作项
     *
     * 查询看板项目下的工作项
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWorkitemsRequest 请求对象
     * @return AsyncInvoker<ListWorkitemsRequest, ListWorkitemsResponse>
     */
    public AsyncInvoker<ListWorkitemsRequest, ListWorkitemsResponse> listWorkitemsAsyncInvoker(
        ListWorkitemsRequest request) {
        return new AsyncInvoker<>(request, ProjectManMeta.listWorkitems, hcClient);
    }

    /**
     * 主动退出项目
     *
     * 项目成员主动退出项目，项目创建者不能退出
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RemoveProjectRequest 请求对象
     * @return CompletableFuture<RemoveProjectResponse>
     */
    public CompletableFuture<RemoveProjectResponse> removeProjectAsync(RemoveProjectRequest request) {
        return hcClient.asyncInvokeHttp(request, ProjectManMeta.removeProject);
    }

    /**
     * 主动退出项目
     *
     * 项目成员主动退出项目，项目创建者不能退出
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RemoveProjectRequest 请求对象
     * @return AsyncInvoker<RemoveProjectRequest, RemoveProjectResponse>
     */
    public AsyncInvoker<RemoveProjectRequest, RemoveProjectResponse> removeProjectAsyncInvoker(
        RemoveProjectRequest request) {
        return new AsyncInvoker<>(request, ProjectManMeta.removeProject, hcClient);
    }

    /**
     * 查询缺陷密度
     *
     * 查询缺陷密度
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBugDensityV2Request 请求对象
     * @return CompletableFuture<ShowBugDensityV2Response>
     */
    public CompletableFuture<ShowBugDensityV2Response> showBugDensityV2Async(ShowBugDensityV2Request request) {
        return hcClient.asyncInvokeHttp(request, ProjectManMeta.showBugDensityV2);
    }

    /**
     * 查询缺陷密度
     *
     * 查询缺陷密度
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBugDensityV2Request 请求对象
     * @return AsyncInvoker<ShowBugDensityV2Request, ShowBugDensityV2Response>
     */
    public AsyncInvoker<ShowBugDensityV2Request, ShowBugDensityV2Response> showBugDensityV2AsyncInvoker(
        ShowBugDensityV2Request request) {
        return new AsyncInvoker<>(request, ProjectManMeta.showBugDensityV2, hcClient);
    }

    /**
     * 查询人均bug
     *
     * 查询人均bug
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBugsPerDeveloperRequest 请求对象
     * @return CompletableFuture<ShowBugsPerDeveloperResponse>
     */
    public CompletableFuture<ShowBugsPerDeveloperResponse> showBugsPerDeveloperAsync(
        ShowBugsPerDeveloperRequest request) {
        return hcClient.asyncInvokeHttp(request, ProjectManMeta.showBugsPerDeveloper);
    }

    /**
     * 查询人均bug
     *
     * 查询人均bug
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBugsPerDeveloperRequest 请求对象
     * @return AsyncInvoker<ShowBugsPerDeveloperRequest, ShowBugsPerDeveloperResponse>
     */
    public AsyncInvoker<ShowBugsPerDeveloperRequest, ShowBugsPerDeveloperResponse> showBugsPerDeveloperAsyncInvoker(
        ShowBugsPerDeveloperRequest request) {
        return new AsyncInvoker<>(request, ProjectManMeta.showBugsPerDeveloper, hcClient);
    }

    /**
     * 查询需求按时完成率
     *
     * 查询需求按时完成率
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCompletionRateRequest 请求对象
     * @return CompletableFuture<ShowCompletionRateResponse>
     */
    public CompletableFuture<ShowCompletionRateResponse> showCompletionRateAsync(ShowCompletionRateRequest request) {
        return hcClient.asyncInvokeHttp(request, ProjectManMeta.showCompletionRate);
    }

    /**
     * 查询需求按时完成率
     *
     * 查询需求按时完成率
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCompletionRateRequest 请求对象
     * @return AsyncInvoker<ShowCompletionRateRequest, ShowCompletionRateResponse>
     */
    public AsyncInvoker<ShowCompletionRateRequest, ShowCompletionRateResponse> showCompletionRateAsyncInvoker(
        ShowCompletionRateRequest request) {
        return new AsyncInvoker<>(request, ProjectManMeta.showCompletionRate, hcClient);
    }

    /**
     * 获取当前用户信息
     *
     * 获取当前用户信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCurUserInfoRequest 请求对象
     * @return CompletableFuture<ShowCurUserInfoResponse>
     */
    public CompletableFuture<ShowCurUserInfoResponse> showCurUserInfoAsync(ShowCurUserInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, ProjectManMeta.showCurUserInfo);
    }

    /**
     * 获取当前用户信息
     *
     * 获取当前用户信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCurUserInfoRequest 请求对象
     * @return AsyncInvoker<ShowCurUserInfoRequest, ShowCurUserInfoResponse>
     */
    public AsyncInvoker<ShowCurUserInfoRequest, ShowCurUserInfoResponse> showCurUserInfoAsyncInvoker(
        ShowCurUserInfoRequest request) {
        return new AsyncInvoker<>(request, ProjectManMeta.showCurUserInfo, hcClient);
    }

    /**
     * 获取当前用户角色
     *
     * 获取用户在项目中的角色
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCurUserRoleRequest 请求对象
     * @return CompletableFuture<ShowCurUserRoleResponse>
     */
    public CompletableFuture<ShowCurUserRoleResponse> showCurUserRoleAsync(ShowCurUserRoleRequest request) {
        return hcClient.asyncInvokeHttp(request, ProjectManMeta.showCurUserRole);
    }

    /**
     * 获取当前用户角色
     *
     * 获取用户在项目中的角色
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCurUserRoleRequest 请求对象
     * @return AsyncInvoker<ShowCurUserRoleRequest, ShowCurUserRoleResponse>
     */
    public AsyncInvoker<ShowCurUserRoleRequest, ShowCurUserRoleResponse> showCurUserRoleAsyncInvoker(
        ShowCurUserRoleRequest request) {
        return new AsyncInvoker<>(request, ProjectManMeta.showCurUserRole, hcClient);
    }

    /**
     * 获取项目详情
     *
     * 获取项目详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowProjectInfoV4Request 请求对象
     * @return CompletableFuture<ShowProjectInfoV4Response>
     */
    public CompletableFuture<ShowProjectInfoV4Response> showProjectInfoV4Async(ShowProjectInfoV4Request request) {
        return hcClient.asyncInvokeHttp(request, ProjectManMeta.showProjectInfoV4);
    }

    /**
     * 获取项目详情
     *
     * 获取项目详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowProjectInfoV4Request 请求对象
     * @return AsyncInvoker<ShowProjectInfoV4Request, ShowProjectInfoV4Response>
     */
    public AsyncInvoker<ShowProjectInfoV4Request, ShowProjectInfoV4Response> showProjectInfoV4AsyncInvoker(
        ShowProjectInfoV4Request request) {
        return new AsyncInvoker<>(request, ProjectManMeta.showProjectInfoV4, hcClient);
    }

    /**
     * 获取项目概览
     *
     * 获取项目概览
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowProjectSummaryV4Request 请求对象
     * @return CompletableFuture<ShowProjectSummaryV4Response>
     */
    public CompletableFuture<ShowProjectSummaryV4Response> showProjectSummaryV4Async(
        ShowProjectSummaryV4Request request) {
        return hcClient.asyncInvokeHttp(request, ProjectManMeta.showProjectSummaryV4);
    }

    /**
     * 获取项目概览
     *
     * 获取项目概览
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowProjectSummaryV4Request 请求对象
     * @return AsyncInvoker<ShowProjectSummaryV4Request, ShowProjectSummaryV4Response>
     */
    public AsyncInvoker<ShowProjectSummaryV4Request, ShowProjectSummaryV4Response> showProjectSummaryV4AsyncInvoker(
        ShowProjectSummaryV4Request request) {
        return new AsyncInvoker<>(request, ProjectManMeta.showProjectSummaryV4, hcClient);
    }

    /**
     * 查询看板项目的工作项流转配置
     *
     * 查询看板项目的工作项流转配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowWorkItemWrokflowConfigRequest 请求对象
     * @return CompletableFuture<ShowWorkItemWrokflowConfigResponse>
     */
    public CompletableFuture<ShowWorkItemWrokflowConfigResponse> showWorkItemWrokflowConfigAsync(
        ShowWorkItemWrokflowConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, ProjectManMeta.showWorkItemWrokflowConfig);
    }

    /**
     * 查询看板项目的工作项流转配置
     *
     * 查询看板项目的工作项流转配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowWorkItemWrokflowConfigRequest 请求对象
     * @return AsyncInvoker<ShowWorkItemWrokflowConfigRequest, ShowWorkItemWrokflowConfigResponse>
     */
    public AsyncInvoker<ShowWorkItemWrokflowConfigRequest, ShowWorkItemWrokflowConfigResponse> showWorkItemWrokflowConfigAsyncInvoker(
        ShowWorkItemWrokflowConfigRequest request) {
        return new AsyncInvoker<>(request, ProjectManMeta.showWorkItemWrokflowConfig, hcClient);
    }

    /**
     * 更新成员在项目中的角色
     *
     * 更新成员在项目中的角色
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateMembesRoleV4Request 请求对象
     * @return CompletableFuture<UpdateMembesRoleV4Response>
     */
    public CompletableFuture<UpdateMembesRoleV4Response> updateMembesRoleV4Async(UpdateMembesRoleV4Request request) {
        return hcClient.asyncInvokeHttp(request, ProjectManMeta.updateMembesRoleV4);
    }

    /**
     * 更新成员在项目中的角色
     *
     * 更新成员在项目中的角色
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateMembesRoleV4Request 请求对象
     * @return AsyncInvoker<UpdateMembesRoleV4Request, UpdateMembesRoleV4Response>
     */
    public AsyncInvoker<UpdateMembesRoleV4Request, UpdateMembesRoleV4Response> updateMembesRoleV4AsyncInvoker(
        UpdateMembesRoleV4Request request) {
        return new AsyncInvoker<>(request, ProjectManMeta.updateMembesRoleV4, hcClient);
    }

    /**
     * 更新用户昵称
     *
     * 更新用户昵称
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateNickNameV4Request 请求对象
     * @return CompletableFuture<UpdateNickNameV4Response>
     */
    public CompletableFuture<UpdateNickNameV4Response> updateNickNameV4Async(UpdateNickNameV4Request request) {
        return hcClient.asyncInvokeHttp(request, ProjectManMeta.updateNickNameV4);
    }

    /**
     * 更新用户昵称
     *
     * 更新用户昵称
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateNickNameV4Request 请求对象
     * @return AsyncInvoker<UpdateNickNameV4Request, UpdateNickNameV4Response>
     */
    public AsyncInvoker<UpdateNickNameV4Request, UpdateNickNameV4Response> updateNickNameV4AsyncInvoker(
        UpdateNickNameV4Request request) {
        return new AsyncInvoker<>(request, ProjectManMeta.updateNickNameV4, hcClient);
    }

    /**
     * 更新项目
     *
     * 更新项目
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateProjectV4Request 请求对象
     * @return CompletableFuture<UpdateProjectV4Response>
     */
    public CompletableFuture<UpdateProjectV4Response> updateProjectV4Async(UpdateProjectV4Request request) {
        return hcClient.asyncInvokeHttp(request, ProjectManMeta.updateProjectV4);
    }

    /**
     * 更新项目
     *
     * 更新项目
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateProjectV4Request 请求对象
     * @return AsyncInvoker<UpdateProjectV4Request, UpdateProjectV4Response>
     */
    public AsyncInvoker<UpdateProjectV4Request, UpdateProjectV4Response> updateProjectV4AsyncInvoker(
        UpdateProjectV4Request request) {
        return new AsyncInvoker<>(request, ProjectManMeta.updateProjectV4, hcClient);
    }

    /**
     * 创建工作项
     *
     * 创建IPD项目的工作项
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateIpdProjectIssueRequest 请求对象
     * @return CompletableFuture<CreateIpdProjectIssueResponse>
     */
    public CompletableFuture<CreateIpdProjectIssueResponse> createIpdProjectIssueAsync(
        CreateIpdProjectIssueRequest request) {
        return hcClient.asyncInvokeHttp(request, ProjectManMeta.createIpdProjectIssue);
    }

    /**
     * 创建工作项
     *
     * 创建IPD项目的工作项
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateIpdProjectIssueRequest 请求对象
     * @return AsyncInvoker<CreateIpdProjectIssueRequest, CreateIpdProjectIssueResponse>
     */
    public AsyncInvoker<CreateIpdProjectIssueRequest, CreateIpdProjectIssueResponse> createIpdProjectIssueAsyncInvoker(
        CreateIpdProjectIssueRequest request) {
        return new AsyncInvoker<>(request, ProjectManMeta.createIpdProjectIssue, hcClient);
    }

    /**
     * 上传issue附件
     *
     * 上传issue附件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateIpdProjectIssueAttachmentRequest 请求对象
     * @return CompletableFuture<CreateIpdProjectIssueAttachmentResponse>
     */
    public CompletableFuture<CreateIpdProjectIssueAttachmentResponse> createIpdProjectIssueAttachmentAsync(
        CreateIpdProjectIssueAttachmentRequest request) {
        return hcClient.asyncInvokeHttp(request, ProjectManMeta.createIpdProjectIssueAttachment);
    }

    /**
     * 上传issue附件
     *
     * 上传issue附件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateIpdProjectIssueAttachmentRequest 请求对象
     * @return AsyncInvoker<CreateIpdProjectIssueAttachmentRequest, CreateIpdProjectIssueAttachmentResponse>
     */
    public AsyncInvoker<CreateIpdProjectIssueAttachmentRequest, CreateIpdProjectIssueAttachmentResponse> createIpdProjectIssueAttachmentAsyncInvoker(
        CreateIpdProjectIssueAttachmentRequest request) {
        return new AsyncInvoker<>(request, ProjectManMeta.createIpdProjectIssueAttachment, hcClient);
    }

    /**
     * 删除工作项描述中的图片
     *
     * 删除工作项描述中的图片
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteIpdImageInIssueRequest 请求对象
     * @return CompletableFuture<DeleteIpdImageInIssueResponse>
     */
    public CompletableFuture<DeleteIpdImageInIssueResponse> deleteIpdImageInIssueAsync(
        DeleteIpdImageInIssueRequest request) {
        return hcClient.asyncInvokeHttp(request, ProjectManMeta.deleteIpdImageInIssue);
    }

    /**
     * 删除工作项描述中的图片
     *
     * 删除工作项描述中的图片
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteIpdImageInIssueRequest 请求对象
     * @return AsyncInvoker<DeleteIpdImageInIssueRequest, DeleteIpdImageInIssueResponse>
     */
    public AsyncInvoker<DeleteIpdImageInIssueRequest, DeleteIpdImageInIssueResponse> deleteIpdImageInIssueAsyncInvoker(
        DeleteIpdImageInIssueRequest request) {
        return new AsyncInvoker<>(request, ProjectManMeta.deleteIpdImageInIssue, hcClient);
    }

    /**
     * 下载工作项描述中的图片
     *
     * 下载工作项描述中的图片
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadIpdImageInIssueRequest 请求对象
     * @return CompletableFuture<DownloadIpdImageInIssueResponse>
     */
    public CompletableFuture<DownloadIpdImageInIssueResponse> downloadIpdImageInIssueAsync(
        DownloadIpdImageInIssueRequest request) {
        return hcClient.asyncInvokeHttp(request, ProjectManMeta.downloadIpdImageInIssue);
    }

    /**
     * 下载工作项描述中的图片
     *
     * 下载工作项描述中的图片
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadIpdImageInIssueRequest 请求对象
     * @return AsyncInvoker<DownloadIpdImageInIssueRequest, DownloadIpdImageInIssueResponse>
     */
    public AsyncInvoker<DownloadIpdImageInIssueRequest, DownloadIpdImageInIssueResponse> downloadIpdImageInIssueAsyncInvoker(
        DownloadIpdImageInIssueRequest request) {
        return new AsyncInvoker<>(request, ProjectManMeta.downloadIpdImageInIssue, hcClient);
    }

    /**
     * 查询项目工作项列表
     *
     * 查询Ipd项目的工作项列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListIpdProjectIssuesRequest 请求对象
     * @return CompletableFuture<ListIpdProjectIssuesResponse>
     */
    public CompletableFuture<ListIpdProjectIssuesResponse> listIpdProjectIssuesAsync(
        ListIpdProjectIssuesRequest request) {
        return hcClient.asyncInvokeHttp(request, ProjectManMeta.listIpdProjectIssues);
    }

    /**
     * 查询项目工作项列表
     *
     * 查询Ipd项目的工作项列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListIpdProjectIssuesRequest 请求对象
     * @return AsyncInvoker<ListIpdProjectIssuesRequest, ListIpdProjectIssuesResponse>
     */
    public AsyncInvoker<ListIpdProjectIssuesRequest, ListIpdProjectIssuesResponse> listIpdProjectIssuesAsyncInvoker(
        ListIpdProjectIssuesRequest request) {
        return new AsyncInvoker<>(request, ProjectManMeta.listIpdProjectIssues, hcClient);
    }

    /**
     * 查询字段模板列表
     *
     * 工作项类型中查询字段模板列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListIssueFieldsRequest 请求对象
     * @return CompletableFuture<ListIssueFieldsResponse>
     */
    public CompletableFuture<ListIssueFieldsResponse> listIssueFieldsAsync(ListIssueFieldsRequest request) {
        return hcClient.asyncInvokeHttp(request, ProjectManMeta.listIssueFields);
    }

    /**
     * 查询字段模板列表
     *
     * 工作项类型中查询字段模板列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListIssueFieldsRequest 请求对象
     * @return AsyncInvoker<ListIssueFieldsRequest, ListIssueFieldsResponse>
     */
    public AsyncInvoker<ListIssueFieldsRequest, ListIssueFieldsResponse> listIssueFieldsAsyncInvoker(
        ListIssueFieldsRequest request) {
        return new AsyncInvoker<>(request, ProjectManMeta.listIssueFields, hcClient);
    }

    /**
     * 查询工作项状态
     *
     * 根据工作项查询工作项下的状态信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListIssueStatuesRequest 请求对象
     * @return CompletableFuture<ListIssueStatuesResponse>
     */
    public CompletableFuture<ListIssueStatuesResponse> listIssueStatuesAsync(ListIssueStatuesRequest request) {
        return hcClient.asyncInvokeHttp(request, ProjectManMeta.listIssueStatues);
    }

    /**
     * 查询工作项状态
     *
     * 根据工作项查询工作项下的状态信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListIssueStatuesRequest 请求对象
     * @return AsyncInvoker<ListIssueStatuesRequest, ListIssueStatuesResponse>
     */
    public AsyncInvoker<ListIssueStatuesRequest, ListIssueStatuesResponse> listIssueStatuesAsyncInvoker(
        ListIssueStatuesRequest request) {
        return new AsyncInvoker<>(request, ProjectManMeta.listIssueStatues, hcClient);
    }

    /**
     * 查询工作流字段配置信息
     *
     * 查询工作流字段配置信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowIssueConfigFieldsRequest 请求对象
     * @return CompletableFuture<ShowIssueConfigFieldsResponse>
     */
    public CompletableFuture<ShowIssueConfigFieldsResponse> showIssueConfigFieldsAsync(
        ShowIssueConfigFieldsRequest request) {
        return hcClient.asyncInvokeHttp(request, ProjectManMeta.showIssueConfigFields);
    }

    /**
     * 查询工作流字段配置信息
     *
     * 查询工作流字段配置信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowIssueConfigFieldsRequest 请求对象
     * @return AsyncInvoker<ShowIssueConfigFieldsRequest, ShowIssueConfigFieldsResponse>
     */
    public AsyncInvoker<ShowIssueConfigFieldsRequest, ShowIssueConfigFieldsResponse> showIssueConfigFieldsAsyncInvoker(
        ShowIssueConfigFieldsRequest request) {
        return new AsyncInvoker<>(request, ProjectManMeta.showIssueConfigFields, hcClient);
    }

    /**
     * 查询工作项详情
     *
     * 查询工作项详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowIssueDetailRequest 请求对象
     * @return CompletableFuture<ShowIssueDetailResponse>
     */
    public CompletableFuture<ShowIssueDetailResponse> showIssueDetailAsync(ShowIssueDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, ProjectManMeta.showIssueDetail);
    }

    /**
     * 查询工作项详情
     *
     * 查询工作项详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowIssueDetailRequest 请求对象
     * @return AsyncInvoker<ShowIssueDetailRequest, ShowIssueDetailResponse>
     */
    public AsyncInvoker<ShowIssueDetailRequest, ShowIssueDetailResponse> showIssueDetailAsyncInvoker(
        ShowIssueDetailRequest request) {
        return new AsyncInvoker<>(request, ProjectManMeta.showIssueDetail, hcClient);
    }

    /**
     * 获取工作流的详情及每条流转线的详情
     *
     * 获取工作流的详情及每条流转线的详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowWorkflowTemplateRequest 请求对象
     * @return CompletableFuture<ShowWorkflowTemplateResponse>
     */
    public CompletableFuture<ShowWorkflowTemplateResponse> showWorkflowTemplateAsync(
        ShowWorkflowTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, ProjectManMeta.showWorkflowTemplate);
    }

    /**
     * 获取工作流的详情及每条流转线的详情
     *
     * 获取工作流的详情及每条流转线的详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowWorkflowTemplateRequest 请求对象
     * @return AsyncInvoker<ShowWorkflowTemplateRequest, ShowWorkflowTemplateResponse>
     */
    public AsyncInvoker<ShowWorkflowTemplateRequest, ShowWorkflowTemplateResponse> showWorkflowTemplateAsyncInvoker(
        ShowWorkflowTemplateRequest request) {
        return new AsyncInvoker<>(request, ProjectManMeta.showWorkflowTemplate, hcClient);
    }

    /**
     * 修改工作项的状态
     *
     * 工作项流程流转
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request TransferWorkItemFlowRequest 请求对象
     * @return CompletableFuture<TransferWorkItemFlowResponse>
     */
    public CompletableFuture<TransferWorkItemFlowResponse> transferWorkItemFlowAsync(
        TransferWorkItemFlowRequest request) {
        return hcClient.asyncInvokeHttp(request, ProjectManMeta.transferWorkItemFlow);
    }

    /**
     * 修改工作项的状态
     *
     * 工作项流程流转
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request TransferWorkItemFlowRequest 请求对象
     * @return AsyncInvoker<TransferWorkItemFlowRequest, TransferWorkItemFlowResponse>
     */
    public AsyncInvoker<TransferWorkItemFlowRequest, TransferWorkItemFlowResponse> transferWorkItemFlowAsyncInvoker(
        TransferWorkItemFlowRequest request) {
        return new AsyncInvoker<>(request, ProjectManMeta.transferWorkItemFlow, hcClient);
    }

    /**
     * 上传图片到工作项描述中
     *
     * 上传图片并更新到工作项描述中
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UploadIpdImageInIssueRequest 请求对象
     * @return CompletableFuture<UploadIpdImageInIssueResponse>
     */
    public CompletableFuture<UploadIpdImageInIssueResponse> uploadIpdImageInIssueAsync(
        UploadIpdImageInIssueRequest request) {
        return hcClient.asyncInvokeHttp(request, ProjectManMeta.uploadIpdImageInIssue);
    }

    /**
     * 上传图片到工作项描述中
     *
     * 上传图片并更新到工作项描述中
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UploadIpdImageInIssueRequest 请求对象
     * @return AsyncInvoker<UploadIpdImageInIssueRequest, UploadIpdImageInIssueResponse>
     */
    public AsyncInvoker<UploadIpdImageInIssueRequest, UploadIpdImageInIssueResponse> uploadIpdImageInIssueAsyncInvoker(
        UploadIpdImageInIssueRequest request) {
        return new AsyncInvoker<>(request, ProjectManMeta.uploadIpdImageInIssue, hcClient);
    }

    /**
     * 根据ID下载工作项附件
     *
     * 根据ID下载工作项附件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadIpdIssueAttachmentRequest 请求对象
     * @return CompletableFuture<DownloadIpdIssueAttachmentResponse>
     */
    public CompletableFuture<DownloadIpdIssueAttachmentResponse> downloadIpdIssueAttachmentAsync(
        DownloadIpdIssueAttachmentRequest request) {
        return hcClient.asyncInvokeHttp(request, ProjectManMeta.downloadIpdIssueAttachment);
    }

    /**
     * 根据ID下载工作项附件
     *
     * 根据ID下载工作项附件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadIpdIssueAttachmentRequest 请求对象
     * @return AsyncInvoker<DownloadIpdIssueAttachmentRequest, DownloadIpdIssueAttachmentResponse>
     */
    public AsyncInvoker<DownloadIpdIssueAttachmentRequest, DownloadIpdIssueAttachmentResponse> downloadIpdIssueAttachmentAsyncInvoker(
        DownloadIpdIssueAttachmentRequest request) {
        return new AsyncInvoker<>(request, ProjectManMeta.downloadIpdIssueAttachment, hcClient);
    }

    /**
     * 查询工作项附件列表
     *
     * 查询工作项附件列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowIpdAttachmentByWorkItemIdRequest 请求对象
     * @return CompletableFuture<ShowIpdAttachmentByWorkItemIdResponse>
     */
    public CompletableFuture<ShowIpdAttachmentByWorkItemIdResponse> showIpdAttachmentByWorkItemIdAsync(
        ShowIpdAttachmentByWorkItemIdRequest request) {
        return hcClient.asyncInvokeHttp(request, ProjectManMeta.showIpdAttachmentByWorkItemId);
    }

    /**
     * 查询工作项附件列表
     *
     * 查询工作项附件列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowIpdAttachmentByWorkItemIdRequest 请求对象
     * @return AsyncInvoker<ShowIpdAttachmentByWorkItemIdRequest, ShowIpdAttachmentByWorkItemIdResponse>
     */
    public AsyncInvoker<ShowIpdAttachmentByWorkItemIdRequest, ShowIpdAttachmentByWorkItemIdResponse> showIpdAttachmentByWorkItemIdAsyncInvoker(
        ShowIpdAttachmentByWorkItemIdRequest request) {
        return new AsyncInvoker<>(request, ProjectManMeta.showIpdAttachmentByWorkItemId, hcClient);
    }

    /**
     * 新增需求规划
     *
     * 新增需求规划
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateScrumPlanToProjectRequest 请求对象
     * @return CompletableFuture<CreateScrumPlanToProjectResponse>
     */
    public CompletableFuture<CreateScrumPlanToProjectResponse> createScrumPlanToProjectAsync(
        CreateScrumPlanToProjectRequest request) {
        return hcClient.asyncInvokeHttp(request, ProjectManMeta.createScrumPlanToProject);
    }

    /**
     * 新增需求规划
     *
     * 新增需求规划
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateScrumPlanToProjectRequest 请求对象
     * @return AsyncInvoker<CreateScrumPlanToProjectRequest, CreateScrumPlanToProjectResponse>
     */
    public AsyncInvoker<CreateScrumPlanToProjectRequest, CreateScrumPlanToProjectResponse> createScrumPlanToProjectAsyncInvoker(
        CreateScrumPlanToProjectRequest request) {
        return new AsyncInvoker<>(request, ProjectManMeta.createScrumPlanToProject, hcClient);
    }

    /**
     * 删除规划(支持批量)
     *
     * 删除规划(支持批量)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteScrumPlanInProjectRequest 请求对象
     * @return CompletableFuture<DeleteScrumPlanInProjectResponse>
     */
    public CompletableFuture<DeleteScrumPlanInProjectResponse> deleteScrumPlanInProjectAsync(
        DeleteScrumPlanInProjectRequest request) {
        return hcClient.asyncInvokeHttp(request, ProjectManMeta.deleteScrumPlanInProject);
    }

    /**
     * 删除规划(支持批量)
     *
     * 删除规划(支持批量)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteScrumPlanInProjectRequest 请求对象
     * @return AsyncInvoker<DeleteScrumPlanInProjectRequest, DeleteScrumPlanInProjectResponse>
     */
    public AsyncInvoker<DeleteScrumPlanInProjectRequest, DeleteScrumPlanInProjectResponse> deleteScrumPlanInProjectAsyncInvoker(
        DeleteScrumPlanInProjectRequest request) {
        return new AsyncInvoker<>(request, ProjectManMeta.deleteScrumPlanInProject, hcClient);
    }

    /**
     * 查询项目下当前用户可见的所有规划，分页
     *
     * 查询项目下当前用户可见的所有规划，分页
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowScrumPlansByConditionRequest 请求对象
     * @return CompletableFuture<ShowScrumPlansByConditionResponse>
     */
    public CompletableFuture<ShowScrumPlansByConditionResponse> showScrumPlansByConditionAsync(
        ShowScrumPlansByConditionRequest request) {
        return hcClient.asyncInvokeHttp(request, ProjectManMeta.showScrumPlansByCondition);
    }

    /**
     * 查询项目下当前用户可见的所有规划，分页
     *
     * 查询项目下当前用户可见的所有规划，分页
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowScrumPlansByConditionRequest 请求对象
     * @return AsyncInvoker<ShowScrumPlansByConditionRequest, ShowScrumPlansByConditionResponse>
     */
    public AsyncInvoker<ShowScrumPlansByConditionRequest, ShowScrumPlansByConditionResponse> showScrumPlansByConditionAsyncInvoker(
        ShowScrumPlansByConditionRequest request) {
        return new AsyncInvoker<>(request, ProjectManMeta.showScrumPlansByCondition, hcClient);
    }

    /**
     * 更新需求规划
     *
     * 更新需求规划
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateScrumPlanInProjectRequest 请求对象
     * @return CompletableFuture<UpdateScrumPlanInProjectResponse>
     */
    public CompletableFuture<UpdateScrumPlanInProjectResponse> updateScrumPlanInProjectAsync(
        UpdateScrumPlanInProjectRequest request) {
        return hcClient.asyncInvokeHttp(request, ProjectManMeta.updateScrumPlanInProject);
    }

    /**
     * 更新需求规划
     *
     * 更新需求规划
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateScrumPlanInProjectRequest 请求对象
     * @return AsyncInvoker<UpdateScrumPlanInProjectRequest, UpdateScrumPlanInProjectResponse>
     */
    public AsyncInvoker<UpdateScrumPlanInProjectRequest, UpdateScrumPlanInProjectResponse> updateScrumPlanInProjectAsyncInvoker(
        UpdateScrumPlanInProjectRequest request) {
        return new AsyncInvoker<>(request, ProjectManMeta.updateScrumPlanInProject, hcClient);
    }

    /**
     * 添加指定工作项工时
     *
     * 添加指定工作项工时
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddIssueWorkHoursRequest 请求对象
     * @return CompletableFuture<AddIssueWorkHoursResponse>
     */
    public CompletableFuture<AddIssueWorkHoursResponse> addIssueWorkHoursAsync(AddIssueWorkHoursRequest request) {
        return hcClient.asyncInvokeHttp(request, ProjectManMeta.addIssueWorkHours);
    }

    /**
     * 添加指定工作项工时
     *
     * 添加指定工作项工时
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddIssueWorkHoursRequest 请求对象
     * @return AsyncInvoker<AddIssueWorkHoursRequest, AddIssueWorkHoursResponse>
     */
    public AsyncInvoker<AddIssueWorkHoursRequest, AddIssueWorkHoursResponse> addIssueWorkHoursAsyncInvoker(
        AddIssueWorkHoursRequest request) {
        return new AsyncInvoker<>(request, ProjectManMeta.addIssueWorkHours, hcClient);
    }

    /**
     * 批量删除工作项
     *
     * 批量删除工作项
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteIssuesV4Request 请求对象
     * @return CompletableFuture<BatchDeleteIssuesV4Response>
     */
    public CompletableFuture<BatchDeleteIssuesV4Response> batchDeleteIssuesV4Async(BatchDeleteIssuesV4Request request) {
        return hcClient.asyncInvokeHttp(request, ProjectManMeta.batchDeleteIssuesV4);
    }

    /**
     * 批量删除工作项
     *
     * 批量删除工作项
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteIssuesV4Request 请求对象
     * @return AsyncInvoker<BatchDeleteIssuesV4Request, BatchDeleteIssuesV4Response>
     */
    public AsyncInvoker<BatchDeleteIssuesV4Request, BatchDeleteIssuesV4Response> batchDeleteIssuesV4AsyncInvoker(
        BatchDeleteIssuesV4Request request) {
        return new AsyncInvoker<>(request, ProjectManMeta.batchDeleteIssuesV4, hcClient);
    }

    /**
     * 批量删除项目的迭代
     *
     * 批量删除项目的迭代
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteIterationsV4Request 请求对象
     * @return CompletableFuture<BatchDeleteIterationsV4Response>
     */
    public CompletableFuture<BatchDeleteIterationsV4Response> batchDeleteIterationsV4Async(
        BatchDeleteIterationsV4Request request) {
        return hcClient.asyncInvokeHttp(request, ProjectManMeta.batchDeleteIterationsV4);
    }

    /**
     * 批量删除项目的迭代
     *
     * 批量删除项目的迭代
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteIterationsV4Request 请求对象
     * @return AsyncInvoker<BatchDeleteIterationsV4Request, BatchDeleteIterationsV4Response>
     */
    public AsyncInvoker<BatchDeleteIterationsV4Request, BatchDeleteIterationsV4Response> batchDeleteIterationsV4AsyncInvoker(
        BatchDeleteIterationsV4Request request) {
        return new AsyncInvoker<>(request, ProjectManMeta.batchDeleteIterationsV4, hcClient);
    }

    /**
     * 查询当前项目下已经关联的工作项
     *
     * 查询当前项目下已经关联的工作项
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchListAssociatedIssuesRequest 请求对象
     * @return CompletableFuture<BatchListAssociatedIssuesResponse>
     */
    public CompletableFuture<BatchListAssociatedIssuesResponse> batchListAssociatedIssuesAsync(
        BatchListAssociatedIssuesRequest request) {
        return hcClient.asyncInvokeHttp(request, ProjectManMeta.batchListAssociatedIssues);
    }

    /**
     * 查询当前项目下已经关联的工作项
     *
     * 查询当前项目下已经关联的工作项
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchListAssociatedIssuesRequest 请求对象
     * @return AsyncInvoker<BatchListAssociatedIssuesRequest, BatchListAssociatedIssuesResponse>
     */
    public AsyncInvoker<BatchListAssociatedIssuesRequest, BatchListAssociatedIssuesResponse> batchListAssociatedIssuesAsyncInvoker(
        BatchListAssociatedIssuesRequest request) {
        return new AsyncInvoker<>(request, ProjectManMeta.batchListAssociatedIssues, hcClient);
    }

    /**
     * 取消领域与项目的关联关系
     *
     * 取消领域与项目的关联关系
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CancelProjectDomainRequest 请求对象
     * @return CompletableFuture<CancelProjectDomainResponse>
     */
    public CompletableFuture<CancelProjectDomainResponse> cancelProjectDomainAsync(CancelProjectDomainRequest request) {
        return hcClient.asyncInvokeHttp(request, ProjectManMeta.cancelProjectDomain);
    }

    /**
     * 取消领域与项目的关联关系
     *
     * 取消领域与项目的关联关系
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CancelProjectDomainRequest 请求对象
     * @return AsyncInvoker<CancelProjectDomainRequest, CancelProjectDomainResponse>
     */
    public AsyncInvoker<CancelProjectDomainRequest, CancelProjectDomainResponse> cancelProjectDomainAsyncInvoker(
        CancelProjectDomainRequest request) {
        return new AsyncInvoker<>(request, ProjectManMeta.cancelProjectDomain, hcClient);
    }

    /**
     * 创建工作项类型自定义字段
     *
     * 创建工作项类型自定义字段
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCustomfieldsRequest 请求对象
     * @return CompletableFuture<CreateCustomfieldsResponse>
     */
    public CompletableFuture<CreateCustomfieldsResponse> createCustomfieldsAsync(CreateCustomfieldsRequest request) {
        return hcClient.asyncInvokeHttp(request, ProjectManMeta.createCustomfields);
    }

    /**
     * 创建工作项类型自定义字段
     *
     * 创建工作项类型自定义字段
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCustomfieldsRequest 请求对象
     * @return AsyncInvoker<CreateCustomfieldsRequest, CreateCustomfieldsResponse>
     */
    public AsyncInvoker<CreateCustomfieldsRequest, CreateCustomfieldsResponse> createCustomfieldsAsyncInvoker(
        CreateCustomfieldsRequest request) {
        return new AsyncInvoker<>(request, ProjectManMeta.createCustomfields, hcClient);
    }

    /**
     * 创建工作项
     *
     * 创建工作项
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateIssueV4Request 请求对象
     * @return CompletableFuture<CreateIssueV4Response>
     */
    public CompletableFuture<CreateIssueV4Response> createIssueV4Async(CreateIssueV4Request request) {
        return hcClient.asyncInvokeHttp(request, ProjectManMeta.createIssueV4);
    }

    /**
     * 创建工作项
     *
     * 创建工作项
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateIssueV4Request 请求对象
     * @return AsyncInvoker<CreateIssueV4Request, CreateIssueV4Response>
     */
    public AsyncInvoker<CreateIssueV4Request, CreateIssueV4Response> createIssueV4AsyncInvoker(
        CreateIssueV4Request request) {
        return new AsyncInvoker<>(request, ProjectManMeta.createIssueV4, hcClient);
    }

    /**
     * 创建Scrum项目迭代
     *
     * 创建Scrum项目迭代
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateIterationV4Request 请求对象
     * @return CompletableFuture<CreateIterationV4Response>
     */
    public CompletableFuture<CreateIterationV4Response> createIterationV4Async(CreateIterationV4Request request) {
        return hcClient.asyncInvokeHttp(request, ProjectManMeta.createIterationV4);
    }

    /**
     * 创建Scrum项目迭代
     *
     * 创建Scrum项目迭代
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateIterationV4Request 请求对象
     * @return AsyncInvoker<CreateIterationV4Request, CreateIterationV4Response>
     */
    public AsyncInvoker<CreateIterationV4Request, CreateIterationV4Response> createIterationV4AsyncInvoker(
        CreateIterationV4Request request) {
        return new AsyncInvoker<>(request, ProjectManMeta.createIterationV4, hcClient);
    }

    /**
     * 创建项目的领域
     *
     * 查询项目的领域列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateProjectDomainRequest 请求对象
     * @return CompletableFuture<CreateProjectDomainResponse>
     */
    public CompletableFuture<CreateProjectDomainResponse> createProjectDomainAsync(CreateProjectDomainRequest request) {
        return hcClient.asyncInvokeHttp(request, ProjectManMeta.createProjectDomain);
    }

    /**
     * 创建项目的领域
     *
     * 查询项目的领域列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateProjectDomainRequest 请求对象
     * @return AsyncInvoker<CreateProjectDomainRequest, CreateProjectDomainResponse>
     */
    public AsyncInvoker<CreateProjectDomainRequest, CreateProjectDomainResponse> createProjectDomainAsyncInvoker(
        CreateProjectDomainRequest request) {
        return new AsyncInvoker<>(request, ProjectManMeta.createProjectDomain, hcClient);
    }

    /**
     * 创建项目的模块
     *
     * 查询项目的模块列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateProjectModuleRequest 请求对象
     * @return CompletableFuture<CreateProjectModuleResponse>
     */
    public CompletableFuture<CreateProjectModuleResponse> createProjectModuleAsync(CreateProjectModuleRequest request) {
        return hcClient.asyncInvokeHttp(request, ProjectManMeta.createProjectModule);
    }

    /**
     * 创建项目的模块
     *
     * 查询项目的模块列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateProjectModuleRequest 请求对象
     * @return AsyncInvoker<CreateProjectModuleRequest, CreateProjectModuleResponse>
     */
    public AsyncInvoker<CreateProjectModuleRequest, CreateProjectModuleResponse> createProjectModuleAsyncInvoker(
        CreateProjectModuleRequest request) {
        return new AsyncInvoker<>(request, ProjectManMeta.createProjectModule, hcClient);
    }

    /**
     * 细粒度权限用户创建工作项
     *
     * 拥有IAM细粒度权限（projectmanConfig:systemSettingField:set）且在devcloud项目中有创建工作项的权限的用户可以设置工作项的创建者
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSystemIssueV4Request 请求对象
     * @return CompletableFuture<CreateSystemIssueV4Response>
     */
    public CompletableFuture<CreateSystemIssueV4Response> createSystemIssueV4Async(CreateSystemIssueV4Request request) {
        return hcClient.asyncInvokeHttp(request, ProjectManMeta.createSystemIssueV4);
    }

    /**
     * 细粒度权限用户创建工作项
     *
     * 拥有IAM细粒度权限（projectmanConfig:systemSettingField:set）且在devcloud项目中有创建工作项的权限的用户可以设置工作项的创建者
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSystemIssueV4Request 请求对象
     * @return AsyncInvoker<CreateSystemIssueV4Request, CreateSystemIssueV4Response>
     */
    public AsyncInvoker<CreateSystemIssueV4Request, CreateSystemIssueV4Response> createSystemIssueV4AsyncInvoker(
        CreateSystemIssueV4Request request) {
        return new AsyncInvoker<>(request, ProjectManMeta.createSystemIssueV4, hcClient);
    }

    /**
     * 删除附件
     *
     * 取消工作项与附件关联，如附件为工作项页面上传则删除附件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAttachmentRequest 请求对象
     * @return CompletableFuture<DeleteAttachmentResponse>
     */
    public CompletableFuture<DeleteAttachmentResponse> deleteAttachmentAsync(DeleteAttachmentRequest request) {
        return hcClient.asyncInvokeHttp(request, ProjectManMeta.deleteAttachment);
    }

    /**
     * 删除附件
     *
     * 取消工作项与附件关联，如附件为工作项页面上传则删除附件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAttachmentRequest 请求对象
     * @return AsyncInvoker<DeleteAttachmentRequest, DeleteAttachmentResponse>
     */
    public AsyncInvoker<DeleteAttachmentRequest, DeleteAttachmentResponse> deleteAttachmentAsyncInvoker(
        DeleteAttachmentRequest request) {
        return new AsyncInvoker<>(request, ProjectManMeta.deleteAttachment, hcClient);
    }

    /**
     * 删除工作项
     *
     * 删除工作项
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteIssueV4Request 请求对象
     * @return CompletableFuture<DeleteIssueV4Response>
     */
    public CompletableFuture<DeleteIssueV4Response> deleteIssueV4Async(DeleteIssueV4Request request) {
        return hcClient.asyncInvokeHttp(request, ProjectManMeta.deleteIssueV4);
    }

    /**
     * 删除工作项
     *
     * 删除工作项
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteIssueV4Request 请求对象
     * @return AsyncInvoker<DeleteIssueV4Request, DeleteIssueV4Response>
     */
    public AsyncInvoker<DeleteIssueV4Request, DeleteIssueV4Response> deleteIssueV4AsyncInvoker(
        DeleteIssueV4Request request) {
        return new AsyncInvoker<>(request, ProjectManMeta.deleteIssueV4, hcClient);
    }

    /**
     * 删除项目迭代
     *
     * 删除项目迭代
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteIterationV4Request 请求对象
     * @return CompletableFuture<DeleteIterationV4Response>
     */
    public CompletableFuture<DeleteIterationV4Response> deleteIterationV4Async(DeleteIterationV4Request request) {
        return hcClient.asyncInvokeHttp(request, ProjectManMeta.deleteIterationV4);
    }

    /**
     * 删除项目迭代
     *
     * 删除项目迭代
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteIterationV4Request 请求对象
     * @return AsyncInvoker<DeleteIterationV4Request, DeleteIterationV4Response>
     */
    public AsyncInvoker<DeleteIterationV4Request, DeleteIterationV4Response> deleteIterationV4AsyncInvoker(
        DeleteIterationV4Request request) {
        return new AsyncInvoker<>(request, ProjectManMeta.deleteIterationV4, hcClient);
    }

    /**
     * 删除项目的模块
     *
     * 删除项目的模块
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteProjectModuleRequest 请求对象
     * @return CompletableFuture<DeleteProjectModuleResponse>
     */
    public CompletableFuture<DeleteProjectModuleResponse> deleteProjectModuleAsync(DeleteProjectModuleRequest request) {
        return hcClient.asyncInvokeHttp(request, ProjectManMeta.deleteProjectModule);
    }

    /**
     * 删除项目的模块
     *
     * 删除项目的模块
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteProjectModuleRequest 请求对象
     * @return AsyncInvoker<DeleteProjectModuleRequest, DeleteProjectModuleResponse>
     */
    public AsyncInvoker<DeleteProjectModuleRequest, DeleteProjectModuleResponse> deleteProjectModuleAsyncInvoker(
        DeleteProjectModuleRequest request) {
        return new AsyncInvoker<>(request, ProjectManMeta.deleteProjectModule, hcClient);
    }

    /**
     * 下载工作项附件
     *
     * 下载工作项附件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadAttachmentRequest 请求对象
     * @return CompletableFuture<DownloadAttachmentResponse>
     */
    public CompletableFuture<DownloadAttachmentResponse> downloadAttachmentAsync(DownloadAttachmentRequest request) {
        return hcClient.asyncInvokeHttp(request, ProjectManMeta.downloadAttachment);
    }

    /**
     * 下载工作项附件
     *
     * 下载工作项附件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadAttachmentRequest 请求对象
     * @return AsyncInvoker<DownloadAttachmentRequest, DownloadAttachmentResponse>
     */
    public AsyncInvoker<DownloadAttachmentRequest, DownloadAttachmentResponse> downloadAttachmentAsyncInvoker(
        DownloadAttachmentRequest request) {
        return new AsyncInvoker<>(request, ProjectManMeta.downloadAttachment, hcClient);
    }

    /**
     * 下载图片
     *
     * 下载图片
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadImageFileRequest 请求对象
     * @return CompletableFuture<DownloadImageFileResponse>
     */
    public CompletableFuture<DownloadImageFileResponse> downloadImageFileAsync(DownloadImageFileRequest request) {
        return hcClient.asyncInvokeHttp(request, ProjectManMeta.downloadImageFile);
    }

    /**
     * 下载图片
     *
     * 下载图片
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadImageFileRequest 请求对象
     * @return AsyncInvoker<DownloadImageFileRequest, DownloadImageFileResponse>
     */
    public AsyncInvoker<DownloadImageFileRequest, DownloadImageFileResponse> downloadImageFileAsyncInvoker(
        DownloadImageFileRequest request) {
        return new AsyncInvoker<>(request, ProjectManMeta.downloadImageFile, hcClient);
    }

    /**
     * 查询当前工作项已经关联的工作项
     *
     * 查询当前工作项已经关联的工作项
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAssociatedIssuesRequest 请求对象
     * @return CompletableFuture<ListAssociatedIssuesResponse>
     */
    public CompletableFuture<ListAssociatedIssuesResponse> listAssociatedIssuesAsync(
        ListAssociatedIssuesRequest request) {
        return hcClient.asyncInvokeHttp(request, ProjectManMeta.listAssociatedIssues);
    }

    /**
     * 查询当前工作项已经关联的工作项
     *
     * 查询当前工作项已经关联的工作项
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAssociatedIssuesRequest 请求对象
     * @return AsyncInvoker<ListAssociatedIssuesRequest, ListAssociatedIssuesResponse>
     */
    public AsyncInvoker<ListAssociatedIssuesRequest, ListAssociatedIssuesResponse> listAssociatedIssuesAsyncInvoker(
        ListAssociatedIssuesRequest request) {
        return new AsyncInvoker<>(request, ProjectManMeta.listAssociatedIssues, hcClient);
    }

    /**
     * 查询关联用例
     *
     * 查询关联用例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAssociatedTestCasesRequest 请求对象
     * @return CompletableFuture<ListAssociatedTestCasesResponse>
     */
    public CompletableFuture<ListAssociatedTestCasesResponse> listAssociatedTestCasesAsync(
        ListAssociatedTestCasesRequest request) {
        return hcClient.asyncInvokeHttp(request, ProjectManMeta.listAssociatedTestCases);
    }

    /**
     * 查询关联用例
     *
     * 查询关联用例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAssociatedTestCasesRequest 请求对象
     * @return AsyncInvoker<ListAssociatedTestCasesRequest, ListAssociatedTestCasesResponse>
     */
    public AsyncInvoker<ListAssociatedTestCasesRequest, ListAssociatedTestCasesResponse> listAssociatedTestCasesAsyncInvoker(
        ListAssociatedTestCasesRequest request) {
        return new AsyncInvoker<>(request, ProjectManMeta.listAssociatedTestCases, hcClient);
    }

    /**
     * 查询当前工作项已经关联的关联Wiki
     *
     * 查询当前工作项已经关联的关联Wiki
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAssociatedWikisRequest 请求对象
     * @return CompletableFuture<ListAssociatedWikisResponse>
     */
    public CompletableFuture<ListAssociatedWikisResponse> listAssociatedWikisAsync(ListAssociatedWikisRequest request) {
        return hcClient.asyncInvokeHttp(request, ProjectManMeta.listAssociatedWikis);
    }

    /**
     * 查询当前工作项已经关联的关联Wiki
     *
     * 查询当前工作项已经关联的关联Wiki
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAssociatedWikisRequest 请求对象
     * @return AsyncInvoker<ListAssociatedWikisRequest, ListAssociatedWikisResponse>
     */
    public AsyncInvoker<ListAssociatedWikisRequest, ListAssociatedWikisResponse> listAssociatedWikisAsyncInvoker(
        ListAssociatedWikisRequest request) {
        return new AsyncInvoker<>(request, ProjectManMeta.listAssociatedWikis, hcClient);
    }

    /**
     * 获取子工作项
     *
     * 获取子工作项
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListChildIssuesV4Request 请求对象
     * @return CompletableFuture<ListChildIssuesV4Response>
     */
    public CompletableFuture<ListChildIssuesV4Response> listChildIssuesV4Async(ListChildIssuesV4Request request) {
        return hcClient.asyncInvokeHttp(request, ProjectManMeta.listChildIssuesV4);
    }

    /**
     * 获取子工作项
     *
     * 获取子工作项
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListChildIssuesV4Request 请求对象
     * @return AsyncInvoker<ListChildIssuesV4Request, ListChildIssuesV4Response>
     */
    public AsyncInvoker<ListChildIssuesV4Request, ListChildIssuesV4Response> listChildIssuesV4AsyncInvoker(
        ListChildIssuesV4Request request) {
        return new AsyncInvoker<>(request, ProjectManMeta.listChildIssuesV4, hcClient);
    }

    /**
     * 查询当前工作项已经关联的代码提交记录 / 分支创建记录
     *
     * 查询当前工作项已经关联的代码提交记录 / 分支创建记录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListIssueAssociatedCommitsRequest 请求对象
     * @return CompletableFuture<ListIssueAssociatedCommitsResponse>
     */
    public CompletableFuture<ListIssueAssociatedCommitsResponse> listIssueAssociatedCommitsAsync(
        ListIssueAssociatedCommitsRequest request) {
        return hcClient.asyncInvokeHttp(request, ProjectManMeta.listIssueAssociatedCommits);
    }

    /**
     * 查询当前工作项已经关联的代码提交记录 / 分支创建记录
     *
     * 查询当前工作项已经关联的代码提交记录 / 分支创建记录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListIssueAssociatedCommitsRequest 请求对象
     * @return AsyncInvoker<ListIssueAssociatedCommitsRequest, ListIssueAssociatedCommitsResponse>
     */
    public AsyncInvoker<ListIssueAssociatedCommitsRequest, ListIssueAssociatedCommitsResponse> listIssueAssociatedCommitsAsyncInvoker(
        ListIssueAssociatedCommitsRequest request) {
        return new AsyncInvoker<>(request, ProjectManMeta.listIssueAssociatedCommits, hcClient);
    }

    /**
     * 获取指定工作项的评论列表
     *
     * 获取工作项的评论
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListIssueCommentsV4Request 请求对象
     * @return CompletableFuture<ListIssueCommentsV4Response>
     */
    public CompletableFuture<ListIssueCommentsV4Response> listIssueCommentsV4Async(ListIssueCommentsV4Request request) {
        return hcClient.asyncInvokeHttp(request, ProjectManMeta.listIssueCommentsV4);
    }

    /**
     * 获取指定工作项的评论列表
     *
     * 获取工作项的评论
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListIssueCommentsV4Request 请求对象
     * @return AsyncInvoker<ListIssueCommentsV4Request, ListIssueCommentsV4Response>
     */
    public AsyncInvoker<ListIssueCommentsV4Request, ListIssueCommentsV4Response> listIssueCommentsV4AsyncInvoker(
        ListIssueCommentsV4Request request) {
        return new AsyncInvoker<>(request, ProjectManMeta.listIssueCommentsV4, hcClient);
    }

    /**
     * 查询Scrum工作项自定义字段
     *
     * 查询Scrum工作项自定义字段的可选列表,符合custom_fields或者names条件的都返回,2个值都不传，返回所有的自定义字段列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListIssueCustomFieldsRequest 请求对象
     * @return CompletableFuture<ListIssueCustomFieldsResponse>
     */
    public CompletableFuture<ListIssueCustomFieldsResponse> listIssueCustomFieldsAsync(
        ListIssueCustomFieldsRequest request) {
        return hcClient.asyncInvokeHttp(request, ProjectManMeta.listIssueCustomFields);
    }

    /**
     * 查询Scrum工作项自定义字段
     *
     * 查询Scrum工作项自定义字段的可选列表,符合custom_fields或者names条件的都返回,2个值都不传，返回所有的自定义字段列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListIssueCustomFieldsRequest 请求对象
     * @return AsyncInvoker<ListIssueCustomFieldsRequest, ListIssueCustomFieldsResponse>
     */
    public AsyncInvoker<ListIssueCustomFieldsRequest, ListIssueCustomFieldsResponse> listIssueCustomFieldsAsyncInvoker(
        ListIssueCustomFieldsRequest request) {
        return new AsyncInvoker<>(request, ProjectManMeta.listIssueCustomFields, hcClient);
    }

    /**
     * 获取工作项历史记录
     *
     * 获取工作项历史记录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListIssueRecordsV4Request 请求对象
     * @return CompletableFuture<ListIssueRecordsV4Response>
     */
    public CompletableFuture<ListIssueRecordsV4Response> listIssueRecordsV4Async(ListIssueRecordsV4Request request) {
        return hcClient.asyncInvokeHttp(request, ProjectManMeta.listIssueRecordsV4);
    }

    /**
     * 获取工作项历史记录
     *
     * 获取工作项历史记录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListIssueRecordsV4Request 请求对象
     * @return AsyncInvoker<ListIssueRecordsV4Request, ListIssueRecordsV4Response>
     */
    public AsyncInvoker<ListIssueRecordsV4Request, ListIssueRecordsV4Response> listIssueRecordsV4AsyncInvoker(
        ListIssueRecordsV4Request request) {
        return new AsyncInvoker<>(request, ProjectManMeta.listIssueRecordsV4, hcClient);
    }

    /**
     * 查询项目的工作项
     *
     * 工作项类型id, 分页参数，创建时间查询项目的工作项
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListIssuesSfV4Request 请求对象
     * @return CompletableFuture<ListIssuesSfV4Response>
     */
    public CompletableFuture<ListIssuesSfV4Response> listIssuesSfV4Async(ListIssuesSfV4Request request) {
        return hcClient.asyncInvokeHttp(request, ProjectManMeta.listIssuesSfV4);
    }

    /**
     * 查询项目的工作项
     *
     * 工作项类型id, 分页参数，创建时间查询项目的工作项
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListIssuesSfV4Request 请求对象
     * @return AsyncInvoker<ListIssuesSfV4Request, ListIssuesSfV4Response>
     */
    public AsyncInvoker<ListIssuesSfV4Request, ListIssuesSfV4Response> listIssuesSfV4AsyncInvoker(
        ListIssuesSfV4Request request) {
        return new AsyncInvoker<>(request, ProjectManMeta.listIssuesSfV4, hcClient);
    }

    /**
     * 高级查询工作项
     *
     * 根据筛选条件查询工作项
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListIssuesV4Request 请求对象
     * @return CompletableFuture<ListIssuesV4Response>
     */
    public CompletableFuture<ListIssuesV4Response> listIssuesV4Async(ListIssuesV4Request request) {
        return hcClient.asyncInvokeHttp(request, ProjectManMeta.listIssuesV4);
    }

    /**
     * 高级查询工作项
     *
     * 根据筛选条件查询工作项
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListIssuesV4Request 请求对象
     * @return AsyncInvoker<ListIssuesV4Request, ListIssuesV4Response>
     */
    public AsyncInvoker<ListIssuesV4Request, ListIssuesV4Response> listIssuesV4AsyncInvoker(
        ListIssuesV4Request request) {
        return new AsyncInvoker<>(request, ProjectManMeta.listIssuesV4, hcClient);
    }

    /**
     * 查看迭代历史记录
     *
     * 查看迭代历史记录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListIterationHistoriesRequest 请求对象
     * @return CompletableFuture<ListIterationHistoriesResponse>
     */
    public CompletableFuture<ListIterationHistoriesResponse> listIterationHistoriesAsync(
        ListIterationHistoriesRequest request) {
        return hcClient.asyncInvokeHttp(request, ProjectManMeta.listIterationHistories);
    }

    /**
     * 查看迭代历史记录
     *
     * 查看迭代历史记录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListIterationHistoriesRequest 请求对象
     * @return AsyncInvoker<ListIterationHistoriesRequest, ListIterationHistoriesResponse>
     */
    public AsyncInvoker<ListIterationHistoriesRequest, ListIterationHistoriesResponse> listIterationHistoriesAsyncInvoker(
        ListIterationHistoriesRequest request) {
        return new AsyncInvoker<>(request, ProjectManMeta.listIterationHistories, hcClient);
    }

    /**
     * 查询项目的领域列表
     *
     * 查询项目的领域列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectDomainsRequest 请求对象
     * @return CompletableFuture<ListProjectDomainsResponse>
     */
    public CompletableFuture<ListProjectDomainsResponse> listProjectDomainsAsync(ListProjectDomainsRequest request) {
        return hcClient.asyncInvokeHttp(request, ProjectManMeta.listProjectDomains);
    }

    /**
     * 查询项目的领域列表
     *
     * 查询项目的领域列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectDomainsRequest 请求对象
     * @return AsyncInvoker<ListProjectDomainsRequest, ListProjectDomainsResponse>
     */
    public AsyncInvoker<ListProjectDomainsRequest, ListProjectDomainsResponse> listProjectDomainsAsyncInvoker(
        ListProjectDomainsRequest request) {
        return new AsyncInvoker<>(request, ProjectManMeta.listProjectDomains, hcClient);
    }

    /**
     * 查询项目下所有工作项的历史记录
     *
     * 查询项目下所有工作项的历史记录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectIssuesRecordsV4Request 请求对象
     * @return CompletableFuture<ListProjectIssuesRecordsV4Response>
     */
    public CompletableFuture<ListProjectIssuesRecordsV4Response> listProjectIssuesRecordsV4Async(
        ListProjectIssuesRecordsV4Request request) {
        return hcClient.asyncInvokeHttp(request, ProjectManMeta.listProjectIssuesRecordsV4);
    }

    /**
     * 查询项目下所有工作项的历史记录
     *
     * 查询项目下所有工作项的历史记录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectIssuesRecordsV4Request 请求对象
     * @return AsyncInvoker<ListProjectIssuesRecordsV4Request, ListProjectIssuesRecordsV4Response>
     */
    public AsyncInvoker<ListProjectIssuesRecordsV4Request, ListProjectIssuesRecordsV4Response> listProjectIssuesRecordsV4AsyncInvoker(
        ListProjectIssuesRecordsV4Request request) {
        return new AsyncInvoker<>(request, ProjectManMeta.listProjectIssuesRecordsV4, hcClient);
    }

    /**
     * 获取指定项目的迭代列表
     *
     * 获取项目迭代
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectIterationsV4Request 请求对象
     * @return CompletableFuture<ListProjectIterationsV4Response>
     */
    public CompletableFuture<ListProjectIterationsV4Response> listProjectIterationsV4Async(
        ListProjectIterationsV4Request request) {
        return hcClient.asyncInvokeHttp(request, ProjectManMeta.listProjectIterationsV4);
    }

    /**
     * 获取指定项目的迭代列表
     *
     * 获取项目迭代
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectIterationsV4Request 请求对象
     * @return AsyncInvoker<ListProjectIterationsV4Request, ListProjectIterationsV4Response>
     */
    public AsyncInvoker<ListProjectIterationsV4Request, ListProjectIterationsV4Response> listProjectIterationsV4AsyncInvoker(
        ListProjectIterationsV4Request request) {
        return new AsyncInvoker<>(request, ProjectManMeta.listProjectIterationsV4, hcClient);
    }

    /**
     * 查询项目的模块列表
     *
     * 查询项目的模块列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectModulesRequest 请求对象
     * @return CompletableFuture<ListProjectModulesResponse>
     */
    public CompletableFuture<ListProjectModulesResponse> listProjectModulesAsync(ListProjectModulesRequest request) {
        return hcClient.asyncInvokeHttp(request, ProjectManMeta.listProjectModules);
    }

    /**
     * 查询项目的模块列表
     *
     * 查询项目的模块列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectModulesRequest 请求对象
     * @return AsyncInvoker<ListProjectModulesRequest, ListProjectModulesResponse>
     */
    public AsyncInvoker<ListProjectModulesRequest, ListProjectModulesResponse> listProjectModulesAsyncInvoker(
        ListProjectModulesRequest request) {
        return new AsyncInvoker<>(request, ProjectManMeta.listProjectModules, hcClient);
    }

    /**
     * 按用户查询工时（多项目）
     *
     * 按用户查询工时（多项目）
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectWorkHoursRequest 请求对象
     * @return CompletableFuture<ListProjectWorkHoursResponse>
     */
    public CompletableFuture<ListProjectWorkHoursResponse> listProjectWorkHoursAsync(
        ListProjectWorkHoursRequest request) {
        return hcClient.asyncInvokeHttp(request, ProjectManMeta.listProjectWorkHours);
    }

    /**
     * 按用户查询工时（多项目）
     *
     * 按用户查询工时（多项目）
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectWorkHoursRequest 请求对象
     * @return AsyncInvoker<ListProjectWorkHoursRequest, ListProjectWorkHoursResponse>
     */
    public AsyncInvoker<ListProjectWorkHoursRequest, ListProjectWorkHoursResponse> listProjectWorkHoursAsyncInvoker(
        ListProjectWorkHoursRequest request) {
        return new AsyncInvoker<>(request, ProjectManMeta.listProjectWorkHours, hcClient);
    }

    /**
     * 查询项目下的工时类型
     *
     * 查询项目下的工时类型
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectWorkHoursTypeRequest 请求对象
     * @return CompletableFuture<ListProjectWorkHoursTypeResponse>
     */
    public CompletableFuture<ListProjectWorkHoursTypeResponse> listProjectWorkHoursTypeAsync(
        ListProjectWorkHoursTypeRequest request) {
        return hcClient.asyncInvokeHttp(request, ProjectManMeta.listProjectWorkHoursType);
    }

    /**
     * 查询项目下的工时类型
     *
     * 查询项目下的工时类型
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectWorkHoursTypeRequest 请求对象
     * @return AsyncInvoker<ListProjectWorkHoursTypeRequest, ListProjectWorkHoursTypeResponse>
     */
    public AsyncInvoker<ListProjectWorkHoursTypeRequest, ListProjectWorkHoursTypeResponse> listProjectWorkHoursTypeAsyncInvoker(
        ListProjectWorkHoursTypeRequest request) {
        return new AsyncInvoker<>(request, ProjectManMeta.listProjectWorkHoursType, hcClient);
    }

    /**
     * 查询项目的状态列表
     *
     * 查询项目的状态列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListScrumProjectStatusesRequest 请求对象
     * @return CompletableFuture<ListScrumProjectStatusesResponse>
     */
    public CompletableFuture<ListScrumProjectStatusesResponse> listScrumProjectStatusesAsync(
        ListScrumProjectStatusesRequest request) {
        return hcClient.asyncInvokeHttp(request, ProjectManMeta.listScrumProjectStatuses);
    }

    /**
     * 查询项目的状态列表
     *
     * 查询项目的状态列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListScrumProjectStatusesRequest 请求对象
     * @return AsyncInvoker<ListScrumProjectStatusesRequest, ListScrumProjectStatusesResponse>
     */
    public AsyncInvoker<ListScrumProjectStatusesRequest, ListScrumProjectStatusesResponse> listScrumProjectStatusesAsyncInvoker(
        ListScrumProjectStatusesRequest request) {
        return new AsyncInvoker<>(request, ProjectManMeta.listScrumProjectStatuses, hcClient);
    }

    /**
     * 获取指定工作项停留时间
     *
     * 获取指定工作项停留时间
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSpecIssueStayTimesRequest 请求对象
     * @return CompletableFuture<ListSpecIssueStayTimesResponse>
     */
    public CompletableFuture<ListSpecIssueStayTimesResponse> listSpecIssueStayTimesAsync(
        ListSpecIssueStayTimesRequest request) {
        return hcClient.asyncInvokeHttp(request, ProjectManMeta.listSpecIssueStayTimes);
    }

    /**
     * 获取指定工作项停留时间
     *
     * 获取指定工作项停留时间
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSpecIssueStayTimesRequest 请求对象
     * @return AsyncInvoker<ListSpecIssueStayTimesRequest, ListSpecIssueStayTimesResponse>
     */
    public AsyncInvoker<ListSpecIssueStayTimesRequest, ListSpecIssueStayTimesResponse> listSpecIssueStayTimesAsyncInvoker(
        ListSpecIssueStayTimesRequest request) {
        return new AsyncInvoker<>(request, ProjectManMeta.listSpecIssueStayTimes, hcClient);
    }

    /**
     * 查询迭代下工作项状态的统计数据（处理人维度）
     *
     * 查询迭代下工作项状态的统计数据（处理人维度）
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListStatusStatisticRequest 请求对象
     * @return CompletableFuture<ListStatusStatisticResponse>
     */
    public CompletableFuture<ListStatusStatisticResponse> listStatusStatisticAsync(ListStatusStatisticRequest request) {
        return hcClient.asyncInvokeHttp(request, ProjectManMeta.listStatusStatistic);
    }

    /**
     * 查询迭代下工作项状态的统计数据（处理人维度）
     *
     * 查询迭代下工作项状态的统计数据（处理人维度）
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListStatusStatisticRequest 请求对象
     * @return AsyncInvoker<ListStatusStatisticRequest, ListStatusStatisticResponse>
     */
    public AsyncInvoker<ListStatusStatisticRequest, ListStatusStatisticResponse> listStatusStatisticAsyncInvoker(
        ListStatusStatisticRequest request) {
        return new AsyncInvoker<>(request, ProjectManMeta.listStatusStatistic, hcClient);
    }

    /**
     * 高级查询我的待办工作项
     *
     * 高级查询我的待办工作项
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchIssuesRequest 请求对象
     * @return CompletableFuture<SearchIssuesResponse>
     */
    public CompletableFuture<SearchIssuesResponse> searchIssuesAsync(SearchIssuesRequest request) {
        return hcClient.asyncInvokeHttp(request, ProjectManMeta.searchIssues);
    }

    /**
     * 高级查询我的待办工作项
     *
     * 高级查询我的待办工作项
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchIssuesRequest 请求对象
     * @return AsyncInvoker<SearchIssuesRequest, SearchIssuesResponse>
     */
    public AsyncInvoker<SearchIssuesRequest, SearchIssuesResponse> searchIssuesAsyncInvoker(
        SearchIssuesRequest request) {
        return new AsyncInvoker<>(request, ProjectManMeta.searchIssues, hcClient);
    }

    /**
     * 获取工作项完成率
     *
     * 获取工作项的完成率
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowIssueCompletionRateRequest 请求对象
     * @return CompletableFuture<ShowIssueCompletionRateResponse>
     */
    public CompletableFuture<ShowIssueCompletionRateResponse> showIssueCompletionRateAsync(
        ShowIssueCompletionRateRequest request) {
        return hcClient.asyncInvokeHttp(request, ProjectManMeta.showIssueCompletionRate);
    }

    /**
     * 获取工作项完成率
     *
     * 获取工作项的完成率
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowIssueCompletionRateRequest 请求对象
     * @return AsyncInvoker<ShowIssueCompletionRateRequest, ShowIssueCompletionRateResponse>
     */
    public AsyncInvoker<ShowIssueCompletionRateRequest, ShowIssueCompletionRateResponse> showIssueCompletionRateAsyncInvoker(
        ShowIssueCompletionRateRequest request) {
        return new AsyncInvoker<>(request, ProjectManMeta.showIssueCompletionRate, hcClient);
    }

    /**
     * 查询工作项详情
     *
     * 查询工作项详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowIssueV4Request 请求对象
     * @return CompletableFuture<ShowIssueV4Response>
     */
    public CompletableFuture<ShowIssueV4Response> showIssueV4Async(ShowIssueV4Request request) {
        return hcClient.asyncInvokeHttp(request, ProjectManMeta.showIssueV4);
    }

    /**
     * 查询工作项详情
     *
     * 查询工作项详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowIssueV4Request 请求对象
     * @return AsyncInvoker<ShowIssueV4Request, ShowIssueV4Response>
     */
    public AsyncInvoker<ShowIssueV4Request, ShowIssueV4Response> showIssueV4AsyncInvoker(ShowIssueV4Request request) {
        return new AsyncInvoker<>(request, ProjectManMeta.showIssueV4, hcClient);
    }

    /**
     * 查询Scrum项目的工作项流转配置
     *
     * 查询Scrum项目的工作项流转配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowIssuesWrokFlowConfigRequest 请求对象
     * @return CompletableFuture<ShowIssuesWrokFlowConfigResponse>
     */
    public CompletableFuture<ShowIssuesWrokFlowConfigResponse> showIssuesWrokFlowConfigAsync(
        ShowIssuesWrokFlowConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, ProjectManMeta.showIssuesWrokFlowConfig);
    }

    /**
     * 查询Scrum项目的工作项流转配置
     *
     * 查询Scrum项目的工作项流转配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowIssuesWrokFlowConfigRequest 请求对象
     * @return AsyncInvoker<ShowIssuesWrokFlowConfigRequest, ShowIssuesWrokFlowConfigResponse>
     */
    public AsyncInvoker<ShowIssuesWrokFlowConfigRequest, ShowIssuesWrokFlowConfigResponse> showIssuesWrokFlowConfigAsyncInvoker(
        ShowIssuesWrokFlowConfigRequest request) {
        return new AsyncInvoker<>(request, ProjectManMeta.showIssuesWrokFlowConfig, hcClient);
    }

    /**
     * 查看迭代详情
     *
     * 查看迭代详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowIterationV4Request 请求对象
     * @return CompletableFuture<ShowIterationV4Response>
     */
    public CompletableFuture<ShowIterationV4Response> showIterationV4Async(ShowIterationV4Request request) {
        return hcClient.asyncInvokeHttp(request, ProjectManMeta.showIterationV4);
    }

    /**
     * 查看迭代详情
     *
     * 查看迭代详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowIterationV4Request 请求对象
     * @return AsyncInvoker<ShowIterationV4Request, ShowIterationV4Response>
     */
    public AsyncInvoker<ShowIterationV4Request, ShowIterationV4Response> showIterationV4AsyncInvoker(
        ShowIterationV4Request request) {
        return new AsyncInvoker<>(request, ProjectManMeta.showIterationV4, hcClient);
    }

    /**
     * 按用户查询工时（单项目）
     *
     * 按用户查询工时（单项目）
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowProjectWorkHoursRequest 请求对象
     * @return CompletableFuture<ShowProjectWorkHoursResponse>
     */
    public CompletableFuture<ShowProjectWorkHoursResponse> showProjectWorkHoursAsync(
        ShowProjectWorkHoursRequest request) {
        return hcClient.asyncInvokeHttp(request, ProjectManMeta.showProjectWorkHours);
    }

    /**
     * 按用户查询工时（单项目）
     *
     * 按用户查询工时（单项目）
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowProjectWorkHoursRequest 请求对象
     * @return AsyncInvoker<ShowProjectWorkHoursRequest, ShowProjectWorkHoursResponse>
     */
    public AsyncInvoker<ShowProjectWorkHoursRequest, ShowProjectWorkHoursResponse> showProjectWorkHoursAsyncInvoker(
        ShowProjectWorkHoursRequest request) {
        return new AsyncInvoker<>(request, ProjectManMeta.showProjectWorkHours, hcClient);
    }

    /**
     * 更新工作项
     *
     * 更新工作项
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateIssueV4Request 请求对象
     * @return CompletableFuture<UpdateIssueV4Response>
     */
    public CompletableFuture<UpdateIssueV4Response> updateIssueV4Async(UpdateIssueV4Request request) {
        return hcClient.asyncInvokeHttp(request, ProjectManMeta.updateIssueV4);
    }

    /**
     * 更新工作项
     *
     * 更新工作项
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateIssueV4Request 请求对象
     * @return AsyncInvoker<UpdateIssueV4Request, UpdateIssueV4Response>
     */
    public AsyncInvoker<UpdateIssueV4Request, UpdateIssueV4Response> updateIssueV4AsyncInvoker(
        UpdateIssueV4Request request) {
        return new AsyncInvoker<>(request, ProjectManMeta.updateIssueV4, hcClient);
    }

    /**
     * 更新Scrum项目迭代
     *
     * 更新Scrum项目迭代
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateIterationV4Request 请求对象
     * @return CompletableFuture<UpdateIterationV4Response>
     */
    public CompletableFuture<UpdateIterationV4Response> updateIterationV4Async(UpdateIterationV4Request request) {
        return hcClient.asyncInvokeHttp(request, ProjectManMeta.updateIterationV4);
    }

    /**
     * 更新Scrum项目迭代
     *
     * 更新Scrum项目迭代
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateIterationV4Request 请求对象
     * @return AsyncInvoker<UpdateIterationV4Request, UpdateIterationV4Response>
     */
    public AsyncInvoker<UpdateIterationV4Request, UpdateIterationV4Response> updateIterationV4AsyncInvoker(
        UpdateIterationV4Request request) {
        return new AsyncInvoker<>(request, ProjectManMeta.updateIterationV4, hcClient);
    }

    /**
     * 更新项目的领域
     *
     * 更新项目的领域
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateProjectDomainRequest 请求对象
     * @return CompletableFuture<UpdateProjectDomainResponse>
     */
    public CompletableFuture<UpdateProjectDomainResponse> updateProjectDomainAsync(UpdateProjectDomainRequest request) {
        return hcClient.asyncInvokeHttp(request, ProjectManMeta.updateProjectDomain);
    }

    /**
     * 更新项目的领域
     *
     * 更新项目的领域
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateProjectDomainRequest 请求对象
     * @return AsyncInvoker<UpdateProjectDomainRequest, UpdateProjectDomainResponse>
     */
    public AsyncInvoker<UpdateProjectDomainRequest, UpdateProjectDomainResponse> updateProjectDomainAsyncInvoker(
        UpdateProjectDomainRequest request) {
        return new AsyncInvoker<>(request, ProjectManMeta.updateProjectDomain, hcClient);
    }

    /**
     * 更新项目的模块
     *
     * 更新项目的模块
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateProjectModuleRequest 请求对象
     * @return CompletableFuture<UpdateProjectModuleResponse>
     */
    public CompletableFuture<UpdateProjectModuleResponse> updateProjectModuleAsync(UpdateProjectModuleRequest request) {
        return hcClient.asyncInvokeHttp(request, ProjectManMeta.updateProjectModule);
    }

    /**
     * 更新项目的模块
     *
     * 更新项目的模块
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateProjectModuleRequest 请求对象
     * @return AsyncInvoker<UpdateProjectModuleRequest, UpdateProjectModuleResponse>
     */
    public AsyncInvoker<UpdateProjectModuleRequest, UpdateProjectModuleResponse> updateProjectModuleAsyncInvoker(
        UpdateProjectModuleRequest request) {
        return new AsyncInvoker<>(request, ProjectManMeta.updateProjectModule, hcClient);
    }

    /**
     * 上传工作项附件
     *
     * 上传工作项附件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UploadAttachmentsRequest 请求对象
     * @return CompletableFuture<UploadAttachmentsResponse>
     */
    public CompletableFuture<UploadAttachmentsResponse> uploadAttachmentsAsync(UploadAttachmentsRequest request) {
        return hcClient.asyncInvokeHttp(request, ProjectManMeta.uploadAttachments);
    }

    /**
     * 上传工作项附件
     *
     * 上传工作项附件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UploadAttachmentsRequest 请求对象
     * @return AsyncInvoker<UploadAttachmentsRequest, UploadAttachmentsResponse>
     */
    public AsyncInvoker<UploadAttachmentsRequest, UploadAttachmentsResponse> uploadAttachmentsAsyncInvoker(
        UploadAttachmentsRequest request) {
        return new AsyncInvoker<>(request, ProjectManMeta.uploadAttachments, hcClient);
    }

    /**
     * 上传图片
     *
     * 上传图片
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UploadIssueImgRequest 请求对象
     * @return CompletableFuture<UploadIssueImgResponse>
     */
    public CompletableFuture<UploadIssueImgResponse> uploadIssueImgAsync(UploadIssueImgRequest request) {
        return hcClient.asyncInvokeHttp(request, ProjectManMeta.uploadIssueImg);
    }

    /**
     * 上传图片
     *
     * 上传图片
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UploadIssueImgRequest 请求对象
     * @return AsyncInvoker<UploadIssueImgRequest, UploadIssueImgResponse>
     */
    public AsyncInvoker<UploadIssueImgRequest, UploadIssueImgResponse> uploadIssueImgAsyncInvoker(
        UploadIssueImgRequest request) {
        return new AsyncInvoker<>(request, ProjectManMeta.uploadIssueImg, hcClient);
    }

    /**
     * 查询所有的严重程度
     *
     * 查询所有的严重程度
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowScrumIssueSeveritiesRequest 请求对象
     * @return CompletableFuture<ShowScrumIssueSeveritiesResponse>
     */
    public CompletableFuture<ShowScrumIssueSeveritiesResponse> showScrumIssueSeveritiesAsync(
        ShowScrumIssueSeveritiesRequest request) {
        return hcClient.asyncInvokeHttp(request, ProjectManMeta.showScrumIssueSeverities);
    }

    /**
     * 查询所有的严重程度
     *
     * 查询所有的严重程度
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowScrumIssueSeveritiesRequest 请求对象
     * @return AsyncInvoker<ShowScrumIssueSeveritiesRequest, ShowScrumIssueSeveritiesResponse>
     */
    public AsyncInvoker<ShowScrumIssueSeveritiesRequest, ShowScrumIssueSeveritiesResponse> showScrumIssueSeveritiesAsyncInvoker(
        ShowScrumIssueSeveritiesRequest request) {
        return new AsyncInvoker<>(request, ProjectManMeta.showScrumIssueSeverities, hcClient);
    }

}
