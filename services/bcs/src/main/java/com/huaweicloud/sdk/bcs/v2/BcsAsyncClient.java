package com.huaweicloud.sdk.bcs.v2;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

import com.huaweicloud.sdk.bcs.v2.model.*;

public class BcsAsyncClient {
    protected HcClient hcClient;

    public BcsAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<BcsAsyncClient> newBuilder() {
        return new ClientBuilder<>(BcsAsyncClient::new);
    }


    /**
     * peer节点加入通道
     * peer节点加入通道,目前仅支持往一个通道中加入peer
     *
     * @param BatchAddPeersToChannelRequest 请求对象
     * @return CompletableFuture<BatchAddPeersToChannelResponse>
     */
    public CompletableFuture<BatchAddPeersToChannelResponse> batchAddPeersToChannelAsync(BatchAddPeersToChannelRequest request) {
        return hcClient.asyncInvokeHttp(request, BcsMeta.batchAddPeersToChannel);
    }

    /**
     * 创建通道
     * 创建通道
     *
     * @param BatchCreateChannelsRequest 请求对象
     * @return CompletableFuture<BatchCreateChannelsResponse>
     */
    public CompletableFuture<BatchCreateChannelsResponse> batchCreateChannelsAsync(BatchCreateChannelsRequest request) {
        return hcClient.asyncInvokeHttp(request, BcsMeta.batchCreateChannels);
    }

    /**
     * 邀请联盟成员
     * 批量邀请联盟成员加入通道，此操作会向被邀请方发出邀请通知
     *
     * @param BatchInviteMembersToChannelRequest 请求对象
     * @return CompletableFuture<BatchInviteMembersToChannelResponse>
     */
    public CompletableFuture<BatchInviteMembersToChannelResponse> batchInviteMembersToChannelAsync(BatchInviteMembersToChannelRequest request) {
        return hcClient.asyncInvokeHttp(request, BcsMeta.batchInviteMembersToChannel);
    }

    /**
     * 创建服务实例
     * 创建BCS服务实例
     *
     * @param CreateNewBlockchainRequest 请求对象
     * @return CompletableFuture<CreateNewBlockchainResponse>
     */
    public CompletableFuture<CreateNewBlockchainResponse> createNewBlockchainAsync(CreateNewBlockchainRequest request) {
        return hcClient.asyncInvokeHttp(request, BcsMeta.createNewBlockchain);
    }

    /**
     * 删除bcs实例
     * 删除bcs实例
     *
     * @param DeleteBlockchainRequest 请求对象
     * @return CompletableFuture<DeleteBlockchainResponse>
     */
    public CompletableFuture<DeleteBlockchainResponse> deleteBlockchainAsync(DeleteBlockchainRequest request) {
        return hcClient.asyncInvokeHttp(request, BcsMeta.deleteBlockchain);
    }

    /**
     * 下载证书
     * 下载指定服务实例相关证书
     *
     * @param DownloadBlockchainCertRequest 请求对象
     * @return CompletableFuture<DownloadBlockchainCertResponse>
     */
    public CompletableFuture<DownloadBlockchainCertResponse> downloadBlockchainCertAsync(DownloadBlockchainCertRequest request) {
        return hcClient.asyncInvokeHttp(request, BcsMeta.downloadBlockchainCert);
    }

