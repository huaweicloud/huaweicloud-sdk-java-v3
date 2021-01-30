package com.huaweicloud.sdk.bcs.v2;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
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
     * peer节点加入通道
     * peer节点加入通道,目前仅支持往一个通道中加入peer
     *
     * @param BatchAddPeersToChannelRequest 请求对象
     * @return AsyncInvoker<BatchAddPeersToChannelRequest, BatchAddPeersToChannelResponse>
     */
    public AsyncInvoker<BatchAddPeersToChannelRequest, BatchAddPeersToChannelResponse> batchAddPeersToChannelAsyncInvoker(BatchAddPeersToChannelRequest request) {
        return new AsyncInvoker<BatchAddPeersToChannelRequest, BatchAddPeersToChannelResponse>(request, BcsMeta.batchAddPeersToChannel, hcClient);
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
     * 创建通道
     * 创建通道
     *
     * @param BatchCreateChannelsRequest 请求对象
     * @return AsyncInvoker<BatchCreateChannelsRequest, BatchCreateChannelsResponse>
     */
    public AsyncInvoker<BatchCreateChannelsRequest, BatchCreateChannelsResponse> batchCreateChannelsAsyncInvoker(BatchCreateChannelsRequest request) {
        return new AsyncInvoker<BatchCreateChannelsRequest, BatchCreateChannelsResponse>(request, BcsMeta.batchCreateChannels, hcClient);
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
     * 邀请联盟成员
     * 批量邀请联盟成员加入通道，此操作会向被邀请方发出邀请通知
     *
     * @param BatchInviteMembersToChannelRequest 请求对象
     * @return AsyncInvoker<BatchInviteMembersToChannelRequest, BatchInviteMembersToChannelResponse>
     */
    public AsyncInvoker<BatchInviteMembersToChannelRequest, BatchInviteMembersToChannelResponse> batchInviteMembersToChannelAsyncInvoker(BatchInviteMembersToChannelRequest request) {
        return new AsyncInvoker<BatchInviteMembersToChannelRequest, BatchInviteMembersToChannelResponse>(request, BcsMeta.batchInviteMembersToChannel, hcClient);
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
     * 创建服务实例
     * 创建BCS服务实例
     *
     * @param CreateNewBlockchainRequest 请求对象
     * @return AsyncInvoker<CreateNewBlockchainRequest, CreateNewBlockchainResponse>
     */
    public AsyncInvoker<CreateNewBlockchainRequest, CreateNewBlockchainResponse> createNewBlockchainAsyncInvoker(CreateNewBlockchainRequest request) {
        return new AsyncInvoker<CreateNewBlockchainRequest, CreateNewBlockchainResponse>(request, BcsMeta.createNewBlockchain, hcClient);
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
     * 删除bcs实例
     * 删除bcs实例
     *
     * @param DeleteBlockchainRequest 请求对象
     * @return AsyncInvoker<DeleteBlockchainRequest, DeleteBlockchainResponse>
     */
    public AsyncInvoker<DeleteBlockchainRequest, DeleteBlockchainResponse> deleteBlockchainAsyncInvoker(DeleteBlockchainRequest request) {
        return new AsyncInvoker<DeleteBlockchainRequest, DeleteBlockchainResponse>(request, BcsMeta.deleteBlockchain, hcClient);
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
     * 下载证书
     * 下载指定服务实例相关证书
     *
     * @param DownloadBlockchainCertRequest 请求对象
     * @return AsyncInvoker<DownloadBlockchainCertRequest, DownloadBlockchainCertResponse>
     */
    public AsyncInvoker<DownloadBlockchainCertRequest, DownloadBlockchainCertResponse> downloadBlockchainCertAsyncInvoker(DownloadBlockchainCertRequest request) {
        return new AsyncInvoker<DownloadBlockchainCertRequest, DownloadBlockchainCertResponse>(request, BcsMeta.downloadBlockchainCert, hcClient);
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
     * 下载SDK配置
     * 下载指定服务实例SDK配置文件
     *
     * @param DownloadBlockchainSdkConfigRequest 请求对象
     * @return AsyncInvoker<DownloadBlockchainSdkConfigRequest, DownloadBlockchainSdkConfigResponse>
     */
    public AsyncInvoker<DownloadBlockchainSdkConfigRequest, DownloadBlockchainSdkConfigResponse> downloadBlockchainSdkConfigAsyncInvoker(DownloadBlockchainSdkConfigRequest request) {
        return new AsyncInvoker<DownloadBlockchainSdkConfigRequest, DownloadBlockchainSdkConfigResponse>(request, BcsMeta.downloadBlockchainSdkConfig, hcClient);
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
     * 处理联盟邀请
     * 处理联盟邀请
     *
     * @param HandleNotificationRequest 请求对象
     * @return AsyncInvoker<HandleNotificationRequest, HandleNotificationResponse>
     */
    public AsyncInvoker<HandleNotificationRequest, HandleNotificationResponse> handleNotificationAsyncInvoker(HandleNotificationRequest request) {
        return new AsyncInvoker<HandleNotificationRequest, HandleNotificationResponse>(request, BcsMeta.handleNotification, hcClient);
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
     * 查询BCS服务实例监控数据
     * [该接口用于查询BCS服务的监控数据，可以指定相应的指标名称,目前不支持IEF节点](tag:online)[该接口用于查询BCS服务的监控数据，可以指定相应的指标名称](tag:hcs)
     *
     * @param ListBcsMetricRequest 请求对象
     * @return AsyncInvoker<ListBcsMetricRequest, ListBcsMetricResponse>
     */
    public AsyncInvoker<ListBcsMetricRequest, ListBcsMetricResponse> listBcsMetricAsyncInvoker(ListBcsMetricRequest request) {
        return new AsyncInvoker<ListBcsMetricRequest, ListBcsMetricResponse>(request, BcsMeta.listBcsMetric, hcClient);
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
     * 查询通道信息
     * 查询指定服务实例通道信息
     *
     * @param ListBlockchainChannelsRequest 请求对象
     * @return AsyncInvoker<ListBlockchainChannelsRequest, ListBlockchainChannelsResponse>
     */
    public AsyncInvoker<ListBlockchainChannelsRequest, ListBlockchainChannelsResponse> listBlockchainChannelsAsyncInvoker(ListBlockchainChannelsRequest request) {
        return new AsyncInvoker<ListBlockchainChannelsRequest, ListBlockchainChannelsResponse>(request, BcsMeta.listBlockchainChannels, hcClient);
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
     * 查询服务实例简要信息
     * 查询当前项目下所有服务实例的简要信息
     *
     * @param ListBlockchainsRequest 请求对象
     * @return AsyncInvoker<ListBlockchainsRequest, ListBlockchainsResponse>
     */
    public AsyncInvoker<ListBlockchainsRequest, ListBlockchainsResponse> listBlockchainsAsyncInvoker(ListBlockchainsRequest request) {
        return new AsyncInvoker<ListBlockchainsRequest, ListBlockchainsResponse>(request, BcsMeta.listBlockchains, hcClient);
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
     * 查询BCS组织监控数据列表
     * 该接口用于查询BCS组织的监控数据列表。
     *
     * @param ListEntityMetricRequest 请求对象
     * @return AsyncInvoker<ListEntityMetricRequest, ListEntityMetricResponse>
     */
    public AsyncInvoker<ListEntityMetricRequest, ListEntityMetricResponse> listEntityMetricAsyncInvoker(ListEntityMetricRequest request) {
        return new AsyncInvoker<ListEntityMetricRequest, ListEntityMetricResponse>(request, BcsMeta.listEntityMetric, hcClient);
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
     * 查询BCS组织实例监控数据详情
     * 该接口用于BCS组织实例监控数据详情。
     *
     * @param ListInstanceMetricRequest 请求对象
     * @return AsyncInvoker<ListInstanceMetricRequest, ListInstanceMetricResponse>
     */
    public AsyncInvoker<ListInstanceMetricRequest, ListInstanceMetricResponse> listInstanceMetricAsyncInvoker(ListInstanceMetricRequest request) {
        return new AsyncInvoker<ListInstanceMetricRequest, ListInstanceMetricResponse>(request, BcsMeta.listInstanceMetric, hcClient);
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
     * 获取联盟成员列表
     * 获取联盟成员列表
     *
     * @param ListMembersRequest 请求对象
     * @return AsyncInvoker<ListMembersRequest, ListMembersResponse>
     */
    public AsyncInvoker<ListMembersRequest, ListMembersResponse> listMembersAsyncInvoker(ListMembersRequest request) {
        return new AsyncInvoker<ListMembersRequest, ListMembersResponse>(request, BcsMeta.listMembers, hcClient);
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
     * 获取全部通知
     * 获取全部通知
     *
     * @param ListNotificationsRequest 请求对象
     * @return AsyncInvoker<ListNotificationsRequest, ListNotificationsResponse>
     */
    public AsyncInvoker<ListNotificationsRequest, ListNotificationsResponse> listNotificationsAsyncInvoker(ListNotificationsRequest request) {
        return new AsyncInvoker<ListNotificationsRequest, ListNotificationsResponse>(request, BcsMeta.listNotifications, hcClient);
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
     * 查询配额
     * 查询当前项目下BCS服务所有资源的配额信息
     *
     * @param ListQuotasRequest 请求对象
     * @return AsyncInvoker<ListQuotasRequest, ListQuotasResponse>
     */
    public AsyncInvoker<ListQuotasRequest, ListQuotasResponse> listQuotasAsyncInvoker(ListQuotasRequest request) {
        return new AsyncInvoker<ListQuotasRequest, ListQuotasResponse>(request, BcsMeta.listQuotas, hcClient);
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
     * 查询详细信息
     * 查询指定服务实例详细信息
     *
     * @param ShowBlockchainDetailRequest 请求对象
     * @return AsyncInvoker<ShowBlockchainDetailRequest, ShowBlockchainDetailResponse>
     */
    public AsyncInvoker<ShowBlockchainDetailRequest, ShowBlockchainDetailResponse> showBlockchainDetailAsyncInvoker(ShowBlockchainDetailRequest request) {
        return new AsyncInvoker<ShowBlockchainDetailRequest, ShowBlockchainDetailResponse>(request, BcsMeta.showBlockchainDetail, hcClient);
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
     * 查询节点信息
     * 查询指定服务实例节点信息
     *
     * @param ShowBlockchainNodesRequest 请求对象
     * @return AsyncInvoker<ShowBlockchainNodesRequest, ShowBlockchainNodesResponse>
     */
    public AsyncInvoker<ShowBlockchainNodesRequest, ShowBlockchainNodesResponse> showBlockchainNodesAsyncInvoker(ShowBlockchainNodesRequest request) {
        return new AsyncInvoker<ShowBlockchainNodesRequest, ShowBlockchainNodesResponse>(request, BcsMeta.showBlockchainNodes, hcClient);
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
     * 查询创建状态
     * 查询指定服务实例创建状态
     *
     * @param ShowBlockchainStatusRequest 请求对象
     * @return AsyncInvoker<ShowBlockchainStatusRequest, ShowBlockchainStatusResponse>
     */
    public AsyncInvoker<ShowBlockchainStatusRequest, ShowBlockchainStatusResponse> showBlockchainStatusAsyncInvoker(ShowBlockchainStatusRequest request) {
        return new AsyncInvoker<ShowBlockchainStatusRequest, ShowBlockchainStatusResponse>(request, BcsMeta.showBlockchainStatus, hcClient);
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

    /**
     * 修改实例
     * 修改实例的节点、组织，目前仅支持添加节点，添加组织
     *
     * @param UpdateInstanceRequest 请求对象
     * @return AsyncInvoker<UpdateInstanceRequest, UpdateInstanceResponse>
     */
    public AsyncInvoker<UpdateInstanceRequest, UpdateInstanceResponse> updateInstanceAsyncInvoker(UpdateInstanceRequest request) {
        return new AsyncInvoker<UpdateInstanceRequest, UpdateInstanceResponse>(request, BcsMeta.updateInstance, hcClient);
    }

}