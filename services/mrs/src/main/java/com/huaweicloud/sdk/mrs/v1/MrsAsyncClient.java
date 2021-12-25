package com.huaweicloud.sdk.mrs.v1;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.mrs.v1.model.*;

public class MrsAsyncClient {
    protected HcClient hcClient;

    public MrsAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<MrsAsyncClient> newBuilder() {
        return new ClientBuilder<>(MrsAsyncClient::new);
    }


    /**
     * 批量添加集群标签
     * 为指定集群批量添加标签。  一个集群上最多有10个标签。  此接口为幂等接口：  - 创建时，同一个集群不允许重复key，如果数据库存在就覆盖。
     *
     * @param BatchCreateClusterTagsRequest 请求对象
     * @return CompletableFuture<BatchCreateClusterTagsResponse>
     */
    public CompletableFuture<BatchCreateClusterTagsResponse> batchCreateClusterTagsAsync(BatchCreateClusterTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, MrsMeta.batchCreateClusterTags);
    }

    /**
     * 批量添加集群标签
     * 为指定集群批量添加标签。  一个集群上最多有10个标签。  此接口为幂等接口：  - 创建时，同一个集群不允许重复key，如果数据库存在就覆盖。
     *
     * @param BatchCreateClusterTagsRequest 请求对象
     * @return AsyncInvoker<BatchCreateClusterTagsRequest, BatchCreateClusterTagsResponse>
     */
    public AsyncInvoker<BatchCreateClusterTagsRequest, BatchCreateClusterTagsResponse> batchCreateClusterTagsAsyncInvoker(BatchCreateClusterTagsRequest request) {
        return new AsyncInvoker<BatchCreateClusterTagsRequest, BatchCreateClusterTagsResponse>(request, MrsMeta.batchCreateClusterTags, hcClient);
    }

    /**
     * 批量删除集群标签
     * 为指定集群批量删除标签。  一个集群上最多有10个标签。  此接口为幂等接口：   - 删除时，如果删除的标签不存在，默认处理成功，删除时不对标签字符集范围做校验。Key长度36个unicode字符，value为43个unicode字符。删除时tags结构体不能缺失，key不能为空，或者空字符串。
     *
     * @param BatchDeleteClusterTagsRequest 请求对象
     * @return CompletableFuture<BatchDeleteClusterTagsResponse>
     */
    public CompletableFuture<BatchDeleteClusterTagsResponse> batchDeleteClusterTagsAsync(BatchDeleteClusterTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, MrsMeta.batchDeleteClusterTags);
    }

    /**
     * 批量删除集群标签
     * 为指定集群批量删除标签。  一个集群上最多有10个标签。  此接口为幂等接口：   - 删除时，如果删除的标签不存在，默认处理成功，删除时不对标签字符集范围做校验。Key长度36个unicode字符，value为43个unicode字符。删除时tags结构体不能缺失，key不能为空，或者空字符串。
     *
     * @param BatchDeleteClusterTagsRequest 请求对象
     * @return AsyncInvoker<BatchDeleteClusterTagsRequest, BatchDeleteClusterTagsResponse>
     */
    public AsyncInvoker<BatchDeleteClusterTagsRequest, BatchDeleteClusterTagsResponse> batchDeleteClusterTagsAsyncInvoker(BatchDeleteClusterTagsRequest request) {
        return new AsyncInvoker<BatchDeleteClusterTagsRequest, BatchDeleteClusterTagsResponse>(request, MrsMeta.batchDeleteClusterTags, hcClient);
    }

    /**
     * 新增作业并执行
     * 在MRS集群中新增一个作业，并执行作业。该接口不兼容Sahara。 集群ID可参考[查询集群列表](https://support.huaweicloud.com/api-mrs/ListClusters.html)接口获取。
     *
     * @param CreateAndExecuteJobRequest 请求对象
     * @return CompletableFuture<CreateAndExecuteJobResponse>
     */
    public CompletableFuture<CreateAndExecuteJobResponse> createAndExecuteJobAsync(CreateAndExecuteJobRequest request) {
        return hcClient.asyncInvokeHttp(request, MrsMeta.createAndExecuteJob);
    }

    /**
     * 新增作业并执行
     * 在MRS集群中新增一个作业，并执行作业。该接口不兼容Sahara。 集群ID可参考[查询集群列表](https://support.huaweicloud.com/api-mrs/ListClusters.html)接口获取。
     *
     * @param CreateAndExecuteJobRequest 请求对象
     * @return AsyncInvoker<CreateAndExecuteJobRequest, CreateAndExecuteJobResponse>
     */
    public AsyncInvoker<CreateAndExecuteJobRequest, CreateAndExecuteJobResponse> createAndExecuteJobAsyncInvoker(CreateAndExecuteJobRequest request) {
        return new AsyncInvoker<CreateAndExecuteJobRequest, CreateAndExecuteJobResponse>(request, MrsMeta.createAndExecuteJob, hcClient);
    }

    /**
     * 创建集群并执行作业
     * 创建一个MRS集群，并在集群中提交一个作业。该接口不兼容Sahara。 支持同一时间并发创建10个集群。 使用接口前，您需要先获取下的资源信息。 - 通过VPC创建或查询VPC、子网 - 通过ECS创建或查询密钥对 - 通过[终端节点](https://support.huaweicloud.com/api-mrs/mrs_02_0003.html)获取区域信息 - 参考[MRS服务支持的组件](https://support.huaweicloud.com/api-mrs/mrs_02_9001.html)获取MRS版本及对应版本支持的组件信息  
     *
     * @param CreateClusterRequest 请求对象
     * @return CompletableFuture<CreateClusterResponse>
     */
    public CompletableFuture<CreateClusterResponse> createClusterAsync(CreateClusterRequest request) {
        return hcClient.asyncInvokeHttp(request, MrsMeta.createCluster);
    }

    /**
     * 创建集群并执行作业
     * 创建一个MRS集群，并在集群中提交一个作业。该接口不兼容Sahara。 支持同一时间并发创建10个集群。 使用接口前，您需要先获取下的资源信息。 - 通过VPC创建或查询VPC、子网 - 通过ECS创建或查询密钥对 - 通过[终端节点](https://support.huaweicloud.com/api-mrs/mrs_02_0003.html)获取区域信息 - 参考[MRS服务支持的组件](https://support.huaweicloud.com/api-mrs/mrs_02_9001.html)获取MRS版本及对应版本支持的组件信息  
     *
     * @param CreateClusterRequest 请求对象
     * @return AsyncInvoker<CreateClusterRequest, CreateClusterResponse>
     */
    public AsyncInvoker<CreateClusterRequest, CreateClusterResponse> createClusterAsyncInvoker(CreateClusterRequest request) {
        return new AsyncInvoker<CreateClusterRequest, CreateClusterResponse>(request, MrsMeta.createCluster, hcClient);
    }

    /**
     * 给指定集群添加标签
     * 为特定的集群添加一个tag。 一个集群上最多有10个标签，此接口为幂等接口。添加标签时，如果创建的标签已经存在（key相同），则覆盖。
     *
     * @param CreateClusterTagRequest 请求对象
     * @return CompletableFuture<CreateClusterTagResponse>
     */
    public CompletableFuture<CreateClusterTagResponse> createClusterTagAsync(CreateClusterTagRequest request) {
        return hcClient.asyncInvokeHttp(request, MrsMeta.createClusterTag);
    }

    /**
     * 给指定集群添加标签
     * 为特定的集群添加一个tag。 一个集群上最多有10个标签，此接口为幂等接口。添加标签时，如果创建的标签已经存在（key相同），则覆盖。
     *
     * @param CreateClusterTagRequest 请求对象
     * @return AsyncInvoker<CreateClusterTagRequest, CreateClusterTagResponse>
     */
    public AsyncInvoker<CreateClusterTagRequest, CreateClusterTagResponse> createClusterTagAsyncInvoker(CreateClusterTagRequest request) {
        return new AsyncInvoker<CreateClusterTagRequest, CreateClusterTagResponse>(request, MrsMeta.createClusterTag, hcClient);
    }

    /**
     * 配置弹性伸缩规则
     * 对弹性伸缩规则进行编辑。  在创建集群并执行作业接口中也可以创建弹性伸缩规则。
     *
     * @param CreateScalingPolicyRequest 请求对象
     * @return CompletableFuture<CreateScalingPolicyResponse>
     */
    public CompletableFuture<CreateScalingPolicyResponse> createScalingPolicyAsync(CreateScalingPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, MrsMeta.createScalingPolicy);
    }

    /**
     * 配置弹性伸缩规则
     * 对弹性伸缩规则进行编辑。  在创建集群并执行作业接口中也可以创建弹性伸缩规则。
     *
     * @param CreateScalingPolicyRequest 请求对象
     * @return AsyncInvoker<CreateScalingPolicyRequest, CreateScalingPolicyResponse>
     */
    public AsyncInvoker<CreateScalingPolicyRequest, CreateScalingPolicyResponse> createScalingPolicyAsyncInvoker(CreateScalingPolicyRequest request) {
        return new AsyncInvoker<CreateScalingPolicyRequest, CreateScalingPolicyResponse>(request, MrsMeta.createScalingPolicy, hcClient);
    }

    /**
     * 删除集群
     * 数据完成处理分析后或者集群运行异常无法提供服务时可删除集群服务。该接口兼容Sahara。  处于如下状态的集群不允许删除： - scaling-out：扩容中 - scaling-in：缩容中 - starting：启动中 - terminating：删除中 - terminated：已删除 - failed：失败
     *
     * @param DeleteClusterRequest 请求对象
     * @return CompletableFuture<DeleteClusterResponse>
     */
    public CompletableFuture<DeleteClusterResponse> deleteClusterAsync(DeleteClusterRequest request) {
        return hcClient.asyncInvokeHttp(request, MrsMeta.deleteCluster);
    }

    /**
     * 删除集群
     * 数据完成处理分析后或者集群运行异常无法提供服务时可删除集群服务。该接口兼容Sahara。  处于如下状态的集群不允许删除： - scaling-out：扩容中 - scaling-in：缩容中 - starting：启动中 - terminating：删除中 - terminated：已删除 - failed：失败
     *
     * @param DeleteClusterRequest 请求对象
     * @return AsyncInvoker<DeleteClusterRequest, DeleteClusterResponse>
     */
    public AsyncInvoker<DeleteClusterRequest, DeleteClusterResponse> deleteClusterAsyncInvoker(DeleteClusterRequest request) {
        return new AsyncInvoker<DeleteClusterRequest, DeleteClusterResponse>(request, MrsMeta.deleteCluster, hcClient);
    }

    /**
     * 删除指定集群的标签
     * 删除特定集群的标签。
     *
     * @param DeleteClusterTagRequest 请求对象
     * @return CompletableFuture<DeleteClusterTagResponse>
     */
    public CompletableFuture<DeleteClusterTagResponse> deleteClusterTagAsync(DeleteClusterTagRequest request) {
        return hcClient.asyncInvokeHttp(request, MrsMeta.deleteClusterTag);
    }

    /**
     * 删除指定集群的标签
     * 删除特定集群的标签。
     *
     * @param DeleteClusterTagRequest 请求对象
     * @return AsyncInvoker<DeleteClusterTagRequest, DeleteClusterTagResponse>
     */
    public AsyncInvoker<DeleteClusterTagRequest, DeleteClusterTagResponse> deleteClusterTagAsyncInvoker(DeleteClusterTagRequest request) {
        return new AsyncInvoker<DeleteClusterTagRequest, DeleteClusterTagResponse>(request, MrsMeta.deleteClusterTag, hcClient);
    }

    /**
     * 删除作业执行对象
     * 删除指定的作业执行对象。该接口兼容Sahara。
     *
     * @param DeleteJobExecutionRequest 请求对象
     * @return CompletableFuture<DeleteJobExecutionResponse>
     */
    public CompletableFuture<DeleteJobExecutionResponse> deleteJobExecutionAsync(DeleteJobExecutionRequest request) {
        return hcClient.asyncInvokeHttp(request, MrsMeta.deleteJobExecution);
    }

    /**
     * 删除作业执行对象
     * 删除指定的作业执行对象。该接口兼容Sahara。
     *
     * @param DeleteJobExecutionRequest 请求对象
     * @return AsyncInvoker<DeleteJobExecutionRequest, DeleteJobExecutionResponse>
     */
    public AsyncInvoker<DeleteJobExecutionRequest, DeleteJobExecutionResponse> deleteJobExecutionAsyncInvoker(DeleteJobExecutionRequest request) {
        return new AsyncInvoker<DeleteJobExecutionRequest, DeleteJobExecutionResponse>(request, MrsMeta.deleteJobExecution, hcClient);
    }

    /**
     * 查询所有标签
     * 查询租户在指定Region下的所有标签集合 。
     *
     * @param ListAllTagsRequest 请求对象
     * @return CompletableFuture<ListAllTagsResponse>
     */
    public CompletableFuture<ListAllTagsResponse> listAllTagsAsync(ListAllTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, MrsMeta.listAllTags);
    }

    /**
     * 查询所有标签
     * 查询租户在指定Region下的所有标签集合 。
     *
     * @param ListAllTagsRequest 请求对象
     * @return AsyncInvoker<ListAllTagsRequest, ListAllTagsResponse>
     */
    public AsyncInvoker<ListAllTagsRequest, ListAllTagsResponse> listAllTagsAsyncInvoker(ListAllTagsRequest request) {
        return new AsyncInvoker<ListAllTagsRequest, ListAllTagsResponse>(request, MrsMeta.listAllTags, hcClient);
    }

    /**
     * 查询指定集群的标签
     * 查询指定集群的标签信息。
     *
     * @param ListClusterTagsRequest 请求对象
     * @return CompletableFuture<ListClusterTagsResponse>
     */
    public CompletableFuture<ListClusterTagsResponse> listClusterTagsAsync(ListClusterTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, MrsMeta.listClusterTags);
    }

    /**
     * 查询指定集群的标签
     * 查询指定集群的标签信息。
     *
     * @param ListClusterTagsRequest 请求对象
     * @return AsyncInvoker<ListClusterTagsRequest, ListClusterTagsResponse>
     */
    public AsyncInvoker<ListClusterTagsRequest, ListClusterTagsResponse> listClusterTagsAsyncInvoker(ListClusterTagsRequest request) {
        return new AsyncInvoker<ListClusterTagsRequest, ListClusterTagsResponse>(request, MrsMeta.listClusterTags, hcClient);
    }

    /**
     * 查询集群列表
     * 查看用户创建的集群列表信息。该接口不兼容Sahara。
     *
     * @param ListClustersRequest 请求对象
     * @return CompletableFuture<ListClustersResponse>
     */
    public CompletableFuture<ListClustersResponse> listClustersAsync(ListClustersRequest request) {
        return hcClient.asyncInvokeHttp(request, MrsMeta.listClusters);
    }

    /**
     * 查询集群列表
     * 查看用户创建的集群列表信息。该接口不兼容Sahara。
     *
     * @param ListClustersRequest 请求对象
     * @return AsyncInvoker<ListClustersRequest, ListClustersResponse>
     */
    public AsyncInvoker<ListClustersRequest, ListClustersResponse> listClustersAsyncInvoker(ListClustersRequest request) {
        return new AsyncInvoker<ListClustersRequest, ListClustersResponse>(request, MrsMeta.listClusters, hcClient);
    }

    /**
     * 查询特定标签的集群列表
     * 使用标签过滤集群。  集群默认按照创建时间倒序，集群tag也按照创建时间倒序。
     *
     * @param ListClustersByTagsRequest 请求对象
     * @return CompletableFuture<ListClustersByTagsResponse>
     */
    public CompletableFuture<ListClustersByTagsResponse> listClustersByTagsAsync(ListClustersByTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, MrsMeta.listClustersByTags);
    }

    /**
     * 查询特定标签的集群列表
     * 使用标签过滤集群。  集群默认按照创建时间倒序，集群tag也按照创建时间倒序。
     *
     * @param ListClustersByTagsRequest 请求对象
     * @return AsyncInvoker<ListClustersByTagsRequest, ListClustersByTagsResponse>
     */
    public AsyncInvoker<ListClustersByTagsRequest, ListClustersByTagsResponse> listClustersByTagsAsyncInvoker(ListClustersByTagsRequest request) {
        return new AsyncInvoker<ListClustersByTagsRequest, ListClustersByTagsResponse>(request, MrsMeta.listClustersByTags, hcClient);
    }

    /**
     * 查询作业exe对象列表
     * 查询所有作业的exe对象列表。该接口不兼容Sahara。
     *
     * @param ListExecuteJobRequest 请求对象
     * @return CompletableFuture<ListExecuteJobResponse>
     */
    public CompletableFuture<ListExecuteJobResponse> listExecuteJobAsync(ListExecuteJobRequest request) {
        return hcClient.asyncInvokeHttp(request, MrsMeta.listExecuteJob);
    }

    /**
     * 查询作业exe对象列表
     * 查询所有作业的exe对象列表。该接口不兼容Sahara。
     *
     * @param ListExecuteJobRequest 请求对象
     * @return AsyncInvoker<ListExecuteJobRequest, ListExecuteJobResponse>
     */
    public AsyncInvoker<ListExecuteJobRequest, ListExecuteJobResponse> listExecuteJobAsyncInvoker(ListExecuteJobRequest request) {
        return new AsyncInvoker<ListExecuteJobRequest, ListExecuteJobResponse>(request, MrsMeta.listExecuteJob, hcClient);
    }

    /**
     * 查询主机列表
     * 该接口用于查询输入集群的主机列表详情。
     *
     * @param ListHostsRequest 请求对象
     * @return CompletableFuture<ListHostsResponse>
     */
    public CompletableFuture<ListHostsResponse> listHostsAsync(ListHostsRequest request) {
        return hcClient.asyncInvokeHttp(request, MrsMeta.listHosts);
    }

    /**
     * 查询主机列表
     * 该接口用于查询输入集群的主机列表详情。
     *
     * @param ListHostsRequest 请求对象
     * @return AsyncInvoker<ListHostsRequest, ListHostsResponse>
     */
    public AsyncInvoker<ListHostsRequest, ListHostsResponse> listHostsAsyncInvoker(ListHostsRequest request) {
        return new AsyncInvoker<ListHostsRequest, ListHostsResponse>(request, MrsMeta.listHosts, hcClient);
    }

    /**
     * 查询集群详情
     * 查看指定集群的详细信息。该接口不兼容Sahara。
     *
     * @param ShowClusterDetailsRequest 请求对象
     * @return CompletableFuture<ShowClusterDetailsResponse>
     */
    public CompletableFuture<ShowClusterDetailsResponse> showClusterDetailsAsync(ShowClusterDetailsRequest request) {
        return hcClient.asyncInvokeHttp(request, MrsMeta.showClusterDetails);
    }

    /**
     * 查询集群详情
     * 查看指定集群的详细信息。该接口不兼容Sahara。
     *
     * @param ShowClusterDetailsRequest 请求对象
     * @return AsyncInvoker<ShowClusterDetailsRequest, ShowClusterDetailsResponse>
     */
    public AsyncInvoker<ShowClusterDetailsRequest, ShowClusterDetailsResponse> showClusterDetailsAsyncInvoker(ShowClusterDetailsRequest request) {
        return new AsyncInvoker<ShowClusterDetailsRequest, ShowClusterDetailsResponse>(request, MrsMeta.showClusterDetails, hcClient);
    }

    /**
     * 查询作业exe对象详情
     * 查询指定作业的exe对象详细信息。该接口不兼容Sahara。
     *
     * @param ShowJobExesRequest 请求对象
     * @return CompletableFuture<ShowJobExesResponse>
     */
    public CompletableFuture<ShowJobExesResponse> showJobExesAsync(ShowJobExesRequest request) {
        return hcClient.asyncInvokeHttp(request, MrsMeta.showJobExes);
    }

    /**
     * 查询作业exe对象详情
     * 查询指定作业的exe对象详细信息。该接口不兼容Sahara。
     *
     * @param ShowJobExesRequest 请求对象
     * @return AsyncInvoker<ShowJobExesRequest, ShowJobExesResponse>
     */
    public AsyncInvoker<ShowJobExesRequest, ShowJobExesResponse> showJobExesAsyncInvoker(ShowJobExesRequest request) {
        return new AsyncInvoker<ShowJobExesRequest, ShowJobExesResponse>(request, MrsMeta.showJobExes, hcClient);
    }

    /**
     * 调整集群节点
     * 创建集群后，扩容/缩容集群Core节点或者Task节点。MRS集群创建成功后不支持调整Master节点数量，即不支持扩缩容Master节点。该接口不兼容Sahara。 处于running状态的集群才允许扩容/缩容，其他状态则不允许扩容/缩容。 集群状态和集群ID可参考[查询集群列表](https://support.huaweicloud.com/api-mrs/ListClusters.html)接口获取。
     *
     * @param UpdateClusterScalingRequest 请求对象
     * @return CompletableFuture<UpdateClusterScalingResponse>
     */
    public CompletableFuture<UpdateClusterScalingResponse> updateClusterScalingAsync(UpdateClusterScalingRequest request) {
        return hcClient.asyncInvokeHttp(request, MrsMeta.updateClusterScaling);
    }

    /**
     * 调整集群节点
     * 创建集群后，扩容/缩容集群Core节点或者Task节点。MRS集群创建成功后不支持调整Master节点数量，即不支持扩缩容Master节点。该接口不兼容Sahara。 处于running状态的集群才允许扩容/缩容，其他状态则不允许扩容/缩容。 集群状态和集群ID可参考[查询集群列表](https://support.huaweicloud.com/api-mrs/ListClusters.html)接口获取。
     *
     * @param UpdateClusterScalingRequest 请求对象
     * @return AsyncInvoker<UpdateClusterScalingRequest, UpdateClusterScalingResponse>
     */
    public AsyncInvoker<UpdateClusterScalingRequest, UpdateClusterScalingResponse> updateClusterScalingAsyncInvoker(UpdateClusterScalingRequest request) {
        return new AsyncInvoker<UpdateClusterScalingRequest, UpdateClusterScalingResponse>(request, MrsMeta.updateClusterScaling, hcClient);
    }

}