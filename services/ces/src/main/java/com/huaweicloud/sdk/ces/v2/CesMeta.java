package com.huaweicloud.sdk.ces.v2;

import com.huaweicloud.sdk.ces.v2.model.*;
import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;

@SuppressWarnings("unchecked")
public class CesMeta {

    public static final HttpRequestDef<AddAlarmResourcesRequest, AddAlarmResourcesResponse> addAlarmResources =
        genForaddAlarmResources();

    private static HttpRequestDef<AddAlarmResourcesRequest, AddAlarmResourcesResponse> genForaddAlarmResources() {
        // basic
        HttpRequestDef.Builder<AddAlarmResourcesRequest, AddAlarmResourcesResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AddAlarmResourcesRequest.class, AddAlarmResourcesResponse.class)
                .withName("AddAlarmResources")
                .withUri("/v2/{project_id}/alarms/{alarm_id}/resources/batch-create")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("alarm_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddAlarmResourcesRequest::getAlarmId, (req, v) -> {
                req.setAlarmId(v);
            }));
        builder.<ResourcesReqV2>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ResourcesReqV2.class),
            f -> f.withMarshaller(AddAlarmResourcesRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddResourceGroupsResourcesBatchRequest, AddResourceGroupsResourcesBatchResponse> addResourceGroupsResourcesBatch =
        genForaddResourceGroupsResourcesBatch();

    private static HttpRequestDef<AddResourceGroupsResourcesBatchRequest, AddResourceGroupsResourcesBatchResponse> genForaddResourceGroupsResourcesBatch() {
        // basic
        HttpRequestDef.Builder<AddResourceGroupsResourcesBatchRequest, AddResourceGroupsResourcesBatchResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    AddResourceGroupsResourcesBatchRequest.class,
                    AddResourceGroupsResourcesBatchResponse.class)
                .withName("AddResourceGroupsResourcesBatch")
                .withUri("/v2/{project_id}/resource-groups/{group_id}/resources/batch-create")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddResourceGroupsResourcesBatchRequest::getGroupId, (req, v) -> {
                req.setGroupId(v);
            }));
        builder.<ResourcesReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ResourcesReq.class),
            f -> f.withMarshaller(AddResourceGroupsResourcesBatchRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateAlarmRequest, CreateAlarmResponse> createAlarm = genForcreateAlarm();

    private static HttpRequestDef<CreateAlarmRequest, CreateAlarmResponse> genForcreateAlarm() {
        // basic
        HttpRequestDef.Builder<CreateAlarmRequest, CreateAlarmResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateAlarmRequest.class, CreateAlarmResponse.class)
                .withName("CreateAlarm")
                .withUri("/v2/{project_id}/alarms")
                .withContentType("application/json");

        // requests
        builder.<PostAlarmsReqV2>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PostAlarmsReqV2.class),
            f -> f.withMarshaller(CreateAlarmRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteAlarmRequest, DeleteAlarmResponse> deleteAlarm = genFordeleteAlarm();

    private static HttpRequestDef<DeleteAlarmRequest, DeleteAlarmResponse> genFordeleteAlarm() {
        // basic
        HttpRequestDef.Builder<DeleteAlarmRequest, DeleteAlarmResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteAlarmRequest.class, DeleteAlarmResponse.class)
                .withName("DeleteAlarm")
                .withUri("/v2/{project_id}/alarms/{alarm_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("alarm_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAlarmRequest::getAlarmId, (req, v) -> {
                req.setAlarmId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteAlarmResourcesRequest, DeleteAlarmResourcesResponse> deleteAlarmResources =
        genFordeleteAlarmResources();

    private static HttpRequestDef<DeleteAlarmResourcesRequest, DeleteAlarmResourcesResponse> genFordeleteAlarmResources() {
        // basic
        HttpRequestDef.Builder<DeleteAlarmResourcesRequest, DeleteAlarmResourcesResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, DeleteAlarmResourcesRequest.class, DeleteAlarmResourcesResponse.class)
            .withName("DeleteAlarmResources")
            .withUri("/v2/{project_id}/alarms/{alarm_id}/resources/batch-delete")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("alarm_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAlarmResourcesRequest::getAlarmId, (req, v) -> {
                req.setAlarmId(v);
            }));
        builder.<ResourcesReqV2>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ResourcesReqV2.class),
            f -> f.withMarshaller(DeleteAlarmResourcesRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteResourceGroupsResourcesBatchRequest, DeleteResourceGroupsResourcesBatchResponse> deleteResourceGroupsResourcesBatch =
        genFordeleteResourceGroupsResourcesBatch();

    private static HttpRequestDef<DeleteResourceGroupsResourcesBatchRequest, DeleteResourceGroupsResourcesBatchResponse> genFordeleteResourceGroupsResourcesBatch() {
        // basic
        HttpRequestDef.Builder<DeleteResourceGroupsResourcesBatchRequest, DeleteResourceGroupsResourcesBatchResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    DeleteResourceGroupsResourcesBatchRequest.class,
                    DeleteResourceGroupsResourcesBatchResponse.class)
                .withName("DeleteResourceGroupsResourcesBatch")
                .withUri("/v2/{project_id}/resource-groups/{group_id}/resources/batch-delete")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteResourceGroupsResourcesBatchRequest::getGroupId, (req, v) -> {
                req.setGroupId(v);
            }));
        builder.<ResourcesReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ResourcesReq.class),
            f -> f.withMarshaller(DeleteResourceGroupsResourcesBatchRequest::getBody, (req, v) -> {
                req.setBody(v);
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

    public static final HttpRequestDef<ListAlarmResourcesRequest, ListAlarmResourcesResponse> listAlarmResources =
        genForlistAlarmResources();

    private static HttpRequestDef<ListAlarmResourcesRequest, ListAlarmResourcesResponse> genForlistAlarmResources() {
        // basic
        HttpRequestDef.Builder<ListAlarmResourcesRequest, ListAlarmResourcesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAlarmResourcesRequest.class, ListAlarmResourcesResponse.class)
                .withName("ListAlarmResources")
                .withUri("/v2/{project_id}/alarms/{alarm_id}/resources")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("alarm_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAlarmResourcesRequest::getAlarmId, (req, v) -> {
                req.setAlarmId(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAlarmResourcesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAlarmResourcesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAlarmsRequest, ListAlarmsResponse> listAlarms = genForlistAlarms();

    private static HttpRequestDef<ListAlarmsRequest, ListAlarmsResponse> genForlistAlarms() {
        // basic
        HttpRequestDef.Builder<ListAlarmsRequest, ListAlarmsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAlarmsRequest.class, ListAlarmsResponse.class)
                .withName("ListAlarms")
                .withUri("/v2/{project_id}/alarms")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("alarm_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAlarmsRequest::getAlarmId, (req, v) -> {
                req.setAlarmId(v);
            }));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAlarmsRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<String>withRequestField("namespace",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAlarmsRequest::getNamespace, (req, v) -> {
                req.setNamespace(v);
            }));
        builder.<String>withRequestField("resource_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAlarmsRequest::getResourceId, (req, v) -> {
                req.setResourceId(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAlarmsRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAlarmsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAlarmsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateAlarmActionRequest, UpdateAlarmActionResponse> updateAlarmAction =
        genForupdateAlarmAction();

    private static HttpRequestDef<UpdateAlarmActionRequest, UpdateAlarmActionResponse> genForupdateAlarmAction() {
        // basic
        HttpRequestDef.Builder<UpdateAlarmActionRequest, UpdateAlarmActionResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateAlarmActionRequest.class, UpdateAlarmActionResponse.class)
                .withName("UpdateAlarmAction")
                .withUri("/v2/{project_id}/alarms/{alarm_id}/base-info")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("alarm_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAlarmActionRequest::getAlarmId, (req, v) -> {
                req.setAlarmId(v);
            }));
        builder.<PutAlarmActionsReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PutAlarmActionsReq.class),
            f -> f.withMarshaller(UpdateAlarmActionRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

}
