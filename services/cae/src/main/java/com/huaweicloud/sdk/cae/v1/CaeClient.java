package com.huaweicloud.sdk.cae.v1;

import com.huaweicloud.sdk.cae.v1.model.*;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;

public class CaeClient {

    protected HcClient hcClient;

    public CaeClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<CaeClient> newBuilder() {
        return new ClientBuilder<>(CaeClient::new);
    }

    /**
     * 创建委托
     *
     * 本接口用于创建cae_trust委托
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateAgencyRequest 请求对象
     * @return CreateAgencyResponse
     */
    public CreateAgencyResponse createAgency(CreateAgencyRequest request) {
        return hcClient.syncInvokeHttp(request, CaeMeta.createAgency);
    }

    /**
     * 创建委托
     *
     * 本接口用于创建cae_trust委托
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateAgencyRequest 请求对象
     * @return SyncInvoker<CreateAgencyRequest, CreateAgencyResponse>
     */
    public SyncInvoker<CreateAgencyRequest, CreateAgencyResponse> createAgencyInvoker(CreateAgencyRequest request) {
        return new SyncInvoker<CreateAgencyRequest, CreateAgencyResponse>(request, CaeMeta.createAgency, hcClient);
    }

    /**
     * 获取委托
     *
     * 本接口用于获取cae_trust委托，如果委托不存在则创建委托
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowAgencyRequest 请求对象
     * @return ShowAgencyResponse
     */
    public ShowAgencyResponse showAgency(ShowAgencyRequest request) {
        return hcClient.syncInvokeHttp(request, CaeMeta.showAgency);
    }

    /**
     * 获取委托
     *
     * 本接口用于获取cae_trust委托，如果委托不存在则创建委托
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowAgencyRequest 请求对象
     * @return SyncInvoker<ShowAgencyRequest, ShowAgencyResponse>
     */
    public SyncInvoker<ShowAgencyRequest, ShowAgencyResponse> showAgencyInvoker(ShowAgencyRequest request) {
        return new SyncInvoker<ShowAgencyRequest, ShowAgencyResponse>(request, CaeMeta.showAgency, hcClient);
    }

    /**
     * 创建应用
     *
     * 本接口用于创建一个应用
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateApplicationRequest 请求对象
     * @return CreateApplicationResponse
     */
    public CreateApplicationResponse createApplication(CreateApplicationRequest request) {
        return hcClient.syncInvokeHttp(request, CaeMeta.createApplication);
    }

    /**
     * 创建应用
     *
     * 本接口用于创建一个应用
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateApplicationRequest 请求对象
     * @return SyncInvoker<CreateApplicationRequest, CreateApplicationResponse>
     */
    public SyncInvoker<CreateApplicationRequest, CreateApplicationResponse> createApplicationInvoker(
        CreateApplicationRequest request) {
        return new SyncInvoker<CreateApplicationRequest, CreateApplicationResponse>(request, CaeMeta.createApplication,
            hcClient);
    }

    /**
     * 删除应用
     *
     * 本接口用于删除指定应用
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteApplicationRequest 请求对象
     * @return DeleteApplicationResponse
     */
    public DeleteApplicationResponse deleteApplication(DeleteApplicationRequest request) {
        return hcClient.syncInvokeHttp(request, CaeMeta.deleteApplication);
    }

    /**
     * 删除应用
     *
     * 本接口用于删除指定应用
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteApplicationRequest 请求对象
     * @return SyncInvoker<DeleteApplicationRequest, DeleteApplicationResponse>
     */
    public SyncInvoker<DeleteApplicationRequest, DeleteApplicationResponse> deleteApplicationInvoker(
        DeleteApplicationRequest request) {
        return new SyncInvoker<DeleteApplicationRequest, DeleteApplicationResponse>(request, CaeMeta.deleteApplication,
            hcClient);
    }

    /**
     * 获取应用列表
     *
     * 本接口用于获取当前环境下的应用列表
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListApplicationsRequest 请求对象
     * @return ListApplicationsResponse
     */
    public ListApplicationsResponse listApplications(ListApplicationsRequest request) {
        return hcClient.syncInvokeHttp(request, CaeMeta.listApplications);
    }

