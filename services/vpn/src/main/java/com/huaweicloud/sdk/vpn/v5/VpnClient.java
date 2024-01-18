package com.huaweicloud.sdk.vpn.v5;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.vpn.v5.model.BatchCreateResourceTagsRequest;
import com.huaweicloud.sdk.vpn.v5.model.BatchCreateResourceTagsResponse;
import com.huaweicloud.sdk.vpn.v5.model.BatchDeleteResourceTagsRequest;
import com.huaweicloud.sdk.vpn.v5.model.BatchDeleteResourceTagsResponse;
import com.huaweicloud.sdk.vpn.v5.model.CountResourcesByTagsRequest;
import com.huaweicloud.sdk.vpn.v5.model.CountResourcesByTagsResponse;
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
import com.huaweicloud.sdk.vpn.v5.model.ListProjectTagsRequest;
import com.huaweicloud.sdk.vpn.v5.model.ListProjectTagsResponse;
import com.huaweicloud.sdk.vpn.v5.model.ListResourcesByTagsRequest;
import com.huaweicloud.sdk.vpn.v5.model.ListResourcesByTagsResponse;
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
import com.huaweicloud.sdk.vpn.v5.model.ShowResourceTagsRequest;
import com.huaweicloud.sdk.vpn.v5.model.ShowResourceTagsResponse;
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

public class VpnClient {

    protected HcClient hcClient;

    public VpnClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<VpnClient> newBuilder() {
        ClientBuilder<VpnClient> clientBuilder = new ClientBuilder<>(VpnClient::new);
        return clientBuilder;
    }

    /**
     * 创建VPN连接监控
     *
     * 创建VPN连接监控
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateConnectionMonitorRequest 请求对象
     * @return CreateConnectionMonitorResponse
     */
    public CreateConnectionMonitorResponse createConnectionMonitor(CreateConnectionMonitorRequest request) {
        return hcClient.syncInvokeHttp(request, VpnMeta.createConnectionMonitor);
    }

    /**
     * 创建VPN连接监控
     *
     * 创建VPN连接监控
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateConnectionMonitorRequest 请求对象
     * @return SyncInvoker<CreateConnectionMonitorRequest, CreateConnectionMonitorResponse>
     */
    public SyncInvoker<CreateConnectionMonitorRequest, CreateConnectionMonitorResponse> createConnectionMonitorInvoker(
        CreateConnectionMonitorRequest request) {
        return new SyncInvoker<>(request, VpnMeta.createConnectionMonitor, hcClient);
    }

    /**
     * 删除VPN连接监控
     *
     * 根据VPN连接监控的ID，删除指定的VPN连接监控
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteConnectionMonitorRequest 请求对象
     * @return DeleteConnectionMonitorResponse
     */
    public DeleteConnectionMonitorResponse deleteConnectionMonitor(DeleteConnectionMonitorRequest request) {
        return hcClient.syncInvokeHttp(request, VpnMeta.deleteConnectionMonitor);
    }

    /**
     * 删除VPN连接监控
     *
     * 根据VPN连接监控的ID，删除指定的VPN连接监控
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteConnectionMonitorRequest 请求对象
     * @return SyncInvoker<DeleteConnectionMonitorRequest, DeleteConnectionMonitorResponse>
     */
    public SyncInvoker<DeleteConnectionMonitorRequest, DeleteConnectionMonitorResponse> deleteConnectionMonitorInvoker(
        DeleteConnectionMonitorRequest request) {
        return new SyncInvoker<>(request, VpnMeta.deleteConnectionMonitor, hcClient);
    }

    /**
     * 查询VPN连接监控列表
     *
     * 查询VPN连接监控列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListConnectionMonitorsRequest 请求对象
     * @return ListConnectionMonitorsResponse
     */
    public ListConnectionMonitorsResponse listConnectionMonitors(ListConnectionMonitorsRequest request) {
        return hcClient.syncInvokeHttp(request, VpnMeta.listConnectionMonitors);
    }

