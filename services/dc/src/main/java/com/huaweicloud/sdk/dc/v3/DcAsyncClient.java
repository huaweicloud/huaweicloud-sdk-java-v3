package com.huaweicloud.sdk.dc.v3;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

import com.huaweicloud.sdk.dc.v3.model.*;

public class DcAsyncClient {
    protected HcClient hcClient;

    public DcAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<DcAsyncClient> newBuilder() {
        return new ClientBuilder<>(DcAsyncClient::new);
    }


    public CompletableFuture<BatchCreateDirectConnectResponse> batchCreateDirectConnectAsync(BatchCreateDirectConnectRequest request) {
        return hcClient.asyncInvokeHttp(request, DcMeta.batchCreateDirectConnect);
    }

    public CompletableFuture<BatchCreateVirtualGatewaysResponse> batchCreateVirtualGatewaysAsync(BatchCreateVirtualGatewaysRequest request) {
        return hcClient.asyncInvokeHttp(request, DcMeta.batchCreateVirtualGateways);
    }

    public CompletableFuture<BatchCreateVirtualInterfaceResponse> batchCreateVirtualInterfaceAsync(BatchCreateVirtualInterfaceRequest request) {
        return hcClient.asyncInvokeHttp(request, DcMeta.batchCreateVirtualInterface);
    }

    public CompletableFuture<BatchDeleteDirectConnectResponse> batchDeleteDirectConnectAsync(BatchDeleteDirectConnectRequest request) {
        return hcClient.asyncInvokeHttp(request, DcMeta.batchDeleteDirectConnect);
    }

    public CompletableFuture<BatchDeleteVirtualGatewaysResponse> batchDeleteVirtualGatewaysAsync(BatchDeleteVirtualGatewaysRequest request) {
        return hcClient.asyncInvokeHttp(request, DcMeta.batchDeleteVirtualGateways);
    }

    public CompletableFuture<BatchDeleteVirtualInterfaceResponse> batchDeleteVirtualInterfaceAsync(BatchDeleteVirtualInterfaceRequest request) {
        return hcClient.asyncInvokeHttp(request, DcMeta.batchDeleteVirtualInterface);
    }

    public CompletableFuture<BatchUpdateDirectConnectResponse> batchUpdateDirectConnectAsync(BatchUpdateDirectConnectRequest request) {
        return hcClient.asyncInvokeHttp(request, DcMeta.batchUpdateDirectConnect);
    }

    public CompletableFuture<BatchUpdateVirtualGatewaysResponse> batchUpdateVirtualGatewaysAsync(BatchUpdateVirtualGatewaysRequest request) {
        return hcClient.asyncInvokeHttp(request, DcMeta.batchUpdateVirtualGateways);
    }

    public CompletableFuture<BatchUpdateVirtualInterfaceResponse> batchUpdateVirtualInterfaceAsync(BatchUpdateVirtualInterfaceRequest request) {
        return hcClient.asyncInvokeHttp(request, DcMeta.batchUpdateVirtualInterface);
    }

    public CompletableFuture<ListDirectConnectResponse> listDirectConnectAsync(ListDirectConnectRequest request) {
        return hcClient.asyncInvokeHttp(request, DcMeta.listDirectConnect);
    }

    public CompletableFuture<ListVirtualGatewaysResponse> listVirtualGatewaysAsync(ListVirtualGatewaysRequest request) {
        return hcClient.asyncInvokeHttp(request, DcMeta.listVirtualGateways);
    }

    public CompletableFuture<ListVirtualInterfaceResponse> listVirtualInterfaceAsync(ListVirtualInterfaceRequest request) {
        return hcClient.asyncInvokeHttp(request, DcMeta.listVirtualInterface);
    }

    public CompletableFuture<ShowDirectConnectResponse> showDirectConnectAsync(ShowDirectConnectRequest request) {
        return hcClient.asyncInvokeHttp(request, DcMeta.showDirectConnect);
    }

    public CompletableFuture<ShowVirtualGatewaysResponse> showVirtualGatewaysAsync(ShowVirtualGatewaysRequest request) {
        return hcClient.asyncInvokeHttp(request, DcMeta.showVirtualGateways);
    }

    public CompletableFuture<ShowVirtualInterfaceResponse> showVirtualInterfaceAsync(ShowVirtualInterfaceRequest request) {
        return hcClient.asyncInvokeHttp(request, DcMeta.showVirtualInterface);
    }

}