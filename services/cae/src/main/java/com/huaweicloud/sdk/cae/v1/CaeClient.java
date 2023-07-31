package com.huaweicloud.sdk.cae.v1;

import com.huaweicloud.sdk.cae.v1.model.CreateAgencyRequest;
import com.huaweicloud.sdk.cae.v1.model.CreateAgencyResponse;
import com.huaweicloud.sdk.cae.v1.model.CreateApplicationRequest;
import com.huaweicloud.sdk.cae.v1.model.CreateApplicationResponse;
import com.huaweicloud.sdk.cae.v1.model.CreateCertificateRequest;
import com.huaweicloud.sdk.cae.v1.model.CreateCertificateResponse;
import com.huaweicloud.sdk.cae.v1.model.CreateComponentConfigurationRequest;
import com.huaweicloud.sdk.cae.v1.model.CreateComponentConfigurationResponse;
import com.huaweicloud.sdk.cae.v1.model.CreateComponentRequest;
import com.huaweicloud.sdk.cae.v1.model.CreateComponentResponse;
import com.huaweicloud.sdk.cae.v1.model.CreateDomainRequest;
import com.huaweicloud.sdk.cae.v1.model.CreateDomainResponse;
import com.huaweicloud.sdk.cae.v1.model.CreateEnvironmentRequest;
import com.huaweicloud.sdk.cae.v1.model.CreateEnvironmentResponse;
import com.huaweicloud.sdk.cae.v1.model.CreateTimerRuleRequest;
import com.huaweicloud.sdk.cae.v1.model.CreateTimerRuleResponse;
import com.huaweicloud.sdk.cae.v1.model.CreateVolumeRequest;
import com.huaweicloud.sdk.cae.v1.model.CreateVolumeResponse;
import com.huaweicloud.sdk.cae.v1.model.DeleteApplicationRequest;
import com.huaweicloud.sdk.cae.v1.model.DeleteApplicationResponse;
import com.huaweicloud.sdk.cae.v1.model.DeleteCertificateRequest;
import com.huaweicloud.sdk.cae.v1.model.DeleteCertificateResponse;
import com.huaweicloud.sdk.cae.v1.model.DeleteComponentConfigurationRequest;
import com.huaweicloud.sdk.cae.v1.model.DeleteComponentConfigurationResponse;
import com.huaweicloud.sdk.cae.v1.model.DeleteComponentRequest;
import com.huaweicloud.sdk.cae.v1.model.DeleteComponentResponse;
import com.huaweicloud.sdk.cae.v1.model.DeleteDomainRequest;
import com.huaweicloud.sdk.cae.v1.model.DeleteDomainResponse;
import com.huaweicloud.sdk.cae.v1.model.DeleteEnvironmentRequest;
import com.huaweicloud.sdk.cae.v1.model.DeleteEnvironmentResponse;
import com.huaweicloud.sdk.cae.v1.model.DeleteTimerRuleRequest;
import com.huaweicloud.sdk.cae.v1.model.DeleteTimerRuleResponse;
import com.huaweicloud.sdk.cae.v1.model.DeleteVolumeRequest;
import com.huaweicloud.sdk.cae.v1.model.DeleteVolumeResponse;
import com.huaweicloud.sdk.cae.v1.model.ExecuteActionRequest;
import com.huaweicloud.sdk.cae.v1.model.ExecuteActionResponse;
import com.huaweicloud.sdk.cae.v1.model.ListAgenciesRequest;
import com.huaweicloud.sdk.cae.v1.model.ListAgenciesResponse;
import com.huaweicloud.sdk.cae.v1.model.ListApplicationsRequest;
import com.huaweicloud.sdk.cae.v1.model.ListApplicationsResponse;
import com.huaweicloud.sdk.cae.v1.model.ListCertificatesRequest;
import com.huaweicloud.sdk.cae.v1.model.ListCertificatesResponse;
import com.huaweicloud.sdk.cae.v1.model.ListComponentConfigurationsRequest;
import com.huaweicloud.sdk.cae.v1.model.ListComponentConfigurationsResponse;
import com.huaweicloud.sdk.cae.v1.model.ListComponentEventsRequest;
import com.huaweicloud.sdk.cae.v1.model.ListComponentEventsResponse;
import com.huaweicloud.sdk.cae.v1.model.ListComponentInstancesRequest;
import com.huaweicloud.sdk.cae.v1.model.ListComponentInstancesResponse;
import com.huaweicloud.sdk.cae.v1.model.ListComponentSnapshotsRequest;
import com.huaweicloud.sdk.cae.v1.model.ListComponentSnapshotsResponse;
import com.huaweicloud.sdk.cae.v1.model.ListComponentsRequest;
import com.huaweicloud.sdk.cae.v1.model.ListComponentsResponse;
import com.huaweicloud.sdk.cae.v1.model.ListDomainsRequest;
import com.huaweicloud.sdk.cae.v1.model.ListDomainsResponse;
import com.huaweicloud.sdk.cae.v1.model.ListEnvironmentsRequest;
import com.huaweicloud.sdk.cae.v1.model.ListEnvironmentsResponse;
import com.huaweicloud.sdk.cae.v1.model.ListTimerRulesRequest;
import com.huaweicloud.sdk.cae.v1.model.ListTimerRulesResponse;
import com.huaweicloud.sdk.cae.v1.model.ListVolumesRequest;
import com.huaweicloud.sdk.cae.v1.model.ListVolumesResponse;
import com.huaweicloud.sdk.cae.v1.model.RetryJobRequest;
import com.huaweicloud.sdk.cae.v1.model.RetryJobResponse;
import com.huaweicloud.sdk.cae.v1.model.ShowApplicationRequest;
import com.huaweicloud.sdk.cae.v1.model.ShowApplicationResponse;
import com.huaweicloud.sdk.cae.v1.model.ShowComponentRequest;
import com.huaweicloud.sdk.cae.v1.model.ShowComponentResponse;
import com.huaweicloud.sdk.cae.v1.model.ShowExecutionResultRequest;
import com.huaweicloud.sdk.cae.v1.model.ShowExecutionResultResponse;
import com.huaweicloud.sdk.cae.v1.model.ShowJobRequest;
import com.huaweicloud.sdk.cae.v1.model.ShowJobResponse;
import com.huaweicloud.sdk.cae.v1.model.UpdateCertificateRequest;
import com.huaweicloud.sdk.cae.v1.model.UpdateCertificateResponse;
import com.huaweicloud.sdk.cae.v1.model.UpdateComponentRequest;
import com.huaweicloud.sdk.cae.v1.model.UpdateComponentResponse;
import com.huaweicloud.sdk.cae.v1.model.UpdateTimerRuleRequest;
import com.huaweicloud.sdk.cae.v1.model.UpdateTimerRuleResponse;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;

