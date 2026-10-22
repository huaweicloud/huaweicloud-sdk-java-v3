package com.huaweicloud.sdk.evs.v2;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
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

public class EvsClient {

    protected HcClient hcClient;

    public EvsClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<EvsClient> newBuilder() {
        ClientBuilder<EvsClient> clientBuilder = new ClientBuilder<>(EvsClient::new);
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
     * @return AssociateAutoSnapshotPolicyResponse
     */
    public AssociateAutoSnapshotPolicyResponse associateAutoSnapshotPolicy(AssociateAutoSnapshotPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, EvsMeta.associateAutoSnapshotPolicy);
    }

    /**
     * 绑定自动快照策略
     *
     * 绑定自动快照策略。标准快照当前只在部分区域支持，具体的区域列表请通过控制台查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AssociateAutoSnapshotPolicyRequest 请求对象
     * @return SyncInvoker<AssociateAutoSnapshotPolicyRequest, AssociateAutoSnapshotPolicyResponse>
     */
    public SyncInvoker<AssociateAutoSnapshotPolicyRequest, AssociateAutoSnapshotPolicyResponse> associateAutoSnapshotPolicyInvoker(
        AssociateAutoSnapshotPolicyRequest request) {
        return new SyncInvoker<>(request, EvsMeta.associateAutoSnapshotPolicy, hcClient);
    }

    /**
     * 为指定快照组添加标签
     *
     * 为指定快照组添加标签。标准快照当前只在部分区域支持，具体的区域列表请通过控制台查询详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateSnapshotGroupTagRequest 请求对象
     * @return BatchCreateSnapshotGroupTagResponse
     */
    public BatchCreateSnapshotGroupTagResponse batchCreateSnapshotGroupTag(BatchCreateSnapshotGroupTagRequest request) {
        return hcClient.syncInvokeHttp(request, EvsMeta.batchCreateSnapshotGroupTag);
    }

    /**
     * 为指定快照组添加标签
     *
     * 为指定快照组添加标签。标准快照当前只在部分区域支持，具体的区域列表请通过控制台查询详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateSnapshotGroupTagRequest 请求对象
     * @return SyncInvoker<BatchCreateSnapshotGroupTagRequest, BatchCreateSnapshotGroupTagResponse>
     */
    public SyncInvoker<BatchCreateSnapshotGroupTagRequest, BatchCreateSnapshotGroupTagResponse> batchCreateSnapshotGroupTagInvoker(
        BatchCreateSnapshotGroupTagRequest request) {
        return new SyncInvoker<>(request, EvsMeta.batchCreateSnapshotGroupTag, hcClient);
    }

    /**
     * 为指定快照添加标签
     *
     * 为指定快照添加标签。标准快照当前只在部分区域支持，具体的区域列表请通过控制台查询详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateSnapshotTagsRequest 请求对象
     * @return BatchCreateSnapshotTagsResponse
     */
    public BatchCreateSnapshotTagsResponse batchCreateSnapshotTags(BatchCreateSnapshotTagsRequest request) {
        return hcClient.syncInvokeHttp(request, EvsMeta.batchCreateSnapshotTags);
    }

