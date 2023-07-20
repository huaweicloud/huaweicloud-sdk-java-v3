package com.huaweicloud.sdk.bcs.v2;

import com.huaweicloud.sdk.bcs.v2.model.BatchAddPeersToChannelRequest;
import com.huaweicloud.sdk.bcs.v2.model.BatchAddPeersToChannelResponse;
import com.huaweicloud.sdk.bcs.v2.model.BatchCreateChannelsRequest;
import com.huaweicloud.sdk.bcs.v2.model.BatchCreateChannelsResponse;
import com.huaweicloud.sdk.bcs.v2.model.BatchInviteMembersToChannelRequest;
import com.huaweicloud.sdk.bcs.v2.model.BatchInviteMembersToChannelResponse;
import com.huaweicloud.sdk.bcs.v2.model.BatchRemoveOrgsFromChannelRequest;
import com.huaweicloud.sdk.bcs.v2.model.BatchRemoveOrgsFromChannelResponse;
import com.huaweicloud.sdk.bcs.v2.model.BatchRemovePeersFromChannelRequest;
import com.huaweicloud.sdk.bcs.v2.model.BatchRemovePeersFromChannelResponse;
import com.huaweicloud.sdk.bcs.v2.model.CreateBlockchainCertByUserNameRequest;
import com.huaweicloud.sdk.bcs.v2.model.CreateBlockchainCertByUserNameResponse;
import com.huaweicloud.sdk.bcs.v2.model.CreateNewBlockchainRequest;
import com.huaweicloud.sdk.bcs.v2.model.CreateNewBlockchainResponse;
import com.huaweicloud.sdk.bcs.v2.model.DeleteBlockchainRequest;
import com.huaweicloud.sdk.bcs.v2.model.DeleteBlockchainResponse;
import com.huaweicloud.sdk.bcs.v2.model.DeleteChannelRequest;
import com.huaweicloud.sdk.bcs.v2.model.DeleteChannelResponse;
import com.huaweicloud.sdk.bcs.v2.model.DeleteMemberInviteRequest;
import com.huaweicloud.sdk.bcs.v2.model.DeleteMemberInviteResponse;
import com.huaweicloud.sdk.bcs.v2.model.DownloadBlockchainCertRequest;
import com.huaweicloud.sdk.bcs.v2.model.DownloadBlockchainCertResponse;
import com.huaweicloud.sdk.bcs.v2.model.DownloadBlockchainSdkConfigRequest;
import com.huaweicloud.sdk.bcs.v2.model.DownloadBlockchainSdkConfigResponse;
import com.huaweicloud.sdk.bcs.v2.model.FreezeCertRequest;
import com.huaweicloud.sdk.bcs.v2.model.FreezeCertResponse;
import com.huaweicloud.sdk.bcs.v2.model.HandleNotificationRequest;
import com.huaweicloud.sdk.bcs.v2.model.HandleNotificationResponse;
import com.huaweicloud.sdk.bcs.v2.model.HandleUnionMemberQuitListRequest;
import com.huaweicloud.sdk.bcs.v2.model.HandleUnionMemberQuitListResponse;
import com.huaweicloud.sdk.bcs.v2.model.ListBcsEventsRequest;
import com.huaweicloud.sdk.bcs.v2.model.ListBcsEventsResponse;
import com.huaweicloud.sdk.bcs.v2.model.ListBcsEventsStatisticRequest;
import com.huaweicloud.sdk.bcs.v2.model.ListBcsEventsStatisticResponse;
import com.huaweicloud.sdk.bcs.v2.model.ListBcsMetricRequest;
import com.huaweicloud.sdk.bcs.v2.model.ListBcsMetricResponse;
import com.huaweicloud.sdk.bcs.v2.model.ListBlockchainChannelsRequest;
import com.huaweicloud.sdk.bcs.v2.model.ListBlockchainChannelsResponse;
import com.huaweicloud.sdk.bcs.v2.model.ListBlockchainsRequest;
import com.huaweicloud.sdk.bcs.v2.model.ListBlockchainsResponse;
import com.huaweicloud.sdk.bcs.v2.model.ListEntityMetricRequest;
import com.huaweicloud.sdk.bcs.v2.model.ListEntityMetricResponse;
import com.huaweicloud.sdk.bcs.v2.model.ListInstanceMetricRequest;
import com.huaweicloud.sdk.bcs.v2.model.ListInstanceMetricResponse;
import com.huaweicloud.sdk.bcs.v2.model.ListMembersRequest;
import com.huaweicloud.sdk.bcs.v2.model.ListMembersResponse;
import com.huaweicloud.sdk.bcs.v2.model.ListNotificationsRequest;
import com.huaweicloud.sdk.bcs.v2.model.ListNotificationsResponse;
import com.huaweicloud.sdk.bcs.v2.model.ListOpRecordRequest;
import com.huaweicloud.sdk.bcs.v2.model.ListOpRecordResponse;
import com.huaweicloud.sdk.bcs.v2.model.ListQuotasRequest;
import com.huaweicloud.sdk.bcs.v2.model.ListQuotasResponse;
import com.huaweicloud.sdk.bcs.v2.model.ShowBlockchainDetailRequest;
import com.huaweicloud.sdk.bcs.v2.model.ShowBlockchainDetailResponse;
import com.huaweicloud.sdk.bcs.v2.model.ShowBlockchainFlavorsRequest;
import com.huaweicloud.sdk.bcs.v2.model.ShowBlockchainFlavorsResponse;
import com.huaweicloud.sdk.bcs.v2.model.ShowBlockchainNodesRequest;
import com.huaweicloud.sdk.bcs.v2.model.ShowBlockchainNodesResponse;
import com.huaweicloud.sdk.bcs.v2.model.ShowBlockchainStatusRequest;
import com.huaweicloud.sdk.bcs.v2.model.ShowBlockchainStatusResponse;
import com.huaweicloud.sdk.bcs.v2.model.UnfreezeCertRequest;
import com.huaweicloud.sdk.bcs.v2.model.UnfreezeCertResponse;
import com.huaweicloud.sdk.bcs.v2.model.UpdateInstanceRequest;
import com.huaweicloud.sdk.bcs.v2.model.UpdateInstanceResponse;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;

