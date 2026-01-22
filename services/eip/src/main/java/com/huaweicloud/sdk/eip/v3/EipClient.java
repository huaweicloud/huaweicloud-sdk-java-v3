package com.huaweicloud.sdk.eip.v3;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.eip.v3.model.AssociatePublicipsRequest;
import com.huaweicloud.sdk.eip.v3.model.AssociatePublicipsResponse;
import com.huaweicloud.sdk.eip.v3.model.AttachBatchPublicIpRequest;
import com.huaweicloud.sdk.eip.v3.model.AttachBatchPublicIpResponse;
import com.huaweicloud.sdk.eip.v3.model.AttachShareBandwidthRequest;
import com.huaweicloud.sdk.eip.v3.model.AttachShareBandwidthResponse;
import com.huaweicloud.sdk.eip.v3.model.CountEipAvailableResourcesRequest;
import com.huaweicloud.sdk.eip.v3.model.CountEipAvailableResourcesResponse;
import com.huaweicloud.sdk.eip.v3.model.CreateTenantVpcIgwRequest;
import com.huaweicloud.sdk.eip.v3.model.CreateTenantVpcIgwResponse;
import com.huaweicloud.sdk.eip.v3.model.DeleteTenantVpcIgwRequest;
import com.huaweicloud.sdk.eip.v3.model.DeleteTenantVpcIgwResponse;
import com.huaweicloud.sdk.eip.v3.model.DetachBatchPublicIpRequest;
import com.huaweicloud.sdk.eip.v3.model.DetachBatchPublicIpResponse;
import com.huaweicloud.sdk.eip.v3.model.DetachShareBandwidthRequest;
import com.huaweicloud.sdk.eip.v3.model.DetachShareBandwidthResponse;
import com.huaweicloud.sdk.eip.v3.model.DisableNat64Request;
import com.huaweicloud.sdk.eip.v3.model.DisableNat64Response;
import com.huaweicloud.sdk.eip.v3.model.DisassociatePublicipsRequest;
import com.huaweicloud.sdk.eip.v3.model.DisassociatePublicipsResponse;
import com.huaweicloud.sdk.eip.v3.model.EnableNat64Request;
import com.huaweicloud.sdk.eip.v3.model.EnableNat64Response;
import com.huaweicloud.sdk.eip.v3.model.ListBandwidthRequest;
import com.huaweicloud.sdk.eip.v3.model.ListBandwidthResponse;
import com.huaweicloud.sdk.eip.v3.model.ListBandwidthsLimitRequest;
import com.huaweicloud.sdk.eip.v3.model.ListBandwidthsLimitResponse;
import com.huaweicloud.sdk.eip.v3.model.ListCommonPoolsRequest;
import com.huaweicloud.sdk.eip.v3.model.ListCommonPoolsResponse;
import com.huaweicloud.sdk.eip.v3.model.ListEipBandwidthsRequest;
import com.huaweicloud.sdk.eip.v3.model.ListEipBandwidthsResponse;
import com.huaweicloud.sdk.eip.v3.model.ListProjectGeipBindingsRequest;
import com.huaweicloud.sdk.eip.v3.model.ListProjectGeipBindingsResponse;
import com.huaweicloud.sdk.eip.v3.model.ListPublicBorderGroupsRequest;
import com.huaweicloud.sdk.eip.v3.model.ListPublicBorderGroupsResponse;
import com.huaweicloud.sdk.eip.v3.model.ListPublicipPoolRequest;
import com.huaweicloud.sdk.eip.v3.model.ListPublicipPoolResponse;
import com.huaweicloud.sdk.eip.v3.model.ListPublicipsRequest;
import com.huaweicloud.sdk.eip.v3.model.ListPublicipsResponse;
import com.huaweicloud.sdk.eip.v3.model.ListShareBandwidthTypesRequest;
import com.huaweicloud.sdk.eip.v3.model.ListShareBandwidthTypesResponse;
import com.huaweicloud.sdk.eip.v3.model.ListTenantVpcIgwsRequest;
import com.huaweicloud.sdk.eip.v3.model.ListTenantVpcIgwsResponse;
import com.huaweicloud.sdk.eip.v3.model.ShowInternalVpcIgwRequest;
import com.huaweicloud.sdk.eip.v3.model.ShowInternalVpcIgwResponse;
import com.huaweicloud.sdk.eip.v3.model.ShowPublicipPoolRequest;
import com.huaweicloud.sdk.eip.v3.model.ShowPublicipPoolResponse;
import com.huaweicloud.sdk.eip.v3.model.ShowPublicipPoolTypesRequest;
import com.huaweicloud.sdk.eip.v3.model.ShowPublicipPoolTypesResponse;
import com.huaweicloud.sdk.eip.v3.model.ShowPublicipRequest;
import com.huaweicloud.sdk.eip.v3.model.ShowPublicipResponse;
import com.huaweicloud.sdk.eip.v3.model.UpdatePublicipRequest;
import com.huaweicloud.sdk.eip.v3.model.UpdatePublicipResponse;
import com.huaweicloud.sdk.eip.v3.model.UpdateTenantVpcIgwRequest;
import com.huaweicloud.sdk.eip.v3.model.UpdateTenantVpcIgwResponse;

