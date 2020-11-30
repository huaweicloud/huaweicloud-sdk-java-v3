package com.huaweicloud.sdk.bcs.v2;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.bcs.v2.model.*;

public class BcsClient {
    protected HcClient hcClient;

    public BcsClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<BcsClient> newBuilder() {
        return new ClientBuilder<>(BcsClient::new);
    }


    /**
     * peer节点加入通道
     * peer节点加入通道,目前仅支持往一个通道中加入peer
     *
     * @param BatchAddPeersToChannelRequest 请求对象
     * @return BatchAddPeersToChannelResponse
     */
    public BatchAddPeersToChannelResponse batchAddPeersToChannel(BatchAddPeersToChannelRequest request) {
        return hcClient.syncInvokeHttp(request, BcsMeta.batchAddPeersToChannel);
    }

    /**
     * 创建通道
     * 创建通道
     *
     * @param BatchCreateChannelsRequest 请求对象
     * @return BatchCreateChannelsResponse
     */
    public BatchCreateChannelsResponse batchCreateChannels(BatchCreateChannelsRequest request) {
        return hcClient.syncInvokeHttp(request, BcsMeta.batchCreateChannels);
    }

    /**
     * 邀请联盟成员
     * 批量邀请联盟成员加入通道，此操作会向被邀请方发出邀请通知
     *
     * @param BatchInviteMembersToChannelRequest 请求对象
     * @return BatchInviteMembersToChannelResponse
     */
    public BatchInviteMembersToChannelResponse batchInviteMembersToChannel(BatchInviteMembersToChannelRequest request) {
        return hcClient.syncInvokeHttp(request, BcsMeta.batchInviteMembersToChannel);
    }

    /**
     * 创建服务实例
     * 创建BCS服务实例
     *
     * @param CreateNewBlockchainRequest 请求对象
     * @return CreateNewBlockchainResponse
     */
    public CreateNewBlockchainResponse createNewBlockchain(CreateNewBlockchainRequest request) {
        return hcClient.syncInvokeHttp(request, BcsMeta.createNewBlockchain);
    }

    /**
     * 删除bcs实例
     * 删除bcs实例
     *
     * @param DeleteBlockchainRequest 请求对象
     * @return DeleteBlockchainResponse
     */
    public DeleteBlockchainResponse deleteBlockchain(DeleteBlockchainRequest request) {
        return hcClient.syncInvokeHttp(request, BcsMeta.deleteBlockchain);
    }

    /**
     * 下载证书
     * 下载指定服务实例相关证书
     *
     * @param DownloadBlockchainCertRequest 请求对象
     * @return DownloadBlockchainCertResponse
     */
    public DownloadBlockchainCertResponse downloadBlockchainCert(DownloadBlockchainCertRequest request) {
        return hcClient.syncInvokeHttp(request, BcsMeta.downloadBlockchainCert);
    }

    /**
     * 下载SDK配置
     * 下载指定服务实例SDK配置文件
     *
     * @param DownloadBlockchainSdkConfigRequest 请求对象
     * @return DownloadBlockchainSdkConfigResponse
     */
    public DownloadBlockchainSdkConfigResponse downloadBlockchainSdkConfig(DownloadBlockchainSdkConfigRequest request) {
        return hcClient.syncInvokeHttp(request, BcsMeta.downloadBlockchainSdkConfig);
    }

    /**
     * 处理联盟邀请
     * 处理联盟邀请
     *
     * @param HandleNotificationRequest 请求对象
     * @return HandleNotificationResponse
     */
    public HandleNotificationResponse handleNotification(HandleNotificationRequest request) {
        return hcClient.syncInvokeHttp(request, BcsMeta.handleNotification);
    }

    /**
     * 查询BCS服务实例监控数据
     * 该接口用于查询BCS服务的监控数据，可以指定相应的指标名称。
     *
     * @param ListBcsMetricRequest 请求对象
     * @return ListBcsMetricResponse
     */
    public ListBcsMetricResponse listBcsMetric(ListBcsMetricRequest request) {
        return hcClient.syncInvokeHttp(request, BcsMeta.listBcsMetric);
    }

