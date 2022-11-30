package com.huaweicloud.sdk.mrs.v2;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.mrs.v2.model.*;

public class MrsAsyncClient {
    protected HcClient hcClient;

    public MrsAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<MrsAsyncClient> newBuilder() {
        return new ClientBuilder<>(MrsAsyncClient::new);
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
    public AsyncInvoker<BatchDeleteJobsRequest, BatchDeleteJobsResponse> batchDeleteJobsAsyncInvoker(BatchDeleteJobsRequest request) {
        return new AsyncInvoker<BatchDeleteJobsRequest, BatchDeleteJobsResponse>(request, MrsMeta.batchDeleteJobs, hcClient);
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
    public AsyncInvoker<CreateClusterRequest, CreateClusterResponse> createClusterAsyncInvoker(CreateClusterRequest request) {
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
    public AsyncInvoker<CreateExecuteJobRequest, CreateExecuteJobResponse> createExecuteJobAsyncInvoker(CreateExecuteJobRequest request) {
        return new AsyncInvoker<CreateExecuteJobRequest, CreateExecuteJobResponse>(request, MrsMeta.createExecuteJob, hcClient);
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
    public AsyncInvoker<ShowAgencyMappingRequest, ShowAgencyMappingResponse> showAgencyMappingAsyncInvoker(ShowAgencyMappingRequest request) {
        return new AsyncInvoker<ShowAgencyMappingRequest, ShowAgencyMappingResponse>(request, MrsMeta.showAgencyMapping, hcClient);
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
    public CompletableFuture<ShowAutoScalingPolicyResponse> showAutoScalingPolicyAsync(ShowAutoScalingPolicyRequest request) {
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
    public AsyncInvoker<ShowAutoScalingPolicyRequest, ShowAutoScalingPolicyResponse> showAutoScalingPolicyAsyncInvoker(ShowAutoScalingPolicyRequest request) {
        return new AsyncInvoker<ShowAutoScalingPolicyRequest, ShowAutoScalingPolicyResponse>(request, MrsMeta.showAutoScalingPolicy, hcClient);
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
    public AsyncInvoker<ShowJobExeListNewRequest, ShowJobExeListNewResponse> showJobExeListNewAsyncInvoker(ShowJobExeListNewRequest request) {
        return new AsyncInvoker<ShowJobExeListNewRequest, ShowJobExeListNewResponse>(request, MrsMeta.showJobExeListNew, hcClient);
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
    public AsyncInvoker<ShowSingleJobExeRequest, ShowSingleJobExeResponse> showSingleJobExeAsyncInvoker(ShowSingleJobExeRequest request) {
        return new AsyncInvoker<ShowSingleJobExeRequest, ShowSingleJobExeResponse>(request, MrsMeta.showSingleJobExe, hcClient);
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
    public CompletableFuture<ShowSqlResultWithJobResponse> showSqlResultWithJobAsync(ShowSqlResultWithJobRequest request) {
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
    public AsyncInvoker<ShowSqlResultWithJobRequest, ShowSqlResultWithJobResponse> showSqlResultWithJobAsyncInvoker(ShowSqlResultWithJobRequest request) {
        return new AsyncInvoker<ShowSqlResultWithJobRequest, ShowSqlResultWithJobResponse>(request, MrsMeta.showSqlResultWithJob, hcClient);
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
    public AsyncInvoker<UpdateAgencyMappingRequest, UpdateAgencyMappingResponse> updateAgencyMappingAsyncInvoker(UpdateAgencyMappingRequest request) {
        return new AsyncInvoker<UpdateAgencyMappingRequest, UpdateAgencyMappingResponse>(request, MrsMeta.updateAgencyMapping, hcClient);
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
    public AsyncInvoker<UpdateClusterNameRequest, UpdateClusterNameResponse> updateClusterNameAsyncInvoker(UpdateClusterNameRequest request) {
        return new AsyncInvoker<UpdateClusterNameRequest, UpdateClusterNameResponse>(request, MrsMeta.updateClusterName, hcClient);
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
    public AsyncInvoker<ShowHdfsFileListRequest, ShowHdfsFileListResponse> showHdfsFileListAsyncInvoker(ShowHdfsFileListRequest request) {
        return new AsyncInvoker<ShowHdfsFileListRequest, ShowHdfsFileListResponse>(request, MrsMeta.showHdfsFileList, hcClient);
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
    public AsyncInvoker<ShowSqlResultRequest, ShowSqlResultResponse> showSqlResultAsyncInvoker(ShowSqlResultRequest request) {
        return new AsyncInvoker<ShowSqlResultRequest, ShowSqlResultResponse>(request, MrsMeta.showSqlResult, hcClient);
    }

}