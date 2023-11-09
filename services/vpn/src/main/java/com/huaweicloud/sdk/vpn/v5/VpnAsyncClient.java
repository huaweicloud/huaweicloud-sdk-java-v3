package com.huaweicloud.sdk.vpn.v5;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.vpn.v5.model.CreateCgwRequest;
import com.huaweicloud.sdk.vpn.v5.model.CreateCgwResponse;
import com.huaweicloud.sdk.vpn.v5.model.CreateConnectionMonitorRequest;
import com.huaweicloud.sdk.vpn.v5.model.CreateConnectionMonitorResponse;
import com.huaweicloud.sdk.vpn.v5.model.CreateVgwCertificateRequest;
import com.huaweicloud.sdk.vpn.v5.model.CreateVgwCertificateResponse;
import com.huaweicloud.sdk.vpn.v5.model.CreateVgwRequest;
import com.huaweicloud.sdk.vpn.v5.model.CreateVgwResponse;
import com.huaweicloud.sdk.vpn.v5.model.CreateVpnConnectionRequest;
import com.huaweicloud.sdk.vpn.v5.model.CreateVpnConnectionResponse;
import com.huaweicloud.sdk.vpn.v5.model.DeleteCgwRequest;
import com.huaweicloud.sdk.vpn.v5.model.DeleteCgwResponse;
import com.huaweicloud.sdk.vpn.v5.model.DeleteConnectionMonitorRequest;
import com.huaweicloud.sdk.vpn.v5.model.DeleteConnectionMonitorResponse;
import com.huaweicloud.sdk.vpn.v5.model.DeleteVgwRequest;
import com.huaweicloud.sdk.vpn.v5.model.DeleteVgwResponse;
import com.huaweicloud.sdk.vpn.v5.model.DeleteVpnConnectionRequest;
import com.huaweicloud.sdk.vpn.v5.model.DeleteVpnConnectionResponse;
import com.huaweicloud.sdk.vpn.v5.model.ListAvailabilityZonesRequest;
import com.huaweicloud.sdk.vpn.v5.model.ListAvailabilityZonesResponse;
import com.huaweicloud.sdk.vpn.v5.model.ListCgwsRequest;
import com.huaweicloud.sdk.vpn.v5.model.ListCgwsResponse;
import com.huaweicloud.sdk.vpn.v5.model.ListConnectionMonitorsRequest;
import com.huaweicloud.sdk.vpn.v5.model.ListConnectionMonitorsResponse;
import com.huaweicloud.sdk.vpn.v5.model.ListVgwsRequest;
import com.huaweicloud.sdk.vpn.v5.model.ListVgwsResponse;
import com.huaweicloud.sdk.vpn.v5.model.ListVpnConnectionsRequest;
import com.huaweicloud.sdk.vpn.v5.model.ListVpnConnectionsResponse;
import com.huaweicloud.sdk.vpn.v5.model.ShowCgwRequest;
import com.huaweicloud.sdk.vpn.v5.model.ShowCgwResponse;
import com.huaweicloud.sdk.vpn.v5.model.ShowConnectionMonitorRequest;
import com.huaweicloud.sdk.vpn.v5.model.ShowConnectionMonitorResponse;
import com.huaweicloud.sdk.vpn.v5.model.ShowQuotasInfoRequest;
import com.huaweicloud.sdk.vpn.v5.model.ShowQuotasInfoResponse;
import com.huaweicloud.sdk.vpn.v5.model.ShowVgwRequest;
import com.huaweicloud.sdk.vpn.v5.model.ShowVgwResponse;
import com.huaweicloud.sdk.vpn.v5.model.ShowVpnConnectionRequest;
import com.huaweicloud.sdk.vpn.v5.model.ShowVpnConnectionResponse;
import com.huaweicloud.sdk.vpn.v5.model.ShowVpnGatewayCertificateRequest;
import com.huaweicloud.sdk.vpn.v5.model.ShowVpnGatewayCertificateResponse;
import com.huaweicloud.sdk.vpn.v5.model.UpdateCgwRequest;
import com.huaweicloud.sdk.vpn.v5.model.UpdateCgwResponse;
import com.huaweicloud.sdk.vpn.v5.model.UpdateVgwCertificateRequest;
import com.huaweicloud.sdk.vpn.v5.model.UpdateVgwCertificateResponse;
import com.huaweicloud.sdk.vpn.v5.model.UpdateVgwRequest;
import com.huaweicloud.sdk.vpn.v5.model.UpdateVgwResponse;
import com.huaweicloud.sdk.vpn.v5.model.UpdateVpnConnectionRequest;
import com.huaweicloud.sdk.vpn.v5.model.UpdateVpnConnectionResponse;

