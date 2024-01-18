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
        genForBatchCreateTags();

    private static HttpRequestDef<BatchCreateTagsRequest, BatchCreateTagsResponse> genForBatchCreateTags() {
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
            f -> f.withMarshaller(BatchCreateTagsRequest::getStreamId, BatchCreateTagsRequest::setStreamId));
        builder.<BatchCreateTagsReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchCreateTagsReq.class),
            f -> f.withMarshaller(BatchCreateTagsRequest::getBody, BatchCreateTagsRequest::setBody));

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
                .withUri("/v2/{project_id}/stream/{stream_id}/tags/action")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("stream_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeleteTagsRequest::getStreamId, BatchDeleteTagsRequest::setStreamId));
        builder.<BatchDeleteTagsReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchDeleteTagsReq.class),
            f -> f.withMarshaller(BatchDeleteTagsRequest::getBody, BatchDeleteTagsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchStartTransferTaskRequest, BatchStartTransferTaskResponse> batchStartTransferTask =
        genForBatchStartTransferTask();

    private static HttpRequestDef<BatchStartTransferTaskRequest, BatchStartTransferTaskResponse> genForBatchStartTransferTask() {
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
            f -> f.withMarshaller(BatchStartTransferTaskRequest::getStreamName,
                BatchStartTransferTaskRequest::setStreamName));
        builder.<BatchStartTransferTaskReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchStartTransferTaskReq.class),
            f -> f.withMarshaller(BatchStartTransferTaskRequest::getBody, BatchStartTransferTaskRequest::setBody));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(BatchStartTransferTaskResponse::getBody, BatchStartTransferTaskResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<BatchStopTransferTaskRequest, BatchStopTransferTaskResponse> batchStopTransferTask =
        genForBatchStopTransferTask();

    private static HttpRequestDef<BatchStopTransferTaskRequest, BatchStopTransferTaskResponse> genForBatchStopTransferTask() {
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
            f -> f.withMarshaller(BatchStopTransferTaskRequest::getStreamName,
                BatchStopTransferTaskRequest::setStreamName));
        builder.<BatchStopTransferTaskReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchStopTransferTaskReq.class),
            f -> f.withMarshaller(BatchStopTransferTaskRequest::getBody, BatchStopTransferTaskRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ConsumeRecordsRequest, ConsumeRecordsResponse> consumeRecords =
        genForConsumeRecords();

    private static HttpRequestDef<ConsumeRecordsRequest, ConsumeRecordsResponse> genForConsumeRecords() {
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
            f -> f.withMarshaller(ConsumeRecordsRequest::getPartitionCursor,
                ConsumeRecordsRequest::setPartitionCursor));
        builder.<Integer>withRequestField("max_fetch_bytes",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ConsumeRecordsRequest::getMaxFetchBytes, ConsumeRecordsRequest::setMaxFetchBytes));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateObsTransferTaskRequest, CreateObsTransferTaskResponse> createObsTransferTask =
        genForCreateObsTransferTask();

    private static HttpRequestDef<CreateObsTransferTaskRequest, CreateObsTransferTaskResponse> genForCreateObsTransferTask() {
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
            f -> f.withMarshaller(CreateObsTransferTaskRequest::getStreamName,
                CreateObsTransferTaskRequest::setStreamName));
        builder.<CreateTransferTaskReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateTransferTaskReq.class),
            f -> f.withMarshaller(CreateObsTransferTaskRequest::getBody, CreateObsTransferTaskRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateStreamRequest, CreateStreamResponse> createStream = genForCreateStream();

    private static HttpRequestDef<CreateStreamRequest, CreateStreamResponse> genForCreateStream() {
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
            f -> f.withMarshaller(CreateStreamRequest::getBody, CreateStreamRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateTagRequest, CreateTagResponse> createTag = genForCreateTag();

    private static HttpRequestDef<CreateTagRequest, CreateTagResponse> genForCreateTag() {
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
            f -> f.withMarshaller(CreateTagRequest::getStreamId, CreateTagRequest::setStreamId));
        builder.<CreateTagReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateTagReq.class),
            f -> f.withMarshaller(CreateTagRequest::getBody, CreateTagRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteStreamRequest, DeleteStreamResponse> deleteStream = genForDeleteStream();

    private static HttpRequestDef<DeleteStreamRequest, DeleteStreamResponse> genForDeleteStream() {
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
            f -> f.withMarshaller(DeleteStreamRequest::getStreamName, DeleteStreamRequest::setStreamName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteTagRequest, DeleteTagResponse> deleteTag = genForDeleteTag();

    private static HttpRequestDef<DeleteTagRequest, DeleteTagResponse> genForDeleteTag() {
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
            f -> f.withMarshaller(DeleteTagRequest::getStreamId, DeleteTagRequest::setStreamId));
        builder.<String>withRequestField("key",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTagRequest::getKey, DeleteTagRequest::setKey));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteTransferTaskRequest, DeleteTransferTaskResponse> deleteTransferTask =
        genForDeleteTransferTask();

    private static HttpRequestDef<DeleteTransferTaskRequest, DeleteTransferTaskResponse> genForDeleteTransferTask() {
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
            f -> f.withMarshaller(DeleteTransferTaskRequest::getStreamName, DeleteTransferTaskRequest::setStreamName));
        builder.<String>withRequestField("task_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTransferTaskRequest::getTaskName, DeleteTransferTaskRequest::setTaskName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPoliciesRequest, ListPoliciesResponse> listPolicies = genForListPolicies();

    private static HttpRequestDef<ListPoliciesRequest, ListPoliciesResponse> genForListPolicies() {
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
            f -> f.withMarshaller(ListPoliciesRequest::getStreamName, ListPoliciesRequest::setStreamName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListResourcesByTagsRequest, ListResourcesByTagsResponse> listResourcesByTags =
        genForListResourcesByTags();

    private static HttpRequestDef<ListResourcesByTagsRequest, ListResourcesByTagsResponse> genForListResourcesByTags() {
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
            f -> f.withMarshaller(ListResourcesByTagsRequest::getBody, ListResourcesByTagsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListStreamsRequest, ListStreamsResponse> listStreams = genForListStreams();

    private static HttpRequestDef<ListStreamsRequest, ListStreamsResponse> genForListStreams() {
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
            f -> f.withMarshaller(ListStreamsRequest::getLimit, ListStreamsRequest::setLimit));
        builder.<String>withRequestField("start_stream_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStreamsRequest::getStartStreamName, ListStreamsRequest::setStartStreamName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTagsRequest, ListTagsResponse> listTags = genForListTags();

    private static HttpRequestDef<ListTagsRequest, ListTagsResponse> genForListTags() {
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
        genForListTransferTasks();

    private static HttpRequestDef<ListTransferTasksRequest, ListTransferTasksResponse> genForListTransferTasks() {
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
            f -> f.withMarshaller(ListTransferTasksRequest::getStreamName, ListTransferTasksRequest::setStreamName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SendRecordsRequest, SendRecordsResponse> sendRecords = genForSendRecords();

    private static HttpRequestDef<SendRecordsRequest, SendRecordsResponse> genForSendRecords() {
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
            f -> f.withMarshaller(SendRecordsRequest::getBody, SendRecordsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowCursorRequest, ShowCursorResponse> showCursor = genForShowCursor();

    private static HttpRequestDef<ShowCursorRequest, ShowCursorResponse> genForShowCursor() {
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
            f -> f.withMarshaller(ShowCursorRequest::getStreamName, ShowCursorRequest::setStreamName));
        builder.<String>withRequestField("partition-id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCursorRequest::getPartitionId, ShowCursorRequest::setPartitionId));
        builder.<ShowCursorRequest.CursorTypeEnum>withRequestField("cursor-type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowCursorRequest.CursorTypeEnum.class),
            f -> f.withMarshaller(ShowCursorRequest::getCursorType, ShowCursorRequest::setCursorType));
        builder.<String>withRequestField("starting-sequence-number",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCursorRequest::getStartingSequenceNumber,
                ShowCursorRequest::setStartingSequenceNumber));
        builder.<Long>withRequestField("timestamp",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowCursorRequest::getTimestamp, ShowCursorRequest::setTimestamp));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowPartitionMetricsRequest, ShowPartitionMetricsResponse> showPartitionMetrics =
        genForShowPartitionMetrics();

    private static HttpRequestDef<ShowPartitionMetricsRequest, ShowPartitionMetricsResponse> genForShowPartitionMetrics() {
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
            f -> f.withMarshaller(ShowPartitionMetricsRequest::getStreamName,
                ShowPartitionMetricsRequest::setStreamName));
        builder.<String>withRequestField("partition_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPartitionMetricsRequest::getPartitionId,
                ShowPartitionMetricsRequest::setPartitionId));
        builder.<ShowPartitionMetricsRequest.LabelEnum>withRequestField("label",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowPartitionMetricsRequest.LabelEnum.class),
            f -> f.withMarshaller(ShowPartitionMetricsRequest::getLabel, ShowPartitionMetricsRequest::setLabel));
        builder.<String>withRequestField("label_list",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPartitionMetricsRequest::getLabelList,
                ShowPartitionMetricsRequest::setLabelList));
        builder.<Long>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowPartitionMetricsRequest::getStartTime,
                ShowPartitionMetricsRequest::setStartTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPartitionMetricsRequest::getEndTime, ShowPartitionMetricsRequest::setEndTime));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowStreamRequest, ShowStreamResponse> showStream = genForShowStream();

    private static HttpRequestDef<ShowStreamRequest, ShowStreamResponse> genForShowStream() {
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
            f -> f.withMarshaller(ShowStreamRequest::getStreamName, ShowStreamRequest::setStreamName));
        builder.<String>withRequestField("start_partitionId",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowStreamRequest::getStartPartitionId, ShowStreamRequest::setStartPartitionId));
        builder.<Integer>withRequestField("limit_partitions",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowStreamRequest::getLimitPartitions, ShowStreamRequest::setLimitPartitions));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowStreamMetricsRequest, ShowStreamMetricsResponse> showStreamMetrics =
        genForShowStreamMetrics();

    private static HttpRequestDef<ShowStreamMetricsRequest, ShowStreamMetricsResponse> genForShowStreamMetrics() {
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
            f -> f.withMarshaller(ShowStreamMetricsRequest::getStreamName, ShowStreamMetricsRequest::setStreamName));
        builder.<ShowStreamMetricsRequest.LabelEnum>withRequestField("label",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowStreamMetricsRequest.LabelEnum.class),
            f -> f.withMarshaller(ShowStreamMetricsRequest::getLabel, ShowStreamMetricsRequest::setLabel));
        builder.<String>withRequestField("label_list",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowStreamMetricsRequest::getLabelList, ShowStreamMetricsRequest::setLabelList));
        builder.<Long>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowStreamMetricsRequest::getStartTime, ShowStreamMetricsRequest::setStartTime));
        builder.<Long>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowStreamMetricsRequest::getEndTime, ShowStreamMetricsRequest::setEndTime));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowStreamTagsRequest, ShowStreamTagsResponse> showStreamTags =
        genForShowStreamTags();

    private static HttpRequestDef<ShowStreamTagsRequest, ShowStreamTagsResponse> genForShowStreamTags() {
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
            f -> f.withMarshaller(ShowStreamTagsRequest::getStreamId, ShowStreamTagsRequest::setStreamId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTransferTaskRequest, ShowTransferTaskResponse> showTransferTask =
        genForShowTransferTask();

    private static HttpRequestDef<ShowTransferTaskRequest, ShowTransferTaskResponse> genForShowTransferTask() {
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
            f -> f.withMarshaller(ShowTransferTaskRequest::getStreamName, ShowTransferTaskRequest::setStreamName));
        builder.<String>withRequestField("task_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTransferTaskRequest::getTaskName, ShowTransferTaskRequest::setTaskName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdatePartitionCountRequest, UpdatePartitionCountResponse> updatePartitionCount =
        genForUpdatePartitionCount();

    private static HttpRequestDef<UpdatePartitionCountRequest, UpdatePartitionCountResponse> genForUpdatePartitionCount() {
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
            f -> f.withMarshaller(UpdatePartitionCountRequest::getStreamName,
                UpdatePartitionCountRequest::setStreamName));
        builder.<UpdatePartitionCountReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdatePartitionCountReq.class),
            f -> f.withMarshaller(UpdatePartitionCountRequest::getBody, UpdatePartitionCountRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateStreamRequest, UpdateStreamResponse> updateStream = genForUpdateStream();

    private static HttpRequestDef<UpdateStreamRequest, UpdateStreamResponse> genForUpdateStream() {
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
            f -> f.withMarshaller(UpdateStreamRequest::getStreamName, UpdateStreamRequest::setStreamName));
        builder.<UpdateStreamReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateStreamReq.class),
            f -> f.withMarshaller(UpdateStreamRequest::getBody, UpdateStreamRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateAppRequest, CreateAppResponse> createApp = genForCreateApp();

    private static HttpRequestDef<CreateAppRequest, CreateAppResponse> genForCreateApp() {
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
            f -> f.withMarshaller(CreateAppRequest::getBody, CreateAppRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteAppRequest, DeleteAppResponse> deleteApp = genForDeleteApp();

    private static HttpRequestDef<DeleteAppRequest, DeleteAppResponse> genForDeleteApp() {
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
            f -> f.withMarshaller(DeleteAppRequest::getAppName, DeleteAppRequest::setAppName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAppRequest, ListAppResponse> listApp = genForListApp();

    private static HttpRequestDef<ListAppRequest, ListAppResponse> genForListApp() {
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
            f -> f.withMarshaller(ListAppRequest::getLimit, ListAppRequest::setLimit));
        builder.<String>withRequestField("start_app_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppRequest::getStartAppName, ListAppRequest::setStartAppName));
        builder.<String>withRequestField("stream_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppRequest::getStreamName, ListAppRequest::setStreamName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAppRequest, ShowAppResponse> showApp = genForShowApp();

    private static HttpRequestDef<ShowAppRequest, ShowAppResponse> genForShowApp() {
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
            f -> f.withMarshaller(ShowAppRequest::getAppName, ShowAppRequest::setAppName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowConsumerStateRequest, ShowConsumerStateResponse> showConsumerState =
        genForShowConsumerState();

    private static HttpRequestDef<ShowConsumerStateRequest, ShowConsumerStateResponse> genForShowConsumerState() {
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
            f -> f.withMarshaller(ShowConsumerStateRequest::getAppName, ShowConsumerStateRequest::setAppName));
        builder.<String>withRequestField("stream_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowConsumerStateRequest::getStreamName, ShowConsumerStateRequest::setStreamName));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowConsumerStateRequest::getLimit, ShowConsumerStateRequest::setLimit));
        builder.<String>withRequestField("start_partition_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowConsumerStateRequest::getStartPartitionId,
                ShowConsumerStateRequest::setStartPartitionId));
        builder.<ShowConsumerStateRequest.CheckpointTypeEnum>withRequestField("checkpoint_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ShowConsumerStateRequest.CheckpointTypeEnum.class),
            f -> f.withMarshaller(ShowConsumerStateRequest::getCheckpointType,
                ShowConsumerStateRequest::setCheckpointType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CommitCheckpointRequest, CommitCheckpointResponse> commitCheckpoint =
        genForCommitCheckpoint();

    private static HttpRequestDef<CommitCheckpointRequest, CommitCheckpointResponse> genForCommitCheckpoint() {
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
            f -> f.withMarshaller(CommitCheckpointRequest::getBody, CommitCheckpointRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteCheckpointRequest, DeleteCheckpointResponse> deleteCheckpoint =
        genForDeleteCheckpoint();

    private static HttpRequestDef<DeleteCheckpointRequest, DeleteCheckpointResponse> genForDeleteCheckpoint() {
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
            f -> f.withMarshaller(DeleteCheckpointRequest::getStreamName, DeleteCheckpointRequest::setStreamName));
        builder.<String>withRequestField("app_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteCheckpointRequest::getAppName, DeleteCheckpointRequest::setAppName));
        builder.<DeleteCheckpointRequest.CheckpointTypeEnum>withRequestField("checkpoint_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteCheckpointRequest.CheckpointTypeEnum.class),
            f -> f.withMarshaller(DeleteCheckpointRequest::getCheckpointType,
                DeleteCheckpointRequest::setCheckpointType));
        builder.<String>withRequestField("partition_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteCheckpointRequest::getPartitionId, DeleteCheckpointRequest::setPartitionId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowCheckpointRequest, ShowCheckpointResponse> showCheckpoint =
        genForShowCheckpoint();

    private static HttpRequestDef<ShowCheckpointRequest, ShowCheckpointResponse> genForShowCheckpoint() {
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
            f -> f.withMarshaller(ShowCheckpointRequest::getStreamName, ShowCheckpointRequest::setStreamName));
        builder.<String>withRequestField("partition_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCheckpointRequest::getPartitionId, ShowCheckpointRequest::setPartitionId));
        builder.<String>withRequestField("app_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCheckpointRequest::getAppName, ShowCheckpointRequest::setAppName));
        builder.<ShowCheckpointRequest.CheckpointTypeEnum>withRequestField("checkpoint_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ShowCheckpointRequest.CheckpointTypeEnum.class),
            f -> f.withMarshaller(ShowCheckpointRequest::getCheckpointType, ShowCheckpointRequest::setCheckpointType));

        // response

        return builder.build();
    }

}
