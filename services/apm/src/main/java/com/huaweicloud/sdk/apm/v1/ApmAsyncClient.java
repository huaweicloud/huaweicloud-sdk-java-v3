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

    /** 获取ak-sk 获取该用户创建的aksk列表
     *
     * @param ListAkSkRequest 请求对象
     * @return CompletableFuture<ListAkSkResponse> */
    public CompletableFuture<ListAkSkResponse> listAkSkAsync(ListAkSkRequest request) {
        return hcClient.asyncInvokeHttp(request, ApmMeta.listAkSk);
    }

    /** 获取ak-sk 获取该用户创建的aksk列表
     *
     * @param ListAkSkRequest 请求对象
     * @return AsyncInvoker<ListAkSkRequest, ListAkSkResponse> */
    public AsyncInvoker<ListAkSkRequest, ListAkSkResponse> listAkSkAsyncInvoker(ListAkSkRequest request) {
        return new AsyncInvoker<ListAkSkRequest, ListAkSkResponse>(request, ApmMeta.listAkSk, hcClient);
    }

    /** 查询业务列表 该接口用于查询对应用户下的业务。
     *
     * @param ListBusinessRequest 请求对象
     * @return CompletableFuture<ListBusinessResponse> */
    public CompletableFuture<ListBusinessResponse> listBusinessAsync(ListBusinessRequest request) {
        return hcClient.asyncInvokeHttp(request, ApmMeta.listBusiness);
    }

    /** 查询业务列表 该接口用于查询对应用户下的业务。
     *
     * @param ListBusinessRequest 请求对象
     * @return AsyncInvoker<ListBusinessRequest, ListBusinessResponse> */
    public AsyncInvoker<ListBusinessRequest, ListBusinessResponse> listBusinessAsyncInvoker(
        ListBusinessRequest request) {
        return new AsyncInvoker<ListBusinessRequest, ListBusinessResponse>(request, ApmMeta.listBusiness, hcClient);
    }

    /** 查询master地址 根据region名称获取该名称下的master服务podlb地址信息
     *
     * @param ShowMasterAddressRequest 请求对象
     * @return CompletableFuture<ShowMasterAddressResponse> */
    public CompletableFuture<ShowMasterAddressResponse> showMasterAddressAsync(ShowMasterAddressRequest request) {
        return hcClient.asyncInvokeHttp(request, ApmMeta.showMasterAddress);
    }

    /** 查询master地址 根据region名称获取该名称下的master服务podlb地址信息
     *
     * @param ShowMasterAddressRequest 请求对象
     * @return AsyncInvoker<ShowMasterAddressRequest, ShowMasterAddressResponse> */
    public AsyncInvoker<ShowMasterAddressRequest, ShowMasterAddressResponse> showMasterAddressAsyncInvoker(
        ShowMasterAddressRequest request) {
        return new AsyncInvoker<ShowMasterAddressRequest, ShowMasterAddressResponse>(request, ApmMeta.showMasterAddress,
            hcClient);
    }

}
