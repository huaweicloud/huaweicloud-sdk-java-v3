package com.huaweicloud.sdk.live.v1;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.live.v1.model.*;

public class LiveClient {
    protected HcClient hcClient;

    public LiveClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<LiveClient> newBuilder() {
        return new ClientBuilder<>(LiveClient::new);
    }


    /**
     * 创建录制配置
     * 创建录制配置接口
     *
     * @param CreateRecordConfigRequest 请求对象
     * @return CreateRecordConfigResponse
     */
    public CreateRecordConfigResponse createRecordConfig(CreateRecordConfigRequest request) {
        return hcClient.syncInvokeHttp(request, LiveMeta.createRecordConfig);
    }

    /**
     * 禁止直播推流
     * 禁止直播推流
     *
     * @param CreateStreamForbiddenRequest 请求对象
     * @return CreateStreamForbiddenResponse
     */
    public CreateStreamForbiddenResponse createStreamForbidden(CreateStreamForbiddenRequest request) {
        return hcClient.syncInvokeHttp(request, LiveMeta.createStreamForbidden);
    }

    /**
     * 创建直播转码模板
     * 创建直播转码模板
     *
     * @param CreateTranscodingsTemplateRequest 请求对象
     * @return CreateTranscodingsTemplateResponse
     */
    public CreateTranscodingsTemplateResponse createTranscodingsTemplate(CreateTranscodingsTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, LiveMeta.createTranscodingsTemplate);
    }

    /**
     * 删除录制配置
     * 删除录制配置接口
     *
     * @param DeleteRecordConfigRequest 请求对象
     * @return DeleteRecordConfigResponse
     */
    public DeleteRecordConfigResponse deleteRecordConfig(DeleteRecordConfigRequest request) {
        return hcClient.syncInvokeHttp(request, LiveMeta.deleteRecordConfig);
    }

    /**
     * 禁推恢复
     * 恢复直播推流接口
     *
     * @param DeleteStreamForbiddenRequest 请求对象
     * @return DeleteStreamForbiddenResponse
     */
    public DeleteStreamForbiddenResponse deleteStreamForbidden(DeleteStreamForbiddenRequest request) {
        return hcClient.syncInvokeHttp(request, LiveMeta.deleteStreamForbidden);
    }

    /**
     * 删除直播转码模板
     * 删除直播转码模板
     *
     * @param DeleteTranscodingsTemplateRequest 请求对象
     * @return DeleteTranscodingsTemplateResponse
     */
    public DeleteTranscodingsTemplateResponse deleteTranscodingsTemplate(DeleteTranscodingsTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, LiveMeta.deleteTranscodingsTemplate);
    }

    /**
     * 查询录制配置
     * 查询录制配置接口
     *
     * @param ListRecordConfigsRequest 请求对象
     * @return ListRecordConfigsResponse
     */
    public ListRecordConfigsResponse listRecordConfigs(ListRecordConfigsRequest request) {
        return hcClient.syncInvokeHttp(request, LiveMeta.listRecordConfigs);
    }

    /**
     * 查询禁止直播推流列表
     * 查询禁播黑名单列表
     *
     * @param ListStreamForbiddenRequest 请求对象
     * @return ListStreamForbiddenResponse
     */
    public ListStreamForbiddenResponse listStreamForbidden(ListStreamForbiddenRequest request) {
        return hcClient.syncInvokeHttp(request, LiveMeta.listStreamForbidden);
    }

    /**
     * 查询直播加速的带宽数据
     * 查询直播加速的播流域名网络带宽监控数据
     *
     * @param ShowBandwidthRequest 请求对象
     * @return ShowBandwidthResponse
     */
    public ShowBandwidthResponse showBandwidth(ShowBandwidthRequest request) {
        return hcClient.syncInvokeHttp(request, LiveMeta.showBandwidth);
    }

    /**
     * 查询直播播放在线人数
     * 查询加速的直播播放在线人数
     *
     * @param ShowOnlineUsersRequest 请求对象
     * @return ShowOnlineUsersResponse
     */
    public ShowOnlineUsersResponse showOnlineUsers(ShowOnlineUsersRequest request) {
        return hcClient.syncInvokeHttp(request, LiveMeta.showOnlineUsers);
    }

    /**
     * 查询直播加速的流量数据
     * 查询直播加速的播流域名网络流量监控数据
     *
     * @param ShowTrafficRequest 请求对象
     * @return ShowTrafficResponse
     */
    public ShowTrafficResponse showTraffic(ShowTrafficRequest request) {
        return hcClient.syncInvokeHttp(request, LiveMeta.showTraffic);
    }

    /**
     * 查询直播转码模板
     * 查询直播转码模板
     *
     * @param ShowTranscodingsTemplateRequest 请求对象
     * @return ShowTranscodingsTemplateResponse
     */
    public ShowTranscodingsTemplateResponse showTranscodingsTemplate(ShowTranscodingsTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, LiveMeta.showTranscodingsTemplate);
    }

    /**
     * 修改禁推属性
     * 修改禁推属性
     *
     * @param UpdateStreamForbiddenRequest 请求对象
     * @return UpdateStreamForbiddenResponse
     */
    public UpdateStreamForbiddenResponse updateStreamForbidden(UpdateStreamForbiddenRequest request) {
        return hcClient.syncInvokeHttp(request, LiveMeta.updateStreamForbidden);
    }

    /**
     * 配置直播转码模板
     * 修改直播转码模板
     *
     * @param UpdateTranscodingsTemplateRequest 请求对象
     * @return UpdateTranscodingsTemplateResponse
     */
    public UpdateTranscodingsTemplateResponse updateTranscodingsTemplate(UpdateTranscodingsTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, LiveMeta.updateTranscodingsTemplate);
    }

}