package com.huaweicloud.sdk.aom.v2;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.aom.v2.model.*;

public class AomClient {
    protected HcClient hcClient;

    public AomClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<AomClient> newBuilder() {
        return new ClientBuilder<>(AomClient::new);
    }


    /**
     * 添加阈值规则
     * 该接口用于添加一条阈值规则。
     *
     * @param AddAlarmRuleRequest 请求对象
     * @return AddAlarmRuleResponse
     */
    public AddAlarmRuleResponse addAlarmRule(AddAlarmRuleRequest request) {
        return hcClient.syncInvokeHttp(request, AomMeta.addAlarmRule);
    }

    /**
     * 添加阈值规则
     * 该接口用于添加一条阈值规则。
     *
     * @param AddAlarmRuleRequest 请求对象
     * @return SyncInvoker<AddAlarmRuleRequest, AddAlarmRuleResponse>
     */
    public SyncInvoker<AddAlarmRuleRequest, AddAlarmRuleResponse> addAlarmRuleInvoker(AddAlarmRuleRequest request) {
        return new SyncInvoker<AddAlarmRuleRequest, AddAlarmRuleResponse>(request, AomMeta.addAlarmRule, hcClient);
    }

    /**
     * 添加监控数据
     * 该接口用于向服务端添加一条或多条监控数据。
     *
     * @param AddMetricDataRequest 请求对象
     * @return AddMetricDataResponse
     */
    public AddMetricDataResponse addMetricData(AddMetricDataRequest request) {
        return hcClient.syncInvokeHttp(request, AomMeta.addMetricData);
    }

    /**
     * 添加监控数据
     * 该接口用于向服务端添加一条或多条监控数据。
     *
     * @param AddMetricDataRequest 请求对象
     * @return SyncInvoker<AddMetricDataRequest, AddMetricDataResponse>
     */
    public SyncInvoker<AddMetricDataRequest, AddMetricDataResponse> addMetricDataInvoker(AddMetricDataRequest request) {
        return new SyncInvoker<AddMetricDataRequest, AddMetricDataResponse>(request, AomMeta.addMetricData, hcClient);
    }

    /**
     * 添加或修改服务发现规则
     * 该接口用于添加或修改一条或多条服务发现规则。同一projectid下可添加的规则上限为100条。
     *
     * @param AddOrUpdateServiceDiscoveryRulesRequest 请求对象
     * @return AddOrUpdateServiceDiscoveryRulesResponse
     */
    public AddOrUpdateServiceDiscoveryRulesResponse addOrUpdateServiceDiscoveryRules(AddOrUpdateServiceDiscoveryRulesRequest request) {
        return hcClient.syncInvokeHttp(request, AomMeta.addOrUpdateServiceDiscoveryRules);
    }

    /**
     * 添加或修改服务发现规则
     * 该接口用于添加或修改一条或多条服务发现规则。同一projectid下可添加的规则上限为100条。
     *
     * @param AddOrUpdateServiceDiscoveryRulesRequest 请求对象
     * @return SyncInvoker<AddOrUpdateServiceDiscoveryRulesRequest, AddOrUpdateServiceDiscoveryRulesResponse>
     */
    public SyncInvoker<AddOrUpdateServiceDiscoveryRulesRequest, AddOrUpdateServiceDiscoveryRulesResponse> addOrUpdateServiceDiscoveryRulesInvoker(AddOrUpdateServiceDiscoveryRulesRequest request) {
        return new SyncInvoker<AddOrUpdateServiceDiscoveryRulesRequest, AddOrUpdateServiceDiscoveryRulesResponse>(request, AomMeta.addOrUpdateServiceDiscoveryRules, hcClient);
    }

    /**
     * 统计事件告警信息
     * 该接口用于分段统计指定条件下的事件、告警。
     *
     * @param CountEventsRequest 请求对象
     * @return CountEventsResponse
     */
    public CountEventsResponse countEvents(CountEventsRequest request) {
        return hcClient.syncInvokeHttp(request, AomMeta.countEvents);
    }

