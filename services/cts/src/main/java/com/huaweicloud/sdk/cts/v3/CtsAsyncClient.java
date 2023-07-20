package com.huaweicloud.sdk.cts.v3;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.cts.v3.model.CreateNotificationRequest;
import com.huaweicloud.sdk.cts.v3.model.CreateNotificationResponse;
import com.huaweicloud.sdk.cts.v3.model.CreateTrackerRequest;
import com.huaweicloud.sdk.cts.v3.model.CreateTrackerResponse;
import com.huaweicloud.sdk.cts.v3.model.DeleteNotificationRequest;
import com.huaweicloud.sdk.cts.v3.model.DeleteNotificationResponse;
import com.huaweicloud.sdk.cts.v3.model.DeleteTrackerRequest;
import com.huaweicloud.sdk.cts.v3.model.DeleteTrackerResponse;
import com.huaweicloud.sdk.cts.v3.model.ListNotificationsRequest;
import com.huaweicloud.sdk.cts.v3.model.ListNotificationsResponse;
import com.huaweicloud.sdk.cts.v3.model.ListQuotasRequest;
import com.huaweicloud.sdk.cts.v3.model.ListQuotasResponse;
import com.huaweicloud.sdk.cts.v3.model.ListTracesRequest;
import com.huaweicloud.sdk.cts.v3.model.ListTracesResponse;
import com.huaweicloud.sdk.cts.v3.model.ListTrackersRequest;
import com.huaweicloud.sdk.cts.v3.model.ListTrackersResponse;
import com.huaweicloud.sdk.cts.v3.model.UpdateNotificationRequest;
import com.huaweicloud.sdk.cts.v3.model.UpdateNotificationResponse;
import com.huaweicloud.sdk.cts.v3.model.UpdateTrackerRequest;
import com.huaweicloud.sdk.cts.v3.model.UpdateTrackerResponse;

import java.util.concurrent.CompletableFuture;

public class CtsAsyncClient {

    protected HcClient hcClient;

    public CtsAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<CtsAsyncClient> newBuilder() {
        ClientBuilder<CtsAsyncClient> clientBuilder = new ClientBuilder<>(CtsAsyncClient::new);
        return clientBuilder;
    }

    /**
     * 创建关键操作通知
     *
     * 配置关键操作通知，可在发生特定操作时，使用预先创建好的SMN主题，向用户手机、邮箱发送消息，也可直接发送http/https消息。常用于实时感知高危操作、触发特定操作或对接用户自有审计分析系统。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateNotificationRequest 请求对象
     * @return CompletableFuture<CreateNotificationResponse>
     */
    public CompletableFuture<CreateNotificationResponse> createNotificationAsync(CreateNotificationRequest request) {
        return hcClient.asyncInvokeHttp(request, CtsMeta.createNotification);
    }

    /**
     * 创建关键操作通知
     *
     * 配置关键操作通知，可在发生特定操作时，使用预先创建好的SMN主题，向用户手机、邮箱发送消息，也可直接发送http/https消息。常用于实时感知高危操作、触发特定操作或对接用户自有审计分析系统。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateNotificationRequest 请求对象
     * @return AsyncInvoker<CreateNotificationRequest, CreateNotificationResponse>
     */
    public AsyncInvoker<CreateNotificationRequest, CreateNotificationResponse> createNotificationAsyncInvoker(
        CreateNotificationRequest request) {
        return new AsyncInvoker<CreateNotificationRequest, CreateNotificationResponse>(request,
            CtsMeta.createNotification, hcClient);
    }

    /**
     * 创建追踪器
     *
     * 云审计服务开通后系统会自动创建一个追踪器，用来关联系统记录的所有操作。目前，一个云账户在一个Region下支持创建一个管理类追踪器和多个数据类追踪器。
     * 云审计服务支持在管理控制台查询近7天内的操作记录。如需保存更长时间的操作记录，您可以在创建追踪器之后通过对象存储服务（Object Storage Service，以下简称OBS）将操作记录实时保存至OBS桶中。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateTrackerRequest 请求对象
     * @return CompletableFuture<CreateTrackerResponse>
     */
    public CompletableFuture<CreateTrackerResponse> createTrackerAsync(CreateTrackerRequest request) {
        return hcClient.asyncInvokeHttp(request, CtsMeta.createTracker);
    }