import java.util.concurrent.CompletableFuture;

public class VpnAsyncClient {

    protected HcClient hcClient;

    public VpnAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<VpnAsyncClient> newBuilder() {
        ClientBuilder<VpnAsyncClient> clientBuilder = new ClientBuilder<>(VpnAsyncClient::new);
        return clientBuilder;
    }

    /**
     * 创建VPN连接监控
     *
     * 创建VPN连接监控
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateConnectionMonitorRequest 请求对象
     * @return CompletableFuture<CreateConnectionMonitorResponse>
     */
    public CompletableFuture<CreateConnectionMonitorResponse> createConnectionMonitorAsync(
        CreateConnectionMonitorRequest request) {
        return hcClient.asyncInvokeHttp(request, VpnMeta.createConnectionMonitor);
    }

    /**
     * 创建VPN连接监控
     *
     * 创建VPN连接监控
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateConnectionMonitorRequest 请求对象
     * @return AsyncInvoker<CreateConnectionMonitorRequest, CreateConnectionMonitorResponse>
     */
    public AsyncInvoker<CreateConnectionMonitorRequest, CreateConnectionMonitorResponse> createConnectionMonitorAsyncInvoker(
        CreateConnectionMonitorRequest request) {
        return new AsyncInvoker<CreateConnectionMonitorRequest, CreateConnectionMonitorResponse>(request,
            VpnMeta.createConnectionMonitor, hcClient);
    }

    /**
     * 删除VPN连接监控
     *
     * 根据VPN连接监控的ID，删除指定的VPN连接监控
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteConnectionMonitorRequest 请求对象
     * @return CompletableFuture<DeleteConnectionMonitorResponse>
     */
    public CompletableFuture<DeleteConnectionMonitorResponse> deleteConnectionMonitorAsync(
        DeleteConnectionMonitorRequest request) {
        return hcClient.asyncInvokeHttp(request, VpnMeta.deleteConnectionMonitor);
    }

    /**
     * 删除VPN连接监控
     *
     * 根据VPN连接监控的ID，删除指定的VPN连接监控
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteConnectionMonitorRequest 请求对象
     * @return AsyncInvoker<DeleteConnectionMonitorRequest, DeleteConnectionMonitorResponse>
     */
    public AsyncInvoker<DeleteConnectionMonitorRequest, DeleteConnectionMonitorResponse> deleteConnectionMonitorAsyncInvoker(
        DeleteConnectionMonitorRequest request) {
        return new AsyncInvoker<DeleteConnectionMonitorRequest, DeleteConnectionMonitorResponse>(request,
            VpnMeta.deleteConnectionMonitor, hcClient);
    }

    /**
     * 查询VPN连接监控列表
     *
     * 查询VPN连接监控列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListConnectionMonitorsRequest 请求对象
     * @return CompletableFuture<ListConnectionMonitorsResponse>
     */
    public CompletableFuture<ListConnectionMonitorsResponse> listConnectionMonitorsAsync(
        ListConnectionMonitorsRequest request) {
        return hcClient.asyncInvokeHttp(request, VpnMeta.listConnectionMonitors);
    }

    /**
     * 查询VPN连接监控列表
     *
     * 查询VPN连接监控列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListConnectionMonitorsRequest 请求对象
     * @return AsyncInvoker<ListConnectionMonitorsRequest, ListConnectionMonitorsResponse>
     */
    public AsyncInvoker<ListConnectionMonitorsRequest, ListConnectionMonitorsResponse> listConnectionMonitorsAsyncInvoker(
        ListConnectionMonitorsRequest request) {
        return new AsyncInvoker<ListConnectionMonitorsRequest, ListConnectionMonitorsResponse>(request,
            VpnMeta.listConnectionMonitors, hcClient);
    }

