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
import com.huaweicloud.sdk.core.invoker.SyncInvoker;

public class AomClient {

    protected HcClient hcClient;

    public AomClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<AomClient> newBuilder() {
        ClientBuilder<AomClient> clientBuilder = new ClientBuilder<>(AomClient::new);
        return clientBuilder;
    }

    /**
     * 新增告警行动规则
     *
     * 新增告警行动规则。（注：接口目前开放的region为：上海一）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AddActionRuleRequest 请求对象
     * @return AddActionRuleResponse
     */
    public AddActionRuleResponse addActionRule(AddActionRuleRequest request) {
        return hcClient.syncInvokeHttp(request, AomMeta.addActionRule);
    }

    /**
     * 新增告警行动规则
     *
     * 新增告警行动规则。（注：接口目前开放的region为：上海一）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AddActionRuleRequest 请求对象
     * @return SyncInvoker<AddActionRuleRequest, AddActionRuleResponse>
     */
    public SyncInvoker<AddActionRuleRequest, AddActionRuleResponse> addActionRuleInvoker(AddActionRuleRequest request) {
        return new SyncInvoker<AddActionRuleRequest, AddActionRuleResponse>(request, AomMeta.addActionRule, hcClient);
    }

    /**
     * 添加阈值规则
     *
     * 该接口用于添加一条阈值规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AddAlarmRuleRequest 请求对象
     * @return AddAlarmRuleResponse
     */
    public AddAlarmRuleResponse addAlarmRule(AddAlarmRuleRequest request) {
        return hcClient.syncInvokeHttp(request, AomMeta.addAlarmRule);
    }

    /**
     * 添加阈值规则
     *
     * 该接口用于添加一条阈值规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AddAlarmRuleRequest 请求对象
     * @return SyncInvoker<AddAlarmRuleRequest, AddAlarmRuleResponse>
     */
    public SyncInvoker<AddAlarmRuleRequest, AddAlarmRuleResponse> addAlarmRuleInvoker(AddAlarmRuleRequest request) {
        return new SyncInvoker<AddAlarmRuleRequest, AddAlarmRuleResponse>(request, AomMeta.addAlarmRule, hcClient);
    }

    /**
     * 新增一条事件类告警规则
     *
     * 新增一条事件类告警规则。（注：接口目前开放的region为：上海一）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AddEvent2alarmRuleRequest 请求对象
     * @return AddEvent2alarmRuleResponse
     */
    public AddEvent2alarmRuleResponse addEvent2alarmRule(AddEvent2alarmRuleRequest request) {
        return hcClient.syncInvokeHttp(request, AomMeta.addEvent2alarmRule);
    }

    /**
     * 新增一条事件类告警规则
     *
     * 新增一条事件类告警规则。（注：接口目前开放的region为：上海一）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AddEvent2alarmRuleRequest 请求对象
     * @return SyncInvoker<AddEvent2alarmRuleRequest, AddEvent2alarmRuleResponse>
     */
    public SyncInvoker<AddEvent2alarmRuleRequest, AddEvent2alarmRuleResponse> addEvent2alarmRuleInvoker(
        AddEvent2alarmRuleRequest request) {
        return new SyncInvoker<AddEvent2alarmRuleRequest, AddEvent2alarmRuleResponse>(request,
            AomMeta.addEvent2alarmRule, hcClient);
    }

    /**
     * 添加监控数据
     *
     * 该接口用于向服务端添加一条或多条监控数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AddMetricDataRequest 请求对象
     * @return AddMetricDataResponse
     */
    public AddMetricDataResponse addMetricData(AddMetricDataRequest request) {
        return hcClient.syncInvokeHttp(request, AomMeta.addMetricData);
    }

    /**
     * 添加监控数据
     *
     * 该接口用于向服务端添加一条或多条监控数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AddMetricDataRequest 请求对象
     * @return SyncInvoker<AddMetricDataRequest, AddMetricDataResponse>
     */
    public SyncInvoker<AddMetricDataRequest, AddMetricDataResponse> addMetricDataInvoker(AddMetricDataRequest request) {
        return new SyncInvoker<AddMetricDataRequest, AddMetricDataResponse>(request, AomMeta.addMetricData, hcClient);
    }

    /**
     * 新增静默规则
     *
     * 新增静默规则。（注：接口目前开放的region为：上海一）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AddMuteRulesRequest 请求对象
     * @return AddMuteRulesResponse
     */
    public AddMuteRulesResponse addMuteRules(AddMuteRulesRequest request) {
        return hcClient.syncInvokeHttp(request, AomMeta.addMuteRules);
    }

    /**
     * 新增静默规则
     *
     * 新增静默规则。（注：接口目前开放的region为：上海一）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AddMuteRulesRequest 请求对象
     * @return SyncInvoker<AddMuteRulesRequest, AddMuteRulesResponse>
     */
    public SyncInvoker<AddMuteRulesRequest, AddMuteRulesResponse> addMuteRulesInvoker(AddMuteRulesRequest request) {
        return new SyncInvoker<AddMuteRulesRequest, AddMuteRulesResponse>(request, AomMeta.addMuteRules, hcClient);
    }

    /**
     * 添加或修改服务发现规则
     *
     * 该接口用于添加或修改一条或多条服务发现规则。同一projectid下可添加的规则上限为100条。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AddOrUpdateServiceDiscoveryRulesRequest 请求对象
     * @return AddOrUpdateServiceDiscoveryRulesResponse
     */
    public AddOrUpdateServiceDiscoveryRulesResponse addOrUpdateServiceDiscoveryRules(
        AddOrUpdateServiceDiscoveryRulesRequest request) {
        return hcClient.syncInvokeHttp(request, AomMeta.addOrUpdateServiceDiscoveryRules);
    }

    /**
     * 添加或修改服务发现规则
     *
     * 该接口用于添加或修改一条或多条服务发现规则。同一projectid下可添加的规则上限为100条。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AddOrUpdateServiceDiscoveryRulesRequest 请求对象
     * @return SyncInvoker<AddOrUpdateServiceDiscoveryRulesRequest, AddOrUpdateServiceDiscoveryRulesResponse>
     */
    public SyncInvoker<AddOrUpdateServiceDiscoveryRulesRequest, AddOrUpdateServiceDiscoveryRulesResponse> addOrUpdateServiceDiscoveryRulesInvoker(
        AddOrUpdateServiceDiscoveryRulesRequest request) {
        return new SyncInvoker<AddOrUpdateServiceDiscoveryRulesRequest, AddOrUpdateServiceDiscoveryRulesResponse>(
            request, AomMeta.addOrUpdateServiceDiscoveryRules, hcClient);
    }

