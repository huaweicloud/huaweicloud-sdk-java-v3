package com.huaweicloud.sdk.dc.v3;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.dc.v3.model.BatchCreateResourceTagsRequest;
import com.huaweicloud.sdk.dc.v3.model.BatchCreateResourceTagsResponse;
import com.huaweicloud.sdk.dc.v3.model.CreateHostedDirectConnectRequest;
import com.huaweicloud.sdk.dc.v3.model.CreateHostedDirectConnectResponse;
import com.huaweicloud.sdk.dc.v3.model.CreateResourceTagRequest;
import com.huaweicloud.sdk.dc.v3.model.CreateResourceTagResponse;
import com.huaweicloud.sdk.dc.v3.model.CreateVifPeerRequest;
import com.huaweicloud.sdk.dc.v3.model.CreateVifPeerResponse;
import com.huaweicloud.sdk.dc.v3.model.CreateVirtualGatewayRequest;
import com.huaweicloud.sdk.dc.v3.model.CreateVirtualGatewayResponse;
import com.huaweicloud.sdk.dc.v3.model.CreateVirtualInterfaceRequest;
import com.huaweicloud.sdk.dc.v3.model.CreateVirtualInterfaceResponse;
import com.huaweicloud.sdk.dc.v3.model.DeleteDirectConnectRequest;
import com.huaweicloud.sdk.dc.v3.model.DeleteDirectConnectResponse;
import com.huaweicloud.sdk.dc.v3.model.DeleteHostedDirectConnectRequest;
import com.huaweicloud.sdk.dc.v3.model.DeleteHostedDirectConnectResponse;
import com.huaweicloud.sdk.dc.v3.model.DeleteResourceTagRequest;
import com.huaweicloud.sdk.dc.v3.model.DeleteResourceTagResponse;
import com.huaweicloud.sdk.dc.v3.model.DeleteVifPeerRequest;
import com.huaweicloud.sdk.dc.v3.model.DeleteVifPeerResponse;
import com.huaweicloud.sdk.dc.v3.model.DeleteVirtualGatewayRequest;
import com.huaweicloud.sdk.dc.v3.model.DeleteVirtualGatewayResponse;
import com.huaweicloud.sdk.dc.v3.model.DeleteVirtualInterfaceRequest;
import com.huaweicloud.sdk.dc.v3.model.DeleteVirtualInterfaceResponse;
import com.huaweicloud.sdk.dc.v3.model.ListDirectConnectsRequest;
import com.huaweicloud.sdk.dc.v3.model.ListDirectConnectsResponse;
import com.huaweicloud.sdk.dc.v3.model.ListHostedDirectConnectsRequest;
import com.huaweicloud.sdk.dc.v3.model.ListHostedDirectConnectsResponse;
import com.huaweicloud.sdk.dc.v3.model.ListProjectTagsRequest;
import com.huaweicloud.sdk.dc.v3.model.ListProjectTagsResponse;
import com.huaweicloud.sdk.dc.v3.model.ListSwitchoverTestRecordsRequest;
import com.huaweicloud.sdk.dc.v3.model.ListSwitchoverTestRecordsResponse;
import com.huaweicloud.sdk.dc.v3.model.ListTagResourceInstancesRequest;
import com.huaweicloud.sdk.dc.v3.model.ListTagResourceInstancesResponse;
import com.huaweicloud.sdk.dc.v3.model.ListVirtualGatewaysRequest;
import com.huaweicloud.sdk.dc.v3.model.ListVirtualGatewaysResponse;
import com.huaweicloud.sdk.dc.v3.model.ListVirtualInterfacesRequest;
import com.huaweicloud.sdk.dc.v3.model.ListVirtualInterfacesResponse;
import com.huaweicloud.sdk.dc.v3.model.ShowDirectConnectRequest;
import com.huaweicloud.sdk.dc.v3.model.ShowDirectConnectResponse;
import com.huaweicloud.sdk.dc.v3.model.ShowHostedDirectConnectRequest;
import com.huaweicloud.sdk.dc.v3.model.ShowHostedDirectConnectResponse;
import com.huaweicloud.sdk.dc.v3.model.ShowQuotasRequest;
import com.huaweicloud.sdk.dc.v3.model.ShowQuotasResponse;
import com.huaweicloud.sdk.dc.v3.model.ShowResourceTagRequest;
import com.huaweicloud.sdk.dc.v3.model.ShowResourceTagResponse;
import com.huaweicloud.sdk.dc.v3.model.ShowVirtualGatewayRequest;
import com.huaweicloud.sdk.dc.v3.model.ShowVirtualGatewayResponse;
import com.huaweicloud.sdk.dc.v3.model.ShowVirtualInterfaceRequest;
import com.huaweicloud.sdk.dc.v3.model.ShowVirtualInterfaceResponse;
import com.huaweicloud.sdk.dc.v3.model.SwitchoverTestRequest;
import com.huaweicloud.sdk.dc.v3.model.SwitchoverTestResponse;
import com.huaweicloud.sdk.dc.v3.model.UpdateDirectConnectRequest;
import com.huaweicloud.sdk.dc.v3.model.UpdateDirectConnectResponse;
import com.huaweicloud.sdk.dc.v3.model.UpdateHostedDirectConnectRequest;
import com.huaweicloud.sdk.dc.v3.model.UpdateHostedDirectConnectResponse;
import com.huaweicloud.sdk.dc.v3.model.UpdateVifPeerRequest;
import com.huaweicloud.sdk.dc.v3.model.UpdateVifPeerResponse;
import com.huaweicloud.sdk.dc.v3.model.UpdateVirtualGatewayRequest;
import com.huaweicloud.sdk.dc.v3.model.UpdateVirtualGatewayResponse;
import com.huaweicloud.sdk.dc.v3.model.UpdateVirtualInterfaceRequest;
import com.huaweicloud.sdk.dc.v3.model.UpdateVirtualInterfaceResponse;

