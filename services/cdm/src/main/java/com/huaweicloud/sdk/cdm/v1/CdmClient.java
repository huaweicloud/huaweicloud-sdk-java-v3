package com.huaweicloud.sdk.cdm.v1;

import com.huaweicloud.sdk.cdm.v1.model.*;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;

public class CdmClient {

    protected HcClient hcClient;

    public CdmClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<CdmClient> newBuilder() {
        return new ClientBuilder<>(CdmClient::new);
    }

    /**
     * 随机集群创建作业并执行
     *
     * 随机集群创建作业并执行接口。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateAndStartRandomClusterJobRequest 请求对象
     * @return CreateAndStartRandomClusterJobResponse
     */
    public CreateAndStartRandomClusterJobResponse createAndStartRandomClusterJob(
        CreateAndStartRandomClusterJobRequest request) {
        return hcClient.syncInvokeHttp(request, CdmMeta.createAndStartRandomClusterJob);
    }

    /**
     * 随机集群创建作业并执行
     *
     * 随机集群创建作业并执行接口。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateAndStartRandomClusterJobRequest 请求对象
     * @return SyncInvoker<CreateAndStartRandomClusterJobRequest, CreateAndStartRandomClusterJobResponse>
     */
    public SyncInvoker<CreateAndStartRandomClusterJobRequest, CreateAndStartRandomClusterJobResponse> createAndStartRandomClusterJobInvoker(
        CreateAndStartRandomClusterJobRequest request) {
        return new SyncInvoker<CreateAndStartRandomClusterJobRequest, CreateAndStartRandomClusterJobResponse>(request,
            CdmMeta.createAndStartRandomClusterJob, hcClient);
    }

    /**
     * 创建集群
     *
     * 创建集群接口。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateClusterRequest 请求对象
     * @return CreateClusterResponse
     */
    public CreateClusterResponse createCluster(CreateClusterRequest request) {
        return hcClient.syncInvokeHttp(request, CdmMeta.createCluster);
    }

    /**
     * 创建集群
     *
     * 创建集群接口。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateClusterRequest 请求对象
     * @return SyncInvoker<CreateClusterRequest, CreateClusterResponse>
     */
    public SyncInvoker<CreateClusterRequest, CreateClusterResponse> createClusterInvoker(CreateClusterRequest request) {
        return new SyncInvoker<CreateClusterRequest, CreateClusterResponse>(request, CdmMeta.createCluster, hcClient);
    }

    /**
     * 指定集群创建作业
     *
     * 指定集群创建作业接口。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateJobRequest 请求对象
     * @return CreateJobResponse
     */
    public CreateJobResponse createJob(CreateJobRequest request) {
        return hcClient.syncInvokeHttp(request, CdmMeta.createJob);
    }

    /**
     * 指定集群创建作业
     *
     * 指定集群创建作业接口。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateJobRequest 请求对象
     * @return SyncInvoker<CreateJobRequest, CreateJobResponse>
     */
    public SyncInvoker<CreateJobRequest, CreateJobResponse> createJobInvoker(CreateJobRequest request) {
        return new SyncInvoker<CreateJobRequest, CreateJobResponse>(request, CdmMeta.createJob, hcClient);
    }

    /**
     * 创建连接
     *
     * 创建连接接口。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateLinkRequest 请求对象
     * @return CreateLinkResponse
     */
    public CreateLinkResponse createLink(CreateLinkRequest request) {
        return hcClient.syncInvokeHttp(request, CdmMeta.createLink);
    }

    /**
     * 创建连接
     *
     * 创建连接接口。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateLinkRequest 请求对象
     * @return SyncInvoker<CreateLinkRequest, CreateLinkResponse>
     */
    public SyncInvoker<CreateLinkRequest, CreateLinkResponse> createLinkInvoker(CreateLinkRequest request) {
        return new SyncInvoker<CreateLinkRequest, CreateLinkResponse>(request, CdmMeta.createLink, hcClient);
    }

    /**
     * 删除集群
     *
     * 删除集群接口。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteClusterRequest 请求对象
     * @return DeleteClusterResponse
     */
    public DeleteClusterResponse deleteCluster(DeleteClusterRequest request) {
        return hcClient.syncInvokeHttp(request, CdmMeta.deleteCluster);
    }