    /**
     * 查询VPN连接监控
     *
     * 根据VPN连接监控的ID,查询指定的VPN连接监控
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowConnectionMonitorRequest 请求对象
     * @return CompletableFuture<ShowConnectionMonitorResponse>
     */
    public CompletableFuture<ShowConnectionMonitorResponse> showConnectionMonitorAsync(
        ShowConnectionMonitorRequest request) {
        return hcClient.asyncInvokeHttp(request, VpnMeta.showConnectionMonitor);
    }

    /**
     * 查询VPN连接监控
     *
     * 根据VPN连接监控的ID,查询指定的VPN连接监控
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowConnectionMonitorRequest 请求对象
     * @return AsyncInvoker<ShowConnectionMonitorRequest, ShowConnectionMonitorResponse>
     */
    public AsyncInvoker<ShowConnectionMonitorRequest, ShowConnectionMonitorResponse> showConnectionMonitorAsyncInvoker(
        ShowConnectionMonitorRequest request) {
        return new AsyncInvoker<ShowConnectionMonitorRequest, ShowConnectionMonitorResponse>(request,
            VpnMeta.showConnectionMonitor, hcClient);
    }

    /**
     * 创建对端网关
     *
     * 创建租户用于与VPN网关相连的对端网关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateCgwRequest 请求对象
     * @return CompletableFuture<CreateCgwResponse>
     */
    public CompletableFuture<CreateCgwResponse> createCgwAsync(CreateCgwRequest request) {
        return hcClient.asyncInvokeHttp(request, VpnMeta.createCgw);
    }

    /**
     * 创建对端网关
     *
     * 创建租户用于与VPN网关相连的对端网关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateCgwRequest 请求对象
     * @return AsyncInvoker<CreateCgwRequest, CreateCgwResponse>
     */
    public AsyncInvoker<CreateCgwRequest, CreateCgwResponse> createCgwAsyncInvoker(CreateCgwRequest request) {
        return new AsyncInvoker<CreateCgwRequest, CreateCgwResponse>(request, VpnMeta.createCgw, hcClient);
    }

    /**
     * 删除对端网关
     *
     * 根据对端网关ID，删除指定的对端网关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteCgwRequest 请求对象
     * @return CompletableFuture<DeleteCgwResponse>
     */
    public CompletableFuture<DeleteCgwResponse> deleteCgwAsync(DeleteCgwRequest request) {
        return hcClient.asyncInvokeHttp(request, VpnMeta.deleteCgw);
    }

    /**
     * 删除对端网关
     *
     * 根据对端网关ID，删除指定的对端网关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteCgwRequest 请求对象
     * @return AsyncInvoker<DeleteCgwRequest, DeleteCgwResponse>
     */
    public AsyncInvoker<DeleteCgwRequest, DeleteCgwResponse> deleteCgwAsyncInvoker(DeleteCgwRequest request) {
        return new AsyncInvoker<DeleteCgwRequest, DeleteCgwResponse>(request, VpnMeta.deleteCgw, hcClient);
    }

    /**
     * 查询对端网关列表
     *
     * 查询对端网关列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListCgwsRequest 请求对象
     * @return CompletableFuture<ListCgwsResponse>
     */
    public CompletableFuture<ListCgwsResponse> listCgwsAsync(ListCgwsRequest request) {
        return hcClient.asyncInvokeHttp(request, VpnMeta.listCgws);
    }

    /**
     * 查询对端网关列表
     *
     * 查询对端网关列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListCgwsRequest 请求对象
     * @return AsyncInvoker<ListCgwsRequest, ListCgwsResponse>
     */
    public AsyncInvoker<ListCgwsRequest, ListCgwsResponse> listCgwsAsyncInvoker(ListCgwsRequest request) {
        return new AsyncInvoker<ListCgwsRequest, ListCgwsResponse>(request, VpnMeta.listCgws, hcClient);
    }

    /**
     * 查询对端网关
     *
     * 根据对端网关ID，查询指定的对端网关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowCgwRequest 请求对象
     * @return CompletableFuture<ShowCgwResponse>
     */
    public CompletableFuture<ShowCgwResponse> showCgwAsync(ShowCgwRequest request) {
        return hcClient.asyncInvokeHttp(request, VpnMeta.showCgw);
    }