    /**
     * 查询VPN连接监控列表
     *
     * 查询VPN连接监控列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListConnectionMonitorsRequest 请求对象
     * @return SyncInvoker<ListConnectionMonitorsRequest, ListConnectionMonitorsResponse>
     */
    public SyncInvoker<ListConnectionMonitorsRequest, ListConnectionMonitorsResponse> listConnectionMonitorsInvoker(
        ListConnectionMonitorsRequest request) {
        return new SyncInvoker<>(request, VpnMeta.listConnectionMonitors, hcClient);
    }

    /**
     * 查询VPN连接监控
     *
     * 根据VPN连接监控的ID,查询指定的VPN连接监控
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowConnectionMonitorRequest 请求对象
     * @return ShowConnectionMonitorResponse
     */
    public ShowConnectionMonitorResponse showConnectionMonitor(ShowConnectionMonitorRequest request) {
        return hcClient.syncInvokeHttp(request, VpnMeta.showConnectionMonitor);
    }

    /**
     * 查询VPN连接监控
     *
     * 根据VPN连接监控的ID,查询指定的VPN连接监控
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowConnectionMonitorRequest 请求对象
     * @return SyncInvoker<ShowConnectionMonitorRequest, ShowConnectionMonitorResponse>
     */
    public SyncInvoker<ShowConnectionMonitorRequest, ShowConnectionMonitorResponse> showConnectionMonitorInvoker(
        ShowConnectionMonitorRequest request) {
        return new SyncInvoker<>(request, VpnMeta.showConnectionMonitor, hcClient);
    }

    /**
     * 创建对端网关
     *
     * 创建租户用于与VPN网关相连的对端网关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCgwRequest 请求对象
     * @return CreateCgwResponse
     */
    public CreateCgwResponse createCgw(CreateCgwRequest request) {
        return hcClient.syncInvokeHttp(request, VpnMeta.createCgw);
    }

    /**
     * 创建对端网关
     *
     * 创建租户用于与VPN网关相连的对端网关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCgwRequest 请求对象
     * @return SyncInvoker<CreateCgwRequest, CreateCgwResponse>
     */
    public SyncInvoker<CreateCgwRequest, CreateCgwResponse> createCgwInvoker(CreateCgwRequest request) {
        return new SyncInvoker<>(request, VpnMeta.createCgw, hcClient);
    }

    /**
     * 删除对端网关
     *
     * 根据对端网关ID，删除指定的对端网关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteCgwRequest 请求对象
     * @return DeleteCgwResponse
     */
    public DeleteCgwResponse deleteCgw(DeleteCgwRequest request) {
        return hcClient.syncInvokeHttp(request, VpnMeta.deleteCgw);
    }

    /**
     * 删除对端网关
     *
     * 根据对端网关ID，删除指定的对端网关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteCgwRequest 请求对象
     * @return SyncInvoker<DeleteCgwRequest, DeleteCgwResponse>
     */
    public SyncInvoker<DeleteCgwRequest, DeleteCgwResponse> deleteCgwInvoker(DeleteCgwRequest request) {
        return new SyncInvoker<>(request, VpnMeta.deleteCgw, hcClient);
    }

    /**
     * 查询对端网关列表
     *
     * 查询对端网关列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCgwsRequest 请求对象
     * @return ListCgwsResponse
     */
    public ListCgwsResponse listCgws(ListCgwsRequest request) {
        return hcClient.syncInvokeHttp(request, VpnMeta.listCgws);
    }

    /**
     * 查询对端网关列表
     *
     * 查询对端网关列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCgwsRequest 请求对象
     * @return SyncInvoker<ListCgwsRequest, ListCgwsResponse>
     */
    public SyncInvoker<ListCgwsRequest, ListCgwsResponse> listCgwsInvoker(ListCgwsRequest request) {
        return new SyncInvoker<>(request, VpnMeta.listCgws, hcClient);
    }

    /**
     * 查询对端网关
     *
     * 根据对端网关ID，查询指定的对端网关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCgwRequest 请求对象
     * @return ShowCgwResponse
     */
    public ShowCgwResponse showCgw(ShowCgwRequest request) {
        return hcClient.syncInvokeHttp(request, VpnMeta.showCgw);
    }

