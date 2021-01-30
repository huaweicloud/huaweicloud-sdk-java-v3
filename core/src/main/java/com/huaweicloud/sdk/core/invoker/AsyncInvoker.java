package com.huaweicloud.sdk.core.invoker;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.http.HttpRequestDef;

import java.util.concurrent.CompletableFuture;

public class AsyncInvoker<ReqT, ResT> extends BaseInvoker<ReqT, ResT, AsyncInvoker<ReqT, ResT>> {

    public AsyncInvoker(ReqT req, HttpRequestDef<ReqT, ResT> meta, HcClient hcClient) {
        super(req, meta, hcClient);
    }

    public CompletableFuture<ResT> invoke() {
        return this.hcClient.preInvoke(extraHeader).asyncInvokeHttp(req, meta, exchange);
    }

}
