package com.huaweicloud.sdk.dc.v3;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.dc.v3.model.BatchCreateResourceTagsRequest;
import com.huaweicloud.sdk.dc.v3.model.BatchCreateResourceTagsResponse;
import com.huaweicloud.sdk.dc.v3.model.BindGlobalEipsRequest;
import com.huaweicloud.sdk.dc.v3.model.BindGlobalEipsResponse;
import com.huaweicloud.sdk.dc.v3.model.CreateConnectGatewayRequest;
import com.huaweicloud.sdk.dc.v3.model.CreateConnectGatewayResponse;
import com.huaweicloud.sdk.dc.v3.model.CreateGlobalDcGatewayRequest;
import com.huaweicloud.sdk.dc.v3.model.CreateGlobalDcGatewayResponse;
import com.huaweicloud.sdk.dc.v3.model.CreateHostedDirectConnectRequest;
import com.huaweicloud.sdk.dc.v3.model.CreateHostedDirectConnectResponse;
import com.huaweicloud.sdk.dc.v3.model.CreatePeerLinkRequest;
import com.huaweicloud.sdk.dc.v3.model.CreatePeerLinkResponse;
import com.huaweicloud.sdk.dc.v3.model.CreateResourceTagRequest;
import com.huaweicloud.sdk.dc.v3.model.CreateResourceTagResponse;
import com.huaweicloud.sdk.dc.v3.model.CreateVifPeerRequest;
import com.huaweicloud.sdk.dc.v3.model.CreateVifPeerResponse;
import com.huaweicloud.sdk.dc.v3.model.CreateVirtualGatewayRequest;
import com.huaweicloud.sdk.dc.v3.model.CreateVirtualGatewayResponse;
import com.huaweicloud.sdk.dc.v3.model.CreateVirtualInterfaceRequest;
import com.huaweicloud.sdk.dc.v3.model.CreateVirtualInterfaceResponse;
import com.huaweicloud.sdk.dc.v3.model.DeleteConnectGatewayRequest;
import com.huaweicloud.sdk.dc.v3.model.DeleteConnectGatewayResponse;
import com.huaweicloud.sdk.dc.v3.model.DeleteDirectConnectRequest;
import com.huaweicloud.sdk.dc.v3.model.DeleteDirectConnectResponse;
import com.huaweicloud.sdk.dc.v3.model.DeleteGlobalDcGatewayRequest;
import com.huaweicloud.sdk.dc.v3.model.DeleteGlobalDcGatewayResponse;
import com.huaweicloud.sdk.dc.v3.model.DeleteHostedDirectConnectRequest;
import com.huaweicloud.sdk.dc.v3.model.DeleteHostedDirectConnectResponse;
import com.huaweicloud.sdk.dc.v3.model.DeletePeerLinkRequest;
import com.huaweicloud.sdk.dc.v3.model.DeletePeerLinkResponse;
import com.huaweicloud.sdk.dc.v3.model.DeleteResourceTagRequest;
import com.huaweicloud.sdk.dc.v3.model.DeleteResourceTagResponse;
import com.huaweicloud.sdk.dc.v3.model.DeleteVifPeerRequest;
import com.huaweicloud.sdk.dc.v3.model.DeleteVifPeerResponse;
import com.huaweicloud.sdk.dc.v3.model.DeleteVirtualGatewayRequest;
import com.huaweicloud.sdk.dc.v3.model.DeleteVirtualGatewayResponse;
import com.huaweicloud.sdk.dc.v3.model.DeleteVirtualInterfaceRequest;
import com.huaweicloud.sdk.dc.v3.model.DeleteVirtualInterfaceResponse;
import com.huaweicloud.sdk.dc.v3.model.ListConnectGatewaysRequest;
import com.huaweicloud.sdk.dc.v3.model.ListConnectGatewaysResponse;
import com.huaweicloud.sdk.dc.v3.model.ListDirectConnectLocationsRequest;
import com.huaweicloud.sdk.dc.v3.model.ListDirectConnectLocationsResponse;
import com.huaweicloud.sdk.dc.v3.model.ListDirectConnectsRequest;
import com.huaweicloud.sdk.dc.v3.model.ListDirectConnectsResponse;
import com.huaweicloud.sdk.dc.v3.model.ListGdgwRouteTablesRequest;
import com.huaweicloud.sdk.dc.v3.model.ListGdgwRouteTablesResponse;
import com.huaweicloud.sdk.dc.v3.model.ListGlobalDcGatewaysRequest;
import com.huaweicloud.sdk.dc.v3.model.ListGlobalDcGatewaysResponse;
import com.huaweicloud.sdk.dc.v3.model.ListGlobalEipsRequest;
import com.huaweicloud.sdk.dc.v3.model.ListGlobalEipsResponse;
import com.huaweicloud.sdk.dc.v3.model.ListHostedDirectConnectsRequest;
import com.huaweicloud.sdk.dc.v3.model.ListHostedDirectConnectsResponse;
import com.huaweicloud.sdk.dc.v3.model.ListPeerLinksRequest;
import com.huaweicloud.sdk.dc.v3.model.ListPeerLinksResponse;
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
import com.huaweicloud.sdk.dc.v3.model.ShowConnectGatewayRequest;
import com.huaweicloud.sdk.dc.v3.model.ShowConnectGatewayResponse;
import com.huaweicloud.sdk.dc.v3.model.ShowDirectConnectLocationRequest;
import com.huaweicloud.sdk.dc.v3.model.ShowDirectConnectLocationResponse;
import com.huaweicloud.sdk.dc.v3.model.ShowDirectConnectRequest;
import com.huaweicloud.sdk.dc.v3.model.ShowDirectConnectResponse;
import com.huaweicloud.sdk.dc.v3.model.ShowGlobalDcGatewayRequest;
import com.huaweicloud.sdk.dc.v3.model.ShowGlobalDcGatewayResponse;
import com.huaweicloud.sdk.dc.v3.model.ShowHostedDirectConnectRequest;
import com.huaweicloud.sdk.dc.v3.model.ShowHostedDirectConnectResponse;
import com.huaweicloud.sdk.dc.v3.model.ShowPeerLinkRequest;
import com.huaweicloud.sdk.dc.v3.model.ShowPeerLinkResponse;
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
import com.huaweicloud.sdk.dc.v3.model.UnbindGlobalEipsRequest;
import com.huaweicloud.sdk.dc.v3.model.UnbindGlobalEipsResponse;
import com.huaweicloud.sdk.dc.v3.model.UpdateConnectGatewayRequest;
import com.huaweicloud.sdk.dc.v3.model.UpdateConnectGatewayResponse;
import com.huaweicloud.sdk.dc.v3.model.UpdateDirectConnectRequest;
import com.huaweicloud.sdk.dc.v3.model.UpdateDirectConnectResponse;
import com.huaweicloud.sdk.dc.v3.model.UpdateGdgwRouteTableRequest;
import com.huaweicloud.sdk.dc.v3.model.UpdateGdgwRouteTableResponse;
import com.huaweicloud.sdk.dc.v3.model.UpdateGlobalDcGatewayRequest;
import com.huaweicloud.sdk.dc.v3.model.UpdateGlobalDcGatewayResponse;
import com.huaweicloud.sdk.dc.v3.model.UpdateHostedDirectConnectRequest;
import com.huaweicloud.sdk.dc.v3.model.UpdateHostedDirectConnectResponse;
import com.huaweicloud.sdk.dc.v3.model.UpdatePeerLinkRequest;
import com.huaweicloud.sdk.dc.v3.model.UpdatePeerLinkResponse;
import com.huaweicloud.sdk.dc.v3.model.UpdateVifPeerRequest;
import com.huaweicloud.sdk.dc.v3.model.UpdateVifPeerResponse;
import com.huaweicloud.sdk.dc.v3.model.UpdateVirtualGatewayRequest;
import com.huaweicloud.sdk.dc.v3.model.UpdateVirtualGatewayResponse;
import com.huaweicloud.sdk.dc.v3.model.UpdateVirtualInterfaceRequest;
import com.huaweicloud.sdk.dc.v3.model.UpdateVirtualInterfaceResponse;

