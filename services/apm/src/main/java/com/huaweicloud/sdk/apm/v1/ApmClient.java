package com.huaweicloud.sdk.apm.v1;

import com.huaweicloud.sdk.apm.v1.model.ChangeAgentStatusRequest;
import com.huaweicloud.sdk.apm.v1.model.ChangeAgentStatusResponse;
import com.huaweicloud.sdk.apm.v1.model.CreateAkSkRequest;
import com.huaweicloud.sdk.apm.v1.model.CreateAkSkResponse;
import com.huaweicloud.sdk.apm.v1.model.DeleteAgentRequest;
import com.huaweicloud.sdk.apm.v1.model.DeleteAgentResponse;
import com.huaweicloud.sdk.apm.v1.model.DeleteAkSkRequest;
import com.huaweicloud.sdk.apm.v1.model.DeleteAkSkResponse;
import com.huaweicloud.sdk.apm.v1.model.DeleteAppRequest;
import com.huaweicloud.sdk.apm.v1.model.DeleteAppResponse;
import com.huaweicloud.sdk.apm.v1.model.ListAkSkRequest;
import com.huaweicloud.sdk.apm.v1.model.ListAkSkResponse;
import com.huaweicloud.sdk.apm.v1.model.ListAlarmDataRequest;
import com.huaweicloud.sdk.apm.v1.model.ListAlarmDataResponse;
import com.huaweicloud.sdk.apm.v1.model.ListAlarmNotifyRequest;
import com.huaweicloud.sdk.apm.v1.model.ListAlarmNotifyResponse;
import com.huaweicloud.sdk.apm.v1.model.ListAppEnvsRequest;
import com.huaweicloud.sdk.apm.v1.model.ListAppEnvsResponse;
import com.huaweicloud.sdk.apm.v1.model.ListAppsRequest;
import com.huaweicloud.sdk.apm.v1.model.ListAppsResponse;
import com.huaweicloud.sdk.apm.v1.model.ListBusinessEnvRequest;
import com.huaweicloud.sdk.apm.v1.model.ListBusinessEnvResponse;
import com.huaweicloud.sdk.apm.v1.model.ListBusinessRequest;
import com.huaweicloud.sdk.apm.v1.model.ListBusinessResponse;
import com.huaweicloud.sdk.apm.v1.model.ListEnvInstancesRequest;
import com.huaweicloud.sdk.apm.v1.model.ListEnvInstancesResponse;
import com.huaweicloud.sdk.apm.v1.model.ListEnvMonitorItemRequest;
import com.huaweicloud.sdk.apm.v1.model.ListEnvMonitorItemResponse;
import com.huaweicloud.sdk.apm.v1.model.ListEnvTagsRequest;
import com.huaweicloud.sdk.apm.v1.model.ListEnvTagsResponse;
import com.huaweicloud.sdk.apm.v1.model.ListOpenRegionRequest;
import com.huaweicloud.sdk.apm.v1.model.ListOpenRegionResponse;
import com.huaweicloud.sdk.apm.v1.model.ListSupportedRegionRequest;
import com.huaweicloud.sdk.apm.v1.model.ListSupportedRegionResponse;
import com.huaweicloud.sdk.apm.v1.model.SaveMonitorItemConfigRequest;
import com.huaweicloud.sdk.apm.v1.model.SaveMonitorItemConfigResponse;
import com.huaweicloud.sdk.apm.v1.model.SearchAgentRequest;
import com.huaweicloud.sdk.apm.v1.model.SearchAgentResponse;
import com.huaweicloud.sdk.apm.v1.model.SearchApplicationRequest;
import com.huaweicloud.sdk.apm.v1.model.SearchApplicationResponse;
import com.huaweicloud.sdk.apm.v1.model.SearchBusinessTopologyRequest;
import com.huaweicloud.sdk.apm.v1.model.SearchBusinessTopologyResponse;
import com.huaweicloud.sdk.apm.v1.model.SearchEnvTopologyRequest;
import com.huaweicloud.sdk.apm.v1.model.SearchEnvTopologyResponse;
import com.huaweicloud.sdk.apm.v1.model.SearchTransactionConfigRequest;
import com.huaweicloud.sdk.apm.v1.model.SearchTransactionConfigResponse;
import com.huaweicloud.sdk.apm.v1.model.SearchTransactionRequest;
import com.huaweicloud.sdk.apm.v1.model.SearchTransactionResponse;
import com.huaweicloud.sdk.apm.v1.model.ShowAkSksRequest;
import com.huaweicloud.sdk.apm.v1.model.ShowAkSksResponse;
import com.huaweicloud.sdk.apm.v1.model.ShowBusinessDetailRequest;
import com.huaweicloud.sdk.apm.v1.model.ShowBusinessDetailResponse;
import com.huaweicloud.sdk.apm.v1.model.ShowClobDetailRequest;
import com.huaweicloud.sdk.apm.v1.model.ShowClobDetailResponse;
import com.huaweicloud.sdk.apm.v1.model.ShowEnvMonitorItemsRequest;
import com.huaweicloud.sdk.apm.v1.model.ShowEnvMonitorItemsResponse;
import com.huaweicloud.sdk.apm.v1.model.ShowEventDetailRequest;
import com.huaweicloud.sdk.apm.v1.model.ShowEventDetailResponse;
import com.huaweicloud.sdk.apm.v1.model.ShowMasterAddressRequest;
import com.huaweicloud.sdk.apm.v1.model.ShowMasterAddressResponse;
import com.huaweicloud.sdk.apm.v1.model.ShowMonitorItemViewConfigRequest;
import com.huaweicloud.sdk.apm.v1.model.ShowMonitorItemViewConfigResponse;
import com.huaweicloud.sdk.apm.v1.model.ShowRawTableRequest;
import com.huaweicloud.sdk.apm.v1.model.ShowRawTableResponse;
import com.huaweicloud.sdk.apm.v1.model.ShowSpanSearchRequest;
import com.huaweicloud.sdk.apm.v1.model.ShowSpanSearchResponse;
import com.huaweicloud.sdk.apm.v1.model.ShowSubBusinessDetailRequest;
import com.huaweicloud.sdk.apm.v1.model.ShowSubBusinessDetailResponse;
import com.huaweicloud.sdk.apm.v1.model.ShowSumTableRequest;
import com.huaweicloud.sdk.apm.v1.model.ShowSumTableResponse;
import com.huaweicloud.sdk.apm.v1.model.ShowTopologyRequest;
import com.huaweicloud.sdk.apm.v1.model.ShowTopologyResponse;
import com.huaweicloud.sdk.apm.v1.model.ShowTopologyTreeRequest;
import com.huaweicloud.sdk.apm.v1.model.ShowTopologyTreeResponse;
import com.huaweicloud.sdk.apm.v1.model.ShowTraceEventsRequest;
import com.huaweicloud.sdk.apm.v1.model.ShowTraceEventsResponse;
import com.huaweicloud.sdk.apm.v1.model.ShowTransactionDetailRequest;
import com.huaweicloud.sdk.apm.v1.model.ShowTransactionDetailResponse;
import com.huaweicloud.sdk.apm.v1.model.ShowTrendRequest;
import com.huaweicloud.sdk.apm.v1.model.ShowTrendResponse;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;

