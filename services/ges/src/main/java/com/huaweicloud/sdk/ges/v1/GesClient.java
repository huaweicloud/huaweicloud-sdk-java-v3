package com.huaweicloud.sdk.ges.v1;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.ges.v1.model.*;

public class GesClient {
    protected HcClient hcClient;

    public GesClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<GesClient> newBuilder() {
        return new ClientBuilder<>(GesClient::new);
    }


    /**
     * 绑定EIP(1.0.6)
     * 可以通过绑定弹性公网IP（简称EIP）访问GES服务。
     *
     * @param AttachEipRequest 请求对象
     * @return AttachEipResponse
     */
    public AttachEipResponse attachEip(AttachEipRequest request) {
        return hcClient.syncInvokeHttp(request, GesMeta.attachEip);
    }

    /**
     * 绑定EIP(1.0.6)
     * 可以通过绑定弹性公网IP（简称EIP）访问GES服务。
     *
     * @param AttachEipRequest 请求对象
     * @return SyncInvoker<AttachEipRequest, AttachEipResponse>
     */
    public SyncInvoker<AttachEipRequest, AttachEipResponse> attachEipInvoker(AttachEipRequest request) {
        return new SyncInvoker<AttachEipRequest, AttachEipResponse>(request, GesMeta.attachEip, hcClient);
    }

    /**
     * 清空图(2.1.2)
     * 清空图中所有数据。
     *
     * @param ClearGraphRequest 请求对象
     * @return ClearGraphResponse
     */
    public ClearGraphResponse clearGraph(ClearGraphRequest request) {
        return hcClient.syncInvokeHttp(request, GesMeta.clearGraph);
    }

    /**
     * 清空图(2.1.2)
     * 清空图中所有数据。
     *
     * @param ClearGraphRequest 请求对象
     * @return SyncInvoker<ClearGraphRequest, ClearGraphResponse>
     */
    public SyncInvoker<ClearGraphRequest, ClearGraphResponse> clearGraphInvoker(ClearGraphRequest request) {
        return new SyncInvoker<ClearGraphRequest, ClearGraphResponse>(request, GesMeta.clearGraph, hcClient);
    }

    /**
     * 新增备份(1.0.0)
     * 新增备份。当前图数据出现错误或故障时，可以启动备份图进行恢复。
     *
     * @param CreateBackupRequest 请求对象
     * @return CreateBackupResponse
     */
    public CreateBackupResponse createBackup(CreateBackupRequest request) {
        return hcClient.syncInvokeHttp(request, GesMeta.createBackup);
    }

    /**
     * 新增备份(1.0.0)
     * 新增备份。当前图数据出现错误或故障时，可以启动备份图进行恢复。
     *
     * @param CreateBackupRequest 请求对象
     * @return SyncInvoker<CreateBackupRequest, CreateBackupResponse>
     */
    public SyncInvoker<CreateBackupRequest, CreateBackupResponse> createBackupInvoker(CreateBackupRequest request) {
        return new SyncInvoker<CreateBackupRequest, CreateBackupResponse>(request, GesMeta.createBackup, hcClient);
    }

    /**
     * 创建图(2.2.2)
     * 创建一个图。
     *
     * @param CreateGraphRequest 请求对象
     * @return CreateGraphResponse
     */
    public CreateGraphResponse createGraph(CreateGraphRequest request) {
        return hcClient.syncInvokeHttp(request, GesMeta.createGraph);
    }

    /**
     * 创建图(2.2.2)
     * 创建一个图。
     *
     * @param CreateGraphRequest 请求对象
     * @return SyncInvoker<CreateGraphRequest, CreateGraphResponse>
     */
    public SyncInvoker<CreateGraphRequest, CreateGraphResponse> createGraphInvoker(CreateGraphRequest request) {
        return new SyncInvoker<CreateGraphRequest, CreateGraphResponse>(request, GesMeta.createGraph, hcClient);
    }

    /**
     * 新增元数据(2.1.18)
     * 新增元数据。
     *
     * @param CreateMetadataRequest 请求对象
     * @return CreateMetadataResponse
     */
    public CreateMetadataResponse createMetadata(CreateMetadataRequest request) {
        return hcClient.syncInvokeHttp(request, GesMeta.createMetadata);
    }

