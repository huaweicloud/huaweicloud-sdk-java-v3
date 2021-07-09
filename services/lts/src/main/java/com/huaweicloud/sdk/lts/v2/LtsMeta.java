package com.huaweicloud.sdk.lts.v2;

import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.lts.v2.model.*;
import java.util.List;
import java.util.Map;
import java.time.OffsetDateTime;

@SuppressWarnings("unchecked")
public class LtsMeta {

    public static final HttpRequestDef<CreateLogDumpObsRequest, CreateLogDumpObsResponse> createLogDumpObs = genForcreateLogDumpObs();

    private static HttpRequestDef<CreateLogDumpObsRequest, CreateLogDumpObsResponse> genForcreateLogDumpObs() {
        // basic
        HttpRequestDef.Builder<CreateLogDumpObsRequest, CreateLogDumpObsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateLogDumpObsRequest.class, CreateLogDumpObsResponse.class)
                .withName("CreateLogDumpObs")
                .withUri("/v2/{project_id}/log-dump/obs")
                .withContentType("application/json");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            CreateLogDumpObsRequestBody.class,
            f -> f.withMarshaller(CreateLogDumpObsRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<CreateLogGroupRequest, CreateLogGroupResponse> createLogGroup = genForcreateLogGroup();

    private static HttpRequestDef<CreateLogGroupRequest, CreateLogGroupResponse> genForcreateLogGroup() {
        // basic
        HttpRequestDef.Builder<CreateLogGroupRequest, CreateLogGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateLogGroupRequest.class, CreateLogGroupResponse.class)
                .withName("CreateLogGroup")
                .withUri("/v2/{project_id}/groups")
                .withContentType("application/json");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            CreateLogGroupParams.class,
            f -> f.withMarshaller(CreateLogGroupRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<CreateLogStreamRequest, CreateLogStreamResponse> createLogStream = genForcreateLogStream();

    private static HttpRequestDef<CreateLogStreamRequest, CreateLogStreamResponse> genForcreateLogStream() {
        // basic
        HttpRequestDef.Builder<CreateLogStreamRequest, CreateLogStreamResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateLogStreamRequest.class, CreateLogStreamResponse.class)
                .withName("CreateLogStream")
                .withUri("/v2/{project_id}/groups/{log_group_id}/streams")
                .withContentType("application/json");

        // requests
        builder.withRequestField("log_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(CreateLogStreamRequest::getLogGroupId, (req, v) -> {
                req.setLogGroupId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            CreateLogStreamParams.class,
            f -> f.withMarshaller(CreateLogStreamRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<DeleteLogGroupRequest, DeleteLogGroupResponse> deleteLogGroup = genFordeleteLogGroup();

    private static HttpRequestDef<DeleteLogGroupRequest, DeleteLogGroupResponse> genFordeleteLogGroup() {
        // basic
        HttpRequestDef.Builder<DeleteLogGroupRequest, DeleteLogGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteLogGroupRequest.class, DeleteLogGroupResponse.class)
                .withName("DeleteLogGroup")
                .withUri("/v2/{project_id}/groups/{log_group_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("log_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteLogGroupRequest::getLogGroupId, (req, v) -> {
                req.setLogGroupId(v);
            })
        );

        // response
        
        builder.withResponseField(
            "body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteLogGroupResponse::getBody, (response, data)->{
                response.setBody(data);
            })
        );
        

        return builder.build();
    }

    public static final HttpRequestDef<DeleteLogStreamRequest, DeleteLogStreamResponse> deleteLogStream = genFordeleteLogStream();

