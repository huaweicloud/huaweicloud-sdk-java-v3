package com.huaweicloud.sdk.cae.v1;

import com.huaweicloud.sdk.cae.v1.model.*;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;

import java.util.concurrent.CompletableFuture;

public class CaeAsyncClient {

    protected HcClient hcClient;

    public CaeAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<CaeAsyncClient> newBuilder() {
        return new ClientBuilder<>(CaeAsyncClient::new);
    }

    /**
     * 创建委托
     *
     * 本接口用于创建cae_trust委托
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateAgencyRequest 请求对象
     * @return CompletableFuture<CreateAgencyResponse>
     */
    public CompletableFuture<CreateAgencyResponse> createAgencyAsync(CreateAgencyRequest request) {
        return hcClient.asyncInvokeHttp(request, CaeMeta.createAgency);
    }

    /**
     * 创建委托
     *
     * 本接口用于创建cae_trust委托
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateAgencyRequest 请求对象
     * @return AsyncInvoker<CreateAgencyRequest, CreateAgencyResponse>
     */
    public AsyncInvoker<CreateAgencyRequest, CreateAgencyResponse> createAgencyAsyncInvoker(
        CreateAgencyRequest request) {
        return new AsyncInvoker<CreateAgencyRequest, CreateAgencyResponse>(request, CaeMeta.createAgency, hcClient);
    }

    /**
     * 获取委托
     *
     * 本接口用于获取cae_trust委托，如果委托不存在则创建委托
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAgencyRequest 请求对象
     * @return CompletableFuture<ShowAgencyResponse>
     */
    public CompletableFuture<ShowAgencyResponse> showAgencyAsync(ShowAgencyRequest request) {
        return hcClient.asyncInvokeHttp(request, CaeMeta.showAgency);
    }

    /**
     * 获取委托
     *
     * 本接口用于获取cae_trust委托，如果委托不存在则创建委托
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAgencyRequest 请求对象
     * @return AsyncInvoker<ShowAgencyRequest, ShowAgencyResponse>
     */
    public AsyncInvoker<ShowAgencyRequest, ShowAgencyResponse> showAgencyAsyncInvoker(ShowAgencyRequest request) {
        return new AsyncInvoker<ShowAgencyRequest, ShowAgencyResponse>(request, CaeMeta.showAgency, hcClient);
    }

    /**
     * 创建应用
     *
     * 本接口用于创建一个应用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateApplicationRequest 请求对象
     * @return CompletableFuture<CreateApplicationResponse>
     */
    public CompletableFuture<CreateApplicationResponse> createApplicationAsync(CreateApplicationRequest request) {
        return hcClient.asyncInvokeHttp(request, CaeMeta.createApplication);
    }

    /**
     * 创建应用
     *
     * 本接口用于创建一个应用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateApplicationRequest 请求对象
     * @return AsyncInvoker<CreateApplicationRequest, CreateApplicationResponse>
     */
    public AsyncInvoker<CreateApplicationRequest, CreateApplicationResponse> createApplicationAsyncInvoker(
        CreateApplicationRequest request) {
        return new AsyncInvoker<CreateApplicationRequest, CreateApplicationResponse>(request, CaeMeta.createApplication,
            hcClient);
    }

    /**
     * 删除应用
     *
     * 本接口用于删除指定应用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteApplicationRequest 请求对象
     * @return CompletableFuture<DeleteApplicationResponse>
     */
    public CompletableFuture<DeleteApplicationResponse> deleteApplicationAsync(DeleteApplicationRequest request) {
        return hcClient.asyncInvokeHttp(request, CaeMeta.deleteApplication);
    }

    /**
     * 删除应用
     *
     * 本接口用于删除指定应用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteApplicationRequest 请求对象
     * @return AsyncInvoker<DeleteApplicationRequest, DeleteApplicationResponse>
     */
    public AsyncInvoker<DeleteApplicationRequest, DeleteApplicationResponse> deleteApplicationAsyncInvoker(
        DeleteApplicationRequest request) {
        return new AsyncInvoker<DeleteApplicationRequest, DeleteApplicationResponse>(request, CaeMeta.deleteApplication,
            hcClient);
    }

