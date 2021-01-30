package com.huaweicloud.sdk.projectman.v4;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.projectman.v4.model.*;

public class ProjectManClient {
    protected HcClient hcClient;

    public ProjectManClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<ProjectManClient> newBuilder() {
        return new ClientBuilder<>(ProjectManClient::new);
    }


    /**
     * AGC调用 当前用户申请加入项目
     * AGC调用 当前用户申请加入项目, 申请的用户id写在header中
     *
     * @param AddApplyJoinProjectForAgcRequest 请求对象
     * @return AddApplyJoinProjectForAgcResponse
     */
    public AddApplyJoinProjectForAgcResponse addApplyJoinProjectForAgc(AddApplyJoinProjectForAgcRequest request) {
        return hcClient.syncInvokeHttp(request, ProjectManMeta.addApplyJoinProjectForAgc);
    }

    /**
     * AGC调用 当前用户申请加入项目
     * AGC调用 当前用户申请加入项目, 申请的用户id写在header中
     *
     * @param AddApplyJoinProjectForAgcRequest 请求对象
     * @return SyncInvoker<AddApplyJoinProjectForAgcRequest, AddApplyJoinProjectForAgcResponse>
     */
    public SyncInvoker<AddApplyJoinProjectForAgcRequest, AddApplyJoinProjectForAgcResponse> addApplyJoinProjectForAgcInvoker(AddApplyJoinProjectForAgcRequest request) {
        return new SyncInvoker<AddApplyJoinProjectForAgcRequest, AddApplyJoinProjectForAgcResponse>(request, ProjectManMeta.addApplyJoinProjectForAgc, hcClient);
    }

    /**
     * 添加项目成员
     * 添加项目成员,可以添加跨租户成员
     *
     * @param AddMemberV4Request 请求对象
     * @return AddMemberV4Response
     */
    public AddMemberV4Response addMemberV4(AddMemberV4Request request) {
        return hcClient.syncInvokeHttp(request, ProjectManMeta.addMemberV4);
    }

    /**
     * 添加项目成员
     * 添加项目成员,可以添加跨租户成员
     *
     * @param AddMemberV4Request 请求对象
     * @return SyncInvoker<AddMemberV4Request, AddMemberV4Response>
     */
    public SyncInvoker<AddMemberV4Request, AddMemberV4Response> addMemberV4Invoker(AddMemberV4Request request) {
        return new SyncInvoker<AddMemberV4Request, AddMemberV4Response>(request, ProjectManMeta.addMemberV4, hcClient);
    }

    /**
     * 批量添加项目成员
     * 批量添加项目成员，只能添加和项目创建者同一租户下的成员，不正确的用户id会略过，添加的用户超过权限的，默认角色设置为7
     *
     * @param BatchAddMembersV4Request 请求对象
     * @return BatchAddMembersV4Response
     */
    public BatchAddMembersV4Response batchAddMembersV4(BatchAddMembersV4Request request) {
        return hcClient.syncInvokeHttp(request, ProjectManMeta.batchAddMembersV4);
    }

    /**
     * 批量添加项目成员
     * 批量添加项目成员，只能添加和项目创建者同一租户下的成员，不正确的用户id会略过，添加的用户超过权限的，默认角色设置为7
     *
     * @param BatchAddMembersV4Request 请求对象
     * @return SyncInvoker<BatchAddMembersV4Request, BatchAddMembersV4Response>
     */
    public SyncInvoker<BatchAddMembersV4Request, BatchAddMembersV4Response> batchAddMembersV4Invoker(BatchAddMembersV4Request request) {
        return new SyncInvoker<BatchAddMembersV4Request, BatchAddMembersV4Response>(request, ProjectManMeta.batchAddMembersV4, hcClient);
    }

    /**
     * 批量删除项目的迭代
     * 批量删除项目的迭代
     *
     * @param BatchDeleteIterationsV4Request 请求对象
     * @return BatchDeleteIterationsV4Response
     */
    public BatchDeleteIterationsV4Response batchDeleteIterationsV4(BatchDeleteIterationsV4Request request) {
        return hcClient.syncInvokeHttp(request, ProjectManMeta.batchDeleteIterationsV4);
    }

    /**
     * 批量删除项目的迭代
     * 批量删除项目的迭代
     *
     * @param BatchDeleteIterationsV4Request 请求对象
     * @return SyncInvoker<BatchDeleteIterationsV4Request, BatchDeleteIterationsV4Response>
     */
    public SyncInvoker<BatchDeleteIterationsV4Request, BatchDeleteIterationsV4Response> batchDeleteIterationsV4Invoker(BatchDeleteIterationsV4Request request) {
        return new SyncInvoker<BatchDeleteIterationsV4Request, BatchDeleteIterationsV4Response>(request, ProjectManMeta.batchDeleteIterationsV4, hcClient);
    }