    /**
     * 统计事件告警信息
     * 该接口用于分段统计指定条件下的事件、告警。
     *
     * @param CountEventsRequest 请求对象
     * @return SyncInvoker<CountEventsRequest, CountEventsResponse>
     */
    public SyncInvoker<CountEventsRequest, CountEventsResponse> countEventsInvoker(CountEventsRequest request) {
        return new SyncInvoker<CountEventsRequest, CountEventsResponse>(request, AomMeta.countEvents, hcClient);
    }

    /**
     * 删除阈值规则
     * 该接口用于删除阈值规则。
     *
     * @param DeleteAlarmRuleRequest 请求对象
     * @return DeleteAlarmRuleResponse
     */
    public DeleteAlarmRuleResponse deleteAlarmRule(DeleteAlarmRuleRequest request) {
        return hcClient.syncInvokeHttp(request, AomMeta.deleteAlarmRule);
    }

    /**
     * 删除阈值规则
     * 该接口用于删除阈值规则。
     *
     * @param DeleteAlarmRuleRequest 请求对象
     * @return SyncInvoker<DeleteAlarmRuleRequest, DeleteAlarmRuleResponse>
     */
    public SyncInvoker<DeleteAlarmRuleRequest, DeleteAlarmRuleResponse> deleteAlarmRuleInvoker(DeleteAlarmRuleRequest request) {
        return new SyncInvoker<DeleteAlarmRuleRequest, DeleteAlarmRuleResponse>(request, AomMeta.deleteAlarmRule, hcClient);
    }

    /**
     * 批量删除阈值规则
     * 批量删除阈值规则
     *
     * @param DeleteAlarmRulesRequest 请求对象
     * @return DeleteAlarmRulesResponse
     */
    public DeleteAlarmRulesResponse deleteAlarmRules(DeleteAlarmRulesRequest request) {
        return hcClient.syncInvokeHttp(request, AomMeta.deleteAlarmRules);
    }

    /**
     * 批量删除阈值规则
     * 批量删除阈值规则
     *
     * @param DeleteAlarmRulesRequest 请求对象
     * @return SyncInvoker<DeleteAlarmRulesRequest, DeleteAlarmRulesResponse>
     */
    public SyncInvoker<DeleteAlarmRulesRequest, DeleteAlarmRulesResponse> deleteAlarmRulesInvoker(DeleteAlarmRulesRequest request) {
        return new SyncInvoker<DeleteAlarmRulesRequest, DeleteAlarmRulesResponse>(request, AomMeta.deleteAlarmRules, hcClient);
    }

    /**
     * 删除服务发现规则
     * 该接口用于删除服务发现规则。
     *
     * @param DeleteserviceDiscoveryRulesRequest 请求对象
     * @return DeleteserviceDiscoveryRulesResponse
     */
    public DeleteserviceDiscoveryRulesResponse deleteserviceDiscoveryRules(DeleteserviceDiscoveryRulesRequest request) {
        return hcClient.syncInvokeHttp(request, AomMeta.deleteserviceDiscoveryRules);
    }

    /**
     * 删除服务发现规则
     * 该接口用于删除服务发现规则。
     *
     * @param DeleteserviceDiscoveryRulesRequest 请求对象
     * @return SyncInvoker<DeleteserviceDiscoveryRulesRequest, DeleteserviceDiscoveryRulesResponse>
     */
    public SyncInvoker<DeleteserviceDiscoveryRulesRequest, DeleteserviceDiscoveryRulesResponse> deleteserviceDiscoveryRulesInvoker(DeleteserviceDiscoveryRulesRequest request) {
        return new SyncInvoker<DeleteserviceDiscoveryRulesRequest, DeleteserviceDiscoveryRulesResponse>(request, AomMeta.deleteserviceDiscoveryRules, hcClient);
    }

    /**
     * 查询阈值规则列表
     * 该接口用于查询阈值规则列表。
     *
     * @param ListAlarmRuleRequest 请求对象
     * @return ListAlarmRuleResponse
     */
    public ListAlarmRuleResponse listAlarmRule(ListAlarmRuleRequest request) {
        return hcClient.syncInvokeHttp(request, AomMeta.listAlarmRule);
    }