    /**
     * 删除集群
     *
     * 删除集群接口。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteClusterRequest 请求对象
     * @return SyncInvoker<DeleteClusterRequest, DeleteClusterResponse>
     */
    public SyncInvoker<DeleteClusterRequest, DeleteClusterResponse> deleteClusterInvoker(DeleteClusterRequest request) {
        return new SyncInvoker<DeleteClusterRequest, DeleteClusterResponse>(request, CdmMeta.deleteCluster, hcClient);
    }

    /**
     * 删除作业
     *
     * 删除作业接口。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteJobRequest 请求对象
     * @return DeleteJobResponse
     */
    public DeleteJobResponse deleteJob(DeleteJobRequest request) {
        return hcClient.syncInvokeHttp(request, CdmMeta.deleteJob);
    }

    /**
     * 删除作业
     *
     * 删除作业接口。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteJobRequest 请求对象
     * @return SyncInvoker<DeleteJobRequest, DeleteJobResponse>
     */
    public SyncInvoker<DeleteJobRequest, DeleteJobResponse> deleteJobInvoker(DeleteJobRequest request) {
        return new SyncInvoker<DeleteJobRequest, DeleteJobResponse>(request, CdmMeta.deleteJob, hcClient);
    }

    /**
     * 删除连接
     *
     * 删除连接接口。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteLinkRequest 请求对象
     * @return DeleteLinkResponse
     */
    public DeleteLinkResponse deleteLink(DeleteLinkRequest request) {
        return hcClient.syncInvokeHttp(request, CdmMeta.deleteLink);
    }

    /**
     * 删除连接
     *
     * 删除连接接口。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteLinkRequest 请求对象
     * @return SyncInvoker<DeleteLinkRequest, DeleteLinkResponse>
     */
    public SyncInvoker<DeleteLinkRequest, DeleteLinkResponse> deleteLinkInvoker(DeleteLinkRequest request) {
        return new SyncInvoker<DeleteLinkRequest, DeleteLinkResponse>(request, CdmMeta.deleteLink, hcClient);
    }

    /**
     * 查询集群列表
     *
     * 查询集群列表接口。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListClustersRequest 请求对象
     * @return ListClustersResponse
     */
    public ListClustersResponse listClusters(ListClustersRequest request) {
        return hcClient.syncInvokeHttp(request, CdmMeta.listClusters);
    }

    /**
     * 查询集群列表
     *
     * 查询集群列表接口。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListClustersRequest 请求对象
     * @return SyncInvoker<ListClustersRequest, ListClustersResponse>
     */
    public SyncInvoker<ListClustersRequest, ListClustersResponse> listClustersInvoker(ListClustersRequest request) {
        return new SyncInvoker<ListClustersRequest, ListClustersResponse>(request, CdmMeta.listClusters, hcClient);
    }

    /**
     * 重启集群
     *
     * 重启集群接口。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RestartClusterRequest 请求对象
     * @return RestartClusterResponse
     */
    public RestartClusterResponse restartCluster(RestartClusterRequest request) {
        return hcClient.syncInvokeHttp(request, CdmMeta.restartCluster);
    }

    /**
     * 重启集群
     *
     * 重启集群接口。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RestartClusterRequest 请求对象
     * @return SyncInvoker<RestartClusterRequest, RestartClusterResponse>
     */
    public SyncInvoker<RestartClusterRequest, RestartClusterResponse> restartClusterInvoker(
        RestartClusterRequest request) {
        return new SyncInvoker<RestartClusterRequest, RestartClusterResponse>(request, CdmMeta.restartCluster,
            hcClient);
    }

    /**
     * 查询集群详情
     *
     * 查询集群详情接口。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowClusterDetailRequest 请求对象
     * @return ShowClusterDetailResponse
     */
    public ShowClusterDetailResponse showClusterDetail(ShowClusterDetailRequest request) {
        return hcClient.syncInvokeHttp(request, CdmMeta.showClusterDetail);
    }