    /**
     * 批量删除项目成员
     * 批量删除项目成员
     *
     * @param BatchDeleteMembersV4Request 请求对象
     * @return BatchDeleteMembersV4Response
     */
    public BatchDeleteMembersV4Response batchDeleteMembersV4(BatchDeleteMembersV4Request request) {
        return hcClient.syncInvokeHttp(request, ProjectManMeta.batchDeleteMembersV4);
    }

    /**
     * 批量删除项目成员
     * 批量删除项目成员
     *
     * @param BatchDeleteMembersV4Request 请求对象
     * @return SyncInvoker<BatchDeleteMembersV4Request, BatchDeleteMembersV4Response>
     */
    public SyncInvoker<BatchDeleteMembersV4Request, BatchDeleteMembersV4Response> batchDeleteMembersV4Invoker(BatchDeleteMembersV4Request request) {
        return new SyncInvoker<BatchDeleteMembersV4Request, BatchDeleteMembersV4Response>(request, ProjectManMeta.batchDeleteMembersV4, hcClient);
    }

    /**
     * 检查项目名称是否存在
     * 更新项目
     *
     * @param CheckProjectNameV4Request 请求对象
     * @return CheckProjectNameV4Response
     */
    public CheckProjectNameV4Response checkProjectNameV4(CheckProjectNameV4Request request) {
        return hcClient.syncInvokeHttp(request, ProjectManMeta.checkProjectNameV4);
    }

    /**
     * 检查项目名称是否存在
     * 更新项目
     *
     * @param CheckProjectNameV4Request 请求对象
     * @return SyncInvoker<CheckProjectNameV4Request, CheckProjectNameV4Response>
     */
    public SyncInvoker<CheckProjectNameV4Request, CheckProjectNameV4Response> checkProjectNameV4Invoker(CheckProjectNameV4Request request) {
        return new SyncInvoker<CheckProjectNameV4Request, CheckProjectNameV4Response>(request, ProjectManMeta.checkProjectNameV4, hcClient);
    }

    /**
     * 创建Scrum项目迭代
     * 创建Scrum项目迭代
     *
     * @param CreateIterationV4Request 请求对象
     * @return CreateIterationV4Response
     */
    public CreateIterationV4Response createIterationV4(CreateIterationV4Request request) {
        return hcClient.syncInvokeHttp(request, ProjectManMeta.createIterationV4);
    }

    /**
     * 创建Scrum项目迭代
     * 创建Scrum项目迭代
     *
     * @param CreateIterationV4Request 请求对象
     * @return SyncInvoker<CreateIterationV4Request, CreateIterationV4Response>
     */
    public SyncInvoker<CreateIterationV4Request, CreateIterationV4Response> createIterationV4Invoker(CreateIterationV4Request request) {
        return new SyncInvoker<CreateIterationV4Request, CreateIterationV4Response>(request, ProjectManMeta.createIterationV4, hcClient);
    }

    /**
     * 创建项目
     * 创建项目
     *
     * @param CreateProjectV4Request 请求对象
     * @return CreateProjectV4Response
     */
    public CreateProjectV4Response createProjectV4(CreateProjectV4Request request) {
        return hcClient.syncInvokeHttp(request, ProjectManMeta.createProjectV4);
    }

    /**
     * 创建项目
     * 创建项目
     *
     * @param CreateProjectV4Request 请求对象
     * @return SyncInvoker<CreateProjectV4Request, CreateProjectV4Response>
     */
    public SyncInvoker<CreateProjectV4Request, CreateProjectV4Response> createProjectV4Invoker(CreateProjectV4Request request) {
        return new SyncInvoker<CreateProjectV4Request, CreateProjectV4Response>(request, ProjectManMeta.createProjectV4, hcClient);
    }

    /**
     * 删除项目迭代
     * 删除项目迭代
     *
     * @param DeleteIterationV4Request 请求对象
     * @return DeleteIterationV4Response
     */
    public DeleteIterationV4Response deleteIterationV4(DeleteIterationV4Request request) {
        return hcClient.syncInvokeHttp(request, ProjectManMeta.deleteIterationV4);
    }

    /**
     * 删除项目迭代
     * 删除项目迭代
     *
     * @param DeleteIterationV4Request 请求对象
     * @return SyncInvoker<DeleteIterationV4Request, DeleteIterationV4Response>
     */
    public SyncInvoker<DeleteIterationV4Request, DeleteIterationV4Response> deleteIterationV4Invoker(DeleteIterationV4Request request) {
        return new SyncInvoker<DeleteIterationV4Request, DeleteIterationV4Response>(request, ProjectManMeta.deleteIterationV4, hcClient);
    }

