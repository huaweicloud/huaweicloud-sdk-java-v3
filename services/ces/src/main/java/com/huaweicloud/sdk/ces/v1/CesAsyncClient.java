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


    /**
     * 批量查询监控数据
     * 批量查询指定时间范围内指定指标的指定粒度的监控数据，目前最多支持10指标的批量查询。
     *
     * @param BatchListMetricDataRequest 请求对象
     * @return CompletableFuture<BatchListMetricDataResponse>
     */
    public CompletableFuture<BatchListMetricDataResponse> batchListMetricDataAsync(BatchListMetricDataRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.batchListMetricData);
    }

    /**
     * 创建告警规则
     * 创建一条告警规则。
     *
     * @param CreateAlarmRequest 请求对象
     * @return CompletableFuture<CreateAlarmResponse>
     */
    public CompletableFuture<CreateAlarmResponse> createAlarmAsync(CreateAlarmRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.createAlarm);
    }

    /**
     * 上报事件
     * 上报自定义事件。
     *
     * @param CreateEventsRequest 请求对象
     * @return CompletableFuture<CreateEventsResponse>
     */
    public CompletableFuture<CreateEventsResponse> createEventsAsync(CreateEventsRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.createEvents);
    }

    /**
     * 添加监控数据
     * 添加一条或多条指标监控数据。
     *
     * @param CreateMetricDataRequest 请求对象
     * @return CompletableFuture<CreateMetricDataResponse>
     */
    public CompletableFuture<CreateMetricDataResponse> createMetricDataAsync(CreateMetricDataRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.createMetricData);
    }

    /**
     * 删除告警规则
     * 删除一条告警规则。
     *
     * @param DeleteAlarmRequest 请求对象
     * @return CompletableFuture<DeleteAlarmResponse>
     */
    public CompletableFuture<DeleteAlarmResponse> deleteAlarmAsync(DeleteAlarmRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.deleteAlarm);
    }

    /**
     * 查询告警规则列表
     * 查询告警规则列表，可以指定分页条件限制结果数量，可以指定排序规则。
     *
     * @param ListAlarmsRequest 请求对象
     * @return CompletableFuture<ListAlarmsResponse>
     */
    public CompletableFuture<ListAlarmsResponse> listAlarmsAsync(ListAlarmsRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.listAlarms);
    }

    /**
     * 查询指标列表
     * 查询系统当前可监控指标列表，可以指定指标命名空间、指标名称、维度、排序方式，起始记录和最大记录条数过滤查询结果。
     *
     * @param ListMetricsRequest 请求对象
     * @return CompletableFuture<ListMetricsResponse>
     */
    public CompletableFuture<ListMetricsResponse> listMetricsAsync(ListMetricsRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.listMetrics);
    }

    /**
     * 查询单条告警规则信息
     * 根据告警ID查询告警规则信息。
     *
     * @param ShowAlarmRequest 请求对象
     * @return CompletableFuture<ShowAlarmResponse>
     */
    public CompletableFuture<ShowAlarmResponse> showAlarmAsync(ShowAlarmRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.showAlarm);
    }

    /**
     * 查询主机配置数据
     * 查询指定时间范围指定事件类型的主机配置数据，可以通过参数指定需要查询的数据维度。注意：该接口提供给HANA场景下SAP Monitor查询主机配置数据，其他场景下查不到主机配置数据。
     *
     * @param ShowEventDataRequest 请求对象
     * @return CompletableFuture<ShowEventDataResponse>
     */
    public CompletableFuture<ShowEventDataResponse> showEventDataAsync(ShowEventDataRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.showEventData);
    }

    /**
     * 查询监控数据
     * 查询指定时间范围指定指标的指定粒度的监控数据，可以通过参数指定需要查询的数据维度。
     *
     * @param ShowMetricDataRequest 请求对象
     * @return CompletableFuture<ShowMetricDataResponse>
     */
    public CompletableFuture<ShowMetricDataResponse> showMetricDataAsync(ShowMetricDataRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.showMetricData);
    }

    /**
     * 查询配额
     * 查询用户可以创建的资源配额总数及当前使用量，当前仅有告警规则一种资源类型。
     *
     * @param ShowQuotasRequest 请求对象
     * @return CompletableFuture<ShowQuotasResponse>
     */
    public CompletableFuture<ShowQuotasResponse> showQuotasAsync(ShowQuotasRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.showQuotas);
    }

    /**
     * 启停告警规则
     * 启动或停止一条告警规则。
     *
     * @param UpdateAlarmActionRequest 请求对象
     * @return CompletableFuture<UpdateAlarmActionResponse>
     */
    public CompletableFuture<UpdateAlarmActionResponse> updateAlarmActionAsync(UpdateAlarmActionRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.updateAlarmAction);
    }

}