    /**
     * 获取应用列表
     *
     * 本接口用于获取当前环境下的应用列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListApplicationsRequest 请求对象
     * @return CompletableFuture<ListApplicationsResponse>
     */
    public CompletableFuture<ListApplicationsResponse> listApplicationsAsync(ListApplicationsRequest request) {
        return hcClient.asyncInvokeHttp(request, CaeMeta.listApplications);
    }

    /**
     * 获取应用列表
     *
     * 本接口用于获取当前环境下的应用列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListApplicationsRequest 请求对象
     * @return AsyncInvoker<ListApplicationsRequest, ListApplicationsResponse>
     */
    public AsyncInvoker<ListApplicationsRequest, ListApplicationsResponse> listApplicationsAsyncInvoker(
        ListApplicationsRequest request) {
        return new AsyncInvoker<ListApplicationsRequest, ListApplicationsResponse>(request, CaeMeta.listApplications,
            hcClient);
    }

    /**
     * 获取应用
     *
     * 本接口用于获取指定应用详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowApplicationRequest 请求对象
     * @return CompletableFuture<ShowApplicationResponse>
     */
    public CompletableFuture<ShowApplicationResponse> showApplicationAsync(ShowApplicationRequest request) {
        return hcClient.asyncInvokeHttp(request, CaeMeta.showApplication);
    }

    /**
     * 获取应用
     *
     * 本接口用于获取指定应用详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowApplicationRequest 请求对象
     * @return AsyncInvoker<ShowApplicationRequest, ShowApplicationResponse>
     */
    public AsyncInvoker<ShowApplicationRequest, ShowApplicationResponse> showApplicationAsyncInvoker(
        ShowApplicationRequest request) {
        return new AsyncInvoker<ShowApplicationRequest, ShowApplicationResponse>(request, CaeMeta.showApplication,
            hcClient);
    }

    /**
     * 创建组件
     *
     * 本接口用于创建一个组件，组件是CAE的最小部署单位，支持将用户的源码，部署包，镜像等资源部署到组件上
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateComponentRequest 请求对象
     * @return CompletableFuture<CreateComponentResponse>
     */
    public CompletableFuture<CreateComponentResponse> createComponentAsync(CreateComponentRequest request) {
        return hcClient.asyncInvokeHttp(request, CaeMeta.createComponent);
    }

    /**
     * 创建组件
     *
     * 本接口用于创建一个组件，组件是CAE的最小部署单位，支持将用户的源码，部署包，镜像等资源部署到组件上
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateComponentRequest 请求对象
     * @return AsyncInvoker<CreateComponentRequest, CreateComponentResponse>
     */
    public AsyncInvoker<CreateComponentRequest, CreateComponentResponse> createComponentAsyncInvoker(
        CreateComponentRequest request) {
        return new AsyncInvoker<CreateComponentRequest, CreateComponentResponse>(request, CaeMeta.createComponent,
            hcClient);
    }

    /**
     * 删除组件
     *
     * 本接口用于删除指定的组件，组件是CAE的最小部署单位，支持将用户的源码，部署包，镜像等资源部署到组件上
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteComponentRequest 请求对象
     * @return CompletableFuture<DeleteComponentResponse>
     */
    public CompletableFuture<DeleteComponentResponse> deleteComponentAsync(DeleteComponentRequest request) {
        return hcClient.asyncInvokeHttp(request, CaeMeta.deleteComponent);
    }

    /**
     * 删除组件
     *
     * 本接口用于删除指定的组件，组件是CAE的最小部署单位，支持将用户的源码，部署包，镜像等资源部署到组件上
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteComponentRequest 请求对象
     * @return AsyncInvoker<DeleteComponentRequest, DeleteComponentResponse>
     */
    public AsyncInvoker<DeleteComponentRequest, DeleteComponentResponse> deleteComponentAsyncInvoker(
        DeleteComponentRequest request) {
        return new AsyncInvoker<DeleteComponentRequest, DeleteComponentResponse>(request, CaeMeta.deleteComponent,
            hcClient);
    }

    /**
     * 操作组件
     *
     * 本接口用于对组件执行指定操作，如部署、升级、重启、停止、启动、伸缩、重试、配置、回滚
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ExecuteActionRequest 请求对象
     * @return CompletableFuture<ExecuteActionResponse>
     */
    public CompletableFuture<ExecuteActionResponse> executeActionAsync(ExecuteActionRequest request) {
        return hcClient.asyncInvokeHttp(request, CaeMeta.executeAction);
    }

