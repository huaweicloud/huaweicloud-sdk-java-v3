package com.huaweicloud.sdk.projectman.v4;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

import com.huaweicloud.sdk.projectman.v4.model.*;

public class ProjectManAsyncClient {
    protected HcClient hcClient;

    public ProjectManAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<ProjectManAsyncClient> newBuilder() {
        return new ClientBuilder<>(ProjectManAsyncClient::new);
    }


    /**
     * AGC调用 当前用户申请加入项目
     * AGC调用 当前用户申请加入项目, 申请的用户id写在header中
     *
     * @param AddApplyJoinProjectForAgcRequest 请求对象
     * @return CompletableFuture<AddApplyJoinProjectForAgcResponse>
     */
    public CompletableFuture<AddApplyJoinProjectForAgcResponse> addApplyJoinProjectForAgcAsync(AddApplyJoinProjectForAgcRequest request) {
        return hcClient.asyncInvokeHttp(request, ProjectManMeta.addApplyJoinProjectForAgc);
    }

    /**
     * 添加项目成员
     * 添加项目成员,可以添加跨租户成员
     *
     * @param AddMemberV4Request 请求对象
     * @return CompletableFuture<AddMemberV4Response>
     */
    public CompletableFuture<AddMemberV4Response> addMemberV4Async(AddMemberV4Request request) {
        return hcClient.asyncInvokeHttp(request, ProjectManMeta.addMemberV4);
    }

    /**
     * 批量添加项目成员
     * 批量添加项目成员，只能添加和项目创建者同一租户下的成员，不正确的用户id会略过，添加的用户超过权限的，默认角色设置为7
     *
     * @param BatchAddMembersV4Request 请求对象
     * @return CompletableFuture<BatchAddMembersV4Response>
     */
    public CompletableFuture<BatchAddMembersV4Response> batchAddMembersV4Async(BatchAddMembersV4Request request) {
        return hcClient.asyncInvokeHttp(request, ProjectManMeta.batchAddMembersV4);
    }

    /**
     * 批量删除项目的迭代
     * 批量删除项目的迭代
     *
     * @param BatchDeleteIterationsV4Request 请求对象
     * @return CompletableFuture<BatchDeleteIterationsV4Response>
     */
    public CompletableFuture<BatchDeleteIterationsV4Response> batchDeleteIterationsV4Async(BatchDeleteIterationsV4Request request) {
        return hcClient.asyncInvokeHttp(request, ProjectManMeta.batchDeleteIterationsV4);
    }

    /**
     * 批量删除项目成员
     * 批量删除项目成员
     *
     * @param BatchDeleteMembersV4Request 请求对象
     * @return CompletableFuture<BatchDeleteMembersV4Response>
     */
    public CompletableFuture<BatchDeleteMembersV4Response> batchDeleteMembersV4Async(BatchDeleteMembersV4Request request) {
        return hcClient.asyncInvokeHttp(request, ProjectManMeta.batchDeleteMembersV4);
    }

    /**
     * 检查项目名称是否存在
     * 更新项目
     *
     * @param CheckProjectNameV4Request 请求对象
     * @return CompletableFuture<CheckProjectNameV4Response>
     */
    public CompletableFuture<CheckProjectNameV4Response> checkProjectNameV4Async(CheckProjectNameV4Request request) {
        return hcClient.asyncInvokeHttp(request, ProjectManMeta.checkProjectNameV4);
    }

    /**
     * 创建Scrum项目迭代
     * 创建Scrum项目迭代
     *
     * @param CreateIterationV4Request 请求对象
     * @return CompletableFuture<CreateIterationV4Response>
     */
    public CompletableFuture<CreateIterationV4Response> createIterationV4Async(CreateIterationV4Request request) {
        return hcClient.asyncInvokeHttp(request, ProjectManMeta.createIterationV4);
    }

    /**
     * 创建项目
     * 创建项目
     *
     * @param CreateProjectV4Request 请求对象
     * @return CompletableFuture<CreateProjectV4Response>
     */
    public CompletableFuture<CreateProjectV4Response> createProjectV4Async(CreateProjectV4Request request) {
        return hcClient.asyncInvokeHttp(request, ProjectManMeta.createProjectV4);
    }