public class DcClient {

    protected HcClient hcClient;

    public DcClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<DcClient> newBuilder() {
        ClientBuilder<DcClient> clientBuilder = new ClientBuilder<>(DcClient::new);
        return clientBuilder;
    }

    /**
     * 创建托管专线连接
     *
     * 用于合作伙伴用户最终租户创建托管专线
     * 创建者必须拥有合作伙伴资质，并且已经构建好运营(hosting)专线
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateHostedDirectConnectRequest 请求对象
     * @return CreateHostedDirectConnectResponse
     */
    public CreateHostedDirectConnectResponse createHostedDirectConnect(CreateHostedDirectConnectRequest request) {
        return hcClient.syncInvokeHttp(request, DcMeta.createHostedDirectConnect);
    }

    /**
     * 创建托管专线连接
     *
     * 用于合作伙伴用户最终租户创建托管专线
     * 创建者必须拥有合作伙伴资质，并且已经构建好运营(hosting)专线
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateHostedDirectConnectRequest 请求对象
     * @return SyncInvoker<CreateHostedDirectConnectRequest, CreateHostedDirectConnectResponse>
     */
    public SyncInvoker<CreateHostedDirectConnectRequest, CreateHostedDirectConnectResponse> createHostedDirectConnectInvoker(
        CreateHostedDirectConnectRequest request) {
        return new SyncInvoker<>(request, DcMeta.createHostedDirectConnect, hcClient);
    }

    /**
     * 删除物理连接
     *
     * 删除物理连接，本接口只适用于按需计费物理专线，对于包周期购买的专线通过订单退订的方式删除物理连接
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDirectConnectRequest 请求对象
     * @return DeleteDirectConnectResponse
     */
    public DeleteDirectConnectResponse deleteDirectConnect(DeleteDirectConnectRequest request) {
        return hcClient.syncInvokeHttp(request, DcMeta.deleteDirectConnect);
    }

    /**
     * 删除物理连接
     *
     * 删除物理连接，本接口只适用于按需计费物理专线，对于包周期购买的专线通过订单退订的方式删除物理连接
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDirectConnectRequest 请求对象
     * @return SyncInvoker<DeleteDirectConnectRequest, DeleteDirectConnectResponse>
     */
    public SyncInvoker<DeleteDirectConnectRequest, DeleteDirectConnectResponse> deleteDirectConnectInvoker(
        DeleteDirectConnectRequest request) {
        return new SyncInvoker<>(request, DcMeta.deleteDirectConnect, hcClient);
    }

    /**
     * 删除托管专线连接
     *
     * 合作伙伴删除托管专线
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteHostedDirectConnectRequest 请求对象
     * @return DeleteHostedDirectConnectResponse
     */
    public DeleteHostedDirectConnectResponse deleteHostedDirectConnect(DeleteHostedDirectConnectRequest request) {
        return hcClient.syncInvokeHttp(request, DcMeta.deleteHostedDirectConnect);
    }

    /**
     * 删除托管专线连接
     *
     * 合作伙伴删除托管专线
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteHostedDirectConnectRequest 请求对象
     * @return SyncInvoker<DeleteHostedDirectConnectRequest, DeleteHostedDirectConnectResponse>
     */
    public SyncInvoker<DeleteHostedDirectConnectRequest, DeleteHostedDirectConnectResponse> deleteHostedDirectConnectInvoker(
        DeleteHostedDirectConnectRequest request) {
        return new SyncInvoker<>(request, DcMeta.deleteHostedDirectConnect, hcClient);
    }

    /**
     * 查询物理连接列表
     *
     * 查询租户创建的所有的direct connect对象.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDirectConnectsRequest 请求对象
     * @return ListDirectConnectsResponse
     */
    public ListDirectConnectsResponse listDirectConnects(ListDirectConnectsRequest request) {
        return hcClient.syncInvokeHttp(request, DcMeta.listDirectConnects);
    }

