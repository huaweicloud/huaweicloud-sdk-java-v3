package com.huaweicloud.sdk.servicestage.v2;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.servicestage.v2.model.*;

public class ServiceStageClient {

    protected HcClient hcClient;

    public ServiceStageClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<ServiceStageClient> newBuilder() {
        return new ClientBuilder<>(ServiceStageClient::new);
    }

    /** 修改应用信息 此API通过应用ID修改应用信息。
     *
     * @param ChangeApplicationRequest 请求对象
     * @return ChangeApplicationResponse */
    public ChangeApplicationResponse changeApplication(ChangeApplicationRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.changeApplication);
    }

    /** 修改应用信息 此API通过应用ID修改应用信息。
     *
     * @param ChangeApplicationRequest 请求对象
     * @return SyncInvoker<ChangeApplicationRequest, ChangeApplicationResponse> */
    public SyncInvoker<ChangeApplicationRequest, ChangeApplicationResponse> changeApplicationInvoker(
        ChangeApplicationRequest request) {
        return new SyncInvoker<ChangeApplicationRequest, ChangeApplicationResponse>(request,
            ServiceStageMeta.changeApplication, hcClient);
    }

    /** 修改应用配置信息 通过此API修改应用配置信息。
     *
     * @param ChangeApplicationConfigurationRequest 请求对象
     * @return ChangeApplicationConfigurationResponse */
    public ChangeApplicationConfigurationResponse changeApplicationConfiguration(
        ChangeApplicationConfigurationRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.changeApplicationConfiguration);
    }

    /** 修改应用配置信息 通过此API修改应用配置信息。
     *
     * @param ChangeApplicationConfigurationRequest 请求对象
     * @return SyncInvoker<ChangeApplicationConfigurationRequest, ChangeApplicationConfigurationResponse> */
    public SyncInvoker<ChangeApplicationConfigurationRequest, ChangeApplicationConfigurationResponse> changeApplicationConfigurationInvoker(
        ChangeApplicationConfigurationRequest request) {
        return new SyncInvoker<ChangeApplicationConfigurationRequest, ChangeApplicationConfigurationResponse>(request,
            ServiceStageMeta.changeApplicationConfiguration, hcClient);
    }

    /** 根据组件ID修改组件信息 此API通过组件ID修改组件信息。
     *
     * @param ChangeComponentRequest 请求对象
     * @return ChangeComponentResponse */
    public ChangeComponentResponse changeComponent(ChangeComponentRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.changeComponent);
    }

    /** 根据组件ID修改组件信息 此API通过组件ID修改组件信息。
     *
     * @param ChangeComponentRequest 请求对象
     * @return SyncInvoker<ChangeComponentRequest, ChangeComponentResponse> */
    public SyncInvoker<ChangeComponentRequest, ChangeComponentResponse> changeComponentInvoker(
        ChangeComponentRequest request) {
        return new SyncInvoker<ChangeComponentRequest, ChangeComponentResponse>(request,
            ServiceStageMeta.changeComponent, hcClient);
    }

    /** 修改环境信息 此API通过环境ID修改环境信息。
     *
     * @param ChangeEnvironmentRequest 请求对象
     * @return ChangeEnvironmentResponse */
    public ChangeEnvironmentResponse changeEnvironment(ChangeEnvironmentRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.changeEnvironment);
    }

    /** 修改环境信息 此API通过环境ID修改环境信息。
     *
     * @param ChangeEnvironmentRequest 请求对象
     * @return SyncInvoker<ChangeEnvironmentRequest, ChangeEnvironmentResponse> */
    public SyncInvoker<ChangeEnvironmentRequest, ChangeEnvironmentResponse> changeEnvironmentInvoker(
        ChangeEnvironmentRequest request) {
        return new SyncInvoker<ChangeEnvironmentRequest, ChangeEnvironmentResponse>(request,
            ServiceStageMeta.changeEnvironment, hcClient);
    }

    /** 修改应用组件实例 通过此API修改应用组件实例。
     *
     * @param ChangeInstanceRequest 请求对象
     * @return ChangeInstanceResponse */
    public ChangeInstanceResponse changeInstance(ChangeInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.changeInstance);
    }

    /** 修改应用组件实例 通过此API修改应用组件实例。
     *
     * @param ChangeInstanceRequest 请求对象
     * @return SyncInvoker<ChangeInstanceRequest, ChangeInstanceResponse> */
    public SyncInvoker<ChangeInstanceRequest, ChangeInstanceResponse> changeInstanceInvoker(
        ChangeInstanceRequest request) {
        return new SyncInvoker<ChangeInstanceRequest, ChangeInstanceResponse>(request, ServiceStageMeta.changeInstance,
            hcClient);
    }

    /** 修改环境资源 此API用来修改环境资源。
     *
     * @param ChangeResourceInEnvironmentRequest 请求对象
     * @return ChangeResourceInEnvironmentResponse */
    public ChangeResourceInEnvironmentResponse changeResourceInEnvironment(ChangeResourceInEnvironmentRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.changeResourceInEnvironment);
    }

    /** 修改环境资源 此API用来修改环境资源。
     *
     * @param ChangeResourceInEnvironmentRequest 请求对象
     * @return SyncInvoker<ChangeResourceInEnvironmentRequest, ChangeResourceInEnvironmentResponse> */
    public SyncInvoker<ChangeResourceInEnvironmentRequest, ChangeResourceInEnvironmentResponse> changeResourceInEnvironmentInvoker(
        ChangeResourceInEnvironmentRequest request) {
        return new SyncInvoker<ChangeResourceInEnvironmentRequest, ChangeResourceInEnvironmentResponse>(request,
            ServiceStageMeta.changeResourceInEnvironment, hcClient);
    }

    /** 创建应用 应用是一个功能相对完备的业务系统，由一个或多个特性相关的组件组成。 此API用来创建应用。
     *
     * @param CreateApplicationRequest 请求对象
     * @return CreateApplicationResponse */
    public CreateApplicationResponse createApplication(CreateApplicationRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.createApplication);
    }

    /** 创建应用 应用是一个功能相对完备的业务系统，由一个或多个特性相关的组件组成。 此API用来创建应用。
     *
     * @param CreateApplicationRequest 请求对象
     * @return SyncInvoker<CreateApplicationRequest, CreateApplicationResponse> */
    public SyncInvoker<CreateApplicationRequest, CreateApplicationResponse> createApplicationInvoker(
        CreateApplicationRequest request) {
        return new SyncInvoker<CreateApplicationRequest, CreateApplicationResponse>(request,
            ServiceStageMeta.createApplication, hcClient);
    }

    /** 应用中创建组件 应用组件是组成应用的某个业务特性实现，以代码或者软件包为载体，可独立部署运行。 此API用来在应用中创建组件。
     *
     * @param CreateComponentRequest 请求对象
     * @return CreateComponentResponse */
    public CreateComponentResponse createComponent(CreateComponentRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.createComponent);
    }

    /** 应用中创建组件 应用组件是组成应用的某个业务特性实现，以代码或者软件包为载体，可独立部署运行。 此API用来在应用中创建组件。
     *
     * @param CreateComponentRequest 请求对象
     * @return SyncInvoker<CreateComponentRequest, CreateComponentResponse> */
    public SyncInvoker<CreateComponentRequest, CreateComponentResponse> createComponentInvoker(
        CreateComponentRequest request) {
        return new SyncInvoker<CreateComponentRequest, CreateComponentResponse>(request,
            ServiceStageMeta.createComponent, hcClient);
    }

    /** 创建环境
     * 环境是用于应用部署和运行的计算、存储、网络等基础设施的集合。Servicestage把相同VPC下的CCE集群加上多个ELB、RDS、DCS实例组合为一个环境，如：开发环境，测试环境，预生产环境，生产环境。环境内网络互通，可以按环境维度来管理资源、部署服务，减少具体基础设施运维管理的复杂性。
     * 此API用来创建环境。
     *
     * @param CreateEnvironmentRequest 请求对象
     * @return CreateEnvironmentResponse */
    public CreateEnvironmentResponse createEnvironment(CreateEnvironmentRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.createEnvironment);
    }

    /** 创建环境
     * 环境是用于应用部署和运行的计算、存储、网络等基础设施的集合。Servicestage把相同VPC下的CCE集群加上多个ELB、RDS、DCS实例组合为一个环境，如：开发环境，测试环境，预生产环境，生产环境。环境内网络互通，可以按环境维度来管理资源、部署服务，减少具体基础设施运维管理的复杂性。
     * 此API用来创建环境。
     *
     * @param CreateEnvironmentRequest 请求对象
     * @return SyncInvoker<CreateEnvironmentRequest, CreateEnvironmentResponse> */
    public SyncInvoker<CreateEnvironmentRequest, CreateEnvironmentResponse> createEnvironmentInvoker(
        CreateEnvironmentRequest request) {
        return new SyncInvoker<CreateEnvironmentRequest, CreateEnvironmentResponse>(request,
            ServiceStageMeta.createEnvironment, hcClient);
    }

    /** 创建组件实例 此API用来创建应用组件实例。
     *
     * @param CreateInstanceRequest 请求对象
     * @return CreateInstanceResponse */
    public CreateInstanceResponse createInstance(CreateInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.createInstance);
    }

    /** 创建组件实例 此API用来创建应用组件实例。
     *
     * @param CreateInstanceRequest 请求对象
     * @return SyncInvoker<CreateInstanceRequest, CreateInstanceResponse> */
    public SyncInvoker<CreateInstanceRequest, CreateInstanceResponse> createInstanceInvoker(
        CreateInstanceRequest request) {
        return new SyncInvoker<CreateInstanceRequest, CreateInstanceResponse>(request, ServiceStageMeta.createInstance,
            hcClient);
    }

    /** 根据应用ID删除应用 此API通过应用ID删除应用。
     *
     * @param DeleteApplicationRequest 请求对象
     * @return DeleteApplicationResponse */
    public DeleteApplicationResponse deleteApplication(DeleteApplicationRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.deleteApplication);
    }

    /** 根据应用ID删除应用 此API通过应用ID删除应用。
     *
     * @param DeleteApplicationRequest 请求对象
     * @return SyncInvoker<DeleteApplicationRequest, DeleteApplicationResponse> */
    public SyncInvoker<DeleteApplicationRequest, DeleteApplicationResponse> deleteApplicationInvoker(
        DeleteApplicationRequest request) {
        return new SyncInvoker<DeleteApplicationRequest, DeleteApplicationResponse>(request,
            ServiceStageMeta.deleteApplication, hcClient);
    }

    /** 删除应用配置 通过此API删除应用配置信息。
     *
     * @param DeleteApplicationConfigurationRequest 请求对象
     * @return DeleteApplicationConfigurationResponse */
    public DeleteApplicationConfigurationResponse deleteApplicationConfiguration(
        DeleteApplicationConfigurationRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.deleteApplicationConfiguration);
    }

    /** 删除应用配置 通过此API删除应用配置信息。
     *
     * @param DeleteApplicationConfigurationRequest 请求对象
     * @return SyncInvoker<DeleteApplicationConfigurationRequest, DeleteApplicationConfigurationResponse> */
    public SyncInvoker<DeleteApplicationConfigurationRequest, DeleteApplicationConfigurationResponse> deleteApplicationConfigurationInvoker(
        DeleteApplicationConfigurationRequest request) {
        return new SyncInvoker<DeleteApplicationConfigurationRequest, DeleteApplicationConfigurationResponse>(request,
            ServiceStageMeta.deleteApplicationConfiguration, hcClient);
    }

    /** 根据应用组件ID删除应用组件 此API通过应用组件ID删除应用组件。
     *
     * @param DeleteComponentRequest 请求对象
     * @return DeleteComponentResponse */
    public DeleteComponentResponse deleteComponent(DeleteComponentRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.deleteComponent);
    }

    /** 根据应用组件ID删除应用组件 此API通过应用组件ID删除应用组件。
     *
     * @param DeleteComponentRequest 请求对象
     * @return SyncInvoker<DeleteComponentRequest, DeleteComponentResponse> */
    public SyncInvoker<DeleteComponentRequest, DeleteComponentResponse> deleteComponentInvoker(
        DeleteComponentRequest request) {
        return new SyncInvoker<DeleteComponentRequest, DeleteComponentResponse>(request,
            ServiceStageMeta.deleteComponent, hcClient);
    }

    /** 根据环境ID删除环境 此API通过环境ID删除环境。
     *
     * @param DeleteEnvironmentRequest 请求对象
     * @return DeleteEnvironmentResponse */
    public DeleteEnvironmentResponse deleteEnvironment(DeleteEnvironmentRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.deleteEnvironment);
    }

    /** 根据环境ID删除环境 此API通过环境ID删除环境。
     *
     * @param DeleteEnvironmentRequest 请求对象
     * @return SyncInvoker<DeleteEnvironmentRequest, DeleteEnvironmentResponse> */
    public SyncInvoker<DeleteEnvironmentRequest, DeleteEnvironmentResponse> deleteEnvironmentInvoker(
        DeleteEnvironmentRequest request) {
        return new SyncInvoker<DeleteEnvironmentRequest, DeleteEnvironmentResponse>(request,
            ServiceStageMeta.deleteEnvironment, hcClient);
    }

    /** 删除应用组件实例 通过此API删除应用组件实例。
     *
     * @param DeleteInstanceRequest 请求对象
     * @return DeleteInstanceResponse */
    public DeleteInstanceResponse deleteInstance(DeleteInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.deleteInstance);
    }

    /** 删除应用组件实例 通过此API删除应用组件实例。
     *
     * @param DeleteInstanceRequest 请求对象
     * @return SyncInvoker<DeleteInstanceRequest, DeleteInstanceResponse> */
    public SyncInvoker<DeleteInstanceRequest, DeleteInstanceResponse> deleteInstanceInvoker(
        DeleteInstanceRequest request) {
        return new SyncInvoker<DeleteInstanceRequest, DeleteInstanceResponse>(request, ServiceStageMeta.deleteInstance,
            hcClient);
    }

    /** 获取所有应用 通过此API可以获取所有已经创建的应用。
     *
     * @param ListApplicationsRequest 请求对象
     * @return ListApplicationsResponse */
    public ListApplicationsResponse listApplications(ListApplicationsRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.listApplications);
    }

    /** 获取所有应用 通过此API可以获取所有已经创建的应用。
     *
     * @param ListApplicationsRequest 请求对象
     * @return SyncInvoker<ListApplicationsRequest, ListApplicationsResponse> */
    public SyncInvoker<ListApplicationsRequest, ListApplicationsResponse> listApplicationsInvoker(
        ListApplicationsRequest request) {
        return new SyncInvoker<ListApplicationsRequest, ListApplicationsResponse>(request,
            ServiceStageMeta.listApplications, hcClient);
    }

    /** 获取应用所有组件 通过此API获取应用下所有应用组件。
     *
     * @param ListComponentsRequest 请求对象
     * @return ListComponentsResponse */
    public ListComponentsResponse listComponents(ListComponentsRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.listComponents);
    }

    /** 获取应用所有组件 通过此API获取应用下所有应用组件。
     *
     * @param ListComponentsRequest 请求对象
     * @return SyncInvoker<ListComponentsRequest, ListComponentsResponse> */
    public SyncInvoker<ListComponentsRequest, ListComponentsResponse> listComponentsInvoker(
        ListComponentsRequest request) {
        return new SyncInvoker<ListComponentsRequest, ListComponentsResponse>(request, ServiceStageMeta.listComponents,
            hcClient);
    }

    /** 获取所有环境 此API用来获取所有已经创建环境。
     *
     * @param ListEnvironmentsRequest 请求对象
     * @return ListEnvironmentsResponse */
    public ListEnvironmentsResponse listEnvironments(ListEnvironmentsRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.listEnvironments);
    }

    /** 获取所有环境 此API用来获取所有已经创建环境。
     *
     * @param ListEnvironmentsRequest 请求对象
     * @return SyncInvoker<ListEnvironmentsRequest, ListEnvironmentsResponse> */
    public SyncInvoker<ListEnvironmentsRequest, ListEnvironmentsResponse> listEnvironmentsInvoker(
        ListEnvironmentsRequest request) {
        return new SyncInvoker<ListEnvironmentsRequest, ListEnvironmentsResponse>(request,
            ServiceStageMeta.listEnvironments, hcClient);
    }

    /** 获取组件实例快照 通过此API获取应用组件实例快照信息。
     *
     * @param ListInstanceSnapshotsRequest 请求对象
     * @return ListInstanceSnapshotsResponse */
    public ListInstanceSnapshotsResponse listInstanceSnapshots(ListInstanceSnapshotsRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.listInstanceSnapshots);
    }

    /** 获取组件实例快照 通过此API获取应用组件实例快照信息。
     *
     * @param ListInstanceSnapshotsRequest 请求对象
     * @return SyncInvoker<ListInstanceSnapshotsRequest, ListInstanceSnapshotsResponse> */
    public SyncInvoker<ListInstanceSnapshotsRequest, ListInstanceSnapshotsResponse> listInstanceSnapshotsInvoker(
        ListInstanceSnapshotsRequest request) {
        return new SyncInvoker<ListInstanceSnapshotsRequest, ListInstanceSnapshotsResponse>(request,
            ServiceStageMeta.listInstanceSnapshots, hcClient);
    }

    /** 获取应用组件实例 通过此API获取组件下的所有组件实例。
     *
     * @param ListInstancesRequest 请求对象
     * @return ListInstancesResponse */
    public ListInstancesResponse listInstances(ListInstancesRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.listInstances);
    }

    /** 获取应用组件实例 通过此API获取组件下的所有组件实例。
     *
     * @param ListInstancesRequest 请求对象
     * @return SyncInvoker<ListInstancesRequest, ListInstancesResponse> */
    public SyncInvoker<ListInstancesRequest, ListInstancesResponse> listInstancesInvoker(ListInstancesRequest request) {
        return new SyncInvoker<ListInstancesRequest, ListInstancesResponse>(request, ServiceStageMeta.listInstances,
            hcClient);
    }

    /** 获取应用配置 通过此API获取应用配置信息。
     *
     * @param ShowApplicationConfigurationRequest 请求对象
     * @return ShowApplicationConfigurationResponse */
    public ShowApplicationConfigurationResponse showApplicationConfiguration(
        ShowApplicationConfigurationRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.showApplicationConfiguration);
    }

    /** 获取应用配置 通过此API获取应用配置信息。
     *
     * @param ShowApplicationConfigurationRequest 请求对象
     * @return SyncInvoker<ShowApplicationConfigurationRequest, ShowApplicationConfigurationResponse> */
    public SyncInvoker<ShowApplicationConfigurationRequest, ShowApplicationConfigurationResponse> showApplicationConfigurationInvoker(
        ShowApplicationConfigurationRequest request) {
        return new SyncInvoker<ShowApplicationConfigurationRequest, ShowApplicationConfigurationResponse>(request,
            ServiceStageMeta.showApplicationConfiguration, hcClient);
    }

    /** 根据应用ID获取应用详细信息 此API通过应用ID获取应用详细信息。
     *
     * @param ShowApplicationDetailRequest 请求对象
     * @return ShowApplicationDetailResponse */
    public ShowApplicationDetailResponse showApplicationDetail(ShowApplicationDetailRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.showApplicationDetail);
    }

    /** 根据应用ID获取应用详细信息 此API通过应用ID获取应用详细信息。
     *
     * @param ShowApplicationDetailRequest 请求对象
     * @return SyncInvoker<ShowApplicationDetailRequest, ShowApplicationDetailResponse> */
    public SyncInvoker<ShowApplicationDetailRequest, ShowApplicationDetailResponse> showApplicationDetailInvoker(
        ShowApplicationDetailRequest request) {
        return new SyncInvoker<ShowApplicationDetailRequest, ShowApplicationDetailResponse>(request,
            ServiceStageMeta.showApplicationDetail, hcClient);
    }

    /** 根据组件ID获取应用组件信息 通过组件ID获取应用组件信息。
     *
     * @param ShowComponentDetailRequest 请求对象
     * @return ShowComponentDetailResponse */
    public ShowComponentDetailResponse showComponentDetail(ShowComponentDetailRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.showComponentDetail);
    }

    /** 根据组件ID获取应用组件信息 通过组件ID获取应用组件信息。
     *
     * @param ShowComponentDetailRequest 请求对象
     * @return SyncInvoker<ShowComponentDetailRequest, ShowComponentDetailResponse> */
    public SyncInvoker<ShowComponentDetailRequest, ShowComponentDetailResponse> showComponentDetailInvoker(
        ShowComponentDetailRequest request) {
        return new SyncInvoker<ShowComponentDetailRequest, ShowComponentDetailResponse>(request,
            ServiceStageMeta.showComponentDetail, hcClient);
    }

    /** 根据环境ID获取环境详细信息 此API通过环境ID获取环境详细信息。
     *
     * @param ShowEnvironmentDetailRequest 请求对象
     * @return ShowEnvironmentDetailResponse */
    public ShowEnvironmentDetailResponse showEnvironmentDetail(ShowEnvironmentDetailRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.showEnvironmentDetail);
    }

    /** 根据环境ID获取环境详细信息 此API通过环境ID获取环境详细信息。
     *
     * @param ShowEnvironmentDetailRequest 请求对象
     * @return SyncInvoker<ShowEnvironmentDetailRequest, ShowEnvironmentDetailResponse> */
    public SyncInvoker<ShowEnvironmentDetailRequest, ShowEnvironmentDetailResponse> showEnvironmentDetailInvoker(
        ShowEnvironmentDetailRequest request) {
        return new SyncInvoker<ShowEnvironmentDetailRequest, ShowEnvironmentDetailResponse>(request,
            ServiceStageMeta.showEnvironmentDetail, hcClient);
    }

    /** 根据实例ID获取实例详细信息 此API通过实例ID获取实例详细信息。
     *
     * @param ShowInstanceDetailRequest 请求对象
     * @return ShowInstanceDetailResponse */
    public ShowInstanceDetailResponse showInstanceDetail(ShowInstanceDetailRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.showInstanceDetail);
    }

    /** 根据实例ID获取实例详细信息 此API通过实例ID获取实例详细信息。
     *
     * @param ShowInstanceDetailRequest 请求对象
     * @return SyncInvoker<ShowInstanceDetailRequest, ShowInstanceDetailResponse> */
    public SyncInvoker<ShowInstanceDetailRequest, ShowInstanceDetailResponse> showInstanceDetailInvoker(
        ShowInstanceDetailRequest request) {
        return new SyncInvoker<ShowInstanceDetailRequest, ShowInstanceDetailResponse>(request,
            ServiceStageMeta.showInstanceDetail, hcClient);
    }

    /** 获取部署任务详细信息 通过此API获取部署任务详细信息。
     *
     * @param ShowJobDetailRequest 请求对象
     * @return ShowJobDetailResponse */
    public ShowJobDetailResponse showJobDetail(ShowJobDetailRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.showJobDetail);
    }

    /** 获取部署任务详细信息 通过此API获取部署任务详细信息。
     *
     * @param ShowJobDetailRequest 请求对象
     * @return SyncInvoker<ShowJobDetailRequest, ShowJobDetailResponse> */
    public SyncInvoker<ShowJobDetailRequest, ShowJobDetailResponse> showJobDetailInvoker(ShowJobDetailRequest request) {
        return new SyncInvoker<ShowJobDetailRequest, ShowJobDetailResponse>(request, ServiceStageMeta.showJobDetail,
            hcClient);
    }

    /** 对组件实例的操作 通过此API获取对组件实例的操作。
     *
     * @param UpdateInstanceActionRequest 请求对象
     * @return UpdateInstanceActionResponse */
    public UpdateInstanceActionResponse updateInstanceAction(UpdateInstanceActionRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.updateInstanceAction);
    }

    /** 对组件实例的操作 通过此API获取对组件实例的操作。
     *
     * @param UpdateInstanceActionRequest 请求对象
     * @return SyncInvoker<UpdateInstanceActionRequest, UpdateInstanceActionResponse> */
    public SyncInvoker<UpdateInstanceActionRequest, UpdateInstanceActionResponse> updateInstanceActionInvoker(
        UpdateInstanceActionRequest request) {
        return new SyncInvoker<UpdateInstanceActionRequest, UpdateInstanceActionResponse>(request,
            ServiceStageMeta.updateInstanceAction, hcClient);
    }

    /** 创建仓库文件 在指定仓库项目下创建文件。
     *
     * @param CreateFileRequest 请求对象
     * @return CreateFileResponse */
    public CreateFileResponse createFile(CreateFileRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.createFile);
    }

    /** 创建仓库文件 在指定仓库项目下创建文件。
     *
     * @param CreateFileRequest 请求对象
     * @return SyncInvoker<CreateFileRequest, CreateFileResponse> */
    public SyncInvoker<CreateFileRequest, CreateFileResponse> createFileInvoker(CreateFileRequest request) {
        return new SyncInvoker<CreateFileRequest, CreateFileResponse>(request, ServiceStageMeta.createFile, hcClient);
    }

    /** 创建项目hook 创建指定项目的hook。
     *
     * @param CreateHookRequest 请求对象
     * @return CreateHookResponse */
    public CreateHookResponse createHook(CreateHookRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.createHook);
    }

    /** 创建项目hook 创建指定项目的hook。
     *
     * @param CreateHookRequest 请求对象
     * @return SyncInvoker<CreateHookRequest, CreateHookResponse> */
    public SyncInvoker<CreateHookRequest, CreateHookResponse> createHookInvoker(CreateHookRequest request) {
        return new SyncInvoker<CreateHookRequest, CreateHookResponse>(request, ServiceStageMeta.createHook, hcClient);
    }

    /** 创建OAuth授权 创建指定Git仓库类型的OAuth授权。
     *
     * @param CreateOAuthRequest 请求对象
     * @return CreateOAuthResponse */
    public CreateOAuthResponse createOAuth(CreateOAuthRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.createOAuth);
    }

    /** 创建OAuth授权 创建指定Git仓库类型的OAuth授权。
     *
     * @param CreateOAuthRequest 请求对象
     * @return SyncInvoker<CreateOAuthRequest, CreateOAuthResponse> */
    public SyncInvoker<CreateOAuthRequest, CreateOAuthResponse> createOAuthInvoker(CreateOAuthRequest request) {
        return new SyncInvoker<CreateOAuthRequest, CreateOAuthResponse>(request, ServiceStageMeta.createOAuth,
            hcClient);
    }

    /** 创建口令授权 创建指定Git仓库类型的口令授权。
     *
     * @param CreatePasswordAuthRequest 请求对象
     * @return CreatePasswordAuthResponse */
    public CreatePasswordAuthResponse createPasswordAuth(CreatePasswordAuthRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.createPasswordAuth);
    }

    /** 创建口令授权 创建指定Git仓库类型的口令授权。
     *
     * @param CreatePasswordAuthRequest 请求对象
     * @return SyncInvoker<CreatePasswordAuthRequest, CreatePasswordAuthResponse> */
    public SyncInvoker<CreatePasswordAuthRequest, CreatePasswordAuthResponse> createPasswordAuthInvoker(
        CreatePasswordAuthRequest request) {
        return new SyncInvoker<CreatePasswordAuthRequest, CreatePasswordAuthResponse>(request,
            ServiceStageMeta.createPasswordAuth, hcClient);
    }

    /** 创建私人令牌授权 创建指定Git仓库类型的私人令牌授权。
     *
     * @param CreatePersonalAuthRequest 请求对象
     * @return CreatePersonalAuthResponse */
    public CreatePersonalAuthResponse createPersonalAuth(CreatePersonalAuthRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.createPersonalAuth);
    }

    /** 创建私人令牌授权 创建指定Git仓库类型的私人令牌授权。
     *
     * @param CreatePersonalAuthRequest 请求对象
     * @return SyncInvoker<CreatePersonalAuthRequest, CreatePersonalAuthResponse> */
    public SyncInvoker<CreatePersonalAuthRequest, CreatePersonalAuthResponse> createPersonalAuthInvoker(
        CreatePersonalAuthRequest request) {
        return new SyncInvoker<CreatePersonalAuthRequest, CreatePersonalAuthResponse>(request,
            ServiceStageMeta.createPersonalAuth, hcClient);
    }

    /** 创建软件仓库项目 创建指定组织下的软件仓库项目。
     *
     * @param CreateProjectRequest 请求对象
     * @return CreateProjectResponse */
    public CreateProjectResponse createProject(CreateProjectRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.createProject);
    }

    /** 创建软件仓库项目 创建指定组织下的软件仓库项目。
     *
     * @param CreateProjectRequest 请求对象
     * @return SyncInvoker<CreateProjectRequest, CreateProjectResponse> */
    public SyncInvoker<CreateProjectRequest, CreateProjectResponse> createProjectInvoker(CreateProjectRequest request) {
        return new SyncInvoker<CreateProjectRequest, CreateProjectResponse>(request, ServiceStageMeta.createProject,
            hcClient);
    }

    /** 创建项目tag标签 创建指定项目的tag标签。
     *
     * @param CreateTagRequest 请求对象
     * @return CreateTagResponse */
    public CreateTagResponse createTag(CreateTagRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.createTag);
    }

    /** 创建项目tag标签 创建指定项目的tag标签。
     *
     * @param CreateTagRequest 请求对象
     * @return SyncInvoker<CreateTagRequest, CreateTagResponse> */
    public SyncInvoker<CreateTagRequest, CreateTagResponse> createTagInvoker(CreateTagRequest request) {
        return new SyncInvoker<CreateTagRequest, CreateTagResponse>(request, ServiceStageMeta.createTag, hcClient);
    }

    /** 删除仓库授权 通过名称删除仓库授权。
     *
     * @param DeleteAuthorizeRequest 请求对象
     * @return DeleteAuthorizeResponse */
    public DeleteAuthorizeResponse deleteAuthorize(DeleteAuthorizeRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.deleteAuthorize);
    }

    /** 删除仓库授权 通过名称删除仓库授权。
     *
     * @param DeleteAuthorizeRequest 请求对象
     * @return SyncInvoker<DeleteAuthorizeRequest, DeleteAuthorizeResponse> */
    public SyncInvoker<DeleteAuthorizeRequest, DeleteAuthorizeResponse> deleteAuthorizeInvoker(
        DeleteAuthorizeRequest request) {
        return new SyncInvoker<DeleteAuthorizeRequest, DeleteAuthorizeResponse>(request,
            ServiceStageMeta.deleteAuthorize, hcClient);
    }

    /** 删除仓库文件 删除指定项目仓库下的文件。
     *
     * @param DeleteFileRequest 请求对象
     * @return DeleteFileResponse */
    public DeleteFileResponse deleteFile(DeleteFileRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.deleteFile);
    }

    /** 删除仓库文件 删除指定项目仓库下的文件。
     *
     * @param DeleteFileRequest 请求对象
     * @return SyncInvoker<DeleteFileRequest, DeleteFileResponse> */
    public SyncInvoker<DeleteFileRequest, DeleteFileResponse> deleteFileInvoker(DeleteFileRequest request) {
        return new SyncInvoker<DeleteFileRequest, DeleteFileResponse>(request, ServiceStageMeta.deleteFile, hcClient);
    }

    /** 删除项目hook 删除指定项目的hook。
     *
     * @param DeleteHookRequest 请求对象
     * @return DeleteHookResponse */
    public DeleteHookResponse deleteHook(DeleteHookRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.deleteHook);
    }

    /** 删除项目hook 删除指定项目的hook。
     *
     * @param DeleteHookRequest 请求对象
     * @return SyncInvoker<DeleteHookRequest, DeleteHookResponse> */
    public SyncInvoker<DeleteHookRequest, DeleteHookResponse> deleteHookInvoker(DeleteHookRequest request) {
        return new SyncInvoker<DeleteHookRequest, DeleteHookResponse>(request, ServiceStageMeta.deleteHook, hcClient);
    }

    /** 删除项目tag标签 删除指定项目的tag标签。
     *
     * @param DeleteTagRequest 请求对象
     * @return DeleteTagResponse */
    public DeleteTagResponse deleteTag(DeleteTagRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.deleteTag);
    }

    /** 删除项目tag标签 删除指定项目的tag标签。
     *
     * @param DeleteTagRequest 请求对象
     * @return SyncInvoker<DeleteTagRequest, DeleteTagResponse> */
    public SyncInvoker<DeleteTagRequest, DeleteTagResponse> deleteTagInvoker(DeleteTagRequest request) {
        return new SyncInvoker<DeleteTagRequest, DeleteTagResponse>(request, ServiceStageMeta.deleteTag, hcClient);
    }

    /** 获取仓库授权列表 获取所有Git仓库授权信息。
     *
     * @param ListAuthorizationsRequest 请求对象
     * @return ListAuthorizationsResponse */
    public ListAuthorizationsResponse listAuthorizations(ListAuthorizationsRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.listAuthorizations);
    }

    /** 获取仓库授权列表 获取所有Git仓库授权信息。
     *
     * @param ListAuthorizationsRequest 请求对象
     * @return SyncInvoker<ListAuthorizationsRequest, ListAuthorizationsResponse> */
    public SyncInvoker<ListAuthorizationsRequest, ListAuthorizationsResponse> listAuthorizationsInvoker(
        ListAuthorizationsRequest request) {
        return new SyncInvoker<ListAuthorizationsRequest, ListAuthorizationsResponse>(request,
            ServiceStageMeta.listAuthorizations, hcClient);
    }

    /** 获取项目分支 获取指定项目的所有分支列表。
     *
     * @param ListBranchesRequest 请求对象
     * @return ListBranchesResponse */
    public ListBranchesResponse listBranches(ListBranchesRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.listBranches);
    }

    /** 获取项目分支 获取指定项目的所有分支列表。
     *
     * @param ListBranchesRequest 请求对象
     * @return SyncInvoker<ListBranchesRequest, ListBranchesResponse> */
    public SyncInvoker<ListBranchesRequest, ListBranchesResponse> listBranchesInvoker(ListBranchesRequest request) {
        return new SyncInvoker<ListBranchesRequest, ListBranchesResponse>(request, ServiceStageMeta.listBranches,
            hcClient);
    }

    /** 获取项目commit提交记录 获取指定项目的最近10次commit提交记录。
     *
     * @param ListCommitsRequest 请求对象
     * @return ListCommitsResponse */
    public ListCommitsResponse listCommits(ListCommitsRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.listCommits);
    }

    /** 获取项目commit提交记录 获取指定项目的最近10次commit提交记录。
     *
     * @param ListCommitsRequest 请求对象
     * @return SyncInvoker<ListCommitsRequest, ListCommitsResponse> */
    public SyncInvoker<ListCommitsRequest, ListCommitsResponse> listCommitsInvoker(ListCommitsRequest request) {
        return new SyncInvoker<ListCommitsRequest, ListCommitsResponse>(request, ServiceStageMeta.listCommits,
            hcClient);
    }

    /** 获取项目hooks 获取指定项目的所有hooks
     *
     * @param ListHooksRequest 请求对象
     * @return ListHooksResponse */
    public ListHooksResponse listHooks(ListHooksRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.listHooks);
    }

    /** 获取项目hooks 获取指定项目的所有hooks
     *
     * @param ListHooksRequest 请求对象
     * @return SyncInvoker<ListHooksRequest, ListHooksResponse> */
    public SyncInvoker<ListHooksRequest, ListHooksResponse> listHooksInvoker(ListHooksRequest request) {
        return new SyncInvoker<ListHooksRequest, ListHooksResponse>(request, ServiceStageMeta.listHooks, hcClient);
    }

    /** 获取仓库的namespaces 获取仓库的namespaces。
     *
     * @param ListNamespacesRequest 请求对象
     * @return ListNamespacesResponse */
    public ListNamespacesResponse listNamespaces(ListNamespacesRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.listNamespaces);
    }

    /** 获取仓库的namespaces 获取仓库的namespaces。
     *
     * @param ListNamespacesRequest 请求对象
     * @return SyncInvoker<ListNamespacesRequest, ListNamespacesResponse> */
    public SyncInvoker<ListNamespacesRequest, ListNamespacesResponse> listNamespacesInvoker(
        ListNamespacesRequest request) {
        return new SyncInvoker<ListNamespacesRequest, ListNamespacesResponse>(request, ServiceStageMeta.listNamespaces,
            hcClient);
    }

    /** 获取组织下所有项目 获取指定组织下的所有项目。
     *
     * @param ListProjectsRequest 请求对象
     * @return ListProjectsResponse */
    public ListProjectsResponse listProjects(ListProjectsRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.listProjects);
    }

    /** 获取组织下所有项目 获取指定组织下的所有项目。
     *
     * @param ListProjectsRequest 请求对象
     * @return SyncInvoker<ListProjectsRequest, ListProjectsResponse> */
    public SyncInvoker<ListProjectsRequest, ListProjectsResponse> listProjectsInvoker(ListProjectsRequest request) {
        return new SyncInvoker<ListProjectsRequest, ListProjectsResponse>(request, ServiceStageMeta.listProjects,
            hcClient);
    }

    /** 获取项目的所有tag标签 获取指定项目的所有tag标签。
     *
     * @param ListTagsRequest 请求对象
     * @return ListTagsResponse */
    public ListTagsResponse listTags(ListTagsRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.listTags);
    }

    /** 获取项目的所有tag标签 获取指定项目的所有tag标签。
     *
     * @param ListTagsRequest 请求对象
     * @return SyncInvoker<ListTagsRequest, ListTagsResponse> */
    public SyncInvoker<ListTagsRequest, ListTagsResponse> listTagsInvoker(ListTagsRequest request) {
        return new SyncInvoker<ListTagsRequest, ListTagsResponse>(request, ServiceStageMeta.listTags, hcClient);
    }

    /** 获取仓库文件列表 获取指定项目仓库的文件列表。
     *
     * @param ListTreesRequest 请求对象
     * @return ListTreesResponse */
    public ListTreesResponse listTrees(ListTreesRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.listTrees);
    }

    /** 获取仓库文件列表 获取指定项目仓库的文件列表。
     *
     * @param ListTreesRequest 请求对象
     * @return SyncInvoker<ListTreesRequest, ListTreesResponse> */
    public SyncInvoker<ListTreesRequest, ListTreesResponse> listTreesInvoker(ListTreesRequest request) {
        return new SyncInvoker<ListTreesRequest, ListTreesResponse>(request, ServiceStageMeta.listTrees, hcClient);
    }

    /** 获取仓库文件内容 获取指定项目仓库下文件的内容。
     *
     * @param ShowContentRequest 请求对象
     * @return ShowContentResponse */
    public ShowContentResponse showContent(ShowContentRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.showContent);
    }

    /** 获取仓库文件内容 获取指定项目仓库下文件的内容。
     *
     * @param ShowContentRequest 请求对象
     * @return SyncInvoker<ShowContentRequest, ShowContentResponse> */
    public SyncInvoker<ShowContentRequest, ShowContentResponse> showContentInvoker(ShowContentRequest request) {
        return new SyncInvoker<ShowContentRequest, ShowContentResponse>(request, ServiceStageMeta.showContent,
            hcClient);
    }

    /** 通过clone url 获取仓库信息 通过指定的clone url 获取仓库信息。
     *
     * @param ShowProjectDetailRequest 请求对象
     * @return ShowProjectDetailResponse */
    public ShowProjectDetailResponse showProjectDetail(ShowProjectDetailRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.showProjectDetail);
    }

    /** 通过clone url 获取仓库信息 通过指定的clone url 获取仓库信息。
     *
     * @param ShowProjectDetailRequest 请求对象
     * @return SyncInvoker<ShowProjectDetailRequest, ShowProjectDetailResponse> */
    public SyncInvoker<ShowProjectDetailRequest, ShowProjectDetailResponse> showProjectDetailInvoker(
        ShowProjectDetailRequest request) {
        return new SyncInvoker<ShowProjectDetailRequest, ShowProjectDetailResponse>(request,
            ServiceStageMeta.showProjectDetail, hcClient);
    }

    /** 获取授权重定向URL 获取指定Git仓库类型的授权重定向URL。
     *
     * @param ShowRedirectUrlRequest 请求对象
     * @return ShowRedirectUrlResponse */
    public ShowRedirectUrlResponse showRedirectUrl(ShowRedirectUrlRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.showRedirectUrl);
    }

    /** 获取授权重定向URL 获取指定Git仓库类型的授权重定向URL。
     *
     * @param ShowRedirectUrlRequest 请求对象
     * @return SyncInvoker<ShowRedirectUrlRequest, ShowRedirectUrlResponse> */
    public SyncInvoker<ShowRedirectUrlRequest, ShowRedirectUrlResponse> showRedirectUrlInvoker(
        ShowRedirectUrlRequest request) {
        return new SyncInvoker<ShowRedirectUrlRequest, ShowRedirectUrlResponse>(request,
            ServiceStageMeta.showRedirectUrl, hcClient);
    }

    /** 更新仓库文件内容 更新指定项目仓库下的文件内容。
     *
     * @param UpdateFileRequest 请求对象
     * @return UpdateFileResponse */
    public UpdateFileResponse updateFile(UpdateFileRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.updateFile);
    }

    /** 更新仓库文件内容 更新指定项目仓库下的文件内容。
     *
     * @param UpdateFileRequest 请求对象
     * @return SyncInvoker<UpdateFileRequest, UpdateFileResponse> */
    public SyncInvoker<UpdateFileRequest, UpdateFileResponse> updateFileInvoker(UpdateFileRequest request) {
        return new SyncInvoker<UpdateFileRequest, UpdateFileResponse>(request, ServiceStageMeta.updateFile, hcClient);
    }

    /** 获取所有支持的应用资源规格 通过此API获取所用支持的应用资源规格。
     *
     * @param ListFlavorsRequest 请求对象
     * @return ListFlavorsResponse */
    public ListFlavorsResponse listFlavors(ListFlavorsRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.listFlavors);
    }

    /** 获取所有支持的应用资源规格 通过此API获取所用支持的应用资源规格。
     *
     * @param ListFlavorsRequest 请求对象
     * @return SyncInvoker<ListFlavorsRequest, ListFlavorsResponse> */
    public SyncInvoker<ListFlavorsRequest, ListFlavorsResponse> listFlavorsInvoker(ListFlavorsRequest request) {
        return new SyncInvoker<ListFlavorsRequest, ListFlavorsResponse>(request, ServiceStageMeta.listFlavors,
            hcClient);
    }

    /** 获取所有支持的应用组件运行时类型 此API用来获取所有支持应用组件运行时类型。
     *
     * @param ListRuntimesRequest 请求对象
     * @return ListRuntimesResponse */
    public ListRuntimesResponse listRuntimes(ListRuntimesRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.listRuntimes);
    }

    /** 获取所有支持的应用组件运行时类型 此API用来获取所有支持应用组件运行时类型。
     *
     * @param ListRuntimesRequest 请求对象
     * @return SyncInvoker<ListRuntimesRequest, ListRuntimesResponse> */
    public SyncInvoker<ListRuntimesRequest, ListRuntimesResponse> listRuntimesInvoker(ListRuntimesRequest request) {
        return new SyncInvoker<ListRuntimesRequest, ListRuntimesResponse>(request, ServiceStageMeta.listRuntimes,
            hcClient);
    }

    /** 获取所有支持的应用组件模板 此API用来获取所有内置应用组件模板。
     *
     * @param ListTemplatesRequest 请求对象
     * @return ListTemplatesResponse */
    public ListTemplatesResponse listTemplates(ListTemplatesRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.listTemplates);
    }

    /** 获取所有支持的应用组件模板 此API用来获取所有内置应用组件模板。
     *
     * @param ListTemplatesRequest 请求对象
     * @return SyncInvoker<ListTemplatesRequest, ListTemplatesResponse> */
    public SyncInvoker<ListTemplatesRequest, ListTemplatesResponse> listTemplatesInvoker(ListTemplatesRequest request) {
        return new SyncInvoker<ListTemplatesRequest, ListTemplatesResponse>(request, ServiceStageMeta.listTemplates,
            hcClient);
    }

}
