package com.huaweicloud.sdk.dc.v3;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.dc.v3.model.*;

public class DcAsyncClient {
    protected HcClient hcClient;

    public DcAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<DcAsyncClient> newBuilder() {
        return new ClientBuilder<>(DcAsyncClient::new);
    }


    /**
     * v3创建物理连接
     * 创建物理连接
     *
     * @param BatchCreateDirectConnectRequest 请求对象
     * @return CompletableFuture<BatchCreateDirectConnectResponse>
     */
    public CompletableFuture<BatchCreateDirectConnectResponse> batchCreateDirectConnectAsync(BatchCreateDirectConnectRequest request) {
        return hcClient.asyncInvokeHttp(request, DcMeta.batchCreateDirectConnect);
    }

    /**
     * v3创建物理连接
     * 创建物理连接
     *
     * @param BatchCreateDirectConnectRequest 请求对象
     * @return AsyncInvoker<BatchCreateDirectConnectRequest, BatchCreateDirectConnectResponse>
     */
    public AsyncInvoker<BatchCreateDirectConnectRequest, BatchCreateDirectConnectResponse> batchCreateDirectConnectAsyncInvoker(BatchCreateDirectConnectRequest request) {
        return new AsyncInvoker<BatchCreateDirectConnectRequest, BatchCreateDirectConnectResponse>(request, DcMeta.batchCreateDirectConnect, hcClient);
    }

    /**
     * v3创建虚拟网关
     * 创建虚拟网关
     *
     * @param BatchCreateVirtualGatewaysRequest 请求对象
     * @return CompletableFuture<BatchCreateVirtualGatewaysResponse>
     */
    public CompletableFuture<BatchCreateVirtualGatewaysResponse> batchCreateVirtualGatewaysAsync(BatchCreateVirtualGatewaysRequest request) {
        return hcClient.asyncInvokeHttp(request, DcMeta.batchCreateVirtualGateways);
    }

    /**
     * v3创建虚拟网关
     * 创建虚拟网关
     *
     * @param BatchCreateVirtualGatewaysRequest 请求对象
     * @return AsyncInvoker<BatchCreateVirtualGatewaysRequest, BatchCreateVirtualGatewaysResponse>
     */
    public AsyncInvoker<BatchCreateVirtualGatewaysRequest, BatchCreateVirtualGatewaysResponse> batchCreateVirtualGatewaysAsyncInvoker(BatchCreateVirtualGatewaysRequest request) {
        return new AsyncInvoker<BatchCreateVirtualGatewaysRequest, BatchCreateVirtualGatewaysResponse>(request, DcMeta.batchCreateVirtualGateways, hcClient);
    }

    /**
     * v3创建虚拟接口
     * 创建虚拟接口
     *
     * @param BatchCreateVirtualInterfaceRequest 请求对象
     * @return CompletableFuture<BatchCreateVirtualInterfaceResponse>
     */
    public CompletableFuture<BatchCreateVirtualInterfaceResponse> batchCreateVirtualInterfaceAsync(BatchCreateVirtualInterfaceRequest request) {
        return hcClient.asyncInvokeHttp(request, DcMeta.batchCreateVirtualInterface);
    }

    /**
     * v3创建虚拟接口
     * 创建虚拟接口
     *
     * @param BatchCreateVirtualInterfaceRequest 请求对象
     * @return AsyncInvoker<BatchCreateVirtualInterfaceRequest, BatchCreateVirtualInterfaceResponse>
     */
    public AsyncInvoker<BatchCreateVirtualInterfaceRequest, BatchCreateVirtualInterfaceResponse> batchCreateVirtualInterfaceAsyncInvoker(BatchCreateVirtualInterfaceRequest request) {
        return new AsyncInvoker<BatchCreateVirtualInterfaceRequest, BatchCreateVirtualInterfaceResponse>(request, DcMeta.batchCreateVirtualInterface, hcClient);
    }

    /**
     * v3删除物理连接
     * 删除物理连接
     *
     * @param BatchDeleteDirectConnectRequest 请求对象
     * @return CompletableFuture<BatchDeleteDirectConnectResponse>
     */
    public CompletableFuture<BatchDeleteDirectConnectResponse> batchDeleteDirectConnectAsync(BatchDeleteDirectConnectRequest request) {
        return hcClient.asyncInvokeHttp(request, DcMeta.batchDeleteDirectConnect);
    }

