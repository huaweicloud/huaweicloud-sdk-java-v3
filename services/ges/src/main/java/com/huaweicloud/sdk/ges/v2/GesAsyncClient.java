package com.huaweicloud.sdk.ges.v2;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.ges.v2.model.AttachEip2Request;
import com.huaweicloud.sdk.ges.v2.model.AttachEip2Response;
import com.huaweicloud.sdk.ges.v2.model.ClearGraph2Request;
import com.huaweicloud.sdk.ges.v2.model.ClearGraph2Response;
import com.huaweicloud.sdk.ges.v2.model.CreateBackup2Request;
import com.huaweicloud.sdk.ges.v2.model.CreateBackup2Response;
import com.huaweicloud.sdk.ges.v2.model.CreateGraph2Request;
import com.huaweicloud.sdk.ges.v2.model.CreateGraph2Response;
import com.huaweicloud.sdk.ges.v2.model.CreateMetadata2Request;
import com.huaweicloud.sdk.ges.v2.model.CreateMetadata2Response;
import com.huaweicloud.sdk.ges.v2.model.DeleteBackup2Request;
import com.huaweicloud.sdk.ges.v2.model.DeleteBackup2Response;
import com.huaweicloud.sdk.ges.v2.model.DeleteGraph2Request;
import com.huaweicloud.sdk.ges.v2.model.DeleteGraph2Response;
import com.huaweicloud.sdk.ges.v2.model.DeleteMetadata2Request;
import com.huaweicloud.sdk.ges.v2.model.DeleteMetadata2Response;
import com.huaweicloud.sdk.ges.v2.model.DeregisterScenes2Request;
import com.huaweicloud.sdk.ges.v2.model.DeregisterScenes2Response;
import com.huaweicloud.sdk.ges.v2.model.DetachEip2Request;
import com.huaweicloud.sdk.ges.v2.model.DetachEip2Response;
import com.huaweicloud.sdk.ges.v2.model.ExpandGraph2Request;
import com.huaweicloud.sdk.ges.v2.model.ExpandGraph2Response;
import com.huaweicloud.sdk.ges.v2.model.ExportBackup2Request;
import com.huaweicloud.sdk.ges.v2.model.ExportBackup2Response;
import com.huaweicloud.sdk.ges.v2.model.ExportGraph2Request;
import com.huaweicloud.sdk.ges.v2.model.ExportGraph2Response;
import com.huaweicloud.sdk.ges.v2.model.ImportBackup2Request;
import com.huaweicloud.sdk.ges.v2.model.ImportBackup2Response;
import com.huaweicloud.sdk.ges.v2.model.ImportGraph2Request;
import com.huaweicloud.sdk.ges.v2.model.ImportGraph2Response;
import com.huaweicloud.sdk.ges.v2.model.ListBackups2Request;
import com.huaweicloud.sdk.ges.v2.model.ListBackups2Response;
import com.huaweicloud.sdk.ges.v2.model.ListGraphBackups2Request;
import com.huaweicloud.sdk.ges.v2.model.ListGraphBackups2Response;
import com.huaweicloud.sdk.ges.v2.model.ListGraphs2Request;
import com.huaweicloud.sdk.ges.v2.model.ListGraphs2Response;
import com.huaweicloud.sdk.ges.v2.model.ListJobs2Request;
import com.huaweicloud.sdk.ges.v2.model.ListJobs2Response;
import com.huaweicloud.sdk.ges.v2.model.ListMetadatas2Request;
import com.huaweicloud.sdk.ges.v2.model.ListMetadatas2Response;
import com.huaweicloud.sdk.ges.v2.model.ListQuotas2Request;
import com.huaweicloud.sdk.ges.v2.model.ListQuotas2Response;
import com.huaweicloud.sdk.ges.v2.model.ListScenes2Request;
import com.huaweicloud.sdk.ges.v2.model.ListScenes2Response;
import com.huaweicloud.sdk.ges.v2.model.RegisterScenes2Request;
import com.huaweicloud.sdk.ges.v2.model.RegisterScenes2Response;
import com.huaweicloud.sdk.ges.v2.model.ResizeGraph2Request;
import com.huaweicloud.sdk.ges.v2.model.ResizeGraph2Response;
import com.huaweicloud.sdk.ges.v2.model.RestartGraph2Request;
import com.huaweicloud.sdk.ges.v2.model.RestartGraph2Response;
import com.huaweicloud.sdk.ges.v2.model.ShowGraph2Request;
import com.huaweicloud.sdk.ges.v2.model.ShowGraph2Response;
import com.huaweicloud.sdk.ges.v2.model.ShowJob2Request;
import com.huaweicloud.sdk.ges.v2.model.ShowJob2Response;
import com.huaweicloud.sdk.ges.v2.model.ShowMetadata2Request;
import com.huaweicloud.sdk.ges.v2.model.ShowMetadata2Response;
import com.huaweicloud.sdk.ges.v2.model.StartGraph2Request;
import com.huaweicloud.sdk.ges.v2.model.StartGraph2Response;
import com.huaweicloud.sdk.ges.v2.model.StopGraph2Request;
import com.huaweicloud.sdk.ges.v2.model.StopGraph2Response;
import com.huaweicloud.sdk.ges.v2.model.UpgradeGraph2Request;
import com.huaweicloud.sdk.ges.v2.model.UpgradeGraph2Response;
import com.huaweicloud.sdk.ges.v2.model.UploadFromObs2Request;
import com.huaweicloud.sdk.ges.v2.model.UploadFromObs2Response;

