package com.huaweicloud.sdk.eip.v2;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.eip.v2.model.AddPublicipsIntoSharedBandwidthRequest;
import com.huaweicloud.sdk.eip.v2.model.AddPublicipsIntoSharedBandwidthResponse;
import com.huaweicloud.sdk.eip.v2.model.BatchCreatePublicipTagsRequest;
import com.huaweicloud.sdk.eip.v2.model.BatchCreatePublicipTagsResponse;
import com.huaweicloud.sdk.eip.v2.model.BatchCreatePublicipsRequest;
import com.huaweicloud.sdk.eip.v2.model.BatchCreatePublicipsResponse;
import com.huaweicloud.sdk.eip.v2.model.BatchCreateSharedBandwidthsRequest;
import com.huaweicloud.sdk.eip.v2.model.BatchCreateSharedBandwidthsResponse;
import com.huaweicloud.sdk.eip.v2.model.BatchDeletePublicIpRequest;
import com.huaweicloud.sdk.eip.v2.model.BatchDeletePublicIpResponse;
import com.huaweicloud.sdk.eip.v2.model.BatchDeletePublicipTagsRequest;
import com.huaweicloud.sdk.eip.v2.model.BatchDeletePublicipTagsResponse;
import com.huaweicloud.sdk.eip.v2.model.BatchDisassociatePublicipsRequest;
import com.huaweicloud.sdk.eip.v2.model.BatchDisassociatePublicipsResponse;
import com.huaweicloud.sdk.eip.v2.model.BatchModifyBandwidthRequest;
import com.huaweicloud.sdk.eip.v2.model.BatchModifyBandwidthResponse;
import com.huaweicloud.sdk.eip.v2.model.ChangeBandwidthToPeriodRequest;
import com.huaweicloud.sdk.eip.v2.model.ChangeBandwidthToPeriodResponse;
import com.huaweicloud.sdk.eip.v2.model.ChangePublicipToPeriodRequest;
import com.huaweicloud.sdk.eip.v2.model.ChangePublicipToPeriodResponse;
import com.huaweicloud.sdk.eip.v2.model.CountPublicIpInstanceRequest;
import com.huaweicloud.sdk.eip.v2.model.CountPublicIpInstanceResponse;
import com.huaweicloud.sdk.eip.v2.model.CountPublicIpRequest;
import com.huaweicloud.sdk.eip.v2.model.CountPublicIpResponse;
import com.huaweicloud.sdk.eip.v2.model.CreatePrePaidPublicipRequest;
import com.huaweicloud.sdk.eip.v2.model.CreatePrePaidPublicipResponse;
import com.huaweicloud.sdk.eip.v2.model.CreatePublicipRequest;
import com.huaweicloud.sdk.eip.v2.model.CreatePublicipResponse;
import com.huaweicloud.sdk.eip.v2.model.CreatePublicipTagRequest;
import com.huaweicloud.sdk.eip.v2.model.CreatePublicipTagResponse;
import com.huaweicloud.sdk.eip.v2.model.CreateSharedBandwidthRequest;
import com.huaweicloud.sdk.eip.v2.model.CreateSharedBandwidthResponse;
import com.huaweicloud.sdk.eip.v2.model.DeletePublicipRequest;
import com.huaweicloud.sdk.eip.v2.model.DeletePublicipResponse;
import com.huaweicloud.sdk.eip.v2.model.DeletePublicipTagRequest;
import com.huaweicloud.sdk.eip.v2.model.DeletePublicipTagResponse;
import com.huaweicloud.sdk.eip.v2.model.DeleteSharedBandwidthRequest;
import com.huaweicloud.sdk.eip.v2.model.DeleteSharedBandwidthResponse;
import com.huaweicloud.sdk.eip.v2.model.ListBandwidthPkgRequest;
import com.huaweicloud.sdk.eip.v2.model.ListBandwidthPkgResponse;
import com.huaweicloud.sdk.eip.v2.model.ListBandwidthsRequest;
import com.huaweicloud.sdk.eip.v2.model.ListBandwidthsResponse;
import com.huaweicloud.sdk.eip.v2.model.ListPublicipTagsRequest;
import com.huaweicloud.sdk.eip.v2.model.ListPublicipTagsResponse;
import com.huaweicloud.sdk.eip.v2.model.ListPublicipsByTagsRequest;
import com.huaweicloud.sdk.eip.v2.model.ListPublicipsByTagsResponse;
import com.huaweicloud.sdk.eip.v2.model.ListPublicipsRequest;
import com.huaweicloud.sdk.eip.v2.model.ListPublicipsResponse;
import com.huaweicloud.sdk.eip.v2.model.ListQuotasRequest;
import com.huaweicloud.sdk.eip.v2.model.ListQuotasResponse;
import com.huaweicloud.sdk.eip.v2.model.NeutronCreateFloatingIpRequest;
import com.huaweicloud.sdk.eip.v2.model.NeutronCreateFloatingIpResponse;
import com.huaweicloud.sdk.eip.v2.model.NeutronDeleteFloatingIpRequest;
import com.huaweicloud.sdk.eip.v2.model.NeutronDeleteFloatingIpResponse;
import com.huaweicloud.sdk.eip.v2.model.NeutronListFloatingIpsRequest;
import com.huaweicloud.sdk.eip.v2.model.NeutronListFloatingIpsResponse;
import com.huaweicloud.sdk.eip.v2.model.NeutronShowFloatingIpRequest;
import com.huaweicloud.sdk.eip.v2.model.NeutronShowFloatingIpResponse;
import com.huaweicloud.sdk.eip.v2.model.NeutronUpdateFloatingIpRequest;
import com.huaweicloud.sdk.eip.v2.model.NeutronUpdateFloatingIpResponse;
import com.huaweicloud.sdk.eip.v2.model.RemovePublicipsFromSharedBandwidthRequest;
import com.huaweicloud.sdk.eip.v2.model.RemovePublicipsFromSharedBandwidthResponse;
import com.huaweicloud.sdk.eip.v2.model.ShowBandwidthRequest;
import com.huaweicloud.sdk.eip.v2.model.ShowBandwidthResponse;
import com.huaweicloud.sdk.eip.v2.model.ShowPublicIpTypeRequest;
import com.huaweicloud.sdk.eip.v2.model.ShowPublicIpTypeResponse;
import com.huaweicloud.sdk.eip.v2.model.ShowPublicipRequest;
import com.huaweicloud.sdk.eip.v2.model.ShowPublicipResponse;
import com.huaweicloud.sdk.eip.v2.model.ShowPublicipTagsRequest;
import com.huaweicloud.sdk.eip.v2.model.ShowPublicipTagsResponse;
import com.huaweicloud.sdk.eip.v2.model.ShowResourcesJobDetailRequest;
import com.huaweicloud.sdk.eip.v2.model.ShowResourcesJobDetailResponse;
import com.huaweicloud.sdk.eip.v2.model.UpdateBandwidthRequest;
import com.huaweicloud.sdk.eip.v2.model.UpdateBandwidthResponse;
import com.huaweicloud.sdk.eip.v2.model.UpdatePrePaidBandwidthRequest;
import com.huaweicloud.sdk.eip.v2.model.UpdatePrePaidBandwidthResponse;
import com.huaweicloud.sdk.eip.v2.model.UpdatePublicipRequest;
import com.huaweicloud.sdk.eip.v2.model.UpdatePublicipResponse;