public class BcsClient {

    protected HcClient hcClient;

    public BcsClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<BcsClient> newBuilder() {
        ClientBuilder<BcsClient> clientBuilder = new ClientBuilder<>(BcsClient::new);
        return clientBuilder;
    }

    /**
     * peer节点加入通道
     *
     * peer节点加入通道,目前仅支持往一个通道中加入peer
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchAddPeersToChannelRequest 请求对象
     * @return BatchAddPeersToChannelResponse
     */
    public BatchAddPeersToChannelResponse batchAddPeersToChannel(BatchAddPeersToChannelRequest request) {
        return hcClient.syncInvokeHttp(request, BcsMeta.batchAddPeersToChannel);
    }

    /**
     * peer节点加入通道
     *
     * peer节点加入通道,目前仅支持往一个通道中加入peer
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchAddPeersToChannelRequest 请求对象
     * @return SyncInvoker<BatchAddPeersToChannelRequest, BatchAddPeersToChannelResponse>
     */
    public SyncInvoker<BatchAddPeersToChannelRequest, BatchAddPeersToChannelResponse> batchAddPeersToChannelInvoker(
        BatchAddPeersToChannelRequest request) {
        return new SyncInvoker<BatchAddPeersToChannelRequest, BatchAddPeersToChannelResponse>(request,
            BcsMeta.batchAddPeersToChannel, hcClient);
    }

    /**
     * 创建通道
     *
     * 创建通道
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchCreateChannelsRequest 请求对象
     * @return BatchCreateChannelsResponse
     */
    public BatchCreateChannelsResponse batchCreateChannels(BatchCreateChannelsRequest request) {
        return hcClient.syncInvokeHttp(request, BcsMeta.batchCreateChannels);
    }

    /**
     * 创建通道
     *
     * 创建通道
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchCreateChannelsRequest 请求对象
     * @return SyncInvoker<BatchCreateChannelsRequest, BatchCreateChannelsResponse>
     */
    public SyncInvoker<BatchCreateChannelsRequest, BatchCreateChannelsResponse> batchCreateChannelsInvoker(
        BatchCreateChannelsRequest request) {
        return new SyncInvoker<BatchCreateChannelsRequest, BatchCreateChannelsResponse>(request,
            BcsMeta.batchCreateChannels, hcClient);
    }

    /**
     * 邀请联盟成员
     *
     * 批量邀请联盟成员加入通道，此操作会向被邀请方发出邀请通知
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchInviteMembersToChannelRequest 请求对象
     * @return BatchInviteMembersToChannelResponse
     */
    public BatchInviteMembersToChannelResponse batchInviteMembersToChannel(BatchInviteMembersToChannelRequest request) {
        return hcClient.syncInvokeHttp(request, BcsMeta.batchInviteMembersToChannel);
    }

    /**
     * 邀请联盟成员
     *
     * 批量邀请联盟成员加入通道，此操作会向被邀请方发出邀请通知
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchInviteMembersToChannelRequest 请求对象
     * @return SyncInvoker<BatchInviteMembersToChannelRequest, BatchInviteMembersToChannelResponse>
     */
    public SyncInvoker<BatchInviteMembersToChannelRequest, BatchInviteMembersToChannelResponse> batchInviteMembersToChannelInvoker(
        BatchInviteMembersToChannelRequest request) {
        return new SyncInvoker<BatchInviteMembersToChannelRequest, BatchInviteMembersToChannelResponse>(request,
            BcsMeta.batchInviteMembersToChannel, hcClient);
    }

