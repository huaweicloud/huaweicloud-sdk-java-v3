package com.huaweicloud.sdk.bcs.v2;

import com.huaweicloud.sdk.bcs.v2.model.*;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;

public class BcsClient {

    protected HcClient hcClient;

    public BcsClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<BcsClient> newBuilder() {
        return new ClientBuilder<>(BcsClient::new);
    }

    /** peer节点加入通道 peer节点加入通道,目前仅支持往一个通道中加入peer
     *
     * @param BatchAddPeersToChannelRequest 请求对象
     * @return BatchAddPeersToChannelResponse */
    public BatchAddPeersToChannelResponse batchAddPeersToChannel(BatchAddPeersToChannelRequest request) {
        return hcClient.syncInvokeHttp(request, BcsMeta.batchAddPeersToChannel);
    }

    /** peer节点加入通道 peer节点加入通道,目前仅支持往一个通道中加入peer
     *
     * @param BatchAddPeersToChannelRequest 请求对象
     * @return SyncInvoker<BatchAddPeersToChannelRequest, BatchAddPeersToChannelResponse> */
    public SyncInvoker<BatchAddPeersToChannelRequest, BatchAddPeersToChannelResponse> batchAddPeersToChannelInvoker(
        BatchAddPeersToChannelRequest request) {
        return new SyncInvoker<BatchAddPeersToChannelRequest, BatchAddPeersToChannelResponse>(request,
            BcsMeta.batchAddPeersToChannel, hcClient);
    }

    /** 创建通道 创建通道
     *
     * @param BatchCreateChannelsRequest 请求对象
     * @return BatchCreateChannelsResponse */
    public BatchCreateChannelsResponse batchCreateChannels(BatchCreateChannelsRequest request) {
        return hcClient.syncInvokeHttp(request, BcsMeta.batchCreateChannels);
    }

    /** 创建通道 创建通道
     *
     * @param BatchCreateChannelsRequest 请求对象
     * @return SyncInvoker<BatchCreateChannelsRequest, BatchCreateChannelsResponse> */
    public SyncInvoker<BatchCreateChannelsRequest, BatchCreateChannelsResponse> batchCreateChannelsInvoker(
        BatchCreateChannelsRequest request) {
        return new SyncInvoker<BatchCreateChannelsRequest, BatchCreateChannelsResponse>(request,
            BcsMeta.batchCreateChannels, hcClient);
    }

    /** 邀请联盟成员 批量邀请联盟成员加入通道，此操作会向被邀请方发出邀请通知
     *
     * @param BatchInviteMembersToChannelRequest 请求对象
     * @return BatchInviteMembersToChannelResponse */
    public BatchInviteMembersToChannelResponse batchInviteMembersToChannel(BatchInviteMembersToChannelRequest request) {
        return hcClient.syncInvokeHttp(request, BcsMeta.batchInviteMembersToChannel);
    }

    /** 邀请联盟成员 批量邀请联盟成员加入通道，此操作会向被邀请方发出邀请通知
     *
     * @param BatchInviteMembersToChannelRequest 请求对象
     * @return SyncInvoker<BatchInviteMembersToChannelRequest, BatchInviteMembersToChannelResponse> */
    public SyncInvoker<BatchInviteMembersToChannelRequest, BatchInviteMembersToChannelResponse> batchInviteMembersToChannelInvoker(
        BatchInviteMembersToChannelRequest request) {
        return new SyncInvoker<BatchInviteMembersToChannelRequest, BatchInviteMembersToChannelResponse>(request,
            BcsMeta.batchInviteMembersToChannel, hcClient);
    }

    /** BCS组织退出某通道 该接口用于BCS组织退出某通道。
     *
     * @param BatchRemoveOrgsFromChannelRequest 请求对象
     * @return BatchRemoveOrgsFromChannelResponse */
    public BatchRemoveOrgsFromChannelResponse batchRemoveOrgsFromChannel(BatchRemoveOrgsFromChannelRequest request) {
        return hcClient.syncInvokeHttp(request, BcsMeta.batchRemoveOrgsFromChannel);
    }