    /**
     * 统计事件告警信息
     *
     * 该接口用于分段统计指定条件下的事件、告警。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CountEventsRequest 请求对象
     * @return CountEventsResponse
     */
    public CountEventsResponse countEvents(CountEventsRequest request) {
        return hcClient.syncInvokeHttp(request, AomMeta.countEvents);
    }

    /**
     * 统计事件告警信息
     *
     * 该接口用于分段统计指定条件下的事件、告警。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CountEventsRequest 请求对象
     * @return SyncInvoker<CountEventsRequest, CountEventsResponse>
     */
    public SyncInvoker<CountEventsRequest, CountEventsResponse> countEventsInvoker(CountEventsRequest request) {
        return new SyncInvoker<CountEventsRequest, CountEventsResponse>(request, AomMeta.countEvents, hcClient);
    }

    /**
     * 删除告警行动规则
     *
     * 删除告警行动规则。（注：接口目前开放的region为：上海一）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteActionRuleRequest 请求对象
     * @return DeleteActionRuleResponse
     */
    public DeleteActionRuleResponse deleteActionRule(DeleteActionRuleRequest request) {
        return hcClient.syncInvokeHttp(request, AomMeta.deleteActionRule);
    }

    /**
     * 删除告警行动规则
     *
     * 删除告警行动规则。（注：接口目前开放的region为：上海一）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteActionRuleRequest 请求对象
     * @return SyncInvoker<DeleteActionRuleRequest, DeleteActionRuleResponse>
     */
    public SyncInvoker<DeleteActionRuleRequest, DeleteActionRuleResponse> deleteActionRuleInvoker(
        DeleteActionRuleRequest request) {
        return new SyncInvoker<DeleteActionRuleRequest, DeleteActionRuleResponse>(request, AomMeta.deleteActionRule,
            hcClient);
    }

    /**
     * 删除阈值规则
     *
     * 该接口用于删除阈值规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteAlarmRuleRequest 请求对象
     * @return DeleteAlarmRuleResponse
     */
    public DeleteAlarmRuleResponse deleteAlarmRule(DeleteAlarmRuleRequest request) {
        return hcClient.syncInvokeHttp(request, AomMeta.deleteAlarmRule);
    }

    /**
     * 删除阈值规则
     *
     * 该接口用于删除阈值规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteAlarmRuleRequest 请求对象
     * @return SyncInvoker<DeleteAlarmRuleRequest, DeleteAlarmRuleResponse>
     */
    public SyncInvoker<DeleteAlarmRuleRequest, DeleteAlarmRuleResponse> deleteAlarmRuleInvoker(
        DeleteAlarmRuleRequest request) {
        return new SyncInvoker<DeleteAlarmRuleRequest, DeleteAlarmRuleResponse>(request, AomMeta.deleteAlarmRule,
            hcClient);
    }

    /**
     * 批量删除阈值规则
     *
     * 批量删除阈值规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteAlarmRulesRequest 请求对象
     * @return DeleteAlarmRulesResponse
     */
    public DeleteAlarmRulesResponse deleteAlarmRules(DeleteAlarmRulesRequest request) {
        return hcClient.syncInvokeHttp(request, AomMeta.deleteAlarmRules);
    }

    /**
     * 批量删除阈值规则
     *
     * 批量删除阈值规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteAlarmRulesRequest 请求对象
     * @return SyncInvoker<DeleteAlarmRulesRequest, DeleteAlarmRulesResponse>
     */
    public SyncInvoker<DeleteAlarmRulesRequest, DeleteAlarmRulesResponse> deleteAlarmRulesInvoker(
        DeleteAlarmRulesRequest request) {
        return new SyncInvoker<DeleteAlarmRulesRequest, DeleteAlarmRulesResponse>(request, AomMeta.deleteAlarmRules,
            hcClient);
    }

    /**
     * 删除事件类告警规则
     *
     * 删除一条事件类告警规则。（注：接口目前开放的region为：上海一）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteEvent2alarmRuleRequest 请求对象
     * @return DeleteEvent2alarmRuleResponse
     */
    public DeleteEvent2alarmRuleResponse deleteEvent2alarmRule(DeleteEvent2alarmRuleRequest request) {
        return hcClient.syncInvokeHttp(request, AomMeta.deleteEvent2alarmRule);
    }

    /**
     * 删除事件类告警规则
     *
     * 删除一条事件类告警规则。（注：接口目前开放的region为：上海一）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteEvent2alarmRuleRequest 请求对象
     * @return SyncInvoker<DeleteEvent2alarmRuleRequest, DeleteEvent2alarmRuleResponse>
     */
    public SyncInvoker<DeleteEvent2alarmRuleRequest, DeleteEvent2alarmRuleResponse> deleteEvent2alarmRuleInvoker(
        DeleteEvent2alarmRuleRequest request) {
        return new SyncInvoker<DeleteEvent2alarmRuleRequest, DeleteEvent2alarmRuleResponse>(request,
            AomMeta.deleteEvent2alarmRule, hcClient);
    }

    /**
     * 删除静默规则
     *
     * 删除静默规则。（注：接口目前开放的region为：上海一）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteMuteRulesRequest 请求对象
     * @return DeleteMuteRulesResponse
     */
    public DeleteMuteRulesResponse deleteMuteRules(DeleteMuteRulesRequest request) {
        return hcClient.syncInvokeHttp(request, AomMeta.deleteMuteRules);
    }

    /**
     * 删除静默规则
     *
     * 删除静默规则。（注：接口目前开放的region为：上海一）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteMuteRulesRequest 请求对象
     * @return SyncInvoker<DeleteMuteRulesRequest, DeleteMuteRulesResponse>
     */
    public SyncInvoker<DeleteMuteRulesRequest, DeleteMuteRulesResponse> deleteMuteRulesInvoker(
        DeleteMuteRulesRequest request) {
        return new SyncInvoker<DeleteMuteRulesRequest, DeleteMuteRulesResponse>(request, AomMeta.deleteMuteRules,
            hcClient);
    }