import java.util.concurrent.CompletableFuture;

public class DcAsyncClient {

    protected HcClient hcClient;

    public DcAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<DcAsyncClient> newBuilder() {
        ClientBuilder<DcAsyncClient> clientBuilder = new ClientBuilder<>(DcAsyncClient::new);
        return clientBuilder;
    }

    /**
     * 绑定GEIP操作
     *
     * 绑定GEIP操作
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BindGlobalEipsRequest 请求对象
     * @return CompletableFuture<BindGlobalEipsResponse>
     */
    public CompletableFuture<BindGlobalEipsResponse> bindGlobalEipsAsync(BindGlobalEipsRequest request) {
        return hcClient.asyncInvokeHttp(request, DcMeta.bindGlobalEips);
    }

    /**
     * 绑定GEIP操作
     *
     * 绑定GEIP操作
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BindGlobalEipsRequest 请求对象
     * @return AsyncInvoker<BindGlobalEipsRequest, BindGlobalEipsResponse>
     */
    public AsyncInvoker<BindGlobalEipsRequest, BindGlobalEipsResponse> bindGlobalEipsAsyncInvoker(
        BindGlobalEipsRequest request) {
        return new AsyncInvoker<>(request, DcMeta.bindGlobalEips, hcClient);
    }

    /**
     * 查询已经绑定的GEIP列表
     *
     * 查询已经绑定的GEIP列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGlobalEipsRequest 请求对象
     * @return CompletableFuture<ListGlobalEipsResponse>
     */
    public CompletableFuture<ListGlobalEipsResponse> listGlobalEipsAsync(ListGlobalEipsRequest request) {
        return hcClient.asyncInvokeHttp(request, DcMeta.listGlobalEips);
    }

    /**
     * 查询已经绑定的GEIP列表
     *
     * 查询已经绑定的GEIP列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGlobalEipsRequest 请求对象
     * @return AsyncInvoker<ListGlobalEipsRequest, ListGlobalEipsResponse>
     */
    public AsyncInvoker<ListGlobalEipsRequest, ListGlobalEipsResponse> listGlobalEipsAsyncInvoker(
        ListGlobalEipsRequest request) {
        return new AsyncInvoker<>(request, DcMeta.listGlobalEips, hcClient);
    }

    /**
     * 解绑GEIP
     *
     * 解绑GEIP
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UnbindGlobalEipsRequest 请求对象
     * @return CompletableFuture<UnbindGlobalEipsResponse>
     */
    public CompletableFuture<UnbindGlobalEipsResponse> unbindGlobalEipsAsync(UnbindGlobalEipsRequest request) {
        return hcClient.asyncInvokeHttp(request, DcMeta.unbindGlobalEips);
    }

    /**
     * 解绑GEIP
     *
     * 解绑GEIP
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UnbindGlobalEipsRequest 请求对象
     * @return AsyncInvoker<UnbindGlobalEipsRequest, UnbindGlobalEipsResponse>
     */
    public AsyncInvoker<UnbindGlobalEipsRequest, UnbindGlobalEipsResponse> unbindGlobalEipsAsyncInvoker(
        UnbindGlobalEipsRequest request) {
        return new AsyncInvoker<>(request, DcMeta.unbindGlobalEips, hcClient);
    }

    /**
     * 创建互联网关
     *
     * 创建互联网关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateConnectGatewayRequest 请求对象
     * @return CompletableFuture<CreateConnectGatewayResponse>
     */
    public CompletableFuture<CreateConnectGatewayResponse> createConnectGatewayAsync(
        CreateConnectGatewayRequest request) {
        return hcClient.asyncInvokeHttp(request, DcMeta.createConnectGateway);
    }

    /**
     * 创建互联网关
     *
     * 创建互联网关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateConnectGatewayRequest 请求对象
     * @return AsyncInvoker<CreateConnectGatewayRequest, CreateConnectGatewayResponse>
     */
    public AsyncInvoker<CreateConnectGatewayRequest, CreateConnectGatewayResponse> createConnectGatewayAsyncInvoker(
        CreateConnectGatewayRequest request) {
        return new AsyncInvoker<>(request, DcMeta.createConnectGateway, hcClient);
    }

    /**
     * 删除互联网关
     *
     * 删除互联网关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteConnectGatewayRequest 请求对象
     * @return CompletableFuture<DeleteConnectGatewayResponse>
     */
    public CompletableFuture<DeleteConnectGatewayResponse> deleteConnectGatewayAsync(
        DeleteConnectGatewayRequest request) {
        return hcClient.asyncInvokeHttp(request, DcMeta.deleteConnectGateway);
    }

    /**
     * 删除互联网关
     *
     * 删除互联网关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteConnectGatewayRequest 请求对象
     * @return AsyncInvoker<DeleteConnectGatewayRequest, DeleteConnectGatewayResponse>
     */
    public AsyncInvoker<DeleteConnectGatewayRequest, DeleteConnectGatewayResponse> deleteConnectGatewayAsyncInvoker(
        DeleteConnectGatewayRequest request) {
        return new AsyncInvoker<>(request, DcMeta.deleteConnectGateway, hcClient);
    }

    /**
     * 查询互联网关列表信息
     *
     * 查询互联网关列表信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListConnectGatewaysRequest 请求对象
     * @return CompletableFuture<ListConnectGatewaysResponse>
     */
    public CompletableFuture<ListConnectGatewaysResponse> listConnectGatewaysAsync(ListConnectGatewaysRequest request) {
        return hcClient.asyncInvokeHttp(request, DcMeta.listConnectGateways);
    }

    /**
     * 查询互联网关列表信息
     *
     * 查询互联网关列表信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListConnectGatewaysRequest 请求对象
     * @return AsyncInvoker<ListConnectGatewaysRequest, ListConnectGatewaysResponse>
     */
    public AsyncInvoker<ListConnectGatewaysRequest, ListConnectGatewaysResponse> listConnectGatewaysAsyncInvoker(
        ListConnectGatewaysRequest request) {
        return new AsyncInvoker<>(request, DcMeta.listConnectGateways, hcClient);
    }

