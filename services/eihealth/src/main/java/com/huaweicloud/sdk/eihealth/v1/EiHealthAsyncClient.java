package com.huaweicloud.sdk.eihealth.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.eihealth.v1.model.*;

import java.util.concurrent.CompletableFuture;

public class EiHealthAsyncClient {

    protected HcClient hcClient;

    public EiHealthAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<EiHealthAsyncClient> newBuilder() {
        return new ClientBuilder<>(EiHealthAsyncClient::new);
    }

    /**
     * 导入应用
     *
     * 批量导入应用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchImportAppRequest 请求对象
     * @return CompletableFuture<BatchImportAppResponse>
     */
    public CompletableFuture<BatchImportAppResponse> batchImportAppAsync(BatchImportAppRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.batchImportApp);
    }

    /**
     * 导入应用
     *
     * 批量导入应用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchImportAppRequest 请求对象
     * @return AsyncInvoker<BatchImportAppRequest, BatchImportAppResponse>
     */
    public AsyncInvoker<BatchImportAppRequest, BatchImportAppResponse> batchImportAppAsyncInvoker(
        BatchImportAppRequest request) {
        return new AsyncInvoker<BatchImportAppRequest, BatchImportAppResponse>(request, EiHealthMeta.batchImportApp,
            hcClient);
    }

    /**
     * 创建应用
     *
     * 创建应用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateAppRequest 请求对象
     * @return CompletableFuture<CreateAppResponse>
     */
    public CompletableFuture<CreateAppResponse> createAppAsync(CreateAppRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.createApp);
    }

    /**
     * 创建应用
     *
     * 创建应用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateAppRequest 请求对象
     * @return AsyncInvoker<CreateAppRequest, CreateAppResponse>
     */
    public AsyncInvoker<CreateAppRequest, CreateAppResponse> createAppAsyncInvoker(CreateAppRequest request) {
        return new AsyncInvoker<CreateAppRequest, CreateAppResponse>(request, EiHealthMeta.createApp, hcClient);
    }

    /**
     * 删除应用
     *
     * 删除应用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteAppRequest 请求对象
     * @return CompletableFuture<DeleteAppResponse>
     */
    public CompletableFuture<DeleteAppResponse> deleteAppAsync(DeleteAppRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.deleteApp);
    }

    /**
     * 删除应用
     *
     * 删除应用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteAppRequest 请求对象
     * @return AsyncInvoker<DeleteAppRequest, DeleteAppResponse>
     */
    public AsyncInvoker<DeleteAppRequest, DeleteAppResponse> deleteAppAsyncInvoker(DeleteAppRequest request) {
        return new AsyncInvoker<DeleteAppRequest, DeleteAppResponse>(request, EiHealthMeta.deleteApp, hcClient);
    }

    /**
     * 获取应用列表
     *
     * 获取应用列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAppRequest 请求对象
     * @return CompletableFuture<ListAppResponse>
     */
    public CompletableFuture<ListAppResponse> listAppAsync(ListAppRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.listApp);
    }

    /**
     * 获取应用列表
     *
     * 获取应用列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAppRequest 请求对象
     * @return AsyncInvoker<ListAppRequest, ListAppResponse>
     */
    public AsyncInvoker<ListAppRequest, ListAppResponse> listAppAsyncInvoker(ListAppRequest request) {
        return new AsyncInvoker<ListAppRequest, ListAppResponse>(request, EiHealthMeta.listApp, hcClient);
    }

    /**
     * 获取应用详情
     *
     * 获取应用详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAppRequest 请求对象
     * @return CompletableFuture<ShowAppResponse>
     */
    public CompletableFuture<ShowAppResponse> showAppAsync(ShowAppRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.showApp);
    }

    /**
     * 获取应用详情
     *
     * 获取应用详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAppRequest 请求对象
     * @return AsyncInvoker<ShowAppRequest, ShowAppResponse>
     */
    public AsyncInvoker<ShowAppRequest, ShowAppResponse> showAppAsyncInvoker(ShowAppRequest request) {
        return new AsyncInvoker<ShowAppRequest, ShowAppResponse>(request, EiHealthMeta.showApp, hcClient);
    }

    /**
     * 订阅应用
     *
     * 订阅应用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SubscribeAppRequest 请求对象
     * @return CompletableFuture<SubscribeAppResponse>
     */
    public CompletableFuture<SubscribeAppResponse> subscribeAppAsync(SubscribeAppRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.subscribeApp);
    }

    /**
     * 订阅应用
     *
     * 订阅应用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SubscribeAppRequest 请求对象
     * @return AsyncInvoker<SubscribeAppRequest, SubscribeAppResponse>
     */
    public AsyncInvoker<SubscribeAppRequest, SubscribeAppResponse> subscribeAppAsyncInvoker(
        SubscribeAppRequest request) {
        return new AsyncInvoker<SubscribeAppRequest, SubscribeAppResponse>(request, EiHealthMeta.subscribeApp,
            hcClient);
    }

    /**
     * 更新应用
     *
     * 更新应用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateAppRequest 请求对象
     * @return CompletableFuture<UpdateAppResponse>
     */
    public CompletableFuture<UpdateAppResponse> updateAppAsync(UpdateAppRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.updateApp);
    }

    /**
     * 更新应用
     *
     * 更新应用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateAppRequest 请求对象
     * @return AsyncInvoker<UpdateAppRequest, UpdateAppResponse>
     */
    public AsyncInvoker<UpdateAppRequest, UpdateAppResponse> updateAppAsyncInvoker(UpdateAppRequest request) {
        return new AsyncInvoker<UpdateAppRequest, UpdateAppResponse>(request, EiHealthMeta.updateApp, hcClient);
    }

    /**
     * 获取资产列表
     *
     * 获取资产列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAssetRequest 请求对象
     * @return CompletableFuture<ListAssetResponse>
     */
    public CompletableFuture<ListAssetResponse> listAssetAsync(ListAssetRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.listAsset);
    }

    /**
     * 获取资产列表
     *
     * 获取资产列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAssetRequest 请求对象
     * @return AsyncInvoker<ListAssetRequest, ListAssetResponse>
     */
    public AsyncInvoker<ListAssetRequest, ListAssetResponse> listAssetAsyncInvoker(ListAssetRequest request) {
        return new AsyncInvoker<ListAssetRequest, ListAssetResponse>(request, EiHealthMeta.listAsset, hcClient);
    }

    /**
     * 获取属性值列表
     *
     * 获取属性值列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPropertyRequest 请求对象
     * @return CompletableFuture<ListPropertyResponse>
     */
    public CompletableFuture<ListPropertyResponse> listPropertyAsync(ListPropertyRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.listProperty);
    }

    /**
     * 获取属性值列表
     *
     * 获取属性值列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPropertyRequest 请求对象
     * @return AsyncInvoker<ListPropertyRequest, ListPropertyResponse>
     */
    public AsyncInvoker<ListPropertyRequest, ListPropertyResponse> listPropertyAsyncInvoker(
        ListPropertyRequest request) {
        return new AsyncInvoker<ListPropertyRequest, ListPropertyResponse>(request, EiHealthMeta.listProperty,
            hcClient);
    }

    /**
     * 查询资产详情
     *
     * 查询资产详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAssetRequest 请求对象
     * @return CompletableFuture<ShowAssetResponse>
     */
    public CompletableFuture<ShowAssetResponse> showAssetAsync(ShowAssetRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.showAsset);
    }

    /**
     * 查询资产详情
     *
     * 查询资产详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAssetRequest 请求对象
     * @return AsyncInvoker<ShowAssetRequest, ShowAssetResponse>
     */
    public AsyncInvoker<ShowAssetRequest, ShowAssetResponse> showAssetAsyncInvoker(ShowAssetRequest request) {
        return new AsyncInvoker<ShowAssetRequest, ShowAssetResponse>(request, EiHealthMeta.showAsset, hcClient);
    }

    /**
     * 查询资产版本详情
     *
     * 查询资产版本详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAssetVersionRequest 请求对象
     * @return CompletableFuture<ShowAssetVersionResponse>
     */
    public CompletableFuture<ShowAssetVersionResponse> showAssetVersionAsync(ShowAssetVersionRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.showAssetVersion);
    }

    /**
     * 查询资产版本详情
     *
     * 查询资产版本详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAssetVersionRequest 请求对象
     * @return AsyncInvoker<ShowAssetVersionRequest, ShowAssetVersionResponse>
     */
    public AsyncInvoker<ShowAssetVersionRequest, ShowAssetVersionResponse> showAssetVersionAsyncInvoker(
        ShowAssetVersionRequest request) {
        return new AsyncInvoker<ShowAssetVersionRequest, ShowAssetVersionResponse>(request,
            EiHealthMeta.showAssetVersion, hcClient);
    }

    /**
     * 创建自动作业模板
     *
     * 创建自动作业模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateAutoJobRequest 请求对象
     * @return CompletableFuture<CreateAutoJobResponse>
     */
    public CompletableFuture<CreateAutoJobResponse> createAutoJobAsync(CreateAutoJobRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.createAutoJob);
    }

    /**
     * 创建自动作业模板
     *
     * 创建自动作业模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateAutoJobRequest 请求对象
     * @return AsyncInvoker<CreateAutoJobRequest, CreateAutoJobResponse>
     */
    public AsyncInvoker<CreateAutoJobRequest, CreateAutoJobResponse> createAutoJobAsyncInvoker(
        CreateAutoJobRequest request) {
        return new AsyncInvoker<CreateAutoJobRequest, CreateAutoJobResponse>(request, EiHealthMeta.createAutoJob,
            hcClient);
    }

    /**
     * 删除自动作业模板
     *
     * 删除自动作业模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteAutoJobRequest 请求对象
     * @return CompletableFuture<DeleteAutoJobResponse>
     */
    public CompletableFuture<DeleteAutoJobResponse> deleteAutoJobAsync(DeleteAutoJobRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.deleteAutoJob);
    }

    /**
     * 删除自动作业模板
     *
     * 删除自动作业模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteAutoJobRequest 请求对象
     * @return AsyncInvoker<DeleteAutoJobRequest, DeleteAutoJobResponse>
     */
    public AsyncInvoker<DeleteAutoJobRequest, DeleteAutoJobResponse> deleteAutoJobAsyncInvoker(
        DeleteAutoJobRequest request) {
        return new AsyncInvoker<DeleteAutoJobRequest, DeleteAutoJobResponse>(request, EiHealthMeta.deleteAutoJob,
            hcClient);
    }

    /**
     * 获取自动作业模板列表
     *
     * 获取自动作业模板列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAutoJobRequest 请求对象
     * @return CompletableFuture<ListAutoJobResponse>
     */
    public CompletableFuture<ListAutoJobResponse> listAutoJobAsync(ListAutoJobRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.listAutoJob);
    }

    /**
     * 获取自动作业模板列表
     *
     * 获取自动作业模板列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAutoJobRequest 请求对象
     * @return AsyncInvoker<ListAutoJobRequest, ListAutoJobResponse>
     */
    public AsyncInvoker<ListAutoJobRequest, ListAutoJobResponse> listAutoJobAsyncInvoker(ListAutoJobRequest request) {
        return new AsyncInvoker<ListAutoJobRequest, ListAutoJobResponse>(request, EiHealthMeta.listAutoJob, hcClient);
    }

    /**
     * 查询自动作业模板
     *
     * 查询自动作业模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAutoJobRequest 请求对象
     * @return CompletableFuture<ShowAutoJobResponse>
     */
    public CompletableFuture<ShowAutoJobResponse> showAutoJobAsync(ShowAutoJobRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.showAutoJob);
    }

    /**
     * 查询自动作业模板
     *
     * 查询自动作业模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAutoJobRequest 请求对象
     * @return AsyncInvoker<ShowAutoJobRequest, ShowAutoJobResponse>
     */
    public AsyncInvoker<ShowAutoJobRequest, ShowAutoJobResponse> showAutoJobAsyncInvoker(ShowAutoJobRequest request) {
        return new AsyncInvoker<ShowAutoJobRequest, ShowAutoJobResponse>(request, EiHealthMeta.showAutoJob, hcClient);
    }

    /**
     * 启动自动作业
     *
     * 启动自动作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StartAutoJobRequest 请求对象
     * @return CompletableFuture<StartAutoJobResponse>
     */
    public CompletableFuture<StartAutoJobResponse> startAutoJobAsync(StartAutoJobRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.startAutoJob);
    }

    /**
     * 启动自动作业
     *
     * 启动自动作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StartAutoJobRequest 请求对象
     * @return AsyncInvoker<StartAutoJobRequest, StartAutoJobResponse>
     */
    public AsyncInvoker<StartAutoJobRequest, StartAutoJobResponse> startAutoJobAsyncInvoker(
        StartAutoJobRequest request) {
        return new AsyncInvoker<StartAutoJobRequest, StartAutoJobResponse>(request, EiHealthMeta.startAutoJob,
            hcClient);
    }

    /**
     * 停止自动作业
     *
     * 停止自动作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StopAutoJobRequest 请求对象
     * @return CompletableFuture<StopAutoJobResponse>
     */
    public CompletableFuture<StopAutoJobResponse> stopAutoJobAsync(StopAutoJobRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.stopAutoJob);
    }

    /**
     * 停止自动作业
     *
     * 停止自动作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StopAutoJobRequest 请求对象
     * @return AsyncInvoker<StopAutoJobRequest, StopAutoJobResponse>
     */
    public AsyncInvoker<StopAutoJobRequest, StopAutoJobResponse> stopAutoJobAsyncInvoker(StopAutoJobRequest request) {
        return new AsyncInvoker<StopAutoJobRequest, StopAutoJobResponse>(request, EiHealthMeta.stopAutoJob, hcClient);
    }

    /**
     * 更新自动作业模板
     *
     * 更新自动作业模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateAutoJobRequest 请求对象
     * @return CompletableFuture<UpdateAutoJobResponse>
     */
    public CompletableFuture<UpdateAutoJobResponse> updateAutoJobAsync(UpdateAutoJobRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.updateAutoJob);
    }

    /**
     * 更新自动作业模板
     *
     * 更新自动作业模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateAutoJobRequest 请求对象
     * @return AsyncInvoker<UpdateAutoJobRequest, UpdateAutoJobResponse>
     */
    public AsyncInvoker<UpdateAutoJobRequest, UpdateAutoJobResponse> updateAutoJobAsyncInvoker(
        UpdateAutoJobRequest request) {
        return new AsyncInvoker<UpdateAutoJobRequest, UpdateAutoJobResponse>(request, EiHealthMeta.updateAutoJob,
            hcClient);
    }

    /**
     * 购买计算资源
     *
     * 购买计算资源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateComputingResourceRequest 请求对象
     * @return CompletableFuture<CreateComputingResourceResponse>
     */
    public CompletableFuture<CreateComputingResourceResponse> createComputingResourceAsync(
        CreateComputingResourceRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.createComputingResource);
    }

    /**
     * 购买计算资源
     *
     * 购买计算资源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateComputingResourceRequest 请求对象
     * @return AsyncInvoker<CreateComputingResourceRequest, CreateComputingResourceResponse>
     */
    public AsyncInvoker<CreateComputingResourceRequest, CreateComputingResourceResponse> createComputingResourceAsyncInvoker(
        CreateComputingResourceRequest request) {
        return new AsyncInvoker<CreateComputingResourceRequest, CreateComputingResourceResponse>(request,
            EiHealthMeta.createComputingResource, hcClient);
    }

    /**
     * 删除计算资源
     *
     * 删除计算资源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteComputingResourceRequest 请求对象
     * @return CompletableFuture<DeleteComputingResourceResponse>
     */
    public CompletableFuture<DeleteComputingResourceResponse> deleteComputingResourceAsync(
        DeleteComputingResourceRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.deleteComputingResource);
    }

    /**
     * 删除计算资源
     *
     * 删除计算资源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteComputingResourceRequest 请求对象
     * @return AsyncInvoker<DeleteComputingResourceRequest, DeleteComputingResourceResponse>
     */
    public AsyncInvoker<DeleteComputingResourceRequest, DeleteComputingResourceResponse> deleteComputingResourceAsyncInvoker(
        DeleteComputingResourceRequest request) {
        return new AsyncInvoker<DeleteComputingResourceRequest, DeleteComputingResourceResponse>(request,
            EiHealthMeta.deleteComputingResource, hcClient);
    }

    /**
     * 查询计算资源规格
     *
     * 查询计算资源规格
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListComputingResourceFlavorsRequest 请求对象
     * @return CompletableFuture<ListComputingResourceFlavorsResponse>
     */
    public CompletableFuture<ListComputingResourceFlavorsResponse> listComputingResourceFlavorsAsync(
        ListComputingResourceFlavorsRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.listComputingResourceFlavors);
    }

    /**
     * 查询计算资源规格
     *
     * 查询计算资源规格
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListComputingResourceFlavorsRequest 请求对象
     * @return AsyncInvoker<ListComputingResourceFlavorsRequest, ListComputingResourceFlavorsResponse>
     */
    public AsyncInvoker<ListComputingResourceFlavorsRequest, ListComputingResourceFlavorsResponse> listComputingResourceFlavorsAsyncInvoker(
        ListComputingResourceFlavorsRequest request) {
        return new AsyncInvoker<ListComputingResourceFlavorsRequest, ListComputingResourceFlavorsResponse>(request,
            EiHealthMeta.listComputingResourceFlavors, hcClient);
    }

    /**
     * 查询计算资源
     *
     * 查询计算资源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListComputingResourcesRequest 请求对象
     * @return CompletableFuture<ListComputingResourcesResponse>
     */
    public CompletableFuture<ListComputingResourcesResponse> listComputingResourcesAsync(
        ListComputingResourcesRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.listComputingResources);
    }

    /**
     * 查询计算资源
     *
     * 查询计算资源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListComputingResourcesRequest 请求对象
     * @return AsyncInvoker<ListComputingResourcesRequest, ListComputingResourcesResponse>
     */
    public AsyncInvoker<ListComputingResourcesRequest, ListComputingResourcesResponse> listComputingResourcesAsyncInvoker(
        ListComputingResourcesRequest request) {
        return new AsyncInvoker<ListComputingResourcesRequest, ListComputingResourcesResponse>(request,
            EiHealthMeta.listComputingResources, hcClient);
    }

    /**
     * 重启计算资源
     *
     * 重启计算资源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RebootNodeRequest 请求对象
     * @return CompletableFuture<RebootNodeResponse>
     */
    public CompletableFuture<RebootNodeResponse> rebootNodeAsync(RebootNodeRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.rebootNode);
    }

    /**
     * 重启计算资源
     *
     * 重启计算资源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RebootNodeRequest 请求对象
     * @return AsyncInvoker<RebootNodeRequest, RebootNodeResponse>
     */
    public AsyncInvoker<RebootNodeRequest, RebootNodeResponse> rebootNodeAsyncInvoker(RebootNodeRequest request) {
        return new AsyncInvoker<RebootNodeRequest, RebootNodeResponse>(request, EiHealthMeta.rebootNode, hcClient);
    }

    /**
     * 查询bms计算资源显卡id列表
     *
     * 查询bms计算资源显卡id列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowBmsDevicesRequest 请求对象
     * @return CompletableFuture<ShowBmsDevicesResponse>
     */
    public CompletableFuture<ShowBmsDevicesResponse> showBmsDevicesAsync(ShowBmsDevicesRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.showBmsDevices);
    }

    /**
     * 查询bms计算资源显卡id列表
     *
     * 查询bms计算资源显卡id列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowBmsDevicesRequest 请求对象
     * @return AsyncInvoker<ShowBmsDevicesRequest, ShowBmsDevicesResponse>
     */
    public AsyncInvoker<ShowBmsDevicesRequest, ShowBmsDevicesResponse> showBmsDevicesAsyncInvoker(
        ShowBmsDevicesRequest request) {
        return new AsyncInvoker<ShowBmsDevicesRequest, ShowBmsDevicesResponse>(request, EiHealthMeta.showBmsDevices,
            hcClient);
    }

    /**
     * 获取EVS配额及使用情况
     *
     * 获取EVS配额及使用情况
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowEvsQuotaRequest 请求对象
     * @return CompletableFuture<ShowEvsQuotaResponse>
     */
    public CompletableFuture<ShowEvsQuotaResponse> showEvsQuotaAsync(ShowEvsQuotaRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.showEvsQuota);
    }

    /**
     * 获取EVS配额及使用情况
     *
     * 获取EVS配额及使用情况
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowEvsQuotaRequest 请求对象
     * @return AsyncInvoker<ShowEvsQuotaRequest, ShowEvsQuotaResponse>
     */
    public AsyncInvoker<ShowEvsQuotaRequest, ShowEvsQuotaResponse> showEvsQuotaAsyncInvoker(
        ShowEvsQuotaRequest request) {
        return new AsyncInvoker<ShowEvsQuotaRequest, ShowEvsQuotaResponse>(request, EiHealthMeta.showEvsQuota,
            hcClient);
    }

    /**
     * 获取节点剩余配额
     *
     * 获取节点剩余配额
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowLeftQuotaRequest 请求对象
     * @return CompletableFuture<ShowLeftQuotaResponse>
     */
    public CompletableFuture<ShowLeftQuotaResponse> showLeftQuotaAsync(ShowLeftQuotaRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.showLeftQuota);
    }

    /**
     * 获取节点剩余配额
     *
     * 获取节点剩余配额
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowLeftQuotaRequest 请求对象
     * @return AsyncInvoker<ShowLeftQuotaRequest, ShowLeftQuotaResponse>
     */
    public AsyncInvoker<ShowLeftQuotaRequest, ShowLeftQuotaResponse> showLeftQuotaAsyncInvoker(
        ShowLeftQuotaRequest request) {
        return new AsyncInvoker<ShowLeftQuotaRequest, ShowLeftQuotaResponse>(request, EiHealthMeta.showLeftQuota,
            hcClient);
    }

    /**
     * 查询计算资源调度信息
     *
     * 查询计算资源调度信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowScheduleRequest 请求对象
     * @return CompletableFuture<ShowScheduleResponse>
     */
    public CompletableFuture<ShowScheduleResponse> showScheduleAsync(ShowScheduleRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.showSchedule);
    }

    /**
     * 查询计算资源调度信息
     *
     * 查询计算资源调度信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowScheduleRequest 请求对象
     * @return AsyncInvoker<ShowScheduleRequest, ShowScheduleResponse>
     */
    public AsyncInvoker<ShowScheduleRequest, ShowScheduleResponse> showScheduleAsyncInvoker(
        ShowScheduleRequest request) {
        return new AsyncInvoker<ShowScheduleRequest, ShowScheduleResponse>(request, EiHealthMeta.showSchedule,
            hcClient);
    }

    /**
     * 启动计算资源
     *
     * 启动计算资源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StartNodeRequest 请求对象
     * @return CompletableFuture<StartNodeResponse>
     */
    public CompletableFuture<StartNodeResponse> startNodeAsync(StartNodeRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.startNode);
    }

    /**
     * 启动计算资源
     *
     * 启动计算资源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StartNodeRequest 请求对象
     * @return AsyncInvoker<StartNodeRequest, StartNodeResponse>
     */
    public AsyncInvoker<StartNodeRequest, StartNodeResponse> startNodeAsyncInvoker(StartNodeRequest request) {
        return new AsyncInvoker<StartNodeRequest, StartNodeResponse>(request, EiHealthMeta.startNode, hcClient);
    }

    /**
     * 关闭计算资源
     *
     * 关闭计算资源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StopNodeRequest 请求对象
     * @return CompletableFuture<StopNodeResponse>
     */
    public CompletableFuture<StopNodeResponse> stopNodeAsync(StopNodeRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.stopNode);
    }

    /**
     * 关闭计算资源
     *
     * 关闭计算资源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StopNodeRequest 请求对象
     * @return AsyncInvoker<StopNodeRequest, StopNodeResponse>
     */
    public AsyncInvoker<StopNodeRequest, StopNodeResponse> stopNodeAsyncInvoker(StopNodeRequest request) {
        return new AsyncInvoker<StopNodeRequest, StopNodeResponse>(request, EiHealthMeta.stopNode, hcClient);
    }

    /**
     * 修改计算资源调度信息
     *
     * 修改计算资源调度信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateScheduleRequest 请求对象
     * @return CompletableFuture<UpdateScheduleResponse>
     */
    public CompletableFuture<UpdateScheduleResponse> updateScheduleAsync(UpdateScheduleRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.updateSchedule);
    }

    /**
     * 修改计算资源调度信息
     *
     * 修改计算资源调度信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateScheduleRequest 请求对象
     * @return AsyncInvoker<UpdateScheduleRequest, UpdateScheduleResponse>
     */
    public AsyncInvoker<UpdateScheduleRequest, UpdateScheduleResponse> updateScheduleAsyncInvoker(
        UpdateScheduleRequest request) {
        return new AsyncInvoker<UpdateScheduleRequest, UpdateScheduleResponse>(request, EiHealthMeta.updateSchedule,
            hcClient);
    }

    /**
     * 归档数据
     *
     * 将需要归档的重要数据拷贝到数据归档桶
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateBackupRequest 请求对象
     * @return CompletableFuture<CreateBackupResponse>
     */
    public CompletableFuture<CreateBackupResponse> createBackupAsync(CreateBackupRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.createBackup);
    }

    /**
     * 归档数据
     *
     * 将需要归档的重要数据拷贝到数据归档桶
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateBackupRequest 请求对象
     * @return AsyncInvoker<CreateBackupRequest, CreateBackupResponse>
     */
    public AsyncInvoker<CreateBackupRequest, CreateBackupResponse> createBackupAsyncInvoker(
        CreateBackupRequest request) {
        return new AsyncInvoker<CreateBackupRequest, CreateBackupResponse>(request, EiHealthMeta.createBackup,
            hcClient);
    }

    /**
     * 删除归档
     *
     * 删除指定的归档
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteBackupRequest 请求对象
     * @return CompletableFuture<DeleteBackupResponse>
     */
    public CompletableFuture<DeleteBackupResponse> deleteBackupAsync(DeleteBackupRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.deleteBackup);
    }

    /**
     * 删除归档
     *
     * 删除指定的归档
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteBackupRequest 请求对象
     * @return AsyncInvoker<DeleteBackupRequest, DeleteBackupResponse>
     */
    public AsyncInvoker<DeleteBackupRequest, DeleteBackupResponse> deleteBackupAsyncInvoker(
        DeleteBackupRequest request) {
        return new AsyncInvoker<DeleteBackupRequest, DeleteBackupResponse>(request, EiHealthMeta.deleteBackup,
            hcClient);
    }

    /**
     * 查询归档列表
     *
     * 分页查询用户管理的项目的所有历史归档记录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListBackupRequest 请求对象
     * @return CompletableFuture<ListBackupResponse>
     */
    public CompletableFuture<ListBackupResponse> listBackupAsync(ListBackupRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.listBackup);
    }

    /**
     * 查询归档列表
     *
     * 分页查询用户管理的项目的所有历史归档记录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListBackupRequest 请求对象
     * @return AsyncInvoker<ListBackupRequest, ListBackupResponse>
     */
    public AsyncInvoker<ListBackupRequest, ListBackupResponse> listBackupAsyncInvoker(ListBackupRequest request) {
        return new AsyncInvoker<ListBackupRequest, ListBackupResponse>(request, EiHealthMeta.listBackup, hcClient);
    }

    /**
     * 恢复归档
     *
     * 将指定的归档数据拷贝到目标项目的某个目录下
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RestoreBackupRequest 请求对象
     * @return CompletableFuture<RestoreBackupResponse>
     */
    public CompletableFuture<RestoreBackupResponse> restoreBackupAsync(RestoreBackupRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.restoreBackup);
    }

    /**
     * 恢复归档
     *
     * 将指定的归档数据拷贝到目标项目的某个目录下
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RestoreBackupRequest 请求对象
     * @return AsyncInvoker<RestoreBackupRequest, RestoreBackupResponse>
     */
    public AsyncInvoker<RestoreBackupRequest, RestoreBackupResponse> restoreBackupAsyncInvoker(
        RestoreBackupRequest request) {
        return new AsyncInvoker<RestoreBackupRequest, RestoreBackupResponse>(request, EiHealthMeta.restoreBackup,
            hcClient);
    }

    /**
     * 获取指定归档的全数据清单
     *
     * 根据归档ID获取该归档的全数据清单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowBackupPathRequest 请求对象
     * @return CompletableFuture<ShowBackupPathResponse>
     */
    public CompletableFuture<ShowBackupPathResponse> showBackupPathAsync(ShowBackupPathRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.showBackupPath);
    }

    /**
     * 获取指定归档的全数据清单
     *
     * 根据归档ID获取该归档的全数据清单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowBackupPathRequest 请求对象
     * @return AsyncInvoker<ShowBackupPathRequest, ShowBackupPathResponse>
     */
    public AsyncInvoker<ShowBackupPathRequest, ShowBackupPathResponse> showBackupPathAsyncInvoker(
        ShowBackupPathRequest request) {
        return new AsyncInvoker<ShowBackupPathRequest, ShowBackupPathResponse>(request, EiHealthMeta.showBackupPath,
            hcClient);
    }

    /**
     * 复制项目数据
     *
     * 复制项目数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CopyDataRequest 请求对象
     * @return CompletableFuture<CopyDataResponse>
     */
    public CompletableFuture<CopyDataResponse> copyDataAsync(CopyDataRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.copyData);
    }

    /**
     * 复制项目数据
     *
     * 复制项目数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CopyDataRequest 请求对象
     * @return AsyncInvoker<CopyDataRequest, CopyDataResponse>
     */
    public AsyncInvoker<CopyDataRequest, CopyDataResponse> copyDataAsyncInvoker(CopyDataRequest request) {
        return new AsyncInvoker<CopyDataRequest, CopyDataResponse>(request, EiHealthMeta.copyData, hcClient);
    }

    /**
     * 创建文件夹
     *
     * 创建文件夹
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateDataRequest 请求对象
     * @return CompletableFuture<CreateDataResponse>
     */
    public CompletableFuture<CreateDataResponse> createDataAsync(CreateDataRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.createData);
    }

    /**
     * 创建文件夹
     *
     * 创建文件夹
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateDataRequest 请求对象
     * @return AsyncInvoker<CreateDataRequest, CreateDataResponse>
     */
    public AsyncInvoker<CreateDataRequest, CreateDataResponse> createDataAsyncInvoker(CreateDataRequest request) {
        return new AsyncInvoker<CreateDataRequest, CreateDataResponse>(request, EiHealthMeta.createData, hcClient);
    }

    /**
     * 批量删除项目数据
     *
     * 批量删除项目数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteDataRequest 请求对象
     * @return CompletableFuture<DeleteDataResponse>
     */
    public CompletableFuture<DeleteDataResponse> deleteDataAsync(DeleteDataRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.deleteData);
    }

    /**
     * 批量删除项目数据
     *
     * 批量删除项目数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteDataRequest 请求对象
     * @return AsyncInvoker<DeleteDataRequest, DeleteDataResponse>
     */
    public AsyncInvoker<DeleteDataRequest, DeleteDataResponse> deleteDataAsyncInvoker(DeleteDataRequest request) {
        return new AsyncInvoker<DeleteDataRequest, DeleteDataResponse>(request, EiHealthMeta.deleteData, hcClient);
    }

    /**
     * 导入项目数据
     *
     * 导入项目数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ImportDataRequest 请求对象
     * @return CompletableFuture<ImportDataResponse>
     */
    public CompletableFuture<ImportDataResponse> importDataAsync(ImportDataRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.importData);
    }

    /**
     * 导入项目数据
     *
     * 导入项目数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ImportDataRequest 请求对象
     * @return AsyncInvoker<ImportDataRequest, ImportDataResponse>
     */
    public AsyncInvoker<ImportDataRequest, ImportDataResponse> importDataAsyncInvoker(ImportDataRequest request) {
        return new AsyncInvoker<ImportDataRequest, ImportDataResponse>(request, EiHealthMeta.importData, hcClient);
    }

    /**
     * 导入网上数据
     *
     * 导入网上数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ImportNetworkDataRequest 请求对象
     * @return CompletableFuture<ImportNetworkDataResponse>
     */
    public CompletableFuture<ImportNetworkDataResponse> importNetworkDataAsync(ImportNetworkDataRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.importNetworkData);
    }

    /**
     * 导入网上数据
     *
     * 导入网上数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ImportNetworkDataRequest 请求对象
     * @return AsyncInvoker<ImportNetworkDataRequest, ImportNetworkDataResponse>
     */
    public AsyncInvoker<ImportNetworkDataRequest, ImportNetworkDataResponse> importNetworkDataAsyncInvoker(
        ImportNetworkDataRequest request) {
        return new AsyncInvoker<ImportNetworkDataRequest, ImportNetworkDataResponse>(request,
            EiHealthMeta.importNetworkData, hcClient);
    }

    /**
     * 获取桶列表
     *
     * 获取桶列表(包含当前项目桶和引用项目桶)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListBucketRequest 请求对象
     * @return CompletableFuture<ListBucketResponse>
     */
    public CompletableFuture<ListBucketResponse> listBucketAsync(ListBucketRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.listBucket);
    }

    /**
     * 获取桶列表
     *
     * 获取桶列表(包含当前项目桶和引用项目桶)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListBucketRequest 请求对象
     * @return AsyncInvoker<ListBucketRequest, ListBucketResponse>
     */
    public AsyncInvoker<ListBucketRequest, ListBucketResponse> listBucketAsyncInvoker(ListBucketRequest request) {
        return new AsyncInvoker<ListBucketRequest, ListBucketResponse>(request, EiHealthMeta.listBucket, hcClient);
    }

    /**
     * 查询数据列表
     *
     * 查询指定目录下的数据列表，如果不指定默认查询根目录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDataRequest 请求对象
     * @return CompletableFuture<ListDataResponse>
     */
    public CompletableFuture<ListDataResponse> listDataAsync(ListDataRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.listData);
    }

    /**
     * 查询数据列表
     *
     * 查询指定目录下的数据列表，如果不指定默认查询根目录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDataRequest 请求对象
     * @return AsyncInvoker<ListDataRequest, ListDataResponse>
     */
    public AsyncInvoker<ListDataRequest, ListDataResponse> listDataAsyncInvoker(ListDataRequest request) {
        return new AsyncInvoker<ListDataRequest, ListDataResponse>(request, EiHealthMeta.listData, hcClient);
    }

    /**
     * 引用项目数据
     *
     * 引用项目数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param QuoteDataRequest 请求对象
     * @return CompletableFuture<QuoteDataResponse>
     */
    public CompletableFuture<QuoteDataResponse> quoteDataAsync(QuoteDataRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.quoteData);
    }

    /**
     * 引用项目数据
     *
     * 引用项目数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param QuoteDataRequest 请求对象
     * @return AsyncInvoker<QuoteDataRequest, QuoteDataResponse>
     */
    public AsyncInvoker<QuoteDataRequest, QuoteDataResponse> quoteDataAsyncInvoker(QuoteDataRequest request) {
        return new AsyncInvoker<QuoteDataRequest, QuoteDataResponse>(request, EiHealthMeta.quoteData, hcClient);
    }

    /**
     * 获取桶存量信息
     *
     * 获取桶存量信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowBucketStorageRequest 请求对象
     * @return CompletableFuture<ShowBucketStorageResponse>
     */
    public CompletableFuture<ShowBucketStorageResponse> showBucketStorageAsync(ShowBucketStorageRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.showBucketStorage);
    }

    /**
     * 获取桶存量信息
     *
     * 获取桶存量信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowBucketStorageRequest 请求对象
     * @return AsyncInvoker<ShowBucketStorageRequest, ShowBucketStorageResponse>
     */
    public AsyncInvoker<ShowBucketStorageRequest, ShowBucketStorageResponse> showBucketStorageAsyncInvoker(
        ShowBucketStorageRequest request) {
        return new AsyncInvoker<ShowBucketStorageRequest, ShowBucketStorageResponse>(request,
            EiHealthMeta.showBucketStorage, hcClient);
    }

    /**
     * 获取指定数据对象
     *
     * 获取指定数据对象的详细信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDataRequest 请求对象
     * @return CompletableFuture<ShowDataResponse>
     */
    public CompletableFuture<ShowDataResponse> showDataAsync(ShowDataRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.showData);
    }

    /**
     * 获取指定数据对象
     *
     * 获取指定数据对象的详细信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDataRequest 请求对象
     * @return AsyncInvoker<ShowDataRequest, ShowDataResponse>
     */
    public AsyncInvoker<ShowDataRequest, ShowDataResponse> showDataAsyncInvoker(ShowDataRequest request) {
        return new AsyncInvoker<ShowDataRequest, ShowDataResponse>(request, EiHealthMeta.showData, hcClient);
    }

    /**
     * 查询项目级数据权限控制策略
     *
     * 查询项目级数据权限控制策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDataPolicyRequest 请求对象
     * @return CompletableFuture<ShowDataPolicyResponse>
     */
    public CompletableFuture<ShowDataPolicyResponse> showDataPolicyAsync(ShowDataPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.showDataPolicy);
    }

    /**
     * 查询项目级数据权限控制策略
     *
     * 查询项目级数据权限控制策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDataPolicyRequest 请求对象
     * @return AsyncInvoker<ShowDataPolicyRequest, ShowDataPolicyResponse>
     */
    public AsyncInvoker<ShowDataPolicyRequest, ShowDataPolicyResponse> showDataPolicyAsyncInvoker(
        ShowDataPolicyRequest request) {
        return new AsyncInvoker<ShowDataPolicyRequest, ShowDataPolicyResponse>(request, EiHealthMeta.showDataPolicy,
            hcClient);
    }

    /**
     * 订阅资产市场数据
     *
     * 订阅资产市场数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SubscribeDataRequest 请求对象
     * @return CompletableFuture<SubscribeDataResponse>
     */
    public CompletableFuture<SubscribeDataResponse> subscribeDataAsync(SubscribeDataRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.subscribeData);
    }

    /**
     * 订阅资产市场数据
     *
     * 订阅资产市场数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SubscribeDataRequest 请求对象
     * @return AsyncInvoker<SubscribeDataRequest, SubscribeDataResponse>
     */
    public AsyncInvoker<SubscribeDataRequest, SubscribeDataResponse> subscribeDataAsyncInvoker(
        SubscribeDataRequest request) {
        return new AsyncInvoker<SubscribeDataRequest, SubscribeDataResponse>(request, EiHealthMeta.subscribeData,
            hcClient);
    }

    /**
     * 设置项目级权限控制策略
     *
     * 设置项目级权限控制策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateDataPolicyRequest 请求对象
     * @return CompletableFuture<UpdateDataPolicyResponse>
     */
    public CompletableFuture<UpdateDataPolicyResponse> updateDataPolicyAsync(UpdateDataPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.updateDataPolicy);
    }

    /**
     * 设置项目级权限控制策略
     *
     * 设置项目级权限控制策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateDataPolicyRequest 请求对象
     * @return AsyncInvoker<UpdateDataPolicyRequest, UpdateDataPolicyResponse>
     */
    public AsyncInvoker<UpdateDataPolicyRequest, UpdateDataPolicyResponse> updateDataPolicyAsyncInvoker(
        UpdateDataPolicyRequest request) {
        return new AsyncInvoker<UpdateDataPolicyRequest, UpdateDataPolicyResponse>(request,
            EiHealthMeta.updateDataPolicy, hcClient);
    }

    /**
     * 上传数据文件
     *
     * 上传数据文件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UploadDataRequest 请求对象
     * @return CompletableFuture<UploadDataResponse>
     */
    public CompletableFuture<UploadDataResponse> uploadDataAsync(UploadDataRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.uploadData);
    }

    /**
     * 上传数据文件
     *
     * 上传数据文件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UploadDataRequest 请求对象
     * @return AsyncInvoker<UploadDataRequest, UploadDataResponse>
     */
    public AsyncInvoker<UploadDataRequest, UploadDataResponse> uploadDataAsyncInvoker(UploadDataRequest request) {
        return new AsyncInvoker<UploadDataRequest, UploadDataResponse>(request, EiHealthMeta.uploadData, hcClient);
    }

    /**
     * 取消数据作业
     *
     * 取消数据作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CancelDataJobRequest 请求对象
     * @return CompletableFuture<CancelDataJobResponse>
     */
    public CompletableFuture<CancelDataJobResponse> cancelDataJobAsync(CancelDataJobRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.cancelDataJob);
    }

    /**
     * 取消数据作业
     *
     * 取消数据作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CancelDataJobRequest 请求对象
     * @return AsyncInvoker<CancelDataJobRequest, CancelDataJobResponse>
     */
    public AsyncInvoker<CancelDataJobRequest, CancelDataJobResponse> cancelDataJobAsyncInvoker(
        CancelDataJobRequest request) {
        return new AsyncInvoker<CancelDataJobRequest, CancelDataJobResponse>(request, EiHealthMeta.cancelDataJob,
            hcClient);
    }

    /**
     * 删除数据作业
     *
     * 删除数据作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteDataJobRequest 请求对象
     * @return CompletableFuture<DeleteDataJobResponse>
     */
    public CompletableFuture<DeleteDataJobResponse> deleteDataJobAsync(DeleteDataJobRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.deleteDataJob);
    }

    /**
     * 删除数据作业
     *
     * 删除数据作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteDataJobRequest 请求对象
     * @return AsyncInvoker<DeleteDataJobRequest, DeleteDataJobResponse>
     */
    public AsyncInvoker<DeleteDataJobRequest, DeleteDataJobResponse> deleteDataJobAsyncInvoker(
        DeleteDataJobRequest request) {
        return new AsyncInvoker<DeleteDataJobRequest, DeleteDataJobResponse>(request, EiHealthMeta.deleteDataJob,
            hcClient);
    }

    /**
     * 下载数据作业执行日志
     *
     * 下载数据作业执行日志
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DownloadDataJobLogRequest 请求对象
     * @return CompletableFuture<DownloadDataJobLogResponse>
     */
    public CompletableFuture<DownloadDataJobLogResponse> downloadDataJobLogAsync(DownloadDataJobLogRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.downloadDataJobLog);
    }

    /**
     * 下载数据作业执行日志
     *
     * 下载数据作业执行日志
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DownloadDataJobLogRequest 请求对象
     * @return AsyncInvoker<DownloadDataJobLogRequest, DownloadDataJobLogResponse>
     */
    public AsyncInvoker<DownloadDataJobLogRequest, DownloadDataJobLogResponse> downloadDataJobLogAsyncInvoker(
        DownloadDataJobLogRequest request) {
        return new AsyncInvoker<DownloadDataJobLogRequest, DownloadDataJobLogResponse>(request,
            EiHealthMeta.downloadDataJobLog, hcClient);
    }

    /**
     * 获取数据作业执行日志
     *
     * 获取数据作业执行日志
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListCheckpointRequest 请求对象
     * @return CompletableFuture<ListCheckpointResponse>
     */
    public CompletableFuture<ListCheckpointResponse> listCheckpointAsync(ListCheckpointRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.listCheckpoint);
    }

    /**
     * 获取数据作业执行日志
     *
     * 获取数据作业执行日志
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListCheckpointRequest 请求对象
     * @return AsyncInvoker<ListCheckpointRequest, ListCheckpointResponse>
     */
    public AsyncInvoker<ListCheckpointRequest, ListCheckpointResponse> listCheckpointAsyncInvoker(
        ListCheckpointRequest request) {
        return new AsyncInvoker<ListCheckpointRequest, ListCheckpointResponse>(request, EiHealthMeta.listCheckpoint,
            hcClient);
    }

    /**
     * 获取数据作业列表
     *
     * 获取数据作业列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDataJobRequest 请求对象
     * @return CompletableFuture<ListDataJobResponse>
     */
    public CompletableFuture<ListDataJobResponse> listDataJobAsync(ListDataJobRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.listDataJob);
    }

    /**
     * 获取数据作业列表
     *
     * 获取数据作业列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDataJobRequest 请求对象
     * @return AsyncInvoker<ListDataJobRequest, ListDataJobResponse>
     */
    public AsyncInvoker<ListDataJobRequest, ListDataJobResponse> listDataJobAsyncInvoker(ListDataJobRequest request) {
        return new AsyncInvoker<ListDataJobRequest, ListDataJobResponse>(request, EiHealthMeta.listDataJob, hcClient);
    }

    /**
     * 重试数据作业
     *
     * 重试数据作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RetryDataJobRequest 请求对象
     * @return CompletableFuture<RetryDataJobResponse>
     */
    public CompletableFuture<RetryDataJobResponse> retryDataJobAsync(RetryDataJobRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.retryDataJob);
    }

    /**
     * 重试数据作业
     *
     * 重试数据作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RetryDataJobRequest 请求对象
     * @return AsyncInvoker<RetryDataJobRequest, RetryDataJobResponse>
     */
    public AsyncInvoker<RetryDataJobRequest, RetryDataJobResponse> retryDataJobAsyncInvoker(
        RetryDataJobRequest request) {
        return new AsyncInvoker<RetryDataJobRequest, RetryDataJobResponse>(request, EiHealthMeta.retryDataJob,
            hcClient);
    }

    /**
     * 获取数据作业详细信息
     *
     * 获取数据作业详细信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDataJobRequest 请求对象
     * @return CompletableFuture<ShowDataJobResponse>
     */
    public CompletableFuture<ShowDataJobResponse> showDataJobAsync(ShowDataJobRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.showDataJob);
    }

    /**
     * 获取数据作业详细信息
     *
     * 获取数据作业详细信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDataJobRequest 请求对象
     * @return AsyncInvoker<ShowDataJobRequest, ShowDataJobResponse>
     */
    public AsyncInvoker<ShowDataJobRequest, ShowDataJobResponse> showDataJobAsyncInvoker(ShowDataJobRequest request) {
        return new AsyncInvoker<ShowDataJobRequest, ShowDataJobResponse>(request, EiHealthMeta.showDataJob, hcClient);
    }

    /**
     * 插入单条数据
     *
     * 插入单条数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateDatabaseDataRequest 请求对象
     * @return CompletableFuture<CreateDatabaseDataResponse>
     */
    public CompletableFuture<CreateDatabaseDataResponse> createDatabaseDataAsync(CreateDatabaseDataRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.createDatabaseData);
    }

    /**
     * 插入单条数据
     *
     * 插入单条数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateDatabaseDataRequest 请求对象
     * @return AsyncInvoker<CreateDatabaseDataRequest, CreateDatabaseDataResponse>
     */
    public AsyncInvoker<CreateDatabaseDataRequest, CreateDatabaseDataResponse> createDatabaseDataAsyncInvoker(
        CreateDatabaseDataRequest request) {
        return new AsyncInvoker<CreateDatabaseDataRequest, CreateDatabaseDataResponse>(request,
            EiHealthMeta.createDatabaseData, hcClient);
    }

    /**
     * 创建数据库实例
     *
     * 创建数据库实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateInstanceRequest 请求对象
     * @return CompletableFuture<CreateInstanceResponse>
     */
    public CompletableFuture<CreateInstanceResponse> createInstanceAsync(CreateInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.createInstance);
    }

    /**
     * 创建数据库实例
     *
     * 创建数据库实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateInstanceRequest 请求对象
     * @return AsyncInvoker<CreateInstanceRequest, CreateInstanceResponse>
     */
    public AsyncInvoker<CreateInstanceRequest, CreateInstanceResponse> createInstanceAsyncInvoker(
        CreateInstanceRequest request) {
        return new AsyncInvoker<CreateInstanceRequest, CreateInstanceResponse>(request, EiHealthMeta.createInstance,
            hcClient);
    }

    /**
     * 删除数据
     *
     * 删除指定行数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteDatabaseDataRequest 请求对象
     * @return CompletableFuture<DeleteDatabaseDataResponse>
     */
    public CompletableFuture<DeleteDatabaseDataResponse> deleteDatabaseDataAsync(DeleteDatabaseDataRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.deleteDatabaseData);
    }

    /**
     * 删除数据
     *
     * 删除指定行数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteDatabaseDataRequest 请求对象
     * @return AsyncInvoker<DeleteDatabaseDataRequest, DeleteDatabaseDataResponse>
     */
    public AsyncInvoker<DeleteDatabaseDataRequest, DeleteDatabaseDataResponse> deleteDatabaseDataAsyncInvoker(
        DeleteDatabaseDataRequest request) {
        return new AsyncInvoker<DeleteDatabaseDataRequest, DeleteDatabaseDataResponse>(request,
            EiHealthMeta.deleteDatabaseData, hcClient);
    }

    /**
     * 删除实例
     *
     * 删除实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteInstanceRequest 请求对象
     * @return CompletableFuture<DeleteInstanceResponse>
     */
    public CompletableFuture<DeleteInstanceResponse> deleteInstanceAsync(DeleteInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.deleteInstance);
    }

    /**
     * 删除实例
     *
     * 删除实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteInstanceRequest 请求对象
     * @return AsyncInvoker<DeleteInstanceRequest, DeleteInstanceResponse>
     */
    public AsyncInvoker<DeleteInstanceRequest, DeleteInstanceResponse> deleteInstanceAsyncInvoker(
        DeleteInstanceRequest request) {
        return new AsyncInvoker<DeleteInstanceRequest, DeleteInstanceResponse>(request, EiHealthMeta.deleteInstance,
            hcClient);
    }

    /**
     * 导入数据
     *
     * 导入数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ImportDatabaseDataRequest 请求对象
     * @return CompletableFuture<ImportDatabaseDataResponse>
     */
    public CompletableFuture<ImportDatabaseDataResponse> importDatabaseDataAsync(ImportDatabaseDataRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.importDatabaseData);
    }

    /**
     * 导入数据
     *
     * 导入数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ImportDatabaseDataRequest 请求对象
     * @return AsyncInvoker<ImportDatabaseDataRequest, ImportDatabaseDataResponse>
     */
    public AsyncInvoker<ImportDatabaseDataRequest, ImportDatabaseDataResponse> importDatabaseDataAsyncInvoker(
        ImportDatabaseDataRequest request) {
        return new AsyncInvoker<ImportDatabaseDataRequest, ImportDatabaseDataResponse>(request,
            EiHealthMeta.importDatabaseData, hcClient);
    }

    /**
     * 查询数据
     *
     * 查询数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDatabaseDataRequest 请求对象
     * @return CompletableFuture<ListDatabaseDataResponse>
     */
    public CompletableFuture<ListDatabaseDataResponse> listDatabaseDataAsync(ListDatabaseDataRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.listDatabaseData);
    }

    /**
     * 查询数据
     *
     * 查询数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDatabaseDataRequest 请求对象
     * @return AsyncInvoker<ListDatabaseDataRequest, ListDatabaseDataResponse>
     */
    public AsyncInvoker<ListDatabaseDataRequest, ListDatabaseDataResponse> listDatabaseDataAsyncInvoker(
        ListDatabaseDataRequest request) {
        return new AsyncInvoker<ListDatabaseDataRequest, ListDatabaseDataResponse>(request,
            EiHealthMeta.listDatabaseData, hcClient);
    }

    /**
     * 获取实例列表
     *
     * 获取实例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListInstanceRequest 请求对象
     * @return CompletableFuture<ListInstanceResponse>
     */
    public CompletableFuture<ListInstanceResponse> listInstanceAsync(ListInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.listInstance);
    }

    /**
     * 获取实例列表
     *
     * 获取实例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListInstanceRequest 请求对象
     * @return AsyncInvoker<ListInstanceRequest, ListInstanceResponse>
     */
    public AsyncInvoker<ListInstanceRequest, ListInstanceResponse> listInstanceAsyncInvoker(
        ListInstanceRequest request) {
        return new AsyncInvoker<ListInstanceRequest, ListInstanceResponse>(request, EiHealthMeta.listInstance,
            hcClient);
    }

    /**
     * 引用数据库实例
     *
     * 引用数据库实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param QuoteInstanceRequest 请求对象
     * @return CompletableFuture<QuoteInstanceResponse>
     */
    public CompletableFuture<QuoteInstanceResponse> quoteInstanceAsync(QuoteInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.quoteInstance);
    }

    /**
     * 引用数据库实例
     *
     * 引用数据库实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param QuoteInstanceRequest 请求对象
     * @return AsyncInvoker<QuoteInstanceRequest, QuoteInstanceResponse>
     */
    public AsyncInvoker<QuoteInstanceRequest, QuoteInstanceResponse> quoteInstanceAsyncInvoker(
        QuoteInstanceRequest request) {
        return new AsyncInvoker<QuoteInstanceRequest, QuoteInstanceResponse>(request, EiHealthMeta.quoteInstance,
            hcClient);
    }

    /**
     * 查询实例详情
     *
     * 查询实例详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowInstanceRequest 请求对象
     * @return CompletableFuture<ShowInstanceResponse>
     */
    public CompletableFuture<ShowInstanceResponse> showInstanceAsync(ShowInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.showInstance);
    }

    /**
     * 查询实例详情
     *
     * 查询实例详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowInstanceRequest 请求对象
     * @return AsyncInvoker<ShowInstanceRequest, ShowInstanceResponse>
     */
    public AsyncInvoker<ShowInstanceRequest, ShowInstanceResponse> showInstanceAsyncInvoker(
        ShowInstanceRequest request) {
        return new AsyncInvoker<ShowInstanceRequest, ShowInstanceResponse>(request, EiHealthMeta.showInstance,
            hcClient);
    }

    /**
     * 更新数据
     *
     * 更新数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateDatabaseDataRequest 请求对象
     * @return CompletableFuture<UpdateDatabaseDataResponse>
     */
    public CompletableFuture<UpdateDatabaseDataResponse> updateDatabaseDataAsync(UpdateDatabaseDataRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.updateDatabaseData);
    }

    /**
     * 更新数据
     *
     * 更新数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateDatabaseDataRequest 请求对象
     * @return AsyncInvoker<UpdateDatabaseDataRequest, UpdateDatabaseDataResponse>
     */
    public AsyncInvoker<UpdateDatabaseDataRequest, UpdateDatabaseDataResponse> updateDatabaseDataAsyncInvoker(
        UpdateDatabaseDataRequest request) {
        return new AsyncInvoker<UpdateDatabaseDataRequest, UpdateDatabaseDataResponse>(request,
            EiHealthMeta.updateDatabaseData, hcClient);
    }

    /**
     * 购买数据库资源
     *
     * 购买数据库资源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateDatabaseResourceRequest 请求对象
     * @return CompletableFuture<CreateDatabaseResourceResponse>
     */
    public CompletableFuture<CreateDatabaseResourceResponse> createDatabaseResourceAsync(
        CreateDatabaseResourceRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.createDatabaseResource);
    }

    /**
     * 购买数据库资源
     *
     * 购买数据库资源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateDatabaseResourceRequest 请求对象
     * @return AsyncInvoker<CreateDatabaseResourceRequest, CreateDatabaseResourceResponse>
     */
    public AsyncInvoker<CreateDatabaseResourceRequest, CreateDatabaseResourceResponse> createDatabaseResourceAsyncInvoker(
        CreateDatabaseResourceRequest request) {
        return new AsyncInvoker<CreateDatabaseResourceRequest, CreateDatabaseResourceResponse>(request,
            EiHealthMeta.createDatabaseResource, hcClient);
    }

    /**
     * 删除数据库资源
     *
     * 删除数据库资源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteDatabaseResourceRequest 请求对象
     * @return CompletableFuture<DeleteDatabaseResourceResponse>
     */
    public CompletableFuture<DeleteDatabaseResourceResponse> deleteDatabaseResourceAsync(
        DeleteDatabaseResourceRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.deleteDatabaseResource);
    }

    /**
     * 删除数据库资源
     *
     * 删除数据库资源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteDatabaseResourceRequest 请求对象
     * @return AsyncInvoker<DeleteDatabaseResourceRequest, DeleteDatabaseResourceResponse>
     */
    public AsyncInvoker<DeleteDatabaseResourceRequest, DeleteDatabaseResourceResponse> deleteDatabaseResourceAsyncInvoker(
        DeleteDatabaseResourceRequest request) {
        return new AsyncInvoker<DeleteDatabaseResourceRequest, DeleteDatabaseResourceResponse>(request,
            EiHealthMeta.deleteDatabaseResource, hcClient);
    }

    /**
     * 查询数据库资源
     *
     * 查询数据库资源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDatabaseResourceRequest 请求对象
     * @return CompletableFuture<ListDatabaseResourceResponse>
     */
    public CompletableFuture<ListDatabaseResourceResponse> listDatabaseResourceAsync(
        ListDatabaseResourceRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.listDatabaseResource);
    }

    /**
     * 查询数据库资源
     *
     * 查询数据库资源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDatabaseResourceRequest 请求对象
     * @return AsyncInvoker<ListDatabaseResourceRequest, ListDatabaseResourceResponse>
     */
    public AsyncInvoker<ListDatabaseResourceRequest, ListDatabaseResourceResponse> listDatabaseResourceAsyncInvoker(
        ListDatabaseResourceRequest request) {
        return new AsyncInvoker<ListDatabaseResourceRequest, ListDatabaseResourceResponse>(request,
            EiHealthMeta.listDatabaseResource, hcClient);
    }

    /**
     * 获取数据库资源规格列表
     *
     * 获取数据库资源规格列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDatabaseResourceFlavorRequest 请求对象
     * @return CompletableFuture<ListDatabaseResourceFlavorResponse>
     */
    public CompletableFuture<ListDatabaseResourceFlavorResponse> listDatabaseResourceFlavorAsync(
        ListDatabaseResourceFlavorRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.listDatabaseResourceFlavor);
    }

    /**
     * 获取数据库资源规格列表
     *
     * 获取数据库资源规格列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDatabaseResourceFlavorRequest 请求对象
     * @return AsyncInvoker<ListDatabaseResourceFlavorRequest, ListDatabaseResourceFlavorResponse>
     */
    public AsyncInvoker<ListDatabaseResourceFlavorRequest, ListDatabaseResourceFlavorResponse> listDatabaseResourceFlavorAsyncInvoker(
        ListDatabaseResourceFlavorRequest request) {
        return new AsyncInvoker<ListDatabaseResourceFlavorRequest, ListDatabaseResourceFlavorResponse>(request,
            EiHealthMeta.listDatabaseResourceFlavor, hcClient);
    }

    /**
     * 批量删除镜像tag
     *
     * 批量删除镜像tag
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchDeleteTagRequest 请求对象
     * @return CompletableFuture<BatchDeleteTagResponse>
     */
    public CompletableFuture<BatchDeleteTagResponse> batchDeleteTagAsync(BatchDeleteTagRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.batchDeleteTag);
    }

    /**
     * 批量删除镜像tag
     *
     * 批量删除镜像tag
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchDeleteTagRequest 请求对象
     * @return AsyncInvoker<BatchDeleteTagRequest, BatchDeleteTagResponse>
     */
    public AsyncInvoker<BatchDeleteTagRequest, BatchDeleteTagResponse> batchDeleteTagAsyncInvoker(
        BatchDeleteTagRequest request) {
        return new AsyncInvoker<BatchDeleteTagRequest, BatchDeleteTagResponse>(request, EiHealthMeta.batchDeleteTag,
            hcClient);
    }

    /**
     * 创建镜像
     *
     * 创建镜像
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateImageRequest 请求对象
     * @return CompletableFuture<CreateImageResponse>
     */
    public CompletableFuture<CreateImageResponse> createImageAsync(CreateImageRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.createImage);
    }

    /**
     * 创建镜像
     *
     * 创建镜像
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateImageRequest 请求对象
     * @return AsyncInvoker<CreateImageRequest, CreateImageResponse>
     */
    public AsyncInvoker<CreateImageRequest, CreateImageResponse> createImageAsyncInvoker(CreateImageRequest request) {
        return new AsyncInvoker<CreateImageRequest, CreateImageResponse>(request, EiHealthMeta.createImage, hcClient);
    }

    /**
     * 删除镜像仓库
     *
     * 删除镜像仓库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteImageRequest 请求对象
     * @return CompletableFuture<DeleteImageResponse>
     */
    public CompletableFuture<DeleteImageResponse> deleteImageAsync(DeleteImageRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.deleteImage);
    }

    /**
     * 删除镜像仓库
     *
     * 删除镜像仓库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteImageRequest 请求对象
     * @return AsyncInvoker<DeleteImageRequest, DeleteImageResponse>
     */
    public AsyncInvoker<DeleteImageRequest, DeleteImageResponse> deleteImageAsyncInvoker(DeleteImageRequest request) {
        return new AsyncInvoker<DeleteImageRequest, DeleteImageResponse>(request, EiHealthMeta.deleteImage, hcClient);
    }

    /**
     * 删除指定镜像tag
     *
     * 删除指定镜像tag
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteTagRequest 请求对象
     * @return CompletableFuture<DeleteTagResponse>
     */
    public CompletableFuture<DeleteTagResponse> deleteTagAsync(DeleteTagRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.deleteTag);
    }

    /**
     * 删除指定镜像tag
     *
     * 删除指定镜像tag
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteTagRequest 请求对象
     * @return AsyncInvoker<DeleteTagRequest, DeleteTagResponse>
     */
    public AsyncInvoker<DeleteTagRequest, DeleteTagResponse> deleteTagAsyncInvoker(DeleteTagRequest request) {
        return new AsyncInvoker<DeleteTagRequest, DeleteTagResponse>(request, EiHealthMeta.deleteTag, hcClient);
    }

    /**
     * 导入镜像
     *
     * 导入镜像
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ImportImageRequest 请求对象
     * @return CompletableFuture<ImportImageResponse>
     */
    public CompletableFuture<ImportImageResponse> importImageAsync(ImportImageRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.importImage);
    }

    /**
     * 导入镜像
     *
     * 导入镜像
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ImportImageRequest 请求对象
     * @return AsyncInvoker<ImportImageRequest, ImportImageResponse>
     */
    public AsyncInvoker<ImportImageRequest, ImportImageResponse> importImageAsyncInvoker(ImportImageRequest request) {
        return new AsyncInvoker<ImportImageRequest, ImportImageResponse>(request, EiHealthMeta.importImage, hcClient);
    }

    /**
     * 获取镜像列表
     *
     * 获取镜像列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListImageRequest 请求对象
     * @return CompletableFuture<ListImageResponse>
     */
    public CompletableFuture<ListImageResponse> listImageAsync(ListImageRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.listImage);
    }

    /**
     * 获取镜像列表
     *
     * 获取镜像列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListImageRequest 请求对象
     * @return AsyncInvoker<ListImageRequest, ListImageResponse>
     */
    public AsyncInvoker<ListImageRequest, ListImageResponse> listImageAsyncInvoker(ListImageRequest request) {
        return new AsyncInvoker<ListImageRequest, ListImageResponse>(request, EiHealthMeta.listImage, hcClient);
    }

    /**
     * 获取指定镜像的tag列表
     *
     * 获取指定镜像的tag列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListImageTagRequest 请求对象
     * @return CompletableFuture<ListImageTagResponse>
     */
    public CompletableFuture<ListImageTagResponse> listImageTagAsync(ListImageTagRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.listImageTag);
    }

    /**
     * 获取指定镜像的tag列表
     *
     * 获取指定镜像的tag列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListImageTagRequest 请求对象
     * @return AsyncInvoker<ListImageTagRequest, ListImageTagResponse>
     */
    public AsyncInvoker<ListImageTagRequest, ListImageTagResponse> listImageTagAsyncInvoker(
        ListImageTagRequest request) {
        return new AsyncInvoker<ListImageTagRequest, ListImageTagResponse>(request, EiHealthMeta.listImageTag,
            hcClient);
    }

    /**
     * 获取docker login指令
     *
     * 获取docker login指令
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDockerLoginRequest 请求对象
     * @return CompletableFuture<ShowDockerLoginResponse>
     */
    public CompletableFuture<ShowDockerLoginResponse> showDockerLoginAsync(ShowDockerLoginRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.showDockerLogin);
    }

    /**
     * 获取docker login指令
     *
     * 获取docker login指令
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDockerLoginRequest 请求对象
     * @return AsyncInvoker<ShowDockerLoginRequest, ShowDockerLoginResponse>
     */
    public AsyncInvoker<ShowDockerLoginRequest, ShowDockerLoginResponse> showDockerLoginAsyncInvoker(
        ShowDockerLoginRequest request) {
        return new AsyncInvoker<ShowDockerLoginRequest, ShowDockerLoginResponse>(request, EiHealthMeta.showDockerLogin,
            hcClient);
    }

    /**
     * 订阅镜像
     *
     * 订阅镜像
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SubscribeImageRequest 请求对象
     * @return CompletableFuture<SubscribeImageResponse>
     */
    public CompletableFuture<SubscribeImageResponse> subscribeImageAsync(SubscribeImageRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.subscribeImage);
    }

    /**
     * 订阅镜像
     *
     * 订阅镜像
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SubscribeImageRequest 请求对象
     * @return AsyncInvoker<SubscribeImageRequest, SubscribeImageResponse>
     */
    public AsyncInvoker<SubscribeImageRequest, SubscribeImageResponse> subscribeImageAsyncInvoker(
        SubscribeImageRequest request) {
        return new AsyncInvoker<SubscribeImageRequest, SubscribeImageResponse>(request, EiHealthMeta.subscribeImage,
            hcClient);
    }

    /**
     * 更新镜像描述信息或者类型
     *
     * 更新镜像描述信息或者类型
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateImageRequest 请求对象
     * @return CompletableFuture<UpdateImageResponse>
     */
    public CompletableFuture<UpdateImageResponse> updateImageAsync(UpdateImageRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.updateImage);
    }

    /**
     * 更新镜像描述信息或者类型
     *
     * 更新镜像描述信息或者类型
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateImageRequest 请求对象
     * @return AsyncInvoker<UpdateImageRequest, UpdateImageResponse>
     */
    public AsyncInvoker<UpdateImageRequest, UpdateImageResponse> updateImageAsyncInvoker(UpdateImageRequest request) {
        return new AsyncInvoker<UpdateImageRequest, UpdateImageResponse>(request, EiHealthMeta.updateImage, hcClient);
    }

    /**
     * 获取作业配置
     *
     * 获取作业配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowJobConfigRequest 请求对象
     * @return CompletableFuture<ShowJobConfigResponse>
     */
    public CompletableFuture<ShowJobConfigResponse> showJobConfigAsync(ShowJobConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.showJobConfig);
    }

    /**
     * 获取作业配置
     *
     * 获取作业配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowJobConfigRequest 请求对象
     * @return AsyncInvoker<ShowJobConfigRequest, ShowJobConfigResponse>
     */
    public AsyncInvoker<ShowJobConfigRequest, ShowJobConfigResponse> showJobConfigAsyncInvoker(
        ShowJobConfigRequest request) {
        return new AsyncInvoker<ShowJobConfigRequest, ShowJobConfigResponse>(request, EiHealthMeta.showJobConfig,
            hcClient);
    }

    /**
     * 设置作业配置
     *
     * 设置作业配置，目前支持修改保存时长(180天 - 10年)、记录数(1W-500W)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateJobConfigRequest 请求对象
     * @return CompletableFuture<UpdateJobConfigResponse>
     */
    public CompletableFuture<UpdateJobConfigResponse> updateJobConfigAsync(UpdateJobConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.updateJobConfig);
    }

    /**
     * 设置作业配置
     *
     * 设置作业配置，目前支持修改保存时长(180天 - 10年)、记录数(1W-500W)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateJobConfigRequest 请求对象
     * @return AsyncInvoker<UpdateJobConfigRequest, UpdateJobConfigResponse>
     */
    public AsyncInvoker<UpdateJobConfigRequest, UpdateJobConfigResponse> updateJobConfigAsyncInvoker(
        UpdateJobConfigRequest request) {
        return new AsyncInvoker<UpdateJobConfigRequest, UpdateJobConfigResponse>(request, EiHealthMeta.updateJobConfig,
            hcClient);
    }

    /**
     * 取消或强制停止作业调度
     *
     * 取消或强制作业调度
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CancelJobRequest 请求对象
     * @return CompletableFuture<CancelJobResponse>
     */
    public CompletableFuture<CancelJobResponse> cancelJobAsync(CancelJobRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.cancelJob);
    }

    /**
     * 取消或强制停止作业调度
     *
     * 取消或强制作业调度
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CancelJobRequest 请求对象
     * @return AsyncInvoker<CancelJobRequest, CancelJobResponse>
     */
    public AsyncInvoker<CancelJobRequest, CancelJobResponse> cancelJobAsyncInvoker(CancelJobRequest request) {
        return new AsyncInvoker<CancelJobRequest, CancelJobResponse>(request, EiHealthMeta.cancelJob, hcClient);
    }

    /**
     * 删除作业
     *
     * 删除作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteJobRequest 请求对象
     * @return CompletableFuture<DeleteJobResponse>
     */
    public CompletableFuture<DeleteJobResponse> deleteJobAsync(DeleteJobRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.deleteJob);
    }

    /**
     * 删除作业
     *
     * 删除作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteJobRequest 请求对象
     * @return AsyncInvoker<DeleteJobRequest, DeleteJobResponse>
     */
    public AsyncInvoker<DeleteJobRequest, DeleteJobResponse> deleteJobAsyncInvoker(DeleteJobRequest request) {
        return new AsyncInvoker<DeleteJobRequest, DeleteJobResponse>(request, EiHealthMeta.deleteJob, hcClient);
    }

    /**
     * 启动作业
     *
     * 启动作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ExecuteJobRequest 请求对象
     * @return CompletableFuture<ExecuteJobResponse>
     */
    public CompletableFuture<ExecuteJobResponse> executeJobAsync(ExecuteJobRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.executeJob);
    }

    /**
     * 启动作业
     *
     * 启动作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ExecuteJobRequest 请求对象
     * @return AsyncInvoker<ExecuteJobRequest, ExecuteJobResponse>
     */
    public AsyncInvoker<ExecuteJobRequest, ExecuteJobResponse> executeJobAsyncInvoker(ExecuteJobRequest request) {
        return new AsyncInvoker<ExecuteJobRequest, ExecuteJobResponse>(request, EiHealthMeta.executeJob, hcClient);
    }

    /**
     * 获取作业列表
     *
     * 获取作业列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListJobRequest 请求对象
     * @return CompletableFuture<ListJobResponse>
     */
    public CompletableFuture<ListJobResponse> listJobAsync(ListJobRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.listJob);
    }

    /**
     * 获取作业列表
     *
     * 获取作业列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListJobRequest 请求对象
     * @return AsyncInvoker<ListJobRequest, ListJobResponse>
     */
    public AsyncInvoker<ListJobRequest, ListJobResponse> listJobAsyncInvoker(ListJobRequest request) {
        return new AsyncInvoker<ListJobRequest, ListJobResponse>(request, EiHealthMeta.listJob, hcClient);
    }

    /**
     * 重试作业
     *
     * 重试作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RetryJobRequest 请求对象
     * @return CompletableFuture<RetryJobResponse>
     */
    public CompletableFuture<RetryJobResponse> retryJobAsync(RetryJobRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.retryJob);
    }

    /**
     * 重试作业
     *
     * 重试作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RetryJobRequest 请求对象
     * @return AsyncInvoker<RetryJobRequest, RetryJobResponse>
     */
    public AsyncInvoker<RetryJobRequest, RetryJobResponse> retryJobAsyncInvoker(RetryJobRequest request) {
        return new AsyncInvoker<RetryJobRequest, RetryJobResponse>(request, EiHealthMeta.retryJob, hcClient);
    }

    /**
     * 获取作业详情
     *
     * 获取作业详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowJobRequest 请求对象
     * @return CompletableFuture<ShowJobResponse>
     */
    public CompletableFuture<ShowJobResponse> showJobAsync(ShowJobRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.showJob);
    }

    /**
     * 获取作业详情
     *
     * 获取作业详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowJobRequest 请求对象
     * @return AsyncInvoker<ShowJobRequest, ShowJobResponse>
     */
    public AsyncInvoker<ShowJobRequest, ShowJobResponse> showJobAsyncInvoker(ShowJobRequest request) {
        return new AsyncInvoker<ShowJobRequest, ShowJobResponse>(request, EiHealthMeta.showJob, hcClient);
    }

    /**
     * 获取作业事件
     *
     * 获取作业事件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowJobEventRequest 请求对象
     * @return CompletableFuture<ShowJobEventResponse>
     */
    public CompletableFuture<ShowJobEventResponse> showJobEventAsync(ShowJobEventRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.showJobEvent);
    }

    /**
     * 获取作业事件
     *
     * 获取作业事件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowJobEventRequest 请求对象
     * @return AsyncInvoker<ShowJobEventRequest, ShowJobEventResponse>
     */
    public AsyncInvoker<ShowJobEventRequest, ShowJobEventResponse> showJobEventAsyncInvoker(
        ShowJobEventRequest request) {
        return new AsyncInvoker<ShowJobEventRequest, ShowJobEventResponse>(request, EiHealthMeta.showJobEvent,
            hcClient);
    }

    /**
     * 获取作业日志
     *
     * 获取作业日志
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowJobLogRequest 请求对象
     * @return CompletableFuture<ShowJobLogResponse>
     */
    public CompletableFuture<ShowJobLogResponse> showJobLogAsync(ShowJobLogRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.showJobLog);
    }

    /**
     * 获取作业日志
     *
     * 获取作业日志
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowJobLogRequest 请求对象
     * @return AsyncInvoker<ShowJobLogRequest, ShowJobLogResponse>
     */
    public AsyncInvoker<ShowJobLogRequest, ShowJobLogResponse> showJobLogAsyncInvoker(ShowJobLogRequest request) {
        return new AsyncInvoker<ShowJobLogRequest, ShowJobLogResponse>(request, EiHealthMeta.showJobLog, hcClient);
    }

    /**
     * 获取子任务启动事件
     *
     * 获取子任务启动事件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowTaskEventsRequest 请求对象
     * @return CompletableFuture<ShowTaskEventsResponse>
     */
    public CompletableFuture<ShowTaskEventsResponse> showTaskEventsAsync(ShowTaskEventsRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.showTaskEvents);
    }

    /**
     * 获取子任务启动事件
     *
     * 获取子任务启动事件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowTaskEventsRequest 请求对象
     * @return AsyncInvoker<ShowTaskEventsRequest, ShowTaskEventsResponse>
     */
    public AsyncInvoker<ShowTaskEventsRequest, ShowTaskEventsResponse> showTaskEventsAsyncInvoker(
        ShowTaskEventsRequest request) {
        return new AsyncInvoker<ShowTaskEventsRequest, ShowTaskEventsResponse>(request, EiHealthMeta.showTaskEvents,
            hcClient);
    }

    /**
     * 获取子任务中实例的事件
     *
     * 获取子任务中实例的事件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowTaskInstanceEventsRequest 请求对象
     * @return CompletableFuture<ShowTaskInstanceEventsResponse>
     */
    public CompletableFuture<ShowTaskInstanceEventsResponse> showTaskInstanceEventsAsync(
        ShowTaskInstanceEventsRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.showTaskInstanceEvents);
    }

    /**
     * 获取子任务中实例的事件
     *
     * 获取子任务中实例的事件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowTaskInstanceEventsRequest 请求对象
     * @return AsyncInvoker<ShowTaskInstanceEventsRequest, ShowTaskInstanceEventsResponse>
     */
    public AsyncInvoker<ShowTaskInstanceEventsRequest, ShowTaskInstanceEventsResponse> showTaskInstanceEventsAsyncInvoker(
        ShowTaskInstanceEventsRequest request) {
        return new AsyncInvoker<ShowTaskInstanceEventsRequest, ShowTaskInstanceEventsResponse>(request,
            EiHealthMeta.showTaskInstanceEvents, hcClient);
    }

    /**
     * 获取子任务中实例的pod信息
     *
     * 获取子任务中实例的pod信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowTaskInstancePodRequest 请求对象
     * @return CompletableFuture<ShowTaskInstancePodResponse>
     */
    public CompletableFuture<ShowTaskInstancePodResponse> showTaskInstancePodAsync(ShowTaskInstancePodRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.showTaskInstancePod);
    }

    /**
     * 获取子任务中实例的pod信息
     *
     * 获取子任务中实例的pod信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowTaskInstancePodRequest 请求对象
     * @return AsyncInvoker<ShowTaskInstancePodRequest, ShowTaskInstancePodResponse>
     */
    public AsyncInvoker<ShowTaskInstancePodRequest, ShowTaskInstancePodResponse> showTaskInstancePodAsyncInvoker(
        ShowTaskInstancePodRequest request) {
        return new AsyncInvoker<ShowTaskInstancePodRequest, ShowTaskInstancePodResponse>(request,
            EiHealthMeta.showTaskInstancePod, hcClient);
    }

    /**
     * 获取子任务实例信息
     *
     * 获取子任务实例信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowTaskInstancesRequest 请求对象
     * @return CompletableFuture<ShowTaskInstancesResponse>
     */
    public CompletableFuture<ShowTaskInstancesResponse> showTaskInstancesAsync(ShowTaskInstancesRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.showTaskInstances);
    }

    /**
     * 获取子任务实例信息
     *
     * 获取子任务实例信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowTaskInstancesRequest 请求对象
     * @return AsyncInvoker<ShowTaskInstancesRequest, ShowTaskInstancesResponse>
     */
    public AsyncInvoker<ShowTaskInstancesRequest, ShowTaskInstancesResponse> showTaskInstancesAsyncInvoker(
        ShowTaskInstancesRequest request) {
        return new AsyncInvoker<ShowTaskInstancesRequest, ShowTaskInstancesResponse>(request,
            EiHealthMeta.showTaskInstances, hcClient);
    }

    /**
     * 创建标签
     *
     * 创建标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateLabelRequest 请求对象
     * @return CompletableFuture<CreateLabelResponse>
     */
    public CompletableFuture<CreateLabelResponse> createLabelAsync(CreateLabelRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.createLabel);
    }

    /**
     * 创建标签
     *
     * 创建标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateLabelRequest 请求对象
     * @return AsyncInvoker<CreateLabelRequest, CreateLabelResponse>
     */
    public AsyncInvoker<CreateLabelRequest, CreateLabelResponse> createLabelAsyncInvoker(CreateLabelRequest request) {
        return new AsyncInvoker<CreateLabelRequest, CreateLabelResponse>(request, EiHealthMeta.createLabel, hcClient);
    }

    /**
     * 删除标签
     *
     * 删除标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteLabelRequest 请求对象
     * @return CompletableFuture<DeleteLabelResponse>
     */
    public CompletableFuture<DeleteLabelResponse> deleteLabelAsync(DeleteLabelRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.deleteLabel);
    }

    /**
     * 删除标签
     *
     * 删除标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteLabelRequest 请求对象
     * @return AsyncInvoker<DeleteLabelRequest, DeleteLabelResponse>
     */
    public AsyncInvoker<DeleteLabelRequest, DeleteLabelResponse> deleteLabelAsyncInvoker(DeleteLabelRequest request) {
        return new AsyncInvoker<DeleteLabelRequest, DeleteLabelResponse>(request, EiHealthMeta.deleteLabel, hcClient);
    }

    /**
     * 获取标签列表
     *
     * 获取标签列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListLabelRequest 请求对象
     * @return CompletableFuture<ListLabelResponse>
     */
    public CompletableFuture<ListLabelResponse> listLabelAsync(ListLabelRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.listLabel);
    }

    /**
     * 获取标签列表
     *
     * 获取标签列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListLabelRequest 请求对象
     * @return AsyncInvoker<ListLabelRequest, ListLabelResponse>
     */
    public AsyncInvoker<ListLabelRequest, ListLabelResponse> listLabelAsyncInvoker(ListLabelRequest request) {
        return new AsyncInvoker<ListLabelRequest, ListLabelResponse>(request, EiHealthMeta.listLabel, hcClient);
    }

    /**
     * 创建标签页面
     *
     * 创建标签页面
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateLabelPageRequest 请求对象
     * @return CompletableFuture<CreateLabelPageResponse>
     */
    public CompletableFuture<CreateLabelPageResponse> createLabelPageAsync(CreateLabelPageRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.createLabelPage);
    }

    /**
     * 创建标签页面
     *
     * 创建标签页面
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateLabelPageRequest 请求对象
     * @return AsyncInvoker<CreateLabelPageRequest, CreateLabelPageResponse>
     */
    public AsyncInvoker<CreateLabelPageRequest, CreateLabelPageResponse> createLabelPageAsyncInvoker(
        CreateLabelPageRequest request) {
        return new AsyncInvoker<CreateLabelPageRequest, CreateLabelPageResponse>(request, EiHealthMeta.createLabelPage,
            hcClient);
    }

    /**
     * 删除标签页面
     *
     * 删除标签页面
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteLabelPageRequest 请求对象
     * @return CompletableFuture<DeleteLabelPageResponse>
     */
    public CompletableFuture<DeleteLabelPageResponse> deleteLabelPageAsync(DeleteLabelPageRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.deleteLabelPage);
    }

    /**
     * 删除标签页面
     *
     * 删除标签页面
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteLabelPageRequest 请求对象
     * @return AsyncInvoker<DeleteLabelPageRequest, DeleteLabelPageResponse>
     */
    public AsyncInvoker<DeleteLabelPageRequest, DeleteLabelPageResponse> deleteLabelPageAsyncInvoker(
        DeleteLabelPageRequest request) {
        return new AsyncInvoker<DeleteLabelPageRequest, DeleteLabelPageResponse>(request, EiHealthMeta.deleteLabelPage,
            hcClient);
    }

    /**
     * 获取标签页面列表
     *
     * 获取标签页面列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListLabelPageRequest 请求对象
     * @return CompletableFuture<ListLabelPageResponse>
     */
    public CompletableFuture<ListLabelPageResponse> listLabelPageAsync(ListLabelPageRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.listLabelPage);
    }

    /**
     * 获取标签页面列表
     *
     * 获取标签页面列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListLabelPageRequest 请求对象
     * @return AsyncInvoker<ListLabelPageRequest, ListLabelPageResponse>
     */
    public AsyncInvoker<ListLabelPageRequest, ListLabelPageResponse> listLabelPageAsyncInvoker(
        ListLabelPageRequest request) {
        return new AsyncInvoker<ListLabelPageRequest, ListLabelPageResponse>(request, EiHealthMeta.listLabelPage,
            hcClient);
    }

    /**
     * 邮箱连通性测试
     *
     * 邮箱连通性测试
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CheckEmailConnectionRequest 请求对象
     * @return CompletableFuture<CheckEmailConnectionResponse>
     */
    public CompletableFuture<CheckEmailConnectionResponse> checkEmailConnectionAsync(
        CheckEmailConnectionRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.checkEmailConnection);
    }

    /**
     * 邮箱连通性测试
     *
     * 邮箱连通性测试
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CheckEmailConnectionRequest 请求对象
     * @return AsyncInvoker<CheckEmailConnectionRequest, CheckEmailConnectionResponse>
     */
    public AsyncInvoker<CheckEmailConnectionRequest, CheckEmailConnectionResponse> checkEmailConnectionAsyncInvoker(
        CheckEmailConnectionRequest request) {
        return new AsyncInvoker<CheckEmailConnectionRequest, CheckEmailConnectionResponse>(request,
            EiHealthMeta.checkEmailConnection, hcClient);
    }

    /**
     * 删除消息邮件配置
     *
     * 删除消息邮件配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteMessageEmailConfigRequest 请求对象
     * @return CompletableFuture<DeleteMessageEmailConfigResponse>
     */
    public CompletableFuture<DeleteMessageEmailConfigResponse> deleteMessageEmailConfigAsync(
        DeleteMessageEmailConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.deleteMessageEmailConfig);
    }

    /**
     * 删除消息邮件配置
     *
     * 删除消息邮件配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteMessageEmailConfigRequest 请求对象
     * @return AsyncInvoker<DeleteMessageEmailConfigRequest, DeleteMessageEmailConfigResponse>
     */
    public AsyncInvoker<DeleteMessageEmailConfigRequest, DeleteMessageEmailConfigResponse> deleteMessageEmailConfigAsyncInvoker(
        DeleteMessageEmailConfigRequest request) {
        return new AsyncInvoker<DeleteMessageEmailConfigRequest, DeleteMessageEmailConfigResponse>(request,
            EiHealthMeta.deleteMessageEmailConfig, hcClient);
    }

    /**
     * 获取消息列表
     *
     * 从消息中心获取当前用户有权限查看的消息列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListMessageRequest 请求对象
     * @return CompletableFuture<ListMessageResponse>
     */
    public CompletableFuture<ListMessageResponse> listMessageAsync(ListMessageRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.listMessage);
    }

    /**
     * 获取消息列表
     *
     * 从消息中心获取当前用户有权限查看的消息列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListMessageRequest 请求对象
     * @return AsyncInvoker<ListMessageRequest, ListMessageResponse>
     */
    public AsyncInvoker<ListMessageRequest, ListMessageResponse> listMessageAsyncInvoker(ListMessageRequest request) {
        return new AsyncInvoker<ListMessageRequest, ListMessageResponse>(request, EiHealthMeta.listMessage, hcClient);
    }

    /**
     * 获取消息清理规则
     *
     * 获取消息清理规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowMessageClearRuleRequest 请求对象
     * @return CompletableFuture<ShowMessageClearRuleResponse>
     */
    public CompletableFuture<ShowMessageClearRuleResponse> showMessageClearRuleAsync(
        ShowMessageClearRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.showMessageClearRule);
    }

    /**
     * 获取消息清理规则
     *
     * 获取消息清理规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowMessageClearRuleRequest 请求对象
     * @return AsyncInvoker<ShowMessageClearRuleRequest, ShowMessageClearRuleResponse>
     */
    public AsyncInvoker<ShowMessageClearRuleRequest, ShowMessageClearRuleResponse> showMessageClearRuleAsyncInvoker(
        ShowMessageClearRuleRequest request) {
        return new AsyncInvoker<ShowMessageClearRuleRequest, ShowMessageClearRuleResponse>(request,
            EiHealthMeta.showMessageClearRule, hcClient);
    }

    /**
     * 获取消息邮件配置
     *
     * 获取消息邮件配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowMessageEmailConfigRequest 请求对象
     * @return CompletableFuture<ShowMessageEmailConfigResponse>
     */
    public CompletableFuture<ShowMessageEmailConfigResponse> showMessageEmailConfigAsync(
        ShowMessageEmailConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.showMessageEmailConfig);
    }

    /**
     * 获取消息邮件配置
     *
     * 获取消息邮件配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowMessageEmailConfigRequest 请求对象
     * @return AsyncInvoker<ShowMessageEmailConfigRequest, ShowMessageEmailConfigResponse>
     */
    public AsyncInvoker<ShowMessageEmailConfigRequest, ShowMessageEmailConfigResponse> showMessageEmailConfigAsyncInvoker(
        ShowMessageEmailConfigRequest request) {
        return new AsyncInvoker<ShowMessageEmailConfigRequest, ShowMessageEmailConfigResponse>(request,
            EiHealthMeta.showMessageEmailConfig, hcClient);
    }

    /**
     * 获取用户邮件配置
     *
     * 获取用户邮件配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowMessageReceiveConfigRequest 请求对象
     * @return CompletableFuture<ShowMessageReceiveConfigResponse>
     */
    public CompletableFuture<ShowMessageReceiveConfigResponse> showMessageReceiveConfigAsync(
        ShowMessageReceiveConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.showMessageReceiveConfig);
    }

    /**
     * 获取用户邮件配置
     *
     * 获取用户邮件配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowMessageReceiveConfigRequest 请求对象
     * @return AsyncInvoker<ShowMessageReceiveConfigRequest, ShowMessageReceiveConfigResponse>
     */
    public AsyncInvoker<ShowMessageReceiveConfigRequest, ShowMessageReceiveConfigResponse> showMessageReceiveConfigAsyncInvoker(
        ShowMessageReceiveConfigRequest request) {
        return new AsyncInvoker<ShowMessageReceiveConfigRequest, ShowMessageReceiveConfigResponse>(request,
            EiHealthMeta.showMessageReceiveConfig, hcClient);
    }

    /**
     * 设置消息清理规则
     *
     * 设置消息清理规则，支持修改保存时长(180天 - 10年)、记录数(1W-500W)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateMessageClearRuleRequest 请求对象
     * @return CompletableFuture<UpdateMessageClearRuleResponse>
     */
    public CompletableFuture<UpdateMessageClearRuleResponse> updateMessageClearRuleAsync(
        UpdateMessageClearRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.updateMessageClearRule);
    }

    /**
     * 设置消息清理规则
     *
     * 设置消息清理规则，支持修改保存时长(180天 - 10年)、记录数(1W-500W)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateMessageClearRuleRequest 请求对象
     * @return AsyncInvoker<UpdateMessageClearRuleRequest, UpdateMessageClearRuleResponse>
     */
    public AsyncInvoker<UpdateMessageClearRuleRequest, UpdateMessageClearRuleResponse> updateMessageClearRuleAsyncInvoker(
        UpdateMessageClearRuleRequest request) {
        return new AsyncInvoker<UpdateMessageClearRuleRequest, UpdateMessageClearRuleResponse>(request,
            EiHealthMeta.updateMessageClearRule, hcClient);
    }

    /**
     * 设置消息邮件配置
     *
     * 设置消息邮件配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateMessageEmailConfigRequest 请求对象
     * @return CompletableFuture<UpdateMessageEmailConfigResponse>
     */
    public CompletableFuture<UpdateMessageEmailConfigResponse> updateMessageEmailConfigAsync(
        UpdateMessageEmailConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.updateMessageEmailConfig);
    }

    /**
     * 设置消息邮件配置
     *
     * 设置消息邮件配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateMessageEmailConfigRequest 请求对象
     * @return AsyncInvoker<UpdateMessageEmailConfigRequest, UpdateMessageEmailConfigResponse>
     */
    public AsyncInvoker<UpdateMessageEmailConfigRequest, UpdateMessageEmailConfigResponse> updateMessageEmailConfigAsyncInvoker(
        UpdateMessageEmailConfigRequest request) {
        return new AsyncInvoker<UpdateMessageEmailConfigRequest, UpdateMessageEmailConfigResponse>(request,
            EiHealthMeta.updateMessageEmailConfig, hcClient);
    }

    /**
     * 设置用户邮件配置
     *
     * 设置用户邮件配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateMessageReceiveConfigRequest 请求对象
     * @return CompletableFuture<UpdateMessageReceiveConfigResponse>
     */
    public CompletableFuture<UpdateMessageReceiveConfigResponse> updateMessageReceiveConfigAsync(
        UpdateMessageReceiveConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.updateMessageReceiveConfig);
    }

    /**
     * 设置用户邮件配置
     *
     * 设置用户邮件配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateMessageReceiveConfigRequest 请求对象
     * @return AsyncInvoker<UpdateMessageReceiveConfigRequest, UpdateMessageReceiveConfigResponse>
     */
    public AsyncInvoker<UpdateMessageReceiveConfigRequest, UpdateMessageReceiveConfigResponse> updateMessageReceiveConfigAsyncInvoker(
        UpdateMessageReceiveConfigRequest request) {
        return new AsyncInvoker<UpdateMessageReceiveConfigRequest, UpdateMessageReceiveConfigResponse>(request,
            EiHealthMeta.updateMessageReceiveConfig, hcClient);
    }

    /**
     * 设置节点标签
     *
     * 设置节点标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchUpdateNodeLabelRequest 请求对象
     * @return CompletableFuture<BatchUpdateNodeLabelResponse>
     */
    public CompletableFuture<BatchUpdateNodeLabelResponse> batchUpdateNodeLabelAsync(
        BatchUpdateNodeLabelRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.batchUpdateNodeLabel);
    }

    /**
     * 设置节点标签
     *
     * 设置节点标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchUpdateNodeLabelRequest 请求对象
     * @return AsyncInvoker<BatchUpdateNodeLabelRequest, BatchUpdateNodeLabelResponse>
     */
    public AsyncInvoker<BatchUpdateNodeLabelRequest, BatchUpdateNodeLabelResponse> batchUpdateNodeLabelAsyncInvoker(
        BatchUpdateNodeLabelRequest request) {
        return new AsyncInvoker<BatchUpdateNodeLabelRequest, BatchUpdateNodeLabelResponse>(request,
            EiHealthMeta.batchUpdateNodeLabel, hcClient);
    }

    /**
     * 获取节点标签集
     *
     * 获取节点标签集
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListClusterAllNodeLabelRequest 请求对象
     * @return CompletableFuture<ListClusterAllNodeLabelResponse>
     */
    public CompletableFuture<ListClusterAllNodeLabelResponse> listClusterAllNodeLabelAsync(
        ListClusterAllNodeLabelRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.listClusterAllNodeLabel);
    }

    /**
     * 获取节点标签集
     *
     * 获取节点标签集
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListClusterAllNodeLabelRequest 请求对象
     * @return AsyncInvoker<ListClusterAllNodeLabelRequest, ListClusterAllNodeLabelResponse>
     */
    public AsyncInvoker<ListClusterAllNodeLabelRequest, ListClusterAllNodeLabelResponse> listClusterAllNodeLabelAsyncInvoker(
        ListClusterAllNodeLabelRequest request) {
        return new AsyncInvoker<ListClusterAllNodeLabelRequest, ListClusterAllNodeLabelResponse>(request,
            EiHealthMeta.listClusterAllNodeLabel, hcClient);
    }

    /**
     * 获取节点标签集
     *
     * 获取节点标签集
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListNodeLabelRequest 请求对象
     * @return CompletableFuture<ListNodeLabelResponse>
     */
    public CompletableFuture<ListNodeLabelResponse> listNodeLabelAsync(ListNodeLabelRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.listNodeLabel);
    }

    /**
     * 获取节点标签集
     *
     * 获取节点标签集
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListNodeLabelRequest 请求对象
     * @return AsyncInvoker<ListNodeLabelRequest, ListNodeLabelResponse>
     */
    public AsyncInvoker<ListNodeLabelRequest, ListNodeLabelResponse> listNodeLabelAsyncInvoker(
        ListNodeLabelRequest request) {
        return new AsyncInvoker<ListNodeLabelRequest, ListNodeLabelResponse>(request, EiHealthMeta.listNodeLabel,
            hcClient);
    }

    /**
     * 获取预置标签列表
     *
     * 获取预置标签列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPresetLabelRequest 请求对象
     * @return CompletableFuture<ListPresetLabelResponse>
     */
    public CompletableFuture<ListPresetLabelResponse> listPresetLabelAsync(ListPresetLabelRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.listPresetLabel);
    }

    /**
     * 获取预置标签列表
     *
     * 获取预置标签列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPresetLabelRequest 请求对象
     * @return AsyncInvoker<ListPresetLabelRequest, ListPresetLabelResponse>
     */
    public AsyncInvoker<ListPresetLabelRequest, ListPresetLabelResponse> listPresetLabelAsyncInvoker(
        ListPresetLabelRequest request) {
        return new AsyncInvoker<ListPresetLabelRequest, ListPresetLabelResponse>(request, EiHealthMeta.listPresetLabel,
            hcClient);
    }

    /**
     * 创建notebook
     *
     * 创建notebook
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateNotebookRequest 请求对象
     * @return CompletableFuture<CreateNotebookResponse>
     */
    public CompletableFuture<CreateNotebookResponse> createNotebookAsync(CreateNotebookRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.createNotebook);
    }

    /**
     * 创建notebook
     *
     * 创建notebook
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateNotebookRequest 请求对象
     * @return AsyncInvoker<CreateNotebookRequest, CreateNotebookResponse>
     */
    public AsyncInvoker<CreateNotebookRequest, CreateNotebookResponse> createNotebookAsyncInvoker(
        CreateNotebookRequest request) {
        return new AsyncInvoker<CreateNotebookRequest, CreateNotebookResponse>(request, EiHealthMeta.createNotebook,
            hcClient);
    }

    /**
     * 删除notebook
     *
     * 删除notebook
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteNotebookRequest 请求对象
     * @return CompletableFuture<DeleteNotebookResponse>
     */
    public CompletableFuture<DeleteNotebookResponse> deleteNotebookAsync(DeleteNotebookRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.deleteNotebook);
    }

    /**
     * 删除notebook
     *
     * 删除notebook
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteNotebookRequest 请求对象
     * @return AsyncInvoker<DeleteNotebookRequest, DeleteNotebookResponse>
     */
    public AsyncInvoker<DeleteNotebookRequest, DeleteNotebookResponse> deleteNotebookAsyncInvoker(
        DeleteNotebookRequest request) {
        return new AsyncInvoker<DeleteNotebookRequest, DeleteNotebookResponse>(request, EiHealthMeta.deleteNotebook,
            hcClient);
    }

    /**
     * 获取notebook列表
     *
     * 获取notebook列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListNotebookRequest 请求对象
     * @return CompletableFuture<ListNotebookResponse>
     */
    public CompletableFuture<ListNotebookResponse> listNotebookAsync(ListNotebookRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.listNotebook);
    }

    /**
     * 获取notebook列表
     *
     * 获取notebook列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListNotebookRequest 请求对象
     * @return AsyncInvoker<ListNotebookRequest, ListNotebookResponse>
     */
    public AsyncInvoker<ListNotebookRequest, ListNotebookResponse> listNotebookAsyncInvoker(
        ListNotebookRequest request) {
        return new AsyncInvoker<ListNotebookRequest, ListNotebookResponse>(request, EiHealthMeta.listNotebook,
            hcClient);
    }

    /**
     * 获取notebook工作环境
     *
     * 获取notebook工作环境
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListNotebookToolRequest 请求对象
     * @return CompletableFuture<ListNotebookToolResponse>
     */
    public CompletableFuture<ListNotebookToolResponse> listNotebookToolAsync(ListNotebookToolRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.listNotebookTool);
    }

    /**
     * 获取notebook工作环境
     *
     * 获取notebook工作环境
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListNotebookToolRequest 请求对象
     * @return AsyncInvoker<ListNotebookToolRequest, ListNotebookToolResponse>
     */
    public AsyncInvoker<ListNotebookToolRequest, ListNotebookToolResponse> listNotebookToolAsyncInvoker(
        ListNotebookToolRequest request) {
        return new AsyncInvoker<ListNotebookToolRequest, ListNotebookToolResponse>(request,
            EiHealthMeta.listNotebookTool, hcClient);
    }

    /**
     * 获取notebook详情
     *
     * 获取notebook详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowNotebookRequest 请求对象
     * @return CompletableFuture<ShowNotebookResponse>
     */
    public CompletableFuture<ShowNotebookResponse> showNotebookAsync(ShowNotebookRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.showNotebook);
    }

    /**
     * 获取notebook详情
     *
     * 获取notebook详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowNotebookRequest 请求对象
     * @return AsyncInvoker<ShowNotebookRequest, ShowNotebookResponse>
     */
    public AsyncInvoker<ShowNotebookRequest, ShowNotebookResponse> showNotebookAsyncInvoker(
        ShowNotebookRequest request) {
        return new AsyncInvoker<ShowNotebookRequest, ShowNotebookResponse>(request, EiHealthMeta.showNotebook,
            hcClient);
    }

    /**
     * 获取notebook鉴权信息
     *
     * 获取notebook鉴权信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowNotebookTokenRequest 请求对象
     * @return CompletableFuture<ShowNotebookTokenResponse>
     */
    public CompletableFuture<ShowNotebookTokenResponse> showNotebookTokenAsync(ShowNotebookTokenRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.showNotebookToken);
    }

    /**
     * 获取notebook鉴权信息
     *
     * 获取notebook鉴权信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowNotebookTokenRequest 请求对象
     * @return AsyncInvoker<ShowNotebookTokenRequest, ShowNotebookTokenResponse>
     */
    public AsyncInvoker<ShowNotebookTokenRequest, ShowNotebookTokenResponse> showNotebookTokenAsyncInvoker(
        ShowNotebookTokenRequest request) {
        return new AsyncInvoker<ShowNotebookTokenRequest, ShowNotebookTokenResponse>(request,
            EiHealthMeta.showNotebookToken, hcClient);
    }

    /**
     * 启停notebook
     *
     * 启停notebook
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StopOrStartNotebookRequest 请求对象
     * @return CompletableFuture<StopOrStartNotebookResponse>
     */
    public CompletableFuture<StopOrStartNotebookResponse> stopOrStartNotebookAsync(StopOrStartNotebookRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.stopOrStartNotebook);
    }

    /**
     * 启停notebook
     *
     * 启停notebook
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StopOrStartNotebookRequest 请求对象
     * @return AsyncInvoker<StopOrStartNotebookRequest, StopOrStartNotebookResponse>
     */
    public AsyncInvoker<StopOrStartNotebookRequest, StopOrStartNotebookResponse> stopOrStartNotebookAsyncInvoker(
        StopOrStartNotebookRequest request) {
        return new AsyncInvoker<StopOrStartNotebookRequest, StopOrStartNotebookResponse>(request,
            EiHealthMeta.stopOrStartNotebook, hcClient);
    }

    /**
     * 更新notebook
     *
     * 更新notebook
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateNotebookRequest 请求对象
     * @return CompletableFuture<UpdateNotebookResponse>
     */
    public CompletableFuture<UpdateNotebookResponse> updateNotebookAsync(UpdateNotebookRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.updateNotebook);
    }

    /**
     * 更新notebook
     *
     * 更新notebook
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateNotebookRequest 请求对象
     * @return AsyncInvoker<UpdateNotebookRequest, UpdateNotebookResponse>
     */
    public AsyncInvoker<UpdateNotebookRequest, UpdateNotebookResponse> updateNotebookAsyncInvoker(
        UpdateNotebookRequest request) {
        return new AsyncInvoker<UpdateNotebookRequest, UpdateNotebookResponse>(request, EiHealthMeta.updateNotebook,
            hcClient);
    }

    /**
     * 获取用户OBS桶列表
     *
     * 获取用户OBS桶列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListObsBucketRequest 请求对象
     * @return CompletableFuture<ListObsBucketResponse>
     */
    public CompletableFuture<ListObsBucketResponse> listObsBucketAsync(ListObsBucketRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.listObsBucket);
    }

    /**
     * 获取用户OBS桶列表
     *
     * 获取用户OBS桶列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListObsBucketRequest 请求对象
     * @return AsyncInvoker<ListObsBucketRequest, ListObsBucketResponse>
     */
    public AsyncInvoker<ListObsBucketRequest, ListObsBucketResponse> listObsBucketAsyncInvoker(
        ListObsBucketRequest request) {
        return new AsyncInvoker<ListObsBucketRequest, ListObsBucketResponse>(request, EiHealthMeta.listObsBucket,
            hcClient);
    }

    /**
     * 获取用户OBS桶内对象
     *
     * 获取用户OBS桶内对象
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListObsBucketObjectRequest 请求对象
     * @return CompletableFuture<ListObsBucketObjectResponse>
     */
    public CompletableFuture<ListObsBucketObjectResponse> listObsBucketObjectAsync(ListObsBucketObjectRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.listObsBucketObject);
    }

    /**
     * 获取用户OBS桶内对象
     *
     * 获取用户OBS桶内对象
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListObsBucketObjectRequest 请求对象
     * @return AsyncInvoker<ListObsBucketObjectRequest, ListObsBucketObjectResponse>
     */
    public AsyncInvoker<ListObsBucketObjectRequest, ListObsBucketObjectResponse> listObsBucketObjectAsyncInvoker(
        ListObsBucketObjectRequest request) {
        return new AsyncInvoker<ListObsBucketObjectRequest, ListObsBucketObjectResponse>(request,
            EiHealthMeta.listObsBucketObject, hcClient);
    }

    /**
     * 获取医疗平台信息
     *
     * 获取医疗平台信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowOverviewRequest 请求对象
     * @return CompletableFuture<ShowOverviewResponse>
     */
    public CompletableFuture<ShowOverviewResponse> showOverviewAsync(ShowOverviewRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.showOverview);
    }

    /**
     * 获取医疗平台信息
     *
     * 获取医疗平台信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowOverviewRequest 请求对象
     * @return AsyncInvoker<ShowOverviewRequest, ShowOverviewResponse>
     */
    public AsyncInvoker<ShowOverviewRequest, ShowOverviewResponse> showOverviewAsyncInvoker(
        ShowOverviewRequest request) {
        return new AsyncInvoker<ShowOverviewRequest, ShowOverviewResponse>(request, EiHealthMeta.showOverview,
            hcClient);
    }

    /**
     * 购买性能加速资源
     *
     * 购买性能加速资源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreatePerformanceResourceRequest 请求对象
     * @return CompletableFuture<CreatePerformanceResourceResponse>
     */
    public CompletableFuture<CreatePerformanceResourceResponse> createPerformanceResourceAsync(
        CreatePerformanceResourceRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.createPerformanceResource);
    }

    /**
     * 购买性能加速资源
     *
     * 购买性能加速资源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreatePerformanceResourceRequest 请求对象
     * @return AsyncInvoker<CreatePerformanceResourceRequest, CreatePerformanceResourceResponse>
     */
    public AsyncInvoker<CreatePerformanceResourceRequest, CreatePerformanceResourceResponse> createPerformanceResourceAsyncInvoker(
        CreatePerformanceResourceRequest request) {
        return new AsyncInvoker<CreatePerformanceResourceRequest, CreatePerformanceResourceResponse>(request,
            EiHealthMeta.createPerformanceResource, hcClient);
    }

    /**
     * 删除性能加速资源
     *
     * 删除性能加速资源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeletePerformanceResourceRequest 请求对象
     * @return CompletableFuture<DeletePerformanceResourceResponse>
     */
    public CompletableFuture<DeletePerformanceResourceResponse> deletePerformanceResourceAsync(
        DeletePerformanceResourceRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.deletePerformanceResource);
    }

    /**
     * 删除性能加速资源
     *
     * 删除性能加速资源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeletePerformanceResourceRequest 请求对象
     * @return AsyncInvoker<DeletePerformanceResourceRequest, DeletePerformanceResourceResponse>
     */
    public AsyncInvoker<DeletePerformanceResourceRequest, DeletePerformanceResourceResponse> deletePerformanceResourceAsyncInvoker(
        DeletePerformanceResourceRequest request) {
        return new AsyncInvoker<DeletePerformanceResourceRequest, DeletePerformanceResourceResponse>(request,
            EiHealthMeta.deletePerformanceResource, hcClient);
    }

    /**
     * 查询性能加速资源
     *
     * 查询性能加速资源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPerformanceResourcesRequest 请求对象
     * @return CompletableFuture<ListPerformanceResourcesResponse>
     */
    public CompletableFuture<ListPerformanceResourcesResponse> listPerformanceResourcesAsync(
        ListPerformanceResourcesRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.listPerformanceResources);
    }

    /**
     * 查询性能加速资源
     *
     * 查询性能加速资源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPerformanceResourcesRequest 请求对象
     * @return AsyncInvoker<ListPerformanceResourcesRequest, ListPerformanceResourcesResponse>
     */
    public AsyncInvoker<ListPerformanceResourcesRequest, ListPerformanceResourcesResponse> listPerformanceResourcesAsyncInvoker(
        ListPerformanceResourcesRequest request) {
        return new AsyncInvoker<ListPerformanceResourcesRequest, ListPerformanceResourcesResponse>(request,
            EiHealthMeta.listPerformanceResources, hcClient);
    }

    /**
     * 更新性能加速资源配置
     *
     * 更新性能加速资源配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdatePerformanceResourceRequest 请求对象
     * @return CompletableFuture<UpdatePerformanceResourceResponse>
     */
    public CompletableFuture<UpdatePerformanceResourceResponse> updatePerformanceResourceAsync(
        UpdatePerformanceResourceRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.updatePerformanceResource);
    }

    /**
     * 更新性能加速资源配置
     *
     * 更新性能加速资源配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdatePerformanceResourceRequest 请求对象
     * @return AsyncInvoker<UpdatePerformanceResourceRequest, UpdatePerformanceResourceResponse>
     */
    public AsyncInvoker<UpdatePerformanceResourceRequest, UpdatePerformanceResourceResponse> updatePerformanceResourceAsyncInvoker(
        UpdatePerformanceResourceRequest request) {
        return new AsyncInvoker<UpdatePerformanceResourceRequest, UpdatePerformanceResourceResponse>(request,
            EiHealthMeta.updatePerformanceResource, hcClient);
    }

    /**
     * 批量删除项目成员
     *
     * 批量删除项目成员
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchDeleteMemberRequest 请求对象
     * @return CompletableFuture<BatchDeleteMemberResponse>
     */
    public CompletableFuture<BatchDeleteMemberResponse> batchDeleteMemberAsync(BatchDeleteMemberRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.batchDeleteMember);
    }

    /**
     * 批量删除项目成员
     *
     * 批量删除项目成员
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchDeleteMemberRequest 请求对象
     * @return AsyncInvoker<BatchDeleteMemberRequest, BatchDeleteMemberResponse>
     */
    public AsyncInvoker<BatchDeleteMemberRequest, BatchDeleteMemberResponse> batchDeleteMemberAsyncInvoker(
        BatchDeleteMemberRequest request) {
        return new AsyncInvoker<BatchDeleteMemberRequest, BatchDeleteMemberResponse>(request,
            EiHealthMeta.batchDeleteMember, hcClient);
    }

    /**
     * 创建项目
     *
     * 创建项目
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateProjectRequest 请求对象
     * @return CompletableFuture<CreateProjectResponse>
     */
    public CompletableFuture<CreateProjectResponse> createProjectAsync(CreateProjectRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.createProject);
    }

    /**
     * 创建项目
     *
     * 创建项目
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateProjectRequest 请求对象
     * @return AsyncInvoker<CreateProjectRequest, CreateProjectResponse>
     */
    public AsyncInvoker<CreateProjectRequest, CreateProjectResponse> createProjectAsyncInvoker(
        CreateProjectRequest request) {
        return new AsyncInvoker<CreateProjectRequest, CreateProjectResponse>(request, EiHealthMeta.createProject,
            hcClient);
    }

    /**
     * 移除项目成员
     *
     * 移除项目成员
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteMemberRequest 请求对象
     * @return CompletableFuture<DeleteMemberResponse>
     */
    public CompletableFuture<DeleteMemberResponse> deleteMemberAsync(DeleteMemberRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.deleteMember);
    }

    /**
     * 移除项目成员
     *
     * 移除项目成员
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteMemberRequest 请求对象
     * @return AsyncInvoker<DeleteMemberRequest, DeleteMemberResponse>
     */
    public AsyncInvoker<DeleteMemberRequest, DeleteMemberResponse> deleteMemberAsyncInvoker(
        DeleteMemberRequest request) {
        return new AsyncInvoker<DeleteMemberRequest, DeleteMemberResponse>(request, EiHealthMeta.deleteMember,
            hcClient);
    }

    /**
     * 删除项目
     *
     * 删除项目
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteProjectRequest 请求对象
     * @return CompletableFuture<DeleteProjectResponse>
     */
    public CompletableFuture<DeleteProjectResponse> deleteProjectAsync(DeleteProjectRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.deleteProject);
    }

    /**
     * 删除项目
     *
     * 删除项目
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteProjectRequest 请求对象
     * @return AsyncInvoker<DeleteProjectRequest, DeleteProjectResponse>
     */
    public AsyncInvoker<DeleteProjectRequest, DeleteProjectResponse> deleteProjectAsyncInvoker(
        DeleteProjectRequest request) {
        return new AsyncInvoker<DeleteProjectRequest, DeleteProjectResponse>(request, EiHealthMeta.deleteProject,
            hcClient);
    }

    /**
     * 获取项目列表
     *
     * 获取项目列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListProjectRequest 请求对象
     * @return CompletableFuture<ListProjectResponse>
     */
    public CompletableFuture<ListProjectResponse> listProjectAsync(ListProjectRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.listProject);
    }

    /**
     * 获取项目列表
     *
     * 获取项目列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListProjectRequest 请求对象
     * @return AsyncInvoker<ListProjectRequest, ListProjectResponse>
     */
    public AsyncInvoker<ListProjectRequest, ListProjectResponse> listProjectAsyncInvoker(ListProjectRequest request) {
        return new AsyncInvoker<ListProjectRequest, ListProjectResponse>(request, EiHealthMeta.listProject, hcClient);
    }

    /**
     * 获取最近的作业列表
     *
     * 获取最近的作业列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRecentJobRequest 请求对象
     * @return CompletableFuture<ListRecentJobResponse>
     */
    public CompletableFuture<ListRecentJobResponse> listRecentJobAsync(ListRecentJobRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.listRecentJob);
    }

    /**
     * 获取最近的作业列表
     *
     * 获取最近的作业列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRecentJobRequest 请求对象
     * @return AsyncInvoker<ListRecentJobRequest, ListRecentJobResponse>
     */
    public AsyncInvoker<ListRecentJobRequest, ListRecentJobResponse> listRecentJobAsyncInvoker(
        ListRecentJobRequest request) {
        return new AsyncInvoker<ListRecentJobRequest, ListRecentJobResponse>(request, EiHealthMeta.listRecentJob,
            hcClient);
    }

    /**
     * 获取项目详情
     *
     * 获取项目详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowProjectRequest 请求对象
     * @return CompletableFuture<ShowProjectResponse>
     */
    public CompletableFuture<ShowProjectResponse> showProjectAsync(ShowProjectRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.showProject);
    }

    /**
     * 获取项目详情
     *
     * 获取项目详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowProjectRequest 请求对象
     * @return AsyncInvoker<ShowProjectRequest, ShowProjectResponse>
     */
    public AsyncInvoker<ShowProjectRequest, ShowProjectResponse> showProjectAsyncInvoker(ShowProjectRequest request) {
        return new AsyncInvoker<ShowProjectRequest, ShowProjectResponse>(request, EiHealthMeta.showProject, hcClient);
    }

    /**
     * 转移项目
     *
     * 转移项目
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param TransferProjectRequest 请求对象
     * @return CompletableFuture<TransferProjectResponse>
     */
    public CompletableFuture<TransferProjectResponse> transferProjectAsync(TransferProjectRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.transferProject);
    }

    /**
     * 转移项目
     *
     * 转移项目
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param TransferProjectRequest 请求对象
     * @return AsyncInvoker<TransferProjectRequest, TransferProjectResponse>
     */
    public AsyncInvoker<TransferProjectRequest, TransferProjectResponse> transferProjectAsyncInvoker(
        TransferProjectRequest request) {
        return new AsyncInvoker<TransferProjectRequest, TransferProjectResponse>(request, EiHealthMeta.transferProject,
            hcClient);
    }

    /**
     * 更新或者添加项目成员角色
     *
     * 更新或者添加项目成员角色
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateMemberRequest 请求对象
     * @return CompletableFuture<UpdateMemberResponse>
     */
    public CompletableFuture<UpdateMemberResponse> updateMemberAsync(UpdateMemberRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.updateMember);
    }

    /**
     * 更新或者添加项目成员角色
     *
     * 更新或者添加项目成员角色
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateMemberRequest 请求对象
     * @return AsyncInvoker<UpdateMemberRequest, UpdateMemberResponse>
     */
    public AsyncInvoker<UpdateMemberRequest, UpdateMemberResponse> updateMemberAsyncInvoker(
        UpdateMemberRequest request) {
        return new AsyncInvoker<UpdateMemberRequest, UpdateMemberResponse>(request, EiHealthMeta.updateMember,
            hcClient);
    }

    /**
     * 更新项目
     *
     * 更新项目
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateProjectRequest 请求对象
     * @return CompletableFuture<UpdateProjectResponse>
     */
    public CompletableFuture<UpdateProjectResponse> updateProjectAsync(UpdateProjectRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.updateProject);
    }

    /**
     * 更新项目
     *
     * 更新项目
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateProjectRequest 请求对象
     * @return AsyncInvoker<UpdateProjectRequest, UpdateProjectResponse>
     */
    public AsyncInvoker<UpdateProjectRequest, UpdateProjectResponse> updateProjectAsyncInvoker(
        UpdateProjectRequest request) {
        return new AsyncInvoker<UpdateProjectRequest, UpdateProjectResponse>(request, EiHealthMeta.updateProject,
            hcClient);
    }

    /**
     * 下载近一万条审计日志
     *
     * 下载近一万条审计日志
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DownloadDataTraceRequest 请求对象
     * @return CompletableFuture<DownloadDataTraceResponse>
     */
    public CompletableFuture<DownloadDataTraceResponse> downloadDataTraceAsync(DownloadDataTraceRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.downloadDataTrace);
    }

    /**
     * 下载近一万条审计日志
     *
     * 下载近一万条审计日志
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DownloadDataTraceRequest 请求对象
     * @return AsyncInvoker<DownloadDataTraceRequest, DownloadDataTraceResponse>
     */
    public AsyncInvoker<DownloadDataTraceRequest, DownloadDataTraceResponse> downloadDataTraceAsyncInvoker(
        DownloadDataTraceRequest request) {
        return new AsyncInvoker<DownloadDataTraceRequest, DownloadDataTraceResponse>(request,
            EiHealthMeta.downloadDataTrace, hcClient);
    }

    /**
     * 获取项目审计日志
     *
     * 获取项目审计日志
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowProjectTraceRequest 请求对象
     * @return CompletableFuture<ShowProjectTraceResponse>
     */
    public CompletableFuture<ShowProjectTraceResponse> showProjectTraceAsync(ShowProjectTraceRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.showProjectTrace);
    }

    /**
     * 获取项目审计日志
     *
     * 获取项目审计日志
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowProjectTraceRequest 请求对象
     * @return AsyncInvoker<ShowProjectTraceRequest, ShowProjectTraceResponse>
     */
    public AsyncInvoker<ShowProjectTraceRequest, ShowProjectTraceResponse> showProjectTraceAsyncInvoker(
        ShowProjectTraceRequest request) {
        return new AsyncInvoker<ShowProjectTraceRequest, ShowProjectTraceResponse>(request,
            EiHealthMeta.showProjectTrace, hcClient);
    }

    /**
     * 获取指定审计日志
     *
     * 获取指定审计日志
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowProjectTraceDataRequest 请求对象
     * @return CompletableFuture<ShowProjectTraceDataResponse>
     */
    public CompletableFuture<ShowProjectTraceDataResponse> showProjectTraceDataAsync(
        ShowProjectTraceDataRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.showProjectTraceData);
    }

    /**
     * 获取指定审计日志
     *
     * 获取指定审计日志
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowProjectTraceDataRequest 请求对象
     * @return AsyncInvoker<ShowProjectTraceDataRequest, ShowProjectTraceDataResponse>
     */
    public AsyncInvoker<ShowProjectTraceDataRequest, ShowProjectTraceDataResponse> showProjectTraceDataAsyncInvoker(
        ShowProjectTraceDataRequest request) {
        return new AsyncInvoker<ShowProjectTraceDataRequest, ShowProjectTraceDataResponse>(request,
            EiHealthMeta.showProjectTraceData, hcClient);
    }

    /**
     * 获取项目审计日志追踪器
     *
     * 获取项目审计日志追踪器
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowProjectTrackerRequest 请求对象
     * @return CompletableFuture<ShowProjectTrackerResponse>
     */
    public CompletableFuture<ShowProjectTrackerResponse> showProjectTrackerAsync(ShowProjectTrackerRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.showProjectTracker);
    }

    /**
     * 获取项目审计日志追踪器
     *
     * 获取项目审计日志追踪器
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowProjectTrackerRequest 请求对象
     * @return AsyncInvoker<ShowProjectTrackerRequest, ShowProjectTrackerResponse>
     */
    public AsyncInvoker<ShowProjectTrackerRequest, ShowProjectTrackerResponse> showProjectTrackerAsyncInvoker(
        ShowProjectTrackerRequest request) {
        return new AsyncInvoker<ShowProjectTrackerRequest, ShowProjectTrackerResponse>(request,
            EiHealthMeta.showProjectTracker, hcClient);
    }

    /**
     * 更新项目审计日志追踪器配置
     *
     * 更新项目审计日志追踪器配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateProjectTrackerRequest 请求对象
     * @return CompletableFuture<UpdateProjectTrackerResponse>
     */
    public CompletableFuture<UpdateProjectTrackerResponse> updateProjectTrackerAsync(
        UpdateProjectTrackerRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.updateProjectTracker);
    }

    /**
     * 更新项目审计日志追踪器配置
     *
     * 更新项目审计日志追踪器配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateProjectTrackerRequest 请求对象
     * @return AsyncInvoker<UpdateProjectTrackerRequest, UpdateProjectTrackerResponse>
     */
    public AsyncInvoker<UpdateProjectTrackerRequest, UpdateProjectTrackerResponse> updateProjectTrackerAsyncInvoker(
        UpdateProjectTrackerRequest request) {
        return new AsyncInvoker<UpdateProjectTrackerRequest, UpdateProjectTrackerResponse>(request,
            EiHealthMeta.updateProjectTracker, hcClient);
    }

    /**
     * 获取资源监控数据
     *
     * 获取资源监控数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowResourceMetricDataRequest 请求对象
     * @return CompletableFuture<ShowResourceMetricDataResponse>
     */
    public CompletableFuture<ShowResourceMetricDataResponse> showResourceMetricDataAsync(
        ShowResourceMetricDataRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.showResourceMetricData);
    }

    /**
     * 获取资源监控数据
     *
     * 获取资源监控数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowResourceMetricDataRequest 请求对象
     * @return AsyncInvoker<ShowResourceMetricDataRequest, ShowResourceMetricDataResponse>
     */
    public AsyncInvoker<ShowResourceMetricDataRequest, ShowResourceMetricDataResponse> showResourceMetricDataAsyncInvoker(
        ShowResourceMetricDataRequest request) {
        return new AsyncInvoker<ShowResourceMetricDataRequest, ShowResourceMetricDataResponse>(request,
            EiHealthMeta.showResourceMetricData, hcClient);
    }

    /**
     * 取消收藏
     *
     * 取消收藏
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteStarRequest 请求对象
     * @return CompletableFuture<DeleteStarResponse>
     */
    public CompletableFuture<DeleteStarResponse> deleteStarAsync(DeleteStarRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.deleteStar);
    }

    /**
     * 取消收藏
     *
     * 取消收藏
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteStarRequest 请求对象
     * @return AsyncInvoker<DeleteStarRequest, DeleteStarResponse>
     */
    public AsyncInvoker<DeleteStarRequest, DeleteStarResponse> deleteStarAsyncInvoker(DeleteStarRequest request) {
        return new AsyncInvoker<DeleteStarRequest, DeleteStarResponse>(request, EiHealthMeta.deleteStar, hcClient);
    }

    /**
     * 获取收藏资产列表
     *
     * 获取收藏资产列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListStarRequest 请求对象
     * @return CompletableFuture<ListStarResponse>
     */
    public CompletableFuture<ListStarResponse> listStarAsync(ListStarRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.listStar);
    }

    /**
     * 获取收藏资产列表
     *
     * 获取收藏资产列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListStarRequest 请求对象
     * @return AsyncInvoker<ListStarRequest, ListStarResponse>
     */
    public AsyncInvoker<ListStarRequest, ListStarResponse> listStarAsyncInvoker(ListStarRequest request) {
        return new AsyncInvoker<ListStarRequest, ListStarResponse>(request, EiHealthMeta.listStar, hcClient);
    }

    /**
     * 收藏资产
     *
     * 收藏资产
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateStarRequest 请求对象
     * @return CompletableFuture<UpdateStarResponse>
     */
    public CompletableFuture<UpdateStarResponse> updateStarAsync(UpdateStarRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.updateStar);
    }

    /**
     * 收藏资产
     *
     * 收藏资产
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateStarRequest 请求对象
     * @return AsyncInvoker<UpdateStarRequest, UpdateStarResponse>
     */
    public AsyncInvoker<UpdateStarRequest, UpdateStarResponse> updateStarAsyncInvoker(UpdateStarRequest request) {
        return new AsyncInvoker<UpdateStarRequest, UpdateStarResponse>(request, EiHealthMeta.updateStar, hcClient);
    }

    /**
     * 获取性能加速资源上统计信息
     *
     * 获取性能加速资源上统计信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPerformanceResourceStatRequest 请求对象
     * @return CompletableFuture<ListPerformanceResourceStatResponse>
     */
    public CompletableFuture<ListPerformanceResourceStatResponse> listPerformanceResourceStatAsync(
        ListPerformanceResourceStatRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.listPerformanceResourceStat);
    }

    /**
     * 获取性能加速资源上统计信息
     *
     * 获取性能加速资源上统计信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPerformanceResourceStatRequest 请求对象
     * @return AsyncInvoker<ListPerformanceResourceStatRequest, ListPerformanceResourceStatResponse>
     */
    public AsyncInvoker<ListPerformanceResourceStatRequest, ListPerformanceResourceStatResponse> listPerformanceResourceStatAsyncInvoker(
        ListPerformanceResourceStatRequest request) {
        return new AsyncInvoker<ListPerformanceResourceStatRequest, ListPerformanceResourceStatResponse>(request,
            EiHealthMeta.listPerformanceResourceStat, hcClient);
    }

    /**
     * 统计应用、流程、作业数目
     *
     * 统计应用、流程、作业数目
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListWorkflowStatisticRequest 请求对象
     * @return CompletableFuture<ListWorkflowStatisticResponse>
     */
    public CompletableFuture<ListWorkflowStatisticResponse> listWorkflowStatisticAsync(
        ListWorkflowStatisticRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.listWorkflowStatistic);
    }

    /**
     * 统计应用、流程、作业数目
     *
     * 统计应用、流程、作业数目
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListWorkflowStatisticRequest 请求对象
     * @return AsyncInvoker<ListWorkflowStatisticRequest, ListWorkflowStatisticResponse>
     */
    public AsyncInvoker<ListWorkflowStatisticRequest, ListWorkflowStatisticResponse> listWorkflowStatisticAsyncInvoker(
        ListWorkflowStatisticRequest request) {
        return new AsyncInvoker<ListWorkflowStatisticRequest, ListWorkflowStatisticResponse>(request,
            EiHealthMeta.listWorkflowStatistic, hcClient);
    }

    /**
     * 查询存储资源
     *
     * 查询存储资源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListStorageResourcesRequest 请求对象
     * @return CompletableFuture<ListStorageResourcesResponse>
     */
    public CompletableFuture<ListStorageResourcesResponse> listStorageResourcesAsync(
        ListStorageResourcesRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.listStorageResources);
    }

    /**
     * 查询存储资源
     *
     * 查询存储资源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListStorageResourcesRequest 请求对象
     * @return AsyncInvoker<ListStorageResourcesRequest, ListStorageResourcesResponse>
     */
    public AsyncInvoker<ListStorageResourcesRequest, ListStorageResourcesResponse> listStorageResourcesAsyncInvoker(
        ListStorageResourcesRequest request) {
        return new AsyncInvoker<ListStorageResourcesRequest, ListStorageResourcesResponse>(request,
            EiHealthMeta.listStorageResources, hcClient);
    }

    /**
     * 创建study
     *
     * 创建study
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateStudyRequest 请求对象
     * @return CompletableFuture<CreateStudyResponse>
     */
    public CompletableFuture<CreateStudyResponse> createStudyAsync(CreateStudyRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.createStudy);
    }

    /**
     * 创建study
     *
     * 创建study
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateStudyRequest 请求对象
     * @return AsyncInvoker<CreateStudyRequest, CreateStudyResponse>
     */
    public AsyncInvoker<CreateStudyRequest, CreateStudyResponse> createStudyAsyncInvoker(CreateStudyRequest request) {
        return new AsyncInvoker<CreateStudyRequest, CreateStudyResponse>(request, EiHealthMeta.createStudy, hcClient);
    }

    /**
     * 创建study作业
     *
     * 创建study作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateStudyJobRequest 请求对象
     * @return CompletableFuture<CreateStudyJobResponse>
     */
    public CompletableFuture<CreateStudyJobResponse> createStudyJobAsync(CreateStudyJobRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.createStudyJob);
    }

    /**
     * 创建study作业
     *
     * 创建study作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateStudyJobRequest 请求对象
     * @return AsyncInvoker<CreateStudyJobRequest, CreateStudyJobResponse>
     */
    public AsyncInvoker<CreateStudyJobRequest, CreateStudyJobResponse> createStudyJobAsyncInvoker(
        CreateStudyJobRequest request) {
        return new AsyncInvoker<CreateStudyJobRequest, CreateStudyJobResponse>(request, EiHealthMeta.createStudyJob,
            hcClient);
    }

    /**
     * 删除study
     *
     * 删除study
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteStudyRequest 请求对象
     * @return CompletableFuture<DeleteStudyResponse>
     */
    public CompletableFuture<DeleteStudyResponse> deleteStudyAsync(DeleteStudyRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.deleteStudy);
    }

    /**
     * 删除study
     *
     * 删除study
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteStudyRequest 请求对象
     * @return AsyncInvoker<DeleteStudyRequest, DeleteStudyResponse>
     */
    public AsyncInvoker<DeleteStudyRequest, DeleteStudyResponse> deleteStudyAsyncInvoker(DeleteStudyRequest request) {
        return new AsyncInvoker<DeleteStudyRequest, DeleteStudyResponse>(request, EiHealthMeta.deleteStudy, hcClient);
    }

    /**
     * 列举study
     *
     * 列举study
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListStudyRequest 请求对象
     * @return CompletableFuture<ListStudyResponse>
     */
    public CompletableFuture<ListStudyResponse> listStudyAsync(ListStudyRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.listStudy);
    }

    /**
     * 列举study
     *
     * 列举study
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListStudyRequest 请求对象
     * @return AsyncInvoker<ListStudyRequest, ListStudyResponse>
     */
    public AsyncInvoker<ListStudyRequest, ListStudyResponse> listStudyAsyncInvoker(ListStudyRequest request) {
        return new AsyncInvoker<ListStudyRequest, ListStudyResponse>(request, EiHealthMeta.listStudy, hcClient);
    }

    /**
     * 列举study所有作业
     *
     * 列举study所有作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListStudyJobRequest 请求对象
     * @return CompletableFuture<ListStudyJobResponse>
     */
    public CompletableFuture<ListStudyJobResponse> listStudyJobAsync(ListStudyJobRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.listStudyJob);
    }

    /**
     * 列举study所有作业
     *
     * 列举study所有作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListStudyJobRequest 请求对象
     * @return AsyncInvoker<ListStudyJobRequest, ListStudyJobResponse>
     */
    public AsyncInvoker<ListStudyJobRequest, ListStudyJobResponse> listStudyJobAsyncInvoker(
        ListStudyJobRequest request) {
        return new AsyncInvoker<ListStudyJobRequest, ListStudyJobResponse>(request, EiHealthMeta.listStudyJob,
            hcClient);
    }

    /**
     * 获取生成study作业3D结构的内容
     *
     * 获取生成study作业3D结构的内容
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param Show3dStructureContentRequest 请求对象
     * @return CompletableFuture<Show3dStructureContentResponse>
     */
    public CompletableFuture<Show3dStructureContentResponse> show3dStructureContentAsync(
        Show3dStructureContentRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.show3dStructureContent);
    }

    /**
     * 获取生成study作业3D结构的内容
     *
     * 获取生成study作业3D结构的内容
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param Show3dStructureContentRequest 请求对象
     * @return AsyncInvoker<Show3dStructureContentRequest, Show3dStructureContentResponse>
     */
    public AsyncInvoker<Show3dStructureContentRequest, Show3dStructureContentResponse> show3dStructureContentAsyncInvoker(
        Show3dStructureContentRequest request) {
        return new AsyncInvoker<Show3dStructureContentRequest, Show3dStructureContentResponse>(request,
            EiHealthMeta.show3dStructureContent, hcClient);
    }

    /**
     * 获取study作业的最值信息
     *
     * 获取study作业的最值信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowExtremumInfoRequest 请求对象
     * @return CompletableFuture<ShowExtremumInfoResponse>
     */
    public CompletableFuture<ShowExtremumInfoResponse> showExtremumInfoAsync(ShowExtremumInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.showExtremumInfo);
    }

    /**
     * 获取study作业的最值信息
     *
     * 获取study作业的最值信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowExtremumInfoRequest 请求对象
     * @return AsyncInvoker<ShowExtremumInfoRequest, ShowExtremumInfoResponse>
     */
    public AsyncInvoker<ShowExtremumInfoRequest, ShowExtremumInfoResponse> showExtremumInfoAsyncInvoker(
        ShowExtremumInfoRequest request) {
        return new AsyncInvoker<ShowExtremumInfoRequest, ShowExtremumInfoResponse>(request,
            EiHealthMeta.showExtremumInfo, hcClient);
    }

    /**
     * 获取跨域归档配置
     *
     * 获取跨域归档配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListArchiveConfigsRequest 请求对象
     * @return CompletableFuture<ListArchiveConfigsResponse>
     */
    public CompletableFuture<ListArchiveConfigsResponse> listArchiveConfigsAsync(ListArchiveConfigsRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.listArchiveConfigs);
    }

    /**
     * 获取跨域归档配置
     *
     * 获取跨域归档配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListArchiveConfigsRequest 请求对象
     * @return AsyncInvoker<ListArchiveConfigsRequest, ListArchiveConfigsResponse>
     */
    public AsyncInvoker<ListArchiveConfigsRequest, ListArchiveConfigsResponse> listArchiveConfigsAsyncInvoker(
        ListArchiveConfigsRequest request) {
        return new AsyncInvoker<ListArchiveConfigsRequest, ListArchiveConfigsResponse>(request,
            EiHealthMeta.listArchiveConfigs, hcClient);
    }

    /**
     * 查询系统配置列表
     *
     * 获取系统配置列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowEnvRequest 请求对象
     * @return CompletableFuture<ShowEnvResponse>
     */
    public CompletableFuture<ShowEnvResponse> showEnvAsync(ShowEnvRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.showEnv);
    }

    /**
     * 查询系统配置列表
     *
     * 获取系统配置列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowEnvRequest 请求对象
     * @return AsyncInvoker<ShowEnvRequest, ShowEnvResponse>
     */
    public AsyncInvoker<ShowEnvRequest, ShowEnvResponse> showEnvAsyncInvoker(ShowEnvRequest request) {
        return new AsyncInvoker<ShowEnvRequest, ShowEnvResponse>(request, EiHealthMeta.showEnv, hcClient);
    }

    /**
     * 获取供应商配置
     *
     * 获取供应商配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowVendorRequest 请求对象
     * @return CompletableFuture<ShowVendorResponse>
     */
    public CompletableFuture<ShowVendorResponse> showVendorAsync(ShowVendorRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.showVendor);
    }

    /**
     * 获取供应商配置
     *
     * 获取供应商配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowVendorRequest 请求对象
     * @return AsyncInvoker<ShowVendorRequest, ShowVendorResponse>
     */
    public AsyncInvoker<ShowVendorRequest, ShowVendorResponse> showVendorAsyncInvoker(ShowVendorRequest request) {
        return new AsyncInvoker<ShowVendorRequest, ShowVendorResponse>(request, EiHealthMeta.showVendor, hcClient);
    }

    /**
     * 修改跨域归档设置
     *
     * 修改跨域归档设置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateArchiveConfigRequest 请求对象
     * @return CompletableFuture<UpdateArchiveConfigResponse>
     */
    public CompletableFuture<UpdateArchiveConfigResponse> updateArchiveConfigAsync(UpdateArchiveConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.updateArchiveConfig);
    }

    /**
     * 修改跨域归档设置
     *
     * 修改跨域归档设置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateArchiveConfigRequest 请求对象
     * @return AsyncInvoker<UpdateArchiveConfigRequest, UpdateArchiveConfigResponse>
     */
    public AsyncInvoker<UpdateArchiveConfigRequest, UpdateArchiveConfigResponse> updateArchiveConfigAsyncInvoker(
        UpdateArchiveConfigRequest request) {
        return new AsyncInvoker<UpdateArchiveConfigRequest, UpdateArchiveConfigResponse>(request,
            EiHealthMeta.updateArchiveConfig, hcClient);
    }

    /**
     * 设置供应商配置
     *
     * 设置供应商配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateVendorRequest 请求对象
     * @return CompletableFuture<UpdateVendorResponse>
     */
    public CompletableFuture<UpdateVendorResponse> updateVendorAsync(UpdateVendorRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.updateVendor);
    }

    /**
     * 设置供应商配置
     *
     * 设置供应商配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateVendorRequest 请求对象
     * @return AsyncInvoker<UpdateVendorRequest, UpdateVendorResponse>
     */
    public AsyncInvoker<UpdateVendorRequest, UpdateVendorResponse> updateVendorAsyncInvoker(
        UpdateVendorRequest request) {
        return new AsyncInvoker<UpdateVendorRequest, UpdateVendorResponse>(request, EiHealthMeta.updateVendor,
            hcClient);
    }

    /**
     * 获取当前系统配额及资源使用情况
     *
     * 获取当前系统配额及资源使用情况
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListQuotaRequest 请求对象
     * @return CompletableFuture<ListQuotaResponse>
     */
    public CompletableFuture<ListQuotaResponse> listQuotaAsync(ListQuotaRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.listQuota);
    }

    /**
     * 获取当前系统配额及资源使用情况
     *
     * 获取当前系统配额及资源使用情况
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListQuotaRequest 请求对象
     * @return AsyncInvoker<ListQuotaRequest, ListQuotaResponse>
     */
    public AsyncInvoker<ListQuotaRequest, ListQuotaResponse> listQuotaAsyncInvoker(ListQuotaRequest request) {
        return new AsyncInvoker<ListQuotaRequest, ListQuotaResponse>(request, EiHealthMeta.listQuota, hcClient);
    }

    /**
     * 创建模板
     *
     * 创建模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateTemplateRequest 请求对象
     * @return CompletableFuture<CreateTemplateResponse>
     */
    public CompletableFuture<CreateTemplateResponse> createTemplateAsync(CreateTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.createTemplate);
    }

    /**
     * 创建模板
     *
     * 创建模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateTemplateRequest 请求对象
     * @return AsyncInvoker<CreateTemplateRequest, CreateTemplateResponse>
     */
    public AsyncInvoker<CreateTemplateRequest, CreateTemplateResponse> createTemplateAsyncInvoker(
        CreateTemplateRequest request) {
        return new AsyncInvoker<CreateTemplateRequest, CreateTemplateResponse>(request, EiHealthMeta.createTemplate,
            hcClient);
    }

    /**
     * 删除模板
     *
     * 删除模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteTemplateRequest 请求对象
     * @return CompletableFuture<DeleteTemplateResponse>
     */
    public CompletableFuture<DeleteTemplateResponse> deleteTemplateAsync(DeleteTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.deleteTemplate);
    }

    /**
     * 删除模板
     *
     * 删除模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteTemplateRequest 请求对象
     * @return AsyncInvoker<DeleteTemplateRequest, DeleteTemplateResponse>
     */
    public AsyncInvoker<DeleteTemplateRequest, DeleteTemplateResponse> deleteTemplateAsyncInvoker(
        DeleteTemplateRequest request) {
        return new AsyncInvoker<DeleteTemplateRequest, DeleteTemplateResponse>(request, EiHealthMeta.deleteTemplate,
            hcClient);
    }

    /**
     * 从其他项目导入模板
     *
     * 从其他项目导入模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ImportTemplateRequest 请求对象
     * @return CompletableFuture<ImportTemplateResponse>
     */
    public CompletableFuture<ImportTemplateResponse> importTemplateAsync(ImportTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.importTemplate);
    }

    /**
     * 从其他项目导入模板
     *
     * 从其他项目导入模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ImportTemplateRequest 请求对象
     * @return AsyncInvoker<ImportTemplateRequest, ImportTemplateResponse>
     */
    public AsyncInvoker<ImportTemplateRequest, ImportTemplateResponse> importTemplateAsyncInvoker(
        ImportTemplateRequest request) {
        return new AsyncInvoker<ImportTemplateRequest, ImportTemplateResponse>(request, EiHealthMeta.importTemplate,
            hcClient);
    }

    /**
     * 查询模板列表
     *
     * 查询模板列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTemplateRequest 请求对象
     * @return CompletableFuture<ListTemplateResponse>
     */
    public CompletableFuture<ListTemplateResponse> listTemplateAsync(ListTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.listTemplate);
    }

    /**
     * 查询模板列表
     *
     * 查询模板列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTemplateRequest 请求对象
     * @return AsyncInvoker<ListTemplateRequest, ListTemplateResponse>
     */
    public AsyncInvoker<ListTemplateRequest, ListTemplateResponse> listTemplateAsyncInvoker(
        ListTemplateRequest request) {
        return new AsyncInvoker<ListTemplateRequest, ListTemplateResponse>(request, EiHealthMeta.listTemplate,
            hcClient);
    }

    /**
     * 查询模板详情
     *
     * 查询模板详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowTemplateRequest 请求对象
     * @return CompletableFuture<ShowTemplateResponse>
     */
    public CompletableFuture<ShowTemplateResponse> showTemplateAsync(ShowTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.showTemplate);
    }

    /**
     * 查询模板详情
     *
     * 查询模板详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowTemplateRequest 请求对象
     * @return AsyncInvoker<ShowTemplateRequest, ShowTemplateResponse>
     */
    public AsyncInvoker<ShowTemplateRequest, ShowTemplateResponse> showTemplateAsyncInvoker(
        ShowTemplateRequest request) {
        return new AsyncInvoker<ShowTemplateRequest, ShowTemplateResponse>(request, EiHealthMeta.showTemplate,
            hcClient);
    }

    /**
     * 上传模板
     *
     * 上传模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UploadTemplateRequest 请求对象
     * @return CompletableFuture<UploadTemplateResponse>
     */
    public CompletableFuture<UploadTemplateResponse> uploadTemplateAsync(UploadTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.uploadTemplate);
    }

    /**
     * 上传模板
     *
     * 上传模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UploadTemplateRequest 请求对象
     * @return AsyncInvoker<UploadTemplateRequest, UploadTemplateResponse>
     */
    public AsyncInvoker<UploadTemplateRequest, UploadTemplateResponse> uploadTemplateAsyncInvoker(
        UploadTemplateRequest request) {
        return new AsyncInvoker<UploadTemplateRequest, UploadTemplateResponse>(request, EiHealthMeta.uploadTemplate,
            hcClient);
    }

    /**
     * 发送验证码
     *
     * 发送验证码
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateCodeRequest 请求对象
     * @return CompletableFuture<CreateCodeResponse>
     */
    public CompletableFuture<CreateCodeResponse> createCodeAsync(CreateCodeRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.createCode);
    }

    /**
     * 发送验证码
     *
     * 发送验证码
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateCodeRequest 请求对象
     * @return AsyncInvoker<CreateCodeRequest, CreateCodeResponse>
     */
    public AsyncInvoker<CreateCodeRequest, CreateCodeResponse> createCodeAsyncInvoker(CreateCodeRequest request) {
        return new AsyncInvoker<CreateCodeRequest, CreateCodeResponse>(request, EiHealthMeta.createCode, hcClient);
    }

    /**
     * 创建用户
     *
     * 创建用户
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateUserRequest 请求对象
     * @return CompletableFuture<CreateUserResponse>
     */
    public CompletableFuture<CreateUserResponse> createUserAsync(CreateUserRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.createUser);
    }

    /**
     * 创建用户
     *
     * 创建用户
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateUserRequest 请求对象
     * @return AsyncInvoker<CreateUserRequest, CreateUserResponse>
     */
    public AsyncInvoker<CreateUserRequest, CreateUserResponse> createUserAsyncInvoker(CreateUserRequest request) {
        return new AsyncInvoker<CreateUserRequest, CreateUserResponse>(request, EiHealthMeta.createUser, hcClient);
    }

    /**
     * 删除用户
     *
     * 删除用户
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteUserRequest 请求对象
     * @return CompletableFuture<DeleteUserResponse>
     */
    public CompletableFuture<DeleteUserResponse> deleteUserAsync(DeleteUserRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.deleteUser);
    }

    /**
     * 删除用户
     *
     * 删除用户
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteUserRequest 请求对象
     * @return AsyncInvoker<DeleteUserRequest, DeleteUserResponse>
     */
    public AsyncInvoker<DeleteUserRequest, DeleteUserResponse> deleteUserAsyncInvoker(DeleteUserRequest request) {
        return new AsyncInvoker<DeleteUserRequest, DeleteUserResponse>(request, EiHealthMeta.deleteUser, hcClient);
    }

    /**
     * 获取可用的认证方法
     *
     * 获取可用的认证方法
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListMfaRequest 请求对象
     * @return CompletableFuture<ListMfaResponse>
     */
    public CompletableFuture<ListMfaResponse> listMfaAsync(ListMfaRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.listMfa);
    }

    /**
     * 获取可用的认证方法
     *
     * 获取可用的认证方法
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListMfaRequest 请求对象
     * @return AsyncInvoker<ListMfaRequest, ListMfaResponse>
     */
    public AsyncInvoker<ListMfaRequest, ListMfaResponse> listMfaAsyncInvoker(ListMfaRequest request) {
        return new AsyncInvoker<ListMfaRequest, ListMfaResponse>(request, EiHealthMeta.listMfa, hcClient);
    }

    /**
     * 获取用户列表
     *
     * 获取用户列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListUserRequest 请求对象
     * @return CompletableFuture<ListUserResponse>
     */
    public CompletableFuture<ListUserResponse> listUserAsync(ListUserRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.listUser);
    }

    /**
     * 获取用户列表
     *
     * 获取用户列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListUserRequest 请求对象
     * @return AsyncInvoker<ListUserRequest, ListUserResponse>
     */
    public AsyncInvoker<ListUserRequest, ListUserResponse> listUserAsyncInvoker(ListUserRequest request) {
        return new AsyncInvoker<ListUserRequest, ListUserResponse>(request, EiHealthMeta.listUser, hcClient);
    }

    /**
     * 校验token
     *
     * 校验token是否可访问当前环境
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowTokenVerificationRequest 请求对象
     * @return CompletableFuture<ShowTokenVerificationResponse>
     */
    public CompletableFuture<ShowTokenVerificationResponse> showTokenVerificationAsync(
        ShowTokenVerificationRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.showTokenVerification);
    }

    /**
     * 校验token
     *
     * 校验token是否可访问当前环境
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowTokenVerificationRequest 请求对象
     * @return AsyncInvoker<ShowTokenVerificationRequest, ShowTokenVerificationResponse>
     */
    public AsyncInvoker<ShowTokenVerificationRequest, ShowTokenVerificationResponse> showTokenVerificationAsyncInvoker(
        ShowTokenVerificationRequest request) {
        return new AsyncInvoker<ShowTokenVerificationRequest, ShowTokenVerificationResponse>(request,
            EiHealthMeta.showTokenVerification, hcClient);
    }

    /**
     * 获取指定用户详情
     *
     * 获取指定用户详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowUserRequest 请求对象
     * @return CompletableFuture<ShowUserResponse>
     */
    public CompletableFuture<ShowUserResponse> showUserAsync(ShowUserRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.showUser);
    }

    /**
     * 获取指定用户详情
     *
     * 获取指定用户详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowUserRequest 请求对象
     * @return AsyncInvoker<ShowUserRequest, ShowUserResponse>
     */
    public AsyncInvoker<ShowUserRequest, ShowUserResponse> showUserAsyncInvoker(ShowUserRequest request) {
        return new AsyncInvoker<ShowUserRequest, ShowUserResponse>(request, EiHealthMeta.showUser, hcClient);
    }

    /**
     * 查询用户设置
     *
     * 查询用户设置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowUserSettingRequest 请求对象
     * @return CompletableFuture<ShowUserSettingResponse>
     */
    public CompletableFuture<ShowUserSettingResponse> showUserSettingAsync(ShowUserSettingRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.showUserSetting);
    }

    /**
     * 查询用户设置
     *
     * 查询用户设置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowUserSettingRequest 请求对象
     * @return AsyncInvoker<ShowUserSettingRequest, ShowUserSettingResponse>
     */
    public AsyncInvoker<ShowUserSettingRequest, ShowUserSettingResponse> showUserSettingAsyncInvoker(
        ShowUserSettingRequest request) {
        return new AsyncInvoker<ShowUserSettingRequest, ShowUserSettingResponse>(request, EiHealthMeta.showUserSetting,
            hcClient);
    }

    /**
     * 新用户重置密码
     *
     * 新用户重置密码
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateInitPasswordRequest 请求对象
     * @return CompletableFuture<UpdateInitPasswordResponse>
     */
    public CompletableFuture<UpdateInitPasswordResponse> updateInitPasswordAsync(UpdateInitPasswordRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.updateInitPassword);
    }

    /**
     * 新用户重置密码
     *
     * 新用户重置密码
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateInitPasswordRequest 请求对象
     * @return AsyncInvoker<UpdateInitPasswordRequest, UpdateInitPasswordResponse>
     */
    public AsyncInvoker<UpdateInitPasswordRequest, UpdateInitPasswordResponse> updateInitPasswordAsyncInvoker(
        UpdateInitPasswordRequest request) {
        return new AsyncInvoker<UpdateInitPasswordRequest, UpdateInitPasswordResponse>(request,
            EiHealthMeta.updateInitPassword, hcClient);
    }

    /**
     * 修改密码
     *
     * 修改密码
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdatePasswordRequest 请求对象
     * @return CompletableFuture<UpdatePasswordResponse>
     */
    public CompletableFuture<UpdatePasswordResponse> updatePasswordAsync(UpdatePasswordRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.updatePassword);
    }

    /**
     * 修改密码
     *
     * 修改密码
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdatePasswordRequest 请求对象
     * @return AsyncInvoker<UpdatePasswordRequest, UpdatePasswordResponse>
     */
    public AsyncInvoker<UpdatePasswordRequest, UpdatePasswordResponse> updatePasswordAsyncInvoker(
        UpdatePasswordRequest request) {
        return new AsyncInvoker<UpdatePasswordRequest, UpdatePasswordResponse>(request, EiHealthMeta.updatePassword,
            hcClient);
    }

    /**
     * 修改用户基本信息
     *
     * 修改用户基本信息（邮箱，手机）
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateUserRequest 请求对象
     * @return CompletableFuture<UpdateUserResponse>
     */
    public CompletableFuture<UpdateUserResponse> updateUserAsync(UpdateUserRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.updateUser);
    }

    /**
     * 修改用户基本信息
     *
     * 修改用户基本信息（邮箱，手机）
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateUserRequest 请求对象
     * @return AsyncInvoker<UpdateUserRequest, UpdateUserResponse>
     */
    public AsyncInvoker<UpdateUserRequest, UpdateUserResponse> updateUserAsyncInvoker(UpdateUserRequest request) {
        return new AsyncInvoker<UpdateUserRequest, UpdateUserResponse>(request, EiHealthMeta.updateUser, hcClient);
    }

    /**
     * 最终租户修改子用户
     *
     * 最终租户修改子用户
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateUserByDomainRequest 请求对象
     * @return CompletableFuture<UpdateUserByDomainResponse>
     */
    public CompletableFuture<UpdateUserByDomainResponse> updateUserByDomainAsync(UpdateUserByDomainRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.updateUserByDomain);
    }

    /**
     * 最终租户修改子用户
     *
     * 最终租户修改子用户
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateUserByDomainRequest 请求对象
     * @return AsyncInvoker<UpdateUserByDomainRequest, UpdateUserByDomainResponse>
     */
    public AsyncInvoker<UpdateUserByDomainRequest, UpdateUserByDomainResponse> updateUserByDomainAsyncInvoker(
        UpdateUserByDomainRequest request) {
        return new AsyncInvoker<UpdateUserByDomainRequest, UpdateUserByDomainResponse>(request,
            EiHealthMeta.updateUserByDomain, hcClient);
    }

    /**
     * 更新用户角色
     *
     * 更新用户角色
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateUserRoleRequest 请求对象
     * @return CompletableFuture<UpdateUserRoleResponse>
     */
    public CompletableFuture<UpdateUserRoleResponse> updateUserRoleAsync(UpdateUserRoleRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.updateUserRole);
    }

    /**
     * 更新用户角色
     *
     * 更新用户角色
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateUserRoleRequest 请求对象
     * @return AsyncInvoker<UpdateUserRoleRequest, UpdateUserRoleResponse>
     */
    public AsyncInvoker<UpdateUserRoleRequest, UpdateUserRoleResponse> updateUserRoleAsyncInvoker(
        UpdateUserRoleRequest request) {
        return new AsyncInvoker<UpdateUserRoleRequest, UpdateUserRoleResponse>(request, EiHealthMeta.updateUserRole,
            hcClient);
    }

    /**
     * 更新用户设置
     *
     * 更新用户设置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateUserSettingRequest 请求对象
     * @return CompletableFuture<UpdateUserSettingResponse>
     */
    public CompletableFuture<UpdateUserSettingResponse> updateUserSettingAsync(UpdateUserSettingRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.updateUserSetting);
    }

    /**
     * 更新用户设置
     *
     * 更新用户设置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateUserSettingRequest 请求对象
     * @return AsyncInvoker<UpdateUserSettingRequest, UpdateUserSettingResponse>
     */
    public AsyncInvoker<UpdateUserSettingRequest, UpdateUserSettingResponse> updateUserSettingAsyncInvoker(
        UpdateUserSettingRequest request) {
        return new AsyncInvoker<UpdateUserSettingRequest, UpdateUserSettingResponse>(request,
            EiHealthMeta.updateUserSetting, hcClient);
    }

    /**
     * 预验证
     *
     * 预验证
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ValidateCodeRequest 请求对象
     * @return CompletableFuture<ValidateCodeResponse>
     */
    public CompletableFuture<ValidateCodeResponse> validateCodeAsync(ValidateCodeRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.validateCode);
    }

    /**
     * 预验证
     *
     * 预验证
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ValidateCodeRequest 请求对象
     * @return AsyncInvoker<ValidateCodeRequest, ValidateCodeResponse>
     */
    public AsyncInvoker<ValidateCodeRequest, ValidateCodeResponse> validateCodeAsyncInvoker(
        ValidateCodeRequest request) {
        return new AsyncInvoker<ValidateCodeRequest, ValidateCodeResponse>(request, EiHealthMeta.validateCode,
            hcClient);
    }

    /**
     * 获取供应商列表
     *
     * 获取供应商列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListVendorRequest 请求对象
     * @return CompletableFuture<ListVendorResponse>
     */
    public CompletableFuture<ListVendorResponse> listVendorAsync(ListVendorRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.listVendor);
    }

    /**
     * 获取供应商列表
     *
     * 获取供应商列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListVendorRequest 请求对象
     * @return AsyncInvoker<ListVendorRequest, ListVendorResponse>
     */
    public AsyncInvoker<ListVendorRequest, ListVendorResponse> listVendorAsyncInvoker(ListVendorRequest request) {
        return new AsyncInvoker<ListVendorRequest, ListVendorResponse>(request, EiHealthMeta.listVendor, hcClient);
    }

    /**
     * 创建流程
     *
     * 创建流程
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateWorkflowRequest 请求对象
     * @return CompletableFuture<CreateWorkflowResponse>
     */
    public CompletableFuture<CreateWorkflowResponse> createWorkflowAsync(CreateWorkflowRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.createWorkflow);
    }

    /**
     * 创建流程
     *
     * 创建流程
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateWorkflowRequest 请求对象
     * @return AsyncInvoker<CreateWorkflowRequest, CreateWorkflowResponse>
     */
    public AsyncInvoker<CreateWorkflowRequest, CreateWorkflowResponse> createWorkflowAsyncInvoker(
        CreateWorkflowRequest request) {
        return new AsyncInvoker<CreateWorkflowRequest, CreateWorkflowResponse>(request, EiHealthMeta.createWorkflow,
            hcClient);
    }

    /**
     * 删除流程
     *
     * 删除流程
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteWorkflowRequest 请求对象
     * @return CompletableFuture<DeleteWorkflowResponse>
     */
    public CompletableFuture<DeleteWorkflowResponse> deleteWorkflowAsync(DeleteWorkflowRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.deleteWorkflow);
    }

    /**
     * 删除流程
     *
     * 删除流程
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteWorkflowRequest 请求对象
     * @return AsyncInvoker<DeleteWorkflowRequest, DeleteWorkflowResponse>
     */
    public AsyncInvoker<DeleteWorkflowRequest, DeleteWorkflowResponse> deleteWorkflowAsyncInvoker(
        DeleteWorkflowRequest request) {
        return new AsyncInvoker<DeleteWorkflowRequest, DeleteWorkflowResponse>(request, EiHealthMeta.deleteWorkflow,
            hcClient);
    }

    /**
     * 导入流程
     *
     * 导入流程
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ImportWorkflowRequest 请求对象
     * @return CompletableFuture<ImportWorkflowResponse>
     */
    public CompletableFuture<ImportWorkflowResponse> importWorkflowAsync(ImportWorkflowRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.importWorkflow);
    }

    /**
     * 导入流程
     *
     * 导入流程
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ImportWorkflowRequest 请求对象
     * @return AsyncInvoker<ImportWorkflowRequest, ImportWorkflowResponse>
     */
    public AsyncInvoker<ImportWorkflowRequest, ImportWorkflowResponse> importWorkflowAsyncInvoker(
        ImportWorkflowRequest request) {
        return new AsyncInvoker<ImportWorkflowRequest, ImportWorkflowResponse>(request, EiHealthMeta.importWorkflow,
            hcClient);
    }

    /**
     * 获取流程列表
     *
     * 获取流程列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListWorkflowRequest 请求对象
     * @return CompletableFuture<ListWorkflowResponse>
     */
    public CompletableFuture<ListWorkflowResponse> listWorkflowAsync(ListWorkflowRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.listWorkflow);
    }

    /**
     * 获取流程列表
     *
     * 获取流程列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListWorkflowRequest 请求对象
     * @return AsyncInvoker<ListWorkflowRequest, ListWorkflowResponse>
     */
    public AsyncInvoker<ListWorkflowRequest, ListWorkflowResponse> listWorkflowAsyncInvoker(
        ListWorkflowRequest request) {
        return new AsyncInvoker<ListWorkflowRequest, ListWorkflowResponse>(request, EiHealthMeta.listWorkflow,
            hcClient);
    }

    /**
     * 获取流程详情
     *
     * 获取流程详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowWorkflowRequest 请求对象
     * @return CompletableFuture<ShowWorkflowResponse>
     */
    public CompletableFuture<ShowWorkflowResponse> showWorkflowAsync(ShowWorkflowRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.showWorkflow);
    }

    /**
     * 获取流程详情
     *
     * 获取流程详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowWorkflowRequest 请求对象
     * @return AsyncInvoker<ShowWorkflowRequest, ShowWorkflowResponse>
     */
    public AsyncInvoker<ShowWorkflowRequest, ShowWorkflowResponse> showWorkflowAsyncInvoker(
        ShowWorkflowRequest request) {
        return new AsyncInvoker<ShowWorkflowRequest, ShowWorkflowResponse>(request, EiHealthMeta.showWorkflow,
            hcClient);
    }

    /**
     * 订阅流程
     *
     * 订阅流程
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SubscribeWorkflowRequest 请求对象
     * @return CompletableFuture<SubscribeWorkflowResponse>
     */
    public CompletableFuture<SubscribeWorkflowResponse> subscribeWorkflowAsync(SubscribeWorkflowRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.subscribeWorkflow);
    }

    /**
     * 订阅流程
     *
     * 订阅流程
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SubscribeWorkflowRequest 请求对象
     * @return AsyncInvoker<SubscribeWorkflowRequest, SubscribeWorkflowResponse>
     */
    public AsyncInvoker<SubscribeWorkflowRequest, SubscribeWorkflowResponse> subscribeWorkflowAsyncInvoker(
        SubscribeWorkflowRequest request) {
        return new AsyncInvoker<SubscribeWorkflowRequest, SubscribeWorkflowResponse>(request,
            EiHealthMeta.subscribeWorkflow, hcClient);
    }

    /**
     * 更新流程
     *
     * 更新流程
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateWorkflowRequest 请求对象
     * @return CompletableFuture<UpdateWorkflowResponse>
     */
    public CompletableFuture<UpdateWorkflowResponse> updateWorkflowAsync(UpdateWorkflowRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.updateWorkflow);
    }

    /**
     * 更新流程
     *
     * 更新流程
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateWorkflowRequest 请求对象
     * @return AsyncInvoker<UpdateWorkflowRequest, UpdateWorkflowResponse>
     */
    public AsyncInvoker<UpdateWorkflowRequest, UpdateWorkflowResponse> updateWorkflowAsyncInvoker(
        UpdateWorkflowRequest request) {
        return new AsyncInvoker<UpdateWorkflowRequest, UpdateWorkflowResponse>(request, EiHealthMeta.updateWorkflow,
            hcClient);
    }

}