    /**
     * 查询对端网关
     *
     * 根据对端网关ID，查询指定的对端网关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCgwRequest 请求对象
     * @return SyncInvoker<ShowCgwRequest, ShowCgwResponse>
     */
    public SyncInvoker<ShowCgwRequest, ShowCgwResponse> showCgwInvoker(ShowCgwRequest request) {
        return new SyncInvoker<>(request, VpnMeta.showCgw, hcClient);
    }

    /**
     * 更新对端网关
     *
     * 根据对端网关ID，更新指定的对端网关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateCgwRequest 请求对象
     * @return UpdateCgwResponse
     */
    public UpdateCgwResponse updateCgw(UpdateCgwRequest request) {
        return hcClient.syncInvokeHttp(request, VpnMeta.updateCgw);
    }

    /**
     * 更新对端网关
     *
     * 根据对端网关ID，更新指定的对端网关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateCgwRequest 请求对象
     * @return SyncInvoker<UpdateCgwRequest, UpdateCgwResponse>
     */
    public SyncInvoker<UpdateCgwRequest, UpdateCgwResponse> updateCgwInvoker(UpdateCgwRequest request) {
        return new SyncInvoker<>(request, VpnMeta.updateCgw, hcClient);
    }

    /**
     * 批量添加资源标签
     *
     * 为指定实例批量添加标签,标签管理服务需要使用该接口批量管理实例的标签.一个资源上最多有20个标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateResourceTagsRequest 请求对象
     * @return BatchCreateResourceTagsResponse
     */
    public BatchCreateResourceTagsResponse batchCreateResourceTags(BatchCreateResourceTagsRequest request) {
        return hcClient.syncInvokeHttp(request, VpnMeta.batchCreateResourceTags);
    }

    /**
     * 批量添加资源标签
     *
     * 为指定实例批量添加标签,标签管理服务需要使用该接口批量管理实例的标签.一个资源上最多有20个标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateResourceTagsRequest 请求对象
     * @return SyncInvoker<BatchCreateResourceTagsRequest, BatchCreateResourceTagsResponse>
     */
    public SyncInvoker<BatchCreateResourceTagsRequest, BatchCreateResourceTagsResponse> batchCreateResourceTagsInvoker(
        BatchCreateResourceTagsRequest request) {
        return new SyncInvoker<>(request, VpnMeta.batchCreateResourceTags, hcClient);
    }

    /**
     * 批量删除资源标签
     *
     * 为指定实例批量删除标签,标签管理服务需要使用该接口批量管理实例的标签.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteResourceTagsRequest 请求对象
     * @return BatchDeleteResourceTagsResponse
     */
    public BatchDeleteResourceTagsResponse batchDeleteResourceTags(BatchDeleteResourceTagsRequest request) {
        return hcClient.syncInvokeHttp(request, VpnMeta.batchDeleteResourceTags);
    }

    /**
     * 批量删除资源标签
     *
     * 为指定实例批量删除标签,标签管理服务需要使用该接口批量管理实例的标签.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteResourceTagsRequest 请求对象
     * @return SyncInvoker<BatchDeleteResourceTagsRequest, BatchDeleteResourceTagsResponse>
     */
    public SyncInvoker<BatchDeleteResourceTagsRequest, BatchDeleteResourceTagsResponse> batchDeleteResourceTagsInvoker(
        BatchDeleteResourceTagsRequest request) {
        return new SyncInvoker<>(request, VpnMeta.batchDeleteResourceTags, hcClient);
    }

    /**
     * 查询标签下资源实例数量
     *
     * 使用标签过滤实例,并查询实例数量,需要各服务提供查询
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CountResourcesByTagsRequest 请求对象
     * @return CountResourcesByTagsResponse
     */
    public CountResourcesByTagsResponse countResourcesByTags(CountResourcesByTagsRequest request) {
        return hcClient.syncInvokeHttp(request, VpnMeta.countResourcesByTags);
    }

    /**
     * 查询标签下资源实例数量
     *
     * 使用标签过滤实例,并查询实例数量,需要各服务提供查询
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CountResourcesByTagsRequest 请求对象
     * @return SyncInvoker<CountResourcesByTagsRequest, CountResourcesByTagsResponse>
     */
    public SyncInvoker<CountResourcesByTagsRequest, CountResourcesByTagsResponse> countResourcesByTagsInvoker(
        CountResourcesByTagsRequest request) {
        return new SyncInvoker<>(request, VpnMeta.countResourcesByTags, hcClient);
    }

