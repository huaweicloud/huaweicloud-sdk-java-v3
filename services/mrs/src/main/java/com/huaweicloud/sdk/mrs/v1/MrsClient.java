package com.huaweicloud.sdk.mrs.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.mrs.v1.model.BatchCreateClusterTagsRequest;
import com.huaweicloud.sdk.mrs.v1.model.BatchCreateClusterTagsResponse;
import com.huaweicloud.sdk.mrs.v1.model.BatchDeleteClusterTagsRequest;
import com.huaweicloud.sdk.mrs.v1.model.BatchDeleteClusterTagsResponse;
import com.huaweicloud.sdk.mrs.v1.model.CreateAndExecuteJobRequest;
import com.huaweicloud.sdk.mrs.v1.model.CreateAndExecuteJobResponse;
import com.huaweicloud.sdk.mrs.v1.model.CreateClusterRequest;
import com.huaweicloud.sdk.mrs.v1.model.CreateClusterResponse;
import com.huaweicloud.sdk.mrs.v1.model.CreateClusterTagRequest;
import com.huaweicloud.sdk.mrs.v1.model.CreateClusterTagResponse;
import com.huaweicloud.sdk.mrs.v1.model.CreateScalingPolicyRequest;
import com.huaweicloud.sdk.mrs.v1.model.CreateScalingPolicyResponse;
import com.huaweicloud.sdk.mrs.v1.model.DeleteClusterRequest;
import com.huaweicloud.sdk.mrs.v1.model.DeleteClusterResponse;
import com.huaweicloud.sdk.mrs.v1.model.DeleteClusterTagRequest;
import com.huaweicloud.sdk.mrs.v1.model.DeleteClusterTagResponse;
import com.huaweicloud.sdk.mrs.v1.model.DeleteJobExecutionRequest;
import com.huaweicloud.sdk.mrs.v1.model.DeleteJobExecutionResponse;
import com.huaweicloud.sdk.mrs.v1.model.ListAllTagsRequest;
import com.huaweicloud.sdk.mrs.v1.model.ListAllTagsResponse;
import com.huaweicloud.sdk.mrs.v1.model.ListAvailableZonesRequest;
import com.huaweicloud.sdk.mrs.v1.model.ListAvailableZonesResponse;
import com.huaweicloud.sdk.mrs.v1.model.ListClusterTagsRequest;
import com.huaweicloud.sdk.mrs.v1.model.ListClusterTagsResponse;
import com.huaweicloud.sdk.mrs.v1.model.ListClustersByTagsRequest;
import com.huaweicloud.sdk.mrs.v1.model.ListClustersByTagsResponse;
import com.huaweicloud.sdk.mrs.v1.model.ListClustersRequest;
import com.huaweicloud.sdk.mrs.v1.model.ListClustersResponse;
import com.huaweicloud.sdk.mrs.v1.model.ListExecuteJobRequest;
import com.huaweicloud.sdk.mrs.v1.model.ListExecuteJobResponse;
import com.huaweicloud.sdk.mrs.v1.model.ListHostsRequest;
import com.huaweicloud.sdk.mrs.v1.model.ListHostsResponse;
import com.huaweicloud.sdk.mrs.v1.model.ShowClusterDetailsRequest;
import com.huaweicloud.sdk.mrs.v1.model.ShowClusterDetailsResponse;
import com.huaweicloud.sdk.mrs.v1.model.ShowJobExesRequest;
import com.huaweicloud.sdk.mrs.v1.model.ShowJobExesResponse;
import com.huaweicloud.sdk.mrs.v1.model.UpdateClusterScalingRequest;
import com.huaweicloud.sdk.mrs.v1.model.UpdateClusterScalingResponse;

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
     * 批量添加集群标签
     *
     * 为指定集群批量添加标签。
     * 
     * 一个集群上最多有10个标签。
     * 
     * 此接口为幂等接口：
     * 
     * - 创建时，同一个集群不允许重复key，如果数据库存在就覆盖。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchCreateClusterTagsRequest 请求对象
     * @return BatchCreateClusterTagsResponse
     */
    public BatchCreateClusterTagsResponse batchCreateClusterTags(BatchCreateClusterTagsRequest request) {
        return hcClient.syncInvokeHttp(request, MrsMeta.batchCreateClusterTags);
    }

    /**
     * 批量添加集群标签
     *
     * 为指定集群批量添加标签。
     * 
     * 一个集群上最多有10个标签。
     * 
     * 此接口为幂等接口：
     * 
     * - 创建时，同一个集群不允许重复key，如果数据库存在就覆盖。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchCreateClusterTagsRequest 请求对象
     * @return SyncInvoker<BatchCreateClusterTagsRequest, BatchCreateClusterTagsResponse>
     */
    public SyncInvoker<BatchCreateClusterTagsRequest, BatchCreateClusterTagsResponse> batchCreateClusterTagsInvoker(
        BatchCreateClusterTagsRequest request) {
        return new SyncInvoker<BatchCreateClusterTagsRequest, BatchCreateClusterTagsResponse>(request,
            MrsMeta.batchCreateClusterTags, hcClient);
    }

    /**
     * 批量删除集群标签
     *
     * 为指定集群批量删除标签。
     * 
     * 一个集群上最多有10个标签。
     * 
     * 此接口为幂等接口：
     * 
     * -
     * 删除时，如果删除的标签不存在，默认处理成功，删除时不对标签字符集范围做校验。Key长度36个unicode字符，value为43个unicode字符。删除时tags结构体不能缺失，key不能为空，或者空字符串。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchDeleteClusterTagsRequest 请求对象
     * @return BatchDeleteClusterTagsResponse
     */
    public BatchDeleteClusterTagsResponse batchDeleteClusterTags(BatchDeleteClusterTagsRequest request) {
        return hcClient.syncInvokeHttp(request, MrsMeta.batchDeleteClusterTags);
    }

    /**
     * 批量删除集群标签
     *
     * 为指定集群批量删除标签。
     * 
     * 一个集群上最多有10个标签。
     * 
     * 此接口为幂等接口：
     * 
     * -
     * 删除时，如果删除的标签不存在，默认处理成功，删除时不对标签字符集范围做校验。Key长度36个unicode字符，value为43个unicode字符。删除时tags结构体不能缺失，key不能为空，或者空字符串。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchDeleteClusterTagsRequest 请求对象
     * @return SyncInvoker<BatchDeleteClusterTagsRequest, BatchDeleteClusterTagsResponse>
     */
    public SyncInvoker<BatchDeleteClusterTagsRequest, BatchDeleteClusterTagsResponse> batchDeleteClusterTagsInvoker(
        BatchDeleteClusterTagsRequest request) {
        return new SyncInvoker<BatchDeleteClusterTagsRequest, BatchDeleteClusterTagsResponse>(request,
            MrsMeta.batchDeleteClusterTags, hcClient);
    }

    /**
     * 新增作业并执行（废弃）
     *
     * 如需使用作业管理接口请参考apiv2接口使用，本接口后续不再进行维护。
     * 在MRS集群中新增一个作业，并执行作业。该接口不兼容Sahara。
     * 集群ID可参考[查询集群列表](https://support.huaweicloud.com/api-mrs/ListClusters.html)接口获取。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateAndExecuteJobRequest 请求对象
     * @return CreateAndExecuteJobResponse
     */
    public CreateAndExecuteJobResponse createAndExecuteJob(CreateAndExecuteJobRequest request) {
        return hcClient.syncInvokeHttp(request, MrsMeta.createAndExecuteJob);
    }

    /**
     * 新增作业并执行（废弃）
     *
     * 如需使用作业管理接口请参考apiv2接口使用，本接口后续不再进行维护。
     * 在MRS集群中新增一个作业，并执行作业。该接口不兼容Sahara。
     * 集群ID可参考[查询集群列表](https://support.huaweicloud.com/api-mrs/ListClusters.html)接口获取。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateAndExecuteJobRequest 请求对象
     * @return SyncInvoker<CreateAndExecuteJobRequest, CreateAndExecuteJobResponse>
     */
    public SyncInvoker<CreateAndExecuteJobRequest, CreateAndExecuteJobResponse> createAndExecuteJobInvoker(
        CreateAndExecuteJobRequest request) {
        return new SyncInvoker<CreateAndExecuteJobRequest, CreateAndExecuteJobResponse>(request,
            MrsMeta.createAndExecuteJob, hcClient);
    }

    /**
     * 创建集群并执行作业
     *
     * 创建一个MRS集群，并在集群中提交一个作业。该接口不兼容Sahara。
     * 支持同一时间并发创建10个集群。
     * 使用接口前，您需要先获取下的资源信息。
     * - 通过VPC创建或查询VPC、子网
     * - 通过ECS创建或查询密钥对
     * - 通过[终端节点](https://support.huaweicloud.com/api-mrs/mrs_02_0003.html)获取区域信息
     * - 参考[MRS服务支持的组件](https://support.huaweicloud.com/api-mrs/mrs_02_9001.html)获取MRS版本及对应版本支持的组件信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateClusterRequest 请求对象
     * @return CreateClusterResponse
     */
    public CreateClusterResponse createCluster(CreateClusterRequest request) {
        return hcClient.syncInvokeHttp(request, MrsMeta.createCluster);
    }

    /**
     * 创建集群并执行作业
     *
     * 创建一个MRS集群，并在集群中提交一个作业。该接口不兼容Sahara。
     * 支持同一时间并发创建10个集群。
     * 使用接口前，您需要先获取下的资源信息。
     * - 通过VPC创建或查询VPC、子网
     * - 通过ECS创建或查询密钥对
     * - 通过[终端节点](https://support.huaweicloud.com/api-mrs/mrs_02_0003.html)获取区域信息
     * - 参考[MRS服务支持的组件](https://support.huaweicloud.com/api-mrs/mrs_02_9001.html)获取MRS版本及对应版本支持的组件信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateClusterRequest 请求对象
     * @return SyncInvoker<CreateClusterRequest, CreateClusterResponse>
     */
    public SyncInvoker<CreateClusterRequest, CreateClusterResponse> createClusterInvoker(CreateClusterRequest request) {
        return new SyncInvoker<CreateClusterRequest, CreateClusterResponse>(request, MrsMeta.createCluster, hcClient);
    }

    /**
     * 给指定集群添加标签
     *
     * 为特定的集群添加一个tag。
     * 一个集群上最多有10个标签，此接口为幂等接口。添加标签时，如果创建的标签已经存在（key相同），则覆盖。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateClusterTagRequest 请求对象
     * @return CreateClusterTagResponse
     */
    public CreateClusterTagResponse createClusterTag(CreateClusterTagRequest request) {
        return hcClient.syncInvokeHttp(request, MrsMeta.createClusterTag);
    }

    /**
     * 给指定集群添加标签
     *
     * 为特定的集群添加一个tag。
     * 一个集群上最多有10个标签，此接口为幂等接口。添加标签时，如果创建的标签已经存在（key相同），则覆盖。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateClusterTagRequest 请求对象
     * @return SyncInvoker<CreateClusterTagRequest, CreateClusterTagResponse>
     */
    public SyncInvoker<CreateClusterTagRequest, CreateClusterTagResponse> createClusterTagInvoker(
        CreateClusterTagRequest request) {
        return new SyncInvoker<CreateClusterTagRequest, CreateClusterTagResponse>(request, MrsMeta.createClusterTag,
            hcClient);
    }

    /**
     * 配置弹性伸缩规则
     *
     * 对弹性伸缩规则进行编辑。
     * 
     * 在创建集群并执行作业接口中也可以创建弹性伸缩规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateScalingPolicyRequest 请求对象
     * @return CreateScalingPolicyResponse
     */
    public CreateScalingPolicyResponse createScalingPolicy(CreateScalingPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, MrsMeta.createScalingPolicy);
    }

    /**
     * 配置弹性伸缩规则
     *
     * 对弹性伸缩规则进行编辑。
     * 
     * 在创建集群并执行作业接口中也可以创建弹性伸缩规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateScalingPolicyRequest 请求对象
     * @return SyncInvoker<CreateScalingPolicyRequest, CreateScalingPolicyResponse>
     */
    public SyncInvoker<CreateScalingPolicyRequest, CreateScalingPolicyResponse> createScalingPolicyInvoker(
        CreateScalingPolicyRequest request) {
        return new SyncInvoker<CreateScalingPolicyRequest, CreateScalingPolicyResponse>(request,
            MrsMeta.createScalingPolicy, hcClient);
    }

    /**
     * 删除集群
     *
     * 数据完成处理分析后或者集群运行异常无法提供服务时可删除集群服务。该接口兼容Sahara。
     * 
     * 处于如下状态的集群不允许删除：
     * - scaling-out：扩容中
     * - scaling-in：缩容中
     * - starting：启动中
     * - terminating：删除中
     * - terminated：已删除
     * - failed：失败
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteClusterRequest 请求对象
     * @return DeleteClusterResponse
     */
    public DeleteClusterResponse deleteCluster(DeleteClusterRequest request) {
        return hcClient.syncInvokeHttp(request, MrsMeta.deleteCluster);
    }

    /**
     * 删除集群
     *
     * 数据完成处理分析后或者集群运行异常无法提供服务时可删除集群服务。该接口兼容Sahara。
     * 
     * 处于如下状态的集群不允许删除：
     * - scaling-out：扩容中
     * - scaling-in：缩容中
     * - starting：启动中
     * - terminating：删除中
     * - terminated：已删除
     * - failed：失败
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteClusterRequest 请求对象
     * @return SyncInvoker<DeleteClusterRequest, DeleteClusterResponse>
     */
    public SyncInvoker<DeleteClusterRequest, DeleteClusterResponse> deleteClusterInvoker(DeleteClusterRequest request) {
        return new SyncInvoker<DeleteClusterRequest, DeleteClusterResponse>(request, MrsMeta.deleteCluster, hcClient);
    }

    /**
     * 删除指定集群的标签
     *
     * 删除特定集群的标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteClusterTagRequest 请求对象
     * @return DeleteClusterTagResponse
     */
    public DeleteClusterTagResponse deleteClusterTag(DeleteClusterTagRequest request) {
        return hcClient.syncInvokeHttp(request, MrsMeta.deleteClusterTag);
    }

    /**
     * 删除指定集群的标签
     *
     * 删除特定集群的标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteClusterTagRequest 请求对象
     * @return SyncInvoker<DeleteClusterTagRequest, DeleteClusterTagResponse>
     */
    public SyncInvoker<DeleteClusterTagRequest, DeleteClusterTagResponse> deleteClusterTagInvoker(
        DeleteClusterTagRequest request) {
        return new SyncInvoker<DeleteClusterTagRequest, DeleteClusterTagResponse>(request, MrsMeta.deleteClusterTag,
            hcClient);
    }

    /**
     * 删除作业执行对象（废弃）
     *
     * 如需使用作业管理接口请参考apiv2接口使用，本接口后续不再进行维护。
     * 删除指定的作业执行对象。该接口兼容Sahara。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteJobExecutionRequest 请求对象
     * @return DeleteJobExecutionResponse
     */
    public DeleteJobExecutionResponse deleteJobExecution(DeleteJobExecutionRequest request) {
        return hcClient.syncInvokeHttp(request, MrsMeta.deleteJobExecution);
    }

    /**
     * 删除作业执行对象（废弃）
     *
     * 如需使用作业管理接口请参考apiv2接口使用，本接口后续不再进行维护。
     * 删除指定的作业执行对象。该接口兼容Sahara。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteJobExecutionRequest 请求对象
     * @return SyncInvoker<DeleteJobExecutionRequest, DeleteJobExecutionResponse>
     */
    public SyncInvoker<DeleteJobExecutionRequest, DeleteJobExecutionResponse> deleteJobExecutionInvoker(
        DeleteJobExecutionRequest request) {
        return new SyncInvoker<DeleteJobExecutionRequest, DeleteJobExecutionResponse>(request,
            MrsMeta.deleteJobExecution, hcClient);
    }

    /**
     * 查询所有标签
     *
     * 查询租户在指定Region下的所有标签集合 。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAllTagsRequest 请求对象
     * @return ListAllTagsResponse
     */
    public ListAllTagsResponse listAllTags(ListAllTagsRequest request) {
        return hcClient.syncInvokeHttp(request, MrsMeta.listAllTags);
    }

    /**
     * 查询所有标签
     *
     * 查询租户在指定Region下的所有标签集合 。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAllTagsRequest 请求对象
     * @return SyncInvoker<ListAllTagsRequest, ListAllTagsResponse>
     */
    public SyncInvoker<ListAllTagsRequest, ListAllTagsResponse> listAllTagsInvoker(ListAllTagsRequest request) {
        return new SyncInvoker<ListAllTagsRequest, ListAllTagsResponse>(request, MrsMeta.listAllTags, hcClient);
    }

    /**
     * 查询指定集群的标签
     *
     * 查询指定集群的标签信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListClusterTagsRequest 请求对象
     * @return ListClusterTagsResponse
     */
    public ListClusterTagsResponse listClusterTags(ListClusterTagsRequest request) {
        return hcClient.syncInvokeHttp(request, MrsMeta.listClusterTags);
    }

    /**
     * 查询指定集群的标签
     *
     * 查询指定集群的标签信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListClusterTagsRequest 请求对象
     * @return SyncInvoker<ListClusterTagsRequest, ListClusterTagsResponse>
     */
    public SyncInvoker<ListClusterTagsRequest, ListClusterTagsResponse> listClusterTagsInvoker(
        ListClusterTagsRequest request) {
        return new SyncInvoker<ListClusterTagsRequest, ListClusterTagsResponse>(request, MrsMeta.listClusterTags,
            hcClient);
    }

    /**
     * 查询集群列表
     *
     * 查看用户创建的集群列表信息。该接口不兼容Sahara。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListClustersRequest 请求对象
     * @return ListClustersResponse
     */
    public ListClustersResponse listClusters(ListClustersRequest request) {
        return hcClient.syncInvokeHttp(request, MrsMeta.listClusters);
    }

    /**
     * 查询集群列表
     *
     * 查看用户创建的集群列表信息。该接口不兼容Sahara。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListClustersRequest 请求对象
     * @return SyncInvoker<ListClustersRequest, ListClustersResponse>
     */
    public SyncInvoker<ListClustersRequest, ListClustersResponse> listClustersInvoker(ListClustersRequest request) {
        return new SyncInvoker<ListClustersRequest, ListClustersResponse>(request, MrsMeta.listClusters, hcClient);
    }

    /**
     * 查询特定标签的集群列表
     *
     * 使用标签过滤集群。
     * 
     * 集群默认按照创建时间倒序，集群tag也按照创建时间倒序。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListClustersByTagsRequest 请求对象
     * @return ListClustersByTagsResponse
     */
    public ListClustersByTagsResponse listClustersByTags(ListClustersByTagsRequest request) {
        return hcClient.syncInvokeHttp(request, MrsMeta.listClustersByTags);
    }

    /**
     * 查询特定标签的集群列表
     *
     * 使用标签过滤集群。
     * 
     * 集群默认按照创建时间倒序，集群tag也按照创建时间倒序。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListClustersByTagsRequest 请求对象
     * @return SyncInvoker<ListClustersByTagsRequest, ListClustersByTagsResponse>
     */
    public SyncInvoker<ListClustersByTagsRequest, ListClustersByTagsResponse> listClustersByTagsInvoker(
        ListClustersByTagsRequest request) {
        return new SyncInvoker<ListClustersByTagsRequest, ListClustersByTagsResponse>(request,
            MrsMeta.listClustersByTags, hcClient);
    }

    /**
     * 查询作业exe对象列表（废弃）
     *
     * 如需使用作业管理接口请参考apiv2接口使用，本接口后续不再进行维护。
     * 查询所有作业的exe对象列表。该接口不兼容Sahara。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListExecuteJobRequest 请求对象
     * @return ListExecuteJobResponse
     */
    public ListExecuteJobResponse listExecuteJob(ListExecuteJobRequest request) {
        return hcClient.syncInvokeHttp(request, MrsMeta.listExecuteJob);
    }

    /**
     * 查询作业exe对象列表（废弃）
     *
     * 如需使用作业管理接口请参考apiv2接口使用，本接口后续不再进行维护。
     * 查询所有作业的exe对象列表。该接口不兼容Sahara。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListExecuteJobRequest 请求对象
     * @return SyncInvoker<ListExecuteJobRequest, ListExecuteJobResponse>
     */
    public SyncInvoker<ListExecuteJobRequest, ListExecuteJobResponse> listExecuteJobInvoker(
        ListExecuteJobRequest request) {
        return new SyncInvoker<ListExecuteJobRequest, ListExecuteJobResponse>(request, MrsMeta.listExecuteJob,
            hcClient);
    }

    /**
     * 查询主机列表
     *
     * 该接口用于查询输入集群的主机列表详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListHostsRequest 请求对象
     * @return ListHostsResponse
     */
    public ListHostsResponse listHosts(ListHostsRequest request) {
        return hcClient.syncInvokeHttp(request, MrsMeta.listHosts);
    }

    /**
     * 查询主机列表
     *
     * 该接口用于查询输入集群的主机列表详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListHostsRequest 请求对象
     * @return SyncInvoker<ListHostsRequest, ListHostsResponse>
     */
    public SyncInvoker<ListHostsRequest, ListHostsResponse> listHostsInvoker(ListHostsRequest request) {
        return new SyncInvoker<ListHostsRequest, ListHostsResponse>(request, MrsMeta.listHosts, hcClient);
    }

    /**
     * 查询集群详情
     *
     * 查看指定集群的详细信息。该接口不兼容Sahara。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowClusterDetailsRequest 请求对象
     * @return ShowClusterDetailsResponse
     */
    public ShowClusterDetailsResponse showClusterDetails(ShowClusterDetailsRequest request) {
        return hcClient.syncInvokeHttp(request, MrsMeta.showClusterDetails);
    }

    /**
     * 查询集群详情
     *
     * 查看指定集群的详细信息。该接口不兼容Sahara。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowClusterDetailsRequest 请求对象
     * @return SyncInvoker<ShowClusterDetailsRequest, ShowClusterDetailsResponse>
     */
    public SyncInvoker<ShowClusterDetailsRequest, ShowClusterDetailsResponse> showClusterDetailsInvoker(
        ShowClusterDetailsRequest request) {
        return new SyncInvoker<ShowClusterDetailsRequest, ShowClusterDetailsResponse>(request,
            MrsMeta.showClusterDetails, hcClient);
    }

    /**
     * 查询作业exe对象详情（废弃）
     *
     * 如需使用作业管理接口请参考apiv2接口使用，本接口后续不再进行维护。
     * 查询指定作业的exe对象详细信息。该接口不兼容Sahara。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowJobExesRequest 请求对象
     * @return ShowJobExesResponse
     */
    public ShowJobExesResponse showJobExes(ShowJobExesRequest request) {
        return hcClient.syncInvokeHttp(request, MrsMeta.showJobExes);
    }

    /**
     * 查询作业exe对象详情（废弃）
     *
     * 如需使用作业管理接口请参考apiv2接口使用，本接口后续不再进行维护。
     * 查询指定作业的exe对象详细信息。该接口不兼容Sahara。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowJobExesRequest 请求对象
     * @return SyncInvoker<ShowJobExesRequest, ShowJobExesResponse>
     */
    public SyncInvoker<ShowJobExesRequest, ShowJobExesResponse> showJobExesInvoker(ShowJobExesRequest request) {
        return new SyncInvoker<ShowJobExesRequest, ShowJobExesResponse>(request, MrsMeta.showJobExes, hcClient);
    }

    /**
     * 调整集群节点
     *
     * 创建集群后，扩容/缩容集群Core节点或者Task节点。MRS集群创建成功后不支持调整Master节点数量，即不支持扩缩容Master节点。该接口不兼容Sahara。
     * 处于running状态的集群才允许扩容/缩容，其他状态则不允许扩容/缩容。 集群状态和集群ID可参考[查询集群列表](https://support.huaweicloud.com/api-mrs/ListClusters.html)接口获取。 本章节的接口只支持流式集群、分析集群和混合集群，不支持自定义集群。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateClusterScalingRequest 请求对象
     * @return UpdateClusterScalingResponse
     */
    public UpdateClusterScalingResponse updateClusterScaling(UpdateClusterScalingRequest request) {
        return hcClient.syncInvokeHttp(request, MrsMeta.updateClusterScaling);
    }

    /**
     * 调整集群节点
     *
     * 创建集群后，扩容/缩容集群Core节点或者Task节点。MRS集群创建成功后不支持调整Master节点数量，即不支持扩缩容Master节点。该接口不兼容Sahara。
     * 处于running状态的集群才允许扩容/缩容，其他状态则不允许扩容/缩容。 集群状态和集群ID可参考[查询集群列表](https://support.huaweicloud.com/api-mrs/ListClusters.html)接口获取。 本章节的接口只支持流式集群、分析集群和混合集群，不支持自定义集群。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateClusterScalingRequest 请求对象
     * @return SyncInvoker<UpdateClusterScalingRequest, UpdateClusterScalingResponse>
     */
    public SyncInvoker<UpdateClusterScalingRequest, UpdateClusterScalingResponse> updateClusterScalingInvoker(
        UpdateClusterScalingRequest request) {
        return new SyncInvoker<UpdateClusterScalingRequest, UpdateClusterScalingResponse>(request,
            MrsMeta.updateClusterScaling, hcClient);
    }

    /**
     * 查询可用区信息
     *
     * 在创建集群时，需要配置实例所在的可用区ID，可通过该接口查询可用区的ID。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAvailableZonesRequest 请求对象
     * @return ListAvailableZonesResponse
     */
    public ListAvailableZonesResponse listAvailableZones(ListAvailableZonesRequest request) {
        return hcClient.syncInvokeHttp(request, MrsMeta.listAvailableZones);
    }

    /**
     * 查询可用区信息
     *
     * 在创建集群时，需要配置实例所在的可用区ID，可通过该接口查询可用区的ID。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAvailableZonesRequest 请求对象
     * @return SyncInvoker<ListAvailableZonesRequest, ListAvailableZonesResponse>
     */
    public SyncInvoker<ListAvailableZonesRequest, ListAvailableZonesResponse> listAvailableZonesInvoker(
        ListAvailableZonesRequest request) {
        return new SyncInvoker<ListAvailableZonesRequest, ListAvailableZonesResponse>(request,
            MrsMeta.listAvailableZones, hcClient);
    }

}
