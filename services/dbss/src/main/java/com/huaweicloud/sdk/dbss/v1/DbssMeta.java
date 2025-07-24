package com.huaweicloud.sdk.dbss.v1;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.dbss.v1.model.AddAuditAgentRequest;
import com.huaweicloud.sdk.dbss.v1.model.AddAuditAgentResponse;
import com.huaweicloud.sdk.dbss.v1.model.AddAuditDatabaseRequest;
import com.huaweicloud.sdk.dbss.v1.model.AddAuditDatabaseResponse;
import com.huaweicloud.sdk.dbss.v1.model.AddRdsDatabaseRequest;
import com.huaweicloud.sdk.dbss.v1.model.AddRdsDatabaseResponse;
import com.huaweicloud.sdk.dbss.v1.model.AddRdsNoAgentDatabaseRequest;
import com.huaweicloud.sdk.dbss.v1.model.AddRdsNoAgentDatabaseResponse;
import com.huaweicloud.sdk.dbss.v1.model.AgentSwitchRequest;
import com.huaweicloud.sdk.dbss.v1.model.AlarmLogRequest;
import com.huaweicloud.sdk.dbss.v1.model.AuditAgentRequest;
import com.huaweicloud.sdk.dbss.v1.model.AuditSqlRequest;
import com.huaweicloud.sdk.dbss.v1.model.BatchAddResourceTagRequest;
import com.huaweicloud.sdk.dbss.v1.model.BatchAddResourceTagResponse;
import com.huaweicloud.sdk.dbss.v1.model.BatchDeleteResourceTagRequest;
import com.huaweicloud.sdk.dbss.v1.model.BatchDeleteResourceTagResponse;
import com.huaweicloud.sdk.dbss.v1.model.BatchSwitchesRequest;
import com.huaweicloud.sdk.dbss.v1.model.ConfigAlarmTopicRequest;
import com.huaweicloud.sdk.dbss.v1.model.CountResourceInstanceByTagRequest;
import com.huaweicloud.sdk.dbss.v1.model.CountResourceInstanceByTagResponse;
import com.huaweicloud.sdk.dbss.v1.model.CreateDatabaseRequest;
import com.huaweicloud.sdk.dbss.v1.model.CreateInstancePeriodRequest;
import com.huaweicloud.sdk.dbss.v1.model.CreateInstancesPeriodOrderRequest;
import com.huaweicloud.sdk.dbss.v1.model.CreateInstancesPeriodOrderResponse;
import com.huaweicloud.sdk.dbss.v1.model.DeleteAuditAgentRequest;
import com.huaweicloud.sdk.dbss.v1.model.DeleteAuditAgentResponse;
import com.huaweicloud.sdk.dbss.v1.model.DeleteAuditDatabaseRequest;
import com.huaweicloud.sdk.dbss.v1.model.DeleteAuditDatabaseResponse;
import com.huaweicloud.sdk.dbss.v1.model.DeleteInstanceDemandRequest;
import com.huaweicloud.sdk.dbss.v1.model.DeleteInstancesRequest;
import com.huaweicloud.sdk.dbss.v1.model.DeleteInstancesResponse;
import com.huaweicloud.sdk.dbss.v1.model.DownloadAuditAgentRequest;
import com.huaweicloud.sdk.dbss.v1.model.DownloadAuditAgentResponse;
import com.huaweicloud.sdk.dbss.v1.model.ListAlarmTopicConfigInfoRequest;
import com.huaweicloud.sdk.dbss.v1.model.ListAlarmTopicConfigInfoResponse;
import com.huaweicloud.sdk.dbss.v1.model.ListAuditAgentRequest;
import com.huaweicloud.sdk.dbss.v1.model.ListAuditAgentResponse;
import com.huaweicloud.sdk.dbss.v1.model.ListAuditAlarmLogRequest;
import com.huaweicloud.sdk.dbss.v1.model.ListAuditAlarmLogResponse;
import com.huaweicloud.sdk.dbss.v1.model.ListAuditDatabasesRequest;
import com.huaweicloud.sdk.dbss.v1.model.ListAuditDatabasesResponse;
import com.huaweicloud.sdk.dbss.v1.model.ListAuditInstanceJobsRequest;
import com.huaweicloud.sdk.dbss.v1.model.ListAuditInstanceJobsResponse;
import com.huaweicloud.sdk.dbss.v1.model.ListAuditInstancesRequest;
import com.huaweicloud.sdk.dbss.v1.model.ListAuditInstancesResponse;
import com.huaweicloud.sdk.dbss.v1.model.ListAuditOperateLogsRequest;
import com.huaweicloud.sdk.dbss.v1.model.ListAuditOperateLogsResponse;
import com.huaweicloud.sdk.dbss.v1.model.ListAuditRuleRisksRequest;
import com.huaweicloud.sdk.dbss.v1.model.ListAuditRuleRisksResponse;
import com.huaweicloud.sdk.dbss.v1.model.ListAuditRuleScopesRequest;
import com.huaweicloud.sdk.dbss.v1.model.ListAuditRuleScopesResponse;
import com.huaweicloud.sdk.dbss.v1.model.ListAuditSensitiveMasksRequest;
import com.huaweicloud.sdk.dbss.v1.model.ListAuditSensitiveMasksResponse;
import com.huaweicloud.sdk.dbss.v1.model.ListAuditSqlsRequest;
import com.huaweicloud.sdk.dbss.v1.model.ListAuditSqlsResponse;
import com.huaweicloud.sdk.dbss.v1.model.ListAuditSummaryInfosRequest;
import com.huaweicloud.sdk.dbss.v1.model.ListAuditSummaryInfosResponse;
import com.huaweicloud.sdk.dbss.v1.model.ListAvailabilityZoneInfosRequest;
import com.huaweicloud.sdk.dbss.v1.model.ListAvailabilityZoneInfosResponse;
import com.huaweicloud.sdk.dbss.v1.model.ListEcsSpecificationRequest;
import com.huaweicloud.sdk.dbss.v1.model.ListEcsSpecificationResponse;
import com.huaweicloud.sdk.dbss.v1.model.ListProjectResourceTagsRequest;
import com.huaweicloud.sdk.dbss.v1.model.ListProjectResourceTagsResponse;
import com.huaweicloud.sdk.dbss.v1.model.ListRdsDatabasesRequest;
import com.huaweicloud.sdk.dbss.v1.model.ListRdsDatabasesResponse;
import com.huaweicloud.sdk.dbss.v1.model.ListResourceInstanceByTagRequest;
import com.huaweicloud.sdk.dbss.v1.model.ListResourceInstanceByTagResponse;
import com.huaweicloud.sdk.dbss.v1.model.ListSqlInjectionRulesRequest;
import com.huaweicloud.sdk.dbss.v1.model.ListSqlInjectionRulesResponse;
import com.huaweicloud.sdk.dbss.v1.model.OperateLogGetRequest;
import com.huaweicloud.sdk.dbss.v1.model.RdsDbRequest;
import com.huaweicloud.sdk.dbss.v1.model.RdsNoAgentDbRequest;
import com.huaweicloud.sdk.dbss.v1.model.RebootAuditInstanceRequest;
import com.huaweicloud.sdk.dbss.v1.model.RebootAuditInstanceResponse;
import com.huaweicloud.sdk.dbss.v1.model.ResourceInstanceTagRequest;
import com.huaweicloud.sdk.dbss.v1.model.ResourceTagDeleteRequest;
import com.huaweicloud.sdk.dbss.v1.model.ResourceTagRequest;
import com.huaweicloud.sdk.dbss.v1.model.SecurityGroupRequest;
import com.huaweicloud.sdk.dbss.v1.model.ServerIdBean;
import com.huaweicloud.sdk.dbss.v1.model.SetAlarmTopicConfigInfoRequest;
import com.huaweicloud.sdk.dbss.v1.model.SetAlarmTopicConfigInfoResponse;
import com.huaweicloud.sdk.dbss.v1.model.ShowAuditQuotaRequest;
import com.huaweicloud.sdk.dbss.v1.model.ShowAuditQuotaResponse;
import com.huaweicloud.sdk.dbss.v1.model.ShowAuditRuleRiskRequest;
import com.huaweicloud.sdk.dbss.v1.model.ShowAuditRuleRiskResponse;
import com.huaweicloud.sdk.dbss.v1.model.SqlRuleRequest;
import com.huaweicloud.sdk.dbss.v1.model.StartAuditInstanceRequest;
import com.huaweicloud.sdk.dbss.v1.model.StartAuditInstanceResponse;
import com.huaweicloud.sdk.dbss.v1.model.StopAuditInstanceRequest;
import com.huaweicloud.sdk.dbss.v1.model.StopAuditInstanceResponse;
import com.huaweicloud.sdk.dbss.v1.model.SwitchAgentRequest;
import com.huaweicloud.sdk.dbss.v1.model.SwitchAgentResponse;
import com.huaweicloud.sdk.dbss.v1.model.SwitchAuditDatabaseRequest;
import com.huaweicloud.sdk.dbss.v1.model.SwitchAuditDatabaseResponse;
import com.huaweicloud.sdk.dbss.v1.model.SwitchAuditDbRequest;
import com.huaweicloud.sdk.dbss.v1.model.SwitchRiskRuleRequest;
import com.huaweicloud.sdk.dbss.v1.model.SwitchRiskRuleResponse;
import com.huaweicloud.sdk.dbss.v1.model.UpdateAuditBean;
import com.huaweicloud.sdk.dbss.v1.model.UpdateAuditInstanceRequest;
import com.huaweicloud.sdk.dbss.v1.model.UpdateAuditInstanceResponse;
import com.huaweicloud.sdk.dbss.v1.model.UpdateAuditSecurityGroupRequest;
import com.huaweicloud.sdk.dbss.v1.model.UpdateAuditSecurityGroupResponse;

