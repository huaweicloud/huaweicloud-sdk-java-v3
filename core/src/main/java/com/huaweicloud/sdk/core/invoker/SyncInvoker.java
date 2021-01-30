package com.huaweicloud.sdk.core.invoker;


import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.http.HttpRequestDef;

public class SyncInvoker<ReqT, ResT> extends BaseInvoker<ReqT, ResT, SyncInvoker<ReqT, ResT>> {

    public SyncInvoker(ReqT req, HttpRequestDef<ReqT, ResT> meta, HcClient hcClient) {
        super(req, meta, hcClient);
    }

    public ResT invoke() {
        return hcClient.preInvoke(extraHeader).syncInvokeHttp(req, meta, exchange);
    }

}
