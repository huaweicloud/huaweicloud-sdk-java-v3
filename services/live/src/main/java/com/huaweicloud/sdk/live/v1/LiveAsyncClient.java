package com.huaweicloud.sdk.live.v1;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
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
     * 创建直播域名
     * 可单独创建直播播放域名或推流域名，每个租户最多可配置64条域名记录。 
     *
     * @param CreateDomainRequest 请求对象
     * @return CompletableFuture<CreateDomainResponse>
     */
    public CompletableFuture<CreateDomainResponse> createDomainAsync(CreateDomainRequest request) {
        return hcClient.asyncInvokeHttp(request, LiveMeta.createDomain);
    }

    /**
     * 创建直播域名
     * 可单独创建直播播放域名或推流域名，每个租户最多可配置64条域名记录。 
     *
     * @param CreateDomainRequest 请求对象
     * @return AsyncInvoker<CreateDomainRequest, CreateDomainResponse>
     */
    public AsyncInvoker<CreateDomainRequest, CreateDomainResponse> createDomainAsyncInvoker(CreateDomainRequest request) {
        return new AsyncInvoker<CreateDomainRequest, CreateDomainResponse>(request, LiveMeta.createDomain, hcClient);
    }

    /**
     * 域名映射
     * 将用户已创建的播放域名和推流域名建立域名映射关系
     *
     * @param CreateDomainMappingRequest 请求对象
     * @return CompletableFuture<CreateDomainMappingResponse>
     */
    public CompletableFuture<CreateDomainMappingResponse> createDomainMappingAsync(CreateDomainMappingRequest request) {
        return hcClient.asyncInvokeHttp(request, LiveMeta.createDomainMapping);
    }

    /**
     * 域名映射
     * 将用户已创建的播放域名和推流域名建立域名映射关系
     *
     * @param CreateDomainMappingRequest 请求对象
     * @return AsyncInvoker<CreateDomainMappingRequest, CreateDomainMappingResponse>
     */
    public AsyncInvoker<CreateDomainMappingRequest, CreateDomainMappingResponse> createDomainMappingAsyncInvoker(CreateDomainMappingRequest request) {
        return new AsyncInvoker<CreateDomainMappingRequest, CreateDomainMappingResponse>(request, LiveMeta.createDomainMapping, hcClient);
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
     * 创建录制配置
     * 创建录制配置接口
     *
     * @param CreateRecordConfigRequest 请求对象
     * @return AsyncInvoker<CreateRecordConfigRequest, CreateRecordConfigResponse>
     */
    public AsyncInvoker<CreateRecordConfigRequest, CreateRecordConfigResponse> createRecordConfigAsyncInvoker(CreateRecordConfigRequest request) {
        return new AsyncInvoker<CreateRecordConfigRequest, CreateRecordConfigResponse>(request, LiveMeta.createRecordConfig, hcClient);
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
     * 禁止直播推流
     * 禁止直播推流
     *
     * @param CreateStreamForbiddenRequest 请求对象
     * @return AsyncInvoker<CreateStreamForbiddenRequest, CreateStreamForbiddenResponse>
     */
    public AsyncInvoker<CreateStreamForbiddenRequest, CreateStreamForbiddenResponse> createStreamForbiddenAsyncInvoker(CreateStreamForbiddenRequest request) {
        return new AsyncInvoker<CreateStreamForbiddenRequest, CreateStreamForbiddenResponse>(request, LiveMeta.createStreamForbidden, hcClient);
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
     * 创建直播转码模板
     * 创建直播转码模板
     *
     * @param CreateTranscodingsTemplateRequest 请求对象
     * @return AsyncInvoker<CreateTranscodingsTemplateRequest, CreateTranscodingsTemplateResponse>
     */
    public AsyncInvoker<CreateTranscodingsTemplateRequest, CreateTranscodingsTemplateResponse> createTranscodingsTemplateAsyncInvoker(CreateTranscodingsTemplateRequest request) {
        return new AsyncInvoker<CreateTranscodingsTemplateRequest, CreateTranscodingsTemplateResponse>(request, LiveMeta.createTranscodingsTemplate, hcClient);
    }

    /**
     * 删除直播域名
     * 删除域名。只有在域名停用（off）状态时才能删除。
     *
     * @param DeleteDomainRequest 请求对象
     * @return CompletableFuture<DeleteDomainResponse>
     */
    public CompletableFuture<DeleteDomainResponse> deleteDomainAsync(DeleteDomainRequest request) {
        return hcClient.asyncInvokeHttp(request, LiveMeta.deleteDomain);
    }

    /**
     * 删除直播域名
     * 删除域名。只有在域名停用（off）状态时才能删除。
     *
     * @param DeleteDomainRequest 请求对象
     * @return AsyncInvoker<DeleteDomainRequest, DeleteDomainResponse>
     */
    public AsyncInvoker<DeleteDomainRequest, DeleteDomainResponse> deleteDomainAsyncInvoker(DeleteDomainRequest request) {
        return new AsyncInvoker<DeleteDomainRequest, DeleteDomainResponse>(request, LiveMeta.deleteDomain, hcClient);
    }

    /**
     * 删除直播域名映射关系
     * 将播放域名和推流域名的域名映射关系删除
     *
     * @param DeleteDomainMappingRequest 请求对象
     * @return CompletableFuture<DeleteDomainMappingResponse>
     */
    public CompletableFuture<DeleteDomainMappingResponse> deleteDomainMappingAsync(DeleteDomainMappingRequest request) {
        return hcClient.asyncInvokeHttp(request, LiveMeta.deleteDomainMapping);
    }

    /**
     * 删除直播域名映射关系
     * 将播放域名和推流域名的域名映射关系删除
     *
     * @param DeleteDomainMappingRequest 请求对象
     * @return AsyncInvoker<DeleteDomainMappingRequest, DeleteDomainMappingResponse>
     */
    public AsyncInvoker<DeleteDomainMappingRequest, DeleteDomainMappingResponse> deleteDomainMappingAsyncInvoker(DeleteDomainMappingRequest request) {
        return new AsyncInvoker<DeleteDomainMappingRequest, DeleteDomainMappingResponse>(request, LiveMeta.deleteDomainMapping, hcClient);
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
     * 删除录制配置
     * 删除录制配置接口
     *
     * @param DeleteRecordConfigRequest 请求对象
     * @return AsyncInvoker<DeleteRecordConfigRequest, DeleteRecordConfigResponse>
     */
    public AsyncInvoker<DeleteRecordConfigRequest, DeleteRecordConfigResponse> deleteRecordConfigAsyncInvoker(DeleteRecordConfigRequest request) {
        return new AsyncInvoker<DeleteRecordConfigRequest, DeleteRecordConfigResponse>(request, LiveMeta.deleteRecordConfig, hcClient);
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
     * 禁推恢复
     * 恢复直播推流接口
     *
     * @param DeleteStreamForbiddenRequest 请求对象
     * @return AsyncInvoker<DeleteStreamForbiddenRequest, DeleteStreamForbiddenResponse>
     */
    public AsyncInvoker<DeleteStreamForbiddenRequest, DeleteStreamForbiddenResponse> deleteStreamForbiddenAsyncInvoker(DeleteStreamForbiddenRequest request) {
        return new AsyncInvoker<DeleteStreamForbiddenRequest, DeleteStreamForbiddenResponse>(request, LiveMeta.deleteStreamForbidden, hcClient);
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
     * 删除直播转码模板
     * 删除直播转码模板
     *
     * @param DeleteTranscodingsTemplateRequest 请求对象
     * @return AsyncInvoker<DeleteTranscodingsTemplateRequest, DeleteTranscodingsTemplateResponse>
     */
    public AsyncInvoker<DeleteTranscodingsTemplateRequest, DeleteTranscodingsTemplateResponse> deleteTranscodingsTemplateAsyncInvoker(DeleteTranscodingsTemplateRequest request) {
        return new AsyncInvoker<DeleteTranscodingsTemplateRequest, DeleteTranscodingsTemplateResponse>(request, LiveMeta.deleteTranscodingsTemplate, hcClient);
    }

    /**
     * 获取直播播放日志
     * 获取直播播放日志，基于域名以5分钟粒度进行打包，日志内容以 \&quot;|\&quot; 进行分隔。 
     *
     * @param ListLiveSampleLogsRequest 请求对象
     * @return CompletableFuture<ListLiveSampleLogsResponse>
     */
    public CompletableFuture<ListLiveSampleLogsResponse> listLiveSampleLogsAsync(ListLiveSampleLogsRequest request) {
        return hcClient.asyncInvokeHttp(request, LiveMeta.listLiveSampleLogs);
    }

    /**
     * 获取直播播放日志
     * 获取直播播放日志，基于域名以5分钟粒度进行打包，日志内容以 \&quot;|\&quot; 进行分隔。 
     *
     * @param ListLiveSampleLogsRequest 请求对象
     * @return AsyncInvoker<ListLiveSampleLogsRequest, ListLiveSampleLogsResponse>
     */
    public AsyncInvoker<ListLiveSampleLogsRequest, ListLiveSampleLogsResponse> listLiveSampleLogsAsyncInvoker(ListLiveSampleLogsRequest request) {
        return new AsyncInvoker<ListLiveSampleLogsRequest, ListLiveSampleLogsResponse>(request, LiveMeta.listLiveSampleLogs, hcClient);
    }

    /**
     * 查询直播中的流信息
     * 查询直播中的流信息
     *
     * @param ListLiveStreamsOnlineRequest 请求对象
     * @return CompletableFuture<ListLiveStreamsOnlineResponse>
     */
    public CompletableFuture<ListLiveStreamsOnlineResponse> listLiveStreamsOnlineAsync(ListLiveStreamsOnlineRequest request) {
        return hcClient.asyncInvokeHttp(request, LiveMeta.listLiveStreamsOnline);
    }

    /**
     * 查询直播中的流信息
     * 查询直播中的流信息
     *
     * @param ListLiveStreamsOnlineRequest 请求对象
     * @return AsyncInvoker<ListLiveStreamsOnlineRequest, ListLiveStreamsOnlineResponse>
     */
    public AsyncInvoker<ListLiveStreamsOnlineRequest, ListLiveStreamsOnlineResponse> listLiveStreamsOnlineAsyncInvoker(ListLiveStreamsOnlineRequest request) {
        return new AsyncInvoker<ListLiveStreamsOnlineRequest, ListLiveStreamsOnlineResponse>(request, LiveMeta.listLiveStreamsOnline, hcClient);
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
     * 查询录制配置
     * 查询录制配置接口
     *
     * @param ListRecordConfigsRequest 请求对象
     * @return AsyncInvoker<ListRecordConfigsRequest, ListRecordConfigsResponse>
     */
    public AsyncInvoker<ListRecordConfigsRequest, ListRecordConfigsResponse> listRecordConfigsAsyncInvoker(ListRecordConfigsRequest request) {
        return new AsyncInvoker<ListRecordConfigsRequest, ListRecordConfigsResponse>(request, LiveMeta.listRecordConfigs, hcClient);
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
     * 查询禁止直播推流列表
     * 查询禁播黑名单列表
     *
     * @param ListStreamForbiddenRequest 请求对象
     * @return AsyncInvoker<ListStreamForbiddenRequest, ListStreamForbiddenResponse>
     */
    public AsyncInvoker<ListStreamForbiddenRequest, ListStreamForbiddenResponse> listStreamForbiddenAsyncInvoker(ListStreamForbiddenRequest request) {
        return new AsyncInvoker<ListStreamForbiddenRequest, ListStreamForbiddenResponse>(request, LiveMeta.listStreamForbidden, hcClient);
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
     * 查询直播加速的带宽数据
     * 查询直播加速的播流域名网络带宽监控数据
     *
     * @param ShowBandwidthRequest 请求对象
     * @return AsyncInvoker<ShowBandwidthRequest, ShowBandwidthResponse>
     */
    public AsyncInvoker<ShowBandwidthRequest, ShowBandwidthResponse> showBandwidthAsyncInvoker(ShowBandwidthRequest request) {
        return new AsyncInvoker<ShowBandwidthRequest, ShowBandwidthResponse>(request, LiveMeta.showBandwidth, hcClient);
    }

    /**
     * 查询直播域名
     * 查询直播域名
     *
     * @param ShowDomainRequest 请求对象
     * @return CompletableFuture<ShowDomainResponse>
     */
    public CompletableFuture<ShowDomainResponse> showDomainAsync(ShowDomainRequest request) {
        return hcClient.asyncInvokeHttp(request, LiveMeta.showDomain);
    }

    /**
     * 查询直播域名
     * 查询直播域名
     *
     * @param ShowDomainRequest 请求对象
     * @return AsyncInvoker<ShowDomainRequest, ShowDomainResponse>
     */
    public AsyncInvoker<ShowDomainRequest, ShowDomainResponse> showDomainAsyncInvoker(ShowDomainRequest request) {
        return new AsyncInvoker<ShowDomainRequest, ShowDomainResponse>(request, LiveMeta.showDomain, hcClient);
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
     * 查询直播播放在线人数
     * 查询加速的直播播放在线人数
     *
     * @param ShowOnlineUsersRequest 请求对象
     * @return AsyncInvoker<ShowOnlineUsersRequest, ShowOnlineUsersResponse>
     */
    public AsyncInvoker<ShowOnlineUsersRequest, ShowOnlineUsersResponse> showOnlineUsersAsyncInvoker(ShowOnlineUsersRequest request) {
        return new AsyncInvoker<ShowOnlineUsersRequest, ShowOnlineUsersResponse>(request, LiveMeta.showOnlineUsers, hcClient);
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
     * 查询直播加速的流量数据
     * 查询直播加速的播流域名网络流量监控数据
     *
     * @param ShowTrafficRequest 请求对象
     * @return AsyncInvoker<ShowTrafficRequest, ShowTrafficResponse>
     */
    public AsyncInvoker<ShowTrafficRequest, ShowTrafficResponse> showTrafficAsyncInvoker(ShowTrafficRequest request) {
        return new AsyncInvoker<ShowTrafficRequest, ShowTrafficResponse>(request, LiveMeta.showTraffic, hcClient);
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
     * 查询直播转码模板
     * 查询直播转码模板
     *
     * @param ShowTranscodingsTemplateRequest 请求对象
     * @return AsyncInvoker<ShowTranscodingsTemplateRequest, ShowTranscodingsTemplateResponse>
     */
    public AsyncInvoker<ShowTranscodingsTemplateRequest, ShowTranscodingsTemplateResponse> showTranscodingsTemplateAsyncInvoker(ShowTranscodingsTemplateRequest request) {
        return new AsyncInvoker<ShowTranscodingsTemplateRequest, ShowTranscodingsTemplateResponse>(request, LiveMeta.showTranscodingsTemplate, hcClient);
    }

    /**
     * 修改直播域名
     * 修改直播播放、RTMP推流加速域名相关信息
     *
     * @param UpdateDomainRequest 请求对象
     * @return CompletableFuture<UpdateDomainResponse>
     */
    public CompletableFuture<UpdateDomainResponse> updateDomainAsync(UpdateDomainRequest request) {
        return hcClient.asyncInvokeHttp(request, LiveMeta.updateDomain);
    }

    /**
     * 修改直播域名
     * 修改直播播放、RTMP推流加速域名相关信息
     *
     * @param UpdateDomainRequest 请求对象
     * @return AsyncInvoker<UpdateDomainRequest, UpdateDomainResponse>
     */
    public AsyncInvoker<UpdateDomainRequest, UpdateDomainResponse> updateDomainAsyncInvoker(UpdateDomainRequest request) {
        return new AsyncInvoker<UpdateDomainRequest, UpdateDomainResponse>(request, LiveMeta.updateDomain, hcClient);
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
     * 修改禁推属性
     * 修改禁推属性
     *
     * @param UpdateStreamForbiddenRequest 请求对象
     * @return AsyncInvoker<UpdateStreamForbiddenRequest, UpdateStreamForbiddenResponse>
     */
    public AsyncInvoker<UpdateStreamForbiddenRequest, UpdateStreamForbiddenResponse> updateStreamForbiddenAsyncInvoker(UpdateStreamForbiddenRequest request) {
        return new AsyncInvoker<UpdateStreamForbiddenRequest, UpdateStreamForbiddenResponse>(request, LiveMeta.updateStreamForbidden, hcClient);
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

    /**
     * 配置直播转码模板
     * 修改直播转码模板
     *
     * @param UpdateTranscodingsTemplateRequest 请求对象
     * @return AsyncInvoker<UpdateTranscodingsTemplateRequest, UpdateTranscodingsTemplateResponse>
     */
    public AsyncInvoker<UpdateTranscodingsTemplateRequest, UpdateTranscodingsTemplateResponse> updateTranscodingsTemplateAsyncInvoker(UpdateTranscodingsTemplateRequest request) {
        return new AsyncInvoker<UpdateTranscodingsTemplateRequest, UpdateTranscodingsTemplateResponse>(request, LiveMeta.updateTranscodingsTemplate, hcClient);
    }

}