    /**
     * 操作组件
     *
     * 本接口用于对组件执行指定操作，如部署、升级、重启、停止、启动、伸缩、重试、配置、回滚
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ExecuteActionRequest 请求对象
     * @return AsyncInvoker<ExecuteActionRequest, ExecuteActionResponse>
     */
    public AsyncInvoker<ExecuteActionRequest, ExecuteActionResponse> executeActionAsyncInvoker(
        ExecuteActionRequest request) {
        return new AsyncInvoker<ExecuteActionRequest, ExecuteActionResponse>(request, CaeMeta.executeAction, hcClient);
    }

    /**
     * 获取组件快照列表
     *
     * 本接口用于获取组件快照版本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListComponentSnapshotsRequest 请求对象
     * @return CompletableFuture<ListComponentSnapshotsResponse>
     */
    public CompletableFuture<ListComponentSnapshotsResponse> listComponentSnapshotsAsync(
        ListComponentSnapshotsRequest request) {
        return hcClient.asyncInvokeHttp(request, CaeMeta.listComponentSnapshots);
    }

    /**
     * 获取组件快照列表
     *
     * 本接口用于获取组件快照版本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListComponentSnapshotsRequest 请求对象
     * @return AsyncInvoker<ListComponentSnapshotsRequest, ListComponentSnapshotsResponse>
     */
    public AsyncInvoker<ListComponentSnapshotsRequest, ListComponentSnapshotsResponse> listComponentSnapshotsAsyncInvoker(
        ListComponentSnapshotsRequest request) {
        return new AsyncInvoker<ListComponentSnapshotsRequest, ListComponentSnapshotsResponse>(request,
            CaeMeta.listComponentSnapshots, hcClient);
    }

    /**
     * 获取组件列表
     *
     * 本接口用于获取组件列表，组件是CAE的最小部署单位，支持将用户的源码，部署包，镜像等资源部署到组件上
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListComponentsRequest 请求对象
     * @return CompletableFuture<ListComponentsResponse>
     */
    public CompletableFuture<ListComponentsResponse> listComponentsAsync(ListComponentsRequest request) {
        return hcClient.asyncInvokeHttp(request, CaeMeta.listComponents);
    }

    /**
     * 获取组件列表
     *
     * 本接口用于获取组件列表，组件是CAE的最小部署单位，支持将用户的源码，部署包，镜像等资源部署到组件上
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListComponentsRequest 请求对象
     * @return AsyncInvoker<ListComponentsRequest, ListComponentsResponse>
     */
    public AsyncInvoker<ListComponentsRequest, ListComponentsResponse> listComponentsAsyncInvoker(
        ListComponentsRequest request) {
        return new AsyncInvoker<ListComponentsRequest, ListComponentsResponse>(request, CaeMeta.listComponents,
            hcClient);
    }

    /**
     * 获取事件列表
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListEventsRequest 请求对象
     * @return CompletableFuture<ListEventsResponse>
     */
    public CompletableFuture<ListEventsResponse> listEventsAsync(ListEventsRequest request) {
        return hcClient.asyncInvokeHttp(request, CaeMeta.listEvents);
    }

    /**
     * 获取事件列表
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListEventsRequest 请求对象
     * @return AsyncInvoker<ListEventsRequest, ListEventsResponse>
     */
    public AsyncInvoker<ListEventsRequest, ListEventsResponse> listEventsAsyncInvoker(ListEventsRequest request) {
        return new AsyncInvoker<ListEventsRequest, ListEventsResponse>(request, CaeMeta.listEvents, hcClient);
    }

    /**
     * 获取组件实例列表
     *
     * 本接口用于获取组件实例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListInstancesRequest 请求对象
     * @return CompletableFuture<ListInstancesResponse>
     */
    public CompletableFuture<ListInstancesResponse> listInstancesAsync(ListInstancesRequest request) {
        return hcClient.asyncInvokeHttp(request, CaeMeta.listInstances);
    }

    /**
     * 获取组件实例列表
     *
     * 本接口用于获取组件实例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListInstancesRequest 请求对象
     * @return AsyncInvoker<ListInstancesRequest, ListInstancesResponse>
     */
    public AsyncInvoker<ListInstancesRequest, ListInstancesResponse> listInstancesAsyncInvoker(
        ListInstancesRequest request) {
        return new AsyncInvoker<ListInstancesRequest, ListInstancesResponse>(request, CaeMeta.listInstances, hcClient);
    }