    /**
     * 删除项目迭代
     * 删除项目迭代
     *
     * @param DeleteIterationV4Request 请求对象
     * @return CompletableFuture<DeleteIterationV4Response>
     */
    public CompletableFuture<DeleteIterationV4Response> deleteIterationV4Async(DeleteIterationV4Request request) {
        return hcClient.asyncInvokeHttp(request, ProjectManMeta.deleteIterationV4);
    }

    /**
     * 删除项目
     * 删除项目
     *
     * @param DeleteProjectV4Request 请求对象
     * @return CompletableFuture<DeleteProjectV4Response>
     */
    public CompletableFuture<DeleteProjectV4Response> deleteProjectV4Async(DeleteProjectV4Request request) {
        return hcClient.asyncInvokeHttp(request, ProjectManMeta.deleteProjectV4);
    }

    /**
     * 获取租户没有加入的项目
     * 获取租户没有加入的项目
     *
     * @param ListDomainNotAddedProjectsV4Request 请求对象
     * @return CompletableFuture<ListDomainNotAddedProjectsV4Response>
     */
    public CompletableFuture<ListDomainNotAddedProjectsV4Response> listDomainNotAddedProjectsV4Async(ListDomainNotAddedProjectsV4Request request) {
        return hcClient.asyncInvokeHttp(request, ProjectManMeta.listDomainNotAddedProjectsV4);
    }

    /**
     * 获取bug统计信息
     * 获取bug统计信息，按模块统计
     *
     * @param ListProjectBugStaticsV4Request 请求对象
     * @return CompletableFuture<ListProjectBugStaticsV4Response>
     */
    public CompletableFuture<ListProjectBugStaticsV4Response> listProjectBugStaticsV4Async(ListProjectBugStaticsV4Request request) {
        return hcClient.asyncInvokeHttp(request, ProjectManMeta.listProjectBugStaticsV4);
    }

    /**
     * 获取需求统计信息
     * 获取需求统计信息
     *
     * @param ListProjectDemandStaticV4Request 请求对象
     * @return CompletableFuture<ListProjectDemandStaticV4Response>
     */
    public CompletableFuture<ListProjectDemandStaticV4Response> listProjectDemandStaticV4Async(ListProjectDemandStaticV4Request request) {
        return hcClient.asyncInvokeHttp(request, ProjectManMeta.listProjectDemandStaticV4);
    }

    /**
     * 获取指定项目的迭代列表
     * 获取项目迭代
     *
     * @param ListProjectIterationsV4Request 请求对象
     * @return CompletableFuture<ListProjectIterationsV4Response>
     */
    public CompletableFuture<ListProjectIterationsV4Response> listProjectIterationsV4Async(ListProjectIterationsV4Request request) {
        return hcClient.asyncInvokeHttp(request, ProjectManMeta.listProjectIterationsV4);
    }

    /**
     * 获取指定项目的成员用户列表
     * 获取项目成员列表
     *
     * @param ListProjectMembersV4Request 请求对象
     * @return CompletableFuture<ListProjectMembersV4Response>
     */
    public CompletableFuture<ListProjectMembersV4Response> listProjectMembersV4Async(ListProjectMembersV4Request request) {
        return hcClient.asyncInvokeHttp(request, ProjectManMeta.listProjectMembersV4);
    }

    /**
     * 查询项目列表
     * 查询项目列表
     *
     * @param ListProjectsV4Request 请求对象
     * @return CompletableFuture<ListProjectsV4Response>
     */
    public CompletableFuture<ListProjectsV4Response> listProjectsV4Async(ListProjectsV4Request request) {
        return hcClient.asyncInvokeHttp(request, ProjectManMeta.listProjectsV4);
    }

    /**
     * 主动退出项目
     * 项目成员主动退出项目，项目创建者不能退出
     *
     * @param RemoveProjectRequest 请求对象
     * @return CompletableFuture<RemoveProjectResponse>
     */
    public CompletableFuture<RemoveProjectResponse> removeProjectAsync(RemoveProjectRequest request) {
        return hcClient.asyncInvokeHttp(request, ProjectManMeta.removeProject);
    }