    /**
     * 查询集群详情
     *
     * 查询集群详情接口。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowClusterDetailRequest 请求对象
     * @return SyncInvoker<ShowClusterDetailRequest, ShowClusterDetailResponse>
     */
    public SyncInvoker<ShowClusterDetailRequest, ShowClusterDetailResponse> showClusterDetailInvoker(
        ShowClusterDetailRequest request) {
        return new SyncInvoker<ShowClusterDetailRequest, ShowClusterDetailResponse>(request, CdmMeta.showClusterDetail,
            hcClient);
    }

    /**
     * 查询作业状态
     *
     * 查询作业状态接口。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowJobStatusRequest 请求对象
     * @return ShowJobStatusResponse
     */
    public ShowJobStatusResponse showJobStatus(ShowJobStatusRequest request) {
        return hcClient.syncInvokeHttp(request, CdmMeta.showJobStatus);
    }

    /**
     * 查询作业状态
     *
     * 查询作业状态接口。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowJobStatusRequest 请求对象
     * @return SyncInvoker<ShowJobStatusRequest, ShowJobStatusResponse>
     */
    public SyncInvoker<ShowJobStatusRequest, ShowJobStatusResponse> showJobStatusInvoker(ShowJobStatusRequest request) {
        return new SyncInvoker<ShowJobStatusRequest, ShowJobStatusResponse>(request, CdmMeta.showJobStatus, hcClient);
    }

    /**
     * 查询作业
     *
     * 查询作业接口。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowJobsRequest 请求对象
     * @return ShowJobsResponse
     */
    public ShowJobsResponse showJobs(ShowJobsRequest request) {
        return hcClient.syncInvokeHttp(request, CdmMeta.showJobs);
    }

    /**
     * 查询作业
     *
     * 查询作业接口。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowJobsRequest 请求对象
     * @return SyncInvoker<ShowJobsRequest, ShowJobsResponse>
     */
    public SyncInvoker<ShowJobsRequest, ShowJobsResponse> showJobsInvoker(ShowJobsRequest request) {
        return new SyncInvoker<ShowJobsRequest, ShowJobsResponse>(request, CdmMeta.showJobs, hcClient);
    }

    /**
     * 查询连接
     *
     * 查询连接接口。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowLinkRequest 请求对象
     * @return ShowLinkResponse
     */
    public ShowLinkResponse showLink(ShowLinkRequest request) {
        return hcClient.syncInvokeHttp(request, CdmMeta.showLink);
    }

    /**
     * 查询连接
     *
     * 查询连接接口。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowLinkRequest 请求对象
     * @return SyncInvoker<ShowLinkRequest, ShowLinkResponse>
     */
    public SyncInvoker<ShowLinkRequest, ShowLinkResponse> showLinkInvoker(ShowLinkRequest request) {
        return new SyncInvoker<ShowLinkRequest, ShowLinkResponse>(request, CdmMeta.showLink, hcClient);
    }

    /**
     * 查询作业执行历史
     *
     * 查询作业执行历史接口。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowSubmissionsRequest 请求对象
     * @return ShowSubmissionsResponse
     */
    public ShowSubmissionsResponse showSubmissions(ShowSubmissionsRequest request) {
        return hcClient.syncInvokeHttp(request, CdmMeta.showSubmissions);
    }

    /**
     * 查询作业执行历史
     *
     * 查询作业执行历史接口。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowSubmissionsRequest 请求对象
     * @return SyncInvoker<ShowSubmissionsRequest, ShowSubmissionsResponse>
     */
    public SyncInvoker<ShowSubmissionsRequest, ShowSubmissionsResponse> showSubmissionsInvoker(
        ShowSubmissionsRequest request) {
        return new SyncInvoker<ShowSubmissionsRequest, ShowSubmissionsResponse>(request, CdmMeta.showSubmissions,
            hcClient);
    }

    /**
     * 启动集群
     *
     * 启动集群接口。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param StartClusterRequest 请求对象
     * @return StartClusterResponse
     */
    public StartClusterResponse startCluster(StartClusterRequest request) {
        return hcClient.syncInvokeHttp(request, CdmMeta.startCluster);
    }

