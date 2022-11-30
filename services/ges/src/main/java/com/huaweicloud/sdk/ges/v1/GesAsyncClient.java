package com.huaweicloud.sdk.ges.v1;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.ges.v1.model.*;

public class GesAsyncClient {
    protected HcClient hcClient;

    public GesAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<GesAsyncClient> newBuilder() {
        return new ClientBuilder<>(GesAsyncClient::new);
    }


    /**
     * 绑定EIP(1.0.6)
     *
     * 可以通过绑定弹性公网IP（简称EIP）访问GES服务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AttachEipRequest 请求对象
     * @return CompletableFuture<AttachEipResponse>
     */
    public CompletableFuture<AttachEipResponse> attachEipAsync(AttachEipRequest request) {
        return hcClient.asyncInvokeHttp(request, GesMeta.attachEip);
    }

    /**
     * 绑定EIP(1.0.6)
     *
     * 可以通过绑定弹性公网IP（简称EIP）访问GES服务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AttachEipRequest 请求对象
     * @return AsyncInvoker<AttachEipRequest, AttachEipResponse>
     */
    public AsyncInvoker<AttachEipRequest, AttachEipResponse> attachEipAsyncInvoker(AttachEipRequest request) {
        return new AsyncInvoker<AttachEipRequest, AttachEipResponse>(request, GesMeta.attachEip, hcClient);
    }

    /**
     * 清空图(2.1.2)
     *
     * 清空图中所有数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ClearGraphRequest 请求对象
     * @return CompletableFuture<ClearGraphResponse>
     */
    public CompletableFuture<ClearGraphResponse> clearGraphAsync(ClearGraphRequest request) {
        return hcClient.asyncInvokeHttp(request, GesMeta.clearGraph);
    }

    /**
     * 清空图(2.1.2)
     *
     * 清空图中所有数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ClearGraphRequest 请求对象
     * @return AsyncInvoker<ClearGraphRequest, ClearGraphResponse>
     */
    public AsyncInvoker<ClearGraphRequest, ClearGraphResponse> clearGraphAsyncInvoker(ClearGraphRequest request) {
        return new AsyncInvoker<ClearGraphRequest, ClearGraphResponse>(request, GesMeta.clearGraph, hcClient);
    }

    /**
     * 新增备份(1.0.0)
     *
     * 新增备份。当前图数据出现错误或故障时，可以启动备份图进行恢复。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateBackupRequest 请求对象
     * @return CompletableFuture<CreateBackupResponse>
     */
    public CompletableFuture<CreateBackupResponse> createBackupAsync(CreateBackupRequest request) {
        return hcClient.asyncInvokeHttp(request, GesMeta.createBackup);
    }

    /**
     * 新增备份(1.0.0)
     *
     * 新增备份。当前图数据出现错误或故障时，可以启动备份图进行恢复。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateBackupRequest 请求对象
     * @return AsyncInvoker<CreateBackupRequest, CreateBackupResponse>
     */
    public AsyncInvoker<CreateBackupRequest, CreateBackupResponse> createBackupAsyncInvoker(CreateBackupRequest request) {
        return new AsyncInvoker<CreateBackupRequest, CreateBackupResponse>(request, GesMeta.createBackup, hcClient);
    }

    /**
     * 创建图(2.2.2)
     *
     * 创建一个图。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateGraphRequest 请求对象
     * @return CompletableFuture<CreateGraphResponse>
     */
    public CompletableFuture<CreateGraphResponse> createGraphAsync(CreateGraphRequest request) {
        return hcClient.asyncInvokeHttp(request, GesMeta.createGraph);
    }

    /**
     * 创建图(2.2.2)
     *
     * 创建一个图。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateGraphRequest 请求对象
     * @return AsyncInvoker<CreateGraphRequest, CreateGraphResponse>
     */
    public AsyncInvoker<CreateGraphRequest, CreateGraphResponse> createGraphAsyncInvoker(CreateGraphRequest request) {
        return new AsyncInvoker<CreateGraphRequest, CreateGraphResponse>(request, GesMeta.createGraph, hcClient);
    }

    /**
     * 新增元数据(2.1.18)
     *
     * 新增元数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateMetadataRequest 请求对象
     * @return CompletableFuture<CreateMetadataResponse>
     */
    public CompletableFuture<CreateMetadataResponse> createMetadataAsync(CreateMetadataRequest request) {
        return hcClient.asyncInvokeHttp(request, GesMeta.createMetadata);
    }