public class CaeClient {

    protected HcClient hcClient;

    public CaeClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<CaeClient> newBuilder() {
        ClientBuilder<CaeClient> clientBuilder = new ClientBuilder<>(CaeClient::new);
        return clientBuilder;
    }

    /**
     * 创建委托
     *
     * 创建委托。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * 创建委托。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateAgencyRequest 请求对象
     * @return SyncInvoker<CreateAgencyRequest, CreateAgencyResponse>
     */
    public SyncInvoker<CreateAgencyRequest, CreateAgencyResponse> createAgencyInvoker(CreateAgencyRequest request) {
        return new SyncInvoker<CreateAgencyRequest, CreateAgencyResponse>(request, CaeMeta.createAgency, hcClient);
    }

    /**
     * 获取委托列表
     *
     * 获取委托列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAgenciesRequest 请求对象
     * @return ListAgenciesResponse
     */
    public ListAgenciesResponse listAgencies(ListAgenciesRequest request) {
        return hcClient.syncInvokeHttp(request, CaeMeta.listAgencies);
    }

    /**
     * 获取委托列表
     *
     * 获取委托列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAgenciesRequest 请求对象
     * @return SyncInvoker<ListAgenciesRequest, ListAgenciesResponse>
     */
    public SyncInvoker<ListAgenciesRequest, ListAgenciesResponse> listAgenciesInvoker(ListAgenciesRequest request) {
        return new SyncInvoker<ListAgenciesRequest, ListAgenciesResponse>(request, CaeMeta.listAgencies, hcClient);
    }

    /**
     * 创建应用
     *
     * 创建应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * 创建应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * 删除应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * 删除应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * 获取应用列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * 获取应用列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * 获取应用详情
     *
     * 获取应用详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowApplicationRequest 请求对象
     * @return ShowApplicationResponse
     */
    public ShowApplicationResponse showApplication(ShowApplicationRequest request) {
        return hcClient.syncInvokeHttp(request, CaeMeta.showApplication);
    }