    /**
     * 查询对端网关
     *
     * 根据对端网关ID，查询指定的对端网关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowCgwRequest 请求对象
     * @return AsyncInvoker<ShowCgwRequest, ShowCgwResponse>
     */
    public AsyncInvoker<ShowCgwRequest, ShowCgwResponse> showCgwAsyncInvoker(ShowCgwRequest request) {
        return new AsyncInvoker<ShowCgwRequest, ShowCgwResponse>(request, VpnMeta.showCgw, hcClient);
    }

    /**
     * 更新对端网关
     *
     * 根据对端网关ID，更新指定的对端网关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateCgwRequest 请求对象
     * @return CompletableFuture<UpdateCgwResponse>
     */
    public CompletableFuture<UpdateCgwResponse> updateCgwAsync(UpdateCgwRequest request) {
        return hcClient.asyncInvokeHttp(request, VpnMeta.updateCgw);
    }

    /**
     * 更新对端网关
     *
     * 根据对端网关ID，更新指定的对端网关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateCgwRequest 请求对象
     * @return AsyncInvoker<UpdateCgwRequest, UpdateCgwResponse>
     */
    public AsyncInvoker<UpdateCgwRequest, UpdateCgwResponse> updateCgwAsyncInvoker(UpdateCgwRequest request) {
        return new AsyncInvoker<UpdateCgwRequest, UpdateCgwResponse>(request, VpnMeta.updateCgw, hcClient);
    }

    /**
     * 创建VPN连接
     *
     * 创建VPN连接，连接VPN网关与对端网关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateVpnConnectionRequest 请求对象
     * @return CompletableFuture<CreateVpnConnectionResponse>
     */
    public CompletableFuture<CreateVpnConnectionResponse> createVpnConnectionAsync(CreateVpnConnectionRequest request) {
        return hcClient.asyncInvokeHttp(request, VpnMeta.createVpnConnection);
    }

    /**
     * 创建VPN连接
     *
     * 创建VPN连接，连接VPN网关与对端网关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateVpnConnectionRequest 请求对象
     * @return AsyncInvoker<CreateVpnConnectionRequest, CreateVpnConnectionResponse>
     */
    public AsyncInvoker<CreateVpnConnectionRequest, CreateVpnConnectionResponse> createVpnConnectionAsyncInvoker(
        CreateVpnConnectionRequest request) {
        return new AsyncInvoker<CreateVpnConnectionRequest, CreateVpnConnectionResponse>(request,
            VpnMeta.createVpnConnection, hcClient);
    }

    /**
     * 删除VPN连接
     *
     * 根据连接ID，删除指定的VPN连接
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteVpnConnectionRequest 请求对象
     * @return CompletableFuture<DeleteVpnConnectionResponse>
     */
    public CompletableFuture<DeleteVpnConnectionResponse> deleteVpnConnectionAsync(DeleteVpnConnectionRequest request) {
        return hcClient.asyncInvokeHttp(request, VpnMeta.deleteVpnConnection);
    }

    /**
     * 删除VPN连接
     *
     * 根据连接ID，删除指定的VPN连接
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteVpnConnectionRequest 请求对象
     * @return AsyncInvoker<DeleteVpnConnectionRequest, DeleteVpnConnectionResponse>
     */
    public AsyncInvoker<DeleteVpnConnectionRequest, DeleteVpnConnectionResponse> deleteVpnConnectionAsyncInvoker(
        DeleteVpnConnectionRequest request) {
        return new AsyncInvoker<DeleteVpnConnectionRequest, DeleteVpnConnectionResponse>(request,
            VpnMeta.deleteVpnConnection, hcClient);
    }

    /**
     * 查询VPN连接列表
     *
     * 查询VPN连接列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListVpnConnectionsRequest 请求对象
     * @return CompletableFuture<ListVpnConnectionsResponse>
     */
    public CompletableFuture<ListVpnConnectionsResponse> listVpnConnectionsAsync(ListVpnConnectionsRequest request) {
        return hcClient.asyncInvokeHttp(request, VpnMeta.listVpnConnections);
    }

    /**
     * 查询VPN连接列表
     *
     * 查询VPN连接列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListVpnConnectionsRequest 请求对象
     * @return AsyncInvoker<ListVpnConnectionsRequest, ListVpnConnectionsResponse>
     */
    public AsyncInvoker<ListVpnConnectionsRequest, ListVpnConnectionsResponse> listVpnConnectionsAsyncInvoker(
        ListVpnConnectionsRequest request) {
        return new AsyncInvoker<ListVpnConnectionsRequest, ListVpnConnectionsResponse>(request,
            VpnMeta.listVpnConnections, hcClient);
    }