    /**
     * 获取组件
     *
     * 本接口用于获取指定的组件，组件是CAE的最小部署单位，支持将用户的源码，部署包，镜像等资源部署到组件上
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowComponentRequest 请求对象
     * @return CompletableFuture<ShowComponentResponse>
     */
    public CompletableFuture<ShowComponentResponse> showComponentAsync(ShowComponentRequest request) {
        return hcClient.asyncInvokeHttp(request, CaeMeta.showComponent);
    }

    /**
     * 获取组件
     *
     * 本接口用于获取指定的组件，组件是CAE的最小部署单位，支持将用户的源码，部署包，镜像等资源部署到组件上
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowComponentRequest 请求对象
     * @return AsyncInvoker<ShowComponentRequest, ShowComponentResponse>
     */
    public AsyncInvoker<ShowComponentRequest, ShowComponentResponse> showComponentAsyncInvoker(
        ShowComponentRequest request) {
        return new AsyncInvoker<ShowComponentRequest, ShowComponentResponse>(request, CaeMeta.showComponent, hcClient);
    }

    /**
     * 更新组件
     *
     * 本接口用于更新指定的组件，组件是CAE的最小部署单位，支持将用户的源码，部署包，镜像等资源部署到组件上
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateComponentRequest 请求对象
     * @return CompletableFuture<UpdateComponentResponse>
     */
    public CompletableFuture<UpdateComponentResponse> updateComponentAsync(UpdateComponentRequest request) {
        return hcClient.asyncInvokeHttp(request, CaeMeta.updateComponent);
    }

    /**
     * 更新组件
     *
     * 本接口用于更新指定的组件，组件是CAE的最小部署单位，支持将用户的源码，部署包，镜像等资源部署到组件上
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateComponentRequest 请求对象
     * @return AsyncInvoker<UpdateComponentRequest, UpdateComponentResponse>
     */
    public AsyncInvoker<UpdateComponentRequest, UpdateComponentResponse> updateComponentAsyncInvoker(
        UpdateComponentRequest request) {
        return new AsyncInvoker<UpdateComponentRequest, UpdateComponentResponse>(request, CaeMeta.updateComponent,
            hcClient);
    }

    /**
     * 创建组件配置
     *
     * 本接口用于创建组件配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateComponentConfigurationRequest 请求对象
     * @return CompletableFuture<CreateComponentConfigurationResponse>
     */
    public CompletableFuture<CreateComponentConfigurationResponse> createComponentConfigurationAsync(
        CreateComponentConfigurationRequest request) {
        return hcClient.asyncInvokeHttp(request, CaeMeta.createComponentConfiguration);
    }

    /**
     * 创建组件配置
     *
     * 本接口用于创建组件配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateComponentConfigurationRequest 请求对象
     * @return AsyncInvoker<CreateComponentConfigurationRequest, CreateComponentConfigurationResponse>
     */
    public AsyncInvoker<CreateComponentConfigurationRequest, CreateComponentConfigurationResponse> createComponentConfigurationAsyncInvoker(
        CreateComponentConfigurationRequest request) {
        return new AsyncInvoker<CreateComponentConfigurationRequest, CreateComponentConfigurationResponse>(request,
            CaeMeta.createComponentConfiguration, hcClient);
    }

    /**
     * 删除组件配置
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteComponentConfigurationRequest 请求对象
     * @return CompletableFuture<DeleteComponentConfigurationResponse>
     */
    public CompletableFuture<DeleteComponentConfigurationResponse> deleteComponentConfigurationAsync(
        DeleteComponentConfigurationRequest request) {
        return hcClient.asyncInvokeHttp(request, CaeMeta.deleteComponentConfiguration);
    }

    /**
     * 删除组件配置
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteComponentConfigurationRequest 请求对象
     * @return AsyncInvoker<DeleteComponentConfigurationRequest, DeleteComponentConfigurationResponse>
     */
    public AsyncInvoker<DeleteComponentConfigurationRequest, DeleteComponentConfigurationResponse> deleteComponentConfigurationAsyncInvoker(
        DeleteComponentConfigurationRequest request) {
        return new AsyncInvoker<DeleteComponentConfigurationRequest, DeleteComponentConfigurationResponse>(request,
            CaeMeta.deleteComponentConfiguration, hcClient);
    }

