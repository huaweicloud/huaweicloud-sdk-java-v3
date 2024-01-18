package com.huaweicloud.sdk.servicestage.v3;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.servicestage.v3.model.CreateApplicationRequest;
import com.huaweicloud.sdk.servicestage.v3.model.CreateApplicationResponse;
import com.huaweicloud.sdk.servicestage.v3.model.CreateComponentRequest;
import com.huaweicloud.sdk.servicestage.v3.model.CreateComponentResponse;
import com.huaweicloud.sdk.servicestage.v3.model.CreateEnvironmentRequest;
import com.huaweicloud.sdk.servicestage.v3.model.CreateEnvironmentResponse;
import com.huaweicloud.sdk.servicestage.v3.model.DeleteApplicationConfigurationRequest;
import com.huaweicloud.sdk.servicestage.v3.model.DeleteApplicationConfigurationResponse;
import com.huaweicloud.sdk.servicestage.v3.model.DeleteApplicationRequest;
import com.huaweicloud.sdk.servicestage.v3.model.DeleteApplicationResponse;
import com.huaweicloud.sdk.servicestage.v3.model.DeleteComponentRequest;
import com.huaweicloud.sdk.servicestage.v3.model.DeleteComponentResponse;
import com.huaweicloud.sdk.servicestage.v3.model.DeleteEnvironmentRequest;
import com.huaweicloud.sdk.servicestage.v3.model.DeleteEnvironmentResponse;
import com.huaweicloud.sdk.servicestage.v3.model.ModifyApplicationConfigurationRequest;
import com.huaweicloud.sdk.servicestage.v3.model.ModifyApplicationConfigurationResponse;
import com.huaweicloud.sdk.servicestage.v3.model.ModifyApplicationRequest;
import com.huaweicloud.sdk.servicestage.v3.model.ModifyApplicationResponse;
import com.huaweicloud.sdk.servicestage.v3.model.ModifyComponentRequest;
import com.huaweicloud.sdk.servicestage.v3.model.ModifyComponentResponse;
import com.huaweicloud.sdk.servicestage.v3.model.ModifyEnvironmentRequest;
import com.huaweicloud.sdk.servicestage.v3.model.ModifyEnvironmentResponse;
import com.huaweicloud.sdk.servicestage.v3.model.ModifyResourceInEnvironmentRequest;
import com.huaweicloud.sdk.servicestage.v3.model.ModifyResourceInEnvironmentResponse;
import com.huaweicloud.sdk.servicestage.v3.model.ShowApplicationConfigurationRequest;
import com.huaweicloud.sdk.servicestage.v3.model.ShowApplicationConfigurationResponse;
import com.huaweicloud.sdk.servicestage.v3.model.ShowApplicationInfoRequest;
import com.huaweicloud.sdk.servicestage.v3.model.ShowApplicationInfoResponse;
import com.huaweicloud.sdk.servicestage.v3.model.ShowApplicationsRequest;
import com.huaweicloud.sdk.servicestage.v3.model.ShowApplicationsResponse;
import com.huaweicloud.sdk.servicestage.v3.model.ShowComponentInfoRequest;
import com.huaweicloud.sdk.servicestage.v3.model.ShowComponentInfoResponse;
import com.huaweicloud.sdk.servicestage.v3.model.ShowComponentRecordsRequest;
import com.huaweicloud.sdk.servicestage.v3.model.ShowComponentRecordsResponse;
import com.huaweicloud.sdk.servicestage.v3.model.ShowComponentsInApplicationRequest;
import com.huaweicloud.sdk.servicestage.v3.model.ShowComponentsInApplicationResponse;
import com.huaweicloud.sdk.servicestage.v3.model.ShowComponentsRequest;
import com.huaweicloud.sdk.servicestage.v3.model.ShowComponentsResponse;
import com.huaweicloud.sdk.servicestage.v3.model.ShowEnvironmentInfoRequest;
import com.huaweicloud.sdk.servicestage.v3.model.ShowEnvironmentInfoResponse;
import com.huaweicloud.sdk.servicestage.v3.model.ShowEnvironmentResourcesRequest;
import com.huaweicloud.sdk.servicestage.v3.model.ShowEnvironmentResourcesResponse;
import com.huaweicloud.sdk.servicestage.v3.model.ShowEnvironmentsRequest;
import com.huaweicloud.sdk.servicestage.v3.model.ShowEnvironmentsResponse;
import com.huaweicloud.sdk.servicestage.v3.model.ShowJobInfoRequest;
import com.huaweicloud.sdk.servicestage.v3.model.ShowJobInfoResponse;
import com.huaweicloud.sdk.servicestage.v3.model.ShowRuntimeStacksRequest;
import com.huaweicloud.sdk.servicestage.v3.model.ShowRuntimeStacksResponse;
import com.huaweicloud.sdk.servicestage.v3.model.UpdateComponentActionRequest;
import com.huaweicloud.sdk.servicestage.v3.model.UpdateComponentActionResponse;

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
     * 根据应用ID删除应用配置
     *
     * 此API通过应用ID删除应用配置。
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
     * 根据应用ID删除应用配置
     *
     * 此API通过应用ID删除应用配置。
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
     * 根据应用ID修改应用信息
     *
     * 此API通过应用ID修改应用信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyApplicationRequest 请求对象
     * @return ModifyApplicationResponse
     */
    public ModifyApplicationResponse modifyApplication(ModifyApplicationRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.modifyApplication);
    }

    /**
     * 根据应用ID修改应用信息
     *
     * 此API通过应用ID修改应用信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyApplicationRequest 请求对象
     * @return SyncInvoker<ModifyApplicationRequest, ModifyApplicationResponse>
     */
    public SyncInvoker<ModifyApplicationRequest, ModifyApplicationResponse> modifyApplicationInvoker(
        ModifyApplicationRequest request) {
        return new SyncInvoker<>(request, ServiceStageMeta.modifyApplication, hcClient);
    }

    /**
     * 根据应用ID修改应用配置
     *
     * 此API通过应用ID修改应用配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyApplicationConfigurationRequest 请求对象
     * @return ModifyApplicationConfigurationResponse
     */
    public ModifyApplicationConfigurationResponse modifyApplicationConfiguration(
        ModifyApplicationConfigurationRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.modifyApplicationConfiguration);
    }

    /**
     * 根据应用ID修改应用配置
     *
     * 此API通过应用ID修改应用配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyApplicationConfigurationRequest 请求对象
     * @return SyncInvoker<ModifyApplicationConfigurationRequest, ModifyApplicationConfigurationResponse>
     */
    public SyncInvoker<ModifyApplicationConfigurationRequest, ModifyApplicationConfigurationResponse> modifyApplicationConfigurationInvoker(
        ModifyApplicationConfigurationRequest request) {
        return new SyncInvoker<>(request, ServiceStageMeta.modifyApplicationConfiguration, hcClient);
    }

    /**
     * 根据应用ID获取应用配置
     *
     * 此API通过应用ID获取应用配置信息。
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
     * 根据应用ID获取应用配置
     *
     * 此API通过应用ID获取应用配置信息。
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
     * @param request ShowApplicationInfoRequest 请求对象
     * @return ShowApplicationInfoResponse
     */
    public ShowApplicationInfoResponse showApplicationInfo(ShowApplicationInfoRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.showApplicationInfo);
    }

    /**
     * 根据应用ID获取应用详细信息
     *
     * 此API通过应用ID获取应用详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowApplicationInfoRequest 请求对象
     * @return SyncInvoker<ShowApplicationInfoRequest, ShowApplicationInfoResponse>
     */
    public SyncInvoker<ShowApplicationInfoRequest, ShowApplicationInfoResponse> showApplicationInfoInvoker(
        ShowApplicationInfoRequest request) {
        return new SyncInvoker<>(request, ServiceStageMeta.showApplicationInfo, hcClient);
    }

    /**
     * 获取所用应用
     *
     * 获取所有应用信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowApplicationsRequest 请求对象
     * @return ShowApplicationsResponse
     */
    public ShowApplicationsResponse showApplications(ShowApplicationsRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.showApplications);
    }

    /**
     * 获取所用应用
     *
     * 获取所有应用信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowApplicationsRequest 请求对象
     * @return SyncInvoker<ShowApplicationsRequest, ShowApplicationsResponse>
     */
    public SyncInvoker<ShowApplicationsRequest, ShowApplicationsResponse> showApplicationsInvoker(
        ShowApplicationsRequest request) {
        return new SyncInvoker<>(request, ServiceStageMeta.showApplications, hcClient);
    }

    /**
     * 应用中创建组件
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
     * 根据组件ID删除组件
     *
     * 此API通过组件ID删除组件。
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
     * 根据组件ID删除组件
     *
     * 此API通过组件ID删除组件。
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
     * 根据组件ID修改组件信息
     *
     * 此API通过组件ID修改组件信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyComponentRequest 请求对象
     * @return ModifyComponentResponse
     */
    public ModifyComponentResponse modifyComponent(ModifyComponentRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.modifyComponent);
    }

    /**
     * 根据组件ID修改组件信息
     *
     * 此API通过组件ID修改组件信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyComponentRequest 请求对象
     * @return SyncInvoker<ModifyComponentRequest, ModifyComponentResponse>
     */
    public SyncInvoker<ModifyComponentRequest, ModifyComponentResponse> modifyComponentInvoker(
        ModifyComponentRequest request) {
        return new SyncInvoker<>(request, ServiceStageMeta.modifyComponent, hcClient);
    }

    /**
     * 根据组件ID获取组件信息
     *
     * 通过组件ID获取组件信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowComponentInfoRequest 请求对象
     * @return ShowComponentInfoResponse
     */
    public ShowComponentInfoResponse showComponentInfo(ShowComponentInfoRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.showComponentInfo);
    }

    /**
     * 根据组件ID获取组件信息
     *
     * 通过组件ID获取组件信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowComponentInfoRequest 请求对象
     * @return SyncInvoker<ShowComponentInfoRequest, ShowComponentInfoResponse>
     */
    public SyncInvoker<ShowComponentInfoRequest, ShowComponentInfoResponse> showComponentInfoInvoker(
        ShowComponentInfoRequest request) {
        return new SyncInvoker<>(request, ServiceStageMeta.showComponentInfo, hcClient);
    }

    /**
     * 通过组件ID获取记录
     *
     * 此API用来通过组件ID获取记录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowComponentRecordsRequest 请求对象
     * @return ShowComponentRecordsResponse
     */
    public ShowComponentRecordsResponse showComponentRecords(ShowComponentRecordsRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.showComponentRecords);
    }

    /**
     * 通过组件ID获取记录
     *
     * 此API用来通过组件ID获取记录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowComponentRecordsRequest 请求对象
     * @return SyncInvoker<ShowComponentRecordsRequest, ShowComponentRecordsResponse>
     */
    public SyncInvoker<ShowComponentRecordsRequest, ShowComponentRecordsResponse> showComponentRecordsInvoker(
        ShowComponentRecordsRequest request) {
        return new SyncInvoker<>(request, ServiceStageMeta.showComponentRecords, hcClient);
    }

    /**
     * 获取所有组件
     *
     * 此API用来获取所有组件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowComponentsRequest 请求对象
     * @return ShowComponentsResponse
     */
    public ShowComponentsResponse showComponents(ShowComponentsRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.showComponents);
    }

    /**
     * 获取所有组件
     *
     * 此API用来获取所有组件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowComponentsRequest 请求对象
     * @return SyncInvoker<ShowComponentsRequest, ShowComponentsResponse>
     */
    public SyncInvoker<ShowComponentsRequest, ShowComponentsResponse> showComponentsInvoker(
        ShowComponentsRequest request) {
        return new SyncInvoker<>(request, ServiceStageMeta.showComponents, hcClient);
    }

    /**
     * 获取应用所有组件
     *
     * 通过此API获取应用下所有应用组件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowComponentsInApplicationRequest 请求对象
     * @return ShowComponentsInApplicationResponse
     */
    public ShowComponentsInApplicationResponse showComponentsInApplication(ShowComponentsInApplicationRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.showComponentsInApplication);
    }

    /**
     * 获取应用所有组件
     *
     * 通过此API获取应用下所有应用组件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowComponentsInApplicationRequest 请求对象
     * @return SyncInvoker<ShowComponentsInApplicationRequest, ShowComponentsInApplicationResponse>
     */
    public SyncInvoker<ShowComponentsInApplicationRequest, ShowComponentsInApplicationResponse> showComponentsInApplicationInvoker(
        ShowComponentsInApplicationRequest request) {
        return new SyncInvoker<>(request, ServiceStageMeta.showComponentsInApplication, hcClient);
    }

    /**
     * 根据组件ID下发组件任务
     *
     * 通过组件ID下发组件任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateComponentActionRequest 请求对象
     * @return UpdateComponentActionResponse
     */
    public UpdateComponentActionResponse updateComponentAction(UpdateComponentActionRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.updateComponentAction);
    }

    /**
     * 根据组件ID下发组件任务
     *
     * 通过组件ID下发组件任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateComponentActionRequest 请求对象
     * @return SyncInvoker<UpdateComponentActionRequest, UpdateComponentActionResponse>
     */
    public SyncInvoker<UpdateComponentActionRequest, UpdateComponentActionResponse> updateComponentActionInvoker(
        UpdateComponentActionRequest request) {
        return new SyncInvoker<>(request, ServiceStageMeta.updateComponentAction, hcClient);
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
     * 根据环境ID修改环境
     *
     * 此API通过环境ID修改环境。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyEnvironmentRequest 请求对象
     * @return ModifyEnvironmentResponse
     */
    public ModifyEnvironmentResponse modifyEnvironment(ModifyEnvironmentRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.modifyEnvironment);
    }

    /**
     * 根据环境ID修改环境
     *
     * 此API通过环境ID修改环境。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyEnvironmentRequest 请求对象
     * @return SyncInvoker<ModifyEnvironmentRequest, ModifyEnvironmentResponse>
     */
    public SyncInvoker<ModifyEnvironmentRequest, ModifyEnvironmentResponse> modifyEnvironmentInvoker(
        ModifyEnvironmentRequest request) {
        return new SyncInvoker<>(request, ServiceStageMeta.modifyEnvironment, hcClient);
    }

    /**
     * 根据环境ID修改环境资源
     *
     * 此API用来通过环境ID修改环境资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyResourceInEnvironmentRequest 请求对象
     * @return ModifyResourceInEnvironmentResponse
     */
    public ModifyResourceInEnvironmentResponse modifyResourceInEnvironment(ModifyResourceInEnvironmentRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.modifyResourceInEnvironment);
    }

    /**
     * 根据环境ID修改环境资源
     *
     * 此API用来通过环境ID修改环境资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyResourceInEnvironmentRequest 请求对象
     * @return SyncInvoker<ModifyResourceInEnvironmentRequest, ModifyResourceInEnvironmentResponse>
     */
    public SyncInvoker<ModifyResourceInEnvironmentRequest, ModifyResourceInEnvironmentResponse> modifyResourceInEnvironmentInvoker(
        ModifyResourceInEnvironmentRequest request) {
        return new SyncInvoker<>(request, ServiceStageMeta.modifyResourceInEnvironment, hcClient);
    }

    /**
     * 根据环境ID获取环境详细信息
     *
     * 此API通过环境ID获取环境详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowEnvironmentInfoRequest 请求对象
     * @return ShowEnvironmentInfoResponse
     */
    public ShowEnvironmentInfoResponse showEnvironmentInfo(ShowEnvironmentInfoRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.showEnvironmentInfo);
    }

    /**
     * 根据环境ID获取环境详细信息
     *
     * 此API通过环境ID获取环境详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowEnvironmentInfoRequest 请求对象
     * @return SyncInvoker<ShowEnvironmentInfoRequest, ShowEnvironmentInfoResponse>
     */
    public SyncInvoker<ShowEnvironmentInfoRequest, ShowEnvironmentInfoResponse> showEnvironmentInfoInvoker(
        ShowEnvironmentInfoRequest request) {
        return new SyncInvoker<>(request, ServiceStageMeta.showEnvironmentInfo, hcClient);
    }

    /**
     * 根据环境ID查询环境资源
     *
     * 此API用来根据环境ID查询环境资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowEnvironmentResourcesRequest 请求对象
     * @return ShowEnvironmentResourcesResponse
     */
    public ShowEnvironmentResourcesResponse showEnvironmentResources(ShowEnvironmentResourcesRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.showEnvironmentResources);
    }

    /**
     * 根据环境ID查询环境资源
     *
     * 此API用来根据环境ID查询环境资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowEnvironmentResourcesRequest 请求对象
     * @return SyncInvoker<ShowEnvironmentResourcesRequest, ShowEnvironmentResourcesResponse>
     */
    public SyncInvoker<ShowEnvironmentResourcesRequest, ShowEnvironmentResourcesResponse> showEnvironmentResourcesInvoker(
        ShowEnvironmentResourcesRequest request) {
        return new SyncInvoker<>(request, ServiceStageMeta.showEnvironmentResources, hcClient);
    }

    /**
     * 获取所有环境
     *
     * 此API用来获取所有已经创建环境。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowEnvironmentsRequest 请求对象
     * @return ShowEnvironmentsResponse
     */
    public ShowEnvironmentsResponse showEnvironments(ShowEnvironmentsRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.showEnvironments);
    }

    /**
     * 获取所有环境
     *
     * 此API用来获取所有已经创建环境。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowEnvironmentsRequest 请求对象
     * @return SyncInvoker<ShowEnvironmentsRequest, ShowEnvironmentsResponse>
     */
    public SyncInvoker<ShowEnvironmentsRequest, ShowEnvironmentsResponse> showEnvironmentsInvoker(
        ShowEnvironmentsRequest request) {
        return new SyncInvoker<>(request, ServiceStageMeta.showEnvironments, hcClient);
    }

    /**
     * get cas job infomation
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowJobInfoRequest 请求对象
     * @return ShowJobInfoResponse
     */
    public ShowJobInfoResponse showJobInfo(ShowJobInfoRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.showJobInfo);
    }

    /**
     * get cas job infomation
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowJobInfoRequest 请求对象
     * @return SyncInvoker<ShowJobInfoRequest, ShowJobInfoResponse>
     */
    public SyncInvoker<ShowJobInfoRequest, ShowJobInfoResponse> showJobInfoInvoker(ShowJobInfoRequest request) {
        return new SyncInvoker<>(request, ServiceStageMeta.showJobInfo, hcClient);
    }

    /**
     * 查询运行时栈
     *
     * 获取运行时信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRuntimeStacksRequest 请求对象
     * @return ShowRuntimeStacksResponse
     */
    public ShowRuntimeStacksResponse showRuntimeStacks(ShowRuntimeStacksRequest request) {
        return hcClient.syncInvokeHttp(request, ServiceStageMeta.showRuntimeStacks);
    }

    /**
     * 查询运行时栈
     *
     * 获取运行时信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRuntimeStacksRequest 请求对象
     * @return SyncInvoker<ShowRuntimeStacksRequest, ShowRuntimeStacksResponse>
     */
    public SyncInvoker<ShowRuntimeStacksRequest, ShowRuntimeStacksResponse> showRuntimeStacksInvoker(
        ShowRuntimeStacksRequest request) {
        return new SyncInvoker<>(request, ServiceStageMeta.showRuntimeStacks, hcClient);
    }

}
