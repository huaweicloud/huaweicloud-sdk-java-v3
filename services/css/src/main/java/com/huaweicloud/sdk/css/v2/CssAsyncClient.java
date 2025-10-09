package com.huaweicloud.sdk.css.v2;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.css.v2.model.CreateClusterRequest;
import com.huaweicloud.sdk.css.v2.model.CreateClusterResponse;
import com.huaweicloud.sdk.css.v2.model.DeleteLogstashConfRequest;
import com.huaweicloud.sdk.css.v2.model.DeleteLogstashConfResponse;
import com.huaweicloud.sdk.css.v2.model.DeleteLogstashTemplateRequest;
import com.huaweicloud.sdk.css.v2.model.DeleteLogstashTemplateResponse;
import com.huaweicloud.sdk.css.v2.model.RestartClusterRequest;
import com.huaweicloud.sdk.css.v2.model.RestartClusterResponse;
import com.huaweicloud.sdk.css.v2.model.RollingRestartRequest;
import com.huaweicloud.sdk.css.v2.model.RollingRestartResponse;
import com.huaweicloud.sdk.css.v2.model.StartAutoCreateSnapshotsRequest;
import com.huaweicloud.sdk.css.v2.model.StartAutoCreateSnapshotsResponse;
import com.huaweicloud.sdk.css.v2.model.StopAutoCreateSnapshotsRequest;
import com.huaweicloud.sdk.css.v2.model.StopAutoCreateSnapshotsResponse;

import java.util.concurrent.CompletableFuture;

public class CssAsyncClient {

    protected HcClient hcClient;

    public CssAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<CssAsyncClient> newBuilder() {
        ClientBuilder<CssAsyncClient> clientBuilder = new ClientBuilder<>(CssAsyncClient::new);
        return clientBuilder;
    }

    /**
     * 创建集群V2
     *
     * 该接口用于创建拥有多种不同节点类型（ess，ess-cold，ess-client，ess-master）组合的集群。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateClusterRequest 请求对象
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
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateClusterRequest 请求对象
     * @return AsyncInvoker<CreateClusterRequest, CreateClusterResponse>
     */
    public AsyncInvoker<CreateClusterRequest, CreateClusterResponse> createClusterAsyncInvoker(
        CreateClusterRequest request) {
        return new AsyncInvoker<>(request, CssMeta.createCluster, hcClient);
    }

    /**
     * 重启集群V2
     *
     * 该接口可以用于重启当前集群拥有的全部节点类型，或部分节点类型组合的节点。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RestartClusterRequest 请求对象
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
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RestartClusterRequest 请求对象
     * @return AsyncInvoker<RestartClusterRequest, RestartClusterResponse>
     */
    public AsyncInvoker<RestartClusterRequest, RestartClusterResponse> restartClusterAsyncInvoker(
        RestartClusterRequest request) {
        return new AsyncInvoker<>(request, CssMeta.restartCluster, hcClient);
    }

    /**
     * 滚动重启
     *
     * 该接口会一个一个重启节点，在索引数量比较多的情况下耗时较长
     * 
     * &gt;仅当集群的节点数量（含Master节点、Client节点和冷数据节点）大于3时，才支持滚动重启
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RollingRestartRequest 请求对象
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
     * &gt;仅当集群的节点数量（含Master节点、Client节点和冷数据节点）大于3时，才支持滚动重启
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RollingRestartRequest 请求对象
     * @return AsyncInvoker<RollingRestartRequest, RollingRestartResponse>
     */
    public AsyncInvoker<RollingRestartRequest, RollingRestartResponse> rollingRestartAsyncInvoker(
        RollingRestartRequest request) {
        return new AsyncInvoker<>(request, CssMeta.rollingRestart, hcClient);
    }

    /**
     * 开启自动创建快照功能
     *
     * 该接口用于打开自动备份功能
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartAutoCreateSnapshotsRequest 请求对象
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
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartAutoCreateSnapshotsRequest 请求对象
     * @return AsyncInvoker<StartAutoCreateSnapshotsRequest, StartAutoCreateSnapshotsResponse>
     */
    public AsyncInvoker<StartAutoCreateSnapshotsRequest, StartAutoCreateSnapshotsResponse> startAutoCreateSnapshotsAsyncInvoker(
        StartAutoCreateSnapshotsRequest request) {
        return new AsyncInvoker<>(request, CssMeta.startAutoCreateSnapshots, hcClient);
    }

    /**
     * 关闭自动创建快照功能
     *
     * 该接口用于关闭自动备份功能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopAutoCreateSnapshotsRequest 请求对象
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
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopAutoCreateSnapshotsRequest 请求对象
     * @return AsyncInvoker<StopAutoCreateSnapshotsRequest, StopAutoCreateSnapshotsResponse>
     */
    public AsyncInvoker<StopAutoCreateSnapshotsRequest, StopAutoCreateSnapshotsResponse> stopAutoCreateSnapshotsAsyncInvoker(
        StopAutoCreateSnapshotsRequest request) {
        return new AsyncInvoker<>(request, CssMeta.stopAutoCreateSnapshots, hcClient);
    }

    /**
     * 删除配置文件
     *
     * 删除配置文件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteLogstashConfRequest 请求对象
     * @return CompletableFuture<DeleteLogstashConfResponse>
     */
    public CompletableFuture<DeleteLogstashConfResponse> deleteLogstashConfAsync(DeleteLogstashConfRequest request) {
        return hcClient.asyncInvokeHttp(request, CssMeta.deleteLogstashConf);
    }

    /**
     * 删除配置文件
     *
     * 删除配置文件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteLogstashConfRequest 请求对象
     * @return AsyncInvoker<DeleteLogstashConfRequest, DeleteLogstashConfResponse>
     */
    public AsyncInvoker<DeleteLogstashConfRequest, DeleteLogstashConfResponse> deleteLogstashConfAsyncInvoker(
        DeleteLogstashConfRequest request) {
        return new AsyncInvoker<>(request, CssMeta.deleteLogstashConf, hcClient);
    }

    /**
     * 删除自定义模板
     *
     * 此接口用于删除自定义模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteLogstashTemplateRequest 请求对象
     * @return CompletableFuture<DeleteLogstashTemplateResponse>
     */
    public CompletableFuture<DeleteLogstashTemplateResponse> deleteLogstashTemplateAsync(
        DeleteLogstashTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, CssMeta.deleteLogstashTemplate);
    }

    /**
     * 删除自定义模板
     *
     * 此接口用于删除自定义模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteLogstashTemplateRequest 请求对象
     * @return AsyncInvoker<DeleteLogstashTemplateRequest, DeleteLogstashTemplateResponse>
     */
    public AsyncInvoker<DeleteLogstashTemplateRequest, DeleteLogstashTemplateResponse> deleteLogstashTemplateAsyncInvoker(
        DeleteLogstashTemplateRequest request) {
        return new AsyncInvoker<>(request, CssMeta.deleteLogstashTemplate, hcClient);
    }

}