    /**
     * 下载SDK配置
     * 下载指定服务实例SDK配置文件
     *
     * @param DownloadBlockchainSdkConfigRequest 请求对象
     * @return CompletableFuture<DownloadBlockchainSdkConfigResponse>
     */
    public CompletableFuture<DownloadBlockchainSdkConfigResponse> downloadBlockchainSdkConfigAsync(DownloadBlockchainSdkConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, BcsMeta.downloadBlockchainSdkConfig);
    }

    /**
     * 处理联盟邀请
     * 处理联盟邀请
     *
     * @param HandleNotificationRequest 请求对象
     * @return CompletableFuture<HandleNotificationResponse>
     */
    public CompletableFuture<HandleNotificationResponse> handleNotificationAsync(HandleNotificationRequest request) {
        return hcClient.asyncInvokeHttp(request, BcsMeta.handleNotification);
    }

    /**
     * 查询BCS服务实例监控数据
     * [该接口用于查询BCS服务的监控数据，可以指定相应的指标名称,目前不支持IEF节点](tag:online)[该接口用于查询BCS服务的监控数据，可以指定相应的指标名称](tag:hcs)
     *
     * @param ListBcsMetricRequest 请求对象
     * @return CompletableFuture<ListBcsMetricResponse>
     */
    public CompletableFuture<ListBcsMetricResponse> listBcsMetricAsync(ListBcsMetricRequest request) {
        return hcClient.asyncInvokeHttp(request, BcsMeta.listBcsMetric);
    }

    /**
     * 查询通道信息
     * 查询指定服务实例通道信息
     *
     * @param ListBlockchainChannelsRequest 请求对象
     * @return CompletableFuture<ListBlockchainChannelsResponse>
     */
    public CompletableFuture<ListBlockchainChannelsResponse> listBlockchainChannelsAsync(ListBlockchainChannelsRequest request) {
        return hcClient.asyncInvokeHttp(request, BcsMeta.listBlockchainChannels);
    }

    /**
     * 查询服务实例简要信息
     * 查询当前项目下所有服务实例的简要信息
     *
     * @param ListBlockchainsRequest 请求对象
     * @return CompletableFuture<ListBlockchainsResponse>
     */
    public CompletableFuture<ListBlockchainsResponse> listBlockchainsAsync(ListBlockchainsRequest request) {
        return hcClient.asyncInvokeHttp(request, BcsMeta.listBlockchains);
    }

    /**
     * 查询BCS组织监控数据列表
     * 该接口用于查询BCS组织的监控数据列表。
     *
     * @param ListEntityMetricRequest 请求对象
     * @return CompletableFuture<ListEntityMetricResponse>
     */
    public CompletableFuture<ListEntityMetricResponse> listEntityMetricAsync(ListEntityMetricRequest request) {
        return hcClient.asyncInvokeHttp(request, BcsMeta.listEntityMetric);
    }

    /**
     * 查询BCS组织实例监控数据详情
     * 该接口用于BCS组织实例监控数据详情。
     *
     * @param ListInstanceMetricRequest 请求对象
     * @return CompletableFuture<ListInstanceMetricResponse>
     */
    public CompletableFuture<ListInstanceMetricResponse> listInstanceMetricAsync(ListInstanceMetricRequest request) {
        return hcClient.asyncInvokeHttp(request, BcsMeta.listInstanceMetric);
    }

    /**
     * 获取联盟成员列表
     * 获取联盟成员列表
     *
     * @param ListMembersRequest 请求对象
     * @return CompletableFuture<ListMembersResponse>
     */
    public CompletableFuture<ListMembersResponse> listMembersAsync(ListMembersRequest request) {
        return hcClient.asyncInvokeHttp(request, BcsMeta.listMembers);
    }

    /**
     * 获取全部通知
     * 获取全部通知
     *
     * @param ListNotificationsRequest 请求对象
     * @return CompletableFuture<ListNotificationsResponse>
     */
    public CompletableFuture<ListNotificationsResponse> listNotificationsAsync(ListNotificationsRequest request) {
        return hcClient.asyncInvokeHttp(request, BcsMeta.listNotifications);
    }

    /**
     * 查询配额
     * 查询当前项目下BCS服务所有资源的配额信息
     *
     * @param ListQuotasRequest 请求对象
     * @return CompletableFuture<ListQuotasResponse>
     */
    public CompletableFuture<ListQuotasResponse> listQuotasAsync(ListQuotasRequest request) {
        return hcClient.asyncInvokeHttp(request, BcsMeta.listQuotas);
    }

    /**
     * 查询详细信息
     * 查询指定服务实例详细信息
     *
     * @param ShowBlockchainDetailRequest 请求对象
     * @return CompletableFuture<ShowBlockchainDetailResponse>
     */
    public CompletableFuture<ShowBlockchainDetailResponse> showBlockchainDetailAsync(ShowBlockchainDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, BcsMeta.showBlockchainDetail);
    }

    /**
     * 查询节点信息
     * 查询指定服务实例节点信息
     *
     * @param ShowBlockchainNodesRequest 请求对象
     * @return CompletableFuture<ShowBlockchainNodesResponse>
     */
    public CompletableFuture<ShowBlockchainNodesResponse> showBlockchainNodesAsync(ShowBlockchainNodesRequest request) {
        return hcClient.asyncInvokeHttp(request, BcsMeta.showBlockchainNodes);
    }

    /**
     * 查询创建状态
     * 查询指定服务实例创建状态
     *
     * @param ShowBlockchainStatusRequest 请求对象
     * @return CompletableFuture<ShowBlockchainStatusResponse>
     */
    public CompletableFuture<ShowBlockchainStatusResponse> showBlockchainStatusAsync(ShowBlockchainStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, BcsMeta.showBlockchainStatus);
    }

    /**
     * 修改实例
     * 修改实例的节点、组织，目前仅支持添加节点，添加组织
     *
     * @param UpdateInstanceRequest 请求对象
     * @return CompletableFuture<UpdateInstanceResponse>
     */
    public CompletableFuture<UpdateInstanceResponse> updateInstanceAsync(UpdateInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, BcsMeta.updateInstance);
    }

}