package com.huaweicloud.sdk.dis.v2;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
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

import java.util.concurrent.CompletableFuture;

public class DisAsyncClient {

    protected HcClient hcClient;

    public DisAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<DisAsyncClient> newBuilder() {
        ClientBuilder<DisAsyncClient> clientBuilder = new ClientBuilder<>(DisAsyncClient::new);
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
     * @return CompletableFuture<BatchCreateTagsResponse>
     */
    public CompletableFuture<BatchCreateTagsResponse> batchCreateTagsAsync(BatchCreateTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, DisMeta.batchCreateTags);
    }

    /**
     * 批量添加资源标签
     *
     * 该接口用于批量添加资源（通道等）标签。此接口为幂等接口：创建时如果请求体中存在重复key则报错。创建时，不允许设置重复key数据，如果数据库已存在该key，就覆盖value的值。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchCreateTagsRequest 请求对象
     * @return AsyncInvoker<BatchCreateTagsRequest, BatchCreateTagsResponse>
     */
    public AsyncInvoker<BatchCreateTagsRequest, BatchCreateTagsResponse> batchCreateTagsAsyncInvoker(
        BatchCreateTagsRequest request) {
        return new AsyncInvoker<BatchCreateTagsRequest, BatchCreateTagsResponse>(request, DisMeta.batchCreateTags,
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
     * @return CompletableFuture<BatchDeleteTagsResponse>
     */
    public CompletableFuture<BatchDeleteTagsResponse> batchDeleteTagsAsync(BatchDeleteTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, DisMeta.batchDeleteTags);
    }

    /**
     * 批量删除资源标签
     *
     * 该接口用于批量删除资源（通道等）标签。此接口为幂等接口：删除时，如果删除的标签不存在，默认处理成功；删除时不对标签字符集范围做校验。删除时tags结构体不能缺失，key不能为空，或者空字符串。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchDeleteTagsRequest 请求对象
     * @return AsyncInvoker<BatchDeleteTagsRequest, BatchDeleteTagsResponse>
     */
    public AsyncInvoker<BatchDeleteTagsRequest, BatchDeleteTagsResponse> batchDeleteTagsAsyncInvoker(
        BatchDeleteTagsRequest request) {
        return new AsyncInvoker<BatchDeleteTagsRequest, BatchDeleteTagsResponse>(request, DisMeta.batchDeleteTags,
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
     * @return CompletableFuture<BatchStartTransferTaskResponse>
     */
    public CompletableFuture<BatchStartTransferTaskResponse> batchStartTransferTaskAsync(
        BatchStartTransferTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, DisMeta.batchStartTransferTask);
    }

    /**
     * 批量启动转储任务
     *
     * 此接口用于批量启动转储任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchStartTransferTaskRequest 请求对象
     * @return AsyncInvoker<BatchStartTransferTaskRequest, BatchStartTransferTaskResponse>
     */
    public AsyncInvoker<BatchStartTransferTaskRequest, BatchStartTransferTaskResponse> batchStartTransferTaskAsyncInvoker(
        BatchStartTransferTaskRequest request) {
        return new AsyncInvoker<BatchStartTransferTaskRequest, BatchStartTransferTaskResponse>(request,
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
     * @return CompletableFuture<BatchStopTransferTaskResponse>
     */
    public CompletableFuture<BatchStopTransferTaskResponse> batchStopTransferTaskAsync(
        BatchStopTransferTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, DisMeta.batchStopTransferTask);
    }

    /**
     * 批量暂停转储任务
     *
     * 此接口用于批量暂停转储任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchStopTransferTaskRequest 请求对象
     * @return AsyncInvoker<BatchStopTransferTaskRequest, BatchStopTransferTaskResponse>
     */
    public AsyncInvoker<BatchStopTransferTaskRequest, BatchStopTransferTaskResponse> batchStopTransferTaskAsyncInvoker(
        BatchStopTransferTaskRequest request) {
        return new AsyncInvoker<BatchStopTransferTaskRequest, BatchStopTransferTaskResponse>(request,
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
     * @return CompletableFuture<ConsumeRecordsResponse>
     */
    public CompletableFuture<ConsumeRecordsResponse> consumeRecordsAsync(ConsumeRecordsRequest request) {
        return hcClient.asyncInvokeHttp(request, DisMeta.consumeRecords);
    }

    /**
     * 下载数据
     *
     * 本接口用于从DIS通道中下载数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ConsumeRecordsRequest 请求对象
     * @return AsyncInvoker<ConsumeRecordsRequest, ConsumeRecordsResponse>
     */
    public AsyncInvoker<ConsumeRecordsRequest, ConsumeRecordsResponse> consumeRecordsAsyncInvoker(
        ConsumeRecordsRequest request) {
        return new AsyncInvoker<ConsumeRecordsRequest, ConsumeRecordsResponse>(request, DisMeta.consumeRecords,
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
     * @return CompletableFuture<CreateObsTransferTaskResponse>
     */
    public CompletableFuture<CreateObsTransferTaskResponse> createObsTransferTaskAsync(
        CreateObsTransferTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, DisMeta.createObsTransferTask);
    }

    /**
     * 添加OBS转储任务
     *
     * 本接口用于添加OBS转储任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateObsTransferTaskRequest 请求对象
     * @return AsyncInvoker<CreateObsTransferTaskRequest, CreateObsTransferTaskResponse>
     */
    public AsyncInvoker<CreateObsTransferTaskRequest, CreateObsTransferTaskResponse> createObsTransferTaskAsyncInvoker(
        CreateObsTransferTaskRequest request) {
        return new AsyncInvoker<CreateObsTransferTaskRequest, CreateObsTransferTaskResponse>(request,
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
     * @return CompletableFuture<CreateStreamResponse>
     */
    public CompletableFuture<CreateStreamResponse> createStreamAsync(CreateStreamRequest request) {
        return hcClient.asyncInvokeHttp(request, DisMeta.createStream);
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
     * @return AsyncInvoker<CreateStreamRequest, CreateStreamResponse>
     */
    public AsyncInvoker<CreateStreamRequest, CreateStreamResponse> createStreamAsyncInvoker(
        CreateStreamRequest request) {
        return new AsyncInvoker<CreateStreamRequest, CreateStreamResponse>(request, DisMeta.createStream, hcClient);
    }

    /**
     * 给指定通道添加标签
     *
     * 本接口用于给指定通道添加标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateTagRequest 请求对象
     * @return CompletableFuture<CreateTagResponse>
     */
    public CompletableFuture<CreateTagResponse> createTagAsync(CreateTagRequest request) {
        return hcClient.asyncInvokeHttp(request, DisMeta.createTag);
    }

    /**
     * 给指定通道添加标签
     *
     * 本接口用于给指定通道添加标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateTagRequest 请求对象
     * @return AsyncInvoker<CreateTagRequest, CreateTagResponse>
     */
    public AsyncInvoker<CreateTagRequest, CreateTagResponse> createTagAsyncInvoker(CreateTagRequest request) {
        return new AsyncInvoker<CreateTagRequest, CreateTagResponse>(request, DisMeta.createTag, hcClient);
    }

    /**
     * 删除指定通道
     *
     * 本接口用于删除指定通道。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteStreamRequest 请求对象
     * @return CompletableFuture<DeleteStreamResponse>
     */
    public CompletableFuture<DeleteStreamResponse> deleteStreamAsync(DeleteStreamRequest request) {
        return hcClient.asyncInvokeHttp(request, DisMeta.deleteStream);
    }

    /**
     * 删除指定通道
     *
     * 本接口用于删除指定通道。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteStreamRequest 请求对象
     * @return AsyncInvoker<DeleteStreamRequest, DeleteStreamResponse>
     */
    public AsyncInvoker<DeleteStreamRequest, DeleteStreamResponse> deleteStreamAsyncInvoker(
        DeleteStreamRequest request) {
        return new AsyncInvoker<DeleteStreamRequest, DeleteStreamResponse>(request, DisMeta.deleteStream, hcClient);
    }

    /**
     * 删除指定通道的标签
     *
     * 该接口用于删除指定通道的标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteTagRequest 请求对象
     * @return CompletableFuture<DeleteTagResponse>
     */
    public CompletableFuture<DeleteTagResponse> deleteTagAsync(DeleteTagRequest request) {
        return hcClient.asyncInvokeHttp(request, DisMeta.deleteTag);
    }

    /**
     * 删除指定通道的标签
     *
     * 该接口用于删除指定通道的标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteTagRequest 请求对象
     * @return AsyncInvoker<DeleteTagRequest, DeleteTagResponse>
     */
    public AsyncInvoker<DeleteTagRequest, DeleteTagResponse> deleteTagAsyncInvoker(DeleteTagRequest request) {
        return new AsyncInvoker<DeleteTagRequest, DeleteTagResponse>(request, DisMeta.deleteTag, hcClient);
    }

    /**
     * 删除转储任务
     *
     * 该接口用于删除转储任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteTransferTaskRequest 请求对象
     * @return CompletableFuture<DeleteTransferTaskResponse>
     */
    public CompletableFuture<DeleteTransferTaskResponse> deleteTransferTaskAsync(DeleteTransferTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, DisMeta.deleteTransferTask);
    }

    /**
     * 删除转储任务
     *
     * 该接口用于删除转储任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteTransferTaskRequest 请求对象
     * @return AsyncInvoker<DeleteTransferTaskRequest, DeleteTransferTaskResponse>
     */
    public AsyncInvoker<DeleteTransferTaskRequest, DeleteTransferTaskResponse> deleteTransferTaskAsyncInvoker(
        DeleteTransferTaskRequest request) {
        return new AsyncInvoker<DeleteTransferTaskRequest, DeleteTransferTaskResponse>(request,
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
     * @return CompletableFuture<ListPoliciesResponse>
     */
    public CompletableFuture<ListPoliciesResponse> listPoliciesAsync(ListPoliciesRequest request) {
        return hcClient.asyncInvokeHttp(request, DisMeta.listPolicies);
    }

    /**
     * 查询权限策略列表
     *
     * 本接口用于查询指定通道的权限策略列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPoliciesRequest 请求对象
     * @return AsyncInvoker<ListPoliciesRequest, ListPoliciesResponse>
     */
    public AsyncInvoker<ListPoliciesRequest, ListPoliciesResponse> listPoliciesAsyncInvoker(
        ListPoliciesRequest request) {
        return new AsyncInvoker<ListPoliciesRequest, ListPoliciesResponse>(request, DisMeta.listPolicies, hcClient);
    }

    /**
     * 使用标签过滤资源（通道等）
     *
     * 该接口用于使用标签过滤资源（通道等）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListResourcesByTagsRequest 请求对象
     * @return CompletableFuture<ListResourcesByTagsResponse>
     */
    public CompletableFuture<ListResourcesByTagsResponse> listResourcesByTagsAsync(ListResourcesByTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, DisMeta.listResourcesByTags);
    }

    /**
     * 使用标签过滤资源（通道等）
     *
     * 该接口用于使用标签过滤资源（通道等）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListResourcesByTagsRequest 请求对象
     * @return AsyncInvoker<ListResourcesByTagsRequest, ListResourcesByTagsResponse>
     */
    public AsyncInvoker<ListResourcesByTagsRequest, ListResourcesByTagsResponse> listResourcesByTagsAsyncInvoker(
        ListResourcesByTagsRequest request) {
        return new AsyncInvoker<ListResourcesByTagsRequest, ListResourcesByTagsResponse>(request,
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
     * @return CompletableFuture<ListStreamsResponse>
     */
    public CompletableFuture<ListStreamsResponse> listStreamsAsync(ListStreamsRequest request) {
        return hcClient.asyncInvokeHttp(request, DisMeta.listStreams);
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
     * @return AsyncInvoker<ListStreamsRequest, ListStreamsResponse>
     */
    public AsyncInvoker<ListStreamsRequest, ListStreamsResponse> listStreamsAsyncInvoker(ListStreamsRequest request) {
        return new AsyncInvoker<ListStreamsRequest, ListStreamsResponse>(request, DisMeta.listStreams, hcClient);
    }

    /**
     * 查询指定区域所有标签集合
     *
     * 该接口用于查询指定区域所有标签集合。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTagsRequest 请求对象
     * @return CompletableFuture<ListTagsResponse>
     */
    public CompletableFuture<ListTagsResponse> listTagsAsync(ListTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, DisMeta.listTags);
    }

    /**
     * 查询指定区域所有标签集合
     *
     * 该接口用于查询指定区域所有标签集合。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTagsRequest 请求对象
     * @return AsyncInvoker<ListTagsRequest, ListTagsResponse>
     */
    public AsyncInvoker<ListTagsRequest, ListTagsResponse> listTagsAsyncInvoker(ListTagsRequest request) {
        return new AsyncInvoker<ListTagsRequest, ListTagsResponse>(request, DisMeta.listTags, hcClient);
    }

    /**
     * 查询转储任务列表
     *
     * 本接口用于查询转储任务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTransferTasksRequest 请求对象
     * @return CompletableFuture<ListTransferTasksResponse>
     */
    public CompletableFuture<ListTransferTasksResponse> listTransferTasksAsync(ListTransferTasksRequest request) {
        return hcClient.asyncInvokeHttp(request, DisMeta.listTransferTasks);
    }

    /**
     * 查询转储任务列表
     *
     * 本接口用于查询转储任务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTransferTasksRequest 请求对象
     * @return AsyncInvoker<ListTransferTasksRequest, ListTransferTasksResponse>
     */
    public AsyncInvoker<ListTransferTasksRequest, ListTransferTasksResponse> listTransferTasksAsyncInvoker(
        ListTransferTasksRequest request) {
        return new AsyncInvoker<ListTransferTasksRequest, ListTransferTasksResponse>(request, DisMeta.listTransferTasks,
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
     * @return CompletableFuture<SendRecordsResponse>
     */
    public CompletableFuture<SendRecordsResponse> sendRecordsAsync(SendRecordsRequest request) {
        return hcClient.asyncInvokeHttp(request, DisMeta.sendRecords);
    }

    /**
     * 上传数据
     *
     * 本接口用于上传数据到DIS通道中。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SendRecordsRequest 请求对象
     * @return AsyncInvoker<SendRecordsRequest, SendRecordsResponse>
     */
    public AsyncInvoker<SendRecordsRequest, SendRecordsResponse> sendRecordsAsyncInvoker(SendRecordsRequest request) {
        return new AsyncInvoker<SendRecordsRequest, SendRecordsResponse>(request, DisMeta.sendRecords, hcClient);
    }

    /**
     * 获取数据游标
     *
     * 本接口用于获取数据游标。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowCursorRequest 请求对象
     * @return CompletableFuture<ShowCursorResponse>
     */
    public CompletableFuture<ShowCursorResponse> showCursorAsync(ShowCursorRequest request) {
        return hcClient.asyncInvokeHttp(request, DisMeta.showCursor);
    }

    /**
     * 获取数据游标
     *
     * 本接口用于获取数据游标。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowCursorRequest 请求对象
     * @return AsyncInvoker<ShowCursorRequest, ShowCursorResponse>
     */
    public AsyncInvoker<ShowCursorRequest, ShowCursorResponse> showCursorAsyncInvoker(ShowCursorRequest request) {
        return new AsyncInvoker<ShowCursorRequest, ShowCursorResponse>(request, DisMeta.showCursor, hcClient);
    }

    /**
     * 查询分区监控
     *
     * 本接口用于查询通道指定分区的监控数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPartitionMetricsRequest 请求对象
     * @return CompletableFuture<ShowPartitionMetricsResponse>
     */
    public CompletableFuture<ShowPartitionMetricsResponse> showPartitionMetricsAsync(
        ShowPartitionMetricsRequest request) {
        return hcClient.asyncInvokeHttp(request, DisMeta.showPartitionMetrics);
    }

    /**
     * 查询分区监控
     *
     * 本接口用于查询通道指定分区的监控数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPartitionMetricsRequest 请求对象
     * @return AsyncInvoker<ShowPartitionMetricsRequest, ShowPartitionMetricsResponse>
     */
    public AsyncInvoker<ShowPartitionMetricsRequest, ShowPartitionMetricsResponse> showPartitionMetricsAsyncInvoker(
        ShowPartitionMetricsRequest request) {
        return new AsyncInvoker<ShowPartitionMetricsRequest, ShowPartitionMetricsResponse>(request,
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
     * @return CompletableFuture<ShowStreamResponse>
     */
    public CompletableFuture<ShowStreamResponse> showStreamAsync(ShowStreamRequest request) {
        return hcClient.asyncInvokeHttp(request, DisMeta.showStream);
    }

    /**
     * 查看通道详情
     *
     * 本接口用于查询指定通道的详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowStreamRequest 请求对象
     * @return AsyncInvoker<ShowStreamRequest, ShowStreamResponse>
     */
    public AsyncInvoker<ShowStreamRequest, ShowStreamResponse> showStreamAsyncInvoker(ShowStreamRequest request) {
        return new AsyncInvoker<ShowStreamRequest, ShowStreamResponse>(request, DisMeta.showStream, hcClient);
    }

    /**
     * 查询通道监控
     *
     * 本接口用于查询指定通道的监控数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowStreamMetricsRequest 请求对象
     * @return CompletableFuture<ShowStreamMetricsResponse>
     */
    public CompletableFuture<ShowStreamMetricsResponse> showStreamMetricsAsync(ShowStreamMetricsRequest request) {
        return hcClient.asyncInvokeHttp(request, DisMeta.showStreamMetrics);
    }

    /**
     * 查询通道监控
     *
     * 本接口用于查询指定通道的监控数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowStreamMetricsRequest 请求对象
     * @return AsyncInvoker<ShowStreamMetricsRequest, ShowStreamMetricsResponse>
     */
    public AsyncInvoker<ShowStreamMetricsRequest, ShowStreamMetricsResponse> showStreamMetricsAsyncInvoker(
        ShowStreamMetricsRequest request) {
        return new AsyncInvoker<ShowStreamMetricsRequest, ShowStreamMetricsResponse>(request, DisMeta.showStreamMetrics,
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
     * @return CompletableFuture<ShowStreamTagsResponse>
     */
    public CompletableFuture<ShowStreamTagsResponse> showStreamTagsAsync(ShowStreamTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, DisMeta.showStreamTags);
    }

    /**
     * 查询指定通道的标签信息
     *
     * 该接口用于查询指定通道的标签信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowStreamTagsRequest 请求对象
     * @return AsyncInvoker<ShowStreamTagsRequest, ShowStreamTagsResponse>
     */
    public AsyncInvoker<ShowStreamTagsRequest, ShowStreamTagsResponse> showStreamTagsAsyncInvoker(
        ShowStreamTagsRequest request) {
        return new AsyncInvoker<ShowStreamTagsRequest, ShowStreamTagsResponse>(request, DisMeta.showStreamTags,
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
     * @return CompletableFuture<ShowTransferTaskResponse>
     */
    public CompletableFuture<ShowTransferTaskResponse> showTransferTaskAsync(ShowTransferTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, DisMeta.showTransferTask);
    }

    /**
     * 查询转储任务详情
     *
     * 查询转储任务详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowTransferTaskRequest 请求对象
     * @return AsyncInvoker<ShowTransferTaskRequest, ShowTransferTaskResponse>
     */
    public AsyncInvoker<ShowTransferTaskRequest, ShowTransferTaskResponse> showTransferTaskAsyncInvoker(
        ShowTransferTaskRequest request) {
        return new AsyncInvoker<ShowTransferTaskRequest, ShowTransferTaskResponse>(request, DisMeta.showTransferTask,
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
     * @return CompletableFuture<UpdatePartitionCountResponse>
     */
    public CompletableFuture<UpdatePartitionCountResponse> updatePartitionCountAsync(
        UpdatePartitionCountRequest request) {
        return hcClient.asyncInvokeHttp(request, DisMeta.updatePartitionCount);
    }

    /**
     * 修改分区数量
     *
     * 本接口用于变更指定通道中的分区数量。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdatePartitionCountRequest 请求对象
     * @return AsyncInvoker<UpdatePartitionCountRequest, UpdatePartitionCountResponse>
     */
    public AsyncInvoker<UpdatePartitionCountRequest, UpdatePartitionCountResponse> updatePartitionCountAsyncInvoker(
        UpdatePartitionCountRequest request) {
        return new AsyncInvoker<UpdatePartitionCountRequest, UpdatePartitionCountResponse>(request,
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
     * @return CompletableFuture<UpdateStreamResponse>
     */
    public CompletableFuture<UpdateStreamResponse> updateStreamAsync(UpdateStreamRequest request) {
        return hcClient.asyncInvokeHttp(request, DisMeta.updateStream);
    }

    /**
     * 更新通道信息
     *
     * 本接口用于更新指定通道的通道信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateStreamRequest 请求对象
     * @return AsyncInvoker<UpdateStreamRequest, UpdateStreamResponse>
     */
    public AsyncInvoker<UpdateStreamRequest, UpdateStreamResponse> updateStreamAsyncInvoker(
        UpdateStreamRequest request) {
        return new AsyncInvoker<UpdateStreamRequest, UpdateStreamResponse>(request, DisMeta.updateStream, hcClient);
    }

    /**
     * 创建消费App
     *
     * 本接口用于创建消费APP。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateAppRequest 请求对象
     * @return CompletableFuture<CreateAppResponse>
     */
    public CompletableFuture<CreateAppResponse> createAppAsync(CreateAppRequest request) {
        return hcClient.asyncInvokeHttp(request, DisMeta.createApp);
    }

    /**
     * 创建消费App
     *
     * 本接口用于创建消费APP。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateAppRequest 请求对象
     * @return AsyncInvoker<CreateAppRequest, CreateAppResponse>
     */
    public AsyncInvoker<CreateAppRequest, CreateAppResponse> createAppAsyncInvoker(CreateAppRequest request) {
        return new AsyncInvoker<CreateAppRequest, CreateAppResponse>(request, DisMeta.createApp, hcClient);
    }

    /**
     * 删除App
     *
     * 本接口用于删除App。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteAppRequest 请求对象
     * @return CompletableFuture<DeleteAppResponse>
     */
    public CompletableFuture<DeleteAppResponse> deleteAppAsync(DeleteAppRequest request) {
        return hcClient.asyncInvokeHttp(request, DisMeta.deleteApp);
    }

    /**
     * 删除App
     *
     * 本接口用于删除App。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteAppRequest 请求对象
     * @return AsyncInvoker<DeleteAppRequest, DeleteAppResponse>
     */
    public AsyncInvoker<DeleteAppRequest, DeleteAppResponse> deleteAppAsyncInvoker(DeleteAppRequest request) {
        return new AsyncInvoker<DeleteAppRequest, DeleteAppResponse>(request, DisMeta.deleteApp, hcClient);
    }

    /**
     * 查询App列表
     *
     * 本接口用于查询APP列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAppRequest 请求对象
     * @return CompletableFuture<ListAppResponse>
     */
    public CompletableFuture<ListAppResponse> listAppAsync(ListAppRequest request) {
        return hcClient.asyncInvokeHttp(request, DisMeta.listApp);
    }

    /**
     * 查询App列表
     *
     * 本接口用于查询APP列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAppRequest 请求对象
     * @return AsyncInvoker<ListAppRequest, ListAppResponse>
     */
    public AsyncInvoker<ListAppRequest, ListAppResponse> listAppAsyncInvoker(ListAppRequest request) {
        return new AsyncInvoker<ListAppRequest, ListAppResponse>(request, DisMeta.listApp, hcClient);
    }

    /**
     * 查看App详情
     *
     * 本接口用于查询APP详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAppRequest 请求对象
     * @return CompletableFuture<ShowAppResponse>
     */
    public CompletableFuture<ShowAppResponse> showAppAsync(ShowAppRequest request) {
        return hcClient.asyncInvokeHttp(request, DisMeta.showApp);
    }

    /**
     * 查看App详情
     *
     * 本接口用于查询APP详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAppRequest 请求对象
     * @return AsyncInvoker<ShowAppRequest, ShowAppResponse>
     */
    public AsyncInvoker<ShowAppRequest, ShowAppResponse> showAppAsyncInvoker(ShowAppRequest request) {
        return new AsyncInvoker<ShowAppRequest, ShowAppResponse>(request, DisMeta.showApp, hcClient);
    }

    /**
     * 查看App消费状态
     *
     * 本接口用于查询APP消费状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowConsumerStateRequest 请求对象
     * @return CompletableFuture<ShowConsumerStateResponse>
     */
    public CompletableFuture<ShowConsumerStateResponse> showConsumerStateAsync(ShowConsumerStateRequest request) {
        return hcClient.asyncInvokeHttp(request, DisMeta.showConsumerState);
    }

    /**
     * 查看App消费状态
     *
     * 本接口用于查询APP消费状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowConsumerStateRequest 请求对象
     * @return AsyncInvoker<ShowConsumerStateRequest, ShowConsumerStateResponse>
     */
    public AsyncInvoker<ShowConsumerStateRequest, ShowConsumerStateResponse> showConsumerStateAsyncInvoker(
        ShowConsumerStateRequest request) {
        return new AsyncInvoker<ShowConsumerStateRequest, ShowConsumerStateResponse>(request, DisMeta.showConsumerState,
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
     * @return CompletableFuture<CommitCheckpointResponse>
     */
    public CompletableFuture<CommitCheckpointResponse> commitCheckpointAsync(CommitCheckpointRequest request) {
        return hcClient.asyncInvokeHttp(request, DisMeta.commitCheckpoint);
    }

    /**
     * 提交Checkpoint
     *
     * 本接口用于提交Checkpoint。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CommitCheckpointRequest 请求对象
     * @return AsyncInvoker<CommitCheckpointRequest, CommitCheckpointResponse>
     */
    public AsyncInvoker<CommitCheckpointRequest, CommitCheckpointResponse> commitCheckpointAsyncInvoker(
        CommitCheckpointRequest request) {
        return new AsyncInvoker<CommitCheckpointRequest, CommitCheckpointResponse>(request, DisMeta.commitCheckpoint,
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
     * @return CompletableFuture<DeleteCheckpointResponse>
     */
    public CompletableFuture<DeleteCheckpointResponse> deleteCheckpointAsync(DeleteCheckpointRequest request) {
        return hcClient.asyncInvokeHttp(request, DisMeta.deleteCheckpoint);
    }

    /**
     * 删除Checkpoint
     *
     * 本接口用于删除Checkpoint。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteCheckpointRequest 请求对象
     * @return AsyncInvoker<DeleteCheckpointRequest, DeleteCheckpointResponse>
     */
    public AsyncInvoker<DeleteCheckpointRequest, DeleteCheckpointResponse> deleteCheckpointAsyncInvoker(
        DeleteCheckpointRequest request) {
        return new AsyncInvoker<DeleteCheckpointRequest, DeleteCheckpointResponse>(request, DisMeta.deleteCheckpoint,
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
     * @return CompletableFuture<ShowCheckpointResponse>
     */
    public CompletableFuture<ShowCheckpointResponse> showCheckpointAsync(ShowCheckpointRequest request) {
        return hcClient.asyncInvokeHttp(request, DisMeta.showCheckpoint);
    }

    /**
     * 查询Checkpoint详情
     *
     * 本接口用于查询Checkpoint详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowCheckpointRequest 请求对象
     * @return AsyncInvoker<ShowCheckpointRequest, ShowCheckpointResponse>
     */
    public AsyncInvoker<ShowCheckpointRequest, ShowCheckpointResponse> showCheckpointAsyncInvoker(
        ShowCheckpointRequest request) {
        return new AsyncInvoker<ShowCheckpointRequest, ShowCheckpointResponse>(request, DisMeta.showCheckpoint,
            hcClient);
    }

}
