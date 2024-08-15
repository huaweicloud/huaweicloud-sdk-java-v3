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
import com.huaweicloud.sdk.core.invoker.SyncInvoker;

public class CdmClient {

    protected HcClient hcClient;

    public CdmClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<CdmClient> newBuilder() {
        ClientBuilder<CdmClient> clientBuilder = new ClientBuilder<>(CdmClient::new);
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
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAndStartRandomClusterJobRequest 请求对象
     * @return SyncInvoker<CreateAndStartRandomClusterJobRequest, CreateAndStartRandomClusterJobResponse>
     */
    public SyncInvoker<CreateAndStartRandomClusterJobRequest, CreateAndStartRandomClusterJobResponse> createAndStartRandomClusterJobInvoker(
        CreateAndStartRandomClusterJobRequest request) {
        return new SyncInvoker<>(request, CdmMeta.createAndStartRandomClusterJob, hcClient);
    }

    /**
     * 创建集群
     *
     * 创建集群接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateClusterRequest 请求对象
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
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateClusterRequest 请求对象
     * @return SyncInvoker<CreateClusterRequest, CreateClusterResponse>
     */
    public SyncInvoker<CreateClusterRequest, CreateClusterResponse> createClusterInvoker(CreateClusterRequest request) {
        return new SyncInvoker<>(request, CdmMeta.createCluster, hcClient);
    }

    /**
     * 指定集群创建作业
     *
     * 指定集群创建作业接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateJobRequest 请求对象
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
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateJobRequest 请求对象
     * @return SyncInvoker<CreateJobRequest, CreateJobResponse>
     */
    public SyncInvoker<CreateJobRequest, CreateJobResponse> createJobInvoker(CreateJobRequest request) {
        return new SyncInvoker<>(request, CdmMeta.createJob, hcClient);
    }

    /**
     * 创建连接
     *
     * 创建连接接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateLinkRequest 请求对象
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
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateLinkRequest 请求对象
     * @return SyncInvoker<CreateLinkRequest, CreateLinkResponse>
     */
    public SyncInvoker<CreateLinkRequest, CreateLinkResponse> createLinkInvoker(CreateLinkRequest request) {
        return new SyncInvoker<>(request, CdmMeta.createLink, hcClient);
    }

    /**
     * 删除集群
     *
     * 删除集群接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteClusterRequest 请求对象
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
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteClusterRequest 请求对象
     * @return SyncInvoker<DeleteClusterRequest, DeleteClusterResponse>
     */
    public SyncInvoker<DeleteClusterRequest, DeleteClusterResponse> deleteClusterInvoker(DeleteClusterRequest request) {
        return new SyncInvoker<>(request, CdmMeta.deleteCluster, hcClient);
    }

    /**
     * 删除作业
     *
     * 删除作业接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteJobRequest 请求对象
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
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteJobRequest 请求对象
     * @return SyncInvoker<DeleteJobRequest, DeleteJobResponse>
     */
    public SyncInvoker<DeleteJobRequest, DeleteJobResponse> deleteJobInvoker(DeleteJobRequest request) {
        return new SyncInvoker<>(request, CdmMeta.deleteJob, hcClient);
    }

    /**
     * 删除连接
     *
     * 删除连接接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteLinkRequest 请求对象
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
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteLinkRequest 请求对象
     * @return SyncInvoker<DeleteLinkRequest, DeleteLinkResponse>
     */
    public SyncInvoker<DeleteLinkRequest, DeleteLinkResponse> deleteLinkInvoker(DeleteLinkRequest request) {
        return new SyncInvoker<>(request, CdmMeta.deleteLink, hcClient);
    }

    /**
     * 查询集群列表
     *
     * 查询集群列表接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListClustersRequest 请求对象
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
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListClustersRequest 请求对象
     * @return SyncInvoker<ListClustersRequest, ListClustersResponse>
     */
    public SyncInvoker<ListClustersRequest, ListClustersResponse> listClustersInvoker(ListClustersRequest request) {
        return new SyncInvoker<>(request, CdmMeta.listClusters, hcClient);
    }

    /**
     * 修改集群
     *
     * 修改CDM集群配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyClusterRequest 请求对象
     * @return ModifyClusterResponse
     */
    public ModifyClusterResponse modifyCluster(ModifyClusterRequest request) {
        return hcClient.syncInvokeHttp(request, CdmMeta.modifyCluster);
    }

    /**
     * 修改集群
     *
     * 修改CDM集群配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyClusterRequest 请求对象
     * @return SyncInvoker<ModifyClusterRequest, ModifyClusterResponse>
     */
    public SyncInvoker<ModifyClusterRequest, ModifyClusterResponse> modifyClusterInvoker(ModifyClusterRequest request) {
        return new SyncInvoker<>(request, CdmMeta.modifyCluster, hcClient);
    }

    /**
     * 重启集群
     *
     * 重启集群接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RestartClusterRequest 请求对象
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
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RestartClusterRequest 请求对象
     * @return SyncInvoker<RestartClusterRequest, RestartClusterResponse>
     */
    public SyncInvoker<RestartClusterRequest, RestartClusterResponse> restartClusterInvoker(
        RestartClusterRequest request) {
        return new SyncInvoker<>(request, CdmMeta.restartCluster, hcClient);
    }

    /**
     * 查询所有可用区
     *
     * 查询CDM集群的所有可用区。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAvailabilityZonesRequest 请求对象
     * @return ShowAvailabilityZonesResponse
     */
    public ShowAvailabilityZonesResponse showAvailabilityZones(ShowAvailabilityZonesRequest request) {
        return hcClient.syncInvokeHttp(request, CdmMeta.showAvailabilityZones);
    }

    /**
     * 查询所有可用区
     *
     * 查询CDM集群的所有可用区。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAvailabilityZonesRequest 请求对象
     * @return SyncInvoker<ShowAvailabilityZonesRequest, ShowAvailabilityZonesResponse>
     */
    public SyncInvoker<ShowAvailabilityZonesRequest, ShowAvailabilityZonesResponse> showAvailabilityZonesInvoker(
        ShowAvailabilityZonesRequest request) {
        return new SyncInvoker<>(request, CdmMeta.showAvailabilityZones, hcClient);
    }

    /**
     * 查询集群详情
     *
     * 查询集群详情接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowClusterDetailRequest 请求对象
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
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowClusterDetailRequest 请求对象
     * @return SyncInvoker<ShowClusterDetailRequest, ShowClusterDetailResponse>
     */
    public SyncInvoker<ShowClusterDetailRequest, ShowClusterDetailResponse> showClusterDetailInvoker(
        ShowClusterDetailRequest request) {
        return new SyncInvoker<>(request, CdmMeta.showClusterDetail, hcClient);
    }

    /**
     * 查询集群的企业项目ID
     *
     * 查询指定集群的企业项目ID。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowClusterEnterpriseProjectsRequest 请求对象
     * @return ShowClusterEnterpriseProjectsResponse
     */
    public ShowClusterEnterpriseProjectsResponse showClusterEnterpriseProjects(
        ShowClusterEnterpriseProjectsRequest request) {
        return hcClient.syncInvokeHttp(request, CdmMeta.showClusterEnterpriseProjects);
    }

    /**
     * 查询集群的企业项目ID
     *
     * 查询指定集群的企业项目ID。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowClusterEnterpriseProjectsRequest 请求对象
     * @return SyncInvoker<ShowClusterEnterpriseProjectsRequest, ShowClusterEnterpriseProjectsResponse>
     */
    public SyncInvoker<ShowClusterEnterpriseProjectsRequest, ShowClusterEnterpriseProjectsResponse> showClusterEnterpriseProjectsInvoker(
        ShowClusterEnterpriseProjectsRequest request) {
        return new SyncInvoker<>(request, CdmMeta.showClusterEnterpriseProjects, hcClient);
    }

    /**
     * 查询支持的版本
     *
     * 查询CDM集群支持的版本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDatastoresRequest 请求对象
     * @return ShowDatastoresResponse
     */
    public ShowDatastoresResponse showDatastores(ShowDatastoresRequest request) {
        return hcClient.syncInvokeHttp(request, CdmMeta.showDatastores);
    }

    /**
     * 查询支持的版本
     *
     * 查询CDM集群支持的版本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDatastoresRequest 请求对象
     * @return SyncInvoker<ShowDatastoresRequest, ShowDatastoresResponse>
     */
    public SyncInvoker<ShowDatastoresRequest, ShowDatastoresResponse> showDatastoresInvoker(
        ShowDatastoresRequest request) {
        return new SyncInvoker<>(request, CdmMeta.showDatastores, hcClient);
    }

    /**
     * 查询所有集群的企业项目ID
     *
     * 查询当前项目下的所有集群的企业项目ID。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowEnterpriseProjectsRequest 请求对象
     * @return ShowEnterpriseProjectsResponse
     */
    public ShowEnterpriseProjectsResponse showEnterpriseProjects(ShowEnterpriseProjectsRequest request) {
        return hcClient.syncInvokeHttp(request, CdmMeta.showEnterpriseProjects);
    }

    /**
     * 查询所有集群的企业项目ID
     *
     * 查询当前项目下的所有集群的企业项目ID。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowEnterpriseProjectsRequest 请求对象
     * @return SyncInvoker<ShowEnterpriseProjectsRequest, ShowEnterpriseProjectsResponse>
     */
    public SyncInvoker<ShowEnterpriseProjectsRequest, ShowEnterpriseProjectsResponse> showEnterpriseProjectsInvoker(
        ShowEnterpriseProjectsRequest request) {
        return new SyncInvoker<>(request, CdmMeta.showEnterpriseProjects, hcClient);
    }

    /**
     * 查询规格详情
     *
     * 查询指定规格ID的规格详请。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFlavorDetailRequest 请求对象
     * @return ShowFlavorDetailResponse
     */
    public ShowFlavorDetailResponse showFlavorDetail(ShowFlavorDetailRequest request) {
        return hcClient.syncInvokeHttp(request, CdmMeta.showFlavorDetail);
    }

    /**
     * 查询规格详情
     *
     * 查询指定规格ID的规格详请。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFlavorDetailRequest 请求对象
     * @return SyncInvoker<ShowFlavorDetailRequest, ShowFlavorDetailResponse>
     */
    public SyncInvoker<ShowFlavorDetailRequest, ShowFlavorDetailResponse> showFlavorDetailInvoker(
        ShowFlavorDetailRequest request) {
        return new SyncInvoker<>(request, CdmMeta.showFlavorDetail, hcClient);
    }

    /**
     * 查询版本规格
     *
     * 按版本ID查询所有兼容规格。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFlavorsRequest 请求对象
     * @return ShowFlavorsResponse
     */
    public ShowFlavorsResponse showFlavors(ShowFlavorsRequest request) {
        return hcClient.syncInvokeHttp(request, CdmMeta.showFlavors);
    }

    /**
     * 查询版本规格
     *
     * 按版本ID查询所有兼容规格。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFlavorsRequest 请求对象
     * @return SyncInvoker<ShowFlavorsRequest, ShowFlavorsResponse>
     */
    public SyncInvoker<ShowFlavorsRequest, ShowFlavorsResponse> showFlavorsInvoker(ShowFlavorsRequest request) {
        return new SyncInvoker<>(request, CdmMeta.showFlavors, hcClient);
    }

    /**
     * 查询集群实例信息
     *
     * 查询集群实例信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceDetailRequest 请求对象
     * @return ShowInstanceDetailResponse
     */
    public ShowInstanceDetailResponse showInstanceDetail(ShowInstanceDetailRequest request) {
        return hcClient.syncInvokeHttp(request, CdmMeta.showInstanceDetail);
    }

    /**
     * 查询集群实例信息
     *
     * 查询集群实例信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceDetailRequest 请求对象
     * @return SyncInvoker<ShowInstanceDetailRequest, ShowInstanceDetailResponse>
     */
    public SyncInvoker<ShowInstanceDetailRequest, ShowInstanceDetailResponse> showInstanceDetailInvoker(
        ShowInstanceDetailRequest request) {
        return new SyncInvoker<>(request, CdmMeta.showInstanceDetail, hcClient);
    }

    /**
     * 查询作业状态
     *
     * 查询作业状态接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowJobStatusRequest 请求对象
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
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowJobStatusRequest 请求对象
     * @return SyncInvoker<ShowJobStatusRequest, ShowJobStatusResponse>
     */
    public SyncInvoker<ShowJobStatusRequest, ShowJobStatusResponse> showJobStatusInvoker(ShowJobStatusRequest request) {
        return new SyncInvoker<>(request, CdmMeta.showJobStatus, hcClient);
    }

    /**
     * 查询作业
     *
     * 查询作业接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowJobsRequest 请求对象
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
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowJobsRequest 请求对象
     * @return SyncInvoker<ShowJobsRequest, ShowJobsResponse>
     */
    public SyncInvoker<ShowJobsRequest, ShowJobsResponse> showJobsInvoker(ShowJobsRequest request) {
        return new SyncInvoker<>(request, CdmMeta.showJobs, hcClient);
    }

    /**
     * 查询连接
     *
     * 查询连接接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowLinkRequest 请求对象
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
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowLinkRequest 请求对象
     * @return SyncInvoker<ShowLinkRequest, ShowLinkResponse>
     */
    public SyncInvoker<ShowLinkRequest, ShowLinkResponse> showLinkInvoker(ShowLinkRequest request) {
        return new SyncInvoker<>(request, CdmMeta.showLink, hcClient);
    }

    /**
     * 查询作业执行历史
     *
     * 查询作业执行历史接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSubmissionsRequest 请求对象
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
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSubmissionsRequest 请求对象
     * @return SyncInvoker<ShowSubmissionsRequest, ShowSubmissionsResponse>
     */
    public SyncInvoker<ShowSubmissionsRequest, ShowSubmissionsResponse> showSubmissionsInvoker(
        ShowSubmissionsRequest request) {
        return new SyncInvoker<>(request, CdmMeta.showSubmissions, hcClient);
    }

    /**
     * 启动集群
     *
     * 启动集群接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartClusterRequest 请求对象
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
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartClusterRequest 请求对象
     * @return SyncInvoker<StartClusterRequest, StartClusterResponse>
     */
    public SyncInvoker<StartClusterRequest, StartClusterResponse> startClusterInvoker(StartClusterRequest request) {
        return new SyncInvoker<>(request, CdmMeta.startCluster, hcClient);
    }

    /**
     * 启动作业
     *
     * 启动作业接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartJobRequest 请求对象
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
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartJobRequest 请求对象
     * @return SyncInvoker<StartJobRequest, StartJobResponse>
     */
    public SyncInvoker<StartJobRequest, StartJobResponse> startJobInvoker(StartJobRequest request) {
        return new SyncInvoker<>(request, CdmMeta.startJob, hcClient);
    }

    /**
     * 停止集群
     *
     * 停止集群接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopClusterRequest 请求对象
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
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopClusterRequest 请求对象
     * @return SyncInvoker<StopClusterRequest, StopClusterResponse>
     */
    public SyncInvoker<StopClusterRequest, StopClusterResponse> stopClusterInvoker(StopClusterRequest request) {
        return new SyncInvoker<>(request, CdmMeta.stopCluster, hcClient);
    }

    /**
     * 停止作业
     *
     * 停止作业接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopJobRequest 请求对象
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
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopJobRequest 请求对象
     * @return SyncInvoker<StopJobRequest, StopJobResponse>
     */
    public SyncInvoker<StopJobRequest, StopJobResponse> stopJobInvoker(StopJobRequest request) {
        return new SyncInvoker<>(request, CdmMeta.stopJob, hcClient);
    }

    /**
     * 修改作业
     *
     * 修改作业接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateJobRequest 请求对象
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
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateJobRequest 请求对象
     * @return SyncInvoker<UpdateJobRequest, UpdateJobResponse>
     */
    public SyncInvoker<UpdateJobRequest, UpdateJobResponse> updateJobInvoker(UpdateJobRequest request) {
        return new SyncInvoker<>(request, CdmMeta.updateJob, hcClient);
    }

    /**
     * 修改连接
     *
     * 修改连接接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateLinkRequest 请求对象
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
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateLinkRequest 请求对象
     * @return SyncInvoker<UpdateLinkRequest, UpdateLinkResponse>
     */
    public SyncInvoker<UpdateLinkRequest, UpdateLinkResponse> updateLinkInvoker(UpdateLinkRequest request) {
        return new SyncInvoker<>(request, CdmMeta.updateLink, hcClient);
    }

}
