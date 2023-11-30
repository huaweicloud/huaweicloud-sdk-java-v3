package com.huaweicloud.sdk.dis.v2;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.dis.v2.model.BatchCreateTagsRequest;
import com.huaweicloud.sdk.dis.v2.model.BatchCreateTagsResponse;
import com.huaweicloud.sdk.dis.v2.model.BatchDeleteTagsRequest;
import com.huaweicloud.sdk.dis.v2.model.BatchDeleteTagsResponse;
import com.huaweicloud.sdk.dis.v2.model.BatchStartTransferTaskRequest;
import com.huaweicloud.sdk.dis.v2.model.BatchStartTransferTaskResponse;
import com.huaweicloud.sdk.dis.v2.model.BatchStopTransferTaskRequest;
import com.huaweicloud.sdk.dis.v2.model.BatchStopTransferTaskResponse;
import com.huaweicloud.sdk.dis.v2.model.CommitCheckpointRequest;
import com.huaweicloud.sdk.dis.v2.model.CommitCheckpointResponse;
import com.huaweicloud.sdk.dis.v2.model.ConsumeRecordsRequest;
import com.huaweicloud.sdk.dis.v2.model.ConsumeRecordsResponse;
import com.huaweicloud.sdk.dis.v2.model.CreateAppRequest;
import com.huaweicloud.sdk.dis.v2.model.CreateAppResponse;
import com.huaweicloud.sdk.dis.v2.model.CreateObsTransferTaskRequest;
import com.huaweicloud.sdk.dis.v2.model.CreateObsTransferTaskResponse;
import com.huaweicloud.sdk.dis.v2.model.CreateStreamRequest;
import com.huaweicloud.sdk.dis.v2.model.CreateStreamResponse;
import com.huaweicloud.sdk.dis.v2.model.CreateTagRequest;
import com.huaweicloud.sdk.dis.v2.model.CreateTagResponse;
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
import com.huaweicloud.sdk.dis.v2.model.ListResourcesByTagsRequest;
import com.huaweicloud.sdk.dis.v2.model.ListResourcesByTagsResponse;
import com.huaweicloud.sdk.dis.v2.model.ListStreamsRequest;
import com.huaweicloud.sdk.dis.v2.model.ListStreamsResponse;
import com.huaweicloud.sdk.dis.v2.model.ListTagsRequest;
import com.huaweicloud.sdk.dis.v2.model.ListTagsResponse;
import com.huaweicloud.sdk.dis.v2.model.ListTransferTasksRequest;
import com.huaweicloud.sdk.dis.v2.model.ListTransferTasksResponse;
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
import com.huaweicloud.sdk.dis.v2.model.UpdatePartitionCountRequest;
import com.huaweicloud.sdk.dis.v2.model.UpdatePartitionCountResponse;
import com.huaweicloud.sdk.dis.v2.model.UpdateStreamRequest;
import com.huaweicloud.sdk.dis.v2.model.UpdateStreamResponse;

public class DisClient {

    protected HcClient hcClient;

    public DisClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<DisClient> newBuilder() {
        ClientBuilder<DisClient> clientBuilder = new ClientBuilder<>(DisClient::new);
        return clientBuilder;
    }

    /**
     * 批量添加资源标签
     *
     * 该接口用于批量添加资源（通道等）标签。此接口为幂等接口：创建时如果请求体中存在重复key则报错。创建时，不允许设置重复key数据，如果数据库已存在该key，就覆盖value的值。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchCreateTagsRequest 请求对象
     * @return BatchCreateTagsResponse
     */
    public BatchCreateTagsResponse batchCreateTags(BatchCreateTagsRequest request) {
        return hcClient.syncInvokeHttp(request, DisMeta.batchCreateTags);
    }

    /**
     * 批量添加资源标签
     *
     * 该接口用于批量添加资源（通道等）标签。此接口为幂等接口：创建时如果请求体中存在重复key则报错。创建时，不允许设置重复key数据，如果数据库已存在该key，就覆盖value的值。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchCreateTagsRequest 请求对象
     * @return SyncInvoker<BatchCreateTagsRequest, BatchCreateTagsResponse>
     */
    public SyncInvoker<BatchCreateTagsRequest, BatchCreateTagsResponse> batchCreateTagsInvoker(
        BatchCreateTagsRequest request) {
        return new SyncInvoker<BatchCreateTagsRequest, BatchCreateTagsResponse>(request, DisMeta.batchCreateTags,
            hcClient);
    }

