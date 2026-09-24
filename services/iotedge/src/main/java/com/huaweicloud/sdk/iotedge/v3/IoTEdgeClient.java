package com.huaweicloud.sdk.iotedge.v3;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.iotedge.v3.model.CreateAppInstanceRequest;
import com.huaweicloud.sdk.iotedge.v3.model.CreateAppInstanceResponse;
import com.huaweicloud.sdk.iotedge.v3.model.CreateAppRequest;
import com.huaweicloud.sdk.iotedge.v3.model.CreateAppResponse;
import com.huaweicloud.sdk.iotedge.v3.model.CreateAppVersionRequest;
import com.huaweicloud.sdk.iotedge.v3.model.CreateAppVersionResponse;
import com.huaweicloud.sdk.iotedge.v3.model.CreateClusterInstallCmdRequest;
import com.huaweicloud.sdk.iotedge.v3.model.CreateClusterInstallCmdResponse;
import com.huaweicloud.sdk.iotedge.v3.model.CreateClusterNodesInstallCmdRequest;
import com.huaweicloud.sdk.iotedge.v3.model.CreateClusterNodesInstallCmdResponse;
import com.huaweicloud.sdk.iotedge.v3.model.CreateClusterRequest;
import com.huaweicloud.sdk.iotedge.v3.model.CreateClusterResponse;
import com.huaweicloud.sdk.iotedge.v3.model.DeleteAppInstanceRequest;
import com.huaweicloud.sdk.iotedge.v3.model.DeleteAppInstanceResponse;
import com.huaweicloud.sdk.iotedge.v3.model.DeleteAppRequest;
import com.huaweicloud.sdk.iotedge.v3.model.DeleteAppResponse;
import com.huaweicloud.sdk.iotedge.v3.model.DeleteAppVersionRequest;
import com.huaweicloud.sdk.iotedge.v3.model.DeleteAppVersionResponse;
import com.huaweicloud.sdk.iotedge.v3.model.DeleteClusterRequest;
import com.huaweicloud.sdk.iotedge.v3.model.DeleteClusterResponse;
import com.huaweicloud.sdk.iotedge.v3.model.DownloadAppVersionRequest;
import com.huaweicloud.sdk.iotedge.v3.model.DownloadAppVersionResponse;
import com.huaweicloud.sdk.iotedge.v3.model.InvokeKubeApiRequest;
import com.huaweicloud.sdk.iotedge.v3.model.InvokeKubeApiResponse;
import com.huaweicloud.sdk.iotedge.v3.model.ListAppImageRequest;
import com.huaweicloud.sdk.iotedge.v3.model.ListAppImageResponse;
import com.huaweicloud.sdk.iotedge.v3.model.ListAppInstanceHistoryRequest;
import com.huaweicloud.sdk.iotedge.v3.model.ListAppInstanceHistoryResponse;
import com.huaweicloud.sdk.iotedge.v3.model.ListAppInstancesRequest;
import com.huaweicloud.sdk.iotedge.v3.model.ListAppInstancesResponse;
import com.huaweicloud.sdk.iotedge.v3.model.ListAppVersionsRequest;
import com.huaweicloud.sdk.iotedge.v3.model.ListAppVersionsResponse;
import com.huaweicloud.sdk.iotedge.v3.model.ListAppsRequest;
import com.huaweicloud.sdk.iotedge.v3.model.ListAppsResponse;
import com.huaweicloud.sdk.iotedge.v3.model.ListClusterNamespacesRequest;
import com.huaweicloud.sdk.iotedge.v3.model.ListClusterNamespacesResponse;
import com.huaweicloud.sdk.iotedge.v3.model.ListClusterNodesRequest;
import com.huaweicloud.sdk.iotedge.v3.model.ListClusterNodesResponse;
import com.huaweicloud.sdk.iotedge.v3.model.ListClustersRequest;
import com.huaweicloud.sdk.iotedge.v3.model.ListClustersResponse;
import com.huaweicloud.sdk.iotedge.v3.model.ShowAppRequest;
import com.huaweicloud.sdk.iotedge.v3.model.ShowAppResponse;
import com.huaweicloud.sdk.iotedge.v3.model.ShowAppVersionRequest;
import com.huaweicloud.sdk.iotedge.v3.model.ShowAppVersionResponse;
import com.huaweicloud.sdk.iotedge.v3.model.ShowClusterNodeRequest;
import com.huaweicloud.sdk.iotedge.v3.model.ShowClusterNodeResponse;
import com.huaweicloud.sdk.iotedge.v3.model.ShowClusterRequest;
import com.huaweicloud.sdk.iotedge.v3.model.ShowClusterResourcesRequest;
import com.huaweicloud.sdk.iotedge.v3.model.ShowClusterResourcesResponse;
import com.huaweicloud.sdk.iotedge.v3.model.ShowClusterResponse;
import com.huaweicloud.sdk.iotedge.v3.model.UpdateAppInstanceRequest;
import com.huaweicloud.sdk.iotedge.v3.model.UpdateAppInstanceResponse;
import com.huaweicloud.sdk.iotedge.v3.model.UpdateResourceBindingRequest;
import com.huaweicloud.sdk.iotedge.v3.model.UpdateResourceBindingResponse;