import java.util.concurrent.CompletableFuture;

public class EipAsyncClient {

    protected HcClient hcClient;

    public EipAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<EipAsyncClient> newBuilder() {
        ClientBuilder<EipAsyncClient> clientBuilder = new ClientBuilder<>(EipAsyncClient::new);
        return clientBuilder;
    }

    /**
     * 共享带宽插入弹性公网IP
     *
     * 共享带宽插入弹性公网IP。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddPublicipsIntoSharedBandwidthRequest 请求对象
     * @return CompletableFuture<AddPublicipsIntoSharedBandwidthResponse>
     */
    public CompletableFuture<AddPublicipsIntoSharedBandwidthResponse> addPublicipsIntoSharedBandwidthAsync(
        AddPublicipsIntoSharedBandwidthRequest request) {
        return hcClient.asyncInvokeHttp(request, EipMeta.addPublicipsIntoSharedBandwidth);
    }

    /**
     * 共享带宽插入弹性公网IP
     *
     * 共享带宽插入弹性公网IP。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddPublicipsIntoSharedBandwidthRequest 请求对象
     * @return AsyncInvoker<AddPublicipsIntoSharedBandwidthRequest, AddPublicipsIntoSharedBandwidthResponse>
     */
    public AsyncInvoker<AddPublicipsIntoSharedBandwidthRequest, AddPublicipsIntoSharedBandwidthResponse> addPublicipsIntoSharedBandwidthAsyncInvoker(
        AddPublicipsIntoSharedBandwidthRequest request) {
        return new AsyncInvoker<>(request, EipMeta.addPublicipsIntoSharedBandwidth, hcClient);
    }

    /**
     * 批量创建共享带宽
     *
     * 批量创建共享带宽。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateSharedBandwidthsRequest 请求对象
     * @return CompletableFuture<BatchCreateSharedBandwidthsResponse>
     */
    public CompletableFuture<BatchCreateSharedBandwidthsResponse> batchCreateSharedBandwidthsAsync(
        BatchCreateSharedBandwidthsRequest request) {
        return hcClient.asyncInvokeHttp(request, EipMeta.batchCreateSharedBandwidths);
    }

    /**
     * 批量创建共享带宽
     *
     * 批量创建共享带宽。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateSharedBandwidthsRequest 请求对象
     * @return AsyncInvoker<BatchCreateSharedBandwidthsRequest, BatchCreateSharedBandwidthsResponse>
     */
    public AsyncInvoker<BatchCreateSharedBandwidthsRequest, BatchCreateSharedBandwidthsResponse> batchCreateSharedBandwidthsAsyncInvoker(
        BatchCreateSharedBandwidthsRequest request) {
        return new AsyncInvoker<>(request, EipMeta.batchCreateSharedBandwidths, hcClient);
    }

    /**
     * 批量更新带宽
     *
     * 批量更新带宽，共享带宽和包周期带宽该接口不适用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchModifyBandwidthRequest 请求对象
     * @return CompletableFuture<BatchModifyBandwidthResponse>
     */
    public CompletableFuture<BatchModifyBandwidthResponse> batchModifyBandwidthAsync(
        BatchModifyBandwidthRequest request) {
        return hcClient.asyncInvokeHttp(request, EipMeta.batchModifyBandwidth);
    }

    /**
     * 批量更新带宽
     *
     * 批量更新带宽，共享带宽和包周期带宽该接口不适用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchModifyBandwidthRequest 请求对象
     * @return AsyncInvoker<BatchModifyBandwidthRequest, BatchModifyBandwidthResponse>
     */
    public AsyncInvoker<BatchModifyBandwidthRequest, BatchModifyBandwidthResponse> batchModifyBandwidthAsyncInvoker(
        BatchModifyBandwidthRequest request) {
        return new AsyncInvoker<>(request, EipMeta.batchModifyBandwidth, hcClient);
    }

    /**
     * 按需转包API
     *
     * 租户按需转包接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeBandwidthToPeriodRequest 请求对象
     * @return CompletableFuture<ChangeBandwidthToPeriodResponse>
     */
    public CompletableFuture<ChangeBandwidthToPeriodResponse> changeBandwidthToPeriodAsync(
        ChangeBandwidthToPeriodRequest request) {
        return hcClient.asyncInvokeHttp(request, EipMeta.changeBandwidthToPeriod);
    }

    /**
     * 按需转包API
     *
     * 租户按需转包接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeBandwidthToPeriodRequest 请求对象
     * @return AsyncInvoker<ChangeBandwidthToPeriodRequest, ChangeBandwidthToPeriodResponse>
     */
    public AsyncInvoker<ChangeBandwidthToPeriodRequest, ChangeBandwidthToPeriodResponse> changeBandwidthToPeriodAsyncInvoker(
        ChangeBandwidthToPeriodRequest request) {
        return new AsyncInvoker<>(request, EipMeta.changeBandwidthToPeriod, hcClient);
    }