    /**
     * 创建追踪器
     *
     * 云审计服务开通后系统会自动创建一个追踪器，用来关联系统记录的所有操作。目前，一个云账户在一个Region下支持创建一个管理类追踪器和多个数据类追踪器。
     * 云审计服务支持在管理控制台查询近7天内的操作记录。如需保存更长时间的操作记录，您可以在创建追踪器之后通过对象存储服务（Object Storage Service，以下简称OBS）将操作记录实时保存至OBS桶中。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateTrackerRequest 请求对象
     * @return AsyncInvoker<CreateTrackerRequest, CreateTrackerResponse>
     */
    public AsyncInvoker<CreateTrackerRequest, CreateTrackerResponse> createTrackerAsyncInvoker(
        CreateTrackerRequest request) {
        return new AsyncInvoker<CreateTrackerRequest, CreateTrackerResponse>(request, CtsMeta.createTracker, hcClient);
    }

    /**
     * 删除关键操作通知
     *
     * 云审计服务支持删除已创建的关键操作通知。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteNotificationRequest 请求对象
     * @return CompletableFuture<DeleteNotificationResponse>
     */
    public CompletableFuture<DeleteNotificationResponse> deleteNotificationAsync(DeleteNotificationRequest request) {
        return hcClient.asyncInvokeHttp(request, CtsMeta.deleteNotification);
    }

    /**
     * 删除关键操作通知
     *
     * 云审计服务支持删除已创建的关键操作通知。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteNotificationRequest 请求对象
     * @return AsyncInvoker<DeleteNotificationRequest, DeleteNotificationResponse>
     */
    public AsyncInvoker<DeleteNotificationRequest, DeleteNotificationResponse> deleteNotificationAsyncInvoker(
        DeleteNotificationRequest request) {
        return new AsyncInvoker<DeleteNotificationRequest, DeleteNotificationResponse>(request,
            CtsMeta.deleteNotification, hcClient);
    }

    /**
     * 删除追踪器
     *
     * 云审计服务目前仅支持删除已创建的数据类追踪器。删除追踪器对已有的操作记录没有影响，当您重新开通云审计服务后，依旧可以查看已有的操作记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteTrackerRequest 请求对象
     * @return CompletableFuture<DeleteTrackerResponse>
     */
    public CompletableFuture<DeleteTrackerResponse> deleteTrackerAsync(DeleteTrackerRequest request) {
        return hcClient.asyncInvokeHttp(request, CtsMeta.deleteTracker);
    }

    /**
     * 删除追踪器
     *
     * 云审计服务目前仅支持删除已创建的数据类追踪器。删除追踪器对已有的操作记录没有影响，当您重新开通云审计服务后，依旧可以查看已有的操作记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteTrackerRequest 请求对象
     * @return AsyncInvoker<DeleteTrackerRequest, DeleteTrackerResponse>
     */
    public AsyncInvoker<DeleteTrackerRequest, DeleteTrackerResponse> deleteTrackerAsyncInvoker(
        DeleteTrackerRequest request) {
        return new AsyncInvoker<DeleteTrackerRequest, DeleteTrackerResponse>(request, CtsMeta.deleteTracker, hcClient);
    }

    /**
     * 查询关键操作通知
     *
     * 查询创建的关键操作通知规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListNotificationsRequest 请求对象
     * @return CompletableFuture<ListNotificationsResponse>
     */
    public CompletableFuture<ListNotificationsResponse> listNotificationsAsync(ListNotificationsRequest request) {
        return hcClient.asyncInvokeHttp(request, CtsMeta.listNotifications);
    }

    /**
     * 查询关键操作通知
     *
     * 查询创建的关键操作通知规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListNotificationsRequest 请求对象
     * @return AsyncInvoker<ListNotificationsRequest, ListNotificationsResponse>
     */
    public AsyncInvoker<ListNotificationsRequest, ListNotificationsResponse> listNotificationsAsyncInvoker(
        ListNotificationsRequest request) {
        return new AsyncInvoker<ListNotificationsRequest, ListNotificationsResponse>(request, CtsMeta.listNotifications,
            hcClient);
    }

    /**
     * 查询租户追踪器配额信息
     *
     * 查询租户追踪器配额信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListQuotasRequest 请求对象
     * @return CompletableFuture<ListQuotasResponse>
     */
    public CompletableFuture<ListQuotasResponse> listQuotasAsync(ListQuotasRequest request) {
        return hcClient.asyncInvokeHttp(request, CtsMeta.listQuotas);
    }

    /**
     * 查询租户追踪器配额信息
     *
     * 查询租户追踪器配额信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListQuotasRequest 请求对象
     * @return AsyncInvoker<ListQuotasRequest, ListQuotasResponse>
     */
    public AsyncInvoker<ListQuotasRequest, ListQuotasResponse> listQuotasAsyncInvoker(ListQuotasRequest request) {
        return new AsyncInvoker<ListQuotasRequest, ListQuotasResponse>(request, CtsMeta.listQuotas, hcClient);
    }