    /**
     * v3删除物理连接
     * 删除物理连接
     *
     * @param BatchDeleteDirectConnectRequest 请求对象
     * @return AsyncInvoker<BatchDeleteDirectConnectRequest, BatchDeleteDirectConnectResponse>
     */
    public AsyncInvoker<BatchDeleteDirectConnectRequest, BatchDeleteDirectConnectResponse> batchDeleteDirectConnectAsyncInvoker(BatchDeleteDirectConnectRequest request) {
        return new AsyncInvoker<BatchDeleteDirectConnectRequest, BatchDeleteDirectConnectResponse>(request, DcMeta.batchDeleteDirectConnect, hcClient);
    }

    /**
     * v3删除虚拟网关
     * 删除虚拟网关
     *
     * @param BatchDeleteVirtualGatewaysRequest 请求对象
     * @return CompletableFuture<BatchDeleteVirtualGatewaysResponse>
     */
    public CompletableFuture<BatchDeleteVirtualGatewaysResponse> batchDeleteVirtualGatewaysAsync(BatchDeleteVirtualGatewaysRequest request) {
        return hcClient.asyncInvokeHttp(request, DcMeta.batchDeleteVirtualGateways);
    }

    /**
     * v3删除虚拟网关
     * 删除虚拟网关
     *
     * @param BatchDeleteVirtualGatewaysRequest 请求对象
     * @return AsyncInvoker<BatchDeleteVirtualGatewaysRequest, BatchDeleteVirtualGatewaysResponse>
     */
    public AsyncInvoker<BatchDeleteVirtualGatewaysRequest, BatchDeleteVirtualGatewaysResponse> batchDeleteVirtualGatewaysAsyncInvoker(BatchDeleteVirtualGatewaysRequest request) {
        return new AsyncInvoker<BatchDeleteVirtualGatewaysRequest, BatchDeleteVirtualGatewaysResponse>(request, DcMeta.batchDeleteVirtualGateways, hcClient);
    }

    /**
     * v3删除虚拟接口
     * 删除虚拟接口
     *
     * @param BatchDeleteVirtualInterfaceRequest 请求对象
     * @return CompletableFuture<BatchDeleteVirtualInterfaceResponse>
     */
    public CompletableFuture<BatchDeleteVirtualInterfaceResponse> batchDeleteVirtualInterfaceAsync(BatchDeleteVirtualInterfaceRequest request) {
        return hcClient.asyncInvokeHttp(request, DcMeta.batchDeleteVirtualInterface);
    }

    /**
     * v3删除虚拟接口
     * 删除虚拟接口
     *
     * @param BatchDeleteVirtualInterfaceRequest 请求对象
     * @return AsyncInvoker<BatchDeleteVirtualInterfaceRequest, BatchDeleteVirtualInterfaceResponse>
     */
    public AsyncInvoker<BatchDeleteVirtualInterfaceRequest, BatchDeleteVirtualInterfaceResponse> batchDeleteVirtualInterfaceAsyncInvoker(BatchDeleteVirtualInterfaceRequest request) {
        return new AsyncInvoker<BatchDeleteVirtualInterfaceRequest, BatchDeleteVirtualInterfaceResponse>(request, DcMeta.batchDeleteVirtualInterface, hcClient);
    }

    /**
     * v3更新物理连接
     * 更新物理连接
     *
     * @param BatchUpdateDirectConnectRequest 请求对象
     * @return CompletableFuture<BatchUpdateDirectConnectResponse>
     */
    public CompletableFuture<BatchUpdateDirectConnectResponse> batchUpdateDirectConnectAsync(BatchUpdateDirectConnectRequest request) {
        return hcClient.asyncInvokeHttp(request, DcMeta.batchUpdateDirectConnect);
    }

    /**
     * v3更新物理连接
     * 更新物理连接
     *
     * @param BatchUpdateDirectConnectRequest 请求对象
     * @return AsyncInvoker<BatchUpdateDirectConnectRequest, BatchUpdateDirectConnectResponse>
     */
    public AsyncInvoker<BatchUpdateDirectConnectRequest, BatchUpdateDirectConnectResponse> batchUpdateDirectConnectAsyncInvoker(BatchUpdateDirectConnectRequest request) {
        return new AsyncInvoker<BatchUpdateDirectConnectRequest, BatchUpdateDirectConnectResponse>(request, DcMeta.batchUpdateDirectConnect, hcClient);
    }