import java.util.concurrent.CompletableFuture;

public class GesAsyncClient {

    protected HcClient hcClient;

    public GesAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<GesAsyncClient> newBuilder() {
        ClientBuilder<GesAsyncClient> clientBuilder = new ClientBuilder<>(GesAsyncClient::new);
        return clientBuilder;
    }

    /**
     * 绑定EIP
     *
     * 可以通过绑定弹性公网IP（简称EIP）访问GES服务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AttachEip2Request 请求对象
     * @return CompletableFuture<AttachEip2Response>
     */
    public CompletableFuture<AttachEip2Response> attachEip2Async(AttachEip2Request request) {
        return hcClient.asyncInvokeHttp(request, GesMeta.attachEip2);
    }

    /**
     * 绑定EIP
     *
     * 可以通过绑定弹性公网IP（简称EIP）访问GES服务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AttachEip2Request 请求对象
     * @return AsyncInvoker<AttachEip2Request, AttachEip2Response>
     */
    public AsyncInvoker<AttachEip2Request, AttachEip2Response> attachEip2AsyncInvoker(AttachEip2Request request) {
        return new AsyncInvoker<>(request, GesMeta.attachEip2, hcClient);
    }

    /**
     * 清空图
     *
     * 清空图中所有数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ClearGraph2Request 请求对象
     * @return CompletableFuture<ClearGraph2Response>
     */
    public CompletableFuture<ClearGraph2Response> clearGraph2Async(ClearGraph2Request request) {
        return hcClient.asyncInvokeHttp(request, GesMeta.clearGraph2);
    }

    /**
     * 清空图
     *
     * 清空图中所有数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ClearGraph2Request 请求对象
     * @return AsyncInvoker<ClearGraph2Request, ClearGraph2Response>
     */
    public AsyncInvoker<ClearGraph2Request, ClearGraph2Response> clearGraph2AsyncInvoker(ClearGraph2Request request) {
        return new AsyncInvoker<>(request, GesMeta.clearGraph2, hcClient);
    }

    /**
     * 新增备份
     *
     * 新增备份。当前图数据出现错误或故障时，可以启动备份图进行恢复。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateBackup2Request 请求对象
     * @return CompletableFuture<CreateBackup2Response>
     */
    public CompletableFuture<CreateBackup2Response> createBackup2Async(CreateBackup2Request request) {
        return hcClient.asyncInvokeHttp(request, GesMeta.createBackup2);
    }

    /**
     * 新增备份
     *
     * 新增备份。当前图数据出现错误或故障时，可以启动备份图进行恢复。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateBackup2Request 请求对象
     * @return AsyncInvoker<CreateBackup2Request, CreateBackup2Response>
     */
    public AsyncInvoker<CreateBackup2Request, CreateBackup2Response> createBackup2AsyncInvoker(
        CreateBackup2Request request) {
        return new AsyncInvoker<>(request, GesMeta.createBackup2, hcClient);
    }

    /**
     * 创建图
     *
     * 创建一个图。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateGraph2Request 请求对象
     * @return CompletableFuture<CreateGraph2Response>
     */
    public CompletableFuture<CreateGraph2Response> createGraph2Async(CreateGraph2Request request) {
        return hcClient.asyncInvokeHttp(request, GesMeta.createGraph2);
    }

