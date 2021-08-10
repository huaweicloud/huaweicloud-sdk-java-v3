package com.huaweicloud.sdk.cts.v3;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.cts.v3.model.*;

import java.util.concurrent.CompletableFuture;

public class CtsAsyncClient {

    protected HcClient hcClient;

    public CtsAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<CtsAsyncClient> newBuilder() {
        return new ClientBuilder<>(CtsAsyncClient::new);
    }

    /** 创建追踪器 云审计服务开通后系统会自动创建一个追踪器，用来关联系统记录的所有操作。目前，一个云账户在一个Region下支持创建一个管理类追踪器和多个数据类追踪器。
     * 云审计服务支持在管理控制台查询近7天内的操作记录。如需保存更长时间的操作记录，您可以在创建追踪器之后通过对象存储服务（Object Storage Service，以下简称OBS）将操作记录实时保存至OBS桶中。
     *
     * @param CreateTrackerRequest 请求对象
     * @return CompletableFuture<CreateTrackerResponse> */
    public CompletableFuture<CreateTrackerResponse> createTrackerAsync(CreateTrackerRequest request) {
        return hcClient.asyncInvokeHttp(request, CtsMeta.createTracker);
    }

    /** 创建追踪器 云审计服务开通后系统会自动创建一个追踪器，用来关联系统记录的所有操作。目前，一个云账户在一个Region下支持创建一个管理类追踪器和多个数据类追踪器。
     * 云审计服务支持在管理控制台查询近7天内的操作记录。如需保存更长时间的操作记录，您可以在创建追踪器之后通过对象存储服务（Object Storage Service，以下简称OBS）将操作记录实时保存至OBS桶中。
     *
     * @param CreateTrackerRequest 请求对象
     * @return AsyncInvoker<CreateTrackerRequest, CreateTrackerResponse> */
    public AsyncInvoker<CreateTrackerRequest, CreateTrackerResponse> createTrackerAsyncInvoker(
        CreateTrackerRequest request) {
        return new AsyncInvoker<CreateTrackerRequest, CreateTrackerResponse>(request, CtsMeta.createTracker, hcClient);
    }

    /** 删除追踪器 云审计服务目前仅支持删除已创建的数据类追踪器。删除追踪器对已有的操作记录没有影响，当您重新开通云审计服务后，依旧可以查看已有的操作记录。
     *
     * @param DeleteTrackerRequest 请求对象
     * @return CompletableFuture<DeleteTrackerResponse> */
    public CompletableFuture<DeleteTrackerResponse> deleteTrackerAsync(DeleteTrackerRequest request) {
        return hcClient.asyncInvokeHttp(request, CtsMeta.deleteTracker);
    }

    /** 删除追踪器 云审计服务目前仅支持删除已创建的数据类追踪器。删除追踪器对已有的操作记录没有影响，当您重新开通云审计服务后，依旧可以查看已有的操作记录。
     *
     * @param DeleteTrackerRequest 请求对象
     * @return AsyncInvoker<DeleteTrackerRequest, DeleteTrackerResponse> */
    public AsyncInvoker<DeleteTrackerRequest, DeleteTrackerResponse> deleteTrackerAsyncInvoker(
        DeleteTrackerRequest request) {
        return new AsyncInvoker<DeleteTrackerRequest, DeleteTrackerResponse>(request, CtsMeta.deleteTracker, hcClient);
    }

    /** 查询租户追踪器配额信息 查询租户追踪器配额信息。
     *
     * @param ListQuotasRequest 请求对象
     * @return CompletableFuture<ListQuotasResponse> */
    public CompletableFuture<ListQuotasResponse> listQuotasAsync(ListQuotasRequest request) {
        return hcClient.asyncInvokeHttp(request, CtsMeta.listQuotas);
    }

