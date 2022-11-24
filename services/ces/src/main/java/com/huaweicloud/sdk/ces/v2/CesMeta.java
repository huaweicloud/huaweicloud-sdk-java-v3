package com.huaweicloud.sdk.ces.v2;

import com.huaweicloud.sdk.ces.v2.model.*;
import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;

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
