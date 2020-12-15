package com.huaweicloud.sdk.cce.v3;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.cce.v3.model.*;

public class CceClient {
    protected HcClient hcClient;

    public CceClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<CceClient> newBuilder() {
        return new ClientBuilder<>(CceClient::new);
    }


    /**
     * 集群唤醒
     * 集群唤醒用于唤醒已休眠的集群，唤醒后，将继续收取控制节点资源费用。
     *
     * @param AwakeClusterRequest 请求对象
     * @return AwakeClusterResponse
     */
    public AwakeClusterResponse awakeCluster(AwakeClusterRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.awakeCluster);
    }

    /**
     * 创建AddonInstance
     * 根据提供的插件模板，安装插件实例。 &gt;插件管理的URL格式为：https://{clusterid}.Endpoint/uri。其中{clusterid}为集群ID，uri为资源路径，也即API访问的路径。 
     *
     * @param CreateAddonInstanceRequest 请求对象
     * @return CreateAddonInstanceResponse
     */
    public CreateAddonInstanceResponse createAddonInstance(CreateAddonInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.createAddonInstance);
    }

    /**
     * 创建PVC
     * 该API用于在指定的Namespace下通过云存储服务中的云存储（EVS、SFS、OBS）去创建PVC（PersistentVolumeClaim）。  &gt;存储管理的URL格式为：https://{clusterid}.Endpoint/uri。其中{clusterid}为集群ID，uri为资源路径，也即API访问的路径。如果使用https://Endpoint/uri，则必须指定请求header中的X-Cluster-ID参数。 
     *
     * @param CreateCloudPersistentVolumeClaimsRequest 请求对象
     * @return CreateCloudPersistentVolumeClaimsResponse
     */
    public CreateCloudPersistentVolumeClaimsResponse createCloudPersistentVolumeClaims(CreateCloudPersistentVolumeClaimsRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.createCloudPersistentVolumeClaims);
    }

    /**
     * 创建集群
     * 该API用于创建一个空集群（即只有控制节点Master，没有工作节点Node）。请在调用本接口完成集群创建之后，通过[创建节点](https://support.huaweicloud.com/api-cce/cce_02_0242.html)添加节点。   &gt;   - 集群管理的URL格式为：https://Endpoint/uri。其中uri为资源路径，也即API访问的路径。 &gt;   - 调用该接口创建集群时，默认不安装ICAgent。ICAgent是应用性能管理APM的采集代理，运行在应用所在的服务器上，用于实时采集探针所获取的数据，安装ICAgent是使用应用性能管理APM的前提。若需安装ICAgent，请参照[安装ICAgent](https://support.huaweicloud.com/usermanual-apm/apm_02_0013.html)。 &gt;   - 默认情况下，一个账户只能创建 5 个集群（每个Region下），如果您需要创建更多的集群，请[提交工单](https://console.huaweicloud.com/console/#/quota)申请增加配额。
     *
     * @param CreateClusterRequest 请求对象
     * @return CreateClusterResponse
     */
    public CreateClusterResponse createCluster(CreateClusterRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.createCluster);
    }

    /**
     * 获取集群证书
     * 该API用于获取指定集群的证书信息。
     *
     * @param CreateKubernetesClusterCertRequest 请求对象
     * @return CreateKubernetesClusterCertResponse
     */
    public CreateKubernetesClusterCertResponse createKubernetesClusterCert(CreateKubernetesClusterCertRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.createKubernetesClusterCert);
    }

    /**
     * 创建节点
     * 该API用于在指定集群下创建节点。 &gt; 若无集群，请先[创建集群](https://support.huaweicloud.com/api-cce/cce_02_0236.html)。 &gt; 集群管理的URL格式为：https://Endpoint/uri。其中uri为资源路径，也即API访问的路径。
     *
     * @param CreateNodeRequest 请求对象
     * @return CreateNodeResponse
     */
    public CreateNodeResponse createNode(CreateNodeRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.createNode);
    }

    /**
     * 创建节点池
     * 该API用于在指定集群下创建节点池。仅支持集群在处于可用、扩容、缩容状态时调用。 &gt; 若无集群，请先[创建集群](https://support.huaweicloud.com/api-cce/cce_02_0236.html)。 &gt; 集群管理的URL格式为：https://Endpoint/uri。其中uri为资源路径，也即API访问的路径 
     *
     * @param CreateNodePoolRequest 请求对象
     * @return CreateNodePoolResponse
     */
    public CreateNodePoolResponse createNodePool(CreateNodePoolRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.createNodePool);
    }

    /**
     * 删除AddonInstance
     * 删除插件实例的功能。 &gt;插件管理的URL格式为：https://{clusterid}.Endpoint/uri。其中{clusterid}为集群ID，uri为资源路径，也即API访问的路径。 
     *
     * @param DeleteAddonInstanceRequest 请求对象
     * @return DeleteAddonInstanceResponse
     */
    public DeleteAddonInstanceResponse deleteAddonInstance(DeleteAddonInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.deleteAddonInstance);
    }

    /**
     * 删除PVC
     * 该API用于删除指定Namespace下的PVC（PersistentVolumeClaim）对象，并可以选择保留后端的云存储。 &gt;存储管理的URL格式为：https://{clusterid}.Endpoint/uri。其中{clusterid}为集群ID，uri为资源路径，也即API访问的路径。如果使用https://Endpoint/uri，则必须指定请求header中的X-Cluster-ID参数。 
     *
     * @param DeleteCloudPersistentVolumeClaimsRequest 请求对象
     * @return DeleteCloudPersistentVolumeClaimsResponse
     */
    public DeleteCloudPersistentVolumeClaimsResponse deleteCloudPersistentVolumeClaims(DeleteCloudPersistentVolumeClaimsRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.deleteCloudPersistentVolumeClaims);
    }

    /**
     * 删除集群
     * 该API用于删除一个指定的集群。 &gt; 集群管理的URL格式为：https://Endpoint/uri。其中uri为资源路径，也即API访问的路径。
     *
     * @param DeleteClusterRequest 请求对象
     * @return DeleteClusterResponse
     */
    public DeleteClusterResponse deleteCluster(DeleteClusterRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.deleteCluster);
    }

    /**
     * 删除节点
     * 该API用于删除指定的节点。 &gt; - 集群管理的URL格式为：https://Endpoint/uri。其中uri为资源路径，也即API访问的路径 
     *
     * @param DeleteNodeRequest 请求对象
     * @return DeleteNodeResponse
     */
    public DeleteNodeResponse deleteNode(DeleteNodeRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.deleteNode);
    }

    /**
     * 删除节点池
     * 该API用于删除指定的节点池。 &gt; 集群管理的URL格式为：https://Endpoint/uri。其中uri为资源路径，也即API访问的路径 
     *
     * @param DeleteNodePoolRequest 请求对象
     * @return DeleteNodePoolResponse
     */
    public DeleteNodePoolResponse deleteNodePool(DeleteNodePoolRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.deleteNodePool);
    }

    /**
     * 集群休眠
     * 1、集群休眠后，将无法在此集群上创建和管理工作负载等资源。  2、按需付费集群休眠后，将暂停收取控制节点资源费用，集群所属的节点、绑定的弹性IP、带宽等资源按各自的计费方式（“包年/包月”或“按需付费”）进行收费。
     *
     * @param HibernateClusterRequest 请求对象
     * @return HibernateClusterResponse
     */
    public HibernateClusterResponse hibernateCluster(HibernateClusterRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.hibernateCluster);
    }

    /**
     * 获取AddonInstance列表
     * 获取集群所有已安装插件实例 &gt;插件管理的URL格式为：https://{clusterid}.Endpoint/uri。其中{clusterid}为集群ID，uri为资源路径，也即API访问的路径。 
     *
     * @param ListAddonInstancesRequest 请求对象
     * @return ListAddonInstancesResponse
     */
    public ListAddonInstancesResponse listAddonInstances(ListAddonInstancesRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.listAddonInstances);
    }

    /**
     * 查询AddonTemplates列表
     * 插件模板查询接口，查询插件信息。 &gt;插件管理的URL格式为：https://{clusterid}.Endpoint/uri。其中{clusterid}为集群ID，uri为资源路径，也即API访问的路径。 
     *
     * @param ListAddonTemplatesRequest 请求对象
     * @return ListAddonTemplatesResponse
     */
    public ListAddonTemplatesResponse listAddonTemplates(ListAddonTemplatesRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.listAddonTemplates);
    }

    /**
     * 获取指定项目下的集群
     * 该API用于获取指定项目下所有集群的详细信息。
     *
     * @param ListClustersRequest 请求对象
     * @return ListClustersResponse
     */
    public ListClustersResponse listClusters(ListClustersRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.listClusters);
    }

    /**
     * 获取集群下所有节点池
     * 该API用于获取集群下所有节点池。 &gt; - 集群管理的URL格式为：https://Endpoint/uri。其中uri为资源路径，也即API访问的路径 &gt; - nodepool是集群中具有相同配置的节点实例的子集。 
     *
     * @param ListNodePoolsRequest 请求对象
     * @return ListNodePoolsResponse
     */
    public ListNodePoolsResponse listNodePools(ListNodePoolsRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.listNodePools);
    }

    /**
     * 获取集群下所有节点
     * 该API用于通过集群ID获取指定集群下所有节点的详细信息。 &gt; 集群管理的URL格式为：https://Endpoint/uri。其中uri为资源路径，也即API访问的路径。
     *
     * @param ListNodesRequest 请求对象
     * @return ListNodesResponse
     */
    public ListNodesResponse listNodes(ListNodesRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.listNodes);
    }

    /**
     * 获取AddonInstance详情
     * 获取插件实例详情。 &gt;插件管理的URL格式为：https://{clusterid}.Endpoint/uri。其中{clusterid}为集群ID，uri为资源路径，也即API访问的路径。 
     *
     * @param ShowAddonInstanceRequest 请求对象
     * @return ShowAddonInstanceResponse
     */
    public ShowAddonInstanceResponse showAddonInstance(ShowAddonInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.showAddonInstance);
    }

    /**
     * 获取指定的集群
     * 该API用于获取指定集群的详细信息。 &gt; 集群管理的URL格式为：https://Endpoint/uri。其中uri为资源路径，也即API访问的路径。
     *
     * @param ShowClusterRequest 请求对象
     * @return ShowClusterResponse
     */
    public ShowClusterResponse showCluster(ShowClusterRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.showCluster);
    }

    /**
     * 获取任务信息
     * 该API用于获取任务信息。通过某一任务请求下发后返回的jobID来查询指定任务的进度。 &gt; - 集群管理的URL格式为：https://Endpoint/uri。其中uri为资源路径，也即API访问的路径 &gt; - 该接口通常使用场景为： &gt;   - 创建、删除集群时，查询相应任务的进度。 &gt;   - 创建、删除节点时，查询相应任务的进度。 
     *
     * @param ShowJobRequest 请求对象
     * @return ShowJobResponse
     */
    public ShowJobResponse showJob(ShowJobRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.showJob);
    }

    /**
     * 获取指定的节点
     * 该API用于通过节点ID获取指定节点的详细信息。 &gt; 集群管理的URL格式为：https://Endpoint/uri。其中uri为资源路径，也即API访问的路径。
     *
     * @param ShowNodeRequest 请求对象
     * @return ShowNodeResponse
     */
    public ShowNodeResponse showNode(ShowNodeRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.showNode);
    }

    /**
     * 获取指定的节点池
     * 该API用于获取指定节点池的详细信息。 &gt; 集群管理的URL格式为：https://Endpoint/uri。其中uri为资源路径，也即API访问的路径 
     *
     * @param ShowNodePoolRequest 请求对象
     * @return ShowNodePoolResponse
     */
    public ShowNodePoolResponse showNodePool(ShowNodePoolRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.showNodePool);
    }

    /**
     * 更新AddonInstance
     * 更新插件实例的功能。 &gt;插件管理的URL格式为：https://{clusterid}.Endpoint/uri。其中{clusterid}为集群ID，uri为资源路径，也即API访问的路径。 
     *
     * @param UpdateAddonInstanceRequest 请求对象
     * @return UpdateAddonInstanceResponse
     */
    public UpdateAddonInstanceResponse updateAddonInstance(UpdateAddonInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.updateAddonInstance);
    }

    /**
     * 更新指定的集群
     * 该API用于更新指定的集群。 &gt; 集群管理的URL格式为：https://Endpoint/uri。其中uri为资源路径，也即API访问的路径。
     *
     * @param UpdateClusterRequest 请求对象
     * @return UpdateClusterResponse
     */
    public UpdateClusterResponse updateCluster(UpdateClusterRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.updateCluster);
    }

    /**
     * 更新指定的节点
     * 该API用于更新指定的节点。 &gt; - 当前仅支持更新metadata下的name字段，即节点的名字。 &gt; - 集群管理的URL格式为：https://Endpoint/uri。其中uri为资源路径，也即API访问的路径。 
     *
     * @param UpdateNodeRequest 请求对象
     * @return UpdateNodeResponse
     */
    public UpdateNodeResponse updateNode(UpdateNodeRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.updateNode);
    }

    /**
     * 更新指定节点池
     * 该API用于更新指定的节点池。仅支持集群在处于可用、扩容、缩容状态时调用。 &gt; - 集群管理的URL格式为：https://Endpoint/uri。其中uri为资源路径，也即API访问的路径 &gt; - 当前仅支持更新节点池名称，spec下的initialNodeCount，k8sTags， taints，login，userTags与节点池的扩缩容配置相关字段。
     *
     * @param UpdateNodePoolRequest 请求对象
     * @return UpdateNodePoolResponse
     */
    public UpdateNodePoolResponse updateNodePool(UpdateNodePoolRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.updateNodePool);
    }

}