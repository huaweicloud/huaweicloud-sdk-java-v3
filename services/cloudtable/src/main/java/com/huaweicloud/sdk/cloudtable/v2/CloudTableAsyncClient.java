package com.huaweicloud.sdk.cloudtable.v2;

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
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;

import java.util.concurrent.CompletableFuture;

public class CloudTableAsyncClient {

    protected HcClient hcClient;

    public CloudTableAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<CloudTableAsyncClient> newBuilder() {
        ClientBuilder<CloudTableAsyncClient> clientBuilder = new ClientBuilder<>(CloudTableAsyncClient::new);
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
     * @return CompletableFuture<CreateClusterResponse>
     */
    public CompletableFuture<CreateClusterResponse> createClusterAsync(CreateClusterRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudTableMeta.createCluster);
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
     * @return AsyncInvoker<CreateClusterRequest, CreateClusterResponse>
     */
    public AsyncInvoker<CreateClusterRequest, CreateClusterResponse> createClusterAsyncInvoker(
        CreateClusterRequest request) {
        return new AsyncInvoker<CreateClusterRequest, CreateClusterResponse>(request, CloudTableMeta.createCluster,
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
     * @return CompletableFuture<DeleteClusterResponse>
     */
    public CompletableFuture<DeleteClusterResponse> deleteClusterAsync(DeleteClusterRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudTableMeta.deleteCluster);
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
     * @return AsyncInvoker<DeleteClusterRequest, DeleteClusterResponse>
     */
    public AsyncInvoker<DeleteClusterRequest, DeleteClusterResponse> deleteClusterAsyncInvoker(
        DeleteClusterRequest request) {
        return new AsyncInvoker<DeleteClusterRequest, DeleteClusterResponse>(request, CloudTableMeta.deleteCluster,
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
     * @return CompletableFuture<EnableComponentResponse>
     */
    public CompletableFuture<EnableComponentResponse> enableComponentAsync(EnableComponentRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudTableMeta.enableComponent);
    }

    /**
     * 开启opentsdb组件
     *
     * 开启opentsdb组件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param EnableComponentRequest 请求对象
     * @return AsyncInvoker<EnableComponentRequest, EnableComponentResponse>
     */
    public AsyncInvoker<EnableComponentRequest, EnableComponentResponse> enableComponentAsyncInvoker(
        EnableComponentRequest request) {
        return new AsyncInvoker<EnableComponentRequest, EnableComponentResponse>(request,
            CloudTableMeta.enableComponent, hcClient);
    }

    /**
     * 扩容组件
     *
     * 扩容指定类型的集群节点
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ExpandClusterComponentRequest 请求对象
     * @return CompletableFuture<ExpandClusterComponentResponse>
     */
    public CompletableFuture<ExpandClusterComponentResponse> expandClusterComponentAsync(
        ExpandClusterComponentRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudTableMeta.expandClusterComponent);
    }

    /**
     * 扩容组件
     *
     * 扩容指定类型的集群节点
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ExpandClusterComponentRequest 请求对象
     * @return AsyncInvoker<ExpandClusterComponentRequest, ExpandClusterComponentResponse>
     */
    public AsyncInvoker<ExpandClusterComponentRequest, ExpandClusterComponentResponse> expandClusterComponentAsyncInvoker(
        ExpandClusterComponentRequest request) {
        return new AsyncInvoker<ExpandClusterComponentRequest, ExpandClusterComponentResponse>(request,
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
     * @return CompletableFuture<ListClustersResponse>
     */
    public CompletableFuture<ListClustersResponse> listClustersAsync(ListClustersRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudTableMeta.listClusters);
    }

    /**
     * 查询CloudTable集群列表
     *
     * 查看用户创建的集群列表信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListClustersRequest 请求对象
     * @return AsyncInvoker<ListClustersRequest, ListClustersResponse>
     */
    public AsyncInvoker<ListClustersRequest, ListClustersResponse> listClustersAsyncInvoker(
        ListClustersRequest request) {
        return new AsyncInvoker<ListClustersRequest, ListClustersResponse>(request, CloudTableMeta.listClusters,
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
     * @return CompletableFuture<RebootCloudTableClusterResponse>
     */
    public CompletableFuture<RebootCloudTableClusterResponse> rebootCloudTableClusterAsync(
        RebootCloudTableClusterRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudTableMeta.rebootCloudTableCluster);
    }

    /**
     * 重启集群的api入口
     *
     * 重启集群的api入口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RebootCloudTableClusterRequest 请求对象
     * @return AsyncInvoker<RebootCloudTableClusterRequest, RebootCloudTableClusterResponse>
     */
    public AsyncInvoker<RebootCloudTableClusterRequest, RebootCloudTableClusterResponse> rebootCloudTableClusterAsyncInvoker(
        RebootCloudTableClusterRequest request) {
        return new AsyncInvoker<RebootCloudTableClusterRequest, RebootCloudTableClusterResponse>(request,
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
     * @return CompletableFuture<ShowClusterDetailResponse>
     */
    public CompletableFuture<ShowClusterDetailResponse> showClusterDetailAsync(ShowClusterDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudTableMeta.showClusterDetail);
    }

    /**
     * 查询CloudTable集群详情
     *
     * 通过集群ID唯一标识一个集群，根据集群ID查询特定CloudTable集群的详情信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowClusterDetailRequest 请求对象
     * @return AsyncInvoker<ShowClusterDetailRequest, ShowClusterDetailResponse>
     */
    public AsyncInvoker<ShowClusterDetailRequest, ShowClusterDetailResponse> showClusterDetailAsyncInvoker(
        ShowClusterDetailRequest request) {
        return new AsyncInvoker<ShowClusterDetailRequest, ShowClusterDetailResponse>(request,
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
     * @return CompletableFuture<ShowClusterSettingResponse>
     */
    public CompletableFuture<ShowClusterSettingResponse> showClusterSettingAsync(ShowClusterSettingRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudTableMeta.showClusterSetting);
    }

    /**
     * 查询集群配置
     *
     * 查询集群配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowClusterSettingRequest 请求对象
     * @return AsyncInvoker<ShowClusterSettingRequest, ShowClusterSettingResponse>
     */
    public AsyncInvoker<ShowClusterSettingRequest, ShowClusterSettingResponse> showClusterSettingAsyncInvoker(
        ShowClusterSettingRequest request) {
        return new AsyncInvoker<ShowClusterSettingRequest, ShowClusterSettingResponse>(request,
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
     * @return CompletableFuture<UpdateClusterSettingResponse>
     */
    public CompletableFuture<UpdateClusterSettingResponse> updateClusterSettingAsync(
        UpdateClusterSettingRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudTableMeta.updateClusterSetting);
    }

    /**
     * 修改集群配置
     *
     * 修改集群配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateClusterSettingRequest 请求对象
     * @return AsyncInvoker<UpdateClusterSettingRequest, UpdateClusterSettingResponse>
     */
    public AsyncInvoker<UpdateClusterSettingRequest, UpdateClusterSettingResponse> updateClusterSettingAsyncInvoker(
        UpdateClusterSettingRequest request) {
        return new AsyncInvoker<UpdateClusterSettingRequest, UpdateClusterSettingResponse>(request,
            CloudTableMeta.updateClusterSetting, hcClient);
    }

}