    /**
     * 获取当前用户信息
     * 获取当前用户信息
     *
     * @param ShowCurUserInfoRequest 请求对象
     * @return CompletableFuture<ShowCurUserInfoResponse>
     */
    public CompletableFuture<ShowCurUserInfoResponse> showCurUserInfoAsync(ShowCurUserInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, ProjectManMeta.showCurUserInfo);
    }

    /**
     * 获取当前用户角色
     * 获取用户在项目中的角色
     *
     * @param ShowCurUserRoleRequest 请求对象
     * @return CompletableFuture<ShowCurUserRoleResponse>
     */
    public CompletableFuture<ShowCurUserRoleResponse> showCurUserRoleAsync(ShowCurUserRoleRequest request) {
        return hcClient.asyncInvokeHttp(request, ProjectManMeta.showCurUserRole);
    }

    /**
     * 查看迭代详情
     * 查看迭代详情
     *
     * @param ShowIterationV4Request 请求对象
     * @return CompletableFuture<ShowIterationV4Response>
     */
    public CompletableFuture<ShowIterationV4Response> showIterationV4Async(ShowIterationV4Request request) {
        return hcClient.asyncInvokeHttp(request, ProjectManMeta.showIterationV4);
    }

    /**
     * 获取项目概览
     * 获取项目概览
     *
     * @param ShowProjectSummaryV4Request 请求对象
     * @return CompletableFuture<ShowProjectSummaryV4Response>
     */
    public CompletableFuture<ShowProjectSummaryV4Response> showProjectSummaryV4Async(ShowProjectSummaryV4Request request) {
        return hcClient.asyncInvokeHttp(request, ProjectManMeta.showProjectSummaryV4);
    }

    /**
     * 更新Scrum项目迭代
     * 更新Scrum项目迭代
     *
     * @param UpdateIterationV4Request 请求对象
     * @return CompletableFuture<UpdateIterationV4Response>
     */
    public CompletableFuture<UpdateIterationV4Response> updateIterationV4Async(UpdateIterationV4Request request) {
        return hcClient.asyncInvokeHttp(request, ProjectManMeta.updateIterationV4);
    }

    /**
     * 更新成员在项目中的角色
     * 更新成员在项目中的角色
     *
     * @param UpdateMembesRoleV4Request 请求对象
     * @return CompletableFuture<UpdateMembesRoleV4Response>
     */
    public CompletableFuture<UpdateMembesRoleV4Response> updateMembesRoleV4Async(UpdateMembesRoleV4Request request) {
        return hcClient.asyncInvokeHttp(request, ProjectManMeta.updateMembesRoleV4);
    }

    /**
     * 更新用户昵称
     * 更新用户昵称
     *
     * @param UpdateNickNameV4Request 请求对象
     * @return CompletableFuture<UpdateNickNameV4Response>
     */
    public CompletableFuture<UpdateNickNameV4Response> updateNickNameV4Async(UpdateNickNameV4Request request) {
        return hcClient.asyncInvokeHttp(request, ProjectManMeta.updateNickNameV4);
    }

    /**
     * 更新项目
     * 更新项目
     *
     * @param UpdateProjectV4Request 请求对象
     * @return CompletableFuture<UpdateProjectV4Response>
     */
    public CompletableFuture<UpdateProjectV4Response> updateProjectV4Async(UpdateProjectV4Request request) {
        return hcClient.asyncInvokeHttp(request, ProjectManMeta.updateProjectV4);
    }

    /**
     * 批量删除工作项
     * 批量删除工作项
     *
     * @param BatchDeleteIssuesV4Request 请求对象
     * @return CompletableFuture<BatchDeleteIssuesV4Response>
     */
    public CompletableFuture<BatchDeleteIssuesV4Response> batchDeleteIssuesV4Async(BatchDeleteIssuesV4Request request) {
        return hcClient.asyncInvokeHttp(request, ProjectManMeta.batchDeleteIssuesV4);
    }

    /**
     * 创建工作项
     * 创建工作项
     *
     * @param CreateIssueV4Request 请求对象
     * @return CompletableFuture<CreateIssueV4Response>
     */
    public CompletableFuture<CreateIssueV4Response> createIssueV4Async(CreateIssueV4Request request) {
        return hcClient.asyncInvokeHttp(request, ProjectManMeta.createIssueV4);
    }

    /**
     * 删除工作项
     * 删除工作项
     *
     * @param DeleteIssueV4Request 请求对象
     * @return CompletableFuture<DeleteIssueV4Response>
     */
    public CompletableFuture<DeleteIssueV4Response> deleteIssueV4Async(DeleteIssueV4Request request) {
        return hcClient.asyncInvokeHttp(request, ProjectManMeta.deleteIssueV4);
    }

    /**
     * 获取子工作项
     * 获取子工作项
     *
     * @param ListChildIssuesV4Request 请求对象
     * @return CompletableFuture<ListChildIssuesV4Response>
     */
    public CompletableFuture<ListChildIssuesV4Response> listChildIssuesV4Async(ListChildIssuesV4Request request) {
        return hcClient.asyncInvokeHttp(request, ProjectManMeta.listChildIssuesV4);
    }

    /**
     * 获取指定工作项的评论列表
     * 获取工作项的评论
     *
     * @param ListIssueCommentsV4Request 请求对象
     * @return CompletableFuture<ListIssueCommentsV4Response>
     */
    public CompletableFuture<ListIssueCommentsV4Response> listIssueCommentsV4Async(ListIssueCommentsV4Request request) {
        return hcClient.asyncInvokeHttp(request, ProjectManMeta.listIssueCommentsV4);
    }

    /**
     * 获取工作项历史记录
     * 获取项目成员列表
     *
     * @param ListIssueRecordsV4Request 请求对象
     * @return CompletableFuture<ListIssueRecordsV4Response>
     */
    public CompletableFuture<ListIssueRecordsV4Response> listIssueRecordsV4Async(ListIssueRecordsV4Request request) {
        return hcClient.asyncInvokeHttp(request, ProjectManMeta.listIssueRecordsV4);
    }

    /**
     * 高级查询工作项
     * 高级查询工作项,根据筛选条件查询工作中
     *
     * @param ListIssuesV4Request 请求对象
     * @return CompletableFuture<ListIssuesV4Response>
     */
    public CompletableFuture<ListIssuesV4Response> listIssuesV4Async(ListIssuesV4Request request) {
        return hcClient.asyncInvokeHttp(request, ProjectManMeta.listIssuesV4);
    }

    /**
     * 按用户查询工时（多项目）
     * 按用户查询工时（多项目）
     *
     * @param ListProjectWorkHoursRequest 请求对象
     * @return CompletableFuture<ListProjectWorkHoursResponse>
     */
    public CompletableFuture<ListProjectWorkHoursResponse> listProjectWorkHoursAsync(ListProjectWorkHoursRequest request) {
        return hcClient.asyncInvokeHttp(request, ProjectManMeta.listProjectWorkHours);
    }

    /**
     * 查询工作项详情
     * 查询工作项详情
     *
     * @param ShowIssueV4Request 请求对象
     * @return CompletableFuture<ShowIssueV4Response>
     */
    public CompletableFuture<ShowIssueV4Response> showIssueV4Async(ShowIssueV4Request request) {
        return hcClient.asyncInvokeHttp(request, ProjectManMeta.showIssueV4);
    }

    /**
     * 按用户查询工时（单项目）
     * 按用户查询工时（单项目）
     *
     * @param ShowProjectWorkHoursRequest 请求对象
     * @return CompletableFuture<ShowProjectWorkHoursResponse>
     */
    public CompletableFuture<ShowProjectWorkHoursResponse> showProjectWorkHoursAsync(ShowProjectWorkHoursRequest request) {
        return hcClient.asyncInvokeHttp(request, ProjectManMeta.showProjectWorkHours);
    }

    /**
     * 获取工作项完成率
     * 获取工作项的完成率
     *
     * @param ShowtIssueCompletionRateRequest 请求对象
     * @return CompletableFuture<ShowtIssueCompletionRateResponse>
     */
    public CompletableFuture<ShowtIssueCompletionRateResponse> showtIssueCompletionRateAsync(ShowtIssueCompletionRateRequest request) {
        return hcClient.asyncInvokeHttp(request, ProjectManMeta.showtIssueCompletionRate);
    }

    /**
     * 更新工作项
     * 更新工作项
     *
     * @param UpdateIssueV4Request 请求对象
     * @return CompletableFuture<UpdateIssueV4Response>
     */
    public CompletableFuture<UpdateIssueV4Response> updateIssueV4Async(UpdateIssueV4Request request) {
        return hcClient.asyncInvokeHttp(request, ProjectManMeta.updateIssueV4);
    }

}