public class ApmClient {

    protected HcClient hcClient;

    public ApmClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<ApmClient> newBuilder() {
        ClientBuilder<ApmClient> clientBuilder = new ClientBuilder<>(ApmClient::new);
        return clientBuilder;
    }

    /**
     * 创建aksk
     *
     * 创建aksk。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAkSkRequest 请求对象
     * @return CreateAkSkResponse
     */
    public CreateAkSkResponse createAkSk(CreateAkSkRequest request) {
        return hcClient.syncInvokeHttp(request, ApmMeta.createAkSk);
    }

    /**
     * 创建aksk
     *
     * 创建aksk。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAkSkRequest 请求对象
     * @return SyncInvoker<CreateAkSkRequest, CreateAkSkResponse>
     */
    public SyncInvoker<CreateAkSkRequest, CreateAkSkResponse> createAkSkInvoker(CreateAkSkRequest request) {
        return new SyncInvoker<>(request, ApmMeta.createAkSk, hcClient);
    }

    /**
     * 删除aksk
     *
     * 删除aksk。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAkSkRequest 请求对象
     * @return DeleteAkSkResponse
     */
    public DeleteAkSkResponse deleteAkSk(DeleteAkSkRequest request) {
        return hcClient.syncInvokeHttp(request, ApmMeta.deleteAkSk);
    }

    /**
     * 删除aksk
     *
     * 删除aksk。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAkSkRequest 请求对象
     * @return SyncInvoker<DeleteAkSkRequest, DeleteAkSkResponse>
     */
    public SyncInvoker<DeleteAkSkRequest, DeleteAkSkResponse> deleteAkSkInvoker(DeleteAkSkRequest request) {
        return new SyncInvoker<>(request, ApmMeta.deleteAkSk, hcClient);
    }

    /**
     * 查询租户的aksk
     *
     * 查询租户的aksk。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAkSksRequest 请求对象
     * @return ShowAkSksResponse
     */
    public ShowAkSksResponse showAkSks(ShowAkSksRequest request) {
        return hcClient.syncInvokeHttp(request, ApmMeta.showAkSks);
    }

    /**
     * 查询租户的aksk
     *
     * 查询租户的aksk。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAkSksRequest 请求对象
     * @return SyncInvoker<ShowAkSksRequest, ShowAkSksResponse>
     */
    public SyncInvoker<ShowAkSksRequest, ShowAkSksResponse> showAkSksInvoker(ShowAkSksRequest request) {
        return new SyncInvoker<>(request, ApmMeta.showAkSks, hcClient);
    }

    /**
     * 查询告警列表
     *
     * 查询系统中存在的告警。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAlarmDataRequest 请求对象
     * @return ListAlarmDataResponse
     */
    public ListAlarmDataResponse listAlarmData(ListAlarmDataRequest request) {
        return hcClient.syncInvokeHttp(request, ApmMeta.listAlarmData);
    }