public class IoTEdgeClient {

    protected HcClient hcClient;

    public IoTEdgeClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<IoTEdgeClient> newBuilder() {
        ClientBuilder<IoTEdgeClient> clientBuilder = new ClientBuilder<>(IoTEdgeClient::new);
        return clientBuilder;
    }

    /**
     * 创建应用模板
     *
     * 应用服务器可调用此接口创建应用模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAppRequest 请求对象
     * @return CreateAppResponse
     */
    public CreateAppResponse createApp(CreateAppRequest request) {
        return hcClient.syncInvokeHttp(request, IoTEdgeMeta.createApp);
    }

    /**
     * 创建应用模板
     *
     * 应用服务器可调用此接口创建应用模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAppRequest 请求对象
     * @return SyncInvoker<CreateAppRequest, CreateAppResponse>
     */
    public SyncInvoker<CreateAppRequest, CreateAppResponse> createAppInvoker(CreateAppRequest request) {
        return new SyncInvoker<>(request, IoTEdgeMeta.createApp, hcClient);
    }

    /**
     * 删除应用模板
     *
     * 应用服务器可调用此接口删除应用模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAppRequest 请求对象
     * @return DeleteAppResponse
     */
    public DeleteAppResponse deleteApp(DeleteAppRequest request) {
        return hcClient.syncInvokeHttp(request, IoTEdgeMeta.deleteApp);
    }

    /**
     * 删除应用模板
     *
     * 应用服务器可调用此接口删除应用模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAppRequest 请求对象
     * @return SyncInvoker<DeleteAppRequest, DeleteAppResponse>
     */
    public SyncInvoker<DeleteAppRequest, DeleteAppResponse> deleteAppInvoker(DeleteAppRequest request) {
        return new SyncInvoker<>(request, IoTEdgeMeta.deleteApp, hcClient);
    }

    /**
     * 查询应用模板列表
     *
     * 应用服务器可调用此接口查询应用模板列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAppsRequest 请求对象
     * @return ListAppsResponse
     */
    public ListAppsResponse listApps(ListAppsRequest request) {
        return hcClient.syncInvokeHttp(request, IoTEdgeMeta.listApps);
    }

    /**
     * 查询应用模板列表
     *
     * 应用服务器可调用此接口查询应用模板列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAppsRequest 请求对象
     * @return SyncInvoker<ListAppsRequest, ListAppsResponse>
     */
    public SyncInvoker<ListAppsRequest, ListAppsResponse> listAppsInvoker(ListAppsRequest request) {
        return new SyncInvoker<>(request, IoTEdgeMeta.listApps, hcClient);
    }

    /**
     * 查询应用模板详情
     *
     * 应用服务器可调用此接口查询应用模板详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAppRequest 请求对象
     * @return ShowAppResponse
     */
    public ShowAppResponse showApp(ShowAppRequest request) {
        return hcClient.syncInvokeHttp(request, IoTEdgeMeta.showApp);
    }

    /**
     * 查询应用模板详情
     *
     * 应用服务器可调用此接口查询应用模板详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAppRequest 请求对象
     * @return SyncInvoker<ShowAppRequest, ShowAppResponse>
     */
    public SyncInvoker<ShowAppRequest, ShowAppResponse> showAppInvoker(ShowAppRequest request) {
        return new SyncInvoker<>(request, IoTEdgeMeta.showApp, hcClient);
    }