    /**
     * 删除项目
     * 删除项目
     *
     * @param DeleteProjectV4Request 请求对象
     * @return DeleteProjectV4Response
     */
    public DeleteProjectV4Response deleteProjectV4(DeleteProjectV4Request request) {
        return hcClient.syncInvokeHttp(request, ProjectManMeta.deleteProjectV4);
    }

    /**
     * 删除项目
     * 删除项目
     *
     * @param DeleteProjectV4Request 请求对象
     * @return SyncInvoker<DeleteProjectV4Request, DeleteProjectV4Response>
     */
    public SyncInvoker<DeleteProjectV4Request, DeleteProjectV4Response> deleteProjectV4Invoker(DeleteProjectV4Request request) {
        return new SyncInvoker<DeleteProjectV4Request, DeleteProjectV4Response>(request, ProjectManMeta.deleteProjectV4, hcClient);
    }

    /**
     * 获取租户没有加入的项目
     * 获取租户没有加入的项目
     *
     * @param ListDomainNotAddedProjectsV4Request 请求对象
     * @return ListDomainNotAddedProjectsV4Response
     */
    public ListDomainNotAddedProjectsV4Response listDomainNotAddedProjectsV4(ListDomainNotAddedProjectsV4Request request) {
        return hcClient.syncInvokeHttp(request, ProjectManMeta.listDomainNotAddedProjectsV4);
    }

    /**
     * 获取租户没有加入的项目
     * 获取租户没有加入的项目
     *
     * @param ListDomainNotAddedProjectsV4Request 请求对象
     * @return SyncInvoker<ListDomainNotAddedProjectsV4Request, ListDomainNotAddedProjectsV4Response>
     */
    public SyncInvoker<ListDomainNotAddedProjectsV4Request, ListDomainNotAddedProjectsV4Response> listDomainNotAddedProjectsV4Invoker(ListDomainNotAddedProjectsV4Request request) {
        return new SyncInvoker<ListDomainNotAddedProjectsV4Request, ListDomainNotAddedProjectsV4Response>(request, ProjectManMeta.listDomainNotAddedProjectsV4, hcClient);
    }

    /**
     * 获取bug统计信息
     * 获取bug统计信息，按模块统计
     *
     * @param ListProjectBugStaticsV4Request 请求对象
     * @return ListProjectBugStaticsV4Response
     */
    public ListProjectBugStaticsV4Response listProjectBugStaticsV4(ListProjectBugStaticsV4Request request) {
        return hcClient.syncInvokeHttp(request, ProjectManMeta.listProjectBugStaticsV4);
    }

    /**
     * 获取bug统计信息
     * 获取bug统计信息，按模块统计
     *
     * @param ListProjectBugStaticsV4Request 请求对象
     * @return SyncInvoker<ListProjectBugStaticsV4Request, ListProjectBugStaticsV4Response>
     */
    public SyncInvoker<ListProjectBugStaticsV4Request, ListProjectBugStaticsV4Response> listProjectBugStaticsV4Invoker(ListProjectBugStaticsV4Request request) {
        return new SyncInvoker<ListProjectBugStaticsV4Request, ListProjectBugStaticsV4Response>(request, ProjectManMeta.listProjectBugStaticsV4, hcClient);
    }

    /**
     * 获取需求统计信息
     * 获取需求统计信息
     *
     * @param ListProjectDemandStaticV4Request 请求对象
     * @return ListProjectDemandStaticV4Response
     */
    public ListProjectDemandStaticV4Response listProjectDemandStaticV4(ListProjectDemandStaticV4Request request) {
        return hcClient.syncInvokeHttp(request, ProjectManMeta.listProjectDemandStaticV4);
    }

    /**
     * 获取需求统计信息
     * 获取需求统计信息
     *
     * @param ListProjectDemandStaticV4Request 请求对象
     * @return SyncInvoker<ListProjectDemandStaticV4Request, ListProjectDemandStaticV4Response>
     */
    public SyncInvoker<ListProjectDemandStaticV4Request, ListProjectDemandStaticV4Response> listProjectDemandStaticV4Invoker(ListProjectDemandStaticV4Request request) {
        return new SyncInvoker<ListProjectDemandStaticV4Request, ListProjectDemandStaticV4Response>(request, ProjectManMeta.listProjectDemandStaticV4, hcClient);
    }

