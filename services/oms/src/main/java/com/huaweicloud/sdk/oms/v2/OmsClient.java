package com.huaweicloud.sdk.oms.v2;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.oms.v2.model.BatchUpdateTasksRequest;
import com.huaweicloud.sdk.oms.v2.model.BatchUpdateTasksResponse;
import com.huaweicloud.sdk.oms.v2.model.CheckPrefixRequest;
import com.huaweicloud.sdk.oms.v2.model.CheckPrefixResponse;
import com.huaweicloud.sdk.oms.v2.model.CreateSyncEventsRequest;
import com.huaweicloud.sdk.oms.v2.model.CreateSyncEventsResponse;
import com.huaweicloud.sdk.oms.v2.model.CreateSyncTaskRequest;
import com.huaweicloud.sdk.oms.v2.model.CreateSyncTaskResponse;
import com.huaweicloud.sdk.oms.v2.model.CreateTaskGroupRequest;
import com.huaweicloud.sdk.oms.v2.model.CreateTaskGroupResponse;
import com.huaweicloud.sdk.oms.v2.model.CreateTaskRequest;
import com.huaweicloud.sdk.oms.v2.model.CreateTaskResponse;
import com.huaweicloud.sdk.oms.v2.model.DeleteSyncTaskRequest;
import com.huaweicloud.sdk.oms.v2.model.DeleteSyncTaskResponse;
import com.huaweicloud.sdk.oms.v2.model.DeleteTaskGroupRequest;
import com.huaweicloud.sdk.oms.v2.model.DeleteTaskGroupResponse;
import com.huaweicloud.sdk.oms.v2.model.DeleteTaskRequest;
import com.huaweicloud.sdk.oms.v2.model.DeleteTaskResponse;
import com.huaweicloud.sdk.oms.v2.model.ListApiVersionsRequest;
import com.huaweicloud.sdk.oms.v2.model.ListApiVersionsResponse;
import com.huaweicloud.sdk.oms.v2.model.ListSyncTaskStatisticRequest;
import com.huaweicloud.sdk.oms.v2.model.ListSyncTaskStatisticResponse;
import com.huaweicloud.sdk.oms.v2.model.ListSyncTasksRequest;
import com.huaweicloud.sdk.oms.v2.model.ListSyncTasksResponse;
import com.huaweicloud.sdk.oms.v2.model.ListTaskGroupRequest;
import com.huaweicloud.sdk.oms.v2.model.ListTaskGroupResponse;
import com.huaweicloud.sdk.oms.v2.model.ListTasksRequest;
import com.huaweicloud.sdk.oms.v2.model.ListTasksResponse;
import com.huaweicloud.sdk.oms.v2.model.RetryTaskGroupRequest;
import com.huaweicloud.sdk.oms.v2.model.RetryTaskGroupResponse;
import com.huaweicloud.sdk.oms.v2.model.ShowApiInfoRequest;
import com.huaweicloud.sdk.oms.v2.model.ShowApiInfoResponse;
import com.huaweicloud.sdk.oms.v2.model.ShowBucketListRequest;
import com.huaweicloud.sdk.oms.v2.model.ShowBucketListResponse;
import com.huaweicloud.sdk.oms.v2.model.ShowBucketObjectsRequest;
import com.huaweicloud.sdk.oms.v2.model.ShowBucketObjectsResponse;
import com.huaweicloud.sdk.oms.v2.model.ShowBucketRegionRequest;
import com.huaweicloud.sdk.oms.v2.model.ShowBucketRegionResponse;
import com.huaweicloud.sdk.oms.v2.model.ShowCdnInfoRequest;
import com.huaweicloud.sdk.oms.v2.model.ShowCdnInfoResponse;
import com.huaweicloud.sdk.oms.v2.model.ShowCloudTypeRequest;
import com.huaweicloud.sdk.oms.v2.model.ShowCloudTypeResponse;
import com.huaweicloud.sdk.oms.v2.model.ShowRegionInfoRequest;
import com.huaweicloud.sdk.oms.v2.model.ShowRegionInfoResponse;
import com.huaweicloud.sdk.oms.v2.model.ShowSyncTaskRequest;
import com.huaweicloud.sdk.oms.v2.model.ShowSyncTaskResponse;
import com.huaweicloud.sdk.oms.v2.model.ShowTaskGroupRequest;
import com.huaweicloud.sdk.oms.v2.model.ShowTaskGroupResponse;
import com.huaweicloud.sdk.oms.v2.model.ShowTaskRequest;
import com.huaweicloud.sdk.oms.v2.model.ShowTaskResponse;
import com.huaweicloud.sdk.oms.v2.model.StartSyncTaskRequest;
import com.huaweicloud.sdk.oms.v2.model.StartSyncTaskResponse;
import com.huaweicloud.sdk.oms.v2.model.StartTaskGroupRequest;
import com.huaweicloud.sdk.oms.v2.model.StartTaskGroupResponse;
import com.huaweicloud.sdk.oms.v2.model.StartTaskRequest;
import com.huaweicloud.sdk.oms.v2.model.StartTaskResponse;
import com.huaweicloud.sdk.oms.v2.model.StopSyncTaskRequest;
import com.huaweicloud.sdk.oms.v2.model.StopSyncTaskResponse;
import com.huaweicloud.sdk.oms.v2.model.StopTaskGroupRequest;
import com.huaweicloud.sdk.oms.v2.model.StopTaskGroupResponse;
import com.huaweicloud.sdk.oms.v2.model.StopTaskRequest;
import com.huaweicloud.sdk.oms.v2.model.StopTaskResponse;
import com.huaweicloud.sdk.oms.v2.model.UpdateBandwidthPolicyRequest;
import com.huaweicloud.sdk.oms.v2.model.UpdateBandwidthPolicyResponse;
import com.huaweicloud.sdk.oms.v2.model.UpdatePrivacyAgreementRecordRequest;
import com.huaweicloud.sdk.oms.v2.model.UpdatePrivacyAgreementRecordResponse;
import com.huaweicloud.sdk.oms.v2.model.UpdateTaskGroupRequest;
import com.huaweicloud.sdk.oms.v2.model.UpdateTaskGroupResponse;

