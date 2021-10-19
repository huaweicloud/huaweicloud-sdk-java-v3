package com.huaweicloud.sdk.vss.v3;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.vss.v3.model.*;

public class VssClient {

    protected HcClient hcClient;

    public VssClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<VssClient> newBuilder() {
        return new ClientBuilder<>(VssClient::new);
    }

    /** 创建域名资产 创建租户的域名资产
     *
     * @param CreateDomainsRequest 请求对象
     * @return CreateDomainsResponse */
    public CreateDomainsResponse createDomains(CreateDomainsRequest request) {
        return hcClient.syncInvokeHttp(request, VssMeta.createDomains);
    }

    /** 创建域名资产 创建租户的域名资产
     *
     * @param CreateDomainsRequest 请求对象
     * @return SyncInvoker<CreateDomainsRequest, CreateDomainsResponse> */
    public SyncInvoker<CreateDomainsRequest, CreateDomainsResponse> createDomainsInvoker(CreateDomainsRequest request) {
        return new SyncInvoker<CreateDomainsRequest, CreateDomainsResponse>(request, VssMeta.createDomains, hcClient);
    }

    /** 删除域名资产 删除租户的域名资产
     *
     * @param DeleteDomainsRequest 请求对象
     * @return DeleteDomainsResponse */
    public DeleteDomainsResponse deleteDomains(DeleteDomainsRequest request) {
        return hcClient.syncInvokeHttp(request, VssMeta.deleteDomains);
    }

    /** 删除域名资产 删除租户的域名资产
     *
     * @param DeleteDomainsRequest 请求对象
     * @return SyncInvoker<DeleteDomainsRequest, DeleteDomainsResponse> */
    public SyncInvoker<DeleteDomainsRequest, DeleteDomainsResponse> deleteDomainsInvoker(DeleteDomainsRequest request) {
        return new SyncInvoker<DeleteDomainsRequest, DeleteDomainsResponse>(request, VssMeta.deleteDomains, hcClient);
    }

    /** 获取域名资产 获取租户的所有域名资产
     *
     * @param ListDomainsRequest 请求对象
     * @return ListDomainsResponse */
    public ListDomainsResponse listDomains(ListDomainsRequest request) {
        return hcClient.syncInvokeHttp(request, VssMeta.listDomains);
    }

    /** 获取域名资产 获取租户的所有域名资产
     *
     * @param ListDomainsRequest 请求对象
     * @return SyncInvoker<ListDomainsRequest, ListDomainsResponse> */
    public SyncInvoker<ListDomainsRequest, ListDomainsResponse> listDomainsInvoker(ListDomainsRequest request) {
        return new SyncInvoker<ListDomainsRequest, ListDomainsResponse>(request, VssMeta.listDomains, hcClient);
    }

}
