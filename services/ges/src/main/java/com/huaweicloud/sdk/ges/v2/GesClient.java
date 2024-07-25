package com.huaweicloud.sdk.ges.v2;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.ges.v2.model.AttachEip2Request;
import com.huaweicloud.sdk.ges.v2.model.AttachEip2Response;
import com.huaweicloud.sdk.ges.v2.model.ChangeSecurityGroupRequest;
import com.huaweicloud.sdk.ges.v2.model.ChangeSecurityGroupResponse;
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
import com.huaweicloud.sdk.ges.v2.model.ShowBackupDownloadLinkRequest;
import com.huaweicloud.sdk.ges.v2.model.ShowBackupDownloadLinkResponse;
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

public class GesClient {

    protected HcClient hcClient;

    public GesClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<GesClient> newBuilder() {
        ClientBuilder<GesClient> clientBuilder = new ClientBuilder<>(GesClient::new);
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
     * @return AttachEip2Response
     */
    public AttachEip2Response attachEip2(AttachEip2Request request) {
        return hcClient.syncInvokeHttp(request, GesMeta.attachEip2);
    }

    /**
     * 绑定EIP
     *
     * 可以通过绑定弹性公网IP（简称EIP）访问GES服务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AttachEip2Request 请求对象
     * @return SyncInvoker<AttachEip2Request, AttachEip2Response>
     */
    public SyncInvoker<AttachEip2Request, AttachEip2Response> attachEip2Invoker(AttachEip2Request request) {
        return new SyncInvoker<>(request, GesMeta.attachEip2, hcClient);
    }

    /**
     * 切换安全组
     *
     * 该接口可以在图创建成功后，修改图的安全组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeSecurityGroupRequest 请求对象
     * @return ChangeSecurityGroupResponse
     */
    public ChangeSecurityGroupResponse changeSecurityGroup(ChangeSecurityGroupRequest request) {
        return hcClient.syncInvokeHttp(request, GesMeta.changeSecurityGroup);
    }

    /**
     * 切换安全组
     *
     * 该接口可以在图创建成功后，修改图的安全组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeSecurityGroupRequest 请求对象
     * @return SyncInvoker<ChangeSecurityGroupRequest, ChangeSecurityGroupResponse>
     */
    public SyncInvoker<ChangeSecurityGroupRequest, ChangeSecurityGroupResponse> changeSecurityGroupInvoker(
        ChangeSecurityGroupRequest request) {
        return new SyncInvoker<>(request, GesMeta.changeSecurityGroup, hcClient);
    }

    /**
     * 清空图
     *
     * 清空图中所有数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ClearGraph2Request 请求对象
     * @return ClearGraph2Response
     */
    public ClearGraph2Response clearGraph2(ClearGraph2Request request) {
        return hcClient.syncInvokeHttp(request, GesMeta.clearGraph2);
    }

    /**
     * 清空图
     *
     * 清空图中所有数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ClearGraph2Request 请求对象
     * @return SyncInvoker<ClearGraph2Request, ClearGraph2Response>
     */
    public SyncInvoker<ClearGraph2Request, ClearGraph2Response> clearGraph2Invoker(ClearGraph2Request request) {
        return new SyncInvoker<>(request, GesMeta.clearGraph2, hcClient);
    }

    /**
     * 新增备份
     *
     * 新增备份。当前图数据出现错误或故障时，可以启动备份图进行恢复。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateBackup2Request 请求对象
     * @return CreateBackup2Response
     */
    public CreateBackup2Response createBackup2(CreateBackup2Request request) {
        return hcClient.syncInvokeHttp(request, GesMeta.createBackup2);
    }

    /**
     * 新增备份
     *
     * 新增备份。当前图数据出现错误或故障时，可以启动备份图进行恢复。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateBackup2Request 请求对象
     * @return SyncInvoker<CreateBackup2Request, CreateBackup2Response>
     */
    public SyncInvoker<CreateBackup2Request, CreateBackup2Response> createBackup2Invoker(CreateBackup2Request request) {
        return new SyncInvoker<>(request, GesMeta.createBackup2, hcClient);
    }

    /**
     * 创建图
     *
     * 创建一个图。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateGraph2Request 请求对象
     * @return CreateGraph2Response
     */
    public CreateGraph2Response createGraph2(CreateGraph2Request request) {
        return hcClient.syncInvokeHttp(request, GesMeta.createGraph2);
    }

    /**
     * 创建图
     *
     * 创建一个图。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateGraph2Request 请求对象
     * @return SyncInvoker<CreateGraph2Request, CreateGraph2Response>
     */
    public SyncInvoker<CreateGraph2Request, CreateGraph2Response> createGraph2Invoker(CreateGraph2Request request) {
        return new SyncInvoker<>(request, GesMeta.createGraph2, hcClient);
    }

    /**
     * 新增元数据
     *
     * 新增元数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateMetadata2Request 请求对象
     * @return CreateMetadata2Response
     */
    public CreateMetadata2Response createMetadata2(CreateMetadata2Request request) {
        return hcClient.syncInvokeHttp(request, GesMeta.createMetadata2);
    }

    /**
     * 新增元数据
     *
     * 新增元数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateMetadata2Request 请求对象
     * @return SyncInvoker<CreateMetadata2Request, CreateMetadata2Response>
     */
    public SyncInvoker<CreateMetadata2Request, CreateMetadata2Response> createMetadata2Invoker(
        CreateMetadata2Request request) {
        return new SyncInvoker<>(request, GesMeta.createMetadata2, hcClient);
    }

    /**
     * 删除备份
     *
     * 删除备份。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteBackup2Request 请求对象
     * @return DeleteBackup2Response
     */
    public DeleteBackup2Response deleteBackup2(DeleteBackup2Request request) {
        return hcClient.syncInvokeHttp(request, GesMeta.deleteBackup2);
    }

    /**
     * 删除备份
     *
     * 删除备份。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteBackup2Request 请求对象
     * @return SyncInvoker<DeleteBackup2Request, DeleteBackup2Response>
     */
    public SyncInvoker<DeleteBackup2Request, DeleteBackup2Response> deleteBackup2Invoker(DeleteBackup2Request request) {
        return new SyncInvoker<>(request, GesMeta.deleteBackup2, hcClient);
    }

    /**
     * 删除图
     *
     * 删除一个图。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteGraph2Request 请求对象
     * @return DeleteGraph2Response
     */
    public DeleteGraph2Response deleteGraph2(DeleteGraph2Request request) {
        return hcClient.syncInvokeHttp(request, GesMeta.deleteGraph2);
    }

    /**
     * 删除图
     *
     * 删除一个图。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteGraph2Request 请求对象
     * @return SyncInvoker<DeleteGraph2Request, DeleteGraph2Response>
     */
    public SyncInvoker<DeleteGraph2Request, DeleteGraph2Response> deleteGraph2Invoker(DeleteGraph2Request request) {
        return new SyncInvoker<>(request, GesMeta.deleteGraph2, hcClient);
    }

    /**
     * 删除元数据
     *
     * 删除元数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteMetadata2Request 请求对象
     * @return DeleteMetadata2Response
     */
    public DeleteMetadata2Response deleteMetadata2(DeleteMetadata2Request request) {
        return hcClient.syncInvokeHttp(request, GesMeta.deleteMetadata2);
    }

    /**
     * 删除元数据
     *
     * 删除元数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteMetadata2Request 请求对象
     * @return SyncInvoker<DeleteMetadata2Request, DeleteMetadata2Response>
     */
    public SyncInvoker<DeleteMetadata2Request, DeleteMetadata2Response> deleteMetadata2Invoker(
        DeleteMetadata2Request request) {
        return new SyncInvoker<>(request, GesMeta.deleteMetadata2, hcClient);
    }

    /**
     * 解绑EIP
     *
     * 当无需继续使用EIP时，您可通过解绑EIP来释放网络资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DetachEip2Request 请求对象
     * @return DetachEip2Response
     */
    public DetachEip2Response detachEip2(DetachEip2Request request) {
        return hcClient.syncInvokeHttp(request, GesMeta.detachEip2);
    }

    /**
     * 解绑EIP
     *
     * 当无需继续使用EIP时，您可通过解绑EIP来释放网络资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DetachEip2Request 请求对象
     * @return SyncInvoker<DetachEip2Request, DetachEip2Response>
     */
    public SyncInvoker<DetachEip2Request, DetachEip2Response> detachEip2Invoker(DetachEip2Request request) {
        return new SyncInvoker<>(request, GesMeta.detachEip2, hcClient);
    }

    /**
     * 扩副本
     *
     * 扩副本能力允许动态扩容多个从节点，扩容的从节点可以处理读请求，从而提高读请求性能。
     * &gt; 1.一万边和百亿边规格的图暂不支持扩副本。
     * 2.进行扩副本操作后，不支持变更图规格操作。
     * 3.如果要对图进行扩容和扩副本两个操作，需要您先进行变更图规格操作，再进行扩副本操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExpandGraph2Request 请求对象
     * @return ExpandGraph2Response
     */
    public ExpandGraph2Response expandGraph2(ExpandGraph2Request request) {
        return hcClient.syncInvokeHttp(request, GesMeta.expandGraph2);
    }

    /**
     * 扩副本
     *
     * 扩副本能力允许动态扩容多个从节点，扩容的从节点可以处理读请求，从而提高读请求性能。
     * &gt; 1.一万边和百亿边规格的图暂不支持扩副本。
     * 2.进行扩副本操作后，不支持变更图规格操作。
     * 3.如果要对图进行扩容和扩副本两个操作，需要您先进行变更图规格操作，再进行扩副本操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExpandGraph2Request 请求对象
     * @return SyncInvoker<ExpandGraph2Request, ExpandGraph2Response>
     */
    public SyncInvoker<ExpandGraph2Request, ExpandGraph2Response> expandGraph2Invoker(ExpandGraph2Request request) {
        return new SyncInvoker<>(request, GesMeta.expandGraph2, hcClient);
    }

    /**
     * 导出备份
     *
     * 导出备份
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportBackup2Request 请求对象
     * @return ExportBackup2Response
     */
    public ExportBackup2Response exportBackup2(ExportBackup2Request request) {
        return hcClient.syncInvokeHttp(request, GesMeta.exportBackup2);
    }

    /**
     * 导出备份
     *
     * 导出备份
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportBackup2Request 请求对象
     * @return SyncInvoker<ExportBackup2Request, ExportBackup2Response>
     */
    public SyncInvoker<ExportBackup2Request, ExportBackup2Response> exportBackup2Invoker(ExportBackup2Request request) {
        return new SyncInvoker<>(request, GesMeta.exportBackup2, hcClient);
    }

    /**
     * 导出图
     *
     * 导出图。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportGraph2Request 请求对象
     * @return ExportGraph2Response
     */
    public ExportGraph2Response exportGraph2(ExportGraph2Request request) {
        return hcClient.syncInvokeHttp(request, GesMeta.exportGraph2);
    }

    /**
     * 导出图
     *
     * 导出图。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportGraph2Request 请求对象
     * @return SyncInvoker<ExportGraph2Request, ExportGraph2Response>
     */
    public SyncInvoker<ExportGraph2Request, ExportGraph2Response> exportGraph2Invoker(ExportGraph2Request request) {
        return new SyncInvoker<>(request, GesMeta.exportGraph2, hcClient);
    }

    /**
     * 导入备份
     *
     * 导入备份
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ImportBackup2Request 请求对象
     * @return ImportBackup2Response
     */
    public ImportBackup2Response importBackup2(ImportBackup2Request request) {
        return hcClient.syncInvokeHttp(request, GesMeta.importBackup2);
    }

    /**
     * 导入备份
     *
     * 导入备份
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ImportBackup2Request 请求对象
     * @return SyncInvoker<ImportBackup2Request, ImportBackup2Response>
     */
    public SyncInvoker<ImportBackup2Request, ImportBackup2Response> importBackup2Invoker(ImportBackup2Request request) {
        return new SyncInvoker<>(request, GesMeta.importBackup2, hcClient);
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
     * @return ImportGraph2Response
     */
    public ImportGraph2Response importGraph2(ImportGraph2Request request) {
        return hcClient.syncInvokeHttp(request, GesMeta.importGraph2);
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
     * @return SyncInvoker<ImportGraph2Request, ImportGraph2Response>
     */
    public SyncInvoker<ImportGraph2Request, ImportGraph2Response> importGraph2Invoker(ImportGraph2Request request) {
        return new SyncInvoker<>(request, GesMeta.importGraph2, hcClient);
    }

    /**
     * 查看所有备份列表
     *
     * 查询备份列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBackups2Request 请求对象
     * @return ListBackups2Response
     */
    public ListBackups2Response listBackups2(ListBackups2Request request) {
        return hcClient.syncInvokeHttp(request, GesMeta.listBackups2);
    }

    /**
     * 查看所有备份列表
     *
     * 查询备份列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBackups2Request 请求对象
     * @return SyncInvoker<ListBackups2Request, ListBackups2Response>
     */
    public SyncInvoker<ListBackups2Request, ListBackups2Response> listBackups2Invoker(ListBackups2Request request) {
        return new SyncInvoker<>(request, GesMeta.listBackups2, hcClient);
    }

    /**
     * 查看某个图的备份列表
     *
     * 查询某个图下的备份列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGraphBackups2Request 请求对象
     * @return ListGraphBackups2Response
     */
    public ListGraphBackups2Response listGraphBackups2(ListGraphBackups2Request request) {
        return hcClient.syncInvokeHttp(request, GesMeta.listGraphBackups2);
    }

    /**
     * 查看某个图的备份列表
     *
     * 查询某个图下的备份列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGraphBackups2Request 请求对象
     * @return SyncInvoker<ListGraphBackups2Request, ListGraphBackups2Response>
     */
    public SyncInvoker<ListGraphBackups2Request, ListGraphBackups2Response> listGraphBackups2Invoker(
        ListGraphBackups2Request request) {
        return new SyncInvoker<>(request, GesMeta.listGraphBackups2, hcClient);
    }

    /**
     * 查询图列表
     *
     * 查询当前租户所有的图。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGraphs2Request 请求对象
     * @return ListGraphs2Response
     */
    public ListGraphs2Response listGraphs2(ListGraphs2Request request) {
        return hcClient.syncInvokeHttp(request, GesMeta.listGraphs2);
    }

    /**
     * 查询图列表
     *
     * 查询当前租户所有的图。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGraphs2Request 请求对象
     * @return SyncInvoker<ListGraphs2Request, ListGraphs2Response>
     */
    public SyncInvoker<ListGraphs2Request, ListGraphs2Response> listGraphs2Invoker(ListGraphs2Request request) {
        return new SyncInvoker<>(request, GesMeta.listGraphs2, hcClient);
    }

    /**
     * 查询任务中心
     *
     * 查询管理面任务中心。当前创建图、关闭图、启动图、删除图、增加备份、导入图、导出图、升级图等操作为异步任务，该API用于查询这些任务的详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListJobs2Request 请求对象
     * @return ListJobs2Response
     */
    public ListJobs2Response listJobs2(ListJobs2Request request) {
        return hcClient.syncInvokeHttp(request, GesMeta.listJobs2);
    }

    /**
     * 查询任务中心
     *
     * 查询管理面任务中心。当前创建图、关闭图、启动图、删除图、增加备份、导入图、导出图、升级图等操作为异步任务，该API用于查询这些任务的详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListJobs2Request 请求对象
     * @return SyncInvoker<ListJobs2Request, ListJobs2Response>
     */
    public SyncInvoker<ListJobs2Request, ListJobs2Response> listJobs2Invoker(ListJobs2Request request) {
        return new SyncInvoker<>(request, GesMeta.listJobs2, hcClient);
    }

    /**
     * 查询元数据列表
     *
     * 查询元数据列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMetadatas2Request 请求对象
     * @return ListMetadatas2Response
     */
    public ListMetadatas2Response listMetadatas2(ListMetadatas2Request request) {
        return hcClient.syncInvokeHttp(request, GesMeta.listMetadatas2);
    }

    /**
     * 查询元数据列表
     *
     * 查询元数据列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMetadatas2Request 请求对象
     * @return SyncInvoker<ListMetadatas2Request, ListMetadatas2Response>
     */
    public SyncInvoker<ListMetadatas2Request, ListMetadatas2Response> listMetadatas2Invoker(
        ListMetadatas2Request request) {
        return new SyncInvoker<>(request, GesMeta.listMetadatas2, hcClient);
    }

    /**
     * 查询配额
     *
     * 查询租户配额。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListQuotas2Request 请求对象
     * @return ListQuotas2Response
     */
    public ListQuotas2Response listQuotas2(ListQuotas2Request request) {
        return hcClient.syncInvokeHttp(request, GesMeta.listQuotas2);
    }

    /**
     * 查询配额
     *
     * 查询租户配额。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListQuotas2Request 请求对象
     * @return SyncInvoker<ListQuotas2Request, ListQuotas2Response>
     */
    public SyncInvoker<ListQuotas2Request, ListQuotas2Response> listQuotas2Invoker(ListQuotas2Request request) {
        return new SyncInvoker<>(request, GesMeta.listQuotas2, hcClient);
    }

    /**
     * 变更图规格
     *
     * 变更图规格规格。
     * &gt; 变更图规格以后所有索引（复合索引和全文索引）都需要重新创建。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResizeGraph2Request 请求对象
     * @return ResizeGraph2Response
     */
    public ResizeGraph2Response resizeGraph2(ResizeGraph2Request request) {
        return hcClient.syncInvokeHttp(request, GesMeta.resizeGraph2);
    }

    /**
     * 变更图规格
     *
     * 变更图规格规格。
     * &gt; 变更图规格以后所有索引（复合索引和全文索引）都需要重新创建。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResizeGraph2Request 请求对象
     * @return SyncInvoker<ResizeGraph2Request, ResizeGraph2Response>
     */
    public SyncInvoker<ResizeGraph2Request, ResizeGraph2Response> resizeGraph2Invoker(ResizeGraph2Request request) {
        return new SyncInvoker<>(request, GesMeta.resizeGraph2, hcClient);
    }

    /**
     * 强制重启图
     *
     * 强制启动一个图。针对导入、导出 、运行中 、清空中的图。强制重启图，会将该图执行中的异步任务变为失败，然后停止图、启动图到运行状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RestartGraph2Request 请求对象
     * @return RestartGraph2Response
     */
    public RestartGraph2Response restartGraph2(RestartGraph2Request request) {
        return hcClient.syncInvokeHttp(request, GesMeta.restartGraph2);
    }

    /**
     * 强制重启图
     *
     * 强制启动一个图。针对导入、导出 、运行中 、清空中的图。强制重启图，会将该图执行中的异步任务变为失败，然后停止图、启动图到运行状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RestartGraph2Request 请求对象
     * @return SyncInvoker<RestartGraph2Request, RestartGraph2Response>
     */
    public SyncInvoker<RestartGraph2Request, RestartGraph2Response> restartGraph2Invoker(RestartGraph2Request request) {
        return new SyncInvoker<>(request, GesMeta.restartGraph2, hcClient);
    }

    /**
     * 获取备份下载链接
     *
     * 获取备份下载链接
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBackupDownloadLinkRequest 请求对象
     * @return ShowBackupDownloadLinkResponse
     */
    public ShowBackupDownloadLinkResponse showBackupDownloadLink(ShowBackupDownloadLinkRequest request) {
        return hcClient.syncInvokeHttp(request, GesMeta.showBackupDownloadLink);
    }

    /**
     * 获取备份下载链接
     *
     * 获取备份下载链接
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBackupDownloadLinkRequest 请求对象
     * @return SyncInvoker<ShowBackupDownloadLinkRequest, ShowBackupDownloadLinkResponse>
     */
    public SyncInvoker<ShowBackupDownloadLinkRequest, ShowBackupDownloadLinkResponse> showBackupDownloadLinkInvoker(
        ShowBackupDownloadLinkRequest request) {
        return new SyncInvoker<>(request, GesMeta.showBackupDownloadLink, hcClient);
    }

    /**
     * 查询图详情
     *
     * 根据图ID查询某个图详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGraph2Request 请求对象
     * @return ShowGraph2Response
     */
    public ShowGraph2Response showGraph2(ShowGraph2Request request) {
        return hcClient.syncInvokeHttp(request, GesMeta.showGraph2);
    }

    /**
     * 查询图详情
     *
     * 根据图ID查询某个图详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGraph2Request 请求对象
     * @return SyncInvoker<ShowGraph2Request, ShowGraph2Response>
     */
    public SyncInvoker<ShowGraph2Request, ShowGraph2Response> showGraph2Invoker(ShowGraph2Request request) {
        return new SyncInvoker<>(request, GesMeta.showGraph2, hcClient);
    }

    /**
     * 查询Job状态-管理面
     *
     * 查询Job的执行状态。对创建图、关闭图、启动图、删除图、导入图等异步API命令下发后，会返回jobId，通过jobId查询任务的执行状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowJob2Request 请求对象
     * @return ShowJob2Response
     */
    public ShowJob2Response showJob2(ShowJob2Request request) {
        return hcClient.syncInvokeHttp(request, GesMeta.showJob2);
    }

    /**
     * 查询Job状态-管理面
     *
     * 查询Job的执行状态。对创建图、关闭图、启动图、删除图、导入图等异步API命令下发后，会返回jobId，通过jobId查询任务的执行状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowJob2Request 请求对象
     * @return SyncInvoker<ShowJob2Request, ShowJob2Response>
     */
    public SyncInvoker<ShowJob2Request, ShowJob2Response> showJob2Invoker(ShowJob2Request request) {
        return new SyncInvoker<>(request, GesMeta.showJob2, hcClient);
    }

    /**
     * 查询元数据
     *
     * 查询某个元数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMetadata2Request 请求对象
     * @return ShowMetadata2Response
     */
    public ShowMetadata2Response showMetadata2(ShowMetadata2Request request) {
        return hcClient.syncInvokeHttp(request, GesMeta.showMetadata2);
    }

    /**
     * 查询元数据
     *
     * 查询某个元数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMetadata2Request 请求对象
     * @return SyncInvoker<ShowMetadata2Request, ShowMetadata2Response>
     */
    public SyncInvoker<ShowMetadata2Request, ShowMetadata2Response> showMetadata2Invoker(ShowMetadata2Request request) {
        return new SyncInvoker<>(request, GesMeta.showMetadata2, hcClient);
    }

    /**
     * 启动图
     *
     * 启动一个图。暂时不用的图可以先关闭，需要使用时再启动。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartGraph2Request 请求对象
     * @return StartGraph2Response
     */
    public StartGraph2Response startGraph2(StartGraph2Request request) {
        return hcClient.syncInvokeHttp(request, GesMeta.startGraph2);
    }

    /**
     * 启动图
     *
     * 启动一个图。暂时不用的图可以先关闭，需要使用时再启动。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartGraph2Request 请求对象
     * @return SyncInvoker<StartGraph2Request, StartGraph2Response>
     */
    public SyncInvoker<StartGraph2Request, StartGraph2Response> startGraph2Invoker(StartGraph2Request request) {
        return new SyncInvoker<>(request, GesMeta.startGraph2, hcClient);
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
     * @return StopGraph2Response
     */
    public StopGraph2Response stopGraph2(StopGraph2Request request) {
        return hcClient.syncInvokeHttp(request, GesMeta.stopGraph2);
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
     * @return SyncInvoker<StopGraph2Request, StopGraph2Response>
     */
    public SyncInvoker<StopGraph2Request, StopGraph2Response> stopGraph2Invoker(StopGraph2Request request) {
        return new SyncInvoker<>(request, GesMeta.stopGraph2, hcClient);
    }

    /**
     * 升级图
     *
     * 升级图。图引擎服务会定期升级版本，用户可根据需要升级图。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpgradeGraph2Request 请求对象
     * @return UpgradeGraph2Response
     */
    public UpgradeGraph2Response upgradeGraph2(UpgradeGraph2Request request) {
        return hcClient.syncInvokeHttp(request, GesMeta.upgradeGraph2);
    }

    /**
     * 升级图
     *
     * 升级图。图引擎服务会定期升级版本，用户可根据需要升级图。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpgradeGraph2Request 请求对象
     * @return SyncInvoker<UpgradeGraph2Request, UpgradeGraph2Response>
     */
    public SyncInvoker<UpgradeGraph2Request, UpgradeGraph2Response> upgradeGraph2Invoker(UpgradeGraph2Request request) {
        return new SyncInvoker<>(request, GesMeta.upgradeGraph2, hcClient);
    }

    /**
     * 从OBS导入元数据
     *
     * 从OBS导入元数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UploadFromObs2Request 请求对象
     * @return UploadFromObs2Response
     */
    public UploadFromObs2Response uploadFromObs2(UploadFromObs2Request request) {
        return hcClient.syncInvokeHttp(request, GesMeta.uploadFromObs2);
    }

    /**
     * 从OBS导入元数据
     *
     * 从OBS导入元数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UploadFromObs2Request 请求对象
     * @return SyncInvoker<UploadFromObs2Request, UploadFromObs2Response>
     */
    public SyncInvoker<UploadFromObs2Request, UploadFromObs2Response> uploadFromObs2Invoker(
        UploadFromObs2Request request) {
        return new SyncInvoker<>(request, GesMeta.uploadFromObs2, hcClient);
    }

    /**
     * 取消订阅场景分析插件
     *
     * 取消订阅scenes场景应用分析能力，取消订阅后对应scene下的application业务面API将不能使用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeregisterScenes2Request 请求对象
     * @return DeregisterScenes2Response
     */
    public DeregisterScenes2Response deregisterScenes2(DeregisterScenes2Request request) {
        return hcClient.syncInvokeHttp(request, GesMeta.deregisterScenes2);
    }

    /**
     * 取消订阅场景分析插件
     *
     * 取消订阅scenes场景应用分析能力，取消订阅后对应scene下的application业务面API将不能使用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeregisterScenes2Request 请求对象
     * @return SyncInvoker<DeregisterScenes2Request, DeregisterScenes2Response>
     */
    public SyncInvoker<DeregisterScenes2Request, DeregisterScenes2Response> deregisterScenes2Invoker(
        DeregisterScenes2Request request) {
        return new SyncInvoker<>(request, GesMeta.deregisterScenes2, hcClient);
    }

    /**
     * 查询获取场景应用分析插件
     *
     * 查询scenes场景下的应用分析能力详情，可以获得对应场景下的application、参数和功能介绍详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListScenes2Request 请求对象
     * @return ListScenes2Response
     */
    public ListScenes2Response listScenes2(ListScenes2Request request) {
        return hcClient.syncInvokeHttp(request, GesMeta.listScenes2);
    }

    /**
     * 查询获取场景应用分析插件
     *
     * 查询scenes场景下的应用分析能力详情，可以获得对应场景下的application、参数和功能介绍详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListScenes2Request 请求对象
     * @return SyncInvoker<ListScenes2Request, ListScenes2Response>
     */
    public SyncInvoker<ListScenes2Request, ListScenes2Response> listScenes2Invoker(ListScenes2Request request) {
        return new SyncInvoker<>(request, GesMeta.listScenes2, hcClient);
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
     * @return RegisterScenes2Response
     */
    public RegisterScenes2Response registerScenes2(RegisterScenes2Request request) {
        return hcClient.syncInvokeHttp(request, GesMeta.registerScenes2);
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
     * @return SyncInvoker<RegisterScenes2Request, RegisterScenes2Response>
     */
    public SyncInvoker<RegisterScenes2Request, RegisterScenes2Response> registerScenes2Invoker(
        RegisterScenes2Request request) {
        return new SyncInvoker<>(request, GesMeta.registerScenes2, hcClient);
    }

}