public class EipClient {

    protected HcClient hcClient;

    public EipClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<EipClient> newBuilder() {
        ClientBuilder<EipClient> clientBuilder = new ClientBuilder<>(EipClient::new);
        return clientBuilder;
    }

    /**
     * 查询带宽列表
     *
     * 查询带宽列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBandwidthRequest 请求对象
     * @return ListBandwidthResponse
     */
    public ListBandwidthResponse listBandwidth(ListBandwidthRequest request) {
        return hcClient.syncInvokeHttp(request, EipMeta.listBandwidth);
    }

    /**
     * 查询带宽列表
     *
     * 查询带宽列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBandwidthRequest 请求对象
     * @return SyncInvoker<ListBandwidthRequest, ListBandwidthResponse>
     */
    public SyncInvoker<ListBandwidthRequest, ListBandwidthResponse> listBandwidthInvoker(ListBandwidthRequest request) {
        return new SyncInvoker<>(request, EipMeta.listBandwidth, hcClient);
    }

    /**
     * 查看租户带宽限制
     *
     * 获取EIP带宽限制列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBandwidthsLimitRequest 请求对象
     * @return ListBandwidthsLimitResponse
     */
    public ListBandwidthsLimitResponse listBandwidthsLimit(ListBandwidthsLimitRequest request) {
        return hcClient.syncInvokeHttp(request, EipMeta.listBandwidthsLimit);
    }

    /**
     * 查看租户带宽限制
     *
     * 获取EIP带宽限制列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBandwidthsLimitRequest 请求对象
     * @return SyncInvoker<ListBandwidthsLimitRequest, ListBandwidthsLimitResponse>
     */
    public SyncInvoker<ListBandwidthsLimitRequest, ListBandwidthsLimitResponse> listBandwidthsLimitInvoker(
        ListBandwidthsLimitRequest request) {
        return new SyncInvoker<>(request, EipMeta.listBandwidthsLimit, hcClient);
    }

    /**
     * 查询公共池列表
     *
     * 查询公共池列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCommonPoolsRequest 请求对象
     * @return ListCommonPoolsResponse
     */
    public ListCommonPoolsResponse listCommonPools(ListCommonPoolsRequest request) {
        return hcClient.syncInvokeHttp(request, EipMeta.listCommonPools);
    }

    /**
     * 查询公共池列表
     *
     * 查询公共池列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCommonPoolsRequest 请求对象
     * @return SyncInvoker<ListCommonPoolsRequest, ListCommonPoolsResponse>
     */
    public SyncInvoker<ListCommonPoolsRequest, ListCommonPoolsResponse> listCommonPoolsInvoker(
        ListCommonPoolsRequest request) {
        return new SyncInvoker<>(request, EipMeta.listCommonPools, hcClient);
    }

    /**
     * 查询带宽列表
     *
     * 查询带宽列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEipBandwidthsRequest 请求对象
     * @return ListEipBandwidthsResponse
     */
    public ListEipBandwidthsResponse listEipBandwidths(ListEipBandwidthsRequest request) {
        return hcClient.syncInvokeHttp(request, EipMeta.listEipBandwidths);
    }

    /**
     * 查询带宽列表
     *
     * 查询带宽列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEipBandwidthsRequest 请求对象
     * @return SyncInvoker<ListEipBandwidthsRequest, ListEipBandwidthsResponse>
     */
    public SyncInvoker<ListEipBandwidthsRequest, ListEipBandwidthsResponse> listEipBandwidthsInvoker(
        ListEipBandwidthsRequest request) {
        return new SyncInvoker<>(request, EipMeta.listEipBandwidths, hcClient);
    }