    /**
     * 批量删除资源标签
     *
     * 该接口用于批量删除资源（通道等）标签。此接口为幂等接口：删除时，如果删除的标签不存在，默认处理成功；删除时不对标签字符集范围做校验。删除时tags结构体不能缺失，key不能为空，或者空字符串。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchDeleteTagsRequest 请求对象
     * @return BatchDeleteTagsResponse
     */
    public BatchDeleteTagsResponse batchDeleteTags(BatchDeleteTagsRequest request) {
        return hcClient.syncInvokeHttp(request, DisMeta.batchDeleteTags);
    }

    /**
     * 批量删除资源标签
     *
     * 该接口用于批量删除资源（通道等）标签。此接口为幂等接口：删除时，如果删除的标签不存在，默认处理成功；删除时不对标签字符集范围做校验。删除时tags结构体不能缺失，key不能为空，或者空字符串。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchDeleteTagsRequest 请求对象
     * @return SyncInvoker<BatchDeleteTagsRequest, BatchDeleteTagsResponse>
     */
    public SyncInvoker<BatchDeleteTagsRequest, BatchDeleteTagsResponse> batchDeleteTagsInvoker(
        BatchDeleteTagsRequest request) {
        return new SyncInvoker<BatchDeleteTagsRequest, BatchDeleteTagsResponse>(request, DisMeta.batchDeleteTags,
            hcClient);
    }

    /**
     * 批量启动转储任务
     *
     * 此接口用于批量启动转储任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchStartTransferTaskRequest 请求对象
     * @return BatchStartTransferTaskResponse
     */
    public BatchStartTransferTaskResponse batchStartTransferTask(BatchStartTransferTaskRequest request) {
        return hcClient.syncInvokeHttp(request, DisMeta.batchStartTransferTask);
    }

    /**
     * 批量启动转储任务
     *
     * 此接口用于批量启动转储任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchStartTransferTaskRequest 请求对象
     * @return SyncInvoker<BatchStartTransferTaskRequest, BatchStartTransferTaskResponse>
     */
    public SyncInvoker<BatchStartTransferTaskRequest, BatchStartTransferTaskResponse> batchStartTransferTaskInvoker(
        BatchStartTransferTaskRequest request) {
        return new SyncInvoker<BatchStartTransferTaskRequest, BatchStartTransferTaskResponse>(request,
            DisMeta.batchStartTransferTask, hcClient);
    }

    /**
     * 批量暂停转储任务
     *
     * 此接口用于批量暂停转储任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchStopTransferTaskRequest 请求对象
     * @return BatchStopTransferTaskResponse
     */
    public BatchStopTransferTaskResponse batchStopTransferTask(BatchStopTransferTaskRequest request) {
        return hcClient.syncInvokeHttp(request, DisMeta.batchStopTransferTask);
    }

    /**
     * 批量暂停转储任务
     *
     * 此接口用于批量暂停转储任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchStopTransferTaskRequest 请求对象
     * @return SyncInvoker<BatchStopTransferTaskRequest, BatchStopTransferTaskResponse>
     */
    public SyncInvoker<BatchStopTransferTaskRequest, BatchStopTransferTaskResponse> batchStopTransferTaskInvoker(
        BatchStopTransferTaskRequest request) {
        return new SyncInvoker<BatchStopTransferTaskRequest, BatchStopTransferTaskResponse>(request,
            DisMeta.batchStopTransferTask, hcClient);
    }

    /**
     * 下载数据
     *
     * 本接口用于从DIS通道中下载数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ConsumeRecordsRequest 请求对象
     * @return ConsumeRecordsResponse
     */
    public ConsumeRecordsResponse consumeRecords(ConsumeRecordsRequest request) {
        return hcClient.syncInvokeHttp(request, DisMeta.consumeRecords);
    }

