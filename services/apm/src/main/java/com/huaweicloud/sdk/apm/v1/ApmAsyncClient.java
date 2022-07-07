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
     * 
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
     * 
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

}