    /** BCS组织退出某通道 该接口用于BCS组织退出某通道。
     *
     * @param BatchRemoveOrgsFromChannelRequest 请求对象
     * @return SyncInvoker<BatchRemoveOrgsFromChannelRequest, BatchRemoveOrgsFromChannelResponse> */
    public SyncInvoker<BatchRemoveOrgsFromChannelRequest, BatchRemoveOrgsFromChannelResponse> batchRemoveOrgsFromChannelInvoker(
        BatchRemoveOrgsFromChannelRequest request) {
        return new SyncInvoker<BatchRemoveOrgsFromChannelRequest, BatchRemoveOrgsFromChannelResponse>(request,
            BcsMeta.batchRemoveOrgsFromChannel, hcClient);
    }

    /** 创建服务实例 创建BCS服务实例,只支持按需创建
     *
     * @param CreateNewBlockchainRequest 请求对象
     * @return CreateNewBlockchainResponse */
    public CreateNewBlockchainResponse createNewBlockchain(CreateNewBlockchainRequest request) {
        return hcClient.syncInvokeHttp(request, BcsMeta.createNewBlockchain);
    }

    /** 创建服务实例 创建BCS服务实例,只支持按需创建
     *
     * @param CreateNewBlockchainRequest 请求对象
     * @return SyncInvoker<CreateNewBlockchainRequest, CreateNewBlockchainResponse> */
    public SyncInvoker<CreateNewBlockchainRequest, CreateNewBlockchainResponse> createNewBlockchainInvoker(
        CreateNewBlockchainRequest request) {
        return new SyncInvoker<CreateNewBlockchainRequest, CreateNewBlockchainResponse>(request,
            BcsMeta.createNewBlockchain, hcClient);
    }

    /** 删除服务实例 删除bcs实例。包周期实例不支持
     *
     * @param DeleteBlockchainRequest 请求对象
     * @return DeleteBlockchainResponse */
    public DeleteBlockchainResponse deleteBlockchain(DeleteBlockchainRequest request) {
        return hcClient.syncInvokeHttp(request, BcsMeta.deleteBlockchain);
    }

    /** 删除服务实例 删除bcs实例。包周期实例不支持
     *
     * @param DeleteBlockchainRequest 请求对象
     * @return SyncInvoker<DeleteBlockchainRequest, DeleteBlockchainResponse> */
    public SyncInvoker<DeleteBlockchainRequest, DeleteBlockchainResponse> deleteBlockchainInvoker(
        DeleteBlockchainRequest request) {
        return new SyncInvoker<DeleteBlockchainRequest, DeleteBlockchainResponse>(request, BcsMeta.deleteBlockchain,
            hcClient);
    }

    /** 下载证书 下载指定服务实例相关证书
     *
     * @param DownloadBlockchainCertRequest 请求对象
     * @return DownloadBlockchainCertResponse */
    public DownloadBlockchainCertResponse downloadBlockchainCert(DownloadBlockchainCertRequest request) {
        return hcClient.syncInvokeHttp(request, BcsMeta.downloadBlockchainCert);
    }

    /** 下载证书 下载指定服务实例相关证书
     *
     * @param DownloadBlockchainCertRequest 请求对象
     * @return SyncInvoker<DownloadBlockchainCertRequest, DownloadBlockchainCertResponse> */
    public SyncInvoker<DownloadBlockchainCertRequest, DownloadBlockchainCertResponse> downloadBlockchainCertInvoker(
        DownloadBlockchainCertRequest request) {
        return new SyncInvoker<DownloadBlockchainCertRequest, DownloadBlockchainCertResponse>(request,
            BcsMeta.downloadBlockchainCert, hcClient);
    }