    /**
     * 下载数据
     *
     * 本接口用于从DIS通道中下载数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ConsumeRecordsRequest 请求对象
     * @return SyncInvoker<ConsumeRecordsRequest, ConsumeRecordsResponse>
     */
    public SyncInvoker<ConsumeRecordsRequest, ConsumeRecordsResponse> consumeRecordsInvoker(
        ConsumeRecordsRequest request) {
        return new SyncInvoker<ConsumeRecordsRequest, ConsumeRecordsResponse>(request, DisMeta.consumeRecords,
            hcClient);
    }

    /**
     * 添加OBS转储任务
     *
     * 本接口用于添加OBS转储任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateObsTransferTaskRequest 请求对象
     * @return CreateObsTransferTaskResponse
     */
    public CreateObsTransferTaskResponse createObsTransferTask(CreateObsTransferTaskRequest request) {
        return hcClient.syncInvokeHttp(request, DisMeta.createObsTransferTask);
    }

    /**
     * 添加OBS转储任务
     *
     * 本接口用于添加OBS转储任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateObsTransferTaskRequest 请求对象
     * @return SyncInvoker<CreateObsTransferTaskRequest, CreateObsTransferTaskResponse>
     */
    public SyncInvoker<CreateObsTransferTaskRequest, CreateObsTransferTaskResponse> createObsTransferTaskInvoker(
        CreateObsTransferTaskRequest request) {
        return new SyncInvoker<CreateObsTransferTaskRequest, CreateObsTransferTaskResponse>(request,
            DisMeta.createObsTransferTask, hcClient);
    }

    /**
     * 创建通道
     *
     * 本接口用于创建通道。
     * 
     * - 创建通道时，需指定通道类型（普通、高级）、分区数量。
     * - 一个账号默认最多可以创建10个高级通道分区和50个普通通道分区，可提交工单增加配额。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateStreamRequest 请求对象
     * @return CreateStreamResponse
     */
    public CreateStreamResponse createStream(CreateStreamRequest request) {
        return hcClient.syncInvokeHttp(request, DisMeta.createStream);
    }

    /**
     * 创建通道
     *
     * 本接口用于创建通道。
     * 
     * - 创建通道时，需指定通道类型（普通、高级）、分区数量。
     * - 一个账号默认最多可以创建10个高级通道分区和50个普通通道分区，可提交工单增加配额。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateStreamRequest 请求对象
     * @return SyncInvoker<CreateStreamRequest, CreateStreamResponse>
     */
    public SyncInvoker<CreateStreamRequest, CreateStreamResponse> createStreamInvoker(CreateStreamRequest request) {
        return new SyncInvoker<CreateStreamRequest, CreateStreamResponse>(request, DisMeta.createStream, hcClient);
    }

    /**
     * 给指定通道添加标签
     *
     * 本接口用于给指定通道添加标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateTagRequest 请求对象
     * @return CreateTagResponse
     */
    public CreateTagResponse createTag(CreateTagRequest request) {
        return hcClient.syncInvokeHttp(request, DisMeta.createTag);
    }

    /**
     * 给指定通道添加标签
     *
     * 本接口用于给指定通道添加标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateTagRequest 请求对象
     * @return SyncInvoker<CreateTagRequest, CreateTagResponse>
     */
    public SyncInvoker<CreateTagRequest, CreateTagResponse> createTagInvoker(CreateTagRequest request) {
        return new SyncInvoker<CreateTagRequest, CreateTagResponse>(request, DisMeta.createTag, hcClient);
    }

    /**
     * 删除指定通道
     *
     * 本接口用于删除指定通道。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteStreamRequest 请求对象
     * @return DeleteStreamResponse
     */
    public DeleteStreamResponse deleteStream(DeleteStreamRequest request) {
        return hcClient.syncInvokeHttp(request, DisMeta.deleteStream);
    }

    /**
     * 删除指定通道
     *
     * 本接口用于删除指定通道。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteStreamRequest 请求对象
     * @return SyncInvoker<DeleteStreamRequest, DeleteStreamResponse>
     */
    public SyncInvoker<DeleteStreamRequest, DeleteStreamResponse> deleteStreamInvoker(DeleteStreamRequest request) {
        return new SyncInvoker<DeleteStreamRequest, DeleteStreamResponse>(request, DisMeta.deleteStream, hcClient);
    }

