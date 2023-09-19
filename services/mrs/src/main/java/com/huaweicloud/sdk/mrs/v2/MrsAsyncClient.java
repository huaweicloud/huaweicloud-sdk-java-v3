package com.huaweicloud.sdk.mrs.v2;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.mrs.v2.model.BatchDeleteJobsRequest;
import com.huaweicloud.sdk.mrs.v2.model.BatchDeleteJobsResponse;
import com.huaweicloud.sdk.mrs.v2.model.CancelSqlRequest;
import com.huaweicloud.sdk.mrs.v2.model.CancelSqlResponse;
import com.huaweicloud.sdk.mrs.v2.model.CreateClusterRequest;
import com.huaweicloud.sdk.mrs.v2.model.CreateClusterResponse;
import com.huaweicloud.sdk.mrs.v2.model.CreateDataConnectorRequest;
import com.huaweicloud.sdk.mrs.v2.model.CreateDataConnectorResponse;
import com.huaweicloud.sdk.mrs.v2.model.CreateExecuteJobRequest;
import com.huaweicloud.sdk.mrs.v2.model.CreateExecuteJobResponse;
import com.huaweicloud.sdk.mrs.v2.model.DeleteDataConnectorRequest;
import com.huaweicloud.sdk.mrs.v2.model.DeleteDataConnectorResponse;
import com.huaweicloud.sdk.mrs.v2.model.ExecuteSqlRequest;
import com.huaweicloud.sdk.mrs.v2.model.ExecuteSqlResponse;
import com.huaweicloud.sdk.mrs.v2.model.ExpandClusterRequest;
import com.huaweicloud.sdk.mrs.v2.model.ExpandClusterResponse;
import com.huaweicloud.sdk.mrs.v2.model.ListDataConnectorRequest;
import com.huaweicloud.sdk.mrs.v2.model.ListDataConnectorResponse;
import com.huaweicloud.sdk.mrs.v2.model.RunJobFlowRequest;
import com.huaweicloud.sdk.mrs.v2.model.RunJobFlowResponse;
import com.huaweicloud.sdk.mrs.v2.model.ShowAgencyMappingRequest;
import com.huaweicloud.sdk.mrs.v2.model.ShowAgencyMappingResponse;
import com.huaweicloud.sdk.mrs.v2.model.ShowAutoScalingPolicyRequest;
import com.huaweicloud.sdk.mrs.v2.model.ShowAutoScalingPolicyResponse;
import com.huaweicloud.sdk.mrs.v2.model.ShowHdfsFileListRequest;
import com.huaweicloud.sdk.mrs.v2.model.ShowHdfsFileListResponse;
import com.huaweicloud.sdk.mrs.v2.model.ShowJobExeListNewRequest;
import com.huaweicloud.sdk.mrs.v2.model.ShowJobExeListNewResponse;
import com.huaweicloud.sdk.mrs.v2.model.ShowMrsVersionListRequest;
import com.huaweicloud.sdk.mrs.v2.model.ShowMrsVersionListResponse;
import com.huaweicloud.sdk.mrs.v2.model.ShowSingleJobExeRequest;
import com.huaweicloud.sdk.mrs.v2.model.ShowSingleJobExeResponse;
import com.huaweicloud.sdk.mrs.v2.model.ShowSqlResultRequest;
import com.huaweicloud.sdk.mrs.v2.model.ShowSqlResultResponse;
import com.huaweicloud.sdk.mrs.v2.model.ShowSqlResultWithJobRequest;
import com.huaweicloud.sdk.mrs.v2.model.ShowSqlResultWithJobResponse;
import com.huaweicloud.sdk.mrs.v2.model.ShrinkClusterRequest;
import com.huaweicloud.sdk.mrs.v2.model.ShrinkClusterResponse;
import com.huaweicloud.sdk.mrs.v2.model.StopJobRequest;
import com.huaweicloud.sdk.mrs.v2.model.StopJobResponse;
import com.huaweicloud.sdk.mrs.v2.model.UpdateAgencyMappingRequest;
import com.huaweicloud.sdk.mrs.v2.model.UpdateAgencyMappingResponse;
import com.huaweicloud.sdk.mrs.v2.model.UpdateClusterNameRequest;
import com.huaweicloud.sdk.mrs.v2.model.UpdateClusterNameResponse;
import com.huaweicloud.sdk.mrs.v2.model.UpdateDataConnectorRequest;
import com.huaweicloud.sdk.mrs.v2.model.UpdateDataConnectorResponse;

