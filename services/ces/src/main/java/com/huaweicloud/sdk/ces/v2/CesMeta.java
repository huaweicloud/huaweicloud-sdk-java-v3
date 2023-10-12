package com.huaweicloud.sdk.ces.v2;

import com.huaweicloud.sdk.ces.v2.model.AddAlarmRuleResourcesRequest;
import com.huaweicloud.sdk.ces.v2.model.AddAlarmRuleResourcesResponse;
import com.huaweicloud.sdk.ces.v2.model.BaseWidgetInfo;
import com.huaweicloud.sdk.ces.v2.model.BatchCreateResourcesRequest;
import com.huaweicloud.sdk.ces.v2.model.BatchCreateResourcesResponse;
import com.huaweicloud.sdk.ces.v2.model.BatchDeleteAlarmRulesRequest;
import com.huaweicloud.sdk.ces.v2.model.BatchDeleteAlarmRulesResponse;
import com.huaweicloud.sdk.ces.v2.model.BatchDeleteAlarmTemplatesRequest;
import com.huaweicloud.sdk.ces.v2.model.BatchDeleteAlarmTemplatesRequestBody;
import com.huaweicloud.sdk.ces.v2.model.BatchDeleteAlarmTemplatesResponse;
import com.huaweicloud.sdk.ces.v2.model.BatchDeleteAlarmsRequestBody;
import com.huaweicloud.sdk.ces.v2.model.BatchDeleteDashboardRequestBody;
import com.huaweicloud.sdk.ces.v2.model.BatchDeleteNotificationMasksRequest;
import com.huaweicloud.sdk.ces.v2.model.BatchDeleteNotificationMasksRequestBody;
import com.huaweicloud.sdk.ces.v2.model.BatchDeleteNotificationMasksResponse;
import com.huaweicloud.sdk.ces.v2.model.BatchDeleteOneClickAlarmsRequest;
import com.huaweicloud.sdk.ces.v2.model.BatchDeleteOneClickAlarmsRequestBody;
import com.huaweicloud.sdk.ces.v2.model.BatchDeleteOneClickAlarmsResponse;
import com.huaweicloud.sdk.ces.v2.model.BatchDeleteResourceGroupsRequest;
import com.huaweicloud.sdk.ces.v2.model.BatchDeleteResourceGroupsRequestBody;
import com.huaweicloud.sdk.ces.v2.model.BatchDeleteResourceGroupsResponse;
import com.huaweicloud.sdk.ces.v2.model.BatchDeleteResourcesRequest;
import com.huaweicloud.sdk.ces.v2.model.BatchDeleteResourcesResponse;
import com.huaweicloud.sdk.ces.v2.model.BatchEnableAlarmPoliciesRequestBody;
import com.huaweicloud.sdk.ces.v2.model.BatchEnableAlarmRulesRequest;
import com.huaweicloud.sdk.ces.v2.model.BatchEnableAlarmRulesResponse;
import com.huaweicloud.sdk.ces.v2.model.BatchEnableAlarmsRequestBody;
import com.huaweicloud.sdk.ces.v2.model.BatchUpdateNotificationMaskTimeRequest;
import com.huaweicloud.sdk.ces.v2.model.BatchUpdateNotificationMaskTimeRequestBody;
import com.huaweicloud.sdk.ces.v2.model.BatchUpdateNotificationMaskTimeResponse;
import com.huaweicloud.sdk.ces.v2.model.BatchUpdateNotificationMasksRequest;
import com.huaweicloud.sdk.ces.v2.model.BatchUpdateNotificationMasksRequestBody;
import com.huaweicloud.sdk.ces.v2.model.BatchUpdateNotificationMasksResponse;
import com.huaweicloud.sdk.ces.v2.model.BatchUpdateOneClickAlarmPoliciesEnabledStateRequest;
import com.huaweicloud.sdk.ces.v2.model.BatchUpdateOneClickAlarmPoliciesEnabledStateResponse;
import com.huaweicloud.sdk.ces.v2.model.BatchUpdateOneClickAlarmsEnabledStateRequest;
import com.huaweicloud.sdk.ces.v2.model.BatchUpdateOneClickAlarmsEnabledStateResponse;
import com.huaweicloud.sdk.ces.v2.model.BatchUpdateWidgetsRequest;
import com.huaweicloud.sdk.ces.v2.model.BatchUpdateWidgetsResponse;
import com.huaweicloud.sdk.ces.v2.model.CreateAlarmRulesRequest;
import com.huaweicloud.sdk.ces.v2.model.CreateAlarmRulesResponse;
import com.huaweicloud.sdk.ces.v2.model.CreateAlarmTemplateRequest;
import com.huaweicloud.sdk.ces.v2.model.CreateAlarmTemplateRequestBody;
import com.huaweicloud.sdk.ces.v2.model.CreateAlarmTemplateResponse;
import com.huaweicloud.sdk.ces.v2.model.CreateDashboardRequestBody;
import com.huaweicloud.sdk.ces.v2.model.CreateDashboardWidgetsRequest;
import com.huaweicloud.sdk.ces.v2.model.CreateDashboardWidgetsResponse;
import com.huaweicloud.sdk.ces.v2.model.CreateOneClickAlarmRequest;
import com.huaweicloud.sdk.ces.v2.model.CreateOneClickAlarmResponse;
import com.huaweicloud.sdk.ces.v2.model.CreateOneDashboardRequest;
import com.huaweicloud.sdk.ces.v2.model.CreateOneDashboardResponse;
import com.huaweicloud.sdk.ces.v2.model.CreateResourceGroupRequest;
import com.huaweicloud.sdk.ces.v2.model.CreateResourceGroupRequestBody;
import com.huaweicloud.sdk.ces.v2.model.CreateResourceGroupResponse;
import com.huaweicloud.sdk.ces.v2.model.DeleteAlarmRuleResourcesRequest;
import com.huaweicloud.sdk.ces.v2.model.DeleteAlarmRuleResourcesResponse;
import com.huaweicloud.sdk.ces.v2.model.DeleteDashboardsRequest;
import com.huaweicloud.sdk.ces.v2.model.DeleteDashboardsResponse;
import com.huaweicloud.sdk.ces.v2.model.DeleteOneWidgetRequest;
import com.huaweicloud.sdk.ces.v2.model.DeleteOneWidgetResponse;
import com.huaweicloud.sdk.ces.v2.model.EnableOneClickAlarmRequestBody;
import com.huaweicloud.sdk.ces.v2.model.ListAgentDimensionInfoRequest;
import com.huaweicloud.sdk.ces.v2.model.ListAgentDimensionInfoResponse;
import com.huaweicloud.sdk.ces.v2.model.ListAlarmHistoriesRequest;
import com.huaweicloud.sdk.ces.v2.model.ListAlarmHistoriesResponse;
import com.huaweicloud.sdk.ces.v2.model.ListAlarmRulePoliciesRequest;
import com.huaweicloud.sdk.ces.v2.model.ListAlarmRulePoliciesResponse;
import com.huaweicloud.sdk.ces.v2.model.ListAlarmRuleResourcesRequest;
import com.huaweicloud.sdk.ces.v2.model.ListAlarmRuleResourcesResponse;
import com.huaweicloud.sdk.ces.v2.model.ListAlarmRulesRequest;
import com.huaweicloud.sdk.ces.v2.model.ListAlarmRulesResponse;
import com.huaweicloud.sdk.ces.v2.model.ListAlarmTemplateAssociationAlarmsRequest;
import com.huaweicloud.sdk.ces.v2.model.ListAlarmTemplateAssociationAlarmsResponse;
import com.huaweicloud.sdk.ces.v2.model.ListAlarmTemplatesRequest;
import com.huaweicloud.sdk.ces.v2.model.ListAlarmTemplatesResponse;
import com.huaweicloud.sdk.ces.v2.model.ListCesTargetProjectTagsRequest;
import com.huaweicloud.sdk.ces.v2.model.ListCesTargetProjectTagsResponse;
import com.huaweicloud.sdk.ces.v2.model.ListDashboardInfosRequest;
import com.huaweicloud.sdk.ces.v2.model.ListDashboardInfosResponse;
import com.huaweicloud.sdk.ces.v2.model.ListDashboardWidgetsRequest;
import com.huaweicloud.sdk.ces.v2.model.ListDashboardWidgetsResponse;
import com.huaweicloud.sdk.ces.v2.model.ListNotificationMaskRequestBody;
import com.huaweicloud.sdk.ces.v2.model.ListNotificationMaskResourcesRequest;
import com.huaweicloud.sdk.ces.v2.model.ListNotificationMaskResourcesResponse;
import com.huaweicloud.sdk.ces.v2.model.ListNotificationMasksRequest;
import com.huaweicloud.sdk.ces.v2.model.ListNotificationMasksResponse;
import com.huaweicloud.sdk.ces.v2.model.ListOneClickAlarmRulesRequest;
import com.huaweicloud.sdk.ces.v2.model.ListOneClickAlarmRulesResponse;
import com.huaweicloud.sdk.ces.v2.model.ListOneClickAlarmsRequest;
import com.huaweicloud.sdk.ces.v2.model.ListOneClickAlarmsResponse;
import com.huaweicloud.sdk.ces.v2.model.ListResourceGroupsRequest;
import com.huaweicloud.sdk.ces.v2.model.ListResourceGroupsResponse;
import com.huaweicloud.sdk.ces.v2.model.ListResourceGroupsServicesResourcesRequest;
import com.huaweicloud.sdk.ces.v2.model.ListResourceGroupsServicesResourcesResponse;
import com.huaweicloud.sdk.ces.v2.model.PoliciesReqV2;
import com.huaweicloud.sdk.ces.v2.model.PostAlarmsReqV2;
import com.huaweicloud.sdk.ces.v2.model.PutAlarmNotificationReq;
import com.huaweicloud.sdk.ces.v2.model.PutResourceGroupReq;
import com.huaweicloud.sdk.ces.v2.model.ResourcesReq;
import com.huaweicloud.sdk.ces.v2.model.ResourcesReqV2;
import com.huaweicloud.sdk.ces.v2.model.ShowAlarmTemplateRequest;
import com.huaweicloud.sdk.ces.v2.model.ShowAlarmTemplateResponse;
import com.huaweicloud.sdk.ces.v2.model.ShowResourceGroupRequest;
import com.huaweicloud.sdk.ces.v2.model.ShowResourceGroupResponse;
import com.huaweicloud.sdk.ces.v2.model.ShowWidgetRequest;
import com.huaweicloud.sdk.ces.v2.model.ShowWidgetResponse;
import com.huaweicloud.sdk.ces.v2.model.UpdateAlarmNotificationsRequest;
import com.huaweicloud.sdk.ces.v2.model.UpdateAlarmNotificationsResponse;
import com.huaweicloud.sdk.ces.v2.model.UpdateAlarmRulePoliciesRequest;
import com.huaweicloud.sdk.ces.v2.model.UpdateAlarmRulePoliciesResponse;
import com.huaweicloud.sdk.ces.v2.model.UpdateAlarmTemplateRequest;
import com.huaweicloud.sdk.ces.v2.model.UpdateAlarmTemplateRequestBody;
import com.huaweicloud.sdk.ces.v2.model.UpdateAlarmTemplateResponse;
import com.huaweicloud.sdk.ces.v2.model.UpdateDashboardRequest;
import com.huaweicloud.sdk.ces.v2.model.UpdateDashboardRequestBody;
import com.huaweicloud.sdk.ces.v2.model.UpdateDashboardResponse;
import com.huaweicloud.sdk.ces.v2.model.UpdateNotificationMasksRequest;
import com.huaweicloud.sdk.ces.v2.model.UpdateNotificationMasksRequestBody;
import com.huaweicloud.sdk.ces.v2.model.UpdateNotificationMasksResponse;
import com.huaweicloud.sdk.ces.v2.model.UpdateOneClickAlarmNotificationsRequest;
import com.huaweicloud.sdk.ces.v2.model.UpdateOneClickAlarmNotificationsResponse;
import com.huaweicloud.sdk.ces.v2.model.UpdateResourceGroupRequest;
import com.huaweicloud.sdk.ces.v2.model.UpdateResourceGroupResponse;
import com.huaweicloud.sdk.ces.v2.model.UpdateWidgetInfo;
import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;