    /**
     * 删除指定通道的标签
     *
     * 该接口用于删除指定通道的标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteTagRequest 请求对象
     * @return DeleteTagResponse
     */
    public DeleteTagResponse deleteTag(DeleteTagRequest request) {
        return hcClient.syncInvokeHttp(request, DisMeta.deleteTag);
    }

    /**
     * 删除指定通道的标签
     *
     * 该接口用于删除指定通道的标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteTagRequest 请求对象
     * @return SyncInvoker<DeleteTagRequest, DeleteTagResponse>
     */
    public SyncInvoker<DeleteTagRequest, DeleteTagResponse> deleteTagInvoker(DeleteTagRequest request) {
        return new SyncInvoker<DeleteTagRequest, DeleteTagResponse>(request, DisMeta.deleteTag, hcClient);
    }

    /**
     * 删除转储任务
     *
     * 该接口用于删除转储任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteTransferTaskRequest 请求对象
     * @return DeleteTransferTaskResponse
     */
    public DeleteTransferTaskResponse deleteTransferTask(DeleteTransferTaskRequest request) {
        return hcClient.syncInvokeHttp(request, DisMeta.deleteTransferTask);
    }

    /**
     * 删除转储任务
     *
     * 该接口用于删除转储任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteTransferTaskRequest 请求对象
     * @return SyncInvoker<DeleteTransferTaskRequest, DeleteTransferTaskResponse>
     */
    public SyncInvoker<DeleteTransferTaskRequest, DeleteTransferTaskResponse> deleteTransferTaskInvoker(
        DeleteTransferTaskRequest request) {
        return new SyncInvoker<DeleteTransferTaskRequest, DeleteTransferTaskResponse>(request,
            DisMeta.deleteTransferTask, hcClient);
    }

    /**
     * 查询权限策略列表
     *
     * 本接口用于查询指定通道的权限策略列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPoliciesRequest 请求对象
     * @return ListPoliciesResponse
     */
    public ListPoliciesResponse listPolicies(ListPoliciesRequest request) {
        return hcClient.syncInvokeHttp(request, DisMeta.listPolicies);
    }

    /**
     * 查询权限策略列表
     *
     * 本接口用于查询指定通道的权限策略列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPoliciesRequest 请求对象
     * @return SyncInvoker<ListPoliciesRequest, ListPoliciesResponse>
     */
    public SyncInvoker<ListPoliciesRequest, ListPoliciesResponse> listPoliciesInvoker(ListPoliciesRequest request) {
        return new SyncInvoker<ListPoliciesRequest, ListPoliciesResponse>(request, DisMeta.listPolicies, hcClient);
    }

    /**
     * 使用标签过滤资源（通道等）
     *
     * 该接口用于使用标签过滤资源（通道等）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListResourcesByTagsRequest 请求对象
     * @return ListResourcesByTagsResponse
     */
    public ListResourcesByTagsResponse listResourcesByTags(ListResourcesByTagsRequest request) {
        return hcClient.syncInvokeHttp(request, DisMeta.listResourcesByTags);
    }

    /**
     * 使用标签过滤资源（通道等）
     *
     * 该接口用于使用标签过滤资源（通道等）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListResourcesByTagsRequest 请求对象
     * @return SyncInvoker<ListResourcesByTagsRequest, ListResourcesByTagsResponse>
     */
    public SyncInvoker<ListResourcesByTagsRequest, ListResourcesByTagsResponse> listResourcesByTagsInvoker(
        ListResourcesByTagsRequest request) {
        return new SyncInvoker<ListResourcesByTagsRequest, ListResourcesByTagsResponse>(request,
            DisMeta.listResourcesByTags, hcClient);
    }

    /**
     * 查询通道列表
     *
     * 本接口用户查询当前租户创建的所有通道。
     * 
     * 查询时，需要指定从哪个通道开始返回通道列表和单次请求需要返回的最大数量。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListStreamsRequest 请求对象
     * @return ListStreamsResponse
     */
    public ListStreamsResponse listStreams(ListStreamsRequest request) {
        return hcClient.syncInvokeHttp(request, DisMeta.listStreams);
    }

