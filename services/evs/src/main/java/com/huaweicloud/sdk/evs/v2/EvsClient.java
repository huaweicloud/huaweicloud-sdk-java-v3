package com.huaweicloud.sdk.evs.v2;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.evs.v2.model.*;

public class EvsClient {

    protected HcClient hcClient;

    public EvsClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<EvsClient> newBuilder() {
        return new ClientBuilder<>(EvsClient::new);
    }

    /** 为指定云硬盘批量添加标签 为指定云硬盘批量添加标签。 添加标签时，如果云硬盘的标签已存在相同key，则会覆盖已有标签。 单个云硬盘最多支持创建10个标签。
     *
     * @param BatchCreateVolumeTagsRequest 请求对象
     * @return BatchCreateVolumeTagsResponse */
    public BatchCreateVolumeTagsResponse batchCreateVolumeTags(BatchCreateVolumeTagsRequest request) {
        return hcClient.syncInvokeHttp(request, EvsMeta.batchCreateVolumeTags);
    }

    /** 为指定云硬盘批量添加标签 为指定云硬盘批量添加标签。 添加标签时，如果云硬盘的标签已存在相同key，则会覆盖已有标签。 单个云硬盘最多支持创建10个标签。
     *
     * @param BatchCreateVolumeTagsRequest 请求对象
     * @return SyncInvoker<BatchCreateVolumeTagsRequest, BatchCreateVolumeTagsResponse> */
    public SyncInvoker<BatchCreateVolumeTagsRequest, BatchCreateVolumeTagsResponse> batchCreateVolumeTagsInvoker(
        BatchCreateVolumeTagsRequest request) {
        return new SyncInvoker<BatchCreateVolumeTagsRequest, BatchCreateVolumeTagsResponse>(request,
            EvsMeta.batchCreateVolumeTags, hcClient);
    }

    /** 为指定云硬盘批量删除标签 为指定云硬盘批量删除标签。
     *
     * @param BatchDeleteVolumeTagsRequest 请求对象
     * @return BatchDeleteVolumeTagsResponse */
    public BatchDeleteVolumeTagsResponse batchDeleteVolumeTags(BatchDeleteVolumeTagsRequest request) {
        return hcClient.syncInvokeHttp(request, EvsMeta.batchDeleteVolumeTags);
    }

    /** 为指定云硬盘批量删除标签 为指定云硬盘批量删除标签。
     *
     * @param BatchDeleteVolumeTagsRequest 请求对象
     * @return SyncInvoker<BatchDeleteVolumeTagsRequest, BatchDeleteVolumeTagsResponse> */
    public SyncInvoker<BatchDeleteVolumeTagsRequest, BatchDeleteVolumeTagsResponse> batchDeleteVolumeTagsInvoker(
        BatchDeleteVolumeTagsRequest request) {
        return new SyncInvoker<BatchDeleteVolumeTagsRequest, BatchDeleteVolumeTagsResponse>(request,
            EvsMeta.batchDeleteVolumeTags, hcClient);
    }

    /** 查询所有的可用分区信息 查询所有的可用分区信息。
     *
     * @param CinderListAvailabilityZonesRequest 请求对象
     * @return CinderListAvailabilityZonesResponse */
    public CinderListAvailabilityZonesResponse cinderListAvailabilityZones(CinderListAvailabilityZonesRequest request) {
        return hcClient.syncInvokeHttp(request, EvsMeta.cinderListAvailabilityZones);
    }

    /** 查询所有的可用分区信息 查询所有的可用分区信息。
     *
     * @param CinderListAvailabilityZonesRequest 请求对象
     * @return SyncInvoker<CinderListAvailabilityZonesRequest, CinderListAvailabilityZonesResponse> */
    public SyncInvoker<CinderListAvailabilityZonesRequest, CinderListAvailabilityZonesResponse> cinderListAvailabilityZonesInvoker(
        CinderListAvailabilityZonesRequest request) {
        return new SyncInvoker<CinderListAvailabilityZonesRequest, CinderListAvailabilityZonesResponse>(request,
            EvsMeta.cinderListAvailabilityZones, hcClient);
    }

