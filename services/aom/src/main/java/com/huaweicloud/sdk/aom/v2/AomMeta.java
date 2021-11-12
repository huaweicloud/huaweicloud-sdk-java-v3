package com.huaweicloud.sdk.aom.v2;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.aom.v2.model.*;
import java.util.List;
import java.util.Map;
import java.time.OffsetDateTime;

@SuppressWarnings("unchecked")
public class AomMeta {

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
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<AddMetricDataRequest, AddMetricDataResponse> addMetricData = genForaddMetricData();

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
            }).withInnerContainerType(MetricDataItem.class)
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<AddOrUpdateServiceDiscoveryRulesRequest, AddOrUpdateServiceDiscoveryRulesResponse> addOrUpdateServiceDiscoveryRules = genForaddOrUpdateServiceDiscoveryRules();

    private static HttpRequestDef<AddOrUpdateServiceDiscoveryRulesRequest, AddOrUpdateServiceDiscoveryRulesResponse> genForaddOrUpdateServiceDiscoveryRules() {
        // basic
        HttpRequestDef.Builder<AddOrUpdateServiceDiscoveryRulesRequest, AddOrUpdateServiceDiscoveryRulesResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, AddOrUpdateServiceDiscoveryRulesRequest.class, AddOrUpdateServiceDiscoveryRulesResponse.class)
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
            })
        );

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
            })
        );
        builder.<EventQueryParam>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(EventQueryParam.class),
            f -> f.withMarshaller(CountEventsRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<DeleteAlarmRuleRequest, DeleteAlarmRuleResponse> deleteAlarmRule = genFordeleteAlarmRule();

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
            })
        );

        // response
        
        builder.<String>withResponseField(
            "body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteAlarmRuleResponse::getBody, (response, data)->{
                response.setBody(data);
            })
        );
        

        return builder.build();
    }

    public static final HttpRequestDef<DeleteAlarmRulesRequest, DeleteAlarmRulesResponse> deleteAlarmRules = genFordeleteAlarmRules();

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
            })
        );

        // response
        
        builder.<String>withResponseField(
            "body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteAlarmRulesResponse::getBody, (response, data)->{
                response.setBody(data);
            })
        );
        

        return builder.build();
    }

    public static final HttpRequestDef<DeleteserviceDiscoveryRulesRequest, DeleteserviceDiscoveryRulesResponse> deleteserviceDiscoveryRules = genFordeleteserviceDiscoveryRules();

    private static HttpRequestDef<DeleteserviceDiscoveryRulesRequest, DeleteserviceDiscoveryRulesResponse> genFordeleteserviceDiscoveryRules() {
        // basic
        HttpRequestDef.Builder<DeleteserviceDiscoveryRulesRequest, DeleteserviceDiscoveryRulesResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteserviceDiscoveryRulesRequest.class, DeleteserviceDiscoveryRulesResponse.class)
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
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListAlarmRuleRequest, ListAlarmRuleResponse> listAlarmRule = genForlistAlarmRule();

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
            })
        );
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAlarmRuleRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );

        // response
        


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
            })
        );
        builder.<EventQueryParam2>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(EventQueryParam2.class),
            f -> f.withMarshaller(ListEventsRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

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
            })
        );
        builder.<QueryBodyParam>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(QueryBodyParam.class),
            f -> f.withMarshaller(ListLogItemsRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListMetricItemsRequest, ListMetricItemsResponse> listMetricItems = genForlistMetricItems();

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
            })
        );
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMetricItemsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.<String>withRequestField("start",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMetricItemsRequest::getStart, (req, v) -> {
                req.setStart(v);
            })
        );
        builder.<MetricAPIQueryItemParam>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(MetricAPIQueryItemParam.class),
            f -> f.withMarshaller(ListMetricItemsRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


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
            })
        );
        builder.<QuerySampleParam>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(QuerySampleParam.class),
            f -> f.withMarshaller(ListSampleRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

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
            })
        );
        builder.<String>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSeriesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.<SeriesAPIQueryItemParam>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SeriesAPIQueryItemParam.class),
            f -> f.withMarshaller(ListSeriesRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListServiceDiscoveryRulesRequest, ListServiceDiscoveryRulesResponse> listServiceDiscoveryRules = genForlistServiceDiscoveryRules();

    private static HttpRequestDef<ListServiceDiscoveryRulesRequest, ListServiceDiscoveryRulesResponse> genForlistServiceDiscoveryRules() {
        // basic
        HttpRequestDef.Builder<ListServiceDiscoveryRulesRequest, ListServiceDiscoveryRulesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListServiceDiscoveryRulesRequest.class, ListServiceDiscoveryRulesResponse.class)
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
            })
        );

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
            })
        );
        builder.<String>withRequestField("x-enterprise-prject-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(PushEventsRequest::getXEnterprisePrjectId, (req, v) -> {
                req.setXEnterprisePrjectId(v);
            })
        );
        builder.<EventList>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(EventList.class),
            f -> f.withMarshaller(PushEventsRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ShowAlarmRuleRequest, ShowAlarmRuleResponse> showAlarmRule = genForshowAlarmRule();

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
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ShowMetricsDataRequest, ShowMetricsDataResponse> showMetricsData = genForshowMetricsData();

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
            })
        );
        builder.<QueryMetricDataParam>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(QueryMetricDataParam.class),
            f -> f.withMarshaller(ShowMetricsDataRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<UpdateAlarmRuleRequest, UpdateAlarmRuleResponse> updateAlarmRule = genForupdateAlarmRule();

    private static HttpRequestDef<UpdateAlarmRuleRequest, UpdateAlarmRuleResponse> genForupdateAlarmRule() {
        // basic
        HttpRequestDef.Builder<UpdateAlarmRuleRequest, UpdateAlarmRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateAlarmRuleRequest.class, UpdateAlarmRuleResponse.class)
                .withName("UpdateAlarmRule")
                .withUri("/v2/{project_id}/alarm-rules")
                .withContentType("application/json");

        // requests
        builder.<AlarmRuleParam>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AlarmRuleParam.class),
            f -> f.withMarshaller(UpdateAlarmRuleRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListInstantQueryAomPromGetRequest, ListInstantQueryAomPromGetResponse> listInstantQueryAomPromGet = genForlistInstantQueryAomPromGet();

    private static HttpRequestDef<ListInstantQueryAomPromGetRequest, ListInstantQueryAomPromGetResponse> genForlistInstantQueryAomPromGet() {
        // basic
        HttpRequestDef.Builder<ListInstantQueryAomPromGetRequest, ListInstantQueryAomPromGetResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListInstantQueryAomPromGetRequest.class, ListInstantQueryAomPromGetResponse.class)
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
            })
        );
        builder.<String>withRequestField("time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstantQueryAomPromGetRequest::getTime, (req, v) -> {
                req.setTime(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListInstantQueryAomPromPostRequest, ListInstantQueryAomPromPostResponse> listInstantQueryAomPromPost = genForlistInstantQueryAomPromPost();

    private static HttpRequestDef<ListInstantQueryAomPromPostRequest, ListInstantQueryAomPromPostResponse> genForlistInstantQueryAomPromPost() {
        // basic
        HttpRequestDef.Builder<ListInstantQueryAomPromPostRequest, ListInstantQueryAomPromPostResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListInstantQueryAomPromPostRequest.class, ListInstantQueryAomPromPostResponse.class)
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
            })
        );
        builder.<String>withRequestField("time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstantQueryAomPromPostRequest::getTime, (req, v) -> {
                req.setTime(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListLabelValuesAomPromGetRequest, ListLabelValuesAomPromGetResponse> listLabelValuesAomPromGet = genForlistLabelValuesAomPromGet();

    private static HttpRequestDef<ListLabelValuesAomPromGetRequest, ListLabelValuesAomPromGetResponse> genForlistLabelValuesAomPromGet() {
        // basic
        HttpRequestDef.Builder<ListLabelValuesAomPromGetRequest, ListLabelValuesAomPromGetResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListLabelValuesAomPromGetRequest.class, ListLabelValuesAomPromGetResponse.class)
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
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListLabelsAomPromGetRequest, ListLabelsAomPromGetResponse> listLabelsAomPromGet = genForlistLabelsAomPromGet();

    private static HttpRequestDef<ListLabelsAomPromGetRequest, ListLabelsAomPromGetResponse> genForlistLabelsAomPromGet() {
        // basic
        HttpRequestDef.Builder<ListLabelsAomPromGetRequest, ListLabelsAomPromGetResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListLabelsAomPromGetRequest.class, ListLabelsAomPromGetResponse.class)
                .withName("ListLabelsAomPromGet")
                .withUri("/v1/{project_id}/aom/api/v1/labels")
                .withContentType("application/json");

        // requests

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListLabelsAomPromPostRequest, ListLabelsAomPromPostResponse> listLabelsAomPromPost = genForlistLabelsAomPromPost();

    private static HttpRequestDef<ListLabelsAomPromPostRequest, ListLabelsAomPromPostResponse> genForlistLabelsAomPromPost() {
        // basic
        HttpRequestDef.Builder<ListLabelsAomPromPostRequest, ListLabelsAomPromPostResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListLabelsAomPromPostRequest.class, ListLabelsAomPromPostResponse.class)
                .withName("ListLabelsAomPromPost")
                .withUri("/v1/{project_id}/aom/api/v1/labels")
                .withContentType("application/json");

        // requests

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListMetadataAomPromGetRequest, ListMetadataAomPromGetResponse> listMetadataAomPromGet = genForlistMetadataAomPromGet();

    private static HttpRequestDef<ListMetadataAomPromGetRequest, ListMetadataAomPromGetResponse> genForlistMetadataAomPromGet() {
        // basic
        HttpRequestDef.Builder<ListMetadataAomPromGetRequest, ListMetadataAomPromGetResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListMetadataAomPromGetRequest.class, ListMetadataAomPromGetResponse.class)
                .withName("ListMetadataAomPromGet")
                .withUri("/v1/{project_id}/aom/api/v1/metadata")
                .withContentType("application/json");

        // requests

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListRangeQueryAomPromGetRequest, ListRangeQueryAomPromGetResponse> listRangeQueryAomPromGet = genForlistRangeQueryAomPromGet();

    private static HttpRequestDef<ListRangeQueryAomPromGetRequest, ListRangeQueryAomPromGetResponse> genForlistRangeQueryAomPromGet() {
        // basic
        HttpRequestDef.Builder<ListRangeQueryAomPromGetRequest, ListRangeQueryAomPromGetResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListRangeQueryAomPromGetRequest.class, ListRangeQueryAomPromGetResponse.class)
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
            })
        );
        builder.<String>withRequestField("start",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRangeQueryAomPromGetRequest::getStart, (req, v) -> {
                req.setStart(v);
            })
        );
        builder.<String>withRequestField("end",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRangeQueryAomPromGetRequest::getEnd, (req, v) -> {
                req.setEnd(v);
            })
        );
        builder.<String>withRequestField("step",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRangeQueryAomPromGetRequest::getStep, (req, v) -> {
                req.setStep(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListRangeQueryAomPromPostRequest, ListRangeQueryAomPromPostResponse> listRangeQueryAomPromPost = genForlistRangeQueryAomPromPost();

    private static HttpRequestDef<ListRangeQueryAomPromPostRequest, ListRangeQueryAomPromPostResponse> genForlistRangeQueryAomPromPost() {
        // basic
        HttpRequestDef.Builder<ListRangeQueryAomPromPostRequest, ListRangeQueryAomPromPostResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListRangeQueryAomPromPostRequest.class, ListRangeQueryAomPromPostResponse.class)
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
            })
        );
        builder.<String>withRequestField("start",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRangeQueryAomPromPostRequest::getStart, (req, v) -> {
                req.setStart(v);
            })
        );
        builder.<String>withRequestField("end",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRangeQueryAomPromPostRequest::getEnd, (req, v) -> {
                req.setEnd(v);
            })
        );
        builder.<String>withRequestField("step",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRangeQueryAomPromPostRequest::getStep, (req, v) -> {
                req.setStep(v);
            })
        );

        // response
        


        return builder.build();
    }

}