    /**
     * 查询VPN连接
     *
     * 根据连接ID，查询指定的VPN连接的参数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowVpnConnectionRequest 请求对象
     * @return CompletableFuture<ShowVpnConnectionResponse>
     */
    public CompletableFuture<ShowVpnConnectionResponse> showVpnConnectionAsync(ShowVpnConnectionRequest request) {
        return hcClient.asyncInvokeHttp(request, VpnMeta.showVpnConnection);
    }

    /**
     * 查询VPN连接
     *
     * 根据连接ID，查询指定的VPN连接的参数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowVpnConnectionRequest 请求对象
     * @return AsyncInvoker<ShowVpnConnectionRequest, ShowVpnConnectionResponse>
     */
    public AsyncInvoker<ShowVpnConnectionRequest, ShowVpnConnectionResponse> showVpnConnectionAsyncInvoker(
        ShowVpnConnectionRequest request) {
        return new AsyncInvoker<ShowVpnConnectionRequest, ShowVpnConnectionResponse>(request, VpnMeta.showVpnConnection,
            hcClient);
    }

    /**
     * 更新VPN连接
     *
     * 根据连接ID，更新指定的VPN连接的参数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateVpnConnectionRequest 请求对象
     * @return CompletableFuture<UpdateVpnConnectionResponse>
     */
    public CompletableFuture<UpdateVpnConnectionResponse> updateVpnConnectionAsync(UpdateVpnConnectionRequest request) {
        return hcClient.asyncInvokeHttp(request, VpnMeta.updateVpnConnection);
    }

    /**
     * 更新VPN连接
     *
     * 根据连接ID，更新指定的VPN连接的参数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateVpnConnectionRequest 请求对象
     * @return AsyncInvoker<UpdateVpnConnectionRequest, UpdateVpnConnectionResponse>
     */
    public AsyncInvoker<UpdateVpnConnectionRequest, UpdateVpnConnectionResponse> updateVpnConnectionAsyncInvoker(
        UpdateVpnConnectionRequest request) {
        return new AsyncInvoker<UpdateVpnConnectionRequest, UpdateVpnConnectionResponse>(request,
            VpnMeta.updateVpnConnection, hcClient);
    }

    /**
     * 创建VPN网关
     *
     * 创建一个VPN网关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateVgwRequest 请求对象
     * @return CompletableFuture<CreateVgwResponse>
     */
    public CompletableFuture<CreateVgwResponse> createVgwAsync(CreateVgwRequest request) {
        return hcClient.asyncInvokeHttp(request, VpnMeta.createVgw);
    }

    /**
     * 创建VPN网关
     *
     * 创建一个VPN网关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateVgwRequest 请求对象
     * @return AsyncInvoker<CreateVgwRequest, CreateVgwResponse>
     */
    public AsyncInvoker<CreateVgwRequest, CreateVgwResponse> createVgwAsyncInvoker(CreateVgwRequest request) {
        return new AsyncInvoker<CreateVgwRequest, CreateVgwResponse>(request, VpnMeta.createVgw, hcClient);
    }

    /**
     * 删除VPN网关
     *
     * 根据VPN网关ID，删除指定的VPN网关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteVgwRequest 请求对象
     * @return CompletableFuture<DeleteVgwResponse>
     */
    public CompletableFuture<DeleteVgwResponse> deleteVgwAsync(DeleteVgwRequest request) {
        return hcClient.asyncInvokeHttp(request, VpnMeta.deleteVgw);
    }

    /**
     * 删除VPN网关
     *
     * 根据VPN网关ID，删除指定的VPN网关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteVgwRequest 请求对象
     * @return AsyncInvoker<DeleteVgwRequest, DeleteVgwResponse>
     */
    public AsyncInvoker<DeleteVgwRequest, DeleteVgwResponse> deleteVgwAsyncInvoker(DeleteVgwRequest request) {
        return new AsyncInvoker<DeleteVgwRequest, DeleteVgwResponse>(request, VpnMeta.deleteVgw, hcClient);
    }