    /**
     * 查询项目下标签
     *
     * 查询租户在指定Project中实例类型的所有资源标签集合
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectTagsRequest 请求对象
     * @return ListProjectTagsResponse
     */
    public ListProjectTagsResponse listProjectTags(ListProjectTagsRequest request) {
        return hcClient.syncInvokeHttp(request, VpnMeta.listProjectTags);
    }

    /**
     * 查询项目下标签
     *
     * 查询租户在指定Project中实例类型的所有资源标签集合
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectTagsRequest 请求对象
     * @return SyncInvoker<ListProjectTagsRequest, ListProjectTagsResponse>
     */
    public SyncInvoker<ListProjectTagsRequest, ListProjectTagsResponse> listProjectTagsInvoker(
        ListProjectTagsRequest request) {
        return new SyncInvoker<>(request, VpnMeta.listProjectTags, hcClient);
    }

    /**
     * 按标签查询资源
     *
     * 使用标签过滤实例,并查询实例数量,需要各服务提供查询
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListResourcesByTagsRequest 请求对象
     * @return ListResourcesByTagsResponse
     */
    public ListResourcesByTagsResponse listResourcesByTags(ListResourcesByTagsRequest request) {
        return hcClient.syncInvokeHttp(request, VpnMeta.listResourcesByTags);
    }

    /**
     * 按标签查询资源
     *
     * 使用标签过滤实例,并查询实例数量,需要各服务提供查询
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListResourcesByTagsRequest 请求对象
     * @return SyncInvoker<ListResourcesByTagsRequest, ListResourcesByTagsResponse>
     */
    public SyncInvoker<ListResourcesByTagsRequest, ListResourcesByTagsResponse> listResourcesByTagsInvoker(
        ListResourcesByTagsRequest request) {
        return new SyncInvoker<>(request, VpnMeta.listResourcesByTags, hcClient);
    }

    /**
     * 查询资源标签
     *
     * 查询指定实例的标签信息,标签管理服务需要使用该接口查询指定实例的全部标签数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowResourceTagsRequest 请求对象
     * @return ShowResourceTagsResponse
     */
    public ShowResourceTagsResponse showResourceTags(ShowResourceTagsRequest request) {
        return hcClient.syncInvokeHttp(request, VpnMeta.showResourceTags);
    }

    /**
     * 查询资源标签
     *
     * 查询指定实例的标签信息,标签管理服务需要使用该接口查询指定实例的全部标签数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowResourceTagsRequest 请求对象
     * @return SyncInvoker<ShowResourceTagsRequest, ShowResourceTagsResponse>
     */
    public SyncInvoker<ShowResourceTagsRequest, ShowResourceTagsResponse> showResourceTagsInvoker(
        ShowResourceTagsRequest request) {
        return new SyncInvoker<>(request, VpnMeta.showResourceTags, hcClient);
    }

    /**
     * 创建VPN连接
     *
     * 创建VPN连接，连接VPN网关与对端网关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateVpnConnectionRequest 请求对象
     * @return CreateVpnConnectionResponse
     */
    public CreateVpnConnectionResponse createVpnConnection(CreateVpnConnectionRequest request) {
        return hcClient.syncInvokeHttp(request, VpnMeta.createVpnConnection);
    }

    /**
     * 创建VPN连接
     *
     * 创建VPN连接，连接VPN网关与对端网关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateVpnConnectionRequest 请求对象
     * @return SyncInvoker<CreateVpnConnectionRequest, CreateVpnConnectionResponse>
     */
    public SyncInvoker<CreateVpnConnectionRequest, CreateVpnConnectionResponse> createVpnConnectionInvoker(
        CreateVpnConnectionRequest request) {
        return new SyncInvoker<>(request, VpnMeta.createVpnConnection, hcClient);
    }

    /**
     * 删除VPN连接
     *
     * 根据连接ID，删除指定的VPN连接
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteVpnConnectionRequest 请求对象
     * @return DeleteVpnConnectionResponse
     */
    public DeleteVpnConnectionResponse deleteVpnConnection(DeleteVpnConnectionRequest request) {
        return hcClient.syncInvokeHttp(request, VpnMeta.deleteVpnConnection);
    }