    /** 查询租户的详细配额 查询租户的详细配额。
     *
     * @param CinderListQuotasRequest 请求对象
     * @return CinderListQuotasResponse */
    public CinderListQuotasResponse cinderListQuotas(CinderListQuotasRequest request) {
        return hcClient.syncInvokeHttp(request, EvsMeta.cinderListQuotas);
    }

    /** 查询租户的详细配额 查询租户的详细配额。
     *
     * @param CinderListQuotasRequest 请求对象
     * @return SyncInvoker<CinderListQuotasRequest, CinderListQuotasResponse> */
    public SyncInvoker<CinderListQuotasRequest, CinderListQuotasResponse> cinderListQuotasInvoker(
        CinderListQuotasRequest request) {
        return new SyncInvoker<CinderListQuotasRequest, CinderListQuotasResponse>(request, EvsMeta.cinderListQuotas,
            hcClient);
    }

    /** 查询云硬盘类型列表 查询云硬盘类型列表。
     *
     * @param CinderListVolumeTypesRequest 请求对象
     * @return CinderListVolumeTypesResponse */
    public CinderListVolumeTypesResponse cinderListVolumeTypes(CinderListVolumeTypesRequest request) {
        return hcClient.syncInvokeHttp(request, EvsMeta.cinderListVolumeTypes);
    }

    /** 查询云硬盘类型列表 查询云硬盘类型列表。
     *
     * @param CinderListVolumeTypesRequest 请求对象
     * @return SyncInvoker<CinderListVolumeTypesRequest, CinderListVolumeTypesResponse> */
    public SyncInvoker<CinderListVolumeTypesRequest, CinderListVolumeTypesResponse> cinderListVolumeTypesInvoker(
        CinderListVolumeTypesRequest request) {
        return new SyncInvoker<CinderListVolumeTypesRequest, CinderListVolumeTypesResponse>(request,
            EvsMeta.cinderListVolumeTypes, hcClient);
    }

    /** 创建云硬盘快照 创建云硬盘快照。
     *
     * @param CreateSnapshotRequest 请求对象
     * @return CreateSnapshotResponse */
    public CreateSnapshotResponse createSnapshot(CreateSnapshotRequest request) {
        return hcClient.syncInvokeHttp(request, EvsMeta.createSnapshot);
    }

    /** 创建云硬盘快照 创建云硬盘快照。
     *
     * @param CreateSnapshotRequest 请求对象
     * @return SyncInvoker<CreateSnapshotRequest, CreateSnapshotResponse> */
    public SyncInvoker<CreateSnapshotRequest, CreateSnapshotResponse> createSnapshotInvoker(
        CreateSnapshotRequest request) {
        return new SyncInvoker<CreateSnapshotRequest, CreateSnapshotResponse>(request, EvsMeta.createSnapshot,
            hcClient);
    }

    /** 创建云硬盘 创建按需或包周期云硬盘。 在创建包周期云硬盘的场景下： -
     * 如果您需要查看订单可用的优惠券，请参考\&quot;[查询订单可用优惠券](https://support.huaweicloud.com/api-oce/zh-cn_topic_0092953630.html)\&quot;。
     * - 如果您需要支付订单，请参考\&quot;[支付包周期产品订单](https://support.huaweicloud.com/api-oce/zh-cn_topic_0075746561.html)\&quot;。 -
     * 如果您需要查询订单的资源开通详情，请参考\&quot;[查询订单的资源开通详情](https://support.huaweicloud.com/api-oce/api_order_00001.html)\&quot;。 -
     * 如果您需要退订该包周期资源，请参考“[退订包周期资源](https://support.huaweicloud.com/api-oce/zh-cn_topic_0082522030.html)”。
     *
     * @param CreateVolumeRequest 请求对象
     * @return CreateVolumeResponse */
    public CreateVolumeResponse createVolume(CreateVolumeRequest request) {
        return hcClient.syncInvokeHttp(request, EvsMeta.createVolume);
    }

