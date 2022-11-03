package com.huaweicloud.sdk.css.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.css.v1.model.*;

public class CssClient {

    protected HcClient hcClient;

    public CssClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<CssClient> newBuilder() {
        return new ClientBuilder<>(CssClient::new);
    }

    /**
     * 设置自动创建快照策略
     *
     * 该接口用于设置自动创建快照，默认一天创建一个快照。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateAutoCreatePolicyRequest 请求对象
     * @return CreateAutoCreatePolicyResponse
     */
    public CreateAutoCreatePolicyResponse createAutoCreatePolicy(CreateAutoCreatePolicyRequest request) {
        return hcClient.syncInvokeHttp(request, CssMeta.createAutoCreatePolicy);
    }

    /**
     * 设置自动创建快照策略
     *
     * 该接口用于设置自动创建快照，默认一天创建一个快照。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateAutoCreatePolicyRequest 请求对象
     * @return SyncInvoker<CreateAutoCreatePolicyRequest, CreateAutoCreatePolicyResponse>
     */
    public SyncInvoker<CreateAutoCreatePolicyRequest, CreateAutoCreatePolicyResponse> createAutoCreatePolicyInvoker(
        CreateAutoCreatePolicyRequest request) {
        return new SyncInvoker<CreateAutoCreatePolicyRequest, CreateAutoCreatePolicyResponse>(request,
            CssMeta.createAutoCreatePolicy, hcClient);
    }

    /**
     * 开启公网访问
     *
     * 该接口用于开启公网访问。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateBindPublicRequest 请求对象
     * @return CreateBindPublicResponse
     */
    public CreateBindPublicResponse createBindPublic(CreateBindPublicRequest request) {
        return hcClient.syncInvokeHttp(request, CssMeta.createBindPublic);
    }

    /**
     * 开启公网访问
     *
     * 该接口用于开启公网访问。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateBindPublicRequest 请求对象
     * @return SyncInvoker<CreateBindPublicRequest, CreateBindPublicResponse>
     */
    public SyncInvoker<CreateBindPublicRequest, CreateBindPublicResponse> createBindPublicInvoker(
        CreateBindPublicRequest request) {
        return new SyncInvoker<CreateBindPublicRequest, CreateBindPublicResponse>(request, CssMeta.createBindPublic,
            hcClient);
    }

    /**
     * 创建集群
     *
     * 该接口用于创建集群。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateClusterRequest 请求对象
     * @return CreateClusterResponse
     */
    public CreateClusterResponse createCluster(CreateClusterRequest request) {
        return hcClient.syncInvokeHttp(request, CssMeta.createCluster);
    }

    /**
     * 创建集群
     *
     * 该接口用于创建集群。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateClusterRequest 请求对象
     * @return SyncInvoker<CreateClusterRequest, CreateClusterResponse>
     */
    public SyncInvoker<CreateClusterRequest, CreateClusterResponse> createClusterInvoker(CreateClusterRequest request) {
        return new SyncInvoker<CreateClusterRequest, CreateClusterResponse>(request, CssMeta.createCluster, hcClient);
    }

    /**
     * 添加指定集群标签
     *
     * 该接口用于给指定集群添加标签。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateClustersTagsRequest 请求对象
     * @return CreateClustersTagsResponse
     */
    public CreateClustersTagsResponse createClustersTags(CreateClustersTagsRequest request) {
        return hcClient.syncInvokeHttp(request, CssMeta.createClustersTags);
    }

    /**
     * 添加指定集群标签
     *
     * 该接口用于给指定集群添加标签。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateClustersTagsRequest 请求对象
     * @return SyncInvoker<CreateClustersTagsRequest, CreateClustersTagsResponse>
     */
    public SyncInvoker<CreateClustersTagsRequest, CreateClustersTagsResponse> createClustersTagsInvoker(
        CreateClustersTagsRequest request) {
        return new SyncInvoker<CreateClustersTagsRequest, CreateClustersTagsResponse>(request,
            CssMeta.createClustersTags, hcClient);
    }

    /**
     * 加载自定义词库
     *
     * 该接口用于加载存放于OBS的自定义词库。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateLoadIkThesaurusRequest 请求对象
     * @return CreateLoadIkThesaurusResponse
     */
    public CreateLoadIkThesaurusResponse createLoadIkThesaurus(CreateLoadIkThesaurusRequest request) {
        return hcClient.syncInvokeHttp(request, CssMeta.createLoadIkThesaurus);
    }

    /**
     * 加载自定义词库
     *
     * 该接口用于加载存放于OBS的自定义词库。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateLoadIkThesaurusRequest 请求对象
     * @return SyncInvoker<CreateLoadIkThesaurusRequest, CreateLoadIkThesaurusResponse>
     */
    public SyncInvoker<CreateLoadIkThesaurusRequest, CreateLoadIkThesaurusResponse> createLoadIkThesaurusInvoker(
        CreateLoadIkThesaurusRequest request) {
        return new SyncInvoker<CreateLoadIkThesaurusRequest, CreateLoadIkThesaurusResponse>(request,
            CssMeta.createLoadIkThesaurus, hcClient);
    }

    /**
     * 备份日志
     *
     * 该接口用于备份日志。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateLogBackupRequest 请求对象
     * @return CreateLogBackupResponse
     */
    public CreateLogBackupResponse createLogBackup(CreateLogBackupRequest request) {
        return hcClient.syncInvokeHttp(request, CssMeta.createLogBackup);
    }

    /**
     * 备份日志
     *
     * 该接口用于备份日志。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateLogBackupRequest 请求对象
     * @return SyncInvoker<CreateLogBackupRequest, CreateLogBackupResponse>
     */
    public SyncInvoker<CreateLogBackupRequest, CreateLogBackupResponse> createLogBackupInvoker(
        CreateLogBackupRequest request) {
        return new SyncInvoker<CreateLogBackupRequest, CreateLogBackupResponse>(request, CssMeta.createLogBackup,
            hcClient);
    }

    /**
     * 手动创建快照
     *
     * 该接口用于手动创建一个快照。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateSnapshotRequest 请求对象
     * @return CreateSnapshotResponse
     */
    public CreateSnapshotResponse createSnapshot(CreateSnapshotRequest request) {
        return hcClient.syncInvokeHttp(request, CssMeta.createSnapshot);
    }

    /**
     * 手动创建快照
     *
     * 该接口用于手动创建一个快照。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateSnapshotRequest 请求对象
     * @return SyncInvoker<CreateSnapshotRequest, CreateSnapshotResponse>
     */
    public SyncInvoker<CreateSnapshotRequest, CreateSnapshotResponse> createSnapshotInvoker(
        CreateSnapshotRequest request) {
        return new SyncInvoker<CreateSnapshotRequest, CreateSnapshotResponse>(request, CssMeta.createSnapshot,
            hcClient);
    }

    /**
     * 删除集群
     *
     * 此接口用于删除集群。集群删除将释放此集群的所有资源，包括客户数据。如果需要保留客户集群数据，建议在删除集群前先创建快照。
     * 
     * &gt;此接口亦可用于包年/包月集群退订。公安冻结的集群不能删除。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteClusterRequest 请求对象
     * @return DeleteClusterResponse
     */
    public DeleteClusterResponse deleteCluster(DeleteClusterRequest request) {
        return hcClient.syncInvokeHttp(request, CssMeta.deleteCluster);
    }

    /**
     * 删除集群
     *
     * 此接口用于删除集群。集群删除将释放此集群的所有资源，包括客户数据。如果需要保留客户集群数据，建议在删除集群前先创建快照。
     * 
     * &gt;此接口亦可用于包年/包月集群退订。公安冻结的集群不能删除。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteClusterRequest 请求对象
     * @return SyncInvoker<DeleteClusterRequest, DeleteClusterResponse>
     */
    public SyncInvoker<DeleteClusterRequest, DeleteClusterResponse> deleteClusterInvoker(DeleteClusterRequest request) {
        return new SyncInvoker<DeleteClusterRequest, DeleteClusterResponse>(request, CssMeta.deleteCluster, hcClient);
    }

    /**
     * 删除集群标签
     *
     * 此接口用于删除集群标签。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteClustersTagsRequest 请求对象
     * @return DeleteClustersTagsResponse
     */
    public DeleteClustersTagsResponse deleteClustersTags(DeleteClustersTagsRequest request) {
        return hcClient.syncInvokeHttp(request, CssMeta.deleteClustersTags);
    }

    /**
     * 删除集群标签
     *
     * 此接口用于删除集群标签。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteClustersTagsRequest 请求对象
     * @return SyncInvoker<DeleteClustersTagsRequest, DeleteClustersTagsResponse>
     */
    public SyncInvoker<DeleteClustersTagsRequest, DeleteClustersTagsResponse> deleteClustersTagsInvoker(
        DeleteClustersTagsRequest request) {
        return new SyncInvoker<DeleteClustersTagsRequest, DeleteClustersTagsResponse>(request,
            CssMeta.deleteClustersTags, hcClient);
    }

