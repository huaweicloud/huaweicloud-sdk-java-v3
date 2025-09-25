package com.huaweicloud.sdk.css.v2;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
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

public class CssClient {

    protected HcClient hcClient;

    public CssClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<CssClient> newBuilder() {
        ClientBuilder<CssClient> clientBuilder = new ClientBuilder<>(CssClient::new);
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
     * @return CreateClusterResponse
     */
    public CreateClusterResponse createCluster(CreateClusterRequest request) {
        return hcClient.syncInvokeHttp(request, CssMeta.createCluster);
    }

    /**
     * 创建集群V2
     *
     * 该接口用于创建拥有多种不同节点类型（ess，ess-cold，ess-client，ess-master）组合的集群。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateClusterRequest 请求对象
     * @return SyncInvoker<CreateClusterRequest, CreateClusterResponse>
     */
    public SyncInvoker<CreateClusterRequest, CreateClusterResponse> createClusterInvoker(CreateClusterRequest request) {
        return new SyncInvoker<>(request, CssMeta.createCluster, hcClient);
    }

    /**
     * 重启集群V2
     *
     * 该接口可以用于重启当前集群拥有的全部节点类型，或部分节点类型组合的节点。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RestartClusterRequest 请求对象
     * @return RestartClusterResponse
     */
    public RestartClusterResponse restartCluster(RestartClusterRequest request) {
        return hcClient.syncInvokeHttp(request, CssMeta.restartCluster);
    }

    /**
     * 重启集群V2
     *
     * 该接口可以用于重启当前集群拥有的全部节点类型，或部分节点类型组合的节点。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RestartClusterRequest 请求对象
     * @return SyncInvoker<RestartClusterRequest, RestartClusterResponse>
     */
    public SyncInvoker<RestartClusterRequest, RestartClusterResponse> restartClusterInvoker(
        RestartClusterRequest request) {
        return new SyncInvoker<>(request, CssMeta.restartCluster, hcClient);
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
     * @return RollingRestartResponse
     */
    public RollingRestartResponse rollingRestart(RollingRestartRequest request) {
        return hcClient.syncInvokeHttp(request, CssMeta.rollingRestart);
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
     * @return SyncInvoker<RollingRestartRequest, RollingRestartResponse>
     */
    public SyncInvoker<RollingRestartRequest, RollingRestartResponse> rollingRestartInvoker(
        RollingRestartRequest request) {
        return new SyncInvoker<>(request, CssMeta.rollingRestart, hcClient);
    }

    /**
     * 开启自动创建快照功能
     *
     * 该接口用于打开自动备份功能
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartAutoCreateSnapshotsRequest 请求对象
     * @return StartAutoCreateSnapshotsResponse
     */
    public StartAutoCreateSnapshotsResponse startAutoCreateSnapshots(StartAutoCreateSnapshotsRequest request) {
        return hcClient.syncInvokeHttp(request, CssMeta.startAutoCreateSnapshots);
    }

    /**
     * 开启自动创建快照功能
     *
     * 该接口用于打开自动备份功能
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartAutoCreateSnapshotsRequest 请求对象
     * @return SyncInvoker<StartAutoCreateSnapshotsRequest, StartAutoCreateSnapshotsResponse>
     */
    public SyncInvoker<StartAutoCreateSnapshotsRequest, StartAutoCreateSnapshotsResponse> startAutoCreateSnapshotsInvoker(
        StartAutoCreateSnapshotsRequest request) {
        return new SyncInvoker<>(request, CssMeta.startAutoCreateSnapshots, hcClient);
    }

    /**
     * 关闭自动创建快照功能
     *
     * 该接口用于关闭自动备份功能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopAutoCreateSnapshotsRequest 请求对象
     * @return StopAutoCreateSnapshotsResponse
     */
    public StopAutoCreateSnapshotsResponse stopAutoCreateSnapshots(StopAutoCreateSnapshotsRequest request) {
        return hcClient.syncInvokeHttp(request, CssMeta.stopAutoCreateSnapshots);
    }

    /**
     * 关闭自动创建快照功能
     *
     * 该接口用于关闭自动备份功能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopAutoCreateSnapshotsRequest 请求对象
     * @return SyncInvoker<StopAutoCreateSnapshotsRequest, StopAutoCreateSnapshotsResponse>
     */
    public SyncInvoker<StopAutoCreateSnapshotsRequest, StopAutoCreateSnapshotsResponse> stopAutoCreateSnapshotsInvoker(
        StopAutoCreateSnapshotsRequest request) {
        return new SyncInvoker<>(request, CssMeta.stopAutoCreateSnapshots, hcClient);
    }

    /**
     * 删除配置文件
     *
     * 删除配置文件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteLogstashConfRequest 请求对象
     * @return DeleteLogstashConfResponse
     */
    public DeleteLogstashConfResponse deleteLogstashConf(DeleteLogstashConfRequest request) {
        return hcClient.syncInvokeHttp(request, CssMeta.deleteLogstashConf);
    }

    /**
     * 删除配置文件
     *
     * 删除配置文件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteLogstashConfRequest 请求对象
     * @return SyncInvoker<DeleteLogstashConfRequest, DeleteLogstashConfResponse>
     */
    public SyncInvoker<DeleteLogstashConfRequest, DeleteLogstashConfResponse> deleteLogstashConfInvoker(
        DeleteLogstashConfRequest request) {
        return new SyncInvoker<>(request, CssMeta.deleteLogstashConf, hcClient);
    }

    /**
     * Delete Custom Template
     *
     * This interface is used to delete custom templates.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteLogstashTemplateRequest 请求对象
     * @return DeleteLogstashTemplateResponse
     */
    public DeleteLogstashTemplateResponse deleteLogstashTemplate(DeleteLogstashTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, CssMeta.deleteLogstashTemplate);
    }

    /**
     * Delete Custom Template
     *
     * This interface is used to delete custom templates.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteLogstashTemplateRequest 请求对象
     * @return SyncInvoker<DeleteLogstashTemplateRequest, DeleteLogstashTemplateResponse>
     */
    public SyncInvoker<DeleteLogstashTemplateRequest, DeleteLogstashTemplateResponse> deleteLogstashTemplateInvoker(
        DeleteLogstashTemplateRequest request) {
        return new SyncInvoker<>(request, CssMeta.deleteLogstashTemplate, hcClient);
    }

}