    /** 创建云硬盘 创建按需或包周期云硬盘。 在创建包周期云硬盘的场景下： -
     * 如果您需要查看订单可用的优惠券，请参考\&quot;[查询订单可用优惠券](https://support.huaweicloud.com/api-oce/zh-cn_topic_0092953630.html)\&quot;。
     * - 如果您需要支付订单，请参考\&quot;[支付包周期产品订单](https://support.huaweicloud.com/api-oce/zh-cn_topic_0075746561.html)\&quot;。 -
     * 如果您需要查询订单的资源开通详情，请参考\&quot;[查询订单的资源开通详情](https://support.huaweicloud.com/api-oce/api_order_00001.html)\&quot;。 -
     * 如果您需要退订该包周期资源，请参考“[退订包周期资源](https://support.huaweicloud.com/api-oce/zh-cn_topic_0082522030.html)”。
     *
     * @param CreateVolumeRequest 请求对象
     * @return SyncInvoker<CreateVolumeRequest, CreateVolumeResponse> */
    public SyncInvoker<CreateVolumeRequest, CreateVolumeResponse> createVolumeInvoker(CreateVolumeRequest request) {
        return new SyncInvoker<CreateVolumeRequest, CreateVolumeResponse>(request, EvsMeta.createVolume, hcClient);
    }

    /** 删除云硬盘快照 删除云硬盘快照。
     *
     * @param DeleteSnapshotRequest 请求对象
     * @return DeleteSnapshotResponse */
    public DeleteSnapshotResponse deleteSnapshot(DeleteSnapshotRequest request) {
        return hcClient.syncInvokeHttp(request, EvsMeta.deleteSnapshot);
    }

    /** 删除云硬盘快照 删除云硬盘快照。
     *
     * @param DeleteSnapshotRequest 请求对象
     * @return SyncInvoker<DeleteSnapshotRequest, DeleteSnapshotResponse> */
    public SyncInvoker<DeleteSnapshotRequest, DeleteSnapshotResponse> deleteSnapshotInvoker(
        DeleteSnapshotRequest request) {
        return new SyncInvoker<DeleteSnapshotRequest, DeleteSnapshotResponse>(request, EvsMeta.deleteSnapshot,
            hcClient);
    }

    /** 删除云硬盘 删除一个云硬盘。
     *
     * @param DeleteVolumeRequest 请求对象
     * @return DeleteVolumeResponse */
    public DeleteVolumeResponse deleteVolume(DeleteVolumeRequest request) {
        return hcClient.syncInvokeHttp(request, EvsMeta.deleteVolume);
    }

    /** 删除云硬盘 删除一个云硬盘。
     *
     * @param DeleteVolumeRequest 请求对象
     * @return SyncInvoker<DeleteVolumeRequest, DeleteVolumeResponse> */
    public SyncInvoker<DeleteVolumeRequest, DeleteVolumeResponse> deleteVolumeInvoker(DeleteVolumeRequest request) {
        return new SyncInvoker<DeleteVolumeRequest, DeleteVolumeResponse>(request, EvsMeta.deleteVolume, hcClient);
    }

    /** 查询云硬盘快照详细列表信息 查询云硬盘快照详细列表信息。
     *
     * @param ListSnapshotsRequest 请求对象
     * @return ListSnapshotsResponse */
    public ListSnapshotsResponse listSnapshots(ListSnapshotsRequest request) {
        return hcClient.syncInvokeHttp(request, EvsMeta.listSnapshots);
    }

    /** 查询云硬盘快照详细列表信息 查询云硬盘快照详细列表信息。
     *
     * @param ListSnapshotsRequest 请求对象
     * @return SyncInvoker<ListSnapshotsRequest, ListSnapshotsResponse> */
    public SyncInvoker<ListSnapshotsRequest, ListSnapshotsResponse> listSnapshotsInvoker(ListSnapshotsRequest request) {
        return new SyncInvoker<ListSnapshotsRequest, ListSnapshotsResponse>(request, EvsMeta.listSnapshots, hcClient);
    }