    /**
     * 删除自定义词库
     *
     * 该接口用于删除自定义词库。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteIkThesaurusRequest 请求对象
     * @return DeleteIkThesaurusResponse
     */
    public DeleteIkThesaurusResponse deleteIkThesaurus(DeleteIkThesaurusRequest request) {
        return hcClient.syncInvokeHttp(request, CssMeta.deleteIkThesaurus);
    }

    /**
     * 删除自定义词库
     *
     * 该接口用于删除自定义词库。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteIkThesaurusRequest 请求对象
     * @return SyncInvoker<DeleteIkThesaurusRequest, DeleteIkThesaurusResponse>
     */
    public SyncInvoker<DeleteIkThesaurusRequest, DeleteIkThesaurusResponse> deleteIkThesaurusInvoker(
        DeleteIkThesaurusRequest request) {
        return new SyncInvoker<DeleteIkThesaurusRequest, DeleteIkThesaurusResponse>(request, CssMeta.deleteIkThesaurus,
            hcClient);
    }

    /**
     * 删除快照
     *
     * 该接口用于删除快照。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteSnapshotRequest 请求对象
     * @return DeleteSnapshotResponse
     */
    public DeleteSnapshotResponse deleteSnapshot(DeleteSnapshotRequest request) {
        return hcClient.syncInvokeHttp(request, CssMeta.deleteSnapshot);
    }

    /**
     * 删除快照
     *
     * 该接口用于删除快照。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteSnapshotRequest 请求对象
     * @return SyncInvoker<DeleteSnapshotRequest, DeleteSnapshotResponse>
     */
    public SyncInvoker<DeleteSnapshotRequest, DeleteSnapshotResponse> deleteSnapshotInvoker(
        DeleteSnapshotRequest request) {
        return new SyncInvoker<DeleteSnapshotRequest, DeleteSnapshotResponse>(request, CssMeta.deleteSnapshot,
            hcClient);
    }

    /**
     * 下载安全证书
     *
     * 该接口用于下载安全证书。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DownloadCertRequest 请求对象
     * @return DownloadCertResponse
     */
    public DownloadCertResponse downloadCert(DownloadCertRequest request) {
        return hcClient.syncInvokeHttp(request, CssMeta.downloadCert);
    }

    /**
     * 下载安全证书
     *
     * 该接口用于下载安全证书。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DownloadCertRequest 请求对象
     * @return SyncInvoker<DownloadCertRequest, DownloadCertResponse>
     */
    public SyncInvoker<DownloadCertRequest, DownloadCertResponse> downloadCertInvoker(DownloadCertRequest request) {
        return new SyncInvoker<DownloadCertRequest, DownloadCertResponse>(request, CssMeta.downloadCert, hcClient);
    }

    /**
     * 查询集群列表
     *
     * 该接口用于查询并显示集群列表以及集群的状态。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListClustersDetailsRequest 请求对象
     * @return ListClustersDetailsResponse
     */
    public ListClustersDetailsResponse listClustersDetails(ListClustersDetailsRequest request) {
        return hcClient.syncInvokeHttp(request, CssMeta.listClustersDetails);
    }

    /**
     * 查询集群列表
     *
     * 该接口用于查询并显示集群列表以及集群的状态。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListClustersDetailsRequest 请求对象
     * @return SyncInvoker<ListClustersDetailsRequest, ListClustersDetailsResponse>
     */
    public SyncInvoker<ListClustersDetailsRequest, ListClustersDetailsResponse> listClustersDetailsInvoker(
        ListClustersDetailsRequest request) {
        return new SyncInvoker<ListClustersDetailsRequest, ListClustersDetailsResponse>(request,
            CssMeta.listClustersDetails, hcClient);
    }

    /**
     * 查询所有标签
     *
     * 该接口用于查询指定region下的所有标签集合。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListClustersTagsRequest 请求对象
     * @return ListClustersTagsResponse
     */
    public ListClustersTagsResponse listClustersTags(ListClustersTagsRequest request) {
        return hcClient.syncInvokeHttp(request, CssMeta.listClustersTags);
    }

    /**
     * 查询所有标签
     *
     * 该接口用于查询指定region下的所有标签集合。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListClustersTagsRequest 请求对象
     * @return SyncInvoker<ListClustersTagsRequest, ListClustersTagsResponse>
     */
    public SyncInvoker<ListClustersTagsRequest, ListClustersTagsResponse> listClustersTagsInvoker(
        ListClustersTagsRequest request) {
        return new SyncInvoker<ListClustersTagsRequest, ListClustersTagsResponse>(request, CssMeta.listClustersTags,
            hcClient);
    }

    /**
     * 获取实例规格列表
     *
     * 该接口用于查询并显示支持的实例规格对应的ID。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListFlavorsRequest 请求对象
     * @return ListFlavorsResponse
     */
    public ListFlavorsResponse listFlavors(ListFlavorsRequest request) {
        return hcClient.syncInvokeHttp(request, CssMeta.listFlavors);
    }

    /**
     * 获取实例规格列表
     *
     * 该接口用于查询并显示支持的实例规格对应的ID。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListFlavorsRequest 请求对象
     * @return SyncInvoker<ListFlavorsRequest, ListFlavorsResponse>
     */
    public SyncInvoker<ListFlavorsRequest, ListFlavorsResponse> listFlavorsInvoker(ListFlavorsRequest request) {
        return new SyncInvoker<ListFlavorsRequest, ListFlavorsResponse>(request, CssMeta.listFlavors, hcClient);
    }

    /**
     * 查询作业列表
     *
     * 该接口用于查询具体某个集群的日志任务记录列表。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListLogsJobRequest 请求对象
     * @return ListLogsJobResponse
     */
    public ListLogsJobResponse listLogsJob(ListLogsJobRequest request) {
        return hcClient.syncInvokeHttp(request, CssMeta.listLogsJob);
    }

    /**
     * 查询作业列表
     *
     * 该接口用于查询具体某个集群的日志任务记录列表。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListLogsJobRequest 请求对象
     * @return SyncInvoker<ListLogsJobRequest, ListLogsJobResponse>
     */
    public SyncInvoker<ListLogsJobRequest, ListLogsJobResponse> listLogsJobInvoker(ListLogsJobRequest request) {
        return new SyncInvoker<ListLogsJobRequest, ListLogsJobResponse>(request, CssMeta.listLogsJob, hcClient);
    }

    /**
     * 查询快照列表
     *
     * 该接口用于查询集群的所有快照。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListSnapshotsRequest 请求对象
     * @return ListSnapshotsResponse
     */
    public ListSnapshotsResponse listSnapshots(ListSnapshotsRequest request) {
        return hcClient.syncInvokeHttp(request, CssMeta.listSnapshots);
    }

    /**
     * 查询快照列表
     *
     * 该接口用于查询集群的所有快照。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListSnapshotsRequest 请求对象
     * @return SyncInvoker<ListSnapshotsRequest, ListSnapshotsResponse>
     */
    public SyncInvoker<ListSnapshotsRequest, ListSnapshotsResponse> listSnapshotsInvoker(ListSnapshotsRequest request) {
        return new SyncInvoker<ListSnapshotsRequest, ListSnapshotsResponse>(request, CssMeta.listSnapshots, hcClient);
    }

    /**
     * 获取参数配置列表
     *
     * 该接口用于获取当前集群现有的参数配置列表。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListYmlsRequest 请求对象
     * @return ListYmlsResponse
     */
    public ListYmlsResponse listYmls(ListYmlsRequest request) {
        return hcClient.syncInvokeHttp(request, CssMeta.listYmls);
    }

    /**
     * 获取参数配置列表
     *
     * 该接口用于获取当前集群现有的参数配置列表。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListYmlsRequest 请求对象
     * @return SyncInvoker<ListYmlsRequest, ListYmlsResponse>
     */
    public SyncInvoker<ListYmlsRequest, ListYmlsResponse> listYmlsInvoker(ListYmlsRequest request) {
        return new SyncInvoker<ListYmlsRequest, ListYmlsResponse>(request, CssMeta.listYmls, hcClient);
    }

    /**
     * 获取参数配置任务列表
     *
     * 该接口可获取参数配置的任务操作列表。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListYmlsJobRequest 请求对象
     * @return ListYmlsJobResponse
     */
    public ListYmlsJobResponse listYmlsJob(ListYmlsJobRequest request) {
        return hcClient.syncInvokeHttp(request, CssMeta.listYmlsJob);
    }

    /**
     * 获取参数配置任务列表
     *
     * 该接口可获取参数配置的任务操作列表。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListYmlsJobRequest 请求对象
     * @return SyncInvoker<ListYmlsJobRequest, ListYmlsJobResponse>
     */
    public SyncInvoker<ListYmlsJobRequest, ListYmlsJobResponse> listYmlsJobInvoker(ListYmlsJobRequest request) {
        return new SyncInvoker<ListYmlsJobRequest, ListYmlsJobResponse>(request, CssMeta.listYmlsJob, hcClient);
    }

