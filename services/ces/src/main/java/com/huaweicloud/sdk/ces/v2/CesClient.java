package com.huaweicloud.sdk.ces.v2;

import com.huaweicloud.sdk.ces.v2.model.*;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;

public class CesClient {

    protected HcClient hcClient;

    public CesClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<CesClient> newBuilder() {
        return new ClientBuilder<>(CesClient::new);
    }

    /** 查询告警历史 查询告警历史列表
     *
     * @param ListAlarmHistoriesRequest 请求对象
     * @return ListAlarmHistoriesResponse */
    public ListAlarmHistoriesResponse listAlarmHistories(ListAlarmHistoriesRequest request) {
        return hcClient.syncInvokeHttp(request, CesMeta.listAlarmHistories);
    }

    /** 查询告警历史 查询告警历史列表
     *
     * @param ListAlarmHistoriesRequest 请求对象
     * @return SyncInvoker<ListAlarmHistoriesRequest, ListAlarmHistoriesResponse> */
    public SyncInvoker<ListAlarmHistoriesRequest, ListAlarmHistoriesResponse> listAlarmHistoriesInvoker(
        ListAlarmHistoriesRequest request) {
        return new SyncInvoker<ListAlarmHistoriesRequest, ListAlarmHistoriesResponse>(request,
            CesMeta.listAlarmHistories, hcClient);
    }

    /** 查询告警列表 查询告警列表,实际上内部对应的是v3的版本号
     *
     * @param ListAlarmsRequest 请求对象
     * @return ListAlarmsResponse */
    public ListAlarmsResponse listAlarms(ListAlarmsRequest request) {
        return hcClient.syncInvokeHttp(request, CesMeta.listAlarms);
    }

    /** 查询告警列表 查询告警列表,实际上内部对应的是v3的版本号
     *
     * @param ListAlarmsRequest 请求对象
     * @return SyncInvoker<ListAlarmsRequest, ListAlarmsResponse> */
    public SyncInvoker<ListAlarmsRequest, ListAlarmsResponse> listAlarmsInvoker(ListAlarmsRequest request) {
        return new SyncInvoker<ListAlarmsRequest, ListAlarmsResponse>(request, CesMeta.listAlarms, hcClient);
    }

}
