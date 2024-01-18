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
import com.huaweicloud.sdk.aom.v2.model.PromInstanceRequestModel;
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
        genForAddActionRule();

    private static HttpRequestDef<AddActionRuleRequest, AddActionRuleResponse> genForAddActionRule() {
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
            f -> f.withMarshaller(AddActionRuleRequest::getBody, AddActionRuleRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddAlarmRuleRequest, AddAlarmRuleResponse> addAlarmRule = genForAddAlarmRule();

    private static HttpRequestDef<AddAlarmRuleRequest, AddAlarmRuleResponse> genForAddAlarmRule() {
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
            f -> f.withMarshaller(AddAlarmRuleRequest::getBody, AddAlarmRuleRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddEvent2alarmRuleRequest, AddEvent2alarmRuleResponse> addEvent2alarmRule =
        genForAddEvent2alarmRule();

    private static HttpRequestDef<AddEvent2alarmRuleRequest, AddEvent2alarmRuleResponse> genForAddEvent2alarmRule() {
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
            f -> f.withMarshaller(AddEvent2alarmRuleRequest::getBody, AddEvent2alarmRuleRequest::setBody));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(AddEvent2alarmRuleResponse::getBody, AddEvent2alarmRuleResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<AddMetricDataRequest, AddMetricDataResponse> addMetricData =
        genForAddMetricData();

    private static HttpRequestDef<AddMetricDataRequest, AddMetricDataResponse> genForAddMetricData() {
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
            f -> f.withMarshaller(AddMetricDataRequest::getBody, AddMetricDataRequest::setBody)
                .withInnerContainerType(MetricDataItem.class));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddMuteRulesRequest, AddMuteRulesResponse> addMuteRules = genForAddMuteRules();

    private static HttpRequestDef<AddMuteRulesRequest, AddMuteRulesResponse> genForAddMuteRules() {
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
            f -> f.withMarshaller(AddMuteRulesRequest::getBody, AddMuteRulesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddOrUpdateServiceDiscoveryRulesRequest, AddOrUpdateServiceDiscoveryRulesResponse> addOrUpdateServiceDiscoveryRules =
        genForAddOrUpdateServiceDiscoveryRules();

    private static HttpRequestDef<AddOrUpdateServiceDiscoveryRulesRequest, AddOrUpdateServiceDiscoveryRulesResponse> genForAddOrUpdateServiceDiscoveryRules() {
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
            f -> f.withMarshaller(AddOrUpdateServiceDiscoveryRulesRequest::getBody,
                AddOrUpdateServiceDiscoveryRulesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CountEventsRequest, CountEventsResponse> countEvents = genForCountEvents();

    private static HttpRequestDef<CountEventsRequest, CountEventsResponse> genForCountEvents() {
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
            f -> f.withMarshaller(CountEventsRequest::getType, CountEventsRequest::setType));
        builder.<EventQueryParam>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(EventQueryParam.class),
            f -> f.withMarshaller(CountEventsRequest::getBody, CountEventsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteActionRuleRequest, DeleteActionRuleResponse> deleteActionRule =
        genForDeleteActionRule();

    private static HttpRequestDef<DeleteActionRuleRequest, DeleteActionRuleResponse> genForDeleteActionRule() {
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
            f -> f.withMarshaller(DeleteActionRuleRequest::getBody, DeleteActionRuleRequest::setBody)
                .withInnerContainerType(String.class));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteAlarmRuleRequest, DeleteAlarmRuleResponse> deleteAlarmRule =
        genForDeleteAlarmRule();

    private static HttpRequestDef<DeleteAlarmRuleRequest, DeleteAlarmRuleResponse> genForDeleteAlarmRule() {
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
            f -> f.withMarshaller(DeleteAlarmRuleRequest::getAlarmRuleId, DeleteAlarmRuleRequest::setAlarmRuleId));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteAlarmRuleResponse::getBody, DeleteAlarmRuleResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<DeleteAlarmRulesRequest, DeleteAlarmRulesResponse> deleteAlarmRules =
        genForDeleteAlarmRules();

    private static HttpRequestDef<DeleteAlarmRulesRequest, DeleteAlarmRulesResponse> genForDeleteAlarmRules() {
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
            f -> f.withMarshaller(DeleteAlarmRulesRequest::getBody, DeleteAlarmRulesRequest::setBody));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteAlarmRulesResponse::getBody, DeleteAlarmRulesResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<DeleteEvent2alarmRuleRequest, DeleteEvent2alarmRuleResponse> deleteEvent2alarmRule =
        genForDeleteEvent2alarmRule();

    private static HttpRequestDef<DeleteEvent2alarmRuleRequest, DeleteEvent2alarmRuleResponse> genForDeleteEvent2alarmRule() {
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
            f -> f.withMarshaller(DeleteEvent2alarmRuleRequest::getBody, DeleteEvent2alarmRuleRequest::setBody)
                .withInnerContainerType(String.class));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteMuteRulesRequest, DeleteMuteRulesResponse> deleteMuteRules =
        genForDeleteMuteRules();

    private static HttpRequestDef<DeleteMuteRulesRequest, DeleteMuteRulesResponse> genForDeleteMuteRules() {
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
            f -> f.withMarshaller(DeleteMuteRulesRequest::getBody, DeleteMuteRulesRequest::setBody)
                .withInnerContainerType(DeleteMuteRuleName.class));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteserviceDiscoveryRulesRequest, DeleteserviceDiscoveryRulesResponse> deleteserviceDiscoveryRules =
        genForDeleteserviceDiscoveryRules();

    private static HttpRequestDef<DeleteserviceDiscoveryRulesRequest, DeleteserviceDiscoveryRulesResponse> genForDeleteserviceDiscoveryRules() {
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
            f -> f.withMarshaller(DeleteserviceDiscoveryRulesRequest::getAppRulesIds,
                DeleteserviceDiscoveryRulesRequest::setAppRulesIds));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListActionRuleRequest, ListActionRuleResponse> listActionRule =
        genForListActionRule();

    private static HttpRequestDef<ListActionRuleRequest, ListActionRuleResponse> genForListActionRule() {
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

    public static final HttpRequestDef<ListAgentsRequest, ListAgentsResponse> listAgents = genForListAgents();

    private static HttpRequestDef<ListAgentsRequest, ListAgentsResponse> genForListAgents() {
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
            f -> f.withMarshaller(ListAgentsRequest::getClusterId, ListAgentsRequest::setClusterId));
        builder.<String>withRequestField("namespace",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAgentsRequest::getNamespace, ListAgentsRequest::setNamespace));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListAgentsResponse::getBody, ListAgentsResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<ListAlarmRuleRequest, ListAlarmRuleResponse> listAlarmRule =
        genForListAlarmRule();

    private static HttpRequestDef<ListAlarmRuleRequest, ListAlarmRuleResponse> genForListAlarmRule() {
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
            f -> f.withMarshaller(ListAlarmRuleRequest::getOffset, ListAlarmRuleRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAlarmRuleRequest::getLimit, ListAlarmRuleRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListEvent2alarmRuleRequest, ListEvent2alarmRuleResponse> listEvent2alarmRule =
        genForListEvent2alarmRule();

    private static HttpRequestDef<ListEvent2alarmRuleRequest, ListEvent2alarmRuleResponse> genForListEvent2alarmRule() {
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
            f -> f.withMarshaller(ListEvent2alarmRuleResponse::getBody, ListEvent2alarmRuleResponse::setBody)
                .withInnerContainerType(Event2alarmRuleBody.class));

        return builder.build();
    }

    public static final HttpRequestDef<ListEventsRequest, ListEventsResponse> listEvents = genForListEvents();

    private static HttpRequestDef<ListEventsRequest, ListEventsResponse> genForListEvents() {
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
            f -> f.withMarshaller(ListEventsRequest::getType, ListEventsRequest::setType));
        builder.<EventQueryParam2>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(EventQueryParam2.class),
            f -> f.withMarshaller(ListEventsRequest::getBody, ListEventsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListLogItemsRequest, ListLogItemsResponse> listLogItems = genForListLogItems();

    private static HttpRequestDef<ListLogItemsRequest, ListLogItemsResponse> genForListLogItems() {
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
            f -> f.withMarshaller(ListLogItemsRequest::getType, ListLogItemsRequest::setType));
        builder.<QueryBodyParam>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(QueryBodyParam.class),
            f -> f.withMarshaller(ListLogItemsRequest::getBody, ListLogItemsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListMetricItemsRequest, ListMetricItemsResponse> listMetricItems =
        genForListMetricItems();

    private static HttpRequestDef<ListMetricItemsRequest, ListMetricItemsResponse> genForListMetricItems() {
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
            f -> f.withMarshaller(ListMetricItemsRequest::getType, ListMetricItemsRequest::setType));
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMetricItemsRequest::getLimit, ListMetricItemsRequest::setLimit));
        builder.<String>withRequestField("start",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMetricItemsRequest::getStart, ListMetricItemsRequest::setStart));
        builder.<MetricAPIQueryItemParam>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(MetricAPIQueryItemParam.class),
            f -> f.withMarshaller(ListMetricItemsRequest::getBody, ListMetricItemsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListMuteRuleRequest, ListMuteRuleResponse> listMuteRule = genForListMuteRule();

    private static HttpRequestDef<ListMuteRuleRequest, ListMuteRuleResponse> genForListMuteRule() {
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
            f -> f.withMarshaller(ListMuteRuleResponse::getBody, ListMuteRuleResponse::setBody)
                .withInnerContainerType(MuteRule.class));

        return builder.build();
    }

    public static final HttpRequestDef<ListNotifiedHistoriesRequest, ListNotifiedHistoriesResponse> listNotifiedHistories =
        genForListNotifiedHistories();

    private static HttpRequestDef<ListNotifiedHistoriesRequest, ListNotifiedHistoriesResponse> genForListNotifiedHistories() {
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
            f -> f.withMarshaller(ListNotifiedHistoriesRequest::getEventSn, ListNotifiedHistoriesRequest::setEventSn));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPermissionsRequest, ListPermissionsResponse> listPermissions =
        genForListPermissions();

    private static HttpRequestDef<ListPermissionsRequest, ListPermissionsResponse> genForListPermissions() {
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
            f -> f.withMarshaller(ListPermissionsResponse::getBody, ListPermissionsResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<ListSampleRequest, ListSampleResponse> listSample = genForListSample();

    private static HttpRequestDef<ListSampleRequest, ListSampleResponse> genForListSample() {
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
            f -> f.withMarshaller(ListSampleRequest::getFillValue, ListSampleRequest::setFillValue));
        builder.<QuerySampleParam>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(QuerySampleParam.class),
            f -> f.withMarshaller(ListSampleRequest::getBody, ListSampleRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSeriesRequest, ListSeriesResponse> listSeries = genForListSeries();

    private static HttpRequestDef<ListSeriesRequest, ListSeriesResponse> genForListSeries() {
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
            f -> f.withMarshaller(ListSeriesRequest::getLimit, ListSeriesRequest::setLimit));
        builder.<String>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSeriesRequest::getOffset, ListSeriesRequest::setOffset));
        builder.<SeriesAPIQueryItemParam>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SeriesAPIQueryItemParam.class),
            f -> f.withMarshaller(ListSeriesRequest::getBody, ListSeriesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListServiceDiscoveryRulesRequest, ListServiceDiscoveryRulesResponse> listServiceDiscoveryRules =
        genForListServiceDiscoveryRules();

    private static HttpRequestDef<ListServiceDiscoveryRulesRequest, ListServiceDiscoveryRulesResponse> genForListServiceDiscoveryRules() {
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
            f -> f.withMarshaller(ListServiceDiscoveryRulesRequest::getId, ListServiceDiscoveryRulesRequest::setId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<PushEventsRequest, PushEventsResponse> pushEvents = genForPushEvents();

    private static HttpRequestDef<PushEventsRequest, PushEventsResponse> genForPushEvents() {
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
            f -> f.withMarshaller(PushEventsRequest::getAction, PushEventsRequest::setAction));
        builder.<String>withRequestField("x-enterprise-prject-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(PushEventsRequest::getXEnterprisePrjectId,
                PushEventsRequest::setXEnterprisePrjectId));
        builder.<EventList>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(EventList.class),
            f -> f.withMarshaller(PushEventsRequest::getBody, PushEventsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowActionRuleRequest, ShowActionRuleResponse> showActionRule =
        genForShowActionRule();

    private static HttpRequestDef<ShowActionRuleRequest, ShowActionRuleResponse> genForShowActionRule() {
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
            f -> f.withMarshaller(ShowActionRuleRequest::getRuleName, ShowActionRuleRequest::setRuleName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAlarmRuleRequest, ShowAlarmRuleResponse> showAlarmRule =
        genForShowAlarmRule();

    private static HttpRequestDef<ShowAlarmRuleRequest, ShowAlarmRuleResponse> genForShowAlarmRule() {
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
            f -> f.withMarshaller(ShowAlarmRuleRequest::getAlarmRuleId, ShowAlarmRuleRequest::setAlarmRuleId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowMetricsDataRequest, ShowMetricsDataResponse> showMetricsData =
        genForShowMetricsData();

    private static HttpRequestDef<ShowMetricsDataRequest, ShowMetricsDataResponse> genForShowMetricsData() {
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
            f -> f.withMarshaller(ShowMetricsDataRequest::getFillValue, ShowMetricsDataRequest::setFillValue));
        builder.<QueryMetricDataParam>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(QueryMetricDataParam.class),
            f -> f.withMarshaller(ShowMetricsDataRequest::getBody, ShowMetricsDataRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateActionRuleRequest, UpdateActionRuleResponse> updateActionRule =
        genForUpdateActionRule();

    private static HttpRequestDef<UpdateActionRuleRequest, UpdateActionRuleResponse> genForUpdateActionRule() {
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
            f -> f.withMarshaller(UpdateActionRuleRequest::getBody, UpdateActionRuleRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateAlarmRuleRequest, UpdateAlarmRuleResponse> updateAlarmRule =
        genForUpdateAlarmRule();

    private static HttpRequestDef<UpdateAlarmRuleRequest, UpdateAlarmRuleResponse> genForUpdateAlarmRule() {
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
            f -> f.withMarshaller(UpdateAlarmRuleRequest::getBody, UpdateAlarmRuleRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateEventRuleRequest, UpdateEventRuleResponse> updateEventRule =
        genForUpdateEventRule();

    private static HttpRequestDef<UpdateEventRuleRequest, UpdateEventRuleResponse> genForUpdateEventRule() {
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
            f -> f.withMarshaller(UpdateEventRuleRequest::getBody, UpdateEventRuleRequest::setBody));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateEventRuleResponse::getBody, UpdateEventRuleResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<UpdateMuteRuleRequest, UpdateMuteRuleResponse> updateMuteRule =
        genForUpdateMuteRule();

    private static HttpRequestDef<UpdateMuteRuleRequest, UpdateMuteRuleResponse> genForUpdateMuteRule() {
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
            f -> f.withMarshaller(UpdateMuteRuleRequest::getBody, UpdateMuteRuleRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreatePromInstanceRequest, CreatePromInstanceResponse> createPromInstance =
        genForCreatePromInstance();

    private static HttpRequestDef<CreatePromInstanceRequest, CreatePromInstanceResponse> genForCreatePromInstance() {
        // basic
        HttpRequestDef.Builder<CreatePromInstanceRequest, CreatePromInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreatePromInstanceRequest.class, CreatePromInstanceResponse.class)
                .withName("CreatePromInstance")
                .withUri("/v1/{project_id}/aom/prometheus")
                .withContentType("application/json");

        // requests
        builder.<PromInstanceRequestModel>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PromInstanceRequestModel.class),
            f -> f.withMarshaller(CreatePromInstanceRequest::getBody, CreatePromInstanceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateRecordingRuleRequest, CreateRecordingRuleResponse> createRecordingRule =
        genForCreateRecordingRule();

    private static HttpRequestDef<CreateRecordingRuleRequest, CreateRecordingRuleResponse> genForCreateRecordingRule() {
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
            f -> f.withMarshaller(CreateRecordingRuleRequest::getPrometheusInstance,
                CreateRecordingRuleRequest::setPrometheusInstance));
        builder.<RecordingRuleRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RecordingRuleRequest.class),
            f -> f.withMarshaller(CreateRecordingRuleRequest::getBody, CreateRecordingRuleRequest::setBody));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateRecordingRuleResponse::getBody, CreateRecordingRuleResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<DeletePromInstanceRequest, DeletePromInstanceResponse> deletePromInstance =
        genForDeletePromInstance();

    private static HttpRequestDef<DeletePromInstanceRequest, DeletePromInstanceResponse> genForDeletePromInstance() {
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
            f -> f.withMarshaller(DeletePromInstanceRequest::getPromId, DeletePromInstanceRequest::setPromId));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeletePromInstanceResponse::getBody, DeletePromInstanceResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<ListAccessCodeRequest, ListAccessCodeResponse> listAccessCode =
        genForListAccessCode();

    private static HttpRequestDef<ListAccessCodeRequest, ListAccessCodeResponse> genForListAccessCode() {
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
        genForListInstantQueryAomPromGet();

    private static HttpRequestDef<ListInstantQueryAomPromGetRequest, ListInstantQueryAomPromGetResponse> genForListInstantQueryAomPromGet() {
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
            f -> f.withMarshaller(ListInstantQueryAomPromGetRequest::getQuery,
                ListInstantQueryAomPromGetRequest::setQuery));
        builder.<String>withRequestField("time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstantQueryAomPromGetRequest::getTime,
                ListInstantQueryAomPromGetRequest::setTime));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListInstantQueryAomPromPostRequest, ListInstantQueryAomPromPostResponse> listInstantQueryAomPromPost =
        genForListInstantQueryAomPromPost();

    private static HttpRequestDef<ListInstantQueryAomPromPostRequest, ListInstantQueryAomPromPostResponse> genForListInstantQueryAomPromPost() {
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
            f -> f.withMarshaller(ListInstantQueryAomPromPostRequest::getQuery,
                ListInstantQueryAomPromPostRequest::setQuery));
        builder.<String>withRequestField("time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstantQueryAomPromPostRequest::getTime,
                ListInstantQueryAomPromPostRequest::setTime));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListLabelValuesAomPromGetRequest, ListLabelValuesAomPromGetResponse> listLabelValuesAomPromGet =
        genForListLabelValuesAomPromGet();

    private static HttpRequestDef<ListLabelValuesAomPromGetRequest, ListLabelValuesAomPromGetResponse> genForListLabelValuesAomPromGet() {
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
            f -> f.withMarshaller(ListLabelValuesAomPromGetRequest::getLabelName,
                ListLabelValuesAomPromGetRequest::setLabelName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListLabelsAomPromGetRequest, ListLabelsAomPromGetResponse> listLabelsAomPromGet =
        genForListLabelsAomPromGet();

    private static HttpRequestDef<ListLabelsAomPromGetRequest, ListLabelsAomPromGetResponse> genForListLabelsAomPromGet() {
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
        genForListLabelsAomPromPost();

    private static HttpRequestDef<ListLabelsAomPromPostRequest, ListLabelsAomPromPostResponse> genForListLabelsAomPromPost() {
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
        genForListMetadataAomPromGet();

    private static HttpRequestDef<ListMetadataAomPromGetRequest, ListMetadataAomPromGetResponse> genForListMetadataAomPromGet() {
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
        genForListPromInstance();

    private static HttpRequestDef<ListPromInstanceRequest, ListPromInstanceResponse> genForListPromInstance() {
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
            f -> f.withMarshaller(ListPromInstanceRequest::getPromId, ListPromInstanceRequest::setPromId));
        builder.<ListPromInstanceRequest.PromTypeEnum>withRequestField("prom_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListPromInstanceRequest.PromTypeEnum.class),
            f -> f.withMarshaller(ListPromInstanceRequest::getPromType, ListPromInstanceRequest::setPromType));
        builder.<ListPromInstanceRequest.CceClusterEnableEnum>withRequestField("cce_cluster_enable",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListPromInstanceRequest.CceClusterEnableEnum.class),
            f -> f.withMarshaller(ListPromInstanceRequest::getCceClusterEnable,
                ListPromInstanceRequest::setCceClusterEnable));
        builder.<ListPromInstanceRequest.PromStatusEnum>withRequestField("prom_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListPromInstanceRequest.PromStatusEnum.class),
            f -> f.withMarshaller(ListPromInstanceRequest::getPromStatus, ListPromInstanceRequest::setPromStatus));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListRangeQueryAomPromGetRequest, ListRangeQueryAomPromGetResponse> listRangeQueryAomPromGet =
        genForListRangeQueryAomPromGet();

    private static HttpRequestDef<ListRangeQueryAomPromGetRequest, ListRangeQueryAomPromGetResponse> genForListRangeQueryAomPromGet() {
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
            f -> f.withMarshaller(ListRangeQueryAomPromGetRequest::getQuery,
                ListRangeQueryAomPromGetRequest::setQuery));
        builder.<String>withRequestField("start",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRangeQueryAomPromGetRequest::getStart,
                ListRangeQueryAomPromGetRequest::setStart));
        builder.<String>withRequestField("end",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRangeQueryAomPromGetRequest::getEnd, ListRangeQueryAomPromGetRequest::setEnd));
        builder.<String>withRequestField("step",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRangeQueryAomPromGetRequest::getStep, ListRangeQueryAomPromGetRequest::setStep));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListRangeQueryAomPromPostRequest, ListRangeQueryAomPromPostResponse> listRangeQueryAomPromPost =
        genForListRangeQueryAomPromPost();

    private static HttpRequestDef<ListRangeQueryAomPromPostRequest, ListRangeQueryAomPromPostResponse> genForListRangeQueryAomPromPost() {
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
            f -> f.withMarshaller(ListRangeQueryAomPromPostRequest::getQuery,
                ListRangeQueryAomPromPostRequest::setQuery));
        builder.<String>withRequestField("start",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRangeQueryAomPromPostRequest::getStart,
                ListRangeQueryAomPromPostRequest::setStart));
        builder.<String>withRequestField("end",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRangeQueryAomPromPostRequest::getEnd, ListRangeQueryAomPromPostRequest::setEnd));
        builder.<String>withRequestField("step",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRangeQueryAomPromPostRequest::getStep,
                ListRangeQueryAomPromPostRequest::setStep));

        // response

        return builder.build();
    }

}