    /**
     * 创建图
     *
     * 创建一个图。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateGraph2Request 请求对象
     * @return AsyncInvoker<CreateGraph2Request, CreateGraph2Response>
     */
    public AsyncInvoker<CreateGraph2Request, CreateGraph2Response> createGraph2AsyncInvoker(
        CreateGraph2Request request) {
        return new AsyncInvoker<>(request, GesMeta.createGraph2, hcClient);
    }

    /**
     * 新增元数据
     *
     * 新增元数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateMetadata2Request 请求对象
     * @return CompletableFuture<CreateMetadata2Response>
     */
    public CompletableFuture<CreateMetadata2Response> createMetadata2Async(CreateMetadata2Request request) {
        return hcClient.asyncInvokeHttp(request, GesMeta.createMetadata2);
    }

    /**
     * 新增元数据
     *
     * 新增元数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateMetadata2Request 请求对象
     * @return AsyncInvoker<CreateMetadata2Request, CreateMetadata2Response>
     */
    public AsyncInvoker<CreateMetadata2Request, CreateMetadata2Response> createMetadata2AsyncInvoker(
        CreateMetadata2Request request) {
        return new AsyncInvoker<>(request, GesMeta.createMetadata2, hcClient);
    }

    /**
     * 删除备份
     *
     * 删除备份。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteBackup2Request 请求对象
     * @return CompletableFuture<DeleteBackup2Response>
     */
    public CompletableFuture<DeleteBackup2Response> deleteBackup2Async(DeleteBackup2Request request) {
        return hcClient.asyncInvokeHttp(request, GesMeta.deleteBackup2);
    }

    /**
     * 删除备份
     *
     * 删除备份。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteBackup2Request 请求对象
     * @return AsyncInvoker<DeleteBackup2Request, DeleteBackup2Response>
     */
    public AsyncInvoker<DeleteBackup2Request, DeleteBackup2Response> deleteBackup2AsyncInvoker(
        DeleteBackup2Request request) {
        return new AsyncInvoker<>(request, GesMeta.deleteBackup2, hcClient);
    }

    /**
     * 删除图
     *
     * 删除一个图。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteGraph2Request 请求对象
     * @return CompletableFuture<DeleteGraph2Response>
     */
    public CompletableFuture<DeleteGraph2Response> deleteGraph2Async(DeleteGraph2Request request) {
        return hcClient.asyncInvokeHttp(request, GesMeta.deleteGraph2);
    }

    /**
     * 删除图
     *
     * 删除一个图。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteGraph2Request 请求对象
     * @return AsyncInvoker<DeleteGraph2Request, DeleteGraph2Response>
     */
    public AsyncInvoker<DeleteGraph2Request, DeleteGraph2Response> deleteGraph2AsyncInvoker(
        DeleteGraph2Request request) {
        return new AsyncInvoker<>(request, GesMeta.deleteGraph2, hcClient);
    }

    /**
     * 删除元数据
     *
     * 删除元数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteMetadata2Request 请求对象
     * @return CompletableFuture<DeleteMetadata2Response>
     */
    public CompletableFuture<DeleteMetadata2Response> deleteMetadata2Async(DeleteMetadata2Request request) {
        return hcClient.asyncInvokeHttp(request, GesMeta.deleteMetadata2);
    }

    /**
     * 删除元数据
     *
     * 删除元数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteMetadata2Request 请求对象
     * @return AsyncInvoker<DeleteMetadata2Request, DeleteMetadata2Response>
     */
    public AsyncInvoker<DeleteMetadata2Request, DeleteMetadata2Response> deleteMetadata2AsyncInvoker(
        DeleteMetadata2Request request) {
        return new AsyncInvoker<>(request, GesMeta.deleteMetadata2, hcClient);
    }

    /**
     * 解绑EIP
     *
     * 当无需继续使用EIP时，您可通过解绑EIP来释放网络资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DetachEip2Request 请求对象
     * @return CompletableFuture<DetachEip2Response>
     */
    public CompletableFuture<DetachEip2Response> detachEip2Async(DetachEip2Request request) {
        return hcClient.asyncInvokeHttp(request, GesMeta.detachEip2);
    }

    /**
     * 解绑EIP
     *
     * 当无需继续使用EIP时，您可通过解绑EIP来释放网络资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DetachEip2Request 请求对象
     * @return AsyncInvoker<DetachEip2Request, DetachEip2Response>
     */
    public AsyncInvoker<DetachEip2Request, DetachEip2Response> detachEip2AsyncInvoker(DetachEip2Request request) {
        return new AsyncInvoker<>(request, GesMeta.detachEip2, hcClient);
    }

