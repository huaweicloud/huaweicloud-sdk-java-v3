package com.huaweicloud.sdk.eip.v2;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.eip.v2.model.*;

public class EipClient {

    protected HcClient hcClient;

    public EipClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<EipClient> newBuilder() {
        return new ClientBuilder<>(EipClient::new);
    }

    /**
     * 共享带宽插入弹性公网IP
     *
     * 共享带宽插入弹性公网IP。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AddPublicipsIntoSharedBandwidthRequest 请求对象
     * @return AddPublicipsIntoSharedBandwidthResponse
     */
    public AddPublicipsIntoSharedBandwidthResponse addPublicipsIntoSharedBandwidth(
        AddPublicipsIntoSharedBandwidthRequest request) {
        return hcClient.syncInvokeHttp(request, EipMeta.addPublicipsIntoSharedBandwidth);
    }

    /**
     * 共享带宽插入弹性公网IP
     *
     * 共享带宽插入弹性公网IP。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AddPublicipsIntoSharedBandwidthRequest 请求对象
     * @return SyncInvoker<AddPublicipsIntoSharedBandwidthRequest, AddPublicipsIntoSharedBandwidthResponse>
     */
    public SyncInvoker<AddPublicipsIntoSharedBandwidthRequest, AddPublicipsIntoSharedBandwidthResponse> addPublicipsIntoSharedBandwidthInvoker(
        AddPublicipsIntoSharedBandwidthRequest request) {
        return new SyncInvoker<AddPublicipsIntoSharedBandwidthRequest, AddPublicipsIntoSharedBandwidthResponse>(request,
            EipMeta.addPublicipsIntoSharedBandwidth, hcClient);
    }

    /**
     * 批量创建共享带宽
     *
     * 批量创建共享带宽。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchCreateSharedBandwidthsRequest 请求对象
     * @return BatchCreateSharedBandwidthsResponse
     */
    public BatchCreateSharedBandwidthsResponse batchCreateSharedBandwidths(BatchCreateSharedBandwidthsRequest request) {
        return hcClient.syncInvokeHttp(request, EipMeta.batchCreateSharedBandwidths);
    }

    /**
     * 批量创建共享带宽
     *
     * 批量创建共享带宽。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchCreateSharedBandwidthsRequest 请求对象
     * @return SyncInvoker<BatchCreateSharedBandwidthsRequest, BatchCreateSharedBandwidthsResponse>
     */
    public SyncInvoker<BatchCreateSharedBandwidthsRequest, BatchCreateSharedBandwidthsResponse> batchCreateSharedBandwidthsInvoker(
        BatchCreateSharedBandwidthsRequest request) {
        return new SyncInvoker<BatchCreateSharedBandwidthsRequest, BatchCreateSharedBandwidthsResponse>(request,
            EipMeta.batchCreateSharedBandwidths, hcClient);
    }

    /**
     * 按需转包API
     *
     * 租户按需转包接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ChangeBandwidthToPeriodRequest 请求对象
     * @return ChangeBandwidthToPeriodResponse
     */
    public ChangeBandwidthToPeriodResponse changeBandwidthToPeriod(ChangeBandwidthToPeriodRequest request) {
        return hcClient.syncInvokeHttp(request, EipMeta.changeBandwidthToPeriod);
    }

    /**
     * 按需转包API
     *
     * 租户按需转包接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ChangeBandwidthToPeriodRequest 请求对象
     * @return SyncInvoker<ChangeBandwidthToPeriodRequest, ChangeBandwidthToPeriodResponse>
     */
    public SyncInvoker<ChangeBandwidthToPeriodRequest, ChangeBandwidthToPeriodResponse> changeBandwidthToPeriodInvoker(
        ChangeBandwidthToPeriodRequest request) {
        return new SyncInvoker<ChangeBandwidthToPeriodRequest, ChangeBandwidthToPeriodResponse>(request,
            EipMeta.changeBandwidthToPeriod, hcClient);
    }

    /**
     * 创建共享带宽
     *
     * 创建共享带宽。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateSharedBandwidthRequest 请求对象
     * @return CreateSharedBandwidthResponse
     */
    public CreateSharedBandwidthResponse createSharedBandwidth(CreateSharedBandwidthRequest request) {
        return hcClient.syncInvokeHttp(request, EipMeta.createSharedBandwidth);
    }

    /**
     * 创建共享带宽
     *
     * 创建共享带宽。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateSharedBandwidthRequest 请求对象
     * @return SyncInvoker<CreateSharedBandwidthRequest, CreateSharedBandwidthResponse>
     */
    public SyncInvoker<CreateSharedBandwidthRequest, CreateSharedBandwidthResponse> createSharedBandwidthInvoker(
        CreateSharedBandwidthRequest request) {
        return new SyncInvoker<CreateSharedBandwidthRequest, CreateSharedBandwidthResponse>(request,
            EipMeta.createSharedBandwidth, hcClient);
    }