    /**
     * 查询告警列表
     *
     * 查询系统中存在的告警。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAlarmDataRequest 请求对象
     * @return SyncInvoker<ListAlarmDataRequest, ListAlarmDataResponse>
     */
    public SyncInvoker<ListAlarmDataRequest, ListAlarmDataResponse> listAlarmDataInvoker(ListAlarmDataRequest request) {
        return new SyncInvoker<>(request, ApmMeta.listAlarmData, hcClient);
    }

    /**
     * 查询告警消息列表
     *
     * 查询单个告警的触发详情与历史。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAlarmNotifyRequest 请求对象
     * @return ListAlarmNotifyResponse
     */
    public ListAlarmNotifyResponse listAlarmNotify(ListAlarmNotifyRequest request) {
        return hcClient.syncInvokeHttp(request, ApmMeta.listAlarmNotify);
    }

    /**
     * 查询告警消息列表
     *
     * 查询单个告警的触发详情与历史。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAlarmNotifyRequest 请求对象
     * @return SyncInvoker<ListAlarmNotifyRequest, ListAlarmNotifyResponse>
     */
    public SyncInvoker<ListAlarmNotifyRequest, ListAlarmNotifyResponse> listAlarmNotifyInvoker(
        ListAlarmNotifyRequest request) {
        return new SyncInvoker<>(request, ApmMeta.listAlarmNotify, hcClient);
    }

    /**
     * 更改实例的采集状态
     *
     * 改变指定实例的采集状态：开启和关闭。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeAgentStatusRequest 请求对象
     * @return ChangeAgentStatusResponse
     */
    public ChangeAgentStatusResponse changeAgentStatus(ChangeAgentStatusRequest request) {
        return hcClient.syncInvokeHttp(request, ApmMeta.changeAgentStatus);
    }

    /**
     * 更改实例的采集状态
     *
     * 改变指定实例的采集状态：开启和关闭。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeAgentStatusRequest 请求对象
     * @return SyncInvoker<ChangeAgentStatusRequest, ChangeAgentStatusResponse>
     */
    public SyncInvoker<ChangeAgentStatusRequest, ChangeAgentStatusResponse> changeAgentStatusInvoker(
        ChangeAgentStatusRequest request) {
        return new SyncInvoker<>(request, ApmMeta.changeAgentStatus, hcClient);
    }

    /**
     * 删除agent
     *
     * 删除agent
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAgentRequest 请求对象
     * @return DeleteAgentResponse
     */
    public DeleteAgentResponse deleteAgent(DeleteAgentRequest request) {
        return hcClient.syncInvokeHttp(request, ApmMeta.deleteAgent);
    }

    /**
     * 删除agent
     *
     * 删除agent
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAgentRequest 请求对象
     * @return SyncInvoker<DeleteAgentRequest, DeleteAgentResponse>
     */
    public SyncInvoker<DeleteAgentRequest, DeleteAgentResponse> deleteAgentInvoker(DeleteAgentRequest request) {
        return new SyncInvoker<>(request, ApmMeta.deleteAgent, hcClient);
    }

    /**
     * 获取ak/sk
     *
     * 获取该用户创建的ak/sk列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAkSkRequest 请求对象
     * @return ListAkSkResponse
     */
    public ListAkSkResponse listAkSk(ListAkSkRequest request) {
        return hcClient.syncInvokeHttp(request, ApmMeta.listAkSk);
    }

    /**
     * 获取ak/sk
     *
     * 获取该用户创建的ak/sk列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAkSkRequest 请求对象
     * @return SyncInvoker<ListAkSkRequest, ListAkSkResponse>
     */
    public SyncInvoker<ListAkSkRequest, ListAkSkResponse> listAkSkInvoker(ListAkSkRequest request) {
        return new SyncInvoker<>(request, ApmMeta.listAkSk, hcClient);
    }

    /**
     * 查询应用列表
     *
     * 该接口用于查询对应用户下的应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBusinessRequest 请求对象
     * @return ListBusinessResponse
     */
    public ListBusinessResponse listBusiness(ListBusinessRequest request) {
        return hcClient.syncInvokeHttp(request, ApmMeta.listBusiness);
    }

    /**
     * 查询应用列表
     *
     * 该接口用于查询对应用户下的应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBusinessRequest 请求对象
     * @return SyncInvoker<ListBusinessRequest, ListBusinessResponse>
     */
    public SyncInvoker<ListBusinessRequest, ListBusinessResponse> listBusinessInvoker(ListBusinessRequest request) {
        return new SyncInvoker<>(request, ApmMeta.listBusiness, hcClient);
    }

    /**
     * 查询监控项列表
     *
     * 查询监控项列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEnvMonitorItemRequest 请求对象
     * @return ListEnvMonitorItemResponse
     */
    public ListEnvMonitorItemResponse listEnvMonitorItem(ListEnvMonitorItemRequest request) {
        return hcClient.syncInvokeHttp(request, ApmMeta.listEnvMonitorItem);
    }

    /**
     * 查询监控项列表
     *
     * 查询监控项列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEnvMonitorItemRequest 请求对象
     * @return SyncInvoker<ListEnvMonitorItemRequest, ListEnvMonitorItemResponse>
     */
    public SyncInvoker<ListEnvMonitorItemRequest, ListEnvMonitorItemResponse> listEnvMonitorItemInvoker(
        ListEnvMonitorItemRequest request) {
        return new SyncInvoker<>(request, ApmMeta.listEnvMonitorItem, hcClient);
    }