    /**
     * 查询VPN网关可用区
     *
     * 查询VPN网关可用区
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAvailabilityZonesRequest 请求对象
     * @return CompletableFuture<ListAvailabilityZonesResponse>
     */
    public CompletableFuture<ListAvailabilityZonesResponse> listAvailabilityZonesAsync(
        ListAvailabilityZonesRequest request) {
        return hcClient.asyncInvokeHttp(request, VpnMeta.listAvailabilityZones);
    }

    /**
     * 查询VPN网关可用区
     *
     * 查询VPN网关可用区
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAvailabilityZonesRequest 请求对象
     * @return AsyncInvoker<ListAvailabilityZonesRequest, ListAvailabilityZonesResponse>
     */
    public AsyncInvoker<ListAvailabilityZonesRequest, ListAvailabilityZonesResponse> listAvailabilityZonesAsyncInvoker(
        ListAvailabilityZonesRequest request) {
        return new AsyncInvoker<ListAvailabilityZonesRequest, ListAvailabilityZonesResponse>(request,
            VpnMeta.listAvailabilityZones, hcClient);
    }

    /**
     * 查询VPN网关列表
     *
     * 查询VPN网关列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListVgwsRequest 请求对象
     * @return CompletableFuture<ListVgwsResponse>
     */
    public CompletableFuture<ListVgwsResponse> listVgwsAsync(ListVgwsRequest request) {
        return hcClient.asyncInvokeHttp(request, VpnMeta.listVgws);
    }

    /**
     * 查询VPN网关列表
     *
     * 查询VPN网关列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListVgwsRequest 请求对象
     * @return AsyncInvoker<ListVgwsRequest, ListVgwsResponse>
     */
    public AsyncInvoker<ListVgwsRequest, ListVgwsResponse> listVgwsAsyncInvoker(ListVgwsRequest request) {
        return new AsyncInvoker<ListVgwsRequest, ListVgwsResponse>(request, VpnMeta.listVgws, hcClient);
    }

    /**
     * 查询VPN网关
     *
     * 根据VPN网关ID，查询指定的VPN网关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowVgwRequest 请求对象
     * @return CompletableFuture<ShowVgwResponse>
     */
    public CompletableFuture<ShowVgwResponse> showVgwAsync(ShowVgwRequest request) {
        return hcClient.asyncInvokeHttp(request, VpnMeta.showVgw);
    }

    /**
     * 查询VPN网关
     *
     * 根据VPN网关ID，查询指定的VPN网关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowVgwRequest 请求对象
     * @return AsyncInvoker<ShowVgwRequest, ShowVgwResponse>
     */
    public AsyncInvoker<ShowVgwRequest, ShowVgwResponse> showVgwAsyncInvoker(ShowVgwRequest request) {
        return new AsyncInvoker<ShowVgwRequest, ShowVgwResponse>(request, VpnMeta.showVgw, hcClient);
    }

    /**
     * 更新VPN网关
     *
     * 根据VPN网关ID，更新指定的VPN网关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateVgwRequest 请求对象
     * @return CompletableFuture<UpdateVgwResponse>
     */
    public CompletableFuture<UpdateVgwResponse> updateVgwAsync(UpdateVgwRequest request) {
        return hcClient.asyncInvokeHttp(request, VpnMeta.updateVgw);
    }

    /**
     * 更新VPN网关
     *
     * 根据VPN网关ID，更新指定的VPN网关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateVgwRequest 请求对象
     * @return AsyncInvoker<UpdateVgwRequest, UpdateVgwResponse>
     */
    public AsyncInvoker<UpdateVgwRequest, UpdateVgwResponse> updateVgwAsyncInvoker(UpdateVgwRequest request) {
        return new AsyncInvoker<UpdateVgwRequest, UpdateVgwResponse>(request, VpnMeta.updateVgw, hcClient);
    }

    /**
     * 导入VPN网关证书
     *
     * 导入租户VPN网关所使用的证书，包括签名证书、签名私钥、加密证书、加密私钥和CA证书链。当前只支持国密证书
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateVgwCertificateRequest 请求对象
     * @return CompletableFuture<CreateVgwCertificateResponse>
     */
    public CompletableFuture<CreateVgwCertificateResponse> createVgwCertificateAsync(
        CreateVgwCertificateRequest request) {
        return hcClient.asyncInvokeHttp(request, VpnMeta.createVgwCertificate);
    }

