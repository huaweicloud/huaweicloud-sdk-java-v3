package com.huaweicloud.sdk.aom.v2;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

import com.huaweicloud.sdk.aom.v2.model.*;

public class AomAsyncClient {
    protected HcClient hcClient;

    public AomAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<AomAsyncClient> newBuilder() {
        return new ClientBuilder<>(AomAsyncClient::new);
    }


    /**
     * 查询时序数据
     * 该接口用于查询指定时间范围内的监控时序数据，可以通过参数指定需要查询的数据维度，数据周期等。
     *
     * @param ListSampleRequest 请求对象
     * @return CompletableFuture<ListSampleResponse>
     */
    public CompletableFuture<ListSampleResponse> listSampleAsync(ListSampleRequest request) {
        return hcClient.asyncInvokeHttp(request, AomMeta.listSample);
    }

}