    /**
     * 查询通道信息
     * 查询指定服务实例通道信息
     *
     * @param ListBlockchainChannelsRequest 请求对象
     * @return ListBlockchainChannelsResponse
     */
    public ListBlockchainChannelsResponse listBlockchainChannels(ListBlockchainChannelsRequest request) {
        return hcClient.syncInvokeHttp(request, BcsMeta.listBlockchainChannels);
    }

    /**
     * 查询服务实例简要信息
     * 查询当前项目下所有服务实例的简要信息
     *
     * @param ListBlockchainsRequest 请求对象
     * @return ListBlockchainsResponse
     */
    public ListBlockchainsResponse listBlockchains(ListBlockchainsRequest request) {
        return hcClient.syncInvokeHttp(request, BcsMeta.listBlockchains);
    }

    /**
     * 查询BCS组织监控数据列表
     * 该接口用于查询BCS组织的监控数据列表。
     *
     * @param ListEntityMetricRequest 请求对象
     * @return ListEntityMetricResponse
     */
    public ListEntityMetricResponse listEntityMetric(ListEntityMetricRequest request) {
        return hcClient.syncInvokeHttp(request, BcsMeta.listEntityMetric);
    }

    /**
     * 查询BCS组织实例监控数据详情
     * 该接口用于BCS组织实例监控数据详情。
     *
     * @param ListInstanceMetricRequest 请求对象
     * @return ListInstanceMetricResponse
     */
    public ListInstanceMetricResponse listInstanceMetric(ListInstanceMetricRequest request) {
        return hcClient.syncInvokeHttp(request, BcsMeta.listInstanceMetric);
    }

    /**
     * 获取联盟成员列表
     * 获取联盟成员列表
     *
     * @param ListMembersRequest 请求对象
     * @return ListMembersResponse
     */
    public ListMembersResponse listMembers(ListMembersRequest request) {
        return hcClient.syncInvokeHttp(request, BcsMeta.listMembers);
    }

    /**
     * 获取全部通知
     * 获取全部通知
     *
     * @param ListNotificationsRequest 请求对象
     * @return ListNotificationsResponse
     */
    public ListNotificationsResponse listNotifications(ListNotificationsRequest request) {
        return hcClient.syncInvokeHttp(request, BcsMeta.listNotifications);
    }

    /**
     * 查询配额
     * 查询当前项目下BCS服务所有资源的配额信息
     *
     * @param ListQuotasRequest 请求对象
     * @return ListQuotasResponse
     */
    public ListQuotasResponse listQuotas(ListQuotasRequest request) {
        return hcClient.syncInvokeHttp(request, BcsMeta.listQuotas);
    }

    /**
     * 查询详细信息
     * 查询指定服务实例详细信息
     *
     * @param ShowBlockchainDetailRequest 请求对象
     * @return ShowBlockchainDetailResponse
     */
    public ShowBlockchainDetailResponse showBlockchainDetail(ShowBlockchainDetailRequest request) {
        return hcClient.syncInvokeHttp(request, BcsMeta.showBlockchainDetail);
    }

    /**
     * 查询节点信息
     * 查询指定服务实例节点信息
     *
     * @param ShowBlockchainNodesRequest 请求对象
     * @return ShowBlockchainNodesResponse
     */
    public ShowBlockchainNodesResponse showBlockchainNodes(ShowBlockchainNodesRequest request) {
        return hcClient.syncInvokeHttp(request, BcsMeta.showBlockchainNodes);
    }

    /**
     * 查询创建状态
     * 查询指定服务实例创建状态
     *
     * @param ShowBlockchainStatusRequest 请求对象
     * @return ShowBlockchainStatusResponse
     */
    public ShowBlockchainStatusResponse showBlockchainStatus(ShowBlockchainStatusRequest request) {
        return hcClient.syncInvokeHttp(request, BcsMeta.showBlockchainStatus);
    }

    /**
     * 修改实例
     * 修改实例的节点、组织，目前仅支持添加节点，添加组织
     *
     * @param UpdateInstanceRequest 请求对象
     * @return UpdateInstanceResponse
     */
    public UpdateInstanceResponse updateInstance(UpdateInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, BcsMeta.updateInstance);
    }

}