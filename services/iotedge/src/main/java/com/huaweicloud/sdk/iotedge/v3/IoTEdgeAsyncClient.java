package com.huaweicloud.sdk.iotedge.v3;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
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

import java.util.concurrent.CompletableFuture;

public class IoTEdgeAsyncClient {

    protected HcClient hcClient;

    public IoTEdgeAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<IoTEdgeAsyncClient> newBuilder() {
        ClientBuilder<IoTEdgeAsyncClient> clientBuilder = new ClientBuilder<>(IoTEdgeAsyncClient::new);
        return clientBuilder;
    }

    /**
     * 创建应用模板
     *
     * 应用服务器可调用此接口为创建批量处理任务，对多个设备进行批量操作。当前支持批量软固件升级、批量创建设备、批量删除设备、批量冻结、批量解冻、批量下发同步命令、批量下发异步命令。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAppRequest 请求对象
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
     * @param request CreateAppRequest 请求对象
     * @return AsyncInvoker<CreateAppRequest, CreateAppResponse>
     */
    public AsyncInvoker<CreateAppRequest, CreateAppResponse> createAppAsyncInvoker(CreateAppRequest request) {
        return new AsyncInvoker<>(request, IoTEdgeMeta.createApp, hcClient);
    }

    /**
     * 删除应用模板
     *
     * 应用服务器可调用此接口删除应用模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAppRequest 请求对象
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
     * @param request DeleteAppRequest 请求对象
     * @return AsyncInvoker<DeleteAppRequest, DeleteAppResponse>
     */
    public AsyncInvoker<DeleteAppRequest, DeleteAppResponse> deleteAppAsyncInvoker(DeleteAppRequest request) {
        return new AsyncInvoker<>(request, IoTEdgeMeta.deleteApp, hcClient);
    }

    /**
     * 查询应用模板列表
     *
     * 应用服务器可调用此接口查询应用模板列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAppsRequest 请求对象
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
     * @param request ListAppsRequest 请求对象
     * @return AsyncInvoker<ListAppsRequest, ListAppsResponse>
     */
    public AsyncInvoker<ListAppsRequest, ListAppsResponse> listAppsAsyncInvoker(ListAppsRequest request) {
        return new AsyncInvoker<>(request, IoTEdgeMeta.listApps, hcClient);
    }

    /**
     * 查询应用模板详情
     *
     * 应用服务器可调用此接口查询物联网平台中指定批量任务的信息，包括任务内容、任务状态、任务完成情况统计以及子任务列表等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAppRequest 请求对象
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
     * @param request ShowAppRequest 请求对象
     * @return AsyncInvoker<ShowAppRequest, ShowAppResponse>
     */
    public AsyncInvoker<ShowAppRequest, ShowAppResponse> showAppAsyncInvoker(ShowAppRequest request) {
        return new AsyncInvoker<>(request, IoTEdgeMeta.showApp, hcClient);
    }

    /**
     * 创建应用实例
     *
     * 应用服务器可调用此接口为创建应用实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAppInstanceRequest 请求对象
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
     * @param request CreateAppInstanceRequest 请求对象
     * @return AsyncInvoker<CreateAppInstanceRequest, CreateAppInstanceResponse>
     */
    public AsyncInvoker<CreateAppInstanceRequest, CreateAppInstanceResponse> createAppInstanceAsyncInvoker(
        CreateAppInstanceRequest request) {
        return new AsyncInvoker<>(request, IoTEdgeMeta.createAppInstance, hcClient);
    }

    /**
     * 删除应用实例
     *
     * 应用服务器可调用此接口为删除应用实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAppInstanceRequest 请求对象
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
     * @param request DeleteAppInstanceRequest 请求对象
     * @return AsyncInvoker<DeleteAppInstanceRequest, DeleteAppInstanceResponse>
     */
    public AsyncInvoker<DeleteAppInstanceRequest, DeleteAppInstanceResponse> deleteAppInstanceAsyncInvoker(
        DeleteAppInstanceRequest request) {
        return new AsyncInvoker<>(request, IoTEdgeMeta.deleteAppInstance, hcClient);
    }

    /**
     * 查询应用实例的历史版本列表
     *
     * 应用服务器可调用此接口查询应用实例的历史版本列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAppInstanceHistoryRequest 请求对象
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
     * @param request ListAppInstanceHistoryRequest 请求对象
     * @return AsyncInvoker<ListAppInstanceHistoryRequest, ListAppInstanceHistoryResponse>
     */
    public AsyncInvoker<ListAppInstanceHistoryRequest, ListAppInstanceHistoryResponse> listAppInstanceHistoryAsyncInvoker(
        ListAppInstanceHistoryRequest request) {
        return new AsyncInvoker<>(request, IoTEdgeMeta.listAppInstanceHistory, hcClient);
    }