    /**
     * 扩副本
     *
     * 扩副本能力允许动态扩容多个从节点，扩容的从节点可以处理读请求，从而提高读请求性能。
     * &gt; 1.一万边和百亿边规格的图暂不支持扩副本。
     * 2.进行扩副本操作后，不支持扩容图操作。
     * 3.如果要对图进行扩容和扩副本两个操作，需要您先进行扩容图操作，再进行扩副本操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExpandGraph2Request 请求对象
     * @return CompletableFuture<ExpandGraph2Response>
     */
    public CompletableFuture<ExpandGraph2Response> expandGraph2Async(ExpandGraph2Request request) {
        return hcClient.asyncInvokeHttp(request, GesMeta.expandGraph2);
    }

    /**
     * 扩副本
     *
     * 扩副本能力允许动态扩容多个从节点，扩容的从节点可以处理读请求，从而提高读请求性能。
     * &gt; 1.一万边和百亿边规格的图暂不支持扩副本。
     * 2.进行扩副本操作后，不支持扩容图操作。
     * 3.如果要对图进行扩容和扩副本两个操作，需要您先进行扩容图操作，再进行扩副本操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExpandGraph2Request 请求对象
     * @return AsyncInvoker<ExpandGraph2Request, ExpandGraph2Response>
     */
    public AsyncInvoker<ExpandGraph2Request, ExpandGraph2Response> expandGraph2AsyncInvoker(
        ExpandGraph2Request request) {
        return new AsyncInvoker<>(request, GesMeta.expandGraph2, hcClient);
    }

    /**
     * 导出备份
     *
     * 导出备份
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportBackup2Request 请求对象
     * @return CompletableFuture<ExportBackup2Response>
     */
    public CompletableFuture<ExportBackup2Response> exportBackup2Async(ExportBackup2Request request) {
        return hcClient.asyncInvokeHttp(request, GesMeta.exportBackup2);
    }

    /**
     * 导出备份
     *
     * 导出备份
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportBackup2Request 请求对象
     * @return AsyncInvoker<ExportBackup2Request, ExportBackup2Response>
     */
    public AsyncInvoker<ExportBackup2Request, ExportBackup2Response> exportBackup2AsyncInvoker(
        ExportBackup2Request request) {
        return new AsyncInvoker<>(request, GesMeta.exportBackup2, hcClient);
    }

    /**
     * 导出图
     *
     * 导出图。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportGraph2Request 请求对象
     * @return CompletableFuture<ExportGraph2Response>
     */
    public CompletableFuture<ExportGraph2Response> exportGraph2Async(ExportGraph2Request request) {
        return hcClient.asyncInvokeHttp(request, GesMeta.exportGraph2);
    }

    /**
     * 导出图
     *
     * 导出图。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportGraph2Request 请求对象
     * @return AsyncInvoker<ExportGraph2Request, ExportGraph2Response>
     */
    public AsyncInvoker<ExportGraph2Request, ExportGraph2Response> exportGraph2AsyncInvoker(
        ExportGraph2Request request) {
        return new AsyncInvoker<>(request, GesMeta.exportGraph2, hcClient);
    }

    /**
     * 导入备份
     *
     * 导入备份
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ImportBackup2Request 请求对象
     * @return CompletableFuture<ImportBackup2Response>
     */
    public CompletableFuture<ImportBackup2Response> importBackup2Async(ImportBackup2Request request) {
        return hcClient.asyncInvokeHttp(request, GesMeta.importBackup2);
    }

    /**
     * 导入备份
     *
     * 导入备份
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ImportBackup2Request 请求对象
     * @return AsyncInvoker<ImportBackup2Request, ImportBackup2Response>
     */
    public AsyncInvoker<ImportBackup2Request, ImportBackup2Response> importBackup2AsyncInvoker(
        ImportBackup2Request request) {
        return new AsyncInvoker<>(request, GesMeta.importBackup2, hcClient);
    }

    /**
     * 增量导入图
     *
     * 增量导入图数据。
     * &gt; 为防止系统重启时，不能正常恢复导入图数据，建议在使用图期间，不要删除存储在OBS中的数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ImportGraph2Request 请求对象
     * @return CompletableFuture<ImportGraph2Response>
     */
    public CompletableFuture<ImportGraph2Response> importGraph2Async(ImportGraph2Request request) {
        return hcClient.asyncInvokeHttp(request, GesMeta.importGraph2);
    }

