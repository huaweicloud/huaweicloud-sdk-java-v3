package com.huaweicloud.sdk.servicestage.v2;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

import com.huaweicloud.sdk.servicestage.v2.model.*;

public class ServiceStageAsyncClient {
    protected HcClient hcClient;

    public ServiceStageAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<ServiceStageAsyncClient> newBuilder() {
        return new ClientBuilder<>(ServiceStageAsyncClient::new);
    }


    public CompletableFuture<ChangeApplicationResponse> changeApplicationAsync(ChangeApplicationRequest request) {
        return hcClient.asyncInvokeHttp(request, ServiceStageMeta.changeApplication);
    }

    public CompletableFuture<ChangeApplicationConfigurationResponse> changeApplicationConfigurationAsync(ChangeApplicationConfigurationRequest request) {
        return hcClient.asyncInvokeHttp(request, ServiceStageMeta.changeApplicationConfiguration);
    }

    public CompletableFuture<ChangeComponentResponse> changeComponentAsync(ChangeComponentRequest request) {
        return hcClient.asyncInvokeHttp(request, ServiceStageMeta.changeComponent);
    }

    public CompletableFuture<ChangeEnvironmentResponse> changeEnvironmentAsync(ChangeEnvironmentRequest request) {
        return hcClient.asyncInvokeHttp(request, ServiceStageMeta.changeEnvironment);
    }

