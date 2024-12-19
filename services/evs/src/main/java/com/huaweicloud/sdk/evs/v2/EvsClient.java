package com.huaweicloud.sdk.evs.v2;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.evs.v2.model.BatchCreateVolumeTagsRequest;
import com.huaweicloud.sdk.evs.v2.model.BatchCreateVolumeTagsResponse;
import com.huaweicloud.sdk.evs.v2.model.BatchDeleteVolumeTagsRequest;
import com.huaweicloud.sdk.evs.v2.model.BatchDeleteVolumeTagsResponse;
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
import com.huaweicloud.sdk.evs.v2.model.CreateSnapshotRequest;
import com.huaweicloud.sdk.evs.v2.model.CreateSnapshotResponse;
import com.huaweicloud.sdk.evs.v2.model.CreateVolumeRequest;
import com.huaweicloud.sdk.evs.v2.model.CreateVolumeResponse;
import com.huaweicloud.sdk.evs.v2.model.DeleteSnapshotRequest;
import com.huaweicloud.sdk.evs.v2.model.DeleteSnapshotResponse;
import com.huaweicloud.sdk.evs.v2.model.DeleteVolumeRequest;
import com.huaweicloud.sdk.evs.v2.model.DeleteVolumeResponse;
import com.huaweicloud.sdk.evs.v2.model.ListSnapshotsRequest;
import com.huaweicloud.sdk.evs.v2.model.ListSnapshotsResponse;
import com.huaweicloud.sdk.evs.v2.model.ListVersionsRequest;
import com.huaweicloud.sdk.evs.v2.model.ListVersionsResponse;
import com.huaweicloud.sdk.evs.v2.model.ListVolumeTagsRequest;
import com.huaweicloud.sdk.evs.v2.model.ListVolumeTagsResponse;
import com.huaweicloud.sdk.evs.v2.model.ListVolumesByTagsRequest;
import com.huaweicloud.sdk.evs.v2.model.ListVolumesByTagsResponse;
import com.huaweicloud.sdk.evs.v2.model.ListVolumesRequest;
import com.huaweicloud.sdk.evs.v2.model.ListVolumesResponse;
import com.huaweicloud.sdk.evs.v2.model.ModifyVolumeQoSRequest;
import com.huaweicloud.sdk.evs.v2.model.ModifyVolumeQoSResponse;
import com.huaweicloud.sdk.evs.v2.model.ResizeVolumeRequest;
import com.huaweicloud.sdk.evs.v2.model.ResizeVolumeResponse;
import com.huaweicloud.sdk.evs.v2.model.RetypeVolumeRequest;
import com.huaweicloud.sdk.evs.v2.model.RetypeVolumeResponse;
import com.huaweicloud.sdk.evs.v2.model.RollbackSnapshotRequest;
import com.huaweicloud.sdk.evs.v2.model.RollbackSnapshotResponse;
import com.huaweicloud.sdk.evs.v2.model.ShowJobRequest;
import com.huaweicloud.sdk.evs.v2.model.ShowJobResponse;
import com.huaweicloud.sdk.evs.v2.model.ShowSnapshotRequest;
import com.huaweicloud.sdk.evs.v2.model.ShowSnapshotResponse;
import com.huaweicloud.sdk.evs.v2.model.ShowVersionRequest;
import com.huaweicloud.sdk.evs.v2.model.ShowVersionResponse;
import com.huaweicloud.sdk.evs.v2.model.ShowVolumeRequest;
import com.huaweicloud.sdk.evs.v2.model.ShowVolumeResponse;
import com.huaweicloud.sdk.evs.v2.model.ShowVolumeTagsRequest;
import com.huaweicloud.sdk.evs.v2.model.ShowVolumeTagsResponse;
import com.huaweicloud.sdk.evs.v2.model.UnsubscribePostpaidVolumeRequest;
import com.huaweicloud.sdk.evs.v2.model.UnsubscribePostpaidVolumeResponse;
import com.huaweicloud.sdk.evs.v2.model.UpdateSnapshotRequest;
import com.huaweicloud.sdk.evs.v2.model.UpdateSnapshotResponse;
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
