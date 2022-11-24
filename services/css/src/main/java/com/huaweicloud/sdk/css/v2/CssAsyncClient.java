package com.huaweicloud.sdk.css.v2;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.css.v2.model.*;

import java.util.concurrent.CompletableFuture;

public class CssAsyncClient {

    protected HcClient hcClient;

    public CssAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<CssAsyncClient> newBuilder() {
        return new ClientBuilder<>(CssAsyncClient::new);
    }

    /**
     * 创建集群V2
     *
     * 该接口用于创建拥有多种不同节点类型（ess，ess-cold，ess-client，ess-master）组合的集群。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateClusterRequest 请求对象
     * @return CompletableFuture<CreateClusterResponse>
     */
    public CompletableFuture<CreateClusterResponse> createClusterAsync(CreateClusterRequest request) {
        return hcClient.asyncInvokeHttp(request, CssMeta.createCluster);
    }

    /**
     * 创建集群V2
     *
     * 该接口用于创建拥有多种不同节点类型（ess，ess-cold，ess-client，ess-master）组合的集群。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateClusterRequest 请求对象
     * @return AsyncInvoker<CreateClusterRequest, CreateClusterResponse>
     */
    public AsyncInvoker<CreateClusterRequest, CreateClusterResponse> createClusterAsyncInvoker(
        CreateClusterRequest request) {
        return new AsyncInvoker<CreateClusterRequest, CreateClusterResponse>(request, CssMeta.createCluster, hcClient);
    }

    /**
     * 重启集群V2
     *
     * 该接口可以用于重启当前集群拥有的全部节点类型，或部分节点类型组合的节点。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RestartClusterRequest 请求对象
     * @return CompletableFuture<RestartClusterResponse>
     */
    public CompletableFuture<RestartClusterResponse> restartClusterAsync(RestartClusterRequest request) {
        return hcClient.asyncInvokeHttp(request, CssMeta.restartCluster);
    }

    /**
     * 重启集群V2
     *
     * 该接口可以用于重启当前集群拥有的全部节点类型，或部分节点类型组合的节点。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RestartClusterRequest 请求对象
     * @return AsyncInvoker<RestartClusterRequest, RestartClusterResponse>
     */
    public AsyncInvoker<RestartClusterRequest, RestartClusterResponse> restartClusterAsyncInvoker(
        RestartClusterRequest request) {
        return new AsyncInvoker<RestartClusterRequest, RestartClusterResponse>(request, CssMeta.restartCluster,
            hcClient);
    }

    /**
     * 滚动重启
     *
     * 该接口会一个一个重启节点，在索引数量比较多的情况下耗时较长
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RollingRestartRequest 请求对象
     * @return CompletableFuture<RollingRestartResponse>
     */
    public CompletableFuture<RollingRestartResponse> rollingRestartAsync(RollingRestartRequest request) {
        return hcClient.asyncInvokeHttp(request, CssMeta.rollingRestart);
    }

    /**
     * 滚动重启
     *
     * 该接口会一个一个重启节点，在索引数量比较多的情况下耗时较长
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RollingRestartRequest 请求对象
     * @return AsyncInvoker<RollingRestartRequest, RollingRestartResponse>
     */
    public AsyncInvoker<RollingRestartRequest, RollingRestartResponse> rollingRestartAsyncInvoker(
        RollingRestartRequest request) {
        return new AsyncInvoker<RollingRestartRequest, RollingRestartResponse>(request, CssMeta.rollingRestart,
            hcClient);
    }

    /**
     * 开启自动创建快照功能
     *
     * 该接口用于打开自动备份功能
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param StartAutoCreateSnapshotsRequest 请求对象
     * @return CompletableFuture<StartAutoCreateSnapshotsResponse>
     */
    public CompletableFuture<StartAutoCreateSnapshotsResponse> startAutoCreateSnapshotsAsync(
        StartAutoCreateSnapshotsRequest request) {
        return hcClient.asyncInvokeHttp(request, CssMeta.startAutoCreateSnapshots);
    }

    /**
     * 开启自动创建快照功能
     *
     * 该接口用于打开自动备份功能
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param StartAutoCreateSnapshotsRequest 请求对象
     * @return AsyncInvoker<StartAutoCreateSnapshotsRequest, StartAutoCreateSnapshotsResponse>
     */
    public AsyncInvoker<StartAutoCreateSnapshotsRequest, StartAutoCreateSnapshotsResponse> startAutoCreateSnapshotsAsyncInvoker(
        StartAutoCreateSnapshotsRequest request) {
        return new AsyncInvoker<StartAutoCreateSnapshotsRequest, StartAutoCreateSnapshotsResponse>(request,
            CssMeta.startAutoCreateSnapshots, hcClient);
    }

    /**
     * 关闭自动创建快照功能
     *
     * 该接口用于关闭自动备份功能。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param StopAutoCreateSnapshotsRequest 请求对象
     * @return CompletableFuture<StopAutoCreateSnapshotsResponse>
     */
    public CompletableFuture<StopAutoCreateSnapshotsResponse> stopAutoCreateSnapshotsAsync(
        StopAutoCreateSnapshotsRequest request) {
        return hcClient.asyncInvokeHttp(request, CssMeta.stopAutoCreateSnapshots);
    }

    /**
     * 关闭自动创建快照功能
     *
     * 该接口用于关闭自动备份功能。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param StopAutoCreateSnapshotsRequest 请求对象
     * @return AsyncInvoker<StopAutoCreateSnapshotsRequest, StopAutoCreateSnapshotsResponse>
     */
    public AsyncInvoker<StopAutoCreateSnapshotsRequest, StopAutoCreateSnapshotsResponse> stopAutoCreateSnapshotsAsyncInvoker(
        StopAutoCreateSnapshotsRequest request) {
        return new AsyncInvoker<StopAutoCreateSnapshotsRequest, StopAutoCreateSnapshotsResponse>(request,
            CssMeta.stopAutoCreateSnapshots, hcClient);
    }

}