    /**
     * 删除服务发现规则
     *
     * 该接口用于删除服务发现规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteserviceDiscoveryRulesRequest 请求对象
     * @return DeleteserviceDiscoveryRulesResponse
     */
    public DeleteserviceDiscoveryRulesResponse deleteserviceDiscoveryRules(DeleteserviceDiscoveryRulesRequest request) {
        return hcClient.syncInvokeHttp(request, AomMeta.deleteserviceDiscoveryRules);
    }

    /**
     * 删除服务发现规则
     *
     * 该接口用于删除服务发现规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteserviceDiscoveryRulesRequest 请求对象
     * @return SyncInvoker<DeleteserviceDiscoveryRulesRequest, DeleteserviceDiscoveryRulesResponse>
     */
    public SyncInvoker<DeleteserviceDiscoveryRulesRequest, DeleteserviceDiscoveryRulesResponse> deleteserviceDiscoveryRulesInvoker(
        DeleteserviceDiscoveryRulesRequest request) {
        return new SyncInvoker<DeleteserviceDiscoveryRulesRequest, DeleteserviceDiscoveryRulesResponse>(request,
            AomMeta.deleteserviceDiscoveryRules, hcClient);
    }

    /**
     * 获取告警行动规则列表
     *
     * 获取告警行动规则列表。（注：接口目前开放的region为：上海一）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListActionRuleRequest 请求对象
     * @return ListActionRuleResponse
     */
    public ListActionRuleResponse listActionRule(ListActionRuleRequest request) {
        return hcClient.syncInvokeHttp(request, AomMeta.listActionRule);
    }

    /**
     * 获取告警行动规则列表
     *
     * 获取告警行动规则列表。（注：接口目前开放的region为：上海一）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListActionRuleRequest 请求对象
     * @return SyncInvoker<ListActionRuleRequest, ListActionRuleResponse>
     */
    public SyncInvoker<ListActionRuleRequest, ListActionRuleResponse> listActionRuleInvoker(
        ListActionRuleRequest request) {
        return new SyncInvoker<ListActionRuleRequest, ListActionRuleResponse>(request, AomMeta.listActionRule,
            hcClient);
    }

    /**
     * 查询集群主机安装的ICAgent信息
     *
     * 该接口用于查询集群主机安装的ICAgent信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAgentsRequest 请求对象
     * @return ListAgentsResponse
     */
    public ListAgentsResponse listAgents(ListAgentsRequest request) {
        return hcClient.syncInvokeHttp(request, AomMeta.listAgents);
    }

    /**
     * 查询集群主机安装的ICAgent信息
     *
     * 该接口用于查询集群主机安装的ICAgent信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAgentsRequest 请求对象
     * @return SyncInvoker<ListAgentsRequest, ListAgentsResponse>
     */
    public SyncInvoker<ListAgentsRequest, ListAgentsResponse> listAgentsInvoker(ListAgentsRequest request) {
        return new SyncInvoker<ListAgentsRequest, ListAgentsResponse>(request, AomMeta.listAgents, hcClient);
    }

    /**
     * 查询阈值规则列表
     *
     * 该接口用于查询阈值规则列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAlarmRuleRequest 请求对象
     * @return ListAlarmRuleResponse
     */
    public ListAlarmRuleResponse listAlarmRule(ListAlarmRuleRequest request) {
        return hcClient.syncInvokeHttp(request, AomMeta.listAlarmRule);
    }

    /**
     * 查询阈值规则列表
     *
     * 该接口用于查询阈值规则列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAlarmRuleRequest 请求对象
     * @return SyncInvoker<ListAlarmRuleRequest, ListAlarmRuleResponse>
     */
    public SyncInvoker<ListAlarmRuleRequest, ListAlarmRuleResponse> listAlarmRuleInvoker(ListAlarmRuleRequest request) {
        return new SyncInvoker<ListAlarmRuleRequest, ListAlarmRuleResponse>(request, AomMeta.listAlarmRule, hcClient);
    }

    /**
     * 查询事件类告警规则列表
     *
     * 查询事件类告警规则列表。（注：接口目前开放的region为：上海一）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListEvent2alarmRuleRequest 请求对象
     * @return ListEvent2alarmRuleResponse
     */
    public ListEvent2alarmRuleResponse listEvent2alarmRule(ListEvent2alarmRuleRequest request) {
        return hcClient.syncInvokeHttp(request, AomMeta.listEvent2alarmRule);
    }

    /**
     * 查询事件类告警规则列表
     *
     * 查询事件类告警规则列表。（注：接口目前开放的region为：上海一）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListEvent2alarmRuleRequest 请求对象
     * @return SyncInvoker<ListEvent2alarmRuleRequest, ListEvent2alarmRuleResponse>
     */
    public SyncInvoker<ListEvent2alarmRuleRequest, ListEvent2alarmRuleResponse> listEvent2alarmRuleInvoker(
        ListEvent2alarmRuleRequest request) {
        return new SyncInvoker<ListEvent2alarmRuleRequest, ListEvent2alarmRuleResponse>(request,
            AomMeta.listEvent2alarmRule, hcClient);
    }

    /**
     * 查询事件告警信息
     *
     * 该接口用于查询对应用户的事件、告警。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListEventsRequest 请求对象
     * @return ListEventsResponse
     */
    public ListEventsResponse listEvents(ListEventsRequest request) {
        return hcClient.syncInvokeHttp(request, AomMeta.listEvents);
    }

    /**
     * 查询事件告警信息
     *
     * 该接口用于查询对应用户的事件、告警。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListEventsRequest 请求对象
     * @return SyncInvoker<ListEventsRequest, ListEventsResponse>
     */
    public SyncInvoker<ListEventsRequest, ListEventsResponse> listEventsInvoker(ListEventsRequest request) {
        return new SyncInvoker<ListEventsRequest, ListEventsResponse>(request, AomMeta.listEvents, hcClient);
    }