    /**
     * v3更新虚拟网关
     * 更新虚拟网关
     *
     * @param BatchUpdateVirtualGatewaysRequest 请求对象
     * @return CompletableFuture<BatchUpdateVirtualGatewaysResponse>
     */
    public CompletableFuture<BatchUpdateVirtualGatewaysResponse> batchUpdateVirtualGatewaysAsync(BatchUpdateVirtualGatewaysRequest request) {
        return hcClient.asyncInvokeHttp(request, DcMeta.batchUpdateVirtualGateways);
    }

    /**
     * v3更新虚拟网关
     * 更新虚拟网关
     *
     * @param BatchUpdateVirtualGatewaysRequest 请求对象
     * @return AsyncInvoker<BatchUpdateVirtualGatewaysRequest, BatchUpdateVirtualGatewaysResponse>
     */
    public AsyncInvoker<BatchUpdateVirtualGatewaysRequest, BatchUpdateVirtualGatewaysResponse> batchUpdateVirtualGatewaysAsyncInvoker(BatchUpdateVirtualGatewaysRequest request) {
        return new AsyncInvoker<BatchUpdateVirtualGatewaysRequest, BatchUpdateVirtualGatewaysResponse>(request, DcMeta.batchUpdateVirtualGateways, hcClient);
    }

    /**
     * v3更新虚拟接口
     * 更新虚拟接口
     *
     * @param BatchUpdateVirtualInterfaceRequest 请求对象
     * @return CompletableFuture<BatchUpdateVirtualInterfaceResponse>
     */
    public CompletableFuture<BatchUpdateVirtualInterfaceResponse> batchUpdateVirtualInterfaceAsync(BatchUpdateVirtualInterfaceRequest request) {
        return hcClient.asyncInvokeHttp(request, DcMeta.batchUpdateVirtualInterface);
    }

    /**
     * v3更新虚拟接口
     * 更新虚拟接口
     *
     * @param BatchUpdateVirtualInterfaceRequest 请求对象
     * @return AsyncInvoker<BatchUpdateVirtualInterfaceRequest, BatchUpdateVirtualInterfaceResponse>
     */
    public AsyncInvoker<BatchUpdateVirtualInterfaceRequest, BatchUpdateVirtualInterfaceResponse> batchUpdateVirtualInterfaceAsyncInvoker(BatchUpdateVirtualInterfaceRequest request) {
        return new AsyncInvoker<BatchUpdateVirtualInterfaceRequest, BatchUpdateVirtualInterfaceResponse>(request, DcMeta.batchUpdateVirtualInterface, hcClient);
    }

    /**
     * v3查询物理连接列表
     * 查询物理连接列表
     *
     * @param ListDirectConnectRequest 请求对象
     * @return CompletableFuture<ListDirectConnectResponse>
     */
    public CompletableFuture<ListDirectConnectResponse> listDirectConnectAsync(ListDirectConnectRequest request) {
        return hcClient.asyncInvokeHttp(request, DcMeta.listDirectConnect);
    }

    /**
     * v3查询物理连接列表
     * 查询物理连接列表
     *
     * @param ListDirectConnectRequest 请求对象
     * @return AsyncInvoker<ListDirectConnectRequest, ListDirectConnectResponse>
     */
    public AsyncInvoker<ListDirectConnectRequest, ListDirectConnectResponse> listDirectConnectAsyncInvoker(ListDirectConnectRequest request) {
        return new AsyncInvoker<ListDirectConnectRequest, ListDirectConnectResponse>(request, DcMeta.listDirectConnect, hcClient);
    }

    /**
     * v3查询虚拟网关列表
     * 查询虚拟网关列表
     *
     * @param ListVirtualGatewaysRequest 请求对象
     * @return CompletableFuture<ListVirtualGatewaysResponse>
     */
    public CompletableFuture<ListVirtualGatewaysResponse> listVirtualGatewaysAsync(ListVirtualGatewaysRequest request) {
        return hcClient.asyncInvokeHttp(request, DcMeta.listVirtualGateways);
    }

    /**
     * v3查询虚拟网关列表
     * 查询虚拟网关列表
     *
     * @param ListVirtualGatewaysRequest 请求对象
     * @return AsyncInvoker<ListVirtualGatewaysRequest, ListVirtualGatewaysResponse>
     */
    public AsyncInvoker<ListVirtualGatewaysRequest, ListVirtualGatewaysResponse> listVirtualGatewaysAsyncInvoker(ListVirtualGatewaysRequest request) {
        return new AsyncInvoker<ListVirtualGatewaysRequest, ListVirtualGatewaysResponse>(request, DcMeta.listVirtualGateways, hcClient);
    }