    /**
     * 查询公共池分组列表
     *
     * 查询公共池分组列表，包含名称和位置信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPublicBorderGroupsRequest 请求对象
     * @return ListPublicBorderGroupsResponse
     */
    public ListPublicBorderGroupsResponse listPublicBorderGroups(ListPublicBorderGroupsRequest request) {
        return hcClient.syncInvokeHttp(request, EipMeta.listPublicBorderGroups);
    }

    /**
     * 查询公共池分组列表
     *
     * 查询公共池分组列表，包含名称和位置信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPublicBorderGroupsRequest 请求对象
     * @return SyncInvoker<ListPublicBorderGroupsRequest, ListPublicBorderGroupsResponse>
     */
    public SyncInvoker<ListPublicBorderGroupsRequest, ListPublicBorderGroupsResponse> listPublicBorderGroupsInvoker(
        ListPublicBorderGroupsRequest request) {
        return new SyncInvoker<>(request, EipMeta.listPublicBorderGroups, hcClient);
    }

    /**
     * 查询公网IP池列表
     *
     * 全量查询公网IP池列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPublicipPoolRequest 请求对象
     * @return ListPublicipPoolResponse
     */
    public ListPublicipPoolResponse listPublicipPool(ListPublicipPoolRequest request) {
        return hcClient.syncInvokeHttp(request, EipMeta.listPublicipPool);
    }

    /**
     * 查询公网IP池列表
     *
     * 全量查询公网IP池列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPublicipPoolRequest 请求对象
     * @return SyncInvoker<ListPublicipPoolRequest, ListPublicipPoolResponse>
     */
    public SyncInvoker<ListPublicipPoolRequest, ListPublicipPoolResponse> listPublicipPoolInvoker(
        ListPublicipPoolRequest request) {
        return new SyncInvoker<>(request, EipMeta.listPublicipPool, hcClient);
    }

    /**
     * 查询指定租户下的共享带宽类型列表
     *
     * 查询指定租户下的共享带宽类型列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListShareBandwidthTypesRequest 请求对象
     * @return ListShareBandwidthTypesResponse
     */
    public ListShareBandwidthTypesResponse listShareBandwidthTypes(ListShareBandwidthTypesRequest request) {
        return hcClient.syncInvokeHttp(request, EipMeta.listShareBandwidthTypes);
    }

    /**
     * 查询指定租户下的共享带宽类型列表
     *
     * 查询指定租户下的共享带宽类型列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListShareBandwidthTypesRequest 请求对象
     * @return SyncInvoker<ListShareBandwidthTypesRequest, ListShareBandwidthTypesResponse>
     */
    public SyncInvoker<ListShareBandwidthTypesRequest, ListShareBandwidthTypesResponse> listShareBandwidthTypesInvoker(
        ListShareBandwidthTypesRequest request) {
        return new SyncInvoker<>(request, EipMeta.listShareBandwidthTypes, hcClient);
    }

    /**
     * 查询公网IP池详情
     *
     * 查询公网IP池详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPublicipPoolRequest 请求对象
     * @return ShowPublicipPoolResponse
     */
    public ShowPublicipPoolResponse showPublicipPool(ShowPublicipPoolRequest request) {
        return hcClient.syncInvokeHttp(request, EipMeta.showPublicipPool);
    }

    /**
     * 查询公网IP池详情
     *
     * 查询公网IP池详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPublicipPoolRequest 请求对象
     * @return SyncInvoker<ShowPublicipPoolRequest, ShowPublicipPoolResponse>
     */
    public SyncInvoker<ShowPublicipPoolRequest, ShowPublicipPoolResponse> showPublicipPoolInvoker(
        ShowPublicipPoolRequest request) {
        return new SyncInvoker<>(request, EipMeta.showPublicipPool, hcClient);
    }

    /**
     * 查询公网IP池类型
     *
     * 查询公网IP池类型。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPublicipPoolTypesRequest 请求对象
     * @return ShowPublicipPoolTypesResponse
     */
    public ShowPublicipPoolTypesResponse showPublicipPoolTypes(ShowPublicipPoolTypesRequest request) {
        return hcClient.syncInvokeHttp(request, EipMeta.showPublicipPoolTypes);
    }

