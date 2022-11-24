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
     * 创建aksk。
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
     * 创建aksk。
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
     * 删除aksk。
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
     * 删除aksk。
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
     * 查询租户的aksk。
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
     * 查询租户的aksk。
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
     * 查询告警列表
     *
     * 查询系统中存在的告警。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListAlarmDataRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListAlarmDataRequest 请求对象
     * @return SyncInvoker<ListAlarmDataRequest, ListAlarmDataResponse>
     */
    public SyncInvoker<ListAlarmDataRequest, ListAlarmDataResponse> listAlarmDataInvoker(ListAlarmDataRequest request) {
        return new SyncInvoker<ListAlarmDataRequest, ListAlarmDataResponse>(request, ApmMeta.listAlarmData, hcClient);
    }

    /**
     * 查询告警消息列表
     *
     * 查询单个告警的触发详情与历史。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListAlarmNotifyRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListAlarmNotifyRequest 请求对象
     * @return SyncInvoker<ListAlarmNotifyRequest, ListAlarmNotifyResponse>
     */
    public SyncInvoker<ListAlarmNotifyRequest, ListAlarmNotifyResponse> listAlarmNotifyInvoker(
        ListAlarmNotifyRequest request) {
        return new SyncInvoker<ListAlarmNotifyRequest, ListAlarmNotifyResponse>(request, ApmMeta.listAlarmNotify,
            hcClient);
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
     * 查询应用列表
     *
     * 该接口用于查询对应用户下的应用。
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
     * 查询应用列表
     *
     * 该接口用于查询对应用户下的应用。
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
     * 查询监控项列表。
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
     * 查询监控项列表。
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
     * 保存监控项。
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
     * 保存监控项。
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
     * 对指定区域下的组件和环境及其探针情况进行搜索
     *
     * 对指定区域下的组件和环境及其探针情况进行搜索。
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
     * 对指定区域下的组件和环境及其探针情况进行搜索
     *
     * 对指定区域下的组件和环境及其探针情况进行搜索。
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
     * 根据region名称获取该region下的master服务podlb地址信息。
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
     * 根据region名称获取该region下的master服务podlb地址信息。
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
     * 该接口用于删除指定的组件。
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
     * 该接口用于删除指定的组件。
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
     * 获取组件下的环境列表
     *
     * 获取组件下的环境列表。
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
     * 获取组件下的环境列表。
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
     * 获取组件列表。
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
     * 获取组件列表。
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
     * 查询环境标签接口。
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
     * 查询环境标签接口。
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
     * 查询单个应用的详情
     *
     * 查询单个应用的详情。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowBusinessDetailRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowBusinessDetailRequest 请求对象
     * @return SyncInvoker<ShowBusinessDetailRequest, ShowBusinessDetailResponse>
     */
    public SyncInvoker<ShowBusinessDetailRequest, ShowBusinessDetailResponse> showBusinessDetailInvoker(
        ShowBusinessDetailRequest request) {
        return new SyncInvoker<ShowBusinessDetailRequest, ShowBusinessDetailResponse>(request,
            ApmMeta.showBusinessDetail, hcClient);
    }

    /**
     * 查询子应用详情
     *
     * 查询单个子应用详情。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowSubBusinessDetailRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowSubBusinessDetailRequest 请求对象
     * @return SyncInvoker<ShowSubBusinessDetailRequest, ShowSubBusinessDetailResponse>
     */
    public SyncInvoker<ShowSubBusinessDetailRequest, ShowSubBusinessDetailResponse> showSubBusinessDetailInvoker(
        ShowSubBusinessDetailRequest request) {
        return new SyncInvoker<ShowSubBusinessDetailRequest, ShowSubBusinessDetailResponse>(request,
            ApmMeta.showSubBusinessDetail, hcClient);
    }

    /**
     * 获取应用树
     *
     * 获取应用树。
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
     * 获取应用树
     *
     * 获取应用树。
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
     * 该接口用于查询用户开通的region信息。
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
     * 该接口用于查询用户开通的region信息。
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
     * 查询应用全局拓扑图
     *
     * 查询应用级别全局拓扑图信息。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param SearchBusinessTopologyRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param SearchBusinessTopologyRequest 请求对象
     * @return SyncInvoker<SearchBusinessTopologyRequest, SearchBusinessTopologyResponse>
     */
    public SyncInvoker<SearchBusinessTopologyRequest, SearchBusinessTopologyResponse> searchBusinessTopologyInvoker(
        SearchBusinessTopologyRequest request) {
        return new SyncInvoker<SearchBusinessTopologyRequest, SearchBusinessTopologyResponse>(request,
            ApmMeta.searchBusinessTopology, hcClient);
    }

    /**
     * 查询组件环境拓扑图
     *
     * 查询组件环境级别全局拓扑图信息。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param SearchEnvTopologyRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param SearchEnvTopologyRequest 请求对象
     * @return SyncInvoker<SearchEnvTopologyRequest, SearchEnvTopologyResponse>
     */
    public SyncInvoker<SearchEnvTopologyRequest, SearchEnvTopologyResponse> searchEnvTopologyInvoker(
        SearchEnvTopologyRequest request) {
        return new SyncInvoker<SearchEnvTopologyRequest, SearchEnvTopologyResponse>(request, ApmMeta.searchEnvTopology,
            hcClient);
    }

    /**
     * 查询URL跟踪Region环境列表
     *
     * 查询所选Region下设置了URL跟踪的环境列表。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListBusinessEnvRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListBusinessEnvRequest 请求对象
     * @return SyncInvoker<ListBusinessEnvRequest, ListBusinessEnvResponse>
     */
    public SyncInvoker<ListBusinessEnvRequest, ListBusinessEnvResponse> listBusinessEnvInvoker(
        ListBusinessEnvRequest request) {
        return new SyncInvoker<ListBusinessEnvRequest, ListBusinessEnvResponse>(request, ApmMeta.listBusinessEnv,
            hcClient);
    }

    /**
     * 查询URL跟踪视图列表
     *
     * 查询当前被调用的URL跟踪视图列表。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param SearchTransactionRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param SearchTransactionRequest 请求对象
     * @return SyncInvoker<SearchTransactionRequest, SearchTransactionResponse>
     */
    public SyncInvoker<SearchTransactionRequest, SearchTransactionResponse> searchTransactionInvoker(
        SearchTransactionRequest request) {
        return new SyncInvoker<SearchTransactionRequest, SearchTransactionResponse>(request, ApmMeta.searchTransaction,
            hcClient);
    }

    /**
     * 查询URL跟踪配置列表
     *
     * 查询已配置好的URL跟踪配置列表。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param SearchTransactionConfigRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param SearchTransactionConfigRequest 请求对象
     * @return SyncInvoker<SearchTransactionConfigRequest, SearchTransactionConfigResponse>
     */
    public SyncInvoker<SearchTransactionConfigRequest, SearchTransactionConfigResponse> searchTransactionConfigInvoker(
        SearchTransactionConfigRequest request) {
        return new SyncInvoker<SearchTransactionConfigRequest, SearchTransactionConfigResponse>(request,
            ApmMeta.searchTransactionConfig, hcClient);
    }

    /**
     * 查询URL跟踪视图详情
     *
     * 查询某条URL跟踪视图详情。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowTransactionDetailRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowTransactionDetailRequest 请求对象
     * @return SyncInvoker<ShowTransactionDetailRequest, ShowTransactionDetailResponse>
     */
    public SyncInvoker<ShowTransactionDetailRequest, ShowTransactionDetailResponse> showTransactionDetailInvoker(
        ShowTransactionDetailRequest request) {
        return new SyncInvoker<ShowTransactionDetailRequest, ShowTransactionDetailResponse>(request,
            ApmMeta.showTransactionDetail, hcClient);
    }

    /**
     * 获取实例信息列表
     *
     * 获取实例信息列表。
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
     * 获取实例信息列表。
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
     * 获取原始数据详情。
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
     * 获取原始数据详情。
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
     * 获取监控项信息
     *
     * 获取监控项信息。
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
     * 获取监控项信息
     *
     * 获取监控项信息。
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
     * 获取event的详情。
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
     * 获取event的详情。
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
     * 查询监控项配置信息。
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
     * 查询监控项配置信息。
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
     * 获取原始数据表格。
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
     * 获取原始数据表格。
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
     * span数据查询接口。
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
     * span数据查询接口。
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
     * 获取汇总表格数据。
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
     * 获取汇总表格数据。
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
     * 调用链拓扑图。
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
     * 调用链拓扑图。
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
     * 获取一个trace的所有调用链数据。
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
     * 获取一个trace的所有调用链数据。
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
     * 获取趋势图。
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
     * 获取趋势图。
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