@SuppressWarnings("unchecked")
public class DbssMeta {

    public static final HttpRequestDef<AddAuditDatabaseRequest, AddAuditDatabaseResponse> addAuditDatabase =
        genForAddAuditDatabase();

    private static HttpRequestDef<AddAuditDatabaseRequest, AddAuditDatabaseResponse> genForAddAuditDatabase() {
        // basic
        HttpRequestDef.Builder<AddAuditDatabaseRequest, AddAuditDatabaseResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AddAuditDatabaseRequest.class, AddAuditDatabaseResponse.class)
                .withName("AddAuditDatabase")
                .withUri("/v1/{project_id}/{instance_id}/audit/databases")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddAuditDatabaseRequest::getInstanceId, AddAuditDatabaseRequest::setInstanceId));
        builder.<CreateDatabaseRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateDatabaseRequest.class),
            f -> f.withMarshaller(AddAuditDatabaseRequest::getBody, AddAuditDatabaseRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddRdsDatabaseRequest, AddRdsDatabaseResponse> addRdsDatabase =
        genForAddRdsDatabase();

    private static HttpRequestDef<AddRdsDatabaseRequest, AddRdsDatabaseResponse> genForAddRdsDatabase() {
        // basic
        HttpRequestDef.Builder<AddRdsDatabaseRequest, AddRdsDatabaseResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AddRdsDatabaseRequest.class, AddRdsDatabaseResponse.class)
                .withName("AddRdsDatabase")
                .withUri("/v2/{project_id}/{instance_id}/audit/databases/rds")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddRdsDatabaseRequest::getInstanceId, AddRdsDatabaseRequest::setInstanceId));
        builder.<RdsDbRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RdsDbRequest.class),
            f -> f.withMarshaller(AddRdsDatabaseRequest::getBody, AddRdsDatabaseRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddRdsNoAgentDatabaseRequest, AddRdsNoAgentDatabaseResponse> addRdsNoAgentDatabase =
        genForAddRdsNoAgentDatabase();

    private static HttpRequestDef<AddRdsNoAgentDatabaseRequest, AddRdsNoAgentDatabaseResponse> genForAddRdsNoAgentDatabase() {
        // basic
        HttpRequestDef.Builder<AddRdsNoAgentDatabaseRequest, AddRdsNoAgentDatabaseResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, AddRdsNoAgentDatabaseRequest.class, AddRdsNoAgentDatabaseResponse.class)
            .withName("AddRdsNoAgentDatabase")
            .withUri("/v1/{project_id}/{instance_id}/dbss/audit/databases/rds")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddRdsNoAgentDatabaseRequest::getInstanceId,
                AddRdsNoAgentDatabaseRequest::setInstanceId));
        builder.<RdsNoAgentDbRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RdsNoAgentDbRequest.class),
            f -> f.withMarshaller(AddRdsNoAgentDatabaseRequest::getBody, AddRdsNoAgentDatabaseRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateInstancesPeriodOrderRequest, CreateInstancesPeriodOrderResponse> createInstancesPeriodOrder =
        genForCreateInstancesPeriodOrder();

    private static HttpRequestDef<CreateInstancesPeriodOrderRequest, CreateInstancesPeriodOrderResponse> genForCreateInstancesPeriodOrder() {
        // basic
        HttpRequestDef.Builder<CreateInstancesPeriodOrderRequest, CreateInstancesPeriodOrderResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateInstancesPeriodOrderRequest.class,
                    CreateInstancesPeriodOrderResponse.class)
                .withName("CreateInstancesPeriodOrder")
                .withUri("/v2/{project_id}/dbss/audit/charge/period/order")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<CreateInstancePeriodRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateInstancePeriodRequest.class),
            f -> f.withMarshaller(CreateInstancesPeriodOrderRequest::getBody,
                CreateInstancesPeriodOrderRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteAuditDatabaseRequest, DeleteAuditDatabaseResponse> deleteAuditDatabase =
        genForDeleteAuditDatabase();

    private static HttpRequestDef<DeleteAuditDatabaseRequest, DeleteAuditDatabaseResponse> genForDeleteAuditDatabase() {
        // basic
        HttpRequestDef.Builder<DeleteAuditDatabaseRequest, DeleteAuditDatabaseResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteAuditDatabaseRequest.class, DeleteAuditDatabaseResponse.class)
            .withName("DeleteAuditDatabase")
            .withUri("/v2/{project_id}/{instance_id}/audit/databases/{db_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAuditDatabaseRequest::getInstanceId,
                DeleteAuditDatabaseRequest::setInstanceId));
        builder.<String>withRequestField("db_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAuditDatabaseRequest::getDbId, DeleteAuditDatabaseRequest::setDbId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteInstancesRequest, DeleteInstancesResponse> deleteInstances =
        genForDeleteInstances();

    private static HttpRequestDef<DeleteInstancesRequest, DeleteInstancesResponse> genForDeleteInstances() {
        // basic
        HttpRequestDef.Builder<DeleteInstancesRequest, DeleteInstancesResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteInstancesRequest.class, DeleteInstancesResponse.class)
                .withName("DeleteInstances")
                .withUri("/v1/{project_id}/dbss/audit/instances")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<DeleteInstanceDemandRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteInstanceDemandRequest.class),
            f -> f.withMarshaller(DeleteInstancesRequest::getBody, DeleteInstancesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAlarmTopicConfigInfoRequest, ListAlarmTopicConfigInfoResponse> listAlarmTopicConfigInfo =
        genForListAlarmTopicConfigInfo();

    private static HttpRequestDef<ListAlarmTopicConfigInfoRequest, ListAlarmTopicConfigInfoResponse> genForListAlarmTopicConfigInfo() {
        // basic
        HttpRequestDef.Builder<ListAlarmTopicConfigInfoRequest, ListAlarmTopicConfigInfoResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ListAlarmTopicConfigInfoRequest.class, ListAlarmTopicConfigInfoResponse.class)
                .withName("ListAlarmTopicConfigInfo")
                .withUri("/v1/{project_id}/{instance_id}/audit/alarm/topic")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAlarmTopicConfigInfoRequest::getInstanceId,
                ListAlarmTopicConfigInfoRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAuditAlarmLogRequest, ListAuditAlarmLogResponse> listAuditAlarmLog =
        genForListAuditAlarmLog();

    private static HttpRequestDef<ListAuditAlarmLogRequest, ListAuditAlarmLogResponse> genForListAuditAlarmLog() {
        // basic
        HttpRequestDef.Builder<ListAuditAlarmLogRequest, ListAuditAlarmLogResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListAuditAlarmLogRequest.class, ListAuditAlarmLogResponse.class)
                .withName("ListAuditAlarmLog")
                .withUri("/v1/{project_id}/{instance_id}/audit/alarm-log")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAuditAlarmLogRequest::getInstanceId, ListAuditAlarmLogRequest::setInstanceId));
        builder.<AlarmLogRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AlarmLogRequest.class),
            f -> f.withMarshaller(ListAuditAlarmLogRequest::getBody, ListAuditAlarmLogRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAuditDatabasesRequest, ListAuditDatabasesResponse> listAuditDatabases =
        genForListAuditDatabases();

    private static HttpRequestDef<ListAuditDatabasesRequest, ListAuditDatabasesResponse> genForListAuditDatabases() {
        // basic
        HttpRequestDef.Builder<ListAuditDatabasesRequest, ListAuditDatabasesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAuditDatabasesRequest.class, ListAuditDatabasesResponse.class)
                .withName("ListAuditDatabases")
                .withUri("/v1/{project_id}/{instance_id}/dbss/audit/databases")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAuditDatabasesRequest::getInstanceId, ListAuditDatabasesRequest::setInstanceId));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAuditDatabasesRequest::getStatus, ListAuditDatabasesRequest::setStatus));
        builder.<String>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAuditDatabasesRequest::getOffset, ListAuditDatabasesRequest::setOffset));
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAuditDatabasesRequest::getLimit, ListAuditDatabasesRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAuditInstanceJobsRequest, ListAuditInstanceJobsResponse> listAuditInstanceJobs =
        genForListAuditInstanceJobs();

    private static HttpRequestDef<ListAuditInstanceJobsRequest, ListAuditInstanceJobsResponse> genForListAuditInstanceJobs() {
        // basic
        HttpRequestDef.Builder<ListAuditInstanceJobsRequest, ListAuditInstanceJobsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListAuditInstanceJobsRequest.class, ListAuditInstanceJobsResponse.class)
            .withName("ListAuditInstanceJobs")
            .withUri("/v1/{project_id}/dbss/audit/jobs/{resource_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAuditInstanceJobsRequest::getResourceId,
                ListAuditInstanceJobsRequest::setResourceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAuditInstancesRequest, ListAuditInstancesResponse> listAuditInstances =
        genForListAuditInstances();

    private static HttpRequestDef<ListAuditInstancesRequest, ListAuditInstancesResponse> genForListAuditInstances() {
        // basic
        HttpRequestDef.Builder<ListAuditInstancesRequest, ListAuditInstancesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAuditInstancesRequest.class, ListAuditInstancesResponse.class)
                .withName("ListAuditInstances")
                .withUri("/v1/{project_id}/dbss/audit/instances")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAuditInstancesRequest::getOffset, ListAuditInstancesRequest::setOffset));
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAuditInstancesRequest::getLimit, ListAuditInstancesRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAuditOperateLogsRequest, ListAuditOperateLogsResponse> listAuditOperateLogs =
        genForListAuditOperateLogs();

    private static HttpRequestDef<ListAuditOperateLogsRequest, ListAuditOperateLogsResponse> genForListAuditOperateLogs() {
        // basic
        HttpRequestDef.Builder<ListAuditOperateLogsRequest, ListAuditOperateLogsResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ListAuditOperateLogsRequest.class, ListAuditOperateLogsResponse.class)
            .withName("ListAuditOperateLogs")
            .withUri("/v1/{project_id}/{instance_id}/dbss/audit/operate-log")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAuditOperateLogsRequest::getInstanceId,
                ListAuditOperateLogsRequest::setInstanceId));
        builder.<OperateLogGetRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(OperateLogGetRequest.class),
            f -> f.withMarshaller(ListAuditOperateLogsRequest::getBody, ListAuditOperateLogsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAuditRuleRisksRequest, ListAuditRuleRisksResponse> listAuditRuleRisks =
        genForListAuditRuleRisks();

    private static HttpRequestDef<ListAuditRuleRisksRequest, ListAuditRuleRisksResponse> genForListAuditRuleRisks() {
        // basic
        HttpRequestDef.Builder<ListAuditRuleRisksRequest, ListAuditRuleRisksResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAuditRuleRisksRequest.class, ListAuditRuleRisksResponse.class)
                .withName("ListAuditRuleRisks")
                .withUri("/v1/{project_id}/{instance_id}/dbss/audit/rule/risk")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAuditRuleRisksRequest::getInstanceId, ListAuditRuleRisksRequest::setInstanceId));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAuditRuleRisksRequest::getName, ListAuditRuleRisksRequest::setName));
        builder.<ListAuditRuleRisksRequest.RiskLevelsEnum>withRequestField("risk_levels",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListAuditRuleRisksRequest.RiskLevelsEnum.class),
            f -> f.withMarshaller(ListAuditRuleRisksRequest::getRiskLevels, ListAuditRuleRisksRequest::setRiskLevels));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAuditRuleScopesRequest, ListAuditRuleScopesResponse> listAuditRuleScopes =
        genForListAuditRuleScopes();

    private static HttpRequestDef<ListAuditRuleScopesRequest, ListAuditRuleScopesResponse> genForListAuditRuleScopes() {
        // basic
        HttpRequestDef.Builder<ListAuditRuleScopesRequest, ListAuditRuleScopesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAuditRuleScopesRequest.class, ListAuditRuleScopesResponse.class)
                .withName("ListAuditRuleScopes")
                .withUri("/v1/{project_id}/{instance_id}/dbss/audit/rule/scopes")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAuditRuleScopesRequest::getInstanceId,
                ListAuditRuleScopesRequest::setInstanceId));
        builder.<String>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAuditRuleScopesRequest::getOffset, ListAuditRuleScopesRequest::setOffset));
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAuditRuleScopesRequest::getLimit, ListAuditRuleScopesRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAuditSensitiveMasksRequest, ListAuditSensitiveMasksResponse> listAuditSensitiveMasks =
        genForListAuditSensitiveMasks();

    private static HttpRequestDef<ListAuditSensitiveMasksRequest, ListAuditSensitiveMasksResponse> genForListAuditSensitiveMasks() {
        // basic
        HttpRequestDef.Builder<ListAuditSensitiveMasksRequest, ListAuditSensitiveMasksResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListAuditSensitiveMasksRequest.class, ListAuditSensitiveMasksResponse.class)
            .withName("ListAuditSensitiveMasks")
            .withUri("/v1/{project_id}/{instance_id}/dbss/audit/sensitive/masks")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAuditSensitiveMasksRequest::getInstanceId,
                ListAuditSensitiveMasksRequest::setInstanceId));
        builder.<String>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAuditSensitiveMasksRequest::getOffset,
                ListAuditSensitiveMasksRequest::setOffset));
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAuditSensitiveMasksRequest::getLimit, ListAuditSensitiveMasksRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAuditSqlsRequest, ListAuditSqlsResponse> listAuditSqls =
        genForListAuditSqls();

    private static HttpRequestDef<ListAuditSqlsRequest, ListAuditSqlsResponse> genForListAuditSqls() {
        // basic
        HttpRequestDef.Builder<ListAuditSqlsRequest, ListAuditSqlsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListAuditSqlsRequest.class, ListAuditSqlsResponse.class)
                .withName("ListAuditSqls")
                .withUri("/v1/{project_id}/{instance_id}/audit/sqls")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAuditSqlsRequest::getInstanceId, ListAuditSqlsRequest::setInstanceId));
        builder.<AuditSqlRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AuditSqlRequest.class),
            f -> f.withMarshaller(ListAuditSqlsRequest::getBody, ListAuditSqlsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAuditSummaryInfosRequest, ListAuditSummaryInfosResponse> listAuditSummaryInfos =
        genForListAuditSummaryInfos();

    private static HttpRequestDef<ListAuditSummaryInfosRequest, ListAuditSummaryInfosResponse> genForListAuditSummaryInfos() {
        // basic
        HttpRequestDef.Builder<ListAuditSummaryInfosRequest, ListAuditSummaryInfosResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListAuditSummaryInfosRequest.class, ListAuditSummaryInfosResponse.class)
            .withName("ListAuditSummaryInfos")
            .withUri("/v2/{project_id}/audit/summary/info")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAuditSummaryInfosRequest::getOffset, ListAuditSummaryInfosRequest::setOffset));
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAuditSummaryInfosRequest::getLimit, ListAuditSummaryInfosRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAvailabilityZoneInfosRequest, ListAvailabilityZoneInfosResponse> listAvailabilityZoneInfos =
        genForListAvailabilityZoneInfos();

    private static HttpRequestDef<ListAvailabilityZoneInfosRequest, ListAvailabilityZoneInfosResponse> genForListAvailabilityZoneInfos() {
        // basic
        HttpRequestDef.Builder<ListAvailabilityZoneInfosRequest, ListAvailabilityZoneInfosResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListAvailabilityZoneInfosRequest.class,
                    ListAvailabilityZoneInfosResponse.class)
                .withName("ListAvailabilityZoneInfos")
                .withUri("/v2/{project_id}/dbss/audit/availability-zone")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListEcsSpecificationRequest, ListEcsSpecificationResponse> listEcsSpecification =
        genForListEcsSpecification();

    private static HttpRequestDef<ListEcsSpecificationRequest, ListEcsSpecificationResponse> genForListEcsSpecification() {
        // basic
        HttpRequestDef.Builder<ListEcsSpecificationRequest, ListEcsSpecificationResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListEcsSpecificationRequest.class, ListEcsSpecificationResponse.class)
            .withName("ListEcsSpecification")
            .withUri("/v1/{project_id}/dbss/audit/specification")
            .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListRdsDatabasesRequest, ListRdsDatabasesResponse> listRdsDatabases =
        genForListRdsDatabases();

    private static HttpRequestDef<ListRdsDatabasesRequest, ListRdsDatabasesResponse> genForListRdsDatabases() {
        // basic
        HttpRequestDef.Builder<ListRdsDatabasesRequest, ListRdsDatabasesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListRdsDatabasesRequest.class, ListRdsDatabasesResponse.class)
                .withName("ListRdsDatabases")
                .withUri("/v2/{project_id}/audit/databases/rds")
                .withContentType("application/json");

        // requests
        builder.<ListRdsDatabasesRequest.DbTypeEnum>withRequestField("db_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListRdsDatabasesRequest.DbTypeEnum.class),
            f -> f.withMarshaller(ListRdsDatabasesRequest::getDbType, ListRdsDatabasesRequest::setDbType));
        builder.<String>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRdsDatabasesRequest::getOffset, ListRdsDatabasesRequest::setOffset));
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRdsDatabasesRequest::getLimit, ListRdsDatabasesRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSqlInjectionRulesRequest, ListSqlInjectionRulesResponse> listSqlInjectionRules =
        genForListSqlInjectionRules();

    private static HttpRequestDef<ListSqlInjectionRulesRequest, ListSqlInjectionRulesResponse> genForListSqlInjectionRules() {
        // basic
        HttpRequestDef.Builder<ListSqlInjectionRulesRequest, ListSqlInjectionRulesResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ListSqlInjectionRulesRequest.class, ListSqlInjectionRulesResponse.class)
            .withName("ListSqlInjectionRules")
            .withUri("/v1/{project_id}/{instance_id}/dbss/audit/rule/sql-injections")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSqlInjectionRulesRequest::getInstanceId,
                ListSqlInjectionRulesRequest::setInstanceId));
        builder.<SqlRuleRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SqlRuleRequest.class),
            f -> f.withMarshaller(ListSqlInjectionRulesRequest::getBody, ListSqlInjectionRulesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RebootAuditInstanceRequest, RebootAuditInstanceResponse> rebootAuditInstance =
        genForRebootAuditInstance();

    private static HttpRequestDef<RebootAuditInstanceRequest, RebootAuditInstanceResponse> genForRebootAuditInstance() {
        // basic
        HttpRequestDef.Builder<RebootAuditInstanceRequest, RebootAuditInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RebootAuditInstanceRequest.class, RebootAuditInstanceResponse.class)
                .withName("RebootAuditInstance")
                .withUri("/v1/{project_id}/dbss/audit/instance/reboot")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<ServerIdBean>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ServerIdBean.class),
            f -> f.withMarshaller(RebootAuditInstanceRequest::getBody, RebootAuditInstanceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SetAlarmTopicConfigInfoRequest, SetAlarmTopicConfigInfoResponse> setAlarmTopicConfigInfo =
        genForSetAlarmTopicConfigInfo();

    private static HttpRequestDef<SetAlarmTopicConfigInfoRequest, SetAlarmTopicConfigInfoResponse> genForSetAlarmTopicConfigInfo() {
        // basic
        HttpRequestDef.Builder<SetAlarmTopicConfigInfoRequest, SetAlarmTopicConfigInfoResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, SetAlarmTopicConfigInfoRequest.class, SetAlarmTopicConfigInfoResponse.class)
            .withName("SetAlarmTopicConfigInfo")
            .withUri("/v1/{project_id}/{instance_id}/audit/alarm/topic")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SetAlarmTopicConfigInfoRequest::getInstanceId,
                SetAlarmTopicConfigInfoRequest::setInstanceId));
        builder.<ConfigAlarmTopicRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ConfigAlarmTopicRequest.class),
            f -> f.withMarshaller(SetAlarmTopicConfigInfoRequest::getBody, SetAlarmTopicConfigInfoRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAuditQuotaRequest, ShowAuditQuotaResponse> showAuditQuota =
        genForShowAuditQuota();

    private static HttpRequestDef<ShowAuditQuotaRequest, ShowAuditQuotaResponse> genForShowAuditQuota() {
        // basic
        HttpRequestDef.Builder<ShowAuditQuotaRequest, ShowAuditQuotaResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowAuditQuotaRequest.class, ShowAuditQuotaResponse.class)
                .withName("ShowAuditQuota")
                .withUri("/v1/{project_id}/dbss/audit/quota")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAuditRuleRiskRequest, ShowAuditRuleRiskResponse> showAuditRuleRisk =
        genForShowAuditRuleRisk();

    private static HttpRequestDef<ShowAuditRuleRiskRequest, ShowAuditRuleRiskResponse> genForShowAuditRuleRisk() {
        // basic
        HttpRequestDef.Builder<ShowAuditRuleRiskRequest, ShowAuditRuleRiskResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowAuditRuleRiskRequest.class, ShowAuditRuleRiskResponse.class)
                .withName("ShowAuditRuleRisk")
                .withUri("/v1/{project_id}/{instance_id}/dbss/audit/rule/risk/{risk_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAuditRuleRiskRequest::getInstanceId, ShowAuditRuleRiskRequest::setInstanceId));
        builder.<String>withRequestField("risk_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAuditRuleRiskRequest::getRiskId, ShowAuditRuleRiskRequest::setRiskId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StartAuditInstanceRequest, StartAuditInstanceResponse> startAuditInstance =
        genForStartAuditInstance();

    private static HttpRequestDef<StartAuditInstanceRequest, StartAuditInstanceResponse> genForStartAuditInstance() {
        // basic
        HttpRequestDef.Builder<StartAuditInstanceRequest, StartAuditInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, StartAuditInstanceRequest.class, StartAuditInstanceResponse.class)
                .withName("StartAuditInstance")
                .withUri("/v1/{project_id}/dbss/audit/instance/start")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<ServerIdBean>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ServerIdBean.class),
            f -> f.withMarshaller(StartAuditInstanceRequest::getBody, StartAuditInstanceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StopAuditInstanceRequest, StopAuditInstanceResponse> stopAuditInstance =
        genForStopAuditInstance();

    private static HttpRequestDef<StopAuditInstanceRequest, StopAuditInstanceResponse> genForStopAuditInstance() {
        // basic
        HttpRequestDef.Builder<StopAuditInstanceRequest, StopAuditInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, StopAuditInstanceRequest.class, StopAuditInstanceResponse.class)
                .withName("StopAuditInstance")
                .withUri("/v1/{project_id}/dbss/audit/instance/stop")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<ServerIdBean>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ServerIdBean.class),
            f -> f.withMarshaller(StopAuditInstanceRequest::getBody, StopAuditInstanceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SwitchAuditDatabaseRequest, SwitchAuditDatabaseResponse> switchAuditDatabase =
        genForSwitchAuditDatabase();

    private static HttpRequestDef<SwitchAuditDatabaseRequest, SwitchAuditDatabaseResponse> genForSwitchAuditDatabase() {
        // basic
        HttpRequestDef.Builder<SwitchAuditDatabaseRequest, SwitchAuditDatabaseResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, SwitchAuditDatabaseRequest.class, SwitchAuditDatabaseResponse.class)
                .withName("SwitchAuditDatabase")
                .withUri("/v2/{project_id}/{instance_id}/audit/databases/switch")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SwitchAuditDatabaseRequest::getInstanceId,
                SwitchAuditDatabaseRequest::setInstanceId));
        builder.<SwitchAuditDbRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SwitchAuditDbRequest.class),
            f -> f.withMarshaller(SwitchAuditDatabaseRequest::getBody, SwitchAuditDatabaseRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SwitchRiskRuleRequest, SwitchRiskRuleResponse> switchRiskRule =
        genForSwitchRiskRule();

    private static HttpRequestDef<SwitchRiskRuleRequest, SwitchRiskRuleResponse> genForSwitchRiskRule() {
        // basic
        HttpRequestDef.Builder<SwitchRiskRuleRequest, SwitchRiskRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, SwitchRiskRuleRequest.class, SwitchRiskRuleResponse.class)
                .withName("SwitchRiskRule")
                .withUri("/v1/{project_id}/{instance_id}/audit/rule/risk/switch")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SwitchRiskRuleRequest::getInstanceId, SwitchRiskRuleRequest::setInstanceId));
        builder.<BatchSwitchesRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchSwitchesRequest.class),
            f -> f.withMarshaller(SwitchRiskRuleRequest::getBody, SwitchRiskRuleRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateAuditInstanceRequest, UpdateAuditInstanceResponse> updateAuditInstance =
        genForUpdateAuditInstance();

    private static HttpRequestDef<UpdateAuditInstanceRequest, UpdateAuditInstanceResponse> genForUpdateAuditInstance() {
        // basic
        HttpRequestDef.Builder<UpdateAuditInstanceRequest, UpdateAuditInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateAuditInstanceRequest.class, UpdateAuditInstanceResponse.class)
                .withName("UpdateAuditInstance")
                .withUri("/v1/{project_id}/dbss/audit/instances/{instance_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAuditInstanceRequest::getInstanceId,
                UpdateAuditInstanceRequest::setInstanceId));
        builder.<UpdateAuditBean>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateAuditBean.class),
            f -> f.withMarshaller(UpdateAuditInstanceRequest::getBody, UpdateAuditInstanceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateAuditSecurityGroupRequest, UpdateAuditSecurityGroupResponse> updateAuditSecurityGroup =
        genForUpdateAuditSecurityGroup();

    private static HttpRequestDef<UpdateAuditSecurityGroupRequest, UpdateAuditSecurityGroupResponse> genForUpdateAuditSecurityGroup() {
        // basic
        HttpRequestDef.Builder<UpdateAuditSecurityGroupRequest, UpdateAuditSecurityGroupResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, UpdateAuditSecurityGroupRequest.class, UpdateAuditSecurityGroupResponse.class)
                .withName("UpdateAuditSecurityGroup")
                .withUri("/v1/{project_id}/dbss/audit/security-group")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<SecurityGroupRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SecurityGroupRequest.class),
            f -> f.withMarshaller(UpdateAuditSecurityGroupRequest::getBody, UpdateAuditSecurityGroupRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddAuditAgentRequest, AddAuditAgentResponse> addAuditAgent =
        genForAddAuditAgent();

    private static HttpRequestDef<AddAuditAgentRequest, AddAuditAgentResponse> genForAddAuditAgent() {
        // basic
        HttpRequestDef.Builder<AddAuditAgentRequest, AddAuditAgentResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AddAuditAgentRequest.class, AddAuditAgentResponse.class)
                .withName("AddAuditAgent")
                .withUri("/v2/{project_id}/{instance_id}/audit/agents")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddAuditAgentRequest::getInstanceId, AddAuditAgentRequest::setInstanceId));
        builder.<AuditAgentRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AuditAgentRequest.class),
            f -> f.withMarshaller(AddAuditAgentRequest::getBody, AddAuditAgentRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteAuditAgentRequest, DeleteAuditAgentResponse> deleteAuditAgent =
        genForDeleteAuditAgent();

    private static HttpRequestDef<DeleteAuditAgentRequest, DeleteAuditAgentResponse> genForDeleteAuditAgent() {
        // basic
        HttpRequestDef.Builder<DeleteAuditAgentRequest, DeleteAuditAgentResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteAuditAgentRequest.class, DeleteAuditAgentResponse.class)
                .withName("DeleteAuditAgent")
                .withUri("/v2/{project_id}/{instance_id}/audit/agents/{agent_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAuditAgentRequest::getInstanceId, DeleteAuditAgentRequest::setInstanceId));
        builder.<String>withRequestField("agent_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAuditAgentRequest::getAgentId, DeleteAuditAgentRequest::setAgentId));
        builder.<String>withRequestField("db_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAuditAgentRequest::getDbId, DeleteAuditAgentRequest::setDbId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DownloadAuditAgentRequest, DownloadAuditAgentResponse> downloadAuditAgent =
        genForDownloadAuditAgent();

    private static HttpRequestDef<DownloadAuditAgentRequest, DownloadAuditAgentResponse> genForDownloadAuditAgent() {
        // basic
        HttpRequestDef.Builder<DownloadAuditAgentRequest, DownloadAuditAgentResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, DownloadAuditAgentRequest.class, DownloadAuditAgentResponse.class)
                .withName("DownloadAuditAgent")
                .withUri("/v2/{project_id}/{instance_id}/audit/agents/{agent_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DownloadAuditAgentRequest::getInstanceId, DownloadAuditAgentRequest::setInstanceId));
        builder.<String>withRequestField("agent_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DownloadAuditAgentRequest::getAgentId, DownloadAuditAgentRequest::setAgentId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAuditAgentRequest, ListAuditAgentResponse> listAuditAgent =
        genForListAuditAgent();

    private static HttpRequestDef<ListAuditAgentRequest, ListAuditAgentResponse> genForListAuditAgent() {
        // basic
        HttpRequestDef.Builder<ListAuditAgentRequest, ListAuditAgentResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAuditAgentRequest.class, ListAuditAgentResponse.class)
                .withName("ListAuditAgent")
                .withUri("/v2/{project_id}/{instance_id}/audit/agents")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAuditAgentRequest::getInstanceId, ListAuditAgentRequest::setInstanceId));
        builder.<String>withRequestField("db_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAuditAgentRequest::getDbId, ListAuditAgentRequest::setDbId));
        builder.<String>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAuditAgentRequest::getOffset, ListAuditAgentRequest::setOffset));
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAuditAgentRequest::getLimit, ListAuditAgentRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SwitchAgentRequest, SwitchAgentResponse> switchAgent = genForSwitchAgent();

    private static HttpRequestDef<SwitchAgentRequest, SwitchAgentResponse> genForSwitchAgent() {
        // basic
        HttpRequestDef.Builder<SwitchAgentRequest, SwitchAgentResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, SwitchAgentRequest.class, SwitchAgentResponse.class)
                .withName("SwitchAgent")
                .withUri("/v1/{project_id}/{instance_id}/audit/agent/switch")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SwitchAgentRequest::getInstanceId, SwitchAgentRequest::setInstanceId));
        builder.<AgentSwitchRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AgentSwitchRequest.class),
            f -> f.withMarshaller(SwitchAgentRequest::getBody, SwitchAgentRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchAddResourceTagRequest, BatchAddResourceTagResponse> batchAddResourceTag =
        genForBatchAddResourceTag();

    private static HttpRequestDef<BatchAddResourceTagRequest, BatchAddResourceTagResponse> genForBatchAddResourceTag() {
        // basic
        HttpRequestDef.Builder<BatchAddResourceTagRequest, BatchAddResourceTagResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchAddResourceTagRequest.class, BatchAddResourceTagResponse.class)
                .withName("BatchAddResourceTag")
                .withUri("/v1/{project_id}/{resource_type}/{resource_id}/tags/create")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<BatchAddResourceTagRequest.ResourceTypeEnum>withRequestField("resource_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchAddResourceTagRequest.ResourceTypeEnum.class),
            f -> f.withMarshaller(BatchAddResourceTagRequest::getResourceType,
                BatchAddResourceTagRequest::setResourceType));
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchAddResourceTagRequest::getResourceId,
                BatchAddResourceTagRequest::setResourceId));
        builder.<ResourceTagRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ResourceTagRequest.class),
            f -> f.withMarshaller(BatchAddResourceTagRequest::getBody, BatchAddResourceTagRequest::setBody));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(BatchAddResourceTagResponse::getBody, BatchAddResourceTagResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteResourceTagRequest, BatchDeleteResourceTagResponse> batchDeleteResourceTag =
        genForBatchDeleteResourceTag();

    private static HttpRequestDef<BatchDeleteResourceTagRequest, BatchDeleteResourceTagResponse> genForBatchDeleteResourceTag() {
        // basic
        HttpRequestDef.Builder<BatchDeleteResourceTagRequest, BatchDeleteResourceTagResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, BatchDeleteResourceTagRequest.class, BatchDeleteResourceTagResponse.class)
            .withName("BatchDeleteResourceTag")
            .withUri("/v1/{project_id}/{resource_type}/{resource_id}/tags/delete")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<BatchDeleteResourceTagRequest.ResourceTypeEnum>withRequestField("resource_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchDeleteResourceTagRequest.ResourceTypeEnum.class),
            f -> f.withMarshaller(BatchDeleteResourceTagRequest::getResourceType,
                BatchDeleteResourceTagRequest::setResourceType));
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeleteResourceTagRequest::getResourceId,
                BatchDeleteResourceTagRequest::setResourceId));
        builder.<ResourceTagDeleteRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ResourceTagDeleteRequest.class),
            f -> f.withMarshaller(BatchDeleteResourceTagRequest::getBody, BatchDeleteResourceTagRequest::setBody));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(BatchDeleteResourceTagResponse::getBody, BatchDeleteResourceTagResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<CountResourceInstanceByTagRequest, CountResourceInstanceByTagResponse> countResourceInstanceByTag =
        genForCountResourceInstanceByTag();

    private static HttpRequestDef<CountResourceInstanceByTagRequest, CountResourceInstanceByTagResponse> genForCountResourceInstanceByTag() {
        // basic
        HttpRequestDef.Builder<CountResourceInstanceByTagRequest, CountResourceInstanceByTagResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CountResourceInstanceByTagRequest.class,
                    CountResourceInstanceByTagResponse.class)
                .withName("CountResourceInstanceByTag")
                .withUri("/v1/{project_id}/{resource_type}/resource-instances/count")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<CountResourceInstanceByTagRequest.ResourceTypeEnum>withRequestField("resource_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CountResourceInstanceByTagRequest.ResourceTypeEnum.class),
            f -> f.withMarshaller(CountResourceInstanceByTagRequest::getResourceType,
                CountResourceInstanceByTagRequest::setResourceType));
        builder.<ResourceInstanceTagRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ResourceInstanceTagRequest.class),
            f -> f.withMarshaller(CountResourceInstanceByTagRequest::getBody,
                CountResourceInstanceByTagRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListProjectResourceTagsRequest, ListProjectResourceTagsResponse> listProjectResourceTags =
        genForListProjectResourceTags();

    private static HttpRequestDef<ListProjectResourceTagsRequest, ListProjectResourceTagsResponse> genForListProjectResourceTags() {
        // basic
        HttpRequestDef.Builder<ListProjectResourceTagsRequest, ListProjectResourceTagsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListProjectResourceTagsRequest.class, ListProjectResourceTagsResponse.class)
            .withName("ListProjectResourceTags")
            .withUri("/v1/{project_id}/{resource_type}/tags")
            .withContentType("application/json");

        // requests
        builder.<ListProjectResourceTagsRequest.ResourceTypeEnum>withRequestField("resource_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListProjectResourceTagsRequest.ResourceTypeEnum.class),
            f -> f.withMarshaller(ListProjectResourceTagsRequest::getResourceType,
                ListProjectResourceTagsRequest::setResourceType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListResourceInstanceByTagRequest, ListResourceInstanceByTagResponse> listResourceInstanceByTag =
        genForListResourceInstanceByTag();

    private static HttpRequestDef<ListResourceInstanceByTagRequest, ListResourceInstanceByTagResponse> genForListResourceInstanceByTag() {
        // basic
        HttpRequestDef.Builder<ListResourceInstanceByTagRequest, ListResourceInstanceByTagResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ListResourceInstanceByTagRequest.class,
                    ListResourceInstanceByTagResponse.class)
                .withName("ListResourceInstanceByTag")
                .withUri("/v1/{project_id}/{resource_type}/resource-instances/filter")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<ListResourceInstanceByTagRequest.ResourceTypeEnum>withRequestField("resource_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListResourceInstanceByTagRequest.ResourceTypeEnum.class),
            f -> f.withMarshaller(ListResourceInstanceByTagRequest::getResourceType,
                ListResourceInstanceByTagRequest::setResourceType));
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResourceInstanceByTagRequest::getLimit,
                ListResourceInstanceByTagRequest::setLimit));
        builder.<String>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResourceInstanceByTagRequest::getOffset,
                ListResourceInstanceByTagRequest::setOffset));
        builder.<ResourceInstanceTagRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ResourceInstanceTagRequest.class),
            f -> f.withMarshaller(ListResourceInstanceByTagRequest::getBody,
                ListResourceInstanceByTagRequest::setBody));

        // response

        return builder.build();
    }

}
