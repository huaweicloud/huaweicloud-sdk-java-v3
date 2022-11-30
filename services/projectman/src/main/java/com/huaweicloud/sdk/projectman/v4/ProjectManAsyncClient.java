package com.huaweicloud.sdk.projectman.v4;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.projectman.v4.model.*;

import java.util.concurrent.CompletableFuture;

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
     *
     * AGC调用 当前用户申请加入项目, 申请的用户id写在header中
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AddApplyJoinProjectForAgcRequest 请求对象
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
     * @param AddApplyJoinProjectForAgcRequest 请求对象
     * @return AsyncInvoker<AddApplyJoinProjectForAgcRequest, AddApplyJoinProjectForAgcResponse>
     */
    public AsyncInvoker<AddApplyJoinProjectForAgcRequest, AddApplyJoinProjectForAgcResponse> addApplyJoinProjectForAgcAsyncInvoker(
        AddApplyJoinProjectForAgcRequest request) {
        return new AsyncInvoker<AddApplyJoinProjectForAgcRequest, AddApplyJoinProjectForAgcResponse>(request,
            ProjectManMeta.addApplyJoinProjectForAgc, hcClient);
    }

    /**
     * 添加项目成员
     *
     * 添加项目成员,可以添加跨租户成员
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AddMemberV4Request 请求对象
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
     * @param AddMemberV4Request 请求对象
     * @return AsyncInvoker<AddMemberV4Request, AddMemberV4Response>
     */
    public AsyncInvoker<AddMemberV4Request, AddMemberV4Response> addMemberV4AsyncInvoker(AddMemberV4Request request) {
        return new AsyncInvoker<AddMemberV4Request, AddMemberV4Response>(request, ProjectManMeta.addMemberV4, hcClient);
    }

    /**
     * 批量添加项目成员
     *
     * 批量添加项目成员，只能添加和项目创建者同一租户下的成员，不正确的用户id会略过，添加的用户超过权限的，默认角色设置为7
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchAddMembersV4Request 请求对象
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
     * @param BatchAddMembersV4Request 请求对象
     * @return AsyncInvoker<BatchAddMembersV4Request, BatchAddMembersV4Response>
     */
    public AsyncInvoker<BatchAddMembersV4Request, BatchAddMembersV4Response> batchAddMembersV4AsyncInvoker(
        BatchAddMembersV4Request request) {
        return new AsyncInvoker<BatchAddMembersV4Request, BatchAddMembersV4Response>(request,
            ProjectManMeta.batchAddMembersV4, hcClient);
    }

    /**
     * 批量删除项目成员
     *
     * 批量删除项目成员
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchDeleteMembersV4Request 请求对象
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
     * @param BatchDeleteMembersV4Request 请求对象
     * @return AsyncInvoker<BatchDeleteMembersV4Request, BatchDeleteMembersV4Response>
     */
    public AsyncInvoker<BatchDeleteMembersV4Request, BatchDeleteMembersV4Response> batchDeleteMembersV4AsyncInvoker(
        BatchDeleteMembersV4Request request) {
        return new AsyncInvoker<BatchDeleteMembersV4Request, BatchDeleteMembersV4Response>(request,
            ProjectManMeta.batchDeleteMembersV4, hcClient);
    }

    /**
     * 更新子用户昵称
     *
     * 拥有te_admin角色的用户可以更新其他用户的昵称
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchUpdateChildNickNamesRequest 请求对象
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
     * @param BatchUpdateChildNickNamesRequest 请求对象
     * @return AsyncInvoker<BatchUpdateChildNickNamesRequest, BatchUpdateChildNickNamesResponse>
     */
    public AsyncInvoker<BatchUpdateChildNickNamesRequest, BatchUpdateChildNickNamesResponse> batchUpdateChildNickNamesAsyncInvoker(
        BatchUpdateChildNickNamesRequest request) {
        return new AsyncInvoker<BatchUpdateChildNickNamesRequest, BatchUpdateChildNickNamesResponse>(request,
            ProjectManMeta.batchUpdateChildNickNames, hcClient);
    }

    /**
     * 检查项目名称是否存在
     *
     * 检查项目名称是否存在
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CheckProjectNameV4Request 请求对象
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
     * @param CheckProjectNameV4Request 请求对象
     * @return AsyncInvoker<CheckProjectNameV4Request, CheckProjectNameV4Response>
     */
    public AsyncInvoker<CheckProjectNameV4Request, CheckProjectNameV4Response> checkProjectNameV4AsyncInvoker(
        CheckProjectNameV4Request request) {
        return new AsyncInvoker<CheckProjectNameV4Request, CheckProjectNameV4Response>(request,
            ProjectManMeta.checkProjectNameV4, hcClient);
    }

    /**
     * 创建项目
     *
     * 创建项目
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateProjectV4Request 请求对象
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
     * @param CreateProjectV4Request 请求对象
     * @return AsyncInvoker<CreateProjectV4Request, CreateProjectV4Response>
     */
    public AsyncInvoker<CreateProjectV4Request, CreateProjectV4Response> createProjectV4AsyncInvoker(
        CreateProjectV4Request request) {
        return new AsyncInvoker<CreateProjectV4Request, CreateProjectV4Response>(request,
            ProjectManMeta.createProjectV4, hcClient);
    }

    /**
     * 删除项目
     *
     * 删除项目
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteProjectV4Request 请求对象
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
     * @param DeleteProjectV4Request 请求对象
     * @return AsyncInvoker<DeleteProjectV4Request, DeleteProjectV4Response>
     */
    public AsyncInvoker<DeleteProjectV4Request, DeleteProjectV4Response> deleteProjectV4AsyncInvoker(
        DeleteProjectV4Request request) {
        return new AsyncInvoker<DeleteProjectV4Request, DeleteProjectV4Response>(request,
            ProjectManMeta.deleteProjectV4, hcClient);
    }

    /**
     * 获取租户没有加入的项目
     *
     * 获取租户没有加入的项目
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDomainNotAddedProjectsV4Request 请求对象
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
     * @param ListDomainNotAddedProjectsV4Request 请求对象
     * @return AsyncInvoker<ListDomainNotAddedProjectsV4Request, ListDomainNotAddedProjectsV4Response>
     */
    public AsyncInvoker<ListDomainNotAddedProjectsV4Request, ListDomainNotAddedProjectsV4Response> listDomainNotAddedProjectsV4AsyncInvoker(
        ListDomainNotAddedProjectsV4Request request) {
        return new AsyncInvoker<ListDomainNotAddedProjectsV4Request, ListDomainNotAddedProjectsV4Response>(request,
            ProjectManMeta.listDomainNotAddedProjectsV4, hcClient);
    }

    /**
     * 获取bug统计信息
     *
     * 获取bug统计信息，按模块统计
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListProjectBugStaticsV4Request 请求对象
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
     * @param ListProjectBugStaticsV4Request 请求对象
     * @return AsyncInvoker<ListProjectBugStaticsV4Request, ListProjectBugStaticsV4Response>
     */
    public AsyncInvoker<ListProjectBugStaticsV4Request, ListProjectBugStaticsV4Response> listProjectBugStaticsV4AsyncInvoker(
        ListProjectBugStaticsV4Request request) {
        return new AsyncInvoker<ListProjectBugStaticsV4Request, ListProjectBugStaticsV4Response>(request,
            ProjectManMeta.listProjectBugStaticsV4, hcClient);
    }

    /**
     * 获取需求统计信息
     *
     * 获取需求统计信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListProjectDemandStaticV4Request 请求对象
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
     * @param ListProjectDemandStaticV4Request 请求对象
     * @return AsyncInvoker<ListProjectDemandStaticV4Request, ListProjectDemandStaticV4Response>
     */
    public AsyncInvoker<ListProjectDemandStaticV4Request, ListProjectDemandStaticV4Response> listProjectDemandStaticV4AsyncInvoker(
        ListProjectDemandStaticV4Request request) {
        return new AsyncInvoker<ListProjectDemandStaticV4Request, ListProjectDemandStaticV4Response>(request,
            ProjectManMeta.listProjectDemandStaticV4, hcClient);
    }

    /**
     * 获取指定项目的成员用户列表
     *
     * 获取项目成员列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListProjectMembersV4Request 请求对象
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
     * @param ListProjectMembersV4Request 请求对象
     * @return AsyncInvoker<ListProjectMembersV4Request, ListProjectMembersV4Response>
     */
    public AsyncInvoker<ListProjectMembersV4Request, ListProjectMembersV4Response> listProjectMembersV4AsyncInvoker(
        ListProjectMembersV4Request request) {
        return new AsyncInvoker<ListProjectMembersV4Request, ListProjectMembersV4Response>(request,
            ProjectManMeta.listProjectMembersV4, hcClient);
    }

    /**
     * 查询项目列表
     *
     * 查询项目列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListProjectsV4Request 请求对象
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
     * @param ListProjectsV4Request 请求对象
     * @return AsyncInvoker<ListProjectsV4Request, ListProjectsV4Response>
     */
    public AsyncInvoker<ListProjectsV4Request, ListProjectsV4Response> listProjectsV4AsyncInvoker(
        ListProjectsV4Request request) {
        return new AsyncInvoker<ListProjectsV4Request, ListProjectsV4Response>(request, ProjectManMeta.listProjectsV4,
            hcClient);
    }

    /**
     * 查询看板项目下工作项的状态历史记录
     *
     * 分页查询看板项目下工作项的状态历史记录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListWorkitemStatusRecordsV4Request 请求对象
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
     * @param ListWorkitemStatusRecordsV4Request 请求对象
     * @return AsyncInvoker<ListWorkitemStatusRecordsV4Request, ListWorkitemStatusRecordsV4Response>
     */
    public AsyncInvoker<ListWorkitemStatusRecordsV4Request, ListWorkitemStatusRecordsV4Response> listWorkitemStatusRecordsV4AsyncInvoker(
        ListWorkitemStatusRecordsV4Request request) {
        return new AsyncInvoker<ListWorkitemStatusRecordsV4Request, ListWorkitemStatusRecordsV4Response>(request,
            ProjectManMeta.listWorkitemStatusRecordsV4, hcClient);
    }

    /**
     * 查询看板项目下的工作项
     *
     * 查询看板项目下的工作项
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListWorkitemsRequest 请求对象
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
     * @param ListWorkitemsRequest 请求对象
     * @return AsyncInvoker<ListWorkitemsRequest, ListWorkitemsResponse>
     */
    public AsyncInvoker<ListWorkitemsRequest, ListWorkitemsResponse> listWorkitemsAsyncInvoker(
        ListWorkitemsRequest request) {
        return new AsyncInvoker<ListWorkitemsRequest, ListWorkitemsResponse>(request, ProjectManMeta.listWorkitems,
            hcClient);
    }

    /**
     * 主动退出项目
     *
     * 项目成员主动退出项目，项目创建者不能退出
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RemoveProjectRequest 请求对象
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
     * @param RemoveProjectRequest 请求对象
     * @return AsyncInvoker<RemoveProjectRequest, RemoveProjectResponse>
     */
    public AsyncInvoker<RemoveProjectRequest, RemoveProjectResponse> removeProjectAsyncInvoker(
        RemoveProjectRequest request) {
        return new AsyncInvoker<RemoveProjectRequest, RemoveProjectResponse>(request, ProjectManMeta.removeProject,
            hcClient);
    }

    /**
     * 查询缺陷密度
     *
     * 查询缺陷密度
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowBugDensityV2Request 请求对象
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
     * @param ShowBugDensityV2Request 请求对象
     * @return AsyncInvoker<ShowBugDensityV2Request, ShowBugDensityV2Response>
     */
    public AsyncInvoker<ShowBugDensityV2Request, ShowBugDensityV2Response> showBugDensityV2AsyncInvoker(
        ShowBugDensityV2Request request) {
        return new AsyncInvoker<ShowBugDensityV2Request, ShowBugDensityV2Response>(request,
            ProjectManMeta.showBugDensityV2, hcClient);
    }

    /**
     * 查询人均bug
     *
     * 查询人均bug
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowBugsPerDeveloperRequest 请求对象
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
     * @param ShowBugsPerDeveloperRequest 请求对象
     * @return AsyncInvoker<ShowBugsPerDeveloperRequest, ShowBugsPerDeveloperResponse>
     */
    public AsyncInvoker<ShowBugsPerDeveloperRequest, ShowBugsPerDeveloperResponse> showBugsPerDeveloperAsyncInvoker(
        ShowBugsPerDeveloperRequest request) {
        return new AsyncInvoker<ShowBugsPerDeveloperRequest, ShowBugsPerDeveloperResponse>(request,
            ProjectManMeta.showBugsPerDeveloper, hcClient);
    }

    /**
     * 查询需求按时完成率
     *
     * 查询需求按时完成率
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowCompletionRateRequest 请求对象
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
     * @param ShowCompletionRateRequest 请求对象
     * @return AsyncInvoker<ShowCompletionRateRequest, ShowCompletionRateResponse>
     */
    public AsyncInvoker<ShowCompletionRateRequest, ShowCompletionRateResponse> showCompletionRateAsyncInvoker(
        ShowCompletionRateRequest request) {
        return new AsyncInvoker<ShowCompletionRateRequest, ShowCompletionRateResponse>(request,
            ProjectManMeta.showCompletionRate, hcClient);
    }

    /**
     * 获取当前用户信息
     *
     * 获取当前用户信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowCurUserInfoRequest 请求对象
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
     * @param ShowCurUserInfoRequest 请求对象
     * @return AsyncInvoker<ShowCurUserInfoRequest, ShowCurUserInfoResponse>
     */
    public AsyncInvoker<ShowCurUserInfoRequest, ShowCurUserInfoResponse> showCurUserInfoAsyncInvoker(
        ShowCurUserInfoRequest request) {
        return new AsyncInvoker<ShowCurUserInfoRequest, ShowCurUserInfoResponse>(request,
            ProjectManMeta.showCurUserInfo, hcClient);
    }

    /**
     * 获取当前用户角色
     *
     * 获取用户在项目中的角色
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowCurUserRoleRequest 请求对象
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
     * @param ShowCurUserRoleRequest 请求对象
     * @return AsyncInvoker<ShowCurUserRoleRequest, ShowCurUserRoleResponse>
     */
    public AsyncInvoker<ShowCurUserRoleRequest, ShowCurUserRoleResponse> showCurUserRoleAsyncInvoker(
        ShowCurUserRoleRequest request) {
        return new AsyncInvoker<ShowCurUserRoleRequest, ShowCurUserRoleResponse>(request,
            ProjectManMeta.showCurUserRole, hcClient);
    }

    /**
     * 获取项目详情
     *
     * 获取项目详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowProjectInfoV4Request 请求对象
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
     * @param ShowProjectInfoV4Request 请求对象
     * @return AsyncInvoker<ShowProjectInfoV4Request, ShowProjectInfoV4Response>
     */
    public AsyncInvoker<ShowProjectInfoV4Request, ShowProjectInfoV4Response> showProjectInfoV4AsyncInvoker(
        ShowProjectInfoV4Request request) {
        return new AsyncInvoker<ShowProjectInfoV4Request, ShowProjectInfoV4Response>(request,
            ProjectManMeta.showProjectInfoV4, hcClient);
    }

    /**
     * 获取项目概览
     *
     * 获取项目概览
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowProjectSummaryV4Request 请求对象
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
     * @param ShowProjectSummaryV4Request 请求对象
     * @return AsyncInvoker<ShowProjectSummaryV4Request, ShowProjectSummaryV4Response>
     */
    public AsyncInvoker<ShowProjectSummaryV4Request, ShowProjectSummaryV4Response> showProjectSummaryV4AsyncInvoker(
        ShowProjectSummaryV4Request request) {
        return new AsyncInvoker<ShowProjectSummaryV4Request, ShowProjectSummaryV4Response>(request,
            ProjectManMeta.showProjectSummaryV4, hcClient);
    }

    /**
     * 查询看板项目的工作项流转配置
     *
     * 查询看板项目的工作项流转配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowWorkItemWrokflowConfigRequest 请求对象
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
     * @param ShowWorkItemWrokflowConfigRequest 请求对象
     * @return AsyncInvoker<ShowWorkItemWrokflowConfigRequest, ShowWorkItemWrokflowConfigResponse>
     */
    public AsyncInvoker<ShowWorkItemWrokflowConfigRequest, ShowWorkItemWrokflowConfigResponse> showWorkItemWrokflowConfigAsyncInvoker(
        ShowWorkItemWrokflowConfigRequest request) {
        return new AsyncInvoker<ShowWorkItemWrokflowConfigRequest, ShowWorkItemWrokflowConfigResponse>(request,
            ProjectManMeta.showWorkItemWrokflowConfig, hcClient);
    }

    /**
     * 更新成员在项目中的角色
     *
     * 更新成员在项目中的角色
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateMembesRoleV4Request 请求对象
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
     * @param UpdateMembesRoleV4Request 请求对象
     * @return AsyncInvoker<UpdateMembesRoleV4Request, UpdateMembesRoleV4Response>
     */
    public AsyncInvoker<UpdateMembesRoleV4Request, UpdateMembesRoleV4Response> updateMembesRoleV4AsyncInvoker(
        UpdateMembesRoleV4Request request) {
        return new AsyncInvoker<UpdateMembesRoleV4Request, UpdateMembesRoleV4Response>(request,
            ProjectManMeta.updateMembesRoleV4, hcClient);
    }

    /**
     * 更新用户昵称
     *
     * 更新用户昵称
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateNickNameV4Request 请求对象
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
     * @param UpdateNickNameV4Request 请求对象
     * @return AsyncInvoker<UpdateNickNameV4Request, UpdateNickNameV4Response>
     */
    public AsyncInvoker<UpdateNickNameV4Request, UpdateNickNameV4Response> updateNickNameV4AsyncInvoker(
        UpdateNickNameV4Request request) {
        return new AsyncInvoker<UpdateNickNameV4Request, UpdateNickNameV4Response>(request,
            ProjectManMeta.updateNickNameV4, hcClient);
    }

    /**
     * 更新项目
     *
     * 更新项目
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateProjectV4Request 请求对象
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
     * @param UpdateProjectV4Request 请求对象
     * @return AsyncInvoker<UpdateProjectV4Request, UpdateProjectV4Response>
     */
    public AsyncInvoker<UpdateProjectV4Request, UpdateProjectV4Response> updateProjectV4AsyncInvoker(
        UpdateProjectV4Request request) {
        return new AsyncInvoker<UpdateProjectV4Request, UpdateProjectV4Response>(request,
            ProjectManMeta.updateProjectV4, hcClient);
    }

    /**
     * 批量删除工作项
     *
     * 批量删除工作项
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchDeleteIssuesV4Request 请求对象
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
     * @param BatchDeleteIssuesV4Request 请求对象
     * @return AsyncInvoker<BatchDeleteIssuesV4Request, BatchDeleteIssuesV4Response>
     */
    public AsyncInvoker<BatchDeleteIssuesV4Request, BatchDeleteIssuesV4Response> batchDeleteIssuesV4AsyncInvoker(
        BatchDeleteIssuesV4Request request) {
        return new AsyncInvoker<BatchDeleteIssuesV4Request, BatchDeleteIssuesV4Response>(request,
            ProjectManMeta.batchDeleteIssuesV4, hcClient);
    }

    /**
     * 批量删除项目的迭代
     *
     * 批量删除项目的迭代
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchDeleteIterationsV4Request 请求对象
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
     * @param BatchDeleteIterationsV4Request 请求对象
     * @return AsyncInvoker<BatchDeleteIterationsV4Request, BatchDeleteIterationsV4Response>
     */
    public AsyncInvoker<BatchDeleteIterationsV4Request, BatchDeleteIterationsV4Response> batchDeleteIterationsV4AsyncInvoker(
        BatchDeleteIterationsV4Request request) {
        return new AsyncInvoker<BatchDeleteIterationsV4Request, BatchDeleteIterationsV4Response>(request,
            ProjectManMeta.batchDeleteIterationsV4, hcClient);
    }

    /**
     * 取消领域与项目的关联关系
     *
     * 取消领域与项目的关联关系
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CancelProjectDomainRequest 请求对象
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
     * @param CancelProjectDomainRequest 请求对象
     * @return AsyncInvoker<CancelProjectDomainRequest, CancelProjectDomainResponse>
     */
    public AsyncInvoker<CancelProjectDomainRequest, CancelProjectDomainResponse> cancelProjectDomainAsyncInvoker(
        CancelProjectDomainRequest request) {
        return new AsyncInvoker<CancelProjectDomainRequest, CancelProjectDomainResponse>(request,
            ProjectManMeta.cancelProjectDomain, hcClient);
    }

    /**
     * 创建工作项类型自定义字段
     *
     * 创建工作项类型自定义字段
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateCustomfieldsRequest 请求对象
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
     * @param CreateCustomfieldsRequest 请求对象
     * @return AsyncInvoker<CreateCustomfieldsRequest, CreateCustomfieldsResponse>
     */
    public AsyncInvoker<CreateCustomfieldsRequest, CreateCustomfieldsResponse> createCustomfieldsAsyncInvoker(
        CreateCustomfieldsRequest request) {
        return new AsyncInvoker<CreateCustomfieldsRequest, CreateCustomfieldsResponse>(request,
            ProjectManMeta.createCustomfields, hcClient);
    }

    /**
     * 创建工作项
     *
     * 创建工作项
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateIssueV4Request 请求对象
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
     * @param CreateIssueV4Request 请求对象
     * @return AsyncInvoker<CreateIssueV4Request, CreateIssueV4Response>
     */
    public AsyncInvoker<CreateIssueV4Request, CreateIssueV4Response> createIssueV4AsyncInvoker(
        CreateIssueV4Request request) {
        return new AsyncInvoker<CreateIssueV4Request, CreateIssueV4Response>(request, ProjectManMeta.createIssueV4,
            hcClient);
    }

    /**
     * 创建Scrum项目迭代
     *
     * 创建Scrum项目迭代
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateIterationV4Request 请求对象
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
     * @param CreateIterationV4Request 请求对象
     * @return AsyncInvoker<CreateIterationV4Request, CreateIterationV4Response>
     */
    public AsyncInvoker<CreateIterationV4Request, CreateIterationV4Response> createIterationV4AsyncInvoker(
        CreateIterationV4Request request) {
        return new AsyncInvoker<CreateIterationV4Request, CreateIterationV4Response>(request,
            ProjectManMeta.createIterationV4, hcClient);
    }

    /**
     * 创建项目的领域
     *
     * 查询项目的领域列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateProjectDomainRequest 请求对象
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
     * @param CreateProjectDomainRequest 请求对象
     * @return AsyncInvoker<CreateProjectDomainRequest, CreateProjectDomainResponse>
     */
    public AsyncInvoker<CreateProjectDomainRequest, CreateProjectDomainResponse> createProjectDomainAsyncInvoker(
        CreateProjectDomainRequest request) {
        return new AsyncInvoker<CreateProjectDomainRequest, CreateProjectDomainResponse>(request,
            ProjectManMeta.createProjectDomain, hcClient);
    }

    /**
     * 创建项目的模块
     *
     * 查询项目的模块列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateProjectModuleRequest 请求对象
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
     * @param CreateProjectModuleRequest 请求对象
     * @return AsyncInvoker<CreateProjectModuleRequest, CreateProjectModuleResponse>
     */
    public AsyncInvoker<CreateProjectModuleRequest, CreateProjectModuleResponse> createProjectModuleAsyncInvoker(
        CreateProjectModuleRequest request) {
        return new AsyncInvoker<CreateProjectModuleRequest, CreateProjectModuleResponse>(request,
            ProjectManMeta.createProjectModule, hcClient);
    }

    /**
     * 细粒度权限用户创建工作项
     *
     * 拥有IAM细粒度权限（projectmanConfig:systemSettingField:set）且在devcloud项目中有创建工作项的权限的用户可以设置工作项的创建者
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateSystemIssueV4Request 请求对象
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
     * @param CreateSystemIssueV4Request 请求对象
     * @return AsyncInvoker<CreateSystemIssueV4Request, CreateSystemIssueV4Response>
     */
    public AsyncInvoker<CreateSystemIssueV4Request, CreateSystemIssueV4Response> createSystemIssueV4AsyncInvoker(
        CreateSystemIssueV4Request request) {
        return new AsyncInvoker<CreateSystemIssueV4Request, CreateSystemIssueV4Response>(request,
            ProjectManMeta.createSystemIssueV4, hcClient);
    }

    /**
     * 删除工作项
     *
     * 删除工作项
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteIssueV4Request 请求对象
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
     * @param DeleteIssueV4Request 请求对象
     * @return AsyncInvoker<DeleteIssueV4Request, DeleteIssueV4Response>
     */
    public AsyncInvoker<DeleteIssueV4Request, DeleteIssueV4Response> deleteIssueV4AsyncInvoker(
        DeleteIssueV4Request request) {
        return new AsyncInvoker<DeleteIssueV4Request, DeleteIssueV4Response>(request, ProjectManMeta.deleteIssueV4,
            hcClient);
    }

    /**
     * 删除项目迭代
     *
     * 删除项目迭代
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteIterationV4Request 请求对象
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
     * @param DeleteIterationV4Request 请求对象
     * @return AsyncInvoker<DeleteIterationV4Request, DeleteIterationV4Response>
     */
    public AsyncInvoker<DeleteIterationV4Request, DeleteIterationV4Response> deleteIterationV4AsyncInvoker(
        DeleteIterationV4Request request) {
        return new AsyncInvoker<DeleteIterationV4Request, DeleteIterationV4Response>(request,
            ProjectManMeta.deleteIterationV4, hcClient);
    }

    /**
     * 删除项目的模块
     *
     * 删除项目的模块
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteProjectModuleRequest 请求对象
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
     * @param DeleteProjectModuleRequest 请求对象
     * @return AsyncInvoker<DeleteProjectModuleRequest, DeleteProjectModuleResponse>
     */
    public AsyncInvoker<DeleteProjectModuleRequest, DeleteProjectModuleResponse> deleteProjectModuleAsyncInvoker(
        DeleteProjectModuleRequest request) {
        return new AsyncInvoker<DeleteProjectModuleRequest, DeleteProjectModuleResponse>(request,
            ProjectManMeta.deleteProjectModule, hcClient);
    }

    /**
     * 下载图片
     *
     * 下载图片
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DownloadImageFileRequest 请求对象
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
     * @param DownloadImageFileRequest 请求对象
     * @return AsyncInvoker<DownloadImageFileRequest, DownloadImageFileResponse>
     */
    public AsyncInvoker<DownloadImageFileRequest, DownloadImageFileResponse> downloadImageFileAsyncInvoker(
        DownloadImageFileRequest request) {
        return new AsyncInvoker<DownloadImageFileRequest, DownloadImageFileResponse>(request,
            ProjectManMeta.downloadImageFile, hcClient);
    }

    /**
     * 查询当前工作项已经关联的工作项
     *
     * 查询当前工作项已经关联的工作项
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAssociatedIssuesRequest 请求对象
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
     * @param ListAssociatedIssuesRequest 请求对象
     * @return AsyncInvoker<ListAssociatedIssuesRequest, ListAssociatedIssuesResponse>
     */
    public AsyncInvoker<ListAssociatedIssuesRequest, ListAssociatedIssuesResponse> listAssociatedIssuesAsyncInvoker(
        ListAssociatedIssuesRequest request) {
        return new AsyncInvoker<ListAssociatedIssuesRequest, ListAssociatedIssuesResponse>(request,
            ProjectManMeta.listAssociatedIssues, hcClient);
    }

    /**
     * 查询关联用例
     *
     * 查询关联用例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAssociatedTestCasesRequest 请求对象
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
     * @param ListAssociatedTestCasesRequest 请求对象
     * @return AsyncInvoker<ListAssociatedTestCasesRequest, ListAssociatedTestCasesResponse>
     */
    public AsyncInvoker<ListAssociatedTestCasesRequest, ListAssociatedTestCasesResponse> listAssociatedTestCasesAsyncInvoker(
        ListAssociatedTestCasesRequest request) {
        return new AsyncInvoker<ListAssociatedTestCasesRequest, ListAssociatedTestCasesResponse>(request,
            ProjectManMeta.listAssociatedTestCases, hcClient);
    }

    /**
     * 查询当前工作项已经关联的关联Wiki
     *
     * 查询当前工作项已经关联的关联Wiki
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAssociatedWikisRequest 请求对象
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
     * @param ListAssociatedWikisRequest 请求对象
     * @return AsyncInvoker<ListAssociatedWikisRequest, ListAssociatedWikisResponse>
     */
    public AsyncInvoker<ListAssociatedWikisRequest, ListAssociatedWikisResponse> listAssociatedWikisAsyncInvoker(
        ListAssociatedWikisRequest request) {
        return new AsyncInvoker<ListAssociatedWikisRequest, ListAssociatedWikisResponse>(request,
            ProjectManMeta.listAssociatedWikis, hcClient);
    }

    /**
     * 获取子工作项
     *
     * 获取子工作项
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListChildIssuesV4Request 请求对象
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
     * @param ListChildIssuesV4Request 请求对象
     * @return AsyncInvoker<ListChildIssuesV4Request, ListChildIssuesV4Response>
     */
    public AsyncInvoker<ListChildIssuesV4Request, ListChildIssuesV4Response> listChildIssuesV4AsyncInvoker(
        ListChildIssuesV4Request request) {
        return new AsyncInvoker<ListChildIssuesV4Request, ListChildIssuesV4Response>(request,
            ProjectManMeta.listChildIssuesV4, hcClient);
    }

    /**
     * 查询当前工作项已经关联的代码提交记录 / 分支创建记录
     *
     * 查询当前工作项已经关联的代码提交记录 / 分支创建记录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListIssueAssociatedCommitsRequest 请求对象
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
     * @param ListIssueAssociatedCommitsRequest 请求对象
     * @return AsyncInvoker<ListIssueAssociatedCommitsRequest, ListIssueAssociatedCommitsResponse>
     */
    public AsyncInvoker<ListIssueAssociatedCommitsRequest, ListIssueAssociatedCommitsResponse> listIssueAssociatedCommitsAsyncInvoker(
        ListIssueAssociatedCommitsRequest request) {
        return new AsyncInvoker<ListIssueAssociatedCommitsRequest, ListIssueAssociatedCommitsResponse>(request,
            ProjectManMeta.listIssueAssociatedCommits, hcClient);
    }

    /**
     * 获取指定工作项的评论列表
     *
     * 获取工作项的评论
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListIssueCommentsV4Request 请求对象
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
     * @param ListIssueCommentsV4Request 请求对象
     * @return AsyncInvoker<ListIssueCommentsV4Request, ListIssueCommentsV4Response>
     */
    public AsyncInvoker<ListIssueCommentsV4Request, ListIssueCommentsV4Response> listIssueCommentsV4AsyncInvoker(
        ListIssueCommentsV4Request request) {
        return new AsyncInvoker<ListIssueCommentsV4Request, ListIssueCommentsV4Response>(request,
            ProjectManMeta.listIssueCommentsV4, hcClient);
    }

    /**
     * 查询Scrum工作项自定义字段
     *
     * 查询Scrum工作项自定义字段的可选列表,符合custom_fields或者names条件的都返回,2个值都不传，返回所有的自定义字段列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListIssueCustomFieldsRequest 请求对象
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
     * @param ListIssueCustomFieldsRequest 请求对象
     * @return AsyncInvoker<ListIssueCustomFieldsRequest, ListIssueCustomFieldsResponse>
     */
    public AsyncInvoker<ListIssueCustomFieldsRequest, ListIssueCustomFieldsResponse> listIssueCustomFieldsAsyncInvoker(
        ListIssueCustomFieldsRequest request) {
        return new AsyncInvoker<ListIssueCustomFieldsRequest, ListIssueCustomFieldsResponse>(request,
            ProjectManMeta.listIssueCustomFields, hcClient);
    }

    /**
     * 获取工作项历史记录
     *
     * 获取工作项历史记录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListIssueRecordsV4Request 请求对象
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
     * @param ListIssueRecordsV4Request 请求对象
     * @return AsyncInvoker<ListIssueRecordsV4Request, ListIssueRecordsV4Response>
     */
    public AsyncInvoker<ListIssueRecordsV4Request, ListIssueRecordsV4Response> listIssueRecordsV4AsyncInvoker(
        ListIssueRecordsV4Request request) {
        return new AsyncInvoker<ListIssueRecordsV4Request, ListIssueRecordsV4Response>(request,
            ProjectManMeta.listIssueRecordsV4, hcClient);
    }

    /**
     * 查询项目的工作项
     *
     * 工作项类型id, 分页参数，创建时间查询项目的工作项
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListIssuesSfV4Request 请求对象
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
     * @param ListIssuesSfV4Request 请求对象
     * @return AsyncInvoker<ListIssuesSfV4Request, ListIssuesSfV4Response>
     */
    public AsyncInvoker<ListIssuesSfV4Request, ListIssuesSfV4Response> listIssuesSfV4AsyncInvoker(
        ListIssuesSfV4Request request) {
        return new AsyncInvoker<ListIssuesSfV4Request, ListIssuesSfV4Response>(request, ProjectManMeta.listIssuesSfV4,
            hcClient);
    }

    /**
     * 高级查询工作项
     *
     * 根据筛选条件查询工作项
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListIssuesV4Request 请求对象
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
     * @param ListIssuesV4Request 请求对象
     * @return AsyncInvoker<ListIssuesV4Request, ListIssuesV4Response>
     */
    public AsyncInvoker<ListIssuesV4Request, ListIssuesV4Response> listIssuesV4AsyncInvoker(
        ListIssuesV4Request request) {
        return new AsyncInvoker<ListIssuesV4Request, ListIssuesV4Response>(request, ProjectManMeta.listIssuesV4,
            hcClient);
    }

    /**
     * 查看迭代历史记录
     *
     * 查看迭代历史记录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListIterationHistoriesRequest 请求对象
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
     * @param ListIterationHistoriesRequest 请求对象
     * @return AsyncInvoker<ListIterationHistoriesRequest, ListIterationHistoriesResponse>
     */
    public AsyncInvoker<ListIterationHistoriesRequest, ListIterationHistoriesResponse> listIterationHistoriesAsyncInvoker(
        ListIterationHistoriesRequest request) {
        return new AsyncInvoker<ListIterationHistoriesRequest, ListIterationHistoriesResponse>(request,
            ProjectManMeta.listIterationHistories, hcClient);
    }

    /**
     * 查询项目的领域列表
     *
     * 查询项目的领域列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListProjectDomainsRequest 请求对象
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
     * @param ListProjectDomainsRequest 请求对象
     * @return AsyncInvoker<ListProjectDomainsRequest, ListProjectDomainsResponse>
     */
    public AsyncInvoker<ListProjectDomainsRequest, ListProjectDomainsResponse> listProjectDomainsAsyncInvoker(
        ListProjectDomainsRequest request) {
        return new AsyncInvoker<ListProjectDomainsRequest, ListProjectDomainsResponse>(request,
            ProjectManMeta.listProjectDomains, hcClient);
    }

    /**
     * 查询项目下所有工作项的历史记录
     *
     * 查询项目下所有工作项的历史记录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListProjectIssuesRecordsV4Request 请求对象
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
     * @param ListProjectIssuesRecordsV4Request 请求对象
     * @return AsyncInvoker<ListProjectIssuesRecordsV4Request, ListProjectIssuesRecordsV4Response>
     */
    public AsyncInvoker<ListProjectIssuesRecordsV4Request, ListProjectIssuesRecordsV4Response> listProjectIssuesRecordsV4AsyncInvoker(
        ListProjectIssuesRecordsV4Request request) {
        return new AsyncInvoker<ListProjectIssuesRecordsV4Request, ListProjectIssuesRecordsV4Response>(request,
            ProjectManMeta.listProjectIssuesRecordsV4, hcClient);
    }

    /**
     * 获取指定项目的迭代列表
     *
     * 获取项目迭代
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListProjectIterationsV4Request 请求对象
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
     * @param ListProjectIterationsV4Request 请求对象
     * @return AsyncInvoker<ListProjectIterationsV4Request, ListProjectIterationsV4Response>
     */
    public AsyncInvoker<ListProjectIterationsV4Request, ListProjectIterationsV4Response> listProjectIterationsV4AsyncInvoker(
        ListProjectIterationsV4Request request) {
        return new AsyncInvoker<ListProjectIterationsV4Request, ListProjectIterationsV4Response>(request,
            ProjectManMeta.listProjectIterationsV4, hcClient);
    }

    /**
     * 查询项目的模块列表
     *
     * 查询项目的模块列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListProjectModulesRequest 请求对象
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
     * @param ListProjectModulesRequest 请求对象
     * @return AsyncInvoker<ListProjectModulesRequest, ListProjectModulesResponse>
     */
    public AsyncInvoker<ListProjectModulesRequest, ListProjectModulesResponse> listProjectModulesAsyncInvoker(
        ListProjectModulesRequest request) {
        return new AsyncInvoker<ListProjectModulesRequest, ListProjectModulesResponse>(request,
            ProjectManMeta.listProjectModules, hcClient);
    }

    /**
     * 按用户查询工时（多项目）
     *
     * 按用户查询工时（多项目）
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListProjectWorkHoursRequest 请求对象
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
     * @param ListProjectWorkHoursRequest 请求对象
     * @return AsyncInvoker<ListProjectWorkHoursRequest, ListProjectWorkHoursResponse>
     */
    public AsyncInvoker<ListProjectWorkHoursRequest, ListProjectWorkHoursResponse> listProjectWorkHoursAsyncInvoker(
        ListProjectWorkHoursRequest request) {
        return new AsyncInvoker<ListProjectWorkHoursRequest, ListProjectWorkHoursResponse>(request,
            ProjectManMeta.listProjectWorkHours, hcClient);
    }

    /**
     * 查询项目的状态列表
     *
     * 查询项目的状态列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListScrumProjectStatusesRequest 请求对象
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
     * @param ListScrumProjectStatusesRequest 请求对象
     * @return AsyncInvoker<ListScrumProjectStatusesRequest, ListScrumProjectStatusesResponse>
     */
    public AsyncInvoker<ListScrumProjectStatusesRequest, ListScrumProjectStatusesResponse> listScrumProjectStatusesAsyncInvoker(
        ListScrumProjectStatusesRequest request) {
        return new AsyncInvoker<ListScrumProjectStatusesRequest, ListScrumProjectStatusesResponse>(request,
            ProjectManMeta.listScrumProjectStatuses, hcClient);
    }

    /**
     * 获取工作项完成率
     *
     * 获取工作项的完成率
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowIssueCompletionRateRequest 请求对象
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
     * @param ShowIssueCompletionRateRequest 请求对象
     * @return AsyncInvoker<ShowIssueCompletionRateRequest, ShowIssueCompletionRateResponse>
     */
    public AsyncInvoker<ShowIssueCompletionRateRequest, ShowIssueCompletionRateResponse> showIssueCompletionRateAsyncInvoker(
        ShowIssueCompletionRateRequest request) {
        return new AsyncInvoker<ShowIssueCompletionRateRequest, ShowIssueCompletionRateResponse>(request,
            ProjectManMeta.showIssueCompletionRate, hcClient);
    }

    /**
     * 查询工作项详情
     *
     * 查询工作项详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowIssueV4Request 请求对象
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
     * @param ShowIssueV4Request 请求对象
     * @return AsyncInvoker<ShowIssueV4Request, ShowIssueV4Response>
     */
    public AsyncInvoker<ShowIssueV4Request, ShowIssueV4Response> showIssueV4AsyncInvoker(ShowIssueV4Request request) {
        return new AsyncInvoker<ShowIssueV4Request, ShowIssueV4Response>(request, ProjectManMeta.showIssueV4, hcClient);
    }

    /**
     * 查询Scrum项目的工作项流转配置
     *
     * 查询Scrum项目的工作项流转配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowIssuesWrokFlowConfigRequest 请求对象
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
     * @param ShowIssuesWrokFlowConfigRequest 请求对象
     * @return AsyncInvoker<ShowIssuesWrokFlowConfigRequest, ShowIssuesWrokFlowConfigResponse>
     */
    public AsyncInvoker<ShowIssuesWrokFlowConfigRequest, ShowIssuesWrokFlowConfigResponse> showIssuesWrokFlowConfigAsyncInvoker(
        ShowIssuesWrokFlowConfigRequest request) {
        return new AsyncInvoker<ShowIssuesWrokFlowConfigRequest, ShowIssuesWrokFlowConfigResponse>(request,
            ProjectManMeta.showIssuesWrokFlowConfig, hcClient);
    }

    /**
     * 查看迭代详情
     *
     * 查看迭代详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowIterationV4Request 请求对象
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
     * @param ShowIterationV4Request 请求对象
     * @return AsyncInvoker<ShowIterationV4Request, ShowIterationV4Response>
     */
    public AsyncInvoker<ShowIterationV4Request, ShowIterationV4Response> showIterationV4AsyncInvoker(
        ShowIterationV4Request request) {
        return new AsyncInvoker<ShowIterationV4Request, ShowIterationV4Response>(request,
            ProjectManMeta.showIterationV4, hcClient);
    }

    /**
     * 按用户查询工时（单项目）
     *
     * 按用户查询工时（单项目）
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowProjectWorkHoursRequest 请求对象
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
     * @param ShowProjectWorkHoursRequest 请求对象
     * @return AsyncInvoker<ShowProjectWorkHoursRequest, ShowProjectWorkHoursResponse>
     */
    public AsyncInvoker<ShowProjectWorkHoursRequest, ShowProjectWorkHoursResponse> showProjectWorkHoursAsyncInvoker(
        ShowProjectWorkHoursRequest request) {
        return new AsyncInvoker<ShowProjectWorkHoursRequest, ShowProjectWorkHoursResponse>(request,
            ProjectManMeta.showProjectWorkHours, hcClient);
    }

    /**
     * 更新工作项
     *
     * 更新工作项
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateIssueV4Request 请求对象
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
     * @param UpdateIssueV4Request 请求对象
     * @return AsyncInvoker<UpdateIssueV4Request, UpdateIssueV4Response>
     */
    public AsyncInvoker<UpdateIssueV4Request, UpdateIssueV4Response> updateIssueV4AsyncInvoker(
        UpdateIssueV4Request request) {
        return new AsyncInvoker<UpdateIssueV4Request, UpdateIssueV4Response>(request, ProjectManMeta.updateIssueV4,
            hcClient);
    }

    /**
     * 更新Scrum项目迭代
     *
     * 更新Scrum项目迭代
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateIterationV4Request 请求对象
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
     * @param UpdateIterationV4Request 请求对象
     * @return AsyncInvoker<UpdateIterationV4Request, UpdateIterationV4Response>
     */
    public AsyncInvoker<UpdateIterationV4Request, UpdateIterationV4Response> updateIterationV4AsyncInvoker(
        UpdateIterationV4Request request) {
        return new AsyncInvoker<UpdateIterationV4Request, UpdateIterationV4Response>(request,
            ProjectManMeta.updateIterationV4, hcClient);
    }

    /**
     * 更新项目的领域
     *
     * 更新项目的领域
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateProjectDomainRequest 请求对象
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
     * @param UpdateProjectDomainRequest 请求对象
     * @return AsyncInvoker<UpdateProjectDomainRequest, UpdateProjectDomainResponse>
     */
    public AsyncInvoker<UpdateProjectDomainRequest, UpdateProjectDomainResponse> updateProjectDomainAsyncInvoker(
        UpdateProjectDomainRequest request) {
        return new AsyncInvoker<UpdateProjectDomainRequest, UpdateProjectDomainResponse>(request,
            ProjectManMeta.updateProjectDomain, hcClient);
    }

    /**
     * 更新项目的模块
     *
     * 更新项目的模块
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateProjectModuleRequest 请求对象
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
     * @param UpdateProjectModuleRequest 请求对象
     * @return AsyncInvoker<UpdateProjectModuleRequest, UpdateProjectModuleResponse>
     */
    public AsyncInvoker<UpdateProjectModuleRequest, UpdateProjectModuleResponse> updateProjectModuleAsyncInvoker(
        UpdateProjectModuleRequest request) {
        return new AsyncInvoker<UpdateProjectModuleRequest, UpdateProjectModuleResponse>(request,
            ProjectManMeta.updateProjectModule, hcClient);
    }

    /**
     * 上传工作项附件
     *
     * 上传工作项附件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UploadAttachmentsRequest 请求对象
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
     * @param UploadAttachmentsRequest 请求对象
     * @return AsyncInvoker<UploadAttachmentsRequest, UploadAttachmentsResponse>
     */
    public AsyncInvoker<UploadAttachmentsRequest, UploadAttachmentsResponse> uploadAttachmentsAsyncInvoker(
        UploadAttachmentsRequest request) {
        return new AsyncInvoker<UploadAttachmentsRequest, UploadAttachmentsResponse>(request,
            ProjectManMeta.uploadAttachments, hcClient);
    }

    /**
     * 上传图片
     *
     * 上传图片
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UploadIssueImgRequest 请求对象
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
     * @param UploadIssueImgRequest 请求对象
     * @return AsyncInvoker<UploadIssueImgRequest, UploadIssueImgResponse>
     */
    public AsyncInvoker<UploadIssueImgRequest, UploadIssueImgResponse> uploadIssueImgAsyncInvoker(
        UploadIssueImgRequest request) {
        return new AsyncInvoker<UploadIssueImgRequest, UploadIssueImgResponse>(request, ProjectManMeta.uploadIssueImg,
            hcClient);
    }

}