    /**
     * 查询阈值规则列表
     * 该接口用于查询阈值规则列表。
     *
     * @param ListAlarmRuleRequest 请求对象
     * @return SyncInvoker<ListAlarmRuleRequest, ListAlarmRuleResponse>
     */
    public SyncInvoker<ListAlarmRuleRequest, ListAlarmRuleResponse> listAlarmRuleInvoker(ListAlarmRuleRequest request) {
        return new SyncInvoker<ListAlarmRuleRequest, ListAlarmRuleResponse>(request, AomMeta.listAlarmRule, hcClient);
    }

    /**
     * 查询事件告警信息
     * 该接口用于查询对应用户的事件、告警。
     *
     * @param ListEventsRequest 请求对象
     * @return ListEventsResponse
     */
    public ListEventsResponse listEvents(ListEventsRequest request) {
        return hcClient.syncInvokeHttp(request, AomMeta.listEvents);
    }

    /**
     * 查询事件告警信息
     * 该接口用于查询对应用户的事件、告警。
     *
     * @param ListEventsRequest 请求对象
     * @return SyncInvoker<ListEventsRequest, ListEventsResponse>
     */
    public SyncInvoker<ListEventsRequest, ListEventsResponse> listEventsInvoker(ListEventsRequest request) {
        return new SyncInvoker<ListEventsRequest, ListEventsResponse>(request, AomMeta.listEvents, hcClient);
    }

    /**
     * 查询日志
     * 该接口用于查询不同维度(例如集群、IP、应用等)下的日志内容，支持分页查询。
     *
     * @param ListLogItemsRequest 请求对象
     * @return ListLogItemsResponse
     */
    public ListLogItemsResponse listLogItems(ListLogItemsRequest request) {
        return hcClient.syncInvokeHttp(request, AomMeta.listLogItems);
    }

    /**
     * 查询日志
     * 该接口用于查询不同维度(例如集群、IP、应用等)下的日志内容，支持分页查询。
     *
     * @param ListLogItemsRequest 请求对象
     * @return SyncInvoker<ListLogItemsRequest, ListLogItemsResponse>
     */
    public SyncInvoker<ListLogItemsRequest, ListLogItemsResponse> listLogItemsInvoker(ListLogItemsRequest request) {
        return new SyncInvoker<ListLogItemsRequest, ListLogItemsResponse>(request, AomMeta.listLogItems, hcClient);
    }

    /**
     * 查询指标
     * 该接口用于查询系统当前可监控的指标列表，可以指定指标命名空间、指标名称、维度、所属资源的编号（格式为：resType_resId），分页查询的起始位置和返回的最大记录条数。
     *
     * @param ListMetricItemsRequest 请求对象
     * @return ListMetricItemsResponse
     */
    public ListMetricItemsResponse listMetricItems(ListMetricItemsRequest request) {
        return hcClient.syncInvokeHttp(request, AomMeta.listMetricItems);
    }

    /**
     * 查询指标
     * 该接口用于查询系统当前可监控的指标列表，可以指定指标命名空间、指标名称、维度、所属资源的编号（格式为：resType_resId），分页查询的起始位置和返回的最大记录条数。
     *
     * @param ListMetricItemsRequest 请求对象
     * @return SyncInvoker<ListMetricItemsRequest, ListMetricItemsResponse>
     */
    public SyncInvoker<ListMetricItemsRequest, ListMetricItemsResponse> listMetricItemsInvoker(ListMetricItemsRequest request) {
        return new SyncInvoker<ListMetricItemsRequest, ListMetricItemsResponse>(request, AomMeta.listMetricItems, hcClient);
    }

    /**
     * 查询时序数据
     * 该接口用于查询指定时间范围内的监控时序数据，可以通过参数指定需要查询的数据维度，数据周期等。
     *
     * @param ListSampleRequest 请求对象
     * @return ListSampleResponse
     */
    public ListSampleResponse listSample(ListSampleRequest request) {
        return hcClient.syncInvokeHttp(request, AomMeta.listSample);
    }

    /**
     * 查询时序数据
     * 该接口用于查询指定时间范围内的监控时序数据，可以通过参数指定需要查询的数据维度，数据周期等。
     *
     * @param ListSampleRequest 请求对象
     * @return SyncInvoker<ListSampleRequest, ListSampleResponse>
     */
    public SyncInvoker<ListSampleRequest, ListSampleResponse> listSampleInvoker(ListSampleRequest request) {
        return new SyncInvoker<ListSampleRequest, ListSampleResponse>(request, AomMeta.listSample, hcClient);
    }

