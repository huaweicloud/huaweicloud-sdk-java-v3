package com.huaweicloud.sdk.cloudtable.v2;

import com.huaweicloud.sdk.cloudtable.v2.model.*;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;

public class CloudTableClient {

    protected HcClient hcClient;

    public CloudTableClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<CloudTableClient> newBuilder() {
        return new ClientBuilder<>(CloudTableClient::new);
    }

    /**
     * 创建CloudTable集群
     *
     * 创建一个CloudTable集群。
     * 使用接口前，您需要先获取如下资源信息。
     * - 通过VPC创建或查询VPC、子网
     * - 通过安全组创建或查询可用的security_group_id
     * 
     * 本接口是一个同步接口，当创建CloudTable集群成功后会返回集群id。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateClusterRequest 请求对象
     * @return CreateClusterResponse
     */
    public CreateClusterResponse createCluster(CreateClusterRequest request) {
        return hcClient.syncInvokeHttp(request, CloudTableMeta.createCluster);
    }

    /**
     * 创建CloudTable集群
     *
     * 创建一个CloudTable集群。
     * 使用接口前，您需要先获取如下资源信息。
     * - 通过VPC创建或查询VPC、子网
     * - 通过安全组创建或查询可用的security_group_id
     * 
     * 本接口是一个同步接口，当创建CloudTable集群成功后会返回集群id。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateClusterRequest 请求对象
     * @return SyncInvoker<CreateClusterRequest, CreateClusterResponse>
     */
    public SyncInvoker<CreateClusterRequest, CreateClusterResponse> createClusterInvoker(CreateClusterRequest request) {
        return new SyncInvoker<CreateClusterRequest, CreateClusterResponse>(request, CloudTableMeta.createCluster,
            hcClient);
    }

    /**
     * 删除CloudTable指定集群
     *
     * 集群ID为集群唯一标识，根据集群ID删除指定集群。
     * 如下状态的集群不允许删除：
     * - 创建中
     * - 扩容中
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteClusterRequest 请求对象
     * @return DeleteClusterResponse
     */
    public DeleteClusterResponse deleteCluster(DeleteClusterRequest request) {
        return hcClient.syncInvokeHttp(request, CloudTableMeta.deleteCluster);
    }

    /**
     * 删除CloudTable指定集群
     *
     * 集群ID为集群唯一标识，根据集群ID删除指定集群。
     * 如下状态的集群不允许删除：
     * - 创建中
     * - 扩容中
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteClusterRequest 请求对象
     * @return SyncInvoker<DeleteClusterRequest, DeleteClusterResponse>
     */
    public SyncInvoker<DeleteClusterRequest, DeleteClusterResponse> deleteClusterInvoker(DeleteClusterRequest request) {
        return new SyncInvoker<DeleteClusterRequest, DeleteClusterResponse>(request, CloudTableMeta.deleteCluster,
            hcClient);
    }

    /**
     * 查询CloudTable集群列表
     *
     * 查看用户创建的集群列表信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListClustersRequest 请求对象
     * @return ListClustersResponse
     */
    public ListClustersResponse listClusters(ListClustersRequest request) {
        return hcClient.syncInvokeHttp(request, CloudTableMeta.listClusters);
    }

    /**
     * 查询CloudTable集群列表
     *
     * 查看用户创建的集群列表信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListClustersRequest 请求对象
     * @return SyncInvoker<ListClustersRequest, ListClustersResponse>
     */
    public SyncInvoker<ListClustersRequest, ListClustersResponse> listClustersInvoker(ListClustersRequest request) {
        return new SyncInvoker<ListClustersRequest, ListClustersResponse>(request, CloudTableMeta.listClusters,
            hcClient);
    }

    /**
     * 查询CloudTable集群详情
     *
     * 通过集群ID唯一标识一个集群，根据集群ID查询特定CloudTable集群的详情信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowClusterDetailRequest 请求对象
     * @return ShowClusterDetailResponse
     */
    public ShowClusterDetailResponse showClusterDetail(ShowClusterDetailRequest request) {
        return hcClient.syncInvokeHttp(request, CloudTableMeta.showClusterDetail);
    }

    /**
     * 查询CloudTable集群详情
     *
     * 通过集群ID唯一标识一个集群，根据集群ID查询特定CloudTable集群的详情信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowClusterDetailRequest 请求对象
     * @return SyncInvoker<ShowClusterDetailRequest, ShowClusterDetailResponse>
     */
    public SyncInvoker<ShowClusterDetailRequest, ShowClusterDetailResponse> showClusterDetailInvoker(
        ShowClusterDetailRequest request) {
        return new SyncInvoker<ShowClusterDetailRequest, ShowClusterDetailResponse>(request,
            CloudTableMeta.showClusterDetail, hcClient);
    }

}