    /**
     * 查询公网IP池类型
     *
     * 查询公网IP池类型。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPublicipPoolTypesRequest 请求对象
     * @return SyncInvoker<ShowPublicipPoolTypesRequest, ShowPublicipPoolTypesResponse>
     */
    public SyncInvoker<ShowPublicipPoolTypesRequest, ShowPublicipPoolTypesResponse> showPublicipPoolTypesInvoker(
        ShowPublicipPoolTypesRequest request) {
        return new SyncInvoker<>(request, EipMeta.showPublicipPoolTypes, hcClient);
    }

    /**
     * 查询GEIP与实例绑定关系的租户列表
     *
     * 查询GEIP与实例绑定关系的租户列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectGeipBindingsRequest 请求对象
     * @return ListProjectGeipBindingsResponse
     */
    public ListProjectGeipBindingsResponse listProjectGeipBindings(ListProjectGeipBindingsRequest request) {
        return hcClient.syncInvokeHttp(request, EipMeta.listProjectGeipBindings);
    }

    /**
     * 查询GEIP与实例绑定关系的租户列表
     *
     * 查询GEIP与实例绑定关系的租户列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectGeipBindingsRequest 请求对象
     * @return SyncInvoker<ListProjectGeipBindingsRequest, ListProjectGeipBindingsResponse>
     */
    public SyncInvoker<ListProjectGeipBindingsRequest, ListProjectGeipBindingsResponse> listProjectGeipBindingsInvoker(
        ListProjectGeipBindingsRequest request) {
        return new SyncInvoker<>(request, EipMeta.listProjectGeipBindings, hcClient);
    }

    /**
     * 创建虚拟igw
     *
     * 创建虚拟igw
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTenantVpcIgwRequest 请求对象
     * @return CreateTenantVpcIgwResponse
     */
    public CreateTenantVpcIgwResponse createTenantVpcIgw(CreateTenantVpcIgwRequest request) {
        return hcClient.syncInvokeHttp(request, EipMeta.createTenantVpcIgw);
    }

    /**
     * 创建虚拟igw
     *
     * 创建虚拟igw
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTenantVpcIgwRequest 请求对象
     * @return SyncInvoker<CreateTenantVpcIgwRequest, CreateTenantVpcIgwResponse>
     */
    public SyncInvoker<CreateTenantVpcIgwRequest, CreateTenantVpcIgwResponse> createTenantVpcIgwInvoker(
        CreateTenantVpcIgwRequest request) {
        return new SyncInvoker<>(request, EipMeta.createTenantVpcIgw, hcClient);
    }

    /**
     * 删除虚拟igw
     *
     * 删除虚拟igw
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTenantVpcIgwRequest 请求对象
     * @return DeleteTenantVpcIgwResponse
     */
    public DeleteTenantVpcIgwResponse deleteTenantVpcIgw(DeleteTenantVpcIgwRequest request) {
        return hcClient.syncInvokeHttp(request, EipMeta.deleteTenantVpcIgw);
    }

    /**
     * 删除虚拟igw
     *
     * 删除虚拟igw
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTenantVpcIgwRequest 请求对象
     * @return SyncInvoker<DeleteTenantVpcIgwRequest, DeleteTenantVpcIgwResponse>
     */
    public SyncInvoker<DeleteTenantVpcIgwRequest, DeleteTenantVpcIgwResponse> deleteTenantVpcIgwInvoker(
        DeleteTenantVpcIgwRequest request) {
        return new SyncInvoker<>(request, EipMeta.deleteTenantVpcIgw, hcClient);
    }

    /**
     * 查询指定租户下的虚拟igw列表
     *
     * 查询指定租户下的虚拟igw列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTenantVpcIgwsRequest 请求对象
     * @return ListTenantVpcIgwsResponse
     */
    public ListTenantVpcIgwsResponse listTenantVpcIgws(ListTenantVpcIgwsRequest request) {
        return hcClient.syncInvokeHttp(request, EipMeta.listTenantVpcIgws);
    }

