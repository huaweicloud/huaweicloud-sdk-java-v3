package com.huaweicloud.sdk.vpn.v5;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
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
import com.huaweicloud.sdk.vpn.v5.model.CreateP2cVgwRequest;
import com.huaweicloud.sdk.vpn.v5.model.CreateP2cVgwResponse;
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
import com.huaweicloud.sdk.vpn.v5.model.DeleteP2cVgwRequest;
import com.huaweicloud.sdk.vpn.v5.model.DeleteP2cVgwResponse;
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
     * 校验客户端CA
     *
     * 创建服务端时，可以先调用客户端CA的预校验API，检查CA的合法性
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckClientCaCertificateRequest 请求对象
     * @return CheckClientCaCertificateResponse
     */
    public CheckClientCaCertificateResponse checkClientCaCertificate(CheckClientCaCertificateRequest request) {
        return hcClient.syncInvokeHttp(request, VpnMeta.checkClientCaCertificate);
    }

    /**
     * 校验客户端CA
     *
     * 创建服务端时，可以先调用客户端CA的预校验API，检查CA的合法性
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckClientCaCertificateRequest 请求对象
     * @return SyncInvoker<CheckClientCaCertificateRequest, CheckClientCaCertificateResponse>
     */
    public SyncInvoker<CheckClientCaCertificateRequest, CheckClientCaCertificateResponse> checkClientCaCertificateInvoker(
        CheckClientCaCertificateRequest request) {
        return new SyncInvoker<>(request, VpnMeta.checkClientCaCertificate, hcClient);
    }

    /**
     * 删除客户端的CA证书
     *
     * 删除客户端CA证书
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteClientCaRequest 请求对象
     * @return DeleteClientCaResponse
     */
    public DeleteClientCaResponse deleteClientCa(DeleteClientCaRequest request) {
        return hcClient.syncInvokeHttp(request, VpnMeta.deleteClientCa);
    }

    /**
     * 删除客户端的CA证书
     *
     * 删除客户端CA证书
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteClientCaRequest 请求对象
     * @return SyncInvoker<DeleteClientCaRequest, DeleteClientCaResponse>
     */
    public SyncInvoker<DeleteClientCaRequest, DeleteClientCaResponse> deleteClientCaInvoker(
        DeleteClientCaRequest request) {
        return new SyncInvoker<>(request, VpnMeta.deleteClientCa, hcClient);
    }

    /**
     * 导入客户端 CA 证书
     *
     * 导入客户端 CA 证书
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ImportClientCaRequest 请求对象
     * @return ImportClientCaResponse
     */
    public ImportClientCaResponse importClientCa(ImportClientCaRequest request) {
        return hcClient.syncInvokeHttp(request, VpnMeta.importClientCa);
    }

    /**
     * 导入客户端 CA 证书
     *
     * 导入客户端 CA 证书
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ImportClientCaRequest 请求对象
     * @return SyncInvoker<ImportClientCaRequest, ImportClientCaResponse>
     */
    public SyncInvoker<ImportClientCaRequest, ImportClientCaResponse> importClientCaInvoker(
        ImportClientCaRequest request) {
        return new SyncInvoker<>(request, VpnMeta.importClientCa, hcClient);
    }

    /**
     * 查询客户端的CA证书
     *
     * 查询客户端CA证书
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowClientCaRequest 请求对象
     * @return ShowClientCaResponse
     */
    public ShowClientCaResponse showClientCa(ShowClientCaRequest request) {
        return hcClient.syncInvokeHttp(request, VpnMeta.showClientCa);
    }

    /**
     * 查询客户端的CA证书
     *
     * 查询客户端CA证书
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowClientCaRequest 请求对象
     * @return SyncInvoker<ShowClientCaRequest, ShowClientCaResponse>
     */
    public SyncInvoker<ShowClientCaRequest, ShowClientCaResponse> showClientCaInvoker(ShowClientCaRequest request) {
        return new SyncInvoker<>(request, VpnMeta.showClientCa, hcClient);
    }

    /**
     * 修改客户端的CA证书
     *
     * 修改客户端CA证书
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateClientCaRequest 请求对象
     * @return UpdateClientCaResponse
     */
    public UpdateClientCaResponse updateClientCa(UpdateClientCaRequest request) {
        return hcClient.syncInvokeHttp(request, VpnMeta.updateClientCa);
    }

    /**
     * 修改客户端的CA证书
     *
     * 修改客户端CA证书
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateClientCaRequest 请求对象
     * @return SyncInvoker<UpdateClientCaRequest, UpdateClientCaResponse>
     */
    public SyncInvoker<UpdateClientCaRequest, UpdateClientCaResponse> updateClientCaInvoker(
        UpdateClientCaRequest request) {
        return new SyncInvoker<>(request, VpnMeta.updateClientCa, hcClient);
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
     * 创建P2C VPN网关
     *
     * 创建终端入云VPN网关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateP2cVgwRequest 请求对象
     * @return CreateP2cVgwResponse
     */
    public CreateP2cVgwResponse createP2cVgw(CreateP2cVgwRequest request) {
        return hcClient.syncInvokeHttp(request, VpnMeta.createP2cVgw);
    }

    /**
     * 创建P2C VPN网关
     *
     * 创建终端入云VPN网关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateP2cVgwRequest 请求对象
     * @return SyncInvoker<CreateP2cVgwRequest, CreateP2cVgwResponse>
     */
    public SyncInvoker<CreateP2cVgwRequest, CreateP2cVgwResponse> createP2cVgwInvoker(CreateP2cVgwRequest request) {
        return new SyncInvoker<>(request, VpnMeta.createP2cVgw, hcClient);
    }

    /**
     * 删除P2C VPN网关
     *
     * 根据P2C VPN网关ID，删除指定的VPN网关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteP2cVgwRequest 请求对象
     * @return DeleteP2cVgwResponse
     */
    public DeleteP2cVgwResponse deleteP2cVgw(DeleteP2cVgwRequest request) {
        return hcClient.syncInvokeHttp(request, VpnMeta.deleteP2cVgw);
    }

    /**
     * 删除P2C VPN网关
     *
     * 根据P2C VPN网关ID，删除指定的VPN网关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteP2cVgwRequest 请求对象
     * @return SyncInvoker<DeleteP2cVgwRequest, DeleteP2cVgwResponse>
     */
    public SyncInvoker<DeleteP2cVgwRequest, DeleteP2cVgwResponse> deleteP2cVgwInvoker(DeleteP2cVgwRequest request) {
        return new SyncInvoker<>(request, VpnMeta.deleteP2cVgw, hcClient);
    }

    /**
     * 断开P2C VPN网关连接
     *
     * 断开P2C VPN网关连接
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteP2cVgwConnectionRequest 请求对象
     * @return DeleteP2cVgwConnectionResponse
     */
    public DeleteP2cVgwConnectionResponse deleteP2cVgwConnection(DeleteP2cVgwConnectionRequest request) {
        return hcClient.syncInvokeHttp(request, VpnMeta.deleteP2cVgwConnection);
    }

    /**
     * 断开P2C VPN网关连接
     *
     * 断开P2C VPN网关连接
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteP2cVgwConnectionRequest 请求对象
     * @return SyncInvoker<DeleteP2cVgwConnectionRequest, DeleteP2cVgwConnectionResponse>
     */
    public SyncInvoker<DeleteP2cVgwConnectionRequest, DeleteP2cVgwConnectionResponse> deleteP2cVgwConnectionInvoker(
        DeleteP2cVgwConnectionRequest request) {
        return new SyncInvoker<>(request, VpnMeta.deleteP2cVgwConnection, hcClient);
    }

    /**
     * 查询P2C VPN网关可用区
     *
     * 查询P2C VPN网关可用区
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListP2cVgwAvailabilityZonesRequest 请求对象
     * @return ListP2cVgwAvailabilityZonesResponse
     */
    public ListP2cVgwAvailabilityZonesResponse listP2cVgwAvailabilityZones(ListP2cVgwAvailabilityZonesRequest request) {
        return hcClient.syncInvokeHttp(request, VpnMeta.listP2cVgwAvailabilityZones);
    }

    /**
     * 查询P2C VPN网关可用区
     *
     * 查询P2C VPN网关可用区
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListP2cVgwAvailabilityZonesRequest 请求对象
     * @return SyncInvoker<ListP2cVgwAvailabilityZonesRequest, ListP2cVgwAvailabilityZonesResponse>
     */
    public SyncInvoker<ListP2cVgwAvailabilityZonesRequest, ListP2cVgwAvailabilityZonesResponse> listP2cVgwAvailabilityZonesInvoker(
        ListP2cVgwAvailabilityZonesRequest request) {
        return new SyncInvoker<>(request, VpnMeta.listP2cVgwAvailabilityZones, hcClient);
    }

    /**
     * 查询P2C VPN网关连接信息列表
     *
     * List p2c vpn gateway connections
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListP2cVgwConnectionsRequest 请求对象
     * @return ListP2cVgwConnectionsResponse
     */
    public ListP2cVgwConnectionsResponse listP2cVgwConnections(ListP2cVgwConnectionsRequest request) {
        return hcClient.syncInvokeHttp(request, VpnMeta.listP2cVgwConnections);
    }

    /**
     * 查询P2C VPN网关连接信息列表
     *
     * List p2c vpn gateway connections
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListP2cVgwConnectionsRequest 请求对象
     * @return SyncInvoker<ListP2cVgwConnectionsRequest, ListP2cVgwConnectionsResponse>
     */
    public SyncInvoker<ListP2cVgwConnectionsRequest, ListP2cVgwConnectionsResponse> listP2cVgwConnectionsInvoker(
        ListP2cVgwConnectionsRequest request) {
        return new SyncInvoker<>(request, VpnMeta.listP2cVgwConnections, hcClient);
    }

    /**
     * 查询P2C VPN网关列表
     *
     * 查询P2C VPN网关列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListP2cVgwsRequest 请求对象
     * @return ListP2cVgwsResponse
     */
    public ListP2cVgwsResponse listP2cVgws(ListP2cVgwsRequest request) {
        return hcClient.syncInvokeHttp(request, VpnMeta.listP2cVgws);
    }

    /**
     * 查询P2C VPN网关列表
     *
     * 查询P2C VPN网关列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListP2cVgwsRequest 请求对象
     * @return SyncInvoker<ListP2cVgwsRequest, ListP2cVgwsResponse>
     */
    public SyncInvoker<ListP2cVgwsRequest, ListP2cVgwsResponse> listP2cVgwsInvoker(ListP2cVgwsRequest request) {
        return new SyncInvoker<>(request, VpnMeta.listP2cVgws, hcClient);
    }

    /**
     * 查询P2C VPN网关
     *
     * 根据P2C VPN网关ID，查询指定的VPN网关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowP2cVgwRequest 请求对象
     * @return ShowP2cVgwResponse
     */
    public ShowP2cVgwResponse showP2cVgw(ShowP2cVgwRequest request) {
        return hcClient.syncInvokeHttp(request, VpnMeta.showP2cVgw);
    }

    /**
     * 查询P2C VPN网关
     *
     * 根据P2C VPN网关ID，查询指定的VPN网关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowP2cVgwRequest 请求对象
     * @return SyncInvoker<ShowP2cVgwRequest, ShowP2cVgwResponse>
     */
    public SyncInvoker<ShowP2cVgwRequest, ShowP2cVgwResponse> showP2cVgwInvoker(ShowP2cVgwRequest request) {
        return new SyncInvoker<>(request, VpnMeta.showP2cVgw, hcClient);
    }

    /**
     * 更新P2C VPN网关
     *
     * 根据P2C VPN网关ID，更新指定的P2C VPN网关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateP2cVgwRequest 请求对象
     * @return UpdateP2cVgwResponse
     */
    public UpdateP2cVgwResponse updateP2cVgw(UpdateP2cVgwRequest request) {
        return hcClient.syncInvokeHttp(request, VpnMeta.updateP2cVgw);
    }

    /**
     * 更新P2C VPN网关
     *
     * 根据P2C VPN网关ID，更新指定的P2C VPN网关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateP2cVgwRequest 请求对象
     * @return SyncInvoker<UpdateP2cVgwRequest, UpdateP2cVgwResponse>
     */
    public SyncInvoker<UpdateP2cVgwRequest, UpdateP2cVgwResponse> updateP2cVgwInvoker(UpdateP2cVgwRequest request) {
        return new SyncInvoker<>(request, VpnMeta.updateP2cVgw, hcClient);
    }

    /**
     * 批量添加资源标签
     *
     * 为指定实例批量添加标签
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
     * 为指定实例批量添加标签
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
     * 为指定实例批量删除标签
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
     * 为指定实例批量删除标签
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
     * 查询资源实例数量
     *
     * 根据标签查询资源实例数量
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
     * 查询资源实例数量
     *
     * 根据标签查询资源实例数量
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
     * 查询项目标签
     *
     * 查询租户在指定项目中指定资源类型下的所有标签
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
     * 查询项目标签
     *
     * 查询租户在指定项目中指定资源类型下的所有标签
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
     * 查询资源实例列表
     *
     * 根据标签查询资源实例列表
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
     * 查询资源实例列表
     *
     * 根据标签查询资源实例列表
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
     * 查询指定实例的标签信息
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
     * 查询指定实例的标签信息
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
     * 创建VPN访问策略
     *
     * 创建VPN访问策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateVpnAccessPolicyRequest 请求对象
     * @return CreateVpnAccessPolicyResponse
     */
    public CreateVpnAccessPolicyResponse createVpnAccessPolicy(CreateVpnAccessPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, VpnMeta.createVpnAccessPolicy);
    }

    /**
     * 创建VPN访问策略
     *
     * 创建VPN访问策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateVpnAccessPolicyRequest 请求对象
     * @return SyncInvoker<CreateVpnAccessPolicyRequest, CreateVpnAccessPolicyResponse>
     */
    public SyncInvoker<CreateVpnAccessPolicyRequest, CreateVpnAccessPolicyResponse> createVpnAccessPolicyInvoker(
        CreateVpnAccessPolicyRequest request) {
        return new SyncInvoker<>(request, VpnMeta.createVpnAccessPolicy, hcClient);
    }

    /**
     * 删除VPN访问策略
     *
     * 删除VPN访问策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteVpnAccessPolicyRequest 请求对象
     * @return DeleteVpnAccessPolicyResponse
     */
    public DeleteVpnAccessPolicyResponse deleteVpnAccessPolicy(DeleteVpnAccessPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, VpnMeta.deleteVpnAccessPolicy);
    }

    /**
     * 删除VPN访问策略
     *
     * 删除VPN访问策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteVpnAccessPolicyRequest 请求对象
     * @return SyncInvoker<DeleteVpnAccessPolicyRequest, DeleteVpnAccessPolicyResponse>
     */
    public SyncInvoker<DeleteVpnAccessPolicyRequest, DeleteVpnAccessPolicyResponse> deleteVpnAccessPolicyInvoker(
        DeleteVpnAccessPolicyRequest request) {
        return new SyncInvoker<>(request, VpnMeta.deleteVpnAccessPolicy, hcClient);
    }

    /**
     * 查询VPN访问策略列表
     *
     * 查询VPN访问策略列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVpnAccessPoliciesRequest 请求对象
     * @return ListVpnAccessPoliciesResponse
     */
    public ListVpnAccessPoliciesResponse listVpnAccessPolicies(ListVpnAccessPoliciesRequest request) {
        return hcClient.syncInvokeHttp(request, VpnMeta.listVpnAccessPolicies);
    }

    /**
     * 查询VPN访问策略列表
     *
     * 查询VPN访问策略列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVpnAccessPoliciesRequest 请求对象
     * @return SyncInvoker<ListVpnAccessPoliciesRequest, ListVpnAccessPoliciesResponse>
     */
    public SyncInvoker<ListVpnAccessPoliciesRequest, ListVpnAccessPoliciesResponse> listVpnAccessPoliciesInvoker(
        ListVpnAccessPoliciesRequest request) {
        return new SyncInvoker<>(request, VpnMeta.listVpnAccessPolicies, hcClient);
    }

    /**
     * 查询VPN访问策略
     *
     * 查询VPN访问策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowVpnAccessPolicyRequest 请求对象
     * @return ShowVpnAccessPolicyResponse
     */
    public ShowVpnAccessPolicyResponse showVpnAccessPolicy(ShowVpnAccessPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, VpnMeta.showVpnAccessPolicy);
    }

    /**
     * 查询VPN访问策略
     *
     * 查询VPN访问策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowVpnAccessPolicyRequest 请求对象
     * @return SyncInvoker<ShowVpnAccessPolicyRequest, ShowVpnAccessPolicyResponse>
     */
    public SyncInvoker<ShowVpnAccessPolicyRequest, ShowVpnAccessPolicyResponse> showVpnAccessPolicyInvoker(
        ShowVpnAccessPolicyRequest request) {
        return new SyncInvoker<>(request, VpnMeta.showVpnAccessPolicy, hcClient);
    }

    /**
     * 修改VPN访问策略
     *
     * 修改VPN访问策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateVpnAccessPolicyRequest 请求对象
     * @return UpdateVpnAccessPolicyResponse
     */
    public UpdateVpnAccessPolicyResponse updateVpnAccessPolicy(UpdateVpnAccessPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, VpnMeta.updateVpnAccessPolicy);
    }

    /**
     * 修改VPN访问策略
     *
     * 修改VPN访问策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateVpnAccessPolicyRequest 请求对象
     * @return SyncInvoker<UpdateVpnAccessPolicyRequest, UpdateVpnAccessPolicyResponse>
     */
    public SyncInvoker<UpdateVpnAccessPolicyRequest, UpdateVpnAccessPolicyResponse> updateVpnAccessPolicyInvoker(
        UpdateVpnAccessPolicyRequest request) {
        return new SyncInvoker<>(request, VpnMeta.updateVpnAccessPolicy, hcClient);
    }

    /**
     * 批量创建VPN连接
     *
     * 同时创建1-2条VPN连接
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateVpnConnectionRequest 请求对象
     * @return BatchCreateVpnConnectionResponse
     */
    public BatchCreateVpnConnectionResponse batchCreateVpnConnection(BatchCreateVpnConnectionRequest request) {
        return hcClient.syncInvokeHttp(request, VpnMeta.batchCreateVpnConnection);
    }

    /**
     * 批量创建VPN连接
     *
     * 同时创建1-2条VPN连接
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateVpnConnectionRequest 请求对象
     * @return SyncInvoker<BatchCreateVpnConnectionRequest, BatchCreateVpnConnectionResponse>
     */
    public SyncInvoker<BatchCreateVpnConnectionRequest, BatchCreateVpnConnectionResponse> batchCreateVpnConnectionInvoker(
        BatchCreateVpnConnectionRequest request) {
        return new SyncInvoker<>(request, VpnMeta.batchCreateVpnConnection, hcClient);
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
     * 重置VPN连接
     *
     * 根据连接ID，重置指定VPN连接
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResetVpnConnectionRequest 请求对象
     * @return ResetVpnConnectionResponse
     */
    public ResetVpnConnectionResponse resetVpnConnection(ResetVpnConnectionRequest request) {
        return hcClient.syncInvokeHttp(request, VpnMeta.resetVpnConnection);
    }

    /**
     * 重置VPN连接
     *
     * 根据连接ID，重置指定VPN连接
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResetVpnConnectionRequest 请求对象
     * @return SyncInvoker<ResetVpnConnectionRequest, ResetVpnConnectionResponse>
     */
    public SyncInvoker<ResetVpnConnectionRequest, ResetVpnConnectionResponse> resetVpnConnectionInvoker(
        ResetVpnConnectionRequest request) {
        return new SyncInvoker<>(request, VpnMeta.resetVpnConnection, hcClient);
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
     * 查询VPN连接日志
     *
     * 根据连接ID，查询指定的VPN连接日志
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowVpnConnectionLogRequest 请求对象
     * @return ShowVpnConnectionLogResponse
     */
    public ShowVpnConnectionLogResponse showVpnConnectionLog(ShowVpnConnectionLogRequest request) {
        return hcClient.syncInvokeHttp(request, VpnMeta.showVpnConnectionLog);
    }

    /**
     * 查询VPN连接日志
     *
     * 根据连接ID，查询指定的VPN连接日志
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowVpnConnectionLogRequest 请求对象
     * @return SyncInvoker<ShowVpnConnectionLogRequest, ShowVpnConnectionLogResponse>
     */
    public SyncInvoker<ShowVpnConnectionLogRequest, ShowVpnConnectionLogResponse> showVpnConnectionLogInvoker(
        ShowVpnConnectionLogRequest request) {
        return new SyncInvoker<>(request, VpnMeta.showVpnConnectionLog, hcClient);
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
     * 删除VPN连接日志配置
     *
     * 删除VPN连接日志配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteVpnConnectionsLogConfigRequest 请求对象
     * @return DeleteVpnConnectionsLogConfigResponse
     */
    public DeleteVpnConnectionsLogConfigResponse deleteVpnConnectionsLogConfig(
        DeleteVpnConnectionsLogConfigRequest request) {
        return hcClient.syncInvokeHttp(request, VpnMeta.deleteVpnConnectionsLogConfig);
    }

    /**
     * 删除VPN连接日志配置
     *
     * 删除VPN连接日志配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteVpnConnectionsLogConfigRequest 请求对象
     * @return SyncInvoker<DeleteVpnConnectionsLogConfigRequest, DeleteVpnConnectionsLogConfigResponse>
     */
    public SyncInvoker<DeleteVpnConnectionsLogConfigRequest, DeleteVpnConnectionsLogConfigResponse> deleteVpnConnectionsLogConfigInvoker(
        DeleteVpnConnectionsLogConfigRequest request) {
        return new SyncInvoker<>(request, VpnMeta.deleteVpnConnectionsLogConfig, hcClient);
    }

    /**
     * 查询VPN连接日志配置
     *
     * 查询VPN连接日志配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowVpnConnectionsLogConfigRequest 请求对象
     * @return ShowVpnConnectionsLogConfigResponse
     */
    public ShowVpnConnectionsLogConfigResponse showVpnConnectionsLogConfig(ShowVpnConnectionsLogConfigRequest request) {
        return hcClient.syncInvokeHttp(request, VpnMeta.showVpnConnectionsLogConfig);
    }

    /**
     * 查询VPN连接日志配置
     *
     * 查询VPN连接日志配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowVpnConnectionsLogConfigRequest 请求对象
     * @return SyncInvoker<ShowVpnConnectionsLogConfigRequest, ShowVpnConnectionsLogConfigResponse>
     */
    public SyncInvoker<ShowVpnConnectionsLogConfigRequest, ShowVpnConnectionsLogConfigResponse> showVpnConnectionsLogConfigInvoker(
        ShowVpnConnectionsLogConfigRequest request) {
        return new SyncInvoker<>(request, VpnMeta.showVpnConnectionsLogConfig, hcClient);
    }

    /**
     * 更新VPN连接日志配置
     *
     * 更新VPN连接日志配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateVpnConnectionsLogConfigRequest 请求对象
     * @return UpdateVpnConnectionsLogConfigResponse
     */
    public UpdateVpnConnectionsLogConfigResponse updateVpnConnectionsLogConfig(
        UpdateVpnConnectionsLogConfigRequest request) {
        return hcClient.syncInvokeHttp(request, VpnMeta.updateVpnConnectionsLogConfig);
    }

    /**
     * 更新VPN连接日志配置
     *
     * 更新VPN连接日志配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateVpnConnectionsLogConfigRequest 请求对象
     * @return SyncInvoker<UpdateVpnConnectionsLogConfigRequest, UpdateVpnConnectionsLogConfigResponse>
     */
    public SyncInvoker<UpdateVpnConnectionsLogConfigRequest, UpdateVpnConnectionsLogConfigResponse> updateVpnConnectionsLogConfigInvoker(
        UpdateVpnConnectionsLogConfigRequest request) {
        return new SyncInvoker<>(request, VpnMeta.updateVpnConnectionsLogConfig, hcClient);
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
     * 查询VPN网关可用区
     *
     * 查询VPN网关可用区
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListExtendedAvailabilityZonesRequest 请求对象
     * @return ListExtendedAvailabilityZonesResponse
     */
    public ListExtendedAvailabilityZonesResponse listExtendedAvailabilityZones(
        ListExtendedAvailabilityZonesRequest request) {
        return hcClient.syncInvokeHttp(request, VpnMeta.listExtendedAvailabilityZones);
    }

    /**
     * 查询VPN网关可用区
     *
     * 查询VPN网关可用区
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListExtendedAvailabilityZonesRequest 请求对象
     * @return SyncInvoker<ListExtendedAvailabilityZonesRequest, ListExtendedAvailabilityZonesResponse>
     */
    public SyncInvoker<ListExtendedAvailabilityZonesRequest, ListExtendedAvailabilityZonesResponse> listExtendedAvailabilityZonesInvoker(
        ListExtendedAvailabilityZonesRequest request) {
        return new SyncInvoker<>(request, VpnMeta.listExtendedAvailabilityZones, hcClient);
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
     * 查询VPN网关路由表
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowVpnGatewayRoutingTableRequest 请求对象
     * @return ShowVpnGatewayRoutingTableResponse
     */
    public ShowVpnGatewayRoutingTableResponse showVpnGatewayRoutingTable(ShowVpnGatewayRoutingTableRequest request) {
        return hcClient.syncInvokeHttp(request, VpnMeta.showVpnGatewayRoutingTable);
    }

    /**
     * 查询VPN网关路由表
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowVpnGatewayRoutingTableRequest 请求对象
     * @return SyncInvoker<ShowVpnGatewayRoutingTableRequest, ShowVpnGatewayRoutingTableResponse>
     */
    public SyncInvoker<ShowVpnGatewayRoutingTableRequest, ShowVpnGatewayRoutingTableResponse> showVpnGatewayRoutingTableInvoker(
        ShowVpnGatewayRoutingTableRequest request) {
        return new SyncInvoker<>(request, VpnMeta.showVpnGatewayRoutingTable, hcClient);
    }

    /**
     * 修改网关规格
     *
     * 对单个网关规格进行修改，可以升配或降配
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePostpaidVgwSpecificationRequest 请求对象
     * @return UpdatePostpaidVgwSpecificationResponse
     */
    public UpdatePostpaidVgwSpecificationResponse updatePostpaidVgwSpecification(
        UpdatePostpaidVgwSpecificationRequest request) {
        return hcClient.syncInvokeHttp(request, VpnMeta.updatePostpaidVgwSpecification);
    }

    /**
     * 修改网关规格
     *
     * 对单个网关规格进行修改，可以升配或降配
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePostpaidVgwSpecificationRequest 请求对象
     * @return SyncInvoker<UpdatePostpaidVgwSpecificationRequest, UpdatePostpaidVgwSpecificationResponse>
     */
    public SyncInvoker<UpdatePostpaidVgwSpecificationRequest, UpdatePostpaidVgwSpecificationResponse> updatePostpaidVgwSpecificationInvoker(
        UpdatePostpaidVgwSpecificationRequest request) {
        return new SyncInvoker<>(request, VpnMeta.updatePostpaidVgwSpecification, hcClient);
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

    /**
     * 创建一个VPN 服务端
     *
     * 创建一个VPN 服务端
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateVpnServerRequest 请求对象
     * @return CreateVpnServerResponse
     */
    public CreateVpnServerResponse createVpnServer(CreateVpnServerRequest request) {
        return hcClient.syncInvokeHttp(request, VpnMeta.createVpnServer);
    }

    /**
     * 创建一个VPN 服务端
     *
     * 创建一个VPN 服务端
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateVpnServerRequest 请求对象
     * @return SyncInvoker<CreateVpnServerRequest, CreateVpnServerResponse>
     */
    public SyncInvoker<CreateVpnServerRequest, CreateVpnServerResponse> createVpnServerInvoker(
        CreateVpnServerRequest request) {
        return new SyncInvoker<>(request, VpnMeta.createVpnServer, hcClient);
    }

    /**
     * 导出服务端对应的客户端配置信息
     *
     * 导出客户端配置信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportClientConfigRequest 请求对象
     * @return ExportClientConfigResponse
     */
    public ExportClientConfigResponse exportClientConfig(ExportClientConfigRequest request) {
        return hcClient.syncInvokeHttp(request, VpnMeta.exportClientConfig);
    }

    /**
     * 导出服务端对应的客户端配置信息
     *
     * 导出客户端配置信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportClientConfigRequest 请求对象
     * @return SyncInvoker<ExportClientConfigRequest, ExportClientConfigResponse>
     */
    public SyncInvoker<ExportClientConfigRequest, ExportClientConfigResponse> exportClientConfigInvoker(
        ExportClientConfigRequest request) {
        return new SyncInvoker<>(request, VpnMeta.exportClientConfig, hcClient);
    }

    /**
     * 查询租户下的所有服务端信息
     *
     * 查询租户下的所有服务端信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVpnServersByProjectRequest 请求对象
     * @return ListVpnServersByProjectResponse
     */
    public ListVpnServersByProjectResponse listVpnServersByProject(ListVpnServersByProjectRequest request) {
        return hcClient.syncInvokeHttp(request, VpnMeta.listVpnServersByProject);
    }

    /**
     * 查询租户下的所有服务端信息
     *
     * 查询租户下的所有服务端信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVpnServersByProjectRequest 请求对象
     * @return SyncInvoker<ListVpnServersByProjectRequest, ListVpnServersByProjectResponse>
     */
    public SyncInvoker<ListVpnServersByProjectRequest, ListVpnServersByProjectResponse> listVpnServersByProjectInvoker(
        ListVpnServersByProjectRequest request) {
        return new SyncInvoker<>(request, VpnMeta.listVpnServersByProject, hcClient);
    }

    /**
     * 查询一个网关下的服务端信息
     *
     * 查询一个网关下的服务端信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVpnServersByVgwRequest 请求对象
     * @return ListVpnServersByVgwResponse
     */
    public ListVpnServersByVgwResponse listVpnServersByVgw(ListVpnServersByVgwRequest request) {
        return hcClient.syncInvokeHttp(request, VpnMeta.listVpnServersByVgw);
    }

    /**
     * 查询一个网关下的服务端信息
     *
     * 查询一个网关下的服务端信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVpnServersByVgwRequest 请求对象
     * @return SyncInvoker<ListVpnServersByVgwRequest, ListVpnServersByVgwResponse>
     */
    public SyncInvoker<ListVpnServersByVgwRequest, ListVpnServersByVgwResponse> listVpnServersByVgwInvoker(
        ListVpnServersByVgwRequest request) {
        return new SyncInvoker<>(request, VpnMeta.listVpnServersByVgw, hcClient);
    }

    /**
     * 更新指定VPN 服务端
     *
     * 更新指定VPN 服务端
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateVpnServerRequest 请求对象
     * @return UpdateVpnServerResponse
     */
    public UpdateVpnServerResponse updateVpnServer(UpdateVpnServerRequest request) {
        return hcClient.syncInvokeHttp(request, VpnMeta.updateVpnServer);
    }

    /**
     * 更新指定VPN 服务端
     *
     * 更新指定VPN 服务端
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateVpnServerRequest 请求对象
     * @return SyncInvoker<UpdateVpnServerRequest, UpdateVpnServerResponse>
     */
    public SyncInvoker<UpdateVpnServerRequest, UpdateVpnServerResponse> updateVpnServerInvoker(
        UpdateVpnServerRequest request) {
        return new SyncInvoker<>(request, VpnMeta.updateVpnServer, hcClient);
    }

    /**
     * 批量创建VPN用户
     *
     * 批量创建P2C VPN用户
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateVpnUsersRequest 请求对象
     * @return BatchCreateVpnUsersResponse
     */
    public BatchCreateVpnUsersResponse batchCreateVpnUsers(BatchCreateVpnUsersRequest request) {
        return hcClient.syncInvokeHttp(request, VpnMeta.batchCreateVpnUsers);
    }

    /**
     * 批量创建VPN用户
     *
     * 批量创建P2C VPN用户
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateVpnUsersRequest 请求对象
     * @return SyncInvoker<BatchCreateVpnUsersRequest, BatchCreateVpnUsersResponse>
     */
    public SyncInvoker<BatchCreateVpnUsersRequest, BatchCreateVpnUsersResponse> batchCreateVpnUsersInvoker(
        BatchCreateVpnUsersRequest request) {
        return new SyncInvoker<>(request, VpnMeta.batchCreateVpnUsers, hcClient);
    }

    /**
     * 批量删除VPN用户
     *
     * 批量删除P2C VPN用户
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteVpnUsersRequest 请求对象
     * @return BatchDeleteVpnUsersResponse
     */
    public BatchDeleteVpnUsersResponse batchDeleteVpnUsers(BatchDeleteVpnUsersRequest request) {
        return hcClient.syncInvokeHttp(request, VpnMeta.batchDeleteVpnUsers);
    }

    /**
     * 批量删除VPN用户
     *
     * 批量删除P2C VPN用户
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteVpnUsersRequest 请求对象
     * @return SyncInvoker<BatchDeleteVpnUsersRequest, BatchDeleteVpnUsersResponse>
     */
    public SyncInvoker<BatchDeleteVpnUsersRequest, BatchDeleteVpnUsersResponse> batchDeleteVpnUsersInvoker(
        BatchDeleteVpnUsersRequest request) {
        return new SyncInvoker<>(request, VpnMeta.batchDeleteVpnUsers, hcClient);
    }

    /**
     * 创建VPN用户
     *
     * 创建VPN用户
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateVpnUserRequest 请求对象
     * @return CreateVpnUserResponse
     */
    public CreateVpnUserResponse createVpnUser(CreateVpnUserRequest request) {
        return hcClient.syncInvokeHttp(request, VpnMeta.createVpnUser);
    }

    /**
     * 创建VPN用户
     *
     * 创建VPN用户
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateVpnUserRequest 请求对象
     * @return SyncInvoker<CreateVpnUserRequest, CreateVpnUserResponse>
     */
    public SyncInvoker<CreateVpnUserRequest, CreateVpnUserResponse> createVpnUserInvoker(CreateVpnUserRequest request) {
        return new SyncInvoker<>(request, VpnMeta.createVpnUser, hcClient);
    }

    /**
     * 删除VPN用户
     *
     * 删除VPN用户
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteVpnUserRequest 请求对象
     * @return DeleteVpnUserResponse
     */
    public DeleteVpnUserResponse deleteVpnUser(DeleteVpnUserRequest request) {
        return hcClient.syncInvokeHttp(request, VpnMeta.deleteVpnUser);
    }

    /**
     * 删除VPN用户
     *
     * 删除VPN用户
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteVpnUserRequest 请求对象
     * @return SyncInvoker<DeleteVpnUserRequest, DeleteVpnUserResponse>
     */
    public SyncInvoker<DeleteVpnUserRequest, DeleteVpnUserResponse> deleteVpnUserInvoker(DeleteVpnUserRequest request) {
        return new SyncInvoker<>(request, VpnMeta.deleteVpnUser, hcClient);
    }

    /**
     * 查询VPN用户列表
     *
     * 查询VPN用户列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVpnUsersRequest 请求对象
     * @return ListVpnUsersResponse
     */
    public ListVpnUsersResponse listVpnUsers(ListVpnUsersRequest request) {
        return hcClient.syncInvokeHttp(request, VpnMeta.listVpnUsers);
    }

    /**
     * 查询VPN用户列表
     *
     * 查询VPN用户列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVpnUsersRequest 请求对象
     * @return SyncInvoker<ListVpnUsersRequest, ListVpnUsersResponse>
     */
    public SyncInvoker<ListVpnUsersRequest, ListVpnUsersResponse> listVpnUsersInvoker(ListVpnUsersRequest request) {
        return new SyncInvoker<>(request, VpnMeta.listVpnUsers, hcClient);
    }

    /**
     * 重置VPN用户密码
     *
     * 重置VPN用户密码
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResetVpnUserPasswordRequest 请求对象
     * @return ResetVpnUserPasswordResponse
     */
    public ResetVpnUserPasswordResponse resetVpnUserPassword(ResetVpnUserPasswordRequest request) {
        return hcClient.syncInvokeHttp(request, VpnMeta.resetVpnUserPassword);
    }

    /**
     * 重置VPN用户密码
     *
     * 重置VPN用户密码
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResetVpnUserPasswordRequest 请求对象
     * @return SyncInvoker<ResetVpnUserPasswordRequest, ResetVpnUserPasswordResponse>
     */
    public SyncInvoker<ResetVpnUserPasswordRequest, ResetVpnUserPasswordResponse> resetVpnUserPasswordInvoker(
        ResetVpnUserPasswordRequest request) {
        return new SyncInvoker<>(request, VpnMeta.resetVpnUserPassword, hcClient);
    }

    /**
     * 查询VPN用户
     *
     * 查询VPN用户
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowVpnUserRequest 请求对象
     * @return ShowVpnUserResponse
     */
    public ShowVpnUserResponse showVpnUser(ShowVpnUserRequest request) {
        return hcClient.syncInvokeHttp(request, VpnMeta.showVpnUser);
    }

    /**
     * 查询VPN用户
     *
     * 查询VPN用户
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowVpnUserRequest 请求对象
     * @return SyncInvoker<ShowVpnUserRequest, ShowVpnUserResponse>
     */
    public SyncInvoker<ShowVpnUserRequest, ShowVpnUserResponse> showVpnUserInvoker(ShowVpnUserRequest request) {
        return new SyncInvoker<>(request, VpnMeta.showVpnUser, hcClient);
    }

    /**
     * 修改VPN用户
     *
     * 修改VPN用户
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateVpnUserRequest 请求对象
     * @return UpdateVpnUserResponse
     */
    public UpdateVpnUserResponse updateVpnUser(UpdateVpnUserRequest request) {
        return hcClient.syncInvokeHttp(request, VpnMeta.updateVpnUser);
    }

    /**
     * 修改VPN用户
     *
     * 修改VPN用户
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateVpnUserRequest 请求对象
     * @return SyncInvoker<UpdateVpnUserRequest, UpdateVpnUserResponse>
     */
    public SyncInvoker<UpdateVpnUserRequest, UpdateVpnUserResponse> updateVpnUserInvoker(UpdateVpnUserRequest request) {
        return new SyncInvoker<>(request, VpnMeta.updateVpnUser, hcClient);
    }

    /**
     * 修改VPN用户密码
     *
     * 修改VPN用户密码
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateVpnUserPasswordRequest 请求对象
     * @return UpdateVpnUserPasswordResponse
     */
    public UpdateVpnUserPasswordResponse updateVpnUserPassword(UpdateVpnUserPasswordRequest request) {
        return hcClient.syncInvokeHttp(request, VpnMeta.updateVpnUserPassword);
    }

    /**
     * 修改VPN用户密码
     *
     * 修改VPN用户密码
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateVpnUserPasswordRequest 请求对象
     * @return SyncInvoker<UpdateVpnUserPasswordRequest, UpdateVpnUserPasswordResponse>
     */
    public SyncInvoker<UpdateVpnUserPasswordRequest, UpdateVpnUserPasswordResponse> updateVpnUserPasswordInvoker(
        UpdateVpnUserPasswordRequest request) {
        return new SyncInvoker<>(request, VpnMeta.updateVpnUserPassword, hcClient);
    }

    /**
     * 添加VPN用户到组
     *
     * 添加VPN用户到组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddVpnUsersToGroupRequest 请求对象
     * @return AddVpnUsersToGroupResponse
     */
    public AddVpnUsersToGroupResponse addVpnUsersToGroup(AddVpnUsersToGroupRequest request) {
        return hcClient.syncInvokeHttp(request, VpnMeta.addVpnUsersToGroup);
    }

    /**
     * 添加VPN用户到组
     *
     * 添加VPN用户到组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddVpnUsersToGroupRequest 请求对象
     * @return SyncInvoker<AddVpnUsersToGroupRequest, AddVpnUsersToGroupResponse>
     */
    public SyncInvoker<AddVpnUsersToGroupRequest, AddVpnUsersToGroupResponse> addVpnUsersToGroupInvoker(
        AddVpnUsersToGroupRequest request) {
        return new SyncInvoker<>(request, VpnMeta.addVpnUsersToGroup, hcClient);
    }

    /**
     * 创建VPN用户组
     *
     * 创建VPN用户组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateVpnUserGroupRequest 请求对象
     * @return CreateVpnUserGroupResponse
     */
    public CreateVpnUserGroupResponse createVpnUserGroup(CreateVpnUserGroupRequest request) {
        return hcClient.syncInvokeHttp(request, VpnMeta.createVpnUserGroup);
    }

    /**
     * 创建VPN用户组
     *
     * 创建VPN用户组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateVpnUserGroupRequest 请求对象
     * @return SyncInvoker<CreateVpnUserGroupRequest, CreateVpnUserGroupResponse>
     */
    public SyncInvoker<CreateVpnUserGroupRequest, CreateVpnUserGroupResponse> createVpnUserGroupInvoker(
        CreateVpnUserGroupRequest request) {
        return new SyncInvoker<>(request, VpnMeta.createVpnUserGroup, hcClient);
    }

    /**
     * 删除VPN用户组
     *
     * 删除VPN用户组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteVpnUserGroupRequest 请求对象
     * @return DeleteVpnUserGroupResponse
     */
    public DeleteVpnUserGroupResponse deleteVpnUserGroup(DeleteVpnUserGroupRequest request) {
        return hcClient.syncInvokeHttp(request, VpnMeta.deleteVpnUserGroup);
    }

    /**
     * 删除VPN用户组
     *
     * 删除VPN用户组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteVpnUserGroupRequest 请求对象
     * @return SyncInvoker<DeleteVpnUserGroupRequest, DeleteVpnUserGroupResponse>
     */
    public SyncInvoker<DeleteVpnUserGroupRequest, DeleteVpnUserGroupResponse> deleteVpnUserGroupInvoker(
        DeleteVpnUserGroupRequest request) {
        return new SyncInvoker<>(request, VpnMeta.deleteVpnUserGroup, hcClient);
    }

    /**
     * 查询VPN用户组列表
     *
     * 查询VPN用户组列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVpnUserGroupsRequest 请求对象
     * @return ListVpnUserGroupsResponse
     */
    public ListVpnUserGroupsResponse listVpnUserGroups(ListVpnUserGroupsRequest request) {
        return hcClient.syncInvokeHttp(request, VpnMeta.listVpnUserGroups);
    }

    /**
     * 查询VPN用户组列表
     *
     * 查询VPN用户组列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVpnUserGroupsRequest 请求对象
     * @return SyncInvoker<ListVpnUserGroupsRequest, ListVpnUserGroupsResponse>
     */
    public SyncInvoker<ListVpnUserGroupsRequest, ListVpnUserGroupsResponse> listVpnUserGroupsInvoker(
        ListVpnUserGroupsRequest request) {
        return new SyncInvoker<>(request, VpnMeta.listVpnUserGroups, hcClient);
    }

    /**
     * 查询组内VPN用户
     *
     * 查询组内VPN用户
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVpnUsersInGroupRequest 请求对象
     * @return ListVpnUsersInGroupResponse
     */
    public ListVpnUsersInGroupResponse listVpnUsersInGroup(ListVpnUsersInGroupRequest request) {
        return hcClient.syncInvokeHttp(request, VpnMeta.listVpnUsersInGroup);
    }

    /**
     * 查询组内VPN用户
     *
     * 查询组内VPN用户
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVpnUsersInGroupRequest 请求对象
     * @return SyncInvoker<ListVpnUsersInGroupRequest, ListVpnUsersInGroupResponse>
     */
    public SyncInvoker<ListVpnUsersInGroupRequest, ListVpnUsersInGroupResponse> listVpnUsersInGroupInvoker(
        ListVpnUsersInGroupRequest request) {
        return new SyncInvoker<>(request, VpnMeta.listVpnUsersInGroup, hcClient);
    }

    /**
     * 删除组内VPN用户
     *
     * 删除组内VPN用户
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RemoveVpnUsersFromGroupRequest 请求对象
     * @return RemoveVpnUsersFromGroupResponse
     */
    public RemoveVpnUsersFromGroupResponse removeVpnUsersFromGroup(RemoveVpnUsersFromGroupRequest request) {
        return hcClient.syncInvokeHttp(request, VpnMeta.removeVpnUsersFromGroup);
    }

    /**
     * 删除组内VPN用户
     *
     * 删除组内VPN用户
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RemoveVpnUsersFromGroupRequest 请求对象
     * @return SyncInvoker<RemoveVpnUsersFromGroupRequest, RemoveVpnUsersFromGroupResponse>
     */
    public SyncInvoker<RemoveVpnUsersFromGroupRequest, RemoveVpnUsersFromGroupResponse> removeVpnUsersFromGroupInvoker(
        RemoveVpnUsersFromGroupRequest request) {
        return new SyncInvoker<>(request, VpnMeta.removeVpnUsersFromGroup, hcClient);
    }

    /**
     * 查询VPN用户组
     *
     * 查询VPN用户组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowVpnUserGroupRequest 请求对象
     * @return ShowVpnUserGroupResponse
     */
    public ShowVpnUserGroupResponse showVpnUserGroup(ShowVpnUserGroupRequest request) {
        return hcClient.syncInvokeHttp(request, VpnMeta.showVpnUserGroup);
    }

    /**
     * 查询VPN用户组
     *
     * 查询VPN用户组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowVpnUserGroupRequest 请求对象
     * @return SyncInvoker<ShowVpnUserGroupRequest, ShowVpnUserGroupResponse>
     */
    public SyncInvoker<ShowVpnUserGroupRequest, ShowVpnUserGroupResponse> showVpnUserGroupInvoker(
        ShowVpnUserGroupRequest request) {
        return new SyncInvoker<>(request, VpnMeta.showVpnUserGroup, hcClient);
    }

    /**
     * 修改VPN用户组
     *
     * 修改VPN用户组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateVpnUserGroupRequest 请求对象
     * @return UpdateVpnUserGroupResponse
     */
    public UpdateVpnUserGroupResponse updateVpnUserGroup(UpdateVpnUserGroupRequest request) {
        return hcClient.syncInvokeHttp(request, VpnMeta.updateVpnUserGroup);
    }

    /**
     * 修改VPN用户组
     *
     * 修改VPN用户组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateVpnUserGroupRequest 请求对象
     * @return SyncInvoker<UpdateVpnUserGroupRequest, UpdateVpnUserGroupResponse>
     */
    public SyncInvoker<UpdateVpnUserGroupRequest, UpdateVpnUserGroupResponse> updateVpnUserGroupInvoker(
        UpdateVpnUserGroupRequest request) {
        return new SyncInvoker<>(request, VpnMeta.updateVpnUserGroup, hcClient);
    }

}