public class OmsClient {

    protected HcClient hcClient;

    public OmsClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<OmsClient> newBuilder() {
        ClientBuilder<OmsClient> clientBuilder = new ClientBuilder<>(OmsClient::new);
        return clientBuilder;
    }

    /**
     * 批量更新任务
     *
     * 批量更新迁移任务，可指定单个迁移任务组下所有的迁移任务或通过迁移任务ID来执行。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUpdateTasksRequest 请求对象
     * @return BatchUpdateTasksResponse
     */
    public BatchUpdateTasksResponse batchUpdateTasks(BatchUpdateTasksRequest request) {
        return hcClient.syncInvokeHttp(request, OmsMeta.batchUpdateTasks);
    }

    /**
     * 批量更新任务
     *
     * 批量更新迁移任务，可指定单个迁移任务组下所有的迁移任务或通过迁移任务ID来执行。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUpdateTasksRequest 请求对象
     * @return SyncInvoker<BatchUpdateTasksRequest, BatchUpdateTasksResponse>
     */
    public SyncInvoker<BatchUpdateTasksRequest, BatchUpdateTasksResponse> batchUpdateTasksInvoker(
        BatchUpdateTasksRequest request) {
        return new SyncInvoker<>(request, OmsMeta.batchUpdateTasks, hcClient);
    }

    /**
     * 检查前缀是否在源端桶中存在
     *
     * 检查前缀是否在源端桶中存在
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckPrefixRequest 请求对象
     * @return CheckPrefixResponse
     */
    public CheckPrefixResponse checkPrefix(CheckPrefixRequest request) {
        return hcClient.syncInvokeHttp(request, OmsMeta.checkPrefix);
    }

    /**
     * 检查前缀是否在源端桶中存在
     *
     * 检查前缀是否在源端桶中存在
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckPrefixRequest 请求对象
     * @return SyncInvoker<CheckPrefixRequest, CheckPrefixResponse>
     */
    public SyncInvoker<CheckPrefixRequest, CheckPrefixResponse> checkPrefixInvoker(CheckPrefixRequest request) {
        return new SyncInvoker<>(request, OmsMeta.checkPrefix, hcClient);
    }

    /**
     * 创建同步事件
     *
     * 源端有对象需要进行同步时，调用该接口创建一个同步事件，系统将根据同步事件中包含的对象名称进行同步(目前只支持华北-北京四、华东-上海一地区)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSyncEventsRequest 请求对象
     * @return CreateSyncEventsResponse
     */
    public CreateSyncEventsResponse createSyncEvents(CreateSyncEventsRequest request) {
        return hcClient.syncInvokeHttp(request, OmsMeta.createSyncEvents);
    }

    /**
     * 创建同步事件
     *
     * 源端有对象需要进行同步时，调用该接口创建一个同步事件，系统将根据同步事件中包含的对象名称进行同步(目前只支持华北-北京四、华东-上海一地区)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSyncEventsRequest 请求对象
     * @return SyncInvoker<CreateSyncEventsRequest, CreateSyncEventsResponse>
     */
    public SyncInvoker<CreateSyncEventsRequest, CreateSyncEventsResponse> createSyncEventsInvoker(
        CreateSyncEventsRequest request) {
        return new SyncInvoker<>(request, OmsMeta.createSyncEvents, hcClient);
    }