    /**
     * 增量导入图
     *
     * 增量导入图数据。
     * &gt; 为防止系统重启时，不能正常恢复导入图数据，建议在使用图期间，不要删除存储在OBS中的数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ImportGraph2Request 请求对象
     * @return AsyncInvoker<ImportGraph2Request, ImportGraph2Response>
     */
    public AsyncInvoker<ImportGraph2Request, ImportGraph2Response> importGraph2AsyncInvoker(
        ImportGraph2Request request) {
        return new AsyncInvoker<>(request, GesMeta.importGraph2, hcClient);
    }

    /**
     * 查看所有备份列表
     *
     * 查询备份列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBackups2Request 请求对象
     * @return CompletableFuture<ListBackups2Response>
     */
    public CompletableFuture<ListBackups2Response> listBackups2Async(ListBackups2Request request) {
        return hcClient.asyncInvokeHttp(request, GesMeta.listBackups2);
    }

    /**
     * 查看所有备份列表
     *
     * 查询备份列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBackups2Request 请求对象
     * @return AsyncInvoker<ListBackups2Request, ListBackups2Response>
     */
    public AsyncInvoker<ListBackups2Request, ListBackups2Response> listBackups2AsyncInvoker(
        ListBackups2Request request) {
        return new AsyncInvoker<>(request, GesMeta.listBackups2, hcClient);
    }

    /**
     * 查看某个图的备份列表
     *
     * 查询某个图下的备份列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGraphBackups2Request 请求对象
     * @return CompletableFuture<ListGraphBackups2Response>
     */
    public CompletableFuture<ListGraphBackups2Response> listGraphBackups2Async(ListGraphBackups2Request request) {
        return hcClient.asyncInvokeHttp(request, GesMeta.listGraphBackups2);
    }

    /**
     * 查看某个图的备份列表
     *
     * 查询某个图下的备份列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGraphBackups2Request 请求对象
     * @return AsyncInvoker<ListGraphBackups2Request, ListGraphBackups2Response>
     */
    public AsyncInvoker<ListGraphBackups2Request, ListGraphBackups2Response> listGraphBackups2AsyncInvoker(
        ListGraphBackups2Request request) {
        return new AsyncInvoker<>(request, GesMeta.listGraphBackups2, hcClient);
    }

    /**
     * 查询图列表
     *
     * 查询当前租户所有的图。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGraphs2Request 请求对象
     * @return CompletableFuture<ListGraphs2Response>
     */
    public CompletableFuture<ListGraphs2Response> listGraphs2Async(ListGraphs2Request request) {
        return hcClient.asyncInvokeHttp(request, GesMeta.listGraphs2);
    }

    /**
     * 查询图列表
     *
     * 查询当前租户所有的图。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGraphs2Request 请求对象
     * @return AsyncInvoker<ListGraphs2Request, ListGraphs2Response>
     */
    public AsyncInvoker<ListGraphs2Request, ListGraphs2Response> listGraphs2AsyncInvoker(ListGraphs2Request request) {
        return new AsyncInvoker<>(request, GesMeta.listGraphs2, hcClient);
    }

    /**
     * 查询任务中心
     *
     * 查询管理面任务中心。当前创建图、关闭图、启动图、删除图、增加备份、导入图、导出图、升级图等操作为异步任务，该API用于查询这些任务的详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListJobs2Request 请求对象
     * @return CompletableFuture<ListJobs2Response>
     */
    public CompletableFuture<ListJobs2Response> listJobs2Async(ListJobs2Request request) {
        return hcClient.asyncInvokeHttp(request, GesMeta.listJobs2);
    }

    /**
     * 查询任务中心
     *
     * 查询管理面任务中心。当前创建图、关闭图、启动图、删除图、增加备份、导入图、导出图、升级图等操作为异步任务，该API用于查询这些任务的详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListJobs2Request 请求对象
     * @return AsyncInvoker<ListJobs2Request, ListJobs2Response>
     */
    public AsyncInvoker<ListJobs2Request, ListJobs2Response> listJobs2AsyncInvoker(ListJobs2Request request) {
        return new AsyncInvoker<>(request, GesMeta.listJobs2, hcClient);
    }