    /**
     * 查询应用实例列表
     *
     * 应用服务器可调用此接口查询应用实例列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAppInstancesRequest 请求对象
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
     * @param request ListAppInstancesRequest 请求对象
     * @return AsyncInvoker<ListAppInstancesRequest, ListAppInstancesResponse>
     */
    public AsyncInvoker<ListAppInstancesRequest, ListAppInstancesResponse> listAppInstancesAsyncInvoker(
        ListAppInstancesRequest request) {
        return new AsyncInvoker<>(request, IoTEdgeMeta.listAppInstances, hcClient);
    }

    /**
     * 更新应用实例
     *
     * 应用服务器可调用此接口为更新应用实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAppInstanceRequest 请求对象
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
     * @param request UpdateAppInstanceRequest 请求对象
     * @return AsyncInvoker<UpdateAppInstanceRequest, UpdateAppInstanceResponse>
     */
    public AsyncInvoker<UpdateAppInstanceRequest, UpdateAppInstanceResponse> updateAppInstanceAsyncInvoker(
        UpdateAppInstanceRequest request) {
        return new AsyncInvoker<>(request, IoTEdgeMeta.updateAppInstance, hcClient);
    }

    /**
     * 创建应用版本
     *
     * 应用服务器可调用此接口为创建应用版本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAppVersionRequest 请求对象
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
     * @param request CreateAppVersionRequest 请求对象
     * @return AsyncInvoker<CreateAppVersionRequest, CreateAppVersionResponse>
     */
    public AsyncInvoker<CreateAppVersionRequest, CreateAppVersionResponse> createAppVersionAsyncInvoker(
        CreateAppVersionRequest request) {
        return new AsyncInvoker<>(request, IoTEdgeMeta.createAppVersion, hcClient);
    }

    /**
     * 删除应用版本
     *
     * 应用服务器可调用此接口删除应用版本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAppVersionRequest 请求对象
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
     * @param request DeleteAppVersionRequest 请求对象
     * @return AsyncInvoker<DeleteAppVersionRequest, DeleteAppVersionResponse>
     */
    public AsyncInvoker<DeleteAppVersionRequest, DeleteAppVersionResponse> deleteAppVersionAsyncInvoker(
        DeleteAppVersionRequest request) {
        return new AsyncInvoker<>(request, IoTEdgeMeta.deleteAppVersion, hcClient);
    }

    /**
     * 下载应用版本Chart包
     *
     * 应用服务器可调用此接口下载应用版本Chart包。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadAppVersionRequest 请求对象
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
     * @param request DownloadAppVersionRequest 请求对象
     * @return AsyncInvoker<DownloadAppVersionRequest, DownloadAppVersionResponse>
     */
    public AsyncInvoker<DownloadAppVersionRequest, DownloadAppVersionResponse> downloadAppVersionAsyncInvoker(
        DownloadAppVersionRequest request) {
        return new AsyncInvoker<>(request, IoTEdgeMeta.downloadAppVersion, hcClient);
    }

    /**
     * 查询应用版本包含的镜像列表
     *
     * 应用服务器可调用此接口查询应用版本包含的镜像列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAppImageRequest 请求对象
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
     * @param request ListAppImageRequest 请求对象
     * @return AsyncInvoker<ListAppImageRequest, ListAppImageResponse>
     */
    public AsyncInvoker<ListAppImageRequest, ListAppImageResponse> listAppImageAsyncInvoker(
        ListAppImageRequest request) {
        return new AsyncInvoker<>(request, IoTEdgeMeta.listAppImage, hcClient);
    }

    /**
     * 查询应用版本列表
     *
     * 应用服务器可调用此接口查询应用版本列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAppVersionsRequest 请求对象
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
     * @param request ListAppVersionsRequest 请求对象
     * @return AsyncInvoker<ListAppVersionsRequest, ListAppVersionsResponse>
     */
    public AsyncInvoker<ListAppVersionsRequest, ListAppVersionsResponse> listAppVersionsAsyncInvoker(
        ListAppVersionsRequest request) {
        return new AsyncInvoker<>(request, IoTEdgeMeta.listAppVersions, hcClient);
    }

    /**
     * 查询应用版本详情
     *
     * 应用服务器可调用此接口查询应用版本详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAppVersionRequest 请求对象
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
     * @param request ShowAppVersionRequest 请求对象
     * @return AsyncInvoker<ShowAppVersionRequest, ShowAppVersionResponse>
     */
    public AsyncInvoker<ShowAppVersionRequest, ShowAppVersionResponse> showAppVersionAsyncInvoker(
        ShowAppVersionRequest request) {
        return new AsyncInvoker<>(request, IoTEdgeMeta.showAppVersion, hcClient);
    }