    /**
     * 新增元数据(2.1.18)
     * 新增元数据。
     *
     * @param CreateMetadataRequest 请求对象
     * @return SyncInvoker<CreateMetadataRequest, CreateMetadataResponse>
     */
    public SyncInvoker<CreateMetadataRequest, CreateMetadataResponse> createMetadataInvoker(CreateMetadataRequest request) {
        return new SyncInvoker<CreateMetadataRequest, CreateMetadataResponse>(request, GesMeta.createMetadata, hcClient);
    }

    /**
     * 删除备份(1.0.0)
     * 删除备份。
     *
     * @param DeleteBackupRequest 请求对象
     * @return DeleteBackupResponse
     */
    public DeleteBackupResponse deleteBackup(DeleteBackupRequest request) {
        return hcClient.syncInvokeHttp(request, GesMeta.deleteBackup);
    }

    /**
     * 删除备份(1.0.0)
     * 删除备份。
     *
     * @param DeleteBackupRequest 请求对象
     * @return SyncInvoker<DeleteBackupRequest, DeleteBackupResponse>
     */
    public SyncInvoker<DeleteBackupRequest, DeleteBackupResponse> deleteBackupInvoker(DeleteBackupRequest request) {
        return new SyncInvoker<DeleteBackupRequest, DeleteBackupResponse>(request, GesMeta.deleteBackup, hcClient);
    }

    /**
     * 删除图(1.0.0)
     * 删除一个图。
     *
     * @param DeleteGraphRequest 请求对象
     * @return DeleteGraphResponse
     */
    public DeleteGraphResponse deleteGraph(DeleteGraphRequest request) {
        return hcClient.syncInvokeHttp(request, GesMeta.deleteGraph);
    }

    /**
     * 删除图(1.0.0)
     * 删除一个图。
     *
     * @param DeleteGraphRequest 请求对象
     * @return SyncInvoker<DeleteGraphRequest, DeleteGraphResponse>
     */
    public SyncInvoker<DeleteGraphRequest, DeleteGraphResponse> deleteGraphInvoker(DeleteGraphRequest request) {
        return new SyncInvoker<DeleteGraphRequest, DeleteGraphResponse>(request, GesMeta.deleteGraph, hcClient);
    }

    /**
     * 删除元数据(1.0.2)
     * 删除元数据。
     *
     * @param DeleteMetadataRequest 请求对象
     * @return DeleteMetadataResponse
     */
    public DeleteMetadataResponse deleteMetadata(DeleteMetadataRequest request) {
        return hcClient.syncInvokeHttp(request, GesMeta.deleteMetadata);
    }

    /**
     * 删除元数据(1.0.2)
     * 删除元数据。
     *
     * @param DeleteMetadataRequest 请求对象
     * @return SyncInvoker<DeleteMetadataRequest, DeleteMetadataResponse>
     */
    public SyncInvoker<DeleteMetadataRequest, DeleteMetadataResponse> deleteMetadataInvoker(DeleteMetadataRequest request) {
        return new SyncInvoker<DeleteMetadataRequest, DeleteMetadataResponse>(request, GesMeta.deleteMetadata, hcClient);
    }

    /**
     * 解绑EIP(1.0.6)
     * 当无需继续使用EIP时，您可通过解绑EIP来释放网络资源。
     *
     * @param DetachEipRequest 请求对象
     * @return DetachEipResponse
     */
    public DetachEipResponse detachEip(DetachEipRequest request) {
        return hcClient.syncInvokeHttp(request, GesMeta.detachEip);
    }

    /**
     * 解绑EIP(1.0.6)
     * 当无需继续使用EIP时，您可通过解绑EIP来释放网络资源。
     *
     * @param DetachEipRequest 请求对象
     * @return SyncInvoker<DetachEipRequest, DetachEipResponse>
     */
    public SyncInvoker<DetachEipRequest, DetachEipResponse> detachEipInvoker(DetachEipRequest request) {
        return new SyncInvoker<DetachEipRequest, DetachEipResponse>(request, GesMeta.detachEip, hcClient);
    }