    /**
     * 获取应用列表
     *
     * 本接口用于获取当前环境下的应用列表
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListApplicationsRequest 请求对象
     * @return SyncInvoker<ListApplicationsRequest, ListApplicationsResponse>
     */
    public SyncInvoker<ListApplicationsRequest, ListApplicationsResponse> listApplicationsInvoker(
        ListApplicationsRequest request) {
        return new SyncInvoker<ListApplicationsRequest, ListApplicationsResponse>(request, CaeMeta.listApplications,
            hcClient);
    }

    /**
     * 获取应用
     *
     * 本接口用于获取指定应用详情
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowApplicationRequest 请求对象
     * @return ShowApplicationResponse
     */
    public ShowApplicationResponse showApplication(ShowApplicationRequest request) {
        return hcClient.syncInvokeHttp(request, CaeMeta.showApplication);
    }

    /**
     * 获取应用
     *
     * 本接口用于获取指定应用详情
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowApplicationRequest 请求对象
     * @return SyncInvoker<ShowApplicationRequest, ShowApplicationResponse>
     */
    public SyncInvoker<ShowApplicationRequest, ShowApplicationResponse> showApplicationInvoker(
        ShowApplicationRequest request) {
        return new SyncInvoker<ShowApplicationRequest, ShowApplicationResponse>(request, CaeMeta.showApplication,
            hcClient);
    }

    /**
     * 创建组件
     *
     * 本接口用于创建一个组件，组件是CAE的最小部署单位，支持将用户的源码，部署包，镜像等资源部署到组件上
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateComponentRequest 请求对象
     * @return CreateComponentResponse
     */
    public CreateComponentResponse createComponent(CreateComponentRequest request) {
        return hcClient.syncInvokeHttp(request, CaeMeta.createComponent);
    }

    /**
     * 创建组件
     *
     * 本接口用于创建一个组件，组件是CAE的最小部署单位，支持将用户的源码，部署包，镜像等资源部署到组件上
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateComponentRequest 请求对象
     * @return SyncInvoker<CreateComponentRequest, CreateComponentResponse>
     */
    public SyncInvoker<CreateComponentRequest, CreateComponentResponse> createComponentInvoker(
        CreateComponentRequest request) {
        return new SyncInvoker<CreateComponentRequest, CreateComponentResponse>(request, CaeMeta.createComponent,
            hcClient);
    }

    /**
     * 删除组件
     *
     * 本接口用于删除指定的组件，组件是CAE的最小部署单位，支持将用户的源码，部署包，镜像等资源部署到组件上
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteComponentRequest 请求对象
     * @return DeleteComponentResponse
     */
    public DeleteComponentResponse deleteComponent(DeleteComponentRequest request) {
        return hcClient.syncInvokeHttp(request, CaeMeta.deleteComponent);
    }

    /**
     * 删除组件
     *
     * 本接口用于删除指定的组件，组件是CAE的最小部署单位，支持将用户的源码，部署包，镜像等资源部署到组件上
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteComponentRequest 请求对象
     * @return SyncInvoker<DeleteComponentRequest, DeleteComponentResponse>
     */
    public SyncInvoker<DeleteComponentRequest, DeleteComponentResponse> deleteComponentInvoker(
        DeleteComponentRequest request) {
        return new SyncInvoker<DeleteComponentRequest, DeleteComponentResponse>(request, CaeMeta.deleteComponent,
            hcClient);
    }

    /**
     * 操作组件
     *
     * 本接口用于对组件执行指定操作，如部署、升级、重启、停止、启动、伸缩、重试、配置、回滚
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ExecuteActionRequest 请求对象
     * @return ExecuteActionResponse
     */
    public ExecuteActionResponse executeAction(ExecuteActionRequest request) {
        return hcClient.syncInvokeHttp(request, CaeMeta.executeAction);
    }