import java.util.concurrent.CompletableFuture;

public class MrsAsyncClient {

    protected HcClient hcClient;

    public MrsAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<MrsAsyncClient> newBuilder() {
        ClientBuilder<MrsAsyncClient> clientBuilder = new ClientBuilder<>(MrsAsyncClient::new);
        return clientBuilder;
    }

    /**
     * 批量删除作业
     *
     * 在MRS集群中批量删除作业。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchDeleteJobsRequest 请求对象
     * @return CompletableFuture<BatchDeleteJobsResponse>
     */
    public CompletableFuture<BatchDeleteJobsResponse> batchDeleteJobsAsync(BatchDeleteJobsRequest request) {
        return hcClient.asyncInvokeHttp(request, MrsMeta.batchDeleteJobs);
    }

    /**
     * 批量删除作业
     *
     * 在MRS集群中批量删除作业。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchDeleteJobsRequest 请求对象
     * @return AsyncInvoker<BatchDeleteJobsRequest, BatchDeleteJobsResponse>
     */
    public AsyncInvoker<BatchDeleteJobsRequest, BatchDeleteJobsResponse> batchDeleteJobsAsyncInvoker(
        BatchDeleteJobsRequest request) {
        return new AsyncInvoker<BatchDeleteJobsRequest, BatchDeleteJobsResponse>(request, MrsMeta.batchDeleteJobs,
            hcClient);
    }

    /**
     * 创建集群
     *
     * 创建一个MRS集群。使用接口前，您需要先获取下的资源信息。
     * - 通过VPC创建或查询VPC、子网
     * - 通过ECS创建或查询密钥对
     * - 通过[终端节点](https://support.huaweicloud.com/api-mrs/mrs_02_0003.html)获取区域信息
     * - 参考[MRS服务支持的组件](https://support.huaweicloud.com/api-mrs/mrs_02_9001.html)获取MRS版本及对应版本支持的组件信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateClusterRequest 请求对象
     * @return CompletableFuture<CreateClusterResponse>
     */
    public CompletableFuture<CreateClusterResponse> createClusterAsync(CreateClusterRequest request) {
        return hcClient.asyncInvokeHttp(request, MrsMeta.createCluster);
    }

    /**
     * 创建集群
     *
     * 创建一个MRS集群。使用接口前，您需要先获取下的资源信息。
     * - 通过VPC创建或查询VPC、子网
     * - 通过ECS创建或查询密钥对
     * - 通过[终端节点](https://support.huaweicloud.com/api-mrs/mrs_02_0003.html)获取区域信息
     * - 参考[MRS服务支持的组件](https://support.huaweicloud.com/api-mrs/mrs_02_9001.html)获取MRS版本及对应版本支持的组件信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateClusterRequest 请求对象
     * @return AsyncInvoker<CreateClusterRequest, CreateClusterResponse>
     */
    public AsyncInvoker<CreateClusterRequest, CreateClusterResponse> createClusterAsyncInvoker(
        CreateClusterRequest request) {
        return new AsyncInvoker<CreateClusterRequest, CreateClusterResponse>(request, MrsMeta.createCluster, hcClient);
    }