    /**
     * 创建同步任务
     *
     * 创建同步任务，创建成功后，任务会被自动启动，不需要额外调用启动任务命令。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSyncTaskRequest 请求对象
     * @return CreateSyncTaskResponse
     */
    public CreateSyncTaskResponse createSyncTask(CreateSyncTaskRequest request) {
        return hcClient.syncInvokeHttp(request, OmsMeta.createSyncTask);
    }

    /**
     * 创建同步任务
     *
     * 创建同步任务，创建成功后，任务会被自动启动，不需要额外调用启动任务命令。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSyncTaskRequest 请求对象
     * @return SyncInvoker<CreateSyncTaskRequest, CreateSyncTaskResponse>
     */
    public SyncInvoker<CreateSyncTaskRequest, CreateSyncTaskResponse> createSyncTaskInvoker(
        CreateSyncTaskRequest request) {
        return new SyncInvoker<>(request, OmsMeta.createSyncTask, hcClient);
    }

    /**
     * 创建迁移任务
     *
     * 创建迁移任务，创建成功后，任务会被自动启动，不需要额外调用启动任务命令。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTaskRequest 请求对象
     * @return CreateTaskResponse
     */
    public CreateTaskResponse createTask(CreateTaskRequest request) {
        return hcClient.syncInvokeHttp(request, OmsMeta.createTask);
    }

    /**
     * 创建迁移任务
     *
     * 创建迁移任务，创建成功后，任务会被自动启动，不需要额外调用启动任务命令。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTaskRequest 请求对象
     * @return SyncInvoker<CreateTaskRequest, CreateTaskResponse>
     */
    public SyncInvoker<CreateTaskRequest, CreateTaskResponse> createTaskInvoker(CreateTaskRequest request) {
        return new SyncInvoker<>(request, OmsMeta.createTask, hcClient);
    }

    /**
     * 创建迁移任务组
     *
     * 创建迁移任务组，创建成功后，迁移任务组会自动创建迁移任务，不需要额外调用启动任务命令。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTaskGroupRequest 请求对象
     * @return CreateTaskGroupResponse
     */
    public CreateTaskGroupResponse createTaskGroup(CreateTaskGroupRequest request) {
        return hcClient.syncInvokeHttp(request, OmsMeta.createTaskGroup);
    }

    /**
     * 创建迁移任务组
     *
     * 创建迁移任务组，创建成功后，迁移任务组会自动创建迁移任务，不需要额外调用启动任务命令。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTaskGroupRequest 请求对象
     * @return SyncInvoker<CreateTaskGroupRequest, CreateTaskGroupResponse>
     */
    public SyncInvoker<CreateTaskGroupRequest, CreateTaskGroupResponse> createTaskGroupInvoker(
        CreateTaskGroupRequest request) {
        return new SyncInvoker<>(request, OmsMeta.createTaskGroup, hcClient);
    }

    /**
     * 删除同步任务
     *
     * 调用该接口删除同步任务。
     * 正在同步的任务不允许删除，如果删除会返回失败；若要删除，请先行暂停任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSyncTaskRequest 请求对象
     * @return DeleteSyncTaskResponse
     */
    public DeleteSyncTaskResponse deleteSyncTask(DeleteSyncTaskRequest request) {
        return hcClient.syncInvokeHttp(request, OmsMeta.deleteSyncTask);
    }

    /**
     * 删除同步任务
     *
     * 调用该接口删除同步任务。
     * 正在同步的任务不允许删除，如果删除会返回失败；若要删除，请先行暂停任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSyncTaskRequest 请求对象
     * @return SyncInvoker<DeleteSyncTaskRequest, DeleteSyncTaskResponse>
     */
    public SyncInvoker<DeleteSyncTaskRequest, DeleteSyncTaskResponse> deleteSyncTaskInvoker(
        DeleteSyncTaskRequest request) {
        return new SyncInvoker<>(request, OmsMeta.deleteSyncTask, hcClient);
    }

    /**
     * 删除迁移任务
     *
     * 调用该接口删除迁移任务。
     * 正在运行的任务不允许删除，如果删除会返回失败；若要删除，请先行暂停任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTaskRequest 请求对象
     * @return DeleteTaskResponse
     */
    public DeleteTaskResponse deleteTask(DeleteTaskRequest request) {
        return hcClient.syncInvokeHttp(request, OmsMeta.deleteTask);
    }

    /**
     * 删除迁移任务
     *
     * 调用该接口删除迁移任务。
     * 正在运行的任务不允许删除，如果删除会返回失败；若要删除，请先行暂停任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTaskRequest 请求对象
     * @return SyncInvoker<DeleteTaskRequest, DeleteTaskResponse>
     */
    public SyncInvoker<DeleteTaskRequest, DeleteTaskResponse> deleteTaskInvoker(DeleteTaskRequest request) {
        return new SyncInvoker<>(request, OmsMeta.deleteTask, hcClient);
    }

