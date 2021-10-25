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
     * 
     * 该接口用于添加一条阈值规则
     *
     * @param AddAlarmRuleRequest 请求对象
     * @return AddAlarmRuleResponse
     */
    public AddAlarmRuleResponse addAlarmRule(AddAlarmRuleRequest request) {
        return hcClient.syncInvokeHttp(request, AomMeta.addAlarmRule);
    }

    /**
     * 
     * 该接口用于添加一条阈值规则
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
     * 
     * 该接口用于删除阈值规则。
     *
     * @param DeleteAlarmRuleRequest 请求对象
     * @return DeleteAlarmRuleResponse
     */
    public DeleteAlarmRuleResponse deleteAlarmRule(DeleteAlarmRuleRequest request) {
        return hcClient.syncInvokeHttp(request, AomMeta.deleteAlarmRule);
    }

    /**
     * 
     * 该接口用于删除阈值规则。
     *
     * @param DeleteAlarmRuleRequest 请求对象
     * @return SyncInvoker<DeleteAlarmRuleRequest, DeleteAlarmRuleResponse>
     */
    public SyncInvoker<DeleteAlarmRuleRequest, DeleteAlarmRuleResponse> deleteAlarmRuleInvoker(DeleteAlarmRuleRequest request) {
        return new SyncInvoker<DeleteAlarmRuleRequest, DeleteAlarmRuleResponse>(request, AomMeta.deleteAlarmRule, hcClient);
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
     * 
     * 该接口用于查询阈值规则列表。
     *
     * @param ListAlarmRuleRequest 请求对象
     * @return ListAlarmRuleResponse
     */
    public ListAlarmRuleResponse listAlarmRule(ListAlarmRuleRequest request) {
        return hcClient.syncInvokeHttp(request, AomMeta.listAlarmRule);
    }

    /**
     * 
     * 该接口用于查询阈值规则列表。
     *
     * @param ListAlarmRuleRequest 请求对象
     * @return SyncInvoker<ListAlarmRuleRequest, ListAlarmRuleResponse>
     */
    public SyncInvoker<ListAlarmRuleRequest, ListAlarmRuleResponse> listAlarmRuleInvoker(ListAlarmRuleRequest request) {
        return new SyncInvoker<ListAlarmRuleRequest, ListAlarmRuleResponse>(request, AomMeta.listAlarmRule, hcClient);
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
     * 
     * 查询单条阈值规则
     *
     * @param ShowAlarmRuleRequest 请求对象
     * @return ShowAlarmRuleResponse
     */
    public ShowAlarmRuleResponse showAlarmRule(ShowAlarmRuleRequest request) {
        return hcClient.syncInvokeHttp(request, AomMeta.showAlarmRule);
    }

    /**
     * 
     * 查询单条阈值规则
     *
     * @param ShowAlarmRuleRequest 请求对象
     * @return SyncInvoker<ShowAlarmRuleRequest, ShowAlarmRuleResponse>
     */
    public SyncInvoker<ShowAlarmRuleRequest, ShowAlarmRuleResponse> showAlarmRuleInvoker(ShowAlarmRuleRequest request) {
        return new SyncInvoker<ShowAlarmRuleRequest, ShowAlarmRuleResponse>(request, AomMeta.showAlarmRule, hcClient);
    }

    /**
     * 
     * 修改阈值规则
     *
     * @param UpdateAlarmRuleRequest 请求对象
     * @return UpdateAlarmRuleResponse
     */
    public UpdateAlarmRuleResponse updateAlarmRule(UpdateAlarmRuleRequest request) {
        return hcClient.syncInvokeHttp(request, AomMeta.updateAlarmRule);
    }

    /**
     * 
     * 修改阈值规则
     *
     * @param UpdateAlarmRuleRequest 请求对象
     * @return SyncInvoker<UpdateAlarmRuleRequest, UpdateAlarmRuleResponse>
     */
    public SyncInvoker<UpdateAlarmRuleRequest, UpdateAlarmRuleResponse> updateAlarmRuleInvoker(UpdateAlarmRuleRequest request) {
        return new SyncInvoker<UpdateAlarmRuleRequest, UpdateAlarmRuleResponse>(request, AomMeta.updateAlarmRule, hcClient);
    }

}