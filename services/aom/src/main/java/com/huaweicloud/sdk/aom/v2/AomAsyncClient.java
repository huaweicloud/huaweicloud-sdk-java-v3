package com.huaweicloud.sdk.aom.v2;

import com.huaweicloud.sdk.aom.v2.model.AddActionRuleRequest;
import com.huaweicloud.sdk.aom.v2.model.AddActionRuleResponse;
import com.huaweicloud.sdk.aom.v2.model.AddAlarmRuleRequest;
import com.huaweicloud.sdk.aom.v2.model.AddAlarmRuleResponse;
import com.huaweicloud.sdk.aom.v2.model.AddEvent2alarmRuleRequest;
import com.huaweicloud.sdk.aom.v2.model.AddEvent2alarmRuleResponse;
import com.huaweicloud.sdk.aom.v2.model.AddMetricDataRequest;
import com.huaweicloud.sdk.aom.v2.model.AddMetricDataResponse;
import com.huaweicloud.sdk.aom.v2.model.AddMuteRulesRequest;
import com.huaweicloud.sdk.aom.v2.model.AddMuteRulesResponse;
import com.huaweicloud.sdk.aom.v2.model.AddOrUpdateMetricOrEventAlarmRuleRequest;
import com.huaweicloud.sdk.aom.v2.model.AddOrUpdateMetricOrEventAlarmRuleResponse;
import com.huaweicloud.sdk.aom.v2.model.AddOrUpdateServiceDiscoveryRulesRequest;
import com.huaweicloud.sdk.aom.v2.model.AddOrUpdateServiceDiscoveryRulesResponse;
import com.huaweicloud.sdk.aom.v2.model.CountEventsRequest;
import com.huaweicloud.sdk.aom.v2.model.CountEventsResponse;
import com.huaweicloud.sdk.aom.v2.model.CreatePromInstanceRequest;
import com.huaweicloud.sdk.aom.v2.model.CreatePromInstanceResponse;
import com.huaweicloud.sdk.aom.v2.model.CreateRecordingRuleRequest;
import com.huaweicloud.sdk.aom.v2.model.CreateRecordingRuleResponse;
import com.huaweicloud.sdk.aom.v2.model.DeleteActionRuleRequest;
import com.huaweicloud.sdk.aom.v2.model.DeleteActionRuleResponse;
import com.huaweicloud.sdk.aom.v2.model.DeleteAlarmRuleRequest;
import com.huaweicloud.sdk.aom.v2.model.DeleteAlarmRuleResponse;
import com.huaweicloud.sdk.aom.v2.model.DeleteAlarmRulesRequest;
import com.huaweicloud.sdk.aom.v2.model.DeleteAlarmRulesResponse;
import com.huaweicloud.sdk.aom.v2.model.DeleteEvent2alarmRuleRequest;
import com.huaweicloud.sdk.aom.v2.model.DeleteEvent2alarmRuleResponse;
import com.huaweicloud.sdk.aom.v2.model.DeleteMetricOrEventAlarmRuleRequest;
import com.huaweicloud.sdk.aom.v2.model.DeleteMetricOrEventAlarmRuleResponse;
import com.huaweicloud.sdk.aom.v2.model.DeleteMuteRulesRequest;
import com.huaweicloud.sdk.aom.v2.model.DeleteMuteRulesResponse;
import com.huaweicloud.sdk.aom.v2.model.DeletePromInstanceRequest;
import com.huaweicloud.sdk.aom.v2.model.DeletePromInstanceResponse;
import com.huaweicloud.sdk.aom.v2.model.DeleteserviceDiscoveryRulesRequest;
import com.huaweicloud.sdk.aom.v2.model.DeleteserviceDiscoveryRulesResponse;
import com.huaweicloud.sdk.aom.v2.model.ListAccessCodeRequest;
import com.huaweicloud.sdk.aom.v2.model.ListAccessCodeResponse;
import com.huaweicloud.sdk.aom.v2.model.ListActionRuleRequest;
import com.huaweicloud.sdk.aom.v2.model.ListActionRuleResponse;
import com.huaweicloud.sdk.aom.v2.model.ListAgentsRequest;
import com.huaweicloud.sdk.aom.v2.model.ListAgentsResponse;
import com.huaweicloud.sdk.aom.v2.model.ListAlarmRuleRequest;
import com.huaweicloud.sdk.aom.v2.model.ListAlarmRuleResponse;
import com.huaweicloud.sdk.aom.v2.model.ListEvent2alarmRuleRequest;
import com.huaweicloud.sdk.aom.v2.model.ListEvent2alarmRuleResponse;
import com.huaweicloud.sdk.aom.v2.model.ListEventsRequest;
import com.huaweicloud.sdk.aom.v2.model.ListEventsResponse;
import com.huaweicloud.sdk.aom.v2.model.ListInstantQueryAomPromGetRequest;
import com.huaweicloud.sdk.aom.v2.model.ListInstantQueryAomPromGetResponse;
import com.huaweicloud.sdk.aom.v2.model.ListInstantQueryAomPromPostRequest;
import com.huaweicloud.sdk.aom.v2.model.ListInstantQueryAomPromPostResponse;
import com.huaweicloud.sdk.aom.v2.model.ListLabelValuesAomPromGetRequest;
import com.huaweicloud.sdk.aom.v2.model.ListLabelValuesAomPromGetResponse;
import com.huaweicloud.sdk.aom.v2.model.ListLabelsAomPromGetRequest;
import com.huaweicloud.sdk.aom.v2.model.ListLabelsAomPromGetResponse;
import com.huaweicloud.sdk.aom.v2.model.ListLabelsAomPromPostRequest;
import com.huaweicloud.sdk.aom.v2.model.ListLabelsAomPromPostResponse;
import com.huaweicloud.sdk.aom.v2.model.ListLogItemsRequest;
import com.huaweicloud.sdk.aom.v2.model.ListLogItemsResponse;
import com.huaweicloud.sdk.aom.v2.model.ListMetadataAomPromGetRequest;
import com.huaweicloud.sdk.aom.v2.model.ListMetadataAomPromGetResponse;
import com.huaweicloud.sdk.aom.v2.model.ListMetricItemsRequest;
import com.huaweicloud.sdk.aom.v2.model.ListMetricItemsResponse;
import com.huaweicloud.sdk.aom.v2.model.ListMetricOrEventAlarmRuleRequest;
import com.huaweicloud.sdk.aom.v2.model.ListMetricOrEventAlarmRuleResponse;
import com.huaweicloud.sdk.aom.v2.model.ListMuteRuleRequest;
import com.huaweicloud.sdk.aom.v2.model.ListMuteRuleResponse;
import com.huaweicloud.sdk.aom.v2.model.ListNotifiedHistoriesRequest;
import com.huaweicloud.sdk.aom.v2.model.ListNotifiedHistoriesResponse;
import com.huaweicloud.sdk.aom.v2.model.ListPermissionsRequest;
import com.huaweicloud.sdk.aom.v2.model.ListPermissionsResponse;
import com.huaweicloud.sdk.aom.v2.model.ListPromInstanceRequest;
import com.huaweicloud.sdk.aom.v2.model.ListPromInstanceResponse;
import com.huaweicloud.sdk.aom.v2.model.ListRangeQueryAomPromGetRequest;
import com.huaweicloud.sdk.aom.v2.model.ListRangeQueryAomPromGetResponse;
import com.huaweicloud.sdk.aom.v2.model.ListRangeQueryAomPromPostRequest;
import com.huaweicloud.sdk.aom.v2.model.ListRangeQueryAomPromPostResponse;
import com.huaweicloud.sdk.aom.v2.model.ListSampleRequest;
import com.huaweicloud.sdk.aom.v2.model.ListSampleResponse;
import com.huaweicloud.sdk.aom.v2.model.ListSeriesRequest;
import com.huaweicloud.sdk.aom.v2.model.ListSeriesResponse;
import com.huaweicloud.sdk.aom.v2.model.ListServiceDiscoveryRulesRequest;
import com.huaweicloud.sdk.aom.v2.model.ListServiceDiscoveryRulesResponse;
import com.huaweicloud.sdk.aom.v2.model.PushEventsRequest;
import com.huaweicloud.sdk.aom.v2.model.PushEventsResponse;
import com.huaweicloud.sdk.aom.v2.model.ShowActionRuleRequest;
import com.huaweicloud.sdk.aom.v2.model.ShowActionRuleResponse;
import com.huaweicloud.sdk.aom.v2.model.ShowAlarmRuleRequest;
import com.huaweicloud.sdk.aom.v2.model.ShowAlarmRuleResponse;
import com.huaweicloud.sdk.aom.v2.model.ShowMetricsDataRequest;
import com.huaweicloud.sdk.aom.v2.model.ShowMetricsDataResponse;
import com.huaweicloud.sdk.aom.v2.model.UpdateActionRuleRequest;
import com.huaweicloud.sdk.aom.v2.model.UpdateActionRuleResponse;
import com.huaweicloud.sdk.aom.v2.model.UpdateAlarmRuleRequest;
import com.huaweicloud.sdk.aom.v2.model.UpdateAlarmRuleResponse;
import com.huaweicloud.sdk.aom.v2.model.UpdateEventRuleRequest;
import com.huaweicloud.sdk.aom.v2.model.UpdateEventRuleResponse;
import com.huaweicloud.sdk.aom.v2.model.UpdateMuteRuleRequest;
import com.huaweicloud.sdk.aom.v2.model.UpdateMuteRuleResponse;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;

