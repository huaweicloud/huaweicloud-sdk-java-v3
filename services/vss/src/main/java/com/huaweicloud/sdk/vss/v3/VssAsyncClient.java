package com.huaweicloud.sdk.vss.v3;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.vss.v3.model.*;

import java.util.concurrent.CompletableFuture;

public class VssAsyncClient {

    protected HcClient hcClient;

    public VssAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<VssAsyncClient> newBuilder() {
        return new ClientBuilder<>(VssAsyncClient::new);
    }

    /** 创建域名资产 创建租户的域名资产
     *
     * @param CreateDomainsRequest 请求对象
     * @return CompletableFuture<CreateDomainsResponse> */
    public CompletableFuture<CreateDomainsResponse> createDomainsAsync(CreateDomainsRequest request) {
        return hcClient.asyncInvokeHttp(request, VssMeta.createDomains);
    }

    /** 创建域名资产 创建租户的域名资产
     *
     * @param CreateDomainsRequest 请求对象
     * @return AsyncInvoker<CreateDomainsRequest, CreateDomainsResponse> */
    public AsyncInvoker<CreateDomainsRequest, CreateDomainsResponse> createDomainsAsyncInvoker(
        CreateDomainsRequest request) {
        return new AsyncInvoker<CreateDomainsRequest, CreateDomainsResponse>(request, VssMeta.createDomains, hcClient);
    }

    /** 删除域名资产 删除租户的域名资产
     *
     * @param DeleteDomainsRequest 请求对象
     * @return CompletableFuture<DeleteDomainsResponse> */
    public CompletableFuture<DeleteDomainsResponse> deleteDomainsAsync(DeleteDomainsRequest request) {
        return hcClient.asyncInvokeHttp(request, VssMeta.deleteDomains);
    }

    /** 删除域名资产 删除租户的域名资产
     *
     * @param DeleteDomainsRequest 请求对象
     * @return AsyncInvoker<DeleteDomainsRequest, DeleteDomainsResponse> */
    public AsyncInvoker<DeleteDomainsRequest, DeleteDomainsResponse> deleteDomainsAsyncInvoker(
        DeleteDomainsRequest request) {
        return new AsyncInvoker<DeleteDomainsRequest, DeleteDomainsResponse>(request, VssMeta.deleteDomains, hcClient);
    }

    /** 获取域名资产 获取租户的所有域名资产
     *
     * @param ListDomainsRequest 请求对象
     * @return CompletableFuture<ListDomainsResponse> */
    public CompletableFuture<ListDomainsResponse> listDomainsAsync(ListDomainsRequest request) {
        return hcClient.asyncInvokeHttp(request, VssMeta.listDomains);
    }

    /** 获取域名资产 获取租户的所有域名资产
     *
     * @param ListDomainsRequest 请求对象
     * @return AsyncInvoker<ListDomainsRequest, ListDomainsResponse> */
    public AsyncInvoker<ListDomainsRequest, ListDomainsResponse> listDomainsAsyncInvoker(ListDomainsRequest request) {
        return new AsyncInvoker<ListDomainsRequest, ListDomainsResponse>(request, VssMeta.listDomains, hcClient);
    }

}