    /**
     * 获取组件配置列表
     *
     * 本接口用于获取组件配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListConfigurationsRequest 请求对象
     * @return CompletableFuture<ListConfigurationsResponse>
     */
    public CompletableFuture<ListConfigurationsResponse> listConfigurationsAsync(ListConfigurationsRequest request) {
        return hcClient.asyncInvokeHttp(request, CaeMeta.listConfigurations);
    }

    /**
     * 获取组件配置列表
     *
     * 本接口用于获取组件配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListConfigurationsRequest 请求对象
     * @return AsyncInvoker<ListConfigurationsRequest, ListConfigurationsResponse>
     */
    public AsyncInvoker<ListConfigurationsRequest, ListConfigurationsResponse> listConfigurationsAsyncInvoker(
        ListConfigurationsRequest request) {
        return new AsyncInvoker<ListConfigurationsRequest, ListConfigurationsResponse>(request,
            CaeMeta.listConfigurations, hcClient);
    }

    /**
     * 创建环境
     *
     * 本接口用于创建一个环境，环境是CAE定义的一个资源维度，所有的用户组件都放在环境下
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateEnvironmentRequest 请求对象
     * @return CompletableFuture<CreateEnvironmentResponse>
     */
    public CompletableFuture<CreateEnvironmentResponse> createEnvironmentAsync(CreateEnvironmentRequest request) {
        return hcClient.asyncInvokeHttp(request, CaeMeta.createEnvironment);
    }

    /**
     * 创建环境
     *
     * 本接口用于创建一个环境，环境是CAE定义的一个资源维度，所有的用户组件都放在环境下
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateEnvironmentRequest 请求对象
     * @return AsyncInvoker<CreateEnvironmentRequest, CreateEnvironmentResponse>
     */
    public AsyncInvoker<CreateEnvironmentRequest, CreateEnvironmentResponse> createEnvironmentAsyncInvoker(
        CreateEnvironmentRequest request) {
        return new AsyncInvoker<CreateEnvironmentRequest, CreateEnvironmentResponse>(request, CaeMeta.createEnvironment,
            hcClient);
    }

    /**
     * 删除环境
     *
     * 本接口用于删除环境，暂未开放。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteEnvironmentRequest 请求对象
     * @return CompletableFuture<DeleteEnvironmentResponse>
     */
    public CompletableFuture<DeleteEnvironmentResponse> deleteEnvironmentAsync(DeleteEnvironmentRequest request) {
        return hcClient.asyncInvokeHttp(request, CaeMeta.deleteEnvironment);
    }

    /**
     * 删除环境
     *
     * 本接口用于删除环境，暂未开放。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteEnvironmentRequest 请求对象
     * @return AsyncInvoker<DeleteEnvironmentRequest, DeleteEnvironmentResponse>
     */
    public AsyncInvoker<DeleteEnvironmentRequest, DeleteEnvironmentResponse> deleteEnvironmentAsyncInvoker(
        DeleteEnvironmentRequest request) {
        return new AsyncInvoker<DeleteEnvironmentRequest, DeleteEnvironmentResponse>(request, CaeMeta.deleteEnvironment,
            hcClient);
    }

    /**
     * 获取环境列表
     *
     * 本接口用于获取当前租户环境信息，环境是CAE定义的一个资源维度，所有的用户组件都放在环境下
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListEnvironmentsRequest 请求对象
     * @return CompletableFuture<ListEnvironmentsResponse>
     */
    public CompletableFuture<ListEnvironmentsResponse> listEnvironmentsAsync(ListEnvironmentsRequest request) {
        return hcClient.asyncInvokeHttp(request, CaeMeta.listEnvironments);
    }

    /**
     * 获取环境列表
     *
     * 本接口用于获取当前租户环境信息，环境是CAE定义的一个资源维度，所有的用户组件都放在环境下
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListEnvironmentsRequest 请求对象
     * @return AsyncInvoker<ListEnvironmentsRequest, ListEnvironmentsResponse>
     */
    public AsyncInvoker<ListEnvironmentsRequest, ListEnvironmentsResponse> listEnvironmentsAsyncInvoker(
        ListEnvironmentsRequest request) {
        return new AsyncInvoker<ListEnvironmentsRequest, ListEnvironmentsResponse>(request, CaeMeta.listEnvironments,
            hcClient);
    }

