package com.huaweicloud.sdk.evs.v2;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.evs.v2.model.AssociateAutoSnapshotPolicyRequest;
import com.huaweicloud.sdk.evs.v2.model.AssociateAutoSnapshotPolicyResponse;
import com.huaweicloud.sdk.evs.v2.model.BatchCreateSnapshotGroupTagRequest;
import com.huaweicloud.sdk.evs.v2.model.BatchCreateSnapshotGroupTagResponse;
import com.huaweicloud.sdk.evs.v2.model.BatchCreateSnapshotTagsRequest;
import com.huaweicloud.sdk.evs.v2.model.BatchCreateSnapshotTagsResponse;
import com.huaweicloud.sdk.evs.v2.model.BatchCreateVolumeTagsRequest;
import com.huaweicloud.sdk.evs.v2.model.BatchCreateVolumeTagsResponse;
import com.huaweicloud.sdk.evs.v2.model.BatchDeleteSnapshotGroupTagRequest;
import com.huaweicloud.sdk.evs.v2.model.BatchDeleteSnapshotGroupTagResponse;
import com.huaweicloud.sdk.evs.v2.model.BatchDeleteSnapshotTagsRequest;
import com.huaweicloud.sdk.evs.v2.model.BatchDeleteSnapshotTagsResponse;
import com.huaweicloud.sdk.evs.v2.model.BatchDeleteVolumeTagsRequest;
import com.huaweicloud.sdk.evs.v2.model.BatchDeleteVolumeTagsResponse;
import com.huaweicloud.sdk.evs.v2.model.BatchResizeVolumesRequest;
import com.huaweicloud.sdk.evs.v2.model.BatchResizeVolumesResponse;
import com.huaweicloud.sdk.evs.v2.model.ChangeVolumeChargeModeRequest;
import com.huaweicloud.sdk.evs.v2.model.ChangeVolumeChargeModeResponse;
import com.huaweicloud.sdk.evs.v2.model.CinderAcceptVolumeTransferRequest;
import com.huaweicloud.sdk.evs.v2.model.CinderAcceptVolumeTransferResponse;
import com.huaweicloud.sdk.evs.v2.model.CinderCreateVolumeTransferRequest;
import com.huaweicloud.sdk.evs.v2.model.CinderCreateVolumeTransferResponse;
import com.huaweicloud.sdk.evs.v2.model.CinderDeleteVolumeTransferRequest;
import com.huaweicloud.sdk.evs.v2.model.CinderDeleteVolumeTransferResponse;
import com.huaweicloud.sdk.evs.v2.model.CinderListAvailabilityZonesRequest;
import com.huaweicloud.sdk.evs.v2.model.CinderListAvailabilityZonesResponse;
import com.huaweicloud.sdk.evs.v2.model.CinderListQuotasRequest;
import com.huaweicloud.sdk.evs.v2.model.CinderListQuotasResponse;
import com.huaweicloud.sdk.evs.v2.model.CinderListVolumeTransfersRequest;
import com.huaweicloud.sdk.evs.v2.model.CinderListVolumeTransfersResponse;
import com.huaweicloud.sdk.evs.v2.model.CinderListVolumeTypesRequest;
import com.huaweicloud.sdk.evs.v2.model.CinderListVolumeTypesResponse;
import com.huaweicloud.sdk.evs.v2.model.CinderShowVolumeTransferRequest;
import com.huaweicloud.sdk.evs.v2.model.CinderShowVolumeTransferResponse;
import com.huaweicloud.sdk.evs.v2.model.CountAutoSnapshotPoliciesRequest;
import com.huaweicloud.sdk.evs.v2.model.CountAutoSnapshotPoliciesResponse;
import com.huaweicloud.sdk.evs.v2.model.CountSnapshotChainsRequest;
import com.huaweicloud.sdk.evs.v2.model.CountSnapshotChainsResponse;
import com.huaweicloud.sdk.evs.v2.model.CountSnapshotsGroupRequest;
import com.huaweicloud.sdk.evs.v2.model.CountSnapshotsGroupResponse;
import com.huaweicloud.sdk.evs.v2.model.CountSnapshotsRequest;
import com.huaweicloud.sdk.evs.v2.model.CountSnapshotsResponse;
import com.huaweicloud.sdk.evs.v2.model.CreateAutoSnapshotPolicyRequest;
import com.huaweicloud.sdk.evs.v2.model.CreateAutoSnapshotPolicyResponse;
import com.huaweicloud.sdk.evs.v2.model.CreateSnapshotGroupRequest;
import com.huaweicloud.sdk.evs.v2.model.CreateSnapshotGroupResponse;
import com.huaweicloud.sdk.evs.v2.model.CreateSnapshotRequest;
import com.huaweicloud.sdk.evs.v2.model.CreateSnapshotResponse;
import com.huaweicloud.sdk.evs.v2.model.CreateStandardSnapshotRequest;
import com.huaweicloud.sdk.evs.v2.model.CreateStandardSnapshotResponse;
import com.huaweicloud.sdk.evs.v2.model.CreateVolumeRequest;
import com.huaweicloud.sdk.evs.v2.model.CreateVolumeResponse;
import com.huaweicloud.sdk.evs.v2.model.DeleteAutoSnapshotPolicyRequest;
import com.huaweicloud.sdk.evs.v2.model.DeleteAutoSnapshotPolicyResponse;
import com.huaweicloud.sdk.evs.v2.model.DeleteSnapshotGroupRequest;
import com.huaweicloud.sdk.evs.v2.model.DeleteSnapshotGroupResponse;
import com.huaweicloud.sdk.evs.v2.model.DeleteSnapshotRequest;
import com.huaweicloud.sdk.evs.v2.model.DeleteSnapshotResponse;
import com.huaweicloud.sdk.evs.v2.model.DeleteStandardSnapshotRequest;
import com.huaweicloud.sdk.evs.v2.model.DeleteStandardSnapshotResponse;
import com.huaweicloud.sdk.evs.v2.model.DeleteVolumeInRecycleRequest;
import com.huaweicloud.sdk.evs.v2.model.DeleteVolumeInRecycleResponse;
import com.huaweicloud.sdk.evs.v2.model.DeleteVolumeRequest;
import com.huaweicloud.sdk.evs.v2.model.DeleteVolumeResponse;
import com.huaweicloud.sdk.evs.v2.model.DisassociateAutoSnapshotPolicyRequest;
import com.huaweicloud.sdk.evs.v2.model.DisassociateAutoSnapshotPolicyResponse;
import com.huaweicloud.sdk.evs.v2.model.ListAutoSnapshotPolicyRequest;
import com.huaweicloud.sdk.evs.v2.model.ListAutoSnapshotPolicyResponse;
import com.huaweicloud.sdk.evs.v2.model.ListSnapshotChainsRequest;
import com.huaweicloud.sdk.evs.v2.model.ListSnapshotChainsResponse;
import com.huaweicloud.sdk.evs.v2.model.ListSnapshotGroupRequest;
import com.huaweicloud.sdk.evs.v2.model.ListSnapshotGroupResponse;
import com.huaweicloud.sdk.evs.v2.model.ListSnapshotGroupTagsRequest;
import com.huaweicloud.sdk.evs.v2.model.ListSnapshotGroupTagsResponse;
import com.huaweicloud.sdk.evs.v2.model.ListSnapshotTagsRequest;
import com.huaweicloud.sdk.evs.v2.model.ListSnapshotTagsResponse;
import com.huaweicloud.sdk.evs.v2.model.ListSnapshotsDetailsRequest;
import com.huaweicloud.sdk.evs.v2.model.ListSnapshotsDetailsResponse;
import com.huaweicloud.sdk.evs.v2.model.ListSnapshotsRequest;
import com.huaweicloud.sdk.evs.v2.model.ListSnapshotsResponse;
import com.huaweicloud.sdk.evs.v2.model.ListVersionsRequest;
import com.huaweicloud.sdk.evs.v2.model.ListVersionsResponse;
import com.huaweicloud.sdk.evs.v2.model.ListVolumeTagsRequest;
import com.huaweicloud.sdk.evs.v2.model.ListVolumeTagsResponse;
import com.huaweicloud.sdk.evs.v2.model.ListVolumesByTagsRequest;
import com.huaweicloud.sdk.evs.v2.model.ListVolumesByTagsResponse;
import com.huaweicloud.sdk.evs.v2.model.ListVolumesInRecycleRequest;
import com.huaweicloud.sdk.evs.v2.model.ListVolumesInRecycleResponse;
import com.huaweicloud.sdk.evs.v2.model.ListVolumesRequest;
import com.huaweicloud.sdk.evs.v2.model.ListVolumesResponse;
import com.huaweicloud.sdk.evs.v2.model.ModifyVolumeQoSRequest;
import com.huaweicloud.sdk.evs.v2.model.ModifyVolumeQoSResponse;
import com.huaweicloud.sdk.evs.v2.model.ResizeVolumeRequest;
import com.huaweicloud.sdk.evs.v2.model.ResizeVolumeResponse;
import com.huaweicloud.sdk.evs.v2.model.RetypeVolumeRequest;
import com.huaweicloud.sdk.evs.v2.model.RetypeVolumeResponse;
import com.huaweicloud.sdk.evs.v2.model.RevertVolumeInRecycleRequest;
import com.huaweicloud.sdk.evs.v2.model.RevertVolumeInRecycleResponse;
import com.huaweicloud.sdk.evs.v2.model.RollbackSnapshotRequest;
import com.huaweicloud.sdk.evs.v2.model.RollbackSnapshotResponse;
import com.huaweicloud.sdk.evs.v2.model.RollbackStandardSnapshotRequest;
import com.huaweicloud.sdk.evs.v2.model.RollbackStandardSnapshotResponse;
import com.huaweicloud.sdk.evs.v2.model.ShowAutoSnapshotPolicyRequest;
import com.huaweicloud.sdk.evs.v2.model.ShowAutoSnapshotPolicyResponse;
import com.huaweicloud.sdk.evs.v2.model.ShowJobRequest;
import com.huaweicloud.sdk.evs.v2.model.ShowJobResponse;
import com.huaweicloud.sdk.evs.v2.model.ShowRecyclePolicyRequest;
import com.huaweicloud.sdk.evs.v2.model.ShowRecyclePolicyResponse;
import com.huaweicloud.sdk.evs.v2.model.ShowSnapshotGroupRequest;
import com.huaweicloud.sdk.evs.v2.model.ShowSnapshotGroupResponse;
import com.huaweicloud.sdk.evs.v2.model.ShowSnapshotRequest;
import com.huaweicloud.sdk.evs.v2.model.ShowSnapshotResponse;
import com.huaweicloud.sdk.evs.v2.model.ShowStandardSnapshotRequest;
import com.huaweicloud.sdk.evs.v2.model.ShowStandardSnapshotResponse;
import com.huaweicloud.sdk.evs.v2.model.ShowVersionRequest;
import com.huaweicloud.sdk.evs.v2.model.ShowVersionResponse;
import com.huaweicloud.sdk.evs.v2.model.ShowVolumeInRecycleRequest;
import com.huaweicloud.sdk.evs.v2.model.ShowVolumeInRecycleResponse;
import com.huaweicloud.sdk.evs.v2.model.ShowVolumeRequest;
import com.huaweicloud.sdk.evs.v2.model.ShowVolumeResponse;
import com.huaweicloud.sdk.evs.v2.model.ShowVolumeTagsRequest;
import com.huaweicloud.sdk.evs.v2.model.ShowVolumeTagsResponse;
import com.huaweicloud.sdk.evs.v2.model.UnsubscribePostpaidVolumeRequest;
import com.huaweicloud.sdk.evs.v2.model.UnsubscribePostpaidVolumeResponse;
import com.huaweicloud.sdk.evs.v2.model.UpdateAutoSnapshotPolicyRequest;
import com.huaweicloud.sdk.evs.v2.model.UpdateAutoSnapshotPolicyResponse;
import com.huaweicloud.sdk.evs.v2.model.UpdateRecyclePolicyRequest;
import com.huaweicloud.sdk.evs.v2.model.UpdateRecyclePolicyResponse;
import com.huaweicloud.sdk.evs.v2.model.UpdateSnapshotGroupRequest;
import com.huaweicloud.sdk.evs.v2.model.UpdateSnapshotGroupResponse;
import com.huaweicloud.sdk.evs.v2.model.UpdateSnapshotRequest;
import com.huaweicloud.sdk.evs.v2.model.UpdateSnapshotResponse;
import com.huaweicloud.sdk.evs.v2.model.UpdateStandardSnapshotRequest;
import com.huaweicloud.sdk.evs.v2.model.UpdateStandardSnapshotResponse;
import com.huaweicloud.sdk.evs.v2.model.UpdateVolumeRequest;
import com.huaweicloud.sdk.evs.v2.model.UpdateVolumeResponse;

