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
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;

import java.util.concurrent.CompletableFuture;

public class ApmAsyncClient {

    protected HcClient hcClient;

    public ApmAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<ApmAsyncClient> newBuilder() {
        ClientBuilder<ApmAsyncClient> clientBuilder = new ClientBuilder<>(ApmAsyncClient::new);
        return clientBuilder;
    }

    /**
     * 创建aksk
     *
     * 创建aksk。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateAkSkRequest 请求对象
     * @return CompletableFuture<CreateAkSkResponse>
     */
    public CompletableFuture<CreateAkSkResponse> createAkSkAsync(CreateAkSkRequest request) {
        return hcClient.asyncInvokeHttp(request, ApmMeta.createAkSk);
    }

    /**
     * 创建aksk
     *
     * 创建aksk。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateAkSkRequest 请求对象
     * @return AsyncInvoker<CreateAkSkRequest, CreateAkSkResponse>
     */
    public AsyncInvoker<CreateAkSkRequest, CreateAkSkResponse> createAkSkAsyncInvoker(CreateAkSkRequest request) {
        return new AsyncInvoker<CreateAkSkRequest, CreateAkSkResponse>(request, ApmMeta.createAkSk, hcClient);
    }

    /**
     * 删除aksk
     *
     * 删除aksk。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteAkSkRequest 请求对象
     * @return CompletableFuture<DeleteAkSkResponse>
     */
    public CompletableFuture<DeleteAkSkResponse> deleteAkSkAsync(DeleteAkSkRequest request) {
        return hcClient.asyncInvokeHttp(request, ApmMeta.deleteAkSk);
    }

    /**
     * 删除aksk
     *
     * 删除aksk。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteAkSkRequest 请求对象
     * @return AsyncInvoker<DeleteAkSkRequest, DeleteAkSkResponse>
     */
    public AsyncInvoker<DeleteAkSkRequest, DeleteAkSkResponse> deleteAkSkAsyncInvoker(DeleteAkSkRequest request) {
        return new AsyncInvoker<DeleteAkSkRequest, DeleteAkSkResponse>(request, ApmMeta.deleteAkSk, hcClient);
    }

    /**
     * 查询租户的aksk
     *
     * 查询租户的aksk。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAkSksRequest 请求对象
     * @return CompletableFuture<ShowAkSksResponse>
     */
    public CompletableFuture<ShowAkSksResponse> showAkSksAsync(ShowAkSksRequest request) {
        return hcClient.asyncInvokeHttp(request, ApmMeta.showAkSks);
    }

    /**
     * 查询租户的aksk
     *
     * 查询租户的aksk。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAkSksRequest 请求对象
     * @return AsyncInvoker<ShowAkSksRequest, ShowAkSksResponse>
     */
    public AsyncInvoker<ShowAkSksRequest, ShowAkSksResponse> showAkSksAsyncInvoker(ShowAkSksRequest request) {
        return new AsyncInvoker<ShowAkSksRequest, ShowAkSksResponse>(request, ApmMeta.showAkSks, hcClient);
    }

    /**
     * 查询告警列表
     *
     * 查询系统中存在的告警。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAlarmDataRequest 请求对象
     * @return CompletableFuture<ListAlarmDataResponse>
     */
    public CompletableFuture<ListAlarmDataResponse> listAlarmDataAsync(ListAlarmDataRequest request) {
        return hcClient.asyncInvokeHttp(request, ApmMeta.listAlarmData);
    }

    /**
     * 查询告警列表
     *
     * 查询系统中存在的告警。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAlarmDataRequest 请求对象
     * @return AsyncInvoker<ListAlarmDataRequest, ListAlarmDataResponse>
     */
    public AsyncInvoker<ListAlarmDataRequest, ListAlarmDataResponse> listAlarmDataAsyncInvoker(
        ListAlarmDataRequest request) {
        return new AsyncInvoker<ListAlarmDataRequest, ListAlarmDataResponse>(request, ApmMeta.listAlarmData, hcClient);
    }

    /**
     * 查询告警消息列表
     *
     * 查询单个告警的触发详情与历史。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAlarmNotifyRequest 请求对象
     * @return CompletableFuture<ListAlarmNotifyResponse>
     */
    public CompletableFuture<ListAlarmNotifyResponse> listAlarmNotifyAsync(ListAlarmNotifyRequest request) {
        return hcClient.asyncInvokeHttp(request, ApmMeta.listAlarmNotify);
    }

    /**
     * 查询告警消息列表
     *
     * 查询单个告警的触发详情与历史。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAlarmNotifyRequest 请求对象
     * @return AsyncInvoker<ListAlarmNotifyRequest, ListAlarmNotifyResponse>
     */
    public AsyncInvoker<ListAlarmNotifyRequest, ListAlarmNotifyResponse> listAlarmNotifyAsyncInvoker(
        ListAlarmNotifyRequest request) {
        return new AsyncInvoker<ListAlarmNotifyRequest, ListAlarmNotifyResponse>(request, ApmMeta.listAlarmNotify,
            hcClient);
    }

