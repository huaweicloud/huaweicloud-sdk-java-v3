package com.huaweicloud.sdk.geip.v3;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.geip.v3.model.AddGeipSegmentTagsRequest;
import com.huaweicloud.sdk.geip.v3.model.AddGeipSegmentTagsResponse;
import com.huaweicloud.sdk.geip.v3.model.AddGlobalEipTagsRequest;
import com.huaweicloud.sdk.geip.v3.model.AddGlobalEipTagsResponse;
import com.huaweicloud.sdk.geip.v3.model.AddInternetBandwidthTagsRequest;
import com.huaweicloud.sdk.geip.v3.model.AddInternetBandwidthTagsResponse;
import com.huaweicloud.sdk.geip.v3.model.AssociateGeipSegmentInstanceRequest;
import com.huaweicloud.sdk.geip.v3.model.AssociateGeipSegmentInstanceResponse;
import com.huaweicloud.sdk.geip.v3.model.AssociateInstanceRequest;
import com.huaweicloud.sdk.geip.v3.model.AssociateInstanceResponse;
import com.huaweicloud.sdk.geip.v3.model.AttachInternetBandwidthRequest;
import com.huaweicloud.sdk.geip.v3.model.AttachInternetBandwidthResponse;
import com.huaweicloud.sdk.geip.v3.model.BatchAttachGeipSegmentInternetBandwidthRequest;
import com.huaweicloud.sdk.geip.v3.model.BatchAttachGeipSegmentInternetBandwidthResponse;
import com.huaweicloud.sdk.geip.v3.model.BatchAttachInternetBandwidthRequest;
import com.huaweicloud.sdk.geip.v3.model.BatchAttachInternetBandwidthResponse;
import com.huaweicloud.sdk.geip.v3.model.BatchCreateGeipSegmentTagsRequest;
import com.huaweicloud.sdk.geip.v3.model.BatchCreateGeipSegmentTagsResponse;
import com.huaweicloud.sdk.geip.v3.model.BatchCreateGlobalEipRequest;
import com.huaweicloud.sdk.geip.v3.model.BatchCreateGlobalEipResponse;
import com.huaweicloud.sdk.geip.v3.model.BatchCreateGlobalEipTagsRequest;
import com.huaweicloud.sdk.geip.v3.model.BatchCreateGlobalEipTagsResponse;
import com.huaweicloud.sdk.geip.v3.model.BatchCreateInternetBandwidthRequest;
import com.huaweicloud.sdk.geip.v3.model.BatchCreateInternetBandwidthResponse;
import com.huaweicloud.sdk.geip.v3.model.BatchCreateInternetBandwidthTagsRequest;
import com.huaweicloud.sdk.geip.v3.model.BatchCreateInternetBandwidthTagsResponse;
import com.huaweicloud.sdk.geip.v3.model.BatchDeleteGeipSegmentTagsRequest;
import com.huaweicloud.sdk.geip.v3.model.BatchDeleteGeipSegmentTagsResponse;
import com.huaweicloud.sdk.geip.v3.model.BatchDeleteGlobalEipTagsRequest;
import com.huaweicloud.sdk.geip.v3.model.BatchDeleteGlobalEipTagsResponse;
import com.huaweicloud.sdk.geip.v3.model.BatchDeleteInternetBandwidthTagsRequest;
import com.huaweicloud.sdk.geip.v3.model.BatchDeleteInternetBandwidthTagsResponse;
import com.huaweicloud.sdk.geip.v3.model.BatchDetachGeipSegmentInternetBandwidthRequest;
import com.huaweicloud.sdk.geip.v3.model.BatchDetachGeipSegmentInternetBandwidthResponse;
import com.huaweicloud.sdk.geip.v3.model.BatchDetachInternetBandwidthRequest;
import com.huaweicloud.sdk.geip.v3.model.BatchDetachInternetBandwidthResponse;
import com.huaweicloud.sdk.geip.v3.model.CountGlobalEipSegmentRequest;
import com.huaweicloud.sdk.geip.v3.model.CountGlobalEipSegmentResponse;
import com.huaweicloud.sdk.geip.v3.model.CountGlobalEipsRequest;
import com.huaweicloud.sdk.geip.v3.model.CountGlobalEipsResponse;
import com.huaweicloud.sdk.geip.v3.model.CountInternetBandwidthRequest;
import com.huaweicloud.sdk.geip.v3.model.CountInternetBandwidthResponse;
import com.huaweicloud.sdk.geip.v3.model.CreateGlobalEipRequest;
import com.huaweicloud.sdk.geip.v3.model.CreateGlobalEipResponse;
import com.huaweicloud.sdk.geip.v3.model.CreateGlobalEipSegmentRequest;
import com.huaweicloud.sdk.geip.v3.model.CreateGlobalEipSegmentResponse;
import com.huaweicloud.sdk.geip.v3.model.CreateInternetBandwidthRequest;
import com.huaweicloud.sdk.geip.v3.model.CreateInternetBandwidthResponse;
import com.huaweicloud.sdk.geip.v3.model.CreateUserDisclaimerRequest;
import com.huaweicloud.sdk.geip.v3.model.CreateUserDisclaimerResponse;
import com.huaweicloud.sdk.geip.v3.model.DeleteGeipSegmentTagRequest;
import com.huaweicloud.sdk.geip.v3.model.DeleteGeipSegmentTagResponse;
import com.huaweicloud.sdk.geip.v3.model.DeleteGlobalEipRequest;
import com.huaweicloud.sdk.geip.v3.model.DeleteGlobalEipResponse;
import com.huaweicloud.sdk.geip.v3.model.DeleteGlobalEipSegmentRequest;
import com.huaweicloud.sdk.geip.v3.model.DeleteGlobalEipSegmentResponse;
import com.huaweicloud.sdk.geip.v3.model.DeleteGlobalEipTagRequest;
import com.huaweicloud.sdk.geip.v3.model.DeleteGlobalEipTagResponse;
import com.huaweicloud.sdk.geip.v3.model.DeleteInternetBandwidthRequest;
import com.huaweicloud.sdk.geip.v3.model.DeleteInternetBandwidthResponse;
import com.huaweicloud.sdk.geip.v3.model.DeleteInternetBandwidthTagRequest;
import com.huaweicloud.sdk.geip.v3.model.DeleteInternetBandwidthTagResponse;
import com.huaweicloud.sdk.geip.v3.model.DeleteUserDisclaimerRequest;
import com.huaweicloud.sdk.geip.v3.model.DeleteUserDisclaimerResponse;
import com.huaweicloud.sdk.geip.v3.model.DetachInternetBandwidthRequest;
import com.huaweicloud.sdk.geip.v3.model.DetachInternetBandwidthResponse;
import com.huaweicloud.sdk.geip.v3.model.DisassociateGeipSegmentInstanceRequest;
import com.huaweicloud.sdk.geip.v3.model.DisassociateGeipSegmentInstanceResponse;
import com.huaweicloud.sdk.geip.v3.model.DisassociateInstanceRequest;
import com.huaweicloud.sdk.geip.v3.model.DisassociateInstanceResponse;
import com.huaweicloud.sdk.geip.v3.model.ListAccessSitesRequest;
import com.huaweicloud.sdk.geip.v3.model.ListAccessSitesResponse;
import com.huaweicloud.sdk.geip.v3.model.ListGeipPoolsRequest;
import com.huaweicloud.sdk.geip.v3.model.ListGeipPoolsResponse;
import com.huaweicloud.sdk.geip.v3.model.ListGeipResourceQuotasRequest;
import com.huaweicloud.sdk.geip.v3.model.ListGeipResourceQuotasResponse;
import com.huaweicloud.sdk.geip.v3.model.ListGeipSegmentCountFilterTagsRequest;
import com.huaweicloud.sdk.geip.v3.model.ListGeipSegmentCountFilterTagsResponse;
import com.huaweicloud.sdk.geip.v3.model.ListGeipSegmentDomainTagsRequest;
import com.huaweicloud.sdk.geip.v3.model.ListGeipSegmentDomainTagsResponse;
import com.huaweicloud.sdk.geip.v3.model.ListGeipSegmentFilterTagsRequest;
import com.huaweicloud.sdk.geip.v3.model.ListGeipSegmentFilterTagsResponse;
import com.huaweicloud.sdk.geip.v3.model.ListGlobalEipCountFilterTagsRequest;
import com.huaweicloud.sdk.geip.v3.model.ListGlobalEipCountFilterTagsResponse;
import com.huaweicloud.sdk.geip.v3.model.ListGlobalEipDomainTagsRequest;
import com.huaweicloud.sdk.geip.v3.model.ListGlobalEipDomainTagsResponse;
import com.huaweicloud.sdk.geip.v3.model.ListGlobalEipFilterTagsRequest;
import com.huaweicloud.sdk.geip.v3.model.ListGlobalEipFilterTagsResponse;
import com.huaweicloud.sdk.geip.v3.model.ListGlobalEipSegmentsRequest;
import com.huaweicloud.sdk.geip.v3.model.ListGlobalEipSegmentsResponse;
import com.huaweicloud.sdk.geip.v3.model.ListGlobalEipsRequest;
import com.huaweicloud.sdk.geip.v3.model.ListGlobalEipsResponse;
import com.huaweicloud.sdk.geip.v3.model.ListInternetBandwidthCountFilterTagsRequest;
import com.huaweicloud.sdk.geip.v3.model.ListInternetBandwidthCountFilterTagsResponse;
import com.huaweicloud.sdk.geip.v3.model.ListInternetBandwidthDomainTagsRequest;
import com.huaweicloud.sdk.geip.v3.model.ListInternetBandwidthDomainTagsResponse;
import com.huaweicloud.sdk.geip.v3.model.ListInternetBandwidthFilterTagsRequest;
import com.huaweicloud.sdk.geip.v3.model.ListInternetBandwidthFilterTagsResponse;
import com.huaweicloud.sdk.geip.v3.model.ListInternetBandwidthLimitsRequest;
import com.huaweicloud.sdk.geip.v3.model.ListInternetBandwidthLimitsResponse;
import com.huaweicloud.sdk.geip.v3.model.ListInternetBandwidthsRequest;
import com.huaweicloud.sdk.geip.v3.model.ListInternetBandwidthsResponse;
import com.huaweicloud.sdk.geip.v3.model.ListJobsRequest;
import com.huaweicloud.sdk.geip.v3.model.ListJobsResponse;
import com.huaweicloud.sdk.geip.v3.model.ListSupportMasksRequest;
import com.huaweicloud.sdk.geip.v3.model.ListSupportMasksResponse;
import com.huaweicloud.sdk.geip.v3.model.ListSupportRegionsRequest;
import com.huaweicloud.sdk.geip.v3.model.ListSupportRegionsResponse;
import com.huaweicloud.sdk.geip.v3.model.ListTenantGeipSupportInstancesRequest;
import com.huaweicloud.sdk.geip.v3.model.ListTenantGeipSupportInstancesResponse;
import com.huaweicloud.sdk.geip.v3.model.ShowGeipSegmentTagsRequest;
import com.huaweicloud.sdk.geip.v3.model.ShowGeipSegmentTagsResponse;
import com.huaweicloud.sdk.geip.v3.model.ShowGlobalEipRequest;
import com.huaweicloud.sdk.geip.v3.model.ShowGlobalEipResponse;
import com.huaweicloud.sdk.geip.v3.model.ShowGlobalEipSegmentRequest;
import com.huaweicloud.sdk.geip.v3.model.ShowGlobalEipSegmentResponse;
import com.huaweicloud.sdk.geip.v3.model.ShowGlobalEipTagsRequest;
import com.huaweicloud.sdk.geip.v3.model.ShowGlobalEipTagsResponse;
import com.huaweicloud.sdk.geip.v3.model.ShowInternetBandwidthRequest;
import com.huaweicloud.sdk.geip.v3.model.ShowInternetBandwidthResponse;
import com.huaweicloud.sdk.geip.v3.model.ShowInternetBandwidthTagsRequest;
import com.huaweicloud.sdk.geip.v3.model.ShowInternetBandwidthTagsResponse;
import com.huaweicloud.sdk.geip.v3.model.ShowJobsRequest;
import com.huaweicloud.sdk.geip.v3.model.ShowJobsResponse;
import com.huaweicloud.sdk.geip.v3.model.ShowUserDisclaimerRequest;
import com.huaweicloud.sdk.geip.v3.model.ShowUserDisclaimerResponse;
import com.huaweicloud.sdk.geip.v3.model.UpdateGlobalEipRequest;
import com.huaweicloud.sdk.geip.v3.model.UpdateGlobalEipResponse;
import com.huaweicloud.sdk.geip.v3.model.UpdateGlobalEipSegmentRequest;
import com.huaweicloud.sdk.geip.v3.model.UpdateGlobalEipSegmentResponse;
import com.huaweicloud.sdk.geip.v3.model.UpdateInternetBandwidthRequest;
import com.huaweicloud.sdk.geip.v3.model.UpdateInternetBandwidthResponse;