    /**
     * 查询元数据列表
     *
     * 查询元数据列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMetadatas2Request 请求对象
     * @return CompletableFuture<ListMetadatas2Response>
     */
    public CompletableFuture<ListMetadatas2Response> listMetadatas2Async(ListMetadatas2Request request) {
        return hcClient.asyncInvokeHttp(request, GesMeta.listMetadatas2);
    }

    /**
     * 查询元数据列表
     *
     * 查询元数据列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMetadatas2Request 请求对象
     * @return AsyncInvoker<ListMetadatas2Request, ListMetadatas2Response>
     */
    public AsyncInvoker<ListMetadatas2Request, ListMetadatas2Response> listMetadatas2AsyncInvoker(
        ListMetadatas2Request request) {
        return new AsyncInvoker<>(request, GesMeta.listMetadatas2, hcClient);
    }

    /**
     * 查询配额
     *
     * 查询租户配额。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListQuotas2Request 请求对象
     * @return CompletableFuture<ListQuotas2Response>
     */
    public CompletableFuture<ListQuotas2Response> listQuotas2Async(ListQuotas2Request request) {
        return hcClient.asyncInvokeHttp(request, GesMeta.listQuotas2);
    }

    /**
     * 查询配额
     *
     * 查询租户配额。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListQuotas2Request 请求对象
     * @return AsyncInvoker<ListQuotas2Request, ListQuotas2Response>
     */
    public AsyncInvoker<ListQuotas2Request, ListQuotas2Response> listQuotas2AsyncInvoker(ListQuotas2Request request) {
        return new AsyncInvoker<>(request, GesMeta.listQuotas2, hcClient);
    }

    /**
     * 扩容图
     *
     * 扩容图规格。
     * &gt; 扩容图以后所有索引（复合索引和全文索引）都需要重新创建。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResizeGraph2Request 请求对象
     * @return CompletableFuture<ResizeGraph2Response>
     */
    public CompletableFuture<ResizeGraph2Response> resizeGraph2Async(ResizeGraph2Request request) {
        return hcClient.asyncInvokeHttp(request, GesMeta.resizeGraph2);
    }

    /**
     * 扩容图
     *
     * 扩容图规格。
     * &gt; 扩容图以后所有索引（复合索引和全文索引）都需要重新创建。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResizeGraph2Request 请求对象
     * @return AsyncInvoker<ResizeGraph2Request, ResizeGraph2Response>
     */
    public AsyncInvoker<ResizeGraph2Request, ResizeGraph2Response> resizeGraph2AsyncInvoker(
        ResizeGraph2Request request) {
        return new AsyncInvoker<>(request, GesMeta.resizeGraph2, hcClient);
    }

    /**
     * 强制重启图
     *
     * 强制启动一个图。针对导入、导出 、运行中 、清空中的图。强制重启图，会将该图执行中的异步任务变为失败，然后停止图、启动图到运行状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RestartGraph2Request 请求对象
     * @return CompletableFuture<RestartGraph2Response>
     */
    public CompletableFuture<RestartGraph2Response> restartGraph2Async(RestartGraph2Request request) {
        return hcClient.asyncInvokeHttp(request, GesMeta.restartGraph2);
    }

    /**
     * 强制重启图
     *
     * 强制启动一个图。针对导入、导出 、运行中 、清空中的图。强制重启图，会将该图执行中的异步任务变为失败，然后停止图、启动图到运行状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RestartGraph2Request 请求对象
     * @return AsyncInvoker<RestartGraph2Request, RestartGraph2Response>
     */
    public AsyncInvoker<RestartGraph2Request, RestartGraph2Response> restartGraph2AsyncInvoker(
        RestartGraph2Request request) {
        return new AsyncInvoker<>(request, GesMeta.restartGraph2, hcClient);
    }

    /**
     * 查询图详情
     *
     * 根据图ID查询某个图详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGraph2Request 请求对象
     * @return CompletableFuture<ShowGraph2Response>
     */
    public CompletableFuture<ShowGraph2Response> showGraph2Async(ShowGraph2Request request) {
        return hcClient.asyncInvokeHttp(request, GesMeta.showGraph2);
    }

    /**
     * 查询图详情
     *
     * 根据图ID查询某个图详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGraph2Request 请求对象
     * @return AsyncInvoker<ShowGraph2Request, ShowGraph2Response>
     */
    public AsyncInvoker<ShowGraph2Request, ShowGraph2Response> showGraph2AsyncInvoker(ShowGraph2Request request) {
        return new AsyncInvoker<>(request, GesMeta.showGraph2, hcClient);
    }

