package com.huaweicloud.sdk.dc.v3;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.dc.v3.model.*;

import java.util.concurrent.CompletableFuture;

public class DcAsyncClient {

    protected HcClient hcClient;

    public DcAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<DcAsyncClient> newBuilder() {
        return new ClientBuilder<>(DcAsyncClient::new);
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
     * @return CompletableFuture<CreateHostedDirectConnectResponse>
     */
    public CompletableFuture<CreateHostedDirectConnectResponse> createHostedDirectConnectAsync(
        CreateHostedDirectConnectRequest request) {
        return hcClient.asyncInvokeHttp(request, DcMeta.createHostedDirectConnect);
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
     * @return AsyncInvoker<CreateHostedDirectConnectRequest, CreateHostedDirectConnectResponse>
     */
    public AsyncInvoker<CreateHostedDirectConnectRequest, CreateHostedDirectConnectResponse> createHostedDirectConnectAsyncInvoker(
        CreateHostedDirectConnectRequest request) {
        return new AsyncInvoker<CreateHostedDirectConnectRequest, CreateHostedDirectConnectResponse>(request,
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
     * @return CompletableFuture<DeleteDirectConnectResponse>
     */
    public CompletableFuture<DeleteDirectConnectResponse> deleteDirectConnectAsync(DeleteDirectConnectRequest request) {
        return hcClient.asyncInvokeHttp(request, DcMeta.deleteDirectConnect);
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
     * @return AsyncInvoker<DeleteDirectConnectRequest, DeleteDirectConnectResponse>
     */
    public AsyncInvoker<DeleteDirectConnectRequest, DeleteDirectConnectResponse> deleteDirectConnectAsyncInvoker(
        DeleteDirectConnectRequest request) {
        return new AsyncInvoker<DeleteDirectConnectRequest, DeleteDirectConnectResponse>(request,
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
     * @return CompletableFuture<DeleteHostedDirectConnectResponse>
     */
    public CompletableFuture<DeleteHostedDirectConnectResponse> deleteHostedDirectConnectAsync(
        DeleteHostedDirectConnectRequest request) {
        return hcClient.asyncInvokeHttp(request, DcMeta.deleteHostedDirectConnect);
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
     * @return AsyncInvoker<DeleteHostedDirectConnectRequest, DeleteHostedDirectConnectResponse>
     */
    public AsyncInvoker<DeleteHostedDirectConnectRequest, DeleteHostedDirectConnectResponse> deleteHostedDirectConnectAsyncInvoker(
        DeleteHostedDirectConnectRequest request) {
        return new AsyncInvoker<DeleteHostedDirectConnectRequest, DeleteHostedDirectConnectResponse>(request,
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
     * @return CompletableFuture<ListDirectConnectsResponse>
     */
    public CompletableFuture<ListDirectConnectsResponse> listDirectConnectsAsync(ListDirectConnectsRequest request) {
        return hcClient.asyncInvokeHttp(request, DcMeta.listDirectConnects);
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
     * @return AsyncInvoker<ListDirectConnectsRequest, ListDirectConnectsResponse>
     */
    public AsyncInvoker<ListDirectConnectsRequest, ListDirectConnectsResponse> listDirectConnectsAsyncInvoker(
        ListDirectConnectsRequest request) {
        return new AsyncInvoker<ListDirectConnectsRequest, ListDirectConnectsResponse>(request,
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
     * @return CompletableFuture<ListHostedDirectConnectsResponse>
     */
    public CompletableFuture<ListHostedDirectConnectsResponse> listHostedDirectConnectsAsync(
        ListHostedDirectConnectsRequest request) {
        return hcClient.asyncInvokeHttp(request, DcMeta.listHostedDirectConnects);
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
     * @return AsyncInvoker<ListHostedDirectConnectsRequest, ListHostedDirectConnectsResponse>
     */
    public AsyncInvoker<ListHostedDirectConnectsRequest, ListHostedDirectConnectsResponse> listHostedDirectConnectsAsyncInvoker(
        ListHostedDirectConnectsRequest request) {
        return new AsyncInvoker<ListHostedDirectConnectsRequest, ListHostedDirectConnectsResponse>(request,
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
     * @return CompletableFuture<ShowDirectConnectResponse>
     */
    public CompletableFuture<ShowDirectConnectResponse> showDirectConnectAsync(ShowDirectConnectRequest request) {
        return hcClient.asyncInvokeHttp(request, DcMeta.showDirectConnect);
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
     * @return AsyncInvoker<ShowDirectConnectRequest, ShowDirectConnectResponse>
     */
    public AsyncInvoker<ShowDirectConnectRequest, ShowDirectConnectResponse> showDirectConnectAsyncInvoker(
        ShowDirectConnectRequest request) {
        return new AsyncInvoker<ShowDirectConnectRequest, ShowDirectConnectResponse>(request, DcMeta.showDirectConnect,
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
     * @return CompletableFuture<ShowHostedDirectConnectResponse>
     */
    public CompletableFuture<ShowHostedDirectConnectResponse> showHostedDirectConnectAsync(
        ShowHostedDirectConnectRequest request) {
        return hcClient.asyncInvokeHttp(request, DcMeta.showHostedDirectConnect);
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
     * @return AsyncInvoker<ShowHostedDirectConnectRequest, ShowHostedDirectConnectResponse>
     */
    public AsyncInvoker<ShowHostedDirectConnectRequest, ShowHostedDirectConnectResponse> showHostedDirectConnectAsyncInvoker(
        ShowHostedDirectConnectRequest request) {
        return new AsyncInvoker<ShowHostedDirectConnectRequest, ShowHostedDirectConnectResponse>(request,
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
     * @return CompletableFuture<UpdateDirectConnectResponse>
     */
    public CompletableFuture<UpdateDirectConnectResponse> updateDirectConnectAsync(UpdateDirectConnectRequest request) {
        return hcClient.asyncInvokeHttp(request, DcMeta.updateDirectConnect);
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
     * @return AsyncInvoker<UpdateDirectConnectRequest, UpdateDirectConnectResponse>
     */
    public AsyncInvoker<UpdateDirectConnectRequest, UpdateDirectConnectResponse> updateDirectConnectAsyncInvoker(
        UpdateDirectConnectRequest request) {
        return new AsyncInvoker<UpdateDirectConnectRequest, UpdateDirectConnectResponse>(request,
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
     * @return CompletableFuture<UpdateHostedDirectConnectResponse>
     */
    public CompletableFuture<UpdateHostedDirectConnectResponse> updateHostedDirectConnectAsync(
        UpdateHostedDirectConnectRequest request) {
        return hcClient.asyncInvokeHttp(request, DcMeta.updateHostedDirectConnect);
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
     * @return AsyncInvoker<UpdateHostedDirectConnectRequest, UpdateHostedDirectConnectResponse>
     */
    public AsyncInvoker<UpdateHostedDirectConnectRequest, UpdateHostedDirectConnectResponse> updateHostedDirectConnectAsyncInvoker(
        UpdateHostedDirectConnectRequest request) {
        return new AsyncInvoker<UpdateHostedDirectConnectRequest, UpdateHostedDirectConnectResponse>(request,
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
     * @return CompletableFuture<BatchCreateResourceTagsResponse>
     */
    public CompletableFuture<BatchCreateResourceTagsResponse> batchCreateResourceTagsAsync(
        BatchCreateResourceTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, DcMeta.batchCreateResourceTags);
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
     * @return AsyncInvoker<BatchCreateResourceTagsRequest, BatchCreateResourceTagsResponse>
     */
    public AsyncInvoker<BatchCreateResourceTagsRequest, BatchCreateResourceTagsResponse> batchCreateResourceTagsAsyncInvoker(
        BatchCreateResourceTagsRequest request) {
        return new AsyncInvoker<BatchCreateResourceTagsRequest, BatchCreateResourceTagsResponse>(request,
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
     * @return CompletableFuture<CreateResourceTagResponse>
     */
    public CompletableFuture<CreateResourceTagResponse> createResourceTagAsync(CreateResourceTagRequest request) {
        return hcClient.asyncInvokeHttp(request, DcMeta.createResourceTag);
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
     * @return AsyncInvoker<CreateResourceTagRequest, CreateResourceTagResponse>
     */
    public AsyncInvoker<CreateResourceTagRequest, CreateResourceTagResponse> createResourceTagAsyncInvoker(
        CreateResourceTagRequest request) {
        return new AsyncInvoker<CreateResourceTagRequest, CreateResourceTagResponse>(request, DcMeta.createResourceTag,
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
     * @return CompletableFuture<DeleteResourceTagResponse>
     */
    public CompletableFuture<DeleteResourceTagResponse> deleteResourceTagAsync(DeleteResourceTagRequest request) {
        return hcClient.asyncInvokeHttp(request, DcMeta.deleteResourceTag);
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
     * @return AsyncInvoker<DeleteResourceTagRequest, DeleteResourceTagResponse>
     */
    public AsyncInvoker<DeleteResourceTagRequest, DeleteResourceTagResponse> deleteResourceTagAsyncInvoker(
        DeleteResourceTagRequest request) {
        return new AsyncInvoker<DeleteResourceTagRequest, DeleteResourceTagResponse>(request, DcMeta.deleteResourceTag,
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
     * @return CompletableFuture<ListProjectTagsResponse>
     */
    public CompletableFuture<ListProjectTagsResponse> listProjectTagsAsync(ListProjectTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, DcMeta.listProjectTags);
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
     * @return AsyncInvoker<ListProjectTagsRequest, ListProjectTagsResponse>
     */
    public AsyncInvoker<ListProjectTagsRequest, ListProjectTagsResponse> listProjectTagsAsyncInvoker(
        ListProjectTagsRequest request) {
        return new AsyncInvoker<ListProjectTagsRequest, ListProjectTagsResponse>(request, DcMeta.listProjectTags,
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
     * @return CompletableFuture<ListTagResourceInstancesResponse>
     */
    public CompletableFuture<ListTagResourceInstancesResponse> listTagResourceInstancesAsync(
        ListTagResourceInstancesRequest request) {
        return hcClient.asyncInvokeHttp(request, DcMeta.listTagResourceInstances);
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
     * @return AsyncInvoker<ListTagResourceInstancesRequest, ListTagResourceInstancesResponse>
     */
    public AsyncInvoker<ListTagResourceInstancesRequest, ListTagResourceInstancesResponse> listTagResourceInstancesAsyncInvoker(
        ListTagResourceInstancesRequest request) {
        return new AsyncInvoker<ListTagResourceInstancesRequest, ListTagResourceInstancesResponse>(request,
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
     * @return CompletableFuture<ShowResourceTagResponse>
     */
    public CompletableFuture<ShowResourceTagResponse> showResourceTagAsync(ShowResourceTagRequest request) {
        return hcClient.asyncInvokeHttp(request, DcMeta.showResourceTag);
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
     * @return AsyncInvoker<ShowResourceTagRequest, ShowResourceTagResponse>
     */
    public AsyncInvoker<ShowResourceTagRequest, ShowResourceTagResponse> showResourceTagAsyncInvoker(
        ShowResourceTagRequest request) {
        return new AsyncInvoker<ShowResourceTagRequest, ShowResourceTagResponse>(request, DcMeta.showResourceTag,
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
     * @return CompletableFuture<CreateVirtualGatewayResponse>
     */
    public CompletableFuture<CreateVirtualGatewayResponse> createVirtualGatewayAsync(
        CreateVirtualGatewayRequest request) {
        return hcClient.asyncInvokeHttp(request, DcMeta.createVirtualGateway);
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
     * @return AsyncInvoker<CreateVirtualGatewayRequest, CreateVirtualGatewayResponse>
     */
    public AsyncInvoker<CreateVirtualGatewayRequest, CreateVirtualGatewayResponse> createVirtualGatewayAsyncInvoker(
        CreateVirtualGatewayRequest request) {
        return new AsyncInvoker<CreateVirtualGatewayRequest, CreateVirtualGatewayResponse>(request,
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
     * @return CompletableFuture<DeleteVirtualGatewayResponse>
     */
    public CompletableFuture<DeleteVirtualGatewayResponse> deleteVirtualGatewayAsync(
        DeleteVirtualGatewayRequest request) {
        return hcClient.asyncInvokeHttp(request, DcMeta.deleteVirtualGateway);
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
     * @return AsyncInvoker<DeleteVirtualGatewayRequest, DeleteVirtualGatewayResponse>
     */
    public AsyncInvoker<DeleteVirtualGatewayRequest, DeleteVirtualGatewayResponse> deleteVirtualGatewayAsyncInvoker(
        DeleteVirtualGatewayRequest request) {
        return new AsyncInvoker<DeleteVirtualGatewayRequest, DeleteVirtualGatewayResponse>(request,
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
     * @return CompletableFuture<ListVirtualGatewaysResponse>
     */
    public CompletableFuture<ListVirtualGatewaysResponse> listVirtualGatewaysAsync(ListVirtualGatewaysRequest request) {
        return hcClient.asyncInvokeHttp(request, DcMeta.listVirtualGateways);
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
     * @return AsyncInvoker<ListVirtualGatewaysRequest, ListVirtualGatewaysResponse>
     */
    public AsyncInvoker<ListVirtualGatewaysRequest, ListVirtualGatewaysResponse> listVirtualGatewaysAsyncInvoker(
        ListVirtualGatewaysRequest request) {
        return new AsyncInvoker<ListVirtualGatewaysRequest, ListVirtualGatewaysResponse>(request,
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
     * @return CompletableFuture<ShowVirtualGatewayResponse>
     */
    public CompletableFuture<ShowVirtualGatewayResponse> showVirtualGatewayAsync(ShowVirtualGatewayRequest request) {
        return hcClient.asyncInvokeHttp(request, DcMeta.showVirtualGateway);
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
     * @return AsyncInvoker<ShowVirtualGatewayRequest, ShowVirtualGatewayResponse>
     */
    public AsyncInvoker<ShowVirtualGatewayRequest, ShowVirtualGatewayResponse> showVirtualGatewayAsyncInvoker(
        ShowVirtualGatewayRequest request) {
        return new AsyncInvoker<ShowVirtualGatewayRequest, ShowVirtualGatewayResponse>(request,
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
     * @return CompletableFuture<UpdateVirtualGatewayResponse>
     */
    public CompletableFuture<UpdateVirtualGatewayResponse> updateVirtualGatewayAsync(
        UpdateVirtualGatewayRequest request) {
        return hcClient.asyncInvokeHttp(request, DcMeta.updateVirtualGateway);
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
     * @return AsyncInvoker<UpdateVirtualGatewayRequest, UpdateVirtualGatewayResponse>
     */
    public AsyncInvoker<UpdateVirtualGatewayRequest, UpdateVirtualGatewayResponse> updateVirtualGatewayAsyncInvoker(
        UpdateVirtualGatewayRequest request) {
        return new AsyncInvoker<UpdateVirtualGatewayRequest, UpdateVirtualGatewayResponse>(request,
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
     * @return CompletableFuture<CreateVirtualInterfaceResponse>
     */
    public CompletableFuture<CreateVirtualInterfaceResponse> createVirtualInterfaceAsync(
        CreateVirtualInterfaceRequest request) {
        return hcClient.asyncInvokeHttp(request, DcMeta.createVirtualInterface);
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
     * @return AsyncInvoker<CreateVirtualInterfaceRequest, CreateVirtualInterfaceResponse>
     */
    public AsyncInvoker<CreateVirtualInterfaceRequest, CreateVirtualInterfaceResponse> createVirtualInterfaceAsyncInvoker(
        CreateVirtualInterfaceRequest request) {
        return new AsyncInvoker<CreateVirtualInterfaceRequest, CreateVirtualInterfaceResponse>(request,
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
     * @return CompletableFuture<DeleteVirtualInterfaceResponse>
     */
    public CompletableFuture<DeleteVirtualInterfaceResponse> deleteVirtualInterfaceAsync(
        DeleteVirtualInterfaceRequest request) {
        return hcClient.asyncInvokeHttp(request, DcMeta.deleteVirtualInterface);
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
     * @return AsyncInvoker<DeleteVirtualInterfaceRequest, DeleteVirtualInterfaceResponse>
     */
    public AsyncInvoker<DeleteVirtualInterfaceRequest, DeleteVirtualInterfaceResponse> deleteVirtualInterfaceAsyncInvoker(
        DeleteVirtualInterfaceRequest request) {
        return new AsyncInvoker<DeleteVirtualInterfaceRequest, DeleteVirtualInterfaceResponse>(request,
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
     * @return CompletableFuture<ListVirtualInterfacesResponse>
     */
    public CompletableFuture<ListVirtualInterfacesResponse> listVirtualInterfacesAsync(
        ListVirtualInterfacesRequest request) {
        return hcClient.asyncInvokeHttp(request, DcMeta.listVirtualInterfaces);
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
     * @return AsyncInvoker<ListVirtualInterfacesRequest, ListVirtualInterfacesResponse>
     */
    public AsyncInvoker<ListVirtualInterfacesRequest, ListVirtualInterfacesResponse> listVirtualInterfacesAsyncInvoker(
        ListVirtualInterfacesRequest request) {
        return new AsyncInvoker<ListVirtualInterfacesRequest, ListVirtualInterfacesResponse>(request,
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
     * @return CompletableFuture<ShowVirtualInterfaceResponse>
     */
    public CompletableFuture<ShowVirtualInterfaceResponse> showVirtualInterfaceAsync(
        ShowVirtualInterfaceRequest request) {
        return hcClient.asyncInvokeHttp(request, DcMeta.showVirtualInterface);
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
     * @return AsyncInvoker<ShowVirtualInterfaceRequest, ShowVirtualInterfaceResponse>
     */
    public AsyncInvoker<ShowVirtualInterfaceRequest, ShowVirtualInterfaceResponse> showVirtualInterfaceAsyncInvoker(
        ShowVirtualInterfaceRequest request) {
        return new AsyncInvoker<ShowVirtualInterfaceRequest, ShowVirtualInterfaceResponse>(request,
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
     * @return CompletableFuture<UpdateVirtualInterfaceResponse>
     */
    public CompletableFuture<UpdateVirtualInterfaceResponse> updateVirtualInterfaceAsync(
        UpdateVirtualInterfaceRequest request) {
        return hcClient.asyncInvokeHttp(request, DcMeta.updateVirtualInterface);
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
     * @return AsyncInvoker<UpdateVirtualInterfaceRequest, UpdateVirtualInterfaceResponse>
     */
    public AsyncInvoker<UpdateVirtualInterfaceRequest, UpdateVirtualInterfaceResponse> updateVirtualInterfaceAsyncInvoker(
        UpdateVirtualInterfaceRequest request) {
        return new AsyncInvoker<UpdateVirtualInterfaceRequest, UpdateVirtualInterfaceResponse>(request,
            DcMeta.updateVirtualInterface, hcClient);
    }

}
