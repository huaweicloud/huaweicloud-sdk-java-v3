package com.huaweicloud.sdk.lts.v2;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.lts.v2.model.*;

import java.util.List;
import java.util.Map;

@SuppressWarnings("unchecked")
public class LtsMeta {

    public static final HttpRequestDef<CreateKeywordsAlarmRuleRequest, CreateKeywordsAlarmRuleResponse> createKeywordsAlarmRule =
        genForcreateKeywordsAlarmRule();

    private static HttpRequestDef<CreateKeywordsAlarmRuleRequest, CreateKeywordsAlarmRuleResponse> genForcreateKeywordsAlarmRule() {
        // basic
        HttpRequestDef.Builder<CreateKeywordsAlarmRuleRequest, CreateKeywordsAlarmRuleResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateKeywordsAlarmRuleRequest.class, CreateKeywordsAlarmRuleResponse.class)
            .withName("CreateKeywordsAlarmRule")
            .withUri("/v2/{project_id}/lts/alarms/keywords-alarm-rule")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<CreateKeywordsAlarmRuleRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateKeywordsAlarmRuleRequestBody.class),
            f -> f.withMarshaller(CreateKeywordsAlarmRuleRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateLogDumpObsRequest, CreateLogDumpObsResponse> createLogDumpObs =
        genForcreateLogDumpObs();

    private static HttpRequestDef<CreateLogDumpObsRequest, CreateLogDumpObsResponse> genForcreateLogDumpObs() {
        // basic
        HttpRequestDef.Builder<CreateLogDumpObsRequest, CreateLogDumpObsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateLogDumpObsRequest.class, CreateLogDumpObsResponse.class)
                .withName("CreateLogDumpObs")
                .withUri("/v2/{project_id}/log-dump/obs")
                .withContentType("application/json");

        // requests
        builder.<CreateLogDumpObsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateLogDumpObsRequestBody.class),
            f -> f.withMarshaller(CreateLogDumpObsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateLogGroupRequest, CreateLogGroupResponse> createLogGroup =
        genForcreateLogGroup();

    private static HttpRequestDef<CreateLogGroupRequest, CreateLogGroupResponse> genForcreateLogGroup() {
        // basic
        HttpRequestDef.Builder<CreateLogGroupRequest, CreateLogGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateLogGroupRequest.class, CreateLogGroupResponse.class)
                .withName("CreateLogGroup")
                .withUri("/v2/{project_id}/groups")
                .withContentType("application/json");

        // requests
        builder.<CreateLogGroupParams>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateLogGroupParams.class),
            f -> f.withMarshaller(CreateLogGroupRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateLogStreamRequest, CreateLogStreamResponse> createLogStream =
        genForcreateLogStream();

    private static HttpRequestDef<CreateLogStreamRequest, CreateLogStreamResponse> genForcreateLogStream() {
        // basic
        HttpRequestDef.Builder<CreateLogStreamRequest, CreateLogStreamResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateLogStreamRequest.class, CreateLogStreamResponse.class)
                .withName("CreateLogStream")
                .withUri("/v2/{project_id}/groups/{log_group_id}/streams")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("log_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateLogStreamRequest::getLogGroupId, (req, v) -> {
                req.setLogGroupId(v);
            }));
        builder.<CreateLogStreamParams>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateLogStreamParams.class),
            f -> f.withMarshaller(CreateLogStreamRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateStructTemplateRequest, CreateStructTemplateResponse> createStructTemplate =
        genForcreateStructTemplate();

    private static HttpRequestDef<CreateStructTemplateRequest, CreateStructTemplateResponse> genForcreateStructTemplate() {
        // basic
        HttpRequestDef.Builder<CreateStructTemplateRequest, CreateStructTemplateResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateStructTemplateRequest.class, CreateStructTemplateResponse.class)
            .withName("CreateStructTemplate")
            .withUri("/v2/{project_id}/lts/struct/template")
            .withContentType("application/json");

        // requests
        builder.<LTSStructTemplateInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(LTSStructTemplateInfo.class),
            f -> f.withMarshaller(CreateStructTemplateRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateStructTemplateResponse::getBody, (response, data) -> {
                response.setBody(data);
            }));

        return builder.build();
    }

    public static final HttpRequestDef<DeleteActiveAlarmsRequest, DeleteActiveAlarmsResponse> deleteActiveAlarms =
        genFordeleteActiveAlarms();

    private static HttpRequestDef<DeleteActiveAlarmsRequest, DeleteActiveAlarmsResponse> genFordeleteActiveAlarms() {
        // basic
        HttpRequestDef.Builder<DeleteActiveAlarmsRequest, DeleteActiveAlarmsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, DeleteActiveAlarmsRequest.class, DeleteActiveAlarmsResponse.class)
                .withName("DeleteActiveAlarms")
                .withUri("/v2/{project_id}/{domain_id}/lts/alarms/sql-alarm/clear")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteActiveAlarmsRequest::getDomainId, (req, v) -> {
                req.setDomainId(v);
            }));
        builder.<DeleteActiveAlarmsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteActiveAlarmsRequestBody.class),
            f -> f.withMarshaller(DeleteActiveAlarmsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteKeywordsAlarmRuleRequest, DeleteKeywordsAlarmRuleResponse> deleteKeywordsAlarmRule =
        genFordeleteKeywordsAlarmRule();

    private static HttpRequestDef<DeleteKeywordsAlarmRuleRequest, DeleteKeywordsAlarmRuleResponse> genFordeleteKeywordsAlarmRule() {
        // basic
        HttpRequestDef.Builder<DeleteKeywordsAlarmRuleRequest, DeleteKeywordsAlarmRuleResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteKeywordsAlarmRuleRequest.class, DeleteKeywordsAlarmRuleResponse.class)
            .withName("DeleteKeywordsAlarmRule")
            .withUri("/v2/{project_id}/lts/alarms/keywords-alarm-rule/{keywords_alarm_rule_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("keywords_alarm_rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteKeywordsAlarmRuleRequest::getKeywordsAlarmRuleId, (req, v) -> {
                req.setKeywordsAlarmRuleId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteLogGroupRequest, DeleteLogGroupResponse> deleteLogGroup =
        genFordeleteLogGroup();

    private static HttpRequestDef<DeleteLogGroupRequest, DeleteLogGroupResponse> genFordeleteLogGroup() {
        // basic
        HttpRequestDef.Builder<DeleteLogGroupRequest, DeleteLogGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteLogGroupRequest.class, DeleteLogGroupResponse.class)
                .withName("DeleteLogGroup")
                .withUri("/v2/{project_id}/groups/{log_group_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("log_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteLogGroupRequest::getLogGroupId, (req, v) -> {
                req.setLogGroupId(v);
            }));

        // response

        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteLogGroupResponse::getBody, (response, data) -> {
                response.setBody(data);
            }));

        return builder.build();
    }

    public static final HttpRequestDef<DeleteLogStreamRequest, DeleteLogStreamResponse> deleteLogStream =
        genFordeleteLogStream();

    private static HttpRequestDef<DeleteLogStreamRequest, DeleteLogStreamResponse> genFordeleteLogStream() {
        // basic
        HttpRequestDef.Builder<DeleteLogStreamRequest, DeleteLogStreamResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteLogStreamRequest.class, DeleteLogStreamResponse.class)
                .withName("DeleteLogStream")
                .withUri("/v2/{project_id}/groups/{log_group_id}/streams/{log_stream_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("log_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteLogStreamRequest::getLogGroupId, (req, v) -> {
                req.setLogGroupId(v);
            }));
        builder.<String>withRequestField("log_stream_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteLogStreamRequest::getLogStreamId, (req, v) -> {
                req.setLogStreamId(v);
            }));

        // response

        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteLogStreamResponse::getBody, (response, data) -> {
                response.setBody(data);
            }));

        return builder.build();
    }

    public static final HttpRequestDef<DeleteStructTemplateRequest, DeleteStructTemplateResponse> deleteStructTemplate =
        genFordeleteStructTemplate();

    private static HttpRequestDef<DeleteStructTemplateRequest, DeleteStructTemplateResponse> genFordeleteStructTemplate() {
        // basic
        HttpRequestDef.Builder<DeleteStructTemplateRequest, DeleteStructTemplateResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteStructTemplateRequest.class, DeleteStructTemplateResponse.class)
            .withName("DeleteStructTemplate")
            .withUri("/v2/{project_id}/lts/struct/template")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<DeleteStructTemplateReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteStructTemplateReqBody.class),
            f -> f.withMarshaller(DeleteStructTemplateRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteStructTemplateResponse::getBody, (response, data) -> {
                response.setBody(data);
            }));

        return builder.build();
    }

    public static final HttpRequestDef<DisableLogCollectionRequest, DisableLogCollectionResponse> disableLogCollection =
        genFordisableLogCollection();

    private static HttpRequestDef<DisableLogCollectionRequest, DisableLogCollectionResponse> genFordisableLogCollection() {
        // basic
        HttpRequestDef.Builder<DisableLogCollectionRequest, DisableLogCollectionResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, DisableLogCollectionRequest.class, DisableLogCollectionResponse.class)
            .withName("DisableLogCollection")
            .withUri("/v2/{project_id}/collection/disable")
            .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<EnableLogCollectionRequest, EnableLogCollectionResponse> enableLogCollection =
        genForenableLogCollection();

    private static HttpRequestDef<EnableLogCollectionRequest, EnableLogCollectionResponse> genForenableLogCollection() {
        // basic
        HttpRequestDef.Builder<EnableLogCollectionRequest, EnableLogCollectionResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, EnableLogCollectionRequest.class, EnableLogCollectionResponse.class)
                .withName("EnableLogCollection")
                .withUri("/v2/{project_id}/collection/enable")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListActiveOrHistoryAlarmsRequest, ListActiveOrHistoryAlarmsResponse> listActiveOrHistoryAlarms =
        genForlistActiveOrHistoryAlarms();

    private static HttpRequestDef<ListActiveOrHistoryAlarmsRequest, ListActiveOrHistoryAlarmsResponse> genForlistActiveOrHistoryAlarms() {
        // basic
        HttpRequestDef.Builder<ListActiveOrHistoryAlarmsRequest, ListActiveOrHistoryAlarmsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ListActiveOrHistoryAlarmsRequest.class,
                    ListActiveOrHistoryAlarmsResponse.class)
                .withName("ListActiveOrHistoryAlarms")
                .withUri("/v2/{project_id}/{domain_id}/lts/alarms/sql-alarm/query")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListActiveOrHistoryAlarmsRequest::getDomainId, (req, v) -> {
                req.setDomainId(v);
            }));
        builder.<ListActiveOrHistoryAlarmsRequest.TypeEnum>withRequestField("type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListActiveOrHistoryAlarmsRequest.TypeEnum.class),
            f -> f.withMarshaller(ListActiveOrHistoryAlarmsRequest::getType, (req, v) -> {
                req.setType(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListActiveOrHistoryAlarmsRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListActiveOrHistoryAlarmsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<ListActiveOrHistoryAlarmsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListActiveOrHistoryAlarmsRequestBody.class),
            f -> f.withMarshaller(ListActiveOrHistoryAlarmsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListChartsRequest, ListChartsResponse> listCharts = genForlistCharts();

    private static HttpRequestDef<ListChartsRequest, ListChartsResponse> genForlistCharts() {
        // basic
        HttpRequestDef.Builder<ListChartsRequest, ListChartsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListChartsRequest.class, ListChartsResponse.class)
                .withName("ListCharts")
                .withUri("/v2/{project_id}/groups/{log_group_id}/streams/{log_stream_id}/charts")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("log_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListChartsRequest::getLogGroupId, (req, v) -> {
                req.setLogGroupId(v);
            }));
        builder.<String>withRequestField("log_stream_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListChartsRequest::getLogStreamId, (req, v) -> {
                req.setLogStreamId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListKeywordsAlarmRulesRequest, ListKeywordsAlarmRulesResponse> listKeywordsAlarmRules =
        genForlistKeywordsAlarmRules();

    private static HttpRequestDef<ListKeywordsAlarmRulesRequest, ListKeywordsAlarmRulesResponse> genForlistKeywordsAlarmRules() {
        // basic
        HttpRequestDef.Builder<ListKeywordsAlarmRulesRequest, ListKeywordsAlarmRulesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListKeywordsAlarmRulesRequest.class, ListKeywordsAlarmRulesResponse.class)
            .withName("ListKeywordsAlarmRules")
            .withUri("/v2/{project_id}/lts/alarms/keywords-alarm-rule")
            .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListLogGroupsRequest, ListLogGroupsResponse> listLogGroups =
        genForlistLogGroups();

    private static HttpRequestDef<ListLogGroupsRequest, ListLogGroupsResponse> genForlistLogGroups() {
        // basic
        HttpRequestDef.Builder<ListLogGroupsRequest, ListLogGroupsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListLogGroupsRequest.class, ListLogGroupsResponse.class)
                .withName("ListLogGroups")
                .withUri("/v2/{project_id}/groups")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListLogStreamRequest, ListLogStreamResponse> listLogStream =
        genForlistLogStream();

    private static HttpRequestDef<ListLogStreamRequest, ListLogStreamResponse> genForlistLogStream() {
        // basic
        HttpRequestDef.Builder<ListLogStreamRequest, ListLogStreamResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListLogStreamRequest.class, ListLogStreamResponse.class)
                .withName("ListLogStream")
                .withUri("/v2/{project_id}/groups/{log_group_id}/streams")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("log_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLogStreamRequest::getLogGroupId, (req, v) -> {
                req.setLogGroupId(v);
            }));
        builder.<String>withRequestField("tag",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLogStreamRequest::getTag, (req, v) -> {
                req.setTag(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListLogsRequest, ListLogsResponse> listLogs = genForlistLogs();

    private static HttpRequestDef<ListLogsRequest, ListLogsResponse> genForlistLogs() {
        // basic
        HttpRequestDef.Builder<ListLogsRequest, ListLogsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListLogsRequest.class, ListLogsResponse.class)
                .withName("ListLogs")
                .withUri("/v2/{project_id}/groups/{log_group_id}/streams/{log_stream_id}/content/query")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("log_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLogsRequest::getLogGroupId, (req, v) -> {
                req.setLogGroupId(v);
            }));
        builder.<String>withRequestField("log_stream_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLogsRequest::getLogStreamId, (req, v) -> {
                req.setLogStreamId(v);
            }));
        builder.<QueryLTSLogParams>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(QueryLTSLogParams.class),
            f -> f.withMarshaller(ListLogsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListNotificationTopicsRequest, ListNotificationTopicsResponse> listNotificationTopics =
        genForlistNotificationTopics();

    private static HttpRequestDef<ListNotificationTopicsRequest, ListNotificationTopicsResponse> genForlistNotificationTopics() {
        // basic
        HttpRequestDef.Builder<ListNotificationTopicsRequest, ListNotificationTopicsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListNotificationTopicsRequest.class, ListNotificationTopicsResponse.class)
            .withName("ListNotificationTopics")
            .withUri("/v2/{project_id}/lts/notifications/topics")
            .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListNotificationTopicsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListNotificationTopicsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListQueryStructuredLogsRequest, ListQueryStructuredLogsResponse> listQueryStructuredLogs =
        genForlistQueryStructuredLogs();

    private static HttpRequestDef<ListQueryStructuredLogsRequest, ListQueryStructuredLogsResponse> genForlistQueryStructuredLogs() {
        // basic
        HttpRequestDef.Builder<ListQueryStructuredLogsRequest, ListQueryStructuredLogsResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ListQueryStructuredLogsRequest.class, ListQueryStructuredLogsResponse.class)
            .withName("ListQueryStructuredLogs")
            .withUri("/v2/{project_id}/groups/{log_group_id}/streams/{log_stream_id}/struct-content/query")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("log_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListQueryStructuredLogsRequest::getLogGroupId, (req, v) -> {
                req.setLogGroupId(v);
            }));
        builder.<String>withRequestField("log_stream_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListQueryStructuredLogsRequest::getLogStreamId, (req, v) -> {
                req.setLogStreamId(v);
            }));
        builder.<QueryLTSStructLogParams>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(QueryLTSStructLogParams.class),
            f -> f.withMarshaller(ListQueryStructuredLogsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListStructuredLogsWithTimeRangeRequest, ListStructuredLogsWithTimeRangeResponse> listStructuredLogsWithTimeRange =
        genForlistStructuredLogsWithTimeRange();

    private static HttpRequestDef<ListStructuredLogsWithTimeRangeRequest, ListStructuredLogsWithTimeRangeResponse> genForlistStructuredLogsWithTimeRange() {
        // basic
        HttpRequestDef.Builder<ListStructuredLogsWithTimeRangeRequest, ListStructuredLogsWithTimeRangeResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ListStructuredLogsWithTimeRangeRequest.class,
                    ListStructuredLogsWithTimeRangeResponse.class)
                .withName("ListStructuredLogsWithTimeRange")
                .withUri("/v2/{project_id}/streams/{log_stream_id}/struct-content/query")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("log_stream_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStructuredLogsWithTimeRangeRequest::getLogStreamId, (req, v) -> {
                req.setLogStreamId(v);
            }));
        builder.<QueryLTSStructLogParamsNew>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(QueryLTSStructLogParamsNew.class),
            f -> f.withMarshaller(ListStructuredLogsWithTimeRangeRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        builder.<Map<String, List<Object>>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Map.class),
            f -> f.withMarshaller(ListStructuredLogsWithTimeRangeResponse::getBody, (response, data) -> {
                response.setBody(data);
            }).withInnerContainerType(List.class));

        return builder.build();
    }

    public static final HttpRequestDef<ShowStructTemplateRequest, ShowStructTemplateResponse> showStructTemplate =
        genForshowStructTemplate();

    private static HttpRequestDef<ShowStructTemplateRequest, ShowStructTemplateResponse> genForshowStructTemplate() {
        // basic
        HttpRequestDef.Builder<ShowStructTemplateRequest, ShowStructTemplateResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowStructTemplateRequest.class, ShowStructTemplateResponse.class)
                .withName("ShowStructTemplate")
                .withUri("/v2/{project_id}/lts/struct/template")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("logGroupId",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowStructTemplateRequest::getLogGroupId, (req, v) -> {
                req.setLogGroupId(v);
            }));
        builder.<String>withRequestField("logStreamId",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowStructTemplateRequest::getLogStreamId, (req, v) -> {
                req.setLogStreamId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateKeywordsAlarmRuleRequest, UpdateKeywordsAlarmRuleResponse> updateKeywordsAlarmRule =
        genForupdateKeywordsAlarmRule();

    private static HttpRequestDef<UpdateKeywordsAlarmRuleRequest, UpdateKeywordsAlarmRuleResponse> genForupdateKeywordsAlarmRule() {
        // basic
        HttpRequestDef.Builder<UpdateKeywordsAlarmRuleRequest, UpdateKeywordsAlarmRuleResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateKeywordsAlarmRuleRequest.class, UpdateKeywordsAlarmRuleResponse.class)
            .withName("UpdateKeywordsAlarmRule")
            .withUri("/v2/{project_id}/lts/alarms/keywords-alarm-rule")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<UpdateKeywordsAlarmRuleRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateKeywordsAlarmRuleRequestBody.class),
            f -> f.withMarshaller(UpdateKeywordsAlarmRuleRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateLogGroupRequest, UpdateLogGroupResponse> updateLogGroup =
        genForupdateLogGroup();

    private static HttpRequestDef<UpdateLogGroupRequest, UpdateLogGroupResponse> genForupdateLogGroup() {
        // basic
        HttpRequestDef.Builder<UpdateLogGroupRequest, UpdateLogGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UpdateLogGroupRequest.class, UpdateLogGroupResponse.class)
                .withName("UpdateLogGroup")
                .withUri("/v2/{project_id}/groups/{log_group_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("log_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateLogGroupRequest::getLogGroupId, (req, v) -> {
                req.setLogGroupId(v);
            }));
        builder.<UpdateLogGroupParams>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateLogGroupParams.class),
            f -> f.withMarshaller(UpdateLogGroupRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateStructTemplateRequest, UpdateStructTemplateResponse> updateStructTemplate =
        genForupdateStructTemplate();

    private static HttpRequestDef<UpdateStructTemplateRequest, UpdateStructTemplateResponse> genForupdateStructTemplate() {
        // basic
        HttpRequestDef.Builder<UpdateStructTemplateRequest, UpdateStructTemplateResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateStructTemplateRequest.class, UpdateStructTemplateResponse.class)
            .withName("UpdateStructTemplate")
            .withUri("/v2/{project_id}/lts/struct/template")
            .withContentType("application/json");

        // requests
        builder.<LTSStructTemplateInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(LTSStructTemplateInfo.class),
            f -> f.withMarshaller(UpdateStructTemplateRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateStructTemplateResponse::getBody, (response, data) -> {
                response.setBody(data);
            }));

        return builder.build();
    }

    public static final HttpRequestDef<CreateAomMappingRulesRequest, CreateAomMappingRulesResponse> createAomMappingRules =
        genForcreateAomMappingRules();

    private static HttpRequestDef<CreateAomMappingRulesRequest, CreateAomMappingRulesResponse> genForcreateAomMappingRules() {
        // basic
        HttpRequestDef.Builder<CreateAomMappingRulesRequest, CreateAomMappingRulesResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateAomMappingRulesRequest.class, CreateAomMappingRulesResponse.class)
            .withName("CreateAomMappingRules")
            .withUri("/v2/{project_id}/lts/aom-mapping")
            .withContentType("application/json");

        // requests
        builder.<Boolean>withRequestField("isBatch",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(CreateAomMappingRulesRequest::getIsBatch, (req, v) -> {
                req.setIsBatch(v);
            }));
        builder.<AomMappingRequestInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AomMappingRequestInfo.class),
            f -> f.withMarshaller(CreateAomMappingRulesRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        builder.<List<AomMappingRuleResp>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(CreateAomMappingRulesResponse::getBody, (response, data) -> {
                response.setBody(data);
            }).withInnerContainerType(AomMappingRuleResp.class));

        return builder.build();
    }

    public static final HttpRequestDef<DeleteAomMappingRulesRequest, DeleteAomMappingRulesResponse> deleteAomMappingRules =
        genFordeleteAomMappingRules();

    private static HttpRequestDef<DeleteAomMappingRulesRequest, DeleteAomMappingRulesResponse> genFordeleteAomMappingRules() {
        // basic
        HttpRequestDef.Builder<DeleteAomMappingRulesRequest, DeleteAomMappingRulesResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteAomMappingRulesRequest.class, DeleteAomMappingRulesResponse.class)
            .withName("DeleteAomMappingRules")
            .withUri("/v2/{project_id}/lts/aom-mapping")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAomMappingRulesRequest::getId, (req, v) -> {
                req.setId(v);
            }));

        // response

        builder.<List<String>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(DeleteAomMappingRulesResponse::getBody, (response, data) -> {
                response.setBody(data);
            }).withInnerContainerType(String.class));

        return builder.build();
    }

    public static final HttpRequestDef<ShowAomMappingRuleRequest, ShowAomMappingRuleResponse> showAomMappingRule =
        genForshowAomMappingRule();

    private static HttpRequestDef<ShowAomMappingRuleRequest, ShowAomMappingRuleResponse> genForshowAomMappingRule() {
        // basic
        HttpRequestDef.Builder<ShowAomMappingRuleRequest, ShowAomMappingRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowAomMappingRuleRequest.class, ShowAomMappingRuleResponse.class)
                .withName("ShowAomMappingRule")
                .withUri("/v2/{project_id}/lts/aom-mapping/{rule_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAomMappingRuleRequest::getRuleId, (req, v) -> {
                req.setRuleId(v);
            }));

        // response

        builder.<List<AomMappingRuleResp>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ShowAomMappingRuleResponse::getBody, (response, data) -> {
                response.setBody(data);
            }).withInnerContainerType(AomMappingRuleResp.class));

        return builder.build();
    }

    public static final HttpRequestDef<ShowAomMappingRulesRequest, ShowAomMappingRulesResponse> showAomMappingRules =
        genForshowAomMappingRules();

    private static HttpRequestDef<ShowAomMappingRulesRequest, ShowAomMappingRulesResponse> genForshowAomMappingRules() {
        // basic
        HttpRequestDef.Builder<ShowAomMappingRulesRequest, ShowAomMappingRulesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowAomMappingRulesRequest.class, ShowAomMappingRulesResponse.class)
                .withName("ShowAomMappingRules")
                .withUri("/v2/{project_id}/lts/aom-mapping")
                .withContentType("application/json");

        // requests

        // response

        builder.<List<AomMappingRuleResp>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ShowAomMappingRulesResponse::getBody, (response, data) -> {
                response.setBody(data);
            }).withInnerContainerType(AomMappingRuleResp.class));

        return builder.build();
    }

    public static final HttpRequestDef<UpdateAomMappingRulesRequest, UpdateAomMappingRulesResponse> updateAomMappingRules =
        genForupdateAomMappingRules();

    private static HttpRequestDef<UpdateAomMappingRulesRequest, UpdateAomMappingRulesResponse> genForupdateAomMappingRules() {
        // basic
        HttpRequestDef.Builder<UpdateAomMappingRulesRequest, UpdateAomMappingRulesResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateAomMappingRulesRequest.class, UpdateAomMappingRulesResponse.class)
            .withName("UpdateAomMappingRules")
            .withUri("/v2/{project_id}/lts/aom-mapping")
            .withContentType("application/json");

        // requests
        builder.<AomMappingRequestInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AomMappingRequestInfo.class),
            f -> f.withMarshaller(UpdateAomMappingRulesRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateSqlAlarmRuleRequest, CreateSqlAlarmRuleResponse> createSqlAlarmRule =
        genForcreateSqlAlarmRule();

    private static HttpRequestDef<CreateSqlAlarmRuleRequest, CreateSqlAlarmRuleResponse> genForcreateSqlAlarmRule() {
        // basic
        HttpRequestDef.Builder<CreateSqlAlarmRuleRequest, CreateSqlAlarmRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateSqlAlarmRuleRequest.class, CreateSqlAlarmRuleResponse.class)
                .withName("CreateSqlAlarmRule")
                .withUri("/v2/{project_id}/lts/alarms/sql-alarm-rule")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<CreateSqlAlarmRuleRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateSqlAlarmRuleRequestBody.class),
            f -> f.withMarshaller(CreateSqlAlarmRuleRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteSqlAlarmRuleRequest, DeleteSqlAlarmRuleResponse> deleteSqlAlarmRule =
        genFordeleteSqlAlarmRule();

    private static HttpRequestDef<DeleteSqlAlarmRuleRequest, DeleteSqlAlarmRuleResponse> genFordeleteSqlAlarmRule() {
        // basic
        HttpRequestDef.Builder<DeleteSqlAlarmRuleRequest, DeleteSqlAlarmRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteSqlAlarmRuleRequest.class, DeleteSqlAlarmRuleResponse.class)
                .withName("DeleteSqlAlarmRule")
                .withUri("/v2/{project_id}/lts/alarms/sql-alarm-rule/{sql_alarm_rule_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("sql_alarm_rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteSqlAlarmRuleRequest::getSqlAlarmRuleId, (req, v) -> {
                req.setSqlAlarmRuleId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSqlAlarmRulesRequest, ListSqlAlarmRulesResponse> listSqlAlarmRules =
        genForlistSqlAlarmRules();

    private static HttpRequestDef<ListSqlAlarmRulesRequest, ListSqlAlarmRulesResponse> genForlistSqlAlarmRules() {
        // basic
        HttpRequestDef.Builder<ListSqlAlarmRulesRequest, ListSqlAlarmRulesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListSqlAlarmRulesRequest.class, ListSqlAlarmRulesResponse.class)
                .withName("ListSqlAlarmRules")
                .withUri("/v2/{project_id}/lts/alarms/sql-alarm-rule")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateSqlAlarmRuleRequest, UpdateSqlAlarmRuleResponse> updateSqlAlarmRule =
        genForupdateSqlAlarmRule();

    private static HttpRequestDef<UpdateSqlAlarmRuleRequest, UpdateSqlAlarmRuleResponse> genForupdateSqlAlarmRule() {
        // basic
        HttpRequestDef.Builder<UpdateSqlAlarmRuleRequest, UpdateSqlAlarmRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateSqlAlarmRuleRequest.class, UpdateSqlAlarmRuleResponse.class)
                .withName("UpdateSqlAlarmRule")
                .withUri("/v2/{project_id}/lts/alarms/sql-alarm-rule")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<UpdateSqlAlarmRuleRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateSqlAlarmRuleRequestBody.class),
            f -> f.withMarshaller(UpdateSqlAlarmRuleRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

}
