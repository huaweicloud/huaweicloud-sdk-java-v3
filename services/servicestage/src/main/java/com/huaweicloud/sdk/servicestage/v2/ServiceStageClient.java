package com.huaweicloud.sdk.servicestage.v2;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.servicestage.v2.model.*;

public class ServiceStageClient {
    protected HcClient hcClient;

    public ServiceStageClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<ServiceStageClient> newBuilder() {
        return new ClientBuilder<>(ServiceStageClient::new);
    }

    public ChangeApplicationResponse changeApplication(ChangeApplicationRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.changeApplication);
    }

    public ChangeApplicationConfigurationResponse changeApplicationConfiguration(ChangeApplicationConfigurationRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.changeApplicationConfiguration);
    }

    public ChangeComponentResponse changeComponent(ChangeComponentRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.changeComponent);
    }

    public ChangeEnvironmentResponse changeEnvironment(ChangeEnvironmentRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.changeEnvironment);
    }

    public ChangeInstanceResponse changeInstance(ChangeInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.changeInstance);
    }

    public ChangeResourceInEnvironmentResponse changeResourceInEnvironment(ChangeResourceInEnvironmentRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.changeResourceInEnvironment);
    }

    public CreateApplicationResponse createApplication(CreateApplicationRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.createApplication);
    }

    public CreateComponentResponse createComponent(CreateComponentRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.createComponent);
    }

    public CreateEnvironmentResponse createEnvironment(CreateEnvironmentRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.createEnvironment);
    }

    public CreateInstanceResponse createInstance(CreateInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.createInstance);
    }

    public DeleteApplicationResponse deleteApplication(DeleteApplicationRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.deleteApplication);
    }

    public DeleteApplicationConfigurationResponse deleteApplicationConfiguration(DeleteApplicationConfigurationRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.deleteApplicationConfiguration);
    }

    public DeleteComponentResponse deleteComponent(DeleteComponentRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.deleteComponent);
    }

    public DeleteEnvironmentResponse deleteEnvironment(DeleteEnvironmentRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.deleteEnvironment);
    }

    public DeleteInstanceResponse deleteInstance(DeleteInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.deleteInstance);
    }

    public ListApplicationsResponse listApplications(ListApplicationsRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.listApplications);
    }

    public ListComponentsResponse listComponents(ListComponentsRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.listComponents);
    }

    public ListEnvironmentsResponse listEnvironments(ListEnvironmentsRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.listEnvironments);
    }

    public ListInstanceSnapshotsResponse listInstanceSnapshots(ListInstanceSnapshotsRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.listInstanceSnapshots);
    }

    public ListInstancesResponse listInstances(ListInstancesRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.listInstances);
    }

    public ShowApplicationConfigurationResponse showApplicationConfiguration(ShowApplicationConfigurationRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.showApplicationConfiguration);
    }

    public ShowApplicationDetailResponse showApplicationDetail(ShowApplicationDetailRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.showApplicationDetail);
    }

    public ShowComponentDetailResponse showComponentDetail(ShowComponentDetailRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.showComponentDetail);
    }

    public ShowEnvironmentDetailResponse showEnvironmentDetail(ShowEnvironmentDetailRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.showEnvironmentDetail);
    }

    public ShowInstanceDetailResponse showInstanceDetail(ShowInstanceDetailRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.showInstanceDetail);
    }

    public ShowJobDetailResponse showJobDetail(ShowJobDetailRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.showJobDetail);
    }

    public UpdateInstanceActionResponse updateInstanceAction(UpdateInstanceActionRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.updateInstanceAction);
    }

    public CreateFileResponse createFile(CreateFileRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.createFile);
    }

    public CreateHookResponse createHook(CreateHookRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.createHook);
    }

    public CreateOAuthResponse createOAuth(CreateOAuthRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.createOAuth);
    }

    public CreatePasswordAuthResponse createPasswordAuth(CreatePasswordAuthRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.createPasswordAuth);
    }

    public CreatePersonalAuthResponse createPersonalAuth(CreatePersonalAuthRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.createPersonalAuth);
    }

    public CreateProjectResponse createProject(CreateProjectRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.createProject);
    }

    public CreateTagResponse createTag(CreateTagRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.createTag);
    }

    public DeleteAuthorizeResponse deleteAuthorize(DeleteAuthorizeRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.deleteAuthorize);
    }

    public DeleteFileResponse deleteFile(DeleteFileRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.deleteFile);
    }

    public DeleteHookResponse deleteHook(DeleteHookRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.deleteHook);
    }

    public DeleteTagResponse deleteTag(DeleteTagRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.deleteTag);
    }

    public ListAuthorizationsResponse listAuthorizations(ListAuthorizationsRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.listAuthorizations);
    }

    public ListBranchesResponse listBranches(ListBranchesRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.listBranches);
    }

    public ListCommitsResponse listCommits(ListCommitsRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.listCommits);
    }

    public ListHooksResponse listHooks(ListHooksRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.listHooks);
    }

    public ListNamespacesResponse listNamespaces(ListNamespacesRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.listNamespaces);
    }

    public ListProjectsResponse listProjects(ListProjectsRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.listProjects);
    }

    public ListTagsResponse listTags(ListTagsRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.listTags);
    }

    public ListTreesResponse listTrees(ListTreesRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.listTrees);
    }

    public ShowContentResponse showContent(ShowContentRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.showContent);
    }

    public ShowProjectDetailResponse showProjectDetail(ShowProjectDetailRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.showProjectDetail);
    }

    public ShowRedirectUrlResponse showRedirectUrl(ShowRedirectUrlRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.showRedirectUrl);
    }

    public UpdateFileResponse updateFile(UpdateFileRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.updateFile);
    }

    public ListFlavorsResponse listFlavors(ListFlavorsRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.listFlavors);
    }

    public ListRuntimesResponse listRuntimes(ListRuntimesRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.listRuntimes);
    }

    public ListTemplatesResponse listTemplates(ListTemplatesRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.listTemplates);
    }

}