package com.huaweicloud.sdk.dbss.v1;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.dbss.v1.model.AddRdsNoAgentDatabaseRequest;
import com.huaweicloud.sdk.dbss.v1.model.AddRdsNoAgentDatabaseResponse;
import com.huaweicloud.sdk.dbss.v1.model.AgentSwitchRequest;
import com.huaweicloud.sdk.dbss.v1.model.BatchAddResourceTagRequest;
import com.huaweicloud.sdk.dbss.v1.model.BatchAddResourceTagResponse;
import com.huaweicloud.sdk.dbss.v1.model.BatchDeleteResourceTagRequest;
import com.huaweicloud.sdk.dbss.v1.model.BatchDeleteResourceTagResponse;
import com.huaweicloud.sdk.dbss.v1.model.BatchSwitchesRequest;
import com.huaweicloud.sdk.dbss.v1.model.CountResourceInstanceByTagRequest;
import com.huaweicloud.sdk.dbss.v1.model.CountResourceInstanceByTagResponse;
import com.huaweicloud.sdk.dbss.v1.model.CreateInstancePeriodRequest;
import com.huaweicloud.sdk.dbss.v1.model.CreateInstancesPeriodOrderRequest;
import com.huaweicloud.sdk.dbss.v1.model.CreateInstancesPeriodOrderResponse;
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
import com.huaweicloud.sdk.dbss.v1.model.ListAvailabilityZoneInfosRequest;
import com.huaweicloud.sdk.dbss.v1.model.ListAvailabilityZoneInfosResponse;
import com.huaweicloud.sdk.dbss.v1.model.ListEcsSpecificationRequest;
import com.huaweicloud.sdk.dbss.v1.model.ListEcsSpecificationResponse;
import com.huaweicloud.sdk.dbss.v1.model.ListProjectResourceTagsRequest;
import com.huaweicloud.sdk.dbss.v1.model.ListProjectResourceTagsResponse;
import com.huaweicloud.sdk.dbss.v1.model.ListResourceInstanceByTagRequest;
import com.huaweicloud.sdk.dbss.v1.model.ListResourceInstanceByTagResponse;
import com.huaweicloud.sdk.dbss.v1.model.ListSqlInjectionRulesRequest;
import com.huaweicloud.sdk.dbss.v1.model.ListSqlInjectionRulesResponse;
import com.huaweicloud.sdk.dbss.v1.model.OperateLogGetRequest;
import com.huaweicloud.sdk.dbss.v1.model.RdsNoAgentDbRequest;
import com.huaweicloud.sdk.dbss.v1.model.ResourceInstanceTagRequest;
import com.huaweicloud.sdk.dbss.v1.model.ResourceTagRequest;
import com.huaweicloud.sdk.dbss.v1.model.SecurityGroupRequest;
import com.huaweicloud.sdk.dbss.v1.model.ShowAuditQuotaRequest;
import com.huaweicloud.sdk.dbss.v1.model.ShowAuditQuotaResponse;
import com.huaweicloud.sdk.dbss.v1.model.ShowAuditRuleRiskRequest;
import com.huaweicloud.sdk.dbss.v1.model.ShowAuditRuleRiskResponse;
import com.huaweicloud.sdk.dbss.v1.model.SqlRuleRequest;
import com.huaweicloud.sdk.dbss.v1.model.SwitchAgentRequest;
import com.huaweicloud.sdk.dbss.v1.model.SwitchAgentResponse;
import com.huaweicloud.sdk.dbss.v1.model.SwitchRiskRuleRequest;
import com.huaweicloud.sdk.dbss.v1.model.SwitchRiskRuleResponse;
import com.huaweicloud.sdk.dbss.v1.model.UpdateAuditSecurityGroupRequest;
import com.huaweicloud.sdk.dbss.v1.model.UpdateAuditSecurityGroupResponse;

@SuppressWarnings("unchecked")
public class DbssMeta {

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
        builder.<String>withRequestField("resource_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
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
        builder.<String>withRequestField("resource_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeleteResourceTagRequest::getResourceType,
                BatchDeleteResourceTagRequest::setResourceType));
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeleteResourceTagRequest::getResourceId,
                BatchDeleteResourceTagRequest::setResourceId));
        builder.<ResourceTagRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ResourceTagRequest.class),
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
        builder.<String>withRequestField("resource_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
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
        builder.<String>withRequestField("risk_levels",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
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
        builder.<String>withRequestField("resource_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
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
        builder.<String>withRequestField("resource_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
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

}