    /**
     * 扩副本(2.2.23)
     * 扩副本能力允许动态扩容多个从节点，扩容的从节点可以处理读请求，从而提高读请求性能。 &gt;一万边和百亿边规格的图暂不支持扩副本。
     *
     * @param ExpandGraphRequest 请求对象
     * @return ExpandGraphResponse
     */
    public ExpandGraphResponse expandGraph(ExpandGraphRequest request) {
        return hcClient.syncInvokeHttp(request, GesMeta.expandGraph);
    }

    /**
     * 扩副本(2.2.23)
     * 扩副本能力允许动态扩容多个从节点，扩容的从节点可以处理读请求，从而提高读请求性能。 &gt;一万边和百亿边规格的图暂不支持扩副本。
     *
     * @param ExpandGraphRequest 请求对象
     * @return SyncInvoker<ExpandGraphRequest, ExpandGraphResponse>
     */
    public SyncInvoker<ExpandGraphRequest, ExpandGraphResponse> expandGraphInvoker(ExpandGraphRequest request) {
        return new SyncInvoker<ExpandGraphRequest, ExpandGraphResponse>(request, GesMeta.expandGraph, hcClient);
    }

    /**
     * 导出图(1.0.5)
     * 导出图。
     *
     * @param ExportGraphRequest 请求对象
     * @return ExportGraphResponse
     */
    public ExportGraphResponse exportGraph(ExportGraphRequest request) {
        return hcClient.syncInvokeHttp(request, GesMeta.exportGraph);
    }

    /**
     * 导出图(1.0.5)
     * 导出图。
     *
     * @param ExportGraphRequest 请求对象
     * @return SyncInvoker<ExportGraphRequest, ExportGraphResponse>
     */
    public SyncInvoker<ExportGraphRequest, ExportGraphResponse> exportGraphInvoker(ExportGraphRequest request) {
        return new SyncInvoker<ExportGraphRequest, ExportGraphResponse>(request, GesMeta.exportGraph, hcClient);
    }

    /**
     * 增量导入图(2.1.14)
     * 增量导入图数据。
     *
     * @param ImportGraphRequest 请求对象
     * @return ImportGraphResponse
     */
    public ImportGraphResponse importGraph(ImportGraphRequest request) {
        return hcClient.syncInvokeHttp(request, GesMeta.importGraph);
    }

    /**
     * 增量导入图(2.1.14)
     * 增量导入图数据。
     *
     * @param ImportGraphRequest 请求对象
     * @return SyncInvoker<ImportGraphRequest, ImportGraphResponse>
     */
    public SyncInvoker<ImportGraphRequest, ImportGraphResponse> importGraphInvoker(ImportGraphRequest request) {
        return new SyncInvoker<ImportGraphRequest, ImportGraphResponse>(request, GesMeta.importGraph, hcClient);
    }

    /**
     * 查看所有备份列表(1.0.0)
     * 查询备份列表。
     *
     * @param ListBackupsRequest 请求对象
     * @return ListBackupsResponse
     */
    public ListBackupsResponse listBackups(ListBackupsRequest request) {
        return hcClient.syncInvokeHttp(request, GesMeta.listBackups);
    }

    /**
     * 查看所有备份列表(1.0.0)
     * 查询备份列表。
     *
     * @param ListBackupsRequest 请求对象
     * @return SyncInvoker<ListBackupsRequest, ListBackupsResponse>
     */
    public SyncInvoker<ListBackupsRequest, ListBackupsResponse> listBackupsInvoker(ListBackupsRequest request) {
        return new SyncInvoker<ListBackupsRequest, ListBackupsResponse>(request, GesMeta.listBackups, hcClient);
    }

    /**
     * 查看某个图的备份列表(1.0.0)
     * 查询某个图下的备份列表。
     *
     * @param ListGraphBackupsRequest 请求对象
     * @return ListGraphBackupsResponse
     */
    public ListGraphBackupsResponse listGraphBackups(ListGraphBackupsRequest request) {
        return hcClient.syncInvokeHttp(request, GesMeta.listGraphBackups);
    }

    /**
     * 查看某个图的备份列表(1.0.0)
     * 查询某个图下的备份列表。
     *
     * @param ListGraphBackupsRequest 请求对象
     * @return SyncInvoker<ListGraphBackupsRequest, ListGraphBackupsResponse>
     */
    public SyncInvoker<ListGraphBackupsRequest, ListGraphBackupsResponse> listGraphBackupsInvoker(ListGraphBackupsRequest request) {
        return new SyncInvoker<ListGraphBackupsRequest, ListGraphBackupsResponse>(request, GesMeta.listGraphBackups, hcClient);
    }