    /**
     * 获取指定项目的迭代列表
     * 获取项目迭代
     *
     * @param ListProjectIterationsV4Request 请求对象
     * @return ListProjectIterationsV4Response
     */
    public ListProjectIterationsV4Response listProjectIterationsV4(ListProjectIterationsV4Request request) {
        return hcClient.syncInvokeHttp(request, ProjectManMeta.listProjectIterationsV4);
    }

    /**
     * 获取指定项目的迭代列表
     * 获取项目迭代
     *
     * @param ListProjectIterationsV4Request 请求对象
     * @return SyncInvoker<ListProjectIterationsV4Request, ListProjectIterationsV4Response>
     */
    public SyncInvoker<ListProjectIterationsV4Request, ListProjectIterationsV4Response> listProjectIterationsV4Invoker(ListProjectIterationsV4Request request) {
        return new SyncInvoker<ListProjectIterationsV4Request, ListProjectIterationsV4Response>(request, ProjectManMeta.listProjectIterationsV4, hcClient);
    }

    /**
     * 获取指定项目的成员用户列表
     * 获取项目成员列表
     *
     * @param ListProjectMembersV4Request 请求对象
     * @return ListProjectMembersV4Response
     */
    public ListProjectMembersV4Response listProjectMembersV4(ListProjectMembersV4Request request) {
        return hcClient.syncInvokeHttp(request, ProjectManMeta.listProjectMembersV4);
    }

    /**
     * 获取指定项目的成员用户列表
     * 获取项目成员列表
     *
     * @param ListProjectMembersV4Request 请求对象
     * @return SyncInvoker<ListProjectMembersV4Request, ListProjectMembersV4Response>
     */
    public SyncInvoker<ListProjectMembersV4Request, ListProjectMembersV4Response> listProjectMembersV4Invoker(ListProjectMembersV4Request request) {
        return new SyncInvoker<ListProjectMembersV4Request, ListProjectMembersV4Response>(request, ProjectManMeta.listProjectMembersV4, hcClient);
    }

    /**
     * 查询项目列表
     * 查询项目列表
     *
     * @param ListProjectsV4Request 请求对象
     * @return ListProjectsV4Response
     */
    public ListProjectsV4Response listProjectsV4(ListProjectsV4Request request) {
        return hcClient.syncInvokeHttp(request, ProjectManMeta.listProjectsV4);
    }

    /**
     * 查询项目列表
     * 查询项目列表
     *
     * @param ListProjectsV4Request 请求对象
     * @return SyncInvoker<ListProjectsV4Request, ListProjectsV4Response>
     */
    public SyncInvoker<ListProjectsV4Request, ListProjectsV4Response> listProjectsV4Invoker(ListProjectsV4Request request) {
        return new SyncInvoker<ListProjectsV4Request, ListProjectsV4Response>(request, ProjectManMeta.listProjectsV4, hcClient);
    }

    /**
     * 主动退出项目
     * 项目成员主动退出项目，项目创建者不能退出
     *
     * @param RemoveProjectRequest 请求对象
     * @return RemoveProjectResponse
     */
    public RemoveProjectResponse removeProject(RemoveProjectRequest request) {
        return hcClient.syncInvokeHttp(request, ProjectManMeta.removeProject);
    }

    /**
     * 主动退出项目
     * 项目成员主动退出项目，项目创建者不能退出
     *
     * @param RemoveProjectRequest 请求对象
     * @return SyncInvoker<RemoveProjectRequest, RemoveProjectResponse>
     */
    public SyncInvoker<RemoveProjectRequest, RemoveProjectResponse> removeProjectInvoker(RemoveProjectRequest request) {
        return new SyncInvoker<RemoveProjectRequest, RemoveProjectResponse>(request, ProjectManMeta.removeProject, hcClient);
    }

    /**
     * 获取当前用户信息
     * 获取当前用户信息
     *
     * @param ShowCurUserInfoRequest 请求对象
     * @return ShowCurUserInfoResponse
     */
    public ShowCurUserInfoResponse showCurUserInfo(ShowCurUserInfoRequest request) {
        return hcClient.syncInvokeHttp(request, ProjectManMeta.showCurUserInfo);
    }

    /**
     * 获取当前用户信息
     * 获取当前用户信息
     *
     * @param ShowCurUserInfoRequest 请求对象
     * @return SyncInvoker<ShowCurUserInfoRequest, ShowCurUserInfoResponse>
     */
    public SyncInvoker<ShowCurUserInfoRequest, ShowCurUserInfoResponse> showCurUserInfoInvoker(ShowCurUserInfoRequest request) {
        return new SyncInvoker<ShowCurUserInfoRequest, ShowCurUserInfoResponse>(request, ProjectManMeta.showCurUserInfo, hcClient);
    }

