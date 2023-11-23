package com.huaweicloud.sdk.oms.v2;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
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
import com.huaweicloud.sdk.oms.v2.model.UpdateTaskGroupRequest;
import com.huaweicloud.sdk.oms.v2.model.UpdateTaskGroupResponse;

import java.util.concurrent.CompletableFuture;

public class OmsAsyncClient {

    protected HcClient hcClient;

    public OmsAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<OmsAsyncClient> newBuilder() {
        ClientBuilder<OmsAsyncClient> clientBuilder = new ClientBuilder<>(OmsAsyncClient::new);
        return clientBuilder;
    }

    /**
     * 检查前缀是否在源端桶中存在
     *
     * 检查前缀是否在源端桶中存在
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CheckPrefixRequest 请求对象
     * @return CompletableFuture<CheckPrefixResponse>
     */
    public CompletableFuture<CheckPrefixResponse> checkPrefixAsync(CheckPrefixRequest request) {
        return hcClient.asyncInvokeHttp(request, OmsMeta.checkPrefix);
    }

    /**
     * 检查前缀是否在源端桶中存在
     *
     * 检查前缀是否在源端桶中存在
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CheckPrefixRequest 请求对象
     * @return AsyncInvoker<CheckPrefixRequest, CheckPrefixResponse>
     */
    public AsyncInvoker<CheckPrefixRequest, CheckPrefixResponse> checkPrefixAsyncInvoker(CheckPrefixRequest request) {
        return new AsyncInvoker<CheckPrefixRequest, CheckPrefixResponse>(request, OmsMeta.checkPrefix, hcClient);
    }

    /**
     * 创建同步事件
     *
     * 源端有对象需要进行同步时，调用该接口创建一个同步事件，系统将根据同步事件中包含的对象名称进行同步(目前只支持华北-北京四、华东-上海一地区)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateSyncEventsRequest 请求对象
     * @return CompletableFuture<CreateSyncEventsResponse>
     */
    public CompletableFuture<CreateSyncEventsResponse> createSyncEventsAsync(CreateSyncEventsRequest request) {
        return hcClient.asyncInvokeHttp(request, OmsMeta.createSyncEvents);
    }

    /**
     * 创建同步事件
     *
     * 源端有对象需要进行同步时，调用该接口创建一个同步事件，系统将根据同步事件中包含的对象名称进行同步(目前只支持华北-北京四、华东-上海一地区)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateSyncEventsRequest 请求对象
     * @return AsyncInvoker<CreateSyncEventsRequest, CreateSyncEventsResponse>
     */
    public AsyncInvoker<CreateSyncEventsRequest, CreateSyncEventsResponse> createSyncEventsAsyncInvoker(
        CreateSyncEventsRequest request) {
        return new AsyncInvoker<CreateSyncEventsRequest, CreateSyncEventsResponse>(request, OmsMeta.createSyncEvents,
            hcClient);
    }

