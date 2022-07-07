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
     * 
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
     * 
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

}
