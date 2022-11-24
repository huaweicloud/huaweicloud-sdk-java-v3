package com.huaweicloud.sdk.bcs.v2;

import com.huaweicloud.sdk.bcs.v2.model.*;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;

import java.util.concurrent.CompletableFuture;

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
     *
     * peer节点加入通道,目前仅支持往一个通道中加入peer
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param BatchAddPeersToChannelRequest 请求对象
     * @return CompletableFuture<BatchAddPeersToChannelResponse>
     */
    public CompletableFuture<BatchAddPeersToChannelResponse> batchAddPeersToChannelAsync(
        BatchAddPeersToChannelRequest request) {
        return hcClient.asyncInvokeHttp(request, BcsMeta.batchAddPeersToChannel);
    }

    /**
     * peer节点加入通道
     *
     * peer节点加入通道,目前仅支持往一个通道中加入peer
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param BatchAddPeersToChannelRequest 请求对象
     * @return AsyncInvoker<BatchAddPeersToChannelRequest, BatchAddPeersToChannelResponse>
     */
    public AsyncInvoker<BatchAddPeersToChannelRequest, BatchAddPeersToChannelResponse> batchAddPeersToChannelAsyncInvoker(
        BatchAddPeersToChannelRequest request) {
        return new AsyncInvoker<BatchAddPeersToChannelRequest, BatchAddPeersToChannelResponse>(request,
            BcsMeta.batchAddPeersToChannel, hcClient);
    }

    /**
     * 创建通道
     *
     * 创建通道
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param BatchCreateChannelsRequest 请求对象
     * @return CompletableFuture<BatchCreateChannelsResponse>
     */
    public CompletableFuture<BatchCreateChannelsResponse> batchCreateChannelsAsync(BatchCreateChannelsRequest request) {
        return hcClient.asyncInvokeHttp(request, BcsMeta.batchCreateChannels);
    }

    /**
     * 创建通道
     *
     * 创建通道
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param BatchCreateChannelsRequest 请求对象
     * @return AsyncInvoker<BatchCreateChannelsRequest, BatchCreateChannelsResponse>
     */
    public AsyncInvoker<BatchCreateChannelsRequest, BatchCreateChannelsResponse> batchCreateChannelsAsyncInvoker(
        BatchCreateChannelsRequest request) {
        return new AsyncInvoker<BatchCreateChannelsRequest, BatchCreateChannelsResponse>(request,
            BcsMeta.batchCreateChannels, hcClient);
    }

    /**
     * 邀请联盟成员
     *
     * 批量邀请联盟成员加入通道，此操作会向被邀请方发出邀请通知
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param BatchInviteMembersToChannelRequest 请求对象
     * @return CompletableFuture<BatchInviteMembersToChannelResponse>
     */
    public CompletableFuture<BatchInviteMembersToChannelResponse> batchInviteMembersToChannelAsync(
        BatchInviteMembersToChannelRequest request) {
        return hcClient.asyncInvokeHttp(request, BcsMeta.batchInviteMembersToChannel);
    }

    /**
     * 邀请联盟成员
     *
     * 批量邀请联盟成员加入通道，此操作会向被邀请方发出邀请通知
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param BatchInviteMembersToChannelRequest 请求对象
     * @return AsyncInvoker<BatchInviteMembersToChannelRequest, BatchInviteMembersToChannelResponse>
     */
    public AsyncInvoker<BatchInviteMembersToChannelRequest, BatchInviteMembersToChannelResponse> batchInviteMembersToChannelAsyncInvoker(
        BatchInviteMembersToChannelRequest request) {
        return new AsyncInvoker<BatchInviteMembersToChannelRequest, BatchInviteMembersToChannelResponse>(request,
            BcsMeta.batchInviteMembersToChannel, hcClient);
    }

    /**
     * BCS组织退出某通道
     *
     * 该接口用于BCS组织退出某通道。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param BatchRemoveOrgsFromChannelRequest 请求对象
     * @return CompletableFuture<BatchRemoveOrgsFromChannelResponse>
     */
    public CompletableFuture<BatchRemoveOrgsFromChannelResponse> batchRemoveOrgsFromChannelAsync(
        BatchRemoveOrgsFromChannelRequest request) {
        return hcClient.asyncInvokeHttp(request, BcsMeta.batchRemoveOrgsFromChannel);
    }

    /**
     * BCS组织退出某通道
     *
     * 该接口用于BCS组织退出某通道。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param BatchRemoveOrgsFromChannelRequest 请求对象
     * @return AsyncInvoker<BatchRemoveOrgsFromChannelRequest, BatchRemoveOrgsFromChannelResponse>
     */
    public AsyncInvoker<BatchRemoveOrgsFromChannelRequest, BatchRemoveOrgsFromChannelResponse> batchRemoveOrgsFromChannelAsyncInvoker(
        BatchRemoveOrgsFromChannelRequest request) {
        return new AsyncInvoker<BatchRemoveOrgsFromChannelRequest, BatchRemoveOrgsFromChannelResponse>(request,
            BcsMeta.batchRemoveOrgsFromChannel, hcClient);
    }

    /**
     * BCS某个组织中的节点退出某通道
     *
     * 该接口用于BCS某个组织中的节点退出某通道。当节点为通道中最后一个节点时，需要使用组织退通道的接口来将通道中的最后一个节点退出。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param BatchRemovePeersFromChannelRequest 请求对象
     * @return CompletableFuture<BatchRemovePeersFromChannelResponse>
     */
    public CompletableFuture<BatchRemovePeersFromChannelResponse> batchRemovePeersFromChannelAsync(
        BatchRemovePeersFromChannelRequest request) {
        return hcClient.asyncInvokeHttp(request, BcsMeta.batchRemovePeersFromChannel);
    }

    /**
     * BCS某个组织中的节点退出某通道
     *
     * 该接口用于BCS某个组织中的节点退出某通道。当节点为通道中最后一个节点时，需要使用组织退通道的接口来将通道中的最后一个节点退出。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param BatchRemovePeersFromChannelRequest 请求对象
     * @return AsyncInvoker<BatchRemovePeersFromChannelRequest, BatchRemovePeersFromChannelResponse>
     */
    public AsyncInvoker<BatchRemovePeersFromChannelRequest, BatchRemovePeersFromChannelResponse> batchRemovePeersFromChannelAsyncInvoker(
        BatchRemovePeersFromChannelRequest request) {
        return new AsyncInvoker<BatchRemovePeersFromChannelRequest, BatchRemovePeersFromChannelResponse>(request,
            BcsMeta.batchRemovePeersFromChannel, hcClient);
    }

    /**
     * 生成用户证书
     *
     * 通过用户名生成指定服务实例组织用户证书
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateBlockchainCertByUserNameRequest 请求对象
     * @return CompletableFuture<CreateBlockchainCertByUserNameResponse>
     */
    public CompletableFuture<CreateBlockchainCertByUserNameResponse> createBlockchainCertByUserNameAsync(
        CreateBlockchainCertByUserNameRequest request) {
        return hcClient.asyncInvokeHttp(request, BcsMeta.createBlockchainCertByUserName);
    }

    /**
     * 生成用户证书
     *
     * 通过用户名生成指定服务实例组织用户证书
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateBlockchainCertByUserNameRequest 请求对象
     * @return AsyncInvoker<CreateBlockchainCertByUserNameRequest, CreateBlockchainCertByUserNameResponse>
     */
    public AsyncInvoker<CreateBlockchainCertByUserNameRequest, CreateBlockchainCertByUserNameResponse> createBlockchainCertByUserNameAsyncInvoker(
        CreateBlockchainCertByUserNameRequest request) {
        return new AsyncInvoker<CreateBlockchainCertByUserNameRequest, CreateBlockchainCertByUserNameResponse>(request,
            BcsMeta.createBlockchainCertByUserName, hcClient);
    }

    /**
     * 创建服务实例
     *
     * 创建BCS服务实例,只支持按需创建
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateNewBlockchainRequest 请求对象
     * @return CompletableFuture<CreateNewBlockchainResponse>
     */
    public CompletableFuture<CreateNewBlockchainResponse> createNewBlockchainAsync(CreateNewBlockchainRequest request) {
        return hcClient.asyncInvokeHttp(request, BcsMeta.createNewBlockchain);
    }

    /**
     * 创建服务实例
     *
     * 创建BCS服务实例,只支持按需创建
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateNewBlockchainRequest 请求对象
     * @return AsyncInvoker<CreateNewBlockchainRequest, CreateNewBlockchainResponse>
     */
    public AsyncInvoker<CreateNewBlockchainRequest, CreateNewBlockchainResponse> createNewBlockchainAsyncInvoker(
        CreateNewBlockchainRequest request) {
        return new AsyncInvoker<CreateNewBlockchainRequest, CreateNewBlockchainResponse>(request,
            BcsMeta.createNewBlockchain, hcClient);
    }

    /**
     * 删除服务实例
     *
     * 删除bcs实例。包周期实例不支持
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteBlockchainRequest 请求对象
     * @return CompletableFuture<DeleteBlockchainResponse>
     */
    public CompletableFuture<DeleteBlockchainResponse> deleteBlockchainAsync(DeleteBlockchainRequest request) {
        return hcClient.asyncInvokeHttp(request, BcsMeta.deleteBlockchain);
    }

    /**
     * 删除服务实例
     *
     * 删除bcs实例。包周期实例不支持
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteBlockchainRequest 请求对象
     * @return AsyncInvoker<DeleteBlockchainRequest, DeleteBlockchainResponse>
     */
    public AsyncInvoker<DeleteBlockchainRequest, DeleteBlockchainResponse> deleteBlockchainAsyncInvoker(
        DeleteBlockchainRequest request) {
        return new AsyncInvoker<DeleteBlockchainRequest, DeleteBlockchainResponse>(request, BcsMeta.deleteBlockchain,
            hcClient);
    }

    /**
     * BCS删除某个通道
     *
     * 该接口用于BCS删除某个通道。仅支持删除空通道
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteChannelRequest 请求对象
     * @return CompletableFuture<DeleteChannelResponse>
     */
    public CompletableFuture<DeleteChannelResponse> deleteChannelAsync(DeleteChannelRequest request) {
        return hcClient.asyncInvokeHttp(request, BcsMeta.deleteChannel);
    }

    /**
     * BCS删除某个通道
     *
     * 该接口用于BCS删除某个通道。仅支持删除空通道
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteChannelRequest 请求对象
     * @return AsyncInvoker<DeleteChannelRequest, DeleteChannelResponse>
     */
    public AsyncInvoker<DeleteChannelRequest, DeleteChannelResponse> deleteChannelAsyncInvoker(
        DeleteChannelRequest request) {
        return new AsyncInvoker<DeleteChannelRequest, DeleteChannelResponse>(request, BcsMeta.deleteChannel, hcClient);
    }

    /**
     * 删除邀请成员信息
     *
     * 可通过此接口批量取消邀请或删除对已退出或拒绝加入或解散的成员邀请信息
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteMemberInviteRequest 请求对象
     * @return CompletableFuture<DeleteMemberInviteResponse>
     */
    public CompletableFuture<DeleteMemberInviteResponse> deleteMemberInviteAsync(DeleteMemberInviteRequest request) {
        return hcClient.asyncInvokeHttp(request, BcsMeta.deleteMemberInvite);
    }

    /**
     * 删除邀请成员信息
     *
     * 可通过此接口批量取消邀请或删除对已退出或拒绝加入或解散的成员邀请信息
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteMemberInviteRequest 请求对象
     * @return AsyncInvoker<DeleteMemberInviteRequest, DeleteMemberInviteResponse>
     */
    public AsyncInvoker<DeleteMemberInviteRequest, DeleteMemberInviteResponse> deleteMemberInviteAsyncInvoker(
        DeleteMemberInviteRequest request) {
        return new AsyncInvoker<DeleteMemberInviteRequest, DeleteMemberInviteResponse>(request,
            BcsMeta.deleteMemberInvite, hcClient);
    }

    /**
     * 下载证书
     *
     * 下载指定服务实例相关证书
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DownloadBlockchainCertRequest 请求对象
     * @return CompletableFuture<DownloadBlockchainCertResponse>
     */
    public CompletableFuture<DownloadBlockchainCertResponse> downloadBlockchainCertAsync(
        DownloadBlockchainCertRequest request) {
        return hcClient.asyncInvokeHttp(request, BcsMeta.downloadBlockchainCert);
    }

    /**
     * 下载证书
     *
     * 下载指定服务实例相关证书
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DownloadBlockchainCertRequest 请求对象
     * @return AsyncInvoker<DownloadBlockchainCertRequest, DownloadBlockchainCertResponse>
     */
    public AsyncInvoker<DownloadBlockchainCertRequest, DownloadBlockchainCertResponse> downloadBlockchainCertAsyncInvoker(
        DownloadBlockchainCertRequest request) {
        return new AsyncInvoker<DownloadBlockchainCertRequest, DownloadBlockchainCertResponse>(request,
            BcsMeta.downloadBlockchainCert, hcClient);
    }

    /**
     * 下载SDK配置
     *
     * 下载指定服务实例SDK配置文件
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DownloadBlockchainSdkConfigRequest 请求对象
     * @return CompletableFuture<DownloadBlockchainSdkConfigResponse>
     */
    public CompletableFuture<DownloadBlockchainSdkConfigResponse> downloadBlockchainSdkConfigAsync(
        DownloadBlockchainSdkConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, BcsMeta.downloadBlockchainSdkConfig);
    }

    /**
     * 下载SDK配置
     *
     * 下载指定服务实例SDK配置文件
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DownloadBlockchainSdkConfigRequest 请求对象
     * @return AsyncInvoker<DownloadBlockchainSdkConfigRequest, DownloadBlockchainSdkConfigResponse>
     */
    public AsyncInvoker<DownloadBlockchainSdkConfigRequest, DownloadBlockchainSdkConfigResponse> downloadBlockchainSdkConfigAsyncInvoker(
        DownloadBlockchainSdkConfigRequest request) {
        return new AsyncInvoker<DownloadBlockchainSdkConfigRequest, DownloadBlockchainSdkConfigResponse>(request,
            BcsMeta.downloadBlockchainSdkConfig, hcClient);
    }

    /**
     * 冻结用户证书
     *
     * 冻结指定服务实例组织用户证书，冻结后需等待半分钟到一分钟左右生效
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param FreezeCertRequest 请求对象
     * @return CompletableFuture<FreezeCertResponse>
     */
    public CompletableFuture<FreezeCertResponse> freezeCertAsync(FreezeCertRequest request) {
        return hcClient.asyncInvokeHttp(request, BcsMeta.freezeCert);
    }

    /**
     * 冻结用户证书
     *
     * 冻结指定服务实例组织用户证书，冻结后需等待半分钟到一分钟左右生效
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param FreezeCertRequest 请求对象
     * @return AsyncInvoker<FreezeCertRequest, FreezeCertResponse>
     */
    public AsyncInvoker<FreezeCertRequest, FreezeCertResponse> freezeCertAsyncInvoker(FreezeCertRequest request) {
        return new AsyncInvoker<FreezeCertRequest, FreezeCertResponse>(request, BcsMeta.freezeCert, hcClient);
    }

    /**
     * 处理联盟邀请
     *
     * 处理联盟邀请
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param HandleNotificationRequest 请求对象
     * @return CompletableFuture<HandleNotificationResponse>
     */
    public CompletableFuture<HandleNotificationResponse> handleNotificationAsync(HandleNotificationRequest request) {
        return hcClient.asyncInvokeHttp(request, BcsMeta.handleNotification);
    }

    /**
     * 处理联盟邀请
     *
     * 处理联盟邀请
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param HandleNotificationRequest 请求对象
     * @return AsyncInvoker<HandleNotificationRequest, HandleNotificationResponse>
     */
    public AsyncInvoker<HandleNotificationRequest, HandleNotificationResponse> handleNotificationAsyncInvoker(
        HandleNotificationRequest request) {
        return new AsyncInvoker<HandleNotificationRequest, HandleNotificationResponse>(request,
            BcsMeta.handleNotification, hcClient);
    }

    /**
     * 被邀请方退出指定联盟
     *
     * 被邀请方退出联盟
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param HandleUnionMemberQuitListRequest 请求对象
     * @return CompletableFuture<HandleUnionMemberQuitListResponse>
     */
    public CompletableFuture<HandleUnionMemberQuitListResponse> handleUnionMemberQuitListAsync(
        HandleUnionMemberQuitListRequest request) {
        return hcClient.asyncInvokeHttp(request, BcsMeta.handleUnionMemberQuitList);
    }

    /**
     * 被邀请方退出指定联盟
     *
     * 被邀请方退出联盟
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param HandleUnionMemberQuitListRequest 请求对象
     * @return AsyncInvoker<HandleUnionMemberQuitListRequest, HandleUnionMemberQuitListResponse>
     */
    public AsyncInvoker<HandleUnionMemberQuitListRequest, HandleUnionMemberQuitListResponse> handleUnionMemberQuitListAsyncInvoker(
        HandleUnionMemberQuitListRequest request) {
        return new AsyncInvoker<HandleUnionMemberQuitListRequest, HandleUnionMemberQuitListResponse>(request,
            BcsMeta.handleUnionMemberQuitList, hcClient);
    }

    /**
     * 查询BCS服务实例监控数据
     *
     * 该接口用于查询BCS服务的监控数据，可以指定相应的指标名称。[目前不支持IEF节点](tag:hasief)
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListBcsMetricRequest 请求对象
     * @return CompletableFuture<ListBcsMetricResponse>
     */
    public CompletableFuture<ListBcsMetricResponse> listBcsMetricAsync(ListBcsMetricRequest request) {
        return hcClient.asyncInvokeHttp(request, BcsMeta.listBcsMetric);
    }

    /**
     * 查询BCS服务实例监控数据
     *
     * 该接口用于查询BCS服务的监控数据，可以指定相应的指标名称。[目前不支持IEF节点](tag:hasief)
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListBcsMetricRequest 请求对象
     * @return AsyncInvoker<ListBcsMetricRequest, ListBcsMetricResponse>
     */
    public AsyncInvoker<ListBcsMetricRequest, ListBcsMetricResponse> listBcsMetricAsyncInvoker(
        ListBcsMetricRequest request) {
        return new AsyncInvoker<ListBcsMetricRequest, ListBcsMetricResponse>(request, BcsMeta.listBcsMetric, hcClient);
    }

    /**
     * 查询通道信息
     *
     * 查询指定服务实例通道信息
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListBlockchainChannelsRequest 请求对象
     * @return CompletableFuture<ListBlockchainChannelsResponse>
     */
    public CompletableFuture<ListBlockchainChannelsResponse> listBlockchainChannelsAsync(
        ListBlockchainChannelsRequest request) {
        return hcClient.asyncInvokeHttp(request, BcsMeta.listBlockchainChannels);
    }

    /**
     * 查询通道信息
     *
     * 查询指定服务实例通道信息
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListBlockchainChannelsRequest 请求对象
     * @return AsyncInvoker<ListBlockchainChannelsRequest, ListBlockchainChannelsResponse>
     */
    public AsyncInvoker<ListBlockchainChannelsRequest, ListBlockchainChannelsResponse> listBlockchainChannelsAsyncInvoker(
        ListBlockchainChannelsRequest request) {
        return new AsyncInvoker<ListBlockchainChannelsRequest, ListBlockchainChannelsResponse>(request,
            BcsMeta.listBlockchainChannels, hcClient);
    }

    /**
     * 查询服务实例列表
     *
     * 查询当前项目下所有服务实例的简要信息
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListBlockchainsRequest 请求对象
     * @return CompletableFuture<ListBlockchainsResponse>
     */
    public CompletableFuture<ListBlockchainsResponse> listBlockchainsAsync(ListBlockchainsRequest request) {
        return hcClient.asyncInvokeHttp(request, BcsMeta.listBlockchains);
    }

    /**
     * 查询服务实例列表
     *
     * 查询当前项目下所有服务实例的简要信息
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListBlockchainsRequest 请求对象
     * @return AsyncInvoker<ListBlockchainsRequest, ListBlockchainsResponse>
     */
    public AsyncInvoker<ListBlockchainsRequest, ListBlockchainsResponse> listBlockchainsAsyncInvoker(
        ListBlockchainsRequest request) {
        return new AsyncInvoker<ListBlockchainsRequest, ListBlockchainsResponse>(request, BcsMeta.listBlockchains,
            hcClient);
    }

    /**
     * 查询BCS组织监控数据列表
     *
     * 该接口用于查询BCS组织的监控数据列表。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListEntityMetricRequest 请求对象
     * @return CompletableFuture<ListEntityMetricResponse>
     */
    public CompletableFuture<ListEntityMetricResponse> listEntityMetricAsync(ListEntityMetricRequest request) {
        return hcClient.asyncInvokeHttp(request, BcsMeta.listEntityMetric);
    }

    /**
     * 查询BCS组织监控数据列表
     *
     * 该接口用于查询BCS组织的监控数据列表。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListEntityMetricRequest 请求对象
     * @return AsyncInvoker<ListEntityMetricRequest, ListEntityMetricResponse>
     */
    public AsyncInvoker<ListEntityMetricRequest, ListEntityMetricResponse> listEntityMetricAsyncInvoker(
        ListEntityMetricRequest request) {
        return new AsyncInvoker<ListEntityMetricRequest, ListEntityMetricResponse>(request, BcsMeta.listEntityMetric,
            hcClient);
    }

    /**
     * 查询BCS组织实例监控数据详情
     *
     * 该接口用于BCS组织实例监控数据详情。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListInstanceMetricRequest 请求对象
     * @return CompletableFuture<ListInstanceMetricResponse>
     */
    public CompletableFuture<ListInstanceMetricResponse> listInstanceMetricAsync(ListInstanceMetricRequest request) {
        return hcClient.asyncInvokeHttp(request, BcsMeta.listInstanceMetric);
    }

    /**
     * 查询BCS组织实例监控数据详情
     *
     * 该接口用于BCS组织实例监控数据详情。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListInstanceMetricRequest 请求对象
     * @return AsyncInvoker<ListInstanceMetricRequest, ListInstanceMetricResponse>
     */
    public AsyncInvoker<ListInstanceMetricRequest, ListInstanceMetricResponse> listInstanceMetricAsyncInvoker(
        ListInstanceMetricRequest request) {
        return new AsyncInvoker<ListInstanceMetricRequest, ListInstanceMetricResponse>(request,
            BcsMeta.listInstanceMetric, hcClient);
    }

    /**
     * 获取联盟成员列表
     *
     * 获取联盟成员列表
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListMembersRequest 请求对象
     * @return CompletableFuture<ListMembersResponse>
     */
    public CompletableFuture<ListMembersResponse> listMembersAsync(ListMembersRequest request) {
        return hcClient.asyncInvokeHttp(request, BcsMeta.listMembers);
    }

    /**
     * 获取联盟成员列表
     *
     * 获取联盟成员列表
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListMembersRequest 请求对象
     * @return AsyncInvoker<ListMembersRequest, ListMembersResponse>
     */
    public AsyncInvoker<ListMembersRequest, ListMembersResponse> listMembersAsyncInvoker(ListMembersRequest request) {
        return new AsyncInvoker<ListMembersRequest, ListMembersResponse>(request, BcsMeta.listMembers, hcClient);
    }

    /**
     * 获取全部通知
     *
     * 获取全部通知
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListNotificationsRequest 请求对象
     * @return CompletableFuture<ListNotificationsResponse>
     */
    public CompletableFuture<ListNotificationsResponse> listNotificationsAsync(ListNotificationsRequest request) {
        return hcClient.asyncInvokeHttp(request, BcsMeta.listNotifications);
    }

    /**
     * 获取全部通知
     *
     * 获取全部通知
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListNotificationsRequest 请求对象
     * @return AsyncInvoker<ListNotificationsRequest, ListNotificationsResponse>
     */
    public AsyncInvoker<ListNotificationsRequest, ListNotificationsResponse> listNotificationsAsyncInvoker(
        ListNotificationsRequest request) {
        return new AsyncInvoker<ListNotificationsRequest, ListNotificationsResponse>(request, BcsMeta.listNotifications,
            hcClient);
    }

    /**
     * 查询异步操作结果
     *
     * 查询异步操作结果
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListOpRecordRequest 请求对象
     * @return CompletableFuture<ListOpRecordResponse>
     */
    public CompletableFuture<ListOpRecordResponse> listOpRecordAsync(ListOpRecordRequest request) {
        return hcClient.asyncInvokeHttp(request, BcsMeta.listOpRecord);
    }

    /**
     * 查询异步操作结果
     *
     * 查询异步操作结果
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListOpRecordRequest 请求对象
     * @return AsyncInvoker<ListOpRecordRequest, ListOpRecordResponse>
     */
    public AsyncInvoker<ListOpRecordRequest, ListOpRecordResponse> listOpRecordAsyncInvoker(
        ListOpRecordRequest request) {
        return new AsyncInvoker<ListOpRecordRequest, ListOpRecordResponse>(request, BcsMeta.listOpRecord, hcClient);
    }

    /**
     * 查询配额
     *
     * 查询当前项目下BCS服务所有资源的配额信息
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListQuotasRequest 请求对象
     * @return CompletableFuture<ListQuotasResponse>
     */
    public CompletableFuture<ListQuotasResponse> listQuotasAsync(ListQuotasRequest request) {
        return hcClient.asyncInvokeHttp(request, BcsMeta.listQuotas);
    }

    /**
     * 查询配额
     *
     * 查询当前项目下BCS服务所有资源的配额信息
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListQuotasRequest 请求对象
     * @return AsyncInvoker<ListQuotasRequest, ListQuotasResponse>
     */
    public AsyncInvoker<ListQuotasRequest, ListQuotasResponse> listQuotasAsyncInvoker(ListQuotasRequest request) {
        return new AsyncInvoker<ListQuotasRequest, ListQuotasResponse>(request, BcsMeta.listQuotas, hcClient);
    }

    /**
     * 查询实例信息
     *
     * 查询指定服务实例详细信息
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowBlockchainDetailRequest 请求对象
     * @return CompletableFuture<ShowBlockchainDetailResponse>
     */
    public CompletableFuture<ShowBlockchainDetailResponse> showBlockchainDetailAsync(
        ShowBlockchainDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, BcsMeta.showBlockchainDetail);
    }

    /**
     * 查询实例信息
     *
     * 查询指定服务实例详细信息
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowBlockchainDetailRequest 请求对象
     * @return AsyncInvoker<ShowBlockchainDetailRequest, ShowBlockchainDetailResponse>
     */
    public AsyncInvoker<ShowBlockchainDetailRequest, ShowBlockchainDetailResponse> showBlockchainDetailAsyncInvoker(
        ShowBlockchainDetailRequest request) {
        return new AsyncInvoker<ShowBlockchainDetailRequest, ShowBlockchainDetailResponse>(request,
            BcsMeta.showBlockchainDetail, hcClient);
    }

    /**
     * 查询规格
     *
     * 查询服务联盟链规格信息
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowBlockchainFlavorsRequest 请求对象
     * @return CompletableFuture<ShowBlockchainFlavorsResponse>
     */
    public CompletableFuture<ShowBlockchainFlavorsResponse> showBlockchainFlavorsAsync(
        ShowBlockchainFlavorsRequest request) {
        return hcClient.asyncInvokeHttp(request, BcsMeta.showBlockchainFlavors);
    }

    /**
     * 查询规格
     *
     * 查询服务联盟链规格信息
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowBlockchainFlavorsRequest 请求对象
     * @return AsyncInvoker<ShowBlockchainFlavorsRequest, ShowBlockchainFlavorsResponse>
     */
    public AsyncInvoker<ShowBlockchainFlavorsRequest, ShowBlockchainFlavorsResponse> showBlockchainFlavorsAsyncInvoker(
        ShowBlockchainFlavorsRequest request) {
        return new AsyncInvoker<ShowBlockchainFlavorsRequest, ShowBlockchainFlavorsResponse>(request,
            BcsMeta.showBlockchainFlavors, hcClient);
    }

    /**
     * 查询节点信息
     *
     * 查询指定服务实例节点信息
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowBlockchainNodesRequest 请求对象
     * @return CompletableFuture<ShowBlockchainNodesResponse>
     */
    public CompletableFuture<ShowBlockchainNodesResponse> showBlockchainNodesAsync(ShowBlockchainNodesRequest request) {
        return hcClient.asyncInvokeHttp(request, BcsMeta.showBlockchainNodes);
    }

    /**
     * 查询节点信息
     *
     * 查询指定服务实例节点信息
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowBlockchainNodesRequest 请求对象
     * @return AsyncInvoker<ShowBlockchainNodesRequest, ShowBlockchainNodesResponse>
     */
    public AsyncInvoker<ShowBlockchainNodesRequest, ShowBlockchainNodesResponse> showBlockchainNodesAsyncInvoker(
        ShowBlockchainNodesRequest request) {
        return new AsyncInvoker<ShowBlockchainNodesRequest, ShowBlockchainNodesResponse>(request,
            BcsMeta.showBlockchainNodes, hcClient);
    }

    /**
     * 查询创建状态
     *
     * 查询指定服务实例创建状态
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowBlockchainStatusRequest 请求对象
     * @return CompletableFuture<ShowBlockchainStatusResponse>
     */
    public CompletableFuture<ShowBlockchainStatusResponse> showBlockchainStatusAsync(
        ShowBlockchainStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, BcsMeta.showBlockchainStatus);
    }

    /**
     * 查询创建状态
     *
     * 查询指定服务实例创建状态
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowBlockchainStatusRequest 请求对象
     * @return AsyncInvoker<ShowBlockchainStatusRequest, ShowBlockchainStatusResponse>
     */
    public AsyncInvoker<ShowBlockchainStatusRequest, ShowBlockchainStatusResponse> showBlockchainStatusAsyncInvoker(
        ShowBlockchainStatusRequest request) {
        return new AsyncInvoker<ShowBlockchainStatusRequest, ShowBlockchainStatusResponse>(request,
            BcsMeta.showBlockchainStatus, hcClient);
    }

    /**
     * 解冻用户证书
     *
     * 解冻指定服务实例组织用户证书，解冻后需等待半分钟到一分钟左右生效
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UnfreezeCertRequest 请求对象
     * @return CompletableFuture<UnfreezeCertResponse>
     */
    public CompletableFuture<UnfreezeCertResponse> unfreezeCertAsync(UnfreezeCertRequest request) {
        return hcClient.asyncInvokeHttp(request, BcsMeta.unfreezeCert);
    }

    /**
     * 解冻用户证书
     *
     * 解冻指定服务实例组织用户证书，解冻后需等待半分钟到一分钟左右生效
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UnfreezeCertRequest 请求对象
     * @return AsyncInvoker<UnfreezeCertRequest, UnfreezeCertResponse>
     */
    public AsyncInvoker<UnfreezeCertRequest, UnfreezeCertResponse> unfreezeCertAsyncInvoker(
        UnfreezeCertRequest request) {
        return new AsyncInvoker<UnfreezeCertRequest, UnfreezeCertResponse>(request, BcsMeta.unfreezeCert, hcClient);
    }

    /**
     * 修改服务实例
     *
     * 修改实例的节点、组织，目前仅支持添加、删除节点（IEF模式不支持添加、删除节点），添加、删除组织，共4种类型，每次操作只可以操作一种类型。此接口不支持包周期模式; 注意注册IEF节点时，IEF节点名称长度应该为4-24位的字符
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateInstanceRequest 请求对象
     * @return CompletableFuture<UpdateInstanceResponse>
     */
    public CompletableFuture<UpdateInstanceResponse> updateInstanceAsync(UpdateInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, BcsMeta.updateInstance);
    }

    /**
     * 修改服务实例
     *
     * 修改实例的节点、组织，目前仅支持添加、删除节点（IEF模式不支持添加、删除节点），添加、删除组织，共4种类型，每次操作只可以操作一种类型。此接口不支持包周期模式; 注意注册IEF节点时，IEF节点名称长度应该为4-24位的字符
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateInstanceRequest 请求对象
     * @return AsyncInvoker<UpdateInstanceRequest, UpdateInstanceResponse>
     */
    public AsyncInvoker<UpdateInstanceRequest, UpdateInstanceResponse> updateInstanceAsyncInvoker(
        UpdateInstanceRequest request) {
        return new AsyncInvoker<UpdateInstanceRequest, UpdateInstanceResponse>(request, BcsMeta.updateInstance,
            hcClient);
    }

}
