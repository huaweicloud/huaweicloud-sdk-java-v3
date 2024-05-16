package com.huaweicloud.sdk.apm.v1;

import com.huaweicloud.sdk.apm.v1.model.ChangeAgentStatusRequest;
import com.huaweicloud.sdk.apm.v1.model.ChangeAgentStatusResponse;
import com.huaweicloud.sdk.apm.v1.model.CreateAkSkRequest;
import com.huaweicloud.sdk.apm.v1.model.CreateAkSkResponse;
import com.huaweicloud.sdk.apm.v1.model.CreateBusinessRequest;
import com.huaweicloud.sdk.apm.v1.model.CreateBusinessResponse;
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
import com.huaweicloud.sdk.apm.v1.model.ShowAccessPointRequest;
import com.huaweicloud.sdk.apm.v1.model.ShowAccessPointResponse;
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
import com.huaweicloud.sdk.apm.v1.model.ShowFlameLineTreeRequest;
import com.huaweicloud.sdk.apm.v1.model.ShowFlameLineTreeResponse;
import com.huaweicloud.sdk.apm.v1.model.ShowMasterAddressRequest;
import com.huaweicloud.sdk.apm.v1.model.ShowMasterAddressResponse;
import com.huaweicloud.sdk.apm.v1.model.ShowMonitorItemDetailRequest;
import com.huaweicloud.sdk.apm.v1.model.ShowMonitorItemDetailResponse;
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
import com.huaweicloud.sdk.apm.v1.model.ShowTokenRequest;
import com.huaweicloud.sdk.apm.v1.model.ShowTokenResponse;
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
     * @param request CreateAkSkRequest 请求对象
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
     * @param request CreateAkSkRequest 请求对象
     * @return AsyncInvoker<CreateAkSkRequest, CreateAkSkResponse>
     */
    public AsyncInvoker<CreateAkSkRequest, CreateAkSkResponse> createAkSkAsyncInvoker(CreateAkSkRequest request) {
        return new AsyncInvoker<>(request, ApmMeta.createAkSk, hcClient);
    }

    /**
     * 删除aksk
     *
     * 删除aksk。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAkSkRequest 请求对象
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
     * @param request DeleteAkSkRequest 请求对象
     * @return AsyncInvoker<DeleteAkSkRequest, DeleteAkSkResponse>
     */
    public AsyncInvoker<DeleteAkSkRequest, DeleteAkSkResponse> deleteAkSkAsyncInvoker(DeleteAkSkRequest request) {
        return new AsyncInvoker<>(request, ApmMeta.deleteAkSk, hcClient);
    }

    /**
     * 查询租户的aksk
     *
     * 查询租户的aksk。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAkSksRequest 请求对象
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
     * @param request ShowAkSksRequest 请求对象
     * @return AsyncInvoker<ShowAkSksRequest, ShowAkSksResponse>
     */
    public AsyncInvoker<ShowAkSksRequest, ShowAkSksResponse> showAkSksAsyncInvoker(ShowAkSksRequest request) {
        return new AsyncInvoker<>(request, ApmMeta.showAkSks, hcClient);
    }

    /**
     * 查询告警列表
     *
     * 查询系统中存在的告警。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAlarmDataRequest 请求对象
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
     * @param request ListAlarmDataRequest 请求对象
     * @return AsyncInvoker<ListAlarmDataRequest, ListAlarmDataResponse>
     */
    public AsyncInvoker<ListAlarmDataRequest, ListAlarmDataResponse> listAlarmDataAsyncInvoker(
        ListAlarmDataRequest request) {
        return new AsyncInvoker<>(request, ApmMeta.listAlarmData, hcClient);
    }

    /**
     * 查询告警消息列表
     *
     * 查询单个告警的触发详情与历史。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAlarmNotifyRequest 请求对象
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
     * @param request ListAlarmNotifyRequest 请求对象
     * @return AsyncInvoker<ListAlarmNotifyRequest, ListAlarmNotifyResponse>
     */
    public AsyncInvoker<ListAlarmNotifyRequest, ListAlarmNotifyResponse> listAlarmNotifyAsyncInvoker(
        ListAlarmNotifyRequest request) {
        return new AsyncInvoker<>(request, ApmMeta.listAlarmNotify, hcClient);
    }

    /**
     * 更改实例的采集状态
     *
     * 改变指定实例的采集状态：开启和关闭。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeAgentStatusRequest 请求对象
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
     * @param request ChangeAgentStatusRequest 请求对象
     * @return AsyncInvoker<ChangeAgentStatusRequest, ChangeAgentStatusResponse>
     */
    public AsyncInvoker<ChangeAgentStatusRequest, ChangeAgentStatusResponse> changeAgentStatusAsyncInvoker(
        ChangeAgentStatusRequest request) {
        return new AsyncInvoker<>(request, ApmMeta.changeAgentStatus, hcClient);
    }

    /**
     * 删除agent
     *
     * 删除agent
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAgentRequest 请求对象
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
     * @param request DeleteAgentRequest 请求对象
     * @return AsyncInvoker<DeleteAgentRequest, DeleteAgentResponse>
     */
    public AsyncInvoker<DeleteAgentRequest, DeleteAgentResponse> deleteAgentAsyncInvoker(DeleteAgentRequest request) {
        return new AsyncInvoker<>(request, ApmMeta.deleteAgent, hcClient);
    }

    /**
     * 获取ak/sk
     *
     * 获取该用户创建的ak/sk列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAkSkRequest 请求对象
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
     * @param request ListAkSkRequest 请求对象
     * @return AsyncInvoker<ListAkSkRequest, ListAkSkResponse>
     */
    public AsyncInvoker<ListAkSkRequest, ListAkSkResponse> listAkSkAsyncInvoker(ListAkSkRequest request) {
        return new AsyncInvoker<>(request, ApmMeta.listAkSk, hcClient);
    }

    /**
     * 查询应用列表
     *
     * 该接口用于查询对应用户下的应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBusinessRequest 请求对象
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
     * @param request ListBusinessRequest 请求对象
     * @return AsyncInvoker<ListBusinessRequest, ListBusinessResponse>
     */
    public AsyncInvoker<ListBusinessRequest, ListBusinessResponse> listBusinessAsyncInvoker(
        ListBusinessRequest request) {
        return new AsyncInvoker<>(request, ApmMeta.listBusiness, hcClient);
    }

    /**
     * 查询监控项列表
     *
     * 查询监控项列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEnvMonitorItemRequest 请求对象
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
     * @param request ListEnvMonitorItemRequest 请求对象
     * @return AsyncInvoker<ListEnvMonitorItemRequest, ListEnvMonitorItemResponse>
     */
    public AsyncInvoker<ListEnvMonitorItemRequest, ListEnvMonitorItemResponse> listEnvMonitorItemAsyncInvoker(
        ListEnvMonitorItemRequest request) {
        return new AsyncInvoker<>(request, ApmMeta.listEnvMonitorItem, hcClient);
    }

    /**
     * 保存监控项
     *
     * 保存监控项。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SaveMonitorItemConfigRequest 请求对象
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
     * @param request SaveMonitorItemConfigRequest 请求对象
     * @return AsyncInvoker<SaveMonitorItemConfigRequest, SaveMonitorItemConfigResponse>
     */
    public AsyncInvoker<SaveMonitorItemConfigRequest, SaveMonitorItemConfigResponse> saveMonitorItemConfigAsyncInvoker(
        SaveMonitorItemConfigRequest request) {
        return new AsyncInvoker<>(request, ApmMeta.saveMonitorItemConfig, hcClient);
    }

    /**
     * 查询应用下所有探针
     *
     * 该接口用于搜索应用下所有探针情况。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchAgentRequest 请求对象
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
     * @param request SearchAgentRequest 请求对象
     * @return AsyncInvoker<SearchAgentRequest, SearchAgentResponse>
     */
    public AsyncInvoker<SearchAgentRequest, SearchAgentResponse> searchAgentAsyncInvoker(SearchAgentRequest request) {
        return new AsyncInvoker<>(request, ApmMeta.searchAgent, hcClient);
    }

    /**
     * 对指定区域下的组件和环境及其探针情况进行搜索
     *
     * 对指定区域下的组件和环境及其探针情况进行搜索。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchApplicationRequest 请求对象
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
     * @param request SearchApplicationRequest 请求对象
     * @return AsyncInvoker<SearchApplicationRequest, SearchApplicationResponse>
     */
    public AsyncInvoker<SearchApplicationRequest, SearchApplicationResponse> searchApplicationAsyncInvoker(
        SearchApplicationRequest request) {
        return new AsyncInvoker<>(request, ApmMeta.searchApplication, hcClient);
    }

    /**
     * 查询master地址
     *
     * 根据region名称获取该region下的master服务podlb地址信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMasterAddressRequest 请求对象
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
     * @param request ShowMasterAddressRequest 请求对象
     * @return AsyncInvoker<ShowMasterAddressRequest, ShowMasterAddressResponse>
     */
    public AsyncInvoker<ShowMasterAddressRequest, ShowMasterAddressResponse> showMasterAddressAsyncInvoker(
        ShowMasterAddressRequest request) {
        return new AsyncInvoker<>(request, ApmMeta.showMasterAddress, hcClient);
    }

    /**
     * 根据组件id删除指定的组件
     *
     * 该接口用于删除指定的组件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAppRequest 请求对象
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
     * @param request DeleteAppRequest 请求对象
     * @return AsyncInvoker<DeleteAppRequest, DeleteAppResponse>
     */
    public AsyncInvoker<DeleteAppRequest, DeleteAppResponse> deleteAppAsyncInvoker(DeleteAppRequest request) {
        return new AsyncInvoker<>(request, ApmMeta.deleteApp, hcClient);
    }

    /**
     * 获取组件下的环境列表
     *
     * 获取组件下的环境列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAppEnvsRequest 请求对象
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
     * @param request ListAppEnvsRequest 请求对象
     * @return AsyncInvoker<ListAppEnvsRequest, ListAppEnvsResponse>
     */
    public AsyncInvoker<ListAppEnvsRequest, ListAppEnvsResponse> listAppEnvsAsyncInvoker(ListAppEnvsRequest request) {
        return new AsyncInvoker<>(request, ApmMeta.listAppEnvs, hcClient);
    }

    /**
     * 获取组件列表
     *
     * 获取组件列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAppsRequest 请求对象
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
     * @param request ListAppsRequest 请求对象
     * @return AsyncInvoker<ListAppsRequest, ListAppsResponse>
     */
    public AsyncInvoker<ListAppsRequest, ListAppsResponse> listAppsAsyncInvoker(ListAppsRequest request) {
        return new AsyncInvoker<>(request, ApmMeta.listApps, hcClient);
    }

    /**
     * 查询环境标签
     *
     * 查询环境标签接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEnvTagsRequest 请求对象
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
     * @param request ListEnvTagsRequest 请求对象
     * @return AsyncInvoker<ListEnvTagsRequest, ListEnvTagsResponse>
     */
    public AsyncInvoker<ListEnvTagsRequest, ListEnvTagsResponse> listEnvTagsAsyncInvoker(ListEnvTagsRequest request) {
        return new AsyncInvoker<>(request, ApmMeta.listEnvTags, hcClient);
    }

    /**
     * 查询单个应用的详情
     *
     * 查询单个应用的详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBusinessDetailRequest 请求对象
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
     * @param request ShowBusinessDetailRequest 请求对象
     * @return AsyncInvoker<ShowBusinessDetailRequest, ShowBusinessDetailResponse>
     */
    public AsyncInvoker<ShowBusinessDetailRequest, ShowBusinessDetailResponse> showBusinessDetailAsyncInvoker(
        ShowBusinessDetailRequest request) {
        return new AsyncInvoker<>(request, ApmMeta.showBusinessDetail, hcClient);
    }

    /**
     * 查询子应用详情
     *
     * 查询单个子应用详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSubBusinessDetailRequest 请求对象
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
     * @param request ShowSubBusinessDetailRequest 请求对象
     * @return AsyncInvoker<ShowSubBusinessDetailRequest, ShowSubBusinessDetailResponse>
     */
    public AsyncInvoker<ShowSubBusinessDetailRequest, ShowSubBusinessDetailResponse> showSubBusinessDetailAsyncInvoker(
        ShowSubBusinessDetailRequest request) {
        return new AsyncInvoker<>(request, ApmMeta.showSubBusinessDetail, hcClient);
    }

    /**
     * 获取应用树
     *
     * 获取应用树。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTopologyTreeRequest 请求对象
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
     * @param request ShowTopologyTreeRequest 请求对象
     * @return AsyncInvoker<ShowTopologyTreeRequest, ShowTopologyTreeResponse>
     */
    public AsyncInvoker<ShowTopologyTreeRequest, ShowTopologyTreeResponse> showTopologyTreeAsyncInvoker(
        ShowTopologyTreeRequest request) {
        return new AsyncInvoker<>(request, ApmMeta.showTopologyTree, hcClient);
    }

    /**
     * 
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFlameLineTreeRequest 请求对象
     * @return CompletableFuture<ShowFlameLineTreeResponse>
     */
    public CompletableFuture<ShowFlameLineTreeResponse> showFlameLineTreeAsync(ShowFlameLineTreeRequest request) {
        return hcClient.asyncInvokeHttp(request, ApmMeta.showFlameLineTree);
    }

    /**
     * 
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFlameLineTreeRequest 请求对象
     * @return AsyncInvoker<ShowFlameLineTreeRequest, ShowFlameLineTreeResponse>
     */
    public AsyncInvoker<ShowFlameLineTreeRequest, ShowFlameLineTreeResponse> showFlameLineTreeAsyncInvoker(
        ShowFlameLineTreeRequest request) {
        return new AsyncInvoker<>(request, ApmMeta.showFlameLineTree, hcClient);
    }

    /**
     * 查询开通的region
     *
     * 该接口用于查询用户开通的region信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListOpenRegionRequest 请求对象
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
     * @param request ListOpenRegionRequest 请求对象
     * @return AsyncInvoker<ListOpenRegionRequest, ListOpenRegionResponse>
     */
    public AsyncInvoker<ListOpenRegionRequest, ListOpenRegionResponse> listOpenRegionAsyncInvoker(
        ListOpenRegionRequest request) {
        return new AsyncInvoker<>(request, ApmMeta.listOpenRegion, hcClient);
    }

    /**
     * 查询所有的支持的region
     *
     * 查询所有的支持的region信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSupportedRegionRequest 请求对象
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
     * @param request ListSupportedRegionRequest 请求对象
     * @return AsyncInvoker<ListSupportedRegionRequest, ListSupportedRegionResponse>
     */
    public AsyncInvoker<ListSupportedRegionRequest, ListSupportedRegionResponse> listSupportedRegionAsyncInvoker(
        ListSupportedRegionRequest request) {
        return new AsyncInvoker<>(request, ApmMeta.listSupportedRegion, hcClient);
    }

    /**
     * 查询应用全局拓扑图
     *
     * 查询应用级别全局拓扑图信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchBusinessTopologyRequest 请求对象
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
     * @param request SearchBusinessTopologyRequest 请求对象
     * @return AsyncInvoker<SearchBusinessTopologyRequest, SearchBusinessTopologyResponse>
     */
    public AsyncInvoker<SearchBusinessTopologyRequest, SearchBusinessTopologyResponse> searchBusinessTopologyAsyncInvoker(
        SearchBusinessTopologyRequest request) {
        return new AsyncInvoker<>(request, ApmMeta.searchBusinessTopology, hcClient);
    }

    /**
     * 查询组件环境拓扑图
     *
     * 查询组件环境级别全局拓扑图信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchEnvTopologyRequest 请求对象
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
     * @param request SearchEnvTopologyRequest 请求对象
     * @return AsyncInvoker<SearchEnvTopologyRequest, SearchEnvTopologyResponse>
     */
    public AsyncInvoker<SearchEnvTopologyRequest, SearchEnvTopologyResponse> searchEnvTopologyAsyncInvoker(
        SearchEnvTopologyRequest request) {
        return new AsyncInvoker<>(request, ApmMeta.searchEnvTopology, hcClient);
    }

    /**
     * 创建链路追踪应用
     *
     * 创建链路追踪应用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateBusinessRequest 请求对象
     * @return CompletableFuture<CreateBusinessResponse>
     */
    public CompletableFuture<CreateBusinessResponse> createBusinessAsync(CreateBusinessRequest request) {
        return hcClient.asyncInvokeHttp(request, ApmMeta.createBusiness);
    }

    /**
     * 创建链路追踪应用
     *
     * 创建链路追踪应用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateBusinessRequest 请求对象
     * @return AsyncInvoker<CreateBusinessRequest, CreateBusinessResponse>
     */
    public AsyncInvoker<CreateBusinessRequest, CreateBusinessResponse> createBusinessAsyncInvoker(
        CreateBusinessRequest request) {
        return new AsyncInvoker<>(request, ApmMeta.createBusiness, hcClient);
    }

    /**
     * 获取链路追踪应用接入地址
     *
     * 获取链路追踪应用接入地址
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAccessPointRequest 请求对象
     * @return CompletableFuture<ShowAccessPointResponse>
     */
    public CompletableFuture<ShowAccessPointResponse> showAccessPointAsync(ShowAccessPointRequest request) {
        return hcClient.asyncInvokeHttp(request, ApmMeta.showAccessPoint);
    }

    /**
     * 获取链路追踪应用接入地址
     *
     * 获取链路追踪应用接入地址
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAccessPointRequest 请求对象
     * @return AsyncInvoker<ShowAccessPointRequest, ShowAccessPointResponse>
     */
    public AsyncInvoker<ShowAccessPointRequest, ShowAccessPointResponse> showAccessPointAsyncInvoker(
        ShowAccessPointRequest request) {
        return new AsyncInvoker<>(request, ApmMeta.showAccessPoint, hcClient);
    }

    /**
     * 获取链路追踪应用的token
     *
     * 获取链路追踪应用的token
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTokenRequest 请求对象
     * @return CompletableFuture<ShowTokenResponse>
     */
    public CompletableFuture<ShowTokenResponse> showTokenAsync(ShowTokenRequest request) {
        return hcClient.asyncInvokeHttp(request, ApmMeta.showToken);
    }

    /**
     * 获取链路追踪应用的token
     *
     * 获取链路追踪应用的token
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTokenRequest 请求对象
     * @return AsyncInvoker<ShowTokenRequest, ShowTokenResponse>
     */
    public AsyncInvoker<ShowTokenRequest, ShowTokenResponse> showTokenAsyncInvoker(ShowTokenRequest request) {
        return new AsyncInvoker<>(request, ApmMeta.showToken, hcClient);
    }

    /**
     * 查询URL跟踪Region环境列表
     *
     * 查询所选Region下设置了URL跟踪的环境列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBusinessEnvRequest 请求对象
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
     * @param request ListBusinessEnvRequest 请求对象
     * @return AsyncInvoker<ListBusinessEnvRequest, ListBusinessEnvResponse>
     */
    public AsyncInvoker<ListBusinessEnvRequest, ListBusinessEnvResponse> listBusinessEnvAsyncInvoker(
        ListBusinessEnvRequest request) {
        return new AsyncInvoker<>(request, ApmMeta.listBusinessEnv, hcClient);
    }

    /**
     * 查询URL跟踪视图列表
     *
     * 查询当前被调用的URL跟踪视图列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchTransactionRequest 请求对象
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
     * @param request SearchTransactionRequest 请求对象
     * @return AsyncInvoker<SearchTransactionRequest, SearchTransactionResponse>
     */
    public AsyncInvoker<SearchTransactionRequest, SearchTransactionResponse> searchTransactionAsyncInvoker(
        SearchTransactionRequest request) {
        return new AsyncInvoker<>(request, ApmMeta.searchTransaction, hcClient);
    }

    /**
     * 查询URL跟踪配置列表
     *
     * 查询已配置好的URL跟踪配置列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchTransactionConfigRequest 请求对象
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
     * @param request SearchTransactionConfigRequest 请求对象
     * @return AsyncInvoker<SearchTransactionConfigRequest, SearchTransactionConfigResponse>
     */
    public AsyncInvoker<SearchTransactionConfigRequest, SearchTransactionConfigResponse> searchTransactionConfigAsyncInvoker(
        SearchTransactionConfigRequest request) {
        return new AsyncInvoker<>(request, ApmMeta.searchTransactionConfig, hcClient);
    }

    /**
     * 查询URL跟踪视图详情
     *
     * 查询某条URL跟踪视图详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTransactionDetailRequest 请求对象
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
     * @param request ShowTransactionDetailRequest 请求对象
     * @return AsyncInvoker<ShowTransactionDetailRequest, ShowTransactionDetailResponse>
     */
    public AsyncInvoker<ShowTransactionDetailRequest, ShowTransactionDetailResponse> showTransactionDetailAsyncInvoker(
        ShowTransactionDetailRequest request) {
        return new AsyncInvoker<>(request, ApmMeta.showTransactionDetail, hcClient);
    }

    /**
     * 获取实例信息列表
     *
     * 获取实例信息列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEnvInstancesRequest 请求对象
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
     * @param request ListEnvInstancesRequest 请求对象
     * @return AsyncInvoker<ListEnvInstancesRequest, ListEnvInstancesResponse>
     */
    public AsyncInvoker<ListEnvInstancesRequest, ListEnvInstancesResponse> listEnvInstancesAsyncInvoker(
        ListEnvInstancesRequest request) {
        return new AsyncInvoker<>(request, ApmMeta.listEnvInstances, hcClient);
    }

    /**
     * 获取原始数据详情
     *
     * 获取原始数据详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowClobDetailRequest 请求对象
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
     * @param request ShowClobDetailRequest 请求对象
     * @return AsyncInvoker<ShowClobDetailRequest, ShowClobDetailResponse>
     */
    public AsyncInvoker<ShowClobDetailRequest, ShowClobDetailResponse> showClobDetailAsyncInvoker(
        ShowClobDetailRequest request) {
        return new AsyncInvoker<>(request, ApmMeta.showClobDetail, hcClient);
    }

    /**
     * 获取监控项信息
     *
     * 获取监控项信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowEnvMonitorItemsRequest 请求对象
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
     * @param request ShowEnvMonitorItemsRequest 请求对象
     * @return AsyncInvoker<ShowEnvMonitorItemsRequest, ShowEnvMonitorItemsResponse>
     */
    public AsyncInvoker<ShowEnvMonitorItemsRequest, ShowEnvMonitorItemsResponse> showEnvMonitorItemsAsyncInvoker(
        ShowEnvMonitorItemsRequest request) {
        return new AsyncInvoker<>(request, ApmMeta.showEnvMonitorItems, hcClient);
    }

    /**
     * 获取event的详情
     *
     * 获取event的详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowEventDetailRequest 请求对象
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
     * @param request ShowEventDetailRequest 请求对象
     * @return AsyncInvoker<ShowEventDetailRequest, ShowEventDetailResponse>
     */
    public AsyncInvoker<ShowEventDetailRequest, ShowEventDetailResponse> showEventDetailAsyncInvoker(
        ShowEventDetailRequest request) {
        return new AsyncInvoker<>(request, ApmMeta.showEventDetail, hcClient);
    }

    /**
     * 获取一个监控项的详情
     *
     * 获取一个监控项的详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMonitorItemDetailRequest 请求对象
     * @return CompletableFuture<ShowMonitorItemDetailResponse>
     */
    public CompletableFuture<ShowMonitorItemDetailResponse> showMonitorItemDetailAsync(
        ShowMonitorItemDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, ApmMeta.showMonitorItemDetail);
    }

    /**
     * 获取一个监控项的详情
     *
     * 获取一个监控项的详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMonitorItemDetailRequest 请求对象
     * @return AsyncInvoker<ShowMonitorItemDetailRequest, ShowMonitorItemDetailResponse>
     */
    public AsyncInvoker<ShowMonitorItemDetailRequest, ShowMonitorItemDetailResponse> showMonitorItemDetailAsyncInvoker(
        ShowMonitorItemDetailRequest request) {
        return new AsyncInvoker<>(request, ApmMeta.showMonitorItemDetail, hcClient);
    }

    /**
     * 查询监控项配置信息
     *
     * 查询监控项配置信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMonitorItemViewConfigRequest 请求对象
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
     * @param request ShowMonitorItemViewConfigRequest 请求对象
     * @return AsyncInvoker<ShowMonitorItemViewConfigRequest, ShowMonitorItemViewConfigResponse>
     */
    public AsyncInvoker<ShowMonitorItemViewConfigRequest, ShowMonitorItemViewConfigResponse> showMonitorItemViewConfigAsyncInvoker(
        ShowMonitorItemViewConfigRequest request) {
        return new AsyncInvoker<>(request, ApmMeta.showMonitorItemViewConfig, hcClient);
    }

    /**
     * 获取原始数据表格
     *
     * 获取原始数据表格。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRawTableRequest 请求对象
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
     * @param request ShowRawTableRequest 请求对象
     * @return AsyncInvoker<ShowRawTableRequest, ShowRawTableResponse>
     */
    public AsyncInvoker<ShowRawTableRequest, ShowRawTableResponse> showRawTableAsyncInvoker(
        ShowRawTableRequest request) {
        return new AsyncInvoker<>(request, ApmMeta.showRawTable, hcClient);
    }

    /**
     * 查询span数据
     *
     * span数据查询接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSpanSearchRequest 请求对象
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
     * @param request ShowSpanSearchRequest 请求对象
     * @return AsyncInvoker<ShowSpanSearchRequest, ShowSpanSearchResponse>
     */
    public AsyncInvoker<ShowSpanSearchRequest, ShowSpanSearchResponse> showSpanSearchAsyncInvoker(
        ShowSpanSearchRequest request) {
        return new AsyncInvoker<>(request, ApmMeta.showSpanSearch, hcClient);
    }

    /**
     * 获取汇总表格数据
     *
     * 获取汇总表格数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSumTableRequest 请求对象
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
     * @param request ShowSumTableRequest 请求对象
     * @return AsyncInvoker<ShowSumTableRequest, ShowSumTableResponse>
     */
    public AsyncInvoker<ShowSumTableRequest, ShowSumTableResponse> showSumTableAsyncInvoker(
        ShowSumTableRequest request) {
        return new AsyncInvoker<>(request, ApmMeta.showSumTable, hcClient);
    }

    /**
     * 调用链拓扑图
     *
     * 调用链拓扑图。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTopologyRequest 请求对象
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
     * @param request ShowTopologyRequest 请求对象
     * @return AsyncInvoker<ShowTopologyRequest, ShowTopologyResponse>
     */
    public AsyncInvoker<ShowTopologyRequest, ShowTopologyResponse> showTopologyAsyncInvoker(
        ShowTopologyRequest request) {
        return new AsyncInvoker<>(request, ApmMeta.showTopology, hcClient);
    }

    /**
     * 获取一个trace的所有调用链数据
     *
     * 获取一个trace的所有调用链数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTraceEventsRequest 请求对象
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
     * @param request ShowTraceEventsRequest 请求对象
     * @return AsyncInvoker<ShowTraceEventsRequest, ShowTraceEventsResponse>
     */
    public AsyncInvoker<ShowTraceEventsRequest, ShowTraceEventsResponse> showTraceEventsAsyncInvoker(
        ShowTraceEventsRequest request) {
        return new AsyncInvoker<>(request, ApmMeta.showTraceEvents, hcClient);
    }

    /**
     * 获取趋势图
     *
     * 获取趋势图。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTrendRequest 请求对象
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
     * @param request ShowTrendRequest 请求对象
     * @return AsyncInvoker<ShowTrendRequest, ShowTrendResponse>
     */
    public AsyncInvoker<ShowTrendRequest, ShowTrendResponse> showTrendAsyncInvoker(ShowTrendRequest request) {
        return new AsyncInvoker<>(request, ApmMeta.showTrend, hcClient);
    }

}