    /**
     * 删除VPN连接
     *
     * 根据连接ID，删除指定的VPN连接
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteVpnConnectionRequest 请求对象
     * @return SyncInvoker<DeleteVpnConnectionRequest, DeleteVpnConnectionResponse>
     */
    public SyncInvoker<DeleteVpnConnectionRequest, DeleteVpnConnectionResponse> deleteVpnConnectionInvoker(
        DeleteVpnConnectionRequest request) {
        return new SyncInvoker<>(request, VpnMeta.deleteVpnConnection, hcClient);
    }

    /**
     * 查询VPN连接列表
     *
     * 查询VPN连接列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVpnConnectionsRequest 请求对象
     * @return ListVpnConnectionsResponse
     */
    public ListVpnConnectionsResponse listVpnConnections(ListVpnConnectionsRequest request) {
        return hcClient.syncInvokeHttp(request, VpnMeta.listVpnConnections);
    }

    /**
     * 查询VPN连接列表
     *
     * 查询VPN连接列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVpnConnectionsRequest 请求对象
     * @return SyncInvoker<ListVpnConnectionsRequest, ListVpnConnectionsResponse>
     */
    public SyncInvoker<ListVpnConnectionsRequest, ListVpnConnectionsResponse> listVpnConnectionsInvoker(
        ListVpnConnectionsRequest request) {
        return new SyncInvoker<>(request, VpnMeta.listVpnConnections, hcClient);
    }

    /**
     * 查询VPN连接
     *
     * 根据连接ID，查询指定的VPN连接的参数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowVpnConnectionRequest 请求对象
     * @return ShowVpnConnectionResponse
     */
    public ShowVpnConnectionResponse showVpnConnection(ShowVpnConnectionRequest request) {
        return hcClient.syncInvokeHttp(request, VpnMeta.showVpnConnection);
    }

    /**
     * 查询VPN连接
     *
     * 根据连接ID，查询指定的VPN连接的参数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowVpnConnectionRequest 请求对象
     * @return SyncInvoker<ShowVpnConnectionRequest, ShowVpnConnectionResponse>
     */
    public SyncInvoker<ShowVpnConnectionRequest, ShowVpnConnectionResponse> showVpnConnectionInvoker(
        ShowVpnConnectionRequest request) {
        return new SyncInvoker<>(request, VpnMeta.showVpnConnection, hcClient);
    }

    /**
     * 更新VPN连接
     *
     * 根据连接ID，更新指定的VPN连接的参数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateVpnConnectionRequest 请求对象
     * @return UpdateVpnConnectionResponse
     */
    public UpdateVpnConnectionResponse updateVpnConnection(UpdateVpnConnectionRequest request) {
        return hcClient.syncInvokeHttp(request, VpnMeta.updateVpnConnection);
    }

    /**
     * 更新VPN连接
     *
     * 根据连接ID，更新指定的VPN连接的参数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateVpnConnectionRequest 请求对象
     * @return SyncInvoker<UpdateVpnConnectionRequest, UpdateVpnConnectionResponse>
     */
    public SyncInvoker<UpdateVpnConnectionRequest, UpdateVpnConnectionResponse> updateVpnConnectionInvoker(
        UpdateVpnConnectionRequest request) {
        return new SyncInvoker<>(request, VpnMeta.updateVpnConnection, hcClient);
    }

    /**
     * 创建VPN网关
     *
     * 创建一个VPN网关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateVgwRequest 请求对象
     * @return CreateVgwResponse
     */
    public CreateVgwResponse createVgw(CreateVgwRequest request) {
        return hcClient.syncInvokeHttp(request, VpnMeta.createVgw);
    }

    /**
     * 创建VPN网关
     *
     * 创建一个VPN网关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateVgwRequest 请求对象
     * @return SyncInvoker<CreateVgwRequest, CreateVgwResponse>
     */
    public SyncInvoker<CreateVgwRequest, CreateVgwResponse> createVgwInvoker(CreateVgwRequest request) {
        return new SyncInvoker<>(request, VpnMeta.createVgw, hcClient);
    }