    /**
     * 更改实例的采集状态
     *
     * 改变指定实例的采集状态：开启和关闭。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ChangeAgentStatusRequest 请求对象
     * @return CompletableFuture<ChangeAgentStatusResponse>
     */
    public CompletableFuture<ChangeAgentStatusResponse> changeAgentStatusAsync(ChangeAgentStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, ApmMeta.changeAgentStatus);
    }

    /**
     * 更改实例的采集状态
     *
     * 改变指定实例的采集状态：开启和关闭。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ChangeAgentStatusRequest 请求对象
     * @return AsyncInvoker<ChangeAgentStatusRequest, ChangeAgentStatusResponse>
     */
    public AsyncInvoker<ChangeAgentStatusRequest, ChangeAgentStatusResponse> changeAgentStatusAsyncInvoker(
        ChangeAgentStatusRequest request) {
        return new AsyncInvoker<ChangeAgentStatusRequest, ChangeAgentStatusResponse>(request, ApmMeta.changeAgentStatus,
            hcClient);
    }

    /**
     * 删除agent
     *
     * 删除agent
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteAgentRequest 请求对象
     * @return CompletableFuture<DeleteAgentResponse>
     */
    public CompletableFuture<DeleteAgentResponse> deleteAgentAsync(DeleteAgentRequest request) {
        return hcClient.asyncInvokeHttp(request, ApmMeta.deleteAgent);
    }

    /**
     * 删除agent
     *
     * 删除agent
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteAgentRequest 请求对象
     * @return AsyncInvoker<DeleteAgentRequest, DeleteAgentResponse>
     */
    public AsyncInvoker<DeleteAgentRequest, DeleteAgentResponse> deleteAgentAsyncInvoker(DeleteAgentRequest request) {
        return new AsyncInvoker<DeleteAgentRequest, DeleteAgentResponse>(request, ApmMeta.deleteAgent, hcClient);
    }

    /**
     * 获取ak/sk
     *
     * 获取该用户创建的ak/sk列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAkSkRequest 请求对象
     * @return CompletableFuture<ListAkSkResponse>
     */
    public CompletableFuture<ListAkSkResponse> listAkSkAsync(ListAkSkRequest request) {
        return hcClient.asyncInvokeHttp(request, ApmMeta.listAkSk);
    }

    /**
     * 获取ak/sk
     *
     * 获取该用户创建的ak/sk列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAkSkRequest 请求对象
     * @return AsyncInvoker<ListAkSkRequest, ListAkSkResponse>
     */
    public AsyncInvoker<ListAkSkRequest, ListAkSkResponse> listAkSkAsyncInvoker(ListAkSkRequest request) {
        return new AsyncInvoker<ListAkSkRequest, ListAkSkResponse>(request, ApmMeta.listAkSk, hcClient);
    }

    /**
     * 查询应用列表
     *
     * 该接口用于查询对应用户下的应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListBusinessRequest 请求对象
     * @return CompletableFuture<ListBusinessResponse>
     */
    public CompletableFuture<ListBusinessResponse> listBusinessAsync(ListBusinessRequest request) {
        return hcClient.asyncInvokeHttp(request, ApmMeta.listBusiness);
    }

    /**
     * 查询应用列表
     *
     * 该接口用于查询对应用户下的应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListBusinessRequest 请求对象
     * @return AsyncInvoker<ListBusinessRequest, ListBusinessResponse>
     */
    public AsyncInvoker<ListBusinessRequest, ListBusinessResponse> listBusinessAsyncInvoker(
        ListBusinessRequest request) {
        return new AsyncInvoker<ListBusinessRequest, ListBusinessResponse>(request, ApmMeta.listBusiness, hcClient);
    }

    /**
     * 查询监控项列表
     *
     * 查询监控项列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListEnvMonitorItemRequest 请求对象
     * @return CompletableFuture<ListEnvMonitorItemResponse>
     */
    public CompletableFuture<ListEnvMonitorItemResponse> listEnvMonitorItemAsync(ListEnvMonitorItemRequest request) {
        return hcClient.asyncInvokeHttp(request, ApmMeta.listEnvMonitorItem);
    }

    /**
     * 查询监控项列表
     *
     * 查询监控项列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListEnvMonitorItemRequest 请求对象
     * @return AsyncInvoker<ListEnvMonitorItemRequest, ListEnvMonitorItemResponse>
     */
    public AsyncInvoker<ListEnvMonitorItemRequest, ListEnvMonitorItemResponse> listEnvMonitorItemAsyncInvoker(
        ListEnvMonitorItemRequest request) {
        return new AsyncInvoker<ListEnvMonitorItemRequest, ListEnvMonitorItemResponse>(request,
            ApmMeta.listEnvMonitorItem, hcClient);
    }

    /**
     * 保存监控项
     *
     * 保存监控项。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SaveMonitorItemConfigRequest 请求对象
     * @return CompletableFuture<SaveMonitorItemConfigResponse>
     */
    public CompletableFuture<SaveMonitorItemConfigResponse> saveMonitorItemConfigAsync(
        SaveMonitorItemConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, ApmMeta.saveMonitorItemConfig);
    }

    /**
     * 保存监控项
     *
     * 保存监控项。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SaveMonitorItemConfigRequest 请求对象
     * @return AsyncInvoker<SaveMonitorItemConfigRequest, SaveMonitorItemConfigResponse>
     */
    public AsyncInvoker<SaveMonitorItemConfigRequest, SaveMonitorItemConfigResponse> saveMonitorItemConfigAsyncInvoker(
        SaveMonitorItemConfigRequest request) {
        return new AsyncInvoker<SaveMonitorItemConfigRequest, SaveMonitorItemConfigResponse>(request,
            ApmMeta.saveMonitorItemConfig, hcClient);
    }

    /**
     * 查询应用下所有探针
     *
     * 该接口用于搜索应用下所有探针情况。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SearchAgentRequest 请求对象
     * @return CompletableFuture<SearchAgentResponse>
     */
    public CompletableFuture<SearchAgentResponse> searchAgentAsync(SearchAgentRequest request) {
        return hcClient.asyncInvokeHttp(request, ApmMeta.searchAgent);
    }

    /**
     * 查询应用下所有探针
     *
     * 该接口用于搜索应用下所有探针情况。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SearchAgentRequest 请求对象
     * @return AsyncInvoker<SearchAgentRequest, SearchAgentResponse>
     */
    public AsyncInvoker<SearchAgentRequest, SearchAgentResponse> searchAgentAsyncInvoker(SearchAgentRequest request) {
        return new AsyncInvoker<SearchAgentRequest, SearchAgentResponse>(request, ApmMeta.searchAgent, hcClient);
    }

    /**
     * 对指定区域下的组件和环境及其探针情况进行搜索
     *
     * 对指定区域下的组件和环境及其探针情况进行搜索。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SearchApplicationRequest 请求对象
     * @return CompletableFuture<SearchApplicationResponse>
     */
    public CompletableFuture<SearchApplicationResponse> searchApplicationAsync(SearchApplicationRequest request) {
        return hcClient.asyncInvokeHttp(request, ApmMeta.searchApplication);
    }

    /**
     * 对指定区域下的组件和环境及其探针情况进行搜索
     *
     * 对指定区域下的组件和环境及其探针情况进行搜索。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SearchApplicationRequest 请求对象
     * @return AsyncInvoker<SearchApplicationRequest, SearchApplicationResponse>
     */
    public AsyncInvoker<SearchApplicationRequest, SearchApplicationResponse> searchApplicationAsyncInvoker(
        SearchApplicationRequest request) {
        return new AsyncInvoker<SearchApplicationRequest, SearchApplicationResponse>(request, ApmMeta.searchApplication,
            hcClient);
    }

    /**
     * 查询master地址
     *
     * 根据region名称获取该region下的master服务podlb地址信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowMasterAddressRequest 请求对象
     * @return CompletableFuture<ShowMasterAddressResponse>
     */
    public CompletableFuture<ShowMasterAddressResponse> showMasterAddressAsync(ShowMasterAddressRequest request) {
        return hcClient.asyncInvokeHttp(request, ApmMeta.showMasterAddress);
    }

    /**
     * 查询master地址
     *
     * 根据region名称获取该region下的master服务podlb地址信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowMasterAddressRequest 请求对象
     * @return AsyncInvoker<ShowMasterAddressRequest, ShowMasterAddressResponse>
     */
    public AsyncInvoker<ShowMasterAddressRequest, ShowMasterAddressResponse> showMasterAddressAsyncInvoker(
        ShowMasterAddressRequest request) {
        return new AsyncInvoker<ShowMasterAddressRequest, ShowMasterAddressResponse>(request, ApmMeta.showMasterAddress,
            hcClient);
    }

    /**
     * 根据组件id删除指定的组件
     *
     * 该接口用于删除指定的组件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteAppRequest 请求对象
     * @return CompletableFuture<DeleteAppResponse>
     */
    public CompletableFuture<DeleteAppResponse> deleteAppAsync(DeleteAppRequest request) {
        return hcClient.asyncInvokeHttp(request, ApmMeta.deleteApp);
    }

    /**
     * 根据组件id删除指定的组件
     *
     * 该接口用于删除指定的组件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteAppRequest 请求对象
     * @return AsyncInvoker<DeleteAppRequest, DeleteAppResponse>
     */
    public AsyncInvoker<DeleteAppRequest, DeleteAppResponse> deleteAppAsyncInvoker(DeleteAppRequest request) {
        return new AsyncInvoker<DeleteAppRequest, DeleteAppResponse>(request, ApmMeta.deleteApp, hcClient);
    }

    /**
     * 获取组件下的环境列表
     *
     * 获取组件下的环境列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAppEnvsRequest 请求对象
     * @return CompletableFuture<ListAppEnvsResponse>
     */
    public CompletableFuture<ListAppEnvsResponse> listAppEnvsAsync(ListAppEnvsRequest request) {
        return hcClient.asyncInvokeHttp(request, ApmMeta.listAppEnvs);
    }

    /**
     * 获取组件下的环境列表
     *
     * 获取组件下的环境列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAppEnvsRequest 请求对象
     * @return AsyncInvoker<ListAppEnvsRequest, ListAppEnvsResponse>
     */
    public AsyncInvoker<ListAppEnvsRequest, ListAppEnvsResponse> listAppEnvsAsyncInvoker(ListAppEnvsRequest request) {
        return new AsyncInvoker<ListAppEnvsRequest, ListAppEnvsResponse>(request, ApmMeta.listAppEnvs, hcClient);
    }

    /**
     * 获取组件列表
     *
     * 获取组件列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAppsRequest 请求对象
     * @return CompletableFuture<ListAppsResponse>
     */
    public CompletableFuture<ListAppsResponse> listAppsAsync(ListAppsRequest request) {
        return hcClient.asyncInvokeHttp(request, ApmMeta.listApps);
    }

    /**
     * 获取组件列表
     *
     * 获取组件列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAppsRequest 请求对象
     * @return AsyncInvoker<ListAppsRequest, ListAppsResponse>
     */
    public AsyncInvoker<ListAppsRequest, ListAppsResponse> listAppsAsyncInvoker(ListAppsRequest request) {
        return new AsyncInvoker<ListAppsRequest, ListAppsResponse>(request, ApmMeta.listApps, hcClient);
    }

    /**
     * 查询环境标签
     *
     * 查询环境标签接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListEnvTagsRequest 请求对象
     * @return CompletableFuture<ListEnvTagsResponse>
     */
    public CompletableFuture<ListEnvTagsResponse> listEnvTagsAsync(ListEnvTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, ApmMeta.listEnvTags);
    }

    /**
     * 查询环境标签
     *
     * 查询环境标签接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListEnvTagsRequest 请求对象
     * @return AsyncInvoker<ListEnvTagsRequest, ListEnvTagsResponse>
     */
    public AsyncInvoker<ListEnvTagsRequest, ListEnvTagsResponse> listEnvTagsAsyncInvoker(ListEnvTagsRequest request) {
        return new AsyncInvoker<ListEnvTagsRequest, ListEnvTagsResponse>(request, ApmMeta.listEnvTags, hcClient);
    }

    /**
     * 查询单个应用的详情
     *
     * 查询单个应用的详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowBusinessDetailRequest 请求对象
     * @return CompletableFuture<ShowBusinessDetailResponse>
     */
    public CompletableFuture<ShowBusinessDetailResponse> showBusinessDetailAsync(ShowBusinessDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, ApmMeta.showBusinessDetail);
    }

    /**
     * 查询单个应用的详情
     *
     * 查询单个应用的详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowBusinessDetailRequest 请求对象
     * @return AsyncInvoker<ShowBusinessDetailRequest, ShowBusinessDetailResponse>
     */
    public AsyncInvoker<ShowBusinessDetailRequest, ShowBusinessDetailResponse> showBusinessDetailAsyncInvoker(
        ShowBusinessDetailRequest request) {
        return new AsyncInvoker<ShowBusinessDetailRequest, ShowBusinessDetailResponse>(request,
            ApmMeta.showBusinessDetail, hcClient);
    }

    /**
     * 查询子应用详情
     *
     * 查询单个子应用详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowSubBusinessDetailRequest 请求对象
     * @return CompletableFuture<ShowSubBusinessDetailResponse>
     */
    public CompletableFuture<ShowSubBusinessDetailResponse> showSubBusinessDetailAsync(
        ShowSubBusinessDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, ApmMeta.showSubBusinessDetail);
    }

    /**
     * 查询子应用详情
     *
     * 查询单个子应用详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowSubBusinessDetailRequest 请求对象
     * @return AsyncInvoker<ShowSubBusinessDetailRequest, ShowSubBusinessDetailResponse>
     */
    public AsyncInvoker<ShowSubBusinessDetailRequest, ShowSubBusinessDetailResponse> showSubBusinessDetailAsyncInvoker(
        ShowSubBusinessDetailRequest request) {
        return new AsyncInvoker<ShowSubBusinessDetailRequest, ShowSubBusinessDetailResponse>(request,
            ApmMeta.showSubBusinessDetail, hcClient);
    }

    /**
     * 获取应用树
     *
     * 获取应用树。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowTopologyTreeRequest 请求对象
     * @return CompletableFuture<ShowTopologyTreeResponse>
     */
    public CompletableFuture<ShowTopologyTreeResponse> showTopologyTreeAsync(ShowTopologyTreeRequest request) {
        return hcClient.asyncInvokeHttp(request, ApmMeta.showTopologyTree);
    }

    /**
     * 获取应用树
     *
     * 获取应用树。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowTopologyTreeRequest 请求对象
     * @return AsyncInvoker<ShowTopologyTreeRequest, ShowTopologyTreeResponse>
     */
    public AsyncInvoker<ShowTopologyTreeRequest, ShowTopologyTreeResponse> showTopologyTreeAsyncInvoker(
        ShowTopologyTreeRequest request) {
        return new AsyncInvoker<ShowTopologyTreeRequest, ShowTopologyTreeResponse>(request, ApmMeta.showTopologyTree,
            hcClient);
    }

    /**
     * 查询开通的region
     *
     * 该接口用于查询用户开通的region信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListOpenRegionRequest 请求对象
     * @return CompletableFuture<ListOpenRegionResponse>
     */
    public CompletableFuture<ListOpenRegionResponse> listOpenRegionAsync(ListOpenRegionRequest request) {
        return hcClient.asyncInvokeHttp(request, ApmMeta.listOpenRegion);
    }

    /**
     * 查询开通的region
     *
     * 该接口用于查询用户开通的region信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListOpenRegionRequest 请求对象
     * @return AsyncInvoker<ListOpenRegionRequest, ListOpenRegionResponse>
     */
    public AsyncInvoker<ListOpenRegionRequest, ListOpenRegionResponse> listOpenRegionAsyncInvoker(
        ListOpenRegionRequest request) {
        return new AsyncInvoker<ListOpenRegionRequest, ListOpenRegionResponse>(request, ApmMeta.listOpenRegion,
            hcClient);
    }

    /**
     * 查询所有的支持的region
     *
     * 查询所有的支持的region信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSupportedRegionRequest 请求对象
     * @return CompletableFuture<ListSupportedRegionResponse>
     */
    public CompletableFuture<ListSupportedRegionResponse> listSupportedRegionAsync(ListSupportedRegionRequest request) {
        return hcClient.asyncInvokeHttp(request, ApmMeta.listSupportedRegion);
    }

    /**
     * 查询所有的支持的region
     *
     * 查询所有的支持的region信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSupportedRegionRequest 请求对象
     * @return AsyncInvoker<ListSupportedRegionRequest, ListSupportedRegionResponse>
     */
    public AsyncInvoker<ListSupportedRegionRequest, ListSupportedRegionResponse> listSupportedRegionAsyncInvoker(
        ListSupportedRegionRequest request) {
        return new AsyncInvoker<ListSupportedRegionRequest, ListSupportedRegionResponse>(request,
            ApmMeta.listSupportedRegion, hcClient);
    }

    /**
     * 查询应用全局拓扑图
     *
     * 查询应用级别全局拓扑图信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SearchBusinessTopologyRequest 请求对象
     * @return CompletableFuture<SearchBusinessTopologyResponse>
     */
    public CompletableFuture<SearchBusinessTopologyResponse> searchBusinessTopologyAsync(
        SearchBusinessTopologyRequest request) {
        return hcClient.asyncInvokeHttp(request, ApmMeta.searchBusinessTopology);
    }

    /**
     * 查询应用全局拓扑图
     *
     * 查询应用级别全局拓扑图信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SearchBusinessTopologyRequest 请求对象
     * @return AsyncInvoker<SearchBusinessTopologyRequest, SearchBusinessTopologyResponse>
     */
    public AsyncInvoker<SearchBusinessTopologyRequest, SearchBusinessTopologyResponse> searchBusinessTopologyAsyncInvoker(
        SearchBusinessTopologyRequest request) {
        return new AsyncInvoker<SearchBusinessTopologyRequest, SearchBusinessTopologyResponse>(request,
            ApmMeta.searchBusinessTopology, hcClient);
    }

    /**
     * 查询组件环境拓扑图
     *
     * 查询组件环境级别全局拓扑图信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SearchEnvTopologyRequest 请求对象
     * @return CompletableFuture<SearchEnvTopologyResponse>
     */
    public CompletableFuture<SearchEnvTopologyResponse> searchEnvTopologyAsync(SearchEnvTopologyRequest request) {
        return hcClient.asyncInvokeHttp(request, ApmMeta.searchEnvTopology);
    }

    /**
     * 查询组件环境拓扑图
     *
     * 查询组件环境级别全局拓扑图信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SearchEnvTopologyRequest 请求对象
     * @return AsyncInvoker<SearchEnvTopologyRequest, SearchEnvTopologyResponse>
     */
    public AsyncInvoker<SearchEnvTopologyRequest, SearchEnvTopologyResponse> searchEnvTopologyAsyncInvoker(
        SearchEnvTopologyRequest request) {
        return new AsyncInvoker<SearchEnvTopologyRequest, SearchEnvTopologyResponse>(request, ApmMeta.searchEnvTopology,
            hcClient);
    }

    /**
     * 查询URL跟踪Region环境列表
     *
     * 查询所选Region下设置了URL跟踪的环境列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListBusinessEnvRequest 请求对象
     * @return CompletableFuture<ListBusinessEnvResponse>
     */
    public CompletableFuture<ListBusinessEnvResponse> listBusinessEnvAsync(ListBusinessEnvRequest request) {
        return hcClient.asyncInvokeHttp(request, ApmMeta.listBusinessEnv);
    }

    /**
     * 查询URL跟踪Region环境列表
     *
     * 查询所选Region下设置了URL跟踪的环境列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListBusinessEnvRequest 请求对象
     * @return AsyncInvoker<ListBusinessEnvRequest, ListBusinessEnvResponse>
     */
    public AsyncInvoker<ListBusinessEnvRequest, ListBusinessEnvResponse> listBusinessEnvAsyncInvoker(
        ListBusinessEnvRequest request) {
        return new AsyncInvoker<ListBusinessEnvRequest, ListBusinessEnvResponse>(request, ApmMeta.listBusinessEnv,
            hcClient);
    }

    /**
     * 查询URL跟踪视图列表
     *
     * 查询当前被调用的URL跟踪视图列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SearchTransactionRequest 请求对象
     * @return CompletableFuture<SearchTransactionResponse>
     */
    public CompletableFuture<SearchTransactionResponse> searchTransactionAsync(SearchTransactionRequest request) {
        return hcClient.asyncInvokeHttp(request, ApmMeta.searchTransaction);
    }

    /**
     * 查询URL跟踪视图列表
     *
     * 查询当前被调用的URL跟踪视图列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SearchTransactionRequest 请求对象
     * @return AsyncInvoker<SearchTransactionRequest, SearchTransactionResponse>
     */
    public AsyncInvoker<SearchTransactionRequest, SearchTransactionResponse> searchTransactionAsyncInvoker(
        SearchTransactionRequest request) {
        return new AsyncInvoker<SearchTransactionRequest, SearchTransactionResponse>(request, ApmMeta.searchTransaction,
            hcClient);
    }

    /**
     * 查询URL跟踪配置列表
     *
     * 查询已配置好的URL跟踪配置列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SearchTransactionConfigRequest 请求对象
     * @return CompletableFuture<SearchTransactionConfigResponse>
     */
    public CompletableFuture<SearchTransactionConfigResponse> searchTransactionConfigAsync(
        SearchTransactionConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, ApmMeta.searchTransactionConfig);
    }

    /**
     * 查询URL跟踪配置列表
     *
     * 查询已配置好的URL跟踪配置列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SearchTransactionConfigRequest 请求对象
     * @return AsyncInvoker<SearchTransactionConfigRequest, SearchTransactionConfigResponse>
     */
    public AsyncInvoker<SearchTransactionConfigRequest, SearchTransactionConfigResponse> searchTransactionConfigAsyncInvoker(
        SearchTransactionConfigRequest request) {
        return new AsyncInvoker<SearchTransactionConfigRequest, SearchTransactionConfigResponse>(request,
            ApmMeta.searchTransactionConfig, hcClient);
    }

    /**
     * 查询URL跟踪视图详情
     *
     * 查询某条URL跟踪视图详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowTransactionDetailRequest 请求对象
     * @return CompletableFuture<ShowTransactionDetailResponse>
     */
    public CompletableFuture<ShowTransactionDetailResponse> showTransactionDetailAsync(
        ShowTransactionDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, ApmMeta.showTransactionDetail);
    }

    /**
     * 查询URL跟踪视图详情
     *
     * 查询某条URL跟踪视图详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowTransactionDetailRequest 请求对象
     * @return AsyncInvoker<ShowTransactionDetailRequest, ShowTransactionDetailResponse>
     */
    public AsyncInvoker<ShowTransactionDetailRequest, ShowTransactionDetailResponse> showTransactionDetailAsyncInvoker(
        ShowTransactionDetailRequest request) {
        return new AsyncInvoker<ShowTransactionDetailRequest, ShowTransactionDetailResponse>(request,
            ApmMeta.showTransactionDetail, hcClient);
    }

    /**
     * 获取实例信息列表
     *
     * 获取实例信息列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListEnvInstancesRequest 请求对象
     * @return CompletableFuture<ListEnvInstancesResponse>
     */
    public CompletableFuture<ListEnvInstancesResponse> listEnvInstancesAsync(ListEnvInstancesRequest request) {
        return hcClient.asyncInvokeHttp(request, ApmMeta.listEnvInstances);
    }

    /**
     * 获取实例信息列表
     *
     * 获取实例信息列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListEnvInstancesRequest 请求对象
     * @return AsyncInvoker<ListEnvInstancesRequest, ListEnvInstancesResponse>
     */
    public AsyncInvoker<ListEnvInstancesRequest, ListEnvInstancesResponse> listEnvInstancesAsyncInvoker(
        ListEnvInstancesRequest request) {
        return new AsyncInvoker<ListEnvInstancesRequest, ListEnvInstancesResponse>(request, ApmMeta.listEnvInstances,
            hcClient);
    }

    /**
     * 获取原始数据详情
     *
     * 获取原始数据详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowClobDetailRequest 请求对象
     * @return CompletableFuture<ShowClobDetailResponse>
     */
    public CompletableFuture<ShowClobDetailResponse> showClobDetailAsync(ShowClobDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, ApmMeta.showClobDetail);
    }

    /**
     * 获取原始数据详情
     *
     * 获取原始数据详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowClobDetailRequest 请求对象
     * @return AsyncInvoker<ShowClobDetailRequest, ShowClobDetailResponse>
     */
    public AsyncInvoker<ShowClobDetailRequest, ShowClobDetailResponse> showClobDetailAsyncInvoker(
        ShowClobDetailRequest request) {
        return new AsyncInvoker<ShowClobDetailRequest, ShowClobDetailResponse>(request, ApmMeta.showClobDetail,
            hcClient);
    }

    /**
     * 获取监控项信息
     *
     * 获取监控项信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowEnvMonitorItemsRequest 请求对象
     * @return CompletableFuture<ShowEnvMonitorItemsResponse>
     */
    public CompletableFuture<ShowEnvMonitorItemsResponse> showEnvMonitorItemsAsync(ShowEnvMonitorItemsRequest request) {
        return hcClient.asyncInvokeHttp(request, ApmMeta.showEnvMonitorItems);
    }

    /**
     * 获取监控项信息
     *
     * 获取监控项信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowEnvMonitorItemsRequest 请求对象
     * @return AsyncInvoker<ShowEnvMonitorItemsRequest, ShowEnvMonitorItemsResponse>
     */
    public AsyncInvoker<ShowEnvMonitorItemsRequest, ShowEnvMonitorItemsResponse> showEnvMonitorItemsAsyncInvoker(
        ShowEnvMonitorItemsRequest request) {
        return new AsyncInvoker<ShowEnvMonitorItemsRequest, ShowEnvMonitorItemsResponse>(request,
            ApmMeta.showEnvMonitorItems, hcClient);
    }

    /**
     * 获取event的详情
     *
     * 获取event的详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowEventDetailRequest 请求对象
     * @return CompletableFuture<ShowEventDetailResponse>
     */
    public CompletableFuture<ShowEventDetailResponse> showEventDetailAsync(ShowEventDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, ApmMeta.showEventDetail);
    }

    /**
     * 获取event的详情
     *
     * 获取event的详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowEventDetailRequest 请求对象
     * @return AsyncInvoker<ShowEventDetailRequest, ShowEventDetailResponse>
     */
    public AsyncInvoker<ShowEventDetailRequest, ShowEventDetailResponse> showEventDetailAsyncInvoker(
        ShowEventDetailRequest request) {
        return new AsyncInvoker<ShowEventDetailRequest, ShowEventDetailResponse>(request, ApmMeta.showEventDetail,
            hcClient);
    }

    /**
     * 查询监控项配置信息
     *
     * 查询监控项配置信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowMonitorItemViewConfigRequest 请求对象
     * @return CompletableFuture<ShowMonitorItemViewConfigResponse>
     */
    public CompletableFuture<ShowMonitorItemViewConfigResponse> showMonitorItemViewConfigAsync(
        ShowMonitorItemViewConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, ApmMeta.showMonitorItemViewConfig);
    }

    /**
     * 查询监控项配置信息
     *
     * 查询监控项配置信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowMonitorItemViewConfigRequest 请求对象
     * @return AsyncInvoker<ShowMonitorItemViewConfigRequest, ShowMonitorItemViewConfigResponse>
     */
    public AsyncInvoker<ShowMonitorItemViewConfigRequest, ShowMonitorItemViewConfigResponse> showMonitorItemViewConfigAsyncInvoker(
        ShowMonitorItemViewConfigRequest request) {
        return new AsyncInvoker<ShowMonitorItemViewConfigRequest, ShowMonitorItemViewConfigResponse>(request,
            ApmMeta.showMonitorItemViewConfig, hcClient);
    }

    /**
     * 获取原始数据表格
     *
     * 获取原始数据表格。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowRawTableRequest 请求对象
     * @return CompletableFuture<ShowRawTableResponse>
     */
    public CompletableFuture<ShowRawTableResponse> showRawTableAsync(ShowRawTableRequest request) {
        return hcClient.asyncInvokeHttp(request, ApmMeta.showRawTable);
    }

    /**
     * 获取原始数据表格
     *
     * 获取原始数据表格。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowRawTableRequest 请求对象
     * @return AsyncInvoker<ShowRawTableRequest, ShowRawTableResponse>
     */
    public AsyncInvoker<ShowRawTableRequest, ShowRawTableResponse> showRawTableAsyncInvoker(
        ShowRawTableRequest request) {
        return new AsyncInvoker<ShowRawTableRequest, ShowRawTableResponse>(request, ApmMeta.showRawTable, hcClient);
    }

    /**
     * 查询span数据
     *
     * span数据查询接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowSpanSearchRequest 请求对象
     * @return CompletableFuture<ShowSpanSearchResponse>
     */
    public CompletableFuture<ShowSpanSearchResponse> showSpanSearchAsync(ShowSpanSearchRequest request) {
        return hcClient.asyncInvokeHttp(request, ApmMeta.showSpanSearch);
    }

    /**
     * 查询span数据
     *
     * span数据查询接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowSpanSearchRequest 请求对象
     * @return AsyncInvoker<ShowSpanSearchRequest, ShowSpanSearchResponse>
     */
    public AsyncInvoker<ShowSpanSearchRequest, ShowSpanSearchResponse> showSpanSearchAsyncInvoker(
        ShowSpanSearchRequest request) {
        return new AsyncInvoker<ShowSpanSearchRequest, ShowSpanSearchResponse>(request, ApmMeta.showSpanSearch,
            hcClient);
    }

    /**
     * 获取汇总表格数据
     *
     * 获取汇总表格数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowSumTableRequest 请求对象
     * @return CompletableFuture<ShowSumTableResponse>
     */
    public CompletableFuture<ShowSumTableResponse> showSumTableAsync(ShowSumTableRequest request) {
        return hcClient.asyncInvokeHttp(request, ApmMeta.showSumTable);
    }

    /**
     * 获取汇总表格数据
     *
     * 获取汇总表格数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowSumTableRequest 请求对象
     * @return AsyncInvoker<ShowSumTableRequest, ShowSumTableResponse>
     */
    public AsyncInvoker<ShowSumTableRequest, ShowSumTableResponse> showSumTableAsyncInvoker(
        ShowSumTableRequest request) {
        return new AsyncInvoker<ShowSumTableRequest, ShowSumTableResponse>(request, ApmMeta.showSumTable, hcClient);
    }

    /**
     * 调用链拓扑图
     *
     * 调用链拓扑图。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowTopologyRequest 请求对象
     * @return CompletableFuture<ShowTopologyResponse>
     */
    public CompletableFuture<ShowTopologyResponse> showTopologyAsync(ShowTopologyRequest request) {
        return hcClient.asyncInvokeHttp(request, ApmMeta.showTopology);
    }

    /**
     * 调用链拓扑图
     *
     * 调用链拓扑图。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowTopologyRequest 请求对象
     * @return AsyncInvoker<ShowTopologyRequest, ShowTopologyResponse>
     */
    public AsyncInvoker<ShowTopologyRequest, ShowTopologyResponse> showTopologyAsyncInvoker(
        ShowTopologyRequest request) {
        return new AsyncInvoker<ShowTopologyRequest, ShowTopologyResponse>(request, ApmMeta.showTopology, hcClient);
    }

    /**
     * 获取一个trace的所有调用链数据
     *
     * 获取一个trace的所有调用链数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowTraceEventsRequest 请求对象
     * @return CompletableFuture<ShowTraceEventsResponse>
     */
    public CompletableFuture<ShowTraceEventsResponse> showTraceEventsAsync(ShowTraceEventsRequest request) {
        return hcClient.asyncInvokeHttp(request, ApmMeta.showTraceEvents);
    }

    /**
     * 获取一个trace的所有调用链数据
     *
     * 获取一个trace的所有调用链数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowTraceEventsRequest 请求对象
     * @return AsyncInvoker<ShowTraceEventsRequest, ShowTraceEventsResponse>
     */
    public AsyncInvoker<ShowTraceEventsRequest, ShowTraceEventsResponse> showTraceEventsAsyncInvoker(
        ShowTraceEventsRequest request) {
        return new AsyncInvoker<ShowTraceEventsRequest, ShowTraceEventsResponse>(request, ApmMeta.showTraceEvents,
            hcClient);
    }

    /**
     * 获取趋势图
     *
     * 获取趋势图。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowTrendRequest 请求对象
     * @return CompletableFuture<ShowTrendResponse>
     */
    public CompletableFuture<ShowTrendResponse> showTrendAsync(ShowTrendRequest request) {
        return hcClient.asyncInvokeHttp(request, ApmMeta.showTrend);
    }

    /**
     * 获取趋势图
     *
     * 获取趋势图。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowTrendRequest 请求对象
     * @return AsyncInvoker<ShowTrendRequest, ShowTrendResponse>
     */
    public AsyncInvoker<ShowTrendRequest, ShowTrendResponse> showTrendAsyncInvoker(ShowTrendRequest request) {
        return new AsyncInvoker<ShowTrendRequest, ShowTrendResponse>(request, ApmMeta.showTrend, hcClient);
    }

}