    /** 获取云硬盘资源的所有标签 获取某个租户的所有云硬盘资源的标签信息。
     *
     * @param ListVolumeTagsRequest 请求对象
     * @return ListVolumeTagsResponse */
    public ListVolumeTagsResponse listVolumeTags(ListVolumeTagsRequest request) {
        return hcClient.syncInvokeHttp(request, EvsMeta.listVolumeTags);
    }

    /** 获取云硬盘资源的所有标签 获取某个租户的所有云硬盘资源的标签信息。
     *
     * @param ListVolumeTagsRequest 请求对象
     * @return SyncInvoker<ListVolumeTagsRequest, ListVolumeTagsResponse> */
    public SyncInvoker<ListVolumeTagsRequest, ListVolumeTagsResponse> listVolumeTagsInvoker(
        ListVolumeTagsRequest request) {
        return new SyncInvoker<ListVolumeTagsRequest, ListVolumeTagsResponse>(request, EvsMeta.listVolumeTags,
            hcClient);
    }

    /** 查询所有云硬盘详情 查询所有云硬盘的详细信息。
     *
     * @param ListVolumesRequest 请求对象
     * @return ListVolumesResponse */
    public ListVolumesResponse listVolumes(ListVolumesRequest request) {
        return hcClient.syncInvokeHttp(request, EvsMeta.listVolumes);
    }

    /** 查询所有云硬盘详情 查询所有云硬盘的详细信息。
     *
     * @param ListVolumesRequest 请求对象
     * @return SyncInvoker<ListVolumesRequest, ListVolumesResponse> */
    public SyncInvoker<ListVolumesRequest, ListVolumesResponse> listVolumesInvoker(ListVolumesRequest request) {
        return new SyncInvoker<ListVolumesRequest, ListVolumesResponse>(request, EvsMeta.listVolumes, hcClient);
    }

    /** 通过标签查询云硬盘资源实例详情 通过标签查询云硬盘资源实例详情。
     *
     * @param ListVolumesByTagsRequest 请求对象
     * @return ListVolumesByTagsResponse */
    public ListVolumesByTagsResponse listVolumesByTags(ListVolumesByTagsRequest request) {
        return hcClient.syncInvokeHttp(request, EvsMeta.listVolumesByTags);
    }

    /** 通过标签查询云硬盘资源实例详情 通过标签查询云硬盘资源实例详情。
     *
     * @param ListVolumesByTagsRequest 请求对象
     * @return SyncInvoker<ListVolumesByTagsRequest, ListVolumesByTagsResponse> */
    public SyncInvoker<ListVolumesByTagsRequest, ListVolumesByTagsResponse> listVolumesByTagsInvoker(
        ListVolumesByTagsRequest request) {
        return new SyncInvoker<ListVolumesByTagsRequest, ListVolumesByTagsResponse>(request, EvsMeta.listVolumesByTags,
            hcClient);
    }

    /** 扩容云硬盘 对按需或者包周期云硬盘进行扩容。 在扩容包周期云硬盘的场景下： -
     * 如果您需要查看订单可用的优惠券，请参考\&quot;[查询订单可用优惠券](https://support.huaweicloud.com/api-oce/zh-cn_topic_0092953630.html)\&quot;。
     * - 如果您需要支付订单，请参考\&quot;[支付包周期产品订单](https://support.huaweicloud.com/api-oce/zh-cn_topic_0075746561.html)\&quot;。 -
     * 如果您需要查询订单的资源开通详情，请参考\&quot;[查询订单的资源开通详情](https://support.huaweicloud.com/api-oce/api_order_00001.html)\&quot;。 -
     * 如果您需要退订该包周期资源，请参考“[退订包周期资源](https://support.huaweicloud.com/api-oce/zh-cn_topic_0082522030.html)”。
     *
     * @param ResizeVolumeRequest 请求对象
     * @return ResizeVolumeResponse */
    public ResizeVolumeResponse resizeVolume(ResizeVolumeRequest request) {
        return hcClient.syncInvokeHttp(request, EvsMeta.resizeVolume);
    }

