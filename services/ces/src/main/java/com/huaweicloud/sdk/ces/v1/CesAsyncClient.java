package com.huaweicloud.sdk.ces.v1;

import com.huaweicloud.sdk.ces.v1.model.BatchListMetricDataRequest;
import com.huaweicloud.sdk.ces.v1.model.BatchListMetricDataResponse;
import com.huaweicloud.sdk.ces.v1.model.CreateAlarmRequest;
import com.huaweicloud.sdk.ces.v1.model.CreateAlarmResponse;
import com.huaweicloud.sdk.ces.v1.model.CreateAlarmTemplateRequest;
import com.huaweicloud.sdk.ces.v1.model.CreateAlarmTemplateResponse;
import com.huaweicloud.sdk.ces.v1.model.CreateEventsRequest;
import com.huaweicloud.sdk.ces.v1.model.CreateEventsResponse;
import com.huaweicloud.sdk.ces.v1.model.CreateMetricDataRequest;
import com.huaweicloud.sdk.ces.v1.model.CreateMetricDataResponse;
import com.huaweicloud.sdk.ces.v1.model.CreateResourceGroupRequest;
import com.huaweicloud.sdk.ces.v1.model.CreateResourceGroupResponse;
import com.huaweicloud.sdk.ces.v1.model.DeleteAlarmRequest;
import com.huaweicloud.sdk.ces.v1.model.DeleteAlarmResponse;
import com.huaweicloud.sdk.ces.v1.model.DeleteAlarmTemplateRequest;
import com.huaweicloud.sdk.ces.v1.model.DeleteAlarmTemplateResponse;
import com.huaweicloud.sdk.ces.v1.model.DeleteResourceGroupRequest;
import com.huaweicloud.sdk.ces.v1.model.DeleteResourceGroupResponse;
import com.huaweicloud.sdk.ces.v1.model.ListAlarmHistoriesRequest;
import com.huaweicloud.sdk.ces.v1.model.ListAlarmHistoriesResponse;
import com.huaweicloud.sdk.ces.v1.model.ListAlarmTemplatesRequest;
import com.huaweicloud.sdk.ces.v1.model.ListAlarmTemplatesResponse;
import com.huaweicloud.sdk.ces.v1.model.ListAlarmsRequest;
import com.huaweicloud.sdk.ces.v1.model.ListAlarmsResponse;
import com.huaweicloud.sdk.ces.v1.model.ListEventDetailRequest;
import com.huaweicloud.sdk.ces.v1.model.ListEventDetailResponse;
import com.huaweicloud.sdk.ces.v1.model.ListEventsRequest;
import com.huaweicloud.sdk.ces.v1.model.ListEventsResponse;
import com.huaweicloud.sdk.ces.v1.model.ListMetricsRequest;
import com.huaweicloud.sdk.ces.v1.model.ListMetricsResponse;
import com.huaweicloud.sdk.ces.v1.model.ListResourceGroupRequest;
import com.huaweicloud.sdk.ces.v1.model.ListResourceGroupResponse;
import com.huaweicloud.sdk.ces.v1.model.ShowAlarmRequest;
import com.huaweicloud.sdk.ces.v1.model.ShowAlarmResponse;
import com.huaweicloud.sdk.ces.v1.model.ShowEventDataRequest;
import com.huaweicloud.sdk.ces.v1.model.ShowEventDataResponse;
import com.huaweicloud.sdk.ces.v1.model.ShowMetricDataRequest;
import com.huaweicloud.sdk.ces.v1.model.ShowMetricDataResponse;
import com.huaweicloud.sdk.ces.v1.model.ShowQuotasRequest;
import com.huaweicloud.sdk.ces.v1.model.ShowQuotasResponse;
import com.huaweicloud.sdk.ces.v1.model.ShowResourceGroupRequest;
import com.huaweicloud.sdk.ces.v1.model.ShowResourceGroupResponse;
import com.huaweicloud.sdk.ces.v1.model.UpdateAlarmActionRequest;
import com.huaweicloud.sdk.ces.v1.model.UpdateAlarmActionResponse;
import com.huaweicloud.sdk.ces.v1.model.UpdateAlarmRequest;
import com.huaweicloud.sdk.ces.v1.model.UpdateAlarmResponse;
import com.huaweicloud.sdk.ces.v1.model.UpdateAlarmTemplateRequest;
import com.huaweicloud.sdk.ces.v1.model.UpdateAlarmTemplateResponse;
import com.huaweicloud.sdk.ces.v1.model.UpdateResourceGroupRequest;
import com.huaweicloud.sdk.ces.v1.model.UpdateResourceGroupResponse;
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
        ClientBuilder<CesAsyncClient> clientBuilder = new ClientBuilder<>(CesAsyncClient::new);
        return clientBuilder;
    }

    /**
     * 批量查询监控数据
     *
     * 批量查询指定时间范围内指定指标的指定粒度的监控数据，目前最多支持500指标的批量查询。 对于不同的period取值和查询的指标数量，默认的最大查询区间(to-from)不同。 规则为\&quot;指标数量*(to-from)/监控周期&lt;&#x3D;3000\&quot;，若超出阈值，会自动调整from以满足规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchListMetricDataRequest 请求对象
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
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchListMetricDataRequest 请求对象
     * @return AsyncInvoker<BatchListMetricDataRequest, BatchListMetricDataResponse>
     */
    public AsyncInvoker<BatchListMetricDataRequest, BatchListMetricDataResponse> batchListMetricDataAsyncInvoker(
        BatchListMetricDataRequest request) {
        return new AsyncInvoker<>(request, CesMeta.batchListMetricData, hcClient);
    }

    /**
     * 创建告警规则（V1）
     *
     * 创建一条告警规则。创建告警规则V1接口只支持配置单资源单策略规则，建议使用“[创建告警规则（推荐）](CreateAlarmRules.xml)”与前端功能配套使用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAlarmRequest 请求对象
     * @return CompletableFuture<CreateAlarmResponse>
     */
    public CompletableFuture<CreateAlarmResponse> createAlarmAsync(CreateAlarmRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.createAlarm);
    }

    /**
     * 创建告警规则（V1）
     *
     * 创建一条告警规则。创建告警规则V1接口只支持配置单资源单策略规则，建议使用“[创建告警规则（推荐）](CreateAlarmRules.xml)”与前端功能配套使用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAlarmRequest 请求对象
     * @return AsyncInvoker<CreateAlarmRequest, CreateAlarmResponse>
     */
    public AsyncInvoker<CreateAlarmRequest, CreateAlarmResponse> createAlarmAsyncInvoker(CreateAlarmRequest request) {
        return new AsyncInvoker<>(request, CesMeta.createAlarm, hcClient);
    }

    /**
     * 创建自定义告警模板
     *
     * 创建自定义告警模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAlarmTemplateRequest 请求对象
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
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAlarmTemplateRequest 请求对象
     * @return AsyncInvoker<CreateAlarmTemplateRequest, CreateAlarmTemplateResponse>
     */
    public AsyncInvoker<CreateAlarmTemplateRequest, CreateAlarmTemplateResponse> createAlarmTemplateAsyncInvoker(
        CreateAlarmTemplateRequest request) {
        return new AsyncInvoker<>(request, CesMeta.createAlarmTemplate, hcClient);
    }

    /**
     * 上报事件
     *
     * 上报自定义事件。事件的time、project_id、event_source、event_name、event_type、sub_event_type、event_state、event_level、event_user、resource_id、resource_name字段相同时，则视为同一条事件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateEventsRequest 请求对象
     * @return CompletableFuture<CreateEventsResponse>
     */
    public CompletableFuture<CreateEventsResponse> createEventsAsync(CreateEventsRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.createEvents);
    }

    /**
     * 上报事件
     *
     * 上报自定义事件。事件的time、project_id、event_source、event_name、event_type、sub_event_type、event_state、event_level、event_user、resource_id、resource_name字段相同时，则视为同一条事件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateEventsRequest 请求对象
     * @return AsyncInvoker<CreateEventsRequest, CreateEventsResponse>
     */
    public AsyncInvoker<CreateEventsRequest, CreateEventsResponse> createEventsAsyncInvoker(
        CreateEventsRequest request) {
        return new AsyncInvoker<>(request, CesMeta.createEvents, hcClient);
    }

    /**
     * 添加监控数据
     *
     * 添加一条或多条指标监控数据。约束与限制：
     * 1. 单次POST请求消息体大小不能超过512KB，否则请求会被服务端拒绝。
     * 2. POST请求发送周期应小于最小聚合周期，否则会出现聚合数据点不连续。例如：聚合周期为5分钟，发送周期为7分钟，则5分钟情况的聚合数据会出现每10分钟才出现一个点。
     * 3. POST请求体中数据收集时间（collect_time）的值必须从当前时间的前三天到当前时间后的十分钟之内某一时间，如果不在这个范围内，则不允许插入指标数据。
     * 4. 如果指标上报时间（即调用指标上报接口的时间）与数据收集时间（collect_time）之间的延迟超过10分钟，CES在聚合数据时会丢弃此指标数据。您只能查看近2天的原始指标数据，聚合数据中不会显示这些延迟上报的指标。例如，14:20:00调用CES接口上报数据，请求体中的collect_time字段为14:05:00，表示延迟上报了15分钟。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateMetricDataRequest 请求对象
     * @return CompletableFuture<CreateMetricDataResponse>
     */
    public CompletableFuture<CreateMetricDataResponse> createMetricDataAsync(CreateMetricDataRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.createMetricData);
    }

    /**
     * 添加监控数据
     *
     * 添加一条或多条指标监控数据。约束与限制：
     * 1. 单次POST请求消息体大小不能超过512KB，否则请求会被服务端拒绝。
     * 2. POST请求发送周期应小于最小聚合周期，否则会出现聚合数据点不连续。例如：聚合周期为5分钟，发送周期为7分钟，则5分钟情况的聚合数据会出现每10分钟才出现一个点。
     * 3. POST请求体中数据收集时间（collect_time）的值必须从当前时间的前三天到当前时间后的十分钟之内某一时间，如果不在这个范围内，则不允许插入指标数据。
     * 4. 如果指标上报时间（即调用指标上报接口的时间）与数据收集时间（collect_time）之间的延迟超过10分钟，CES在聚合数据时会丢弃此指标数据。您只能查看近2天的原始指标数据，聚合数据中不会显示这些延迟上报的指标。例如，14:20:00调用CES接口上报数据，请求体中的collect_time字段为14:05:00，表示延迟上报了15分钟。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateMetricDataRequest 请求对象
     * @return AsyncInvoker<CreateMetricDataRequest, CreateMetricDataResponse>
     */
    public AsyncInvoker<CreateMetricDataRequest, CreateMetricDataResponse> createMetricDataAsyncInvoker(
        CreateMetricDataRequest request) {
        return new AsyncInvoker<>(request, CesMeta.createMetricData, hcClient);
    }

    /**
     * 创建资源分组
     *
     * 创建资源分组，资源分组支持将各类资源按照业务集中进行分组管理，可以从分组角度查看监控与告警信息，以提升运维效率。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateResourceGroupRequest 请求对象
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
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateResourceGroupRequest 请求对象
     * @return AsyncInvoker<CreateResourceGroupRequest, CreateResourceGroupResponse>
     */
    public AsyncInvoker<CreateResourceGroupRequest, CreateResourceGroupResponse> createResourceGroupAsyncInvoker(
        CreateResourceGroupRequest request) {
        return new AsyncInvoker<>(request, CesMeta.createResourceGroup, hcClient);
    }

    /**
     * 删除告警规则
     *
     * 删除一条告警规则。
     * 告警规则V1接口只支持配置单资源单策略规则，建议使用[批量删除告警规则](BatchDeleteAlarmRules.xml)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAlarmRequest 请求对象
     * @return CompletableFuture<DeleteAlarmResponse>
     */
    public CompletableFuture<DeleteAlarmResponse> deleteAlarmAsync(DeleteAlarmRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.deleteAlarm);
    }

    /**
     * 删除告警规则
     *
     * 删除一条告警规则。
     * 告警规则V1接口只支持配置单资源单策略规则，建议使用[批量删除告警规则](BatchDeleteAlarmRules.xml)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAlarmRequest 请求对象
     * @return AsyncInvoker<DeleteAlarmRequest, DeleteAlarmResponse>
     */
    public AsyncInvoker<DeleteAlarmRequest, DeleteAlarmResponse> deleteAlarmAsyncInvoker(DeleteAlarmRequest request) {
        return new AsyncInvoker<>(request, CesMeta.deleteAlarm, hcClient);
    }

    /**
     * 删除自定义告警模板
     *
     * 根据ID删除自定义告警模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAlarmTemplateRequest 请求对象
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
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAlarmTemplateRequest 请求对象
     * @return AsyncInvoker<DeleteAlarmTemplateRequest, DeleteAlarmTemplateResponse>
     */
    public AsyncInvoker<DeleteAlarmTemplateRequest, DeleteAlarmTemplateResponse> deleteAlarmTemplateAsyncInvoker(
        DeleteAlarmTemplateRequest request) {
        return new AsyncInvoker<>(request, CesMeta.deleteAlarmTemplate, hcClient);
    }

    /**
     * 删除资源分组
     *
     * 删除一条资源分组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteResourceGroupRequest 请求对象
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
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteResourceGroupRequest 请求对象
     * @return AsyncInvoker<DeleteResourceGroupRequest, DeleteResourceGroupResponse>
     */
    public AsyncInvoker<DeleteResourceGroupRequest, DeleteResourceGroupResponse> deleteResourceGroupAsyncInvoker(
        DeleteResourceGroupRequest request) {
        return new AsyncInvoker<>(request, CesMeta.deleteResourceGroup, hcClient);
    }

    /**
     * 查询告警历史
     *
     * 查询告警历史列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAlarmHistoriesRequest 请求对象
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
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAlarmHistoriesRequest 请求对象
     * @return AsyncInvoker<ListAlarmHistoriesRequest, ListAlarmHistoriesResponse>
     */
    public AsyncInvoker<ListAlarmHistoriesRequest, ListAlarmHistoriesResponse> listAlarmHistoriesAsyncInvoker(
        ListAlarmHistoriesRequest request) {
        return new AsyncInvoker<>(request, CesMeta.listAlarmHistories, hcClient);
    }

    /**
     * 查询自定义告警模板列表
     *
     * 查询自定义告警模板列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAlarmTemplatesRequest 请求对象
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
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAlarmTemplatesRequest 请求对象
     * @return AsyncInvoker<ListAlarmTemplatesRequest, ListAlarmTemplatesResponse>
     */
    public AsyncInvoker<ListAlarmTemplatesRequest, ListAlarmTemplatesResponse> listAlarmTemplatesAsyncInvoker(
        ListAlarmTemplatesRequest request) {
        return new AsyncInvoker<>(request, CesMeta.listAlarmTemplates, hcClient);
    }

    /**
     * 查询告警规则列表（V1）
     *
     * 查询告警规则列表，可以指定分页条件限制结果数量，可以指定排序规则。如果用本接口去查询多资源多策略的告警规则，也只能返回告警规则的某个策略，建议使用“[查询告警规则列表（推荐）](ListAlarmRules.xml)”与前端功能配套使用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAlarmsRequest 请求对象
     * @return CompletableFuture<ListAlarmsResponse>
     */
    public CompletableFuture<ListAlarmsResponse> listAlarmsAsync(ListAlarmsRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.listAlarms);
    }

    /**
     * 查询告警规则列表（V1）
     *
     * 查询告警规则列表，可以指定分页条件限制结果数量，可以指定排序规则。如果用本接口去查询多资源多策略的告警规则，也只能返回告警规则的某个策略，建议使用“[查询告警规则列表（推荐）](ListAlarmRules.xml)”与前端功能配套使用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAlarmsRequest 请求对象
     * @return AsyncInvoker<ListAlarmsRequest, ListAlarmsResponse>
     */
    public AsyncInvoker<ListAlarmsRequest, ListAlarmsResponse> listAlarmsAsyncInvoker(ListAlarmsRequest request) {
        return new AsyncInvoker<>(request, CesMeta.listAlarms, hcClient);
    }

    /**
     * 查询某一事件监控详情
     *
     * 根据事件监控名称，查询该事件发生的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEventDetailRequest 请求对象
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
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEventDetailRequest 请求对象
     * @return AsyncInvoker<ListEventDetailRequest, ListEventDetailResponse>
     */
    public AsyncInvoker<ListEventDetailRequest, ListEventDetailResponse> listEventDetailAsyncInvoker(
        ListEventDetailRequest request) {
        return new AsyncInvoker<>(request, CesMeta.listEventDetail, hcClient);
    }

    /**
     * 查询事件监控列表
     *
     * 查询事件监控列表，包括系统事件和自定义事件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEventsRequest 请求对象
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
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEventsRequest 请求对象
     * @return AsyncInvoker<ListEventsRequest, ListEventsResponse>
     */
    public AsyncInvoker<ListEventsRequest, ListEventsResponse> listEventsAsyncInvoker(ListEventsRequest request) {
        return new AsyncInvoker<>(request, CesMeta.listEvents, hcClient);
    }

    /**
     * 查询指标列表
     *
     * 查询系统当前可监控指标列表，可以指定指标命名空间、指标名称、维度、排序方式，起始记录和最大记录条数过滤查询结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMetricsRequest 请求对象
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
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMetricsRequest 请求对象
     * @return AsyncInvoker<ListMetricsRequest, ListMetricsResponse>
     */
    public AsyncInvoker<ListMetricsRequest, ListMetricsResponse> listMetricsAsyncInvoker(ListMetricsRequest request) {
        return new AsyncInvoker<>(request, CesMeta.listMetrics, hcClient);
    }

    /**
     * 查询所有资源分组
     *
     * 查询所创建的所有资源分组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListResourceGroupRequest 请求对象
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
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListResourceGroupRequest 请求对象
     * @return AsyncInvoker<ListResourceGroupRequest, ListResourceGroupResponse>
     */
    public AsyncInvoker<ListResourceGroupRequest, ListResourceGroupResponse> listResourceGroupAsyncInvoker(
        ListResourceGroupRequest request) {
        return new AsyncInvoker<>(request, CesMeta.listResourceGroup, hcClient);
    }

    /**
     * 查询单条告警规则信息
     *
     * 根据告警ID查询告警规则信息。告警规则V1接口只支持配置单资源单策略规则，建议使用“[查询告警规则列表（推荐）](ListAlarmRules.xml)”、“[查询告警规则资源列表](ListAlarmRuleResources.xml)”与前端功能配套使用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAlarmRequest 请求对象
     * @return CompletableFuture<ShowAlarmResponse>
     */
    public CompletableFuture<ShowAlarmResponse> showAlarmAsync(ShowAlarmRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.showAlarm);
    }

    /**
     * 查询单条告警规则信息
     *
     * 根据告警ID查询告警规则信息。告警规则V1接口只支持配置单资源单策略规则，建议使用“[查询告警规则列表（推荐）](ListAlarmRules.xml)”、“[查询告警规则资源列表](ListAlarmRuleResources.xml)”与前端功能配套使用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAlarmRequest 请求对象
     * @return AsyncInvoker<ShowAlarmRequest, ShowAlarmResponse>
     */
    public AsyncInvoker<ShowAlarmRequest, ShowAlarmResponse> showAlarmAsyncInvoker(ShowAlarmRequest request) {
        return new AsyncInvoker<>(request, CesMeta.showAlarm, hcClient);
    }

    /**
     * 查询主机配置数据
     *
     * 查询指定时间范围指定事件类型的主机配置数据，可以通过参数指定需要查询的数据维度。注意：该接口提供给HANA场景下SAP Monitor查询主机配置数据，其他场景下查不到主机配置数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowEventDataRequest 请求对象
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
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowEventDataRequest 请求对象
     * @return AsyncInvoker<ShowEventDataRequest, ShowEventDataResponse>
     */
    public AsyncInvoker<ShowEventDataRequest, ShowEventDataResponse> showEventDataAsyncInvoker(
        ShowEventDataRequest request) {
        return new AsyncInvoker<>(request, CesMeta.showEventData, hcClient);
    }

    /**
     * 查询监控数据
     *
     * 查询指定时间范围指定指标的指定粒度的监控数据，可以通过参数指定需要查询的数据维度。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMetricDataRequest 请求对象
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
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMetricDataRequest 请求对象
     * @return AsyncInvoker<ShowMetricDataRequest, ShowMetricDataResponse>
     */
    public AsyncInvoker<ShowMetricDataRequest, ShowMetricDataResponse> showMetricDataAsyncInvoker(
        ShowMetricDataRequest request) {
        return new AsyncInvoker<>(request, CesMeta.showMetricData, hcClient);
    }

    /**
     * 查询配额
     *
     * 查询用户可以创建的资源配额总数及当前使用量，当前仅有告警规则一种资源类型。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowQuotasRequest 请求对象
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
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowQuotasRequest 请求对象
     * @return AsyncInvoker<ShowQuotasRequest, ShowQuotasResponse>
     */
    public AsyncInvoker<ShowQuotasRequest, ShowQuotasResponse> showQuotasAsyncInvoker(ShowQuotasRequest request) {
        return new AsyncInvoker<>(request, CesMeta.showQuotas, hcClient);
    }

    /**
     * 查询资源分组下的资源
     *
     * 根据资源分组ID查询资源分组下的资源。此接口已过时，建议使用v2接口 “[查询资源分组下指定服务类别特定维度的资源列表](ListResourceGroupsServicesResources.xml)”
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowResourceGroupRequest 请求对象
     * @return CompletableFuture<ShowResourceGroupResponse>
     */
    public CompletableFuture<ShowResourceGroupResponse> showResourceGroupAsync(ShowResourceGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.showResourceGroup);
    }

    /**
     * 查询资源分组下的资源
     *
     * 根据资源分组ID查询资源分组下的资源。此接口已过时，建议使用v2接口 “[查询资源分组下指定服务类别特定维度的资源列表](ListResourceGroupsServicesResources.xml)”
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowResourceGroupRequest 请求对象
     * @return AsyncInvoker<ShowResourceGroupRequest, ShowResourceGroupResponse>
     */
    public AsyncInvoker<ShowResourceGroupRequest, ShowResourceGroupResponse> showResourceGroupAsyncInvoker(
        ShowResourceGroupRequest request) {
        return new AsyncInvoker<>(request, CesMeta.showResourceGroup, hcClient);
    }

    /**
     * 修改告警规则
     *
     * 修改告警规则。
     * 告警规则V1接口只支持配置单资源单策略规则，建议使用[批量增加告警规则资源](AddAlarmRuleResources.xml)、[批量删除告警规则资源](DeleteAlarmRuleResources.xml)和[修改告警规则策略(全量修改)](UpdateAlarmRulePolicies.xml)与前端功能配套使用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAlarmRequest 请求对象
     * @return CompletableFuture<UpdateAlarmResponse>
     */
    public CompletableFuture<UpdateAlarmResponse> updateAlarmAsync(UpdateAlarmRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.updateAlarm);
    }

    /**
     * 修改告警规则
     *
     * 修改告警规则。
     * 告警规则V1接口只支持配置单资源单策略规则，建议使用[批量增加告警规则资源](AddAlarmRuleResources.xml)、[批量删除告警规则资源](DeleteAlarmRuleResources.xml)和[修改告警规则策略(全量修改)](UpdateAlarmRulePolicies.xml)与前端功能配套使用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAlarmRequest 请求对象
     * @return AsyncInvoker<UpdateAlarmRequest, UpdateAlarmResponse>
     */
    public AsyncInvoker<UpdateAlarmRequest, UpdateAlarmResponse> updateAlarmAsyncInvoker(UpdateAlarmRequest request) {
        return new AsyncInvoker<>(request, CesMeta.updateAlarm, hcClient);
    }

    /**
     * 启停告警规则
     *
     * 启动或停止一条告警规则。
     * 告警规则V1接口只支持配置单资源单策略规则，建议使用[批量启停告警规则](BatchEnableAlarmRules.xml)与前端功能配套使用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAlarmActionRequest 请求对象
     * @return CompletableFuture<UpdateAlarmActionResponse>
     */
    public CompletableFuture<UpdateAlarmActionResponse> updateAlarmActionAsync(UpdateAlarmActionRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.updateAlarmAction);
    }

    /**
     * 启停告警规则
     *
     * 启动或停止一条告警规则。
     * 告警规则V1接口只支持配置单资源单策略规则，建议使用[批量启停告警规则](BatchEnableAlarmRules.xml)与前端功能配套使用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAlarmActionRequest 请求对象
     * @return AsyncInvoker<UpdateAlarmActionRequest, UpdateAlarmActionResponse>
     */
    public AsyncInvoker<UpdateAlarmActionRequest, UpdateAlarmActionResponse> updateAlarmActionAsyncInvoker(
        UpdateAlarmActionRequest request) {
        return new AsyncInvoker<>(request, CesMeta.updateAlarmAction, hcClient);
    }

    /**
     * 更新自定义告警模板
     *
     * 更新自定义告警模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAlarmTemplateRequest 请求对象
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
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAlarmTemplateRequest 请求对象
     * @return AsyncInvoker<UpdateAlarmTemplateRequest, UpdateAlarmTemplateResponse>
     */
    public AsyncInvoker<UpdateAlarmTemplateRequest, UpdateAlarmTemplateResponse> updateAlarmTemplateAsyncInvoker(
        UpdateAlarmTemplateRequest request) {
        return new AsyncInvoker<>(request, CesMeta.updateAlarmTemplate, hcClient);
    }

    /**
     * 更新资源分组
     *
     * 更新资源分组，资源分组支持将各类资源按照业务集中进行分组管理，可以从分组角度查看监控与告警信息，以提升运维效率。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateResourceGroupRequest 请求对象
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
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateResourceGroupRequest 请求对象
     * @return AsyncInvoker<UpdateResourceGroupRequest, UpdateResourceGroupResponse>
     */
    public AsyncInvoker<UpdateResourceGroupRequest, UpdateResourceGroupResponse> updateResourceGroupAsyncInvoker(
        UpdateResourceGroupRequest request) {
        return new AsyncInvoker<>(request, CesMeta.updateResourceGroup, hcClient);
    }

}