    /**
     * 查询Job状态-管理面
     *
     * 查询Job的执行状态。对创建图、关闭图、启动图、删除图、导入图等异步API命令下发后，会返回jobId，通过jobId查询任务的执行状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowJob2Request 请求对象
     * @return CompletableFuture<ShowJob2Response>
     */
    public CompletableFuture<ShowJob2Response> showJob2Async(ShowJob2Request request) {
        return hcClient.asyncInvokeHttp(request, GesMeta.showJob2);
    }

    /**
     * 查询Job状态-管理面
     *
     * 查询Job的执行状态。对创建图、关闭图、启动图、删除图、导入图等异步API命令下发后，会返回jobId，通过jobId查询任务的执行状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowJob2Request 请求对象
     * @return AsyncInvoker<ShowJob2Request, ShowJob2Response>
     */
    public AsyncInvoker<ShowJob2Request, ShowJob2Response> showJob2AsyncInvoker(ShowJob2Request request) {
        return new AsyncInvoker<>(request, GesMeta.showJob2, hcClient);
    }

    /**
     * 查询元数据
     *
     * 查询某个元数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMetadata2Request 请求对象
     * @return CompletableFuture<ShowMetadata2Response>
     */
    public CompletableFuture<ShowMetadata2Response> showMetadata2Async(ShowMetadata2Request request) {
        return hcClient.asyncInvokeHttp(request, GesMeta.showMetadata2);
    }

    /**
     * 查询元数据
     *
     * 查询某个元数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMetadata2Request 请求对象
     * @return AsyncInvoker<ShowMetadata2Request, ShowMetadata2Response>
     */
    public AsyncInvoker<ShowMetadata2Request, ShowMetadata2Response> showMetadata2AsyncInvoker(
        ShowMetadata2Request request) {
        return new AsyncInvoker<>(request, GesMeta.showMetadata2, hcClient);
    }

    /**
     * 启动图
     *
     * 启动一个图。暂时不用的图可以先关闭，需要使用时再启动。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartGraph2Request 请求对象
     * @return CompletableFuture<StartGraph2Response>
     */
    public CompletableFuture<StartGraph2Response> startGraph2Async(StartGraph2Request request) {
        return hcClient.asyncInvokeHttp(request, GesMeta.startGraph2);
    }

    /**
     * 启动图
     *
     * 启动一个图。暂时不用的图可以先关闭，需要使用时再启动。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartGraph2Request 请求对象
     * @return AsyncInvoker<StartGraph2Request, StartGraph2Response>
     */
    public AsyncInvoker<StartGraph2Request, StartGraph2Response> startGraph2AsyncInvoker(StartGraph2Request request) {
        return new AsyncInvoker<>(request, GesMeta.startGraph2, hcClient);
    }

    /**
     * 关闭图
     *
     * 关闭一个图。如果图创建好了，暂时不用可以先关闭，需要使用时再启用。
     * &gt; 处于关闭状态的图不计算实例费用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopGraph2Request 请求对象
     * @return CompletableFuture<StopGraph2Response>
     */
    public CompletableFuture<StopGraph2Response> stopGraph2Async(StopGraph2Request request) {
        return hcClient.asyncInvokeHttp(request, GesMeta.stopGraph2);
    }

    /**
     * 关闭图
     *
     * 关闭一个图。如果图创建好了，暂时不用可以先关闭，需要使用时再启用。
     * &gt; 处于关闭状态的图不计算实例费用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopGraph2Request 请求对象
     * @return AsyncInvoker<StopGraph2Request, StopGraph2Response>
     */
    public AsyncInvoker<StopGraph2Request, StopGraph2Response> stopGraph2AsyncInvoker(StopGraph2Request request) {
        return new AsyncInvoker<>(request, GesMeta.stopGraph2, hcClient);
    }

    /**
     * 升级图
     *
     * 升级图。图引擎服务会定期升级版本，用户可根据需要升级图。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpgradeGraph2Request 请求对象
     * @return CompletableFuture<UpgradeGraph2Response>
     */
    public CompletableFuture<UpgradeGraph2Response> upgradeGraph2Async(UpgradeGraph2Request request) {
        return hcClient.asyncInvokeHttp(request, GesMeta.upgradeGraph2);
    }

