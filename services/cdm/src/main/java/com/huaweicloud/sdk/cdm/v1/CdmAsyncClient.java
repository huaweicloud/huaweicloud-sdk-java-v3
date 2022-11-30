package com.huaweicloud.sdk.cdm.v1;

import com.huaweicloud.sdk.cdm.v1.model.*;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;

import java.util.concurrent.CompletableFuture;

public class CdmAsyncClient {

    protected HcClient hcClient;

    public CdmAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<CdmAsyncClient> newBuilder() {
        return new ClientBuilder<>(CdmAsyncClient::new);
    }

    /**
     * 随机集群创建作业并执行
     *
     * 随机集群创建作业并执行接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateAndStartRandomClusterJobRequest 请求对象
     * @return CompletableFuture<CreateAndStartRandomClusterJobResponse>
     */
    public CompletableFuture<CreateAndStartRandomClusterJobResponse> createAndStartRandomClusterJobAsync(
        CreateAndStartRandomClusterJobRequest request) {
        return hcClient.asyncInvokeHttp(request, CdmMeta.createAndStartRandomClusterJob);
    }

    /**
     * 随机集群创建作业并执行
     *
     * 随机集群创建作业并执行接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateAndStartRandomClusterJobRequest 请求对象
     * @return AsyncInvoker<CreateAndStartRandomClusterJobRequest, CreateAndStartRandomClusterJobResponse>
     */
    public AsyncInvoker<CreateAndStartRandomClusterJobRequest, CreateAndStartRandomClusterJobResponse> createAndStartRandomClusterJobAsyncInvoker(
        CreateAndStartRandomClusterJobRequest request) {
        return new AsyncInvoker<CreateAndStartRandomClusterJobRequest, CreateAndStartRandomClusterJobResponse>(request,
            CdmMeta.createAndStartRandomClusterJob, hcClient);
    }

    /**
     * 创建集群
     *
     * 创建集群接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateClusterRequest 请求对象
     * @return CompletableFuture<CreateClusterResponse>
     */
    public CompletableFuture<CreateClusterResponse> createClusterAsync(CreateClusterRequest request) {
        return hcClient.asyncInvokeHttp(request, CdmMeta.createCluster);
    }

    /**
     * 创建集群
     *
     * 创建集群接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateClusterRequest 请求对象
     * @return AsyncInvoker<CreateClusterRequest, CreateClusterResponse>
     */
    public AsyncInvoker<CreateClusterRequest, CreateClusterResponse> createClusterAsyncInvoker(
        CreateClusterRequest request) {
        return new AsyncInvoker<CreateClusterRequest, CreateClusterResponse>(request, CdmMeta.createCluster, hcClient);
    }

    /**
     * 指定集群创建作业
     *
     * 指定集群创建作业接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateJobRequest 请求对象
     * @return CompletableFuture<CreateJobResponse>
     */
    public CompletableFuture<CreateJobResponse> createJobAsync(CreateJobRequest request) {
        return hcClient.asyncInvokeHttp(request, CdmMeta.createJob);
    }

    /**
     * 指定集群创建作业
     *
     * 指定集群创建作业接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateJobRequest 请求对象
     * @return AsyncInvoker<CreateJobRequest, CreateJobResponse>
     */
    public AsyncInvoker<CreateJobRequest, CreateJobResponse> createJobAsyncInvoker(CreateJobRequest request) {
        return new AsyncInvoker<CreateJobRequest, CreateJobResponse>(request, CdmMeta.createJob, hcClient);
    }

    /**
     * 创建连接
     *
     * 创建连接接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateLinkRequest 请求对象
     * @return CompletableFuture<CreateLinkResponse>
     */
    public CompletableFuture<CreateLinkResponse> createLinkAsync(CreateLinkRequest request) {
        return hcClient.asyncInvokeHttp(request, CdmMeta.createLink);
    }

    /**
     * 创建连接
     *
     * 创建连接接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateLinkRequest 请求对象
     * @return AsyncInvoker<CreateLinkRequest, CreateLinkResponse>
     */
    public AsyncInvoker<CreateLinkRequest, CreateLinkResponse> createLinkAsyncInvoker(CreateLinkRequest request) {
        return new AsyncInvoker<CreateLinkRequest, CreateLinkResponse>(request, CdmMeta.createLink, hcClient);
    }

