package com.huaweicloud.sdk.servicestage.v2;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.servicestage.v2.model.*;

public class ServiceStageAsyncClient {
    protected HcClient hcClient;

    public ServiceStageAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<ServiceStageAsyncClient> newBuilder() {
        return new ClientBuilder<>(ServiceStageAsyncClient::new);
    }


    /**
     * 修改应用信息
     * 此API通过应用ID修改应用信息。
     *
     * @param ChangeApplicationRequest 请求对象
     * @return CompletableFuture<ChangeApplicationResponse>
     */
    public CompletableFuture<ChangeApplicationResponse> changeApplicationAsync(ChangeApplicationRequest request) {
        return hcClient.asyncInvokeHttp(request, ServiceStageMeta.changeApplication);
    }

    /**
     * 修改应用信息
     * 此API通过应用ID修改应用信息。
     *
     * @param ChangeApplicationRequest 请求对象
     * @return AsyncInvoker<ChangeApplicationRequest, ChangeApplicationResponse>
     */
    public AsyncInvoker<ChangeApplicationRequest, ChangeApplicationResponse> changeApplicationAsyncInvoker(ChangeApplicationRequest request) {
        return new AsyncInvoker<ChangeApplicationRequest, ChangeApplicationResponse>(request, ServiceStageMeta.changeApplication, hcClient);
    }

    /**
     * 修改应用配置信息
     * 通过此API修改应用配置信息。
     *
     * @param ChangeApplicationConfigurationRequest 请求对象
     * @return CompletableFuture<ChangeApplicationConfigurationResponse>
     */
    public CompletableFuture<ChangeApplicationConfigurationResponse> changeApplicationConfigurationAsync(ChangeApplicationConfigurationRequest request) {
        return hcClient.asyncInvokeHttp(request, ServiceStageMeta.changeApplicationConfiguration);
    }

    /**
     * 修改应用配置信息
     * 通过此API修改应用配置信息。
     *
     * @param ChangeApplicationConfigurationRequest 请求对象
     * @return AsyncInvoker<ChangeApplicationConfigurationRequest, ChangeApplicationConfigurationResponse>
     */
    public AsyncInvoker<ChangeApplicationConfigurationRequest, ChangeApplicationConfigurationResponse> changeApplicationConfigurationAsyncInvoker(ChangeApplicationConfigurationRequest request) {
        return new AsyncInvoker<ChangeApplicationConfigurationRequest, ChangeApplicationConfigurationResponse>(request, ServiceStageMeta.changeApplicationConfiguration, hcClient);
    }

    /**
     * 根据组件ID修改组件信息
     * 此API通过组件ID修改组件信息。
     *
     * @param ChangeComponentRequest 请求对象
     * @return CompletableFuture<ChangeComponentResponse>
     */
    public CompletableFuture<ChangeComponentResponse> changeComponentAsync(ChangeComponentRequest request) {
        return hcClient.asyncInvokeHttp(request, ServiceStageMeta.changeComponent);
    }

    /**
     * 根据组件ID修改组件信息
     * 此API通过组件ID修改组件信息。
     *
     * @param ChangeComponentRequest 请求对象
     * @return AsyncInvoker<ChangeComponentRequest, ChangeComponentResponse>
     */
    public AsyncInvoker<ChangeComponentRequest, ChangeComponentResponse> changeComponentAsyncInvoker(ChangeComponentRequest request) {
        return new AsyncInvoker<ChangeComponentRequest, ChangeComponentResponse>(request, ServiceStageMeta.changeComponent, hcClient);
    }

    /**
     * 修改环境信息
     * 此API通过环境ID修改环境信息。
     *
     * @param ChangeEnvironmentRequest 请求对象
     * @return CompletableFuture<ChangeEnvironmentResponse>
     */
    public CompletableFuture<ChangeEnvironmentResponse> changeEnvironmentAsync(ChangeEnvironmentRequest request) {
        return hcClient.asyncInvokeHttp(request, ServiceStageMeta.changeEnvironment);
    }

    /**
     * 修改环境信息
     * 此API通过环境ID修改环境信息。
     *
     * @param ChangeEnvironmentRequest 请求对象
     * @return AsyncInvoker<ChangeEnvironmentRequest, ChangeEnvironmentResponse>
     */
    public AsyncInvoker<ChangeEnvironmentRequest, ChangeEnvironmentResponse> changeEnvironmentAsyncInvoker(ChangeEnvironmentRequest request) {
        return new AsyncInvoker<ChangeEnvironmentRequest, ChangeEnvironmentResponse>(request, ServiceStageMeta.changeEnvironment, hcClient);
    }