    /**
     * 获取应用详情
     *
     * 获取应用详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * 创建证书
     *
     * 创建证书。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateCertificateRequest 请求对象
     * @return CreateCertificateResponse
     */
    public CreateCertificateResponse createCertificate(CreateCertificateRequest request) {
        return hcClient.syncInvokeHttp(request, CaeMeta.createCertificate);
    }

    /**
     * 创建证书
     *
     * 创建证书。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateCertificateRequest 请求对象
     * @return SyncInvoker<CreateCertificateRequest, CreateCertificateResponse>
     */
    public SyncInvoker<CreateCertificateRequest, CreateCertificateResponse> createCertificateInvoker(
        CreateCertificateRequest request) {
        return new SyncInvoker<CreateCertificateRequest, CreateCertificateResponse>(request, CaeMeta.createCertificate,
            hcClient);
    }

    /**
     * 删除证书
     *
     * 删除证书。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteCertificateRequest 请求对象
     * @return DeleteCertificateResponse
     */
    public DeleteCertificateResponse deleteCertificate(DeleteCertificateRequest request) {
        return hcClient.syncInvokeHttp(request, CaeMeta.deleteCertificate);
    }

    /**
     * 删除证书
     *
     * 删除证书。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteCertificateRequest 请求对象
     * @return SyncInvoker<DeleteCertificateRequest, DeleteCertificateResponse>
     */
    public SyncInvoker<DeleteCertificateRequest, DeleteCertificateResponse> deleteCertificateInvoker(
        DeleteCertificateRequest request) {
        return new SyncInvoker<DeleteCertificateRequest, DeleteCertificateResponse>(request, CaeMeta.deleteCertificate,
            hcClient);
    }

    /**
     * 获取证书列表
     *
     * 获取证书列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListCertificatesRequest 请求对象
     * @return ListCertificatesResponse
     */
    public ListCertificatesResponse listCertificates(ListCertificatesRequest request) {
        return hcClient.syncInvokeHttp(request, CaeMeta.listCertificates);
    }

    /**
     * 获取证书列表
     *
     * 获取证书列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListCertificatesRequest 请求对象
     * @return SyncInvoker<ListCertificatesRequest, ListCertificatesResponse>
     */
    public SyncInvoker<ListCertificatesRequest, ListCertificatesResponse> listCertificatesInvoker(
        ListCertificatesRequest request) {
        return new SyncInvoker<ListCertificatesRequest, ListCertificatesResponse>(request, CaeMeta.listCertificates,
            hcClient);
    }

    /**
     * 修改证书
     *
     * 修改证书。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateCertificateRequest 请求对象
     * @return UpdateCertificateResponse
     */
    public UpdateCertificateResponse updateCertificate(UpdateCertificateRequest request) {
        return hcClient.syncInvokeHttp(request, CaeMeta.updateCertificate);
    }

    /**
     * 修改证书
     *
     * 修改证书。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateCertificateRequest 请求对象
     * @return SyncInvoker<UpdateCertificateRequest, UpdateCertificateResponse>
     */
    public SyncInvoker<UpdateCertificateRequest, UpdateCertificateResponse> updateCertificateInvoker(
        UpdateCertificateRequest request) {
        return new SyncInvoker<UpdateCertificateRequest, UpdateCertificateResponse>(request, CaeMeta.updateCertificate,
            hcClient);
    }

    /**
     * 创建组件
     *
     * 创建组件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * 创建组件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * 删除组件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * 删除组件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * 对组件执行指定操作，如部署、升级、重启、停止、启动、伸缩、配置、回滚。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * 对组件执行指定操作，如部署、升级、重启、停止、启动、伸缩、配置、回滚。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ExecuteActionRequest 请求对象
     * @return SyncInvoker<ExecuteActionRequest, ExecuteActionResponse>
     */
    public SyncInvoker<ExecuteActionRequest, ExecuteActionResponse> executeActionInvoker(ExecuteActionRequest request) {
        return new SyncInvoker<ExecuteActionRequest, ExecuteActionResponse>(request, CaeMeta.executeAction, hcClient);
    }

    /**
     * 获取组件事件列表
     *
     * 获取组件事件列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListComponentEventsRequest 请求对象
     * @return ListComponentEventsResponse
     */
    public ListComponentEventsResponse listComponentEvents(ListComponentEventsRequest request) {
        return hcClient.syncInvokeHttp(request, CaeMeta.listComponentEvents);
    }

