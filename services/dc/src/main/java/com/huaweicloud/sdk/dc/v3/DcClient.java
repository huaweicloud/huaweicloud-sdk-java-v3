package com.huaweicloud.sdk.dc.v3;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.dc.v3.model.*;

public class DcClient {

    protected HcClient hcClient;

    public DcClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<DcClient> newBuilder() {
        return new ClientBuilder<>(DcClient::new);
    }

    /**
     * 创建托管专线连接
     *
     * 用于合作伙伴用户最终租户创建托管专线
     * 创建者必须拥有合作伙伴资质，并且已经构建好运营(hosting)专线
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateHostedDirectConnectRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateHostedDirectConnectRequest 请求对象
     * @return SyncInvoker<CreateHostedDirectConnectRequest, CreateHostedDirectConnectResponse>
     */
    public SyncInvoker<CreateHostedDirectConnectRequest, CreateHostedDirectConnectResponse> createHostedDirectConnectInvoker(
        CreateHostedDirectConnectRequest request) {
        return new SyncInvoker<CreateHostedDirectConnectRequest, CreateHostedDirectConnectResponse>(request,
            DcMeta.createHostedDirectConnect, hcClient);
    }

    /**
     * 删除物理连接
     *
     * 删除物理连接，本接口只适用于按需计费物理专线，对于包周期购买的专线通过订单退订的方式删除物理连接
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteDirectConnectRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteDirectConnectRequest 请求对象
     * @return SyncInvoker<DeleteDirectConnectRequest, DeleteDirectConnectResponse>
     */
    public SyncInvoker<DeleteDirectConnectRequest, DeleteDirectConnectResponse> deleteDirectConnectInvoker(
        DeleteDirectConnectRequest request) {
        return new SyncInvoker<DeleteDirectConnectRequest, DeleteDirectConnectResponse>(request,
            DcMeta.deleteDirectConnect, hcClient);
    }

    /**
     * 删除托管专线连接
     *
     * 合作伙伴删除托管专线
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteHostedDirectConnectRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteHostedDirectConnectRequest 请求对象
     * @return SyncInvoker<DeleteHostedDirectConnectRequest, DeleteHostedDirectConnectResponse>
     */
    public SyncInvoker<DeleteHostedDirectConnectRequest, DeleteHostedDirectConnectResponse> deleteHostedDirectConnectInvoker(
        DeleteHostedDirectConnectRequest request) {
        return new SyncInvoker<DeleteHostedDirectConnectRequest, DeleteHostedDirectConnectResponse>(request,
            DcMeta.deleteHostedDirectConnect, hcClient);
    }

    /**
     * 查询物理连接列表
     *
     * 查询租户创建的所有的direct connect对象.
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListDirectConnectsRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListDirectConnectsRequest 请求对象
     * @return SyncInvoker<ListDirectConnectsRequest, ListDirectConnectsResponse>
     */
    public SyncInvoker<ListDirectConnectsRequest, ListDirectConnectsResponse> listDirectConnectsInvoker(
        ListDirectConnectsRequest request) {
        return new SyncInvoker<ListDirectConnectsRequest, ListDirectConnectsResponse>(request,
            DcMeta.listDirectConnects, hcClient);
    }

    /**
     * 查询租户的托管专线列表
     *
     * 查询合作伙伴创建的托管专线连接列表.
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListHostedDirectConnectsRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListHostedDirectConnectsRequest 请求对象
     * @return SyncInvoker<ListHostedDirectConnectsRequest, ListHostedDirectConnectsResponse>
     */
    public SyncInvoker<ListHostedDirectConnectsRequest, ListHostedDirectConnectsResponse> listHostedDirectConnectsInvoker(
        ListHostedDirectConnectsRequest request) {
        return new SyncInvoker<ListHostedDirectConnectsRequest, ListHostedDirectConnectsResponse>(request,
            DcMeta.listHostedDirectConnects, hcClient);
    }

    /**
     * 查询物理连接详细信息
     *
     * 查询物理连接详细信息.
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowDirectConnectRequest 请求对象
     * @return ShowDirectConnectResponse
     */
    public ShowDirectConnectResponse showDirectConnect(ShowDirectConnectRequest request) {
        return hcClient.syncInvokeHttp(request, DcMeta.showDirectConnect);
    }

    /**
     * 查询物理连接详细信息
     *
     * 查询物理连接详细信息.
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowDirectConnectRequest 请求对象
     * @return SyncInvoker<ShowDirectConnectRequest, ShowDirectConnectResponse>
     */
    public SyncInvoker<ShowDirectConnectRequest, ShowDirectConnectResponse> showDirectConnectInvoker(
        ShowDirectConnectRequest request) {
        return new SyncInvoker<ShowDirectConnectRequest, ShowDirectConnectResponse>(request, DcMeta.showDirectConnect,
            hcClient);
    }

