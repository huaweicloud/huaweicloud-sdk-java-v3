package com.huaweicloud.sdk.evs.v2;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.evs.v2.model.*;

import java.util.concurrent.CompletableFuture;

public class EvsAsyncClient {

    protected HcClient hcClient;

    public EvsAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<EvsAsyncClient> newBuilder() {
        return new ClientBuilder<>(EvsAsyncClient::new);
    }

    /** 为指定云硬盘批量添加标签 为指定云硬盘批量添加标签。 添加标签时，如果云硬盘的标签已存在相同key，则会覆盖已有标签。 单个云硬盘最多支持创建10个标签。
     *
     * @param BatchCreateVolumeTagsRequest 请求对象
     * @return CompletableFuture<BatchCreateVolumeTagsResponse> */
    public CompletableFuture<BatchCreateVolumeTagsResponse> batchCreateVolumeTagsAsync(
        BatchCreateVolumeTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, EvsMeta.batchCreateVolumeTags);
    }

    /** 为指定云硬盘批量添加标签 为指定云硬盘批量添加标签。 添加标签时，如果云硬盘的标签已存在相同key，则会覆盖已有标签。 单个云硬盘最多支持创建10个标签。
     *
     * @param BatchCreateVolumeTagsRequest 请求对象
     * @return AsyncInvoker<BatchCreateVolumeTagsRequest, BatchCreateVolumeTagsResponse> */
    public AsyncInvoker<BatchCreateVolumeTagsRequest, BatchCreateVolumeTagsResponse> batchCreateVolumeTagsAsyncInvoker(
        BatchCreateVolumeTagsRequest request) {
        return new AsyncInvoker<BatchCreateVolumeTagsRequest, BatchCreateVolumeTagsResponse>(request,
            EvsMeta.batchCreateVolumeTags, hcClient);
    }

    /** 为指定云硬盘批量删除标签 为指定云硬盘批量删除标签。
     *
     * @param BatchDeleteVolumeTagsRequest 请求对象
     * @return CompletableFuture<BatchDeleteVolumeTagsResponse> */
    public CompletableFuture<BatchDeleteVolumeTagsResponse> batchDeleteVolumeTagsAsync(
        BatchDeleteVolumeTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, EvsMeta.batchDeleteVolumeTags);
    }

    /** 为指定云硬盘批量删除标签 为指定云硬盘批量删除标签。
     *
     * @param BatchDeleteVolumeTagsRequest 请求对象
     * @return AsyncInvoker<BatchDeleteVolumeTagsRequest, BatchDeleteVolumeTagsResponse> */
    public AsyncInvoker<BatchDeleteVolumeTagsRequest, BatchDeleteVolumeTagsResponse> batchDeleteVolumeTagsAsyncInvoker(
        BatchDeleteVolumeTagsRequest request) {
        return new AsyncInvoker<BatchDeleteVolumeTagsRequest, BatchDeleteVolumeTagsResponse>(request,
            EvsMeta.batchDeleteVolumeTags, hcClient);
    }

    /** 将云硬盘导出为镜像 将系统盘或数据盘的数据导出为IMS镜像，导出的镜像在IMS的私有镜像列表中可以查 看并使用。
     *
     * @param CinderExportToImageRequest 请求对象
     * @return CompletableFuture<CinderExportToImageResponse> */
    public CompletableFuture<CinderExportToImageResponse> cinderExportToImageAsync(CinderExportToImageRequest request) {
        return hcClient.asyncInvokeHttp(request, EvsMeta.cinderExportToImage);
    }

    /** 将云硬盘导出为镜像 将系统盘或数据盘的数据导出为IMS镜像，导出的镜像在IMS的私有镜像列表中可以查 看并使用。
     *
     * @param CinderExportToImageRequest 请求对象
     * @return AsyncInvoker<CinderExportToImageRequest, CinderExportToImageResponse> */
    public AsyncInvoker<CinderExportToImageRequest, CinderExportToImageResponse> cinderExportToImageAsyncInvoker(
        CinderExportToImageRequest request) {
        return new AsyncInvoker<CinderExportToImageRequest, CinderExportToImageResponse>(request,
            EvsMeta.cinderExportToImage, hcClient);
    }

    /** 查询所有的可用分区信息 查询所有的可用分区信息。
     *
     * @param CinderListAvailabilityZonesRequest 请求对象
     * @return CompletableFuture<CinderListAvailabilityZonesResponse> */
    public CompletableFuture<CinderListAvailabilityZonesResponse> cinderListAvailabilityZonesAsync(
        CinderListAvailabilityZonesRequest request) {
        return hcClient.asyncInvokeHttp(request, EvsMeta.cinderListAvailabilityZones);
    }

    /** 查询所有的可用分区信息 查询所有的可用分区信息。
     *
     * @param CinderListAvailabilityZonesRequest 请求对象
     * @return AsyncInvoker<CinderListAvailabilityZonesRequest, CinderListAvailabilityZonesResponse> */
    public AsyncInvoker<CinderListAvailabilityZonesRequest, CinderListAvailabilityZonesResponse> cinderListAvailabilityZonesAsyncInvoker(
        CinderListAvailabilityZonesRequest request) {
        return new AsyncInvoker<CinderListAvailabilityZonesRequest, CinderListAvailabilityZonesResponse>(request,
            EvsMeta.cinderListAvailabilityZones, hcClient);
    }

    /** 查询租户的详细配额 查询租户的详细配额。
     *
     * @param CinderListQuotasRequest 请求对象
     * @return CompletableFuture<CinderListQuotasResponse> */
    public CompletableFuture<CinderListQuotasResponse> cinderListQuotasAsync(CinderListQuotasRequest request) {
        return hcClient.asyncInvokeHttp(request, EvsMeta.cinderListQuotas);
    }

    /** 查询租户的详细配额 查询租户的详细配额。
     *
     * @param CinderListQuotasRequest 请求对象
     * @return AsyncInvoker<CinderListQuotasRequest, CinderListQuotasResponse> */
    public AsyncInvoker<CinderListQuotasRequest, CinderListQuotasResponse> cinderListQuotasAsyncInvoker(
        CinderListQuotasRequest request) {
        return new AsyncInvoker<CinderListQuotasRequest, CinderListQuotasResponse>(request, EvsMeta.cinderListQuotas,
            hcClient);
    }

    /** 查询云硬盘类型列表 查询云硬盘类型列表。
     *
     * @param CinderListVolumeTypesRequest 请求对象
     * @return CompletableFuture<CinderListVolumeTypesResponse> */
    public CompletableFuture<CinderListVolumeTypesResponse> cinderListVolumeTypesAsync(
        CinderListVolumeTypesRequest request) {
        return hcClient.asyncInvokeHttp(request, EvsMeta.cinderListVolumeTypes);
    }

    /** 查询云硬盘类型列表 查询云硬盘类型列表。
     *
     * @param CinderListVolumeTypesRequest 请求对象
     * @return AsyncInvoker<CinderListVolumeTypesRequest, CinderListVolumeTypesResponse> */
    public AsyncInvoker<CinderListVolumeTypesRequest, CinderListVolumeTypesResponse> cinderListVolumeTypesAsyncInvoker(
        CinderListVolumeTypesRequest request) {
        return new AsyncInvoker<CinderListVolumeTypesRequest, CinderListVolumeTypesResponse>(request,
            EvsMeta.cinderListVolumeTypes, hcClient);
    }

    /** 创建云硬盘快照 创建云硬盘快照。
     *
     * @param CreateSnapshotRequest 请求对象
     * @return CompletableFuture<CreateSnapshotResponse> */
    public CompletableFuture<CreateSnapshotResponse> createSnapshotAsync(CreateSnapshotRequest request) {
        return hcClient.asyncInvokeHttp(request, EvsMeta.createSnapshot);
    }

    /** 创建云硬盘快照 创建云硬盘快照。
     *
     * @param CreateSnapshotRequest 请求对象
     * @return AsyncInvoker<CreateSnapshotRequest, CreateSnapshotResponse> */
    public AsyncInvoker<CreateSnapshotRequest, CreateSnapshotResponse> createSnapshotAsyncInvoker(
        CreateSnapshotRequest request) {
        return new AsyncInvoker<CreateSnapshotRequest, CreateSnapshotResponse>(request, EvsMeta.createSnapshot,
            hcClient);
    }

    /** 创建云硬盘 创建按需或包周期云硬盘。 在创建包周期云硬盘的场景下： -
     * 如果您需要查看订单可用的优惠券，请参考\&quot;[查询订单可用优惠券](https://support.huaweicloud.com/api-oce/zh-cn_topic_0092953630.html)\&quot;。
     * - 如果您需要支付订单，请参考\&quot;[支付包周期产品订单](https://support.huaweicloud.com/api-oce/zh-cn_topic_0075746561.html)\&quot;。 -
     * 如果您需要查询订单的资源开通详情，请参考\&quot;[查询订单的资源开通详情](https://support.huaweicloud.com/api-oce/api_order_00001.html)\&quot;。 -
     * 如果您需要退订该包周期资源，请参考“[退订包周期资源](https://support.huaweicloud.com/api-oce/zh-cn_topic_0082522030.html)”。
     *
     * @param CreateVolumeRequest 请求对象
     * @return CompletableFuture<CreateVolumeResponse> */
    public CompletableFuture<CreateVolumeResponse> createVolumeAsync(CreateVolumeRequest request) {
        return hcClient.asyncInvokeHttp(request, EvsMeta.createVolume);
    }

    /** 创建云硬盘 创建按需或包周期云硬盘。 在创建包周期云硬盘的场景下： -
     * 如果您需要查看订单可用的优惠券，请参考\&quot;[查询订单可用优惠券](https://support.huaweicloud.com/api-oce/zh-cn_topic_0092953630.html)\&quot;。
     * - 如果您需要支付订单，请参考\&quot;[支付包周期产品订单](https://support.huaweicloud.com/api-oce/zh-cn_topic_0075746561.html)\&quot;。 -
     * 如果您需要查询订单的资源开通详情，请参考\&quot;[查询订单的资源开通详情](https://support.huaweicloud.com/api-oce/api_order_00001.html)\&quot;。 -
     * 如果您需要退订该包周期资源，请参考“[退订包周期资源](https://support.huaweicloud.com/api-oce/zh-cn_topic_0082522030.html)”。
     *
     * @param CreateVolumeRequest 请求对象
     * @return AsyncInvoker<CreateVolumeRequest, CreateVolumeResponse> */
    public AsyncInvoker<CreateVolumeRequest, CreateVolumeResponse> createVolumeAsyncInvoker(
        CreateVolumeRequest request) {
        return new AsyncInvoker<CreateVolumeRequest, CreateVolumeResponse>(request, EvsMeta.createVolume, hcClient);
    }

    /** 删除云硬盘快照 删除云硬盘快照。
     *
     * @param DeleteSnapshotRequest 请求对象
     * @return CompletableFuture<DeleteSnapshotResponse> */
    public CompletableFuture<DeleteSnapshotResponse> deleteSnapshotAsync(DeleteSnapshotRequest request) {
        return hcClient.asyncInvokeHttp(request, EvsMeta.deleteSnapshot);
    }

    /** 删除云硬盘快照 删除云硬盘快照。
     *
     * @param DeleteSnapshotRequest 请求对象
     * @return AsyncInvoker<DeleteSnapshotRequest, DeleteSnapshotResponse> */
    public AsyncInvoker<DeleteSnapshotRequest, DeleteSnapshotResponse> deleteSnapshotAsyncInvoker(
        DeleteSnapshotRequest request) {
        return new AsyncInvoker<DeleteSnapshotRequest, DeleteSnapshotResponse>(request, EvsMeta.deleteSnapshot,
            hcClient);
    }

    /** 删除云硬盘 删除一个云硬盘。
     *
     * @param DeleteVolumeRequest 请求对象
     * @return CompletableFuture<DeleteVolumeResponse> */
    public CompletableFuture<DeleteVolumeResponse> deleteVolumeAsync(DeleteVolumeRequest request) {
        return hcClient.asyncInvokeHttp(request, EvsMeta.deleteVolume);
    }

    /** 删除云硬盘 删除一个云硬盘。
     *
     * @param DeleteVolumeRequest 请求对象
     * @return AsyncInvoker<DeleteVolumeRequest, DeleteVolumeResponse> */
    public AsyncInvoker<DeleteVolumeRequest, DeleteVolumeResponse> deleteVolumeAsyncInvoker(
        DeleteVolumeRequest request) {
        return new AsyncInvoker<DeleteVolumeRequest, DeleteVolumeResponse>(request, EvsMeta.deleteVolume, hcClient);
    }

    /** 查询云硬盘快照详细列表信息 查询云硬盘快照详细列表信息。
     *
     * @param ListSnapshotsRequest 请求对象
     * @return CompletableFuture<ListSnapshotsResponse> */
    public CompletableFuture<ListSnapshotsResponse> listSnapshotsAsync(ListSnapshotsRequest request) {
        return hcClient.asyncInvokeHttp(request, EvsMeta.listSnapshots);
    }

    /** 查询云硬盘快照详细列表信息 查询云硬盘快照详细列表信息。
     *
     * @param ListSnapshotsRequest 请求对象
     * @return AsyncInvoker<ListSnapshotsRequest, ListSnapshotsResponse> */
    public AsyncInvoker<ListSnapshotsRequest, ListSnapshotsResponse> listSnapshotsAsyncInvoker(
        ListSnapshotsRequest request) {
        return new AsyncInvoker<ListSnapshotsRequest, ListSnapshotsResponse>(request, EvsMeta.listSnapshots, hcClient);
    }

    /** 获取云硬盘资源的所有标签 获取某个租户的所有云硬盘资源的标签信息。
     *
     * @param ListVolumeTagsRequest 请求对象
     * @return CompletableFuture<ListVolumeTagsResponse> */
    public CompletableFuture<ListVolumeTagsResponse> listVolumeTagsAsync(ListVolumeTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, EvsMeta.listVolumeTags);
    }

    /** 获取云硬盘资源的所有标签 获取某个租户的所有云硬盘资源的标签信息。
     *
     * @param ListVolumeTagsRequest 请求对象
     * @return AsyncInvoker<ListVolumeTagsRequest, ListVolumeTagsResponse> */
    public AsyncInvoker<ListVolumeTagsRequest, ListVolumeTagsResponse> listVolumeTagsAsyncInvoker(
        ListVolumeTagsRequest request) {
        return new AsyncInvoker<ListVolumeTagsRequest, ListVolumeTagsResponse>(request, EvsMeta.listVolumeTags,
            hcClient);
    }

    /** 查询所有云硬盘详情 查询所有云硬盘的详细信息。
     *
     * @param ListVolumesRequest 请求对象
     * @return CompletableFuture<ListVolumesResponse> */
    public CompletableFuture<ListVolumesResponse> listVolumesAsync(ListVolumesRequest request) {
        return hcClient.asyncInvokeHttp(request, EvsMeta.listVolumes);
    }

    /** 查询所有云硬盘详情 查询所有云硬盘的详细信息。
     *
     * @param ListVolumesRequest 请求对象
     * @return AsyncInvoker<ListVolumesRequest, ListVolumesResponse> */
    public AsyncInvoker<ListVolumesRequest, ListVolumesResponse> listVolumesAsyncInvoker(ListVolumesRequest request) {
        return new AsyncInvoker<ListVolumesRequest, ListVolumesResponse>(request, EvsMeta.listVolumes, hcClient);
    }

    /** 通过标签查询云硬盘资源实例详情 通过标签查询云硬盘资源实例详情。
     *
     * @param ListVolumesByTagsRequest 请求对象
     * @return CompletableFuture<ListVolumesByTagsResponse> */
    public CompletableFuture<ListVolumesByTagsResponse> listVolumesByTagsAsync(ListVolumesByTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, EvsMeta.listVolumesByTags);
    }

    /** 通过标签查询云硬盘资源实例详情 通过标签查询云硬盘资源实例详情。
     *
     * @param ListVolumesByTagsRequest 请求对象
     * @return AsyncInvoker<ListVolumesByTagsRequest, ListVolumesByTagsResponse> */
    public AsyncInvoker<ListVolumesByTagsRequest, ListVolumesByTagsResponse> listVolumesByTagsAsyncInvoker(
        ListVolumesByTagsRequest request) {
        return new AsyncInvoker<ListVolumesByTagsRequest, ListVolumesByTagsResponse>(request, EvsMeta.listVolumesByTags,
            hcClient);
    }

    /** 扩容云硬盘 对按需或者包周期云硬盘进行扩容。 在扩容包周期云硬盘的场景下： -
     * 如果您需要查看订单可用的优惠券，请参考\&quot;[查询订单可用优惠券](https://support.huaweicloud.com/api-oce/zh-cn_topic_0092953630.html)\&quot;。
     * - 如果您需要支付订单，请参考\&quot;[支付包周期产品订单](https://support.huaweicloud.com/api-oce/zh-cn_topic_0075746561.html)\&quot;。 -
     * 如果您需要查询订单的资源开通详情，请参考\&quot;[查询订单的资源开通详情](https://support.huaweicloud.com/api-oce/api_order_00001.html)\&quot;。 -
     * 如果您需要退订该包周期资源，请参考“[退订包周期资源](https://support.huaweicloud.com/api-oce/zh-cn_topic_0082522030.html)”。
     *
     * @param ResizeVolumeRequest 请求对象
     * @return CompletableFuture<ResizeVolumeResponse> */
    public CompletableFuture<ResizeVolumeResponse> resizeVolumeAsync(ResizeVolumeRequest request) {
        return hcClient.asyncInvokeHttp(request, EvsMeta.resizeVolume);
    }

    /** 扩容云硬盘 对按需或者包周期云硬盘进行扩容。 在扩容包周期云硬盘的场景下： -
     * 如果您需要查看订单可用的优惠券，请参考\&quot;[查询订单可用优惠券](https://support.huaweicloud.com/api-oce/zh-cn_topic_0092953630.html)\&quot;。
     * - 如果您需要支付订单，请参考\&quot;[支付包周期产品订单](https://support.huaweicloud.com/api-oce/zh-cn_topic_0075746561.html)\&quot;。 -
     * 如果您需要查询订单的资源开通详情，请参考\&quot;[查询订单的资源开通详情](https://support.huaweicloud.com/api-oce/api_order_00001.html)\&quot;。 -
     * 如果您需要退订该包周期资源，请参考“[退订包周期资源](https://support.huaweicloud.com/api-oce/zh-cn_topic_0082522030.html)”。
     *
     * @param ResizeVolumeRequest 请求对象
     * @return AsyncInvoker<ResizeVolumeRequest, ResizeVolumeResponse> */
    public AsyncInvoker<ResizeVolumeRequest, ResizeVolumeResponse> resizeVolumeAsyncInvoker(
        ResizeVolumeRequest request) {
        return new AsyncInvoker<ResizeVolumeRequest, ResizeVolumeResponse>(request, EvsMeta.resizeVolume, hcClient);
    }

    /** 回滚快照到云硬盘 将快照数据回滚到云硬盘。支持企业项目授权功能。
     *
     * @param RollbackSnapshotRequest 请求对象
     * @return CompletableFuture<RollbackSnapshotResponse> */
    public CompletableFuture<RollbackSnapshotResponse> rollbackSnapshotAsync(RollbackSnapshotRequest request) {
        return hcClient.asyncInvokeHttp(request, EvsMeta.rollbackSnapshot);
    }

    /** 回滚快照到云硬盘 将快照数据回滚到云硬盘。支持企业项目授权功能。
     *
     * @param RollbackSnapshotRequest 请求对象
     * @return AsyncInvoker<RollbackSnapshotRequest, RollbackSnapshotResponse> */
    public AsyncInvoker<RollbackSnapshotRequest, RollbackSnapshotResponse> rollbackSnapshotAsyncInvoker(
        RollbackSnapshotRequest request) {
        return new AsyncInvoker<RollbackSnapshotRequest, RollbackSnapshotResponse>(request, EvsMeta.rollbackSnapshot,
            hcClient);
    }

    /** 查询job的状态 查询Job的执行状态。 可用于查询创建云硬盘，扩容云硬盘，删除云硬盘等API的执行状态。
     *
     * @param ShowJobRequest 请求对象
     * @return CompletableFuture<ShowJobResponse> */
    public CompletableFuture<ShowJobResponse> showJobAsync(ShowJobRequest request) {
        return hcClient.asyncInvokeHttp(request, EvsMeta.showJob);
    }

    /** 查询job的状态 查询Job的执行状态。 可用于查询创建云硬盘，扩容云硬盘，删除云硬盘等API的执行状态。
     *
     * @param ShowJobRequest 请求对象
     * @return AsyncInvoker<ShowJobRequest, ShowJobResponse> */
    public AsyncInvoker<ShowJobRequest, ShowJobResponse> showJobAsyncInvoker(ShowJobRequest request) {
        return new AsyncInvoker<ShowJobRequest, ShowJobResponse>(request, EvsMeta.showJob, hcClient);
    }

    /** 查询单个云硬盘快照详细信息 查询单个云硬盘快照信息。支持企业项目授权功能。
     *
     * @param ShowSnapshotRequest 请求对象
     * @return CompletableFuture<ShowSnapshotResponse> */
    public CompletableFuture<ShowSnapshotResponse> showSnapshotAsync(ShowSnapshotRequest request) {
        return hcClient.asyncInvokeHttp(request, EvsMeta.showSnapshot);
    }

    /** 查询单个云硬盘快照详细信息 查询单个云硬盘快照信息。支持企业项目授权功能。
     *
     * @param ShowSnapshotRequest 请求对象
     * @return AsyncInvoker<ShowSnapshotRequest, ShowSnapshotResponse> */
    public AsyncInvoker<ShowSnapshotRequest, ShowSnapshotResponse> showSnapshotAsyncInvoker(
        ShowSnapshotRequest request) {
        return new AsyncInvoker<ShowSnapshotRequest, ShowSnapshotResponse>(request, EvsMeta.showSnapshot, hcClient);
    }

    /** 查询单个云硬盘详情 查询单个云硬盘的详细信息。支持企业项目授权功能。
     *
     * @param ShowVolumeRequest 请求对象
     * @return CompletableFuture<ShowVolumeResponse> */
    public CompletableFuture<ShowVolumeResponse> showVolumeAsync(ShowVolumeRequest request) {
        return hcClient.asyncInvokeHttp(request, EvsMeta.showVolume);
    }

    /** 查询单个云硬盘详情 查询单个云硬盘的详细信息。支持企业项目授权功能。
     *
     * @param ShowVolumeRequest 请求对象
     * @return AsyncInvoker<ShowVolumeRequest, ShowVolumeResponse> */
    public AsyncInvoker<ShowVolumeRequest, ShowVolumeResponse> showVolumeAsyncInvoker(ShowVolumeRequest request) {
        return new AsyncInvoker<ShowVolumeRequest, ShowVolumeResponse>(request, EvsMeta.showVolume, hcClient);
    }

    /** 查询云硬盘标签 查询指定云硬盘的标签信息。
     *
     * @param ShowVolumeTagsRequest 请求对象
     * @return CompletableFuture<ShowVolumeTagsResponse> */
    public CompletableFuture<ShowVolumeTagsResponse> showVolumeTagsAsync(ShowVolumeTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, EvsMeta.showVolumeTags);
    }

    /** 查询云硬盘标签 查询指定云硬盘的标签信息。
     *
     * @param ShowVolumeTagsRequest 请求对象
     * @return AsyncInvoker<ShowVolumeTagsRequest, ShowVolumeTagsResponse> */
    public AsyncInvoker<ShowVolumeTagsRequest, ShowVolumeTagsResponse> showVolumeTagsAsyncInvoker(
        ShowVolumeTagsRequest request) {
        return new AsyncInvoker<ShowVolumeTagsRequest, ShowVolumeTagsResponse>(request, EvsMeta.showVolumeTags,
            hcClient);
    }

    /** 更新云硬盘快照 更新云硬盘快照。支持企业项目授权功能。
     *
     * @param UpdateSnapshotRequest 请求对象
     * @return CompletableFuture<UpdateSnapshotResponse> */
    public CompletableFuture<UpdateSnapshotResponse> updateSnapshotAsync(UpdateSnapshotRequest request) {
        return hcClient.asyncInvokeHttp(request, EvsMeta.updateSnapshot);
    }

    /** 更新云硬盘快照 更新云硬盘快照。支持企业项目授权功能。
     *
     * @param UpdateSnapshotRequest 请求对象
     * @return AsyncInvoker<UpdateSnapshotRequest, UpdateSnapshotResponse> */
    public AsyncInvoker<UpdateSnapshotRequest, UpdateSnapshotResponse> updateSnapshotAsyncInvoker(
        UpdateSnapshotRequest request) {
        return new AsyncInvoker<UpdateSnapshotRequest, UpdateSnapshotResponse>(request, EvsMeta.updateSnapshot,
            hcClient);
    }

    /** 更新云硬盘 更新一个云硬盘的名称和描述。
     *
     * @param UpdateVolumeRequest 请求对象
     * @return CompletableFuture<UpdateVolumeResponse> */
    public CompletableFuture<UpdateVolumeResponse> updateVolumeAsync(UpdateVolumeRequest request) {
        return hcClient.asyncInvokeHttp(request, EvsMeta.updateVolume);
    }

    /** 更新云硬盘 更新一个云硬盘的名称和描述。
     *
     * @param UpdateVolumeRequest 请求对象
     * @return AsyncInvoker<UpdateVolumeRequest, UpdateVolumeResponse> */
    public AsyncInvoker<UpdateVolumeRequest, UpdateVolumeResponse> updateVolumeAsyncInvoker(
        UpdateVolumeRequest request) {
        return new AsyncInvoker<UpdateVolumeRequest, UpdateVolumeResponse>(request, EvsMeta.updateVolume, hcClient);
    }

}