    /**
     * 删除共享带宽
     *
     * 删除共享带宽。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteSharedBandwidthRequest 请求对象
     * @return DeleteSharedBandwidthResponse
     */
    public DeleteSharedBandwidthResponse deleteSharedBandwidth(DeleteSharedBandwidthRequest request) {
        return hcClient.syncInvokeHttp(request, EipMeta.deleteSharedBandwidth);
    }

    /**
     * 删除共享带宽
     *
     * 删除共享带宽。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteSharedBandwidthRequest 请求对象
     * @return SyncInvoker<DeleteSharedBandwidthRequest, DeleteSharedBandwidthResponse>
     */
    public SyncInvoker<DeleteSharedBandwidthRequest, DeleteSharedBandwidthResponse> deleteSharedBandwidthInvoker(
        DeleteSharedBandwidthRequest request) {
        return new SyncInvoker<DeleteSharedBandwidthRequest, DeleteSharedBandwidthResponse>(request,
            EipMeta.deleteSharedBandwidth, hcClient);
    }

    /**
     * 查询带宽加油包列表
     *
     * 查询带宽加油包列表信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListBandwidthPkgRequest 请求对象
     * @return ListBandwidthPkgResponse
     */
    public ListBandwidthPkgResponse listBandwidthPkg(ListBandwidthPkgRequest request) {
        return hcClient.syncInvokeHttp(request, EipMeta.listBandwidthPkg);
    }

    /**
     * 查询带宽加油包列表
     *
     * 查询带宽加油包列表信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListBandwidthPkgRequest 请求对象
     * @return SyncInvoker<ListBandwidthPkgRequest, ListBandwidthPkgResponse>
     */
    public SyncInvoker<ListBandwidthPkgRequest, ListBandwidthPkgResponse> listBandwidthPkgInvoker(
        ListBandwidthPkgRequest request) {
        return new SyncInvoker<ListBandwidthPkgRequest, ListBandwidthPkgResponse>(request, EipMeta.listBandwidthPkg,
            hcClient);
    }

    /**
     * 查询带宽列表
     *
     * 查询带宽列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListBandwidthsRequest 请求对象
     * @return ListBandwidthsResponse
     */
    public ListBandwidthsResponse listBandwidths(ListBandwidthsRequest request) {
        return hcClient.syncInvokeHttp(request, EipMeta.listBandwidths);
    }

    /**
     * 查询带宽列表
     *
     * 查询带宽列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListBandwidthsRequest 请求对象
     * @return SyncInvoker<ListBandwidthsRequest, ListBandwidthsResponse>
     */
    public SyncInvoker<ListBandwidthsRequest, ListBandwidthsResponse> listBandwidthsInvoker(
        ListBandwidthsRequest request) {
        return new SyncInvoker<ListBandwidthsRequest, ListBandwidthsResponse>(request, EipMeta.listBandwidths,
            hcClient);
    }

    /**
     * 查询配额接口
     *
     * 查询配额
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListQuotasRequest 请求对象
     * @return ListQuotasResponse
     */
    public ListQuotasResponse listQuotas(ListQuotasRequest request) {
        return hcClient.syncInvokeHttp(request, EipMeta.listQuotas);
    }

    /**
     * 查询配额接口
     *
     * 查询配额
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListQuotasRequest 请求对象
     * @return SyncInvoker<ListQuotasRequest, ListQuotasResponse>
     */
    public SyncInvoker<ListQuotasRequest, ListQuotasResponse> listQuotasInvoker(ListQuotasRequest request) {
        return new SyncInvoker<ListQuotasRequest, ListQuotasResponse>(request, EipMeta.listQuotas, hcClient);
    }

    /**
     * 共享带宽移除弹性公网IP
     *
     * 共享带宽移除弹性公网IP。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RemovePublicipsFromSharedBandwidthRequest 请求对象
     * @return RemovePublicipsFromSharedBandwidthResponse
     */
    public RemovePublicipsFromSharedBandwidthResponse removePublicipsFromSharedBandwidth(
        RemovePublicipsFromSharedBandwidthRequest request) {
        return hcClient.syncInvokeHttp(request, EipMeta.removePublicipsFromSharedBandwidth);
    }

    /**
     * 共享带宽移除弹性公网IP
     *
     * 共享带宽移除弹性公网IP。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RemovePublicipsFromSharedBandwidthRequest 请求对象
     * @return SyncInvoker<RemovePublicipsFromSharedBandwidthRequest, RemovePublicipsFromSharedBandwidthResponse>
     */
    public SyncInvoker<RemovePublicipsFromSharedBandwidthRequest, RemovePublicipsFromSharedBandwidthResponse> removePublicipsFromSharedBandwidthInvoker(
        RemovePublicipsFromSharedBandwidthRequest request) {
        return new SyncInvoker<RemovePublicipsFromSharedBandwidthRequest, RemovePublicipsFromSharedBandwidthResponse>(
            request, EipMeta.removePublicipsFromSharedBandwidth, hcClient);
    }

    /**
     * 查询带宽
     *
     * 查询带宽
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowBandwidthRequest 请求对象
     * @return ShowBandwidthResponse
     */
    public ShowBandwidthResponse showBandwidth(ShowBandwidthRequest request) {
        return hcClient.syncInvokeHttp(request, EipMeta.showBandwidth);
    }