    /**
     * 查询元数据(1.0.2)
     * 查询某个图下的元数据。
     *
     * @param ListGraphMetadatasRequest 请求对象
     * @return ListGraphMetadatasResponse
     */
    public ListGraphMetadatasResponse listGraphMetadatas(ListGraphMetadatasRequest request) {
        return hcClient.syncInvokeHttp(request, GesMeta.listGraphMetadatas);
    }

    /**
     * 查询元数据(1.0.2)
     * 查询某个图下的元数据。
     *
     * @param ListGraphMetadatasRequest 请求对象
     * @return SyncInvoker<ListGraphMetadatasRequest, ListGraphMetadatasResponse>
     */
    public SyncInvoker<ListGraphMetadatasRequest, ListGraphMetadatasResponse> listGraphMetadatasInvoker(ListGraphMetadatasRequest request) {
        return new SyncInvoker<ListGraphMetadatasRequest, ListGraphMetadatasResponse>(request, GesMeta.listGraphMetadatas, hcClient);
    }

    /**
     * 查询图列表(2.1.18)
     * 查询当前租户所有的图。
     *
     * @param ListGraphsRequest 请求对象
     * @return ListGraphsResponse
     */
    public ListGraphsResponse listGraphs(ListGraphsRequest request) {
        return hcClient.syncInvokeHttp(request, GesMeta.listGraphs);
    }

    /**
     * 查询图列表(2.1.18)
     * 查询当前租户所有的图。
     *
     * @param ListGraphsRequest 请求对象
     * @return SyncInvoker<ListGraphsRequest, ListGraphsResponse>
     */
    public SyncInvoker<ListGraphsRequest, ListGraphsResponse> listGraphsInvoker(ListGraphsRequest request) {
        return new SyncInvoker<ListGraphsRequest, ListGraphsResponse>(request, GesMeta.listGraphs, hcClient);
    }

    /**
     * 查询任务中心(1.1.8)
     * 查询管理面任务中心。当前创建图、关闭图、启动图、删除图、增加备份、导入图、导出图、升级图等操作为异步任务，该API用于查询这些任务的详情。
     *
     * @param ListJobsRequest 请求对象
     * @return ListJobsResponse
     */
    public ListJobsResponse listJobs(ListJobsRequest request) {
        return hcClient.syncInvokeHttp(request, GesMeta.listJobs);
    }

    /**
     * 查询任务中心(1.1.8)
     * 查询管理面任务中心。当前创建图、关闭图、启动图、删除图、增加备份、导入图、导出图、升级图等操作为异步任务，该API用于查询这些任务的详情。
     *
     * @param ListJobsRequest 请求对象
     * @return SyncInvoker<ListJobsRequest, ListJobsResponse>
     */
    public SyncInvoker<ListJobsRequest, ListJobsResponse> listJobsInvoker(ListJobsRequest request) {
        return new SyncInvoker<ListJobsRequest, ListJobsResponse>(request, GesMeta.listJobs, hcClient);
    }

    /**
     * 查询元数据列表(1.0.2)
     * 查询元数据列表。
     *
     * @param ListMetadatasRequest 请求对象
     * @return ListMetadatasResponse
     */
    public ListMetadatasResponse listMetadatas(ListMetadatasRequest request) {
        return hcClient.syncInvokeHttp(request, GesMeta.listMetadatas);
    }

    /**
     * 查询元数据列表(1.0.2)
     * 查询元数据列表。
     *
     * @param ListMetadatasRequest 请求对象
     * @return SyncInvoker<ListMetadatasRequest, ListMetadatasResponse>
     */
    public SyncInvoker<ListMetadatasRequest, ListMetadatasResponse> listMetadatasInvoker(ListMetadatasRequest request) {
        return new SyncInvoker<ListMetadatasRequest, ListMetadatasResponse>(request, GesMeta.listMetadatas, hcClient);
    }