    /**
     * 查询指定租户下的虚拟igw列表
     *
     * 查询指定租户下的虚拟igw列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTenantVpcIgwsRequest 请求对象
     * @return SyncInvoker<ListTenantVpcIgwsRequest, ListTenantVpcIgwsResponse>
     */
    public SyncInvoker<ListTenantVpcIgwsRequest, ListTenantVpcIgwsResponse> listTenantVpcIgwsInvoker(
        ListTenantVpcIgwsRequest request) {
        return new SyncInvoker<>(request, EipMeta.listTenantVpcIgws, hcClient);
    }

    /**
     * 查询虚拟igw详情
     *
     * 查询虚拟igw详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInternalVpcIgwRequest 请求对象
     * @return ShowInternalVpcIgwResponse
     */
    public ShowInternalVpcIgwResponse showInternalVpcIgw(ShowInternalVpcIgwRequest request) {
        return hcClient.syncInvokeHttp(request, EipMeta.showInternalVpcIgw);
    }

    /**
     * 查询虚拟igw详情
     *
     * 查询虚拟igw详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInternalVpcIgwRequest 请求对象
     * @return SyncInvoker<ShowInternalVpcIgwRequest, ShowInternalVpcIgwResponse>
     */
    public SyncInvoker<ShowInternalVpcIgwRequest, ShowInternalVpcIgwResponse> showInternalVpcIgwInvoker(
        ShowInternalVpcIgwRequest request) {
        return new SyncInvoker<>(request, EipMeta.showInternalVpcIgw, hcClient);
    }

    /**
     * 修改虚拟igw
     *
     * 修改虚拟igw
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTenantVpcIgwRequest 请求对象
     * @return UpdateTenantVpcIgwResponse
     */
    public UpdateTenantVpcIgwResponse updateTenantVpcIgw(UpdateTenantVpcIgwRequest request) {
        return hcClient.syncInvokeHttp(request, EipMeta.updateTenantVpcIgw);
    }

    /**
     * 修改虚拟igw
     *
     * 修改虚拟igw
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTenantVpcIgwRequest 请求对象
     * @return SyncInvoker<UpdateTenantVpcIgwRequest, UpdateTenantVpcIgwResponse>
     */
    public SyncInvoker<UpdateTenantVpcIgwRequest, UpdateTenantVpcIgwResponse> updateTenantVpcIgwInvoker(
        UpdateTenantVpcIgwRequest request) {
        return new SyncInvoker<>(request, EipMeta.updateTenantVpcIgw, hcClient);
    }

    /**
     * 绑定弹性公网IP
     *
     * 绑定弹性公网IP
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AssociatePublicipsRequest 请求对象
     * @return AssociatePublicipsResponse
     */
    public AssociatePublicipsResponse associatePublicips(AssociatePublicipsRequest request) {
        return hcClient.syncInvokeHttp(request, EipMeta.associatePublicips);
    }

    /**
     * 绑定弹性公网IP
     *
     * 绑定弹性公网IP
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AssociatePublicipsRequest 请求对象
     * @return SyncInvoker<AssociatePublicipsRequest, AssociatePublicipsResponse>
     */
    public SyncInvoker<AssociatePublicipsRequest, AssociatePublicipsResponse> associatePublicipsInvoker(
        AssociatePublicipsRequest request) {
        return new SyncInvoker<>(request, EipMeta.associatePublicips, hcClient);
    }

    /**
     * 共享带宽批量加入弹性公网IP
     *
     * 共享带宽批量加入弹性公网IP
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AttachBatchPublicIpRequest 请求对象
     * @return AttachBatchPublicIpResponse
     */
    public AttachBatchPublicIpResponse attachBatchPublicIp(AttachBatchPublicIpRequest request) {
        return hcClient.syncInvokeHttp(request, EipMeta.attachBatchPublicIp);
    }

    /**
     * 共享带宽批量加入弹性公网IP
     *
     * 共享带宽批量加入弹性公网IP
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AttachBatchPublicIpRequest 请求对象
     * @return SyncInvoker<AttachBatchPublicIpRequest, AttachBatchPublicIpResponse>
     */
    public SyncInvoker<AttachBatchPublicIpRequest, AttachBatchPublicIpResponse> attachBatchPublicIpInvoker(
        AttachBatchPublicIpRequest request) {
        return new SyncInvoker<>(request, EipMeta.attachBatchPublicIp, hcClient);
    }