    /**
     * 获取组件事件列表
     *
     * 获取组件事件列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListComponentEventsRequest 请求对象
     * @return SyncInvoker<ListComponentEventsRequest, ListComponentEventsResponse>
     */
    public SyncInvoker<ListComponentEventsRequest, ListComponentEventsResponse> listComponentEventsInvoker(
        ListComponentEventsRequest request) {
        return new SyncInvoker<ListComponentEventsRequest, ListComponentEventsResponse>(request,
            CaeMeta.listComponentEvents, hcClient);
    }

    /**
     * 获取组件实例列表
     *
     * 获取组件实例列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListComponentInstancesRequest 请求对象
     * @return ListComponentInstancesResponse
     */
    public ListComponentInstancesResponse listComponentInstances(ListComponentInstancesRequest request) {
        return hcClient.syncInvokeHttp(request, CaeMeta.listComponentInstances);
    }

    /**
     * 获取组件实例列表
     *
     * 获取组件实例列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListComponentInstancesRequest 请求对象
     * @return SyncInvoker<ListComponentInstancesRequest, ListComponentInstancesResponse>
     */
    public SyncInvoker<ListComponentInstancesRequest, ListComponentInstancesResponse> listComponentInstancesInvoker(
        ListComponentInstancesRequest request) {
        return new SyncInvoker<ListComponentInstancesRequest, ListComponentInstancesResponse>(request,
            CaeMeta.listComponentInstances, hcClient);
    }

    /**
     * 获取组件快照列表
     *
     * 获取组件快照列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * 获取组件快照列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * 获取组件列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * 获取组件列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * 获取组件详情
     *
     * 获取组件详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowComponentRequest 请求对象
     * @return ShowComponentResponse
     */
    public ShowComponentResponse showComponent(ShowComponentRequest request) {
        return hcClient.syncInvokeHttp(request, CaeMeta.showComponent);
    }

    /**
     * 获取组件详情
     *
     * 获取组件详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * 更新组件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * 更新组件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * 创建组件配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * 创建组件配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * 删除组件配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * 删除组件配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * 获取组件配置列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListComponentConfigurationsRequest 请求对象
     * @return ListComponentConfigurationsResponse
     */
    public ListComponentConfigurationsResponse listComponentConfigurations(ListComponentConfigurationsRequest request) {
        return hcClient.syncInvokeHttp(request, CaeMeta.listComponentConfigurations);
    }

    /**
     * 获取组件配置列表
     *
     * 获取组件配置列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListComponentConfigurationsRequest 请求对象
     * @return SyncInvoker<ListComponentConfigurationsRequest, ListComponentConfigurationsResponse>
     */
    public SyncInvoker<ListComponentConfigurationsRequest, ListComponentConfigurationsResponse> listComponentConfigurationsInvoker(
        ListComponentConfigurationsRequest request) {
        return new SyncInvoker<ListComponentConfigurationsRequest, ListComponentConfigurationsResponse>(request,
            CaeMeta.listComponentConfigurations, hcClient);
    }

    /**
     * 创建域名
     *
     * 创建域名。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateDomainRequest 请求对象
     * @return CreateDomainResponse
     */
    public CreateDomainResponse createDomain(CreateDomainRequest request) {
        return hcClient.syncInvokeHttp(request, CaeMeta.createDomain);
    }

    /**
     * 创建域名
     *
     * 创建域名。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateDomainRequest 请求对象
     * @return SyncInvoker<CreateDomainRequest, CreateDomainResponse>
     */
    public SyncInvoker<CreateDomainRequest, CreateDomainResponse> createDomainInvoker(CreateDomainRequest request) {
        return new SyncInvoker<CreateDomainRequest, CreateDomainResponse>(request, CaeMeta.createDomain, hcClient);
    }

    /**
     * 删除域名
     *
     * 删除域名。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteDomainRequest 请求对象
     * @return DeleteDomainResponse
     */
    public DeleteDomainResponse deleteDomain(DeleteDomainRequest request) {
        return hcClient.syncInvokeHttp(request, CaeMeta.deleteDomain);
    }