    /**
     * 删除指定id的迁移任务组
     *
     * 删除指定的迁移任务组.
     * 创建任务中、监控中、暂停中状态的任务不允许删除，如果删除会返回失败；若要删除，请先行暂停任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTaskGroupRequest 请求对象
     * @return DeleteTaskGroupResponse
     */
    public DeleteTaskGroupResponse deleteTaskGroup(DeleteTaskGroupRequest request) {
        return hcClient.syncInvokeHttp(request, OmsMeta.deleteTaskGroup);
    }

    /**
     * 删除指定id的迁移任务组
     *
     * 删除指定的迁移任务组.
     * 创建任务中、监控中、暂停中状态的任务不允许删除，如果删除会返回失败；若要删除，请先行暂停任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTaskGroupRequest 请求对象
     * @return SyncInvoker<DeleteTaskGroupRequest, DeleteTaskGroupResponse>
     */
    public SyncInvoker<DeleteTaskGroupRequest, DeleteTaskGroupResponse> deleteTaskGroupInvoker(
        DeleteTaskGroupRequest request) {
        return new SyncInvoker<>(request, OmsMeta.deleteTaskGroup, hcClient);
    }

    /**
     * 查询指定ID的同步任务统计数据
     *
     * 查询指定ID同步任务的接收同步请求对象数、同步成功对象数、同步失败对象数、同步跳过对象数、同步成功对象容量统计数据(目前只支持华北-北京四、华东-上海一地区)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSyncTaskStatisticRequest 请求对象
     * @return ListSyncTaskStatisticResponse
     */
    public ListSyncTaskStatisticResponse listSyncTaskStatistic(ListSyncTaskStatisticRequest request) {
        return hcClient.syncInvokeHttp(request, OmsMeta.listSyncTaskStatistic);
    }

    /**
     * 查询指定ID的同步任务统计数据
     *
     * 查询指定ID同步任务的接收同步请求对象数、同步成功对象数、同步失败对象数、同步跳过对象数、同步成功对象容量统计数据(目前只支持华北-北京四、华东-上海一地区)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSyncTaskStatisticRequest 请求对象
     * @return SyncInvoker<ListSyncTaskStatisticRequest, ListSyncTaskStatisticResponse>
     */
    public SyncInvoker<ListSyncTaskStatisticRequest, ListSyncTaskStatisticResponse> listSyncTaskStatisticInvoker(
        ListSyncTaskStatisticRequest request) {
        return new SyncInvoker<>(request, OmsMeta.listSyncTaskStatistic, hcClient);
    }

    /**
     * 查询同步任务列表
     *
     * 查询用户名下所有同步任务信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSyncTasksRequest 请求对象
     * @return ListSyncTasksResponse
     */
    public ListSyncTasksResponse listSyncTasks(ListSyncTasksRequest request) {
        return hcClient.syncInvokeHttp(request, OmsMeta.listSyncTasks);
    }

    /**
     * 查询同步任务列表
     *
     * 查询用户名下所有同步任务信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSyncTasksRequest 请求对象
     * @return SyncInvoker<ListSyncTasksRequest, ListSyncTasksResponse>
     */
    public SyncInvoker<ListSyncTasksRequest, ListSyncTasksResponse> listSyncTasksInvoker(ListSyncTasksRequest request) {
        return new SyncInvoker<>(request, OmsMeta.listSyncTasks, hcClient);
    }

    /**
     * 查询迁移任务组列表
     *
     * 查询用户账户下的任务组信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTaskGroupRequest 请求对象
     * @return ListTaskGroupResponse
     */
    public ListTaskGroupResponse listTaskGroup(ListTaskGroupRequest request) {
        return hcClient.syncInvokeHttp(request, OmsMeta.listTaskGroup);
    }

    /**
     * 查询迁移任务组列表
     *
     * 查询用户账户下的任务组信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTaskGroupRequest 请求对象
     * @return SyncInvoker<ListTaskGroupRequest, ListTaskGroupResponse>
     */
    public SyncInvoker<ListTaskGroupRequest, ListTaskGroupResponse> listTaskGroupInvoker(ListTaskGroupRequest request) {
        return new SyncInvoker<>(request, OmsMeta.listTaskGroup, hcClient);
    }

    /**
     * 查询迁移任务列表
     *
     * 查询用户账户下的所有任务信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTasksRequest 请求对象
     * @return ListTasksResponse
     */
    public ListTasksResponse listTasks(ListTasksRequest request) {
        return hcClient.syncInvokeHttp(request, OmsMeta.listTasks);
    }

    /**
     * 查询迁移任务列表
     *
     * 查询用户账户下的所有任务信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTasksRequest 请求对象
     * @return SyncInvoker<ListTasksRequest, ListTasksResponse>
     */
    public SyncInvoker<ListTasksRequest, ListTasksResponse> listTasksInvoker(ListTasksRequest request) {
        return new SyncInvoker<>(request, OmsMeta.listTasks, hcClient);
    }

