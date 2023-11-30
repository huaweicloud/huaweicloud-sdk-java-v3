package com.huaweicloud.sdk.dis.v2;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.dis.v2.model.BatchCreateTagsReq;
import com.huaweicloud.sdk.dis.v2.model.BatchCreateTagsRequest;
import com.huaweicloud.sdk.dis.v2.model.BatchCreateTagsResponse;
import com.huaweicloud.sdk.dis.v2.model.BatchDeleteTagsReq;
import com.huaweicloud.sdk.dis.v2.model.BatchDeleteTagsRequest;
import com.huaweicloud.sdk.dis.v2.model.BatchDeleteTagsResponse;
import com.huaweicloud.sdk.dis.v2.model.BatchStartTransferTaskReq;
import com.huaweicloud.sdk.dis.v2.model.BatchStartTransferTaskRequest;
import com.huaweicloud.sdk.dis.v2.model.BatchStartTransferTaskResponse;
import com.huaweicloud.sdk.dis.v2.model.BatchStopTransferTaskReq;
import com.huaweicloud.sdk.dis.v2.model.BatchStopTransferTaskRequest;
import com.huaweicloud.sdk.dis.v2.model.BatchStopTransferTaskResponse;
import com.huaweicloud.sdk.dis.v2.model.CommitCheckpointReq;
import com.huaweicloud.sdk.dis.v2.model.CommitCheckpointRequest;
import com.huaweicloud.sdk.dis.v2.model.CommitCheckpointResponse;
import com.huaweicloud.sdk.dis.v2.model.ConsumeRecordsRequest;
import com.huaweicloud.sdk.dis.v2.model.ConsumeRecordsResponse;
import com.huaweicloud.sdk.dis.v2.model.CreateAppReq;
import com.huaweicloud.sdk.dis.v2.model.CreateAppRequest;
import com.huaweicloud.sdk.dis.v2.model.CreateAppResponse;
import com.huaweicloud.sdk.dis.v2.model.CreateObsTransferTaskRequest;
import com.huaweicloud.sdk.dis.v2.model.CreateObsTransferTaskResponse;
import com.huaweicloud.sdk.dis.v2.model.CreateStreamReq;
import com.huaweicloud.sdk.dis.v2.model.CreateStreamRequest;
import com.huaweicloud.sdk.dis.v2.model.CreateStreamResponse;
import com.huaweicloud.sdk.dis.v2.model.CreateTagReq;
import com.huaweicloud.sdk.dis.v2.model.CreateTagRequest;
import com.huaweicloud.sdk.dis.v2.model.CreateTagResponse;
import com.huaweicloud.sdk.dis.v2.model.CreateTransferTaskReq;
import com.huaweicloud.sdk.dis.v2.model.DeleteAppRequest;
import com.huaweicloud.sdk.dis.v2.model.DeleteAppResponse;
import com.huaweicloud.sdk.dis.v2.model.DeleteCheckpointRequest;
import com.huaweicloud.sdk.dis.v2.model.DeleteCheckpointResponse;
import com.huaweicloud.sdk.dis.v2.model.DeleteStreamRequest;
import com.huaweicloud.sdk.dis.v2.model.DeleteStreamResponse;
import com.huaweicloud.sdk.dis.v2.model.DeleteTagRequest;
import com.huaweicloud.sdk.dis.v2.model.DeleteTagResponse;
import com.huaweicloud.sdk.dis.v2.model.DeleteTransferTaskRequest;
import com.huaweicloud.sdk.dis.v2.model.DeleteTransferTaskResponse;
import com.huaweicloud.sdk.dis.v2.model.ListAppRequest;
import com.huaweicloud.sdk.dis.v2.model.ListAppResponse;
import com.huaweicloud.sdk.dis.v2.model.ListPoliciesRequest;
import com.huaweicloud.sdk.dis.v2.model.ListPoliciesResponse;
import com.huaweicloud.sdk.dis.v2.model.ListResourceInstancesReq;
import com.huaweicloud.sdk.dis.v2.model.ListResourcesByTagsRequest;
import com.huaweicloud.sdk.dis.v2.model.ListResourcesByTagsResponse;
import com.huaweicloud.sdk.dis.v2.model.ListStreamsRequest;
import com.huaweicloud.sdk.dis.v2.model.ListStreamsResponse;
import com.huaweicloud.sdk.dis.v2.model.ListTagsRequest;
import com.huaweicloud.sdk.dis.v2.model.ListTagsResponse;
import com.huaweicloud.sdk.dis.v2.model.ListTransferTasksRequest;
import com.huaweicloud.sdk.dis.v2.model.ListTransferTasksResponse;
import com.huaweicloud.sdk.dis.v2.model.PutRecordsRequest;
import com.huaweicloud.sdk.dis.v2.model.SendRecordsRequest;
import com.huaweicloud.sdk.dis.v2.model.SendRecordsResponse;
import com.huaweicloud.sdk.dis.v2.model.ShowAppRequest;
import com.huaweicloud.sdk.dis.v2.model.ShowAppResponse;
import com.huaweicloud.sdk.dis.v2.model.ShowCheckpointRequest;
import com.huaweicloud.sdk.dis.v2.model.ShowCheckpointResponse;
import com.huaweicloud.sdk.dis.v2.model.ShowConsumerStateRequest;
import com.huaweicloud.sdk.dis.v2.model.ShowConsumerStateResponse;
import com.huaweicloud.sdk.dis.v2.model.ShowCursorRequest;
import com.huaweicloud.sdk.dis.v2.model.ShowCursorResponse;
import com.huaweicloud.sdk.dis.v2.model.ShowPartitionMetricsRequest;
import com.huaweicloud.sdk.dis.v2.model.ShowPartitionMetricsResponse;
import com.huaweicloud.sdk.dis.v2.model.ShowStreamMetricsRequest;
import com.huaweicloud.sdk.dis.v2.model.ShowStreamMetricsResponse;
import com.huaweicloud.sdk.dis.v2.model.ShowStreamRequest;
import com.huaweicloud.sdk.dis.v2.model.ShowStreamResponse;
import com.huaweicloud.sdk.dis.v2.model.ShowStreamTagsRequest;
import com.huaweicloud.sdk.dis.v2.model.ShowStreamTagsResponse;
import com.huaweicloud.sdk.dis.v2.model.ShowTransferTaskRequest;
import com.huaweicloud.sdk.dis.v2.model.ShowTransferTaskResponse;
import com.huaweicloud.sdk.dis.v2.model.UpdatePartitionCountReq;
import com.huaweicloud.sdk.dis.v2.model.UpdatePartitionCountRequest;
import com.huaweicloud.sdk.dis.v2.model.UpdatePartitionCountResponse;
import com.huaweicloud.sdk.dis.v2.model.UpdateStreamReq;
import com.huaweicloud.sdk.dis.v2.model.UpdateStreamRequest;
import com.huaweicloud.sdk.dis.v2.model.UpdateStreamResponse;

