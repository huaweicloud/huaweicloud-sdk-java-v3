package com.huaweicloud.sdk.evs.v2;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
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
import com.huaweicloud.sdk.evs.v2.model.UpdateSnapshotRequest;
import com.huaweicloud.sdk.evs.v2.model.UpdateSnapshotResponse;
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
     * 为指定云硬盘批量添加标签
     *
     * 为指定云硬盘批量添加标签。
     * 
     * 添加标签时，如果云硬盘的标签已存在相同key，则会覆盖已有标签。
     * 单个云硬盘最多支持创建10个标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchCreateVolumeTagsRequest 请求对象
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
     * @param BatchCreateVolumeTagsRequest 请求对象
     * @return AsyncInvoker<BatchCreateVolumeTagsRequest, BatchCreateVolumeTagsResponse>
     */
    public AsyncInvoker<BatchCreateVolumeTagsRequest, BatchCreateVolumeTagsResponse> batchCreateVolumeTagsAsyncInvoker(
        BatchCreateVolumeTagsRequest request) {
        return new AsyncInvoker<BatchCreateVolumeTagsRequest, BatchCreateVolumeTagsResponse>(request,
            EvsMeta.batchCreateVolumeTags, hcClient);
    }

    /**
     * 为指定云硬盘批量删除标签
     *
     * 为指定云硬盘批量删除标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchDeleteVolumeTagsRequest 请求对象
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
     * @param BatchDeleteVolumeTagsRequest 请求对象
     * @return AsyncInvoker<BatchDeleteVolumeTagsRequest, BatchDeleteVolumeTagsResponse>
     */
    public AsyncInvoker<BatchDeleteVolumeTagsRequest, BatchDeleteVolumeTagsResponse> batchDeleteVolumeTagsAsyncInvoker(
        BatchDeleteVolumeTagsRequest request) {
        return new AsyncInvoker<BatchDeleteVolumeTagsRequest, BatchDeleteVolumeTagsResponse>(request,
            EvsMeta.batchDeleteVolumeTags, hcClient);
    }

    /**
     * 接受云硬盘过户
     *
     * 通过云硬盘过户记录ID以及身份认证密钥来接受云硬盘过户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CinderAcceptVolumeTransferRequest 请求对象
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
     * @param CinderAcceptVolumeTransferRequest 请求对象
     * @return AsyncInvoker<CinderAcceptVolumeTransferRequest, CinderAcceptVolumeTransferResponse>
     */
    public AsyncInvoker<CinderAcceptVolumeTransferRequest, CinderAcceptVolumeTransferResponse> cinderAcceptVolumeTransferAsyncInvoker(
        CinderAcceptVolumeTransferRequest request) {
        return new AsyncInvoker<CinderAcceptVolumeTransferRequest, CinderAcceptVolumeTransferResponse>(request,
            EvsMeta.cinderAcceptVolumeTransfer, hcClient);
    }

    /**
     * 创建云硬盘过户
     *
     * 指定云硬盘来创建云硬盘过户记录，创建成功后，会返回过户记录ID以及身份认证密钥。
     * 云硬盘在过户过程中的状态变化如下：创建云硬盘过户后，云硬盘状态由“available”变为“awaiting-transfer”。当云硬盘过户被接收后，云硬盘状态变为“available”。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CinderCreateVolumeTransferRequest 请求对象
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
     * @param CinderCreateVolumeTransferRequest 请求对象
     * @return AsyncInvoker<CinderCreateVolumeTransferRequest, CinderCreateVolumeTransferResponse>
     */
    public AsyncInvoker<CinderCreateVolumeTransferRequest, CinderCreateVolumeTransferResponse> cinderCreateVolumeTransferAsyncInvoker(
        CinderCreateVolumeTransferRequest request) {
        return new AsyncInvoker<CinderCreateVolumeTransferRequest, CinderCreateVolumeTransferResponse>(request,
            EvsMeta.cinderCreateVolumeTransfer, hcClient);
    }

    /**
     * 删除云硬盘过户
     *
     * 当云硬盘过户未被接受时，您可以删除云硬盘过户记录，接受后则无法执行删除操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CinderDeleteVolumeTransferRequest 请求对象
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
     * @param CinderDeleteVolumeTransferRequest 请求对象
     * @return AsyncInvoker<CinderDeleteVolumeTransferRequest, CinderDeleteVolumeTransferResponse>
     */
    public AsyncInvoker<CinderDeleteVolumeTransferRequest, CinderDeleteVolumeTransferResponse> cinderDeleteVolumeTransferAsyncInvoker(
        CinderDeleteVolumeTransferRequest request) {
        return new AsyncInvoker<CinderDeleteVolumeTransferRequest, CinderDeleteVolumeTransferResponse>(request,
            EvsMeta.cinderDeleteVolumeTransfer, hcClient);
    }

    /**
     * 查询所有的可用分区信息
     *
     * 查询所有的可用分区信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CinderListAvailabilityZonesRequest 请求对象
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
     * @param CinderListAvailabilityZonesRequest 请求对象
     * @return AsyncInvoker<CinderListAvailabilityZonesRequest, CinderListAvailabilityZonesResponse>
     */
    public AsyncInvoker<CinderListAvailabilityZonesRequest, CinderListAvailabilityZonesResponse> cinderListAvailabilityZonesAsyncInvoker(
        CinderListAvailabilityZonesRequest request) {
        return new AsyncInvoker<CinderListAvailabilityZonesRequest, CinderListAvailabilityZonesResponse>(request,
            EvsMeta.cinderListAvailabilityZones, hcClient);
    }

    /**
     * 查询租户的详细配额
     *
     * 查询租户的详细配额。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CinderListQuotasRequest 请求对象
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
     * @param CinderListQuotasRequest 请求对象
     * @return AsyncInvoker<CinderListQuotasRequest, CinderListQuotasResponse>
     */
    public AsyncInvoker<CinderListQuotasRequest, CinderListQuotasResponse> cinderListQuotasAsyncInvoker(
        CinderListQuotasRequest request) {
        return new AsyncInvoker<CinderListQuotasRequest, CinderListQuotasResponse>(request, EvsMeta.cinderListQuotas,
            hcClient);
    }

    /**
     * 查询云硬盘过户记录列表概要
     *
     * 查询当前租户下所有云硬盘的过户记录列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CinderListVolumeTransfersRequest 请求对象
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
     * @param CinderListVolumeTransfersRequest 请求对象
     * @return AsyncInvoker<CinderListVolumeTransfersRequest, CinderListVolumeTransfersResponse>
     */
    public AsyncInvoker<CinderListVolumeTransfersRequest, CinderListVolumeTransfersResponse> cinderListVolumeTransfersAsyncInvoker(
        CinderListVolumeTransfersRequest request) {
        return new AsyncInvoker<CinderListVolumeTransfersRequest, CinderListVolumeTransfersResponse>(request,
            EvsMeta.cinderListVolumeTransfers, hcClient);
    }

    /**
     * 查询云硬盘类型列表
     *
     * 查询云硬盘类型列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CinderListVolumeTypesRequest 请求对象
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
     * @param CinderListVolumeTypesRequest 请求对象
     * @return AsyncInvoker<CinderListVolumeTypesRequest, CinderListVolumeTypesResponse>
     */
    public AsyncInvoker<CinderListVolumeTypesRequest, CinderListVolumeTypesResponse> cinderListVolumeTypesAsyncInvoker(
        CinderListVolumeTypesRequest request) {
        return new AsyncInvoker<CinderListVolumeTypesRequest, CinderListVolumeTypesResponse>(request,
            EvsMeta.cinderListVolumeTypes, hcClient);
    }

    /**
     * 查询单个云硬盘过户记录详情
     *
     * 查询单个云硬盘的过户记录详情，比如过户记录创建时间、ID以及名称等信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CinderShowVolumeTransferRequest 请求对象
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
     * @param CinderShowVolumeTransferRequest 请求对象
     * @return AsyncInvoker<CinderShowVolumeTransferRequest, CinderShowVolumeTransferResponse>
     */
    public AsyncInvoker<CinderShowVolumeTransferRequest, CinderShowVolumeTransferResponse> cinderShowVolumeTransferAsyncInvoker(
        CinderShowVolumeTransferRequest request) {
        return new AsyncInvoker<CinderShowVolumeTransferRequest, CinderShowVolumeTransferResponse>(request,
            EvsMeta.cinderShowVolumeTransfer, hcClient);
    }

    /**
     * 创建云硬盘快照
     *
     * 创建云硬盘快照。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateSnapshotRequest 请求对象
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
     * @param CreateSnapshotRequest 请求对象
     * @return AsyncInvoker<CreateSnapshotRequest, CreateSnapshotResponse>
     */
    public AsyncInvoker<CreateSnapshotRequest, CreateSnapshotResponse> createSnapshotAsyncInvoker(
        CreateSnapshotRequest request) {
        return new AsyncInvoker<CreateSnapshotRequest, CreateSnapshotResponse>(request, EvsMeta.createSnapshot,
            hcClient);
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
     * @param CreateVolumeRequest 请求对象
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
     * @param CreateVolumeRequest 请求对象
     * @return AsyncInvoker<CreateVolumeRequest, CreateVolumeResponse>
     */
    public AsyncInvoker<CreateVolumeRequest, CreateVolumeResponse> createVolumeAsyncInvoker(
        CreateVolumeRequest request) {
        return new AsyncInvoker<CreateVolumeRequest, CreateVolumeResponse>(request, EvsMeta.createVolume, hcClient);
    }

    /**
     * 删除云硬盘快照
     *
     * 删除云硬盘快照。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteSnapshotRequest 请求对象
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
     * @param DeleteSnapshotRequest 请求对象
     * @return AsyncInvoker<DeleteSnapshotRequest, DeleteSnapshotResponse>
     */
    public AsyncInvoker<DeleteSnapshotRequest, DeleteSnapshotResponse> deleteSnapshotAsyncInvoker(
        DeleteSnapshotRequest request) {
        return new AsyncInvoker<DeleteSnapshotRequest, DeleteSnapshotResponse>(request, EvsMeta.deleteSnapshot,
            hcClient);
    }

    /**
     * 删除云硬盘
     *
     * 删除一个云硬盘。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteVolumeRequest 请求对象
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
     * @param DeleteVolumeRequest 请求对象
     * @return AsyncInvoker<DeleteVolumeRequest, DeleteVolumeResponse>
     */
    public AsyncInvoker<DeleteVolumeRequest, DeleteVolumeResponse> deleteVolumeAsyncInvoker(
        DeleteVolumeRequest request) {
        return new AsyncInvoker<DeleteVolumeRequest, DeleteVolumeResponse>(request, EvsMeta.deleteVolume, hcClient);
    }

    /**
     * 查询云硬盘快照详情列表
     *
     * 查询云硬盘快照详细列表信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSnapshotsRequest 请求对象
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
     * @param ListSnapshotsRequest 请求对象
     * @return AsyncInvoker<ListSnapshotsRequest, ListSnapshotsResponse>
     */
    public AsyncInvoker<ListSnapshotsRequest, ListSnapshotsResponse> listSnapshotsAsyncInvoker(
        ListSnapshotsRequest request) {
        return new AsyncInvoker<ListSnapshotsRequest, ListSnapshotsResponse>(request, EvsMeta.listSnapshots, hcClient);
    }

    /**
     * 获取云硬盘资源的所有标签
     *
     * 获取某个租户的所有云硬盘资源的标签信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListVolumeTagsRequest 请求对象
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
     * @param ListVolumeTagsRequest 请求对象
     * @return AsyncInvoker<ListVolumeTagsRequest, ListVolumeTagsResponse>
     */
    public AsyncInvoker<ListVolumeTagsRequest, ListVolumeTagsResponse> listVolumeTagsAsyncInvoker(
        ListVolumeTagsRequest request) {
        return new AsyncInvoker<ListVolumeTagsRequest, ListVolumeTagsResponse>(request, EvsMeta.listVolumeTags,
            hcClient);
    }

    /**
     * 查询所有云硬盘详情
     *
     * 查询所有云硬盘的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListVolumesRequest 请求对象
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
     * @param ListVolumesRequest 请求对象
     * @return AsyncInvoker<ListVolumesRequest, ListVolumesResponse>
     */
    public AsyncInvoker<ListVolumesRequest, ListVolumesResponse> listVolumesAsyncInvoker(ListVolumesRequest request) {
        return new AsyncInvoker<ListVolumesRequest, ListVolumesResponse>(request, EvsMeta.listVolumes, hcClient);
    }

    /**
     * 通过标签查询云硬盘资源实例详情
     *
     * 通过标签查询云硬盘资源实例详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListVolumesByTagsRequest 请求对象
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
     * @param ListVolumesByTagsRequest 请求对象
     * @return AsyncInvoker<ListVolumesByTagsRequest, ListVolumesByTagsResponse>
     */
    public AsyncInvoker<ListVolumesByTagsRequest, ListVolumesByTagsResponse> listVolumesByTagsAsyncInvoker(
        ListVolumesByTagsRequest request) {
        return new AsyncInvoker<ListVolumesByTagsRequest, ListVolumesByTagsResponse>(request, EvsMeta.listVolumesByTags,
            hcClient);
    }

    /**
     * 修改云硬盘QoS
     *
     * 调整云硬盘的iops或者吞吐量。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ModifyVolumeQoSRequest 请求对象
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
     * @param ModifyVolumeQoSRequest 请求对象
     * @return AsyncInvoker<ModifyVolumeQoSRequest, ModifyVolumeQoSResponse>
     */
    public AsyncInvoker<ModifyVolumeQoSRequest, ModifyVolumeQoSResponse> modifyVolumeQoSAsyncInvoker(
        ModifyVolumeQoSRequest request) {
        return new AsyncInvoker<ModifyVolumeQoSRequest, ModifyVolumeQoSResponse>(request, EvsMeta.modifyVolumeQoS,
            hcClient);
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
     * @param ResizeVolumeRequest 请求对象
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
     * @param ResizeVolumeRequest 请求对象
     * @return AsyncInvoker<ResizeVolumeRequest, ResizeVolumeResponse>
     */
    public AsyncInvoker<ResizeVolumeRequest, ResizeVolumeResponse> resizeVolumeAsyncInvoker(
        ResizeVolumeRequest request) {
        return new AsyncInvoker<ResizeVolumeRequest, ResizeVolumeResponse>(request, EvsMeta.resizeVolume, hcClient);
    }

    /**
     * 回滚快照到云硬盘
     *
     * 将快照数据回滚到云硬盘。支持企业项目授权功能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RollbackSnapshotRequest 请求对象
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
     * @param RollbackSnapshotRequest 请求对象
     * @return AsyncInvoker<RollbackSnapshotRequest, RollbackSnapshotResponse>
     */
    public AsyncInvoker<RollbackSnapshotRequest, RollbackSnapshotResponse> rollbackSnapshotAsyncInvoker(
        RollbackSnapshotRequest request) {
        return new AsyncInvoker<RollbackSnapshotRequest, RollbackSnapshotResponse>(request, EvsMeta.rollbackSnapshot,
            hcClient);
    }

    /**
     * 查询job的状态
     *
     * 查询Job的执行状态。
     * 可用于查询创建云硬盘，扩容云硬盘，删除云硬盘等API的执行状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowJobRequest 请求对象
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
     * @param ShowJobRequest 请求对象
     * @return AsyncInvoker<ShowJobRequest, ShowJobResponse>
     */
    public AsyncInvoker<ShowJobRequest, ShowJobResponse> showJobAsyncInvoker(ShowJobRequest request) {
        return new AsyncInvoker<ShowJobRequest, ShowJobResponse>(request, EvsMeta.showJob, hcClient);
    }

    /**
     * 查询单个云硬盘快照详情
     *
     * 查询单个云硬盘快照信息。支持企业项目授权功能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowSnapshotRequest 请求对象
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
     * @param ShowSnapshotRequest 请求对象
     * @return AsyncInvoker<ShowSnapshotRequest, ShowSnapshotResponse>
     */
    public AsyncInvoker<ShowSnapshotRequest, ShowSnapshotResponse> showSnapshotAsyncInvoker(
        ShowSnapshotRequest request) {
        return new AsyncInvoker<ShowSnapshotRequest, ShowSnapshotResponse>(request, EvsMeta.showSnapshot, hcClient);
    }

    /**
     * 查询单个云硬盘详情
     *
     * 查询单个云硬盘的详细信息。支持企业项目授权功能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowVolumeRequest 请求对象
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
     * @param ShowVolumeRequest 请求对象
     * @return AsyncInvoker<ShowVolumeRequest, ShowVolumeResponse>
     */
    public AsyncInvoker<ShowVolumeRequest, ShowVolumeResponse> showVolumeAsyncInvoker(ShowVolumeRequest request) {
        return new AsyncInvoker<ShowVolumeRequest, ShowVolumeResponse>(request, EvsMeta.showVolume, hcClient);
    }

    /**
     * 查询云硬盘标签
     *
     * 查询指定云硬盘的标签信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowVolumeTagsRequest 请求对象
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
     * @param ShowVolumeTagsRequest 请求对象
     * @return AsyncInvoker<ShowVolumeTagsRequest, ShowVolumeTagsResponse>
     */
    public AsyncInvoker<ShowVolumeTagsRequest, ShowVolumeTagsResponse> showVolumeTagsAsyncInvoker(
        ShowVolumeTagsRequest request) {
        return new AsyncInvoker<ShowVolumeTagsRequest, ShowVolumeTagsResponse>(request, EvsMeta.showVolumeTags,
            hcClient);
    }

    /**
     * 更新云硬盘快照
     *
     * 更新云硬盘快照。支持企业项目授权功能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateSnapshotRequest 请求对象
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
     * @param UpdateSnapshotRequest 请求对象
     * @return AsyncInvoker<UpdateSnapshotRequest, UpdateSnapshotResponse>
     */
    public AsyncInvoker<UpdateSnapshotRequest, UpdateSnapshotResponse> updateSnapshotAsyncInvoker(
        UpdateSnapshotRequest request) {
        return new AsyncInvoker<UpdateSnapshotRequest, UpdateSnapshotResponse>(request, EvsMeta.updateSnapshot,
            hcClient);
    }

    /**
     * 更新云硬盘
     *
     * 更新一个云硬盘的名称和描述。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateVolumeRequest 请求对象
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
     * @param UpdateVolumeRequest 请求对象
     * @return AsyncInvoker<UpdateVolumeRequest, UpdateVolumeResponse>
     */
    public AsyncInvoker<UpdateVolumeRequest, UpdateVolumeResponse> updateVolumeAsyncInvoker(
        UpdateVolumeRequest request) {
        return new AsyncInvoker<UpdateVolumeRequest, UpdateVolumeResponse>(request, EvsMeta.updateVolume, hcClient);
    }

    /**
     * 查询接口版本信息列表
     *
     * 查询接口版本信息列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListVersionsRequest 请求对象
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
     * @param ListVersionsRequest 请求对象
     * @return AsyncInvoker<ListVersionsRequest, ListVersionsResponse>
     */
    public AsyncInvoker<ListVersionsRequest, ListVersionsResponse> listVersionsAsyncInvoker(
        ListVersionsRequest request) {
        return new AsyncInvoker<ListVersionsRequest, ListVersionsResponse>(request, EvsMeta.listVersions, hcClient);
    }

    /**
     * 查询API接口的版本信息
     *
     * 查询接口的指定版本信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowVersionRequest 请求对象
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
     * @param ShowVersionRequest 请求对象
     * @return AsyncInvoker<ShowVersionRequest, ShowVersionResponse>
     */
    public AsyncInvoker<ShowVersionRequest, ShowVersionResponse> showVersionAsyncInvoker(ShowVersionRequest request) {
        return new AsyncInvoker<ShowVersionRequest, ShowVersionResponse>(request, EvsMeta.showVersion, hcClient);
    }

}
