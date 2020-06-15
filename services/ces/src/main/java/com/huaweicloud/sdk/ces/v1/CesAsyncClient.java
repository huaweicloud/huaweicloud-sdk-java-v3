package com.huaweicloud.sdk.ces.v1;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

import com.huaweicloud.sdk.ces.v1.model.*;

public class CesAsyncClient {
    protected HcClient hcClient;

    public CesAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<CesAsyncClient> newBuilder() {
        return new ClientBuilder<>(CesAsyncClient::new);
    }


    public CompletableFuture<BatchListMetricDataResponse> batchListMetricDataAsync(BatchListMetricDataRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.batchListMetricData);
    }

    public CompletableFuture<CreateAlarmResponse> createAlarmAsync(CreateAlarmRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.createAlarm);
    }

    public CompletableFuture<CreateEventsResponse> createEventsAsync(CreateEventsRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.createEvents);
    }

    public CompletableFuture<CreateMetricDataResponse> createMetricDataAsync(CreateMetricDataRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.createMetricData);
    }

    public CompletableFuture<DeleteAlarmResponse> deleteAlarmAsync(DeleteAlarmRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.deleteAlarm);
    }

    public CompletableFuture<ListAlarmsResponse> listAlarmsAsync(ListAlarmsRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.listAlarms);
    }

    public CompletableFuture<ListMetricsResponse> listMetricsAsync(ListMetricsRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.listMetrics);
    }

    public CompletableFuture<ShowAlarmResponse> showAlarmAsync(ShowAlarmRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.showAlarm);
    }

    public CompletableFuture<ShowEventDataResponse> showEventDataAsync(ShowEventDataRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.showEventData);
    }

    public CompletableFuture<ShowMetricDataResponse> showMetricDataAsync(ShowMetricDataRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.showMetricData);
    }

    public CompletableFuture<ShowQuotasResponse> showQuotasAsync(ShowQuotasRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.showQuotas);
    }

    public CompletableFuture<UpdateAlarmActionResponse> updateAlarmActionAsync(UpdateAlarmActionRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.updateAlarmAction);
    }

}