    /**
     * 获取当前用户角色
     * 获取用户在项目中的角色
     *
     * @param ShowCurUserRoleRequest 请求对象
     * @return ShowCurUserRoleResponse
     */
    public ShowCurUserRoleResponse showCurUserRole(ShowCurUserRoleRequest request) {
        return hcClient.syncInvokeHttp(request, ProjectManMeta.showCurUserRole);
    }

    /**
     * 获取当前用户角色
     * 获取用户在项目中的角色
     *
     * @param ShowCurUserRoleRequest 请求对象
     * @return SyncInvoker<ShowCurUserRoleRequest, ShowCurUserRoleResponse>
     */
    public SyncInvoker<ShowCurUserRoleRequest, ShowCurUserRoleResponse> showCurUserRoleInvoker(ShowCurUserRoleRequest request) {
        return new SyncInvoker<ShowCurUserRoleRequest, ShowCurUserRoleResponse>(request, ProjectManMeta.showCurUserRole, hcClient);
    }

    /**
     * 查看迭代详情
     * 查看迭代详情
     *
     * @param ShowIterationV4Request 请求对象
     * @return ShowIterationV4Response
     */
    public ShowIterationV4Response showIterationV4(ShowIterationV4Request request) {
        return hcClient.syncInvokeHttp(request, ProjectManMeta.showIterationV4);
    }

    /**
     * 查看迭代详情
     * 查看迭代详情
     *
     * @param ShowIterationV4Request 请求对象
     * @return SyncInvoker<ShowIterationV4Request, ShowIterationV4Response>
     */
    public SyncInvoker<ShowIterationV4Request, ShowIterationV4Response> showIterationV4Invoker(ShowIterationV4Request request) {
        return new SyncInvoker<ShowIterationV4Request, ShowIterationV4Response>(request, ProjectManMeta.showIterationV4, hcClient);
    }

    /**
     * 获取项目概览
     * 获取项目概览
     *
     * @param ShowProjectSummaryV4Request 请求对象
     * @return ShowProjectSummaryV4Response
     */
    public ShowProjectSummaryV4Response showProjectSummaryV4(ShowProjectSummaryV4Request request) {
        return hcClient.syncInvokeHttp(request, ProjectManMeta.showProjectSummaryV4);
    }

    /**
     * 获取项目概览
     * 获取项目概览
     *
     * @param ShowProjectSummaryV4Request 请求对象
     * @return SyncInvoker<ShowProjectSummaryV4Request, ShowProjectSummaryV4Response>
     */
    public SyncInvoker<ShowProjectSummaryV4Request, ShowProjectSummaryV4Response> showProjectSummaryV4Invoker(ShowProjectSummaryV4Request request) {
        return new SyncInvoker<ShowProjectSummaryV4Request, ShowProjectSummaryV4Response>(request, ProjectManMeta.showProjectSummaryV4, hcClient);
    }

    /**
     * 更新Scrum项目迭代
     * 更新Scrum项目迭代
     *
     * @param UpdateIterationV4Request 请求对象
     * @return UpdateIterationV4Response
     */
    public UpdateIterationV4Response updateIterationV4(UpdateIterationV4Request request) {
        return hcClient.syncInvokeHttp(request, ProjectManMeta.updateIterationV4);
    }

    /**
     * 更新Scrum项目迭代
     * 更新Scrum项目迭代
     *
     * @param UpdateIterationV4Request 请求对象
     * @return SyncInvoker<UpdateIterationV4Request, UpdateIterationV4Response>
     */
    public SyncInvoker<UpdateIterationV4Request, UpdateIterationV4Response> updateIterationV4Invoker(UpdateIterationV4Request request) {
        return new SyncInvoker<UpdateIterationV4Request, UpdateIterationV4Response>(request, ProjectManMeta.updateIterationV4, hcClient);
    }

    /**
     * 更新成员在项目中的角色
     * 更新成员在项目中的角色
     *
     * @param UpdateMembesRoleV4Request 请求对象
     * @return UpdateMembesRoleV4Response
     */
    public UpdateMembesRoleV4Response updateMembesRoleV4(UpdateMembesRoleV4Request request) {
        return hcClient.syncInvokeHttp(request, ProjectManMeta.updateMembesRoleV4);
    }

    /**
     * 更新成员在项目中的角色
     * 更新成员在项目中的角色
     *
     * @param UpdateMembesRoleV4Request 请求对象
     * @return SyncInvoker<UpdateMembesRoleV4Request, UpdateMembesRoleV4Response>
     */
    public SyncInvoker<UpdateMembesRoleV4Request, UpdateMembesRoleV4Response> updateMembesRoleV4Invoker(UpdateMembesRoleV4Request request) {
        return new SyncInvoker<UpdateMembesRoleV4Request, UpdateMembesRoleV4Response>(request, ProjectManMeta.updateMembesRoleV4, hcClient);
    }

