package com.huaweicloud.sdk.ces.v2;

import com.huaweicloud.sdk.ces.v2.model.*;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;

import java.util.concurrent.CompletableFuture;

public class CesAsyncClient {

    protected HcClient hcClient;

    public CesAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<CesAsyncClient> newBuilder() {
        return new ClientBuilder<>(CesAsyncClient::new);
    }

    /** 查询告警历史 查询告警历史列表
     *
     * @param ListAlarmHistoriesRequest 请求对象
     * @return CompletableFuture<ListAlarmHistoriesResponse> */
    public CompletableFuture<ListAlarmHistoriesResponse> listAlarmHistoriesAsync(ListAlarmHistoriesRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.listAlarmHistories);
    }

    /** 查询告警历史 查询告警历史列表
     *
     * @param ListAlarmHistoriesRequest 请求对象
     * @return AsyncInvoker<ListAlarmHistoriesRequest, ListAlarmHistoriesResponse> */
    public AsyncInvoker<ListAlarmHistoriesRequest, ListAlarmHistoriesResponse> listAlarmHistoriesAsyncInvoker(
        ListAlarmHistoriesRequest request) {
        return new AsyncInvoker<ListAlarmHistoriesRequest, ListAlarmHistoriesResponse>(request,
            CesMeta.listAlarmHistories, hcClient);
    }

    /** 查询告警列表 查询告警列表,实际上内部对应的是v3的版本号
     *
     * @param ListAlarmsRequest 请求对象
     * @return CompletableFuture<ListAlarmsResponse> */
    public CompletableFuture<ListAlarmsResponse> listAlarmsAsync(ListAlarmsRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.listAlarms);
    }

    /** 查询告警列表 查询告警列表,实际上内部对应的是v3的版本号
     *
     * @param ListAlarmsRequest 请求对象
     * @return AsyncInvoker<ListAlarmsRequest, ListAlarmsResponse> */
    public AsyncInvoker<ListAlarmsRequest, ListAlarmsResponse> listAlarmsAsyncInvoker(ListAlarmsRequest request) {
        return new AsyncInvoker<ListAlarmsRequest, ListAlarmsResponse>(request, CesMeta.listAlarms, hcClient);
    }

}
