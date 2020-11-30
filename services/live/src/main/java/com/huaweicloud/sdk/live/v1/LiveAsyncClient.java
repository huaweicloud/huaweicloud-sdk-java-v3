package com.huaweicloud.sdk.live.v1;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

import com.huaweicloud.sdk.live.v1.model.*;

public class LiveAsyncClient {
    protected HcClient hcClient;

    public LiveAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<LiveAsyncClient> newBuilder() {
        return new ClientBuilder<>(LiveAsyncClient::new);
    }


    /**
     * 创建录制配置
     * 创建录制配置接口
     *
     * @param CreateRecordConfigRequest 请求对象
     * @return CompletableFuture<CreateRecordConfigResponse>
     */
    public CompletableFuture<CreateRecordConfigResponse> createRecordConfigAsync(CreateRecordConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, LiveMeta.createRecordConfig);
    }

    /**
     * 禁止直播推流
     * 禁止直播推流
     *
     * @param CreateStreamForbiddenRequest 请求对象
     * @return CompletableFuture<CreateStreamForbiddenResponse>
     */
    public CompletableFuture<CreateStreamForbiddenResponse> createStreamForbiddenAsync(CreateStreamForbiddenRequest request) {
        return hcClient.asyncInvokeHttp(request, LiveMeta.createStreamForbidden);
    }

    /**
     * 创建直播转码模板
     * 创建直播转码模板
     *
     * @param CreateTranscodingsTemplateRequest 请求对象
     * @return CompletableFuture<CreateTranscodingsTemplateResponse>
     */
    public CompletableFuture<CreateTranscodingsTemplateResponse> createTranscodingsTemplateAsync(CreateTranscodingsTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, LiveMeta.createTranscodingsTemplate);
    }

    /**
     * 删除录制配置
     * 删除录制配置接口
     *
     * @param DeleteRecordConfigRequest 请求对象
     * @return CompletableFuture<DeleteRecordConfigResponse>
     */
    public CompletableFuture<DeleteRecordConfigResponse> deleteRecordConfigAsync(DeleteRecordConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, LiveMeta.deleteRecordConfig);
    }

    /**
     * 禁推恢复
     * 恢复直播推流接口
     *
     * @param DeleteStreamForbiddenRequest 请求对象
     * @return CompletableFuture<DeleteStreamForbiddenResponse>
     */
    public CompletableFuture<DeleteStreamForbiddenResponse> deleteStreamForbiddenAsync(DeleteStreamForbiddenRequest request) {
        return hcClient.asyncInvokeHttp(request, LiveMeta.deleteStreamForbidden);
    }

    /**
     * 删除直播转码模板
     * 删除直播转码模板
     *
     * @param DeleteTranscodingsTemplateRequest 请求对象
     * @return CompletableFuture<DeleteTranscodingsTemplateResponse>
     */
    public CompletableFuture<DeleteTranscodingsTemplateResponse> deleteTranscodingsTemplateAsync(DeleteTranscodingsTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, LiveMeta.deleteTranscodingsTemplate);
    }

    /**
     * 查询录制配置
     * 查询录制配置接口
     *
     * @param ListRecordConfigsRequest 请求对象
     * @return CompletableFuture<ListRecordConfigsResponse>
     */
    public CompletableFuture<ListRecordConfigsResponse> listRecordConfigsAsync(ListRecordConfigsRequest request) {
        return hcClient.asyncInvokeHttp(request, LiveMeta.listRecordConfigs);
    }

    /**
     * 查询禁止直播推流列表
     * 查询禁播黑名单列表
     *
     * @param ListStreamForbiddenRequest 请求对象
     * @return CompletableFuture<ListStreamForbiddenResponse>
     */
    public CompletableFuture<ListStreamForbiddenResponse> listStreamForbiddenAsync(ListStreamForbiddenRequest request) {
        return hcClient.asyncInvokeHttp(request, LiveMeta.listStreamForbidden);
    }

    /**
     * 查询直播加速的带宽数据
     * 查询直播加速的播流域名网络带宽监控数据
     *
     * @param ShowBandwidthRequest 请求对象
     * @return CompletableFuture<ShowBandwidthResponse>
     */
    public CompletableFuture<ShowBandwidthResponse> showBandwidthAsync(ShowBandwidthRequest request) {
        return hcClient.asyncInvokeHttp(request, LiveMeta.showBandwidth);
    }

    /**
     * 查询直播播放在线人数
     * 查询加速的直播播放在线人数
     *
     * @param ShowOnlineUsersRequest 请求对象
     * @return CompletableFuture<ShowOnlineUsersResponse>
     */
    public CompletableFuture<ShowOnlineUsersResponse> showOnlineUsersAsync(ShowOnlineUsersRequest request) {
        return hcClient.asyncInvokeHttp(request, LiveMeta.showOnlineUsers);
    }

    /**
     * 查询直播加速的流量数据
     * 查询直播加速的播流域名网络流量监控数据
     *
     * @param ShowTrafficRequest 请求对象
     * @return CompletableFuture<ShowTrafficResponse>
     */
    public CompletableFuture<ShowTrafficResponse> showTrafficAsync(ShowTrafficRequest request) {
        return hcClient.asyncInvokeHttp(request, LiveMeta.showTraffic);
    }

    /**
     * 查询直播转码模板
     * 查询直播转码模板
     *
     * @param ShowTranscodingsTemplateRequest 请求对象
     * @return CompletableFuture<ShowTranscodingsTemplateResponse>
     */
    public CompletableFuture<ShowTranscodingsTemplateResponse> showTranscodingsTemplateAsync(ShowTranscodingsTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, LiveMeta.showTranscodingsTemplate);
    }

    /**
     * 修改禁推属性
     * 修改禁推属性
     *
     * @param UpdateStreamForbiddenRequest 请求对象
     * @return CompletableFuture<UpdateStreamForbiddenResponse>
     */
    public CompletableFuture<UpdateStreamForbiddenResponse> updateStreamForbiddenAsync(UpdateStreamForbiddenRequest request) {
        return hcClient.asyncInvokeHttp(request, LiveMeta.updateStreamForbidden);
    }

    /**
     * 配置直播转码模板
     * 修改直播转码模板
     *
     * @param UpdateTranscodingsTemplateRequest 请求对象
     * @return CompletableFuture<UpdateTranscodingsTemplateResponse>
     */
    public CompletableFuture<UpdateTranscodingsTemplateResponse> updateTranscodingsTemplateAsync(UpdateTranscodingsTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, LiveMeta.updateTranscodingsTemplate);
    }

}