    /**
     * 启动集群
     *
     * 启动集群接口。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param StartClusterRequest 请求对象
     * @return SyncInvoker<StartClusterRequest, StartClusterResponse>
     */
    public SyncInvoker<StartClusterRequest, StartClusterResponse> startClusterInvoker(StartClusterRequest request) {
        return new SyncInvoker<StartClusterRequest, StartClusterResponse>(request, CdmMeta.startCluster, hcClient);
    }

    /**
     * 启动作业
     *
     * 启动作业接口。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param StartJobRequest 请求对象
     * @return StartJobResponse
     */
    public StartJobResponse startJob(StartJobRequest request) {
        return hcClient.syncInvokeHttp(request, CdmMeta.startJob);
    }

    /**
     * 启动作业
     *
     * 启动作业接口。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param StartJobRequest 请求对象
     * @return SyncInvoker<StartJobRequest, StartJobResponse>
     */
    public SyncInvoker<StartJobRequest, StartJobResponse> startJobInvoker(StartJobRequest request) {
        return new SyncInvoker<StartJobRequest, StartJobResponse>(request, CdmMeta.startJob, hcClient);
    }

    /**
     * 停止集群
     *
     * 停止集群接口。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param StopClusterRequest 请求对象
     * @return StopClusterResponse
     */
    public StopClusterResponse stopCluster(StopClusterRequest request) {
        return hcClient.syncInvokeHttp(request, CdmMeta.stopCluster);
    }

    /**
     * 停止集群
     *
     * 停止集群接口。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param StopClusterRequest 请求对象
     * @return SyncInvoker<StopClusterRequest, StopClusterResponse>
     */
    public SyncInvoker<StopClusterRequest, StopClusterResponse> stopClusterInvoker(StopClusterRequest request) {
        return new SyncInvoker<StopClusterRequest, StopClusterResponse>(request, CdmMeta.stopCluster, hcClient);
    }

    /**
     * 停止作业
     *
     * 停止作业接口。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param StopJobRequest 请求对象
     * @return StopJobResponse
     */
    public StopJobResponse stopJob(StopJobRequest request) {
        return hcClient.syncInvokeHttp(request, CdmMeta.stopJob);
    }

    /**
     * 停止作业
     *
     * 停止作业接口。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param StopJobRequest 请求对象
     * @return SyncInvoker<StopJobRequest, StopJobResponse>
     */
    public SyncInvoker<StopJobRequest, StopJobResponse> stopJobInvoker(StopJobRequest request) {
        return new SyncInvoker<StopJobRequest, StopJobResponse>(request, CdmMeta.stopJob, hcClient);
    }

    /**
     * 修改作业
     *
     * 修改作业接口。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateJobRequest 请求对象
     * @return UpdateJobResponse
     */
    public UpdateJobResponse updateJob(UpdateJobRequest request) {
        return hcClient.syncInvokeHttp(request, CdmMeta.updateJob);
    }

    /**
     * 修改作业
     *
     * 修改作业接口。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateJobRequest 请求对象
     * @return SyncInvoker<UpdateJobRequest, UpdateJobResponse>
     */
    public SyncInvoker<UpdateJobRequest, UpdateJobResponse> updateJobInvoker(UpdateJobRequest request) {
        return new SyncInvoker<UpdateJobRequest, UpdateJobResponse>(request, CdmMeta.updateJob, hcClient);
    }

    /**
     * 修改连接
     *
     * 修改连接接口。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateLinkRequest 请求对象
     * @return UpdateLinkResponse
     */
    public UpdateLinkResponse updateLink(UpdateLinkRequest request) {
        return hcClient.syncInvokeHttp(request, CdmMeta.updateLink);
    }

    /**
     * 修改连接
     *
     * 修改连接接口。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateLinkRequest 请求对象
     * @return SyncInvoker<UpdateLinkRequest, UpdateLinkResponse>
     */
    public SyncInvoker<UpdateLinkRequest, UpdateLinkResponse> updateLinkInvoker(UpdateLinkRequest request) {
        return new SyncInvoker<UpdateLinkRequest, UpdateLinkResponse>(request, CdmMeta.updateLink, hcClient);
    }

}
