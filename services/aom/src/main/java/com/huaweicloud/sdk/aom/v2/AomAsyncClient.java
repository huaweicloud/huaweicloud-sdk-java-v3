package com.huaweicloud.sdk.aom.v2;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
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
     * 添加阈值规则
     *
     * 该接口用于添加一条阈值规则。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param AddAlarmRuleRequest 请求对象
     * @return CompletableFuture<AddAlarmRuleResponse>
     */
    public CompletableFuture<AddAlarmRuleResponse> addAlarmRuleAsync(AddAlarmRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, AomMeta.addAlarmRule);
    }

    /**
     * 添加阈值规则
     *
     * 该接口用于添加一条阈值规则。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param AddAlarmRuleRequest 请求对象
     * @return AsyncInvoker<AddAlarmRuleRequest, AddAlarmRuleResponse>
     */
    public AsyncInvoker<AddAlarmRuleRequest, AddAlarmRuleResponse> addAlarmRuleAsyncInvoker(AddAlarmRuleRequest request) {
        return new AsyncInvoker<AddAlarmRuleRequest, AddAlarmRuleResponse>(request, AomMeta.addAlarmRule, hcClient);
    }

    /**
     * 添加监控数据
     *
     * 该接口用于向服务端添加一条或多条监控数据。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param AddMetricDataRequest 请求对象
     * @return CompletableFuture<AddMetricDataResponse>
     */
    public CompletableFuture<AddMetricDataResponse> addMetricDataAsync(AddMetricDataRequest request) {
        return hcClient.asyncInvokeHttp(request, AomMeta.addMetricData);
    }

    /**
     * 添加监控数据
     *
     * 该接口用于向服务端添加一条或多条监控数据。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param AddMetricDataRequest 请求对象
     * @return AsyncInvoker<AddMetricDataRequest, AddMetricDataResponse>
     */
    public AsyncInvoker<AddMetricDataRequest, AddMetricDataResponse> addMetricDataAsyncInvoker(AddMetricDataRequest request) {
        return new AsyncInvoker<AddMetricDataRequest, AddMetricDataResponse>(request, AomMeta.addMetricData, hcClient);
    }

    /**
     * 添加或修改服务发现规则
     *
     * 该接口用于添加或修改一条或多条服务发现规则。同一projectid下可添加的规则上限为100条。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param AddOrUpdateServiceDiscoveryRulesRequest 请求对象
     * @return CompletableFuture<AddOrUpdateServiceDiscoveryRulesResponse>
     */
    public CompletableFuture<AddOrUpdateServiceDiscoveryRulesResponse> addOrUpdateServiceDiscoveryRulesAsync(AddOrUpdateServiceDiscoveryRulesRequest request) {
        return hcClient.asyncInvokeHttp(request, AomMeta.addOrUpdateServiceDiscoveryRules);
    }

    /**
     * 添加或修改服务发现规则
     *
     * 该接口用于添加或修改一条或多条服务发现规则。同一projectid下可添加的规则上限为100条。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param AddOrUpdateServiceDiscoveryRulesRequest 请求对象
     * @return AsyncInvoker<AddOrUpdateServiceDiscoveryRulesRequest, AddOrUpdateServiceDiscoveryRulesResponse>
     */
    public AsyncInvoker<AddOrUpdateServiceDiscoveryRulesRequest, AddOrUpdateServiceDiscoveryRulesResponse> addOrUpdateServiceDiscoveryRulesAsyncInvoker(AddOrUpdateServiceDiscoveryRulesRequest request) {
        return new AsyncInvoker<AddOrUpdateServiceDiscoveryRulesRequest, AddOrUpdateServiceDiscoveryRulesResponse>(request, AomMeta.addOrUpdateServiceDiscoveryRules, hcClient);
    }

    /**
     * 统计事件告警信息
     *
     * 该接口用于分段统计指定条件下的事件、告警。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CountEventsRequest 请求对象
     * @return CompletableFuture<CountEventsResponse>
     */
    public CompletableFuture<CountEventsResponse> countEventsAsync(CountEventsRequest request) {
        return hcClient.asyncInvokeHttp(request, AomMeta.countEvents);
    }

    /**
     * 统计事件告警信息
     *
     * 该接口用于分段统计指定条件下的事件、告警。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CountEventsRequest 请求对象
     * @return AsyncInvoker<CountEventsRequest, CountEventsResponse>
     */
    public AsyncInvoker<CountEventsRequest, CountEventsResponse> countEventsAsyncInvoker(CountEventsRequest request) {
        return new AsyncInvoker<CountEventsRequest, CountEventsResponse>(request, AomMeta.countEvents, hcClient);
    }

    /**
     * 删除阈值规则
     *
     * 该接口用于删除阈值规则。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteAlarmRuleRequest 请求对象
     * @return CompletableFuture<DeleteAlarmRuleResponse>
     */
    public CompletableFuture<DeleteAlarmRuleResponse> deleteAlarmRuleAsync(DeleteAlarmRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, AomMeta.deleteAlarmRule);
    }

    /**
     * 删除阈值规则
     *
     * 该接口用于删除阈值规则。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteAlarmRuleRequest 请求对象
     * @return AsyncInvoker<DeleteAlarmRuleRequest, DeleteAlarmRuleResponse>
     */
    public AsyncInvoker<DeleteAlarmRuleRequest, DeleteAlarmRuleResponse> deleteAlarmRuleAsyncInvoker(DeleteAlarmRuleRequest request) {
        return new AsyncInvoker<DeleteAlarmRuleRequest, DeleteAlarmRuleResponse>(request, AomMeta.deleteAlarmRule, hcClient);
    }

    /**
     * 批量删除阈值规则
     *
     * 批量删除阈值规则
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteAlarmRulesRequest 请求对象
     * @return CompletableFuture<DeleteAlarmRulesResponse>
     */
    public CompletableFuture<DeleteAlarmRulesResponse> deleteAlarmRulesAsync(DeleteAlarmRulesRequest request) {
        return hcClient.asyncInvokeHttp(request, AomMeta.deleteAlarmRules);
    }

    /**
     * 批量删除阈值规则
     *
     * 批量删除阈值规则
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteAlarmRulesRequest 请求对象
     * @return AsyncInvoker<DeleteAlarmRulesRequest, DeleteAlarmRulesResponse>
     */
    public AsyncInvoker<DeleteAlarmRulesRequest, DeleteAlarmRulesResponse> deleteAlarmRulesAsyncInvoker(DeleteAlarmRulesRequest request) {
        return new AsyncInvoker<DeleteAlarmRulesRequest, DeleteAlarmRulesResponse>(request, AomMeta.deleteAlarmRules, hcClient);
    }

    /**
     * 删除服务发现规则
     *
     * 该接口用于删除服务发现规则。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteserviceDiscoveryRulesRequest 请求对象
     * @return CompletableFuture<DeleteserviceDiscoveryRulesResponse>
     */
    public CompletableFuture<DeleteserviceDiscoveryRulesResponse> deleteserviceDiscoveryRulesAsync(DeleteserviceDiscoveryRulesRequest request) {
        return hcClient.asyncInvokeHttp(request, AomMeta.deleteserviceDiscoveryRules);
    }

    /**
     * 删除服务发现规则
     *
     * 该接口用于删除服务发现规则。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteserviceDiscoveryRulesRequest 请求对象
     * @return AsyncInvoker<DeleteserviceDiscoveryRulesRequest, DeleteserviceDiscoveryRulesResponse>
     */
    public AsyncInvoker<DeleteserviceDiscoveryRulesRequest, DeleteserviceDiscoveryRulesResponse> deleteserviceDiscoveryRulesAsyncInvoker(DeleteserviceDiscoveryRulesRequest request) {
        return new AsyncInvoker<DeleteserviceDiscoveryRulesRequest, DeleteserviceDiscoveryRulesResponse>(request, AomMeta.deleteserviceDiscoveryRules, hcClient);
    }

    /**
     * 查询阈值规则列表
     *
     * 该接口用于查询阈值规则列表。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListAlarmRuleRequest 请求对象
     * @return CompletableFuture<ListAlarmRuleResponse>
     */
    public CompletableFuture<ListAlarmRuleResponse> listAlarmRuleAsync(ListAlarmRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, AomMeta.listAlarmRule);
    }

    /**
     * 查询阈值规则列表
     *
     * 该接口用于查询阈值规则列表。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListAlarmRuleRequest 请求对象
     * @return AsyncInvoker<ListAlarmRuleRequest, ListAlarmRuleResponse>
     */
    public AsyncInvoker<ListAlarmRuleRequest, ListAlarmRuleResponse> listAlarmRuleAsyncInvoker(ListAlarmRuleRequest request) {
        return new AsyncInvoker<ListAlarmRuleRequest, ListAlarmRuleResponse>(request, AomMeta.listAlarmRule, hcClient);
    }

    /**
     * 查询事件告警信息
     *
     * 该接口用于查询对应用户的事件、告警。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListEventsRequest 请求对象
     * @return CompletableFuture<ListEventsResponse>
     */
    public CompletableFuture<ListEventsResponse> listEventsAsync(ListEventsRequest request) {
        return hcClient.asyncInvokeHttp(request, AomMeta.listEvents);
    }

    /**
     * 查询事件告警信息
     *
     * 该接口用于查询对应用户的事件、告警。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListEventsRequest 请求对象
     * @return AsyncInvoker<ListEventsRequest, ListEventsResponse>
     */
    public AsyncInvoker<ListEventsRequest, ListEventsResponse> listEventsAsyncInvoker(ListEventsRequest request) {
        return new AsyncInvoker<ListEventsRequest, ListEventsResponse>(request, AomMeta.listEvents, hcClient);
    }

    /**
     * 查询日志
     *
     * 该接口用于查询不同维度(例如集群、IP、应用等)下的日志内容，支持分页查询。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListLogItemsRequest 请求对象
     * @return CompletableFuture<ListLogItemsResponse>
     */
    public CompletableFuture<ListLogItemsResponse> listLogItemsAsync(ListLogItemsRequest request) {
        return hcClient.asyncInvokeHttp(request, AomMeta.listLogItems);
    }

    /**
     * 查询日志
     *
     * 该接口用于查询不同维度(例如集群、IP、应用等)下的日志内容，支持分页查询。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListLogItemsRequest 请求对象
     * @return AsyncInvoker<ListLogItemsRequest, ListLogItemsResponse>
     */
    public AsyncInvoker<ListLogItemsRequest, ListLogItemsResponse> listLogItemsAsyncInvoker(ListLogItemsRequest request) {
        return new AsyncInvoker<ListLogItemsRequest, ListLogItemsResponse>(request, AomMeta.listLogItems, hcClient);
    }

    /**
     * 查询指标
     *
     * 该接口用于查询系统当前可监控的指标列表，可以指定指标命名空间、指标名称、维度、所属资源的编号（格式为：resType_resId），分页查询的起始位置和返回的最大记录条数。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListMetricItemsRequest 请求对象
     * @return CompletableFuture<ListMetricItemsResponse>
     */
    public CompletableFuture<ListMetricItemsResponse> listMetricItemsAsync(ListMetricItemsRequest request) {
        return hcClient.asyncInvokeHttp(request, AomMeta.listMetricItems);
    }

    /**
     * 查询指标
     *
     * 该接口用于查询系统当前可监控的指标列表，可以指定指标命名空间、指标名称、维度、所属资源的编号（格式为：resType_resId），分页查询的起始位置和返回的最大记录条数。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListMetricItemsRequest 请求对象
     * @return AsyncInvoker<ListMetricItemsRequest, ListMetricItemsResponse>
     */
    public AsyncInvoker<ListMetricItemsRequest, ListMetricItemsResponse> listMetricItemsAsyncInvoker(ListMetricItemsRequest request) {
        return new AsyncInvoker<ListMetricItemsRequest, ListMetricItemsResponse>(request, AomMeta.listMetricItems, hcClient);
    }

    /**
     * 查询时序数据
     *
     * 该接口用于查询指定时间范围内的监控时序数据，可以通过参数指定需要查询的数据维度，数据周期等。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListSampleRequest 请求对象
     * @return CompletableFuture<ListSampleResponse>
     */
    public CompletableFuture<ListSampleResponse> listSampleAsync(ListSampleRequest request) {
        return hcClient.asyncInvokeHttp(request, AomMeta.listSample);
    }

    /**
     * 查询时序数据
     *
     * 该接口用于查询指定时间范围内的监控时序数据，可以通过参数指定需要查询的数据维度，数据周期等。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListSampleRequest 请求对象
     * @return AsyncInvoker<ListSampleRequest, ListSampleResponse>
     */
    public AsyncInvoker<ListSampleRequest, ListSampleResponse> listSampleAsyncInvoker(ListSampleRequest request) {
        return new AsyncInvoker<ListSampleRequest, ListSampleResponse>(request, AomMeta.listSample, hcClient);
    }

    /**
     * 查询时间序列
     *
     * 该接口用于查询系统当前可监控的时间序列列表，可以指定时间序列命名空间、名称、维度、所属资源的编号（格式为：resType_resId），分页查询的起始位置和返回的最大记录条数。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListSeriesRequest 请求对象
     * @return CompletableFuture<ListSeriesResponse>
     */
    public CompletableFuture<ListSeriesResponse> listSeriesAsync(ListSeriesRequest request) {
        return hcClient.asyncInvokeHttp(request, AomMeta.listSeries);
    }

    /**
     * 查询时间序列
     *
     * 该接口用于查询系统当前可监控的时间序列列表，可以指定时间序列命名空间、名称、维度、所属资源的编号（格式为：resType_resId），分页查询的起始位置和返回的最大记录条数。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListSeriesRequest 请求对象
     * @return AsyncInvoker<ListSeriesRequest, ListSeriesResponse>
     */
    public AsyncInvoker<ListSeriesRequest, ListSeriesResponse> listSeriesAsyncInvoker(ListSeriesRequest request) {
        return new AsyncInvoker<ListSeriesRequest, ListSeriesResponse>(request, AomMeta.listSeries, hcClient);
    }

    /**
     * 查询系统中已有服务发现规则
     *
     * 该接口用于查询系统当前已存在的服务发现规则。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListServiceDiscoveryRulesRequest 请求对象
     * @return CompletableFuture<ListServiceDiscoveryRulesResponse>
     */
    public CompletableFuture<ListServiceDiscoveryRulesResponse> listServiceDiscoveryRulesAsync(ListServiceDiscoveryRulesRequest request) {
        return hcClient.asyncInvokeHttp(request, AomMeta.listServiceDiscoveryRules);
    }

    /**
     * 查询系统中已有服务发现规则
     *
     * 该接口用于查询系统当前已存在的服务发现规则。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListServiceDiscoveryRulesRequest 请求对象
     * @return AsyncInvoker<ListServiceDiscoveryRulesRequest, ListServiceDiscoveryRulesResponse>
     */
    public AsyncInvoker<ListServiceDiscoveryRulesRequest, ListServiceDiscoveryRulesResponse> listServiceDiscoveryRulesAsyncInvoker(ListServiceDiscoveryRulesRequest request) {
        return new AsyncInvoker<ListServiceDiscoveryRulesRequest, ListServiceDiscoveryRulesResponse>(request, AomMeta.listServiceDiscoveryRules, hcClient);
    }

    /**
     * 上报事件告警信息
     *
     * 该接口用于上报对应用户的事件、告警。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param PushEventsRequest 请求对象
     * @return CompletableFuture<PushEventsResponse>
     */
    public CompletableFuture<PushEventsResponse> pushEventsAsync(PushEventsRequest request) {
        return hcClient.asyncInvokeHttp(request, AomMeta.pushEvents);
    }

    /**
     * 上报事件告警信息
     *
     * 该接口用于上报对应用户的事件、告警。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param PushEventsRequest 请求对象
     * @return AsyncInvoker<PushEventsRequest, PushEventsResponse>
     */
    public AsyncInvoker<PushEventsRequest, PushEventsResponse> pushEventsAsyncInvoker(PushEventsRequest request) {
        return new AsyncInvoker<PushEventsRequest, PushEventsResponse>(request, AomMeta.pushEvents, hcClient);
    }

    /**
     * 查询单条阈值规则
     *
     * 该接口用于查询单条阈值规则。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowAlarmRuleRequest 请求对象
     * @return CompletableFuture<ShowAlarmRuleResponse>
     */
    public CompletableFuture<ShowAlarmRuleResponse> showAlarmRuleAsync(ShowAlarmRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, AomMeta.showAlarmRule);
    }

    /**
     * 查询单条阈值规则
     *
     * 该接口用于查询单条阈值规则。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowAlarmRuleRequest 请求对象
     * @return AsyncInvoker<ShowAlarmRuleRequest, ShowAlarmRuleResponse>
     */
    public AsyncInvoker<ShowAlarmRuleRequest, ShowAlarmRuleResponse> showAlarmRuleAsyncInvoker(ShowAlarmRuleRequest request) {
        return new AsyncInvoker<ShowAlarmRuleRequest, ShowAlarmRuleResponse>(request, AomMeta.showAlarmRule, hcClient);
    }

    /**
     * 查询监控数据
     *
     * 该接口用于查询指定时间范围内指标的监控数据，可以通过参数指定需要查询的数据维度，数据周期等。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowMetricsDataRequest 请求对象
     * @return CompletableFuture<ShowMetricsDataResponse>
     */
    public CompletableFuture<ShowMetricsDataResponse> showMetricsDataAsync(ShowMetricsDataRequest request) {
        return hcClient.asyncInvokeHttp(request, AomMeta.showMetricsData);
    }

    /**
     * 查询监控数据
     *
     * 该接口用于查询指定时间范围内指标的监控数据，可以通过参数指定需要查询的数据维度，数据周期等。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowMetricsDataRequest 请求对象
     * @return AsyncInvoker<ShowMetricsDataRequest, ShowMetricsDataResponse>
     */
    public AsyncInvoker<ShowMetricsDataRequest, ShowMetricsDataResponse> showMetricsDataAsyncInvoker(ShowMetricsDataRequest request) {
        return new AsyncInvoker<ShowMetricsDataRequest, ShowMetricsDataResponse>(request, AomMeta.showMetricsData, hcClient);
    }

    /**
     * 修改阈值规则
     *
     * 该接口用于修改一条阈值规则。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateAlarmRuleRequest 请求对象
     * @return CompletableFuture<UpdateAlarmRuleResponse>
     */
    public CompletableFuture<UpdateAlarmRuleResponse> updateAlarmRuleAsync(UpdateAlarmRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, AomMeta.updateAlarmRule);
    }

    /**
     * 修改阈值规则
     *
     * 该接口用于修改一条阈值规则。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateAlarmRuleRequest 请求对象
     * @return AsyncInvoker<UpdateAlarmRuleRequest, UpdateAlarmRuleResponse>
     */
    public AsyncInvoker<UpdateAlarmRuleRequest, UpdateAlarmRuleResponse> updateAlarmRuleAsyncInvoker(UpdateAlarmRuleRequest request) {
        return new AsyncInvoker<UpdateAlarmRuleRequest, UpdateAlarmRuleResponse>(request, AomMeta.updateAlarmRule, hcClient);
    }

    /**
     * 瞬时数据查询
     *
     * 该接口用于查询PromQL(Prometheus Query Language)。 在特定时间点下的计算结果。（注：接口目前开放的region为：北京四、上海一和广州）。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListInstantQueryAomPromGetRequest 请求对象
     * @return CompletableFuture<ListInstantQueryAomPromGetResponse>
     */
    public CompletableFuture<ListInstantQueryAomPromGetResponse> listInstantQueryAomPromGetAsync(ListInstantQueryAomPromGetRequest request) {
        return hcClient.asyncInvokeHttp(request, AomMeta.listInstantQueryAomPromGet);
    }

    /**
     * 瞬时数据查询
     *
     * 该接口用于查询PromQL(Prometheus Query Language)。 在特定时间点下的计算结果。（注：接口目前开放的region为：北京四、上海一和广州）。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListInstantQueryAomPromGetRequest 请求对象
     * @return AsyncInvoker<ListInstantQueryAomPromGetRequest, ListInstantQueryAomPromGetResponse>
     */
    public AsyncInvoker<ListInstantQueryAomPromGetRequest, ListInstantQueryAomPromGetResponse> listInstantQueryAomPromGetAsyncInvoker(ListInstantQueryAomPromGetRequest request) {
        return new AsyncInvoker<ListInstantQueryAomPromGetRequest, ListInstantQueryAomPromGetResponse>(request, AomMeta.listInstantQueryAomPromGet, hcClient);
    }

    /**
     * 瞬时数据查询
     *
     * 该接口用于查询PromQL(Prometheus Query Language) 在特定时间点下的计算结果。（注：接口目前开放的region为：北京四、上海一和广州）
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListInstantQueryAomPromPostRequest 请求对象
     * @return CompletableFuture<ListInstantQueryAomPromPostResponse>
     */
    public CompletableFuture<ListInstantQueryAomPromPostResponse> listInstantQueryAomPromPostAsync(ListInstantQueryAomPromPostRequest request) {
        return hcClient.asyncInvokeHttp(request, AomMeta.listInstantQueryAomPromPost);
    }

    /**
     * 瞬时数据查询
     *
     * 该接口用于查询PromQL(Prometheus Query Language) 在特定时间点下的计算结果。（注：接口目前开放的region为：北京四、上海一和广州）
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListInstantQueryAomPromPostRequest 请求对象
     * @return AsyncInvoker<ListInstantQueryAomPromPostRequest, ListInstantQueryAomPromPostResponse>
     */
    public AsyncInvoker<ListInstantQueryAomPromPostRequest, ListInstantQueryAomPromPostResponse> listInstantQueryAomPromPostAsyncInvoker(ListInstantQueryAomPromPostRequest request) {
        return new AsyncInvoker<ListInstantQueryAomPromPostRequest, ListInstantQueryAomPromPostResponse>(request, AomMeta.listInstantQueryAomPromPost, hcClient);
    }

    /**
     * 查询标签值
     *
     * 该接口用于查询带有指定标签的时间序列列表。（注：接口目前开放的region为：北京四、上海一和广州）。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListLabelValuesAomPromGetRequest 请求对象
     * @return CompletableFuture<ListLabelValuesAomPromGetResponse>
     */
    public CompletableFuture<ListLabelValuesAomPromGetResponse> listLabelValuesAomPromGetAsync(ListLabelValuesAomPromGetRequest request) {
        return hcClient.asyncInvokeHttp(request, AomMeta.listLabelValuesAomPromGet);
    }

    /**
     * 查询标签值
     *
     * 该接口用于查询带有指定标签的时间序列列表。（注：接口目前开放的region为：北京四、上海一和广州）。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListLabelValuesAomPromGetRequest 请求对象
     * @return AsyncInvoker<ListLabelValuesAomPromGetRequest, ListLabelValuesAomPromGetResponse>
     */
    public AsyncInvoker<ListLabelValuesAomPromGetRequest, ListLabelValuesAomPromGetResponse> listLabelValuesAomPromGetAsyncInvoker(ListLabelValuesAomPromGetRequest request) {
        return new AsyncInvoker<ListLabelValuesAomPromGetRequest, ListLabelValuesAomPromGetResponse>(request, AomMeta.listLabelValuesAomPromGet, hcClient);
    }

    /**
     * 获取标签名列表
     *
     * 该接口用于获取标签名列表。（注：接口目前开放的region为：北京四、上海一和广州）。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListLabelsAomPromGetRequest 请求对象
     * @return CompletableFuture<ListLabelsAomPromGetResponse>
     */
    public CompletableFuture<ListLabelsAomPromGetResponse> listLabelsAomPromGetAsync(ListLabelsAomPromGetRequest request) {
        return hcClient.asyncInvokeHttp(request, AomMeta.listLabelsAomPromGet);
    }

    /**
     * 获取标签名列表
     *
     * 该接口用于获取标签名列表。（注：接口目前开放的region为：北京四、上海一和广州）。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListLabelsAomPromGetRequest 请求对象
     * @return AsyncInvoker<ListLabelsAomPromGetRequest, ListLabelsAomPromGetResponse>
     */
    public AsyncInvoker<ListLabelsAomPromGetRequest, ListLabelsAomPromGetResponse> listLabelsAomPromGetAsyncInvoker(ListLabelsAomPromGetRequest request) {
        return new AsyncInvoker<ListLabelsAomPromGetRequest, ListLabelsAomPromGetResponse>(request, AomMeta.listLabelsAomPromGet, hcClient);
    }

    /**
     * 获取标签名列表
     *
     * 该接口用于获取标签名列表。（注：接口目前开放的region为：北京四、上海一和广州）。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListLabelsAomPromPostRequest 请求对象
     * @return CompletableFuture<ListLabelsAomPromPostResponse>
     */
    public CompletableFuture<ListLabelsAomPromPostResponse> listLabelsAomPromPostAsync(ListLabelsAomPromPostRequest request) {
        return hcClient.asyncInvokeHttp(request, AomMeta.listLabelsAomPromPost);
    }

    /**
     * 获取标签名列表
     *
     * 该接口用于获取标签名列表。（注：接口目前开放的region为：北京四、上海一和广州）。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListLabelsAomPromPostRequest 请求对象
     * @return AsyncInvoker<ListLabelsAomPromPostRequest, ListLabelsAomPromPostResponse>
     */
    public AsyncInvoker<ListLabelsAomPromPostRequest, ListLabelsAomPromPostResponse> listLabelsAomPromPostAsyncInvoker(ListLabelsAomPromPostRequest request) {
        return new AsyncInvoker<ListLabelsAomPromPostRequest, ListLabelsAomPromPostResponse>(request, AomMeta.listLabelsAomPromPost, hcClient);
    }

    /**
     * 元数据查询
     *
     * 该接口用于查询序列及序列标签的元数据。（注：接口目前开放的region为：北京四、上海一和广州）。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListMetadataAomPromGetRequest 请求对象
     * @return CompletableFuture<ListMetadataAomPromGetResponse>
     */
    public CompletableFuture<ListMetadataAomPromGetResponse> listMetadataAomPromGetAsync(ListMetadataAomPromGetRequest request) {
        return hcClient.asyncInvokeHttp(request, AomMeta.listMetadataAomPromGet);
    }

    /**
     * 元数据查询
     *
     * 该接口用于查询序列及序列标签的元数据。（注：接口目前开放的region为：北京四、上海一和广州）。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListMetadataAomPromGetRequest 请求对象
     * @return AsyncInvoker<ListMetadataAomPromGetRequest, ListMetadataAomPromGetResponse>
     */
    public AsyncInvoker<ListMetadataAomPromGetRequest, ListMetadataAomPromGetResponse> listMetadataAomPromGetAsyncInvoker(ListMetadataAomPromGetRequest request) {
        return new AsyncInvoker<ListMetadataAomPromGetRequest, ListMetadataAomPromGetResponse>(request, AomMeta.listMetadataAomPromGet, hcClient);
    }

    /**
     * 区间数据查询
     *
     * 该接口用于查询PromQL(Prometheus Query Language)在一段时间返回内的计算结果。（注：接口目前开放的region为：北京四、上海一和广州）。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListRangeQueryAomPromGetRequest 请求对象
     * @return CompletableFuture<ListRangeQueryAomPromGetResponse>
     */
    public CompletableFuture<ListRangeQueryAomPromGetResponse> listRangeQueryAomPromGetAsync(ListRangeQueryAomPromGetRequest request) {
        return hcClient.asyncInvokeHttp(request, AomMeta.listRangeQueryAomPromGet);
    }

    /**
     * 区间数据查询
     *
     * 该接口用于查询PromQL(Prometheus Query Language)在一段时间返回内的计算结果。（注：接口目前开放的region为：北京四、上海一和广州）。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListRangeQueryAomPromGetRequest 请求对象
     * @return AsyncInvoker<ListRangeQueryAomPromGetRequest, ListRangeQueryAomPromGetResponse>
     */
    public AsyncInvoker<ListRangeQueryAomPromGetRequest, ListRangeQueryAomPromGetResponse> listRangeQueryAomPromGetAsyncInvoker(ListRangeQueryAomPromGetRequest request) {
        return new AsyncInvoker<ListRangeQueryAomPromGetRequest, ListRangeQueryAomPromGetResponse>(request, AomMeta.listRangeQueryAomPromGet, hcClient);
    }

    /**
     * 区间数据查询
     *
     * 该接口用于查询PromQL(Prometheus Query Language)在一段时间返回内的计算结果。（注：接口目前开放的region为：北京四、上海一和广州）。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListRangeQueryAomPromPostRequest 请求对象
     * @return CompletableFuture<ListRangeQueryAomPromPostResponse>
     */
    public CompletableFuture<ListRangeQueryAomPromPostResponse> listRangeQueryAomPromPostAsync(ListRangeQueryAomPromPostRequest request) {
        return hcClient.asyncInvokeHttp(request, AomMeta.listRangeQueryAomPromPost);
    }

    /**
     * 区间数据查询
     *
     * 该接口用于查询PromQL(Prometheus Query Language)在一段时间返回内的计算结果。（注：接口目前开放的region为：北京四、上海一和广州）。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListRangeQueryAomPromPostRequest 请求对象
     * @return AsyncInvoker<ListRangeQueryAomPromPostRequest, ListRangeQueryAomPromPostResponse>
     */
    public AsyncInvoker<ListRangeQueryAomPromPostRequest, ListRangeQueryAomPromPostResponse> listRangeQueryAomPromPostAsyncInvoker(ListRangeQueryAomPromPostRequest request) {
        return new AsyncInvoker<ListRangeQueryAomPromPostRequest, ListRangeQueryAomPromPostResponse>(request, AomMeta.listRangeQueryAomPromPost, hcClient);
    }

}