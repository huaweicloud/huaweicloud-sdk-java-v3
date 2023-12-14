package com.huaweicloud.sdk.cloudtable.v2;

import com.huaweicloud.sdk.cloudtable.v2.model.CreateCloudTableClusterRequest;
import com.huaweicloud.sdk.cloudtable.v2.model.CreateCloudTableClusterResponse;
import com.huaweicloud.sdk.cloudtable.v2.model.CreateClusterRequest;
import com.huaweicloud.sdk.cloudtable.v2.model.CreateClusterResponse;
import com.huaweicloud.sdk.cloudtable.v2.model.DeleteClusterRequest;
import com.huaweicloud.sdk.cloudtable.v2.model.DeleteClusterResponse;
import com.huaweicloud.sdk.cloudtable.v2.model.EnableComponentRequest;
import com.huaweicloud.sdk.cloudtable.v2.model.EnableComponentResponse;
import com.huaweicloud.sdk.cloudtable.v2.model.ExpandClusterComponentRequest;
import com.huaweicloud.sdk.cloudtable.v2.model.ExpandClusterComponentResponse;
import com.huaweicloud.sdk.cloudtable.v2.model.ListClustersRequest;
import com.huaweicloud.sdk.cloudtable.v2.model.ListClustersResponse;
import com.huaweicloud.sdk.cloudtable.v2.model.RebootCloudTableClusterRequest;
import com.huaweicloud.sdk.cloudtable.v2.model.RebootCloudTableClusterResponse;
import com.huaweicloud.sdk.cloudtable.v2.model.ShowClusterDetailRequest;
import com.huaweicloud.sdk.cloudtable.v2.model.ShowClusterDetailResponse;
import com.huaweicloud.sdk.cloudtable.v2.model.ShowClusterSettingRequest;
import com.huaweicloud.sdk.cloudtable.v2.model.ShowClusterSettingResponse;
import com.huaweicloud.sdk.cloudtable.v2.model.UpdateClusterSettingRequest;
import com.huaweicloud.sdk.cloudtable.v2.model.UpdateClusterSettingResponse;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;

public class CloudTableClient {

    protected HcClient hcClient;

