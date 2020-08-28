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


    public CompletableFuture<CreateProjectV4Response> createProjectV4Async(CreateProjectV4Request request) {
        return hcClient.asyncInvokeHttp(request, ProjectManMeta.createProjectV4);
    }

    public CompletableFuture<ListDomainNotAddedProjectsV4Response> listDomainNotAddedProjectsV4Async(ListDomainNotAddedProjectsV4Request request) {
        return hcClient.asyncInvokeHttp(request, ProjectManMeta.listDomainNotAddedProjectsV4);
    }

    public CompletableFuture<ListIssueCommentsV4Response> listIssueCommentsV4Async(ListIssueCommentsV4Request request) {
        return hcClient.asyncInvokeHttp(request, ProjectManMeta.listIssueCommentsV4);
    }

    public CompletableFuture<ListIssueRecordsV4Response> listIssueRecordsV4Async(ListIssueRecordsV4Request request) {
        return hcClient.asyncInvokeHttp(request, ProjectManMeta.listIssueRecordsV4);
    }

    public CompletableFuture<ListProjectMembersV4Response> listProjectMembersV4Async(ListProjectMembersV4Request request) {
        return hcClient.asyncInvokeHttp(request, ProjectManMeta.listProjectMembersV4);
    }

    public CompletableFuture<ListProjectVersionsV4Response> listProjectVersionsV4Async(ListProjectVersionsV4Request request) {
        return hcClient.asyncInvokeHttp(request, ProjectManMeta.listProjectVersionsV4);
    }

    public CompletableFuture<ListProjectWorkHoursResponse> listProjectWorkHoursAsync(ListProjectWorkHoursRequest request) {
        return hcClient.asyncInvokeHttp(request, ProjectManMeta.listProjectWorkHours);
    }

    public CompletableFuture<ListProjectsV4Response> listProjectsV4Async(ListProjectsV4Request request) {
        return hcClient.asyncInvokeHttp(request, ProjectManMeta.listProjectsV4);
    }

    public CompletableFuture<RemoveProjectResponse> removeProjectAsync(RemoveProjectRequest request) {
        return hcClient.asyncInvokeHttp(request, ProjectManMeta.removeProject);
    }

    public CompletableFuture<ShowCurUserInfoResponse> showCurUserInfoAsync(ShowCurUserInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, ProjectManMeta.showCurUserInfo);
    }

    public CompletableFuture<ShowCurUserRoleResponse> showCurUserRoleAsync(ShowCurUserRoleRequest request) {
        return hcClient.asyncInvokeHttp(request, ProjectManMeta.showCurUserRole);
    }

    public CompletableFuture<ShowProjectWorkHoursResponse> showProjectWorkHoursAsync(ShowProjectWorkHoursRequest request) {
        return hcClient.asyncInvokeHttp(request, ProjectManMeta.showProjectWorkHours);
    }

    public CompletableFuture<ShowtIssueCompletionRateResponse> showtIssueCompletionRateAsync(ShowtIssueCompletionRateRequest request) {
        return hcClient.asyncInvokeHttp(request, ProjectManMeta.showtIssueCompletionRate);
    }

    public CompletableFuture<UpdateMembesRoleV4Response> updateMembesRoleV4Async(UpdateMembesRoleV4Request request) {
        return hcClient.asyncInvokeHttp(request, ProjectManMeta.updateMembesRoleV4);
    }

}