    /**
     * 查询配额(1.0.0)
     * 查询租户配额。
     *
     * @param ListQuotasRequest 请求对象
     * @return ListQuotasResponse
     */
    public ListQuotasResponse listQuotas(ListQuotasRequest request) {
        return hcClient.syncInvokeHttp(request, GesMeta.listQuotas);
    }

    /**
     * 查询配额(1.0.0)
     * 查询租户配额。
     *
     * @param ListQuotasRequest 请求对象
     * @return SyncInvoker<ListQuotasRequest, ListQuotasResponse>
     */
    public SyncInvoker<ListQuotasRequest, ListQuotasResponse> listQuotasInvoker(ListQuotasRequest request) {
        return new SyncInvoker<ListQuotasRequest, ListQuotasResponse>(request, GesMeta.listQuotas, hcClient);
    }

    /**
     * 扩容图(2.2.21)
     * 扩容图规格。
     *
     * @param ResizeGraphRequest 请求对象
     * @return ResizeGraphResponse
     */
    public ResizeGraphResponse resizeGraph(ResizeGraphRequest request) {
        return hcClient.syncInvokeHttp(request, GesMeta.resizeGraph);
    }

    /**
     * 扩容图(2.2.21)
     * 扩容图规格。
     *
     * @param ResizeGraphRequest 请求对象
     * @return SyncInvoker<ResizeGraphRequest, ResizeGraphResponse>
     */
    public SyncInvoker<ResizeGraphRequest, ResizeGraphResponse> resizeGraphInvoker(ResizeGraphRequest request) {
        return new SyncInvoker<ResizeGraphRequest, ResizeGraphResponse>(request, GesMeta.resizeGraph, hcClient);
    }

    /**
     * 强制重启图(2.2.21)
     * 强制启动一个图。针对导入、导出 、运行中 、清空中的图。强制重启图，会将该图执行中的异步任务变为失败，然后停止图、启动图到运行状态。
     *
     * @param RestartGraphRequest 请求对象
     * @return RestartGraphResponse
     */
    public RestartGraphResponse restartGraph(RestartGraphRequest request) {
        return hcClient.syncInvokeHttp(request, GesMeta.restartGraph);
    }

    /**
     * 强制重启图(2.2.21)
     * 强制启动一个图。针对导入、导出 、运行中 、清空中的图。强制重启图，会将该图执行中的异步任务变为失败，然后停止图、启动图到运行状态。
     *
     * @param RestartGraphRequest 请求对象
     * @return SyncInvoker<RestartGraphRequest, RestartGraphResponse>
     */
    public SyncInvoker<RestartGraphRequest, RestartGraphResponse> restartGraphInvoker(RestartGraphRequest request) {
        return new SyncInvoker<RestartGraphRequest, RestartGraphResponse>(request, GesMeta.restartGraph, hcClient);
    }

    /**
     * 查询图详情(1.0.0)
     * 根据图ID查询某个图详情。
     *
     * @param ShowGraphRequest 请求对象
     * @return ShowGraphResponse
     */
    public ShowGraphResponse showGraph(ShowGraphRequest request) {
        return hcClient.syncInvokeHttp(request, GesMeta.showGraph);
    }

    /**
     * 查询图详情(1.0.0)
     * 根据图ID查询某个图详情。
     *
     * @param ShowGraphRequest 请求对象
     * @return SyncInvoker<ShowGraphRequest, ShowGraphResponse>
     */
    public SyncInvoker<ShowGraphRequest, ShowGraphResponse> showGraphInvoker(ShowGraphRequest request) {
        return new SyncInvoker<ShowGraphRequest, ShowGraphResponse>(request, GesMeta.showGraph, hcClient);
    }

    /**
     * 查询Job状态(1.0.0)-管理面
     * 查询Job的执行状态。对创建图、关闭图、启动图、删除图、导入图等异步API命令下发后，会返回jobId，通过jobId查询任务的执行状态。
     *
     * @param ShowJobRequest 请求对象
     * @return ShowJobResponse
     */
    public ShowJobResponse showJob(ShowJobRequest request) {
        return hcClient.syncInvokeHttp(request, GesMeta.showJob);
    }