    /** 扩容云硬盘 对按需或者包周期云硬盘进行扩容。 在扩容包周期云硬盘的场景下： -
     * 如果您需要查看订单可用的优惠券，请参考\&quot;[查询订单可用优惠券](https://support.huaweicloud.com/api-oce/zh-cn_topic_0092953630.html)\&quot;。
     * - 如果您需要支付订单，请参考\&quot;[支付包周期产品订单](https://support.huaweicloud.com/api-oce/zh-cn_topic_0075746561.html)\&quot;。 -
     * 如果您需要查询订单的资源开通详情，请参考\&quot;[查询订单的资源开通详情](https://support.huaweicloud.com/api-oce/api_order_00001.html)\&quot;。 -
     * 如果您需要退订该包周期资源，请参考“[退订包周期资源](https://support.huaweicloud.com/api-oce/zh-cn_topic_0082522030.html)”。
     *
     * @param ResizeVolumeRequest 请求对象
     * @return SyncInvoker<ResizeVolumeRequest, ResizeVolumeResponse> */
    public SyncInvoker<ResizeVolumeRequest, ResizeVolumeResponse> resizeVolumeInvoker(ResizeVolumeRequest request) {
        return new SyncInvoker<ResizeVolumeRequest, ResizeVolumeResponse>(request, EvsMeta.resizeVolume, hcClient);
    }

    /** 回滚快照到云硬盘 将快照数据回滚到云硬盘。支持企业项目授权功能。
     *
     * @param RollbackSnapshotRequest 请求对象
     * @return RollbackSnapshotResponse */
    public RollbackSnapshotResponse rollbackSnapshot(RollbackSnapshotRequest request) {
        return hcClient.syncInvokeHttp(request, EvsMeta.rollbackSnapshot);
    }

    /** 回滚快照到云硬盘 将快照数据回滚到云硬盘。支持企业项目授权功能。
     *
     * @param RollbackSnapshotRequest 请求对象
     * @return SyncInvoker<RollbackSnapshotRequest, RollbackSnapshotResponse> */
    public SyncInvoker<RollbackSnapshotRequest, RollbackSnapshotResponse> rollbackSnapshotInvoker(
        RollbackSnapshotRequest request) {
        return new SyncInvoker<RollbackSnapshotRequest, RollbackSnapshotResponse>(request, EvsMeta.rollbackSnapshot,
            hcClient);
    }

    /** 查询job的状态 查询Job的执行状态。 可用于查询创建云硬盘，扩容云硬盘，删除云硬盘等API的执行状态。
     *
     * @param ShowJobRequest 请求对象
     * @return ShowJobResponse */
    public ShowJobResponse showJob(ShowJobRequest request) {
        return hcClient.syncInvokeHttp(request, EvsMeta.showJob);
    }

    /** 查询job的状态 查询Job的执行状态。 可用于查询创建云硬盘，扩容云硬盘，删除云硬盘等API的执行状态。
     *
     * @param ShowJobRequest 请求对象
     * @return SyncInvoker<ShowJobRequest, ShowJobResponse> */
    public SyncInvoker<ShowJobRequest, ShowJobResponse> showJobInvoker(ShowJobRequest request) {
        return new SyncInvoker<ShowJobRequest, ShowJobResponse>(request, EvsMeta.showJob, hcClient);
    }

    /** 查询单个云硬盘快照详细信息 查询单个云硬盘快照信息。支持企业项目授权功能。
     *
     * @param ShowSnapshotRequest 请求对象
     * @return ShowSnapshotResponse */
    public ShowSnapshotResponse showSnapshot(ShowSnapshotRequest request) {
        return hcClient.syncInvokeHttp(request, EvsMeta.showSnapshot);
    }

    /** 查询单个云硬盘快照详细信息 查询单个云硬盘快照信息。支持企业项目授权功能。
     *
     * @param ShowSnapshotRequest 请求对象
     * @return SyncInvoker<ShowSnapshotRequest, ShowSnapshotResponse> */
    public SyncInvoker<ShowSnapshotRequest, ShowSnapshotResponse> showSnapshotInvoker(ShowSnapshotRequest request) {
        return new SyncInvoker<ShowSnapshotRequest, ShowSnapshotResponse>(request, EvsMeta.showSnapshot, hcClient);
    }