    public CompletableFuture<ChangeInstanceResponse> changeInstanceAsync(ChangeInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, ServiceStageMeta.changeInstance);
    }

    public CompletableFuture<ChangeResourceInEnvironmentResponse> changeResourceInEnvironmentAsync(ChangeResourceInEnvironmentRequest request) {
        return hcClient.asyncInvokeHttp(request, ServiceStageMeta.changeResourceInEnvironment);
    }

    public CompletableFuture<CreateApplicationResponse> createApplicationAsync(CreateApplicationRequest request) {
        return hcClient.asyncInvokeHttp(request, ServiceStageMeta.createApplication);
    }

    public CompletableFuture<CreateComponentResponse> createComponentAsync(CreateComponentRequest request) {
        return hcClient.asyncInvokeHttp(request, ServiceStageMeta.createComponent);
    }

    public CompletableFuture<CreateEnvironmentResponse> createEnvironmentAsync(CreateEnvironmentRequest request) {
        return hcClient.asyncInvokeHttp(request, ServiceStageMeta.createEnvironment);
    }

    public CompletableFuture<CreateInstanceResponse> createInstanceAsync(CreateInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, ServiceStageMeta.createInstance);
    }

    public CompletableFuture<DeleteApplicationResponse> deleteApplicationAsync(DeleteApplicationRequest request) {
        return hcClient.asyncInvokeHttp(request, ServiceStageMeta.deleteApplication);
    }

    public CompletableFuture<DeleteApplicationConfigurationResponse> deleteApplicationConfigurationAsync(DeleteApplicationConfigurationRequest request) {
        return hcClient.asyncInvokeHttp(request, ServiceStageMeta.deleteApplicationConfiguration);
    }

    public CompletableFuture<DeleteComponentResponse> deleteComponentAsync(DeleteComponentRequest request) {
        return hcClient.asyncInvokeHttp(request, ServiceStageMeta.deleteComponent);
    }

    public CompletableFuture<DeleteEnvironmentResponse> deleteEnvironmentAsync(DeleteEnvironmentRequest request) {
        return hcClient.asyncInvokeHttp(request, ServiceStageMeta.deleteEnvironment);
    }

    public CompletableFuture<DeleteInstanceResponse> deleteInstanceAsync(DeleteInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, ServiceStageMeta.deleteInstance);
    }

    public CompletableFuture<ListApplicationsResponse> listApplicationsAsync(ListApplicationsRequest request) {
        return hcClient.asyncInvokeHttp(request, ServiceStageMeta.listApplications);
    }

    public CompletableFuture<ListComponentsResponse> listComponentsAsync(ListComponentsRequest request) {
        return hcClient.asyncInvokeHttp(request, ServiceStageMeta.listComponents);
    }

    public CompletableFuture<ListEnvironmentsResponse> listEnvironmentsAsync(ListEnvironmentsRequest request) {
        return hcClient.asyncInvokeHttp(request, ServiceStageMeta.listEnvironments);
    }

    public CompletableFuture<ListInstanceSnapshotsResponse> listInstanceSnapshotsAsync(ListInstanceSnapshotsRequest request) {
        return hcClient.asyncInvokeHttp(request, ServiceStageMeta.listInstanceSnapshots);
    }

    public CompletableFuture<ListInstancesResponse> listInstancesAsync(ListInstancesRequest request) {
        return hcClient.asyncInvokeHttp(request, ServiceStageMeta.listInstances);
    }

    public CompletableFuture<ShowApplicationConfigurationResponse> showApplicationConfigurationAsync(ShowApplicationConfigurationRequest request) {
        return hcClient.asyncInvokeHttp(request, ServiceStageMeta.showApplicationConfiguration);
    }

    public CompletableFuture<ShowApplicationDetailResponse> showApplicationDetailAsync(ShowApplicationDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, ServiceStageMeta.showApplicationDetail);
    }

    public CompletableFuture<ShowComponentDetailResponse> showComponentDetailAsync(ShowComponentDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, ServiceStageMeta.showComponentDetail);
    }

    public CompletableFuture<ShowEnvironmentDetailResponse> showEnvironmentDetailAsync(ShowEnvironmentDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, ServiceStageMeta.showEnvironmentDetail);
    }

    public CompletableFuture<ShowInstanceDetailResponse> showInstanceDetailAsync(ShowInstanceDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, ServiceStageMeta.showInstanceDetail);
    }

    public CompletableFuture<ShowJobDetailResponse> showJobDetailAsync(ShowJobDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, ServiceStageMeta.showJobDetail);
    }

    public CompletableFuture<UpdateInstanceActionResponse> updateInstanceActionAsync(UpdateInstanceActionRequest request) {
        return hcClient.asyncInvokeHttp(request, ServiceStageMeta.updateInstanceAction);
    }

    public CompletableFuture<CreateFileResponse> createFileAsync(CreateFileRequest request) {
        return hcClient.asyncInvokeHttp(request, ServiceStageMeta.createFile);
    }

    public CompletableFuture<CreateHookResponse> createHookAsync(CreateHookRequest request) {
        return hcClient.asyncInvokeHttp(request, ServiceStageMeta.createHook);
    }

    public CompletableFuture<CreateOAuthResponse> createOAuthAsync(CreateOAuthRequest request) {
        return hcClient.asyncInvokeHttp(request, ServiceStageMeta.createOAuth);
    }

    public CompletableFuture<CreatePasswordAuthResponse> createPasswordAuthAsync(CreatePasswordAuthRequest request) {
        return hcClient.asyncInvokeHttp(request, ServiceStageMeta.createPasswordAuth);
    }

    public CompletableFuture<CreatePersonalAuthResponse> createPersonalAuthAsync(CreatePersonalAuthRequest request) {
        return hcClient.asyncInvokeHttp(request, ServiceStageMeta.createPersonalAuth);
    }

    public CompletableFuture<CreateProjectResponse> createProjectAsync(CreateProjectRequest request) {
        return hcClient.asyncInvokeHttp(request, ServiceStageMeta.createProject);
    }

    public CompletableFuture<CreateTagResponse> createTagAsync(CreateTagRequest request) {
        return hcClient.asyncInvokeHttp(request, ServiceStageMeta.createTag);
    }

    public CompletableFuture<DeleteAuthorizeResponse> deleteAuthorizeAsync(DeleteAuthorizeRequest request) {
        return hcClient.asyncInvokeHttp(request, ServiceStageMeta.deleteAuthorize);
    }

    public CompletableFuture<DeleteFileResponse> deleteFileAsync(DeleteFileRequest request) {
        return hcClient.asyncInvokeHttp(request, ServiceStageMeta.deleteFile);
    }

    public CompletableFuture<DeleteHookResponse> deleteHookAsync(DeleteHookRequest request) {
        return hcClient.asyncInvokeHttp(request, ServiceStageMeta.deleteHook);
    }

    public CompletableFuture<DeleteTagResponse> deleteTagAsync(DeleteTagRequest request) {
        return hcClient.asyncInvokeHttp(request, ServiceStageMeta.deleteTag);
    }

    public CompletableFuture<ListAuthorizationsResponse> listAuthorizationsAsync(ListAuthorizationsRequest request) {
        return hcClient.asyncInvokeHttp(request, ServiceStageMeta.listAuthorizations);
    }

    public CompletableFuture<ListBranchesResponse> listBranchesAsync(ListBranchesRequest request) {
        return hcClient.asyncInvokeHttp(request, ServiceStageMeta.listBranches);
    }

    public CompletableFuture<ListCommitsResponse> listCommitsAsync(ListCommitsRequest request) {
        return hcClient.asyncInvokeHttp(request, ServiceStageMeta.listCommits);
    }

    public CompletableFuture<ListHooksResponse> listHooksAsync(ListHooksRequest request) {
        return hcClient.asyncInvokeHttp(request, ServiceStageMeta.listHooks);
    }

    public CompletableFuture<ListNamespacesResponse> listNamespacesAsync(ListNamespacesRequest request) {
        return hcClient.asyncInvokeHttp(request, ServiceStageMeta.listNamespaces);
    }

    public CompletableFuture<ListProjectsResponse> listProjectsAsync(ListProjectsRequest request) {
        return hcClient.asyncInvokeHttp(request, ServiceStageMeta.listProjects);
    }

    public CompletableFuture<ListTagsResponse> listTagsAsync(ListTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, ServiceStageMeta.listTags);
    }

    public CompletableFuture<ListTreesResponse> listTreesAsync(ListTreesRequest request) {
        return hcClient.asyncInvokeHttp(request, ServiceStageMeta.listTrees);
    }

    public CompletableFuture<ShowContentResponse> showContentAsync(ShowContentRequest request) {
        return hcClient.asyncInvokeHttp(request, ServiceStageMeta.showContent);
    }

    public CompletableFuture<ShowProjectDetailResponse> showProjectDetailAsync(ShowProjectDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, ServiceStageMeta.showProjectDetail);
    }

    public CompletableFuture<ShowRedirectUrlResponse> showRedirectUrlAsync(ShowRedirectUrlRequest request) {
        return hcClient.asyncInvokeHttp(request, ServiceStageMeta.showRedirectUrl);
    }

    public CompletableFuture<UpdateFileResponse> updateFileAsync(UpdateFileRequest request) {
        return hcClient.asyncInvokeHttp(request, ServiceStageMeta.updateFile);
    }

    public CompletableFuture<ListFlavorsResponse> listFlavorsAsync(ListFlavorsRequest request) {
        return hcClient.asyncInvokeHttp(request, ServiceStageMeta.listFlavors);
    }

    public CompletableFuture<ListRuntimesResponse> listRuntimesAsync(ListRuntimesRequest request) {
        return hcClient.asyncInvokeHttp(request, ServiceStageMeta.listRuntimes);
    }

    public CompletableFuture<ListTemplatesResponse> listTemplatesAsync(ListTemplatesRequest request) {
        return hcClient.asyncInvokeHttp(request, ServiceStageMeta.listTemplates);
    }

}