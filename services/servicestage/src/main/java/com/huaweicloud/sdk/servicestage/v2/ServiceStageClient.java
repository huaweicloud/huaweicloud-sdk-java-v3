package com.huaweicloud.sdk.servicestage.v2;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.servicestage.v2.model.ChangeApplicationConfigurationRequest;
import com.huaweicloud.sdk.servicestage.v2.model.ChangeApplicationConfigurationResponse;
import com.huaweicloud.sdk.servicestage.v2.model.ChangeApplicationRequest;
import com.huaweicloud.sdk.servicestage.v2.model.ChangeApplicationResponse;
import com.huaweicloud.sdk.servicestage.v2.model.ChangeComponentRequest;
import com.huaweicloud.sdk.servicestage.v2.model.ChangeComponentResponse;
import com.huaweicloud.sdk.servicestage.v2.model.ChangeEnvironmentRequest;
import com.huaweicloud.sdk.servicestage.v2.model.ChangeEnvironmentResponse;
import com.huaweicloud.sdk.servicestage.v2.model.ChangeInstanceRequest;
import com.huaweicloud.sdk.servicestage.v2.model.ChangeInstanceResponse;
import com.huaweicloud.sdk.servicestage.v2.model.ChangeResourceInEnvironmentRequest;
import com.huaweicloud.sdk.servicestage.v2.model.ChangeResourceInEnvironmentResponse;
import com.huaweicloud.sdk.servicestage.v2.model.CreateApplicationRequest;
import com.huaweicloud.sdk.servicestage.v2.model.CreateApplicationResponse;
import com.huaweicloud.sdk.servicestage.v2.model.CreateCamInstanceRequest;
import com.huaweicloud.sdk.servicestage.v2.model.CreateCamInstanceResponse;
import com.huaweicloud.sdk.servicestage.v2.model.CreateComponentRequest;
import com.huaweicloud.sdk.servicestage.v2.model.CreateComponentResponse;
import com.huaweicloud.sdk.servicestage.v2.model.CreateEnvironmentRequest;
import com.huaweicloud.sdk.servicestage.v2.model.CreateEnvironmentResponse;
import com.huaweicloud.sdk.servicestage.v2.model.CreateFileRequest;
import com.huaweicloud.sdk.servicestage.v2.model.CreateFileResponse;
import com.huaweicloud.sdk.servicestage.v2.model.CreateHookRequest;
import com.huaweicloud.sdk.servicestage.v2.model.CreateHookResponse;
import com.huaweicloud.sdk.servicestage.v2.model.CreateInstanceRequest;
import com.huaweicloud.sdk.servicestage.v2.model.CreateInstanceResponse;
import com.huaweicloud.sdk.servicestage.v2.model.CreateOAuthRequest;
import com.huaweicloud.sdk.servicestage.v2.model.CreateOAuthResponse;
import com.huaweicloud.sdk.servicestage.v2.model.CreatePasswordAuthRequest;
import com.huaweicloud.sdk.servicestage.v2.model.CreatePasswordAuthResponse;
import com.huaweicloud.sdk.servicestage.v2.model.CreatePersonalAuthRequest;
import com.huaweicloud.sdk.servicestage.v2.model.CreatePersonalAuthResponse;
import com.huaweicloud.sdk.servicestage.v2.model.CreateProjectRequest;
import com.huaweicloud.sdk.servicestage.v2.model.CreateProjectResponse;
import com.huaweicloud.sdk.servicestage.v2.model.CreateTagRequest;
import com.huaweicloud.sdk.servicestage.v2.model.CreateTagResponse;
import com.huaweicloud.sdk.servicestage.v2.model.CreateTemplateRequest;
import com.huaweicloud.sdk.servicestage.v2.model.CreateTemplateResponse;
import com.huaweicloud.sdk.servicestage.v2.model.DeleteApplicationConfigurationRequest;
import com.huaweicloud.sdk.servicestage.v2.model.DeleteApplicationConfigurationResponse;
import com.huaweicloud.sdk.servicestage.v2.model.DeleteApplicationRequest;
import com.huaweicloud.sdk.servicestage.v2.model.DeleteApplicationResponse;
import com.huaweicloud.sdk.servicestage.v2.model.DeleteAuthorizeRequest;
import com.huaweicloud.sdk.servicestage.v2.model.DeleteAuthorizeResponse;
import com.huaweicloud.sdk.servicestage.v2.model.DeleteComponentRequest;
import com.huaweicloud.sdk.servicestage.v2.model.DeleteComponentResponse;
import com.huaweicloud.sdk.servicestage.v2.model.DeleteEnvironmentRequest;
import com.huaweicloud.sdk.servicestage.v2.model.DeleteEnvironmentResponse;
import com.huaweicloud.sdk.servicestage.v2.model.DeleteFileRequest;
import com.huaweicloud.sdk.servicestage.v2.model.DeleteFileResponse;
import com.huaweicloud.sdk.servicestage.v2.model.DeleteHookRequest;
import com.huaweicloud.sdk.servicestage.v2.model.DeleteHookResponse;
import com.huaweicloud.sdk.servicestage.v2.model.DeleteInstanceByIdRequest;
import com.huaweicloud.sdk.servicestage.v2.model.DeleteInstanceByIdResponse;
import com.huaweicloud.sdk.servicestage.v2.model.DeleteInstanceRequest;
import com.huaweicloud.sdk.servicestage.v2.model.DeleteInstanceResponse;
import com.huaweicloud.sdk.servicestage.v2.model.DeleteTagRequest;
import com.huaweicloud.sdk.servicestage.v2.model.DeleteTagResponse;
import com.huaweicloud.sdk.servicestage.v2.model.DeleteTemplateRequest;
import com.huaweicloud.sdk.servicestage.v2.model.DeleteTemplateResponse;
import com.huaweicloud.sdk.servicestage.v2.model.DeployInstanceRequest;
import com.huaweicloud.sdk.servicestage.v2.model.DeployInstanceResponse;
import com.huaweicloud.sdk.servicestage.v2.model.ListApplicationsRequest;
import com.huaweicloud.sdk.servicestage.v2.model.ListApplicationsResponse;
import com.huaweicloud.sdk.servicestage.v2.model.ListAuthorizationsRequest;
import com.huaweicloud.sdk.servicestage.v2.model.ListAuthorizationsResponse;
import com.huaweicloud.sdk.servicestage.v2.model.ListBranchesRequest;
import com.huaweicloud.sdk.servicestage.v2.model.ListBranchesResponse;
import com.huaweicloud.sdk.servicestage.v2.model.ListCommitsRequest;
import com.huaweicloud.sdk.servicestage.v2.model.ListCommitsResponse;
import com.huaweicloud.sdk.servicestage.v2.model.ListComponentOverviewsRequest;
import com.huaweicloud.sdk.servicestage.v2.model.ListComponentOverviewsResponse;
import com.huaweicloud.sdk.servicestage.v2.model.ListComponentsRequest;
import com.huaweicloud.sdk.servicestage.v2.model.ListComponentsResponse;
import com.huaweicloud.sdk.servicestage.v2.model.ListEnvironmentsRequest;
import com.huaweicloud.sdk.servicestage.v2.model.ListEnvironmentsResponse;
import com.huaweicloud.sdk.servicestage.v2.model.ListFlavorsRequest;
import com.huaweicloud.sdk.servicestage.v2.model.ListFlavorsResponse;
import com.huaweicloud.sdk.servicestage.v2.model.ListHooksRequest;
import com.huaweicloud.sdk.servicestage.v2.model.ListHooksResponse;
import com.huaweicloud.sdk.servicestage.v2.model.ListInstanceSnapshotsRequest;
import com.huaweicloud.sdk.servicestage.v2.model.ListInstanceSnapshotsResponse;
import com.huaweicloud.sdk.servicestage.v2.model.ListInstancesRequest;
import com.huaweicloud.sdk.servicestage.v2.model.ListInstancesResponse;
import com.huaweicloud.sdk.servicestage.v2.model.ListNamespacesRequest;
import com.huaweicloud.sdk.servicestage.v2.model.ListNamespacesResponse;
import com.huaweicloud.sdk.servicestage.v2.model.ListProjectsRequest;
import com.huaweicloud.sdk.servicestage.v2.model.ListProjectsResponse;
import com.huaweicloud.sdk.servicestage.v2.model.ListRuntimesRequest;
import com.huaweicloud.sdk.servicestage.v2.model.ListRuntimesResponse;
import com.huaweicloud.sdk.servicestage.v2.model.ListTagsRequest;
import com.huaweicloud.sdk.servicestage.v2.model.ListTagsResponse;
import com.huaweicloud.sdk.servicestage.v2.model.ListTemplatesRequest;
import com.huaweicloud.sdk.servicestage.v2.model.ListTemplatesResponse;
import com.huaweicloud.sdk.servicestage.v2.model.ListTreesRequest;
import com.huaweicloud.sdk.servicestage.v2.model.ListTreesResponse;
import com.huaweicloud.sdk.servicestage.v2.model.ShowApplicationConfigurationRequest;
import com.huaweicloud.sdk.servicestage.v2.model.ShowApplicationConfigurationResponse;
import com.huaweicloud.sdk.servicestage.v2.model.ShowApplicationDetailRequest;
import com.huaweicloud.sdk.servicestage.v2.model.ShowApplicationDetailResponse;
import com.huaweicloud.sdk.servicestage.v2.model.ShowComponentDetailRequest;
import com.huaweicloud.sdk.servicestage.v2.model.ShowComponentDetailResponse;
import com.huaweicloud.sdk.servicestage.v2.model.ShowContentRequest;
import com.huaweicloud.sdk.servicestage.v2.model.ShowContentResponse;
import com.huaweicloud.sdk.servicestage.v2.model.ShowEnvironmentDetailRequest;
import com.huaweicloud.sdk.servicestage.v2.model.ShowEnvironmentDetailResponse;
import com.huaweicloud.sdk.servicestage.v2.model.ShowInstanceDetailRequest;
import com.huaweicloud.sdk.servicestage.v2.model.ShowInstanceDetailResponse;
import com.huaweicloud.sdk.servicestage.v2.model.ShowJobDetailRequest;
import com.huaweicloud.sdk.servicestage.v2.model.ShowJobDetailResponse;
import com.huaweicloud.sdk.servicestage.v2.model.ShowProjectDetailRequest;
import com.huaweicloud.sdk.servicestage.v2.model.ShowProjectDetailResponse;
import com.huaweicloud.sdk.servicestage.v2.model.ShowRedirectUrlRequest;
import com.huaweicloud.sdk.servicestage.v2.model.ShowRedirectUrlResponse;
import com.huaweicloud.sdk.servicestage.v2.model.UpdateFileRequest;
import com.huaweicloud.sdk.servicestage.v2.model.UpdateFileResponse;
import com.huaweicloud.sdk.servicestage.v2.model.UpdateInstanceActionRequest;
import com.huaweicloud.sdk.servicestage.v2.model.UpdateInstanceActionResponse;
import com.huaweicloud.sdk.servicestage.v2.model.UpdateTemplateRequest;
import com.huaweicloud.sdk.servicestage.v2.model.UpdateTemplateResponse;