    /**
     * 创建边缘集群
     *
     * 应用服务器可调用此接口为创建边缘集群。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateClusterRequest 请求对象
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
     * @param request CreateClusterRequest 请求对象
     * @return AsyncInvoker<CreateClusterRequest, CreateClusterResponse>
     */
    public AsyncInvoker<CreateClusterRequest, CreateClusterResponse> createClusterAsyncInvoker(
        CreateClusterRequest request) {
        return new AsyncInvoker<>(request, IoTEdgeMeta.createCluster, hcClient);
    }

    /**
     * 生成边缘集群安装命令
     *
     * 应用服务器可调用此接口生成边缘集群安装命令。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateClusterInstallCmdRequest 请求对象
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
     * @param request CreateClusterInstallCmdRequest 请求对象
     * @return AsyncInvoker<CreateClusterInstallCmdRequest, CreateClusterInstallCmdResponse>
     */
    public AsyncInvoker<CreateClusterInstallCmdRequest, CreateClusterInstallCmdResponse> createClusterInstallCmdAsyncInvoker(
        CreateClusterInstallCmdRequest request) {
        return new AsyncInvoker<>(request, IoTEdgeMeta.createClusterInstallCmd, hcClient);
    }

    /**
     * 删除边缘集群
     *
     * 应用服务器可调用此接口删除边缘集群。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteClusterRequest 请求对象
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
     * @param request DeleteClusterRequest 请求对象
     * @return AsyncInvoker<DeleteClusterRequest, DeleteClusterResponse>
     */
    public AsyncInvoker<DeleteClusterRequest, DeleteClusterResponse> deleteClusterAsyncInvoker(
        DeleteClusterRequest request) {
        return new AsyncInvoker<>(request, IoTEdgeMeta.deleteCluster, hcClient);
    }

    /**
     * 查询边缘集群列表
     *
     * 应用服务器可调用此接口查询边缘集群列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListClustersRequest 请求对象
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
     * @param request ListClustersRequest 请求对象
     * @return AsyncInvoker<ListClustersRequest, ListClustersResponse>
     */
    public AsyncInvoker<ListClustersRequest, ListClustersResponse> listClustersAsyncInvoker(
        ListClustersRequest request) {
        return new AsyncInvoker<>(request, IoTEdgeMeta.listClusters, hcClient);
    }

    /**
     * 查询边缘集群详情
     *
     * 应用服务器可调用此接口查询边缘集群详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowClusterRequest 请求对象
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
     * @param request ShowClusterRequest 请求对象
     * @return AsyncInvoker<ShowClusterRequest, ShowClusterResponse>
     */
    public AsyncInvoker<ShowClusterRequest, ShowClusterResponse> showClusterAsyncInvoker(ShowClusterRequest request) {
        return new AsyncInvoker<>(request, IoTEdgeMeta.showCluster, hcClient);
    }