    public CloudTableClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<CloudTableClient> newBuilder() {
        ClientBuilder<CloudTableClient> clientBuilder = new ClientBuilder<>(CloudTableClient::new);
        return clientBuilder;
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
     * 开启opentsdb组件
     *
     * 开启opentsdb组件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param EnableComponentRequest 请求对象
     * @return EnableComponentResponse
     */
    public EnableComponentResponse enableComponent(EnableComponentRequest request) {
        return hcClient.syncInvokeHttp(request, CloudTableMeta.enableComponent);
    }

    /**
     * 开启opentsdb组件
     *
     * 开启opentsdb组件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param EnableComponentRequest 请求对象
     * @return SyncInvoker<EnableComponentRequest, EnableComponentResponse>
     */
    public SyncInvoker<EnableComponentRequest, EnableComponentResponse> enableComponentInvoker(
        EnableComponentRequest request) {
        return new SyncInvoker<EnableComponentRequest, EnableComponentResponse>(request, CloudTableMeta.enableComponent,
            hcClient);
    }

    /**
     * 扩容组件
     *
     * 扩容指定类型的集群节点
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ExpandClusterComponentRequest 请求对象
     * @return ExpandClusterComponentResponse
     */
    public ExpandClusterComponentResponse expandClusterComponent(ExpandClusterComponentRequest request) {
        return hcClient.syncInvokeHttp(request, CloudTableMeta.expandClusterComponent);
    }

    /**
     * 扩容组件
     *
     * 扩容指定类型的集群节点
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ExpandClusterComponentRequest 请求对象
     * @return SyncInvoker<ExpandClusterComponentRequest, ExpandClusterComponentResponse>
     */
    public SyncInvoker<ExpandClusterComponentRequest, ExpandClusterComponentResponse> expandClusterComponentInvoker(
        ExpandClusterComponentRequest request) {
        return new SyncInvoker<ExpandClusterComponentRequest, ExpandClusterComponentResponse>(request,
            CloudTableMeta.expandClusterComponent, hcClient);
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
     * 重启集群的api入口
     *
     * 重启集群的api入口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RebootCloudTableClusterRequest 请求对象
     * @return RebootCloudTableClusterResponse
     */
    public RebootCloudTableClusterResponse rebootCloudTableCluster(RebootCloudTableClusterRequest request) {
        return hcClient.syncInvokeHttp(request, CloudTableMeta.rebootCloudTableCluster);
    }

    /**
     * 重启集群的api入口
     *
     * 重启集群的api入口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RebootCloudTableClusterRequest 请求对象
     * @return SyncInvoker<RebootCloudTableClusterRequest, RebootCloudTableClusterResponse>
     */
    public SyncInvoker<RebootCloudTableClusterRequest, RebootCloudTableClusterResponse> rebootCloudTableClusterInvoker(
        RebootCloudTableClusterRequest request) {
        return new SyncInvoker<RebootCloudTableClusterRequest, RebootCloudTableClusterResponse>(request,
            CloudTableMeta.rebootCloudTableCluster, hcClient);
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

    /**
     * 查询集群配置
     *
     * 查询集群配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowClusterSettingRequest 请求对象
     * @return ShowClusterSettingResponse
     */
    public ShowClusterSettingResponse showClusterSetting(ShowClusterSettingRequest request) {
        return hcClient.syncInvokeHttp(request, CloudTableMeta.showClusterSetting);
    }

    /**
     * 查询集群配置
     *
     * 查询集群配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowClusterSettingRequest 请求对象
     * @return SyncInvoker<ShowClusterSettingRequest, ShowClusterSettingResponse>
     */
    public SyncInvoker<ShowClusterSettingRequest, ShowClusterSettingResponse> showClusterSettingInvoker(
        ShowClusterSettingRequest request) {
        return new SyncInvoker<ShowClusterSettingRequest, ShowClusterSettingResponse>(request,
            CloudTableMeta.showClusterSetting, hcClient);
    }

    /**
     * 修改集群配置
     *
     * 修改集群配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateClusterSettingRequest 请求对象
     * @return UpdateClusterSettingResponse
     */
    public UpdateClusterSettingResponse updateClusterSetting(UpdateClusterSettingRequest request) {
        return hcClient.syncInvokeHttp(request, CloudTableMeta.updateClusterSetting);
    }

    /**
     * 修改集群配置
     *
     * 修改集群配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateClusterSettingRequest 请求对象
     * @return SyncInvoker<UpdateClusterSettingRequest, UpdateClusterSettingResponse>
     */
    public SyncInvoker<UpdateClusterSettingRequest, UpdateClusterSettingResponse> updateClusterSettingInvoker(
        UpdateClusterSettingRequest request) {
        return new SyncInvoker<UpdateClusterSettingRequest, UpdateClusterSettingResponse>(request,
            CloudTableMeta.updateClusterSetting, hcClient);
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
     * @param CreateCloudTableClusterRequest 请求对象
     * @return CreateCloudTableClusterResponse
     */
    public CreateCloudTableClusterResponse createCloudTableCluster(CreateCloudTableClusterRequest request) {
        return hcClient.syncInvokeHttp(request, CloudTableMeta.createCloudTableCluster);
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
     * @param CreateCloudTableClusterRequest 请求对象
     * @return SyncInvoker<CreateCloudTableClusterRequest, CreateCloudTableClusterResponse>
     */
    public SyncInvoker<CreateCloudTableClusterRequest, CreateCloudTableClusterResponse> createCloudTableClusterInvoker(
        CreateCloudTableClusterRequest request) {
        return new SyncInvoker<CreateCloudTableClusterRequest, CreateCloudTableClusterResponse>(request,
            CloudTableMeta.createCloudTableCluster, hcClient);
    }

}