    /**
     * 新增元数据(2.1.18)
     *
     * 新增元数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateMetadataRequest 请求对象
     * @return AsyncInvoker<CreateMetadataRequest, CreateMetadataResponse>
     */
    public AsyncInvoker<CreateMetadataRequest, CreateMetadataResponse> createMetadataAsyncInvoker(CreateMetadataRequest request) {
        return new AsyncInvoker<CreateMetadataRequest, CreateMetadataResponse>(request, GesMeta.createMetadata, hcClient);
    }

    /**
     * 删除备份(1.0.0)
     *
     * 删除备份。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteBackupRequest 请求对象
     * @return CompletableFuture<DeleteBackupResponse>
     */
    public CompletableFuture<DeleteBackupResponse> deleteBackupAsync(DeleteBackupRequest request) {
        return hcClient.asyncInvokeHttp(request, GesMeta.deleteBackup);
    }

    /**
     * 删除备份(1.0.0)
     *
     * 删除备份。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteBackupRequest 请求对象
     * @return AsyncInvoker<DeleteBackupRequest, DeleteBackupResponse>
     */
    public AsyncInvoker<DeleteBackupRequest, DeleteBackupResponse> deleteBackupAsyncInvoker(DeleteBackupRequest request) {
        return new AsyncInvoker<DeleteBackupRequest, DeleteBackupResponse>(request, GesMeta.deleteBackup, hcClient);
    }

    /**
     * 删除图(1.0.0)
     *
     * 删除一个图。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteGraphRequest 请求对象
     * @return CompletableFuture<DeleteGraphResponse>
     */
    public CompletableFuture<DeleteGraphResponse> deleteGraphAsync(DeleteGraphRequest request) {
        return hcClient.asyncInvokeHttp(request, GesMeta.deleteGraph);
    }

    /**
     * 删除图(1.0.0)
     *
     * 删除一个图。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteGraphRequest 请求对象
     * @return AsyncInvoker<DeleteGraphRequest, DeleteGraphResponse>
     */
    public AsyncInvoker<DeleteGraphRequest, DeleteGraphResponse> deleteGraphAsyncInvoker(DeleteGraphRequest request) {
        return new AsyncInvoker<DeleteGraphRequest, DeleteGraphResponse>(request, GesMeta.deleteGraph, hcClient);
    }

    /**
     * 删除元数据(1.0.2)
     *
     * 删除元数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteMetadataRequest 请求对象
     * @return CompletableFuture<DeleteMetadataResponse>
     */
    public CompletableFuture<DeleteMetadataResponse> deleteMetadataAsync(DeleteMetadataRequest request) {
        return hcClient.asyncInvokeHttp(request, GesMeta.deleteMetadata);
    }

    /**
     * 删除元数据(1.0.2)
     *
     * 删除元数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteMetadataRequest 请求对象
     * @return AsyncInvoker<DeleteMetadataRequest, DeleteMetadataResponse>
     */
    public AsyncInvoker<DeleteMetadataRequest, DeleteMetadataResponse> deleteMetadataAsyncInvoker(DeleteMetadataRequest request) {
        return new AsyncInvoker<DeleteMetadataRequest, DeleteMetadataResponse>(request, GesMeta.deleteMetadata, hcClient);
    }

    /**
     * 解绑EIP(1.0.6)
     *
     * 当无需继续使用EIP时，您可通过解绑EIP来释放网络资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DetachEipRequest 请求对象
     * @return CompletableFuture<DetachEipResponse>
     */
    public CompletableFuture<DetachEipResponse> detachEipAsync(DetachEipRequest request) {
        return hcClient.asyncInvokeHttp(request, GesMeta.detachEip);
    }

    /**
     * 解绑EIP(1.0.6)
     *
     * 当无需继续使用EIP时，您可通过解绑EIP来释放网络资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DetachEipRequest 请求对象
     * @return AsyncInvoker<DetachEipRequest, DetachEipResponse>
     */
    public AsyncInvoker<DetachEipRequest, DetachEipResponse> detachEipAsyncInvoker(DetachEipRequest request) {
        return new AsyncInvoker<DetachEipRequest, DetachEipResponse>(request, GesMeta.detachEip, hcClient);
    }