import java.util.concurrent.CompletableFuture;

public class AomAsyncClient {

    protected HcClient hcClient;

    public AomAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<AomAsyncClient> newBuilder() {
        ClientBuilder<AomAsyncClient> clientBuilder = new ClientBuilder<>(AomAsyncClient::new);
        return clientBuilder;
    }

    /**
     * 新增告警行动规则
     *
     * 新增告警行动规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddActionRuleRequest 请求对象
     * @return CompletableFuture<AddActionRuleResponse>
     */
    public CompletableFuture<AddActionRuleResponse> addActionRuleAsync(AddActionRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, AomMeta.addActionRule);
    }

    /**
     * 新增告警行动规则
     *
     * 新增告警行动规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddActionRuleRequest 请求对象
     * @return AsyncInvoker<AddActionRuleRequest, AddActionRuleResponse>
     */
    public AsyncInvoker<AddActionRuleRequest, AddActionRuleResponse> addActionRuleAsyncInvoker(
        AddActionRuleRequest request) {
        return new AsyncInvoker<>(request, AomMeta.addActionRule, hcClient);
    }

    /**
     * 添加阈值规则
     *
     * 该接口用于添加一条阈值规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddAlarmRuleRequest 请求对象
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
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddAlarmRuleRequest 请求对象
     * @return AsyncInvoker<AddAlarmRuleRequest, AddAlarmRuleResponse>
     */
    public AsyncInvoker<AddAlarmRuleRequest, AddAlarmRuleResponse> addAlarmRuleAsyncInvoker(
        AddAlarmRuleRequest request) {
        return new AsyncInvoker<>(request, AomMeta.addAlarmRule, hcClient);
    }

    /**
     * 新增一条事件类告警规则
     *
     * 新增一条事件类告警规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddEvent2alarmRuleRequest 请求对象
     * @return CompletableFuture<AddEvent2alarmRuleResponse>
     */
    public CompletableFuture<AddEvent2alarmRuleResponse> addEvent2alarmRuleAsync(AddEvent2alarmRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, AomMeta.addEvent2alarmRule);
    }

    /**
     * 新增一条事件类告警规则
     *
     * 新增一条事件类告警规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddEvent2alarmRuleRequest 请求对象
     * @return AsyncInvoker<AddEvent2alarmRuleRequest, AddEvent2alarmRuleResponse>
     */
    public AsyncInvoker<AddEvent2alarmRuleRequest, AddEvent2alarmRuleResponse> addEvent2alarmRuleAsyncInvoker(
        AddEvent2alarmRuleRequest request) {
        return new AsyncInvoker<>(request, AomMeta.addEvent2alarmRule, hcClient);
    }

    /**
     * 添加监控数据
     *
     * 该接口用于向服务端添加一条或多条监控数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddMetricDataRequest 请求对象
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
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddMetricDataRequest 请求对象
     * @return AsyncInvoker<AddMetricDataRequest, AddMetricDataResponse>
     */
    public AsyncInvoker<AddMetricDataRequest, AddMetricDataResponse> addMetricDataAsyncInvoker(
        AddMetricDataRequest request) {
        return new AsyncInvoker<>(request, AomMeta.addMetricData, hcClient);
    }

    /**
     * 新增静默规则
     *
     * 新增静默规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddMuteRulesRequest 请求对象
     * @return CompletableFuture<AddMuteRulesResponse>
     */
    public CompletableFuture<AddMuteRulesResponse> addMuteRulesAsync(AddMuteRulesRequest request) {
        return hcClient.asyncInvokeHttp(request, AomMeta.addMuteRules);
    }

    /**
     * 新增静默规则
     *
     * 新增静默规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddMuteRulesRequest 请求对象
     * @return AsyncInvoker<AddMuteRulesRequest, AddMuteRulesResponse>
     */
    public AsyncInvoker<AddMuteRulesRequest, AddMuteRulesResponse> addMuteRulesAsyncInvoker(
        AddMuteRulesRequest request) {
        return new AsyncInvoker<>(request, AomMeta.addMuteRules, hcClient);
    }

    /**
     * 添加或修改指标类或事件类告警规则
     *
     * 添加或修改AOM2.0指标类或事件类告警规则。(注：接口目前开放的region为：华东-上海一)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddOrUpdateMetricOrEventAlarmRuleRequest 请求对象
     * @return CompletableFuture<AddOrUpdateMetricOrEventAlarmRuleResponse>
     */
    public CompletableFuture<AddOrUpdateMetricOrEventAlarmRuleResponse> addOrUpdateMetricOrEventAlarmRuleAsync(
        AddOrUpdateMetricOrEventAlarmRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, AomMeta.addOrUpdateMetricOrEventAlarmRule);
    }

    /**
     * 添加或修改指标类或事件类告警规则
     *
     * 添加或修改AOM2.0指标类或事件类告警规则。(注：接口目前开放的region为：华东-上海一)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddOrUpdateMetricOrEventAlarmRuleRequest 请求对象
     * @return AsyncInvoker<AddOrUpdateMetricOrEventAlarmRuleRequest, AddOrUpdateMetricOrEventAlarmRuleResponse>
     */
    public AsyncInvoker<AddOrUpdateMetricOrEventAlarmRuleRequest, AddOrUpdateMetricOrEventAlarmRuleResponse> addOrUpdateMetricOrEventAlarmRuleAsyncInvoker(
        AddOrUpdateMetricOrEventAlarmRuleRequest request) {
        return new AsyncInvoker<>(request, AomMeta.addOrUpdateMetricOrEventAlarmRule, hcClient);
    }

    /**
     * 添加或修改服务发现规则
     *
     * 该接口用于添加或修改一条或多条服务发现规则。同一projectid下可添加的规则上限为100条。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddOrUpdateServiceDiscoveryRulesRequest 请求对象
     * @return CompletableFuture<AddOrUpdateServiceDiscoveryRulesResponse>
     */
    public CompletableFuture<AddOrUpdateServiceDiscoveryRulesResponse> addOrUpdateServiceDiscoveryRulesAsync(
        AddOrUpdateServiceDiscoveryRulesRequest request) {
        return hcClient.asyncInvokeHttp(request, AomMeta.addOrUpdateServiceDiscoveryRules);
    }

    /**
     * 添加或修改服务发现规则
     *
     * 该接口用于添加或修改一条或多条服务发现规则。同一projectid下可添加的规则上限为100条。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddOrUpdateServiceDiscoveryRulesRequest 请求对象
     * @return AsyncInvoker<AddOrUpdateServiceDiscoveryRulesRequest, AddOrUpdateServiceDiscoveryRulesResponse>
     */
    public AsyncInvoker<AddOrUpdateServiceDiscoveryRulesRequest, AddOrUpdateServiceDiscoveryRulesResponse> addOrUpdateServiceDiscoveryRulesAsyncInvoker(
        AddOrUpdateServiceDiscoveryRulesRequest request) {
        return new AsyncInvoker<>(request, AomMeta.addOrUpdateServiceDiscoveryRules, hcClient);
    }

    /**
     * 统计事件告警信息
     *
     * 该接口用于分段统计指定条件下的事件、告警。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CountEventsRequest 请求对象
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
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CountEventsRequest 请求对象
     * @return AsyncInvoker<CountEventsRequest, CountEventsResponse>
     */
    public AsyncInvoker<CountEventsRequest, CountEventsResponse> countEventsAsyncInvoker(CountEventsRequest request) {
        return new AsyncInvoker<>(request, AomMeta.countEvents, hcClient);
    }

    /**
     * 删除告警行动规则
     *
     * 删除告警行动规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteActionRuleRequest 请求对象
     * @return CompletableFuture<DeleteActionRuleResponse>
     */
    public CompletableFuture<DeleteActionRuleResponse> deleteActionRuleAsync(DeleteActionRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, AomMeta.deleteActionRule);
    }

    /**
     * 删除告警行动规则
     *
     * 删除告警行动规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteActionRuleRequest 请求对象
     * @return AsyncInvoker<DeleteActionRuleRequest, DeleteActionRuleResponse>
     */
    public AsyncInvoker<DeleteActionRuleRequest, DeleteActionRuleResponse> deleteActionRuleAsyncInvoker(
        DeleteActionRuleRequest request) {
        return new AsyncInvoker<>(request, AomMeta.deleteActionRule, hcClient);
    }

    /**
     * 删除阈值规则
     *
     * 该接口用于删除阈值规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAlarmRuleRequest 请求对象
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
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAlarmRuleRequest 请求对象
     * @return AsyncInvoker<DeleteAlarmRuleRequest, DeleteAlarmRuleResponse>
     */
    public AsyncInvoker<DeleteAlarmRuleRequest, DeleteAlarmRuleResponse> deleteAlarmRuleAsyncInvoker(
        DeleteAlarmRuleRequest request) {
        return new AsyncInvoker<>(request, AomMeta.deleteAlarmRule, hcClient);
    }

    /**
     * 批量删除阈值规则
     *
     * 该接口用于批量删除阈值规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAlarmRulesRequest 请求对象
     * @return CompletableFuture<DeleteAlarmRulesResponse>
     */
    public CompletableFuture<DeleteAlarmRulesResponse> deleteAlarmRulesAsync(DeleteAlarmRulesRequest request) {
        return hcClient.asyncInvokeHttp(request, AomMeta.deleteAlarmRules);
    }

    /**
     * 批量删除阈值规则
     *
     * 该接口用于批量删除阈值规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAlarmRulesRequest 请求对象
     * @return AsyncInvoker<DeleteAlarmRulesRequest, DeleteAlarmRulesResponse>
     */
    public AsyncInvoker<DeleteAlarmRulesRequest, DeleteAlarmRulesResponse> deleteAlarmRulesAsyncInvoker(
        DeleteAlarmRulesRequest request) {
        return new AsyncInvoker<>(request, AomMeta.deleteAlarmRules, hcClient);
    }

    /**
     * 删除事件类告警规则
     *
     * 删除一条事件类告警规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteEvent2alarmRuleRequest 请求对象
     * @return CompletableFuture<DeleteEvent2alarmRuleResponse>
     */
    public CompletableFuture<DeleteEvent2alarmRuleResponse> deleteEvent2alarmRuleAsync(
        DeleteEvent2alarmRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, AomMeta.deleteEvent2alarmRule);
    }

    /**
     * 删除事件类告警规则
     *
     * 删除一条事件类告警规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteEvent2alarmRuleRequest 请求对象
     * @return AsyncInvoker<DeleteEvent2alarmRuleRequest, DeleteEvent2alarmRuleResponse>
     */
    public AsyncInvoker<DeleteEvent2alarmRuleRequest, DeleteEvent2alarmRuleResponse> deleteEvent2alarmRuleAsyncInvoker(
        DeleteEvent2alarmRuleRequest request) {
        return new AsyncInvoker<>(request, AomMeta.deleteEvent2alarmRule, hcClient);
    }

    /**
     * 删除指标类或事件类告警规则
     *
     * 删除AOM2.0指标类或事件类告警规则。(注：接口目前开放的region为：华东-上海一)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteMetricOrEventAlarmRuleRequest 请求对象
     * @return CompletableFuture<DeleteMetricOrEventAlarmRuleResponse>
     */
    public CompletableFuture<DeleteMetricOrEventAlarmRuleResponse> deleteMetricOrEventAlarmRuleAsync(
        DeleteMetricOrEventAlarmRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, AomMeta.deleteMetricOrEventAlarmRule);
    }

    /**
     * 删除指标类或事件类告警规则
     *
     * 删除AOM2.0指标类或事件类告警规则。(注：接口目前开放的region为：华东-上海一)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteMetricOrEventAlarmRuleRequest 请求对象
     * @return AsyncInvoker<DeleteMetricOrEventAlarmRuleRequest, DeleteMetricOrEventAlarmRuleResponse>
     */
    public AsyncInvoker<DeleteMetricOrEventAlarmRuleRequest, DeleteMetricOrEventAlarmRuleResponse> deleteMetricOrEventAlarmRuleAsyncInvoker(
        DeleteMetricOrEventAlarmRuleRequest request) {
        return new AsyncInvoker<>(request, AomMeta.deleteMetricOrEventAlarmRule, hcClient);
    }

    /**
     * 删除静默规则
     *
     * 删除静默规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteMuteRulesRequest 请求对象
     * @return CompletableFuture<DeleteMuteRulesResponse>
     */
    public CompletableFuture<DeleteMuteRulesResponse> deleteMuteRulesAsync(DeleteMuteRulesRequest request) {
        return hcClient.asyncInvokeHttp(request, AomMeta.deleteMuteRules);
    }

    /**
     * 删除静默规则
     *
     * 删除静默规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteMuteRulesRequest 请求对象
     * @return AsyncInvoker<DeleteMuteRulesRequest, DeleteMuteRulesResponse>
     */
    public AsyncInvoker<DeleteMuteRulesRequest, DeleteMuteRulesResponse> deleteMuteRulesAsyncInvoker(
        DeleteMuteRulesRequest request) {
        return new AsyncInvoker<>(request, AomMeta.deleteMuteRules, hcClient);
    }

    /**
     * 删除服务发现规则
     *
     * 该接口用于删除服务发现规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteserviceDiscoveryRulesRequest 请求对象
     * @return CompletableFuture<DeleteserviceDiscoveryRulesResponse>
     */
    public CompletableFuture<DeleteserviceDiscoveryRulesResponse> deleteserviceDiscoveryRulesAsync(
        DeleteserviceDiscoveryRulesRequest request) {
        return hcClient.asyncInvokeHttp(request, AomMeta.deleteserviceDiscoveryRules);
    }

    /**
     * 删除服务发现规则
     *
     * 该接口用于删除服务发现规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteserviceDiscoveryRulesRequest 请求对象
     * @return AsyncInvoker<DeleteserviceDiscoveryRulesRequest, DeleteserviceDiscoveryRulesResponse>
     */
    public AsyncInvoker<DeleteserviceDiscoveryRulesRequest, DeleteserviceDiscoveryRulesResponse> deleteserviceDiscoveryRulesAsyncInvoker(
        DeleteserviceDiscoveryRulesRequest request) {
        return new AsyncInvoker<>(request, AomMeta.deleteserviceDiscoveryRules, hcClient);
    }

    /**
     * 获取告警行动规则列表
     *
     * 获取告警行动规则列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListActionRuleRequest 请求对象
     * @return CompletableFuture<ListActionRuleResponse>
     */
    public CompletableFuture<ListActionRuleResponse> listActionRuleAsync(ListActionRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, AomMeta.listActionRule);
    }

    /**
     * 获取告警行动规则列表
     *
     * 获取告警行动规则列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListActionRuleRequest 请求对象
     * @return AsyncInvoker<ListActionRuleRequest, ListActionRuleResponse>
     */
    public AsyncInvoker<ListActionRuleRequest, ListActionRuleResponse> listActionRuleAsyncInvoker(
        ListActionRuleRequest request) {
        return new AsyncInvoker<>(request, AomMeta.listActionRule, hcClient);
    }

    /**
     * 查询主机安装的ICAgent信息
     *
     * 该接口用于查询集群主机或用户自定义主机安装的ICAgent信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAgentsRequest 请求对象
     * @return CompletableFuture<ListAgentsResponse>
     */
    public CompletableFuture<ListAgentsResponse> listAgentsAsync(ListAgentsRequest request) {
        return hcClient.asyncInvokeHttp(request, AomMeta.listAgents);
    }

    /**
     * 查询主机安装的ICAgent信息
     *
     * 该接口用于查询集群主机或用户自定义主机安装的ICAgent信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAgentsRequest 请求对象
     * @return AsyncInvoker<ListAgentsRequest, ListAgentsResponse>
     */
    public AsyncInvoker<ListAgentsRequest, ListAgentsResponse> listAgentsAsyncInvoker(ListAgentsRequest request) {
        return new AsyncInvoker<>(request, AomMeta.listAgents, hcClient);
    }

    /**
     * 查询阈值规则列表
     *
     * 该接口用于查询阈值规则列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAlarmRuleRequest 请求对象
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
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAlarmRuleRequest 请求对象
     * @return AsyncInvoker<ListAlarmRuleRequest, ListAlarmRuleResponse>
     */
    public AsyncInvoker<ListAlarmRuleRequest, ListAlarmRuleResponse> listAlarmRuleAsyncInvoker(
        ListAlarmRuleRequest request) {
        return new AsyncInvoker<>(request, AomMeta.listAlarmRule, hcClient);
    }

    /**
     * 查询事件类告警规则列表
     *
     * 查询事件类告警规则列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEvent2alarmRuleRequest 请求对象
     * @return CompletableFuture<ListEvent2alarmRuleResponse>
     */
    public CompletableFuture<ListEvent2alarmRuleResponse> listEvent2alarmRuleAsync(ListEvent2alarmRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, AomMeta.listEvent2alarmRule);
    }

    /**
     * 查询事件类告警规则列表
     *
     * 查询事件类告警规则列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEvent2alarmRuleRequest 请求对象
     * @return AsyncInvoker<ListEvent2alarmRuleRequest, ListEvent2alarmRuleResponse>
     */
    public AsyncInvoker<ListEvent2alarmRuleRequest, ListEvent2alarmRuleResponse> listEvent2alarmRuleAsyncInvoker(
        ListEvent2alarmRuleRequest request) {
        return new AsyncInvoker<>(request, AomMeta.listEvent2alarmRule, hcClient);
    }

    /**
     * 查询事件告警信息
     *
     * 该接口用于查询对应用户的事件、告警。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEventsRequest 请求对象
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
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEventsRequest 请求对象
     * @return AsyncInvoker<ListEventsRequest, ListEventsResponse>
     */
    public AsyncInvoker<ListEventsRequest, ListEventsResponse> listEventsAsyncInvoker(ListEventsRequest request) {
        return new AsyncInvoker<>(request, AomMeta.listEvents, hcClient);
    }

    /**
     * 查询日志
     *
     * 该接口用于查询不同维度(例如集群、IP、应用等)下的日志内容，支持分页查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLogItemsRequest 请求对象
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
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLogItemsRequest 请求对象
     * @return AsyncInvoker<ListLogItemsRequest, ListLogItemsResponse>
     */
    public AsyncInvoker<ListLogItemsRequest, ListLogItemsResponse> listLogItemsAsyncInvoker(
        ListLogItemsRequest request) {
        return new AsyncInvoker<>(request, AomMeta.listLogItems, hcClient);
    }

    /**
     * 查询指标
     *
     * 该接口用于查询系统当前可监控的指标列表，可以指定指标命名空间、指标名称、维度、所属资源的编号（格式为：resType_resId），分页查询的起始位置和返回的最大记录条数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMetricItemsRequest 请求对象
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
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMetricItemsRequest 请求对象
     * @return AsyncInvoker<ListMetricItemsRequest, ListMetricItemsResponse>
     */
    public AsyncInvoker<ListMetricItemsRequest, ListMetricItemsResponse> listMetricItemsAsyncInvoker(
        ListMetricItemsRequest request) {
        return new AsyncInvoker<>(request, AomMeta.listMetricItems, hcClient);
    }

    /**
     * 查询指标类或者事件类告警规则列表
     *
     * 查询AOM2.0指标类或者事件类告警规则列表。(注：接口目前开放的region为：华东-上海一)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMetricOrEventAlarmRuleRequest 请求对象
     * @return CompletableFuture<ListMetricOrEventAlarmRuleResponse>
     */
    public CompletableFuture<ListMetricOrEventAlarmRuleResponse> listMetricOrEventAlarmRuleAsync(
        ListMetricOrEventAlarmRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, AomMeta.listMetricOrEventAlarmRule);
    }

    /**
     * 查询指标类或者事件类告警规则列表
     *
     * 查询AOM2.0指标类或者事件类告警规则列表。(注：接口目前开放的region为：华东-上海一)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMetricOrEventAlarmRuleRequest 请求对象
     * @return AsyncInvoker<ListMetricOrEventAlarmRuleRequest, ListMetricOrEventAlarmRuleResponse>
     */
    public AsyncInvoker<ListMetricOrEventAlarmRuleRequest, ListMetricOrEventAlarmRuleResponse> listMetricOrEventAlarmRuleAsyncInvoker(
        ListMetricOrEventAlarmRuleRequest request) {
        return new AsyncInvoker<>(request, AomMeta.listMetricOrEventAlarmRule, hcClient);
    }

    /**
     * 获取静默规则列表
     *
     * 获取静默规则列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMuteRuleRequest 请求对象
     * @return CompletableFuture<ListMuteRuleResponse>
     */
    public CompletableFuture<ListMuteRuleResponse> listMuteRuleAsync(ListMuteRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, AomMeta.listMuteRule);
    }

    /**
     * 获取静默规则列表
     *
     * 获取静默规则列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMuteRuleRequest 请求对象
     * @return AsyncInvoker<ListMuteRuleRequest, ListMuteRuleResponse>
     */
    public AsyncInvoker<ListMuteRuleRequest, ListMuteRuleResponse> listMuteRuleAsyncInvoker(
        ListMuteRuleRequest request) {
        return new AsyncInvoker<>(request, AomMeta.listMuteRule, hcClient);
    }

    /**
     * 获取告警发送结果
     *
     * 获取告警发送结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListNotifiedHistoriesRequest 请求对象
     * @return CompletableFuture<ListNotifiedHistoriesResponse>
     */
    public CompletableFuture<ListNotifiedHistoriesResponse> listNotifiedHistoriesAsync(
        ListNotifiedHistoriesRequest request) {
        return hcClient.asyncInvokeHttp(request, AomMeta.listNotifiedHistories);
    }

    /**
     * 获取告警发送结果
     *
     * 获取告警发送结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListNotifiedHistoriesRequest 请求对象
     * @return AsyncInvoker<ListNotifiedHistoriesRequest, ListNotifiedHistoriesResponse>
     */
    public AsyncInvoker<ListNotifiedHistoriesRequest, ListNotifiedHistoriesResponse> listNotifiedHistoriesAsyncInvoker(
        ListNotifiedHistoriesRequest request) {
        return new AsyncInvoker<>(request, AomMeta.listNotifiedHistories, hcClient);
    }

    /**
     * 查询aom2.0相关云服务授权信息
     *
     * 该接口用于查询aom2.0相关云服务授权信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPermissionsRequest 请求对象
     * @return CompletableFuture<ListPermissionsResponse>
     */
    public CompletableFuture<ListPermissionsResponse> listPermissionsAsync(ListPermissionsRequest request) {
        return hcClient.asyncInvokeHttp(request, AomMeta.listPermissions);
    }

    /**
     * 查询aom2.0相关云服务授权信息
     *
     * 该接口用于查询aom2.0相关云服务授权信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPermissionsRequest 请求对象
     * @return AsyncInvoker<ListPermissionsRequest, ListPermissionsResponse>
     */
    public AsyncInvoker<ListPermissionsRequest, ListPermissionsResponse> listPermissionsAsyncInvoker(
        ListPermissionsRequest request) {
        return new AsyncInvoker<>(request, AomMeta.listPermissions, hcClient);
    }

    /**
     * 查询时序数据
     *
     * 该接口用于查询指定时间范围内的监控时序数据，可以通过参数指定需要查询的数据维度，数据周期等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSampleRequest 请求对象
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
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSampleRequest 请求对象
     * @return AsyncInvoker<ListSampleRequest, ListSampleResponse>
     */
    public AsyncInvoker<ListSampleRequest, ListSampleResponse> listSampleAsyncInvoker(ListSampleRequest request) {
        return new AsyncInvoker<>(request, AomMeta.listSample, hcClient);
    }

    /**
     * 查询时间序列
     *
     * 该接口用于查询系统当前可监控的时间序列列表，可以指定时间序列命名空间、名称、维度、所属资源的编号（格式为：resType_resId），分页查询的起始位置和返回的最大记录条数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSeriesRequest 请求对象
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
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSeriesRequest 请求对象
     * @return AsyncInvoker<ListSeriesRequest, ListSeriesResponse>
     */
    public AsyncInvoker<ListSeriesRequest, ListSeriesResponse> listSeriesAsyncInvoker(ListSeriesRequest request) {
        return new AsyncInvoker<>(request, AomMeta.listSeries, hcClient);
    }

    /**
     * 查询系统中已有服务发现规则
     *
     * 该接口用于查询系统当前已存在的服务发现规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListServiceDiscoveryRulesRequest 请求对象
     * @return CompletableFuture<ListServiceDiscoveryRulesResponse>
     */
    public CompletableFuture<ListServiceDiscoveryRulesResponse> listServiceDiscoveryRulesAsync(
        ListServiceDiscoveryRulesRequest request) {
        return hcClient.asyncInvokeHttp(request, AomMeta.listServiceDiscoveryRules);
    }

    /**
     * 查询系统中已有服务发现规则
     *
     * 该接口用于查询系统当前已存在的服务发现规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListServiceDiscoveryRulesRequest 请求对象
     * @return AsyncInvoker<ListServiceDiscoveryRulesRequest, ListServiceDiscoveryRulesResponse>
     */
    public AsyncInvoker<ListServiceDiscoveryRulesRequest, ListServiceDiscoveryRulesResponse> listServiceDiscoveryRulesAsyncInvoker(
        ListServiceDiscoveryRulesRequest request) {
        return new AsyncInvoker<>(request, AomMeta.listServiceDiscoveryRules, hcClient);
    }

    /**
     * 上报事件告警信息
     *
     * 该接口用于上报对应用户的事件、告警。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request PushEventsRequest 请求对象
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
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request PushEventsRequest 请求对象
     * @return AsyncInvoker<PushEventsRequest, PushEventsResponse>
     */
    public AsyncInvoker<PushEventsRequest, PushEventsResponse> pushEventsAsyncInvoker(PushEventsRequest request) {
        return new AsyncInvoker<>(request, AomMeta.pushEvents, hcClient);
    }

    /**
     * 通过规则名称获取告警行动规则
     *
     * 通过规则名称获取告警行动规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowActionRuleRequest 请求对象
     * @return CompletableFuture<ShowActionRuleResponse>
     */
    public CompletableFuture<ShowActionRuleResponse> showActionRuleAsync(ShowActionRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, AomMeta.showActionRule);
    }

    /**
     * 通过规则名称获取告警行动规则
     *
     * 通过规则名称获取告警行动规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowActionRuleRequest 请求对象
     * @return AsyncInvoker<ShowActionRuleRequest, ShowActionRuleResponse>
     */
    public AsyncInvoker<ShowActionRuleRequest, ShowActionRuleResponse> showActionRuleAsyncInvoker(
        ShowActionRuleRequest request) {
        return new AsyncInvoker<>(request, AomMeta.showActionRule, hcClient);
    }

    /**
     * 查询单条阈值规则
     *
     * 该接口用于查询单条阈值规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAlarmRuleRequest 请求对象
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
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAlarmRuleRequest 请求对象
     * @return AsyncInvoker<ShowAlarmRuleRequest, ShowAlarmRuleResponse>
     */
    public AsyncInvoker<ShowAlarmRuleRequest, ShowAlarmRuleResponse> showAlarmRuleAsyncInvoker(
        ShowAlarmRuleRequest request) {
        return new AsyncInvoker<>(request, AomMeta.showAlarmRule, hcClient);
    }

    /**
     * 查询监控数据
     *
     * 该接口用于查询指定时间范围内指标的监控数据，可以通过参数指定需要查询的数据维度，数据周期等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMetricsDataRequest 请求对象
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
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMetricsDataRequest 请求对象
     * @return AsyncInvoker<ShowMetricsDataRequest, ShowMetricsDataResponse>
     */
    public AsyncInvoker<ShowMetricsDataRequest, ShowMetricsDataResponse> showMetricsDataAsyncInvoker(
        ShowMetricsDataRequest request) {
        return new AsyncInvoker<>(request, AomMeta.showMetricsData, hcClient);
    }

    /**
     * 修改告警行动规则
     *
     * 修改告警行动规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateActionRuleRequest 请求对象
     * @return CompletableFuture<UpdateActionRuleResponse>
     */
    public CompletableFuture<UpdateActionRuleResponse> updateActionRuleAsync(UpdateActionRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, AomMeta.updateActionRule);
    }

    /**
     * 修改告警行动规则
     *
     * 修改告警行动规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateActionRuleRequest 请求对象
     * @return AsyncInvoker<UpdateActionRuleRequest, UpdateActionRuleResponse>
     */
    public AsyncInvoker<UpdateActionRuleRequest, UpdateActionRuleResponse> updateActionRuleAsyncInvoker(
        UpdateActionRuleRequest request) {
        return new AsyncInvoker<>(request, AomMeta.updateActionRule, hcClient);
    }

    /**
     * 修改阈值规则
     *
     * 该接口用于修改一条阈值规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAlarmRuleRequest 请求对象
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
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAlarmRuleRequest 请求对象
     * @return AsyncInvoker<UpdateAlarmRuleRequest, UpdateAlarmRuleResponse>
     */
    public AsyncInvoker<UpdateAlarmRuleRequest, UpdateAlarmRuleResponse> updateAlarmRuleAsyncInvoker(
        UpdateAlarmRuleRequest request) {
        return new AsyncInvoker<>(request, AomMeta.updateAlarmRule, hcClient);
    }

    /**
     * 更新事件类告警规则
     *
     * 更新事件类告警规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateEventRuleRequest 请求对象
     * @return CompletableFuture<UpdateEventRuleResponse>
     */
    public CompletableFuture<UpdateEventRuleResponse> updateEventRuleAsync(UpdateEventRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, AomMeta.updateEventRule);
    }

    /**
     * 更新事件类告警规则
     *
     * 更新事件类告警规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateEventRuleRequest 请求对象
     * @return AsyncInvoker<UpdateEventRuleRequest, UpdateEventRuleResponse>
     */
    public AsyncInvoker<UpdateEventRuleRequest, UpdateEventRuleResponse> updateEventRuleAsyncInvoker(
        UpdateEventRuleRequest request) {
        return new AsyncInvoker<>(request, AomMeta.updateEventRule, hcClient);
    }

    /**
     * 修改静默规则
     *
     * 修改静默规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateMuteRuleRequest 请求对象
     * @return CompletableFuture<UpdateMuteRuleResponse>
     */
    public CompletableFuture<UpdateMuteRuleResponse> updateMuteRuleAsync(UpdateMuteRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, AomMeta.updateMuteRule);
    }

    /**
     * 修改静默规则
     *
     * 修改静默规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateMuteRuleRequest 请求对象
     * @return AsyncInvoker<UpdateMuteRuleRequest, UpdateMuteRuleResponse>
     */
    public AsyncInvoker<UpdateMuteRuleRequest, UpdateMuteRuleResponse> updateMuteRuleAsyncInvoker(
        UpdateMuteRuleRequest request) {
        return new AsyncInvoker<>(request, AomMeta.updateMuteRule, hcClient);
    }

    /**
     * 新增Prometheus实例
     *
     * 该接口用于新增Prometheus实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePromInstanceRequest 请求对象
     * @return CompletableFuture<CreatePromInstanceResponse>
     */
    public CompletableFuture<CreatePromInstanceResponse> createPromInstanceAsync(CreatePromInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, AomMeta.createPromInstance);
    }

    /**
     * 新增Prometheus实例
     *
     * 该接口用于新增Prometheus实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePromInstanceRequest 请求对象
     * @return AsyncInvoker<CreatePromInstanceRequest, CreatePromInstanceResponse>
     */
    public AsyncInvoker<CreatePromInstanceRequest, CreatePromInstanceResponse> createPromInstanceAsyncInvoker(
        CreatePromInstanceRequest request) {
        return new AsyncInvoker<>(request, AomMeta.createPromInstance, hcClient);
    }

    /**
     * 创建Prometheus实例的预聚合规则
     *
     * 该接口用于给Prometheus实例创建预聚合规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateRecordingRuleRequest 请求对象
     * @return CompletableFuture<CreateRecordingRuleResponse>
     */
    public CompletableFuture<CreateRecordingRuleResponse> createRecordingRuleAsync(CreateRecordingRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, AomMeta.createRecordingRule);
    }

    /**
     * 创建Prometheus实例的预聚合规则
     *
     * 该接口用于给Prometheus实例创建预聚合规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateRecordingRuleRequest 请求对象
     * @return AsyncInvoker<CreateRecordingRuleRequest, CreateRecordingRuleResponse>
     */
    public AsyncInvoker<CreateRecordingRuleRequest, CreateRecordingRuleResponse> createRecordingRuleAsyncInvoker(
        CreateRecordingRuleRequest request) {
        return new AsyncInvoker<>(request, AomMeta.createRecordingRule, hcClient);
    }

    /**
     * 卸载托管Prometheus实例
     *
     * 该接口用于卸载托管Prometheus实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePromInstanceRequest 请求对象
     * @return CompletableFuture<DeletePromInstanceResponse>
     */
    public CompletableFuture<DeletePromInstanceResponse> deletePromInstanceAsync(DeletePromInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, AomMeta.deletePromInstance);
    }

    /**
     * 卸载托管Prometheus实例
     *
     * 该接口用于卸载托管Prometheus实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePromInstanceRequest 请求对象
     * @return AsyncInvoker<DeletePromInstanceRequest, DeletePromInstanceResponse>
     */
    public AsyncInvoker<DeletePromInstanceRequest, DeletePromInstanceResponse> deletePromInstanceAsyncInvoker(
        DeletePromInstanceRequest request) {
        return new AsyncInvoker<>(request, AomMeta.deletePromInstance, hcClient);
    }

    /**
     * 获取Prometheus实例调用凭证
     *
     * 该接口用于获取Prometheus实例调用凭证。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAccessCodeRequest 请求对象
     * @return CompletableFuture<ListAccessCodeResponse>
     */
    public CompletableFuture<ListAccessCodeResponse> listAccessCodeAsync(ListAccessCodeRequest request) {
        return hcClient.asyncInvokeHttp(request, AomMeta.listAccessCode);
    }

    /**
     * 获取Prometheus实例调用凭证
     *
     * 该接口用于获取Prometheus实例调用凭证。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAccessCodeRequest 请求对象
     * @return AsyncInvoker<ListAccessCodeRequest, ListAccessCodeResponse>
     */
    public AsyncInvoker<ListAccessCodeRequest, ListAccessCodeResponse> listAccessCodeAsyncInvoker(
        ListAccessCodeRequest request) {
        return new AsyncInvoker<>(request, AomMeta.listAccessCode, hcClient);
    }

    /**
     * GET方法查询瞬时数据
     *
     * 该接口使用GET方法查询PromQL(Prometheus Query Language)在特定时间点下的计算结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstantQueryAomPromGetRequest 请求对象
     * @return CompletableFuture<ListInstantQueryAomPromGetResponse>
     */
    public CompletableFuture<ListInstantQueryAomPromGetResponse> listInstantQueryAomPromGetAsync(
        ListInstantQueryAomPromGetRequest request) {
        return hcClient.asyncInvokeHttp(request, AomMeta.listInstantQueryAomPromGet);
    }

    /**
     * GET方法查询瞬时数据
     *
     * 该接口使用GET方法查询PromQL(Prometheus Query Language)在特定时间点下的计算结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstantQueryAomPromGetRequest 请求对象
     * @return AsyncInvoker<ListInstantQueryAomPromGetRequest, ListInstantQueryAomPromGetResponse>
     */
    public AsyncInvoker<ListInstantQueryAomPromGetRequest, ListInstantQueryAomPromGetResponse> listInstantQueryAomPromGetAsyncInvoker(
        ListInstantQueryAomPromGetRequest request) {
        return new AsyncInvoker<>(request, AomMeta.listInstantQueryAomPromGet, hcClient);
    }

    /**
     * （推荐）POST方法查询瞬时数据
     *
     * 该接口使用POST方法查询PromQL(Prometheus Query Language) 在特定时间点下的计算结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstantQueryAomPromPostRequest 请求对象
     * @return CompletableFuture<ListInstantQueryAomPromPostResponse>
     */
    public CompletableFuture<ListInstantQueryAomPromPostResponse> listInstantQueryAomPromPostAsync(
        ListInstantQueryAomPromPostRequest request) {
        return hcClient.asyncInvokeHttp(request, AomMeta.listInstantQueryAomPromPost);
    }

    /**
     * （推荐）POST方法查询瞬时数据
     *
     * 该接口使用POST方法查询PromQL(Prometheus Query Language) 在特定时间点下的计算结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstantQueryAomPromPostRequest 请求对象
     * @return AsyncInvoker<ListInstantQueryAomPromPostRequest, ListInstantQueryAomPromPostResponse>
     */
    public AsyncInvoker<ListInstantQueryAomPromPostRequest, ListInstantQueryAomPromPostResponse> listInstantQueryAomPromPostAsyncInvoker(
        ListInstantQueryAomPromPostRequest request) {
        return new AsyncInvoker<>(request, AomMeta.listInstantQueryAomPromPost, hcClient);
    }

    /**
     * 查询标签值
     *
     * 该接口用于查询带有指定标签的时间序列列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLabelValuesAomPromGetRequest 请求对象
     * @return CompletableFuture<ListLabelValuesAomPromGetResponse>
     */
    public CompletableFuture<ListLabelValuesAomPromGetResponse> listLabelValuesAomPromGetAsync(
        ListLabelValuesAomPromGetRequest request) {
        return hcClient.asyncInvokeHttp(request, AomMeta.listLabelValuesAomPromGet);
    }

    /**
     * 查询标签值
     *
     * 该接口用于查询带有指定标签的时间序列列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLabelValuesAomPromGetRequest 请求对象
     * @return AsyncInvoker<ListLabelValuesAomPromGetRequest, ListLabelValuesAomPromGetResponse>
     */
    public AsyncInvoker<ListLabelValuesAomPromGetRequest, ListLabelValuesAomPromGetResponse> listLabelValuesAomPromGetAsyncInvoker(
        ListLabelValuesAomPromGetRequest request) {
        return new AsyncInvoker<>(request, AomMeta.listLabelValuesAomPromGet, hcClient);
    }

    /**
     * GET方法获取标签名列表
     *
     * 该接口使用GET方法获取标签名列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLabelsAomPromGetRequest 请求对象
     * @return CompletableFuture<ListLabelsAomPromGetResponse>
     */
    public CompletableFuture<ListLabelsAomPromGetResponse> listLabelsAomPromGetAsync(
        ListLabelsAomPromGetRequest request) {
        return hcClient.asyncInvokeHttp(request, AomMeta.listLabelsAomPromGet);
    }

    /**
     * GET方法获取标签名列表
     *
     * 该接口使用GET方法获取标签名列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLabelsAomPromGetRequest 请求对象
     * @return AsyncInvoker<ListLabelsAomPromGetRequest, ListLabelsAomPromGetResponse>
     */
    public AsyncInvoker<ListLabelsAomPromGetRequest, ListLabelsAomPromGetResponse> listLabelsAomPromGetAsyncInvoker(
        ListLabelsAomPromGetRequest request) {
        return new AsyncInvoker<>(request, AomMeta.listLabelsAomPromGet, hcClient);
    }

    /**
     * （推荐）POST方法获取标签名列表
     *
     * 该接口使用POST方法获取标签名列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLabelsAomPromPostRequest 请求对象
     * @return CompletableFuture<ListLabelsAomPromPostResponse>
     */
    public CompletableFuture<ListLabelsAomPromPostResponse> listLabelsAomPromPostAsync(
        ListLabelsAomPromPostRequest request) {
        return hcClient.asyncInvokeHttp(request, AomMeta.listLabelsAomPromPost);
    }

    /**
     * （推荐）POST方法获取标签名列表
     *
     * 该接口使用POST方法获取标签名列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLabelsAomPromPostRequest 请求对象
     * @return AsyncInvoker<ListLabelsAomPromPostRequest, ListLabelsAomPromPostResponse>
     */
    public AsyncInvoker<ListLabelsAomPromPostRequest, ListLabelsAomPromPostResponse> listLabelsAomPromPostAsyncInvoker(
        ListLabelsAomPromPostRequest request) {
        return new AsyncInvoker<>(request, AomMeta.listLabelsAomPromPost, hcClient);
    }

    /**
     * 元数据查询
     *
     * 该接口用于查询序列及序列标签的元数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMetadataAomPromGetRequest 请求对象
     * @return CompletableFuture<ListMetadataAomPromGetResponse>
     */
    public CompletableFuture<ListMetadataAomPromGetResponse> listMetadataAomPromGetAsync(
        ListMetadataAomPromGetRequest request) {
        return hcClient.asyncInvokeHttp(request, AomMeta.listMetadataAomPromGet);
    }

    /**
     * 元数据查询
     *
     * 该接口用于查询序列及序列标签的元数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMetadataAomPromGetRequest 请求对象
     * @return AsyncInvoker<ListMetadataAomPromGetRequest, ListMetadataAomPromGetResponse>
     */
    public AsyncInvoker<ListMetadataAomPromGetRequest, ListMetadataAomPromGetResponse> listMetadataAomPromGetAsyncInvoker(
        ListMetadataAomPromGetRequest request) {
        return new AsyncInvoker<>(request, AomMeta.listMetadataAomPromGet, hcClient);
    }

    /**
     * 查询Prometheus实例
     *
     * 该接口用于查询Prometheus实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPromInstanceRequest 请求对象
     * @return CompletableFuture<ListPromInstanceResponse>
     */
    public CompletableFuture<ListPromInstanceResponse> listPromInstanceAsync(ListPromInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, AomMeta.listPromInstance);
    }

    /**
     * 查询Prometheus实例
     *
     * 该接口用于查询Prometheus实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPromInstanceRequest 请求对象
     * @return AsyncInvoker<ListPromInstanceRequest, ListPromInstanceResponse>
     */
    public AsyncInvoker<ListPromInstanceRequest, ListPromInstanceResponse> listPromInstanceAsyncInvoker(
        ListPromInstanceRequest request) {
        return new AsyncInvoker<>(request, AomMeta.listPromInstance, hcClient);
    }

    /**
     * GET方法查询区间数据
     *
     * 该接口使用GET方法查询PromQL(Prometheus Query Language)在一段时间返回内的计算结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRangeQueryAomPromGetRequest 请求对象
     * @return CompletableFuture<ListRangeQueryAomPromGetResponse>
     */
    public CompletableFuture<ListRangeQueryAomPromGetResponse> listRangeQueryAomPromGetAsync(
        ListRangeQueryAomPromGetRequest request) {
        return hcClient.asyncInvokeHttp(request, AomMeta.listRangeQueryAomPromGet);
    }

    /**
     * GET方法查询区间数据
     *
     * 该接口使用GET方法查询PromQL(Prometheus Query Language)在一段时间返回内的计算结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRangeQueryAomPromGetRequest 请求对象
     * @return AsyncInvoker<ListRangeQueryAomPromGetRequest, ListRangeQueryAomPromGetResponse>
     */
    public AsyncInvoker<ListRangeQueryAomPromGetRequest, ListRangeQueryAomPromGetResponse> listRangeQueryAomPromGetAsyncInvoker(
        ListRangeQueryAomPromGetRequest request) {
        return new AsyncInvoker<>(request, AomMeta.listRangeQueryAomPromGet, hcClient);
    }

    /**
     * （推荐）POST方法查询区间数据
     *
     * 该接口使用POST方法查询PromQL(Prometheus Query Language)在一段时间返回内的计算结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRangeQueryAomPromPostRequest 请求对象
     * @return CompletableFuture<ListRangeQueryAomPromPostResponse>
     */
    public CompletableFuture<ListRangeQueryAomPromPostResponse> listRangeQueryAomPromPostAsync(
        ListRangeQueryAomPromPostRequest request) {
        return hcClient.asyncInvokeHttp(request, AomMeta.listRangeQueryAomPromPost);
    }

    /**
     * （推荐）POST方法查询区间数据
     *
     * 该接口使用POST方法查询PromQL(Prometheus Query Language)在一段时间返回内的计算结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRangeQueryAomPromPostRequest 请求对象
     * @return AsyncInvoker<ListRangeQueryAomPromPostRequest, ListRangeQueryAomPromPostResponse>
     */
    public AsyncInvoker<ListRangeQueryAomPromPostRequest, ListRangeQueryAomPromPostResponse> listRangeQueryAomPromPostAsyncInvoker(
        ListRangeQueryAomPromPostRequest request) {
        return new AsyncInvoker<>(request, AomMeta.listRangeQueryAomPromPost, hcClient);
    }

}