    /**
     * 对已经失败的指定id迁移任务组进行重启
     *
     * 当迁移任务组处于迁移失败状态时，调用该接口重启指定id的迁移任务组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RetryTaskGroupRequest 请求对象
     * @return RetryTaskGroupResponse
     */
    public RetryTaskGroupResponse retryTaskGroup(RetryTaskGroupRequest request) {
        return hcClient.syncInvokeHttp(request, OmsMeta.retryTaskGroup);
    }

    /**
     * 对已经失败的指定id迁移任务组进行重启
     *
     * 当迁移任务组处于迁移失败状态时，调用该接口重启指定id的迁移任务组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RetryTaskGroupRequest 请求对象
     * @return SyncInvoker<RetryTaskGroupRequest, RetryTaskGroupResponse>
     */
    public SyncInvoker<RetryTaskGroupRequest, RetryTaskGroupResponse> retryTaskGroupInvoker(
        RetryTaskGroupRequest request) {
        return new SyncInvoker<>(request, OmsMeta.retryTaskGroup, hcClient);
    }

    /**
     * 查询桶列表
     *
     * 查询桶列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBucketListRequest 请求对象
     * @return ShowBucketListResponse
     */
    public ShowBucketListResponse showBucketList(ShowBucketListRequest request) {
        return hcClient.syncInvokeHttp(request, OmsMeta.showBucketList);
    }

    /**
     * 查询桶列表
     *
     * 查询桶列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBucketListRequest 请求对象
     * @return SyncInvoker<ShowBucketListRequest, ShowBucketListResponse>
     */
    public SyncInvoker<ShowBucketListRequest, ShowBucketListResponse> showBucketListInvoker(
        ShowBucketListRequest request) {
        return new SyncInvoker<>(request, OmsMeta.showBucketList, hcClient);
    }

    /**
     * 查询桶对象列表
     *
     * 查询桶对象列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBucketObjectsRequest 请求对象
     * @return ShowBucketObjectsResponse
     */
    public ShowBucketObjectsResponse showBucketObjects(ShowBucketObjectsRequest request) {
        return hcClient.syncInvokeHttp(request, OmsMeta.showBucketObjects);
    }

    /**
     * 查询桶对象列表
     *
     * 查询桶对象列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBucketObjectsRequest 请求对象
     * @return SyncInvoker<ShowBucketObjectsRequest, ShowBucketObjectsResponse>
     */
    public SyncInvoker<ShowBucketObjectsRequest, ShowBucketObjectsResponse> showBucketObjectsInvoker(
        ShowBucketObjectsRequest request) {
        return new SyncInvoker<>(request, OmsMeta.showBucketObjects, hcClient);
    }

    /**
     * 查询桶对应的region
     *
     * 查询桶对应的region
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBucketRegionRequest 请求对象
     * @return ShowBucketRegionResponse
     */
    public ShowBucketRegionResponse showBucketRegion(ShowBucketRegionRequest request) {
        return hcClient.syncInvokeHttp(request, OmsMeta.showBucketRegion);
    }

    /**
     * 查询桶对应的region
     *
     * 查询桶对应的region
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBucketRegionRequest 请求对象
     * @return SyncInvoker<ShowBucketRegionRequest, ShowBucketRegionResponse>
     */
    public SyncInvoker<ShowBucketRegionRequest, ShowBucketRegionResponse> showBucketRegionInvoker(
        ShowBucketRegionRequest request) {
        return new SyncInvoker<>(request, OmsMeta.showBucketRegion, hcClient);
    }

    /**
     * 查桶对应的CDN信息
     *
     * 查桶对应的CDN信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCdnInfoRequest 请求对象
     * @return ShowCdnInfoResponse
     */
    public ShowCdnInfoResponse showCdnInfo(ShowCdnInfoRequest request) {
        return hcClient.syncInvokeHttp(request, OmsMeta.showCdnInfo);
    }

    /**
     * 查桶对应的CDN信息
     *
     * 查桶对应的CDN信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCdnInfoRequest 请求对象
     * @return SyncInvoker<ShowCdnInfoRequest, ShowCdnInfoResponse>
     */
    public SyncInvoker<ShowCdnInfoRequest, ShowCdnInfoResponse> showCdnInfoInvoker(ShowCdnInfoRequest request) {
        return new SyncInvoker<>(request, OmsMeta.showCdnInfo, hcClient);
    }

    /**
     * 查询所有支持的云厂商
     *
     * 查询所有支持的云厂商
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCloudTypeRequest 请求对象
     * @return ShowCloudTypeResponse
     */
    public ShowCloudTypeResponse showCloudType(ShowCloudTypeRequest request) {
        return hcClient.syncInvokeHttp(request, OmsMeta.showCloudType);
    }