    /**
     * 查询租户的托管专线详情
     *
     * 查询合法作伙伴的Hosted专线类型.
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowHostedDirectConnectRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowHostedDirectConnectRequest 请求对象
     * @return SyncInvoker<ShowHostedDirectConnectRequest, ShowHostedDirectConnectResponse>
     */
    public SyncInvoker<ShowHostedDirectConnectRequest, ShowHostedDirectConnectResponse> showHostedDirectConnectInvoker(
        ShowHostedDirectConnectRequest request) {
        return new SyncInvoker<ShowHostedDirectConnectRequest, ShowHostedDirectConnectResponse>(request,
            DcMeta.showHostedDirectConnect, hcClient);
    }

    /**
     * 更新物理连接信息
     *
     * 更新物理连接信息，包括名字,描述等信息
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateDirectConnectRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateDirectConnectRequest 请求对象
     * @return SyncInvoker<UpdateDirectConnectRequest, UpdateDirectConnectResponse>
     */
    public SyncInvoker<UpdateDirectConnectRequest, UpdateDirectConnectResponse> updateDirectConnectInvoker(
        UpdateDirectConnectRequest request) {
        return new SyncInvoker<UpdateDirectConnectRequest, UpdateDirectConnectResponse>(request,
            DcMeta.updateDirectConnect, hcClient);
    }

    /**
     * 更新托管专线连接
     *
     * 合作伙伴创建托管专线.
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateHostedDirectConnectRequest 请求对象
     * @return UpdateHostedDirectConnectResponse
     */
    public UpdateHostedDirectConnectResponse updateHostedDirectConnect(UpdateHostedDirectConnectRequest request) {
        return hcClient.syncInvokeHttp(request, DcMeta.updateHostedDirectConnect);
    }

    /**
     * 更新托管专线连接
     *
     * 合作伙伴创建托管专线.
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateHostedDirectConnectRequest 请求对象
     * @return SyncInvoker<UpdateHostedDirectConnectRequest, UpdateHostedDirectConnectResponse>
     */
    public SyncInvoker<UpdateHostedDirectConnectRequest, UpdateHostedDirectConnectResponse> updateHostedDirectConnectInvoker(
        UpdateHostedDirectConnectRequest request) {
        return new SyncInvoker<UpdateHostedDirectConnectRequest, UpdateHostedDirectConnectResponse>(request,
            DcMeta.updateHostedDirectConnect, hcClient);
    }

    /**
     * 批量添加删除资源标签
     *
     * - 为指定实例批量添加或删除标签
     * - 标签管理服务需要使用该接口批量管理实例的标签。
     * - 一个资源上最多有10个标签。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param BatchCreateResourceTagsRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param BatchCreateResourceTagsRequest 请求对象
     * @return SyncInvoker<BatchCreateResourceTagsRequest, BatchCreateResourceTagsResponse>
     */
    public SyncInvoker<BatchCreateResourceTagsRequest, BatchCreateResourceTagsResponse> batchCreateResourceTagsInvoker(
        BatchCreateResourceTagsRequest request) {
        return new SyncInvoker<BatchCreateResourceTagsRequest, BatchCreateResourceTagsResponse>(request,
            DcMeta.batchCreateResourceTags, hcClient);
    }

    /**
     * 添加资源标签
     *
     * - 一个资源上最多有10个标签。
     * - 此接口为幂等接口：
     * - 创建时，如果创建的标签已经存在（key相同），则覆盖。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateResourceTagRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateResourceTagRequest 请求对象
     * @return SyncInvoker<CreateResourceTagRequest, CreateResourceTagResponse>
     */
    public SyncInvoker<CreateResourceTagRequest, CreateResourceTagResponse> createResourceTagInvoker(
        CreateResourceTagRequest request) {
        return new SyncInvoker<CreateResourceTagRequest, CreateResourceTagResponse>(request, DcMeta.createResourceTag,
            hcClient);
    }

    /**
     * 删除资源标签
     *
     * 删除时,不对标签字符集做校验，调用接口前必须要做encodeURI，服务端需要对接口uri做decodeURI。删除的key不存在报404，Key不能为空或者空字符串。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteResourceTagRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteResourceTagRequest 请求对象
     * @return SyncInvoker<DeleteResourceTagRequest, DeleteResourceTagResponse>
     */
    public SyncInvoker<DeleteResourceTagRequest, DeleteResourceTagResponse> deleteResourceTagInvoker(
        DeleteResourceTagRequest request) {
        return new SyncInvoker<DeleteResourceTagRequest, DeleteResourceTagResponse>(request, DcMeta.deleteResourceTag,
            hcClient);
    }