    /**
     * 新增并执行作业
     *
     * 在MRS集群中新增并提交一个作业。
     * 
     * 需要先在集群详情页的“概览”页签，单击“IAM用户同步”右侧的“同步”进行IAM用户同步，然后再通过该接口提交作业。
     * 
     * 如需使用OBS加密功能，请先参考“MRS用户指南 &gt; 管理现有集群 &gt; 作业管理 &gt; 使用OBS加密数据运行作业”页面进行相关配置后，再调用API接口运行作业。
     * 
     * 所有示例中涉及的OBS路径、样例文件及终端节点和AKSK，请提前准备并在提交请求时根据实际情况替换。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateExecuteJobRequest 请求对象
     * @return CompletableFuture<CreateExecuteJobResponse>
     */
    public CompletableFuture<CreateExecuteJobResponse> createExecuteJobAsync(CreateExecuteJobRequest request) {
        return hcClient.asyncInvokeHttp(request, MrsMeta.createExecuteJob);
    }

    /**
     * 新增并执行作业
     *
     * 在MRS集群中新增并提交一个作业。
     * 
     * 需要先在集群详情页的“概览”页签，单击“IAM用户同步”右侧的“同步”进行IAM用户同步，然后再通过该接口提交作业。
     * 
     * 如需使用OBS加密功能，请先参考“MRS用户指南 &gt; 管理现有集群 &gt; 作业管理 &gt; 使用OBS加密数据运行作业”页面进行相关配置后，再调用API接口运行作业。
     * 
     * 所有示例中涉及的OBS路径、样例文件及终端节点和AKSK，请提前准备并在提交请求时根据实际情况替换。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateExecuteJobRequest 请求对象
     * @return AsyncInvoker<CreateExecuteJobRequest, CreateExecuteJobResponse>
     */
    public AsyncInvoker<CreateExecuteJobRequest, CreateExecuteJobResponse> createExecuteJobAsyncInvoker(
        CreateExecuteJobRequest request) {
        return new AsyncInvoker<CreateExecuteJobRequest, CreateExecuteJobResponse>(request, MrsMeta.createExecuteJob,
            hcClient);
    }

    /**
     * 创建集群并提交作业
     *
     * 创建一个MRS集群并提交作业，并支持作业完成后删除集群，支持MRS 1.8.9及以上集群版本使用。使用接口前，您需要先获取下的资源信息。
     * - 通过VPC创建或查询VPC、子网
     * - 通过ECS创建或查询密钥对
     * - 通过[终端节点](https://support.huaweicloud.com/api-mrs/mrs_02_0003.html)获取区域信息
     * - 参考[MRS服务支持的组件](https://support.huaweicloud.com/api-mrs/mrs_02_9001.html)获取MRS版本及对应版本支持的组件信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RunJobFlowRequest 请求对象
     * @return CompletableFuture<RunJobFlowResponse>
     */
    public CompletableFuture<RunJobFlowResponse> runJobFlowAsync(RunJobFlowRequest request) {
        return hcClient.asyncInvokeHttp(request, MrsMeta.runJobFlow);
    }

    /**
     * 创建集群并提交作业
     *
     * 创建一个MRS集群并提交作业，并支持作业完成后删除集群，支持MRS 1.8.9及以上集群版本使用。使用接口前，您需要先获取下的资源信息。
     * - 通过VPC创建或查询VPC、子网
     * - 通过ECS创建或查询密钥对
     * - 通过[终端节点](https://support.huaweicloud.com/api-mrs/mrs_02_0003.html)获取区域信息
     * - 参考[MRS服务支持的组件](https://support.huaweicloud.com/api-mrs/mrs_02_9001.html)获取MRS版本及对应版本支持的组件信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RunJobFlowRequest 请求对象
     * @return AsyncInvoker<RunJobFlowRequest, RunJobFlowResponse>
     */
    public AsyncInvoker<RunJobFlowRequest, RunJobFlowResponse> runJobFlowAsyncInvoker(RunJobFlowRequest request) {
        return new AsyncInvoker<RunJobFlowRequest, RunJobFlowResponse>(request, MrsMeta.runJobFlow, hcClient);
    }