    /**
     * 扩副本(2.2.23)
     *
     * 扩副本能力允许动态扩容多个从节点，扩容的从节点可以处理读请求，从而提高读请求性能。
     * &gt;一万边和百亿边规格的图暂不支持扩副本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ExpandGraphRequest 请求对象
     * @return CompletableFuture<ExpandGraphResponse>
     */
    public CompletableFuture<ExpandGraphResponse> expandGraphAsync(ExpandGraphRequest request) {
        return hcClient.asyncInvokeHttp(request, GesMeta.expandGraph);
    }

    /**
     * 扩副本(2.2.23)
     *
     * 扩副本能力允许动态扩容多个从节点，扩容的从节点可以处理读请求，从而提高读请求性能。
     * &gt;一万边和百亿边规格的图暂不支持扩副本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ExpandGraphRequest 请求对象
     * @return AsyncInvoker<ExpandGraphRequest, ExpandGraphResponse>
     */
    public AsyncInvoker<ExpandGraphRequest, ExpandGraphResponse> expandGraphAsyncInvoker(ExpandGraphRequest request) {
        return new AsyncInvoker<ExpandGraphRequest, ExpandGraphResponse>(request, GesMeta.expandGraph, hcClient);
    }

    /**
     * 导出图(1.0.5)
     *
     * 导出图。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ExportGraphRequest 请求对象
     * @return CompletableFuture<ExportGraphResponse>
     */
    public CompletableFuture<ExportGraphResponse> exportGraphAsync(ExportGraphRequest request) {
        return hcClient.asyncInvokeHttp(request, GesMeta.exportGraph);
    }

    /**
     * 导出图(1.0.5)
     *
     * 导出图。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ExportGraphRequest 请求对象
     * @return AsyncInvoker<ExportGraphRequest, ExportGraphResponse>
     */
    public AsyncInvoker<ExportGraphRequest, ExportGraphResponse> exportGraphAsyncInvoker(ExportGraphRequest request) {
        return new AsyncInvoker<ExportGraphRequest, ExportGraphResponse>(request, GesMeta.exportGraph, hcClient);
    }

    /**
     * 增量导入图(2.1.14)
     *
     * 增量导入图数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ImportGraphRequest 请求对象
     * @return CompletableFuture<ImportGraphResponse>
     */
    public CompletableFuture<ImportGraphResponse> importGraphAsync(ImportGraphRequest request) {
        return hcClient.asyncInvokeHttp(request, GesMeta.importGraph);
    }

    /**
     * 增量导入图(2.1.14)
     *
     * 增量导入图数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ImportGraphRequest 请求对象
     * @return AsyncInvoker<ImportGraphRequest, ImportGraphResponse>
     */
    public AsyncInvoker<ImportGraphRequest, ImportGraphResponse> importGraphAsyncInvoker(ImportGraphRequest request) {
        return new AsyncInvoker<ImportGraphRequest, ImportGraphResponse>(request, GesMeta.importGraph, hcClient);
    }

    /**
     * 查看所有备份列表(1.0.0)
     *
     * 查询备份列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListBackupsRequest 请求对象
     * @return CompletableFuture<ListBackupsResponse>
     */
    public CompletableFuture<ListBackupsResponse> listBackupsAsync(ListBackupsRequest request) {
        return hcClient.asyncInvokeHttp(request, GesMeta.listBackups);
    }

    /**
     * 查看所有备份列表(1.0.0)
     *
     * 查询备份列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListBackupsRequest 请求对象
     * @return AsyncInvoker<ListBackupsRequest, ListBackupsResponse>
     */
    public AsyncInvoker<ListBackupsRequest, ListBackupsResponse> listBackupsAsyncInvoker(ListBackupsRequest request) {
        return new AsyncInvoker<ListBackupsRequest, ListBackupsResponse>(request, GesMeta.listBackups, hcClient);
    }

    /**
     * 查看某个图的备份列表(1.0.0)
     *
     * 查询某个图下的备份列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListGraphBackupsRequest 请求对象
     * @return CompletableFuture<ListGraphBackupsResponse>
     */
    public CompletableFuture<ListGraphBackupsResponse> listGraphBackupsAsync(ListGraphBackupsRequest request) {
        return hcClient.asyncInvokeHttp(request, GesMeta.listGraphBackups);
    }

    /**
     * 查看某个图的备份列表(1.0.0)
     *
     * 查询某个图下的备份列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListGraphBackupsRequest 请求对象
     * @return AsyncInvoker<ListGraphBackupsRequest, ListGraphBackupsResponse>
     */
    public AsyncInvoker<ListGraphBackupsRequest, ListGraphBackupsResponse> listGraphBackupsAsyncInvoker(ListGraphBackupsRequest request) {
        return new AsyncInvoker<ListGraphBackupsRequest, ListGraphBackupsResponse>(request, GesMeta.listGraphBackups, hcClient);
    }