    /**
     * 创建应用实例
     *
     * 应用服务器可调用此接口创建应用实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAppInstanceRequest 请求对象
     * @return CreateAppInstanceResponse
     */
    public CreateAppInstanceResponse createAppInstance(CreateAppInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, IoTEdgeMeta.createAppInstance);
    }

    /**
     * 创建应用实例
     *
     * 应用服务器可调用此接口创建应用实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAppInstanceRequest 请求对象
     * @return SyncInvoker<CreateAppInstanceRequest, CreateAppInstanceResponse>
     */
    public SyncInvoker<CreateAppInstanceRequest, CreateAppInstanceResponse> createAppInstanceInvoker(
        CreateAppInstanceRequest request) {
        return new SyncInvoker<>(request, IoTEdgeMeta.createAppInstance, hcClient);
    }

    /**
     * 删除应用实例
     *
     * 应用服务器可调用此接口删除应用实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAppInstanceRequest 请求对象
     * @return DeleteAppInstanceResponse
     */
    public DeleteAppInstanceResponse deleteAppInstance(DeleteAppInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, IoTEdgeMeta.deleteAppInstance);
    }

    /**
     * 删除应用实例
     *
     * 应用服务器可调用此接口删除应用实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAppInstanceRequest 请求对象
     * @return SyncInvoker<DeleteAppInstanceRequest, DeleteAppInstanceResponse>
     */
    public SyncInvoker<DeleteAppInstanceRequest, DeleteAppInstanceResponse> deleteAppInstanceInvoker(
        DeleteAppInstanceRequest request) {
        return new SyncInvoker<>(request, IoTEdgeMeta.deleteAppInstance, hcClient);
    }

    /**
     * 查询应用实例的历史版本列表
     *
     * 应用服务器可调用此接口查询应用实例的历史版本列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAppInstanceHistoryRequest 请求对象
     * @return ListAppInstanceHistoryResponse
     */
    public ListAppInstanceHistoryResponse listAppInstanceHistory(ListAppInstanceHistoryRequest request) {
        return hcClient.syncInvokeHttp(request, IoTEdgeMeta.listAppInstanceHistory);
    }

    /**
     * 查询应用实例的历史版本列表
     *
     * 应用服务器可调用此接口查询应用实例的历史版本列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAppInstanceHistoryRequest 请求对象
     * @return SyncInvoker<ListAppInstanceHistoryRequest, ListAppInstanceHistoryResponse>
     */
    public SyncInvoker<ListAppInstanceHistoryRequest, ListAppInstanceHistoryResponse> listAppInstanceHistoryInvoker(
        ListAppInstanceHistoryRequest request) {
        return new SyncInvoker<>(request, IoTEdgeMeta.listAppInstanceHistory, hcClient);
    }

    /**
     * 查询应用实例列表
     *
     * 应用服务器可调用此接口查询应用实例列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAppInstancesRequest 请求对象
     * @return ListAppInstancesResponse
     */
    public ListAppInstancesResponse listAppInstances(ListAppInstancesRequest request) {
        return hcClient.syncInvokeHttp(request, IoTEdgeMeta.listAppInstances);
    }

    /**
     * 查询应用实例列表
     *
     * 应用服务器可调用此接口查询应用实例列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAppInstancesRequest 请求对象
     * @return SyncInvoker<ListAppInstancesRequest, ListAppInstancesResponse>
     */
    public SyncInvoker<ListAppInstancesRequest, ListAppInstancesResponse> listAppInstancesInvoker(
        ListAppInstancesRequest request) {
        return new SyncInvoker<>(request, IoTEdgeMeta.listAppInstances, hcClient);
    }

    /**
     * 更新应用实例
     *
     * 应用服务器可调用此接口更新应用实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAppInstanceRequest 请求对象
     * @return UpdateAppInstanceResponse
     */
    public UpdateAppInstanceResponse updateAppInstance(UpdateAppInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, IoTEdgeMeta.updateAppInstance);
    }

    /**
     * 更新应用实例
     *
     * 应用服务器可调用此接口更新应用实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAppInstanceRequest 请求对象
     * @return SyncInvoker<UpdateAppInstanceRequest, UpdateAppInstanceResponse>
     */
    public SyncInvoker<UpdateAppInstanceRequest, UpdateAppInstanceResponse> updateAppInstanceInvoker(
        UpdateAppInstanceRequest request) {
        return new SyncInvoker<>(request, IoTEdgeMeta.updateAppInstance, hcClient);
    }

    /**
     * 创建应用版本
     *
     * 应用服务器可调用此接口创建应用版本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAppVersionRequest 请求对象
     * @return CreateAppVersionResponse
     */
    public CreateAppVersionResponse createAppVersion(CreateAppVersionRequest request) {
        return hcClient.syncInvokeHttp(request, IoTEdgeMeta.createAppVersion);
    }

    /**
     * 创建应用版本
     *
     * 应用服务器可调用此接口创建应用版本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAppVersionRequest 请求对象
     * @return SyncInvoker<CreateAppVersionRequest, CreateAppVersionResponse>
     */
    public SyncInvoker<CreateAppVersionRequest, CreateAppVersionResponse> createAppVersionInvoker(
        CreateAppVersionRequest request) {
        return new SyncInvoker<>(request, IoTEdgeMeta.createAppVersion, hcClient);
    }

    /**
     * 删除应用版本
     *
     * 应用服务器可调用此接口删除应用版本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAppVersionRequest 请求对象
     * @return DeleteAppVersionResponse
     */
    public DeleteAppVersionResponse deleteAppVersion(DeleteAppVersionRequest request) {
        return hcClient.syncInvokeHttp(request, IoTEdgeMeta.deleteAppVersion);
    }

    /**
     * 删除应用版本
     *
     * 应用服务器可调用此接口删除应用版本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAppVersionRequest 请求对象
     * @return SyncInvoker<DeleteAppVersionRequest, DeleteAppVersionResponse>
     */
    public SyncInvoker<DeleteAppVersionRequest, DeleteAppVersionResponse> deleteAppVersionInvoker(
        DeleteAppVersionRequest request) {
        return new SyncInvoker<>(request, IoTEdgeMeta.deleteAppVersion, hcClient);
    }

    /**
     * 下载应用版本Chart包
     *
     * 应用服务器可调用此接口下载应用版本Chart包。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadAppVersionRequest 请求对象
     * @return DownloadAppVersionResponse
     */
    public DownloadAppVersionResponse downloadAppVersion(DownloadAppVersionRequest request) {
        return hcClient.syncInvokeHttp(request, IoTEdgeMeta.downloadAppVersion);
    }

    /**
     * 下载应用版本Chart包
     *
     * 应用服务器可调用此接口下载应用版本Chart包。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadAppVersionRequest 请求对象
     * @return SyncInvoker<DownloadAppVersionRequest, DownloadAppVersionResponse>
     */
    public SyncInvoker<DownloadAppVersionRequest, DownloadAppVersionResponse> downloadAppVersionInvoker(
        DownloadAppVersionRequest request) {
        return new SyncInvoker<>(request, IoTEdgeMeta.downloadAppVersion, hcClient);
    }

    /**
     * 查询应用版本包含的镜像列表
     *
     * 应用服务器可调用此接口查询应用版本包含的镜像列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAppImageRequest 请求对象
     * @return ListAppImageResponse
     */
    public ListAppImageResponse listAppImage(ListAppImageRequest request) {
        return hcClient.syncInvokeHttp(request, IoTEdgeMeta.listAppImage);
    }

    /**
     * 查询应用版本包含的镜像列表
     *
     * 应用服务器可调用此接口查询应用版本包含的镜像列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAppImageRequest 请求对象
     * @return SyncInvoker<ListAppImageRequest, ListAppImageResponse>
     */
    public SyncInvoker<ListAppImageRequest, ListAppImageResponse> listAppImageInvoker(ListAppImageRequest request) {
        return new SyncInvoker<>(request, IoTEdgeMeta.listAppImage, hcClient);
    }

    /**
     * 查询应用版本列表
     *
     * 应用服务器可调用此接口查询应用版本列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAppVersionsRequest 请求对象
     * @return ListAppVersionsResponse
     */
    public ListAppVersionsResponse listAppVersions(ListAppVersionsRequest request) {
        return hcClient.syncInvokeHttp(request, IoTEdgeMeta.listAppVersions);
    }

    /**
     * 查询应用版本列表
     *
     * 应用服务器可调用此接口查询应用版本列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAppVersionsRequest 请求对象
     * @return SyncInvoker<ListAppVersionsRequest, ListAppVersionsResponse>
     */
    public SyncInvoker<ListAppVersionsRequest, ListAppVersionsResponse> listAppVersionsInvoker(
        ListAppVersionsRequest request) {
        return new SyncInvoker<>(request, IoTEdgeMeta.listAppVersions, hcClient);
    }

    /**
     * 查询应用版本详情
     *
     * 应用服务器可调用此接口查询应用版本详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAppVersionRequest 请求对象
     * @return ShowAppVersionResponse
     */
    public ShowAppVersionResponse showAppVersion(ShowAppVersionRequest request) {
        return hcClient.syncInvokeHttp(request, IoTEdgeMeta.showAppVersion);
    }

    /**
     * 查询应用版本详情
     *
     * 应用服务器可调用此接口查询应用版本详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAppVersionRequest 请求对象
     * @return SyncInvoker<ShowAppVersionRequest, ShowAppVersionResponse>
     */
    public SyncInvoker<ShowAppVersionRequest, ShowAppVersionResponse> showAppVersionInvoker(
        ShowAppVersionRequest request) {
        return new SyncInvoker<>(request, IoTEdgeMeta.showAppVersion, hcClient);
    }

    /**
     * 创建边缘集群
     *
     * 应用服务器可调用此接口创建边缘集群。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateClusterRequest 请求对象
     * @return CreateClusterResponse
     */
    public CreateClusterResponse createCluster(CreateClusterRequest request) {
        return hcClient.syncInvokeHttp(request, IoTEdgeMeta.createCluster);
    }

    /**
     * 创建边缘集群
     *
     * 应用服务器可调用此接口创建边缘集群。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateClusterRequest 请求对象
     * @return SyncInvoker<CreateClusterRequest, CreateClusterResponse>
     */
    public SyncInvoker<CreateClusterRequest, CreateClusterResponse> createClusterInvoker(CreateClusterRequest request) {
        return new SyncInvoker<>(request, IoTEdgeMeta.createCluster, hcClient);
    }

    /**
     * 生成边缘集群安装命令
     *
     * 应用服务器可调用此接口生成边缘集群安装命令。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateClusterInstallCmdRequest 请求对象
     * @return CreateClusterInstallCmdResponse
     */
    public CreateClusterInstallCmdResponse createClusterInstallCmd(CreateClusterInstallCmdRequest request) {
        return hcClient.syncInvokeHttp(request, IoTEdgeMeta.createClusterInstallCmd);
    }

    /**
     * 生成边缘集群安装命令
     *
     * 应用服务器可调用此接口生成边缘集群安装命令。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateClusterInstallCmdRequest 请求对象
     * @return SyncInvoker<CreateClusterInstallCmdRequest, CreateClusterInstallCmdResponse>
     */
    public SyncInvoker<CreateClusterInstallCmdRequest, CreateClusterInstallCmdResponse> createClusterInstallCmdInvoker(
        CreateClusterInstallCmdRequest request) {
        return new SyncInvoker<>(request, IoTEdgeMeta.createClusterInstallCmd, hcClient);
    }

    /**
     * 删除边缘集群
     *
     * 应用服务器可调用此接口删除边缘集群。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteClusterRequest 请求对象
     * @return DeleteClusterResponse
     */
    public DeleteClusterResponse deleteCluster(DeleteClusterRequest request) {
        return hcClient.syncInvokeHttp(request, IoTEdgeMeta.deleteCluster);
    }

    /**
     * 删除边缘集群
     *
     * 应用服务器可调用此接口删除边缘集群。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteClusterRequest 请求对象
     * @return SyncInvoker<DeleteClusterRequest, DeleteClusterResponse>
     */
    public SyncInvoker<DeleteClusterRequest, DeleteClusterResponse> deleteClusterInvoker(DeleteClusterRequest request) {
        return new SyncInvoker<>(request, IoTEdgeMeta.deleteCluster, hcClient);
    }

    /**
     * 查询边缘集群列表
     *
     * 应用服务器可调用此接口查询边缘集群列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListClustersRequest 请求对象
     * @return ListClustersResponse
     */
    public ListClustersResponse listClusters(ListClustersRequest request) {
        return hcClient.syncInvokeHttp(request, IoTEdgeMeta.listClusters);
    }

    /**
     * 查询边缘集群列表
     *
     * 应用服务器可调用此接口查询边缘集群列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListClustersRequest 请求对象
     * @return SyncInvoker<ListClustersRequest, ListClustersResponse>
     */
    public SyncInvoker<ListClustersRequest, ListClustersResponse> listClustersInvoker(ListClustersRequest request) {
        return new SyncInvoker<>(request, IoTEdgeMeta.listClusters, hcClient);
    }

    /**
     * 查询边缘集群详情
     *
     * 应用服务器可调用此接口查询边缘集群详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowClusterRequest 请求对象
     * @return ShowClusterResponse
     */
    public ShowClusterResponse showCluster(ShowClusterRequest request) {
        return hcClient.syncInvokeHttp(request, IoTEdgeMeta.showCluster);
    }

    /**
     * 查询边缘集群详情
     *
     * 应用服务器可调用此接口查询边缘集群详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowClusterRequest 请求对象
     * @return SyncInvoker<ShowClusterRequest, ShowClusterResponse>
     */
    public SyncInvoker<ShowClusterRequest, ShowClusterResponse> showClusterInvoker(ShowClusterRequest request) {
        return new SyncInvoker<>(request, IoTEdgeMeta.showCluster, hcClient);
    }

    /**
     * 查询资源列表-企业版
     *
     * 查询资源列表-企业版
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowClusterResourcesRequest 请求对象
     * @return ShowClusterResourcesResponse
     */
    public ShowClusterResourcesResponse showClusterResources(ShowClusterResourcesRequest request) {
        return hcClient.syncInvokeHttp(request, IoTEdgeMeta.showClusterResources);
    }

    /**
     * 查询资源列表-企业版
     *
     * 查询资源列表-企业版
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowClusterResourcesRequest 请求对象
     * @return SyncInvoker<ShowClusterResourcesRequest, ShowClusterResourcesResponse>
     */
    public SyncInvoker<ShowClusterResourcesRequest, ShowClusterResourcesResponse> showClusterResourcesInvoker(
        ShowClusterResourcesRequest request) {
        return new SyncInvoker<>(request, IoTEdgeMeta.showClusterResources, hcClient);
    }

    /**
     * 更改资源绑定信息-企业版
     *
     * 更改资源绑定信息-企业版
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateResourceBindingRequest 请求对象
     * @return UpdateResourceBindingResponse
     */
    public UpdateResourceBindingResponse updateResourceBinding(UpdateResourceBindingRequest request) {
        return hcClient.syncInvokeHttp(request, IoTEdgeMeta.updateResourceBinding);
    }

    /**
     * 更改资源绑定信息-企业版
     *
     * 更改资源绑定信息-企业版
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateResourceBindingRequest 请求对象
     * @return SyncInvoker<UpdateResourceBindingRequest, UpdateResourceBindingResponse>
     */
    public SyncInvoker<UpdateResourceBindingRequest, UpdateResourceBindingResponse> updateResourceBindingInvoker(
        UpdateResourceBindingRequest request) {
        return new SyncInvoker<>(request, IoTEdgeMeta.updateResourceBinding, hcClient);
    }

    /**
     * 转发k8s API
     *
     * 转发k8s API。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request InvokeKubeApiRequest 请求对象
     * @return InvokeKubeApiResponse
     */
    public InvokeKubeApiResponse invokeKubeApi(InvokeKubeApiRequest request) {
        return hcClient.syncInvokeHttp(request, IoTEdgeMeta.invokeKubeApi);
    }

    /**
     * 转发k8s API
     *
     * 转发k8s API。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request InvokeKubeApiRequest 请求对象
     * @return SyncInvoker<InvokeKubeApiRequest, InvokeKubeApiResponse>
     */
    public SyncInvoker<InvokeKubeApiRequest, InvokeKubeApiResponse> invokeKubeApiInvoker(InvokeKubeApiRequest request) {
        return new SyncInvoker<>(request, IoTEdgeMeta.invokeKubeApi, hcClient);
    }

    /**
     * 查询命名空间列表
     *
     * 应用服务器可调用此接口查询命名空间列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListClusterNamespacesRequest 请求对象
     * @return ListClusterNamespacesResponse
     */
    public ListClusterNamespacesResponse listClusterNamespaces(ListClusterNamespacesRequest request) {
        return hcClient.syncInvokeHttp(request, IoTEdgeMeta.listClusterNamespaces);
    }

    /**
     * 查询命名空间列表
     *
     * 应用服务器可调用此接口查询命名空间列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListClusterNamespacesRequest 请求对象
     * @return SyncInvoker<ListClusterNamespacesRequest, ListClusterNamespacesResponse>
     */
    public SyncInvoker<ListClusterNamespacesRequest, ListClusterNamespacesResponse> listClusterNamespacesInvoker(
        ListClusterNamespacesRequest request) {
        return new SyncInvoker<>(request, IoTEdgeMeta.listClusterNamespaces, hcClient);
    }

    /**
     * 生成安装集群节点的安装命令
     *
     * 生成安装集群节点的安装命令。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateClusterNodesInstallCmdRequest 请求对象
     * @return CreateClusterNodesInstallCmdResponse
     */
    public CreateClusterNodesInstallCmdResponse createClusterNodesInstallCmd(
        CreateClusterNodesInstallCmdRequest request) {
        return hcClient.syncInvokeHttp(request, IoTEdgeMeta.createClusterNodesInstallCmd);
    }

    /**
     * 生成安装集群节点的安装命令
     *
     * 生成安装集群节点的安装命令。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateClusterNodesInstallCmdRequest 请求对象
     * @return SyncInvoker<CreateClusterNodesInstallCmdRequest, CreateClusterNodesInstallCmdResponse>
     */
    public SyncInvoker<CreateClusterNodesInstallCmdRequest, CreateClusterNodesInstallCmdResponse> createClusterNodesInstallCmdInvoker(
        CreateClusterNodesInstallCmdRequest request) {
        return new SyncInvoker<>(request, IoTEdgeMeta.createClusterNodesInstallCmd, hcClient);
    }

    /**
     * 查询集群的节点列表
     *
     * 应用服务器可调用此接口查询集群的节点列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListClusterNodesRequest 请求对象
     * @return ListClusterNodesResponse
     */
    public ListClusterNodesResponse listClusterNodes(ListClusterNodesRequest request) {
        return hcClient.syncInvokeHttp(request, IoTEdgeMeta.listClusterNodes);
    }

    /**
     * 查询集群的节点列表
     *
     * 应用服务器可调用此接口查询集群的节点列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListClusterNodesRequest 请求对象
     * @return SyncInvoker<ListClusterNodesRequest, ListClusterNodesResponse>
     */
    public SyncInvoker<ListClusterNodesRequest, ListClusterNodesResponse> listClusterNodesInvoker(
        ListClusterNodesRequest request) {
        return new SyncInvoker<>(request, IoTEdgeMeta.listClusterNodes, hcClient);
    }

    /**
     * 查询集群的节点详情
     *
     * 应用服务器可调用此接口查询集群的节点详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowClusterNodeRequest 请求对象
     * @return ShowClusterNodeResponse
     */
    public ShowClusterNodeResponse showClusterNode(ShowClusterNodeRequest request) {
        return hcClient.syncInvokeHttp(request, IoTEdgeMeta.showClusterNode);
    }

    /**
     * 查询集群的节点详情
     *
     * 应用服务器可调用此接口查询集群的节点详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowClusterNodeRequest 请求对象
     * @return SyncInvoker<ShowClusterNodeRequest, ShowClusterNodeResponse>
     */
    public SyncInvoker<ShowClusterNodeRequest, ShowClusterNodeResponse> showClusterNodeInvoker(
        ShowClusterNodeRequest request) {
        return new SyncInvoker<>(request, IoTEdgeMeta.showClusterNode, hcClient);
    }

}