    /**
     * 为指定快照添加标签
     *
     * 为指定快照添加标签。标准快照当前只在部分区域支持，具体的区域列表请通过控制台查询详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateSnapshotTagsRequest 请求对象
     * @return SyncInvoker<BatchCreateSnapshotTagsRequest, BatchCreateSnapshotTagsResponse>
     */
    public SyncInvoker<BatchCreateSnapshotTagsRequest, BatchCreateSnapshotTagsResponse> batchCreateSnapshotTagsInvoker(
        BatchCreateSnapshotTagsRequest request) {
        return new SyncInvoker<>(request, EvsMeta.batchCreateSnapshotTags, hcClient);
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
     * @return BatchCreateVolumeTagsResponse
     */
    public BatchCreateVolumeTagsResponse batchCreateVolumeTags(BatchCreateVolumeTagsRequest request) {
        return hcClient.syncInvokeHttp(request, EvsMeta.batchCreateVolumeTags);
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
     * @return SyncInvoker<BatchCreateVolumeTagsRequest, BatchCreateVolumeTagsResponse>
     */
    public SyncInvoker<BatchCreateVolumeTagsRequest, BatchCreateVolumeTagsResponse> batchCreateVolumeTagsInvoker(
        BatchCreateVolumeTagsRequest request) {
        return new SyncInvoker<>(request, EvsMeta.batchCreateVolumeTags, hcClient);
    }

    /**
     * 为指定快照组删除标签
     *
     * 为指定快照组删除标签。标准快照当前只在部分区域支持，具体的区域列表请通过控制台查询详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteSnapshotGroupTagRequest 请求对象
     * @return BatchDeleteSnapshotGroupTagResponse
     */
    public BatchDeleteSnapshotGroupTagResponse batchDeleteSnapshotGroupTag(BatchDeleteSnapshotGroupTagRequest request) {
        return hcClient.syncInvokeHttp(request, EvsMeta.batchDeleteSnapshotGroupTag);
    }

    /**
     * 为指定快照组删除标签
     *
     * 为指定快照组删除标签。标准快照当前只在部分区域支持，具体的区域列表请通过控制台查询详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteSnapshotGroupTagRequest 请求对象
     * @return SyncInvoker<BatchDeleteSnapshotGroupTagRequest, BatchDeleteSnapshotGroupTagResponse>
     */
    public SyncInvoker<BatchDeleteSnapshotGroupTagRequest, BatchDeleteSnapshotGroupTagResponse> batchDeleteSnapshotGroupTagInvoker(
        BatchDeleteSnapshotGroupTagRequest request) {
        return new SyncInvoker<>(request, EvsMeta.batchDeleteSnapshotGroupTag, hcClient);
    }

    /**
     * 为指定快照删除标签
     *
     * 为指定快照删除标签。标准快照当前只在部分区域支持，具体的区域列表请通过控制台查询详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteSnapshotTagsRequest 请求对象
     * @return BatchDeleteSnapshotTagsResponse
     */
    public BatchDeleteSnapshotTagsResponse batchDeleteSnapshotTags(BatchDeleteSnapshotTagsRequest request) {
        return hcClient.syncInvokeHttp(request, EvsMeta.batchDeleteSnapshotTags);
    }

    /**
     * 为指定快照删除标签
     *
     * 为指定快照删除标签。标准快照当前只在部分区域支持，具体的区域列表请通过控制台查询详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteSnapshotTagsRequest 请求对象
     * @return SyncInvoker<BatchDeleteSnapshotTagsRequest, BatchDeleteSnapshotTagsResponse>
     */
    public SyncInvoker<BatchDeleteSnapshotTagsRequest, BatchDeleteSnapshotTagsResponse> batchDeleteSnapshotTagsInvoker(
        BatchDeleteSnapshotTagsRequest request) {
        return new SyncInvoker<>(request, EvsMeta.batchDeleteSnapshotTags, hcClient);
    }

    /**
     * 为指定云硬盘批量删除标签
     *
     * 为指定云硬盘批量删除标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteVolumeTagsRequest 请求对象
     * @return BatchDeleteVolumeTagsResponse
     */
    public BatchDeleteVolumeTagsResponse batchDeleteVolumeTags(BatchDeleteVolumeTagsRequest request) {
        return hcClient.syncInvokeHttp(request, EvsMeta.batchDeleteVolumeTags);
    }

    /**
     * 为指定云硬盘批量删除标签
     *
     * 为指定云硬盘批量删除标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteVolumeTagsRequest 请求对象
     * @return SyncInvoker<BatchDeleteVolumeTagsRequest, BatchDeleteVolumeTagsResponse>
     */
    public SyncInvoker<BatchDeleteVolumeTagsRequest, BatchDeleteVolumeTagsResponse> batchDeleteVolumeTagsInvoker(
        BatchDeleteVolumeTagsRequest request) {
        return new SyncInvoker<>(request, EvsMeta.batchDeleteVolumeTags, hcClient);
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
     * @return BatchResizeVolumesResponse
     */
    public BatchResizeVolumesResponse batchResizeVolumes(BatchResizeVolumesRequest request) {
        return hcClient.syncInvokeHttp(request, EvsMeta.batchResizeVolumes);
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
     * @return SyncInvoker<BatchResizeVolumesRequest, BatchResizeVolumesResponse>
     */
    public SyncInvoker<BatchResizeVolumesRequest, BatchResizeVolumesResponse> batchResizeVolumesInvoker(
        BatchResizeVolumesRequest request) {
        return new SyncInvoker<>(request, EvsMeta.batchResizeVolumes, hcClient);
    }

    /**
     * 修改云硬盘计费模式
     *
     * 将挂载状态下的云硬盘的计费模式有按需转成包周期，且到期时间和挂载的虚拟机保持一致。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeVolumeChargeModeRequest 请求对象
     * @return ChangeVolumeChargeModeResponse
     */
    public ChangeVolumeChargeModeResponse changeVolumeChargeMode(ChangeVolumeChargeModeRequest request) {
        return hcClient.syncInvokeHttp(request, EvsMeta.changeVolumeChargeMode);
    }

    /**
     * 修改云硬盘计费模式
     *
     * 将挂载状态下的云硬盘的计费模式有按需转成包周期，且到期时间和挂载的虚拟机保持一致。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeVolumeChargeModeRequest 请求对象
     * @return SyncInvoker<ChangeVolumeChargeModeRequest, ChangeVolumeChargeModeResponse>
     */
    public SyncInvoker<ChangeVolumeChargeModeRequest, ChangeVolumeChargeModeResponse> changeVolumeChargeModeInvoker(
        ChangeVolumeChargeModeRequest request) {
        return new SyncInvoker<>(request, EvsMeta.changeVolumeChargeMode, hcClient);
    }

    /**
     * 接受云硬盘过户
     *
     * 通过云硬盘过户记录ID以及身份认证密钥来接受云硬盘过户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CinderAcceptVolumeTransferRequest 请求对象
     * @return CinderAcceptVolumeTransferResponse
     */
    public CinderAcceptVolumeTransferResponse cinderAcceptVolumeTransfer(CinderAcceptVolumeTransferRequest request) {
        return hcClient.syncInvokeHttp(request, EvsMeta.cinderAcceptVolumeTransfer);
    }

    /**
     * 接受云硬盘过户
     *
     * 通过云硬盘过户记录ID以及身份认证密钥来接受云硬盘过户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CinderAcceptVolumeTransferRequest 请求对象
     * @return SyncInvoker<CinderAcceptVolumeTransferRequest, CinderAcceptVolumeTransferResponse>
     */
    public SyncInvoker<CinderAcceptVolumeTransferRequest, CinderAcceptVolumeTransferResponse> cinderAcceptVolumeTransferInvoker(
        CinderAcceptVolumeTransferRequest request) {
        return new SyncInvoker<>(request, EvsMeta.cinderAcceptVolumeTransfer, hcClient);
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
     * @return CinderCreateVolumeTransferResponse
     */
    public CinderCreateVolumeTransferResponse cinderCreateVolumeTransfer(CinderCreateVolumeTransferRequest request) {
        return hcClient.syncInvokeHttp(request, EvsMeta.cinderCreateVolumeTransfer);
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
     * @return SyncInvoker<CinderCreateVolumeTransferRequest, CinderCreateVolumeTransferResponse>
     */
    public SyncInvoker<CinderCreateVolumeTransferRequest, CinderCreateVolumeTransferResponse> cinderCreateVolumeTransferInvoker(
        CinderCreateVolumeTransferRequest request) {
        return new SyncInvoker<>(request, EvsMeta.cinderCreateVolumeTransfer, hcClient);
    }

    /**
     * 删除云硬盘过户
     *
     * 当云硬盘过户未被接受时，您可以删除云硬盘过户记录，接受后则无法执行删除操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CinderDeleteVolumeTransferRequest 请求对象
     * @return CinderDeleteVolumeTransferResponse
     */
    public CinderDeleteVolumeTransferResponse cinderDeleteVolumeTransfer(CinderDeleteVolumeTransferRequest request) {
        return hcClient.syncInvokeHttp(request, EvsMeta.cinderDeleteVolumeTransfer);
    }

    /**
     * 删除云硬盘过户
     *
     * 当云硬盘过户未被接受时，您可以删除云硬盘过户记录，接受后则无法执行删除操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CinderDeleteVolumeTransferRequest 请求对象
     * @return SyncInvoker<CinderDeleteVolumeTransferRequest, CinderDeleteVolumeTransferResponse>
     */
    public SyncInvoker<CinderDeleteVolumeTransferRequest, CinderDeleteVolumeTransferResponse> cinderDeleteVolumeTransferInvoker(
        CinderDeleteVolumeTransferRequest request) {
        return new SyncInvoker<>(request, EvsMeta.cinderDeleteVolumeTransfer, hcClient);
    }

    /**
     * 查询所有的可用分区信息
     *
     * 查询所有的可用分区信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CinderListAvailabilityZonesRequest 请求对象
     * @return CinderListAvailabilityZonesResponse
     */
    public CinderListAvailabilityZonesResponse cinderListAvailabilityZones(CinderListAvailabilityZonesRequest request) {
        return hcClient.syncInvokeHttp(request, EvsMeta.cinderListAvailabilityZones);
    }

    /**
     * 查询所有的可用分区信息
     *
     * 查询所有的可用分区信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CinderListAvailabilityZonesRequest 请求对象
     * @return SyncInvoker<CinderListAvailabilityZonesRequest, CinderListAvailabilityZonesResponse>
     */
    public SyncInvoker<CinderListAvailabilityZonesRequest, CinderListAvailabilityZonesResponse> cinderListAvailabilityZonesInvoker(
        CinderListAvailabilityZonesRequest request) {
        return new SyncInvoker<>(request, EvsMeta.cinderListAvailabilityZones, hcClient);
    }

    /**
     * 查询租户的详细配额
     *
     * 查询租户的详细配额。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CinderListQuotasRequest 请求对象
     * @return CinderListQuotasResponse
     */
    public CinderListQuotasResponse cinderListQuotas(CinderListQuotasRequest request) {
        return hcClient.syncInvokeHttp(request, EvsMeta.cinderListQuotas);
    }

    /**
     * 查询租户的详细配额
     *
     * 查询租户的详细配额。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CinderListQuotasRequest 请求对象
     * @return SyncInvoker<CinderListQuotasRequest, CinderListQuotasResponse>
     */
    public SyncInvoker<CinderListQuotasRequest, CinderListQuotasResponse> cinderListQuotasInvoker(
        CinderListQuotasRequest request) {
        return new SyncInvoker<>(request, EvsMeta.cinderListQuotas, hcClient);
    }

    /**
     * 查询云硬盘过户记录列表概要
     *
     * 查询当前租户下所有云硬盘的过户记录列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CinderListVolumeTransfersRequest 请求对象
     * @return CinderListVolumeTransfersResponse
     */
    public CinderListVolumeTransfersResponse cinderListVolumeTransfers(CinderListVolumeTransfersRequest request) {
        return hcClient.syncInvokeHttp(request, EvsMeta.cinderListVolumeTransfers);
    }

    /**
     * 查询云硬盘过户记录列表概要
     *
     * 查询当前租户下所有云硬盘的过户记录列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CinderListVolumeTransfersRequest 请求对象
     * @return SyncInvoker<CinderListVolumeTransfersRequest, CinderListVolumeTransfersResponse>
     */
    public SyncInvoker<CinderListVolumeTransfersRequest, CinderListVolumeTransfersResponse> cinderListVolumeTransfersInvoker(
        CinderListVolumeTransfersRequest request) {
        return new SyncInvoker<>(request, EvsMeta.cinderListVolumeTransfers, hcClient);
    }

    /**
     * 查询云硬盘类型列表
     *
     * 查询云硬盘类型列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CinderListVolumeTypesRequest 请求对象
     * @return CinderListVolumeTypesResponse
     */
    public CinderListVolumeTypesResponse cinderListVolumeTypes(CinderListVolumeTypesRequest request) {
        return hcClient.syncInvokeHttp(request, EvsMeta.cinderListVolumeTypes);
    }

    /**
     * 查询云硬盘类型列表
     *
     * 查询云硬盘类型列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CinderListVolumeTypesRequest 请求对象
     * @return SyncInvoker<CinderListVolumeTypesRequest, CinderListVolumeTypesResponse>
     */
    public SyncInvoker<CinderListVolumeTypesRequest, CinderListVolumeTypesResponse> cinderListVolumeTypesInvoker(
        CinderListVolumeTypesRequest request) {
        return new SyncInvoker<>(request, EvsMeta.cinderListVolumeTypes, hcClient);
    }

    /**
     * 查询单个云硬盘过户记录详情
     *
     * 查询单个云硬盘的过户记录详情，比如过户记录创建时间、ID以及名称等信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CinderShowVolumeTransferRequest 请求对象
     * @return CinderShowVolumeTransferResponse
     */
    public CinderShowVolumeTransferResponse cinderShowVolumeTransfer(CinderShowVolumeTransferRequest request) {
        return hcClient.syncInvokeHttp(request, EvsMeta.cinderShowVolumeTransfer);
    }

    /**
     * 查询单个云硬盘过户记录详情
     *
     * 查询单个云硬盘的过户记录详情，比如过户记录创建时间、ID以及名称等信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CinderShowVolumeTransferRequest 请求对象
     * @return SyncInvoker<CinderShowVolumeTransferRequest, CinderShowVolumeTransferResponse>
     */
    public SyncInvoker<CinderShowVolumeTransferRequest, CinderShowVolumeTransferResponse> cinderShowVolumeTransferInvoker(
        CinderShowVolumeTransferRequest request) {
        return new SyncInvoker<>(request, EvsMeta.cinderShowVolumeTransfer, hcClient);
    }

    /**
     * 查询自动快照策略总数
     *
     * 查询自动快照策略总数。标准快照当前只在部分区域支持，具体的区域列表请通过控制台查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CountAutoSnapshotPoliciesRequest 请求对象
     * @return CountAutoSnapshotPoliciesResponse
     */
    public CountAutoSnapshotPoliciesResponse countAutoSnapshotPolicies(CountAutoSnapshotPoliciesRequest request) {
        return hcClient.syncInvokeHttp(request, EvsMeta.countAutoSnapshotPolicies);
    }

    /**
     * 查询自动快照策略总数
     *
     * 查询自动快照策略总数。标准快照当前只在部分区域支持，具体的区域列表请通过控制台查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CountAutoSnapshotPoliciesRequest 请求对象
     * @return SyncInvoker<CountAutoSnapshotPoliciesRequest, CountAutoSnapshotPoliciesResponse>
     */
    public SyncInvoker<CountAutoSnapshotPoliciesRequest, CountAutoSnapshotPoliciesResponse> countAutoSnapshotPoliciesInvoker(
        CountAutoSnapshotPoliciesRequest request) {
        return new SyncInvoker<>(request, EvsMeta.countAutoSnapshotPolicies, hcClient);
    }

    /**
     * 查询快照链个数
     *
     * 查询快照链个数。标准快照当前只在部分区域支持，具体的区域列表请通过控制台查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CountSnapshotChainsRequest 请求对象
     * @return CountSnapshotChainsResponse
     */
    public CountSnapshotChainsResponse countSnapshotChains(CountSnapshotChainsRequest request) {
        return hcClient.syncInvokeHttp(request, EvsMeta.countSnapshotChains);
    }

    /**
     * 查询快照链个数
     *
     * 查询快照链个数。标准快照当前只在部分区域支持，具体的区域列表请通过控制台查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CountSnapshotChainsRequest 请求对象
     * @return SyncInvoker<CountSnapshotChainsRequest, CountSnapshotChainsResponse>
     */
    public SyncInvoker<CountSnapshotChainsRequest, CountSnapshotChainsResponse> countSnapshotChainsInvoker(
        CountSnapshotChainsRequest request) {
        return new SyncInvoker<>(request, EvsMeta.countSnapshotChains, hcClient);
    }

    /**
     * 查询快照个数
     *
     * 查询快照个数。标准快照当前只在部分区域支持，具体的区域列表请通过控制台查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CountSnapshotsRequest 请求对象
     * @return CountSnapshotsResponse
     */
    public CountSnapshotsResponse countSnapshots(CountSnapshotsRequest request) {
        return hcClient.syncInvokeHttp(request, EvsMeta.countSnapshots);
    }

    /**
     * 查询快照个数
     *
     * 查询快照个数。标准快照当前只在部分区域支持，具体的区域列表请通过控制台查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CountSnapshotsRequest 请求对象
     * @return SyncInvoker<CountSnapshotsRequest, CountSnapshotsResponse>
     */
    public SyncInvoker<CountSnapshotsRequest, CountSnapshotsResponse> countSnapshotsInvoker(
        CountSnapshotsRequest request) {
        return new SyncInvoker<>(request, EvsMeta.countSnapshots, hcClient);
    }

    /**
     * 查询快照一致性组个数
     *
     * 查询快照一致性组个数。标准快照当前只在部分区域支持，具体的区域列表请通过控制台查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CountSnapshotsGroupRequest 请求对象
     * @return CountSnapshotsGroupResponse
     */
    public CountSnapshotsGroupResponse countSnapshotsGroup(CountSnapshotsGroupRequest request) {
        return hcClient.syncInvokeHttp(request, EvsMeta.countSnapshotsGroup);
    }

    /**
     * 查询快照一致性组个数
     *
     * 查询快照一致性组个数。标准快照当前只在部分区域支持，具体的区域列表请通过控制台查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CountSnapshotsGroupRequest 请求对象
     * @return SyncInvoker<CountSnapshotsGroupRequest, CountSnapshotsGroupResponse>
     */
    public SyncInvoker<CountSnapshotsGroupRequest, CountSnapshotsGroupResponse> countSnapshotsGroupInvoker(
        CountSnapshotsGroupRequest request) {
        return new SyncInvoker<>(request, EvsMeta.countSnapshotsGroup, hcClient);
    }

    /**
     * 创建自动快照策略
     *
     * 创建自动快照策略。标准快照当前只在部分区域支持，具体的区域列表请通过控制台查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAutoSnapshotPolicyRequest 请求对象
     * @return CreateAutoSnapshotPolicyResponse
     */
    public CreateAutoSnapshotPolicyResponse createAutoSnapshotPolicy(CreateAutoSnapshotPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, EvsMeta.createAutoSnapshotPolicy);
    }

    /**
     * 创建自动快照策略
     *
     * 创建自动快照策略。标准快照当前只在部分区域支持，具体的区域列表请通过控制台查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAutoSnapshotPolicyRequest 请求对象
     * @return SyncInvoker<CreateAutoSnapshotPolicyRequest, CreateAutoSnapshotPolicyResponse>
     */
    public SyncInvoker<CreateAutoSnapshotPolicyRequest, CreateAutoSnapshotPolicyResponse> createAutoSnapshotPolicyInvoker(
        CreateAutoSnapshotPolicyRequest request) {
        return new SyncInvoker<>(request, EvsMeta.createAutoSnapshotPolicy, hcClient);
    }

    /**
     * 创建云硬盘快照
     *
     * 创建云硬盘快照。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSnapshotRequest 请求对象
     * @return CreateSnapshotResponse
     */
    public CreateSnapshotResponse createSnapshot(CreateSnapshotRequest request) {
        return hcClient.syncInvokeHttp(request, EvsMeta.createSnapshot);
    }

    /**
     * 创建云硬盘快照
     *
     * 创建云硬盘快照。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSnapshotRequest 请求对象
     * @return SyncInvoker<CreateSnapshotRequest, CreateSnapshotResponse>
     */
    public SyncInvoker<CreateSnapshotRequest, CreateSnapshotResponse> createSnapshotInvoker(
        CreateSnapshotRequest request) {
        return new SyncInvoker<>(request, EvsMeta.createSnapshot, hcClient);
    }

    /**
     * 创建快照一致性组
     *
     * 创建快照一致性组。标准快照当前只在部分区域支持，具体的区域列表请通过控制台查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSnapshotGroupRequest 请求对象
     * @return CreateSnapshotGroupResponse
     */
    public CreateSnapshotGroupResponse createSnapshotGroup(CreateSnapshotGroupRequest request) {
        return hcClient.syncInvokeHttp(request, EvsMeta.createSnapshotGroup);
    }

    /**
     * 创建快照一致性组
     *
     * 创建快照一致性组。标准快照当前只在部分区域支持，具体的区域列表请通过控制台查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSnapshotGroupRequest 请求对象
     * @return SyncInvoker<CreateSnapshotGroupRequest, CreateSnapshotGroupResponse>
     */
    public SyncInvoker<CreateSnapshotGroupRequest, CreateSnapshotGroupResponse> createSnapshotGroupInvoker(
        CreateSnapshotGroupRequest request) {
        return new SyncInvoker<>(request, EvsMeta.createSnapshotGroup, hcClient);
    }

    /**
     * 创建快照
     *
     * 创建标准快照。标准快照当前只在部分区域支持，具体的区域列表请通过控制台查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateStandardSnapshotRequest 请求对象
     * @return CreateStandardSnapshotResponse
     */
    public CreateStandardSnapshotResponse createStandardSnapshot(CreateStandardSnapshotRequest request) {
        return hcClient.syncInvokeHttp(request, EvsMeta.createStandardSnapshot);
    }

    /**
     * 创建快照
     *
     * 创建标准快照。标准快照当前只在部分区域支持，具体的区域列表请通过控制台查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateStandardSnapshotRequest 请求对象
     * @return SyncInvoker<CreateStandardSnapshotRequest, CreateStandardSnapshotResponse>
     */
    public SyncInvoker<CreateStandardSnapshotRequest, CreateStandardSnapshotResponse> createStandardSnapshotInvoker(
        CreateStandardSnapshotRequest request) {
        return new SyncInvoker<>(request, EvsMeta.createStandardSnapshot, hcClient);
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
     * @return CreateVolumeResponse
     */
    public CreateVolumeResponse createVolume(CreateVolumeRequest request) {
        return hcClient.syncInvokeHttp(request, EvsMeta.createVolume);
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
     * @return SyncInvoker<CreateVolumeRequest, CreateVolumeResponse>
     */
    public SyncInvoker<CreateVolumeRequest, CreateVolumeResponse> createVolumeInvoker(CreateVolumeRequest request) {
        return new SyncInvoker<>(request, EvsMeta.createVolume, hcClient);
    }

    /**
     * 删除单个自动快照策略
     *
     * 删除单个自动快照策略。标准快照当前只在部分区域支持，具体的区域列表请通过控制台查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAutoSnapshotPolicyRequest 请求对象
     * @return DeleteAutoSnapshotPolicyResponse
     */
    public DeleteAutoSnapshotPolicyResponse deleteAutoSnapshotPolicy(DeleteAutoSnapshotPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, EvsMeta.deleteAutoSnapshotPolicy);
    }

    /**
     * 删除单个自动快照策略
     *
     * 删除单个自动快照策略。标准快照当前只在部分区域支持，具体的区域列表请通过控制台查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAutoSnapshotPolicyRequest 请求对象
     * @return SyncInvoker<DeleteAutoSnapshotPolicyRequest, DeleteAutoSnapshotPolicyResponse>
     */
    public SyncInvoker<DeleteAutoSnapshotPolicyRequest, DeleteAutoSnapshotPolicyResponse> deleteAutoSnapshotPolicyInvoker(
        DeleteAutoSnapshotPolicyRequest request) {
        return new SyncInvoker<>(request, EvsMeta.deleteAutoSnapshotPolicy, hcClient);
    }

    /**
     * 删除云硬盘快照
     *
     * 删除云硬盘快照。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSnapshotRequest 请求对象
     * @return DeleteSnapshotResponse
     */
    public DeleteSnapshotResponse deleteSnapshot(DeleteSnapshotRequest request) {
        return hcClient.syncInvokeHttp(request, EvsMeta.deleteSnapshot);
    }

    /**
     * 删除云硬盘快照
     *
     * 删除云硬盘快照。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSnapshotRequest 请求对象
     * @return SyncInvoker<DeleteSnapshotRequest, DeleteSnapshotResponse>
     */
    public SyncInvoker<DeleteSnapshotRequest, DeleteSnapshotResponse> deleteSnapshotInvoker(
        DeleteSnapshotRequest request) {
        return new SyncInvoker<>(request, EvsMeta.deleteSnapshot, hcClient);
    }

    /**
     * 删除快照一致性组
     *
     * 删除快照一致性组。标准快照当前只在部分区域支持，具体的区域列表请通过控制台查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSnapshotGroupRequest 请求对象
     * @return DeleteSnapshotGroupResponse
     */
    public DeleteSnapshotGroupResponse deleteSnapshotGroup(DeleteSnapshotGroupRequest request) {
        return hcClient.syncInvokeHttp(request, EvsMeta.deleteSnapshotGroup);
    }

    /**
     * 删除快照一致性组
     *
     * 删除快照一致性组。标准快照当前只在部分区域支持，具体的区域列表请通过控制台查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSnapshotGroupRequest 请求对象
     * @return SyncInvoker<DeleteSnapshotGroupRequest, DeleteSnapshotGroupResponse>
     */
    public SyncInvoker<DeleteSnapshotGroupRequest, DeleteSnapshotGroupResponse> deleteSnapshotGroupInvoker(
        DeleteSnapshotGroupRequest request) {
        return new SyncInvoker<>(request, EvsMeta.deleteSnapshotGroup, hcClient);
    }

    /**
     * 删除快照
     *
     * 删除快照。标准快照当前只在部分区域支持，具体的区域列表请通过控制台查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteStandardSnapshotRequest 请求对象
     * @return DeleteStandardSnapshotResponse
     */
    public DeleteStandardSnapshotResponse deleteStandardSnapshot(DeleteStandardSnapshotRequest request) {
        return hcClient.syncInvokeHttp(request, EvsMeta.deleteStandardSnapshot);
    }

    /**
     * 删除快照
     *
     * 删除快照。标准快照当前只在部分区域支持，具体的区域列表请通过控制台查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteStandardSnapshotRequest 请求对象
     * @return SyncInvoker<DeleteStandardSnapshotRequest, DeleteStandardSnapshotResponse>
     */
    public SyncInvoker<DeleteStandardSnapshotRequest, DeleteStandardSnapshotResponse> deleteStandardSnapshotInvoker(
        DeleteStandardSnapshotRequest request) {
        return new SyncInvoker<>(request, EvsMeta.deleteStandardSnapshot, hcClient);
    }

    /**
     * 删除云硬盘
     *
     * 删除一个云硬盘。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteVolumeRequest 请求对象
     * @return DeleteVolumeResponse
     */
    public DeleteVolumeResponse deleteVolume(DeleteVolumeRequest request) {
        return hcClient.syncInvokeHttp(request, EvsMeta.deleteVolume);
    }

    /**
     * 删除云硬盘
     *
     * 删除一个云硬盘。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteVolumeRequest 请求对象
     * @return SyncInvoker<DeleteVolumeRequest, DeleteVolumeResponse>
     */
    public SyncInvoker<DeleteVolumeRequest, DeleteVolumeResponse> deleteVolumeInvoker(DeleteVolumeRequest request) {
        return new SyncInvoker<>(request, EvsMeta.deleteVolume, hcClient);
    }

    /**
     * 删除回收站中单个云硬盘
     *
     * 删除回收站中单个云硬盘。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteVolumeInRecycleRequest 请求对象
     * @return DeleteVolumeInRecycleResponse
     */
    public DeleteVolumeInRecycleResponse deleteVolumeInRecycle(DeleteVolumeInRecycleRequest request) {
        return hcClient.syncInvokeHttp(request, EvsMeta.deleteVolumeInRecycle);
    }

    /**
     * 删除回收站中单个云硬盘
     *
     * 删除回收站中单个云硬盘。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteVolumeInRecycleRequest 请求对象
     * @return SyncInvoker<DeleteVolumeInRecycleRequest, DeleteVolumeInRecycleResponse>
     */
    public SyncInvoker<DeleteVolumeInRecycleRequest, DeleteVolumeInRecycleResponse> deleteVolumeInRecycleInvoker(
        DeleteVolumeInRecycleRequest request) {
        return new SyncInvoker<>(request, EvsMeta.deleteVolumeInRecycle, hcClient);
    }

    /**
     * 解绑自动快照策略
     *
     * 解绑自动快照策略。标准快照当前只在部分区域支持，具体的区域列表请通过控制台查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisassociateAutoSnapshotPolicyRequest 请求对象
     * @return DisassociateAutoSnapshotPolicyResponse
     */
    public DisassociateAutoSnapshotPolicyResponse disassociateAutoSnapshotPolicy(
        DisassociateAutoSnapshotPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, EvsMeta.disassociateAutoSnapshotPolicy);
    }

    /**
     * 解绑自动快照策略
     *
     * 解绑自动快照策略。标准快照当前只在部分区域支持，具体的区域列表请通过控制台查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisassociateAutoSnapshotPolicyRequest 请求对象
     * @return SyncInvoker<DisassociateAutoSnapshotPolicyRequest, DisassociateAutoSnapshotPolicyResponse>
     */
    public SyncInvoker<DisassociateAutoSnapshotPolicyRequest, DisassociateAutoSnapshotPolicyResponse> disassociateAutoSnapshotPolicyInvoker(
        DisassociateAutoSnapshotPolicyRequest request) {
        return new SyncInvoker<>(request, EvsMeta.disassociateAutoSnapshotPolicy, hcClient);
    }

    /**
     * 查询自动快照策略
     *
     * 查询自动快照策略。标准快照当前只在部分区域支持，具体的区域列表请通过控制台查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAutoSnapshotPolicyRequest 请求对象
     * @return ListAutoSnapshotPolicyResponse
     */
    public ListAutoSnapshotPolicyResponse listAutoSnapshotPolicy(ListAutoSnapshotPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, EvsMeta.listAutoSnapshotPolicy);
    }

    /**
     * 查询自动快照策略
     *
     * 查询自动快照策略。标准快照当前只在部分区域支持，具体的区域列表请通过控制台查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAutoSnapshotPolicyRequest 请求对象
     * @return SyncInvoker<ListAutoSnapshotPolicyRequest, ListAutoSnapshotPolicyResponse>
     */
    public SyncInvoker<ListAutoSnapshotPolicyRequest, ListAutoSnapshotPolicyResponse> listAutoSnapshotPolicyInvoker(
        ListAutoSnapshotPolicyRequest request) {
        return new SyncInvoker<>(request, EvsMeta.listAutoSnapshotPolicy, hcClient);
    }

    /**
     * 查询快照链列表
     *
     * 查询快照链的列表。标准快照当前只在部分区域支持，具体的区域列表请通过控制台查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSnapshotChainsRequest 请求对象
     * @return ListSnapshotChainsResponse
     */
    public ListSnapshotChainsResponse listSnapshotChains(ListSnapshotChainsRequest request) {
        return hcClient.syncInvokeHttp(request, EvsMeta.listSnapshotChains);
    }

    /**
     * 查询快照链列表
     *
     * 查询快照链的列表。标准快照当前只在部分区域支持，具体的区域列表请通过控制台查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSnapshotChainsRequest 请求对象
     * @return SyncInvoker<ListSnapshotChainsRequest, ListSnapshotChainsResponse>
     */
    public SyncInvoker<ListSnapshotChainsRequest, ListSnapshotChainsResponse> listSnapshotChainsInvoker(
        ListSnapshotChainsRequest request) {
        return new SyncInvoker<>(request, EvsMeta.listSnapshotChains, hcClient);
    }

    /**
     * 查询快照一致性组列表
     *
     * 查询快照一致性组列表。标准快照当前只在部分区域支持，具体的区域列表请通过控制台查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSnapshotGroupRequest 请求对象
     * @return ListSnapshotGroupResponse
     */
    public ListSnapshotGroupResponse listSnapshotGroup(ListSnapshotGroupRequest request) {
        return hcClient.syncInvokeHttp(request, EvsMeta.listSnapshotGroup);
    }

    /**
     * 查询快照一致性组列表
     *
     * 查询快照一致性组列表。标准快照当前只在部分区域支持，具体的区域列表请通过控制台查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSnapshotGroupRequest 请求对象
     * @return SyncInvoker<ListSnapshotGroupRequest, ListSnapshotGroupResponse>
     */
    public SyncInvoker<ListSnapshotGroupRequest, ListSnapshotGroupResponse> listSnapshotGroupInvoker(
        ListSnapshotGroupRequest request) {
        return new SyncInvoker<>(request, EvsMeta.listSnapshotGroup, hcClient);
    }

    /**
     * 查询快照组的所有标签
     *
     * 查询快照组的所有标签。标准快照当前只在部分区域支持，具体的区域列表请通过控制台查询详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSnapshotGroupTagsRequest 请求对象
     * @return ListSnapshotGroupTagsResponse
     */
    public ListSnapshotGroupTagsResponse listSnapshotGroupTags(ListSnapshotGroupTagsRequest request) {
        return hcClient.syncInvokeHttp(request, EvsMeta.listSnapshotGroupTags);
    }

    /**
     * 查询快照组的所有标签
     *
     * 查询快照组的所有标签。标准快照当前只在部分区域支持，具体的区域列表请通过控制台查询详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSnapshotGroupTagsRequest 请求对象
     * @return SyncInvoker<ListSnapshotGroupTagsRequest, ListSnapshotGroupTagsResponse>
     */
    public SyncInvoker<ListSnapshotGroupTagsRequest, ListSnapshotGroupTagsResponse> listSnapshotGroupTagsInvoker(
        ListSnapshotGroupTagsRequest request) {
        return new SyncInvoker<>(request, EvsMeta.listSnapshotGroupTags, hcClient);
    }

    /**
     * 查询快照资源的所有标签
     *
     * 查询快照资源的所有标签。标准快照当前只在部分区域支持，具体的区域列表请通过控制台查询详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSnapshotTagsRequest 请求对象
     * @return ListSnapshotTagsResponse
     */
    public ListSnapshotTagsResponse listSnapshotTags(ListSnapshotTagsRequest request) {
        return hcClient.syncInvokeHttp(request, EvsMeta.listSnapshotTags);
    }

    /**
     * 查询快照资源的所有标签
     *
     * 查询快照资源的所有标签。标准快照当前只在部分区域支持，具体的区域列表请通过控制台查询详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSnapshotTagsRequest 请求对象
     * @return SyncInvoker<ListSnapshotTagsRequest, ListSnapshotTagsResponse>
     */
    public SyncInvoker<ListSnapshotTagsRequest, ListSnapshotTagsResponse> listSnapshotTagsInvoker(
        ListSnapshotTagsRequest request) {
        return new SyncInvoker<>(request, EvsMeta.listSnapshotTags, hcClient);
    }

    /**
     * 查询云硬盘快照详情列表
     *
     * 查询云硬盘快照详细列表信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSnapshotsRequest 请求对象
     * @return ListSnapshotsResponse
     */
    public ListSnapshotsResponse listSnapshots(ListSnapshotsRequest request) {
        return hcClient.syncInvokeHttp(request, EvsMeta.listSnapshots);
    }

    /**
     * 查询云硬盘快照详情列表
     *
     * 查询云硬盘快照详细列表信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSnapshotsRequest 请求对象
     * @return SyncInvoker<ListSnapshotsRequest, ListSnapshotsResponse>
     */
    public SyncInvoker<ListSnapshotsRequest, ListSnapshotsResponse> listSnapshotsInvoker(ListSnapshotsRequest request) {
        return new SyncInvoker<>(request, EvsMeta.listSnapshots, hcClient);
    }

    /**
     * 查询快照详情列表
     *
     * 查询快照详情列表。标准快照当前只在部分区域支持，具体的区域列表请通过控制台查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSnapshotsDetailsRequest 请求对象
     * @return ListSnapshotsDetailsResponse
     */
    public ListSnapshotsDetailsResponse listSnapshotsDetails(ListSnapshotsDetailsRequest request) {
        return hcClient.syncInvokeHttp(request, EvsMeta.listSnapshotsDetails);
    }

    /**
     * 查询快照详情列表
     *
     * 查询快照详情列表。标准快照当前只在部分区域支持，具体的区域列表请通过控制台查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSnapshotsDetailsRequest 请求对象
     * @return SyncInvoker<ListSnapshotsDetailsRequest, ListSnapshotsDetailsResponse>
     */
    public SyncInvoker<ListSnapshotsDetailsRequest, ListSnapshotsDetailsResponse> listSnapshotsDetailsInvoker(
        ListSnapshotsDetailsRequest request) {
        return new SyncInvoker<>(request, EvsMeta.listSnapshotsDetails, hcClient);
    }

    /**
     * 获取云硬盘资源的所有标签
     *
     * 获取某个租户的所有云硬盘资源的标签信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVolumeTagsRequest 请求对象
     * @return ListVolumeTagsResponse
     */
    public ListVolumeTagsResponse listVolumeTags(ListVolumeTagsRequest request) {
        return hcClient.syncInvokeHttp(request, EvsMeta.listVolumeTags);
    }

    /**
     * 获取云硬盘资源的所有标签
     *
     * 获取某个租户的所有云硬盘资源的标签信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVolumeTagsRequest 请求对象
     * @return SyncInvoker<ListVolumeTagsRequest, ListVolumeTagsResponse>
     */
    public SyncInvoker<ListVolumeTagsRequest, ListVolumeTagsResponse> listVolumeTagsInvoker(
        ListVolumeTagsRequest request) {
        return new SyncInvoker<>(request, EvsMeta.listVolumeTags, hcClient);
    }

    /**
     * 查询所有云硬盘详情
     *
     * 查询所有云硬盘的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVolumesRequest 请求对象
     * @return ListVolumesResponse
     */
    public ListVolumesResponse listVolumes(ListVolumesRequest request) {
        return hcClient.syncInvokeHttp(request, EvsMeta.listVolumes);
    }

    /**
     * 查询所有云硬盘详情
     *
     * 查询所有云硬盘的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVolumesRequest 请求对象
     * @return SyncInvoker<ListVolumesRequest, ListVolumesResponse>
     */
    public SyncInvoker<ListVolumesRequest, ListVolumesResponse> listVolumesInvoker(ListVolumesRequest request) {
        return new SyncInvoker<>(request, EvsMeta.listVolumes, hcClient);
    }

    /**
     * 通过标签查询云硬盘资源实例详情
     *
     * 通过标签查询云硬盘资源实例详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVolumesByTagsRequest 请求对象
     * @return ListVolumesByTagsResponse
     */
    public ListVolumesByTagsResponse listVolumesByTags(ListVolumesByTagsRequest request) {
        return hcClient.syncInvokeHttp(request, EvsMeta.listVolumesByTags);
    }

    /**
     * 通过标签查询云硬盘资源实例详情
     *
     * 通过标签查询云硬盘资源实例详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVolumesByTagsRequest 请求对象
     * @return SyncInvoker<ListVolumesByTagsRequest, ListVolumesByTagsResponse>
     */
    public SyncInvoker<ListVolumesByTagsRequest, ListVolumesByTagsResponse> listVolumesByTagsInvoker(
        ListVolumesByTagsRequest request) {
        return new SyncInvoker<>(request, EvsMeta.listVolumesByTags, hcClient);
    }

    /**
     * 查询回收站中所有云硬盘详情
     *
     * 查询回收站中所有云硬盘的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVolumesInRecycleRequest 请求对象
     * @return ListVolumesInRecycleResponse
     */
    public ListVolumesInRecycleResponse listVolumesInRecycle(ListVolumesInRecycleRequest request) {
        return hcClient.syncInvokeHttp(request, EvsMeta.listVolumesInRecycle);
    }

    /**
     * 查询回收站中所有云硬盘详情
     *
     * 查询回收站中所有云硬盘的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVolumesInRecycleRequest 请求对象
     * @return SyncInvoker<ListVolumesInRecycleRequest, ListVolumesInRecycleResponse>
     */
    public SyncInvoker<ListVolumesInRecycleRequest, ListVolumesInRecycleResponse> listVolumesInRecycleInvoker(
        ListVolumesInRecycleRequest request) {
        return new SyncInvoker<>(request, EvsMeta.listVolumesInRecycle, hcClient);
    }

    /**
     * 修改云硬盘QoS
     *
     * 调整云硬盘的iops或者吞吐量。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyVolumeQoSRequest 请求对象
     * @return ModifyVolumeQoSResponse
     */
    public ModifyVolumeQoSResponse modifyVolumeQoS(ModifyVolumeQoSRequest request) {
        return hcClient.syncInvokeHttp(request, EvsMeta.modifyVolumeQoS);
    }

    /**
     * 修改云硬盘QoS
     *
     * 调整云硬盘的iops或者吞吐量。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyVolumeQoSRequest 请求对象
     * @return SyncInvoker<ModifyVolumeQoSRequest, ModifyVolumeQoSResponse>
     */
    public SyncInvoker<ModifyVolumeQoSRequest, ModifyVolumeQoSResponse> modifyVolumeQoSInvoker(
        ModifyVolumeQoSRequest request) {
        return new SyncInvoker<>(request, EvsMeta.modifyVolumeQoS, hcClient);
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
     * @return ResizeVolumeResponse
     */
    public ResizeVolumeResponse resizeVolume(ResizeVolumeRequest request) {
        return hcClient.syncInvokeHttp(request, EvsMeta.resizeVolume);
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
     * @return SyncInvoker<ResizeVolumeRequest, ResizeVolumeResponse>
     */
    public SyncInvoker<ResizeVolumeRequest, ResizeVolumeResponse> resizeVolumeInvoker(ResizeVolumeRequest request) {
        return new SyncInvoker<>(request, EvsMeta.resizeVolume, hcClient);
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
     * @return RetypeVolumeResponse
     */
    public RetypeVolumeResponse retypeVolume(RetypeVolumeRequest request) {
        return hcClient.syncInvokeHttp(request, EvsMeta.retypeVolume);
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
     * @return SyncInvoker<RetypeVolumeRequest, RetypeVolumeResponse>
     */
    public SyncInvoker<RetypeVolumeRequest, RetypeVolumeResponse> retypeVolumeInvoker(RetypeVolumeRequest request) {
        return new SyncInvoker<>(request, EvsMeta.retypeVolume, hcClient);
    }

    /**
     * 还原回收站中单个云硬盘
     *
     * 还原回收站中单个云硬盘。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RevertVolumeInRecycleRequest 请求对象
     * @return RevertVolumeInRecycleResponse
     */
    public RevertVolumeInRecycleResponse revertVolumeInRecycle(RevertVolumeInRecycleRequest request) {
        return hcClient.syncInvokeHttp(request, EvsMeta.revertVolumeInRecycle);
    }

    /**
     * 还原回收站中单个云硬盘
     *
     * 还原回收站中单个云硬盘。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RevertVolumeInRecycleRequest 请求对象
     * @return SyncInvoker<RevertVolumeInRecycleRequest, RevertVolumeInRecycleResponse>
     */
    public SyncInvoker<RevertVolumeInRecycleRequest, RevertVolumeInRecycleResponse> revertVolumeInRecycleInvoker(
        RevertVolumeInRecycleRequest request) {
        return new SyncInvoker<>(request, EvsMeta.revertVolumeInRecycle, hcClient);
    }

    /**
     * 回滚快照到云硬盘
     *
     * 将快照数据回滚到云硬盘。支持企业项目授权功能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RollbackSnapshotRequest 请求对象
     * @return RollbackSnapshotResponse
     */
    public RollbackSnapshotResponse rollbackSnapshot(RollbackSnapshotRequest request) {
        return hcClient.syncInvokeHttp(request, EvsMeta.rollbackSnapshot);
    }

    /**
     * 回滚快照到云硬盘
     *
     * 将快照数据回滚到云硬盘。支持企业项目授权功能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RollbackSnapshotRequest 请求对象
     * @return SyncInvoker<RollbackSnapshotRequest, RollbackSnapshotResponse>
     */
    public SyncInvoker<RollbackSnapshotRequest, RollbackSnapshotResponse> rollbackSnapshotInvoker(
        RollbackSnapshotRequest request) {
        return new SyncInvoker<>(request, EvsMeta.rollbackSnapshot, hcClient);
    }

    /**
     * 快照回滚
     *
     * 将快照数据回滚到云硬盘。标准快照当前只在部分区域支持，具体的区域列表请通过控制台查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RollbackStandardSnapshotRequest 请求对象
     * @return RollbackStandardSnapshotResponse
     */
    public RollbackStandardSnapshotResponse rollbackStandardSnapshot(RollbackStandardSnapshotRequest request) {
        return hcClient.syncInvokeHttp(request, EvsMeta.rollbackStandardSnapshot);
    }

    /**
     * 快照回滚
     *
     * 将快照数据回滚到云硬盘。标准快照当前只在部分区域支持，具体的区域列表请通过控制台查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RollbackStandardSnapshotRequest 请求对象
     * @return SyncInvoker<RollbackStandardSnapshotRequest, RollbackStandardSnapshotResponse>
     */
    public SyncInvoker<RollbackStandardSnapshotRequest, RollbackStandardSnapshotResponse> rollbackStandardSnapshotInvoker(
        RollbackStandardSnapshotRequest request) {
        return new SyncInvoker<>(request, EvsMeta.rollbackStandardSnapshot, hcClient);
    }

    /**
     * 查询单个自动快照策略
     *
     * 查询单个自动快照策略。标准快照当前只在部分区域支持，具体的区域列表请通过控制台查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAutoSnapshotPolicyRequest 请求对象
     * @return ShowAutoSnapshotPolicyResponse
     */
    public ShowAutoSnapshotPolicyResponse showAutoSnapshotPolicy(ShowAutoSnapshotPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, EvsMeta.showAutoSnapshotPolicy);
    }

    /**
     * 查询单个自动快照策略
     *
     * 查询单个自动快照策略。标准快照当前只在部分区域支持，具体的区域列表请通过控制台查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAutoSnapshotPolicyRequest 请求对象
     * @return SyncInvoker<ShowAutoSnapshotPolicyRequest, ShowAutoSnapshotPolicyResponse>
     */
    public SyncInvoker<ShowAutoSnapshotPolicyRequest, ShowAutoSnapshotPolicyResponse> showAutoSnapshotPolicyInvoker(
        ShowAutoSnapshotPolicyRequest request) {
        return new SyncInvoker<>(request, EvsMeta.showAutoSnapshotPolicy, hcClient);
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
     * @return ShowJobResponse
     */
    public ShowJobResponse showJob(ShowJobRequest request) {
        return hcClient.syncInvokeHttp(request, EvsMeta.showJob);
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
     * @return SyncInvoker<ShowJobRequest, ShowJobResponse>
     */
    public SyncInvoker<ShowJobRequest, ShowJobResponse> showJobInvoker(ShowJobRequest request) {
        return new SyncInvoker<>(request, EvsMeta.showJob, hcClient);
    }

    /**
     * 查询回收站策略
     *
     * 查询回收站策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRecyclePolicyRequest 请求对象
     * @return ShowRecyclePolicyResponse
     */
    public ShowRecyclePolicyResponse showRecyclePolicy(ShowRecyclePolicyRequest request) {
        return hcClient.syncInvokeHttp(request, EvsMeta.showRecyclePolicy);
    }

    /**
     * 查询回收站策略
     *
     * 查询回收站策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRecyclePolicyRequest 请求对象
     * @return SyncInvoker<ShowRecyclePolicyRequest, ShowRecyclePolicyResponse>
     */
    public SyncInvoker<ShowRecyclePolicyRequest, ShowRecyclePolicyResponse> showRecyclePolicyInvoker(
        ShowRecyclePolicyRequest request) {
        return new SyncInvoker<>(request, EvsMeta.showRecyclePolicy, hcClient);
    }

    /**
     * 查询单个云硬盘快照详情
     *
     * 查询单个云硬盘快照信息。支持企业项目授权功能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSnapshotRequest 请求对象
     * @return ShowSnapshotResponse
     */
    public ShowSnapshotResponse showSnapshot(ShowSnapshotRequest request) {
        return hcClient.syncInvokeHttp(request, EvsMeta.showSnapshot);
    }

    /**
     * 查询单个云硬盘快照详情
     *
     * 查询单个云硬盘快照信息。支持企业项目授权功能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSnapshotRequest 请求对象
     * @return SyncInvoker<ShowSnapshotRequest, ShowSnapshotResponse>
     */
    public SyncInvoker<ShowSnapshotRequest, ShowSnapshotResponse> showSnapshotInvoker(ShowSnapshotRequest request) {
        return new SyncInvoker<>(request, EvsMeta.showSnapshot, hcClient);
    }

    /**
     * 查询单个快照一致性组
     *
     * 查询单个快照一致性组。标准快照当前只在部分区域支持，具体的区域列表请通过控制台查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSnapshotGroupRequest 请求对象
     * @return ShowSnapshotGroupResponse
     */
    public ShowSnapshotGroupResponse showSnapshotGroup(ShowSnapshotGroupRequest request) {
        return hcClient.syncInvokeHttp(request, EvsMeta.showSnapshotGroup);
    }

    /**
     * 查询单个快照一致性组
     *
     * 查询单个快照一致性组。标准快照当前只在部分区域支持，具体的区域列表请通过控制台查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSnapshotGroupRequest 请求对象
     * @return SyncInvoker<ShowSnapshotGroupRequest, ShowSnapshotGroupResponse>
     */
    public SyncInvoker<ShowSnapshotGroupRequest, ShowSnapshotGroupResponse> showSnapshotGroupInvoker(
        ShowSnapshotGroupRequest request) {
        return new SyncInvoker<>(request, EvsMeta.showSnapshotGroup, hcClient);
    }

    /**
     * 查询单个快照信息
     *
     * 查询单个快照信息。标准快照当前只在部分区域支持，具体的区域列表请通过控制台查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowStandardSnapshotRequest 请求对象
     * @return ShowStandardSnapshotResponse
     */
    public ShowStandardSnapshotResponse showStandardSnapshot(ShowStandardSnapshotRequest request) {
        return hcClient.syncInvokeHttp(request, EvsMeta.showStandardSnapshot);
    }

    /**
     * 查询单个快照信息
     *
     * 查询单个快照信息。标准快照当前只在部分区域支持，具体的区域列表请通过控制台查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowStandardSnapshotRequest 请求对象
     * @return SyncInvoker<ShowStandardSnapshotRequest, ShowStandardSnapshotResponse>
     */
    public SyncInvoker<ShowStandardSnapshotRequest, ShowStandardSnapshotResponse> showStandardSnapshotInvoker(
        ShowStandardSnapshotRequest request) {
        return new SyncInvoker<>(request, EvsMeta.showStandardSnapshot, hcClient);
    }

    /**
     * 查询单个云硬盘详情
     *
     * 查询单个云硬盘的详细信息。支持企业项目授权功能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowVolumeRequest 请求对象
     * @return ShowVolumeResponse
     */
    public ShowVolumeResponse showVolume(ShowVolumeRequest request) {
        return hcClient.syncInvokeHttp(request, EvsMeta.showVolume);
    }

    /**
     * 查询单个云硬盘详情
     *
     * 查询单个云硬盘的详细信息。支持企业项目授权功能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowVolumeRequest 请求对象
     * @return SyncInvoker<ShowVolumeRequest, ShowVolumeResponse>
     */
    public SyncInvoker<ShowVolumeRequest, ShowVolumeResponse> showVolumeInvoker(ShowVolumeRequest request) {
        return new SyncInvoker<>(request, EvsMeta.showVolume, hcClient);
    }

    /**
     * 查询回收站中单个云硬盘详情
     *
     * 查询回收站中单个云硬盘的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowVolumeInRecycleRequest 请求对象
     * @return ShowVolumeInRecycleResponse
     */
    public ShowVolumeInRecycleResponse showVolumeInRecycle(ShowVolumeInRecycleRequest request) {
        return hcClient.syncInvokeHttp(request, EvsMeta.showVolumeInRecycle);
    }

    /**
     * 查询回收站中单个云硬盘详情
     *
     * 查询回收站中单个云硬盘的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowVolumeInRecycleRequest 请求对象
     * @return SyncInvoker<ShowVolumeInRecycleRequest, ShowVolumeInRecycleResponse>
     */
    public SyncInvoker<ShowVolumeInRecycleRequest, ShowVolumeInRecycleResponse> showVolumeInRecycleInvoker(
        ShowVolumeInRecycleRequest request) {
        return new SyncInvoker<>(request, EvsMeta.showVolumeInRecycle, hcClient);
    }

    /**
     * 查询云硬盘标签
     *
     * 查询指定云硬盘的标签信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowVolumeTagsRequest 请求对象
     * @return ShowVolumeTagsResponse
     */
    public ShowVolumeTagsResponse showVolumeTags(ShowVolumeTagsRequest request) {
        return hcClient.syncInvokeHttp(request, EvsMeta.showVolumeTags);
    }

    /**
     * 查询云硬盘标签
     *
     * 查询指定云硬盘的标签信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowVolumeTagsRequest 请求对象
     * @return SyncInvoker<ShowVolumeTagsRequest, ShowVolumeTagsResponse>
     */
    public SyncInvoker<ShowVolumeTagsRequest, ShowVolumeTagsResponse> showVolumeTagsInvoker(
        ShowVolumeTagsRequest request) {
        return new SyncInvoker<>(request, EvsMeta.showVolumeTags, hcClient);
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
     * @return UnsubscribePostpaidVolumeResponse
     */
    public UnsubscribePostpaidVolumeResponse unsubscribePostpaidVolume(UnsubscribePostpaidVolumeRequest request) {
        return hcClient.syncInvokeHttp(request, EvsMeta.unsubscribePostpaidVolume);
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
     * @return SyncInvoker<UnsubscribePostpaidVolumeRequest, UnsubscribePostpaidVolumeResponse>
     */
    public SyncInvoker<UnsubscribePostpaidVolumeRequest, UnsubscribePostpaidVolumeResponse> unsubscribePostpaidVolumeInvoker(
        UnsubscribePostpaidVolumeRequest request) {
        return new SyncInvoker<>(request, EvsMeta.unsubscribePostpaidVolume, hcClient);
    }

    /**
     * 更新自动快照策略
     *
     * 更新自动快照策略。标准快照当前只在部分区域支持，具体的区域列表请通过控制台查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAutoSnapshotPolicyRequest 请求对象
     * @return UpdateAutoSnapshotPolicyResponse
     */
    public UpdateAutoSnapshotPolicyResponse updateAutoSnapshotPolicy(UpdateAutoSnapshotPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, EvsMeta.updateAutoSnapshotPolicy);
    }

    /**
     * 更新自动快照策略
     *
     * 更新自动快照策略。标准快照当前只在部分区域支持，具体的区域列表请通过控制台查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAutoSnapshotPolicyRequest 请求对象
     * @return SyncInvoker<UpdateAutoSnapshotPolicyRequest, UpdateAutoSnapshotPolicyResponse>
     */
    public SyncInvoker<UpdateAutoSnapshotPolicyRequest, UpdateAutoSnapshotPolicyResponse> updateAutoSnapshotPolicyInvoker(
        UpdateAutoSnapshotPolicyRequest request) {
        return new SyncInvoker<>(request, EvsMeta.updateAutoSnapshotPolicy, hcClient);
    }

    /**
     * 更新回收站策略
     *
     * 更新回收站策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateRecyclePolicyRequest 请求对象
     * @return UpdateRecyclePolicyResponse
     */
    public UpdateRecyclePolicyResponse updateRecyclePolicy(UpdateRecyclePolicyRequest request) {
        return hcClient.syncInvokeHttp(request, EvsMeta.updateRecyclePolicy);
    }

    /**
     * 更新回收站策略
     *
     * 更新回收站策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateRecyclePolicyRequest 请求对象
     * @return SyncInvoker<UpdateRecyclePolicyRequest, UpdateRecyclePolicyResponse>
     */
    public SyncInvoker<UpdateRecyclePolicyRequest, UpdateRecyclePolicyResponse> updateRecyclePolicyInvoker(
        UpdateRecyclePolicyRequest request) {
        return new SyncInvoker<>(request, EvsMeta.updateRecyclePolicy, hcClient);
    }

    /**
     * 更新云硬盘快照
     *
     * 更新云硬盘快照。支持企业项目授权功能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSnapshotRequest 请求对象
     * @return UpdateSnapshotResponse
     */
    public UpdateSnapshotResponse updateSnapshot(UpdateSnapshotRequest request) {
        return hcClient.syncInvokeHttp(request, EvsMeta.updateSnapshot);
    }

    /**
     * 更新云硬盘快照
     *
     * 更新云硬盘快照。支持企业项目授权功能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSnapshotRequest 请求对象
     * @return SyncInvoker<UpdateSnapshotRequest, UpdateSnapshotResponse>
     */
    public SyncInvoker<UpdateSnapshotRequest, UpdateSnapshotResponse> updateSnapshotInvoker(
        UpdateSnapshotRequest request) {
        return new SyncInvoker<>(request, EvsMeta.updateSnapshot, hcClient);
    }

    /**
     * 更新快照一致性组
     *
     * 更新快照一致性组。标准快照当前只在部分区域支持，具体的区域列表请通过控制台查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSnapshotGroupRequest 请求对象
     * @return UpdateSnapshotGroupResponse
     */
    public UpdateSnapshotGroupResponse updateSnapshotGroup(UpdateSnapshotGroupRequest request) {
        return hcClient.syncInvokeHttp(request, EvsMeta.updateSnapshotGroup);
    }

    /**
     * 更新快照一致性组
     *
     * 更新快照一致性组。标准快照当前只在部分区域支持，具体的区域列表请通过控制台查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSnapshotGroupRequest 请求对象
     * @return SyncInvoker<UpdateSnapshotGroupRequest, UpdateSnapshotGroupResponse>
     */
    public SyncInvoker<UpdateSnapshotGroupRequest, UpdateSnapshotGroupResponse> updateSnapshotGroupInvoker(
        UpdateSnapshotGroupRequest request) {
        return new SyncInvoker<>(request, EvsMeta.updateSnapshotGroup, hcClient);
    }

    /**
     * 更新快照信息
     *
     * 更新快照信息。标准快照当前只在部分区域支持，具体的区域列表请通过控制台查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateStandardSnapshotRequest 请求对象
     * @return UpdateStandardSnapshotResponse
     */
    public UpdateStandardSnapshotResponse updateStandardSnapshot(UpdateStandardSnapshotRequest request) {
        return hcClient.syncInvokeHttp(request, EvsMeta.updateStandardSnapshot);
    }

    /**
     * 更新快照信息
     *
     * 更新快照信息。标准快照当前只在部分区域支持，具体的区域列表请通过控制台查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateStandardSnapshotRequest 请求对象
     * @return SyncInvoker<UpdateStandardSnapshotRequest, UpdateStandardSnapshotResponse>
     */
    public SyncInvoker<UpdateStandardSnapshotRequest, UpdateStandardSnapshotResponse> updateStandardSnapshotInvoker(
        UpdateStandardSnapshotRequest request) {
        return new SyncInvoker<>(request, EvsMeta.updateStandardSnapshot, hcClient);
    }

    /**
     * 更新云硬盘
     *
     * 更新一个云硬盘的名称和描述。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateVolumeRequest 请求对象
     * @return UpdateVolumeResponse
     */
    public UpdateVolumeResponse updateVolume(UpdateVolumeRequest request) {
        return hcClient.syncInvokeHttp(request, EvsMeta.updateVolume);
    }

    /**
     * 更新云硬盘
     *
     * 更新一个云硬盘的名称和描述。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateVolumeRequest 请求对象
     * @return SyncInvoker<UpdateVolumeRequest, UpdateVolumeResponse>
     */
    public SyncInvoker<UpdateVolumeRequest, UpdateVolumeResponse> updateVolumeInvoker(UpdateVolumeRequest request) {
        return new SyncInvoker<>(request, EvsMeta.updateVolume, hcClient);
    }

    /**
     * 查询接口版本信息列表
     *
     * 查询接口版本信息列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVersionsRequest 请求对象
     * @return ListVersionsResponse
     */
    public ListVersionsResponse listVersions(ListVersionsRequest request) {
        return hcClient.syncInvokeHttp(request, EvsMeta.listVersions);
    }

    /**
     * 查询接口版本信息列表
     *
     * 查询接口版本信息列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVersionsRequest 请求对象
     * @return SyncInvoker<ListVersionsRequest, ListVersionsResponse>
     */
    public SyncInvoker<ListVersionsRequest, ListVersionsResponse> listVersionsInvoker(ListVersionsRequest request) {
        return new SyncInvoker<>(request, EvsMeta.listVersions, hcClient);
    }

    /**
     * 查询API接口的版本信息
     *
     * 查询接口的指定版本信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowVersionRequest 请求对象
     * @return ShowVersionResponse
     */
    public ShowVersionResponse showVersion(ShowVersionRequest request) {
        return hcClient.syncInvokeHttp(request, EvsMeta.showVersion);
    }

    /**
     * 查询API接口的版本信息
     *
     * 查询接口的指定版本信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowVersionRequest 请求对象
     * @return SyncInvoker<ShowVersionRequest, ShowVersionResponse>
     */
    public SyncInvoker<ShowVersionRequest, ShowVersionResponse> showVersionInvoker(ShowVersionRequest request) {
        return new SyncInvoker<>(request, EvsMeta.showVersion, hcClient);
    }

}
