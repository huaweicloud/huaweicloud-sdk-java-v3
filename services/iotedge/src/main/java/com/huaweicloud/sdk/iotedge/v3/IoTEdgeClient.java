package com.huaweicloud.sdk.iotedge.v3;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.iotedge.v3.model.*;

public class IoTEdgeClient {
    protected HcClient hcClient;

    public IoTEdgeClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<IoTEdgeClient> newBuilder() {
        return new ClientBuilder<>(IoTEdgeClient::new);
    }


    /**
     * 创建应用模板
     *
     * 应用服务器可调用此接口为创建批量处理任务，对多个设备进行批量操作。当前支持批量软固件升级、批量创建设备、批量删除设备、批量冻结、批量解冻、批量下发同步命令、批量下发异步命令。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateAppRequest 请求对象
     * @return CreateAppResponse
     */
    public CreateAppResponse createApp(CreateAppRequest request) {
        return hcClient.syncInvokeHttp(request, IoTEdgeMeta.createApp);
    }

    /**
     * 创建应用模板
     *
     * 应用服务器可调用此接口为创建批量处理任务，对多个设备进行批量操作。当前支持批量软固件升级、批量创建设备、批量删除设备、批量冻结、批量解冻、批量下发同步命令、批量下发异步命令。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateAppRequest 请求对象
     * @return SyncInvoker<CreateAppRequest, CreateAppResponse>
     */
    public SyncInvoker<CreateAppRequest, CreateAppResponse> createAppInvoker(CreateAppRequest request) {
        return new SyncInvoker<CreateAppRequest, CreateAppResponse>(request, IoTEdgeMeta.createApp, hcClient);
    }

    /**
     * 删除应用模板
     *
     * 应用服务器可调用此接口删除应用模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteAppRequest 请求对象
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
     * @param DeleteAppRequest 请求对象
     * @return SyncInvoker<DeleteAppRequest, DeleteAppResponse>
     */
    public SyncInvoker<DeleteAppRequest, DeleteAppResponse> deleteAppInvoker(DeleteAppRequest request) {
        return new SyncInvoker<DeleteAppRequest, DeleteAppResponse>(request, IoTEdgeMeta.deleteApp, hcClient);
    }

    /**
     * 查询应用模板列表
     *
     * 应用服务器可调用此接口查询应用模板列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAppsRequest 请求对象
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
     * @param ListAppsRequest 请求对象
     * @return SyncInvoker<ListAppsRequest, ListAppsResponse>
     */
    public SyncInvoker<ListAppsRequest, ListAppsResponse> listAppsInvoker(ListAppsRequest request) {
        return new SyncInvoker<ListAppsRequest, ListAppsResponse>(request, IoTEdgeMeta.listApps, hcClient);
    }

    /**
     * 查询应用模板详情
     *
     * 应用服务器可调用此接口查询物联网平台中指定批量任务的信息，包括任务内容、任务状态、任务完成情况统计以及子任务列表等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAppRequest 请求对象
     * @return ShowAppResponse
     */
    public ShowAppResponse showApp(ShowAppRequest request) {
        return hcClient.syncInvokeHttp(request, IoTEdgeMeta.showApp);
    }

    /**
     * 查询应用模板详情
     *
     * 应用服务器可调用此接口查询物联网平台中指定批量任务的信息，包括任务内容、任务状态、任务完成情况统计以及子任务列表等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAppRequest 请求对象
     * @return SyncInvoker<ShowAppRequest, ShowAppResponse>
     */
    public SyncInvoker<ShowAppRequest, ShowAppResponse> showAppInvoker(ShowAppRequest request) {
        return new SyncInvoker<ShowAppRequest, ShowAppResponse>(request, IoTEdgeMeta.showApp, hcClient);
    }