import java.util.List;

@SuppressWarnings("unchecked")
public class CesMeta {

    public static final HttpRequestDef<AddAlarmRuleResourcesRequest, AddAlarmRuleResourcesResponse> addAlarmRuleResources =
        genForaddAlarmRuleResources();

    private static HttpRequestDef<AddAlarmRuleResourcesRequest, AddAlarmRuleResourcesResponse> genForaddAlarmRuleResources() {
        // basic
        HttpRequestDef.Builder<AddAlarmRuleResourcesRequest, AddAlarmRuleResourcesResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, AddAlarmRuleResourcesRequest.class, AddAlarmRuleResourcesResponse.class)
            .withName("AddAlarmRuleResources")
            .withUri("/v2/{project_id}/alarms/{alarm_id}/resources/batch-create")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("alarm_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddAlarmRuleResourcesRequest::getAlarmId, (req, v) -> {
                req.setAlarmId(v);
            }));
        builder.<ResourcesReqV2>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ResourcesReqV2.class),
            f -> f.withMarshaller(AddAlarmRuleResourcesRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchCreateResourcesRequest, BatchCreateResourcesResponse> batchCreateResources =
        genForbatchCreateResources();

    private static HttpRequestDef<BatchCreateResourcesRequest, BatchCreateResourcesResponse> genForbatchCreateResources() {
        // basic
        HttpRequestDef.Builder<BatchCreateResourcesRequest, BatchCreateResourcesResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, BatchCreateResourcesRequest.class, BatchCreateResourcesResponse.class)
            .withName("BatchCreateResources")
            .withUri("/v2/{project_id}/resource-groups/{group_id}/resources/batch-create")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchCreateResourcesRequest::getGroupId, (req, v) -> {
                req.setGroupId(v);
            }));
        builder.<ResourcesReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ResourcesReq.class),
            f -> f.withMarshaller(BatchCreateResourcesRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteAlarmRulesRequest, BatchDeleteAlarmRulesResponse> batchDeleteAlarmRules =
        genForbatchDeleteAlarmRules();

    private static HttpRequestDef<BatchDeleteAlarmRulesRequest, BatchDeleteAlarmRulesResponse> genForbatchDeleteAlarmRules() {
        // basic
        HttpRequestDef.Builder<BatchDeleteAlarmRulesRequest, BatchDeleteAlarmRulesResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, BatchDeleteAlarmRulesRequest.class, BatchDeleteAlarmRulesResponse.class)
            .withName("BatchDeleteAlarmRules")
            .withUri("/v2/{project_id}/alarms/batch-delete")
            .withContentType("application/json");

        // requests
        builder.<BatchDeleteAlarmsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchDeleteAlarmsRequestBody.class),
            f -> f.withMarshaller(BatchDeleteAlarmRulesRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteAlarmTemplatesRequest, BatchDeleteAlarmTemplatesResponse> batchDeleteAlarmTemplates =
        genForbatchDeleteAlarmTemplates();

    private static HttpRequestDef<BatchDeleteAlarmTemplatesRequest, BatchDeleteAlarmTemplatesResponse> genForbatchDeleteAlarmTemplates() {
        // basic
        HttpRequestDef.Builder<BatchDeleteAlarmTemplatesRequest, BatchDeleteAlarmTemplatesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    BatchDeleteAlarmTemplatesRequest.class,
                    BatchDeleteAlarmTemplatesResponse.class)
                .withName("BatchDeleteAlarmTemplates")
                .withUri("/v2/{project_id}/alarm-templates/batch-delete")
                .withContentType("application/json");

        // requests
        builder.<BatchDeleteAlarmTemplatesRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchDeleteAlarmTemplatesRequestBody.class),
            f -> f.withMarshaller(BatchDeleteAlarmTemplatesRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteNotificationMasksRequest, BatchDeleteNotificationMasksResponse> batchDeleteNotificationMasks =
        genForbatchDeleteNotificationMasks();

    private static HttpRequestDef<BatchDeleteNotificationMasksRequest, BatchDeleteNotificationMasksResponse> genForbatchDeleteNotificationMasks() {
        // basic
        HttpRequestDef.Builder<BatchDeleteNotificationMasksRequest, BatchDeleteNotificationMasksResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    BatchDeleteNotificationMasksRequest.class,
                    BatchDeleteNotificationMasksResponse.class)
                .withName("BatchDeleteNotificationMasks")
                .withUri("/v2/{project_id}/notification-masks/batch-delete")
                .withContentType("application/json");

        // requests
        builder.<BatchDeleteNotificationMasksRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchDeleteNotificationMasksRequestBody.class),
            f -> f.withMarshaller(BatchDeleteNotificationMasksRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteOneClickAlarmsRequest, BatchDeleteOneClickAlarmsResponse> batchDeleteOneClickAlarms =
        genForbatchDeleteOneClickAlarms();

    private static HttpRequestDef<BatchDeleteOneClickAlarmsRequest, BatchDeleteOneClickAlarmsResponse> genForbatchDeleteOneClickAlarms() {
        // basic
        HttpRequestDef.Builder<BatchDeleteOneClickAlarmsRequest, BatchDeleteOneClickAlarmsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    BatchDeleteOneClickAlarmsRequest.class,
                    BatchDeleteOneClickAlarmsResponse.class)
                .withName("BatchDeleteOneClickAlarms")
                .withUri("/v2/{project_id}/one-click-alarms/batch-delete")
                .withContentType("application/json");

        // requests
        builder.<BatchDeleteOneClickAlarmsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchDeleteOneClickAlarmsRequestBody.class),
            f -> f.withMarshaller(BatchDeleteOneClickAlarmsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteResourceGroupsRequest, BatchDeleteResourceGroupsResponse> batchDeleteResourceGroups =
        genForbatchDeleteResourceGroups();

    private static HttpRequestDef<BatchDeleteResourceGroupsRequest, BatchDeleteResourceGroupsResponse> genForbatchDeleteResourceGroups() {
        // basic
        HttpRequestDef.Builder<BatchDeleteResourceGroupsRequest, BatchDeleteResourceGroupsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    BatchDeleteResourceGroupsRequest.class,
                    BatchDeleteResourceGroupsResponse.class)
                .withName("BatchDeleteResourceGroups")
                .withUri("/v2/{project_id}/resource-groups/batch-delete")
                .withContentType("application/json");

        // requests
        builder.<BatchDeleteResourceGroupsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchDeleteResourceGroupsRequestBody.class),
            f -> f.withMarshaller(BatchDeleteResourceGroupsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteResourcesRequest, BatchDeleteResourcesResponse> batchDeleteResources =
        genForbatchDeleteResources();

    private static HttpRequestDef<BatchDeleteResourcesRequest, BatchDeleteResourcesResponse> genForbatchDeleteResources() {
        // basic
        HttpRequestDef.Builder<BatchDeleteResourcesRequest, BatchDeleteResourcesResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, BatchDeleteResourcesRequest.class, BatchDeleteResourcesResponse.class)
            .withName("BatchDeleteResources")
            .withUri("/v2/{project_id}/resource-groups/{group_id}/resources/batch-delete")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeleteResourcesRequest::getGroupId, (req, v) -> {
                req.setGroupId(v);
            }));
        builder.<ResourcesReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ResourcesReq.class),
            f -> f.withMarshaller(BatchDeleteResourcesRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchEnableAlarmRulesRequest, BatchEnableAlarmRulesResponse> batchEnableAlarmRules =
        genForbatchEnableAlarmRules();

    private static HttpRequestDef<BatchEnableAlarmRulesRequest, BatchEnableAlarmRulesResponse> genForbatchEnableAlarmRules() {
        // basic
        HttpRequestDef.Builder<BatchEnableAlarmRulesRequest, BatchEnableAlarmRulesResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, BatchEnableAlarmRulesRequest.class, BatchEnableAlarmRulesResponse.class)
            .withName("BatchEnableAlarmRules")
            .withUri("/v2/{project_id}/alarms/action")
            .withContentType("application/json");

        // requests
        builder.<BatchEnableAlarmsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchEnableAlarmsRequestBody.class),
            f -> f.withMarshaller(BatchEnableAlarmRulesRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchUpdateNotificationMaskTimeRequest, BatchUpdateNotificationMaskTimeResponse> batchUpdateNotificationMaskTime =
        genForbatchUpdateNotificationMaskTime();

    private static HttpRequestDef<BatchUpdateNotificationMaskTimeRequest, BatchUpdateNotificationMaskTimeResponse> genForbatchUpdateNotificationMaskTime() {
        // basic
        HttpRequestDef.Builder<BatchUpdateNotificationMaskTimeRequest, BatchUpdateNotificationMaskTimeResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    BatchUpdateNotificationMaskTimeRequest.class,
                    BatchUpdateNotificationMaskTimeResponse.class)
                .withName("BatchUpdateNotificationMaskTime")
                .withUri("/v2/{project_id}/notification-masks/batch-update")
                .withContentType("application/json");

        // requests
        builder.<BatchUpdateNotificationMaskTimeRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchUpdateNotificationMaskTimeRequestBody.class),
            f -> f.withMarshaller(BatchUpdateNotificationMaskTimeRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchUpdateNotificationMasksRequest, BatchUpdateNotificationMasksResponse> batchUpdateNotificationMasks =
        genForbatchUpdateNotificationMasks();

    private static HttpRequestDef<BatchUpdateNotificationMasksRequest, BatchUpdateNotificationMasksResponse> genForbatchUpdateNotificationMasks() {
        // basic
        HttpRequestDef.Builder<BatchUpdateNotificationMasksRequest, BatchUpdateNotificationMasksResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    BatchUpdateNotificationMasksRequest.class,
                    BatchUpdateNotificationMasksResponse.class)
                .withName("BatchUpdateNotificationMasks")
                .withUri("/v2/{project_id}/notification-masks")
                .withContentType("application/json");

        // requests
        builder.<BatchUpdateNotificationMasksRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchUpdateNotificationMasksRequestBody.class),
            f -> f.withMarshaller(BatchUpdateNotificationMasksRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchUpdateOneClickAlarmPoliciesEnabledStateRequest, BatchUpdateOneClickAlarmPoliciesEnabledStateResponse> batchUpdateOneClickAlarmPoliciesEnabledState =
        genForbatchUpdateOneClickAlarmPoliciesEnabledState();

    private static HttpRequestDef<BatchUpdateOneClickAlarmPoliciesEnabledStateRequest, BatchUpdateOneClickAlarmPoliciesEnabledStateResponse> genForbatchUpdateOneClickAlarmPoliciesEnabledState() {
        // basic
        HttpRequestDef.Builder<BatchUpdateOneClickAlarmPoliciesEnabledStateRequest, BatchUpdateOneClickAlarmPoliciesEnabledStateResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    BatchUpdateOneClickAlarmPoliciesEnabledStateRequest.class,
                    BatchUpdateOneClickAlarmPoliciesEnabledStateResponse.class)
                .withName("BatchUpdateOneClickAlarmPoliciesEnabledState")
                .withUri("/v2/{project_id}/one-click-alarms/{one_click_alarm_id}/alarms/{alarm_id}/policies/action")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("one_click_alarm_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchUpdateOneClickAlarmPoliciesEnabledStateRequest::getOneClickAlarmId, (req, v) -> {
                req.setOneClickAlarmId(v);
            }));
        builder.<String>withRequestField("alarm_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchUpdateOneClickAlarmPoliciesEnabledStateRequest::getAlarmId, (req, v) -> {
                req.setAlarmId(v);
            }));
        builder.<BatchEnableAlarmPoliciesRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchEnableAlarmPoliciesRequestBody.class),
            f -> f.withMarshaller(BatchUpdateOneClickAlarmPoliciesEnabledStateRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchUpdateOneClickAlarmsEnabledStateRequest, BatchUpdateOneClickAlarmsEnabledStateResponse> batchUpdateOneClickAlarmsEnabledState =
        genForbatchUpdateOneClickAlarmsEnabledState();

    private static HttpRequestDef<BatchUpdateOneClickAlarmsEnabledStateRequest, BatchUpdateOneClickAlarmsEnabledStateResponse> genForbatchUpdateOneClickAlarmsEnabledState() {
        // basic
        HttpRequestDef.Builder<BatchUpdateOneClickAlarmsEnabledStateRequest, BatchUpdateOneClickAlarmsEnabledStateResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    BatchUpdateOneClickAlarmsEnabledStateRequest.class,
                    BatchUpdateOneClickAlarmsEnabledStateResponse.class)
                .withName("BatchUpdateOneClickAlarmsEnabledState")
                .withUri("/v2/{project_id}/one-click-alarms/{one_click_alarm_id}/alarm-rules/action")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("one_click_alarm_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchUpdateOneClickAlarmsEnabledStateRequest::getOneClickAlarmId, (req, v) -> {
                req.setOneClickAlarmId(v);
            }));
        builder.<BatchEnableAlarmsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchEnableAlarmsRequestBody.class),
            f -> f.withMarshaller(BatchUpdateOneClickAlarmsEnabledStateRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchUpdateWidgetsRequest, BatchUpdateWidgetsResponse> batchUpdateWidgets =
        genForbatchUpdateWidgets();

    private static HttpRequestDef<BatchUpdateWidgetsRequest, BatchUpdateWidgetsResponse> genForbatchUpdateWidgets() {
        // basic
        HttpRequestDef.Builder<BatchUpdateWidgetsRequest, BatchUpdateWidgetsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchUpdateWidgetsRequest.class, BatchUpdateWidgetsResponse.class)
                .withName("BatchUpdateWidgets")
                .withUri("/v2/{project_id}/widgets/batch-update")
                .withContentType("application/json");

        // requests
        builder.<List<UpdateWidgetInfo>>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(BatchUpdateWidgetsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }).withInnerContainerType(UpdateWidgetInfo.class));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateAlarmRulesRequest, CreateAlarmRulesResponse> createAlarmRules =
        genForcreateAlarmRules();

    private static HttpRequestDef<CreateAlarmRulesRequest, CreateAlarmRulesResponse> genForcreateAlarmRules() {
        // basic
        HttpRequestDef.Builder<CreateAlarmRulesRequest, CreateAlarmRulesResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateAlarmRulesRequest.class, CreateAlarmRulesResponse.class)
                .withName("CreateAlarmRules")
                .withUri("/v2/{project_id}/alarms")
                .withContentType("application/json");

        // requests
        builder.<PostAlarmsReqV2>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PostAlarmsReqV2.class),
            f -> f.withMarshaller(CreateAlarmRulesRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateAlarmTemplateRequest, CreateAlarmTemplateResponse> createAlarmTemplate =
        genForcreateAlarmTemplate();

    private static HttpRequestDef<CreateAlarmTemplateRequest, CreateAlarmTemplateResponse> genForcreateAlarmTemplate() {
        // basic
        HttpRequestDef.Builder<CreateAlarmTemplateRequest, CreateAlarmTemplateResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateAlarmTemplateRequest.class, CreateAlarmTemplateResponse.class)
                .withName("CreateAlarmTemplate")
                .withUri("/v2/{project_id}/alarm-templates")
                .withContentType("application/json");

        // requests
        builder.<CreateAlarmTemplateRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateAlarmTemplateRequestBody.class),
            f -> f.withMarshaller(CreateAlarmTemplateRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateDashboardWidgetsRequest, CreateDashboardWidgetsResponse> createDashboardWidgets =
        genForcreateDashboardWidgets();

    private static HttpRequestDef<CreateDashboardWidgetsRequest, CreateDashboardWidgetsResponse> genForcreateDashboardWidgets() {
        // basic
        HttpRequestDef.Builder<CreateDashboardWidgetsRequest, CreateDashboardWidgetsResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateDashboardWidgetsRequest.class, CreateDashboardWidgetsResponse.class)
            .withName("CreateDashboardWidgets")
            .withUri("/v2/{project_id}/dashboards/{dashboard_id}/widgets")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("dashboard_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateDashboardWidgetsRequest::getDashboardId, (req, v) -> {
                req.setDashboardId(v);
            }));
        builder.<List<BaseWidgetInfo>>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(CreateDashboardWidgetsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }).withInnerContainerType(BaseWidgetInfo.class));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateOneClickAlarmRequest, CreateOneClickAlarmResponse> createOneClickAlarm =
        genForcreateOneClickAlarm();

    private static HttpRequestDef<CreateOneClickAlarmRequest, CreateOneClickAlarmResponse> genForcreateOneClickAlarm() {
        // basic
        HttpRequestDef.Builder<CreateOneClickAlarmRequest, CreateOneClickAlarmResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateOneClickAlarmRequest.class, CreateOneClickAlarmResponse.class)
                .withName("CreateOneClickAlarm")
                .withUri("/v2/{project_id}/one-click-alarms")
                .withContentType("application/json");

        // requests
        builder.<EnableOneClickAlarmRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(EnableOneClickAlarmRequestBody.class),
            f -> f.withMarshaller(CreateOneClickAlarmRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateOneDashboardRequest, CreateOneDashboardResponse> createOneDashboard =
        genForcreateOneDashboard();

    private static HttpRequestDef<CreateOneDashboardRequest, CreateOneDashboardResponse> genForcreateOneDashboard() {
        // basic
        HttpRequestDef.Builder<CreateOneDashboardRequest, CreateOneDashboardResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateOneDashboardRequest.class, CreateOneDashboardResponse.class)
                .withName("CreateOneDashboard")
                .withUri("/v2/{project_id}/dashboards")
                .withContentType("application/json");

        // requests
        builder.<CreateDashboardRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateDashboardRequestBody.class),
            f -> f.withMarshaller(CreateOneDashboardRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateResourceGroupRequest, CreateResourceGroupResponse> createResourceGroup =
        genForcreateResourceGroup();

    private static HttpRequestDef<CreateResourceGroupRequest, CreateResourceGroupResponse> genForcreateResourceGroup() {
        // basic
        HttpRequestDef.Builder<CreateResourceGroupRequest, CreateResourceGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateResourceGroupRequest.class, CreateResourceGroupResponse.class)
                .withName("CreateResourceGroup")
                .withUri("/v2/{project_id}/resource-groups")
                .withContentType("application/json");

        // requests
        builder.<CreateResourceGroupRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateResourceGroupRequestBody.class),
            f -> f.withMarshaller(CreateResourceGroupRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteAlarmRuleResourcesRequest, DeleteAlarmRuleResourcesResponse> deleteAlarmRuleResources =
        genFordeleteAlarmRuleResources();

    private static HttpRequestDef<DeleteAlarmRuleResourcesRequest, DeleteAlarmRuleResourcesResponse> genFordeleteAlarmRuleResources() {
        // basic
        HttpRequestDef.Builder<DeleteAlarmRuleResourcesRequest, DeleteAlarmRuleResourcesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, DeleteAlarmRuleResourcesRequest.class, DeleteAlarmRuleResourcesResponse.class)
                .withName("DeleteAlarmRuleResources")
                .withUri("/v2/{project_id}/alarms/{alarm_id}/resources/batch-delete")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("alarm_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAlarmRuleResourcesRequest::getAlarmId, (req, v) -> {
                req.setAlarmId(v);
            }));
        builder.<ResourcesReqV2>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ResourcesReqV2.class),
            f -> f.withMarshaller(DeleteAlarmRuleResourcesRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteDashboardsRequest, DeleteDashboardsResponse> deleteDashboards =
        genFordeleteDashboards();

    private static HttpRequestDef<DeleteDashboardsRequest, DeleteDashboardsResponse> genFordeleteDashboards() {
        // basic
        HttpRequestDef.Builder<DeleteDashboardsRequest, DeleteDashboardsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, DeleteDashboardsRequest.class, DeleteDashboardsResponse.class)
                .withName("DeleteDashboards")
                .withUri("/v2/{project_id}/dashboards/batch-delete")
                .withContentType("application/json");

        // requests
        builder.<BatchDeleteDashboardRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(BatchDeleteDashboardRequestBody.class),
            f -> f.withMarshaller(DeleteDashboardsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteOneWidgetRequest, DeleteOneWidgetResponse> deleteOneWidget =
        genFordeleteOneWidget();

    private static HttpRequestDef<DeleteOneWidgetRequest, DeleteOneWidgetResponse> genFordeleteOneWidget() {
        // basic
        HttpRequestDef.Builder<DeleteOneWidgetRequest, DeleteOneWidgetResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteOneWidgetRequest.class, DeleteOneWidgetResponse.class)
                .withName("DeleteOneWidget")
                .withUri("/v2/{project_id}/widgets/{widget_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("widget_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteOneWidgetRequest::getWidgetId, (req, v) -> {
                req.setWidgetId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAgentDimensionInfoRequest, ListAgentDimensionInfoResponse> listAgentDimensionInfo =
        genForlistAgentDimensionInfo();

    private static HttpRequestDef<ListAgentDimensionInfoRequest, ListAgentDimensionInfoResponse> genForlistAgentDimensionInfo() {
        // basic
        HttpRequestDef.Builder<ListAgentDimensionInfoRequest, ListAgentDimensionInfoResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListAgentDimensionInfoRequest.class, ListAgentDimensionInfoResponse.class)
            .withName("ListAgentDimensionInfo")
            .withUri("/v2/{project_id}/instances/{instance_id}/agent-dimensions")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAgentDimensionInfoRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<ListAgentDimensionInfoRequest.DimNameEnum>withRequestField("dim_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListAgentDimensionInfoRequest.DimNameEnum.class),
            f -> f.withMarshaller(ListAgentDimensionInfoRequest::getDimName, (req, v) -> {
                req.setDimName(v);
            }));
        builder.<String>withRequestField("dim_value",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAgentDimensionInfoRequest::getDimValue, (req, v) -> {
                req.setDimValue(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAgentDimensionInfoRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAgentDimensionInfoRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAlarmHistoriesRequest, ListAlarmHistoriesResponse> listAlarmHistories =
        genForlistAlarmHistories();

    private static HttpRequestDef<ListAlarmHistoriesRequest, ListAlarmHistoriesResponse> genForlistAlarmHistories() {
        // basic
        HttpRequestDef.Builder<ListAlarmHistoriesRequest, ListAlarmHistoriesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAlarmHistoriesRequest.class, ListAlarmHistoriesResponse.class)
                .withName("ListAlarmHistories")
                .withUri("/v2/{project_id}/alarm-histories")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("alarm_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAlarmHistoriesRequest::getAlarmId, (req, v) -> {
                req.setAlarmId(v);
            }));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAlarmHistoriesRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAlarmHistoriesRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            }));
        builder.<Integer>withRequestField("level",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAlarmHistoriesRequest::getLevel, (req, v) -> {
                req.setLevel(v);
            }));
        builder.<String>withRequestField("namespace",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAlarmHistoriesRequest::getNamespace, (req, v) -> {
                req.setNamespace(v);
            }));
        builder.<String>withRequestField("resource_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAlarmHistoriesRequest::getResourceId, (req, v) -> {
                req.setResourceId(v);
            }));
        builder.<String>withRequestField("from",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAlarmHistoriesRequest::getFrom, (req, v) -> {
                req.setFrom(v);
            }));
        builder.<String>withRequestField("to",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAlarmHistoriesRequest::getTo, (req, v) -> {
                req.setTo(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAlarmHistoriesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAlarmHistoriesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAlarmRulePoliciesRequest, ListAlarmRulePoliciesResponse> listAlarmRulePolicies =
        genForlistAlarmRulePolicies();

    private static HttpRequestDef<ListAlarmRulePoliciesRequest, ListAlarmRulePoliciesResponse> genForlistAlarmRulePolicies() {
        // basic
        HttpRequestDef.Builder<ListAlarmRulePoliciesRequest, ListAlarmRulePoliciesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListAlarmRulePoliciesRequest.class, ListAlarmRulePoliciesResponse.class)
            .withName("ListAlarmRulePolicies")
            .withUri("/v2/{project_id}/alarms/{alarm_id}/policies")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("alarm_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAlarmRulePoliciesRequest::getAlarmId, (req, v) -> {
                req.setAlarmId(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAlarmRulePoliciesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAlarmRulePoliciesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAlarmRuleResourcesRequest, ListAlarmRuleResourcesResponse> listAlarmRuleResources =
        genForlistAlarmRuleResources();

    private static HttpRequestDef<ListAlarmRuleResourcesRequest, ListAlarmRuleResourcesResponse> genForlistAlarmRuleResources() {
        // basic
        HttpRequestDef.Builder<ListAlarmRuleResourcesRequest, ListAlarmRuleResourcesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListAlarmRuleResourcesRequest.class, ListAlarmRuleResourcesResponse.class)
            .withName("ListAlarmRuleResources")
            .withUri("/v2/{project_id}/alarms/{alarm_id}/resources")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("alarm_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAlarmRuleResourcesRequest::getAlarmId, (req, v) -> {
                req.setAlarmId(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAlarmRuleResourcesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAlarmRuleResourcesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAlarmRulesRequest, ListAlarmRulesResponse> listAlarmRules =
        genForlistAlarmRules();

    private static HttpRequestDef<ListAlarmRulesRequest, ListAlarmRulesResponse> genForlistAlarmRules() {
        // basic
        HttpRequestDef.Builder<ListAlarmRulesRequest, ListAlarmRulesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAlarmRulesRequest.class, ListAlarmRulesResponse.class)
                .withName("ListAlarmRules")
                .withUri("/v2/{project_id}/alarms")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("alarm_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAlarmRulesRequest::getAlarmId, (req, v) -> {
                req.setAlarmId(v);
            }));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAlarmRulesRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<String>withRequestField("namespace",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAlarmRulesRequest::getNamespace, (req, v) -> {
                req.setNamespace(v);
            }));
        builder.<String>withRequestField("resource_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAlarmRulesRequest::getResourceId, (req, v) -> {
                req.setResourceId(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAlarmRulesRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAlarmRulesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAlarmRulesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAlarmTemplateAssociationAlarmsRequest, ListAlarmTemplateAssociationAlarmsResponse> listAlarmTemplateAssociationAlarms =
        genForlistAlarmTemplateAssociationAlarms();

    private static HttpRequestDef<ListAlarmTemplateAssociationAlarmsRequest, ListAlarmTemplateAssociationAlarmsResponse> genForlistAlarmTemplateAssociationAlarms() {
        // basic
        HttpRequestDef.Builder<ListAlarmTemplateAssociationAlarmsRequest, ListAlarmTemplateAssociationAlarmsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListAlarmTemplateAssociationAlarmsRequest.class,
                    ListAlarmTemplateAssociationAlarmsResponse.class)
                .withName("ListAlarmTemplateAssociationAlarms")
                .withUri("/v2/{project_id}/alarm-templates/{template_id}/association-alarms")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("template_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAlarmTemplateAssociationAlarmsRequest::getTemplateId, (req, v) -> {
                req.setTemplateId(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAlarmTemplateAssociationAlarmsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAlarmTemplateAssociationAlarmsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAlarmTemplatesRequest, ListAlarmTemplatesResponse> listAlarmTemplates =
        genForlistAlarmTemplates();

    private static HttpRequestDef<ListAlarmTemplatesRequest, ListAlarmTemplatesResponse> genForlistAlarmTemplates() {
        // basic
        HttpRequestDef.Builder<ListAlarmTemplatesRequest, ListAlarmTemplatesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAlarmTemplatesRequest.class, ListAlarmTemplatesResponse.class)
                .withName("ListAlarmTemplates")
                .withUri("/v2/{project_id}/alarm-templates")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAlarmTemplatesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAlarmTemplatesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("namespace",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAlarmTemplatesRequest::getNamespace, (req, v) -> {
                req.setNamespace(v);
            }));
        builder.<String>withRequestField("dim_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAlarmTemplatesRequest::getDimName, (req, v) -> {
                req.setDimName(v);
            }));
        builder.<ListAlarmTemplatesRequest.TemplateTypeEnum>withRequestField("template_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListAlarmTemplatesRequest.TemplateTypeEnum.class),
            f -> f.withMarshaller(ListAlarmTemplatesRequest::getTemplateType, (req, v) -> {
                req.setTemplateType(v);
            }));
        builder.<String>withRequestField("template_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAlarmTemplatesRequest::getTemplateName, (req, v) -> {
                req.setTemplateName(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCesTargetProjectTagsRequest, ListCesTargetProjectTagsResponse> listCesTargetProjectTags =
        genForlistCesTargetProjectTags();

    private static HttpRequestDef<ListCesTargetProjectTagsRequest, ListCesTargetProjectTagsResponse> genForlistCesTargetProjectTags() {
        // basic
        HttpRequestDef.Builder<ListCesTargetProjectTagsRequest, ListCesTargetProjectTagsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ListCesTargetProjectTagsRequest.class, ListCesTargetProjectTagsResponse.class)
                .withName("ListCesTargetProjectTags")
                .withUri("/v2/{project_id}/{resource_type}/tags")
                .withContentType("application/json");

        // requests
        builder.<ListCesTargetProjectTagsRequest.ResourceTypeEnum>withRequestField("resource_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListCesTargetProjectTagsRequest.ResourceTypeEnum.class),
            f -> f.withMarshaller(ListCesTargetProjectTagsRequest::getResourceType, (req, v) -> {
                req.setResourceType(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDashboardInfosRequest, ListDashboardInfosResponse> listDashboardInfos =
        genForlistDashboardInfos();

    private static HttpRequestDef<ListDashboardInfosRequest, ListDashboardInfosResponse> genForlistDashboardInfos() {
        // basic
        HttpRequestDef.Builder<ListDashboardInfosRequest, ListDashboardInfosResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListDashboardInfosRequest.class, ListDashboardInfosResponse.class)
                .withName("ListDashboardInfos")
                .withUri("/v2/{project_id}/dashboards")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDashboardInfosRequest::getEnterpriseId, (req, v) -> {
                req.setEnterpriseId(v);
            }));
        builder.<Boolean>withRequestField("is_favorite",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListDashboardInfosRequest::getIsFavorite, (req, v) -> {
                req.setIsFavorite(v);
            }));
        builder.<String>withRequestField("dashboard_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDashboardInfosRequest::getDashboardName, (req, v) -> {
                req.setDashboardName(v);
            }));
        builder.<String>withRequestField("dashboard_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDashboardInfosRequest::getDashboardId, (req, v) -> {
                req.setDashboardId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDashboardWidgetsRequest, ListDashboardWidgetsResponse> listDashboardWidgets =
        genForlistDashboardWidgets();

    private static HttpRequestDef<ListDashboardWidgetsRequest, ListDashboardWidgetsResponse> genForlistDashboardWidgets() {
        // basic
        HttpRequestDef.Builder<ListDashboardWidgetsRequest, ListDashboardWidgetsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListDashboardWidgetsRequest.class, ListDashboardWidgetsResponse.class)
            .withName("ListDashboardWidgets")
            .withUri("/v2/{project_id}/dashboards/{dashboard_id}/widgets")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("dashboard_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDashboardWidgetsRequest::getDashboardId, (req, v) -> {
                req.setDashboardId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListNotificationMaskResourcesRequest, ListNotificationMaskResourcesResponse> listNotificationMaskResources =
        genForlistNotificationMaskResources();

    private static HttpRequestDef<ListNotificationMaskResourcesRequest, ListNotificationMaskResourcesResponse> genForlistNotificationMaskResources() {
        // basic
        HttpRequestDef.Builder<ListNotificationMaskResourcesRequest, ListNotificationMaskResourcesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListNotificationMaskResourcesRequest.class,
                    ListNotificationMaskResourcesResponse.class)
                .withName("ListNotificationMaskResources")
                .withUri("/v2/{project_id}/notification-masks/{notification_mask_id}/resources")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("notification_mask_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNotificationMaskResourcesRequest::getNotificationMaskId, (req, v) -> {
                req.setNotificationMaskId(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListNotificationMaskResourcesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListNotificationMaskResourcesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListNotificationMasksRequest, ListNotificationMasksResponse> listNotificationMasks =
        genForlistNotificationMasks();

    private static HttpRequestDef<ListNotificationMasksRequest, ListNotificationMasksResponse> genForlistNotificationMasks() {
        // basic
        HttpRequestDef.Builder<ListNotificationMasksRequest, ListNotificationMasksResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ListNotificationMasksRequest.class, ListNotificationMasksResponse.class)
            .withName("ListNotificationMasks")
            .withUri("/v2/{project_id}/notification-masks/batch-query")
            .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListNotificationMasksRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListNotificationMasksRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<ListNotificationMaskRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListNotificationMaskRequestBody.class),
            f -> f.withMarshaller(ListNotificationMasksRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListOneClickAlarmRulesRequest, ListOneClickAlarmRulesResponse> listOneClickAlarmRules =
        genForlistOneClickAlarmRules();

    private static HttpRequestDef<ListOneClickAlarmRulesRequest, ListOneClickAlarmRulesResponse> genForlistOneClickAlarmRules() {
        // basic
        HttpRequestDef.Builder<ListOneClickAlarmRulesRequest, ListOneClickAlarmRulesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListOneClickAlarmRulesRequest.class, ListOneClickAlarmRulesResponse.class)
            .withName("ListOneClickAlarmRules")
            .withUri("/v2/{project_id}/one-click-alarms/{one_click_alarm_id}/alarms")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("one_click_alarm_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListOneClickAlarmRulesRequest::getOneClickAlarmId, (req, v) -> {
                req.setOneClickAlarmId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListOneClickAlarmsRequest, ListOneClickAlarmsResponse> listOneClickAlarms =
        genForlistOneClickAlarms();

    private static HttpRequestDef<ListOneClickAlarmsRequest, ListOneClickAlarmsResponse> genForlistOneClickAlarms() {
        // basic
        HttpRequestDef.Builder<ListOneClickAlarmsRequest, ListOneClickAlarmsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListOneClickAlarmsRequest.class, ListOneClickAlarmsResponse.class)
                .withName("ListOneClickAlarms")
                .withUri("/v2/{project_id}/one-click-alarms")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListResourceGroupsRequest, ListResourceGroupsResponse> listResourceGroups =
        genForlistResourceGroups();

    private static HttpRequestDef<ListResourceGroupsRequest, ListResourceGroupsResponse> genForlistResourceGroups() {
        // basic
        HttpRequestDef.Builder<ListResourceGroupsRequest, ListResourceGroupsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListResourceGroupsRequest.class, ListResourceGroupsResponse.class)
                .withName("ListResourceGroups")
                .withUri("/v2/{project_id}/resource-groups")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResourceGroupsRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<String>withRequestField("group_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResourceGroupsRequest::getGroupName, (req, v) -> {
                req.setGroupName(v);
            }));
        builder.<String>withRequestField("group_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResourceGroupsRequest::getGroupId, (req, v) -> {
                req.setGroupId(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListResourceGroupsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListResourceGroupsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<ListResourceGroupsRequest.TypeEnum>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListResourceGroupsRequest.TypeEnum.class),
            f -> f.withMarshaller(ListResourceGroupsRequest::getType, (req, v) -> {
                req.setType(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListResourceGroupsServicesResourcesRequest, ListResourceGroupsServicesResourcesResponse> listResourceGroupsServicesResources =
        genForlistResourceGroupsServicesResources();

    private static HttpRequestDef<ListResourceGroupsServicesResourcesRequest, ListResourceGroupsServicesResourcesResponse> genForlistResourceGroupsServicesResources() {
        // basic
        HttpRequestDef.Builder<ListResourceGroupsServicesResourcesRequest, ListResourceGroupsServicesResourcesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListResourceGroupsServicesResourcesRequest.class,
                    ListResourceGroupsServicesResourcesResponse.class)
                .withName("ListResourceGroupsServicesResources")
                .withUri("/v2/{project_id}/resource-groups/{group_id}/services/{service}/resources")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResourceGroupsServicesResourcesRequest::getGroupId, (req, v) -> {
                req.setGroupId(v);
            }));
        builder.<String>withRequestField("service",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResourceGroupsServicesResourcesRequest::getService, (req, v) -> {
                req.setService(v);
            }));
        builder.<String>withRequestField("dim_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResourceGroupsServicesResourcesRequest::getDimName, (req, v) -> {
                req.setDimName(v);
            }));
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResourceGroupsServicesResourcesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListResourceGroupsServicesResourcesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<ListResourceGroupsServicesResourcesRequest.StatusEnum>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListResourceGroupsServicesResourcesRequest.StatusEnum.class),
            f -> f.withMarshaller(ListResourceGroupsServicesResourcesRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            }));
        builder.<String>withRequestField("dim_value",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResourceGroupsServicesResourcesRequest::getDimValue, (req, v) -> {
                req.setDimValue(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAlarmTemplateRequest, ShowAlarmTemplateResponse> showAlarmTemplate =
        genForshowAlarmTemplate();

    private static HttpRequestDef<ShowAlarmTemplateRequest, ShowAlarmTemplateResponse> genForshowAlarmTemplate() {
        // basic
        HttpRequestDef.Builder<ShowAlarmTemplateRequest, ShowAlarmTemplateResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowAlarmTemplateRequest.class, ShowAlarmTemplateResponse.class)
                .withName("ShowAlarmTemplate")
                .withUri("/v2/{project_id}/alarm-templates/{template_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("template_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAlarmTemplateRequest::getTemplateId, (req, v) -> {
                req.setTemplateId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowResourceGroupRequest, ShowResourceGroupResponse> showResourceGroup =
        genForshowResourceGroup();

    private static HttpRequestDef<ShowResourceGroupRequest, ShowResourceGroupResponse> genForshowResourceGroup() {
        // basic
        HttpRequestDef.Builder<ShowResourceGroupRequest, ShowResourceGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowResourceGroupRequest.class, ShowResourceGroupResponse.class)
                .withName("ShowResourceGroup")
                .withUri("/v2/{project_id}/resource-groups/{group_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowResourceGroupRequest::getGroupId, (req, v) -> {
                req.setGroupId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowWidgetRequest, ShowWidgetResponse> showWidget = genForshowWidget();

    private static HttpRequestDef<ShowWidgetRequest, ShowWidgetResponse> genForshowWidget() {
        // basic
        HttpRequestDef.Builder<ShowWidgetRequest, ShowWidgetResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowWidgetRequest.class, ShowWidgetResponse.class)
                .withName("ShowWidget")
                .withUri("/v2/{project_id}/widgets/{widget_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("widget_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowWidgetRequest::getWidgetId, (req, v) -> {
                req.setWidgetId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateAlarmNotificationsRequest, UpdateAlarmNotificationsResponse> updateAlarmNotifications =
        genForupdateAlarmNotifications();

    private static HttpRequestDef<UpdateAlarmNotificationsRequest, UpdateAlarmNotificationsResponse> genForupdateAlarmNotifications() {
        // basic
        HttpRequestDef.Builder<UpdateAlarmNotificationsRequest, UpdateAlarmNotificationsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT, UpdateAlarmNotificationsRequest.class, UpdateAlarmNotificationsResponse.class)
                .withName("UpdateAlarmNotifications")
                .withUri("/v2/{project_id}/alarms/{alarm_id}/notifications")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("alarm_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAlarmNotificationsRequest::getAlarmId, (req, v) -> {
                req.setAlarmId(v);
            }));
        builder.<PutAlarmNotificationReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PutAlarmNotificationReq.class),
            f -> f.withMarshaller(UpdateAlarmNotificationsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateAlarmRulePoliciesRequest, UpdateAlarmRulePoliciesResponse> updateAlarmRulePolicies =
        genForupdateAlarmRulePolicies();

    private static HttpRequestDef<UpdateAlarmRulePoliciesRequest, UpdateAlarmRulePoliciesResponse> genForupdateAlarmRulePolicies() {
        // basic
        HttpRequestDef.Builder<UpdateAlarmRulePoliciesRequest, UpdateAlarmRulePoliciesResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateAlarmRulePoliciesRequest.class, UpdateAlarmRulePoliciesResponse.class)
            .withName("UpdateAlarmRulePolicies")
            .withUri("/v2/{project_id}/alarms/{alarm_id}/policies")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("alarm_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAlarmRulePoliciesRequest::getAlarmId, (req, v) -> {
                req.setAlarmId(v);
            }));
        builder.<PoliciesReqV2>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PoliciesReqV2.class),
            f -> f.withMarshaller(UpdateAlarmRulePoliciesRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateAlarmTemplateRequest, UpdateAlarmTemplateResponse> updateAlarmTemplate =
        genForupdateAlarmTemplate();

    private static HttpRequestDef<UpdateAlarmTemplateRequest, UpdateAlarmTemplateResponse> genForupdateAlarmTemplate() {
        // basic
        HttpRequestDef.Builder<UpdateAlarmTemplateRequest, UpdateAlarmTemplateResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateAlarmTemplateRequest.class, UpdateAlarmTemplateResponse.class)
                .withName("UpdateAlarmTemplate")
                .withUri("/v2/{project_id}/alarm-templates/{template_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("template_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAlarmTemplateRequest::getTemplateId, (req, v) -> {
                req.setTemplateId(v);
            }));
        builder.<UpdateAlarmTemplateRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateAlarmTemplateRequestBody.class),
            f -> f.withMarshaller(UpdateAlarmTemplateRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateDashboardRequest, UpdateDashboardResponse> updateDashboard =
        genForupdateDashboard();

    private static HttpRequestDef<UpdateDashboardRequest, UpdateDashboardResponse> genForupdateDashboard() {
        // basic
        HttpRequestDef.Builder<UpdateDashboardRequest, UpdateDashboardResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateDashboardRequest.class, UpdateDashboardResponse.class)
                .withName("UpdateDashboard")
                .withUri("/v2/{project_id}/dashboards/{dashboard_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("dashboard_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDashboardRequest::getDashboardId, (req, v) -> {
                req.setDashboardId(v);
            }));
        builder.<UpdateDashboardRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateDashboardRequestBody.class),
            f -> f.withMarshaller(UpdateDashboardRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateNotificationMasksRequest, UpdateNotificationMasksResponse> updateNotificationMasks =
        genForupdateNotificationMasks();

    private static HttpRequestDef<UpdateNotificationMasksRequest, UpdateNotificationMasksResponse> genForupdateNotificationMasks() {
        // basic
        HttpRequestDef.Builder<UpdateNotificationMasksRequest, UpdateNotificationMasksResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateNotificationMasksRequest.class, UpdateNotificationMasksResponse.class)
            .withName("UpdateNotificationMasks")
            .withUri("/v2/{project_id}/notification-masks/{notification_mask_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("notification_mask_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateNotificationMasksRequest::getNotificationMaskId, (req, v) -> {
                req.setNotificationMaskId(v);
            }));
        builder.<UpdateNotificationMasksRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateNotificationMasksRequestBody.class),
            f -> f.withMarshaller(UpdateNotificationMasksRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateOneClickAlarmNotificationsRequest, UpdateOneClickAlarmNotificationsResponse> updateOneClickAlarmNotifications =
        genForupdateOneClickAlarmNotifications();

    private static HttpRequestDef<UpdateOneClickAlarmNotificationsRequest, UpdateOneClickAlarmNotificationsResponse> genForupdateOneClickAlarmNotifications() {
        // basic
        HttpRequestDef.Builder<UpdateOneClickAlarmNotificationsRequest, UpdateOneClickAlarmNotificationsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateOneClickAlarmNotificationsRequest.class,
                    UpdateOneClickAlarmNotificationsResponse.class)
                .withName("UpdateOneClickAlarmNotifications")
                .withUri("/v2/{project_id}/one-click-alarms/{one_click_alarm_id}/notifications")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("one_click_alarm_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateOneClickAlarmNotificationsRequest::getOneClickAlarmId, (req, v) -> {
                req.setOneClickAlarmId(v);
            }));
        builder.<PutAlarmNotificationReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PutAlarmNotificationReq.class),
            f -> f.withMarshaller(UpdateOneClickAlarmNotificationsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateResourceGroupRequest, UpdateResourceGroupResponse> updateResourceGroup =
        genForupdateResourceGroup();

    private static HttpRequestDef<UpdateResourceGroupRequest, UpdateResourceGroupResponse> genForupdateResourceGroup() {
        // basic
        HttpRequestDef.Builder<UpdateResourceGroupRequest, UpdateResourceGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateResourceGroupRequest.class, UpdateResourceGroupResponse.class)
                .withName("UpdateResourceGroup")
                .withUri("/v2/{project_id}/resource-groups/{group_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateResourceGroupRequest::getGroupId, (req, v) -> {
                req.setGroupId(v);
            }));
        builder.<PutResourceGroupReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PutResourceGroupReq.class),
            f -> f.withMarshaller(UpdateResourceGroupRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

}