    /**
     * 查询时间序列
     * 该接口用于查询系统当前可监控的时间序列列表，可以指定时间序列命名空间、名称、维度、所属资源的编号（格式为：resType_resId），分页查询的起始位置和返回的最大记录条数。
     *
     * @param ListSeriesRequest 请求对象
     * @return ListSeriesResponse
     */
    public ListSeriesResponse listSeries(ListSeriesRequest request) {
        return hcClient.syncInvokeHttp(request, AomMeta.listSeries);
    }

    /**
     * 查询时间序列
     * 该接口用于查询系统当前可监控的时间序列列表，可以指定时间序列命名空间、名称、维度、所属资源的编号（格式为：resType_resId），分页查询的起始位置和返回的最大记录条数。
     *
     * @param ListSeriesRequest 请求对象
     * @return SyncInvoker<ListSeriesRequest, ListSeriesResponse>
     */
    public SyncInvoker<ListSeriesRequest, ListSeriesResponse> listSeriesInvoker(ListSeriesRequest request) {
        return new SyncInvoker<ListSeriesRequest, ListSeriesResponse>(request, AomMeta.listSeries, hcClient);
    }

    /**
     * 查询系统中已有服务发现规则
     * 该接口用于查询系统当前已存在的服务发现规则。
     *
     * @param ListServiceDiscoveryRulesRequest 请求对象
     * @return ListServiceDiscoveryRulesResponse
     */
    public ListServiceDiscoveryRulesResponse listServiceDiscoveryRules(ListServiceDiscoveryRulesRequest request) {
        return hcClient.syncInvokeHttp(request, AomMeta.listServiceDiscoveryRules);
    }

    /**
     * 查询系统中已有服务发现规则
     * 该接口用于查询系统当前已存在的服务发现规则。
     *
     * @param ListServiceDiscoveryRulesRequest 请求对象
     * @return SyncInvoker<ListServiceDiscoveryRulesRequest, ListServiceDiscoveryRulesResponse>
     */
    public SyncInvoker<ListServiceDiscoveryRulesRequest, ListServiceDiscoveryRulesResponse> listServiceDiscoveryRulesInvoker(ListServiceDiscoveryRulesRequest request) {
        return new SyncInvoker<ListServiceDiscoveryRulesRequest, ListServiceDiscoveryRulesResponse>(request, AomMeta.listServiceDiscoveryRules, hcClient);
    }

    /**
     * 上报事件告警信息
     * 该接口用于上报对应用户的事件、告警。
     *
     * @param PushEventsRequest 请求对象
     * @return PushEventsResponse
     */
    public PushEventsResponse pushEvents(PushEventsRequest request) {
        return hcClient.syncInvokeHttp(request, AomMeta.pushEvents);
    }

    /**
     * 上报事件告警信息
     * 该接口用于上报对应用户的事件、告警。
     *
     * @param PushEventsRequest 请求对象
     * @return SyncInvoker<PushEventsRequest, PushEventsResponse>
     */
    public SyncInvoker<PushEventsRequest, PushEventsResponse> pushEventsInvoker(PushEventsRequest request) {
        return new SyncInvoker<PushEventsRequest, PushEventsResponse>(request, AomMeta.pushEvents, hcClient);
    }

    /**
     * 查询单条阈值规则
     * 该接口用于查询单条阈值规则。
     *
     * @param ShowAlarmRuleRequest 请求对象
     * @return ShowAlarmRuleResponse
     */
    public ShowAlarmRuleResponse showAlarmRule(ShowAlarmRuleRequest request) {
        return hcClient.syncInvokeHttp(request, AomMeta.showAlarmRule);
    }

    /**
     * 查询单条阈值规则
     * 该接口用于查询单条阈值规则。
     *
     * @param ShowAlarmRuleRequest 请求对象
     * @return SyncInvoker<ShowAlarmRuleRequest, ShowAlarmRuleResponse>
     */
    public SyncInvoker<ShowAlarmRuleRequest, ShowAlarmRuleResponse> showAlarmRuleInvoker(ShowAlarmRuleRequest request) {
        return new SyncInvoker<ShowAlarmRuleRequest, ShowAlarmRuleResponse>(request, AomMeta.showAlarmRule, hcClient);
    }