    /**
     * 查询项目标签
     *
     * - 查询租户在指定Project中实例类型的所有资源标签集合。
     * - 标签管理服务需要能够列出当前租户全部已使用的资源标签集合，为各服务打资源标签和过滤实例时提供标签联想功能。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListProjectTagsRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListProjectTagsRequest 请求对象
     * @return SyncInvoker<ListProjectTagsRequest, ListProjectTagsResponse>
     */
    public SyncInvoker<ListProjectTagsRequest, ListProjectTagsResponse> listProjectTagsInvoker(
        ListProjectTagsRequest request) {
        return new SyncInvoker<ListProjectTagsRequest, ListProjectTagsResponse>(request, DcMeta.listProjectTags,
            hcClient);
    }

    /**
     * 通过标签查询资源实例
     *
     * 通过标签查询资源实例
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListTagResourceInstancesRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListTagResourceInstancesRequest 请求对象
     * @return SyncInvoker<ListTagResourceInstancesRequest, ListTagResourceInstancesResponse>
     */
    public SyncInvoker<ListTagResourceInstancesRequest, ListTagResourceInstancesResponse> listTagResourceInstancesInvoker(
        ListTagResourceInstancesRequest request) {
        return new SyncInvoker<ListTagResourceInstancesRequest, ListTagResourceInstancesResponse>(request,
            DcMeta.listTagResourceInstances, hcClient);
    }

    /**
     * 查询资源标签
     *
     * 查询资源标签
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowResourceTagRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowResourceTagRequest 请求对象
     * @return SyncInvoker<ShowResourceTagRequest, ShowResourceTagResponse>
     */
    public SyncInvoker<ShowResourceTagRequest, ShowResourceTagResponse> showResourceTagInvoker(
        ShowResourceTagRequest request) {
        return new SyncInvoker<ShowResourceTagRequest, ShowResourceTagResponse>(request, DcMeta.showResourceTag,
            hcClient);
    }

    /**
     * 创建虑拟网关
     *
     * 创建虑拟网关
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateVirtualGatewayRequest 请求对象
     * @return CreateVirtualGatewayResponse
     */
    public CreateVirtualGatewayResponse createVirtualGateway(CreateVirtualGatewayRequest request) {
        return hcClient.syncInvokeHttp(request, DcMeta.createVirtualGateway);
    }

    /**
     * 创建虑拟网关
     *
     * 创建虑拟网关
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateVirtualGatewayRequest 请求对象
     * @return SyncInvoker<CreateVirtualGatewayRequest, CreateVirtualGatewayResponse>
     */
    public SyncInvoker<CreateVirtualGatewayRequest, CreateVirtualGatewayResponse> createVirtualGatewayInvoker(
        CreateVirtualGatewayRequest request) {
        return new SyncInvoker<CreateVirtualGatewayRequest, CreateVirtualGatewayResponse>(request,
            DcMeta.createVirtualGateway, hcClient);
    }

    /**
     * 删除虚拟网关
     *
     * 删除指定的虚拟网关
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteVirtualGatewayRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteVirtualGatewayRequest 请求对象
     * @return SyncInvoker<DeleteVirtualGatewayRequest, DeleteVirtualGatewayResponse>
     */
    public SyncInvoker<DeleteVirtualGatewayRequest, DeleteVirtualGatewayResponse> deleteVirtualGatewayInvoker(
        DeleteVirtualGatewayRequest request) {
        return new SyncInvoker<DeleteVirtualGatewayRequest, DeleteVirtualGatewayResponse>(request,
            DcMeta.deleteVirtualGateway, hcClient);
    }

    /**
     * 查询虚拟网关列表
     *
     * 查询虚拟网关列表
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListVirtualGatewaysRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListVirtualGatewaysRequest 请求对象
     * @return SyncInvoker<ListVirtualGatewaysRequest, ListVirtualGatewaysResponse>
     */
    public SyncInvoker<ListVirtualGatewaysRequest, ListVirtualGatewaysResponse> listVirtualGatewaysInvoker(
        ListVirtualGatewaysRequest request) {
        return new SyncInvoker<ListVirtualGatewaysRequest, ListVirtualGatewaysResponse>(request,
            DcMeta.listVirtualGateways, hcClient);
    }

    /**
     * 查询虚拟网关详情
     *
     * 查询指定虚拟网关的详细信息
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowVirtualGatewayRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowVirtualGatewayRequest 请求对象
     * @return SyncInvoker<ShowVirtualGatewayRequest, ShowVirtualGatewayResponse>
     */
    public SyncInvoker<ShowVirtualGatewayRequest, ShowVirtualGatewayResponse> showVirtualGatewayInvoker(
        ShowVirtualGatewayRequest request) {
        return new SyncInvoker<ShowVirtualGatewayRequest, ShowVirtualGatewayResponse>(request,
            DcMeta.showVirtualGateway, hcClient);
    }