    /** 下载SDK配置 下载指定服务实例SDK配置文件
     *
     * @param DownloadBlockchainSdkConfigRequest 请求对象
     * @return DownloadBlockchainSdkConfigResponse */
    public DownloadBlockchainSdkConfigResponse downloadBlockchainSdkConfig(DownloadBlockchainSdkConfigRequest request) {
        return hcClient.syncInvokeHttp(request, BcsMeta.downloadBlockchainSdkConfig);
    }

    /** 下载SDK配置 下载指定服务实例SDK配置文件
     *
     * @param DownloadBlockchainSdkConfigRequest 请求对象
     * @return SyncInvoker<DownloadBlockchainSdkConfigRequest, DownloadBlockchainSdkConfigResponse> */
    public SyncInvoker<DownloadBlockchainSdkConfigRequest, DownloadBlockchainSdkConfigResponse> downloadBlockchainSdkConfigInvoker(
        DownloadBlockchainSdkConfigRequest request) {
        return new SyncInvoker<DownloadBlockchainSdkConfigRequest, DownloadBlockchainSdkConfigResponse>(request,
            BcsMeta.downloadBlockchainSdkConfig, hcClient);
    }

    /** 处理联盟邀请 处理联盟邀请
     *
     * @param HandleNotificationRequest 请求对象
     * @return HandleNotificationResponse */
    public HandleNotificationResponse handleNotification(HandleNotificationRequest request) {
        return hcClient.syncInvokeHttp(request, BcsMeta.handleNotification);
    }

    /** 处理联盟邀请 处理联盟邀请
     *
     * @param HandleNotificationRequest 请求对象
     * @return SyncInvoker<HandleNotificationRequest, HandleNotificationResponse> */
    public SyncInvoker<HandleNotificationRequest, HandleNotificationResponse> handleNotificationInvoker(
        HandleNotificationRequest request) {
        return new SyncInvoker<HandleNotificationRequest, HandleNotificationResponse>(request,
            BcsMeta.handleNotification, hcClient);
    }

    /** 查询BCS服务实例监控数据 该接口用于查询BCS服务的监控数据，可以指定相应的指标名称。[目前不支持IEF节点](tag:hasief)
     *
     * @param ListBcsMetricRequest 请求对象
     * @return ListBcsMetricResponse */
    public ListBcsMetricResponse listBcsMetric(ListBcsMetricRequest request) {
        return hcClient.syncInvokeHttp(request, BcsMeta.listBcsMetric);
    }

    /** 查询BCS服务实例监控数据 该接口用于查询BCS服务的监控数据，可以指定相应的指标名称。[目前不支持IEF节点](tag:hasief)
     *
     * @param ListBcsMetricRequest 请求对象
     * @return SyncInvoker<ListBcsMetricRequest, ListBcsMetricResponse> */
    public SyncInvoker<ListBcsMetricRequest, ListBcsMetricResponse> listBcsMetricInvoker(ListBcsMetricRequest request) {
        return new SyncInvoker<ListBcsMetricRequest, ListBcsMetricResponse>(request, BcsMeta.listBcsMetric, hcClient);
    }

    /** 查询通道信息 查询指定服务实例通道信息
     *
     * @param ListBlockchainChannelsRequest 请求对象
     * @return ListBlockchainChannelsResponse */
    public ListBlockchainChannelsResponse listBlockchainChannels(ListBlockchainChannelsRequest request) {
        return hcClient.syncInvokeHttp(request, BcsMeta.listBlockchainChannels);
    }

    /** 查询通道信息 查询指定服务实例通道信息
     *
     * @param ListBlockchainChannelsRequest 请求对象
     * @return SyncInvoker<ListBlockchainChannelsRequest, ListBlockchainChannelsResponse> */
    public SyncInvoker<ListBlockchainChannelsRequest, ListBlockchainChannelsResponse> listBlockchainChannelsInvoker(
        ListBlockchainChannelsRequest request) {
        return new SyncInvoker<ListBlockchainChannelsRequest, ListBlockchainChannelsResponse>(request,
            BcsMeta.listBlockchainChannels, hcClient);
    }