    /**
     * BCS组织退出某通道
     *
     * 该接口用于BCS组织退出某通道。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchRemoveOrgsFromChannelRequest 请求对象
     * @return BatchRemoveOrgsFromChannelResponse
     */
    public BatchRemoveOrgsFromChannelResponse batchRemoveOrgsFromChannel(BatchRemoveOrgsFromChannelRequest request) {
        return hcClient.syncInvokeHttp(request, BcsMeta.batchRemoveOrgsFromChannel);
    }

    /**
     * BCS组织退出某通道
     *
     * 该接口用于BCS组织退出某通道。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchRemoveOrgsFromChannelRequest 请求对象
     * @return SyncInvoker<BatchRemoveOrgsFromChannelRequest, BatchRemoveOrgsFromChannelResponse>
     */
    public SyncInvoker<BatchRemoveOrgsFromChannelRequest, BatchRemoveOrgsFromChannelResponse> batchRemoveOrgsFromChannelInvoker(
        BatchRemoveOrgsFromChannelRequest request) {
        return new SyncInvoker<BatchRemoveOrgsFromChannelRequest, BatchRemoveOrgsFromChannelResponse>(request,
            BcsMeta.batchRemoveOrgsFromChannel, hcClient);
    }

    /**
     * BCS某个组织中的节点退出某通道
     *
     * 该接口用于BCS某个组织中的节点退出某通道。当节点为通道中最后一个节点时，需要使用组织退通道的接口来将通道中的最后一个节点退出。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchRemovePeersFromChannelRequest 请求对象
     * @return BatchRemovePeersFromChannelResponse
     */
    public BatchRemovePeersFromChannelResponse batchRemovePeersFromChannel(BatchRemovePeersFromChannelRequest request) {
        return hcClient.syncInvokeHttp(request, BcsMeta.batchRemovePeersFromChannel);
    }

    /**
     * BCS某个组织中的节点退出某通道
     *
     * 该接口用于BCS某个组织中的节点退出某通道。当节点为通道中最后一个节点时，需要使用组织退通道的接口来将通道中的最后一个节点退出。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchRemovePeersFromChannelRequest 请求对象
     * @return SyncInvoker<BatchRemovePeersFromChannelRequest, BatchRemovePeersFromChannelResponse>
     */
    public SyncInvoker<BatchRemovePeersFromChannelRequest, BatchRemovePeersFromChannelResponse> batchRemovePeersFromChannelInvoker(
        BatchRemovePeersFromChannelRequest request) {
        return new SyncInvoker<BatchRemovePeersFromChannelRequest, BatchRemovePeersFromChannelResponse>(request,
            BcsMeta.batchRemovePeersFromChannel, hcClient);
    }

    /**
     * 生成用户证书
     *
     * 通过用户名生成指定服务实例组织用户证书
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateBlockchainCertByUserNameRequest 请求对象
     * @return CreateBlockchainCertByUserNameResponse
     */
    public CreateBlockchainCertByUserNameResponse createBlockchainCertByUserName(
        CreateBlockchainCertByUserNameRequest request) {
        return hcClient.syncInvokeHttp(request, BcsMeta.createBlockchainCertByUserName);
    }

    /**
     * 生成用户证书
     *
     * 通过用户名生成指定服务实例组织用户证书
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateBlockchainCertByUserNameRequest 请求对象
     * @return SyncInvoker<CreateBlockchainCertByUserNameRequest, CreateBlockchainCertByUserNameResponse>
     */
    public SyncInvoker<CreateBlockchainCertByUserNameRequest, CreateBlockchainCertByUserNameResponse> createBlockchainCertByUserNameInvoker(
        CreateBlockchainCertByUserNameRequest request) {
        return new SyncInvoker<CreateBlockchainCertByUserNameRequest, CreateBlockchainCertByUserNameResponse>(request,
            BcsMeta.createBlockchainCertByUserName, hcClient);
    }

    /**
     * 创建服务实例
     *
     * 创建BCS服务实例,只支持按需创建
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateNewBlockchainRequest 请求对象
     * @return CreateNewBlockchainResponse
     */
    public CreateNewBlockchainResponse createNewBlockchain(CreateNewBlockchainRequest request) {
        return hcClient.syncInvokeHttp(request, BcsMeta.createNewBlockchain);
    }

    /**
     * 创建服务实例
     *
     * 创建BCS服务实例,只支持按需创建
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateNewBlockchainRequest 请求对象
     * @return SyncInvoker<CreateNewBlockchainRequest, CreateNewBlockchainResponse>
     */
    public SyncInvoker<CreateNewBlockchainRequest, CreateNewBlockchainResponse> createNewBlockchainInvoker(
        CreateNewBlockchainRequest request) {
        return new SyncInvoker<CreateNewBlockchainRequest, CreateNewBlockchainResponse>(request,
            BcsMeta.createNewBlockchain, hcClient);
    }

    /**
     * 删除服务实例
     *
     * 删除bcs实例。包周期实例不支持
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteBlockchainRequest 请求对象
     * @return DeleteBlockchainResponse
     */
    public DeleteBlockchainResponse deleteBlockchain(DeleteBlockchainRequest request) {
        return hcClient.syncInvokeHttp(request, BcsMeta.deleteBlockchain);
    }

