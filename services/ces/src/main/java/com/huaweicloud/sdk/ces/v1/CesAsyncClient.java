package com.huaweicloud.sdk.ces.v1;

import com.huaweicloud.sdk.ces.v1.model.*;
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

    /**
     * 批量查询监控数据
     *
     * 批量查询指定时间范围内指定指标的指定粒度的监控数据，目前最多支持500指标的批量查询。 对于不同的period取值和查询的指标数量，默认的最大查询区间(to-from)不同。 规则为\&quot;指标数量*(to-from)/监控周期&lt;&#x3D;3000\&quot;，若超出阈值，会自动调整from以满足规则。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param BatchListMetricDataRequest 请求对象
     * @return CompletableFuture<BatchListMetricDataResponse>
     */
    public CompletableFuture<BatchListMetricDataResponse> batchListMetricDataAsync(BatchListMetricDataRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.batchListMetricData);
    }

    /**
     * 批量查询监控数据
     *
     * 批量查询指定时间范围内指定指标的指定粒度的监控数据，目前最多支持500指标的批量查询。 对于不同的period取值和查询的指标数量，默认的最大查询区间(to-from)不同。 规则为\&quot;指标数量*(to-from)/监控周期&lt;&#x3D;3000\&quot;，若超出阈值，会自动调整from以满足规则。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param BatchListMetricDataRequest 请求对象
     * @return AsyncInvoker<BatchListMetricDataRequest, BatchListMetricDataResponse>
     */
    public AsyncInvoker<BatchListMetricDataRequest, BatchListMetricDataResponse> batchListMetricDataAsyncInvoker(
        BatchListMetricDataRequest request) {
        return new AsyncInvoker<BatchListMetricDataRequest, BatchListMetricDataResponse>(request,
            CesMeta.batchListMetricData, hcClient);
    }

    /**
     * 创建告警规则
     *
     * 创建一条告警规则。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateAlarmRequest 请求对象
     * @return CompletableFuture<CreateAlarmResponse>
     */
    public CompletableFuture<CreateAlarmResponse> createAlarmAsync(CreateAlarmRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.createAlarm);
    }

    /**
     * 创建告警规则
     *
     * 创建一条告警规则。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateAlarmRequest 请求对象
     * @return AsyncInvoker<CreateAlarmRequest, CreateAlarmResponse>
     */
    public AsyncInvoker<CreateAlarmRequest, CreateAlarmResponse> createAlarmAsyncInvoker(CreateAlarmRequest request) {
        return new AsyncInvoker<CreateAlarmRequest, CreateAlarmResponse>(request, CesMeta.createAlarm, hcClient);
    }

    /**
     * 创建自定义告警模板
     *
     * 创建自定义告警模板。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateAlarmTemplateRequest 请求对象
     * @return CompletableFuture<CreateAlarmTemplateResponse>
     */
    public CompletableFuture<CreateAlarmTemplateResponse> createAlarmTemplateAsync(CreateAlarmTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.createAlarmTemplate);
    }

    /**
     * 创建自定义告警模板
     *
     * 创建自定义告警模板。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateAlarmTemplateRequest 请求对象
     * @return AsyncInvoker<CreateAlarmTemplateRequest, CreateAlarmTemplateResponse>
     */
    public AsyncInvoker<CreateAlarmTemplateRequest, CreateAlarmTemplateResponse> createAlarmTemplateAsyncInvoker(
        CreateAlarmTemplateRequest request) {
        return new AsyncInvoker<CreateAlarmTemplateRequest, CreateAlarmTemplateResponse>(request,
            CesMeta.createAlarmTemplate, hcClient);
    }

    /**
     * 上报事件
     *
     * 上报自定义事件。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateEventsRequest 请求对象
     * @return CompletableFuture<CreateEventsResponse>
     */
    public CompletableFuture<CreateEventsResponse> createEventsAsync(CreateEventsRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.createEvents);
    }

    /**
     * 上报事件
     *
     * 上报自定义事件。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateEventsRequest 请求对象
     * @return AsyncInvoker<CreateEventsRequest, CreateEventsResponse>
     */
    public AsyncInvoker<CreateEventsRequest, CreateEventsResponse> createEventsAsyncInvoker(
        CreateEventsRequest request) {
        return new AsyncInvoker<CreateEventsRequest, CreateEventsResponse>(request, CesMeta.createEvents, hcClient);
    }

    /**
     * 添加监控数据
     *
     * 添加一条或多条指标监控数据。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateMetricDataRequest 请求对象
     * @return CompletableFuture<CreateMetricDataResponse>
     */
    public CompletableFuture<CreateMetricDataResponse> createMetricDataAsync(CreateMetricDataRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.createMetricData);
    }

    /**
     * 添加监控数据
     *
     * 添加一条或多条指标监控数据。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateMetricDataRequest 请求对象
     * @return AsyncInvoker<CreateMetricDataRequest, CreateMetricDataResponse>
     */
    public AsyncInvoker<CreateMetricDataRequest, CreateMetricDataResponse> createMetricDataAsyncInvoker(
        CreateMetricDataRequest request) {
        return new AsyncInvoker<CreateMetricDataRequest, CreateMetricDataResponse>(request, CesMeta.createMetricData,
            hcClient);
    }

    /**
     * 创建资源分组
     *
     * 创建资源分组，资源分组支持将各类资源按照业务集中进行分组管理，可以从分组角度查看监控与告警信息，以提升运维效率。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateResourceGroupRequest 请求对象
     * @return CompletableFuture<CreateResourceGroupResponse>
     */
    public CompletableFuture<CreateResourceGroupResponse> createResourceGroupAsync(CreateResourceGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.createResourceGroup);
    }

    /**
     * 创建资源分组
     *
     * 创建资源分组，资源分组支持将各类资源按照业务集中进行分组管理，可以从分组角度查看监控与告警信息，以提升运维效率。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateResourceGroupRequest 请求对象
     * @return AsyncInvoker<CreateResourceGroupRequest, CreateResourceGroupResponse>
     */
    public AsyncInvoker<CreateResourceGroupRequest, CreateResourceGroupResponse> createResourceGroupAsyncInvoker(
        CreateResourceGroupRequest request) {
        return new AsyncInvoker<CreateResourceGroupRequest, CreateResourceGroupResponse>(request,
            CesMeta.createResourceGroup, hcClient);
    }

    /**
     * 删除告警规则
     *
     * 删除一条告警规则。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteAlarmRequest 请求对象
     * @return CompletableFuture<DeleteAlarmResponse>
     */
    public CompletableFuture<DeleteAlarmResponse> deleteAlarmAsync(DeleteAlarmRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.deleteAlarm);
    }

    /**
     * 删除告警规则
     *
     * 删除一条告警规则。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteAlarmRequest 请求对象
     * @return AsyncInvoker<DeleteAlarmRequest, DeleteAlarmResponse>
     */
    public AsyncInvoker<DeleteAlarmRequest, DeleteAlarmResponse> deleteAlarmAsyncInvoker(DeleteAlarmRequest request) {
        return new AsyncInvoker<DeleteAlarmRequest, DeleteAlarmResponse>(request, CesMeta.deleteAlarm, hcClient);
    }

    /**
     * 删除自定义告警模板
     *
     * 根据ID删除自定义告警模板。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteAlarmTemplateRequest 请求对象
     * @return CompletableFuture<DeleteAlarmTemplateResponse>
     */
    public CompletableFuture<DeleteAlarmTemplateResponse> deleteAlarmTemplateAsync(DeleteAlarmTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.deleteAlarmTemplate);
    }

    /**
     * 删除自定义告警模板
     *
     * 根据ID删除自定义告警模板。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteAlarmTemplateRequest 请求对象
     * @return AsyncInvoker<DeleteAlarmTemplateRequest, DeleteAlarmTemplateResponse>
     */
    public AsyncInvoker<DeleteAlarmTemplateRequest, DeleteAlarmTemplateResponse> deleteAlarmTemplateAsyncInvoker(
        DeleteAlarmTemplateRequest request) {
        return new AsyncInvoker<DeleteAlarmTemplateRequest, DeleteAlarmTemplateResponse>(request,
            CesMeta.deleteAlarmTemplate, hcClient);
    }

    /**
     * 删除资源分组
     *
     * 删除一条资源分组。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteResourceGroupRequest 请求对象
     * @return CompletableFuture<DeleteResourceGroupResponse>
     */
    public CompletableFuture<DeleteResourceGroupResponse> deleteResourceGroupAsync(DeleteResourceGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.deleteResourceGroup);
    }

    /**
     * 删除资源分组
     *
     * 删除一条资源分组。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteResourceGroupRequest 请求对象
     * @return AsyncInvoker<DeleteResourceGroupRequest, DeleteResourceGroupResponse>
     */
    public AsyncInvoker<DeleteResourceGroupRequest, DeleteResourceGroupResponse> deleteResourceGroupAsyncInvoker(
        DeleteResourceGroupRequest request) {
        return new AsyncInvoker<DeleteResourceGroupRequest, DeleteResourceGroupResponse>(request,
            CesMeta.deleteResourceGroup, hcClient);
    }

    /**
     * 查询告警历史
     *
     * 查询告警历史列表。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListAlarmHistoriesRequest 请求对象
     * @return CompletableFuture<ListAlarmHistoriesResponse>
     */
    public CompletableFuture<ListAlarmHistoriesResponse> listAlarmHistoriesAsync(ListAlarmHistoriesRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.listAlarmHistories);
    }

    /**
     * 查询告警历史
     *
     * 查询告警历史列表。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListAlarmHistoriesRequest 请求对象
     * @return AsyncInvoker<ListAlarmHistoriesRequest, ListAlarmHistoriesResponse>
     */
    public AsyncInvoker<ListAlarmHistoriesRequest, ListAlarmHistoriesResponse> listAlarmHistoriesAsyncInvoker(
        ListAlarmHistoriesRequest request) {
        return new AsyncInvoker<ListAlarmHistoriesRequest, ListAlarmHistoriesResponse>(request,
            CesMeta.listAlarmHistories, hcClient);
    }

    /**
     * 查询自定义告警模板列表
     *
     * 查询自定义告警模板列表
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListAlarmTemplatesRequest 请求对象
     * @return CompletableFuture<ListAlarmTemplatesResponse>
     */
    public CompletableFuture<ListAlarmTemplatesResponse> listAlarmTemplatesAsync(ListAlarmTemplatesRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.listAlarmTemplates);
    }

    /**
     * 查询自定义告警模板列表
     *
     * 查询自定义告警模板列表
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListAlarmTemplatesRequest 请求对象
     * @return AsyncInvoker<ListAlarmTemplatesRequest, ListAlarmTemplatesResponse>
     */
    public AsyncInvoker<ListAlarmTemplatesRequest, ListAlarmTemplatesResponse> listAlarmTemplatesAsyncInvoker(
        ListAlarmTemplatesRequest request) {
        return new AsyncInvoker<ListAlarmTemplatesRequest, ListAlarmTemplatesResponse>(request,
            CesMeta.listAlarmTemplates, hcClient);
    }

    /**
     * 查询告警规则列表
     *
     * 查询告警规则列表，可以指定分页条件限制结果数量，可以指定排序规则。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListAlarmsRequest 请求对象
     * @return CompletableFuture<ListAlarmsResponse>
     */
    public CompletableFuture<ListAlarmsResponse> listAlarmsAsync(ListAlarmsRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.listAlarms);
    }

    /**
     * 查询告警规则列表
     *
     * 查询告警规则列表，可以指定分页条件限制结果数量，可以指定排序规则。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListAlarmsRequest 请求对象
     * @return AsyncInvoker<ListAlarmsRequest, ListAlarmsResponse>
     */
    public AsyncInvoker<ListAlarmsRequest, ListAlarmsResponse> listAlarmsAsyncInvoker(ListAlarmsRequest request) {
        return new AsyncInvoker<ListAlarmsRequest, ListAlarmsResponse>(request, CesMeta.listAlarms, hcClient);
    }

    /**
     * 查询某一事件监控详情
     *
     * 根据事件监控名称，查询该事件发生的详细信息。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListEventDetailRequest 请求对象
     * @return CompletableFuture<ListEventDetailResponse>
     */
    public CompletableFuture<ListEventDetailResponse> listEventDetailAsync(ListEventDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.listEventDetail);
    }

    /**
     * 查询某一事件监控详情
     *
     * 根据事件监控名称，查询该事件发生的详细信息。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListEventDetailRequest 请求对象
     * @return AsyncInvoker<ListEventDetailRequest, ListEventDetailResponse>
     */
    public AsyncInvoker<ListEventDetailRequest, ListEventDetailResponse> listEventDetailAsyncInvoker(
        ListEventDetailRequest request) {
        return new AsyncInvoker<ListEventDetailRequest, ListEventDetailResponse>(request, CesMeta.listEventDetail,
            hcClient);
    }

    /**
     * 查询事件监控列表
     *
     * 查询事件监控列表，包括系统事件和自定义事件。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListEventsRequest 请求对象
     * @return CompletableFuture<ListEventsResponse>
     */
    public CompletableFuture<ListEventsResponse> listEventsAsync(ListEventsRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.listEvents);
    }

    /**
     * 查询事件监控列表
     *
     * 查询事件监控列表，包括系统事件和自定义事件。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListEventsRequest 请求对象
     * @return AsyncInvoker<ListEventsRequest, ListEventsResponse>
     */
    public AsyncInvoker<ListEventsRequest, ListEventsResponse> listEventsAsyncInvoker(ListEventsRequest request) {
        return new AsyncInvoker<ListEventsRequest, ListEventsResponse>(request, CesMeta.listEvents, hcClient);
    }

    /**
     * 查询指标列表
     *
     * 查询系统当前可监控指标列表，可以指定指标命名空间、指标名称、维度、排序方式，起始记录和最大记录条数过滤查询结果。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListMetricsRequest 请求对象
     * @return CompletableFuture<ListMetricsResponse>
     */
    public CompletableFuture<ListMetricsResponse> listMetricsAsync(ListMetricsRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.listMetrics);
    }

    /**
     * 查询指标列表
     *
     * 查询系统当前可监控指标列表，可以指定指标命名空间、指标名称、维度、排序方式，起始记录和最大记录条数过滤查询结果。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListMetricsRequest 请求对象
     * @return AsyncInvoker<ListMetricsRequest, ListMetricsResponse>
     */
    public AsyncInvoker<ListMetricsRequest, ListMetricsResponse> listMetricsAsyncInvoker(ListMetricsRequest request) {
        return new AsyncInvoker<ListMetricsRequest, ListMetricsResponse>(request, CesMeta.listMetrics, hcClient);
    }

    /**
     * 查询所有资源分组
     *
     * 查询所创建的所有资源分组。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListResourceGroupRequest 请求对象
     * @return CompletableFuture<ListResourceGroupResponse>
     */
    public CompletableFuture<ListResourceGroupResponse> listResourceGroupAsync(ListResourceGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.listResourceGroup);
    }

    /**
     * 查询所有资源分组
     *
     * 查询所创建的所有资源分组。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListResourceGroupRequest 请求对象
     * @return AsyncInvoker<ListResourceGroupRequest, ListResourceGroupResponse>
     */
    public AsyncInvoker<ListResourceGroupRequest, ListResourceGroupResponse> listResourceGroupAsyncInvoker(
        ListResourceGroupRequest request) {
        return new AsyncInvoker<ListResourceGroupRequest, ListResourceGroupResponse>(request, CesMeta.listResourceGroup,
            hcClient);
    }

    /**
     * 查询单条告警规则信息
     *
     * 根据告警ID查询告警规则信息。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowAlarmRequest 请求对象
     * @return CompletableFuture<ShowAlarmResponse>
     */
    public CompletableFuture<ShowAlarmResponse> showAlarmAsync(ShowAlarmRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.showAlarm);
    }

    /**
     * 查询单条告警规则信息
     *
     * 根据告警ID查询告警规则信息。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowAlarmRequest 请求对象
     * @return AsyncInvoker<ShowAlarmRequest, ShowAlarmResponse>
     */
    public AsyncInvoker<ShowAlarmRequest, ShowAlarmResponse> showAlarmAsyncInvoker(ShowAlarmRequest request) {
        return new AsyncInvoker<ShowAlarmRequest, ShowAlarmResponse>(request, CesMeta.showAlarm, hcClient);
    }

    /**
     * 查询主机配置数据
     *
     * 查询指定时间范围指定事件类型的主机配置数据，可以通过参数指定需要查询的数据维度。注意：该接口提供给HANA场景下SAP Monitor查询主机配置数据，其他场景下查不到主机配置数据。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowEventDataRequest 请求对象
     * @return CompletableFuture<ShowEventDataResponse>
     */
    public CompletableFuture<ShowEventDataResponse> showEventDataAsync(ShowEventDataRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.showEventData);
    }

    /**
     * 查询主机配置数据
     *
     * 查询指定时间范围指定事件类型的主机配置数据，可以通过参数指定需要查询的数据维度。注意：该接口提供给HANA场景下SAP Monitor查询主机配置数据，其他场景下查不到主机配置数据。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowEventDataRequest 请求对象
     * @return AsyncInvoker<ShowEventDataRequest, ShowEventDataResponse>
     */
    public AsyncInvoker<ShowEventDataRequest, ShowEventDataResponse> showEventDataAsyncInvoker(
        ShowEventDataRequest request) {
        return new AsyncInvoker<ShowEventDataRequest, ShowEventDataResponse>(request, CesMeta.showEventData, hcClient);
    }

    /**
     * 查询监控数据
     *
     * 查询指定时间范围指定指标的指定粒度的监控数据，可以通过参数指定需要查询的数据维度。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowMetricDataRequest 请求对象
     * @return CompletableFuture<ShowMetricDataResponse>
     */
    public CompletableFuture<ShowMetricDataResponse> showMetricDataAsync(ShowMetricDataRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.showMetricData);
    }

    /**
     * 查询监控数据
     *
     * 查询指定时间范围指定指标的指定粒度的监控数据，可以通过参数指定需要查询的数据维度。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowMetricDataRequest 请求对象
     * @return AsyncInvoker<ShowMetricDataRequest, ShowMetricDataResponse>
     */
    public AsyncInvoker<ShowMetricDataRequest, ShowMetricDataResponse> showMetricDataAsyncInvoker(
        ShowMetricDataRequest request) {
        return new AsyncInvoker<ShowMetricDataRequest, ShowMetricDataResponse>(request, CesMeta.showMetricData,
            hcClient);
    }

    /**
     * 查询配额
     *
     * 查询用户可以创建的资源配额总数及当前使用量，当前仅有告警规则一种资源类型。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowQuotasRequest 请求对象
     * @return CompletableFuture<ShowQuotasResponse>
     */
    public CompletableFuture<ShowQuotasResponse> showQuotasAsync(ShowQuotasRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.showQuotas);
    }

    /**
     * 查询配额
     *
     * 查询用户可以创建的资源配额总数及当前使用量，当前仅有告警规则一种资源类型。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowQuotasRequest 请求对象
     * @return AsyncInvoker<ShowQuotasRequest, ShowQuotasResponse>
     */
    public AsyncInvoker<ShowQuotasRequest, ShowQuotasResponse> showQuotasAsyncInvoker(ShowQuotasRequest request) {
        return new AsyncInvoker<ShowQuotasRequest, ShowQuotasResponse>(request, CesMeta.showQuotas, hcClient);
    }

    /**
     * 查询资源分组下的资源
     *
     * 根据资源分组ID查询资源分组下的资源。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowResourceGroupRequest 请求对象
     * @return CompletableFuture<ShowResourceGroupResponse>
     */
    public CompletableFuture<ShowResourceGroupResponse> showResourceGroupAsync(ShowResourceGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.showResourceGroup);
    }

    /**
     * 查询资源分组下的资源
     *
     * 根据资源分组ID查询资源分组下的资源。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowResourceGroupRequest 请求对象
     * @return AsyncInvoker<ShowResourceGroupRequest, ShowResourceGroupResponse>
     */
    public AsyncInvoker<ShowResourceGroupRequest, ShowResourceGroupResponse> showResourceGroupAsyncInvoker(
        ShowResourceGroupRequest request) {
        return new AsyncInvoker<ShowResourceGroupRequest, ShowResourceGroupResponse>(request, CesMeta.showResourceGroup,
            hcClient);
    }

    /**
     * 修改告警规则
     *
     * 修改告警规则。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateAlarmRequest 请求对象
     * @return CompletableFuture<UpdateAlarmResponse>
     */
    public CompletableFuture<UpdateAlarmResponse> updateAlarmAsync(UpdateAlarmRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.updateAlarm);
    }

    /**
     * 修改告警规则
     *
     * 修改告警规则。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateAlarmRequest 请求对象
     * @return AsyncInvoker<UpdateAlarmRequest, UpdateAlarmResponse>
     */
    public AsyncInvoker<UpdateAlarmRequest, UpdateAlarmResponse> updateAlarmAsyncInvoker(UpdateAlarmRequest request) {
        return new AsyncInvoker<UpdateAlarmRequest, UpdateAlarmResponse>(request, CesMeta.updateAlarm, hcClient);
    }

    /**
     * 启停告警规则
     *
     * 启动或停止一条告警规则。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateAlarmActionRequest 请求对象
     * @return CompletableFuture<UpdateAlarmActionResponse>
     */
    public CompletableFuture<UpdateAlarmActionResponse> updateAlarmActionAsync(UpdateAlarmActionRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.updateAlarmAction);
    }

    /**
     * 启停告警规则
     *
     * 启动或停止一条告警规则。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateAlarmActionRequest 请求对象
     * @return AsyncInvoker<UpdateAlarmActionRequest, UpdateAlarmActionResponse>
     */
    public AsyncInvoker<UpdateAlarmActionRequest, UpdateAlarmActionResponse> updateAlarmActionAsyncInvoker(
        UpdateAlarmActionRequest request) {
        return new AsyncInvoker<UpdateAlarmActionRequest, UpdateAlarmActionResponse>(request, CesMeta.updateAlarmAction,
            hcClient);
    }

    /**
     * 更新自定义告警模板
     *
     * 更新自定义告警模板。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateAlarmTemplateRequest 请求对象
     * @return CompletableFuture<UpdateAlarmTemplateResponse>
     */
    public CompletableFuture<UpdateAlarmTemplateResponse> updateAlarmTemplateAsync(UpdateAlarmTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.updateAlarmTemplate);
    }

    /**
     * 更新自定义告警模板
     *
     * 更新自定义告警模板。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateAlarmTemplateRequest 请求对象
     * @return AsyncInvoker<UpdateAlarmTemplateRequest, UpdateAlarmTemplateResponse>
     */
    public AsyncInvoker<UpdateAlarmTemplateRequest, UpdateAlarmTemplateResponse> updateAlarmTemplateAsyncInvoker(
        UpdateAlarmTemplateRequest request) {
        return new AsyncInvoker<UpdateAlarmTemplateRequest, UpdateAlarmTemplateResponse>(request,
            CesMeta.updateAlarmTemplate, hcClient);
    }

    /**
     * 更新资源分组
     *
     * 更新资源分组，资源分组支持将各类资源按照业务集中进行分组管理，可以从分组角度查看监控与告警信息，以提升运维效率。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateResourceGroupRequest 请求对象
     * @return CompletableFuture<UpdateResourceGroupResponse>
     */
    public CompletableFuture<UpdateResourceGroupResponse> updateResourceGroupAsync(UpdateResourceGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.updateResourceGroup);
    }

    /**
     * 更新资源分组
     *
     * 更新资源分组，资源分组支持将各类资源按照业务集中进行分组管理，可以从分组角度查看监控与告警信息，以提升运维效率。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateResourceGroupRequest 请求对象
     * @return AsyncInvoker<UpdateResourceGroupRequest, UpdateResourceGroupResponse>
     */
    public AsyncInvoker<UpdateResourceGroupRequest, UpdateResourceGroupResponse> updateResourceGroupAsyncInvoker(
        UpdateResourceGroupRequest request) {
        return new AsyncInvoker<UpdateResourceGroupRequest, UpdateResourceGroupResponse>(request,
            CesMeta.updateResourceGroup, hcClient);
    }

}