    /**
     * 查询物理连接列表
     *
     * 查询租户创建的所有的direct connect对象.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDirectConnectsRequest 请求对象
     * @return SyncInvoker<ListDirectConnectsRequest, ListDirectConnectsResponse>
     */
    public SyncInvoker<ListDirectConnectsRequest, ListDirectConnectsResponse> listDirectConnectsInvoker(
        ListDirectConnectsRequest request) {
        return new SyncInvoker<>(request, DcMeta.listDirectConnects, hcClient);
    }

    /**
     * 查询租户的托管专线列表
     *
     * 查询合作伙伴创建的托管专线连接列表.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHostedDirectConnectsRequest 请求对象
     * @return ListHostedDirectConnectsResponse
     */
    public ListHostedDirectConnectsResponse listHostedDirectConnects(ListHostedDirectConnectsRequest request) {
        return hcClient.syncInvokeHttp(request, DcMeta.listHostedDirectConnects);
    }

    /**
     * 查询租户的托管专线列表
     *
     * 查询合作伙伴创建的托管专线连接列表.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHostedDirectConnectsRequest 请求对象
     * @return SyncInvoker<ListHostedDirectConnectsRequest, ListHostedDirectConnectsResponse>
     */
    public SyncInvoker<ListHostedDirectConnectsRequest, ListHostedDirectConnectsResponse> listHostedDirectConnectsInvoker(
        ListHostedDirectConnectsRequest request) {
        return new SyncInvoker<>(request, DcMeta.listHostedDirectConnects, hcClient);
    }

    /**
     * 查询物理连接详情
     *
     * 查询物理连接详细信息.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDirectConnectRequest 请求对象
     * @return ShowDirectConnectResponse
     */
    public ShowDirectConnectResponse showDirectConnect(ShowDirectConnectRequest request) {
        return hcClient.syncInvokeHttp(request, DcMeta.showDirectConnect);
    }

    /**
     * 查询物理连接详情
     *
     * 查询物理连接详细信息.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDirectConnectRequest 请求对象
     * @return SyncInvoker<ShowDirectConnectRequest, ShowDirectConnectResponse>
     */
    public SyncInvoker<ShowDirectConnectRequest, ShowDirectConnectResponse> showDirectConnectInvoker(
        ShowDirectConnectRequest request) {
        return new SyncInvoker<>(request, DcMeta.showDirectConnect, hcClient);
    }

    /**
     * 查询租户的托管专线详情
     *
     * 查询合法作伙伴的Hosted专线类型.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHostedDirectConnectRequest 请求对象
     * @return ShowHostedDirectConnectResponse
     */
    public ShowHostedDirectConnectResponse showHostedDirectConnect(ShowHostedDirectConnectRequest request) {
        return hcClient.syncInvokeHttp(request, DcMeta.showHostedDirectConnect);
    }

    /**
     * 查询租户的托管专线详情
     *
     * 查询合法作伙伴的Hosted专线类型.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHostedDirectConnectRequest 请求对象
     * @return SyncInvoker<ShowHostedDirectConnectRequest, ShowHostedDirectConnectResponse>
     */
    public SyncInvoker<ShowHostedDirectConnectRequest, ShowHostedDirectConnectResponse> showHostedDirectConnectInvoker(
        ShowHostedDirectConnectRequest request) {
        return new SyncInvoker<>(request, DcMeta.showHostedDirectConnect, hcClient);
    }

    /**
     * 更新物理连接信息
     *
     * 更新物理连接信息，包括名字,描述等信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDirectConnectRequest 请求对象
     * @return UpdateDirectConnectResponse
     */
    public UpdateDirectConnectResponse updateDirectConnect(UpdateDirectConnectRequest request) {
        return hcClient.syncInvokeHttp(request, DcMeta.updateDirectConnect);
    }

    /**
     * 更新物理连接信息
     *
     * 更新物理连接信息，包括名字,描述等信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDirectConnectRequest 请求对象
     * @return SyncInvoker<UpdateDirectConnectRequest, UpdateDirectConnectResponse>
     */
    public SyncInvoker<UpdateDirectConnectRequest, UpdateDirectConnectResponse> updateDirectConnectInvoker(
        UpdateDirectConnectRequest request) {
        return new SyncInvoker<>(request, DcMeta.updateDirectConnect, hcClient);
    }

    /**
     * 更新托管专线连接
     *
     * 合作伙伴更新托管专线.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateHostedDirectConnectRequest 请求对象
     * @return UpdateHostedDirectConnectResponse
     */
    public UpdateHostedDirectConnectResponse updateHostedDirectConnect(UpdateHostedDirectConnectRequest request) {
        return hcClient.syncInvokeHttp(request, DcMeta.updateHostedDirectConnect);
    }

