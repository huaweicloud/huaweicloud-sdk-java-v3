package com.huaweicloud.sdk.clouddc.v1;

import com.huaweicloud.sdk.clouddc.v1.model.BatchCreateIrackTagsRequest;
import com.huaweicloud.sdk.clouddc.v1.model.BatchCreateIrackTagsResponse;
import com.huaweicloud.sdk.clouddc.v1.model.BatchCreateTagsRequest;
import com.huaweicloud.sdk.clouddc.v1.model.BatchCreateTagsResponse;
import com.huaweicloud.sdk.clouddc.v1.model.BatchDeleteIrackTagsRequest;
import com.huaweicloud.sdk.clouddc.v1.model.BatchDeleteIrackTagsResponse;
import com.huaweicloud.sdk.clouddc.v1.model.BatchDeleteOptions;
import com.huaweicloud.sdk.clouddc.v1.model.BatchDeleteTagsRequest;
import com.huaweicloud.sdk.clouddc.v1.model.BatchDeleteTagsResponse;
import com.huaweicloud.sdk.clouddc.v1.model.ChangeInstancePasswordOptions;
import com.huaweicloud.sdk.clouddc.v1.model.ChangeInstancePasswordRequest;
import com.huaweicloud.sdk.clouddc.v1.model.ChangeInstancePasswordResponse;
import com.huaweicloud.sdk.clouddc.v1.model.ChangeServerPowerStateRequest;
import com.huaweicloud.sdk.clouddc.v1.model.ChangeServerPowerStateResponse;
import com.huaweicloud.sdk.clouddc.v1.model.CreateInstanceOpitons;
import com.huaweicloud.sdk.clouddc.v1.model.CreateInstanceRequest;
import com.huaweicloud.sdk.clouddc.v1.model.CreateInstanceResponse;
import com.huaweicloud.sdk.clouddc.v1.model.DeleteInstanceRequest;
import com.huaweicloud.sdk.clouddc.v1.model.DeleteInstanceResponse;
import com.huaweicloud.sdk.clouddc.v1.model.DeleteInstancesRequest;
import com.huaweicloud.sdk.clouddc.v1.model.DeleteInstancesResponse;
import com.huaweicloud.sdk.clouddc.v1.model.DownloadServerLogsRequest;
import com.huaweicloud.sdk.clouddc.v1.model.DownloadServerLogsResponse;
import com.huaweicloud.sdk.clouddc.v1.model.ExportServerLogsRequest;
import com.huaweicloud.sdk.clouddc.v1.model.ExportServerLogsResponse;
import com.huaweicloud.sdk.clouddc.v1.model.FirmwareDetails;
import com.huaweicloud.sdk.clouddc.v1.model.IRackRequest;
import com.huaweicloud.sdk.clouddc.v1.model.ListAlarmsRequest;
import com.huaweicloud.sdk.clouddc.v1.model.ListAlarmsResponse;
import com.huaweicloud.sdk.clouddc.v1.model.ListEventsRequest;
import com.huaweicloud.sdk.clouddc.v1.model.ListEventsResponse;
import com.huaweicloud.sdk.clouddc.v1.model.ListIDcsRequest;
import com.huaweicloud.sdk.clouddc.v1.model.ListIDcsResponse;
import com.huaweicloud.sdk.clouddc.v1.model.ListIRacksRequest;
import com.huaweicloud.sdk.clouddc.v1.model.ListIRacksResponse;
import com.huaweicloud.sdk.clouddc.v1.model.ListInstancesRequest;
import com.huaweicloud.sdk.clouddc.v1.model.ListInstancesResponse;
import com.huaweicloud.sdk.clouddc.v1.model.ListServersRequest;
import com.huaweicloud.sdk.clouddc.v1.model.ListServersResponse;
import com.huaweicloud.sdk.clouddc.v1.model.ModifyInstanceIpRequest;
import com.huaweicloud.sdk.clouddc.v1.model.ModifyInstanceIpRequestBody;
import com.huaweicloud.sdk.clouddc.v1.model.ModifyInstanceIpResponse;
import com.huaweicloud.sdk.clouddc.v1.model.PowerAction;
import com.huaweicloud.sdk.clouddc.v1.model.ReinstallOSOptions;
import com.huaweicloud.sdk.clouddc.v1.model.ReinstallOsRequest;
import com.huaweicloud.sdk.clouddc.v1.model.ReinstallOsResponse;
import com.huaweicloud.sdk.clouddc.v1.model.ResourceTags;
import com.huaweicloud.sdk.clouddc.v1.model.RunInstancesOptions;
import com.huaweicloud.sdk.clouddc.v1.model.RunInstancesRequest;
import com.huaweicloud.sdk.clouddc.v1.model.RunInstancesResponse;
import com.huaweicloud.sdk.clouddc.v1.model.ShowAlarmSummaryRequest;
import com.huaweicloud.sdk.clouddc.v1.model.ShowAlarmSummaryResponse;
import com.huaweicloud.sdk.clouddc.v1.model.ShowAlarmTrendRequest;
import com.huaweicloud.sdk.clouddc.v1.model.ShowAlarmTrendResponse;
import com.huaweicloud.sdk.clouddc.v1.model.ShowEventRequest;
import com.huaweicloud.sdk.clouddc.v1.model.ShowEventResponse;
import com.huaweicloud.sdk.clouddc.v1.model.ShowInstanceStatusRequest;
import com.huaweicloud.sdk.clouddc.v1.model.ShowInstanceStatusResponse;
import com.huaweicloud.sdk.clouddc.v1.model.ShowLogsExportStatusRequest;
import com.huaweicloud.sdk.clouddc.v1.model.ShowLogsExportStatusResponse;
import com.huaweicloud.sdk.clouddc.v1.model.ShowRemoteConsoleRequest;
import com.huaweicloud.sdk.clouddc.v1.model.ShowRemoteConsoleResponse;
import com.huaweicloud.sdk.clouddc.v1.model.ShowServerFirmwareAttributesRequest;
import com.huaweicloud.sdk.clouddc.v1.model.ShowServerFirmwareAttributesResponse;
import com.huaweicloud.sdk.clouddc.v1.model.ShowServerHardwareAttributesRequest;
import com.huaweicloud.sdk.clouddc.v1.model.ShowServerHardwareAttributesResponse;
import com.huaweicloud.sdk.clouddc.v1.model.ShowServerRequest;
import com.huaweicloud.sdk.clouddc.v1.model.ShowServerResponse;
import com.huaweicloud.sdk.clouddc.v1.model.ShowServerStatusRequest;
import com.huaweicloud.sdk.clouddc.v1.model.ShowServerStatusResponse;
import com.huaweicloud.sdk.clouddc.v1.model.UpdateIDcsRequest;
import com.huaweicloud.sdk.clouddc.v1.model.UpdateIDcsResponse;
import com.huaweicloud.sdk.clouddc.v1.model.UpdateIRackRequest;
import com.huaweicloud.sdk.clouddc.v1.model.UpdateIRackResponse;
import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;