    /**
     * 查询通道列表
     *
     * 本接口用户查询当前租户创建的所有通道。
     * 
     * 查询时，需要指定从哪个通道开始返回通道列表和单次请求需要返回的最大数量。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListStreamsRequest 请求对象
     * @return SyncInvoker<ListStreamsRequest, ListStreamsResponse>
     */
    public SyncInvoker<ListStreamsRequest, ListStreamsResponse> listStreamsInvoker(ListStreamsRequest request) {
        return new SyncInvoker<ListStreamsRequest, ListStreamsResponse>(request, DisMeta.listStreams, hcClient);
    }

    /**
     * 查询指定区域所有标签集合
     *
     * 该接口用于查询指定区域所有标签集合。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTagsRequest 请求对象
     * @return ListTagsResponse
     */
    public ListTagsResponse listTags(ListTagsRequest request) {
        return hcClient.syncInvokeHttp(request, DisMeta.listTags);
    }

    /**
     * 查询指定区域所有标签集合
     *
     * 该接口用于查询指定区域所有标签集合。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTagsRequest 请求对象
     * @return SyncInvoker<ListTagsRequest, ListTagsResponse>
     */
    public SyncInvoker<ListTagsRequest, ListTagsResponse> listTagsInvoker(ListTagsRequest request) {
        return new SyncInvoker<ListTagsRequest, ListTagsResponse>(request, DisMeta.listTags, hcClient);
    }

    /**
     * 查询转储任务列表
     *
     * 本接口用于查询转储任务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTransferTasksRequest 请求对象
     * @return ListTransferTasksResponse
     */
    public ListTransferTasksResponse listTransferTasks(ListTransferTasksRequest request) {
        return hcClient.syncInvokeHttp(request, DisMeta.listTransferTasks);
    }

    /**
     * 查询转储任务列表
     *
     * 本接口用于查询转储任务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTransferTasksRequest 请求对象
     * @return SyncInvoker<ListTransferTasksRequest, ListTransferTasksResponse>
     */
    public SyncInvoker<ListTransferTasksRequest, ListTransferTasksResponse> listTransferTasksInvoker(
        ListTransferTasksRequest request) {
        return new SyncInvoker<ListTransferTasksRequest, ListTransferTasksResponse>(request, DisMeta.listTransferTasks,
            hcClient);
    }

    /**
     * 上传数据
     *
     * 本接口用于上传数据到DIS通道中。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SendRecordsRequest 请求对象
     * @return SendRecordsResponse
     */
    public SendRecordsResponse sendRecords(SendRecordsRequest request) {
        return hcClient.syncInvokeHttp(request, DisMeta.sendRecords);
    }

    /**
     * 上传数据
     *
     * 本接口用于上传数据到DIS通道中。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SendRecordsRequest 请求对象
     * @return SyncInvoker<SendRecordsRequest, SendRecordsResponse>
     */
    public SyncInvoker<SendRecordsRequest, SendRecordsResponse> sendRecordsInvoker(SendRecordsRequest request) {
        return new SyncInvoker<SendRecordsRequest, SendRecordsResponse>(request, DisMeta.sendRecords, hcClient);
    }

    /**
     * 获取数据游标
     *
     * 本接口用于获取数据游标。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowCursorRequest 请求对象
     * @return ShowCursorResponse
     */
    public ShowCursorResponse showCursor(ShowCursorRequest request) {
        return hcClient.syncInvokeHttp(request, DisMeta.showCursor);
    }

    /**
     * 获取数据游标
     *
     * 本接口用于获取数据游标。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowCursorRequest 请求对象
     * @return SyncInvoker<ShowCursorRequest, ShowCursorResponse>
     */
    public SyncInvoker<ShowCursorRequest, ShowCursorResponse> showCursorInvoker(ShowCursorRequest request) {
        return new SyncInvoker<ShowCursorRequest, ShowCursorResponse>(request, DisMeta.showCursor, hcClient);
    }

    /**
     * 查询分区监控
     *
     * 本接口用于查询通道指定分区的监控数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPartitionMetricsRequest 请求对象
     * @return ShowPartitionMetricsResponse
     */
    public ShowPartitionMetricsResponse showPartitionMetrics(ShowPartitionMetricsRequest request) {
        return hcClient.syncInvokeHttp(request, DisMeta.showPartitionMetrics);
    }

