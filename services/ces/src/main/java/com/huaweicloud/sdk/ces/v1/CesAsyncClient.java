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
     * 创建自定义告警模板
     * 创建自定义告警模板。
     *
     * @param CreateAlarmTemplateRequest 请求对象
     * @return CompletableFuture<CreateAlarmTemplateResponse>
     */
    public CompletableFuture<CreateAlarmTemplateResponse> createAlarmTemplateAsync(CreateAlarmTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.createAlarmTemplate);
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
     * 创建资源分组
     * 创建资源分组，资源分组支持将各类资源按照业务集中进行分组管理，可以从分组角度查看监控与告警信息，以提升运维效率。
     *
     * @param CreateResourceGroupRequest 请求对象
     * @return CompletableFuture<CreateResourceGroupResponse>
     */
    public CompletableFuture<CreateResourceGroupResponse> createResourceGroupAsync(CreateResourceGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.createResourceGroup);
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
     * 删除自定义告警模板
     * 根据ID删除自定义告警模板。
     *
     * @param DeleteAlarmTemplateRequest 请求对象
     * @return CompletableFuture<DeleteAlarmTemplateResponse>
     */
    public CompletableFuture<DeleteAlarmTemplateResponse> deleteAlarmTemplateAsync(DeleteAlarmTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.deleteAlarmTemplate);
    }

    /**
     * 删除资源分组
     * 删除一条资源分组。
     *
     * @param DeleteResourceGroupRequest 请求对象
     * @return CompletableFuture<DeleteResourceGroupResponse>
     */
    public CompletableFuture<DeleteResourceGroupResponse> deleteResourceGroupAsync(DeleteResourceGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.deleteResourceGroup);
    }

    /**
     * 查询告警历史
     * 查询告警历史列表。
     *
     * @param ListAlarmHistoriesRequest 请求对象
     * @return CompletableFuture<ListAlarmHistoriesResponse>
     */
    public CompletableFuture<ListAlarmHistoriesResponse> listAlarmHistoriesAsync(ListAlarmHistoriesRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.listAlarmHistories);
    }

    /**
     * 查询自定义告警模板列表
     * 查询自定义告警模板列表
     *
     * @param ListAlarmTemplatesRequest 请求对象
     * @return CompletableFuture<ListAlarmTemplatesResponse>
     */
    public CompletableFuture<ListAlarmTemplatesResponse> listAlarmTemplatesAsync(ListAlarmTemplatesRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.listAlarmTemplates);
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
     * 查询某一事件监控详情
     * 根据事件监控名称，查询该事件发生的详细信息。
     *
     * @param ListEventDetailRequest 请求对象
     * @return CompletableFuture<ListEventDetailResponse>
     */
    public CompletableFuture<ListEventDetailResponse> listEventDetailAsync(ListEventDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.listEventDetail);
    }

    /**
     * 查询事件监控列表
     * 查询事件监控列表，包括系统事件和自定义事件。
     *
     * @param ListEventsRequest 请求对象
     * @return CompletableFuture<ListEventsResponse>
     */
    public CompletableFuture<ListEventsResponse> listEventsAsync(ListEventsRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.listEvents);
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
     * 查询所有资源分组
     * 查询所创建的所有资源分组。
     *
     * @param ListResourceGroupRequest 请求对象
     * @return CompletableFuture<ListResourceGroupResponse>
     */
    public CompletableFuture<ListResourceGroupResponse> listResourceGroupAsync(ListResourceGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.listResourceGroup);
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
     * 查询资源分组下的资源
     * 根据资源分组ID查询资源分组下的资源。
     *
     * @param ShowResourceGroupRequest 请求对象
     * @return CompletableFuture<ShowResourceGroupResponse>
     */
    public CompletableFuture<ShowResourceGroupResponse> showResourceGroupAsync(ShowResourceGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.showResourceGroup);
    }

    /**
     * 修改告警规则
     * 修改告警规则。
     *
     * @param UpdateAlarmRequest 请求对象
     * @return CompletableFuture<UpdateAlarmResponse>
     */
    public CompletableFuture<UpdateAlarmResponse> updateAlarmAsync(UpdateAlarmRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.updateAlarm);
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

    /**
     * 更新自定义告警模板
     * 更新自定义告警模板。
     *
     * @param UpdateAlarmTemplateRequest 请求对象
     * @return CompletableFuture<UpdateAlarmTemplateResponse>
     */
    public CompletableFuture<UpdateAlarmTemplateResponse> updateAlarmTemplateAsync(UpdateAlarmTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.updateAlarmTemplate);
    }

    /**
     * 更新资源分组
     * 更新资源分组，资源分组支持将各类资源按照业务集中进行分组管理，可以从分组角度查看监控与告警信息，以提升运维效率。
     *
     * @param UpdateResourceGroupRequest 请求对象
     * @return CompletableFuture<UpdateResourceGroupResponse>
     */
    public CompletableFuture<UpdateResourceGroupResponse> updateResourceGroupAsync(UpdateResourceGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.updateResourceGroup);
    }

}