    /**
     * 修改密码
     *
     * 该接口用于修改集群密码。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ResetPasswordRequest 请求对象
     * @return ResetPasswordResponse
     */
    public ResetPasswordResponse resetPassword(ResetPasswordRequest request) {
        return hcClient.syncInvokeHttp(request, CssMeta.resetPassword);
    }

    /**
     * 修改密码
     *
     * 该接口用于修改集群密码。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ResetPasswordRequest 请求对象
     * @return SyncInvoker<ResetPasswordRequest, ResetPasswordResponse>
     */
    public SyncInvoker<ResetPasswordRequest, ResetPasswordResponse> resetPasswordInvoker(ResetPasswordRequest request) {
        return new SyncInvoker<ResetPasswordRequest, ResetPasswordResponse>(request, CssMeta.resetPassword, hcClient);
    }

    /**
     * 重启集群
     *
     * 此接口用于重启集群，重启集群将导致业务中断。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RestartClusterRequest 请求对象
     * @return RestartClusterResponse
     */
    public RestartClusterResponse restartCluster(RestartClusterRequest request) {
        return hcClient.syncInvokeHttp(request, CssMeta.restartCluster);
    }

    /**
     * 重启集群
     *
     * 此接口用于重启集群，重启集群将导致业务中断。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RestartClusterRequest 请求对象
     * @return SyncInvoker<RestartClusterRequest, RestartClusterResponse>
     */
    public SyncInvoker<RestartClusterRequest, RestartClusterResponse> restartClusterInvoker(
        RestartClusterRequest request) {
        return new SyncInvoker<RestartClusterRequest, RestartClusterResponse>(request, CssMeta.restartCluster,
            hcClient);
    }

    /**
     * 恢复快照
     *
     * 该接口用于手动恢复一个快照。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RestoreSnapshotRequest 请求对象
     * @return RestoreSnapshotResponse
     */
    public RestoreSnapshotResponse restoreSnapshot(RestoreSnapshotRequest request) {
        return hcClient.syncInvokeHttp(request, CssMeta.restoreSnapshot);
    }

    /**
     * 恢复快照
     *
     * 该接口用于手动恢复一个快照。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RestoreSnapshotRequest 请求对象
     * @return SyncInvoker<RestoreSnapshotRequest, RestoreSnapshotResponse>
     */
    public SyncInvoker<RestoreSnapshotRequest, RestoreSnapshotResponse> restoreSnapshotInvoker(
        RestoreSnapshotRequest request) {
        return new SyncInvoker<RestoreSnapshotRequest, RestoreSnapshotResponse>(request, CssMeta.restoreSnapshot,
            hcClient);
    }

    /**
     * 查询自动创建快照的策略
     *
     * 该接口用于查询自动创建快照策略。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowAutoCreatePolicyRequest 请求对象
     * @return ShowAutoCreatePolicyResponse
     */
    public ShowAutoCreatePolicyResponse showAutoCreatePolicy(ShowAutoCreatePolicyRequest request) {
        return hcClient.syncInvokeHttp(request, CssMeta.showAutoCreatePolicy);
    }

    /**
     * 查询自动创建快照的策略
     *
     * 该接口用于查询自动创建快照策略。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowAutoCreatePolicyRequest 请求对象
     * @return SyncInvoker<ShowAutoCreatePolicyRequest, ShowAutoCreatePolicyResponse>
     */
    public SyncInvoker<ShowAutoCreatePolicyRequest, ShowAutoCreatePolicyResponse> showAutoCreatePolicyInvoker(
        ShowAutoCreatePolicyRequest request) {
        return new SyncInvoker<ShowAutoCreatePolicyRequest, ShowAutoCreatePolicyResponse>(request,
            CssMeta.showAutoCreatePolicy, hcClient);
    }

    /**
     * 查询集群详情
     *
     * 该接口用于查询并显示单个集群详情。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowClusterDetailRequest 请求对象
     * @return ShowClusterDetailResponse
     */
    public ShowClusterDetailResponse showClusterDetail(ShowClusterDetailRequest request) {
        return hcClient.syncInvokeHttp(request, CssMeta.showClusterDetail);
    }

    /**
     * 查询集群详情
     *
     * 该接口用于查询并显示单个集群详情。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowClusterDetailRequest 请求对象
     * @return SyncInvoker<ShowClusterDetailRequest, ShowClusterDetailResponse>
     */
    public SyncInvoker<ShowClusterDetailRequest, ShowClusterDetailResponse> showClusterDetailInvoker(
        ShowClusterDetailRequest request) {
        return new SyncInvoker<ShowClusterDetailRequest, ShowClusterDetailResponse>(request, CssMeta.showClusterDetail,
            hcClient);
    }

    /**
     * 查询指定集群的标签
     *
     * 该接口用于查询指定集群的标签信息。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowClusterTagRequest 请求对象
     * @return ShowClusterTagResponse
     */
    public ShowClusterTagResponse showClusterTag(ShowClusterTagRequest request) {
        return hcClient.syncInvokeHttp(request, CssMeta.showClusterTag);
    }

    /**
     * 查询指定集群的标签
     *
     * 该接口用于查询指定集群的标签信息。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowClusterTagRequest 请求对象
     * @return SyncInvoker<ShowClusterTagRequest, ShowClusterTagResponse>
     */
    public SyncInvoker<ShowClusterTagRequest, ShowClusterTagResponse> showClusterTagInvoker(
        ShowClusterTagRequest request) {
        return new SyncInvoker<ShowClusterTagRequest, ShowClusterTagResponse>(request, CssMeta.showClusterTag,
            hcClient);
    }

    /**
     * 查询日志基础配置
     *
     * 该接口用于日志基础配置查询。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowGetLogSettingRequest 请求对象
     * @return ShowGetLogSettingResponse
     */
    public ShowGetLogSettingResponse showGetLogSetting(ShowGetLogSettingRequest request) {
        return hcClient.syncInvokeHttp(request, CssMeta.showGetLogSetting);
    }

    /**
     * 查询日志基础配置
     *
     * 该接口用于日志基础配置查询。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowGetLogSettingRequest 请求对象
     * @return SyncInvoker<ShowGetLogSettingRequest, ShowGetLogSettingResponse>
     */
    public SyncInvoker<ShowGetLogSettingRequest, ShowGetLogSettingResponse> showGetLogSettingInvoker(
        ShowGetLogSettingRequest request) {
        return new SyncInvoker<ShowGetLogSettingRequest, ShowGetLogSettingResponse>(request, CssMeta.showGetLogSetting,
            hcClient);
    }

    /**
     * 查询自定义词库状态
     *
     * 该接口用于查询自定义词库的加载状态。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowIkThesaurusRequest 请求对象
     * @return ShowIkThesaurusResponse
     */
    public ShowIkThesaurusResponse showIkThesaurus(ShowIkThesaurusRequest request) {
        return hcClient.syncInvokeHttp(request, CssMeta.showIkThesaurus);
    }

    /**
     * 查询自定义词库状态
     *
     * 该接口用于查询自定义词库的加载状态。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowIkThesaurusRequest 请求对象
     * @return SyncInvoker<ShowIkThesaurusRequest, ShowIkThesaurusResponse>
     */
    public SyncInvoker<ShowIkThesaurusRequest, ShowIkThesaurusResponse> showIkThesaurusInvoker(
        ShowIkThesaurusRequest request) {
        return new SyncInvoker<ShowIkThesaurusRequest, ShowIkThesaurusResponse>(request, CssMeta.showIkThesaurus,
            hcClient);
    }

    /**
     * 查询日志
     *
     * 该接口用于查询日志信息。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowLogBackupRequest 请求对象
     * @return ShowLogBackupResponse
     */
    public ShowLogBackupResponse showLogBackup(ShowLogBackupRequest request) {
        return hcClient.syncInvokeHttp(request, CssMeta.showLogBackup);
    }

    /**
     * 查询日志
     *
     * 该接口用于查询日志信息。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowLogBackupRequest 请求对象
     * @return SyncInvoker<ShowLogBackupRequest, ShowLogBackupResponse>
     */
    public SyncInvoker<ShowLogBackupRequest, ShowLogBackupResponse> showLogBackupInvoker(ShowLogBackupRequest request) {
        return new SyncInvoker<ShowLogBackupRequest, ShowLogBackupResponse>(request, CssMeta.showLogBackup, hcClient);
    }

    /**
     * 获取终端节点连接
     *
     * 该接口用于获取终端节点连接。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowVpcepConnectionRequest 请求对象
     * @return ShowVpcepConnectionResponse
     */
    public ShowVpcepConnectionResponse showVpcepConnection(ShowVpcepConnectionRequest request) {
        return hcClient.syncInvokeHttp(request, CssMeta.showVpcepConnection);
    }

    /**
     * 获取终端节点连接
     *
     * 该接口用于获取终端节点连接。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowVpcepConnectionRequest 请求对象
     * @return SyncInvoker<ShowVpcepConnectionRequest, ShowVpcepConnectionResponse>
     */
    public SyncInvoker<ShowVpcepConnectionRequest, ShowVpcepConnectionResponse> showVpcepConnectionInvoker(
        ShowVpcepConnectionRequest request) {
        return new SyncInvoker<ShowVpcepConnectionRequest, ShowVpcepConnectionResponse>(request,
            CssMeta.showVpcepConnection, hcClient);
    }

