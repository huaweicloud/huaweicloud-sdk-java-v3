package com.huaweicloud.sdk.dli.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.dli.v1.model.*;

import java.util.concurrent.CompletableFuture;

public class DliAsyncClient {

    protected HcClient hcClient;

    public DliAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<DliAsyncClient> newBuilder() {
        return new ClientBuilder<>(DliAsyncClient::new);
    }

    /**
     * 新建模板
     *
     * 在DLI服务中新建一个用户模板，最多100个。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateFlinkTemplateRequest 请求对象
     * @return CompletableFuture<CreateFlinkTemplateResponse>
     */
    public CompletableFuture<CreateFlinkTemplateResponse> createFlinkTemplateAsync(CreateFlinkTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.createFlinkTemplate);
    }

    /**
     * 新建模板
     *
     * 在DLI服务中新建一个用户模板，最多100个。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateFlinkTemplateRequest 请求对象
     * @return AsyncInvoker<CreateFlinkTemplateRequest, CreateFlinkTemplateResponse>
     */
    public AsyncInvoker<CreateFlinkTemplateRequest, CreateFlinkTemplateResponse> createFlinkTemplateAsyncInvoker(
        CreateFlinkTemplateRequest request) {
        return new AsyncInvoker<CreateFlinkTemplateRequest, CreateFlinkTemplateResponse>(request,
            DliMeta.createFlinkTemplate, hcClient);
    }

    /**
     * 创建DLI全局变量
     *
     * 创建全局变量。全局变量用于替换SQL作业中的敏感数据。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateGlobleValueRequest 请求对象
     * @return CompletableFuture<CreateGlobleValueResponse>
     */
    public CompletableFuture<CreateGlobleValueResponse> createGlobleValueAsync(CreateGlobleValueRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.createGlobleValue);
    }

    /**
     * 创建DLI全局变量
     *
     * 创建全局变量。全局变量用于替换SQL作业中的敏感数据。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateGlobleValueRequest 请求对象
     * @return AsyncInvoker<CreateGlobleValueRequest, CreateGlobleValueResponse>
     */
    public AsyncInvoker<CreateGlobleValueRequest, CreateGlobleValueResponse> createGlobleValueAsyncInvoker(
        CreateGlobleValueRequest request) {
        return new AsyncInvoker<CreateGlobleValueRequest, CreateGlobleValueResponse>(request, DliMeta.createGlobleValue,
            hcClient);
    }

    /**
     * 删除模板
     *
     * 删除一个模板，即使当前模板正在被作业使用，也允许删除。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteFlinkTemplateRequest 请求对象
     * @return CompletableFuture<DeleteFlinkTemplateResponse>
     */
    public CompletableFuture<DeleteFlinkTemplateResponse> deleteFlinkTemplateAsync(DeleteFlinkTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.deleteFlinkTemplate);
    }

    /**
     * 删除模板
     *
     * 删除一个模板，即使当前模板正在被作业使用，也允许删除。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteFlinkTemplateRequest 请求对象
     * @return AsyncInvoker<DeleteFlinkTemplateRequest, DeleteFlinkTemplateResponse>
     */
    public AsyncInvoker<DeleteFlinkTemplateRequest, DeleteFlinkTemplateResponse> deleteFlinkTemplateAsyncInvoker(
        DeleteFlinkTemplateRequest request) {
        return new AsyncInvoker<DeleteFlinkTemplateRequest, DeleteFlinkTemplateResponse>(request,
            DliMeta.deleteFlinkTemplate, hcClient);
    }

    /**
     * 删除DLI全局变量
     *
     * 删除全局变量。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteGlobalValueRequest 请求对象
     * @return CompletableFuture<DeleteGlobalValueResponse>
     */
    public CompletableFuture<DeleteGlobalValueResponse> deleteGlobalValueAsync(DeleteGlobalValueRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.deleteGlobalValue);
    }

    /**
     * 删除DLI全局变量
     *
     * 删除全局变量。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteGlobalValueRequest 请求对象
     * @return AsyncInvoker<DeleteGlobalValueRequest, DeleteGlobalValueResponse>
     */
    public AsyncInvoker<DeleteGlobalValueRequest, DeleteGlobalValueResponse> deleteGlobalValueAsyncInvoker(
        DeleteGlobalValueRequest request) {
        return new AsyncInvoker<DeleteGlobalValueRequest, DeleteGlobalValueResponse>(request, DliMeta.deleteGlobalValue,
            hcClient);
    }

    /**
     * 查询模板列表
     *
     * 查询作业模板列表。当前只支持查询用户自定义模板。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListFlinkTemplatesRequest 请求对象
     * @return CompletableFuture<ListFlinkTemplatesResponse>
     */
    public CompletableFuture<ListFlinkTemplatesResponse> listFlinkTemplatesAsync(ListFlinkTemplatesRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.listFlinkTemplates);
    }

    /**
     * 查询模板列表
     *
     * 查询作业模板列表。当前只支持查询用户自定义模板。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListFlinkTemplatesRequest 请求对象
     * @return AsyncInvoker<ListFlinkTemplatesRequest, ListFlinkTemplatesResponse>
     */
    public AsyncInvoker<ListFlinkTemplatesRequest, ListFlinkTemplatesResponse> listFlinkTemplatesAsyncInvoker(
        ListFlinkTemplatesRequest request) {
        return new AsyncInvoker<ListFlinkTemplatesRequest, ListFlinkTemplatesResponse>(request,
            DliMeta.listFlinkTemplates, hcClient);
    }

    /**
     * 查询DLI全局变量列表
     *
     * 查询全局变量列表。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListGlobalValuesRequest 请求对象
     * @return CompletableFuture<ListGlobalValuesResponse>
     */
    public CompletableFuture<ListGlobalValuesResponse> listGlobalValuesAsync(ListGlobalValuesRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.listGlobalValues);
    }

    /**
     * 查询DLI全局变量列表
     *
     * 查询全局变量列表。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListGlobalValuesRequest 请求对象
     * @return AsyncInvoker<ListGlobalValuesRequest, ListGlobalValuesResponse>
     */
    public AsyncInvoker<ListGlobalValuesRequest, ListGlobalValuesResponse> listGlobalValuesAsyncInvoker(
        ListGlobalValuesRequest request) {
        return new AsyncInvoker<ListGlobalValuesRequest, ListGlobalValuesResponse>(request, DliMeta.listGlobalValues,
            hcClient);
    }

    /**
     * 更新模板
     *
     * 对DLI服务中已有的模板进行更新。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateFlinkTemplateRequest 请求对象
     * @return CompletableFuture<UpdateFlinkTemplateResponse>
     */
    public CompletableFuture<UpdateFlinkTemplateResponse> updateFlinkTemplateAsync(UpdateFlinkTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.updateFlinkTemplate);
    }

    /**
     * 更新模板
     *
     * 对DLI服务中已有的模板进行更新。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateFlinkTemplateRequest 请求对象
     * @return AsyncInvoker<UpdateFlinkTemplateRequest, UpdateFlinkTemplateResponse>
     */
    public AsyncInvoker<UpdateFlinkTemplateRequest, UpdateFlinkTemplateResponse> updateFlinkTemplateAsyncInvoker(
        UpdateFlinkTemplateRequest request) {
        return new AsyncInvoker<UpdateFlinkTemplateRequest, UpdateFlinkTemplateResponse>(request,
            DliMeta.updateFlinkTemplate, hcClient);
    }

    /**
     * 修改DLI全局变量
     *
     * 修改全局变量。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateGlobalValueRequest 请求对象
     * @return CompletableFuture<UpdateGlobalValueResponse>
     */
    public CompletableFuture<UpdateGlobalValueResponse> updateGlobalValueAsync(UpdateGlobalValueRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.updateGlobalValue);
    }

    /**
     * 修改DLI全局变量
     *
     * 修改全局变量。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateGlobalValueRequest 请求对象
     * @return AsyncInvoker<UpdateGlobalValueRequest, UpdateGlobalValueResponse>
     */
    public AsyncInvoker<UpdateGlobalValueRequest, UpdateGlobalValueResponse> updateGlobalValueAsyncInvoker(
        UpdateGlobalValueRequest request) {
        return new AsyncInvoker<UpdateGlobalValueRequest, UpdateGlobalValueResponse>(request, DliMeta.updateGlobalValue,
            hcClient);
    }

    /**
     * 绑定队列
     *
     * 该API用于在已创建的增强型跨源中绑定队列。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param AssociateConnectionQueueRequest 请求对象
     * @return CompletableFuture<AssociateConnectionQueueResponse>
     */
    public CompletableFuture<AssociateConnectionQueueResponse> associateConnectionQueueAsync(
        AssociateConnectionQueueRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.associateConnectionQueue);
    }

    /**
     * 绑定队列
     *
     * 该API用于在已创建的增强型跨源中绑定队列。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param AssociateConnectionQueueRequest 请求对象
     * @return AsyncInvoker<AssociateConnectionQueueRequest, AssociateConnectionQueueResponse>
     */
    public AsyncInvoker<AssociateConnectionQueueRequest, AssociateConnectionQueueResponse> associateConnectionQueueAsyncInvoker(
        AssociateConnectionQueueRequest request) {
        return new AsyncInvoker<AssociateConnectionQueueRequest, AssociateConnectionQueueResponse>(request,
            DliMeta.associateConnectionQueue, hcClient);
    }

    /**
     * 边缘Flink作业状态信息上报
     *
     * 该API用于处理边缘Flink作业状态上报信息
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ChangeFlinkJobStatusReportRequest 请求对象
     * @return CompletableFuture<ChangeFlinkJobStatusReportResponse>
     */
    public CompletableFuture<ChangeFlinkJobStatusReportResponse> changeFlinkJobStatusReportAsync(
        ChangeFlinkJobStatusReportRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.changeFlinkJobStatusReport);
    }

    /**
     * 边缘Flink作业状态信息上报
     *
     * 该API用于处理边缘Flink作业状态上报信息
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ChangeFlinkJobStatusReportRequest 请求对象
     * @return AsyncInvoker<ChangeFlinkJobStatusReportRequest, ChangeFlinkJobStatusReportResponse>
     */
    public AsyncInvoker<ChangeFlinkJobStatusReportRequest, ChangeFlinkJobStatusReportResponse> changeFlinkJobStatusReportAsyncInvoker(
        ChangeFlinkJobStatusReportRequest request) {
        return new AsyncInvoker<ChangeFlinkJobStatusReportRequest, ChangeFlinkJobStatusReportResponse>(request,
            DliMeta.changeFlinkJobStatusReport, hcClient);
    }

    /**
     * 创建经典型跨源连接
     *
     * 该API用于创建与其他服务的经典型跨源连接。
     * 说明： 
     * 如果需要了解Console界面的使用方法，可参考经典型跨源连接。
     * 系统default队列不支持创建跨源连接。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateDatasourceConnectionRequest 请求对象
     * @return CompletableFuture<CreateDatasourceConnectionResponse>
     */
    public CompletableFuture<CreateDatasourceConnectionResponse> createDatasourceConnectionAsync(
        CreateDatasourceConnectionRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.createDatasourceConnection);
    }

    /**
     * 创建经典型跨源连接
     *
     * 该API用于创建与其他服务的经典型跨源连接。
     * 说明： 
     * 如果需要了解Console界面的使用方法，可参考经典型跨源连接。
     * 系统default队列不支持创建跨源连接。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateDatasourceConnectionRequest 请求对象
     * @return AsyncInvoker<CreateDatasourceConnectionRequest, CreateDatasourceConnectionResponse>
     */
    public AsyncInvoker<CreateDatasourceConnectionRequest, CreateDatasourceConnectionResponse> createDatasourceConnectionAsyncInvoker(
        CreateDatasourceConnectionRequest request) {
        return new AsyncInvoker<CreateDatasourceConnectionRequest, CreateDatasourceConnectionResponse>(request,
            DliMeta.createDatasourceConnection, hcClient);
    }

    /**
     * 创建增强型跨源连接
     *
     * 该API用于创建与其他服务的增强型跨源连接。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateEnhancedConnectionRequest 请求对象
     * @return CompletableFuture<CreateEnhancedConnectionResponse>
     */
    public CompletableFuture<CreateEnhancedConnectionResponse> createEnhancedConnectionAsync(
        CreateEnhancedConnectionRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.createEnhancedConnection);
    }

    /**
     * 创建增强型跨源连接
     *
     * 该API用于创建与其他服务的增强型跨源连接。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateEnhancedConnectionRequest 请求对象
     * @return AsyncInvoker<CreateEnhancedConnectionRequest, CreateEnhancedConnectionResponse>
     */
    public AsyncInvoker<CreateEnhancedConnectionRequest, CreateEnhancedConnectionResponse> createEnhancedConnectionAsyncInvoker(
        CreateEnhancedConnectionRequest request) {
        return new AsyncInvoker<CreateEnhancedConnectionRequest, CreateEnhancedConnectionResponse>(request,
            DliMeta.createEnhancedConnection, hcClient);
    }

    /**
     * 新建Flink Jar作业
     *
     * 用户自定义作业目前支持jar格式，运行在独享集群中。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateFlinkJarRequest 请求对象
     * @return CompletableFuture<CreateFlinkJarResponse>
     */
    public CompletableFuture<CreateFlinkJarResponse> createFlinkJarAsync(CreateFlinkJarRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.createFlinkJar);
    }

    /**
     * 新建Flink Jar作业
     *
     * 用户自定义作业目前支持jar格式，运行在独享集群中。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateFlinkJarRequest 请求对象
     * @return AsyncInvoker<CreateFlinkJarRequest, CreateFlinkJarResponse>
     */
    public AsyncInvoker<CreateFlinkJarRequest, CreateFlinkJarResponse> createFlinkJarAsyncInvoker(
        CreateFlinkJarRequest request) {
        return new AsyncInvoker<CreateFlinkJarRequest, CreateFlinkJarResponse>(request, DliMeta.createFlinkJar,
            hcClient);
    }

    /**
     * 新建SQL作业
     *
     * 通过POST方式，提交流式SQL作业，请求体为JSON格式。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateFlinkSqlRequest 请求对象
     * @return CompletableFuture<CreateFlinkSqlResponse>
     */
    public CompletableFuture<CreateFlinkSqlResponse> createFlinkSqlAsync(CreateFlinkSqlRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.createFlinkSql);
    }

    /**
     * 新建SQL作业
     *
     * 通过POST方式，提交流式SQL作业，请求体为JSON格式。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateFlinkSqlRequest 请求对象
     * @return AsyncInvoker<CreateFlinkSqlRequest, CreateFlinkSqlResponse>
     */
    public AsyncInvoker<CreateFlinkSqlRequest, CreateFlinkSqlResponse> createFlinkSqlAsyncInvoker(
        CreateFlinkSqlRequest request) {
        return new AsyncInvoker<CreateFlinkSqlRequest, CreateFlinkSqlResponse>(request, DliMeta.createFlinkSql,
            hcClient);
    }

    /**
     * 创建IEF消息通道
     *
     * 该API用于创建IEF消息通道
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateIefMessageChannelRequest 请求对象
     * @return CompletableFuture<CreateIefMessageChannelResponse>
     */
    public CompletableFuture<CreateIefMessageChannelResponse> createIefMessageChannelAsync(
        CreateIefMessageChannelRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.createIefMessageChannel);
    }

    /**
     * 创建IEF消息通道
     *
     * 该API用于创建IEF消息通道
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateIefMessageChannelRequest 请求对象
     * @return AsyncInvoker<CreateIefMessageChannelRequest, CreateIefMessageChannelResponse>
     */
    public AsyncInvoker<CreateIefMessageChannelRequest, CreateIefMessageChannelResponse> createIefMessageChannelAsyncInvoker(
        CreateIefMessageChannelRequest request) {
        return new AsyncInvoker<CreateIefMessageChannelRequest, CreateIefMessageChannelResponse>(request,
            DliMeta.createIefMessageChannel, hcClient);
    }

    /**
     * IEF系统事件上报
     *
     * 该API用于处理IEF系统事件上报
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateIefSystemEventsRequest 请求对象
     * @return CompletableFuture<CreateIefSystemEventsResponse>
     */
    public CompletableFuture<CreateIefSystemEventsResponse> createIefSystemEventsAsync(
        CreateIefSystemEventsRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.createIefSystemEvents);
    }

    /**
     * IEF系统事件上报
     *
     * 该API用于处理IEF系统事件上报
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateIefSystemEventsRequest 请求对象
     * @return AsyncInvoker<CreateIefSystemEventsRequest, CreateIefSystemEventsResponse>
     */
    public AsyncInvoker<CreateIefSystemEventsRequest, CreateIefSystemEventsResponse> createIefSystemEventsAsyncInvoker(
        CreateIefSystemEventsRequest request) {
        return new AsyncInvoker<CreateIefSystemEventsRequest, CreateIefSystemEventsResponse>(request,
            DliMeta.createIefSystemEvents, hcClient);
    }

    /**
     * 生成flink SQL作业的静态流图
     *
     * 生成flink SQL作业的静态流图
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateStreamGraphRequest 请求对象
     * @return CompletableFuture<CreateStreamGraphResponse>
     */
    public CompletableFuture<CreateStreamGraphResponse> createStreamGraphAsync(CreateStreamGraphRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.createStreamGraph);
    }

    /**
     * 生成flink SQL作业的静态流图
     *
     * 生成flink SQL作业的静态流图
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateStreamGraphRequest 请求对象
     * @return AsyncInvoker<CreateStreamGraphRequest, CreateStreamGraphResponse>
     */
    public AsyncInvoker<CreateStreamGraphRequest, CreateStreamGraphResponse> createStreamGraphAsyncInvoker(
        CreateStreamGraphRequest request) {
        return new AsyncInvoker<CreateStreamGraphRequest, CreateStreamGraphResponse>(request, DliMeta.createStreamGraph,
            hcClient);
    }

    /**
     * 批量删除作业
     *
     * 批量删除任何状态的作业。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteBatchFlinkJobRequest 请求对象
     * @return CompletableFuture<DeleteBatchFlinkJobResponse>
     */
    public CompletableFuture<DeleteBatchFlinkJobResponse> deleteBatchFlinkJobAsync(DeleteBatchFlinkJobRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.deleteBatchFlinkJob);
    }

    /**
     * 批量删除作业
     *
     * 批量删除任何状态的作业。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteBatchFlinkJobRequest 请求对象
     * @return AsyncInvoker<DeleteBatchFlinkJobRequest, DeleteBatchFlinkJobResponse>
     */
    public AsyncInvoker<DeleteBatchFlinkJobRequest, DeleteBatchFlinkJobResponse> deleteBatchFlinkJobAsyncInvoker(
        DeleteBatchFlinkJobRequest request) {
        return new AsyncInvoker<DeleteBatchFlinkJobRequest, DeleteBatchFlinkJobResponse>(request,
            DliMeta.deleteBatchFlinkJob, hcClient);
    }

    /**
     * 删除经典型跨源连接
     *
     * 该API用于删除已创建的经典型跨源连接。
     * 说明： 
     * 创建中的连接，无法删除。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteDatasourceConnectionRequest 请求对象
     * @return CompletableFuture<DeleteDatasourceConnectionResponse>
     */
    public CompletableFuture<DeleteDatasourceConnectionResponse> deleteDatasourceConnectionAsync(
        DeleteDatasourceConnectionRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.deleteDatasourceConnection);
    }

    /**
     * 删除经典型跨源连接
     *
     * 该API用于删除已创建的经典型跨源连接。
     * 说明： 
     * 创建中的连接，无法删除。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteDatasourceConnectionRequest 请求对象
     * @return AsyncInvoker<DeleteDatasourceConnectionRequest, DeleteDatasourceConnectionResponse>
     */
    public AsyncInvoker<DeleteDatasourceConnectionRequest, DeleteDatasourceConnectionResponse> deleteDatasourceConnectionAsyncInvoker(
        DeleteDatasourceConnectionRequest request) {
        return new AsyncInvoker<DeleteDatasourceConnectionRequest, DeleteDatasourceConnectionResponse>(request,
            DliMeta.deleteDatasourceConnection, hcClient);
    }

    /**
     * 删除增强型跨源连接
     *
     * 该API用于删除已创建的增强型跨源连接。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteEnhancedConnectionRequest 请求对象
     * @return CompletableFuture<DeleteEnhancedConnectionResponse>
     */
    public CompletableFuture<DeleteEnhancedConnectionResponse> deleteEnhancedConnectionAsync(
        DeleteEnhancedConnectionRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.deleteEnhancedConnection);
    }

    /**
     * 删除增强型跨源连接
     *
     * 该API用于删除已创建的增强型跨源连接。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteEnhancedConnectionRequest 请求对象
     * @return AsyncInvoker<DeleteEnhancedConnectionRequest, DeleteEnhancedConnectionResponse>
     */
    public AsyncInvoker<DeleteEnhancedConnectionRequest, DeleteEnhancedConnectionResponse> deleteEnhancedConnectionAsyncInvoker(
        DeleteEnhancedConnectionRequest request) {
        return new AsyncInvoker<DeleteEnhancedConnectionRequest, DeleteEnhancedConnectionResponse>(request,
            DliMeta.deleteEnhancedConnection, hcClient);
    }

    /**
     * 删除作业
     *
     * 删除任何状态的作业。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteFlinkRequest 请求对象
     * @return CompletableFuture<DeleteFlinkResponse>
     */
    public CompletableFuture<DeleteFlinkResponse> deleteFlinkAsync(DeleteFlinkRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.deleteFlink);
    }

    /**
     * 删除作业
     *
     * 删除任何状态的作业。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteFlinkRequest 请求对象
     * @return AsyncInvoker<DeleteFlinkRequest, DeleteFlinkResponse>
     */
    public AsyncInvoker<DeleteFlinkRequest, DeleteFlinkResponse> deleteFlinkAsyncInvoker(DeleteFlinkRequest request) {
        return new AsyncInvoker<DeleteFlinkRequest, DeleteFlinkResponse>(request, DliMeta.deleteFlink, hcClient);
    }

    /**
     * 解绑队列
     *
     * 该API用于在增强型跨源中解绑已绑定的队列。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DisassociateConnectionQueueRequest 请求对象
     * @return CompletableFuture<DisassociateConnectionQueueResponse>
     */
    public CompletableFuture<DisassociateConnectionQueueResponse> disassociateConnectionQueueAsync(
        DisassociateConnectionQueueRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.disassociateConnectionQueue);
    }

    /**
     * 解绑队列
     *
     * 该API用于在增强型跨源中解绑已绑定的队列。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DisassociateConnectionQueueRequest 请求对象
     * @return AsyncInvoker<DisassociateConnectionQueueRequest, DisassociateConnectionQueueResponse>
     */
    public AsyncInvoker<DisassociateConnectionQueueRequest, DisassociateConnectionQueueResponse> disassociateConnectionQueueAsyncInvoker(
        DisassociateConnectionQueueRequest request) {
        return new AsyncInvoker<DisassociateConnectionQueueRequest, DisassociateConnectionQueueResponse>(request,
            DliMeta.disassociateConnectionQueue, hcClient);
    }

    /**
     * 流作业导出
     *
     * 通过POST方式，导出流作业，请求体为JSON格式。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ExportFlinkJobRequest 请求对象
     * @return CompletableFuture<ExportFlinkJobResponse>
     */
    public CompletableFuture<ExportFlinkJobResponse> exportFlinkJobAsync(ExportFlinkJobRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.exportFlinkJob);
    }

    /**
     * 流作业导出
     *
     * 通过POST方式，导出流作业，请求体为JSON格式。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ExportFlinkJobRequest 请求对象
     * @return AsyncInvoker<ExportFlinkJobRequest, ExportFlinkJobResponse>
     */
    public AsyncInvoker<ExportFlinkJobRequest, ExportFlinkJobResponse> exportFlinkJobAsyncInvoker(
        ExportFlinkJobRequest request) {
        return new AsyncInvoker<ExportFlinkJobRequest, ExportFlinkJobResponse>(request, DliMeta.exportFlinkJob,
            hcClient);
    }

    /**
     * 流作业导入
     *
     * 通过POST方式，导入流作业，请求体为JSON格式。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ImportFlinkJobRequest 请求对象
     * @return CompletableFuture<ImportFlinkJobResponse>
     */
    public CompletableFuture<ImportFlinkJobResponse> importFlinkJobAsync(ImportFlinkJobRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.importFlinkJob);
    }

    /**
     * 流作业导入
     *
     * 通过POST方式，导入流作业，请求体为JSON格式。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ImportFlinkJobRequest 请求对象
     * @return AsyncInvoker<ImportFlinkJobRequest, ImportFlinkJobResponse>
     */
    public AsyncInvoker<ImportFlinkJobRequest, ImportFlinkJobResponse> importFlinkJobAsyncInvoker(
        ImportFlinkJobRequest request) {
        return new AsyncInvoker<ImportFlinkJobRequest, ImportFlinkJobResponse>(request, DliMeta.importFlinkJob,
            hcClient);
    }

    /**
     * 查询经典型跨源连接列表
     *
     * 该API用于查询该用户已创建的经典型跨源连接列表。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListDatasourceConnectionsRequest 请求对象
     * @return CompletableFuture<ListDatasourceConnectionsResponse>
     */
    public CompletableFuture<ListDatasourceConnectionsResponse> listDatasourceConnectionsAsync(
        ListDatasourceConnectionsRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.listDatasourceConnections);
    }

    /**
     * 查询经典型跨源连接列表
     *
     * 该API用于查询该用户已创建的经典型跨源连接列表。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListDatasourceConnectionsRequest 请求对象
     * @return AsyncInvoker<ListDatasourceConnectionsRequest, ListDatasourceConnectionsResponse>
     */
    public AsyncInvoker<ListDatasourceConnectionsRequest, ListDatasourceConnectionsResponse> listDatasourceConnectionsAsyncInvoker(
        ListDatasourceConnectionsRequest request) {
        return new AsyncInvoker<ListDatasourceConnectionsRequest, ListDatasourceConnectionsResponse>(request,
            DliMeta.listDatasourceConnections, hcClient);
    }

    /**
     * 查询增强型跨源连接列表
     *
     * 该API用于查询该用户已创建的增强型跨源连接列表。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListEnhancedConnectionsRequest 请求对象
     * @return CompletableFuture<ListEnhancedConnectionsResponse>
     */
    public CompletableFuture<ListEnhancedConnectionsResponse> listEnhancedConnectionsAsync(
        ListEnhancedConnectionsRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.listEnhancedConnections);
    }

    /**
     * 查询增强型跨源连接列表
     *
     * 该API用于查询该用户已创建的增强型跨源连接列表。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListEnhancedConnectionsRequest 请求对象
     * @return AsyncInvoker<ListEnhancedConnectionsRequest, ListEnhancedConnectionsResponse>
     */
    public AsyncInvoker<ListEnhancedConnectionsRequest, ListEnhancedConnectionsResponse> listEnhancedConnectionsAsyncInvoker(
        ListEnhancedConnectionsRequest request) {
        return new AsyncInvoker<ListEnhancedConnectionsRequest, ListEnhancedConnectionsResponse>(request,
            DliMeta.listEnhancedConnections, hcClient);
    }

    /**
     * 查询作业列表
     *
     * 查询当前用户的作业列表，可以根据作业ID作为ID，查询大于ID或小于ID的限定条数的作业，默认查询全部状态的作业，也可以设定运行中或其他状态条件。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListFlinkJobsRequest 请求对象
     * @return CompletableFuture<ListFlinkJobsResponse>
     */
    public CompletableFuture<ListFlinkJobsResponse> listFlinkJobsAsync(ListFlinkJobsRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.listFlinkJobs);
    }

    /**
     * 查询作业列表
     *
     * 查询当前用户的作业列表，可以根据作业ID作为ID，查询大于ID或小于ID的限定条数的作业，默认查询全部状态的作业，也可以设定运行中或其他状态条件。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListFlinkJobsRequest 请求对象
     * @return AsyncInvoker<ListFlinkJobsRequest, ListFlinkJobsResponse>
     */
    public AsyncInvoker<ListFlinkJobsRequest, ListFlinkJobsResponse> listFlinkJobsAsyncInvoker(
        ListFlinkJobsRequest request) {
        return new AsyncInvoker<ListFlinkJobsRequest, ListFlinkJobsResponse>(request, DliMeta.listFlinkJobs, hcClient);
    }

    /**
     * OBS授权给DLI服务
     *
     * 用户主动授权OBS桶的操作权限给DLI服务, 用于保存用户作业的checkpoint、作业的运行日志等。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RegisterBucketRequest 请求对象
     * @return CompletableFuture<RegisterBucketResponse>
     */
    public CompletableFuture<RegisterBucketResponse> registerBucketAsync(RegisterBucketRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.registerBucket);
    }

    /**
     * OBS授权给DLI服务
     *
     * 用户主动授权OBS桶的操作权限给DLI服务, 用于保存用户作业的checkpoint、作业的运行日志等。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RegisterBucketRequest 请求对象
     * @return AsyncInvoker<RegisterBucketRequest, RegisterBucketResponse>
     */
    public AsyncInvoker<RegisterBucketRequest, RegisterBucketResponse> registerBucketAsyncInvoker(
        RegisterBucketRequest request) {
        return new AsyncInvoker<RegisterBucketRequest, RegisterBucketResponse>(request, DliMeta.registerBucket,
            hcClient);
    }

    /**
     * 批量运行作业
     *
     * 触发批量运行作业。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RunFlinkJobRequest 请求对象
     * @return CompletableFuture<RunFlinkJobResponse>
     */
    public CompletableFuture<RunFlinkJobResponse> runFlinkJobAsync(RunFlinkJobRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.runFlinkJob);
    }

    /**
     * 批量运行作业
     *
     * 触发批量运行作业。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RunFlinkJobRequest 请求对象
     * @return AsyncInvoker<RunFlinkJobRequest, RunFlinkJobResponse>
     */
    public AsyncInvoker<RunFlinkJobRequest, RunFlinkJobResponse> runFlinkJobAsyncInvoker(RunFlinkJobRequest request) {
        return new AsyncInvoker<RunFlinkJobRequest, RunFlinkJobResponse>(request, DliMeta.runFlinkJob, hcClient);
    }

    /**
     * 边缘Flink作业Action状态回调
     *
     * 该API用于处理IEF Flink作业action回调信息
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RunIefJobActionCallBackRequest 请求对象
     * @return CompletableFuture<RunIefJobActionCallBackResponse>
     */
    public CompletableFuture<RunIefJobActionCallBackResponse> runIefJobActionCallBackAsync(
        RunIefJobActionCallBackRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.runIefJobActionCallBack);
    }

    /**
     * 边缘Flink作业Action状态回调
     *
     * 该API用于处理IEF Flink作业action回调信息
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RunIefJobActionCallBackRequest 请求对象
     * @return AsyncInvoker<RunIefJobActionCallBackRequest, RunIefJobActionCallBackResponse>
     */
    public AsyncInvoker<RunIefJobActionCallBackRequest, RunIefJobActionCallBackResponse> runIefJobActionCallBackAsyncInvoker(
        RunIefJobActionCallBackRequest request) {
        return new AsyncInvoker<RunIefJobActionCallBackRequest, RunIefJobActionCallBackResponse>(request,
            DliMeta.runIefJobActionCallBack, hcClient);
    }

    /**
     * 查询经典型跨源连接
     *
     * 该API用于查询该用户指定的已创建的经典型跨源连接。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowDatasourceConnectionRequest 请求对象
     * @return CompletableFuture<ShowDatasourceConnectionResponse>
     */
    public CompletableFuture<ShowDatasourceConnectionResponse> showDatasourceConnectionAsync(
        ShowDatasourceConnectionRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.showDatasourceConnection);
    }

    /**
     * 查询经典型跨源连接
     *
     * 该API用于查询该用户指定的已创建的经典型跨源连接。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowDatasourceConnectionRequest 请求对象
     * @return AsyncInvoker<ShowDatasourceConnectionRequest, ShowDatasourceConnectionResponse>
     */
    public AsyncInvoker<ShowDatasourceConnectionRequest, ShowDatasourceConnectionResponse> showDatasourceConnectionAsyncInvoker(
        ShowDatasourceConnectionRequest request) {
        return new AsyncInvoker<ShowDatasourceConnectionRequest, ShowDatasourceConnectionResponse>(request,
            DliMeta.showDatasourceConnection, hcClient);
    }

    /**
     * 查询增强型跨源连接
     *
     * 该API用于查询该用户指定的已创建的增强型跨源连接。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowEnhancedConnectionRequest 请求对象
     * @return CompletableFuture<ShowEnhancedConnectionResponse>
     */
    public CompletableFuture<ShowEnhancedConnectionResponse> showEnhancedConnectionAsync(
        ShowEnhancedConnectionRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.showEnhancedConnection);
    }

    /**
     * 查询增强型跨源连接
     *
     * 该API用于查询该用户指定的已创建的增强型跨源连接。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowEnhancedConnectionRequest 请求对象
     * @return AsyncInvoker<ShowEnhancedConnectionRequest, ShowEnhancedConnectionResponse>
     */
    public AsyncInvoker<ShowEnhancedConnectionRequest, ShowEnhancedConnectionResponse> showEnhancedConnectionAsyncInvoker(
        ShowEnhancedConnectionRequest request) {
        return new AsyncInvoker<ShowEnhancedConnectionRequest, ShowEnhancedConnectionResponse>(request,
            DliMeta.showEnhancedConnection, hcClient);
    }

    /**
     * 查询增强型跨源授权信息
     *
     * 该API用于查询增强型跨源连接授权的信息。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowEnhancedPrivilegeRequest 请求对象
     * @return CompletableFuture<ShowEnhancedPrivilegeResponse>
     */
    public CompletableFuture<ShowEnhancedPrivilegeResponse> showEnhancedPrivilegeAsync(
        ShowEnhancedPrivilegeRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.showEnhancedPrivilege);
    }

    /**
     * 查询增强型跨源授权信息
     *
     * 该API用于查询增强型跨源连接授权的信息。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowEnhancedPrivilegeRequest 请求对象
     * @return AsyncInvoker<ShowEnhancedPrivilegeRequest, ShowEnhancedPrivilegeResponse>
     */
    public AsyncInvoker<ShowEnhancedPrivilegeRequest, ShowEnhancedPrivilegeResponse> showEnhancedPrivilegeAsyncInvoker(
        ShowEnhancedPrivilegeRequest request) {
        return new AsyncInvoker<ShowEnhancedPrivilegeRequest, ShowEnhancedPrivilegeResponse>(request,
            DliMeta.showEnhancedPrivilege, hcClient);
    }

    /**
     * 查询作业执行计划
     *
     * 查询作业执行计划。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowFlinkExecuteGraphRequest 请求对象
     * @return CompletableFuture<ShowFlinkExecuteGraphResponse>
     */
    public CompletableFuture<ShowFlinkExecuteGraphResponse> showFlinkExecuteGraphAsync(
        ShowFlinkExecuteGraphRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.showFlinkExecuteGraph);
    }

    /**
     * 查询作业执行计划
     *
     * 查询作业执行计划。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowFlinkExecuteGraphRequest 请求对象
     * @return AsyncInvoker<ShowFlinkExecuteGraphRequest, ShowFlinkExecuteGraphResponse>
     */
    public AsyncInvoker<ShowFlinkExecuteGraphRequest, ShowFlinkExecuteGraphResponse> showFlinkExecuteGraphAsyncInvoker(
        ShowFlinkExecuteGraphRequest request) {
        return new AsyncInvoker<ShowFlinkExecuteGraphRequest, ShowFlinkExecuteGraphResponse>(request,
            DliMeta.showFlinkExecuteGraph, hcClient);
    }

    /**
     * 查询作业详情
     *
     * 查看一个作业的详情信息。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowFlinkJobRequest 请求对象
     * @return CompletableFuture<ShowFlinkJobResponse>
     */
    public CompletableFuture<ShowFlinkJobResponse> showFlinkJobAsync(ShowFlinkJobRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.showFlinkJob);
    }

    /**
     * 查询作业详情
     *
     * 查看一个作业的详情信息。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowFlinkJobRequest 请求对象
     * @return AsyncInvoker<ShowFlinkJobRequest, ShowFlinkJobResponse>
     */
    public AsyncInvoker<ShowFlinkJobRequest, ShowFlinkJobResponse> showFlinkJobAsyncInvoker(
        ShowFlinkJobRequest request) {
        return new AsyncInvoker<ShowFlinkJobRequest, ShowFlinkJobResponse>(request, DliMeta.showFlinkJob, hcClient);
    }

    /**
     * 查询作业监控信息
     *
     * 查询作业监控信息, 支持同时查询多个作业的监控信息。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowFlinkMetricRequest 请求对象
     * @return CompletableFuture<ShowFlinkMetricResponse>
     */
    public CompletableFuture<ShowFlinkMetricResponse> showFlinkMetricAsync(ShowFlinkMetricRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.showFlinkMetric);
    }

    /**
     * 查询作业监控信息
     *
     * 查询作业监控信息, 支持同时查询多个作业的监控信息。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowFlinkMetricRequest 请求对象
     * @return AsyncInvoker<ShowFlinkMetricRequest, ShowFlinkMetricResponse>
     */
    public AsyncInvoker<ShowFlinkMetricRequest, ShowFlinkMetricResponse> showFlinkMetricAsyncInvoker(
        ShowFlinkMetricRequest request) {
        return new AsyncInvoker<ShowFlinkMetricRequest, ShowFlinkMetricResponse>(request, DliMeta.showFlinkMetric,
            hcClient);
    }

    /**
     * 批量停止作业
     *
     * 批量停止正在运行的作业。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param StopFlinkJobRequest 请求对象
     * @return CompletableFuture<StopFlinkJobResponse>
     */
    public CompletableFuture<StopFlinkJobResponse> stopFlinkJobAsync(StopFlinkJobRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.stopFlinkJob);
    }

    /**
     * 批量停止作业
     *
     * 批量停止正在运行的作业。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param StopFlinkJobRequest 请求对象
     * @return AsyncInvoker<StopFlinkJobRequest, StopFlinkJobResponse>
     */
    public AsyncInvoker<StopFlinkJobRequest, StopFlinkJobResponse> stopFlinkJobAsyncInvoker(
        StopFlinkJobRequest request) {
        return new AsyncInvoker<StopFlinkJobRequest, StopFlinkJobResponse>(request, DliMeta.stopFlinkJob, hcClient);
    }

    /**
     * 更新Flink Jar作业
     *
     * 更新用户自定义作业，目前支持jar格式，运行在独享集群中。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateFlinkJarRequest 请求对象
     * @return CompletableFuture<UpdateFlinkJarResponse>
     */
    public CompletableFuture<UpdateFlinkJarResponse> updateFlinkJarAsync(UpdateFlinkJarRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.updateFlinkJar);
    }

    /**
     * 更新Flink Jar作业
     *
     * 更新用户自定义作业，目前支持jar格式，运行在独享集群中。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateFlinkJarRequest 请求对象
     * @return AsyncInvoker<UpdateFlinkJarRequest, UpdateFlinkJarResponse>
     */
    public AsyncInvoker<UpdateFlinkJarRequest, UpdateFlinkJarResponse> updateFlinkJarAsyncInvoker(
        UpdateFlinkJarRequest request) {
        return new AsyncInvoker<UpdateFlinkJarRequest, UpdateFlinkJarResponse>(request, DliMeta.updateFlinkJar,
            hcClient);
    }

    /**
     * 更新SQL作业
     *
     * Stream SQL的语法扩展了Apache Flink SQL。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateFlinkSqlRequest 请求对象
     * @return CompletableFuture<UpdateFlinkSqlResponse>
     */
    public CompletableFuture<UpdateFlinkSqlResponse> updateFlinkSqlAsync(UpdateFlinkSqlRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.updateFlinkSql);
    }

    /**
     * 更新SQL作业
     *
     * Stream SQL的语法扩展了Apache Flink SQL。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateFlinkSqlRequest 请求对象
     * @return AsyncInvoker<UpdateFlinkSqlRequest, UpdateFlinkSqlResponse>
     */
    public AsyncInvoker<UpdateFlinkSqlRequest, UpdateFlinkSqlResponse> updateFlinkSqlAsyncInvoker(
        UpdateFlinkSqlRequest request) {
        return new AsyncInvoker<UpdateFlinkSqlRequest, UpdateFlinkSqlResponse>(request, DliMeta.updateFlinkSql,
            hcClient);
    }

    /**
     * 修改增强型跨源主机信息
     *
     * 该API用于在跨源中修改数据源主机信息，仅支持全量覆盖。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateHostMassageRequest 请求对象
     * @return CompletableFuture<UpdateHostMassageResponse>
     */
    public CompletableFuture<UpdateHostMassageResponse> updateHostMassageAsync(UpdateHostMassageRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.updateHostMassage);
    }

    /**
     * 修改增强型跨源主机信息
     *
     * 该API用于在跨源中修改数据源主机信息，仅支持全量覆盖。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateHostMassageRequest 请求对象
     * @return AsyncInvoker<UpdateHostMassageRequest, UpdateHostMassageResponse>
     */
    public AsyncInvoker<UpdateHostMassageRequest, UpdateHostMassageResponse> updateHostMassageAsyncInvoker(
        UpdateHostMassageRequest request) {
        return new AsyncInvoker<UpdateHostMassageRequest, UpdateHostMassageResponse>(request, DliMeta.updateHostMassage,
            hcClient);
    }

    /**
     * 创建DLI委托
     *
     * 创建DLI委托
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateDliAgencyRequest 请求对象
     * @return CompletableFuture<CreateDliAgencyResponse>
     */
    public CompletableFuture<CreateDliAgencyResponse> createDliAgencyAsync(CreateDliAgencyRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.createDliAgency);
    }

    /**
     * 创建DLI委托
     *
     * 创建DLI委托
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateDliAgencyRequest 请求对象
     * @return AsyncInvoker<CreateDliAgencyRequest, CreateDliAgencyResponse>
     */
    public AsyncInvoker<CreateDliAgencyRequest, CreateDliAgencyResponse> createDliAgencyAsyncInvoker(
        CreateDliAgencyRequest request) {
        return new AsyncInvoker<CreateDliAgencyRequest, CreateDliAgencyResponse>(request, DliMeta.createDliAgency,
            hcClient);
    }

    /**
     * 获取dli委托信息
     *
     * 获取dli委托信息
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowDliAgencyRequest 请求对象
     * @return CompletableFuture<ShowDliAgencyResponse>
     */
    public CompletableFuture<ShowDliAgencyResponse> showDliAgencyAsync(ShowDliAgencyRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.showDliAgency);
    }

    /**
     * 获取dli委托信息
     *
     * 获取dli委托信息
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowDliAgencyRequest 请求对象
     * @return AsyncInvoker<ShowDliAgencyRequest, ShowDliAgencyResponse>
     */
    public AsyncInvoker<ShowDliAgencyRequest, ShowDliAgencyResponse> showDliAgencyAsyncInvoker(
        ShowDliAgencyRequest request) {
        return new AsyncInvoker<ShowDliAgencyRequest, ShowDliAgencyResponse>(request, DliMeta.showDliAgency, hcClient);
    }

    /**
     * 取消批处理作业
     *
     * 该API用于取消批处理作业。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CancelBatchJobRequest 请求对象
     * @return CompletableFuture<CancelBatchJobResponse>
     */
    public CompletableFuture<CancelBatchJobResponse> cancelBatchJobAsync(CancelBatchJobRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.cancelBatchJob);
    }

    /**
     * 取消批处理作业
     *
     * 该API用于取消批处理作业。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CancelBatchJobRequest 请求对象
     * @return AsyncInvoker<CancelBatchJobRequest, CancelBatchJobResponse>
     */
    public AsyncInvoker<CancelBatchJobRequest, CancelBatchJobResponse> cancelBatchJobAsyncInvoker(
        CancelBatchJobRequest request) {
        return new AsyncInvoker<CancelBatchJobRequest, CancelBatchJobResponse>(request, DliMeta.cancelBatchJob,
            hcClient);
    }

    /**
     * 创建批处理作业
     *
     * 该API用于在某个队列上创建作业。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateBatchJobRequest 请求对象
     * @return CompletableFuture<CreateBatchJobResponse>
     */
    public CompletableFuture<CreateBatchJobResponse> createBatchJobAsync(CreateBatchJobRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.createBatchJob);
    }

    /**
     * 创建批处理作业
     *
     * 该API用于在某个队列上创建作业。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateBatchJobRequest 请求对象
     * @return AsyncInvoker<CreateBatchJobRequest, CreateBatchJobResponse>
     */
    public AsyncInvoker<CreateBatchJobRequest, CreateBatchJobResponse> createBatchJobAsyncInvoker(
        CreateBatchJobRequest request) {
        return new AsyncInvoker<CreateBatchJobRequest, CreateBatchJobResponse>(request, DliMeta.createBatchJob,
            hcClient);
    }

    /**
     * 删除组内资源包
     *
     * 该API用于删除某个project某个分组下的资源包
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteResourceRequest 请求对象
     * @return CompletableFuture<DeleteResourceResponse>
     */
    public CompletableFuture<DeleteResourceResponse> deleteResourceAsync(DeleteResourceRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.deleteResource);
    }

    /**
     * 删除组内资源包
     *
     * 该API用于删除某个project某个分组下的资源包
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteResourceRequest 请求对象
     * @return AsyncInvoker<DeleteResourceRequest, DeleteResourceResponse>
     */
    public AsyncInvoker<DeleteResourceRequest, DeleteResourceResponse> deleteResourceAsyncInvoker(
        DeleteResourceRequest request) {
        return new AsyncInvoker<DeleteResourceRequest, DeleteResourceResponse>(request, DliMeta.deleteResource,
            hcClient);
    }

    /**
     * 查询批处理作业列表
     *
     * 该API用于查询Project下某队列批处理作业的列表。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListBatchesRequest 请求对象
     * @return CompletableFuture<ListBatchesResponse>
     */
    public CompletableFuture<ListBatchesResponse> listBatchesAsync(ListBatchesRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.listBatches);
    }

    /**
     * 查询批处理作业列表
     *
     * 该API用于查询Project下某队列批处理作业的列表。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListBatchesRequest 请求对象
     * @return AsyncInvoker<ListBatchesRequest, ListBatchesResponse>
     */
    public AsyncInvoker<ListBatchesRequest, ListBatchesResponse> listBatchesAsyncInvoker(ListBatchesRequest request) {
        return new AsyncInvoker<ListBatchesRequest, ListBatchesResponse>(request, DliMeta.listBatches, hcClient);
    }

    /**
     * 查看分组资源列表
     *
     * 该API用于查看某个project下的所有资源，其中包含Group。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListResourcesRequest 请求对象
     * @return CompletableFuture<ListResourcesResponse>
     */
    public CompletableFuture<ListResourcesResponse> listResourcesAsync(ListResourcesRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.listResources);
    }

    /**
     * 查看分组资源列表
     *
     * 该API用于查看某个project下的所有资源，其中包含Group。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListResourcesRequest 请求对象
     * @return AsyncInvoker<ListResourcesRequest, ListResourcesResponse>
     */
    public AsyncInvoker<ListResourcesRequest, ListResourcesResponse> listResourcesAsyncInvoker(
        ListResourcesRequest request) {
        return new AsyncInvoker<ListResourcesRequest, ListResourcesResponse>(request, DliMeta.listResources, hcClient);
    }

    /**
     * 查询批处理作业详情
     *
     * 该API用于根据批处理作业的id查询作业详情。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowBatchInfoRequest 请求对象
     * @return CompletableFuture<ShowBatchInfoResponse>
     */
    public CompletableFuture<ShowBatchInfoResponse> showBatchInfoAsync(ShowBatchInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.showBatchInfo);
    }

    /**
     * 查询批处理作业详情
     *
     * 该API用于根据批处理作业的id查询作业详情。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowBatchInfoRequest 请求对象
     * @return AsyncInvoker<ShowBatchInfoRequest, ShowBatchInfoResponse>
     */
    public AsyncInvoker<ShowBatchInfoRequest, ShowBatchInfoResponse> showBatchInfoAsyncInvoker(
        ShowBatchInfoRequest request) {
        return new AsyncInvoker<ShowBatchInfoRequest, ShowBatchInfoResponse>(request, DliMeta.showBatchInfo, hcClient);
    }

    /**
     * 查询批处理作业日志
     *
     * 该API用于查询批处理作业的后台日志。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowBatchLogRequest 请求对象
     * @return CompletableFuture<ShowBatchLogResponse>
     */
    public CompletableFuture<ShowBatchLogResponse> showBatchLogAsync(ShowBatchLogRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.showBatchLog);
    }

    /**
     * 查询批处理作业日志
     *
     * 该API用于查询批处理作业的后台日志。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowBatchLogRequest 请求对象
     * @return AsyncInvoker<ShowBatchLogRequest, ShowBatchLogResponse>
     */
    public AsyncInvoker<ShowBatchLogRequest, ShowBatchLogResponse> showBatchLogAsyncInvoker(
        ShowBatchLogRequest request) {
        return new AsyncInvoker<ShowBatchLogRequest, ShowBatchLogResponse>(request, DliMeta.showBatchLog, hcClient);
    }

    /**
     * 查询批处理作业状态
     *
     * 该API用于查询批处理作业的状态。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowBatchStateRequest 请求对象
     * @return CompletableFuture<ShowBatchStateResponse>
     */
    public CompletableFuture<ShowBatchStateResponse> showBatchStateAsync(ShowBatchStateRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.showBatchState);
    }

    /**
     * 查询批处理作业状态
     *
     * 该API用于查询批处理作业的状态。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowBatchStateRequest 请求对象
     * @return AsyncInvoker<ShowBatchStateRequest, ShowBatchStateResponse>
     */
    public AsyncInvoker<ShowBatchStateRequest, ShowBatchStateResponse> showBatchStateAsyncInvoker(
        ShowBatchStateRequest request) {
        return new AsyncInvoker<ShowBatchStateRequest, ShowBatchStateResponse>(request, DliMeta.showBatchState,
            hcClient);
    }

    /**
     * 查看组内资源包
     *
     * 该API用于查看某个project某个分组下的具体资源信息。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowResourceInfoRequest 请求对象
     * @return CompletableFuture<ShowResourceInfoResponse>
     */
    public CompletableFuture<ShowResourceInfoResponse> showResourceInfoAsync(ShowResourceInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.showResourceInfo);
    }

    /**
     * 查看组内资源包
     *
     * 该API用于查看某个project某个分组下的具体资源信息。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowResourceInfoRequest 请求对象
     * @return AsyncInvoker<ShowResourceInfoRequest, ShowResourceInfoResponse>
     */
    public AsyncInvoker<ShowResourceInfoRequest, ShowResourceInfoResponse> showResourceInfoAsyncInvoker(
        ShowResourceInfoRequest request) {
        return new AsyncInvoker<ShowResourceInfoRequest, ShowResourceInfoResponse>(request, DliMeta.showResourceInfo,
            hcClient);
    }

    /**
     * 修改组或者资源包拥有者
     *
     * 用于修改程序包的owner。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateGroupOrResourceOwnerRequest 请求对象
     * @return CompletableFuture<UpdateGroupOrResourceOwnerResponse>
     */
    public CompletableFuture<UpdateGroupOrResourceOwnerResponse> updateGroupOrResourceOwnerAsync(
        UpdateGroupOrResourceOwnerRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.updateGroupOrResourceOwner);
    }

    /**
     * 修改组或者资源包拥有者
     *
     * 用于修改程序包的owner。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateGroupOrResourceOwnerRequest 请求对象
     * @return AsyncInvoker<UpdateGroupOrResourceOwnerRequest, UpdateGroupOrResourceOwnerResponse>
     */
    public AsyncInvoker<UpdateGroupOrResourceOwnerRequest, UpdateGroupOrResourceOwnerResponse> updateGroupOrResourceOwnerAsyncInvoker(
        UpdateGroupOrResourceOwnerRequest request) {
        return new AsyncInvoker<UpdateGroupOrResourceOwnerRequest, UpdateGroupOrResourceOwnerResponse>(request,
            DliMeta.updateGroupOrResourceOwner, hcClient);
    }

    /**
     * 上传file类型分组资源
     *
     * 该API用于在project下上传file类型模块。
     * 说明： 上传同名file模块时，新模块将会覆盖旧模块。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UploadFilesRequest 请求对象
     * @return CompletableFuture<UploadFilesResponse>
     */
    public CompletableFuture<UploadFilesResponse> uploadFilesAsync(UploadFilesRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.uploadFiles);
    }

    /**
     * 上传file类型分组资源
     *
     * 该API用于在project下上传file类型模块。
     * 说明： 上传同名file模块时，新模块将会覆盖旧模块。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UploadFilesRequest 请求对象
     * @return AsyncInvoker<UploadFilesRequest, UploadFilesResponse>
     */
    public AsyncInvoker<UploadFilesRequest, UploadFilesResponse> uploadFilesAsyncInvoker(UploadFilesRequest request) {
        return new AsyncInvoker<UploadFilesRequest, UploadFilesResponse>(request, DliMeta.uploadFiles, hcClient);
    }

    /**
     * 上传jar类型分组资源
     *
     * 该API用于在project下上传jar类型分组资源。
     * 说明：上传同名资源模块时，新模块将会覆盖旧模块。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UploadJarsRequest 请求对象
     * @return CompletableFuture<UploadJarsResponse>
     */
    public CompletableFuture<UploadJarsResponse> uploadJarsAsync(UploadJarsRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.uploadJars);
    }

    /**
     * 上传jar类型分组资源
     *
     * 该API用于在project下上传jar类型分组资源。
     * 说明：上传同名资源模块时，新模块将会覆盖旧模块。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UploadJarsRequest 请求对象
     * @return AsyncInvoker<UploadJarsRequest, UploadJarsResponse>
     */
    public AsyncInvoker<UploadJarsRequest, UploadJarsResponse> uploadJarsAsyncInvoker(UploadJarsRequest request) {
        return new AsyncInvoker<UploadJarsRequest, UploadJarsResponse>(request, DliMeta.uploadJars, hcClient);
    }

    /**
     * 上传pyfile类型分组资源
     *
     * 该API用于在project下的上传pyfile类型模块。
     * 说明： 上传同名pyfile类型模块时，新模块将会覆盖旧模块。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UploadPythonFilesRequest 请求对象
     * @return CompletableFuture<UploadPythonFilesResponse>
     */
    public CompletableFuture<UploadPythonFilesResponse> uploadPythonFilesAsync(UploadPythonFilesRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.uploadPythonFiles);
    }

    /**
     * 上传pyfile类型分组资源
     *
     * 该API用于在project下的上传pyfile类型模块。
     * 说明： 上传同名pyfile类型模块时，新模块将会覆盖旧模块。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UploadPythonFilesRequest 请求对象
     * @return AsyncInvoker<UploadPythonFilesRequest, UploadPythonFilesResponse>
     */
    public AsyncInvoker<UploadPythonFilesRequest, UploadPythonFilesResponse> uploadPythonFilesAsyncInvoker(
        UploadPythonFilesRequest request) {
        return new AsyncInvoker<UploadPythonFilesRequest, UploadPythonFilesResponse>(request, DliMeta.uploadPythonFiles,
            hcClient);
    }

    /**
     * 上传分组资源
     *
     * 该API用于上传分组资源到某个project下。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UploadResourcesRequest 请求对象
     * @return CompletableFuture<UploadResourcesResponse>
     */
    public CompletableFuture<UploadResourcesResponse> uploadResourcesAsync(UploadResourcesRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.uploadResources);
    }

    /**
     * 上传分组资源
     *
     * 该API用于上传分组资源到某个project下。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UploadResourcesRequest 请求对象
     * @return AsyncInvoker<UploadResourcesRequest, UploadResourcesResponse>
     */
    public AsyncInvoker<UploadResourcesRequest, UploadResourcesResponse> uploadResourcesAsyncInvoker(
        UploadResourcesRequest request) {
        return new AsyncInvoker<UploadResourcesRequest, UploadResourcesResponse>(request, DliMeta.uploadResources,
            hcClient);
    }

    /**
     * 批量删除队列定时扩缩容计划
     *
     * 该API用于批量删除队列定时扩缩容计划。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param BatchDeleteQueuePlansRequest 请求对象
     * @return CompletableFuture<BatchDeleteQueuePlansResponse>
     */
    public CompletableFuture<BatchDeleteQueuePlansResponse> batchDeleteQueuePlansAsync(
        BatchDeleteQueuePlansRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.batchDeleteQueuePlans);
    }

    /**
     * 批量删除队列定时扩缩容计划
     *
     * 该API用于批量删除队列定时扩缩容计划。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param BatchDeleteQueuePlansRequest 请求对象
     * @return AsyncInvoker<BatchDeleteQueuePlansRequest, BatchDeleteQueuePlansResponse>
     */
    public AsyncInvoker<BatchDeleteQueuePlansRequest, BatchDeleteQueuePlansResponse> batchDeleteQueuePlansAsyncInvoker(
        BatchDeleteQueuePlansRequest request) {
        return new AsyncInvoker<BatchDeleteQueuePlansRequest, BatchDeleteQueuePlansResponse>(request,
            DliMeta.batchDeleteQueuePlans, hcClient);
    }

    /**
     * 取消作业
     *
     * 该API用于取消已经提交的作业，若作业已经执行结束或失败则无法取消。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CancelJobRequest 请求对象
     * @return CompletableFuture<CancelJobResponse>
     */
    public CompletableFuture<CancelJobResponse> cancelJobAsync(CancelJobRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.cancelJob);
    }

    /**
     * 取消作业
     *
     * 该API用于取消已经提交的作业，若作业已经执行结束或失败则无法取消。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CancelJobRequest 请求对象
     * @return AsyncInvoker<CancelJobRequest, CancelJobResponse>
     */
    public AsyncInvoker<CancelJobRequest, CancelJobResponse> cancelJobAsyncInvoker(CancelJobRequest request) {
        return new AsyncInvoker<CancelJobRequest, CancelJobResponse>(request, DliMeta.cancelJob, hcClient);
    }

    /**
     * 数据赋权
     *
     * 该API用于将数据库或数据表的数据权限赋给指定的其他用户。
     * 说明： 
     * 被赋权用户所在用户组的所属区域需具有Tenant Guest权限。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ChangeAuthorizationRequest 请求对象
     * @return CompletableFuture<ChangeAuthorizationResponse>
     */
    public CompletableFuture<ChangeAuthorizationResponse> changeAuthorizationAsync(ChangeAuthorizationRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.changeAuthorization);
    }

    /**
     * 数据赋权
     *
     * 该API用于将数据库或数据表的数据权限赋给指定的其他用户。
     * 说明： 
     * 被赋权用户所在用户组的所属区域需具有Tenant Guest权限。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ChangeAuthorizationRequest 请求对象
     * @return AsyncInvoker<ChangeAuthorizationRequest, ChangeAuthorizationResponse>
     */
    public AsyncInvoker<ChangeAuthorizationRequest, ChangeAuthorizationResponse> changeAuthorizationAsyncInvoker(
        ChangeAuthorizationRequest request) {
        return new AsyncInvoker<ChangeAuthorizationRequest, ChangeAuthorizationResponse>(request,
            DliMeta.changeAuthorization, hcClient);
    }

    /**
     * 修改队列定时扩缩容计划
     *
     * 该API用于修改指定ID的队列定时扩缩容计划。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ChangeQueuePlanRequest 请求对象
     * @return CompletableFuture<ChangeQueuePlanResponse>
     */
    public CompletableFuture<ChangeQueuePlanResponse> changeQueuePlanAsync(ChangeQueuePlanRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.changeQueuePlan);
    }

    /**
     * 修改队列定时扩缩容计划
     *
     * 该API用于修改指定ID的队列定时扩缩容计划。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ChangeQueuePlanRequest 请求对象
     * @return AsyncInvoker<ChangeQueuePlanRequest, ChangeQueuePlanResponse>
     */
    public AsyncInvoker<ChangeQueuePlanRequest, ChangeQueuePlanResponse> changeQueuePlanAsyncInvoker(
        ChangeQueuePlanRequest request) {
        return new AsyncInvoker<ChangeQueuePlanRequest, ChangeQueuePlanResponse>(request, DliMeta.changeQueuePlan,
            hcClient);
    }

    /**
     * 创建地址连通性请求
     *
     * 创建地址连通性请求API接口，往指定集群发送地址连通性测试请求，并将测试地址插入表内
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CheckConnectionRequest 请求对象
     * @return CompletableFuture<CheckConnectionResponse>
     */
    public CompletableFuture<CheckConnectionResponse> checkConnectionAsync(CheckConnectionRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.checkConnection);
    }

    /**
     * 创建地址连通性请求
     *
     * 创建地址连通性请求API接口，往指定集群发送地址连通性测试请求，并将测试地址插入表内
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CheckConnectionRequest 请求对象
     * @return AsyncInvoker<CheckConnectionRequest, CheckConnectionResponse>
     */
    public AsyncInvoker<CheckConnectionRequest, CheckConnectionResponse> checkConnectionAsyncInvoker(
        CheckConnectionRequest request) {
        return new AsyncInvoker<CheckConnectionRequest, CheckConnectionResponse>(request, DliMeta.checkConnection,
            hcClient);
    }

    /**
     * 检查SQL语法
     *
     * 该API用于检查SQL语法。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CheckSqlRequest 请求对象
     * @return CompletableFuture<CheckSqlResponse>
     */
    public CompletableFuture<CheckSqlResponse> checkSqlAsync(CheckSqlRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.checkSql);
    }

    /**
     * 检查SQL语法
     *
     * 该API用于检查SQL语法。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CheckSqlRequest 请求对象
     * @return AsyncInvoker<CheckSqlRequest, CheckSqlResponse>
     */
    public AsyncInvoker<CheckSqlRequest, CheckSqlResponse> checkSqlAsyncInvoker(CheckSqlRequest request) {
        return new AsyncInvoker<CheckSqlRequest, CheckSqlResponse>(request, DliMeta.checkSql, hcClient);
    }

    /**
     * 创建数据库
     *
     * 该API用于新增数据库。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateDatabaseRequest 请求对象
     * @return CompletableFuture<CreateDatabaseResponse>
     */
    public CompletableFuture<CreateDatabaseResponse> createDatabaseAsync(CreateDatabaseRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.createDatabase);
    }

    /**
     * 创建数据库
     *
     * 该API用于新增数据库。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateDatabaseRequest 请求对象
     * @return AsyncInvoker<CreateDatabaseRequest, CreateDatabaseResponse>
     */
    public AsyncInvoker<CreateDatabaseRequest, CreateDatabaseResponse> createDatabaseAsyncInvoker(
        CreateDatabaseRequest request) {
        return new AsyncInvoker<CreateDatabaseRequest, CreateDatabaseResponse>(request, DliMeta.createDatabase,
            hcClient);
    }

    /**
     * 导出查询结果
     *
     * 该API用于将SQL语句的查询结果导出到OBS对象存储中，只支持导出“QUERY”类型作业的查询结果。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateJobResultRequest 请求对象
     * @return CompletableFuture<CreateJobResultResponse>
     */
    public CompletableFuture<CreateJobResultResponse> createJobResultAsync(CreateJobResultRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.createJobResult);
    }

    /**
     * 导出查询结果
     *
     * 该API用于将SQL语句的查询结果导出到OBS对象存储中，只支持导出“QUERY”类型作业的查询结果。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateJobResultRequest 请求对象
     * @return AsyncInvoker<CreateJobResultRequest, CreateJobResultResponse>
     */
    public AsyncInvoker<CreateJobResultRequest, CreateJobResultResponse> createJobResultAsyncInvoker(
        CreateJobResultRequest request) {
        return new AsyncInvoker<CreateJobResultRequest, CreateJobResultResponse>(request, DliMeta.createJobResult,
            hcClient);
    }

    /**
     * 创建队列
     *
     * 该API用于创建队列，该队列将会绑定用户指定的计算资源。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateQueueRequest 请求对象
     * @return CompletableFuture<CreateQueueResponse>
     */
    public CompletableFuture<CreateQueueResponse> createQueueAsync(CreateQueueRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.createQueue);
    }

    /**
     * 创建队列
     *
     * 该API用于创建队列，该队列将会绑定用户指定的计算资源。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateQueueRequest 请求对象
     * @return AsyncInvoker<CreateQueueRequest, CreateQueueResponse>
     */
    public AsyncInvoker<CreateQueueRequest, CreateQueueResponse> createQueueAsyncInvoker(CreateQueueRequest request) {
        return new AsyncInvoker<CreateQueueRequest, CreateQueueResponse>(request, DliMeta.createQueue, hcClient);
    }

    /**
     * 创建队列定时扩缩容计划
     *
     * 创建队列定时扩缩容计划接口，对指定的队列创建定时规格变更计划。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateQueuePlanRequest 请求对象
     * @return CompletableFuture<CreateQueuePlanResponse>
     */
    public CompletableFuture<CreateQueuePlanResponse> createQueuePlanAsync(CreateQueuePlanRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.createQueuePlan);
    }

    /**
     * 创建队列定时扩缩容计划
     *
     * 创建队列定时扩缩容计划接口，对指定的队列创建定时规格变更计划。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateQueuePlanRequest 请求对象
     * @return AsyncInvoker<CreateQueuePlanRequest, CreateQueuePlanResponse>
     */
    public AsyncInvoker<CreateQueuePlanRequest, CreateQueuePlanResponse> createQueuePlanAsyncInvoker(
        CreateQueuePlanRequest request) {
        return new AsyncInvoker<CreateQueuePlanRequest, CreateQueuePlanResponse>(request, DliMeta.createQueuePlan,
            hcClient);
    }

    /**
     * 创建表
     *
     * 该API用于创建新的表。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateTableRequest 请求对象
     * @return CompletableFuture<CreateTableResponse>
     */
    public CompletableFuture<CreateTableResponse> createTableAsync(CreateTableRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.createTable);
    }

    /**
     * 创建表
     *
     * 该API用于创建新的表。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateTableRequest 请求对象
     * @return AsyncInvoker<CreateTableRequest, CreateTableResponse>
     */
    public AsyncInvoker<CreateTableRequest, CreateTableResponse> createTableAsyncInvoker(CreateTableRequest request) {
        return new AsyncInvoker<CreateTableRequest, CreateTableResponse>(request, DliMeta.createTable, hcClient);
    }

    /**
     * 删除数据库
     *
     * 该API用于删除空数据库，若待删除的数据库中存在表，则需先删除其中的所有表。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteDatabaseRequest 请求对象
     * @return CompletableFuture<DeleteDatabaseResponse>
     */
    public CompletableFuture<DeleteDatabaseResponse> deleteDatabaseAsync(DeleteDatabaseRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.deleteDatabase);
    }

    /**
     * 删除数据库
     *
     * 该API用于删除空数据库，若待删除的数据库中存在表，则需先删除其中的所有表。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteDatabaseRequest 请求对象
     * @return AsyncInvoker<DeleteDatabaseRequest, DeleteDatabaseResponse>
     */
    public AsyncInvoker<DeleteDatabaseRequest, DeleteDatabaseResponse> deleteDatabaseAsyncInvoker(
        DeleteDatabaseRequest request) {
        return new AsyncInvoker<DeleteDatabaseRequest, DeleteDatabaseResponse>(request, DliMeta.deleteDatabase,
            hcClient);
    }

    /**
     * 删除队列
     *
     * 该API用于删除指定队列。
     * 说明： 
     * 若指定队列正在执行任务，则不允许删除。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteQueueRequest 请求对象
     * @return CompletableFuture<DeleteQueueResponse>
     */
    public CompletableFuture<DeleteQueueResponse> deleteQueueAsync(DeleteQueueRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.deleteQueue);
    }

    /**
     * 删除队列
     *
     * 该API用于删除指定队列。
     * 说明： 
     * 若指定队列正在执行任务，则不允许删除。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteQueueRequest 请求对象
     * @return AsyncInvoker<DeleteQueueRequest, DeleteQueueResponse>
     */
    public AsyncInvoker<DeleteQueueRequest, DeleteQueueResponse> deleteQueueAsyncInvoker(DeleteQueueRequest request) {
        return new AsyncInvoker<DeleteQueueRequest, DeleteQueueResponse>(request, DliMeta.deleteQueue, hcClient);
    }

    /**
     * 单个删除队列定时扩缩容计划
     *
     * 该API用于删除指定ID的队列定时扩缩容计划。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteQueuePlanRequest 请求对象
     * @return CompletableFuture<DeleteQueuePlanResponse>
     */
    public CompletableFuture<DeleteQueuePlanResponse> deleteQueuePlanAsync(DeleteQueuePlanRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.deleteQueuePlan);
    }

    /**
     * 单个删除队列定时扩缩容计划
     *
     * 该API用于删除指定ID的队列定时扩缩容计划。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteQueuePlanRequest 请求对象
     * @return AsyncInvoker<DeleteQueuePlanRequest, DeleteQueuePlanResponse>
     */
    public AsyncInvoker<DeleteQueuePlanRequest, DeleteQueuePlanResponse> deleteQueuePlanAsyncInvoker(
        DeleteQueuePlanRequest request) {
        return new AsyncInvoker<DeleteQueuePlanRequest, DeleteQueuePlanResponse>(request, DliMeta.deleteQueuePlan,
            hcClient);
    }

    /**
     * 删除表
     *
     * 该API用于删除指定的表。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteTableRequest 请求对象
     * @return CompletableFuture<DeleteTableResponse>
     */
    public CompletableFuture<DeleteTableResponse> deleteTableAsync(DeleteTableRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.deleteTable);
    }

    /**
     * 删除表
     *
     * 该API用于删除指定的表。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteTableRequest 请求对象
     * @return AsyncInvoker<DeleteTableRequest, DeleteTableResponse>
     */
    public AsyncInvoker<DeleteTableRequest, DeleteTableResponse> deleteTableAsyncInvoker(DeleteTableRequest request) {
        return new AsyncInvoker<DeleteTableRequest, DeleteTableResponse>(request, DliMeta.deleteTable, hcClient);
    }

    /**
     * 导出数据
     *
     * 该API用于将数据导出到文件。支持数据从DLI表中导出到文件。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ExportDataRequest 请求对象
     * @return CompletableFuture<ExportDataResponse>
     */
    public CompletableFuture<ExportDataResponse> exportDataAsync(ExportDataRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.exportData);
    }

    /**
     * 导出数据
     *
     * 该API用于将数据导出到文件。支持数据从DLI表中导出到文件。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ExportDataRequest 请求对象
     * @return AsyncInvoker<ExportDataRequest, ExportDataResponse>
     */
    public AsyncInvoker<ExportDataRequest, ExportDataResponse> exportDataAsyncInvoker(ExportDataRequest request) {
        return new AsyncInvoker<ExportDataRequest, ExportDataResponse>(request, DliMeta.exportData, hcClient);
    }

    /**
     * 导入数据
     *
     * 该API用于将数据从文件导入DLI或OBS表，目前仅支持将OBS上的数据导入DLI或OBS中。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ImportDataRequest 请求对象
     * @return CompletableFuture<ImportDataResponse>
     */
    public CompletableFuture<ImportDataResponse> importDataAsync(ImportDataRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.importData);
    }

    /**
     * 导入数据
     *
     * 该API用于将数据从文件导入DLI或OBS表，目前仅支持将OBS上的数据导入DLI或OBS中。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ImportDataRequest 请求对象
     * @return AsyncInvoker<ImportDataRequest, ImportDataResponse>
     */
    public AsyncInvoker<ImportDataRequest, ImportDataResponse> importDataAsyncInvoker(ImportDataRequest request) {
        return new AsyncInvoker<ImportDataRequest, ImportDataResponse>(request, DliMeta.importData, hcClient);
    }

    /**
     * 查看数据库的使用者
     *
     * 该API用于查询可以使用的指定队列的所有用户名称。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListDatabaseUsersRequest 请求对象
     * @return CompletableFuture<ListDatabaseUsersResponse>
     */
    public CompletableFuture<ListDatabaseUsersResponse> listDatabaseUsersAsync(ListDatabaseUsersRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.listDatabaseUsers);
    }

    /**
     * 查看数据库的使用者
     *
     * 该API用于查询可以使用的指定队列的所有用户名称。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListDatabaseUsersRequest 请求对象
     * @return AsyncInvoker<ListDatabaseUsersRequest, ListDatabaseUsersResponse>
     */
    public AsyncInvoker<ListDatabaseUsersRequest, ListDatabaseUsersResponse> listDatabaseUsersAsyncInvoker(
        ListDatabaseUsersRequest request) {
        return new AsyncInvoker<ListDatabaseUsersRequest, ListDatabaseUsersResponse>(request, DliMeta.listDatabaseUsers,
            hcClient);
    }

    /**
     * 查询所有数据库
     *
     * 该API用于查询出所有的数据库信息。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListDatabasesRequest 请求对象
     * @return CompletableFuture<ListDatabasesResponse>
     */
    public CompletableFuture<ListDatabasesResponse> listDatabasesAsync(ListDatabasesRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.listDatabases);
    }

    /**
     * 查询所有数据库
     *
     * 该API用于查询出所有的数据库信息。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListDatabasesRequest 请求对象
     * @return AsyncInvoker<ListDatabasesRequest, ListDatabasesResponse>
     */
    public AsyncInvoker<ListDatabasesRequest, ListDatabasesResponse> listDatabasesAsyncInvoker(
        ListDatabasesRequest request) {
        return new AsyncInvoker<ListDatabasesRequest, ListDatabasesResponse>(request, DliMeta.listDatabases, hcClient);
    }

    /**
     * 查询所有作业
     *
     * 该API用于查询当前工程下面的所有作业的信息。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListJobsRequest 请求对象
     * @return CompletableFuture<ListJobsResponse>
     */
    public CompletableFuture<ListJobsResponse> listJobsAsync(ListJobsRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.listJobs);
    }

    /**
     * 查询所有作业
     *
     * 该API用于查询当前工程下面的所有作业的信息。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListJobsRequest 请求对象
     * @return AsyncInvoker<ListJobsRequest, ListJobsResponse>
     */
    public AsyncInvoker<ListJobsRequest, ListJobsResponse> listJobsAsyncInvoker(ListJobsRequest request) {
        return new AsyncInvoker<ListJobsRequest, ListJobsResponse>(request, DliMeta.listJobs, hcClient);
    }

    /**
     * 查看队列定时扩缩容计划
     *
     * 查看队列定时扩缩容计划接口，列出指定队列定时规格变更计划。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListQueuePlansRequest 请求对象
     * @return CompletableFuture<ListQueuePlansResponse>
     */
    public CompletableFuture<ListQueuePlansResponse> listQueuePlansAsync(ListQueuePlansRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.listQueuePlans);
    }

    /**
     * 查看队列定时扩缩容计划
     *
     * 查看队列定时扩缩容计划接口，列出指定队列定时规格变更计划。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListQueuePlansRequest 请求对象
     * @return AsyncInvoker<ListQueuePlansRequest, ListQueuePlansResponse>
     */
    public AsyncInvoker<ListQueuePlansRequest, ListQueuePlansResponse> listQueuePlansAsyncInvoker(
        ListQueuePlansRequest request) {
        return new AsyncInvoker<ListQueuePlansRequest, ListQueuePlansResponse>(request, DliMeta.listQueuePlans,
            hcClient);
    }

    /**
     * 查看队列的使用者
     *
     * 该API用于查询可以使用的指定队列的所有用户名称。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListQueueUsersRequest 请求对象
     * @return CompletableFuture<ListQueueUsersResponse>
     */
    public CompletableFuture<ListQueueUsersResponse> listQueueUsersAsync(ListQueueUsersRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.listQueueUsers);
    }

    /**
     * 查看队列的使用者
     *
     * 该API用于查询可以使用的指定队列的所有用户名称。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListQueueUsersRequest 请求对象
     * @return AsyncInvoker<ListQueueUsersRequest, ListQueueUsersResponse>
     */
    public AsyncInvoker<ListQueueUsersRequest, ListQueueUsersResponse> listQueueUsersAsyncInvoker(
        ListQueueUsersRequest request) {
        return new AsyncInvoker<ListQueueUsersRequest, ListQueueUsersResponse>(request, DliMeta.listQueueUsers,
            hcClient);
    }

    /**
     * 查询所有队列
     *
     * 该API用于列出该project下所有的队列。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListQueuesRequest 请求对象
     * @return CompletableFuture<ListQueuesResponse>
     */
    public CompletableFuture<ListQueuesResponse> listQueuesAsync(ListQueuesRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.listQueues);
    }

    /**
     * 查询所有队列
     *
     * 该API用于列出该project下所有的队列。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListQueuesRequest 请求对象
     * @return AsyncInvoker<ListQueuesRequest, ListQueuesResponse>
     */
    public AsyncInvoker<ListQueuesRequest, ListQueuesResponse> listQueuesAsyncInvoker(ListQueuesRequest request) {
        return new AsyncInvoker<ListQueuesRequest, ListQueuesResponse>(request, DliMeta.listQueues, hcClient);
    }

    /**
     * 查看表的用户权限
     *
     * 该API用于查询指定用户在表上的权限。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListTablePrivilegesRequest 请求对象
     * @return CompletableFuture<ListTablePrivilegesResponse>
     */
    public CompletableFuture<ListTablePrivilegesResponse> listTablePrivilegesAsync(ListTablePrivilegesRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.listTablePrivileges);
    }

    /**
     * 查看表的用户权限
     *
     * 该API用于查询指定用户在表上的权限。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListTablePrivilegesRequest 请求对象
     * @return AsyncInvoker<ListTablePrivilegesRequest, ListTablePrivilegesResponse>
     */
    public AsyncInvoker<ListTablePrivilegesRequest, ListTablePrivilegesResponse> listTablePrivilegesAsyncInvoker(
        ListTablePrivilegesRequest request) {
        return new AsyncInvoker<ListTablePrivilegesRequest, ListTablePrivilegesResponse>(request,
            DliMeta.listTablePrivileges, hcClient);
    }

    /**
     * 查看表的使用者
     *
     * 该API用于查看有权访问指定表或表的列的所有用户。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListTableUsersRequest 请求对象
     * @return CompletableFuture<ListTableUsersResponse>
     */
    public CompletableFuture<ListTableUsersResponse> listTableUsersAsync(ListTableUsersRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.listTableUsers);
    }

    /**
     * 查看表的使用者
     *
     * 该API用于查看有权访问指定表或表的列的所有用户。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListTableUsersRequest 请求对象
     * @return AsyncInvoker<ListTableUsersRequest, ListTableUsersResponse>
     */
    public AsyncInvoker<ListTableUsersRequest, ListTableUsersResponse> listTableUsersAsyncInvoker(
        ListTableUsersRequest request) {
        return new AsyncInvoker<ListTableUsersRequest, ListTableUsersResponse>(request, DliMeta.listTableUsers,
            hcClient);
    }

    /**
     * 查询所有表
     *
     * 该API用于查询指定数据库下符合过滤条件的或所有的表信息。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListTablesRequest 请求对象
     * @return CompletableFuture<ListTablesResponse>
     */
    public CompletableFuture<ListTablesResponse> listTablesAsync(ListTablesRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.listTables);
    }

    /**
     * 查询所有表
     *
     * 该API用于查询指定数据库下符合过滤条件的或所有的表信息。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListTablesRequest 请求对象
     * @return AsyncInvoker<ListTablesRequest, ListTablesResponse>
     */
    public AsyncInvoker<ListTablesRequest, ListTablesResponse> listTablesAsyncInvoker(ListTablesRequest request) {
        return new AsyncInvoker<ListTablesRequest, ListTablesResponse>(request, DliMeta.listTables, hcClient);
    }

    /**
     * 队列赋权
     *
     * 该API用于与其他用户共享指定的队列，可以给用户赋使用指定的队列的权限或者收回使用权限。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RegisterAuthorizedQueueRequest 请求对象
     * @return CompletableFuture<RegisterAuthorizedQueueResponse>
     */
    public CompletableFuture<RegisterAuthorizedQueueResponse> registerAuthorizedQueueAsync(
        RegisterAuthorizedQueueRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.registerAuthorizedQueue);
    }

    /**
     * 队列赋权
     *
     * 该API用于与其他用户共享指定的队列，可以给用户赋使用指定的队列的权限或者收回使用权限。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RegisterAuthorizedQueueRequest 请求对象
     * @return AsyncInvoker<RegisterAuthorizedQueueRequest, RegisterAuthorizedQueueResponse>
     */
    public AsyncInvoker<RegisterAuthorizedQueueRequest, RegisterAuthorizedQueueResponse> registerAuthorizedQueueAsyncInvoker(
        RegisterAuthorizedQueueRequest request) {
        return new AsyncInvoker<RegisterAuthorizedQueueRequest, RegisterAuthorizedQueueResponse>(request,
            DliMeta.registerAuthorizedQueue, hcClient);
    }

    /**
     * 提交SQL作业
     *
     * 该API用于通过执行SQL语句的方式向队列提交作业。
     * 
     * 作业包含以下类型：DDL、DCL、IMPORT、QUERY和INSERT。其中，IMPORT与导入数据的功能一致，区别仅在于实现方式不同。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RunJobRequest 请求对象
     * @return CompletableFuture<RunJobResponse>
     */
    public CompletableFuture<RunJobResponse> runJobAsync(RunJobRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.runJob);
    }

    /**
     * 提交SQL作业
     *
     * 该API用于通过执行SQL语句的方式向队列提交作业。
     * 
     * 作业包含以下类型：DDL、DCL、IMPORT、QUERY和INSERT。其中，IMPORT与导入数据的功能一致，区别仅在于实现方式不同。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RunJobRequest 请求对象
     * @return AsyncInvoker<RunJobRequest, RunJobResponse>
     */
    public AsyncInvoker<RunJobRequest, RunJobResponse> runJobAsyncInvoker(RunJobRequest request) {
        return new AsyncInvoker<RunJobRequest, RunJobResponse>(request, DliMeta.runJob, hcClient);
    }

    /**
     * 重启/扩容/缩容队列
     *
     * 该功能用于重新启动队列、扩容队列、缩容队列。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RunQueueActionRequest 请求对象
     * @return CompletableFuture<RunQueueActionResponse>
     */
    public CompletableFuture<RunQueueActionResponse> runQueueActionAsync(RunQueueActionRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.runQueueAction);
    }

    /**
     * 重启/扩容/缩容队列
     *
     * 该功能用于重新启动队列、扩容队列、缩容队列。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RunQueueActionRequest 请求对象
     * @return AsyncInvoker<RunQueueActionRequest, RunQueueActionResponse>
     */
    public AsyncInvoker<RunQueueActionRequest, RunQueueActionResponse> runQueueActionAsyncInvoker(
        RunQueueActionRequest request) {
        return new AsyncInvoker<RunQueueActionRequest, RunQueueActionResponse>(request, DliMeta.runQueueAction,
            hcClient);
    }

    /**
     * 描述表信息
     *
     * 该API用于描述指定表的元数据信息。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowDescribeTableRequest 请求对象
     * @return CompletableFuture<ShowDescribeTableResponse>
     */
    public CompletableFuture<ShowDescribeTableResponse> showDescribeTableAsync(ShowDescribeTableRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.showDescribeTable);
    }

    /**
     * 描述表信息
     *
     * 该API用于描述指定表的元数据信息。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowDescribeTableRequest 请求对象
     * @return AsyncInvoker<ShowDescribeTableRequest, ShowDescribeTableResponse>
     */
    public AsyncInvoker<ShowDescribeTableRequest, ShowDescribeTableResponse> showDescribeTableAsyncInvoker(
        ShowDescribeTableRequest request) {
        return new AsyncInvoker<ShowDescribeTableRequest, ShowDescribeTableResponse>(request, DliMeta.showDescribeTable,
            hcClient);
    }

    /**
     * 查询作业详细信息
     *
     * 该API用于查询作业的详细信息，如作业的databasename、tablename、file size和export mode等信息。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowDetailInfoRequest 请求对象
     * @return CompletableFuture<ShowDetailInfoResponse>
     */
    public CompletableFuture<ShowDetailInfoResponse> showDetailInfoAsync(ShowDetailInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.showDetailInfo);
    }

    /**
     * 查询作业详细信息
     *
     * 该API用于查询作业的详细信息，如作业的databasename、tablename、file size和export mode等信息。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowDetailInfoRequest 请求对象
     * @return AsyncInvoker<ShowDetailInfoRequest, ShowDetailInfoResponse>
     */
    public AsyncInvoker<ShowDetailInfoRequest, ShowDetailInfoResponse> showDetailInfoAsyncInvoker(
        ShowDetailInfoRequest request) {
        return new AsyncInvoker<ShowDetailInfoRequest, ShowDetailInfoResponse>(request, DliMeta.showDetailInfo,
            hcClient);
    }

    /**
     * 查询作业执行进度信息
     *
     * 该API用于获取作业执行进度信息，如果作业正在执行，可以获取到子作业的信息，如果作业刚开始或者已经结束，不可以获取到子作业信息。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowJobProgressRequest 请求对象
     * @return CompletableFuture<ShowJobProgressResponse>
     */
    public CompletableFuture<ShowJobProgressResponse> showJobProgressAsync(ShowJobProgressRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.showJobProgress);
    }

    /**
     * 查询作业执行进度信息
     *
     * 该API用于获取作业执行进度信息，如果作业正在执行，可以获取到子作业的信息，如果作业刚开始或者已经结束，不可以获取到子作业信息。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowJobProgressRequest 请求对象
     * @return AsyncInvoker<ShowJobProgressRequest, ShowJobProgressResponse>
     */
    public AsyncInvoker<ShowJobProgressRequest, ShowJobProgressResponse> showJobProgressAsyncInvoker(
        ShowJobProgressRequest request) {
        return new AsyncInvoker<ShowJobProgressRequest, ShowJobProgressResponse>(request, DliMeta.showJobProgress,
            hcClient);
    }

    /**
     * 预览SQL作业查询结果
     *
     * 该API用于在执行SQL查询语句的作业完成后，查看该作业执行的结果。目前仅支持查看“QUERY”类型作业的执行结果。
     * 该API只能查看前1000条的结果记录，若要查看全部的结果记录，需要先导出查询结果再进行查看。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowJobResultRequest 请求对象
     * @return CompletableFuture<ShowJobResultResponse>
     */
    public CompletableFuture<ShowJobResultResponse> showJobResultAsync(ShowJobResultRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.showJobResult);
    }

    /**
     * 预览SQL作业查询结果
     *
     * 该API用于在执行SQL查询语句的作业完成后，查看该作业执行的结果。目前仅支持查看“QUERY”类型作业的执行结果。
     * 该API只能查看前1000条的结果记录，若要查看全部的结果记录，需要先导出查询结果再进行查看。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowJobResultRequest 请求对象
     * @return AsyncInvoker<ShowJobResultRequest, ShowJobResultResponse>
     */
    public AsyncInvoker<ShowJobResultRequest, ShowJobResultResponse> showJobResultAsyncInvoker(
        ShowJobResultRequest request) {
        return new AsyncInvoker<ShowJobResultRequest, ShowJobResultResponse>(request, DliMeta.showJobResult, hcClient);
    }

    /**
     * 查询作业状态
     *
     * 该API用于在作业提交后查询作业状态。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowJobStatusRequest 请求对象
     * @return CompletableFuture<ShowJobStatusResponse>
     */
    public CompletableFuture<ShowJobStatusResponse> showJobStatusAsync(ShowJobStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.showJobStatus);
    }

    /**
     * 查询作业状态
     *
     * 该API用于在作业提交后查询作业状态。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowJobStatusRequest 请求对象
     * @return AsyncInvoker<ShowJobStatusRequest, ShowJobStatusResponse>
     */
    public AsyncInvoker<ShowJobStatusRequest, ShowJobStatusResponse> showJobStatusAsyncInvoker(
        ShowJobStatusRequest request) {
        return new AsyncInvoker<ShowJobStatusRequest, ShowJobStatusResponse>(request, DliMeta.showJobStatus, hcClient);
    }

    /**
     * 查询指定地址连通性测试详情
     *
     * 该API用于在连通性测试提交后查询连通性结果。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowNodeConnectivityRequest 请求对象
     * @return CompletableFuture<ShowNodeConnectivityResponse>
     */
    public CompletableFuture<ShowNodeConnectivityResponse> showNodeConnectivityAsync(
        ShowNodeConnectivityRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.showNodeConnectivity);
    }

    /**
     * 查询指定地址连通性测试详情
     *
     * 该API用于在连通性测试提交后查询连通性结果。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowNodeConnectivityRequest 请求对象
     * @return AsyncInvoker<ShowNodeConnectivityRequest, ShowNodeConnectivityResponse>
     */
    public AsyncInvoker<ShowNodeConnectivityRequest, ShowNodeConnectivityResponse> showNodeConnectivityAsyncInvoker(
        ShowNodeConnectivityRequest request) {
        return new AsyncInvoker<ShowNodeConnectivityRequest, ShowNodeConnectivityResponse>(request,
            DliMeta.showNodeConnectivity, hcClient);
    }

    /**
     * 查看赋权对象的用者权限信息
     *
     * 获取对象赋权用户的权限信息
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowObjectUserRequest 请求对象
     * @return CompletableFuture<ShowObjectUserResponse>
     */
    public CompletableFuture<ShowObjectUserResponse> showObjectUserAsync(ShowObjectUserRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.showObjectUser);
    }

    /**
     * 查看赋权对象的用者权限信息
     *
     * 获取对象赋权用户的权限信息
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowObjectUserRequest 请求对象
     * @return AsyncInvoker<ShowObjectUserRequest, ShowObjectUserResponse>
     */
    public AsyncInvoker<ShowObjectUserRequest, ShowObjectUserResponse> showObjectUserAsyncInvoker(
        ShowObjectUserRequest request) {
        return new AsyncInvoker<ShowObjectUserRequest, ShowObjectUserResponse>(request, DliMeta.showObjectUser,
            hcClient);
    }

    /**
     * 获取分区信息列表
     *
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowPartitionsRequest 请求对象
     * @return CompletableFuture<ShowPartitionsResponse>
     */
    public CompletableFuture<ShowPartitionsResponse> showPartitionsAsync(ShowPartitionsRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.showPartitions);
    }

    /**
     * 获取分区信息列表
     *
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowPartitionsRequest 请求对象
     * @return AsyncInvoker<ShowPartitionsRequest, ShowPartitionsResponse>
     */
    public AsyncInvoker<ShowPartitionsRequest, ShowPartitionsResponse> showPartitionsAsyncInvoker(
        ShowPartitionsRequest request) {
        return new AsyncInvoker<ShowPartitionsRequest, ShowPartitionsResponse>(request, DliMeta.showPartitions,
            hcClient);
    }

    /**
     * 查询队列详情
     *
     * 该API用于列出该project下指定的队列详情。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowQueueDetailRequest 请求对象
     * @return CompletableFuture<ShowQueueDetailResponse>
     */
    public CompletableFuture<ShowQueueDetailResponse> showQueueDetailAsync(ShowQueueDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.showQueueDetail);
    }

    /**
     * 查询队列详情
     *
     * 该API用于列出该project下指定的队列详情。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowQueueDetailRequest 请求对象
     * @return AsyncInvoker<ShowQueueDetailRequest, ShowQueueDetailResponse>
     */
    public AsyncInvoker<ShowQueueDetailRequest, ShowQueueDetailResponse> showQueueDetailAsyncInvoker(
        ShowQueueDetailRequest request) {
        return new AsyncInvoker<ShowQueueDetailRequest, ShowQueueDetailResponse>(request, DliMeta.showQueueDetail,
            hcClient);
    }

    /**
     * 预览表内容
     *
     * 该API用于用于预览表中前10行的内容。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowTableContentRequest 请求对象
     * @return CompletableFuture<ShowTableContentResponse>
     */
    public CompletableFuture<ShowTableContentResponse> showTableContentAsync(ShowTableContentRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.showTableContent);
    }

    /**
     * 预览表内容
     *
     * 该API用于用于预览表中前10行的内容。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowTableContentRequest 请求对象
     * @return AsyncInvoker<ShowTableContentRequest, ShowTableContentResponse>
     */
    public AsyncInvoker<ShowTableContentRequest, ShowTableContentResponse> showTableContentAsyncInvoker(
        ShowTableContentRequest request) {
        return new AsyncInvoker<ShowTableContentRequest, ShowTableContentResponse>(request, DliMeta.showTableContent,
            hcClient);
    }

    /**
     * 修改数据库用户
     *
     * 用于修改数据库的owner。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateDatabaseOwnerRequest 请求对象
     * @return CompletableFuture<UpdateDatabaseOwnerResponse>
     */
    public CompletableFuture<UpdateDatabaseOwnerResponse> updateDatabaseOwnerAsync(UpdateDatabaseOwnerRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.updateDatabaseOwner);
    }

    /**
     * 修改数据库用户
     *
     * 用于修改数据库的owner。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateDatabaseOwnerRequest 请求对象
     * @return AsyncInvoker<UpdateDatabaseOwnerRequest, UpdateDatabaseOwnerResponse>
     */
    public AsyncInvoker<UpdateDatabaseOwnerRequest, UpdateDatabaseOwnerResponse> updateDatabaseOwnerAsyncInvoker(
        UpdateDatabaseOwnerRequest request) {
        return new AsyncInvoker<UpdateDatabaseOwnerRequest, UpdateDatabaseOwnerResponse>(request,
            DliMeta.updateDatabaseOwner, hcClient);
    }

    /**
     * 修改队列网段
     *
     * 该功能用于修改包年包月队列网段。
     * 说明： 
     * 如果待修改网段的队列中有正在提交或正在运行的作业，或者改队列已经绑定了增强型跨源，将不支持修改网段操作。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateQueueCidrRequest 请求对象
     * @return CompletableFuture<UpdateQueueCidrResponse>
     */
    public CompletableFuture<UpdateQueueCidrResponse> updateQueueCidrAsync(UpdateQueueCidrRequest request) {
        return hcClient.asyncInvokeHttp(request, DliMeta.updateQueueCidr);
    }

    /**
     * 修改队列网段
     *
     * 该功能用于修改包年包月队列网段。
     * 说明： 
     * 如果待修改网段的队列中有正在提交或正在运行的作业，或者改队列已经绑定了增强型跨源，将不支持修改网段操作。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateQueueCidrRequest 请求对象
     * @return AsyncInvoker<UpdateQueueCidrRequest, UpdateQueueCidrResponse>
     */
    public AsyncInvoker<UpdateQueueCidrRequest, UpdateQueueCidrResponse> updateQueueCidrAsyncInvoker(
        UpdateQueueCidrRequest request) {
        return new AsyncInvoker<UpdateQueueCidrRequest, UpdateQueueCidrResponse>(request, DliMeta.updateQueueCidr,
            hcClient);
    }

}