    /**
     * 查询元数据(1.0.2)
     *
     * 查询某个图下的元数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListGraphMetadatasRequest 请求对象
     * @return CompletableFuture<ListGraphMetadatasResponse>
     */
    public CompletableFuture<ListGraphMetadatasResponse> listGraphMetadatasAsync(ListGraphMetadatasRequest request) {
        return hcClient.asyncInvokeHttp(request, GesMeta.listGraphMetadatas);
    }

    /**
     * 查询元数据(1.0.2)
     *
     * 查询某个图下的元数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListGraphMetadatasRequest 请求对象
     * @return AsyncInvoker<ListGraphMetadatasRequest, ListGraphMetadatasResponse>
     */
    public AsyncInvoker<ListGraphMetadatasRequest, ListGraphMetadatasResponse> listGraphMetadatasAsyncInvoker(ListGraphMetadatasRequest request) {
        return new AsyncInvoker<ListGraphMetadatasRequest, ListGraphMetadatasResponse>(request, GesMeta.listGraphMetadatas, hcClient);
    }

    /**
     * 查询图列表(2.1.18)
     *
     * 查询当前租户所有的图。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListGraphsRequest 请求对象
     * @return CompletableFuture<ListGraphsResponse>
     */
    public CompletableFuture<ListGraphsResponse> listGraphsAsync(ListGraphsRequest request) {
        return hcClient.asyncInvokeHttp(request, GesMeta.listGraphs);
    }

    /**
     * 查询图列表(2.1.18)
     *
     * 查询当前租户所有的图。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListGraphsRequest 请求对象
     * @return AsyncInvoker<ListGraphsRequest, ListGraphsResponse>
     */
    public AsyncInvoker<ListGraphsRequest, ListGraphsResponse> listGraphsAsyncInvoker(ListGraphsRequest request) {
        return new AsyncInvoker<ListGraphsRequest, ListGraphsResponse>(request, GesMeta.listGraphs, hcClient);
    }

    /**
     * 查询任务中心(1.1.8)
     *
     * 查询管理面任务中心。当前创建图、关闭图、启动图、删除图、增加备份、导入图、导出图、升级图等操作为异步任务，该API用于查询这些任务的详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListJobsRequest 请求对象
     * @return CompletableFuture<ListJobsResponse>
     */
    public CompletableFuture<ListJobsResponse> listJobsAsync(ListJobsRequest request) {
        return hcClient.asyncInvokeHttp(request, GesMeta.listJobs);
    }

    /**
     * 查询任务中心(1.1.8)
     *
     * 查询管理面任务中心。当前创建图、关闭图、启动图、删除图、增加备份、导入图、导出图、升级图等操作为异步任务，该API用于查询这些任务的详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListJobsRequest 请求对象
     * @return AsyncInvoker<ListJobsRequest, ListJobsResponse>
     */
    public AsyncInvoker<ListJobsRequest, ListJobsResponse> listJobsAsyncInvoker(ListJobsRequest request) {
        return new AsyncInvoker<ListJobsRequest, ListJobsResponse>(request, GesMeta.listJobs, hcClient);
    }

    /**
     * 查询元数据列表(1.0.2)
     *
     * 查询元数据列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListMetadatasRequest 请求对象
     * @return CompletableFuture<ListMetadatasResponse>
     */
    public CompletableFuture<ListMetadatasResponse> listMetadatasAsync(ListMetadatasRequest request) {
        return hcClient.asyncInvokeHttp(request, GesMeta.listMetadatas);
    }

    /**
     * 查询元数据列表(1.0.2)
     *
     * 查询元数据列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListMetadatasRequest 请求对象
     * @return AsyncInvoker<ListMetadatasRequest, ListMetadatasResponse>
     */
    public AsyncInvoker<ListMetadatasRequest, ListMetadatasResponse> listMetadatasAsyncInvoker(ListMetadatasRequest request) {
        return new AsyncInvoker<ListMetadatasRequest, ListMetadatasResponse>(request, GesMeta.listMetadatas, hcClient);
    }