    /**
     * 自动设置集群快照的基础配置（不推荐使用）
     *
     * &gt;自动设置集群快照接口将会自动创建快照OBS桶和委托。如果有多个集群，每个集群使用这个接口都会创建一个不一样的OBS桶，可能会导致OBS的配额不够，较多的OBS桶也难以维护。建议可以直接使用[修改集群快照的基础配置](UpdateSnapshotSetting.xml)。
     * 
     * 该接口用于自动设置集群快照的基础配置，包括配置OBS桶和IAM委托。
     * 
     * - “OBS桶”：快照存储的OBS桶位置。
     * - “备份路径”：快照在OBS桶中的存放路径。
     * - “IAM委托”：由于需要将快照保存在OBS中，所以需要在IAM中设置对应的委托获取对OBS服务的授权。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param StartAutoSettingRequest 请求对象
     * @return StartAutoSettingResponse
     */
    public StartAutoSettingResponse startAutoSetting(StartAutoSettingRequest request) {
        return hcClient.syncInvokeHttp(request, CssMeta.startAutoSetting);
    }

    /**
     * 自动设置集群快照的基础配置（不推荐使用）
     *
     * &gt;自动设置集群快照接口将会自动创建快照OBS桶和委托。如果有多个集群，每个集群使用这个接口都会创建一个不一样的OBS桶，可能会导致OBS的配额不够，较多的OBS桶也难以维护。建议可以直接使用[修改集群快照的基础配置](UpdateSnapshotSetting.xml)。
     * 
     * 该接口用于自动设置集群快照的基础配置，包括配置OBS桶和IAM委托。
     * 
     * - “OBS桶”：快照存储的OBS桶位置。
     * - “备份路径”：快照在OBS桶中的存放路径。
     * - “IAM委托”：由于需要将快照保存在OBS中，所以需要在IAM中设置对应的委托获取对OBS服务的授权。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param StartAutoSettingRequest 请求对象
     * @return SyncInvoker<StartAutoSettingRequest, StartAutoSettingResponse>
     */
    public SyncInvoker<StartAutoSettingRequest, StartAutoSettingResponse> startAutoSettingInvoker(
        StartAutoSettingRequest request) {
        return new SyncInvoker<StartAutoSettingRequest, StartAutoSettingResponse>(request, CssMeta.startAutoSetting,
            hcClient);
    }