    /**
     * 删除服务实例
     *
     * 删除bcs实例。包周期实例不支持
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteBlockchainRequest 请求对象
     * @return SyncInvoker<DeleteBlockchainRequest, DeleteBlockchainResponse>
     */
    public SyncInvoker<DeleteBlockchainRequest, DeleteBlockchainResponse> deleteBlockchainInvoker(
        DeleteBlockchainRequest request) {
        return new SyncInvoker<DeleteBlockchainRequest, DeleteBlockchainResponse>(request, BcsMeta.deleteBlockchain,
            hcClient);
    }

    /**
     * BCS删除某个通道
     *
     * 该接口用于BCS删除某个通道。仅支持删除空通道
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteChannelRequest 请求对象
     * @return DeleteChannelResponse
     */
    public DeleteChannelResponse deleteChannel(DeleteChannelRequest request) {
        return hcClient.syncInvokeHttp(request, BcsMeta.deleteChannel);
    }

    /**
     * BCS删除某个通道
     *
     * 该接口用于BCS删除某个通道。仅支持删除空通道
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteChannelRequest 请求对象
     * @return SyncInvoker<DeleteChannelRequest, DeleteChannelResponse>
     */
    public SyncInvoker<DeleteChannelRequest, DeleteChannelResponse> deleteChannelInvoker(DeleteChannelRequest request) {
        return new SyncInvoker<DeleteChannelRequest, DeleteChannelResponse>(request, BcsMeta.deleteChannel, hcClient);
    }

    /**
     * 删除邀请成员信息
     *
     * 可通过此接口批量取消邀请或删除对已退出或拒绝加入或解散的成员邀请信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteMemberInviteRequest 请求对象
     * @return DeleteMemberInviteResponse
     */
    public DeleteMemberInviteResponse deleteMemberInvite(DeleteMemberInviteRequest request) {
        return hcClient.syncInvokeHttp(request, BcsMeta.deleteMemberInvite);
    }

    /**
     * 删除邀请成员信息
     *
     * 可通过此接口批量取消邀请或删除对已退出或拒绝加入或解散的成员邀请信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteMemberInviteRequest 请求对象
     * @return SyncInvoker<DeleteMemberInviteRequest, DeleteMemberInviteResponse>
     */
    public SyncInvoker<DeleteMemberInviteRequest, DeleteMemberInviteResponse> deleteMemberInviteInvoker(
        DeleteMemberInviteRequest request) {
        return new SyncInvoker<DeleteMemberInviteRequest, DeleteMemberInviteResponse>(request,
            BcsMeta.deleteMemberInvite, hcClient);
    }

    /**
     * 下载证书
     *
     * 下载指定服务实例相关证书
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DownloadBlockchainCertRequest 请求对象
     * @return DownloadBlockchainCertResponse
     */
    public DownloadBlockchainCertResponse downloadBlockchainCert(DownloadBlockchainCertRequest request) {
        return hcClient.syncInvokeHttp(request, BcsMeta.downloadBlockchainCert);
    }

    /**
     * 下载证书
     *
     * 下载指定服务实例相关证书
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DownloadBlockchainCertRequest 请求对象
     * @return SyncInvoker<DownloadBlockchainCertRequest, DownloadBlockchainCertResponse>
     */
    public SyncInvoker<DownloadBlockchainCertRequest, DownloadBlockchainCertResponse> downloadBlockchainCertInvoker(
        DownloadBlockchainCertRequest request) {
        return new SyncInvoker<DownloadBlockchainCertRequest, DownloadBlockchainCertResponse>(request,
            BcsMeta.downloadBlockchainCert, hcClient);
    }

    /**
     * 下载SDK配置
     *
     * 下载指定服务实例SDK配置文件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DownloadBlockchainSdkConfigRequest 请求对象
     * @return DownloadBlockchainSdkConfigResponse
     */
    public DownloadBlockchainSdkConfigResponse downloadBlockchainSdkConfig(DownloadBlockchainSdkConfigRequest request) {
        return hcClient.syncInvokeHttp(request, BcsMeta.downloadBlockchainSdkConfig);
    }

    /**
     * 下载SDK配置
     *
     * 下载指定服务实例SDK配置文件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DownloadBlockchainSdkConfigRequest 请求对象
     * @return SyncInvoker<DownloadBlockchainSdkConfigRequest, DownloadBlockchainSdkConfigResponse>
     */
    public SyncInvoker<DownloadBlockchainSdkConfigRequest, DownloadBlockchainSdkConfigResponse> downloadBlockchainSdkConfigInvoker(
        DownloadBlockchainSdkConfigRequest request) {
        return new SyncInvoker<DownloadBlockchainSdkConfigRequest, DownloadBlockchainSdkConfigResponse>(request,
            BcsMeta.downloadBlockchainSdkConfig, hcClient);
    }