    /**
     * 更新托管专线连接
     *
     * 合作伙伴更新托管专线.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateHostedDirectConnectRequest 请求对象
     * @return SyncInvoker<UpdateHostedDirectConnectRequest, UpdateHostedDirectConnectResponse>
     */
    public SyncInvoker<UpdateHostedDirectConnectRequest, UpdateHostedDirectConnectResponse> updateHostedDirectConnectInvoker(
        UpdateHostedDirectConnectRequest request) {
        return new SyncInvoker<>(request, DcMeta.updateHostedDirectConnect, hcClient);
    }

    /**
     * 查询配额
     *
     * 查询租户各类资源的使用情况，如Directconnect的使用量，虚拟接口的使用量等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowQuotasRequest 请求对象
     * @return ShowQuotasResponse
     */
    public ShowQuotasResponse showQuotas(ShowQuotasRequest request) {
        return hcClient.syncInvokeHttp(request, DcMeta.showQuotas);
    }

    /**
     * 查询配额
     *
     * 查询租户各类资源的使用情况，如Directconnect的使用量，虚拟接口的使用量等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowQuotasRequest 请求对象
     * @return SyncInvoker<ShowQuotasRequest, ShowQuotasResponse>
     */
    public SyncInvoker<ShowQuotasRequest, ShowQuotasResponse> showQuotasInvoker(ShowQuotasRequest request) {
        return new SyncInvoker<>(request, DcMeta.showQuotas, hcClient);
    }

    /**
     * 批量添加删除资源标签
     *
     * - 为指定实例批量添加或删除标签
     * - 标签管理服务需要使用该接口批量管理实例的标签。
     * - 一个资源上最多有10个标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateResourceTagsRequest 请求对象
     * @return BatchCreateResourceTagsResponse
     */
    public BatchCreateResourceTagsResponse batchCreateResourceTags(BatchCreateResourceTagsRequest request) {
        return hcClient.syncInvokeHttp(request, DcMeta.batchCreateResourceTags);
    }

    /**
     * 批量添加删除资源标签
     *
     * - 为指定实例批量添加或删除标签
     * - 标签管理服务需要使用该接口批量管理实例的标签。
     * - 一个资源上最多有10个标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateResourceTagsRequest 请求对象
     * @return SyncInvoker<BatchCreateResourceTagsRequest, BatchCreateResourceTagsResponse>
     */
    public SyncInvoker<BatchCreateResourceTagsRequest, BatchCreateResourceTagsResponse> batchCreateResourceTagsInvoker(
        BatchCreateResourceTagsRequest request) {
        return new SyncInvoker<>(request, DcMeta.batchCreateResourceTags, hcClient);
    }

    /**
     * 添加资源标签
     *
     * - 一个资源上最多有10个标签。
     * - 此接口为幂等接口：
     * - 创建时，如果创建的标签已经存在（key相同），则覆盖。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateResourceTagRequest 请求对象
     * @return CreateResourceTagResponse
     */
    public CreateResourceTagResponse createResourceTag(CreateResourceTagRequest request) {
        return hcClient.syncInvokeHttp(request, DcMeta.createResourceTag);
    }

    /**
     * 添加资源标签
     *
     * - 一个资源上最多有10个标签。
     * - 此接口为幂等接口：
     * - 创建时，如果创建的标签已经存在（key相同），则覆盖。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateResourceTagRequest 请求对象
     * @return SyncInvoker<CreateResourceTagRequest, CreateResourceTagResponse>
     */
    public SyncInvoker<CreateResourceTagRequest, CreateResourceTagResponse> createResourceTagInvoker(
        CreateResourceTagRequest request) {
        return new SyncInvoker<>(request, DcMeta.createResourceTag, hcClient);
    }

    /**
     * 删除资源标签
     *
     * 删除时,不对标签字符集做校验，调用接口前必须要做encodeURI，服务端需要对接口uri做decodeURI。删除的key不存在报404，Key不能为空或者空字符串。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteResourceTagRequest 请求对象
     * @return DeleteResourceTagResponse
     */
    public DeleteResourceTagResponse deleteResourceTag(DeleteResourceTagRequest request) {
        return hcClient.syncInvokeHttp(request, DcMeta.deleteResourceTag);
    }

    /**
     * 删除资源标签
     *
     * 删除时,不对标签字符集做校验，调用接口前必须要做encodeURI，服务端需要对接口uri做decodeURI。删除的key不存在报404，Key不能为空或者空字符串。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteResourceTagRequest 请求对象
     * @return SyncInvoker<DeleteResourceTagRequest, DeleteResourceTagResponse>
     */
    public SyncInvoker<DeleteResourceTagRequest, DeleteResourceTagResponse> deleteResourceTagInvoker(
        DeleteResourceTagRequest request) {
        return new SyncInvoker<>(request, DcMeta.deleteResourceTag, hcClient);
    }

