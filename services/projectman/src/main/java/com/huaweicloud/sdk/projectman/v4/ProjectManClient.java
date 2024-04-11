package com.huaweicloud.sdk.projectman.v4;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
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
import com.huaweicloud.sdk.projectman.v4.model.ListIssueCustomFieldsResponse;
import com.huaweicloud.sdk.projectman.v4.model.ListIssueRecordsV4Request;
import com.huaweicloud.sdk.projectman.v4.model.ListIssueRecordsV4Response;
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
import com.huaweicloud.sdk.projectman.v4.model.ShowProjectWorkHoursResponse;
import com.huaweicloud.sdk.projectman.v4.model.ShowWorkItemWrokflowConfigRequest;
import com.huaweicloud.sdk.projectman.v4.model.ShowWorkItemWrokflowConfigResponse;
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
import com.huaweicloud.sdk.projectman.v4.model.UploadAttachmentsRequest;
import com.huaweicloud.sdk.projectman.v4.model.UploadAttachmentsResponse;
import com.huaweicloud.sdk.projectman.v4.model.UploadIssueImgRequest;
import com.huaweicloud.sdk.projectman.v4.model.UploadIssueImgResponse;

public class ProjectManClient {

    protected HcClient hcClient;

    public ProjectManClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<ProjectManClient> newBuilder() {
        ClientBuilder<ProjectManClient> clientBuilder = new ClientBuilder<>(ProjectManClient::new);
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
     * @return AddApplyJoinProjectForAgcResponse
     */
    public AddApplyJoinProjectForAgcResponse addApplyJoinProjectForAgc(AddApplyJoinProjectForAgcRequest request) {
        return hcClient.syncInvokeHttp(request, ProjectManMeta.addApplyJoinProjectForAgc);
    }

    /**
     * AGC调用 当前用户申请加入项目
     *
     * AGC调用 当前用户申请加入项目, 申请的用户id写在header中
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddApplyJoinProjectForAgcRequest 请求对象
     * @return SyncInvoker<AddApplyJoinProjectForAgcRequest, AddApplyJoinProjectForAgcResponse>
     */
    public SyncInvoker<AddApplyJoinProjectForAgcRequest, AddApplyJoinProjectForAgcResponse> addApplyJoinProjectForAgcInvoker(
        AddApplyJoinProjectForAgcRequest request) {
        return new SyncInvoker<>(request, ProjectManMeta.addApplyJoinProjectForAgc, hcClient);
    }

    /**
     * 添加项目成员
     *
     * 添加项目成员,可以添加跨租户成员
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddMemberV4Request 请求对象
     * @return AddMemberV4Response
     */
    public AddMemberV4Response addMemberV4(AddMemberV4Request request) {
        return hcClient.syncInvokeHttp(request, ProjectManMeta.addMemberV4);
    }

    /**
     * 添加项目成员
     *
     * 添加项目成员,可以添加跨租户成员
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddMemberV4Request 请求对象
     * @return SyncInvoker<AddMemberV4Request, AddMemberV4Response>
     */
    public SyncInvoker<AddMemberV4Request, AddMemberV4Response> addMemberV4Invoker(AddMemberV4Request request) {
        return new SyncInvoker<>(request, ProjectManMeta.addMemberV4, hcClient);
    }

    /**
     * 批量添加项目成员
     *
     * 批量添加项目成员，只能添加和项目创建者同一租户下的成员，不正确的用户id会略过，添加的用户超过权限的，默认角色设置为7
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchAddMembersV4Request 请求对象
     * @return BatchAddMembersV4Response
     */
    public BatchAddMembersV4Response batchAddMembersV4(BatchAddMembersV4Request request) {
        return hcClient.syncInvokeHttp(request, ProjectManMeta.batchAddMembersV4);
    }

    /**
     * 批量添加项目成员
     *
     * 批量添加项目成员，只能添加和项目创建者同一租户下的成员，不正确的用户id会略过，添加的用户超过权限的，默认角色设置为7
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchAddMembersV4Request 请求对象
     * @return SyncInvoker<BatchAddMembersV4Request, BatchAddMembersV4Response>
     */
    public SyncInvoker<BatchAddMembersV4Request, BatchAddMembersV4Response> batchAddMembersV4Invoker(
        BatchAddMembersV4Request request) {
        return new SyncInvoker<>(request, ProjectManMeta.batchAddMembersV4, hcClient);
    }

    /**
     * 批量删除项目成员
     *
     * 批量删除项目成员
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteMembersV4Request 请求对象
     * @return BatchDeleteMembersV4Response
     */
    public BatchDeleteMembersV4Response batchDeleteMembersV4(BatchDeleteMembersV4Request request) {
        return hcClient.syncInvokeHttp(request, ProjectManMeta.batchDeleteMembersV4);
    }

    /**
     * 批量删除项目成员
     *
     * 批量删除项目成员
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteMembersV4Request 请求对象
     * @return SyncInvoker<BatchDeleteMembersV4Request, BatchDeleteMembersV4Response>
     */
    public SyncInvoker<BatchDeleteMembersV4Request, BatchDeleteMembersV4Response> batchDeleteMembersV4Invoker(
        BatchDeleteMembersV4Request request) {
        return new SyncInvoker<>(request, ProjectManMeta.batchDeleteMembersV4, hcClient);
    }

    /**
     * 更新子用户昵称
     *
     * 拥有te_admin角色的用户可以更新其他用户的昵称
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUpdateChildNickNamesRequest 请求对象
     * @return BatchUpdateChildNickNamesResponse
     */
    public BatchUpdateChildNickNamesResponse batchUpdateChildNickNames(BatchUpdateChildNickNamesRequest request) {
        return hcClient.syncInvokeHttp(request, ProjectManMeta.batchUpdateChildNickNames);
    }

    /**
     * 更新子用户昵称
     *
     * 拥有te_admin角色的用户可以更新其他用户的昵称
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUpdateChildNickNamesRequest 请求对象
     * @return SyncInvoker<BatchUpdateChildNickNamesRequest, BatchUpdateChildNickNamesResponse>
     */
    public SyncInvoker<BatchUpdateChildNickNamesRequest, BatchUpdateChildNickNamesResponse> batchUpdateChildNickNamesInvoker(
        BatchUpdateChildNickNamesRequest request) {
        return new SyncInvoker<>(request, ProjectManMeta.batchUpdateChildNickNames, hcClient);
    }

    /**
     * 检查项目名称是否存在
     *
     * 检查项目名称是否存在
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckProjectNameV4Request 请求对象
     * @return CheckProjectNameV4Response
     */
    public CheckProjectNameV4Response checkProjectNameV4(CheckProjectNameV4Request request) {
        return hcClient.syncInvokeHttp(request, ProjectManMeta.checkProjectNameV4);
    }

    /**
     * 检查项目名称是否存在
     *
     * 检查项目名称是否存在
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckProjectNameV4Request 请求对象
     * @return SyncInvoker<CheckProjectNameV4Request, CheckProjectNameV4Response>
     */
    public SyncInvoker<CheckProjectNameV4Request, CheckProjectNameV4Response> checkProjectNameV4Invoker(
        CheckProjectNameV4Request request) {
        return new SyncInvoker<>(request, ProjectManMeta.checkProjectNameV4, hcClient);
    }

    /**
     * 创建项目
     *
     * 创建项目
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateProjectV4Request 请求对象
     * @return CreateProjectV4Response
     */
    public CreateProjectV4Response createProjectV4(CreateProjectV4Request request) {
        return hcClient.syncInvokeHttp(request, ProjectManMeta.createProjectV4);
    }

    /**
     * 创建项目
     *
     * 创建项目
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateProjectV4Request 请求对象
     * @return SyncInvoker<CreateProjectV4Request, CreateProjectV4Response>
     */
    public SyncInvoker<CreateProjectV4Request, CreateProjectV4Response> createProjectV4Invoker(
        CreateProjectV4Request request) {
        return new SyncInvoker<>(request, ProjectManMeta.createProjectV4, hcClient);
    }

    /**
     * 删除项目
     *
     * 删除项目
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteProjectV4Request 请求对象
     * @return DeleteProjectV4Response
     */
    public DeleteProjectV4Response deleteProjectV4(DeleteProjectV4Request request) {
        return hcClient.syncInvokeHttp(request, ProjectManMeta.deleteProjectV4);
    }

    /**
     * 删除项目
     *
     * 删除项目
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteProjectV4Request 请求对象
     * @return SyncInvoker<DeleteProjectV4Request, DeleteProjectV4Response>
     */
    public SyncInvoker<DeleteProjectV4Request, DeleteProjectV4Response> deleteProjectV4Invoker(
        DeleteProjectV4Request request) {
        return new SyncInvoker<>(request, ProjectManMeta.deleteProjectV4, hcClient);
    }

    /**
     * 获取租户没有加入的项目
     *
     * 获取租户没有加入的项目
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDomainNotAddedProjectsV4Request 请求对象
     * @return ListDomainNotAddedProjectsV4Response
     */
    public ListDomainNotAddedProjectsV4Response listDomainNotAddedProjectsV4(
        ListDomainNotAddedProjectsV4Request request) {
        return hcClient.syncInvokeHttp(request, ProjectManMeta.listDomainNotAddedProjectsV4);
    }

    /**
     * 获取租户没有加入的项目
     *
     * 获取租户没有加入的项目
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDomainNotAddedProjectsV4Request 请求对象
     * @return SyncInvoker<ListDomainNotAddedProjectsV4Request, ListDomainNotAddedProjectsV4Response>
     */
    public SyncInvoker<ListDomainNotAddedProjectsV4Request, ListDomainNotAddedProjectsV4Response> listDomainNotAddedProjectsV4Invoker(
        ListDomainNotAddedProjectsV4Request request) {
        return new SyncInvoker<>(request, ProjectManMeta.listDomainNotAddedProjectsV4, hcClient);
    }

    /**
     * 获取bug统计信息
     *
     * 获取bug统计信息，按模块统计
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectBugStaticsV4Request 请求对象
     * @return ListProjectBugStaticsV4Response
     */
    public ListProjectBugStaticsV4Response listProjectBugStaticsV4(ListProjectBugStaticsV4Request request) {
        return hcClient.syncInvokeHttp(request, ProjectManMeta.listProjectBugStaticsV4);
    }

    /**
     * 获取bug统计信息
     *
     * 获取bug统计信息，按模块统计
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectBugStaticsV4Request 请求对象
     * @return SyncInvoker<ListProjectBugStaticsV4Request, ListProjectBugStaticsV4Response>
     */
    public SyncInvoker<ListProjectBugStaticsV4Request, ListProjectBugStaticsV4Response> listProjectBugStaticsV4Invoker(
        ListProjectBugStaticsV4Request request) {
        return new SyncInvoker<>(request, ProjectManMeta.listProjectBugStaticsV4, hcClient);
    }

    /**
     * 获取需求统计信息
     *
     * 获取需求统计信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectDemandStaticV4Request 请求对象
     * @return ListProjectDemandStaticV4Response
     */
    public ListProjectDemandStaticV4Response listProjectDemandStaticV4(ListProjectDemandStaticV4Request request) {
        return hcClient.syncInvokeHttp(request, ProjectManMeta.listProjectDemandStaticV4);
    }

    /**
     * 获取需求统计信息
     *
     * 获取需求统计信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectDemandStaticV4Request 请求对象
     * @return SyncInvoker<ListProjectDemandStaticV4Request, ListProjectDemandStaticV4Response>
     */
    public SyncInvoker<ListProjectDemandStaticV4Request, ListProjectDemandStaticV4Response> listProjectDemandStaticV4Invoker(
        ListProjectDemandStaticV4Request request) {
        return new SyncInvoker<>(request, ProjectManMeta.listProjectDemandStaticV4, hcClient);
    }

    /**
     * 获取指定项目的成员用户列表
     *
     * 获取项目成员列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectMembersV4Request 请求对象
     * @return ListProjectMembersV4Response
     */
    public ListProjectMembersV4Response listProjectMembersV4(ListProjectMembersV4Request request) {
        return hcClient.syncInvokeHttp(request, ProjectManMeta.listProjectMembersV4);
    }

    /**
     * 获取指定项目的成员用户列表
     *
     * 获取项目成员列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectMembersV4Request 请求对象
     * @return SyncInvoker<ListProjectMembersV4Request, ListProjectMembersV4Response>
     */
    public SyncInvoker<ListProjectMembersV4Request, ListProjectMembersV4Response> listProjectMembersV4Invoker(
        ListProjectMembersV4Request request) {
        return new SyncInvoker<>(request, ProjectManMeta.listProjectMembersV4, hcClient);
    }

    /**
     * 查询项目列表
     *
     * 查询项目列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectsV4Request 请求对象
     * @return ListProjectsV4Response
     */
    public ListProjectsV4Response listProjectsV4(ListProjectsV4Request request) {
        return hcClient.syncInvokeHttp(request, ProjectManMeta.listProjectsV4);
    }

    /**
     * 查询项目列表
     *
     * 查询项目列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectsV4Request 请求对象
     * @return SyncInvoker<ListProjectsV4Request, ListProjectsV4Response>
     */
    public SyncInvoker<ListProjectsV4Request, ListProjectsV4Response> listProjectsV4Invoker(
        ListProjectsV4Request request) {
        return new SyncInvoker<>(request, ProjectManMeta.listProjectsV4, hcClient);
    }

    /**
     * 查询项目模板
     *
     * 查询项目模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTemplatesRequest 请求对象
     * @return ListTemplatesResponse
     */
    public ListTemplatesResponse listTemplates(ListTemplatesRequest request) {
        return hcClient.syncInvokeHttp(request, ProjectManMeta.listTemplates);
    }

    /**
     * 查询项目模板
     *
     * 查询项目模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTemplatesRequest 请求对象
     * @return SyncInvoker<ListTemplatesRequest, ListTemplatesResponse>
     */
    public SyncInvoker<ListTemplatesRequest, ListTemplatesResponse> listTemplatesInvoker(ListTemplatesRequest request) {
        return new SyncInvoker<>(request, ProjectManMeta.listTemplates, hcClient);
    }

    /**
     * 查询看板项目下工作项的状态历史记录
     *
     * 分页查询看板项目下工作项的状态历史记录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWorkitemStatusRecordsV4Request 请求对象
     * @return ListWorkitemStatusRecordsV4Response
     */
    public ListWorkitemStatusRecordsV4Response listWorkitemStatusRecordsV4(ListWorkitemStatusRecordsV4Request request) {
        return hcClient.syncInvokeHttp(request, ProjectManMeta.listWorkitemStatusRecordsV4);
    }

    /**
     * 查询看板项目下工作项的状态历史记录
     *
     * 分页查询看板项目下工作项的状态历史记录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWorkitemStatusRecordsV4Request 请求对象
     * @return SyncInvoker<ListWorkitemStatusRecordsV4Request, ListWorkitemStatusRecordsV4Response>
     */
    public SyncInvoker<ListWorkitemStatusRecordsV4Request, ListWorkitemStatusRecordsV4Response> listWorkitemStatusRecordsV4Invoker(
        ListWorkitemStatusRecordsV4Request request) {
        return new SyncInvoker<>(request, ProjectManMeta.listWorkitemStatusRecordsV4, hcClient);
    }

    /**
     * 查询看板项目下的工作项
     *
     * 查询看板项目下的工作项
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWorkitemsRequest 请求对象
     * @return ListWorkitemsResponse
     */
    public ListWorkitemsResponse listWorkitems(ListWorkitemsRequest request) {
        return hcClient.syncInvokeHttp(request, ProjectManMeta.listWorkitems);
    }

    /**
     * 查询看板项目下的工作项
     *
     * 查询看板项目下的工作项
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWorkitemsRequest 请求对象
     * @return SyncInvoker<ListWorkitemsRequest, ListWorkitemsResponse>
     */
    public SyncInvoker<ListWorkitemsRequest, ListWorkitemsResponse> listWorkitemsInvoker(ListWorkitemsRequest request) {
        return new SyncInvoker<>(request, ProjectManMeta.listWorkitems, hcClient);
    }

    /**
     * 主动退出项目
     *
     * 项目成员主动退出项目，项目创建者不能退出
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RemoveProjectRequest 请求对象
     * @return RemoveProjectResponse
     */
    public RemoveProjectResponse removeProject(RemoveProjectRequest request) {
        return hcClient.syncInvokeHttp(request, ProjectManMeta.removeProject);
    }

    /**
     * 主动退出项目
     *
     * 项目成员主动退出项目，项目创建者不能退出
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RemoveProjectRequest 请求对象
     * @return SyncInvoker<RemoveProjectRequest, RemoveProjectResponse>
     */
    public SyncInvoker<RemoveProjectRequest, RemoveProjectResponse> removeProjectInvoker(RemoveProjectRequest request) {
        return new SyncInvoker<>(request, ProjectManMeta.removeProject, hcClient);
    }

    /**
     * 查询缺陷密度
     *
     * 查询缺陷密度
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBugDensityV2Request 请求对象
     * @return ShowBugDensityV2Response
     */
    public ShowBugDensityV2Response showBugDensityV2(ShowBugDensityV2Request request) {
        return hcClient.syncInvokeHttp(request, ProjectManMeta.showBugDensityV2);
    }

    /**
     * 查询缺陷密度
     *
     * 查询缺陷密度
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBugDensityV2Request 请求对象
     * @return SyncInvoker<ShowBugDensityV2Request, ShowBugDensityV2Response>
     */
    public SyncInvoker<ShowBugDensityV2Request, ShowBugDensityV2Response> showBugDensityV2Invoker(
        ShowBugDensityV2Request request) {
        return new SyncInvoker<>(request, ProjectManMeta.showBugDensityV2, hcClient);
    }

    /**
     * 查询人均bug
     *
     * 查询人均bug
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBugsPerDeveloperRequest 请求对象
     * @return ShowBugsPerDeveloperResponse
     */
    public ShowBugsPerDeveloperResponse showBugsPerDeveloper(ShowBugsPerDeveloperRequest request) {
        return hcClient.syncInvokeHttp(request, ProjectManMeta.showBugsPerDeveloper);
    }

    /**
     * 查询人均bug
     *
     * 查询人均bug
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBugsPerDeveloperRequest 请求对象
     * @return SyncInvoker<ShowBugsPerDeveloperRequest, ShowBugsPerDeveloperResponse>
     */
    public SyncInvoker<ShowBugsPerDeveloperRequest, ShowBugsPerDeveloperResponse> showBugsPerDeveloperInvoker(
        ShowBugsPerDeveloperRequest request) {
        return new SyncInvoker<>(request, ProjectManMeta.showBugsPerDeveloper, hcClient);
    }

    /**
     * 查询需求按时完成率
     *
     * 查询需求按时完成率
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCompletionRateRequest 请求对象
     * @return ShowCompletionRateResponse
     */
    public ShowCompletionRateResponse showCompletionRate(ShowCompletionRateRequest request) {
        return hcClient.syncInvokeHttp(request, ProjectManMeta.showCompletionRate);
    }

    /**
     * 查询需求按时完成率
     *
     * 查询需求按时完成率
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCompletionRateRequest 请求对象
     * @return SyncInvoker<ShowCompletionRateRequest, ShowCompletionRateResponse>
     */
    public SyncInvoker<ShowCompletionRateRequest, ShowCompletionRateResponse> showCompletionRateInvoker(
        ShowCompletionRateRequest request) {
        return new SyncInvoker<>(request, ProjectManMeta.showCompletionRate, hcClient);
    }

    /**
     * 获取当前用户信息
     *
     * 获取当前用户信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCurUserInfoRequest 请求对象
     * @return ShowCurUserInfoResponse
     */
    public ShowCurUserInfoResponse showCurUserInfo(ShowCurUserInfoRequest request) {
        return hcClient.syncInvokeHttp(request, ProjectManMeta.showCurUserInfo);
    }

    /**
     * 获取当前用户信息
     *
     * 获取当前用户信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCurUserInfoRequest 请求对象
     * @return SyncInvoker<ShowCurUserInfoRequest, ShowCurUserInfoResponse>
     */
    public SyncInvoker<ShowCurUserInfoRequest, ShowCurUserInfoResponse> showCurUserInfoInvoker(
        ShowCurUserInfoRequest request) {
        return new SyncInvoker<>(request, ProjectManMeta.showCurUserInfo, hcClient);
    }

    /**
     * 获取当前用户角色
     *
     * 获取用户在项目中的角色
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCurUserRoleRequest 请求对象
     * @return ShowCurUserRoleResponse
     */
    public ShowCurUserRoleResponse showCurUserRole(ShowCurUserRoleRequest request) {
        return hcClient.syncInvokeHttp(request, ProjectManMeta.showCurUserRole);
    }

    /**
     * 获取当前用户角色
     *
     * 获取用户在项目中的角色
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCurUserRoleRequest 请求对象
     * @return SyncInvoker<ShowCurUserRoleRequest, ShowCurUserRoleResponse>
     */
    public SyncInvoker<ShowCurUserRoleRequest, ShowCurUserRoleResponse> showCurUserRoleInvoker(
        ShowCurUserRoleRequest request) {
        return new SyncInvoker<>(request, ProjectManMeta.showCurUserRole, hcClient);
    }

    /**
     * 获取项目详情
     *
     * 获取项目详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowProjectInfoV4Request 请求对象
     * @return ShowProjectInfoV4Response
     */
    public ShowProjectInfoV4Response showProjectInfoV4(ShowProjectInfoV4Request request) {
        return hcClient.syncInvokeHttp(request, ProjectManMeta.showProjectInfoV4);
    }

    /**
     * 获取项目详情
     *
     * 获取项目详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowProjectInfoV4Request 请求对象
     * @return SyncInvoker<ShowProjectInfoV4Request, ShowProjectInfoV4Response>
     */
    public SyncInvoker<ShowProjectInfoV4Request, ShowProjectInfoV4Response> showProjectInfoV4Invoker(
        ShowProjectInfoV4Request request) {
        return new SyncInvoker<>(request, ProjectManMeta.showProjectInfoV4, hcClient);
    }

    /**
     * 获取项目概览
     *
     * 获取项目概览
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowProjectSummaryV4Request 请求对象
     * @return ShowProjectSummaryV4Response
     */
    public ShowProjectSummaryV4Response showProjectSummaryV4(ShowProjectSummaryV4Request request) {
        return hcClient.syncInvokeHttp(request, ProjectManMeta.showProjectSummaryV4);
    }

    /**
     * 获取项目概览
     *
     * 获取项目概览
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowProjectSummaryV4Request 请求对象
     * @return SyncInvoker<ShowProjectSummaryV4Request, ShowProjectSummaryV4Response>
     */
    public SyncInvoker<ShowProjectSummaryV4Request, ShowProjectSummaryV4Response> showProjectSummaryV4Invoker(
        ShowProjectSummaryV4Request request) {
        return new SyncInvoker<>(request, ProjectManMeta.showProjectSummaryV4, hcClient);
    }

    /**
     * 查询看板项目的工作项流转配置
     *
     * 查询看板项目的工作项流转配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowWorkItemWrokflowConfigRequest 请求对象
     * @return ShowWorkItemWrokflowConfigResponse
     */
    public ShowWorkItemWrokflowConfigResponse showWorkItemWrokflowConfig(ShowWorkItemWrokflowConfigRequest request) {
        return hcClient.syncInvokeHttp(request, ProjectManMeta.showWorkItemWrokflowConfig);
    }

    /**
     * 查询看板项目的工作项流转配置
     *
     * 查询看板项目的工作项流转配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowWorkItemWrokflowConfigRequest 请求对象
     * @return SyncInvoker<ShowWorkItemWrokflowConfigRequest, ShowWorkItemWrokflowConfigResponse>
     */
    public SyncInvoker<ShowWorkItemWrokflowConfigRequest, ShowWorkItemWrokflowConfigResponse> showWorkItemWrokflowConfigInvoker(
        ShowWorkItemWrokflowConfigRequest request) {
        return new SyncInvoker<>(request, ProjectManMeta.showWorkItemWrokflowConfig, hcClient);
    }

    /**
     * 更新成员在项目中的角色
     *
     * 更新成员在项目中的角色
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateMembesRoleV4Request 请求对象
     * @return UpdateMembesRoleV4Response
     */
    public UpdateMembesRoleV4Response updateMembesRoleV4(UpdateMembesRoleV4Request request) {
        return hcClient.syncInvokeHttp(request, ProjectManMeta.updateMembesRoleV4);
    }

    /**
     * 更新成员在项目中的角色
     *
     * 更新成员在项目中的角色
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateMembesRoleV4Request 请求对象
     * @return SyncInvoker<UpdateMembesRoleV4Request, UpdateMembesRoleV4Response>
     */
    public SyncInvoker<UpdateMembesRoleV4Request, UpdateMembesRoleV4Response> updateMembesRoleV4Invoker(
        UpdateMembesRoleV4Request request) {
        return new SyncInvoker<>(request, ProjectManMeta.updateMembesRoleV4, hcClient);
    }

    /**
     * 更新用户昵称
     *
     * 更新用户昵称
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateNickNameV4Request 请求对象
     * @return UpdateNickNameV4Response
     */
    public UpdateNickNameV4Response updateNickNameV4(UpdateNickNameV4Request request) {
        return hcClient.syncInvokeHttp(request, ProjectManMeta.updateNickNameV4);
    }

    /**
     * 更新用户昵称
     *
     * 更新用户昵称
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateNickNameV4Request 请求对象
     * @return SyncInvoker<UpdateNickNameV4Request, UpdateNickNameV4Response>
     */
    public SyncInvoker<UpdateNickNameV4Request, UpdateNickNameV4Response> updateNickNameV4Invoker(
        UpdateNickNameV4Request request) {
        return new SyncInvoker<>(request, ProjectManMeta.updateNickNameV4, hcClient);
    }

    /**
     * 更新项目
     *
     * 更新项目
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateProjectV4Request 请求对象
     * @return UpdateProjectV4Response
     */
    public UpdateProjectV4Response updateProjectV4(UpdateProjectV4Request request) {
        return hcClient.syncInvokeHttp(request, ProjectManMeta.updateProjectV4);
    }

    /**
     * 更新项目
     *
     * 更新项目
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateProjectV4Request 请求对象
     * @return SyncInvoker<UpdateProjectV4Request, UpdateProjectV4Response>
     */
    public SyncInvoker<UpdateProjectV4Request, UpdateProjectV4Response> updateProjectV4Invoker(
        UpdateProjectV4Request request) {
        return new SyncInvoker<>(request, ProjectManMeta.updateProjectV4, hcClient);
    }

    /**
     * 添加指定工作项工时
     *
     * 添加指定工作项工时
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddIssueWorkHoursRequest 请求对象
     * @return AddIssueWorkHoursResponse
     */
    public AddIssueWorkHoursResponse addIssueWorkHours(AddIssueWorkHoursRequest request) {
        return hcClient.syncInvokeHttp(request, ProjectManMeta.addIssueWorkHours);
    }

    /**
     * 添加指定工作项工时
     *
     * 添加指定工作项工时
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddIssueWorkHoursRequest 请求对象
     * @return SyncInvoker<AddIssueWorkHoursRequest, AddIssueWorkHoursResponse>
     */
    public SyncInvoker<AddIssueWorkHoursRequest, AddIssueWorkHoursResponse> addIssueWorkHoursInvoker(
        AddIssueWorkHoursRequest request) {
        return new SyncInvoker<>(request, ProjectManMeta.addIssueWorkHours, hcClient);
    }

    /**
     * 批量删除工作项
     *
     * 批量删除工作项
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteIssuesV4Request 请求对象
     * @return BatchDeleteIssuesV4Response
     */
    public BatchDeleteIssuesV4Response batchDeleteIssuesV4(BatchDeleteIssuesV4Request request) {
        return hcClient.syncInvokeHttp(request, ProjectManMeta.batchDeleteIssuesV4);
    }

    /**
     * 批量删除工作项
     *
     * 批量删除工作项
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteIssuesV4Request 请求对象
     * @return SyncInvoker<BatchDeleteIssuesV4Request, BatchDeleteIssuesV4Response>
     */
    public SyncInvoker<BatchDeleteIssuesV4Request, BatchDeleteIssuesV4Response> batchDeleteIssuesV4Invoker(
        BatchDeleteIssuesV4Request request) {
        return new SyncInvoker<>(request, ProjectManMeta.batchDeleteIssuesV4, hcClient);
    }

    /**
     * 批量删除项目的迭代
     *
     * 批量删除项目的迭代
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteIterationsV4Request 请求对象
     * @return BatchDeleteIterationsV4Response
     */
    public BatchDeleteIterationsV4Response batchDeleteIterationsV4(BatchDeleteIterationsV4Request request) {
        return hcClient.syncInvokeHttp(request, ProjectManMeta.batchDeleteIterationsV4);
    }

    /**
     * 批量删除项目的迭代
     *
     * 批量删除项目的迭代
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteIterationsV4Request 请求对象
     * @return SyncInvoker<BatchDeleteIterationsV4Request, BatchDeleteIterationsV4Response>
     */
    public SyncInvoker<BatchDeleteIterationsV4Request, BatchDeleteIterationsV4Response> batchDeleteIterationsV4Invoker(
        BatchDeleteIterationsV4Request request) {
        return new SyncInvoker<>(request, ProjectManMeta.batchDeleteIterationsV4, hcClient);
    }

    /**
     * 查询当前项目下已经关联的工作项
     *
     * 查询当前项目下已经关联的工作项
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchListAssociatedIssuesRequest 请求对象
     * @return BatchListAssociatedIssuesResponse
     */
    public BatchListAssociatedIssuesResponse batchListAssociatedIssues(BatchListAssociatedIssuesRequest request) {
        return hcClient.syncInvokeHttp(request, ProjectManMeta.batchListAssociatedIssues);
    }

    /**
     * 查询当前项目下已经关联的工作项
     *
     * 查询当前项目下已经关联的工作项
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchListAssociatedIssuesRequest 请求对象
     * @return SyncInvoker<BatchListAssociatedIssuesRequest, BatchListAssociatedIssuesResponse>
     */
    public SyncInvoker<BatchListAssociatedIssuesRequest, BatchListAssociatedIssuesResponse> batchListAssociatedIssuesInvoker(
        BatchListAssociatedIssuesRequest request) {
        return new SyncInvoker<>(request, ProjectManMeta.batchListAssociatedIssues, hcClient);
    }

    /**
     * 取消领域与项目的关联关系
     *
     * 取消领域与项目的关联关系
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CancelProjectDomainRequest 请求对象
     * @return CancelProjectDomainResponse
     */
    public CancelProjectDomainResponse cancelProjectDomain(CancelProjectDomainRequest request) {
        return hcClient.syncInvokeHttp(request, ProjectManMeta.cancelProjectDomain);
    }

    /**
     * 取消领域与项目的关联关系
     *
     * 取消领域与项目的关联关系
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CancelProjectDomainRequest 请求对象
     * @return SyncInvoker<CancelProjectDomainRequest, CancelProjectDomainResponse>
     */
    public SyncInvoker<CancelProjectDomainRequest, CancelProjectDomainResponse> cancelProjectDomainInvoker(
        CancelProjectDomainRequest request) {
        return new SyncInvoker<>(request, ProjectManMeta.cancelProjectDomain, hcClient);
    }

    /**
     * 创建工作项类型自定义字段
     *
     * 创建工作项类型自定义字段
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCustomfieldsRequest 请求对象
     * @return CreateCustomfieldsResponse
     */
    public CreateCustomfieldsResponse createCustomfields(CreateCustomfieldsRequest request) {
        return hcClient.syncInvokeHttp(request, ProjectManMeta.createCustomfields);
    }

    /**
     * 创建工作项类型自定义字段
     *
     * 创建工作项类型自定义字段
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCustomfieldsRequest 请求对象
     * @return SyncInvoker<CreateCustomfieldsRequest, CreateCustomfieldsResponse>
     */
    public SyncInvoker<CreateCustomfieldsRequest, CreateCustomfieldsResponse> createCustomfieldsInvoker(
        CreateCustomfieldsRequest request) {
        return new SyncInvoker<>(request, ProjectManMeta.createCustomfields, hcClient);
    }

    /**
     * 创建工作项
     *
     * 创建工作项
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateIssueV4Request 请求对象
     * @return CreateIssueV4Response
     */
    public CreateIssueV4Response createIssueV4(CreateIssueV4Request request) {
        return hcClient.syncInvokeHttp(request, ProjectManMeta.createIssueV4);
    }

    /**
     * 创建工作项
     *
     * 创建工作项
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateIssueV4Request 请求对象
     * @return SyncInvoker<CreateIssueV4Request, CreateIssueV4Response>
     */
    public SyncInvoker<CreateIssueV4Request, CreateIssueV4Response> createIssueV4Invoker(CreateIssueV4Request request) {
        return new SyncInvoker<>(request, ProjectManMeta.createIssueV4, hcClient);
    }

    /**
     * 创建Scrum项目迭代
     *
     * 创建Scrum项目迭代
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateIterationV4Request 请求对象
     * @return CreateIterationV4Response
     */
    public CreateIterationV4Response createIterationV4(CreateIterationV4Request request) {
        return hcClient.syncInvokeHttp(request, ProjectManMeta.createIterationV4);
    }

    /**
     * 创建Scrum项目迭代
     *
     * 创建Scrum项目迭代
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateIterationV4Request 请求对象
     * @return SyncInvoker<CreateIterationV4Request, CreateIterationV4Response>
     */
    public SyncInvoker<CreateIterationV4Request, CreateIterationV4Response> createIterationV4Invoker(
        CreateIterationV4Request request) {
        return new SyncInvoker<>(request, ProjectManMeta.createIterationV4, hcClient);
    }

    /**
     * 创建项目的领域
     *
     * 查询项目的领域列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateProjectDomainRequest 请求对象
     * @return CreateProjectDomainResponse
     */
    public CreateProjectDomainResponse createProjectDomain(CreateProjectDomainRequest request) {
        return hcClient.syncInvokeHttp(request, ProjectManMeta.createProjectDomain);
    }

    /**
     * 创建项目的领域
     *
     * 查询项目的领域列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateProjectDomainRequest 请求对象
     * @return SyncInvoker<CreateProjectDomainRequest, CreateProjectDomainResponse>
     */
    public SyncInvoker<CreateProjectDomainRequest, CreateProjectDomainResponse> createProjectDomainInvoker(
        CreateProjectDomainRequest request) {
        return new SyncInvoker<>(request, ProjectManMeta.createProjectDomain, hcClient);
    }

    /**
     * 创建项目的模块
     *
     * 查询项目的模块列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateProjectModuleRequest 请求对象
     * @return CreateProjectModuleResponse
     */
    public CreateProjectModuleResponse createProjectModule(CreateProjectModuleRequest request) {
        return hcClient.syncInvokeHttp(request, ProjectManMeta.createProjectModule);
    }

    /**
     * 创建项目的模块
     *
     * 查询项目的模块列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateProjectModuleRequest 请求对象
     * @return SyncInvoker<CreateProjectModuleRequest, CreateProjectModuleResponse>
     */
    public SyncInvoker<CreateProjectModuleRequest, CreateProjectModuleResponse> createProjectModuleInvoker(
        CreateProjectModuleRequest request) {
        return new SyncInvoker<>(request, ProjectManMeta.createProjectModule, hcClient);
    }

    /**
     * 细粒度权限用户创建工作项
     *
     * 拥有IAM细粒度权限（projectmanConfig:systemSettingField:set）且在devcloud项目中有创建工作项的权限的用户可以设置工作项的创建者
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSystemIssueV4Request 请求对象
     * @return CreateSystemIssueV4Response
     */
    public CreateSystemIssueV4Response createSystemIssueV4(CreateSystemIssueV4Request request) {
        return hcClient.syncInvokeHttp(request, ProjectManMeta.createSystemIssueV4);
    }

    /**
     * 细粒度权限用户创建工作项
     *
     * 拥有IAM细粒度权限（projectmanConfig:systemSettingField:set）且在devcloud项目中有创建工作项的权限的用户可以设置工作项的创建者
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSystemIssueV4Request 请求对象
     * @return SyncInvoker<CreateSystemIssueV4Request, CreateSystemIssueV4Response>
     */
    public SyncInvoker<CreateSystemIssueV4Request, CreateSystemIssueV4Response> createSystemIssueV4Invoker(
        CreateSystemIssueV4Request request) {
        return new SyncInvoker<>(request, ProjectManMeta.createSystemIssueV4, hcClient);
    }

    /**
     * 删除附件
     *
     * 取消工作项与附件关联，如附件为工作项页面上传则删除附件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAttachmentRequest 请求对象
     * @return DeleteAttachmentResponse
     */
    public DeleteAttachmentResponse deleteAttachment(DeleteAttachmentRequest request) {
        return hcClient.syncInvokeHttp(request, ProjectManMeta.deleteAttachment);
    }

    /**
     * 删除附件
     *
     * 取消工作项与附件关联，如附件为工作项页面上传则删除附件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAttachmentRequest 请求对象
     * @return SyncInvoker<DeleteAttachmentRequest, DeleteAttachmentResponse>
     */
    public SyncInvoker<DeleteAttachmentRequest, DeleteAttachmentResponse> deleteAttachmentInvoker(
        DeleteAttachmentRequest request) {
        return new SyncInvoker<>(request, ProjectManMeta.deleteAttachment, hcClient);
    }

    /**
     * 删除工作项
     *
     * 删除工作项
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteIssueV4Request 请求对象
     * @return DeleteIssueV4Response
     */
    public DeleteIssueV4Response deleteIssueV4(DeleteIssueV4Request request) {
        return hcClient.syncInvokeHttp(request, ProjectManMeta.deleteIssueV4);
    }

    /**
     * 删除工作项
     *
     * 删除工作项
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteIssueV4Request 请求对象
     * @return SyncInvoker<DeleteIssueV4Request, DeleteIssueV4Response>
     */
    public SyncInvoker<DeleteIssueV4Request, DeleteIssueV4Response> deleteIssueV4Invoker(DeleteIssueV4Request request) {
        return new SyncInvoker<>(request, ProjectManMeta.deleteIssueV4, hcClient);
    }

    /**
     * 删除项目迭代
     *
     * 删除项目迭代
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteIterationV4Request 请求对象
     * @return DeleteIterationV4Response
     */
    public DeleteIterationV4Response deleteIterationV4(DeleteIterationV4Request request) {
        return hcClient.syncInvokeHttp(request, ProjectManMeta.deleteIterationV4);
    }

    /**
     * 删除项目迭代
     *
     * 删除项目迭代
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteIterationV4Request 请求对象
     * @return SyncInvoker<DeleteIterationV4Request, DeleteIterationV4Response>
     */
    public SyncInvoker<DeleteIterationV4Request, DeleteIterationV4Response> deleteIterationV4Invoker(
        DeleteIterationV4Request request) {
        return new SyncInvoker<>(request, ProjectManMeta.deleteIterationV4, hcClient);
    }

    /**
     * 删除项目的模块
     *
     * 删除项目的模块
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteProjectModuleRequest 请求对象
     * @return DeleteProjectModuleResponse
     */
    public DeleteProjectModuleResponse deleteProjectModule(DeleteProjectModuleRequest request) {
        return hcClient.syncInvokeHttp(request, ProjectManMeta.deleteProjectModule);
    }

    /**
     * 删除项目的模块
     *
     * 删除项目的模块
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteProjectModuleRequest 请求对象
     * @return SyncInvoker<DeleteProjectModuleRequest, DeleteProjectModuleResponse>
     */
    public SyncInvoker<DeleteProjectModuleRequest, DeleteProjectModuleResponse> deleteProjectModuleInvoker(
        DeleteProjectModuleRequest request) {
        return new SyncInvoker<>(request, ProjectManMeta.deleteProjectModule, hcClient);
    }

    /**
     * 下载工作项附件
     *
     * 下载工作项附件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadAttachmentRequest 请求对象
     * @return DownloadAttachmentResponse
     */
    public DownloadAttachmentResponse downloadAttachment(DownloadAttachmentRequest request) {
        return hcClient.syncInvokeHttp(request, ProjectManMeta.downloadAttachment);
    }

    /**
     * 下载工作项附件
     *
     * 下载工作项附件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadAttachmentRequest 请求对象
     * @return SyncInvoker<DownloadAttachmentRequest, DownloadAttachmentResponse>
     */
    public SyncInvoker<DownloadAttachmentRequest, DownloadAttachmentResponse> downloadAttachmentInvoker(
        DownloadAttachmentRequest request) {
        return new SyncInvoker<>(request, ProjectManMeta.downloadAttachment, hcClient);
    }

    /**
     * 下载图片
     *
     * 下载图片
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadImageFileRequest 请求对象
     * @return DownloadImageFileResponse
     */
    public DownloadImageFileResponse downloadImageFile(DownloadImageFileRequest request) {
        return hcClient.syncInvokeHttp(request, ProjectManMeta.downloadImageFile);
    }

    /**
     * 下载图片
     *
     * 下载图片
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadImageFileRequest 请求对象
     * @return SyncInvoker<DownloadImageFileRequest, DownloadImageFileResponse>
     */
    public SyncInvoker<DownloadImageFileRequest, DownloadImageFileResponse> downloadImageFileInvoker(
        DownloadImageFileRequest request) {
        return new SyncInvoker<>(request, ProjectManMeta.downloadImageFile, hcClient);
    }

    /**
     * 查询当前工作项已经关联的工作项
     *
     * 查询当前工作项已经关联的工作项
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAssociatedIssuesRequest 请求对象
     * @return ListAssociatedIssuesResponse
     */
    public ListAssociatedIssuesResponse listAssociatedIssues(ListAssociatedIssuesRequest request) {
        return hcClient.syncInvokeHttp(request, ProjectManMeta.listAssociatedIssues);
    }

    /**
     * 查询当前工作项已经关联的工作项
     *
     * 查询当前工作项已经关联的工作项
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAssociatedIssuesRequest 请求对象
     * @return SyncInvoker<ListAssociatedIssuesRequest, ListAssociatedIssuesResponse>
     */
    public SyncInvoker<ListAssociatedIssuesRequest, ListAssociatedIssuesResponse> listAssociatedIssuesInvoker(
        ListAssociatedIssuesRequest request) {
        return new SyncInvoker<>(request, ProjectManMeta.listAssociatedIssues, hcClient);
    }

    /**
     * 查询关联用例
     *
     * 查询关联用例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAssociatedTestCasesRequest 请求对象
     * @return ListAssociatedTestCasesResponse
     */
    public ListAssociatedTestCasesResponse listAssociatedTestCases(ListAssociatedTestCasesRequest request) {
        return hcClient.syncInvokeHttp(request, ProjectManMeta.listAssociatedTestCases);
    }

    /**
     * 查询关联用例
     *
     * 查询关联用例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAssociatedTestCasesRequest 请求对象
     * @return SyncInvoker<ListAssociatedTestCasesRequest, ListAssociatedTestCasesResponse>
     */
    public SyncInvoker<ListAssociatedTestCasesRequest, ListAssociatedTestCasesResponse> listAssociatedTestCasesInvoker(
        ListAssociatedTestCasesRequest request) {
        return new SyncInvoker<>(request, ProjectManMeta.listAssociatedTestCases, hcClient);
    }

    /**
     * 查询当前工作项已经关联的关联Wiki
     *
     * 查询当前工作项已经关联的关联Wiki
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAssociatedWikisRequest 请求对象
     * @return ListAssociatedWikisResponse
     */
    public ListAssociatedWikisResponse listAssociatedWikis(ListAssociatedWikisRequest request) {
        return hcClient.syncInvokeHttp(request, ProjectManMeta.listAssociatedWikis);
    }

    /**
     * 查询当前工作项已经关联的关联Wiki
     *
     * 查询当前工作项已经关联的关联Wiki
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAssociatedWikisRequest 请求对象
     * @return SyncInvoker<ListAssociatedWikisRequest, ListAssociatedWikisResponse>
     */
    public SyncInvoker<ListAssociatedWikisRequest, ListAssociatedWikisResponse> listAssociatedWikisInvoker(
        ListAssociatedWikisRequest request) {
        return new SyncInvoker<>(request, ProjectManMeta.listAssociatedWikis, hcClient);
    }

    /**
     * 获取子工作项
     *
     * 获取子工作项
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListChildIssuesV4Request 请求对象
     * @return ListChildIssuesV4Response
     */
    public ListChildIssuesV4Response listChildIssuesV4(ListChildIssuesV4Request request) {
        return hcClient.syncInvokeHttp(request, ProjectManMeta.listChildIssuesV4);
    }

    /**
     * 获取子工作项
     *
     * 获取子工作项
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListChildIssuesV4Request 请求对象
     * @return SyncInvoker<ListChildIssuesV4Request, ListChildIssuesV4Response>
     */
    public SyncInvoker<ListChildIssuesV4Request, ListChildIssuesV4Response> listChildIssuesV4Invoker(
        ListChildIssuesV4Request request) {
        return new SyncInvoker<>(request, ProjectManMeta.listChildIssuesV4, hcClient);
    }

    /**
     * 查询当前工作项已经关联的代码提交记录 / 分支创建记录
     *
     * 查询当前工作项已经关联的代码提交记录 / 分支创建记录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListIssueAssociatedCommitsRequest 请求对象
     * @return ListIssueAssociatedCommitsResponse
     */
    public ListIssueAssociatedCommitsResponse listIssueAssociatedCommits(ListIssueAssociatedCommitsRequest request) {
        return hcClient.syncInvokeHttp(request, ProjectManMeta.listIssueAssociatedCommits);
    }

    /**
     * 查询当前工作项已经关联的代码提交记录 / 分支创建记录
     *
     * 查询当前工作项已经关联的代码提交记录 / 分支创建记录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListIssueAssociatedCommitsRequest 请求对象
     * @return SyncInvoker<ListIssueAssociatedCommitsRequest, ListIssueAssociatedCommitsResponse>
     */
    public SyncInvoker<ListIssueAssociatedCommitsRequest, ListIssueAssociatedCommitsResponse> listIssueAssociatedCommitsInvoker(
        ListIssueAssociatedCommitsRequest request) {
        return new SyncInvoker<>(request, ProjectManMeta.listIssueAssociatedCommits, hcClient);
    }

    /**
     * 获取指定工作项的评论列表
     *
     * 获取工作项的评论
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListIssueCommentsV4Request 请求对象
     * @return ListIssueCommentsV4Response
     */
    public ListIssueCommentsV4Response listIssueCommentsV4(ListIssueCommentsV4Request request) {
        return hcClient.syncInvokeHttp(request, ProjectManMeta.listIssueCommentsV4);
    }

    /**
     * 获取指定工作项的评论列表
     *
     * 获取工作项的评论
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListIssueCommentsV4Request 请求对象
     * @return SyncInvoker<ListIssueCommentsV4Request, ListIssueCommentsV4Response>
     */
    public SyncInvoker<ListIssueCommentsV4Request, ListIssueCommentsV4Response> listIssueCommentsV4Invoker(
        ListIssueCommentsV4Request request) {
        return new SyncInvoker<>(request, ProjectManMeta.listIssueCommentsV4, hcClient);
    }

    /**
     * 查询Scrum工作项自定义字段
     *
     * 查询Scrum工作项自定义字段的可选列表,符合custom_fields或者names条件的都返回,2个值都不传，返回所有的自定义字段列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListIssueCustomFieldsRequest 请求对象
     * @return ListIssueCustomFieldsResponse
     */
    public ListIssueCustomFieldsResponse listIssueCustomFields(ListIssueCustomFieldsRequest request) {
        return hcClient.syncInvokeHttp(request, ProjectManMeta.listIssueCustomFields);
    }

    /**
     * 查询Scrum工作项自定义字段
     *
     * 查询Scrum工作项自定义字段的可选列表,符合custom_fields或者names条件的都返回,2个值都不传，返回所有的自定义字段列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListIssueCustomFieldsRequest 请求对象
     * @return SyncInvoker<ListIssueCustomFieldsRequest, ListIssueCustomFieldsResponse>
     */
    public SyncInvoker<ListIssueCustomFieldsRequest, ListIssueCustomFieldsResponse> listIssueCustomFieldsInvoker(
        ListIssueCustomFieldsRequest request) {
        return new SyncInvoker<>(request, ProjectManMeta.listIssueCustomFields, hcClient);
    }

    /**
     * 获取工作项历史记录
     *
     * 获取工作项历史记录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListIssueRecordsV4Request 请求对象
     * @return ListIssueRecordsV4Response
     */
    public ListIssueRecordsV4Response listIssueRecordsV4(ListIssueRecordsV4Request request) {
        return hcClient.syncInvokeHttp(request, ProjectManMeta.listIssueRecordsV4);
    }

    /**
     * 获取工作项历史记录
     *
     * 获取工作项历史记录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListIssueRecordsV4Request 请求对象
     * @return SyncInvoker<ListIssueRecordsV4Request, ListIssueRecordsV4Response>
     */
    public SyncInvoker<ListIssueRecordsV4Request, ListIssueRecordsV4Response> listIssueRecordsV4Invoker(
        ListIssueRecordsV4Request request) {
        return new SyncInvoker<>(request, ProjectManMeta.listIssueRecordsV4, hcClient);
    }

    /**
     * 查询项目的工作项
     *
     * 工作项类型id, 分页参数，创建时间查询项目的工作项
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListIssuesSfV4Request 请求对象
     * @return ListIssuesSfV4Response
     */
    public ListIssuesSfV4Response listIssuesSfV4(ListIssuesSfV4Request request) {
        return hcClient.syncInvokeHttp(request, ProjectManMeta.listIssuesSfV4);
    }

    /**
     * 查询项目的工作项
     *
     * 工作项类型id, 分页参数，创建时间查询项目的工作项
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListIssuesSfV4Request 请求对象
     * @return SyncInvoker<ListIssuesSfV4Request, ListIssuesSfV4Response>
     */
    public SyncInvoker<ListIssuesSfV4Request, ListIssuesSfV4Response> listIssuesSfV4Invoker(
        ListIssuesSfV4Request request) {
        return new SyncInvoker<>(request, ProjectManMeta.listIssuesSfV4, hcClient);
    }

    /**
     * 高级查询工作项
     *
     * 根据筛选条件查询工作项
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListIssuesV4Request 请求对象
     * @return ListIssuesV4Response
     */
    public ListIssuesV4Response listIssuesV4(ListIssuesV4Request request) {
        return hcClient.syncInvokeHttp(request, ProjectManMeta.listIssuesV4);
    }

    /**
     * 高级查询工作项
     *
     * 根据筛选条件查询工作项
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListIssuesV4Request 请求对象
     * @return SyncInvoker<ListIssuesV4Request, ListIssuesV4Response>
     */
    public SyncInvoker<ListIssuesV4Request, ListIssuesV4Response> listIssuesV4Invoker(ListIssuesV4Request request) {
        return new SyncInvoker<>(request, ProjectManMeta.listIssuesV4, hcClient);
    }

    /**
     * 查看迭代历史记录
     *
     * 查看迭代历史记录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListIterationHistoriesRequest 请求对象
     * @return ListIterationHistoriesResponse
     */
    public ListIterationHistoriesResponse listIterationHistories(ListIterationHistoriesRequest request) {
        return hcClient.syncInvokeHttp(request, ProjectManMeta.listIterationHistories);
    }

    /**
     * 查看迭代历史记录
     *
     * 查看迭代历史记录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListIterationHistoriesRequest 请求对象
     * @return SyncInvoker<ListIterationHistoriesRequest, ListIterationHistoriesResponse>
     */
    public SyncInvoker<ListIterationHistoriesRequest, ListIterationHistoriesResponse> listIterationHistoriesInvoker(
        ListIterationHistoriesRequest request) {
        return new SyncInvoker<>(request, ProjectManMeta.listIterationHistories, hcClient);
    }

    /**
     * 查询项目的领域列表
     *
     * 查询项目的领域列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectDomainsRequest 请求对象
     * @return ListProjectDomainsResponse
     */
    public ListProjectDomainsResponse listProjectDomains(ListProjectDomainsRequest request) {
        return hcClient.syncInvokeHttp(request, ProjectManMeta.listProjectDomains);
    }

    /**
     * 查询项目的领域列表
     *
     * 查询项目的领域列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectDomainsRequest 请求对象
     * @return SyncInvoker<ListProjectDomainsRequest, ListProjectDomainsResponse>
     */
    public SyncInvoker<ListProjectDomainsRequest, ListProjectDomainsResponse> listProjectDomainsInvoker(
        ListProjectDomainsRequest request) {
        return new SyncInvoker<>(request, ProjectManMeta.listProjectDomains, hcClient);
    }

    /**
     * 查询项目下所有工作项的历史记录
     *
     * 查询项目下所有工作项的历史记录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectIssuesRecordsV4Request 请求对象
     * @return ListProjectIssuesRecordsV4Response
     */
    public ListProjectIssuesRecordsV4Response listProjectIssuesRecordsV4(ListProjectIssuesRecordsV4Request request) {
        return hcClient.syncInvokeHttp(request, ProjectManMeta.listProjectIssuesRecordsV4);
    }

    /**
     * 查询项目下所有工作项的历史记录
     *
     * 查询项目下所有工作项的历史记录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectIssuesRecordsV4Request 请求对象
     * @return SyncInvoker<ListProjectIssuesRecordsV4Request, ListProjectIssuesRecordsV4Response>
     */
    public SyncInvoker<ListProjectIssuesRecordsV4Request, ListProjectIssuesRecordsV4Response> listProjectIssuesRecordsV4Invoker(
        ListProjectIssuesRecordsV4Request request) {
        return new SyncInvoker<>(request, ProjectManMeta.listProjectIssuesRecordsV4, hcClient);
    }

    /**
     * 获取指定项目的迭代列表
     *
     * 获取项目迭代
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectIterationsV4Request 请求对象
     * @return ListProjectIterationsV4Response
     */
    public ListProjectIterationsV4Response listProjectIterationsV4(ListProjectIterationsV4Request request) {
        return hcClient.syncInvokeHttp(request, ProjectManMeta.listProjectIterationsV4);
    }

    /**
     * 获取指定项目的迭代列表
     *
     * 获取项目迭代
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectIterationsV4Request 请求对象
     * @return SyncInvoker<ListProjectIterationsV4Request, ListProjectIterationsV4Response>
     */
    public SyncInvoker<ListProjectIterationsV4Request, ListProjectIterationsV4Response> listProjectIterationsV4Invoker(
        ListProjectIterationsV4Request request) {
        return new SyncInvoker<>(request, ProjectManMeta.listProjectIterationsV4, hcClient);
    }

    /**
     * 查询项目的模块列表
     *
     * 查询项目的模块列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectModulesRequest 请求对象
     * @return ListProjectModulesResponse
     */
    public ListProjectModulesResponse listProjectModules(ListProjectModulesRequest request) {
        return hcClient.syncInvokeHttp(request, ProjectManMeta.listProjectModules);
    }

    /**
     * 查询项目的模块列表
     *
     * 查询项目的模块列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectModulesRequest 请求对象
     * @return SyncInvoker<ListProjectModulesRequest, ListProjectModulesResponse>
     */
    public SyncInvoker<ListProjectModulesRequest, ListProjectModulesResponse> listProjectModulesInvoker(
        ListProjectModulesRequest request) {
        return new SyncInvoker<>(request, ProjectManMeta.listProjectModules, hcClient);
    }

    /**
     * 按用户查询工时（多项目）
     *
     * 按用户查询工时（多项目）
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectWorkHoursRequest 请求对象
     * @return ListProjectWorkHoursResponse
     */
    public ListProjectWorkHoursResponse listProjectWorkHours(ListProjectWorkHoursRequest request) {
        return hcClient.syncInvokeHttp(request, ProjectManMeta.listProjectWorkHours);
    }

    /**
     * 按用户查询工时（多项目）
     *
     * 按用户查询工时（多项目）
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectWorkHoursRequest 请求对象
     * @return SyncInvoker<ListProjectWorkHoursRequest, ListProjectWorkHoursResponse>
     */
    public SyncInvoker<ListProjectWorkHoursRequest, ListProjectWorkHoursResponse> listProjectWorkHoursInvoker(
        ListProjectWorkHoursRequest request) {
        return new SyncInvoker<>(request, ProjectManMeta.listProjectWorkHours, hcClient);
    }

    /**
     * 查询项目下的工时类型
     *
     * 查询项目下的工时类型
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectWorkHoursTypeRequest 请求对象
     * @return ListProjectWorkHoursTypeResponse
     */
    public ListProjectWorkHoursTypeResponse listProjectWorkHoursType(ListProjectWorkHoursTypeRequest request) {
        return hcClient.syncInvokeHttp(request, ProjectManMeta.listProjectWorkHoursType);
    }

    /**
     * 查询项目下的工时类型
     *
     * 查询项目下的工时类型
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectWorkHoursTypeRequest 请求对象
     * @return SyncInvoker<ListProjectWorkHoursTypeRequest, ListProjectWorkHoursTypeResponse>
     */
    public SyncInvoker<ListProjectWorkHoursTypeRequest, ListProjectWorkHoursTypeResponse> listProjectWorkHoursTypeInvoker(
        ListProjectWorkHoursTypeRequest request) {
        return new SyncInvoker<>(request, ProjectManMeta.listProjectWorkHoursType, hcClient);
    }

    /**
     * 查询项目的状态列表
     *
     * 查询项目的状态列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListScrumProjectStatusesRequest 请求对象
     * @return ListScrumProjectStatusesResponse
     */
    public ListScrumProjectStatusesResponse listScrumProjectStatuses(ListScrumProjectStatusesRequest request) {
        return hcClient.syncInvokeHttp(request, ProjectManMeta.listScrumProjectStatuses);
    }

    /**
     * 查询项目的状态列表
     *
     * 查询项目的状态列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListScrumProjectStatusesRequest 请求对象
     * @return SyncInvoker<ListScrumProjectStatusesRequest, ListScrumProjectStatusesResponse>
     */
    public SyncInvoker<ListScrumProjectStatusesRequest, ListScrumProjectStatusesResponse> listScrumProjectStatusesInvoker(
        ListScrumProjectStatusesRequest request) {
        return new SyncInvoker<>(request, ProjectManMeta.listScrumProjectStatuses, hcClient);
    }

    /**
     * 获取指定工作项停留时间
     *
     * 获取指定工作项停留时间
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSpecIssueStayTimesRequest 请求对象
     * @return ListSpecIssueStayTimesResponse
     */
    public ListSpecIssueStayTimesResponse listSpecIssueStayTimes(ListSpecIssueStayTimesRequest request) {
        return hcClient.syncInvokeHttp(request, ProjectManMeta.listSpecIssueStayTimes);
    }

    /**
     * 获取指定工作项停留时间
     *
     * 获取指定工作项停留时间
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSpecIssueStayTimesRequest 请求对象
     * @return SyncInvoker<ListSpecIssueStayTimesRequest, ListSpecIssueStayTimesResponse>
     */
    public SyncInvoker<ListSpecIssueStayTimesRequest, ListSpecIssueStayTimesResponse> listSpecIssueStayTimesInvoker(
        ListSpecIssueStayTimesRequest request) {
        return new SyncInvoker<>(request, ProjectManMeta.listSpecIssueStayTimes, hcClient);
    }

    /**
     * 查询迭代下工作项状态的统计数据（处理人维度）
     *
     * 查询迭代下工作项状态的统计数据（处理人维度）
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListStatusStatisticRequest 请求对象
     * @return ListStatusStatisticResponse
     */
    public ListStatusStatisticResponse listStatusStatistic(ListStatusStatisticRequest request) {
        return hcClient.syncInvokeHttp(request, ProjectManMeta.listStatusStatistic);
    }

    /**
     * 查询迭代下工作项状态的统计数据（处理人维度）
     *
     * 查询迭代下工作项状态的统计数据（处理人维度）
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListStatusStatisticRequest 请求对象
     * @return SyncInvoker<ListStatusStatisticRequest, ListStatusStatisticResponse>
     */
    public SyncInvoker<ListStatusStatisticRequest, ListStatusStatisticResponse> listStatusStatisticInvoker(
        ListStatusStatisticRequest request) {
        return new SyncInvoker<>(request, ProjectManMeta.listStatusStatistic, hcClient);
    }

    /**
     * 高级查询我的待办工作项
     *
     * 高级查询我的待办工作项
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchIssuesRequest 请求对象
     * @return SearchIssuesResponse
     */
    public SearchIssuesResponse searchIssues(SearchIssuesRequest request) {
        return hcClient.syncInvokeHttp(request, ProjectManMeta.searchIssues);
    }

    /**
     * 高级查询我的待办工作项
     *
     * 高级查询我的待办工作项
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchIssuesRequest 请求对象
     * @return SyncInvoker<SearchIssuesRequest, SearchIssuesResponse>
     */
    public SyncInvoker<SearchIssuesRequest, SearchIssuesResponse> searchIssuesInvoker(SearchIssuesRequest request) {
        return new SyncInvoker<>(request, ProjectManMeta.searchIssues, hcClient);
    }

    /**
     * 获取工作项完成率
     *
     * 获取工作项的完成率
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowIssueCompletionRateRequest 请求对象
     * @return ShowIssueCompletionRateResponse
     */
    public ShowIssueCompletionRateResponse showIssueCompletionRate(ShowIssueCompletionRateRequest request) {
        return hcClient.syncInvokeHttp(request, ProjectManMeta.showIssueCompletionRate);
    }

    /**
     * 获取工作项完成率
     *
     * 获取工作项的完成率
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowIssueCompletionRateRequest 请求对象
     * @return SyncInvoker<ShowIssueCompletionRateRequest, ShowIssueCompletionRateResponse>
     */
    public SyncInvoker<ShowIssueCompletionRateRequest, ShowIssueCompletionRateResponse> showIssueCompletionRateInvoker(
        ShowIssueCompletionRateRequest request) {
        return new SyncInvoker<>(request, ProjectManMeta.showIssueCompletionRate, hcClient);
    }

    /**
     * 查询工作项详情
     *
     * 查询工作项详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowIssueV4Request 请求对象
     * @return ShowIssueV4Response
     */
    public ShowIssueV4Response showIssueV4(ShowIssueV4Request request) {
        return hcClient.syncInvokeHttp(request, ProjectManMeta.showIssueV4);
    }

    /**
     * 查询工作项详情
     *
     * 查询工作项详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowIssueV4Request 请求对象
     * @return SyncInvoker<ShowIssueV4Request, ShowIssueV4Response>
     */
    public SyncInvoker<ShowIssueV4Request, ShowIssueV4Response> showIssueV4Invoker(ShowIssueV4Request request) {
        return new SyncInvoker<>(request, ProjectManMeta.showIssueV4, hcClient);
    }

    /**
     * 查询Scrum项目的工作项流转配置
     *
     * 查询Scrum项目的工作项流转配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowIssuesWrokFlowConfigRequest 请求对象
     * @return ShowIssuesWrokFlowConfigResponse
     */
    public ShowIssuesWrokFlowConfigResponse showIssuesWrokFlowConfig(ShowIssuesWrokFlowConfigRequest request) {
        return hcClient.syncInvokeHttp(request, ProjectManMeta.showIssuesWrokFlowConfig);
    }

    /**
     * 查询Scrum项目的工作项流转配置
     *
     * 查询Scrum项目的工作项流转配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowIssuesWrokFlowConfigRequest 请求对象
     * @return SyncInvoker<ShowIssuesWrokFlowConfigRequest, ShowIssuesWrokFlowConfigResponse>
     */
    public SyncInvoker<ShowIssuesWrokFlowConfigRequest, ShowIssuesWrokFlowConfigResponse> showIssuesWrokFlowConfigInvoker(
        ShowIssuesWrokFlowConfigRequest request) {
        return new SyncInvoker<>(request, ProjectManMeta.showIssuesWrokFlowConfig, hcClient);
    }

    /**
     * 查看迭代详情
     *
     * 查看迭代详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowIterationV4Request 请求对象
     * @return ShowIterationV4Response
     */
    public ShowIterationV4Response showIterationV4(ShowIterationV4Request request) {
        return hcClient.syncInvokeHttp(request, ProjectManMeta.showIterationV4);
    }

    /**
     * 查看迭代详情
     *
     * 查看迭代详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowIterationV4Request 请求对象
     * @return SyncInvoker<ShowIterationV4Request, ShowIterationV4Response>
     */
    public SyncInvoker<ShowIterationV4Request, ShowIterationV4Response> showIterationV4Invoker(
        ShowIterationV4Request request) {
        return new SyncInvoker<>(request, ProjectManMeta.showIterationV4, hcClient);
    }

    /**
     * 按用户查询工时（单项目）
     *
     * 按用户查询工时（单项目）
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowProjectWorkHoursRequest 请求对象
     * @return ShowProjectWorkHoursResponse
     */
    public ShowProjectWorkHoursResponse showProjectWorkHours(ShowProjectWorkHoursRequest request) {
        return hcClient.syncInvokeHttp(request, ProjectManMeta.showProjectWorkHours);
    }

    /**
     * 按用户查询工时（单项目）
     *
     * 按用户查询工时（单项目）
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowProjectWorkHoursRequest 请求对象
     * @return SyncInvoker<ShowProjectWorkHoursRequest, ShowProjectWorkHoursResponse>
     */
    public SyncInvoker<ShowProjectWorkHoursRequest, ShowProjectWorkHoursResponse> showProjectWorkHoursInvoker(
        ShowProjectWorkHoursRequest request) {
        return new SyncInvoker<>(request, ProjectManMeta.showProjectWorkHours, hcClient);
    }

    /**
     * 更新工作项
     *
     * 更新工作项
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateIssueV4Request 请求对象
     * @return UpdateIssueV4Response
     */
    public UpdateIssueV4Response updateIssueV4(UpdateIssueV4Request request) {
        return hcClient.syncInvokeHttp(request, ProjectManMeta.updateIssueV4);
    }

    /**
     * 更新工作项
     *
     * 更新工作项
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateIssueV4Request 请求对象
     * @return SyncInvoker<UpdateIssueV4Request, UpdateIssueV4Response>
     */
    public SyncInvoker<UpdateIssueV4Request, UpdateIssueV4Response> updateIssueV4Invoker(UpdateIssueV4Request request) {
        return new SyncInvoker<>(request, ProjectManMeta.updateIssueV4, hcClient);
    }

    /**
     * 更新Scrum项目迭代
     *
     * 更新Scrum项目迭代
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateIterationV4Request 请求对象
     * @return UpdateIterationV4Response
     */
    public UpdateIterationV4Response updateIterationV4(UpdateIterationV4Request request) {
        return hcClient.syncInvokeHttp(request, ProjectManMeta.updateIterationV4);
    }

    /**
     * 更新Scrum项目迭代
     *
     * 更新Scrum项目迭代
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateIterationV4Request 请求对象
     * @return SyncInvoker<UpdateIterationV4Request, UpdateIterationV4Response>
     */
    public SyncInvoker<UpdateIterationV4Request, UpdateIterationV4Response> updateIterationV4Invoker(
        UpdateIterationV4Request request) {
        return new SyncInvoker<>(request, ProjectManMeta.updateIterationV4, hcClient);
    }

    /**
     * 更新项目的领域
     *
     * 更新项目的领域
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateProjectDomainRequest 请求对象
     * @return UpdateProjectDomainResponse
     */
    public UpdateProjectDomainResponse updateProjectDomain(UpdateProjectDomainRequest request) {
        return hcClient.syncInvokeHttp(request, ProjectManMeta.updateProjectDomain);
    }

    /**
     * 更新项目的领域
     *
     * 更新项目的领域
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateProjectDomainRequest 请求对象
     * @return SyncInvoker<UpdateProjectDomainRequest, UpdateProjectDomainResponse>
     */
    public SyncInvoker<UpdateProjectDomainRequest, UpdateProjectDomainResponse> updateProjectDomainInvoker(
        UpdateProjectDomainRequest request) {
        return new SyncInvoker<>(request, ProjectManMeta.updateProjectDomain, hcClient);
    }

    /**
     * 更新项目的模块
     *
     * 更新项目的模块
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateProjectModuleRequest 请求对象
     * @return UpdateProjectModuleResponse
     */
    public UpdateProjectModuleResponse updateProjectModule(UpdateProjectModuleRequest request) {
        return hcClient.syncInvokeHttp(request, ProjectManMeta.updateProjectModule);
    }

    /**
     * 更新项目的模块
     *
     * 更新项目的模块
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateProjectModuleRequest 请求对象
     * @return SyncInvoker<UpdateProjectModuleRequest, UpdateProjectModuleResponse>
     */
    public SyncInvoker<UpdateProjectModuleRequest, UpdateProjectModuleResponse> updateProjectModuleInvoker(
        UpdateProjectModuleRequest request) {
        return new SyncInvoker<>(request, ProjectManMeta.updateProjectModule, hcClient);
    }

    /**
     * 上传工作项附件
     *
     * 上传工作项附件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UploadAttachmentsRequest 请求对象
     * @return UploadAttachmentsResponse
     */
    public UploadAttachmentsResponse uploadAttachments(UploadAttachmentsRequest request) {
        return hcClient.syncInvokeHttp(request, ProjectManMeta.uploadAttachments);
    }

    /**
     * 上传工作项附件
     *
     * 上传工作项附件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UploadAttachmentsRequest 请求对象
     * @return SyncInvoker<UploadAttachmentsRequest, UploadAttachmentsResponse>
     */
    public SyncInvoker<UploadAttachmentsRequest, UploadAttachmentsResponse> uploadAttachmentsInvoker(
        UploadAttachmentsRequest request) {
        return new SyncInvoker<>(request, ProjectManMeta.uploadAttachments, hcClient);
    }

    /**
     * 上传图片
     *
     * 上传图片
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UploadIssueImgRequest 请求对象
     * @return UploadIssueImgResponse
     */
    public UploadIssueImgResponse uploadIssueImg(UploadIssueImgRequest request) {
        return hcClient.syncInvokeHttp(request, ProjectManMeta.uploadIssueImg);
    }

    /**
     * 上传图片
     *
     * 上传图片
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UploadIssueImgRequest 请求对象
     * @return SyncInvoker<UploadIssueImgRequest, UploadIssueImgResponse>
     */
    public SyncInvoker<UploadIssueImgRequest, UploadIssueImgResponse> uploadIssueImgInvoker(
        UploadIssueImgRequest request) {
        return new SyncInvoker<>(request, ProjectManMeta.uploadIssueImg, hcClient);
    }

}