    /**
     * 查询带宽
     *
     * 查询带宽
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowBandwidthRequest 请求对象
     * @return SyncInvoker<ShowBandwidthRequest, ShowBandwidthResponse>
     */
    public SyncInvoker<ShowBandwidthRequest, ShowBandwidthResponse> showBandwidthInvoker(ShowBandwidthRequest request) {
        return new SyncInvoker<ShowBandwidthRequest, ShowBandwidthResponse>(request, EipMeta.showBandwidth, hcClient);
    }

    /**
     * 更新带宽
     *
     * 更新带宽。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateBandwidthRequest 请求对象
     * @return UpdateBandwidthResponse
     */
    public UpdateBandwidthResponse updateBandwidth(UpdateBandwidthRequest request) {
        return hcClient.syncInvokeHttp(request, EipMeta.updateBandwidth);
    }

    /**
     * 更新带宽
     *
     * 更新带宽。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateBandwidthRequest 请求对象
     * @return SyncInvoker<UpdateBandwidthRequest, UpdateBandwidthResponse>
     */
    public SyncInvoker<UpdateBandwidthRequest, UpdateBandwidthResponse> updateBandwidthInvoker(
        UpdateBandwidthRequest request) {
        return new SyncInvoker<UpdateBandwidthRequest, UpdateBandwidthResponse>(request, EipMeta.updateBandwidth,
            hcClient);
    }

    /**
     * 更新包周期带宽
     *
     * 更新带宽。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdatePrePaidBandwidthRequest 请求对象
     * @return UpdatePrePaidBandwidthResponse
     */
    public UpdatePrePaidBandwidthResponse updatePrePaidBandwidth(UpdatePrePaidBandwidthRequest request) {
        return hcClient.syncInvokeHttp(request, EipMeta.updatePrePaidBandwidth);
    }

    /**
     * 更新包周期带宽
     *
     * 更新带宽。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdatePrePaidBandwidthRequest 请求对象
     * @return SyncInvoker<UpdatePrePaidBandwidthRequest, UpdatePrePaidBandwidthResponse>
     */
    public SyncInvoker<UpdatePrePaidBandwidthRequest, UpdatePrePaidBandwidthResponse> updatePrePaidBandwidthInvoker(
        UpdatePrePaidBandwidthRequest request) {
        return new SyncInvoker<UpdatePrePaidBandwidthRequest, UpdatePrePaidBandwidthResponse>(request,
            EipMeta.updatePrePaidBandwidth, hcClient);
    }

    /**
     * 批量创建弹性公网IP资源标签
     *
     * 为指定的弹性公网IP资源实例批量添加标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchCreatePublicipTagsRequest 请求对象
     * @return BatchCreatePublicipTagsResponse
     */
    public BatchCreatePublicipTagsResponse batchCreatePublicipTags(BatchCreatePublicipTagsRequest request) {
        return hcClient.syncInvokeHttp(request, EipMeta.batchCreatePublicipTags);
    }

    /**
     * 批量创建弹性公网IP资源标签
     *
     * 为指定的弹性公网IP资源实例批量添加标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchCreatePublicipTagsRequest 请求对象
     * @return SyncInvoker<BatchCreatePublicipTagsRequest, BatchCreatePublicipTagsResponse>
     */
    public SyncInvoker<BatchCreatePublicipTagsRequest, BatchCreatePublicipTagsResponse> batchCreatePublicipTagsInvoker(
        BatchCreatePublicipTagsRequest request) {
        return new SyncInvoker<BatchCreatePublicipTagsRequest, BatchCreatePublicipTagsResponse>(request,
            EipMeta.batchCreatePublicipTags, hcClient);
    }

    /**
     * 批量创建弹性公网IP
     *
     * 批量创建弹性公网IP
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchCreatePublicipsRequest 请求对象
     * @return BatchCreatePublicipsResponse
     */
    public BatchCreatePublicipsResponse batchCreatePublicips(BatchCreatePublicipsRequest request) {
        return hcClient.syncInvokeHttp(request, EipMeta.batchCreatePublicips);
    }

    /**
     * 批量创建弹性公网IP
     *
     * 批量创建弹性公网IP
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchCreatePublicipsRequest 请求对象
     * @return SyncInvoker<BatchCreatePublicipsRequest, BatchCreatePublicipsResponse>
     */
    public SyncInvoker<BatchCreatePublicipsRequest, BatchCreatePublicipsResponse> batchCreatePublicipsInvoker(
        BatchCreatePublicipsRequest request) {
        return new SyncInvoker<BatchCreatePublicipsRequest, BatchCreatePublicipsResponse>(request,
            EipMeta.batchCreatePublicips, hcClient);
    }

    /**
     * 批量删除弹性公网IP
     *
     * 批量删除弹性公网IP
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchDeletePublicIpRequest 请求对象
     * @return BatchDeletePublicIpResponse
     */
    public BatchDeletePublicIpResponse batchDeletePublicIp(BatchDeletePublicIpRequest request) {
        return hcClient.syncInvokeHttp(request, EipMeta.batchDeletePublicIp);
    }