    /**
     * 查询项目标签
     *
     * - 查询租户在指定Project中实例类型的所有资源标签集合。
     * - 标签管理服务需要能够列出当前租户全部已使用的资源标签集合，为各服务打资源标签和过滤实例时提供标签联想功能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectTagsRequest 请求对象
     * @return ListProjectTagsResponse
     */
    public ListProjectTagsResponse listProjectTags(ListProjectTagsRequest request) {
        return hcClient.syncInvokeHttp(request, DcMeta.listProjectTags);
    }

    /**
     * 查询项目标签
     *
     * - 查询租户在指定Project中实例类型的所有资源标签集合。
     * - 标签管理服务需要能够列出当前租户全部已使用的资源标签集合，为各服务打资源标签和过滤实例时提供标签联想功能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectTagsRequest 请求对象
     * @return SyncInvoker<ListProjectTagsRequest, ListProjectTagsResponse>
     */
    public SyncInvoker<ListProjectTagsRequest, ListProjectTagsResponse> listProjectTagsInvoker(
        ListProjectTagsRequest request) {
        return new SyncInvoker<>(request, DcMeta.listProjectTags, hcClient);
    }

    /**
     * 通过标签查询资源实例
     *
     * 通过标签查询资源实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTagResourceInstancesRequest 请求对象
     * @return ListTagResourceInstancesResponse
     */
    public ListTagResourceInstancesResponse listTagResourceInstances(ListTagResourceInstancesRequest request) {
        return hcClient.syncInvokeHttp(request, DcMeta.listTagResourceInstances);
    }

    /**
     * 通过标签查询资源实例
     *
     * 通过标签查询资源实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTagResourceInstancesRequest 请求对象
     * @return SyncInvoker<ListTagResourceInstancesRequest, ListTagResourceInstancesResponse>
     */
    public SyncInvoker<ListTagResourceInstancesRequest, ListTagResourceInstancesResponse> listTagResourceInstancesInvoker(
        ListTagResourceInstancesRequest request) {
        return new SyncInvoker<>(request, DcMeta.listTagResourceInstances, hcClient);
    }

    /**
     * 查询资源标签
     *
     * 查询资源标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowResourceTagRequest 请求对象
     * @return ShowResourceTagResponse
     */
    public ShowResourceTagResponse showResourceTag(ShowResourceTagRequest request) {
        return hcClient.syncInvokeHttp(request, DcMeta.showResourceTag);
    }

    /**
     * 查询资源标签
     *
     * 查询资源标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowResourceTagRequest 请求对象
     * @return SyncInvoker<ShowResourceTagRequest, ShowResourceTagResponse>
     */
    public SyncInvoker<ShowResourceTagRequest, ShowResourceTagResponse> showResourceTagInvoker(
        ShowResourceTagRequest request) {
        return new SyncInvoker<>(request, DcMeta.showResourceTag, hcClient);
    }

    /**
     * 创建虚拟网关
     *
     * 创建虚拟网关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateVirtualGatewayRequest 请求对象
     * @return CreateVirtualGatewayResponse
     */
    public CreateVirtualGatewayResponse createVirtualGateway(CreateVirtualGatewayRequest request) {
        return hcClient.syncInvokeHttp(request, DcMeta.createVirtualGateway);
    }

    /**
     * 创建虚拟网关
     *
     * 创建虚拟网关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateVirtualGatewayRequest 请求对象
     * @return SyncInvoker<CreateVirtualGatewayRequest, CreateVirtualGatewayResponse>
     */
    public SyncInvoker<CreateVirtualGatewayRequest, CreateVirtualGatewayResponse> createVirtualGatewayInvoker(
        CreateVirtualGatewayRequest request) {
        return new SyncInvoker<>(request, DcMeta.createVirtualGateway, hcClient);
    }

    /**
     * 删除虚拟网关
     *
     * 删除指定的虚拟网关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteVirtualGatewayRequest 请求对象
     * @return DeleteVirtualGatewayResponse
     */
    public DeleteVirtualGatewayResponse deleteVirtualGateway(DeleteVirtualGatewayRequest request) {
        return hcClient.syncInvokeHttp(request, DcMeta.deleteVirtualGateway);
    }

    /**
     * 删除虚拟网关
     *
     * 删除指定的虚拟网关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteVirtualGatewayRequest 请求对象
     * @return SyncInvoker<DeleteVirtualGatewayRequest, DeleteVirtualGatewayResponse>
     */
    public SyncInvoker<DeleteVirtualGatewayRequest, DeleteVirtualGatewayResponse> deleteVirtualGatewayInvoker(
        DeleteVirtualGatewayRequest request) {
        return new SyncInvoker<>(request, DcMeta.deleteVirtualGateway, hcClient);
    }

