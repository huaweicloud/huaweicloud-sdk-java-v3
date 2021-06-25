package com.huaweicloud.sdk.lts.v2;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.lts.v2.model.*;

public class LtsAsyncClient {
    protected HcClient hcClient;

    public LtsAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<LtsAsyncClient> newBuilder() {
        return new ClientBuilder<>(LtsAsyncClient::new);
    }


    /**
     * 日志转储
     * 该接口用于将指定的一个或多个日志流的日志转储到OBS服务。
     *
     * @param CreateLogDumpObsRequest 请求对象
     * @return CompletableFuture<CreateLogDumpObsResponse>
     */
    public CompletableFuture<CreateLogDumpObsResponse> createLogDumpObsAsync(CreateLogDumpObsRequest request) {
        return hcClient.asyncInvokeHttp(request, LtsMeta.createLogDumpObs);
    }

    /**
     * 日志转储
     * 该接口用于将指定的一个或多个日志流的日志转储到OBS服务。
     *
     * @param CreateLogDumpObsRequest 请求对象
     * @return AsyncInvoker<CreateLogDumpObsRequest, CreateLogDumpObsResponse>
     */
    public AsyncInvoker<CreateLogDumpObsRequest, CreateLogDumpObsResponse> createLogDumpObsAsyncInvoker(CreateLogDumpObsRequest request) {
        return new AsyncInvoker<CreateLogDumpObsRequest, CreateLogDumpObsResponse>(request, LtsMeta.createLogDumpObs, hcClient);
    }

