package com.huaweicloud.sdk.dc.v3;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
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
     * v3创建物理连接
     * 创建物理连接
     *
     * @param BatchCreateDirectConnectRequest 请求对象
     * @return SyncInvoker<BatchCreateDirectConnectRequest, BatchCreateDirectConnectResponse>
     */
    public SyncInvoker<BatchCreateDirectConnectRequest, BatchCreateDirectConnectResponse> batchCreateDirectConnectInvoker(BatchCreateDirectConnectRequest request) {
        return new SyncInvoker<BatchCreateDirectConnectRequest, BatchCreateDirectConnectResponse>(request, DcMeta.batchCreateDirectConnect, hcClient);
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
     * v3创建虚拟网关
     * 创建虚拟网关
     *
     * @param BatchCreateVirtualGatewaysRequest 请求对象
     * @return SyncInvoker<BatchCreateVirtualGatewaysRequest, BatchCreateVirtualGatewaysResponse>
     */
    public SyncInvoker<BatchCreateVirtualGatewaysRequest, BatchCreateVirtualGatewaysResponse> batchCreateVirtualGatewaysInvoker(BatchCreateVirtualGatewaysRequest request) {
        return new SyncInvoker<BatchCreateVirtualGatewaysRequest, BatchCreateVirtualGatewaysResponse>(request, DcMeta.batchCreateVirtualGateways, hcClient);
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
     * v3创建虚拟接口
     * 创建虚拟接口
     *
     * @param BatchCreateVirtualInterfaceRequest 请求对象
     * @return SyncInvoker<BatchCreateVirtualInterfaceRequest, BatchCreateVirtualInterfaceResponse>
     */
    public SyncInvoker<BatchCreateVirtualInterfaceRequest, BatchCreateVirtualInterfaceResponse> batchCreateVirtualInterfaceInvoker(BatchCreateVirtualInterfaceRequest request) {
        return new SyncInvoker<BatchCreateVirtualInterfaceRequest, BatchCreateVirtualInterfaceResponse>(request, DcMeta.batchCreateVirtualInterface, hcClient);
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
     * v3删除物理连接
     * 删除物理连接
     *
     * @param BatchDeleteDirectConnectRequest 请求对象
     * @return SyncInvoker<BatchDeleteDirectConnectRequest, BatchDeleteDirectConnectResponse>
     */
    public SyncInvoker<BatchDeleteDirectConnectRequest, BatchDeleteDirectConnectResponse> batchDeleteDirectConnectInvoker(BatchDeleteDirectConnectRequest request) {
        return new SyncInvoker<BatchDeleteDirectConnectRequest, BatchDeleteDirectConnectResponse>(request, DcMeta.batchDeleteDirectConnect, hcClient);
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
     * v3删除虚拟网关
     * 删除虚拟网关
     *
     * @param BatchDeleteVirtualGatewaysRequest 请求对象
     * @return SyncInvoker<BatchDeleteVirtualGatewaysRequest, BatchDeleteVirtualGatewaysResponse>
     */
    public SyncInvoker<BatchDeleteVirtualGatewaysRequest, BatchDeleteVirtualGatewaysResponse> batchDeleteVirtualGatewaysInvoker(BatchDeleteVirtualGatewaysRequest request) {
        return new SyncInvoker<BatchDeleteVirtualGatewaysRequest, BatchDeleteVirtualGatewaysResponse>(request, DcMeta.batchDeleteVirtualGateways, hcClient);
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
     * v3删除虚拟接口
     * 删除虚拟接口
     *
     * @param BatchDeleteVirtualInterfaceRequest 请求对象
     * @return SyncInvoker<BatchDeleteVirtualInterfaceRequest, BatchDeleteVirtualInterfaceResponse>
     */
    public SyncInvoker<BatchDeleteVirtualInterfaceRequest, BatchDeleteVirtualInterfaceResponse> batchDeleteVirtualInterfaceInvoker(BatchDeleteVirtualInterfaceRequest request) {
        return new SyncInvoker<BatchDeleteVirtualInterfaceRequest, BatchDeleteVirtualInterfaceResponse>(request, DcMeta.batchDeleteVirtualInterface, hcClient);
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
     * v3更新物理连接
     * 更新物理连接
     *
     * @param BatchUpdateDirectConnectRequest 请求对象
     * @return SyncInvoker<BatchUpdateDirectConnectRequest, BatchUpdateDirectConnectResponse>
     */
    public SyncInvoker<BatchUpdateDirectConnectRequest, BatchUpdateDirectConnectResponse> batchUpdateDirectConnectInvoker(BatchUpdateDirectConnectRequest request) {
        return new SyncInvoker<BatchUpdateDirectConnectRequest, BatchUpdateDirectConnectResponse>(request, DcMeta.batchUpdateDirectConnect, hcClient);
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
     * v3更新虚拟网关
     * 更新虚拟网关
     *
     * @param BatchUpdateVirtualGatewaysRequest 请求对象
     * @return SyncInvoker<BatchUpdateVirtualGatewaysRequest, BatchUpdateVirtualGatewaysResponse>
     */
    public SyncInvoker<BatchUpdateVirtualGatewaysRequest, BatchUpdateVirtualGatewaysResponse> batchUpdateVirtualGatewaysInvoker(BatchUpdateVirtualGatewaysRequest request) {
        return new SyncInvoker<BatchUpdateVirtualGatewaysRequest, BatchUpdateVirtualGatewaysResponse>(request, DcMeta.batchUpdateVirtualGateways, hcClient);
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
     * v3更新虚拟接口
     * 更新虚拟接口
     *
     * @param BatchUpdateVirtualInterfaceRequest 请求对象
     * @return SyncInvoker<BatchUpdateVirtualInterfaceRequest, BatchUpdateVirtualInterfaceResponse>
     */
    public SyncInvoker<BatchUpdateVirtualInterfaceRequest, BatchUpdateVirtualInterfaceResponse> batchUpdateVirtualInterfaceInvoker(BatchUpdateVirtualInterfaceRequest request) {
        return new SyncInvoker<BatchUpdateVirtualInterfaceRequest, BatchUpdateVirtualInterfaceResponse>(request, DcMeta.batchUpdateVirtualInterface, hcClient);
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
     * v3查询物理连接列表
     * 查询物理连接列表
     *
     * @param ListDirectConnectRequest 请求对象
     * @return SyncInvoker<ListDirectConnectRequest, ListDirectConnectResponse>
     */
    public SyncInvoker<ListDirectConnectRequest, ListDirectConnectResponse> listDirectConnectInvoker(ListDirectConnectRequest request) {
        return new SyncInvoker<ListDirectConnectRequest, ListDirectConnectResponse>(request, DcMeta.listDirectConnect, hcClient);
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
     * v3查询虚拟网关列表
     * 查询虚拟网关列表
     *
     * @param ListVirtualGatewaysRequest 请求对象
     * @return SyncInvoker<ListVirtualGatewaysRequest, ListVirtualGatewaysResponse>
     */
    public SyncInvoker<ListVirtualGatewaysRequest, ListVirtualGatewaysResponse> listVirtualGatewaysInvoker(ListVirtualGatewaysRequest request) {
        return new SyncInvoker<ListVirtualGatewaysRequest, ListVirtualGatewaysResponse>(request, DcMeta.listVirtualGateways, hcClient);
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
     * v3 查询虚拟接口列表
     * 查询虚拟接口列表
     *
     * @param ListVirtualInterfaceRequest 请求对象
     * @return SyncInvoker<ListVirtualInterfaceRequest, ListVirtualInterfaceResponse>
     */
    public SyncInvoker<ListVirtualInterfaceRequest, ListVirtualInterfaceResponse> listVirtualInterfaceInvoker(ListVirtualInterfaceRequest request) {
        return new SyncInvoker<ListVirtualInterfaceRequest, ListVirtualInterfaceResponse>(request, DcMeta.listVirtualInterface, hcClient);
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
     * v3查询物理连接
     * 查询物理连接
     *
     * @param ShowDirectConnectRequest 请求对象
     * @return SyncInvoker<ShowDirectConnectRequest, ShowDirectConnectResponse>
     */
    public SyncInvoker<ShowDirectConnectRequest, ShowDirectConnectResponse> showDirectConnectInvoker(ShowDirectConnectRequest request) {
        return new SyncInvoker<ShowDirectConnectRequest, ShowDirectConnectResponse>(request, DcMeta.showDirectConnect, hcClient);
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
     * v3查询虚拟网关
     * 查询虚拟网关
     *
     * @param ShowVirtualGatewaysRequest 请求对象
     * @return SyncInvoker<ShowVirtualGatewaysRequest, ShowVirtualGatewaysResponse>
     */
    public SyncInvoker<ShowVirtualGatewaysRequest, ShowVirtualGatewaysResponse> showVirtualGatewaysInvoker(ShowVirtualGatewaysRequest request) {
        return new SyncInvoker<ShowVirtualGatewaysRequest, ShowVirtualGatewaysResponse>(request, DcMeta.showVirtualGateways, hcClient);
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

    /**
     * v3查询虚拟接口
     * 查询虚拟接口
     *
     * @param ShowVirtualInterfaceRequest 请求对象
     * @return SyncInvoker<ShowVirtualInterfaceRequest, ShowVirtualInterfaceResponse>
     */
    public SyncInvoker<ShowVirtualInterfaceRequest, ShowVirtualInterfaceResponse> showVirtualInterfaceInvoker(ShowVirtualInterfaceRequest request) {
        return new SyncInvoker<ShowVirtualInterfaceRequest, ShowVirtualInterfaceResponse>(request, DcMeta.showVirtualInterface, hcClient);
    }

}