    /**
     * 导入VPN网关证书
     *
     * 导入租户VPN网关所使用的证书，包括签名证书、签名私钥、加密证书、加密私钥和CA证书链。当前只支持国密证书
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateVgwCertificateRequest 请求对象
     * @return AsyncInvoker<CreateVgwCertificateRequest, CreateVgwCertificateResponse>
     */
    public AsyncInvoker<CreateVgwCertificateRequest, CreateVgwCertificateResponse> createVgwCertificateAsyncInvoker(
        CreateVgwCertificateRequest request) {
        return new AsyncInvoker<CreateVgwCertificateRequest, CreateVgwCertificateResponse>(request,
            VpnMeta.createVgwCertificate, hcClient);
    }

    /**
     * 查询VPN网关证书
     *
     * 根据VPN网关ID，查询所指定的VPN网关证书
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowVpnGatewayCertificateRequest 请求对象
     * @return CompletableFuture<ShowVpnGatewayCertificateResponse>
     */
    public CompletableFuture<ShowVpnGatewayCertificateResponse> showVpnGatewayCertificateAsync(
        ShowVpnGatewayCertificateRequest request) {
        return hcClient.asyncInvokeHttp(request, VpnMeta.showVpnGatewayCertificate);
    }

    /**
     * 查询VPN网关证书
     *
     * 根据VPN网关ID，查询所指定的VPN网关证书
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowVpnGatewayCertificateRequest 请求对象
     * @return AsyncInvoker<ShowVpnGatewayCertificateRequest, ShowVpnGatewayCertificateResponse>
     */
    public AsyncInvoker<ShowVpnGatewayCertificateRequest, ShowVpnGatewayCertificateResponse> showVpnGatewayCertificateAsyncInvoker(
        ShowVpnGatewayCertificateRequest request) {
        return new AsyncInvoker<ShowVpnGatewayCertificateRequest, ShowVpnGatewayCertificateResponse>(request,
            VpnMeta.showVpnGatewayCertificate, hcClient);
    }

    /**
     * 更新VPN网关证书
     *
     * 更新租户VPN网关所使用的证书，包括签名证书、签名私钥、加密证书、加密私钥和CA证书链。当前只支持国密证书
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateVgwCertificateRequest 请求对象
     * @return CompletableFuture<UpdateVgwCertificateResponse>
     */
    public CompletableFuture<UpdateVgwCertificateResponse> updateVgwCertificateAsync(
        UpdateVgwCertificateRequest request) {
        return hcClient.asyncInvokeHttp(request, VpnMeta.updateVgwCertificate);
    }

    /**
     * 更新VPN网关证书
     *
     * 更新租户VPN网关所使用的证书，包括签名证书、签名私钥、加密证书、加密私钥和CA证书链。当前只支持国密证书
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateVgwCertificateRequest 请求对象
     * @return AsyncInvoker<UpdateVgwCertificateRequest, UpdateVgwCertificateResponse>
     */
    public AsyncInvoker<UpdateVgwCertificateRequest, UpdateVgwCertificateResponse> updateVgwCertificateAsyncInvoker(
        UpdateVgwCertificateRequest request) {
        return new AsyncInvoker<UpdateVgwCertificateRequest, UpdateVgwCertificateResponse>(request,
            VpnMeta.updateVgwCertificate, hcClient);
    }

    /**
     * 查询指定租户配额
     *
     * 查询指定租户的配额
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowQuotasInfoRequest 请求对象
     * @return CompletableFuture<ShowQuotasInfoResponse>
     */
    public CompletableFuture<ShowQuotasInfoResponse> showQuotasInfoAsync(ShowQuotasInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, VpnMeta.showQuotasInfo);
    }

    /**
     * 查询指定租户配额
     *
     * 查询指定租户的配额
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowQuotasInfoRequest 请求对象
     * @return AsyncInvoker<ShowQuotasInfoRequest, ShowQuotasInfoResponse>
     */
    public AsyncInvoker<ShowQuotasInfoRequest, ShowQuotasInfoResponse> showQuotasInfoAsyncInvoker(
        ShowQuotasInfoRequest request) {
        return new AsyncInvoker<ShowQuotasInfoRequest, ShowQuotasInfoResponse>(request, VpnMeta.showQuotasInfo,
            hcClient);
    }

}
