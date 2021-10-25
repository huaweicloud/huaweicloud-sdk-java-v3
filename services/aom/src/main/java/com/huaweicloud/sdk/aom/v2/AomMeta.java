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

}