    /**
     * 操作组件
     *
     * 本接口用于对组件执行指定操作，如部署、升级、重启、停止、启动、伸缩、重试、配置、回滚
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ExecuteActionRequest 请求对象
     * @return SyncInvoker<ExecuteActionRequest, ExecuteActionResponse>
     */
    public SyncInvoker<ExecuteActionRequest, ExecuteActionResponse> executeActionInvoker(ExecuteActionRequest request) {
        return new SyncInvoker<ExecuteActionRequest, ExecuteActionResponse>(request, CaeMeta.executeAction, hcClient);
    }

    /**
     * 获取组件快照列表
     *
     * 本接口用于获取组件快照版本
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListComponentSnapshotsRequest 请求对象
     * @return ListComponentSnapshotsResponse
     */
    public ListComponentSnapshotsResponse listComponentSnapshots(ListComponentSnapshotsRequest request) {
        return hcClient.syncInvokeHttp(request, CaeMeta.listComponentSnapshots);
    }

    /**
     * 获取组件快照列表
     *
     * 本接口用于获取组件快照版本
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListComponentSnapshotsRequest 请求对象
     * @return SyncInvoker<ListComponentSnapshotsRequest, ListComponentSnapshotsResponse>
     */
    public SyncInvoker<ListComponentSnapshotsRequest, ListComponentSnapshotsResponse> listComponentSnapshotsInvoker(
        ListComponentSnapshotsRequest request) {
        return new SyncInvoker<ListComponentSnapshotsRequest, ListComponentSnapshotsResponse>(request,
            CaeMeta.listComponentSnapshots, hcClient);
    }

    /**
     * 获取组件列表
     *
     * 本接口用于获取组件列表，组件是CAE的最小部署单位，支持将用户的源码，部署包，镜像等资源部署到组件上
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListComponentsRequest 请求对象
     * @return ListComponentsResponse
     */
    public ListComponentsResponse listComponents(ListComponentsRequest request) {
        return hcClient.syncInvokeHttp(request, CaeMeta.listComponents);
    }

    /**
     * 获取组件列表
     *
     * 本接口用于获取组件列表，组件是CAE的最小部署单位，支持将用户的源码，部署包，镜像等资源部署到组件上
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListComponentsRequest 请求对象
     * @return SyncInvoker<ListComponentsRequest, ListComponentsResponse>
     */
    public SyncInvoker<ListComponentsRequest, ListComponentsResponse> listComponentsInvoker(
        ListComponentsRequest request) {
        return new SyncInvoker<ListComponentsRequest, ListComponentsResponse>(request, CaeMeta.listComponents,
            hcClient);
    }

    /**
     * 获取事件列表
     *
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListEventsRequest 请求对象
     * @return ListEventsResponse
     */
    public ListEventsResponse listEvents(ListEventsRequest request) {
        return hcClient.syncInvokeHttp(request, CaeMeta.listEvents);
    }

    /**
     * 获取事件列表
     *
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListEventsRequest 请求对象
     * @return SyncInvoker<ListEventsRequest, ListEventsResponse>
     */
    public SyncInvoker<ListEventsRequest, ListEventsResponse> listEventsInvoker(ListEventsRequest request) {
        return new SyncInvoker<ListEventsRequest, ListEventsResponse>(request, CaeMeta.listEvents, hcClient);
    }

    /**
     * 获取组件实例列表
     *
     * 本接口用于获取组件实例列表
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListInstancesRequest 请求对象
     * @return ListInstancesResponse
     */
    public ListInstancesResponse listInstances(ListInstancesRequest request) {
        return hcClient.syncInvokeHttp(request, CaeMeta.listInstances);
    }

    /**
     * 获取组件实例列表
     *
     * 本接口用于获取组件实例列表
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListInstancesRequest 请求对象
     * @return SyncInvoker<ListInstancesRequest, ListInstancesResponse>
     */
    public SyncInvoker<ListInstancesRequest, ListInstancesResponse> listInstancesInvoker(ListInstancesRequest request) {
        return new SyncInvoker<ListInstancesRequest, ListInstancesResponse>(request, CaeMeta.listInstances, hcClient);
    }