    /**
     * 查询事件列表
     *
     * 通过事件列表查询接口，可以查出系统记录的7天内资源操作记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTracesRequest 请求对象
     * @return CompletableFuture<ListTracesResponse>
     */
    public CompletableFuture<ListTracesResponse> listTracesAsync(ListTracesRequest request) {
        return hcClient.asyncInvokeHttp(request, CtsMeta.listTraces);
    }

    /**
     * 查询事件列表
     *
     * 通过事件列表查询接口，可以查出系统记录的7天内资源操作记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTracesRequest 请求对象
     * @return AsyncInvoker<ListTracesRequest, ListTracesResponse>
     */
    public AsyncInvoker<ListTracesRequest, ListTracesResponse> listTracesAsyncInvoker(ListTracesRequest request) {
        return new AsyncInvoker<ListTracesRequest, ListTracesResponse>(request, CtsMeta.listTraces, hcClient);
    }

    /**
     * 查询追踪器
     *
     * 开通云审计服务成功后，您可以在追踪器信息页面查看追踪器的详细信息。详细信息主要包括追踪器名称，用于存储操作事件的OBS桶名称和OBS桶中的事件文件前缀。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTrackersRequest 请求对象
     * @return CompletableFuture<ListTrackersResponse>
     */
    public CompletableFuture<ListTrackersResponse> listTrackersAsync(ListTrackersRequest request) {
        return hcClient.asyncInvokeHttp(request, CtsMeta.listTrackers);
    }

    /**
     * 查询追踪器
     *
     * 开通云审计服务成功后，您可以在追踪器信息页面查看追踪器的详细信息。详细信息主要包括追踪器名称，用于存储操作事件的OBS桶名称和OBS桶中的事件文件前缀。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTrackersRequest 请求对象
     * @return AsyncInvoker<ListTrackersRequest, ListTrackersResponse>
     */
    public AsyncInvoker<ListTrackersRequest, ListTrackersResponse> listTrackersAsyncInvoker(
        ListTrackersRequest request) {
        return new AsyncInvoker<ListTrackersRequest, ListTrackersResponse>(request, CtsMeta.listTrackers, hcClient);
    }

    /**
     * 修改关键操作通知
     *
     * 云审计服务支持修改已创建关键操作通知配置项，通过notification_id的字段匹配修改对象，notification_id必须已经存在。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateNotificationRequest 请求对象
     * @return CompletableFuture<UpdateNotificationResponse>
     */
    public CompletableFuture<UpdateNotificationResponse> updateNotificationAsync(UpdateNotificationRequest request) {
        return hcClient.asyncInvokeHttp(request, CtsMeta.updateNotification);
    }

    /**
     * 修改关键操作通知
     *
     * 云审计服务支持修改已创建关键操作通知配置项，通过notification_id的字段匹配修改对象，notification_id必须已经存在。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateNotificationRequest 请求对象
     * @return AsyncInvoker<UpdateNotificationRequest, UpdateNotificationResponse>
     */
    public AsyncInvoker<UpdateNotificationRequest, UpdateNotificationResponse> updateNotificationAsyncInvoker(
        UpdateNotificationRequest request) {
        return new AsyncInvoker<UpdateNotificationRequest, UpdateNotificationResponse>(request,
            CtsMeta.updateNotification, hcClient);
    }

    /**
     * 修改追踪器
     *
     * 云审计服务支持修改已创建追踪器的配置项，包括OBS桶转储、关键事件通知、事件转储加密、通过LTS对管理类事件进行检索、事件文件完整性校验以及追踪器启停状态等相关参数，修改追踪器对已有的操作记录没有影响。修改追踪器完成后，系统立即以新的规则开始记录操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateTrackerRequest 请求对象
     * @return CompletableFuture<UpdateTrackerResponse>
     */
    public CompletableFuture<UpdateTrackerResponse> updateTrackerAsync(UpdateTrackerRequest request) {
        return hcClient.asyncInvokeHttp(request, CtsMeta.updateTracker);
    }

    /**
     * 修改追踪器
     *
     * 云审计服务支持修改已创建追踪器的配置项，包括OBS桶转储、关键事件通知、事件转储加密、通过LTS对管理类事件进行检索、事件文件完整性校验以及追踪器启停状态等相关参数，修改追踪器对已有的操作记录没有影响。修改追踪器完成后，系统立即以新的规则开始记录操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateTrackerRequest 请求对象
     * @return AsyncInvoker<UpdateTrackerRequest, UpdateTrackerResponse>
     */
    public AsyncInvoker<UpdateTrackerRequest, UpdateTrackerResponse> updateTrackerAsyncInvoker(
        UpdateTrackerRequest request) {
        return new AsyncInvoker<UpdateTrackerRequest, UpdateTrackerResponse>(request, CtsMeta.updateTracker, hcClient);
    }

}
