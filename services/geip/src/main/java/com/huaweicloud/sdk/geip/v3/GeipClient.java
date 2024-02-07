package com.huaweicloud.sdk.geip.v3;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
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

public class GeipClient {

    protected HcClient hcClient;

    public GeipClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<GeipClient> newBuilder() {
        ClientBuilder<GeipClient> clientBuilder = new ClientBuilder<>(GeipClient::new, "GlobalCredentials");
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
     * @return AddInternetBandwidthTagsResponse
     */
    public AddInternetBandwidthTagsResponse addInternetBandwidthTags(AddInternetBandwidthTagsRequest request) {
        return hcClient.syncInvokeHttp(request, GeipMeta.addInternetBandwidthTags);
    }

    /**
     * 添加全域公网带宽标签
     *
     * 添加全域公网带宽标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddInternetBandwidthTagsRequest 请求对象
     * @return SyncInvoker<AddInternetBandwidthTagsRequest, AddInternetBandwidthTagsResponse>
     */
    public SyncInvoker<AddInternetBandwidthTagsRequest, AddInternetBandwidthTagsResponse> addInternetBandwidthTagsInvoker(
        AddInternetBandwidthTagsRequest request) {
        return new SyncInvoker<>(request, GeipMeta.addInternetBandwidthTags, hcClient);
    }

    /**
     * 批量创建全域公网带宽
     *
     * 批量创建全域公网带宽
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateInternetBandwidthRequest 请求对象
     * @return BatchCreateInternetBandwidthResponse
     */
    public BatchCreateInternetBandwidthResponse batchCreateInternetBandwidth(
        BatchCreateInternetBandwidthRequest request) {
        return hcClient.syncInvokeHttp(request, GeipMeta.batchCreateInternetBandwidth);
    }

    /**
     * 批量创建全域公网带宽
     *
     * 批量创建全域公网带宽
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateInternetBandwidthRequest 请求对象
     * @return SyncInvoker<BatchCreateInternetBandwidthRequest, BatchCreateInternetBandwidthResponse>
     */
    public SyncInvoker<BatchCreateInternetBandwidthRequest, BatchCreateInternetBandwidthResponse> batchCreateInternetBandwidthInvoker(
        BatchCreateInternetBandwidthRequest request) {
        return new SyncInvoker<>(request, GeipMeta.batchCreateInternetBandwidth, hcClient);
    }

    /**
     * 批量添加全域公网带宽标签
     *
     * 批量添加全域公网带宽标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateInternetBandwidthTagsRequest 请求对象
     * @return BatchCreateInternetBandwidthTagsResponse
     */
    public BatchCreateInternetBandwidthTagsResponse batchCreateInternetBandwidthTags(
        BatchCreateInternetBandwidthTagsRequest request) {
        return hcClient.syncInvokeHttp(request, GeipMeta.batchCreateInternetBandwidthTags);
    }

    /**
     * 批量添加全域公网带宽标签
     *
     * 批量添加全域公网带宽标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateInternetBandwidthTagsRequest 请求对象
     * @return SyncInvoker<BatchCreateInternetBandwidthTagsRequest, BatchCreateInternetBandwidthTagsResponse>
     */
    public SyncInvoker<BatchCreateInternetBandwidthTagsRequest, BatchCreateInternetBandwidthTagsResponse> batchCreateInternetBandwidthTagsInvoker(
        BatchCreateInternetBandwidthTagsRequest request) {
        return new SyncInvoker<>(request, GeipMeta.batchCreateInternetBandwidthTags, hcClient);
    }

    /**
     * 批量删除全域公网带宽标签
     *
     * 批量删除全域公网带宽标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteInternetBandwidthTagsRequest 请求对象
     * @return BatchDeleteInternetBandwidthTagsResponse
     */
    public BatchDeleteInternetBandwidthTagsResponse batchDeleteInternetBandwidthTags(
        BatchDeleteInternetBandwidthTagsRequest request) {
        return hcClient.syncInvokeHttp(request, GeipMeta.batchDeleteInternetBandwidthTags);
    }

    /**
     * 批量删除全域公网带宽标签
     *
     * 批量删除全域公网带宽标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteInternetBandwidthTagsRequest 请求对象
     * @return SyncInvoker<BatchDeleteInternetBandwidthTagsRequest, BatchDeleteInternetBandwidthTagsResponse>
     */
    public SyncInvoker<BatchDeleteInternetBandwidthTagsRequest, BatchDeleteInternetBandwidthTagsResponse> batchDeleteInternetBandwidthTagsInvoker(
        BatchDeleteInternetBandwidthTagsRequest request) {
        return new SyncInvoker<>(request, GeipMeta.batchDeleteInternetBandwidthTags, hcClient);
    }

    /**
     * 查询全域公网带宽个数
     *
     * 查询全域公网带宽个数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CountInternetBandwidthRequest 请求对象
     * @return CountInternetBandwidthResponse
     */
    public CountInternetBandwidthResponse countInternetBandwidth(CountInternetBandwidthRequest request) {
        return hcClient.syncInvokeHttp(request, GeipMeta.countInternetBandwidth);
    }

    /**
     * 查询全域公网带宽个数
     *
     * 查询全域公网带宽个数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CountInternetBandwidthRequest 请求对象
     * @return SyncInvoker<CountInternetBandwidthRequest, CountInternetBandwidthResponse>
     */
    public SyncInvoker<CountInternetBandwidthRequest, CountInternetBandwidthResponse> countInternetBandwidthInvoker(
        CountInternetBandwidthRequest request) {
        return new SyncInvoker<>(request, GeipMeta.countInternetBandwidth, hcClient);
    }

    /**
     * 创建全域公网带宽
     *
     * 创建全域公网带宽
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateInternetBandwidthRequest 请求对象
     * @return CreateInternetBandwidthResponse
     */
    public CreateInternetBandwidthResponse createInternetBandwidth(CreateInternetBandwidthRequest request) {
        return hcClient.syncInvokeHttp(request, GeipMeta.createInternetBandwidth);
    }

    /**
     * 创建全域公网带宽
     *
     * 创建全域公网带宽
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateInternetBandwidthRequest 请求对象
     * @return SyncInvoker<CreateInternetBandwidthRequest, CreateInternetBandwidthResponse>
     */
    public SyncInvoker<CreateInternetBandwidthRequest, CreateInternetBandwidthResponse> createInternetBandwidthInvoker(
        CreateInternetBandwidthRequest request) {
        return new SyncInvoker<>(request, GeipMeta.createInternetBandwidth, hcClient);
    }

    /**
     * 创建租户签署免责条款
     *
     * 创建租户签署免责条款
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateUserDisclaimerRequest 请求对象
     * @return CreateUserDisclaimerResponse
     */
    public CreateUserDisclaimerResponse createUserDisclaimer(CreateUserDisclaimerRequest request) {
        return hcClient.syncInvokeHttp(request, GeipMeta.createUserDisclaimer);
    }

    /**
     * 创建租户签署免责条款
     *
     * 创建租户签署免责条款
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateUserDisclaimerRequest 请求对象
     * @return SyncInvoker<CreateUserDisclaimerRequest, CreateUserDisclaimerResponse>
     */
    public SyncInvoker<CreateUserDisclaimerRequest, CreateUserDisclaimerResponse> createUserDisclaimerInvoker(
        CreateUserDisclaimerRequest request) {
        return new SyncInvoker<>(request, GeipMeta.createUserDisclaimer, hcClient);
    }

    /**
     * 删除全域公网带宽
     *
     * 删除全域公网带宽
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteInternetBandwidthRequest 请求对象
     * @return DeleteInternetBandwidthResponse
     */
    public DeleteInternetBandwidthResponse deleteInternetBandwidth(DeleteInternetBandwidthRequest request) {
        return hcClient.syncInvokeHttp(request, GeipMeta.deleteInternetBandwidth);
    }

    /**
     * 删除全域公网带宽
     *
     * 删除全域公网带宽
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteInternetBandwidthRequest 请求对象
     * @return SyncInvoker<DeleteInternetBandwidthRequest, DeleteInternetBandwidthResponse>
     */
    public SyncInvoker<DeleteInternetBandwidthRequest, DeleteInternetBandwidthResponse> deleteInternetBandwidthInvoker(
        DeleteInternetBandwidthRequest request) {
        return new SyncInvoker<>(request, GeipMeta.deleteInternetBandwidth, hcClient);
    }

    /**
     * 删除全域公网带宽标签
     *
     * 删除全域公网带宽标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteInternetBandwidthTagRequest 请求对象
     * @return DeleteInternetBandwidthTagResponse
     */
    public DeleteInternetBandwidthTagResponse deleteInternetBandwidthTag(DeleteInternetBandwidthTagRequest request) {
        return hcClient.syncInvokeHttp(request, GeipMeta.deleteInternetBandwidthTag);
    }

    /**
     * 删除全域公网带宽标签
     *
     * 删除全域公网带宽标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteInternetBandwidthTagRequest 请求对象
     * @return SyncInvoker<DeleteInternetBandwidthTagRequest, DeleteInternetBandwidthTagResponse>
     */
    public SyncInvoker<DeleteInternetBandwidthTagRequest, DeleteInternetBandwidthTagResponse> deleteInternetBandwidthTagInvoker(
        DeleteInternetBandwidthTagRequest request) {
        return new SyncInvoker<>(request, GeipMeta.deleteInternetBandwidthTag, hcClient);
    }

    /**
     * 删除租户撤销免责条款
     *
     * 删除租户撤销免责条款
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteUserDisclaimerRequest 请求对象
     * @return DeleteUserDisclaimerResponse
     */
    public DeleteUserDisclaimerResponse deleteUserDisclaimer(DeleteUserDisclaimerRequest request) {
        return hcClient.syncInvokeHttp(request, GeipMeta.deleteUserDisclaimer);
    }

    /**
     * 删除租户撤销免责条款
     *
     * 删除租户撤销免责条款
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteUserDisclaimerRequest 请求对象
     * @return SyncInvoker<DeleteUserDisclaimerRequest, DeleteUserDisclaimerResponse>
     */
    public SyncInvoker<DeleteUserDisclaimerRequest, DeleteUserDisclaimerResponse> deleteUserDisclaimerInvoker(
        DeleteUserDisclaimerRequest request) {
        return new SyncInvoker<>(request, GeipMeta.deleteUserDisclaimer, hcClient);
    }

    /**
     * 查询接入点列表
     *
     * 查询接入点列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAccessSitesRequest 请求对象
     * @return ListAccessSitesResponse
     */
    public ListAccessSitesResponse listAccessSites(ListAccessSitesRequest request) {
        return hcClient.syncInvokeHttp(request, GeipMeta.listAccessSites);
    }

    /**
     * 查询接入点列表
     *
     * 查询接入点列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAccessSitesRequest 请求对象
     * @return SyncInvoker<ListAccessSitesRequest, ListAccessSitesResponse>
     */
    public SyncInvoker<ListAccessSitesRequest, ListAccessSitesResponse> listAccessSitesInvoker(
        ListAccessSitesRequest request) {
        return new SyncInvoker<>(request, GeipMeta.listAccessSites, hcClient);
    }

    /**
     * 查询租户全域弹性公网IP配额
     *
     * 查询租户全域弹性公网IP配额
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGeipResourceQuotasRequest 请求对象
     * @return ListGeipResourceQuotasResponse
     */
    public ListGeipResourceQuotasResponse listGeipResourceQuotas(ListGeipResourceQuotasRequest request) {
        return hcClient.syncInvokeHttp(request, GeipMeta.listGeipResourceQuotas);
    }

    /**
     * 查询租户全域弹性公网IP配额
     *
     * 查询租户全域弹性公网IP配额
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGeipResourceQuotasRequest 请求对象
     * @return SyncInvoker<ListGeipResourceQuotasRequest, ListGeipResourceQuotasResponse>
     */
    public SyncInvoker<ListGeipResourceQuotasRequest, ListGeipResourceQuotasResponse> listGeipResourceQuotasInvoker(
        ListGeipResourceQuotasRequest request) {
        return new SyncInvoker<>(request, GeipMeta.listGeipResourceQuotas, hcClient);
    }

    /**
     * 查询资源实例列表数目
     *
     * 查询资源实例列表数目
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInternetBandwidthCountFilterTagsRequest 请求对象
     * @return ListInternetBandwidthCountFilterTagsResponse
     */
    public ListInternetBandwidthCountFilterTagsResponse listInternetBandwidthCountFilterTags(
        ListInternetBandwidthCountFilterTagsRequest request) {
        return hcClient.syncInvokeHttp(request, GeipMeta.listInternetBandwidthCountFilterTags);
    }

    /**
     * 查询资源实例列表数目
     *
     * 查询资源实例列表数目
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInternetBandwidthCountFilterTagsRequest 请求对象
     * @return SyncInvoker<ListInternetBandwidthCountFilterTagsRequest, ListInternetBandwidthCountFilterTagsResponse>
     */
    public SyncInvoker<ListInternetBandwidthCountFilterTagsRequest, ListInternetBandwidthCountFilterTagsResponse> listInternetBandwidthCountFilterTagsInvoker(
        ListInternetBandwidthCountFilterTagsRequest request) {
        return new SyncInvoker<>(request, GeipMeta.listInternetBandwidthCountFilterTags, hcClient);
    }

    /**
     * 查询全域公网带宽项目标签
     *
     * 查询全域公网带宽项目标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInternetBandwidthDomainTagsRequest 请求对象
     * @return ListInternetBandwidthDomainTagsResponse
     */
    public ListInternetBandwidthDomainTagsResponse listInternetBandwidthDomainTags(
        ListInternetBandwidthDomainTagsRequest request) {
        return hcClient.syncInvokeHttp(request, GeipMeta.listInternetBandwidthDomainTags);
    }

    /**
     * 查询全域公网带宽项目标签
     *
     * 查询全域公网带宽项目标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInternetBandwidthDomainTagsRequest 请求对象
     * @return SyncInvoker<ListInternetBandwidthDomainTagsRequest, ListInternetBandwidthDomainTagsResponse>
     */
    public SyncInvoker<ListInternetBandwidthDomainTagsRequest, ListInternetBandwidthDomainTagsResponse> listInternetBandwidthDomainTagsInvoker(
        ListInternetBandwidthDomainTagsRequest request) {
        return new SyncInvoker<>(request, GeipMeta.listInternetBandwidthDomainTags, hcClient);
    }

    /**
     * 查询资源实例列表
     *
     * 查询资源实例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInternetBandwidthFilterTagsRequest 请求对象
     * @return ListInternetBandwidthFilterTagsResponse
     */
    public ListInternetBandwidthFilterTagsResponse listInternetBandwidthFilterTags(
        ListInternetBandwidthFilterTagsRequest request) {
        return hcClient.syncInvokeHttp(request, GeipMeta.listInternetBandwidthFilterTags);
    }

    /**
     * 查询资源实例列表
     *
     * 查询资源实例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInternetBandwidthFilterTagsRequest 请求对象
     * @return SyncInvoker<ListInternetBandwidthFilterTagsRequest, ListInternetBandwidthFilterTagsResponse>
     */
    public SyncInvoker<ListInternetBandwidthFilterTagsRequest, ListInternetBandwidthFilterTagsResponse> listInternetBandwidthFilterTagsInvoker(
        ListInternetBandwidthFilterTagsRequest request) {
        return new SyncInvoker<>(request, GeipMeta.listInternetBandwidthFilterTags, hcClient);
    }

    /**
     * 全域公网带宽限制列表
     *
     * 查询全域公网带宽限制列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInternetBandwidthLimitsRequest 请求对象
     * @return ListInternetBandwidthLimitsResponse
     */
    public ListInternetBandwidthLimitsResponse listInternetBandwidthLimits(ListInternetBandwidthLimitsRequest request) {
        return hcClient.syncInvokeHttp(request, GeipMeta.listInternetBandwidthLimits);
    }

    /**
     * 全域公网带宽限制列表
     *
     * 查询全域公网带宽限制列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInternetBandwidthLimitsRequest 请求对象
     * @return SyncInvoker<ListInternetBandwidthLimitsRequest, ListInternetBandwidthLimitsResponse>
     */
    public SyncInvoker<ListInternetBandwidthLimitsRequest, ListInternetBandwidthLimitsResponse> listInternetBandwidthLimitsInvoker(
        ListInternetBandwidthLimitsRequest request) {
        return new SyncInvoker<>(request, GeipMeta.listInternetBandwidthLimits, hcClient);
    }

    /**
     * 查询全域公网带宽列表
     *
     * 查询全域公网带宽列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInternetBandwidthsRequest 请求对象
     * @return ListInternetBandwidthsResponse
     */
    public ListInternetBandwidthsResponse listInternetBandwidths(ListInternetBandwidthsRequest request) {
        return hcClient.syncInvokeHttp(request, GeipMeta.listInternetBandwidths);
    }

    /**
     * 查询全域公网带宽列表
     *
     * 查询全域公网带宽列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInternetBandwidthsRequest 请求对象
     * @return SyncInvoker<ListInternetBandwidthsRequest, ListInternetBandwidthsResponse>
     */
    public SyncInvoker<ListInternetBandwidthsRequest, ListInternetBandwidthsResponse> listInternetBandwidthsInvoker(
        ListInternetBandwidthsRequest request) {
        return new SyncInvoker<>(request, GeipMeta.listInternetBandwidths, hcClient);
    }

    /**
     * 查询全域弹性公网IP段支持的掩码列表
     *
     * 查询全域弹性公网IP段支持的掩码列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSupportMasksRequest 请求对象
     * @return ListSupportMasksResponse
     */
    public ListSupportMasksResponse listSupportMasks(ListSupportMasksRequest request) {
        return hcClient.syncInvokeHttp(request, GeipMeta.listSupportMasks);
    }

    /**
     * 查询全域弹性公网IP段支持的掩码列表
     *
     * 查询全域弹性公网IP段支持的掩码列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSupportMasksRequest 请求对象
     * @return SyncInvoker<ListSupportMasksRequest, ListSupportMasksResponse>
     */
    public SyncInvoker<ListSupportMasksRequest, ListSupportMasksResponse> listSupportMasksInvoker(
        ListSupportMasksRequest request) {
        return new SyncInvoker<>(request, GeipMeta.listSupportMasks, hcClient);
    }

    /**
     * 查询全域公网带宽详情
     *
     * 查询全域公网带宽详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInternetBandwidthRequest 请求对象
     * @return ShowInternetBandwidthResponse
     */
    public ShowInternetBandwidthResponse showInternetBandwidth(ShowInternetBandwidthRequest request) {
        return hcClient.syncInvokeHttp(request, GeipMeta.showInternetBandwidth);
    }

    /**
     * 查询全域公网带宽详情
     *
     * 查询全域公网带宽详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInternetBandwidthRequest 请求对象
     * @return SyncInvoker<ShowInternetBandwidthRequest, ShowInternetBandwidthResponse>
     */
    public SyncInvoker<ShowInternetBandwidthRequest, ShowInternetBandwidthResponse> showInternetBandwidthInvoker(
        ShowInternetBandwidthRequest request) {
        return new SyncInvoker<>(request, GeipMeta.showInternetBandwidth, hcClient);
    }

    /**
     * 查询全域公网带宽标签
     *
     * 查询全域公网带宽标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInternetBandwidthTagsRequest 请求对象
     * @return ShowInternetBandwidthTagsResponse
     */
    public ShowInternetBandwidthTagsResponse showInternetBandwidthTags(ShowInternetBandwidthTagsRequest request) {
        return hcClient.syncInvokeHttp(request, GeipMeta.showInternetBandwidthTags);
    }

    /**
     * 查询全域公网带宽标签
     *
     * 查询全域公网带宽标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInternetBandwidthTagsRequest 请求对象
     * @return SyncInvoker<ShowInternetBandwidthTagsRequest, ShowInternetBandwidthTagsResponse>
     */
    public SyncInvoker<ShowInternetBandwidthTagsRequest, ShowInternetBandwidthTagsResponse> showInternetBandwidthTagsInvoker(
        ShowInternetBandwidthTagsRequest request) {
        return new SyncInvoker<>(request, GeipMeta.showInternetBandwidthTags, hcClient);
    }

    /**
     * 查询租户签署免责条款详情
     *
     * 查询租户签署免责条款详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowUserDisclaimerRequest 请求对象
     * @return ShowUserDisclaimerResponse
     */
    public ShowUserDisclaimerResponse showUserDisclaimer(ShowUserDisclaimerRequest request) {
        return hcClient.syncInvokeHttp(request, GeipMeta.showUserDisclaimer);
    }

    /**
     * 查询租户签署免责条款详情
     *
     * 查询租户签署免责条款详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowUserDisclaimerRequest 请求对象
     * @return SyncInvoker<ShowUserDisclaimerRequest, ShowUserDisclaimerResponse>
     */
    public SyncInvoker<ShowUserDisclaimerRequest, ShowUserDisclaimerResponse> showUserDisclaimerInvoker(
        ShowUserDisclaimerRequest request) {
        return new SyncInvoker<>(request, GeipMeta.showUserDisclaimer, hcClient);
    }

    /**
     * 更新全域公网带宽
     *
     * 更新全域公网带宽
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInternetBandwidthRequest 请求对象
     * @return UpdateInternetBandwidthResponse
     */
    public UpdateInternetBandwidthResponse updateInternetBandwidth(UpdateInternetBandwidthRequest request) {
        return hcClient.syncInvokeHttp(request, GeipMeta.updateInternetBandwidth);
    }

    /**
     * 更新全域公网带宽
     *
     * 更新全域公网带宽
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInternetBandwidthRequest 请求对象
     * @return SyncInvoker<UpdateInternetBandwidthRequest, UpdateInternetBandwidthResponse>
     */
    public SyncInvoker<UpdateInternetBandwidthRequest, UpdateInternetBandwidthResponse> updateInternetBandwidthInvoker(
        UpdateInternetBandwidthRequest request) {
        return new SyncInvoker<>(request, GeipMeta.updateInternetBandwidth, hcClient);
    }

    /**
     * 添加全域弹性公网IP段标签
     *
     * 添加全域弹性公网IP段的标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddGeipSegmentTagsRequest 请求对象
     * @return AddGeipSegmentTagsResponse
     */
    public AddGeipSegmentTagsResponse addGeipSegmentTags(AddGeipSegmentTagsRequest request) {
        return hcClient.syncInvokeHttp(request, GeipMeta.addGeipSegmentTags);
    }

    /**
     * 添加全域弹性公网IP段标签
     *
     * 添加全域弹性公网IP段的标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddGeipSegmentTagsRequest 请求对象
     * @return SyncInvoker<AddGeipSegmentTagsRequest, AddGeipSegmentTagsResponse>
     */
    public SyncInvoker<AddGeipSegmentTagsRequest, AddGeipSegmentTagsResponse> addGeipSegmentTagsInvoker(
        AddGeipSegmentTagsRequest request) {
        return new SyncInvoker<>(request, GeipMeta.addGeipSegmentTags, hcClient);
    }

    /**
     * 添加全域弹性公网IP标签
     *
     * 添加全域弹性公网IP的标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddGlobalEipTagsRequest 请求对象
     * @return AddGlobalEipTagsResponse
     */
    public AddGlobalEipTagsResponse addGlobalEipTags(AddGlobalEipTagsRequest request) {
        return hcClient.syncInvokeHttp(request, GeipMeta.addGlobalEipTags);
    }

    /**
     * 添加全域弹性公网IP标签
     *
     * 添加全域弹性公网IP的标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddGlobalEipTagsRequest 请求对象
     * @return SyncInvoker<AddGlobalEipTagsRequest, AddGlobalEipTagsResponse>
     */
    public SyncInvoker<AddGlobalEipTagsRequest, AddGlobalEipTagsResponse> addGlobalEipTagsInvoker(
        AddGlobalEipTagsRequest request) {
        return new SyncInvoker<>(request, GeipMeta.addGlobalEipTags, hcClient);
    }

    /**
     * 全域弹性公网IP段绑定后端实例
     *
     * 全域弹性公网IP段绑定后端实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AssociateGeipSegmentInstanceRequest 请求对象
     * @return AssociateGeipSegmentInstanceResponse
     */
    public AssociateGeipSegmentInstanceResponse associateGeipSegmentInstance(
        AssociateGeipSegmentInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, GeipMeta.associateGeipSegmentInstance);
    }