    /**
     * 查询配额(1.0.0)
     *
     * 查询租户配额。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListQuotasRequest 请求对象
     * @return CompletableFuture<ListQuotasResponse>
     */
    public CompletableFuture<ListQuotasResponse> listQuotasAsync(ListQuotasRequest request) {
        return hcClient.asyncInvokeHttp(request, GesMeta.listQuotas);
    }

    /**
     * 查询配额(1.0.0)
     *
     * 查询租户配额。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListQuotasRequest 请求对象
     * @return AsyncInvoker<ListQuotasRequest, ListQuotasResponse>
     */
    public AsyncInvoker<ListQuotasRequest, ListQuotasResponse> listQuotasAsyncInvoker(ListQuotasRequest request) {
        return new AsyncInvoker<ListQuotasRequest, ListQuotasResponse>(request, GesMeta.listQuotas, hcClient);
    }

    /**
     * 扩容图(2.2.21)
     *
     * 扩容图规格。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ResizeGraphRequest 请求对象
     * @return CompletableFuture<ResizeGraphResponse>
     */
    public CompletableFuture<ResizeGraphResponse> resizeGraphAsync(ResizeGraphRequest request) {
        return hcClient.asyncInvokeHttp(request, GesMeta.resizeGraph);
    }

    /**
     * 扩容图(2.2.21)
     *
     * 扩容图规格。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ResizeGraphRequest 请求对象
     * @return AsyncInvoker<ResizeGraphRequest, ResizeGraphResponse>
     */
    public AsyncInvoker<ResizeGraphRequest, ResizeGraphResponse> resizeGraphAsyncInvoker(ResizeGraphRequest request) {
        return new AsyncInvoker<ResizeGraphRequest, ResizeGraphResponse>(request, GesMeta.resizeGraph, hcClient);
    }

    /**
     * 强制重启图(2.2.21)
     *
     * 强制启动一个图。针对导入、导出 、运行中 、清空中的图。强制重启图，会将该图执行中的异步任务变为失败，然后停止图、启动图到运行状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RestartGraphRequest 请求对象
     * @return CompletableFuture<RestartGraphResponse>
     */
    public CompletableFuture<RestartGraphResponse> restartGraphAsync(RestartGraphRequest request) {
        return hcClient.asyncInvokeHttp(request, GesMeta.restartGraph);
    }

    /**
     * 强制重启图(2.2.21)
     *
     * 强制启动一个图。针对导入、导出 、运行中 、清空中的图。强制重启图，会将该图执行中的异步任务变为失败，然后停止图、启动图到运行状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RestartGraphRequest 请求对象
     * @return AsyncInvoker<RestartGraphRequest, RestartGraphResponse>
     */
    public AsyncInvoker<RestartGraphRequest, RestartGraphResponse> restartGraphAsyncInvoker(RestartGraphRequest request) {
        return new AsyncInvoker<RestartGraphRequest, RestartGraphResponse>(request, GesMeta.restartGraph, hcClient);
    }

    /**
     * 查询图详情(1.0.0)
     *
     * 根据图ID查询某个图详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowGraphRequest 请求对象
     * @return CompletableFuture<ShowGraphResponse>
     */
    public CompletableFuture<ShowGraphResponse> showGraphAsync(ShowGraphRequest request) {
        return hcClient.asyncInvokeHttp(request, GesMeta.showGraph);
    }

    /**
     * 查询图详情(1.0.0)
     *
     * 根据图ID查询某个图详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowGraphRequest 请求对象
     * @return AsyncInvoker<ShowGraphRequest, ShowGraphResponse>
     */
    public AsyncInvoker<ShowGraphRequest, ShowGraphResponse> showGraphAsyncInvoker(ShowGraphRequest request) {
        return new AsyncInvoker<ShowGraphRequest, ShowGraphResponse>(request, GesMeta.showGraph, hcClient);
    }

    /**
     * 查询Job状态(1.0.0)-管理面
     *
     * 查询Job的执行状态。对创建图、关闭图、启动图、删除图、导入图等异步API命令下发后，会返回jobId，通过jobId查询任务的执行状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowJobRequest 请求对象
     * @return CompletableFuture<ShowJobResponse>
     */
    public CompletableFuture<ShowJobResponse> showJobAsync(ShowJobRequest request) {
        return hcClient.asyncInvokeHttp(request, GesMeta.showJob);
    }