    /**
     * 创建共享带宽
     *
     * 创建共享带宽。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSharedBandwidthRequest 请求对象
     * @return CompletableFuture<CreateSharedBandwidthResponse>
     */
    public CompletableFuture<CreateSharedBandwidthResponse> createSharedBandwidthAsync(
        CreateSharedBandwidthRequest request) {
        return hcClient.asyncInvokeHttp(request, EipMeta.createSharedBandwidth);
    }

    /**
     * 创建共享带宽
     *
     * 创建共享带宽。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSharedBandwidthRequest 请求对象
     * @return AsyncInvoker<CreateSharedBandwidthRequest, CreateSharedBandwidthResponse>
     */
    public AsyncInvoker<CreateSharedBandwidthRequest, CreateSharedBandwidthResponse> createSharedBandwidthAsyncInvoker(
        CreateSharedBandwidthRequest request) {
        return new AsyncInvoker<>(request, EipMeta.createSharedBandwidth, hcClient);
    }

    /**
     * 删除共享带宽
     *
     * 删除共享带宽。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSharedBandwidthRequest 请求对象
     * @return CompletableFuture<DeleteSharedBandwidthResponse>
     */
    public CompletableFuture<DeleteSharedBandwidthResponse> deleteSharedBandwidthAsync(
        DeleteSharedBandwidthRequest request) {
        return hcClient.asyncInvokeHttp(request, EipMeta.deleteSharedBandwidth);
    }

    /**
     * 删除共享带宽
     *
     * 删除共享带宽。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSharedBandwidthRequest 请求对象
     * @return AsyncInvoker<DeleteSharedBandwidthRequest, DeleteSharedBandwidthResponse>
     */
    public AsyncInvoker<DeleteSharedBandwidthRequest, DeleteSharedBandwidthResponse> deleteSharedBandwidthAsyncInvoker(
        DeleteSharedBandwidthRequest request) {
        return new AsyncInvoker<>(request, EipMeta.deleteSharedBandwidth, hcClient);
    }

    /**
     * 查询带宽加油包列表
     *
     * 查询带宽加油包列表信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBandwidthPkgRequest 请求对象
     * @return CompletableFuture<ListBandwidthPkgResponse>
     */
    public CompletableFuture<ListBandwidthPkgResponse> listBandwidthPkgAsync(ListBandwidthPkgRequest request) {
        return hcClient.asyncInvokeHttp(request, EipMeta.listBandwidthPkg);
    }

    /**
     * 查询带宽加油包列表
     *
     * 查询带宽加油包列表信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBandwidthPkgRequest 请求对象
     * @return AsyncInvoker<ListBandwidthPkgRequest, ListBandwidthPkgResponse>
     */
    public AsyncInvoker<ListBandwidthPkgRequest, ListBandwidthPkgResponse> listBandwidthPkgAsyncInvoker(
        ListBandwidthPkgRequest request) {
        return new AsyncInvoker<>(request, EipMeta.listBandwidthPkg, hcClient);
    }

    /**
     * 查询带宽列表
     *
     * 查询带宽列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBandwidthsRequest 请求对象
     * @return CompletableFuture<ListBandwidthsResponse>
     */
    public CompletableFuture<ListBandwidthsResponse> listBandwidthsAsync(ListBandwidthsRequest request) {
        return hcClient.asyncInvokeHttp(request, EipMeta.listBandwidths);
    }

    /**
     * 查询带宽列表
     *
     * 查询带宽列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBandwidthsRequest 请求对象
     * @return AsyncInvoker<ListBandwidthsRequest, ListBandwidthsResponse>
     */
    public AsyncInvoker<ListBandwidthsRequest, ListBandwidthsResponse> listBandwidthsAsyncInvoker(
        ListBandwidthsRequest request) {
        return new AsyncInvoker<>(request, EipMeta.listBandwidths, hcClient);
    }

    /**
     * 查询配额接口
     *
     * 查询配额
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListQuotasRequest 请求对象
     * @return CompletableFuture<ListQuotasResponse>
     */
    public CompletableFuture<ListQuotasResponse> listQuotasAsync(ListQuotasRequest request) {
        return hcClient.asyncInvokeHttp(request, EipMeta.listQuotas);
    }

    /**
     * 查询配额接口
     *
     * 查询配额
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListQuotasRequest 请求对象
     * @return AsyncInvoker<ListQuotasRequest, ListQuotasResponse>
     */
    public AsyncInvoker<ListQuotasRequest, ListQuotasResponse> listQuotasAsyncInvoker(ListQuotasRequest request) {
        return new AsyncInvoker<>(request, EipMeta.listQuotas, hcClient);
    }

    /**
     * 共享带宽移除弹性公网IP
     *
     * 共享带宽移除弹性公网IP。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RemovePublicipsFromSharedBandwidthRequest 请求对象
     * @return CompletableFuture<RemovePublicipsFromSharedBandwidthResponse>
     */
    public CompletableFuture<RemovePublicipsFromSharedBandwidthResponse> removePublicipsFromSharedBandwidthAsync(
        RemovePublicipsFromSharedBandwidthRequest request) {
        return hcClient.asyncInvokeHttp(request, EipMeta.removePublicipsFromSharedBandwidth);
    }

    /**
     * 共享带宽移除弹性公网IP
     *
     * 共享带宽移除弹性公网IP。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RemovePublicipsFromSharedBandwidthRequest 请求对象
     * @return AsyncInvoker<RemovePublicipsFromSharedBandwidthRequest, RemovePublicipsFromSharedBandwidthResponse>
     */
    public AsyncInvoker<RemovePublicipsFromSharedBandwidthRequest, RemovePublicipsFromSharedBandwidthResponse> removePublicipsFromSharedBandwidthAsyncInvoker(
        RemovePublicipsFromSharedBandwidthRequest request) {
        return new AsyncInvoker<>(request, EipMeta.removePublicipsFromSharedBandwidth, hcClient);
    }