    /**
     * 全域弹性公网IP段绑定后端实例
     *
     * 全域弹性公网IP段绑定后端实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AssociateGeipSegmentInstanceRequest 请求对象
     * @return SyncInvoker<AssociateGeipSegmentInstanceRequest, AssociateGeipSegmentInstanceResponse>
     */
    public SyncInvoker<AssociateGeipSegmentInstanceRequest, AssociateGeipSegmentInstanceResponse> associateGeipSegmentInstanceInvoker(
        AssociateGeipSegmentInstanceRequest request) {
        return new SyncInvoker<>(request, GeipMeta.associateGeipSegmentInstance, hcClient);
    }

    /**
     * 绑定后端实例
     *
     * 绑定后端实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AssociateInstanceRequest 请求对象
     * @return AssociateInstanceResponse
     */
    public AssociateInstanceResponse associateInstance(AssociateInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, GeipMeta.associateInstance);
    }

    /**
     * 绑定后端实例
     *
     * 绑定后端实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AssociateInstanceRequest 请求对象
     * @return SyncInvoker<AssociateInstanceRequest, AssociateInstanceResponse>
     */
    public SyncInvoker<AssociateInstanceRequest, AssociateInstanceResponse> associateInstanceInvoker(
        AssociateInstanceRequest request) {
        return new SyncInvoker<>(request, GeipMeta.associateInstance, hcClient);
    }

    /**
     * 绑定全域公网带宽
     *
     * 绑定全域公网带宽
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AttachInternetBandwidthRequest 请求对象
     * @return AttachInternetBandwidthResponse
     */
    public AttachInternetBandwidthResponse attachInternetBandwidth(AttachInternetBandwidthRequest request) {
        return hcClient.syncInvokeHttp(request, GeipMeta.attachInternetBandwidth);
    }

    /**
     * 绑定全域公网带宽
     *
     * 绑定全域公网带宽
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AttachInternetBandwidthRequest 请求对象
     * @return SyncInvoker<AttachInternetBandwidthRequest, AttachInternetBandwidthResponse>
     */
    public SyncInvoker<AttachInternetBandwidthRequest, AttachInternetBandwidthResponse> attachInternetBandwidthInvoker(
        AttachInternetBandwidthRequest request) {
        return new SyncInvoker<>(request, GeipMeta.attachInternetBandwidth, hcClient);
    }

    /**
     * 全域弹性公网IP段批量绑定全域公网带宽
     *
     * 全域弹性公网IP段批量绑定全域公网带宽
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchAttachGeipSegmentInternetBandwidthRequest 请求对象
     * @return BatchAttachGeipSegmentInternetBandwidthResponse
     */
    public BatchAttachGeipSegmentInternetBandwidthResponse batchAttachGeipSegmentInternetBandwidth(
        BatchAttachGeipSegmentInternetBandwidthRequest request) {
        return hcClient.syncInvokeHttp(request, GeipMeta.batchAttachGeipSegmentInternetBandwidth);
    }

    /**
     * 全域弹性公网IP段批量绑定全域公网带宽
     *
     * 全域弹性公网IP段批量绑定全域公网带宽
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchAttachGeipSegmentInternetBandwidthRequest 请求对象
     * @return SyncInvoker<BatchAttachGeipSegmentInternetBandwidthRequest, BatchAttachGeipSegmentInternetBandwidthResponse>
     */
    public SyncInvoker<BatchAttachGeipSegmentInternetBandwidthRequest, BatchAttachGeipSegmentInternetBandwidthResponse> batchAttachGeipSegmentInternetBandwidthInvoker(
        BatchAttachGeipSegmentInternetBandwidthRequest request) {
        return new SyncInvoker<>(request, GeipMeta.batchAttachGeipSegmentInternetBandwidth, hcClient);
    }

    /**
     * 批量绑定全域公网带宽
     *
     * 批量绑定全域公网带宽
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchAttachInternetBandwidthRequest 请求对象
     * @return BatchAttachInternetBandwidthResponse
     */
    public BatchAttachInternetBandwidthResponse batchAttachInternetBandwidth(
        BatchAttachInternetBandwidthRequest request) {
        return hcClient.syncInvokeHttp(request, GeipMeta.batchAttachInternetBandwidth);
    }

    /**
     * 批量绑定全域公网带宽
     *
     * 批量绑定全域公网带宽
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchAttachInternetBandwidthRequest 请求对象
     * @return SyncInvoker<BatchAttachInternetBandwidthRequest, BatchAttachInternetBandwidthResponse>
     */
    public SyncInvoker<BatchAttachInternetBandwidthRequest, BatchAttachInternetBandwidthResponse> batchAttachInternetBandwidthInvoker(
        BatchAttachInternetBandwidthRequest request) {
        return new SyncInvoker<>(request, GeipMeta.batchAttachInternetBandwidth, hcClient);
    }

    /**
     * 批量添加全域弹性公网IP段标签
     *
     * 批量添加全域弹性公网IP段的标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateGeipSegmentTagsRequest 请求对象
     * @return BatchCreateGeipSegmentTagsResponse
     */
    public BatchCreateGeipSegmentTagsResponse batchCreateGeipSegmentTags(BatchCreateGeipSegmentTagsRequest request) {
        return hcClient.syncInvokeHttp(request, GeipMeta.batchCreateGeipSegmentTags);
    }

    /**
     * 批量添加全域弹性公网IP段标签
     *
     * 批量添加全域弹性公网IP段的标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateGeipSegmentTagsRequest 请求对象
     * @return SyncInvoker<BatchCreateGeipSegmentTagsRequest, BatchCreateGeipSegmentTagsResponse>
     */
    public SyncInvoker<BatchCreateGeipSegmentTagsRequest, BatchCreateGeipSegmentTagsResponse> batchCreateGeipSegmentTagsInvoker(
        BatchCreateGeipSegmentTagsRequest request) {
        return new SyncInvoker<>(request, GeipMeta.batchCreateGeipSegmentTags, hcClient);
    }

    /**
     * 批量创建全域弹性公网IP
     *
     * 批量创建全域弹性公网IP
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateGlobalEipRequest 请求对象
     * @return BatchCreateGlobalEipResponse
     */
    public BatchCreateGlobalEipResponse batchCreateGlobalEip(BatchCreateGlobalEipRequest request) {
        return hcClient.syncInvokeHttp(request, GeipMeta.batchCreateGlobalEip);
    }

    /**
     * 批量创建全域弹性公网IP
     *
     * 批量创建全域弹性公网IP
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateGlobalEipRequest 请求对象
     * @return SyncInvoker<BatchCreateGlobalEipRequest, BatchCreateGlobalEipResponse>
     */
    public SyncInvoker<BatchCreateGlobalEipRequest, BatchCreateGlobalEipResponse> batchCreateGlobalEipInvoker(
        BatchCreateGlobalEipRequest request) {
        return new SyncInvoker<>(request, GeipMeta.batchCreateGlobalEip, hcClient);
    }

    /**
     * 批量添加全域弹性公网IP标签
     *
     * 批量添加全域弹性公网IP的标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateGlobalEipTagsRequest 请求对象
     * @return BatchCreateGlobalEipTagsResponse
     */
    public BatchCreateGlobalEipTagsResponse batchCreateGlobalEipTags(BatchCreateGlobalEipTagsRequest request) {
        return hcClient.syncInvokeHttp(request, GeipMeta.batchCreateGlobalEipTags);
    }

    /**
     * 批量添加全域弹性公网IP标签
     *
     * 批量添加全域弹性公网IP的标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateGlobalEipTagsRequest 请求对象
     * @return SyncInvoker<BatchCreateGlobalEipTagsRequest, BatchCreateGlobalEipTagsResponse>
     */
    public SyncInvoker<BatchCreateGlobalEipTagsRequest, BatchCreateGlobalEipTagsResponse> batchCreateGlobalEipTagsInvoker(
        BatchCreateGlobalEipTagsRequest request) {
        return new SyncInvoker<>(request, GeipMeta.batchCreateGlobalEipTags, hcClient);
    }

    /**
     * 批量删除全域弹性公网IP段标签
     *
     * 批量删除全域弹性公网IP段的标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteGeipSegmentTagsRequest 请求对象
     * @return BatchDeleteGeipSegmentTagsResponse
     */
    public BatchDeleteGeipSegmentTagsResponse batchDeleteGeipSegmentTags(BatchDeleteGeipSegmentTagsRequest request) {
        return hcClient.syncInvokeHttp(request, GeipMeta.batchDeleteGeipSegmentTags);
    }

    /**
     * 批量删除全域弹性公网IP段标签
     *
     * 批量删除全域弹性公网IP段的标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteGeipSegmentTagsRequest 请求对象
     * @return SyncInvoker<BatchDeleteGeipSegmentTagsRequest, BatchDeleteGeipSegmentTagsResponse>
     */
    public SyncInvoker<BatchDeleteGeipSegmentTagsRequest, BatchDeleteGeipSegmentTagsResponse> batchDeleteGeipSegmentTagsInvoker(
        BatchDeleteGeipSegmentTagsRequest request) {
        return new SyncInvoker<>(request, GeipMeta.batchDeleteGeipSegmentTags, hcClient);
    }

    /**
     * 批量删除全域弹性公网IP标签
     *
     * 批量删除全域弹性公网IP的标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteGlobalEipTagsRequest 请求对象
     * @return BatchDeleteGlobalEipTagsResponse
     */
    public BatchDeleteGlobalEipTagsResponse batchDeleteGlobalEipTags(BatchDeleteGlobalEipTagsRequest request) {
        return hcClient.syncInvokeHttp(request, GeipMeta.batchDeleteGlobalEipTags);
    }

    /**
     * 批量删除全域弹性公网IP标签
     *
     * 批量删除全域弹性公网IP的标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteGlobalEipTagsRequest 请求对象
     * @return SyncInvoker<BatchDeleteGlobalEipTagsRequest, BatchDeleteGlobalEipTagsResponse>
     */
    public SyncInvoker<BatchDeleteGlobalEipTagsRequest, BatchDeleteGlobalEipTagsResponse> batchDeleteGlobalEipTagsInvoker(
        BatchDeleteGlobalEipTagsRequest request) {
        return new SyncInvoker<>(request, GeipMeta.batchDeleteGlobalEipTags, hcClient);
    }

    /**
     * 全域弹性公网IP段批量解绑全域公网带宽
     *
     * 全域弹性公网IP段批量解绑全域公网带宽
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDetachGeipSegmentInternetBandwidthRequest 请求对象
     * @return BatchDetachGeipSegmentInternetBandwidthResponse
     */
    public BatchDetachGeipSegmentInternetBandwidthResponse batchDetachGeipSegmentInternetBandwidth(
        BatchDetachGeipSegmentInternetBandwidthRequest request) {
        return hcClient.syncInvokeHttp(request, GeipMeta.batchDetachGeipSegmentInternetBandwidth);
    }

    /**
     * 全域弹性公网IP段批量解绑全域公网带宽
     *
     * 全域弹性公网IP段批量解绑全域公网带宽
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDetachGeipSegmentInternetBandwidthRequest 请求对象
     * @return SyncInvoker<BatchDetachGeipSegmentInternetBandwidthRequest, BatchDetachGeipSegmentInternetBandwidthResponse>
     */
    public SyncInvoker<BatchDetachGeipSegmentInternetBandwidthRequest, BatchDetachGeipSegmentInternetBandwidthResponse> batchDetachGeipSegmentInternetBandwidthInvoker(
        BatchDetachGeipSegmentInternetBandwidthRequest request) {
        return new SyncInvoker<>(request, GeipMeta.batchDetachGeipSegmentInternetBandwidth, hcClient);
    }

    /**
     * 批量解绑全域公网带宽
     *
     * 批量解绑全域公网带宽
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDetachInternetBandwidthRequest 请求对象
     * @return BatchDetachInternetBandwidthResponse
     */
    public BatchDetachInternetBandwidthResponse batchDetachInternetBandwidth(
        BatchDetachInternetBandwidthRequest request) {
        return hcClient.syncInvokeHttp(request, GeipMeta.batchDetachInternetBandwidth);
    }

    /**
     * 批量解绑全域公网带宽
     *
     * 批量解绑全域公网带宽
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDetachInternetBandwidthRequest 请求对象
     * @return SyncInvoker<BatchDetachInternetBandwidthRequest, BatchDetachInternetBandwidthResponse>
     */
    public SyncInvoker<BatchDetachInternetBandwidthRequest, BatchDetachInternetBandwidthResponse> batchDetachInternetBandwidthInvoker(
        BatchDetachInternetBandwidthRequest request) {
        return new SyncInvoker<>(request, GeipMeta.batchDetachInternetBandwidth, hcClient);
    }

    /**
     * 查询全域弹性公网IP段个数
     *
     * 查询全域弹性公网IP段个数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CountGlobalEipSegmentRequest 请求对象
     * @return CountGlobalEipSegmentResponse
     */
    public CountGlobalEipSegmentResponse countGlobalEipSegment(CountGlobalEipSegmentRequest request) {
        return hcClient.syncInvokeHttp(request, GeipMeta.countGlobalEipSegment);
    }

    /**
     * 查询全域弹性公网IP段个数
     *
     * 查询全域弹性公网IP段个数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CountGlobalEipSegmentRequest 请求对象
     * @return SyncInvoker<CountGlobalEipSegmentRequest, CountGlobalEipSegmentResponse>
     */
    public SyncInvoker<CountGlobalEipSegmentRequest, CountGlobalEipSegmentResponse> countGlobalEipSegmentInvoker(
        CountGlobalEipSegmentRequest request) {
        return new SyncInvoker<>(request, GeipMeta.countGlobalEipSegment, hcClient);
    }

    /**
     * 查询全域弹性公网IP个数
     *
     * 查询全域弹性公网IP个数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CountGlobalEipsRequest 请求对象
     * @return CountGlobalEipsResponse
     */
    public CountGlobalEipsResponse countGlobalEips(CountGlobalEipsRequest request) {
        return hcClient.syncInvokeHttp(request, GeipMeta.countGlobalEips);
    }

    /**
     * 查询全域弹性公网IP个数
     *
     * 查询全域弹性公网IP个数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CountGlobalEipsRequest 请求对象
     * @return SyncInvoker<CountGlobalEipsRequest, CountGlobalEipsResponse>
     */
    public SyncInvoker<CountGlobalEipsRequest, CountGlobalEipsResponse> countGlobalEipsInvoker(
        CountGlobalEipsRequest request) {
        return new SyncInvoker<>(request, GeipMeta.countGlobalEips, hcClient);
    }

    /**
     * 创建全域弹性公网IP
     *
     * 创建全域弹性公网IP
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateGlobalEipRequest 请求对象
     * @return CreateGlobalEipResponse
     */
    public CreateGlobalEipResponse createGlobalEip(CreateGlobalEipRequest request) {
        return hcClient.syncInvokeHttp(request, GeipMeta.createGlobalEip);
    }

    /**
     * 创建全域弹性公网IP
     *
     * 创建全域弹性公网IP
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateGlobalEipRequest 请求对象
     * @return SyncInvoker<CreateGlobalEipRequest, CreateGlobalEipResponse>
     */
    public SyncInvoker<CreateGlobalEipRequest, CreateGlobalEipResponse> createGlobalEipInvoker(
        CreateGlobalEipRequest request) {
        return new SyncInvoker<>(request, GeipMeta.createGlobalEip, hcClient);
    }

    /**
     * 创建全域弹性公网IP段
     *
     * 创建全域弹性公网IP段
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateGlobalEipSegmentRequest 请求对象
     * @return CreateGlobalEipSegmentResponse
     */
    public CreateGlobalEipSegmentResponse createGlobalEipSegment(CreateGlobalEipSegmentRequest request) {
        return hcClient.syncInvokeHttp(request, GeipMeta.createGlobalEipSegment);
    }

    /**
     * 创建全域弹性公网IP段
     *
     * 创建全域弹性公网IP段
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateGlobalEipSegmentRequest 请求对象
     * @return SyncInvoker<CreateGlobalEipSegmentRequest, CreateGlobalEipSegmentResponse>
     */
    public SyncInvoker<CreateGlobalEipSegmentRequest, CreateGlobalEipSegmentResponse> createGlobalEipSegmentInvoker(
        CreateGlobalEipSegmentRequest request) {
        return new SyncInvoker<>(request, GeipMeta.createGlobalEipSegment, hcClient);
    }

    /**
     * 删除全域弹性公网IP段标签
     *
     * 删除全域弹性公网IP段的标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteGeipSegmentTagRequest 请求对象
     * @return DeleteGeipSegmentTagResponse
     */
    public DeleteGeipSegmentTagResponse deleteGeipSegmentTag(DeleteGeipSegmentTagRequest request) {
        return hcClient.syncInvokeHttp(request, GeipMeta.deleteGeipSegmentTag);
    }

    /**
     * 删除全域弹性公网IP段标签
     *
     * 删除全域弹性公网IP段的标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteGeipSegmentTagRequest 请求对象
     * @return SyncInvoker<DeleteGeipSegmentTagRequest, DeleteGeipSegmentTagResponse>
     */
    public SyncInvoker<DeleteGeipSegmentTagRequest, DeleteGeipSegmentTagResponse> deleteGeipSegmentTagInvoker(
        DeleteGeipSegmentTagRequest request) {
        return new SyncInvoker<>(request, GeipMeta.deleteGeipSegmentTag, hcClient);
    }

    /**
     * 删除全域弹性公网IP
     *
     * 删除全域弹性公网IP
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteGlobalEipRequest 请求对象
     * @return DeleteGlobalEipResponse
     */
    public DeleteGlobalEipResponse deleteGlobalEip(DeleteGlobalEipRequest request) {
        return hcClient.syncInvokeHttp(request, GeipMeta.deleteGlobalEip);
    }

    /**
     * 删除全域弹性公网IP
     *
     * 删除全域弹性公网IP
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteGlobalEipRequest 请求对象
     * @return SyncInvoker<DeleteGlobalEipRequest, DeleteGlobalEipResponse>
     */
    public SyncInvoker<DeleteGlobalEipRequest, DeleteGlobalEipResponse> deleteGlobalEipInvoker(
        DeleteGlobalEipRequest request) {
        return new SyncInvoker<>(request, GeipMeta.deleteGlobalEip, hcClient);
    }

    /**
     * 删除全域弹性公网IP段
     *
     * 删除全域弹性公网IP段
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteGlobalEipSegmentRequest 请求对象
     * @return DeleteGlobalEipSegmentResponse
     */
    public DeleteGlobalEipSegmentResponse deleteGlobalEipSegment(DeleteGlobalEipSegmentRequest request) {
        return hcClient.syncInvokeHttp(request, GeipMeta.deleteGlobalEipSegment);
    }

    /**
     * 删除全域弹性公网IP段
     *
     * 删除全域弹性公网IP段
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteGlobalEipSegmentRequest 请求对象
     * @return SyncInvoker<DeleteGlobalEipSegmentRequest, DeleteGlobalEipSegmentResponse>
     */
    public SyncInvoker<DeleteGlobalEipSegmentRequest, DeleteGlobalEipSegmentResponse> deleteGlobalEipSegmentInvoker(
        DeleteGlobalEipSegmentRequest request) {
        return new SyncInvoker<>(request, GeipMeta.deleteGlobalEipSegment, hcClient);
    }

    /**
     * 删除全域弹性公网IP标签
     *
     * 删除全域弹性公网IP的标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteGlobalEipTagRequest 请求对象
     * @return DeleteGlobalEipTagResponse
     */
    public DeleteGlobalEipTagResponse deleteGlobalEipTag(DeleteGlobalEipTagRequest request) {
        return hcClient.syncInvokeHttp(request, GeipMeta.deleteGlobalEipTag);
    }

    /**
     * 删除全域弹性公网IP标签
     *
     * 删除全域弹性公网IP的标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteGlobalEipTagRequest 请求对象
     * @return SyncInvoker<DeleteGlobalEipTagRequest, DeleteGlobalEipTagResponse>
     */
    public SyncInvoker<DeleteGlobalEipTagRequest, DeleteGlobalEipTagResponse> deleteGlobalEipTagInvoker(
        DeleteGlobalEipTagRequest request) {
        return new SyncInvoker<>(request, GeipMeta.deleteGlobalEipTag, hcClient);
    }

    /**
     * 解绑全域公网带宽
     *
     * 解绑全域公网带宽
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DetachInternetBandwidthRequest 请求对象
     * @return DetachInternetBandwidthResponse
     */
    public DetachInternetBandwidthResponse detachInternetBandwidth(DetachInternetBandwidthRequest request) {
        return hcClient.syncInvokeHttp(request, GeipMeta.detachInternetBandwidth);
    }

    /**
     * 解绑全域公网带宽
     *
     * 解绑全域公网带宽
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DetachInternetBandwidthRequest 请求对象
     * @return SyncInvoker<DetachInternetBandwidthRequest, DetachInternetBandwidthResponse>
     */
    public SyncInvoker<DetachInternetBandwidthRequest, DetachInternetBandwidthResponse> detachInternetBandwidthInvoker(
        DetachInternetBandwidthRequest request) {
        return new SyncInvoker<>(request, GeipMeta.detachInternetBandwidth, hcClient);
    }

    /**
     * 全域弹性公网IP段解绑后端实例
     *
     * 全域弹性公网IP段解绑后端实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisassociateGeipSegmentInstanceRequest 请求对象
     * @return DisassociateGeipSegmentInstanceResponse
     */
    public DisassociateGeipSegmentInstanceResponse disassociateGeipSegmentInstance(
        DisassociateGeipSegmentInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, GeipMeta.disassociateGeipSegmentInstance);
    }

    /**
     * 全域弹性公网IP段解绑后端实例
     *
     * 全域弹性公网IP段解绑后端实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisassociateGeipSegmentInstanceRequest 请求对象
     * @return SyncInvoker<DisassociateGeipSegmentInstanceRequest, DisassociateGeipSegmentInstanceResponse>
     */
    public SyncInvoker<DisassociateGeipSegmentInstanceRequest, DisassociateGeipSegmentInstanceResponse> disassociateGeipSegmentInstanceInvoker(
        DisassociateGeipSegmentInstanceRequest request) {
        return new SyncInvoker<>(request, GeipMeta.disassociateGeipSegmentInstance, hcClient);
    }

    /**
     * 解绑后端实例
     *
     * 解绑后端实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisassociateInstanceRequest 请求对象
     * @return DisassociateInstanceResponse
     */
    public DisassociateInstanceResponse disassociateInstance(DisassociateInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, GeipMeta.disassociateInstance);
    }

    /**
     * 解绑后端实例
     *
     * 解绑后端实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisassociateInstanceRequest 请求对象
     * @return SyncInvoker<DisassociateInstanceRequest, DisassociateInstanceResponse>
     */
    public SyncInvoker<DisassociateInstanceRequest, DisassociateInstanceResponse> disassociateInstanceInvoker(
        DisassociateInstanceRequest request) {
        return new SyncInvoker<>(request, GeipMeta.disassociateInstance, hcClient);
    }

    /**
     * 查询全域弹性公网IP池列表
     *
     * 查询全域弹性公网IP池列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGeipPoolsRequest 请求对象
     * @return ListGeipPoolsResponse
     */
    public ListGeipPoolsResponse listGeipPools(ListGeipPoolsRequest request) {
        return hcClient.syncInvokeHttp(request, GeipMeta.listGeipPools);
    }

    /**
     * 查询全域弹性公网IP池列表
     *
     * 查询全域弹性公网IP池列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGeipPoolsRequest 请求对象
     * @return SyncInvoker<ListGeipPoolsRequest, ListGeipPoolsResponse>
     */
    public SyncInvoker<ListGeipPoolsRequest, ListGeipPoolsResponse> listGeipPoolsInvoker(ListGeipPoolsRequest request) {
        return new SyncInvoker<>(request, GeipMeta.listGeipPools, hcClient);
    }

    /**
     * 查询资源实例列表数目
     *
     * 查询资源实例列表的数目
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGeipSegmentCountFilterTagsRequest 请求对象
     * @return ListGeipSegmentCountFilterTagsResponse
     */
    public ListGeipSegmentCountFilterTagsResponse listGeipSegmentCountFilterTags(
        ListGeipSegmentCountFilterTagsRequest request) {
        return hcClient.syncInvokeHttp(request, GeipMeta.listGeipSegmentCountFilterTags);
    }

    /**
     * 查询资源实例列表数目
     *
     * 查询资源实例列表的数目
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGeipSegmentCountFilterTagsRequest 请求对象
     * @return SyncInvoker<ListGeipSegmentCountFilterTagsRequest, ListGeipSegmentCountFilterTagsResponse>
     */
    public SyncInvoker<ListGeipSegmentCountFilterTagsRequest, ListGeipSegmentCountFilterTagsResponse> listGeipSegmentCountFilterTagsInvoker(
        ListGeipSegmentCountFilterTagsRequest request) {
        return new SyncInvoker<>(request, GeipMeta.listGeipSegmentCountFilterTags, hcClient);
    }

    /**
     * 查询全域弹性公网IP段项目标签
     *
     * 查询全域弹性公网IP段的项目标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGeipSegmentDomainTagsRequest 请求对象
     * @return ListGeipSegmentDomainTagsResponse
     */
    public ListGeipSegmentDomainTagsResponse listGeipSegmentDomainTags(ListGeipSegmentDomainTagsRequest request) {
        return hcClient.syncInvokeHttp(request, GeipMeta.listGeipSegmentDomainTags);
    }

    /**
     * 查询全域弹性公网IP段项目标签
     *
     * 查询全域弹性公网IP段的项目标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGeipSegmentDomainTagsRequest 请求对象
     * @return SyncInvoker<ListGeipSegmentDomainTagsRequest, ListGeipSegmentDomainTagsResponse>
     */
    public SyncInvoker<ListGeipSegmentDomainTagsRequest, ListGeipSegmentDomainTagsResponse> listGeipSegmentDomainTagsInvoker(
        ListGeipSegmentDomainTagsRequest request) {
        return new SyncInvoker<>(request, GeipMeta.listGeipSegmentDomainTags, hcClient);
    }

    /**
     * 查询资源实例列表
     *
     * 查询资源实例的列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGeipSegmentFilterTagsRequest 请求对象
     * @return ListGeipSegmentFilterTagsResponse
     */
    public ListGeipSegmentFilterTagsResponse listGeipSegmentFilterTags(ListGeipSegmentFilterTagsRequest request) {
        return hcClient.syncInvokeHttp(request, GeipMeta.listGeipSegmentFilterTags);
    }

    /**
     * 查询资源实例列表
     *
     * 查询资源实例的列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGeipSegmentFilterTagsRequest 请求对象
     * @return SyncInvoker<ListGeipSegmentFilterTagsRequest, ListGeipSegmentFilterTagsResponse>
     */
    public SyncInvoker<ListGeipSegmentFilterTagsRequest, ListGeipSegmentFilterTagsResponse> listGeipSegmentFilterTagsInvoker(
        ListGeipSegmentFilterTagsRequest request) {
        return new SyncInvoker<>(request, GeipMeta.listGeipSegmentFilterTags, hcClient);
    }

    /**
     * 查询资源实例列表数目
     *
     * 查询资源实例列表数目
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGlobalEipCountFilterTagsRequest 请求对象
     * @return ListGlobalEipCountFilterTagsResponse
     */
    public ListGlobalEipCountFilterTagsResponse listGlobalEipCountFilterTags(
        ListGlobalEipCountFilterTagsRequest request) {
        return hcClient.syncInvokeHttp(request, GeipMeta.listGlobalEipCountFilterTags);
    }

    /**
     * 查询资源实例列表数目
     *
     * 查询资源实例列表数目
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGlobalEipCountFilterTagsRequest 请求对象
     * @return SyncInvoker<ListGlobalEipCountFilterTagsRequest, ListGlobalEipCountFilterTagsResponse>
     */
    public SyncInvoker<ListGlobalEipCountFilterTagsRequest, ListGlobalEipCountFilterTagsResponse> listGlobalEipCountFilterTagsInvoker(
        ListGlobalEipCountFilterTagsRequest request) {
        return new SyncInvoker<>(request, GeipMeta.listGlobalEipCountFilterTags, hcClient);
    }

    /**
     * 查询全域弹性公网IP项目标签
     *
     * 查询全域弹性公网IP的项目标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGlobalEipDomainTagsRequest 请求对象
     * @return ListGlobalEipDomainTagsResponse
     */
    public ListGlobalEipDomainTagsResponse listGlobalEipDomainTags(ListGlobalEipDomainTagsRequest request) {
        return hcClient.syncInvokeHttp(request, GeipMeta.listGlobalEipDomainTags);
    }

    /**
     * 查询全域弹性公网IP项目标签
     *
     * 查询全域弹性公网IP的项目标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGlobalEipDomainTagsRequest 请求对象
     * @return SyncInvoker<ListGlobalEipDomainTagsRequest, ListGlobalEipDomainTagsResponse>
     */
    public SyncInvoker<ListGlobalEipDomainTagsRequest, ListGlobalEipDomainTagsResponse> listGlobalEipDomainTagsInvoker(
        ListGlobalEipDomainTagsRequest request) {
        return new SyncInvoker<>(request, GeipMeta.listGlobalEipDomainTags, hcClient);
    }

    /**
     * 查询资源实例列表
     *
     * 查询资源实例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGlobalEipFilterTagsRequest 请求对象
     * @return ListGlobalEipFilterTagsResponse
     */
    public ListGlobalEipFilterTagsResponse listGlobalEipFilterTags(ListGlobalEipFilterTagsRequest request) {
        return hcClient.syncInvokeHttp(request, GeipMeta.listGlobalEipFilterTags);
    }

    /**
     * 查询资源实例列表
     *
     * 查询资源实例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGlobalEipFilterTagsRequest 请求对象
     * @return SyncInvoker<ListGlobalEipFilterTagsRequest, ListGlobalEipFilterTagsResponse>
     */
    public SyncInvoker<ListGlobalEipFilterTagsRequest, ListGlobalEipFilterTagsResponse> listGlobalEipFilterTagsInvoker(
        ListGlobalEipFilterTagsRequest request) {
        return new SyncInvoker<>(request, GeipMeta.listGlobalEipFilterTags, hcClient);
    }

    /**
     * 查询全域弹性公网IP段列表
     *
     * 查询全域弹性公网IP段列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGlobalEipSegmentsRequest 请求对象
     * @return ListGlobalEipSegmentsResponse
     */
    public ListGlobalEipSegmentsResponse listGlobalEipSegments(ListGlobalEipSegmentsRequest request) {
        return hcClient.syncInvokeHttp(request, GeipMeta.listGlobalEipSegments);
    }

    /**
     * 查询全域弹性公网IP段列表
     *
     * 查询全域弹性公网IP段列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGlobalEipSegmentsRequest 请求对象
     * @return SyncInvoker<ListGlobalEipSegmentsRequest, ListGlobalEipSegmentsResponse>
     */
    public SyncInvoker<ListGlobalEipSegmentsRequest, ListGlobalEipSegmentsResponse> listGlobalEipSegmentsInvoker(
        ListGlobalEipSegmentsRequest request) {
        return new SyncInvoker<>(request, GeipMeta.listGlobalEipSegments, hcClient);
    }

    /**
     * 查询全域弹性公网IP列表
     *
     * 查询全域弹性公网IP列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGlobalEipsRequest 请求对象
     * @return ListGlobalEipsResponse
     */
    public ListGlobalEipsResponse listGlobalEips(ListGlobalEipsRequest request) {
        return hcClient.syncInvokeHttp(request, GeipMeta.listGlobalEips);
    }

    /**
     * 查询全域弹性公网IP列表
     *
     * 查询全域弹性公网IP列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGlobalEipsRequest 请求对象
     * @return SyncInvoker<ListGlobalEipsRequest, ListGlobalEipsResponse>
     */
    public SyncInvoker<ListGlobalEipsRequest, ListGlobalEipsResponse> listGlobalEipsInvoker(
        ListGlobalEipsRequest request) {
        return new SyncInvoker<>(request, GeipMeta.listGlobalEips, hcClient);
    }

    /**
     * 查询全域弹性公网IP段标签
     *
     * 查询全域弹性公网IP段的标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGeipSegmentTagsRequest 请求对象
     * @return ShowGeipSegmentTagsResponse
     */
    public ShowGeipSegmentTagsResponse showGeipSegmentTags(ShowGeipSegmentTagsRequest request) {
        return hcClient.syncInvokeHttp(request, GeipMeta.showGeipSegmentTags);
    }

    /**
     * 查询全域弹性公网IP段标签
     *
     * 查询全域弹性公网IP段的标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGeipSegmentTagsRequest 请求对象
     * @return SyncInvoker<ShowGeipSegmentTagsRequest, ShowGeipSegmentTagsResponse>
     */
    public SyncInvoker<ShowGeipSegmentTagsRequest, ShowGeipSegmentTagsResponse> showGeipSegmentTagsInvoker(
        ShowGeipSegmentTagsRequest request) {
        return new SyncInvoker<>(request, GeipMeta.showGeipSegmentTags, hcClient);
    }

    /**
     * 查询全域弹性公网IP详情
     *
     * 查询全域弹性公网IP详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGlobalEipRequest 请求对象
     * @return ShowGlobalEipResponse
     */
    public ShowGlobalEipResponse showGlobalEip(ShowGlobalEipRequest request) {
        return hcClient.syncInvokeHttp(request, GeipMeta.showGlobalEip);
    }

    /**
     * 查询全域弹性公网IP详情
     *
     * 查询全域弹性公网IP详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGlobalEipRequest 请求对象
     * @return SyncInvoker<ShowGlobalEipRequest, ShowGlobalEipResponse>
     */
    public SyncInvoker<ShowGlobalEipRequest, ShowGlobalEipResponse> showGlobalEipInvoker(ShowGlobalEipRequest request) {
        return new SyncInvoker<>(request, GeipMeta.showGlobalEip, hcClient);
    }

    /**
     * 查询全域弹性公网IP段详情
     *
     * 查询全域弹性公网IP段详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGlobalEipSegmentRequest 请求对象
     * @return ShowGlobalEipSegmentResponse
     */
    public ShowGlobalEipSegmentResponse showGlobalEipSegment(ShowGlobalEipSegmentRequest request) {
        return hcClient.syncInvokeHttp(request, GeipMeta.showGlobalEipSegment);
    }

    /**
     * 查询全域弹性公网IP段详情
     *
     * 查询全域弹性公网IP段详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGlobalEipSegmentRequest 请求对象
     * @return SyncInvoker<ShowGlobalEipSegmentRequest, ShowGlobalEipSegmentResponse>
     */
    public SyncInvoker<ShowGlobalEipSegmentRequest, ShowGlobalEipSegmentResponse> showGlobalEipSegmentInvoker(
        ShowGlobalEipSegmentRequest request) {
        return new SyncInvoker<>(request, GeipMeta.showGlobalEipSegment, hcClient);
    }

    /**
     * 查询全域弹性公网IP标签
     *
     * 查询全域弹性公网IP的标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGlobalEipTagsRequest 请求对象
     * @return ShowGlobalEipTagsResponse
     */
    public ShowGlobalEipTagsResponse showGlobalEipTags(ShowGlobalEipTagsRequest request) {
        return hcClient.syncInvokeHttp(request, GeipMeta.showGlobalEipTags);
    }

    /**
     * 查询全域弹性公网IP标签
     *
     * 查询全域弹性公网IP的标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGlobalEipTagsRequest 请求对象
     * @return SyncInvoker<ShowGlobalEipTagsRequest, ShowGlobalEipTagsResponse>
     */
    public SyncInvoker<ShowGlobalEipTagsRequest, ShowGlobalEipTagsResponse> showGlobalEipTagsInvoker(
        ShowGlobalEipTagsRequest request) {
        return new SyncInvoker<>(request, GeipMeta.showGlobalEipTags, hcClient);
    }

    /**
     * 更新全域弹性公网IP信息
     *
     * 更新全域弹性公网IP信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateGlobalEipRequest 请求对象
     * @return UpdateGlobalEipResponse
     */
    public UpdateGlobalEipResponse updateGlobalEip(UpdateGlobalEipRequest request) {
        return hcClient.syncInvokeHttp(request, GeipMeta.updateGlobalEip);
    }

    /**
     * 更新全域弹性公网IP信息
     *
     * 更新全域弹性公网IP信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateGlobalEipRequest 请求对象
     * @return SyncInvoker<UpdateGlobalEipRequest, UpdateGlobalEipResponse>
     */
    public SyncInvoker<UpdateGlobalEipRequest, UpdateGlobalEipResponse> updateGlobalEipInvoker(
        UpdateGlobalEipRequest request) {
        return new SyncInvoker<>(request, GeipMeta.updateGlobalEip, hcClient);
    }

    /**
     * 更新全域弹性公网IP段
     *
     * 更新全域弹性公网IP段
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateGlobalEipSegmentRequest 请求对象
     * @return UpdateGlobalEipSegmentResponse
     */
    public UpdateGlobalEipSegmentResponse updateGlobalEipSegment(UpdateGlobalEipSegmentRequest request) {
        return hcClient.syncInvokeHttp(request, GeipMeta.updateGlobalEipSegment);
    }

    /**
     * 更新全域弹性公网IP段
     *
     * 更新全域弹性公网IP段
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateGlobalEipSegmentRequest 请求对象
     * @return SyncInvoker<UpdateGlobalEipSegmentRequest, UpdateGlobalEipSegmentResponse>
     */
    public SyncInvoker<UpdateGlobalEipSegmentRequest, UpdateGlobalEipSegmentResponse> updateGlobalEipSegmentInvoker(
        UpdateGlobalEipSegmentRequest request) {
        return new SyncInvoker<>(request, GeipMeta.updateGlobalEipSegment, hcClient);
    }

    /**
     * 查询Job列表
     *
     * 查询Job列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListJobsRequest 请求对象
     * @return ListJobsResponse
     */
    public ListJobsResponse listJobs(ListJobsRequest request) {
        return hcClient.syncInvokeHttp(request, GeipMeta.listJobs);
    }

    /**
     * 查询Job列表
     *
     * 查询Job列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListJobsRequest 请求对象
     * @return SyncInvoker<ListJobsRequest, ListJobsResponse>
     */
    public SyncInvoker<ListJobsRequest, ListJobsResponse> listJobsInvoker(ListJobsRequest request) {
        return new SyncInvoker<>(request, GeipMeta.listJobs, hcClient);
    }

    /**
     * 查询Job详情
     *
     * 查询Job详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowJobsRequest 请求对象
     * @return ShowJobsResponse
     */
    public ShowJobsResponse showJobs(ShowJobsRequest request) {
        return hcClient.syncInvokeHttp(request, GeipMeta.showJobs);
    }

    /**
     * 查询Job详情
     *
     * 查询Job详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowJobsRequest 请求对象
     * @return SyncInvoker<ShowJobsRequest, ShowJobsResponse>
     */
    public SyncInvoker<ShowJobsRequest, ShowJobsResponse> showJobsInvoker(ShowJobsRequest request) {
        return new SyncInvoker<>(request, GeipMeta.showJobs, hcClient);
    }

    /**
     * 全域弹性公网IP支持绑定的Region限制
     *
     * 全域弹性公网IP支持绑定的Region限制
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSupportRegionsRequest 请求对象
     * @return ListSupportRegionsResponse
     */
    public ListSupportRegionsResponse listSupportRegions(ListSupportRegionsRequest request) {
        return hcClient.syncInvokeHttp(request, GeipMeta.listSupportRegions);
    }

    /**
     * 全域弹性公网IP支持绑定的Region限制
     *
     * 全域弹性公网IP支持绑定的Region限制
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSupportRegionsRequest 请求对象
     * @return SyncInvoker<ListSupportRegionsRequest, ListSupportRegionsResponse>
     */
    public SyncInvoker<ListSupportRegionsRequest, ListSupportRegionsResponse> listSupportRegionsInvoker(
        ListSupportRegionsRequest request) {
        return new SyncInvoker<>(request, GeipMeta.listSupportRegions, hcClient);
    }

    /**
     * 查询指定站点允许绑定的Region信息
     *
     * console通过此接口获取指定pop点的全域弹性公网IP允许绑定的region实例信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTenantGeipSupportInstancesRequest 请求对象
     * @return ListTenantGeipSupportInstancesResponse
     */
    public ListTenantGeipSupportInstancesResponse listTenantGeipSupportInstances(
        ListTenantGeipSupportInstancesRequest request) {
        return hcClient.syncInvokeHttp(request, GeipMeta.listTenantGeipSupportInstances);
    }

    /**
     * 查询指定站点允许绑定的Region信息
     *
     * console通过此接口获取指定pop点的全域弹性公网IP允许绑定的region实例信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTenantGeipSupportInstancesRequest 请求对象
     * @return SyncInvoker<ListTenantGeipSupportInstancesRequest, ListTenantGeipSupportInstancesResponse>
     */
    public SyncInvoker<ListTenantGeipSupportInstancesRequest, ListTenantGeipSupportInstancesResponse> listTenantGeipSupportInstancesInvoker(
        ListTenantGeipSupportInstancesRequest request) {
        return new SyncInvoker<>(request, GeipMeta.listTenantGeipSupportInstances, hcClient);
    }

}
