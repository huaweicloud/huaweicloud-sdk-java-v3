package com.huaweicloud.sdk.aom.v2;

import com.huaweicloud.sdk.aom.v2.model.ActionRule;
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
import com.huaweicloud.sdk.aom.v2.model.AlarmRuleParam;
import com.huaweicloud.sdk.aom.v2.model.AppRulesBody;
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
import com.huaweicloud.sdk.aom.v2.model.DeleteAlarmRulesBody;
import com.huaweicloud.sdk.aom.v2.model.DeleteAlarmRulesRequest;
import com.huaweicloud.sdk.aom.v2.model.DeleteAlarmRulesResponse;
import com.huaweicloud.sdk.aom.v2.model.DeleteEvent2alarmRuleRequest;
import com.huaweicloud.sdk.aom.v2.model.DeleteEvent2alarmRuleResponse;
import com.huaweicloud.sdk.aom.v2.model.DeleteMuteRuleName;
import com.huaweicloud.sdk.aom.v2.model.DeleteMuteRulesRequest;
import com.huaweicloud.sdk.aom.v2.model.DeleteMuteRulesResponse;
import com.huaweicloud.sdk.aom.v2.model.DeletePromInstanceRequest;
import com.huaweicloud.sdk.aom.v2.model.DeletePromInstanceResponse;
import com.huaweicloud.sdk.aom.v2.model.DeleteserviceDiscoveryRulesRequest;
import com.huaweicloud.sdk.aom.v2.model.DeleteserviceDiscoveryRulesResponse;
import com.huaweicloud.sdk.aom.v2.model.Event2alarmRuleBody;
import com.huaweicloud.sdk.aom.v2.model.EventList;
import com.huaweicloud.sdk.aom.v2.model.EventQueryParam;
import com.huaweicloud.sdk.aom.v2.model.EventQueryParam2;
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
import com.huaweicloud.sdk.aom.v2.model.MetricAPIQueryItemParam;
import com.huaweicloud.sdk.aom.v2.model.MetricDataItem;
import com.huaweicloud.sdk.aom.v2.model.MuteRule;
import com.huaweicloud.sdk.aom.v2.model.PromInstanceEpsModel;
import com.huaweicloud.sdk.aom.v2.model.PushEventsRequest;
import com.huaweicloud.sdk.aom.v2.model.PushEventsResponse;
import com.huaweicloud.sdk.aom.v2.model.QueryBodyParam;
import com.huaweicloud.sdk.aom.v2.model.QueryMetricDataParam;
import com.huaweicloud.sdk.aom.v2.model.QuerySampleParam;
import com.huaweicloud.sdk.aom.v2.model.RecordingRuleRequest;
import com.huaweicloud.sdk.aom.v2.model.SeriesAPIQueryItemParam;
import com.huaweicloud.sdk.aom.v2.model.ShowActionRuleRequest;
import com.huaweicloud.sdk.aom.v2.model.ShowActionRuleResponse;
import com.huaweicloud.sdk.aom.v2.model.ShowAlarmRuleRequest;
import com.huaweicloud.sdk.aom.v2.model.ShowAlarmRuleResponse;
import com.huaweicloud.sdk.aom.v2.model.ShowMetricsDataRequest;
import com.huaweicloud.sdk.aom.v2.model.ShowMetricsDataResponse;
import com.huaweicloud.sdk.aom.v2.model.UpdateActionRuleRequest;
import com.huaweicloud.sdk.aom.v2.model.UpdateActionRuleResponse;
import com.huaweicloud.sdk.aom.v2.model.UpdateAlarmRuleParam;
import com.huaweicloud.sdk.aom.v2.model.UpdateAlarmRuleRequest;
import com.huaweicloud.sdk.aom.v2.model.UpdateAlarmRuleResponse;
import com.huaweicloud.sdk.aom.v2.model.UpdateEventRuleRequest;
import com.huaweicloud.sdk.aom.v2.model.UpdateEventRuleResponse;
import com.huaweicloud.sdk.aom.v2.model.UpdateMuteRuleRequest;
import com.huaweicloud.sdk.aom.v2.model.UpdateMuteRuleResponse;
import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;

import java.util.List;

@SuppressWarnings("unchecked")
public class AomMeta {

    public static final HttpRequestDef<AddActionRuleRequest, AddActionRuleResponse> addActionRule =
        genForaddActionRule();

    private static HttpRequestDef<AddActionRuleRequest, AddActionRuleResponse> genForaddActionRule() {
        // basic
        HttpRequestDef.Builder<AddActionRuleRequest, AddActionRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AddActionRuleRequest.class, AddActionRuleResponse.class)
                .withName("AddActionRule")
                .withUri("/v2/{project_id}/alert/action-rules")
                .withContentType("application/json");