    /**
     * 查询日志
     *
     * 该接口用于查询不同维度(例如集群、IP、应用等)下的日志内容，支持分页查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListLogItemsRequest 请求对象
     * @return ListLogItemsResponse
     */
    public ListLogItemsResponse listLogItems(ListLogItemsRequest request) {
        return hcClient.syncInvokeHttp(request, AomMeta.listLogItems);
    }

    /**
     * 查询日志
     *
     * 该接口用于查询不同维度(例如集群、IP、应用等)下的日志内容，支持分页查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListLogItemsRequest 请求对象
     * @return SyncInvoker<ListLogItemsRequest, ListLogItemsResponse>
     */
    public SyncInvoker<ListLogItemsRequest, ListLogItemsResponse> listLogItemsInvoker(ListLogItemsRequest request) {
        return new SyncInvoker<ListLogItemsRequest, ListLogItemsResponse>(request, AomMeta.listLogItems, hcClient);
    }

    /**
     * 查询指标
     *
     * 该接口用于查询系统当前可监控的指标列表，可以指定指标命名空间、指标名称、维度、所属资源的编号（格式为：resType_resId），分页查询的起始位置和返回的最大记录条数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListMetricItemsRequest 请求对象
     * @return ListMetricItemsResponse
     */
    public ListMetricItemsResponse listMetricItems(ListMetricItemsRequest request) {
        return hcClient.syncInvokeHttp(request, AomMeta.listMetricItems);
    }

    /**
     * 查询指标
     *
     * 该接口用于查询系统当前可监控的指标列表，可以指定指标命名空间、指标名称、维度、所属资源的编号（格式为：resType_resId），分页查询的起始位置和返回的最大记录条数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListMetricItemsRequest 请求对象
     * @return SyncInvoker<ListMetricItemsRequest, ListMetricItemsResponse>
     */
    public SyncInvoker<ListMetricItemsRequest, ListMetricItemsResponse> listMetricItemsInvoker(
        ListMetricItemsRequest request) {
        return new SyncInvoker<ListMetricItemsRequest, ListMetricItemsResponse>(request, AomMeta.listMetricItems,
            hcClient);
    }

    /**
     * 获取静默规则列表
     *
     * 获取静默规则列表。（注：接口目前开放的region为：上海一）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListMuteRuleRequest 请求对象
     * @return ListMuteRuleResponse
     */
    public ListMuteRuleResponse listMuteRule(ListMuteRuleRequest request) {
        return hcClient.syncInvokeHttp(request, AomMeta.listMuteRule);
    }

    /**
     * 获取静默规则列表
     *
     * 获取静默规则列表。（注：接口目前开放的region为：上海一）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListMuteRuleRequest 请求对象
     * @return SyncInvoker<ListMuteRuleRequest, ListMuteRuleResponse>
     */
    public SyncInvoker<ListMuteRuleRequest, ListMuteRuleResponse> listMuteRuleInvoker(ListMuteRuleRequest request) {
        return new SyncInvoker<ListMuteRuleRequest, ListMuteRuleResponse>(request, AomMeta.listMuteRule, hcClient);
    }

    /**
     * 获取告警发送结果
     *
     * 获取告警发送结果。（注：接口目前开放的region为：上海一）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListNotifiedHistoriesRequest 请求对象
     * @return ListNotifiedHistoriesResponse
     */
    public ListNotifiedHistoriesResponse listNotifiedHistories(ListNotifiedHistoriesRequest request) {
        return hcClient.syncInvokeHttp(request, AomMeta.listNotifiedHistories);
    }

    /**
     * 获取告警发送结果
     *
     * 获取告警发送结果。（注：接口目前开放的region为：上海一）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListNotifiedHistoriesRequest 请求对象
     * @return SyncInvoker<ListNotifiedHistoriesRequest, ListNotifiedHistoriesResponse>
     */
    public SyncInvoker<ListNotifiedHistoriesRequest, ListNotifiedHistoriesResponse> listNotifiedHistoriesInvoker(
        ListNotifiedHistoriesRequest request) {
        return new SyncInvoker<ListNotifiedHistoriesRequest, ListNotifiedHistoriesResponse>(request,
            AomMeta.listNotifiedHistories, hcClient);
    }

    /**
     * 查询aom2.0相关云服务授权信息
     *
     * 该接口用于查询aom2.0相关云服务授权信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPermissionsRequest 请求对象
     * @return ListPermissionsResponse
     */
    public ListPermissionsResponse listPermissions(ListPermissionsRequest request) {
        return hcClient.syncInvokeHttp(request, AomMeta.listPermissions);
    }

    /**
     * 查询aom2.0相关云服务授权信息
     *
     * 该接口用于查询aom2.0相关云服务授权信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPermissionsRequest 请求对象
     * @return SyncInvoker<ListPermissionsRequest, ListPermissionsResponse>
     */
    public SyncInvoker<ListPermissionsRequest, ListPermissionsResponse> listPermissionsInvoker(
        ListPermissionsRequest request) {
        return new SyncInvoker<ListPermissionsRequest, ListPermissionsResponse>(request, AomMeta.listPermissions,
            hcClient);
    }

    /**
     * 查询时序数据
     *
     * 该接口用于查询指定时间范围内的监控时序数据，可以通过参数指定需要查询的数据维度，数据周期等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSampleRequest 请求对象
     * @return ListSampleResponse
     */
    public ListSampleResponse listSample(ListSampleRequest request) {
        return hcClient.syncInvokeHttp(request, AomMeta.listSample);
    }

    /**
     * 查询时序数据
     *
     * 该接口用于查询指定时间范围内的监控时序数据，可以通过参数指定需要查询的数据维度，数据周期等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSampleRequest 请求对象
     * @return SyncInvoker<ListSampleRequest, ListSampleResponse>
     */
    public SyncInvoker<ListSampleRequest, ListSampleResponse> listSampleInvoker(ListSampleRequest request) {
        return new SyncInvoker<ListSampleRequest, ListSampleResponse>(request, AomMeta.listSample, hcClient);
    }

    /**
     * 查询时间序列
     *
     * 该接口用于查询系统当前可监控的时间序列列表，可以指定时间序列命名空间、名称、维度、所属资源的编号（格式为：resType_resId），分页查询的起始位置和返回的最大记录条数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSeriesRequest 请求对象
     * @return ListSeriesResponse
     */
    public ListSeriesResponse listSeries(ListSeriesRequest request) {
        return hcClient.syncInvokeHttp(request, AomMeta.listSeries);
    }