    /**
     * 创建同步任务
     *
     * 创建同步任务，创建成功后，任务会被自动启动，不需要额外调用启动任务命令。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateSyncTaskRequest 请求对象
     * @return CompletableFuture<CreateSyncTaskResponse>
     */
    public CompletableFuture<CreateSyncTaskResponse> createSyncTaskAsync(CreateSyncTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, OmsMeta.createSyncTask);
    }

    /**
     * 创建同步任务
     *
     * 创建同步任务，创建成功后，任务会被自动启动，不需要额外调用启动任务命令。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateSyncTaskRequest 请求对象
     * @return AsyncInvoker<CreateSyncTaskRequest, CreateSyncTaskResponse>
     */
    public AsyncInvoker<CreateSyncTaskRequest, CreateSyncTaskResponse> createSyncTaskAsyncInvoker(
        CreateSyncTaskRequest request) {
        return new AsyncInvoker<CreateSyncTaskRequest, CreateSyncTaskResponse>(request, OmsMeta.createSyncTask,
            hcClient);
    }

    /**
     * 创建迁移任务
     *
     * 创建迁移任务，创建成功后，任务会被自动启动，不需要额外调用启动任务命令。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateTaskRequest 请求对象
     * @return CompletableFuture<CreateTaskResponse>
     */
    public CompletableFuture<CreateTaskResponse> createTaskAsync(CreateTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, OmsMeta.createTask);
    }

    /**
     * 创建迁移任务
     *
     * 创建迁移任务，创建成功后，任务会被自动启动，不需要额外调用启动任务命令。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateTaskRequest 请求对象
     * @return AsyncInvoker<CreateTaskRequest, CreateTaskResponse>
     */
    public AsyncInvoker<CreateTaskRequest, CreateTaskResponse> createTaskAsyncInvoker(CreateTaskRequest request) {
        return new AsyncInvoker<CreateTaskRequest, CreateTaskResponse>(request, OmsMeta.createTask, hcClient);
    }

    /**
     * 创建迁移任务组
     *
     * 创建迁移任务组，创建成功后，迁移任务组会自动创建迁移任务，不需要额外调用启动任务命令。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateTaskGroupRequest 请求对象
     * @return CompletableFuture<CreateTaskGroupResponse>
     */
    public CompletableFuture<CreateTaskGroupResponse> createTaskGroupAsync(CreateTaskGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, OmsMeta.createTaskGroup);
    }

    /**
     * 创建迁移任务组
     *
     * 创建迁移任务组，创建成功后，迁移任务组会自动创建迁移任务，不需要额外调用启动任务命令。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateTaskGroupRequest 请求对象
     * @return AsyncInvoker<CreateTaskGroupRequest, CreateTaskGroupResponse>
     */
    public AsyncInvoker<CreateTaskGroupRequest, CreateTaskGroupResponse> createTaskGroupAsyncInvoker(
        CreateTaskGroupRequest request) {
        return new AsyncInvoker<CreateTaskGroupRequest, CreateTaskGroupResponse>(request, OmsMeta.createTaskGroup,
            hcClient);
    }

    /**
     * 删除同步任务
     *
     * 调用该接口删除同步任务。
     * 正在同步的任务不允许删除，如果删除会返回失败；若要删除，请先行暂停任务(目前只支持华北-北京四、华东-上海一地区)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteSyncTaskRequest 请求对象
     * @return CompletableFuture<DeleteSyncTaskResponse>
     */
    public CompletableFuture<DeleteSyncTaskResponse> deleteSyncTaskAsync(DeleteSyncTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, OmsMeta.deleteSyncTask);
    }

    /**
     * 删除同步任务
     *
     * 调用该接口删除同步任务。
     * 正在同步的任务不允许删除，如果删除会返回失败；若要删除，请先行暂停任务(目前只支持华北-北京四、华东-上海一地区)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteSyncTaskRequest 请求对象
     * @return AsyncInvoker<DeleteSyncTaskRequest, DeleteSyncTaskResponse>
     */
    public AsyncInvoker<DeleteSyncTaskRequest, DeleteSyncTaskResponse> deleteSyncTaskAsyncInvoker(
        DeleteSyncTaskRequest request) {
        return new AsyncInvoker<DeleteSyncTaskRequest, DeleteSyncTaskResponse>(request, OmsMeta.deleteSyncTask,
            hcClient);
    }

    /**
     * 删除迁移任务
     *
     * 调用该接口删除迁移任务。
     * 正在运行的任务不允许删除，如果删除会返回失败；若要删除，请先行暂停任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteTaskRequest 请求对象
     * @return CompletableFuture<DeleteTaskResponse>
     */
    public CompletableFuture<DeleteTaskResponse> deleteTaskAsync(DeleteTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, OmsMeta.deleteTask);
    }

    /**
     * 删除迁移任务
     *
     * 调用该接口删除迁移任务。
     * 正在运行的任务不允许删除，如果删除会返回失败；若要删除，请先行暂停任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteTaskRequest 请求对象
     * @return AsyncInvoker<DeleteTaskRequest, DeleteTaskResponse>
     */
    public AsyncInvoker<DeleteTaskRequest, DeleteTaskResponse> deleteTaskAsyncInvoker(DeleteTaskRequest request) {
        return new AsyncInvoker<DeleteTaskRequest, DeleteTaskResponse>(request, OmsMeta.deleteTask, hcClient);
    }

    /**
     * 删除指定id的迁移任务组
     *
     * 删除指定的迁移任务组.
     * 创建任务中、监控中、暂停中状态的任务不允许删除，如果删除会返回失败；若要删除，请先行暂停任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteTaskGroupRequest 请求对象
     * @return CompletableFuture<DeleteTaskGroupResponse>
     */
    public CompletableFuture<DeleteTaskGroupResponse> deleteTaskGroupAsync(DeleteTaskGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, OmsMeta.deleteTaskGroup);
    }

    /**
     * 删除指定id的迁移任务组
     *
     * 删除指定的迁移任务组.
     * 创建任务中、监控中、暂停中状态的任务不允许删除，如果删除会返回失败；若要删除，请先行暂停任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteTaskGroupRequest 请求对象
     * @return AsyncInvoker<DeleteTaskGroupRequest, DeleteTaskGroupResponse>
     */
    public AsyncInvoker<DeleteTaskGroupRequest, DeleteTaskGroupResponse> deleteTaskGroupAsyncInvoker(
        DeleteTaskGroupRequest request) {
        return new AsyncInvoker<DeleteTaskGroupRequest, DeleteTaskGroupResponse>(request, OmsMeta.deleteTaskGroup,
            hcClient);
    }

    /**
     * 查询指定ID的同步任务统计数据
     *
     * 查询指定ID同步任务的接收同步请求对象数、同步成功对象数、同步失败对象数、同步跳过对象数、同步成功对象容量统计数据(目前只支持华北-北京四、华东-上海一地区)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSyncTaskStatisticRequest 请求对象
     * @return CompletableFuture<ListSyncTaskStatisticResponse>
     */
    public CompletableFuture<ListSyncTaskStatisticResponse> listSyncTaskStatisticAsync(
        ListSyncTaskStatisticRequest request) {
        return hcClient.asyncInvokeHttp(request, OmsMeta.listSyncTaskStatistic);
    }

    /**
     * 查询指定ID的同步任务统计数据
     *
     * 查询指定ID同步任务的接收同步请求对象数、同步成功对象数、同步失败对象数、同步跳过对象数、同步成功对象容量统计数据(目前只支持华北-北京四、华东-上海一地区)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSyncTaskStatisticRequest 请求对象
     * @return AsyncInvoker<ListSyncTaskStatisticRequest, ListSyncTaskStatisticResponse>
     */
    public AsyncInvoker<ListSyncTaskStatisticRequest, ListSyncTaskStatisticResponse> listSyncTaskStatisticAsyncInvoker(
        ListSyncTaskStatisticRequest request) {
        return new AsyncInvoker<ListSyncTaskStatisticRequest, ListSyncTaskStatisticResponse>(request,
            OmsMeta.listSyncTaskStatistic, hcClient);
    }

    /**
     * 查询同步任务列表
     *
     * 查询用户名下所有同步任务信息(目前只支持华北-北京四、华东-上海一地区)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSyncTasksRequest 请求对象
     * @return CompletableFuture<ListSyncTasksResponse>
     */
    public CompletableFuture<ListSyncTasksResponse> listSyncTasksAsync(ListSyncTasksRequest request) {
        return hcClient.asyncInvokeHttp(request, OmsMeta.listSyncTasks);
    }

    /**
     * 查询同步任务列表
     *
     * 查询用户名下所有同步任务信息(目前只支持华北-北京四、华东-上海一地区)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSyncTasksRequest 请求对象
     * @return AsyncInvoker<ListSyncTasksRequest, ListSyncTasksResponse>
     */
    public AsyncInvoker<ListSyncTasksRequest, ListSyncTasksResponse> listSyncTasksAsyncInvoker(
        ListSyncTasksRequest request) {
        return new AsyncInvoker<ListSyncTasksRequest, ListSyncTasksResponse>(request, OmsMeta.listSyncTasks, hcClient);
    }

    /**
     * 查询迁移任务组列表
     *
     * 查询用户账户下的任务组信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTaskGroupRequest 请求对象
     * @return CompletableFuture<ListTaskGroupResponse>
     */
    public CompletableFuture<ListTaskGroupResponse> listTaskGroupAsync(ListTaskGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, OmsMeta.listTaskGroup);
    }

    /**
     * 查询迁移任务组列表
     *
     * 查询用户账户下的任务组信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTaskGroupRequest 请求对象
     * @return AsyncInvoker<ListTaskGroupRequest, ListTaskGroupResponse>
     */
    public AsyncInvoker<ListTaskGroupRequest, ListTaskGroupResponse> listTaskGroupAsyncInvoker(
        ListTaskGroupRequest request) {
        return new AsyncInvoker<ListTaskGroupRequest, ListTaskGroupResponse>(request, OmsMeta.listTaskGroup, hcClient);
    }

    /**
     * 查询迁移任务列表
     *
     * 查询用户账户下的所有任务信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTasksRequest 请求对象
     * @return CompletableFuture<ListTasksResponse>
     */
    public CompletableFuture<ListTasksResponse> listTasksAsync(ListTasksRequest request) {
        return hcClient.asyncInvokeHttp(request, OmsMeta.listTasks);
    }

    /**
     * 查询迁移任务列表
     *
     * 查询用户账户下的所有任务信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTasksRequest 请求对象
     * @return AsyncInvoker<ListTasksRequest, ListTasksResponse>
     */
    public AsyncInvoker<ListTasksRequest, ListTasksResponse> listTasksAsyncInvoker(ListTasksRequest request) {
        return new AsyncInvoker<ListTasksRequest, ListTasksResponse>(request, OmsMeta.listTasks, hcClient);
    }

    /**
     * 对已经失败的指定id迁移任务组进行重启
     *
     * 当迁移任务组处于迁移失败状态时，调用该接口重启指定id的迁移任务组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RetryTaskGroupRequest 请求对象
     * @return CompletableFuture<RetryTaskGroupResponse>
     */
    public CompletableFuture<RetryTaskGroupResponse> retryTaskGroupAsync(RetryTaskGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, OmsMeta.retryTaskGroup);
    }

    /**
     * 对已经失败的指定id迁移任务组进行重启
     *
     * 当迁移任务组处于迁移失败状态时，调用该接口重启指定id的迁移任务组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RetryTaskGroupRequest 请求对象
     * @return AsyncInvoker<RetryTaskGroupRequest, RetryTaskGroupResponse>
     */
    public AsyncInvoker<RetryTaskGroupRequest, RetryTaskGroupResponse> retryTaskGroupAsyncInvoker(
        RetryTaskGroupRequest request) {
        return new AsyncInvoker<RetryTaskGroupRequest, RetryTaskGroupResponse>(request, OmsMeta.retryTaskGroup,
            hcClient);
    }

    /**
     * 查询桶列表
     *
     * 查询桶列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowBucketListRequest 请求对象
     * @return CompletableFuture<ShowBucketListResponse>
     */
    public CompletableFuture<ShowBucketListResponse> showBucketListAsync(ShowBucketListRequest request) {
        return hcClient.asyncInvokeHttp(request, OmsMeta.showBucketList);
    }

    /**
     * 查询桶列表
     *
     * 查询桶列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowBucketListRequest 请求对象
     * @return AsyncInvoker<ShowBucketListRequest, ShowBucketListResponse>
     */
    public AsyncInvoker<ShowBucketListRequest, ShowBucketListResponse> showBucketListAsyncInvoker(
        ShowBucketListRequest request) {
        return new AsyncInvoker<ShowBucketListRequest, ShowBucketListResponse>(request, OmsMeta.showBucketList,
            hcClient);
    }

    /**
     * 查询桶对象列表
     *
     * 查询桶对象列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowBucketObjectsRequest 请求对象
     * @return CompletableFuture<ShowBucketObjectsResponse>
     */
    public CompletableFuture<ShowBucketObjectsResponse> showBucketObjectsAsync(ShowBucketObjectsRequest request) {
        return hcClient.asyncInvokeHttp(request, OmsMeta.showBucketObjects);
    }

    /**
     * 查询桶对象列表
     *
     * 查询桶对象列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowBucketObjectsRequest 请求对象
     * @return AsyncInvoker<ShowBucketObjectsRequest, ShowBucketObjectsResponse>
     */
    public AsyncInvoker<ShowBucketObjectsRequest, ShowBucketObjectsResponse> showBucketObjectsAsyncInvoker(
        ShowBucketObjectsRequest request) {
        return new AsyncInvoker<ShowBucketObjectsRequest, ShowBucketObjectsResponse>(request, OmsMeta.showBucketObjects,
            hcClient);
    }

    /**
     * 查询桶对应的region
     *
     * 查询桶对应的region
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowBucketRegionRequest 请求对象
     * @return CompletableFuture<ShowBucketRegionResponse>
     */
    public CompletableFuture<ShowBucketRegionResponse> showBucketRegionAsync(ShowBucketRegionRequest request) {
        return hcClient.asyncInvokeHttp(request, OmsMeta.showBucketRegion);
    }

    /**
     * 查询桶对应的region
     *
     * 查询桶对应的region
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowBucketRegionRequest 请求对象
     * @return AsyncInvoker<ShowBucketRegionRequest, ShowBucketRegionResponse>
     */
    public AsyncInvoker<ShowBucketRegionRequest, ShowBucketRegionResponse> showBucketRegionAsyncInvoker(
        ShowBucketRegionRequest request) {
        return new AsyncInvoker<ShowBucketRegionRequest, ShowBucketRegionResponse>(request, OmsMeta.showBucketRegion,
            hcClient);
    }

    /**
     * 查桶对应的CDN信息
     *
     * 查桶对应的CDN信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowCdnInfoRequest 请求对象
     * @return CompletableFuture<ShowCdnInfoResponse>
     */
    public CompletableFuture<ShowCdnInfoResponse> showCdnInfoAsync(ShowCdnInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, OmsMeta.showCdnInfo);
    }

    /**
     * 查桶对应的CDN信息
     *
     * 查桶对应的CDN信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowCdnInfoRequest 请求对象
     * @return AsyncInvoker<ShowCdnInfoRequest, ShowCdnInfoResponse>
     */
    public AsyncInvoker<ShowCdnInfoRequest, ShowCdnInfoResponse> showCdnInfoAsyncInvoker(ShowCdnInfoRequest request) {
        return new AsyncInvoker<ShowCdnInfoRequest, ShowCdnInfoResponse>(request, OmsMeta.showCdnInfo, hcClient);
    }

    /**
     * 查询所有支持的云厂商
     *
     * 查询所有支持的云厂商
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowCloudTypeRequest 请求对象
     * @return CompletableFuture<ShowCloudTypeResponse>
     */
    public CompletableFuture<ShowCloudTypeResponse> showCloudTypeAsync(ShowCloudTypeRequest request) {
        return hcClient.asyncInvokeHttp(request, OmsMeta.showCloudType);
    }

    /**
     * 查询所有支持的云厂商
     *
     * 查询所有支持的云厂商
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowCloudTypeRequest 请求对象
     * @return AsyncInvoker<ShowCloudTypeRequest, ShowCloudTypeResponse>
     */
    public AsyncInvoker<ShowCloudTypeRequest, ShowCloudTypeResponse> showCloudTypeAsyncInvoker(
        ShowCloudTypeRequest request) {
        return new AsyncInvoker<ShowCloudTypeRequest, ShowCloudTypeResponse>(request, OmsMeta.showCloudType, hcClient);
    }

    /**
     * 查询云厂商支持的reigon
     *
     * 查询云厂商支持的reigon
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowRegionInfoRequest 请求对象
     * @return CompletableFuture<ShowRegionInfoResponse>
     */
    public CompletableFuture<ShowRegionInfoResponse> showRegionInfoAsync(ShowRegionInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, OmsMeta.showRegionInfo);
    }

    /**
     * 查询云厂商支持的reigon
     *
     * 查询云厂商支持的reigon
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowRegionInfoRequest 请求对象
     * @return AsyncInvoker<ShowRegionInfoRequest, ShowRegionInfoResponse>
     */
    public AsyncInvoker<ShowRegionInfoRequest, ShowRegionInfoResponse> showRegionInfoAsyncInvoker(
        ShowRegionInfoRequest request) {
        return new AsyncInvoker<ShowRegionInfoRequest, ShowRegionInfoResponse>(request, OmsMeta.showRegionInfo,
            hcClient);
    }

    /**
     * 查询指定ID的同步任务详情
     *
     * 查询指定ID的同步任务详情(目前只支持华北-北京四、华东-上海一地区)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowSyncTaskRequest 请求对象
     * @return CompletableFuture<ShowSyncTaskResponse>
     */
    public CompletableFuture<ShowSyncTaskResponse> showSyncTaskAsync(ShowSyncTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, OmsMeta.showSyncTask);
    }

    /**
     * 查询指定ID的同步任务详情
     *
     * 查询指定ID的同步任务详情(目前只支持华北-北京四、华东-上海一地区)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowSyncTaskRequest 请求对象
     * @return AsyncInvoker<ShowSyncTaskRequest, ShowSyncTaskResponse>
     */
    public AsyncInvoker<ShowSyncTaskRequest, ShowSyncTaskResponse> showSyncTaskAsyncInvoker(
        ShowSyncTaskRequest request) {
        return new AsyncInvoker<ShowSyncTaskRequest, ShowSyncTaskResponse>(request, OmsMeta.showSyncTask, hcClient);
    }

    /**
     * 查询指定ID的任务详情
     *
     * 查询指定ID的任务详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowTaskRequest 请求对象
     * @return CompletableFuture<ShowTaskResponse>
     */
    public CompletableFuture<ShowTaskResponse> showTaskAsync(ShowTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, OmsMeta.showTask);
    }

    /**
     * 查询指定ID的任务详情
     *
     * 查询指定ID的任务详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowTaskRequest 请求对象
     * @return AsyncInvoker<ShowTaskRequest, ShowTaskResponse>
     */
    public AsyncInvoker<ShowTaskRequest, ShowTaskResponse> showTaskAsyncInvoker(ShowTaskRequest request) {
        return new AsyncInvoker<ShowTaskRequest, ShowTaskResponse>(request, OmsMeta.showTask, hcClient);
    }

    /**
     * 获取指定id的taskgroup信息
     *
     * 获取指定id的taskgroup信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowTaskGroupRequest 请求对象
     * @return CompletableFuture<ShowTaskGroupResponse>
     */
    public CompletableFuture<ShowTaskGroupResponse> showTaskGroupAsync(ShowTaskGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, OmsMeta.showTaskGroup);
    }

    /**
     * 获取指定id的taskgroup信息
     *
     * 获取指定id的taskgroup信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowTaskGroupRequest 请求对象
     * @return AsyncInvoker<ShowTaskGroupRequest, ShowTaskGroupResponse>
     */
    public AsyncInvoker<ShowTaskGroupRequest, ShowTaskGroupResponse> showTaskGroupAsyncInvoker(
        ShowTaskGroupRequest request) {
        return new AsyncInvoker<ShowTaskGroupRequest, ShowTaskGroupResponse>(request, OmsMeta.showTaskGroup, hcClient);
    }

    /**
     * 启动同步任务
     *
     * 同步任务停止后，调用该接口以启动同步任务(目前只支持华北-北京四、华东-上海一地区)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StartSyncTaskRequest 请求对象
     * @return CompletableFuture<StartSyncTaskResponse>
     */
    public CompletableFuture<StartSyncTaskResponse> startSyncTaskAsync(StartSyncTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, OmsMeta.startSyncTask);
    }

    /**
     * 启动同步任务
     *
     * 同步任务停止后，调用该接口以启动同步任务(目前只支持华北-北京四、华东-上海一地区)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StartSyncTaskRequest 请求对象
     * @return AsyncInvoker<StartSyncTaskRequest, StartSyncTaskResponse>
     */
    public AsyncInvoker<StartSyncTaskRequest, StartSyncTaskResponse> startSyncTaskAsyncInvoker(
        StartSyncTaskRequest request) {
        return new AsyncInvoker<StartSyncTaskRequest, StartSyncTaskResponse>(request, OmsMeta.startSyncTask, hcClient);
    }

    /**
     * 启动迁移任务
     *
     * 迁移任务暂停或失败后，调用该接口以启动任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StartTaskRequest 请求对象
     * @return CompletableFuture<StartTaskResponse>
     */
    public CompletableFuture<StartTaskResponse> startTaskAsync(StartTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, OmsMeta.startTask);
    }

    /**
     * 启动迁移任务
     *
     * 迁移任务暂停或失败后，调用该接口以启动任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StartTaskRequest 请求对象
     * @return AsyncInvoker<StartTaskRequest, StartTaskResponse>
     */
    public AsyncInvoker<StartTaskRequest, StartTaskResponse> startTaskAsyncInvoker(StartTaskRequest request) {
        return new AsyncInvoker<StartTaskRequest, StartTaskResponse>(request, OmsMeta.startTask, hcClient);
    }

    /**
     * 恢复指定id的迁移任务组
     *
     * 当迁移任务组处于暂停状态时，调用该接口启动指定id的迁移任务组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StartTaskGroupRequest 请求对象
     * @return CompletableFuture<StartTaskGroupResponse>
     */
    public CompletableFuture<StartTaskGroupResponse> startTaskGroupAsync(StartTaskGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, OmsMeta.startTaskGroup);
    }

    /**
     * 恢复指定id的迁移任务组
     *
     * 当迁移任务组处于暂停状态时，调用该接口启动指定id的迁移任务组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StartTaskGroupRequest 请求对象
     * @return AsyncInvoker<StartTaskGroupRequest, StartTaskGroupResponse>
     */
    public AsyncInvoker<StartTaskGroupRequest, StartTaskGroupResponse> startTaskGroupAsyncInvoker(
        StartTaskGroupRequest request) {
        return new AsyncInvoker<StartTaskGroupRequest, StartTaskGroupResponse>(request, OmsMeta.startTaskGroup,
            hcClient);
    }

    /**
     * 暂停同步任务
     *
     * 当同步任务处于同步中时，调用该接口停止任务(目前只支持华北-北京四、华东-上海一地区)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StopSyncTaskRequest 请求对象
     * @return CompletableFuture<StopSyncTaskResponse>
     */
    public CompletableFuture<StopSyncTaskResponse> stopSyncTaskAsync(StopSyncTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, OmsMeta.stopSyncTask);
    }

    /**
     * 暂停同步任务
     *
     * 当同步任务处于同步中时，调用该接口停止任务(目前只支持华北-北京四、华东-上海一地区)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StopSyncTaskRequest 请求对象
     * @return AsyncInvoker<StopSyncTaskRequest, StopSyncTaskResponse>
     */
    public AsyncInvoker<StopSyncTaskRequest, StopSyncTaskResponse> stopSyncTaskAsyncInvoker(
        StopSyncTaskRequest request) {
        return new AsyncInvoker<StopSyncTaskRequest, StopSyncTaskResponse>(request, OmsMeta.stopSyncTask, hcClient);
    }

    /**
     * 暂停迁移任务
     *
     * 当迁移任务处于迁移中时，调用该接口停止任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StopTaskRequest 请求对象
     * @return CompletableFuture<StopTaskResponse>
     */
    public CompletableFuture<StopTaskResponse> stopTaskAsync(StopTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, OmsMeta.stopTask);
    }

    /**
     * 暂停迁移任务
     *
     * 当迁移任务处于迁移中时，调用该接口停止任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StopTaskRequest 请求对象
     * @return AsyncInvoker<StopTaskRequest, StopTaskResponse>
     */
    public AsyncInvoker<StopTaskRequest, StopTaskResponse> stopTaskAsyncInvoker(StopTaskRequest request) {
        return new AsyncInvoker<StopTaskRequest, StopTaskResponse>(request, OmsMeta.stopTask, hcClient);
    }

    /**
     * 暂停指定id的迁移任务组
     *
     * 当迁移任务组处于创建任务中或监控中时，调用该接口暂停指定迁移任务组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StopTaskGroupRequest 请求对象
     * @return CompletableFuture<StopTaskGroupResponse>
     */
    public CompletableFuture<StopTaskGroupResponse> stopTaskGroupAsync(StopTaskGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, OmsMeta.stopTaskGroup);
    }

    /**
     * 暂停指定id的迁移任务组
     *
     * 当迁移任务组处于创建任务中或监控中时，调用该接口暂停指定迁移任务组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StopTaskGroupRequest 请求对象
     * @return AsyncInvoker<StopTaskGroupRequest, StopTaskGroupResponse>
     */
    public AsyncInvoker<StopTaskGroupRequest, StopTaskGroupResponse> stopTaskGroupAsyncInvoker(
        StopTaskGroupRequest request) {
        return new AsyncInvoker<StopTaskGroupRequest, StopTaskGroupResponse>(request, OmsMeta.stopTaskGroup, hcClient);
    }

    /**
     * 更新任务带宽策略
     *
     * 当迁移任务未执行完成时，修改迁移任务的流量控制策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateBandwidthPolicyRequest 请求对象
     * @return CompletableFuture<UpdateBandwidthPolicyResponse>
     */
    public CompletableFuture<UpdateBandwidthPolicyResponse> updateBandwidthPolicyAsync(
        UpdateBandwidthPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, OmsMeta.updateBandwidthPolicy);
    }

    /**
     * 更新任务带宽策略
     *
     * 当迁移任务未执行完成时，修改迁移任务的流量控制策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateBandwidthPolicyRequest 请求对象
     * @return AsyncInvoker<UpdateBandwidthPolicyRequest, UpdateBandwidthPolicyResponse>
     */
    public AsyncInvoker<UpdateBandwidthPolicyRequest, UpdateBandwidthPolicyResponse> updateBandwidthPolicyAsyncInvoker(
        UpdateBandwidthPolicyRequest request) {
        return new AsyncInvoker<UpdateBandwidthPolicyRequest, UpdateBandwidthPolicyResponse>(request,
            OmsMeta.updateBandwidthPolicy, hcClient);
    }

    /**
     * 更新指定id的迁移任务组的流控策略
     *
     * 当迁移任务组未执行完成时，修改迁移任务组的流量控制策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateTaskGroupRequest 请求对象
     * @return CompletableFuture<UpdateTaskGroupResponse>
     */
    public CompletableFuture<UpdateTaskGroupResponse> updateTaskGroupAsync(UpdateTaskGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, OmsMeta.updateTaskGroup);
    }

    /**
     * 更新指定id的迁移任务组的流控策略
     *
     * 当迁移任务组未执行完成时，修改迁移任务组的流量控制策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateTaskGroupRequest 请求对象
     * @return AsyncInvoker<UpdateTaskGroupRequest, UpdateTaskGroupResponse>
     */
    public AsyncInvoker<UpdateTaskGroupRequest, UpdateTaskGroupResponse> updateTaskGroupAsyncInvoker(
        UpdateTaskGroupRequest request) {
        return new AsyncInvoker<UpdateTaskGroupRequest, UpdateTaskGroupResponse>(request, OmsMeta.updateTaskGroup,
            hcClient);
    }

    /**
     * 查询API版本信息列表
     *
     * 查询对象存储迁移服务的API版本信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListApiVersionsRequest 请求对象
     * @return CompletableFuture<ListApiVersionsResponse>
     */
    public CompletableFuture<ListApiVersionsResponse> listApiVersionsAsync(ListApiVersionsRequest request) {
        return hcClient.asyncInvokeHttp(request, OmsMeta.listApiVersions);
    }

    /**
     * 查询API版本信息列表
     *
     * 查询对象存储迁移服务的API版本信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListApiVersionsRequest 请求对象
     * @return AsyncInvoker<ListApiVersionsRequest, ListApiVersionsResponse>
     */
    public AsyncInvoker<ListApiVersionsRequest, ListApiVersionsResponse> listApiVersionsAsyncInvoker(
        ListApiVersionsRequest request) {
        return new AsyncInvoker<ListApiVersionsRequest, ListApiVersionsResponse>(request, OmsMeta.listApiVersions,
            hcClient);
    }

    /**
     * 查询指定API版本信息
     *
     * 查询对象存储迁移服务指定API版本信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowApiInfoRequest 请求对象
     * @return CompletableFuture<ShowApiInfoResponse>
     */
    public CompletableFuture<ShowApiInfoResponse> showApiInfoAsync(ShowApiInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, OmsMeta.showApiInfo);
    }

    /**
     * 查询指定API版本信息
     *
     * 查询对象存储迁移服务指定API版本信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowApiInfoRequest 请求对象
     * @return AsyncInvoker<ShowApiInfoRequest, ShowApiInfoResponse>
     */
    public AsyncInvoker<ShowApiInfoRequest, ShowApiInfoResponse> showApiInfoAsyncInvoker(ShowApiInfoRequest request) {
        return new AsyncInvoker<ShowApiInfoRequest, ShowApiInfoResponse>(request, OmsMeta.showApiInfo, hcClient);
    }

}
