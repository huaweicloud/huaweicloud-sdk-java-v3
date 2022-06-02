package com.huaweicloud.sdk.projectman.v4;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
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
     *
     * AGC调用 当前用户申请加入项目, 申请的用户id写在header中
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param AddApplyJoinProjectForAgcRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param AddApplyJoinProjectForAgcRequest 请求对象
     * @return SyncInvoker<AddApplyJoinProjectForAgcRequest, AddApplyJoinProjectForAgcResponse>
     */
    public SyncInvoker<AddApplyJoinProjectForAgcRequest, AddApplyJoinProjectForAgcResponse> addApplyJoinProjectForAgcInvoker(
        AddApplyJoinProjectForAgcRequest request) {
        return new SyncInvoker<AddApplyJoinProjectForAgcRequest, AddApplyJoinProjectForAgcResponse>(request,
            ProjectManMeta.addApplyJoinProjectForAgc, hcClient);
    }

    /**
     * 添加项目成员
     *
     * 添加项目成员,可以添加跨租户成员
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param AddMemberV4Request 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param AddMemberV4Request 请求对象
     * @return SyncInvoker<AddMemberV4Request, AddMemberV4Response>
     */
    public SyncInvoker<AddMemberV4Request, AddMemberV4Response> addMemberV4Invoker(AddMemberV4Request request) {
        return new SyncInvoker<AddMemberV4Request, AddMemberV4Response>(request, ProjectManMeta.addMemberV4, hcClient);
    }

    /**
     * 批量添加项目成员
     *
     * 批量添加项目成员，只能添加和项目创建者同一租户下的成员，不正确的用户id会略过，添加的用户超过权限的，默认角色设置为7
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param BatchAddMembersV4Request 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param BatchAddMembersV4Request 请求对象
     * @return SyncInvoker<BatchAddMembersV4Request, BatchAddMembersV4Response>
     */
    public SyncInvoker<BatchAddMembersV4Request, BatchAddMembersV4Response> batchAddMembersV4Invoker(
        BatchAddMembersV4Request request) {
        return new SyncInvoker<BatchAddMembersV4Request, BatchAddMembersV4Response>(request,
            ProjectManMeta.batchAddMembersV4, hcClient);
    }

    /**
     * 批量删除项目成员
     *
     * 批量删除项目成员
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param BatchDeleteMembersV4Request 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param BatchDeleteMembersV4Request 请求对象
     * @return SyncInvoker<BatchDeleteMembersV4Request, BatchDeleteMembersV4Response>
     */
    public SyncInvoker<BatchDeleteMembersV4Request, BatchDeleteMembersV4Response> batchDeleteMembersV4Invoker(
        BatchDeleteMembersV4Request request) {
        return new SyncInvoker<BatchDeleteMembersV4Request, BatchDeleteMembersV4Response>(request,
            ProjectManMeta.batchDeleteMembersV4, hcClient);
    }

    /**
     * 更新子用户昵称
     *
     * 拥有te_admin角色的用户可以更新其他用户的昵称
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param BatchUpdateChildNickNamesRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param BatchUpdateChildNickNamesRequest 请求对象
     * @return SyncInvoker<BatchUpdateChildNickNamesRequest, BatchUpdateChildNickNamesResponse>
     */
    public SyncInvoker<BatchUpdateChildNickNamesRequest, BatchUpdateChildNickNamesResponse> batchUpdateChildNickNamesInvoker(
        BatchUpdateChildNickNamesRequest request) {
        return new SyncInvoker<BatchUpdateChildNickNamesRequest, BatchUpdateChildNickNamesResponse>(request,
            ProjectManMeta.batchUpdateChildNickNames, hcClient);
    }

    /**
     * 检查项目名称是否存在
     *
     * 检查项目名称是否存在
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CheckProjectNameV4Request 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CheckProjectNameV4Request 请求对象
     * @return SyncInvoker<CheckProjectNameV4Request, CheckProjectNameV4Response>
     */
    public SyncInvoker<CheckProjectNameV4Request, CheckProjectNameV4Response> checkProjectNameV4Invoker(
        CheckProjectNameV4Request request) {
        return new SyncInvoker<CheckProjectNameV4Request, CheckProjectNameV4Response>(request,
            ProjectManMeta.checkProjectNameV4, hcClient);
    }

    /**
     * 创建项目
     *
     * 创建项目
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateProjectV4Request 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateProjectV4Request 请求对象
     * @return SyncInvoker<CreateProjectV4Request, CreateProjectV4Response>
     */
    public SyncInvoker<CreateProjectV4Request, CreateProjectV4Response> createProjectV4Invoker(
        CreateProjectV4Request request) {
        return new SyncInvoker<CreateProjectV4Request, CreateProjectV4Response>(request, ProjectManMeta.createProjectV4,
            hcClient);
    }

    /**
     * 删除项目
     *
     * 删除项目
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteProjectV4Request 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteProjectV4Request 请求对象
     * @return SyncInvoker<DeleteProjectV4Request, DeleteProjectV4Response>
     */
    public SyncInvoker<DeleteProjectV4Request, DeleteProjectV4Response> deleteProjectV4Invoker(
        DeleteProjectV4Request request) {
        return new SyncInvoker<DeleteProjectV4Request, DeleteProjectV4Response>(request, ProjectManMeta.deleteProjectV4,
            hcClient);
    }

    /**
     * 获取租户没有加入的项目
     *
     * 获取租户没有加入的项目
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListDomainNotAddedProjectsV4Request 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListDomainNotAddedProjectsV4Request 请求对象
     * @return SyncInvoker<ListDomainNotAddedProjectsV4Request, ListDomainNotAddedProjectsV4Response>
     */
    public SyncInvoker<ListDomainNotAddedProjectsV4Request, ListDomainNotAddedProjectsV4Response> listDomainNotAddedProjectsV4Invoker(
        ListDomainNotAddedProjectsV4Request request) {
        return new SyncInvoker<ListDomainNotAddedProjectsV4Request, ListDomainNotAddedProjectsV4Response>(request,
            ProjectManMeta.listDomainNotAddedProjectsV4, hcClient);
    }

    /**
     * 获取bug统计信息
     *
     * 获取bug统计信息，按模块统计
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListProjectBugStaticsV4Request 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListProjectBugStaticsV4Request 请求对象
     * @return SyncInvoker<ListProjectBugStaticsV4Request, ListProjectBugStaticsV4Response>
     */
    public SyncInvoker<ListProjectBugStaticsV4Request, ListProjectBugStaticsV4Response> listProjectBugStaticsV4Invoker(
        ListProjectBugStaticsV4Request request) {
        return new SyncInvoker<ListProjectBugStaticsV4Request, ListProjectBugStaticsV4Response>(request,
            ProjectManMeta.listProjectBugStaticsV4, hcClient);
    }

    /**
     * 获取需求统计信息
     *
     * 获取需求统计信息
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListProjectDemandStaticV4Request 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListProjectDemandStaticV4Request 请求对象
     * @return SyncInvoker<ListProjectDemandStaticV4Request, ListProjectDemandStaticV4Response>
     */
    public SyncInvoker<ListProjectDemandStaticV4Request, ListProjectDemandStaticV4Response> listProjectDemandStaticV4Invoker(
        ListProjectDemandStaticV4Request request) {
        return new SyncInvoker<ListProjectDemandStaticV4Request, ListProjectDemandStaticV4Response>(request,
            ProjectManMeta.listProjectDemandStaticV4, hcClient);
    }

    /**
     * 获取指定项目的成员用户列表
     *
     * 获取项目成员列表
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListProjectMembersV4Request 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListProjectMembersV4Request 请求对象
     * @return SyncInvoker<ListProjectMembersV4Request, ListProjectMembersV4Response>
     */
    public SyncInvoker<ListProjectMembersV4Request, ListProjectMembersV4Response> listProjectMembersV4Invoker(
        ListProjectMembersV4Request request) {
        return new SyncInvoker<ListProjectMembersV4Request, ListProjectMembersV4Response>(request,
            ProjectManMeta.listProjectMembersV4, hcClient);
    }

    /**
     * 查询项目列表
     *
     * 查询项目列表
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListProjectsV4Request 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListProjectsV4Request 请求对象
     * @return SyncInvoker<ListProjectsV4Request, ListProjectsV4Response>
     */
    public SyncInvoker<ListProjectsV4Request, ListProjectsV4Response> listProjectsV4Invoker(
        ListProjectsV4Request request) {
        return new SyncInvoker<ListProjectsV4Request, ListProjectsV4Response>(request, ProjectManMeta.listProjectsV4,
            hcClient);
    }

    /**
     * 查询看板项目下工作项的状态历史记录
     *
     * 分页查询看板项目下工作项的状态历史记录
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListWorkitemStatusRecordsV4Request 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListWorkitemStatusRecordsV4Request 请求对象
     * @return SyncInvoker<ListWorkitemStatusRecordsV4Request, ListWorkitemStatusRecordsV4Response>
     */
    public SyncInvoker<ListWorkitemStatusRecordsV4Request, ListWorkitemStatusRecordsV4Response> listWorkitemStatusRecordsV4Invoker(
        ListWorkitemStatusRecordsV4Request request) {
        return new SyncInvoker<ListWorkitemStatusRecordsV4Request, ListWorkitemStatusRecordsV4Response>(request,
            ProjectManMeta.listWorkitemStatusRecordsV4, hcClient);
    }

    /**
     * 查询看板项目下的工作项
     *
     * 查询看板项目下的工作项
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListWorkitemsRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListWorkitemsRequest 请求对象
     * @return SyncInvoker<ListWorkitemsRequest, ListWorkitemsResponse>
     */
    public SyncInvoker<ListWorkitemsRequest, ListWorkitemsResponse> listWorkitemsInvoker(ListWorkitemsRequest request) {
        return new SyncInvoker<ListWorkitemsRequest, ListWorkitemsResponse>(request, ProjectManMeta.listWorkitems,
            hcClient);
    }

    /**
     * 主动退出项目
     *
     * 项目成员主动退出项目，项目创建者不能退出
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RemoveProjectRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RemoveProjectRequest 请求对象
     * @return SyncInvoker<RemoveProjectRequest, RemoveProjectResponse>
     */
    public SyncInvoker<RemoveProjectRequest, RemoveProjectResponse> removeProjectInvoker(RemoveProjectRequest request) {
        return new SyncInvoker<RemoveProjectRequest, RemoveProjectResponse>(request, ProjectManMeta.removeProject,
            hcClient);
    }

    /**
     * 查询缺陷密度
     *
     * 查询缺陷密度
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowBugDensityV2Request 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowBugDensityV2Request 请求对象
     * @return SyncInvoker<ShowBugDensityV2Request, ShowBugDensityV2Response>
     */
    public SyncInvoker<ShowBugDensityV2Request, ShowBugDensityV2Response> showBugDensityV2Invoker(
        ShowBugDensityV2Request request) {
        return new SyncInvoker<ShowBugDensityV2Request, ShowBugDensityV2Response>(request,
            ProjectManMeta.showBugDensityV2, hcClient);
    }

    /**
     * 查询人均bug
     *
     * 查询人均bug
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowBugsPerDeveloperRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowBugsPerDeveloperRequest 请求对象
     * @return SyncInvoker<ShowBugsPerDeveloperRequest, ShowBugsPerDeveloperResponse>
     */
    public SyncInvoker<ShowBugsPerDeveloperRequest, ShowBugsPerDeveloperResponse> showBugsPerDeveloperInvoker(
        ShowBugsPerDeveloperRequest request) {
        return new SyncInvoker<ShowBugsPerDeveloperRequest, ShowBugsPerDeveloperResponse>(request,
            ProjectManMeta.showBugsPerDeveloper, hcClient);
    }

    /**
     * 查询需求按时完成率
     *
     * 查询需求按时完成率
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowCompletionRateRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowCompletionRateRequest 请求对象
     * @return SyncInvoker<ShowCompletionRateRequest, ShowCompletionRateResponse>
     */
    public SyncInvoker<ShowCompletionRateRequest, ShowCompletionRateResponse> showCompletionRateInvoker(
        ShowCompletionRateRequest request) {
        return new SyncInvoker<ShowCompletionRateRequest, ShowCompletionRateResponse>(request,
            ProjectManMeta.showCompletionRate, hcClient);
    }

    /**
     * 获取当前用户信息
     *
     * 获取当前用户信息
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowCurUserInfoRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowCurUserInfoRequest 请求对象
     * @return SyncInvoker<ShowCurUserInfoRequest, ShowCurUserInfoResponse>
     */
    public SyncInvoker<ShowCurUserInfoRequest, ShowCurUserInfoResponse> showCurUserInfoInvoker(
        ShowCurUserInfoRequest request) {
        return new SyncInvoker<ShowCurUserInfoRequest, ShowCurUserInfoResponse>(request, ProjectManMeta.showCurUserInfo,
            hcClient);
    }

    /**
     * 获取当前用户角色
     *
     * 获取用户在项目中的角色
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowCurUserRoleRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowCurUserRoleRequest 请求对象
     * @return SyncInvoker<ShowCurUserRoleRequest, ShowCurUserRoleResponse>
     */
    public SyncInvoker<ShowCurUserRoleRequest, ShowCurUserRoleResponse> showCurUserRoleInvoker(
        ShowCurUserRoleRequest request) {
        return new SyncInvoker<ShowCurUserRoleRequest, ShowCurUserRoleResponse>(request, ProjectManMeta.showCurUserRole,
            hcClient);
    }

    /**
     * 获取项目详情
     *
     * 获取项目详情
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowProjectInfoV4Request 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowProjectInfoV4Request 请求对象
     * @return SyncInvoker<ShowProjectInfoV4Request, ShowProjectInfoV4Response>
     */
    public SyncInvoker<ShowProjectInfoV4Request, ShowProjectInfoV4Response> showProjectInfoV4Invoker(
        ShowProjectInfoV4Request request) {
        return new SyncInvoker<ShowProjectInfoV4Request, ShowProjectInfoV4Response>(request,
            ProjectManMeta.showProjectInfoV4, hcClient);
    }

    /**
     * 获取项目概览
     *
     * 获取项目概览
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowProjectSummaryV4Request 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowProjectSummaryV4Request 请求对象
     * @return SyncInvoker<ShowProjectSummaryV4Request, ShowProjectSummaryV4Response>
     */
    public SyncInvoker<ShowProjectSummaryV4Request, ShowProjectSummaryV4Response> showProjectSummaryV4Invoker(
        ShowProjectSummaryV4Request request) {
        return new SyncInvoker<ShowProjectSummaryV4Request, ShowProjectSummaryV4Response>(request,
            ProjectManMeta.showProjectSummaryV4, hcClient);
    }

    /**
     * 查询看板项目的工作项流转配置
     *
     * 查询看板项目的工作项流转配置
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowWorkItemWrokflowConfigRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowWorkItemWrokflowConfigRequest 请求对象
     * @return SyncInvoker<ShowWorkItemWrokflowConfigRequest, ShowWorkItemWrokflowConfigResponse>
     */
    public SyncInvoker<ShowWorkItemWrokflowConfigRequest, ShowWorkItemWrokflowConfigResponse> showWorkItemWrokflowConfigInvoker(
        ShowWorkItemWrokflowConfigRequest request) {
        return new SyncInvoker<ShowWorkItemWrokflowConfigRequest, ShowWorkItemWrokflowConfigResponse>(request,
            ProjectManMeta.showWorkItemWrokflowConfig, hcClient);
    }

    /**
     * 更新成员在项目中的角色
     *
     * 更新成员在项目中的角色
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateMembesRoleV4Request 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateMembesRoleV4Request 请求对象
     * @return SyncInvoker<UpdateMembesRoleV4Request, UpdateMembesRoleV4Response>
     */
    public SyncInvoker<UpdateMembesRoleV4Request, UpdateMembesRoleV4Response> updateMembesRoleV4Invoker(
        UpdateMembesRoleV4Request request) {
        return new SyncInvoker<UpdateMembesRoleV4Request, UpdateMembesRoleV4Response>(request,
            ProjectManMeta.updateMembesRoleV4, hcClient);
    }

    /**
     * 更新用户昵称
     *
     * 更新用户昵称
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateNickNameV4Request 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateNickNameV4Request 请求对象
     * @return SyncInvoker<UpdateNickNameV4Request, UpdateNickNameV4Response>
     */
    public SyncInvoker<UpdateNickNameV4Request, UpdateNickNameV4Response> updateNickNameV4Invoker(
        UpdateNickNameV4Request request) {
        return new SyncInvoker<UpdateNickNameV4Request, UpdateNickNameV4Response>(request,
            ProjectManMeta.updateNickNameV4, hcClient);
    }

    /**
     * 更新项目
     *
     * 更新项目
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateProjectV4Request 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateProjectV4Request 请求对象
     * @return SyncInvoker<UpdateProjectV4Request, UpdateProjectV4Response>
     */
    public SyncInvoker<UpdateProjectV4Request, UpdateProjectV4Response> updateProjectV4Invoker(
        UpdateProjectV4Request request) {
        return new SyncInvoker<UpdateProjectV4Request, UpdateProjectV4Response>(request, ProjectManMeta.updateProjectV4,
            hcClient);
    }

    /**
     * 批量删除工作项
     *
     * 批量删除工作项
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param BatchDeleteIssuesV4Request 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param BatchDeleteIssuesV4Request 请求对象
     * @return SyncInvoker<BatchDeleteIssuesV4Request, BatchDeleteIssuesV4Response>
     */
    public SyncInvoker<BatchDeleteIssuesV4Request, BatchDeleteIssuesV4Response> batchDeleteIssuesV4Invoker(
        BatchDeleteIssuesV4Request request) {
        return new SyncInvoker<BatchDeleteIssuesV4Request, BatchDeleteIssuesV4Response>(request,
            ProjectManMeta.batchDeleteIssuesV4, hcClient);
    }

    /**
     * 批量删除项目的迭代
     *
     * 批量删除项目的迭代
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param BatchDeleteIterationsV4Request 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param BatchDeleteIterationsV4Request 请求对象
     * @return SyncInvoker<BatchDeleteIterationsV4Request, BatchDeleteIterationsV4Response>
     */
    public SyncInvoker<BatchDeleteIterationsV4Request, BatchDeleteIterationsV4Response> batchDeleteIterationsV4Invoker(
        BatchDeleteIterationsV4Request request) {
        return new SyncInvoker<BatchDeleteIterationsV4Request, BatchDeleteIterationsV4Response>(request,
            ProjectManMeta.batchDeleteIterationsV4, hcClient);
    }

    /**
     * 创建工作项类型自定义字段
     *
     * 创建工作项类型自定义字段
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateCustomfieldsRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateCustomfieldsRequest 请求对象
     * @return SyncInvoker<CreateCustomfieldsRequest, CreateCustomfieldsResponse>
     */
    public SyncInvoker<CreateCustomfieldsRequest, CreateCustomfieldsResponse> createCustomfieldsInvoker(
        CreateCustomfieldsRequest request) {
        return new SyncInvoker<CreateCustomfieldsRequest, CreateCustomfieldsResponse>(request,
            ProjectManMeta.createCustomfields, hcClient);
    }

    /**
     * 创建工作项
     *
     * 创建工作项
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateIssueV4Request 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateIssueV4Request 请求对象
     * @return SyncInvoker<CreateIssueV4Request, CreateIssueV4Response>
     */
    public SyncInvoker<CreateIssueV4Request, CreateIssueV4Response> createIssueV4Invoker(CreateIssueV4Request request) {
        return new SyncInvoker<CreateIssueV4Request, CreateIssueV4Response>(request, ProjectManMeta.createIssueV4,
            hcClient);
    }

    /**
     * 创建Scrum项目迭代
     *
     * 创建Scrum项目迭代
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateIterationV4Request 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateIterationV4Request 请求对象
     * @return SyncInvoker<CreateIterationV4Request, CreateIterationV4Response>
     */
    public SyncInvoker<CreateIterationV4Request, CreateIterationV4Response> createIterationV4Invoker(
        CreateIterationV4Request request) {
        return new SyncInvoker<CreateIterationV4Request, CreateIterationV4Response>(request,
            ProjectManMeta.createIterationV4, hcClient);
    }

    /**
     * 细粒度权限用户创建工作项
     *
     * 拥有IAM细粒度权限（projectmanConfig:systemSettingField:set）且在devcloud项目中有创建工作项的权限的用户可以设置工作项的创建者
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateSystemIssueV4Request 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateSystemIssueV4Request 请求对象
     * @return SyncInvoker<CreateSystemIssueV4Request, CreateSystemIssueV4Response>
     */
    public SyncInvoker<CreateSystemIssueV4Request, CreateSystemIssueV4Response> createSystemIssueV4Invoker(
        CreateSystemIssueV4Request request) {
        return new SyncInvoker<CreateSystemIssueV4Request, CreateSystemIssueV4Response>(request,
            ProjectManMeta.createSystemIssueV4, hcClient);
    }

    /**
     * 删除工作项
     *
     * 删除工作项
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteIssueV4Request 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteIssueV4Request 请求对象
     * @return SyncInvoker<DeleteIssueV4Request, DeleteIssueV4Response>
     */
    public SyncInvoker<DeleteIssueV4Request, DeleteIssueV4Response> deleteIssueV4Invoker(DeleteIssueV4Request request) {
        return new SyncInvoker<DeleteIssueV4Request, DeleteIssueV4Response>(request, ProjectManMeta.deleteIssueV4,
            hcClient);
    }

    /**
     * 删除项目迭代
     *
     * 删除项目迭代
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteIterationV4Request 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteIterationV4Request 请求对象
     * @return SyncInvoker<DeleteIterationV4Request, DeleteIterationV4Response>
     */
    public SyncInvoker<DeleteIterationV4Request, DeleteIterationV4Response> deleteIterationV4Invoker(
        DeleteIterationV4Request request) {
        return new SyncInvoker<DeleteIterationV4Request, DeleteIterationV4Response>(request,
            ProjectManMeta.deleteIterationV4, hcClient);
    }

    /**
     * 查询当前工作项已经关联的工作项
     *
     * 查询当前工作项已经关联的工作项
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListAssociatedIssuesRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListAssociatedIssuesRequest 请求对象
     * @return SyncInvoker<ListAssociatedIssuesRequest, ListAssociatedIssuesResponse>
     */
    public SyncInvoker<ListAssociatedIssuesRequest, ListAssociatedIssuesResponse> listAssociatedIssuesInvoker(
        ListAssociatedIssuesRequest request) {
        return new SyncInvoker<ListAssociatedIssuesRequest, ListAssociatedIssuesResponse>(request,
            ProjectManMeta.listAssociatedIssues, hcClient);
    }

    /**
     * 查询关联Wiki
     *
     * 查询关联Wiki
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListAssociatedTestCasesRequest 请求对象
     * @return ListAssociatedTestCasesResponse
     */
    public ListAssociatedTestCasesResponse listAssociatedTestCases(ListAssociatedTestCasesRequest request) {
        return hcClient.syncInvokeHttp(request, ProjectManMeta.listAssociatedTestCases);
    }

    /**
     * 查询关联Wiki
     *
     * 查询关联Wiki
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListAssociatedTestCasesRequest 请求对象
     * @return SyncInvoker<ListAssociatedTestCasesRequest, ListAssociatedTestCasesResponse>
     */
    public SyncInvoker<ListAssociatedTestCasesRequest, ListAssociatedTestCasesResponse> listAssociatedTestCasesInvoker(
        ListAssociatedTestCasesRequest request) {
        return new SyncInvoker<ListAssociatedTestCasesRequest, ListAssociatedTestCasesResponse>(request,
            ProjectManMeta.listAssociatedTestCases, hcClient);
    }

    /**
     * 查询当前工作项已经关联的关联Wiki
     *
     * 查询当前工作项已经关联的关联Wiki
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListAssociatedWikisRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListAssociatedWikisRequest 请求对象
     * @return SyncInvoker<ListAssociatedWikisRequest, ListAssociatedWikisResponse>
     */
    public SyncInvoker<ListAssociatedWikisRequest, ListAssociatedWikisResponse> listAssociatedWikisInvoker(
        ListAssociatedWikisRequest request) {
        return new SyncInvoker<ListAssociatedWikisRequest, ListAssociatedWikisResponse>(request,
            ProjectManMeta.listAssociatedWikis, hcClient);
    }

    /**
     * 获取子工作项
     *
     * 获取子工作项
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListChildIssuesV4Request 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListChildIssuesV4Request 请求对象
     * @return SyncInvoker<ListChildIssuesV4Request, ListChildIssuesV4Response>
     */
    public SyncInvoker<ListChildIssuesV4Request, ListChildIssuesV4Response> listChildIssuesV4Invoker(
        ListChildIssuesV4Request request) {
        return new SyncInvoker<ListChildIssuesV4Request, ListChildIssuesV4Response>(request,
            ProjectManMeta.listChildIssuesV4, hcClient);
    }

    /**
     * 查询当前工作项已经关联的代码提交记录 / 分支创建记录
     *
     * 查询当前工作项已经关联的代码提交记录 / 分支创建记录
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListIssueAssociatedCommitsRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListIssueAssociatedCommitsRequest 请求对象
     * @return SyncInvoker<ListIssueAssociatedCommitsRequest, ListIssueAssociatedCommitsResponse>
     */
    public SyncInvoker<ListIssueAssociatedCommitsRequest, ListIssueAssociatedCommitsResponse> listIssueAssociatedCommitsInvoker(
        ListIssueAssociatedCommitsRequest request) {
        return new SyncInvoker<ListIssueAssociatedCommitsRequest, ListIssueAssociatedCommitsResponse>(request,
            ProjectManMeta.listIssueAssociatedCommits, hcClient);
    }

    /**
     * 获取指定工作项的评论列表
     *
     * 获取工作项的评论
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListIssueCommentsV4Request 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListIssueCommentsV4Request 请求对象
     * @return SyncInvoker<ListIssueCommentsV4Request, ListIssueCommentsV4Response>
     */
    public SyncInvoker<ListIssueCommentsV4Request, ListIssueCommentsV4Response> listIssueCommentsV4Invoker(
        ListIssueCommentsV4Request request) {
        return new SyncInvoker<ListIssueCommentsV4Request, ListIssueCommentsV4Response>(request,
            ProjectManMeta.listIssueCommentsV4, hcClient);
    }

    /**
     * 查询Scrum工作项自定义字段
     *
     * 查询Scrum工作项自定义字段的可选列表,符合custom_fields或者names条件的都返回,2个值都不传，返回所有的自定义字段列表
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListIssueCustomFieldsRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListIssueCustomFieldsRequest 请求对象
     * @return SyncInvoker<ListIssueCustomFieldsRequest, ListIssueCustomFieldsResponse>
     */
    public SyncInvoker<ListIssueCustomFieldsRequest, ListIssueCustomFieldsResponse> listIssueCustomFieldsInvoker(
        ListIssueCustomFieldsRequest request) {
        return new SyncInvoker<ListIssueCustomFieldsRequest, ListIssueCustomFieldsResponse>(request,
            ProjectManMeta.listIssueCustomFields, hcClient);
    }

    /**
     * 获取工作项历史记录
     *
     * 获取工作项历史记录
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListIssueRecordsV4Request 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListIssueRecordsV4Request 请求对象
     * @return SyncInvoker<ListIssueRecordsV4Request, ListIssueRecordsV4Response>
     */
    public SyncInvoker<ListIssueRecordsV4Request, ListIssueRecordsV4Response> listIssueRecordsV4Invoker(
        ListIssueRecordsV4Request request) {
        return new SyncInvoker<ListIssueRecordsV4Request, ListIssueRecordsV4Response>(request,
            ProjectManMeta.listIssueRecordsV4, hcClient);
    }

    /**
     * 查询项目的工作项
     *
     * 工作项类型id, 分页参数，创建时间查询项目的工作项
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListIssuesSfV4Request 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListIssuesSfV4Request 请求对象
     * @return SyncInvoker<ListIssuesSfV4Request, ListIssuesSfV4Response>
     */
    public SyncInvoker<ListIssuesSfV4Request, ListIssuesSfV4Response> listIssuesSfV4Invoker(
        ListIssuesSfV4Request request) {
        return new SyncInvoker<ListIssuesSfV4Request, ListIssuesSfV4Response>(request, ProjectManMeta.listIssuesSfV4,
            hcClient);
    }

    /**
     * 高级查询工作项
     *
     * 根据筛选条件查询工作项
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListIssuesV4Request 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListIssuesV4Request 请求对象
     * @return SyncInvoker<ListIssuesV4Request, ListIssuesV4Response>
     */
    public SyncInvoker<ListIssuesV4Request, ListIssuesV4Response> listIssuesV4Invoker(ListIssuesV4Request request) {
        return new SyncInvoker<ListIssuesV4Request, ListIssuesV4Response>(request, ProjectManMeta.listIssuesV4,
            hcClient);
    }

    /**
     * 查看迭代历史记录
     *
     * 查看迭代历史记录
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListIterationHistoriesRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListIterationHistoriesRequest 请求对象
     * @return SyncInvoker<ListIterationHistoriesRequest, ListIterationHistoriesResponse>
     */
    public SyncInvoker<ListIterationHistoriesRequest, ListIterationHistoriesResponse> listIterationHistoriesInvoker(
        ListIterationHistoriesRequest request) {
        return new SyncInvoker<ListIterationHistoriesRequest, ListIterationHistoriesResponse>(request,
            ProjectManMeta.listIterationHistories, hcClient);
    }

    /**
     * 查询项目下所有工作项的历史记录
     *
     * 查询项目下所有工作项的历史记录
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListProjectIssuesRecordsV4Request 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListProjectIssuesRecordsV4Request 请求对象
     * @return SyncInvoker<ListProjectIssuesRecordsV4Request, ListProjectIssuesRecordsV4Response>
     */
    public SyncInvoker<ListProjectIssuesRecordsV4Request, ListProjectIssuesRecordsV4Response> listProjectIssuesRecordsV4Invoker(
        ListProjectIssuesRecordsV4Request request) {
        return new SyncInvoker<ListProjectIssuesRecordsV4Request, ListProjectIssuesRecordsV4Response>(request,
            ProjectManMeta.listProjectIssuesRecordsV4, hcClient);
    }

    /**
     * 获取指定项目的迭代列表
     *
     * 获取项目迭代
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListProjectIterationsV4Request 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListProjectIterationsV4Request 请求对象
     * @return SyncInvoker<ListProjectIterationsV4Request, ListProjectIterationsV4Response>
     */
    public SyncInvoker<ListProjectIterationsV4Request, ListProjectIterationsV4Response> listProjectIterationsV4Invoker(
        ListProjectIterationsV4Request request) {
        return new SyncInvoker<ListProjectIterationsV4Request, ListProjectIterationsV4Response>(request,
            ProjectManMeta.listProjectIterationsV4, hcClient);
    }

    /**
     * 按用户查询工时（多项目）
     *
     * 按用户查询工时（多项目）
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListProjectWorkHoursRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListProjectWorkHoursRequest 请求对象
     * @return SyncInvoker<ListProjectWorkHoursRequest, ListProjectWorkHoursResponse>
     */
    public SyncInvoker<ListProjectWorkHoursRequest, ListProjectWorkHoursResponse> listProjectWorkHoursInvoker(
        ListProjectWorkHoursRequest request) {
        return new SyncInvoker<ListProjectWorkHoursRequest, ListProjectWorkHoursResponse>(request,
            ProjectManMeta.listProjectWorkHours, hcClient);
    }

    /**
     * 获取工作项完成率
     *
     * 获取工作项的完成率
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowIssueCompletionRateRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowIssueCompletionRateRequest 请求对象
     * @return SyncInvoker<ShowIssueCompletionRateRequest, ShowIssueCompletionRateResponse>
     */
    public SyncInvoker<ShowIssueCompletionRateRequest, ShowIssueCompletionRateResponse> showIssueCompletionRateInvoker(
        ShowIssueCompletionRateRequest request) {
        return new SyncInvoker<ShowIssueCompletionRateRequest, ShowIssueCompletionRateResponse>(request,
            ProjectManMeta.showIssueCompletionRate, hcClient);
    }

    /**
     * 查询工作项详情
     *
     * 查询工作项详情
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowIssueV4Request 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowIssueV4Request 请求对象
     * @return SyncInvoker<ShowIssueV4Request, ShowIssueV4Response>
     */
    public SyncInvoker<ShowIssueV4Request, ShowIssueV4Response> showIssueV4Invoker(ShowIssueV4Request request) {
        return new SyncInvoker<ShowIssueV4Request, ShowIssueV4Response>(request, ProjectManMeta.showIssueV4, hcClient);
    }

    /**
     * 查询Scrum的工作项流转配置
     *
     * 查询Scrum的工作项流转配置
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowIssuesWrokFlowConfigRequest 请求对象
     * @return ShowIssuesWrokFlowConfigResponse
     */
    public ShowIssuesWrokFlowConfigResponse showIssuesWrokFlowConfig(ShowIssuesWrokFlowConfigRequest request) {
        return hcClient.syncInvokeHttp(request, ProjectManMeta.showIssuesWrokFlowConfig);
    }

    /**
     * 查询Scrum的工作项流转配置
     *
     * 查询Scrum的工作项流转配置
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowIssuesWrokFlowConfigRequest 请求对象
     * @return SyncInvoker<ShowIssuesWrokFlowConfigRequest, ShowIssuesWrokFlowConfigResponse>
     */
    public SyncInvoker<ShowIssuesWrokFlowConfigRequest, ShowIssuesWrokFlowConfigResponse> showIssuesWrokFlowConfigInvoker(
        ShowIssuesWrokFlowConfigRequest request) {
        return new SyncInvoker<ShowIssuesWrokFlowConfigRequest, ShowIssuesWrokFlowConfigResponse>(request,
            ProjectManMeta.showIssuesWrokFlowConfig, hcClient);
    }

    /**
     * 查看迭代详情
     *
     * 查看迭代详情
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowIterationV4Request 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowIterationV4Request 请求对象
     * @return SyncInvoker<ShowIterationV4Request, ShowIterationV4Response>
     */
    public SyncInvoker<ShowIterationV4Request, ShowIterationV4Response> showIterationV4Invoker(
        ShowIterationV4Request request) {
        return new SyncInvoker<ShowIterationV4Request, ShowIterationV4Response>(request, ProjectManMeta.showIterationV4,
            hcClient);
    }

    /**
     * 按用户查询工时（单项目）
     *
     * 按用户查询工时（单项目）
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowProjectWorkHoursRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowProjectWorkHoursRequest 请求对象
     * @return SyncInvoker<ShowProjectWorkHoursRequest, ShowProjectWorkHoursResponse>
     */
    public SyncInvoker<ShowProjectWorkHoursRequest, ShowProjectWorkHoursResponse> showProjectWorkHoursInvoker(
        ShowProjectWorkHoursRequest request) {
        return new SyncInvoker<ShowProjectWorkHoursRequest, ShowProjectWorkHoursResponse>(request,
            ProjectManMeta.showProjectWorkHours, hcClient);
    }

    /**
     * 更新工作项
     *
     * 更新工作项
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateIssueV4Request 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateIssueV4Request 请求对象
     * @return SyncInvoker<UpdateIssueV4Request, UpdateIssueV4Response>
     */
    public SyncInvoker<UpdateIssueV4Request, UpdateIssueV4Response> updateIssueV4Invoker(UpdateIssueV4Request request) {
        return new SyncInvoker<UpdateIssueV4Request, UpdateIssueV4Response>(request, ProjectManMeta.updateIssueV4,
            hcClient);
    }

    /**
     * 更新Scrum项目迭代
     *
     * 更新Scrum项目迭代
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateIterationV4Request 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateIterationV4Request 请求对象
     * @return SyncInvoker<UpdateIterationV4Request, UpdateIterationV4Response>
     */
    public SyncInvoker<UpdateIterationV4Request, UpdateIterationV4Response> updateIterationV4Invoker(
        UpdateIterationV4Request request) {
        return new SyncInvoker<UpdateIterationV4Request, UpdateIterationV4Response>(request,
            ProjectManMeta.updateIterationV4, hcClient);
    }

    /**
     * 上传图片
     *
     * 上传图片
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UploadIssueImgRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UploadIssueImgRequest 请求对象
     * @return SyncInvoker<UploadIssueImgRequest, UploadIssueImgResponse>
     */
    public SyncInvoker<UploadIssueImgRequest, UploadIssueImgResponse> uploadIssueImgInvoker(
        UploadIssueImgRequest request) {
        return new SyncInvoker<UploadIssueImgRequest, UploadIssueImgResponse>(request, ProjectManMeta.uploadIssueImg,
            hcClient);
    }

}
