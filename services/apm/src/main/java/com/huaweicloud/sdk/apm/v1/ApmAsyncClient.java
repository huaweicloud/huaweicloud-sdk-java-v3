package com.huaweicloud.sdk.apm.v1;

import com.huaweicloud.sdk.apm.v1.model.*;
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
        return new ClientBuilder<>(ApmAsyncClient::new);
    }

    /**
     * 创建aksk
     *
     * 创建aksk
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 创建aksk
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 删除aksk
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 删除aksk
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 查询租户的aksk
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 查询租户的aksk
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowAkSksRequest 请求对象
     * @return AsyncInvoker<ShowAkSksRequest, ShowAkSksResponse>
     */
    public AsyncInvoker<ShowAkSksRequest, ShowAkSksResponse> showAkSksAsyncInvoker(ShowAkSksRequest request) {
        return new AsyncInvoker<ShowAkSksRequest, ShowAkSksResponse>(request, ApmMeta.showAkSks, hcClient);
    }

    /**
     * 获取ak/sk
     *
     * 获取该用户创建的ak/sk列表。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListAkSkRequest 请求对象
     * @return AsyncInvoker<ListAkSkRequest, ListAkSkResponse>
     */
    public AsyncInvoker<ListAkSkRequest, ListAkSkResponse> listAkSkAsyncInvoker(ListAkSkRequest request) {
        return new AsyncInvoker<ListAkSkRequest, ListAkSkResponse>(request, ApmMeta.listAkSk, hcClient);
    }

    /**
     * 查询业务列表
     *
     * 该接口用于查询对应用户下的业务。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListBusinessRequest 请求对象
     * @return CompletableFuture<ListBusinessResponse>
     */
    public CompletableFuture<ListBusinessResponse> listBusinessAsync(ListBusinessRequest request) {
        return hcClient.asyncInvokeHttp(request, ApmMeta.listBusiness);
    }

    /**
     * 查询业务列表
     *
     * 该接口用于查询对应用户下的业务。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 查询监控项列表
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 查询监控项列表
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 保存监控项
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 保存监控项
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 对指定区域下的应用和环境及其探针情况进行搜索
     *
     * 对指定区域下的应用和环境及其探针情况进行搜索
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param SearchApplicationRequest 请求对象
     * @return CompletableFuture<SearchApplicationResponse>
     */
    public CompletableFuture<SearchApplicationResponse> searchApplicationAsync(SearchApplicationRequest request) {
        return hcClient.asyncInvokeHttp(request, ApmMeta.searchApplication);
    }

    /**
     * 对指定区域下的应用和环境及其探针情况进行搜索
     *
     * 对指定区域下的应用和环境及其探针情况进行搜索
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 根据region名称获取该名称下的master服务podlb地址信息。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 根据region名称获取该名称下的master服务podlb地址信息。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 获取组件下的环境列表
     *
     * 获取组件下的环境列表
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 获取组件下的环境列表
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 获取组件列表
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 获取组件列表
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 查询环境标签接口
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 查询环境标签接口
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListEnvTagsRequest 请求对象
     * @return AsyncInvoker<ListEnvTagsRequest, ListEnvTagsResponse>
     */
    public AsyncInvoker<ListEnvTagsRequest, ListEnvTagsResponse> listEnvTagsAsyncInvoker(ListEnvTagsRequest request) {
        return new AsyncInvoker<ListEnvTagsRequest, ListEnvTagsResponse>(request, ApmMeta.listEnvTags, hcClient);
    }

    /**
     * 获取业务树
     *
     * 获取业务树
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowTopologyTreeRequest 请求对象
     * @return CompletableFuture<ShowTopologyTreeResponse>
     */
    public CompletableFuture<ShowTopologyTreeResponse> showTopologyTreeAsync(ShowTopologyTreeRequest request) {
        return hcClient.asyncInvokeHttp(request, ApmMeta.showTopologyTree);
    }

    /**
     * 获取业务树
     *
     * 获取业务树
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 该接口用于查询用户开通的region信息
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 该接口用于查询用户开通的region信息
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 获取实例信息列表
     *
     * 获取实例信息列表
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 获取实例信息列表
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 获取原始数据详情
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 获取原始数据详情
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 
     *
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowEnvMonitorItemsRequest 请求对象
     * @return CompletableFuture<ShowEnvMonitorItemsResponse>
     */
    public CompletableFuture<ShowEnvMonitorItemsResponse> showEnvMonitorItemsAsync(ShowEnvMonitorItemsRequest request) {
        return hcClient.asyncInvokeHttp(request, ApmMeta.showEnvMonitorItems);
    }

    /**
     * 
     *
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 获取event的详情
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 获取event的详情
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 查询监控项配置信息
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 查询监控项配置信息
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 获取原始数据表格
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 获取原始数据表格
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * span数据查询接口
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * span数据查询接口
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 获取汇总表格数据
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 获取汇总表格数据
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 调用链拓扑图
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 调用链拓扑图
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 获取一个trace的所有调用链数据
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 获取一个trace的所有调用链数据
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 获取趋势图
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 获取趋势图
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowTrendRequest 请求对象
     * @return AsyncInvoker<ShowTrendRequest, ShowTrendResponse>
     */
    public AsyncInvoker<ShowTrendRequest, ShowTrendResponse> showTrendAsyncInvoker(ShowTrendRequest request) {
        return new AsyncInvoker<ShowTrendRequest, ShowTrendResponse>(request, ApmMeta.showTrend, hcClient);
    }

}