    /**
     * 重试任务
     *
     * 本接口用于重试任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RetryJobRequest 请求对象
     * @return CompletableFuture<RetryJobResponse>
     */
    public CompletableFuture<RetryJobResponse> retryJobAsync(RetryJobRequest request) {
        return hcClient.asyncInvokeHttp(request, CaeMeta.retryJob);
    }

    /**
     * 重试任务
     *
     * 本接口用于重试任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RetryJobRequest 请求对象
     * @return AsyncInvoker<RetryJobRequest, RetryJobResponse>
     */
    public AsyncInvoker<RetryJobRequest, RetryJobResponse> retryJobAsyncInvoker(RetryJobRequest request) {
        return new AsyncInvoker<RetryJobRequest, RetryJobResponse>(request, CaeMeta.retryJob, hcClient);
    }

    /**
     * 获取任务详情
     *
     * 本接口用于获取任务详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowJobRequest 请求对象
     * @return CompletableFuture<ShowJobResponse>
     */
    public CompletableFuture<ShowJobResponse> showJobAsync(ShowJobRequest request) {
        return hcClient.asyncInvokeHttp(request, CaeMeta.showJob);
    }

    /**
     * 获取任务详情
     *
     * 本接口用于获取任务详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowJobRequest 请求对象
     * @return AsyncInvoker<ShowJobRequest, ShowJobResponse>
     */
    public AsyncInvoker<ShowJobRequest, ShowJobResponse> showJobAsyncInvoker(ShowJobRequest request) {
        return new AsyncInvoker<ShowJobRequest, ShowJobResponse>(request, CaeMeta.showJob, hcClient);
    }

    /**
     * 创建卷
     *
     * 本接口用于创建卷
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateVolumeRequest 请求对象
     * @return CompletableFuture<CreateVolumeResponse>
     */
    public CompletableFuture<CreateVolumeResponse> createVolumeAsync(CreateVolumeRequest request) {
        return hcClient.asyncInvokeHttp(request, CaeMeta.createVolume);
    }

    /**
     * 创建卷
     *
     * 本接口用于创建卷
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateVolumeRequest 请求对象
     * @return AsyncInvoker<CreateVolumeRequest, CreateVolumeResponse>
     */
    public AsyncInvoker<CreateVolumeRequest, CreateVolumeResponse> createVolumeAsyncInvoker(
        CreateVolumeRequest request) {
        return new AsyncInvoker<CreateVolumeRequest, CreateVolumeResponse>(request, CaeMeta.createVolume, hcClient);
    }

    /**
     * 删除卷
     *
     * 本接口用于创建卷
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteVolumeRequest 请求对象
     * @return CompletableFuture<DeleteVolumeResponse>
     */
    public CompletableFuture<DeleteVolumeResponse> deleteVolumeAsync(DeleteVolumeRequest request) {
        return hcClient.asyncInvokeHttp(request, CaeMeta.deleteVolume);
    }

    /**
     * 删除卷
     *
     * 本接口用于创建卷
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteVolumeRequest 请求对象
     * @return AsyncInvoker<DeleteVolumeRequest, DeleteVolumeResponse>
     */
    public AsyncInvoker<DeleteVolumeRequest, DeleteVolumeResponse> deleteVolumeAsyncInvoker(
        DeleteVolumeRequest request) {
        return new AsyncInvoker<DeleteVolumeRequest, DeleteVolumeResponse>(request, CaeMeta.deleteVolume, hcClient);
    }

    /**
     * 获取卷列表
     *
     * 本接口用于获取卷列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListVolumesRequest 请求对象
     * @return CompletableFuture<ListVolumesResponse>
     */
    public CompletableFuture<ListVolumesResponse> listVolumesAsync(ListVolumesRequest request) {
        return hcClient.asyncInvokeHttp(request, CaeMeta.listVolumes);
    }

    /**
     * 获取卷列表
     *
     * 本接口用于获取卷列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListVolumesRequest 请求对象
     * @return AsyncInvoker<ListVolumesRequest, ListVolumesResponse>
     */
    public AsyncInvoker<ListVolumesRequest, ListVolumesResponse> listVolumesAsyncInvoker(ListVolumesRequest request) {
        return new AsyncInvoker<ListVolumesRequest, ListVolumesResponse>(request, CaeMeta.listVolumes, hcClient);
    }

}