import java.util.concurrent.CompletableFuture;

public class GeipAsyncClient {

    protected HcClient hcClient;

    public GeipAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<GeipAsyncClient> newBuilder() {
        ClientBuilder<GeipAsyncClient> clientBuilder = new ClientBuilder<>(GeipAsyncClient::new, "GlobalCredentials");
        return clientBuilder;
    }

    /**
     * 添加全域公网带宽标签
     *
     * 添加全域公网带宽标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddInternetBandwidthTagsRequest 请求对象
     * @return CompletableFuture<AddInternetBandwidthTagsResponse>
     */
    public CompletableFuture<AddInternetBandwidthTagsResponse> addInternetBandwidthTagsAsync(
        AddInternetBandwidthTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, GeipMeta.addInternetBandwidthTags);
    }

    /**
     * 添加全域公网带宽标签
     *
     * 添加全域公网带宽标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddInternetBandwidthTagsRequest 请求对象
     * @return AsyncInvoker<AddInternetBandwidthTagsRequest, AddInternetBandwidthTagsResponse>
     */
    public AsyncInvoker<AddInternetBandwidthTagsRequest, AddInternetBandwidthTagsResponse> addInternetBandwidthTagsAsyncInvoker(
        AddInternetBandwidthTagsRequest request) {
        return new AsyncInvoker<>(request, GeipMeta.addInternetBandwidthTags, hcClient);
    }

    /**
     * 批量创建全域公网带宽
     *
     * 批量创建全域公网带宽
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateInternetBandwidthRequest 请求对象
     * @return CompletableFuture<BatchCreateInternetBandwidthResponse>
     */
    public CompletableFuture<BatchCreateInternetBandwidthResponse> batchCreateInternetBandwidthAsync(
        BatchCreateInternetBandwidthRequest request) {
        return hcClient.asyncInvokeHttp(request, GeipMeta.batchCreateInternetBandwidth);
    }

    /**
     * 批量创建全域公网带宽
     *
     * 批量创建全域公网带宽
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateInternetBandwidthRequest 请求对象
     * @return AsyncInvoker<BatchCreateInternetBandwidthRequest, BatchCreateInternetBandwidthResponse>
     */
    public AsyncInvoker<BatchCreateInternetBandwidthRequest, BatchCreateInternetBandwidthResponse> batchCreateInternetBandwidthAsyncInvoker(
        BatchCreateInternetBandwidthRequest request) {
        return new AsyncInvoker<>(request, GeipMeta.batchCreateInternetBandwidth, hcClient);
    }

    /**
     * 批量添加全域公网带宽标签
     *
     * 批量添加全域公网带宽标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateInternetBandwidthTagsRequest 请求对象
     * @return CompletableFuture<BatchCreateInternetBandwidthTagsResponse>
     */
    public CompletableFuture<BatchCreateInternetBandwidthTagsResponse> batchCreateInternetBandwidthTagsAsync(
        BatchCreateInternetBandwidthTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, GeipMeta.batchCreateInternetBandwidthTags);
    }

    /**
     * 批量添加全域公网带宽标签
     *
     * 批量添加全域公网带宽标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateInternetBandwidthTagsRequest 请求对象
     * @return AsyncInvoker<BatchCreateInternetBandwidthTagsRequest, BatchCreateInternetBandwidthTagsResponse>
     */
    public AsyncInvoker<BatchCreateInternetBandwidthTagsRequest, BatchCreateInternetBandwidthTagsResponse> batchCreateInternetBandwidthTagsAsyncInvoker(
        BatchCreateInternetBandwidthTagsRequest request) {
        return new AsyncInvoker<>(request, GeipMeta.batchCreateInternetBandwidthTags, hcClient);
    }

    /**
     * 批量删除全域公网带宽标签
     *
     * 批量删除全域公网带宽标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteInternetBandwidthTagsRequest 请求对象
     * @return CompletableFuture<BatchDeleteInternetBandwidthTagsResponse>
     */
    public CompletableFuture<BatchDeleteInternetBandwidthTagsResponse> batchDeleteInternetBandwidthTagsAsync(
        BatchDeleteInternetBandwidthTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, GeipMeta.batchDeleteInternetBandwidthTags);
    }

    /**
     * 批量删除全域公网带宽标签
     *
     * 批量删除全域公网带宽标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteInternetBandwidthTagsRequest 请求对象
     * @return AsyncInvoker<BatchDeleteInternetBandwidthTagsRequest, BatchDeleteInternetBandwidthTagsResponse>
     */
    public AsyncInvoker<BatchDeleteInternetBandwidthTagsRequest, BatchDeleteInternetBandwidthTagsResponse> batchDeleteInternetBandwidthTagsAsyncInvoker(
        BatchDeleteInternetBandwidthTagsRequest request) {
        return new AsyncInvoker<>(request, GeipMeta.batchDeleteInternetBandwidthTags, hcClient);
    }

    /**
     * 查询全域公网带宽个数
     *
     * 查询全域公网带宽个数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CountInternetBandwidthRequest 请求对象
     * @return CompletableFuture<CountInternetBandwidthResponse>
     */
    public CompletableFuture<CountInternetBandwidthResponse> countInternetBandwidthAsync(
        CountInternetBandwidthRequest request) {
        return hcClient.asyncInvokeHttp(request, GeipMeta.countInternetBandwidth);
    }

    /**
     * 查询全域公网带宽个数
     *
     * 查询全域公网带宽个数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CountInternetBandwidthRequest 请求对象
     * @return AsyncInvoker<CountInternetBandwidthRequest, CountInternetBandwidthResponse>
     */
    public AsyncInvoker<CountInternetBandwidthRequest, CountInternetBandwidthResponse> countInternetBandwidthAsyncInvoker(
        CountInternetBandwidthRequest request) {
        return new AsyncInvoker<>(request, GeipMeta.countInternetBandwidth, hcClient);
    }

    /**
     * 创建全域公网带宽
     *
     * 创建全域公网带宽
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateInternetBandwidthRequest 请求对象
     * @return CompletableFuture<CreateInternetBandwidthResponse>
     */
    public CompletableFuture<CreateInternetBandwidthResponse> createInternetBandwidthAsync(
        CreateInternetBandwidthRequest request) {
        return hcClient.asyncInvokeHttp(request, GeipMeta.createInternetBandwidth);
    }

    /**
     * 创建全域公网带宽
     *
     * 创建全域公网带宽
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateInternetBandwidthRequest 请求对象
     * @return AsyncInvoker<CreateInternetBandwidthRequest, CreateInternetBandwidthResponse>
     */
    public AsyncInvoker<CreateInternetBandwidthRequest, CreateInternetBandwidthResponse> createInternetBandwidthAsyncInvoker(
        CreateInternetBandwidthRequest request) {
        return new AsyncInvoker<>(request, GeipMeta.createInternetBandwidth, hcClient);
    }

    /**
     * 创建租户签署免责条款
     *
     * 创建租户签署免责条款
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateUserDisclaimerRequest 请求对象
     * @return CompletableFuture<CreateUserDisclaimerResponse>
     */
    public CompletableFuture<CreateUserDisclaimerResponse> createUserDisclaimerAsync(
        CreateUserDisclaimerRequest request) {
        return hcClient.asyncInvokeHttp(request, GeipMeta.createUserDisclaimer);
    }

    /**
     * 创建租户签署免责条款
     *
     * 创建租户签署免责条款
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateUserDisclaimerRequest 请求对象
     * @return AsyncInvoker<CreateUserDisclaimerRequest, CreateUserDisclaimerResponse>
     */
    public AsyncInvoker<CreateUserDisclaimerRequest, CreateUserDisclaimerResponse> createUserDisclaimerAsyncInvoker(
        CreateUserDisclaimerRequest request) {
        return new AsyncInvoker<>(request, GeipMeta.createUserDisclaimer, hcClient);
    }

    /**
     * 删除全域公网带宽
     *
     * 删除全域公网带宽
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteInternetBandwidthRequest 请求对象
     * @return CompletableFuture<DeleteInternetBandwidthResponse>
     */
    public CompletableFuture<DeleteInternetBandwidthResponse> deleteInternetBandwidthAsync(
        DeleteInternetBandwidthRequest request) {
        return hcClient.asyncInvokeHttp(request, GeipMeta.deleteInternetBandwidth);
    }

    /**
     * 删除全域公网带宽
     *
     * 删除全域公网带宽
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteInternetBandwidthRequest 请求对象
     * @return AsyncInvoker<DeleteInternetBandwidthRequest, DeleteInternetBandwidthResponse>
     */
    public AsyncInvoker<DeleteInternetBandwidthRequest, DeleteInternetBandwidthResponse> deleteInternetBandwidthAsyncInvoker(
        DeleteInternetBandwidthRequest request) {
        return new AsyncInvoker<>(request, GeipMeta.deleteInternetBandwidth, hcClient);
    }

    /**
     * 删除全域公网带宽标签
     *
     * 删除全域公网带宽标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteInternetBandwidthTagRequest 请求对象
     * @return CompletableFuture<DeleteInternetBandwidthTagResponse>
     */
    public CompletableFuture<DeleteInternetBandwidthTagResponse> deleteInternetBandwidthTagAsync(
        DeleteInternetBandwidthTagRequest request) {
        return hcClient.asyncInvokeHttp(request, GeipMeta.deleteInternetBandwidthTag);
    }

    /**
     * 删除全域公网带宽标签
     *
     * 删除全域公网带宽标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteInternetBandwidthTagRequest 请求对象
     * @return AsyncInvoker<DeleteInternetBandwidthTagRequest, DeleteInternetBandwidthTagResponse>
     */
    public AsyncInvoker<DeleteInternetBandwidthTagRequest, DeleteInternetBandwidthTagResponse> deleteInternetBandwidthTagAsyncInvoker(
        DeleteInternetBandwidthTagRequest request) {
        return new AsyncInvoker<>(request, GeipMeta.deleteInternetBandwidthTag, hcClient);
    }

    /**
     * 删除租户撤销免责条款
     *
     * 删除租户撤销免责条款
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteUserDisclaimerRequest 请求对象
     * @return CompletableFuture<DeleteUserDisclaimerResponse>
     */
    public CompletableFuture<DeleteUserDisclaimerResponse> deleteUserDisclaimerAsync(
        DeleteUserDisclaimerRequest request) {
        return hcClient.asyncInvokeHttp(request, GeipMeta.deleteUserDisclaimer);
    }

    /**
     * 删除租户撤销免责条款
     *
     * 删除租户撤销免责条款
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteUserDisclaimerRequest 请求对象
     * @return AsyncInvoker<DeleteUserDisclaimerRequest, DeleteUserDisclaimerResponse>
     */
    public AsyncInvoker<DeleteUserDisclaimerRequest, DeleteUserDisclaimerResponse> deleteUserDisclaimerAsyncInvoker(
        DeleteUserDisclaimerRequest request) {
        return new AsyncInvoker<>(request, GeipMeta.deleteUserDisclaimer, hcClient);
    }

    /**
     * 查询接入点列表
     *
     * 查询接入点列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAccessSitesRequest 请求对象
     * @return CompletableFuture<ListAccessSitesResponse>
     */
    public CompletableFuture<ListAccessSitesResponse> listAccessSitesAsync(ListAccessSitesRequest request) {
        return hcClient.asyncInvokeHttp(request, GeipMeta.listAccessSites);
    }

    /**
     * 查询接入点列表
     *
     * 查询接入点列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAccessSitesRequest 请求对象
     * @return AsyncInvoker<ListAccessSitesRequest, ListAccessSitesResponse>
     */
    public AsyncInvoker<ListAccessSitesRequest, ListAccessSitesResponse> listAccessSitesAsyncInvoker(
        ListAccessSitesRequest request) {
        return new AsyncInvoker<>(request, GeipMeta.listAccessSites, hcClient);
    }

    /**
     * 查询租户全域弹性公网IP配额
     *
     * 查询租户全域弹性公网IP配额
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGeipResourceQuotasRequest 请求对象
     * @return CompletableFuture<ListGeipResourceQuotasResponse>
     */
    public CompletableFuture<ListGeipResourceQuotasResponse> listGeipResourceQuotasAsync(
        ListGeipResourceQuotasRequest request) {
        return hcClient.asyncInvokeHttp(request, GeipMeta.listGeipResourceQuotas);
    }

    /**
     * 查询租户全域弹性公网IP配额
     *
     * 查询租户全域弹性公网IP配额
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGeipResourceQuotasRequest 请求对象
     * @return AsyncInvoker<ListGeipResourceQuotasRequest, ListGeipResourceQuotasResponse>
     */
    public AsyncInvoker<ListGeipResourceQuotasRequest, ListGeipResourceQuotasResponse> listGeipResourceQuotasAsyncInvoker(
        ListGeipResourceQuotasRequest request) {
        return new AsyncInvoker<>(request, GeipMeta.listGeipResourceQuotas, hcClient);
    }

    /**
     * 查询资源实例列表数目
     *
     * 查询资源实例列表数目
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInternetBandwidthCountFilterTagsRequest 请求对象
     * @return CompletableFuture<ListInternetBandwidthCountFilterTagsResponse>
     */
    public CompletableFuture<ListInternetBandwidthCountFilterTagsResponse> listInternetBandwidthCountFilterTagsAsync(
        ListInternetBandwidthCountFilterTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, GeipMeta.listInternetBandwidthCountFilterTags);
    }

    /**
     * 查询资源实例列表数目
     *
     * 查询资源实例列表数目
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInternetBandwidthCountFilterTagsRequest 请求对象
     * @return AsyncInvoker<ListInternetBandwidthCountFilterTagsRequest, ListInternetBandwidthCountFilterTagsResponse>
     */
    public AsyncInvoker<ListInternetBandwidthCountFilterTagsRequest, ListInternetBandwidthCountFilterTagsResponse> listInternetBandwidthCountFilterTagsAsyncInvoker(
        ListInternetBandwidthCountFilterTagsRequest request) {
        return new AsyncInvoker<>(request, GeipMeta.listInternetBandwidthCountFilterTags, hcClient);
    }

    /**
     * 查询全域公网带宽项目标签
     *
     * 查询全域公网带宽项目标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInternetBandwidthDomainTagsRequest 请求对象
     * @return CompletableFuture<ListInternetBandwidthDomainTagsResponse>
     */
    public CompletableFuture<ListInternetBandwidthDomainTagsResponse> listInternetBandwidthDomainTagsAsync(
        ListInternetBandwidthDomainTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, GeipMeta.listInternetBandwidthDomainTags);
    }

    /**
     * 查询全域公网带宽项目标签
     *
     * 查询全域公网带宽项目标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInternetBandwidthDomainTagsRequest 请求对象
     * @return AsyncInvoker<ListInternetBandwidthDomainTagsRequest, ListInternetBandwidthDomainTagsResponse>
     */
    public AsyncInvoker<ListInternetBandwidthDomainTagsRequest, ListInternetBandwidthDomainTagsResponse> listInternetBandwidthDomainTagsAsyncInvoker(
        ListInternetBandwidthDomainTagsRequest request) {
        return new AsyncInvoker<>(request, GeipMeta.listInternetBandwidthDomainTags, hcClient);
    }

    /**
     * 查询资源实例列表
     *
     * 查询资源实例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInternetBandwidthFilterTagsRequest 请求对象
     * @return CompletableFuture<ListInternetBandwidthFilterTagsResponse>
     */
    public CompletableFuture<ListInternetBandwidthFilterTagsResponse> listInternetBandwidthFilterTagsAsync(
        ListInternetBandwidthFilterTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, GeipMeta.listInternetBandwidthFilterTags);
    }

    /**
     * 查询资源实例列表
     *
     * 查询资源实例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInternetBandwidthFilterTagsRequest 请求对象
     * @return AsyncInvoker<ListInternetBandwidthFilterTagsRequest, ListInternetBandwidthFilterTagsResponse>
     */
    public AsyncInvoker<ListInternetBandwidthFilterTagsRequest, ListInternetBandwidthFilterTagsResponse> listInternetBandwidthFilterTagsAsyncInvoker(
        ListInternetBandwidthFilterTagsRequest request) {
        return new AsyncInvoker<>(request, GeipMeta.listInternetBandwidthFilterTags, hcClient);
    }

    /**
     * 全域公网带宽限制列表
     *
     * 查询全域公网带宽限制列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInternetBandwidthLimitsRequest 请求对象
     * @return CompletableFuture<ListInternetBandwidthLimitsResponse>
     */
    public CompletableFuture<ListInternetBandwidthLimitsResponse> listInternetBandwidthLimitsAsync(
        ListInternetBandwidthLimitsRequest request) {
        return hcClient.asyncInvokeHttp(request, GeipMeta.listInternetBandwidthLimits);
    }

    /**
     * 全域公网带宽限制列表
     *
     * 查询全域公网带宽限制列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInternetBandwidthLimitsRequest 请求对象
     * @return AsyncInvoker<ListInternetBandwidthLimitsRequest, ListInternetBandwidthLimitsResponse>
     */
    public AsyncInvoker<ListInternetBandwidthLimitsRequest, ListInternetBandwidthLimitsResponse> listInternetBandwidthLimitsAsyncInvoker(
        ListInternetBandwidthLimitsRequest request) {
        return new AsyncInvoker<>(request, GeipMeta.listInternetBandwidthLimits, hcClient);
    }

    /**
     * 查询全域公网带宽列表
     *
     * 查询全域公网带宽列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInternetBandwidthsRequest 请求对象
     * @return CompletableFuture<ListInternetBandwidthsResponse>
     */
    public CompletableFuture<ListInternetBandwidthsResponse> listInternetBandwidthsAsync(
        ListInternetBandwidthsRequest request) {
        return hcClient.asyncInvokeHttp(request, GeipMeta.listInternetBandwidths);
    }

    /**
     * 查询全域公网带宽列表
     *
     * 查询全域公网带宽列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInternetBandwidthsRequest 请求对象
     * @return AsyncInvoker<ListInternetBandwidthsRequest, ListInternetBandwidthsResponse>
     */
    public AsyncInvoker<ListInternetBandwidthsRequest, ListInternetBandwidthsResponse> listInternetBandwidthsAsyncInvoker(
        ListInternetBandwidthsRequest request) {
        return new AsyncInvoker<>(request, GeipMeta.listInternetBandwidths, hcClient);
    }

    /**
     * 查询全域弹性公网IP段支持的掩码列表
     *
     * 查询全域弹性公网IP段支持的掩码列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSupportMasksRequest 请求对象
     * @return CompletableFuture<ListSupportMasksResponse>
     */
    public CompletableFuture<ListSupportMasksResponse> listSupportMasksAsync(ListSupportMasksRequest request) {
        return hcClient.asyncInvokeHttp(request, GeipMeta.listSupportMasks);
    }

    /**
     * 查询全域弹性公网IP段支持的掩码列表
     *
     * 查询全域弹性公网IP段支持的掩码列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSupportMasksRequest 请求对象
     * @return AsyncInvoker<ListSupportMasksRequest, ListSupportMasksResponse>
     */
    public AsyncInvoker<ListSupportMasksRequest, ListSupportMasksResponse> listSupportMasksAsyncInvoker(
        ListSupportMasksRequest request) {
        return new AsyncInvoker<>(request, GeipMeta.listSupportMasks, hcClient);
    }

    /**
     * 查询全域公网带宽详情
     *
     * 查询全域公网带宽详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInternetBandwidthRequest 请求对象
     * @return CompletableFuture<ShowInternetBandwidthResponse>
     */
    public CompletableFuture<ShowInternetBandwidthResponse> showInternetBandwidthAsync(
        ShowInternetBandwidthRequest request) {
        return hcClient.asyncInvokeHttp(request, GeipMeta.showInternetBandwidth);
    }

    /**
     * 查询全域公网带宽详情
     *
     * 查询全域公网带宽详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInternetBandwidthRequest 请求对象
     * @return AsyncInvoker<ShowInternetBandwidthRequest, ShowInternetBandwidthResponse>
     */
    public AsyncInvoker<ShowInternetBandwidthRequest, ShowInternetBandwidthResponse> showInternetBandwidthAsyncInvoker(
        ShowInternetBandwidthRequest request) {
        return new AsyncInvoker<>(request, GeipMeta.showInternetBandwidth, hcClient);
    }

    /**
     * 查询全域公网带宽标签
     *
     * 查询全域公网带宽标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInternetBandwidthTagsRequest 请求对象
     * @return CompletableFuture<ShowInternetBandwidthTagsResponse>
     */
    public CompletableFuture<ShowInternetBandwidthTagsResponse> showInternetBandwidthTagsAsync(
        ShowInternetBandwidthTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, GeipMeta.showInternetBandwidthTags);
    }

    /**
     * 查询全域公网带宽标签
     *
     * 查询全域公网带宽标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInternetBandwidthTagsRequest 请求对象
     * @return AsyncInvoker<ShowInternetBandwidthTagsRequest, ShowInternetBandwidthTagsResponse>
     */
    public AsyncInvoker<ShowInternetBandwidthTagsRequest, ShowInternetBandwidthTagsResponse> showInternetBandwidthTagsAsyncInvoker(
        ShowInternetBandwidthTagsRequest request) {
        return new AsyncInvoker<>(request, GeipMeta.showInternetBandwidthTags, hcClient);
    }

    /**
     * 查询租户签署免责条款详情
     *
     * 查询租户签署免责条款详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowUserDisclaimerRequest 请求对象
     * @return CompletableFuture<ShowUserDisclaimerResponse>
     */
    public CompletableFuture<ShowUserDisclaimerResponse> showUserDisclaimerAsync(ShowUserDisclaimerRequest request) {
        return hcClient.asyncInvokeHttp(request, GeipMeta.showUserDisclaimer);
    }

    /**
     * 查询租户签署免责条款详情
     *
     * 查询租户签署免责条款详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowUserDisclaimerRequest 请求对象
     * @return AsyncInvoker<ShowUserDisclaimerRequest, ShowUserDisclaimerResponse>
     */
    public AsyncInvoker<ShowUserDisclaimerRequest, ShowUserDisclaimerResponse> showUserDisclaimerAsyncInvoker(
        ShowUserDisclaimerRequest request) {
        return new AsyncInvoker<>(request, GeipMeta.showUserDisclaimer, hcClient);
    }

    /**
     * 更新全域公网带宽
     *
     * 更新全域公网带宽
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInternetBandwidthRequest 请求对象
     * @return CompletableFuture<UpdateInternetBandwidthResponse>
     */
    public CompletableFuture<UpdateInternetBandwidthResponse> updateInternetBandwidthAsync(
        UpdateInternetBandwidthRequest request) {
        return hcClient.asyncInvokeHttp(request, GeipMeta.updateInternetBandwidth);
    }

    /**
     * 更新全域公网带宽
     *
     * 更新全域公网带宽
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInternetBandwidthRequest 请求对象
     * @return AsyncInvoker<UpdateInternetBandwidthRequest, UpdateInternetBandwidthResponse>
     */
    public AsyncInvoker<UpdateInternetBandwidthRequest, UpdateInternetBandwidthResponse> updateInternetBandwidthAsyncInvoker(
        UpdateInternetBandwidthRequest request) {
        return new AsyncInvoker<>(request, GeipMeta.updateInternetBandwidth, hcClient);
    }

    /**
     * 添加全域弹性公网IP段标签
     *
     * 添加全域弹性公网IP段的标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddGeipSegmentTagsRequest 请求对象
     * @return CompletableFuture<AddGeipSegmentTagsResponse>
     */
    public CompletableFuture<AddGeipSegmentTagsResponse> addGeipSegmentTagsAsync(AddGeipSegmentTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, GeipMeta.addGeipSegmentTags);
    }

    /**
     * 添加全域弹性公网IP段标签
     *
     * 添加全域弹性公网IP段的标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddGeipSegmentTagsRequest 请求对象
     * @return AsyncInvoker<AddGeipSegmentTagsRequest, AddGeipSegmentTagsResponse>
     */
    public AsyncInvoker<AddGeipSegmentTagsRequest, AddGeipSegmentTagsResponse> addGeipSegmentTagsAsyncInvoker(
        AddGeipSegmentTagsRequest request) {
        return new AsyncInvoker<>(request, GeipMeta.addGeipSegmentTags, hcClient);
    }

    /**
     * 添加全域弹性公网IP标签
     *
     * 添加全域弹性公网IP的标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddGlobalEipTagsRequest 请求对象
     * @return CompletableFuture<AddGlobalEipTagsResponse>
     */
    public CompletableFuture<AddGlobalEipTagsResponse> addGlobalEipTagsAsync(AddGlobalEipTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, GeipMeta.addGlobalEipTags);
    }

    /**
     * 添加全域弹性公网IP标签
     *
     * 添加全域弹性公网IP的标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddGlobalEipTagsRequest 请求对象
     * @return AsyncInvoker<AddGlobalEipTagsRequest, AddGlobalEipTagsResponse>
     */
    public AsyncInvoker<AddGlobalEipTagsRequest, AddGlobalEipTagsResponse> addGlobalEipTagsAsyncInvoker(
        AddGlobalEipTagsRequest request) {
        return new AsyncInvoker<>(request, GeipMeta.addGlobalEipTags, hcClient);
    }

    /**
     * 全域弹性公网IP段绑定后端实例
     *
     * 全域弹性公网IP段绑定后端实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AssociateGeipSegmentInstanceRequest 请求对象
     * @return CompletableFuture<AssociateGeipSegmentInstanceResponse>
     */
    public CompletableFuture<AssociateGeipSegmentInstanceResponse> associateGeipSegmentInstanceAsync(
        AssociateGeipSegmentInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, GeipMeta.associateGeipSegmentInstance);
    }

    /**
     * 全域弹性公网IP段绑定后端实例
     *
     * 全域弹性公网IP段绑定后端实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AssociateGeipSegmentInstanceRequest 请求对象
     * @return AsyncInvoker<AssociateGeipSegmentInstanceRequest, AssociateGeipSegmentInstanceResponse>
     */
    public AsyncInvoker<AssociateGeipSegmentInstanceRequest, AssociateGeipSegmentInstanceResponse> associateGeipSegmentInstanceAsyncInvoker(
        AssociateGeipSegmentInstanceRequest request) {
        return new AsyncInvoker<>(request, GeipMeta.associateGeipSegmentInstance, hcClient);
    }

    /**
     * 绑定后端实例
     *
     * 绑定后端实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AssociateInstanceRequest 请求对象
     * @return CompletableFuture<AssociateInstanceResponse>
     */
    public CompletableFuture<AssociateInstanceResponse> associateInstanceAsync(AssociateInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, GeipMeta.associateInstance);
    }

    /**
     * 绑定后端实例
     *
     * 绑定后端实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AssociateInstanceRequest 请求对象
     * @return AsyncInvoker<AssociateInstanceRequest, AssociateInstanceResponse>
     */
    public AsyncInvoker<AssociateInstanceRequest, AssociateInstanceResponse> associateInstanceAsyncInvoker(
        AssociateInstanceRequest request) {
        return new AsyncInvoker<>(request, GeipMeta.associateInstance, hcClient);
    }

    /**
     * 绑定全域公网带宽
     *
     * 绑定全域公网带宽
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AttachInternetBandwidthRequest 请求对象
     * @return CompletableFuture<AttachInternetBandwidthResponse>
     */
    public CompletableFuture<AttachInternetBandwidthResponse> attachInternetBandwidthAsync(
        AttachInternetBandwidthRequest request) {
        return hcClient.asyncInvokeHttp(request, GeipMeta.attachInternetBandwidth);
    }

    /**
     * 绑定全域公网带宽
     *
     * 绑定全域公网带宽
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AttachInternetBandwidthRequest 请求对象
     * @return AsyncInvoker<AttachInternetBandwidthRequest, AttachInternetBandwidthResponse>
     */
    public AsyncInvoker<AttachInternetBandwidthRequest, AttachInternetBandwidthResponse> attachInternetBandwidthAsyncInvoker(
        AttachInternetBandwidthRequest request) {
        return new AsyncInvoker<>(request, GeipMeta.attachInternetBandwidth, hcClient);
    }

    /**
     * 全域弹性公网IP段批量绑定全域公网带宽
     *
     * 全域弹性公网IP段批量绑定全域公网带宽
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchAttachGeipSegmentInternetBandwidthRequest 请求对象
     * @return CompletableFuture<BatchAttachGeipSegmentInternetBandwidthResponse>
     */
    public CompletableFuture<BatchAttachGeipSegmentInternetBandwidthResponse> batchAttachGeipSegmentInternetBandwidthAsync(
        BatchAttachGeipSegmentInternetBandwidthRequest request) {
        return hcClient.asyncInvokeHttp(request, GeipMeta.batchAttachGeipSegmentInternetBandwidth);
    }

    /**
     * 全域弹性公网IP段批量绑定全域公网带宽
     *
     * 全域弹性公网IP段批量绑定全域公网带宽
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchAttachGeipSegmentInternetBandwidthRequest 请求对象
     * @return AsyncInvoker<BatchAttachGeipSegmentInternetBandwidthRequest, BatchAttachGeipSegmentInternetBandwidthResponse>
     */
    public AsyncInvoker<BatchAttachGeipSegmentInternetBandwidthRequest, BatchAttachGeipSegmentInternetBandwidthResponse> batchAttachGeipSegmentInternetBandwidthAsyncInvoker(
        BatchAttachGeipSegmentInternetBandwidthRequest request) {
        return new AsyncInvoker<>(request, GeipMeta.batchAttachGeipSegmentInternetBandwidth, hcClient);
    }

    /**
     * 批量绑定全域公网带宽
     *
     * 批量绑定全域公网带宽
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchAttachInternetBandwidthRequest 请求对象
     * @return CompletableFuture<BatchAttachInternetBandwidthResponse>
     */
    public CompletableFuture<BatchAttachInternetBandwidthResponse> batchAttachInternetBandwidthAsync(
        BatchAttachInternetBandwidthRequest request) {
        return hcClient.asyncInvokeHttp(request, GeipMeta.batchAttachInternetBandwidth);
    }

    /**
     * 批量绑定全域公网带宽
     *
     * 批量绑定全域公网带宽
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchAttachInternetBandwidthRequest 请求对象
     * @return AsyncInvoker<BatchAttachInternetBandwidthRequest, BatchAttachInternetBandwidthResponse>
     */
    public AsyncInvoker<BatchAttachInternetBandwidthRequest, BatchAttachInternetBandwidthResponse> batchAttachInternetBandwidthAsyncInvoker(
        BatchAttachInternetBandwidthRequest request) {
        return new AsyncInvoker<>(request, GeipMeta.batchAttachInternetBandwidth, hcClient);
    }

    /**
     * 批量添加全域弹性公网IP段标签
     *
     * 批量添加全域弹性公网IP段的标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateGeipSegmentTagsRequest 请求对象
     * @return CompletableFuture<BatchCreateGeipSegmentTagsResponse>
     */
    public CompletableFuture<BatchCreateGeipSegmentTagsResponse> batchCreateGeipSegmentTagsAsync(
        BatchCreateGeipSegmentTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, GeipMeta.batchCreateGeipSegmentTags);
    }

    /**
     * 批量添加全域弹性公网IP段标签
     *
     * 批量添加全域弹性公网IP段的标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateGeipSegmentTagsRequest 请求对象
     * @return AsyncInvoker<BatchCreateGeipSegmentTagsRequest, BatchCreateGeipSegmentTagsResponse>
     */
    public AsyncInvoker<BatchCreateGeipSegmentTagsRequest, BatchCreateGeipSegmentTagsResponse> batchCreateGeipSegmentTagsAsyncInvoker(
        BatchCreateGeipSegmentTagsRequest request) {
        return new AsyncInvoker<>(request, GeipMeta.batchCreateGeipSegmentTags, hcClient);
    }

    /**
     * 批量创建全域弹性公网IP
     *
     * 批量创建全域弹性公网IP
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateGlobalEipRequest 请求对象
     * @return CompletableFuture<BatchCreateGlobalEipResponse>
     */
    public CompletableFuture<BatchCreateGlobalEipResponse> batchCreateGlobalEipAsync(
        BatchCreateGlobalEipRequest request) {
        return hcClient.asyncInvokeHttp(request, GeipMeta.batchCreateGlobalEip);
    }

    /**
     * 批量创建全域弹性公网IP
     *
     * 批量创建全域弹性公网IP
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateGlobalEipRequest 请求对象
     * @return AsyncInvoker<BatchCreateGlobalEipRequest, BatchCreateGlobalEipResponse>
     */
    public AsyncInvoker<BatchCreateGlobalEipRequest, BatchCreateGlobalEipResponse> batchCreateGlobalEipAsyncInvoker(
        BatchCreateGlobalEipRequest request) {
        return new AsyncInvoker<>(request, GeipMeta.batchCreateGlobalEip, hcClient);
    }

    /**
     * 批量添加全域弹性公网IP标签
     *
     * 批量添加全域弹性公网IP的标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateGlobalEipTagsRequest 请求对象
     * @return CompletableFuture<BatchCreateGlobalEipTagsResponse>
     */
    public CompletableFuture<BatchCreateGlobalEipTagsResponse> batchCreateGlobalEipTagsAsync(
        BatchCreateGlobalEipTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, GeipMeta.batchCreateGlobalEipTags);
    }

    /**
     * 批量添加全域弹性公网IP标签
     *
     * 批量添加全域弹性公网IP的标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateGlobalEipTagsRequest 请求对象
     * @return AsyncInvoker<BatchCreateGlobalEipTagsRequest, BatchCreateGlobalEipTagsResponse>
     */
    public AsyncInvoker<BatchCreateGlobalEipTagsRequest, BatchCreateGlobalEipTagsResponse> batchCreateGlobalEipTagsAsyncInvoker(
        BatchCreateGlobalEipTagsRequest request) {
        return new AsyncInvoker<>(request, GeipMeta.batchCreateGlobalEipTags, hcClient);
    }

    /**
     * 批量删除全域弹性公网IP段标签
     *
     * 批量删除全域弹性公网IP段的标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteGeipSegmentTagsRequest 请求对象
     * @return CompletableFuture<BatchDeleteGeipSegmentTagsResponse>
     */
    public CompletableFuture<BatchDeleteGeipSegmentTagsResponse> batchDeleteGeipSegmentTagsAsync(
        BatchDeleteGeipSegmentTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, GeipMeta.batchDeleteGeipSegmentTags);
    }

    /**
     * 批量删除全域弹性公网IP段标签
     *
     * 批量删除全域弹性公网IP段的标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteGeipSegmentTagsRequest 请求对象
     * @return AsyncInvoker<BatchDeleteGeipSegmentTagsRequest, BatchDeleteGeipSegmentTagsResponse>
     */
    public AsyncInvoker<BatchDeleteGeipSegmentTagsRequest, BatchDeleteGeipSegmentTagsResponse> batchDeleteGeipSegmentTagsAsyncInvoker(
        BatchDeleteGeipSegmentTagsRequest request) {
        return new AsyncInvoker<>(request, GeipMeta.batchDeleteGeipSegmentTags, hcClient);
    }

    /**
     * 批量删除全域弹性公网IP标签
     *
     * 批量删除全域弹性公网IP的标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteGlobalEipTagsRequest 请求对象
     * @return CompletableFuture<BatchDeleteGlobalEipTagsResponse>
     */
    public CompletableFuture<BatchDeleteGlobalEipTagsResponse> batchDeleteGlobalEipTagsAsync(
        BatchDeleteGlobalEipTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, GeipMeta.batchDeleteGlobalEipTags);
    }

    /**
     * 批量删除全域弹性公网IP标签
     *
     * 批量删除全域弹性公网IP的标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteGlobalEipTagsRequest 请求对象
     * @return AsyncInvoker<BatchDeleteGlobalEipTagsRequest, BatchDeleteGlobalEipTagsResponse>
     */
    public AsyncInvoker<BatchDeleteGlobalEipTagsRequest, BatchDeleteGlobalEipTagsResponse> batchDeleteGlobalEipTagsAsyncInvoker(
        BatchDeleteGlobalEipTagsRequest request) {
        return new AsyncInvoker<>(request, GeipMeta.batchDeleteGlobalEipTags, hcClient);
    }

    /**
     * 全域弹性公网IP段批量解绑全域公网带宽
     *
     * 全域弹性公网IP段批量解绑全域公网带宽
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDetachGeipSegmentInternetBandwidthRequest 请求对象
     * @return CompletableFuture<BatchDetachGeipSegmentInternetBandwidthResponse>
     */
    public CompletableFuture<BatchDetachGeipSegmentInternetBandwidthResponse> batchDetachGeipSegmentInternetBandwidthAsync(
        BatchDetachGeipSegmentInternetBandwidthRequest request) {
        return hcClient.asyncInvokeHttp(request, GeipMeta.batchDetachGeipSegmentInternetBandwidth);
    }

    /**
     * 全域弹性公网IP段批量解绑全域公网带宽
     *
     * 全域弹性公网IP段批量解绑全域公网带宽
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDetachGeipSegmentInternetBandwidthRequest 请求对象
     * @return AsyncInvoker<BatchDetachGeipSegmentInternetBandwidthRequest, BatchDetachGeipSegmentInternetBandwidthResponse>
     */
    public AsyncInvoker<BatchDetachGeipSegmentInternetBandwidthRequest, BatchDetachGeipSegmentInternetBandwidthResponse> batchDetachGeipSegmentInternetBandwidthAsyncInvoker(
        BatchDetachGeipSegmentInternetBandwidthRequest request) {
        return new AsyncInvoker<>(request, GeipMeta.batchDetachGeipSegmentInternetBandwidth, hcClient);
    }

    /**
     * 批量解绑全域公网带宽
     *
     * 批量解绑全域公网带宽
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDetachInternetBandwidthRequest 请求对象
     * @return CompletableFuture<BatchDetachInternetBandwidthResponse>
     */
    public CompletableFuture<BatchDetachInternetBandwidthResponse> batchDetachInternetBandwidthAsync(
        BatchDetachInternetBandwidthRequest request) {
        return hcClient.asyncInvokeHttp(request, GeipMeta.batchDetachInternetBandwidth);
    }

    /**
     * 批量解绑全域公网带宽
     *
     * 批量解绑全域公网带宽
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDetachInternetBandwidthRequest 请求对象
     * @return AsyncInvoker<BatchDetachInternetBandwidthRequest, BatchDetachInternetBandwidthResponse>
     */
    public AsyncInvoker<BatchDetachInternetBandwidthRequest, BatchDetachInternetBandwidthResponse> batchDetachInternetBandwidthAsyncInvoker(
        BatchDetachInternetBandwidthRequest request) {
        return new AsyncInvoker<>(request, GeipMeta.batchDetachInternetBandwidth, hcClient);
    }

    /**
     * 查询全域弹性公网IP段个数
     *
     * 查询全域弹性公网IP段个数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CountGlobalEipSegmentRequest 请求对象
     * @return CompletableFuture<CountGlobalEipSegmentResponse>
     */
    public CompletableFuture<CountGlobalEipSegmentResponse> countGlobalEipSegmentAsync(
        CountGlobalEipSegmentRequest request) {
        return hcClient.asyncInvokeHttp(request, GeipMeta.countGlobalEipSegment);
    }

    /**
     * 查询全域弹性公网IP段个数
     *
     * 查询全域弹性公网IP段个数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CountGlobalEipSegmentRequest 请求对象
     * @return AsyncInvoker<CountGlobalEipSegmentRequest, CountGlobalEipSegmentResponse>
     */
    public AsyncInvoker<CountGlobalEipSegmentRequest, CountGlobalEipSegmentResponse> countGlobalEipSegmentAsyncInvoker(
        CountGlobalEipSegmentRequest request) {
        return new AsyncInvoker<>(request, GeipMeta.countGlobalEipSegment, hcClient);
    }

    /**
     * 查询全域弹性公网IP个数
     *
     * 查询全域弹性公网IP个数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CountGlobalEipsRequest 请求对象
     * @return CompletableFuture<CountGlobalEipsResponse>
     */
    public CompletableFuture<CountGlobalEipsResponse> countGlobalEipsAsync(CountGlobalEipsRequest request) {
        return hcClient.asyncInvokeHttp(request, GeipMeta.countGlobalEips);
    }

    /**
     * 查询全域弹性公网IP个数
     *
     * 查询全域弹性公网IP个数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CountGlobalEipsRequest 请求对象
     * @return AsyncInvoker<CountGlobalEipsRequest, CountGlobalEipsResponse>
     */
    public AsyncInvoker<CountGlobalEipsRequest, CountGlobalEipsResponse> countGlobalEipsAsyncInvoker(
        CountGlobalEipsRequest request) {
        return new AsyncInvoker<>(request, GeipMeta.countGlobalEips, hcClient);
    }

    /**
     * 创建全域弹性公网IP
     *
     * 创建全域弹性公网IP
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateGlobalEipRequest 请求对象
     * @return CompletableFuture<CreateGlobalEipResponse>
     */
    public CompletableFuture<CreateGlobalEipResponse> createGlobalEipAsync(CreateGlobalEipRequest request) {
        return hcClient.asyncInvokeHttp(request, GeipMeta.createGlobalEip);
    }

    /**
     * 创建全域弹性公网IP
     *
     * 创建全域弹性公网IP
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateGlobalEipRequest 请求对象
     * @return AsyncInvoker<CreateGlobalEipRequest, CreateGlobalEipResponse>
     */
    public AsyncInvoker<CreateGlobalEipRequest, CreateGlobalEipResponse> createGlobalEipAsyncInvoker(
        CreateGlobalEipRequest request) {
        return new AsyncInvoker<>(request, GeipMeta.createGlobalEip, hcClient);
    }

    /**
     * 创建全域弹性公网IP段
     *
     * 创建全域弹性公网IP段
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateGlobalEipSegmentRequest 请求对象
     * @return CompletableFuture<CreateGlobalEipSegmentResponse>
     */
    public CompletableFuture<CreateGlobalEipSegmentResponse> createGlobalEipSegmentAsync(
        CreateGlobalEipSegmentRequest request) {
        return hcClient.asyncInvokeHttp(request, GeipMeta.createGlobalEipSegment);
    }

    /**
     * 创建全域弹性公网IP段
     *
     * 创建全域弹性公网IP段
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateGlobalEipSegmentRequest 请求对象
     * @return AsyncInvoker<CreateGlobalEipSegmentRequest, CreateGlobalEipSegmentResponse>
     */
    public AsyncInvoker<CreateGlobalEipSegmentRequest, CreateGlobalEipSegmentResponse> createGlobalEipSegmentAsyncInvoker(
        CreateGlobalEipSegmentRequest request) {
        return new AsyncInvoker<>(request, GeipMeta.createGlobalEipSegment, hcClient);
    }

    /**
     * 删除全域弹性公网IP段标签
     *
     * 删除全域弹性公网IP段的标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteGeipSegmentTagRequest 请求对象
     * @return CompletableFuture<DeleteGeipSegmentTagResponse>
     */
    public CompletableFuture<DeleteGeipSegmentTagResponse> deleteGeipSegmentTagAsync(
        DeleteGeipSegmentTagRequest request) {
        return hcClient.asyncInvokeHttp(request, GeipMeta.deleteGeipSegmentTag);
    }

    /**
     * 删除全域弹性公网IP段标签
     *
     * 删除全域弹性公网IP段的标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteGeipSegmentTagRequest 请求对象
     * @return AsyncInvoker<DeleteGeipSegmentTagRequest, DeleteGeipSegmentTagResponse>
     */
    public AsyncInvoker<DeleteGeipSegmentTagRequest, DeleteGeipSegmentTagResponse> deleteGeipSegmentTagAsyncInvoker(
        DeleteGeipSegmentTagRequest request) {
        return new AsyncInvoker<>(request, GeipMeta.deleteGeipSegmentTag, hcClient);
    }

    /**
     * 删除全域弹性公网IP
     *
     * 删除全域弹性公网IP
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteGlobalEipRequest 请求对象
     * @return CompletableFuture<DeleteGlobalEipResponse>
     */
    public CompletableFuture<DeleteGlobalEipResponse> deleteGlobalEipAsync(DeleteGlobalEipRequest request) {
        return hcClient.asyncInvokeHttp(request, GeipMeta.deleteGlobalEip);
    }

    /**
     * 删除全域弹性公网IP
     *
     * 删除全域弹性公网IP
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteGlobalEipRequest 请求对象
     * @return AsyncInvoker<DeleteGlobalEipRequest, DeleteGlobalEipResponse>
     */
    public AsyncInvoker<DeleteGlobalEipRequest, DeleteGlobalEipResponse> deleteGlobalEipAsyncInvoker(
        DeleteGlobalEipRequest request) {
        return new AsyncInvoker<>(request, GeipMeta.deleteGlobalEip, hcClient);
    }

    /**
     * 删除全域弹性公网IP段
     *
     * 删除全域弹性公网IP段
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteGlobalEipSegmentRequest 请求对象
     * @return CompletableFuture<DeleteGlobalEipSegmentResponse>
     */
    public CompletableFuture<DeleteGlobalEipSegmentResponse> deleteGlobalEipSegmentAsync(
        DeleteGlobalEipSegmentRequest request) {
        return hcClient.asyncInvokeHttp(request, GeipMeta.deleteGlobalEipSegment);
    }

    /**
     * 删除全域弹性公网IP段
     *
     * 删除全域弹性公网IP段
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteGlobalEipSegmentRequest 请求对象
     * @return AsyncInvoker<DeleteGlobalEipSegmentRequest, DeleteGlobalEipSegmentResponse>
     */
    public AsyncInvoker<DeleteGlobalEipSegmentRequest, DeleteGlobalEipSegmentResponse> deleteGlobalEipSegmentAsyncInvoker(
        DeleteGlobalEipSegmentRequest request) {
        return new AsyncInvoker<>(request, GeipMeta.deleteGlobalEipSegment, hcClient);
    }

    /**
     * 删除全域弹性公网IP标签
     *
     * 删除全域弹性公网IP的标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteGlobalEipTagRequest 请求对象
     * @return CompletableFuture<DeleteGlobalEipTagResponse>
     */
    public CompletableFuture<DeleteGlobalEipTagResponse> deleteGlobalEipTagAsync(DeleteGlobalEipTagRequest request) {
        return hcClient.asyncInvokeHttp(request, GeipMeta.deleteGlobalEipTag);
    }

    /**
     * 删除全域弹性公网IP标签
     *
     * 删除全域弹性公网IP的标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteGlobalEipTagRequest 请求对象
     * @return AsyncInvoker<DeleteGlobalEipTagRequest, DeleteGlobalEipTagResponse>
     */
    public AsyncInvoker<DeleteGlobalEipTagRequest, DeleteGlobalEipTagResponse> deleteGlobalEipTagAsyncInvoker(
        DeleteGlobalEipTagRequest request) {
        return new AsyncInvoker<>(request, GeipMeta.deleteGlobalEipTag, hcClient);
    }

    /**
     * 解绑全域公网带宽
     *
     * 解绑全域公网带宽
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DetachInternetBandwidthRequest 请求对象
     * @return CompletableFuture<DetachInternetBandwidthResponse>
     */
    public CompletableFuture<DetachInternetBandwidthResponse> detachInternetBandwidthAsync(
        DetachInternetBandwidthRequest request) {
        return hcClient.asyncInvokeHttp(request, GeipMeta.detachInternetBandwidth);
    }

    /**
     * 解绑全域公网带宽
     *
     * 解绑全域公网带宽
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DetachInternetBandwidthRequest 请求对象
     * @return AsyncInvoker<DetachInternetBandwidthRequest, DetachInternetBandwidthResponse>
     */
    public AsyncInvoker<DetachInternetBandwidthRequest, DetachInternetBandwidthResponse> detachInternetBandwidthAsyncInvoker(
        DetachInternetBandwidthRequest request) {
        return new AsyncInvoker<>(request, GeipMeta.detachInternetBandwidth, hcClient);
    }

    /**
     * 全域弹性公网IP段解绑后端实例
     *
     * 全域弹性公网IP段解绑后端实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisassociateGeipSegmentInstanceRequest 请求对象
     * @return CompletableFuture<DisassociateGeipSegmentInstanceResponse>
     */
    public CompletableFuture<DisassociateGeipSegmentInstanceResponse> disassociateGeipSegmentInstanceAsync(
        DisassociateGeipSegmentInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, GeipMeta.disassociateGeipSegmentInstance);
    }

    /**
     * 全域弹性公网IP段解绑后端实例
     *
     * 全域弹性公网IP段解绑后端实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisassociateGeipSegmentInstanceRequest 请求对象
     * @return AsyncInvoker<DisassociateGeipSegmentInstanceRequest, DisassociateGeipSegmentInstanceResponse>
     */
    public AsyncInvoker<DisassociateGeipSegmentInstanceRequest, DisassociateGeipSegmentInstanceResponse> disassociateGeipSegmentInstanceAsyncInvoker(
        DisassociateGeipSegmentInstanceRequest request) {
        return new AsyncInvoker<>(request, GeipMeta.disassociateGeipSegmentInstance, hcClient);
    }

    /**
     * 解绑后端实例
     *
     * 解绑后端实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisassociateInstanceRequest 请求对象
     * @return CompletableFuture<DisassociateInstanceResponse>
     */
    public CompletableFuture<DisassociateInstanceResponse> disassociateInstanceAsync(
        DisassociateInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, GeipMeta.disassociateInstance);
    }

    /**
     * 解绑后端实例
     *
     * 解绑后端实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisassociateInstanceRequest 请求对象
     * @return AsyncInvoker<DisassociateInstanceRequest, DisassociateInstanceResponse>
     */
    public AsyncInvoker<DisassociateInstanceRequest, DisassociateInstanceResponse> disassociateInstanceAsyncInvoker(
        DisassociateInstanceRequest request) {
        return new AsyncInvoker<>(request, GeipMeta.disassociateInstance, hcClient);
    }

    /**
     * 查询全域弹性公网IP池列表
     *
     * 查询全域弹性公网IP池列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGeipPoolsRequest 请求对象
     * @return CompletableFuture<ListGeipPoolsResponse>
     */
    public CompletableFuture<ListGeipPoolsResponse> listGeipPoolsAsync(ListGeipPoolsRequest request) {
        return hcClient.asyncInvokeHttp(request, GeipMeta.listGeipPools);
    }

    /**
     * 查询全域弹性公网IP池列表
     *
     * 查询全域弹性公网IP池列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGeipPoolsRequest 请求对象
     * @return AsyncInvoker<ListGeipPoolsRequest, ListGeipPoolsResponse>
     */
    public AsyncInvoker<ListGeipPoolsRequest, ListGeipPoolsResponse> listGeipPoolsAsyncInvoker(
        ListGeipPoolsRequest request) {
        return new AsyncInvoker<>(request, GeipMeta.listGeipPools, hcClient);
    }

    /**
     * 查询资源实例列表数目
     *
     * 查询资源实例列表的数目
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGeipSegmentCountFilterTagsRequest 请求对象
     * @return CompletableFuture<ListGeipSegmentCountFilterTagsResponse>
     */
    public CompletableFuture<ListGeipSegmentCountFilterTagsResponse> listGeipSegmentCountFilterTagsAsync(
        ListGeipSegmentCountFilterTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, GeipMeta.listGeipSegmentCountFilterTags);
    }

    /**
     * 查询资源实例列表数目
     *
     * 查询资源实例列表的数目
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGeipSegmentCountFilterTagsRequest 请求对象
     * @return AsyncInvoker<ListGeipSegmentCountFilterTagsRequest, ListGeipSegmentCountFilterTagsResponse>
     */
    public AsyncInvoker<ListGeipSegmentCountFilterTagsRequest, ListGeipSegmentCountFilterTagsResponse> listGeipSegmentCountFilterTagsAsyncInvoker(
        ListGeipSegmentCountFilterTagsRequest request) {
        return new AsyncInvoker<>(request, GeipMeta.listGeipSegmentCountFilterTags, hcClient);
    }

    /**
     * 查询全域弹性公网IP段项目标签
     *
     * 查询全域弹性公网IP段的项目标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGeipSegmentDomainTagsRequest 请求对象
     * @return CompletableFuture<ListGeipSegmentDomainTagsResponse>
     */
    public CompletableFuture<ListGeipSegmentDomainTagsResponse> listGeipSegmentDomainTagsAsync(
        ListGeipSegmentDomainTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, GeipMeta.listGeipSegmentDomainTags);
    }

    /**
     * 查询全域弹性公网IP段项目标签
     *
     * 查询全域弹性公网IP段的项目标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGeipSegmentDomainTagsRequest 请求对象
     * @return AsyncInvoker<ListGeipSegmentDomainTagsRequest, ListGeipSegmentDomainTagsResponse>
     */
    public AsyncInvoker<ListGeipSegmentDomainTagsRequest, ListGeipSegmentDomainTagsResponse> listGeipSegmentDomainTagsAsyncInvoker(
        ListGeipSegmentDomainTagsRequest request) {
        return new AsyncInvoker<>(request, GeipMeta.listGeipSegmentDomainTags, hcClient);
    }

    /**
     * 查询资源实例列表
     *
     * 查询资源实例的列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGeipSegmentFilterTagsRequest 请求对象
     * @return CompletableFuture<ListGeipSegmentFilterTagsResponse>
     */
    public CompletableFuture<ListGeipSegmentFilterTagsResponse> listGeipSegmentFilterTagsAsync(
        ListGeipSegmentFilterTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, GeipMeta.listGeipSegmentFilterTags);
    }

    /**
     * 查询资源实例列表
     *
     * 查询资源实例的列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGeipSegmentFilterTagsRequest 请求对象
     * @return AsyncInvoker<ListGeipSegmentFilterTagsRequest, ListGeipSegmentFilterTagsResponse>
     */
    public AsyncInvoker<ListGeipSegmentFilterTagsRequest, ListGeipSegmentFilterTagsResponse> listGeipSegmentFilterTagsAsyncInvoker(
        ListGeipSegmentFilterTagsRequest request) {
        return new AsyncInvoker<>(request, GeipMeta.listGeipSegmentFilterTags, hcClient);
    }

    /**
     * 查询资源实例列表数目
     *
     * 查询资源实例列表数目
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGlobalEipCountFilterTagsRequest 请求对象
     * @return CompletableFuture<ListGlobalEipCountFilterTagsResponse>
     */
    public CompletableFuture<ListGlobalEipCountFilterTagsResponse> listGlobalEipCountFilterTagsAsync(
        ListGlobalEipCountFilterTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, GeipMeta.listGlobalEipCountFilterTags);
    }

    /**
     * 查询资源实例列表数目
     *
     * 查询资源实例列表数目
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGlobalEipCountFilterTagsRequest 请求对象
     * @return AsyncInvoker<ListGlobalEipCountFilterTagsRequest, ListGlobalEipCountFilterTagsResponse>
     */
    public AsyncInvoker<ListGlobalEipCountFilterTagsRequest, ListGlobalEipCountFilterTagsResponse> listGlobalEipCountFilterTagsAsyncInvoker(
        ListGlobalEipCountFilterTagsRequest request) {
        return new AsyncInvoker<>(request, GeipMeta.listGlobalEipCountFilterTags, hcClient);
    }

    /**
     * 查询全域弹性公网IP项目标签
     *
     * 查询全域弹性公网IP的项目标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGlobalEipDomainTagsRequest 请求对象
     * @return CompletableFuture<ListGlobalEipDomainTagsResponse>
     */
    public CompletableFuture<ListGlobalEipDomainTagsResponse> listGlobalEipDomainTagsAsync(
        ListGlobalEipDomainTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, GeipMeta.listGlobalEipDomainTags);
    }

    /**
     * 查询全域弹性公网IP项目标签
     *
     * 查询全域弹性公网IP的项目标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGlobalEipDomainTagsRequest 请求对象
     * @return AsyncInvoker<ListGlobalEipDomainTagsRequest, ListGlobalEipDomainTagsResponse>
     */
    public AsyncInvoker<ListGlobalEipDomainTagsRequest, ListGlobalEipDomainTagsResponse> listGlobalEipDomainTagsAsyncInvoker(
        ListGlobalEipDomainTagsRequest request) {
        return new AsyncInvoker<>(request, GeipMeta.listGlobalEipDomainTags, hcClient);
    }

    /**
     * 查询资源实例列表
     *
     * 查询资源实例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGlobalEipFilterTagsRequest 请求对象
     * @return CompletableFuture<ListGlobalEipFilterTagsResponse>
     */
    public CompletableFuture<ListGlobalEipFilterTagsResponse> listGlobalEipFilterTagsAsync(
        ListGlobalEipFilterTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, GeipMeta.listGlobalEipFilterTags);
    }

    /**
     * 查询资源实例列表
     *
     * 查询资源实例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGlobalEipFilterTagsRequest 请求对象
     * @return AsyncInvoker<ListGlobalEipFilterTagsRequest, ListGlobalEipFilterTagsResponse>
     */
    public AsyncInvoker<ListGlobalEipFilterTagsRequest, ListGlobalEipFilterTagsResponse> listGlobalEipFilterTagsAsyncInvoker(
        ListGlobalEipFilterTagsRequest request) {
        return new AsyncInvoker<>(request, GeipMeta.listGlobalEipFilterTags, hcClient);
    }

    /**
     * 查询全域弹性公网IP段列表
     *
     * 查询全域弹性公网IP段列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGlobalEipSegmentsRequest 请求对象
     * @return CompletableFuture<ListGlobalEipSegmentsResponse>
     */
    public CompletableFuture<ListGlobalEipSegmentsResponse> listGlobalEipSegmentsAsync(
        ListGlobalEipSegmentsRequest request) {
        return hcClient.asyncInvokeHttp(request, GeipMeta.listGlobalEipSegments);
    }

    /**
     * 查询全域弹性公网IP段列表
     *
     * 查询全域弹性公网IP段列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGlobalEipSegmentsRequest 请求对象
     * @return AsyncInvoker<ListGlobalEipSegmentsRequest, ListGlobalEipSegmentsResponse>
     */
    public AsyncInvoker<ListGlobalEipSegmentsRequest, ListGlobalEipSegmentsResponse> listGlobalEipSegmentsAsyncInvoker(
        ListGlobalEipSegmentsRequest request) {
        return new AsyncInvoker<>(request, GeipMeta.listGlobalEipSegments, hcClient);
    }

    /**
     * 查询全域弹性公网IP列表
     *
     * 查询全域弹性公网IP列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGlobalEipsRequest 请求对象
     * @return CompletableFuture<ListGlobalEipsResponse>
     */
    public CompletableFuture<ListGlobalEipsResponse> listGlobalEipsAsync(ListGlobalEipsRequest request) {
        return hcClient.asyncInvokeHttp(request, GeipMeta.listGlobalEips);
    }

    /**
     * 查询全域弹性公网IP列表
     *
     * 查询全域弹性公网IP列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGlobalEipsRequest 请求对象
     * @return AsyncInvoker<ListGlobalEipsRequest, ListGlobalEipsResponse>
     */
    public AsyncInvoker<ListGlobalEipsRequest, ListGlobalEipsResponse> listGlobalEipsAsyncInvoker(
        ListGlobalEipsRequest request) {
        return new AsyncInvoker<>(request, GeipMeta.listGlobalEips, hcClient);
    }

    /**
     * 查询全域弹性公网IP段标签
     *
     * 查询全域弹性公网IP段的标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGeipSegmentTagsRequest 请求对象
     * @return CompletableFuture<ShowGeipSegmentTagsResponse>
     */
    public CompletableFuture<ShowGeipSegmentTagsResponse> showGeipSegmentTagsAsync(ShowGeipSegmentTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, GeipMeta.showGeipSegmentTags);
    }

    /**
     * 查询全域弹性公网IP段标签
     *
     * 查询全域弹性公网IP段的标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGeipSegmentTagsRequest 请求对象
     * @return AsyncInvoker<ShowGeipSegmentTagsRequest, ShowGeipSegmentTagsResponse>
     */
    public AsyncInvoker<ShowGeipSegmentTagsRequest, ShowGeipSegmentTagsResponse> showGeipSegmentTagsAsyncInvoker(
        ShowGeipSegmentTagsRequest request) {
        return new AsyncInvoker<>(request, GeipMeta.showGeipSegmentTags, hcClient);
    }

    /**
     * 查询全域弹性公网IP详情
     *
     * 查询全域弹性公网IP详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGlobalEipRequest 请求对象
     * @return CompletableFuture<ShowGlobalEipResponse>
     */
    public CompletableFuture<ShowGlobalEipResponse> showGlobalEipAsync(ShowGlobalEipRequest request) {
        return hcClient.asyncInvokeHttp(request, GeipMeta.showGlobalEip);
    }

    /**
     * 查询全域弹性公网IP详情
     *
     * 查询全域弹性公网IP详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGlobalEipRequest 请求对象
     * @return AsyncInvoker<ShowGlobalEipRequest, ShowGlobalEipResponse>
     */
    public AsyncInvoker<ShowGlobalEipRequest, ShowGlobalEipResponse> showGlobalEipAsyncInvoker(
        ShowGlobalEipRequest request) {
        return new AsyncInvoker<>(request, GeipMeta.showGlobalEip, hcClient);
    }

    /**
     * 查询全域弹性公网IP段详情
     *
     * 查询全域弹性公网IP段详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGlobalEipSegmentRequest 请求对象
     * @return CompletableFuture<ShowGlobalEipSegmentResponse>
     */
    public CompletableFuture<ShowGlobalEipSegmentResponse> showGlobalEipSegmentAsync(
        ShowGlobalEipSegmentRequest request) {
        return hcClient.asyncInvokeHttp(request, GeipMeta.showGlobalEipSegment);
    }

    /**
     * 查询全域弹性公网IP段详情
     *
     * 查询全域弹性公网IP段详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGlobalEipSegmentRequest 请求对象
     * @return AsyncInvoker<ShowGlobalEipSegmentRequest, ShowGlobalEipSegmentResponse>
     */
    public AsyncInvoker<ShowGlobalEipSegmentRequest, ShowGlobalEipSegmentResponse> showGlobalEipSegmentAsyncInvoker(
        ShowGlobalEipSegmentRequest request) {
        return new AsyncInvoker<>(request, GeipMeta.showGlobalEipSegment, hcClient);
    }

    /**
     * 查询全域弹性公网IP标签
     *
     * 查询全域弹性公网IP的标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGlobalEipTagsRequest 请求对象
     * @return CompletableFuture<ShowGlobalEipTagsResponse>
     */
    public CompletableFuture<ShowGlobalEipTagsResponse> showGlobalEipTagsAsync(ShowGlobalEipTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, GeipMeta.showGlobalEipTags);
    }

    /**
     * 查询全域弹性公网IP标签
     *
     * 查询全域弹性公网IP的标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGlobalEipTagsRequest 请求对象
     * @return AsyncInvoker<ShowGlobalEipTagsRequest, ShowGlobalEipTagsResponse>
     */
    public AsyncInvoker<ShowGlobalEipTagsRequest, ShowGlobalEipTagsResponse> showGlobalEipTagsAsyncInvoker(
        ShowGlobalEipTagsRequest request) {
        return new AsyncInvoker<>(request, GeipMeta.showGlobalEipTags, hcClient);
    }

    /**
     * 更新全域弹性公网IP信息
     *
     * 更新全域弹性公网IP信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateGlobalEipRequest 请求对象
     * @return CompletableFuture<UpdateGlobalEipResponse>
     */
    public CompletableFuture<UpdateGlobalEipResponse> updateGlobalEipAsync(UpdateGlobalEipRequest request) {
        return hcClient.asyncInvokeHttp(request, GeipMeta.updateGlobalEip);
    }

    /**
     * 更新全域弹性公网IP信息
     *
     * 更新全域弹性公网IP信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateGlobalEipRequest 请求对象
     * @return AsyncInvoker<UpdateGlobalEipRequest, UpdateGlobalEipResponse>
     */
    public AsyncInvoker<UpdateGlobalEipRequest, UpdateGlobalEipResponse> updateGlobalEipAsyncInvoker(
        UpdateGlobalEipRequest request) {
        return new AsyncInvoker<>(request, GeipMeta.updateGlobalEip, hcClient);
    }

    /**
     * 更新全域弹性公网IP段
     *
     * 更新全域弹性公网IP段
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateGlobalEipSegmentRequest 请求对象
     * @return CompletableFuture<UpdateGlobalEipSegmentResponse>
     */
    public CompletableFuture<UpdateGlobalEipSegmentResponse> updateGlobalEipSegmentAsync(
        UpdateGlobalEipSegmentRequest request) {
        return hcClient.asyncInvokeHttp(request, GeipMeta.updateGlobalEipSegment);
    }

    /**
     * 更新全域弹性公网IP段
     *
     * 更新全域弹性公网IP段
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateGlobalEipSegmentRequest 请求对象
     * @return AsyncInvoker<UpdateGlobalEipSegmentRequest, UpdateGlobalEipSegmentResponse>
     */
    public AsyncInvoker<UpdateGlobalEipSegmentRequest, UpdateGlobalEipSegmentResponse> updateGlobalEipSegmentAsyncInvoker(
        UpdateGlobalEipSegmentRequest request) {
        return new AsyncInvoker<>(request, GeipMeta.updateGlobalEipSegment, hcClient);
    }

    /**
     * 查询Job列表
     *
     * 查询Job列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListJobsRequest 请求对象
     * @return CompletableFuture<ListJobsResponse>
     */
    public CompletableFuture<ListJobsResponse> listJobsAsync(ListJobsRequest request) {
        return hcClient.asyncInvokeHttp(request, GeipMeta.listJobs);
    }

    /**
     * 查询Job列表
     *
     * 查询Job列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListJobsRequest 请求对象
     * @return AsyncInvoker<ListJobsRequest, ListJobsResponse>
     */
    public AsyncInvoker<ListJobsRequest, ListJobsResponse> listJobsAsyncInvoker(ListJobsRequest request) {
        return new AsyncInvoker<>(request, GeipMeta.listJobs, hcClient);
    }

    /**
     * 查询Job详情
     *
     * 查询Job详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowJobsRequest 请求对象
     * @return CompletableFuture<ShowJobsResponse>
     */
    public CompletableFuture<ShowJobsResponse> showJobsAsync(ShowJobsRequest request) {
        return hcClient.asyncInvokeHttp(request, GeipMeta.showJobs);
    }

    /**
     * 查询Job详情
     *
     * 查询Job详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowJobsRequest 请求对象
     * @return AsyncInvoker<ShowJobsRequest, ShowJobsResponse>
     */
    public AsyncInvoker<ShowJobsRequest, ShowJobsResponse> showJobsAsyncInvoker(ShowJobsRequest request) {
        return new AsyncInvoker<>(request, GeipMeta.showJobs, hcClient);
    }

    /**
     * 全域弹性公网IP支持绑定的Region限制
     *
     * 全域弹性公网IP支持绑定的Region限制
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSupportRegionsRequest 请求对象
     * @return CompletableFuture<ListSupportRegionsResponse>
     */
    public CompletableFuture<ListSupportRegionsResponse> listSupportRegionsAsync(ListSupportRegionsRequest request) {
        return hcClient.asyncInvokeHttp(request, GeipMeta.listSupportRegions);
    }

    /**
     * 全域弹性公网IP支持绑定的Region限制
     *
     * 全域弹性公网IP支持绑定的Region限制
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSupportRegionsRequest 请求对象
     * @return AsyncInvoker<ListSupportRegionsRequest, ListSupportRegionsResponse>
     */
    public AsyncInvoker<ListSupportRegionsRequest, ListSupportRegionsResponse> listSupportRegionsAsyncInvoker(
        ListSupportRegionsRequest request) {
        return new AsyncInvoker<>(request, GeipMeta.listSupportRegions, hcClient);
    }

    /**
     * 查询指定站点允许绑定的Region信息
     *
     * console通过此接口获取指定pop点的全域弹性公网IP允许绑定的region实例信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTenantGeipSupportInstancesRequest 请求对象
     * @return CompletableFuture<ListTenantGeipSupportInstancesResponse>
     */
    public CompletableFuture<ListTenantGeipSupportInstancesResponse> listTenantGeipSupportInstancesAsync(
        ListTenantGeipSupportInstancesRequest request) {
        return hcClient.asyncInvokeHttp(request, GeipMeta.listTenantGeipSupportInstances);
    }

    /**
     * 查询指定站点允许绑定的Region信息
     *
     * console通过此接口获取指定pop点的全域弹性公网IP允许绑定的region实例信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTenantGeipSupportInstancesRequest 请求对象
     * @return AsyncInvoker<ListTenantGeipSupportInstancesRequest, ListTenantGeipSupportInstancesResponse>
     */
    public AsyncInvoker<ListTenantGeipSupportInstancesRequest, ListTenantGeipSupportInstancesResponse> listTenantGeipSupportInstancesAsyncInvoker(
        ListTenantGeipSupportInstancesRequest request) {
        return new AsyncInvoker<>(request, GeipMeta.listTenantGeipSupportInstances, hcClient);
    }

}