    /**
     * 保存监控项
     *
     * 保存监控项。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SaveMonitorItemConfigRequest 请求对象
     * @return SaveMonitorItemConfigResponse
     */
    public SaveMonitorItemConfigResponse saveMonitorItemConfig(SaveMonitorItemConfigRequest request) {
        return hcClient.syncInvokeHttp(request, ApmMeta.saveMonitorItemConfig);
    }

    /**
     * 保存监控项
     *
     * 保存监控项。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SaveMonitorItemConfigRequest 请求对象
     * @return SyncInvoker<SaveMonitorItemConfigRequest, SaveMonitorItemConfigResponse>
     */
    public SyncInvoker<SaveMonitorItemConfigRequest, SaveMonitorItemConfigResponse> saveMonitorItemConfigInvoker(
        SaveMonitorItemConfigRequest request) {
        return new SyncInvoker<>(request, ApmMeta.saveMonitorItemConfig, hcClient);
    }

    /**
     * 查询应用下所有探针
     *
     * 该接口用于搜索应用下所有探针情况。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchAgentRequest 请求对象
     * @return SearchAgentResponse
     */
    public SearchAgentResponse searchAgent(SearchAgentRequest request) {
        return hcClient.syncInvokeHttp(request, ApmMeta.searchAgent);
    }

    /**
     * 查询应用下所有探针
     *
     * 该接口用于搜索应用下所有探针情况。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchAgentRequest 请求对象
     * @return SyncInvoker<SearchAgentRequest, SearchAgentResponse>
     */
    public SyncInvoker<SearchAgentRequest, SearchAgentResponse> searchAgentInvoker(SearchAgentRequest request) {
        return new SyncInvoker<>(request, ApmMeta.searchAgent, hcClient);
    }

    /**
     * 对指定区域下的组件和环境及其探针情况进行搜索
     *
     * 对指定区域下的组件和环境及其探针情况进行搜索。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchApplicationRequest 请求对象
     * @return SearchApplicationResponse
     */
    public SearchApplicationResponse searchApplication(SearchApplicationRequest request) {
        return hcClient.syncInvokeHttp(request, ApmMeta.searchApplication);
    }

    /**
     * 对指定区域下的组件和环境及其探针情况进行搜索
     *
     * 对指定区域下的组件和环境及其探针情况进行搜索。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchApplicationRequest 请求对象
     * @return SyncInvoker<SearchApplicationRequest, SearchApplicationResponse>
     */
    public SyncInvoker<SearchApplicationRequest, SearchApplicationResponse> searchApplicationInvoker(
        SearchApplicationRequest request) {
        return new SyncInvoker<>(request, ApmMeta.searchApplication, hcClient);
    }

    /**
     * 查询master地址
     *
     * 根据region名称获取该region下的master服务podlb地址信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMasterAddressRequest 请求对象
     * @return ShowMasterAddressResponse
     */
    public ShowMasterAddressResponse showMasterAddress(ShowMasterAddressRequest request) {
        return hcClient.syncInvokeHttp(request, ApmMeta.showMasterAddress);
    }

    /**
     * 查询master地址
     *
     * 根据region名称获取该region下的master服务podlb地址信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMasterAddressRequest 请求对象
     * @return SyncInvoker<ShowMasterAddressRequest, ShowMasterAddressResponse>
     */
    public SyncInvoker<ShowMasterAddressRequest, ShowMasterAddressResponse> showMasterAddressInvoker(
        ShowMasterAddressRequest request) {
        return new SyncInvoker<>(request, ApmMeta.showMasterAddress, hcClient);
    }

    /**
     * 根据组件id删除指定的组件
     *
     * 该接口用于删除指定的组件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAppRequest 请求对象
     * @return DeleteAppResponse
     */
    public DeleteAppResponse deleteApp(DeleteAppRequest request) {
        return hcClient.syncInvokeHttp(request, ApmMeta.deleteApp);
    }

    /**
     * 根据组件id删除指定的组件
     *
     * 该接口用于删除指定的组件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAppRequest 请求对象
     * @return SyncInvoker<DeleteAppRequest, DeleteAppResponse>
     */
    public SyncInvoker<DeleteAppRequest, DeleteAppResponse> deleteAppInvoker(DeleteAppRequest request) {
        return new SyncInvoker<>(request, ApmMeta.deleteApp, hcClient);
    }

    /**
     * 获取组件下的环境列表
     *
     * 获取组件下的环境列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAppEnvsRequest 请求对象
     * @return ListAppEnvsResponse
     */
    public ListAppEnvsResponse listAppEnvs(ListAppEnvsRequest request) {
        return hcClient.syncInvokeHttp(request, ApmMeta.listAppEnvs);
    }

    /**
     * 获取组件下的环境列表
     *
     * 获取组件下的环境列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAppEnvsRequest 请求对象
     * @return SyncInvoker<ListAppEnvsRequest, ListAppEnvsResponse>
     */
    public SyncInvoker<ListAppEnvsRequest, ListAppEnvsResponse> listAppEnvsInvoker(ListAppEnvsRequest request) {
        return new SyncInvoker<>(request, ApmMeta.listAppEnvs, hcClient);
    }