    /**
     * 查询用户（组）与IAM委托的映射关系
     *
     * 获取用户（组）与IAM委托之间的映射关系的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAgencyMappingRequest 请求对象
     * @return CompletableFuture<ShowAgencyMappingResponse>
     */
    public CompletableFuture<ShowAgencyMappingResponse> showAgencyMappingAsync(ShowAgencyMappingRequest request) {
        return hcClient.asyncInvokeHttp(request, MrsMeta.showAgencyMapping);
    }

    /**
     * 查询用户（组）与IAM委托的映射关系
     *
     * 获取用户（组）与IAM委托之间的映射关系的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAgencyMappingRequest 请求对象
     * @return AsyncInvoker<ShowAgencyMappingRequest, ShowAgencyMappingResponse>
     */
    public AsyncInvoker<ShowAgencyMappingRequest, ShowAgencyMappingResponse> showAgencyMappingAsyncInvoker(
        ShowAgencyMappingRequest request) {
        return new AsyncInvoker<ShowAgencyMappingRequest, ShowAgencyMappingResponse>(request, MrsMeta.showAgencyMapping,
            hcClient);
    }

    /**
     * 查看弹性伸缩策略
     *
     * 查看指定集群的所有的弹性伸缩策略信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAutoScalingPolicyRequest 请求对象
     * @return CompletableFuture<ShowAutoScalingPolicyResponse>
     */
    public CompletableFuture<ShowAutoScalingPolicyResponse> showAutoScalingPolicyAsync(
        ShowAutoScalingPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, MrsMeta.showAutoScalingPolicy);
    }

    /**
     * 查看弹性伸缩策略
     *
     * 查看指定集群的所有的弹性伸缩策略信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAutoScalingPolicyRequest 请求对象
     * @return AsyncInvoker<ShowAutoScalingPolicyRequest, ShowAutoScalingPolicyResponse>
     */
    public AsyncInvoker<ShowAutoScalingPolicyRequest, ShowAutoScalingPolicyResponse> showAutoScalingPolicyAsyncInvoker(
        ShowAutoScalingPolicyRequest request) {
        return new AsyncInvoker<ShowAutoScalingPolicyRequest, ShowAutoScalingPolicyResponse>(request,
            MrsMeta.showAutoScalingPolicy, hcClient);
    }

    /**
     * 查询作业列表信息
     *
     * 在MRS指定集群中查询作业列表信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowJobExeListNewRequest 请求对象
     * @return CompletableFuture<ShowJobExeListNewResponse>
     */
    public CompletableFuture<ShowJobExeListNewResponse> showJobExeListNewAsync(ShowJobExeListNewRequest request) {
        return hcClient.asyncInvokeHttp(request, MrsMeta.showJobExeListNew);
    }

    /**
     * 查询作业列表信息
     *
     * 在MRS指定集群中查询作业列表信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowJobExeListNewRequest 请求对象
     * @return AsyncInvoker<ShowJobExeListNewRequest, ShowJobExeListNewResponse>
     */
    public AsyncInvoker<ShowJobExeListNewRequest, ShowJobExeListNewResponse> showJobExeListNewAsyncInvoker(
        ShowJobExeListNewRequest request) {
        return new AsyncInvoker<ShowJobExeListNewRequest, ShowJobExeListNewResponse>(request, MrsMeta.showJobExeListNew,
            hcClient);
    }

    /**
     * 查询单个作业信息
     *
     * 在MRS集群中查询指定作业的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowSingleJobExeRequest 请求对象
     * @return CompletableFuture<ShowSingleJobExeResponse>
     */
    public CompletableFuture<ShowSingleJobExeResponse> showSingleJobExeAsync(ShowSingleJobExeRequest request) {
        return hcClient.asyncInvokeHttp(request, MrsMeta.showSingleJobExe);
    }

    /**
     * 查询单个作业信息
     *
     * 在MRS集群中查询指定作业的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowSingleJobExeRequest 请求对象
     * @return AsyncInvoker<ShowSingleJobExeRequest, ShowSingleJobExeResponse>
     */
    public AsyncInvoker<ShowSingleJobExeRequest, ShowSingleJobExeResponse> showSingleJobExeAsyncInvoker(
        ShowSingleJobExeRequest request) {
        return new AsyncInvoker<ShowSingleJobExeRequest, ShowSingleJobExeResponse>(request, MrsMeta.showSingleJobExe,
            hcClient);
    }

    /**
     * 获取SQL结果
     *
     * 在MRS集群中查询SparkSql和SparkScript两种类型作业的SQL语句运行完成后返回的查询结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowSqlResultWithJobRequest 请求对象
     * @return CompletableFuture<ShowSqlResultWithJobResponse>
     */
    public CompletableFuture<ShowSqlResultWithJobResponse> showSqlResultWithJobAsync(
        ShowSqlResultWithJobRequest request) {
        return hcClient.asyncInvokeHttp(request, MrsMeta.showSqlResultWithJob);
    }

    /**
     * 获取SQL结果
     *
     * 在MRS集群中查询SparkSql和SparkScript两种类型作业的SQL语句运行完成后返回的查询结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowSqlResultWithJobRequest 请求对象
     * @return AsyncInvoker<ShowSqlResultWithJobRequest, ShowSqlResultWithJobResponse>
     */
    public AsyncInvoker<ShowSqlResultWithJobRequest, ShowSqlResultWithJobResponse> showSqlResultWithJobAsyncInvoker(
        ShowSqlResultWithJobRequest request) {
        return new AsyncInvoker<ShowSqlResultWithJobRequest, ShowSqlResultWithJobResponse>(request,
            MrsMeta.showSqlResultWithJob, hcClient);
    }

    /**
     * 终止作业
     *
     * 在MRS集群中终止指定作业。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StopJobRequest 请求对象
     * @return CompletableFuture<StopJobResponse>
     */
    public CompletableFuture<StopJobResponse> stopJobAsync(StopJobRequest request) {
        return hcClient.asyncInvokeHttp(request, MrsMeta.stopJob);
    }

    /**
     * 终止作业
     *
     * 在MRS集群中终止指定作业。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StopJobRequest 请求对象
     * @return AsyncInvoker<StopJobRequest, StopJobResponse>
     */
    public AsyncInvoker<StopJobRequest, StopJobResponse> stopJobAsyncInvoker(StopJobRequest request) {
        return new AsyncInvoker<StopJobRequest, StopJobResponse>(request, MrsMeta.stopJob, hcClient);
    }

    /**
     * 更新用户（组）与IAM委托的映射关系
     *
     * 更新用户（组）与IAM委托之间的映射关系。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateAgencyMappingRequest 请求对象
     * @return CompletableFuture<UpdateAgencyMappingResponse>
     */
    public CompletableFuture<UpdateAgencyMappingResponse> updateAgencyMappingAsync(UpdateAgencyMappingRequest request) {
        return hcClient.asyncInvokeHttp(request, MrsMeta.updateAgencyMapping);
    }

    /**
     * 更新用户（组）与IAM委托的映射关系
     *
     * 更新用户（组）与IAM委托之间的映射关系。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateAgencyMappingRequest 请求对象
     * @return AsyncInvoker<UpdateAgencyMappingRequest, UpdateAgencyMappingResponse>
     */
    public AsyncInvoker<UpdateAgencyMappingRequest, UpdateAgencyMappingResponse> updateAgencyMappingAsyncInvoker(
        UpdateAgencyMappingRequest request) {
        return new AsyncInvoker<UpdateAgencyMappingRequest, UpdateAgencyMappingResponse>(request,
            MrsMeta.updateAgencyMapping, hcClient);
    }

    /**
     * 修改集群名称
     *
     * 修改集群名称
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateClusterNameRequest 请求对象
     * @return CompletableFuture<UpdateClusterNameResponse>
     */
    public CompletableFuture<UpdateClusterNameResponse> updateClusterNameAsync(UpdateClusterNameRequest request) {
        return hcClient.asyncInvokeHttp(request, MrsMeta.updateClusterName);
    }

    /**
     * 修改集群名称
     *
     * 修改集群名称
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateClusterNameRequest 请求对象
     * @return AsyncInvoker<UpdateClusterNameRequest, UpdateClusterNameResponse>
     */
    public AsyncInvoker<UpdateClusterNameRequest, UpdateClusterNameResponse> updateClusterNameAsyncInvoker(
        UpdateClusterNameRequest request) {
        return new AsyncInvoker<UpdateClusterNameRequest, UpdateClusterNameResponse>(request, MrsMeta.updateClusterName,
            hcClient);
    }

    /**
     * 扩容集群
     *
     * 对MRS集群进行扩容。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ExpandClusterRequest 请求对象
     * @return CompletableFuture<ExpandClusterResponse>
     */
    public CompletableFuture<ExpandClusterResponse> expandClusterAsync(ExpandClusterRequest request) {
        return hcClient.asyncInvokeHttp(request, MrsMeta.expandCluster);
    }

    /**
     * 扩容集群
     *
     * 对MRS集群进行扩容。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ExpandClusterRequest 请求对象
     * @return AsyncInvoker<ExpandClusterRequest, ExpandClusterResponse>
     */
    public AsyncInvoker<ExpandClusterRequest, ExpandClusterResponse> expandClusterAsyncInvoker(
        ExpandClusterRequest request) {
        return new AsyncInvoker<ExpandClusterRequest, ExpandClusterResponse>(request, MrsMeta.expandCluster, hcClient);
    }

    /**
     * 缩容集群
     *
     * 对MRS集群进行缩容。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShrinkClusterRequest 请求对象
     * @return CompletableFuture<ShrinkClusterResponse>
     */
    public CompletableFuture<ShrinkClusterResponse> shrinkClusterAsync(ShrinkClusterRequest request) {
        return hcClient.asyncInvokeHttp(request, MrsMeta.shrinkCluster);
    }

    /**
     * 缩容集群
     *
     * 对MRS集群进行缩容。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShrinkClusterRequest 请求对象
     * @return AsyncInvoker<ShrinkClusterRequest, ShrinkClusterResponse>
     */
    public AsyncInvoker<ShrinkClusterRequest, ShrinkClusterResponse> shrinkClusterAsyncInvoker(
        ShrinkClusterRequest request) {
        return new AsyncInvoker<ShrinkClusterRequest, ShrinkClusterResponse>(request, MrsMeta.shrinkCluster, hcClient);
    }

    /**
     * 创建数据连接
     *
     * 创建数据连接
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateDataConnectorRequest 请求对象
     * @return CompletableFuture<CreateDataConnectorResponse>
     */
    public CompletableFuture<CreateDataConnectorResponse> createDataConnectorAsync(CreateDataConnectorRequest request) {
        return hcClient.asyncInvokeHttp(request, MrsMeta.createDataConnector);
    }

    /**
     * 创建数据连接
     *
     * 创建数据连接
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateDataConnectorRequest 请求对象
     * @return AsyncInvoker<CreateDataConnectorRequest, CreateDataConnectorResponse>
     */
    public AsyncInvoker<CreateDataConnectorRequest, CreateDataConnectorResponse> createDataConnectorAsyncInvoker(
        CreateDataConnectorRequest request) {
        return new AsyncInvoker<CreateDataConnectorRequest, CreateDataConnectorResponse>(request,
            MrsMeta.createDataConnector, hcClient);
    }

    /**
     * 删除数据连接
     *
     * 删除数据连接
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteDataConnectorRequest 请求对象
     * @return CompletableFuture<DeleteDataConnectorResponse>
     */
    public CompletableFuture<DeleteDataConnectorResponse> deleteDataConnectorAsync(DeleteDataConnectorRequest request) {
        return hcClient.asyncInvokeHttp(request, MrsMeta.deleteDataConnector);
    }

    /**
     * 删除数据连接
     *
     * 删除数据连接
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteDataConnectorRequest 请求对象
     * @return AsyncInvoker<DeleteDataConnectorRequest, DeleteDataConnectorResponse>
     */
    public AsyncInvoker<DeleteDataConnectorRequest, DeleteDataConnectorResponse> deleteDataConnectorAsyncInvoker(
        DeleteDataConnectorRequest request) {
        return new AsyncInvoker<DeleteDataConnectorRequest, DeleteDataConnectorResponse>(request,
            MrsMeta.deleteDataConnector, hcClient);
    }

    /**
     * 查询数据连接列表
     *
     * 查询数据连接列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDataConnectorRequest 请求对象
     * @return CompletableFuture<ListDataConnectorResponse>
     */
    public CompletableFuture<ListDataConnectorResponse> listDataConnectorAsync(ListDataConnectorRequest request) {
        return hcClient.asyncInvokeHttp(request, MrsMeta.listDataConnector);
    }

    /**
     * 查询数据连接列表
     *
     * 查询数据连接列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDataConnectorRequest 请求对象
     * @return AsyncInvoker<ListDataConnectorRequest, ListDataConnectorResponse>
     */
    public AsyncInvoker<ListDataConnectorRequest, ListDataConnectorResponse> listDataConnectorAsyncInvoker(
        ListDataConnectorRequest request) {
        return new AsyncInvoker<ListDataConnectorRequest, ListDataConnectorResponse>(request, MrsMeta.listDataConnector,
            hcClient);
    }

    /**
     * 更新数据连接
     *
     * 更新数据连接
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateDataConnectorRequest 请求对象
     * @return CompletableFuture<UpdateDataConnectorResponse>
     */
    public CompletableFuture<UpdateDataConnectorResponse> updateDataConnectorAsync(UpdateDataConnectorRequest request) {
        return hcClient.asyncInvokeHttp(request, MrsMeta.updateDataConnector);
    }

    /**
     * 更新数据连接
     *
     * 更新数据连接
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateDataConnectorRequest 请求对象
     * @return AsyncInvoker<UpdateDataConnectorRequest, UpdateDataConnectorResponse>
     */
    public AsyncInvoker<UpdateDataConnectorRequest, UpdateDataConnectorResponse> updateDataConnectorAsyncInvoker(
        UpdateDataConnectorRequest request) {
        return new AsyncInvoker<UpdateDataConnectorRequest, UpdateDataConnectorResponse>(request,
            MrsMeta.updateDataConnector, hcClient);
    }

    /**
     * 获取指定目录文件列表
     *
     * 在MRS集群中获取指定目录文件列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowHdfsFileListRequest 请求对象
     * @return CompletableFuture<ShowHdfsFileListResponse>
     */
    public CompletableFuture<ShowHdfsFileListResponse> showHdfsFileListAsync(ShowHdfsFileListRequest request) {
        return hcClient.asyncInvokeHttp(request, MrsMeta.showHdfsFileList);
    }

    /**
     * 获取指定目录文件列表
     *
     * 在MRS集群中获取指定目录文件列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowHdfsFileListRequest 请求对象
     * @return AsyncInvoker<ShowHdfsFileListRequest, ShowHdfsFileListResponse>
     */
    public AsyncInvoker<ShowHdfsFileListRequest, ShowHdfsFileListResponse> showHdfsFileListAsyncInvoker(
        ShowHdfsFileListRequest request) {
        return new AsyncInvoker<ShowHdfsFileListRequest, ShowHdfsFileListResponse>(request, MrsMeta.showHdfsFileList,
            hcClient);
    }

    /**
     * 取消SQL执行任务
     *
     * 在MRS集群中取消一条SQL的执行任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CancelSqlRequest 请求对象
     * @return CompletableFuture<CancelSqlResponse>
     */
    public CompletableFuture<CancelSqlResponse> cancelSqlAsync(CancelSqlRequest request) {
        return hcClient.asyncInvokeHttp(request, MrsMeta.cancelSql);
    }

    /**
     * 取消SQL执行任务
     *
     * 在MRS集群中取消一条SQL的执行任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CancelSqlRequest 请求对象
     * @return AsyncInvoker<CancelSqlRequest, CancelSqlResponse>
     */
    public AsyncInvoker<CancelSqlRequest, CancelSqlResponse> cancelSqlAsyncInvoker(CancelSqlRequest request) {
        return new AsyncInvoker<CancelSqlRequest, CancelSqlResponse>(request, MrsMeta.cancelSql, hcClient);
    }

    /**
     * 提交SQL语句
     *
     * 在MRS集群中提交并执行一条SQL语句。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ExecuteSqlRequest 请求对象
     * @return CompletableFuture<ExecuteSqlResponse>
     */
    public CompletableFuture<ExecuteSqlResponse> executeSqlAsync(ExecuteSqlRequest request) {
        return hcClient.asyncInvokeHttp(request, MrsMeta.executeSql);
    }

    /**
     * 提交SQL语句
     *
     * 在MRS集群中提交并执行一条SQL语句。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ExecuteSqlRequest 请求对象
     * @return AsyncInvoker<ExecuteSqlRequest, ExecuteSqlResponse>
     */
    public AsyncInvoker<ExecuteSqlRequest, ExecuteSqlResponse> executeSqlAsyncInvoker(ExecuteSqlRequest request) {
        return new AsyncInvoker<ExecuteSqlRequest, ExecuteSqlResponse>(request, MrsMeta.executeSql, hcClient);
    }

    /**
     * 查询SQL结果
     *
     * 在MRS集群中查询一条SQL的执行结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowSqlResultRequest 请求对象
     * @return CompletableFuture<ShowSqlResultResponse>
     */
    public CompletableFuture<ShowSqlResultResponse> showSqlResultAsync(ShowSqlResultRequest request) {
        return hcClient.asyncInvokeHttp(request, MrsMeta.showSqlResult);
    }

    /**
     * 查询SQL结果
     *
     * 在MRS集群中查询一条SQL的执行结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowSqlResultRequest 请求对象
     * @return AsyncInvoker<ShowSqlResultRequest, ShowSqlResultResponse>
     */
    public AsyncInvoker<ShowSqlResultRequest, ShowSqlResultResponse> showSqlResultAsyncInvoker(
        ShowSqlResultRequest request) {
        return new AsyncInvoker<ShowSqlResultRequest, ShowSqlResultResponse>(request, MrsMeta.showSqlResult, hcClient);
    }

    /**
     * 展示MRS版本列表
     *
     * 展示MRS版本列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowMrsVersionListRequest 请求对象
     * @return CompletableFuture<ShowMrsVersionListResponse>
     */
    public CompletableFuture<ShowMrsVersionListResponse> showMrsVersionListAsync(ShowMrsVersionListRequest request) {
        return hcClient.asyncInvokeHttp(request, MrsMeta.showMrsVersionList);
    }

    /**
     * 展示MRS版本列表
     *
     * 展示MRS版本列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowMrsVersionListRequest 请求对象
     * @return AsyncInvoker<ShowMrsVersionListRequest, ShowMrsVersionListResponse>
     */
    public AsyncInvoker<ShowMrsVersionListRequest, ShowMrsVersionListResponse> showMrsVersionListAsyncInvoker(
        ShowMrsVersionListRequest request) {
        return new AsyncInvoker<ShowMrsVersionListRequest, ShowMrsVersionListResponse>(request,
            MrsMeta.showMrsVersionList, hcClient);
    }

}