    /**
     * 查询监控数据
     * 该接口用于查询指定时间范围内指标的监控数据，可以通过参数指定需要查询的数据维度，数据周期等。
     *
     * @param ShowMetricsDataRequest 请求对象
     * @return ShowMetricsDataResponse
     */
    public ShowMetricsDataResponse showMetricsData(ShowMetricsDataRequest request) {
        return hcClient.syncInvokeHttp(request, AomMeta.showMetricsData);
    }

    /**
     * 查询监控数据
     * 该接口用于查询指定时间范围内指标的监控数据，可以通过参数指定需要查询的数据维度，数据周期等。
     *
     * @param ShowMetricsDataRequest 请求对象
     * @return SyncInvoker<ShowMetricsDataRequest, ShowMetricsDataResponse>
     */
    public SyncInvoker<ShowMetricsDataRequest, ShowMetricsDataResponse> showMetricsDataInvoker(ShowMetricsDataRequest request) {
        return new SyncInvoker<ShowMetricsDataRequest, ShowMetricsDataResponse>(request, AomMeta.showMetricsData, hcClient);
    }

    /**
     * 修改阈值规则
     * 该接口用于修改一条阈值规则。
     *
     * @param UpdateAlarmRuleRequest 请求对象
     * @return UpdateAlarmRuleResponse
     */
    public UpdateAlarmRuleResponse updateAlarmRule(UpdateAlarmRuleRequest request) {
        return hcClient.syncInvokeHttp(request, AomMeta.updateAlarmRule);
    }

    /**
     * 修改阈值规则
     * 该接口用于修改一条阈值规则。
     *
     * @param UpdateAlarmRuleRequest 请求对象
     * @return SyncInvoker<UpdateAlarmRuleRequest, UpdateAlarmRuleResponse>
     */
    public SyncInvoker<UpdateAlarmRuleRequest, UpdateAlarmRuleResponse> updateAlarmRuleInvoker(UpdateAlarmRuleRequest request) {
        return new SyncInvoker<UpdateAlarmRuleRequest, UpdateAlarmRuleResponse>(request, AomMeta.updateAlarmRule, hcClient);
    }

    /**
     * 瞬时数据查询
     * 该接口用于查询PromQL(Prometheus Query Language)。 在特定时间点下的计算结果。（注：接口目前开放的region为：北京四、上海一和广州）。
     *
     * @param ListInstantQueryAomPromGetRequest 请求对象
     * @return ListInstantQueryAomPromGetResponse
     */
    public ListInstantQueryAomPromGetResponse listInstantQueryAomPromGet(ListInstantQueryAomPromGetRequest request) {
        return hcClient.syncInvokeHttp(request, AomMeta.listInstantQueryAomPromGet);
    }

    /**
     * 瞬时数据查询
     * 该接口用于查询PromQL(Prometheus Query Language)。 在特定时间点下的计算结果。（注：接口目前开放的region为：北京四、上海一和广州）。
     *
     * @param ListInstantQueryAomPromGetRequest 请求对象
     * @return SyncInvoker<ListInstantQueryAomPromGetRequest, ListInstantQueryAomPromGetResponse>
     */
    public SyncInvoker<ListInstantQueryAomPromGetRequest, ListInstantQueryAomPromGetResponse> listInstantQueryAomPromGetInvoker(ListInstantQueryAomPromGetRequest request) {
        return new SyncInvoker<ListInstantQueryAomPromGetRequest, ListInstantQueryAomPromGetResponse>(request, AomMeta.listInstantQueryAomPromGet, hcClient);
    }

    /**
     * 瞬时数据查询
     * 该接口用于查询PromQL(Prometheus Query Language) 在特定时间点下的计算结果。（注：接口目前开放的region为：北京四、上海一和广州）
     *
     * @param ListInstantQueryAomPromPostRequest 请求对象
     * @return ListInstantQueryAomPromPostResponse
     */
    public ListInstantQueryAomPromPostResponse listInstantQueryAomPromPost(ListInstantQueryAomPromPostRequest request) {
        return hcClient.syncInvokeHttp(request, AomMeta.listInstantQueryAomPromPost);
    }