    /**
     * 修改虚拟网关信息
     *
     * 修改虚拟网关的信息
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateVirtualGatewayRequest 请求对象
     * @return UpdateVirtualGatewayResponse
     */
    public UpdateVirtualGatewayResponse updateVirtualGateway(UpdateVirtualGatewayRequest request) {
        return hcClient.syncInvokeHttp(request, DcMeta.updateVirtualGateway);
    }

    /**
     * 修改虚拟网关信息
     *
     * 修改虚拟网关的信息
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateVirtualGatewayRequest 请求对象
     * @return SyncInvoker<UpdateVirtualGatewayRequest, UpdateVirtualGatewayResponse>
     */
    public SyncInvoker<UpdateVirtualGatewayRequest, UpdateVirtualGatewayResponse> updateVirtualGatewayInvoker(
        UpdateVirtualGatewayRequest request) {
        return new SyncInvoker<UpdateVirtualGatewayRequest, UpdateVirtualGatewayResponse>(request,
            DcMeta.updateVirtualGateway, hcClient);
    }

    /**
     * 创建虚拟接口
     *
     * 虚拟接口配置物理专线上与客户互联的IP和路由等相关信息
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateVirtualInterfaceRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateVirtualInterfaceRequest 请求对象
     * @return SyncInvoker<CreateVirtualInterfaceRequest, CreateVirtualInterfaceResponse>
     */
    public SyncInvoker<CreateVirtualInterfaceRequest, CreateVirtualInterfaceResponse> createVirtualInterfaceInvoker(
        CreateVirtualInterfaceRequest request) {
        return new SyncInvoker<CreateVirtualInterfaceRequest, CreateVirtualInterfaceResponse>(request,
            DcMeta.createVirtualInterface, hcClient);
    }

    /**
     * 删除虚拟接口
     *
     * 删除虚拟接口
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteVirtualInterfaceRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteVirtualInterfaceRequest 请求对象
     * @return SyncInvoker<DeleteVirtualInterfaceRequest, DeleteVirtualInterfaceResponse>
     */
    public SyncInvoker<DeleteVirtualInterfaceRequest, DeleteVirtualInterfaceResponse> deleteVirtualInterfaceInvoker(
        DeleteVirtualInterfaceRequest request) {
        return new SyncInvoker<DeleteVirtualInterfaceRequest, DeleteVirtualInterfaceResponse>(request,
            DcMeta.deleteVirtualInterface, hcClient);
    }

    /**
     * 查询虚拟接口列表
     *
     * 查询租户所有的虚拟接口列表
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListVirtualInterfacesRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListVirtualInterfacesRequest 请求对象
     * @return SyncInvoker<ListVirtualInterfacesRequest, ListVirtualInterfacesResponse>
     */
    public SyncInvoker<ListVirtualInterfacesRequest, ListVirtualInterfacesResponse> listVirtualInterfacesInvoker(
        ListVirtualInterfacesRequest request) {
        return new SyncInvoker<ListVirtualInterfacesRequest, ListVirtualInterfacesResponse>(request,
            DcMeta.listVirtualInterfaces, hcClient);
    }

    /**
     * 查询虚拟接口详情
     *
     * 查询虚拟接口详细信息
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowVirtualInterfaceRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowVirtualInterfaceRequest 请求对象
     * @return SyncInvoker<ShowVirtualInterfaceRequest, ShowVirtualInterfaceResponse>
     */
    public SyncInvoker<ShowVirtualInterfaceRequest, ShowVirtualInterfaceResponse> showVirtualInterfaceInvoker(
        ShowVirtualInterfaceRequest request) {
        return new SyncInvoker<ShowVirtualInterfaceRequest, ShowVirtualInterfaceResponse>(request,
            DcMeta.showVirtualInterface, hcClient);
    }

    /**
     * 修改虚拟接口virtual_interface
     *
     * 修改虚拟接口的详细信息
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateVirtualInterfaceRequest 请求对象
     * @return UpdateVirtualInterfaceResponse
     */
    public UpdateVirtualInterfaceResponse updateVirtualInterface(UpdateVirtualInterfaceRequest request) {
        return hcClient.syncInvokeHttp(request, DcMeta.updateVirtualInterface);
    }

    /**
     * 修改虚拟接口virtual_interface
     *
     * 修改虚拟接口的详细信息
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateVirtualInterfaceRequest 请求对象
     * @return SyncInvoker<UpdateVirtualInterfaceRequest, UpdateVirtualInterfaceResponse>
     */
    public SyncInvoker<UpdateVirtualInterfaceRequest, UpdateVirtualInterfaceResponse> updateVirtualInterfaceInvoker(
        UpdateVirtualInterfaceRequest request) {
        return new SyncInvoker<UpdateVirtualInterfaceRequest, UpdateVirtualInterfaceResponse>(request,
            DcMeta.updateVirtualInterface, hcClient);
    }

}