    /**
     * 查询所有支持的云厂商
     *
     * 查询所有支持的云厂商
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCloudTypeRequest 请求对象
     * @return SyncInvoker<ShowCloudTypeRequest, ShowCloudTypeResponse>
     */
    public SyncInvoker<ShowCloudTypeRequest, ShowCloudTypeResponse> showCloudTypeInvoker(ShowCloudTypeRequest request) {
        return new SyncInvoker<>(request, OmsMeta.showCloudType, hcClient);
    }

    /**
     * 查询云厂商支持的region
     *
     * 查询云厂商支持的region
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRegionInfoRequest 请求对象
     * @return ShowRegionInfoResponse
     */
    public ShowRegionInfoResponse showRegionInfo(ShowRegionInfoRequest request) {
        return hcClient.syncInvokeHttp(request, OmsMeta.showRegionInfo);
    }

    /**
     * 查询云厂商支持的region
     *
     * 查询云厂商支持的region
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRegionInfoRequest 请求对象
     * @return SyncInvoker<ShowRegionInfoRequest, ShowRegionInfoResponse>
     */
    public SyncInvoker<ShowRegionInfoRequest, ShowRegionInfoResponse> showRegionInfoInvoker(
        ShowRegionInfoRequest request) {
        return new SyncInvoker<>(request, OmsMeta.showRegionInfo, hcClient);
    }

    /**
     * 查询指定ID的同步任务详情
     *
     * 查询指定ID的同步任务详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSyncTaskRequest 请求对象
     * @return ShowSyncTaskResponse
     */
    public ShowSyncTaskResponse showSyncTask(ShowSyncTaskRequest request) {
        return hcClient.syncInvokeHttp(request, OmsMeta.showSyncTask);
    }

    /**
     * 查询指定ID的同步任务详情
     *
     * 查询指定ID的同步任务详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSyncTaskRequest 请求对象
     * @return SyncInvoker<ShowSyncTaskRequest, ShowSyncTaskResponse>
     */
    public SyncInvoker<ShowSyncTaskRequest, ShowSyncTaskResponse> showSyncTaskInvoker(ShowSyncTaskRequest request) {
        return new SyncInvoker<>(request, OmsMeta.showSyncTask, hcClient);
    }

    /**
     * 查询指定ID的任务详情
     *
     * 查询指定ID的任务详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTaskRequest 请求对象
     * @return ShowTaskResponse
     */
    public ShowTaskResponse showTask(ShowTaskRequest request) {
        return hcClient.syncInvokeHttp(request, OmsMeta.showTask);
    }

    /**
     * 查询指定ID的任务详情
     *
     * 查询指定ID的任务详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTaskRequest 请求对象
     * @return SyncInvoker<ShowTaskRequest, ShowTaskResponse>
     */
    public SyncInvoker<ShowTaskRequest, ShowTaskResponse> showTaskInvoker(ShowTaskRequest request) {
        return new SyncInvoker<>(request, OmsMeta.showTask, hcClient);
    }

    /**
     * 获取指定id的taskgroup信息
     *
     * 获取指定id的taskgroup信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTaskGroupRequest 请求对象
     * @return ShowTaskGroupResponse
     */
    public ShowTaskGroupResponse showTaskGroup(ShowTaskGroupRequest request) {
        return hcClient.syncInvokeHttp(request, OmsMeta.showTaskGroup);
    }

    /**
     * 获取指定id的taskgroup信息
     *
     * 获取指定id的taskgroup信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTaskGroupRequest 请求对象
     * @return SyncInvoker<ShowTaskGroupRequest, ShowTaskGroupResponse>
     */
    public SyncInvoker<ShowTaskGroupRequest, ShowTaskGroupResponse> showTaskGroupInvoker(ShowTaskGroupRequest request) {
        return new SyncInvoker<>(request, OmsMeta.showTaskGroup, hcClient);
    }

    /**
     * 启动同步任务
     *
     * 同步任务停止后，调用该接口以启动同步任务(目前只支持华北-北京四、华东-上海一地区)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartSyncTaskRequest 请求对象
     * @return StartSyncTaskResponse
     */
    public StartSyncTaskResponse startSyncTask(StartSyncTaskRequest request) {
        return hcClient.syncInvokeHttp(request, OmsMeta.startSyncTask);
    }

    /**
     * 启动同步任务
     *
     * 同步任务停止后，调用该接口以启动同步任务(目前只支持华北-北京四、华东-上海一地区)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartSyncTaskRequest 请求对象
     * @return SyncInvoker<StartSyncTaskRequest, StartSyncTaskResponse>
     */
    public SyncInvoker<StartSyncTaskRequest, StartSyncTaskResponse> startSyncTaskInvoker(StartSyncTaskRequest request) {
        return new SyncInvoker<>(request, OmsMeta.startSyncTask, hcClient);
    }

