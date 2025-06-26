package com.huaweicloud.sdk.vpn.v5;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.vpn.v5.model.AddVpnUsersToGroupRequest;
import com.huaweicloud.sdk.vpn.v5.model.AddVpnUsersToGroupResponse;
import com.huaweicloud.sdk.vpn.v5.model.BatchCreateResourceTagsRequest;
import com.huaweicloud.sdk.vpn.v5.model.BatchCreateResourceTagsResponse;
import com.huaweicloud.sdk.vpn.v5.model.BatchCreateVpnConnectionRequest;
import com.huaweicloud.sdk.vpn.v5.model.BatchCreateVpnConnectionResponse;
import com.huaweicloud.sdk.vpn.v5.model.BatchCreateVpnUsersRequest;
import com.huaweicloud.sdk.vpn.v5.model.BatchCreateVpnUsersResponse;
import com.huaweicloud.sdk.vpn.v5.model.BatchDeleteResourceTagsRequest;
import com.huaweicloud.sdk.vpn.v5.model.BatchDeleteResourceTagsResponse;
import com.huaweicloud.sdk.vpn.v5.model.BatchDeleteVpnUsersRequest;
import com.huaweicloud.sdk.vpn.v5.model.BatchDeleteVpnUsersResponse;
import com.huaweicloud.sdk.vpn.v5.model.CheckClientCaCertificateRequest;
import com.huaweicloud.sdk.vpn.v5.model.CheckClientCaCertificateResponse;
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
import com.huaweicloud.sdk.vpn.v5.model.CreateVpnAccessPolicyRequest;
import com.huaweicloud.sdk.vpn.v5.model.CreateVpnAccessPolicyResponse;
import com.huaweicloud.sdk.vpn.v5.model.CreateVpnConnectionRequest;
import com.huaweicloud.sdk.vpn.v5.model.CreateVpnConnectionResponse;
import com.huaweicloud.sdk.vpn.v5.model.CreateVpnServerRequest;
import com.huaweicloud.sdk.vpn.v5.model.CreateVpnServerResponse;
import com.huaweicloud.sdk.vpn.v5.model.CreateVpnUserGroupRequest;
import com.huaweicloud.sdk.vpn.v5.model.CreateVpnUserGroupResponse;
import com.huaweicloud.sdk.vpn.v5.model.CreateVpnUserRequest;
import com.huaweicloud.sdk.vpn.v5.model.CreateVpnUserResponse;
import com.huaweicloud.sdk.vpn.v5.model.DeleteCgwRequest;
import com.huaweicloud.sdk.vpn.v5.model.DeleteCgwResponse;
import com.huaweicloud.sdk.vpn.v5.model.DeleteClientCaRequest;
import com.huaweicloud.sdk.vpn.v5.model.DeleteClientCaResponse;
import com.huaweicloud.sdk.vpn.v5.model.DeleteConnectionMonitorRequest;
import com.huaweicloud.sdk.vpn.v5.model.DeleteConnectionMonitorResponse;
import com.huaweicloud.sdk.vpn.v5.model.DeleteP2cVgwConnectionRequest;
import com.huaweicloud.sdk.vpn.v5.model.DeleteP2cVgwConnectionResponse;
import com.huaweicloud.sdk.vpn.v5.model.DeleteVgwRequest;
import com.huaweicloud.sdk.vpn.v5.model.DeleteVgwResponse;
import com.huaweicloud.sdk.vpn.v5.model.DeleteVpnAccessPolicyRequest;
import com.huaweicloud.sdk.vpn.v5.model.DeleteVpnAccessPolicyResponse;
import com.huaweicloud.sdk.vpn.v5.model.DeleteVpnConnectionRequest;
import com.huaweicloud.sdk.vpn.v5.model.DeleteVpnConnectionResponse;
import com.huaweicloud.sdk.vpn.v5.model.DeleteVpnConnectionsLogConfigRequest;
import com.huaweicloud.sdk.vpn.v5.model.DeleteVpnConnectionsLogConfigResponse;
import com.huaweicloud.sdk.vpn.v5.model.DeleteVpnUserGroupRequest;
import com.huaweicloud.sdk.vpn.v5.model.DeleteVpnUserGroupResponse;
import com.huaweicloud.sdk.vpn.v5.model.DeleteVpnUserRequest;
import com.huaweicloud.sdk.vpn.v5.model.DeleteVpnUserResponse;
import com.huaweicloud.sdk.vpn.v5.model.ExportClientConfigRequest;
import com.huaweicloud.sdk.vpn.v5.model.ExportClientConfigResponse;
import com.huaweicloud.sdk.vpn.v5.model.ImportClientCaRequest;
import com.huaweicloud.sdk.vpn.v5.model.ImportClientCaResponse;
import com.huaweicloud.sdk.vpn.v5.model.ListAvailabilityZonesRequest;
import com.huaweicloud.sdk.vpn.v5.model.ListAvailabilityZonesResponse;
import com.huaweicloud.sdk.vpn.v5.model.ListCgwsRequest;
import com.huaweicloud.sdk.vpn.v5.model.ListCgwsResponse;
import com.huaweicloud.sdk.vpn.v5.model.ListConnectionMonitorsRequest;
import com.huaweicloud.sdk.vpn.v5.model.ListConnectionMonitorsResponse;
import com.huaweicloud.sdk.vpn.v5.model.ListExtendedAvailabilityZonesRequest;
import com.huaweicloud.sdk.vpn.v5.model.ListExtendedAvailabilityZonesResponse;
import com.huaweicloud.sdk.vpn.v5.model.ListP2cVgwAvailabilityZonesRequest;
import com.huaweicloud.sdk.vpn.v5.model.ListP2cVgwAvailabilityZonesResponse;
import com.huaweicloud.sdk.vpn.v5.model.ListP2cVgwConnectionsRequest;
import com.huaweicloud.sdk.vpn.v5.model.ListP2cVgwConnectionsResponse;
import com.huaweicloud.sdk.vpn.v5.model.ListP2cVgwsRequest;
import com.huaweicloud.sdk.vpn.v5.model.ListP2cVgwsResponse;
import com.huaweicloud.sdk.vpn.v5.model.ListProjectTagsRequest;
import com.huaweicloud.sdk.vpn.v5.model.ListProjectTagsResponse;
import com.huaweicloud.sdk.vpn.v5.model.ListResourcesByTagsRequest;
import com.huaweicloud.sdk.vpn.v5.model.ListResourcesByTagsResponse;
import com.huaweicloud.sdk.vpn.v5.model.ListVgwsRequest;
import com.huaweicloud.sdk.vpn.v5.model.ListVgwsResponse;
import com.huaweicloud.sdk.vpn.v5.model.ListVpnAccessPoliciesRequest;
import com.huaweicloud.sdk.vpn.v5.model.ListVpnAccessPoliciesResponse;
import com.huaweicloud.sdk.vpn.v5.model.ListVpnConnectionsRequest;
import com.huaweicloud.sdk.vpn.v5.model.ListVpnConnectionsResponse;
import com.huaweicloud.sdk.vpn.v5.model.ListVpnServersByProjectRequest;
import com.huaweicloud.sdk.vpn.v5.model.ListVpnServersByProjectResponse;
import com.huaweicloud.sdk.vpn.v5.model.ListVpnServersByVgwRequest;
import com.huaweicloud.sdk.vpn.v5.model.ListVpnServersByVgwResponse;
import com.huaweicloud.sdk.vpn.v5.model.ListVpnUserGroupsRequest;
import com.huaweicloud.sdk.vpn.v5.model.ListVpnUserGroupsResponse;
import com.huaweicloud.sdk.vpn.v5.model.ListVpnUsersInGroupRequest;
import com.huaweicloud.sdk.vpn.v5.model.ListVpnUsersInGroupResponse;
import com.huaweicloud.sdk.vpn.v5.model.ListVpnUsersRequest;
import com.huaweicloud.sdk.vpn.v5.model.ListVpnUsersResponse;
import com.huaweicloud.sdk.vpn.v5.model.RemoveVpnUsersFromGroupRequest;
import com.huaweicloud.sdk.vpn.v5.model.RemoveVpnUsersFromGroupResponse;
import com.huaweicloud.sdk.vpn.v5.model.ResetVpnConnectionRequest;
import com.huaweicloud.sdk.vpn.v5.model.ResetVpnConnectionResponse;
import com.huaweicloud.sdk.vpn.v5.model.ResetVpnUserPasswordRequest;
import com.huaweicloud.sdk.vpn.v5.model.ResetVpnUserPasswordResponse;
import com.huaweicloud.sdk.vpn.v5.model.ShowCgwRequest;
import com.huaweicloud.sdk.vpn.v5.model.ShowCgwResponse;
import com.huaweicloud.sdk.vpn.v5.model.ShowClientCaRequest;
import com.huaweicloud.sdk.vpn.v5.model.ShowClientCaResponse;
import com.huaweicloud.sdk.vpn.v5.model.ShowConnectionMonitorRequest;
import com.huaweicloud.sdk.vpn.v5.model.ShowConnectionMonitorResponse;
import com.huaweicloud.sdk.vpn.v5.model.ShowP2cVgwRequest;
import com.huaweicloud.sdk.vpn.v5.model.ShowP2cVgwResponse;
import com.huaweicloud.sdk.vpn.v5.model.ShowQuotasInfoRequest;
import com.huaweicloud.sdk.vpn.v5.model.ShowQuotasInfoResponse;
import com.huaweicloud.sdk.vpn.v5.model.ShowResourceTagsRequest;
import com.huaweicloud.sdk.vpn.v5.model.ShowResourceTagsResponse;
import com.huaweicloud.sdk.vpn.v5.model.ShowVgwRequest;
import com.huaweicloud.sdk.vpn.v5.model.ShowVgwResponse;
import com.huaweicloud.sdk.vpn.v5.model.ShowVpnAccessPolicyRequest;
import com.huaweicloud.sdk.vpn.v5.model.ShowVpnAccessPolicyResponse;
import com.huaweicloud.sdk.vpn.v5.model.ShowVpnConnectionLogRequest;
import com.huaweicloud.sdk.vpn.v5.model.ShowVpnConnectionLogResponse;
import com.huaweicloud.sdk.vpn.v5.model.ShowVpnConnectionRequest;
import com.huaweicloud.sdk.vpn.v5.model.ShowVpnConnectionResponse;
import com.huaweicloud.sdk.vpn.v5.model.ShowVpnConnectionsLogConfigRequest;
import com.huaweicloud.sdk.vpn.v5.model.ShowVpnConnectionsLogConfigResponse;
import com.huaweicloud.sdk.vpn.v5.model.ShowVpnGatewayCertificateRequest;
import com.huaweicloud.sdk.vpn.v5.model.ShowVpnGatewayCertificateResponse;
import com.huaweicloud.sdk.vpn.v5.model.ShowVpnGatewayRoutingTableRequest;
import com.huaweicloud.sdk.vpn.v5.model.ShowVpnGatewayRoutingTableResponse;
import com.huaweicloud.sdk.vpn.v5.model.ShowVpnUserGroupRequest;
import com.huaweicloud.sdk.vpn.v5.model.ShowVpnUserGroupResponse;
import com.huaweicloud.sdk.vpn.v5.model.ShowVpnUserRequest;
import com.huaweicloud.sdk.vpn.v5.model.ShowVpnUserResponse;
import com.huaweicloud.sdk.vpn.v5.model.UpdateCgwRequest;
import com.huaweicloud.sdk.vpn.v5.model.UpdateCgwResponse;
import com.huaweicloud.sdk.vpn.v5.model.UpdateClientCaRequest;
import com.huaweicloud.sdk.vpn.v5.model.UpdateClientCaResponse;
import com.huaweicloud.sdk.vpn.v5.model.UpdateP2cVgwRequest;
import com.huaweicloud.sdk.vpn.v5.model.UpdateP2cVgwResponse;
import com.huaweicloud.sdk.vpn.v5.model.UpdatePostpaidVgwSpecificationRequest;
import com.huaweicloud.sdk.vpn.v5.model.UpdatePostpaidVgwSpecificationResponse;
import com.huaweicloud.sdk.vpn.v5.model.UpdateVgwCertificateRequest;
import com.huaweicloud.sdk.vpn.v5.model.UpdateVgwCertificateResponse;
import com.huaweicloud.sdk.vpn.v5.model.UpdateVgwRequest;
import com.huaweicloud.sdk.vpn.v5.model.UpdateVgwResponse;
import com.huaweicloud.sdk.vpn.v5.model.UpdateVpnAccessPolicyRequest;
import com.huaweicloud.sdk.vpn.v5.model.UpdateVpnAccessPolicyResponse;
import com.huaweicloud.sdk.vpn.v5.model.UpdateVpnConnectionRequest;
import com.huaweicloud.sdk.vpn.v5.model.UpdateVpnConnectionResponse;
import com.huaweicloud.sdk.vpn.v5.model.UpdateVpnConnectionsLogConfigRequest;
import com.huaweicloud.sdk.vpn.v5.model.UpdateVpnConnectionsLogConfigResponse;
import com.huaweicloud.sdk.vpn.v5.model.UpdateVpnServerRequest;
import com.huaweicloud.sdk.vpn.v5.model.UpdateVpnServerResponse;
import com.huaweicloud.sdk.vpn.v5.model.UpdateVpnUserGroupRequest;
import com.huaweicloud.sdk.vpn.v5.model.UpdateVpnUserGroupResponse;
import com.huaweicloud.sdk.vpn.v5.model.UpdateVpnUserPasswordRequest;
import com.huaweicloud.sdk.vpn.v5.model.UpdateVpnUserPasswordResponse;
import com.huaweicloud.sdk.vpn.v5.model.UpdateVpnUserRequest;
import com.huaweicloud.sdk.vpn.v5.model.UpdateVpnUserResponse;

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
     * 校验客户端CA
     *
     * 创建服务端时，可以先调用客户端CA的预校验API，检查CA的合法性
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckClientCaCertificateRequest 请求对象
     * @return CompletableFuture<CheckClientCaCertificateResponse>
     */
    public CompletableFuture<CheckClientCaCertificateResponse> checkClientCaCertificateAsync(
        CheckClientCaCertificateRequest request) {
        return hcClient.asyncInvokeHttp(request, VpnMeta.checkClientCaCertificate);
    }

    /**
     * 校验客户端CA
     *
     * 创建服务端时，可以先调用客户端CA的预校验API，检查CA的合法性
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckClientCaCertificateRequest 请求对象
     * @return AsyncInvoker<CheckClientCaCertificateRequest, CheckClientCaCertificateResponse>
     */
    public AsyncInvoker<CheckClientCaCertificateRequest, CheckClientCaCertificateResponse> checkClientCaCertificateAsyncInvoker(
        CheckClientCaCertificateRequest request) {
        return new AsyncInvoker<>(request, VpnMeta.checkClientCaCertificate, hcClient);
    }

    /**
     * 删除客户端的CA证书
     *
     * 删除客户端CA证书
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteClientCaRequest 请求对象
     * @return CompletableFuture<DeleteClientCaResponse>
     */
    public CompletableFuture<DeleteClientCaResponse> deleteClientCaAsync(DeleteClientCaRequest request) {
        return hcClient.asyncInvokeHttp(request, VpnMeta.deleteClientCa);
    }

    /**
     * 删除客户端的CA证书
     *
     * 删除客户端CA证书
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteClientCaRequest 请求对象
     * @return AsyncInvoker<DeleteClientCaRequest, DeleteClientCaResponse>
     */
    public AsyncInvoker<DeleteClientCaRequest, DeleteClientCaResponse> deleteClientCaAsyncInvoker(
        DeleteClientCaRequest request) {
        return new AsyncInvoker<>(request, VpnMeta.deleteClientCa, hcClient);
    }

    /**
     * 导入客户端 CA 证书
     *
     * 导入客户端 CA 证书
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ImportClientCaRequest 请求对象
     * @return CompletableFuture<ImportClientCaResponse>
     */
    public CompletableFuture<ImportClientCaResponse> importClientCaAsync(ImportClientCaRequest request) {
        return hcClient.asyncInvokeHttp(request, VpnMeta.importClientCa);
    }

    /**
     * 导入客户端 CA 证书
     *
     * 导入客户端 CA 证书
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ImportClientCaRequest 请求对象
     * @return AsyncInvoker<ImportClientCaRequest, ImportClientCaResponse>
     */
    public AsyncInvoker<ImportClientCaRequest, ImportClientCaResponse> importClientCaAsyncInvoker(
        ImportClientCaRequest request) {
        return new AsyncInvoker<>(request, VpnMeta.importClientCa, hcClient);
    }

    /**
     * 查询客户端的CA证书
     *
     * 查询客户端CA证书
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowClientCaRequest 请求对象
     * @return CompletableFuture<ShowClientCaResponse>
     */
    public CompletableFuture<ShowClientCaResponse> showClientCaAsync(ShowClientCaRequest request) {
        return hcClient.asyncInvokeHttp(request, VpnMeta.showClientCa);
    }

    /**
     * 查询客户端的CA证书
     *
     * 查询客户端CA证书
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowClientCaRequest 请求对象
     * @return AsyncInvoker<ShowClientCaRequest, ShowClientCaResponse>
     */
    public AsyncInvoker<ShowClientCaRequest, ShowClientCaResponse> showClientCaAsyncInvoker(
        ShowClientCaRequest request) {
        return new AsyncInvoker<>(request, VpnMeta.showClientCa, hcClient);
    }

    /**
     * 修改客户端的CA证书
     *
     * 修改客户端CA证书
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateClientCaRequest 请求对象
     * @return CompletableFuture<UpdateClientCaResponse>
     */
    public CompletableFuture<UpdateClientCaResponse> updateClientCaAsync(UpdateClientCaRequest request) {
        return hcClient.asyncInvokeHttp(request, VpnMeta.updateClientCa);
    }

    /**
     * 修改客户端的CA证书
     *
     * 修改客户端CA证书
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateClientCaRequest 请求对象
     * @return AsyncInvoker<UpdateClientCaRequest, UpdateClientCaResponse>
     */
    public AsyncInvoker<UpdateClientCaRequest, UpdateClientCaResponse> updateClientCaAsyncInvoker(
        UpdateClientCaRequest request) {
        return new AsyncInvoker<>(request, VpnMeta.updateClientCa, hcClient);
    }

    /**
     * 创建VPN连接监控
     *
     * 创建VPN连接监控
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateConnectionMonitorRequest 请求对象
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
     * @param request CreateConnectionMonitorRequest 请求对象
     * @return AsyncInvoker<CreateConnectionMonitorRequest, CreateConnectionMonitorResponse>
     */
    public AsyncInvoker<CreateConnectionMonitorRequest, CreateConnectionMonitorResponse> createConnectionMonitorAsyncInvoker(
        CreateConnectionMonitorRequest request) {
        return new AsyncInvoker<>(request, VpnMeta.createConnectionMonitor, hcClient);
    }

    /**
     * 删除VPN连接监控
     *
     * 根据VPN连接监控的ID，删除指定的VPN连接监控
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteConnectionMonitorRequest 请求对象
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
     * @param request DeleteConnectionMonitorRequest 请求对象
     * @return AsyncInvoker<DeleteConnectionMonitorRequest, DeleteConnectionMonitorResponse>
     */
    public AsyncInvoker<DeleteConnectionMonitorRequest, DeleteConnectionMonitorResponse> deleteConnectionMonitorAsyncInvoker(
        DeleteConnectionMonitorRequest request) {
        return new AsyncInvoker<>(request, VpnMeta.deleteConnectionMonitor, hcClient);
    }

    /**
     * 查询VPN连接监控列表
     *
     * 查询VPN连接监控列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListConnectionMonitorsRequest 请求对象
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
     * @param request ListConnectionMonitorsRequest 请求对象
     * @return AsyncInvoker<ListConnectionMonitorsRequest, ListConnectionMonitorsResponse>
     */
    public AsyncInvoker<ListConnectionMonitorsRequest, ListConnectionMonitorsResponse> listConnectionMonitorsAsyncInvoker(
        ListConnectionMonitorsRequest request) {
        return new AsyncInvoker<>(request, VpnMeta.listConnectionMonitors, hcClient);
    }

    /**
     * 查询VPN连接监控
     *
     * 根据VPN连接监控的ID,查询指定的VPN连接监控
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowConnectionMonitorRequest 请求对象
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
     * @param request ShowConnectionMonitorRequest 请求对象
     * @return AsyncInvoker<ShowConnectionMonitorRequest, ShowConnectionMonitorResponse>
     */
    public AsyncInvoker<ShowConnectionMonitorRequest, ShowConnectionMonitorResponse> showConnectionMonitorAsyncInvoker(
        ShowConnectionMonitorRequest request) {
        return new AsyncInvoker<>(request, VpnMeta.showConnectionMonitor, hcClient);
    }

    /**
     * 创建对端网关
     *
     * 创建租户用于与VPN网关相连的对端网关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCgwRequest 请求对象
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
     * @param request CreateCgwRequest 请求对象
     * @return AsyncInvoker<CreateCgwRequest, CreateCgwResponse>
     */
    public AsyncInvoker<CreateCgwRequest, CreateCgwResponse> createCgwAsyncInvoker(CreateCgwRequest request) {
        return new AsyncInvoker<>(request, VpnMeta.createCgw, hcClient);
    }

    /**
     * 删除对端网关
     *
     * 根据对端网关ID，删除指定的对端网关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteCgwRequest 请求对象
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
     * @param request DeleteCgwRequest 请求对象
     * @return AsyncInvoker<DeleteCgwRequest, DeleteCgwResponse>
     */
    public AsyncInvoker<DeleteCgwRequest, DeleteCgwResponse> deleteCgwAsyncInvoker(DeleteCgwRequest request) {
        return new AsyncInvoker<>(request, VpnMeta.deleteCgw, hcClient);
    }

    /**
     * 查询对端网关列表
     *
     * 查询对端网关列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCgwsRequest 请求对象
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
     * @param request ListCgwsRequest 请求对象
     * @return AsyncInvoker<ListCgwsRequest, ListCgwsResponse>
     */
    public AsyncInvoker<ListCgwsRequest, ListCgwsResponse> listCgwsAsyncInvoker(ListCgwsRequest request) {
        return new AsyncInvoker<>(request, VpnMeta.listCgws, hcClient);
    }

    /**
     * 查询对端网关
     *
     * 根据对端网关ID，查询指定的对端网关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCgwRequest 请求对象
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
     * @param request ShowCgwRequest 请求对象
     * @return AsyncInvoker<ShowCgwRequest, ShowCgwResponse>
     */
    public AsyncInvoker<ShowCgwRequest, ShowCgwResponse> showCgwAsyncInvoker(ShowCgwRequest request) {
        return new AsyncInvoker<>(request, VpnMeta.showCgw, hcClient);
    }

    /**
     * 更新对端网关
     *
     * 根据对端网关ID，更新指定的对端网关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateCgwRequest 请求对象
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
     * @param request UpdateCgwRequest 请求对象
     * @return AsyncInvoker<UpdateCgwRequest, UpdateCgwResponse>
     */
    public AsyncInvoker<UpdateCgwRequest, UpdateCgwResponse> updateCgwAsyncInvoker(UpdateCgwRequest request) {
        return new AsyncInvoker<>(request, VpnMeta.updateCgw, hcClient);
    }

    /**
     * 断开P2C VPN网关连接
     *
     * 断开P2C VPN网关连接
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteP2cVgwConnectionRequest 请求对象
     * @return CompletableFuture<DeleteP2cVgwConnectionResponse>
     */
    public CompletableFuture<DeleteP2cVgwConnectionResponse> deleteP2cVgwConnectionAsync(
        DeleteP2cVgwConnectionRequest request) {
        return hcClient.asyncInvokeHttp(request, VpnMeta.deleteP2cVgwConnection);
    }

    /**
     * 断开P2C VPN网关连接
     *
     * 断开P2C VPN网关连接
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteP2cVgwConnectionRequest 请求对象
     * @return AsyncInvoker<DeleteP2cVgwConnectionRequest, DeleteP2cVgwConnectionResponse>
     */
    public AsyncInvoker<DeleteP2cVgwConnectionRequest, DeleteP2cVgwConnectionResponse> deleteP2cVgwConnectionAsyncInvoker(
        DeleteP2cVgwConnectionRequest request) {
        return new AsyncInvoker<>(request, VpnMeta.deleteP2cVgwConnection, hcClient);
    }

    /**
     * 查询P2C VPN网关可用区
     *
     * 查询P2C VPN网关可用区
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListP2cVgwAvailabilityZonesRequest 请求对象
     * @return CompletableFuture<ListP2cVgwAvailabilityZonesResponse>
     */
    public CompletableFuture<ListP2cVgwAvailabilityZonesResponse> listP2cVgwAvailabilityZonesAsync(
        ListP2cVgwAvailabilityZonesRequest request) {
        return hcClient.asyncInvokeHttp(request, VpnMeta.listP2cVgwAvailabilityZones);
    }

    /**
     * 查询P2C VPN网关可用区
     *
     * 查询P2C VPN网关可用区
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListP2cVgwAvailabilityZonesRequest 请求对象
     * @return AsyncInvoker<ListP2cVgwAvailabilityZonesRequest, ListP2cVgwAvailabilityZonesResponse>
     */
    public AsyncInvoker<ListP2cVgwAvailabilityZonesRequest, ListP2cVgwAvailabilityZonesResponse> listP2cVgwAvailabilityZonesAsyncInvoker(
        ListP2cVgwAvailabilityZonesRequest request) {
        return new AsyncInvoker<>(request, VpnMeta.listP2cVgwAvailabilityZones, hcClient);
    }

    /**
     * 查询P2C VPN网关连接信息列表
     *
     * List p2c vpn gateway connections
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListP2cVgwConnectionsRequest 请求对象
     * @return CompletableFuture<ListP2cVgwConnectionsResponse>
     */
    public CompletableFuture<ListP2cVgwConnectionsResponse> listP2cVgwConnectionsAsync(
        ListP2cVgwConnectionsRequest request) {
        return hcClient.asyncInvokeHttp(request, VpnMeta.listP2cVgwConnections);
    }

    /**
     * 查询P2C VPN网关连接信息列表
     *
     * List p2c vpn gateway connections
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListP2cVgwConnectionsRequest 请求对象
     * @return AsyncInvoker<ListP2cVgwConnectionsRequest, ListP2cVgwConnectionsResponse>
     */
    public AsyncInvoker<ListP2cVgwConnectionsRequest, ListP2cVgwConnectionsResponse> listP2cVgwConnectionsAsyncInvoker(
        ListP2cVgwConnectionsRequest request) {
        return new AsyncInvoker<>(request, VpnMeta.listP2cVgwConnections, hcClient);
    }

    /**
     * 查询P2C VPN网关列表
     *
     * 查询P2C VPN网关列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListP2cVgwsRequest 请求对象
     * @return CompletableFuture<ListP2cVgwsResponse>
     */
    public CompletableFuture<ListP2cVgwsResponse> listP2cVgwsAsync(ListP2cVgwsRequest request) {
        return hcClient.asyncInvokeHttp(request, VpnMeta.listP2cVgws);
    }

    /**
     * 查询P2C VPN网关列表
     *
     * 查询P2C VPN网关列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListP2cVgwsRequest 请求对象
     * @return AsyncInvoker<ListP2cVgwsRequest, ListP2cVgwsResponse>
     */
    public AsyncInvoker<ListP2cVgwsRequest, ListP2cVgwsResponse> listP2cVgwsAsyncInvoker(ListP2cVgwsRequest request) {
        return new AsyncInvoker<>(request, VpnMeta.listP2cVgws, hcClient);
    }

    /**
     * 查询P2C VPN网关
     *
     * 根据P2C VPN网关ID，查询指定的VPN网关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowP2cVgwRequest 请求对象
     * @return CompletableFuture<ShowP2cVgwResponse>
     */
    public CompletableFuture<ShowP2cVgwResponse> showP2cVgwAsync(ShowP2cVgwRequest request) {
        return hcClient.asyncInvokeHttp(request, VpnMeta.showP2cVgw);
    }

    /**
     * 查询P2C VPN网关
     *
     * 根据P2C VPN网关ID，查询指定的VPN网关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowP2cVgwRequest 请求对象
     * @return AsyncInvoker<ShowP2cVgwRequest, ShowP2cVgwResponse>
     */
    public AsyncInvoker<ShowP2cVgwRequest, ShowP2cVgwResponse> showP2cVgwAsyncInvoker(ShowP2cVgwRequest request) {
        return new AsyncInvoker<>(request, VpnMeta.showP2cVgw, hcClient);
    }

    /**
     * 更新P2C VPN网关
     *
     * 根据P2C VPN网关ID，更新指定的P2C VPN网关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateP2cVgwRequest 请求对象
     * @return CompletableFuture<UpdateP2cVgwResponse>
     */
    public CompletableFuture<UpdateP2cVgwResponse> updateP2cVgwAsync(UpdateP2cVgwRequest request) {
        return hcClient.asyncInvokeHttp(request, VpnMeta.updateP2cVgw);
    }

    /**
     * 更新P2C VPN网关
     *
     * 根据P2C VPN网关ID，更新指定的P2C VPN网关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateP2cVgwRequest 请求对象
     * @return AsyncInvoker<UpdateP2cVgwRequest, UpdateP2cVgwResponse>
     */
    public AsyncInvoker<UpdateP2cVgwRequest, UpdateP2cVgwResponse> updateP2cVgwAsyncInvoker(
        UpdateP2cVgwRequest request) {
        return new AsyncInvoker<>(request, VpnMeta.updateP2cVgw, hcClient);
    }

    /**
     * 批量添加资源标签
     *
     * 为指定实例批量添加标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateResourceTagsRequest 请求对象
     * @return CompletableFuture<BatchCreateResourceTagsResponse>
     */
    public CompletableFuture<BatchCreateResourceTagsResponse> batchCreateResourceTagsAsync(
        BatchCreateResourceTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, VpnMeta.batchCreateResourceTags);
    }

    /**
     * 批量添加资源标签
     *
     * 为指定实例批量添加标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateResourceTagsRequest 请求对象
     * @return AsyncInvoker<BatchCreateResourceTagsRequest, BatchCreateResourceTagsResponse>
     */
    public AsyncInvoker<BatchCreateResourceTagsRequest, BatchCreateResourceTagsResponse> batchCreateResourceTagsAsyncInvoker(
        BatchCreateResourceTagsRequest request) {
        return new AsyncInvoker<>(request, VpnMeta.batchCreateResourceTags, hcClient);
    }

    /**
     * 批量删除资源标签
     *
     * 为指定实例批量删除标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteResourceTagsRequest 请求对象
     * @return CompletableFuture<BatchDeleteResourceTagsResponse>
     */
    public CompletableFuture<BatchDeleteResourceTagsResponse> batchDeleteResourceTagsAsync(
        BatchDeleteResourceTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, VpnMeta.batchDeleteResourceTags);
    }

    /**
     * 批量删除资源标签
     *
     * 为指定实例批量删除标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteResourceTagsRequest 请求对象
     * @return AsyncInvoker<BatchDeleteResourceTagsRequest, BatchDeleteResourceTagsResponse>
     */
    public AsyncInvoker<BatchDeleteResourceTagsRequest, BatchDeleteResourceTagsResponse> batchDeleteResourceTagsAsyncInvoker(
        BatchDeleteResourceTagsRequest request) {
        return new AsyncInvoker<>(request, VpnMeta.batchDeleteResourceTags, hcClient);
    }

    /**
     * 查询资源实例数量
     *
     * 根据标签查询资源实例数量
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CountResourcesByTagsRequest 请求对象
     * @return CompletableFuture<CountResourcesByTagsResponse>
     */
    public CompletableFuture<CountResourcesByTagsResponse> countResourcesByTagsAsync(
        CountResourcesByTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, VpnMeta.countResourcesByTags);
    }

    /**
     * 查询资源实例数量
     *
     * 根据标签查询资源实例数量
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CountResourcesByTagsRequest 请求对象
     * @return AsyncInvoker<CountResourcesByTagsRequest, CountResourcesByTagsResponse>
     */
    public AsyncInvoker<CountResourcesByTagsRequest, CountResourcesByTagsResponse> countResourcesByTagsAsyncInvoker(
        CountResourcesByTagsRequest request) {
        return new AsyncInvoker<>(request, VpnMeta.countResourcesByTags, hcClient);
    }

    /**
     * 查询项目标签
     *
     * 查询租户在指定项目中指定资源类型下的所有标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectTagsRequest 请求对象
     * @return CompletableFuture<ListProjectTagsResponse>
     */
    public CompletableFuture<ListProjectTagsResponse> listProjectTagsAsync(ListProjectTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, VpnMeta.listProjectTags);
    }

    /**
     * 查询项目标签
     *
     * 查询租户在指定项目中指定资源类型下的所有标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectTagsRequest 请求对象
     * @return AsyncInvoker<ListProjectTagsRequest, ListProjectTagsResponse>
     */
    public AsyncInvoker<ListProjectTagsRequest, ListProjectTagsResponse> listProjectTagsAsyncInvoker(
        ListProjectTagsRequest request) {
        return new AsyncInvoker<>(request, VpnMeta.listProjectTags, hcClient);
    }

    /**
     * 查询资源实例列表
     *
     * 根据标签查询资源实例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListResourcesByTagsRequest 请求对象
     * @return CompletableFuture<ListResourcesByTagsResponse>
     */
    public CompletableFuture<ListResourcesByTagsResponse> listResourcesByTagsAsync(ListResourcesByTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, VpnMeta.listResourcesByTags);
    }

    /**
     * 查询资源实例列表
     *
     * 根据标签查询资源实例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListResourcesByTagsRequest 请求对象
     * @return AsyncInvoker<ListResourcesByTagsRequest, ListResourcesByTagsResponse>
     */
    public AsyncInvoker<ListResourcesByTagsRequest, ListResourcesByTagsResponse> listResourcesByTagsAsyncInvoker(
        ListResourcesByTagsRequest request) {
        return new AsyncInvoker<>(request, VpnMeta.listResourcesByTags, hcClient);
    }

    /**
     * 查询资源标签
     *
     * 查询指定实例的标签信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowResourceTagsRequest 请求对象
     * @return CompletableFuture<ShowResourceTagsResponse>
     */
    public CompletableFuture<ShowResourceTagsResponse> showResourceTagsAsync(ShowResourceTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, VpnMeta.showResourceTags);
    }

    /**
     * 查询资源标签
     *
     * 查询指定实例的标签信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowResourceTagsRequest 请求对象
     * @return AsyncInvoker<ShowResourceTagsRequest, ShowResourceTagsResponse>
     */
    public AsyncInvoker<ShowResourceTagsRequest, ShowResourceTagsResponse> showResourceTagsAsyncInvoker(
        ShowResourceTagsRequest request) {
        return new AsyncInvoker<>(request, VpnMeta.showResourceTags, hcClient);
    }

    /**
     * 创建VPN访问策略
     *
     * 创建VPN访问策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateVpnAccessPolicyRequest 请求对象
     * @return CompletableFuture<CreateVpnAccessPolicyResponse>
     */
    public CompletableFuture<CreateVpnAccessPolicyResponse> createVpnAccessPolicyAsync(
        CreateVpnAccessPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, VpnMeta.createVpnAccessPolicy);
    }

    /**
     * 创建VPN访问策略
     *
     * 创建VPN访问策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateVpnAccessPolicyRequest 请求对象
     * @return AsyncInvoker<CreateVpnAccessPolicyRequest, CreateVpnAccessPolicyResponse>
     */
    public AsyncInvoker<CreateVpnAccessPolicyRequest, CreateVpnAccessPolicyResponse> createVpnAccessPolicyAsyncInvoker(
        CreateVpnAccessPolicyRequest request) {
        return new AsyncInvoker<>(request, VpnMeta.createVpnAccessPolicy, hcClient);
    }

    /**
     * 删除VPN访问策略
     *
     * 删除VPN访问策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteVpnAccessPolicyRequest 请求对象
     * @return CompletableFuture<DeleteVpnAccessPolicyResponse>
     */
    public CompletableFuture<DeleteVpnAccessPolicyResponse> deleteVpnAccessPolicyAsync(
        DeleteVpnAccessPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, VpnMeta.deleteVpnAccessPolicy);
    }

    /**
     * 删除VPN访问策略
     *
     * 删除VPN访问策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteVpnAccessPolicyRequest 请求对象
     * @return AsyncInvoker<DeleteVpnAccessPolicyRequest, DeleteVpnAccessPolicyResponse>
     */
    public AsyncInvoker<DeleteVpnAccessPolicyRequest, DeleteVpnAccessPolicyResponse> deleteVpnAccessPolicyAsyncInvoker(
        DeleteVpnAccessPolicyRequest request) {
        return new AsyncInvoker<>(request, VpnMeta.deleteVpnAccessPolicy, hcClient);
    }

    /**
     * 查询VPN访问策略列表
     *
     * 查询VPN访问策略列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVpnAccessPoliciesRequest 请求对象
     * @return CompletableFuture<ListVpnAccessPoliciesResponse>
     */
    public CompletableFuture<ListVpnAccessPoliciesResponse> listVpnAccessPoliciesAsync(
        ListVpnAccessPoliciesRequest request) {
        return hcClient.asyncInvokeHttp(request, VpnMeta.listVpnAccessPolicies);
    }

    /**
     * 查询VPN访问策略列表
     *
     * 查询VPN访问策略列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVpnAccessPoliciesRequest 请求对象
     * @return AsyncInvoker<ListVpnAccessPoliciesRequest, ListVpnAccessPoliciesResponse>
     */
    public AsyncInvoker<ListVpnAccessPoliciesRequest, ListVpnAccessPoliciesResponse> listVpnAccessPoliciesAsyncInvoker(
        ListVpnAccessPoliciesRequest request) {
        return new AsyncInvoker<>(request, VpnMeta.listVpnAccessPolicies, hcClient);
    }

    /**
     * 查询VPN访问策略
     *
     * 查询VPN访问策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowVpnAccessPolicyRequest 请求对象
     * @return CompletableFuture<ShowVpnAccessPolicyResponse>
     */
    public CompletableFuture<ShowVpnAccessPolicyResponse> showVpnAccessPolicyAsync(ShowVpnAccessPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, VpnMeta.showVpnAccessPolicy);
    }

    /**
     * 查询VPN访问策略
     *
     * 查询VPN访问策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowVpnAccessPolicyRequest 请求对象
     * @return AsyncInvoker<ShowVpnAccessPolicyRequest, ShowVpnAccessPolicyResponse>
     */
    public AsyncInvoker<ShowVpnAccessPolicyRequest, ShowVpnAccessPolicyResponse> showVpnAccessPolicyAsyncInvoker(
        ShowVpnAccessPolicyRequest request) {
        return new AsyncInvoker<>(request, VpnMeta.showVpnAccessPolicy, hcClient);
    }

    /**
     * 修改VPN访问策略
     *
     * 修改VPN访问策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateVpnAccessPolicyRequest 请求对象
     * @return CompletableFuture<UpdateVpnAccessPolicyResponse>
     */
    public CompletableFuture<UpdateVpnAccessPolicyResponse> updateVpnAccessPolicyAsync(
        UpdateVpnAccessPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, VpnMeta.updateVpnAccessPolicy);
    }

    /**
     * 修改VPN访问策略
     *
     * 修改VPN访问策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateVpnAccessPolicyRequest 请求对象
     * @return AsyncInvoker<UpdateVpnAccessPolicyRequest, UpdateVpnAccessPolicyResponse>
     */
    public AsyncInvoker<UpdateVpnAccessPolicyRequest, UpdateVpnAccessPolicyResponse> updateVpnAccessPolicyAsyncInvoker(
        UpdateVpnAccessPolicyRequest request) {
        return new AsyncInvoker<>(request, VpnMeta.updateVpnAccessPolicy, hcClient);
    }

    /**
     * 批量创建VPN连接
     *
     * 同时创建1-2条VPN连接
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateVpnConnectionRequest 请求对象
     * @return CompletableFuture<BatchCreateVpnConnectionResponse>
     */
    public CompletableFuture<BatchCreateVpnConnectionResponse> batchCreateVpnConnectionAsync(
        BatchCreateVpnConnectionRequest request) {
        return hcClient.asyncInvokeHttp(request, VpnMeta.batchCreateVpnConnection);
    }

    /**
     * 批量创建VPN连接
     *
     * 同时创建1-2条VPN连接
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateVpnConnectionRequest 请求对象
     * @return AsyncInvoker<BatchCreateVpnConnectionRequest, BatchCreateVpnConnectionResponse>
     */
    public AsyncInvoker<BatchCreateVpnConnectionRequest, BatchCreateVpnConnectionResponse> batchCreateVpnConnectionAsyncInvoker(
        BatchCreateVpnConnectionRequest request) {
        return new AsyncInvoker<>(request, VpnMeta.batchCreateVpnConnection, hcClient);
    }

    /**
     * 创建VPN连接
     *
     * 创建VPN连接，连接VPN网关与对端网关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateVpnConnectionRequest 请求对象
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
     * @param request CreateVpnConnectionRequest 请求对象
     * @return AsyncInvoker<CreateVpnConnectionRequest, CreateVpnConnectionResponse>
     */
    public AsyncInvoker<CreateVpnConnectionRequest, CreateVpnConnectionResponse> createVpnConnectionAsyncInvoker(
        CreateVpnConnectionRequest request) {
        return new AsyncInvoker<>(request, VpnMeta.createVpnConnection, hcClient);
    }

    /**
     * 删除VPN连接
     *
     * 根据连接ID，删除指定的VPN连接
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteVpnConnectionRequest 请求对象
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
     * @param request DeleteVpnConnectionRequest 请求对象
     * @return AsyncInvoker<DeleteVpnConnectionRequest, DeleteVpnConnectionResponse>
     */
    public AsyncInvoker<DeleteVpnConnectionRequest, DeleteVpnConnectionResponse> deleteVpnConnectionAsyncInvoker(
        DeleteVpnConnectionRequest request) {
        return new AsyncInvoker<>(request, VpnMeta.deleteVpnConnection, hcClient);
    }

    /**
     * 查询VPN连接列表
     *
     * 查询VPN连接列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVpnConnectionsRequest 请求对象
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
     * @param request ListVpnConnectionsRequest 请求对象
     * @return AsyncInvoker<ListVpnConnectionsRequest, ListVpnConnectionsResponse>
     */
    public AsyncInvoker<ListVpnConnectionsRequest, ListVpnConnectionsResponse> listVpnConnectionsAsyncInvoker(
        ListVpnConnectionsRequest request) {
        return new AsyncInvoker<>(request, VpnMeta.listVpnConnections, hcClient);
    }

    /**
     * 重置VPN连接
     *
     * 根据连接ID，重置指定VPN连接
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResetVpnConnectionRequest 请求对象
     * @return CompletableFuture<ResetVpnConnectionResponse>
     */
    public CompletableFuture<ResetVpnConnectionResponse> resetVpnConnectionAsync(ResetVpnConnectionRequest request) {
        return hcClient.asyncInvokeHttp(request, VpnMeta.resetVpnConnection);
    }

    /**
     * 重置VPN连接
     *
     * 根据连接ID，重置指定VPN连接
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResetVpnConnectionRequest 请求对象
     * @return AsyncInvoker<ResetVpnConnectionRequest, ResetVpnConnectionResponse>
     */
    public AsyncInvoker<ResetVpnConnectionRequest, ResetVpnConnectionResponse> resetVpnConnectionAsyncInvoker(
        ResetVpnConnectionRequest request) {
        return new AsyncInvoker<>(request, VpnMeta.resetVpnConnection, hcClient);
    }

    /**
     * 查询VPN连接
     *
     * 根据连接ID，查询指定的VPN连接的参数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowVpnConnectionRequest 请求对象
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
     * @param request ShowVpnConnectionRequest 请求对象
     * @return AsyncInvoker<ShowVpnConnectionRequest, ShowVpnConnectionResponse>
     */
    public AsyncInvoker<ShowVpnConnectionRequest, ShowVpnConnectionResponse> showVpnConnectionAsyncInvoker(
        ShowVpnConnectionRequest request) {
        return new AsyncInvoker<>(request, VpnMeta.showVpnConnection, hcClient);
    }

    /**
     * 查询VPN连接日志
     *
     * 根据连接ID，查询指定的VPN连接日志
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowVpnConnectionLogRequest 请求对象
     * @return CompletableFuture<ShowVpnConnectionLogResponse>
     */
    public CompletableFuture<ShowVpnConnectionLogResponse> showVpnConnectionLogAsync(
        ShowVpnConnectionLogRequest request) {
        return hcClient.asyncInvokeHttp(request, VpnMeta.showVpnConnectionLog);
    }

    /**
     * 查询VPN连接日志
     *
     * 根据连接ID，查询指定的VPN连接日志
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowVpnConnectionLogRequest 请求对象
     * @return AsyncInvoker<ShowVpnConnectionLogRequest, ShowVpnConnectionLogResponse>
     */
    public AsyncInvoker<ShowVpnConnectionLogRequest, ShowVpnConnectionLogResponse> showVpnConnectionLogAsyncInvoker(
        ShowVpnConnectionLogRequest request) {
        return new AsyncInvoker<>(request, VpnMeta.showVpnConnectionLog, hcClient);
    }

    /**
     * 更新VPN连接
     *
     * 根据连接ID，更新指定的VPN连接的参数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateVpnConnectionRequest 请求对象
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
     * @param request UpdateVpnConnectionRequest 请求对象
     * @return AsyncInvoker<UpdateVpnConnectionRequest, UpdateVpnConnectionResponse>
     */
    public AsyncInvoker<UpdateVpnConnectionRequest, UpdateVpnConnectionResponse> updateVpnConnectionAsyncInvoker(
        UpdateVpnConnectionRequest request) {
        return new AsyncInvoker<>(request, VpnMeta.updateVpnConnection, hcClient);
    }

    /**
     * 删除VPN连接日志配置
     *
     * 删除VPN连接日志配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteVpnConnectionsLogConfigRequest 请求对象
     * @return CompletableFuture<DeleteVpnConnectionsLogConfigResponse>
     */
    public CompletableFuture<DeleteVpnConnectionsLogConfigResponse> deleteVpnConnectionsLogConfigAsync(
        DeleteVpnConnectionsLogConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, VpnMeta.deleteVpnConnectionsLogConfig);
    }

    /**
     * 删除VPN连接日志配置
     *
     * 删除VPN连接日志配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteVpnConnectionsLogConfigRequest 请求对象
     * @return AsyncInvoker<DeleteVpnConnectionsLogConfigRequest, DeleteVpnConnectionsLogConfigResponse>
     */
    public AsyncInvoker<DeleteVpnConnectionsLogConfigRequest, DeleteVpnConnectionsLogConfigResponse> deleteVpnConnectionsLogConfigAsyncInvoker(
        DeleteVpnConnectionsLogConfigRequest request) {
        return new AsyncInvoker<>(request, VpnMeta.deleteVpnConnectionsLogConfig, hcClient);
    }

    /**
     * 查询VPN连接日志配置
     *
     * 查询VPN连接日志配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowVpnConnectionsLogConfigRequest 请求对象
     * @return CompletableFuture<ShowVpnConnectionsLogConfigResponse>
     */
    public CompletableFuture<ShowVpnConnectionsLogConfigResponse> showVpnConnectionsLogConfigAsync(
        ShowVpnConnectionsLogConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, VpnMeta.showVpnConnectionsLogConfig);
    }

    /**
     * 查询VPN连接日志配置
     *
     * 查询VPN连接日志配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowVpnConnectionsLogConfigRequest 请求对象
     * @return AsyncInvoker<ShowVpnConnectionsLogConfigRequest, ShowVpnConnectionsLogConfigResponse>
     */
    public AsyncInvoker<ShowVpnConnectionsLogConfigRequest, ShowVpnConnectionsLogConfigResponse> showVpnConnectionsLogConfigAsyncInvoker(
        ShowVpnConnectionsLogConfigRequest request) {
        return new AsyncInvoker<>(request, VpnMeta.showVpnConnectionsLogConfig, hcClient);
    }

    /**
     * 更新VPN连接日志配置
     *
     * 更新VPN连接日志配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateVpnConnectionsLogConfigRequest 请求对象
     * @return CompletableFuture<UpdateVpnConnectionsLogConfigResponse>
     */
    public CompletableFuture<UpdateVpnConnectionsLogConfigResponse> updateVpnConnectionsLogConfigAsync(
        UpdateVpnConnectionsLogConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, VpnMeta.updateVpnConnectionsLogConfig);
    }

    /**
     * 更新VPN连接日志配置
     *
     * 更新VPN连接日志配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateVpnConnectionsLogConfigRequest 请求对象
     * @return AsyncInvoker<UpdateVpnConnectionsLogConfigRequest, UpdateVpnConnectionsLogConfigResponse>
     */
    public AsyncInvoker<UpdateVpnConnectionsLogConfigRequest, UpdateVpnConnectionsLogConfigResponse> updateVpnConnectionsLogConfigAsyncInvoker(
        UpdateVpnConnectionsLogConfigRequest request) {
        return new AsyncInvoker<>(request, VpnMeta.updateVpnConnectionsLogConfig, hcClient);
    }

    /**
     * 创建VPN网关
     *
     * 创建一个VPN网关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateVgwRequest 请求对象
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
     * @param request CreateVgwRequest 请求对象
     * @return AsyncInvoker<CreateVgwRequest, CreateVgwResponse>
     */
    public AsyncInvoker<CreateVgwRequest, CreateVgwResponse> createVgwAsyncInvoker(CreateVgwRequest request) {
        return new AsyncInvoker<>(request, VpnMeta.createVgw, hcClient);
    }

    /**
     * 删除VPN网关
     *
     * 根据VPN网关ID，删除指定的VPN网关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteVgwRequest 请求对象
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
     * @param request DeleteVgwRequest 请求对象
     * @return AsyncInvoker<DeleteVgwRequest, DeleteVgwResponse>
     */
    public AsyncInvoker<DeleteVgwRequest, DeleteVgwResponse> deleteVgwAsyncInvoker(DeleteVgwRequest request) {
        return new AsyncInvoker<>(request, VpnMeta.deleteVgw, hcClient);
    }

    /**
     * 查询VPN网关可用区
     *
     * 查询VPN网关可用区
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAvailabilityZonesRequest 请求对象
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
     * @param request ListAvailabilityZonesRequest 请求对象
     * @return AsyncInvoker<ListAvailabilityZonesRequest, ListAvailabilityZonesResponse>
     */
    public AsyncInvoker<ListAvailabilityZonesRequest, ListAvailabilityZonesResponse> listAvailabilityZonesAsyncInvoker(
        ListAvailabilityZonesRequest request) {
        return new AsyncInvoker<>(request, VpnMeta.listAvailabilityZones, hcClient);
    }

    /**
     * 查询VPN网关可用区
     *
     * 查询VPN网关可用区
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListExtendedAvailabilityZonesRequest 请求对象
     * @return CompletableFuture<ListExtendedAvailabilityZonesResponse>
     */
    public CompletableFuture<ListExtendedAvailabilityZonesResponse> listExtendedAvailabilityZonesAsync(
        ListExtendedAvailabilityZonesRequest request) {
        return hcClient.asyncInvokeHttp(request, VpnMeta.listExtendedAvailabilityZones);
    }

    /**
     * 查询VPN网关可用区
     *
     * 查询VPN网关可用区
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListExtendedAvailabilityZonesRequest 请求对象
     * @return AsyncInvoker<ListExtendedAvailabilityZonesRequest, ListExtendedAvailabilityZonesResponse>
     */
    public AsyncInvoker<ListExtendedAvailabilityZonesRequest, ListExtendedAvailabilityZonesResponse> listExtendedAvailabilityZonesAsyncInvoker(
        ListExtendedAvailabilityZonesRequest request) {
        return new AsyncInvoker<>(request, VpnMeta.listExtendedAvailabilityZones, hcClient);
    }

    /**
     * 查询VPN网关列表
     *
     * 查询VPN网关列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVgwsRequest 请求对象
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
     * @param request ListVgwsRequest 请求对象
     * @return AsyncInvoker<ListVgwsRequest, ListVgwsResponse>
     */
    public AsyncInvoker<ListVgwsRequest, ListVgwsResponse> listVgwsAsyncInvoker(ListVgwsRequest request) {
        return new AsyncInvoker<>(request, VpnMeta.listVgws, hcClient);
    }

    /**
     * 查询VPN网关
     *
     * 根据VPN网关ID，查询指定的VPN网关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowVgwRequest 请求对象
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
     * @param request ShowVgwRequest 请求对象
     * @return AsyncInvoker<ShowVgwRequest, ShowVgwResponse>
     */
    public AsyncInvoker<ShowVgwRequest, ShowVgwResponse> showVgwAsyncInvoker(ShowVgwRequest request) {
        return new AsyncInvoker<>(request, VpnMeta.showVgw, hcClient);
    }

    /**
     * 查询VPN网关路由表
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowVpnGatewayRoutingTableRequest 请求对象
     * @return CompletableFuture<ShowVpnGatewayRoutingTableResponse>
     */
    public CompletableFuture<ShowVpnGatewayRoutingTableResponse> showVpnGatewayRoutingTableAsync(
        ShowVpnGatewayRoutingTableRequest request) {
        return hcClient.asyncInvokeHttp(request, VpnMeta.showVpnGatewayRoutingTable);
    }

    /**
     * 查询VPN网关路由表
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowVpnGatewayRoutingTableRequest 请求对象
     * @return AsyncInvoker<ShowVpnGatewayRoutingTableRequest, ShowVpnGatewayRoutingTableResponse>
     */
    public AsyncInvoker<ShowVpnGatewayRoutingTableRequest, ShowVpnGatewayRoutingTableResponse> showVpnGatewayRoutingTableAsyncInvoker(
        ShowVpnGatewayRoutingTableRequest request) {
        return new AsyncInvoker<>(request, VpnMeta.showVpnGatewayRoutingTable, hcClient);
    }

    /**
     * 修改网关规格
     *
     * 对单个网关规格进行修改，可以升配或降配
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePostpaidVgwSpecificationRequest 请求对象
     * @return CompletableFuture<UpdatePostpaidVgwSpecificationResponse>
     */
    public CompletableFuture<UpdatePostpaidVgwSpecificationResponse> updatePostpaidVgwSpecificationAsync(
        UpdatePostpaidVgwSpecificationRequest request) {
        return hcClient.asyncInvokeHttp(request, VpnMeta.updatePostpaidVgwSpecification);
    }

    /**
     * 修改网关规格
     *
     * 对单个网关规格进行修改，可以升配或降配
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePostpaidVgwSpecificationRequest 请求对象
     * @return AsyncInvoker<UpdatePostpaidVgwSpecificationRequest, UpdatePostpaidVgwSpecificationResponse>
     */
    public AsyncInvoker<UpdatePostpaidVgwSpecificationRequest, UpdatePostpaidVgwSpecificationResponse> updatePostpaidVgwSpecificationAsyncInvoker(
        UpdatePostpaidVgwSpecificationRequest request) {
        return new AsyncInvoker<>(request, VpnMeta.updatePostpaidVgwSpecification, hcClient);
    }

    /**
     * 更新VPN网关
     *
     * 根据VPN网关ID，更新指定的VPN网关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateVgwRequest 请求对象
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
     * @param request UpdateVgwRequest 请求对象
     * @return AsyncInvoker<UpdateVgwRequest, UpdateVgwResponse>
     */
    public AsyncInvoker<UpdateVgwRequest, UpdateVgwResponse> updateVgwAsyncInvoker(UpdateVgwRequest request) {
        return new AsyncInvoker<>(request, VpnMeta.updateVgw, hcClient);
    }

    /**
     * 导入VPN网关证书
     *
     * 导入租户VPN网关所使用的证书，包括签名证书、签名私钥、加密证书、加密私钥和CA证书链。当前只支持国密证书
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateVgwCertificateRequest 请求对象
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
     * @param request CreateVgwCertificateRequest 请求对象
     * @return AsyncInvoker<CreateVgwCertificateRequest, CreateVgwCertificateResponse>
     */
    public AsyncInvoker<CreateVgwCertificateRequest, CreateVgwCertificateResponse> createVgwCertificateAsyncInvoker(
        CreateVgwCertificateRequest request) {
        return new AsyncInvoker<>(request, VpnMeta.createVgwCertificate, hcClient);
    }

    /**
     * 查询VPN网关证书
     *
     * 根据VPN网关ID，查询所指定的VPN网关证书
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowVpnGatewayCertificateRequest 请求对象
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
     * @param request ShowVpnGatewayCertificateRequest 请求对象
     * @return AsyncInvoker<ShowVpnGatewayCertificateRequest, ShowVpnGatewayCertificateResponse>
     */
    public AsyncInvoker<ShowVpnGatewayCertificateRequest, ShowVpnGatewayCertificateResponse> showVpnGatewayCertificateAsyncInvoker(
        ShowVpnGatewayCertificateRequest request) {
        return new AsyncInvoker<>(request, VpnMeta.showVpnGatewayCertificate, hcClient);
    }

    /**
     * 更新VPN网关证书
     *
     * 更新租户VPN网关所使用的证书，包括签名证书、签名私钥、加密证书、加密私钥和CA证书链。当前只支持国密证书
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateVgwCertificateRequest 请求对象
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
     * @param request UpdateVgwCertificateRequest 请求对象
     * @return AsyncInvoker<UpdateVgwCertificateRequest, UpdateVgwCertificateResponse>
     */
    public AsyncInvoker<UpdateVgwCertificateRequest, UpdateVgwCertificateResponse> updateVgwCertificateAsyncInvoker(
        UpdateVgwCertificateRequest request) {
        return new AsyncInvoker<>(request, VpnMeta.updateVgwCertificate, hcClient);
    }

    /**
     * 查询指定租户配额
     *
     * 查询指定租户的配额
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowQuotasInfoRequest 请求对象
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
     * @param request ShowQuotasInfoRequest 请求对象
     * @return AsyncInvoker<ShowQuotasInfoRequest, ShowQuotasInfoResponse>
     */
    public AsyncInvoker<ShowQuotasInfoRequest, ShowQuotasInfoResponse> showQuotasInfoAsyncInvoker(
        ShowQuotasInfoRequest request) {
        return new AsyncInvoker<>(request, VpnMeta.showQuotasInfo, hcClient);
    }

    /**
     * 创建一个VPN 服务端
     *
     * 创建一个VPN 服务端
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateVpnServerRequest 请求对象
     * @return CompletableFuture<CreateVpnServerResponse>
     */
    public CompletableFuture<CreateVpnServerResponse> createVpnServerAsync(CreateVpnServerRequest request) {
        return hcClient.asyncInvokeHttp(request, VpnMeta.createVpnServer);
    }

    /**
     * 创建一个VPN 服务端
     *
     * 创建一个VPN 服务端
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateVpnServerRequest 请求对象
     * @return AsyncInvoker<CreateVpnServerRequest, CreateVpnServerResponse>
     */
    public AsyncInvoker<CreateVpnServerRequest, CreateVpnServerResponse> createVpnServerAsyncInvoker(
        CreateVpnServerRequest request) {
        return new AsyncInvoker<>(request, VpnMeta.createVpnServer, hcClient);
    }

    /**
     * 导出服务端对应的客户端配置信息
     *
     * 导出客户端配置信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportClientConfigRequest 请求对象
     * @return CompletableFuture<ExportClientConfigResponse>
     */
    public CompletableFuture<ExportClientConfigResponse> exportClientConfigAsync(ExportClientConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, VpnMeta.exportClientConfig);
    }

    /**
     * 导出服务端对应的客户端配置信息
     *
     * 导出客户端配置信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportClientConfigRequest 请求对象
     * @return AsyncInvoker<ExportClientConfigRequest, ExportClientConfigResponse>
     */
    public AsyncInvoker<ExportClientConfigRequest, ExportClientConfigResponse> exportClientConfigAsyncInvoker(
        ExportClientConfigRequest request) {
        return new AsyncInvoker<>(request, VpnMeta.exportClientConfig, hcClient);
    }

    /**
     * 查询租户下的所有服务端信息
     *
     * 查询租户下的所有服务端信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVpnServersByProjectRequest 请求对象
     * @return CompletableFuture<ListVpnServersByProjectResponse>
     */
    public CompletableFuture<ListVpnServersByProjectResponse> listVpnServersByProjectAsync(
        ListVpnServersByProjectRequest request) {
        return hcClient.asyncInvokeHttp(request, VpnMeta.listVpnServersByProject);
    }

    /**
     * 查询租户下的所有服务端信息
     *
     * 查询租户下的所有服务端信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVpnServersByProjectRequest 请求对象
     * @return AsyncInvoker<ListVpnServersByProjectRequest, ListVpnServersByProjectResponse>
     */
    public AsyncInvoker<ListVpnServersByProjectRequest, ListVpnServersByProjectResponse> listVpnServersByProjectAsyncInvoker(
        ListVpnServersByProjectRequest request) {
        return new AsyncInvoker<>(request, VpnMeta.listVpnServersByProject, hcClient);
    }

    /**
     * 查询一个网关下的服务端信息
     *
     * 查询一个网关下的服务端信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVpnServersByVgwRequest 请求对象
     * @return CompletableFuture<ListVpnServersByVgwResponse>
     */
    public CompletableFuture<ListVpnServersByVgwResponse> listVpnServersByVgwAsync(ListVpnServersByVgwRequest request) {
        return hcClient.asyncInvokeHttp(request, VpnMeta.listVpnServersByVgw);
    }

    /**
     * 查询一个网关下的服务端信息
     *
     * 查询一个网关下的服务端信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVpnServersByVgwRequest 请求对象
     * @return AsyncInvoker<ListVpnServersByVgwRequest, ListVpnServersByVgwResponse>
     */
    public AsyncInvoker<ListVpnServersByVgwRequest, ListVpnServersByVgwResponse> listVpnServersByVgwAsyncInvoker(
        ListVpnServersByVgwRequest request) {
        return new AsyncInvoker<>(request, VpnMeta.listVpnServersByVgw, hcClient);
    }

    /**
     * 更新指定VPN 服务端
     *
     * 更新指定VPN 服务端
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateVpnServerRequest 请求对象
     * @return CompletableFuture<UpdateVpnServerResponse>
     */
    public CompletableFuture<UpdateVpnServerResponse> updateVpnServerAsync(UpdateVpnServerRequest request) {
        return hcClient.asyncInvokeHttp(request, VpnMeta.updateVpnServer);
    }

    /**
     * 更新指定VPN 服务端
     *
     * 更新指定VPN 服务端
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateVpnServerRequest 请求对象
     * @return AsyncInvoker<UpdateVpnServerRequest, UpdateVpnServerResponse>
     */
    public AsyncInvoker<UpdateVpnServerRequest, UpdateVpnServerResponse> updateVpnServerAsyncInvoker(
        UpdateVpnServerRequest request) {
        return new AsyncInvoker<>(request, VpnMeta.updateVpnServer, hcClient);
    }

    /**
     * 批量创建VPN用户
     *
     * 批量创建P2C VPN用户
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateVpnUsersRequest 请求对象
     * @return CompletableFuture<BatchCreateVpnUsersResponse>
     */
    public CompletableFuture<BatchCreateVpnUsersResponse> batchCreateVpnUsersAsync(BatchCreateVpnUsersRequest request) {
        return hcClient.asyncInvokeHttp(request, VpnMeta.batchCreateVpnUsers);
    }

    /**
     * 批量创建VPN用户
     *
     * 批量创建P2C VPN用户
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateVpnUsersRequest 请求对象
     * @return AsyncInvoker<BatchCreateVpnUsersRequest, BatchCreateVpnUsersResponse>
     */
    public AsyncInvoker<BatchCreateVpnUsersRequest, BatchCreateVpnUsersResponse> batchCreateVpnUsersAsyncInvoker(
        BatchCreateVpnUsersRequest request) {
        return new AsyncInvoker<>(request, VpnMeta.batchCreateVpnUsers, hcClient);
    }

    /**
     * 批量删除VPN用户
     *
     * 批量删除P2C VPN用户
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteVpnUsersRequest 请求对象
     * @return CompletableFuture<BatchDeleteVpnUsersResponse>
     */
    public CompletableFuture<BatchDeleteVpnUsersResponse> batchDeleteVpnUsersAsync(BatchDeleteVpnUsersRequest request) {
        return hcClient.asyncInvokeHttp(request, VpnMeta.batchDeleteVpnUsers);
    }

    /**
     * 批量删除VPN用户
     *
     * 批量删除P2C VPN用户
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteVpnUsersRequest 请求对象
     * @return AsyncInvoker<BatchDeleteVpnUsersRequest, BatchDeleteVpnUsersResponse>
     */
    public AsyncInvoker<BatchDeleteVpnUsersRequest, BatchDeleteVpnUsersResponse> batchDeleteVpnUsersAsyncInvoker(
        BatchDeleteVpnUsersRequest request) {
        return new AsyncInvoker<>(request, VpnMeta.batchDeleteVpnUsers, hcClient);
    }

    /**
     * 创建VPN用户
     *
     * 创建VPN用户
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateVpnUserRequest 请求对象
     * @return CompletableFuture<CreateVpnUserResponse>
     */
    public CompletableFuture<CreateVpnUserResponse> createVpnUserAsync(CreateVpnUserRequest request) {
        return hcClient.asyncInvokeHttp(request, VpnMeta.createVpnUser);
    }

    /**
     * 创建VPN用户
     *
     * 创建VPN用户
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateVpnUserRequest 请求对象
     * @return AsyncInvoker<CreateVpnUserRequest, CreateVpnUserResponse>
     */
    public AsyncInvoker<CreateVpnUserRequest, CreateVpnUserResponse> createVpnUserAsyncInvoker(
        CreateVpnUserRequest request) {
        return new AsyncInvoker<>(request, VpnMeta.createVpnUser, hcClient);
    }

    /**
     * 删除VPN用户
     *
     * 删除VPN用户
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteVpnUserRequest 请求对象
     * @return CompletableFuture<DeleteVpnUserResponse>
     */
    public CompletableFuture<DeleteVpnUserResponse> deleteVpnUserAsync(DeleteVpnUserRequest request) {
        return hcClient.asyncInvokeHttp(request, VpnMeta.deleteVpnUser);
    }

    /**
     * 删除VPN用户
     *
     * 删除VPN用户
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteVpnUserRequest 请求对象
     * @return AsyncInvoker<DeleteVpnUserRequest, DeleteVpnUserResponse>
     */
    public AsyncInvoker<DeleteVpnUserRequest, DeleteVpnUserResponse> deleteVpnUserAsyncInvoker(
        DeleteVpnUserRequest request) {
        return new AsyncInvoker<>(request, VpnMeta.deleteVpnUser, hcClient);
    }

    /**
     * 查询VPN用户列表
     *
     * 查询VPN用户列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVpnUsersRequest 请求对象
     * @return CompletableFuture<ListVpnUsersResponse>
     */
    public CompletableFuture<ListVpnUsersResponse> listVpnUsersAsync(ListVpnUsersRequest request) {
        return hcClient.asyncInvokeHttp(request, VpnMeta.listVpnUsers);
    }

    /**
     * 查询VPN用户列表
     *
     * 查询VPN用户列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVpnUsersRequest 请求对象
     * @return AsyncInvoker<ListVpnUsersRequest, ListVpnUsersResponse>
     */
    public AsyncInvoker<ListVpnUsersRequest, ListVpnUsersResponse> listVpnUsersAsyncInvoker(
        ListVpnUsersRequest request) {
        return new AsyncInvoker<>(request, VpnMeta.listVpnUsers, hcClient);
    }

    /**
     * 重置VPN用户密码
     *
     * 重置VPN用户密码
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResetVpnUserPasswordRequest 请求对象
     * @return CompletableFuture<ResetVpnUserPasswordResponse>
     */
    public CompletableFuture<ResetVpnUserPasswordResponse> resetVpnUserPasswordAsync(
        ResetVpnUserPasswordRequest request) {
        return hcClient.asyncInvokeHttp(request, VpnMeta.resetVpnUserPassword);
    }

    /**
     * 重置VPN用户密码
     *
     * 重置VPN用户密码
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResetVpnUserPasswordRequest 请求对象
     * @return AsyncInvoker<ResetVpnUserPasswordRequest, ResetVpnUserPasswordResponse>
     */
    public AsyncInvoker<ResetVpnUserPasswordRequest, ResetVpnUserPasswordResponse> resetVpnUserPasswordAsyncInvoker(
        ResetVpnUserPasswordRequest request) {
        return new AsyncInvoker<>(request, VpnMeta.resetVpnUserPassword, hcClient);
    }

    /**
     * 查询VPN用户
     *
     * 查询VPN用户
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowVpnUserRequest 请求对象
     * @return CompletableFuture<ShowVpnUserResponse>
     */
    public CompletableFuture<ShowVpnUserResponse> showVpnUserAsync(ShowVpnUserRequest request) {
        return hcClient.asyncInvokeHttp(request, VpnMeta.showVpnUser);
    }

    /**
     * 查询VPN用户
     *
     * 查询VPN用户
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowVpnUserRequest 请求对象
     * @return AsyncInvoker<ShowVpnUserRequest, ShowVpnUserResponse>
     */
    public AsyncInvoker<ShowVpnUserRequest, ShowVpnUserResponse> showVpnUserAsyncInvoker(ShowVpnUserRequest request) {
        return new AsyncInvoker<>(request, VpnMeta.showVpnUser, hcClient);
    }

    /**
     * 修改VPN用户
     *
     * 修改VPN用户
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateVpnUserRequest 请求对象
     * @return CompletableFuture<UpdateVpnUserResponse>
     */
    public CompletableFuture<UpdateVpnUserResponse> updateVpnUserAsync(UpdateVpnUserRequest request) {
        return hcClient.asyncInvokeHttp(request, VpnMeta.updateVpnUser);
    }

    /**
     * 修改VPN用户
     *
     * 修改VPN用户
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateVpnUserRequest 请求对象
     * @return AsyncInvoker<UpdateVpnUserRequest, UpdateVpnUserResponse>
     */
    public AsyncInvoker<UpdateVpnUserRequest, UpdateVpnUserResponse> updateVpnUserAsyncInvoker(
        UpdateVpnUserRequest request) {
        return new AsyncInvoker<>(request, VpnMeta.updateVpnUser, hcClient);
    }

    /**
     * 修改VPN用户密码
     *
     * 修改VPN用户密码
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateVpnUserPasswordRequest 请求对象
     * @return CompletableFuture<UpdateVpnUserPasswordResponse>
     */
    public CompletableFuture<UpdateVpnUserPasswordResponse> updateVpnUserPasswordAsync(
        UpdateVpnUserPasswordRequest request) {
        return hcClient.asyncInvokeHttp(request, VpnMeta.updateVpnUserPassword);
    }

    /**
     * 修改VPN用户密码
     *
     * 修改VPN用户密码
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateVpnUserPasswordRequest 请求对象
     * @return AsyncInvoker<UpdateVpnUserPasswordRequest, UpdateVpnUserPasswordResponse>
     */
    public AsyncInvoker<UpdateVpnUserPasswordRequest, UpdateVpnUserPasswordResponse> updateVpnUserPasswordAsyncInvoker(
        UpdateVpnUserPasswordRequest request) {
        return new AsyncInvoker<>(request, VpnMeta.updateVpnUserPassword, hcClient);
    }

    /**
     * 添加VPN用户到组
     *
     * 添加VPN用户到组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddVpnUsersToGroupRequest 请求对象
     * @return CompletableFuture<AddVpnUsersToGroupResponse>
     */
    public CompletableFuture<AddVpnUsersToGroupResponse> addVpnUsersToGroupAsync(AddVpnUsersToGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, VpnMeta.addVpnUsersToGroup);
    }

    /**
     * 添加VPN用户到组
     *
     * 添加VPN用户到组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddVpnUsersToGroupRequest 请求对象
     * @return AsyncInvoker<AddVpnUsersToGroupRequest, AddVpnUsersToGroupResponse>
     */
    public AsyncInvoker<AddVpnUsersToGroupRequest, AddVpnUsersToGroupResponse> addVpnUsersToGroupAsyncInvoker(
        AddVpnUsersToGroupRequest request) {
        return new AsyncInvoker<>(request, VpnMeta.addVpnUsersToGroup, hcClient);
    }

    /**
     * 创建VPN用户组
     *
     * 创建VPN用户组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateVpnUserGroupRequest 请求对象
     * @return CompletableFuture<CreateVpnUserGroupResponse>
     */
    public CompletableFuture<CreateVpnUserGroupResponse> createVpnUserGroupAsync(CreateVpnUserGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, VpnMeta.createVpnUserGroup);
    }

    /**
     * 创建VPN用户组
     *
     * 创建VPN用户组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateVpnUserGroupRequest 请求对象
     * @return AsyncInvoker<CreateVpnUserGroupRequest, CreateVpnUserGroupResponse>
     */
    public AsyncInvoker<CreateVpnUserGroupRequest, CreateVpnUserGroupResponse> createVpnUserGroupAsyncInvoker(
        CreateVpnUserGroupRequest request) {
        return new AsyncInvoker<>(request, VpnMeta.createVpnUserGroup, hcClient);
    }

    /**
     * 删除VPN用户组
     *
     * 删除VPN用户组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteVpnUserGroupRequest 请求对象
     * @return CompletableFuture<DeleteVpnUserGroupResponse>
     */
    public CompletableFuture<DeleteVpnUserGroupResponse> deleteVpnUserGroupAsync(DeleteVpnUserGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, VpnMeta.deleteVpnUserGroup);
    }

    /**
     * 删除VPN用户组
     *
     * 删除VPN用户组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteVpnUserGroupRequest 请求对象
     * @return AsyncInvoker<DeleteVpnUserGroupRequest, DeleteVpnUserGroupResponse>
     */
    public AsyncInvoker<DeleteVpnUserGroupRequest, DeleteVpnUserGroupResponse> deleteVpnUserGroupAsyncInvoker(
        DeleteVpnUserGroupRequest request) {
        return new AsyncInvoker<>(request, VpnMeta.deleteVpnUserGroup, hcClient);
    }

    /**
     * 查询VPN用户组列表
     *
     * 查询VPN用户组列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVpnUserGroupsRequest 请求对象
     * @return CompletableFuture<ListVpnUserGroupsResponse>
     */
    public CompletableFuture<ListVpnUserGroupsResponse> listVpnUserGroupsAsync(ListVpnUserGroupsRequest request) {
        return hcClient.asyncInvokeHttp(request, VpnMeta.listVpnUserGroups);
    }

    /**
     * 查询VPN用户组列表
     *
     * 查询VPN用户组列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVpnUserGroupsRequest 请求对象
     * @return AsyncInvoker<ListVpnUserGroupsRequest, ListVpnUserGroupsResponse>
     */
    public AsyncInvoker<ListVpnUserGroupsRequest, ListVpnUserGroupsResponse> listVpnUserGroupsAsyncInvoker(
        ListVpnUserGroupsRequest request) {
        return new AsyncInvoker<>(request, VpnMeta.listVpnUserGroups, hcClient);
    }

    /**
     * 查询组内VPN用户
     *
     * 查询组内VPN用户
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVpnUsersInGroupRequest 请求对象
     * @return CompletableFuture<ListVpnUsersInGroupResponse>
     */
    public CompletableFuture<ListVpnUsersInGroupResponse> listVpnUsersInGroupAsync(ListVpnUsersInGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, VpnMeta.listVpnUsersInGroup);
    }

    /**
     * 查询组内VPN用户
     *
     * 查询组内VPN用户
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVpnUsersInGroupRequest 请求对象
     * @return AsyncInvoker<ListVpnUsersInGroupRequest, ListVpnUsersInGroupResponse>
     */
    public AsyncInvoker<ListVpnUsersInGroupRequest, ListVpnUsersInGroupResponse> listVpnUsersInGroupAsyncInvoker(
        ListVpnUsersInGroupRequest request) {
        return new AsyncInvoker<>(request, VpnMeta.listVpnUsersInGroup, hcClient);
    }

    /**
     * 删除组内VPN用户
     *
     * 删除组内VPN用户
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RemoveVpnUsersFromGroupRequest 请求对象
     * @return CompletableFuture<RemoveVpnUsersFromGroupResponse>
     */
    public CompletableFuture<RemoveVpnUsersFromGroupResponse> removeVpnUsersFromGroupAsync(
        RemoveVpnUsersFromGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, VpnMeta.removeVpnUsersFromGroup);
    }

    /**
     * 删除组内VPN用户
     *
     * 删除组内VPN用户
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RemoveVpnUsersFromGroupRequest 请求对象
     * @return AsyncInvoker<RemoveVpnUsersFromGroupRequest, RemoveVpnUsersFromGroupResponse>
     */
    public AsyncInvoker<RemoveVpnUsersFromGroupRequest, RemoveVpnUsersFromGroupResponse> removeVpnUsersFromGroupAsyncInvoker(
        RemoveVpnUsersFromGroupRequest request) {
        return new AsyncInvoker<>(request, VpnMeta.removeVpnUsersFromGroup, hcClient);
    }

    /**
     * 查询VPN用户组
     *
     * 查询VPN用户组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowVpnUserGroupRequest 请求对象
     * @return CompletableFuture<ShowVpnUserGroupResponse>
     */
    public CompletableFuture<ShowVpnUserGroupResponse> showVpnUserGroupAsync(ShowVpnUserGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, VpnMeta.showVpnUserGroup);
    }

    /**
     * 查询VPN用户组
     *
     * 查询VPN用户组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowVpnUserGroupRequest 请求对象
     * @return AsyncInvoker<ShowVpnUserGroupRequest, ShowVpnUserGroupResponse>
     */
    public AsyncInvoker<ShowVpnUserGroupRequest, ShowVpnUserGroupResponse> showVpnUserGroupAsyncInvoker(
        ShowVpnUserGroupRequest request) {
        return new AsyncInvoker<>(request, VpnMeta.showVpnUserGroup, hcClient);
    }

    /**
     * 修改VPN用户组
     *
     * 修改VPN用户组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateVpnUserGroupRequest 请求对象
     * @return CompletableFuture<UpdateVpnUserGroupResponse>
     */
    public CompletableFuture<UpdateVpnUserGroupResponse> updateVpnUserGroupAsync(UpdateVpnUserGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, VpnMeta.updateVpnUserGroup);
    }

    /**
     * 修改VPN用户组
     *
     * 修改VPN用户组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateVpnUserGroupRequest 请求对象
     * @return AsyncInvoker<UpdateVpnUserGroupRequest, UpdateVpnUserGroupResponse>
     */
    public AsyncInvoker<UpdateVpnUserGroupRequest, UpdateVpnUserGroupResponse> updateVpnUserGroupAsyncInvoker(
        UpdateVpnUserGroupRequest request) {
        return new AsyncInvoker<>(request, VpnMeta.updateVpnUserGroup, hcClient);
    }

}
