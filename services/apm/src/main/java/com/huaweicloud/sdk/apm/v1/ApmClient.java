package com.huaweicloud.sdk.apm.v1;

import com.huaweicloud.sdk.apm.v1.model.*;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;

public class ApmClient {

    protected HcClient hcClient;

    public ApmClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<ApmClient> newBuilder() {
        return new ClientBuilder<>(ApmClient::new);
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
     * @return CreateAkSkResponse
     */
    public CreateAkSkResponse createAkSk(CreateAkSkRequest request) {
        return hcClient.syncInvokeHttp(request, ApmMeta.createAkSk);
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
     * @return SyncInvoker<CreateAkSkRequest, CreateAkSkResponse>
     */
    public SyncInvoker<CreateAkSkRequest, CreateAkSkResponse> createAkSkInvoker(CreateAkSkRequest request) {
        return new SyncInvoker<CreateAkSkRequest, CreateAkSkResponse>(request, ApmMeta.createAkSk, hcClient);
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
     * @return DeleteAkSkResponse
     */
    public DeleteAkSkResponse deleteAkSk(DeleteAkSkRequest request) {
        return hcClient.syncInvokeHttp(request, ApmMeta.deleteAkSk);
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
     * @return SyncInvoker<DeleteAkSkRequest, DeleteAkSkResponse>
     */
    public SyncInvoker<DeleteAkSkRequest, DeleteAkSkResponse> deleteAkSkInvoker(DeleteAkSkRequest request) {
        return new SyncInvoker<DeleteAkSkRequest, DeleteAkSkResponse>(request, ApmMeta.deleteAkSk, hcClient);
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
     * @return ShowAkSksResponse
     */
    public ShowAkSksResponse showAkSks(ShowAkSksRequest request) {
        return hcClient.syncInvokeHttp(request, ApmMeta.showAkSks);
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
     * @return SyncInvoker<ShowAkSksRequest, ShowAkSksResponse>
     */
    public SyncInvoker<ShowAkSksRequest, ShowAkSksResponse> showAkSksInvoker(ShowAkSksRequest request) {
        return new SyncInvoker<ShowAkSksRequest, ShowAkSksResponse>(request, ApmMeta.showAkSks, hcClient);
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListAkSkRequest 请求对象
     * @return SyncInvoker<ListAkSkRequest, ListAkSkResponse>
     */
    public SyncInvoker<ListAkSkRequest, ListAkSkResponse> listAkSkInvoker(ListAkSkRequest request) {
        return new SyncInvoker<ListAkSkRequest, ListAkSkResponse>(request, ApmMeta.listAkSk, hcClient);
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
     * @return ListBusinessResponse
     */
    public ListBusinessResponse listBusiness(ListBusinessRequest request) {
        return hcClient.syncInvokeHttp(request, ApmMeta.listBusiness);
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
     * @return SyncInvoker<ListBusinessRequest, ListBusinessResponse>
     */
    public SyncInvoker<ListBusinessRequest, ListBusinessResponse> listBusinessInvoker(ListBusinessRequest request) {
        return new SyncInvoker<ListBusinessRequest, ListBusinessResponse>(request, ApmMeta.listBusiness, hcClient);
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
     * @return ListEnvMonitorItemResponse
     */
    public ListEnvMonitorItemResponse listEnvMonitorItem(ListEnvMonitorItemRequest request) {
        return hcClient.syncInvokeHttp(request, ApmMeta.listEnvMonitorItem);
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
     * @return SyncInvoker<ListEnvMonitorItemRequest, ListEnvMonitorItemResponse>
     */
    public SyncInvoker<ListEnvMonitorItemRequest, ListEnvMonitorItemResponse> listEnvMonitorItemInvoker(
        ListEnvMonitorItemRequest request) {
        return new SyncInvoker<ListEnvMonitorItemRequest, ListEnvMonitorItemResponse>(request,
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
     * @return SaveMonitorItemConfigResponse
     */
    public SaveMonitorItemConfigResponse saveMonitorItemConfig(SaveMonitorItemConfigRequest request) {
        return hcClient.syncInvokeHttp(request, ApmMeta.saveMonitorItemConfig);
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
     * @return SyncInvoker<SaveMonitorItemConfigRequest, SaveMonitorItemConfigResponse>
     */
    public SyncInvoker<SaveMonitorItemConfigRequest, SaveMonitorItemConfigResponse> saveMonitorItemConfigInvoker(
        SaveMonitorItemConfigRequest request) {
        return new SyncInvoker<SaveMonitorItemConfigRequest, SaveMonitorItemConfigResponse>(request,
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
     * @return SearchApplicationResponse
     */
    public SearchApplicationResponse searchApplication(SearchApplicationRequest request) {
        return hcClient.syncInvokeHttp(request, ApmMeta.searchApplication);
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
     * @return SyncInvoker<SearchApplicationRequest, SearchApplicationResponse>
     */
    public SyncInvoker<SearchApplicationRequest, SearchApplicationResponse> searchApplicationInvoker(
        SearchApplicationRequest request) {
        return new SyncInvoker<SearchApplicationRequest, SearchApplicationResponse>(request, ApmMeta.searchApplication,
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
     * @return ShowMasterAddressResponse
     */
    public ShowMasterAddressResponse showMasterAddress(ShowMasterAddressRequest request) {
        return hcClient.syncInvokeHttp(request, ApmMeta.showMasterAddress);
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
     * @return SyncInvoker<ShowMasterAddressRequest, ShowMasterAddressResponse>
     */
    public SyncInvoker<ShowMasterAddressRequest, ShowMasterAddressResponse> showMasterAddressInvoker(
        ShowMasterAddressRequest request) {
        return new SyncInvoker<ShowMasterAddressRequest, ShowMasterAddressResponse>(request, ApmMeta.showMasterAddress,
            hcClient);
    }

    /**
     * 根据组件id删除指定的组件
     *
     * 该接口用于删除指定的组件
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteAppRequest 请求对象
     * @return DeleteAppResponse
     */
    public DeleteAppResponse deleteApp(DeleteAppRequest request) {
        return hcClient.syncInvokeHttp(request, ApmMeta.deleteApp);
    }

    /**
     * 根据组件id删除指定的组件
     *
     * 该接口用于删除指定的组件
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteAppRequest 请求对象
     * @return SyncInvoker<DeleteAppRequest, DeleteAppResponse>
     */
    public SyncInvoker<DeleteAppRequest, DeleteAppResponse> deleteAppInvoker(DeleteAppRequest request) {
        return new SyncInvoker<DeleteAppRequest, DeleteAppResponse>(request, ApmMeta.deleteApp, hcClient);
    }

    /**
     * 根据环境id删除指定的环境
     *
     * 该接口用于删除指定的环境
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteEnvRequest 请求对象
     * @return DeleteEnvResponse
     */
    public DeleteEnvResponse deleteEnv(DeleteEnvRequest request) {
        return hcClient.syncInvokeHttp(request, ApmMeta.deleteEnv);
    }

    /**
     * 根据环境id删除指定的环境
     *
     * 该接口用于删除指定的环境
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteEnvRequest 请求对象
     * @return SyncInvoker<DeleteEnvRequest, DeleteEnvResponse>
     */
    public SyncInvoker<DeleteEnvRequest, DeleteEnvResponse> deleteEnvInvoker(DeleteEnvRequest request) {
        return new SyncInvoker<DeleteEnvRequest, DeleteEnvResponse>(request, ApmMeta.deleteEnv, hcClient);
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
     * @return ListAppEnvsResponse
     */
    public ListAppEnvsResponse listAppEnvs(ListAppEnvsRequest request) {
        return hcClient.syncInvokeHttp(request, ApmMeta.listAppEnvs);
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
     * @return SyncInvoker<ListAppEnvsRequest, ListAppEnvsResponse>
     */
    public SyncInvoker<ListAppEnvsRequest, ListAppEnvsResponse> listAppEnvsInvoker(ListAppEnvsRequest request) {
        return new SyncInvoker<ListAppEnvsRequest, ListAppEnvsResponse>(request, ApmMeta.listAppEnvs, hcClient);
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
     * @return ListAppsResponse
     */
    public ListAppsResponse listApps(ListAppsRequest request) {
        return hcClient.syncInvokeHttp(request, ApmMeta.listApps);
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
     * @return SyncInvoker<ListAppsRequest, ListAppsResponse>
     */
    public SyncInvoker<ListAppsRequest, ListAppsResponse> listAppsInvoker(ListAppsRequest request) {
        return new SyncInvoker<ListAppsRequest, ListAppsResponse>(request, ApmMeta.listApps, hcClient);
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
     * @return ListEnvTagsResponse
     */
    public ListEnvTagsResponse listEnvTags(ListEnvTagsRequest request) {
        return hcClient.syncInvokeHttp(request, ApmMeta.listEnvTags);
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
     * @return SyncInvoker<ListEnvTagsRequest, ListEnvTagsResponse>
     */
    public SyncInvoker<ListEnvTagsRequest, ListEnvTagsResponse> listEnvTagsInvoker(ListEnvTagsRequest request) {
        return new SyncInvoker<ListEnvTagsRequest, ListEnvTagsResponse>(request, ApmMeta.listEnvTags, hcClient);
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
     * @return ShowTopologyTreeResponse
     */
    public ShowTopologyTreeResponse showTopologyTree(ShowTopologyTreeRequest request) {
        return hcClient.syncInvokeHttp(request, ApmMeta.showTopologyTree);
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
     * @return SyncInvoker<ShowTopologyTreeRequest, ShowTopologyTreeResponse>
     */
    public SyncInvoker<ShowTopologyTreeRequest, ShowTopologyTreeResponse> showTopologyTreeInvoker(
        ShowTopologyTreeRequest request) {
        return new SyncInvoker<ShowTopologyTreeRequest, ShowTopologyTreeResponse>(request, ApmMeta.showTopologyTree,
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
     * @return ListOpenRegionResponse
     */
    public ListOpenRegionResponse listOpenRegion(ListOpenRegionRequest request) {
        return hcClient.syncInvokeHttp(request, ApmMeta.listOpenRegion);
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
     * @return SyncInvoker<ListOpenRegionRequest, ListOpenRegionResponse>
     */
    public SyncInvoker<ListOpenRegionRequest, ListOpenRegionResponse> listOpenRegionInvoker(
        ListOpenRegionRequest request) {
        return new SyncInvoker<ListOpenRegionRequest, ListOpenRegionResponse>(request, ApmMeta.listOpenRegion,
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListSupportedRegionRequest 请求对象
     * @return SyncInvoker<ListSupportedRegionRequest, ListSupportedRegionResponse>
     */
    public SyncInvoker<ListSupportedRegionRequest, ListSupportedRegionResponse> listSupportedRegionInvoker(
        ListSupportedRegionRequest request) {
        return new SyncInvoker<ListSupportedRegionRequest, ListSupportedRegionResponse>(request,
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
     * @return ListEnvInstancesResponse
     */
    public ListEnvInstancesResponse listEnvInstances(ListEnvInstancesRequest request) {
        return hcClient.syncInvokeHttp(request, ApmMeta.listEnvInstances);
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
     * @return SyncInvoker<ListEnvInstancesRequest, ListEnvInstancesResponse>
     */
    public SyncInvoker<ListEnvInstancesRequest, ListEnvInstancesResponse> listEnvInstancesInvoker(
        ListEnvInstancesRequest request) {
        return new SyncInvoker<ListEnvInstancesRequest, ListEnvInstancesResponse>(request, ApmMeta.listEnvInstances,
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
     * @return ShowClobDetailResponse
     */
    public ShowClobDetailResponse showClobDetail(ShowClobDetailRequest request) {
        return hcClient.syncInvokeHttp(request, ApmMeta.showClobDetail);
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
     * @return SyncInvoker<ShowClobDetailRequest, ShowClobDetailResponse>
     */
    public SyncInvoker<ShowClobDetailRequest, ShowClobDetailResponse> showClobDetailInvoker(
        ShowClobDetailRequest request) {
        return new SyncInvoker<ShowClobDetailRequest, ShowClobDetailResponse>(request, ApmMeta.showClobDetail,
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
     * @return ShowEnvMonitorItemsResponse
     */
    public ShowEnvMonitorItemsResponse showEnvMonitorItems(ShowEnvMonitorItemsRequest request) {
        return hcClient.syncInvokeHttp(request, ApmMeta.showEnvMonitorItems);
    }

    /**
     * 
     *
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowEnvMonitorItemsRequest 请求对象
     * @return SyncInvoker<ShowEnvMonitorItemsRequest, ShowEnvMonitorItemsResponse>
     */
    public SyncInvoker<ShowEnvMonitorItemsRequest, ShowEnvMonitorItemsResponse> showEnvMonitorItemsInvoker(
        ShowEnvMonitorItemsRequest request) {
        return new SyncInvoker<ShowEnvMonitorItemsRequest, ShowEnvMonitorItemsResponse>(request,
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
     * @return ShowEventDetailResponse
     */
    public ShowEventDetailResponse showEventDetail(ShowEventDetailRequest request) {
        return hcClient.syncInvokeHttp(request, ApmMeta.showEventDetail);
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
     * @return SyncInvoker<ShowEventDetailRequest, ShowEventDetailResponse>
     */
    public SyncInvoker<ShowEventDetailRequest, ShowEventDetailResponse> showEventDetailInvoker(
        ShowEventDetailRequest request) {
        return new SyncInvoker<ShowEventDetailRequest, ShowEventDetailResponse>(request, ApmMeta.showEventDetail,
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
     * @return ShowMonitorItemViewConfigResponse
     */
    public ShowMonitorItemViewConfigResponse showMonitorItemViewConfig(ShowMonitorItemViewConfigRequest request) {
        return hcClient.syncInvokeHttp(request, ApmMeta.showMonitorItemViewConfig);
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
     * @return SyncInvoker<ShowMonitorItemViewConfigRequest, ShowMonitorItemViewConfigResponse>
     */
    public SyncInvoker<ShowMonitorItemViewConfigRequest, ShowMonitorItemViewConfigResponse> showMonitorItemViewConfigInvoker(
        ShowMonitorItemViewConfigRequest request) {
        return new SyncInvoker<ShowMonitorItemViewConfigRequest, ShowMonitorItemViewConfigResponse>(request,
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
     * @return ShowRawTableResponse
     */
    public ShowRawTableResponse showRawTable(ShowRawTableRequest request) {
        return hcClient.syncInvokeHttp(request, ApmMeta.showRawTable);
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
     * @return SyncInvoker<ShowRawTableRequest, ShowRawTableResponse>
     */
    public SyncInvoker<ShowRawTableRequest, ShowRawTableResponse> showRawTableInvoker(ShowRawTableRequest request) {
        return new SyncInvoker<ShowRawTableRequest, ShowRawTableResponse>(request, ApmMeta.showRawTable, hcClient);
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
     * @return ShowSpanSearchResponse
     */
    public ShowSpanSearchResponse showSpanSearch(ShowSpanSearchRequest request) {
        return hcClient.syncInvokeHttp(request, ApmMeta.showSpanSearch);
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
     * @return SyncInvoker<ShowSpanSearchRequest, ShowSpanSearchResponse>
     */
    public SyncInvoker<ShowSpanSearchRequest, ShowSpanSearchResponse> showSpanSearchInvoker(
        ShowSpanSearchRequest request) {
        return new SyncInvoker<ShowSpanSearchRequest, ShowSpanSearchResponse>(request, ApmMeta.showSpanSearch,
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
     * @return ShowSumTableResponse
     */
    public ShowSumTableResponse showSumTable(ShowSumTableRequest request) {
        return hcClient.syncInvokeHttp(request, ApmMeta.showSumTable);
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
     * @return SyncInvoker<ShowSumTableRequest, ShowSumTableResponse>
     */
    public SyncInvoker<ShowSumTableRequest, ShowSumTableResponse> showSumTableInvoker(ShowSumTableRequest request) {
        return new SyncInvoker<ShowSumTableRequest, ShowSumTableResponse>(request, ApmMeta.showSumTable, hcClient);
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
     * @return ShowTopologyResponse
     */
    public ShowTopologyResponse showTopology(ShowTopologyRequest request) {
        return hcClient.syncInvokeHttp(request, ApmMeta.showTopology);
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
     * @return SyncInvoker<ShowTopologyRequest, ShowTopologyResponse>
     */
    public SyncInvoker<ShowTopologyRequest, ShowTopologyResponse> showTopologyInvoker(ShowTopologyRequest request) {
        return new SyncInvoker<ShowTopologyRequest, ShowTopologyResponse>(request, ApmMeta.showTopology, hcClient);
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
     * @return ShowTraceEventsResponse
     */
    public ShowTraceEventsResponse showTraceEvents(ShowTraceEventsRequest request) {
        return hcClient.syncInvokeHttp(request, ApmMeta.showTraceEvents);
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
     * @return SyncInvoker<ShowTraceEventsRequest, ShowTraceEventsResponse>
     */
    public SyncInvoker<ShowTraceEventsRequest, ShowTraceEventsResponse> showTraceEventsInvoker(
        ShowTraceEventsRequest request) {
        return new SyncInvoker<ShowTraceEventsRequest, ShowTraceEventsResponse>(request, ApmMeta.showTraceEvents,
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
     * @return ShowTrendResponse
     */
    public ShowTrendResponse showTrend(ShowTrendRequest request) {
        return hcClient.syncInvokeHttp(request, ApmMeta.showTrend);
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
     * @return SyncInvoker<ShowTrendRequest, ShowTrendResponse>
     */
    public SyncInvoker<ShowTrendRequest, ShowTrendResponse> showTrendInvoker(ShowTrendRequest request) {
        return new SyncInvoker<ShowTrendRequest, ShowTrendResponse>(request, ApmMeta.showTrend, hcClient);
    }

}
