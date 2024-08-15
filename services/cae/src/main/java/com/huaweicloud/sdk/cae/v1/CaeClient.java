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
import com.huaweicloud.sdk.cae.v1.model.CreateComponentWithConfigurationRequest;
import com.huaweicloud.sdk.cae.v1.model.CreateComponentWithConfigurationResponse;
import com.huaweicloud.sdk.cae.v1.model.CreateDomainRequest;
import com.huaweicloud.sdk.cae.v1.model.CreateDomainResponse;
import com.huaweicloud.sdk.cae.v1.model.CreateEnvironmentRequest;
import com.huaweicloud.sdk.cae.v1.model.CreateEnvironmentResponse;
import com.huaweicloud.sdk.cae.v1.model.CreateMonitorSystemRequest;
import com.huaweicloud.sdk.cae.v1.model.CreateMonitorSystemResponse;
import com.huaweicloud.sdk.cae.v1.model.CreateNoticeRuleRequest;
import com.huaweicloud.sdk.cae.v1.model.CreateNoticeRuleResponse;
import com.huaweicloud.sdk.cae.v1.model.CreateTimerRuleRequest;
import com.huaweicloud.sdk.cae.v1.model.CreateTimerRuleResponse;
import com.huaweicloud.sdk.cae.v1.model.CreateVolumeRequest;
import com.huaweicloud.sdk.cae.v1.model.CreateVolumeResponse;
import com.huaweicloud.sdk.cae.v1.model.CreateVpcEgressRequest;
import com.huaweicloud.sdk.cae.v1.model.CreateVpcEgressResponse;
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
import com.huaweicloud.sdk.cae.v1.model.DeleteNoticeRuleRequest;
import com.huaweicloud.sdk.cae.v1.model.DeleteNoticeRuleResponse;
import com.huaweicloud.sdk.cae.v1.model.DeleteTimerRuleRequest;
import com.huaweicloud.sdk.cae.v1.model.DeleteTimerRuleResponse;
import com.huaweicloud.sdk.cae.v1.model.DeleteVolumeRequest;
import com.huaweicloud.sdk.cae.v1.model.DeleteVolumeResponse;
import com.huaweicloud.sdk.cae.v1.model.DeleteVpcEgressRequest;
import com.huaweicloud.sdk.cae.v1.model.DeleteVpcEgressResponse;
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
import com.huaweicloud.sdk.cae.v1.model.ListEipsRequest;
import com.huaweicloud.sdk.cae.v1.model.ListEipsResponse;
import com.huaweicloud.sdk.cae.v1.model.ListEnvironmentsRequest;
import com.huaweicloud.sdk.cae.v1.model.ListEnvironmentsResponse;
import com.huaweicloud.sdk.cae.v1.model.ListNoticeRulesRequest;
import com.huaweicloud.sdk.cae.v1.model.ListNoticeRulesResponse;
import com.huaweicloud.sdk.cae.v1.model.ListTimerRulesRequest;
import com.huaweicloud.sdk.cae.v1.model.ListTimerRulesResponse;
import com.huaweicloud.sdk.cae.v1.model.ListVolumesRequest;
import com.huaweicloud.sdk.cae.v1.model.ListVolumesResponse;
import com.huaweicloud.sdk.cae.v1.model.ListVpcEgressRequest;
import com.huaweicloud.sdk.cae.v1.model.ListVpcEgressResponse;
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
import com.huaweicloud.sdk.cae.v1.model.ShowMonitorSystemRequest;
import com.huaweicloud.sdk.cae.v1.model.ShowMonitorSystemResponse;
import com.huaweicloud.sdk.cae.v1.model.ShowNoticeRuleRequest;
import com.huaweicloud.sdk.cae.v1.model.ShowNoticeRuleResponse;
import com.huaweicloud.sdk.cae.v1.model.UpdateCertificateRequest;
import com.huaweicloud.sdk.cae.v1.model.UpdateCertificateResponse;
import com.huaweicloud.sdk.cae.v1.model.UpdateComponentRequest;
import com.huaweicloud.sdk.cae.v1.model.UpdateComponentResponse;
import com.huaweicloud.sdk.cae.v1.model.UpdateEipRequest;
import com.huaweicloud.sdk.cae.v1.model.UpdateEipResponse;
import com.huaweicloud.sdk.cae.v1.model.UpdateMonitorSystemRequest;
import com.huaweicloud.sdk.cae.v1.model.UpdateMonitorSystemResponse;
import com.huaweicloud.sdk.cae.v1.model.UpdateNoticeRuleRequest;
import com.huaweicloud.sdk.cae.v1.model.UpdateNoticeRuleResponse;
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
     * @param request CreateAgencyRequest 请求对象
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
     * @param request CreateAgencyRequest 请求对象
     * @return SyncInvoker<CreateAgencyRequest, CreateAgencyResponse>
     */
    public SyncInvoker<CreateAgencyRequest, CreateAgencyResponse> createAgencyInvoker(CreateAgencyRequest request) {
        return new SyncInvoker<>(request, CaeMeta.createAgency, hcClient);
    }

    /**
     * 获取委托列表
     *
     * 获取委托列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAgenciesRequest 请求对象
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
     * @param request ListAgenciesRequest 请求对象
     * @return SyncInvoker<ListAgenciesRequest, ListAgenciesResponse>
     */
    public SyncInvoker<ListAgenciesRequest, ListAgenciesResponse> listAgenciesInvoker(ListAgenciesRequest request) {
        return new SyncInvoker<>(request, CaeMeta.listAgencies, hcClient);
    }

    /**
     * 创建应用
     *
     * 创建应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateApplicationRequest 请求对象
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
     * @param request CreateApplicationRequest 请求对象
     * @return SyncInvoker<CreateApplicationRequest, CreateApplicationResponse>
     */
    public SyncInvoker<CreateApplicationRequest, CreateApplicationResponse> createApplicationInvoker(
        CreateApplicationRequest request) {
        return new SyncInvoker<>(request, CaeMeta.createApplication, hcClient);
    }

    /**
     * 删除应用
     *
     * 删除应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteApplicationRequest 请求对象
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
     * @param request DeleteApplicationRequest 请求对象
     * @return SyncInvoker<DeleteApplicationRequest, DeleteApplicationResponse>
     */
    public SyncInvoker<DeleteApplicationRequest, DeleteApplicationResponse> deleteApplicationInvoker(
        DeleteApplicationRequest request) {
        return new SyncInvoker<>(request, CaeMeta.deleteApplication, hcClient);
    }

    /**
     * 获取应用列表
     *
     * 获取应用列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApplicationsRequest 请求对象
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
     * @param request ListApplicationsRequest 请求对象
     * @return SyncInvoker<ListApplicationsRequest, ListApplicationsResponse>
     */
    public SyncInvoker<ListApplicationsRequest, ListApplicationsResponse> listApplicationsInvoker(
        ListApplicationsRequest request) {
        return new SyncInvoker<>(request, CaeMeta.listApplications, hcClient);
    }

    /**
     * 获取应用详情
     *
     * 获取应用详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowApplicationRequest 请求对象
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
     * @param request ShowApplicationRequest 请求对象
     * @return SyncInvoker<ShowApplicationRequest, ShowApplicationResponse>
     */
    public SyncInvoker<ShowApplicationRequest, ShowApplicationResponse> showApplicationInvoker(
        ShowApplicationRequest request) {
        return new SyncInvoker<>(request, CaeMeta.showApplication, hcClient);
    }

    /**
     * 创建证书
     *
     * 创建证书。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCertificateRequest 请求对象
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
     * @param request CreateCertificateRequest 请求对象
     * @return SyncInvoker<CreateCertificateRequest, CreateCertificateResponse>
     */
    public SyncInvoker<CreateCertificateRequest, CreateCertificateResponse> createCertificateInvoker(
        CreateCertificateRequest request) {
        return new SyncInvoker<>(request, CaeMeta.createCertificate, hcClient);
    }

    /**
     * 删除证书
     *
     * 删除证书。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteCertificateRequest 请求对象
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
     * @param request DeleteCertificateRequest 请求对象
     * @return SyncInvoker<DeleteCertificateRequest, DeleteCertificateResponse>
     */
    public SyncInvoker<DeleteCertificateRequest, DeleteCertificateResponse> deleteCertificateInvoker(
        DeleteCertificateRequest request) {
        return new SyncInvoker<>(request, CaeMeta.deleteCertificate, hcClient);
    }

    /**
     * 获取证书列表
     *
     * 获取证书列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCertificatesRequest 请求对象
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
     * @param request ListCertificatesRequest 请求对象
     * @return SyncInvoker<ListCertificatesRequest, ListCertificatesResponse>
     */
    public SyncInvoker<ListCertificatesRequest, ListCertificatesResponse> listCertificatesInvoker(
        ListCertificatesRequest request) {
        return new SyncInvoker<>(request, CaeMeta.listCertificates, hcClient);
    }

    /**
     * 修改证书
     *
     * 修改证书。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateCertificateRequest 请求对象
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
     * @param request UpdateCertificateRequest 请求对象
     * @return SyncInvoker<UpdateCertificateRequest, UpdateCertificateResponse>
     */
    public SyncInvoker<UpdateCertificateRequest, UpdateCertificateResponse> updateCertificateInvoker(
        UpdateCertificateRequest request) {
        return new SyncInvoker<>(request, CaeMeta.updateCertificate, hcClient);
    }

    /**
     * 创建组件
     *
     * 创建组件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateComponentRequest 请求对象
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
     * @param request CreateComponentRequest 请求对象
     * @return SyncInvoker<CreateComponentRequest, CreateComponentResponse>
     */
    public SyncInvoker<CreateComponentRequest, CreateComponentResponse> createComponentInvoker(
        CreateComponentRequest request) {
        return new SyncInvoker<>(request, CaeMeta.createComponent, hcClient);
    }

    /**
     * 创建、生效配置并部署组件
     *
     * 创建、生效配置并部署组件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateComponentWithConfigurationRequest 请求对象
     * @return CreateComponentWithConfigurationResponse
     */
    public CreateComponentWithConfigurationResponse createComponentWithConfiguration(
        CreateComponentWithConfigurationRequest request) {
        return hcClient.syncInvokeHttp(request, CaeMeta.createComponentWithConfiguration);
    }

    /**
     * 创建、生效配置并部署组件
     *
     * 创建、生效配置并部署组件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateComponentWithConfigurationRequest 请求对象
     * @return SyncInvoker<CreateComponentWithConfigurationRequest, CreateComponentWithConfigurationResponse>
     */
    public SyncInvoker<CreateComponentWithConfigurationRequest, CreateComponentWithConfigurationResponse> createComponentWithConfigurationInvoker(
        CreateComponentWithConfigurationRequest request) {
        return new SyncInvoker<>(request, CaeMeta.createComponentWithConfiguration, hcClient);
    }

    /**
     * 删除组件
     *
     * 删除组件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteComponentRequest 请求对象
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
     * @param request DeleteComponentRequest 请求对象
     * @return SyncInvoker<DeleteComponentRequest, DeleteComponentResponse>
     */
    public SyncInvoker<DeleteComponentRequest, DeleteComponentResponse> deleteComponentInvoker(
        DeleteComponentRequest request) {
        return new SyncInvoker<>(request, CaeMeta.deleteComponent, hcClient);
    }

    /**
     * 操作组件
     *
     * 对组件执行指定操作，如部署、升级、重启、停止、启动、伸缩、配置、回滚。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteActionRequest 请求对象
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
     * @param request ExecuteActionRequest 请求对象
     * @return SyncInvoker<ExecuteActionRequest, ExecuteActionResponse>
     */
    public SyncInvoker<ExecuteActionRequest, ExecuteActionResponse> executeActionInvoker(ExecuteActionRequest request) {
        return new SyncInvoker<>(request, CaeMeta.executeAction, hcClient);
    }

    /**
     * 获取组件事件列表
     *
     * 获取组件事件列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListComponentEventsRequest 请求对象
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
     * @param request ListComponentEventsRequest 请求对象
     * @return SyncInvoker<ListComponentEventsRequest, ListComponentEventsResponse>
     */
    public SyncInvoker<ListComponentEventsRequest, ListComponentEventsResponse> listComponentEventsInvoker(
        ListComponentEventsRequest request) {
        return new SyncInvoker<>(request, CaeMeta.listComponentEvents, hcClient);
    }

    /**
     * 获取组件实例列表
     *
     * 获取组件实例列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListComponentInstancesRequest 请求对象
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
     * @param request ListComponentInstancesRequest 请求对象
     * @return SyncInvoker<ListComponentInstancesRequest, ListComponentInstancesResponse>
     */
    public SyncInvoker<ListComponentInstancesRequest, ListComponentInstancesResponse> listComponentInstancesInvoker(
        ListComponentInstancesRequest request) {
        return new SyncInvoker<>(request, CaeMeta.listComponentInstances, hcClient);
    }

    /**
     * 获取组件快照列表
     *
     * 获取组件快照列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListComponentSnapshotsRequest 请求对象
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
     * @param request ListComponentSnapshotsRequest 请求对象
     * @return SyncInvoker<ListComponentSnapshotsRequest, ListComponentSnapshotsResponse>
     */
    public SyncInvoker<ListComponentSnapshotsRequest, ListComponentSnapshotsResponse> listComponentSnapshotsInvoker(
        ListComponentSnapshotsRequest request) {
        return new SyncInvoker<>(request, CaeMeta.listComponentSnapshots, hcClient);
    }

    /**
     * 获取组件列表
     *
     * 获取组件列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListComponentsRequest 请求对象
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
     * @param request ListComponentsRequest 请求对象
     * @return SyncInvoker<ListComponentsRequest, ListComponentsResponse>
     */
    public SyncInvoker<ListComponentsRequest, ListComponentsResponse> listComponentsInvoker(
        ListComponentsRequest request) {
        return new SyncInvoker<>(request, CaeMeta.listComponents, hcClient);
    }

    /**
     * 获取组件详情
     *
     * 获取组件详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowComponentRequest 请求对象
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
     * @param request ShowComponentRequest 请求对象
     * @return SyncInvoker<ShowComponentRequest, ShowComponentResponse>
     */
    public SyncInvoker<ShowComponentRequest, ShowComponentResponse> showComponentInvoker(ShowComponentRequest request) {
        return new SyncInvoker<>(request, CaeMeta.showComponent, hcClient);
    }

    /**
     * 更新组件
     *
     * 更新组件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateComponentRequest 请求对象
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
     * @param request UpdateComponentRequest 请求对象
     * @return SyncInvoker<UpdateComponentRequest, UpdateComponentResponse>
     */
    public SyncInvoker<UpdateComponentRequest, UpdateComponentResponse> updateComponentInvoker(
        UpdateComponentRequest request) {
        return new SyncInvoker<>(request, CaeMeta.updateComponent, hcClient);
    }

    /**
     * 创建组件配置
     *
     * 创建组件配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateComponentConfigurationRequest 请求对象
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
     * @param request CreateComponentConfigurationRequest 请求对象
     * @return SyncInvoker<CreateComponentConfigurationRequest, CreateComponentConfigurationResponse>
     */
    public SyncInvoker<CreateComponentConfigurationRequest, CreateComponentConfigurationResponse> createComponentConfigurationInvoker(
        CreateComponentConfigurationRequest request) {
        return new SyncInvoker<>(request, CaeMeta.createComponentConfiguration, hcClient);
    }

    /**
     * 删除组件配置
     *
     * 删除组件配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteComponentConfigurationRequest 请求对象
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
     * @param request DeleteComponentConfigurationRequest 请求对象
     * @return SyncInvoker<DeleteComponentConfigurationRequest, DeleteComponentConfigurationResponse>
     */
    public SyncInvoker<DeleteComponentConfigurationRequest, DeleteComponentConfigurationResponse> deleteComponentConfigurationInvoker(
        DeleteComponentConfigurationRequest request) {
        return new SyncInvoker<>(request, CaeMeta.deleteComponentConfiguration, hcClient);
    }

    /**
     * 获取组件配置列表
     *
     * 获取组件配置列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListComponentConfigurationsRequest 请求对象
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
     * @param request ListComponentConfigurationsRequest 请求对象
     * @return SyncInvoker<ListComponentConfigurationsRequest, ListComponentConfigurationsResponse>
     */
    public SyncInvoker<ListComponentConfigurationsRequest, ListComponentConfigurationsResponse> listComponentConfigurationsInvoker(
        ListComponentConfigurationsRequest request) {
        return new SyncInvoker<>(request, CaeMeta.listComponentConfigurations, hcClient);
    }

    /**
     * 创建域名
     *
     * 创建域名。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDomainRequest 请求对象
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
     * @param request CreateDomainRequest 请求对象
     * @return SyncInvoker<CreateDomainRequest, CreateDomainResponse>
     */
    public SyncInvoker<CreateDomainRequest, CreateDomainResponse> createDomainInvoker(CreateDomainRequest request) {
        return new SyncInvoker<>(request, CaeMeta.createDomain, hcClient);
    }

    /**
     * 删除域名
     *
     * 删除域名。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDomainRequest 请求对象
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
     * @param request DeleteDomainRequest 请求对象
     * @return SyncInvoker<DeleteDomainRequest, DeleteDomainResponse>
     */
    public SyncInvoker<DeleteDomainRequest, DeleteDomainResponse> deleteDomainInvoker(DeleteDomainRequest request) {
        return new SyncInvoker<>(request, CaeMeta.deleteDomain, hcClient);
    }

    /**
     * 获取域名列表
     *
     * 获取域名列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDomainsRequest 请求对象
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
     * @param request ListDomainsRequest 请求对象
     * @return SyncInvoker<ListDomainsRequest, ListDomainsResponse>
     */
    public SyncInvoker<ListDomainsRequest, ListDomainsResponse> listDomainsInvoker(ListDomainsRequest request) {
        return new SyncInvoker<>(request, CaeMeta.listDomains, hcClient);
    }

    /**
     * 获取集群节点弹性公网IP列表
     *
     * 获取集群节点弹性公网IP列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEipsRequest 请求对象
     * @return ListEipsResponse
     */
    public ListEipsResponse listEips(ListEipsRequest request) {
        return hcClient.syncInvokeHttp(request, CaeMeta.listEips);
    }

    /**
     * 获取集群节点弹性公网IP列表
     *
     * 获取集群节点弹性公网IP列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEipsRequest 请求对象
     * @return SyncInvoker<ListEipsRequest, ListEipsResponse>
     */
    public SyncInvoker<ListEipsRequest, ListEipsResponse> listEipsInvoker(ListEipsRequest request) {
        return new SyncInvoker<>(request, CaeMeta.listEips, hcClient);
    }

    /**
     * 修改出入网带宽以及开闭状态
     *
     * 修改出入网带宽以及开闭状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateEipRequest 请求对象
     * @return UpdateEipResponse
     */
    public UpdateEipResponse updateEip(UpdateEipRequest request) {
        return hcClient.syncInvokeHttp(request, CaeMeta.updateEip);
    }

    /**
     * 修改出入网带宽以及开闭状态
     *
     * 修改出入网带宽以及开闭状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateEipRequest 请求对象
     * @return SyncInvoker<UpdateEipRequest, UpdateEipResponse>
     */
    public SyncInvoker<UpdateEipRequest, UpdateEipResponse> updateEipInvoker(UpdateEipRequest request) {
        return new SyncInvoker<>(request, CaeMeta.updateEip, hcClient);
    }

    /**
     * 创建环境
     *
     * 创建环境。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateEnvironmentRequest 请求对象
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
     * @param request CreateEnvironmentRequest 请求对象
     * @return SyncInvoker<CreateEnvironmentRequest, CreateEnvironmentResponse>
     */
    public SyncInvoker<CreateEnvironmentRequest, CreateEnvironmentResponse> createEnvironmentInvoker(
        CreateEnvironmentRequest request) {
        return new SyncInvoker<>(request, CaeMeta.createEnvironment, hcClient);
    }

    /**
     * 删除环境
     *
     * 删除环境。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteEnvironmentRequest 请求对象
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
     * @param request DeleteEnvironmentRequest 请求对象
     * @return SyncInvoker<DeleteEnvironmentRequest, DeleteEnvironmentResponse>
     */
    public SyncInvoker<DeleteEnvironmentRequest, DeleteEnvironmentResponse> deleteEnvironmentInvoker(
        DeleteEnvironmentRequest request) {
        return new SyncInvoker<>(request, CaeMeta.deleteEnvironment, hcClient);
    }

    /**
     * 获取环境列表
     *
     * 获取环境列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEnvironmentsRequest 请求对象
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
     * @param request ListEnvironmentsRequest 请求对象
     * @return SyncInvoker<ListEnvironmentsRequest, ListEnvironmentsResponse>
     */
    public SyncInvoker<ListEnvironmentsRequest, ListEnvironmentsResponse> listEnvironmentsInvoker(
        ListEnvironmentsRequest request) {
        return new SyncInvoker<>(request, CaeMeta.listEnvironments, hcClient);
    }

    /**
     * 重试任务
     *
     * 重试任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RetryJobRequest 请求对象
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
     * @param request RetryJobRequest 请求对象
     * @return SyncInvoker<RetryJobRequest, RetryJobResponse>
     */
    public SyncInvoker<RetryJobRequest, RetryJobResponse> retryJobInvoker(RetryJobRequest request) {
        return new SyncInvoker<>(request, CaeMeta.retryJob, hcClient);
    }

    /**
     * 获取任务详情
     *
     * 获取任务详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowJobRequest 请求对象
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
     * @param request ShowJobRequest 请求对象
     * @return SyncInvoker<ShowJobRequest, ShowJobResponse>
     */
    public SyncInvoker<ShowJobRequest, ShowJobResponse> showJobInvoker(ShowJobRequest request) {
        return new SyncInvoker<>(request, CaeMeta.showJob, hcClient);
    }

    /**
     * 创建监控系统配置
     *
     * 创建监控系统配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateMonitorSystemRequest 请求对象
     * @return CreateMonitorSystemResponse
     */
    public CreateMonitorSystemResponse createMonitorSystem(CreateMonitorSystemRequest request) {
        return hcClient.syncInvokeHttp(request, CaeMeta.createMonitorSystem);
    }

    /**
     * 创建监控系统配置
     *
     * 创建监控系统配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateMonitorSystemRequest 请求对象
     * @return SyncInvoker<CreateMonitorSystemRequest, CreateMonitorSystemResponse>
     */
    public SyncInvoker<CreateMonitorSystemRequest, CreateMonitorSystemResponse> createMonitorSystemInvoker(
        CreateMonitorSystemRequest request) {
        return new SyncInvoker<>(request, CaeMeta.createMonitorSystem, hcClient);
    }

    /**
     * 获取监控系统配置
     *
     * 获取监控系统配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMonitorSystemRequest 请求对象
     * @return ShowMonitorSystemResponse
     */
    public ShowMonitorSystemResponse showMonitorSystem(ShowMonitorSystemRequest request) {
        return hcClient.syncInvokeHttp(request, CaeMeta.showMonitorSystem);
    }

    /**
     * 获取监控系统配置
     *
     * 获取监控系统配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMonitorSystemRequest 请求对象
     * @return SyncInvoker<ShowMonitorSystemRequest, ShowMonitorSystemResponse>
     */
    public SyncInvoker<ShowMonitorSystemRequest, ShowMonitorSystemResponse> showMonitorSystemInvoker(
        ShowMonitorSystemRequest request) {
        return new SyncInvoker<>(request, CaeMeta.showMonitorSystem, hcClient);
    }

    /**
     * 更新监控系统配置
     *
     * 更新监控系统配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateMonitorSystemRequest 请求对象
     * @return UpdateMonitorSystemResponse
     */
    public UpdateMonitorSystemResponse updateMonitorSystem(UpdateMonitorSystemRequest request) {
        return hcClient.syncInvokeHttp(request, CaeMeta.updateMonitorSystem);
    }

    /**
     * 更新监控系统配置
     *
     * 更新监控系统配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateMonitorSystemRequest 请求对象
     * @return SyncInvoker<UpdateMonitorSystemRequest, UpdateMonitorSystemResponse>
     */
    public SyncInvoker<UpdateMonitorSystemRequest, UpdateMonitorSystemResponse> updateMonitorSystemInvoker(
        UpdateMonitorSystemRequest request) {
        return new SyncInvoker<>(request, CaeMeta.updateMonitorSystem, hcClient);
    }

    /**
     * 创建事件通知规则。
     *
     * 创建事件通知规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateNoticeRuleRequest 请求对象
     * @return CreateNoticeRuleResponse
     */
    public CreateNoticeRuleResponse createNoticeRule(CreateNoticeRuleRequest request) {
        return hcClient.syncInvokeHttp(request, CaeMeta.createNoticeRule);
    }

    /**
     * 创建事件通知规则。
     *
     * 创建事件通知规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateNoticeRuleRequest 请求对象
     * @return SyncInvoker<CreateNoticeRuleRequest, CreateNoticeRuleResponse>
     */
    public SyncInvoker<CreateNoticeRuleRequest, CreateNoticeRuleResponse> createNoticeRuleInvoker(
        CreateNoticeRuleRequest request) {
        return new SyncInvoker<>(request, CaeMeta.createNoticeRule, hcClient);
    }

    /**
     * 删除事件通知规则。
     *
     * 删除事件通知规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteNoticeRuleRequest 请求对象
     * @return DeleteNoticeRuleResponse
     */
    public DeleteNoticeRuleResponse deleteNoticeRule(DeleteNoticeRuleRequest request) {
        return hcClient.syncInvokeHttp(request, CaeMeta.deleteNoticeRule);
    }

    /**
     * 删除事件通知规则。
     *
     * 删除事件通知规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteNoticeRuleRequest 请求对象
     * @return SyncInvoker<DeleteNoticeRuleRequest, DeleteNoticeRuleResponse>
     */
    public SyncInvoker<DeleteNoticeRuleRequest, DeleteNoticeRuleResponse> deleteNoticeRuleInvoker(
        DeleteNoticeRuleRequest request) {
        return new SyncInvoker<>(request, CaeMeta.deleteNoticeRule, hcClient);
    }

    /**
     * 查询事件通知规则列表。
     *
     * 查询事件通知规则列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListNoticeRulesRequest 请求对象
     * @return ListNoticeRulesResponse
     */
    public ListNoticeRulesResponse listNoticeRules(ListNoticeRulesRequest request) {
        return hcClient.syncInvokeHttp(request, CaeMeta.listNoticeRules);
    }

    /**
     * 查询事件通知规则列表。
     *
     * 查询事件通知规则列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListNoticeRulesRequest 请求对象
     * @return SyncInvoker<ListNoticeRulesRequest, ListNoticeRulesResponse>
     */
    public SyncInvoker<ListNoticeRulesRequest, ListNoticeRulesResponse> listNoticeRulesInvoker(
        ListNoticeRulesRequest request) {
        return new SyncInvoker<>(request, CaeMeta.listNoticeRules, hcClient);
    }

    /**
     * 查询事件通知规则。
     *
     * 查询事件通知规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowNoticeRuleRequest 请求对象
     * @return ShowNoticeRuleResponse
     */
    public ShowNoticeRuleResponse showNoticeRule(ShowNoticeRuleRequest request) {
        return hcClient.syncInvokeHttp(request, CaeMeta.showNoticeRule);
    }

    /**
     * 查询事件通知规则。
     *
     * 查询事件通知规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowNoticeRuleRequest 请求对象
     * @return SyncInvoker<ShowNoticeRuleRequest, ShowNoticeRuleResponse>
     */
    public SyncInvoker<ShowNoticeRuleRequest, ShowNoticeRuleResponse> showNoticeRuleInvoker(
        ShowNoticeRuleRequest request) {
        return new SyncInvoker<>(request, CaeMeta.showNoticeRule, hcClient);
    }

    /**
     * 修改事件通知规则。
     *
     * 修改事件通知规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateNoticeRuleRequest 请求对象
     * @return UpdateNoticeRuleResponse
     */
    public UpdateNoticeRuleResponse updateNoticeRule(UpdateNoticeRuleRequest request) {
        return hcClient.syncInvokeHttp(request, CaeMeta.updateNoticeRule);
    }

    /**
     * 修改事件通知规则。
     *
     * 修改事件通知规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateNoticeRuleRequest 请求对象
     * @return SyncInvoker<UpdateNoticeRuleRequest, UpdateNoticeRuleResponse>
     */
    public SyncInvoker<UpdateNoticeRuleRequest, UpdateNoticeRuleResponse> updateNoticeRuleInvoker(
        UpdateNoticeRuleRequest request) {
        return new SyncInvoker<>(request, CaeMeta.updateNoticeRule, hcClient);
    }

    /**
     * 创建定时启停规则
     *
     * 创建定时启停规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTimerRuleRequest 请求对象
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
     * @param request CreateTimerRuleRequest 请求对象
     * @return SyncInvoker<CreateTimerRuleRequest, CreateTimerRuleResponse>
     */
    public SyncInvoker<CreateTimerRuleRequest, CreateTimerRuleResponse> createTimerRuleInvoker(
        CreateTimerRuleRequest request) {
        return new SyncInvoker<>(request, CaeMeta.createTimerRule, hcClient);
    }

    /**
     * 删除定时启停规则
     *
     * 删除定时启停规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTimerRuleRequest 请求对象
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
     * @param request DeleteTimerRuleRequest 请求对象
     * @return SyncInvoker<DeleteTimerRuleRequest, DeleteTimerRuleResponse>
     */
    public SyncInvoker<DeleteTimerRuleRequest, DeleteTimerRuleResponse> deleteTimerRuleInvoker(
        DeleteTimerRuleRequest request) {
        return new SyncInvoker<>(request, CaeMeta.deleteTimerRule, hcClient);
    }

    /**
     * 获取定时启停规则列表
     *
     * 获取定时启停规则列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTimerRulesRequest 请求对象
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
     * @param request ListTimerRulesRequest 请求对象
     * @return SyncInvoker<ListTimerRulesRequest, ListTimerRulesResponse>
     */
    public SyncInvoker<ListTimerRulesRequest, ListTimerRulesResponse> listTimerRulesInvoker(
        ListTimerRulesRequest request) {
        return new SyncInvoker<>(request, CaeMeta.listTimerRules, hcClient);
    }

    /**
     * 获取上次定时启停规则的执行情况
     *
     * 获取上次定时启停规则的执行情况。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowExecutionResultRequest 请求对象
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
     * @param request ShowExecutionResultRequest 请求对象
     * @return SyncInvoker<ShowExecutionResultRequest, ShowExecutionResultResponse>
     */
    public SyncInvoker<ShowExecutionResultRequest, ShowExecutionResultResponse> showExecutionResultInvoker(
        ShowExecutionResultRequest request) {
        return new SyncInvoker<>(request, CaeMeta.showExecutionResult, hcClient);
    }

    /**
     * 修改定时启停规则
     *
     * 修改定时启停规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTimerRuleRequest 请求对象
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
     * @param request UpdateTimerRuleRequest 请求对象
     * @return SyncInvoker<UpdateTimerRuleRequest, UpdateTimerRuleResponse>
     */
    public SyncInvoker<UpdateTimerRuleRequest, UpdateTimerRuleResponse> updateTimerRuleInvoker(
        UpdateTimerRuleRequest request) {
        return new SyncInvoker<>(request, CaeMeta.updateTimerRule, hcClient);
    }

    /**
     * 授权云存储
     *
     * 授权云存储。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateVolumeRequest 请求对象
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
     * @param request CreateVolumeRequest 请求对象
     * @return SyncInvoker<CreateVolumeRequest, CreateVolumeResponse>
     */
    public SyncInvoker<CreateVolumeRequest, CreateVolumeResponse> createVolumeInvoker(CreateVolumeRequest request) {
        return new SyncInvoker<>(request, CaeMeta.createVolume, hcClient);
    }

    /**
     * 解绑云存储
     *
     * 解绑云存储。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteVolumeRequest 请求对象
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
     * @param request DeleteVolumeRequest 请求对象
     * @return SyncInvoker<DeleteVolumeRequest, DeleteVolumeResponse>
     */
    public SyncInvoker<DeleteVolumeRequest, DeleteVolumeResponse> deleteVolumeInvoker(DeleteVolumeRequest request) {
        return new SyncInvoker<>(request, CaeMeta.deleteVolume, hcClient);
    }

    /**
     * 获取云存储列表
     *
     * 获取云存储列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVolumesRequest 请求对象
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
     * @param request ListVolumesRequest 请求对象
     * @return SyncInvoker<ListVolumesRequest, ListVolumesResponse>
     */
    public SyncInvoker<ListVolumesRequest, ListVolumesResponse> listVolumesInvoker(ListVolumesRequest request) {
        return new SyncInvoker<>(request, CaeMeta.listVolumes, hcClient);
    }

    /**
     * 创建CAE环境访问VPC配置
     *
     * 创建CAE环境访问VPC配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateVpcEgressRequest 请求对象
     * @return CreateVpcEgressResponse
     */
    public CreateVpcEgressResponse createVpcEgress(CreateVpcEgressRequest request) {
        return hcClient.syncInvokeHttp(request, CaeMeta.createVpcEgress);
    }

    /**
     * 创建CAE环境访问VPC配置
     *
     * 创建CAE环境访问VPC配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateVpcEgressRequest 请求对象
     * @return SyncInvoker<CreateVpcEgressRequest, CreateVpcEgressResponse>
     */
    public SyncInvoker<CreateVpcEgressRequest, CreateVpcEgressResponse> createVpcEgressInvoker(
        CreateVpcEgressRequest request) {
        return new SyncInvoker<>(request, CaeMeta.createVpcEgress, hcClient);
    }

    /**
     * 删除CAE环境访问VPC配置
     *
     * 删除CAE环境访问VPC配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteVpcEgressRequest 请求对象
     * @return DeleteVpcEgressResponse
     */
    public DeleteVpcEgressResponse deleteVpcEgress(DeleteVpcEgressRequest request) {
        return hcClient.syncInvokeHttp(request, CaeMeta.deleteVpcEgress);
    }

    /**
     * 删除CAE环境访问VPC配置
     *
     * 删除CAE环境访问VPC配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteVpcEgressRequest 请求对象
     * @return SyncInvoker<DeleteVpcEgressRequest, DeleteVpcEgressResponse>
     */
    public SyncInvoker<DeleteVpcEgressRequest, DeleteVpcEgressResponse> deleteVpcEgressInvoker(
        DeleteVpcEgressRequest request) {
        return new SyncInvoker<>(request, CaeMeta.deleteVpcEgress, hcClient);
    }

    /**
     * 获取CAE环境访问VPC配置
     *
     * 获取CAE环境访问VPC配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVpcEgressRequest 请求对象
     * @return ListVpcEgressResponse
     */
    public ListVpcEgressResponse listVpcEgress(ListVpcEgressRequest request) {
        return hcClient.syncInvokeHttp(request, CaeMeta.listVpcEgress);
    }

    /**
     * 获取CAE环境访问VPC配置
     *
     * 获取CAE环境访问VPC配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVpcEgressRequest 请求对象
     * @return SyncInvoker<ListVpcEgressRequest, ListVpcEgressResponse>
     */
    public SyncInvoker<ListVpcEgressRequest, ListVpcEgressResponse> listVpcEgressInvoker(ListVpcEgressRequest request) {
        return new SyncInvoker<>(request, CaeMeta.listVpcEgress, hcClient);
    }

}