    /**
     * 批量删除弹性公网IP
     *
     * 批量删除弹性公网IP
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchDeletePublicIpRequest 请求对象
     * @return SyncInvoker<BatchDeletePublicIpRequest, BatchDeletePublicIpResponse>
     */
    public SyncInvoker<BatchDeletePublicIpRequest, BatchDeletePublicIpResponse> batchDeletePublicIpInvoker(
        BatchDeletePublicIpRequest request) {
        return new SyncInvoker<BatchDeletePublicIpRequest, BatchDeletePublicIpResponse>(request,
            EipMeta.batchDeletePublicIp, hcClient);
    }

    /**
     * 批量删除弹性公网IP资源标签
     *
     * 为指定的弹性公网IP资源实例批量删除标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchDeletePublicipTagsRequest 请求对象
     * @return BatchDeletePublicipTagsResponse
     */
    public BatchDeletePublicipTagsResponse batchDeletePublicipTags(BatchDeletePublicipTagsRequest request) {
        return hcClient.syncInvokeHttp(request, EipMeta.batchDeletePublicipTags);
    }

    /**
     * 批量删除弹性公网IP资源标签
     *
     * 为指定的弹性公网IP资源实例批量删除标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchDeletePublicipTagsRequest 请求对象
     * @return SyncInvoker<BatchDeletePublicipTagsRequest, BatchDeletePublicipTagsResponse>
     */
    public SyncInvoker<BatchDeletePublicipTagsRequest, BatchDeletePublicipTagsResponse> batchDeletePublicipTagsInvoker(
        BatchDeletePublicipTagsRequest request) {
        return new SyncInvoker<BatchDeletePublicipTagsRequest, BatchDeletePublicipTagsResponse>(request,
            EipMeta.batchDeletePublicipTags, hcClient);
    }

    /**
     * 批量解绑弹性公网IP
     *
     * 批量解绑弹性公网IP
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchDisassociatePublicipsRequest 请求对象
     * @return BatchDisassociatePublicipsResponse
     */
    public BatchDisassociatePublicipsResponse batchDisassociatePublicips(BatchDisassociatePublicipsRequest request) {
        return hcClient.syncInvokeHttp(request, EipMeta.batchDisassociatePublicips);
    }

    /**
     * 批量解绑弹性公网IP
     *
     * 批量解绑弹性公网IP
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchDisassociatePublicipsRequest 请求对象
     * @return SyncInvoker<BatchDisassociatePublicipsRequest, BatchDisassociatePublicipsResponse>
     */
    public SyncInvoker<BatchDisassociatePublicipsRequest, BatchDisassociatePublicipsResponse> batchDisassociatePublicipsInvoker(
        BatchDisassociatePublicipsRequest request) {
        return new SyncInvoker<BatchDisassociatePublicipsRequest, BatchDisassociatePublicipsResponse>(request,
            EipMeta.batchDisassociatePublicips, hcClient);
    }

    /**
     * 按需转包接口
     *
     * 租户按需转包接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ChangePublicipToPeriodRequest 请求对象
     * @return ChangePublicipToPeriodResponse
     */
    public ChangePublicipToPeriodResponse changePublicipToPeriod(ChangePublicipToPeriodRequest request) {
        return hcClient.syncInvokeHttp(request, EipMeta.changePublicipToPeriod);
    }

    /**
     * 按需转包接口
     *
     * 租户按需转包接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ChangePublicipToPeriodRequest 请求对象
     * @return SyncInvoker<ChangePublicipToPeriodRequest, ChangePublicipToPeriodResponse>
     */
    public SyncInvoker<ChangePublicipToPeriodRequest, ChangePublicipToPeriodResponse> changePublicipToPeriodInvoker(
        ChangePublicipToPeriodRequest request) {
        return new SyncInvoker<ChangePublicipToPeriodRequest, ChangePublicipToPeriodResponse>(request,
            EipMeta.changePublicipToPeriod, hcClient);
    }

    /**
     * 查询PublicIp数量
     *
     * 查询PublicIp数量
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CountPublicIpRequest 请求对象
     * @return CountPublicIpResponse
     */
    public CountPublicIpResponse countPublicIp(CountPublicIpRequest request) {
        return hcClient.syncInvokeHttp(request, EipMeta.countPublicIp);
    }

    /**
     * 查询PublicIp数量
     *
     * 查询PublicIp数量
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CountPublicIpRequest 请求对象
     * @return SyncInvoker<CountPublicIpRequest, CountPublicIpResponse>
     */
    public SyncInvoker<CountPublicIpRequest, CountPublicIpResponse> countPublicIpInvoker(CountPublicIpRequest request) {
        return new SyncInvoker<CountPublicIpRequest, CountPublicIpResponse>(request, EipMeta.countPublicIp, hcClient);
    }