    /**
     * 共享带宽加入弹性公网IP
     *
     * 共享带宽加入弹性公网IP
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AttachShareBandwidthRequest 请求对象
     * @return AttachShareBandwidthResponse
     */
    public AttachShareBandwidthResponse attachShareBandwidth(AttachShareBandwidthRequest request) {
        return hcClient.syncInvokeHttp(request, EipMeta.attachShareBandwidth);
    }

    /**
     * 共享带宽加入弹性公网IP
     *
     * 共享带宽加入弹性公网IP
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AttachShareBandwidthRequest 请求对象
     * @return SyncInvoker<AttachShareBandwidthRequest, AttachShareBandwidthResponse>
     */
    public SyncInvoker<AttachShareBandwidthRequest, AttachShareBandwidthResponse> attachShareBandwidthInvoker(
        AttachShareBandwidthRequest request) {
        return new SyncInvoker<>(request, EipMeta.attachShareBandwidth, hcClient);
    }

    /**
     * 查询弹性公网IP可用数
     *
     * IP池用于查询公网可用ip个数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CountEipAvailableResourcesRequest 请求对象
     * @return CountEipAvailableResourcesResponse
     */
    public CountEipAvailableResourcesResponse countEipAvailableResources(CountEipAvailableResourcesRequest request) {
        return hcClient.syncInvokeHttp(request, EipMeta.countEipAvailableResources);
    }

    /**
     * 查询弹性公网IP可用数
     *
     * IP池用于查询公网可用ip个数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CountEipAvailableResourcesRequest 请求对象
     * @return SyncInvoker<CountEipAvailableResourcesRequest, CountEipAvailableResourcesResponse>
     */
    public SyncInvoker<CountEipAvailableResourcesRequest, CountEipAvailableResourcesResponse> countEipAvailableResourcesInvoker(
        CountEipAvailableResourcesRequest request) {
        return new SyncInvoker<>(request, EipMeta.countEipAvailableResources, hcClient);
    }

    /**
     * 共享带宽批量移出弹性公网IP
     *
     * 共享带宽批量移出弹性公网IP
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DetachBatchPublicIpRequest 请求对象
     * @return DetachBatchPublicIpResponse
     */
    public DetachBatchPublicIpResponse detachBatchPublicIp(DetachBatchPublicIpRequest request) {
        return hcClient.syncInvokeHttp(request, EipMeta.detachBatchPublicIp);
    }

    /**
     * 共享带宽批量移出弹性公网IP
     *
     * 共享带宽批量移出弹性公网IP
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DetachBatchPublicIpRequest 请求对象
     * @return SyncInvoker<DetachBatchPublicIpRequest, DetachBatchPublicIpResponse>
     */
    public SyncInvoker<DetachBatchPublicIpRequest, DetachBatchPublicIpResponse> detachBatchPublicIpInvoker(
        DetachBatchPublicIpRequest request) {
        return new SyncInvoker<>(request, EipMeta.detachBatchPublicIp, hcClient);
    }

    /**
     * 共享带宽移出弹性公网IP
     *
     * 共享带宽移出弹性公网IP
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DetachShareBandwidthRequest 请求对象
     * @return DetachShareBandwidthResponse
     */
    public DetachShareBandwidthResponse detachShareBandwidth(DetachShareBandwidthRequest request) {
        return hcClient.syncInvokeHttp(request, EipMeta.detachShareBandwidth);
    }

    /**
     * 共享带宽移出弹性公网IP
     *
     * 共享带宽移出弹性公网IP
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DetachShareBandwidthRequest 请求对象
     * @return SyncInvoker<DetachShareBandwidthRequest, DetachShareBandwidthResponse>
     */
    public SyncInvoker<DetachShareBandwidthRequest, DetachShareBandwidthResponse> detachShareBandwidthInvoker(
        DetachShareBandwidthRequest request) {
        return new SyncInvoker<>(request, EipMeta.detachShareBandwidth, hcClient);
    }

    /**
     * 弹性公网IP关闭NAT64
     *
     * 弹性公网IP关闭NAT64
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisableNat64Request 请求对象
     * @return DisableNat64Response
     */
    public DisableNat64Response disableNat64(DisableNat64Request request) {
        return hcClient.syncInvokeHttp(request, EipMeta.disableNat64);
    }

    /**
     * 弹性公网IP关闭NAT64
     *
     * 弹性公网IP关闭NAT64
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisableNat64Request 请求对象
     * @return SyncInvoker<DisableNat64Request, DisableNat64Response>
     */
    public SyncInvoker<DisableNat64Request, DisableNat64Response> disableNat64Invoker(DisableNat64Request request) {
        return new SyncInvoker<>(request, EipMeta.disableNat64, hcClient);
    }