        // requests
        builder.<ActionRule>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ActionRule.class),
            f -> f.withMarshaller(AddActionRuleRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddAlarmRuleRequest, AddAlarmRuleResponse> addAlarmRule = genForaddAlarmRule();

    private static HttpRequestDef<AddAlarmRuleRequest, AddAlarmRuleResponse> genForaddAlarmRule() {
        // basic
        HttpRequestDef.Builder<AddAlarmRuleRequest, AddAlarmRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AddAlarmRuleRequest.class, AddAlarmRuleResponse.class)
                .withName("AddAlarmRule")
                .withUri("/v2/{project_id}/alarm-rules")
                .withContentType("application/json");

        // requests
        builder.<AlarmRuleParam>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AlarmRuleParam.class),
            f -> f.withMarshaller(AddAlarmRuleRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddEvent2alarmRuleRequest, AddEvent2alarmRuleResponse> addEvent2alarmRule =
        genForaddEvent2alarmRule();

    private static HttpRequestDef<AddEvent2alarmRuleRequest, AddEvent2alarmRuleResponse> genForaddEvent2alarmRule() {
        // basic
        HttpRequestDef.Builder<AddEvent2alarmRuleRequest, AddEvent2alarmRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AddEvent2alarmRuleRequest.class, AddEvent2alarmRuleResponse.class)
                .withName("AddEvent2alarmRule")
                .withUri("/v2/{project_id}/event2alarm-rule")
                .withContentType("application/json");

        // requests
        builder.<Event2alarmRuleBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Event2alarmRuleBody.class),
            f -> f.withMarshaller(AddEvent2alarmRuleRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(AddEvent2alarmRuleResponse::getBody, (response, data) -> {
                response.setBody(data);
            }));

        return builder.build();
    }

    public static final HttpRequestDef<AddMetricDataRequest, AddMetricDataResponse> addMetricData =
        genForaddMetricData();

    private static HttpRequestDef<AddMetricDataRequest, AddMetricDataResponse> genForaddMetricData() {
        // basic
        HttpRequestDef.Builder<AddMetricDataRequest, AddMetricDataResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AddMetricDataRequest.class, AddMetricDataResponse.class)
                .withName("AddMetricData")
                .withUri("/v1/{project_id}/ams/report/metricdata")
                .withContentType("application/json");

        // requests
        builder.<List<MetricDataItem>>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(AddMetricDataRequest::getBody, (req, v) -> {
                req.setBody(v);
            }).withInnerContainerType(MetricDataItem.class));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddMuteRulesRequest, AddMuteRulesResponse> addMuteRules = genForaddMuteRules();

    private static HttpRequestDef<AddMuteRulesRequest, AddMuteRulesResponse> genForaddMuteRules() {
        // basic
        HttpRequestDef.Builder<AddMuteRulesRequest, AddMuteRulesResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AddMuteRulesRequest.class, AddMuteRulesResponse.class)
                .withName("AddMuteRules")
                .withUri("/v2/{project_id}/alert/mute-rules")
                .withContentType("application/json");

        // requests
        builder.<MuteRule>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(MuteRule.class),
            f -> f.withMarshaller(AddMuteRulesRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddOrUpdateServiceDiscoveryRulesRequest, AddOrUpdateServiceDiscoveryRulesResponse> addOrUpdateServiceDiscoveryRules =
        genForaddOrUpdateServiceDiscoveryRules();

    private static HttpRequestDef<AddOrUpdateServiceDiscoveryRulesRequest, AddOrUpdateServiceDiscoveryRulesResponse> genForaddOrUpdateServiceDiscoveryRules() {
        // basic
        HttpRequestDef.Builder<AddOrUpdateServiceDiscoveryRulesRequest, AddOrUpdateServiceDiscoveryRulesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    AddOrUpdateServiceDiscoveryRulesRequest.class,
                    AddOrUpdateServiceDiscoveryRulesResponse.class)
                .withName("AddOrUpdateServiceDiscoveryRules")
                .withUri("/v1/{project_id}/inv/servicediscoveryrules")
                .withContentType("application/json");

        // requests
        builder.<AppRulesBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(AppRulesBody.class),
            f -> f.withMarshaller(AddOrUpdateServiceDiscoveryRulesRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CountEventsRequest, CountEventsResponse> countEvents = genForcountEvents();

    private static HttpRequestDef<CountEventsRequest, CountEventsResponse> genForcountEvents() {
        // basic
        HttpRequestDef.Builder<CountEventsRequest, CountEventsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CountEventsRequest.class, CountEventsResponse.class)
                .withName("CountEvents")
                .withUri("/v2/{project_id}/events/statistic")
                .withContentType("application/json");

        // requests
        builder.<CountEventsRequest.TypeEnum>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CountEventsRequest.TypeEnum.class),
            f -> f.withMarshaller(CountEventsRequest::getType, (req, v) -> {
                req.setType(v);
            }));
        builder.<EventQueryParam>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(EventQueryParam.class),
            f -> f.withMarshaller(CountEventsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteActionRuleRequest, DeleteActionRuleResponse> deleteActionRule =
        genFordeleteActionRule();

    private static HttpRequestDef<DeleteActionRuleRequest, DeleteActionRuleResponse> genFordeleteActionRule() {
        // basic
        HttpRequestDef.Builder<DeleteActionRuleRequest, DeleteActionRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteActionRuleRequest.class, DeleteActionRuleResponse.class)
                .withName("DeleteActionRule")
                .withUri("/v2/{project_id}/alert/action-rules")
                .withContentType("application/json");

        // requests
        builder.<List<String>>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(DeleteActionRuleRequest::getBody, (req, v) -> {
                req.setBody(v);
            }).withInnerContainerType(String.class));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteAlarmRuleRequest, DeleteAlarmRuleResponse> deleteAlarmRule =
        genFordeleteAlarmRule();

    private static HttpRequestDef<DeleteAlarmRuleRequest, DeleteAlarmRuleResponse> genFordeleteAlarmRule() {
        // basic
        HttpRequestDef.Builder<DeleteAlarmRuleRequest, DeleteAlarmRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteAlarmRuleRequest.class, DeleteAlarmRuleResponse.class)
                .withName("DeleteAlarmRule")
                .withUri("/v2/{project_id}/alarm-rules/{alarm_rule_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("alarm_rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAlarmRuleRequest::getAlarmRuleId, (req, v) -> {
                req.setAlarmRuleId(v);
            }));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteAlarmRuleResponse::getBody, (response, data) -> {
                response.setBody(data);
            }));

        return builder.build();
    }

    public static final HttpRequestDef<DeleteAlarmRulesRequest, DeleteAlarmRulesResponse> deleteAlarmRules =
        genFordeleteAlarmRules();

    private static HttpRequestDef<DeleteAlarmRulesRequest, DeleteAlarmRulesResponse> genFordeleteAlarmRules() {
        // basic
        HttpRequestDef.Builder<DeleteAlarmRulesRequest, DeleteAlarmRulesResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, DeleteAlarmRulesRequest.class, DeleteAlarmRulesResponse.class)
                .withName("DeleteAlarmRules")
                .withUri("/v2/{project_id}/alarm-rules/delete")
                .withContentType("application/json");

        // requests
        builder.<DeleteAlarmRulesBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteAlarmRulesBody.class),
            f -> f.withMarshaller(DeleteAlarmRulesRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteAlarmRulesResponse::getBody, (response, data) -> {
                response.setBody(data);
            }));

        return builder.build();
    }

    public static final HttpRequestDef<DeleteEvent2alarmRuleRequest, DeleteEvent2alarmRuleResponse> deleteEvent2alarmRule =
        genFordeleteEvent2alarmRule();

    private static HttpRequestDef<DeleteEvent2alarmRuleRequest, DeleteEvent2alarmRuleResponse> genFordeleteEvent2alarmRule() {
        // basic
        HttpRequestDef.Builder<DeleteEvent2alarmRuleRequest, DeleteEvent2alarmRuleResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteEvent2alarmRuleRequest.class, DeleteEvent2alarmRuleResponse.class)
            .withName("DeleteEvent2alarmRule")
            .withUri("/v2/{project_id}/event2alarm-rule")
            .withContentType("application/json");

        // requests
        builder.<List<String>>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(DeleteEvent2alarmRuleRequest::getBody, (req, v) -> {
                req.setBody(v);
            }).withInnerContainerType(String.class));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteMuteRulesRequest, DeleteMuteRulesResponse> deleteMuteRules =
        genFordeleteMuteRules();

    private static HttpRequestDef<DeleteMuteRulesRequest, DeleteMuteRulesResponse> genFordeleteMuteRules() {
        // basic
        HttpRequestDef.Builder<DeleteMuteRulesRequest, DeleteMuteRulesResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteMuteRulesRequest.class, DeleteMuteRulesResponse.class)
                .withName("DeleteMuteRules")
                .withUri("/v2/{project_id}/alert/mute-rules")
                .withContentType("application/json");

        // requests
        builder.<List<DeleteMuteRuleName>>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(DeleteMuteRulesRequest::getBody, (req, v) -> {
                req.setBody(v);
            }).withInnerContainerType(DeleteMuteRuleName.class));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteserviceDiscoveryRulesRequest, DeleteserviceDiscoveryRulesResponse> deleteserviceDiscoveryRules =
        genFordeleteserviceDiscoveryRules();

    private static HttpRequestDef<DeleteserviceDiscoveryRulesRequest, DeleteserviceDiscoveryRulesResponse> genFordeleteserviceDiscoveryRules() {
        // basic
        HttpRequestDef.Builder<DeleteserviceDiscoveryRulesRequest, DeleteserviceDiscoveryRulesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteserviceDiscoveryRulesRequest.class,
                    DeleteserviceDiscoveryRulesResponse.class)
                .withName("DeleteserviceDiscoveryRules")
                .withUri("/v1/{project_id}/inv/servicediscoveryrules")
                .withContentType("application/json");

        // requests
        builder.<List<String>>withRequestField("appRulesIds",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(DeleteserviceDiscoveryRulesRequest::getAppRulesIds, (req, v) -> {
                req.setAppRulesIds(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListActionRuleRequest, ListActionRuleResponse> listActionRule =
        genForlistActionRule();

    private static HttpRequestDef<ListActionRuleRequest, ListActionRuleResponse> genForlistActionRule() {
        // basic
        HttpRequestDef.Builder<ListActionRuleRequest, ListActionRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListActionRuleRequest.class, ListActionRuleResponse.class)
                .withName("ListActionRule")
                .withUri("/v2/{project_id}/alert/action-rules")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAgentsRequest, ListAgentsResponse> listAgents = genForlistAgents();

    private static HttpRequestDef<ListAgentsRequest, ListAgentsResponse> genForlistAgents() {
        // basic
        HttpRequestDef.Builder<ListAgentsRequest, ListAgentsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAgentsRequest.class, ListAgentsResponse.class)
                .withName("ListAgents")
                .withUri("/v1/{project_id}/{cluster_id}/{namespace}/agents")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAgentsRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));
        builder.<String>withRequestField("namespace",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAgentsRequest::getNamespace, (req, v) -> {
                req.setNamespace(v);
            }));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListAgentsResponse::getBody, (response, data) -> {
                response.setBody(data);
            }));

        return builder.build();
    }

    public static final HttpRequestDef<ListAlarmRuleRequest, ListAlarmRuleResponse> listAlarmRule =
        genForlistAlarmRule();

    private static HttpRequestDef<ListAlarmRuleRequest, ListAlarmRuleResponse> genForlistAlarmRule() {
        // basic
        HttpRequestDef.Builder<ListAlarmRuleRequest, ListAlarmRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAlarmRuleRequest.class, ListAlarmRuleResponse.class)
                .withName("ListAlarmRule")
                .withUri("/v2/{project_id}/alarm-rules")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAlarmRuleRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAlarmRuleRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListEvent2alarmRuleRequest, ListEvent2alarmRuleResponse> listEvent2alarmRule =
        genForlistEvent2alarmRule();

    private static HttpRequestDef<ListEvent2alarmRuleRequest, ListEvent2alarmRuleResponse> genForlistEvent2alarmRule() {
        // basic
        HttpRequestDef.Builder<ListEvent2alarmRuleRequest, ListEvent2alarmRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListEvent2alarmRuleRequest.class, ListEvent2alarmRuleResponse.class)
                .withName("ListEvent2alarmRule")
                .withUri("/v2/{project_id}/event2alarm-rule")
                .withContentType("application/json");

        // requests

        // response
        builder.<List<Event2alarmRuleBody>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListEvent2alarmRuleResponse::getBody, (response, data) -> {
                response.setBody(data);
            }).withInnerContainerType(Event2alarmRuleBody.class));

        return builder.build();
    }

    public static final HttpRequestDef<ListEventsRequest, ListEventsResponse> listEvents = genForlistEvents();

    private static HttpRequestDef<ListEventsRequest, ListEventsResponse> genForlistEvents() {
        // basic
        HttpRequestDef.Builder<ListEventsRequest, ListEventsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListEventsRequest.class, ListEventsResponse.class)
                .withName("ListEvents")
                .withUri("/v2/{project_id}/events")
                .withContentType("application/json");

        // requests
        builder.<ListEventsRequest.TypeEnum>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListEventsRequest.TypeEnum.class),
            f -> f.withMarshaller(ListEventsRequest::getType, (req, v) -> {
                req.setType(v);
            }));
        builder.<EventQueryParam2>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(EventQueryParam2.class),
            f -> f.withMarshaller(ListEventsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListLogItemsRequest, ListLogItemsResponse> listLogItems = genForlistLogItems();

    private static HttpRequestDef<ListLogItemsRequest, ListLogItemsResponse> genForlistLogItems() {
        // basic
        HttpRequestDef.Builder<ListLogItemsRequest, ListLogItemsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListLogItemsRequest.class, ListLogItemsResponse.class)
                .withName("ListLogItems")
                .withUri("/v1/{project_id}/als/action")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLogItemsRequest::getType, (req, v) -> {
                req.setType(v);
            }));
        builder.<QueryBodyParam>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(QueryBodyParam.class),
            f -> f.withMarshaller(ListLogItemsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListMetricItemsRequest, ListMetricItemsResponse> listMetricItems =
        genForlistMetricItems();

    private static HttpRequestDef<ListMetricItemsRequest, ListMetricItemsResponse> genForlistMetricItems() {
        // basic
        HttpRequestDef.Builder<ListMetricItemsRequest, ListMetricItemsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListMetricItemsRequest.class, ListMetricItemsResponse.class)
                .withName("ListMetricItems")
                .withUri("/v1/{project_id}/ams/metrics")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMetricItemsRequest::getType, (req, v) -> {
                req.setType(v);
            }));
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMetricItemsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("start",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMetricItemsRequest::getStart, (req, v) -> {
                req.setStart(v);
            }));
        builder.<MetricAPIQueryItemParam>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(MetricAPIQueryItemParam.class),
            f -> f.withMarshaller(ListMetricItemsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListMuteRuleRequest, ListMuteRuleResponse> listMuteRule = genForlistMuteRule();

    private static HttpRequestDef<ListMuteRuleRequest, ListMuteRuleResponse> genForlistMuteRule() {
        // basic
        HttpRequestDef.Builder<ListMuteRuleRequest, ListMuteRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListMuteRuleRequest.class, ListMuteRuleResponse.class)
                .withName("ListMuteRule")
                .withUri("/v2/{project_id}/alert/mute-rules")
                .withContentType("application/json");

        // requests

        // response
        builder.<List<MuteRule>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListMuteRuleResponse::getBody, (response, data) -> {
                response.setBody(data);
            }).withInnerContainerType(MuteRule.class));

        return builder.build();
    }

    public static final HttpRequestDef<ListNotifiedHistoriesRequest, ListNotifiedHistoriesResponse> listNotifiedHistories =
        genForlistNotifiedHistories();

    private static HttpRequestDef<ListNotifiedHistoriesRequest, ListNotifiedHistoriesResponse> genForlistNotifiedHistories() {
        // basic
        HttpRequestDef.Builder<ListNotifiedHistoriesRequest, ListNotifiedHistoriesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListNotifiedHistoriesRequest.class, ListNotifiedHistoriesResponse.class)
            .withName("ListNotifiedHistories")
            .withUri("/v2/{project_id}/alarm-notified-histories")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("event_sn",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNotifiedHistoriesRequest::getEventSn, (req, v) -> {
                req.setEventSn(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPermissionsRequest, ListPermissionsResponse> listPermissions =
        genForlistPermissions();

    private static HttpRequestDef<ListPermissionsRequest, ListPermissionsResponse> genForlistPermissions() {
        // basic
        HttpRequestDef.Builder<ListPermissionsRequest, ListPermissionsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListPermissionsRequest.class, ListPermissionsResponse.class)
                .withName("ListPermissions")
                .withUri("/v1/{project_id}/aom/auth/grant")
                .withContentType("application/json");

        // requests

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListPermissionsResponse::getBody, (response, data) -> {
                response.setBody(data);
            }));

        return builder.build();
    }

    public static final HttpRequestDef<ListSampleRequest, ListSampleResponse> listSample = genForlistSample();

    private static HttpRequestDef<ListSampleRequest, ListSampleResponse> genForlistSample() {
        // basic
        HttpRequestDef.Builder<ListSampleRequest, ListSampleResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListSampleRequest.class, ListSampleResponse.class)
                .withName("ListSample")
                .withUri("/v2/{project_id}/samples")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("fill_value",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSampleRequest::getFillValue, (req, v) -> {
                req.setFillValue(v);
            }));
        builder.<QuerySampleParam>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(QuerySampleParam.class),
            f -> f.withMarshaller(ListSampleRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSeriesRequest, ListSeriesResponse> listSeries = genForlistSeries();

    private static HttpRequestDef<ListSeriesRequest, ListSeriesResponse> genForlistSeries() {
        // basic
        HttpRequestDef.Builder<ListSeriesRequest, ListSeriesResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListSeriesRequest.class, ListSeriesResponse.class)
                .withName("ListSeries")
                .withUri("/v2/{project_id}/series")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSeriesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSeriesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<SeriesAPIQueryItemParam>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SeriesAPIQueryItemParam.class),
            f -> f.withMarshaller(ListSeriesRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListServiceDiscoveryRulesRequest, ListServiceDiscoveryRulesResponse> listServiceDiscoveryRules =
        genForlistServiceDiscoveryRules();

    private static HttpRequestDef<ListServiceDiscoveryRulesRequest, ListServiceDiscoveryRulesResponse> genForlistServiceDiscoveryRules() {
        // basic
        HttpRequestDef.Builder<ListServiceDiscoveryRulesRequest, ListServiceDiscoveryRulesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListServiceDiscoveryRulesRequest.class,
                    ListServiceDiscoveryRulesResponse.class)
                .withName("ListServiceDiscoveryRules")
                .withUri("/v1/{project_id}/inv/servicediscoveryrules")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListServiceDiscoveryRulesRequest::getId, (req, v) -> {
                req.setId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<PushEventsRequest, PushEventsResponse> pushEvents = genForpushEvents();

    private static HttpRequestDef<PushEventsRequest, PushEventsResponse> genForpushEvents() {
        // basic
        HttpRequestDef.Builder<PushEventsRequest, PushEventsResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, PushEventsRequest.class, PushEventsResponse.class)
                .withName("PushEvents")
                .withUri("/v2/{project_id}/push/events")
                .withContentType("application/json");

        // requests
        builder.<PushEventsRequest.ActionEnum>withRequestField("action",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(PushEventsRequest.ActionEnum.class),
            f -> f.withMarshaller(PushEventsRequest::getAction, (req, v) -> {
                req.setAction(v);
            }));
        builder.<String>withRequestField("x-enterprise-prject-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(PushEventsRequest::getXEnterprisePrjectId, (req, v) -> {
                req.setXEnterprisePrjectId(v);
            }));
        builder.<EventList>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(EventList.class),
            f -> f.withMarshaller(PushEventsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowActionRuleRequest, ShowActionRuleResponse> showActionRule =
        genForshowActionRule();

    private static HttpRequestDef<ShowActionRuleRequest, ShowActionRuleResponse> genForshowActionRule() {
        // basic
        HttpRequestDef.Builder<ShowActionRuleRequest, ShowActionRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowActionRuleRequest.class, ShowActionRuleResponse.class)
                .withName("ShowActionRule")
                .withUri("/v2/{project_id}/alert/action-rules/{rule_name}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("rule_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowActionRuleRequest::getRuleName, (req, v) -> {
                req.setRuleName(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAlarmRuleRequest, ShowAlarmRuleResponse> showAlarmRule =
        genForshowAlarmRule();

    private static HttpRequestDef<ShowAlarmRuleRequest, ShowAlarmRuleResponse> genForshowAlarmRule() {
        // basic
        HttpRequestDef.Builder<ShowAlarmRuleRequest, ShowAlarmRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowAlarmRuleRequest.class, ShowAlarmRuleResponse.class)
                .withName("ShowAlarmRule")
                .withUri("/v2/{project_id}/alarm-rules/{alarm_rule_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("alarm_rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAlarmRuleRequest::getAlarmRuleId, (req, v) -> {
                req.setAlarmRuleId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowMetricsDataRequest, ShowMetricsDataResponse> showMetricsData =
        genForshowMetricsData();

    private static HttpRequestDef<ShowMetricsDataRequest, ShowMetricsDataResponse> genForshowMetricsData() {
        // basic
        HttpRequestDef.Builder<ShowMetricsDataRequest, ShowMetricsDataResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ShowMetricsDataRequest.class, ShowMetricsDataResponse.class)
                .withName("ShowMetricsData")
                .withUri("/v1/{project_id}/ams/metricdata")
                .withContentType("application/json");

        // requests
        builder.<ShowMetricsDataRequest.FillValueEnum>withRequestField("fillValue",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowMetricsDataRequest.FillValueEnum.class),
            f -> f.withMarshaller(ShowMetricsDataRequest::getFillValue, (req, v) -> {
                req.setFillValue(v);
            }));
        builder.<QueryMetricDataParam>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(QueryMetricDataParam.class),
            f -> f.withMarshaller(ShowMetricsDataRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateActionRuleRequest, UpdateActionRuleResponse> updateActionRule =
        genForupdateActionRule();

    private static HttpRequestDef<UpdateActionRuleRequest, UpdateActionRuleResponse> genForupdateActionRule() {
        // basic
        HttpRequestDef.Builder<UpdateActionRuleRequest, UpdateActionRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateActionRuleRequest.class, UpdateActionRuleResponse.class)
                .withName("UpdateActionRule")
                .withUri("/v2/{project_id}/alert/action-rules")
                .withContentType("application/json");

        // requests
        builder.<ActionRule>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ActionRule.class),
            f -> f.withMarshaller(UpdateActionRuleRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateAlarmRuleRequest, UpdateAlarmRuleResponse> updateAlarmRule =
        genForupdateAlarmRule();

    private static HttpRequestDef<UpdateAlarmRuleRequest, UpdateAlarmRuleResponse> genForupdateAlarmRule() {
        // basic
        HttpRequestDef.Builder<UpdateAlarmRuleRequest, UpdateAlarmRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateAlarmRuleRequest.class, UpdateAlarmRuleResponse.class)
                .withName("UpdateAlarmRule")
                .withUri("/v2/{project_id}/alarm-rules")
                .withContentType("application/json");

        // requests
        builder.<UpdateAlarmRuleParam>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateAlarmRuleParam.class),
            f -> f.withMarshaller(UpdateAlarmRuleRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateEventRuleRequest, UpdateEventRuleResponse> updateEventRule =
        genForupdateEventRule();

    private static HttpRequestDef<UpdateEventRuleRequest, UpdateEventRuleResponse> genForupdateEventRule() {
        // basic
        HttpRequestDef.Builder<UpdateEventRuleRequest, UpdateEventRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateEventRuleRequest.class, UpdateEventRuleResponse.class)
                .withName("UpdateEventRule")
                .withUri("/v2/{project_id}/event2alarm-rule")
                .withContentType("application/json");

        // requests
        builder.<Event2alarmRuleBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Event2alarmRuleBody.class),
            f -> f.withMarshaller(UpdateEventRuleRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateEventRuleResponse::getBody, (response, data) -> {
                response.setBody(data);
            }));

        return builder.build();
    }

    public static final HttpRequestDef<UpdateMuteRuleRequest, UpdateMuteRuleResponse> updateMuteRule =
        genForupdateMuteRule();

    private static HttpRequestDef<UpdateMuteRuleRequest, UpdateMuteRuleResponse> genForupdateMuteRule() {
        // basic
        HttpRequestDef.Builder<UpdateMuteRuleRequest, UpdateMuteRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateMuteRuleRequest.class, UpdateMuteRuleResponse.class)
                .withName("UpdateMuteRule")
                .withUri("/v2/{project_id}/alert/mute-rules")
                .withContentType("application/json");

        // requests
        builder.<MuteRule>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(MuteRule.class),
            f -> f.withMarshaller(UpdateMuteRuleRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreatePromInstanceRequest, CreatePromInstanceResponse> createPromInstance =
        genForcreatePromInstance();

    private static HttpRequestDef<CreatePromInstanceRequest, CreatePromInstanceResponse> genForcreatePromInstance() {
        // basic
        HttpRequestDef.Builder<CreatePromInstanceRequest, CreatePromInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreatePromInstanceRequest.class, CreatePromInstanceResponse.class)
                .withName("CreatePromInstance")
                .withUri("/v1/{project_id}/aom/prometheus")
                .withContentType("application/json");

        // requests
        builder.<PromInstanceEpsModel>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PromInstanceEpsModel.class),
            f -> f.withMarshaller(CreatePromInstanceRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateRecordingRuleRequest, CreateRecordingRuleResponse> createRecordingRule =
        genForcreateRecordingRule();

    private static HttpRequestDef<CreateRecordingRuleRequest, CreateRecordingRuleResponse> genForcreateRecordingRule() {
        // basic
        HttpRequestDef.Builder<CreateRecordingRuleRequest, CreateRecordingRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateRecordingRuleRequest.class, CreateRecordingRuleResponse.class)
                .withName("CreateRecordingRule")
                .withUri("/v1/{project_id}/{prometheus_instance}/aom/api/v1/rules")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("prometheus_instance",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateRecordingRuleRequest::getPrometheusInstance, (req, v) -> {
                req.setPrometheusInstance(v);
            }));
        builder.<RecordingRuleRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RecordingRuleRequest.class),
            f -> f.withMarshaller(CreateRecordingRuleRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateRecordingRuleResponse::getBody, (response, data) -> {
                response.setBody(data);
            }));

        return builder.build();
    }

    public static final HttpRequestDef<DeletePromInstanceRequest, DeletePromInstanceResponse> deletePromInstance =
        genFordeletePromInstance();

    private static HttpRequestDef<DeletePromInstanceRequest, DeletePromInstanceResponse> genFordeletePromInstance() {
        // basic
        HttpRequestDef.Builder<DeletePromInstanceRequest, DeletePromInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeletePromInstanceRequest.class, DeletePromInstanceResponse.class)
                .withName("DeletePromInstance")
                .withUri("/v1/{project_id}/aom/prometheus")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("prom_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletePromInstanceRequest::getPromId, (req, v) -> {
                req.setPromId(v);
            }));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeletePromInstanceResponse::getBody, (response, data) -> {
                response.setBody(data);
            }));

        return builder.build();
    }

    public static final HttpRequestDef<ListAccessCodeRequest, ListAccessCodeResponse> listAccessCode =
        genForlistAccessCode();

    private static HttpRequestDef<ListAccessCodeRequest, ListAccessCodeResponse> genForlistAccessCode() {
        // basic
        HttpRequestDef.Builder<ListAccessCodeRequest, ListAccessCodeResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAccessCodeRequest.class, ListAccessCodeResponse.class)
                .withName("ListAccessCode")
                .withUri("/v1/{project_id}/access-code")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListInstantQueryAomPromGetRequest, ListInstantQueryAomPromGetResponse> listInstantQueryAomPromGet =
        genForlistInstantQueryAomPromGet();

    private static HttpRequestDef<ListInstantQueryAomPromGetRequest, ListInstantQueryAomPromGetResponse> genForlistInstantQueryAomPromGet() {
        // basic
        HttpRequestDef.Builder<ListInstantQueryAomPromGetRequest, ListInstantQueryAomPromGetResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListInstantQueryAomPromGetRequest.class,
                    ListInstantQueryAomPromGetResponse.class)
                .withName("ListInstantQueryAomPromGet")
                .withUri("/v1/{project_id}/aom/api/v1/query")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("query",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstantQueryAomPromGetRequest::getQuery, (req, v) -> {
                req.setQuery(v);
            }));
        builder.<String>withRequestField("time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstantQueryAomPromGetRequest::getTime, (req, v) -> {
                req.setTime(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListInstantQueryAomPromPostRequest, ListInstantQueryAomPromPostResponse> listInstantQueryAomPromPost =
        genForlistInstantQueryAomPromPost();

    private static HttpRequestDef<ListInstantQueryAomPromPostRequest, ListInstantQueryAomPromPostResponse> genForlistInstantQueryAomPromPost() {
        // basic
        HttpRequestDef.Builder<ListInstantQueryAomPromPostRequest, ListInstantQueryAomPromPostResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ListInstantQueryAomPromPostRequest.class,
                    ListInstantQueryAomPromPostResponse.class)
                .withName("ListInstantQueryAomPromPost")
                .withUri("/v1/{project_id}/aom/api/v1/query")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("query",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstantQueryAomPromPostRequest::getQuery, (req, v) -> {
                req.setQuery(v);
            }));
        builder.<String>withRequestField("time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstantQueryAomPromPostRequest::getTime, (req, v) -> {
                req.setTime(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListLabelValuesAomPromGetRequest, ListLabelValuesAomPromGetResponse> listLabelValuesAomPromGet =
        genForlistLabelValuesAomPromGet();

    private static HttpRequestDef<ListLabelValuesAomPromGetRequest, ListLabelValuesAomPromGetResponse> genForlistLabelValuesAomPromGet() {
        // basic
        HttpRequestDef.Builder<ListLabelValuesAomPromGetRequest, ListLabelValuesAomPromGetResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListLabelValuesAomPromGetRequest.class,
                    ListLabelValuesAomPromGetResponse.class)
                .withName("ListLabelValuesAomPromGet")
                .withUri("/v1/{project_id}/aom/api/v1/label/{label_name}/values")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("label_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLabelValuesAomPromGetRequest::getLabelName, (req, v) -> {
                req.setLabelName(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListLabelsAomPromGetRequest, ListLabelsAomPromGetResponse> listLabelsAomPromGet =
        genForlistLabelsAomPromGet();

    private static HttpRequestDef<ListLabelsAomPromGetRequest, ListLabelsAomPromGetResponse> genForlistLabelsAomPromGet() {
        // basic
        HttpRequestDef.Builder<ListLabelsAomPromGetRequest, ListLabelsAomPromGetResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListLabelsAomPromGetRequest.class, ListLabelsAomPromGetResponse.class)
            .withName("ListLabelsAomPromGet")
            .withUri("/v1/{project_id}/aom/api/v1/labels")
            .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListLabelsAomPromPostRequest, ListLabelsAomPromPostResponse> listLabelsAomPromPost =
        genForlistLabelsAomPromPost();

    private static HttpRequestDef<ListLabelsAomPromPostRequest, ListLabelsAomPromPostResponse> genForlistLabelsAomPromPost() {
        // basic
        HttpRequestDef.Builder<ListLabelsAomPromPostRequest, ListLabelsAomPromPostResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ListLabelsAomPromPostRequest.class, ListLabelsAomPromPostResponse.class)
            .withName("ListLabelsAomPromPost")
            .withUri("/v1/{project_id}/aom/api/v1/labels")
            .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListMetadataAomPromGetRequest, ListMetadataAomPromGetResponse> listMetadataAomPromGet =
        genForlistMetadataAomPromGet();

    private static HttpRequestDef<ListMetadataAomPromGetRequest, ListMetadataAomPromGetResponse> genForlistMetadataAomPromGet() {
        // basic
        HttpRequestDef.Builder<ListMetadataAomPromGetRequest, ListMetadataAomPromGetResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListMetadataAomPromGetRequest.class, ListMetadataAomPromGetResponse.class)
            .withName("ListMetadataAomPromGet")
            .withUri("/v1/{project_id}/aom/api/v1/metadata")
            .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPromInstanceRequest, ListPromInstanceResponse> listPromInstance =
        genForlistPromInstance();

    private static HttpRequestDef<ListPromInstanceRequest, ListPromInstanceResponse> genForlistPromInstance() {
        // basic
        HttpRequestDef.Builder<ListPromInstanceRequest, ListPromInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListPromInstanceRequest.class, ListPromInstanceResponse.class)
                .withName("ListPromInstance")
                .withUri("/v1/{project_id}/aom/prometheus")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("prom_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPromInstanceRequest::getPromId, (req, v) -> {
                req.setPromId(v);
            }));
        builder.<ListPromInstanceRequest.PromTypeEnum>withRequestField("prom_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListPromInstanceRequest.PromTypeEnum.class),
            f -> f.withMarshaller(ListPromInstanceRequest::getPromType, (req, v) -> {
                req.setPromType(v);
            }));
        builder.<ListPromInstanceRequest.CceClusterEnableEnum>withRequestField("cce_cluster_enable",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListPromInstanceRequest.CceClusterEnableEnum.class),
            f -> f.withMarshaller(ListPromInstanceRequest::getCceClusterEnable, (req, v) -> {
                req.setCceClusterEnable(v);
            }));
        builder.<ListPromInstanceRequest.PromStatusEnum>withRequestField("prom_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListPromInstanceRequest.PromStatusEnum.class),
            f -> f.withMarshaller(ListPromInstanceRequest::getPromStatus, (req, v) -> {
                req.setPromStatus(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListRangeQueryAomPromGetRequest, ListRangeQueryAomPromGetResponse> listRangeQueryAomPromGet =
        genForlistRangeQueryAomPromGet();

    private static HttpRequestDef<ListRangeQueryAomPromGetRequest, ListRangeQueryAomPromGetResponse> genForlistRangeQueryAomPromGet() {
        // basic
        HttpRequestDef.Builder<ListRangeQueryAomPromGetRequest, ListRangeQueryAomPromGetResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ListRangeQueryAomPromGetRequest.class, ListRangeQueryAomPromGetResponse.class)
                .withName("ListRangeQueryAomPromGet")
                .withUri("/v1/{project_id}/aom/api/v1/query_range")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("query",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRangeQueryAomPromGetRequest::getQuery, (req, v) -> {
                req.setQuery(v);
            }));
        builder.<String>withRequestField("start",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRangeQueryAomPromGetRequest::getStart, (req, v) -> {
                req.setStart(v);
            }));
        builder.<String>withRequestField("end",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRangeQueryAomPromGetRequest::getEnd, (req, v) -> {
                req.setEnd(v);
            }));
        builder.<String>withRequestField("step",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRangeQueryAomPromGetRequest::getStep, (req, v) -> {
                req.setStep(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListRangeQueryAomPromPostRequest, ListRangeQueryAomPromPostResponse> listRangeQueryAomPromPost =
        genForlistRangeQueryAomPromPost();

    private static HttpRequestDef<ListRangeQueryAomPromPostRequest, ListRangeQueryAomPromPostResponse> genForlistRangeQueryAomPromPost() {
        // basic
        HttpRequestDef.Builder<ListRangeQueryAomPromPostRequest, ListRangeQueryAomPromPostResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ListRangeQueryAomPromPostRequest.class,
                    ListRangeQueryAomPromPostResponse.class)
                .withName("ListRangeQueryAomPromPost")
                .withUri("/v1/{project_id}/aom/api/v1/query_range")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("query",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRangeQueryAomPromPostRequest::getQuery, (req, v) -> {
                req.setQuery(v);
            }));
        builder.<String>withRequestField("start",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRangeQueryAomPromPostRequest::getStart, (req, v) -> {
                req.setStart(v);
            }));
        builder.<String>withRequestField("end",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRangeQueryAomPromPostRequest::getEnd, (req, v) -> {
                req.setEnd(v);
            }));
        builder.<String>withRequestField("step",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRangeQueryAomPromPostRequest::getStep, (req, v) -> {
                req.setStep(v);
            }));

        // response

        return builder.build();
    }

}