    /**
     * 查询PublicIp实例数
     *
     * 查询PublicIp实例数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CountPublicIpInstanceRequest 请求对象
     * @return CountPublicIpInstanceResponse
     */
    public CountPublicIpInstanceResponse countPublicIpInstance(CountPublicIpInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, EipMeta.countPublicIpInstance);
    }

    /**
     * 查询PublicIp实例数
     *
     * 查询PublicIp实例数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CountPublicIpInstanceRequest 请求对象
     * @return SyncInvoker<CountPublicIpInstanceRequest, CountPublicIpInstanceResponse>
     */
    public SyncInvoker<CountPublicIpInstanceRequest, CountPublicIpInstanceResponse> countPublicIpInstanceInvoker(
        CountPublicIpInstanceRequest request) {
        return new SyncInvoker<CountPublicIpInstanceRequest, CountPublicIpInstanceResponse>(request,
            EipMeta.countPublicIpInstance, hcClient);
    }

    /**
     * 申请包周期弹性公网IP
     *
     * 申请包年包月的弹性公网IP。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreatePrePaidPublicipRequest 请求对象
     * @return CreatePrePaidPublicipResponse
     */
    public CreatePrePaidPublicipResponse createPrePaidPublicip(CreatePrePaidPublicipRequest request) {
        return hcClient.syncInvokeHttp(request, EipMeta.createPrePaidPublicip);
    }

    /**
     * 申请包周期弹性公网IP
     *
     * 申请包年包月的弹性公网IP。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreatePrePaidPublicipRequest 请求对象
     * @return SyncInvoker<CreatePrePaidPublicipRequest, CreatePrePaidPublicipResponse>
     */
    public SyncInvoker<CreatePrePaidPublicipRequest, CreatePrePaidPublicipResponse> createPrePaidPublicipInvoker(
        CreatePrePaidPublicipRequest request) {
        return new SyncInvoker<CreatePrePaidPublicipRequest, CreatePrePaidPublicipResponse>(request,
            EipMeta.createPrePaidPublicip, hcClient);
    }

    /**
     * 申请弹性公网IP
     *
     * 申请弹性公网IP，支持IPv4和IPv6。
     *  弹性公网IP（Elastic IP）提供独立的公网IP资源，包括公网IP地址与公网出口带宽服务。可以与弹性云服务器、裸金属服务器、虚拟IP、弹性负载均衡、NAT网关等资源灵活地绑定及解绑。拥有多种灵活的计费方式，可以满足各种业务场景的需要。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreatePublicipRequest 请求对象
     * @return CreatePublicipResponse
     */
    public CreatePublicipResponse createPublicip(CreatePublicipRequest request) {
        return hcClient.syncInvokeHttp(request, EipMeta.createPublicip);
    }

    /**
     * 申请弹性公网IP
     *
     * 申请弹性公网IP，支持IPv4和IPv6。
     *  弹性公网IP（Elastic IP）提供独立的公网IP资源，包括公网IP地址与公网出口带宽服务。可以与弹性云服务器、裸金属服务器、虚拟IP、弹性负载均衡、NAT网关等资源灵活地绑定及解绑。拥有多种灵活的计费方式，可以满足各种业务场景的需要。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreatePublicipRequest 请求对象
     * @return SyncInvoker<CreatePublicipRequest, CreatePublicipResponse>
     */
    public SyncInvoker<CreatePublicipRequest, CreatePublicipResponse> createPublicipInvoker(
        CreatePublicipRequest request) {
        return new SyncInvoker<CreatePublicipRequest, CreatePublicipResponse>(request, EipMeta.createPublicip,
            hcClient);
    }

    /**
     * 创建弹性公网IP资源标签
     *
     * 给指定弹性IP资源实例增加标签信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreatePublicipTagRequest 请求对象
     * @return CreatePublicipTagResponse
     */
    public CreatePublicipTagResponse createPublicipTag(CreatePublicipTagRequest request) {
        return hcClient.syncInvokeHttp(request, EipMeta.createPublicipTag);
    }

    /**
     * 创建弹性公网IP资源标签
     *
     * 给指定弹性IP资源实例增加标签信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreatePublicipTagRequest 请求对象
     * @return SyncInvoker<CreatePublicipTagRequest, CreatePublicipTagResponse>
     */
    public SyncInvoker<CreatePublicipTagRequest, CreatePublicipTagResponse> createPublicipTagInvoker(
        CreatePublicipTagRequest request) {
        return new SyncInvoker<CreatePublicipTagRequest, CreatePublicipTagResponse>(request, EipMeta.createPublicipTag,
            hcClient);
    }

    /**
     * 删除弹性公网IP
     *
     * 删除弹性公网IP,绑定状态eip不允许直接删除。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeletePublicipRequest 请求对象
     * @return DeletePublicipResponse
     */
    public DeletePublicipResponse deletePublicip(DeletePublicipRequest request) {
        return hcClient.syncInvokeHttp(request, EipMeta.deletePublicip);
    }

    /**
     * 删除弹性公网IP
     *
     * 删除弹性公网IP,绑定状态eip不允许直接删除。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeletePublicipRequest 请求对象
     * @return SyncInvoker<DeletePublicipRequest, DeletePublicipResponse>
     */
    public SyncInvoker<DeletePublicipRequest, DeletePublicipResponse> deletePublicipInvoker(
        DeletePublicipRequest request) {
        return new SyncInvoker<DeletePublicipRequest, DeletePublicipResponse>(request, EipMeta.deletePublicip,
            hcClient);
    }

    /**
     * 删除弹性公网IP的标签
     *
     * 删除指定弹性公网IP的标签信息。其中project_id是项目ID，publicip_id 是要操作的弹性公网IP的id。key是要删除标签的键。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeletePublicipTagRequest 请求对象
     * @return DeletePublicipTagResponse
     */
    public DeletePublicipTagResponse deletePublicipTag(DeletePublicipTagRequest request) {
        return hcClient.syncInvokeHttp(request, EipMeta.deletePublicipTag);
    }

    /**
     * 删除弹性公网IP的标签
     *
     * 删除指定弹性公网IP的标签信息。其中project_id是项目ID，publicip_id 是要操作的弹性公网IP的id。key是要删除标签的键。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeletePublicipTagRequest 请求对象
     * @return SyncInvoker<DeletePublicipTagRequest, DeletePublicipTagResponse>
     */
    public SyncInvoker<DeletePublicipTagRequest, DeletePublicipTagResponse> deletePublicipTagInvoker(
        DeletePublicipTagRequest request) {
        return new SyncInvoker<DeletePublicipTagRequest, DeletePublicipTagResponse>(request, EipMeta.deletePublicipTag,
            hcClient);
    }

    /**
     * 查询租户的弹性公网IP标签
     *
     * 查询租户在指定区域和实例类型的所有标签集合。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPublicipTagsRequest 请求对象
     * @return ListPublicipTagsResponse
     */
    public ListPublicipTagsResponse listPublicipTags(ListPublicipTagsRequest request) {
        return hcClient.syncInvokeHttp(request, EipMeta.listPublicipTags);
    }

    /**
     * 查询租户的弹性公网IP标签
     *
     * 查询租户在指定区域和实例类型的所有标签集合。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPublicipTagsRequest 请求对象
     * @return SyncInvoker<ListPublicipTagsRequest, ListPublicipTagsResponse>
     */
    public SyncInvoker<ListPublicipTagsRequest, ListPublicipTagsResponse> listPublicipTagsInvoker(
        ListPublicipTagsRequest request) {
        return new SyncInvoker<ListPublicipTagsRequest, ListPublicipTagsResponse>(request, EipMeta.listPublicipTags,
            hcClient);
    }

    /**
     * 查询弹性公网IP列表
     *
     * 查询弹性公网IP列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPublicipsRequest 请求对象
     * @return ListPublicipsResponse
     */
    public ListPublicipsResponse listPublicips(ListPublicipsRequest request) {
        return hcClient.syncInvokeHttp(request, EipMeta.listPublicips);
    }

    /**
     * 查询弹性公网IP列表
     *
     * 查询弹性公网IP列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPublicipsRequest 请求对象
     * @return SyncInvoker<ListPublicipsRequest, ListPublicipsResponse>
     */
    public SyncInvoker<ListPublicipsRequest, ListPublicipsResponse> listPublicipsInvoker(ListPublicipsRequest request) {
        return new SyncInvoker<ListPublicipsRequest, ListPublicipsResponse>(request, EipMeta.listPublicips, hcClient);
    }

    /**
     * 按标签查询弹性公网IP列表
     *
     * 使用标签过滤弹性公网IP。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPublicipsByTagsRequest 请求对象
     * @return ListPublicipsByTagsResponse
     */
    public ListPublicipsByTagsResponse listPublicipsByTags(ListPublicipsByTagsRequest request) {
        return hcClient.syncInvokeHttp(request, EipMeta.listPublicipsByTags);
    }

    /**
     * 按标签查询弹性公网IP列表
     *
     * 使用标签过滤弹性公网IP。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPublicipsByTagsRequest 请求对象
     * @return SyncInvoker<ListPublicipsByTagsRequest, ListPublicipsByTagsResponse>
     */
    public SyncInvoker<ListPublicipsByTagsRequest, ListPublicipsByTagsResponse> listPublicipsByTagsInvoker(
        ListPublicipsByTagsRequest request) {
        return new SyncInvoker<ListPublicipsByTagsRequest, ListPublicipsByTagsResponse>(request,
            EipMeta.listPublicipsByTags, hcClient);
    }

    /**
     * 查询PublicIp类型
     *
     * 查询PublicIp类型
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPublicIpTypeRequest 请求对象
     * @return ShowPublicIpTypeResponse
     */
    public ShowPublicIpTypeResponse showPublicIpType(ShowPublicIpTypeRequest request) {
        return hcClient.syncInvokeHttp(request, EipMeta.showPublicIpType);
    }

    /**
     * 查询PublicIp类型
     *
     * 查询PublicIp类型
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPublicIpTypeRequest 请求对象
     * @return SyncInvoker<ShowPublicIpTypeRequest, ShowPublicIpTypeResponse>
     */
    public SyncInvoker<ShowPublicIpTypeRequest, ShowPublicIpTypeResponse> showPublicIpTypeInvoker(
        ShowPublicIpTypeRequest request) {
        return new SyncInvoker<ShowPublicIpTypeRequest, ShowPublicIpTypeResponse>(request, EipMeta.showPublicIpType,
            hcClient);
    }

    /**
     * 查询弹性公网IP
     *
     * 查询指定的弹性公网IP。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPublicipRequest 请求对象
     * @return ShowPublicipResponse
     */
    public ShowPublicipResponse showPublicip(ShowPublicipRequest request) {
        return hcClient.syncInvokeHttp(request, EipMeta.showPublicip);
    }

    /**
     * 查询弹性公网IP
     *
     * 查询指定的弹性公网IP。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPublicipRequest 请求对象
     * @return SyncInvoker<ShowPublicipRequest, ShowPublicipResponse>
     */
    public SyncInvoker<ShowPublicipRequest, ShowPublicipResponse> showPublicipInvoker(ShowPublicipRequest request) {
        return new SyncInvoker<ShowPublicipRequest, ShowPublicipResponse>(request, EipMeta.showPublicip, hcClient);
    }

    /**
     * 查询弹性公网IP的标签
     *
     * 查询指定弹性IP实例的标签信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPublicipTagsRequest 请求对象
     * @return ShowPublicipTagsResponse
     */
    public ShowPublicipTagsResponse showPublicipTags(ShowPublicipTagsRequest request) {
        return hcClient.syncInvokeHttp(request, EipMeta.showPublicipTags);
    }

    /**
     * 查询弹性公网IP的标签
     *
     * 查询指定弹性IP实例的标签信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPublicipTagsRequest 请求对象
     * @return SyncInvoker<ShowPublicipTagsRequest, ShowPublicipTagsResponse>
     */
    public SyncInvoker<ShowPublicipTagsRequest, ShowPublicipTagsResponse> showPublicipTagsInvoker(
        ShowPublicipTagsRequest request) {
        return new SyncInvoker<ShowPublicipTagsRequest, ShowPublicipTagsResponse>(request, EipMeta.showPublicipTags,
            hcClient);
    }

    /**
     * 更新弹性公网IP
     *
     * 更新弹性公网IP，将弹性公网IP跟一个网卡绑定或者解绑定，转换IP地址版本类型。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdatePublicipRequest 请求对象
     * @return UpdatePublicipResponse
     */
    public UpdatePublicipResponse updatePublicip(UpdatePublicipRequest request) {
        return hcClient.syncInvokeHttp(request, EipMeta.updatePublicip);
    }

    /**
     * 更新弹性公网IP
     *
     * 更新弹性公网IP，将弹性公网IP跟一个网卡绑定或者解绑定，转换IP地址版本类型。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdatePublicipRequest 请求对象
     * @return SyncInvoker<UpdatePublicipRequest, UpdatePublicipResponse>
     */
    public SyncInvoker<UpdatePublicipRequest, UpdatePublicipResponse> updatePublicipInvoker(
        UpdatePublicipRequest request) {
        return new SyncInvoker<UpdatePublicipRequest, UpdatePublicipResponse>(request, EipMeta.updatePublicip,
            hcClient);
    }

    /**
     * 查询Job状态接口
     *
     * 查询Job状态接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowResourcesJobDetailRequest 请求对象
     * @return ShowResourcesJobDetailResponse
     */
    public ShowResourcesJobDetailResponse showResourcesJobDetail(ShowResourcesJobDetailRequest request) {
        return hcClient.syncInvokeHttp(request, EipMeta.showResourcesJobDetail);
    }

    /**
     * 查询Job状态接口
     *
     * 查询Job状态接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowResourcesJobDetailRequest 请求对象
     * @return SyncInvoker<ShowResourcesJobDetailRequest, ShowResourcesJobDetailResponse>
     */
    public SyncInvoker<ShowResourcesJobDetailRequest, ShowResourcesJobDetailResponse> showResourcesJobDetailInvoker(
        ShowResourcesJobDetailRequest request) {
        return new SyncInvoker<ShowResourcesJobDetailRequest, ShowResourcesJobDetailResponse>(request,
            EipMeta.showResourcesJobDetail, hcClient);
    }

    /**
     * 创建浮动IP
     *
     * 创建浮动IP的外部网络UUID，请使用GET /v2.0/networks?router:external&#x3D;True或neutron net-external-list方式获取。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param NeutronCreateFloatingIpRequest 请求对象
     * @return NeutronCreateFloatingIpResponse
     */
    public NeutronCreateFloatingIpResponse neutronCreateFloatingIp(NeutronCreateFloatingIpRequest request) {
        return hcClient.syncInvokeHttp(request, EipMeta.neutronCreateFloatingIp);
    }

    /**
     * 创建浮动IP
     *
     * 创建浮动IP的外部网络UUID，请使用GET /v2.0/networks?router:external&#x3D;True或neutron net-external-list方式获取。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param NeutronCreateFloatingIpRequest 请求对象
     * @return SyncInvoker<NeutronCreateFloatingIpRequest, NeutronCreateFloatingIpResponse>
     */
    public SyncInvoker<NeutronCreateFloatingIpRequest, NeutronCreateFloatingIpResponse> neutronCreateFloatingIpInvoker(
        NeutronCreateFloatingIpRequest request) {
        return new SyncInvoker<NeutronCreateFloatingIpRequest, NeutronCreateFloatingIpResponse>(request,
            EipMeta.neutronCreateFloatingIp, hcClient);
    }

    /**
     * 删除浮动IP
     *
     * 删除指定的浮动IP。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param NeutronDeleteFloatingIpRequest 请求对象
     * @return NeutronDeleteFloatingIpResponse
     */
    public NeutronDeleteFloatingIpResponse neutronDeleteFloatingIp(NeutronDeleteFloatingIpRequest request) {
        return hcClient.syncInvokeHttp(request, EipMeta.neutronDeleteFloatingIp);
    }

    /**
     * 删除浮动IP
     *
     * 删除指定的浮动IP。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param NeutronDeleteFloatingIpRequest 请求对象
     * @return SyncInvoker<NeutronDeleteFloatingIpRequest, NeutronDeleteFloatingIpResponse>
     */
    public SyncInvoker<NeutronDeleteFloatingIpRequest, NeutronDeleteFloatingIpResponse> neutronDeleteFloatingIpInvoker(
        NeutronDeleteFloatingIpRequest request) {
        return new SyncInvoker<NeutronDeleteFloatingIpRequest, NeutronDeleteFloatingIpResponse>(request,
            EipMeta.neutronDeleteFloatingIp, hcClient);
    }

    /**
     * 查询浮动IP列表
     *
     * 查询提交请求的租户有权限操作的所有浮动IP地址。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param NeutronListFloatingIpsRequest 请求对象
     * @return NeutronListFloatingIpsResponse
     */
    public NeutronListFloatingIpsResponse neutronListFloatingIps(NeutronListFloatingIpsRequest request) {
        return hcClient.syncInvokeHttp(request, EipMeta.neutronListFloatingIps);
    }

    /**
     * 查询浮动IP列表
     *
     * 查询提交请求的租户有权限操作的所有浮动IP地址。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param NeutronListFloatingIpsRequest 请求对象
     * @return SyncInvoker<NeutronListFloatingIpsRequest, NeutronListFloatingIpsResponse>
     */
    public SyncInvoker<NeutronListFloatingIpsRequest, NeutronListFloatingIpsResponse> neutronListFloatingIpsInvoker(
        NeutronListFloatingIpsRequest request) {
        return new SyncInvoker<NeutronListFloatingIpsRequest, NeutronListFloatingIpsResponse>(request,
            EipMeta.neutronListFloatingIps, hcClient);
    }

    /**
     * 查询浮动IP
     *
     * 查询浮动IP详情，包括浮动IP状态，浮动IP所属路由器ID，浮动IP的外部网络ID等等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param NeutronShowFloatingIpRequest 请求对象
     * @return NeutronShowFloatingIpResponse
     */
    public NeutronShowFloatingIpResponse neutronShowFloatingIp(NeutronShowFloatingIpRequest request) {
        return hcClient.syncInvokeHttp(request, EipMeta.neutronShowFloatingIp);
    }

    /**
     * 查询浮动IP
     *
     * 查询浮动IP详情，包括浮动IP状态，浮动IP所属路由器ID，浮动IP的外部网络ID等等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param NeutronShowFloatingIpRequest 请求对象
     * @return SyncInvoker<NeutronShowFloatingIpRequest, NeutronShowFloatingIpResponse>
     */
    public SyncInvoker<NeutronShowFloatingIpRequest, NeutronShowFloatingIpResponse> neutronShowFloatingIpInvoker(
        NeutronShowFloatingIpRequest request) {
        return new SyncInvoker<NeutronShowFloatingIpRequest, NeutronShowFloatingIpResponse>(request,
            EipMeta.neutronShowFloatingIp, hcClient);
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
     * @param NeutronUpdateFloatingIpRequest 请求对象
     * @return NeutronUpdateFloatingIpResponse
     */
    public NeutronUpdateFloatingIpResponse neutronUpdateFloatingIp(NeutronUpdateFloatingIpRequest request) {
        return hcClient.syncInvokeHttp(request, EipMeta.neutronUpdateFloatingIp);
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
     * @param NeutronUpdateFloatingIpRequest 请求对象
     * @return SyncInvoker<NeutronUpdateFloatingIpRequest, NeutronUpdateFloatingIpResponse>
     */
    public SyncInvoker<NeutronUpdateFloatingIpRequest, NeutronUpdateFloatingIpResponse> neutronUpdateFloatingIpInvoker(
        NeutronUpdateFloatingIpRequest request) {
        return new SyncInvoker<NeutronUpdateFloatingIpRequest, NeutronUpdateFloatingIpResponse>(request,
            EipMeta.neutronUpdateFloatingIp, hcClient);
    }

}