    /**
     * 删除域名
     *
     * 删除域名。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteDomainRequest 请求对象
     * @return SyncInvoker<DeleteDomainRequest, DeleteDomainResponse>
     */
    public SyncInvoker<DeleteDomainRequest, DeleteDomainResponse> deleteDomainInvoker(DeleteDomainRequest request) {
        return new SyncInvoker<DeleteDomainRequest, DeleteDomainResponse>(request, CaeMeta.deleteDomain, hcClient);
    }

    /**
     * 获取域名列表
     *
     * 获取域名列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDomainsRequest 请求对象
     * @return ListDomainsResponse
     */
    public ListDomainsResponse listDomains(ListDomainsRequest request) {
        return hcClient.syncInvokeHttp(request, CaeMeta.listDomains);
    }

    /**
     * 获取域名列表
     *
     * 获取域名列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDomainsRequest 请求对象
     * @return SyncInvoker<ListDomainsRequest, ListDomainsResponse>
     */
    public SyncInvoker<ListDomainsRequest, ListDomainsResponse> listDomainsInvoker(ListDomainsRequest request) {
        return new SyncInvoker<ListDomainsRequest, ListDomainsResponse>(request, CaeMeta.listDomains, hcClient);
    }

    /**
     * 创建环境
     *
     * 创建环境。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * 创建环境。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * 删除环境。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * 删除环境。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * 获取环境列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * 获取环境列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * 重试任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * 重试任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * 获取任务详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * 获取任务详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowJobRequest 请求对象
     * @return SyncInvoker<ShowJobRequest, ShowJobResponse>
     */
    public SyncInvoker<ShowJobRequest, ShowJobResponse> showJobInvoker(ShowJobRequest request) {
        return new SyncInvoker<ShowJobRequest, ShowJobResponse>(request, CaeMeta.showJob, hcClient);
    }

    /**
     * 创建定时启停规则
     *
     * 创建定时启停规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateTimerRuleRequest 请求对象
     * @return CreateTimerRuleResponse
     */
    public CreateTimerRuleResponse createTimerRule(CreateTimerRuleRequest request) {
        return hcClient.syncInvokeHttp(request, CaeMeta.createTimerRule);
    }

    /**
     * 创建定时启停规则
     *
     * 创建定时启停规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateTimerRuleRequest 请求对象
     * @return SyncInvoker<CreateTimerRuleRequest, CreateTimerRuleResponse>
     */
    public SyncInvoker<CreateTimerRuleRequest, CreateTimerRuleResponse> createTimerRuleInvoker(
        CreateTimerRuleRequest request) {
        return new SyncInvoker<CreateTimerRuleRequest, CreateTimerRuleResponse>(request, CaeMeta.createTimerRule,
            hcClient);
    }

    /**
     * 删除定时启停规则
     *
     * 删除定时启停规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteTimerRuleRequest 请求对象
     * @return DeleteTimerRuleResponse
     */
    public DeleteTimerRuleResponse deleteTimerRule(DeleteTimerRuleRequest request) {
        return hcClient.syncInvokeHttp(request, CaeMeta.deleteTimerRule);
    }

    /**
     * 删除定时启停规则
     *
     * 删除定时启停规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteTimerRuleRequest 请求对象
     * @return SyncInvoker<DeleteTimerRuleRequest, DeleteTimerRuleResponse>
     */
    public SyncInvoker<DeleteTimerRuleRequest, DeleteTimerRuleResponse> deleteTimerRuleInvoker(
        DeleteTimerRuleRequest request) {
        return new SyncInvoker<DeleteTimerRuleRequest, DeleteTimerRuleResponse>(request, CaeMeta.deleteTimerRule,
            hcClient);
    }

    /**
     * 获取定时启停规则列表
     *
     * 获取定时启停规则列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTimerRulesRequest 请求对象
     * @return ListTimerRulesResponse
     */
    public ListTimerRulesResponse listTimerRules(ListTimerRulesRequest request) {
        return hcClient.syncInvokeHttp(request, CaeMeta.listTimerRules);
    }

    /**
     * 获取定时启停规则列表
     *
     * 获取定时启停规则列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTimerRulesRequest 请求对象
     * @return SyncInvoker<ListTimerRulesRequest, ListTimerRulesResponse>
     */
    public SyncInvoker<ListTimerRulesRequest, ListTimerRulesResponse> listTimerRulesInvoker(
        ListTimerRulesRequest request) {
        return new SyncInvoker<ListTimerRulesRequest, ListTimerRulesResponse>(request, CaeMeta.listTimerRules,
            hcClient);
    }