    /**
     * 删除VPN网关
     *
     * 根据VPN网关ID，删除指定的VPN网关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteVgwRequest 请求对象
     * @return DeleteVgwResponse
     */
    public DeleteVgwResponse deleteVgw(DeleteVgwRequest request) {
        return hcClient.syncInvokeHttp(request, VpnMeta.deleteVgw);
    }

    /**
     * 删除VPN网关
     *
     * 根据VPN网关ID，删除指定的VPN网关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteVgwRequest 请求对象
     * @return SyncInvoker<DeleteVgwRequest, DeleteVgwResponse>
     */
    public SyncInvoker<DeleteVgwRequest, DeleteVgwResponse> deleteVgwInvoker(DeleteVgwRequest request) {
        return new SyncInvoker<>(request, VpnMeta.deleteVgw, hcClient);
    }

    /**
     * 查询VPN网关可用区
     *
     * 查询VPN网关可用区
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAvailabilityZonesRequest 请求对象
     * @return ListAvailabilityZonesResponse
     */
    public ListAvailabilityZonesResponse listAvailabilityZones(ListAvailabilityZonesRequest request) {
        return hcClient.syncInvokeHttp(request, VpnMeta.listAvailabilityZones);
    }

    /**
     * 查询VPN网关可用区
     *
     * 查询VPN网关可用区
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAvailabilityZonesRequest 请求对象
     * @return SyncInvoker<ListAvailabilityZonesRequest, ListAvailabilityZonesResponse>
     */
    public SyncInvoker<ListAvailabilityZonesRequest, ListAvailabilityZonesResponse> listAvailabilityZonesInvoker(
        ListAvailabilityZonesRequest request) {
        return new SyncInvoker<>(request, VpnMeta.listAvailabilityZones, hcClient);
    }

    /**
     * 查询VPN网关列表
     *
     * 查询VPN网关列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVgwsRequest 请求对象
     * @return ListVgwsResponse
     */
    public ListVgwsResponse listVgws(ListVgwsRequest request) {
        return hcClient.syncInvokeHttp(request, VpnMeta.listVgws);
    }

    /**
     * 查询VPN网关列表
     *
     * 查询VPN网关列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVgwsRequest 请求对象
     * @return SyncInvoker<ListVgwsRequest, ListVgwsResponse>
     */
    public SyncInvoker<ListVgwsRequest, ListVgwsResponse> listVgwsInvoker(ListVgwsRequest request) {
        return new SyncInvoker<>(request, VpnMeta.listVgws, hcClient);
    }

    /**
     * 查询VPN网关
     *
     * 根据VPN网关ID，查询指定的VPN网关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowVgwRequest 请求对象
     * @return ShowVgwResponse
     */
    public ShowVgwResponse showVgw(ShowVgwRequest request) {
        return hcClient.syncInvokeHttp(request, VpnMeta.showVgw);
    }

    /**
     * 查询VPN网关
     *
     * 根据VPN网关ID，查询指定的VPN网关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowVgwRequest 请求对象
     * @return SyncInvoker<ShowVgwRequest, ShowVgwResponse>
     */
    public SyncInvoker<ShowVgwRequest, ShowVgwResponse> showVgwInvoker(ShowVgwRequest request) {
        return new SyncInvoker<>(request, VpnMeta.showVgw, hcClient);
    }

    /**
     * 更新VPN网关
     *
     * 根据VPN网关ID，更新指定的VPN网关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateVgwRequest 请求对象
     * @return UpdateVgwResponse
     */
    public UpdateVgwResponse updateVgw(UpdateVgwRequest request) {
        return hcClient.syncInvokeHttp(request, VpnMeta.updateVgw);
    }

    /**
     * 更新VPN网关
     *
     * 根据VPN网关ID，更新指定的VPN网关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateVgwRequest 请求对象
     * @return SyncInvoker<UpdateVgwRequest, UpdateVgwResponse>
     */
    public SyncInvoker<UpdateVgwRequest, UpdateVgwResponse> updateVgwInvoker(UpdateVgwRequest request) {
        return new SyncInvoker<>(request, VpnMeta.updateVgw, hcClient);
    }