    /**
     * 启动迁移任务
     *
     * 迁移任务暂停或失败后，调用该接口以启动任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartTaskRequest 请求对象
     * @return StartTaskResponse
     */
    public StartTaskResponse startTask(StartTaskRequest request) {
        return hcClient.syncInvokeHttp(request, OmsMeta.startTask);
    }

    /**
     * 启动迁移任务
     *
     * 迁移任务暂停或失败后，调用该接口以启动任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartTaskRequest 请求对象
     * @return SyncInvoker<StartTaskRequest, StartTaskResponse>
     */
    public SyncInvoker<StartTaskRequest, StartTaskResponse> startTaskInvoker(StartTaskRequest request) {
        return new SyncInvoker<>(request, OmsMeta.startTask, hcClient);
    }

    /**
     * 恢复指定id的迁移任务组
     *
     * 当迁移任务组处于暂停状态时，调用该接口启动指定id的迁移任务组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartTaskGroupRequest 请求对象
     * @return StartTaskGroupResponse
     */
    public StartTaskGroupResponse startTaskGroup(StartTaskGroupRequest request) {
        return hcClient.syncInvokeHttp(request, OmsMeta.startTaskGroup);
    }

    /**
     * 恢复指定id的迁移任务组
     *
     * 当迁移任务组处于暂停状态时，调用该接口启动指定id的迁移任务组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartTaskGroupRequest 请求对象
     * @return SyncInvoker<StartTaskGroupRequest, StartTaskGroupResponse>
     */
    public SyncInvoker<StartTaskGroupRequest, StartTaskGroupResponse> startTaskGroupInvoker(
        StartTaskGroupRequest request) {
        return new SyncInvoker<>(request, OmsMeta.startTaskGroup, hcClient);
    }

    /**
     * 暂停同步任务
     *
     * 当同步任务处于同步中时，调用该接口停止任务(目前只支持华北-北京四、华东-上海一地区)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopSyncTaskRequest 请求对象
     * @return StopSyncTaskResponse
     */
    public StopSyncTaskResponse stopSyncTask(StopSyncTaskRequest request) {
        return hcClient.syncInvokeHttp(request, OmsMeta.stopSyncTask);
    }

    /**
     * 暂停同步任务
     *
     * 当同步任务处于同步中时，调用该接口停止任务(目前只支持华北-北京四、华东-上海一地区)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopSyncTaskRequest 请求对象
     * @return SyncInvoker<StopSyncTaskRequest, StopSyncTaskResponse>
     */
    public SyncInvoker<StopSyncTaskRequest, StopSyncTaskResponse> stopSyncTaskInvoker(StopSyncTaskRequest request) {
        return new SyncInvoker<>(request, OmsMeta.stopSyncTask, hcClient);
    }

    /**
     * 暂停迁移任务
     *
     * 当迁移任务处于迁移中时，调用该接口停止任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopTaskRequest 请求对象
     * @return StopTaskResponse
     */
    public StopTaskResponse stopTask(StopTaskRequest request) {
        return hcClient.syncInvokeHttp(request, OmsMeta.stopTask);
    }

    /**
     * 暂停迁移任务
     *
     * 当迁移任务处于迁移中时，调用该接口停止任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopTaskRequest 请求对象
     * @return SyncInvoker<StopTaskRequest, StopTaskResponse>
     */
    public SyncInvoker<StopTaskRequest, StopTaskResponse> stopTaskInvoker(StopTaskRequest request) {
        return new SyncInvoker<>(request, OmsMeta.stopTask, hcClient);
    }

    /**
     * 暂停指定id的迁移任务组
     *
     * 当迁移任务组处于创建任务中或监控中时，调用该接口暂停指定迁移任务组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopTaskGroupRequest 请求对象
     * @return StopTaskGroupResponse
     */
    public StopTaskGroupResponse stopTaskGroup(StopTaskGroupRequest request) {
        return hcClient.syncInvokeHttp(request, OmsMeta.stopTaskGroup);
    }

    /**
     * 暂停指定id的迁移任务组
     *
     * 当迁移任务组处于创建任务中或监控中时，调用该接口暂停指定迁移任务组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopTaskGroupRequest 请求对象
     * @return SyncInvoker<StopTaskGroupRequest, StopTaskGroupResponse>
     */
    public SyncInvoker<StopTaskGroupRequest, StopTaskGroupResponse> stopTaskGroupInvoker(StopTaskGroupRequest request) {
        return new SyncInvoker<>(request, OmsMeta.stopTaskGroup, hcClient);
    }