    /**
     * 获取上次定时启停规则的执行情况
     *
     * 获取上次定时启停规则的执行情况。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowExecutionResultRequest 请求对象
     * @return ShowExecutionResultResponse
     */
    public ShowExecutionResultResponse showExecutionResult(ShowExecutionResultRequest request) {
        return hcClient.syncInvokeHttp(request, CaeMeta.showExecutionResult);
    }

    /**
     * 获取上次定时启停规则的执行情况
     *
     * 获取上次定时启停规则的执行情况。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowExecutionResultRequest 请求对象
     * @return SyncInvoker<ShowExecutionResultRequest, ShowExecutionResultResponse>
     */
    public SyncInvoker<ShowExecutionResultRequest, ShowExecutionResultResponse> showExecutionResultInvoker(
        ShowExecutionResultRequest request) {
        return new SyncInvoker<ShowExecutionResultRequest, ShowExecutionResultResponse>(request,
            CaeMeta.showExecutionResult, hcClient);
    }

    /**
     * 修改定时启停规则
     *
     * 修改定时启停规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateTimerRuleRequest 请求对象
     * @return UpdateTimerRuleResponse
     */
    public UpdateTimerRuleResponse updateTimerRule(UpdateTimerRuleRequest request) {
        return hcClient.syncInvokeHttp(request, CaeMeta.updateTimerRule);
    }

    /**
     * 修改定时启停规则
     *
     * 修改定时启停规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateTimerRuleRequest 请求对象
     * @return SyncInvoker<UpdateTimerRuleRequest, UpdateTimerRuleResponse>
     */
    public SyncInvoker<UpdateTimerRuleRequest, UpdateTimerRuleResponse> updateTimerRuleInvoker(
        UpdateTimerRuleRequest request) {
        return new SyncInvoker<UpdateTimerRuleRequest, UpdateTimerRuleResponse>(request, CaeMeta.updateTimerRule,
            hcClient);
    }

    /**
     * 授权云存储
     *
     * 授权云存储。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateVolumeRequest 请求对象
     * @return CreateVolumeResponse
     */
    public CreateVolumeResponse createVolume(CreateVolumeRequest request) {
        return hcClient.syncInvokeHttp(request, CaeMeta.createVolume);
    }

    /**
     * 授权云存储
     *
     * 授权云存储。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateVolumeRequest 请求对象
     * @return SyncInvoker<CreateVolumeRequest, CreateVolumeResponse>
     */
    public SyncInvoker<CreateVolumeRequest, CreateVolumeResponse> createVolumeInvoker(CreateVolumeRequest request) {
        return new SyncInvoker<CreateVolumeRequest, CreateVolumeResponse>(request, CaeMeta.createVolume, hcClient);
    }

    /**
     * 解绑云存储
     *
     * 解绑云存储。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteVolumeRequest 请求对象
     * @return DeleteVolumeResponse
     */
    public DeleteVolumeResponse deleteVolume(DeleteVolumeRequest request) {
        return hcClient.syncInvokeHttp(request, CaeMeta.deleteVolume);
    }

    /**
     * 解绑云存储
     *
     * 解绑云存储。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteVolumeRequest 请求对象
     * @return SyncInvoker<DeleteVolumeRequest, DeleteVolumeResponse>
     */
    public SyncInvoker<DeleteVolumeRequest, DeleteVolumeResponse> deleteVolumeInvoker(DeleteVolumeRequest request) {
        return new SyncInvoker<DeleteVolumeRequest, DeleteVolumeResponse>(request, CaeMeta.deleteVolume, hcClient);
    }

    /**
     * 获取云存储列表
     *
     * 获取云存储列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListVolumesRequest 请求对象
     * @return ListVolumesResponse
     */
    public ListVolumesResponse listVolumes(ListVolumesRequest request) {
        return hcClient.syncInvokeHttp(request, CaeMeta.listVolumes);
    }

    /**
     * 获取云存储列表
     *
     * 获取云存储列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListVolumesRequest 请求对象
     * @return SyncInvoker<ListVolumesRequest, ListVolumesResponse>
     */
    public SyncInvoker<ListVolumesRequest, ListVolumesResponse> listVolumesInvoker(ListVolumesRequest request) {
        return new SyncInvoker<ListVolumesRequest, ListVolumesResponse>(request, CaeMeta.listVolumes, hcClient);
    }

}