    /**
     * 查询时间序列
     *
     * 该接口用于查询系统当前可监控的时间序列列表，可以指定时间序列命名空间、名称、维度、所属资源的编号（格式为：resType_resId），分页查询的起始位置和返回的最大记录条数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSeriesRequest 请求对象
     * @return SyncInvoker<ListSeriesRequest, ListSeriesResponse>
     */
    public SyncInvoker<ListSeriesRequest, ListSeriesResponse> listSeriesInvoker(ListSeriesRequest request) {
        return new SyncInvoker<ListSeriesRequest, ListSeriesResponse>(request, AomMeta.listSeries, hcClient);
    }

    /**
     * 查询系统中已有服务发现规则
     *
     * 该接口用于查询系统当前已存在的服务发现规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListServiceDiscoveryRulesRequest 请求对象
     * @return ListServiceDiscoveryRulesResponse
     */
    public ListServiceDiscoveryRulesResponse listServiceDiscoveryRules(ListServiceDiscoveryRulesRequest request) {
        return hcClient.syncInvokeHttp(request, AomMeta.listServiceDiscoveryRules);
    }

    /**
     * 查询系统中已有服务发现规则
     *
     * 该接口用于查询系统当前已存在的服务发现规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListServiceDiscoveryRulesRequest 请求对象
     * @return SyncInvoker<ListServiceDiscoveryRulesRequest, ListServiceDiscoveryRulesResponse>
     */
    public SyncInvoker<ListServiceDiscoveryRulesRequest, ListServiceDiscoveryRulesResponse> listServiceDiscoveryRulesInvoker(
        ListServiceDiscoveryRulesRequest request) {
        return new SyncInvoker<ListServiceDiscoveryRulesRequest, ListServiceDiscoveryRulesResponse>(request,
            AomMeta.listServiceDiscoveryRules, hcClient);
    }

    /**
     * 上报事件告警信息
     *
     * 该接口用于上报对应用户的事件、告警。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param PushEventsRequest 请求对象
     * @return PushEventsResponse
     */
    public PushEventsResponse pushEvents(PushEventsRequest request) {
        return hcClient.syncInvokeHttp(request, AomMeta.pushEvents);
    }

    /**
     * 上报事件告警信息
     *
     * 该接口用于上报对应用户的事件、告警。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param PushEventsRequest 请求对象
     * @return SyncInvoker<PushEventsRequest, PushEventsResponse>
     */
    public SyncInvoker<PushEventsRequest, PushEventsResponse> pushEventsInvoker(PushEventsRequest request) {
        return new SyncInvoker<PushEventsRequest, PushEventsResponse>(request, AomMeta.pushEvents, hcClient);
    }

    /**
     * 通过规则名称获取告警行动规则
     *
     * 通过规则名称获取告警行动规则。（注：接口目前开放的region为：上海一）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowActionRuleRequest 请求对象
     * @return ShowActionRuleResponse
     */
    public ShowActionRuleResponse showActionRule(ShowActionRuleRequest request) {
        return hcClient.syncInvokeHttp(request, AomMeta.showActionRule);
    }

    /**
     * 通过规则名称获取告警行动规则
     *
     * 通过规则名称获取告警行动规则。（注：接口目前开放的region为：上海一）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowActionRuleRequest 请求对象
     * @return SyncInvoker<ShowActionRuleRequest, ShowActionRuleResponse>
     */
    public SyncInvoker<ShowActionRuleRequest, ShowActionRuleResponse> showActionRuleInvoker(
        ShowActionRuleRequest request) {
        return new SyncInvoker<ShowActionRuleRequest, ShowActionRuleResponse>(request, AomMeta.showActionRule,
            hcClient);
    }

    /**
     * 查询单条阈值规则
     *
     * 该接口用于查询单条阈值规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAlarmRuleRequest 请求对象
     * @return ShowAlarmRuleResponse
     */
    public ShowAlarmRuleResponse showAlarmRule(ShowAlarmRuleRequest request) {
        return hcClient.syncInvokeHttp(request, AomMeta.showAlarmRule);
    }

    /**
     * 查询单条阈值规则
     *
     * 该接口用于查询单条阈值规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAlarmRuleRequest 请求对象
     * @return SyncInvoker<ShowAlarmRuleRequest, ShowAlarmRuleResponse>
     */
    public SyncInvoker<ShowAlarmRuleRequest, ShowAlarmRuleResponse> showAlarmRuleInvoker(ShowAlarmRuleRequest request) {
        return new SyncInvoker<ShowAlarmRuleRequest, ShowAlarmRuleResponse>(request, AomMeta.showAlarmRule, hcClient);
    }

    /**
     * 查询监控数据
     *
     * 该接口用于查询指定时间范围内指标的监控数据，可以通过参数指定需要查询的数据维度，数据周期等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowMetricsDataRequest 请求对象
     * @return ShowMetricsDataResponse
     */
    public ShowMetricsDataResponse showMetricsData(ShowMetricsDataRequest request) {
        return hcClient.syncInvokeHttp(request, AomMeta.showMetricsData);
    }

    /**
     * 查询监控数据
     *
     * 该接口用于查询指定时间范围内指标的监控数据，可以通过参数指定需要查询的数据维度，数据周期等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowMetricsDataRequest 请求对象
     * @return SyncInvoker<ShowMetricsDataRequest, ShowMetricsDataResponse>
     */
    public SyncInvoker<ShowMetricsDataRequest, ShowMetricsDataResponse> showMetricsDataInvoker(
        ShowMetricsDataRequest request) {
        return new SyncInvoker<ShowMetricsDataRequest, ShowMetricsDataResponse>(request, AomMeta.showMetricsData,
            hcClient);
    }

    /**
     * 修改告警行动规则
     *
     * 修改告警行动规则。（注：接口目前开放的region为：上海一）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateActionRuleRequest 请求对象
     * @return UpdateActionRuleResponse
     */
    public UpdateActionRuleResponse updateActionRule(UpdateActionRuleRequest request) {
        return hcClient.syncInvokeHttp(request, AomMeta.updateActionRule);
    }