    /**
     * 获取组件
     *
     * 本接口用于获取指定的组件，组件是CAE的最小部署单位，支持将用户的源码，部署包，镜像等资源部署到组件上
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowComponentRequest 请求对象
     * @return ShowComponentResponse
     */
    public ShowComponentResponse showComponent(ShowComponentRequest request) {
        return hcClient.syncInvokeHttp(request, CaeMeta.showComponent);
    }

    /**
     * 获取组件
     *
     * 本接口用于获取指定的组件，组件是CAE的最小部署单位，支持将用户的源码，部署包，镜像等资源部署到组件上
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowComponentRequest 请求对象
     * @return SyncInvoker<ShowComponentRequest, ShowComponentResponse>
     */
    public SyncInvoker<ShowComponentRequest, ShowComponentResponse> showComponentInvoker(ShowComponentRequest request) {
        return new SyncInvoker<ShowComponentRequest, ShowComponentResponse>(request, CaeMeta.showComponent, hcClient);
    }

    /**
     * 更新组件
     *
     * 本接口用于更新指定的组件，组件是CAE的最小部署单位，支持将用户的源码，部署包，镜像等资源部署到组件上
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateComponentRequest 请求对象
     * @return UpdateComponentResponse
     */
    public UpdateComponentResponse updateComponent(UpdateComponentRequest request) {
        return hcClient.syncInvokeHttp(request, CaeMeta.updateComponent);
    }

    /**
     * 更新组件
     *
     * 本接口用于更新指定的组件，组件是CAE的最小部署单位，支持将用户的源码，部署包，镜像等资源部署到组件上
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateComponentRequest 请求对象
     * @return SyncInvoker<UpdateComponentRequest, UpdateComponentResponse>
     */
    public SyncInvoker<UpdateComponentRequest, UpdateComponentResponse> updateComponentInvoker(
        UpdateComponentRequest request) {
        return new SyncInvoker<UpdateComponentRequest, UpdateComponentResponse>(request, CaeMeta.updateComponent,
            hcClient);
    }

    /**
     * 创建组件配置
     *
     * 本接口用于创建组件配置
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateComponentConfigurationRequest 请求对象
     * @return CreateComponentConfigurationResponse
     */
    public CreateComponentConfigurationResponse createComponentConfiguration(
        CreateComponentConfigurationRequest request) {
        return hcClient.syncInvokeHttp(request, CaeMeta.createComponentConfiguration);
    }

    /**
     * 创建组件配置
     *
     * 本接口用于创建组件配置
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateComponentConfigurationRequest 请求对象
     * @return SyncInvoker<CreateComponentConfigurationRequest, CreateComponentConfigurationResponse>
     */
    public SyncInvoker<CreateComponentConfigurationRequest, CreateComponentConfigurationResponse> createComponentConfigurationInvoker(
        CreateComponentConfigurationRequest request) {
        return new SyncInvoker<CreateComponentConfigurationRequest, CreateComponentConfigurationResponse>(request,
            CaeMeta.createComponentConfiguration, hcClient);
    }

    /**
     * 删除组件配置
     *
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteComponentConfigurationRequest 请求对象
     * @return DeleteComponentConfigurationResponse
     */
    public DeleteComponentConfigurationResponse deleteComponentConfiguration(
        DeleteComponentConfigurationRequest request) {
        return hcClient.syncInvokeHttp(request, CaeMeta.deleteComponentConfiguration);
    }

    /**
     * 删除组件配置
     *
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteComponentConfigurationRequest 请求对象
     * @return SyncInvoker<DeleteComponentConfigurationRequest, DeleteComponentConfigurationResponse>
     */
    public SyncInvoker<DeleteComponentConfigurationRequest, DeleteComponentConfigurationResponse> deleteComponentConfigurationInvoker(
        DeleteComponentConfigurationRequest request) {
        return new SyncInvoker<DeleteComponentConfigurationRequest, DeleteComponentConfigurationResponse>(request,
            CaeMeta.deleteComponentConfiguration, hcClient);
    }

