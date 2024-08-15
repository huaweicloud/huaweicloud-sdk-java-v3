package com.huaweicloud.sdk.cdm.v1;

import com.huaweicloud.sdk.cdm.v1.model.CreateAndStartRandomClusterJobRequest;
import com.huaweicloud.sdk.cdm.v1.model.CreateAndStartRandomClusterJobResponse;
import com.huaweicloud.sdk.cdm.v1.model.CreateClusterRequest;
import com.huaweicloud.sdk.cdm.v1.model.CreateClusterResponse;
import com.huaweicloud.sdk.cdm.v1.model.CreateJobRequest;
import com.huaweicloud.sdk.cdm.v1.model.CreateJobResponse;
import com.huaweicloud.sdk.cdm.v1.model.CreateLinkRequest;
import com.huaweicloud.sdk.cdm.v1.model.CreateLinkResponse;
import com.huaweicloud.sdk.cdm.v1.model.DeleteClusterRequest;
import com.huaweicloud.sdk.cdm.v1.model.DeleteClusterResponse;
import com.huaweicloud.sdk.cdm.v1.model.DeleteJobRequest;
import com.huaweicloud.sdk.cdm.v1.model.DeleteJobResponse;
import com.huaweicloud.sdk.cdm.v1.model.DeleteLinkRequest;
import com.huaweicloud.sdk.cdm.v1.model.DeleteLinkResponse;
import com.huaweicloud.sdk.cdm.v1.model.ListClustersRequest;
import com.huaweicloud.sdk.cdm.v1.model.ListClustersResponse;
import com.huaweicloud.sdk.cdm.v1.model.ModifyClusterRequest;
import com.huaweicloud.sdk.cdm.v1.model.ModifyClusterResponse;
import com.huaweicloud.sdk.cdm.v1.model.RestartClusterRequest;
import com.huaweicloud.sdk.cdm.v1.model.RestartClusterResponse;
import com.huaweicloud.sdk.cdm.v1.model.ShowAvailabilityZonesRequest;
import com.huaweicloud.sdk.cdm.v1.model.ShowAvailabilityZonesResponse;
import com.huaweicloud.sdk.cdm.v1.model.ShowClusterDetailRequest;
import com.huaweicloud.sdk.cdm.v1.model.ShowClusterDetailResponse;
import com.huaweicloud.sdk.cdm.v1.model.ShowClusterEnterpriseProjectsRequest;
import com.huaweicloud.sdk.cdm.v1.model.ShowClusterEnterpriseProjectsResponse;
import com.huaweicloud.sdk.cdm.v1.model.ShowDatastoresRequest;
import com.huaweicloud.sdk.cdm.v1.model.ShowDatastoresResponse;
import com.huaweicloud.sdk.cdm.v1.model.ShowEnterpriseProjectsRequest;
import com.huaweicloud.sdk.cdm.v1.model.ShowEnterpriseProjectsResponse;
import com.huaweicloud.sdk.cdm.v1.model.ShowFlavorDetailRequest;
import com.huaweicloud.sdk.cdm.v1.model.ShowFlavorDetailResponse;
import com.huaweicloud.sdk.cdm.v1.model.ShowFlavorsRequest;
import com.huaweicloud.sdk.cdm.v1.model.ShowFlavorsResponse;
import com.huaweicloud.sdk.cdm.v1.model.ShowInstanceDetailRequest;
import com.huaweicloud.sdk.cdm.v1.model.ShowInstanceDetailResponse;
import com.huaweicloud.sdk.cdm.v1.model.ShowJobStatusRequest;
import com.huaweicloud.sdk.cdm.v1.model.ShowJobStatusResponse;
import com.huaweicloud.sdk.cdm.v1.model.ShowJobsRequest;
import com.huaweicloud.sdk.cdm.v1.model.ShowJobsResponse;
import com.huaweicloud.sdk.cdm.v1.model.ShowLinkRequest;
import com.huaweicloud.sdk.cdm.v1.model.ShowLinkResponse;
import com.huaweicloud.sdk.cdm.v1.model.ShowSubmissionsRequest;
import com.huaweicloud.sdk.cdm.v1.model.ShowSubmissionsResponse;
import com.huaweicloud.sdk.cdm.v1.model.StartClusterRequest;
import com.huaweicloud.sdk.cdm.v1.model.StartClusterResponse;
import com.huaweicloud.sdk.cdm.v1.model.StartJobRequest;
import com.huaweicloud.sdk.cdm.v1.model.StartJobResponse;
import com.huaweicloud.sdk.cdm.v1.model.StopClusterRequest;
import com.huaweicloud.sdk.cdm.v1.model.StopClusterResponse;
import com.huaweicloud.sdk.cdm.v1.model.StopJobRequest;
import com.huaweicloud.sdk.cdm.v1.model.StopJobResponse;
import com.huaweicloud.sdk.cdm.v1.model.UpdateJobRequest;
import com.huaweicloud.sdk.cdm.v1.model.UpdateJobResponse;
import com.huaweicloud.sdk.cdm.v1.model.UpdateLinkRequest;
import com.huaweicloud.sdk.cdm.v1.model.UpdateLinkResponse;
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
        ClientBuilder<CdmAsyncClient> clientBuilder = new ClientBuilder<>(CdmAsyncClient::new);
        return clientBuilder;
    }

    /**
     * 随机集群创建作业并执行
     *
     * 随机集群创建作业并执行接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAndStartRandomClusterJobRequest 请求对象
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
     * @param request CreateAndStartRandomClusterJobRequest 请求对象
     * @return AsyncInvoker<CreateAndStartRandomClusterJobRequest, CreateAndStartRandomClusterJobResponse>
     */
    public AsyncInvoker<CreateAndStartRandomClusterJobRequest, CreateAndStartRandomClusterJobResponse> createAndStartRandomClusterJobAsyncInvoker(
        CreateAndStartRandomClusterJobRequest request) {
        return new AsyncInvoker<>(request, CdmMeta.createAndStartRandomClusterJob, hcClient);
    }

    /**
     * 创建集群
     *
     * 创建集群接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateClusterRequest 请求对象
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
     * @param request CreateClusterRequest 请求对象
     * @return AsyncInvoker<CreateClusterRequest, CreateClusterResponse>
     */
    public AsyncInvoker<CreateClusterRequest, CreateClusterResponse> createClusterAsyncInvoker(
        CreateClusterRequest request) {
        return new AsyncInvoker<>(request, CdmMeta.createCluster, hcClient);
    }

    /**
     * 指定集群创建作业
     *
     * 指定集群创建作业接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateJobRequest 请求对象
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
     * @param request CreateJobRequest 请求对象
     * @return AsyncInvoker<CreateJobRequest, CreateJobResponse>
     */
    public AsyncInvoker<CreateJobRequest, CreateJobResponse> createJobAsyncInvoker(CreateJobRequest request) {
        return new AsyncInvoker<>(request, CdmMeta.createJob, hcClient);
    }

    /**
     * 创建连接
     *
     * 创建连接接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateLinkRequest 请求对象
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
     * @param request CreateLinkRequest 请求对象
     * @return AsyncInvoker<CreateLinkRequest, CreateLinkResponse>
     */
    public AsyncInvoker<CreateLinkRequest, CreateLinkResponse> createLinkAsyncInvoker(CreateLinkRequest request) {
        return new AsyncInvoker<>(request, CdmMeta.createLink, hcClient);
    }

    /**
     * 删除集群
     *
     * 删除集群接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteClusterRequest 请求对象
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
     * @param request DeleteClusterRequest 请求对象
     * @return AsyncInvoker<DeleteClusterRequest, DeleteClusterResponse>
     */
    public AsyncInvoker<DeleteClusterRequest, DeleteClusterResponse> deleteClusterAsyncInvoker(
        DeleteClusterRequest request) {
        return new AsyncInvoker<>(request, CdmMeta.deleteCluster, hcClient);
    }

    /**
     * 删除作业
     *
     * 删除作业接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteJobRequest 请求对象
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
     * @param request DeleteJobRequest 请求对象
     * @return AsyncInvoker<DeleteJobRequest, DeleteJobResponse>
     */
    public AsyncInvoker<DeleteJobRequest, DeleteJobResponse> deleteJobAsyncInvoker(DeleteJobRequest request) {
        return new AsyncInvoker<>(request, CdmMeta.deleteJob, hcClient);
    }

    /**
     * 删除连接
     *
     * 删除连接接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteLinkRequest 请求对象
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
     * @param request DeleteLinkRequest 请求对象
     * @return AsyncInvoker<DeleteLinkRequest, DeleteLinkResponse>
     */
    public AsyncInvoker<DeleteLinkRequest, DeleteLinkResponse> deleteLinkAsyncInvoker(DeleteLinkRequest request) {
        return new AsyncInvoker<>(request, CdmMeta.deleteLink, hcClient);
    }

    /**
     * 查询集群列表
     *
     * 查询集群列表接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListClustersRequest 请求对象
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
     * @param request ListClustersRequest 请求对象
     * @return AsyncInvoker<ListClustersRequest, ListClustersResponse>
     */
    public AsyncInvoker<ListClustersRequest, ListClustersResponse> listClustersAsyncInvoker(
        ListClustersRequest request) {
        return new AsyncInvoker<>(request, CdmMeta.listClusters, hcClient);
    }

    /**
     * 修改集群
     *
     * 修改CDM集群配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyClusterRequest 请求对象
     * @return CompletableFuture<ModifyClusterResponse>
     */
    public CompletableFuture<ModifyClusterResponse> modifyClusterAsync(ModifyClusterRequest request) {
        return hcClient.asyncInvokeHttp(request, CdmMeta.modifyCluster);
    }

    /**
     * 修改集群
     *
     * 修改CDM集群配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyClusterRequest 请求对象
     * @return AsyncInvoker<ModifyClusterRequest, ModifyClusterResponse>
     */
    public AsyncInvoker<ModifyClusterRequest, ModifyClusterResponse> modifyClusterAsyncInvoker(
        ModifyClusterRequest request) {
        return new AsyncInvoker<>(request, CdmMeta.modifyCluster, hcClient);
    }

    /**
     * 重启集群
     *
     * 重启集群接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RestartClusterRequest 请求对象
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
     * @param request RestartClusterRequest 请求对象
     * @return AsyncInvoker<RestartClusterRequest, RestartClusterResponse>
     */
    public AsyncInvoker<RestartClusterRequest, RestartClusterResponse> restartClusterAsyncInvoker(
        RestartClusterRequest request) {
        return new AsyncInvoker<>(request, CdmMeta.restartCluster, hcClient);
    }

    /**
     * 查询所有可用区
     *
     * 查询CDM集群的所有可用区。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAvailabilityZonesRequest 请求对象
     * @return CompletableFuture<ShowAvailabilityZonesResponse>
     */
    public CompletableFuture<ShowAvailabilityZonesResponse> showAvailabilityZonesAsync(
        ShowAvailabilityZonesRequest request) {
        return hcClient.asyncInvokeHttp(request, CdmMeta.showAvailabilityZones);
    }

    /**
     * 查询所有可用区
     *
     * 查询CDM集群的所有可用区。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAvailabilityZonesRequest 请求对象
     * @return AsyncInvoker<ShowAvailabilityZonesRequest, ShowAvailabilityZonesResponse>
     */
    public AsyncInvoker<ShowAvailabilityZonesRequest, ShowAvailabilityZonesResponse> showAvailabilityZonesAsyncInvoker(
        ShowAvailabilityZonesRequest request) {
        return new AsyncInvoker<>(request, CdmMeta.showAvailabilityZones, hcClient);
    }

    /**
     * 查询集群详情
     *
     * 查询集群详情接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowClusterDetailRequest 请求对象
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
     * @param request ShowClusterDetailRequest 请求对象
     * @return AsyncInvoker<ShowClusterDetailRequest, ShowClusterDetailResponse>
     */
    public AsyncInvoker<ShowClusterDetailRequest, ShowClusterDetailResponse> showClusterDetailAsyncInvoker(
        ShowClusterDetailRequest request) {
        return new AsyncInvoker<>(request, CdmMeta.showClusterDetail, hcClient);
    }

    /**
     * 查询集群的企业项目ID
     *
     * 查询指定集群的企业项目ID。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowClusterEnterpriseProjectsRequest 请求对象
     * @return CompletableFuture<ShowClusterEnterpriseProjectsResponse>
     */
    public CompletableFuture<ShowClusterEnterpriseProjectsResponse> showClusterEnterpriseProjectsAsync(
        ShowClusterEnterpriseProjectsRequest request) {
        return hcClient.asyncInvokeHttp(request, CdmMeta.showClusterEnterpriseProjects);
    }

    /**
     * 查询集群的企业项目ID
     *
     * 查询指定集群的企业项目ID。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowClusterEnterpriseProjectsRequest 请求对象
     * @return AsyncInvoker<ShowClusterEnterpriseProjectsRequest, ShowClusterEnterpriseProjectsResponse>
     */
    public AsyncInvoker<ShowClusterEnterpriseProjectsRequest, ShowClusterEnterpriseProjectsResponse> showClusterEnterpriseProjectsAsyncInvoker(
        ShowClusterEnterpriseProjectsRequest request) {
        return new AsyncInvoker<>(request, CdmMeta.showClusterEnterpriseProjects, hcClient);
    }

    /**
     * 查询支持的版本
     *
     * 查询CDM集群支持的版本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDatastoresRequest 请求对象
     * @return CompletableFuture<ShowDatastoresResponse>
     */
    public CompletableFuture<ShowDatastoresResponse> showDatastoresAsync(ShowDatastoresRequest request) {
        return hcClient.asyncInvokeHttp(request, CdmMeta.showDatastores);
    }

    /**
     * 查询支持的版本
     *
     * 查询CDM集群支持的版本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDatastoresRequest 请求对象
     * @return AsyncInvoker<ShowDatastoresRequest, ShowDatastoresResponse>
     */
    public AsyncInvoker<ShowDatastoresRequest, ShowDatastoresResponse> showDatastoresAsyncInvoker(
        ShowDatastoresRequest request) {
        return new AsyncInvoker<>(request, CdmMeta.showDatastores, hcClient);
    }

    /**
     * 查询所有集群的企业项目ID
     *
     * 查询当前项目下的所有集群的企业项目ID。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowEnterpriseProjectsRequest 请求对象
     * @return CompletableFuture<ShowEnterpriseProjectsResponse>
     */
    public CompletableFuture<ShowEnterpriseProjectsResponse> showEnterpriseProjectsAsync(
        ShowEnterpriseProjectsRequest request) {
        return hcClient.asyncInvokeHttp(request, CdmMeta.showEnterpriseProjects);
    }

    /**
     * 查询所有集群的企业项目ID
     *
     * 查询当前项目下的所有集群的企业项目ID。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowEnterpriseProjectsRequest 请求对象
     * @return AsyncInvoker<ShowEnterpriseProjectsRequest, ShowEnterpriseProjectsResponse>
     */
    public AsyncInvoker<ShowEnterpriseProjectsRequest, ShowEnterpriseProjectsResponse> showEnterpriseProjectsAsyncInvoker(
        ShowEnterpriseProjectsRequest request) {
        return new AsyncInvoker<>(request, CdmMeta.showEnterpriseProjects, hcClient);
    }

    /**
     * 查询规格详情
     *
     * 查询指定规格ID的规格详请。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFlavorDetailRequest 请求对象
     * @return CompletableFuture<ShowFlavorDetailResponse>
     */
    public CompletableFuture<ShowFlavorDetailResponse> showFlavorDetailAsync(ShowFlavorDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, CdmMeta.showFlavorDetail);
    }

    /**
     * 查询规格详情
     *
     * 查询指定规格ID的规格详请。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFlavorDetailRequest 请求对象
     * @return AsyncInvoker<ShowFlavorDetailRequest, ShowFlavorDetailResponse>
     */
    public AsyncInvoker<ShowFlavorDetailRequest, ShowFlavorDetailResponse> showFlavorDetailAsyncInvoker(
        ShowFlavorDetailRequest request) {
        return new AsyncInvoker<>(request, CdmMeta.showFlavorDetail, hcClient);
    }

    /**
     * 查询版本规格
     *
     * 按版本ID查询所有兼容规格。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFlavorsRequest 请求对象
     * @return CompletableFuture<ShowFlavorsResponse>
     */
    public CompletableFuture<ShowFlavorsResponse> showFlavorsAsync(ShowFlavorsRequest request) {
        return hcClient.asyncInvokeHttp(request, CdmMeta.showFlavors);
    }

    /**
     * 查询版本规格
     *
     * 按版本ID查询所有兼容规格。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFlavorsRequest 请求对象
     * @return AsyncInvoker<ShowFlavorsRequest, ShowFlavorsResponse>
     */
    public AsyncInvoker<ShowFlavorsRequest, ShowFlavorsResponse> showFlavorsAsyncInvoker(ShowFlavorsRequest request) {
        return new AsyncInvoker<>(request, CdmMeta.showFlavors, hcClient);
    }

    /**
     * 查询集群实例信息
     *
     * 查询集群实例信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceDetailRequest 请求对象
     * @return CompletableFuture<ShowInstanceDetailResponse>
     */
    public CompletableFuture<ShowInstanceDetailResponse> showInstanceDetailAsync(ShowInstanceDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, CdmMeta.showInstanceDetail);
    }

    /**
     * 查询集群实例信息
     *
     * 查询集群实例信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceDetailRequest 请求对象
     * @return AsyncInvoker<ShowInstanceDetailRequest, ShowInstanceDetailResponse>
     */
    public AsyncInvoker<ShowInstanceDetailRequest, ShowInstanceDetailResponse> showInstanceDetailAsyncInvoker(
        ShowInstanceDetailRequest request) {
        return new AsyncInvoker<>(request, CdmMeta.showInstanceDetail, hcClient);
    }

    /**
     * 查询作业状态
     *
     * 查询作业状态接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowJobStatusRequest 请求对象
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
     * @param request ShowJobStatusRequest 请求对象
     * @return AsyncInvoker<ShowJobStatusRequest, ShowJobStatusResponse>
     */
    public AsyncInvoker<ShowJobStatusRequest, ShowJobStatusResponse> showJobStatusAsyncInvoker(
        ShowJobStatusRequest request) {
        return new AsyncInvoker<>(request, CdmMeta.showJobStatus, hcClient);
    }

    /**
     * 查询作业
     *
     * 查询作业接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowJobsRequest 请求对象
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
     * @param request ShowJobsRequest 请求对象
     * @return AsyncInvoker<ShowJobsRequest, ShowJobsResponse>
     */
    public AsyncInvoker<ShowJobsRequest, ShowJobsResponse> showJobsAsyncInvoker(ShowJobsRequest request) {
        return new AsyncInvoker<>(request, CdmMeta.showJobs, hcClient);
    }

    /**
     * 查询连接
     *
     * 查询连接接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowLinkRequest 请求对象
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
     * @param request ShowLinkRequest 请求对象
     * @return AsyncInvoker<ShowLinkRequest, ShowLinkResponse>
     */
    public AsyncInvoker<ShowLinkRequest, ShowLinkResponse> showLinkAsyncInvoker(ShowLinkRequest request) {
        return new AsyncInvoker<>(request, CdmMeta.showLink, hcClient);
    }

    /**
     * 查询作业执行历史
     *
     * 查询作业执行历史接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSubmissionsRequest 请求对象
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
     * @param request ShowSubmissionsRequest 请求对象
     * @return AsyncInvoker<ShowSubmissionsRequest, ShowSubmissionsResponse>
     */
    public AsyncInvoker<ShowSubmissionsRequest, ShowSubmissionsResponse> showSubmissionsAsyncInvoker(
        ShowSubmissionsRequest request) {
        return new AsyncInvoker<>(request, CdmMeta.showSubmissions, hcClient);
    }

    /**
     * 启动集群
     *
     * 启动集群接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartClusterRequest 请求对象
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
     * @param request StartClusterRequest 请求对象
     * @return AsyncInvoker<StartClusterRequest, StartClusterResponse>
     */
    public AsyncInvoker<StartClusterRequest, StartClusterResponse> startClusterAsyncInvoker(
        StartClusterRequest request) {
        return new AsyncInvoker<>(request, CdmMeta.startCluster, hcClient);
    }

    /**
     * 启动作业
     *
     * 启动作业接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartJobRequest 请求对象
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
     * @param request StartJobRequest 请求对象
     * @return AsyncInvoker<StartJobRequest, StartJobResponse>
     */
    public AsyncInvoker<StartJobRequest, StartJobResponse> startJobAsyncInvoker(StartJobRequest request) {
        return new AsyncInvoker<>(request, CdmMeta.startJob, hcClient);
    }

    /**
     * 停止集群
     *
     * 停止集群接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopClusterRequest 请求对象
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
     * @param request StopClusterRequest 请求对象
     * @return AsyncInvoker<StopClusterRequest, StopClusterResponse>
     */
    public AsyncInvoker<StopClusterRequest, StopClusterResponse> stopClusterAsyncInvoker(StopClusterRequest request) {
        return new AsyncInvoker<>(request, CdmMeta.stopCluster, hcClient);
    }

    /**
     * 停止作业
     *
     * 停止作业接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopJobRequest 请求对象
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
     * @param request StopJobRequest 请求对象
     * @return AsyncInvoker<StopJobRequest, StopJobResponse>
     */
    public AsyncInvoker<StopJobRequest, StopJobResponse> stopJobAsyncInvoker(StopJobRequest request) {
        return new AsyncInvoker<>(request, CdmMeta.stopJob, hcClient);
    }

    /**
     * 修改作业
     *
     * 修改作业接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateJobRequest 请求对象
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
     * @param request UpdateJobRequest 请求对象
     * @return AsyncInvoker<UpdateJobRequest, UpdateJobResponse>
     */
    public AsyncInvoker<UpdateJobRequest, UpdateJobResponse> updateJobAsyncInvoker(UpdateJobRequest request) {
        return new AsyncInvoker<>(request, CdmMeta.updateJob, hcClient);
    }

    /**
     * 修改连接
     *
     * 修改连接接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateLinkRequest 请求对象
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
     * @param request UpdateLinkRequest 请求对象
     * @return AsyncInvoker<UpdateLinkRequest, UpdateLinkResponse>
     */
    public AsyncInvoker<UpdateLinkRequest, UpdateLinkResponse> updateLinkAsyncInvoker(UpdateLinkRequest request) {
        return new AsyncInvoker<>(request, CdmMeta.updateLink, hcClient);
    }

}
