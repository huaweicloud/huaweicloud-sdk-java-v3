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


    /**
     * 修改应用信息
     * 此API通过应用ID修改应用信息。
     *
     * @param ChangeApplicationRequest 请求对象
     * @return ChangeApplicationResponse
     */
    public ChangeApplicationResponse changeApplication(ChangeApplicationRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.changeApplication);
    }

    /**
     * 修改应用配置信息
     * 通过此API修改应用配置信息。
     *
     * @param ChangeApplicationConfigurationRequest 请求对象
     * @return ChangeApplicationConfigurationResponse
     */
    public ChangeApplicationConfigurationResponse changeApplicationConfiguration(ChangeApplicationConfigurationRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.changeApplicationConfiguration);
    }

    /**
     * 根据组件ID修改组件信息
     * 此API通过组件ID修改组件信息。
     *
     * @param ChangeComponentRequest 请求对象
     * @return ChangeComponentResponse
     */
    public ChangeComponentResponse changeComponent(ChangeComponentRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.changeComponent);
    }

    /**
     * 修改环境信息
     * 此API通过环境ID修改环境信息。
     *
     * @param ChangeEnvironmentRequest 请求对象
     * @return ChangeEnvironmentResponse
     */
    public ChangeEnvironmentResponse changeEnvironment(ChangeEnvironmentRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.changeEnvironment);
    }

    /**
     * 修改应用组件实例
     * 通过此API修改应用组件实例。
     *
     * @param ChangeInstanceRequest 请求对象
     * @return ChangeInstanceResponse
     */
    public ChangeInstanceResponse changeInstance(ChangeInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.changeInstance);
    }

    /**
     * 修改环境资源
     * 此API用来修改环境资源。
     *
     * @param ChangeResourceInEnvironmentRequest 请求对象
     * @return ChangeResourceInEnvironmentResponse
     */
    public ChangeResourceInEnvironmentResponse changeResourceInEnvironment(ChangeResourceInEnvironmentRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.changeResourceInEnvironment);
    }

    /**
     * 创建应用
     * 应用是一个功能相对完备的业务系统，由一个或多个特性相关的组件组成。  此API用来创建应用。 
     *
     * @param CreateApplicationRequest 请求对象
     * @return CreateApplicationResponse
     */
    public CreateApplicationResponse createApplication(CreateApplicationRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.createApplication);
    }

    /**
     * 应用中创建组件
     * 应用组件是组成应用的某个业务特性实现，以代码或者软件包为载体，可独立部署运行。  此API用来在应用中创建组件。 
     *
     * @param CreateComponentRequest 请求对象
     * @return CreateComponentResponse
     */
    public CreateComponentResponse createComponent(CreateComponentRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.createComponent);
    }

    /**
     * 创建环境
     * 环境是用于应用部署和运行的计算、存储、网络等基础设施的集合。Servicestage把相同VPC下的CCE集群加上多个ELB、RDS、DCS实例组合为一个环境，如：开发环境，测试环境，预生产环境，生产环境。环境内网络互通，可以按环境维度来管理资源、部署服务，减少具体基础设施运维管理的复杂性。  此API用来创建环境。 
     *
     * @param CreateEnvironmentRequest 请求对象
     * @return CreateEnvironmentResponse
     */
    public CreateEnvironmentResponse createEnvironment(CreateEnvironmentRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.createEnvironment);
    }

    /**
     * 创建组件实例
     * 此API用来创建应用组件实例。
     *
     * @param CreateInstanceRequest 请求对象
     * @return CreateInstanceResponse
     */
    public CreateInstanceResponse createInstance(CreateInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.createInstance);
    }

    /**
     * 根据应用ID删除应用
     * 此API通过应用ID删除应用。
     *
     * @param DeleteApplicationRequest 请求对象
     * @return DeleteApplicationResponse
     */
    public DeleteApplicationResponse deleteApplication(DeleteApplicationRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.deleteApplication);
    }

    /**
     * 删除应用配置
     * 通过此API删除应用配置信息。
     *
     * @param DeleteApplicationConfigurationRequest 请求对象
     * @return DeleteApplicationConfigurationResponse
     */
    public DeleteApplicationConfigurationResponse deleteApplicationConfiguration(DeleteApplicationConfigurationRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.deleteApplicationConfiguration);
    }

    /**
     * 根据应用组件ID删除应用组件
     * 此API通过应用组件ID删除应用组件。
     *
     * @param DeleteComponentRequest 请求对象
     * @return DeleteComponentResponse
     */
    public DeleteComponentResponse deleteComponent(DeleteComponentRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.deleteComponent);
    }

    /**
     * 根据环境ID删除环境
     * 此API通过环境ID删除环境。
     *
     * @param DeleteEnvironmentRequest 请求对象
     * @return DeleteEnvironmentResponse
     */
    public DeleteEnvironmentResponse deleteEnvironment(DeleteEnvironmentRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.deleteEnvironment);
    }

    /**
     * 删除应用组件实例
     * 通过此API删除应用组件实例。
     *
     * @param DeleteInstanceRequest 请求对象
     * @return DeleteInstanceResponse
     */
    public DeleteInstanceResponse deleteInstance(DeleteInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.deleteInstance);
    }

    /**
     * 获取所有应用
     * 通过此API可以获取所有已经创建的应用。
     *
     * @param ListApplicationsRequest 请求对象
     * @return ListApplicationsResponse
     */
    public ListApplicationsResponse listApplications(ListApplicationsRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.listApplications);
    }

    /**
     * 获取应用所有组件
     * 通过此API获取应用下所有应用组件。
     *
     * @param ListComponentsRequest 请求对象
     * @return ListComponentsResponse
     */
    public ListComponentsResponse listComponents(ListComponentsRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.listComponents);
    }

    /**
     * 获取所有环境
     * 此API用来获取所有已经创建环境。
     *
     * @param ListEnvironmentsRequest 请求对象
     * @return ListEnvironmentsResponse
     */
    public ListEnvironmentsResponse listEnvironments(ListEnvironmentsRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.listEnvironments);
    }

    /**
     * 获取组件实例快照
     * 通过此API获取应用组件实例快照信息。
     *
     * @param ListInstanceSnapshotsRequest 请求对象
     * @return ListInstanceSnapshotsResponse
     */
    public ListInstanceSnapshotsResponse listInstanceSnapshots(ListInstanceSnapshotsRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.listInstanceSnapshots);
    }

    /**
     * 获取应用组件实例
     * 通过此API获取组件下的所有组件实例。
     *
     * @param ListInstancesRequest 请求对象
     * @return ListInstancesResponse
     */
    public ListInstancesResponse listInstances(ListInstancesRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.listInstances);
    }

    /**
     * 获取应用配置
     * 通过此API获取应用配置信息。
     *
     * @param ShowApplicationConfigurationRequest 请求对象
     * @return ShowApplicationConfigurationResponse
     */
    public ShowApplicationConfigurationResponse showApplicationConfiguration(ShowApplicationConfigurationRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.showApplicationConfiguration);
    }

    /**
     * 根据应用ID获取应用详细信息
     * 此API通过应用ID获取应用详细信息。
     *
     * @param ShowApplicationDetailRequest 请求对象
     * @return ShowApplicationDetailResponse
     */
    public ShowApplicationDetailResponse showApplicationDetail(ShowApplicationDetailRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.showApplicationDetail);
    }

    /**
     * 根据组件ID获取应用组件信息
     * 通过组件ID获取应用组件信息。
     *
     * @param ShowComponentDetailRequest 请求对象
     * @return ShowComponentDetailResponse
     */
    public ShowComponentDetailResponse showComponentDetail(ShowComponentDetailRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.showComponentDetail);
    }

    /**
     * 根据环境ID获取环境详细信息
     * 此API通过环境ID获取环境详细信息。
     *
     * @param ShowEnvironmentDetailRequest 请求对象
     * @return ShowEnvironmentDetailResponse
     */
    public ShowEnvironmentDetailResponse showEnvironmentDetail(ShowEnvironmentDetailRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.showEnvironmentDetail);
    }

    /**
     * 根据实例ID获取实例详细信息
     * 此API通过实例ID获取实例详细信息。
     *
     * @param ShowInstanceDetailRequest 请求对象
     * @return ShowInstanceDetailResponse
     */
    public ShowInstanceDetailResponse showInstanceDetail(ShowInstanceDetailRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.showInstanceDetail);
    }

    /**
     * 获取部署任务详细信息
     * 通过此API获取部署任务详细信息。
     *
     * @param ShowJobDetailRequest 请求对象
     * @return ShowJobDetailResponse
     */
    public ShowJobDetailResponse showJobDetail(ShowJobDetailRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.showJobDetail);
    }

    /**
     * 对组件实例的操作
     * 通过此API获取对组件实例的操作。
     *
     * @param UpdateInstanceActionRequest 请求对象
     * @return UpdateInstanceActionResponse
     */
    public UpdateInstanceActionResponse updateInstanceAction(UpdateInstanceActionRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.updateInstanceAction);
    }

    /**
     * 创建仓库文件
     * 在指定仓库项目下创建文件。
     *
     * @param CreateFileRequest 请求对象
     * @return CreateFileResponse
     */
    public CreateFileResponse createFile(CreateFileRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.createFile);
    }

    /**
     * 创建项目hook
     * 创建指定项目的hook。
     *
     * @param CreateHookRequest 请求对象
     * @return CreateHookResponse
     */
    public CreateHookResponse createHook(CreateHookRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.createHook);
    }

    /**
     * 创建OAuth授权
     * 创建指定Git仓库类型的OAuth授权。
     *
     * @param CreateOAuthRequest 请求对象
     * @return CreateOAuthResponse
     */
    public CreateOAuthResponse createOAuth(CreateOAuthRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.createOAuth);
    }

    /**
     * 创建口令授权
     * 创建指定Git仓库类型的口令授权。
     *
     * @param CreatePasswordAuthRequest 请求对象
     * @return CreatePasswordAuthResponse
     */
    public CreatePasswordAuthResponse createPasswordAuth(CreatePasswordAuthRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.createPasswordAuth);
    }

    /**
     * 创建私人令牌授权
     * 创建指定Git仓库类型的私人令牌授权。
     *
     * @param CreatePersonalAuthRequest 请求对象
     * @return CreatePersonalAuthResponse
     */
    public CreatePersonalAuthResponse createPersonalAuth(CreatePersonalAuthRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.createPersonalAuth);
    }

    /**
     * 创建软件仓库项目
     * 创建指定组织下的软件仓库项目。
     *
     * @param CreateProjectRequest 请求对象
     * @return CreateProjectResponse
     */
    public CreateProjectResponse createProject(CreateProjectRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.createProject);
    }

    /**
     * 创建项目tag标签
     * 创建指定项目的tag标签。
     *
     * @param CreateTagRequest 请求对象
     * @return CreateTagResponse
     */
    public CreateTagResponse createTag(CreateTagRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.createTag);
    }

    /**
     * 删除仓库授权
     * 通过名称删除仓库授权。
     *
     * @param DeleteAuthorizeRequest 请求对象
     * @return DeleteAuthorizeResponse
     */
    public DeleteAuthorizeResponse deleteAuthorize(DeleteAuthorizeRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.deleteAuthorize);
    }

    /**
     * 删除仓库文件
     * 删除指定项目仓库下的文件。
     *
     * @param DeleteFileRequest 请求对象
     * @return DeleteFileResponse
     */
    public DeleteFileResponse deleteFile(DeleteFileRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.deleteFile);
    }

    /**
     * 删除项目hook
     * 删除指定项目的hook。
     *
     * @param DeleteHookRequest 请求对象
     * @return DeleteHookResponse
     */
    public DeleteHookResponse deleteHook(DeleteHookRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.deleteHook);
    }

    /**
     * 删除项目tag标签
     * 删除指定项目的tag标签。
     *
     * @param DeleteTagRequest 请求对象
     * @return DeleteTagResponse
     */
    public DeleteTagResponse deleteTag(DeleteTagRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.deleteTag);
    }

    /**
     * 获取仓库授权列表
     * 获取所有Git仓库授权信息。
     *
     * @param ListAuthorizationsRequest 请求对象
     * @return ListAuthorizationsResponse
     */
    public ListAuthorizationsResponse listAuthorizations(ListAuthorizationsRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.listAuthorizations);
    }

    /**
     * 获取项目分支
     * 获取指定项目的所有分支列表。
     *
     * @param ListBranchesRequest 请求对象
     * @return ListBranchesResponse
     */
    public ListBranchesResponse listBranches(ListBranchesRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.listBranches);
    }

    /**
     * 获取项目commit提交记录
     * 获取指定项目的最近10次commit提交记录。
     *
     * @param ListCommitsRequest 请求对象
     * @return ListCommitsResponse
     */
    public ListCommitsResponse listCommits(ListCommitsRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.listCommits);
    }

    /**
     * 获取项目hooks
     * 获取指定项目的所有hooks
     *
     * @param ListHooksRequest 请求对象
     * @return ListHooksResponse
     */
    public ListHooksResponse listHooks(ListHooksRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.listHooks);
    }

    /**
     * 获取仓库的namespaces
     * 获取仓库的namespaces。
     *
     * @param ListNamespacesRequest 请求对象
     * @return ListNamespacesResponse
     */
    public ListNamespacesResponse listNamespaces(ListNamespacesRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.listNamespaces);
    }

    /**
     * 获取组织下所有项目
     * 获取指定组织下的所有项目。
     *
     * @param ListProjectsRequest 请求对象
     * @return ListProjectsResponse
     */
    public ListProjectsResponse listProjects(ListProjectsRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.listProjects);
    }

    /**
     * 获取项目的所有tag标签
     * 获取指定项目的所有tag标签。
     *
     * @param ListTagsRequest 请求对象
     * @return ListTagsResponse
     */
    public ListTagsResponse listTags(ListTagsRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.listTags);
    }

    /**
     * 获取仓库文件列表
     * 获取指定项目仓库的文件列表。
     *
     * @param ListTreesRequest 请求对象
     * @return ListTreesResponse
     */
    public ListTreesResponse listTrees(ListTreesRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.listTrees);
    }

    /**
     * 获取仓库文件内容
     * 获取指定项目仓库下文件的内容。
     *
     * @param ShowContentRequest 请求对象
     * @return ShowContentResponse
     */
    public ShowContentResponse showContent(ShowContentRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.showContent);
    }

    /**
     * 通过clone url 获取仓库信息
     * 通过指定的clone url 获取仓库信息。
     *
     * @param ShowProjectDetailRequest 请求对象
     * @return ShowProjectDetailResponse
     */
    public ShowProjectDetailResponse showProjectDetail(ShowProjectDetailRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.showProjectDetail);
    }

    /**
     * 获取授权重定向URL
     * 获取指定Git仓库类型的授权重定向URL。
     *
     * @param ShowRedirectUrlRequest 请求对象
     * @return ShowRedirectUrlResponse
     */
    public ShowRedirectUrlResponse showRedirectUrl(ShowRedirectUrlRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.showRedirectUrl);
    }

    /**
     * 更新仓库文件内容
     * 更新指定项目仓库下的文件内容。
     *
     * @param UpdateFileRequest 请求对象
     * @return UpdateFileResponse
     */
    public UpdateFileResponse updateFile(UpdateFileRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.updateFile);
    }

    /**
     * 获取所有支持的应用资源规格
     * 通过此API获取所用支持的应用资源规格。
     *
     * @param ListFlavorsRequest 请求对象
     * @return ListFlavorsResponse
     */
    public ListFlavorsResponse listFlavors(ListFlavorsRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.listFlavors);
    }

    /**
     * 获取所有支持的应用组件运行时类型
     * 此API用来获取所有支持应用组件运行时类型。
     *
     * @param ListRuntimesRequest 请求对象
     * @return ListRuntimesResponse
     */
    public ListRuntimesResponse listRuntimes(ListRuntimesRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.listRuntimes);
    }

    /**
     * 获取所有支持的应用组件模板
     * 此API用来获取所有内置应用组件模板。
     *
     * @param ListTemplatesRequest 请求对象
     * @return ListTemplatesResponse
     */
    public ListTemplatesResponse listTemplates(ListTemplatesRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.listTemplates);
    }

}