import java.util.concurrent.CompletableFuture;

public class EvsAsyncClient {

    protected HcClient hcClient;

    public EvsAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<EvsAsyncClient> newBuilder() {
        ClientBuilder<EvsAsyncClient> clientBuilder = new ClientBuilder<>(EvsAsyncClient::new);
        return clientBuilder;
    }

    /**
     * 绑定自动快照策略
     *
     * 绑定自动快照策略。标准快照当前只在部分区域支持，具体的区域列表请通过控制台查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AssociateAutoSnapshotPolicyRequest 请求对象
     * @return CompletableFuture<AssociateAutoSnapshotPolicyResponse>
     */
    public CompletableFuture<AssociateAutoSnapshotPolicyResponse> associateAutoSnapshotPolicyAsync(
        AssociateAutoSnapshotPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, EvsMeta.associateAutoSnapshotPolicy);
    }

    /**
     * 绑定自动快照策略
     *
     * 绑定自动快照策略。标准快照当前只在部分区域支持，具体的区域列表请通过控制台查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AssociateAutoSnapshotPolicyRequest 请求对象
     * @return AsyncInvoker<AssociateAutoSnapshotPolicyRequest, AssociateAutoSnapshotPolicyResponse>
     */
    public AsyncInvoker<AssociateAutoSnapshotPolicyRequest, AssociateAutoSnapshotPolicyResponse> associateAutoSnapshotPolicyAsyncInvoker(
        AssociateAutoSnapshotPolicyRequest request) {
        return new AsyncInvoker<>(request, EvsMeta.associateAutoSnapshotPolicy, hcClient);
    }

    /**
     * 为指定快照组添加标签
     *
     * 为指定快照组添加标签。标准快照当前只在部分区域支持，具体的区域列表请通过控制台查询详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateSnapshotGroupTagRequest 请求对象
     * @return CompletableFuture<BatchCreateSnapshotGroupTagResponse>
     */
    public CompletableFuture<BatchCreateSnapshotGroupTagResponse> batchCreateSnapshotGroupTagAsync(
        BatchCreateSnapshotGroupTagRequest request) {
        return hcClient.asyncInvokeHttp(request, EvsMeta.batchCreateSnapshotGroupTag);
    }

    /**
     * 为指定快照组添加标签
     *
     * 为指定快照组添加标签。标准快照当前只在部分区域支持，具体的区域列表请通过控制台查询详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateSnapshotGroupTagRequest 请求对象
     * @return AsyncInvoker<BatchCreateSnapshotGroupTagRequest, BatchCreateSnapshotGroupTagResponse>
     */
    public AsyncInvoker<BatchCreateSnapshotGroupTagRequest, BatchCreateSnapshotGroupTagResponse> batchCreateSnapshotGroupTagAsyncInvoker(
        BatchCreateSnapshotGroupTagRequest request) {
        return new AsyncInvoker<>(request, EvsMeta.batchCreateSnapshotGroupTag, hcClient);
    }

    /**
     * 为指定快照添加标签
     *
     * 为指定快照添加标签。标准快照当前只在部分区域支持，具体的区域列表请通过控制台查询详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateSnapshotTagsRequest 请求对象
     * @return CompletableFuture<BatchCreateSnapshotTagsResponse>
     */
    public CompletableFuture<BatchCreateSnapshotTagsResponse> batchCreateSnapshotTagsAsync(
        BatchCreateSnapshotTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, EvsMeta.batchCreateSnapshotTags);
    }

    /**
     * 为指定快照添加标签
     *
     * 为指定快照添加标签。标准快照当前只在部分区域支持，具体的区域列表请通过控制台查询详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateSnapshotTagsRequest 请求对象
     * @return AsyncInvoker<BatchCreateSnapshotTagsRequest, BatchCreateSnapshotTagsResponse>
     */
    public AsyncInvoker<BatchCreateSnapshotTagsRequest, BatchCreateSnapshotTagsResponse> batchCreateSnapshotTagsAsyncInvoker(
        BatchCreateSnapshotTagsRequest request) {
        return new AsyncInvoker<>(request, EvsMeta.batchCreateSnapshotTags, hcClient);
    }

    /**
     * 为指定云硬盘批量添加标签
     *
     * 为指定云硬盘批量添加标签。
     * 
     * 添加标签时，如果云硬盘的标签已存在相同key，则会覆盖已有标签。
     * 单个云硬盘最多支持创建10个标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateVolumeTagsRequest 请求对象
     * @return CompletableFuture<BatchCreateVolumeTagsResponse>
     */
    public CompletableFuture<BatchCreateVolumeTagsResponse> batchCreateVolumeTagsAsync(
        BatchCreateVolumeTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, EvsMeta.batchCreateVolumeTags);
    }

    /**
     * 为指定云硬盘批量添加标签
     *
     * 为指定云硬盘批量添加标签。
     * 
     * 添加标签时，如果云硬盘的标签已存在相同key，则会覆盖已有标签。
     * 单个云硬盘最多支持创建10个标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateVolumeTagsRequest 请求对象
     * @return AsyncInvoker<BatchCreateVolumeTagsRequest, BatchCreateVolumeTagsResponse>
     */
    public AsyncInvoker<BatchCreateVolumeTagsRequest, BatchCreateVolumeTagsResponse> batchCreateVolumeTagsAsyncInvoker(
        BatchCreateVolumeTagsRequest request) {
        return new AsyncInvoker<>(request, EvsMeta.batchCreateVolumeTags, hcClient);
    }

    /**
     * 为指定快照组删除标签
     *
     * 为指定快照组删除标签。标准快照当前只在部分区域支持，具体的区域列表请通过控制台查询详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteSnapshotGroupTagRequest 请求对象
     * @return CompletableFuture<BatchDeleteSnapshotGroupTagResponse>
     */
    public CompletableFuture<BatchDeleteSnapshotGroupTagResponse> batchDeleteSnapshotGroupTagAsync(
        BatchDeleteSnapshotGroupTagRequest request) {
        return hcClient.asyncInvokeHttp(request, EvsMeta.batchDeleteSnapshotGroupTag);
    }

    /**
     * 为指定快照组删除标签
     *
     * 为指定快照组删除标签。标准快照当前只在部分区域支持，具体的区域列表请通过控制台查询详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteSnapshotGroupTagRequest 请求对象
     * @return AsyncInvoker<BatchDeleteSnapshotGroupTagRequest, BatchDeleteSnapshotGroupTagResponse>
     */
    public AsyncInvoker<BatchDeleteSnapshotGroupTagRequest, BatchDeleteSnapshotGroupTagResponse> batchDeleteSnapshotGroupTagAsyncInvoker(
        BatchDeleteSnapshotGroupTagRequest request) {
        return new AsyncInvoker<>(request, EvsMeta.batchDeleteSnapshotGroupTag, hcClient);
    }

    /**
     * 为指定快照删除标签
     *
     * 为指定快照删除标签。标准快照当前只在部分区域支持，具体的区域列表请通过控制台查询详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteSnapshotTagsRequest 请求对象
     * @return CompletableFuture<BatchDeleteSnapshotTagsResponse>
     */
    public CompletableFuture<BatchDeleteSnapshotTagsResponse> batchDeleteSnapshotTagsAsync(
        BatchDeleteSnapshotTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, EvsMeta.batchDeleteSnapshotTags);
    }

    /**
     * 为指定快照删除标签
     *
     * 为指定快照删除标签。标准快照当前只在部分区域支持，具体的区域列表请通过控制台查询详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteSnapshotTagsRequest 请求对象
     * @return AsyncInvoker<BatchDeleteSnapshotTagsRequest, BatchDeleteSnapshotTagsResponse>
     */
    public AsyncInvoker<BatchDeleteSnapshotTagsRequest, BatchDeleteSnapshotTagsResponse> batchDeleteSnapshotTagsAsyncInvoker(
        BatchDeleteSnapshotTagsRequest request) {
        return new AsyncInvoker<>(request, EvsMeta.batchDeleteSnapshotTags, hcClient);
    }

    /**
     * 为指定云硬盘批量删除标签
     *
     * 为指定云硬盘批量删除标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteVolumeTagsRequest 请求对象
     * @return CompletableFuture<BatchDeleteVolumeTagsResponse>
     */
    public CompletableFuture<BatchDeleteVolumeTagsResponse> batchDeleteVolumeTagsAsync(
        BatchDeleteVolumeTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, EvsMeta.batchDeleteVolumeTags);
    }

    /**
     * 为指定云硬盘批量删除标签
     *
     * 为指定云硬盘批量删除标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteVolumeTagsRequest 请求对象
     * @return AsyncInvoker<BatchDeleteVolumeTagsRequest, BatchDeleteVolumeTagsResponse>
     */
    public AsyncInvoker<BatchDeleteVolumeTagsRequest, BatchDeleteVolumeTagsResponse> batchDeleteVolumeTagsAsyncInvoker(
        BatchDeleteVolumeTagsRequest request) {
        return new AsyncInvoker<>(request, EvsMeta.batchDeleteVolumeTags, hcClient);
    }

    /**
     * 批量扩容云硬盘
     *
     * 对按需或者包周期云硬盘进行批量扩容。
     * [在批量扩容存在包周期云硬盘的场景下：](tag:hws)
     * - [如果您需要查看订单可用的优惠券，请参考\&quot;[查询订单可用优惠券](https://support.huaweicloud.com/api-oce/zh-cn_topic_0092953630.html)\&quot;。](tag:hws)
     * - [如果您需要支付订单，请参考\&quot;[支付包周期产品订单](https://support.huaweicloud.com/api-oce/api_order_00030.html)\&quot;。](tag:hws)
     * - [如果您需要退订该包周期资源，请参考“[退订包周期资源](https://support.huaweicloud.com/api-oce/zh-cn_topic_0082522030.html)”。](tag:hws)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchResizeVolumesRequest 请求对象
     * @return CompletableFuture<BatchResizeVolumesResponse>
     */
    public CompletableFuture<BatchResizeVolumesResponse> batchResizeVolumesAsync(BatchResizeVolumesRequest request) {
        return hcClient.asyncInvokeHttp(request, EvsMeta.batchResizeVolumes);
    }

    /**
     * 批量扩容云硬盘
     *
     * 对按需或者包周期云硬盘进行批量扩容。
     * [在批量扩容存在包周期云硬盘的场景下：](tag:hws)
     * - [如果您需要查看订单可用的优惠券，请参考\&quot;[查询订单可用优惠券](https://support.huaweicloud.com/api-oce/zh-cn_topic_0092953630.html)\&quot;。](tag:hws)
     * - [如果您需要支付订单，请参考\&quot;[支付包周期产品订单](https://support.huaweicloud.com/api-oce/api_order_00030.html)\&quot;。](tag:hws)
     * - [如果您需要退订该包周期资源，请参考“[退订包周期资源](https://support.huaweicloud.com/api-oce/zh-cn_topic_0082522030.html)”。](tag:hws)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchResizeVolumesRequest 请求对象
     * @return AsyncInvoker<BatchResizeVolumesRequest, BatchResizeVolumesResponse>
     */
    public AsyncInvoker<BatchResizeVolumesRequest, BatchResizeVolumesResponse> batchResizeVolumesAsyncInvoker(
        BatchResizeVolumesRequest request) {
        return new AsyncInvoker<>(request, EvsMeta.batchResizeVolumes, hcClient);
    }

    /**
     * 修改云硬盘计费模式
     *
     * 将挂载状态下的云硬盘的计费模式有按需转成包周期，且到期时间和挂载的虚拟机保持一致。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeVolumeChargeModeRequest 请求对象
     * @return CompletableFuture<ChangeVolumeChargeModeResponse>
     */
    public CompletableFuture<ChangeVolumeChargeModeResponse> changeVolumeChargeModeAsync(
        ChangeVolumeChargeModeRequest request) {
        return hcClient.asyncInvokeHttp(request, EvsMeta.changeVolumeChargeMode);
    }

    /**
     * 修改云硬盘计费模式
     *
     * 将挂载状态下的云硬盘的计费模式有按需转成包周期，且到期时间和挂载的虚拟机保持一致。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeVolumeChargeModeRequest 请求对象
     * @return AsyncInvoker<ChangeVolumeChargeModeRequest, ChangeVolumeChargeModeResponse>
     */
    public AsyncInvoker<ChangeVolumeChargeModeRequest, ChangeVolumeChargeModeResponse> changeVolumeChargeModeAsyncInvoker(
        ChangeVolumeChargeModeRequest request) {
        return new AsyncInvoker<>(request, EvsMeta.changeVolumeChargeMode, hcClient);
    }

    /**
     * 接受云硬盘过户
     *
     * 通过云硬盘过户记录ID以及身份认证密钥来接受云硬盘过户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CinderAcceptVolumeTransferRequest 请求对象
     * @return CompletableFuture<CinderAcceptVolumeTransferResponse>
     */
    public CompletableFuture<CinderAcceptVolumeTransferResponse> cinderAcceptVolumeTransferAsync(
        CinderAcceptVolumeTransferRequest request) {
        return hcClient.asyncInvokeHttp(request, EvsMeta.cinderAcceptVolumeTransfer);
    }

    /**
     * 接受云硬盘过户
     *
     * 通过云硬盘过户记录ID以及身份认证密钥来接受云硬盘过户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CinderAcceptVolumeTransferRequest 请求对象
     * @return AsyncInvoker<CinderAcceptVolumeTransferRequest, CinderAcceptVolumeTransferResponse>
     */
    public AsyncInvoker<CinderAcceptVolumeTransferRequest, CinderAcceptVolumeTransferResponse> cinderAcceptVolumeTransferAsyncInvoker(
        CinderAcceptVolumeTransferRequest request) {
        return new AsyncInvoker<>(request, EvsMeta.cinderAcceptVolumeTransfer, hcClient);
    }

    /**
     * 创建云硬盘过户
     *
     * 指定云硬盘来创建云硬盘过户记录，创建成功后，会返回过户记录ID以及身份认证密钥。
     * 云硬盘在过户过程中的状态变化如下：创建云硬盘过户后，云硬盘状态由“available”变为“awaiting-transfer”。当云硬盘过户被接收后，云硬盘状态变为“available”。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CinderCreateVolumeTransferRequest 请求对象
     * @return CompletableFuture<CinderCreateVolumeTransferResponse>
     */
    public CompletableFuture<CinderCreateVolumeTransferResponse> cinderCreateVolumeTransferAsync(
        CinderCreateVolumeTransferRequest request) {
        return hcClient.asyncInvokeHttp(request, EvsMeta.cinderCreateVolumeTransfer);
    }

    /**
     * 创建云硬盘过户
     *
     * 指定云硬盘来创建云硬盘过户记录，创建成功后，会返回过户记录ID以及身份认证密钥。
     * 云硬盘在过户过程中的状态变化如下：创建云硬盘过户后，云硬盘状态由“available”变为“awaiting-transfer”。当云硬盘过户被接收后，云硬盘状态变为“available”。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CinderCreateVolumeTransferRequest 请求对象
     * @return AsyncInvoker<CinderCreateVolumeTransferRequest, CinderCreateVolumeTransferResponse>
     */
    public AsyncInvoker<CinderCreateVolumeTransferRequest, CinderCreateVolumeTransferResponse> cinderCreateVolumeTransferAsyncInvoker(
        CinderCreateVolumeTransferRequest request) {
        return new AsyncInvoker<>(request, EvsMeta.cinderCreateVolumeTransfer, hcClient);
    }

    /**
     * 删除云硬盘过户
     *
     * 当云硬盘过户未被接受时，您可以删除云硬盘过户记录，接受后则无法执行删除操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CinderDeleteVolumeTransferRequest 请求对象
     * @return CompletableFuture<CinderDeleteVolumeTransferResponse>
     */
    public CompletableFuture<CinderDeleteVolumeTransferResponse> cinderDeleteVolumeTransferAsync(
        CinderDeleteVolumeTransferRequest request) {
        return hcClient.asyncInvokeHttp(request, EvsMeta.cinderDeleteVolumeTransfer);
    }

    /**
     * 删除云硬盘过户
     *
     * 当云硬盘过户未被接受时，您可以删除云硬盘过户记录，接受后则无法执行删除操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CinderDeleteVolumeTransferRequest 请求对象
     * @return AsyncInvoker<CinderDeleteVolumeTransferRequest, CinderDeleteVolumeTransferResponse>
     */
    public AsyncInvoker<CinderDeleteVolumeTransferRequest, CinderDeleteVolumeTransferResponse> cinderDeleteVolumeTransferAsyncInvoker(
        CinderDeleteVolumeTransferRequest request) {
        return new AsyncInvoker<>(request, EvsMeta.cinderDeleteVolumeTransfer, hcClient);
    }

    /**
     * 查询所有的可用分区信息
     *
     * 查询所有的可用分区信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CinderListAvailabilityZonesRequest 请求对象
     * @return CompletableFuture<CinderListAvailabilityZonesResponse>
     */
    public CompletableFuture<CinderListAvailabilityZonesResponse> cinderListAvailabilityZonesAsync(
        CinderListAvailabilityZonesRequest request) {
        return hcClient.asyncInvokeHttp(request, EvsMeta.cinderListAvailabilityZones);
    }

    /**
     * 查询所有的可用分区信息
     *
     * 查询所有的可用分区信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CinderListAvailabilityZonesRequest 请求对象
     * @return AsyncInvoker<CinderListAvailabilityZonesRequest, CinderListAvailabilityZonesResponse>
     */
    public AsyncInvoker<CinderListAvailabilityZonesRequest, CinderListAvailabilityZonesResponse> cinderListAvailabilityZonesAsyncInvoker(
        CinderListAvailabilityZonesRequest request) {
        return new AsyncInvoker<>(request, EvsMeta.cinderListAvailabilityZones, hcClient);
    }

    /**
     * 查询租户的详细配额
     *
     * 查询租户的详细配额。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CinderListQuotasRequest 请求对象
     * @return CompletableFuture<CinderListQuotasResponse>
     */
    public CompletableFuture<CinderListQuotasResponse> cinderListQuotasAsync(CinderListQuotasRequest request) {
        return hcClient.asyncInvokeHttp(request, EvsMeta.cinderListQuotas);
    }

    /**
     * 查询租户的详细配额
     *
     * 查询租户的详细配额。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CinderListQuotasRequest 请求对象
     * @return AsyncInvoker<CinderListQuotasRequest, CinderListQuotasResponse>
     */
    public AsyncInvoker<CinderListQuotasRequest, CinderListQuotasResponse> cinderListQuotasAsyncInvoker(
        CinderListQuotasRequest request) {
        return new AsyncInvoker<>(request, EvsMeta.cinderListQuotas, hcClient);
    }

    /**
     * 查询云硬盘过户记录列表概要
     *
     * 查询当前租户下所有云硬盘的过户记录列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CinderListVolumeTransfersRequest 请求对象
     * @return CompletableFuture<CinderListVolumeTransfersResponse>
     */
    public CompletableFuture<CinderListVolumeTransfersResponse> cinderListVolumeTransfersAsync(
        CinderListVolumeTransfersRequest request) {
        return hcClient.asyncInvokeHttp(request, EvsMeta.cinderListVolumeTransfers);
    }

    /**
     * 查询云硬盘过户记录列表概要
     *
     * 查询当前租户下所有云硬盘的过户记录列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CinderListVolumeTransfersRequest 请求对象
     * @return AsyncInvoker<CinderListVolumeTransfersRequest, CinderListVolumeTransfersResponse>
     */
    public AsyncInvoker<CinderListVolumeTransfersRequest, CinderListVolumeTransfersResponse> cinderListVolumeTransfersAsyncInvoker(
        CinderListVolumeTransfersRequest request) {
        return new AsyncInvoker<>(request, EvsMeta.cinderListVolumeTransfers, hcClient);
    }

    /**
     * 查询云硬盘类型列表
     *
     * 查询云硬盘类型列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CinderListVolumeTypesRequest 请求对象
     * @return CompletableFuture<CinderListVolumeTypesResponse>
     */
    public CompletableFuture<CinderListVolumeTypesResponse> cinderListVolumeTypesAsync(
        CinderListVolumeTypesRequest request) {
        return hcClient.asyncInvokeHttp(request, EvsMeta.cinderListVolumeTypes);
    }

    /**
     * 查询云硬盘类型列表
     *
     * 查询云硬盘类型列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CinderListVolumeTypesRequest 请求对象
     * @return AsyncInvoker<CinderListVolumeTypesRequest, CinderListVolumeTypesResponse>
     */
    public AsyncInvoker<CinderListVolumeTypesRequest, CinderListVolumeTypesResponse> cinderListVolumeTypesAsyncInvoker(
        CinderListVolumeTypesRequest request) {
        return new AsyncInvoker<>(request, EvsMeta.cinderListVolumeTypes, hcClient);
    }

    /**
     * 查询单个云硬盘过户记录详情
     *
     * 查询单个云硬盘的过户记录详情，比如过户记录创建时间、ID以及名称等信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CinderShowVolumeTransferRequest 请求对象
     * @return CompletableFuture<CinderShowVolumeTransferResponse>
     */
    public CompletableFuture<CinderShowVolumeTransferResponse> cinderShowVolumeTransferAsync(
        CinderShowVolumeTransferRequest request) {
        return hcClient.asyncInvokeHttp(request, EvsMeta.cinderShowVolumeTransfer);
    }

    /**
     * 查询单个云硬盘过户记录详情
     *
     * 查询单个云硬盘的过户记录详情，比如过户记录创建时间、ID以及名称等信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CinderShowVolumeTransferRequest 请求对象
     * @return AsyncInvoker<CinderShowVolumeTransferRequest, CinderShowVolumeTransferResponse>
     */
    public AsyncInvoker<CinderShowVolumeTransferRequest, CinderShowVolumeTransferResponse> cinderShowVolumeTransferAsyncInvoker(
        CinderShowVolumeTransferRequest request) {
        return new AsyncInvoker<>(request, EvsMeta.cinderShowVolumeTransfer, hcClient);
    }

    /**
     * 查询自动快照策略总数
     *
     * 查询自动快照策略总数。标准快照当前只在部分区域支持，具体的区域列表请通过控制台查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CountAutoSnapshotPoliciesRequest 请求对象
     * @return CompletableFuture<CountAutoSnapshotPoliciesResponse>
     */
    public CompletableFuture<CountAutoSnapshotPoliciesResponse> countAutoSnapshotPoliciesAsync(
        CountAutoSnapshotPoliciesRequest request) {
        return hcClient.asyncInvokeHttp(request, EvsMeta.countAutoSnapshotPolicies);
    }

    /**
     * 查询自动快照策略总数
     *
     * 查询自动快照策略总数。标准快照当前只在部分区域支持，具体的区域列表请通过控制台查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CountAutoSnapshotPoliciesRequest 请求对象
     * @return AsyncInvoker<CountAutoSnapshotPoliciesRequest, CountAutoSnapshotPoliciesResponse>
     */
    public AsyncInvoker<CountAutoSnapshotPoliciesRequest, CountAutoSnapshotPoliciesResponse> countAutoSnapshotPoliciesAsyncInvoker(
        CountAutoSnapshotPoliciesRequest request) {
        return new AsyncInvoker<>(request, EvsMeta.countAutoSnapshotPolicies, hcClient);
    }

    /**
     * 查询快照链个数
     *
     * 查询快照链个数。标准快照当前只在部分区域支持，具体的区域列表请通过控制台查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CountSnapshotChainsRequest 请求对象
     * @return CompletableFuture<CountSnapshotChainsResponse>
     */
    public CompletableFuture<CountSnapshotChainsResponse> countSnapshotChainsAsync(CountSnapshotChainsRequest request) {
        return hcClient.asyncInvokeHttp(request, EvsMeta.countSnapshotChains);
    }

    /**
     * 查询快照链个数
     *
     * 查询快照链个数。标准快照当前只在部分区域支持，具体的区域列表请通过控制台查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CountSnapshotChainsRequest 请求对象
     * @return AsyncInvoker<CountSnapshotChainsRequest, CountSnapshotChainsResponse>
     */
    public AsyncInvoker<CountSnapshotChainsRequest, CountSnapshotChainsResponse> countSnapshotChainsAsyncInvoker(
        CountSnapshotChainsRequest request) {
        return new AsyncInvoker<>(request, EvsMeta.countSnapshotChains, hcClient);
    }

    /**
     * 查询快照个数
     *
     * 查询快照个数。标准快照当前只在部分区域支持，具体的区域列表请通过控制台查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CountSnapshotsRequest 请求对象
     * @return CompletableFuture<CountSnapshotsResponse>
     */
    public CompletableFuture<CountSnapshotsResponse> countSnapshotsAsync(CountSnapshotsRequest request) {
        return hcClient.asyncInvokeHttp(request, EvsMeta.countSnapshots);
    }

    /**
     * 查询快照个数
     *
     * 查询快照个数。标准快照当前只在部分区域支持，具体的区域列表请通过控制台查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CountSnapshotsRequest 请求对象
     * @return AsyncInvoker<CountSnapshotsRequest, CountSnapshotsResponse>
     */
    public AsyncInvoker<CountSnapshotsRequest, CountSnapshotsResponse> countSnapshotsAsyncInvoker(
        CountSnapshotsRequest request) {
        return new AsyncInvoker<>(request, EvsMeta.countSnapshots, hcClient);
    }

    /**
     * 查询快照一致性组个数
     *
     * 查询快照一致性组个数。标准快照当前只在部分区域支持，具体的区域列表请通过控制台查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CountSnapshotsGroupRequest 请求对象
     * @return CompletableFuture<CountSnapshotsGroupResponse>
     */
    public CompletableFuture<CountSnapshotsGroupResponse> countSnapshotsGroupAsync(CountSnapshotsGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, EvsMeta.countSnapshotsGroup);
    }

    /**
     * 查询快照一致性组个数
     *
     * 查询快照一致性组个数。标准快照当前只在部分区域支持，具体的区域列表请通过控制台查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CountSnapshotsGroupRequest 请求对象
     * @return AsyncInvoker<CountSnapshotsGroupRequest, CountSnapshotsGroupResponse>
     */
    public AsyncInvoker<CountSnapshotsGroupRequest, CountSnapshotsGroupResponse> countSnapshotsGroupAsyncInvoker(
        CountSnapshotsGroupRequest request) {
        return new AsyncInvoker<>(request, EvsMeta.countSnapshotsGroup, hcClient);
    }

    /**
     * 创建自动快照策略
     *
     * 创建自动快照策略。标准快照当前只在部分区域支持，具体的区域列表请通过控制台查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAutoSnapshotPolicyRequest 请求对象
     * @return CompletableFuture<CreateAutoSnapshotPolicyResponse>
     */
    public CompletableFuture<CreateAutoSnapshotPolicyResponse> createAutoSnapshotPolicyAsync(
        CreateAutoSnapshotPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, EvsMeta.createAutoSnapshotPolicy);
    }

    /**
     * 创建自动快照策略
     *
     * 创建自动快照策略。标准快照当前只在部分区域支持，具体的区域列表请通过控制台查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAutoSnapshotPolicyRequest 请求对象
     * @return AsyncInvoker<CreateAutoSnapshotPolicyRequest, CreateAutoSnapshotPolicyResponse>
     */
    public AsyncInvoker<CreateAutoSnapshotPolicyRequest, CreateAutoSnapshotPolicyResponse> createAutoSnapshotPolicyAsyncInvoker(
        CreateAutoSnapshotPolicyRequest request) {
        return new AsyncInvoker<>(request, EvsMeta.createAutoSnapshotPolicy, hcClient);
    }

    /**
     * 创建云硬盘快照
     *
     * 创建云硬盘快照。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSnapshotRequest 请求对象
     * @return CompletableFuture<CreateSnapshotResponse>
     */
    public CompletableFuture<CreateSnapshotResponse> createSnapshotAsync(CreateSnapshotRequest request) {
        return hcClient.asyncInvokeHttp(request, EvsMeta.createSnapshot);
    }

    /**
     * 创建云硬盘快照
     *
     * 创建云硬盘快照。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSnapshotRequest 请求对象
     * @return AsyncInvoker<CreateSnapshotRequest, CreateSnapshotResponse>
     */
    public AsyncInvoker<CreateSnapshotRequest, CreateSnapshotResponse> createSnapshotAsyncInvoker(
        CreateSnapshotRequest request) {
        return new AsyncInvoker<>(request, EvsMeta.createSnapshot, hcClient);
    }

    /**
     * 创建快照一致性组
     *
     * 创建快照一致性组。标准快照当前只在部分区域支持，具体的区域列表请通过控制台查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSnapshotGroupRequest 请求对象
     * @return CompletableFuture<CreateSnapshotGroupResponse>
     */
    public CompletableFuture<CreateSnapshotGroupResponse> createSnapshotGroupAsync(CreateSnapshotGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, EvsMeta.createSnapshotGroup);
    }

    /**
     * 创建快照一致性组
     *
     * 创建快照一致性组。标准快照当前只在部分区域支持，具体的区域列表请通过控制台查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSnapshotGroupRequest 请求对象
     * @return AsyncInvoker<CreateSnapshotGroupRequest, CreateSnapshotGroupResponse>
     */
    public AsyncInvoker<CreateSnapshotGroupRequest, CreateSnapshotGroupResponse> createSnapshotGroupAsyncInvoker(
        CreateSnapshotGroupRequest request) {
        return new AsyncInvoker<>(request, EvsMeta.createSnapshotGroup, hcClient);
    }

    /**
     * 创建快照
     *
     * 创建标准快照。标准快照当前只在部分区域支持，具体的区域列表请通过控制台查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateStandardSnapshotRequest 请求对象
     * @return CompletableFuture<CreateStandardSnapshotResponse>
     */
    public CompletableFuture<CreateStandardSnapshotResponse> createStandardSnapshotAsync(
        CreateStandardSnapshotRequest request) {
        return hcClient.asyncInvokeHttp(request, EvsMeta.createStandardSnapshot);
    }

    /**
     * 创建快照
     *
     * 创建标准快照。标准快照当前只在部分区域支持，具体的区域列表请通过控制台查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateStandardSnapshotRequest 请求对象
     * @return AsyncInvoker<CreateStandardSnapshotRequest, CreateStandardSnapshotResponse>
     */
    public AsyncInvoker<CreateStandardSnapshotRequest, CreateStandardSnapshotResponse> createStandardSnapshotAsyncInvoker(
        CreateStandardSnapshotRequest request) {
        return new AsyncInvoker<>(request, EvsMeta.createStandardSnapshot, hcClient);
    }

    /**
     * 创建云硬盘
     *
     * 创建按需或包周期云硬盘。
     * 在创建包周期云硬盘的场景下：
     * - 如果您需要查看订单可用的优惠券，请参考\&quot;[查询订单可用优惠券](https://support.huaweicloud.com/api-oce/zh-cn_topic_0092953630.html)\&quot;。
     * - 如果您需要支付订单，请参考\&quot;[支付包周期产品订单](https://support.huaweicloud.com/api-oce/zh-cn_topic_0075746561.html)\&quot;。
     * - 如果您需要查询订单的资源开通详情，请参考\&quot;[查询订单的资源开通详情](https://support.huaweicloud.com/api-oce/api_order_00001.html)\&quot;。
     * - 如果您需要退订该包周期资源，请参考“[退订包周期资源](https://support.huaweicloud.com/api-oce/zh-cn_topic_0082522030.html)”。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateVolumeRequest 请求对象
     * @return CompletableFuture<CreateVolumeResponse>
     */
    public CompletableFuture<CreateVolumeResponse> createVolumeAsync(CreateVolumeRequest request) {
        return hcClient.asyncInvokeHttp(request, EvsMeta.createVolume);
    }

    /**
     * 创建云硬盘
     *
     * 创建按需或包周期云硬盘。
     * 在创建包周期云硬盘的场景下：
     * - 如果您需要查看订单可用的优惠券，请参考\&quot;[查询订单可用优惠券](https://support.huaweicloud.com/api-oce/zh-cn_topic_0092953630.html)\&quot;。
     * - 如果您需要支付订单，请参考\&quot;[支付包周期产品订单](https://support.huaweicloud.com/api-oce/zh-cn_topic_0075746561.html)\&quot;。
     * - 如果您需要查询订单的资源开通详情，请参考\&quot;[查询订单的资源开通详情](https://support.huaweicloud.com/api-oce/api_order_00001.html)\&quot;。
     * - 如果您需要退订该包周期资源，请参考“[退订包周期资源](https://support.huaweicloud.com/api-oce/zh-cn_topic_0082522030.html)”。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateVolumeRequest 请求对象
     * @return AsyncInvoker<CreateVolumeRequest, CreateVolumeResponse>
     */
    public AsyncInvoker<CreateVolumeRequest, CreateVolumeResponse> createVolumeAsyncInvoker(
        CreateVolumeRequest request) {
        return new AsyncInvoker<>(request, EvsMeta.createVolume, hcClient);
    }

    /**
     * 删除单个自动快照策略
     *
     * 删除单个自动快照策略。标准快照当前只在部分区域支持，具体的区域列表请通过控制台查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAutoSnapshotPolicyRequest 请求对象
     * @return CompletableFuture<DeleteAutoSnapshotPolicyResponse>
     */
    public CompletableFuture<DeleteAutoSnapshotPolicyResponse> deleteAutoSnapshotPolicyAsync(
        DeleteAutoSnapshotPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, EvsMeta.deleteAutoSnapshotPolicy);
    }

    /**
     * 删除单个自动快照策略
     *
     * 删除单个自动快照策略。标准快照当前只在部分区域支持，具体的区域列表请通过控制台查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAutoSnapshotPolicyRequest 请求对象
     * @return AsyncInvoker<DeleteAutoSnapshotPolicyRequest, DeleteAutoSnapshotPolicyResponse>
     */
    public AsyncInvoker<DeleteAutoSnapshotPolicyRequest, DeleteAutoSnapshotPolicyResponse> deleteAutoSnapshotPolicyAsyncInvoker(
        DeleteAutoSnapshotPolicyRequest request) {
        return new AsyncInvoker<>(request, EvsMeta.deleteAutoSnapshotPolicy, hcClient);
    }

    /**
     * 删除云硬盘快照
     *
     * 删除云硬盘快照。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSnapshotRequest 请求对象
     * @return CompletableFuture<DeleteSnapshotResponse>
     */
    public CompletableFuture<DeleteSnapshotResponse> deleteSnapshotAsync(DeleteSnapshotRequest request) {
        return hcClient.asyncInvokeHttp(request, EvsMeta.deleteSnapshot);
    }

    /**
     * 删除云硬盘快照
     *
     * 删除云硬盘快照。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSnapshotRequest 请求对象
     * @return AsyncInvoker<DeleteSnapshotRequest, DeleteSnapshotResponse>
     */
    public AsyncInvoker<DeleteSnapshotRequest, DeleteSnapshotResponse> deleteSnapshotAsyncInvoker(
        DeleteSnapshotRequest request) {
        return new AsyncInvoker<>(request, EvsMeta.deleteSnapshot, hcClient);
    }

    /**
     * 删除快照一致性组
     *
     * 删除快照一致性组。标准快照当前只在部分区域支持，具体的区域列表请通过控制台查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSnapshotGroupRequest 请求对象
     * @return CompletableFuture<DeleteSnapshotGroupResponse>
     */
    public CompletableFuture<DeleteSnapshotGroupResponse> deleteSnapshotGroupAsync(DeleteSnapshotGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, EvsMeta.deleteSnapshotGroup);
    }

    /**
     * 删除快照一致性组
     *
     * 删除快照一致性组。标准快照当前只在部分区域支持，具体的区域列表请通过控制台查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSnapshotGroupRequest 请求对象
     * @return AsyncInvoker<DeleteSnapshotGroupRequest, DeleteSnapshotGroupResponse>
     */
    public AsyncInvoker<DeleteSnapshotGroupRequest, DeleteSnapshotGroupResponse> deleteSnapshotGroupAsyncInvoker(
        DeleteSnapshotGroupRequest request) {
        return new AsyncInvoker<>(request, EvsMeta.deleteSnapshotGroup, hcClient);
    }

    /**
     * 删除快照
     *
     * 删除快照。标准快照当前只在部分区域支持，具体的区域列表请通过控制台查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteStandardSnapshotRequest 请求对象
     * @return CompletableFuture<DeleteStandardSnapshotResponse>
     */
    public CompletableFuture<DeleteStandardSnapshotResponse> deleteStandardSnapshotAsync(
        DeleteStandardSnapshotRequest request) {
        return hcClient.asyncInvokeHttp(request, EvsMeta.deleteStandardSnapshot);
    }

    /**
     * 删除快照
     *
     * 删除快照。标准快照当前只在部分区域支持，具体的区域列表请通过控制台查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteStandardSnapshotRequest 请求对象
     * @return AsyncInvoker<DeleteStandardSnapshotRequest, DeleteStandardSnapshotResponse>
     */
    public AsyncInvoker<DeleteStandardSnapshotRequest, DeleteStandardSnapshotResponse> deleteStandardSnapshotAsyncInvoker(
        DeleteStandardSnapshotRequest request) {
        return new AsyncInvoker<>(request, EvsMeta.deleteStandardSnapshot, hcClient);
    }

    /**
     * 删除云硬盘
     *
     * 删除一个云硬盘。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteVolumeRequest 请求对象
     * @return CompletableFuture<DeleteVolumeResponse>
     */
    public CompletableFuture<DeleteVolumeResponse> deleteVolumeAsync(DeleteVolumeRequest request) {
        return hcClient.asyncInvokeHttp(request, EvsMeta.deleteVolume);
    }

    /**
     * 删除云硬盘
     *
     * 删除一个云硬盘。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteVolumeRequest 请求对象
     * @return AsyncInvoker<DeleteVolumeRequest, DeleteVolumeResponse>
     */
    public AsyncInvoker<DeleteVolumeRequest, DeleteVolumeResponse> deleteVolumeAsyncInvoker(
        DeleteVolumeRequest request) {
        return new AsyncInvoker<>(request, EvsMeta.deleteVolume, hcClient);
    }

    /**
     * 删除回收站中单个云硬盘
     *
     * 删除回收站中单个云硬盘。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteVolumeInRecycleRequest 请求对象
     * @return CompletableFuture<DeleteVolumeInRecycleResponse>
     */
    public CompletableFuture<DeleteVolumeInRecycleResponse> deleteVolumeInRecycleAsync(
        DeleteVolumeInRecycleRequest request) {
        return hcClient.asyncInvokeHttp(request, EvsMeta.deleteVolumeInRecycle);
    }

    /**
     * 删除回收站中单个云硬盘
     *
     * 删除回收站中单个云硬盘。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteVolumeInRecycleRequest 请求对象
     * @return AsyncInvoker<DeleteVolumeInRecycleRequest, DeleteVolumeInRecycleResponse>
     */
    public AsyncInvoker<DeleteVolumeInRecycleRequest, DeleteVolumeInRecycleResponse> deleteVolumeInRecycleAsyncInvoker(
        DeleteVolumeInRecycleRequest request) {
        return new AsyncInvoker<>(request, EvsMeta.deleteVolumeInRecycle, hcClient);
    }

    /**
     * 解绑自动快照策略
     *
     * 解绑自动快照策略。标准快照当前只在部分区域支持，具体的区域列表请通过控制台查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisassociateAutoSnapshotPolicyRequest 请求对象
     * @return CompletableFuture<DisassociateAutoSnapshotPolicyResponse>
     */
    public CompletableFuture<DisassociateAutoSnapshotPolicyResponse> disassociateAutoSnapshotPolicyAsync(
        DisassociateAutoSnapshotPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, EvsMeta.disassociateAutoSnapshotPolicy);
    }

    /**
     * 解绑自动快照策略
     *
     * 解绑自动快照策略。标准快照当前只在部分区域支持，具体的区域列表请通过控制台查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisassociateAutoSnapshotPolicyRequest 请求对象
     * @return AsyncInvoker<DisassociateAutoSnapshotPolicyRequest, DisassociateAutoSnapshotPolicyResponse>
     */
    public AsyncInvoker<DisassociateAutoSnapshotPolicyRequest, DisassociateAutoSnapshotPolicyResponse> disassociateAutoSnapshotPolicyAsyncInvoker(
        DisassociateAutoSnapshotPolicyRequest request) {
        return new AsyncInvoker<>(request, EvsMeta.disassociateAutoSnapshotPolicy, hcClient);
    }

    /**
     * 查询自动快照策略
     *
     * 查询自动快照策略。标准快照当前只在部分区域支持，具体的区域列表请通过控制台查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAutoSnapshotPolicyRequest 请求对象
     * @return CompletableFuture<ListAutoSnapshotPolicyResponse>
     */
    public CompletableFuture<ListAutoSnapshotPolicyResponse> listAutoSnapshotPolicyAsync(
        ListAutoSnapshotPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, EvsMeta.listAutoSnapshotPolicy);
    }

    /**
     * 查询自动快照策略
     *
     * 查询自动快照策略。标准快照当前只在部分区域支持，具体的区域列表请通过控制台查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAutoSnapshotPolicyRequest 请求对象
     * @return AsyncInvoker<ListAutoSnapshotPolicyRequest, ListAutoSnapshotPolicyResponse>
     */
    public AsyncInvoker<ListAutoSnapshotPolicyRequest, ListAutoSnapshotPolicyResponse> listAutoSnapshotPolicyAsyncInvoker(
        ListAutoSnapshotPolicyRequest request) {
        return new AsyncInvoker<>(request, EvsMeta.listAutoSnapshotPolicy, hcClient);
    }

    /**
     * 查询快照链列表
     *
     * 查询快照链的列表。标准快照当前只在部分区域支持，具体的区域列表请通过控制台查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSnapshotChainsRequest 请求对象
     * @return CompletableFuture<ListSnapshotChainsResponse>
     */
    public CompletableFuture<ListSnapshotChainsResponse> listSnapshotChainsAsync(ListSnapshotChainsRequest request) {
        return hcClient.asyncInvokeHttp(request, EvsMeta.listSnapshotChains);
    }

    /**
     * 查询快照链列表
     *
     * 查询快照链的列表。标准快照当前只在部分区域支持，具体的区域列表请通过控制台查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSnapshotChainsRequest 请求对象
     * @return AsyncInvoker<ListSnapshotChainsRequest, ListSnapshotChainsResponse>
     */
    public AsyncInvoker<ListSnapshotChainsRequest, ListSnapshotChainsResponse> listSnapshotChainsAsyncInvoker(
        ListSnapshotChainsRequest request) {
        return new AsyncInvoker<>(request, EvsMeta.listSnapshotChains, hcClient);
    }

    /**
     * 查询快照一致性组列表
     *
     * 查询快照一致性组列表。标准快照当前只在部分区域支持，具体的区域列表请通过控制台查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSnapshotGroupRequest 请求对象
     * @return CompletableFuture<ListSnapshotGroupResponse>
     */
    public CompletableFuture<ListSnapshotGroupResponse> listSnapshotGroupAsync(ListSnapshotGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, EvsMeta.listSnapshotGroup);
    }

    /**
     * 查询快照一致性组列表
     *
     * 查询快照一致性组列表。标准快照当前只在部分区域支持，具体的区域列表请通过控制台查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSnapshotGroupRequest 请求对象
     * @return AsyncInvoker<ListSnapshotGroupRequest, ListSnapshotGroupResponse>
     */
    public AsyncInvoker<ListSnapshotGroupRequest, ListSnapshotGroupResponse> listSnapshotGroupAsyncInvoker(
        ListSnapshotGroupRequest request) {
        return new AsyncInvoker<>(request, EvsMeta.listSnapshotGroup, hcClient);
    }

    /**
     * 查询快照组的所有标签
     *
     * 查询快照组的所有标签。标准快照当前只在部分区域支持，具体的区域列表请通过控制台查询详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSnapshotGroupTagsRequest 请求对象
     * @return CompletableFuture<ListSnapshotGroupTagsResponse>
     */
    public CompletableFuture<ListSnapshotGroupTagsResponse> listSnapshotGroupTagsAsync(
        ListSnapshotGroupTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, EvsMeta.listSnapshotGroupTags);
    }

    /**
     * 查询快照组的所有标签
     *
     * 查询快照组的所有标签。标准快照当前只在部分区域支持，具体的区域列表请通过控制台查询详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSnapshotGroupTagsRequest 请求对象
     * @return AsyncInvoker<ListSnapshotGroupTagsRequest, ListSnapshotGroupTagsResponse>
     */
    public AsyncInvoker<ListSnapshotGroupTagsRequest, ListSnapshotGroupTagsResponse> listSnapshotGroupTagsAsyncInvoker(
        ListSnapshotGroupTagsRequest request) {
        return new AsyncInvoker<>(request, EvsMeta.listSnapshotGroupTags, hcClient);
    }

    /**
     * 查询快照资源的所有标签
     *
     * 查询快照资源的所有标签。标准快照当前只在部分区域支持，具体的区域列表请通过控制台查询详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSnapshotTagsRequest 请求对象
     * @return CompletableFuture<ListSnapshotTagsResponse>
     */
    public CompletableFuture<ListSnapshotTagsResponse> listSnapshotTagsAsync(ListSnapshotTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, EvsMeta.listSnapshotTags);
    }

    /**
     * 查询快照资源的所有标签
     *
     * 查询快照资源的所有标签。标准快照当前只在部分区域支持，具体的区域列表请通过控制台查询详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSnapshotTagsRequest 请求对象
     * @return AsyncInvoker<ListSnapshotTagsRequest, ListSnapshotTagsResponse>
     */
    public AsyncInvoker<ListSnapshotTagsRequest, ListSnapshotTagsResponse> listSnapshotTagsAsyncInvoker(
        ListSnapshotTagsRequest request) {
        return new AsyncInvoker<>(request, EvsMeta.listSnapshotTags, hcClient);
    }

    /**
     * 查询云硬盘快照详情列表
     *
     * 查询云硬盘快照详细列表信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSnapshotsRequest 请求对象
     * @return CompletableFuture<ListSnapshotsResponse>
     */
    public CompletableFuture<ListSnapshotsResponse> listSnapshotsAsync(ListSnapshotsRequest request) {
        return hcClient.asyncInvokeHttp(request, EvsMeta.listSnapshots);
    }

    /**
     * 查询云硬盘快照详情列表
     *
     * 查询云硬盘快照详细列表信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSnapshotsRequest 请求对象
     * @return AsyncInvoker<ListSnapshotsRequest, ListSnapshotsResponse>
     */
    public AsyncInvoker<ListSnapshotsRequest, ListSnapshotsResponse> listSnapshotsAsyncInvoker(
        ListSnapshotsRequest request) {
        return new AsyncInvoker<>(request, EvsMeta.listSnapshots, hcClient);
    }

    /**
     * 查询快照详情列表
     *
     * 查询快照详情列表。标准快照当前只在部分区域支持，具体的区域列表请通过控制台查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSnapshotsDetailsRequest 请求对象
     * @return CompletableFuture<ListSnapshotsDetailsResponse>
     */
    public CompletableFuture<ListSnapshotsDetailsResponse> listSnapshotsDetailsAsync(
        ListSnapshotsDetailsRequest request) {
        return hcClient.asyncInvokeHttp(request, EvsMeta.listSnapshotsDetails);
    }

    /**
     * 查询快照详情列表
     *
     * 查询快照详情列表。标准快照当前只在部分区域支持，具体的区域列表请通过控制台查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSnapshotsDetailsRequest 请求对象
     * @return AsyncInvoker<ListSnapshotsDetailsRequest, ListSnapshotsDetailsResponse>
     */
    public AsyncInvoker<ListSnapshotsDetailsRequest, ListSnapshotsDetailsResponse> listSnapshotsDetailsAsyncInvoker(
        ListSnapshotsDetailsRequest request) {
        return new AsyncInvoker<>(request, EvsMeta.listSnapshotsDetails, hcClient);
    }

    /**
     * 获取云硬盘资源的所有标签
     *
     * 获取某个租户的所有云硬盘资源的标签信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVolumeTagsRequest 请求对象
     * @return CompletableFuture<ListVolumeTagsResponse>
     */
    public CompletableFuture<ListVolumeTagsResponse> listVolumeTagsAsync(ListVolumeTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, EvsMeta.listVolumeTags);
    }

    /**
     * 获取云硬盘资源的所有标签
     *
     * 获取某个租户的所有云硬盘资源的标签信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVolumeTagsRequest 请求对象
     * @return AsyncInvoker<ListVolumeTagsRequest, ListVolumeTagsResponse>
     */
    public AsyncInvoker<ListVolumeTagsRequest, ListVolumeTagsResponse> listVolumeTagsAsyncInvoker(
        ListVolumeTagsRequest request) {
        return new AsyncInvoker<>(request, EvsMeta.listVolumeTags, hcClient);
    }

    /**
     * 查询所有云硬盘详情
     *
     * 查询所有云硬盘的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVolumesRequest 请求对象
     * @return CompletableFuture<ListVolumesResponse>
     */
    public CompletableFuture<ListVolumesResponse> listVolumesAsync(ListVolumesRequest request) {
        return hcClient.asyncInvokeHttp(request, EvsMeta.listVolumes);
    }

    /**
     * 查询所有云硬盘详情
     *
     * 查询所有云硬盘的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVolumesRequest 请求对象
     * @return AsyncInvoker<ListVolumesRequest, ListVolumesResponse>
     */
    public AsyncInvoker<ListVolumesRequest, ListVolumesResponse> listVolumesAsyncInvoker(ListVolumesRequest request) {
        return new AsyncInvoker<>(request, EvsMeta.listVolumes, hcClient);
    }

    /**
     * 通过标签查询云硬盘资源实例详情
     *
     * 通过标签查询云硬盘资源实例详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVolumesByTagsRequest 请求对象
     * @return CompletableFuture<ListVolumesByTagsResponse>
     */
    public CompletableFuture<ListVolumesByTagsResponse> listVolumesByTagsAsync(ListVolumesByTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, EvsMeta.listVolumesByTags);
    }

    /**
     * 通过标签查询云硬盘资源实例详情
     *
     * 通过标签查询云硬盘资源实例详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVolumesByTagsRequest 请求对象
     * @return AsyncInvoker<ListVolumesByTagsRequest, ListVolumesByTagsResponse>
     */
    public AsyncInvoker<ListVolumesByTagsRequest, ListVolumesByTagsResponse> listVolumesByTagsAsyncInvoker(
        ListVolumesByTagsRequest request) {
        return new AsyncInvoker<>(request, EvsMeta.listVolumesByTags, hcClient);
    }

    /**
     * 查询回收站中所有云硬盘详情
     *
     * 查询回收站中所有云硬盘的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVolumesInRecycleRequest 请求对象
     * @return CompletableFuture<ListVolumesInRecycleResponse>
     */
    public CompletableFuture<ListVolumesInRecycleResponse> listVolumesInRecycleAsync(
        ListVolumesInRecycleRequest request) {
        return hcClient.asyncInvokeHttp(request, EvsMeta.listVolumesInRecycle);
    }

    /**
     * 查询回收站中所有云硬盘详情
     *
     * 查询回收站中所有云硬盘的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVolumesInRecycleRequest 请求对象
     * @return AsyncInvoker<ListVolumesInRecycleRequest, ListVolumesInRecycleResponse>
     */
    public AsyncInvoker<ListVolumesInRecycleRequest, ListVolumesInRecycleResponse> listVolumesInRecycleAsyncInvoker(
        ListVolumesInRecycleRequest request) {
        return new AsyncInvoker<>(request, EvsMeta.listVolumesInRecycle, hcClient);
    }

    /**
     * 修改云硬盘QoS
     *
     * 调整云硬盘的iops或者吞吐量。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyVolumeQoSRequest 请求对象
     * @return CompletableFuture<ModifyVolumeQoSResponse>
     */
    public CompletableFuture<ModifyVolumeQoSResponse> modifyVolumeQoSAsync(ModifyVolumeQoSRequest request) {
        return hcClient.asyncInvokeHttp(request, EvsMeta.modifyVolumeQoS);
    }

    /**
     * 修改云硬盘QoS
     *
     * 调整云硬盘的iops或者吞吐量。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyVolumeQoSRequest 请求对象
     * @return AsyncInvoker<ModifyVolumeQoSRequest, ModifyVolumeQoSResponse>
     */
    public AsyncInvoker<ModifyVolumeQoSRequest, ModifyVolumeQoSResponse> modifyVolumeQoSAsyncInvoker(
        ModifyVolumeQoSRequest request) {
        return new AsyncInvoker<>(request, EvsMeta.modifyVolumeQoS, hcClient);
    }

    /**
     * 扩容云硬盘
     *
     * 对按需或者包周期云硬盘进行扩容。
     * 在扩容包周期云硬盘的场景下：
     * - 如果您需要查看订单可用的优惠券，请参考\&quot;[查询订单可用优惠券](https://support.huaweicloud.com/api-oce/zh-cn_topic_0092953630.html)\&quot;。
     * - 如果您需要支付订单，请参考\&quot;[支付包周期产品订单](https://support.huaweicloud.com/api-oce/zh-cn_topic_0075746561.html)\&quot;。
     * - 如果您需要查询订单的资源开通详情，请参考\&quot;[查询订单的资源开通详情](https://support.huaweicloud.com/api-oce/api_order_00001.html)\&quot;。
     * - 如果您需要退订该包周期资源，请参考“[退订包周期资源](https://support.huaweicloud.com/api-oce/zh-cn_topic_0082522030.html)”。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResizeVolumeRequest 请求对象
     * @return CompletableFuture<ResizeVolumeResponse>
     */
    public CompletableFuture<ResizeVolumeResponse> resizeVolumeAsync(ResizeVolumeRequest request) {
        return hcClient.asyncInvokeHttp(request, EvsMeta.resizeVolume);
    }

    /**
     * 扩容云硬盘
     *
     * 对按需或者包周期云硬盘进行扩容。
     * 在扩容包周期云硬盘的场景下：
     * - 如果您需要查看订单可用的优惠券，请参考\&quot;[查询订单可用优惠券](https://support.huaweicloud.com/api-oce/zh-cn_topic_0092953630.html)\&quot;。
     * - 如果您需要支付订单，请参考\&quot;[支付包周期产品订单](https://support.huaweicloud.com/api-oce/zh-cn_topic_0075746561.html)\&quot;。
     * - 如果您需要查询订单的资源开通详情，请参考\&quot;[查询订单的资源开通详情](https://support.huaweicloud.com/api-oce/api_order_00001.html)\&quot;。
     * - 如果您需要退订该包周期资源，请参考“[退订包周期资源](https://support.huaweicloud.com/api-oce/zh-cn_topic_0082522030.html)”。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResizeVolumeRequest 请求对象
     * @return AsyncInvoker<ResizeVolumeRequest, ResizeVolumeResponse>
     */
    public AsyncInvoker<ResizeVolumeRequest, ResizeVolumeResponse> resizeVolumeAsyncInvoker(
        ResizeVolumeRequest request) {
        return new AsyncInvoker<>(request, EvsMeta.resizeVolume, hcClient);
    }

    /**
     * 磁盘类型变更
     *
     * 对按需或者包周期云硬盘进行磁盘类型变更。
     * [在磁盘类型变更包周期云硬盘的场景下：](tag:hws)
     * - [如果您需要查看订单可用的优惠券，请参考\&quot;[查询订单可用优惠券](https://support.huaweicloud.com/api-oce/zh-cn_topic_0092953630.html)\&quot;。](tag:hws)
     * - [如果您需要支付订单，请参考\&quot;[支付包周期产品订单](https://support.huaweicloud.com/api-oce/api_order_00030.html)\&quot;。](tag:hws)
     * - [如果您需要查询订单的资源开通详情，请参考\&quot;[查询订单的资源开通详情](https://support.huaweicloud.com/api-oce/api_order_00001.html)\&quot;。](tag:hws)
     * - [如果您需要退订该包周期资源，请参考“[退订包周期资源](https://support.huaweicloud.com/api-oce/zh-cn_topic_0082522030.html)”。](tag:hws)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RetypeVolumeRequest 请求对象
     * @return CompletableFuture<RetypeVolumeResponse>
     */
    public CompletableFuture<RetypeVolumeResponse> retypeVolumeAsync(RetypeVolumeRequest request) {
        return hcClient.asyncInvokeHttp(request, EvsMeta.retypeVolume);
    }

    /**
     * 磁盘类型变更
     *
     * 对按需或者包周期云硬盘进行磁盘类型变更。
     * [在磁盘类型变更包周期云硬盘的场景下：](tag:hws)
     * - [如果您需要查看订单可用的优惠券，请参考\&quot;[查询订单可用优惠券](https://support.huaweicloud.com/api-oce/zh-cn_topic_0092953630.html)\&quot;。](tag:hws)
     * - [如果您需要支付订单，请参考\&quot;[支付包周期产品订单](https://support.huaweicloud.com/api-oce/api_order_00030.html)\&quot;。](tag:hws)
     * - [如果您需要查询订单的资源开通详情，请参考\&quot;[查询订单的资源开通详情](https://support.huaweicloud.com/api-oce/api_order_00001.html)\&quot;。](tag:hws)
     * - [如果您需要退订该包周期资源，请参考“[退订包周期资源](https://support.huaweicloud.com/api-oce/zh-cn_topic_0082522030.html)”。](tag:hws)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RetypeVolumeRequest 请求对象
     * @return AsyncInvoker<RetypeVolumeRequest, RetypeVolumeResponse>
     */
    public AsyncInvoker<RetypeVolumeRequest, RetypeVolumeResponse> retypeVolumeAsyncInvoker(
        RetypeVolumeRequest request) {
        return new AsyncInvoker<>(request, EvsMeta.retypeVolume, hcClient);
    }

    /**
     * 还原回收站中单个云硬盘
     *
     * 还原回收站中单个云硬盘。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RevertVolumeInRecycleRequest 请求对象
     * @return CompletableFuture<RevertVolumeInRecycleResponse>
     */
    public CompletableFuture<RevertVolumeInRecycleResponse> revertVolumeInRecycleAsync(
        RevertVolumeInRecycleRequest request) {
        return hcClient.asyncInvokeHttp(request, EvsMeta.revertVolumeInRecycle);
    }

    /**
     * 还原回收站中单个云硬盘
     *
     * 还原回收站中单个云硬盘。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RevertVolumeInRecycleRequest 请求对象
     * @return AsyncInvoker<RevertVolumeInRecycleRequest, RevertVolumeInRecycleResponse>
     */
    public AsyncInvoker<RevertVolumeInRecycleRequest, RevertVolumeInRecycleResponse> revertVolumeInRecycleAsyncInvoker(
        RevertVolumeInRecycleRequest request) {
        return new AsyncInvoker<>(request, EvsMeta.revertVolumeInRecycle, hcClient);
    }

    /**
     * 回滚快照到云硬盘
     *
     * 将快照数据回滚到云硬盘。支持企业项目授权功能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RollbackSnapshotRequest 请求对象
     * @return CompletableFuture<RollbackSnapshotResponse>
     */
    public CompletableFuture<RollbackSnapshotResponse> rollbackSnapshotAsync(RollbackSnapshotRequest request) {
        return hcClient.asyncInvokeHttp(request, EvsMeta.rollbackSnapshot);
    }

    /**
     * 回滚快照到云硬盘
     *
     * 将快照数据回滚到云硬盘。支持企业项目授权功能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RollbackSnapshotRequest 请求对象
     * @return AsyncInvoker<RollbackSnapshotRequest, RollbackSnapshotResponse>
     */
    public AsyncInvoker<RollbackSnapshotRequest, RollbackSnapshotResponse> rollbackSnapshotAsyncInvoker(
        RollbackSnapshotRequest request) {
        return new AsyncInvoker<>(request, EvsMeta.rollbackSnapshot, hcClient);
    }

    /**
     * 快照回滚
     *
     * 将快照数据回滚到云硬盘。标准快照当前只在部分区域支持，具体的区域列表请通过控制台查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RollbackStandardSnapshotRequest 请求对象
     * @return CompletableFuture<RollbackStandardSnapshotResponse>
     */
    public CompletableFuture<RollbackStandardSnapshotResponse> rollbackStandardSnapshotAsync(
        RollbackStandardSnapshotRequest request) {
        return hcClient.asyncInvokeHttp(request, EvsMeta.rollbackStandardSnapshot);
    }

    /**
     * 快照回滚
     *
     * 将快照数据回滚到云硬盘。标准快照当前只在部分区域支持，具体的区域列表请通过控制台查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RollbackStandardSnapshotRequest 请求对象
     * @return AsyncInvoker<RollbackStandardSnapshotRequest, RollbackStandardSnapshotResponse>
     */
    public AsyncInvoker<RollbackStandardSnapshotRequest, RollbackStandardSnapshotResponse> rollbackStandardSnapshotAsyncInvoker(
        RollbackStandardSnapshotRequest request) {
        return new AsyncInvoker<>(request, EvsMeta.rollbackStandardSnapshot, hcClient);
    }

    /**
     * 查询单个自动快照策略
     *
     * 查询单个自动快照策略。标准快照当前只在部分区域支持，具体的区域列表请通过控制台查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAutoSnapshotPolicyRequest 请求对象
     * @return CompletableFuture<ShowAutoSnapshotPolicyResponse>
     */
    public CompletableFuture<ShowAutoSnapshotPolicyResponse> showAutoSnapshotPolicyAsync(
        ShowAutoSnapshotPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, EvsMeta.showAutoSnapshotPolicy);
    }

    /**
     * 查询单个自动快照策略
     *
     * 查询单个自动快照策略。标准快照当前只在部分区域支持，具体的区域列表请通过控制台查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAutoSnapshotPolicyRequest 请求对象
     * @return AsyncInvoker<ShowAutoSnapshotPolicyRequest, ShowAutoSnapshotPolicyResponse>
     */
    public AsyncInvoker<ShowAutoSnapshotPolicyRequest, ShowAutoSnapshotPolicyResponse> showAutoSnapshotPolicyAsyncInvoker(
        ShowAutoSnapshotPolicyRequest request) {
        return new AsyncInvoker<>(request, EvsMeta.showAutoSnapshotPolicy, hcClient);
    }

    /**
     * 查询job的状态
     *
     * 查询Job的执行状态。
     * 可用于查询创建云硬盘，扩容云硬盘，删除云硬盘等API的执行状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowJobRequest 请求对象
     * @return CompletableFuture<ShowJobResponse>
     */
    public CompletableFuture<ShowJobResponse> showJobAsync(ShowJobRequest request) {
        return hcClient.asyncInvokeHttp(request, EvsMeta.showJob);
    }

    /**
     * 查询job的状态
     *
     * 查询Job的执行状态。
     * 可用于查询创建云硬盘，扩容云硬盘，删除云硬盘等API的执行状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowJobRequest 请求对象
     * @return AsyncInvoker<ShowJobRequest, ShowJobResponse>
     */
    public AsyncInvoker<ShowJobRequest, ShowJobResponse> showJobAsyncInvoker(ShowJobRequest request) {
        return new AsyncInvoker<>(request, EvsMeta.showJob, hcClient);
    }

    /**
     * 查询回收站策略
     *
     * 查询回收站策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRecyclePolicyRequest 请求对象
     * @return CompletableFuture<ShowRecyclePolicyResponse>
     */
    public CompletableFuture<ShowRecyclePolicyResponse> showRecyclePolicyAsync(ShowRecyclePolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, EvsMeta.showRecyclePolicy);
    }

    /**
     * 查询回收站策略
     *
     * 查询回收站策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRecyclePolicyRequest 请求对象
     * @return AsyncInvoker<ShowRecyclePolicyRequest, ShowRecyclePolicyResponse>
     */
    public AsyncInvoker<ShowRecyclePolicyRequest, ShowRecyclePolicyResponse> showRecyclePolicyAsyncInvoker(
        ShowRecyclePolicyRequest request) {
        return new AsyncInvoker<>(request, EvsMeta.showRecyclePolicy, hcClient);
    }

    /**
     * 查询单个云硬盘快照详情
     *
     * 查询单个云硬盘快照信息。支持企业项目授权功能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSnapshotRequest 请求对象
     * @return CompletableFuture<ShowSnapshotResponse>
     */
    public CompletableFuture<ShowSnapshotResponse> showSnapshotAsync(ShowSnapshotRequest request) {
        return hcClient.asyncInvokeHttp(request, EvsMeta.showSnapshot);
    }

    /**
     * 查询单个云硬盘快照详情
     *
     * 查询单个云硬盘快照信息。支持企业项目授权功能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSnapshotRequest 请求对象
     * @return AsyncInvoker<ShowSnapshotRequest, ShowSnapshotResponse>
     */
    public AsyncInvoker<ShowSnapshotRequest, ShowSnapshotResponse> showSnapshotAsyncInvoker(
        ShowSnapshotRequest request) {
        return new AsyncInvoker<>(request, EvsMeta.showSnapshot, hcClient);
    }

    /**
     * 查询单个快照一致性组
     *
     * 查询单个快照一致性组。标准快照当前只在部分区域支持，具体的区域列表请通过控制台查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSnapshotGroupRequest 请求对象
     * @return CompletableFuture<ShowSnapshotGroupResponse>
     */
    public CompletableFuture<ShowSnapshotGroupResponse> showSnapshotGroupAsync(ShowSnapshotGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, EvsMeta.showSnapshotGroup);
    }

    /**
     * 查询单个快照一致性组
     *
     * 查询单个快照一致性组。标准快照当前只在部分区域支持，具体的区域列表请通过控制台查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSnapshotGroupRequest 请求对象
     * @return AsyncInvoker<ShowSnapshotGroupRequest, ShowSnapshotGroupResponse>
     */
    public AsyncInvoker<ShowSnapshotGroupRequest, ShowSnapshotGroupResponse> showSnapshotGroupAsyncInvoker(
        ShowSnapshotGroupRequest request) {
        return new AsyncInvoker<>(request, EvsMeta.showSnapshotGroup, hcClient);
    }

    /**
     * 查询单个快照信息
     *
     * 查询单个快照信息。标准快照当前只在部分区域支持，具体的区域列表请通过控制台查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowStandardSnapshotRequest 请求对象
     * @return CompletableFuture<ShowStandardSnapshotResponse>
     */
    public CompletableFuture<ShowStandardSnapshotResponse> showStandardSnapshotAsync(
        ShowStandardSnapshotRequest request) {
        return hcClient.asyncInvokeHttp(request, EvsMeta.showStandardSnapshot);
    }

    /**
     * 查询单个快照信息
     *
     * 查询单个快照信息。标准快照当前只在部分区域支持，具体的区域列表请通过控制台查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowStandardSnapshotRequest 请求对象
     * @return AsyncInvoker<ShowStandardSnapshotRequest, ShowStandardSnapshotResponse>
     */
    public AsyncInvoker<ShowStandardSnapshotRequest, ShowStandardSnapshotResponse> showStandardSnapshotAsyncInvoker(
        ShowStandardSnapshotRequest request) {
        return new AsyncInvoker<>(request, EvsMeta.showStandardSnapshot, hcClient);
    }

    /**
     * 查询单个云硬盘详情
     *
     * 查询单个云硬盘的详细信息。支持企业项目授权功能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowVolumeRequest 请求对象
     * @return CompletableFuture<ShowVolumeResponse>
     */
    public CompletableFuture<ShowVolumeResponse> showVolumeAsync(ShowVolumeRequest request) {
        return hcClient.asyncInvokeHttp(request, EvsMeta.showVolume);
    }

    /**
     * 查询单个云硬盘详情
     *
     * 查询单个云硬盘的详细信息。支持企业项目授权功能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowVolumeRequest 请求对象
     * @return AsyncInvoker<ShowVolumeRequest, ShowVolumeResponse>
     */
    public AsyncInvoker<ShowVolumeRequest, ShowVolumeResponse> showVolumeAsyncInvoker(ShowVolumeRequest request) {
        return new AsyncInvoker<>(request, EvsMeta.showVolume, hcClient);
    }

    /**
     * 查询回收站中单个云硬盘详情
     *
     * 查询回收站中单个云硬盘的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowVolumeInRecycleRequest 请求对象
     * @return CompletableFuture<ShowVolumeInRecycleResponse>
     */
    public CompletableFuture<ShowVolumeInRecycleResponse> showVolumeInRecycleAsync(ShowVolumeInRecycleRequest request) {
        return hcClient.asyncInvokeHttp(request, EvsMeta.showVolumeInRecycle);
    }

    /**
     * 查询回收站中单个云硬盘详情
     *
     * 查询回收站中单个云硬盘的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowVolumeInRecycleRequest 请求对象
     * @return AsyncInvoker<ShowVolumeInRecycleRequest, ShowVolumeInRecycleResponse>
     */
    public AsyncInvoker<ShowVolumeInRecycleRequest, ShowVolumeInRecycleResponse> showVolumeInRecycleAsyncInvoker(
        ShowVolumeInRecycleRequest request) {
        return new AsyncInvoker<>(request, EvsMeta.showVolumeInRecycle, hcClient);
    }

    /**
     * 查询云硬盘标签
     *
     * 查询指定云硬盘的标签信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowVolumeTagsRequest 请求对象
     * @return CompletableFuture<ShowVolumeTagsResponse>
     */
    public CompletableFuture<ShowVolumeTagsResponse> showVolumeTagsAsync(ShowVolumeTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, EvsMeta.showVolumeTags);
    }

    /**
     * 查询云硬盘标签
     *
     * 查询指定云硬盘的标签信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowVolumeTagsRequest 请求对象
     * @return AsyncInvoker<ShowVolumeTagsRequest, ShowVolumeTagsResponse>
     */
    public AsyncInvoker<ShowVolumeTagsRequest, ShowVolumeTagsResponse> showVolumeTagsAsyncInvoker(
        ShowVolumeTagsRequest request) {
        return new AsyncInvoker<>(request, EvsMeta.showVolumeTags, hcClient);
    }

    /**
     * 退订包周期计费模式的云硬盘
     *
     * 退订包周期计费模式的云硬盘，有如下约束：
     * -  系统盘、启动盘不可使用当前接口退订，必须和弹性云服务器一起退订
     * -  接口的请求body体最多可以传60个云硬盘id
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UnsubscribePostpaidVolumeRequest 请求对象
     * @return CompletableFuture<UnsubscribePostpaidVolumeResponse>
     */
    public CompletableFuture<UnsubscribePostpaidVolumeResponse> unsubscribePostpaidVolumeAsync(
        UnsubscribePostpaidVolumeRequest request) {
        return hcClient.asyncInvokeHttp(request, EvsMeta.unsubscribePostpaidVolume);
    }

    /**
     * 退订包周期计费模式的云硬盘
     *
     * 退订包周期计费模式的云硬盘，有如下约束：
     * -  系统盘、启动盘不可使用当前接口退订，必须和弹性云服务器一起退订
     * -  接口的请求body体最多可以传60个云硬盘id
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UnsubscribePostpaidVolumeRequest 请求对象
     * @return AsyncInvoker<UnsubscribePostpaidVolumeRequest, UnsubscribePostpaidVolumeResponse>
     */
    public AsyncInvoker<UnsubscribePostpaidVolumeRequest, UnsubscribePostpaidVolumeResponse> unsubscribePostpaidVolumeAsyncInvoker(
        UnsubscribePostpaidVolumeRequest request) {
        return new AsyncInvoker<>(request, EvsMeta.unsubscribePostpaidVolume, hcClient);
    }

    /**
     * 更新自动快照策略
     *
     * 更新自动快照策略。标准快照当前只在部分区域支持，具体的区域列表请通过控制台查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAutoSnapshotPolicyRequest 请求对象
     * @return CompletableFuture<UpdateAutoSnapshotPolicyResponse>
     */
    public CompletableFuture<UpdateAutoSnapshotPolicyResponse> updateAutoSnapshotPolicyAsync(
        UpdateAutoSnapshotPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, EvsMeta.updateAutoSnapshotPolicy);
    }

    /**
     * 更新自动快照策略
     *
     * 更新自动快照策略。标准快照当前只在部分区域支持，具体的区域列表请通过控制台查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAutoSnapshotPolicyRequest 请求对象
     * @return AsyncInvoker<UpdateAutoSnapshotPolicyRequest, UpdateAutoSnapshotPolicyResponse>
     */
    public AsyncInvoker<UpdateAutoSnapshotPolicyRequest, UpdateAutoSnapshotPolicyResponse> updateAutoSnapshotPolicyAsyncInvoker(
        UpdateAutoSnapshotPolicyRequest request) {
        return new AsyncInvoker<>(request, EvsMeta.updateAutoSnapshotPolicy, hcClient);
    }

    /**
     * 更新回收站策略
     *
     * 更新回收站策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateRecyclePolicyRequest 请求对象
     * @return CompletableFuture<UpdateRecyclePolicyResponse>
     */
    public CompletableFuture<UpdateRecyclePolicyResponse> updateRecyclePolicyAsync(UpdateRecyclePolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, EvsMeta.updateRecyclePolicy);
    }

    /**
     * 更新回收站策略
     *
     * 更新回收站策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateRecyclePolicyRequest 请求对象
     * @return AsyncInvoker<UpdateRecyclePolicyRequest, UpdateRecyclePolicyResponse>
     */
    public AsyncInvoker<UpdateRecyclePolicyRequest, UpdateRecyclePolicyResponse> updateRecyclePolicyAsyncInvoker(
        UpdateRecyclePolicyRequest request) {
        return new AsyncInvoker<>(request, EvsMeta.updateRecyclePolicy, hcClient);
    }

    /**
     * 更新云硬盘快照
     *
     * 更新云硬盘快照。支持企业项目授权功能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSnapshotRequest 请求对象
     * @return CompletableFuture<UpdateSnapshotResponse>
     */
    public CompletableFuture<UpdateSnapshotResponse> updateSnapshotAsync(UpdateSnapshotRequest request) {
        return hcClient.asyncInvokeHttp(request, EvsMeta.updateSnapshot);
    }

    /**
     * 更新云硬盘快照
     *
     * 更新云硬盘快照。支持企业项目授权功能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSnapshotRequest 请求对象
     * @return AsyncInvoker<UpdateSnapshotRequest, UpdateSnapshotResponse>
     */
    public AsyncInvoker<UpdateSnapshotRequest, UpdateSnapshotResponse> updateSnapshotAsyncInvoker(
        UpdateSnapshotRequest request) {
        return new AsyncInvoker<>(request, EvsMeta.updateSnapshot, hcClient);
    }

    /**
     * 更新快照一致性组
     *
     * 更新快照一致性组。标准快照当前只在部分区域支持，具体的区域列表请通过控制台查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSnapshotGroupRequest 请求对象
     * @return CompletableFuture<UpdateSnapshotGroupResponse>
     */
    public CompletableFuture<UpdateSnapshotGroupResponse> updateSnapshotGroupAsync(UpdateSnapshotGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, EvsMeta.updateSnapshotGroup);
    }

    /**
     * 更新快照一致性组
     *
     * 更新快照一致性组。标准快照当前只在部分区域支持，具体的区域列表请通过控制台查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSnapshotGroupRequest 请求对象
     * @return AsyncInvoker<UpdateSnapshotGroupRequest, UpdateSnapshotGroupResponse>
     */
    public AsyncInvoker<UpdateSnapshotGroupRequest, UpdateSnapshotGroupResponse> updateSnapshotGroupAsyncInvoker(
        UpdateSnapshotGroupRequest request) {
        return new AsyncInvoker<>(request, EvsMeta.updateSnapshotGroup, hcClient);
    }

    /**
     * 更新快照信息
     *
     * 更新快照信息。标准快照当前只在部分区域支持，具体的区域列表请通过控制台查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateStandardSnapshotRequest 请求对象
     * @return CompletableFuture<UpdateStandardSnapshotResponse>
     */
    public CompletableFuture<UpdateStandardSnapshotResponse> updateStandardSnapshotAsync(
        UpdateStandardSnapshotRequest request) {
        return hcClient.asyncInvokeHttp(request, EvsMeta.updateStandardSnapshot);
    }

    /**
     * 更新快照信息
     *
     * 更新快照信息。标准快照当前只在部分区域支持，具体的区域列表请通过控制台查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateStandardSnapshotRequest 请求对象
     * @return AsyncInvoker<UpdateStandardSnapshotRequest, UpdateStandardSnapshotResponse>
     */
    public AsyncInvoker<UpdateStandardSnapshotRequest, UpdateStandardSnapshotResponse> updateStandardSnapshotAsyncInvoker(
        UpdateStandardSnapshotRequest request) {
        return new AsyncInvoker<>(request, EvsMeta.updateStandardSnapshot, hcClient);
    }

    /**
     * 更新云硬盘
     *
     * 更新一个云硬盘的名称和描述。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateVolumeRequest 请求对象
     * @return CompletableFuture<UpdateVolumeResponse>
     */
    public CompletableFuture<UpdateVolumeResponse> updateVolumeAsync(UpdateVolumeRequest request) {
        return hcClient.asyncInvokeHttp(request, EvsMeta.updateVolume);
    }

    /**
     * 更新云硬盘
     *
     * 更新一个云硬盘的名称和描述。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateVolumeRequest 请求对象
     * @return AsyncInvoker<UpdateVolumeRequest, UpdateVolumeResponse>
     */
    public AsyncInvoker<UpdateVolumeRequest, UpdateVolumeResponse> updateVolumeAsyncInvoker(
        UpdateVolumeRequest request) {
        return new AsyncInvoker<>(request, EvsMeta.updateVolume, hcClient);
    }

    /**
     * 查询接口版本信息列表
     *
     * 查询接口版本信息列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVersionsRequest 请求对象
     * @return CompletableFuture<ListVersionsResponse>
     */
    public CompletableFuture<ListVersionsResponse> listVersionsAsync(ListVersionsRequest request) {
        return hcClient.asyncInvokeHttp(request, EvsMeta.listVersions);
    }

    /**
     * 查询接口版本信息列表
     *
     * 查询接口版本信息列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVersionsRequest 请求对象
     * @return AsyncInvoker<ListVersionsRequest, ListVersionsResponse>
     */
    public AsyncInvoker<ListVersionsRequest, ListVersionsResponse> listVersionsAsyncInvoker(
        ListVersionsRequest request) {
        return new AsyncInvoker<>(request, EvsMeta.listVersions, hcClient);
    }

    /**
     * 查询API接口的版本信息
     *
     * 查询接口的指定版本信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowVersionRequest 请求对象
     * @return CompletableFuture<ShowVersionResponse>
     */
    public CompletableFuture<ShowVersionResponse> showVersionAsync(ShowVersionRequest request) {
        return hcClient.asyncInvokeHttp(request, EvsMeta.showVersion);
    }

    /**
     * 查询API接口的版本信息
     *
     * 查询接口的指定版本信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowVersionRequest 请求对象
     * @return AsyncInvoker<ShowVersionRequest, ShowVersionResponse>
     */
    public AsyncInvoker<ShowVersionRequest, ShowVersionResponse> showVersionAsyncInvoker(ShowVersionRequest request) {
        return new AsyncInvoker<>(request, EvsMeta.showVersion, hcClient);
    }

}