    /**
     * 查询Job状态(1.0.0)-管理面
     *
     * 查询Job的执行状态。对创建图、关闭图、启动图、删除图、导入图等异步API命令下发后，会返回jobId，通过jobId查询任务的执行状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowJobRequest 请求对象
     * @return AsyncInvoker<ShowJobRequest, ShowJobResponse>
     */
    public AsyncInvoker<ShowJobRequest, ShowJobResponse> showJobAsyncInvoker(ShowJobRequest request) {
        return new AsyncInvoker<ShowJobRequest, ShowJobResponse>(request, GesMeta.showJob, hcClient);
    }

    /**
     * 启动图(1.0.0)
     *
     * 启动一个图。暂时不用的图可以先关闭，需要使用时再启动。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StartGraphRequest 请求对象
     * @return CompletableFuture<StartGraphResponse>
     */
    public CompletableFuture<StartGraphResponse> startGraphAsync(StartGraphRequest request) {
        return hcClient.asyncInvokeHttp(request, GesMeta.startGraph);
    }

    /**
     * 启动图(1.0.0)
     *
     * 启动一个图。暂时不用的图可以先关闭，需要使用时再启动。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StartGraphRequest 请求对象
     * @return AsyncInvoker<StartGraphRequest, StartGraphResponse>
     */
    public AsyncInvoker<StartGraphRequest, StartGraphResponse> startGraphAsyncInvoker(StartGraphRequest request) {
        return new AsyncInvoker<StartGraphRequest, StartGraphResponse>(request, GesMeta.startGraph, hcClient);
    }

    /**
     * 关闭图(1.0.0)
     *
     * 关闭一个图。如果图创建好了，暂时不用可以先关闭，需要使用时再启用。
     * &gt;处于关闭状态的图不计算实例费用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StopGraphRequest 请求对象
     * @return CompletableFuture<StopGraphResponse>
     */
    public CompletableFuture<StopGraphResponse> stopGraphAsync(StopGraphRequest request) {
        return hcClient.asyncInvokeHttp(request, GesMeta.stopGraph);
    }

    /**
     * 关闭图(1.0.0)
     *
     * 关闭一个图。如果图创建好了，暂时不用可以先关闭，需要使用时再启用。
     * &gt;处于关闭状态的图不计算实例费用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StopGraphRequest 请求对象
     * @return AsyncInvoker<StopGraphRequest, StopGraphResponse>
     */
    public AsyncInvoker<StopGraphRequest, StopGraphResponse> stopGraphAsyncInvoker(StopGraphRequest request) {
        return new AsyncInvoker<StopGraphRequest, StopGraphResponse>(request, GesMeta.stopGraph, hcClient);
    }

    /**
     * 升级图(1.0.5)
     *
     * 升级图。图引擎服务会定期升级版本，用户可根据需要升级图。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpgradeGraphRequest 请求对象
     * @return CompletableFuture<UpgradeGraphResponse>
     */
    public CompletableFuture<UpgradeGraphResponse> upgradeGraphAsync(UpgradeGraphRequest request) {
        return hcClient.asyncInvokeHttp(request, GesMeta.upgradeGraph);
    }

    /**
     * 升级图(1.0.5)
     *
     * 升级图。图引擎服务会定期升级版本，用户可根据需要升级图。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpgradeGraphRequest 请求对象
     * @return AsyncInvoker<UpgradeGraphRequest, UpgradeGraphResponse>
     */
    public AsyncInvoker<UpgradeGraphRequest, UpgradeGraphResponse> upgradeGraphAsyncInvoker(UpgradeGraphRequest request) {
        return new AsyncInvoker<UpgradeGraphRequest, UpgradeGraphResponse>(request, GesMeta.upgradeGraph, hcClient);
    }

    /**
     * 从OBS导入元数据(1.0.0)
     *
     * 从OBS导入元数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UploadFromObsRequest 请求对象
     * @return CompletableFuture<UploadFromObsResponse>
     */
    public CompletableFuture<UploadFromObsResponse> uploadFromObsAsync(UploadFromObsRequest request) {
        return hcClient.asyncInvokeHttp(request, GesMeta.uploadFromObs);
    }

    /**
     * 从OBS导入元数据(1.0.0)
     *
     * 从OBS导入元数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UploadFromObsRequest 请求对象
     * @return AsyncInvoker<UploadFromObsRequest, UploadFromObsResponse>
     */
    public AsyncInvoker<UploadFromObsRequest, UploadFromObsResponse> uploadFromObsAsyncInvoker(UploadFromObsRequest request) {
        return new AsyncInvoker<UploadFromObsRequest, UploadFromObsResponse>(request, GesMeta.uploadFromObs, hcClient);
    }

}