    /**
     * 获取组件列表
     *
     * 获取组件列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAppsRequest 请求对象
     * @return ListAppsResponse
     */
    public ListAppsResponse listApps(ListAppsRequest request) {
        return hcClient.syncInvokeHttp(request, ApmMeta.listApps);
    }

    /**
     * 获取组件列表
     *
     * 获取组件列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAppsRequest 请求对象
     * @return SyncInvoker<ListAppsRequest, ListAppsResponse>
     */
    public SyncInvoker<ListAppsRequest, ListAppsResponse> listAppsInvoker(ListAppsRequest request) {
        return new SyncInvoker<>(request, ApmMeta.listApps, hcClient);
    }

    /**
     * 查询环境标签
     *
     * 查询环境标签接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEnvTagsRequest 请求对象
     * @return ListEnvTagsResponse
     */
    public ListEnvTagsResponse listEnvTags(ListEnvTagsRequest request) {
        return hcClient.syncInvokeHttp(request, ApmMeta.listEnvTags);
    }

    /**
     * 查询环境标签
     *
     * 查询环境标签接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEnvTagsRequest 请求对象
     * @return SyncInvoker<ListEnvTagsRequest, ListEnvTagsResponse>
     */
    public SyncInvoker<ListEnvTagsRequest, ListEnvTagsResponse> listEnvTagsInvoker(ListEnvTagsRequest request) {
        return new SyncInvoker<>(request, ApmMeta.listEnvTags, hcClient);
    }

    /**
     * 查询单个应用的详情
     *
     * 查询单个应用的详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBusinessDetailRequest 请求对象
     * @return ShowBusinessDetailResponse
     */
    public ShowBusinessDetailResponse showBusinessDetail(ShowBusinessDetailRequest request) {
        return hcClient.syncInvokeHttp(request, ApmMeta.showBusinessDetail);
    }

    /**
     * 查询单个应用的详情
     *
     * 查询单个应用的详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBusinessDetailRequest 请求对象
     * @return SyncInvoker<ShowBusinessDetailRequest, ShowBusinessDetailResponse>
     */
    public SyncInvoker<ShowBusinessDetailRequest, ShowBusinessDetailResponse> showBusinessDetailInvoker(
        ShowBusinessDetailRequest request) {
        return new SyncInvoker<>(request, ApmMeta.showBusinessDetail, hcClient);
    }

    /**
     * 查询子应用详情
     *
     * 查询单个子应用详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSubBusinessDetailRequest 请求对象
     * @return ShowSubBusinessDetailResponse
     */
    public ShowSubBusinessDetailResponse showSubBusinessDetail(ShowSubBusinessDetailRequest request) {
        return hcClient.syncInvokeHttp(request, ApmMeta.showSubBusinessDetail);
    }

    /**
     * 查询子应用详情
     *
     * 查询单个子应用详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSubBusinessDetailRequest 请求对象
     * @return SyncInvoker<ShowSubBusinessDetailRequest, ShowSubBusinessDetailResponse>
     */
    public SyncInvoker<ShowSubBusinessDetailRequest, ShowSubBusinessDetailResponse> showSubBusinessDetailInvoker(
        ShowSubBusinessDetailRequest request) {
        return new SyncInvoker<>(request, ApmMeta.showSubBusinessDetail, hcClient);
    }

    /**
     * 获取应用树
     *
     * 获取应用树。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTopologyTreeRequest 请求对象
     * @return ShowTopologyTreeResponse
     */
    public ShowTopologyTreeResponse showTopologyTree(ShowTopologyTreeRequest request) {
        return hcClient.syncInvokeHttp(request, ApmMeta.showTopologyTree);
    }

    /**
     * 获取应用树
     *
     * 获取应用树。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTopologyTreeRequest 请求对象
     * @return SyncInvoker<ShowTopologyTreeRequest, ShowTopologyTreeResponse>
     */
    public SyncInvoker<ShowTopologyTreeRequest, ShowTopologyTreeResponse> showTopologyTreeInvoker(
        ShowTopologyTreeRequest request) {
        return new SyncInvoker<>(request, ApmMeta.showTopologyTree, hcClient);
    }

    /**
     * 查询开通的region
     *
     * 该接口用于查询用户开通的region信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListOpenRegionRequest 请求对象
     * @return ListOpenRegionResponse
     */
    public ListOpenRegionResponse listOpenRegion(ListOpenRegionRequest request) {
        return hcClient.syncInvokeHttp(request, ApmMeta.listOpenRegion);
    }

    /**
     * 查询开通的region
     *
     * 该接口用于查询用户开通的region信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListOpenRegionRequest 请求对象
     * @return SyncInvoker<ListOpenRegionRequest, ListOpenRegionResponse>
     */
    public SyncInvoker<ListOpenRegionRequest, ListOpenRegionResponse> listOpenRegionInvoker(
        ListOpenRegionRequest request) {
        return new SyncInvoker<>(request, ApmMeta.listOpenRegion, hcClient);
    }