    /**
     * 修改告警行动规则
     *
     * 修改告警行动规则。（注：接口目前开放的region为：上海一）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateActionRuleRequest 请求对象
     * @return SyncInvoker<UpdateActionRuleRequest, UpdateActionRuleResponse>
     */
    public SyncInvoker<UpdateActionRuleRequest, UpdateActionRuleResponse> updateActionRuleInvoker(
        UpdateActionRuleRequest request) {
        return new SyncInvoker<UpdateActionRuleRequest, UpdateActionRuleResponse>(request, AomMeta.updateActionRule,
            hcClient);
    }

    /**
     * 修改阈值规则
     *
     * 该接口用于修改一条阈值规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateAlarmRuleRequest 请求对象
     * @return UpdateAlarmRuleResponse
     */
    public UpdateAlarmRuleResponse updateAlarmRule(UpdateAlarmRuleRequest request) {
        return hcClient.syncInvokeHttp(request, AomMeta.updateAlarmRule);
    }

    /**
     * 修改阈值规则
     *
     * 该接口用于修改一条阈值规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateAlarmRuleRequest 请求对象
     * @return SyncInvoker<UpdateAlarmRuleRequest, UpdateAlarmRuleResponse>
     */
    public SyncInvoker<UpdateAlarmRuleRequest, UpdateAlarmRuleResponse> updateAlarmRuleInvoker(
        UpdateAlarmRuleRequest request) {
        return new SyncInvoker<UpdateAlarmRuleRequest, UpdateAlarmRuleResponse>(request, AomMeta.updateAlarmRule,
            hcClient);
    }

    /**
     * 更新事件类告警规则
     *
     * 更新事件类告警规则。（注：接口目前开放的region为：上海一）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateEventRuleRequest 请求对象
     * @return UpdateEventRuleResponse
     */
    public UpdateEventRuleResponse updateEventRule(UpdateEventRuleRequest request) {
        return hcClient.syncInvokeHttp(request, AomMeta.updateEventRule);
    }

    /**
     * 更新事件类告警规则
     *
     * 更新事件类告警规则。（注：接口目前开放的region为：上海一）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateEventRuleRequest 请求对象
     * @return SyncInvoker<UpdateEventRuleRequest, UpdateEventRuleResponse>
     */
    public SyncInvoker<UpdateEventRuleRequest, UpdateEventRuleResponse> updateEventRuleInvoker(
        UpdateEventRuleRequest request) {
        return new SyncInvoker<UpdateEventRuleRequest, UpdateEventRuleResponse>(request, AomMeta.updateEventRule,
            hcClient);
    }

    /**
     * 修改静默规则
     *
     * 修改静默规则。（注：接口目前开放的region为：上海一）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateMuteRuleRequest 请求对象
     * @return UpdateMuteRuleResponse
     */
    public UpdateMuteRuleResponse updateMuteRule(UpdateMuteRuleRequest request) {
        return hcClient.syncInvokeHttp(request, AomMeta.updateMuteRule);
    }

    /**
     * 修改静默规则
     *
     * 修改静默规则。（注：接口目前开放的region为：上海一）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateMuteRuleRequest 请求对象
     * @return SyncInvoker<UpdateMuteRuleRequest, UpdateMuteRuleResponse>
     */
    public SyncInvoker<UpdateMuteRuleRequest, UpdateMuteRuleResponse> updateMuteRuleInvoker(
        UpdateMuteRuleRequest request) {
        return new SyncInvoker<UpdateMuteRuleRequest, UpdateMuteRuleResponse>(request, AomMeta.updateMuteRule,
            hcClient);
    }