    /**
     * 更新任务带宽策略
     *
     * 当迁移任务未执行完成时，修改迁移任务的流量控制策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateBandwidthPolicyRequest 请求对象
     * @return UpdateBandwidthPolicyResponse
     */
    public UpdateBandwidthPolicyResponse updateBandwidthPolicy(UpdateBandwidthPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, OmsMeta.updateBandwidthPolicy);
    }

    /**
     * 更新任务带宽策略
     *
     * 当迁移任务未执行完成时，修改迁移任务的流量控制策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateBandwidthPolicyRequest 请求对象
     * @return SyncInvoker<UpdateBandwidthPolicyRequest, UpdateBandwidthPolicyResponse>
     */
    public SyncInvoker<UpdateBandwidthPolicyRequest, UpdateBandwidthPolicyResponse> updateBandwidthPolicyInvoker(
        UpdateBandwidthPolicyRequest request) {
        return new SyncInvoker<>(request, OmsMeta.updateBandwidthPolicy, hcClient);
    }

    /**
     * 同意隐私协议
     *
     * 创建迁移任务、任务组、评估任务时，记录用户同意隐私协议。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePrivacyAgreementRecordRequest 请求对象
     * @return UpdatePrivacyAgreementRecordResponse
     */
    public UpdatePrivacyAgreementRecordResponse updatePrivacyAgreementRecord(
        UpdatePrivacyAgreementRecordRequest request) {
        return hcClient.syncInvokeHttp(request, OmsMeta.updatePrivacyAgreementRecord);
    }

    /**
     * 同意隐私协议
     *
     * 创建迁移任务、任务组、评估任务时，记录用户同意隐私协议。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePrivacyAgreementRecordRequest 请求对象
     * @return SyncInvoker<UpdatePrivacyAgreementRecordRequest, UpdatePrivacyAgreementRecordResponse>
     */
    public SyncInvoker<UpdatePrivacyAgreementRecordRequest, UpdatePrivacyAgreementRecordResponse> updatePrivacyAgreementRecordInvoker(
        UpdatePrivacyAgreementRecordRequest request) {
        return new SyncInvoker<>(request, OmsMeta.updatePrivacyAgreementRecord, hcClient);
    }

    /**
     * 更新指定id的迁移任务组的流控策略
     *
     * 当迁移任务组未执行完成时，修改迁移任务组的流量控制策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTaskGroupRequest 请求对象
     * @return UpdateTaskGroupResponse
     */
    public UpdateTaskGroupResponse updateTaskGroup(UpdateTaskGroupRequest request) {
        return hcClient.syncInvokeHttp(request, OmsMeta.updateTaskGroup);
    }

    /**
     * 更新指定id的迁移任务组的流控策略
     *
     * 当迁移任务组未执行完成时，修改迁移任务组的流量控制策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTaskGroupRequest 请求对象
     * @return SyncInvoker<UpdateTaskGroupRequest, UpdateTaskGroupResponse>
     */
    public SyncInvoker<UpdateTaskGroupRequest, UpdateTaskGroupResponse> updateTaskGroupInvoker(
        UpdateTaskGroupRequest request) {
        return new SyncInvoker<>(request, OmsMeta.updateTaskGroup, hcClient);
    }

    /**
     * 查询API版本信息列表
     *
     * 查询对象存储迁移服务的API版本信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApiVersionsRequest 请求对象
     * @return ListApiVersionsResponse
     */
    public ListApiVersionsResponse listApiVersions(ListApiVersionsRequest request) {
        return hcClient.syncInvokeHttp(request, OmsMeta.listApiVersions);
    }

    /**
     * 查询API版本信息列表
     *
     * 查询对象存储迁移服务的API版本信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApiVersionsRequest 请求对象
     * @return SyncInvoker<ListApiVersionsRequest, ListApiVersionsResponse>
     */
    public SyncInvoker<ListApiVersionsRequest, ListApiVersionsResponse> listApiVersionsInvoker(
        ListApiVersionsRequest request) {
        return new SyncInvoker<>(request, OmsMeta.listApiVersions, hcClient);
    }

    /**
     * 查询指定API版本信息
     *
     * 查询对象存储迁移服务指定API版本信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowApiInfoRequest 请求对象
     * @return ShowApiInfoResponse
     */
    public ShowApiInfoResponse showApiInfo(ShowApiInfoRequest request) {
        return hcClient.syncInvokeHttp(request, OmsMeta.showApiInfo);
    }

    /**
     * 查询指定API版本信息
     *
     * 查询对象存储迁移服务指定API版本信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowApiInfoRequest 请求对象
     * @return SyncInvoker<ShowApiInfoRequest, ShowApiInfoResponse>
     */
    public SyncInvoker<ShowApiInfoRequest, ShowApiInfoResponse> showApiInfoInvoker(ShowApiInfoRequest request) {
        return new SyncInvoker<>(request, OmsMeta.showApiInfo, hcClient);
    }

}
