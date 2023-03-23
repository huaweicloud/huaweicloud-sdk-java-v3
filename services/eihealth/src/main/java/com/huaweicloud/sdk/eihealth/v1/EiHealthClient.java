package com.huaweicloud.sdk.eihealth.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.eihealth.v1.model.*;

public class EiHealthClient {

    protected HcClient hcClient;

    public EiHealthClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<EiHealthClient> newBuilder() {
        return new ClientBuilder<>(EiHealthClient::new);
    }

    /**
     * 新建CPI任务接口
     *
     * 输入蛋白序列、小分子库，创建分子-蛋白互作预测任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateCpiTaskRequest 请求对象
     * @return CreateCpiTaskResponse
     */
    public CreateCpiTaskResponse createCpiTask(CreateCpiTaskRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.createCpiTask);
    }

    /**
     * 新建CPI任务接口
     *
     * 输入蛋白序列、小分子库，创建分子-蛋白互作预测任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateCpiTaskRequest 请求对象
     * @return SyncInvoker<CreateCpiTaskRequest, CreateCpiTaskResponse>
     */
    public SyncInvoker<CreateCpiTaskRequest, CreateCpiTaskResponse> createCpiTaskInvoker(CreateCpiTaskRequest request) {
        return new SyncInvoker<CreateCpiTaskRequest, CreateCpiTaskResponse>(request, EiHealthMeta.createCpiTask,
            hcClient);
    }

    /**
     * 查询CPI任务
     *
     * 通过CPI任务ID查询CPI任务状态及结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowCpiTaskResultRequest 请求对象
     * @return ShowCpiTaskResultResponse
     */
    public ShowCpiTaskResultResponse showCpiTaskResult(ShowCpiTaskResultRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.showCpiTaskResult);
    }

    /**
     * 查询CPI任务
     *
     * 通过CPI任务ID查询CPI任务状态及结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowCpiTaskResultRequest 请求对象
     * @return SyncInvoker<ShowCpiTaskResultRequest, ShowCpiTaskResultResponse>
     */
    public SyncInvoker<ShowCpiTaskResultRequest, ShowCpiTaskResultResponse> showCpiTaskResultInvoker(
        ShowCpiTaskResultRequest request) {
        return new SyncInvoker<ShowCpiTaskResultRequest, ShowCpiTaskResultResponse>(request,
            EiHealthMeta.showCpiTaskResult, hcClient);
    }

    /**
     * 新建分子生成任务接口
     *
     * 输入分子属性约束，创建分子生成任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateGenerationTaskRequest 请求对象
     * @return CreateGenerationTaskResponse
     */
    public CreateGenerationTaskResponse createGenerationTask(CreateGenerationTaskRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.createGenerationTask);
    }

    /**
     * 新建分子生成任务接口
     *
     * 输入分子属性约束，创建分子生成任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateGenerationTaskRequest 请求对象
     * @return SyncInvoker<CreateGenerationTaskRequest, CreateGenerationTaskResponse>
     */
    public SyncInvoker<CreateGenerationTaskRequest, CreateGenerationTaskResponse> createGenerationTaskInvoker(
        CreateGenerationTaskRequest request) {
        return new SyncInvoker<CreateGenerationTaskRequest, CreateGenerationTaskResponse>(request,
            EiHealthMeta.createGenerationTask, hcClient);
    }

    /**
     * 查询分子生成任务
     *
     * 通过分子生成任务ID查询分子生成任务状态及结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowGenerationTaskResultRequest 请求对象
     * @return ShowGenerationTaskResultResponse
     */
    public ShowGenerationTaskResultResponse showGenerationTaskResult(ShowGenerationTaskResultRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.showGenerationTaskResult);
    }

    /**
     * 查询分子生成任务
     *
     * 通过分子生成任务ID查询分子生成任务状态及结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowGenerationTaskResultRequest 请求对象
     * @return SyncInvoker<ShowGenerationTaskResultRequest, ShowGenerationTaskResultResponse>
     */
    public SyncInvoker<ShowGenerationTaskResultRequest, ShowGenerationTaskResultResponse> showGenerationTaskResultInvoker(
        ShowGenerationTaskResultRequest request) {
        return new SyncInvoker<ShowGenerationTaskResultRequest, ShowGenerationTaskResultResponse>(request,
            EiHealthMeta.showGenerationTaskResult, hcClient);
    }

    /**
     * 导入应用
     *
     * 批量导入应用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchImportAppRequest 请求对象
     * @return BatchImportAppResponse
     */
    public BatchImportAppResponse batchImportApp(BatchImportAppRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.batchImportApp);
    }

    /**
     * 导入应用
     *
     * 批量导入应用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchImportAppRequest 请求对象
     * @return SyncInvoker<BatchImportAppRequest, BatchImportAppResponse>
     */
    public SyncInvoker<BatchImportAppRequest, BatchImportAppResponse> batchImportAppInvoker(
        BatchImportAppRequest request) {
        return new SyncInvoker<BatchImportAppRequest, BatchImportAppResponse>(request, EiHealthMeta.batchImportApp,
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
     * @return CreateAppResponse
     */
    public CreateAppResponse createApp(CreateAppRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.createApp);
    }

    /**
     * 创建应用
     *
     * 创建应用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateAppRequest 请求对象
     * @return SyncInvoker<CreateAppRequest, CreateAppResponse>
     */
    public SyncInvoker<CreateAppRequest, CreateAppResponse> createAppInvoker(CreateAppRequest request) {
        return new SyncInvoker<CreateAppRequest, CreateAppResponse>(request, EiHealthMeta.createApp, hcClient);
    }

    /**
     * 删除应用
     *
     * 删除应用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteAppRequest 请求对象
     * @return DeleteAppResponse
     */
    public DeleteAppResponse deleteApp(DeleteAppRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.deleteApp);
    }

    /**
     * 删除应用
     *
     * 删除应用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteAppRequest 请求对象
     * @return SyncInvoker<DeleteAppRequest, DeleteAppResponse>
     */
    public SyncInvoker<DeleteAppRequest, DeleteAppResponse> deleteAppInvoker(DeleteAppRequest request) {
        return new SyncInvoker<DeleteAppRequest, DeleteAppResponse>(request, EiHealthMeta.deleteApp, hcClient);
    }

    /**
     * 获取应用列表
     *
     * 获取应用列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAppRequest 请求对象
     * @return ListAppResponse
     */
    public ListAppResponse listApp(ListAppRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.listApp);
    }

    /**
     * 获取应用列表
     *
     * 获取应用列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAppRequest 请求对象
     * @return SyncInvoker<ListAppRequest, ListAppResponse>
     */
    public SyncInvoker<ListAppRequest, ListAppResponse> listAppInvoker(ListAppRequest request) {
        return new SyncInvoker<ListAppRequest, ListAppResponse>(request, EiHealthMeta.listApp, hcClient);
    }

    /**
     * 发布应用
     *
     * 发布应用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param PublishAppRequest 请求对象
     * @return PublishAppResponse
     */
    public PublishAppResponse publishApp(PublishAppRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.publishApp);
    }

    /**
     * 发布应用
     *
     * 发布应用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param PublishAppRequest 请求对象
     * @return SyncInvoker<PublishAppRequest, PublishAppResponse>
     */
    public SyncInvoker<PublishAppRequest, PublishAppResponse> publishAppInvoker(PublishAppRequest request) {
        return new SyncInvoker<PublishAppRequest, PublishAppResponse>(request, EiHealthMeta.publishApp, hcClient);
    }

    /**
     * 获取应用详情
     *
     * 获取应用详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAppRequest 请求对象
     * @return ShowAppResponse
     */
    public ShowAppResponse showApp(ShowAppRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.showApp);
    }

    /**
     * 获取应用详情
     *
     * 获取应用详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAppRequest 请求对象
     * @return SyncInvoker<ShowAppRequest, ShowAppResponse>
     */
    public SyncInvoker<ShowAppRequest, ShowAppResponse> showAppInvoker(ShowAppRequest request) {
        return new SyncInvoker<ShowAppRequest, ShowAppResponse>(request, EiHealthMeta.showApp, hcClient);
    }

    /**
     * 订阅应用
     *
     * 订阅应用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SubscribeAppRequest 请求对象
     * @return SubscribeAppResponse
     */
    public SubscribeAppResponse subscribeApp(SubscribeAppRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.subscribeApp);
    }

    /**
     * 订阅应用
     *
     * 订阅应用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SubscribeAppRequest 请求对象
     * @return SyncInvoker<SubscribeAppRequest, SubscribeAppResponse>
     */
    public SyncInvoker<SubscribeAppRequest, SubscribeAppResponse> subscribeAppInvoker(SubscribeAppRequest request) {
        return new SyncInvoker<SubscribeAppRequest, SubscribeAppResponse>(request, EiHealthMeta.subscribeApp, hcClient);
    }

    /**
     * 更新应用
     *
     * 更新应用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateAppRequest 请求对象
     * @return UpdateAppResponse
     */
    public UpdateAppResponse updateApp(UpdateAppRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.updateApp);
    }

    /**
     * 更新应用
     *
     * 更新应用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateAppRequest 请求对象
     * @return SyncInvoker<UpdateAppRequest, UpdateAppResponse>
     */
    public SyncInvoker<UpdateAppRequest, UpdateAppResponse> updateAppInvoker(UpdateAppRequest request) {
        return new SyncInvoker<UpdateAppRequest, UpdateAppResponse>(request, EiHealthMeta.updateApp, hcClient);
    }

    /**
     * 删除资产指定版本
     *
     * 删除资产指定版本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteAssetVersionRequest 请求对象
     * @return DeleteAssetVersionResponse
     */
    public DeleteAssetVersionResponse deleteAssetVersion(DeleteAssetVersionRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.deleteAssetVersion);
    }

    /**
     * 删除资产指定版本
     *
     * 删除资产指定版本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteAssetVersionRequest 请求对象
     * @return SyncInvoker<DeleteAssetVersionRequest, DeleteAssetVersionResponse>
     */
    public SyncInvoker<DeleteAssetVersionRequest, DeleteAssetVersionResponse> deleteAssetVersionInvoker(
        DeleteAssetVersionRequest request) {
        return new SyncInvoker<DeleteAssetVersionRequest, DeleteAssetVersionResponse>(request,
            EiHealthMeta.deleteAssetVersion, hcClient);
    }

    /**
     * 操作资产发布状态
     *
     * 操作资产发布状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ExecuteAssetActionRequest 请求对象
     * @return ExecuteAssetActionResponse
     */
    public ExecuteAssetActionResponse executeAssetAction(ExecuteAssetActionRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.executeAssetAction);
    }

    /**
     * 操作资产发布状态
     *
     * 操作资产发布状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ExecuteAssetActionRequest 请求对象
     * @return SyncInvoker<ExecuteAssetActionRequest, ExecuteAssetActionResponse>
     */
    public SyncInvoker<ExecuteAssetActionRequest, ExecuteAssetActionResponse> executeAssetActionInvoker(
        ExecuteAssetActionRequest request) {
        return new SyncInvoker<ExecuteAssetActionRequest, ExecuteAssetActionResponse>(request,
            EiHealthMeta.executeAssetAction, hcClient);
    }

    /**
     * 获取资产列表
     *
     * 获取资产列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAssetRequest 请求对象
     * @return ListAssetResponse
     */
    public ListAssetResponse listAsset(ListAssetRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.listAsset);
    }

    /**
     * 获取资产列表
     *
     * 获取资产列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAssetRequest 请求对象
     * @return SyncInvoker<ListAssetRequest, ListAssetResponse>
     */
    public SyncInvoker<ListAssetRequest, ListAssetResponse> listAssetInvoker(ListAssetRequest request) {
        return new SyncInvoker<ListAssetRequest, ListAssetResponse>(request, EiHealthMeta.listAsset, hcClient);
    }

    /**
     * 获取属性值列表
     *
     * 获取属性值列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPropertyRequest 请求对象
     * @return ListPropertyResponse
     */
    public ListPropertyResponse listProperty(ListPropertyRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.listProperty);
    }

    /**
     * 获取属性值列表
     *
     * 获取属性值列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPropertyRequest 请求对象
     * @return SyncInvoker<ListPropertyRequest, ListPropertyResponse>
     */
    public SyncInvoker<ListPropertyRequest, ListPropertyResponse> listPropertyInvoker(ListPropertyRequest request) {
        return new SyncInvoker<ListPropertyRequest, ListPropertyResponse>(request, EiHealthMeta.listProperty, hcClient);
    }

    /**
     * 查询资产详情
     *
     * 查询资产详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAssetRequest 请求对象
     * @return ShowAssetResponse
     */
    public ShowAssetResponse showAsset(ShowAssetRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.showAsset);
    }

    /**
     * 查询资产详情
     *
     * 查询资产详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAssetRequest 请求对象
     * @return SyncInvoker<ShowAssetRequest, ShowAssetResponse>
     */
    public SyncInvoker<ShowAssetRequest, ShowAssetResponse> showAssetInvoker(ShowAssetRequest request) {
        return new SyncInvoker<ShowAssetRequest, ShowAssetResponse>(request, EiHealthMeta.showAsset, hcClient);
    }

    /**
     * 查询资产版本详情
     *
     * 查询资产版本详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAssetVersionRequest 请求对象
     * @return ShowAssetVersionResponse
     */
    public ShowAssetVersionResponse showAssetVersion(ShowAssetVersionRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.showAssetVersion);
    }

    /**
     * 查询资产版本详情
     *
     * 查询资产版本详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAssetVersionRequest 请求对象
     * @return SyncInvoker<ShowAssetVersionRequest, ShowAssetVersionResponse>
     */
    public SyncInvoker<ShowAssetVersionRequest, ShowAssetVersionResponse> showAssetVersionInvoker(
        ShowAssetVersionRequest request) {
        return new SyncInvoker<ShowAssetVersionRequest, ShowAssetVersionResponse>(request,
            EiHealthMeta.showAssetVersion, hcClient);
    }

    /**
     * 更新资产指定版本的信息
     *
     * 更新资产指定版本的信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateAssetVersionRequest 请求对象
     * @return UpdateAssetVersionResponse
     */
    public UpdateAssetVersionResponse updateAssetVersion(UpdateAssetVersionRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.updateAssetVersion);
    }

    /**
     * 更新资产指定版本的信息
     *
     * 更新资产指定版本的信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateAssetVersionRequest 请求对象
     * @return SyncInvoker<UpdateAssetVersionRequest, UpdateAssetVersionResponse>
     */
    public SyncInvoker<UpdateAssetVersionRequest, UpdateAssetVersionResponse> updateAssetVersionInvoker(
        UpdateAssetVersionRequest request) {
        return new SyncInvoker<UpdateAssetVersionRequest, UpdateAssetVersionResponse>(request,
            EiHealthMeta.updateAssetVersion, hcClient);
    }

    /**
     * 创建自动作业模板
     *
     * 创建自动作业模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateAutoJobRequest 请求对象
     * @return CreateAutoJobResponse
     */
    public CreateAutoJobResponse createAutoJob(CreateAutoJobRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.createAutoJob);
    }

    /**
     * 创建自动作业模板
     *
     * 创建自动作业模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateAutoJobRequest 请求对象
     * @return SyncInvoker<CreateAutoJobRequest, CreateAutoJobResponse>
     */
    public SyncInvoker<CreateAutoJobRequest, CreateAutoJobResponse> createAutoJobInvoker(CreateAutoJobRequest request) {
        return new SyncInvoker<CreateAutoJobRequest, CreateAutoJobResponse>(request, EiHealthMeta.createAutoJob,
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
     * @return DeleteAutoJobResponse
     */
    public DeleteAutoJobResponse deleteAutoJob(DeleteAutoJobRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.deleteAutoJob);
    }

    /**
     * 删除自动作业模板
     *
     * 删除自动作业模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteAutoJobRequest 请求对象
     * @return SyncInvoker<DeleteAutoJobRequest, DeleteAutoJobResponse>
     */
    public SyncInvoker<DeleteAutoJobRequest, DeleteAutoJobResponse> deleteAutoJobInvoker(DeleteAutoJobRequest request) {
        return new SyncInvoker<DeleteAutoJobRequest, DeleteAutoJobResponse>(request, EiHealthMeta.deleteAutoJob,
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
     * @return ListAutoJobResponse
     */
    public ListAutoJobResponse listAutoJob(ListAutoJobRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.listAutoJob);
    }

    /**
     * 获取自动作业模板列表
     *
     * 获取自动作业模板列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAutoJobRequest 请求对象
     * @return SyncInvoker<ListAutoJobRequest, ListAutoJobResponse>
     */
    public SyncInvoker<ListAutoJobRequest, ListAutoJobResponse> listAutoJobInvoker(ListAutoJobRequest request) {
        return new SyncInvoker<ListAutoJobRequest, ListAutoJobResponse>(request, EiHealthMeta.listAutoJob, hcClient);
    }

    /**
     * 查询自动作业模板
     *
     * 查询自动作业模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAutoJobRequest 请求对象
     * @return ShowAutoJobResponse
     */
    public ShowAutoJobResponse showAutoJob(ShowAutoJobRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.showAutoJob);
    }

    /**
     * 查询自动作业模板
     *
     * 查询自动作业模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAutoJobRequest 请求对象
     * @return SyncInvoker<ShowAutoJobRequest, ShowAutoJobResponse>
     */
    public SyncInvoker<ShowAutoJobRequest, ShowAutoJobResponse> showAutoJobInvoker(ShowAutoJobRequest request) {
        return new SyncInvoker<ShowAutoJobRequest, ShowAutoJobResponse>(request, EiHealthMeta.showAutoJob, hcClient);
    }

    /**
     * 启动自动作业
     *
     * 启动自动作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StartAutoJobRequest 请求对象
     * @return StartAutoJobResponse
     */
    public StartAutoJobResponse startAutoJob(StartAutoJobRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.startAutoJob);
    }

    /**
     * 启动自动作业
     *
     * 启动自动作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StartAutoJobRequest 请求对象
     * @return SyncInvoker<StartAutoJobRequest, StartAutoJobResponse>
     */
    public SyncInvoker<StartAutoJobRequest, StartAutoJobResponse> startAutoJobInvoker(StartAutoJobRequest request) {
        return new SyncInvoker<StartAutoJobRequest, StartAutoJobResponse>(request, EiHealthMeta.startAutoJob, hcClient);
    }

    /**
     * 停止自动作业
     *
     * 停止自动作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StopAutoJobRequest 请求对象
     * @return StopAutoJobResponse
     */
    public StopAutoJobResponse stopAutoJob(StopAutoJobRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.stopAutoJob);
    }

    /**
     * 停止自动作业
     *
     * 停止自动作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StopAutoJobRequest 请求对象
     * @return SyncInvoker<StopAutoJobRequest, StopAutoJobResponse>
     */
    public SyncInvoker<StopAutoJobRequest, StopAutoJobResponse> stopAutoJobInvoker(StopAutoJobRequest request) {
        return new SyncInvoker<StopAutoJobRequest, StopAutoJobResponse>(request, EiHealthMeta.stopAutoJob, hcClient);
    }

    /**
     * 更新自动作业模板
     *
     * 更新自动作业模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateAutoJobRequest 请求对象
     * @return UpdateAutoJobResponse
     */
    public UpdateAutoJobResponse updateAutoJob(UpdateAutoJobRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.updateAutoJob);
    }

    /**
     * 更新自动作业模板
     *
     * 更新自动作业模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateAutoJobRequest 请求对象
     * @return SyncInvoker<UpdateAutoJobRequest, UpdateAutoJobResponse>
     */
    public SyncInvoker<UpdateAutoJobRequest, UpdateAutoJobResponse> updateAutoJobInvoker(UpdateAutoJobRequest request) {
        return new SyncInvoker<UpdateAutoJobRequest, UpdateAutoJobResponse>(request, EiHealthMeta.updateAutoJob,
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
     * @return CreateComputingResourceResponse
     */
    public CreateComputingResourceResponse createComputingResource(CreateComputingResourceRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.createComputingResource);
    }

    /**
     * 购买计算资源
     *
     * 购买计算资源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateComputingResourceRequest 请求对象
     * @return SyncInvoker<CreateComputingResourceRequest, CreateComputingResourceResponse>
     */
    public SyncInvoker<CreateComputingResourceRequest, CreateComputingResourceResponse> createComputingResourceInvoker(
        CreateComputingResourceRequest request) {
        return new SyncInvoker<CreateComputingResourceRequest, CreateComputingResourceResponse>(request,
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
     * @return DeleteComputingResourceResponse
     */
    public DeleteComputingResourceResponse deleteComputingResource(DeleteComputingResourceRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.deleteComputingResource);
    }

    /**
     * 删除计算资源
     *
     * 删除计算资源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteComputingResourceRequest 请求对象
     * @return SyncInvoker<DeleteComputingResourceRequest, DeleteComputingResourceResponse>
     */
    public SyncInvoker<DeleteComputingResourceRequest, DeleteComputingResourceResponse> deleteComputingResourceInvoker(
        DeleteComputingResourceRequest request) {
        return new SyncInvoker<DeleteComputingResourceRequest, DeleteComputingResourceResponse>(request,
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
     * @return ListComputingResourceFlavorsResponse
     */
    public ListComputingResourceFlavorsResponse listComputingResourceFlavors(
        ListComputingResourceFlavorsRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.listComputingResourceFlavors);
    }

    /**
     * 查询计算资源规格
     *
     * 查询计算资源规格
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListComputingResourceFlavorsRequest 请求对象
     * @return SyncInvoker<ListComputingResourceFlavorsRequest, ListComputingResourceFlavorsResponse>
     */
    public SyncInvoker<ListComputingResourceFlavorsRequest, ListComputingResourceFlavorsResponse> listComputingResourceFlavorsInvoker(
        ListComputingResourceFlavorsRequest request) {
        return new SyncInvoker<ListComputingResourceFlavorsRequest, ListComputingResourceFlavorsResponse>(request,
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
     * @return ListComputingResourcesResponse
     */
    public ListComputingResourcesResponse listComputingResources(ListComputingResourcesRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.listComputingResources);
    }

    /**
     * 查询计算资源
     *
     * 查询计算资源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListComputingResourcesRequest 请求对象
     * @return SyncInvoker<ListComputingResourcesRequest, ListComputingResourcesResponse>
     */
    public SyncInvoker<ListComputingResourcesRequest, ListComputingResourcesResponse> listComputingResourcesInvoker(
        ListComputingResourcesRequest request) {
        return new SyncInvoker<ListComputingResourcesRequest, ListComputingResourcesResponse>(request,
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
     * @return RebootNodeResponse
     */
    public RebootNodeResponse rebootNode(RebootNodeRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.rebootNode);
    }

    /**
     * 重启计算资源
     *
     * 重启计算资源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RebootNodeRequest 请求对象
     * @return SyncInvoker<RebootNodeRequest, RebootNodeResponse>
     */
    public SyncInvoker<RebootNodeRequest, RebootNodeResponse> rebootNodeInvoker(RebootNodeRequest request) {
        return new SyncInvoker<RebootNodeRequest, RebootNodeResponse>(request, EiHealthMeta.rebootNode, hcClient);
    }

    /**
     * 查询bms计算资源显卡id列表
     *
     * 查询bms计算资源显卡id列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowBmsDevicesRequest 请求对象
     * @return ShowBmsDevicesResponse
     */
    public ShowBmsDevicesResponse showBmsDevices(ShowBmsDevicesRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.showBmsDevices);
    }

    /**
     * 查询bms计算资源显卡id列表
     *
     * 查询bms计算资源显卡id列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowBmsDevicesRequest 请求对象
     * @return SyncInvoker<ShowBmsDevicesRequest, ShowBmsDevicesResponse>
     */
    public SyncInvoker<ShowBmsDevicesRequest, ShowBmsDevicesResponse> showBmsDevicesInvoker(
        ShowBmsDevicesRequest request) {
        return new SyncInvoker<ShowBmsDevicesRequest, ShowBmsDevicesResponse>(request, EiHealthMeta.showBmsDevices,
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
     * @return ShowEvsQuotaResponse
     */
    public ShowEvsQuotaResponse showEvsQuota(ShowEvsQuotaRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.showEvsQuota);
    }

    /**
     * 获取EVS配额及使用情况
     *
     * 获取EVS配额及使用情况
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowEvsQuotaRequest 请求对象
     * @return SyncInvoker<ShowEvsQuotaRequest, ShowEvsQuotaResponse>
     */
    public SyncInvoker<ShowEvsQuotaRequest, ShowEvsQuotaResponse> showEvsQuotaInvoker(ShowEvsQuotaRequest request) {
        return new SyncInvoker<ShowEvsQuotaRequest, ShowEvsQuotaResponse>(request, EiHealthMeta.showEvsQuota, hcClient);
    }

    /**
     * 获取节点剩余配额
     *
     * 获取节点剩余配额
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowLeftQuotaRequest 请求对象
     * @return ShowLeftQuotaResponse
     */
    public ShowLeftQuotaResponse showLeftQuota(ShowLeftQuotaRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.showLeftQuota);
    }

    /**
     * 获取节点剩余配额
     *
     * 获取节点剩余配额
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowLeftQuotaRequest 请求对象
     * @return SyncInvoker<ShowLeftQuotaRequest, ShowLeftQuotaResponse>
     */
    public SyncInvoker<ShowLeftQuotaRequest, ShowLeftQuotaResponse> showLeftQuotaInvoker(ShowLeftQuotaRequest request) {
        return new SyncInvoker<ShowLeftQuotaRequest, ShowLeftQuotaResponse>(request, EiHealthMeta.showLeftQuota,
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
     * @return ShowScheduleResponse
     */
    public ShowScheduleResponse showSchedule(ShowScheduleRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.showSchedule);
    }

    /**
     * 查询计算资源调度信息
     *
     * 查询计算资源调度信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowScheduleRequest 请求对象
     * @return SyncInvoker<ShowScheduleRequest, ShowScheduleResponse>
     */
    public SyncInvoker<ShowScheduleRequest, ShowScheduleResponse> showScheduleInvoker(ShowScheduleRequest request) {
        return new SyncInvoker<ShowScheduleRequest, ShowScheduleResponse>(request, EiHealthMeta.showSchedule, hcClient);
    }

    /**
     * 启动计算资源
     *
     * 启动计算资源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StartNodeRequest 请求对象
     * @return StartNodeResponse
     */
    public StartNodeResponse startNode(StartNodeRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.startNode);
    }

    /**
     * 启动计算资源
     *
     * 启动计算资源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StartNodeRequest 请求对象
     * @return SyncInvoker<StartNodeRequest, StartNodeResponse>
     */
    public SyncInvoker<StartNodeRequest, StartNodeResponse> startNodeInvoker(StartNodeRequest request) {
        return new SyncInvoker<StartNodeRequest, StartNodeResponse>(request, EiHealthMeta.startNode, hcClient);
    }

    /**
     * 关闭计算资源
     *
     * 关闭计算资源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StopNodeRequest 请求对象
     * @return StopNodeResponse
     */
    public StopNodeResponse stopNode(StopNodeRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.stopNode);
    }

    /**
     * 关闭计算资源
     *
     * 关闭计算资源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StopNodeRequest 请求对象
     * @return SyncInvoker<StopNodeRequest, StopNodeResponse>
     */
    public SyncInvoker<StopNodeRequest, StopNodeResponse> stopNodeInvoker(StopNodeRequest request) {
        return new SyncInvoker<StopNodeRequest, StopNodeResponse>(request, EiHealthMeta.stopNode, hcClient);
    }

    /**
     * 修改计算资源调度信息
     *
     * 修改计算资源调度信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateScheduleRequest 请求对象
     * @return UpdateScheduleResponse
     */
    public UpdateScheduleResponse updateSchedule(UpdateScheduleRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.updateSchedule);
    }

    /**
     * 修改计算资源调度信息
     *
     * 修改计算资源调度信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateScheduleRequest 请求对象
     * @return SyncInvoker<UpdateScheduleRequest, UpdateScheduleResponse>
     */
    public SyncInvoker<UpdateScheduleRequest, UpdateScheduleResponse> updateScheduleInvoker(
        UpdateScheduleRequest request) {
        return new SyncInvoker<UpdateScheduleRequest, UpdateScheduleResponse>(request, EiHealthMeta.updateSchedule,
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
     * @return CreateBackupResponse
     */
    public CreateBackupResponse createBackup(CreateBackupRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.createBackup);
    }

    /**
     * 归档数据
     *
     * 将需要归档的重要数据拷贝到数据归档桶
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateBackupRequest 请求对象
     * @return SyncInvoker<CreateBackupRequest, CreateBackupResponse>
     */
    public SyncInvoker<CreateBackupRequest, CreateBackupResponse> createBackupInvoker(CreateBackupRequest request) {
        return new SyncInvoker<CreateBackupRequest, CreateBackupResponse>(request, EiHealthMeta.createBackup, hcClient);
    }

    /**
     * 删除归档
     *
     * 删除指定的归档
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteBackupRequest 请求对象
     * @return DeleteBackupResponse
     */
    public DeleteBackupResponse deleteBackup(DeleteBackupRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.deleteBackup);
    }

    /**
     * 删除归档
     *
     * 删除指定的归档
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteBackupRequest 请求对象
     * @return SyncInvoker<DeleteBackupRequest, DeleteBackupResponse>
     */
    public SyncInvoker<DeleteBackupRequest, DeleteBackupResponse> deleteBackupInvoker(DeleteBackupRequest request) {
        return new SyncInvoker<DeleteBackupRequest, DeleteBackupResponse>(request, EiHealthMeta.deleteBackup, hcClient);
    }

    /**
     * 查询归档列表
     *
     * 分页查询用户管理的项目的所有历史归档记录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListBackupRequest 请求对象
     * @return ListBackupResponse
     */
    public ListBackupResponse listBackup(ListBackupRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.listBackup);
    }

    /**
     * 查询归档列表
     *
     * 分页查询用户管理的项目的所有历史归档记录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListBackupRequest 请求对象
     * @return SyncInvoker<ListBackupRequest, ListBackupResponse>
     */
    public SyncInvoker<ListBackupRequest, ListBackupResponse> listBackupInvoker(ListBackupRequest request) {
        return new SyncInvoker<ListBackupRequest, ListBackupResponse>(request, EiHealthMeta.listBackup, hcClient);
    }

    /**
     * 恢复归档
     *
     * 将指定的归档数据拷贝到目标项目的某个目录下
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RestoreBackupRequest 请求对象
     * @return RestoreBackupResponse
     */
    public RestoreBackupResponse restoreBackup(RestoreBackupRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.restoreBackup);
    }

    /**
     * 恢复归档
     *
     * 将指定的归档数据拷贝到目标项目的某个目录下
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RestoreBackupRequest 请求对象
     * @return SyncInvoker<RestoreBackupRequest, RestoreBackupResponse>
     */
    public SyncInvoker<RestoreBackupRequest, RestoreBackupResponse> restoreBackupInvoker(RestoreBackupRequest request) {
        return new SyncInvoker<RestoreBackupRequest, RestoreBackupResponse>(request, EiHealthMeta.restoreBackup,
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
     * @return ShowBackupPathResponse
     */
    public ShowBackupPathResponse showBackupPath(ShowBackupPathRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.showBackupPath);
    }

    /**
     * 获取指定归档的全数据清单
     *
     * 根据归档ID获取该归档的全数据清单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowBackupPathRequest 请求对象
     * @return SyncInvoker<ShowBackupPathRequest, ShowBackupPathResponse>
     */
    public SyncInvoker<ShowBackupPathRequest, ShowBackupPathResponse> showBackupPathInvoker(
        ShowBackupPathRequest request) {
        return new SyncInvoker<ShowBackupPathRequest, ShowBackupPathResponse>(request, EiHealthMeta.showBackupPath,
            hcClient);
    }

    /**
     * 批量删除项目数据
     *
     * 批量删除项目数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchDeleteDataRequest 请求对象
     * @return BatchDeleteDataResponse
     */
    public BatchDeleteDataResponse batchDeleteData(BatchDeleteDataRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.batchDeleteData);
    }

    /**
     * 批量删除项目数据
     *
     * 批量删除项目数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchDeleteDataRequest 请求对象
     * @return SyncInvoker<BatchDeleteDataRequest, BatchDeleteDataResponse>
     */
    public SyncInvoker<BatchDeleteDataRequest, BatchDeleteDataResponse> batchDeleteDataInvoker(
        BatchDeleteDataRequest request) {
        return new SyncInvoker<BatchDeleteDataRequest, BatchDeleteDataResponse>(request, EiHealthMeta.batchDeleteData,
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
     * @return CopyDataResponse
     */
    public CopyDataResponse copyData(CopyDataRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.copyData);
    }

    /**
     * 复制项目数据
     *
     * 复制项目数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CopyDataRequest 请求对象
     * @return SyncInvoker<CopyDataRequest, CopyDataResponse>
     */
    public SyncInvoker<CopyDataRequest, CopyDataResponse> copyDataInvoker(CopyDataRequest request) {
        return new SyncInvoker<CopyDataRequest, CopyDataResponse>(request, EiHealthMeta.copyData, hcClient);
    }

    /**
     * 创建文件夹
     *
     * 创建文件夹
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateDataRequest 请求对象
     * @return CreateDataResponse
     */
    public CreateDataResponse createData(CreateDataRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.createData);
    }

    /**
     * 创建文件夹
     *
     * 创建文件夹
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateDataRequest 请求对象
     * @return SyncInvoker<CreateDataRequest, CreateDataResponse>
     */
    public SyncInvoker<CreateDataRequest, CreateDataResponse> createDataInvoker(CreateDataRequest request) {
        return new SyncInvoker<CreateDataRequest, CreateDataResponse>(request, EiHealthMeta.createData, hcClient);
    }

    /**
     * 导入项目数据
     *
     * 导入项目数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ImportDataRequest 请求对象
     * @return ImportDataResponse
     */
    public ImportDataResponse importData(ImportDataRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.importData);
    }

    /**
     * 导入项目数据
     *
     * 导入项目数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ImportDataRequest 请求对象
     * @return SyncInvoker<ImportDataRequest, ImportDataResponse>
     */
    public SyncInvoker<ImportDataRequest, ImportDataResponse> importDataInvoker(ImportDataRequest request) {
        return new SyncInvoker<ImportDataRequest, ImportDataResponse>(request, EiHealthMeta.importData, hcClient);
    }

    /**
     * 导入网上数据
     *
     * 导入网上数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ImportNetworkDataRequest 请求对象
     * @return ImportNetworkDataResponse
     */
    public ImportNetworkDataResponse importNetworkData(ImportNetworkDataRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.importNetworkData);
    }

    /**
     * 导入网上数据
     *
     * 导入网上数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ImportNetworkDataRequest 请求对象
     * @return SyncInvoker<ImportNetworkDataRequest, ImportNetworkDataResponse>
     */
    public SyncInvoker<ImportNetworkDataRequest, ImportNetworkDataResponse> importNetworkDataInvoker(
        ImportNetworkDataRequest request) {
        return new SyncInvoker<ImportNetworkDataRequest, ImportNetworkDataResponse>(request,
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
     * @return ListBucketResponse
     */
    public ListBucketResponse listBucket(ListBucketRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.listBucket);
    }

    /**
     * 获取桶列表
     *
     * 获取桶列表(包含当前项目桶和引用项目桶)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListBucketRequest 请求对象
     * @return SyncInvoker<ListBucketRequest, ListBucketResponse>
     */
    public SyncInvoker<ListBucketRequest, ListBucketResponse> listBucketInvoker(ListBucketRequest request) {
        return new SyncInvoker<ListBucketRequest, ListBucketResponse>(request, EiHealthMeta.listBucket, hcClient);
    }

    /**
     * 查询数据列表
     *
     * 查询指定目录下的数据列表，如果不指定默认查询根目录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDataRequest 请求对象
     * @return ListDataResponse
     */
    public ListDataResponse listData(ListDataRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.listData);
    }

    /**
     * 查询数据列表
     *
     * 查询指定目录下的数据列表，如果不指定默认查询根目录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDataRequest 请求对象
     * @return SyncInvoker<ListDataRequest, ListDataResponse>
     */
    public SyncInvoker<ListDataRequest, ListDataResponse> listDataInvoker(ListDataRequest request) {
        return new SyncInvoker<ListDataRequest, ListDataResponse>(request, EiHealthMeta.listData, hcClient);
    }

    /**
     * 发布数据资产
     *
     * 发布数据资产
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param PublishDataRequest 请求对象
     * @return PublishDataResponse
     */
    public PublishDataResponse publishData(PublishDataRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.publishData);
    }

    /**
     * 发布数据资产
     *
     * 发布数据资产
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param PublishDataRequest 请求对象
     * @return SyncInvoker<PublishDataRequest, PublishDataResponse>
     */
    public SyncInvoker<PublishDataRequest, PublishDataResponse> publishDataInvoker(PublishDataRequest request) {
        return new SyncInvoker<PublishDataRequest, PublishDataResponse>(request, EiHealthMeta.publishData, hcClient);
    }

    /**
     * 引用项目数据
     *
     * 引用项目数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param QuoteDataRequest 请求对象
     * @return QuoteDataResponse
     */
    public QuoteDataResponse quoteData(QuoteDataRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.quoteData);
    }

    /**
     * 引用项目数据
     *
     * 引用项目数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param QuoteDataRequest 请求对象
     * @return SyncInvoker<QuoteDataRequest, QuoteDataResponse>
     */
    public SyncInvoker<QuoteDataRequest, QuoteDataResponse> quoteDataInvoker(QuoteDataRequest request) {
        return new SyncInvoker<QuoteDataRequest, QuoteDataResponse>(request, EiHealthMeta.quoteData, hcClient);
    }

    /**
     * 获取桶存量信息
     *
     * 获取桶存量信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowBucketStorageRequest 请求对象
     * @return ShowBucketStorageResponse
     */
    public ShowBucketStorageResponse showBucketStorage(ShowBucketStorageRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.showBucketStorage);
    }

    /**
     * 获取桶存量信息
     *
     * 获取桶存量信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowBucketStorageRequest 请求对象
     * @return SyncInvoker<ShowBucketStorageRequest, ShowBucketStorageResponse>
     */
    public SyncInvoker<ShowBucketStorageRequest, ShowBucketStorageResponse> showBucketStorageInvoker(
        ShowBucketStorageRequest request) {
        return new SyncInvoker<ShowBucketStorageRequest, ShowBucketStorageResponse>(request,
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
     * @return ShowDataResponse
     */
    public ShowDataResponse showData(ShowDataRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.showData);
    }

    /**
     * 获取指定数据对象
     *
     * 获取指定数据对象的详细信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDataRequest 请求对象
     * @return SyncInvoker<ShowDataRequest, ShowDataResponse>
     */
    public SyncInvoker<ShowDataRequest, ShowDataResponse> showDataInvoker(ShowDataRequest request) {
        return new SyncInvoker<ShowDataRequest, ShowDataResponse>(request, EiHealthMeta.showData, hcClient);
    }

    /**
     * 查询项目级数据权限控制策略
     *
     * 查询项目级数据权限控制策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDataPolicyRequest 请求对象
     * @return ShowDataPolicyResponse
     */
    public ShowDataPolicyResponse showDataPolicy(ShowDataPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.showDataPolicy);
    }

    /**
     * 查询项目级数据权限控制策略
     *
     * 查询项目级数据权限控制策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDataPolicyRequest 请求对象
     * @return SyncInvoker<ShowDataPolicyRequest, ShowDataPolicyResponse>
     */
    public SyncInvoker<ShowDataPolicyRequest, ShowDataPolicyResponse> showDataPolicyInvoker(
        ShowDataPolicyRequest request) {
        return new SyncInvoker<ShowDataPolicyRequest, ShowDataPolicyResponse>(request, EiHealthMeta.showDataPolicy,
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
     * @return SubscribeDataResponse
     */
    public SubscribeDataResponse subscribeData(SubscribeDataRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.subscribeData);
    }

    /**
     * 订阅资产市场数据
     *
     * 订阅资产市场数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SubscribeDataRequest 请求对象
     * @return SyncInvoker<SubscribeDataRequest, SubscribeDataResponse>
     */
    public SyncInvoker<SubscribeDataRequest, SubscribeDataResponse> subscribeDataInvoker(SubscribeDataRequest request) {
        return new SyncInvoker<SubscribeDataRequest, SubscribeDataResponse>(request, EiHealthMeta.subscribeData,
            hcClient);
    }

    /**
     * 设置数据对象策略
     *
     * 设置数据对象策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateDataPathPolicyRequest 请求对象
     * @return UpdateDataPathPolicyResponse
     */
    public UpdateDataPathPolicyResponse updateDataPathPolicy(UpdateDataPathPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.updateDataPathPolicy);
    }

    /**
     * 设置数据对象策略
     *
     * 设置数据对象策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateDataPathPolicyRequest 请求对象
     * @return SyncInvoker<UpdateDataPathPolicyRequest, UpdateDataPathPolicyResponse>
     */
    public SyncInvoker<UpdateDataPathPolicyRequest, UpdateDataPathPolicyResponse> updateDataPathPolicyInvoker(
        UpdateDataPathPolicyRequest request) {
        return new SyncInvoker<UpdateDataPathPolicyRequest, UpdateDataPathPolicyResponse>(request,
            EiHealthMeta.updateDataPathPolicy, hcClient);
    }

    /**
     * 设置项目级权限控制策略
     *
     * 设置项目级权限控制策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateDataPolicyRequest 请求对象
     * @return UpdateDataPolicyResponse
     */
    public UpdateDataPolicyResponse updateDataPolicy(UpdateDataPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.updateDataPolicy);
    }

    /**
     * 设置项目级权限控制策略
     *
     * 设置项目级权限控制策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateDataPolicyRequest 请求对象
     * @return SyncInvoker<UpdateDataPolicyRequest, UpdateDataPolicyResponse>
     */
    public SyncInvoker<UpdateDataPolicyRequest, UpdateDataPolicyResponse> updateDataPolicyInvoker(
        UpdateDataPolicyRequest request) {
        return new SyncInvoker<UpdateDataPolicyRequest, UpdateDataPolicyResponse>(request,
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
     * @return UploadDataResponse
     */
    public UploadDataResponse uploadData(UploadDataRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.uploadData);
    }

    /**
     * 上传数据文件
     *
     * 上传数据文件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UploadDataRequest 请求对象
     * @return SyncInvoker<UploadDataRequest, UploadDataResponse>
     */
    public SyncInvoker<UploadDataRequest, UploadDataResponse> uploadDataInvoker(UploadDataRequest request) {
        return new SyncInvoker<UploadDataRequest, UploadDataResponse>(request, EiHealthMeta.uploadData, hcClient);
    }

    /**
     * 取消数据作业
     *
     * 取消数据作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CancelDataJobRequest 请求对象
     * @return CancelDataJobResponse
     */
    public CancelDataJobResponse cancelDataJob(CancelDataJobRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.cancelDataJob);
    }

    /**
     * 取消数据作业
     *
     * 取消数据作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CancelDataJobRequest 请求对象
     * @return SyncInvoker<CancelDataJobRequest, CancelDataJobResponse>
     */
    public SyncInvoker<CancelDataJobRequest, CancelDataJobResponse> cancelDataJobInvoker(CancelDataJobRequest request) {
        return new SyncInvoker<CancelDataJobRequest, CancelDataJobResponse>(request, EiHealthMeta.cancelDataJob,
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
     * @return DeleteDataJobResponse
     */
    public DeleteDataJobResponse deleteDataJob(DeleteDataJobRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.deleteDataJob);
    }

    /**
     * 删除数据作业
     *
     * 删除数据作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteDataJobRequest 请求对象
     * @return SyncInvoker<DeleteDataJobRequest, DeleteDataJobResponse>
     */
    public SyncInvoker<DeleteDataJobRequest, DeleteDataJobResponse> deleteDataJobInvoker(DeleteDataJobRequest request) {
        return new SyncInvoker<DeleteDataJobRequest, DeleteDataJobResponse>(request, EiHealthMeta.deleteDataJob,
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
     * @return DownloadDataJobLogResponse
     */
    public DownloadDataJobLogResponse downloadDataJobLog(DownloadDataJobLogRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.downloadDataJobLog);
    }

    /**
     * 下载数据作业执行日志
     *
     * 下载数据作业执行日志
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DownloadDataJobLogRequest 请求对象
     * @return SyncInvoker<DownloadDataJobLogRequest, DownloadDataJobLogResponse>
     */
    public SyncInvoker<DownloadDataJobLogRequest, DownloadDataJobLogResponse> downloadDataJobLogInvoker(
        DownloadDataJobLogRequest request) {
        return new SyncInvoker<DownloadDataJobLogRequest, DownloadDataJobLogResponse>(request,
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
     * @return ListCheckpointResponse
     */
    public ListCheckpointResponse listCheckpoint(ListCheckpointRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.listCheckpoint);
    }

    /**
     * 获取数据作业执行日志
     *
     * 获取数据作业执行日志
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListCheckpointRequest 请求对象
     * @return SyncInvoker<ListCheckpointRequest, ListCheckpointResponse>
     */
    public SyncInvoker<ListCheckpointRequest, ListCheckpointResponse> listCheckpointInvoker(
        ListCheckpointRequest request) {
        return new SyncInvoker<ListCheckpointRequest, ListCheckpointResponse>(request, EiHealthMeta.listCheckpoint,
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
     * @return ListDataJobResponse
     */
    public ListDataJobResponse listDataJob(ListDataJobRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.listDataJob);
    }

    /**
     * 获取数据作业列表
     *
     * 获取数据作业列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDataJobRequest 请求对象
     * @return SyncInvoker<ListDataJobRequest, ListDataJobResponse>
     */
    public SyncInvoker<ListDataJobRequest, ListDataJobResponse> listDataJobInvoker(ListDataJobRequest request) {
        return new SyncInvoker<ListDataJobRequest, ListDataJobResponse>(request, EiHealthMeta.listDataJob, hcClient);
    }

    /**
     * 重试数据作业
     *
     * 重试数据作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RetryDataJobRequest 请求对象
     * @return RetryDataJobResponse
     */
    public RetryDataJobResponse retryDataJob(RetryDataJobRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.retryDataJob);
    }

    /**
     * 重试数据作业
     *
     * 重试数据作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RetryDataJobRequest 请求对象
     * @return SyncInvoker<RetryDataJobRequest, RetryDataJobResponse>
     */
    public SyncInvoker<RetryDataJobRequest, RetryDataJobResponse> retryDataJobInvoker(RetryDataJobRequest request) {
        return new SyncInvoker<RetryDataJobRequest, RetryDataJobResponse>(request, EiHealthMeta.retryDataJob, hcClient);
    }

    /**
     * 获取数据作业详细信息
     *
     * 获取数据作业详细信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDataJobRequest 请求对象
     * @return ShowDataJobResponse
     */
    public ShowDataJobResponse showDataJob(ShowDataJobRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.showDataJob);
    }

    /**
     * 获取数据作业详细信息
     *
     * 获取数据作业详细信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDataJobRequest 请求对象
     * @return SyncInvoker<ShowDataJobRequest, ShowDataJobResponse>
     */
    public SyncInvoker<ShowDataJobRequest, ShowDataJobResponse> showDataJobInvoker(ShowDataJobRequest request) {
        return new SyncInvoker<ShowDataJobRequest, ShowDataJobResponse>(request, EiHealthMeta.showDataJob, hcClient);
    }

    /**
     * 插入单条数据
     *
     * 插入单条数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateDatabaseDataRequest 请求对象
     * @return CreateDatabaseDataResponse
     */
    public CreateDatabaseDataResponse createDatabaseData(CreateDatabaseDataRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.createDatabaseData);
    }

    /**
     * 插入单条数据
     *
     * 插入单条数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateDatabaseDataRequest 请求对象
     * @return SyncInvoker<CreateDatabaseDataRequest, CreateDatabaseDataResponse>
     */
    public SyncInvoker<CreateDatabaseDataRequest, CreateDatabaseDataResponse> createDatabaseDataInvoker(
        CreateDatabaseDataRequest request) {
        return new SyncInvoker<CreateDatabaseDataRequest, CreateDatabaseDataResponse>(request,
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
     * @return CreateInstanceResponse
     */
    public CreateInstanceResponse createInstance(CreateInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.createInstance);
    }

    /**
     * 创建数据库实例
     *
     * 创建数据库实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateInstanceRequest 请求对象
     * @return SyncInvoker<CreateInstanceRequest, CreateInstanceResponse>
     */
    public SyncInvoker<CreateInstanceRequest, CreateInstanceResponse> createInstanceInvoker(
        CreateInstanceRequest request) {
        return new SyncInvoker<CreateInstanceRequest, CreateInstanceResponse>(request, EiHealthMeta.createInstance,
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
     * @return DeleteDatabaseDataResponse
     */
    public DeleteDatabaseDataResponse deleteDatabaseData(DeleteDatabaseDataRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.deleteDatabaseData);
    }

    /**
     * 删除数据
     *
     * 删除指定行数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteDatabaseDataRequest 请求对象
     * @return SyncInvoker<DeleteDatabaseDataRequest, DeleteDatabaseDataResponse>
     */
    public SyncInvoker<DeleteDatabaseDataRequest, DeleteDatabaseDataResponse> deleteDatabaseDataInvoker(
        DeleteDatabaseDataRequest request) {
        return new SyncInvoker<DeleteDatabaseDataRequest, DeleteDatabaseDataResponse>(request,
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
     * @return DeleteInstanceResponse
     */
    public DeleteInstanceResponse deleteInstance(DeleteInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.deleteInstance);
    }

    /**
     * 删除实例
     *
     * 删除实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteInstanceRequest 请求对象
     * @return SyncInvoker<DeleteInstanceRequest, DeleteInstanceResponse>
     */
    public SyncInvoker<DeleteInstanceRequest, DeleteInstanceResponse> deleteInstanceInvoker(
        DeleteInstanceRequest request) {
        return new SyncInvoker<DeleteInstanceRequest, DeleteInstanceResponse>(request, EiHealthMeta.deleteInstance,
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
     * @return ImportDatabaseDataResponse
     */
    public ImportDatabaseDataResponse importDatabaseData(ImportDatabaseDataRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.importDatabaseData);
    }

    /**
     * 导入数据
     *
     * 导入数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ImportDatabaseDataRequest 请求对象
     * @return SyncInvoker<ImportDatabaseDataRequest, ImportDatabaseDataResponse>
     */
    public SyncInvoker<ImportDatabaseDataRequest, ImportDatabaseDataResponse> importDatabaseDataInvoker(
        ImportDatabaseDataRequest request) {
        return new SyncInvoker<ImportDatabaseDataRequest, ImportDatabaseDataResponse>(request,
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
     * @return ListDatabaseDataResponse
     */
    public ListDatabaseDataResponse listDatabaseData(ListDatabaseDataRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.listDatabaseData);
    }

    /**
     * 查询数据
     *
     * 查询数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDatabaseDataRequest 请求对象
     * @return SyncInvoker<ListDatabaseDataRequest, ListDatabaseDataResponse>
     */
    public SyncInvoker<ListDatabaseDataRequest, ListDatabaseDataResponse> listDatabaseDataInvoker(
        ListDatabaseDataRequest request) {
        return new SyncInvoker<ListDatabaseDataRequest, ListDatabaseDataResponse>(request,
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
     * @return ListInstanceResponse
     */
    public ListInstanceResponse listInstance(ListInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.listInstance);
    }

    /**
     * 获取实例列表
     *
     * 获取实例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListInstanceRequest 请求对象
     * @return SyncInvoker<ListInstanceRequest, ListInstanceResponse>
     */
    public SyncInvoker<ListInstanceRequest, ListInstanceResponse> listInstanceInvoker(ListInstanceRequest request) {
        return new SyncInvoker<ListInstanceRequest, ListInstanceResponse>(request, EiHealthMeta.listInstance, hcClient);
    }

    /**
     * 引用数据库实例
     *
     * 引用数据库实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param QuoteInstanceRequest 请求对象
     * @return QuoteInstanceResponse
     */
    public QuoteInstanceResponse quoteInstance(QuoteInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.quoteInstance);
    }

    /**
     * 引用数据库实例
     *
     * 引用数据库实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param QuoteInstanceRequest 请求对象
     * @return SyncInvoker<QuoteInstanceRequest, QuoteInstanceResponse>
     */
    public SyncInvoker<QuoteInstanceRequest, QuoteInstanceResponse> quoteInstanceInvoker(QuoteInstanceRequest request) {
        return new SyncInvoker<QuoteInstanceRequest, QuoteInstanceResponse>(request, EiHealthMeta.quoteInstance,
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
     * @return ShowInstanceResponse
     */
    public ShowInstanceResponse showInstance(ShowInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.showInstance);
    }

    /**
     * 查询实例详情
     *
     * 查询实例详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowInstanceRequest 请求对象
     * @return SyncInvoker<ShowInstanceRequest, ShowInstanceResponse>
     */
    public SyncInvoker<ShowInstanceRequest, ShowInstanceResponse> showInstanceInvoker(ShowInstanceRequest request) {
        return new SyncInvoker<ShowInstanceRequest, ShowInstanceResponse>(request, EiHealthMeta.showInstance, hcClient);
    }

    /**
     * 更新数据
     *
     * 更新数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateDatabaseDataRequest 请求对象
     * @return UpdateDatabaseDataResponse
     */
    public UpdateDatabaseDataResponse updateDatabaseData(UpdateDatabaseDataRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.updateDatabaseData);
    }

    /**
     * 更新数据
     *
     * 更新数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateDatabaseDataRequest 请求对象
     * @return SyncInvoker<UpdateDatabaseDataRequest, UpdateDatabaseDataResponse>
     */
    public SyncInvoker<UpdateDatabaseDataRequest, UpdateDatabaseDataResponse> updateDatabaseDataInvoker(
        UpdateDatabaseDataRequest request) {
        return new SyncInvoker<UpdateDatabaseDataRequest, UpdateDatabaseDataResponse>(request,
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
     * @return CreateDatabaseResourceResponse
     */
    public CreateDatabaseResourceResponse createDatabaseResource(CreateDatabaseResourceRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.createDatabaseResource);
    }

    /**
     * 购买数据库资源
     *
     * 购买数据库资源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateDatabaseResourceRequest 请求对象
     * @return SyncInvoker<CreateDatabaseResourceRequest, CreateDatabaseResourceResponse>
     */
    public SyncInvoker<CreateDatabaseResourceRequest, CreateDatabaseResourceResponse> createDatabaseResourceInvoker(
        CreateDatabaseResourceRequest request) {
        return new SyncInvoker<CreateDatabaseResourceRequest, CreateDatabaseResourceResponse>(request,
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
     * @return DeleteDatabaseResourceResponse
     */
    public DeleteDatabaseResourceResponse deleteDatabaseResource(DeleteDatabaseResourceRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.deleteDatabaseResource);
    }

    /**
     * 删除数据库资源
     *
     * 删除数据库资源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteDatabaseResourceRequest 请求对象
     * @return SyncInvoker<DeleteDatabaseResourceRequest, DeleteDatabaseResourceResponse>
     */
    public SyncInvoker<DeleteDatabaseResourceRequest, DeleteDatabaseResourceResponse> deleteDatabaseResourceInvoker(
        DeleteDatabaseResourceRequest request) {
        return new SyncInvoker<DeleteDatabaseResourceRequest, DeleteDatabaseResourceResponse>(request,
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
     * @return ListDatabaseResourceResponse
     */
    public ListDatabaseResourceResponse listDatabaseResource(ListDatabaseResourceRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.listDatabaseResource);
    }

    /**
     * 查询数据库资源
     *
     * 查询数据库资源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDatabaseResourceRequest 请求对象
     * @return SyncInvoker<ListDatabaseResourceRequest, ListDatabaseResourceResponse>
     */
    public SyncInvoker<ListDatabaseResourceRequest, ListDatabaseResourceResponse> listDatabaseResourceInvoker(
        ListDatabaseResourceRequest request) {
        return new SyncInvoker<ListDatabaseResourceRequest, ListDatabaseResourceResponse>(request,
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
     * @return ListDatabaseResourceFlavorResponse
     */
    public ListDatabaseResourceFlavorResponse listDatabaseResourceFlavor(ListDatabaseResourceFlavorRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.listDatabaseResourceFlavor);
    }

    /**
     * 获取数据库资源规格列表
     *
     * 获取数据库资源规格列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDatabaseResourceFlavorRequest 请求对象
     * @return SyncInvoker<ListDatabaseResourceFlavorRequest, ListDatabaseResourceFlavorResponse>
     */
    public SyncInvoker<ListDatabaseResourceFlavorRequest, ListDatabaseResourceFlavorResponse> listDatabaseResourceFlavorInvoker(
        ListDatabaseResourceFlavorRequest request) {
        return new SyncInvoker<ListDatabaseResourceFlavorRequest, ListDatabaseResourceFlavorResponse>(request,
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
     * @return BatchDeleteTagResponse
     */
    public BatchDeleteTagResponse batchDeleteTag(BatchDeleteTagRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.batchDeleteTag);
    }

    /**
     * 批量删除镜像tag
     *
     * 批量删除镜像tag
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchDeleteTagRequest 请求对象
     * @return SyncInvoker<BatchDeleteTagRequest, BatchDeleteTagResponse>
     */
    public SyncInvoker<BatchDeleteTagRequest, BatchDeleteTagResponse> batchDeleteTagInvoker(
        BatchDeleteTagRequest request) {
        return new SyncInvoker<BatchDeleteTagRequest, BatchDeleteTagResponse>(request, EiHealthMeta.batchDeleteTag,
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
     * @return CreateImageResponse
     */
    public CreateImageResponse createImage(CreateImageRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.createImage);
    }

    /**
     * 创建镜像
     *
     * 创建镜像
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateImageRequest 请求对象
     * @return SyncInvoker<CreateImageRequest, CreateImageResponse>
     */
    public SyncInvoker<CreateImageRequest, CreateImageResponse> createImageInvoker(CreateImageRequest request) {
        return new SyncInvoker<CreateImageRequest, CreateImageResponse>(request, EiHealthMeta.createImage, hcClient);
    }

    /**
     * 删除镜像仓库
     *
     * 删除镜像仓库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteImageRequest 请求对象
     * @return DeleteImageResponse
     */
    public DeleteImageResponse deleteImage(DeleteImageRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.deleteImage);
    }

    /**
     * 删除镜像仓库
     *
     * 删除镜像仓库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteImageRequest 请求对象
     * @return SyncInvoker<DeleteImageRequest, DeleteImageResponse>
     */
    public SyncInvoker<DeleteImageRequest, DeleteImageResponse> deleteImageInvoker(DeleteImageRequest request) {
        return new SyncInvoker<DeleteImageRequest, DeleteImageResponse>(request, EiHealthMeta.deleteImage, hcClient);
    }

    /**
     * 删除指定镜像tag
     *
     * 删除指定镜像tag
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteTagRequest 请求对象
     * @return DeleteTagResponse
     */
    public DeleteTagResponse deleteTag(DeleteTagRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.deleteTag);
    }

    /**
     * 删除指定镜像tag
     *
     * 删除指定镜像tag
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteTagRequest 请求对象
     * @return SyncInvoker<DeleteTagRequest, DeleteTagResponse>
     */
    public SyncInvoker<DeleteTagRequest, DeleteTagResponse> deleteTagInvoker(DeleteTagRequest request) {
        return new SyncInvoker<DeleteTagRequest, DeleteTagResponse>(request, EiHealthMeta.deleteTag, hcClient);
    }

    /**
     * 导入镜像
     *
     * 导入镜像
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ImportImageRequest 请求对象
     * @return ImportImageResponse
     */
    public ImportImageResponse importImage(ImportImageRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.importImage);
    }

    /**
     * 导入镜像
     *
     * 导入镜像
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ImportImageRequest 请求对象
     * @return SyncInvoker<ImportImageRequest, ImportImageResponse>
     */
    public SyncInvoker<ImportImageRequest, ImportImageResponse> importImageInvoker(ImportImageRequest request) {
        return new SyncInvoker<ImportImageRequest, ImportImageResponse>(request, EiHealthMeta.importImage, hcClient);
    }

    /**
     * 获取镜像列表
     *
     * 获取镜像列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListImageRequest 请求对象
     * @return ListImageResponse
     */
    public ListImageResponse listImage(ListImageRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.listImage);
    }

    /**
     * 获取镜像列表
     *
     * 获取镜像列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListImageRequest 请求对象
     * @return SyncInvoker<ListImageRequest, ListImageResponse>
     */
    public SyncInvoker<ListImageRequest, ListImageResponse> listImageInvoker(ListImageRequest request) {
        return new SyncInvoker<ListImageRequest, ListImageResponse>(request, EiHealthMeta.listImage, hcClient);
    }

    /**
     * 获取指定镜像的tag列表
     *
     * 获取指定镜像的tag列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListImageTagRequest 请求对象
     * @return ListImageTagResponse
     */
    public ListImageTagResponse listImageTag(ListImageTagRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.listImageTag);
    }

    /**
     * 获取指定镜像的tag列表
     *
     * 获取指定镜像的tag列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListImageTagRequest 请求对象
     * @return SyncInvoker<ListImageTagRequest, ListImageTagResponse>
     */
    public SyncInvoker<ListImageTagRequest, ListImageTagResponse> listImageTagInvoker(ListImageTagRequest request) {
        return new SyncInvoker<ListImageTagRequest, ListImageTagResponse>(request, EiHealthMeta.listImageTag, hcClient);
    }

    /**
     * 发布镜像
     *
     * 发布镜像
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param PublishImageRequest 请求对象
     * @return PublishImageResponse
     */
    public PublishImageResponse publishImage(PublishImageRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.publishImage);
    }

    /**
     * 发布镜像
     *
     * 发布镜像
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param PublishImageRequest 请求对象
     * @return SyncInvoker<PublishImageRequest, PublishImageResponse>
     */
    public SyncInvoker<PublishImageRequest, PublishImageResponse> publishImageInvoker(PublishImageRequest request) {
        return new SyncInvoker<PublishImageRequest, PublishImageResponse>(request, EiHealthMeta.publishImage, hcClient);
    }

    /**
     * 获取docker login指令
     *
     * 获取docker login指令
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDockerLoginRequest 请求对象
     * @return ShowDockerLoginResponse
     */
    public ShowDockerLoginResponse showDockerLogin(ShowDockerLoginRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.showDockerLogin);
    }

    /**
     * 获取docker login指令
     *
     * 获取docker login指令
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDockerLoginRequest 请求对象
     * @return SyncInvoker<ShowDockerLoginRequest, ShowDockerLoginResponse>
     */
    public SyncInvoker<ShowDockerLoginRequest, ShowDockerLoginResponse> showDockerLoginInvoker(
        ShowDockerLoginRequest request) {
        return new SyncInvoker<ShowDockerLoginRequest, ShowDockerLoginResponse>(request, EiHealthMeta.showDockerLogin,
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
     * @return SubscribeImageResponse
     */
    public SubscribeImageResponse subscribeImage(SubscribeImageRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.subscribeImage);
    }

    /**
     * 订阅镜像
     *
     * 订阅镜像
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SubscribeImageRequest 请求对象
     * @return SyncInvoker<SubscribeImageRequest, SubscribeImageResponse>
     */
    public SyncInvoker<SubscribeImageRequest, SubscribeImageResponse> subscribeImageInvoker(
        SubscribeImageRequest request) {
        return new SyncInvoker<SubscribeImageRequest, SubscribeImageResponse>(request, EiHealthMeta.subscribeImage,
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
     * @return UpdateImageResponse
     */
    public UpdateImageResponse updateImage(UpdateImageRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.updateImage);
    }

    /**
     * 更新镜像描述信息或者类型
     *
     * 更新镜像描述信息或者类型
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateImageRequest 请求对象
     * @return SyncInvoker<UpdateImageRequest, UpdateImageResponse>
     */
    public SyncInvoker<UpdateImageRequest, UpdateImageResponse> updateImageInvoker(UpdateImageRequest request) {
        return new SyncInvoker<UpdateImageRequest, UpdateImageResponse>(request, EiHealthMeta.updateImage, hcClient);
    }

    /**
     * 获取作业配置
     *
     * 获取作业配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowJobConfigRequest 请求对象
     * @return ShowJobConfigResponse
     */
    public ShowJobConfigResponse showJobConfig(ShowJobConfigRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.showJobConfig);
    }

    /**
     * 获取作业配置
     *
     * 获取作业配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowJobConfigRequest 请求对象
     * @return SyncInvoker<ShowJobConfigRequest, ShowJobConfigResponse>
     */
    public SyncInvoker<ShowJobConfigRequest, ShowJobConfigResponse> showJobConfigInvoker(ShowJobConfigRequest request) {
        return new SyncInvoker<ShowJobConfigRequest, ShowJobConfigResponse>(request, EiHealthMeta.showJobConfig,
            hcClient);
    }

    /**
     * 设置作业配置
     *
     * 设置作业配置，目前支持修改作业保存条数(1万条-1000万条)，默认设置为500万条；
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateJobConfigRequest 请求对象
     * @return UpdateJobConfigResponse
     */
    public UpdateJobConfigResponse updateJobConfig(UpdateJobConfigRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.updateJobConfig);
    }

    /**
     * 设置作业配置
     *
     * 设置作业配置，目前支持修改作业保存条数(1万条-1000万条)，默认设置为500万条；
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateJobConfigRequest 请求对象
     * @return SyncInvoker<UpdateJobConfigRequest, UpdateJobConfigResponse>
     */
    public SyncInvoker<UpdateJobConfigRequest, UpdateJobConfigResponse> updateJobConfigInvoker(
        UpdateJobConfigRequest request) {
        return new SyncInvoker<UpdateJobConfigRequest, UpdateJobConfigResponse>(request, EiHealthMeta.updateJobConfig,
            hcClient);
    }

    /**
     * 批量取消作业
     *
     * 批量取消作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchCancelJobRequest 请求对象
     * @return BatchCancelJobResponse
     */
    public BatchCancelJobResponse batchCancelJob(BatchCancelJobRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.batchCancelJob);
    }

    /**
     * 批量取消作业
     *
     * 批量取消作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchCancelJobRequest 请求对象
     * @return SyncInvoker<BatchCancelJobRequest, BatchCancelJobResponse>
     */
    public SyncInvoker<BatchCancelJobRequest, BatchCancelJobResponse> batchCancelJobInvoker(
        BatchCancelJobRequest request) {
        return new SyncInvoker<BatchCancelJobRequest, BatchCancelJobResponse>(request, EiHealthMeta.batchCancelJob,
            hcClient);
    }

    /**
     * 批量删除作业
     *
     * 批量删除作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchDeleteJobRequest 请求对象
     * @return BatchDeleteJobResponse
     */
    public BatchDeleteJobResponse batchDeleteJob(BatchDeleteJobRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.batchDeleteJob);
    }

    /**
     * 批量删除作业
     *
     * 批量删除作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchDeleteJobRequest 请求对象
     * @return SyncInvoker<BatchDeleteJobRequest, BatchDeleteJobResponse>
     */
    public SyncInvoker<BatchDeleteJobRequest, BatchDeleteJobResponse> batchDeleteJobInvoker(
        BatchDeleteJobRequest request) {
        return new SyncInvoker<BatchDeleteJobRequest, BatchDeleteJobResponse>(request, EiHealthMeta.batchDeleteJob,
            hcClient);
    }

    /**
     * 批量重试作业
     *
     * 批量重试作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchRetryJobRequest 请求对象
     * @return BatchRetryJobResponse
     */
    public BatchRetryJobResponse batchRetryJob(BatchRetryJobRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.batchRetryJob);
    }

    /**
     * 批量重试作业
     *
     * 批量重试作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchRetryJobRequest 请求对象
     * @return SyncInvoker<BatchRetryJobRequest, BatchRetryJobResponse>
     */
    public SyncInvoker<BatchRetryJobRequest, BatchRetryJobResponse> batchRetryJobInvoker(BatchRetryJobRequest request) {
        return new SyncInvoker<BatchRetryJobRequest, BatchRetryJobResponse>(request, EiHealthMeta.batchRetryJob,
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
     * @return CancelJobResponse
     */
    public CancelJobResponse cancelJob(CancelJobRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.cancelJob);
    }

    /**
     * 取消或强制停止作业调度
     *
     * 取消或强制作业调度
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CancelJobRequest 请求对象
     * @return SyncInvoker<CancelJobRequest, CancelJobResponse>
     */
    public SyncInvoker<CancelJobRequest, CancelJobResponse> cancelJobInvoker(CancelJobRequest request) {
        return new SyncInvoker<CancelJobRequest, CancelJobResponse>(request, EiHealthMeta.cancelJob, hcClient);
    }

    /**
     * 删除作业
     *
     * 删除作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteJobRequest 请求对象
     * @return DeleteJobResponse
     */
    public DeleteJobResponse deleteJob(DeleteJobRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.deleteJob);
    }

    /**
     * 删除作业
     *
     * 删除作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteJobRequest 请求对象
     * @return SyncInvoker<DeleteJobRequest, DeleteJobResponse>
     */
    public SyncInvoker<DeleteJobRequest, DeleteJobResponse> deleteJobInvoker(DeleteJobRequest request) {
        return new SyncInvoker<DeleteJobRequest, DeleteJobResponse>(request, EiHealthMeta.deleteJob, hcClient);
    }

    /**
     * 启动作业
     *
     * 启动作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ExecuteJobRequest 请求对象
     * @return ExecuteJobResponse
     */
    public ExecuteJobResponse executeJob(ExecuteJobRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.executeJob);
    }

    /**
     * 启动作业
     *
     * 启动作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ExecuteJobRequest 请求对象
     * @return SyncInvoker<ExecuteJobRequest, ExecuteJobResponse>
     */
    public SyncInvoker<ExecuteJobRequest, ExecuteJobResponse> executeJobInvoker(ExecuteJobRequest request) {
        return new SyncInvoker<ExecuteJobRequest, ExecuteJobResponse>(request, EiHealthMeta.executeJob, hcClient);
    }

    /**
     * 获取作业列表
     *
     * 获取作业列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListJobRequest 请求对象
     * @return ListJobResponse
     */
    public ListJobResponse listJob(ListJobRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.listJob);
    }

    /**
     * 获取作业列表
     *
     * 获取作业列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListJobRequest 请求对象
     * @return SyncInvoker<ListJobRequest, ListJobResponse>
     */
    public SyncInvoker<ListJobRequest, ListJobResponse> listJobInvoker(ListJobRequest request) {
        return new SyncInvoker<ListJobRequest, ListJobResponse>(request, EiHealthMeta.listJob, hcClient);
    }

    /**
     * 重试作业
     *
     * 重试作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RetryJobRequest 请求对象
     * @return RetryJobResponse
     */
    public RetryJobResponse retryJob(RetryJobRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.retryJob);
    }

    /**
     * 重试作业
     *
     * 重试作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RetryJobRequest 请求对象
     * @return SyncInvoker<RetryJobRequest, RetryJobResponse>
     */
    public SyncInvoker<RetryJobRequest, RetryJobResponse> retryJobInvoker(RetryJobRequest request) {
        return new SyncInvoker<RetryJobRequest, RetryJobResponse>(request, EiHealthMeta.retryJob, hcClient);
    }

    /**
     * 获取作业详情
     *
     * 获取作业详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowJobRequest 请求对象
     * @return ShowJobResponse
     */
    public ShowJobResponse showJob(ShowJobRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.showJob);
    }

    /**
     * 获取作业详情
     *
     * 获取作业详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowJobRequest 请求对象
     * @return SyncInvoker<ShowJobRequest, ShowJobResponse>
     */
    public SyncInvoker<ShowJobRequest, ShowJobResponse> showJobInvoker(ShowJobRequest request) {
        return new SyncInvoker<ShowJobRequest, ShowJobResponse>(request, EiHealthMeta.showJob, hcClient);
    }

    /**
     * 获取作业事件
     *
     * 获取作业事件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowJobEventRequest 请求对象
     * @return ShowJobEventResponse
     */
    public ShowJobEventResponse showJobEvent(ShowJobEventRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.showJobEvent);
    }

    /**
     * 获取作业事件
     *
     * 获取作业事件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowJobEventRequest 请求对象
     * @return SyncInvoker<ShowJobEventRequest, ShowJobEventResponse>
     */
    public SyncInvoker<ShowJobEventRequest, ShowJobEventResponse> showJobEventInvoker(ShowJobEventRequest request) {
        return new SyncInvoker<ShowJobEventRequest, ShowJobEventResponse>(request, EiHealthMeta.showJobEvent, hcClient);
    }

    /**
     * 获取作业日志
     *
     * 获取作业日志
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowJobLogRequest 请求对象
     * @return ShowJobLogResponse
     */
    public ShowJobLogResponse showJobLog(ShowJobLogRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.showJobLog);
    }

    /**
     * 获取作业日志
     *
     * 获取作业日志
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowJobLogRequest 请求对象
     * @return SyncInvoker<ShowJobLogRequest, ShowJobLogResponse>
     */
    public SyncInvoker<ShowJobLogRequest, ShowJobLogResponse> showJobLogInvoker(ShowJobLogRequest request) {
        return new SyncInvoker<ShowJobLogRequest, ShowJobLogResponse>(request, EiHealthMeta.showJobLog, hcClient);
    }

    /**
     * 获取子任务启动事件
     *
     * 获取子任务启动事件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowTaskEventsRequest 请求对象
     * @return ShowTaskEventsResponse
     */
    public ShowTaskEventsResponse showTaskEvents(ShowTaskEventsRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.showTaskEvents);
    }

    /**
     * 获取子任务启动事件
     *
     * 获取子任务启动事件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowTaskEventsRequest 请求对象
     * @return SyncInvoker<ShowTaskEventsRequest, ShowTaskEventsResponse>
     */
    public SyncInvoker<ShowTaskEventsRequest, ShowTaskEventsResponse> showTaskEventsInvoker(
        ShowTaskEventsRequest request) {
        return new SyncInvoker<ShowTaskEventsRequest, ShowTaskEventsResponse>(request, EiHealthMeta.showTaskEvents,
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
     * @return ShowTaskInstanceEventsResponse
     */
    public ShowTaskInstanceEventsResponse showTaskInstanceEvents(ShowTaskInstanceEventsRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.showTaskInstanceEvents);
    }

    /**
     * 获取子任务中实例的事件
     *
     * 获取子任务中实例的事件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowTaskInstanceEventsRequest 请求对象
     * @return SyncInvoker<ShowTaskInstanceEventsRequest, ShowTaskInstanceEventsResponse>
     */
    public SyncInvoker<ShowTaskInstanceEventsRequest, ShowTaskInstanceEventsResponse> showTaskInstanceEventsInvoker(
        ShowTaskInstanceEventsRequest request) {
        return new SyncInvoker<ShowTaskInstanceEventsRequest, ShowTaskInstanceEventsResponse>(request,
            EiHealthMeta.showTaskInstanceEvents, hcClient);
    }

    /**
     * 获取子任务中实例的资源监控数据
     *
     * 获取子任务中实例的资源监控数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowTaskInstanceMetricDataRequest 请求对象
     * @return ShowTaskInstanceMetricDataResponse
     */
    public ShowTaskInstanceMetricDataResponse showTaskInstanceMetricData(ShowTaskInstanceMetricDataRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.showTaskInstanceMetricData);
    }

    /**
     * 获取子任务中实例的资源监控数据
     *
     * 获取子任务中实例的资源监控数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowTaskInstanceMetricDataRequest 请求对象
     * @return SyncInvoker<ShowTaskInstanceMetricDataRequest, ShowTaskInstanceMetricDataResponse>
     */
    public SyncInvoker<ShowTaskInstanceMetricDataRequest, ShowTaskInstanceMetricDataResponse> showTaskInstanceMetricDataInvoker(
        ShowTaskInstanceMetricDataRequest request) {
        return new SyncInvoker<ShowTaskInstanceMetricDataRequest, ShowTaskInstanceMetricDataResponse>(request,
            EiHealthMeta.showTaskInstanceMetricData, hcClient);
    }

    /**
     * 获取子任务中实例的pod信息
     *
     * 获取子任务中实例的pod信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowTaskInstancePodRequest 请求对象
     * @return ShowTaskInstancePodResponse
     */
    public ShowTaskInstancePodResponse showTaskInstancePod(ShowTaskInstancePodRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.showTaskInstancePod);
    }

    /**
     * 获取子任务中实例的pod信息
     *
     * 获取子任务中实例的pod信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowTaskInstancePodRequest 请求对象
     * @return SyncInvoker<ShowTaskInstancePodRequest, ShowTaskInstancePodResponse>
     */
    public SyncInvoker<ShowTaskInstancePodRequest, ShowTaskInstancePodResponse> showTaskInstancePodInvoker(
        ShowTaskInstancePodRequest request) {
        return new SyncInvoker<ShowTaskInstancePodRequest, ShowTaskInstancePodResponse>(request,
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
     * @return ShowTaskInstancesResponse
     */
    public ShowTaskInstancesResponse showTaskInstances(ShowTaskInstancesRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.showTaskInstances);
    }

    /**
     * 获取子任务实例信息
     *
     * 获取子任务实例信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowTaskInstancesRequest 请求对象
     * @return SyncInvoker<ShowTaskInstancesRequest, ShowTaskInstancesResponse>
     */
    public SyncInvoker<ShowTaskInstancesRequest, ShowTaskInstancesResponse> showTaskInstancesInvoker(
        ShowTaskInstancesRequest request) {
        return new SyncInvoker<ShowTaskInstancesRequest, ShowTaskInstancesResponse>(request,
            EiHealthMeta.showTaskInstances, hcClient);
    }

    /**
     * 更新作业
     *
     * 更新作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateJobRequest 请求对象
     * @return UpdateJobResponse
     */
    public UpdateJobResponse updateJob(UpdateJobRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.updateJob);
    }

    /**
     * 更新作业
     *
     * 更新作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateJobRequest 请求对象
     * @return SyncInvoker<UpdateJobRequest, UpdateJobResponse>
     */
    public SyncInvoker<UpdateJobRequest, UpdateJobResponse> updateJobInvoker(UpdateJobRequest request) {
        return new SyncInvoker<UpdateJobRequest, UpdateJobResponse>(request, EiHealthMeta.updateJob, hcClient);
    }

    /**
     * 批量删除标签
     *
     * 批量删除标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchDeleteLabelRequest 请求对象
     * @return BatchDeleteLabelResponse
     */
    public BatchDeleteLabelResponse batchDeleteLabel(BatchDeleteLabelRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.batchDeleteLabel);
    }

    /**
     * 批量删除标签
     *
     * 批量删除标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchDeleteLabelRequest 请求对象
     * @return SyncInvoker<BatchDeleteLabelRequest, BatchDeleteLabelResponse>
     */
    public SyncInvoker<BatchDeleteLabelRequest, BatchDeleteLabelResponse> batchDeleteLabelInvoker(
        BatchDeleteLabelRequest request) {
        return new SyncInvoker<BatchDeleteLabelRequest, BatchDeleteLabelResponse>(request,
            EiHealthMeta.batchDeleteLabel, hcClient);
    }

    /**
     * 创建标签
     *
     * 创建标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateLabelRequest 请求对象
     * @return CreateLabelResponse
     */
    public CreateLabelResponse createLabel(CreateLabelRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.createLabel);
    }

    /**
     * 创建标签
     *
     * 创建标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateLabelRequest 请求对象
     * @return SyncInvoker<CreateLabelRequest, CreateLabelResponse>
     */
    public SyncInvoker<CreateLabelRequest, CreateLabelResponse> createLabelInvoker(CreateLabelRequest request) {
        return new SyncInvoker<CreateLabelRequest, CreateLabelResponse>(request, EiHealthMeta.createLabel, hcClient);
    }

    /**
     * 删除标签
     *
     * 删除标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteLabelRequest 请求对象
     * @return DeleteLabelResponse
     */
    public DeleteLabelResponse deleteLabel(DeleteLabelRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.deleteLabel);
    }

    /**
     * 删除标签
     *
     * 删除标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteLabelRequest 请求对象
     * @return SyncInvoker<DeleteLabelRequest, DeleteLabelResponse>
     */
    public SyncInvoker<DeleteLabelRequest, DeleteLabelResponse> deleteLabelInvoker(DeleteLabelRequest request) {
        return new SyncInvoker<DeleteLabelRequest, DeleteLabelResponse>(request, EiHealthMeta.deleteLabel, hcClient);
    }

    /**
     * 获取标签列表
     *
     * 获取标签列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListLabelRequest 请求对象
     * @return ListLabelResponse
     */
    public ListLabelResponse listLabel(ListLabelRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.listLabel);
    }

    /**
     * 获取标签列表
     *
     * 获取标签列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListLabelRequest 请求对象
     * @return SyncInvoker<ListLabelRequest, ListLabelResponse>
     */
    public SyncInvoker<ListLabelRequest, ListLabelResponse> listLabelInvoker(ListLabelRequest request) {
        return new SyncInvoker<ListLabelRequest, ListLabelResponse>(request, EiHealthMeta.listLabel, hcClient);
    }

    /**
     * 创建标签页面
     *
     * 创建标签页面
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateLabelPageRequest 请求对象
     * @return CreateLabelPageResponse
     */
    public CreateLabelPageResponse createLabelPage(CreateLabelPageRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.createLabelPage);
    }

    /**
     * 创建标签页面
     *
     * 创建标签页面
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateLabelPageRequest 请求对象
     * @return SyncInvoker<CreateLabelPageRequest, CreateLabelPageResponse>
     */
    public SyncInvoker<CreateLabelPageRequest, CreateLabelPageResponse> createLabelPageInvoker(
        CreateLabelPageRequest request) {
        return new SyncInvoker<CreateLabelPageRequest, CreateLabelPageResponse>(request, EiHealthMeta.createLabelPage,
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
     * @return DeleteLabelPageResponse
     */
    public DeleteLabelPageResponse deleteLabelPage(DeleteLabelPageRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.deleteLabelPage);
    }

    /**
     * 删除标签页面
     *
     * 删除标签页面
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteLabelPageRequest 请求对象
     * @return SyncInvoker<DeleteLabelPageRequest, DeleteLabelPageResponse>
     */
    public SyncInvoker<DeleteLabelPageRequest, DeleteLabelPageResponse> deleteLabelPageInvoker(
        DeleteLabelPageRequest request) {
        return new SyncInvoker<DeleteLabelPageRequest, DeleteLabelPageResponse>(request, EiHealthMeta.deleteLabelPage,
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
     * @return ListLabelPageResponse
     */
    public ListLabelPageResponse listLabelPage(ListLabelPageRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.listLabelPage);
    }

    /**
     * 获取标签页面列表
     *
     * 获取标签页面列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListLabelPageRequest 请求对象
     * @return SyncInvoker<ListLabelPageRequest, ListLabelPageResponse>
     */
    public SyncInvoker<ListLabelPageRequest, ListLabelPageResponse> listLabelPageInvoker(ListLabelPageRequest request) {
        return new SyncInvoker<ListLabelPageRequest, ListLabelPageResponse>(request, EiHealthMeta.listLabelPage,
            hcClient);
    }

    /**
     * 批量删除通知消息
     *
     * 批量删除通知消息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchDeleteNoticeRequest 请求对象
     * @return BatchDeleteNoticeResponse
     */
    public BatchDeleteNoticeResponse batchDeleteNotice(BatchDeleteNoticeRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.batchDeleteNotice);
    }

    /**
     * 批量删除通知消息
     *
     * 批量删除通知消息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchDeleteNoticeRequest 请求对象
     * @return SyncInvoker<BatchDeleteNoticeRequest, BatchDeleteNoticeResponse>
     */
    public SyncInvoker<BatchDeleteNoticeRequest, BatchDeleteNoticeResponse> batchDeleteNoticeInvoker(
        BatchDeleteNoticeRequest request) {
        return new SyncInvoker<BatchDeleteNoticeRequest, BatchDeleteNoticeResponse>(request,
            EiHealthMeta.batchDeleteNotice, hcClient);
    }

    /**
     * 批量更新消息
     *
     * 批量更新消息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchUpdateNoticeRequest 请求对象
     * @return BatchUpdateNoticeResponse
     */
    public BatchUpdateNoticeResponse batchUpdateNotice(BatchUpdateNoticeRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.batchUpdateNotice);
    }

    /**
     * 批量更新消息
     *
     * 批量更新消息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchUpdateNoticeRequest 请求对象
     * @return SyncInvoker<BatchUpdateNoticeRequest, BatchUpdateNoticeResponse>
     */
    public SyncInvoker<BatchUpdateNoticeRequest, BatchUpdateNoticeResponse> batchUpdateNoticeInvoker(
        BatchUpdateNoticeRequest request) {
        return new SyncInvoker<BatchUpdateNoticeRequest, BatchUpdateNoticeResponse>(request,
            EiHealthMeta.batchUpdateNotice, hcClient);
    }

    /**
     * 邮箱连通性测试
     *
     * 邮箱连通性测试
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CheckEmailConnectionRequest 请求对象
     * @return CheckEmailConnectionResponse
     */
    public CheckEmailConnectionResponse checkEmailConnection(CheckEmailConnectionRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.checkEmailConnection);
    }

    /**
     * 邮箱连通性测试
     *
     * 邮箱连通性测试
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CheckEmailConnectionRequest 请求对象
     * @return SyncInvoker<CheckEmailConnectionRequest, CheckEmailConnectionResponse>
     */
    public SyncInvoker<CheckEmailConnectionRequest, CheckEmailConnectionResponse> checkEmailConnectionInvoker(
        CheckEmailConnectionRequest request) {
        return new SyncInvoker<CheckEmailConnectionRequest, CheckEmailConnectionResponse>(request,
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
     * @return DeleteMessageEmailConfigResponse
     */
    public DeleteMessageEmailConfigResponse deleteMessageEmailConfig(DeleteMessageEmailConfigRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.deleteMessageEmailConfig);
    }

    /**
     * 删除消息邮件配置
     *
     * 删除消息邮件配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteMessageEmailConfigRequest 请求对象
     * @return SyncInvoker<DeleteMessageEmailConfigRequest, DeleteMessageEmailConfigResponse>
     */
    public SyncInvoker<DeleteMessageEmailConfigRequest, DeleteMessageEmailConfigResponse> deleteMessageEmailConfigInvoker(
        DeleteMessageEmailConfigRequest request) {
        return new SyncInvoker<DeleteMessageEmailConfigRequest, DeleteMessageEmailConfigResponse>(request,
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
     * @return ListMessageResponse
     */
    public ListMessageResponse listMessage(ListMessageRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.listMessage);
    }

    /**
     * 获取消息列表
     *
     * 从消息中心获取当前用户有权限查看的消息列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListMessageRequest 请求对象
     * @return SyncInvoker<ListMessageRequest, ListMessageResponse>
     */
    public SyncInvoker<ListMessageRequest, ListMessageResponse> listMessageInvoker(ListMessageRequest request) {
        return new SyncInvoker<ListMessageRequest, ListMessageResponse>(request, EiHealthMeta.listMessage, hcClient);
    }

    /**
     * 统计消息信息
     *
     * 统计消息信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListMessageStatisticsRequest 请求对象
     * @return ListMessageStatisticsResponse
     */
    public ListMessageStatisticsResponse listMessageStatistics(ListMessageStatisticsRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.listMessageStatistics);
    }

    /**
     * 统计消息信息
     *
     * 统计消息信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListMessageStatisticsRequest 请求对象
     * @return SyncInvoker<ListMessageStatisticsRequest, ListMessageStatisticsResponse>
     */
    public SyncInvoker<ListMessageStatisticsRequest, ListMessageStatisticsResponse> listMessageStatisticsInvoker(
        ListMessageStatisticsRequest request) {
        return new SyncInvoker<ListMessageStatisticsRequest, ListMessageStatisticsResponse>(request,
            EiHealthMeta.listMessageStatistics, hcClient);
    }

    /**
     * 获取通知消息列表
     *
     * 获取通知消息列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListNoticeRequest 请求对象
     * @return ListNoticeResponse
     */
    public ListNoticeResponse listNotice(ListNoticeRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.listNotice);
    }

    /**
     * 获取通知消息列表
     *
     * 获取通知消息列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListNoticeRequest 请求对象
     * @return SyncInvoker<ListNoticeRequest, ListNoticeResponse>
     */
    public SyncInvoker<ListNoticeRequest, ListNoticeResponse> listNoticeInvoker(ListNoticeRequest request) {
        return new SyncInvoker<ListNoticeRequest, ListNoticeResponse>(request, EiHealthMeta.listNotice, hcClient);
    }

    /**
     * 获取消息清理规则
     *
     * 获取消息清理规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowMessageClearRuleRequest 请求对象
     * @return ShowMessageClearRuleResponse
     */
    public ShowMessageClearRuleResponse showMessageClearRule(ShowMessageClearRuleRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.showMessageClearRule);
    }

    /**
     * 获取消息清理规则
     *
     * 获取消息清理规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowMessageClearRuleRequest 请求对象
     * @return SyncInvoker<ShowMessageClearRuleRequest, ShowMessageClearRuleResponse>
     */
    public SyncInvoker<ShowMessageClearRuleRequest, ShowMessageClearRuleResponse> showMessageClearRuleInvoker(
        ShowMessageClearRuleRequest request) {
        return new SyncInvoker<ShowMessageClearRuleRequest, ShowMessageClearRuleResponse>(request,
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
     * @return ShowMessageEmailConfigResponse
     */
    public ShowMessageEmailConfigResponse showMessageEmailConfig(ShowMessageEmailConfigRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.showMessageEmailConfig);
    }

    /**
     * 获取消息邮件配置
     *
     * 获取消息邮件配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowMessageEmailConfigRequest 请求对象
     * @return SyncInvoker<ShowMessageEmailConfigRequest, ShowMessageEmailConfigResponse>
     */
    public SyncInvoker<ShowMessageEmailConfigRequest, ShowMessageEmailConfigResponse> showMessageEmailConfigInvoker(
        ShowMessageEmailConfigRequest request) {
        return new SyncInvoker<ShowMessageEmailConfigRequest, ShowMessageEmailConfigResponse>(request,
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
     * @return ShowMessageReceiveConfigResponse
     */
    public ShowMessageReceiveConfigResponse showMessageReceiveConfig(ShowMessageReceiveConfigRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.showMessageReceiveConfig);
    }

    /**
     * 获取用户邮件配置
     *
     * 获取用户邮件配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowMessageReceiveConfigRequest 请求对象
     * @return SyncInvoker<ShowMessageReceiveConfigRequest, ShowMessageReceiveConfigResponse>
     */
    public SyncInvoker<ShowMessageReceiveConfigRequest, ShowMessageReceiveConfigResponse> showMessageReceiveConfigInvoker(
        ShowMessageReceiveConfigRequest request) {
        return new SyncInvoker<ShowMessageReceiveConfigRequest, ShowMessageReceiveConfigResponse>(request,
            EiHealthMeta.showMessageReceiveConfig, hcClient);
    }

    /**
     * 设置消息清理规则
     *
     * 设置消息清理规则，支持修改记录数(1W-1000W)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateMessageClearRuleRequest 请求对象
     * @return UpdateMessageClearRuleResponse
     */
    public UpdateMessageClearRuleResponse updateMessageClearRule(UpdateMessageClearRuleRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.updateMessageClearRule);
    }

    /**
     * 设置消息清理规则
     *
     * 设置消息清理规则，支持修改记录数(1W-1000W)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateMessageClearRuleRequest 请求对象
     * @return SyncInvoker<UpdateMessageClearRuleRequest, UpdateMessageClearRuleResponse>
     */
    public SyncInvoker<UpdateMessageClearRuleRequest, UpdateMessageClearRuleResponse> updateMessageClearRuleInvoker(
        UpdateMessageClearRuleRequest request) {
        return new SyncInvoker<UpdateMessageClearRuleRequest, UpdateMessageClearRuleResponse>(request,
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
     * @return UpdateMessageEmailConfigResponse
     */
    public UpdateMessageEmailConfigResponse updateMessageEmailConfig(UpdateMessageEmailConfigRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.updateMessageEmailConfig);
    }

    /**
     * 设置消息邮件配置
     *
     * 设置消息邮件配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateMessageEmailConfigRequest 请求对象
     * @return SyncInvoker<UpdateMessageEmailConfigRequest, UpdateMessageEmailConfigResponse>
     */
    public SyncInvoker<UpdateMessageEmailConfigRequest, UpdateMessageEmailConfigResponse> updateMessageEmailConfigInvoker(
        UpdateMessageEmailConfigRequest request) {
        return new SyncInvoker<UpdateMessageEmailConfigRequest, UpdateMessageEmailConfigResponse>(request,
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
     * @return UpdateMessageReceiveConfigResponse
     */
    public UpdateMessageReceiveConfigResponse updateMessageReceiveConfig(UpdateMessageReceiveConfigRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.updateMessageReceiveConfig);
    }

    /**
     * 设置用户邮件配置
     *
     * 设置用户邮件配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateMessageReceiveConfigRequest 请求对象
     * @return SyncInvoker<UpdateMessageReceiveConfigRequest, UpdateMessageReceiveConfigResponse>
     */
    public SyncInvoker<UpdateMessageReceiveConfigRequest, UpdateMessageReceiveConfigResponse> updateMessageReceiveConfigInvoker(
        UpdateMessageReceiveConfigRequest request) {
        return new SyncInvoker<UpdateMessageReceiveConfigRequest, UpdateMessageReceiveConfigResponse>(request,
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
     * @return BatchUpdateNodeLabelResponse
     */
    public BatchUpdateNodeLabelResponse batchUpdateNodeLabel(BatchUpdateNodeLabelRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.batchUpdateNodeLabel);
    }

    /**
     * 设置节点标签
     *
     * 设置节点标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchUpdateNodeLabelRequest 请求对象
     * @return SyncInvoker<BatchUpdateNodeLabelRequest, BatchUpdateNodeLabelResponse>
     */
    public SyncInvoker<BatchUpdateNodeLabelRequest, BatchUpdateNodeLabelResponse> batchUpdateNodeLabelInvoker(
        BatchUpdateNodeLabelRequest request) {
        return new SyncInvoker<BatchUpdateNodeLabelRequest, BatchUpdateNodeLabelResponse>(request,
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
     * @return ListClusterAllNodeLabelResponse
     */
    public ListClusterAllNodeLabelResponse listClusterAllNodeLabel(ListClusterAllNodeLabelRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.listClusterAllNodeLabel);
    }

    /**
     * 获取节点标签集
     *
     * 获取节点标签集
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListClusterAllNodeLabelRequest 请求对象
     * @return SyncInvoker<ListClusterAllNodeLabelRequest, ListClusterAllNodeLabelResponse>
     */
    public SyncInvoker<ListClusterAllNodeLabelRequest, ListClusterAllNodeLabelResponse> listClusterAllNodeLabelInvoker(
        ListClusterAllNodeLabelRequest request) {
        return new SyncInvoker<ListClusterAllNodeLabelRequest, ListClusterAllNodeLabelResponse>(request,
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
     * @return ListNodeLabelResponse
     */
    public ListNodeLabelResponse listNodeLabel(ListNodeLabelRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.listNodeLabel);
    }

    /**
     * 获取节点标签集
     *
     * 获取节点标签集
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListNodeLabelRequest 请求对象
     * @return SyncInvoker<ListNodeLabelRequest, ListNodeLabelResponse>
     */
    public SyncInvoker<ListNodeLabelRequest, ListNodeLabelResponse> listNodeLabelInvoker(ListNodeLabelRequest request) {
        return new SyncInvoker<ListNodeLabelRequest, ListNodeLabelResponse>(request, EiHealthMeta.listNodeLabel,
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
     * @return ListPresetLabelResponse
     */
    public ListPresetLabelResponse listPresetLabel(ListPresetLabelRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.listPresetLabel);
    }

    /**
     * 获取预置标签列表
     *
     * 获取预置标签列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPresetLabelRequest 请求对象
     * @return SyncInvoker<ListPresetLabelRequest, ListPresetLabelResponse>
     */
    public SyncInvoker<ListPresetLabelRequest, ListPresetLabelResponse> listPresetLabelInvoker(
        ListPresetLabelRequest request) {
        return new SyncInvoker<ListPresetLabelRequest, ListPresetLabelResponse>(request, EiHealthMeta.listPresetLabel,
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
     * @return CreateNotebookResponse
     */
    public CreateNotebookResponse createNotebook(CreateNotebookRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.createNotebook);
    }

    /**
     * 创建notebook
     *
     * 创建notebook
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateNotebookRequest 请求对象
     * @return SyncInvoker<CreateNotebookRequest, CreateNotebookResponse>
     */
    public SyncInvoker<CreateNotebookRequest, CreateNotebookResponse> createNotebookInvoker(
        CreateNotebookRequest request) {
        return new SyncInvoker<CreateNotebookRequest, CreateNotebookResponse>(request, EiHealthMeta.createNotebook,
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
     * @return DeleteNotebookResponse
     */
    public DeleteNotebookResponse deleteNotebook(DeleteNotebookRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.deleteNotebook);
    }

    /**
     * 删除notebook
     *
     * 删除notebook
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteNotebookRequest 请求对象
     * @return SyncInvoker<DeleteNotebookRequest, DeleteNotebookResponse>
     */
    public SyncInvoker<DeleteNotebookRequest, DeleteNotebookResponse> deleteNotebookInvoker(
        DeleteNotebookRequest request) {
        return new SyncInvoker<DeleteNotebookRequest, DeleteNotebookResponse>(request, EiHealthMeta.deleteNotebook,
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
     * @return ListNotebookResponse
     */
    public ListNotebookResponse listNotebook(ListNotebookRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.listNotebook);
    }

    /**
     * 获取notebook列表
     *
     * 获取notebook列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListNotebookRequest 请求对象
     * @return SyncInvoker<ListNotebookRequest, ListNotebookResponse>
     */
    public SyncInvoker<ListNotebookRequest, ListNotebookResponse> listNotebookInvoker(ListNotebookRequest request) {
        return new SyncInvoker<ListNotebookRequest, ListNotebookResponse>(request, EiHealthMeta.listNotebook, hcClient);
    }

    /**
     * 获取notebook工作环境
     *
     * 获取notebook工作环境
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListNotebookToolRequest 请求对象
     * @return ListNotebookToolResponse
     */
    public ListNotebookToolResponse listNotebookTool(ListNotebookToolRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.listNotebookTool);
    }

    /**
     * 获取notebook工作环境
     *
     * 获取notebook工作环境
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListNotebookToolRequest 请求对象
     * @return SyncInvoker<ListNotebookToolRequest, ListNotebookToolResponse>
     */
    public SyncInvoker<ListNotebookToolRequest, ListNotebookToolResponse> listNotebookToolInvoker(
        ListNotebookToolRequest request) {
        return new SyncInvoker<ListNotebookToolRequest, ListNotebookToolResponse>(request,
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
     * @return ShowNotebookResponse
     */
    public ShowNotebookResponse showNotebook(ShowNotebookRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.showNotebook);
    }

    /**
     * 获取notebook详情
     *
     * 获取notebook详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowNotebookRequest 请求对象
     * @return SyncInvoker<ShowNotebookRequest, ShowNotebookResponse>
     */
    public SyncInvoker<ShowNotebookRequest, ShowNotebookResponse> showNotebookInvoker(ShowNotebookRequest request) {
        return new SyncInvoker<ShowNotebookRequest, ShowNotebookResponse>(request, EiHealthMeta.showNotebook, hcClient);
    }

    /**
     * 获取notebook鉴权信息
     *
     * 获取notebook鉴权信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowNotebookTokenRequest 请求对象
     * @return ShowNotebookTokenResponse
     */
    public ShowNotebookTokenResponse showNotebookToken(ShowNotebookTokenRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.showNotebookToken);
    }

    /**
     * 获取notebook鉴权信息
     *
     * 获取notebook鉴权信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowNotebookTokenRequest 请求对象
     * @return SyncInvoker<ShowNotebookTokenRequest, ShowNotebookTokenResponse>
     */
    public SyncInvoker<ShowNotebookTokenRequest, ShowNotebookTokenResponse> showNotebookTokenInvoker(
        ShowNotebookTokenRequest request) {
        return new SyncInvoker<ShowNotebookTokenRequest, ShowNotebookTokenResponse>(request,
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
     * @return StopOrStartNotebookResponse
     */
    public StopOrStartNotebookResponse stopOrStartNotebook(StopOrStartNotebookRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.stopOrStartNotebook);
    }

    /**
     * 启停notebook
     *
     * 启停notebook
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StopOrStartNotebookRequest 请求对象
     * @return SyncInvoker<StopOrStartNotebookRequest, StopOrStartNotebookResponse>
     */
    public SyncInvoker<StopOrStartNotebookRequest, StopOrStartNotebookResponse> stopOrStartNotebookInvoker(
        StopOrStartNotebookRequest request) {
        return new SyncInvoker<StopOrStartNotebookRequest, StopOrStartNotebookResponse>(request,
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
     * @return UpdateNotebookResponse
     */
    public UpdateNotebookResponse updateNotebook(UpdateNotebookRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.updateNotebook);
    }

    /**
     * 更新notebook
     *
     * 更新notebook
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateNotebookRequest 请求对象
     * @return SyncInvoker<UpdateNotebookRequest, UpdateNotebookResponse>
     */
    public SyncInvoker<UpdateNotebookRequest, UpdateNotebookResponse> updateNotebookInvoker(
        UpdateNotebookRequest request) {
        return new SyncInvoker<UpdateNotebookRequest, UpdateNotebookResponse>(request, EiHealthMeta.updateNotebook,
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
     * @return ListObsBucketResponse
     */
    public ListObsBucketResponse listObsBucket(ListObsBucketRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.listObsBucket);
    }

    /**
     * 获取用户OBS桶列表
     *
     * 获取用户OBS桶列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListObsBucketRequest 请求对象
     * @return SyncInvoker<ListObsBucketRequest, ListObsBucketResponse>
     */
    public SyncInvoker<ListObsBucketRequest, ListObsBucketResponse> listObsBucketInvoker(ListObsBucketRequest request) {
        return new SyncInvoker<ListObsBucketRequest, ListObsBucketResponse>(request, EiHealthMeta.listObsBucket,
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
     * @return ListObsBucketObjectResponse
     */
    public ListObsBucketObjectResponse listObsBucketObject(ListObsBucketObjectRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.listObsBucketObject);
    }

    /**
     * 获取用户OBS桶内对象
     *
     * 获取用户OBS桶内对象
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListObsBucketObjectRequest 请求对象
     * @return SyncInvoker<ListObsBucketObjectRequest, ListObsBucketObjectResponse>
     */
    public SyncInvoker<ListObsBucketObjectRequest, ListObsBucketObjectResponse> listObsBucketObjectInvoker(
        ListObsBucketObjectRequest request) {
        return new SyncInvoker<ListObsBucketObjectRequest, ListObsBucketObjectResponse>(request,
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
     * @return ShowOverviewResponse
     */
    public ShowOverviewResponse showOverview(ShowOverviewRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.showOverview);
    }

    /**
     * 获取医疗平台信息
     *
     * 获取医疗平台信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowOverviewRequest 请求对象
     * @return SyncInvoker<ShowOverviewRequest, ShowOverviewResponse>
     */
    public SyncInvoker<ShowOverviewRequest, ShowOverviewResponse> showOverviewInvoker(ShowOverviewRequest request) {
        return new SyncInvoker<ShowOverviewRequest, ShowOverviewResponse>(request, EiHealthMeta.showOverview, hcClient);
    }

    /**
     * 购买性能加速资源
     *
     * 购买性能加速资源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreatePerformanceResourceRequest 请求对象
     * @return CreatePerformanceResourceResponse
     */
    public CreatePerformanceResourceResponse createPerformanceResource(CreatePerformanceResourceRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.createPerformanceResource);
    }

    /**
     * 购买性能加速资源
     *
     * 购买性能加速资源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreatePerformanceResourceRequest 请求对象
     * @return SyncInvoker<CreatePerformanceResourceRequest, CreatePerformanceResourceResponse>
     */
    public SyncInvoker<CreatePerformanceResourceRequest, CreatePerformanceResourceResponse> createPerformanceResourceInvoker(
        CreatePerformanceResourceRequest request) {
        return new SyncInvoker<CreatePerformanceResourceRequest, CreatePerformanceResourceResponse>(request,
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
     * @return DeletePerformanceResourceResponse
     */
    public DeletePerformanceResourceResponse deletePerformanceResource(DeletePerformanceResourceRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.deletePerformanceResource);
    }

    /**
     * 删除性能加速资源
     *
     * 删除性能加速资源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeletePerformanceResourceRequest 请求对象
     * @return SyncInvoker<DeletePerformanceResourceRequest, DeletePerformanceResourceResponse>
     */
    public SyncInvoker<DeletePerformanceResourceRequest, DeletePerformanceResourceResponse> deletePerformanceResourceInvoker(
        DeletePerformanceResourceRequest request) {
        return new SyncInvoker<DeletePerformanceResourceRequest, DeletePerformanceResourceResponse>(request,
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
     * @return ListPerformanceResourcesResponse
     */
    public ListPerformanceResourcesResponse listPerformanceResources(ListPerformanceResourcesRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.listPerformanceResources);
    }

    /**
     * 查询性能加速资源
     *
     * 查询性能加速资源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPerformanceResourcesRequest 请求对象
     * @return SyncInvoker<ListPerformanceResourcesRequest, ListPerformanceResourcesResponse>
     */
    public SyncInvoker<ListPerformanceResourcesRequest, ListPerformanceResourcesResponse> listPerformanceResourcesInvoker(
        ListPerformanceResourcesRequest request) {
        return new SyncInvoker<ListPerformanceResourcesRequest, ListPerformanceResourcesResponse>(request,
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
     * @return UpdatePerformanceResourceResponse
     */
    public UpdatePerformanceResourceResponse updatePerformanceResource(UpdatePerformanceResourceRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.updatePerformanceResource);
    }

    /**
     * 更新性能加速资源配置
     *
     * 更新性能加速资源配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdatePerformanceResourceRequest 请求对象
     * @return SyncInvoker<UpdatePerformanceResourceRequest, UpdatePerformanceResourceResponse>
     */
    public SyncInvoker<UpdatePerformanceResourceRequest, UpdatePerformanceResourceResponse> updatePerformanceResourceInvoker(
        UpdatePerformanceResourceRequest request) {
        return new SyncInvoker<UpdatePerformanceResourceRequest, UpdatePerformanceResourceResponse>(request,
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
     * @return BatchDeleteMemberResponse
     */
    public BatchDeleteMemberResponse batchDeleteMember(BatchDeleteMemberRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.batchDeleteMember);
    }

    /**
     * 批量删除项目成员
     *
     * 批量删除项目成员
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchDeleteMemberRequest 请求对象
     * @return SyncInvoker<BatchDeleteMemberRequest, BatchDeleteMemberResponse>
     */
    public SyncInvoker<BatchDeleteMemberRequest, BatchDeleteMemberResponse> batchDeleteMemberInvoker(
        BatchDeleteMemberRequest request) {
        return new SyncInvoker<BatchDeleteMemberRequest, BatchDeleteMemberResponse>(request,
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
     * @return CreateProjectResponse
     */
    public CreateProjectResponse createProject(CreateProjectRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.createProject);
    }

    /**
     * 创建项目
     *
     * 创建项目
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateProjectRequest 请求对象
     * @return SyncInvoker<CreateProjectRequest, CreateProjectResponse>
     */
    public SyncInvoker<CreateProjectRequest, CreateProjectResponse> createProjectInvoker(CreateProjectRequest request) {
        return new SyncInvoker<CreateProjectRequest, CreateProjectResponse>(request, EiHealthMeta.createProject,
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
     * @return DeleteMemberResponse
     */
    public DeleteMemberResponse deleteMember(DeleteMemberRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.deleteMember);
    }

    /**
     * 移除项目成员
     *
     * 移除项目成员
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteMemberRequest 请求对象
     * @return SyncInvoker<DeleteMemberRequest, DeleteMemberResponse>
     */
    public SyncInvoker<DeleteMemberRequest, DeleteMemberResponse> deleteMemberInvoker(DeleteMemberRequest request) {
        return new SyncInvoker<DeleteMemberRequest, DeleteMemberResponse>(request, EiHealthMeta.deleteMember, hcClient);
    }

    /**
     * 删除项目
     *
     * 删除项目
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteProjectRequest 请求对象
     * @return DeleteProjectResponse
     */
    public DeleteProjectResponse deleteProject(DeleteProjectRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.deleteProject);
    }

    /**
     * 删除项目
     *
     * 删除项目
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteProjectRequest 请求对象
     * @return SyncInvoker<DeleteProjectRequest, DeleteProjectResponse>
     */
    public SyncInvoker<DeleteProjectRequest, DeleteProjectResponse> deleteProjectInvoker(DeleteProjectRequest request) {
        return new SyncInvoker<DeleteProjectRequest, DeleteProjectResponse>(request, EiHealthMeta.deleteProject,
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
     * @return ListProjectResponse
     */
    public ListProjectResponse listProject(ListProjectRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.listProject);
    }

    /**
     * 获取项目列表
     *
     * 获取项目列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListProjectRequest 请求对象
     * @return SyncInvoker<ListProjectRequest, ListProjectResponse>
     */
    public SyncInvoker<ListProjectRequest, ListProjectResponse> listProjectInvoker(ListProjectRequest request) {
        return new SyncInvoker<ListProjectRequest, ListProjectResponse>(request, EiHealthMeta.listProject, hcClient);
    }

    /**
     * 获取项目详情
     *
     * 获取项目详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowProjectRequest 请求对象
     * @return ShowProjectResponse
     */
    public ShowProjectResponse showProject(ShowProjectRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.showProject);
    }

    /**
     * 获取项目详情
     *
     * 获取项目详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowProjectRequest 请求对象
     * @return SyncInvoker<ShowProjectRequest, ShowProjectResponse>
     */
    public SyncInvoker<ShowProjectRequest, ShowProjectResponse> showProjectInvoker(ShowProjectRequest request) {
        return new SyncInvoker<ShowProjectRequest, ShowProjectResponse>(request, EiHealthMeta.showProject, hcClient);
    }

    /**
     * 转移项目
     *
     * 转移项目
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param TransferProjectRequest 请求对象
     * @return TransferProjectResponse
     */
    public TransferProjectResponse transferProject(TransferProjectRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.transferProject);
    }

    /**
     * 转移项目
     *
     * 转移项目
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param TransferProjectRequest 请求对象
     * @return SyncInvoker<TransferProjectRequest, TransferProjectResponse>
     */
    public SyncInvoker<TransferProjectRequest, TransferProjectResponse> transferProjectInvoker(
        TransferProjectRequest request) {
        return new SyncInvoker<TransferProjectRequest, TransferProjectResponse>(request, EiHealthMeta.transferProject,
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
     * @return UpdateMemberResponse
     */
    public UpdateMemberResponse updateMember(UpdateMemberRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.updateMember);
    }

    /**
     * 更新或者添加项目成员角色
     *
     * 更新或者添加项目成员角色
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateMemberRequest 请求对象
     * @return SyncInvoker<UpdateMemberRequest, UpdateMemberResponse>
     */
    public SyncInvoker<UpdateMemberRequest, UpdateMemberResponse> updateMemberInvoker(UpdateMemberRequest request) {
        return new SyncInvoker<UpdateMemberRequest, UpdateMemberResponse>(request, EiHealthMeta.updateMember, hcClient);
    }

    /**
     * 更新项目
     *
     * 更新项目
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateProjectRequest 请求对象
     * @return UpdateProjectResponse
     */
    public UpdateProjectResponse updateProject(UpdateProjectRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.updateProject);
    }

    /**
     * 更新项目
     *
     * 更新项目
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateProjectRequest 请求对象
     * @return SyncInvoker<UpdateProjectRequest, UpdateProjectResponse>
     */
    public SyncInvoker<UpdateProjectRequest, UpdateProjectResponse> updateProjectInvoker(UpdateProjectRequest request) {
        return new SyncInvoker<UpdateProjectRequest, UpdateProjectResponse>(request, EiHealthMeta.updateProject,
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
     * @return DownloadDataTraceResponse
     */
    public DownloadDataTraceResponse downloadDataTrace(DownloadDataTraceRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.downloadDataTrace);
    }

    /**
     * 下载近一万条审计日志
     *
     * 下载近一万条审计日志
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DownloadDataTraceRequest 请求对象
     * @return SyncInvoker<DownloadDataTraceRequest, DownloadDataTraceResponse>
     */
    public SyncInvoker<DownloadDataTraceRequest, DownloadDataTraceResponse> downloadDataTraceInvoker(
        DownloadDataTraceRequest request) {
        return new SyncInvoker<DownloadDataTraceRequest, DownloadDataTraceResponse>(request,
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
     * @return ShowProjectTraceResponse
     */
    public ShowProjectTraceResponse showProjectTrace(ShowProjectTraceRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.showProjectTrace);
    }

    /**
     * 获取项目审计日志
     *
     * 获取项目审计日志
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowProjectTraceRequest 请求对象
     * @return SyncInvoker<ShowProjectTraceRequest, ShowProjectTraceResponse>
     */
    public SyncInvoker<ShowProjectTraceRequest, ShowProjectTraceResponse> showProjectTraceInvoker(
        ShowProjectTraceRequest request) {
        return new SyncInvoker<ShowProjectTraceRequest, ShowProjectTraceResponse>(request,
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
     * @return ShowProjectTraceDataResponse
     */
    public ShowProjectTraceDataResponse showProjectTraceData(ShowProjectTraceDataRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.showProjectTraceData);
    }

    /**
     * 获取指定审计日志
     *
     * 获取指定审计日志
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowProjectTraceDataRequest 请求对象
     * @return SyncInvoker<ShowProjectTraceDataRequest, ShowProjectTraceDataResponse>
     */
    public SyncInvoker<ShowProjectTraceDataRequest, ShowProjectTraceDataResponse> showProjectTraceDataInvoker(
        ShowProjectTraceDataRequest request) {
        return new SyncInvoker<ShowProjectTraceDataRequest, ShowProjectTraceDataResponse>(request,
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
     * @return ShowProjectTrackerResponse
     */
    public ShowProjectTrackerResponse showProjectTracker(ShowProjectTrackerRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.showProjectTracker);
    }

    /**
     * 获取项目审计日志追踪器
     *
     * 获取项目审计日志追踪器
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowProjectTrackerRequest 请求对象
     * @return SyncInvoker<ShowProjectTrackerRequest, ShowProjectTrackerResponse>
     */
    public SyncInvoker<ShowProjectTrackerRequest, ShowProjectTrackerResponse> showProjectTrackerInvoker(
        ShowProjectTrackerRequest request) {
        return new SyncInvoker<ShowProjectTrackerRequest, ShowProjectTrackerResponse>(request,
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
     * @return UpdateProjectTrackerResponse
     */
    public UpdateProjectTrackerResponse updateProjectTracker(UpdateProjectTrackerRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.updateProjectTracker);
    }

    /**
     * 更新项目审计日志追踪器配置
     *
     * 更新项目审计日志追踪器配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateProjectTrackerRequest 请求对象
     * @return SyncInvoker<UpdateProjectTrackerRequest, UpdateProjectTrackerResponse>
     */
    public SyncInvoker<UpdateProjectTrackerRequest, UpdateProjectTrackerResponse> updateProjectTrackerInvoker(
        UpdateProjectTrackerRequest request) {
        return new SyncInvoker<UpdateProjectTrackerRequest, UpdateProjectTrackerResponse>(request,
            EiHealthMeta.updateProjectTracker, hcClient);
    }

    /**
     * 批量获取资源统计数据
     *
     * 批量获取资源统计数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchDownloadResourceStatDataRequest 请求对象
     * @return BatchDownloadResourceStatDataResponse
     */
    public BatchDownloadResourceStatDataResponse batchDownloadResourceStatData(
        BatchDownloadResourceStatDataRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.batchDownloadResourceStatData);
    }

    /**
     * 批量获取资源统计数据
     *
     * 批量获取资源统计数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchDownloadResourceStatDataRequest 请求对象
     * @return SyncInvoker<BatchDownloadResourceStatDataRequest, BatchDownloadResourceStatDataResponse>
     */
    public SyncInvoker<BatchDownloadResourceStatDataRequest, BatchDownloadResourceStatDataResponse> batchDownloadResourceStatDataInvoker(
        BatchDownloadResourceStatDataRequest request) {
        return new SyncInvoker<BatchDownloadResourceStatDataRequest, BatchDownloadResourceStatDataResponse>(request,
            EiHealthMeta.batchDownloadResourceStatData, hcClient);
    }

    /**
     * 获取资源监控数据
     *
     * 获取资源监控数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowResourceMetricDataRequest 请求对象
     * @return ShowResourceMetricDataResponse
     */
    public ShowResourceMetricDataResponse showResourceMetricData(ShowResourceMetricDataRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.showResourceMetricData);
    }

    /**
     * 获取资源监控数据
     *
     * 获取资源监控数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowResourceMetricDataRequest 请求对象
     * @return SyncInvoker<ShowResourceMetricDataRequest, ShowResourceMetricDataResponse>
     */
    public SyncInvoker<ShowResourceMetricDataRequest, ShowResourceMetricDataResponse> showResourceMetricDataInvoker(
        ShowResourceMetricDataRequest request) {
        return new SyncInvoker<ShowResourceMetricDataRequest, ShowResourceMetricDataResponse>(request,
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
     * @return DeleteStarResponse
     */
    public DeleteStarResponse deleteStar(DeleteStarRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.deleteStar);
    }

    /**
     * 取消收藏
     *
     * 取消收藏
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteStarRequest 请求对象
     * @return SyncInvoker<DeleteStarRequest, DeleteStarResponse>
     */
    public SyncInvoker<DeleteStarRequest, DeleteStarResponse> deleteStarInvoker(DeleteStarRequest request) {
        return new SyncInvoker<DeleteStarRequest, DeleteStarResponse>(request, EiHealthMeta.deleteStar, hcClient);
    }

    /**
     * 获取收藏资产列表
     *
     * 获取收藏资产列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListStarRequest 请求对象
     * @return ListStarResponse
     */
    public ListStarResponse listStar(ListStarRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.listStar);
    }

    /**
     * 获取收藏资产列表
     *
     * 获取收藏资产列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListStarRequest 请求对象
     * @return SyncInvoker<ListStarRequest, ListStarResponse>
     */
    public SyncInvoker<ListStarRequest, ListStarResponse> listStarInvoker(ListStarRequest request) {
        return new SyncInvoker<ListStarRequest, ListStarResponse>(request, EiHealthMeta.listStar, hcClient);
    }

    /**
     * 收藏资产
     *
     * 收藏资产
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateStarRequest 请求对象
     * @return UpdateStarResponse
     */
    public UpdateStarResponse updateStar(UpdateStarRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.updateStar);
    }

    /**
     * 收藏资产
     *
     * 收藏资产
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateStarRequest 请求对象
     * @return SyncInvoker<UpdateStarRequest, UpdateStarResponse>
     */
    public SyncInvoker<UpdateStarRequest, UpdateStarResponse> updateStarInvoker(UpdateStarRequest request) {
        return new SyncInvoker<UpdateStarRequest, UpdateStarResponse>(request, EiHealthMeta.updateStar, hcClient);
    }

    /**
     * 统计全局流程、作业信息
     *
     * 统计全局流程、作业信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListGlobalWorkflowStatisticRequest 请求对象
     * @return ListGlobalWorkflowStatisticResponse
     */
    public ListGlobalWorkflowStatisticResponse listGlobalWorkflowStatistic(ListGlobalWorkflowStatisticRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.listGlobalWorkflowStatistic);
    }

    /**
     * 统计全局流程、作业信息
     *
     * 统计全局流程、作业信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListGlobalWorkflowStatisticRequest 请求对象
     * @return SyncInvoker<ListGlobalWorkflowStatisticRequest, ListGlobalWorkflowStatisticResponse>
     */
    public SyncInvoker<ListGlobalWorkflowStatisticRequest, ListGlobalWorkflowStatisticResponse> listGlobalWorkflowStatisticInvoker(
        ListGlobalWorkflowStatisticRequest request) {
        return new SyncInvoker<ListGlobalWorkflowStatisticRequest, ListGlobalWorkflowStatisticResponse>(request,
            EiHealthMeta.listGlobalWorkflowStatistic, hcClient);
    }

    /**
     * 获取性能加速资源上统计信息
     *
     * 获取性能加速资源上统计信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPerformanceResourceStatRequest 请求对象
     * @return ListPerformanceResourceStatResponse
     */
    public ListPerformanceResourceStatResponse listPerformanceResourceStat(ListPerformanceResourceStatRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.listPerformanceResourceStat);
    }

    /**
     * 获取性能加速资源上统计信息
     *
     * 获取性能加速资源上统计信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPerformanceResourceStatRequest 请求对象
     * @return SyncInvoker<ListPerformanceResourceStatRequest, ListPerformanceResourceStatResponse>
     */
    public SyncInvoker<ListPerformanceResourceStatRequest, ListPerformanceResourceStatResponse> listPerformanceResourceStatInvoker(
        ListPerformanceResourceStatRequest request) {
        return new SyncInvoker<ListPerformanceResourceStatRequest, ListPerformanceResourceStatResponse>(request,
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
     * @return ListWorkflowStatisticResponse
     */
    public ListWorkflowStatisticResponse listWorkflowStatistic(ListWorkflowStatisticRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.listWorkflowStatistic);
    }

    /**
     * 统计应用、流程、作业数目
     *
     * 统计应用、流程、作业数目
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListWorkflowStatisticRequest 请求对象
     * @return SyncInvoker<ListWorkflowStatisticRequest, ListWorkflowStatisticResponse>
     */
    public SyncInvoker<ListWorkflowStatisticRequest, ListWorkflowStatisticResponse> listWorkflowStatisticInvoker(
        ListWorkflowStatisticRequest request) {
        return new SyncInvoker<ListWorkflowStatisticRequest, ListWorkflowStatisticResponse>(request,
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
     * @return ListStorageResourcesResponse
     */
    public ListStorageResourcesResponse listStorageResources(ListStorageResourcesRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.listStorageResources);
    }

    /**
     * 查询存储资源
     *
     * 查询存储资源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListStorageResourcesRequest 请求对象
     * @return SyncInvoker<ListStorageResourcesRequest, ListStorageResourcesResponse>
     */
    public SyncInvoker<ListStorageResourcesRequest, ListStorageResourcesResponse> listStorageResourcesInvoker(
        ListStorageResourcesRequest request) {
        return new SyncInvoker<ListStorageResourcesRequest, ListStorageResourcesResponse>(request,
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
     * @return CreateStudyResponse
     */
    public CreateStudyResponse createStudy(CreateStudyRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.createStudy);
    }

    /**
     * 创建study
     *
     * 创建study
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateStudyRequest 请求对象
     * @return SyncInvoker<CreateStudyRequest, CreateStudyResponse>
     */
    public SyncInvoker<CreateStudyRequest, CreateStudyResponse> createStudyInvoker(CreateStudyRequest request) {
        return new SyncInvoker<CreateStudyRequest, CreateStudyResponse>(request, EiHealthMeta.createStudy, hcClient);
    }

    /**
     * 创建study作业
     *
     * 创建study作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateStudyJobRequest 请求对象
     * @return CreateStudyJobResponse
     */
    public CreateStudyJobResponse createStudyJob(CreateStudyJobRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.createStudyJob);
    }

    /**
     * 创建study作业
     *
     * 创建study作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateStudyJobRequest 请求对象
     * @return SyncInvoker<CreateStudyJobRequest, CreateStudyJobResponse>
     */
    public SyncInvoker<CreateStudyJobRequest, CreateStudyJobResponse> createStudyJobInvoker(
        CreateStudyJobRequest request) {
        return new SyncInvoker<CreateStudyJobRequest, CreateStudyJobResponse>(request, EiHealthMeta.createStudyJob,
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
     * @return DeleteStudyResponse
     */
    public DeleteStudyResponse deleteStudy(DeleteStudyRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.deleteStudy);
    }

    /**
     * 删除study
     *
     * 删除study
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteStudyRequest 请求对象
     * @return SyncInvoker<DeleteStudyRequest, DeleteStudyResponse>
     */
    public SyncInvoker<DeleteStudyRequest, DeleteStudyResponse> deleteStudyInvoker(DeleteStudyRequest request) {
        return new SyncInvoker<DeleteStudyRequest, DeleteStudyResponse>(request, EiHealthMeta.deleteStudy, hcClient);
    }

    /**
     * 列举study
     *
     * 列举study
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListStudyRequest 请求对象
     * @return ListStudyResponse
     */
    public ListStudyResponse listStudy(ListStudyRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.listStudy);
    }

    /**
     * 列举study
     *
     * 列举study
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListStudyRequest 请求对象
     * @return SyncInvoker<ListStudyRequest, ListStudyResponse>
     */
    public SyncInvoker<ListStudyRequest, ListStudyResponse> listStudyInvoker(ListStudyRequest request) {
        return new SyncInvoker<ListStudyRequest, ListStudyResponse>(request, EiHealthMeta.listStudy, hcClient);
    }

    /**
     * 列举study所有作业
     *
     * 列举study所有作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListStudyJobRequest 请求对象
     * @return ListStudyJobResponse
     */
    public ListStudyJobResponse listStudyJob(ListStudyJobRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.listStudyJob);
    }

    /**
     * 列举study所有作业
     *
     * 列举study所有作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListStudyJobRequest 请求对象
     * @return SyncInvoker<ListStudyJobRequest, ListStudyJobResponse>
     */
    public SyncInvoker<ListStudyJobRequest, ListStudyJobResponse> listStudyJobInvoker(ListStudyJobRequest request) {
        return new SyncInvoker<ListStudyJobRequest, ListStudyJobResponse>(request, EiHealthMeta.listStudyJob, hcClient);
    }

    /**
     * 获取生成study作业3D结构的内容
     *
     * 获取生成study作业3D结构的内容
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param Show3dStructureContentRequest 请求对象
     * @return Show3dStructureContentResponse
     */
    public Show3dStructureContentResponse show3dStructureContent(Show3dStructureContentRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.show3dStructureContent);
    }

    /**
     * 获取生成study作业3D结构的内容
     *
     * 获取生成study作业3D结构的内容
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param Show3dStructureContentRequest 请求对象
     * @return SyncInvoker<Show3dStructureContentRequest, Show3dStructureContentResponse>
     */
    public SyncInvoker<Show3dStructureContentRequest, Show3dStructureContentResponse> show3dStructureContentInvoker(
        Show3dStructureContentRequest request) {
        return new SyncInvoker<Show3dStructureContentRequest, Show3dStructureContentResponse>(request,
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
     * @return ShowExtremumInfoResponse
     */
    public ShowExtremumInfoResponse showExtremumInfo(ShowExtremumInfoRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.showExtremumInfo);
    }

    /**
     * 获取study作业的最值信息
     *
     * 获取study作业的最值信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowExtremumInfoRequest 请求对象
     * @return SyncInvoker<ShowExtremumInfoRequest, ShowExtremumInfoResponse>
     */
    public SyncInvoker<ShowExtremumInfoRequest, ShowExtremumInfoResponse> showExtremumInfoInvoker(
        ShowExtremumInfoRequest request) {
        return new SyncInvoker<ShowExtremumInfoRequest, ShowExtremumInfoResponse>(request,
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
     * @return ListArchiveConfigsResponse
     */
    public ListArchiveConfigsResponse listArchiveConfigs(ListArchiveConfigsRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.listArchiveConfigs);
    }

    /**
     * 获取跨域归档配置
     *
     * 获取跨域归档配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListArchiveConfigsRequest 请求对象
     * @return SyncInvoker<ListArchiveConfigsRequest, ListArchiveConfigsResponse>
     */
    public SyncInvoker<ListArchiveConfigsRequest, ListArchiveConfigsResponse> listArchiveConfigsInvoker(
        ListArchiveConfigsRequest request) {
        return new SyncInvoker<ListArchiveConfigsRequest, ListArchiveConfigsResponse>(request,
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
     * @return ShowEnvResponse
     */
    public ShowEnvResponse showEnv(ShowEnvRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.showEnv);
    }

    /**
     * 查询系统配置列表
     *
     * 获取系统配置列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowEnvRequest 请求对象
     * @return SyncInvoker<ShowEnvRequest, ShowEnvResponse>
     */
    public SyncInvoker<ShowEnvRequest, ShowEnvResponse> showEnvInvoker(ShowEnvRequest request) {
        return new SyncInvoker<ShowEnvRequest, ShowEnvResponse>(request, EiHealthMeta.showEnv, hcClient);
    }

    /**
     * 获取供应商配置
     *
     * 获取供应商配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowVendorRequest 请求对象
     * @return ShowVendorResponse
     */
    public ShowVendorResponse showVendor(ShowVendorRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.showVendor);
    }

    /**
     * 获取供应商配置
     *
     * 获取供应商配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowVendorRequest 请求对象
     * @return SyncInvoker<ShowVendorRequest, ShowVendorResponse>
     */
    public SyncInvoker<ShowVendorRequest, ShowVendorResponse> showVendorInvoker(ShowVendorRequest request) {
        return new SyncInvoker<ShowVendorRequest, ShowVendorResponse>(request, EiHealthMeta.showVendor, hcClient);
    }

    /**
     * 修改跨域归档设置
     *
     * 修改跨域归档设置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateArchiveConfigRequest 请求对象
     * @return UpdateArchiveConfigResponse
     */
    public UpdateArchiveConfigResponse updateArchiveConfig(UpdateArchiveConfigRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.updateArchiveConfig);
    }

    /**
     * 修改跨域归档设置
     *
     * 修改跨域归档设置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateArchiveConfigRequest 请求对象
     * @return SyncInvoker<UpdateArchiveConfigRequest, UpdateArchiveConfigResponse>
     */
    public SyncInvoker<UpdateArchiveConfigRequest, UpdateArchiveConfigResponse> updateArchiveConfigInvoker(
        UpdateArchiveConfigRequest request) {
        return new SyncInvoker<UpdateArchiveConfigRequest, UpdateArchiveConfigResponse>(request,
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
     * @return UpdateVendorResponse
     */
    public UpdateVendorResponse updateVendor(UpdateVendorRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.updateVendor);
    }

    /**
     * 设置供应商配置
     *
     * 设置供应商配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateVendorRequest 请求对象
     * @return SyncInvoker<UpdateVendorRequest, UpdateVendorResponse>
     */
    public SyncInvoker<UpdateVendorRequest, UpdateVendorResponse> updateVendorInvoker(UpdateVendorRequest request) {
        return new SyncInvoker<UpdateVendorRequest, UpdateVendorResponse>(request, EiHealthMeta.updateVendor, hcClient);
    }

    /**
     * 获取当前系统配额及资源使用情况
     *
     * 获取当前系统配额及资源使用情况
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListQuotaRequest 请求对象
     * @return ListQuotaResponse
     */
    public ListQuotaResponse listQuota(ListQuotaRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.listQuota);
    }

    /**
     * 获取当前系统配额及资源使用情况
     *
     * 获取当前系统配额及资源使用情况
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListQuotaRequest 请求对象
     * @return SyncInvoker<ListQuotaRequest, ListQuotaResponse>
     */
    public SyncInvoker<ListQuotaRequest, ListQuotaResponse> listQuotaInvoker(ListQuotaRequest request) {
        return new SyncInvoker<ListQuotaRequest, ListQuotaResponse>(request, EiHealthMeta.listQuota, hcClient);
    }

    /**
     * 创建模板
     *
     * 创建模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateTemplateRequest 请求对象
     * @return CreateTemplateResponse
     */
    public CreateTemplateResponse createTemplate(CreateTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.createTemplate);
    }

    /**
     * 创建模板
     *
     * 创建模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateTemplateRequest 请求对象
     * @return SyncInvoker<CreateTemplateRequest, CreateTemplateResponse>
     */
    public SyncInvoker<CreateTemplateRequest, CreateTemplateResponse> createTemplateInvoker(
        CreateTemplateRequest request) {
        return new SyncInvoker<CreateTemplateRequest, CreateTemplateResponse>(request, EiHealthMeta.createTemplate,
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
     * @return DeleteTemplateResponse
     */
    public DeleteTemplateResponse deleteTemplate(DeleteTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.deleteTemplate);
    }

    /**
     * 删除模板
     *
     * 删除模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteTemplateRequest 请求对象
     * @return SyncInvoker<DeleteTemplateRequest, DeleteTemplateResponse>
     */
    public SyncInvoker<DeleteTemplateRequest, DeleteTemplateResponse> deleteTemplateInvoker(
        DeleteTemplateRequest request) {
        return new SyncInvoker<DeleteTemplateRequest, DeleteTemplateResponse>(request, EiHealthMeta.deleteTemplate,
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
     * @return ImportTemplateResponse
     */
    public ImportTemplateResponse importTemplate(ImportTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.importTemplate);
    }

    /**
     * 从其他项目导入模板
     *
     * 从其他项目导入模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ImportTemplateRequest 请求对象
     * @return SyncInvoker<ImportTemplateRequest, ImportTemplateResponse>
     */
    public SyncInvoker<ImportTemplateRequest, ImportTemplateResponse> importTemplateInvoker(
        ImportTemplateRequest request) {
        return new SyncInvoker<ImportTemplateRequest, ImportTemplateResponse>(request, EiHealthMeta.importTemplate,
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
     * @return ListTemplateResponse
     */
    public ListTemplateResponse listTemplate(ListTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.listTemplate);
    }

    /**
     * 查询模板列表
     *
     * 查询模板列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTemplateRequest 请求对象
     * @return SyncInvoker<ListTemplateRequest, ListTemplateResponse>
     */
    public SyncInvoker<ListTemplateRequest, ListTemplateResponse> listTemplateInvoker(ListTemplateRequest request) {
        return new SyncInvoker<ListTemplateRequest, ListTemplateResponse>(request, EiHealthMeta.listTemplate, hcClient);
    }

    /**
     * 查询模板详情
     *
     * 查询模板详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowTemplateRequest 请求对象
     * @return ShowTemplateResponse
     */
    public ShowTemplateResponse showTemplate(ShowTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.showTemplate);
    }

    /**
     * 查询模板详情
     *
     * 查询模板详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowTemplateRequest 请求对象
     * @return SyncInvoker<ShowTemplateRequest, ShowTemplateResponse>
     */
    public SyncInvoker<ShowTemplateRequest, ShowTemplateResponse> showTemplateInvoker(ShowTemplateRequest request) {
        return new SyncInvoker<ShowTemplateRequest, ShowTemplateResponse>(request, EiHealthMeta.showTemplate, hcClient);
    }

    /**
     * 上传模板
     *
     * 上传模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UploadTemplateRequest 请求对象
     * @return UploadTemplateResponse
     */
    public UploadTemplateResponse uploadTemplate(UploadTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.uploadTemplate);
    }

    /**
     * 上传模板
     *
     * 上传模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UploadTemplateRequest 请求对象
     * @return SyncInvoker<UploadTemplateRequest, UploadTemplateResponse>
     */
    public SyncInvoker<UploadTemplateRequest, UploadTemplateResponse> uploadTemplateInvoker(
        UploadTemplateRequest request) {
        return new SyncInvoker<UploadTemplateRequest, UploadTemplateResponse>(request, EiHealthMeta.uploadTemplate,
            hcClient);
    }

    /**
     * 修改密码
     *
     * 修改密码
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ChangePasswordRequest 请求对象
     * @return ChangePasswordResponse
     */
    public ChangePasswordResponse changePassword(ChangePasswordRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.changePassword);
    }

    /**
     * 修改密码
     *
     * 修改密码
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ChangePasswordRequest 请求对象
     * @return SyncInvoker<ChangePasswordRequest, ChangePasswordResponse>
     */
    public SyncInvoker<ChangePasswordRequest, ChangePasswordResponse> changePasswordInvoker(
        ChangePasswordRequest request) {
        return new SyncInvoker<ChangePasswordRequest, ChangePasswordResponse>(request, EiHealthMeta.changePassword,
            hcClient);
    }

    /**
     * 校验token
     *
     * 校验token是否可访问当前环境
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CheckTokenVerificationRequest 请求对象
     * @return CheckTokenVerificationResponse
     */
    public CheckTokenVerificationResponse checkTokenVerification(CheckTokenVerificationRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.checkTokenVerification);
    }

    /**
     * 校验token
     *
     * 校验token是否可访问当前环境
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CheckTokenVerificationRequest 请求对象
     * @return SyncInvoker<CheckTokenVerificationRequest, CheckTokenVerificationResponse>
     */
    public SyncInvoker<CheckTokenVerificationRequest, CheckTokenVerificationResponse> checkTokenVerificationInvoker(
        CheckTokenVerificationRequest request) {
        return new SyncInvoker<CheckTokenVerificationRequest, CheckTokenVerificationResponse>(request,
            EiHealthMeta.checkTokenVerification, hcClient);
    }

    /**
     * 发送验证码
     *
     * 发送验证码
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateCodeRequest 请求对象
     * @return CreateCodeResponse
     */
    public CreateCodeResponse createCode(CreateCodeRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.createCode);
    }

    /**
     * 发送验证码
     *
     * 发送验证码
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateCodeRequest 请求对象
     * @return SyncInvoker<CreateCodeRequest, CreateCodeResponse>
     */
    public SyncInvoker<CreateCodeRequest, CreateCodeResponse> createCodeInvoker(CreateCodeRequest request) {
        return new SyncInvoker<CreateCodeRequest, CreateCodeResponse>(request, EiHealthMeta.createCode, hcClient);
    }

    /**
     * 创建用户
     *
     * 创建用户
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateUserRequest 请求对象
     * @return CreateUserResponse
     */
    public CreateUserResponse createUser(CreateUserRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.createUser);
    }

    /**
     * 创建用户
     *
     * 创建用户
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateUserRequest 请求对象
     * @return SyncInvoker<CreateUserRequest, CreateUserResponse>
     */
    public SyncInvoker<CreateUserRequest, CreateUserResponse> createUserInvoker(CreateUserRequest request) {
        return new SyncInvoker<CreateUserRequest, CreateUserResponse>(request, EiHealthMeta.createUser, hcClient);
    }

    /**
     * 删除用户
     *
     * 删除用户
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteUserRequest 请求对象
     * @return DeleteUserResponse
     */
    public DeleteUserResponse deleteUser(DeleteUserRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.deleteUser);
    }

    /**
     * 删除用户
     *
     * 删除用户
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteUserRequest 请求对象
     * @return SyncInvoker<DeleteUserRequest, DeleteUserResponse>
     */
    public SyncInvoker<DeleteUserRequest, DeleteUserResponse> deleteUserInvoker(DeleteUserRequest request) {
        return new SyncInvoker<DeleteUserRequest, DeleteUserResponse>(request, EiHealthMeta.deleteUser, hcClient);
    }

    /**
     * 导入用户
     *
     * 导入用户
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ImportUserRequest 请求对象
     * @return ImportUserResponse
     */
    public ImportUserResponse importUser(ImportUserRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.importUser);
    }

    /**
     * 导入用户
     *
     * 导入用户
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ImportUserRequest 请求对象
     * @return SyncInvoker<ImportUserRequest, ImportUserResponse>
     */
    public SyncInvoker<ImportUserRequest, ImportUserResponse> importUserInvoker(ImportUserRequest request) {
        return new SyncInvoker<ImportUserRequest, ImportUserResponse>(request, EiHealthMeta.importUser, hcClient);
    }

    /**
     * 获取可用的认证方法
     *
     * 获取可用的认证方法
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListMfaRequest 请求对象
     * @return ListMfaResponse
     */
    public ListMfaResponse listMfa(ListMfaRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.listMfa);
    }

    /**
     * 获取可用的认证方法
     *
     * 获取可用的认证方法
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListMfaRequest 请求对象
     * @return SyncInvoker<ListMfaRequest, ListMfaResponse>
     */
    public SyncInvoker<ListMfaRequest, ListMfaResponse> listMfaInvoker(ListMfaRequest request) {
        return new SyncInvoker<ListMfaRequest, ListMfaResponse>(request, EiHealthMeta.listMfa, hcClient);
    }

    /**
     * 获取用户列表
     *
     * 获取用户列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListUserRequest 请求对象
     * @return ListUserResponse
     */
    public ListUserResponse listUser(ListUserRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.listUser);
    }

    /**
     * 获取用户列表
     *
     * 获取用户列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListUserRequest 请求对象
     * @return SyncInvoker<ListUserRequest, ListUserResponse>
     */
    public SyncInvoker<ListUserRequest, ListUserResponse> listUserInvoker(ListUserRequest request) {
        return new SyncInvoker<ListUserRequest, ListUserResponse>(request, EiHealthMeta.listUser, hcClient);
    }

    /**
     * 获取指定用户详情
     *
     * 获取指定用户详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowUserRequest 请求对象
     * @return ShowUserResponse
     */
    public ShowUserResponse showUser(ShowUserRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.showUser);
    }

    /**
     * 获取指定用户详情
     *
     * 获取指定用户详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowUserRequest 请求对象
     * @return SyncInvoker<ShowUserRequest, ShowUserResponse>
     */
    public SyncInvoker<ShowUserRequest, ShowUserResponse> showUserInvoker(ShowUserRequest request) {
        return new SyncInvoker<ShowUserRequest, ShowUserResponse>(request, EiHealthMeta.showUser, hcClient);
    }

    /**
     * 查询用户设置
     *
     * 查询用户设置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowUserSettingRequest 请求对象
     * @return ShowUserSettingResponse
     */
    public ShowUserSettingResponse showUserSetting(ShowUserSettingRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.showUserSetting);
    }

    /**
     * 查询用户设置
     *
     * 查询用户设置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowUserSettingRequest 请求对象
     * @return SyncInvoker<ShowUserSettingRequest, ShowUserSettingResponse>
     */
    public SyncInvoker<ShowUserSettingRequest, ShowUserSettingResponse> showUserSettingInvoker(
        ShowUserSettingRequest request) {
        return new SyncInvoker<ShowUserSettingRequest, ShowUserSettingResponse>(request, EiHealthMeta.showUserSetting,
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
     * @return UpdateInitPasswordResponse
     */
    public UpdateInitPasswordResponse updateInitPassword(UpdateInitPasswordRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.updateInitPassword);
    }

    /**
     * 新用户重置密码
     *
     * 新用户重置密码
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateInitPasswordRequest 请求对象
     * @return SyncInvoker<UpdateInitPasswordRequest, UpdateInitPasswordResponse>
     */
    public SyncInvoker<UpdateInitPasswordRequest, UpdateInitPasswordResponse> updateInitPasswordInvoker(
        UpdateInitPasswordRequest request) {
        return new SyncInvoker<UpdateInitPasswordRequest, UpdateInitPasswordResponse>(request,
            EiHealthMeta.updateInitPassword, hcClient);
    }

    /**
     * 修改用户基本信息
     *
     * 修改用户基本信息（邮箱，手机）
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateUserRequest 请求对象
     * @return UpdateUserResponse
     */
    public UpdateUserResponse updateUser(UpdateUserRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.updateUser);
    }

    /**
     * 修改用户基本信息
     *
     * 修改用户基本信息（邮箱，手机）
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateUserRequest 请求对象
     * @return SyncInvoker<UpdateUserRequest, UpdateUserResponse>
     */
    public SyncInvoker<UpdateUserRequest, UpdateUserResponse> updateUserInvoker(UpdateUserRequest request) {
        return new SyncInvoker<UpdateUserRequest, UpdateUserResponse>(request, EiHealthMeta.updateUser, hcClient);
    }

    /**
     * 最终租户修改子用户
     *
     * 最终租户修改子用户
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateUserByDomainRequest 请求对象
     * @return UpdateUserByDomainResponse
     */
    public UpdateUserByDomainResponse updateUserByDomain(UpdateUserByDomainRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.updateUserByDomain);
    }

    /**
     * 最终租户修改子用户
     *
     * 最终租户修改子用户
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateUserByDomainRequest 请求对象
     * @return SyncInvoker<UpdateUserByDomainRequest, UpdateUserByDomainResponse>
     */
    public SyncInvoker<UpdateUserByDomainRequest, UpdateUserByDomainResponse> updateUserByDomainInvoker(
        UpdateUserByDomainRequest request) {
        return new SyncInvoker<UpdateUserByDomainRequest, UpdateUserByDomainResponse>(request,
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
     * @return UpdateUserRoleResponse
     */
    public UpdateUserRoleResponse updateUserRole(UpdateUserRoleRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.updateUserRole);
    }

    /**
     * 更新用户角色
     *
     * 更新用户角色
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateUserRoleRequest 请求对象
     * @return SyncInvoker<UpdateUserRoleRequest, UpdateUserRoleResponse>
     */
    public SyncInvoker<UpdateUserRoleRequest, UpdateUserRoleResponse> updateUserRoleInvoker(
        UpdateUserRoleRequest request) {
        return new SyncInvoker<UpdateUserRoleRequest, UpdateUserRoleResponse>(request, EiHealthMeta.updateUserRole,
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
     * @return UpdateUserSettingResponse
     */
    public UpdateUserSettingResponse updateUserSetting(UpdateUserSettingRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.updateUserSetting);
    }

    /**
     * 更新用户设置
     *
     * 更新用户设置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateUserSettingRequest 请求对象
     * @return SyncInvoker<UpdateUserSettingRequest, UpdateUserSettingResponse>
     */
    public SyncInvoker<UpdateUserSettingRequest, UpdateUserSettingResponse> updateUserSettingInvoker(
        UpdateUserSettingRequest request) {
        return new SyncInvoker<UpdateUserSettingRequest, UpdateUserSettingResponse>(request,
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
     * @return ValidateCodeResponse
     */
    public ValidateCodeResponse validateCode(ValidateCodeRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.validateCode);
    }

    /**
     * 预验证
     *
     * 预验证
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ValidateCodeRequest 请求对象
     * @return SyncInvoker<ValidateCodeRequest, ValidateCodeResponse>
     */
    public SyncInvoker<ValidateCodeRequest, ValidateCodeResponse> validateCodeInvoker(ValidateCodeRequest request) {
        return new SyncInvoker<ValidateCodeRequest, ValidateCodeResponse>(request, EiHealthMeta.validateCode, hcClient);
    }

    /**
     * 获取供应商列表
     *
     * 获取供应商列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListVendorRequest 请求对象
     * @return ListVendorResponse
     */
    public ListVendorResponse listVendor(ListVendorRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.listVendor);
    }

    /**
     * 获取供应商列表
     *
     * 获取供应商列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListVendorRequest 请求对象
     * @return SyncInvoker<ListVendorRequest, ListVendorResponse>
     */
    public SyncInvoker<ListVendorRequest, ListVendorResponse> listVendorInvoker(ListVendorRequest request) {
        return new SyncInvoker<ListVendorRequest, ListVendorResponse>(request, EiHealthMeta.listVendor, hcClient);
    }

    /**
     * 创建流程
     *
     * 创建流程
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateWorkflowRequest 请求对象
     * @return CreateWorkflowResponse
     */
    public CreateWorkflowResponse createWorkflow(CreateWorkflowRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.createWorkflow);
    }

    /**
     * 创建流程
     *
     * 创建流程
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateWorkflowRequest 请求对象
     * @return SyncInvoker<CreateWorkflowRequest, CreateWorkflowResponse>
     */
    public SyncInvoker<CreateWorkflowRequest, CreateWorkflowResponse> createWorkflowInvoker(
        CreateWorkflowRequest request) {
        return new SyncInvoker<CreateWorkflowRequest, CreateWorkflowResponse>(request, EiHealthMeta.createWorkflow,
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
     * @return DeleteWorkflowResponse
     */
    public DeleteWorkflowResponse deleteWorkflow(DeleteWorkflowRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.deleteWorkflow);
    }

    /**
     * 删除流程
     *
     * 删除流程
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteWorkflowRequest 请求对象
     * @return SyncInvoker<DeleteWorkflowRequest, DeleteWorkflowResponse>
     */
    public SyncInvoker<DeleteWorkflowRequest, DeleteWorkflowResponse> deleteWorkflowInvoker(
        DeleteWorkflowRequest request) {
        return new SyncInvoker<DeleteWorkflowRequest, DeleteWorkflowResponse>(request, EiHealthMeta.deleteWorkflow,
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
     * @return ImportWorkflowResponse
     */
    public ImportWorkflowResponse importWorkflow(ImportWorkflowRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.importWorkflow);
    }

    /**
     * 导入流程
     *
     * 导入流程
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ImportWorkflowRequest 请求对象
     * @return SyncInvoker<ImportWorkflowRequest, ImportWorkflowResponse>
     */
    public SyncInvoker<ImportWorkflowRequest, ImportWorkflowResponse> importWorkflowInvoker(
        ImportWorkflowRequest request) {
        return new SyncInvoker<ImportWorkflowRequest, ImportWorkflowResponse>(request, EiHealthMeta.importWorkflow,
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
     * @return ListWorkflowResponse
     */
    public ListWorkflowResponse listWorkflow(ListWorkflowRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.listWorkflow);
    }

    /**
     * 获取流程列表
     *
     * 获取流程列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListWorkflowRequest 请求对象
     * @return SyncInvoker<ListWorkflowRequest, ListWorkflowResponse>
     */
    public SyncInvoker<ListWorkflowRequest, ListWorkflowResponse> listWorkflowInvoker(ListWorkflowRequest request) {
        return new SyncInvoker<ListWorkflowRequest, ListWorkflowResponse>(request, EiHealthMeta.listWorkflow, hcClient);
    }

    /**
     * 发布流程
     *
     * 发布流程
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param PublishWorkflowRequest 请求对象
     * @return PublishWorkflowResponse
     */
    public PublishWorkflowResponse publishWorkflow(PublishWorkflowRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.publishWorkflow);
    }

    /**
     * 发布流程
     *
     * 发布流程
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param PublishWorkflowRequest 请求对象
     * @return SyncInvoker<PublishWorkflowRequest, PublishWorkflowResponse>
     */
    public SyncInvoker<PublishWorkflowRequest, PublishWorkflowResponse> publishWorkflowInvoker(
        PublishWorkflowRequest request) {
        return new SyncInvoker<PublishWorkflowRequest, PublishWorkflowResponse>(request, EiHealthMeta.publishWorkflow,
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
     * @return ShowWorkflowResponse
     */
    public ShowWorkflowResponse showWorkflow(ShowWorkflowRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.showWorkflow);
    }

    /**
     * 获取流程详情
     *
     * 获取流程详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowWorkflowRequest 请求对象
     * @return SyncInvoker<ShowWorkflowRequest, ShowWorkflowResponse>
     */
    public SyncInvoker<ShowWorkflowRequest, ShowWorkflowResponse> showWorkflowInvoker(ShowWorkflowRequest request) {
        return new SyncInvoker<ShowWorkflowRequest, ShowWorkflowResponse>(request, EiHealthMeta.showWorkflow, hcClient);
    }

    /**
     * 订阅流程
     *
     * 订阅流程
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SubscribeWorkflowRequest 请求对象
     * @return SubscribeWorkflowResponse
     */
    public SubscribeWorkflowResponse subscribeWorkflow(SubscribeWorkflowRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.subscribeWorkflow);
    }

    /**
     * 订阅流程
     *
     * 订阅流程
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SubscribeWorkflowRequest 请求对象
     * @return SyncInvoker<SubscribeWorkflowRequest, SubscribeWorkflowResponse>
     */
    public SyncInvoker<SubscribeWorkflowRequest, SubscribeWorkflowResponse> subscribeWorkflowInvoker(
        SubscribeWorkflowRequest request) {
        return new SyncInvoker<SubscribeWorkflowRequest, SubscribeWorkflowResponse>(request,
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
     * @return UpdateWorkflowResponse
     */
    public UpdateWorkflowResponse updateWorkflow(UpdateWorkflowRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.updateWorkflow);
    }

    /**
     * 更新流程
     *
     * 更新流程
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateWorkflowRequest 请求对象
     * @return SyncInvoker<UpdateWorkflowRequest, UpdateWorkflowResponse>
     */
    public SyncInvoker<UpdateWorkflowRequest, UpdateWorkflowResponse> updateWorkflowInvoker(
        UpdateWorkflowRequest request) {
        return new SyncInvoker<UpdateWorkflowRequest, UpdateWorkflowResponse>(request, EiHealthMeta.updateWorkflow,
            hcClient);
    }

    /**
     * 新建分子优化任务接口
     *
     * 输入起始小分子以及属性约束，创建分子优化任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateOptimizationTaskRequest 请求对象
     * @return CreateOptimizationTaskResponse
     */
    public CreateOptimizationTaskResponse createOptimizationTask(CreateOptimizationTaskRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.createOptimizationTask);
    }

    /**
     * 新建分子优化任务接口
     *
     * 输入起始小分子以及属性约束，创建分子优化任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateOptimizationTaskRequest 请求对象
     * @return SyncInvoker<CreateOptimizationTaskRequest, CreateOptimizationTaskResponse>
     */
    public SyncInvoker<CreateOptimizationTaskRequest, CreateOptimizationTaskResponse> createOptimizationTaskInvoker(
        CreateOptimizationTaskRequest request) {
        return new SyncInvoker<CreateOptimizationTaskRequest, CreateOptimizationTaskResponse>(request,
            EiHealthMeta.createOptimizationTask, hcClient);
    }

    /**
     * 查询分子优化任务
     *
     * 通过分子优化任务ID查询分子优化任务状态及结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowOptimizationTaskResultRequest 请求对象
     * @return ShowOptimizationTaskResultResponse
     */
    public ShowOptimizationTaskResultResponse showOptimizationTaskResult(ShowOptimizationTaskResultRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.showOptimizationTaskResult);
    }

    /**
     * 查询分子优化任务
     *
     * 通过分子优化任务ID查询分子优化任务状态及结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowOptimizationTaskResultRequest 请求对象
     * @return SyncInvoker<ShowOptimizationTaskResultRequest, ShowOptimizationTaskResultResponse>
     */
    public SyncInvoker<ShowOptimizationTaskResultRequest, ShowOptimizationTaskResultResponse> showOptimizationTaskResultInvoker(
        ShowOptimizationTaskResultRequest request) {
        return new SyncInvoker<ShowOptimizationTaskResultRequest, ShowOptimizationTaskResultResponse>(request,
            EiHealthMeta.showOptimizationTaskResult, hcClient);
    }

    /**
     * 新建分子搜索任务接口
     *
     * 输入要查询的分子以及查询条件，创建分子搜索任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateSearchTaskRequest 请求对象
     * @return CreateSearchTaskResponse
     */
    public CreateSearchTaskResponse createSearchTask(CreateSearchTaskRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.createSearchTask);
    }

    /**
     * 新建分子搜索任务接口
     *
     * 输入要查询的分子以及查询条件，创建分子搜索任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateSearchTaskRequest 请求对象
     * @return SyncInvoker<CreateSearchTaskRequest, CreateSearchTaskResponse>
     */
    public SyncInvoker<CreateSearchTaskRequest, CreateSearchTaskResponse> createSearchTaskInvoker(
        CreateSearchTaskRequest request) {
        return new SyncInvoker<CreateSearchTaskRequest, CreateSearchTaskResponse>(request,
            EiHealthMeta.createSearchTask, hcClient);
    }

    /**
     * 查询分子搜索任务
     *
     * 通过分子搜索任务ID查询分子搜索任务状态及结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowSearchTaskResultRequest 请求对象
     * @return ShowSearchTaskResultResponse
     */
    public ShowSearchTaskResultResponse showSearchTaskResult(ShowSearchTaskResultRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.showSearchTaskResult);
    }

    /**
     * 查询分子搜索任务
     *
     * 通过分子搜索任务ID查询分子搜索任务状态及结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowSearchTaskResultRequest 请求对象
     * @return SyncInvoker<ShowSearchTaskResultRequest, ShowSearchTaskResultResponse>
     */
    public SyncInvoker<ShowSearchTaskResultRequest, ShowSearchTaskResultResponse> showSearchTaskResultInvoker(
        ShowSearchTaskResultRequest request) {
        return new SyncInvoker<ShowSearchTaskResultRequest, ShowSearchTaskResultResponse>(request,
            EiHealthMeta.showSearchTaskResult, hcClient);
    }

}
