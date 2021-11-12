package com.huaweicloud.sdk.cbh.v1;

import com.huaweicloud.sdk.cbh.v1.model.*;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;

public class CbhClient {

    protected HcClient hcClient;

    public CbhClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<CbhClient> newBuilder() {
        return new ClientBuilder<>(CbhClient::new);
    }

    /** 获取CBH实例列表 获取CBH实例列表
     *
     * @param ListCbhInstanceRequest 请求对象
     * @return ListCbhInstanceResponse */
    public ListCbhInstanceResponse listCbhInstance(ListCbhInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, CbhMeta.listCbhInstance);
    }

    /** 获取CBH实例列表 获取CBH实例列表
     *
     * @param ListCbhInstanceRequest 请求对象
     * @return SyncInvoker<ListCbhInstanceRequest, ListCbhInstanceResponse> */
    public SyncInvoker<ListCbhInstanceRequest, ListCbhInstanceResponse> listCbhInstanceInvoker(
        ListCbhInstanceRequest request) {
        return new SyncInvoker<ListCbhInstanceRequest, ListCbhInstanceResponse>(request, CbhMeta.listCbhInstance,
            hcClient);
    }

}