    /**
     * 查询分区监控
     *
     * 本接口用于查询通道指定分区的监控数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPartitionMetricsRequest 请求对象
     * @return SyncInvoker<ShowPartitionMetricsRequest, ShowPartitionMetricsResponse>
     */
    public SyncInvoker<ShowPartitionMetricsRequest, ShowPartitionMetricsResponse> showPartitionMetricsInvoker(
        ShowPartitionMetricsRequest request) {
        return new SyncInvoker<ShowPartitionMetricsRequest, ShowPartitionMetricsResponse>(request,
            DisMeta.showPartitionMetrics, hcClient);
    }

    /**
     * 查看通道详情
     *
     * 本接口用于查询指定通道的详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowStreamRequest 请求对象
     * @return ShowStreamResponse
     */
    public ShowStreamResponse showStream(ShowStreamRequest request) {
        return hcClient.syncInvokeHttp(request, DisMeta.showStream);
    }

    /**
     * 查看通道详情
     *
     * 本接口用于查询指定通道的详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowStreamRequest 请求对象
     * @return SyncInvoker<ShowStreamRequest, ShowStreamResponse>
     */
    public SyncInvoker<ShowStreamRequest, ShowStreamResponse> showStreamInvoker(ShowStreamRequest request) {
        return new SyncInvoker<ShowStreamRequest, ShowStreamResponse>(request, DisMeta.showStream, hcClient);
    }

    /**
     * 查询通道监控
     *
     * 本接口用于查询指定通道的监控数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowStreamMetricsRequest 请求对象
     * @return ShowStreamMetricsResponse
     */
    public ShowStreamMetricsResponse showStreamMetrics(ShowStreamMetricsRequest request) {
        return hcClient.syncInvokeHttp(request, DisMeta.showStreamMetrics);
    }

    /**
     * 查询通道监控
     *
     * 本接口用于查询指定通道的监控数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowStreamMetricsRequest 请求对象
     * @return SyncInvoker<ShowStreamMetricsRequest, ShowStreamMetricsResponse>
     */
    public SyncInvoker<ShowStreamMetricsRequest, ShowStreamMetricsResponse> showStreamMetricsInvoker(
        ShowStreamMetricsRequest request) {
        return new SyncInvoker<ShowStreamMetricsRequest, ShowStreamMetricsResponse>(request, DisMeta.showStreamMetrics,
            hcClient);
    }

    /**
     * 查询指定通道的标签信息
     *
     * 该接口用于查询指定通道的标签信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowStreamTagsRequest 请求对象
     * @return ShowStreamTagsResponse
     */
    public ShowStreamTagsResponse showStreamTags(ShowStreamTagsRequest request) {
        return hcClient.syncInvokeHttp(request, DisMeta.showStreamTags);
    }

    /**
     * 查询指定通道的标签信息
     *
     * 该接口用于查询指定通道的标签信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowStreamTagsRequest 请求对象
     * @return SyncInvoker<ShowStreamTagsRequest, ShowStreamTagsResponse>
     */
    public SyncInvoker<ShowStreamTagsRequest, ShowStreamTagsResponse> showStreamTagsInvoker(
        ShowStreamTagsRequest request) {
        return new SyncInvoker<ShowStreamTagsRequest, ShowStreamTagsResponse>(request, DisMeta.showStreamTags,
            hcClient);
    }

    /**
     * 查询转储任务详情
     *
     * 查询转储任务详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowTransferTaskRequest 请求对象
     * @return ShowTransferTaskResponse
     */
    public ShowTransferTaskResponse showTransferTask(ShowTransferTaskRequest request) {
        return hcClient.syncInvokeHttp(request, DisMeta.showTransferTask);
    }

    /**
     * 查询转储任务详情
     *
     * 查询转储任务详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowTransferTaskRequest 请求对象
     * @return SyncInvoker<ShowTransferTaskRequest, ShowTransferTaskResponse>
     */
    public SyncInvoker<ShowTransferTaskRequest, ShowTransferTaskResponse> showTransferTaskInvoker(
        ShowTransferTaskRequest request) {
        return new SyncInvoker<ShowTransferTaskRequest, ShowTransferTaskResponse>(request, DisMeta.showTransferTask,
            hcClient);
    }