    /**
     * 冻结用户证书
     *
     * 冻结指定服务实例组织用户证书，冻结后需等待半分钟到一分钟左右生效
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param FreezeCertRequest 请求对象
     * @return FreezeCertResponse
     */
    public FreezeCertResponse freezeCert(FreezeCertRequest request) {
        return hcClient.syncInvokeHttp(request, BcsMeta.freezeCert);
    }

    /**
     * 冻结用户证书
     *
     * 冻结指定服务实例组织用户证书，冻结后需等待半分钟到一分钟左右生效
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param FreezeCertRequest 请求对象
     * @return SyncInvoker<FreezeCertRequest, FreezeCertResponse>
     */
    public SyncInvoker<FreezeCertRequest, FreezeCertResponse> freezeCertInvoker(FreezeCertRequest request) {
        return new SyncInvoker<FreezeCertRequest, FreezeCertResponse>(request, BcsMeta.freezeCert, hcClient);
    }

    /**
     * 处理联盟邀请
     *
     * 处理联盟邀请
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param HandleNotificationRequest 请求对象
     * @return HandleNotificationResponse
     */
    public HandleNotificationResponse handleNotification(HandleNotificationRequest request) {
        return hcClient.syncInvokeHttp(request, BcsMeta.handleNotification);
    }

    /**
     * 处理联盟邀请
     *
     * 处理联盟邀请
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param HandleNotificationRequest 请求对象
     * @return SyncInvoker<HandleNotificationRequest, HandleNotificationResponse>
     */
    public SyncInvoker<HandleNotificationRequest, HandleNotificationResponse> handleNotificationInvoker(
        HandleNotificationRequest request) {
        return new SyncInvoker<HandleNotificationRequest, HandleNotificationResponse>(request,
            BcsMeta.handleNotification, hcClient);
    }

    /**
     * 被邀请方退出指定联盟
     *
     * 被邀请方退出联盟
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param HandleUnionMemberQuitListRequest 请求对象
     * @return HandleUnionMemberQuitListResponse
     */
    public HandleUnionMemberQuitListResponse handleUnionMemberQuitList(HandleUnionMemberQuitListRequest request) {
        return hcClient.syncInvokeHttp(request, BcsMeta.handleUnionMemberQuitList);
    }

    /**
     * 被邀请方退出指定联盟
     *
     * 被邀请方退出联盟
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param HandleUnionMemberQuitListRequest 请求对象
     * @return SyncInvoker<HandleUnionMemberQuitListRequest, HandleUnionMemberQuitListResponse>
     */
    public SyncInvoker<HandleUnionMemberQuitListRequest, HandleUnionMemberQuitListResponse> handleUnionMemberQuitListInvoker(
        HandleUnionMemberQuitListRequest request) {
        return new SyncInvoker<HandleUnionMemberQuitListRequest, HandleUnionMemberQuitListResponse>(request,
            BcsMeta.handleUnionMemberQuitList, hcClient);
    }

    /**
     * 查询服务实例告警信息
     *
     * 该接口用于查询BCS服务的事件、告警数据，可以指定查询时的过滤条件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListBcsEventsRequest 请求对象
     * @return ListBcsEventsResponse
     */
    public ListBcsEventsResponse listBcsEvents(ListBcsEventsRequest request) {
        return hcClient.syncInvokeHttp(request, BcsMeta.listBcsEvents);
    }

    /**
     * 查询服务实例告警信息
     *
     * 该接口用于查询BCS服务的事件、告警数据，可以指定查询时的过滤条件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListBcsEventsRequest 请求对象
     * @return SyncInvoker<ListBcsEventsRequest, ListBcsEventsResponse>
     */
    public SyncInvoker<ListBcsEventsRequest, ListBcsEventsResponse> listBcsEventsInvoker(ListBcsEventsRequest request) {
        return new SyncInvoker<ListBcsEventsRequest, ListBcsEventsResponse>(request, BcsMeta.listBcsEvents, hcClient);
    }

    /**
     * 查询服务实例告警统计接口
     *
     * 该接口用于查询BCS服务的分段事件、告警统计数据，可以指定查询时的过滤条件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListBcsEventsStatisticRequest 请求对象
     * @return ListBcsEventsStatisticResponse
     */
    public ListBcsEventsStatisticResponse listBcsEventsStatistic(ListBcsEventsStatisticRequest request) {
        return hcClient.syncInvokeHttp(request, BcsMeta.listBcsEventsStatistic);
    }

    /**
     * 查询服务实例告警统计接口
     *
     * 该接口用于查询BCS服务的分段事件、告警统计数据，可以指定查询时的过滤条件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListBcsEventsStatisticRequest 请求对象
     * @return SyncInvoker<ListBcsEventsStatisticRequest, ListBcsEventsStatisticResponse>
     */
    public SyncInvoker<ListBcsEventsStatisticRequest, ListBcsEventsStatisticResponse> listBcsEventsStatisticInvoker(
        ListBcsEventsStatisticRequest request) {
        return new SyncInvoker<ListBcsEventsStatisticRequest, ListBcsEventsStatisticResponse>(request,
            BcsMeta.listBcsEventsStatistic, hcClient);
    }

