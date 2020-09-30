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
     * 获取指定项目的迭代列表
     * 获取项目迭代
     *
     * @param ListProjectVersionsV4Request 请求对象
     * @return CompletableFuture<ListProjectVersionsV4Response>
     */
    public CompletableFuture<ListProjectVersionsV4Response> listProjectVersionsV4Async(ListProjectVersionsV4Request request) {
        return hcClient.asyncInvokeHttp(request, ProjectManMeta.listProjectVersionsV4);
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
     * 更新成员在项目中的角色
     * 更新成员在项目中的角色
     *
     * @param UpdateMembesRoleV4Request 请求对象
     * @return CompletableFuture<UpdateMembesRoleV4Response>
     */
    public CompletableFuture<UpdateMembesRoleV4Response> updateMembesRoleV4Async(UpdateMembesRoleV4Request request) {
        return hcClient.asyncInvokeHttp(request, ProjectManMeta.updateMembesRoleV4);
    }

}