    /**
     * v3 查询虚拟接口列表
     * 查询虚拟接口列表
     *
     * @param ListVirtualInterfaceRequest 请求对象
     * @return CompletableFuture<ListVirtualInterfaceResponse>
     */
    public CompletableFuture<ListVirtualInterfaceResponse> listVirtualInterfaceAsync(ListVirtualInterfaceRequest request) {
        return hcClient.asyncInvokeHttp(request, DcMeta.listVirtualInterface);
    }

    /**
     * v3 查询虚拟接口列表
     * 查询虚拟接口列表
     *
     * @param ListVirtualInterfaceRequest 请求对象
     * @return AsyncInvoker<ListVirtualInterfaceRequest, ListVirtualInterfaceResponse>
     */
    public AsyncInvoker<ListVirtualInterfaceRequest, ListVirtualInterfaceResponse> listVirtualInterfaceAsyncInvoker(ListVirtualInterfaceRequest request) {
        return new AsyncInvoker<ListVirtualInterfaceRequest, ListVirtualInterfaceResponse>(request, DcMeta.listVirtualInterface, hcClient);
    }

    /**
     * v3查询物理连接
     * 查询物理连接
     *
     * @param ShowDirectConnectRequest 请求对象
     * @return CompletableFuture<ShowDirectConnectResponse>
     */
    public CompletableFuture<ShowDirectConnectResponse> showDirectConnectAsync(ShowDirectConnectRequest request) {
        return hcClient.asyncInvokeHttp(request, DcMeta.showDirectConnect);
    }

    /**
     * v3查询物理连接
     * 查询物理连接
     *
     * @param ShowDirectConnectRequest 请求对象
     * @return AsyncInvoker<ShowDirectConnectRequest, ShowDirectConnectResponse>
     */
    public AsyncInvoker<ShowDirectConnectRequest, ShowDirectConnectResponse> showDirectConnectAsyncInvoker(ShowDirectConnectRequest request) {
        return new AsyncInvoker<ShowDirectConnectRequest, ShowDirectConnectResponse>(request, DcMeta.showDirectConnect, hcClient);
    }

    /**
     * v3查询虚拟网关
     * 查询虚拟网关
     *
     * @param ShowVirtualGatewaysRequest 请求对象
     * @return CompletableFuture<ShowVirtualGatewaysResponse>
     */
    public CompletableFuture<ShowVirtualGatewaysResponse> showVirtualGatewaysAsync(ShowVirtualGatewaysRequest request) {
        return hcClient.asyncInvokeHttp(request, DcMeta.showVirtualGateways);
    }

    /**
     * v3查询虚拟网关
     * 查询虚拟网关
     *
     * @param ShowVirtualGatewaysRequest 请求对象
     * @return AsyncInvoker<ShowVirtualGatewaysRequest, ShowVirtualGatewaysResponse>
     */
    public AsyncInvoker<ShowVirtualGatewaysRequest, ShowVirtualGatewaysResponse> showVirtualGatewaysAsyncInvoker(ShowVirtualGatewaysRequest request) {
        return new AsyncInvoker<ShowVirtualGatewaysRequest, ShowVirtualGatewaysResponse>(request, DcMeta.showVirtualGateways, hcClient);
    }

    /**
     * v3查询虚拟接口
     * 查询虚拟接口
     *
     * @param ShowVirtualInterfaceRequest 请求对象
     * @return CompletableFuture<ShowVirtualInterfaceResponse>
     */
    public CompletableFuture<ShowVirtualInterfaceResponse> showVirtualInterfaceAsync(ShowVirtualInterfaceRequest request) {
        return hcClient.asyncInvokeHttp(request, DcMeta.showVirtualInterface);
    }

    /**
     * v3查询虚拟接口
     * 查询虚拟接口
     *
     * @param ShowVirtualInterfaceRequest 请求对象
     * @return AsyncInvoker<ShowVirtualInterfaceRequest, ShowVirtualInterfaceResponse>
     */
    public AsyncInvoker<ShowVirtualInterfaceRequest, ShowVirtualInterfaceResponse> showVirtualInterfaceAsyncInvoker(ShowVirtualInterfaceRequest request) {
        return new AsyncInvoker<ShowVirtualInterfaceRequest, ShowVirtualInterfaceResponse>(request, DcMeta.showVirtualInterface, hcClient);
    }

}