    /**
     * 查询所有的支持的region
     *
     * 查询所有的支持的region信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSupportedRegionRequest 请求对象
     * @return ListSupportedRegionResponse
     */
    public ListSupportedRegionResponse listSupportedRegion(ListSupportedRegionRequest request) {
        return hcClient.syncInvokeHttp(request, ApmMeta.listSupportedRegion);
    }

    /**
     * 查询所有的支持的region
     *
     * 查询所有的支持的region信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSupportedRegionRequest 请求对象
     * @return SyncInvoker<ListSupportedRegionRequest, ListSupportedRegionResponse>
     */
    public SyncInvoker<ListSupportedRegionRequest, ListSupportedRegionResponse> listSupportedRegionInvoker(
        ListSupportedRegionRequest request) {
        return new SyncInvoker<>(request, ApmMeta.listSupportedRegion, hcClient);
    }

    /**
     * 查询应用全局拓扑图
     *
     * 查询应用级别全局拓扑图信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchBusinessTopologyRequest 请求对象
     * @return SearchBusinessTopologyResponse
     */
    public SearchBusinessTopologyResponse searchBusinessTopology(SearchBusinessTopologyRequest request) {
        return hcClient.syncInvokeHttp(request, ApmMeta.searchBusinessTopology);
    }

    /**
     * 查询应用全局拓扑图
     *
     * 查询应用级别全局拓扑图信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchBusinessTopologyRequest 请求对象
     * @return SyncInvoker<SearchBusinessTopologyRequest, SearchBusinessTopologyResponse>
     */
    public SyncInvoker<SearchBusinessTopologyRequest, SearchBusinessTopologyResponse> searchBusinessTopologyInvoker(
        SearchBusinessTopologyRequest request) {
        return new SyncInvoker<>(request, ApmMeta.searchBusinessTopology, hcClient);
    }

    /**
     * 查询组件环境拓扑图
     *
     * 查询组件环境级别全局拓扑图信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchEnvTopologyRequest 请求对象
     * @return SearchEnvTopologyResponse
     */
    public SearchEnvTopologyResponse searchEnvTopology(SearchEnvTopologyRequest request) {
        return hcClient.syncInvokeHttp(request, ApmMeta.searchEnvTopology);
    }

    /**
     * 查询组件环境拓扑图
     *
     * 查询组件环境级别全局拓扑图信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchEnvTopologyRequest 请求对象
     * @return SyncInvoker<SearchEnvTopologyRequest, SearchEnvTopologyResponse>
     */
    public SyncInvoker<SearchEnvTopologyRequest, SearchEnvTopologyResponse> searchEnvTopologyInvoker(
        SearchEnvTopologyRequest request) {
        return new SyncInvoker<>(request, ApmMeta.searchEnvTopology, hcClient);
    }

    /**
     * 查询URL跟踪Region环境列表
     *
     * 查询所选Region下设置了URL跟踪的环境列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBusinessEnvRequest 请求对象
     * @return ListBusinessEnvResponse
     */
    public ListBusinessEnvResponse listBusinessEnv(ListBusinessEnvRequest request) {
        return hcClient.syncInvokeHttp(request, ApmMeta.listBusinessEnv);
    }

    /**
     * 查询URL跟踪Region环境列表
     *
     * 查询所选Region下设置了URL跟踪的环境列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBusinessEnvRequest 请求对象
     * @return SyncInvoker<ListBusinessEnvRequest, ListBusinessEnvResponse>
     */
    public SyncInvoker<ListBusinessEnvRequest, ListBusinessEnvResponse> listBusinessEnvInvoker(
        ListBusinessEnvRequest request) {
        return new SyncInvoker<>(request, ApmMeta.listBusinessEnv, hcClient);
    }

    /**
     * 查询URL跟踪视图列表
     *
     * 查询当前被调用的URL跟踪视图列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchTransactionRequest 请求对象
     * @return SearchTransactionResponse
     */
    public SearchTransactionResponse searchTransaction(SearchTransactionRequest request) {
        return hcClient.syncInvokeHttp(request, ApmMeta.searchTransaction);
    }

    /**
     * 查询URL跟踪视图列表
     *
     * 查询当前被调用的URL跟踪视图列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchTransactionRequest 请求对象
     * @return SyncInvoker<SearchTransactionRequest, SearchTransactionResponse>
     */
    public SyncInvoker<SearchTransactionRequest, SearchTransactionResponse> searchTransactionInvoker(
        SearchTransactionRequest request) {
        return new SyncInvoker<>(request, ApmMeta.searchTransaction, hcClient);
    }

    /**
     * 查询URL跟踪配置列表
     *
     * 查询已配置好的URL跟踪配置列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchTransactionConfigRequest 请求对象
     * @return SearchTransactionConfigResponse
     */
    public SearchTransactionConfigResponse searchTransactionConfig(SearchTransactionConfigRequest request) {
        return hcClient.syncInvokeHttp(request, ApmMeta.searchTransactionConfig);
    }