    /**
     * 更新用户昵称
     * 更新用户昵称
     *
     * @param UpdateNickNameV4Request 请求对象
     * @return UpdateNickNameV4Response
     */
    public UpdateNickNameV4Response updateNickNameV4(UpdateNickNameV4Request request) {
        return hcClient.syncInvokeHttp(request, ProjectManMeta.updateNickNameV4);
    }

    /**
     * 更新用户昵称
     * 更新用户昵称
     *
     * @param UpdateNickNameV4Request 请求对象
     * @return SyncInvoker<UpdateNickNameV4Request, UpdateNickNameV4Response>
     */
    public SyncInvoker<UpdateNickNameV4Request, UpdateNickNameV4Response> updateNickNameV4Invoker(UpdateNickNameV4Request request) {
        return new SyncInvoker<UpdateNickNameV4Request, UpdateNickNameV4Response>(request, ProjectManMeta.updateNickNameV4, hcClient);
    }

    /**
     * 更新项目
     * 更新项目
     *
     * @param UpdateProjectV4Request 请求对象
     * @return UpdateProjectV4Response
     */
    public UpdateProjectV4Response updateProjectV4(UpdateProjectV4Request request) {
        return hcClient.syncInvokeHttp(request, ProjectManMeta.updateProjectV4);
    }

    /**
     * 更新项目
     * 更新项目
     *
     * @param UpdateProjectV4Request 请求对象
     * @return SyncInvoker<UpdateProjectV4Request, UpdateProjectV4Response>
     */
    public SyncInvoker<UpdateProjectV4Request, UpdateProjectV4Response> updateProjectV4Invoker(UpdateProjectV4Request request) {
        return new SyncInvoker<UpdateProjectV4Request, UpdateProjectV4Response>(request, ProjectManMeta.updateProjectV4, hcClient);
    }

    /**
     * 批量删除工作项
     * 批量删除工作项
     *
     * @param BatchDeleteIssuesV4Request 请求对象
     * @return BatchDeleteIssuesV4Response
     */
    public BatchDeleteIssuesV4Response batchDeleteIssuesV4(BatchDeleteIssuesV4Request request) {
        return hcClient.syncInvokeHttp(request, ProjectManMeta.batchDeleteIssuesV4);
    }

    /**
     * 批量删除工作项
     * 批量删除工作项
     *
     * @param BatchDeleteIssuesV4Request 请求对象
     * @return SyncInvoker<BatchDeleteIssuesV4Request, BatchDeleteIssuesV4Response>
     */
    public SyncInvoker<BatchDeleteIssuesV4Request, BatchDeleteIssuesV4Response> batchDeleteIssuesV4Invoker(BatchDeleteIssuesV4Request request) {
        return new SyncInvoker<BatchDeleteIssuesV4Request, BatchDeleteIssuesV4Response>(request, ProjectManMeta.batchDeleteIssuesV4, hcClient);
    }

    /**
     * 创建工作项
     * 创建工作项
     *
     * @param CreateIssueV4Request 请求对象
     * @return CreateIssueV4Response
     */
    public CreateIssueV4Response createIssueV4(CreateIssueV4Request request) {
        return hcClient.syncInvokeHttp(request, ProjectManMeta.createIssueV4);
    }

    /**
     * 创建工作项
     * 创建工作项
     *
     * @param CreateIssueV4Request 请求对象
     * @return SyncInvoker<CreateIssueV4Request, CreateIssueV4Response>
     */
    public SyncInvoker<CreateIssueV4Request, CreateIssueV4Response> createIssueV4Invoker(CreateIssueV4Request request) {
        return new SyncInvoker<CreateIssueV4Request, CreateIssueV4Response>(request, ProjectManMeta.createIssueV4, hcClient);
    }

    /**
     * 删除工作项
     * 删除工作项
     *
     * @param DeleteIssueV4Request 请求对象
     * @return DeleteIssueV4Response
     */
    public DeleteIssueV4Response deleteIssueV4(DeleteIssueV4Request request) {
        return hcClient.syncInvokeHttp(request, ProjectManMeta.deleteIssueV4);
    }