    /**
     * 查询互联网关详细信息
     *
     * 查询互联网关详细信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowConnectGatewayRequest 请求对象
     * @return CompletableFuture<ShowConnectGatewayResponse>
     */
    public CompletableFuture<ShowConnectGatewayResponse> showConnectGatewayAsync(ShowConnectGatewayRequest request) {
        return hcClient.asyncInvokeHttp(request, DcMeta.showConnectGateway);
    }

    /**
     * 查询互联网关详细信息
     *
     * 查询互联网关详细信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowConnectGatewayRequest 请求对象
     * @return AsyncInvoker<ShowConnectGatewayRequest, ShowConnectGatewayResponse>
     */
    public AsyncInvoker<ShowConnectGatewayRequest, ShowConnectGatewayResponse> showConnectGatewayAsyncInvoker(
        ShowConnectGatewayRequest request) {
        return new AsyncInvoker<>(request, DcMeta.showConnectGateway, hcClient);
    }

    /**
     * 更新互联网关
     *
     * 更新互联网关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateConnectGatewayRequest 请求对象
     * @return CompletableFuture<UpdateConnectGatewayResponse>
     */
    public CompletableFuture<UpdateConnectGatewayResponse> updateConnectGatewayAsync(
        UpdateConnectGatewayRequest request) {
        return hcClient.asyncInvokeHttp(request, DcMeta.updateConnectGateway);
    }

