package com.huaweicloud.sdk.dc.v3;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
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
     * v3创建物理连接
     * 创建物理连接
     *
     * @param BatchCreateDirectConnectRequest 请求对象
     * @return BatchCreateDirectConnectResponse
     */
    public BatchCreateDirectConnectResponse batchCreateDirectConnect(BatchCreateDirectConnectRequest request) {
        return hcClient.syncInvokeHttp(request, DcMeta.batchCreateDirectConnect);
    }

    /**
     * v3创建虚拟网关
     * 创建虚拟网关
     *
     * @param BatchCreateVirtualGatewaysRequest 请求对象
     * @return BatchCreateVirtualGatewaysResponse
     */
    public BatchCreateVirtualGatewaysResponse batchCreateVirtualGateways(BatchCreateVirtualGatewaysRequest request) {
        return hcClient.syncInvokeHttp(request, DcMeta.batchCreateVirtualGateways);
    }

    /**
     * v3创建虚拟接口
     * 创建虚拟接口
     *
     * @param BatchCreateVirtualInterfaceRequest 请求对象
     * @return BatchCreateVirtualInterfaceResponse
     */
    public BatchCreateVirtualInterfaceResponse batchCreateVirtualInterface(BatchCreateVirtualInterfaceRequest request) {
        return hcClient.syncInvokeHttp(request, DcMeta.batchCreateVirtualInterface);
    }

    /**
     * v3删除物理连接
     * 删除物理连接
     *
     * @param BatchDeleteDirectConnectRequest 请求对象
     * @return BatchDeleteDirectConnectResponse
     */
    public BatchDeleteDirectConnectResponse batchDeleteDirectConnect(BatchDeleteDirectConnectRequest request) {
        return hcClient.syncInvokeHttp(request, DcMeta.batchDeleteDirectConnect);
    }

    /**
     * v3删除虚拟网关
     * 删除虚拟网关
     *
     * @param BatchDeleteVirtualGatewaysRequest 请求对象
     * @return BatchDeleteVirtualGatewaysResponse
     */
    public BatchDeleteVirtualGatewaysResponse batchDeleteVirtualGateways(BatchDeleteVirtualGatewaysRequest request) {
        return hcClient.syncInvokeHttp(request, DcMeta.batchDeleteVirtualGateways);
    }

    /**
     * v3删除虚拟接口
     * 删除虚拟接口
     *
     * @param BatchDeleteVirtualInterfaceRequest 请求对象
     * @return BatchDeleteVirtualInterfaceResponse
     */
    public BatchDeleteVirtualInterfaceResponse batchDeleteVirtualInterface(BatchDeleteVirtualInterfaceRequest request) {
        return hcClient.syncInvokeHttp(request, DcMeta.batchDeleteVirtualInterface);
    }

    /**
     * v3更新物理连接
     * 更新物理连接
     *
     * @param BatchUpdateDirectConnectRequest 请求对象
     * @return BatchUpdateDirectConnectResponse
     */
    public BatchUpdateDirectConnectResponse batchUpdateDirectConnect(BatchUpdateDirectConnectRequest request) {
        return hcClient.syncInvokeHttp(request, DcMeta.batchUpdateDirectConnect);
    }

    /**
     * v3更新虚拟网关
     * 更新虚拟网关
     *
     * @param BatchUpdateVirtualGatewaysRequest 请求对象
     * @return BatchUpdateVirtualGatewaysResponse
     */
    public BatchUpdateVirtualGatewaysResponse batchUpdateVirtualGateways(BatchUpdateVirtualGatewaysRequest request) {
        return hcClient.syncInvokeHttp(request, DcMeta.batchUpdateVirtualGateways);
    }

    /**
     * v3更新虚拟接口
     * 更新虚拟接口
     *
     * @param BatchUpdateVirtualInterfaceRequest 请求对象
     * @return BatchUpdateVirtualInterfaceResponse
     */
    public BatchUpdateVirtualInterfaceResponse batchUpdateVirtualInterface(BatchUpdateVirtualInterfaceRequest request) {
        return hcClient.syncInvokeHttp(request, DcMeta.batchUpdateVirtualInterface);
    }

    /**
     * v3查询物理连接列表
     * 查询物理连接列表
     *
     * @param ListDirectConnectRequest 请求对象
     * @return ListDirectConnectResponse
     */
    public ListDirectConnectResponse listDirectConnect(ListDirectConnectRequest request) {
        return hcClient.syncInvokeHttp(request, DcMeta.listDirectConnect);
    }

    /**
     * v3查询虚拟网关列表
     * 查询虚拟网关列表
     *
     * @param ListVirtualGatewaysRequest 请求对象
     * @return ListVirtualGatewaysResponse
     */
    public ListVirtualGatewaysResponse listVirtualGateways(ListVirtualGatewaysRequest request) {
        return hcClient.syncInvokeHttp(request, DcMeta.listVirtualGateways);
    }

    /**
     * v3 查询虚拟接口列表
     * 查询虚拟接口列表
     *
     * @param ListVirtualInterfaceRequest 请求对象
     * @return ListVirtualInterfaceResponse
     */
    public ListVirtualInterfaceResponse listVirtualInterface(ListVirtualInterfaceRequest request) {
        return hcClient.syncInvokeHttp(request, DcMeta.listVirtualInterface);
    }

    /**
     * v3查询物理连接
     * 查询物理连接
     *
     * @param ShowDirectConnectRequest 请求对象
     * @return ShowDirectConnectResponse
     */
    public ShowDirectConnectResponse showDirectConnect(ShowDirectConnectRequest request) {
        return hcClient.syncInvokeHttp(request, DcMeta.showDirectConnect);
    }

    /**
     * v3查询虚拟网关
     * 查询虚拟网关
     *
     * @param ShowVirtualGatewaysRequest 请求对象
     * @return ShowVirtualGatewaysResponse
     */
    public ShowVirtualGatewaysResponse showVirtualGateways(ShowVirtualGatewaysRequest request) {
        return hcClient.syncInvokeHttp(request, DcMeta.showVirtualGateways);
    }

    /**
     * v3查询虚拟接口
     * 查询虚拟接口
     *
     * @param ShowVirtualInterfaceRequest 请求对象
     * @return ShowVirtualInterfaceResponse
     */
    public ShowVirtualInterfaceResponse showVirtualInterface(ShowVirtualInterfaceRequest request) {
        return hcClient.syncInvokeHttp(request, DcMeta.showVirtualInterface);
    }

}