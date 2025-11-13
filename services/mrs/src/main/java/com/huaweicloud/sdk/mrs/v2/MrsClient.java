package com.huaweicloud.sdk.mrs.v2;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.mrs.v2.model.AddComponentRequest;
import com.huaweicloud.sdk.mrs.v2.model.AddComponentResponse;
import com.huaweicloud.sdk.mrs.v2.model.BatchDeleteJobsRequest;
import com.huaweicloud.sdk.mrs.v2.model.BatchDeleteJobsResponse;
import com.huaweicloud.sdk.mrs.v2.model.CancelSqlRequest;
import com.huaweicloud.sdk.mrs.v2.model.CancelSqlResponse;
import com.huaweicloud.sdk.mrs.v2.model.CancelSyncIamUserRequest;
import com.huaweicloud.sdk.mrs.v2.model.CancelSyncIamUserResponse;
import com.huaweicloud.sdk.mrs.v2.model.CreateAutoScalingPolicyRequest;
import com.huaweicloud.sdk.mrs.v2.model.CreateAutoScalingPolicyResponse;
import com.huaweicloud.sdk.mrs.v2.model.CreateClusterRequest;
import com.huaweicloud.sdk.mrs.v2.model.CreateClusterResponse;
import com.huaweicloud.sdk.mrs.v2.model.CreateDataConnectorRequest;
import com.huaweicloud.sdk.mrs.v2.model.CreateDataConnectorResponse;
import com.huaweicloud.sdk.mrs.v2.model.CreateExecuteJobRequest;
import com.huaweicloud.sdk.mrs.v2.model.CreateExecuteJobResponse;
import com.huaweicloud.sdk.mrs.v2.model.DeleteAutoScalingPolicyRequest;
import com.huaweicloud.sdk.mrs.v2.model.DeleteAutoScalingPolicyResponse;
import com.huaweicloud.sdk.mrs.v2.model.DeleteDataConnectorRequest;
import com.huaweicloud.sdk.mrs.v2.model.DeleteDataConnectorResponse;
import com.huaweicloud.sdk.mrs.v2.model.ExecuteSqlRequest;
import com.huaweicloud.sdk.mrs.v2.model.ExecuteSqlResponse;
import com.huaweicloud.sdk.mrs.v2.model.ExpandClusterRequest;
import com.huaweicloud.sdk.mrs.v2.model.ExpandClusterResponse;
import com.huaweicloud.sdk.mrs.v2.model.ListDataConnectorRequest;
import com.huaweicloud.sdk.mrs.v2.model.ListDataConnectorResponse;
import com.huaweicloud.sdk.mrs.v2.model.ListNodesRequest;
import com.huaweicloud.sdk.mrs.v2.model.ListNodesResponse;
import com.huaweicloud.sdk.mrs.v2.model.ListSecurityRuleStatusRequest;
import com.huaweicloud.sdk.mrs.v2.model.ListSecurityRuleStatusResponse;
import com.huaweicloud.sdk.mrs.v2.model.ListSyncRequirementsRequest;
import com.huaweicloud.sdk.mrs.v2.model.ListSyncRequirementsResponse;
import com.huaweicloud.sdk.mrs.v2.model.ListSyncStatusRequest;
import com.huaweicloud.sdk.mrs.v2.model.ListSyncStatusResponse;
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
import com.huaweicloud.sdk.mrs.v2.model.ShowMrsFlavorsRequest;
import com.huaweicloud.sdk.mrs.v2.model.ShowMrsFlavorsResponse;
import com.huaweicloud.sdk.mrs.v2.model.ShowMrsVersionListRequest;
import com.huaweicloud.sdk.mrs.v2.model.ShowMrsVersionListResponse;
import com.huaweicloud.sdk.mrs.v2.model.ShowSingleJobExeRequest;
import com.huaweicloud.sdk.mrs.v2.model.ShowSingleJobExeResponse;
import com.huaweicloud.sdk.mrs.v2.model.ShowSqlResultRequest;
import com.huaweicloud.sdk.mrs.v2.model.ShowSqlResultResponse;
import com.huaweicloud.sdk.mrs.v2.model.ShowSqlResultWithJobRequest;
import com.huaweicloud.sdk.mrs.v2.model.ShowSqlResultWithJobResponse;
import com.huaweicloud.sdk.mrs.v2.model.ShowSyncIamUserRequest;
import com.huaweicloud.sdk.mrs.v2.model.ShowSyncIamUserResponse;
import com.huaweicloud.sdk.mrs.v2.model.ShowTagQuotaRequest;
import com.huaweicloud.sdk.mrs.v2.model.ShowTagQuotaResponse;
import com.huaweicloud.sdk.mrs.v2.model.ShowTagStatusRequest;
import com.huaweicloud.sdk.mrs.v2.model.ShowTagStatusResponse;
import com.huaweicloud.sdk.mrs.v2.model.ShrinkClusterRequest;
import com.huaweicloud.sdk.mrs.v2.model.ShrinkClusterResponse;
import com.huaweicloud.sdk.mrs.v2.model.StopJobRequest;
import com.huaweicloud.sdk.mrs.v2.model.StopJobResponse;
import com.huaweicloud.sdk.mrs.v2.model.SwitchClusterTagsRequest;
import com.huaweicloud.sdk.mrs.v2.model.SwitchClusterTagsResponse;
import com.huaweicloud.sdk.mrs.v2.model.UpdateAgencyMappingRequest;
import com.huaweicloud.sdk.mrs.v2.model.UpdateAgencyMappingResponse;
import com.huaweicloud.sdk.mrs.v2.model.UpdateAutoScalingPolicyRequest;
import com.huaweicloud.sdk.mrs.v2.model.UpdateAutoScalingPolicyResponse;
import com.huaweicloud.sdk.mrs.v2.model.UpdateClusterNameRequest;
import com.huaweicloud.sdk.mrs.v2.model.UpdateClusterNameResponse;
import com.huaweicloud.sdk.mrs.v2.model.UpdateDataConnectorRequest;
import com.huaweicloud.sdk.mrs.v2.model.UpdateDataConnectorResponse;
import com.huaweicloud.sdk.mrs.v2.model.UpdateSyncIamUserRequest;
import com.huaweicloud.sdk.mrs.v2.model.UpdateSyncIamUserResponse;

