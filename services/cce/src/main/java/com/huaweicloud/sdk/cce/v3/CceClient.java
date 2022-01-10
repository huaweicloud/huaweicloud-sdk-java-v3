package com.huaweicloud.sdk.cce.v3;

import com.huaweicloud.sdk.cce.v3.model.*;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;

public class CceClient {

    protected HcClient hcClient;

    public CceClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<CceClient> newBuilder() {
        return new ClientBuilder<>(CceClient::new);
    }

    /** 纳管节点 该API用于在指定集群下纳管节点。 &gt;集群管理的URL格式为：https://Endpoint/uri。其中uri为资源路径，也即API访问的路径。
     *
     * @param AddNodeRequest 请求对象
     * @return AddNodeResponse */
    public AddNodeResponse addNode(AddNodeRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.addNode);
    }

    /** 纳管节点 该API用于在指定集群下纳管节点。 &gt;集群管理的URL格式为：https://Endpoint/uri。其中uri为资源路径，也即API访问的路径。
     *
     * @param AddNodeRequest 请求对象
     * @return SyncInvoker<AddNodeRequest, AddNodeResponse> */
    public SyncInvoker<AddNodeRequest, AddNodeResponse> addNodeInvoker(AddNodeRequest request) {
        return new SyncInvoker<AddNodeRequest, AddNodeResponse>(request, CceMeta.addNode, hcClient);
    }

    /** 集群唤醒 集群唤醒用于唤醒已休眠的集群，唤醒后，将继续收取控制节点资源费用。
     *
     * @param AwakeClusterRequest 请求对象
     * @return AwakeClusterResponse */
    public AwakeClusterResponse awakeCluster(AwakeClusterRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.awakeCluster);
    }

    /** 集群唤醒 集群唤醒用于唤醒已休眠的集群，唤醒后，将继续收取控制节点资源费用。
     *
     * @param AwakeClusterRequest 请求对象
     * @return SyncInvoker<AwakeClusterRequest, AwakeClusterResponse> */
    public SyncInvoker<AwakeClusterRequest, AwakeClusterResponse> awakeClusterInvoker(AwakeClusterRequest request) {
        return new SyncInvoker<AwakeClusterRequest, AwakeClusterResponse>(request, CceMeta.awakeCluster, hcClient);
    }

    /** 创建AddonInstance 根据提供的插件模板，安装插件实例。
     *
     * @param CreateAddonInstanceRequest 请求对象
     * @return CreateAddonInstanceResponse */
    public CreateAddonInstanceResponse createAddonInstance(CreateAddonInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.createAddonInstance);
    }

    /** 创建AddonInstance 根据提供的插件模板，安装插件实例。
     *
     * @param CreateAddonInstanceRequest 请求对象
     * @return SyncInvoker<CreateAddonInstanceRequest, CreateAddonInstanceResponse> */
    public SyncInvoker<CreateAddonInstanceRequest, CreateAddonInstanceResponse> createAddonInstanceInvoker(
        CreateAddonInstanceRequest request) {
        return new SyncInvoker<CreateAddonInstanceRequest, CreateAddonInstanceResponse>(request,
            CceMeta.createAddonInstance, hcClient);
    }

    /** 创建PVC 该API用于在指定的Namespace下通过云存储服务中的云存储（EVS、SFS、OBS）去创建PVC（PersistentVolumeClaim）。
     * &gt;存储管理的URL格式为：https://{clusterid}.Endpoint/uri。其中{clusterid}为集群ID，uri为资源路径，也即API访问的路径。如果使用https://Endpoint/uri，则必须指定请求header中的X-Cluster-ID参数。
     *
     * @param CreateCloudPersistentVolumeClaimsRequest 请求对象
     * @return CreateCloudPersistentVolumeClaimsResponse */
    public CreateCloudPersistentVolumeClaimsResponse createCloudPersistentVolumeClaims(
        CreateCloudPersistentVolumeClaimsRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.createCloudPersistentVolumeClaims);
    }

    /** 创建PVC 该API用于在指定的Namespace下通过云存储服务中的云存储（EVS、SFS、OBS）去创建PVC（PersistentVolumeClaim）。
     * &gt;存储管理的URL格式为：https://{clusterid}.Endpoint/uri。其中{clusterid}为集群ID，uri为资源路径，也即API访问的路径。如果使用https://Endpoint/uri，则必须指定请求header中的X-Cluster-ID参数。
     *
     * @param CreateCloudPersistentVolumeClaimsRequest 请求对象
     * @return SyncInvoker<CreateCloudPersistentVolumeClaimsRequest, CreateCloudPersistentVolumeClaimsResponse> */
    public SyncInvoker<CreateCloudPersistentVolumeClaimsRequest, CreateCloudPersistentVolumeClaimsResponse> createCloudPersistentVolumeClaimsInvoker(
        CreateCloudPersistentVolumeClaimsRequest request) {
        return new SyncInvoker<CreateCloudPersistentVolumeClaimsRequest, CreateCloudPersistentVolumeClaimsResponse>(
            request, CceMeta.createCloudPersistentVolumeClaims, hcClient);
    }

    /** 创建集群
     * 该API用于创建一个空集群（即只有控制节点Master，没有工作节点Node）。请在调用本接口完成集群创建之后，通过[[创建节点](https://support.huaweicloud.com/api-cce/cce_02_0242.html)](tag:hws)[[创建节点](https://support.huaweicloud.com/intl/zh-cn/api-cce/cce_02_0242.html)](tag:hws_hk)添加节点。
     * &gt; - 集群管理的URL格式为：https://Endpoint/uri。其中uri为资源路径，也即API访问的路径。 &gt; -
     * 调用该接口创建集群时，默认不安装ICAgent。ICAgent是应用性能管理APM的采集代理，运行在应用所在的服务器上，用于实时采集探针所获取的数据，安装ICAgent是使用应用性能管理APM的前提。若需安装ICAgent，请参照[[安装ICAgent](https://support.huaweicloud.com/usermanual-apm/apm_02_0013.html)](tag:hws)[[安装ICAgent](https://support.huaweicloud.com/intl/zh-cn/usermanual-apm/apm_02_0013.html)](tag:hws_hk)。
     * &gt; -
     * 默认情况下，一个帐户只能创建5个集群（每个Region下），如果您需要创建更多的集群，请[[提交工单](https://console.huaweicloud.com/console/#/quota)](tag:hws)[[提交工单](https://console-intl.huaweicloud.com/console/?locale&#x3D;zh-cn#/quota)](tag:hws_hk)申请增加配额。
     *
     * @param CreateClusterRequest 请求对象
     * @return CreateClusterResponse */
    public CreateClusterResponse createCluster(CreateClusterRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.createCluster);
    }

    /** 创建集群
     * 该API用于创建一个空集群（即只有控制节点Master，没有工作节点Node）。请在调用本接口完成集群创建之后，通过[[创建节点](https://support.huaweicloud.com/api-cce/cce_02_0242.html)](tag:hws)[[创建节点](https://support.huaweicloud.com/intl/zh-cn/api-cce/cce_02_0242.html)](tag:hws_hk)添加节点。
     * &gt; - 集群管理的URL格式为：https://Endpoint/uri。其中uri为资源路径，也即API访问的路径。 &gt; -
     * 调用该接口创建集群时，默认不安装ICAgent。ICAgent是应用性能管理APM的采集代理，运行在应用所在的服务器上，用于实时采集探针所获取的数据，安装ICAgent是使用应用性能管理APM的前提。若需安装ICAgent，请参照[[安装ICAgent](https://support.huaweicloud.com/usermanual-apm/apm_02_0013.html)](tag:hws)[[安装ICAgent](https://support.huaweicloud.com/intl/zh-cn/usermanual-apm/apm_02_0013.html)](tag:hws_hk)。
     * &gt; -
     * 默认情况下，一个帐户只能创建5个集群（每个Region下），如果您需要创建更多的集群，请[[提交工单](https://console.huaweicloud.com/console/#/quota)](tag:hws)[[提交工单](https://console-intl.huaweicloud.com/console/?locale&#x3D;zh-cn#/quota)](tag:hws_hk)申请增加配额。
     *
     * @param CreateClusterRequest 请求对象
     * @return SyncInvoker<CreateClusterRequest, CreateClusterResponse> */
    public SyncInvoker<CreateClusterRequest, CreateClusterResponse> createClusterInvoker(CreateClusterRequest request) {
        return new SyncInvoker<CreateClusterRequest, CreateClusterResponse>(request, CceMeta.createCluster, hcClient);
    }

    /** 获取集群证书 该API用于获取指定集群的证书信息。
     *
     * @param CreateKubernetesClusterCertRequest 请求对象
     * @return CreateKubernetesClusterCertResponse */
    public CreateKubernetesClusterCertResponse createKubernetesClusterCert(CreateKubernetesClusterCertRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.createKubernetesClusterCert);
    }

    /** 获取集群证书 该API用于获取指定集群的证书信息。
     *
     * @param CreateKubernetesClusterCertRequest 请求对象
     * @return SyncInvoker<CreateKubernetesClusterCertRequest, CreateKubernetesClusterCertResponse> */
    public SyncInvoker<CreateKubernetesClusterCertRequest, CreateKubernetesClusterCertResponse> createKubernetesClusterCertInvoker(
        CreateKubernetesClusterCertRequest request) {
        return new SyncInvoker<CreateKubernetesClusterCertRequest, CreateKubernetesClusterCertResponse>(request,
            CceMeta.createKubernetesClusterCert, hcClient);
    }

    /** 创建节点 该API用于在指定集群下创建节点。 &gt; -
     * 若无集群，请先[[创建集群](https://support.huaweicloud.com/api-cce/cce_02_0236.html)](tag:hws)[[创建集群](https://support.huaweicloud.com/intl/zh-cn/api-cce/cce_02_0236.html)](tag:hws_hk)。
     * &gt; - 集群管理的URL格式为：https://Endpoint/uri。其中uri为资源路径，也即API访问的路径。
     *
     * @param CreateNodeRequest 请求对象
     * @return CreateNodeResponse */
    public CreateNodeResponse createNode(CreateNodeRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.createNode);
    }

    /** 创建节点 该API用于在指定集群下创建节点。 &gt; -
     * 若无集群，请先[[创建集群](https://support.huaweicloud.com/api-cce/cce_02_0236.html)](tag:hws)[[创建集群](https://support.huaweicloud.com/intl/zh-cn/api-cce/cce_02_0236.html)](tag:hws_hk)。
     * &gt; - 集群管理的URL格式为：https://Endpoint/uri。其中uri为资源路径，也即API访问的路径。
     *
     * @param CreateNodeRequest 请求对象
     * @return SyncInvoker<CreateNodeRequest, CreateNodeResponse> */
    public SyncInvoker<CreateNodeRequest, CreateNodeResponse> createNodeInvoker(CreateNodeRequest request) {
        return new SyncInvoker<CreateNodeRequest, CreateNodeResponse>(request, CceMeta.createNode, hcClient);
    }

    /** 创建节点池
     * 该API用于在指定集群下创建节点池。仅支持集群在处于可用、扩容、缩容状态时调用。1.21版本的集群创建节点池时支持绑定安全组，每个节点池最多绑定五个安全组。更新节点池的安全组后，只针对新创的pod生效，建议驱逐节点上原有的pod。
     * &gt;
     * 若无集群，请先[[创建集群](https://support.huaweicloud.com/api-cce/cce_02_0236.html)](tag:hws)[[创建集群](https://support.huaweicloud.com/intl/zh-cn/api-cce/cce_02_0236.html)](tag:hws_hk)。
     * &gt; 集群管理的URL格式为：https://Endpoint/uri。其中uri为资源路径，也即API访问的路径
     *
     * @param CreateNodePoolRequest 请求对象
     * @return CreateNodePoolResponse */
    public CreateNodePoolResponse createNodePool(CreateNodePoolRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.createNodePool);
    }

    /** 创建节点池
     * 该API用于在指定集群下创建节点池。仅支持集群在处于可用、扩容、缩容状态时调用。1.21版本的集群创建节点池时支持绑定安全组，每个节点池最多绑定五个安全组。更新节点池的安全组后，只针对新创的pod生效，建议驱逐节点上原有的pod。
     * &gt;
     * 若无集群，请先[[创建集群](https://support.huaweicloud.com/api-cce/cce_02_0236.html)](tag:hws)[[创建集群](https://support.huaweicloud.com/intl/zh-cn/api-cce/cce_02_0236.html)](tag:hws_hk)。
     * &gt; 集群管理的URL格式为：https://Endpoint/uri。其中uri为资源路径，也即API访问的路径
     *
     * @param CreateNodePoolRequest 请求对象
     * @return SyncInvoker<CreateNodePoolRequest, CreateNodePoolResponse> */
    public SyncInvoker<CreateNodePoolRequest, CreateNodePoolResponse> createNodePoolInvoker(
        CreateNodePoolRequest request) {
        return new SyncInvoker<CreateNodePoolRequest, CreateNodePoolResponse>(request, CceMeta.createNodePool,
            hcClient);
    }

    /** 删除AddonInstance 删除插件实例的功能。
     *
     * @param DeleteAddonInstanceRequest 请求对象
     * @return DeleteAddonInstanceResponse */
    public DeleteAddonInstanceResponse deleteAddonInstance(DeleteAddonInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.deleteAddonInstance);
    }

    /** 删除AddonInstance 删除插件实例的功能。
     *
     * @param DeleteAddonInstanceRequest 请求对象
     * @return SyncInvoker<DeleteAddonInstanceRequest, DeleteAddonInstanceResponse> */
    public SyncInvoker<DeleteAddonInstanceRequest, DeleteAddonInstanceResponse> deleteAddonInstanceInvoker(
        DeleteAddonInstanceRequest request) {
        return new SyncInvoker<DeleteAddonInstanceRequest, DeleteAddonInstanceResponse>(request,
            CceMeta.deleteAddonInstance, hcClient);
    }

    /** 删除PVC 该API用于删除指定Namespace下的PVC（PersistentVolumeClaim）对象，并可以选择保留后端的云存储。
     * &gt;存储管理的URL格式为：https://{clusterid}.Endpoint/uri。其中{clusterid}为集群ID，uri为资源路径，也即API访问的路径。如果使用https://Endpoint/uri，则必须指定请求header中的X-Cluster-ID参数。
     *
     * @param DeleteCloudPersistentVolumeClaimsRequest 请求对象
     * @return DeleteCloudPersistentVolumeClaimsResponse */
    public DeleteCloudPersistentVolumeClaimsResponse deleteCloudPersistentVolumeClaims(
        DeleteCloudPersistentVolumeClaimsRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.deleteCloudPersistentVolumeClaims);
    }

    /** 删除PVC 该API用于删除指定Namespace下的PVC（PersistentVolumeClaim）对象，并可以选择保留后端的云存储。
     * &gt;存储管理的URL格式为：https://{clusterid}.Endpoint/uri。其中{clusterid}为集群ID，uri为资源路径，也即API访问的路径。如果使用https://Endpoint/uri，则必须指定请求header中的X-Cluster-ID参数。
     *
     * @param DeleteCloudPersistentVolumeClaimsRequest 请求对象
     * @return SyncInvoker<DeleteCloudPersistentVolumeClaimsRequest, DeleteCloudPersistentVolumeClaimsResponse> */
    public SyncInvoker<DeleteCloudPersistentVolumeClaimsRequest, DeleteCloudPersistentVolumeClaimsResponse> deleteCloudPersistentVolumeClaimsInvoker(
        DeleteCloudPersistentVolumeClaimsRequest request) {
        return new SyncInvoker<DeleteCloudPersistentVolumeClaimsRequest, DeleteCloudPersistentVolumeClaimsResponse>(
            request, CceMeta.deleteCloudPersistentVolumeClaims, hcClient);
    }

    /** 删除集群 该API用于删除一个指定的集群。 &gt;集群管理的URL格式为：https://Endpoint/uri。其中uri为资源路径，也即API访问的路径。
     *
     * @param DeleteClusterRequest 请求对象
     * @return DeleteClusterResponse */
    public DeleteClusterResponse deleteCluster(DeleteClusterRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.deleteCluster);
    }

    /** 删除集群 该API用于删除一个指定的集群。 &gt;集群管理的URL格式为：https://Endpoint/uri。其中uri为资源路径，也即API访问的路径。
     *
     * @param DeleteClusterRequest 请求对象
     * @return SyncInvoker<DeleteClusterRequest, DeleteClusterResponse> */
    public SyncInvoker<DeleteClusterRequest, DeleteClusterResponse> deleteClusterInvoker(DeleteClusterRequest request) {
        return new SyncInvoker<DeleteClusterRequest, DeleteClusterResponse>(request, CceMeta.deleteCluster, hcClient);
    }

    /** 删除节点 该API用于删除指定的节点。 &gt;集群管理的URL格式为：https://Endpoint/uri。其中uri为资源路径，也即API访问的路径
     *
     * @param DeleteNodeRequest 请求对象
     * @return DeleteNodeResponse */
    public DeleteNodeResponse deleteNode(DeleteNodeRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.deleteNode);
    }

    /** 删除节点 该API用于删除指定的节点。 &gt;集群管理的URL格式为：https://Endpoint/uri。其中uri为资源路径，也即API访问的路径
     *
     * @param DeleteNodeRequest 请求对象
     * @return SyncInvoker<DeleteNodeRequest, DeleteNodeResponse> */
    public SyncInvoker<DeleteNodeRequest, DeleteNodeResponse> deleteNodeInvoker(DeleteNodeRequest request) {
        return new SyncInvoker<DeleteNodeRequest, DeleteNodeResponse>(request, CceMeta.deleteNode, hcClient);
    }

    /** 删除节点池 该API用于删除指定的节点池。 &gt; 集群管理的URL格式为：https://Endpoint/uri。其中uri为资源路径，也即API访问的路径
     *
     * @param DeleteNodePoolRequest 请求对象
     * @return DeleteNodePoolResponse */
    public DeleteNodePoolResponse deleteNodePool(DeleteNodePoolRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.deleteNodePool);
    }

    /** 删除节点池 该API用于删除指定的节点池。 &gt; 集群管理的URL格式为：https://Endpoint/uri。其中uri为资源路径，也即API访问的路径
     *
     * @param DeleteNodePoolRequest 请求对象
     * @return SyncInvoker<DeleteNodePoolRequest, DeleteNodePoolResponse> */
    public SyncInvoker<DeleteNodePoolRequest, DeleteNodePoolResponse> deleteNodePoolInvoker(
        DeleteNodePoolRequest request) {
        return new SyncInvoker<DeleteNodePoolRequest, DeleteNodePoolResponse>(request, CceMeta.deleteNodePool,
            hcClient);
    }

    /** 集群休眠 集群休眠用于将运行中的集群置于休眠状态，休眠后，将不再收取控制节点资源费用。
     *
     * @param HibernateClusterRequest 请求对象
     * @return HibernateClusterResponse */
    public HibernateClusterResponse hibernateCluster(HibernateClusterRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.hibernateCluster);
    }

    /** 集群休眠 集群休眠用于将运行中的集群置于休眠状态，休眠后，将不再收取控制节点资源费用。
     *
     * @param HibernateClusterRequest 请求对象
     * @return SyncInvoker<HibernateClusterRequest, HibernateClusterResponse> */
    public SyncInvoker<HibernateClusterRequest, HibernateClusterResponse> hibernateClusterInvoker(
        HibernateClusterRequest request) {
        return new SyncInvoker<HibernateClusterRequest, HibernateClusterResponse>(request, CceMeta.hibernateCluster,
            hcClient);
    }

    /** 获取AddonInstance列表 获取集群所有已安装插件实例
     *
     * @param ListAddonInstancesRequest 请求对象
     * @return ListAddonInstancesResponse */
    public ListAddonInstancesResponse listAddonInstances(ListAddonInstancesRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.listAddonInstances);
    }

    /** 获取AddonInstance列表 获取集群所有已安装插件实例
     *
     * @param ListAddonInstancesRequest 请求对象
     * @return SyncInvoker<ListAddonInstancesRequest, ListAddonInstancesResponse> */
    public SyncInvoker<ListAddonInstancesRequest, ListAddonInstancesResponse> listAddonInstancesInvoker(
        ListAddonInstancesRequest request) {
        return new SyncInvoker<ListAddonInstancesRequest, ListAddonInstancesResponse>(request,
            CceMeta.listAddonInstances, hcClient);
    }

    /** 查询AddonTemplates列表 插件模板查询接口，查询插件信息。
     *
     * @param ListAddonTemplatesRequest 请求对象
     * @return ListAddonTemplatesResponse */
    public ListAddonTemplatesResponse listAddonTemplates(ListAddonTemplatesRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.listAddonTemplates);
    }

    /** 查询AddonTemplates列表 插件模板查询接口，查询插件信息。
     *
     * @param ListAddonTemplatesRequest 请求对象
     * @return SyncInvoker<ListAddonTemplatesRequest, ListAddonTemplatesResponse> */
    public SyncInvoker<ListAddonTemplatesRequest, ListAddonTemplatesResponse> listAddonTemplatesInvoker(
        ListAddonTemplatesRequest request) {
        return new SyncInvoker<ListAddonTemplatesRequest, ListAddonTemplatesResponse>(request,
            CceMeta.listAddonTemplates, hcClient);
    }

    /** 获取指定项目下的集群 该API用于获取指定项目下所有集群的详细信息。
     *
     * @param ListClustersRequest 请求对象
     * @return ListClustersResponse */
    public ListClustersResponse listClusters(ListClustersRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.listClusters);
    }

    /** 获取指定项目下的集群 该API用于获取指定项目下所有集群的详细信息。
     *
     * @param ListClustersRequest 请求对象
     * @return SyncInvoker<ListClustersRequest, ListClustersResponse> */
    public SyncInvoker<ListClustersRequest, ListClustersResponse> listClustersInvoker(ListClustersRequest request) {
        return new SyncInvoker<ListClustersRequest, ListClustersResponse>(request, CceMeta.listClusters, hcClient);
    }

    /** 获取集群下所有节点池 该API用于获取集群下所有节点池。 &gt; - 集群管理的URL格式为：https://Endpoint/uri。其中uri为资源路径，也即API访问的路径 &gt; -
     * nodepool是集群中具有相同配置的节点实例的子集。
     *
     * @param ListNodePoolsRequest 请求对象
     * @return ListNodePoolsResponse */
    public ListNodePoolsResponse listNodePools(ListNodePoolsRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.listNodePools);
    }

    /** 获取集群下所有节点池 该API用于获取集群下所有节点池。 &gt; - 集群管理的URL格式为：https://Endpoint/uri。其中uri为资源路径，也即API访问的路径 &gt; -
     * nodepool是集群中具有相同配置的节点实例的子集。
     *
     * @param ListNodePoolsRequest 请求对象
     * @return SyncInvoker<ListNodePoolsRequest, ListNodePoolsResponse> */
    public SyncInvoker<ListNodePoolsRequest, ListNodePoolsResponse> listNodePoolsInvoker(ListNodePoolsRequest request) {
        return new SyncInvoker<ListNodePoolsRequest, ListNodePoolsResponse>(request, CceMeta.listNodePools, hcClient);
    }

    /** 获取集群下所有节点 该API用于通过集群ID获取指定集群下所有节点的详细信息。 &gt;集群管理的URL格式为：https://Endpoint/uri。其中uri为资源路径，也即API访问的路径。
     *
     * @param ListNodesRequest 请求对象
     * @return ListNodesResponse */
    public ListNodesResponse listNodes(ListNodesRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.listNodes);
    }

    /** 获取集群下所有节点 该API用于通过集群ID获取指定集群下所有节点的详细信息。 &gt;集群管理的URL格式为：https://Endpoint/uri。其中uri为资源路径，也即API访问的路径。
     *
     * @param ListNodesRequest 请求对象
     * @return SyncInvoker<ListNodesRequest, ListNodesResponse> */
    public SyncInvoker<ListNodesRequest, ListNodesResponse> listNodesInvoker(ListNodesRequest request) {
        return new SyncInvoker<ListNodesRequest, ListNodesResponse>(request, CceMeta.listNodes, hcClient);
    }

    /** 节点迁移 该API用于在指定集群下迁移节点到另一集群。 &gt;集群管理的URL格式为：https://Endpoint/uri。其中uri为资源路径，也即API访问的路径。
     *
     * @param MigrateNodeRequest 请求对象
     * @return MigrateNodeResponse */
    public MigrateNodeResponse migrateNode(MigrateNodeRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.migrateNode);
    }

    /** 节点迁移 该API用于在指定集群下迁移节点到另一集群。 &gt;集群管理的URL格式为：https://Endpoint/uri。其中uri为资源路径，也即API访问的路径。
     *
     * @param MigrateNodeRequest 请求对象
     * @return SyncInvoker<MigrateNodeRequest, MigrateNodeResponse> */
    public SyncInvoker<MigrateNodeRequest, MigrateNodeResponse> migrateNodeInvoker(MigrateNodeRequest request) {
        return new SyncInvoker<MigrateNodeRequest, MigrateNodeResponse>(request, CceMeta.migrateNode, hcClient);
    }

    /** 节点移除 该API用于在指定集群下移除节点。 &gt;集群管理的URL格式为：https://Endpoint/uri。其中uri为资源路径，也即API访问的路径。
     *
     * @param RemoveNodeRequest 请求对象
     * @return RemoveNodeResponse */
    public RemoveNodeResponse removeNode(RemoveNodeRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.removeNode);
    }

    /** 节点移除 该API用于在指定集群下移除节点。 &gt;集群管理的URL格式为：https://Endpoint/uri。其中uri为资源路径，也即API访问的路径。
     *
     * @param RemoveNodeRequest 请求对象
     * @return SyncInvoker<RemoveNodeRequest, RemoveNodeResponse> */
    public SyncInvoker<RemoveNodeRequest, RemoveNodeResponse> removeNodeInvoker(RemoveNodeRequest request) {
        return new SyncInvoker<RemoveNodeRequest, RemoveNodeResponse>(request, CceMeta.removeNode, hcClient);
    }

    /** 重置节点 该API用于在指定集群下重置节点。 &gt;集群管理的URL格式为：https://Endpoint/uri。其中uri为资源路径，也即API访问的路径。
     *
     * @param ResetNodeRequest 请求对象
     * @return ResetNodeResponse */
    public ResetNodeResponse resetNode(ResetNodeRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.resetNode);
    }

    /** 重置节点 该API用于在指定集群下重置节点。 &gt;集群管理的URL格式为：https://Endpoint/uri。其中uri为资源路径，也即API访问的路径。
     *
     * @param ResetNodeRequest 请求对象
     * @return SyncInvoker<ResetNodeRequest, ResetNodeResponse> */
    public SyncInvoker<ResetNodeRequest, ResetNodeResponse> resetNodeInvoker(ResetNodeRequest request) {
        return new SyncInvoker<ResetNodeRequest, ResetNodeResponse>(request, CceMeta.resetNode, hcClient);
    }

    /** 获取AddonInstance详情 获取插件实例详情。
     *
     * @param ShowAddonInstanceRequest 请求对象
     * @return ShowAddonInstanceResponse */
    public ShowAddonInstanceResponse showAddonInstance(ShowAddonInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.showAddonInstance);
    }

    /** 获取AddonInstance详情 获取插件实例详情。
     *
     * @param ShowAddonInstanceRequest 请求对象
     * @return SyncInvoker<ShowAddonInstanceRequest, ShowAddonInstanceResponse> */
    public SyncInvoker<ShowAddonInstanceRequest, ShowAddonInstanceResponse> showAddonInstanceInvoker(
        ShowAddonInstanceRequest request) {
        return new SyncInvoker<ShowAddonInstanceRequest, ShowAddonInstanceResponse>(request, CceMeta.showAddonInstance,
            hcClient);
    }

    /** 获取指定的集群 该API用于获取指定集群的详细信息。 &gt;集群管理的URL格式为：https://Endpoint/uri。其中uri为资源路径，也即API访问的路径。
     *
     * @param ShowClusterRequest 请求对象
     * @return ShowClusterResponse */
    public ShowClusterResponse showCluster(ShowClusterRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.showCluster);
    }

    /** 获取指定的集群 该API用于获取指定集群的详细信息。 &gt;集群管理的URL格式为：https://Endpoint/uri。其中uri为资源路径，也即API访问的路径。
     *
     * @param ShowClusterRequest 请求对象
     * @return SyncInvoker<ShowClusterRequest, ShowClusterResponse> */
    public SyncInvoker<ShowClusterRequest, ShowClusterResponse> showClusterInvoker(ShowClusterRequest request) {
        return new SyncInvoker<ShowClusterRequest, ShowClusterResponse>(request, CceMeta.showCluster, hcClient);
    }

    /** 获取任务信息 该API用于获取任务信息。通过某一任务请求下发后返回的jobID来查询指定任务的进度。 &gt; - 集群管理的URL格式为：https://Endpoint/uri。其中uri为资源路径，也即API访问的路径
     * &gt; - 该接口通常使用场景为： &gt; - 创建、删除集群时，查询相应任务的进度。 &gt; - 创建、删除节点时，查询相应任务的进度。
     *
     * @param ShowJobRequest 请求对象
     * @return ShowJobResponse */
    public ShowJobResponse showJob(ShowJobRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.showJob);
    }

    /** 获取任务信息 该API用于获取任务信息。通过某一任务请求下发后返回的jobID来查询指定任务的进度。 &gt; - 集群管理的URL格式为：https://Endpoint/uri。其中uri为资源路径，也即API访问的路径
     * &gt; - 该接口通常使用场景为： &gt; - 创建、删除集群时，查询相应任务的进度。 &gt; - 创建、删除节点时，查询相应任务的进度。
     *
     * @param ShowJobRequest 请求对象
     * @return SyncInvoker<ShowJobRequest, ShowJobResponse> */
    public SyncInvoker<ShowJobRequest, ShowJobResponse> showJobInvoker(ShowJobRequest request) {
        return new SyncInvoker<ShowJobRequest, ShowJobResponse>(request, CceMeta.showJob, hcClient);
    }

    /** 获取指定的节点 该API用于通过节点ID获取指定节点的详细信息。 &gt;集群管理的URL格式为：https://Endpoint/uri。其中uri为资源路径，也即API访问的路径。
     *
     * @param ShowNodeRequest 请求对象
     * @return ShowNodeResponse */
    public ShowNodeResponse showNode(ShowNodeRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.showNode);
    }

    /** 获取指定的节点 该API用于通过节点ID获取指定节点的详细信息。 &gt;集群管理的URL格式为：https://Endpoint/uri。其中uri为资源路径，也即API访问的路径。
     *
     * @param ShowNodeRequest 请求对象
     * @return SyncInvoker<ShowNodeRequest, ShowNodeResponse> */
    public SyncInvoker<ShowNodeRequest, ShowNodeResponse> showNodeInvoker(ShowNodeRequest request) {
        return new SyncInvoker<ShowNodeRequest, ShowNodeResponse>(request, CceMeta.showNode, hcClient);
    }

    /** 获取指定的节点池 该API用于获取指定节点池的详细信息。 &gt; 集群管理的URL格式为：https://Endpoint/uri。其中uri为资源路径，也即API访问的路径
     *
     * @param ShowNodePoolRequest 请求对象
     * @return ShowNodePoolResponse */
    public ShowNodePoolResponse showNodePool(ShowNodePoolRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.showNodePool);
    }

    /** 获取指定的节点池 该API用于获取指定节点池的详细信息。 &gt; 集群管理的URL格式为：https://Endpoint/uri。其中uri为资源路径，也即API访问的路径
     *
     * @param ShowNodePoolRequest 请求对象
     * @return SyncInvoker<ShowNodePoolRequest, ShowNodePoolResponse> */
    public SyncInvoker<ShowNodePoolRequest, ShowNodePoolResponse> showNodePoolInvoker(ShowNodePoolRequest request) {
        return new SyncInvoker<ShowNodePoolRequest, ShowNodePoolResponse>(request, CceMeta.showNodePool, hcClient);
    }

    /** 查询CCE服务下的资源配额。 该API用于查询CCE服务下的资源配额。
     *
     * @param ShowQuotasRequest 请求对象
     * @return ShowQuotasResponse */
    public ShowQuotasResponse showQuotas(ShowQuotasRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.showQuotas);
    }

    /** 查询CCE服务下的资源配额。 该API用于查询CCE服务下的资源配额。
     *
     * @param ShowQuotasRequest 请求对象
     * @return SyncInvoker<ShowQuotasRequest, ShowQuotasResponse> */
    public SyncInvoker<ShowQuotasRequest, ShowQuotasResponse> showQuotasInvoker(ShowQuotasRequest request) {
        return new SyncInvoker<ShowQuotasRequest, ShowQuotasResponse>(request, CceMeta.showQuotas, hcClient);
    }

    /** 更新AddonInstance 更新插件实例的功能。
     *
     * @param UpdateAddonInstanceRequest 请求对象
     * @return UpdateAddonInstanceResponse */
    public UpdateAddonInstanceResponse updateAddonInstance(UpdateAddonInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.updateAddonInstance);
    }

    /** 更新AddonInstance 更新插件实例的功能。
     *
     * @param UpdateAddonInstanceRequest 请求对象
     * @return SyncInvoker<UpdateAddonInstanceRequest, UpdateAddonInstanceResponse> */
    public SyncInvoker<UpdateAddonInstanceRequest, UpdateAddonInstanceResponse> updateAddonInstanceInvoker(
        UpdateAddonInstanceRequest request) {
        return new SyncInvoker<UpdateAddonInstanceRequest, UpdateAddonInstanceResponse>(request,
            CceMeta.updateAddonInstance, hcClient);
    }

    /** 更新指定的集群 该API用于更新指定的集群。 &gt;集群管理的URL格式为：https://Endpoint/uri。其中uri为资源路径，也即API访问的路径。
     *
     * @param UpdateClusterRequest 请求对象
     * @return UpdateClusterResponse */
    public UpdateClusterResponse updateCluster(UpdateClusterRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.updateCluster);
    }

    /** 更新指定的集群 该API用于更新指定的集群。 &gt;集群管理的URL格式为：https://Endpoint/uri。其中uri为资源路径，也即API访问的路径。
     *
     * @param UpdateClusterRequest 请求对象
     * @return SyncInvoker<UpdateClusterRequest, UpdateClusterResponse> */
    public SyncInvoker<UpdateClusterRequest, UpdateClusterResponse> updateClusterInvoker(UpdateClusterRequest request) {
        return new SyncInvoker<UpdateClusterRequest, UpdateClusterResponse>(request, CceMeta.updateCluster, hcClient);
    }

    /** 更新指定的节点 该API用于更新指定的节点。 &gt; - 当前仅支持更新metadata下的name字段，即节点的名字。 &gt; -
     * 集群管理的URL格式为：https://Endpoint/uri。其中uri为资源路径，也即API访问的路径。
     *
     * @param UpdateNodeRequest 请求对象
     * @return UpdateNodeResponse */
    public UpdateNodeResponse updateNode(UpdateNodeRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.updateNode);
    }

    /** 更新指定的节点 该API用于更新指定的节点。 &gt; - 当前仅支持更新metadata下的name字段，即节点的名字。 &gt; -
     * 集群管理的URL格式为：https://Endpoint/uri。其中uri为资源路径，也即API访问的路径。
     *
     * @param UpdateNodeRequest 请求对象
     * @return SyncInvoker<UpdateNodeRequest, UpdateNodeResponse> */
    public SyncInvoker<UpdateNodeRequest, UpdateNodeResponse> updateNodeInvoker(UpdateNodeRequest request) {
        return new SyncInvoker<UpdateNodeRequest, UpdateNodeResponse>(request, CceMeta.updateNode, hcClient);
    }

    /** 更新指定节点池 该API用于更新指定的节点池。仅支持集群在处于可用、扩容、缩容状态时调用。 &gt; - 集群管理的URL格式为：https://Endpoint/uri。其中uri为资源路径，也即API访问的路径 &gt;
     * - 当前仅支持更新节点池名称，spec下的initialNodeCount，k8sTags， taints，login，userTags与节点池的扩缩容配置相关字段。
     *
     * @param UpdateNodePoolRequest 请求对象
     * @return UpdateNodePoolResponse */
    public UpdateNodePoolResponse updateNodePool(UpdateNodePoolRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.updateNodePool);
    }

    /** 更新指定节点池 该API用于更新指定的节点池。仅支持集群在处于可用、扩容、缩容状态时调用。 &gt; - 集群管理的URL格式为：https://Endpoint/uri。其中uri为资源路径，也即API访问的路径 &gt;
     * - 当前仅支持更新节点池名称，spec下的initialNodeCount，k8sTags， taints，login，userTags与节点池的扩缩容配置相关字段。
     *
     * @param UpdateNodePoolRequest 请求对象
     * @return SyncInvoker<UpdateNodePoolRequest, UpdateNodePoolResponse> */
    public SyncInvoker<UpdateNodePoolRequest, UpdateNodePoolResponse> updateNodePoolInvoker(
        UpdateNodePoolRequest request) {
        return new SyncInvoker<UpdateNodePoolRequest, UpdateNodePoolResponse>(request, CceMeta.updateNodePool,
            hcClient);
    }

}