    /**
     * 修改分区数量
     *
     * 本接口用于变更指定通道中的分区数量。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdatePartitionCountRequest 请求对象
     * @return UpdatePartitionCountResponse
     */
    public UpdatePartitionCountResponse updatePartitionCount(UpdatePartitionCountRequest request) {
        return hcClient.syncInvokeHttp(request, DisMeta.updatePartitionCount);
    }

    /**
     * 修改分区数量
     *
     * 本接口用于变更指定通道中的分区数量。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdatePartitionCountRequest 请求对象
     * @return SyncInvoker<UpdatePartitionCountRequest, UpdatePartitionCountResponse>
     */
    public SyncInvoker<UpdatePartitionCountRequest, UpdatePartitionCountResponse> updatePartitionCountInvoker(
        UpdatePartitionCountRequest request) {
        return new SyncInvoker<UpdatePartitionCountRequest, UpdatePartitionCountResponse>(request,
            DisMeta.updatePartitionCount, hcClient);
    }

    /**
     * 更新通道信息
     *
     * 本接口用于更新指定通道的通道信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateStreamRequest 请求对象
     * @return UpdateStreamResponse
     */
    public UpdateStreamResponse updateStream(UpdateStreamRequest request) {
        return hcClient.syncInvokeHttp(request, DisMeta.updateStream);
    }

    /**
     * 更新通道信息
     *
     * 本接口用于更新指定通道的通道信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateStreamRequest 请求对象
     * @return SyncInvoker<UpdateStreamRequest, UpdateStreamResponse>
     */
    public SyncInvoker<UpdateStreamRequest, UpdateStreamResponse> updateStreamInvoker(UpdateStreamRequest request) {
        return new SyncInvoker<UpdateStreamRequest, UpdateStreamResponse>(request, DisMeta.updateStream, hcClient);
    }

    /**
     * 创建消费App
     *
     * 本接口用于创建消费APP。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateAppRequest 请求对象
     * @return CreateAppResponse
     */
    public CreateAppResponse createApp(CreateAppRequest request) {
        return hcClient.syncInvokeHttp(request, DisMeta.createApp);
    }

    /**
     * 创建消费App
     *
     * 本接口用于创建消费APP。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateAppRequest 请求对象
     * @return SyncInvoker<CreateAppRequest, CreateAppResponse>
     */
    public SyncInvoker<CreateAppRequest, CreateAppResponse> createAppInvoker(CreateAppRequest request) {
        return new SyncInvoker<CreateAppRequest, CreateAppResponse>(request, DisMeta.createApp, hcClient);
    }

    /**
     * 删除App
     *
     * 本接口用于删除App。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteAppRequest 请求对象
     * @return DeleteAppResponse
     */
    public DeleteAppResponse deleteApp(DeleteAppRequest request) {
        return hcClient.syncInvokeHttp(request, DisMeta.deleteApp);
    }

    /**
     * 删除App
     *
     * 本接口用于删除App。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteAppRequest 请求对象
     * @return SyncInvoker<DeleteAppRequest, DeleteAppResponse>
     */
    public SyncInvoker<DeleteAppRequest, DeleteAppResponse> deleteAppInvoker(DeleteAppRequest request) {
        return new SyncInvoker<DeleteAppRequest, DeleteAppResponse>(request, DisMeta.deleteApp, hcClient);
    }

    /**
     * 查询App列表
     *
     * 本接口用于查询APP列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAppRequest 请求对象
     * @return ListAppResponse
     */
    public ListAppResponse listApp(ListAppRequest request) {
        return hcClient.syncInvokeHttp(request, DisMeta.listApp);
    }

    /**
     * 查询App列表
     *
     * 本接口用于查询APP列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAppRequest 请求对象
     * @return SyncInvoker<ListAppRequest, ListAppResponse>
     */
    public SyncInvoker<ListAppRequest, ListAppResponse> listAppInvoker(ListAppRequest request) {
        return new SyncInvoker<ListAppRequest, ListAppResponse>(request, DisMeta.listApp, hcClient);
    }

    /**
     * 查看App详情
     *
     * 本接口用于查询APP详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAppRequest 请求对象
     * @return ShowAppResponse
     */
    public ShowAppResponse showApp(ShowAppRequest request) {
        return hcClient.syncInvokeHttp(request, DisMeta.showApp);
    }