    /**
     * 删除工作项
     * 删除工作项
     *
     * @param DeleteIssueV4Request 请求对象
     * @return SyncInvoker<DeleteIssueV4Request, DeleteIssueV4Response>
     */
    public SyncInvoker<DeleteIssueV4Request, DeleteIssueV4Response> deleteIssueV4Invoker(DeleteIssueV4Request request) {
        return new SyncInvoker<DeleteIssueV4Request, DeleteIssueV4Response>(request, ProjectManMeta.deleteIssueV4, hcClient);
    }

    /**
     * 获取子工作项
     * 获取子工作项
     *
     * @param ListChildIssuesV4Request 请求对象
     * @return ListChildIssuesV4Response
     */
    public ListChildIssuesV4Response listChildIssuesV4(ListChildIssuesV4Request request) {
        return hcClient.syncInvokeHttp(request, ProjectManMeta.listChildIssuesV4);
    }

    /**
     * 获取子工作项
     * 获取子工作项
     *
     * @param ListChildIssuesV4Request 请求对象
     * @return SyncInvoker<ListChildIssuesV4Request, ListChildIssuesV4Response>
     */
    public SyncInvoker<ListChildIssuesV4Request, ListChildIssuesV4Response> listChildIssuesV4Invoker(ListChildIssuesV4Request request) {
        return new SyncInvoker<ListChildIssuesV4Request, ListChildIssuesV4Response>(request, ProjectManMeta.listChildIssuesV4, hcClient);
    }

    /**
     * 获取指定工作项的评论列表
     * 获取工作项的评论
     *
     * @param ListIssueCommentsV4Request 请求对象
     * @return ListIssueCommentsV4Response
     */
    public ListIssueCommentsV4Response listIssueCommentsV4(ListIssueCommentsV4Request request) {
        return hcClient.syncInvokeHttp(request, ProjectManMeta.listIssueCommentsV4);
    }

    /**
     * 获取指定工作项的评论列表
     * 获取工作项的评论
     *
     * @param ListIssueCommentsV4Request 请求对象
     * @return SyncInvoker<ListIssueCommentsV4Request, ListIssueCommentsV4Response>
     */
    public SyncInvoker<ListIssueCommentsV4Request, ListIssueCommentsV4Response> listIssueCommentsV4Invoker(ListIssueCommentsV4Request request) {
        return new SyncInvoker<ListIssueCommentsV4Request, ListIssueCommentsV4Response>(request, ProjectManMeta.listIssueCommentsV4, hcClient);
    }

    /**
     * 获取工作项历史记录
     * 获取项目成员列表
     *
     * @param ListIssueRecordsV4Request 请求对象
     * @return ListIssueRecordsV4Response
     */
    public ListIssueRecordsV4Response listIssueRecordsV4(ListIssueRecordsV4Request request) {
        return hcClient.syncInvokeHttp(request, ProjectManMeta.listIssueRecordsV4);
    }

    /**
     * 获取工作项历史记录
     * 获取项目成员列表
     *
     * @param ListIssueRecordsV4Request 请求对象
     * @return SyncInvoker<ListIssueRecordsV4Request, ListIssueRecordsV4Response>
     */
    public SyncInvoker<ListIssueRecordsV4Request, ListIssueRecordsV4Response> listIssueRecordsV4Invoker(ListIssueRecordsV4Request request) {
        return new SyncInvoker<ListIssueRecordsV4Request, ListIssueRecordsV4Response>(request, ProjectManMeta.listIssueRecordsV4, hcClient);
    }

    /**
     * 高级查询工作项
     * 高级查询工作项,根据筛选条件查询工作中
     *
     * @param ListIssuesV4Request 请求对象
     * @return ListIssuesV4Response
     */
    public ListIssuesV4Response listIssuesV4(ListIssuesV4Request request) {
        return hcClient.syncInvokeHttp(request, ProjectManMeta.listIssuesV4);
    }

    /**
     * 高级查询工作项
     * 高级查询工作项,根据筛选条件查询工作中
     *
     * @param ListIssuesV4Request 请求对象
     * @return SyncInvoker<ListIssuesV4Request, ListIssuesV4Response>
     */
    public SyncInvoker<ListIssuesV4Request, ListIssuesV4Response> listIssuesV4Invoker(ListIssuesV4Request request) {
        return new SyncInvoker<ListIssuesV4Request, ListIssuesV4Response>(request, ProjectManMeta.listIssuesV4, hcClient);
    }

    /**
     * 按用户查询工时（多项目）
     * 按用户查询工时（多项目）
     *
     * @param ListProjectWorkHoursRequest 请求对象
     * @return ListProjectWorkHoursResponse
     */
    public ListProjectWorkHoursResponse listProjectWorkHours(ListProjectWorkHoursRequest request) {
        return hcClient.syncInvokeHttp(request, ProjectManMeta.listProjectWorkHours);
    }