    /**
     * 查询URL跟踪配置列表
     *
     * 查询已配置好的URL跟踪配置列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchTransactionConfigRequest 请求对象
     * @return SyncInvoker<SearchTransactionConfigRequest, SearchTransactionConfigResponse>
     */
    public SyncInvoker<SearchTransactionConfigRequest, SearchTransactionConfigResponse> searchTransactionConfigInvoker(
        SearchTransactionConfigRequest request) {
        return new SyncInvoker<>(request, ApmMeta.searchTransactionConfig, hcClient);
    }

    /**
     * 查询URL跟踪视图详情
     *
     * 查询某条URL跟踪视图详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTransactionDetailRequest 请求对象
     * @return ShowTransactionDetailResponse
     */
    public ShowTransactionDetailResponse showTransactionDetail(ShowTransactionDetailRequest request) {
        return hcClient.syncInvokeHttp(request, ApmMeta.showTransactionDetail);
    }

    /**
     * 查询URL跟踪视图详情
     *
     * 查询某条URL跟踪视图详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTransactionDetailRequest 请求对象
     * @return SyncInvoker<ShowTransactionDetailRequest, ShowTransactionDetailResponse>
     */
    public SyncInvoker<ShowTransactionDetailRequest, ShowTransactionDetailResponse> showTransactionDetailInvoker(
        ShowTransactionDetailRequest request) {
        return new SyncInvoker<>(request, ApmMeta.showTransactionDetail, hcClient);
    }

    /**
     * 获取实例信息列表
     *
     * 获取实例信息列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEnvInstancesRequest 请求对象
     * @return ListEnvInstancesResponse
     */
    public ListEnvInstancesResponse listEnvInstances(ListEnvInstancesRequest request) {
        return hcClient.syncInvokeHttp(request, ApmMeta.listEnvInstances);
    }

    /**
     * 获取实例信息列表
     *
     * 获取实例信息列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEnvInstancesRequest 请求对象
     * @return SyncInvoker<ListEnvInstancesRequest, ListEnvInstancesResponse>
     */
    public SyncInvoker<ListEnvInstancesRequest, ListEnvInstancesResponse> listEnvInstancesInvoker(
        ListEnvInstancesRequest request) {
        return new SyncInvoker<>(request, ApmMeta.listEnvInstances, hcClient);
    }

    /**
     * 获取原始数据详情
     *
     * 获取原始数据详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowClobDetailRequest 请求对象
     * @return ShowClobDetailResponse
     */
    public ShowClobDetailResponse showClobDetail(ShowClobDetailRequest request) {
        return hcClient.syncInvokeHttp(request, ApmMeta.showClobDetail);
    }

    /**
     * 获取原始数据详情
     *
     * 获取原始数据详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowClobDetailRequest 请求对象
     * @return SyncInvoker<ShowClobDetailRequest, ShowClobDetailResponse>
     */
    public SyncInvoker<ShowClobDetailRequest, ShowClobDetailResponse> showClobDetailInvoker(
        ShowClobDetailRequest request) {
        return new SyncInvoker<>(request, ApmMeta.showClobDetail, hcClient);
    }

    /**
     * 获取监控项信息
     *
     * 获取监控项信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowEnvMonitorItemsRequest 请求对象
     * @return ShowEnvMonitorItemsResponse
     */
    public ShowEnvMonitorItemsResponse showEnvMonitorItems(ShowEnvMonitorItemsRequest request) {
        return hcClient.syncInvokeHttp(request, ApmMeta.showEnvMonitorItems);
    }

    /**
     * 获取监控项信息
     *
     * 获取监控项信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowEnvMonitorItemsRequest 请求对象
     * @return SyncInvoker<ShowEnvMonitorItemsRequest, ShowEnvMonitorItemsResponse>
     */
    public SyncInvoker<ShowEnvMonitorItemsRequest, ShowEnvMonitorItemsResponse> showEnvMonitorItemsInvoker(
        ShowEnvMonitorItemsRequest request) {
        return new SyncInvoker<>(request, ApmMeta.showEnvMonitorItems, hcClient);
    }

    /**
     * 获取event的详情
     *
     * 获取event的详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowEventDetailRequest 请求对象
     * @return ShowEventDetailResponse
     */
    public ShowEventDetailResponse showEventDetail(ShowEventDetailRequest request) {
        return hcClient.syncInvokeHttp(request, ApmMeta.showEventDetail);
    }

    /**
     * 获取event的详情
     *
     * 获取event的详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowEventDetailRequest 请求对象
     * @return SyncInvoker<ShowEventDetailRequest, ShowEventDetailResponse>
     */
    public SyncInvoker<ShowEventDetailRequest, ShowEventDetailResponse> showEventDetailInvoker(
        ShowEventDetailRequest request) {
        return new SyncInvoker<>(request, ApmMeta.showEventDetail, hcClient);
    }

    /**
     * 查询监控项配置信息
     *
     * 查询监控项配置信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMonitorItemViewConfigRequest 请求对象
     * @return ShowMonitorItemViewConfigResponse
     */
    public ShowMonitorItemViewConfigResponse showMonitorItemViewConfig(ShowMonitorItemViewConfigRequest request) {
        return hcClient.syncInvokeHttp(request, ApmMeta.showMonitorItemViewConfig);
    }