    /**
     * 查询服务实例监控数据
     *
     * 该接口用于查询BCS服务的监控数据，可以指定相应的指标名称。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListBcsMetricRequest 请求对象
     * @return ListBcsMetricResponse
     */
    public ListBcsMetricResponse listBcsMetric(ListBcsMetricRequest request) {
        return hcClient.syncInvokeHttp(request, BcsMeta.listBcsMetric);
    }

    /**
     * 查询服务实例监控数据
     *
     * 该接口用于查询BCS服务的监控数据，可以指定相应的指标名称。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListBcsMetricRequest 请求对象
     * @return SyncInvoker<ListBcsMetricRequest, ListBcsMetricResponse>
     */
    public SyncInvoker<ListBcsMetricRequest, ListBcsMetricResponse> listBcsMetricInvoker(ListBcsMetricRequest request) {
        return new SyncInvoker<ListBcsMetricRequest, ListBcsMetricResponse>(request, BcsMeta.listBcsMetric, hcClient);
    }

    /**
     * 查询通道信息
     *
     * 查询指定服务实例通道信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListBlockchainChannelsRequest 请求对象
     * @return ListBlockchainChannelsResponse
     */
    public ListBlockchainChannelsResponse listBlockchainChannels(ListBlockchainChannelsRequest request) {
        return hcClient.syncInvokeHttp(request, BcsMeta.listBlockchainChannels);
    }

    /**
     * 查询通道信息
     *
     * 查询指定服务实例通道信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListBlockchainChannelsRequest 请求对象
     * @return SyncInvoker<ListBlockchainChannelsRequest, ListBlockchainChannelsResponse>
     */
    public SyncInvoker<ListBlockchainChannelsRequest, ListBlockchainChannelsResponse> listBlockchainChannelsInvoker(
        ListBlockchainChannelsRequest request) {
        return new SyncInvoker<ListBlockchainChannelsRequest, ListBlockchainChannelsResponse>(request,
            BcsMeta.listBlockchainChannels, hcClient);
    }

    /**
     * 查询服务实例列表
     *
     * 查询当前项目下所有服务实例的简要信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListBlockchainsRequest 请求对象
     * @return ListBlockchainsResponse
     */
    public ListBlockchainsResponse listBlockchains(ListBlockchainsRequest request) {
        return hcClient.syncInvokeHttp(request, BcsMeta.listBlockchains);
    }

    /**
     * 查询服务实例列表
     *
     * 查询当前项目下所有服务实例的简要信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListBlockchainsRequest 请求对象
     * @return SyncInvoker<ListBlockchainsRequest, ListBlockchainsResponse>
     */
    public SyncInvoker<ListBlockchainsRequest, ListBlockchainsResponse> listBlockchainsInvoker(
        ListBlockchainsRequest request) {
        return new SyncInvoker<ListBlockchainsRequest, ListBlockchainsResponse>(request, BcsMeta.listBlockchains,
            hcClient);
    }

    /**
     * 查询BCS组织监控数据列表
     *
     * 该接口用于查询BCS组织的监控数据列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListEntityMetricRequest 请求对象
     * @return ListEntityMetricResponse
     */
    public ListEntityMetricResponse listEntityMetric(ListEntityMetricRequest request) {
        return hcClient.syncInvokeHttp(request, BcsMeta.listEntityMetric);
    }

    /**
     * 查询BCS组织监控数据列表
     *
     * 该接口用于查询BCS组织的监控数据列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListEntityMetricRequest 请求对象
     * @return SyncInvoker<ListEntityMetricRequest, ListEntityMetricResponse>
     */
    public SyncInvoker<ListEntityMetricRequest, ListEntityMetricResponse> listEntityMetricInvoker(
        ListEntityMetricRequest request) {
        return new SyncInvoker<ListEntityMetricRequest, ListEntityMetricResponse>(request, BcsMeta.listEntityMetric,
            hcClient);
    }

    /**
     * 查询BCS组织实例监控数据详情
     *
     * 该接口用于BCS组织实例监控数据详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListInstanceMetricRequest 请求对象
     * @return ListInstanceMetricResponse
     */
    public ListInstanceMetricResponse listInstanceMetric(ListInstanceMetricRequest request) {
        return hcClient.syncInvokeHttp(request, BcsMeta.listInstanceMetric);
    }

    /**
     * 查询BCS组织实例监控数据详情
     *
     * 该接口用于BCS组织实例监控数据详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListInstanceMetricRequest 请求对象
     * @return SyncInvoker<ListInstanceMetricRequest, ListInstanceMetricResponse>
     */
    public SyncInvoker<ListInstanceMetricRequest, ListInstanceMetricResponse> listInstanceMetricInvoker(
        ListInstanceMetricRequest request) {
        return new SyncInvoker<ListInstanceMetricRequest, ListInstanceMetricResponse>(request,
            BcsMeta.listInstanceMetric, hcClient);
    }