    /**
     * 创建日志组
     * 该接口用于创建一个日志组
     *
     * @param CreateLogGroupRequest 请求对象
     * @return CompletableFuture<CreateLogGroupResponse>
     */
    public CompletableFuture<CreateLogGroupResponse> createLogGroupAsync(CreateLogGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, LtsMeta.createLogGroup);
    }

    /**
     * 创建日志组
     * 该接口用于创建一个日志组
     *
     * @param CreateLogGroupRequest 请求对象
     * @return AsyncInvoker<CreateLogGroupRequest, CreateLogGroupResponse>
     */
    public AsyncInvoker<CreateLogGroupRequest, CreateLogGroupResponse> createLogGroupAsyncInvoker(CreateLogGroupRequest request) {
        return new AsyncInvoker<CreateLogGroupRequest, CreateLogGroupResponse>(request, LtsMeta.createLogGroup, hcClient);
    }

    /**
     * 创建日志流
     * 该接口用于创建某个指定日志组下的日志流
     *
     * @param CreateLogStreamRequest 请求对象
     * @return CompletableFuture<CreateLogStreamResponse>
     */
    public CompletableFuture<CreateLogStreamResponse> createLogStreamAsync(CreateLogStreamRequest request) {
        return hcClient.asyncInvokeHttp(request, LtsMeta.createLogStream);
    }

    /**
     * 创建日志流
     * 该接口用于创建某个指定日志组下的日志流
     *
     * @param CreateLogStreamRequest 请求对象
     * @return AsyncInvoker<CreateLogStreamRequest, CreateLogStreamResponse>
     */
    public AsyncInvoker<CreateLogStreamRequest, CreateLogStreamResponse> createLogStreamAsyncInvoker(CreateLogStreamRequest request) {
        return new AsyncInvoker<CreateLogStreamRequest, CreateLogStreamResponse>(request, LtsMeta.createLogStream, hcClient);
    }

    /**
     * 删除日志组
     * 该接口用于删除指定日志组。当日志组中的日志流配置了日志转储，需要取消日志转储后才可删除。
     *
     * @param DeleteLogGroupRequest 请求对象
     * @return CompletableFuture<DeleteLogGroupResponse>
     */
    public CompletableFuture<DeleteLogGroupResponse> deleteLogGroupAsync(DeleteLogGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, LtsMeta.deleteLogGroup);
    }

    /**
     * 删除日志组
     * 该接口用于删除指定日志组。当日志组中的日志流配置了日志转储，需要取消日志转储后才可删除。
     *
     * @param DeleteLogGroupRequest 请求对象
     * @return AsyncInvoker<DeleteLogGroupRequest, DeleteLogGroupResponse>
     */
    public AsyncInvoker<DeleteLogGroupRequest, DeleteLogGroupResponse> deleteLogGroupAsyncInvoker(DeleteLogGroupRequest request) {
        return new AsyncInvoker<DeleteLogGroupRequest, DeleteLogGroupResponse>(request, LtsMeta.deleteLogGroup, hcClient);
    }

    /**
     * 删除日志流
     * 该接口用于删除指定日志组下的指定日志流。当该日志流配置了日志转储，需要取消日志转储后才可删除。
     *
     * @param DeleteLogStreamRequest 请求对象
     * @return CompletableFuture<DeleteLogStreamResponse>
     */
    public CompletableFuture<DeleteLogStreamResponse> deleteLogStreamAsync(DeleteLogStreamRequest request) {
        return hcClient.asyncInvokeHttp(request, LtsMeta.deleteLogStream);
    }

    /**
     * 删除日志流
     * 该接口用于删除指定日志组下的指定日志流。当该日志流配置了日志转储，需要取消日志转储后才可删除。
     *
     * @param DeleteLogStreamRequest 请求对象
     * @return AsyncInvoker<DeleteLogStreamRequest, DeleteLogStreamResponse>
     */
    public AsyncInvoker<DeleteLogStreamRequest, DeleteLogStreamResponse> deleteLogStreamAsyncInvoker(DeleteLogStreamRequest request) {
        return new AsyncInvoker<DeleteLogStreamRequest, DeleteLogStreamResponse>(request, LtsMeta.deleteLogStream, hcClient);
    }

    /**
     * 关闭超额采集开关
     * 该接口用于将超额采集日志功能关闭。
     *
     * @param DisableLogCollectionRequest 请求对象
     * @return CompletableFuture<DisableLogCollectionResponse>
     */
    public CompletableFuture<DisableLogCollectionResponse> disableLogCollectionAsync(DisableLogCollectionRequest request) {
        return hcClient.asyncInvokeHttp(request, LtsMeta.disableLogCollection);
    }

    /**
     * 关闭超额采集开关
     * 该接口用于将超额采集日志功能关闭。
     *
     * @param DisableLogCollectionRequest 请求对象
     * @return AsyncInvoker<DisableLogCollectionRequest, DisableLogCollectionResponse>
     */
    public AsyncInvoker<DisableLogCollectionRequest, DisableLogCollectionResponse> disableLogCollectionAsyncInvoker(DisableLogCollectionRequest request) {
        return new AsyncInvoker<DisableLogCollectionRequest, DisableLogCollectionResponse>(request, LtsMeta.disableLogCollection, hcClient);
    }

    /**
     * 打开超额采集开关
     * 该接口用于将超额采集日志功能打开。
     *
     * @param EnableLogCollectionRequest 请求对象
     * @return CompletableFuture<EnableLogCollectionResponse>
     */
    public CompletableFuture<EnableLogCollectionResponse> enableLogCollectionAsync(EnableLogCollectionRequest request) {
        return hcClient.asyncInvokeHttp(request, LtsMeta.enableLogCollection);
    }

    /**
     * 打开超额采集开关
     * 该接口用于将超额采集日志功能打开。
     *
     * @param EnableLogCollectionRequest 请求对象
     * @return AsyncInvoker<EnableLogCollectionRequest, EnableLogCollectionResponse>
     */
    public AsyncInvoker<EnableLogCollectionRequest, EnableLogCollectionResponse> enableLogCollectionAsyncInvoker(EnableLogCollectionRequest request) {
        return new AsyncInvoker<EnableLogCollectionRequest, EnableLogCollectionResponse>(request, LtsMeta.enableLogCollection, hcClient);
    }

    /**
     * 查询账号下所有日志组
     * 该接口用于查询账号下所有日志组。
     *
     * @param ListLogGroupsRequest 请求对象
     * @return CompletableFuture<ListLogGroupsResponse>
     */
    public CompletableFuture<ListLogGroupsResponse> listLogGroupsAsync(ListLogGroupsRequest request) {
        return hcClient.asyncInvokeHttp(request, LtsMeta.listLogGroups);
    }

    /**
     * 查询账号下所有日志组
     * 该接口用于查询账号下所有日志组。
     *
     * @param ListLogGroupsRequest 请求对象
     * @return AsyncInvoker<ListLogGroupsRequest, ListLogGroupsResponse>
     */
    public AsyncInvoker<ListLogGroupsRequest, ListLogGroupsResponse> listLogGroupsAsyncInvoker(ListLogGroupsRequest request) {
        return new AsyncInvoker<ListLogGroupsRequest, ListLogGroupsResponse>(request, LtsMeta.listLogGroups, hcClient);
    }

    /**
     * 查询指定日志组下的所有日志流
     * 该接口用于查询指定日志组下的所有日志流信息。
     *
     * @param ListLogStreamRequest 请求对象
     * @return CompletableFuture<ListLogStreamResponse>
     */
    public CompletableFuture<ListLogStreamResponse> listLogStreamAsync(ListLogStreamRequest request) {
        return hcClient.asyncInvokeHttp(request, LtsMeta.listLogStream);
    }

    /**
     * 查询指定日志组下的所有日志流
     * 该接口用于查询指定日志组下的所有日志流信息。
     *
     * @param ListLogStreamRequest 请求对象
     * @return AsyncInvoker<ListLogStreamRequest, ListLogStreamResponse>
     */
    public AsyncInvoker<ListLogStreamRequest, ListLogStreamResponse> listLogStreamAsyncInvoker(ListLogStreamRequest request) {
        return new AsyncInvoker<ListLogStreamRequest, ListLogStreamResponse>(request, LtsMeta.listLogStream, hcClient);
    }

    /**
     * 查询日志
     * 该接口用于查询指定日志流下的日志内容。
     *
     * @param UpdateLogContentsRequest 请求对象
     * @return CompletableFuture<UpdateLogContentsResponse>
     */
    public CompletableFuture<UpdateLogContentsResponse> updateLogContentsAsync(UpdateLogContentsRequest request) {
        return hcClient.asyncInvokeHttp(request, LtsMeta.updateLogContents);
    }

    /**
     * 查询日志
     * 该接口用于查询指定日志流下的日志内容。
     *
     * @param UpdateLogContentsRequest 请求对象
     * @return AsyncInvoker<UpdateLogContentsRequest, UpdateLogContentsResponse>
     */
    public AsyncInvoker<UpdateLogContentsRequest, UpdateLogContentsResponse> updateLogContentsAsyncInvoker(UpdateLogContentsRequest request) {
        return new AsyncInvoker<UpdateLogContentsRequest, UpdateLogContentsResponse>(request, LtsMeta.updateLogContents, hcClient);
    }

    /**
     * 查询结构化日志
     * 该接口用于查询指定日志流下的结构化日志内容。
     *
     * @param UpdateLogContents2Request 请求对象
     * @return CompletableFuture<UpdateLogContents2Response>
     */
    public CompletableFuture<UpdateLogContents2Response> updateLogContents2Async(UpdateLogContents2Request request) {
        return hcClient.asyncInvokeHttp(request, LtsMeta.updateLogContents2);
    }

    /**
     * 查询结构化日志
     * 该接口用于查询指定日志流下的结构化日志内容。
     *
     * @param UpdateLogContents2Request 请求对象
     * @return AsyncInvoker<UpdateLogContents2Request, UpdateLogContents2Response>
     */
    public AsyncInvoker<UpdateLogContents2Request, UpdateLogContents2Response> updateLogContents2AsyncInvoker(UpdateLogContents2Request request) {
        return new AsyncInvoker<UpdateLogContents2Request, UpdateLogContents2Response>(request, LtsMeta.updateLogContents2, hcClient);
    }

    /**
     * 查询结构化日志（新版）
     * 该接口用于查询指定日志流下的结构化日志内容（新版）。
     *
     * @param UpdateLogContents3Request 请求对象
     * @return CompletableFuture<UpdateLogContents3Response>
     */
    public CompletableFuture<UpdateLogContents3Response> updateLogContents3Async(UpdateLogContents3Request request) {
        return hcClient.asyncInvokeHttp(request, LtsMeta.updateLogContents3);
    }

    /**
     * 查询结构化日志（新版）
     * 该接口用于查询指定日志流下的结构化日志内容（新版）。
     *
     * @param UpdateLogContents3Request 请求对象
     * @return AsyncInvoker<UpdateLogContents3Request, UpdateLogContents3Response>
     */
    public AsyncInvoker<UpdateLogContents3Request, UpdateLogContents3Response> updateLogContents3AsyncInvoker(UpdateLogContents3Request request) {
        return new AsyncInvoker<UpdateLogContents3Request, UpdateLogContents3Response>(request, LtsMeta.updateLogContents3, hcClient);
    }

    /**
     * 修改日志组
     * 该接口用于修改指定日志组下的日志存储时长。
     *
     * @param UpdateLogGroupRequest 请求对象
     * @return CompletableFuture<UpdateLogGroupResponse>
     */
    public CompletableFuture<UpdateLogGroupResponse> updateLogGroupAsync(UpdateLogGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, LtsMeta.updateLogGroup);
    }

    /**
     * 修改日志组
     * 该接口用于修改指定日志组下的日志存储时长。
     *
     * @param UpdateLogGroupRequest 请求对象
     * @return AsyncInvoker<UpdateLogGroupRequest, UpdateLogGroupResponse>
     */
    public AsyncInvoker<UpdateLogGroupRequest, UpdateLogGroupResponse> updateLogGroupAsyncInvoker(UpdateLogGroupRequest request) {
        return new AsyncInvoker<UpdateLogGroupRequest, UpdateLogGroupResponse>(request, LtsMeta.updateLogGroup, hcClient);
    }

}