    /**
     * 查询Job状态(1.0.0)-管理面
     * 查询Job的执行状态。对创建图、关闭图、启动图、删除图、导入图等异步API命令下发后，会返回jobId，通过jobId查询任务的执行状态。
     *
     * @param ShowJobRequest 请求对象
     * @return SyncInvoker<ShowJobRequest, ShowJobResponse>
     */
    public SyncInvoker<ShowJobRequest, ShowJobResponse> showJobInvoker(ShowJobRequest request) {
        return new SyncInvoker<ShowJobRequest, ShowJobResponse>(request, GesMeta.showJob, hcClient);
    }

    /**
     * 启动图(1.0.0)
     * 启动一个图。暂时不用的图可以先关闭，需要使用时再启动。
     *
     * @param StartGraphRequest 请求对象
     * @return StartGraphResponse
     */
    public StartGraphResponse startGraph(StartGraphRequest request) {
        return hcClient.syncInvokeHttp(request, GesMeta.startGraph);
    }

    /**
     * 启动图(1.0.0)
     * 启动一个图。暂时不用的图可以先关闭，需要使用时再启动。
     *
     * @param StartGraphRequest 请求对象
     * @return SyncInvoker<StartGraphRequest, StartGraphResponse>
     */
    public SyncInvoker<StartGraphRequest, StartGraphResponse> startGraphInvoker(StartGraphRequest request) {
        return new SyncInvoker<StartGraphRequest, StartGraphResponse>(request, GesMeta.startGraph, hcClient);
    }

    /**
     * 关闭图(1.0.0)
     * 关闭一个图。如果图创建好了，暂时不用可以先关闭，需要使用时再启用。 &gt;处于关闭状态的图不计算实例费用。
     *
     * @param StopGraphRequest 请求对象
     * @return StopGraphResponse
     */
    public StopGraphResponse stopGraph(StopGraphRequest request) {
        return hcClient.syncInvokeHttp(request, GesMeta.stopGraph);
    }

    /**
     * 关闭图(1.0.0)
     * 关闭一个图。如果图创建好了，暂时不用可以先关闭，需要使用时再启用。 &gt;处于关闭状态的图不计算实例费用。
     *
     * @param StopGraphRequest 请求对象
     * @return SyncInvoker<StopGraphRequest, StopGraphResponse>
     */
    public SyncInvoker<StopGraphRequest, StopGraphResponse> stopGraphInvoker(StopGraphRequest request) {
        return new SyncInvoker<StopGraphRequest, StopGraphResponse>(request, GesMeta.stopGraph, hcClient);
    }

    /**
     * 升级图(1.0.5)
     * 升级图。图引擎服务会定期升级版本，用户可根据需要升级图。
     *
     * @param UpgradeGraphRequest 请求对象
     * @return UpgradeGraphResponse
     */
    public UpgradeGraphResponse upgradeGraph(UpgradeGraphRequest request) {
        return hcClient.syncInvokeHttp(request, GesMeta.upgradeGraph);
    }

    /**
     * 升级图(1.0.5)
     * 升级图。图引擎服务会定期升级版本，用户可根据需要升级图。
     *
     * @param UpgradeGraphRequest 请求对象
     * @return SyncInvoker<UpgradeGraphRequest, UpgradeGraphResponse>
     */
    public SyncInvoker<UpgradeGraphRequest, UpgradeGraphResponse> upgradeGraphInvoker(UpgradeGraphRequest request) {
        return new SyncInvoker<UpgradeGraphRequest, UpgradeGraphResponse>(request, GesMeta.upgradeGraph, hcClient);
    }

    /**
     * 从OBS导入元数据(1.0.0)
     * 从OBS导入元数据。
     *
     * @param UploadFromObsRequest 请求对象
     * @return UploadFromObsResponse
     */
    public UploadFromObsResponse uploadFromObs(UploadFromObsRequest request) {
        return hcClient.syncInvokeHttp(request, GesMeta.uploadFromObs);
    }

    /**
     * 从OBS导入元数据(1.0.0)
     * 从OBS导入元数据。
     *
     * @param UploadFromObsRequest 请求对象
     * @return SyncInvoker<UploadFromObsRequest, UploadFromObsResponse>
     */
    public SyncInvoker<UploadFromObsRequest, UploadFromObsResponse> uploadFromObsInvoker(UploadFromObsRequest request) {
        return new SyncInvoker<UploadFromObsRequest, UploadFromObsResponse>(request, GesMeta.uploadFromObs, hcClient);
    }

}