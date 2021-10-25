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
     * 
     * 该接口用于添加一条阈值规则
     *
     * @param AddAlarmRuleRequest 请求对象
     * @return CompletableFuture<AddAlarmRuleResponse>
     */
    public CompletableFuture<AddAlarmRuleResponse> addAlarmRuleAsync(AddAlarmRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, AomMeta.addAlarmRule);
    }

    /**
     * 
     * 该接口用于添加一条阈值规则
     *
     * @param AddAlarmRuleRequest 请求对象
     * @return AsyncInvoker<AddAlarmRuleRequest, AddAlarmRuleResponse>
     */
    public AsyncInvoker<AddAlarmRuleRequest, AddAlarmRuleResponse> addAlarmRuleAsyncInvoker(AddAlarmRuleRequest request) {
        return new AsyncInvoker<AddAlarmRuleRequest, AddAlarmRuleResponse>(request, AomMeta.addAlarmRule, hcClient);
    }

    /**
     * 添加监控数据
     * 该接口用于向服务端添加一条或多条监控数据。
     *
     * @param AddMetricDataRequest 请求对象
     * @return CompletableFuture<AddMetricDataResponse>
     */
    public CompletableFuture<AddMetricDataResponse> addMetricDataAsync(AddMetricDataRequest request) {
        return hcClient.asyncInvokeHttp(request, AomMeta.addMetricData);
    }

    /**
     * 添加监控数据
     * 该接口用于向服务端添加一条或多条监控数据。
     *
     * @param AddMetricDataRequest 请求对象
     * @return AsyncInvoker<AddMetricDataRequest, AddMetricDataResponse>
     */
    public AsyncInvoker<AddMetricDataRequest, AddMetricDataResponse> addMetricDataAsyncInvoker(AddMetricDataRequest request) {
        return new AsyncInvoker<AddMetricDataRequest, AddMetricDataResponse>(request, AomMeta.addMetricData, hcClient);
    }

    /**
     * 
     * 该接口用于删除阈值规则。
     *
     * @param DeleteAlarmRuleRequest 请求对象
     * @return CompletableFuture<DeleteAlarmRuleResponse>
     */
    public CompletableFuture<DeleteAlarmRuleResponse> deleteAlarmRuleAsync(DeleteAlarmRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, AomMeta.deleteAlarmRule);
    }

    /**
     * 
     * 该接口用于删除阈值规则。
     *
     * @param DeleteAlarmRuleRequest 请求对象
     * @return AsyncInvoker<DeleteAlarmRuleRequest, DeleteAlarmRuleResponse>
     */
    public AsyncInvoker<DeleteAlarmRuleRequest, DeleteAlarmRuleResponse> deleteAlarmRuleAsyncInvoker(DeleteAlarmRuleRequest request) {
        return new AsyncInvoker<DeleteAlarmRuleRequest, DeleteAlarmRuleResponse>(request, AomMeta.deleteAlarmRule, hcClient);
    }

    /**
     * 删除服务发现规则
     * 该接口用于删除服务发现规则。
     *
     * @param DeleteserviceDiscoveryRulesRequest 请求对象
     * @return CompletableFuture<DeleteserviceDiscoveryRulesResponse>
     */
    public CompletableFuture<DeleteserviceDiscoveryRulesResponse> deleteserviceDiscoveryRulesAsync(DeleteserviceDiscoveryRulesRequest request) {
        return hcClient.asyncInvokeHttp(request, AomMeta.deleteserviceDiscoveryRules);
    }

    /**
     * 删除服务发现规则
     * 该接口用于删除服务发现规则。
     *
     * @param DeleteserviceDiscoveryRulesRequest 请求对象
     * @return AsyncInvoker<DeleteserviceDiscoveryRulesRequest, DeleteserviceDiscoveryRulesResponse>
     */
    public AsyncInvoker<DeleteserviceDiscoveryRulesRequest, DeleteserviceDiscoveryRulesResponse> deleteserviceDiscoveryRulesAsyncInvoker(DeleteserviceDiscoveryRulesRequest request) {
        return new AsyncInvoker<DeleteserviceDiscoveryRulesRequest, DeleteserviceDiscoveryRulesResponse>(request, AomMeta.deleteserviceDiscoveryRules, hcClient);
    }

    /**
     * 
     * 该接口用于查询阈值规则列表。
     *
     * @param ListAlarmRuleRequest 请求对象
     * @return CompletableFuture<ListAlarmRuleResponse>
     */
    public CompletableFuture<ListAlarmRuleResponse> listAlarmRuleAsync(ListAlarmRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, AomMeta.listAlarmRule);
    }

    /**
     * 
     * 该接口用于查询阈值规则列表。
     *
     * @param ListAlarmRuleRequest 请求对象
     * @return AsyncInvoker<ListAlarmRuleRequest, ListAlarmRuleResponse>
     */
    public AsyncInvoker<ListAlarmRuleRequest, ListAlarmRuleResponse> listAlarmRuleAsyncInvoker(ListAlarmRuleRequest request) {
        return new AsyncInvoker<ListAlarmRuleRequest, ListAlarmRuleResponse>(request, AomMeta.listAlarmRule, hcClient);
    }

    /**
     * 查询时序数据
     * 该接口用于查询指定时间范围内的监控时序数据，可以通过参数指定需要查询的数据维度，数据周期等。
     *
     * @param ListSampleRequest 请求对象
     * @return CompletableFuture<ListSampleResponse>
     */
    public CompletableFuture<ListSampleResponse> listSampleAsync(ListSampleRequest request) {
        return hcClient.asyncInvokeHttp(request, AomMeta.listSample);
    }

    /**
     * 查询时序数据
     * 该接口用于查询指定时间范围内的监控时序数据，可以通过参数指定需要查询的数据维度，数据周期等。
     *
     * @param ListSampleRequest 请求对象
     * @return AsyncInvoker<ListSampleRequest, ListSampleResponse>
     */
    public AsyncInvoker<ListSampleRequest, ListSampleResponse> listSampleAsyncInvoker(ListSampleRequest request) {
        return new AsyncInvoker<ListSampleRequest, ListSampleResponse>(request, AomMeta.listSample, hcClient);
    }

    /**
     * 查询时间序列
     * 该接口用于查询系统当前可监控的时间序列列表，可以指定时间序列命名空间、名称、维度、所属资源的编号（格式为：resType_resId），分页查询的起始位置和返回的最大记录条数。
     *
     * @param ListSeriesRequest 请求对象
     * @return CompletableFuture<ListSeriesResponse>
     */
    public CompletableFuture<ListSeriesResponse> listSeriesAsync(ListSeriesRequest request) {
        return hcClient.asyncInvokeHttp(request, AomMeta.listSeries);
    }

    /**
     * 查询时间序列
     * 该接口用于查询系统当前可监控的时间序列列表，可以指定时间序列命名空间、名称、维度、所属资源的编号（格式为：resType_resId），分页查询的起始位置和返回的最大记录条数。
     *
     * @param ListSeriesRequest 请求对象
     * @return AsyncInvoker<ListSeriesRequest, ListSeriesResponse>
     */
    public AsyncInvoker<ListSeriesRequest, ListSeriesResponse> listSeriesAsyncInvoker(ListSeriesRequest request) {
        return new AsyncInvoker<ListSeriesRequest, ListSeriesResponse>(request, AomMeta.listSeries, hcClient);
    }

    /**
     * 查询系统中已有服务发现规则
     * 该接口用于查询系统当前已存在的服务发现规则。
     *
     * @param ListServiceDiscoveryRulesRequest 请求对象
     * @return CompletableFuture<ListServiceDiscoveryRulesResponse>
     */
    public CompletableFuture<ListServiceDiscoveryRulesResponse> listServiceDiscoveryRulesAsync(ListServiceDiscoveryRulesRequest request) {
        return hcClient.asyncInvokeHttp(request, AomMeta.listServiceDiscoveryRules);
    }

    /**
     * 查询系统中已有服务发现规则
     * 该接口用于查询系统当前已存在的服务发现规则。
     *
     * @param ListServiceDiscoveryRulesRequest 请求对象
     * @return AsyncInvoker<ListServiceDiscoveryRulesRequest, ListServiceDiscoveryRulesResponse>
     */
    public AsyncInvoker<ListServiceDiscoveryRulesRequest, ListServiceDiscoveryRulesResponse> listServiceDiscoveryRulesAsyncInvoker(ListServiceDiscoveryRulesRequest request) {
        return new AsyncInvoker<ListServiceDiscoveryRulesRequest, ListServiceDiscoveryRulesResponse>(request, AomMeta.listServiceDiscoveryRules, hcClient);
    }

    /**
     * 
     * 查询单条阈值规则
     *
     * @param ShowAlarmRuleRequest 请求对象
     * @return CompletableFuture<ShowAlarmRuleResponse>
     */
    public CompletableFuture<ShowAlarmRuleResponse> showAlarmRuleAsync(ShowAlarmRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, AomMeta.showAlarmRule);
    }

    /**
     * 
     * 查询单条阈值规则
     *
     * @param ShowAlarmRuleRequest 请求对象
     * @return AsyncInvoker<ShowAlarmRuleRequest, ShowAlarmRuleResponse>
     */
    public AsyncInvoker<ShowAlarmRuleRequest, ShowAlarmRuleResponse> showAlarmRuleAsyncInvoker(ShowAlarmRuleRequest request) {
        return new AsyncInvoker<ShowAlarmRuleRequest, ShowAlarmRuleResponse>(request, AomMeta.showAlarmRule, hcClient);
    }

    /**
     * 
     * 修改阈值规则
     *
     * @param UpdateAlarmRuleRequest 请求对象
     * @return CompletableFuture<UpdateAlarmRuleResponse>
     */
    public CompletableFuture<UpdateAlarmRuleResponse> updateAlarmRuleAsync(UpdateAlarmRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, AomMeta.updateAlarmRule);
    }

    /**
     * 
     * 修改阈值规则
     *
     * @param UpdateAlarmRuleRequest 请求对象
     * @return AsyncInvoker<UpdateAlarmRuleRequest, UpdateAlarmRuleResponse>
     */
    public AsyncInvoker<UpdateAlarmRuleRequest, UpdateAlarmRuleResponse> updateAlarmRuleAsyncInvoker(UpdateAlarmRuleRequest request) {
        return new AsyncInvoker<UpdateAlarmRuleRequest, UpdateAlarmRuleResponse>(request, AomMeta.updateAlarmRule, hcClient);
    }

}