    /**
     * 查询资源列表-企业版
     *
     * 查询资源列表-企业版
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowClusterResourcesRequest 请求对象
     * @return CompletableFuture<ShowClusterResourcesResponse>
     */
    public CompletableFuture<ShowClusterResourcesResponse> showClusterResourcesAsync(
        ShowClusterResourcesRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTEdgeMeta.showClusterResources);
    }

    /**
     * 查询资源列表-企业版
     *
     * 查询资源列表-企业版
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowClusterResourcesRequest 请求对象
     * @return AsyncInvoker<ShowClusterResourcesRequest, ShowClusterResourcesResponse>
     */
    public AsyncInvoker<ShowClusterResourcesRequest, ShowClusterResourcesResponse> showClusterResourcesAsyncInvoker(
        ShowClusterResourcesRequest request) {
        return new AsyncInvoker<>(request, IoTEdgeMeta.showClusterResources, hcClient);
    }

    /**
     * 更改资源绑定信息-企业版
     *
     * 更改资源绑定信息-企业版
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateResourceBindingRequest 请求对象
     * @return CompletableFuture<UpdateResourceBindingResponse>
     */
    public CompletableFuture<UpdateResourceBindingResponse> updateResourceBindingAsync(
        UpdateResourceBindingRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTEdgeMeta.updateResourceBinding);
    }

    /**
     * 更改资源绑定信息-企业版
     *
     * 更改资源绑定信息-企业版
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateResourceBindingRequest 请求对象
     * @return AsyncInvoker<UpdateResourceBindingRequest, UpdateResourceBindingResponse>
     */
    public AsyncInvoker<UpdateResourceBindingRequest, UpdateResourceBindingResponse> updateResourceBindingAsyncInvoker(
        UpdateResourceBindingRequest request) {
        return new AsyncInvoker<>(request, IoTEdgeMeta.updateResourceBinding, hcClient);
    }

    /**
     * 转发k8s API
     *
     * 转发k8s API。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request InvokeKubeApiRequest 请求对象
     * @return CompletableFuture<InvokeKubeApiResponse>
     */
    public CompletableFuture<InvokeKubeApiResponse> invokeKubeApiAsync(InvokeKubeApiRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTEdgeMeta.invokeKubeApi);
    }

    /**
     * 转发k8s API
     *
     * 转发k8s API。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request InvokeKubeApiRequest 请求对象
     * @return AsyncInvoker<InvokeKubeApiRequest, InvokeKubeApiResponse>
     */
    public AsyncInvoker<InvokeKubeApiRequest, InvokeKubeApiResponse> invokeKubeApiAsyncInvoker(
        InvokeKubeApiRequest request) {
        return new AsyncInvoker<>(request, IoTEdgeMeta.invokeKubeApi, hcClient);
    }

    /**
     * 查询命名空间列表
     *
     * 应用服务器可调用此接口查询命名空间列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListClusterNamespacesRequest 请求对象
     * @return CompletableFuture<ListClusterNamespacesResponse>
     */
    public CompletableFuture<ListClusterNamespacesResponse> listClusterNamespacesAsync(
        ListClusterNamespacesRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTEdgeMeta.listClusterNamespaces);
    }

    /**
     * 查询命名空间列表
     *
     * 应用服务器可调用此接口查询命名空间列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListClusterNamespacesRequest 请求对象
     * @return AsyncInvoker<ListClusterNamespacesRequest, ListClusterNamespacesResponse>
     */
    public AsyncInvoker<ListClusterNamespacesRequest, ListClusterNamespacesResponse> listClusterNamespacesAsyncInvoker(
        ListClusterNamespacesRequest request) {
        return new AsyncInvoker<>(request, IoTEdgeMeta.listClusterNamespaces, hcClient);
    }

    /**
     * 生成安装集群节点的安装命令
     *
     * 生成安装集群节点的安装命令。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateClusterNodesInstallCmdRequest 请求对象
     * @return CompletableFuture<CreateClusterNodesInstallCmdResponse>
     */
    public CompletableFuture<CreateClusterNodesInstallCmdResponse> createClusterNodesInstallCmdAsync(
        CreateClusterNodesInstallCmdRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTEdgeMeta.createClusterNodesInstallCmd);
    }

    /**
     * 生成安装集群节点的安装命令
     *
     * 生成安装集群节点的安装命令。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateClusterNodesInstallCmdRequest 请求对象
     * @return AsyncInvoker<CreateClusterNodesInstallCmdRequest, CreateClusterNodesInstallCmdResponse>
     */
    public AsyncInvoker<CreateClusterNodesInstallCmdRequest, CreateClusterNodesInstallCmdResponse> createClusterNodesInstallCmdAsyncInvoker(
        CreateClusterNodesInstallCmdRequest request) {
        return new AsyncInvoker<>(request, IoTEdgeMeta.createClusterNodesInstallCmd, hcClient);
    }

    /**
     * 查询集群的节点列表
     *
     * 应用服务器可调用此接口查询集群的节点列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListClusterNodesRequest 请求对象
     * @return CompletableFuture<ListClusterNodesResponse>
     */
    public CompletableFuture<ListClusterNodesResponse> listClusterNodesAsync(ListClusterNodesRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTEdgeMeta.listClusterNodes);
    }

    /**
     * 查询集群的节点列表
     *
     * 应用服务器可调用此接口查询集群的节点列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListClusterNodesRequest 请求对象
     * @return AsyncInvoker<ListClusterNodesRequest, ListClusterNodesResponse>
     */
    public AsyncInvoker<ListClusterNodesRequest, ListClusterNodesResponse> listClusterNodesAsyncInvoker(
        ListClusterNodesRequest request) {
        return new AsyncInvoker<>(request, IoTEdgeMeta.listClusterNodes, hcClient);
    }

    /**
     * 查询集群的节点详情
     *
     * 应用服务器可调用此接口查询集群的节点详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowClusterNodeRequest 请求对象
     * @return CompletableFuture<ShowClusterNodeResponse>
     */
    public CompletableFuture<ShowClusterNodeResponse> showClusterNodeAsync(ShowClusterNodeRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTEdgeMeta.showClusterNode);
    }

    /**
     * 查询集群的节点详情
     *
     * 应用服务器可调用此接口查询集群的节点详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowClusterNodeRequest 请求对象
     * @return AsyncInvoker<ShowClusterNodeRequest, ShowClusterNodeResponse>
     */
    public AsyncInvoker<ShowClusterNodeRequest, ShowClusterNodeResponse> showClusterNodeAsyncInvoker(
        ShowClusterNodeRequest request) {
        return new AsyncInvoker<>(request, IoTEdgeMeta.showClusterNode, hcClient);
    }

}