    /** 查询服务实例列表 查询当前项目下所有服务实例的简要信息
     *
     * @param ListBlockchainsRequest 请求对象
     * @return ListBlockchainsResponse */
    public ListBlockchainsResponse listBlockchains(ListBlockchainsRequest request) {
        return hcClient.syncInvokeHttp(request, BcsMeta.listBlockchains);
    }

    /** 查询服务实例列表 查询当前项目下所有服务实例的简要信息
     *
     * @param ListBlockchainsRequest 请求对象
     * @return SyncInvoker<ListBlockchainsRequest, ListBlockchainsResponse> */
    public SyncInvoker<ListBlockchainsRequest, ListBlockchainsResponse> listBlockchainsInvoker(
        ListBlockchainsRequest request) {
        return new SyncInvoker<ListBlockchainsRequest, ListBlockchainsResponse>(request, BcsMeta.listBlockchains,
            hcClient);
    }

    /** 查询BCS组织监控数据列表 该接口用于查询BCS组织的监控数据列表。
     *
     * @param ListEntityMetricRequest 请求对象
     * @return ListEntityMetricResponse */
    public ListEntityMetricResponse listEntityMetric(ListEntityMetricRequest request) {
        return hcClient.syncInvokeHttp(request, BcsMeta.listEntityMetric);
    }

    /** 查询BCS组织监控数据列表 该接口用于查询BCS组织的监控数据列表。
     *
     * @param ListEntityMetricRequest 请求对象
     * @return SyncInvoker<ListEntityMetricRequest, ListEntityMetricResponse> */
    public SyncInvoker<ListEntityMetricRequest, ListEntityMetricResponse> listEntityMetricInvoker(
        ListEntityMetricRequest request) {
        return new SyncInvoker<ListEntityMetricRequest, ListEntityMetricResponse>(request, BcsMeta.listEntityMetric,
            hcClient);
    }

    /** 查询BCS组织实例监控数据详情 该接口用于BCS组织实例监控数据详情。
     *
     * @param ListInstanceMetricRequest 请求对象
     * @return ListInstanceMetricResponse */
    public ListInstanceMetricResponse listInstanceMetric(ListInstanceMetricRequest request) {
        return hcClient.syncInvokeHttp(request, BcsMeta.listInstanceMetric);
    }

    /** 查询BCS组织实例监控数据详情 该接口用于BCS组织实例监控数据详情。
     *
     * @param ListInstanceMetricRequest 请求对象
     * @return SyncInvoker<ListInstanceMetricRequest, ListInstanceMetricResponse> */
    public SyncInvoker<ListInstanceMetricRequest, ListInstanceMetricResponse> listInstanceMetricInvoker(
        ListInstanceMetricRequest request) {
        return new SyncInvoker<ListInstanceMetricRequest, ListInstanceMetricResponse>(request,
            BcsMeta.listInstanceMetric, hcClient);
    }

    /** 获取联盟成员列表 获取联盟成员列表
     *
     * @param ListMembersRequest 请求对象
     * @return ListMembersResponse */
    public ListMembersResponse listMembers(ListMembersRequest request) {
        return hcClient.syncInvokeHttp(request, BcsMeta.listMembers);
    }

    /** 获取联盟成员列表 获取联盟成员列表
     *
     * @param ListMembersRequest 请求对象
     * @return SyncInvoker<ListMembersRequest, ListMembersResponse> */
    public SyncInvoker<ListMembersRequest, ListMembersResponse> listMembersInvoker(ListMembersRequest request) {
        return new SyncInvoker<ListMembersRequest, ListMembersResponse>(request, BcsMeta.listMembers, hcClient);
    }