    /**
     * 查询带宽
     *
     * 查询带宽
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBandwidthRequest 请求对象
     * @return CompletableFuture<ShowBandwidthResponse>
     */
    public CompletableFuture<ShowBandwidthResponse> showBandwidthAsync(ShowBandwidthRequest request) {
        return hcClient.asyncInvokeHttp(request, EipMeta.showBandwidth);
    }

    /**
     * 查询带宽
     *
     * 查询带宽
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBandwidthRequest 请求对象
     * @return AsyncInvoker<ShowBandwidthRequest, ShowBandwidthResponse>
     */
    public AsyncInvoker<ShowBandwidthRequest, ShowBandwidthResponse> showBandwidthAsyncInvoker(
        ShowBandwidthRequest request) {
        return new AsyncInvoker<>(request, EipMeta.showBandwidth, hcClient);
    }

    /**
     * 更新带宽
     *
     * 更新带宽。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateBandwidthRequest 请求对象
     * @return CompletableFuture<UpdateBandwidthResponse>
     */
    public CompletableFuture<UpdateBandwidthResponse> updateBandwidthAsync(UpdateBandwidthRequest request) {
        return hcClient.asyncInvokeHttp(request, EipMeta.updateBandwidth);
    }

    /**
     * 更新带宽
     *
     * 更新带宽。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateBandwidthRequest 请求对象
     * @return AsyncInvoker<UpdateBandwidthRequest, UpdateBandwidthResponse>
     */
    public AsyncInvoker<UpdateBandwidthRequest, UpdateBandwidthResponse> updateBandwidthAsyncInvoker(
        UpdateBandwidthRequest request) {
        return new AsyncInvoker<>(request, EipMeta.updateBandwidth, hcClient);
    }

    /**
     * 更新包周期带宽
     *
     * 更新带宽。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePrePaidBandwidthRequest 请求对象
     * @return CompletableFuture<UpdatePrePaidBandwidthResponse>
     */
    public CompletableFuture<UpdatePrePaidBandwidthResponse> updatePrePaidBandwidthAsync(
        UpdatePrePaidBandwidthRequest request) {
        return hcClient.asyncInvokeHttp(request, EipMeta.updatePrePaidBandwidth);
    }

    /**
     * 更新包周期带宽
     *
     * 更新带宽。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePrePaidBandwidthRequest 请求对象
     * @return AsyncInvoker<UpdatePrePaidBandwidthRequest, UpdatePrePaidBandwidthResponse>
     */
    public AsyncInvoker<UpdatePrePaidBandwidthRequest, UpdatePrePaidBandwidthResponse> updatePrePaidBandwidthAsyncInvoker(
        UpdatePrePaidBandwidthRequest request) {
        return new AsyncInvoker<>(request, EipMeta.updatePrePaidBandwidth, hcClient);
    }

