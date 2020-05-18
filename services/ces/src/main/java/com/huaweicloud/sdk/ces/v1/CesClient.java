package com.huaweicloud.sdk.ces.v1;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import java.util.function.Function;

import com.huaweicloud.sdk.ces.v1.model.*;

public class CesClient {
    protected HcClient hcClient;

    public CesClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<CesClient> newBuilder() {
        return new ClientBuilder<>(CesClient::new);
    }

    public BatchListMetricDataResponse batchListMetricData(BatchListMetricDataRequest request) {
        return hcClient.syncInvokeHttp(request, CesMeta.batchListMetricData);
    }

    public CreateAlarmResponse createAlarm(CreateAlarmRequest request) {
        return hcClient.syncInvokeHttp(request, CesMeta.createAlarm);
    }

    public CreateEventsResponse createEvents(CreateEventsRequest request) {
        return hcClient.syncInvokeHttp(request, CesMeta.createEvents);
    }

    public CreateMetricDataResponse createMetricData(CreateMetricDataRequest request) {
        return hcClient.syncInvokeHttp(request, CesMeta.createMetricData);
    }

    public DeleteAlarmResponse deleteAlarm(DeleteAlarmRequest request) {
        return hcClient.syncInvokeHttp(request, CesMeta.deleteAlarm);
    }

    public ListAlarmsResponse listAlarms(ListAlarmsRequest request) {
        return hcClient.syncInvokeHttp(request, CesMeta.listAlarms);
    }

    public ListMetricsResponse listMetrics(ListMetricsRequest request) {
        return hcClient.syncInvokeHttp(request, CesMeta.listMetrics);
    }

    public ShowAlarmResponse showAlarm(ShowAlarmRequest request) {
        return hcClient.syncInvokeHttp(request, CesMeta.showAlarm);
    }

    public ShowEventDataResponse showEventData(ShowEventDataRequest request) {
        return hcClient.syncInvokeHttp(request, CesMeta.showEventData);
    }

    public ShowMetricDataResponse showMetricData(ShowMetricDataRequest request) {
        return hcClient.syncInvokeHttp(request, CesMeta.showMetricData);
    }

    public ShowQuotasResponse showQuotas(ShowQuotasRequest request) {
        return hcClient.syncInvokeHttp(request, CesMeta.showQuotas);
    }

    public UpdateAlarmActionResponse updateAlarmAction(UpdateAlarmActionRequest request) {
        return hcClient.syncInvokeHttp(request, CesMeta.updateAlarmAction);
    }

}