    /** 获取全部通知 获取全部通知
     *
     * @param ListNotificationsRequest 请求对象
     * @return ListNotificationsResponse */
    public ListNotificationsResponse listNotifications(ListNotificationsRequest request) {
        return hcClient.syncInvokeHttp(request, BcsMeta.listNotifications);
    }

    /** 获取全部通知 获取全部通知
     *
     * @param ListNotificationsRequest 请求对象
     * @return SyncInvoker<ListNotificationsRequest, ListNotificationsResponse> */
    public SyncInvoker<ListNotificationsRequest, ListNotificationsResponse> listNotificationsInvoker(
        ListNotificationsRequest request) {
        return new SyncInvoker<ListNotificationsRequest, ListNotificationsResponse>(request, BcsMeta.listNotifications,
            hcClient);
    }

    /** 查询异步操作结果 查询异步操作结果
     *
     * @param ListOpRecordRequest 请求对象
     * @return ListOpRecordResponse */
    public ListOpRecordResponse listOpRecord(ListOpRecordRequest request) {
        return hcClient.syncInvokeHttp(request, BcsMeta.listOpRecord);
    }

    /** 查询异步操作结果 查询异步操作结果
     *
     * @param ListOpRecordRequest 请求对象
     * @return SyncInvoker<ListOpRecordRequest, ListOpRecordResponse> */
    public SyncInvoker<ListOpRecordRequest, ListOpRecordResponse> listOpRecordInvoker(ListOpRecordRequest request) {
        return new SyncInvoker<ListOpRecordRequest, ListOpRecordResponse>(request, BcsMeta.listOpRecord, hcClient);
    }

    /** 查询配额 查询当前项目下BCS服务所有资源的配额信息
     *
     * @param ListQuotasRequest 请求对象
     * @return ListQuotasResponse */
    public ListQuotasResponse listQuotas(ListQuotasRequest request) {
        return hcClient.syncInvokeHttp(request, BcsMeta.listQuotas);
    }

    /** 查询配额 查询当前项目下BCS服务所有资源的配额信息
     *
     * @param ListQuotasRequest 请求对象
     * @return SyncInvoker<ListQuotasRequest, ListQuotasResponse> */
    public SyncInvoker<ListQuotasRequest, ListQuotasResponse> listQuotasInvoker(ListQuotasRequest request) {
        return new SyncInvoker<ListQuotasRequest, ListQuotasResponse>(request, BcsMeta.listQuotas, hcClient);
    }

    /** 查询实例信息 查询指定服务实例详细信息
     *
     * @param ShowBlockchainDetailRequest 请求对象
     * @return ShowBlockchainDetailResponse */
    public ShowBlockchainDetailResponse showBlockchainDetail(ShowBlockchainDetailRequest request) {
        return hcClient.syncInvokeHttp(request, BcsMeta.showBlockchainDetail);
    }

    /** 查询实例信息 查询指定服务实例详细信息
     *
     * @param ShowBlockchainDetailRequest 请求对象
     * @return SyncInvoker<ShowBlockchainDetailRequest, ShowBlockchainDetailResponse> */
    public SyncInvoker<ShowBlockchainDetailRequest, ShowBlockchainDetailResponse> showBlockchainDetailInvoker(
        ShowBlockchainDetailRequest request) {
        return new SyncInvoker<ShowBlockchainDetailRequest, ShowBlockchainDetailResponse>(request,
            BcsMeta.showBlockchainDetail, hcClient);
    }

    /** 查询规格 查询服务联盟链规格信息
     *
     * @param ShowBlockchainFlavorsRequest 请求对象
     * @return ShowBlockchainFlavorsResponse */
    public ShowBlockchainFlavorsResponse showBlockchainFlavors(ShowBlockchainFlavorsRequest request) {
        return hcClient.syncInvokeHttp(request, BcsMeta.showBlockchainFlavors);
    }