public class MrsClient {

    protected HcClient hcClient;

    public MrsClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<MrsClient> newBuilder() {
        ClientBuilder<MrsClient> clientBuilder = new ClientBuilder<>(MrsClient::new);
        return clientBuilder;
    }

    /**
     * 批量删除作业
     *
     * 在MRS集群中批量删除作业。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteJobsRequest 请求对象
     * @return BatchDeleteJobsResponse
     */
    public BatchDeleteJobsResponse batchDeleteJobs(BatchDeleteJobsRequest request) {
        return hcClient.syncInvokeHttp(request, MrsMeta.batchDeleteJobs);
    }

    /**
     * 批量删除作业
     *
     * 在MRS集群中批量删除作业。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteJobsRequest 请求对象
     * @return SyncInvoker<BatchDeleteJobsRequest, BatchDeleteJobsResponse>
     */
    public SyncInvoker<BatchDeleteJobsRequest, BatchDeleteJobsResponse> batchDeleteJobsInvoker(
        BatchDeleteJobsRequest request) {
        return new SyncInvoker<>(request, MrsMeta.batchDeleteJobs, hcClient);
    }

    /**
     * 创建弹性伸缩策略
     *
     * 创建弹性伸缩策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAutoScalingPolicyRequest 请求对象
     * @return CreateAutoScalingPolicyResponse
     */
    public CreateAutoScalingPolicyResponse createAutoScalingPolicy(CreateAutoScalingPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, MrsMeta.createAutoScalingPolicy);
    }

    /**
     * 创建弹性伸缩策略
     *
     * 创建弹性伸缩策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAutoScalingPolicyRequest 请求对象
     * @return SyncInvoker<CreateAutoScalingPolicyRequest, CreateAutoScalingPolicyResponse>
     */
    public SyncInvoker<CreateAutoScalingPolicyRequest, CreateAutoScalingPolicyResponse> createAutoScalingPolicyInvoker(
        CreateAutoScalingPolicyRequest request) {
        return new SyncInvoker<>(request, MrsMeta.createAutoScalingPolicy, hcClient);
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
     * @param request CreateClusterRequest 请求对象
     * @return CreateClusterResponse
     */
    public CreateClusterResponse createCluster(CreateClusterRequest request) {
        return hcClient.syncInvokeHttp(request, MrsMeta.createCluster);
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
     * @param request CreateClusterRequest 请求对象
     * @return SyncInvoker<CreateClusterRequest, CreateClusterResponse>
     */
    public SyncInvoker<CreateClusterRequest, CreateClusterResponse> createClusterInvoker(CreateClusterRequest request) {
        return new SyncInvoker<>(request, MrsMeta.createCluster, hcClient);
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
     * @param request CreateExecuteJobRequest 请求对象
     * @return CreateExecuteJobResponse
     */
    public CreateExecuteJobResponse createExecuteJob(CreateExecuteJobRequest request) {
        return hcClient.syncInvokeHttp(request, MrsMeta.createExecuteJob);
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
     * @param request CreateExecuteJobRequest 请求对象
     * @return SyncInvoker<CreateExecuteJobRequest, CreateExecuteJobResponse>
     */
    public SyncInvoker<CreateExecuteJobRequest, CreateExecuteJobResponse> createExecuteJobInvoker(
        CreateExecuteJobRequest request) {
        return new SyncInvoker<>(request, MrsMeta.createExecuteJob, hcClient);
    }

    /**
     * 删除弹性伸缩策略
     *
     * 删除弹性伸缩策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAutoScalingPolicyRequest 请求对象
     * @return DeleteAutoScalingPolicyResponse
     */
    public DeleteAutoScalingPolicyResponse deleteAutoScalingPolicy(DeleteAutoScalingPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, MrsMeta.deleteAutoScalingPolicy);
    }

    /**
     * 删除弹性伸缩策略
     *
     * 删除弹性伸缩策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAutoScalingPolicyRequest 请求对象
     * @return SyncInvoker<DeleteAutoScalingPolicyRequest, DeleteAutoScalingPolicyResponse>
     */
    public SyncInvoker<DeleteAutoScalingPolicyRequest, DeleteAutoScalingPolicyResponse> deleteAutoScalingPolicyInvoker(
        DeleteAutoScalingPolicyRequest request) {
        return new SyncInvoker<>(request, MrsMeta.deleteAutoScalingPolicy, hcClient);
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
     * @param request RunJobFlowRequest 请求对象
     * @return RunJobFlowResponse
     */
    public RunJobFlowResponse runJobFlow(RunJobFlowRequest request) {
        return hcClient.syncInvokeHttp(request, MrsMeta.runJobFlow);
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
     * @param request RunJobFlowRequest 请求对象
     * @return SyncInvoker<RunJobFlowRequest, RunJobFlowResponse>
     */
    public SyncInvoker<RunJobFlowRequest, RunJobFlowResponse> runJobFlowInvoker(RunJobFlowRequest request) {
        return new SyncInvoker<>(request, MrsMeta.runJobFlow, hcClient);
    }

    /**
     * 查询用户（组）与IAM委托的映射关系
     *
     * 获取用户（组）与IAM委托之间的映射关系的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAgencyMappingRequest 请求对象
     * @return ShowAgencyMappingResponse
     */
    public ShowAgencyMappingResponse showAgencyMapping(ShowAgencyMappingRequest request) {
        return hcClient.syncInvokeHttp(request, MrsMeta.showAgencyMapping);
    }

    /**
     * 查询用户（组）与IAM委托的映射关系
     *
     * 获取用户（组）与IAM委托之间的映射关系的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAgencyMappingRequest 请求对象
     * @return SyncInvoker<ShowAgencyMappingRequest, ShowAgencyMappingResponse>
     */
    public SyncInvoker<ShowAgencyMappingRequest, ShowAgencyMappingResponse> showAgencyMappingInvoker(
        ShowAgencyMappingRequest request) {
        return new SyncInvoker<>(request, MrsMeta.showAgencyMapping, hcClient);
    }

    /**
     * 查看弹性伸缩策略
     *
     * 查看指定集群的所有的弹性伸缩策略信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAutoScalingPolicyRequest 请求对象
     * @return ShowAutoScalingPolicyResponse
     */
    public ShowAutoScalingPolicyResponse showAutoScalingPolicy(ShowAutoScalingPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, MrsMeta.showAutoScalingPolicy);
    }

    /**
     * 查看弹性伸缩策略
     *
     * 查看指定集群的所有的弹性伸缩策略信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAutoScalingPolicyRequest 请求对象
     * @return SyncInvoker<ShowAutoScalingPolicyRequest, ShowAutoScalingPolicyResponse>
     */
    public SyncInvoker<ShowAutoScalingPolicyRequest, ShowAutoScalingPolicyResponse> showAutoScalingPolicyInvoker(
        ShowAutoScalingPolicyRequest request) {
        return new SyncInvoker<>(request, MrsMeta.showAutoScalingPolicy, hcClient);
    }

    /**
     * 查询作业列表信息
     *
     * 在MRS指定集群中查询作业列表信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowJobExeListNewRequest 请求对象
     * @return ShowJobExeListNewResponse
     */
    public ShowJobExeListNewResponse showJobExeListNew(ShowJobExeListNewRequest request) {
        return hcClient.syncInvokeHttp(request, MrsMeta.showJobExeListNew);
    }

    /**
     * 查询作业列表信息
     *
     * 在MRS指定集群中查询作业列表信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowJobExeListNewRequest 请求对象
     * @return SyncInvoker<ShowJobExeListNewRequest, ShowJobExeListNewResponse>
     */
    public SyncInvoker<ShowJobExeListNewRequest, ShowJobExeListNewResponse> showJobExeListNewInvoker(
        ShowJobExeListNewRequest request) {
        return new SyncInvoker<>(request, MrsMeta.showJobExeListNew, hcClient);
    }

    /**
     * 查询单个作业信息
     *
     * 在MRS集群中查询指定作业的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSingleJobExeRequest 请求对象
     * @return ShowSingleJobExeResponse
     */
    public ShowSingleJobExeResponse showSingleJobExe(ShowSingleJobExeRequest request) {
        return hcClient.syncInvokeHttp(request, MrsMeta.showSingleJobExe);
    }

    /**
     * 查询单个作业信息
     *
     * 在MRS集群中查询指定作业的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSingleJobExeRequest 请求对象
     * @return SyncInvoker<ShowSingleJobExeRequest, ShowSingleJobExeResponse>
     */
    public SyncInvoker<ShowSingleJobExeRequest, ShowSingleJobExeResponse> showSingleJobExeInvoker(
        ShowSingleJobExeRequest request) {
        return new SyncInvoker<>(request, MrsMeta.showSingleJobExe, hcClient);
    }

    /**
     * 获取SQL结果
     *
     * 在MRS集群中查询SparkSql和SparkScript两种类型作业的SQL语句运行完成后返回的查询结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSqlResultWithJobRequest 请求对象
     * @return ShowSqlResultWithJobResponse
     */
    public ShowSqlResultWithJobResponse showSqlResultWithJob(ShowSqlResultWithJobRequest request) {
        return hcClient.syncInvokeHttp(request, MrsMeta.showSqlResultWithJob);
    }

    /**
     * 获取SQL结果
     *
     * 在MRS集群中查询SparkSql和SparkScript两种类型作业的SQL语句运行完成后返回的查询结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSqlResultWithJobRequest 请求对象
     * @return SyncInvoker<ShowSqlResultWithJobRequest, ShowSqlResultWithJobResponse>
     */
    public SyncInvoker<ShowSqlResultWithJobRequest, ShowSqlResultWithJobResponse> showSqlResultWithJobInvoker(
        ShowSqlResultWithJobRequest request) {
        return new SyncInvoker<>(request, MrsMeta.showSqlResultWithJob, hcClient);
    }

    /**
     * 终止作业
     *
     * 在MRS集群中终止指定作业。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopJobRequest 请求对象
     * @return StopJobResponse
     */
    public StopJobResponse stopJob(StopJobRequest request) {
        return hcClient.syncInvokeHttp(request, MrsMeta.stopJob);
    }

    /**
     * 终止作业
     *
     * 在MRS集群中终止指定作业。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopJobRequest 请求对象
     * @return SyncInvoker<StopJobRequest, StopJobResponse>
     */
    public SyncInvoker<StopJobRequest, StopJobResponse> stopJobInvoker(StopJobRequest request) {
        return new SyncInvoker<>(request, MrsMeta.stopJob, hcClient);
    }

    /**
     * 更新用户（组）与IAM委托的映射关系
     *
     * 更新用户（组）与IAM委托之间的映射关系。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAgencyMappingRequest 请求对象
     * @return UpdateAgencyMappingResponse
     */
    public UpdateAgencyMappingResponse updateAgencyMapping(UpdateAgencyMappingRequest request) {
        return hcClient.syncInvokeHttp(request, MrsMeta.updateAgencyMapping);
    }

    /**
     * 更新用户（组）与IAM委托的映射关系
     *
     * 更新用户（组）与IAM委托之间的映射关系。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAgencyMappingRequest 请求对象
     * @return SyncInvoker<UpdateAgencyMappingRequest, UpdateAgencyMappingResponse>
     */
    public SyncInvoker<UpdateAgencyMappingRequest, UpdateAgencyMappingResponse> updateAgencyMappingInvoker(
        UpdateAgencyMappingRequest request) {
        return new SyncInvoker<>(request, MrsMeta.updateAgencyMapping, hcClient);
    }

    /**
     * 更新弹性伸缩策略
     *
     * 更新弹性伸缩策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAutoScalingPolicyRequest 请求对象
     * @return UpdateAutoScalingPolicyResponse
     */
    public UpdateAutoScalingPolicyResponse updateAutoScalingPolicy(UpdateAutoScalingPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, MrsMeta.updateAutoScalingPolicy);
    }

    /**
     * 更新弹性伸缩策略
     *
     * 更新弹性伸缩策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAutoScalingPolicyRequest 请求对象
     * @return SyncInvoker<UpdateAutoScalingPolicyRequest, UpdateAutoScalingPolicyResponse>
     */
    public SyncInvoker<UpdateAutoScalingPolicyRequest, UpdateAutoScalingPolicyResponse> updateAutoScalingPolicyInvoker(
        UpdateAutoScalingPolicyRequest request) {
        return new SyncInvoker<>(request, MrsMeta.updateAutoScalingPolicy, hcClient);
    }

    /**
     * 修改集群名称
     *
     * 修改集群名称
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateClusterNameRequest 请求对象
     * @return UpdateClusterNameResponse
     */
    public UpdateClusterNameResponse updateClusterName(UpdateClusterNameRequest request) {
        return hcClient.syncInvokeHttp(request, MrsMeta.updateClusterName);
    }

    /**
     * 修改集群名称
     *
     * 修改集群名称
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateClusterNameRequest 请求对象
     * @return SyncInvoker<UpdateClusterNameRequest, UpdateClusterNameResponse>
     */
    public SyncInvoker<UpdateClusterNameRequest, UpdateClusterNameResponse> updateClusterNameInvoker(
        UpdateClusterNameRequest request) {
        return new SyncInvoker<>(request, MrsMeta.updateClusterName, hcClient);
    }

    /**
     * 集群添加组件
     *
     * 集群添加组件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddComponentRequest 请求对象
     * @return AddComponentResponse
     */
    public AddComponentResponse addComponent(AddComponentRequest request) {
        return hcClient.syncInvokeHttp(request, MrsMeta.addComponent);
    }

    /**
     * 集群添加组件
     *
     * 集群添加组件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddComponentRequest 请求对象
     * @return SyncInvoker<AddComponentRequest, AddComponentResponse>
     */
    public SyncInvoker<AddComponentRequest, AddComponentResponse> addComponentInvoker(AddComponentRequest request) {
        return new SyncInvoker<>(request, MrsMeta.addComponent, hcClient);
    }

    /**
     * 扩容集群
     *
     * 对MRS集群进行扩容。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExpandClusterRequest 请求对象
     * @return ExpandClusterResponse
     */
    public ExpandClusterResponse expandCluster(ExpandClusterRequest request) {
        return hcClient.syncInvokeHttp(request, MrsMeta.expandCluster);
    }

    /**
     * 扩容集群
     *
     * 对MRS集群进行扩容。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExpandClusterRequest 请求对象
     * @return SyncInvoker<ExpandClusterRequest, ExpandClusterResponse>
     */
    public SyncInvoker<ExpandClusterRequest, ExpandClusterResponse> expandClusterInvoker(ExpandClusterRequest request) {
        return new SyncInvoker<>(request, MrsMeta.expandCluster, hcClient);
    }

    /**
     * 查询集群节点列表
     *
     * 查询集群节点列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListNodesRequest 请求对象
     * @return ListNodesResponse
     */
    public ListNodesResponse listNodes(ListNodesRequest request) {
        return hcClient.syncInvokeHttp(request, MrsMeta.listNodes);
    }

    /**
     * 查询集群节点列表
     *
     * 查询集群节点列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListNodesRequest 请求对象
     * @return SyncInvoker<ListNodesRequest, ListNodesResponse>
     */
    public SyncInvoker<ListNodesRequest, ListNodesResponse> listNodesInvoker(ListNodesRequest request) {
        return new SyncInvoker<>(request, MrsMeta.listNodes, hcClient);
    }

    /**
     * 获取当前集群通信安全授权状态
     *
     * 获取当前集群通信安全授权状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSecurityRuleStatusRequest 请求对象
     * @return ListSecurityRuleStatusResponse
     */
    public ListSecurityRuleStatusResponse listSecurityRuleStatus(ListSecurityRuleStatusRequest request) {
        return hcClient.syncInvokeHttp(request, MrsMeta.listSecurityRuleStatus);
    }

    /**
     * 获取当前集群通信安全授权状态
     *
     * 获取当前集群通信安全授权状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSecurityRuleStatusRequest 请求对象
     * @return SyncInvoker<ListSecurityRuleStatusRequest, ListSecurityRuleStatusResponse>
     */
    public SyncInvoker<ListSecurityRuleStatusRequest, ListSecurityRuleStatusResponse> listSecurityRuleStatusInvoker(
        ListSecurityRuleStatusRequest request) {
        return new SyncInvoker<>(request, MrsMeta.listSecurityRuleStatus, hcClient);
    }

    /**
     * 缩容集群
     *
     * 对MRS集群进行缩容。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShrinkClusterRequest 请求对象
     * @return ShrinkClusterResponse
     */
    public ShrinkClusterResponse shrinkCluster(ShrinkClusterRequest request) {
        return hcClient.syncInvokeHttp(request, MrsMeta.shrinkCluster);
    }

    /**
     * 缩容集群
     *
     * 对MRS集群进行缩容。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShrinkClusterRequest 请求对象
     * @return SyncInvoker<ShrinkClusterRequest, ShrinkClusterResponse>
     */
    public SyncInvoker<ShrinkClusterRequest, ShrinkClusterResponse> shrinkClusterInvoker(ShrinkClusterRequest request) {
        return new SyncInvoker<>(request, MrsMeta.shrinkCluster, hcClient);
    }

    /**
     * 创建数据连接
     *
     * 创建数据连接
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDataConnectorRequest 请求对象
     * @return CreateDataConnectorResponse
     */
    public CreateDataConnectorResponse createDataConnector(CreateDataConnectorRequest request) {
        return hcClient.syncInvokeHttp(request, MrsMeta.createDataConnector);
    }

    /**
     * 创建数据连接
     *
     * 创建数据连接
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDataConnectorRequest 请求对象
     * @return SyncInvoker<CreateDataConnectorRequest, CreateDataConnectorResponse>
     */
    public SyncInvoker<CreateDataConnectorRequest, CreateDataConnectorResponse> createDataConnectorInvoker(
        CreateDataConnectorRequest request) {
        return new SyncInvoker<>(request, MrsMeta.createDataConnector, hcClient);
    }

    /**
     * 删除数据连接
     *
     * 删除数据连接
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDataConnectorRequest 请求对象
     * @return DeleteDataConnectorResponse
     */
    public DeleteDataConnectorResponse deleteDataConnector(DeleteDataConnectorRequest request) {
        return hcClient.syncInvokeHttp(request, MrsMeta.deleteDataConnector);
    }

    /**
     * 删除数据连接
     *
     * 删除数据连接
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDataConnectorRequest 请求对象
     * @return SyncInvoker<DeleteDataConnectorRequest, DeleteDataConnectorResponse>
     */
    public SyncInvoker<DeleteDataConnectorRequest, DeleteDataConnectorResponse> deleteDataConnectorInvoker(
        DeleteDataConnectorRequest request) {
        return new SyncInvoker<>(request, MrsMeta.deleteDataConnector, hcClient);
    }

    /**
     * 查询数据连接列表
     *
     * 查询数据连接列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDataConnectorRequest 请求对象
     * @return ListDataConnectorResponse
     */
    public ListDataConnectorResponse listDataConnector(ListDataConnectorRequest request) {
        return hcClient.syncInvokeHttp(request, MrsMeta.listDataConnector);
    }

    /**
     * 查询数据连接列表
     *
     * 查询数据连接列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDataConnectorRequest 请求对象
     * @return SyncInvoker<ListDataConnectorRequest, ListDataConnectorResponse>
     */
    public SyncInvoker<ListDataConnectorRequest, ListDataConnectorResponse> listDataConnectorInvoker(
        ListDataConnectorRequest request) {
        return new SyncInvoker<>(request, MrsMeta.listDataConnector, hcClient);
    }

    /**
     * 更新数据连接
     *
     * 更新数据连接
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDataConnectorRequest 请求对象
     * @return UpdateDataConnectorResponse
     */
    public UpdateDataConnectorResponse updateDataConnector(UpdateDataConnectorRequest request) {
        return hcClient.syncInvokeHttp(request, MrsMeta.updateDataConnector);
    }

    /**
     * 更新数据连接
     *
     * 更新数据连接
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDataConnectorRequest 请求对象
     * @return SyncInvoker<UpdateDataConnectorRequest, UpdateDataConnectorResponse>
     */
    public SyncInvoker<UpdateDataConnectorRequest, UpdateDataConnectorResponse> updateDataConnectorInvoker(
        UpdateDataConnectorRequest request) {
        return new SyncInvoker<>(request, MrsMeta.updateDataConnector, hcClient);
    }

    /**
     * 获取指定目录文件列表
     *
     * 在MRS集群中获取指定目录文件列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHdfsFileListRequest 请求对象
     * @return ShowHdfsFileListResponse
     */
    public ShowHdfsFileListResponse showHdfsFileList(ShowHdfsFileListRequest request) {
        return hcClient.syncInvokeHttp(request, MrsMeta.showHdfsFileList);
    }

    /**
     * 获取指定目录文件列表
     *
     * 在MRS集群中获取指定目录文件列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHdfsFileListRequest 请求对象
     * @return SyncInvoker<ShowHdfsFileListRequest, ShowHdfsFileListResponse>
     */
    public SyncInvoker<ShowHdfsFileListRequest, ShowHdfsFileListResponse> showHdfsFileListInvoker(
        ShowHdfsFileListRequest request) {
        return new SyncInvoker<>(request, MrsMeta.showHdfsFileList, hcClient);
    }

    /**
     * 指定用户、用户组取消同步
     *
     * 指定用户、用户组取消同步
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CancelSyncIamUserRequest 请求对象
     * @return CancelSyncIamUserResponse
     */
    public CancelSyncIamUserResponse cancelSyncIamUser(CancelSyncIamUserRequest request) {
        return hcClient.syncInvokeHttp(request, MrsMeta.cancelSyncIamUser);
    }

    /**
     * 指定用户、用户组取消同步
     *
     * 指定用户、用户组取消同步
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CancelSyncIamUserRequest 请求对象
     * @return SyncInvoker<CancelSyncIamUserRequest, CancelSyncIamUserResponse>
     */
    public SyncInvoker<CancelSyncIamUserRequest, CancelSyncIamUserResponse> cancelSyncIamUserInvoker(
        CancelSyncIamUserRequest request) {
        return new SyncInvoker<>(request, MrsMeta.cancelSyncIamUser, hcClient);
    }

    /**
     * 查询指定集群的IAM同步情况
     *
     * 查询指定集群的IAM同步情况
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSyncRequirementsRequest 请求对象
     * @return ListSyncRequirementsResponse
     */
    public ListSyncRequirementsResponse listSyncRequirements(ListSyncRequirementsRequest request) {
        return hcClient.syncInvokeHttp(request, MrsMeta.listSyncRequirements);
    }

    /**
     * 查询指定集群的IAM同步情况
     *
     * 查询指定集群的IAM同步情况
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSyncRequirementsRequest 请求对象
     * @return SyncInvoker<ListSyncRequirementsRequest, ListSyncRequirementsResponse>
     */
    public SyncInvoker<ListSyncRequirementsRequest, ListSyncRequirementsResponse> listSyncRequirementsInvoker(
        ListSyncRequirementsRequest request) {
        return new SyncInvoker<>(request, MrsMeta.listSyncRequirements, hcClient);
    }

    /**
     * 查询当前集群是否在IAM同步进行中
     *
     * 查询当前集群是否在IAM同步进行中
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSyncStatusRequest 请求对象
     * @return ListSyncStatusResponse
     */
    public ListSyncStatusResponse listSyncStatus(ListSyncStatusRequest request) {
        return hcClient.syncInvokeHttp(request, MrsMeta.listSyncStatus);
    }

    /**
     * 查询当前集群是否在IAM同步进行中
     *
     * 查询当前集群是否在IAM同步进行中
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSyncStatusRequest 请求对象
     * @return SyncInvoker<ListSyncStatusRequest, ListSyncStatusResponse>
     */
    public SyncInvoker<ListSyncStatusRequest, ListSyncStatusResponse> listSyncStatusInvoker(
        ListSyncStatusRequest request) {
        return new SyncInvoker<>(request, MrsMeta.listSyncStatus, hcClient);
    }

    /**
     * 获取已经同步的IAM用户和用户组
     *
     * 获取已经同步的IAM用户和用户组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSyncIamUserRequest 请求对象
     * @return ShowSyncIamUserResponse
     */
    public ShowSyncIamUserResponse showSyncIamUser(ShowSyncIamUserRequest request) {
        return hcClient.syncInvokeHttp(request, MrsMeta.showSyncIamUser);
    }

    /**
     * 获取已经同步的IAM用户和用户组
     *
     * 获取已经同步的IAM用户和用户组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSyncIamUserRequest 请求对象
     * @return SyncInvoker<ShowSyncIamUserRequest, ShowSyncIamUserResponse>
     */
    public SyncInvoker<ShowSyncIamUserRequest, ShowSyncIamUserResponse> showSyncIamUserInvoker(
        ShowSyncIamUserRequest request) {
        return new SyncInvoker<>(request, MrsMeta.showSyncIamUser, hcClient);
    }

    /**
     * IAM同步
     *
     * 将IAM用户和用户组同步到manager，指定用户的情况下，会将该用户关联的IAM用户组也同步到manager。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSyncIamUserRequest 请求对象
     * @return UpdateSyncIamUserResponse
     */
    public UpdateSyncIamUserResponse updateSyncIamUser(UpdateSyncIamUserRequest request) {
        return hcClient.syncInvokeHttp(request, MrsMeta.updateSyncIamUser);
    }

    /**
     * IAM同步
     *
     * 将IAM用户和用户组同步到manager，指定用户的情况下，会将该用户关联的IAM用户组也同步到manager。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSyncIamUserRequest 请求对象
     * @return SyncInvoker<UpdateSyncIamUserRequest, UpdateSyncIamUserResponse>
     */
    public SyncInvoker<UpdateSyncIamUserRequest, UpdateSyncIamUserResponse> updateSyncIamUserInvoker(
        UpdateSyncIamUserRequest request) {
        return new SyncInvoker<>(request, MrsMeta.updateSyncIamUser, hcClient);
    }

    /**
     * 取消SQL执行任务
     *
     * 在MRS集群中取消一条SQL的执行任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CancelSqlRequest 请求对象
     * @return CancelSqlResponse
     */
    public CancelSqlResponse cancelSql(CancelSqlRequest request) {
        return hcClient.syncInvokeHttp(request, MrsMeta.cancelSql);
    }

    /**
     * 取消SQL执行任务
     *
     * 在MRS集群中取消一条SQL的执行任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CancelSqlRequest 请求对象
     * @return SyncInvoker<CancelSqlRequest, CancelSqlResponse>
     */
    public SyncInvoker<CancelSqlRequest, CancelSqlResponse> cancelSqlInvoker(CancelSqlRequest request) {
        return new SyncInvoker<>(request, MrsMeta.cancelSql, hcClient);
    }

    /**
     * 提交SQL语句
     *
     * 在MRS集群中提交并执行一条SQL语句。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteSqlRequest 请求对象
     * @return ExecuteSqlResponse
     */
    public ExecuteSqlResponse executeSql(ExecuteSqlRequest request) {
        return hcClient.syncInvokeHttp(request, MrsMeta.executeSql);
    }

    /**
     * 提交SQL语句
     *
     * 在MRS集群中提交并执行一条SQL语句。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteSqlRequest 请求对象
     * @return SyncInvoker<ExecuteSqlRequest, ExecuteSqlResponse>
     */
    public SyncInvoker<ExecuteSqlRequest, ExecuteSqlResponse> executeSqlInvoker(ExecuteSqlRequest request) {
        return new SyncInvoker<>(request, MrsMeta.executeSql, hcClient);
    }

    /**
     * 查询SQL结果
     *
     * 在MRS集群中查询一条SQL的执行结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSqlResultRequest 请求对象
     * @return ShowSqlResultResponse
     */
    public ShowSqlResultResponse showSqlResult(ShowSqlResultRequest request) {
        return hcClient.syncInvokeHttp(request, MrsMeta.showSqlResult);
    }

    /**
     * 查询SQL结果
     *
     * 在MRS集群中查询一条SQL的执行结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSqlResultRequest 请求对象
     * @return SyncInvoker<ShowSqlResultRequest, ShowSqlResultResponse>
     */
    public SyncInvoker<ShowSqlResultRequest, ShowSqlResultResponse> showSqlResultInvoker(ShowSqlResultRequest request) {
        return new SyncInvoker<>(request, MrsMeta.showSqlResult, hcClient);
    }

    /**
     * 查询标签配额
     *
     * 查询标签配额信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTagQuotaRequest 请求对象
     * @return ShowTagQuotaResponse
     */
    public ShowTagQuotaResponse showTagQuota(ShowTagQuotaRequest request) {
        return hcClient.syncInvokeHttp(request, MrsMeta.showTagQuota);
    }

    /**
     * 查询标签配额
     *
     * 查询标签配额信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTagQuotaRequest 请求对象
     * @return SyncInvoker<ShowTagQuotaRequest, ShowTagQuotaResponse>
     */
    public SyncInvoker<ShowTagQuotaRequest, ShowTagQuotaResponse> showTagQuotaInvoker(ShowTagQuotaRequest request) {
        return new SyncInvoker<>(request, MrsMeta.showTagQuota, hcClient);
    }

    /**
     * 查询默认标签状态
     *
     * 查询集群默认标签状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTagStatusRequest 请求对象
     * @return ShowTagStatusResponse
     */
    public ShowTagStatusResponse showTagStatus(ShowTagStatusRequest request) {
        return hcClient.syncInvokeHttp(request, MrsMeta.showTagStatus);
    }

    /**
     * 查询默认标签状态
     *
     * 查询集群默认标签状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTagStatusRequest 请求对象
     * @return SyncInvoker<ShowTagStatusRequest, ShowTagStatusResponse>
     */
    public SyncInvoker<ShowTagStatusRequest, ShowTagStatusResponse> showTagStatusInvoker(ShowTagStatusRequest request) {
        return new SyncInvoker<>(request, MrsMeta.showTagStatus, hcClient);
    }

    /**
     * 集群操作默认标签
     *
     * 对已有集群启用或关闭集群默认标签。开启后，集群内节点会打上集群默认标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchClusterTagsRequest 请求对象
     * @return SwitchClusterTagsResponse
     */
    public SwitchClusterTagsResponse switchClusterTags(SwitchClusterTagsRequest request) {
        return hcClient.syncInvokeHttp(request, MrsMeta.switchClusterTags);
    }

    /**
     * 集群操作默认标签
     *
     * 对已有集群启用或关闭集群默认标签。开启后，集群内节点会打上集群默认标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchClusterTagsRequest 请求对象
     * @return SyncInvoker<SwitchClusterTagsRequest, SwitchClusterTagsResponse>
     */
    public SyncInvoker<SwitchClusterTagsRequest, SwitchClusterTagsResponse> switchClusterTagsInvoker(
        SwitchClusterTagsRequest request) {
        return new SyncInvoker<>(request, MrsMeta.switchClusterTags, hcClient);
    }

    /**
     * 查询MRS集群版本可用的规格
     *
     * 查询MRS集群版本可用的规格
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMrsFlavorsRequest 请求对象
     * @return ShowMrsFlavorsResponse
     */
    public ShowMrsFlavorsResponse showMrsFlavors(ShowMrsFlavorsRequest request) {
        return hcClient.syncInvokeHttp(request, MrsMeta.showMrsFlavors);
    }

    /**
     * 查询MRS集群版本可用的规格
     *
     * 查询MRS集群版本可用的规格
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMrsFlavorsRequest 请求对象
     * @return SyncInvoker<ShowMrsFlavorsRequest, ShowMrsFlavorsResponse>
     */
    public SyncInvoker<ShowMrsFlavorsRequest, ShowMrsFlavorsResponse> showMrsFlavorsInvoker(
        ShowMrsFlavorsRequest request) {
        return new SyncInvoker<>(request, MrsMeta.showMrsFlavors, hcClient);
    }

    /**
     * 展示MRS版本列表
     *
     * 展示MRS版本列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMrsVersionListRequest 请求对象
     * @return ShowMrsVersionListResponse
     */
    public ShowMrsVersionListResponse showMrsVersionList(ShowMrsVersionListRequest request) {
        return hcClient.syncInvokeHttp(request, MrsMeta.showMrsVersionList);
    }

    /**
     * 展示MRS版本列表
     *
     * 展示MRS版本列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMrsVersionListRequest 请求对象
     * @return SyncInvoker<ShowMrsVersionListRequest, ShowMrsVersionListResponse>
     */
    public SyncInvoker<ShowMrsVersionListRequest, ShowMrsVersionListResponse> showMrsVersionListInvoker(
        ShowMrsVersionListRequest request) {
        return new SyncInvoker<>(request, MrsMeta.showMrsVersionList, hcClient);
    }

}