public class ServiceStageClient {

    protected HcClient hcClient;

    public ServiceStageClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<ServiceStageClient> newBuilder() {
        ClientBuilder<ServiceStageClient> clientBuilder = new ClientBuilder<>(ServiceStageClient::new);
        return clientBuilder;
    }

    /**
     * 修改应用信息
     *
     * 此API通过应用ID修改应用信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeApplicationRequest 请求对象
     * @return ChangeApplicationResponse
     */
    public ChangeApplicationResponse changeApplication(ChangeApplicationRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.changeApplication);
    }

    /**
     * 修改应用信息
     *
     * 此API通过应用ID修改应用信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeApplicationRequest 请求对象
     * @return SyncInvoker<ChangeApplicationRequest, ChangeApplicationResponse>
     */
    public SyncInvoker<ChangeApplicationRequest, ChangeApplicationResponse> changeApplicationInvoker(
        ChangeApplicationRequest request) {
        return new SyncInvoker<>(request, ServiceStageMeta.changeApplication, hcClient);
    }

    /**
     * 修改应用配置信息
     *
     * 通过此API修改应用配置信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeApplicationConfigurationRequest 请求对象
     * @return ChangeApplicationConfigurationResponse
     */
    public ChangeApplicationConfigurationResponse changeApplicationConfiguration(
        ChangeApplicationConfigurationRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.changeApplicationConfiguration);
    }

    /**
     * 修改应用配置信息
     *
     * 通过此API修改应用配置信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeApplicationConfigurationRequest 请求对象
     * @return SyncInvoker<ChangeApplicationConfigurationRequest, ChangeApplicationConfigurationResponse>
     */
    public SyncInvoker<ChangeApplicationConfigurationRequest, ChangeApplicationConfigurationResponse> changeApplicationConfigurationInvoker(
        ChangeApplicationConfigurationRequest request) {
        return new SyncInvoker<>(request, ServiceStageMeta.changeApplicationConfiguration, hcClient);
    }

    /**
     * 根据组件ID修改组件信息
     *
     * 此API通过组件ID修改组件信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeComponentRequest 请求对象
     * @return ChangeComponentResponse
     */
    public ChangeComponentResponse changeComponent(ChangeComponentRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.changeComponent);
    }

    /**
     * 根据组件ID修改组件信息
     *
     * 此API通过组件ID修改组件信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeComponentRequest 请求对象
     * @return SyncInvoker<ChangeComponentRequest, ChangeComponentResponse>
     */
    public SyncInvoker<ChangeComponentRequest, ChangeComponentResponse> changeComponentInvoker(
        ChangeComponentRequest request) {
        return new SyncInvoker<>(request, ServiceStageMeta.changeComponent, hcClient);
    }

    /**
     * 修改环境信息
     *
     * 此API通过环境ID修改环境信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeEnvironmentRequest 请求对象
     * @return ChangeEnvironmentResponse
     */
    public ChangeEnvironmentResponse changeEnvironment(ChangeEnvironmentRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.changeEnvironment);
    }

    /**
     * 修改环境信息
     *
     * 此API通过环境ID修改环境信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeEnvironmentRequest 请求对象
     * @return SyncInvoker<ChangeEnvironmentRequest, ChangeEnvironmentResponse>
     */
    public SyncInvoker<ChangeEnvironmentRequest, ChangeEnvironmentResponse> changeEnvironmentInvoker(
        ChangeEnvironmentRequest request) {
        return new SyncInvoker<>(request, ServiceStageMeta.changeEnvironment, hcClient);
    }

    /**
     * 修改应用组件实例
     *
     * 通过此API修改应用组件实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeInstanceRequest 请求对象
     * @return ChangeInstanceResponse
     */
    public ChangeInstanceResponse changeInstance(ChangeInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.changeInstance);
    }

    /**
     * 修改应用组件实例
     *
     * 通过此API修改应用组件实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeInstanceRequest 请求对象
     * @return SyncInvoker<ChangeInstanceRequest, ChangeInstanceResponse>
     */
    public SyncInvoker<ChangeInstanceRequest, ChangeInstanceResponse> changeInstanceInvoker(
        ChangeInstanceRequest request) {
        return new SyncInvoker<>(request, ServiceStageMeta.changeInstance, hcClient);
    }

    /**
     * 修改环境资源
     *
     * 此API用来修改环境资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeResourceInEnvironmentRequest 请求对象
     * @return ChangeResourceInEnvironmentResponse
     */
    public ChangeResourceInEnvironmentResponse changeResourceInEnvironment(ChangeResourceInEnvironmentRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.changeResourceInEnvironment);
    }

    /**
     * 修改环境资源
     *
     * 此API用来修改环境资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeResourceInEnvironmentRequest 请求对象
     * @return SyncInvoker<ChangeResourceInEnvironmentRequest, ChangeResourceInEnvironmentResponse>
     */
    public SyncInvoker<ChangeResourceInEnvironmentRequest, ChangeResourceInEnvironmentResponse> changeResourceInEnvironmentInvoker(
        ChangeResourceInEnvironmentRequest request) {
        return new SyncInvoker<>(request, ServiceStageMeta.changeResourceInEnvironment, hcClient);
    }

    /**
     * 创建应用
     *
     * 应用是一个功能相对完备的业务系统，由一个或多个特性相关的组件组成。
     * 
     * 此API用来创建应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateApplicationRequest 请求对象
     * @return CreateApplicationResponse
     */
    public CreateApplicationResponse createApplication(CreateApplicationRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.createApplication);
    }

    /**
     * 创建应用
     *
     * 应用是一个功能相对完备的业务系统，由一个或多个特性相关的组件组成。
     * 
     * 此API用来创建应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateApplicationRequest 请求对象
     * @return SyncInvoker<CreateApplicationRequest, CreateApplicationResponse>
     */
    public SyncInvoker<CreateApplicationRequest, CreateApplicationResponse> createApplicationInvoker(
        CreateApplicationRequest request) {
        return new SyncInvoker<>(request, ServiceStageMeta.createApplication, hcClient);
    }

    /**
     * 创建、更新实例
     *
     * 创建、更新实例
     *
     * @param request CreateCamInstanceRequest 请求对象
     * @return CreateCamInstanceResponse
     */
    public CreateCamInstanceResponse createCamInstance(CreateCamInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.createCamInstance);
    }

    /**
     * 创建、更新实例
     *
     * 创建、更新实例
     *
     * @param request CreateCamInstanceRequest 请求对象
     * @return SyncInvoker<CreateCamInstanceRequest, CreateCamInstanceResponse>
     */
    public SyncInvoker<CreateCamInstanceRequest, CreateCamInstanceResponse> createCamInstanceInvoker(
        CreateCamInstanceRequest request) {
        return new SyncInvoker<>(request, ServiceStageMeta.createCamInstance, hcClient);
    }

    /**
     * 应用中创建组件
     *
     * 应用组件是组成应用的某个业务特性实现，以代码或者软件包为载体，可独立部署运行。
     * 
     * 此API用来在应用中创建组件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateComponentRequest 请求对象
     * @return CreateComponentResponse
     */
    public CreateComponentResponse createComponent(CreateComponentRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.createComponent);
    }

    /**
     * 应用中创建组件
     *
     * 应用组件是组成应用的某个业务特性实现，以代码或者软件包为载体，可独立部署运行。
     * 
     * 此API用来在应用中创建组件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateComponentRequest 请求对象
     * @return SyncInvoker<CreateComponentRequest, CreateComponentResponse>
     */
    public SyncInvoker<CreateComponentRequest, CreateComponentResponse> createComponentInvoker(
        CreateComponentRequest request) {
        return new SyncInvoker<>(request, ServiceStageMeta.createComponent, hcClient);
    }

    /**
     * 创建环境
     *
     * 环境是用于应用部署和运行的计算、存储、网络等基础设施的集合。Servicestage把相同VPC下的CCE集群加上多个ELB、RDS、DCS实例组合为一个环境，如：开发环境，测试环境，预生产环境，生产环境。环境内网络互通，可以按环境维度来管理资源、部署服务，减少具体基础设施运维管理的复杂性。
     * 
     * 此API用来创建环境。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateEnvironmentRequest 请求对象
     * @return CreateEnvironmentResponse
     */
    public CreateEnvironmentResponse createEnvironment(CreateEnvironmentRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.createEnvironment);
    }

    /**
     * 创建环境
     *
     * 环境是用于应用部署和运行的计算、存储、网络等基础设施的集合。Servicestage把相同VPC下的CCE集群加上多个ELB、RDS、DCS实例组合为一个环境，如：开发环境，测试环境，预生产环境，生产环境。环境内网络互通，可以按环境维度来管理资源、部署服务，减少具体基础设施运维管理的复杂性。
     * 
     * 此API用来创建环境。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateEnvironmentRequest 请求对象
     * @return SyncInvoker<CreateEnvironmentRequest, CreateEnvironmentResponse>
     */
    public SyncInvoker<CreateEnvironmentRequest, CreateEnvironmentResponse> createEnvironmentInvoker(
        CreateEnvironmentRequest request) {
        return new SyncInvoker<>(request, ServiceStageMeta.createEnvironment, hcClient);
    }

    /**
     * 创建组件实例
     *
     * 此API用来创建应用组件实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateInstanceRequest 请求对象
     * @return CreateInstanceResponse
     */
    public CreateInstanceResponse createInstance(CreateInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.createInstance);
    }

    /**
     * 创建组件实例
     *
     * 此API用来创建应用组件实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateInstanceRequest 请求对象
     * @return SyncInvoker<CreateInstanceRequest, CreateInstanceResponse>
     */
    public SyncInvoker<CreateInstanceRequest, CreateInstanceResponse> createInstanceInvoker(
        CreateInstanceRequest request) {
        return new SyncInvoker<>(request, ServiceStageMeta.createInstance, hcClient);
    }

    /**
     * 创建模板
     *
     * 创建模板
     *
     * @param request CreateTemplateRequest 请求对象
     * @return CreateTemplateResponse
     */
    public CreateTemplateResponse createTemplate(CreateTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.createTemplate);
    }

    /**
     * 创建模板
     *
     * 创建模板
     *
     * @param request CreateTemplateRequest 请求对象
     * @return SyncInvoker<CreateTemplateRequest, CreateTemplateResponse>
     */
    public SyncInvoker<CreateTemplateRequest, CreateTemplateResponse> createTemplateInvoker(
        CreateTemplateRequest request) {
        return new SyncInvoker<>(request, ServiceStageMeta.createTemplate, hcClient);
    }

    /**
     * 根据应用ID删除应用
     *
     * 此API通过应用ID删除应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteApplicationRequest 请求对象
     * @return DeleteApplicationResponse
     */
    public DeleteApplicationResponse deleteApplication(DeleteApplicationRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.deleteApplication);
    }

    /**
     * 根据应用ID删除应用
     *
     * 此API通过应用ID删除应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteApplicationRequest 请求对象
     * @return SyncInvoker<DeleteApplicationRequest, DeleteApplicationResponse>
     */
    public SyncInvoker<DeleteApplicationRequest, DeleteApplicationResponse> deleteApplicationInvoker(
        DeleteApplicationRequest request) {
        return new SyncInvoker<>(request, ServiceStageMeta.deleteApplication, hcClient);
    }

    /**
     * 删除应用配置
     *
     * 通过此API删除应用配置信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteApplicationConfigurationRequest 请求对象
     * @return DeleteApplicationConfigurationResponse
     */
    public DeleteApplicationConfigurationResponse deleteApplicationConfiguration(
        DeleteApplicationConfigurationRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.deleteApplicationConfiguration);
    }

    /**
     * 删除应用配置
     *
     * 通过此API删除应用配置信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteApplicationConfigurationRequest 请求对象
     * @return SyncInvoker<DeleteApplicationConfigurationRequest, DeleteApplicationConfigurationResponse>
     */
    public SyncInvoker<DeleteApplicationConfigurationRequest, DeleteApplicationConfigurationResponse> deleteApplicationConfigurationInvoker(
        DeleteApplicationConfigurationRequest request) {
        return new SyncInvoker<>(request, ServiceStageMeta.deleteApplicationConfiguration, hcClient);
    }

    /**
     * 根据应用组件ID删除应用组件
     *
     * 此API通过应用组件ID删除应用组件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteComponentRequest 请求对象
     * @return DeleteComponentResponse
     */
    public DeleteComponentResponse deleteComponent(DeleteComponentRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.deleteComponent);
    }

    /**
     * 根据应用组件ID删除应用组件
     *
     * 此API通过应用组件ID删除应用组件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteComponentRequest 请求对象
     * @return SyncInvoker<DeleteComponentRequest, DeleteComponentResponse>
     */
    public SyncInvoker<DeleteComponentRequest, DeleteComponentResponse> deleteComponentInvoker(
        DeleteComponentRequest request) {
        return new SyncInvoker<>(request, ServiceStageMeta.deleteComponent, hcClient);
    }

    /**
     * 根据环境ID删除环境
     *
     * 此API通过环境ID删除环境。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteEnvironmentRequest 请求对象
     * @return DeleteEnvironmentResponse
     */
    public DeleteEnvironmentResponse deleteEnvironment(DeleteEnvironmentRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.deleteEnvironment);
    }

    /**
     * 根据环境ID删除环境
     *
     * 此API通过环境ID删除环境。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteEnvironmentRequest 请求对象
     * @return SyncInvoker<DeleteEnvironmentRequest, DeleteEnvironmentResponse>
     */
    public SyncInvoker<DeleteEnvironmentRequest, DeleteEnvironmentResponse> deleteEnvironmentInvoker(
        DeleteEnvironmentRequest request) {
        return new SyncInvoker<>(request, ServiceStageMeta.deleteEnvironment, hcClient);
    }

    /**
     * 删除应用组件实例
     *
     * 通过此API删除应用组件实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteInstanceRequest 请求对象
     * @return DeleteInstanceResponse
     */
    public DeleteInstanceResponse deleteInstance(DeleteInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.deleteInstance);
    }

    /**
     * 删除应用组件实例
     *
     * 通过此API删除应用组件实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteInstanceRequest 请求对象
     * @return SyncInvoker<DeleteInstanceRequest, DeleteInstanceResponse>
     */
    public SyncInvoker<DeleteInstanceRequest, DeleteInstanceResponse> deleteInstanceInvoker(
        DeleteInstanceRequest request) {
        return new SyncInvoker<>(request, ServiceStageMeta.deleteInstance, hcClient);
    }

    /**
     * 删除实例
     *
     * 删除实例
     *
     * @param request DeleteInstanceByIdRequest 请求对象
     * @return DeleteInstanceByIdResponse
     */
    public DeleteInstanceByIdResponse deleteInstanceById(DeleteInstanceByIdRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.deleteInstanceById);
    }

    /**
     * 删除实例
     *
     * 删除实例
     *
     * @param request DeleteInstanceByIdRequest 请求对象
     * @return SyncInvoker<DeleteInstanceByIdRequest, DeleteInstanceByIdResponse>
     */
    public SyncInvoker<DeleteInstanceByIdRequest, DeleteInstanceByIdResponse> deleteInstanceByIdInvoker(
        DeleteInstanceByIdRequest request) {
        return new SyncInvoker<>(request, ServiceStageMeta.deleteInstanceById, hcClient);
    }

    /**
     * 删除模板
     *
     * 删除模板
     *
     * @param request DeleteTemplateRequest 请求对象
     * @return DeleteTemplateResponse
     */
    public DeleteTemplateResponse deleteTemplate(DeleteTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.deleteTemplate);
    }

    /**
     * 删除模板
     *
     * 删除模板
     *
     * @param request DeleteTemplateRequest 请求对象
     * @return SyncInvoker<DeleteTemplateRequest, DeleteTemplateResponse>
     */
    public SyncInvoker<DeleteTemplateRequest, DeleteTemplateResponse> deleteTemplateInvoker(
        DeleteTemplateRequest request) {
        return new SyncInvoker<>(request, ServiceStageMeta.deleteTemplate, hcClient);
    }

    /**
     * 部署实例
     *
     * 部署实例
     *
     * @param request DeployInstanceRequest 请求对象
     * @return DeployInstanceResponse
     */
    public DeployInstanceResponse deployInstance(DeployInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.deployInstance);
    }

    /**
     * 部署实例
     *
     * 部署实例
     *
     * @param request DeployInstanceRequest 请求对象
     * @return SyncInvoker<DeployInstanceRequest, DeployInstanceResponse>
     */
    public SyncInvoker<DeployInstanceRequest, DeployInstanceResponse> deployInstanceInvoker(
        DeployInstanceRequest request) {
        return new SyncInvoker<>(request, ServiceStageMeta.deployInstance, hcClient);
    }

    /**
     * 获取所有应用
     *
     * 通过此API可以获取所有已经创建的应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApplicationsRequest 请求对象
     * @return ListApplicationsResponse
     */
    public ListApplicationsResponse listApplications(ListApplicationsRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.listApplications);
    }

    /**
     * 获取所有应用
     *
     * 通过此API可以获取所有已经创建的应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApplicationsRequest 请求对象
     * @return SyncInvoker<ListApplicationsRequest, ListApplicationsResponse>
     */
    public SyncInvoker<ListApplicationsRequest, ListApplicationsResponse> listApplicationsInvoker(
        ListApplicationsRequest request) {
        return new SyncInvoker<>(request, ServiceStageMeta.listApplications, hcClient);
    }

    /**
     * 获取应用所有组件部署信息
     *
     * 通过此API获取应用下所有应用组件部署信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListComponentOverviewsRequest 请求对象
     * @return ListComponentOverviewsResponse
     */
    public ListComponentOverviewsResponse listComponentOverviews(ListComponentOverviewsRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.listComponentOverviews);
    }

    /**
     * 获取应用所有组件部署信息
     *
     * 通过此API获取应用下所有应用组件部署信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListComponentOverviewsRequest 请求对象
     * @return SyncInvoker<ListComponentOverviewsRequest, ListComponentOverviewsResponse>
     */
    public SyncInvoker<ListComponentOverviewsRequest, ListComponentOverviewsResponse> listComponentOverviewsInvoker(
        ListComponentOverviewsRequest request) {
        return new SyncInvoker<>(request, ServiceStageMeta.listComponentOverviews, hcClient);
    }

    /**
     * 获取应用所有组件
     *
     * 通过此API获取应用下所有应用组件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListComponentsRequest 请求对象
     * @return ListComponentsResponse
     */
    public ListComponentsResponse listComponents(ListComponentsRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.listComponents);
    }

    /**
     * 获取应用所有组件
     *
     * 通过此API获取应用下所有应用组件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListComponentsRequest 请求对象
     * @return SyncInvoker<ListComponentsRequest, ListComponentsResponse>
     */
    public SyncInvoker<ListComponentsRequest, ListComponentsResponse> listComponentsInvoker(
        ListComponentsRequest request) {
        return new SyncInvoker<>(request, ServiceStageMeta.listComponents, hcClient);
    }

    /**
     * 获取所有环境
     *
     * 此API用来获取所有已经创建环境。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEnvironmentsRequest 请求对象
     * @return ListEnvironmentsResponse
     */
    public ListEnvironmentsResponse listEnvironments(ListEnvironmentsRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.listEnvironments);
    }

    /**
     * 获取所有环境
     *
     * 此API用来获取所有已经创建环境。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEnvironmentsRequest 请求对象
     * @return SyncInvoker<ListEnvironmentsRequest, ListEnvironmentsResponse>
     */
    public SyncInvoker<ListEnvironmentsRequest, ListEnvironmentsResponse> listEnvironmentsInvoker(
        ListEnvironmentsRequest request) {
        return new SyncInvoker<>(request, ServiceStageMeta.listEnvironments, hcClient);
    }

    /**
     * 获取组件实例快照
     *
     * 通过此API获取应用组件实例快照信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceSnapshotsRequest 请求对象
     * @return ListInstanceSnapshotsResponse
     */
    public ListInstanceSnapshotsResponse listInstanceSnapshots(ListInstanceSnapshotsRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.listInstanceSnapshots);
    }

    /**
     * 获取组件实例快照
     *
     * 通过此API获取应用组件实例快照信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceSnapshotsRequest 请求对象
     * @return SyncInvoker<ListInstanceSnapshotsRequest, ListInstanceSnapshotsResponse>
     */
    public SyncInvoker<ListInstanceSnapshotsRequest, ListInstanceSnapshotsResponse> listInstanceSnapshotsInvoker(
        ListInstanceSnapshotsRequest request) {
        return new SyncInvoker<>(request, ServiceStageMeta.listInstanceSnapshots, hcClient);
    }

    /**
     * 获取应用组件实例
     *
     * 通过此API获取组件下的所有组件实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstancesRequest 请求对象
     * @return ListInstancesResponse
     */
    public ListInstancesResponse listInstances(ListInstancesRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.listInstances);
    }

    /**
     * 获取应用组件实例
     *
     * 通过此API获取组件下的所有组件实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstancesRequest 请求对象
     * @return SyncInvoker<ListInstancesRequest, ListInstancesResponse>
     */
    public SyncInvoker<ListInstancesRequest, ListInstancesResponse> listInstancesInvoker(ListInstancesRequest request) {
        return new SyncInvoker<>(request, ServiceStageMeta.listInstances, hcClient);
    }

    /**
     * 获取应用配置
     *
     * 通过此API获取应用配置信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowApplicationConfigurationRequest 请求对象
     * @return ShowApplicationConfigurationResponse
     */
    public ShowApplicationConfigurationResponse showApplicationConfiguration(
        ShowApplicationConfigurationRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.showApplicationConfiguration);
    }

    /**
     * 获取应用配置
     *
     * 通过此API获取应用配置信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowApplicationConfigurationRequest 请求对象
     * @return SyncInvoker<ShowApplicationConfigurationRequest, ShowApplicationConfigurationResponse>
     */
    public SyncInvoker<ShowApplicationConfigurationRequest, ShowApplicationConfigurationResponse> showApplicationConfigurationInvoker(
        ShowApplicationConfigurationRequest request) {
        return new SyncInvoker<>(request, ServiceStageMeta.showApplicationConfiguration, hcClient);
    }

    /**
     * 根据应用ID获取应用详细信息
     *
     * 此API通过应用ID获取应用详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowApplicationDetailRequest 请求对象
     * @return ShowApplicationDetailResponse
     */
    public ShowApplicationDetailResponse showApplicationDetail(ShowApplicationDetailRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.showApplicationDetail);
    }

    /**
     * 根据应用ID获取应用详细信息
     *
     * 此API通过应用ID获取应用详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowApplicationDetailRequest 请求对象
     * @return SyncInvoker<ShowApplicationDetailRequest, ShowApplicationDetailResponse>
     */
    public SyncInvoker<ShowApplicationDetailRequest, ShowApplicationDetailResponse> showApplicationDetailInvoker(
        ShowApplicationDetailRequest request) {
        return new SyncInvoker<>(request, ServiceStageMeta.showApplicationDetail, hcClient);
    }

    /**
     * 根据组件ID获取应用组件信息
     *
     * 通过组件ID获取应用组件信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowComponentDetailRequest 请求对象
     * @return ShowComponentDetailResponse
     */
    public ShowComponentDetailResponse showComponentDetail(ShowComponentDetailRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.showComponentDetail);
    }

    /**
     * 根据组件ID获取应用组件信息
     *
     * 通过组件ID获取应用组件信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowComponentDetailRequest 请求对象
     * @return SyncInvoker<ShowComponentDetailRequest, ShowComponentDetailResponse>
     */
    public SyncInvoker<ShowComponentDetailRequest, ShowComponentDetailResponse> showComponentDetailInvoker(
        ShowComponentDetailRequest request) {
        return new SyncInvoker<>(request, ServiceStageMeta.showComponentDetail, hcClient);
    }

    /**
     * 根据环境ID获取环境详细信息
     *
     * 此API通过环境ID获取环境详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowEnvironmentDetailRequest 请求对象
     * @return ShowEnvironmentDetailResponse
     */
    public ShowEnvironmentDetailResponse showEnvironmentDetail(ShowEnvironmentDetailRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.showEnvironmentDetail);
    }

    /**
     * 根据环境ID获取环境详细信息
     *
     * 此API通过环境ID获取环境详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowEnvironmentDetailRequest 请求对象
     * @return SyncInvoker<ShowEnvironmentDetailRequest, ShowEnvironmentDetailResponse>
     */
    public SyncInvoker<ShowEnvironmentDetailRequest, ShowEnvironmentDetailResponse> showEnvironmentDetailInvoker(
        ShowEnvironmentDetailRequest request) {
        return new SyncInvoker<>(request, ServiceStageMeta.showEnvironmentDetail, hcClient);
    }

    /**
     * 根据实例ID获取实例详细信息
     *
     * 此API通过实例ID获取实例详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceDetailRequest 请求对象
     * @return ShowInstanceDetailResponse
     */
    public ShowInstanceDetailResponse showInstanceDetail(ShowInstanceDetailRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.showInstanceDetail);
    }

    /**
     * 根据实例ID获取实例详细信息
     *
     * 此API通过实例ID获取实例详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceDetailRequest 请求对象
     * @return SyncInvoker<ShowInstanceDetailRequest, ShowInstanceDetailResponse>
     */
    public SyncInvoker<ShowInstanceDetailRequest, ShowInstanceDetailResponse> showInstanceDetailInvoker(
        ShowInstanceDetailRequest request) {
        return new SyncInvoker<>(request, ServiceStageMeta.showInstanceDetail, hcClient);
    }

    /**
     * 获取部署任务详细信息
     *
     * 通过此API获取部署任务详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowJobDetailRequest 请求对象
     * @return ShowJobDetailResponse
     */
    public ShowJobDetailResponse showJobDetail(ShowJobDetailRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.showJobDetail);
    }

    /**
     * 获取部署任务详细信息
     *
     * 通过此API获取部署任务详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowJobDetailRequest 请求对象
     * @return SyncInvoker<ShowJobDetailRequest, ShowJobDetailResponse>
     */
    public SyncInvoker<ShowJobDetailRequest, ShowJobDetailResponse> showJobDetailInvoker(ShowJobDetailRequest request) {
        return new SyncInvoker<>(request, ServiceStageMeta.showJobDetail, hcClient);
    }

    /**
     * 对组件实例的操作
     *
     * 通过此API获取对组件实例的操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInstanceActionRequest 请求对象
     * @return UpdateInstanceActionResponse
     */
    public UpdateInstanceActionResponse updateInstanceAction(UpdateInstanceActionRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.updateInstanceAction);
    }

    /**
     * 对组件实例的操作
     *
     * 通过此API获取对组件实例的操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInstanceActionRequest 请求对象
     * @return SyncInvoker<UpdateInstanceActionRequest, UpdateInstanceActionResponse>
     */
    public SyncInvoker<UpdateInstanceActionRequest, UpdateInstanceActionResponse> updateInstanceActionInvoker(
        UpdateInstanceActionRequest request) {
        return new SyncInvoker<>(request, ServiceStageMeta.updateInstanceAction, hcClient);
    }

    /**
     * 更新模板
     *
     * 更新模板
     *
     * @param request UpdateTemplateRequest 请求对象
     * @return UpdateTemplateResponse
     */
    public UpdateTemplateResponse updateTemplate(UpdateTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.updateTemplate);
    }

    /**
     * 更新模板
     *
     * 更新模板
     *
     * @param request UpdateTemplateRequest 请求对象
     * @return SyncInvoker<UpdateTemplateRequest, UpdateTemplateResponse>
     */
    public SyncInvoker<UpdateTemplateRequest, UpdateTemplateResponse> updateTemplateInvoker(
        UpdateTemplateRequest request) {
        return new SyncInvoker<>(request, ServiceStageMeta.updateTemplate, hcClient);
    }

    /**
     * 创建仓库文件
     *
     * 在指定仓库项目下创建文件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateFileRequest 请求对象
     * @return CreateFileResponse
     */
    public CreateFileResponse createFile(CreateFileRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.createFile);
    }

    /**
     * 创建仓库文件
     *
     * 在指定仓库项目下创建文件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateFileRequest 请求对象
     * @return SyncInvoker<CreateFileRequest, CreateFileResponse>
     */
    public SyncInvoker<CreateFileRequest, CreateFileResponse> createFileInvoker(CreateFileRequest request) {
        return new SyncInvoker<>(request, ServiceStageMeta.createFile, hcClient);
    }

    /**
     * 创建项目hook
     *
     * 创建指定项目的hook。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateHookRequest 请求对象
     * @return CreateHookResponse
     */
    public CreateHookResponse createHook(CreateHookRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.createHook);
    }

    /**
     * 创建项目hook
     *
     * 创建指定项目的hook。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateHookRequest 请求对象
     * @return SyncInvoker<CreateHookRequest, CreateHookResponse>
     */
    public SyncInvoker<CreateHookRequest, CreateHookResponse> createHookInvoker(CreateHookRequest request) {
        return new SyncInvoker<>(request, ServiceStageMeta.createHook, hcClient);
    }

    /**
     * 创建OAuth授权
     *
     * 创建指定Git仓库类型的OAuth授权。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateOAuthRequest 请求对象
     * @return CreateOAuthResponse
     */
    public CreateOAuthResponse createOAuth(CreateOAuthRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.createOAuth);
    }

    /**
     * 创建OAuth授权
     *
     * 创建指定Git仓库类型的OAuth授权。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateOAuthRequest 请求对象
     * @return SyncInvoker<CreateOAuthRequest, CreateOAuthResponse>
     */
    public SyncInvoker<CreateOAuthRequest, CreateOAuthResponse> createOAuthInvoker(CreateOAuthRequest request) {
        return new SyncInvoker<>(request, ServiceStageMeta.createOAuth, hcClient);
    }

    /**
     * 创建口令授权
     *
     * 创建指定Git仓库类型的口令授权。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePasswordAuthRequest 请求对象
     * @return CreatePasswordAuthResponse
     */
    public CreatePasswordAuthResponse createPasswordAuth(CreatePasswordAuthRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.createPasswordAuth);
    }

    /**
     * 创建口令授权
     *
     * 创建指定Git仓库类型的口令授权。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePasswordAuthRequest 请求对象
     * @return SyncInvoker<CreatePasswordAuthRequest, CreatePasswordAuthResponse>
     */
    public SyncInvoker<CreatePasswordAuthRequest, CreatePasswordAuthResponse> createPasswordAuthInvoker(
        CreatePasswordAuthRequest request) {
        return new SyncInvoker<>(request, ServiceStageMeta.createPasswordAuth, hcClient);
    }

    /**
     * 创建私人令牌授权
     *
     * 创建指定Git仓库类型的私人令牌授权。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePersonalAuthRequest 请求对象
     * @return CreatePersonalAuthResponse
     */
    public CreatePersonalAuthResponse createPersonalAuth(CreatePersonalAuthRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.createPersonalAuth);
    }

    /**
     * 创建私人令牌授权
     *
     * 创建指定Git仓库类型的私人令牌授权。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePersonalAuthRequest 请求对象
     * @return SyncInvoker<CreatePersonalAuthRequest, CreatePersonalAuthResponse>
     */
    public SyncInvoker<CreatePersonalAuthRequest, CreatePersonalAuthResponse> createPersonalAuthInvoker(
        CreatePersonalAuthRequest request) {
        return new SyncInvoker<>(request, ServiceStageMeta.createPersonalAuth, hcClient);
    }

    /**
     * 创建软件仓库项目
     *
     * 创建指定组织下的软件仓库项目。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateProjectRequest 请求对象
     * @return CreateProjectResponse
     */
    public CreateProjectResponse createProject(CreateProjectRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.createProject);
    }

    /**
     * 创建软件仓库项目
     *
     * 创建指定组织下的软件仓库项目。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateProjectRequest 请求对象
     * @return SyncInvoker<CreateProjectRequest, CreateProjectResponse>
     */
    public SyncInvoker<CreateProjectRequest, CreateProjectResponse> createProjectInvoker(CreateProjectRequest request) {
        return new SyncInvoker<>(request, ServiceStageMeta.createProject, hcClient);
    }

    /**
     * 创建项目tag标签
     *
     * 创建指定项目的tag标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTagRequest 请求对象
     * @return CreateTagResponse
     */
    public CreateTagResponse createTag(CreateTagRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.createTag);
    }

    /**
     * 创建项目tag标签
     *
     * 创建指定项目的tag标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTagRequest 请求对象
     * @return SyncInvoker<CreateTagRequest, CreateTagResponse>
     */
    public SyncInvoker<CreateTagRequest, CreateTagResponse> createTagInvoker(CreateTagRequest request) {
        return new SyncInvoker<>(request, ServiceStageMeta.createTag, hcClient);
    }

    /**
     * 删除仓库授权
     *
     * 通过名称删除仓库授权。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAuthorizeRequest 请求对象
     * @return DeleteAuthorizeResponse
     */
    public DeleteAuthorizeResponse deleteAuthorize(DeleteAuthorizeRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.deleteAuthorize);
    }

    /**
     * 删除仓库授权
     *
     * 通过名称删除仓库授权。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAuthorizeRequest 请求对象
     * @return SyncInvoker<DeleteAuthorizeRequest, DeleteAuthorizeResponse>
     */
    public SyncInvoker<DeleteAuthorizeRequest, DeleteAuthorizeResponse> deleteAuthorizeInvoker(
        DeleteAuthorizeRequest request) {
        return new SyncInvoker<>(request, ServiceStageMeta.deleteAuthorize, hcClient);
    }

    /**
     * 删除仓库文件
     *
     * 删除指定项目仓库下的文件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteFileRequest 请求对象
     * @return DeleteFileResponse
     */
    public DeleteFileResponse deleteFile(DeleteFileRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.deleteFile);
    }

    /**
     * 删除仓库文件
     *
     * 删除指定项目仓库下的文件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteFileRequest 请求对象
     * @return SyncInvoker<DeleteFileRequest, DeleteFileResponse>
     */
    public SyncInvoker<DeleteFileRequest, DeleteFileResponse> deleteFileInvoker(DeleteFileRequest request) {
        return new SyncInvoker<>(request, ServiceStageMeta.deleteFile, hcClient);
    }

    /**
     * 删除项目hook
     *
     * 删除指定项目的hook。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteHookRequest 请求对象
     * @return DeleteHookResponse
     */
    public DeleteHookResponse deleteHook(DeleteHookRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.deleteHook);
    }

    /**
     * 删除项目hook
     *
     * 删除指定项目的hook。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteHookRequest 请求对象
     * @return SyncInvoker<DeleteHookRequest, DeleteHookResponse>
     */
    public SyncInvoker<DeleteHookRequest, DeleteHookResponse> deleteHookInvoker(DeleteHookRequest request) {
        return new SyncInvoker<>(request, ServiceStageMeta.deleteHook, hcClient);
    }

    /**
     * 删除项目tag标签
     *
     * 删除指定项目的tag标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTagRequest 请求对象
     * @return DeleteTagResponse
     */
    public DeleteTagResponse deleteTag(DeleteTagRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.deleteTag);
    }

    /**
     * 删除项目tag标签
     *
     * 删除指定项目的tag标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTagRequest 请求对象
     * @return SyncInvoker<DeleteTagRequest, DeleteTagResponse>
     */
    public SyncInvoker<DeleteTagRequest, DeleteTagResponse> deleteTagInvoker(DeleteTagRequest request) {
        return new SyncInvoker<>(request, ServiceStageMeta.deleteTag, hcClient);
    }

    /**
     * 获取仓库授权列表
     *
     * 获取所有Git仓库授权信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuthorizationsRequest 请求对象
     * @return ListAuthorizationsResponse
     */
    public ListAuthorizationsResponse listAuthorizations(ListAuthorizationsRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.listAuthorizations);
    }

    /**
     * 获取仓库授权列表
     *
     * 获取所有Git仓库授权信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuthorizationsRequest 请求对象
     * @return SyncInvoker<ListAuthorizationsRequest, ListAuthorizationsResponse>
     */
    public SyncInvoker<ListAuthorizationsRequest, ListAuthorizationsResponse> listAuthorizationsInvoker(
        ListAuthorizationsRequest request) {
        return new SyncInvoker<>(request, ServiceStageMeta.listAuthorizations, hcClient);
    }

    /**
     * 获取项目分支
     *
     * 获取指定项目的所有分支列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBranchesRequest 请求对象
     * @return ListBranchesResponse
     */
    public ListBranchesResponse listBranches(ListBranchesRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.listBranches);
    }

    /**
     * 获取项目分支
     *
     * 获取指定项目的所有分支列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBranchesRequest 请求对象
     * @return SyncInvoker<ListBranchesRequest, ListBranchesResponse>
     */
    public SyncInvoker<ListBranchesRequest, ListBranchesResponse> listBranchesInvoker(ListBranchesRequest request) {
        return new SyncInvoker<>(request, ServiceStageMeta.listBranches, hcClient);
    }

    /**
     * 获取项目commit提交记录
     *
     * 获取指定项目的最近10次commit提交记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCommitsRequest 请求对象
     * @return ListCommitsResponse
     */
    public ListCommitsResponse listCommits(ListCommitsRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.listCommits);
    }

    /**
     * 获取项目commit提交记录
     *
     * 获取指定项目的最近10次commit提交记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCommitsRequest 请求对象
     * @return SyncInvoker<ListCommitsRequest, ListCommitsResponse>
     */
    public SyncInvoker<ListCommitsRequest, ListCommitsResponse> listCommitsInvoker(ListCommitsRequest request) {
        return new SyncInvoker<>(request, ServiceStageMeta.listCommits, hcClient);
    }

    /**
     * 获取项目hooks
     *
     * 获取指定项目的所有hooks
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHooksRequest 请求对象
     * @return ListHooksResponse
     */
    public ListHooksResponse listHooks(ListHooksRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.listHooks);
    }

    /**
     * 获取项目hooks
     *
     * 获取指定项目的所有hooks
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHooksRequest 请求对象
     * @return SyncInvoker<ListHooksRequest, ListHooksResponse>
     */
    public SyncInvoker<ListHooksRequest, ListHooksResponse> listHooksInvoker(ListHooksRequest request) {
        return new SyncInvoker<>(request, ServiceStageMeta.listHooks, hcClient);
    }

    /**
     * 获取仓库的namespaces
     *
     * 获取仓库的namespaces。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListNamespacesRequest 请求对象
     * @return ListNamespacesResponse
     */
    public ListNamespacesResponse listNamespaces(ListNamespacesRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.listNamespaces);
    }

    /**
     * 获取仓库的namespaces
     *
     * 获取仓库的namespaces。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListNamespacesRequest 请求对象
     * @return SyncInvoker<ListNamespacesRequest, ListNamespacesResponse>
     */
    public SyncInvoker<ListNamespacesRequest, ListNamespacesResponse> listNamespacesInvoker(
        ListNamespacesRequest request) {
        return new SyncInvoker<>(request, ServiceStageMeta.listNamespaces, hcClient);
    }

    /**
     * 获取组织下所有项目
     *
     * 获取指定组织下的所有项目。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectsRequest 请求对象
     * @return ListProjectsResponse
     */
    public ListProjectsResponse listProjects(ListProjectsRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.listProjects);
    }

    /**
     * 获取组织下所有项目
     *
     * 获取指定组织下的所有项目。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectsRequest 请求对象
     * @return SyncInvoker<ListProjectsRequest, ListProjectsResponse>
     */
    public SyncInvoker<ListProjectsRequest, ListProjectsResponse> listProjectsInvoker(ListProjectsRequest request) {
        return new SyncInvoker<>(request, ServiceStageMeta.listProjects, hcClient);
    }

    /**
     * 获取项目的所有tag标签
     *
     * 获取指定项目的所有tag标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTagsRequest 请求对象
     * @return ListTagsResponse
     */
    public ListTagsResponse listTags(ListTagsRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.listTags);
    }

    /**
     * 获取项目的所有tag标签
     *
     * 获取指定项目的所有tag标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTagsRequest 请求对象
     * @return SyncInvoker<ListTagsRequest, ListTagsResponse>
     */
    public SyncInvoker<ListTagsRequest, ListTagsResponse> listTagsInvoker(ListTagsRequest request) {
        return new SyncInvoker<>(request, ServiceStageMeta.listTags, hcClient);
    }

    /**
     * 获取仓库文件列表
     *
     * 获取指定项目仓库的文件列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTreesRequest 请求对象
     * @return ListTreesResponse
     */
    public ListTreesResponse listTrees(ListTreesRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.listTrees);
    }

    /**
     * 获取仓库文件列表
     *
     * 获取指定项目仓库的文件列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTreesRequest 请求对象
     * @return SyncInvoker<ListTreesRequest, ListTreesResponse>
     */
    public SyncInvoker<ListTreesRequest, ListTreesResponse> listTreesInvoker(ListTreesRequest request) {
        return new SyncInvoker<>(request, ServiceStageMeta.listTrees, hcClient);
    }

    /**
     * 获取仓库文件内容
     *
     * 获取指定项目仓库下文件的内容。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowContentRequest 请求对象
     * @return ShowContentResponse
     */
    public ShowContentResponse showContent(ShowContentRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.showContent);
    }

    /**
     * 获取仓库文件内容
     *
     * 获取指定项目仓库下文件的内容。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowContentRequest 请求对象
     * @return SyncInvoker<ShowContentRequest, ShowContentResponse>
     */
    public SyncInvoker<ShowContentRequest, ShowContentResponse> showContentInvoker(ShowContentRequest request) {
        return new SyncInvoker<>(request, ServiceStageMeta.showContent, hcClient);
    }

    /**
     * 通过clone url 获取仓库信息
     *
     * 通过指定的clone url 获取仓库信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowProjectDetailRequest 请求对象
     * @return ShowProjectDetailResponse
     */
    public ShowProjectDetailResponse showProjectDetail(ShowProjectDetailRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.showProjectDetail);
    }

    /**
     * 通过clone url 获取仓库信息
     *
     * 通过指定的clone url 获取仓库信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowProjectDetailRequest 请求对象
     * @return SyncInvoker<ShowProjectDetailRequest, ShowProjectDetailResponse>
     */
    public SyncInvoker<ShowProjectDetailRequest, ShowProjectDetailResponse> showProjectDetailInvoker(
        ShowProjectDetailRequest request) {
        return new SyncInvoker<>(request, ServiceStageMeta.showProjectDetail, hcClient);
    }

    /**
     * 获取授权重定向URL
     *
     * 获取指定Git仓库类型的授权重定向URL。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRedirectUrlRequest 请求对象
     * @return ShowRedirectUrlResponse
     */
    public ShowRedirectUrlResponse showRedirectUrl(ShowRedirectUrlRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.showRedirectUrl);
    }

    /**
     * 获取授权重定向URL
     *
     * 获取指定Git仓库类型的授权重定向URL。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRedirectUrlRequest 请求对象
     * @return SyncInvoker<ShowRedirectUrlRequest, ShowRedirectUrlResponse>
     */
    public SyncInvoker<ShowRedirectUrlRequest, ShowRedirectUrlResponse> showRedirectUrlInvoker(
        ShowRedirectUrlRequest request) {
        return new SyncInvoker<>(request, ServiceStageMeta.showRedirectUrl, hcClient);
    }

    /**
     * 更新仓库文件内容
     *
     * 更新指定项目仓库下的文件内容。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateFileRequest 请求对象
     * @return UpdateFileResponse
     */
    public UpdateFileResponse updateFile(UpdateFileRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.updateFile);
    }

    /**
     * 更新仓库文件内容
     *
     * 更新指定项目仓库下的文件内容。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateFileRequest 请求对象
     * @return SyncInvoker<UpdateFileRequest, UpdateFileResponse>
     */
    public SyncInvoker<UpdateFileRequest, UpdateFileResponse> updateFileInvoker(UpdateFileRequest request) {
        return new SyncInvoker<>(request, ServiceStageMeta.updateFile, hcClient);
    }

    /**
     * 获取所有支持的应用资源规格
     *
     * 通过此API获取所用支持的应用资源规格。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFlavorsRequest 请求对象
     * @return ListFlavorsResponse
     */
    public ListFlavorsResponse listFlavors(ListFlavorsRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.listFlavors);
    }

    /**
     * 获取所有支持的应用资源规格
     *
     * 通过此API获取所用支持的应用资源规格。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFlavorsRequest 请求对象
     * @return SyncInvoker<ListFlavorsRequest, ListFlavorsResponse>
     */
    public SyncInvoker<ListFlavorsRequest, ListFlavorsResponse> listFlavorsInvoker(ListFlavorsRequest request) {
        return new SyncInvoker<>(request, ServiceStageMeta.listFlavors, hcClient);
    }

    /**
     * 获取所有支持的应用组件运行时类型
     *
     * 此API用来获取所有支持应用组件运行时类型。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRuntimesRequest 请求对象
     * @return ListRuntimesResponse
     */
    public ListRuntimesResponse listRuntimes(ListRuntimesRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.listRuntimes);
    }

    /**
     * 获取所有支持的应用组件运行时类型
     *
     * 此API用来获取所有支持应用组件运行时类型。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRuntimesRequest 请求对象
     * @return SyncInvoker<ListRuntimesRequest, ListRuntimesResponse>
     */
    public SyncInvoker<ListRuntimesRequest, ListRuntimesResponse> listRuntimesInvoker(ListRuntimesRequest request) {
        return new SyncInvoker<>(request, ServiceStageMeta.listRuntimes, hcClient);
    }

    /**
     * 获取所有支持的应用组件模板
     *
     * 此API用来获取所有内置应用组件模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTemplatesRequest 请求对象
     * @return ListTemplatesResponse
     */
    public ListTemplatesResponse listTemplates(ListTemplatesRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.listTemplates);
    }

    /**
     * 获取所有支持的应用组件模板
     *
     * 此API用来获取所有内置应用组件模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTemplatesRequest 请求对象
     * @return SyncInvoker<ListTemplatesRequest, ListTemplatesResponse>
     */
    public SyncInvoker<ListTemplatesRequest, ListTemplatesResponse> listTemplatesInvoker(ListTemplatesRequest request) {
        return new SyncInvoker<>(request, ServiceStageMeta.listTemplates, hcClient);
    }

}
