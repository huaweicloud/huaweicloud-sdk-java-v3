package com.huaweicloud.sdk.hss.v1;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.hss.v1.model.*;

public class HssClient {
    protected HcClient hcClient;

    public HssClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<HssClient> newBuilder() {
        return new ClientBuilder<>(HssClient::new);
    }


    /**
     * 查询弹性云服务器状态列表
     * 查询弹性云服务器状态列表
     *
     * @param ListHostsRequest 请求对象
     * @return ListHostsResponse
     */
    public ListHostsResponse listHosts(ListHostsRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listHosts);
    }

    /**
     * 查询弹性云服务器状态列表
     * 查询弹性云服务器状态列表
     *
     * @param ListHostsRequest 请求对象
     * @return SyncInvoker<ListHostsRequest, ListHostsResponse>
     */
    public SyncInvoker<ListHostsRequest, ListHostsResponse> listHostsInvoker(ListHostsRequest request) {
        return new SyncInvoker<ListHostsRequest, ListHostsResponse>(request, HssMeta.listHosts, hcClient);
    }

}