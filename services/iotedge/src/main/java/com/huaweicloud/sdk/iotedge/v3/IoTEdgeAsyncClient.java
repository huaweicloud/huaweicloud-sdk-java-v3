package com.huaweicloud.sdk.iotedge.v3;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.iotedge.v3.model.*;

import java.util.concurrent.CompletableFuture;

public class IoTEdgeAsyncClient {

    protected HcClient hcClient;

    public IoTEdgeAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<IoTEdgeAsyncClient> newBuilder() {
        return new ClientBuilder<>(IoTEdgeAsyncClient::new);
    }

    /**
     * 创建应用模板
     *
     * 应用服务器可调用此接口为创建批量处理任务，对多个设备进行批量操作。当前支持批量软固件升级、批量创建设备、批量删除设备、批量冻结、批量解冻、批量下发同步命令、批量下发异步命令。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateAppRequest 请求对象
     * @return CompletableFuture<CreateAppResponse>
     */
    public CompletableFuture<CreateAppResponse> createAppAsync(CreateAppRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTEdgeMeta.createApp);
    }

    /**
     * 创建应用模板
     *
     * 应用服务器可调用此接口为创建批量处理任务，对多个设备进行批量操作。当前支持批量软固件升级、批量创建设备、批量删除设备、批量冻结、批量解冻、批量下发同步命令、批量下发异步命令。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateAppRequest 请求对象
     * @return AsyncInvoker<CreateAppRequest, CreateAppResponse>
     */
    public AsyncInvoker<CreateAppRequest, CreateAppResponse> createAppAsyncInvoker(CreateAppRequest request) {
        return new AsyncInvoker<CreateAppRequest, CreateAppResponse>(request, IoTEdgeMeta.createApp, hcClient);
    }

    /**
     * 删除应用模板
     *
     * 应用服务器可调用此接口删除应用模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteAppRequest 请求对象
     * @return CompletableFuture<DeleteAppResponse>
     */
    public CompletableFuture<DeleteAppResponse> deleteAppAsync(DeleteAppRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTEdgeMeta.deleteApp);
    }

    /**
     * 删除应用模板
     *
     * 应用服务器可调用此接口删除应用模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteAppRequest 请求对象
     * @return AsyncInvoker<DeleteAppRequest, DeleteAppResponse>
     */
    public AsyncInvoker<DeleteAppRequest, DeleteAppResponse> deleteAppAsyncInvoker(DeleteAppRequest request) {
        return new AsyncInvoker<DeleteAppRequest, DeleteAppResponse>(request, IoTEdgeMeta.deleteApp, hcClient);
    }

    /**
     * 查询应用模板列表
     *
     * 应用服务器可调用此接口查询应用模板列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAppsRequest 请求对象
     * @return CompletableFuture<ListAppsResponse>
     */
    public CompletableFuture<ListAppsResponse> listAppsAsync(ListAppsRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTEdgeMeta.listApps);
    }

    /**
     * 查询应用模板列表
     *
     * 应用服务器可调用此接口查询应用模板列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAppsRequest 请求对象
     * @return AsyncInvoker<ListAppsRequest, ListAppsResponse>
     */
    public AsyncInvoker<ListAppsRequest, ListAppsResponse> listAppsAsyncInvoker(ListAppsRequest request) {
        return new AsyncInvoker<ListAppsRequest, ListAppsResponse>(request, IoTEdgeMeta.listApps, hcClient);
    }

    /**
     * 查询应用模板详情
     *
     * 应用服务器可调用此接口查询物联网平台中指定批量任务的信息，包括任务内容、任务状态、任务完成情况统计以及子任务列表等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAppRequest 请求对象
     * @return CompletableFuture<ShowAppResponse>
     */
    public CompletableFuture<ShowAppResponse> showAppAsync(ShowAppRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTEdgeMeta.showApp);
    }

    /**
     * 查询应用模板详情
     *
     * 应用服务器可调用此接口查询物联网平台中指定批量任务的信息，包括任务内容、任务状态、任务完成情况统计以及子任务列表等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAppRequest 请求对象
     * @return AsyncInvoker<ShowAppRequest, ShowAppResponse>
     */
    public AsyncInvoker<ShowAppRequest, ShowAppResponse> showAppAsyncInvoker(ShowAppRequest request) {
        return new AsyncInvoker<ShowAppRequest, ShowAppResponse>(request, IoTEdgeMeta.showApp, hcClient);
    }

    /**
     * 创建应用实例
     *
     * 应用服务器可调用此接口为创建应用实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateAppInstanceRequest 请求对象
     * @return CompletableFuture<CreateAppInstanceResponse>
     */
    public CompletableFuture<CreateAppInstanceResponse> createAppInstanceAsync(CreateAppInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTEdgeMeta.createAppInstance);
    }

    /**
     * 创建应用实例
     *
     * 应用服务器可调用此接口为创建应用实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateAppInstanceRequest 请求对象
     * @return AsyncInvoker<CreateAppInstanceRequest, CreateAppInstanceResponse>
     */
    public AsyncInvoker<CreateAppInstanceRequest, CreateAppInstanceResponse> createAppInstanceAsyncInvoker(
        CreateAppInstanceRequest request) {
        return new AsyncInvoker<CreateAppInstanceRequest, CreateAppInstanceResponse>(request,
            IoTEdgeMeta.createAppInstance, hcClient);
    }

    /**
     * 删除应用实例
     *
     * 应用服务器可调用此接口为删除应用实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteAppInstanceRequest 请求对象
     * @return CompletableFuture<DeleteAppInstanceResponse>
     */
    public CompletableFuture<DeleteAppInstanceResponse> deleteAppInstanceAsync(DeleteAppInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTEdgeMeta.deleteAppInstance);
    }

    /**
     * 删除应用实例
     *
     * 应用服务器可调用此接口为删除应用实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteAppInstanceRequest 请求对象
     * @return AsyncInvoker<DeleteAppInstanceRequest, DeleteAppInstanceResponse>
     */
    public AsyncInvoker<DeleteAppInstanceRequest, DeleteAppInstanceResponse> deleteAppInstanceAsyncInvoker(
        DeleteAppInstanceRequest request) {
        return new AsyncInvoker<DeleteAppInstanceRequest, DeleteAppInstanceResponse>(request,
            IoTEdgeMeta.deleteAppInstance, hcClient);
    }

    /**
     * 查询应用实例的历史版本列表
     *
     * 应用服务器可调用此接口查询应用实例的历史版本列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAppInstanceHistoryRequest 请求对象
     * @return CompletableFuture<ListAppInstanceHistoryResponse>
     */
    public CompletableFuture<ListAppInstanceHistoryResponse> listAppInstanceHistoryAsync(
        ListAppInstanceHistoryRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTEdgeMeta.listAppInstanceHistory);
    }

    /**
     * 查询应用实例的历史版本列表
     *
     * 应用服务器可调用此接口查询应用实例的历史版本列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAppInstanceHistoryRequest 请求对象
     * @return AsyncInvoker<ListAppInstanceHistoryRequest, ListAppInstanceHistoryResponse>
     */
    public AsyncInvoker<ListAppInstanceHistoryRequest, ListAppInstanceHistoryResponse> listAppInstanceHistoryAsyncInvoker(
        ListAppInstanceHistoryRequest request) {
        return new AsyncInvoker<ListAppInstanceHistoryRequest, ListAppInstanceHistoryResponse>(request,
            IoTEdgeMeta.listAppInstanceHistory, hcClient);
    }

    /**
     * 查询应用实例列表
     *
     * 应用服务器可调用此接口查询应用实例列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAppInstancesRequest 请求对象
     * @return CompletableFuture<ListAppInstancesResponse>
     */
    public CompletableFuture<ListAppInstancesResponse> listAppInstancesAsync(ListAppInstancesRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTEdgeMeta.listAppInstances);
    }

    /**
     * 查询应用实例列表
     *
     * 应用服务器可调用此接口查询应用实例列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAppInstancesRequest 请求对象
     * @return AsyncInvoker<ListAppInstancesRequest, ListAppInstancesResponse>
     */
    public AsyncInvoker<ListAppInstancesRequest, ListAppInstancesResponse> listAppInstancesAsyncInvoker(
        ListAppInstancesRequest request) {
        return new AsyncInvoker<ListAppInstancesRequest, ListAppInstancesResponse>(request,
            IoTEdgeMeta.listAppInstances, hcClient);
    }

    /**
     * 更新应用实例
     *
     * 应用服务器可调用此接口为更新应用实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateAppInstanceRequest 请求对象
     * @return CompletableFuture<UpdateAppInstanceResponse>
     */
    public CompletableFuture<UpdateAppInstanceResponse> updateAppInstanceAsync(UpdateAppInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTEdgeMeta.updateAppInstance);
    }

    /**
     * 更新应用实例
     *
     * 应用服务器可调用此接口为更新应用实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateAppInstanceRequest 请求对象
     * @return AsyncInvoker<UpdateAppInstanceRequest, UpdateAppInstanceResponse>
     */
    public AsyncInvoker<UpdateAppInstanceRequest, UpdateAppInstanceResponse> updateAppInstanceAsyncInvoker(
        UpdateAppInstanceRequest request) {
        return new AsyncInvoker<UpdateAppInstanceRequest, UpdateAppInstanceResponse>(request,
            IoTEdgeMeta.updateAppInstance, hcClient);
    }

    /**
     * 创建应用版本
     *
     * 应用服务器可调用此接口为创建应用版本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateAppVersionRequest 请求对象
     * @return CompletableFuture<CreateAppVersionResponse>
     */
    public CompletableFuture<CreateAppVersionResponse> createAppVersionAsync(CreateAppVersionRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTEdgeMeta.createAppVersion);
    }

    /**
     * 创建应用版本
     *
     * 应用服务器可调用此接口为创建应用版本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateAppVersionRequest 请求对象
     * @return AsyncInvoker<CreateAppVersionRequest, CreateAppVersionResponse>
     */
    public AsyncInvoker<CreateAppVersionRequest, CreateAppVersionResponse> createAppVersionAsyncInvoker(
        CreateAppVersionRequest request) {
        return new AsyncInvoker<CreateAppVersionRequest, CreateAppVersionResponse>(request,
            IoTEdgeMeta.createAppVersion, hcClient);
    }

    /**
     * 删除应用版本
     *
     * 应用服务器可调用此接口删除应用版本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteAppVersionRequest 请求对象
     * @return CompletableFuture<DeleteAppVersionResponse>
     */
    public CompletableFuture<DeleteAppVersionResponse> deleteAppVersionAsync(DeleteAppVersionRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTEdgeMeta.deleteAppVersion);
    }

    /**
     * 删除应用版本
     *
     * 应用服务器可调用此接口删除应用版本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteAppVersionRequest 请求对象
     * @return AsyncInvoker<DeleteAppVersionRequest, DeleteAppVersionResponse>
     */
    public AsyncInvoker<DeleteAppVersionRequest, DeleteAppVersionResponse> deleteAppVersionAsyncInvoker(
        DeleteAppVersionRequest request) {
        return new AsyncInvoker<DeleteAppVersionRequest, DeleteAppVersionResponse>(request,
            IoTEdgeMeta.deleteAppVersion, hcClient);
    }

    /**
     * 下载应用版本Chart包
     *
     * 应用服务器可调用此接口下载应用版本Chart包。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DownloadAppVersionRequest 请求对象
     * @return CompletableFuture<DownloadAppVersionResponse>
     */
    public CompletableFuture<DownloadAppVersionResponse> downloadAppVersionAsync(DownloadAppVersionRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTEdgeMeta.downloadAppVersion);
    }

    /**
     * 下载应用版本Chart包
     *
     * 应用服务器可调用此接口下载应用版本Chart包。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DownloadAppVersionRequest 请求对象
     * @return AsyncInvoker<DownloadAppVersionRequest, DownloadAppVersionResponse>
     */
    public AsyncInvoker<DownloadAppVersionRequest, DownloadAppVersionResponse> downloadAppVersionAsyncInvoker(
        DownloadAppVersionRequest request) {
        return new AsyncInvoker<DownloadAppVersionRequest, DownloadAppVersionResponse>(request,
            IoTEdgeMeta.downloadAppVersion, hcClient);
    }

    /**
     * 查询应用版本包含的镜像列表
     *
     * 应用服务器可调用此接口查询应用版本包含的镜像列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAppImageRequest 请求对象
     * @return CompletableFuture<ListAppImageResponse>
     */
    public CompletableFuture<ListAppImageResponse> listAppImageAsync(ListAppImageRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTEdgeMeta.listAppImage);
    }

    /**
     * 查询应用版本包含的镜像列表
     *
     * 应用服务器可调用此接口查询应用版本包含的镜像列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAppImageRequest 请求对象
     * @return AsyncInvoker<ListAppImageRequest, ListAppImageResponse>
     */
    public AsyncInvoker<ListAppImageRequest, ListAppImageResponse> listAppImageAsyncInvoker(
        ListAppImageRequest request) {
        return new AsyncInvoker<ListAppImageRequest, ListAppImageResponse>(request, IoTEdgeMeta.listAppImage, hcClient);
    }

    /**
     * 查询应用版本列表
     *
     * 应用服务器可调用此接口查询应用版本列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAppVersionsRequest 请求对象
     * @return CompletableFuture<ListAppVersionsResponse>
     */
    public CompletableFuture<ListAppVersionsResponse> listAppVersionsAsync(ListAppVersionsRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTEdgeMeta.listAppVersions);
    }

    /**
     * 查询应用版本列表
     *
     * 应用服务器可调用此接口查询应用版本列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAppVersionsRequest 请求对象
     * @return AsyncInvoker<ListAppVersionsRequest, ListAppVersionsResponse>
     */
    public AsyncInvoker<ListAppVersionsRequest, ListAppVersionsResponse> listAppVersionsAsyncInvoker(
        ListAppVersionsRequest request) {
        return new AsyncInvoker<ListAppVersionsRequest, ListAppVersionsResponse>(request, IoTEdgeMeta.listAppVersions,
            hcClient);
    }

    /**
     * 查询应用版本详情
     *
     * 应用服务器可调用此接口查询应用版本详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAppVersionRequest 请求对象
     * @return CompletableFuture<ShowAppVersionResponse>
     */
    public CompletableFuture<ShowAppVersionResponse> showAppVersionAsync(ShowAppVersionRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTEdgeMeta.showAppVersion);
    }

    /**
     * 查询应用版本详情
     *
     * 应用服务器可调用此接口查询应用版本详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAppVersionRequest 请求对象
     * @return AsyncInvoker<ShowAppVersionRequest, ShowAppVersionResponse>
     */
    public AsyncInvoker<ShowAppVersionRequest, ShowAppVersionResponse> showAppVersionAsyncInvoker(
        ShowAppVersionRequest request) {
        return new AsyncInvoker<ShowAppVersionRequest, ShowAppVersionResponse>(request, IoTEdgeMeta.showAppVersion,
            hcClient);
    }

    /**
     * 创建边缘集群
     *
     * 应用服务器可调用此接口为创建边缘集群。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateClusterRequest 请求对象
     * @return CompletableFuture<CreateClusterResponse>
     */
    public CompletableFuture<CreateClusterResponse> createClusterAsync(CreateClusterRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTEdgeMeta.createCluster);
    }

    /**
     * 创建边缘集群
     *
     * 应用服务器可调用此接口为创建边缘集群。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateClusterRequest 请求对象
     * @return AsyncInvoker<CreateClusterRequest, CreateClusterResponse>
     */
    public AsyncInvoker<CreateClusterRequest, CreateClusterResponse> createClusterAsyncInvoker(
        CreateClusterRequest request) {
        return new AsyncInvoker<CreateClusterRequest, CreateClusterResponse>(request, IoTEdgeMeta.createCluster,
            hcClient);
    }

    /**
     * 生成边缘集群安装命令
     *
     * 应用服务器可调用此接口生成边缘集群安装命令。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateClusterInstallCmdRequest 请求对象
     * @return CompletableFuture<CreateClusterInstallCmdResponse>
     */
    public CompletableFuture<CreateClusterInstallCmdResponse> createClusterInstallCmdAsync(
        CreateClusterInstallCmdRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTEdgeMeta.createClusterInstallCmd);
    }

    /**
     * 生成边缘集群安装命令
     *
     * 应用服务器可调用此接口生成边缘集群安装命令。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateClusterInstallCmdRequest 请求对象
     * @return AsyncInvoker<CreateClusterInstallCmdRequest, CreateClusterInstallCmdResponse>
     */
    public AsyncInvoker<CreateClusterInstallCmdRequest, CreateClusterInstallCmdResponse> createClusterInstallCmdAsyncInvoker(
        CreateClusterInstallCmdRequest request) {
        return new AsyncInvoker<CreateClusterInstallCmdRequest, CreateClusterInstallCmdResponse>(request,
            IoTEdgeMeta.createClusterInstallCmd, hcClient);
    }

    /**
     * 删除边缘集群
     *
     * 应用服务器可调用此接口删除边缘集群。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteClusterRequest 请求对象
     * @return CompletableFuture<DeleteClusterResponse>
     */
    public CompletableFuture<DeleteClusterResponse> deleteClusterAsync(DeleteClusterRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTEdgeMeta.deleteCluster);
    }

    /**
     * 删除边缘集群
     *
     * 应用服务器可调用此接口删除边缘集群。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteClusterRequest 请求对象
     * @return AsyncInvoker<DeleteClusterRequest, DeleteClusterResponse>
     */
    public AsyncInvoker<DeleteClusterRequest, DeleteClusterResponse> deleteClusterAsyncInvoker(
        DeleteClusterRequest request) {
        return new AsyncInvoker<DeleteClusterRequest, DeleteClusterResponse>(request, IoTEdgeMeta.deleteCluster,
            hcClient);
    }

    /**
     * 查询边缘集群列表
     *
     * 应用服务器可调用此接口查询边缘集群列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListClustersRequest 请求对象
     * @return CompletableFuture<ListClustersResponse>
     */
    public CompletableFuture<ListClustersResponse> listClustersAsync(ListClustersRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTEdgeMeta.listClusters);
    }

    /**
     * 查询边缘集群列表
     *
     * 应用服务器可调用此接口查询边缘集群列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListClustersRequest 请求对象
     * @return AsyncInvoker<ListClustersRequest, ListClustersResponse>
     */
    public AsyncInvoker<ListClustersRequest, ListClustersResponse> listClustersAsyncInvoker(
        ListClustersRequest request) {
        return new AsyncInvoker<ListClustersRequest, ListClustersResponse>(request, IoTEdgeMeta.listClusters, hcClient);
    }

    /**
     * 查询边缘集群详情
     *
     * 应用服务器可调用此接口查询边缘集群详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowClusterRequest 请求对象
     * @return CompletableFuture<ShowClusterResponse>
     */
    public CompletableFuture<ShowClusterResponse> showClusterAsync(ShowClusterRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTEdgeMeta.showCluster);
    }

    /**
     * 查询边缘集群详情
     *
     * 应用服务器可调用此接口查询边缘集群详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowClusterRequest 请求对象
     * @return AsyncInvoker<ShowClusterRequest, ShowClusterResponse>
     */
    public AsyncInvoker<ShowClusterRequest, ShowClusterResponse> showClusterAsyncInvoker(ShowClusterRequest request) {
        return new AsyncInvoker<ShowClusterRequest, ShowClusterResponse>(request, IoTEdgeMeta.showCluster, hcClient);
    }

}