    /**
     * 删除集群
     *
     * 删除集群接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteClusterRequest 请求对象
     * @return CompletableFuture<DeleteClusterResponse>
     */
    public CompletableFuture<DeleteClusterResponse> deleteClusterAsync(DeleteClusterRequest request) {
        return hcClient.asyncInvokeHttp(request, CdmMeta.deleteCluster);
    }

    /**
     * 删除集群
     *
     * 删除集群接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteClusterRequest 请求对象
     * @return AsyncInvoker<DeleteClusterRequest, DeleteClusterResponse>
     */
    public AsyncInvoker<DeleteClusterRequest, DeleteClusterResponse> deleteClusterAsyncInvoker(
        DeleteClusterRequest request) {
        return new AsyncInvoker<DeleteClusterRequest, DeleteClusterResponse>(request, CdmMeta.deleteCluster, hcClient);
    }

    /**
     * 删除作业
     *
     * 删除作业接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteJobRequest 请求对象
     * @return CompletableFuture<DeleteJobResponse>
     */
    public CompletableFuture<DeleteJobResponse> deleteJobAsync(DeleteJobRequest request) {
        return hcClient.asyncInvokeHttp(request, CdmMeta.deleteJob);
    }

    /**
     * 删除作业
     *
     * 删除作业接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteJobRequest 请求对象
     * @return AsyncInvoker<DeleteJobRequest, DeleteJobResponse>
     */
    public AsyncInvoker<DeleteJobRequest, DeleteJobResponse> deleteJobAsyncInvoker(DeleteJobRequest request) {
        return new AsyncInvoker<DeleteJobRequest, DeleteJobResponse>(request, CdmMeta.deleteJob, hcClient);
    }

    /**
     * 删除连接
     *
     * 删除连接接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteLinkRequest 请求对象
     * @return CompletableFuture<DeleteLinkResponse>
     */
    public CompletableFuture<DeleteLinkResponse> deleteLinkAsync(DeleteLinkRequest request) {
        return hcClient.asyncInvokeHttp(request, CdmMeta.deleteLink);
    }

    /**
     * 删除连接
     *
     * 删除连接接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteLinkRequest 请求对象
     * @return AsyncInvoker<DeleteLinkRequest, DeleteLinkResponse>
     */
    public AsyncInvoker<DeleteLinkRequest, DeleteLinkResponse> deleteLinkAsyncInvoker(DeleteLinkRequest request) {
        return new AsyncInvoker<DeleteLinkRequest, DeleteLinkResponse>(request, CdmMeta.deleteLink, hcClient);
    }

    /**
     * 查询集群列表
     *
     * 查询集群列表接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListClustersRequest 请求对象
     * @return CompletableFuture<ListClustersResponse>
     */
    public CompletableFuture<ListClustersResponse> listClustersAsync(ListClustersRequest request) {
        return hcClient.asyncInvokeHttp(request, CdmMeta.listClusters);
    }

    /**
     * 查询集群列表
     *
     * 查询集群列表接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListClustersRequest 请求对象
     * @return AsyncInvoker<ListClustersRequest, ListClustersResponse>
     */
    public AsyncInvoker<ListClustersRequest, ListClustersResponse> listClustersAsyncInvoker(
        ListClustersRequest request) {
        return new AsyncInvoker<ListClustersRequest, ListClustersResponse>(request, CdmMeta.listClusters, hcClient);
    }

    /**
     * 重启集群
     *
     * 重启集群接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RestartClusterRequest 请求对象
     * @return CompletableFuture<RestartClusterResponse>
     */
    public CompletableFuture<RestartClusterResponse> restartClusterAsync(RestartClusterRequest request) {
        return hcClient.asyncInvokeHttp(request, CdmMeta.restartCluster);
    }

    /**
     * 重启集群
     *
     * 重启集群接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RestartClusterRequest 请求对象
     * @return AsyncInvoker<RestartClusterRequest, RestartClusterResponse>
     */
    public AsyncInvoker<RestartClusterRequest, RestartClusterResponse> restartClusterAsyncInvoker(
        RestartClusterRequest request) {
        return new AsyncInvoker<RestartClusterRequest, RestartClusterResponse>(request, CdmMeta.restartCluster,
            hcClient);
    }