    /**
     * 获取联盟成员列表
     *
     * 获取联盟成员列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListMembersRequest 请求对象
     * @return ListMembersResponse
     */
    public ListMembersResponse listMembers(ListMembersRequest request) {
        return hcClient.syncInvokeHttp(request, BcsMeta.listMembers);
    }

    /**
     * 获取联盟成员列表
     *
     * 获取联盟成员列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListMembersRequest 请求对象
     * @return SyncInvoker<ListMembersRequest, ListMembersResponse>
     */
    public SyncInvoker<ListMembersRequest, ListMembersResponse> listMembersInvoker(ListMembersRequest request) {
        return new SyncInvoker<ListMembersRequest, ListMembersResponse>(request, BcsMeta.listMembers, hcClient);
    }

    /**
     * 获取全部通知
     *
     * 获取全部通知
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListNotificationsRequest 请求对象
     * @return ListNotificationsResponse
     */
    public ListNotificationsResponse listNotifications(ListNotificationsRequest request) {
        return hcClient.syncInvokeHttp(request, BcsMeta.listNotifications);
    }

    /**
     * 获取全部通知
     *
     * 获取全部通知
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListNotificationsRequest 请求对象
     * @return SyncInvoker<ListNotificationsRequest, ListNotificationsResponse>
     */
    public SyncInvoker<ListNotificationsRequest, ListNotificationsResponse> listNotificationsInvoker(
        ListNotificationsRequest request) {
        return new SyncInvoker<ListNotificationsRequest, ListNotificationsResponse>(request, BcsMeta.listNotifications,
            hcClient);
    }

    /**
     * 查询异步操作结果
     *
     * 查询异步操作结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListOpRecordRequest 请求对象
     * @return ListOpRecordResponse
     */
    public ListOpRecordResponse listOpRecord(ListOpRecordRequest request) {
        return hcClient.syncInvokeHttp(request, BcsMeta.listOpRecord);
    }

    /**
     * 查询异步操作结果
     *
     * 查询异步操作结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListOpRecordRequest 请求对象
     * @return SyncInvoker<ListOpRecordRequest, ListOpRecordResponse>
     */
    public SyncInvoker<ListOpRecordRequest, ListOpRecordResponse> listOpRecordInvoker(ListOpRecordRequest request) {
        return new SyncInvoker<ListOpRecordRequest, ListOpRecordResponse>(request, BcsMeta.listOpRecord, hcClient);
    }

    /**
     * 查询配额
     *
     * 查询当前项目下BCS服务所有资源的配额信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListQuotasRequest 请求对象
     * @return ListQuotasResponse
     */
    public ListQuotasResponse listQuotas(ListQuotasRequest request) {
        return hcClient.syncInvokeHttp(request, BcsMeta.listQuotas);
    }

    /**
     * 查询配额
     *
     * 查询当前项目下BCS服务所有资源的配额信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListQuotasRequest 请求对象
     * @return SyncInvoker<ListQuotasRequest, ListQuotasResponse>
     */
    public SyncInvoker<ListQuotasRequest, ListQuotasResponse> listQuotasInvoker(ListQuotasRequest request) {
        return new SyncInvoker<ListQuotasRequest, ListQuotasResponse>(request, BcsMeta.listQuotas, hcClient);
    }

    /**
     * 查询实例信息
     *
     * 查询指定服务实例详细信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowBlockchainDetailRequest 请求对象
     * @return ShowBlockchainDetailResponse
     */
    public ShowBlockchainDetailResponse showBlockchainDetail(ShowBlockchainDetailRequest request) {
        return hcClient.syncInvokeHttp(request, BcsMeta.showBlockchainDetail);
    }

    /**
     * 查询实例信息
     *
     * 查询指定服务实例详细信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowBlockchainDetailRequest 请求对象
     * @return SyncInvoker<ShowBlockchainDetailRequest, ShowBlockchainDetailResponse>
     */
    public SyncInvoker<ShowBlockchainDetailRequest, ShowBlockchainDetailResponse> showBlockchainDetailInvoker(
        ShowBlockchainDetailRequest request) {
        return new SyncInvoker<ShowBlockchainDetailRequest, ShowBlockchainDetailResponse>(request,
            BcsMeta.showBlockchainDetail, hcClient);
    }

    /**
     * 查询规格
     *
     * 查询服务联盟链规格信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowBlockchainFlavorsRequest 请求对象
     * @return ShowBlockchainFlavorsResponse
     */
    public ShowBlockchainFlavorsResponse showBlockchainFlavors(ShowBlockchainFlavorsRequest request) {
        return hcClient.syncInvokeHttp(request, BcsMeta.showBlockchainFlavors);
    }