    /**
     * 查询虚拟网关列表
     *
     * 查询虚拟网关列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVirtualGatewaysRequest 请求对象
     * @return ListVirtualGatewaysResponse
     */
    public ListVirtualGatewaysResponse listVirtualGateways(ListVirtualGatewaysRequest request) {
        return hcClient.syncInvokeHttp(request, DcMeta.listVirtualGateways);
    }

    /**
     * 查询虚拟网关列表
     *
     * 查询虚拟网关列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVirtualGatewaysRequest 请求对象
     * @return SyncInvoker<ListVirtualGatewaysRequest, ListVirtualGatewaysResponse>
     */
    public SyncInvoker<ListVirtualGatewaysRequest, ListVirtualGatewaysResponse> listVirtualGatewaysInvoker(
        ListVirtualGatewaysRequest request) {
        return new SyncInvoker<>(request, DcMeta.listVirtualGateways, hcClient);
    }

    /**
     * 查询虚拟网关详情
     *
     * 查询指定虚拟网关的详细信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowVirtualGatewayRequest 请求对象
     * @return ShowVirtualGatewayResponse
     */
    public ShowVirtualGatewayResponse showVirtualGateway(ShowVirtualGatewayRequest request) {
        return hcClient.syncInvokeHttp(request, DcMeta.showVirtualGateway);
    }

    /**
     * 查询虚拟网关详情
     *
     * 查询指定虚拟网关的详细信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowVirtualGatewayRequest 请求对象
     * @return SyncInvoker<ShowVirtualGatewayRequest, ShowVirtualGatewayResponse>
     */
    public SyncInvoker<ShowVirtualGatewayRequest, ShowVirtualGatewayResponse> showVirtualGatewayInvoker(
        ShowVirtualGatewayRequest request) {
        return new SyncInvoker<>(request, DcMeta.showVirtualGateway, hcClient);
    }

    /**
     * 更新虚拟网关信息
     *
     * 更新虚拟网关的信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateVirtualGatewayRequest 请求对象
     * @return UpdateVirtualGatewayResponse
     */
    public UpdateVirtualGatewayResponse updateVirtualGateway(UpdateVirtualGatewayRequest request) {
        return hcClient.syncInvokeHttp(request, DcMeta.updateVirtualGateway);
    }

    /**
     * 更新虚拟网关信息
     *
     * 更新虚拟网关的信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateVirtualGatewayRequest 请求对象
     * @return SyncInvoker<UpdateVirtualGatewayRequest, UpdateVirtualGatewayResponse>
     */
    public SyncInvoker<UpdateVirtualGatewayRequest, UpdateVirtualGatewayResponse> updateVirtualGatewayInvoker(
        UpdateVirtualGatewayRequest request) {
        return new SyncInvoker<>(request, DcMeta.updateVirtualGateway, hcClient);
    }

    /**
     * 创建虚拟接口对等体
     *
     * 每个虚拟接口可支持两个对等体，IPv4和IPv6对等体，在创建虚拟接口时默认创建IPv4对等体， 本接口一般用于增加ipv6对等体。创建虚拟接口对接体之后，可以通过虚拟接口查询配置结果 本接口只在支持Ipv6的区域开放，如需要使用请联系客服
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateVifPeerRequest 请求对象
     * @return CreateVifPeerResponse
     */
    public CreateVifPeerResponse createVifPeer(CreateVifPeerRequest request) {
        return hcClient.syncInvokeHttp(request, DcMeta.createVifPeer);
    }

    /**
     * 创建虚拟接口对等体
     *
     * 每个虚拟接口可支持两个对等体，IPv4和IPv6对等体，在创建虚拟接口时默认创建IPv4对等体， 本接口一般用于增加ipv6对等体。创建虚拟接口对接体之后，可以通过虚拟接口查询配置结果 本接口只在支持Ipv6的区域开放，如需要使用请联系客服
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateVifPeerRequest 请求对象
     * @return SyncInvoker<CreateVifPeerRequest, CreateVifPeerResponse>
     */
    public SyncInvoker<CreateVifPeerRequest, CreateVifPeerResponse> createVifPeerInvoker(CreateVifPeerRequest request) {
        return new SyncInvoker<>(request, DcMeta.createVifPeer, hcClient);
    }

    /**
     * 创建虚拟接口
     *
     * 虚拟接口配置物理专线上与客户互联的IP和路由等相关信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateVirtualInterfaceRequest 请求对象
     * @return CreateVirtualInterfaceResponse
     */
    public CreateVirtualInterfaceResponse createVirtualInterface(CreateVirtualInterfaceRequest request) {
        return hcClient.syncInvokeHttp(request, DcMeta.createVirtualInterface);
    }

