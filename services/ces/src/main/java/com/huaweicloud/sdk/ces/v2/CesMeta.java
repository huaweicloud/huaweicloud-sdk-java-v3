package com.huaweicloud.sdk.ces.v2;

import com.huaweicloud.sdk.ces.v2.model.AddAlarmRuleResourcesRequest;
import com.huaweicloud.sdk.ces.v2.model.AddAlarmRuleResourcesResponse;
import com.huaweicloud.sdk.ces.v2.model.AsyncAssociateRGAndTemplatesReq;
import com.huaweicloud.sdk.ces.v2.model.BaseWidgetInfo;
import com.huaweicloud.sdk.ces.v2.model.BatchCreateResourcesRequest;
import com.huaweicloud.sdk.ces.v2.model.BatchCreateResourcesResponse;
import com.huaweicloud.sdk.ces.v2.model.BatchDeleteAlarmRulesRequest;
import com.huaweicloud.sdk.ces.v2.model.BatchDeleteAlarmRulesResponse;
import com.huaweicloud.sdk.ces.v2.model.BatchDeleteAlarmTemplatesRequest;
import com.huaweicloud.sdk.ces.v2.model.BatchDeleteAlarmTemplatesRequestBody;
import com.huaweicloud.sdk.ces.v2.model.BatchDeleteAlarmTemplatesResponse;
import com.huaweicloud.sdk.ces.v2.model.BatchDeleteAlarmsRequestBody;
import com.huaweicloud.sdk.ces.v2.model.BatchDeleteDashboardsRequestBody;
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
import com.huaweicloud.sdk.ces.v2.model.UpdateNotificationMaskRequest;
import com.huaweicloud.sdk.ces.v2.model.UpdateNotificationMaskResponse;
import com.huaweicloud.sdk.ces.v2.model.UpdateNotificationMasksRequestBody;
import com.huaweicloud.sdk.ces.v2.model.UpdateOneClickAlarmNotificationsRequest;
import com.huaweicloud.sdk.ces.v2.model.UpdateOneClickAlarmNotificationsRequestBody;
import com.huaweicloud.sdk.ces.v2.model.UpdateOneClickAlarmNotificationsResponse;
import com.huaweicloud.sdk.ces.v2.model.UpdateResourceGroupAssociationAlarmTemplateRequest;
import com.huaweicloud.sdk.ces.v2.model.UpdateResourceGroupAssociationAlarmTemplateResponse;
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
        genForAddAlarmRuleResources();

    private static HttpRequestDef<AddAlarmRuleResourcesRequest, AddAlarmRuleResourcesResponse> genForAddAlarmRuleResources() {
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
            f -> f.withMarshaller(AddAlarmRuleResourcesRequest::getAlarmId, AddAlarmRuleResourcesRequest::setAlarmId));
        builder.<ResourcesReqV2>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ResourcesReqV2.class),
            f -> f.withMarshaller(AddAlarmRuleResourcesRequest::getBody, AddAlarmRuleResourcesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchCreateResourcesRequest, BatchCreateResourcesResponse> batchCreateResources =
        genForBatchCreateResources();

    private static HttpRequestDef<BatchCreateResourcesRequest, BatchCreateResourcesResponse> genForBatchCreateResources() {
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
            f -> f.withMarshaller(BatchCreateResourcesRequest::getGroupId, BatchCreateResourcesRequest::setGroupId));
        builder.<ResourcesReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ResourcesReq.class),
            f -> f.withMarshaller(BatchCreateResourcesRequest::getBody, BatchCreateResourcesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteAlarmRulesRequest, BatchDeleteAlarmRulesResponse> batchDeleteAlarmRules =
        genForBatchDeleteAlarmRules();

    private static HttpRequestDef<BatchDeleteAlarmRulesRequest, BatchDeleteAlarmRulesResponse> genForBatchDeleteAlarmRules() {
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
            f -> f.withMarshaller(BatchDeleteAlarmRulesRequest::getBody, BatchDeleteAlarmRulesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteAlarmTemplatesRequest, BatchDeleteAlarmTemplatesResponse> batchDeleteAlarmTemplates =
        genForBatchDeleteAlarmTemplates();

    private static HttpRequestDef<BatchDeleteAlarmTemplatesRequest, BatchDeleteAlarmTemplatesResponse> genForBatchDeleteAlarmTemplates() {
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
            f -> f.withMarshaller(BatchDeleteAlarmTemplatesRequest::getBody,
                BatchDeleteAlarmTemplatesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteNotificationMasksRequest, BatchDeleteNotificationMasksResponse> batchDeleteNotificationMasks =
        genForBatchDeleteNotificationMasks();

    private static HttpRequestDef<BatchDeleteNotificationMasksRequest, BatchDeleteNotificationMasksResponse> genForBatchDeleteNotificationMasks() {
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
            f -> f.withMarshaller(BatchDeleteNotificationMasksRequest::getBody,
                BatchDeleteNotificationMasksRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteOneClickAlarmsRequest, BatchDeleteOneClickAlarmsResponse> batchDeleteOneClickAlarms =
        genForBatchDeleteOneClickAlarms();

    private static HttpRequestDef<BatchDeleteOneClickAlarmsRequest, BatchDeleteOneClickAlarmsResponse> genForBatchDeleteOneClickAlarms() {
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
            f -> f.withMarshaller(BatchDeleteOneClickAlarmsRequest::getBody,
                BatchDeleteOneClickAlarmsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteResourceGroupsRequest, BatchDeleteResourceGroupsResponse> batchDeleteResourceGroups =
        genForBatchDeleteResourceGroups();

    private static HttpRequestDef<BatchDeleteResourceGroupsRequest, BatchDeleteResourceGroupsResponse> genForBatchDeleteResourceGroups() {
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
            f -> f.withMarshaller(BatchDeleteResourceGroupsRequest::getBody,
                BatchDeleteResourceGroupsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteResourcesRequest, BatchDeleteResourcesResponse> batchDeleteResources =
        genForBatchDeleteResources();

    private static HttpRequestDef<BatchDeleteResourcesRequest, BatchDeleteResourcesResponse> genForBatchDeleteResources() {
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
            f -> f.withMarshaller(BatchDeleteResourcesRequest::getGroupId, BatchDeleteResourcesRequest::setGroupId));
        builder.<ResourcesReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ResourcesReq.class),
            f -> f.withMarshaller(BatchDeleteResourcesRequest::getBody, BatchDeleteResourcesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchEnableAlarmRulesRequest, BatchEnableAlarmRulesResponse> batchEnableAlarmRules =
        genForBatchEnableAlarmRules();

    private static HttpRequestDef<BatchEnableAlarmRulesRequest, BatchEnableAlarmRulesResponse> genForBatchEnableAlarmRules() {
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
            f -> f.withMarshaller(BatchEnableAlarmRulesRequest::getBody, BatchEnableAlarmRulesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchUpdateNotificationMaskTimeRequest, BatchUpdateNotificationMaskTimeResponse> batchUpdateNotificationMaskTime =
        genForBatchUpdateNotificationMaskTime();

    private static HttpRequestDef<BatchUpdateNotificationMaskTimeRequest, BatchUpdateNotificationMaskTimeResponse> genForBatchUpdateNotificationMaskTime() {
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
            f -> f.withMarshaller(BatchUpdateNotificationMaskTimeRequest::getBody,
                BatchUpdateNotificationMaskTimeRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchUpdateNotificationMasksRequest, BatchUpdateNotificationMasksResponse> batchUpdateNotificationMasks =
        genForBatchUpdateNotificationMasks();

    private static HttpRequestDef<BatchUpdateNotificationMasksRequest, BatchUpdateNotificationMasksResponse> genForBatchUpdateNotificationMasks() {
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
            f -> f.withMarshaller(BatchUpdateNotificationMasksRequest::getBody,
                BatchUpdateNotificationMasksRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchUpdateOneClickAlarmPoliciesEnabledStateRequest, BatchUpdateOneClickAlarmPoliciesEnabledStateResponse> batchUpdateOneClickAlarmPoliciesEnabledState =
        genForBatchUpdateOneClickAlarmPoliciesEnabledState();

    private static HttpRequestDef<BatchUpdateOneClickAlarmPoliciesEnabledStateRequest, BatchUpdateOneClickAlarmPoliciesEnabledStateResponse> genForBatchUpdateOneClickAlarmPoliciesEnabledState() {
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
            f -> f.withMarshaller(BatchUpdateOneClickAlarmPoliciesEnabledStateRequest::getOneClickAlarmId,
                BatchUpdateOneClickAlarmPoliciesEnabledStateRequest::setOneClickAlarmId));
        builder.<String>withRequestField("alarm_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchUpdateOneClickAlarmPoliciesEnabledStateRequest::getAlarmId,
                BatchUpdateOneClickAlarmPoliciesEnabledStateRequest::setAlarmId));
        builder.<BatchEnableAlarmPoliciesRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchEnableAlarmPoliciesRequestBody.class),
            f -> f.withMarshaller(BatchUpdateOneClickAlarmPoliciesEnabledStateRequest::getBody,
                BatchUpdateOneClickAlarmPoliciesEnabledStateRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchUpdateOneClickAlarmsEnabledStateRequest, BatchUpdateOneClickAlarmsEnabledStateResponse> batchUpdateOneClickAlarmsEnabledState =
        genForBatchUpdateOneClickAlarmsEnabledState();

    private static HttpRequestDef<BatchUpdateOneClickAlarmsEnabledStateRequest, BatchUpdateOneClickAlarmsEnabledStateResponse> genForBatchUpdateOneClickAlarmsEnabledState() {
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
            f -> f.withMarshaller(BatchUpdateOneClickAlarmsEnabledStateRequest::getOneClickAlarmId,
                BatchUpdateOneClickAlarmsEnabledStateRequest::setOneClickAlarmId));
        builder.<BatchEnableAlarmsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchEnableAlarmsRequestBody.class),
            f -> f.withMarshaller(BatchUpdateOneClickAlarmsEnabledStateRequest::getBody,
                BatchUpdateOneClickAlarmsEnabledStateRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchUpdateWidgetsRequest, BatchUpdateWidgetsResponse> batchUpdateWidgets =
        genForBatchUpdateWidgets();

    private static HttpRequestDef<BatchUpdateWidgetsRequest, BatchUpdateWidgetsResponse> genForBatchUpdateWidgets() {
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
            f -> f.withMarshaller(BatchUpdateWidgetsRequest::getBody, BatchUpdateWidgetsRequest::setBody)
                .withInnerContainerType(UpdateWidgetInfo.class));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateAlarmRulesRequest, CreateAlarmRulesResponse> createAlarmRules =
        genForCreateAlarmRules();

    private static HttpRequestDef<CreateAlarmRulesRequest, CreateAlarmRulesResponse> genForCreateAlarmRules() {
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
            f -> f.withMarshaller(CreateAlarmRulesRequest::getBody, CreateAlarmRulesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateAlarmTemplateRequest, CreateAlarmTemplateResponse> createAlarmTemplate =
        genForCreateAlarmTemplate();

    private static HttpRequestDef<CreateAlarmTemplateRequest, CreateAlarmTemplateResponse> genForCreateAlarmTemplate() {
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
            f -> f.withMarshaller(CreateAlarmTemplateRequest::getBody, CreateAlarmTemplateRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateDashboardWidgetsRequest, CreateDashboardWidgetsResponse> createDashboardWidgets =
        genForCreateDashboardWidgets();

    private static HttpRequestDef<CreateDashboardWidgetsRequest, CreateDashboardWidgetsResponse> genForCreateDashboardWidgets() {
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
            f -> f.withMarshaller(CreateDashboardWidgetsRequest::getDashboardId,
                CreateDashboardWidgetsRequest::setDashboardId));
        builder.<List<BaseWidgetInfo>>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(CreateDashboardWidgetsRequest::getBody, CreateDashboardWidgetsRequest::setBody)
                .withInnerContainerType(BaseWidgetInfo.class));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateOneClickAlarmRequest, CreateOneClickAlarmResponse> createOneClickAlarm =
        genForCreateOneClickAlarm();

    private static HttpRequestDef<CreateOneClickAlarmRequest, CreateOneClickAlarmResponse> genForCreateOneClickAlarm() {
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
            f -> f.withMarshaller(CreateOneClickAlarmRequest::getBody, CreateOneClickAlarmRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateOneDashboardRequest, CreateOneDashboardResponse> createOneDashboard =
        genForCreateOneDashboard();

    private static HttpRequestDef<CreateOneDashboardRequest, CreateOneDashboardResponse> genForCreateOneDashboard() {
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
            f -> f.withMarshaller(CreateOneDashboardRequest::getBody, CreateOneDashboardRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateResourceGroupRequest, CreateResourceGroupResponse> createResourceGroup =
        genForCreateResourceGroup();

    private static HttpRequestDef<CreateResourceGroupRequest, CreateResourceGroupResponse> genForCreateResourceGroup() {
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
            f -> f.withMarshaller(CreateResourceGroupRequest::getBody, CreateResourceGroupRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteAlarmRuleResourcesRequest, DeleteAlarmRuleResourcesResponse> deleteAlarmRuleResources =
        genForDeleteAlarmRuleResources();

    private static HttpRequestDef<DeleteAlarmRuleResourcesRequest, DeleteAlarmRuleResourcesResponse> genForDeleteAlarmRuleResources() {
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
            f -> f.withMarshaller(DeleteAlarmRuleResourcesRequest::getAlarmId,
                DeleteAlarmRuleResourcesRequest::setAlarmId));
        builder.<ResourcesReqV2>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ResourcesReqV2.class),
            f -> f.withMarshaller(DeleteAlarmRuleResourcesRequest::getBody, DeleteAlarmRuleResourcesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteDashboardsRequest, DeleteDashboardsResponse> deleteDashboards =
        genForDeleteDashboards();

    private static HttpRequestDef<DeleteDashboardsRequest, DeleteDashboardsResponse> genForDeleteDashboards() {
        // basic
        HttpRequestDef.Builder<DeleteDashboardsRequest, DeleteDashboardsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, DeleteDashboardsRequest.class, DeleteDashboardsResponse.class)
                .withName("DeleteDashboards")
                .withUri("/v2/{project_id}/dashboards/batch-delete")
                .withContentType("application/json");

        // requests
        builder.<BatchDeleteDashboardsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(BatchDeleteDashboardsRequestBody.class),
            f -> f.withMarshaller(DeleteDashboardsRequest::getBody, DeleteDashboardsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteOneWidgetRequest, DeleteOneWidgetResponse> deleteOneWidget =
        genForDeleteOneWidget();

    private static HttpRequestDef<DeleteOneWidgetRequest, DeleteOneWidgetResponse> genForDeleteOneWidget() {
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
            f -> f.withMarshaller(DeleteOneWidgetRequest::getWidgetId, DeleteOneWidgetRequest::setWidgetId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAgentDimensionInfoRequest, ListAgentDimensionInfoResponse> listAgentDimensionInfo =
        genForListAgentDimensionInfo();

    private static HttpRequestDef<ListAgentDimensionInfoRequest, ListAgentDimensionInfoResponse> genForListAgentDimensionInfo() {
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
            f -> f.withMarshaller(ListAgentDimensionInfoRequest::getInstanceId,
                ListAgentDimensionInfoRequest::setInstanceId));
        builder.<ListAgentDimensionInfoRequest.DimNameEnum>withRequestField("dim_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListAgentDimensionInfoRequest.DimNameEnum.class),
            f -> f.withMarshaller(ListAgentDimensionInfoRequest::getDimName,
                ListAgentDimensionInfoRequest::setDimName));
        builder.<String>withRequestField("dim_value",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAgentDimensionInfoRequest::getDimValue,
                ListAgentDimensionInfoRequest::setDimValue));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAgentDimensionInfoRequest::getOffset, ListAgentDimensionInfoRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAgentDimensionInfoRequest::getLimit, ListAgentDimensionInfoRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAlarmHistoriesRequest, ListAlarmHistoriesResponse> listAlarmHistories =
        genForListAlarmHistories();

    private static HttpRequestDef<ListAlarmHistoriesRequest, ListAlarmHistoriesResponse> genForListAlarmHistories() {
        // basic
        HttpRequestDef.Builder<ListAlarmHistoriesRequest, ListAlarmHistoriesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAlarmHistoriesRequest.class, ListAlarmHistoriesResponse.class)
                .withName("ListAlarmHistories")
                .withUri("/v2/{project_id}/alarm-histories")
                .withContentType("application/json");

        // requests
        builder.<List<String>>withRequestField("alarm_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListAlarmHistoriesRequest::getAlarmId, ListAlarmHistoriesRequest::setAlarmId));
        builder.<String>withRequestField("record_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAlarmHistoriesRequest::getRecordId, ListAlarmHistoriesRequest::setRecordId));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAlarmHistoriesRequest::getName, ListAlarmHistoriesRequest::setName));
        builder.<List<ListAlarmHistoriesRequest.StatusEnum>>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListAlarmHistoriesRequest::getStatus, ListAlarmHistoriesRequest::setStatus));
        builder.<Integer>withRequestField("level",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAlarmHistoriesRequest::getLevel, ListAlarmHistoriesRequest::setLevel));
        builder.<String>withRequestField("namespace",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAlarmHistoriesRequest::getNamespace, ListAlarmHistoriesRequest::setNamespace));
        builder.<String>withRequestField("resource_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAlarmHistoriesRequest::getResourceId, ListAlarmHistoriesRequest::setResourceId));
        builder.<String>withRequestField("from",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAlarmHistoriesRequest::getFrom, ListAlarmHistoriesRequest::setFrom));
        builder.<String>withRequestField("to",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAlarmHistoriesRequest::getTo, ListAlarmHistoriesRequest::setTo));
        builder.<ListAlarmHistoriesRequest.AlarmTypeEnum>withRequestField("alarm_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListAlarmHistoriesRequest.AlarmTypeEnum.class),
            f -> f.withMarshaller(ListAlarmHistoriesRequest::getAlarmType, ListAlarmHistoriesRequest::setAlarmType));
        builder.<String>withRequestField("create_time_from",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAlarmHistoriesRequest::getCreateTimeFrom,
                ListAlarmHistoriesRequest::setCreateTimeFrom));
        builder.<String>withRequestField("create_time_to",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAlarmHistoriesRequest::getCreateTimeTo,
                ListAlarmHistoriesRequest::setCreateTimeTo));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAlarmHistoriesRequest::getOffset, ListAlarmHistoriesRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAlarmHistoriesRequest::getLimit, ListAlarmHistoriesRequest::setLimit));
        builder.<ListAlarmHistoriesRequest.OrderByEnum>withRequestField("order_by",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListAlarmHistoriesRequest.OrderByEnum.class),
            f -> f.withMarshaller(ListAlarmHistoriesRequest::getOrderBy, ListAlarmHistoriesRequest::setOrderBy));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAlarmRulePoliciesRequest, ListAlarmRulePoliciesResponse> listAlarmRulePolicies =
        genForListAlarmRulePolicies();

    private static HttpRequestDef<ListAlarmRulePoliciesRequest, ListAlarmRulePoliciesResponse> genForListAlarmRulePolicies() {
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
            f -> f.withMarshaller(ListAlarmRulePoliciesRequest::getAlarmId, ListAlarmRulePoliciesRequest::setAlarmId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAlarmRulePoliciesRequest::getOffset, ListAlarmRulePoliciesRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAlarmRulePoliciesRequest::getLimit, ListAlarmRulePoliciesRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAlarmRuleResourcesRequest, ListAlarmRuleResourcesResponse> listAlarmRuleResources =
        genForListAlarmRuleResources();

    private static HttpRequestDef<ListAlarmRuleResourcesRequest, ListAlarmRuleResourcesResponse> genForListAlarmRuleResources() {
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
            f -> f.withMarshaller(ListAlarmRuleResourcesRequest::getAlarmId,
                ListAlarmRuleResourcesRequest::setAlarmId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAlarmRuleResourcesRequest::getOffset, ListAlarmRuleResourcesRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAlarmRuleResourcesRequest::getLimit, ListAlarmRuleResourcesRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAlarmRulesRequest, ListAlarmRulesResponse> listAlarmRules =
        genForListAlarmRules();

    private static HttpRequestDef<ListAlarmRulesRequest, ListAlarmRulesResponse> genForListAlarmRules() {
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
            f -> f.withMarshaller(ListAlarmRulesRequest::getAlarmId, ListAlarmRulesRequest::setAlarmId));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAlarmRulesRequest::getName, ListAlarmRulesRequest::setName));
        builder.<String>withRequestField("namespace",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAlarmRulesRequest::getNamespace, ListAlarmRulesRequest::setNamespace));
        builder.<String>withRequestField("resource_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAlarmRulesRequest::getResourceId, ListAlarmRulesRequest::setResourceId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAlarmRulesRequest::getEnterpriseProjectId,
                ListAlarmRulesRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("product_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAlarmRulesRequest::getProductName, ListAlarmRulesRequest::setProductName));
        builder.<ListAlarmRulesRequest.ResourceLevelEnum>withRequestField("resource_level",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListAlarmRulesRequest.ResourceLevelEnum.class),
            f -> f.withMarshaller(ListAlarmRulesRequest::getResourceLevel, ListAlarmRulesRequest::setResourceLevel));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAlarmRulesRequest::getOffset, ListAlarmRulesRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAlarmRulesRequest::getLimit, ListAlarmRulesRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAlarmTemplateAssociationAlarmsRequest, ListAlarmTemplateAssociationAlarmsResponse> listAlarmTemplateAssociationAlarms =
        genForListAlarmTemplateAssociationAlarms();

    private static HttpRequestDef<ListAlarmTemplateAssociationAlarmsRequest, ListAlarmTemplateAssociationAlarmsResponse> genForListAlarmTemplateAssociationAlarms() {
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
            f -> f.withMarshaller(ListAlarmTemplateAssociationAlarmsRequest::getTemplateId,
                ListAlarmTemplateAssociationAlarmsRequest::setTemplateId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAlarmTemplateAssociationAlarmsRequest::getOffset,
                ListAlarmTemplateAssociationAlarmsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAlarmTemplateAssociationAlarmsRequest::getLimit,
                ListAlarmTemplateAssociationAlarmsRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAlarmTemplatesRequest, ListAlarmTemplatesResponse> listAlarmTemplates =
        genForListAlarmTemplates();

    private static HttpRequestDef<ListAlarmTemplatesRequest, ListAlarmTemplatesResponse> genForListAlarmTemplates() {
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
            f -> f.withMarshaller(ListAlarmTemplatesRequest::getOffset, ListAlarmTemplatesRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAlarmTemplatesRequest::getLimit, ListAlarmTemplatesRequest::setLimit));
        builder.<String>withRequestField("namespace",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAlarmTemplatesRequest::getNamespace, ListAlarmTemplatesRequest::setNamespace));
        builder.<String>withRequestField("dim_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAlarmTemplatesRequest::getDimName, ListAlarmTemplatesRequest::setDimName));
        builder.<ListAlarmTemplatesRequest.TemplateTypeEnum>withRequestField("template_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListAlarmTemplatesRequest.TemplateTypeEnum.class),
            f -> f.withMarshaller(ListAlarmTemplatesRequest::getTemplateType,
                ListAlarmTemplatesRequest::setTemplateType));
        builder.<String>withRequestField("template_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAlarmTemplatesRequest::getTemplateName,
                ListAlarmTemplatesRequest::setTemplateName));
        builder.<String>withRequestField("product_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAlarmTemplatesRequest::getProductName,
                ListAlarmTemplatesRequest::setProductName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCesTargetProjectTagsRequest, ListCesTargetProjectTagsResponse> listCesTargetProjectTags =
        genForListCesTargetProjectTags();

    private static HttpRequestDef<ListCesTargetProjectTagsRequest, ListCesTargetProjectTagsResponse> genForListCesTargetProjectTags() {
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
            f -> f.withMarshaller(ListCesTargetProjectTagsRequest::getResourceType,
                ListCesTargetProjectTagsRequest::setResourceType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDashboardInfosRequest, ListDashboardInfosResponse> listDashboardInfos =
        genForListDashboardInfos();

    private static HttpRequestDef<ListDashboardInfosRequest, ListDashboardInfosResponse> genForListDashboardInfos() {
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
            f -> f.withMarshaller(ListDashboardInfosRequest::getEnterpriseId,
                ListDashboardInfosRequest::setEnterpriseId));
        builder.<Boolean>withRequestField("is_favorite",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListDashboardInfosRequest::getIsFavorite, ListDashboardInfosRequest::setIsFavorite));
        builder.<String>withRequestField("dashboard_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDashboardInfosRequest::getDashboardName,
                ListDashboardInfosRequest::setDashboardName));
        builder.<String>withRequestField("dashboard_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDashboardInfosRequest::getDashboardId,
                ListDashboardInfosRequest::setDashboardId));
        builder.<ListDashboardInfosRequest.DashboardTypeEnum>withRequestField("dashboard_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListDashboardInfosRequest.DashboardTypeEnum.class),
            f -> f.withMarshaller(ListDashboardInfosRequest::getDashboardType,
                ListDashboardInfosRequest::setDashboardType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDashboardWidgetsRequest, ListDashboardWidgetsResponse> listDashboardWidgets =
        genForListDashboardWidgets();

    private static HttpRequestDef<ListDashboardWidgetsRequest, ListDashboardWidgetsResponse> genForListDashboardWidgets() {
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
            f -> f.withMarshaller(ListDashboardWidgetsRequest::getDashboardId,
                ListDashboardWidgetsRequest::setDashboardId));
        builder.<String>withRequestField("group_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDashboardWidgetsRequest::getGroupId, ListDashboardWidgetsRequest::setGroupId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListNotificationMaskResourcesRequest, ListNotificationMaskResourcesResponse> listNotificationMaskResources =
        genForListNotificationMaskResources();

    private static HttpRequestDef<ListNotificationMaskResourcesRequest, ListNotificationMaskResourcesResponse> genForListNotificationMaskResources() {
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
            f -> f.withMarshaller(ListNotificationMaskResourcesRequest::getNotificationMaskId,
                ListNotificationMaskResourcesRequest::setNotificationMaskId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListNotificationMaskResourcesRequest::getOffset,
                ListNotificationMaskResourcesRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListNotificationMaskResourcesRequest::getLimit,
                ListNotificationMaskResourcesRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListNotificationMasksRequest, ListNotificationMasksResponse> listNotificationMasks =
        genForListNotificationMasks();

    private static HttpRequestDef<ListNotificationMasksRequest, ListNotificationMasksResponse> genForListNotificationMasks() {
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
            f -> f.withMarshaller(ListNotificationMasksRequest::getOffset, ListNotificationMasksRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListNotificationMasksRequest::getLimit, ListNotificationMasksRequest::setLimit));
        builder.<ListNotificationMasksRequest.SortKeyEnum>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListNotificationMasksRequest.SortKeyEnum.class),
            f -> f.withMarshaller(ListNotificationMasksRequest::getSortKey, ListNotificationMasksRequest::setSortKey));
        builder.<ListNotificationMasksRequest.SortDirEnum>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListNotificationMasksRequest.SortDirEnum.class),
            f -> f.withMarshaller(ListNotificationMasksRequest::getSortDir, ListNotificationMasksRequest::setSortDir));
        builder.<ListNotificationMaskRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListNotificationMaskRequestBody.class),
            f -> f.withMarshaller(ListNotificationMasksRequest::getBody, ListNotificationMasksRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListOneClickAlarmRulesRequest, ListOneClickAlarmRulesResponse> listOneClickAlarmRules =
        genForListOneClickAlarmRules();

    private static HttpRequestDef<ListOneClickAlarmRulesRequest, ListOneClickAlarmRulesResponse> genForListOneClickAlarmRules() {
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
            f -> f.withMarshaller(ListOneClickAlarmRulesRequest::getOneClickAlarmId,
                ListOneClickAlarmRulesRequest::setOneClickAlarmId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListOneClickAlarmsRequest, ListOneClickAlarmsResponse> listOneClickAlarms =
        genForListOneClickAlarms();

    private static HttpRequestDef<ListOneClickAlarmsRequest, ListOneClickAlarmsResponse> genForListOneClickAlarms() {
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
        genForListResourceGroups();

    private static HttpRequestDef<ListResourceGroupsRequest, ListResourceGroupsResponse> genForListResourceGroups() {
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
            f -> f.withMarshaller(ListResourceGroupsRequest::getEnterpriseProjectId,
                ListResourceGroupsRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("group_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResourceGroupsRequest::getGroupName, ListResourceGroupsRequest::setGroupName));
        builder.<String>withRequestField("group_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResourceGroupsRequest::getGroupId, ListResourceGroupsRequest::setGroupId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListResourceGroupsRequest::getOffset, ListResourceGroupsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListResourceGroupsRequest::getLimit, ListResourceGroupsRequest::setLimit));
        builder.<ListResourceGroupsRequest.TypeEnum>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListResourceGroupsRequest.TypeEnum.class),
            f -> f.withMarshaller(ListResourceGroupsRequest::getType, ListResourceGroupsRequest::setType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListResourceGroupsServicesResourcesRequest, ListResourceGroupsServicesResourcesResponse> listResourceGroupsServicesResources =
        genForListResourceGroupsServicesResources();

    private static HttpRequestDef<ListResourceGroupsServicesResourcesRequest, ListResourceGroupsServicesResourcesResponse> genForListResourceGroupsServicesResources() {
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
            f -> f.withMarshaller(ListResourceGroupsServicesResourcesRequest::getGroupId,
                ListResourceGroupsServicesResourcesRequest::setGroupId));
        builder.<String>withRequestField("service",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResourceGroupsServicesResourcesRequest::getService,
                ListResourceGroupsServicesResourcesRequest::setService));
        builder.<String>withRequestField("dim_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResourceGroupsServicesResourcesRequest::getDimName,
                ListResourceGroupsServicesResourcesRequest::setDimName));
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResourceGroupsServicesResourcesRequest::getLimit,
                ListResourceGroupsServicesResourcesRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListResourceGroupsServicesResourcesRequest::getOffset,
                ListResourceGroupsServicesResourcesRequest::setOffset));
        builder.<ListResourceGroupsServicesResourcesRequest.StatusEnum>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListResourceGroupsServicesResourcesRequest.StatusEnum.class),
            f -> f.withMarshaller(ListResourceGroupsServicesResourcesRequest::getStatus,
                ListResourceGroupsServicesResourcesRequest::setStatus));
        builder.<String>withRequestField("dim_value",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResourceGroupsServicesResourcesRequest::getDimValue,
                ListResourceGroupsServicesResourcesRequest::setDimValue));
        builder.<String>withRequestField("tag",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResourceGroupsServicesResourcesRequest::getTag,
                ListResourceGroupsServicesResourcesRequest::setTag));
        builder.<String>withRequestField("extend_relation_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResourceGroupsServicesResourcesRequest::getExtendRelationId,
                ListResourceGroupsServicesResourcesRequest::setExtendRelationId));
        builder.<String>withRequestField("product_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResourceGroupsServicesResourcesRequest::getProductName,
                ListResourceGroupsServicesResourcesRequest::setProductName));
        builder.<String>withRequestField("resource_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResourceGroupsServicesResourcesRequest::getResourceName,
                ListResourceGroupsServicesResourcesRequest::setResourceName));
        builder.<ListResourceGroupsServicesResourcesRequest.EventStatusEnum>withRequestField("event_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListResourceGroupsServicesResourcesRequest.EventStatusEnum.class),
            f -> f.withMarshaller(ListResourceGroupsServicesResourcesRequest::getEventStatus,
                ListResourceGroupsServicesResourcesRequest::setEventStatus));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAlarmTemplateRequest, ShowAlarmTemplateResponse> showAlarmTemplate =
        genForShowAlarmTemplate();

    private static HttpRequestDef<ShowAlarmTemplateRequest, ShowAlarmTemplateResponse> genForShowAlarmTemplate() {
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
            f -> f.withMarshaller(ShowAlarmTemplateRequest::getTemplateId, ShowAlarmTemplateRequest::setTemplateId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowResourceGroupRequest, ShowResourceGroupResponse> showResourceGroup =
        genForShowResourceGroup();

    private static HttpRequestDef<ShowResourceGroupRequest, ShowResourceGroupResponse> genForShowResourceGroup() {
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
            f -> f.withMarshaller(ShowResourceGroupRequest::getGroupId, ShowResourceGroupRequest::setGroupId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowWidgetRequest, ShowWidgetResponse> showWidget = genForShowWidget();

    private static HttpRequestDef<ShowWidgetRequest, ShowWidgetResponse> genForShowWidget() {
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
            f -> f.withMarshaller(ShowWidgetRequest::getWidgetId, ShowWidgetRequest::setWidgetId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateAlarmNotificationsRequest, UpdateAlarmNotificationsResponse> updateAlarmNotifications =
        genForUpdateAlarmNotifications();

    private static HttpRequestDef<UpdateAlarmNotificationsRequest, UpdateAlarmNotificationsResponse> genForUpdateAlarmNotifications() {
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
            f -> f.withMarshaller(UpdateAlarmNotificationsRequest::getAlarmId,
                UpdateAlarmNotificationsRequest::setAlarmId));
        builder.<PutAlarmNotificationReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PutAlarmNotificationReq.class),
            f -> f.withMarshaller(UpdateAlarmNotificationsRequest::getBody, UpdateAlarmNotificationsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateAlarmRulePoliciesRequest, UpdateAlarmRulePoliciesResponse> updateAlarmRulePolicies =
        genForUpdateAlarmRulePolicies();

    private static HttpRequestDef<UpdateAlarmRulePoliciesRequest, UpdateAlarmRulePoliciesResponse> genForUpdateAlarmRulePolicies() {
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
            f -> f.withMarshaller(UpdateAlarmRulePoliciesRequest::getAlarmId,
                UpdateAlarmRulePoliciesRequest::setAlarmId));
        builder.<PoliciesReqV2>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PoliciesReqV2.class),
            f -> f.withMarshaller(UpdateAlarmRulePoliciesRequest::getBody, UpdateAlarmRulePoliciesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateAlarmTemplateRequest, UpdateAlarmTemplateResponse> updateAlarmTemplate =
        genForUpdateAlarmTemplate();

    private static HttpRequestDef<UpdateAlarmTemplateRequest, UpdateAlarmTemplateResponse> genForUpdateAlarmTemplate() {
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
            f -> f.withMarshaller(UpdateAlarmTemplateRequest::getTemplateId,
                UpdateAlarmTemplateRequest::setTemplateId));
        builder.<UpdateAlarmTemplateRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateAlarmTemplateRequestBody.class),
            f -> f.withMarshaller(UpdateAlarmTemplateRequest::getBody, UpdateAlarmTemplateRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateDashboardRequest, UpdateDashboardResponse> updateDashboard =
        genForUpdateDashboard();

    private static HttpRequestDef<UpdateDashboardRequest, UpdateDashboardResponse> genForUpdateDashboard() {
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
            f -> f.withMarshaller(UpdateDashboardRequest::getDashboardId, UpdateDashboardRequest::setDashboardId));
        builder.<UpdateDashboardRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateDashboardRequestBody.class),
            f -> f.withMarshaller(UpdateDashboardRequest::getBody, UpdateDashboardRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateNotificationMaskRequest, UpdateNotificationMaskResponse> updateNotificationMask =
        genForUpdateNotificationMask();

    private static HttpRequestDef<UpdateNotificationMaskRequest, UpdateNotificationMaskResponse> genForUpdateNotificationMask() {
        // basic
        HttpRequestDef.Builder<UpdateNotificationMaskRequest, UpdateNotificationMaskResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateNotificationMaskRequest.class, UpdateNotificationMaskResponse.class)
            .withName("UpdateNotificationMask")
            .withUri("/v2/{project_id}/notification-masks/{notification_mask_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("notification_mask_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateNotificationMaskRequest::getNotificationMaskId,
                UpdateNotificationMaskRequest::setNotificationMaskId));
        builder.<UpdateNotificationMasksRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateNotificationMasksRequestBody.class),
            f -> f.withMarshaller(UpdateNotificationMaskRequest::getBody, UpdateNotificationMaskRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateOneClickAlarmNotificationsRequest, UpdateOneClickAlarmNotificationsResponse> updateOneClickAlarmNotifications =
        genForUpdateOneClickAlarmNotifications();

    private static HttpRequestDef<UpdateOneClickAlarmNotificationsRequest, UpdateOneClickAlarmNotificationsResponse> genForUpdateOneClickAlarmNotifications() {
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
            f -> f.withMarshaller(UpdateOneClickAlarmNotificationsRequest::getOneClickAlarmId,
                UpdateOneClickAlarmNotificationsRequest::setOneClickAlarmId));
        builder.<UpdateOneClickAlarmNotificationsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateOneClickAlarmNotificationsRequestBody.class),
            f -> f.withMarshaller(UpdateOneClickAlarmNotificationsRequest::getBody,
                UpdateOneClickAlarmNotificationsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateResourceGroupRequest, UpdateResourceGroupResponse> updateResourceGroup =
        genForUpdateResourceGroup();

    private static HttpRequestDef<UpdateResourceGroupRequest, UpdateResourceGroupResponse> genForUpdateResourceGroup() {
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
            f -> f.withMarshaller(UpdateResourceGroupRequest::getGroupId, UpdateResourceGroupRequest::setGroupId));
        builder.<PutResourceGroupReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PutResourceGroupReq.class),
            f -> f.withMarshaller(UpdateResourceGroupRequest::getBody, UpdateResourceGroupRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateResourceGroupAssociationAlarmTemplateRequest, UpdateResourceGroupAssociationAlarmTemplateResponse> updateResourceGroupAssociationAlarmTemplate =
        genForUpdateResourceGroupAssociationAlarmTemplate();

    private static HttpRequestDef<UpdateResourceGroupAssociationAlarmTemplateRequest, UpdateResourceGroupAssociationAlarmTemplateResponse> genForUpdateResourceGroupAssociationAlarmTemplate() {
        // basic
        HttpRequestDef.Builder<UpdateResourceGroupAssociationAlarmTemplateRequest, UpdateResourceGroupAssociationAlarmTemplateResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateResourceGroupAssociationAlarmTemplateRequest.class,
                    UpdateResourceGroupAssociationAlarmTemplateResponse.class)
                .withName("UpdateResourceGroupAssociationAlarmTemplate")
                .withUri("/v2/{project_id}/resource-groups/{group_id}/alarm-templates/async-association")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateResourceGroupAssociationAlarmTemplateRequest::getGroupId,
                UpdateResourceGroupAssociationAlarmTemplateRequest::setGroupId));
        builder.<AsyncAssociateRGAndTemplatesReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AsyncAssociateRGAndTemplatesReq.class),
            f -> f.withMarshaller(UpdateResourceGroupAssociationAlarmTemplateRequest::getBody,
                UpdateResourceGroupAssociationAlarmTemplateRequest::setBody));

        // response

        return builder.build();
    }

}