    /**
     * 查询规格
     *
     * 查询服务联盟链规格信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowBlockchainFlavorsRequest 请求对象
     * @return SyncInvoker<ShowBlockchainFlavorsRequest, ShowBlockchainFlavorsResponse>
     */
    public SyncInvoker<ShowBlockchainFlavorsRequest, ShowBlockchainFlavorsResponse> showBlockchainFlavorsInvoker(
        ShowBlockchainFlavorsRequest request) {
        return new SyncInvoker<ShowBlockchainFlavorsRequest, ShowBlockchainFlavorsResponse>(request,
            BcsMeta.showBlockchainFlavors, hcClient);
    }

    /**
     * 查询节点信息
     *
     * 查询指定服务实例节点信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowBlockchainNodesRequest 请求对象
     * @return ShowBlockchainNodesResponse
     */
    public ShowBlockchainNodesResponse showBlockchainNodes(ShowBlockchainNodesRequest request) {
        return hcClient.syncInvokeHttp(request, BcsMeta.showBlockchainNodes);
    }

    /**
     * 查询节点信息
     *
     * 查询指定服务实例节点信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowBlockchainNodesRequest 请求对象
     * @return SyncInvoker<ShowBlockchainNodesRequest, ShowBlockchainNodesResponse>
     */
    public SyncInvoker<ShowBlockchainNodesRequest, ShowBlockchainNodesResponse> showBlockchainNodesInvoker(
        ShowBlockchainNodesRequest request) {
        return new SyncInvoker<ShowBlockchainNodesRequest, ShowBlockchainNodesResponse>(request,
            BcsMeta.showBlockchainNodes, hcClient);
    }

    /**
     * 查询创建状态
     *
     * 查询指定服务实例创建状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowBlockchainStatusRequest 请求对象
     * @return ShowBlockchainStatusResponse
     */
    public ShowBlockchainStatusResponse showBlockchainStatus(ShowBlockchainStatusRequest request) {
        return hcClient.syncInvokeHttp(request, BcsMeta.showBlockchainStatus);
    }

    /**
     * 查询创建状态
     *
     * 查询指定服务实例创建状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowBlockchainStatusRequest 请求对象
     * @return SyncInvoker<ShowBlockchainStatusRequest, ShowBlockchainStatusResponse>
     */
    public SyncInvoker<ShowBlockchainStatusRequest, ShowBlockchainStatusResponse> showBlockchainStatusInvoker(
        ShowBlockchainStatusRequest request) {
        return new SyncInvoker<ShowBlockchainStatusRequest, ShowBlockchainStatusResponse>(request,
            BcsMeta.showBlockchainStatus, hcClient);
    }

    /**
     * 解冻用户证书
     *
     * 解冻指定服务实例组织用户证书，解冻后需等待半分钟到一分钟左右生效
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UnfreezeCertRequest 请求对象
     * @return UnfreezeCertResponse
     */
    public UnfreezeCertResponse unfreezeCert(UnfreezeCertRequest request) {
        return hcClient.syncInvokeHttp(request, BcsMeta.unfreezeCert);
    }

    /**
     * 解冻用户证书
     *
     * 解冻指定服务实例组织用户证书，解冻后需等待半分钟到一分钟左右生效
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UnfreezeCertRequest 请求对象
     * @return SyncInvoker<UnfreezeCertRequest, UnfreezeCertResponse>
     */
    public SyncInvoker<UnfreezeCertRequest, UnfreezeCertResponse> unfreezeCertInvoker(UnfreezeCertRequest request) {
        return new SyncInvoker<UnfreezeCertRequest, UnfreezeCertResponse>(request, BcsMeta.unfreezeCert, hcClient);
    }

    /**
     * 修改服务实例
     *
     * 修改实例的节点、组织，目前仅支持添加、删除节点（IEF模式不支持添加、删除节点），添加、删除组织，共4种类型，每次操作只可以操作一种类型。此接口不支持包周期模式; 注意注册IEF节点时，IEF节点名称长度应该为4-24位的字符
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateInstanceRequest 请求对象
     * @return UpdateInstanceResponse
     */
    public UpdateInstanceResponse updateInstance(UpdateInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, BcsMeta.updateInstance);
    }

    /**
     * 修改服务实例
     *
     * 修改实例的节点、组织，目前仅支持添加、删除节点（IEF模式不支持添加、删除节点），添加、删除组织，共4种类型，每次操作只可以操作一种类型。此接口不支持包周期模式; 注意注册IEF节点时，IEF节点名称长度应该为4-24位的字符
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateInstanceRequest 请求对象
     * @return SyncInvoker<UpdateInstanceRequest, UpdateInstanceResponse>
     */
    public SyncInvoker<UpdateInstanceRequest, UpdateInstanceResponse> updateInstanceInvoker(
        UpdateInstanceRequest request) {
        return new SyncInvoker<UpdateInstanceRequest, UpdateInstanceResponse>(request, BcsMeta.updateInstance,
            hcClient);
    }

}