    /**
     * 修改应用组件实例
     * 通过此API修改应用组件实例。
     *
     * @param ChangeInstanceRequest 请求对象
     * @return CompletableFuture<ChangeInstanceResponse>
     */
    public CompletableFuture<ChangeInstanceResponse> changeInstanceAsync(ChangeInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, ServiceStageMeta.changeInstance);
    }

    /**
     * 修改应用组件实例
     * 通过此API修改应用组件实例。
     *
     * @param ChangeInstanceRequest 请求对象
     * @return AsyncInvoker<ChangeInstanceRequest, ChangeInstanceResponse>
     */
    public AsyncInvoker<ChangeInstanceRequest, ChangeInstanceResponse> changeInstanceAsyncInvoker(ChangeInstanceRequest request) {
        return new AsyncInvoker<ChangeInstanceRequest, ChangeInstanceResponse>(request, ServiceStageMeta.changeInstance, hcClient);
    }

    /**
     * 修改环境资源
     * 此API用来修改环境资源。
     *
     * @param ChangeResourceInEnvironmentRequest 请求对象
     * @return CompletableFuture<ChangeResourceInEnvironmentResponse>
     */
    public CompletableFuture<ChangeResourceInEnvironmentResponse> changeResourceInEnvironmentAsync(ChangeResourceInEnvironmentRequest request) {
        return hcClient.asyncInvokeHttp(request, ServiceStageMeta.changeResourceInEnvironment);
    }

    /**
     * 修改环境资源
     * 此API用来修改环境资源。
     *
     * @param ChangeResourceInEnvironmentRequest 请求对象
     * @return AsyncInvoker<ChangeResourceInEnvironmentRequest, ChangeResourceInEnvironmentResponse>
     */
    public AsyncInvoker<ChangeResourceInEnvironmentRequest, ChangeResourceInEnvironmentResponse> changeResourceInEnvironmentAsyncInvoker(ChangeResourceInEnvironmentRequest request) {
        return new AsyncInvoker<ChangeResourceInEnvironmentRequest, ChangeResourceInEnvironmentResponse>(request, ServiceStageMeta.changeResourceInEnvironment, hcClient);
    }

    /**
     * 创建应用
     * 应用是一个功能相对完备的业务系统，由一个或多个特性相关的组件组成。  此API用来创建应用。 
     *
     * @param CreateApplicationRequest 请求对象
     * @return CompletableFuture<CreateApplicationResponse>
     */
    public CompletableFuture<CreateApplicationResponse> createApplicationAsync(CreateApplicationRequest request) {
        return hcClient.asyncInvokeHttp(request, ServiceStageMeta.createApplication);
    }

    /**
     * 创建应用
     * 应用是一个功能相对完备的业务系统，由一个或多个特性相关的组件组成。  此API用来创建应用。 
     *
     * @param CreateApplicationRequest 请求对象
     * @return AsyncInvoker<CreateApplicationRequest, CreateApplicationResponse>
     */
    public AsyncInvoker<CreateApplicationRequest, CreateApplicationResponse> createApplicationAsyncInvoker(CreateApplicationRequest request) {
        return new AsyncInvoker<CreateApplicationRequest, CreateApplicationResponse>(request, ServiceStageMeta.createApplication, hcClient);
    }

    /**
     * 应用中创建组件
     * 应用组件是组成应用的某个业务特性实现，以代码或者软件包为载体，可独立部署运行。  此API用来在应用中创建组件。 
     *
     * @param CreateComponentRequest 请求对象
     * @return CompletableFuture<CreateComponentResponse>
     */
    public CompletableFuture<CreateComponentResponse> createComponentAsync(CreateComponentRequest request) {
        return hcClient.asyncInvokeHttp(request, ServiceStageMeta.createComponent);
    }

    /**
     * 应用中创建组件
     * 应用组件是组成应用的某个业务特性实现，以代码或者软件包为载体，可独立部署运行。  此API用来在应用中创建组件。 
     *
     * @param CreateComponentRequest 请求对象
     * @return AsyncInvoker<CreateComponentRequest, CreateComponentResponse>
     */
    public AsyncInvoker<CreateComponentRequest, CreateComponentResponse> createComponentAsyncInvoker(CreateComponentRequest request) {
        return new AsyncInvoker<CreateComponentRequest, CreateComponentResponse>(request, ServiceStageMeta.createComponent, hcClient);
    }

    /**
     * 创建环境
     * 环境是用于应用部署和运行的计算、存储、网络等基础设施的集合。Servicestage把相同VPC下的CCE集群加上多个ELB、RDS、DCS实例组合为一个环境，如：开发环境，测试环境，预生产环境，生产环境。环境内网络互通，可以按环境维度来管理资源、部署服务，减少具体基础设施运维管理的复杂性。  此API用来创建环境。 
     *
     * @param CreateEnvironmentRequest 请求对象
     * @return CompletableFuture<CreateEnvironmentResponse>
     */
    public CompletableFuture<CreateEnvironmentResponse> createEnvironmentAsync(CreateEnvironmentRequest request) {
        return hcClient.asyncInvokeHttp(request, ServiceStageMeta.createEnvironment);
    }

    /**
     * 创建环境
     * 环境是用于应用部署和运行的计算、存储、网络等基础设施的集合。Servicestage把相同VPC下的CCE集群加上多个ELB、RDS、DCS实例组合为一个环境，如：开发环境，测试环境，预生产环境，生产环境。环境内网络互通，可以按环境维度来管理资源、部署服务，减少具体基础设施运维管理的复杂性。  此API用来创建环境。 
     *
     * @param CreateEnvironmentRequest 请求对象
     * @return AsyncInvoker<CreateEnvironmentRequest, CreateEnvironmentResponse>
     */
    public AsyncInvoker<CreateEnvironmentRequest, CreateEnvironmentResponse> createEnvironmentAsyncInvoker(CreateEnvironmentRequest request) {
        return new AsyncInvoker<CreateEnvironmentRequest, CreateEnvironmentResponse>(request, ServiceStageMeta.createEnvironment, hcClient);
    }

    /**
     * 创建组件实例
     * 此API用来创建应用组件实例。
     *
     * @param CreateInstanceRequest 请求对象
     * @return CompletableFuture<CreateInstanceResponse>
     */
    public CompletableFuture<CreateInstanceResponse> createInstanceAsync(CreateInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, ServiceStageMeta.createInstance);
    }

    /**
     * 创建组件实例
     * 此API用来创建应用组件实例。
     *
     * @param CreateInstanceRequest 请求对象
     * @return AsyncInvoker<CreateInstanceRequest, CreateInstanceResponse>
     */
    public AsyncInvoker<CreateInstanceRequest, CreateInstanceResponse> createInstanceAsyncInvoker(CreateInstanceRequest request) {
        return new AsyncInvoker<CreateInstanceRequest, CreateInstanceResponse>(request, ServiceStageMeta.createInstance, hcClient);
    }

    /**
     * 根据应用ID删除应用
     * 此API通过应用ID删除应用。
     *
     * @param DeleteApplicationRequest 请求对象
     * @return CompletableFuture<DeleteApplicationResponse>
     */
    public CompletableFuture<DeleteApplicationResponse> deleteApplicationAsync(DeleteApplicationRequest request) {
        return hcClient.asyncInvokeHttp(request, ServiceStageMeta.deleteApplication);
    }

    /**
     * 根据应用ID删除应用
     * 此API通过应用ID删除应用。
     *
     * @param DeleteApplicationRequest 请求对象
     * @return AsyncInvoker<DeleteApplicationRequest, DeleteApplicationResponse>
     */
    public AsyncInvoker<DeleteApplicationRequest, DeleteApplicationResponse> deleteApplicationAsyncInvoker(DeleteApplicationRequest request) {
        return new AsyncInvoker<DeleteApplicationRequest, DeleteApplicationResponse>(request, ServiceStageMeta.deleteApplication, hcClient);
    }

    /**
     * 删除应用配置
     * 通过此API删除应用配置信息。
     *
     * @param DeleteApplicationConfigurationRequest 请求对象
     * @return CompletableFuture<DeleteApplicationConfigurationResponse>
     */
    public CompletableFuture<DeleteApplicationConfigurationResponse> deleteApplicationConfigurationAsync(DeleteApplicationConfigurationRequest request) {
        return hcClient.asyncInvokeHttp(request, ServiceStageMeta.deleteApplicationConfiguration);
    }

    /**
     * 删除应用配置
     * 通过此API删除应用配置信息。
     *
     * @param DeleteApplicationConfigurationRequest 请求对象
     * @return AsyncInvoker<DeleteApplicationConfigurationRequest, DeleteApplicationConfigurationResponse>
     */
    public AsyncInvoker<DeleteApplicationConfigurationRequest, DeleteApplicationConfigurationResponse> deleteApplicationConfigurationAsyncInvoker(DeleteApplicationConfigurationRequest request) {
        return new AsyncInvoker<DeleteApplicationConfigurationRequest, DeleteApplicationConfigurationResponse>(request, ServiceStageMeta.deleteApplicationConfiguration, hcClient);
    }

    /**
     * 根据应用组件ID删除应用组件
     * 此API通过应用组件ID删除应用组件。
     *
     * @param DeleteComponentRequest 请求对象
     * @return CompletableFuture<DeleteComponentResponse>
     */
    public CompletableFuture<DeleteComponentResponse> deleteComponentAsync(DeleteComponentRequest request) {
        return hcClient.asyncInvokeHttp(request, ServiceStageMeta.deleteComponent);
    }

    /**
     * 根据应用组件ID删除应用组件
     * 此API通过应用组件ID删除应用组件。
     *
     * @param DeleteComponentRequest 请求对象
     * @return AsyncInvoker<DeleteComponentRequest, DeleteComponentResponse>
     */
    public AsyncInvoker<DeleteComponentRequest, DeleteComponentResponse> deleteComponentAsyncInvoker(DeleteComponentRequest request) {
        return new AsyncInvoker<DeleteComponentRequest, DeleteComponentResponse>(request, ServiceStageMeta.deleteComponent, hcClient);
    }

    /**
     * 根据环境ID删除环境
     * 此API通过环境ID删除环境。
     *
     * @param DeleteEnvironmentRequest 请求对象
     * @return CompletableFuture<DeleteEnvironmentResponse>
     */
    public CompletableFuture<DeleteEnvironmentResponse> deleteEnvironmentAsync(DeleteEnvironmentRequest request) {
        return hcClient.asyncInvokeHttp(request, ServiceStageMeta.deleteEnvironment);
    }

    /**
     * 根据环境ID删除环境
     * 此API通过环境ID删除环境。
     *
     * @param DeleteEnvironmentRequest 请求对象
     * @return AsyncInvoker<DeleteEnvironmentRequest, DeleteEnvironmentResponse>
     */
    public AsyncInvoker<DeleteEnvironmentRequest, DeleteEnvironmentResponse> deleteEnvironmentAsyncInvoker(DeleteEnvironmentRequest request) {
        return new AsyncInvoker<DeleteEnvironmentRequest, DeleteEnvironmentResponse>(request, ServiceStageMeta.deleteEnvironment, hcClient);
    }

    /**
     * 删除应用组件实例
     * 通过此API删除应用组件实例。
     *
     * @param DeleteInstanceRequest 请求对象
     * @return CompletableFuture<DeleteInstanceResponse>
     */
    public CompletableFuture<DeleteInstanceResponse> deleteInstanceAsync(DeleteInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, ServiceStageMeta.deleteInstance);
    }

    /**
     * 删除应用组件实例
     * 通过此API删除应用组件实例。
     *
     * @param DeleteInstanceRequest 请求对象
     * @return AsyncInvoker<DeleteInstanceRequest, DeleteInstanceResponse>
     */
    public AsyncInvoker<DeleteInstanceRequest, DeleteInstanceResponse> deleteInstanceAsyncInvoker(DeleteInstanceRequest request) {
        return new AsyncInvoker<DeleteInstanceRequest, DeleteInstanceResponse>(request, ServiceStageMeta.deleteInstance, hcClient);
    }

    /**
     * 获取所有应用
     * 通过此API可以获取所有已经创建的应用。
     *
     * @param ListApplicationsRequest 请求对象
     * @return CompletableFuture<ListApplicationsResponse>
     */
    public CompletableFuture<ListApplicationsResponse> listApplicationsAsync(ListApplicationsRequest request) {
        return hcClient.asyncInvokeHttp(request, ServiceStageMeta.listApplications);
    }

    /**
     * 获取所有应用
     * 通过此API可以获取所有已经创建的应用。
     *
     * @param ListApplicationsRequest 请求对象
     * @return AsyncInvoker<ListApplicationsRequest, ListApplicationsResponse>
     */
    public AsyncInvoker<ListApplicationsRequest, ListApplicationsResponse> listApplicationsAsyncInvoker(ListApplicationsRequest request) {
        return new AsyncInvoker<ListApplicationsRequest, ListApplicationsResponse>(request, ServiceStageMeta.listApplications, hcClient);
    }

    /**
     * 获取应用所有组件
     * 通过此API获取应用下所有应用组件。
     *
     * @param ListComponentsRequest 请求对象
     * @return CompletableFuture<ListComponentsResponse>
     */
    public CompletableFuture<ListComponentsResponse> listComponentsAsync(ListComponentsRequest request) {
        return hcClient.asyncInvokeHttp(request, ServiceStageMeta.listComponents);
    }

    /**
     * 获取应用所有组件
     * 通过此API获取应用下所有应用组件。
     *
     * @param ListComponentsRequest 请求对象
     * @return AsyncInvoker<ListComponentsRequest, ListComponentsResponse>
     */
    public AsyncInvoker<ListComponentsRequest, ListComponentsResponse> listComponentsAsyncInvoker(ListComponentsRequest request) {
        return new AsyncInvoker<ListComponentsRequest, ListComponentsResponse>(request, ServiceStageMeta.listComponents, hcClient);
    }

    /**
     * 获取所有环境
     * 此API用来获取所有已经创建环境。
     *
     * @param ListEnvironmentsRequest 请求对象
     * @return CompletableFuture<ListEnvironmentsResponse>
     */
    public CompletableFuture<ListEnvironmentsResponse> listEnvironmentsAsync(ListEnvironmentsRequest request) {
        return hcClient.asyncInvokeHttp(request, ServiceStageMeta.listEnvironments);
    }

    /**
     * 获取所有环境
     * 此API用来获取所有已经创建环境。
     *
     * @param ListEnvironmentsRequest 请求对象
     * @return AsyncInvoker<ListEnvironmentsRequest, ListEnvironmentsResponse>
     */
    public AsyncInvoker<ListEnvironmentsRequest, ListEnvironmentsResponse> listEnvironmentsAsyncInvoker(ListEnvironmentsRequest request) {
        return new AsyncInvoker<ListEnvironmentsRequest, ListEnvironmentsResponse>(request, ServiceStageMeta.listEnvironments, hcClient);
    }

    /**
     * 获取组件实例快照
     * 通过此API获取应用组件实例快照信息。
     *
     * @param ListInstanceSnapshotsRequest 请求对象
     * @return CompletableFuture<ListInstanceSnapshotsResponse>
     */
    public CompletableFuture<ListInstanceSnapshotsResponse> listInstanceSnapshotsAsync(ListInstanceSnapshotsRequest request) {
        return hcClient.asyncInvokeHttp(request, ServiceStageMeta.listInstanceSnapshots);
    }

    /**
     * 获取组件实例快照
     * 通过此API获取应用组件实例快照信息。
     *
     * @param ListInstanceSnapshotsRequest 请求对象
     * @return AsyncInvoker<ListInstanceSnapshotsRequest, ListInstanceSnapshotsResponse>
     */
    public AsyncInvoker<ListInstanceSnapshotsRequest, ListInstanceSnapshotsResponse> listInstanceSnapshotsAsyncInvoker(ListInstanceSnapshotsRequest request) {
        return new AsyncInvoker<ListInstanceSnapshotsRequest, ListInstanceSnapshotsResponse>(request, ServiceStageMeta.listInstanceSnapshots, hcClient);
    }

    /**
     * 获取应用组件实例
     * 通过此API获取组件下的所有组件实例。
     *
     * @param ListInstancesRequest 请求对象
     * @return CompletableFuture<ListInstancesResponse>
     */
    public CompletableFuture<ListInstancesResponse> listInstancesAsync(ListInstancesRequest request) {
        return hcClient.asyncInvokeHttp(request, ServiceStageMeta.listInstances);
    }

    /**
     * 获取应用组件实例
     * 通过此API获取组件下的所有组件实例。
     *
     * @param ListInstancesRequest 请求对象
     * @return AsyncInvoker<ListInstancesRequest, ListInstancesResponse>
     */
    public AsyncInvoker<ListInstancesRequest, ListInstancesResponse> listInstancesAsyncInvoker(ListInstancesRequest request) {
        return new AsyncInvoker<ListInstancesRequest, ListInstancesResponse>(request, ServiceStageMeta.listInstances, hcClient);
    }

    /**
     * 获取应用配置
     * 通过此API获取应用配置信息。
     *
     * @param ShowApplicationConfigurationRequest 请求对象
     * @return CompletableFuture<ShowApplicationConfigurationResponse>
     */
    public CompletableFuture<ShowApplicationConfigurationResponse> showApplicationConfigurationAsync(ShowApplicationConfigurationRequest request) {
        return hcClient.asyncInvokeHttp(request, ServiceStageMeta.showApplicationConfiguration);
    }

    /**
     * 获取应用配置
     * 通过此API获取应用配置信息。
     *
     * @param ShowApplicationConfigurationRequest 请求对象
     * @return AsyncInvoker<ShowApplicationConfigurationRequest, ShowApplicationConfigurationResponse>
     */
    public AsyncInvoker<ShowApplicationConfigurationRequest, ShowApplicationConfigurationResponse> showApplicationConfigurationAsyncInvoker(ShowApplicationConfigurationRequest request) {
        return new AsyncInvoker<ShowApplicationConfigurationRequest, ShowApplicationConfigurationResponse>(request, ServiceStageMeta.showApplicationConfiguration, hcClient);
    }

    /**
     * 根据应用ID获取应用详细信息
     * 此API通过应用ID获取应用详细信息。
     *
     * @param ShowApplicationDetailRequest 请求对象
     * @return CompletableFuture<ShowApplicationDetailResponse>
     */
    public CompletableFuture<ShowApplicationDetailResponse> showApplicationDetailAsync(ShowApplicationDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, ServiceStageMeta.showApplicationDetail);
    }

    /**
     * 根据应用ID获取应用详细信息
     * 此API通过应用ID获取应用详细信息。
     *
     * @param ShowApplicationDetailRequest 请求对象
     * @return AsyncInvoker<ShowApplicationDetailRequest, ShowApplicationDetailResponse>
     */
    public AsyncInvoker<ShowApplicationDetailRequest, ShowApplicationDetailResponse> showApplicationDetailAsyncInvoker(ShowApplicationDetailRequest request) {
        return new AsyncInvoker<ShowApplicationDetailRequest, ShowApplicationDetailResponse>(request, ServiceStageMeta.showApplicationDetail, hcClient);
    }

    /**
     * 根据组件ID获取应用组件信息
     * 通过组件ID获取应用组件信息。
     *
     * @param ShowComponentDetailRequest 请求对象
     * @return CompletableFuture<ShowComponentDetailResponse>
     */
    public CompletableFuture<ShowComponentDetailResponse> showComponentDetailAsync(ShowComponentDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, ServiceStageMeta.showComponentDetail);
    }

    /**
     * 根据组件ID获取应用组件信息
     * 通过组件ID获取应用组件信息。
     *
     * @param ShowComponentDetailRequest 请求对象
     * @return AsyncInvoker<ShowComponentDetailRequest, ShowComponentDetailResponse>
     */
    public AsyncInvoker<ShowComponentDetailRequest, ShowComponentDetailResponse> showComponentDetailAsyncInvoker(ShowComponentDetailRequest request) {
        return new AsyncInvoker<ShowComponentDetailRequest, ShowComponentDetailResponse>(request, ServiceStageMeta.showComponentDetail, hcClient);
    }

    /**
     * 根据环境ID获取环境详细信息
     * 此API通过环境ID获取环境详细信息。
     *
     * @param ShowEnvironmentDetailRequest 请求对象
     * @return CompletableFuture<ShowEnvironmentDetailResponse>
     */
    public CompletableFuture<ShowEnvironmentDetailResponse> showEnvironmentDetailAsync(ShowEnvironmentDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, ServiceStageMeta.showEnvironmentDetail);
    }

    /**
     * 根据环境ID获取环境详细信息
     * 此API通过环境ID获取环境详细信息。
     *
     * @param ShowEnvironmentDetailRequest 请求对象
     * @return AsyncInvoker<ShowEnvironmentDetailRequest, ShowEnvironmentDetailResponse>
     */
    public AsyncInvoker<ShowEnvironmentDetailRequest, ShowEnvironmentDetailResponse> showEnvironmentDetailAsyncInvoker(ShowEnvironmentDetailRequest request) {
        return new AsyncInvoker<ShowEnvironmentDetailRequest, ShowEnvironmentDetailResponse>(request, ServiceStageMeta.showEnvironmentDetail, hcClient);
    }

    /**
     * 根据实例ID获取实例详细信息
     * 此API通过实例ID获取实例详细信息。
     *
     * @param ShowInstanceDetailRequest 请求对象
     * @return CompletableFuture<ShowInstanceDetailResponse>
     */
    public CompletableFuture<ShowInstanceDetailResponse> showInstanceDetailAsync(ShowInstanceDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, ServiceStageMeta.showInstanceDetail);
    }

    /**
     * 根据实例ID获取实例详细信息
     * 此API通过实例ID获取实例详细信息。
     *
     * @param ShowInstanceDetailRequest 请求对象
     * @return AsyncInvoker<ShowInstanceDetailRequest, ShowInstanceDetailResponse>
     */
    public AsyncInvoker<ShowInstanceDetailRequest, ShowInstanceDetailResponse> showInstanceDetailAsyncInvoker(ShowInstanceDetailRequest request) {
        return new AsyncInvoker<ShowInstanceDetailRequest, ShowInstanceDetailResponse>(request, ServiceStageMeta.showInstanceDetail, hcClient);
    }

    /**
     * 获取部署任务详细信息
     * 通过此API获取部署任务详细信息。
     *
     * @param ShowJobDetailRequest 请求对象
     * @return CompletableFuture<ShowJobDetailResponse>
     */
    public CompletableFuture<ShowJobDetailResponse> showJobDetailAsync(ShowJobDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, ServiceStageMeta.showJobDetail);
    }

    /**
     * 获取部署任务详细信息
     * 通过此API获取部署任务详细信息。
     *
     * @param ShowJobDetailRequest 请求对象
     * @return AsyncInvoker<ShowJobDetailRequest, ShowJobDetailResponse>
     */
    public AsyncInvoker<ShowJobDetailRequest, ShowJobDetailResponse> showJobDetailAsyncInvoker(ShowJobDetailRequest request) {
        return new AsyncInvoker<ShowJobDetailRequest, ShowJobDetailResponse>(request, ServiceStageMeta.showJobDetail, hcClient);
    }

    /**
     * 对组件实例的操作
     * 通过此API获取对组件实例的操作。
     *
     * @param UpdateInstanceActionRequest 请求对象
     * @return CompletableFuture<UpdateInstanceActionResponse>
     */
    public CompletableFuture<UpdateInstanceActionResponse> updateInstanceActionAsync(UpdateInstanceActionRequest request) {
        return hcClient.asyncInvokeHttp(request, ServiceStageMeta.updateInstanceAction);
    }

    /**
     * 对组件实例的操作
     * 通过此API获取对组件实例的操作。
     *
     * @param UpdateInstanceActionRequest 请求对象
     * @return AsyncInvoker<UpdateInstanceActionRequest, UpdateInstanceActionResponse>
     */
    public AsyncInvoker<UpdateInstanceActionRequest, UpdateInstanceActionResponse> updateInstanceActionAsyncInvoker(UpdateInstanceActionRequest request) {
        return new AsyncInvoker<UpdateInstanceActionRequest, UpdateInstanceActionResponse>(request, ServiceStageMeta.updateInstanceAction, hcClient);
    }

    /**
     * 创建仓库文件
     * 在指定仓库项目下创建文件。
     *
     * @param CreateFileRequest 请求对象
     * @return CompletableFuture<CreateFileResponse>
     */
    public CompletableFuture<CreateFileResponse> createFileAsync(CreateFileRequest request) {
        return hcClient.asyncInvokeHttp(request, ServiceStageMeta.createFile);
    }

    /**
     * 创建仓库文件
     * 在指定仓库项目下创建文件。
     *
     * @param CreateFileRequest 请求对象
     * @return AsyncInvoker<CreateFileRequest, CreateFileResponse>
     */
    public AsyncInvoker<CreateFileRequest, CreateFileResponse> createFileAsyncInvoker(CreateFileRequest request) {
        return new AsyncInvoker<CreateFileRequest, CreateFileResponse>(request, ServiceStageMeta.createFile, hcClient);
    }

    /**
     * 创建项目hook
     * 创建指定项目的hook。
     *
     * @param CreateHookRequest 请求对象
     * @return CompletableFuture<CreateHookResponse>
     */
    public CompletableFuture<CreateHookResponse> createHookAsync(CreateHookRequest request) {
        return hcClient.asyncInvokeHttp(request, ServiceStageMeta.createHook);
    }

    /**
     * 创建项目hook
     * 创建指定项目的hook。
     *
     * @param CreateHookRequest 请求对象
     * @return AsyncInvoker<CreateHookRequest, CreateHookResponse>
     */
    public AsyncInvoker<CreateHookRequest, CreateHookResponse> createHookAsyncInvoker(CreateHookRequest request) {
        return new AsyncInvoker<CreateHookRequest, CreateHookResponse>(request, ServiceStageMeta.createHook, hcClient);
    }

    /**
     * 创建OAuth授权
     * 创建指定Git仓库类型的OAuth授权。
     *
     * @param CreateOAuthRequest 请求对象
     * @return CompletableFuture<CreateOAuthResponse>
     */
    public CompletableFuture<CreateOAuthResponse> createOAuthAsync(CreateOAuthRequest request) {
        return hcClient.asyncInvokeHttp(request, ServiceStageMeta.createOAuth);
    }

    /**
     * 创建OAuth授权
     * 创建指定Git仓库类型的OAuth授权。
     *
     * @param CreateOAuthRequest 请求对象
     * @return AsyncInvoker<CreateOAuthRequest, CreateOAuthResponse>
     */
    public AsyncInvoker<CreateOAuthRequest, CreateOAuthResponse> createOAuthAsyncInvoker(CreateOAuthRequest request) {
        return new AsyncInvoker<CreateOAuthRequest, CreateOAuthResponse>(request, ServiceStageMeta.createOAuth, hcClient);
    }

    /**
     * 创建口令授权
     * 创建指定Git仓库类型的口令授权。
     *
     * @param CreatePasswordAuthRequest 请求对象
     * @return CompletableFuture<CreatePasswordAuthResponse>
     */
    public CompletableFuture<CreatePasswordAuthResponse> createPasswordAuthAsync(CreatePasswordAuthRequest request) {
        return hcClient.asyncInvokeHttp(request, ServiceStageMeta.createPasswordAuth);
    }

    /**
     * 创建口令授权
     * 创建指定Git仓库类型的口令授权。
     *
     * @param CreatePasswordAuthRequest 请求对象
     * @return AsyncInvoker<CreatePasswordAuthRequest, CreatePasswordAuthResponse>
     */
    public AsyncInvoker<CreatePasswordAuthRequest, CreatePasswordAuthResponse> createPasswordAuthAsyncInvoker(CreatePasswordAuthRequest request) {
        return new AsyncInvoker<CreatePasswordAuthRequest, CreatePasswordAuthResponse>(request, ServiceStageMeta.createPasswordAuth, hcClient);
    }

    /**
     * 创建私人令牌授权
     * 创建指定Git仓库类型的私人令牌授权。
     *
     * @param CreatePersonalAuthRequest 请求对象
     * @return CompletableFuture<CreatePersonalAuthResponse>
     */
    public CompletableFuture<CreatePersonalAuthResponse> createPersonalAuthAsync(CreatePersonalAuthRequest request) {
        return hcClient.asyncInvokeHttp(request, ServiceStageMeta.createPersonalAuth);
    }

    /**
     * 创建私人令牌授权
     * 创建指定Git仓库类型的私人令牌授权。
     *
     * @param CreatePersonalAuthRequest 请求对象
     * @return AsyncInvoker<CreatePersonalAuthRequest, CreatePersonalAuthResponse>
     */
    public AsyncInvoker<CreatePersonalAuthRequest, CreatePersonalAuthResponse> createPersonalAuthAsyncInvoker(CreatePersonalAuthRequest request) {
        return new AsyncInvoker<CreatePersonalAuthRequest, CreatePersonalAuthResponse>(request, ServiceStageMeta.createPersonalAuth, hcClient);
    }

    /**
     * 创建软件仓库项目
     * 创建指定组织下的软件仓库项目。
     *
     * @param CreateProjectRequest 请求对象
     * @return CompletableFuture<CreateProjectResponse>
     */
    public CompletableFuture<CreateProjectResponse> createProjectAsync(CreateProjectRequest request) {
        return hcClient.asyncInvokeHttp(request, ServiceStageMeta.createProject);
    }

    /**
     * 创建软件仓库项目
     * 创建指定组织下的软件仓库项目。
     *
     * @param CreateProjectRequest 请求对象
     * @return AsyncInvoker<CreateProjectRequest, CreateProjectResponse>
     */
    public AsyncInvoker<CreateProjectRequest, CreateProjectResponse> createProjectAsyncInvoker(CreateProjectRequest request) {
        return new AsyncInvoker<CreateProjectRequest, CreateProjectResponse>(request, ServiceStageMeta.createProject, hcClient);
    }

    /**
     * 创建项目tag标签
     * 创建指定项目的tag标签。
     *
     * @param CreateTagRequest 请求对象
     * @return CompletableFuture<CreateTagResponse>
     */
    public CompletableFuture<CreateTagResponse> createTagAsync(CreateTagRequest request) {
        return hcClient.asyncInvokeHttp(request, ServiceStageMeta.createTag);
    }

    /**
     * 创建项目tag标签
     * 创建指定项目的tag标签。
     *
     * @param CreateTagRequest 请求对象
     * @return AsyncInvoker<CreateTagRequest, CreateTagResponse>
     */
    public AsyncInvoker<CreateTagRequest, CreateTagResponse> createTagAsyncInvoker(CreateTagRequest request) {
        return new AsyncInvoker<CreateTagRequest, CreateTagResponse>(request, ServiceStageMeta.createTag, hcClient);
    }

    /**
     * 删除仓库授权
     * 通过名称删除仓库授权。
     *
     * @param DeleteAuthorizeRequest 请求对象
     * @return CompletableFuture<DeleteAuthorizeResponse>
     */
    public CompletableFuture<DeleteAuthorizeResponse> deleteAuthorizeAsync(DeleteAuthorizeRequest request) {
        return hcClient.asyncInvokeHttp(request, ServiceStageMeta.deleteAuthorize);
    }

    /**
     * 删除仓库授权
     * 通过名称删除仓库授权。
     *
     * @param DeleteAuthorizeRequest 请求对象
     * @return AsyncInvoker<DeleteAuthorizeRequest, DeleteAuthorizeResponse>
     */
    public AsyncInvoker<DeleteAuthorizeRequest, DeleteAuthorizeResponse> deleteAuthorizeAsyncInvoker(DeleteAuthorizeRequest request) {
        return new AsyncInvoker<DeleteAuthorizeRequest, DeleteAuthorizeResponse>(request, ServiceStageMeta.deleteAuthorize, hcClient);
    }

    /**
     * 删除仓库文件
     * 删除指定项目仓库下的文件。
     *
     * @param DeleteFileRequest 请求对象
     * @return CompletableFuture<DeleteFileResponse>
     */
    public CompletableFuture<DeleteFileResponse> deleteFileAsync(DeleteFileRequest request) {
        return hcClient.asyncInvokeHttp(request, ServiceStageMeta.deleteFile);
    }

    /**
     * 删除仓库文件
     * 删除指定项目仓库下的文件。
     *
     * @param DeleteFileRequest 请求对象
     * @return AsyncInvoker<DeleteFileRequest, DeleteFileResponse>
     */
    public AsyncInvoker<DeleteFileRequest, DeleteFileResponse> deleteFileAsyncInvoker(DeleteFileRequest request) {
        return new AsyncInvoker<DeleteFileRequest, DeleteFileResponse>(request, ServiceStageMeta.deleteFile, hcClient);
    }

    /**
     * 删除项目hook
     * 删除指定项目的hook。
     *
     * @param DeleteHookRequest 请求对象
     * @return CompletableFuture<DeleteHookResponse>
     */
    public CompletableFuture<DeleteHookResponse> deleteHookAsync(DeleteHookRequest request) {
        return hcClient.asyncInvokeHttp(request, ServiceStageMeta.deleteHook);
    }

    /**
     * 删除项目hook
     * 删除指定项目的hook。
     *
     * @param DeleteHookRequest 请求对象
     * @return AsyncInvoker<DeleteHookRequest, DeleteHookResponse>
     */
    public AsyncInvoker<DeleteHookRequest, DeleteHookResponse> deleteHookAsyncInvoker(DeleteHookRequest request) {
        return new AsyncInvoker<DeleteHookRequest, DeleteHookResponse>(request, ServiceStageMeta.deleteHook, hcClient);
    }

    /**
     * 删除项目tag标签
     * 删除指定项目的tag标签。
     *
     * @param DeleteTagRequest 请求对象
     * @return CompletableFuture<DeleteTagResponse>
     */
    public CompletableFuture<DeleteTagResponse> deleteTagAsync(DeleteTagRequest request) {
        return hcClient.asyncInvokeHttp(request, ServiceStageMeta.deleteTag);
    }

    /**
     * 删除项目tag标签
     * 删除指定项目的tag标签。
     *
     * @param DeleteTagRequest 请求对象
     * @return AsyncInvoker<DeleteTagRequest, DeleteTagResponse>
     */
    public AsyncInvoker<DeleteTagRequest, DeleteTagResponse> deleteTagAsyncInvoker(DeleteTagRequest request) {
        return new AsyncInvoker<DeleteTagRequest, DeleteTagResponse>(request, ServiceStageMeta.deleteTag, hcClient);
    }

    /**
     * 获取仓库授权列表
     * 获取所有Git仓库授权信息。
     *
     * @param ListAuthorizationsRequest 请求对象
     * @return CompletableFuture<ListAuthorizationsResponse>
     */
    public CompletableFuture<ListAuthorizationsResponse> listAuthorizationsAsync(ListAuthorizationsRequest request) {
        return hcClient.asyncInvokeHttp(request, ServiceStageMeta.listAuthorizations);
    }

    /**
     * 获取仓库授权列表
     * 获取所有Git仓库授权信息。
     *
     * @param ListAuthorizationsRequest 请求对象
     * @return AsyncInvoker<ListAuthorizationsRequest, ListAuthorizationsResponse>
     */
    public AsyncInvoker<ListAuthorizationsRequest, ListAuthorizationsResponse> listAuthorizationsAsyncInvoker(ListAuthorizationsRequest request) {
        return new AsyncInvoker<ListAuthorizationsRequest, ListAuthorizationsResponse>(request, ServiceStageMeta.listAuthorizations, hcClient);
    }

    /**
     * 获取项目分支
     * 获取指定项目的所有分支列表。
     *
     * @param ListBranchesRequest 请求对象
     * @return CompletableFuture<ListBranchesResponse>
     */
    public CompletableFuture<ListBranchesResponse> listBranchesAsync(ListBranchesRequest request) {
        return hcClient.asyncInvokeHttp(request, ServiceStageMeta.listBranches);
    }

    /**
     * 获取项目分支
     * 获取指定项目的所有分支列表。
     *
     * @param ListBranchesRequest 请求对象
     * @return AsyncInvoker<ListBranchesRequest, ListBranchesResponse>
     */
    public AsyncInvoker<ListBranchesRequest, ListBranchesResponse> listBranchesAsyncInvoker(ListBranchesRequest request) {
        return new AsyncInvoker<ListBranchesRequest, ListBranchesResponse>(request, ServiceStageMeta.listBranches, hcClient);
    }

    /**
     * 获取项目commit提交记录
     * 获取指定项目的最近10次commit提交记录。
     *
     * @param ListCommitsRequest 请求对象
     * @return CompletableFuture<ListCommitsResponse>
     */
    public CompletableFuture<ListCommitsResponse> listCommitsAsync(ListCommitsRequest request) {
        return hcClient.asyncInvokeHttp(request, ServiceStageMeta.listCommits);
    }

    /**
     * 获取项目commit提交记录
     * 获取指定项目的最近10次commit提交记录。
     *
     * @param ListCommitsRequest 请求对象
     * @return AsyncInvoker<ListCommitsRequest, ListCommitsResponse>
     */
    public AsyncInvoker<ListCommitsRequest, ListCommitsResponse> listCommitsAsyncInvoker(ListCommitsRequest request) {
        return new AsyncInvoker<ListCommitsRequest, ListCommitsResponse>(request, ServiceStageMeta.listCommits, hcClient);
    }

    /**
     * 获取项目hooks
     * 获取指定项目的所有hooks
     *
     * @param ListHooksRequest 请求对象
     * @return CompletableFuture<ListHooksResponse>
     */
    public CompletableFuture<ListHooksResponse> listHooksAsync(ListHooksRequest request) {
        return hcClient.asyncInvokeHttp(request, ServiceStageMeta.listHooks);
    }

    /**
     * 获取项目hooks
     * 获取指定项目的所有hooks
     *
     * @param ListHooksRequest 请求对象
     * @return AsyncInvoker<ListHooksRequest, ListHooksResponse>
     */
    public AsyncInvoker<ListHooksRequest, ListHooksResponse> listHooksAsyncInvoker(ListHooksRequest request) {
        return new AsyncInvoker<ListHooksRequest, ListHooksResponse>(request, ServiceStageMeta.listHooks, hcClient);
    }

    /**
     * 获取仓库的namespaces
     * 获取仓库的namespaces。
     *
     * @param ListNamespacesRequest 请求对象
     * @return CompletableFuture<ListNamespacesResponse>
     */
    public CompletableFuture<ListNamespacesResponse> listNamespacesAsync(ListNamespacesRequest request) {
        return hcClient.asyncInvokeHttp(request, ServiceStageMeta.listNamespaces);
    }

    /**
     * 获取仓库的namespaces
     * 获取仓库的namespaces。
     *
     * @param ListNamespacesRequest 请求对象
     * @return AsyncInvoker<ListNamespacesRequest, ListNamespacesResponse>
     */
    public AsyncInvoker<ListNamespacesRequest, ListNamespacesResponse> listNamespacesAsyncInvoker(ListNamespacesRequest request) {
        return new AsyncInvoker<ListNamespacesRequest, ListNamespacesResponse>(request, ServiceStageMeta.listNamespaces, hcClient);
    }

    /**
     * 获取组织下所有项目
     * 获取指定组织下的所有项目。
     *
     * @param ListProjectsRequest 请求对象
     * @return CompletableFuture<ListProjectsResponse>
     */
    public CompletableFuture<ListProjectsResponse> listProjectsAsync(ListProjectsRequest request) {
        return hcClient.asyncInvokeHttp(request, ServiceStageMeta.listProjects);
    }

    /**
     * 获取组织下所有项目
     * 获取指定组织下的所有项目。
     *
     * @param ListProjectsRequest 请求对象
     * @return AsyncInvoker<ListProjectsRequest, ListProjectsResponse>
     */
    public AsyncInvoker<ListProjectsRequest, ListProjectsResponse> listProjectsAsyncInvoker(ListProjectsRequest request) {
        return new AsyncInvoker<ListProjectsRequest, ListProjectsResponse>(request, ServiceStageMeta.listProjects, hcClient);
    }

    /**
     * 获取项目的所有tag标签
     * 获取指定项目的所有tag标签。
     *
     * @param ListTagsRequest 请求对象
     * @return CompletableFuture<ListTagsResponse>
     */
    public CompletableFuture<ListTagsResponse> listTagsAsync(ListTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, ServiceStageMeta.listTags);
    }

    /**
     * 获取项目的所有tag标签
     * 获取指定项目的所有tag标签。
     *
     * @param ListTagsRequest 请求对象
     * @return AsyncInvoker<ListTagsRequest, ListTagsResponse>
     */
    public AsyncInvoker<ListTagsRequest, ListTagsResponse> listTagsAsyncInvoker(ListTagsRequest request) {
        return new AsyncInvoker<ListTagsRequest, ListTagsResponse>(request, ServiceStageMeta.listTags, hcClient);
    }

    /**
     * 获取仓库文件列表
     * 获取指定项目仓库的文件列表。
     *
     * @param ListTreesRequest 请求对象
     * @return CompletableFuture<ListTreesResponse>
     */
    public CompletableFuture<ListTreesResponse> listTreesAsync(ListTreesRequest request) {
        return hcClient.asyncInvokeHttp(request, ServiceStageMeta.listTrees);
    }

    /**
     * 获取仓库文件列表
     * 获取指定项目仓库的文件列表。
     *
     * @param ListTreesRequest 请求对象
     * @return AsyncInvoker<ListTreesRequest, ListTreesResponse>
     */
    public AsyncInvoker<ListTreesRequest, ListTreesResponse> listTreesAsyncInvoker(ListTreesRequest request) {
        return new AsyncInvoker<ListTreesRequest, ListTreesResponse>(request, ServiceStageMeta.listTrees, hcClient);
    }

    /**
     * 获取仓库文件内容
     * 获取指定项目仓库下文件的内容。
     *
     * @param ShowContentRequest 请求对象
     * @return CompletableFuture<ShowContentResponse>
     */
    public CompletableFuture<ShowContentResponse> showContentAsync(ShowContentRequest request) {
        return hcClient.asyncInvokeHttp(request, ServiceStageMeta.showContent);
    }

    /**
     * 获取仓库文件内容
     * 获取指定项目仓库下文件的内容。
     *
     * @param ShowContentRequest 请求对象
     * @return AsyncInvoker<ShowContentRequest, ShowContentResponse>
     */
    public AsyncInvoker<ShowContentRequest, ShowContentResponse> showContentAsyncInvoker(ShowContentRequest request) {
        return new AsyncInvoker<ShowContentRequest, ShowContentResponse>(request, ServiceStageMeta.showContent, hcClient);
    }

    /**
     * 通过clone url 获取仓库信息
     * 通过指定的clone url 获取仓库信息。
     *
     * @param ShowProjectDetailRequest 请求对象
     * @return CompletableFuture<ShowProjectDetailResponse>
     */
    public CompletableFuture<ShowProjectDetailResponse> showProjectDetailAsync(ShowProjectDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, ServiceStageMeta.showProjectDetail);
    }

    /**
     * 通过clone url 获取仓库信息
     * 通过指定的clone url 获取仓库信息。
     *
     * @param ShowProjectDetailRequest 请求对象
     * @return AsyncInvoker<ShowProjectDetailRequest, ShowProjectDetailResponse>
     */
    public AsyncInvoker<ShowProjectDetailRequest, ShowProjectDetailResponse> showProjectDetailAsyncInvoker(ShowProjectDetailRequest request) {
        return new AsyncInvoker<ShowProjectDetailRequest, ShowProjectDetailResponse>(request, ServiceStageMeta.showProjectDetail, hcClient);
    }

    /**
     * 获取授权重定向URL
     * 获取指定Git仓库类型的授权重定向URL。
     *
     * @param ShowRedirectUrlRequest 请求对象
     * @return CompletableFuture<ShowRedirectUrlResponse>
     */
    public CompletableFuture<ShowRedirectUrlResponse> showRedirectUrlAsync(ShowRedirectUrlRequest request) {
        return hcClient.asyncInvokeHttp(request, ServiceStageMeta.showRedirectUrl);
    }

    /**
     * 获取授权重定向URL
     * 获取指定Git仓库类型的授权重定向URL。
     *
     * @param ShowRedirectUrlRequest 请求对象
     * @return AsyncInvoker<ShowRedirectUrlRequest, ShowRedirectUrlResponse>
     */
    public AsyncInvoker<ShowRedirectUrlRequest, ShowRedirectUrlResponse> showRedirectUrlAsyncInvoker(ShowRedirectUrlRequest request) {
        return new AsyncInvoker<ShowRedirectUrlRequest, ShowRedirectUrlResponse>(request, ServiceStageMeta.showRedirectUrl, hcClient);
    }

    /**
     * 更新仓库文件内容
     * 更新指定项目仓库下的文件内容。
     *
     * @param UpdateFileRequest 请求对象
     * @return CompletableFuture<UpdateFileResponse>
     */
    public CompletableFuture<UpdateFileResponse> updateFileAsync(UpdateFileRequest request) {
        return hcClient.asyncInvokeHttp(request, ServiceStageMeta.updateFile);
    }

    /**
     * 更新仓库文件内容
     * 更新指定项目仓库下的文件内容。
     *
     * @param UpdateFileRequest 请求对象
     * @return AsyncInvoker<UpdateFileRequest, UpdateFileResponse>
     */
    public AsyncInvoker<UpdateFileRequest, UpdateFileResponse> updateFileAsyncInvoker(UpdateFileRequest request) {
        return new AsyncInvoker<UpdateFileRequest, UpdateFileResponse>(request, ServiceStageMeta.updateFile, hcClient);
    }

    /**
     * 获取所有支持的应用资源规格
     * 通过此API获取所用支持的应用资源规格。
     *
     * @param ListFlavorsRequest 请求对象
     * @return CompletableFuture<ListFlavorsResponse>
     */
    public CompletableFuture<ListFlavorsResponse> listFlavorsAsync(ListFlavorsRequest request) {
        return hcClient.asyncInvokeHttp(request, ServiceStageMeta.listFlavors);
    }

    /**
     * 获取所有支持的应用资源规格
     * 通过此API获取所用支持的应用资源规格。
     *
     * @param ListFlavorsRequest 请求对象
     * @return AsyncInvoker<ListFlavorsRequest, ListFlavorsResponse>
     */
    public AsyncInvoker<ListFlavorsRequest, ListFlavorsResponse> listFlavorsAsyncInvoker(ListFlavorsRequest request) {
        return new AsyncInvoker<ListFlavorsRequest, ListFlavorsResponse>(request, ServiceStageMeta.listFlavors, hcClient);
    }

    /**
     * 获取所有支持的应用组件运行时类型
     * 此API用来获取所有支持应用组件运行时类型。
     *
     * @param ListRuntimesRequest 请求对象
     * @return CompletableFuture<ListRuntimesResponse>
     */
    public CompletableFuture<ListRuntimesResponse> listRuntimesAsync(ListRuntimesRequest request) {
        return hcClient.asyncInvokeHttp(request, ServiceStageMeta.listRuntimes);
    }

    /**
     * 获取所有支持的应用组件运行时类型
     * 此API用来获取所有支持应用组件运行时类型。
     *
     * @param ListRuntimesRequest 请求对象
     * @return AsyncInvoker<ListRuntimesRequest, ListRuntimesResponse>
     */
    public AsyncInvoker<ListRuntimesRequest, ListRuntimesResponse> listRuntimesAsyncInvoker(ListRuntimesRequest request) {
        return new AsyncInvoker<ListRuntimesRequest, ListRuntimesResponse>(request, ServiceStageMeta.listRuntimes, hcClient);
    }

    /**
     * 获取所有支持的应用组件模板
     * 此API用来获取所有内置应用组件模板。
     *
     * @param ListTemplatesRequest 请求对象
     * @return CompletableFuture<ListTemplatesResponse>
     */
    public CompletableFuture<ListTemplatesResponse> listTemplatesAsync(ListTemplatesRequest request) {
        return hcClient.asyncInvokeHttp(request, ServiceStageMeta.listTemplates);
    }

    /**
     * 获取所有支持的应用组件模板
     * 此API用来获取所有内置应用组件模板。
     *
     * @param ListTemplatesRequest 请求对象
     * @return AsyncInvoker<ListTemplatesRequest, ListTemplatesResponse>
     */
    public AsyncInvoker<ListTemplatesRequest, ListTemplatesResponse> listTemplatesAsyncInvoker(ListTemplatesRequest request) {
        return new AsyncInvoker<ListTemplatesRequest, ListTemplatesResponse>(request, ServiceStageMeta.listTemplates, hcClient);
    }

}