    /**
     * 创建虚拟接口
     *
     * 虚拟接口配置物理专线上与客户互联的IP和路由等相关信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateVirtualInterfaceRequest 请求对象
     * @return SyncInvoker<CreateVirtualInterfaceRequest, CreateVirtualInterfaceResponse>
     */
    public SyncInvoker<CreateVirtualInterfaceRequest, CreateVirtualInterfaceResponse> createVirtualInterfaceInvoker(
        CreateVirtualInterfaceRequest request) {
        return new SyncInvoker<>(request, DcMeta.createVirtualInterface, hcClient);
    }

    /**
     * 删除虚拟接口对应的对等体
     *
     * 删除虚拟接口对等体信息,虚拟接口到少要含一个对等体,最后一个对等体不能删除 本接口只在支持Ipv6的区域开放，如需要使用请联系客服
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteVifPeerRequest 请求对象
     * @return DeleteVifPeerResponse
     */
    public DeleteVifPeerResponse deleteVifPeer(DeleteVifPeerRequest request) {
        return hcClient.syncInvokeHttp(request, DcMeta.deleteVifPeer);
    }

    /**
     * 删除虚拟接口对应的对等体
     *
     * 删除虚拟接口对等体信息,虚拟接口到少要含一个对等体,最后一个对等体不能删除 本接口只在支持Ipv6的区域开放，如需要使用请联系客服
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteVifPeerRequest 请求对象
     * @return SyncInvoker<DeleteVifPeerRequest, DeleteVifPeerResponse>
     */
    public SyncInvoker<DeleteVifPeerRequest, DeleteVifPeerResponse> deleteVifPeerInvoker(DeleteVifPeerRequest request) {
        return new SyncInvoker<>(request, DcMeta.deleteVifPeer, hcClient);
    }

    /**
     * 删除虚拟接口
     *
     * 删除虚拟接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteVirtualInterfaceRequest 请求对象
     * @return DeleteVirtualInterfaceResponse
     */
    public DeleteVirtualInterfaceResponse deleteVirtualInterface(DeleteVirtualInterfaceRequest request) {
        return hcClient.syncInvokeHttp(request, DcMeta.deleteVirtualInterface);
    }

    /**
     * 删除虚拟接口
     *
     * 删除虚拟接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteVirtualInterfaceRequest 请求对象
     * @return SyncInvoker<DeleteVirtualInterfaceRequest, DeleteVirtualInterfaceResponse>
     */
    public SyncInvoker<DeleteVirtualInterfaceRequest, DeleteVirtualInterfaceResponse> deleteVirtualInterfaceInvoker(
        DeleteVirtualInterfaceRequest request) {
        return new SyncInvoker<>(request, DcMeta.deleteVirtualInterface, hcClient);
    }

    /**
     * 查询虚拟接口倒换测试记录列表
     *
     * 查询倒换测试记录列表，只展示operate_status为COMPELTE的记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSwitchoverTestRecordsRequest 请求对象
     * @return ListSwitchoverTestRecordsResponse
     */
    public ListSwitchoverTestRecordsResponse listSwitchoverTestRecords(ListSwitchoverTestRecordsRequest request) {
        return hcClient.syncInvokeHttp(request, DcMeta.listSwitchoverTestRecords);
    }

    /**
     * 查询虚拟接口倒换测试记录列表
     *
     * 查询倒换测试记录列表，只展示operate_status为COMPELTE的记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSwitchoverTestRecordsRequest 请求对象
     * @return SyncInvoker<ListSwitchoverTestRecordsRequest, ListSwitchoverTestRecordsResponse>
     */
    public SyncInvoker<ListSwitchoverTestRecordsRequest, ListSwitchoverTestRecordsResponse> listSwitchoverTestRecordsInvoker(
        ListSwitchoverTestRecordsRequest request) {
        return new SyncInvoker<>(request, DcMeta.listSwitchoverTestRecords, hcClient);
    }

    /**
     * 查询虚拟接口列表
     *
     * 查询租户所有的虚拟接口列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVirtualInterfacesRequest 请求对象
     * @return ListVirtualInterfacesResponse
     */
    public ListVirtualInterfacesResponse listVirtualInterfaces(ListVirtualInterfacesRequest request) {
        return hcClient.syncInvokeHttp(request, DcMeta.listVirtualInterfaces);
    }

    /**
     * 查询虚拟接口列表
     *
     * 查询租户所有的虚拟接口列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVirtualInterfacesRequest 请求对象
     * @return SyncInvoker<ListVirtualInterfacesRequest, ListVirtualInterfacesResponse>
     */
    public SyncInvoker<ListVirtualInterfacesRequest, ListVirtualInterfacesResponse> listVirtualInterfacesInvoker(
        ListVirtualInterfacesRequest request) {
        return new SyncInvoker<>(request, DcMeta.listVirtualInterfaces, hcClient);
    }