@SuppressWarnings("unchecked")
public class DisMeta {

    public static final HttpRequestDef<BatchCreateTagsRequest, BatchCreateTagsResponse> batchCreateTags =
        genForbatchCreateTags();

    private static HttpRequestDef<BatchCreateTagsRequest, BatchCreateTagsResponse> genForbatchCreateTags() {
        // basic
        HttpRequestDef.Builder<BatchCreateTagsRequest, BatchCreateTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchCreateTagsRequest.class, BatchCreateTagsResponse.class)
                .withName("BatchCreateTags")
                .withUri("/v2/{project_id}/stream/{stream_id}/tags/action")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("stream_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchCreateTagsRequest::getStreamId, (req, v) -> {
                req.setStreamId(v);
            }));
        builder.<BatchCreateTagsReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchCreateTagsReq.class),
            f -> f.withMarshaller(BatchCreateTagsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteTagsRequest, BatchDeleteTagsResponse> batchDeleteTags =
        genForbatchDeleteTags();

    private static HttpRequestDef<BatchDeleteTagsRequest, BatchDeleteTagsResponse> genForbatchDeleteTags() {
        // basic
        HttpRequestDef.Builder<BatchDeleteTagsRequest, BatchDeleteTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchDeleteTagsRequest.class, BatchDeleteTagsResponse.class)
                .withName("BatchDeleteTags")
                .withUri("/v2/{project_id}/stream/{stream_id}/tags/action")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("stream_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeleteTagsRequest::getStreamId, (req, v) -> {
                req.setStreamId(v);
            }));
        builder.<BatchDeleteTagsReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchDeleteTagsReq.class),
            f -> f.withMarshaller(BatchDeleteTagsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchStartTransferTaskRequest, BatchStartTransferTaskResponse> batchStartTransferTask =
        genForbatchStartTransferTask();

    private static HttpRequestDef<BatchStartTransferTaskRequest, BatchStartTransferTaskResponse> genForbatchStartTransferTask() {
        // basic
        HttpRequestDef.Builder<BatchStartTransferTaskRequest, BatchStartTransferTaskResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, BatchStartTransferTaskRequest.class, BatchStartTransferTaskResponse.class)
            .withName("BatchStartTransferTask")
            .withUri("/v2/{project_id}/streams/{stream_name}/transfer-tasks/action")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("stream_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchStartTransferTaskRequest::getStreamName, (req, v) -> {
                req.setStreamName(v);
            }));
        builder.<BatchStartTransferTaskReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchStartTransferTaskReq.class),
            f -> f.withMarshaller(BatchStartTransferTaskRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(BatchStartTransferTaskResponse::getBody, (response, data) -> {
                response.setBody(data);
            }));

        return builder.build();
    }

    public static final HttpRequestDef<BatchStopTransferTaskRequest, BatchStopTransferTaskResponse> batchStopTransferTask =
        genForbatchStopTransferTask();

    private static HttpRequestDef<BatchStopTransferTaskRequest, BatchStopTransferTaskResponse> genForbatchStopTransferTask() {
        // basic
        HttpRequestDef.Builder<BatchStopTransferTaskRequest, BatchStopTransferTaskResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, BatchStopTransferTaskRequest.class, BatchStopTransferTaskResponse.class)
            .withName("BatchStopTransferTask")
            .withUri("/v2/{project_id}/streams/{stream_name}/transfer-tasks/action")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("stream_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchStopTransferTaskRequest::getStreamName, (req, v) -> {
                req.setStreamName(v);
            }));
        builder.<BatchStopTransferTaskReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchStopTransferTaskReq.class),
            f -> f.withMarshaller(BatchStopTransferTaskRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ConsumeRecordsRequest, ConsumeRecordsResponse> consumeRecords =
        genForconsumeRecords();

    private static HttpRequestDef<ConsumeRecordsRequest, ConsumeRecordsResponse> genForconsumeRecords() {
        // basic
        HttpRequestDef.Builder<ConsumeRecordsRequest, ConsumeRecordsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ConsumeRecordsRequest.class, ConsumeRecordsResponse.class)
                .withName("ConsumeRecords")
                .withUri("/v2/{project_id}/records")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("partition-cursor",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ConsumeRecordsRequest::getPartitionCursor, (req, v) -> {
                req.setPartitionCursor(v);
            }));
        builder.<Integer>withRequestField("max_fetch_bytes",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ConsumeRecordsRequest::getMaxFetchBytes, (req, v) -> {
                req.setMaxFetchBytes(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateObsTransferTaskRequest, CreateObsTransferTaskResponse> createObsTransferTask =
        genForcreateObsTransferTask();

    private static HttpRequestDef<CreateObsTransferTaskRequest, CreateObsTransferTaskResponse> genForcreateObsTransferTask() {
        // basic
        HttpRequestDef.Builder<CreateObsTransferTaskRequest, CreateObsTransferTaskResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateObsTransferTaskRequest.class, CreateObsTransferTaskResponse.class)
            .withName("CreateObsTransferTask")
            .withUri("/v2/{project_id}/streams/{stream_name}/transfer-tasks")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("stream_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateObsTransferTaskRequest::getStreamName, (req, v) -> {
                req.setStreamName(v);
            }));
        builder.<CreateTransferTaskReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateTransferTaskReq.class),
            f -> f.withMarshaller(CreateObsTransferTaskRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateStreamRequest, CreateStreamResponse> createStream = genForcreateStream();

    private static HttpRequestDef<CreateStreamRequest, CreateStreamResponse> genForcreateStream() {
        // basic
        HttpRequestDef.Builder<CreateStreamRequest, CreateStreamResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateStreamRequest.class, CreateStreamResponse.class)
                .withName("CreateStream")
                .withUri("/v2/{project_id}/streams")
                .withContentType("application/json");

        // requests
        builder.<CreateStreamReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateStreamReq.class),
            f -> f.withMarshaller(CreateStreamRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateTagRequest, CreateTagResponse> createTag = genForcreateTag();

    private static HttpRequestDef<CreateTagRequest, CreateTagResponse> genForcreateTag() {
        // basic
        HttpRequestDef.Builder<CreateTagRequest, CreateTagResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateTagRequest.class, CreateTagResponse.class)
                .withName("CreateTag")
                .withUri("/v2/{project_id}/stream/{stream_id}/tags")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("stream_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateTagRequest::getStreamId, (req, v) -> {
                req.setStreamId(v);
            }));
        builder.<CreateTagReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateTagReq.class),
            f -> f.withMarshaller(CreateTagRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteStreamRequest, DeleteStreamResponse> deleteStream = genFordeleteStream();

    private static HttpRequestDef<DeleteStreamRequest, DeleteStreamResponse> genFordeleteStream() {
        // basic
        HttpRequestDef.Builder<DeleteStreamRequest, DeleteStreamResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteStreamRequest.class, DeleteStreamResponse.class)
                .withName("DeleteStream")
                .withUri("/v2/{project_id}/streams/{stream_name}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("stream_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteStreamRequest::getStreamName, (req, v) -> {
                req.setStreamName(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteTagRequest, DeleteTagResponse> deleteTag = genFordeleteTag();

    private static HttpRequestDef<DeleteTagRequest, DeleteTagResponse> genFordeleteTag() {
        // basic
        HttpRequestDef.Builder<DeleteTagRequest, DeleteTagResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteTagRequest.class, DeleteTagResponse.class)
                .withName("DeleteTag")
                .withUri("/v2/{project_id}/stream/{stream_id}/tags/{key}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("stream_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTagRequest::getStreamId, (req, v) -> {
                req.setStreamId(v);
            }));
        builder.<String>withRequestField("key",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTagRequest::getKey, (req, v) -> {
                req.setKey(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteTransferTaskRequest, DeleteTransferTaskResponse> deleteTransferTask =
        genFordeleteTransferTask();

    private static HttpRequestDef<DeleteTransferTaskRequest, DeleteTransferTaskResponse> genFordeleteTransferTask() {
        // basic
        HttpRequestDef.Builder<DeleteTransferTaskRequest, DeleteTransferTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteTransferTaskRequest.class, DeleteTransferTaskResponse.class)
                .withName("DeleteTransferTask")
                .withUri("/v2/{project_id}/streams/{stream_name}/transfer-tasks/{task_name}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("stream_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTransferTaskRequest::getStreamName, (req, v) -> {
                req.setStreamName(v);
            }));
        builder.<String>withRequestField("task_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTransferTaskRequest::getTaskName, (req, v) -> {
                req.setTaskName(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPoliciesRequest, ListPoliciesResponse> listPolicies = genForlistPolicies();

    private static HttpRequestDef<ListPoliciesRequest, ListPoliciesResponse> genForlistPolicies() {
        // basic
        HttpRequestDef.Builder<ListPoliciesRequest, ListPoliciesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListPoliciesRequest.class, ListPoliciesResponse.class)
                .withName("ListPolicies")
                .withUri("/v2/{project_id}/streams/{stream_name}/policies")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("stream_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPoliciesRequest::getStreamName, (req, v) -> {
                req.setStreamName(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListResourcesByTagsRequest, ListResourcesByTagsResponse> listResourcesByTags =
        genForlistResourcesByTags();

    private static HttpRequestDef<ListResourcesByTagsRequest, ListResourcesByTagsResponse> genForlistResourcesByTags() {
        // basic
        HttpRequestDef.Builder<ListResourcesByTagsRequest, ListResourcesByTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListResourcesByTagsRequest.class, ListResourcesByTagsResponse.class)
                .withName("ListResourcesByTags")
                .withUri("/v2/{project_id}/stream/resource_instances/action")
                .withContentType("application/json");

        // requests
        builder.<ListResourceInstancesReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListResourceInstancesReq.class),
            f -> f.withMarshaller(ListResourcesByTagsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListStreamsRequest, ListStreamsResponse> listStreams = genForlistStreams();

    private static HttpRequestDef<ListStreamsRequest, ListStreamsResponse> genForlistStreams() {
        // basic
        HttpRequestDef.Builder<ListStreamsRequest, ListStreamsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListStreamsRequest.class, ListStreamsResponse.class)
                .withName("ListStreams")
                .withUri("/v2/{project_id}/streams")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListStreamsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("start_stream_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStreamsRequest::getStartStreamName, (req, v) -> {
                req.setStartStreamName(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTagsRequest, ListTagsResponse> listTags = genForlistTags();

    private static HttpRequestDef<ListTagsRequest, ListTagsResponse> genForlistTags() {
        // basic
        HttpRequestDef.Builder<ListTagsRequest, ListTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListTagsRequest.class, ListTagsResponse.class)
                .withName("ListTags")
                .withUri("/v2/{project_id}/stream/tags")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTransferTasksRequest, ListTransferTasksResponse> listTransferTasks =
        genForlistTransferTasks();

    private static HttpRequestDef<ListTransferTasksRequest, ListTransferTasksResponse> genForlistTransferTasks() {
        // basic
        HttpRequestDef.Builder<ListTransferTasksRequest, ListTransferTasksResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListTransferTasksRequest.class, ListTransferTasksResponse.class)
                .withName("ListTransferTasks")
                .withUri("/v2/{project_id}/streams/{stream_name}/transfer-tasks")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("stream_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTransferTasksRequest::getStreamName, (req, v) -> {
                req.setStreamName(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SendRecordsRequest, SendRecordsResponse> sendRecords = genForsendRecords();

    private static HttpRequestDef<SendRecordsRequest, SendRecordsResponse> genForsendRecords() {
        // basic
        HttpRequestDef.Builder<SendRecordsRequest, SendRecordsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, SendRecordsRequest.class, SendRecordsResponse.class)
                .withName("SendRecords")
                .withUri("/v2/{project_id}/records")
                .withContentType("application/json");

        // requests
        builder.<PutRecordsRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PutRecordsRequest.class),
            f -> f.withMarshaller(SendRecordsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowCursorRequest, ShowCursorResponse> showCursor = genForshowCursor();

    private static HttpRequestDef<ShowCursorRequest, ShowCursorResponse> genForshowCursor() {
        // basic
        HttpRequestDef.Builder<ShowCursorRequest, ShowCursorResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowCursorRequest.class, ShowCursorResponse.class)
                .withName("ShowCursor")
                .withUri("/v2/{project_id}/cursors")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("stream-name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCursorRequest::getStreamName, (req, v) -> {
                req.setStreamName(v);
            }));
        builder.<String>withRequestField("partition-id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCursorRequest::getPartitionId, (req, v) -> {
                req.setPartitionId(v);
            }));
        builder.<ShowCursorRequest.CursorTypeEnum>withRequestField("cursor-type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowCursorRequest.CursorTypeEnum.class),
            f -> f.withMarshaller(ShowCursorRequest::getCursorType, (req, v) -> {
                req.setCursorType(v);
            }));
        builder.<String>withRequestField("starting-sequence-number",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCursorRequest::getStartingSequenceNumber, (req, v) -> {
                req.setStartingSequenceNumber(v);
            }));
        builder.<Long>withRequestField("timestamp",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowCursorRequest::getTimestamp, (req, v) -> {
                req.setTimestamp(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowPartitionMetricsRequest, ShowPartitionMetricsResponse> showPartitionMetrics =
        genForshowPartitionMetrics();

    private static HttpRequestDef<ShowPartitionMetricsRequest, ShowPartitionMetricsResponse> genForshowPartitionMetrics() {
        // basic
        HttpRequestDef.Builder<ShowPartitionMetricsRequest, ShowPartitionMetricsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowPartitionMetricsRequest.class, ShowPartitionMetricsResponse.class)
            .withName("ShowPartitionMetrics")
            .withUri("/v2/{project_id}/streams/{stream_name}/partitions/{partition_id}/metrics")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("stream_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPartitionMetricsRequest::getStreamName, (req, v) -> {
                req.setStreamName(v);
            }));
        builder.<String>withRequestField("partition_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPartitionMetricsRequest::getPartitionId, (req, v) -> {
                req.setPartitionId(v);
            }));
        builder.<ShowPartitionMetricsRequest.LabelEnum>withRequestField("label",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowPartitionMetricsRequest.LabelEnum.class),
            f -> f.withMarshaller(ShowPartitionMetricsRequest::getLabel, (req, v) -> {
                req.setLabel(v);
            }));
        builder.<String>withRequestField("label_list",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPartitionMetricsRequest::getLabelList, (req, v) -> {
                req.setLabelList(v);
            }));
        builder.<Long>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowPartitionMetricsRequest::getStartTime, (req, v) -> {
                req.setStartTime(v);
            }));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPartitionMetricsRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowStreamRequest, ShowStreamResponse> showStream = genForshowStream();

    private static HttpRequestDef<ShowStreamRequest, ShowStreamResponse> genForshowStream() {
        // basic
        HttpRequestDef.Builder<ShowStreamRequest, ShowStreamResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowStreamRequest.class, ShowStreamResponse.class)
                .withName("ShowStream")
                .withUri("/v2/{project_id}/streams/{stream_name}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("stream_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowStreamRequest::getStreamName, (req, v) -> {
                req.setStreamName(v);
            }));
        builder.<String>withRequestField("start_partitionId",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowStreamRequest::getStartPartitionId, (req, v) -> {
                req.setStartPartitionId(v);
            }));
        builder.<Integer>withRequestField("limit_partitions",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowStreamRequest::getLimitPartitions, (req, v) -> {
                req.setLimitPartitions(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowStreamMetricsRequest, ShowStreamMetricsResponse> showStreamMetrics =
        genForshowStreamMetrics();

    private static HttpRequestDef<ShowStreamMetricsRequest, ShowStreamMetricsResponse> genForshowStreamMetrics() {
        // basic
        HttpRequestDef.Builder<ShowStreamMetricsRequest, ShowStreamMetricsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowStreamMetricsRequest.class, ShowStreamMetricsResponse.class)
                .withName("ShowStreamMetrics")
                .withUri("/v2/{project_id}/streams/{stream_name}/metrics")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("stream_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowStreamMetricsRequest::getStreamName, (req, v) -> {
                req.setStreamName(v);
            }));
        builder.<ShowStreamMetricsRequest.LabelEnum>withRequestField("label",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowStreamMetricsRequest.LabelEnum.class),
            f -> f.withMarshaller(ShowStreamMetricsRequest::getLabel, (req, v) -> {
                req.setLabel(v);
            }));
        builder.<String>withRequestField("label_list",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowStreamMetricsRequest::getLabelList, (req, v) -> {
                req.setLabelList(v);
            }));
        builder.<Long>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowStreamMetricsRequest::getStartTime, (req, v) -> {
                req.setStartTime(v);
            }));
        builder.<Long>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowStreamMetricsRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowStreamTagsRequest, ShowStreamTagsResponse> showStreamTags =
        genForshowStreamTags();

    private static HttpRequestDef<ShowStreamTagsRequest, ShowStreamTagsResponse> genForshowStreamTags() {
        // basic
        HttpRequestDef.Builder<ShowStreamTagsRequest, ShowStreamTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowStreamTagsRequest.class, ShowStreamTagsResponse.class)
                .withName("ShowStreamTags")
                .withUri("/v2/{project_id}/stream/{stream_id}/tags")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("stream_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowStreamTagsRequest::getStreamId, (req, v) -> {
                req.setStreamId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTransferTaskRequest, ShowTransferTaskResponse> showTransferTask =
        genForshowTransferTask();

    private static HttpRequestDef<ShowTransferTaskRequest, ShowTransferTaskResponse> genForshowTransferTask() {
        // basic
        HttpRequestDef.Builder<ShowTransferTaskRequest, ShowTransferTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowTransferTaskRequest.class, ShowTransferTaskResponse.class)
                .withName("ShowTransferTask")
                .withUri("/v2/{project_id}/streams/{stream_name}/transfer-tasks/{task_name}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("stream_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTransferTaskRequest::getStreamName, (req, v) -> {
                req.setStreamName(v);
            }));
        builder.<String>withRequestField("task_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTransferTaskRequest::getTaskName, (req, v) -> {
                req.setTaskName(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdatePartitionCountRequest, UpdatePartitionCountResponse> updatePartitionCount =
        genForupdatePartitionCount();

    private static HttpRequestDef<UpdatePartitionCountRequest, UpdatePartitionCountResponse> genForupdatePartitionCount() {
        // basic
        HttpRequestDef.Builder<UpdatePartitionCountRequest, UpdatePartitionCountResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdatePartitionCountRequest.class, UpdatePartitionCountResponse.class)
            .withName("UpdatePartitionCount")
            .withUri("/v2/{project_id}/streams/{stream_name}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("stream_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePartitionCountRequest::getStreamName, (req, v) -> {
                req.setStreamName(v);
            }));
        builder.<UpdatePartitionCountReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdatePartitionCountReq.class),
            f -> f.withMarshaller(UpdatePartitionCountRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateStreamRequest, UpdateStreamResponse> updateStream = genForupdateStream();

    private static HttpRequestDef<UpdateStreamRequest, UpdateStreamResponse> genForupdateStream() {
        // basic
        HttpRequestDef.Builder<UpdateStreamRequest, UpdateStreamResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateStreamRequest.class, UpdateStreamResponse.class)
                .withName("UpdateStream")
                .withUri("/v3/{project_id}/streams/{stream_name}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("stream_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateStreamRequest::getStreamName, (req, v) -> {
                req.setStreamName(v);
            }));
        builder.<UpdateStreamReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateStreamReq.class),
            f -> f.withMarshaller(UpdateStreamRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateAppRequest, CreateAppResponse> createApp = genForcreateApp();

    private static HttpRequestDef<CreateAppRequest, CreateAppResponse> genForcreateApp() {
        // basic
        HttpRequestDef.Builder<CreateAppRequest, CreateAppResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateAppRequest.class, CreateAppResponse.class)
                .withName("CreateApp")
                .withUri("/v2/{project_id}/apps")
                .withContentType("application/json");

        // requests
        builder.<CreateAppReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateAppReq.class),
            f -> f.withMarshaller(CreateAppRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteAppRequest, DeleteAppResponse> deleteApp = genFordeleteApp();

    private static HttpRequestDef<DeleteAppRequest, DeleteAppResponse> genFordeleteApp() {
        // basic
        HttpRequestDef.Builder<DeleteAppRequest, DeleteAppResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteAppRequest.class, DeleteAppResponse.class)
                .withName("DeleteApp")
                .withUri("/v2/{project_id}/apps/{app_name}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("app_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAppRequest::getAppName, (req, v) -> {
                req.setAppName(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAppRequest, ListAppResponse> listApp = genForlistApp();

    private static HttpRequestDef<ListAppRequest, ListAppResponse> genForlistApp() {
        // basic
        HttpRequestDef.Builder<ListAppRequest, ListAppResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAppRequest.class, ListAppResponse.class)
                .withName("ListApp")
                .withUri("/v2/{project_id}/apps")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAppRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("start_app_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppRequest::getStartAppName, (req, v) -> {
                req.setStartAppName(v);
            }));
        builder.<String>withRequestField("stream_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppRequest::getStreamName, (req, v) -> {
                req.setStreamName(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAppRequest, ShowAppResponse> showApp = genForshowApp();

    private static HttpRequestDef<ShowAppRequest, ShowAppResponse> genForshowApp() {
        // basic
        HttpRequestDef.Builder<ShowAppRequest, ShowAppResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowAppRequest.class, ShowAppResponse.class)
                .withName("ShowApp")
                .withUri("/v2/{project_id}/apps/{app_name}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("app_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAppRequest::getAppName, (req, v) -> {
                req.setAppName(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowConsumerStateRequest, ShowConsumerStateResponse> showConsumerState =
        genForshowConsumerState();

    private static HttpRequestDef<ShowConsumerStateRequest, ShowConsumerStateResponse> genForshowConsumerState() {
        // basic
        HttpRequestDef.Builder<ShowConsumerStateRequest, ShowConsumerStateResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowConsumerStateRequest.class, ShowConsumerStateResponse.class)
                .withName("ShowConsumerState")
                .withUri("/v2/{project_id}/apps/{app_name}/streams/{stream_name}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("app_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowConsumerStateRequest::getAppName, (req, v) -> {
                req.setAppName(v);
            }));
        builder.<String>withRequestField("stream_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowConsumerStateRequest::getStreamName, (req, v) -> {
                req.setStreamName(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowConsumerStateRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("start_partition_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowConsumerStateRequest::getStartPartitionId, (req, v) -> {
                req.setStartPartitionId(v);
            }));
        builder.<ShowConsumerStateRequest.CheckpointTypeEnum>withRequestField("checkpoint_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ShowConsumerStateRequest.CheckpointTypeEnum.class),
            f -> f.withMarshaller(ShowConsumerStateRequest::getCheckpointType, (req, v) -> {
                req.setCheckpointType(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CommitCheckpointRequest, CommitCheckpointResponse> commitCheckpoint =
        genForcommitCheckpoint();

    private static HttpRequestDef<CommitCheckpointRequest, CommitCheckpointResponse> genForcommitCheckpoint() {
        // basic
        HttpRequestDef.Builder<CommitCheckpointRequest, CommitCheckpointResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CommitCheckpointRequest.class, CommitCheckpointResponse.class)
                .withName("CommitCheckpoint")
                .withUri("/v2/{project_id}/checkpoints")
                .withContentType("application/json");

        // requests
        builder.<CommitCheckpointReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CommitCheckpointReq.class),
            f -> f.withMarshaller(CommitCheckpointRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteCheckpointRequest, DeleteCheckpointResponse> deleteCheckpoint =
        genFordeleteCheckpoint();

    private static HttpRequestDef<DeleteCheckpointRequest, DeleteCheckpointResponse> genFordeleteCheckpoint() {
        // basic
        HttpRequestDef.Builder<DeleteCheckpointRequest, DeleteCheckpointResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteCheckpointRequest.class, DeleteCheckpointResponse.class)
                .withName("DeleteCheckpoint")
                .withUri("/v2/{project_id}/checkpoints")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("stream_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteCheckpointRequest::getStreamName, (req, v) -> {
                req.setStreamName(v);
            }));
        builder.<String>withRequestField("app_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteCheckpointRequest::getAppName, (req, v) -> {
                req.setAppName(v);
            }));
        builder.<DeleteCheckpointRequest.CheckpointTypeEnum>withRequestField("checkpoint_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteCheckpointRequest.CheckpointTypeEnum.class),
            f -> f.withMarshaller(DeleteCheckpointRequest::getCheckpointType, (req, v) -> {
                req.setCheckpointType(v);
            }));
        builder.<String>withRequestField("partition_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteCheckpointRequest::getPartitionId, (req, v) -> {
                req.setPartitionId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowCheckpointRequest, ShowCheckpointResponse> showCheckpoint =
        genForshowCheckpoint();

    private static HttpRequestDef<ShowCheckpointRequest, ShowCheckpointResponse> genForshowCheckpoint() {
        // basic
        HttpRequestDef.Builder<ShowCheckpointRequest, ShowCheckpointResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowCheckpointRequest.class, ShowCheckpointResponse.class)
                .withName("ShowCheckpoint")
                .withUri("/v2/{project_id}/checkpoints")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("stream_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCheckpointRequest::getStreamName, (req, v) -> {
                req.setStreamName(v);
            }));
        builder.<String>withRequestField("partition_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCheckpointRequest::getPartitionId, (req, v) -> {
                req.setPartitionId(v);
            }));
        builder.<String>withRequestField("app_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCheckpointRequest::getAppName, (req, v) -> {
                req.setAppName(v);
            }));
        builder.<ShowCheckpointRequest.CheckpointTypeEnum>withRequestField("checkpoint_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ShowCheckpointRequest.CheckpointTypeEnum.class),
            f -> f.withMarshaller(ShowCheckpointRequest::getCheckpointType, (req, v) -> {
                req.setCheckpointType(v);
            }));

        // response

        return builder.build();
    }

}