    /**
     * 查询集群详情
     *
     * 查询集群详情接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowClusterDetailRequest 请求对象
     * @return CompletableFuture<ShowClusterDetailResponse>
     */
    public CompletableFuture<ShowClusterDetailResponse> showClusterDetailAsync(ShowClusterDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, CdmMeta.showClusterDetail);
    }

    /**
     * 查询集群详情
     *
     * 查询集群详情接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowClusterDetailRequest 请求对象
     * @return AsyncInvoker<ShowClusterDetailRequest, ShowClusterDetailResponse>
     */
    public AsyncInvoker<ShowClusterDetailRequest, ShowClusterDetailResponse> showClusterDetailAsyncInvoker(
        ShowClusterDetailRequest request) {
        return new AsyncInvoker<ShowClusterDetailRequest, ShowClusterDetailResponse>(request, CdmMeta.showClusterDetail,
            hcClient);
    }

    /**
     * 查询作业状态
     *
     * 查询作业状态接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowJobStatusRequest 请求对象
     * @return CompletableFuture<ShowJobStatusResponse>
     */
    public CompletableFuture<ShowJobStatusResponse> showJobStatusAsync(ShowJobStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, CdmMeta.showJobStatus);
    }

    /**
     * 查询作业状态
     *
     * 查询作业状态接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowJobStatusRequest 请求对象
     * @return AsyncInvoker<ShowJobStatusRequest, ShowJobStatusResponse>
     */
    public AsyncInvoker<ShowJobStatusRequest, ShowJobStatusResponse> showJobStatusAsyncInvoker(
        ShowJobStatusRequest request) {
        return new AsyncInvoker<ShowJobStatusRequest, ShowJobStatusResponse>(request, CdmMeta.showJobStatus, hcClient);
    }

    /**
     * 查询作业
     *
     * 查询作业接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowJobsRequest 请求对象
     * @return CompletableFuture<ShowJobsResponse>
     */
    public CompletableFuture<ShowJobsResponse> showJobsAsync(ShowJobsRequest request) {
        return hcClient.asyncInvokeHttp(request, CdmMeta.showJobs);
    }

    /**
     * 查询作业
     *
     * 查询作业接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowJobsRequest 请求对象
     * @return AsyncInvoker<ShowJobsRequest, ShowJobsResponse>
     */
    public AsyncInvoker<ShowJobsRequest, ShowJobsResponse> showJobsAsyncInvoker(ShowJobsRequest request) {
        return new AsyncInvoker<ShowJobsRequest, ShowJobsResponse>(request, CdmMeta.showJobs, hcClient);
    }

    /**
     * 查询连接
     *
     * 查询连接接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowLinkRequest 请求对象
     * @return CompletableFuture<ShowLinkResponse>
     */
    public CompletableFuture<ShowLinkResponse> showLinkAsync(ShowLinkRequest request) {
        return hcClient.asyncInvokeHttp(request, CdmMeta.showLink);
    }

    /**
     * 查询连接
     *
     * 查询连接接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowLinkRequest 请求对象
     * @return AsyncInvoker<ShowLinkRequest, ShowLinkResponse>
     */
    public AsyncInvoker<ShowLinkRequest, ShowLinkResponse> showLinkAsyncInvoker(ShowLinkRequest request) {
        return new AsyncInvoker<ShowLinkRequest, ShowLinkResponse>(request, CdmMeta.showLink, hcClient);
    }

    /**
     * 查询作业执行历史
     *
     * 查询作业执行历史接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowSubmissionsRequest 请求对象
     * @return CompletableFuture<ShowSubmissionsResponse>
     */
    public CompletableFuture<ShowSubmissionsResponse> showSubmissionsAsync(ShowSubmissionsRequest request) {
        return hcClient.asyncInvokeHttp(request, CdmMeta.showSubmissions);
    }

    /**
     * 查询作业执行历史
     *
     * 查询作业执行历史接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowSubmissionsRequest 请求对象
     * @return AsyncInvoker<ShowSubmissionsRequest, ShowSubmissionsResponse>
     */
    public AsyncInvoker<ShowSubmissionsRequest, ShowSubmissionsResponse> showSubmissionsAsyncInvoker(
        ShowSubmissionsRequest request) {
        return new AsyncInvoker<ShowSubmissionsRequest, ShowSubmissionsResponse>(request, CdmMeta.showSubmissions,
            hcClient);
    }

    /**
     * 启动集群
     *
     * 启动集群接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StartClusterRequest 请求对象
     * @return CompletableFuture<StartClusterResponse>
     */
    public CompletableFuture<StartClusterResponse> startClusterAsync(StartClusterRequest request) {
        return hcClient.asyncInvokeHttp(request, CdmMeta.startCluster);
    }

    /**
     * 启动集群
     *
     * 启动集群接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StartClusterRequest 请求对象
     * @return AsyncInvoker<StartClusterRequest, StartClusterResponse>
     */
    public AsyncInvoker<StartClusterRequest, StartClusterResponse> startClusterAsyncInvoker(
        StartClusterRequest request) {
        return new AsyncInvoker<StartClusterRequest, StartClusterResponse>(request, CdmMeta.startCluster, hcClient);
    }

    /**
     * 启动作业
     *
     * 启动作业接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StartJobRequest 请求对象
     * @return CompletableFuture<StartJobResponse>
     */
    public CompletableFuture<StartJobResponse> startJobAsync(StartJobRequest request) {
        return hcClient.asyncInvokeHttp(request, CdmMeta.startJob);
    }

    /**
     * 启动作业
     *
     * 启动作业接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StartJobRequest 请求对象
     * @return AsyncInvoker<StartJobRequest, StartJobResponse>
     */
    public AsyncInvoker<StartJobRequest, StartJobResponse> startJobAsyncInvoker(StartJobRequest request) {
        return new AsyncInvoker<StartJobRequest, StartJobResponse>(request, CdmMeta.startJob, hcClient);
    }

    /**
     * 停止集群
     *
     * 停止集群接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StopClusterRequest 请求对象
     * @return CompletableFuture<StopClusterResponse>
     */
    public CompletableFuture<StopClusterResponse> stopClusterAsync(StopClusterRequest request) {
        return hcClient.asyncInvokeHttp(request, CdmMeta.stopCluster);
    }

    /**
     * 停止集群
     *
     * 停止集群接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StopClusterRequest 请求对象
     * @return AsyncInvoker<StopClusterRequest, StopClusterResponse>
     */
    public AsyncInvoker<StopClusterRequest, StopClusterResponse> stopClusterAsyncInvoker(StopClusterRequest request) {
        return new AsyncInvoker<StopClusterRequest, StopClusterResponse>(request, CdmMeta.stopCluster, hcClient);
    }

    /**
     * 停止作业
     *
     * 停止作业接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StopJobRequest 请求对象
     * @return CompletableFuture<StopJobResponse>
     */
    public CompletableFuture<StopJobResponse> stopJobAsync(StopJobRequest request) {
        return hcClient.asyncInvokeHttp(request, CdmMeta.stopJob);
    }

    /**
     * 停止作业
     *
     * 停止作业接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StopJobRequest 请求对象
     * @return AsyncInvoker<StopJobRequest, StopJobResponse>
     */
    public AsyncInvoker<StopJobRequest, StopJobResponse> stopJobAsyncInvoker(StopJobRequest request) {
        return new AsyncInvoker<StopJobRequest, StopJobResponse>(request, CdmMeta.stopJob, hcClient);
    }

    /**
     * 修改作业
     *
     * 修改作业接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateJobRequest 请求对象
     * @return CompletableFuture<UpdateJobResponse>
     */
    public CompletableFuture<UpdateJobResponse> updateJobAsync(UpdateJobRequest request) {
        return hcClient.asyncInvokeHttp(request, CdmMeta.updateJob);
    }

    /**
     * 修改作业
     *
     * 修改作业接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateJobRequest 请求对象
     * @return AsyncInvoker<UpdateJobRequest, UpdateJobResponse>
     */
    public AsyncInvoker<UpdateJobRequest, UpdateJobResponse> updateJobAsyncInvoker(UpdateJobRequest request) {
        return new AsyncInvoker<UpdateJobRequest, UpdateJobResponse>(request, CdmMeta.updateJob, hcClient);
    }

    /**
     * 修改连接
     *
     * 修改连接接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateLinkRequest 请求对象
     * @return CompletableFuture<UpdateLinkResponse>
     */
    public CompletableFuture<UpdateLinkResponse> updateLinkAsync(UpdateLinkRequest request) {
        return hcClient.asyncInvokeHttp(request, CdmMeta.updateLink);
    }

    /**
     * 修改连接
     *
     * 修改连接接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateLinkRequest 请求对象
     * @return AsyncInvoker<UpdateLinkRequest, UpdateLinkResponse>
     */
    public AsyncInvoker<UpdateLinkRequest, UpdateLinkResponse> updateLinkAsyncInvoker(UpdateLinkRequest request) {
        return new AsyncInvoker<UpdateLinkRequest, UpdateLinkResponse>(request, CdmMeta.updateLink, hcClient);
    }

}