    /**
     * 升级图
     *
     * 升级图。图引擎服务会定期升级版本，用户可根据需要升级图。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpgradeGraph2Request 请求对象
     * @return AsyncInvoker<UpgradeGraph2Request, UpgradeGraph2Response>
     */
    public AsyncInvoker<UpgradeGraph2Request, UpgradeGraph2Response> upgradeGraph2AsyncInvoker(
        UpgradeGraph2Request request) {
        return new AsyncInvoker<>(request, GesMeta.upgradeGraph2, hcClient);
    }

    /**
     * 从OBS导入元数据
     *
     * 从OBS导入元数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UploadFromObs2Request 请求对象
     * @return CompletableFuture<UploadFromObs2Response>
     */
    public CompletableFuture<UploadFromObs2Response> uploadFromObs2Async(UploadFromObs2Request request) {
        return hcClient.asyncInvokeHttp(request, GesMeta.uploadFromObs2);
    }

    /**
     * 从OBS导入元数据
     *
     * 从OBS导入元数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UploadFromObs2Request 请求对象
     * @return AsyncInvoker<UploadFromObs2Request, UploadFromObs2Response>
     */
    public AsyncInvoker<UploadFromObs2Request, UploadFromObs2Response> uploadFromObs2AsyncInvoker(
        UploadFromObs2Request request) {
        return new AsyncInvoker<>(request, GesMeta.uploadFromObs2, hcClient);
    }

    /**
     * 取消订阅场景分析插件
     *
     * 取消订阅scenes场景应用分析能力，取消订阅后对应scene下的application业务面API将不能使用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeregisterScenes2Request 请求对象
     * @return CompletableFuture<DeregisterScenes2Response>
     */
    public CompletableFuture<DeregisterScenes2Response> deregisterScenes2Async(DeregisterScenes2Request request) {
        return hcClient.asyncInvokeHttp(request, GesMeta.deregisterScenes2);
    }

    /**
     * 取消订阅场景分析插件
     *
     * 取消订阅scenes场景应用分析能力，取消订阅后对应scene下的application业务面API将不能使用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeregisterScenes2Request 请求对象
     * @return AsyncInvoker<DeregisterScenes2Request, DeregisterScenes2Response>
     */
    public AsyncInvoker<DeregisterScenes2Request, DeregisterScenes2Response> deregisterScenes2AsyncInvoker(
        DeregisterScenes2Request request) {
        return new AsyncInvoker<>(request, GesMeta.deregisterScenes2, hcClient);
    }

    /**
     * 查询获取场景应用分析插件
     *
     * 查询scenes场景下的应用分析能力详情，可以获得对应场景下的application、参数和功能介绍详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListScenes2Request 请求对象
     * @return CompletableFuture<ListScenes2Response>
     */
    public CompletableFuture<ListScenes2Response> listScenes2Async(ListScenes2Request request) {
        return hcClient.asyncInvokeHttp(request, GesMeta.listScenes2);
    }

    /**
     * 查询获取场景应用分析插件
     *
     * 查询scenes场景下的应用分析能力详情，可以获得对应场景下的application、参数和功能介绍详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListScenes2Request 请求对象
     * @return AsyncInvoker<ListScenes2Request, ListScenes2Response>
     */
    public AsyncInvoker<ListScenes2Request, ListScenes2Response> listScenes2AsyncInvoker(ListScenes2Request request) {
        return new AsyncInvoker<>(request, GesMeta.listScenes2, hcClient);
    }

    /**
     * 订阅场景分析插件
     *
     * 订阅scenes应用场景分析能力，便于业务面API使用对应功能。
     * &gt; 已订阅的不可以重复订阅，需要更新请先取消原有订购，重新订购。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RegisterScenes2Request 请求对象
     * @return CompletableFuture<RegisterScenes2Response>
     */
    public CompletableFuture<RegisterScenes2Response> registerScenes2Async(RegisterScenes2Request request) {
        return hcClient.asyncInvokeHttp(request, GesMeta.registerScenes2);
    }

    /**
     * 订阅场景分析插件
     *
     * 订阅scenes应用场景分析能力，便于业务面API使用对应功能。
     * &gt; 已订阅的不可以重复订阅，需要更新请先取消原有订购，重新订购。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RegisterScenes2Request 请求对象
     * @return AsyncInvoker<RegisterScenes2Request, RegisterScenes2Response>
     */
    public AsyncInvoker<RegisterScenes2Request, RegisterScenes2Response> registerScenes2AsyncInvoker(
        RegisterScenes2Request request) {
        return new AsyncInvoker<>(request, GesMeta.registerScenes2, hcClient);
    }

}