    /**
     * 解绑弹性公网IP
     *
     * 解绑弹性公网IP
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisassociatePublicipsRequest 请求对象
     * @return DisassociatePublicipsResponse
     */
    public DisassociatePublicipsResponse disassociatePublicips(DisassociatePublicipsRequest request) {
        return hcClient.syncInvokeHttp(request, EipMeta.disassociatePublicips);
    }

    /**
     * 解绑弹性公网IP
     *
     * 解绑弹性公网IP
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisassociatePublicipsRequest 请求对象
     * @return SyncInvoker<DisassociatePublicipsRequest, DisassociatePublicipsResponse>
     */
    public SyncInvoker<DisassociatePublicipsRequest, DisassociatePublicipsResponse> disassociatePublicipsInvoker(
        DisassociatePublicipsRequest request) {
        return new SyncInvoker<>(request, EipMeta.disassociatePublicips, hcClient);
    }

    /**
     * 弹性公网IP开启NAT64
     *
     * 弹性公网IP开启NAT64
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EnableNat64Request 请求对象
     * @return EnableNat64Response
     */
    public EnableNat64Response enableNat64(EnableNat64Request request) {
        return hcClient.syncInvokeHttp(request, EipMeta.enableNat64);
    }

    /**
     * 弹性公网IP开启NAT64
     *
     * 弹性公网IP开启NAT64
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EnableNat64Request 请求对象
     * @return SyncInvoker<EnableNat64Request, EnableNat64Response>
     */
    public SyncInvoker<EnableNat64Request, EnableNat64Response> enableNat64Invoker(EnableNat64Request request) {
        return new SyncInvoker<>(request, EipMeta.enableNat64, hcClient);
    }

    /**
     * 全量查询弹性公网IP列表
     *
     * 查询弹性公网IP列表信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPublicipsRequest 请求对象
     * @return ListPublicipsResponse
     */
    public ListPublicipsResponse listPublicips(ListPublicipsRequest request) {
        return hcClient.syncInvokeHttp(request, EipMeta.listPublicips);
    }

    /**
     * 全量查询弹性公网IP列表
     *
     * 查询弹性公网IP列表信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPublicipsRequest 请求对象
     * @return SyncInvoker<ListPublicipsRequest, ListPublicipsResponse>
     */
    public SyncInvoker<ListPublicipsRequest, ListPublicipsResponse> listPublicipsInvoker(ListPublicipsRequest request) {
        return new SyncInvoker<>(request, EipMeta.listPublicips, hcClient);
    }

    /**
     * 查询弹性公网IP详情
     *
     * 查询弹性公网IP详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPublicipRequest 请求对象
     * @return ShowPublicipResponse
     */
    public ShowPublicipResponse showPublicip(ShowPublicipRequest request) {
        return hcClient.syncInvokeHttp(request, EipMeta.showPublicip);
    }

    /**
     * 查询弹性公网IP详情
     *
     * 查询弹性公网IP详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPublicipRequest 请求对象
     * @return SyncInvoker<ShowPublicipRequest, ShowPublicipResponse>
     */
    public SyncInvoker<ShowPublicipRequest, ShowPublicipResponse> showPublicipInvoker(ShowPublicipRequest request) {
        return new SyncInvoker<>(request, EipMeta.showPublicip, hcClient);
    }

    /**
     * 更新弹性公网IP
     *
     * 更新弹性公网IP
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePublicipRequest 请求对象
     * @return UpdatePublicipResponse
     */
    public UpdatePublicipResponse updatePublicip(UpdatePublicipRequest request) {
        return hcClient.syncInvokeHttp(request, EipMeta.updatePublicip);
    }

    /**
     * 更新弹性公网IP
     *
     * 更新弹性公网IP
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePublicipRequest 请求对象
     * @return SyncInvoker<UpdatePublicipRequest, UpdatePublicipResponse>
     */
    public SyncInvoker<UpdatePublicipRequest, UpdatePublicipResponse> updatePublicipInvoker(
        UpdatePublicipRequest request) {
        return new SyncInvoker<>(request, EipMeta.updatePublicip, hcClient);
    }

}