    /**
     * 查询监控项配置信息
     *
     * 查询监控项配置信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMonitorItemViewConfigRequest 请求对象
     * @return SyncInvoker<ShowMonitorItemViewConfigRequest, ShowMonitorItemViewConfigResponse>
     */
    public SyncInvoker<ShowMonitorItemViewConfigRequest, ShowMonitorItemViewConfigResponse> showMonitorItemViewConfigInvoker(
        ShowMonitorItemViewConfigRequest request) {
        return new SyncInvoker<>(request, ApmMeta.showMonitorItemViewConfig, hcClient);
    }

    /**
     * 获取原始数据表格
     *
     * 获取原始数据表格。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRawTableRequest 请求对象
     * @return ShowRawTableResponse
     */
    public ShowRawTableResponse showRawTable(ShowRawTableRequest request) {
        return hcClient.syncInvokeHttp(request, ApmMeta.showRawTable);
    }

    /**
     * 获取原始数据表格
     *
     * 获取原始数据表格。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRawTableRequest 请求对象
     * @return SyncInvoker<ShowRawTableRequest, ShowRawTableResponse>
     */
    public SyncInvoker<ShowRawTableRequest, ShowRawTableResponse> showRawTableInvoker(ShowRawTableRequest request) {
        return new SyncInvoker<>(request, ApmMeta.showRawTable, hcClient);
    }

    /**
     * 查询span数据
     *
     * span数据查询接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSpanSearchRequest 请求对象
     * @return ShowSpanSearchResponse
     */
    public ShowSpanSearchResponse showSpanSearch(ShowSpanSearchRequest request) {
        return hcClient.syncInvokeHttp(request, ApmMeta.showSpanSearch);
    }

    /**
     * 查询span数据
     *
     * span数据查询接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSpanSearchRequest 请求对象
     * @return SyncInvoker<ShowSpanSearchRequest, ShowSpanSearchResponse>
     */
    public SyncInvoker<ShowSpanSearchRequest, ShowSpanSearchResponse> showSpanSearchInvoker(
        ShowSpanSearchRequest request) {
        return new SyncInvoker<>(request, ApmMeta.showSpanSearch, hcClient);
    }

    /**
     * 获取汇总表格数据
     *
     * 获取汇总表格数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSumTableRequest 请求对象
     * @return ShowSumTableResponse
     */
    public ShowSumTableResponse showSumTable(ShowSumTableRequest request) {
        return hcClient.syncInvokeHttp(request, ApmMeta.showSumTable);
    }

    /**
     * 获取汇总表格数据
     *
     * 获取汇总表格数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSumTableRequest 请求对象
     * @return SyncInvoker<ShowSumTableRequest, ShowSumTableResponse>
     */
    public SyncInvoker<ShowSumTableRequest, ShowSumTableResponse> showSumTableInvoker(ShowSumTableRequest request) {
        return new SyncInvoker<>(request, ApmMeta.showSumTable, hcClient);
    }

    /**
     * 调用链拓扑图
     *
     * 调用链拓扑图。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTopologyRequest 请求对象
     * @return ShowTopologyResponse
     */
    public ShowTopologyResponse showTopology(ShowTopologyRequest request) {
        return hcClient.syncInvokeHttp(request, ApmMeta.showTopology);
    }

    /**
     * 调用链拓扑图
     *
     * 调用链拓扑图。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTopologyRequest 请求对象
     * @return SyncInvoker<ShowTopologyRequest, ShowTopologyResponse>
     */
    public SyncInvoker<ShowTopologyRequest, ShowTopologyResponse> showTopologyInvoker(ShowTopologyRequest request) {
        return new SyncInvoker<>(request, ApmMeta.showTopology, hcClient);
    }

    /**
     * 获取一个trace的所有调用链数据
     *
     * 获取一个trace的所有调用链数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTraceEventsRequest 请求对象
     * @return ShowTraceEventsResponse
     */
    public ShowTraceEventsResponse showTraceEvents(ShowTraceEventsRequest request) {
        return hcClient.syncInvokeHttp(request, ApmMeta.showTraceEvents);
    }

    /**
     * 获取一个trace的所有调用链数据
     *
     * 获取一个trace的所有调用链数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTraceEventsRequest 请求对象
     * @return SyncInvoker<ShowTraceEventsRequest, ShowTraceEventsResponse>
     */
    public SyncInvoker<ShowTraceEventsRequest, ShowTraceEventsResponse> showTraceEventsInvoker(
        ShowTraceEventsRequest request) {
        return new SyncInvoker<>(request, ApmMeta.showTraceEvents, hcClient);
    }

    /**
     * 获取趋势图
     *
     * 获取趋势图。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTrendRequest 请求对象
     * @return ShowTrendResponse
     */
    public ShowTrendResponse showTrend(ShowTrendRequest request) {
        return hcClient.syncInvokeHttp(request, ApmMeta.showTrend);
    }

    /**
     * 获取趋势图
     *
     * 获取趋势图。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTrendRequest 请求对象
     * @return SyncInvoker<ShowTrendRequest, ShowTrendResponse>
     */
    public SyncInvoker<ShowTrendRequest, ShowTrendResponse> showTrendInvoker(ShowTrendRequest request) {
        return new SyncInvoker<>(request, ApmMeta.showTrend, hcClient);
    }

}