    /** 查询单个云硬盘详情 查询单个云硬盘的详细信息。支持企业项目授权功能。
     *
     * @param ShowVolumeRequest 请求对象
     * @return ShowVolumeResponse */
    public ShowVolumeResponse showVolume(ShowVolumeRequest request) {
        return hcClient.syncInvokeHttp(request, EvsMeta.showVolume);
    }

    /** 查询单个云硬盘详情 查询单个云硬盘的详细信息。支持企业项目授权功能。
     *
     * @param ShowVolumeRequest 请求对象
     * @return SyncInvoker<ShowVolumeRequest, ShowVolumeResponse> */
    public SyncInvoker<ShowVolumeRequest, ShowVolumeResponse> showVolumeInvoker(ShowVolumeRequest request) {
        return new SyncInvoker<ShowVolumeRequest, ShowVolumeResponse>(request, EvsMeta.showVolume, hcClient);
    }

    /** 查询云硬盘标签 查询指定云硬盘的标签信息。
     *
     * @param ShowVolumeTagsRequest 请求对象
     * @return ShowVolumeTagsResponse */
    public ShowVolumeTagsResponse showVolumeTags(ShowVolumeTagsRequest request) {
        return hcClient.syncInvokeHttp(request, EvsMeta.showVolumeTags);
    }

    /** 查询云硬盘标签 查询指定云硬盘的标签信息。
     *
     * @param ShowVolumeTagsRequest 请求对象
     * @return SyncInvoker<ShowVolumeTagsRequest, ShowVolumeTagsResponse> */
    public SyncInvoker<ShowVolumeTagsRequest, ShowVolumeTagsResponse> showVolumeTagsInvoker(
        ShowVolumeTagsRequest request) {
        return new SyncInvoker<ShowVolumeTagsRequest, ShowVolumeTagsResponse>(request, EvsMeta.showVolumeTags,
            hcClient);
    }

    /** 更新云硬盘快照 更新云硬盘快照。支持企业项目授权功能。
     *
     * @param UpdateSnapshotRequest 请求对象
     * @return UpdateSnapshotResponse */
    public UpdateSnapshotResponse updateSnapshot(UpdateSnapshotRequest request) {
        return hcClient.syncInvokeHttp(request, EvsMeta.updateSnapshot);
    }

    /** 更新云硬盘快照 更新云硬盘快照。支持企业项目授权功能。
     *
     * @param UpdateSnapshotRequest 请求对象
     * @return SyncInvoker<UpdateSnapshotRequest, UpdateSnapshotResponse> */
    public SyncInvoker<UpdateSnapshotRequest, UpdateSnapshotResponse> updateSnapshotInvoker(
        UpdateSnapshotRequest request) {
        return new SyncInvoker<UpdateSnapshotRequest, UpdateSnapshotResponse>(request, EvsMeta.updateSnapshot,
            hcClient);
    }

    /** 更新云硬盘 更新一个云硬盘的名称和描述。
     *
     * @param UpdateVolumeRequest 请求对象
     * @return UpdateVolumeResponse */
    public UpdateVolumeResponse updateVolume(UpdateVolumeRequest request) {
        return hcClient.syncInvokeHttp(request, EvsMeta.updateVolume);
    }

    /** 更新云硬盘 更新一个云硬盘的名称和描述。
     *
     * @param UpdateVolumeRequest 请求对象
     * @return SyncInvoker<UpdateVolumeRequest, UpdateVolumeResponse> */
    public SyncInvoker<UpdateVolumeRequest, UpdateVolumeResponse> updateVolumeInvoker(UpdateVolumeRequest request) {
        return new SyncInvoker<UpdateVolumeRequest, UpdateVolumeResponse>(request, EvsMeta.updateVolume, hcClient);
    }

}