    /**
     * 查询虚拟接口详情
     *
     * 查询虚拟接口详细信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowVirtualInterfaceRequest 请求对象
     * @return ShowVirtualInterfaceResponse
     */
    public ShowVirtualInterfaceResponse showVirtualInterface(ShowVirtualInterfaceRequest request) {
        return hcClient.syncInvokeHttp(request, DcMeta.showVirtualInterface);
    }

    /**
     * 查询虚拟接口详情
     *
     * 查询虚拟接口详细信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowVirtualInterfaceRequest 请求对象
     * @return SyncInvoker<ShowVirtualInterfaceRequest, ShowVirtualInterfaceResponse>
     */
    public SyncInvoker<ShowVirtualInterfaceRequest, ShowVirtualInterfaceResponse> showVirtualInterfaceInvoker(
        ShowVirtualInterfaceRequest request) {
        return new SyncInvoker<>(request, DcMeta.showVirtualInterface, hcClient);
    }

    /**
     * 执行虚拟接口倒换测试
     *
     * 客户双专线接入，需要支持双线自动倒换，方便进行功能测试。 虚拟接口进行倒换测试会导致接口关闭，业务流量中断。 对于虚拟接口，支持“关闭接口”和“开放接口”两种操作。 1、关闭接口：下发shutdown命令，关闭接口； 2、开放接口：下发undo_shutdown命令，使能接口。 倒换测试选择shutdown时，虚拟接口的状态为ADMIN_SHUTDOWN，此状态不允许虚拟接口的其他操作。 倒换测试选择undo_shutdown时，虚拟接口的状态为ACTIVE。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchoverTestRequest 请求对象
     * @return SwitchoverTestResponse
     */
    public SwitchoverTestResponse switchoverTest(SwitchoverTestRequest request) {
        return hcClient.syncInvokeHttp(request, DcMeta.switchoverTest);
    }

    /**
     * 执行虚拟接口倒换测试
     *
     * 客户双专线接入，需要支持双线自动倒换，方便进行功能测试。 虚拟接口进行倒换测试会导致接口关闭，业务流量中断。 对于虚拟接口，支持“关闭接口”和“开放接口”两种操作。 1、关闭接口：下发shutdown命令，关闭接口； 2、开放接口：下发undo_shutdown命令，使能接口。 倒换测试选择shutdown时，虚拟接口的状态为ADMIN_SHUTDOWN，此状态不允许虚拟接口的其他操作。 倒换测试选择undo_shutdown时，虚拟接口的状态为ACTIVE。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchoverTestRequest 请求对象
     * @return SyncInvoker<SwitchoverTestRequest, SwitchoverTestResponse>
     */
    public SyncInvoker<SwitchoverTestRequest, SwitchoverTestResponse> switchoverTestInvoker(
        SwitchoverTestRequest request) {
        return new SyncInvoker<>(request, DcMeta.switchoverTest, hcClient);
    }

    /**
     * 更新虚拟接口对等体
     *
     * 更新虚拟接口对等体信息,包括远端子网，名字和描述等。 本接口只在支持Ipv6的区域开放，如需要使用请联系客服
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateVifPeerRequest 请求对象
     * @return UpdateVifPeerResponse
     */
    public UpdateVifPeerResponse updateVifPeer(UpdateVifPeerRequest request) {
        return hcClient.syncInvokeHttp(request, DcMeta.updateVifPeer);
    }

    /**
     * 更新虚拟接口对等体
     *
     * 更新虚拟接口对等体信息,包括远端子网，名字和描述等。 本接口只在支持Ipv6的区域开放，如需要使用请联系客服
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateVifPeerRequest 请求对象
     * @return SyncInvoker<UpdateVifPeerRequest, UpdateVifPeerResponse>
     */
    public SyncInvoker<UpdateVifPeerRequest, UpdateVifPeerResponse> updateVifPeerInvoker(UpdateVifPeerRequest request) {
        return new SyncInvoker<>(request, DcMeta.updateVifPeer, hcClient);
    }

    /**
     * 更新虚拟接口
     *
     * 更新虚拟接口的详细信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateVirtualInterfaceRequest 请求对象
     * @return UpdateVirtualInterfaceResponse
     */
    public UpdateVirtualInterfaceResponse updateVirtualInterface(UpdateVirtualInterfaceRequest request) {
        return hcClient.syncInvokeHttp(request, DcMeta.updateVirtualInterface);
    }

    /**
     * 更新虚拟接口
     *
     * 更新虚拟接口的详细信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateVirtualInterfaceRequest 请求对象
     * @return SyncInvoker<UpdateVirtualInterfaceRequest, UpdateVirtualInterfaceResponse>
     */
    public SyncInvoker<UpdateVirtualInterfaceRequest, UpdateVirtualInterfaceResponse> updateVirtualInterfaceInvoker(
        UpdateVirtualInterfaceRequest request) {
        return new SyncInvoker<>(request, DcMeta.updateVirtualInterface, hcClient);
    }

}