    /**
     * 导入VPN网关证书
     *
     * 导入租户VPN网关所使用的证书，包括签名证书、签名私钥、加密证书、加密私钥和CA证书链。当前只支持国密证书
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateVgwCertificateRequest 请求对象
     * @return CreateVgwCertificateResponse
     */
    public CreateVgwCertificateResponse createVgwCertificate(CreateVgwCertificateRequest request) {
        return hcClient.syncInvokeHttp(request, VpnMeta.createVgwCertificate);
    }

    /**
     * 导入VPN网关证书
     *
     * 导入租户VPN网关所使用的证书，包括签名证书、签名私钥、加密证书、加密私钥和CA证书链。当前只支持国密证书
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateVgwCertificateRequest 请求对象
     * @return SyncInvoker<CreateVgwCertificateRequest, CreateVgwCertificateResponse>
     */
    public SyncInvoker<CreateVgwCertificateRequest, CreateVgwCertificateResponse> createVgwCertificateInvoker(
        CreateVgwCertificateRequest request) {
        return new SyncInvoker<>(request, VpnMeta.createVgwCertificate, hcClient);
    }

    /**
     * 查询VPN网关证书
     *
     * 根据VPN网关ID，查询所指定的VPN网关证书
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowVpnGatewayCertificateRequest 请求对象
     * @return ShowVpnGatewayCertificateResponse
     */
    public ShowVpnGatewayCertificateResponse showVpnGatewayCertificate(ShowVpnGatewayCertificateRequest request) {
        return hcClient.syncInvokeHttp(request, VpnMeta.showVpnGatewayCertificate);
    }

    /**
     * 查询VPN网关证书
     *
     * 根据VPN网关ID，查询所指定的VPN网关证书
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowVpnGatewayCertificateRequest 请求对象
     * @return SyncInvoker<ShowVpnGatewayCertificateRequest, ShowVpnGatewayCertificateResponse>
     */
    public SyncInvoker<ShowVpnGatewayCertificateRequest, ShowVpnGatewayCertificateResponse> showVpnGatewayCertificateInvoker(
        ShowVpnGatewayCertificateRequest request) {
        return new SyncInvoker<>(request, VpnMeta.showVpnGatewayCertificate, hcClient);
    }

    /**
     * 更新VPN网关证书
     *
     * 更新租户VPN网关所使用的证书，包括签名证书、签名私钥、加密证书、加密私钥和CA证书链。当前只支持国密证书
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateVgwCertificateRequest 请求对象
     * @return UpdateVgwCertificateResponse
     */
    public UpdateVgwCertificateResponse updateVgwCertificate(UpdateVgwCertificateRequest request) {
        return hcClient.syncInvokeHttp(request, VpnMeta.updateVgwCertificate);
    }

    /**
     * 更新VPN网关证书
     *
     * 更新租户VPN网关所使用的证书，包括签名证书、签名私钥、加密证书、加密私钥和CA证书链。当前只支持国密证书
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateVgwCertificateRequest 请求对象
     * @return SyncInvoker<UpdateVgwCertificateRequest, UpdateVgwCertificateResponse>
     */
    public SyncInvoker<UpdateVgwCertificateRequest, UpdateVgwCertificateResponse> updateVgwCertificateInvoker(
        UpdateVgwCertificateRequest request) {
        return new SyncInvoker<>(request, VpnMeta.updateVgwCertificate, hcClient);
    }

    /**
     * 查询指定租户配额
     *
     * 查询指定租户的配额
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowQuotasInfoRequest 请求对象
     * @return ShowQuotasInfoResponse
     */
    public ShowQuotasInfoResponse showQuotasInfo(ShowQuotasInfoRequest request) {
        return hcClient.syncInvokeHttp(request, VpnMeta.showQuotasInfo);
    }

    /**
     * 查询指定租户配额
     *
     * 查询指定租户的配额
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowQuotasInfoRequest 请求对象
     * @return SyncInvoker<ShowQuotasInfoRequest, ShowQuotasInfoResponse>
     */
    public SyncInvoker<ShowQuotasInfoRequest, ShowQuotasInfoResponse> showQuotasInfoInvoker(
        ShowQuotasInfoRequest request) {
        return new SyncInvoker<>(request, VpnMeta.showQuotasInfo, hcClient);
    }

}