import java.util.List;

@SuppressWarnings("unchecked")
public class CloudDCMeta {

    public static final HttpRequestDef<BatchCreateIrackTagsRequest, BatchCreateIrackTagsResponse> batchCreateIrackTags =
        genForBatchCreateIrackTags();

    private static HttpRequestDef<BatchCreateIrackTagsRequest, BatchCreateIrackTagsResponse> genForBatchCreateIrackTags() {
        // basic
        HttpRequestDef.Builder<BatchCreateIrackTagsRequest, BatchCreateIrackTagsResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, BatchCreateIrackTagsRequest.class, BatchCreateIrackTagsResponse.class)
            .withName("BatchCreateIrackTags")
            .withUri("/v1/{project_id}/iracks/{id}/tags/create")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchCreateIrackTagsRequest::getId, BatchCreateIrackTagsRequest::setId));
        builder.<ResourceTags>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ResourceTags.class),
            f -> f.withMarshaller(BatchCreateIrackTagsRequest::getBody, BatchCreateIrackTagsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchCreateTagsRequest, BatchCreateTagsResponse> batchCreateTags =
        genForBatchCreateTags();

    private static HttpRequestDef<BatchCreateTagsRequest, BatchCreateTagsResponse> genForBatchCreateTags() {
        // basic
        HttpRequestDef.Builder<BatchCreateTagsRequest, BatchCreateTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchCreateTagsRequest.class, BatchCreateTagsResponse.class)
                .withName("BatchCreateTags")
                .withUri("/v1/{project_id}/{resource_type}/{resource_id}/tags/create")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<BatchCreateTagsRequest.ResourceTypeEnum>withRequestField("resource_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchCreateTagsRequest.ResourceTypeEnum.class),
            f -> f.withMarshaller(BatchCreateTagsRequest::getResourceType, BatchCreateTagsRequest::setResourceType));
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchCreateTagsRequest::getResourceId, BatchCreateTagsRequest::setResourceId));
        builder.<ResourceTags>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ResourceTags.class),
            f -> f.withMarshaller(BatchCreateTagsRequest::getBody, BatchCreateTagsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteIrackTagsRequest, BatchDeleteIrackTagsResponse> batchDeleteIrackTags =
        genForBatchDeleteIrackTags();

    private static HttpRequestDef<BatchDeleteIrackTagsRequest, BatchDeleteIrackTagsResponse> genForBatchDeleteIrackTags() {
        // basic
        HttpRequestDef.Builder<BatchDeleteIrackTagsRequest, BatchDeleteIrackTagsResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, BatchDeleteIrackTagsRequest.class, BatchDeleteIrackTagsResponse.class)
            .withName("BatchDeleteIrackTags")
            .withUri("/v1/{project_id}/iracks/{id}/tags/delete")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeleteIrackTagsRequest::getId, BatchDeleteIrackTagsRequest::setId));
        builder.<ResourceTags>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ResourceTags.class),
            f -> f.withMarshaller(BatchDeleteIrackTagsRequest::getBody, BatchDeleteIrackTagsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteTagsRequest, BatchDeleteTagsResponse> batchDeleteTags =
        genForBatchDeleteTags();

    private static HttpRequestDef<BatchDeleteTagsRequest, BatchDeleteTagsResponse> genForBatchDeleteTags() {
        // basic
        HttpRequestDef.Builder<BatchDeleteTagsRequest, BatchDeleteTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchDeleteTagsRequest.class, BatchDeleteTagsResponse.class)
                .withName("BatchDeleteTags")
                .withUri("/v1/{project_id}/{resource_type}/{resource_id}/tags/delete")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<BatchDeleteTagsRequest.ResourceTypeEnum>withRequestField("resource_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchDeleteTagsRequest.ResourceTypeEnum.class),
            f -> f.withMarshaller(BatchDeleteTagsRequest::getResourceType, BatchDeleteTagsRequest::setResourceType));
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeleteTagsRequest::getResourceId, BatchDeleteTagsRequest::setResourceId));
        builder.<ResourceTags>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ResourceTags.class),
            f -> f.withMarshaller(BatchDeleteTagsRequest::getBody, BatchDeleteTagsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ChangeInstancePasswordRequest, ChangeInstancePasswordResponse> changeInstancePassword =
        genForChangeInstancePassword();

    private static HttpRequestDef<ChangeInstancePasswordRequest, ChangeInstancePasswordResponse> genForChangeInstancePassword() {
        // basic
        HttpRequestDef.Builder<ChangeInstancePasswordRequest, ChangeInstancePasswordResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, ChangeInstancePasswordRequest.class, ChangeInstancePasswordResponse.class)
            .withName("ChangeInstancePassword")
            .withUri("/v1/{project_id}/instances/password")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<ChangeInstancePasswordOptions>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ChangeInstancePasswordOptions.class),
            f -> f.withMarshaller(ChangeInstancePasswordRequest::getBody, ChangeInstancePasswordRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ChangeServerPowerStateRequest, ChangeServerPowerStateResponse> changeServerPowerState =
        genForChangeServerPowerState();

    private static HttpRequestDef<ChangeServerPowerStateRequest, ChangeServerPowerStateResponse> genForChangeServerPowerState() {
        // basic
        HttpRequestDef.Builder<ChangeServerPowerStateRequest, ChangeServerPowerStateResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, ChangeServerPowerStateRequest.class, ChangeServerPowerStateResponse.class)
            .withName("ChangeServerPowerState")
            .withUri("/v1/{project_id}/physicalservers/power-state")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<PowerAction>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PowerAction.class),
            f -> f.withMarshaller(ChangeServerPowerStateRequest::getBody, ChangeServerPowerStateRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateInstanceRequest, CreateInstanceResponse> createInstance =
        genForCreateInstance();

    private static HttpRequestDef<CreateInstanceRequest, CreateInstanceResponse> genForCreateInstance() {
        // basic
        HttpRequestDef.Builder<CreateInstanceRequest, CreateInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateInstanceRequest.class, CreateInstanceResponse.class)
                .withName("CreateInstance")
                .withUri("/v1/{project_id}/instances")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<CreateInstanceOpitons>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateInstanceOpitons.class),
            f -> f.withMarshaller(CreateInstanceRequest::getBody, CreateInstanceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteInstanceRequest, DeleteInstanceResponse> deleteInstance =
        genForDeleteInstance();

    private static HttpRequestDef<DeleteInstanceRequest, DeleteInstanceResponse> genForDeleteInstance() {
        // basic
        HttpRequestDef.Builder<DeleteInstanceRequest, DeleteInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteInstanceRequest.class, DeleteInstanceResponse.class)
                .withName("DeleteInstance")
                .withUri("/v1/{project_id}/instances/{id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteInstanceRequest::getId, DeleteInstanceRequest::setId));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteInstanceResponse::getBody, DeleteInstanceResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<DeleteInstancesRequest, DeleteInstancesResponse> deleteInstances =
        genForDeleteInstances();

    private static HttpRequestDef<DeleteInstancesRequest, DeleteInstancesResponse> genForDeleteInstances() {
        // basic
        HttpRequestDef.Builder<DeleteInstancesRequest, DeleteInstancesResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, DeleteInstancesRequest.class, DeleteInstancesResponse.class)
                .withName("DeleteInstances")
                .withUri("/v1/{project_id}/instances/batch-delete")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<BatchDeleteOptions>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchDeleteOptions.class),
            f -> f.withMarshaller(DeleteInstancesRequest::getBody, DeleteInstancesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DownloadServerLogsRequest, DownloadServerLogsResponse> downloadServerLogs =
        genForDownloadServerLogs();

    private static HttpRequestDef<DownloadServerLogsRequest, DownloadServerLogsResponse> genForDownloadServerLogs() {
        // basic
        HttpRequestDef.Builder<DownloadServerLogsRequest, DownloadServerLogsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, DownloadServerLogsRequest.class, DownloadServerLogsResponse.class)
                .withName("DownloadServerLogs")
                .withUri("/v1/{project_id}/physicalservers/{id}/logs/exports/{export_id}/content")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DownloadServerLogsRequest::getId, DownloadServerLogsRequest::setId));
        builder.<String>withRequestField("export_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DownloadServerLogsRequest::getExportId, DownloadServerLogsRequest::setExportId));

        // response

        builder.<String>withResponseField("Content-Disposition",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DownloadServerLogsResponse::getContentDisposition,
                DownloadServerLogsResponse::setContentDisposition));
        builder.<String>withResponseField("Content-Transfer-Encoding",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DownloadServerLogsResponse::getContentTransferEncoding,
                DownloadServerLogsResponse::setContentTransferEncoding));
        builder.<String>withResponseField("Content-Type",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DownloadServerLogsResponse::getContentType,
                DownloadServerLogsResponse::setContentType));
        return builder.build();
    }

    public static final HttpRequestDef<ExportServerLogsRequest, ExportServerLogsResponse> exportServerLogs =
        genForExportServerLogs();

    private static HttpRequestDef<ExportServerLogsRequest, ExportServerLogsResponse> genForExportServerLogs() {
        // basic
        HttpRequestDef.Builder<ExportServerLogsRequest, ExportServerLogsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ExportServerLogsRequest.class, ExportServerLogsResponse.class)
                .withName("ExportServerLogs")
                .withUri("/v1/{project_id}/physicalservers/{id}/logs/exports")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportServerLogsRequest::getId, ExportServerLogsRequest::setId));

        // response

        builder.<String>withResponseField("Content-Disposition",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ExportServerLogsResponse::getContentDisposition,
                ExportServerLogsResponse::setContentDisposition));
        builder.<String>withResponseField("Content-Transfer-Encoding",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ExportServerLogsResponse::getContentTransferEncoding,
                ExportServerLogsResponse::setContentTransferEncoding));
        builder.<String>withResponseField("Content-Type",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ExportServerLogsResponse::getContentType, ExportServerLogsResponse::setContentType));
        return builder.build();
    }

    public static final HttpRequestDef<ListAlarmsRequest, ListAlarmsResponse> listAlarms = genForListAlarms();

    private static HttpRequestDef<ListAlarmsRequest, ListAlarmsResponse> genForListAlarms() {
        // basic
        HttpRequestDef.Builder<ListAlarmsRequest, ListAlarmsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAlarmsRequest.class, ListAlarmsResponse.class)
                .withName("ListAlarms")
                .withUri("/v1/{project_id}/physicalservers/alarms")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("alarm_record_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAlarmsRequest::getAlarmRecordId, ListAlarmsRequest::setAlarmRecordId));
        builder.<ListAlarmsRequest.AlarmStatusEnum>withRequestField("alarm_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListAlarmsRequest.AlarmStatusEnum.class),
            f -> f.withMarshaller(ListAlarmsRequest::getAlarmStatus, ListAlarmsRequest::setAlarmStatus));
        builder.<ListAlarmsRequest.AlarmTypeEnum>withRequestField("alarm_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListAlarmsRequest.AlarmTypeEnum.class),
            f -> f.withMarshaller(ListAlarmsRequest::getAlarmType, ListAlarmsRequest::setAlarmType));
        builder.<String>withRequestField("resource_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAlarmsRequest::getResourceId, ListAlarmsRequest::setResourceId));
        builder.<ListAlarmsRequest.AlarmLevelEnum>withRequestField("alarm_level",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListAlarmsRequest.AlarmLevelEnum.class),
            f -> f.withMarshaller(ListAlarmsRequest::getAlarmLevel, ListAlarmsRequest::setAlarmLevel));
        builder.<String>withRequestField("from",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAlarmsRequest::getFrom, ListAlarmsRequest::setFrom));
        builder.<String>withRequestField("to",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAlarmsRequest::getTo, ListAlarmsRequest::setTo));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAlarmsRequest::getOffset, ListAlarmsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAlarmsRequest::getLimit, ListAlarmsRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListEventsRequest, ListEventsResponse> listEvents = genForListEvents();

    private static HttpRequestDef<ListEventsRequest, ListEventsResponse> genForListEvents() {
        // basic
        HttpRequestDef.Builder<ListEventsRequest, ListEventsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListEventsRequest.class, ListEventsResponse.class)
                .withName("ListEvents")
                .withUri("/v1/{project_id}/physicalservers/events")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEventsRequest::getOffset, ListEventsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEventsRequest::getLimit, ListEventsRequest::setLimit));
        builder.<ListEventsRequest.EventLevelEnum>withRequestField("event_level",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListEventsRequest.EventLevelEnum.class),
            f -> f.withMarshaller(ListEventsRequest::getEventLevel, ListEventsRequest::setEventLevel));
        builder.<String>withRequestField("resource_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEventsRequest::getResourceId, ListEventsRequest::setResourceId));
        builder.<String>withRequestField("from",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEventsRequest::getFrom, ListEventsRequest::setFrom));
        builder.<String>withRequestField("to",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEventsRequest::getTo, ListEventsRequest::setTo));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListIDcsRequest, ListIDcsResponse> listIDcs = genForListIDcs();

    private static HttpRequestDef<ListIDcsRequest, ListIDcsResponse> genForListIDcs() {
        // basic
        HttpRequestDef.Builder<ListIDcsRequest, ListIDcsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListIDcsRequest.class, ListIDcsResponse.class)
                .withName("ListIDcs")
                .withUri("/v1/{project_id}/idcs")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("region",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListIDcsRequest::getRegion, ListIDcsRequest::setRegion));
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListIDcsRequest::getLimit, ListIDcsRequest::setLimit));
        builder.<ListIDcsRequest.OrderEnum>withRequestField("order",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListIDcsRequest.OrderEnum.class),
            f -> f.withMarshaller(ListIDcsRequest::getOrder, ListIDcsRequest::setOrder));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListIDcsRequest::getMarker, ListIDcsRequest::setMarker));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListIRacksRequest, ListIRacksResponse> listIRacks = genForListIRacks();

    private static HttpRequestDef<ListIRacksRequest, ListIRacksResponse> genForListIRacks() {
        // basic
        HttpRequestDef.Builder<ListIRacksRequest, ListIRacksResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListIRacksRequest.class, ListIRacksResponse.class)
                .withName("ListIRacks")
                .withUri("/v1/{project_id}/iracks")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("region",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListIRacksRequest::getRegion, ListIRacksRequest::setRegion));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListIRacksRequest::getMarker, ListIRacksRequest::setMarker));
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListIRacksRequest::getLimit, ListIRacksRequest::setLimit));
        builder.<ListIRacksRequest.OrderEnum>withRequestField("order",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListIRacksRequest.OrderEnum.class),
            f -> f.withMarshaller(ListIRacksRequest::getOrder, ListIRacksRequest::setOrder));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListInstancesRequest, ListInstancesResponse> listInstances =
        genForListInstances();

    private static HttpRequestDef<ListInstancesRequest, ListInstancesResponse> genForListInstances() {
        // basic
        HttpRequestDef.Builder<ListInstancesRequest, ListInstancesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListInstancesRequest.class, ListInstancesResponse.class)
                .withName("ListInstances")
                .withUri("/v1/{project_id}/instances")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstancesRequest::getLimit, ListInstancesRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstancesRequest::getMarker, ListInstancesRequest::setMarker));
        builder.<ListInstancesRequest.InstanceStateEnum>withRequestField("instance_state",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListInstancesRequest.InstanceStateEnum.class),
            f -> f.withMarshaller(ListInstancesRequest::getInstanceState, ListInstancesRequest::setInstanceState));
        builder.<String>withRequestField("instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstancesRequest::getInstanceId, ListInstancesRequest::setInstanceId));
        builder.<String>withRequestField("server_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstancesRequest::getServerId, ListInstancesRequest::setServerId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListServersRequest, ListServersResponse> listServers = genForListServers();

    private static HttpRequestDef<ListServersRequest, ListServersResponse> genForListServers() {
        // basic
        HttpRequestDef.Builder<ListServersRequest, ListServersResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListServersRequest.class, ListServersResponse.class)
                .withName("ListServers")
                .withUri("/v1/{project_id}/physicalservers")
                .withContentType("application/json");

        // requests
        builder.<ListServersRequest.ManageStateEnum>withRequestField("manage_state",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListServersRequest.ManageStateEnum.class),
            f -> f.withMarshaller(ListServersRequest::getManageState, ListServersRequest::setManageState));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListServersRequest::getMarker, ListServersRequest::setMarker));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListServersRequest::getLimit, ListServersRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ModifyInstanceIpRequest, ModifyInstanceIpResponse> modifyInstanceIp =
        genForModifyInstanceIp();

    private static HttpRequestDef<ModifyInstanceIpRequest, ModifyInstanceIpResponse> genForModifyInstanceIp() {
        // basic
        HttpRequestDef.Builder<ModifyInstanceIpRequest, ModifyInstanceIpResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, ModifyInstanceIpRequest.class, ModifyInstanceIpResponse.class)
                .withName("ModifyInstanceIp")
                .withUri("/v1/{project_id}/instances/{id}/ip")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ModifyInstanceIpRequest::getId, ModifyInstanceIpRequest::setId));
        builder.<ModifyInstanceIpRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ModifyInstanceIpRequestBody.class),
            f -> f.withMarshaller(ModifyInstanceIpRequest::getBody, ModifyInstanceIpRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ReinstallOsRequest, ReinstallOsResponse> reinstallOs = genForReinstallOs();

    private static HttpRequestDef<ReinstallOsRequest, ReinstallOsResponse> genForReinstallOs() {
        // basic
        HttpRequestDef.Builder<ReinstallOsRequest, ReinstallOsResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, ReinstallOsRequest.class, ReinstallOsResponse.class)
                .withName("ReinstallOs")
                .withUri("/v1/{project_id}/instances/reinstall")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<ReinstallOSOptions>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ReinstallOSOptions.class),
            f -> f.withMarshaller(ReinstallOsRequest::getBody, ReinstallOsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RunInstancesRequest, RunInstancesResponse> runInstances = genForRunInstances();

    private static HttpRequestDef<RunInstancesRequest, RunInstancesResponse> genForRunInstances() {
        // basic
        HttpRequestDef.Builder<RunInstancesRequest, RunInstancesResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RunInstancesRequest.class, RunInstancesResponse.class)
                .withName("RunInstances")
                .withUri("/v1/{project_id}/instances/batch-create")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<RunInstancesOptions>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RunInstancesOptions.class),
            f -> f.withMarshaller(RunInstancesRequest::getBody, RunInstancesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAlarmSummaryRequest, ShowAlarmSummaryResponse> showAlarmSummary =
        genForShowAlarmSummary();

    private static HttpRequestDef<ShowAlarmSummaryRequest, ShowAlarmSummaryResponse> genForShowAlarmSummary() {
        // basic
        HttpRequestDef.Builder<ShowAlarmSummaryRequest, ShowAlarmSummaryResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowAlarmSummaryRequest.class, ShowAlarmSummaryResponse.class)
                .withName("ShowAlarmSummary")
                .withUri("/v1/{project_id}/physicalservers/alarms/summary")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAlarmTrendRequest, ShowAlarmTrendResponse> showAlarmTrend =
        genForShowAlarmTrend();

    private static HttpRequestDef<ShowAlarmTrendRequest, ShowAlarmTrendResponse> genForShowAlarmTrend() {
        // basic
        HttpRequestDef.Builder<ShowAlarmTrendRequest, ShowAlarmTrendResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowAlarmTrendRequest.class, ShowAlarmTrendResponse.class)
                .withName("ShowAlarmTrend")
                .withUri("/v1/{project_id}/physicalservers/alarms/trend")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("from",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAlarmTrendRequest::getFrom, ShowAlarmTrendRequest::setFrom));
        builder.<String>withRequestField("to",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAlarmTrendRequest::getTo, ShowAlarmTrendRequest::setTo));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowEventRequest, ShowEventResponse> showEvent = genForShowEvent();

    private static HttpRequestDef<ShowEventRequest, ShowEventResponse> genForShowEvent() {
        // basic
        HttpRequestDef.Builder<ShowEventRequest, ShowEventResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowEventRequest.class, ShowEventResponse.class)
                .withName("ShowEvent")
                .withUri("/v1/{project_id}/physicalservers/events/{event_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("event_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowEventRequest::getEventId, ShowEventRequest::setEventId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowInstanceStatusRequest, ShowInstanceStatusResponse> showInstanceStatus =
        genForShowInstanceStatus();

    private static HttpRequestDef<ShowInstanceStatusRequest, ShowInstanceStatusResponse> genForShowInstanceStatus() {
        // basic
        HttpRequestDef.Builder<ShowInstanceStatusRequest, ShowInstanceStatusResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowInstanceStatusRequest.class, ShowInstanceStatusResponse.class)
                .withName("ShowInstanceStatus")
                .withUri("/v1/{project_id}/instances/{id}/status")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowInstanceStatusRequest::getId, ShowInstanceStatusRequest::setId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowLogsExportStatusRequest, ShowLogsExportStatusResponse> showLogsExportStatus =
        genForShowLogsExportStatus();

    private static HttpRequestDef<ShowLogsExportStatusRequest, ShowLogsExportStatusResponse> genForShowLogsExportStatus() {
        // basic
        HttpRequestDef.Builder<ShowLogsExportStatusRequest, ShowLogsExportStatusResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowLogsExportStatusRequest.class, ShowLogsExportStatusResponse.class)
            .withName("ShowLogsExportStatus")
            .withUri("/v1/{project_id}/physicalservers/{id}/logs/exports/{export_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowLogsExportStatusRequest::getId, ShowLogsExportStatusRequest::setId));
        builder.<String>withRequestField("export_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowLogsExportStatusRequest::getExportId, ShowLogsExportStatusRequest::setExportId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowRemoteConsoleRequest, ShowRemoteConsoleResponse> showRemoteConsole =
        genForShowRemoteConsole();

    private static HttpRequestDef<ShowRemoteConsoleRequest, ShowRemoteConsoleResponse> genForShowRemoteConsole() {
        // basic
        HttpRequestDef.Builder<ShowRemoteConsoleRequest, ShowRemoteConsoleResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowRemoteConsoleRequest.class, ShowRemoteConsoleResponse.class)
                .withName("ShowRemoteConsole")
                .withUri("/v1/{project_id}/physicalservers/{id}/remote-console-address")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRemoteConsoleRequest::getId, ShowRemoteConsoleRequest::setId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowServerRequest, ShowServerResponse> showServer = genForShowServer();

    private static HttpRequestDef<ShowServerRequest, ShowServerResponse> genForShowServer() {
        // basic
        HttpRequestDef.Builder<ShowServerRequest, ShowServerResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowServerRequest.class, ShowServerResponse.class)
                .withName("ShowServer")
                .withUri("/v1/{project_id}/physicalservers/{id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowServerRequest::getId, ShowServerRequest::setId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowServerFirmwareAttributesRequest, ShowServerFirmwareAttributesResponse> showServerFirmwareAttributes =
        genForShowServerFirmwareAttributes();

    private static HttpRequestDef<ShowServerFirmwareAttributesRequest, ShowServerFirmwareAttributesResponse> genForShowServerFirmwareAttributes() {
        // basic
        HttpRequestDef.Builder<ShowServerFirmwareAttributesRequest, ShowServerFirmwareAttributesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowServerFirmwareAttributesRequest.class,
                    ShowServerFirmwareAttributesResponse.class)
                .withName("ShowServerFirmwareAttributes")
                .withUri("/v1/{project_id}/physicalservers/{id}/firmware-attributes")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowServerFirmwareAttributesRequest::getId,
                ShowServerFirmwareAttributesRequest::setId));

        // response
        builder.<List<FirmwareDetails>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f
                .withMarshaller(ShowServerFirmwareAttributesResponse::getBody,
                    ShowServerFirmwareAttributesResponse::setBody)
                .withInnerContainerType(FirmwareDetails.class));

        return builder.build();
    }

    public static final HttpRequestDef<ShowServerHardwareAttributesRequest, ShowServerHardwareAttributesResponse> showServerHardwareAttributes =
        genForShowServerHardwareAttributes();

    private static HttpRequestDef<ShowServerHardwareAttributesRequest, ShowServerHardwareAttributesResponse> genForShowServerHardwareAttributes() {
        // basic
        HttpRequestDef.Builder<ShowServerHardwareAttributesRequest, ShowServerHardwareAttributesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowServerHardwareAttributesRequest.class,
                    ShowServerHardwareAttributesResponse.class)
                .withName("ShowServerHardwareAttributes")
                .withUri("/v1/{project_id}/physicalservers/{id}/hardware-attributes")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowServerHardwareAttributesRequest::getId,
                ShowServerHardwareAttributesRequest::setId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowServerStatusRequest, ShowServerStatusResponse> showServerStatus =
        genForShowServerStatus();

    private static HttpRequestDef<ShowServerStatusRequest, ShowServerStatusResponse> genForShowServerStatus() {
        // basic
        HttpRequestDef.Builder<ShowServerStatusRequest, ShowServerStatusResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowServerStatusRequest.class, ShowServerStatusResponse.class)
                .withName("ShowServerStatus")
                .withUri("/v1/{project_id}/physicalservers/status")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateIDcsRequest, UpdateIDcsResponse> updateIDcs = genForUpdateIDcs();

    private static HttpRequestDef<UpdateIDcsRequest, UpdateIDcsResponse> genForUpdateIDcs() {
        // basic
        HttpRequestDef.Builder<UpdateIDcsRequest, UpdateIDcsResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateIDcsRequest.class, UpdateIDcsResponse.class)
                .withName("UpdateIDcs")
                .withUri("/v1/{project_id}/idcs")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<List<Object>>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(UpdateIDcsRequest::getBody, UpdateIDcsRequest::setBody)
                .withInnerContainerType(Object.class));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateIDcsResponse::getBody, UpdateIDcsResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<UpdateIRackRequest, UpdateIRackResponse> updateIRack = genForUpdateIRack();

    private static HttpRequestDef<UpdateIRackRequest, UpdateIRackResponse> genForUpdateIRack() {
        // basic
        HttpRequestDef.Builder<UpdateIRackRequest, UpdateIRackResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateIRackRequest.class, UpdateIRackResponse.class)
                .withName("UpdateIRack")
                .withUri("/v1/{project_id}/iracks/{irack_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("irack_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateIRackRequest::getIrackId, UpdateIRackRequest::setIrackId));
        builder.<IRackRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(IRackRequest.class),
            f -> f.withMarshaller(UpdateIRackRequest::getBody, UpdateIRackRequest::setBody));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateIRackResponse::getBody, UpdateIRackResponse::setBody));

        return builder.build();
    }

}