    /**
     * 创建应用实例
     *
     * 应用服务器可调用此接口为创建应用实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateAppInstanceRequest 请求对象
     * @return CreateAppInstanceResponse
     */
    public CreateAppInstanceResponse createAppInstance(CreateAppInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, IoTEdgeMeta.createAppInstance);
    }

    /**
     * 创建应用实例
     *
     * 应用服务器可调用此接口为创建应用实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateAppInstanceRequest 请求对象
     * @return SyncInvoker<CreateAppInstanceRequest, CreateAppInstanceResponse>
     */
    public SyncInvoker<CreateAppInstanceRequest, CreateAppInstanceResponse> createAppInstanceInvoker(CreateAppInstanceRequest request) {
        return new SyncInvoker<CreateAppInstanceRequest, CreateAppInstanceResponse>(request, IoTEdgeMeta.createAppInstance, hcClient);
    }

    /**
     * 删除应用实例
     *
     * 应用服务器可调用此接口为删除应用实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteAppInstanceRequest 请求对象
     * @return DeleteAppInstanceResponse
     */
    public DeleteAppInstanceResponse deleteAppInstance(DeleteAppInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, IoTEdgeMeta.deleteAppInstance);
    }

    /**
     * 删除应用实例
     *
     * 应用服务器可调用此接口为删除应用实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteAppInstanceRequest 请求对象
     * @return SyncInvoker<DeleteAppInstanceRequest, DeleteAppInstanceResponse>
     */
    public SyncInvoker<DeleteAppInstanceRequest, DeleteAppInstanceResponse> deleteAppInstanceInvoker(DeleteAppInstanceRequest request) {
        return new SyncInvoker<DeleteAppInstanceRequest, DeleteAppInstanceResponse>(request, IoTEdgeMeta.deleteAppInstance, hcClient);
    }

    /**
     * 查询应用实例的历史版本列表
     *
     * 应用服务器可调用此接口查询应用实例的历史版本列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAppInstanceHistoryRequest 请求对象
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
     * @param ListAppInstanceHistoryRequest 请求对象
     * @return SyncInvoker<ListAppInstanceHistoryRequest, ListAppInstanceHistoryResponse>
     */
    public SyncInvoker<ListAppInstanceHistoryRequest, ListAppInstanceHistoryResponse> listAppInstanceHistoryInvoker(ListAppInstanceHistoryRequest request) {
        return new SyncInvoker<ListAppInstanceHistoryRequest, ListAppInstanceHistoryResponse>(request, IoTEdgeMeta.listAppInstanceHistory, hcClient);
    }

    /**
     * 查询应用实例列表
     *
     * 应用服务器可调用此接口查询应用实例列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAppInstancesRequest 请求对象
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
     * @param ListAppInstancesRequest 请求对象
     * @return SyncInvoker<ListAppInstancesRequest, ListAppInstancesResponse>
     */
    public SyncInvoker<ListAppInstancesRequest, ListAppInstancesResponse> listAppInstancesInvoker(ListAppInstancesRequest request) {
        return new SyncInvoker<ListAppInstancesRequest, ListAppInstancesResponse>(request, IoTEdgeMeta.listAppInstances, hcClient);
    }

    /**
     * 更新应用实例
     *
     * 应用服务器可调用此接口为更新应用实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateAppInstanceRequest 请求对象
     * @return UpdateAppInstanceResponse
     */
    public UpdateAppInstanceResponse updateAppInstance(UpdateAppInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, IoTEdgeMeta.updateAppInstance);
    }

    /**
     * 更新应用实例
     *
     * 应用服务器可调用此接口为更新应用实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateAppInstanceRequest 请求对象
     * @return SyncInvoker<UpdateAppInstanceRequest, UpdateAppInstanceResponse>
     */
    public SyncInvoker<UpdateAppInstanceRequest, UpdateAppInstanceResponse> updateAppInstanceInvoker(UpdateAppInstanceRequest request) {
        return new SyncInvoker<UpdateAppInstanceRequest, UpdateAppInstanceResponse>(request, IoTEdgeMeta.updateAppInstance, hcClient);
    }

    /**
     * 创建应用版本
     *
     * 应用服务器可调用此接口为创建应用版本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateAppVersionRequest 请求对象
     * @return CreateAppVersionResponse
     */
    public CreateAppVersionResponse createAppVersion(CreateAppVersionRequest request) {
        return hcClient.syncInvokeHttp(request, IoTEdgeMeta.createAppVersion);
    }

    /**
     * 创建应用版本
     *
     * 应用服务器可调用此接口为创建应用版本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateAppVersionRequest 请求对象
     * @return SyncInvoker<CreateAppVersionRequest, CreateAppVersionResponse>
     */
    public SyncInvoker<CreateAppVersionRequest, CreateAppVersionResponse> createAppVersionInvoker(CreateAppVersionRequest request) {
        return new SyncInvoker<CreateAppVersionRequest, CreateAppVersionResponse>(request, IoTEdgeMeta.createAppVersion, hcClient);
    }

    /**
     * 删除应用版本
     *
     * 应用服务器可调用此接口删除应用版本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteAppVersionRequest 请求对象
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
     * @param DeleteAppVersionRequest 请求对象
     * @return SyncInvoker<DeleteAppVersionRequest, DeleteAppVersionResponse>
     */
    public SyncInvoker<DeleteAppVersionRequest, DeleteAppVersionResponse> deleteAppVersionInvoker(DeleteAppVersionRequest request) {
        return new SyncInvoker<DeleteAppVersionRequest, DeleteAppVersionResponse>(request, IoTEdgeMeta.deleteAppVersion, hcClient);
    }

    /**
     * 下载应用版本Chart包
     *
     * 应用服务器可调用此接口下载应用版本Chart包。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DownloadAppVersionRequest 请求对象
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
     * @param DownloadAppVersionRequest 请求对象
     * @return SyncInvoker<DownloadAppVersionRequest, DownloadAppVersionResponse>
     */
    public SyncInvoker<DownloadAppVersionRequest, DownloadAppVersionResponse> downloadAppVersionInvoker(DownloadAppVersionRequest request) {
        return new SyncInvoker<DownloadAppVersionRequest, DownloadAppVersionResponse>(request, IoTEdgeMeta.downloadAppVersion, hcClient);
    }

    /**
     * 查询应用版本包含的镜像列表
     *
     * 应用服务器可调用此接口查询应用版本包含的镜像列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAppImageRequest 请求对象
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
     * @param ListAppImageRequest 请求对象
     * @return SyncInvoker<ListAppImageRequest, ListAppImageResponse>
     */
    public SyncInvoker<ListAppImageRequest, ListAppImageResponse> listAppImageInvoker(ListAppImageRequest request) {
        return new SyncInvoker<ListAppImageRequest, ListAppImageResponse>(request, IoTEdgeMeta.listAppImage, hcClient);
    }

    /**
     * 查询应用版本列表
     *
     * 应用服务器可调用此接口查询应用版本列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAppVersionsRequest 请求对象
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
     * @param ListAppVersionsRequest 请求对象
     * @return SyncInvoker<ListAppVersionsRequest, ListAppVersionsResponse>
     */
    public SyncInvoker<ListAppVersionsRequest, ListAppVersionsResponse> listAppVersionsInvoker(ListAppVersionsRequest request) {
        return new SyncInvoker<ListAppVersionsRequest, ListAppVersionsResponse>(request, IoTEdgeMeta.listAppVersions, hcClient);
    }

    /**
     * 查询应用版本详情
     *
     * 应用服务器可调用此接口查询应用版本详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAppVersionRequest 请求对象
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
     * @param ShowAppVersionRequest 请求对象
     * @return SyncInvoker<ShowAppVersionRequest, ShowAppVersionResponse>
     */
    public SyncInvoker<ShowAppVersionRequest, ShowAppVersionResponse> showAppVersionInvoker(ShowAppVersionRequest request) {
        return new SyncInvoker<ShowAppVersionRequest, ShowAppVersionResponse>(request, IoTEdgeMeta.showAppVersion, hcClient);
    }

    /**
     * 创建边缘集群
     *
     * 应用服务器可调用此接口为创建边缘集群。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateClusterRequest 请求对象
     * @return CreateClusterResponse
     */
    public CreateClusterResponse createCluster(CreateClusterRequest request) {
        return hcClient.syncInvokeHttp(request, IoTEdgeMeta.createCluster);
    }

    /**
     * 创建边缘集群
     *
     * 应用服务器可调用此接口为创建边缘集群。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateClusterRequest 请求对象
     * @return SyncInvoker<CreateClusterRequest, CreateClusterResponse>
     */
    public SyncInvoker<CreateClusterRequest, CreateClusterResponse> createClusterInvoker(CreateClusterRequest request) {
        return new SyncInvoker<CreateClusterRequest, CreateClusterResponse>(request, IoTEdgeMeta.createCluster, hcClient);
    }

    /**
     * 生成边缘集群安装命令
     *
     * 应用服务器可调用此接口生成边缘集群安装命令。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateInstallCmdRequest 请求对象
     * @return CreateInstallCmdResponse
     */
    public CreateInstallCmdResponse createInstallCmd(CreateInstallCmdRequest request) {
        return hcClient.syncInvokeHttp(request, IoTEdgeMeta.createInstallCmd);
    }

    /**
     * 生成边缘集群安装命令
     *
     * 应用服务器可调用此接口生成边缘集群安装命令。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateInstallCmdRequest 请求对象
     * @return SyncInvoker<CreateInstallCmdRequest, CreateInstallCmdResponse>
     */
    public SyncInvoker<CreateInstallCmdRequest, CreateInstallCmdResponse> createInstallCmdInvoker(CreateInstallCmdRequest request) {
        return new SyncInvoker<CreateInstallCmdRequest, CreateInstallCmdResponse>(request, IoTEdgeMeta.createInstallCmd, hcClient);
    }

    /**
     * 删除边缘集群
     *
     * 应用服务器可调用此接口删除边缘集群。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteClusterRequest 请求对象
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
     * @param DeleteClusterRequest 请求对象
     * @return SyncInvoker<DeleteClusterRequest, DeleteClusterResponse>
     */
    public SyncInvoker<DeleteClusterRequest, DeleteClusterResponse> deleteClusterInvoker(DeleteClusterRequest request) {
        return new SyncInvoker<DeleteClusterRequest, DeleteClusterResponse>(request, IoTEdgeMeta.deleteCluster, hcClient);
    }

    /**
     * 查询边缘集群列表
     *
     * 应用服务器可调用此接口查询边缘集群列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListClustersRequest 请求对象
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
     * @param ListClustersRequest 请求对象
     * @return SyncInvoker<ListClustersRequest, ListClustersResponse>
     */
    public SyncInvoker<ListClustersRequest, ListClustersResponse> listClustersInvoker(ListClustersRequest request) {
        return new SyncInvoker<ListClustersRequest, ListClustersResponse>(request, IoTEdgeMeta.listClusters, hcClient);
    }

    /**
     * 查询边缘集群详情
     *
     * 应用服务器可调用此接口查询边缘集群详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowClusterRequest 请求对象
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
     * @param ShowClusterRequest 请求对象
     * @return SyncInvoker<ShowClusterRequest, ShowClusterResponse>
     */
    public SyncInvoker<ShowClusterRequest, ShowClusterResponse> showClusterInvoker(ShowClusterRequest request) {
        return new SyncInvoker<ShowClusterRequest, ShowClusterResponse>(request, IoTEdgeMeta.showCluster, hcClient);
    }

}