    /**
     * 查看App详情
     *
     * 本接口用于查询APP详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAppRequest 请求对象
     * @return SyncInvoker<ShowAppRequest, ShowAppResponse>
     */
    public SyncInvoker<ShowAppRequest, ShowAppResponse> showAppInvoker(ShowAppRequest request) {
        return new SyncInvoker<ShowAppRequest, ShowAppResponse>(request, DisMeta.showApp, hcClient);
    }

    /**
     * 查看App消费状态
     *
     * 本接口用于查询APP消费状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowConsumerStateRequest 请求对象
     * @return ShowConsumerStateResponse
     */
    public ShowConsumerStateResponse showConsumerState(ShowConsumerStateRequest request) {
        return hcClient.syncInvokeHttp(request, DisMeta.showConsumerState);
    }

    /**
     * 查看App消费状态
     *
     * 本接口用于查询APP消费状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowConsumerStateRequest 请求对象
     * @return SyncInvoker<ShowConsumerStateRequest, ShowConsumerStateResponse>
     */
    public SyncInvoker<ShowConsumerStateRequest, ShowConsumerStateResponse> showConsumerStateInvoker(
        ShowConsumerStateRequest request) {
        return new SyncInvoker<ShowConsumerStateRequest, ShowConsumerStateResponse>(request, DisMeta.showConsumerState,
            hcClient);
    }

    /**
     * 提交Checkpoint
     *
     * 本接口用于提交Checkpoint。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CommitCheckpointRequest 请求对象
     * @return CommitCheckpointResponse
     */
    public CommitCheckpointResponse commitCheckpoint(CommitCheckpointRequest request) {
        return hcClient.syncInvokeHttp(request, DisMeta.commitCheckpoint);
    }

    /**
     * 提交Checkpoint
     *
     * 本接口用于提交Checkpoint。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CommitCheckpointRequest 请求对象
     * @return SyncInvoker<CommitCheckpointRequest, CommitCheckpointResponse>
     */
    public SyncInvoker<CommitCheckpointRequest, CommitCheckpointResponse> commitCheckpointInvoker(
        CommitCheckpointRequest request) {
        return new SyncInvoker<CommitCheckpointRequest, CommitCheckpointResponse>(request, DisMeta.commitCheckpoint,
            hcClient);
    }

    /**
     * 删除Checkpoint
     *
     * 本接口用于删除Checkpoint。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteCheckpointRequest 请求对象
     * @return DeleteCheckpointResponse
     */
    public DeleteCheckpointResponse deleteCheckpoint(DeleteCheckpointRequest request) {
        return hcClient.syncInvokeHttp(request, DisMeta.deleteCheckpoint);
    }

    /**
     * 删除Checkpoint
     *
     * 本接口用于删除Checkpoint。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteCheckpointRequest 请求对象
     * @return SyncInvoker<DeleteCheckpointRequest, DeleteCheckpointResponse>
     */
    public SyncInvoker<DeleteCheckpointRequest, DeleteCheckpointResponse> deleteCheckpointInvoker(
        DeleteCheckpointRequest request) {
        return new SyncInvoker<DeleteCheckpointRequest, DeleteCheckpointResponse>(request, DisMeta.deleteCheckpoint,
            hcClient);
    }

    /**
     * 查询Checkpoint详情
     *
     * 本接口用于查询Checkpoint详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowCheckpointRequest 请求对象
     * @return ShowCheckpointResponse
     */
    public ShowCheckpointResponse showCheckpoint(ShowCheckpointRequest request) {
        return hcClient.syncInvokeHttp(request, DisMeta.showCheckpoint);
    }

    /**
     * 查询Checkpoint详情
     *
     * 本接口用于查询Checkpoint详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowCheckpointRequest 请求对象
     * @return SyncInvoker<ShowCheckpointRequest, ShowCheckpointResponse>
     */
    public SyncInvoker<ShowCheckpointRequest, ShowCheckpointResponse> showCheckpointInvoker(
        ShowCheckpointRequest request) {
        return new SyncInvoker<ShowCheckpointRequest, ShowCheckpointResponse>(request, DisMeta.showCheckpoint,
            hcClient);
    }

}