    /** 查询规格 查询服务联盟链规格信息
     *
     * @param ShowBlockchainFlavorsRequest 请求对象
     * @return SyncInvoker<ShowBlockchainFlavorsRequest, ShowBlockchainFlavorsResponse> */
    public SyncInvoker<ShowBlockchainFlavorsRequest, ShowBlockchainFlavorsResponse> showBlockchainFlavorsInvoker(
        ShowBlockchainFlavorsRequest request) {
        return new SyncInvoker<ShowBlockchainFlavorsRequest, ShowBlockchainFlavorsResponse>(request,
            BcsMeta.showBlockchainFlavors, hcClient);
    }

    /** 查询节点信息 查询指定服务实例节点信息
     *
     * @param ShowBlockchainNodesRequest 请求对象
     * @return ShowBlockchainNodesResponse */
    public ShowBlockchainNodesResponse showBlockchainNodes(ShowBlockchainNodesRequest request) {
        return hcClient.syncInvokeHttp(request, BcsMeta.showBlockchainNodes);
    }

    /** 查询节点信息 查询指定服务实例节点信息
     *
     * @param ShowBlockchainNodesRequest 请求对象
     * @return SyncInvoker<ShowBlockchainNodesRequest, ShowBlockchainNodesResponse> */
    public SyncInvoker<ShowBlockchainNodesRequest, ShowBlockchainNodesResponse> showBlockchainNodesInvoker(
        ShowBlockchainNodesRequest request) {
        return new SyncInvoker<ShowBlockchainNodesRequest, ShowBlockchainNodesResponse>(request,
            BcsMeta.showBlockchainNodes, hcClient);
    }

    /** 查询创建状态 查询指定服务实例创建状态
     *
     * @param ShowBlockchainStatusRequest 请求对象
     * @return ShowBlockchainStatusResponse */
    public ShowBlockchainStatusResponse showBlockchainStatus(ShowBlockchainStatusRequest request) {
        return hcClient.syncInvokeHttp(request, BcsMeta.showBlockchainStatus);
    }

    /** 查询创建状态 查询指定服务实例创建状态
     *
     * @param ShowBlockchainStatusRequest 请求对象
     * @return SyncInvoker<ShowBlockchainStatusRequest, ShowBlockchainStatusResponse> */
    public SyncInvoker<ShowBlockchainStatusRequest, ShowBlockchainStatusResponse> showBlockchainStatusInvoker(
        ShowBlockchainStatusRequest request) {
        return new SyncInvoker<ShowBlockchainStatusRequest, ShowBlockchainStatusResponse>(request,
            BcsMeta.showBlockchainStatus, hcClient);
    }

    /** 修改服务实例 修改实例的节点、组织，目前仅支持添加、删除节点（IEF模式不支持添加、删除节点），添加、删除组织，共4种类型，每次操作只可以操作一种类型。此接口不支持包周期模式;
     * 注意注册IEF节点时，IEF节点名称长度应该为4-24位的字符
     *
     * @param UpdateInstanceRequest 请求对象
     * @return UpdateInstanceResponse */
    public UpdateInstanceResponse updateInstance(UpdateInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, BcsMeta.updateInstance);
    }

    /** 修改服务实例 修改实例的节点、组织，目前仅支持添加、删除节点（IEF模式不支持添加、删除节点），添加、删除组织，共4种类型，每次操作只可以操作一种类型。此接口不支持包周期模式;
     * 注意注册IEF节点时，IEF节点名称长度应该为4-24位的字符
     *
     * @param UpdateInstanceRequest 请求对象
     * @return SyncInvoker<UpdateInstanceRequest, UpdateInstanceResponse> */
    public SyncInvoker<UpdateInstanceRequest, UpdateInstanceResponse> updateInstanceInvoker(
        UpdateInstanceRequest request) {
        return new SyncInvoker<UpdateInstanceRequest, UpdateInstanceResponse>(request, BcsMeta.updateInstance,
            hcClient);
    }

}