    /**
     * 瞬时数据查询
     * 该接口用于查询PromQL(Prometheus Query Language) 在特定时间点下的计算结果。（注：接口目前开放的region为：北京四、上海一和广州）
     *
     * @param ListInstantQueryAomPromPostRequest 请求对象
     * @return SyncInvoker<ListInstantQueryAomPromPostRequest, ListInstantQueryAomPromPostResponse>
     */
    public SyncInvoker<ListInstantQueryAomPromPostRequest, ListInstantQueryAomPromPostResponse> listInstantQueryAomPromPostInvoker(ListInstantQueryAomPromPostRequest request) {
        return new SyncInvoker<ListInstantQueryAomPromPostRequest, ListInstantQueryAomPromPostResponse>(request, AomMeta.listInstantQueryAomPromPost, hcClient);
    }

    /**
     * 查询标签值
     * 该接口用于查询带有指定标签的时间序列列表。（注：接口目前开放的region为：北京四、上海一和广州）。
     *
     * @param ListLabelValuesAomPromGetRequest 请求对象
     * @return ListLabelValuesAomPromGetResponse
     */
    public ListLabelValuesAomPromGetResponse listLabelValuesAomPromGet(ListLabelValuesAomPromGetRequest request) {
        return hcClient.syncInvokeHttp(request, AomMeta.listLabelValuesAomPromGet);
    }

    /**
     * 查询标签值
     * 该接口用于查询带有指定标签的时间序列列表。（注：接口目前开放的region为：北京四、上海一和广州）。
     *
     * @param ListLabelValuesAomPromGetRequest 请求对象
     * @return SyncInvoker<ListLabelValuesAomPromGetRequest, ListLabelValuesAomPromGetResponse>
     */
    public SyncInvoker<ListLabelValuesAomPromGetRequest, ListLabelValuesAomPromGetResponse> listLabelValuesAomPromGetInvoker(ListLabelValuesAomPromGetRequest request) {
        return new SyncInvoker<ListLabelValuesAomPromGetRequest, ListLabelValuesAomPromGetResponse>(request, AomMeta.listLabelValuesAomPromGet, hcClient);
    }

    /**
     * 获取标签名列表
     * 该接口用于获取标签名列表。（注：接口目前开放的region为：北京四、上海一和广州）。
     *
     * @param ListLabelsAomPromGetRequest 请求对象
     * @return ListLabelsAomPromGetResponse
     */
    public ListLabelsAomPromGetResponse listLabelsAomPromGet(ListLabelsAomPromGetRequest request) {
        return hcClient.syncInvokeHttp(request, AomMeta.listLabelsAomPromGet);
    }

    /**
     * 获取标签名列表
     * 该接口用于获取标签名列表。（注：接口目前开放的region为：北京四、上海一和广州）。
     *
     * @param ListLabelsAomPromGetRequest 请求对象
     * @return SyncInvoker<ListLabelsAomPromGetRequest, ListLabelsAomPromGetResponse>
     */
    public SyncInvoker<ListLabelsAomPromGetRequest, ListLabelsAomPromGetResponse> listLabelsAomPromGetInvoker(ListLabelsAomPromGetRequest request) {
        return new SyncInvoker<ListLabelsAomPromGetRequest, ListLabelsAomPromGetResponse>(request, AomMeta.listLabelsAomPromGet, hcClient);
    }

    /**
     * 获取标签名列表
     * 该接口用于获取标签名列表。（注：接口目前开放的region为：北京四、上海一和广州）。
     *
     * @param ListLabelsAomPromPostRequest 请求对象
     * @return ListLabelsAomPromPostResponse
     */
    public ListLabelsAomPromPostResponse listLabelsAomPromPost(ListLabelsAomPromPostRequest request) {
        return hcClient.syncInvokeHttp(request, AomMeta.listLabelsAomPromPost);
    }

    /**
     * 获取标签名列表
     * 该接口用于获取标签名列表。（注：接口目前开放的region为：北京四、上海一和广州）。
     *
     * @param ListLabelsAomPromPostRequest 请求对象
     * @return SyncInvoker<ListLabelsAomPromPostRequest, ListLabelsAomPromPostResponse>
     */
    public SyncInvoker<ListLabelsAomPromPostRequest, ListLabelsAomPromPostResponse> listLabelsAomPromPostInvoker(ListLabelsAomPromPostRequest request) {
        return new SyncInvoker<ListLabelsAomPromPostRequest, ListLabelsAomPromPostResponse>(request, AomMeta.listLabelsAomPromPost, hcClient);
    }