    /**
     * 获取组件配置列表
     *
     * 本接口用于获取组件配置
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListConfigurationsRequest 请求对象
     * @return ListConfigurationsResponse
     */
    public ListConfigurationsResponse listConfigurations(ListConfigurationsRequest request) {
        return hcClient.syncInvokeHttp(request, CaeMeta.listConfigurations);
    }

    /**
     * 获取组件配置列表
     *
     * 本接口用于获取组件配置
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListConfigurationsRequest 请求对象
     * @return SyncInvoker<ListConfigurationsRequest, ListConfigurationsResponse>
     */
    public SyncInvoker<ListConfigurationsRequest, ListConfigurationsResponse> listConfigurationsInvoker(
        ListConfigurationsRequest request) {
        return new SyncInvoker<ListConfigurationsRequest, ListConfigurationsResponse>(request,
            CaeMeta.listConfigurations, hcClient);
    }

    /**
     * 创建环境
     *
     * 本接口用于创建一个环境，环境是CAE定义的一个资源维度，所有的用户组件都放在环境下
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateEnvironmentRequest 请求对象
     * @return CreateEnvironmentResponse
     */
    public CreateEnvironmentResponse createEnvironment(CreateEnvironmentRequest request) {
        return hcClient.syncInvokeHttp(request, CaeMeta.createEnvironment);
    }

    /**
     * 创建环境
     *
     * 本接口用于创建一个环境，环境是CAE定义的一个资源维度，所有的用户组件都放在环境下
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateEnvironmentRequest 请求对象
     * @return SyncInvoker<CreateEnvironmentRequest, CreateEnvironmentResponse>
     */
    public SyncInvoker<CreateEnvironmentRequest, CreateEnvironmentResponse> createEnvironmentInvoker(
        CreateEnvironmentRequest request) {
        return new SyncInvoker<CreateEnvironmentRequest, CreateEnvironmentResponse>(request, CaeMeta.createEnvironment,
            hcClient);
    }

    /**
     * 删除环境
     *
     * 本接口用于删除环境，暂未开放。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteEnvironmentRequest 请求对象
     * @return DeleteEnvironmentResponse
     */
    public DeleteEnvironmentResponse deleteEnvironment(DeleteEnvironmentRequest request) {
        return hcClient.syncInvokeHttp(request, CaeMeta.deleteEnvironment);
    }

    /**
     * 删除环境
     *
     * 本接口用于删除环境，暂未开放。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteEnvironmentRequest 请求对象
     * @return SyncInvoker<DeleteEnvironmentRequest, DeleteEnvironmentResponse>
     */
    public SyncInvoker<DeleteEnvironmentRequest, DeleteEnvironmentResponse> deleteEnvironmentInvoker(
        DeleteEnvironmentRequest request) {
        return new SyncInvoker<DeleteEnvironmentRequest, DeleteEnvironmentResponse>(request, CaeMeta.deleteEnvironment,
            hcClient);
    }

    /**
     * 获取环境列表
     *
     * 本接口用于获取当前租户环境信息，环境是CAE定义的一个资源维度，所有的用户组件都放在环境下
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListEnvironmentsRequest 请求对象
     * @return ListEnvironmentsResponse
     */
    public ListEnvironmentsResponse listEnvironments(ListEnvironmentsRequest request) {
        return hcClient.syncInvokeHttp(request, CaeMeta.listEnvironments);
    }

    /**
     * 获取环境列表
     *
     * 本接口用于获取当前租户环境信息，环境是CAE定义的一个资源维度，所有的用户组件都放在环境下
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListEnvironmentsRequest 请求对象
     * @return SyncInvoker<ListEnvironmentsRequest, ListEnvironmentsResponse>
     */
    public SyncInvoker<ListEnvironmentsRequest, ListEnvironmentsResponse> listEnvironmentsInvoker(
        ListEnvironmentsRequest request) {
        return new SyncInvoker<ListEnvironmentsRequest, ListEnvironmentsResponse>(request, CaeMeta.listEnvironments,
            hcClient);
    }