    /**
     * 更新互联网关
     *
     * 更新互联网关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateConnectGatewayRequest 请求对象
     * @return AsyncInvoker<UpdateConnectGatewayRequest, UpdateConnectGatewayResponse>
     */
    public AsyncInvoker<UpdateConnectGatewayRequest, UpdateConnectGatewayResponse> updateConnectGatewayAsyncInvoker(
        UpdateConnectGatewayRequest request) {
        return new AsyncInvoker<>(request, DcMeta.updateConnectGateway, hcClient);
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
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateHostedDirectConnectRequest 请求对象
     * @return AsyncInvoker<CreateHostedDirectConnectRequest, CreateHostedDirectConnectResponse>
     */
    public AsyncInvoker<CreateHostedDirectConnectRequest, CreateHostedDirectConnectResponse> createHostedDirectConnectAsyncInvoker(
        CreateHostedDirectConnectRequest request) {
        return new AsyncInvoker<>(request, DcMeta.createHostedDirectConnect, hcClient);
    }

    /**
     * 删除物理连接
     *
     * 删除物理连接，本接口只适用于按需计费物理专线，对于包周期购买的专线通过订单退订的方式删除物理连接
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDirectConnectRequest 请求对象
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
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDirectConnectRequest 请求对象
     * @return AsyncInvoker<DeleteDirectConnectRequest, DeleteDirectConnectResponse>
     */
    public AsyncInvoker<DeleteDirectConnectRequest, DeleteDirectConnectResponse> deleteDirectConnectAsyncInvoker(
        DeleteDirectConnectRequest request) {
        return new AsyncInvoker<>(request, DcMeta.deleteDirectConnect, hcClient);
    }

    /**
     * 删除托管专线连接
     *
     * 合作伙伴删除托管专线
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteHostedDirectConnectRequest 请求对象
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
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteHostedDirectConnectRequest 请求对象
     * @return AsyncInvoker<DeleteHostedDirectConnectRequest, DeleteHostedDirectConnectResponse>
     */
    public AsyncInvoker<DeleteHostedDirectConnectRequest, DeleteHostedDirectConnectResponse> deleteHostedDirectConnectAsyncInvoker(
        DeleteHostedDirectConnectRequest request) {
        return new AsyncInvoker<>(request, DcMeta.deleteHostedDirectConnect, hcClient);
    }

    /**
     * 查询物理连接列表
     *
     * 查询租户创建的所有的direct connect对象.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDirectConnectsRequest 请求对象
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
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDirectConnectsRequest 请求对象
     * @return AsyncInvoker<ListDirectConnectsRequest, ListDirectConnectsResponse>
     */
    public AsyncInvoker<ListDirectConnectsRequest, ListDirectConnectsResponse> listDirectConnectsAsyncInvoker(
        ListDirectConnectsRequest request) {
        return new AsyncInvoker<>(request, DcMeta.listDirectConnects, hcClient);
    }

    /**
     * 查询租户的托管专线列表
     *
     * 查询合作伙伴创建的托管专线连接列表.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHostedDirectConnectsRequest 请求对象
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
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHostedDirectConnectsRequest 请求对象
     * @return AsyncInvoker<ListHostedDirectConnectsRequest, ListHostedDirectConnectsResponse>
     */
    public AsyncInvoker<ListHostedDirectConnectsRequest, ListHostedDirectConnectsResponse> listHostedDirectConnectsAsyncInvoker(
        ListHostedDirectConnectsRequest request) {
        return new AsyncInvoker<>(request, DcMeta.listHostedDirectConnects, hcClient);
    }

    /**
     * 查询物理连接详情
     *
     * 查询物理连接详细信息.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDirectConnectRequest 请求对象
     * @return CompletableFuture<ShowDirectConnectResponse>
     */
    public CompletableFuture<ShowDirectConnectResponse> showDirectConnectAsync(ShowDirectConnectRequest request) {
        return hcClient.asyncInvokeHttp(request, DcMeta.showDirectConnect);
    }

    /**
     * 查询物理连接详情
     *
     * 查询物理连接详细信息.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDirectConnectRequest 请求对象
     * @return AsyncInvoker<ShowDirectConnectRequest, ShowDirectConnectResponse>
     */
    public AsyncInvoker<ShowDirectConnectRequest, ShowDirectConnectResponse> showDirectConnectAsyncInvoker(
        ShowDirectConnectRequest request) {
        return new AsyncInvoker<>(request, DcMeta.showDirectConnect, hcClient);
    }

    /**
     * 查询租户的托管专线详情
     *
     * 查询合法作伙伴的Hosted专线类型.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHostedDirectConnectRequest 请求对象
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
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHostedDirectConnectRequest 请求对象
     * @return AsyncInvoker<ShowHostedDirectConnectRequest, ShowHostedDirectConnectResponse>
     */
    public AsyncInvoker<ShowHostedDirectConnectRequest, ShowHostedDirectConnectResponse> showHostedDirectConnectAsyncInvoker(
        ShowHostedDirectConnectRequest request) {
        return new AsyncInvoker<>(request, DcMeta.showHostedDirectConnect, hcClient);
    }

    /**
     * 更新物理连接信息
     *
     * 更新物理连接信息，包括名字,描述等信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDirectConnectRequest 请求对象
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
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDirectConnectRequest 请求对象
     * @return AsyncInvoker<UpdateDirectConnectRequest, UpdateDirectConnectResponse>
     */
    public AsyncInvoker<UpdateDirectConnectRequest, UpdateDirectConnectResponse> updateDirectConnectAsyncInvoker(
        UpdateDirectConnectRequest request) {
        return new AsyncInvoker<>(request, DcMeta.updateDirectConnect, hcClient);
    }

    /**
     * 更新托管专线连接
     *
     * 合作伙伴更新托管专线.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateHostedDirectConnectRequest 请求对象
     * @return CompletableFuture<UpdateHostedDirectConnectResponse>
     */
    public CompletableFuture<UpdateHostedDirectConnectResponse> updateHostedDirectConnectAsync(
        UpdateHostedDirectConnectRequest request) {
        return hcClient.asyncInvokeHttp(request, DcMeta.updateHostedDirectConnect);
    }

    /**
     * 更新托管专线连接
     *
     * 合作伙伴更新托管专线.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateHostedDirectConnectRequest 请求对象
     * @return AsyncInvoker<UpdateHostedDirectConnectRequest, UpdateHostedDirectConnectResponse>
     */
    public AsyncInvoker<UpdateHostedDirectConnectRequest, UpdateHostedDirectConnectResponse> updateHostedDirectConnectAsyncInvoker(
        UpdateHostedDirectConnectRequest request) {
        return new AsyncInvoker<>(request, DcMeta.updateHostedDirectConnect, hcClient);
    }

    /**
     * 查询专线接入点位置列表
     *
     * 查询本区域下所有专线的接入点的信息，分页查询使用的参数为marker、limit。marker和limit一起使用时才会生效，单独使用无效。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDirectConnectLocationsRequest 请求对象
     * @return CompletableFuture<ListDirectConnectLocationsResponse>
     */
    public CompletableFuture<ListDirectConnectLocationsResponse> listDirectConnectLocationsAsync(
        ListDirectConnectLocationsRequest request) {
        return hcClient.asyncInvokeHttp(request, DcMeta.listDirectConnectLocations);
    }

    /**
     * 查询专线接入点位置列表
     *
     * 查询本区域下所有专线的接入点的信息，分页查询使用的参数为marker、limit。marker和limit一起使用时才会生效，单独使用无效。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDirectConnectLocationsRequest 请求对象
     * @return AsyncInvoker<ListDirectConnectLocationsRequest, ListDirectConnectLocationsResponse>
     */
    public AsyncInvoker<ListDirectConnectLocationsRequest, ListDirectConnectLocationsResponse> listDirectConnectLocationsAsyncInvoker(
        ListDirectConnectLocationsRequest request) {
        return new AsyncInvoker<>(request, DcMeta.listDirectConnectLocations, hcClient);
    }

    /**
     * 查询指定专线接入点详情
     *
     * 查询指定的专线接入点详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDirectConnectLocationRequest 请求对象
     * @return CompletableFuture<ShowDirectConnectLocationResponse>
     */
    public CompletableFuture<ShowDirectConnectLocationResponse> showDirectConnectLocationAsync(
        ShowDirectConnectLocationRequest request) {
        return hcClient.asyncInvokeHttp(request, DcMeta.showDirectConnectLocation);
    }

    /**
     * 查询指定专线接入点详情
     *
     * 查询指定的专线接入点详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDirectConnectLocationRequest 请求对象
     * @return AsyncInvoker<ShowDirectConnectLocationRequest, ShowDirectConnectLocationResponse>
     */
    public AsyncInvoker<ShowDirectConnectLocationRequest, ShowDirectConnectLocationResponse> showDirectConnectLocationAsyncInvoker(
        ShowDirectConnectLocationRequest request) {
        return new AsyncInvoker<>(request, DcMeta.showDirectConnectLocation, hcClient);
    }

    /**
     * 查询全域接入网关路由表
     *
     * 查询全域接入网关路由表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGdgwRouteTablesRequest 请求对象
     * @return CompletableFuture<ListGdgwRouteTablesResponse>
     */
    public CompletableFuture<ListGdgwRouteTablesResponse> listGdgwRouteTablesAsync(ListGdgwRouteTablesRequest request) {
        return hcClient.asyncInvokeHttp(request, DcMeta.listGdgwRouteTables);
    }

    /**
     * 查询全域接入网关路由表
     *
     * 查询全域接入网关路由表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGdgwRouteTablesRequest 请求对象
     * @return AsyncInvoker<ListGdgwRouteTablesRequest, ListGdgwRouteTablesResponse>
     */
    public AsyncInvoker<ListGdgwRouteTablesRequest, ListGdgwRouteTablesResponse> listGdgwRouteTablesAsyncInvoker(
        ListGdgwRouteTablesRequest request) {
        return new AsyncInvoker<>(request, DcMeta.listGdgwRouteTables, hcClient);
    }

    /**
     * 修改全域接入网关路由表
     *
     * # 支持的修改操作：
     * **注意：新增、删除、修改操作互斥，一次请求只能执行其中一类操作**
     * + 1. 新增下一跳路由
     * + 2. 删除下一跳路由
     * + 3. 修改路由描述
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateGdgwRouteTableRequest 请求对象
     * @return CompletableFuture<UpdateGdgwRouteTableResponse>
     */
    public CompletableFuture<UpdateGdgwRouteTableResponse> updateGdgwRouteTableAsync(
        UpdateGdgwRouteTableRequest request) {
        return hcClient.asyncInvokeHttp(request, DcMeta.updateGdgwRouteTable);
    }

    /**
     * 修改全域接入网关路由表
     *
     * # 支持的修改操作：
     * **注意：新增、删除、修改操作互斥，一次请求只能执行其中一类操作**
     * + 1. 新增下一跳路由
     * + 2. 删除下一跳路由
     * + 3. 修改路由描述
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateGdgwRouteTableRequest 请求对象
     * @return AsyncInvoker<UpdateGdgwRouteTableRequest, UpdateGdgwRouteTableResponse>
     */
    public AsyncInvoker<UpdateGdgwRouteTableRequest, UpdateGdgwRouteTableResponse> updateGdgwRouteTableAsyncInvoker(
        UpdateGdgwRouteTableRequest request) {
        return new AsyncInvoker<>(request, DcMeta.updateGdgwRouteTable, hcClient);
    }

    /**
     * 创建专线全域接入网关
     *
     * 创建专线全域接入网关实例(global-dc-gateway)，用于接入全球的ER实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateGlobalDcGatewayRequest 请求对象
     * @return CompletableFuture<CreateGlobalDcGatewayResponse>
     */
    public CompletableFuture<CreateGlobalDcGatewayResponse> createGlobalDcGatewayAsync(
        CreateGlobalDcGatewayRequest request) {
        return hcClient.asyncInvokeHttp(request, DcMeta.createGlobalDcGateway);
    }

    /**
     * 创建专线全域接入网关
     *
     * 创建专线全域接入网关实例(global-dc-gateway)，用于接入全球的ER实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateGlobalDcGatewayRequest 请求对象
     * @return AsyncInvoker<CreateGlobalDcGatewayRequest, CreateGlobalDcGatewayResponse>
     */
    public AsyncInvoker<CreateGlobalDcGatewayRequest, CreateGlobalDcGatewayResponse> createGlobalDcGatewayAsyncInvoker(
        CreateGlobalDcGatewayRequest request) {
        return new AsyncInvoker<>(request, DcMeta.createGlobalDcGateway, hcClient);
    }

    /**
     * 删除专线全域接入网关
     *
     * 删除专线全域接入网关global-dc-gateway实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteGlobalDcGatewayRequest 请求对象
     * @return CompletableFuture<DeleteGlobalDcGatewayResponse>
     */
    public CompletableFuture<DeleteGlobalDcGatewayResponse> deleteGlobalDcGatewayAsync(
        DeleteGlobalDcGatewayRequest request) {
        return hcClient.asyncInvokeHttp(request, DcMeta.deleteGlobalDcGateway);
    }

    /**
     * 删除专线全域接入网关
     *
     * 删除专线全域接入网关global-dc-gateway实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteGlobalDcGatewayRequest 请求对象
     * @return AsyncInvoker<DeleteGlobalDcGatewayRequest, DeleteGlobalDcGatewayResponse>
     */
    public AsyncInvoker<DeleteGlobalDcGatewayRequest, DeleteGlobalDcGatewayResponse> deleteGlobalDcGatewayAsyncInvoker(
        DeleteGlobalDcGatewayRequest request) {
        return new AsyncInvoker<>(request, DcMeta.deleteGlobalDcGateway, hcClient);
    }

    /**
     * 查询专线全域接入网关列表
     *
     * 查询专线全域接入网关列表，建议使用分页查询 分页查询使用的参数为marker、limit。marker和limit一起使用时才会生效，单独使用无效
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGlobalDcGatewaysRequest 请求对象
     * @return CompletableFuture<ListGlobalDcGatewaysResponse>
     */
    public CompletableFuture<ListGlobalDcGatewaysResponse> listGlobalDcGatewaysAsync(
        ListGlobalDcGatewaysRequest request) {
        return hcClient.asyncInvokeHttp(request, DcMeta.listGlobalDcGateways);
    }

    /**
     * 查询专线全域接入网关列表
     *
     * 查询专线全域接入网关列表，建议使用分页查询 分页查询使用的参数为marker、limit。marker和limit一起使用时才会生效，单独使用无效
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGlobalDcGatewaysRequest 请求对象
     * @return AsyncInvoker<ListGlobalDcGatewaysRequest, ListGlobalDcGatewaysResponse>
     */
    public AsyncInvoker<ListGlobalDcGatewaysRequest, ListGlobalDcGatewaysResponse> listGlobalDcGatewaysAsyncInvoker(
        ListGlobalDcGatewaysRequest request) {
        return new AsyncInvoker<>(request, DcMeta.listGlobalDcGateways, hcClient);
    }

    /**
     * 查询专线全域接入网关详情
     *
     * 查询专线全域接入网关实例详情信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGlobalDcGatewayRequest 请求对象
     * @return CompletableFuture<ShowGlobalDcGatewayResponse>
     */
    public CompletableFuture<ShowGlobalDcGatewayResponse> showGlobalDcGatewayAsync(ShowGlobalDcGatewayRequest request) {
        return hcClient.asyncInvokeHttp(request, DcMeta.showGlobalDcGateway);
    }

    /**
     * 查询专线全域接入网关详情
     *
     * 查询专线全域接入网关实例详情信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGlobalDcGatewayRequest 请求对象
     * @return AsyncInvoker<ShowGlobalDcGatewayRequest, ShowGlobalDcGatewayResponse>
     */
    public AsyncInvoker<ShowGlobalDcGatewayRequest, ShowGlobalDcGatewayResponse> showGlobalDcGatewayAsyncInvoker(
        ShowGlobalDcGatewayRequest request) {
        return new AsyncInvoker<>(request, DcMeta.showGlobalDcGateway, hcClient);
    }

    /**
     * 更新专线全域接入网关
     *
     * 更新专线全域接入网关global-dc-gateway的名字，描述等信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateGlobalDcGatewayRequest 请求对象
     * @return CompletableFuture<UpdateGlobalDcGatewayResponse>
     */
    public CompletableFuture<UpdateGlobalDcGatewayResponse> updateGlobalDcGatewayAsync(
        UpdateGlobalDcGatewayRequest request) {
        return hcClient.asyncInvokeHttp(request, DcMeta.updateGlobalDcGateway);
    }

    /**
     * 更新专线全域接入网关
     *
     * 更新专线全域接入网关global-dc-gateway的名字，描述等信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateGlobalDcGatewayRequest 请求对象
     * @return AsyncInvoker<UpdateGlobalDcGatewayRequest, UpdateGlobalDcGatewayResponse>
     */
    public AsyncInvoker<UpdateGlobalDcGatewayRequest, UpdateGlobalDcGatewayResponse> updateGlobalDcGatewayAsyncInvoker(
        UpdateGlobalDcGatewayRequest request) {
        return new AsyncInvoker<>(request, DcMeta.updateGlobalDcGateway, hcClient);
    }

    /**
     * 创建专线关联连接
     *
     * 创建专线全域接入网关的关联连接peer-link对象，用于连接企业路由器或者其他接入网关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePeerLinkRequest 请求对象
     * @return CompletableFuture<CreatePeerLinkResponse>
     */
    public CompletableFuture<CreatePeerLinkResponse> createPeerLinkAsync(CreatePeerLinkRequest request) {
        return hcClient.asyncInvokeHttp(request, DcMeta.createPeerLink);
    }

    /**
     * 创建专线关联连接
     *
     * 创建专线全域接入网关的关联连接peer-link对象，用于连接企业路由器或者其他接入网关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePeerLinkRequest 请求对象
     * @return AsyncInvoker<CreatePeerLinkRequest, CreatePeerLinkResponse>
     */
    public AsyncInvoker<CreatePeerLinkRequest, CreatePeerLinkResponse> createPeerLinkAsyncInvoker(
        CreatePeerLinkRequest request) {
        return new AsyncInvoker<>(request, DcMeta.createPeerLink, hcClient);
    }

    /**
     * 删除专线关联连接
     *
     * 删除全域接入网关与ER的关联连接peer-link
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePeerLinkRequest 请求对象
     * @return CompletableFuture<DeletePeerLinkResponse>
     */
    public CompletableFuture<DeletePeerLinkResponse> deletePeerLinkAsync(DeletePeerLinkRequest request) {
        return hcClient.asyncInvokeHttp(request, DcMeta.deletePeerLink);
    }

    /**
     * 删除专线关联连接
     *
     * 删除全域接入网关与ER的关联连接peer-link
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePeerLinkRequest 请求对象
     * @return AsyncInvoker<DeletePeerLinkRequest, DeletePeerLinkResponse>
     */
    public AsyncInvoker<DeletePeerLinkRequest, DeletePeerLinkResponse> deletePeerLinkAsyncInvoker(
        DeletePeerLinkRequest request) {
        return new AsyncInvoker<>(request, DcMeta.deletePeerLink, hcClient);
    }

    /**
     * 查询专线关联连接列表
     *
     * 查询全域接入网关与ER等对象的关联连接列表，分页查询使用的参数为marker、limit。marker和limit一起使用时才会生效，单独使用无效
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPeerLinksRequest 请求对象
     * @return CompletableFuture<ListPeerLinksResponse>
     */
    public CompletableFuture<ListPeerLinksResponse> listPeerLinksAsync(ListPeerLinksRequest request) {
        return hcClient.asyncInvokeHttp(request, DcMeta.listPeerLinks);
    }

    /**
     * 查询专线关联连接列表
     *
     * 查询全域接入网关与ER等对象的关联连接列表，分页查询使用的参数为marker、limit。marker和limit一起使用时才会生效，单独使用无效
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPeerLinksRequest 请求对象
     * @return AsyncInvoker<ListPeerLinksRequest, ListPeerLinksResponse>
     */
    public AsyncInvoker<ListPeerLinksRequest, ListPeerLinksResponse> listPeerLinksAsyncInvoker(
        ListPeerLinksRequest request) {
        return new AsyncInvoker<>(request, DcMeta.listPeerLinks, hcClient);
    }

    /**
     * 查询专线关联连接详情
     *
     * 查询指定接入网关的指定的关联连接(peer link)详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPeerLinkRequest 请求对象
     * @return CompletableFuture<ShowPeerLinkResponse>
     */
    public CompletableFuture<ShowPeerLinkResponse> showPeerLinkAsync(ShowPeerLinkRequest request) {
        return hcClient.asyncInvokeHttp(request, DcMeta.showPeerLink);
    }

    /**
     * 查询专线关联连接详情
     *
     * 查询指定接入网关的指定的关联连接(peer link)详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPeerLinkRequest 请求对象
     * @return AsyncInvoker<ShowPeerLinkRequest, ShowPeerLinkResponse>
     */
    public AsyncInvoker<ShowPeerLinkRequest, ShowPeerLinkResponse> showPeerLinkAsyncInvoker(
        ShowPeerLinkRequest request) {
        return new AsyncInvoker<>(request, DcMeta.showPeerLink, hcClient);
    }

    /**
     * 更新专线关联连接
     *
     * 更新接入网关与ER对接的关联连接peer-link
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePeerLinkRequest 请求对象
     * @return CompletableFuture<UpdatePeerLinkResponse>
     */
    public CompletableFuture<UpdatePeerLinkResponse> updatePeerLinkAsync(UpdatePeerLinkRequest request) {
        return hcClient.asyncInvokeHttp(request, DcMeta.updatePeerLink);
    }

    /**
     * 更新专线关联连接
     *
     * 更新接入网关与ER对接的关联连接peer-link
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePeerLinkRequest 请求对象
     * @return AsyncInvoker<UpdatePeerLinkRequest, UpdatePeerLinkResponse>
     */
    public AsyncInvoker<UpdatePeerLinkRequest, UpdatePeerLinkResponse> updatePeerLinkAsyncInvoker(
        UpdatePeerLinkRequest request) {
        return new AsyncInvoker<>(request, DcMeta.updatePeerLink, hcClient);
    }

    /**
     * 查询配额
     *
     * 查询租户各类资源的使用情况，如Directconnect的使用量，虚拟接口的使用量等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowQuotasRequest 请求对象
     * @return CompletableFuture<ShowQuotasResponse>
     */
    public CompletableFuture<ShowQuotasResponse> showQuotasAsync(ShowQuotasRequest request) {
        return hcClient.asyncInvokeHttp(request, DcMeta.showQuotas);
    }

    /**
     * 查询配额
     *
     * 查询租户各类资源的使用情况，如Directconnect的使用量，虚拟接口的使用量等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowQuotasRequest 请求对象
     * @return AsyncInvoker<ShowQuotasRequest, ShowQuotasResponse>
     */
    public AsyncInvoker<ShowQuotasRequest, ShowQuotasResponse> showQuotasAsyncInvoker(ShowQuotasRequest request) {
        return new AsyncInvoker<>(request, DcMeta.showQuotas, hcClient);
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
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateResourceTagsRequest 请求对象
     * @return AsyncInvoker<BatchCreateResourceTagsRequest, BatchCreateResourceTagsResponse>
     */
    public AsyncInvoker<BatchCreateResourceTagsRequest, BatchCreateResourceTagsResponse> batchCreateResourceTagsAsyncInvoker(
        BatchCreateResourceTagsRequest request) {
        return new AsyncInvoker<>(request, DcMeta.batchCreateResourceTags, hcClient);
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
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateResourceTagRequest 请求对象
     * @return AsyncInvoker<CreateResourceTagRequest, CreateResourceTagResponse>
     */
    public AsyncInvoker<CreateResourceTagRequest, CreateResourceTagResponse> createResourceTagAsyncInvoker(
        CreateResourceTagRequest request) {
        return new AsyncInvoker<>(request, DcMeta.createResourceTag, hcClient);
    }

    /**
     * 删除资源标签
     *
     * 删除时,不对标签字符集做校验，调用接口前必须要做encodeURI，服务端需要对接口uri做decodeURI。删除的key不存在报404，Key不能为空或者空字符串。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteResourceTagRequest 请求对象
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
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteResourceTagRequest 请求对象
     * @return AsyncInvoker<DeleteResourceTagRequest, DeleteResourceTagResponse>
     */
    public AsyncInvoker<DeleteResourceTagRequest, DeleteResourceTagResponse> deleteResourceTagAsyncInvoker(
        DeleteResourceTagRequest request) {
        return new AsyncInvoker<>(request, DcMeta.deleteResourceTag, hcClient);
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
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectTagsRequest 请求对象
     * @return AsyncInvoker<ListProjectTagsRequest, ListProjectTagsResponse>
     */
    public AsyncInvoker<ListProjectTagsRequest, ListProjectTagsResponse> listProjectTagsAsyncInvoker(
        ListProjectTagsRequest request) {
        return new AsyncInvoker<>(request, DcMeta.listProjectTags, hcClient);
    }

    /**
     * 通过标签查询资源实例
     *
     * 通过标签查询资源实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTagResourceInstancesRequest 请求对象
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
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTagResourceInstancesRequest 请求对象
     * @return AsyncInvoker<ListTagResourceInstancesRequest, ListTagResourceInstancesResponse>
     */
    public AsyncInvoker<ListTagResourceInstancesRequest, ListTagResourceInstancesResponse> listTagResourceInstancesAsyncInvoker(
        ListTagResourceInstancesRequest request) {
        return new AsyncInvoker<>(request, DcMeta.listTagResourceInstances, hcClient);
    }

    /**
     * 查询资源标签
     *
     * 查询资源标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowResourceTagRequest 请求对象
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
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowResourceTagRequest 请求对象
     * @return AsyncInvoker<ShowResourceTagRequest, ShowResourceTagResponse>
     */
    public AsyncInvoker<ShowResourceTagRequest, ShowResourceTagResponse> showResourceTagAsyncInvoker(
        ShowResourceTagRequest request) {
        return new AsyncInvoker<>(request, DcMeta.showResourceTag, hcClient);
    }

    /**
     * 创建虚拟网关
     *
     * 创建虚拟网关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateVirtualGatewayRequest 请求对象
     * @return CompletableFuture<CreateVirtualGatewayResponse>
     */
    public CompletableFuture<CreateVirtualGatewayResponse> createVirtualGatewayAsync(
        CreateVirtualGatewayRequest request) {
        return hcClient.asyncInvokeHttp(request, DcMeta.createVirtualGateway);
    }

    /**
     * 创建虚拟网关
     *
     * 创建虚拟网关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateVirtualGatewayRequest 请求对象
     * @return AsyncInvoker<CreateVirtualGatewayRequest, CreateVirtualGatewayResponse>
     */
    public AsyncInvoker<CreateVirtualGatewayRequest, CreateVirtualGatewayResponse> createVirtualGatewayAsyncInvoker(
        CreateVirtualGatewayRequest request) {
        return new AsyncInvoker<>(request, DcMeta.createVirtualGateway, hcClient);
    }

    /**
     * 删除虚拟网关
     *
     * 删除指定的虚拟网关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteVirtualGatewayRequest 请求对象
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
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteVirtualGatewayRequest 请求对象
     * @return AsyncInvoker<DeleteVirtualGatewayRequest, DeleteVirtualGatewayResponse>
     */
    public AsyncInvoker<DeleteVirtualGatewayRequest, DeleteVirtualGatewayResponse> deleteVirtualGatewayAsyncInvoker(
        DeleteVirtualGatewayRequest request) {
        return new AsyncInvoker<>(request, DcMeta.deleteVirtualGateway, hcClient);
    }

    /**
     * 查询虚拟网关列表
     *
     * 查询虚拟网关列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVirtualGatewaysRequest 请求对象
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
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVirtualGatewaysRequest 请求对象
     * @return AsyncInvoker<ListVirtualGatewaysRequest, ListVirtualGatewaysResponse>
     */
    public AsyncInvoker<ListVirtualGatewaysRequest, ListVirtualGatewaysResponse> listVirtualGatewaysAsyncInvoker(
        ListVirtualGatewaysRequest request) {
        return new AsyncInvoker<>(request, DcMeta.listVirtualGateways, hcClient);
    }

    /**
     * 查询虚拟网关详情
     *
     * 查询指定虚拟网关的详细信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowVirtualGatewayRequest 请求对象
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
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowVirtualGatewayRequest 请求对象
     * @return AsyncInvoker<ShowVirtualGatewayRequest, ShowVirtualGatewayResponse>
     */
    public AsyncInvoker<ShowVirtualGatewayRequest, ShowVirtualGatewayResponse> showVirtualGatewayAsyncInvoker(
        ShowVirtualGatewayRequest request) {
        return new AsyncInvoker<>(request, DcMeta.showVirtualGateway, hcClient);
    }

    /**
     * 更新虚拟网关信息
     *
     * 更新虚拟网关的信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateVirtualGatewayRequest 请求对象
     * @return CompletableFuture<UpdateVirtualGatewayResponse>
     */
    public CompletableFuture<UpdateVirtualGatewayResponse> updateVirtualGatewayAsync(
        UpdateVirtualGatewayRequest request) {
        return hcClient.asyncInvokeHttp(request, DcMeta.updateVirtualGateway);
    }

    /**
     * 更新虚拟网关信息
     *
     * 更新虚拟网关的信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateVirtualGatewayRequest 请求对象
     * @return AsyncInvoker<UpdateVirtualGatewayRequest, UpdateVirtualGatewayResponse>
     */
    public AsyncInvoker<UpdateVirtualGatewayRequest, UpdateVirtualGatewayResponse> updateVirtualGatewayAsyncInvoker(
        UpdateVirtualGatewayRequest request) {
        return new AsyncInvoker<>(request, DcMeta.updateVirtualGateway, hcClient);
    }

    /**
     * 创建虚拟接口对等体
     *
     * 每个虚拟接口可支持两个对等体，IPv4和IPv6对等体，在创建虚拟接口时默认创建IPv4对等体， 本接口一般用于增加ipv6对等体。创建虚拟接口对接体之后，可以通过虚拟接口查询配置结果 本接口只在支持Ipv6的区域开放，如需要使用请联系客服
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateVifPeerRequest 请求对象
     * @return CompletableFuture<CreateVifPeerResponse>
     */
    public CompletableFuture<CreateVifPeerResponse> createVifPeerAsync(CreateVifPeerRequest request) {
        return hcClient.asyncInvokeHttp(request, DcMeta.createVifPeer);
    }

    /**
     * 创建虚拟接口对等体
     *
     * 每个虚拟接口可支持两个对等体，IPv4和IPv6对等体，在创建虚拟接口时默认创建IPv4对等体， 本接口一般用于增加ipv6对等体。创建虚拟接口对接体之后，可以通过虚拟接口查询配置结果 本接口只在支持Ipv6的区域开放，如需要使用请联系客服
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateVifPeerRequest 请求对象
     * @return AsyncInvoker<CreateVifPeerRequest, CreateVifPeerResponse>
     */
    public AsyncInvoker<CreateVifPeerRequest, CreateVifPeerResponse> createVifPeerAsyncInvoker(
        CreateVifPeerRequest request) {
        return new AsyncInvoker<>(request, DcMeta.createVifPeer, hcClient);
    }

    /**
     * 创建虚拟接口
     *
     * 虚拟接口配置物理专线上与客户互联的IP和路由等相关信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateVirtualInterfaceRequest 请求对象
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
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateVirtualInterfaceRequest 请求对象
     * @return AsyncInvoker<CreateVirtualInterfaceRequest, CreateVirtualInterfaceResponse>
     */
    public AsyncInvoker<CreateVirtualInterfaceRequest, CreateVirtualInterfaceResponse> createVirtualInterfaceAsyncInvoker(
        CreateVirtualInterfaceRequest request) {
        return new AsyncInvoker<>(request, DcMeta.createVirtualInterface, hcClient);
    }

    /**
     * 删除虚拟接口对应的对等体
     *
     * 删除虚拟接口对等体信息,虚拟接口至少要含一个对等体，最后一个对等体不能删除 本接口只在支持Ipv6的区域开放，如需要使用请联系客服
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteVifPeerRequest 请求对象
     * @return CompletableFuture<DeleteVifPeerResponse>
     */
    public CompletableFuture<DeleteVifPeerResponse> deleteVifPeerAsync(DeleteVifPeerRequest request) {
        return hcClient.asyncInvokeHttp(request, DcMeta.deleteVifPeer);
    }

    /**
     * 删除虚拟接口对应的对等体
     *
     * 删除虚拟接口对等体信息,虚拟接口至少要含一个对等体，最后一个对等体不能删除 本接口只在支持Ipv6的区域开放，如需要使用请联系客服
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteVifPeerRequest 请求对象
     * @return AsyncInvoker<DeleteVifPeerRequest, DeleteVifPeerResponse>
     */
    public AsyncInvoker<DeleteVifPeerRequest, DeleteVifPeerResponse> deleteVifPeerAsyncInvoker(
        DeleteVifPeerRequest request) {
        return new AsyncInvoker<>(request, DcMeta.deleteVifPeer, hcClient);
    }

    /**
     * 删除虚拟接口
     *
     * 删除虚拟接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteVirtualInterfaceRequest 请求对象
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
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteVirtualInterfaceRequest 请求对象
     * @return AsyncInvoker<DeleteVirtualInterfaceRequest, DeleteVirtualInterfaceResponse>
     */
    public AsyncInvoker<DeleteVirtualInterfaceRequest, DeleteVirtualInterfaceResponse> deleteVirtualInterfaceAsyncInvoker(
        DeleteVirtualInterfaceRequest request) {
        return new AsyncInvoker<>(request, DcMeta.deleteVirtualInterface, hcClient);
    }

    /**
     * 查询虚拟接口倒换测试记录列表
     *
     * 查询倒换测试记录列表，只展示operate_status为COMPELTE的记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSwitchoverTestRecordsRequest 请求对象
     * @return CompletableFuture<ListSwitchoverTestRecordsResponse>
     */
    public CompletableFuture<ListSwitchoverTestRecordsResponse> listSwitchoverTestRecordsAsync(
        ListSwitchoverTestRecordsRequest request) {
        return hcClient.asyncInvokeHttp(request, DcMeta.listSwitchoverTestRecords);
    }

    /**
     * 查询虚拟接口倒换测试记录列表
     *
     * 查询倒换测试记录列表，只展示operate_status为COMPELTE的记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSwitchoverTestRecordsRequest 请求对象
     * @return AsyncInvoker<ListSwitchoverTestRecordsRequest, ListSwitchoverTestRecordsResponse>
     */
    public AsyncInvoker<ListSwitchoverTestRecordsRequest, ListSwitchoverTestRecordsResponse> listSwitchoverTestRecordsAsyncInvoker(
        ListSwitchoverTestRecordsRequest request) {
        return new AsyncInvoker<>(request, DcMeta.listSwitchoverTestRecords, hcClient);
    }

    /**
     * 查询虚拟接口列表
     *
     * 查询租户所有的虚拟接口列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVirtualInterfacesRequest 请求对象
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
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVirtualInterfacesRequest 请求对象
     * @return AsyncInvoker<ListVirtualInterfacesRequest, ListVirtualInterfacesResponse>
     */
    public AsyncInvoker<ListVirtualInterfacesRequest, ListVirtualInterfacesResponse> listVirtualInterfacesAsyncInvoker(
        ListVirtualInterfacesRequest request) {
        return new AsyncInvoker<>(request, DcMeta.listVirtualInterfaces, hcClient);
    }

    /**
     * 查询虚拟接口详情
     *
     * 查询虚拟接口详细信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowVirtualInterfaceRequest 请求对象
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
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowVirtualInterfaceRequest 请求对象
     * @return AsyncInvoker<ShowVirtualInterfaceRequest, ShowVirtualInterfaceResponse>
     */
    public AsyncInvoker<ShowVirtualInterfaceRequest, ShowVirtualInterfaceResponse> showVirtualInterfaceAsyncInvoker(
        ShowVirtualInterfaceRequest request) {
        return new AsyncInvoker<>(request, DcMeta.showVirtualInterface, hcClient);
    }

    /**
     * 执行虚拟接口倒换测试
     *
     * 客户双专线接入，需要支持双线自动倒换，方便进行功能测试。 虚拟接口进行倒换测试会导致接口关闭，业务流量中断。 对于虚拟接口，支持“关闭接口”和“开放接口”两种操作。 1、关闭接口：下发shutdown命令，关闭接口； 2、开放接口：下发undo_shutdown命令，使能接口。 倒换测试选择shutdown时，虚拟接口的状态为ADMIN_SHUTDOWN，此状态不允许虚拟接口的其他操作。 倒换测试选择undo_shutdown时，虚拟接口的状态为ACTIVE。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchoverTestRequest 请求对象
     * @return CompletableFuture<SwitchoverTestResponse>
     */
    public CompletableFuture<SwitchoverTestResponse> switchoverTestAsync(SwitchoverTestRequest request) {
        return hcClient.asyncInvokeHttp(request, DcMeta.switchoverTest);
    }

    /**
     * 执行虚拟接口倒换测试
     *
     * 客户双专线接入，需要支持双线自动倒换，方便进行功能测试。 虚拟接口进行倒换测试会导致接口关闭，业务流量中断。 对于虚拟接口，支持“关闭接口”和“开放接口”两种操作。 1、关闭接口：下发shutdown命令，关闭接口； 2、开放接口：下发undo_shutdown命令，使能接口。 倒换测试选择shutdown时，虚拟接口的状态为ADMIN_SHUTDOWN，此状态不允许虚拟接口的其他操作。 倒换测试选择undo_shutdown时，虚拟接口的状态为ACTIVE。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchoverTestRequest 请求对象
     * @return AsyncInvoker<SwitchoverTestRequest, SwitchoverTestResponse>
     */
    public AsyncInvoker<SwitchoverTestRequest, SwitchoverTestResponse> switchoverTestAsyncInvoker(
        SwitchoverTestRequest request) {
        return new AsyncInvoker<>(request, DcMeta.switchoverTest, hcClient);
    }

    /**
     * 更新虚拟接口对等体
     *
     * 更新虚拟接口对等体信息,包括远端子网，名字和描述等。 本接口只在支持Ipv6的区域开放，如需要使用请联系客服
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateVifPeerRequest 请求对象
     * @return CompletableFuture<UpdateVifPeerResponse>
     */
    public CompletableFuture<UpdateVifPeerResponse> updateVifPeerAsync(UpdateVifPeerRequest request) {
        return hcClient.asyncInvokeHttp(request, DcMeta.updateVifPeer);
    }

    /**
     * 更新虚拟接口对等体
     *
     * 更新虚拟接口对等体信息,包括远端子网，名字和描述等。 本接口只在支持Ipv6的区域开放，如需要使用请联系客服
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateVifPeerRequest 请求对象
     * @return AsyncInvoker<UpdateVifPeerRequest, UpdateVifPeerResponse>
     */
    public AsyncInvoker<UpdateVifPeerRequest, UpdateVifPeerResponse> updateVifPeerAsyncInvoker(
        UpdateVifPeerRequest request) {
        return new AsyncInvoker<>(request, DcMeta.updateVifPeer, hcClient);
    }

    /**
     * 更新虚拟接口
     *
     * 更新虚拟接口的详细信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateVirtualInterfaceRequest 请求对象
     * @return CompletableFuture<UpdateVirtualInterfaceResponse>
     */
    public CompletableFuture<UpdateVirtualInterfaceResponse> updateVirtualInterfaceAsync(
        UpdateVirtualInterfaceRequest request) {
        return hcClient.asyncInvokeHttp(request, DcMeta.updateVirtualInterface);
    }

    /**
     * 更新虚拟接口
     *
     * 更新虚拟接口的详细信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateVirtualInterfaceRequest 请求对象
     * @return AsyncInvoker<UpdateVirtualInterfaceRequest, UpdateVirtualInterfaceResponse>
     */
    public AsyncInvoker<UpdateVirtualInterfaceRequest, UpdateVirtualInterfaceResponse> updateVirtualInterfaceAsyncInvoker(
        UpdateVirtualInterfaceRequest request) {
        return new AsyncInvoker<>(request, DcMeta.updateVirtualInterface, hcClient);
    }

}