    /**
     * 元数据查询
     * 该接口用于查询序列及序列标签的元数据。（注：接口目前开放的region为：北京四、上海一和广州）。
     *
     * @param ListMetadataAomPromGetRequest 请求对象
     * @return ListMetadataAomPromGetResponse
     */
    public ListMetadataAomPromGetResponse listMetadataAomPromGet(ListMetadataAomPromGetRequest request) {
        return hcClient.syncInvokeHttp(request, AomMeta.listMetadataAomPromGet);
    }

    /**
     * 元数据查询
     * 该接口用于查询序列及序列标签的元数据。（注：接口目前开放的region为：北京四、上海一和广州）。
     *
     * @param ListMetadataAomPromGetRequest 请求对象
     * @return SyncInvoker<ListMetadataAomPromGetRequest, ListMetadataAomPromGetResponse>
     */
    public SyncInvoker<ListMetadataAomPromGetRequest, ListMetadataAomPromGetResponse> listMetadataAomPromGetInvoker(ListMetadataAomPromGetRequest request) {
        return new SyncInvoker<ListMetadataAomPromGetRequest, ListMetadataAomPromGetResponse>(request, AomMeta.listMetadataAomPromGet, hcClient);
    }

    /**
     * 区间数据查询
     * 该接口用于查询PromQL(Prometheus Query Language)在一段时间返回内的计算结果。（注：接口目前开放的region为：北京四、上海一和广州）。
     *
     * @param ListRangeQueryAomPromGetRequest 请求对象
     * @return ListRangeQueryAomPromGetResponse
     */
    public ListRangeQueryAomPromGetResponse listRangeQueryAomPromGet(ListRangeQueryAomPromGetRequest request) {
        return hcClient.syncInvokeHttp(request, AomMeta.listRangeQueryAomPromGet);
    }

    /**
     * 区间数据查询
     * 该接口用于查询PromQL(Prometheus Query Language)在一段时间返回内的计算结果。（注：接口目前开放的region为：北京四、上海一和广州）。
     *
     * @param ListRangeQueryAomPromGetRequest 请求对象
     * @return SyncInvoker<ListRangeQueryAomPromGetRequest, ListRangeQueryAomPromGetResponse>
     */
    public SyncInvoker<ListRangeQueryAomPromGetRequest, ListRangeQueryAomPromGetResponse> listRangeQueryAomPromGetInvoker(ListRangeQueryAomPromGetRequest request) {
        return new SyncInvoker<ListRangeQueryAomPromGetRequest, ListRangeQueryAomPromGetResponse>(request, AomMeta.listRangeQueryAomPromGet, hcClient);
    }

    /**
     * 区间数据查询
     * 该接口用于查询PromQL(Prometheus Query Language)在一段时间返回内的计算结果。（注：接口目前开放的region为：北京四、上海一和广州）。
     *
     * @param ListRangeQueryAomPromPostRequest 请求对象
     * @return ListRangeQueryAomPromPostResponse
     */
    public ListRangeQueryAomPromPostResponse listRangeQueryAomPromPost(ListRangeQueryAomPromPostRequest request) {
        return hcClient.syncInvokeHttp(request, AomMeta.listRangeQueryAomPromPost);
    }

    /**
     * 区间数据查询
     * 该接口用于查询PromQL(Prometheus Query Language)在一段时间返回内的计算结果。（注：接口目前开放的region为：北京四、上海一和广州）。
     *
     * @param ListRangeQueryAomPromPostRequest 请求对象
     * @return SyncInvoker<ListRangeQueryAomPromPostRequest, ListRangeQueryAomPromPostResponse>
     */
    public SyncInvoker<ListRangeQueryAomPromPostRequest, ListRangeQueryAomPromPostResponse> listRangeQueryAomPromPostInvoker(ListRangeQueryAomPromPostRequest request) {
        return new SyncInvoker<ListRangeQueryAomPromPostRequest, ListRangeQueryAomPromPostResponse>(request, AomMeta.listRangeQueryAomPromPost, hcClient);
    }

}