    /**
     * 重试任务
     *
     * 本接口用于重试任务
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RetryJobRequest 请求对象
     * @return RetryJobResponse
     */
    public RetryJobResponse retryJob(RetryJobRequest request) {
        return hcClient.syncInvokeHttp(request, CaeMeta.retryJob);
    }

    /**
     * 重试任务
     *
     * 本接口用于重试任务
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RetryJobRequest 请求对象
     * @return SyncInvoker<RetryJobRequest, RetryJobResponse>
     */
    public SyncInvoker<RetryJobRequest, RetryJobResponse> retryJobInvoker(RetryJobRequest request) {
        return new SyncInvoker<RetryJobRequest, RetryJobResponse>(request, CaeMeta.retryJob, hcClient);
    }

    /**
     * 获取任务详情
     *
     * 本接口用于获取任务详情
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowJobRequest 请求对象
     * @return ShowJobResponse
     */
    public ShowJobResponse showJob(ShowJobRequest request) {
        return hcClient.syncInvokeHttp(request, CaeMeta.showJob);
    }

    /**
     * 获取任务详情
     *
     * 本接口用于获取任务详情
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowJobRequest 请求对象
     * @return SyncInvoker<ShowJobRequest, ShowJobResponse>
     */
    public SyncInvoker<ShowJobRequest, ShowJobResponse> showJobInvoker(ShowJobRequest request) {
        return new SyncInvoker<ShowJobRequest, ShowJobResponse>(request, CaeMeta.showJob, hcClient);
    }

    /**
     * 创建卷
     *
     * 本接口用于创建卷
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateVolumeRequest 请求对象
     * @return CreateVolumeResponse
     */
    public CreateVolumeResponse createVolume(CreateVolumeRequest request) {
        return hcClient.syncInvokeHttp(request, CaeMeta.createVolume);
    }

    /**
     * 创建卷
     *
     * 本接口用于创建卷
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateVolumeRequest 请求对象
     * @return SyncInvoker<CreateVolumeRequest, CreateVolumeResponse>
     */
    public SyncInvoker<CreateVolumeRequest, CreateVolumeResponse> createVolumeInvoker(CreateVolumeRequest request) {
        return new SyncInvoker<CreateVolumeRequest, CreateVolumeResponse>(request, CaeMeta.createVolume, hcClient);
    }

    /**
     * 删除卷
     *
     * 本接口用于创建卷
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteVolumeRequest 请求对象
     * @return DeleteVolumeResponse
     */
    public DeleteVolumeResponse deleteVolume(DeleteVolumeRequest request) {
        return hcClient.syncInvokeHttp(request, CaeMeta.deleteVolume);
    }

    /**
     * 删除卷
     *
     * 本接口用于创建卷
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteVolumeRequest 请求对象
     * @return SyncInvoker<DeleteVolumeRequest, DeleteVolumeResponse>
     */
    public SyncInvoker<DeleteVolumeRequest, DeleteVolumeResponse> deleteVolumeInvoker(DeleteVolumeRequest request) {
        return new SyncInvoker<DeleteVolumeRequest, DeleteVolumeResponse>(request, CaeMeta.deleteVolume, hcClient);
    }

    /**
     * 获取卷列表
     *
     * 本接口用于获取卷列表
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListVolumesRequest 请求对象
     * @return ListVolumesResponse
     */
    public ListVolumesResponse listVolumes(ListVolumesRequest request) {
        return hcClient.syncInvokeHttp(request, CaeMeta.listVolumes);
    }

    /**
     * 获取卷列表
     *
     * 本接口用于获取卷列表
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListVolumesRequest 请求对象
     * @return SyncInvoker<ListVolumesRequest, ListVolumesResponse>
     */
    public SyncInvoker<ListVolumesRequest, ListVolumesResponse> listVolumesInvoker(ListVolumesRequest request) {
        return new SyncInvoker<ListVolumesRequest, ListVolumesResponse>(request, CaeMeta.listVolumes, hcClient);
    }

}