    /**
     * 新增Prometheus实例
     *
     * 该接口用于新增Prometheus实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreatePromInstanceRequest 请求对象
     * @return CreatePromInstanceResponse
     */
    public CreatePromInstanceResponse createPromInstance(CreatePromInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, AomMeta.createPromInstance);
    }

    /**
     * 新增Prometheus实例
     *
     * 该接口用于新增Prometheus实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreatePromInstanceRequest 请求对象
     * @return SyncInvoker<CreatePromInstanceRequest, CreatePromInstanceResponse>
     */
    public SyncInvoker<CreatePromInstanceRequest, CreatePromInstanceResponse> createPromInstanceInvoker(
        CreatePromInstanceRequest request) {
        return new SyncInvoker<CreatePromInstanceRequest, CreatePromInstanceResponse>(request,
            AomMeta.createPromInstance, hcClient);
    }

    /**
     * 创建Prometheus实例的预聚合规则
     *
     * 该接口用于给Prometheus实例创建预聚合规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateRecordingRuleRequest 请求对象
     * @return CreateRecordingRuleResponse
     */
    public CreateRecordingRuleResponse createRecordingRule(CreateRecordingRuleRequest request) {
        return hcClient.syncInvokeHttp(request, AomMeta.createRecordingRule);
    }

    /**
     * 创建Prometheus实例的预聚合规则
     *
     * 该接口用于给Prometheus实例创建预聚合规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateRecordingRuleRequest 请求对象
     * @return SyncInvoker<CreateRecordingRuleRequest, CreateRecordingRuleResponse>
     */
    public SyncInvoker<CreateRecordingRuleRequest, CreateRecordingRuleResponse> createRecordingRuleInvoker(
        CreateRecordingRuleRequest request) {
        return new SyncInvoker<CreateRecordingRuleRequest, CreateRecordingRuleResponse>(request,
            AomMeta.createRecordingRule, hcClient);
    }

    /**
     * 卸载托管Prometheus实例
     *
     * 该接口用于卸载托管Prometheus实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeletePromInstanceRequest 请求对象
     * @return DeletePromInstanceResponse
     */
    public DeletePromInstanceResponse deletePromInstance(DeletePromInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, AomMeta.deletePromInstance);
    }

    /**
     * 卸载托管Prometheus实例
     *
     * 该接口用于卸载托管Prometheus实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeletePromInstanceRequest 请求对象
     * @return SyncInvoker<DeletePromInstanceRequest, DeletePromInstanceResponse>
     */
    public SyncInvoker<DeletePromInstanceRequest, DeletePromInstanceResponse> deletePromInstanceInvoker(
        DeletePromInstanceRequest request) {
        return new SyncInvoker<DeletePromInstanceRequest, DeletePromInstanceResponse>(request,
            AomMeta.deletePromInstance, hcClient);
    }

    /**
     * 获取Prometheus实例调用凭证
     *
     * 该接口用于获取Prometheus实例调用凭证。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAccessCodeRequest 请求对象
     * @return ListAccessCodeResponse
     */
    public ListAccessCodeResponse listAccessCode(ListAccessCodeRequest request) {
        return hcClient.syncInvokeHttp(request, AomMeta.listAccessCode);
    }

    /**
     * 获取Prometheus实例调用凭证
     *
     * 该接口用于获取Prometheus实例调用凭证。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAccessCodeRequest 请求对象
     * @return SyncInvoker<ListAccessCodeRequest, ListAccessCodeResponse>
     */
    public SyncInvoker<ListAccessCodeRequest, ListAccessCodeResponse> listAccessCodeInvoker(
        ListAccessCodeRequest request) {
        return new SyncInvoker<ListAccessCodeRequest, ListAccessCodeResponse>(request, AomMeta.listAccessCode,
            hcClient);
    }

    /**
     * 瞬时数据查询
     *
     * 该接口用于查询PromQL(Prometheus Query Language)在特定时间点下的计算结果。（注：接口目前开放的region为：北京四、上海一和广州）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListInstantQueryAomPromGetRequest 请求对象
     * @return ListInstantQueryAomPromGetResponse
     */
    public ListInstantQueryAomPromGetResponse listInstantQueryAomPromGet(ListInstantQueryAomPromGetRequest request) {
        return hcClient.syncInvokeHttp(request, AomMeta.listInstantQueryAomPromGet);
    }

    /**
     * 瞬时数据查询
     *
     * 该接口用于查询PromQL(Prometheus Query Language)在特定时间点下的计算结果。（注：接口目前开放的region为：北京四、上海一和广州）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListInstantQueryAomPromGetRequest 请求对象
     * @return SyncInvoker<ListInstantQueryAomPromGetRequest, ListInstantQueryAomPromGetResponse>
     */
    public SyncInvoker<ListInstantQueryAomPromGetRequest, ListInstantQueryAomPromGetResponse> listInstantQueryAomPromGetInvoker(
        ListInstantQueryAomPromGetRequest request) {
        return new SyncInvoker<ListInstantQueryAomPromGetRequest, ListInstantQueryAomPromGetResponse>(request,
            AomMeta.listInstantQueryAomPromGet, hcClient);
    }

    /**
     * 瞬时数据查询
     *
     * 该接口用于查询PromQL(Prometheus Query Language) 在特定时间点下的计算结果。（注：接口目前开放的region为：北京四、上海一和广州）
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListInstantQueryAomPromPostRequest 请求对象
     * @return ListInstantQueryAomPromPostResponse
     */
    public ListInstantQueryAomPromPostResponse listInstantQueryAomPromPost(ListInstantQueryAomPromPostRequest request) {
        return hcClient.syncInvokeHttp(request, AomMeta.listInstantQueryAomPromPost);
    }

    /**
     * 瞬时数据查询
     *
     * 该接口用于查询PromQL(Prometheus Query Language) 在特定时间点下的计算结果。（注：接口目前开放的region为：北京四、上海一和广州）
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListInstantQueryAomPromPostRequest 请求对象
     * @return SyncInvoker<ListInstantQueryAomPromPostRequest, ListInstantQueryAomPromPostResponse>
     */
    public SyncInvoker<ListInstantQueryAomPromPostRequest, ListInstantQueryAomPromPostResponse> listInstantQueryAomPromPostInvoker(
        ListInstantQueryAomPromPostRequest request) {
        return new SyncInvoker<ListInstantQueryAomPromPostRequest, ListInstantQueryAomPromPostResponse>(request,
            AomMeta.listInstantQueryAomPromPost, hcClient);
    }

    /**
     * 查询标签值
     *
     * 该接口用于查询带有指定标签的时间序列列表。（注：接口目前开放的region为：北京四、上海一和广州）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListLabelValuesAomPromGetRequest 请求对象
     * @return ListLabelValuesAomPromGetResponse
     */
    public ListLabelValuesAomPromGetResponse listLabelValuesAomPromGet(ListLabelValuesAomPromGetRequest request) {
        return hcClient.syncInvokeHttp(request, AomMeta.listLabelValuesAomPromGet);
    }

    /**
     * 查询标签值
     *
     * 该接口用于查询带有指定标签的时间序列列表。（注：接口目前开放的region为：北京四、上海一和广州）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListLabelValuesAomPromGetRequest 请求对象
     * @return SyncInvoker<ListLabelValuesAomPromGetRequest, ListLabelValuesAomPromGetResponse>
     */
    public SyncInvoker<ListLabelValuesAomPromGetRequest, ListLabelValuesAomPromGetResponse> listLabelValuesAomPromGetInvoker(
        ListLabelValuesAomPromGetRequest request) {
        return new SyncInvoker<ListLabelValuesAomPromGetRequest, ListLabelValuesAomPromGetResponse>(request,
            AomMeta.listLabelValuesAomPromGet, hcClient);
    }

    /**
     * 获取标签名列表
     *
     * 该接口用于获取标签名列表。（注：接口目前开放的region为：北京四、上海一和广州）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListLabelsAomPromGetRequest 请求对象
     * @return ListLabelsAomPromGetResponse
     */
    public ListLabelsAomPromGetResponse listLabelsAomPromGet(ListLabelsAomPromGetRequest request) {
        return hcClient.syncInvokeHttp(request, AomMeta.listLabelsAomPromGet);
    }

    /**
     * 获取标签名列表
     *
     * 该接口用于获取标签名列表。（注：接口目前开放的region为：北京四、上海一和广州）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListLabelsAomPromGetRequest 请求对象
     * @return SyncInvoker<ListLabelsAomPromGetRequest, ListLabelsAomPromGetResponse>
     */
    public SyncInvoker<ListLabelsAomPromGetRequest, ListLabelsAomPromGetResponse> listLabelsAomPromGetInvoker(
        ListLabelsAomPromGetRequest request) {
        return new SyncInvoker<ListLabelsAomPromGetRequest, ListLabelsAomPromGetResponse>(request,
            AomMeta.listLabelsAomPromGet, hcClient);
    }

    /**
     * 获取标签名列表
     *
     * 该接口用于获取标签名列表。（注：接口目前开放的region为：北京四、上海一和广州）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListLabelsAomPromPostRequest 请求对象
     * @return ListLabelsAomPromPostResponse
     */
    public ListLabelsAomPromPostResponse listLabelsAomPromPost(ListLabelsAomPromPostRequest request) {
        return hcClient.syncInvokeHttp(request, AomMeta.listLabelsAomPromPost);
    }

    /**
     * 获取标签名列表
     *
     * 该接口用于获取标签名列表。（注：接口目前开放的region为：北京四、上海一和广州）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListLabelsAomPromPostRequest 请求对象
     * @return SyncInvoker<ListLabelsAomPromPostRequest, ListLabelsAomPromPostResponse>
     */
    public SyncInvoker<ListLabelsAomPromPostRequest, ListLabelsAomPromPostResponse> listLabelsAomPromPostInvoker(
        ListLabelsAomPromPostRequest request) {
        return new SyncInvoker<ListLabelsAomPromPostRequest, ListLabelsAomPromPostResponse>(request,
            AomMeta.listLabelsAomPromPost, hcClient);
    }

    /**
     * 元数据查询
     *
     * 该接口用于查询序列及序列标签的元数据。（注：接口目前开放的region为：北京四、上海一和广州）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListMetadataAomPromGetRequest 请求对象
     * @return ListMetadataAomPromGetResponse
     */
    public ListMetadataAomPromGetResponse listMetadataAomPromGet(ListMetadataAomPromGetRequest request) {
        return hcClient.syncInvokeHttp(request, AomMeta.listMetadataAomPromGet);
    }

    /**
     * 元数据查询
     *
     * 该接口用于查询序列及序列标签的元数据。（注：接口目前开放的region为：北京四、上海一和广州）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListMetadataAomPromGetRequest 请求对象
     * @return SyncInvoker<ListMetadataAomPromGetRequest, ListMetadataAomPromGetResponse>
     */
    public SyncInvoker<ListMetadataAomPromGetRequest, ListMetadataAomPromGetResponse> listMetadataAomPromGetInvoker(
        ListMetadataAomPromGetRequest request) {
        return new SyncInvoker<ListMetadataAomPromGetRequest, ListMetadataAomPromGetResponse>(request,
            AomMeta.listMetadataAomPromGet, hcClient);
    }

    /**
     * 查询Prometheus实例
     *
     * 该接口用于查询Prometheus实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPromInstanceRequest 请求对象
     * @return ListPromInstanceResponse
     */
    public ListPromInstanceResponse listPromInstance(ListPromInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, AomMeta.listPromInstance);
    }

    /**
     * 查询Prometheus实例
     *
     * 该接口用于查询Prometheus实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPromInstanceRequest 请求对象
     * @return SyncInvoker<ListPromInstanceRequest, ListPromInstanceResponse>
     */
    public SyncInvoker<ListPromInstanceRequest, ListPromInstanceResponse> listPromInstanceInvoker(
        ListPromInstanceRequest request) {
        return new SyncInvoker<ListPromInstanceRequest, ListPromInstanceResponse>(request, AomMeta.listPromInstance,
            hcClient);
    }

    /**
     * 区间数据查询
     *
     * 该接口用于查询PromQL(Prometheus Query Language)在一段时间返回内的计算结果。（注：接口目前开放的region为：北京四、上海一和广州）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRangeQueryAomPromGetRequest 请求对象
     * @return ListRangeQueryAomPromGetResponse
     */
    public ListRangeQueryAomPromGetResponse listRangeQueryAomPromGet(ListRangeQueryAomPromGetRequest request) {
        return hcClient.syncInvokeHttp(request, AomMeta.listRangeQueryAomPromGet);
    }

    /**
     * 区间数据查询
     *
     * 该接口用于查询PromQL(Prometheus Query Language)在一段时间返回内的计算结果。（注：接口目前开放的region为：北京四、上海一和广州）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRangeQueryAomPromGetRequest 请求对象
     * @return SyncInvoker<ListRangeQueryAomPromGetRequest, ListRangeQueryAomPromGetResponse>
     */
    public SyncInvoker<ListRangeQueryAomPromGetRequest, ListRangeQueryAomPromGetResponse> listRangeQueryAomPromGetInvoker(
        ListRangeQueryAomPromGetRequest request) {
        return new SyncInvoker<ListRangeQueryAomPromGetRequest, ListRangeQueryAomPromGetResponse>(request,
            AomMeta.listRangeQueryAomPromGet, hcClient);
    }

    /**
     * 区间数据查询
     *
     * 该接口用于查询PromQL(Prometheus Query Language)在一段时间返回内的计算结果。（注：接口目前开放的region为：北京四、上海一和广州）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRangeQueryAomPromPostRequest 请求对象
     * @return ListRangeQueryAomPromPostResponse
     */
    public ListRangeQueryAomPromPostResponse listRangeQueryAomPromPost(ListRangeQueryAomPromPostRequest request) {
        return hcClient.syncInvokeHttp(request, AomMeta.listRangeQueryAomPromPost);
    }

    /**
     * 区间数据查询
     *
     * 该接口用于查询PromQL(Prometheus Query Language)在一段时间返回内的计算结果。（注：接口目前开放的region为：北京四、上海一和广州）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRangeQueryAomPromPostRequest 请求对象
     * @return SyncInvoker<ListRangeQueryAomPromPostRequest, ListRangeQueryAomPromPostResponse>
     */
    public SyncInvoker<ListRangeQueryAomPromPostRequest, ListRangeQueryAomPromPostResponse> listRangeQueryAomPromPostInvoker(
        ListRangeQueryAomPromPostRequest request) {
        return new SyncInvoker<ListRangeQueryAomPromPostRequest, ListRangeQueryAomPromPostResponse>(request,
            AomMeta.listRangeQueryAomPromPost, hcClient);
    }

}