    /**
     * 开启日志自动备份策略
     *
     * 该接口用于日志自动备份策略开启。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param StartLogAutoBackupPolicyRequest 请求对象
     * @return StartLogAutoBackupPolicyResponse
     */
    public StartLogAutoBackupPolicyResponse startLogAutoBackupPolicy(StartLogAutoBackupPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, CssMeta.startLogAutoBackupPolicy);
    }

    /**
     * 开启日志自动备份策略
     *
     * 该接口用于日志自动备份策略开启。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param StartLogAutoBackupPolicyRequest 请求对象
     * @return SyncInvoker<StartLogAutoBackupPolicyRequest, StartLogAutoBackupPolicyResponse>
     */
    public SyncInvoker<StartLogAutoBackupPolicyRequest, StartLogAutoBackupPolicyResponse> startLogAutoBackupPolicyInvoker(
        StartLogAutoBackupPolicyRequest request) {
        return new SyncInvoker<StartLogAutoBackupPolicyRequest, StartLogAutoBackupPolicyResponse>(request,
            CssMeta.startLogAutoBackupPolicy, hcClient);
    }

    /**
     * 开启日志功能
     *
     * 该接口用于开启日志功能。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param StartLogsRequest 请求对象
     * @return StartLogsResponse
     */
    public StartLogsResponse startLogs(StartLogsRequest request) {
        return hcClient.syncInvokeHttp(request, CssMeta.startLogs);
    }

    /**
     * 开启日志功能
     *
     * 该接口用于开启日志功能。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param StartLogsRequest 请求对象
     * @return SyncInvoker<StartLogsRequest, StartLogsResponse>
     */
    public SyncInvoker<StartLogsRequest, StartLogsResponse> startLogsInvoker(StartLogsRequest request) {
        return new SyncInvoker<StartLogsRequest, StartLogsResponse>(request, CssMeta.startLogs, hcClient);
    }

    /**
     * 开启公网访问控制白名单
     *
     * 该接口用于开启公网访问控制白名单。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param StartPublicWhitelistRequest 请求对象
     * @return StartPublicWhitelistResponse
     */
    public StartPublicWhitelistResponse startPublicWhitelist(StartPublicWhitelistRequest request) {
        return hcClient.syncInvokeHttp(request, CssMeta.startPublicWhitelist);
    }

    /**
     * 开启公网访问控制白名单
     *
     * 该接口用于开启公网访问控制白名单。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param StartPublicWhitelistRequest 请求对象
     * @return SyncInvoker<StartPublicWhitelistRequest, StartPublicWhitelistResponse>
     */
    public SyncInvoker<StartPublicWhitelistRequest, StartPublicWhitelistResponse> startPublicWhitelistInvoker(
        StartPublicWhitelistRequest request) {
        return new SyncInvoker<StartPublicWhitelistRequest, StartPublicWhitelistResponse>(request,
            CssMeta.startPublicWhitelist, hcClient);
    }

    /**
     * 开启终端节点服务
     *
     * 该接口用于开启终端节点服务。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param StartVpecpRequest 请求对象
     * @return StartVpecpResponse
     */
    public StartVpecpResponse startVpecp(StartVpecpRequest request) {
        return hcClient.syncInvokeHttp(request, CssMeta.startVpecp);
    }

    /**
     * 开启终端节点服务
     *
     * 该接口用于开启终端节点服务。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param StartVpecpRequest 请求对象
     * @return SyncInvoker<StartVpecpRequest, StartVpecpResponse>
     */
    public SyncInvoker<StartVpecpRequest, StartVpecpResponse> startVpecpInvoker(StartVpecpRequest request) {
        return new SyncInvoker<StartVpecpRequest, StartVpecpResponse>(request, CssMeta.startVpecp, hcClient);
    }

    /**
     * 关闭日志自动备份策略
     *
     * 该接口用于日志自动备份策略关闭。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param StopLogAutoBackupPolicyRequest 请求对象
     * @return StopLogAutoBackupPolicyResponse
     */
    public StopLogAutoBackupPolicyResponse stopLogAutoBackupPolicy(StopLogAutoBackupPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, CssMeta.stopLogAutoBackupPolicy);
    }

    /**
     * 关闭日志自动备份策略
     *
     * 该接口用于日志自动备份策略关闭。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param StopLogAutoBackupPolicyRequest 请求对象
     * @return SyncInvoker<StopLogAutoBackupPolicyRequest, StopLogAutoBackupPolicyResponse>
     */
    public SyncInvoker<StopLogAutoBackupPolicyRequest, StopLogAutoBackupPolicyResponse> stopLogAutoBackupPolicyInvoker(
        StopLogAutoBackupPolicyRequest request) {
        return new SyncInvoker<StopLogAutoBackupPolicyRequest, StopLogAutoBackupPolicyResponse>(request,
            CssMeta.stopLogAutoBackupPolicy, hcClient);
    }

    /**
     * 关闭日志功能
     *
     * 该接口用于关闭日志功能。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param StopLogsRequest 请求对象
     * @return StopLogsResponse
     */
    public StopLogsResponse stopLogs(StopLogsRequest request) {
        return hcClient.syncInvokeHttp(request, CssMeta.stopLogs);
    }

    /**
     * 关闭日志功能
     *
     * 该接口用于关闭日志功能。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param StopLogsRequest 请求对象
     * @return SyncInvoker<StopLogsRequest, StopLogsResponse>
     */
    public SyncInvoker<StopLogsRequest, StopLogsResponse> stopLogsInvoker(StopLogsRequest request) {
        return new SyncInvoker<StopLogsRequest, StopLogsResponse>(request, CssMeta.stopLogs, hcClient);
    }

    /**
     * 关闭公网访问控制白名单
     *
     * 该接口用于关闭公网访问控制白名单。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param StopPublicWhitelistRequest 请求对象
     * @return StopPublicWhitelistResponse
     */
    public StopPublicWhitelistResponse stopPublicWhitelist(StopPublicWhitelistRequest request) {
        return hcClient.syncInvokeHttp(request, CssMeta.stopPublicWhitelist);
    }

    /**
     * 关闭公网访问控制白名单
     *
     * 该接口用于关闭公网访问控制白名单。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param StopPublicWhitelistRequest 请求对象
     * @return SyncInvoker<StopPublicWhitelistRequest, StopPublicWhitelistResponse>
     */
    public SyncInvoker<StopPublicWhitelistRequest, StopPublicWhitelistResponse> stopPublicWhitelistInvoker(
        StopPublicWhitelistRequest request) {
        return new SyncInvoker<StopPublicWhitelistRequest, StopPublicWhitelistResponse>(request,
            CssMeta.stopPublicWhitelist, hcClient);
    }

    /**
     * 停用快照功能
     *
     * 该接口用于停用快照功能。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param StopSnapshotRequest 请求对象
     * @return StopSnapshotResponse
     */
    public StopSnapshotResponse stopSnapshot(StopSnapshotRequest request) {
        return hcClient.syncInvokeHttp(request, CssMeta.stopSnapshot);
    }

    /**
     * 停用快照功能
     *
     * 该接口用于停用快照功能。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param StopSnapshotRequest 请求对象
     * @return SyncInvoker<StopSnapshotRequest, StopSnapshotResponse>
     */
    public SyncInvoker<StopSnapshotRequest, StopSnapshotResponse> stopSnapshotInvoker(StopSnapshotRequest request) {
        return new SyncInvoker<StopSnapshotRequest, StopSnapshotResponse>(request, CssMeta.stopSnapshot, hcClient);
    }

    /**
     * 关闭终端节点服务
     *
     * 该接口用于关闭终端节点服务。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param StopVpecpRequest 请求对象
     * @return StopVpecpResponse
     */
    public StopVpecpResponse stopVpecp(StopVpecpRequest request) {
        return hcClient.syncInvokeHttp(request, CssMeta.stopVpecp);
    }

    /**
     * 关闭终端节点服务
     *
     * 该接口用于关闭终端节点服务。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param StopVpecpRequest 请求对象
     * @return SyncInvoker<StopVpecpRequest, StopVpecpResponse>
     */
    public SyncInvoker<StopVpecpRequest, StopVpecpResponse> stopVpecpInvoker(StopVpecpRequest request) {
        return new SyncInvoker<StopVpecpRequest, StopVpecpResponse>(request, CssMeta.stopVpecp, hcClient);
    }

    /**
     * 批量添加或删除集群标签
     *
     * 该接口用于对集群批量添加或删除标签。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateBatchClustersTagsRequest 请求对象
     * @return UpdateBatchClustersTagsResponse
     */
    public UpdateBatchClustersTagsResponse updateBatchClustersTags(UpdateBatchClustersTagsRequest request) {
        return hcClient.syncInvokeHttp(request, CssMeta.updateBatchClustersTags);
    }

    /**
     * 批量添加或删除集群标签
     *
     * 该接口用于对集群批量添加或删除标签。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateBatchClustersTagsRequest 请求对象
     * @return SyncInvoker<UpdateBatchClustersTagsRequest, UpdateBatchClustersTagsResponse>
     */
    public SyncInvoker<UpdateBatchClustersTagsRequest, UpdateBatchClustersTagsResponse> updateBatchClustersTagsInvoker(
        UpdateBatchClustersTagsRequest request) {
        return new SyncInvoker<UpdateBatchClustersTagsRequest, UpdateBatchClustersTagsResponse>(request,
            CssMeta.updateBatchClustersTags, hcClient);
    }

    /**
     * 修改集群名称
     *
     * 该接口用于修改集群名称。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateClusterNameRequest 请求对象
     * @return UpdateClusterNameResponse
     */
    public UpdateClusterNameResponse updateClusterName(UpdateClusterNameRequest request) {
        return hcClient.syncInvokeHttp(request, CssMeta.updateClusterName);
    }

    /**
     * 修改集群名称
     *
     * 该接口用于修改集群名称。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateClusterNameRequest 请求对象
     * @return SyncInvoker<UpdateClusterNameRequest, UpdateClusterNameResponse>
     */
    public SyncInvoker<UpdateClusterNameRequest, UpdateClusterNameResponse> updateClusterNameInvoker(
        UpdateClusterNameRequest request) {
        return new SyncInvoker<UpdateClusterNameRequest, UpdateClusterNameResponse>(request, CssMeta.updateClusterName,
            hcClient);
    }

    /**
     * 扩容集群
     *
     * 该接口用于集群扩容实例（仅支持扩容elasticsearch实例）。只扩容普通节点，且只针对要扩容的集群实例不存在特殊节点（Master、Client、冷数据节点）的情况。
     * 
     * 集群扩容实例的数量和存储容量，请参考[扩容实例的数量和存储容量](UpdateExtendInstanceStorage.xml)。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateExtendClusterRequest 请求对象
     * @return UpdateExtendClusterResponse
     */
    public UpdateExtendClusterResponse updateExtendCluster(UpdateExtendClusterRequest request) {
        return hcClient.syncInvokeHttp(request, CssMeta.updateExtendCluster);
    }

    /**
     * 扩容集群
     *
     * 该接口用于集群扩容实例（仅支持扩容elasticsearch实例）。只扩容普通节点，且只针对要扩容的集群实例不存在特殊节点（Master、Client、冷数据节点）的情况。
     * 
     * 集群扩容实例的数量和存储容量，请参考[扩容实例的数量和存储容量](UpdateExtendInstanceStorage.xml)。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateExtendClusterRequest 请求对象
     * @return SyncInvoker<UpdateExtendClusterRequest, UpdateExtendClusterResponse>
     */
    public SyncInvoker<UpdateExtendClusterRequest, UpdateExtendClusterResponse> updateExtendClusterInvoker(
        UpdateExtendClusterRequest request) {
        return new SyncInvoker<UpdateExtendClusterRequest, UpdateExtendClusterResponse>(request,
            CssMeta.updateExtendCluster, hcClient);
    }

    /**
     * 扩容实例的数量和存储容量
     *
     * 该接口用于集群扩容不同类型实例的个数以及存储容量。已经存在独立Master、Client、冷数据节点的集群使用该接口扩容。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateExtendInstanceStorageRequest 请求对象
     * @return UpdateExtendInstanceStorageResponse
     */
    public UpdateExtendInstanceStorageResponse updateExtendInstanceStorage(UpdateExtendInstanceStorageRequest request) {
        return hcClient.syncInvokeHttp(request, CssMeta.updateExtendInstanceStorage);
    }

    /**
     * 扩容实例的数量和存储容量
     *
     * 该接口用于集群扩容不同类型实例的个数以及存储容量。已经存在独立Master、Client、冷数据节点的集群使用该接口扩容。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateExtendInstanceStorageRequest 请求对象
     * @return SyncInvoker<UpdateExtendInstanceStorageRequest, UpdateExtendInstanceStorageResponse>
     */
    public SyncInvoker<UpdateExtendInstanceStorageRequest, UpdateExtendInstanceStorageResponse> updateExtendInstanceStorageInvoker(
        UpdateExtendInstanceStorageRequest request) {
        return new SyncInvoker<UpdateExtendInstanceStorageRequest, UpdateExtendInstanceStorageResponse>(request,
            CssMeta.updateExtendInstanceStorage, hcClient);
    }

    /**
     * 变更规格
     *
     * 该接口用于变更集群规格。只支持变更ess节点类型。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateFlavorRequest 请求对象
     * @return UpdateFlavorResponse
     */
    public UpdateFlavorResponse updateFlavor(UpdateFlavorRequest request) {
        return hcClient.syncInvokeHttp(request, CssMeta.updateFlavor);
    }

    /**
     * 变更规格
     *
     * 该接口用于变更集群规格。只支持变更ess节点类型。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateFlavorRequest 请求对象
     * @return SyncInvoker<UpdateFlavorRequest, UpdateFlavorResponse>
     */
    public SyncInvoker<UpdateFlavorRequest, UpdateFlavorResponse> updateFlavorInvoker(UpdateFlavorRequest request) {
        return new SyncInvoker<UpdateFlavorRequest, UpdateFlavorResponse>(request, CssMeta.updateFlavor, hcClient);
    }

    /**
     * 指定节点类型规格变更
     *
     * 修改集群规格。支持修改:
     * - ess： 数据节点。
     * - ess-cold: 冷数据节点。
     * - ess-client: Client节点。
     * - ess-master: Master节点。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateFlavorByTypeRequest 请求对象
     * @return UpdateFlavorByTypeResponse
     */
    public UpdateFlavorByTypeResponse updateFlavorByType(UpdateFlavorByTypeRequest request) {
        return hcClient.syncInvokeHttp(request, CssMeta.updateFlavorByType);
    }

    /**
     * 指定节点类型规格变更
     *
     * 修改集群规格。支持修改:
     * - ess： 数据节点。
     * - ess-cold: 冷数据节点。
     * - ess-client: Client节点。
     * - ess-master: Master节点。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateFlavorByTypeRequest 请求对象
     * @return SyncInvoker<UpdateFlavorByTypeRequest, UpdateFlavorByTypeResponse>
     */
    public SyncInvoker<UpdateFlavorByTypeRequest, UpdateFlavorByTypeResponse> updateFlavorByTypeInvoker(
        UpdateFlavorByTypeRequest request) {
        return new SyncInvoker<UpdateFlavorByTypeRequest, UpdateFlavorByTypeResponse>(request,
            CssMeta.updateFlavorByType, hcClient);
    }

    /**
     * 修改日志基础配置
     *
     * 该接口用于修改日志基础配置。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateLogSettingRequest 请求对象
     * @return UpdateLogSettingResponse
     */
    public UpdateLogSettingResponse updateLogSetting(UpdateLogSettingRequest request) {
        return hcClient.syncInvokeHttp(request, CssMeta.updateLogSetting);
    }

    /**
     * 修改日志基础配置
     *
     * 该接口用于修改日志基础配置。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateLogSettingRequest 请求对象
     * @return SyncInvoker<UpdateLogSettingRequest, UpdateLogSettingResponse>
     */
    public SyncInvoker<UpdateLogSettingRequest, UpdateLogSettingResponse> updateLogSettingInvoker(
        UpdateLogSettingRequest request) {
        return new SyncInvoker<UpdateLogSettingRequest, UpdateLogSettingResponse>(request, CssMeta.updateLogSetting,
            hcClient);
    }

    /**
     * 按需集群转包周期
     *
     * 该接口用于按需集群转包周期集群。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateOndemandClusterToPeriodRequest 请求对象
     * @return UpdateOndemandClusterToPeriodResponse
     */
    public UpdateOndemandClusterToPeriodResponse updateOndemandClusterToPeriod(
        UpdateOndemandClusterToPeriodRequest request) {
        return hcClient.syncInvokeHttp(request, CssMeta.updateOndemandClusterToPeriod);
    }

    /**
     * 按需集群转包周期
     *
     * 该接口用于按需集群转包周期集群。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateOndemandClusterToPeriodRequest 请求对象
     * @return SyncInvoker<UpdateOndemandClusterToPeriodRequest, UpdateOndemandClusterToPeriodResponse>
     */
    public SyncInvoker<UpdateOndemandClusterToPeriodRequest, UpdateOndemandClusterToPeriodResponse> updateOndemandClusterToPeriodInvoker(
        UpdateOndemandClusterToPeriodRequest request) {
        return new SyncInvoker<UpdateOndemandClusterToPeriodRequest, UpdateOndemandClusterToPeriodResponse>(request,
            CssMeta.updateOndemandClusterToPeriod, hcClient);
    }

    /**
     * 修改公网访问带宽
     *
     * 该接口用于修改公网访问带宽。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdatePublicBandWidthRequest 请求对象
     * @return UpdatePublicBandWidthResponse
     */
    public UpdatePublicBandWidthResponse updatePublicBandWidth(UpdatePublicBandWidthRequest request) {
        return hcClient.syncInvokeHttp(request, CssMeta.updatePublicBandWidth);
    }

    /**
     * 修改公网访问带宽
     *
     * 该接口用于修改公网访问带宽。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdatePublicBandWidthRequest 请求对象
     * @return SyncInvoker<UpdatePublicBandWidthRequest, UpdatePublicBandWidthResponse>
     */
    public SyncInvoker<UpdatePublicBandWidthRequest, UpdatePublicBandWidthResponse> updatePublicBandWidthInvoker(
        UpdatePublicBandWidthRequest request) {
        return new SyncInvoker<UpdatePublicBandWidthRequest, UpdatePublicBandWidthResponse>(request,
            CssMeta.updatePublicBandWidth, hcClient);
    }

    /**
     * 指定节点类型缩容
     *
     * 该接口用于集群对不同类型实例的个数以及存储容量进行缩容。包周期集群不支持API操作。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateShrinkClusterRequest 请求对象
     * @return UpdateShrinkClusterResponse
     */
    public UpdateShrinkClusterResponse updateShrinkCluster(UpdateShrinkClusterRequest request) {
        return hcClient.syncInvokeHttp(request, CssMeta.updateShrinkCluster);
    }

    /**
     * 指定节点类型缩容
     *
     * 该接口用于集群对不同类型实例的个数以及存储容量进行缩容。包周期集群不支持API操作。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateShrinkClusterRequest 请求对象
     * @return SyncInvoker<UpdateShrinkClusterRequest, UpdateShrinkClusterResponse>
     */
    public SyncInvoker<UpdateShrinkClusterRequest, UpdateShrinkClusterResponse> updateShrinkClusterInvoker(
        UpdateShrinkClusterRequest request) {
        return new SyncInvoker<UpdateShrinkClusterRequest, UpdateShrinkClusterResponse>(request,
            CssMeta.updateShrinkCluster, hcClient);
    }

    /**
     * 指定节点缩容
     *
     * 该接口可以对集群现有节点中指定节点进行缩容。包周期集群不支持API操作。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateShrinkNodesRequest 请求对象
     * @return UpdateShrinkNodesResponse
     */
    public UpdateShrinkNodesResponse updateShrinkNodes(UpdateShrinkNodesRequest request) {
        return hcClient.syncInvokeHttp(request, CssMeta.updateShrinkNodes);
    }

    /**
     * 指定节点缩容
     *
     * 该接口可以对集群现有节点中指定节点进行缩容。包周期集群不支持API操作。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateShrinkNodesRequest 请求对象
     * @return SyncInvoker<UpdateShrinkNodesRequest, UpdateShrinkNodesResponse>
     */
    public SyncInvoker<UpdateShrinkNodesRequest, UpdateShrinkNodesResponse> updateShrinkNodesInvoker(
        UpdateShrinkNodesRequest request) {
        return new SyncInvoker<UpdateShrinkNodesRequest, UpdateShrinkNodesResponse>(request, CssMeta.updateShrinkNodes,
            hcClient);
    }

    /**
     * 修改集群快照的基础配置
     *
     * 该接口用于修改集群快照的基础配置，可修改OBS桶和IAM委托。
     * 
     * 可以使用该接口开启快照功能。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateSnapshotSettingRequest 请求对象
     * @return UpdateSnapshotSettingResponse
     */
    public UpdateSnapshotSettingResponse updateSnapshotSetting(UpdateSnapshotSettingRequest request) {
        return hcClient.syncInvokeHttp(request, CssMeta.updateSnapshotSetting);
    }

    /**
     * 修改集群快照的基础配置
     *
     * 该接口用于修改集群快照的基础配置，可修改OBS桶和IAM委托。
     * 
     * 可以使用该接口开启快照功能。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateSnapshotSettingRequest 请求对象
     * @return SyncInvoker<UpdateSnapshotSettingRequest, UpdateSnapshotSettingResponse>
     */
    public SyncInvoker<UpdateSnapshotSettingRequest, UpdateSnapshotSettingResponse> updateSnapshotSettingInvoker(
        UpdateSnapshotSettingRequest request) {
        return new SyncInvoker<UpdateSnapshotSettingRequest, UpdateSnapshotSettingResponse>(request,
            CssMeta.updateSnapshotSetting, hcClient);
    }

    /**
     * 关闭公网访问
     *
     * 该接口用于关闭公网访问。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateUnbindPublicRequest 请求对象
     * @return UpdateUnbindPublicResponse
     */
    public UpdateUnbindPublicResponse updateUnbindPublic(UpdateUnbindPublicRequest request) {
        return hcClient.syncInvokeHttp(request, CssMeta.updateUnbindPublic);
    }

    /**
     * 关闭公网访问
     *
     * 该接口用于关闭公网访问。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateUnbindPublicRequest 请求对象
     * @return SyncInvoker<UpdateUnbindPublicRequest, UpdateUnbindPublicResponse>
     */
    public SyncInvoker<UpdateUnbindPublicRequest, UpdateUnbindPublicResponse> updateUnbindPublicInvoker(
        UpdateUnbindPublicRequest request) {
        return new SyncInvoker<UpdateUnbindPublicRequest, UpdateUnbindPublicResponse>(request,
            CssMeta.updateUnbindPublic, hcClient);
    }

    /**
     * 更新终端节点连接
     *
     * 该接口用于更新终端节点连接。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateVpcepConnectionRequest 请求对象
     * @return UpdateVpcepConnectionResponse
     */
    public UpdateVpcepConnectionResponse updateVpcepConnection(UpdateVpcepConnectionRequest request) {
        return hcClient.syncInvokeHttp(request, CssMeta.updateVpcepConnection);
    }

    /**
     * 更新终端节点连接
     *
     * 该接口用于更新终端节点连接。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateVpcepConnectionRequest 请求对象
     * @return SyncInvoker<UpdateVpcepConnectionRequest, UpdateVpcepConnectionResponse>
     */
    public SyncInvoker<UpdateVpcepConnectionRequest, UpdateVpcepConnectionResponse> updateVpcepConnectionInvoker(
        UpdateVpcepConnectionRequest request) {
        return new SyncInvoker<UpdateVpcepConnectionRequest, UpdateVpcepConnectionResponse>(request,
            CssMeta.updateVpcepConnection, hcClient);
    }

    /**
     * 修改终端节点服务白名单
     *
     * 该接口用于修改终端节点服务白名单。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateVpcepWhitelistRequest 请求对象
     * @return UpdateVpcepWhitelistResponse
     */
    public UpdateVpcepWhitelistResponse updateVpcepWhitelist(UpdateVpcepWhitelistRequest request) {
        return hcClient.syncInvokeHttp(request, CssMeta.updateVpcepWhitelist);
    }

    /**
     * 修改终端节点服务白名单
     *
     * 该接口用于修改终端节点服务白名单。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateVpcepWhitelistRequest 请求对象
     * @return SyncInvoker<UpdateVpcepWhitelistRequest, UpdateVpcepWhitelistResponse>
     */
    public SyncInvoker<UpdateVpcepWhitelistRequest, UpdateVpcepWhitelistResponse> updateVpcepWhitelistInvoker(
        UpdateVpcepWhitelistRequest request) {
        return new SyncInvoker<UpdateVpcepWhitelistRequest, UpdateVpcepWhitelistResponse>(request,
            CssMeta.updateVpcepWhitelist, hcClient);
    }

    /**
     * 修改参数配置
     *
     * 该接口用于修改参数配置。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateYmlsRequest 请求对象
     * @return UpdateYmlsResponse
     */
    public UpdateYmlsResponse updateYmls(UpdateYmlsRequest request) {
        return hcClient.syncInvokeHttp(request, CssMeta.updateYmls);
    }

    /**
     * 修改参数配置
     *
     * 该接口用于修改参数配置。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateYmlsRequest 请求对象
     * @return SyncInvoker<UpdateYmlsRequest, UpdateYmlsResponse>
     */
    public SyncInvoker<UpdateYmlsRequest, UpdateYmlsResponse> updateYmlsInvoker(UpdateYmlsRequest request) {
        return new SyncInvoker<UpdateYmlsRequest, UpdateYmlsResponse>(request, CssMeta.updateYmls, hcClient);
    }

    /**
     * 开启Kibana公网访问
     *
     * 该接口用于开启Kibana公网访问。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param StartKibanaPublicRequest 请求对象
     * @return StartKibanaPublicResponse
     */
    public StartKibanaPublicResponse startKibanaPublic(StartKibanaPublicRequest request) {
        return hcClient.syncInvokeHttp(request, CssMeta.startKibanaPublic);
    }

    /**
     * 开启Kibana公网访问
     *
     * 该接口用于开启Kibana公网访问。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param StartKibanaPublicRequest 请求对象
     * @return SyncInvoker<StartKibanaPublicRequest, StartKibanaPublicResponse>
     */
    public SyncInvoker<StartKibanaPublicRequest, StartKibanaPublicResponse> startKibanaPublicInvoker(
        StartKibanaPublicRequest request) {
        return new SyncInvoker<StartKibanaPublicRequest, StartKibanaPublicResponse>(request, CssMeta.startKibanaPublic,
            hcClient);
    }

    /**
     * 关闭Kibana公网访问控制
     *
     * 该接口用于关闭Kibana公网访问控制。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param StopPublicKibanaWhitelistRequest 请求对象
     * @return StopPublicKibanaWhitelistResponse
     */
    public StopPublicKibanaWhitelistResponse stopPublicKibanaWhitelist(StopPublicKibanaWhitelistRequest request) {
        return hcClient.syncInvokeHttp(request, CssMeta.stopPublicKibanaWhitelist);
    }

    /**
     * 关闭Kibana公网访问控制
     *
     * 该接口用于关闭Kibana公网访问控制。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param StopPublicKibanaWhitelistRequest 请求对象
     * @return SyncInvoker<StopPublicKibanaWhitelistRequest, StopPublicKibanaWhitelistResponse>
     */
    public SyncInvoker<StopPublicKibanaWhitelistRequest, StopPublicKibanaWhitelistResponse> stopPublicKibanaWhitelistInvoker(
        StopPublicKibanaWhitelistRequest request) {
        return new SyncInvoker<StopPublicKibanaWhitelistRequest, StopPublicKibanaWhitelistResponse>(request,
            CssMeta.stopPublicKibanaWhitelist, hcClient);
    }

    /**
     * 修改Kibana公网带宽
     *
     * 该接口用于修改Kibana公网带宽。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateAlterKibanaRequest 请求对象
     * @return UpdateAlterKibanaResponse
     */
    public UpdateAlterKibanaResponse updateAlterKibana(UpdateAlterKibanaRequest request) {
        return hcClient.syncInvokeHttp(request, CssMeta.updateAlterKibana);
    }

    /**
     * 修改Kibana公网带宽
     *
     * 该接口用于修改Kibana公网带宽。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateAlterKibanaRequest 请求对象
     * @return SyncInvoker<UpdateAlterKibanaRequest, UpdateAlterKibanaResponse>
     */
    public SyncInvoker<UpdateAlterKibanaRequest, UpdateAlterKibanaResponse> updateAlterKibanaInvoker(
        UpdateAlterKibanaRequest request) {
        return new SyncInvoker<UpdateAlterKibanaRequest, UpdateAlterKibanaResponse>(request, CssMeta.updateAlterKibana,
            hcClient);
    }

    /**
     * 关闭Kibana公网访问
     *
     * 该接口用于关闭Kibana公网访问。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateCloseKibanaRequest 请求对象
     * @return UpdateCloseKibanaResponse
     */
    public UpdateCloseKibanaResponse updateCloseKibana(UpdateCloseKibanaRequest request) {
        return hcClient.syncInvokeHttp(request, CssMeta.updateCloseKibana);
    }

    /**
     * 关闭Kibana公网访问
     *
     * 该接口用于关闭Kibana公网访问。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateCloseKibanaRequest 请求对象
     * @return SyncInvoker<UpdateCloseKibanaRequest, UpdateCloseKibanaResponse>
     */
    public SyncInvoker<UpdateCloseKibanaRequest, UpdateCloseKibanaResponse> updateCloseKibanaInvoker(
        UpdateCloseKibanaRequest request) {
        return new SyncInvoker<UpdateCloseKibanaRequest, UpdateCloseKibanaResponse>(request, CssMeta.updateCloseKibana,
            hcClient);
    }

    /**
     * 修改Kibana公网访问控制
     *
     * 该接口通过修改kibana白名单，修改kibana的访问权限。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdatePublicKibanaWhitelistRequest 请求对象
     * @return UpdatePublicKibanaWhitelistResponse
     */
    public UpdatePublicKibanaWhitelistResponse updatePublicKibanaWhitelist(UpdatePublicKibanaWhitelistRequest request) {
        return hcClient.syncInvokeHttp(request, CssMeta.updatePublicKibanaWhitelist);
    }

    /**
     * 修改Kibana公网访问控制
     *
     * 该接口通过修改kibana白名单，修改kibana的访问权限。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdatePublicKibanaWhitelistRequest 请求对象
     * @return SyncInvoker<UpdatePublicKibanaWhitelistRequest, UpdatePublicKibanaWhitelistResponse>
     */
    public SyncInvoker<UpdatePublicKibanaWhitelistRequest, UpdatePublicKibanaWhitelistResponse> updatePublicKibanaWhitelistInvoker(
        UpdatePublicKibanaWhitelistRequest request) {
        return new SyncInvoker<UpdatePublicKibanaWhitelistRequest, UpdatePublicKibanaWhitelistResponse>(request,
            CssMeta.updatePublicKibanaWhitelist, hcClient);
    }

    /**
     * 添加到自定义模板
     *
     * 该接口用于添加到自定义模板。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param AddFavoriteRequest 请求对象
     * @return AddFavoriteResponse
     */
    public AddFavoriteResponse addFavorite(AddFavoriteRequest request) {
        return hcClient.syncInvokeHttp(request, CssMeta.addFavorite);
    }

    /**
     * 添加到自定义模板
     *
     * 该接口用于添加到自定义模板。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param AddFavoriteRequest 请求对象
     * @return SyncInvoker<AddFavoriteRequest, AddFavoriteResponse>
     */
    public SyncInvoker<AddFavoriteRequest, AddFavoriteResponse> addFavoriteInvoker(AddFavoriteRequest request) {
        return new SyncInvoker<AddFavoriteRequest, AddFavoriteResponse>(request, CssMeta.addFavorite, hcClient);
    }

    /**
     * 创建配置文件
     *
     * 该接口用于创建配置文件。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateCnfRequest 请求对象
     * @return CreateCnfResponse
     */
    public CreateCnfResponse createCnf(CreateCnfRequest request) {
        return hcClient.syncInvokeHttp(request, CssMeta.createCnf);
    }

    /**
     * 创建配置文件
     *
     * 该接口用于创建配置文件。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateCnfRequest 请求对象
     * @return SyncInvoker<CreateCnfRequest, CreateCnfResponse>
     */
    public SyncInvoker<CreateCnfRequest, CreateCnfResponse> createCnfInvoker(CreateCnfRequest request) {
        return new SyncInvoker<CreateCnfRequest, CreateCnfResponse>(request, CssMeta.createCnf, hcClient);
    }

    /**
     * 删除配置文件
     *
     * 删除配置文件。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteConfRequest 请求对象
     * @return DeleteConfResponse
     */
    public DeleteConfResponse deleteConf(DeleteConfRequest request) {
        return hcClient.syncInvokeHttp(request, CssMeta.deleteConf);
    }

    /**
     * 删除配置文件
     *
     * 删除配置文件。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteConfRequest 请求对象
     * @return SyncInvoker<DeleteConfRequest, DeleteConfResponse>
     */
    public SyncInvoker<DeleteConfRequest, DeleteConfResponse> deleteConfInvoker(DeleteConfRequest request) {
        return new SyncInvoker<DeleteConfRequest, DeleteConfResponse>(request, CssMeta.deleteConf, hcClient);
    }

    /**
     * 删除自定义模板
     *
     * 该接口用于删除自定义模板。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteTemplateRequest 请求对象
     * @return DeleteTemplateResponse
     */
    public DeleteTemplateResponse deleteTemplate(DeleteTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, CssMeta.deleteTemplate);
    }

    /**
     * 删除自定义模板
     *
     * 该接口用于删除自定义模板。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteTemplateRequest 请求对象
     * @return SyncInvoker<DeleteTemplateRequest, DeleteTemplateResponse>
     */
    public SyncInvoker<DeleteTemplateRequest, DeleteTemplateResponse> deleteTemplateInvoker(
        DeleteTemplateRequest request) {
        return new SyncInvoker<DeleteTemplateRequest, DeleteTemplateResponse>(request, CssMeta.deleteTemplate,
            hcClient);
    }

    /**
     * 查询操作记录
     *
     * 该接口用于查询操作记录。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListActionsRequest 请求对象
     * @return ListActionsResponse
     */
    public ListActionsResponse listActions(ListActionsRequest request) {
        return hcClient.syncInvokeHttp(request, CssMeta.listActions);
    }

    /**
     * 查询操作记录
     *
     * 该接口用于查询操作记录。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListActionsRequest 请求对象
     * @return SyncInvoker<ListActionsRequest, ListActionsResponse>
     */
    public SyncInvoker<ListActionsRequest, ListActionsResponse> listActionsInvoker(ListActionsRequest request) {
        return new SyncInvoker<ListActionsRequest, ListActionsResponse>(request, CssMeta.listActions, hcClient);
    }

    /**
     * 查询配置文件列表
     *
     * 该接口用于查询配置文件列表。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListConfsRequest 请求对象
     * @return ListConfsResponse
     */
    public ListConfsResponse listConfs(ListConfsRequest request) {
        return hcClient.syncInvokeHttp(request, CssMeta.listConfs);
    }

    /**
     * 查询配置文件列表
     *
     * 该接口用于查询配置文件列表。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListConfsRequest 请求对象
     * @return SyncInvoker<ListConfsRequest, ListConfsResponse>
     */
    public SyncInvoker<ListConfsRequest, ListConfsResponse> listConfsInvoker(ListConfsRequest request) {
        return new SyncInvoker<ListConfsRequest, ListConfsResponse>(request, CssMeta.listConfs, hcClient);
    }

    /**
     * 查询pipeline列表
     *
     * 该接口用于查询pipeline列表。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListPipelinesRequest 请求对象
     * @return ListPipelinesResponse
     */
    public ListPipelinesResponse listPipelines(ListPipelinesRequest request) {
        return hcClient.syncInvokeHttp(request, CssMeta.listPipelines);
    }

    /**
     * 查询pipeline列表
     *
     * 该接口用于查询pipeline列表。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListPipelinesRequest 请求对象
     * @return SyncInvoker<ListPipelinesRequest, ListPipelinesResponse>
     */
    public SyncInvoker<ListPipelinesRequest, ListPipelinesResponse> listPipelinesInvoker(ListPipelinesRequest request) {
        return new SyncInvoker<ListPipelinesRequest, ListPipelinesResponse>(request, CssMeta.listPipelines, hcClient);
    }

    /**
     * 查询模板列表
     *
     * 该接口用于查询模板列表。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListTemplatesRequest 请求对象
     * @return ListTemplatesResponse
     */
    public ListTemplatesResponse listTemplates(ListTemplatesRequest request) {
        return hcClient.syncInvokeHttp(request, CssMeta.listTemplates);
    }

    /**
     * 查询模板列表
     *
     * 该接口用于查询模板列表。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListTemplatesRequest 请求对象
     * @return SyncInvoker<ListTemplatesRequest, ListTemplatesResponse>
     */
    public SyncInvoker<ListTemplatesRequest, ListTemplatesResponse> listTemplatesInvoker(ListTemplatesRequest request) {
        return new SyncInvoker<ListTemplatesRequest, ListTemplatesResponse>(request, CssMeta.listTemplates, hcClient);
    }

    /**
     * 查询配置文件内容
     *
     * 该接口用于查询配置文件内容。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowGetConfDetailRequest 请求对象
     * @return ShowGetConfDetailResponse
     */
    public ShowGetConfDetailResponse showGetConfDetail(ShowGetConfDetailRequest request) {
        return hcClient.syncInvokeHttp(request, CssMeta.showGetConfDetail);
    }

    /**
     * 查询配置文件内容
     *
     * 该接口用于查询配置文件内容。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowGetConfDetailRequest 请求对象
     * @return SyncInvoker<ShowGetConfDetailRequest, ShowGetConfDetailResponse>
     */
    public SyncInvoker<ShowGetConfDetailRequest, ShowGetConfDetailResponse> showGetConfDetailInvoker(
        ShowGetConfDetailRequest request) {
        return new SyncInvoker<ShowGetConfDetailRequest, ShowGetConfDetailResponse>(request, CssMeta.showGetConfDetail,
            hcClient);
    }

    /**
     * 连通性测试
     *
     * 该接口用于连通性测试。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param StartConnectivityTestRequest 请求对象
     * @return StartConnectivityTestResponse
     */
    public StartConnectivityTestResponse startConnectivityTest(StartConnectivityTestRequest request) {
        return hcClient.syncInvokeHttp(request, CssMeta.startConnectivityTest);
    }

    /**
     * 连通性测试
     *
     * 该接口用于连通性测试。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param StartConnectivityTestRequest 请求对象
     * @return SyncInvoker<StartConnectivityTestRequest, StartConnectivityTestResponse>
     */
    public SyncInvoker<StartConnectivityTestRequest, StartConnectivityTestResponse> startConnectivityTestInvoker(
        StartConnectivityTestRequest request) {
        return new SyncInvoker<StartConnectivityTestRequest, StartConnectivityTestResponse>(request,
            CssMeta.startConnectivityTest, hcClient);
    }

    /**
     * 启动pipeline迁移数据
     *
     * 该接口用于启动pipeline迁移数据。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param StartPipelineRequest 请求对象
     * @return StartPipelineResponse
     */
    public StartPipelineResponse startPipeline(StartPipelineRequest request) {
        return hcClient.syncInvokeHttp(request, CssMeta.startPipeline);
    }

    /**
     * 启动pipeline迁移数据
     *
     * 该接口用于启动pipeline迁移数据。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param StartPipelineRequest 请求对象
     * @return SyncInvoker<StartPipelineRequest, StartPipelineResponse>
     */
    public SyncInvoker<StartPipelineRequest, StartPipelineResponse> startPipelineInvoker(StartPipelineRequest request) {
        return new SyncInvoker<StartPipelineRequest, StartPipelineResponse>(request, CssMeta.startPipeline, hcClient);
    }

    /**
     * 停止pipeline迁移数据
     *
     * 该接口用于停止pipeline迁移数据。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param StopPipelineRequest 请求对象
     * @return StopPipelineResponse
     */
    public StopPipelineResponse stopPipeline(StopPipelineRequest request) {
        return hcClient.syncInvokeHttp(request, CssMeta.stopPipeline);
    }

    /**
     * 停止pipeline迁移数据
     *
     * 该接口用于停止pipeline迁移数据。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param StopPipelineRequest 请求对象
     * @return SyncInvoker<StopPipelineRequest, StopPipelineResponse>
     */
    public SyncInvoker<StopPipelineRequest, StopPipelineResponse> stopPipelineInvoker(StopPipelineRequest request) {
        return new SyncInvoker<StopPipelineRequest, StopPipelineResponse>(request, CssMeta.stopPipeline, hcClient);
    }

    /**
     * 更新配置文件
     *
     * 该接口用于更新配置文件。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateCnfRequest 请求对象
     * @return UpdateCnfResponse
     */
    public UpdateCnfResponse updateCnf(UpdateCnfRequest request) {
        return hcClient.syncInvokeHttp(request, CssMeta.updateCnf);
    }

    /**
     * 更新配置文件
     *
     * 该接口用于更新配置文件。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateCnfRequest 请求对象
     * @return SyncInvoker<UpdateCnfRequest, UpdateCnfResponse>
     */
    public SyncInvoker<UpdateCnfRequest, UpdateCnfResponse> updateCnfInvoker(UpdateCnfRequest request) {
        return new SyncInvoker<UpdateCnfRequest, UpdateCnfResponse>(request, CssMeta.updateCnf, hcClient);
    }

}
