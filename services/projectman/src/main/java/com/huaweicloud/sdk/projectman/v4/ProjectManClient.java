package com.huaweicloud.sdk.projectman.v4;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
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
     * 获取指定项目的迭代列表
     * 获取项目迭代
     *
     * @param ListProjectVersionsV4Request 请求对象
     * @return ListProjectVersionsV4Response
    */
    public ListProjectVersionsV4Response listProjectVersionsV4(ListProjectVersionsV4Request request) {
        return hcClient.syncInvokeHttp(request, ProjectManMeta.listProjectVersionsV4);
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
     * 更新成员在项目中的角色
     * 更新成员在项目中的角色
     *
     * @param UpdateMembesRoleV4Request 请求对象
     * @return UpdateMembesRoleV4Response
    */
    public UpdateMembesRoleV4Response updateMembesRoleV4(UpdateMembesRoleV4Request request) {
        return hcClient.syncInvokeHttp(request, ProjectManMeta.updateMembesRoleV4);
    }

}