    private static HttpRequestDef<DeleteLogStreamRequest, DeleteLogStreamResponse> genFordeleteLogStream() {
        // basic
        HttpRequestDef.Builder<DeleteLogStreamRequest, DeleteLogStreamResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteLogStreamRequest.class, DeleteLogStreamResponse.class)
                .withName("DeleteLogStream")
                .withUri("/v2/{project_id}/groups/{log_group_id}/streams/{log_stream_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("log_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteLogStreamRequest::getLogGroupId, (req, v) -> {
                req.setLogGroupId(v);
            })
        );
        builder.withRequestField("log_stream_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteLogStreamRequest::getLogStreamId, (req, v) -> {
                req.setLogStreamId(v);
            })
        );

        // response
        
        builder.withResponseField(
            "body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteLogStreamResponse::getBody, (response, data)->{
                response.setBody(data);
            })
        );
        

        return builder.build();
    }

    public static final HttpRequestDef<DisableLogCollectionRequest, DisableLogCollectionResponse> disableLogCollection = genFordisableLogCollection();

    private static HttpRequestDef<DisableLogCollectionRequest, DisableLogCollectionResponse> genFordisableLogCollection() {
        // basic
        HttpRequestDef.Builder<DisableLogCollectionRequest, DisableLogCollectionResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, DisableLogCollectionRequest.class, DisableLogCollectionResponse.class)
                .withName("DisableLogCollection")
                .withUri("/v2/{project_id}/collection/disable")
                .withContentType("application/json");

        // requests

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<EnableLogCollectionRequest, EnableLogCollectionResponse> enableLogCollection = genForenableLogCollection();

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

    public static final HttpRequestDef<ListLogGroupsRequest, ListLogGroupsResponse> listLogGroups = genForlistLogGroups();

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

    public static final HttpRequestDef<ListLogStreamRequest, ListLogStreamResponse> listLogStream = genForlistLogStream();

    private static HttpRequestDef<ListLogStreamRequest, ListLogStreamResponse> genForlistLogStream() {
        // basic
        HttpRequestDef.Builder<ListLogStreamRequest, ListLogStreamResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListLogStreamRequest.class, ListLogStreamResponse.class)
                .withName("ListLogStream")
                .withUri("/v2/{project_id}/groups/{log_group_id}/streams")
                .withContentType("application/json");

        // requests
        builder.withRequestField("log_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListLogStreamRequest::getLogGroupId, (req, v) -> {
                req.setLogGroupId(v);
            })
        );
        builder.withRequestField("tag",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListLogStreamRequest::getTag, (req, v) -> {
                req.setTag(v);
            })
        );

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
        builder.withRequestField("log_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListLogsRequest::getLogGroupId, (req, v) -> {
                req.setLogGroupId(v);
            })
        );
        builder.withRequestField("log_stream_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListLogsRequest::getLogStreamId, (req, v) -> {
                req.setLogStreamId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            QueryLTSLogParams.class,
            f -> f.withMarshaller(ListLogsRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListQueryStructuredLogsRequest, ListQueryStructuredLogsResponse> listQueryStructuredLogs = genForlistQueryStructuredLogs();

    private static HttpRequestDef<ListQueryStructuredLogsRequest, ListQueryStructuredLogsResponse> genForlistQueryStructuredLogs() {
        // basic
        HttpRequestDef.Builder<ListQueryStructuredLogsRequest, ListQueryStructuredLogsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListQueryStructuredLogsRequest.class, ListQueryStructuredLogsResponse.class)
                .withName("ListQueryStructuredLogs")
                .withUri("/v2/{project_id}/groups/{log_group_id}/streams/{log_stream_id}/struct-content/query")
                .withContentType("application/json");

        // requests
        builder.withRequestField("log_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListQueryStructuredLogsRequest::getLogGroupId, (req, v) -> {
                req.setLogGroupId(v);
            })
        );
        builder.withRequestField("log_stream_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListQueryStructuredLogsRequest::getLogStreamId, (req, v) -> {
                req.setLogStreamId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            QueryLTSStructLogParams.class,
            f -> f.withMarshaller(ListQueryStructuredLogsRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListStructuredLogsWithTimeRangeRequest, ListStructuredLogsWithTimeRangeResponse> listStructuredLogsWithTimeRange = genForlistStructuredLogsWithTimeRange();

    private static HttpRequestDef<ListStructuredLogsWithTimeRangeRequest, ListStructuredLogsWithTimeRangeResponse> genForlistStructuredLogsWithTimeRange() {
        // basic
        HttpRequestDef.Builder<ListStructuredLogsWithTimeRangeRequest, ListStructuredLogsWithTimeRangeResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListStructuredLogsWithTimeRangeRequest.class, ListStructuredLogsWithTimeRangeResponse.class)
                .withName("ListStructuredLogsWithTimeRange")
                .withUri("/v2/{project_id}/streams/{log_stream_id}/struct-content/query")
                .withContentType("application/json");

        // requests
        builder.withRequestField("log_stream_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListStructuredLogsWithTimeRangeRequest::getLogStreamId, (req, v) -> {
                req.setLogStreamId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            QueryLTSStructLogParamsNew.class,
            f -> f.withMarshaller(ListStructuredLogsWithTimeRangeRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<UpdateLogGroupRequest, UpdateLogGroupResponse> updateLogGroup = genForupdateLogGroup();

    private static HttpRequestDef<UpdateLogGroupRequest, UpdateLogGroupResponse> genForupdateLogGroup() {
        // basic
        HttpRequestDef.Builder<UpdateLogGroupRequest, UpdateLogGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UpdateLogGroupRequest.class, UpdateLogGroupResponse.class)
                .withName("UpdateLogGroup")
                .withUri("/v2/{project_id}/groups/{log_group_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("log_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateLogGroupRequest::getLogGroupId, (req, v) -> {
                req.setLogGroupId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            UpdateLogGroupParams.class,
            f -> f.withMarshaller(UpdateLogGroupRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

}
