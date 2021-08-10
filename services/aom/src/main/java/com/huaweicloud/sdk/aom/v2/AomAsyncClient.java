package com.huaweicloud.sdk.aom.v2;

import com.huaweicloud.sdk.aom.v2.model.*;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;

import java.util.concurrent.CompletableFuture;

public class AomAsyncClient {

    protected HcClient hcClient;

    public AomAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<AomAsyncClient> newBuilder() {
        return new ClientBuilder<>(AomAsyncClient::new);
    }

    /** 查询时序数据 该接口用于查询指定时间范围内的监控时序数据，可以通过参数指定需要查询的数据维度，数据周期等。
     *
     * @param ListSampleRequest 请求对象
     * @return CompletableFuture<ListSampleResponse> */
    public CompletableFuture<ListSampleResponse> listSampleAsync(ListSampleRequest request) {
        return hcClient.asyncInvokeHttp(request, AomMeta.listSample);
    }

    /** 查询时序数据 该接口用于查询指定时间范围内的监控时序数据，可以通过参数指定需要查询的数据维度，数据周期等。
     *
     * @param ListSampleRequest 请求对象
     * @return AsyncInvoker<ListSampleRequest, ListSampleResponse> */
    public AsyncInvoker<ListSampleRequest, ListSampleResponse> listSampleAsyncInvoker(ListSampleRequest request) {
        return new AsyncInvoker<ListSampleRequest, ListSampleResponse>(request, AomMeta.listSample, hcClient);
    }

    /** 查询时间序列 该接口用于查询系统当前可监控的时间序列列表，可以指定时间序列命名空间、名称、维度、所属资源的编号（格式为：resType_resId），分页查询的起始位置和返回的最大记录条数。
     *
     * @param ListSeriesRequest 请求对象
     * @return CompletableFuture<ListSeriesResponse> */
    public CompletableFuture<ListSeriesResponse> listSeriesAsync(ListSeriesRequest request) {
        return hcClient.asyncInvokeHttp(request, AomMeta.listSeries);
    }

    /** 查询时间序列 该接口用于查询系统当前可监控的时间序列列表，可以指定时间序列命名空间、名称、维度、所属资源的编号（格式为：resType_resId），分页查询的起始位置和返回的最大记录条数。
     *
     * @param ListSeriesRequest 请求对象
     * @return AsyncInvoker<ListSeriesRequest, ListSeriesResponse> */
    public AsyncInvoker<ListSeriesRequest, ListSeriesResponse> listSeriesAsyncInvoker(ListSeriesRequest request) {
        return new AsyncInvoker<ListSeriesRequest, ListSeriesResponse>(request, AomMeta.listSeries, hcClient);
    }

}
