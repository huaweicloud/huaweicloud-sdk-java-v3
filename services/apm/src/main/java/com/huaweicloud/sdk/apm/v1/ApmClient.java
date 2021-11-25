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

    /** @param ListBusinessRequest 请求对象
     * @return ListBusinessResponse */
    public ListBusinessResponse listBusiness(ListBusinessRequest request) {
        return hcClient.syncInvokeHttp(request, ApmMeta.listBusiness);
    }

    /** @param ListBusinessRequest 请求对象
     * @return SyncInvoker<ListBusinessRequest, ListBusinessResponse> */
    public SyncInvoker<ListBusinessRequest, ListBusinessResponse> listBusinessInvoker(ListBusinessRequest request) {
        return new SyncInvoker<ListBusinessRequest, ListBusinessResponse>(request, ApmMeta.listBusiness, hcClient);
    }

}