    /** 查询租户追踪器配额信息 查询租户追踪器配额信息。
     *
     * @param ListQuotasRequest 请求对象
     * @return AsyncInvoker<ListQuotasRequest, ListQuotasResponse> */
    public AsyncInvoker<ListQuotasRequest, ListQuotasResponse> listQuotasAsyncInvoker(ListQuotasRequest request) {
        return new AsyncInvoker<ListQuotasRequest, ListQuotasResponse>(request, CtsMeta.listQuotas, hcClient);
    }

    /** 查询事件列表 通过事件列表查询接口，可以查出系统记录的7天内资源操作记录。
     *
     * @param ListTracesRequest 请求对象
     * @return CompletableFuture<ListTracesResponse> */
    public CompletableFuture<ListTracesResponse> listTracesAsync(ListTracesRequest request) {
        return hcClient.asyncInvokeHttp(request, CtsMeta.listTraces);
    }

    /** 查询事件列表 通过事件列表查询接口，可以查出系统记录的7天内资源操作记录。
     *
     * @param ListTracesRequest 请求对象
     * @return AsyncInvoker<ListTracesRequest, ListTracesResponse> */
    public AsyncInvoker<ListTracesRequest, ListTracesResponse> listTracesAsyncInvoker(ListTracesRequest request) {
        return new AsyncInvoker<ListTracesRequest, ListTracesResponse>(request, CtsMeta.listTraces, hcClient);
    }

    /** 查询追踪器 开通云审计服务成功后，您可以在追踪器信息页面查看追踪器的详细信息。详细信息主要包括追踪器名称，用于存储操作事件的OBS桶名称和OBS桶中的事件文件前缀。
     *
     * @param ListTrackersRequest 请求对象
     * @return CompletableFuture<ListTrackersResponse> */
    public CompletableFuture<ListTrackersResponse> listTrackersAsync(ListTrackersRequest request) {
        return hcClient.asyncInvokeHttp(request, CtsMeta.listTrackers);
    }

    /** 查询追踪器 开通云审计服务成功后，您可以在追踪器信息页面查看追踪器的详细信息。详细信息主要包括追踪器名称，用于存储操作事件的OBS桶名称和OBS桶中的事件文件前缀。
     *
     * @param ListTrackersRequest 请求对象
     * @return AsyncInvoker<ListTrackersRequest, ListTrackersResponse> */
    public AsyncInvoker<ListTrackersRequest, ListTrackersResponse> listTrackersAsyncInvoker(
        ListTrackersRequest request) {
        return new AsyncInvoker<ListTrackersRequest, ListTrackersResponse>(request, CtsMeta.listTrackers, hcClient);
    }

    /** 修改追踪器
     * 云审计服务支持修改已创建追踪器的配置项，包括OBS桶转储、关键事件通知、事件转储加密、通过LTS对管理类事件进行检索、事件文件完整性校验以及追踪器启停状态等相关参数，修改追踪器对已有的操作记录没有影响。修改追踪器完成后，系统立即以新的规则开始记录操作。
     *
     * @param UpdateTrackerRequest 请求对象
     * @return CompletableFuture<UpdateTrackerResponse> */
    public CompletableFuture<UpdateTrackerResponse> updateTrackerAsync(UpdateTrackerRequest request) {
        return hcClient.asyncInvokeHttp(request, CtsMeta.updateTracker);
    }

    /** 修改追踪器
     * 云审计服务支持修改已创建追踪器的配置项，包括OBS桶转储、关键事件通知、事件转储加密、通过LTS对管理类事件进行检索、事件文件完整性校验以及追踪器启停状态等相关参数，修改追踪器对已有的操作记录没有影响。修改追踪器完成后，系统立即以新的规则开始记录操作。
     *
     * @param UpdateTrackerRequest 请求对象
     * @return AsyncInvoker<UpdateTrackerRequest, UpdateTrackerResponse> */
    public AsyncInvoker<UpdateTrackerRequest, UpdateTrackerResponse> updateTrackerAsyncInvoker(
        UpdateTrackerRequest request) {
        return new AsyncInvoker<UpdateTrackerRequest, UpdateTrackerResponse>(request, CtsMeta.updateTracker, hcClient);
    }

}