    /**
     * 批量创建弹性公网IP资源标签
     *
     * 为指定的弹性公网IP资源实例批量添加标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreatePublicipTagsRequest 请求对象
     * @return CompletableFuture<BatchCreatePublicipTagsResponse>
     */
    public CompletableFuture<BatchCreatePublicipTagsResponse> batchCreatePublicipTagsAsync(
        BatchCreatePublicipTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, EipMeta.batchCreatePublicipTags);
    }

    /**
     * 批量创建弹性公网IP资源标签
     *
     * 为指定的弹性公网IP资源实例批量添加标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreatePublicipTagsRequest 请求对象
     * @return AsyncInvoker<BatchCreatePublicipTagsRequest, BatchCreatePublicipTagsResponse>
     */
    public AsyncInvoker<BatchCreatePublicipTagsRequest, BatchCreatePublicipTagsResponse> batchCreatePublicipTagsAsyncInvoker(
        BatchCreatePublicipTagsRequest request) {
        return new AsyncInvoker<>(request, EipMeta.batchCreatePublicipTags, hcClient);
    }

    /**
     * 批量创建弹性公网IP
     *
     * 批量创建弹性公网IP
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreatePublicipsRequest 请求对象
     * @return CompletableFuture<BatchCreatePublicipsResponse>
     */
    public CompletableFuture<BatchCreatePublicipsResponse> batchCreatePublicipsAsync(
        BatchCreatePublicipsRequest request) {
        return hcClient.asyncInvokeHttp(request, EipMeta.batchCreatePublicips);
    }

    /**
     * 批量创建弹性公网IP
     *
     * 批量创建弹性公网IP
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreatePublicipsRequest 请求对象
     * @return AsyncInvoker<BatchCreatePublicipsRequest, BatchCreatePublicipsResponse>
     */
    public AsyncInvoker<BatchCreatePublicipsRequest, BatchCreatePublicipsResponse> batchCreatePublicipsAsyncInvoker(
        BatchCreatePublicipsRequest request) {
        return new AsyncInvoker<>(request, EipMeta.batchCreatePublicips, hcClient);
    }

    /**
     * 批量删除弹性公网IP
     *
     * 批量删除弹性公网IP
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeletePublicIpRequest 请求对象
     * @return CompletableFuture<BatchDeletePublicIpResponse>
     */
    public CompletableFuture<BatchDeletePublicIpResponse> batchDeletePublicIpAsync(BatchDeletePublicIpRequest request) {
        return hcClient.asyncInvokeHttp(request, EipMeta.batchDeletePublicIp);
    }

    /**
     * 批量删除弹性公网IP
     *
     * 批量删除弹性公网IP
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeletePublicIpRequest 请求对象
     * @return AsyncInvoker<BatchDeletePublicIpRequest, BatchDeletePublicIpResponse>
     */
    public AsyncInvoker<BatchDeletePublicIpRequest, BatchDeletePublicIpResponse> batchDeletePublicIpAsyncInvoker(
        BatchDeletePublicIpRequest request) {
        return new AsyncInvoker<>(request, EipMeta.batchDeletePublicIp, hcClient);
    }

    /**
     * 批量删除弹性公网IP资源标签
     *
     * 为指定的弹性公网IP资源实例批量删除标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeletePublicipTagsRequest 请求对象
     * @return CompletableFuture<BatchDeletePublicipTagsResponse>
     */
    public CompletableFuture<BatchDeletePublicipTagsResponse> batchDeletePublicipTagsAsync(
        BatchDeletePublicipTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, EipMeta.batchDeletePublicipTags);
    }

    /**
     * 批量删除弹性公网IP资源标签
     *
     * 为指定的弹性公网IP资源实例批量删除标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeletePublicipTagsRequest 请求对象
     * @return AsyncInvoker<BatchDeletePublicipTagsRequest, BatchDeletePublicipTagsResponse>
     */
    public AsyncInvoker<BatchDeletePublicipTagsRequest, BatchDeletePublicipTagsResponse> batchDeletePublicipTagsAsyncInvoker(
        BatchDeletePublicipTagsRequest request) {
        return new AsyncInvoker<>(request, EipMeta.batchDeletePublicipTags, hcClient);
    }

    /**
     * 批量解绑弹性公网IP
     *
     * 批量解绑弹性公网IP
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDisassociatePublicipsRequest 请求对象
     * @return CompletableFuture<BatchDisassociatePublicipsResponse>
     */
    public CompletableFuture<BatchDisassociatePublicipsResponse> batchDisassociatePublicipsAsync(
        BatchDisassociatePublicipsRequest request) {
        return hcClient.asyncInvokeHttp(request, EipMeta.batchDisassociatePublicips);
    }

    /**
     * 批量解绑弹性公网IP
     *
     * 批量解绑弹性公网IP
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDisassociatePublicipsRequest 请求对象
     * @return AsyncInvoker<BatchDisassociatePublicipsRequest, BatchDisassociatePublicipsResponse>
     */
    public AsyncInvoker<BatchDisassociatePublicipsRequest, BatchDisassociatePublicipsResponse> batchDisassociatePublicipsAsyncInvoker(
        BatchDisassociatePublicipsRequest request) {
        return new AsyncInvoker<>(request, EipMeta.batchDisassociatePublicips, hcClient);
    }

    /**
     * 按需转包接口
     *
     * 租户按需转包接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangePublicipToPeriodRequest 请求对象
     * @return CompletableFuture<ChangePublicipToPeriodResponse>
     */
    public CompletableFuture<ChangePublicipToPeriodResponse> changePublicipToPeriodAsync(
        ChangePublicipToPeriodRequest request) {
        return hcClient.asyncInvokeHttp(request, EipMeta.changePublicipToPeriod);
    }

    /**
     * 按需转包接口
     *
     * 租户按需转包接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangePublicipToPeriodRequest 请求对象
     * @return AsyncInvoker<ChangePublicipToPeriodRequest, ChangePublicipToPeriodResponse>
     */
    public AsyncInvoker<ChangePublicipToPeriodRequest, ChangePublicipToPeriodResponse> changePublicipToPeriodAsyncInvoker(
        ChangePublicipToPeriodRequest request) {
        return new AsyncInvoker<>(request, EipMeta.changePublicipToPeriod, hcClient);
    }

    /**
     * 查询PublicIp数量
     *
     * 查询PublicIp数量
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CountPublicIpRequest 请求对象
     * @return CompletableFuture<CountPublicIpResponse>
     */
    public CompletableFuture<CountPublicIpResponse> countPublicIpAsync(CountPublicIpRequest request) {
        return hcClient.asyncInvokeHttp(request, EipMeta.countPublicIp);
    }

    /**
     * 查询PublicIp数量
     *
     * 查询PublicIp数量
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CountPublicIpRequest 请求对象
     * @return AsyncInvoker<CountPublicIpRequest, CountPublicIpResponse>
     */
    public AsyncInvoker<CountPublicIpRequest, CountPublicIpResponse> countPublicIpAsyncInvoker(
        CountPublicIpRequest request) {
        return new AsyncInvoker<>(request, EipMeta.countPublicIp, hcClient);
    }

    /**
     * 查询PublicIp实例数
     *
     * 查询PublicIp实例数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CountPublicIpInstanceRequest 请求对象
     * @return CompletableFuture<CountPublicIpInstanceResponse>
     */
    public CompletableFuture<CountPublicIpInstanceResponse> countPublicIpInstanceAsync(
        CountPublicIpInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, EipMeta.countPublicIpInstance);
    }

    /**
     * 查询PublicIp实例数
     *
     * 查询PublicIp实例数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CountPublicIpInstanceRequest 请求对象
     * @return AsyncInvoker<CountPublicIpInstanceRequest, CountPublicIpInstanceResponse>
     */
    public AsyncInvoker<CountPublicIpInstanceRequest, CountPublicIpInstanceResponse> countPublicIpInstanceAsyncInvoker(
        CountPublicIpInstanceRequest request) {
        return new AsyncInvoker<>(request, EipMeta.countPublicIpInstance, hcClient);
    }

    /**
     * 申请包周期弹性公网IP
     *
     * 申请包年包月的弹性公网IP。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePrePaidPublicipRequest 请求对象
     * @return CompletableFuture<CreatePrePaidPublicipResponse>
     */
    public CompletableFuture<CreatePrePaidPublicipResponse> createPrePaidPublicipAsync(
        CreatePrePaidPublicipRequest request) {
        return hcClient.asyncInvokeHttp(request, EipMeta.createPrePaidPublicip);
    }

    /**
     * 申请包周期弹性公网IP
     *
     * 申请包年包月的弹性公网IP。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePrePaidPublicipRequest 请求对象
     * @return AsyncInvoker<CreatePrePaidPublicipRequest, CreatePrePaidPublicipResponse>
     */
    public AsyncInvoker<CreatePrePaidPublicipRequest, CreatePrePaidPublicipResponse> createPrePaidPublicipAsyncInvoker(
        CreatePrePaidPublicipRequest request) {
        return new AsyncInvoker<>(request, EipMeta.createPrePaidPublicip, hcClient);
    }

    /**
     * 申请弹性公网IP
     *
     * 申请弹性公网IP，支持IPv4和IPv6。
     *  弹性公网IP（Elastic IP）提供独立的公网IP资源，包括公网IP地址与公网出口带宽服务。可以与弹性云服务器、裸金属服务器、虚拟IP、弹性负载均衡、NAT网关等资源灵活地绑定及解绑。拥有多种灵活的计费方式，可以满足各种业务场景的需要。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePublicipRequest 请求对象
     * @return CompletableFuture<CreatePublicipResponse>
     */
    public CompletableFuture<CreatePublicipResponse> createPublicipAsync(CreatePublicipRequest request) {
        return hcClient.asyncInvokeHttp(request, EipMeta.createPublicip);
    }

    /**
     * 申请弹性公网IP
     *
     * 申请弹性公网IP，支持IPv4和IPv6。
     *  弹性公网IP（Elastic IP）提供独立的公网IP资源，包括公网IP地址与公网出口带宽服务。可以与弹性云服务器、裸金属服务器、虚拟IP、弹性负载均衡、NAT网关等资源灵活地绑定及解绑。拥有多种灵活的计费方式，可以满足各种业务场景的需要。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePublicipRequest 请求对象
     * @return AsyncInvoker<CreatePublicipRequest, CreatePublicipResponse>
     */
    public AsyncInvoker<CreatePublicipRequest, CreatePublicipResponse> createPublicipAsyncInvoker(
        CreatePublicipRequest request) {
        return new AsyncInvoker<>(request, EipMeta.createPublicip, hcClient);
    }

    /**
     * 创建弹性公网IP资源标签
     *
     * 给指定弹性IP资源实例增加标签信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePublicipTagRequest 请求对象
     * @return CompletableFuture<CreatePublicipTagResponse>
     */
    public CompletableFuture<CreatePublicipTagResponse> createPublicipTagAsync(CreatePublicipTagRequest request) {
        return hcClient.asyncInvokeHttp(request, EipMeta.createPublicipTag);
    }

    /**
     * 创建弹性公网IP资源标签
     *
     * 给指定弹性IP资源实例增加标签信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePublicipTagRequest 请求对象
     * @return AsyncInvoker<CreatePublicipTagRequest, CreatePublicipTagResponse>
     */
    public AsyncInvoker<CreatePublicipTagRequest, CreatePublicipTagResponse> createPublicipTagAsyncInvoker(
        CreatePublicipTagRequest request) {
        return new AsyncInvoker<>(request, EipMeta.createPublicipTag, hcClient);
    }

    /**
     * 删除弹性公网IP
     *
     * 删除弹性公网IP,绑定状态eip不允许直接删除。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePublicipRequest 请求对象
     * @return CompletableFuture<DeletePublicipResponse>
     */
    public CompletableFuture<DeletePublicipResponse> deletePublicipAsync(DeletePublicipRequest request) {
        return hcClient.asyncInvokeHttp(request, EipMeta.deletePublicip);
    }

    /**
     * 删除弹性公网IP
     *
     * 删除弹性公网IP,绑定状态eip不允许直接删除。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePublicipRequest 请求对象
     * @return AsyncInvoker<DeletePublicipRequest, DeletePublicipResponse>
     */
    public AsyncInvoker<DeletePublicipRequest, DeletePublicipResponse> deletePublicipAsyncInvoker(
        DeletePublicipRequest request) {
        return new AsyncInvoker<>(request, EipMeta.deletePublicip, hcClient);
    }

    /**
     * 删除弹性公网IP的标签
     *
     * 删除指定弹性公网IP的标签信息。其中project_id是项目ID，publicip_id 是要操作的弹性公网IP的id。key是要删除标签的键。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePublicipTagRequest 请求对象
     * @return CompletableFuture<DeletePublicipTagResponse>
     */
    public CompletableFuture<DeletePublicipTagResponse> deletePublicipTagAsync(DeletePublicipTagRequest request) {
        return hcClient.asyncInvokeHttp(request, EipMeta.deletePublicipTag);
    }

    /**
     * 删除弹性公网IP的标签
     *
     * 删除指定弹性公网IP的标签信息。其中project_id是项目ID，publicip_id 是要操作的弹性公网IP的id。key是要删除标签的键。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePublicipTagRequest 请求对象
     * @return AsyncInvoker<DeletePublicipTagRequest, DeletePublicipTagResponse>
     */
    public AsyncInvoker<DeletePublicipTagRequest, DeletePublicipTagResponse> deletePublicipTagAsyncInvoker(
        DeletePublicipTagRequest request) {
        return new AsyncInvoker<>(request, EipMeta.deletePublicipTag, hcClient);
    }

    /**
     * 查询租户的弹性公网IP标签
     *
     * 查询租户在指定区域和实例类型的所有标签集合。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPublicipTagsRequest 请求对象
     * @return CompletableFuture<ListPublicipTagsResponse>
     */
    public CompletableFuture<ListPublicipTagsResponse> listPublicipTagsAsync(ListPublicipTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, EipMeta.listPublicipTags);
    }

    /**
     * 查询租户的弹性公网IP标签
     *
     * 查询租户在指定区域和实例类型的所有标签集合。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPublicipTagsRequest 请求对象
     * @return AsyncInvoker<ListPublicipTagsRequest, ListPublicipTagsResponse>
     */
    public AsyncInvoker<ListPublicipTagsRequest, ListPublicipTagsResponse> listPublicipTagsAsyncInvoker(
        ListPublicipTagsRequest request) {
        return new AsyncInvoker<>(request, EipMeta.listPublicipTags, hcClient);
    }

    /**
     * 查询弹性公网IP列表
     *
     * 查询弹性公网IP列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPublicipsRequest 请求对象
     * @return CompletableFuture<ListPublicipsResponse>
     */
    public CompletableFuture<ListPublicipsResponse> listPublicipsAsync(ListPublicipsRequest request) {
        return hcClient.asyncInvokeHttp(request, EipMeta.listPublicips);
    }

    /**
     * 查询弹性公网IP列表
     *
     * 查询弹性公网IP列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPublicipsRequest 请求对象
     * @return AsyncInvoker<ListPublicipsRequest, ListPublicipsResponse>
     */
    public AsyncInvoker<ListPublicipsRequest, ListPublicipsResponse> listPublicipsAsyncInvoker(
        ListPublicipsRequest request) {
        return new AsyncInvoker<>(request, EipMeta.listPublicips, hcClient);
    }

    /**
     * 按标签查询弹性公网IP列表
     *
     * 使用标签过滤弹性公网IP。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPublicipsByTagsRequest 请求对象
     * @return CompletableFuture<ListPublicipsByTagsResponse>
     */
    public CompletableFuture<ListPublicipsByTagsResponse> listPublicipsByTagsAsync(ListPublicipsByTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, EipMeta.listPublicipsByTags);
    }

    /**
     * 按标签查询弹性公网IP列表
     *
     * 使用标签过滤弹性公网IP。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPublicipsByTagsRequest 请求对象
     * @return AsyncInvoker<ListPublicipsByTagsRequest, ListPublicipsByTagsResponse>
     */
    public AsyncInvoker<ListPublicipsByTagsRequest, ListPublicipsByTagsResponse> listPublicipsByTagsAsyncInvoker(
        ListPublicipsByTagsRequest request) {
        return new AsyncInvoker<>(request, EipMeta.listPublicipsByTags, hcClient);
    }

    /**
     * 查询PublicIp类型
     *
     * 查询PublicIp类型
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPublicIpTypeRequest 请求对象
     * @return CompletableFuture<ShowPublicIpTypeResponse>
     */
    public CompletableFuture<ShowPublicIpTypeResponse> showPublicIpTypeAsync(ShowPublicIpTypeRequest request) {
        return hcClient.asyncInvokeHttp(request, EipMeta.showPublicIpType);
    }

    /**
     * 查询PublicIp类型
     *
     * 查询PublicIp类型
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPublicIpTypeRequest 请求对象
     * @return AsyncInvoker<ShowPublicIpTypeRequest, ShowPublicIpTypeResponse>
     */
    public AsyncInvoker<ShowPublicIpTypeRequest, ShowPublicIpTypeResponse> showPublicIpTypeAsyncInvoker(
        ShowPublicIpTypeRequest request) {
        return new AsyncInvoker<>(request, EipMeta.showPublicIpType, hcClient);
    }

    /**
     * 查询弹性公网IP
     *
     * 查询指定的弹性公网IP。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPublicipRequest 请求对象
     * @return CompletableFuture<ShowPublicipResponse>
     */
    public CompletableFuture<ShowPublicipResponse> showPublicipAsync(ShowPublicipRequest request) {
        return hcClient.asyncInvokeHttp(request, EipMeta.showPublicip);
    }

    /**
     * 查询弹性公网IP
     *
     * 查询指定的弹性公网IP。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPublicipRequest 请求对象
     * @return AsyncInvoker<ShowPublicipRequest, ShowPublicipResponse>
     */
    public AsyncInvoker<ShowPublicipRequest, ShowPublicipResponse> showPublicipAsyncInvoker(
        ShowPublicipRequest request) {
        return new AsyncInvoker<>(request, EipMeta.showPublicip, hcClient);
    }

    /**
     * 查询弹性公网IP的标签
     *
     * 查询指定弹性IP实例的标签信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPublicipTagsRequest 请求对象
     * @return CompletableFuture<ShowPublicipTagsResponse>
     */
    public CompletableFuture<ShowPublicipTagsResponse> showPublicipTagsAsync(ShowPublicipTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, EipMeta.showPublicipTags);
    }

    /**
     * 查询弹性公网IP的标签
     *
     * 查询指定弹性IP实例的标签信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPublicipTagsRequest 请求对象
     * @return AsyncInvoker<ShowPublicipTagsRequest, ShowPublicipTagsResponse>
     */
    public AsyncInvoker<ShowPublicipTagsRequest, ShowPublicipTagsResponse> showPublicipTagsAsyncInvoker(
        ShowPublicipTagsRequest request) {
        return new AsyncInvoker<>(request, EipMeta.showPublicipTags, hcClient);
    }

    /**
     * 更新弹性公网IP
     *
     * 更新弹性公网IP，将弹性公网IP跟一个网卡绑定或者解绑定，转换IP地址版本类型。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePublicipRequest 请求对象
     * @return CompletableFuture<UpdatePublicipResponse>
     */
    public CompletableFuture<UpdatePublicipResponse> updatePublicipAsync(UpdatePublicipRequest request) {
        return hcClient.asyncInvokeHttp(request, EipMeta.updatePublicip);
    }

    /**
     * 更新弹性公网IP
     *
     * 更新弹性公网IP，将弹性公网IP跟一个网卡绑定或者解绑定，转换IP地址版本类型。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePublicipRequest 请求对象
     * @return AsyncInvoker<UpdatePublicipRequest, UpdatePublicipResponse>
     */
    public AsyncInvoker<UpdatePublicipRequest, UpdatePublicipResponse> updatePublicipAsyncInvoker(
        UpdatePublicipRequest request) {
        return new AsyncInvoker<>(request, EipMeta.updatePublicip, hcClient);
    }

    /**
     * 查询Job状态接口
     *
     * 查询Job状态接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowResourcesJobDetailRequest 请求对象
     * @return CompletableFuture<ShowResourcesJobDetailResponse>
     */
    public CompletableFuture<ShowResourcesJobDetailResponse> showResourcesJobDetailAsync(
        ShowResourcesJobDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, EipMeta.showResourcesJobDetail);
    }

    /**
     * 查询Job状态接口
     *
     * 查询Job状态接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowResourcesJobDetailRequest 请求对象
     * @return AsyncInvoker<ShowResourcesJobDetailRequest, ShowResourcesJobDetailResponse>
     */
    public AsyncInvoker<ShowResourcesJobDetailRequest, ShowResourcesJobDetailResponse> showResourcesJobDetailAsyncInvoker(
        ShowResourcesJobDetailRequest request) {
        return new AsyncInvoker<>(request, EipMeta.showResourcesJobDetail, hcClient);
    }

    /**
     * 创建浮动IP
     *
     * 创建浮动IP的外部网络UUID，请使用GET /v2.0/networks?router:external&#x3D;True或neutron net-external-list方式获取。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request NeutronCreateFloatingIpRequest 请求对象
     * @return CompletableFuture<NeutronCreateFloatingIpResponse>
     */
    public CompletableFuture<NeutronCreateFloatingIpResponse> neutronCreateFloatingIpAsync(
        NeutronCreateFloatingIpRequest request) {
        return hcClient.asyncInvokeHttp(request, EipMeta.neutronCreateFloatingIp);
    }

    /**
     * 创建浮动IP
     *
     * 创建浮动IP的外部网络UUID，请使用GET /v2.0/networks?router:external&#x3D;True或neutron net-external-list方式获取。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request NeutronCreateFloatingIpRequest 请求对象
     * @return AsyncInvoker<NeutronCreateFloatingIpRequest, NeutronCreateFloatingIpResponse>
     */
    public AsyncInvoker<NeutronCreateFloatingIpRequest, NeutronCreateFloatingIpResponse> neutronCreateFloatingIpAsyncInvoker(
        NeutronCreateFloatingIpRequest request) {
        return new AsyncInvoker<>(request, EipMeta.neutronCreateFloatingIp, hcClient);
    }

    /**
     * 删除浮动IP
     *
     * 删除指定的浮动IP。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request NeutronDeleteFloatingIpRequest 请求对象
     * @return CompletableFuture<NeutronDeleteFloatingIpResponse>
     */
    public CompletableFuture<NeutronDeleteFloatingIpResponse> neutronDeleteFloatingIpAsync(
        NeutronDeleteFloatingIpRequest request) {
        return hcClient.asyncInvokeHttp(request, EipMeta.neutronDeleteFloatingIp);
    }

    /**
     * 删除浮动IP
     *
     * 删除指定的浮动IP。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request NeutronDeleteFloatingIpRequest 请求对象
     * @return AsyncInvoker<NeutronDeleteFloatingIpRequest, NeutronDeleteFloatingIpResponse>
     */
    public AsyncInvoker<NeutronDeleteFloatingIpRequest, NeutronDeleteFloatingIpResponse> neutronDeleteFloatingIpAsyncInvoker(
        NeutronDeleteFloatingIpRequest request) {
        return new AsyncInvoker<>(request, EipMeta.neutronDeleteFloatingIp, hcClient);
    }

    /**
     * 查询浮动IP列表
     *
     * 查询提交请求的租户有权限操作的所有浮动IP地址。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request NeutronListFloatingIpsRequest 请求对象
     * @return CompletableFuture<NeutronListFloatingIpsResponse>
     */
    public CompletableFuture<NeutronListFloatingIpsResponse> neutronListFloatingIpsAsync(
        NeutronListFloatingIpsRequest request) {
        return hcClient.asyncInvokeHttp(request, EipMeta.neutronListFloatingIps);
    }

    /**
     * 查询浮动IP列表
     *
     * 查询提交请求的租户有权限操作的所有浮动IP地址。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request NeutronListFloatingIpsRequest 请求对象
     * @return AsyncInvoker<NeutronListFloatingIpsRequest, NeutronListFloatingIpsResponse>
     */
    public AsyncInvoker<NeutronListFloatingIpsRequest, NeutronListFloatingIpsResponse> neutronListFloatingIpsAsyncInvoker(
        NeutronListFloatingIpsRequest request) {
        return new AsyncInvoker<>(request, EipMeta.neutronListFloatingIps, hcClient);
    }

    /**
     * 查询浮动IP
     *
     * 查询浮动IP详情，包括浮动IP状态，浮动IP所属路由器ID，浮动IP的外部网络ID等等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request NeutronShowFloatingIpRequest 请求对象
     * @return CompletableFuture<NeutronShowFloatingIpResponse>
     */
    public CompletableFuture<NeutronShowFloatingIpResponse> neutronShowFloatingIpAsync(
        NeutronShowFloatingIpRequest request) {
        return hcClient.asyncInvokeHttp(request, EipMeta.neutronShowFloatingIp);
    }

    /**
     * 查询浮动IP
     *
     * 查询浮动IP详情，包括浮动IP状态，浮动IP所属路由器ID，浮动IP的外部网络ID等等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request NeutronShowFloatingIpRequest 请求对象
     * @return AsyncInvoker<NeutronShowFloatingIpRequest, NeutronShowFloatingIpResponse>
     */
    public AsyncInvoker<NeutronShowFloatingIpRequest, NeutronShowFloatingIpResponse> neutronShowFloatingIpAsyncInvoker(
        NeutronShowFloatingIpRequest request) {
        return new AsyncInvoker<>(request, EipMeta.neutronShowFloatingIp, hcClient);
    }

    /**
     * 更新浮动IP
     *
     * 更新浮动IP。
     *  更新时需在URL中给出浮动IP地址的ID。
     *  port_id 为空，则表示浮动IP从端口解绑。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request NeutronUpdateFloatingIpRequest 请求对象
     * @return CompletableFuture<NeutronUpdateFloatingIpResponse>
     */
    public CompletableFuture<NeutronUpdateFloatingIpResponse> neutronUpdateFloatingIpAsync(
        NeutronUpdateFloatingIpRequest request) {
        return hcClient.asyncInvokeHttp(request, EipMeta.neutronUpdateFloatingIp);
    }

    /**
     * 更新浮动IP
     *
     * 更新浮动IP。
     *  更新时需在URL中给出浮动IP地址的ID。
     *  port_id 为空，则表示浮动IP从端口解绑。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request NeutronUpdateFloatingIpRequest 请求对象
     * @return AsyncInvoker<NeutronUpdateFloatingIpRequest, NeutronUpdateFloatingIpResponse>
     */
    public AsyncInvoker<NeutronUpdateFloatingIpRequest, NeutronUpdateFloatingIpResponse> neutronUpdateFloatingIpAsyncInvoker(
        NeutronUpdateFloatingIpRequest request) {
        return new AsyncInvoker<>(request, EipMeta.neutronUpdateFloatingIp, hcClient);
    }

}