    /**
     * 按用户查询工时（多项目）
     * 按用户查询工时（多项目）
     *
     * @param ListProjectWorkHoursRequest 请求对象
     * @return SyncInvoker<ListProjectWorkHoursRequest, ListProjectWorkHoursResponse>
     */
    public SyncInvoker<ListProjectWorkHoursRequest, ListProjectWorkHoursResponse> listProjectWorkHoursInvoker(ListProjectWorkHoursRequest request) {
        return new SyncInvoker<ListProjectWorkHoursRequest, ListProjectWorkHoursResponse>(request, ProjectManMeta.listProjectWorkHours, hcClient);
    }

    /**
     * 查询工作项详情
     * 查询工作项详情
     *
     * @param ShowIssueV4Request 请求对象
     * @return ShowIssueV4Response
     */
    public ShowIssueV4Response showIssueV4(ShowIssueV4Request request) {
        return hcClient.syncInvokeHttp(request, ProjectManMeta.showIssueV4);
    }

    /**
     * 查询工作项详情
     * 查询工作项详情
     *
     * @param ShowIssueV4Request 请求对象
     * @return SyncInvoker<ShowIssueV4Request, ShowIssueV4Response>
     */
    public SyncInvoker<ShowIssueV4Request, ShowIssueV4Response> showIssueV4Invoker(ShowIssueV4Request request) {
        return new SyncInvoker<ShowIssueV4Request, ShowIssueV4Response>(request, ProjectManMeta.showIssueV4, hcClient);
    }

    /**
     * 按用户查询工时（单项目）
     * 按用户查询工时（单项目）
     *
     * @param ShowProjectWorkHoursRequest 请求对象
     * @return ShowProjectWorkHoursResponse
     */
    public ShowProjectWorkHoursResponse showProjectWorkHours(ShowProjectWorkHoursRequest request) {
        return hcClient.syncInvokeHttp(request, ProjectManMeta.showProjectWorkHours);
    }

    /**
     * 按用户查询工时（单项目）
     * 按用户查询工时（单项目）
     *
     * @param ShowProjectWorkHoursRequest 请求对象
     * @return SyncInvoker<ShowProjectWorkHoursRequest, ShowProjectWorkHoursResponse>
     */
    public SyncInvoker<ShowProjectWorkHoursRequest, ShowProjectWorkHoursResponse> showProjectWorkHoursInvoker(ShowProjectWorkHoursRequest request) {
        return new SyncInvoker<ShowProjectWorkHoursRequest, ShowProjectWorkHoursResponse>(request, ProjectManMeta.showProjectWorkHours, hcClient);
    }

    /**
     * 获取工作项完成率
     * 获取工作项的完成率
     *
     * @param ShowtIssueCompletionRateRequest 请求对象
     * @return ShowtIssueCompletionRateResponse
     */
    public ShowtIssueCompletionRateResponse showtIssueCompletionRate(ShowtIssueCompletionRateRequest request) {
        return hcClient.syncInvokeHttp(request, ProjectManMeta.showtIssueCompletionRate);
    }

    /**
     * 获取工作项完成率
     * 获取工作项的完成率
     *
     * @param ShowtIssueCompletionRateRequest 请求对象
     * @return SyncInvoker<ShowtIssueCompletionRateRequest, ShowtIssueCompletionRateResponse>
     */
    public SyncInvoker<ShowtIssueCompletionRateRequest, ShowtIssueCompletionRateResponse> showtIssueCompletionRateInvoker(ShowtIssueCompletionRateRequest request) {
        return new SyncInvoker<ShowtIssueCompletionRateRequest, ShowtIssueCompletionRateResponse>(request, ProjectManMeta.showtIssueCompletionRate, hcClient);
    }

    /**
     * 更新工作项
     * 更新工作项
     *
     * @param UpdateIssueV4Request 请求对象
     * @return UpdateIssueV4Response
     */
    public UpdateIssueV4Response updateIssueV4(UpdateIssueV4Request request) {
        return hcClient.syncInvokeHttp(request, ProjectManMeta.updateIssueV4);
    }

    /**
     * 更新工作项
     * 更新工作项
     *
     * @param UpdateIssueV4Request 请求对象
     * @return SyncInvoker<UpdateIssueV4Request, UpdateIssueV4Response>
     */
    public SyncInvoker<UpdateIssueV4Request, UpdateIssueV4Response> updateIssueV4Invoker(UpdateIssueV4Request request) {
        return new SyncInvoker<UpdateIssueV4Request, UpdateIssueV4Response>(request, ProjectManMeta.updateIssueV4, hcClient);
    }

}