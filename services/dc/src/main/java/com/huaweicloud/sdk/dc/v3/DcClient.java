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

    public BatchCreateDirectConnectResponse batchCreateDirectConnect(BatchCreateDirectConnectRequest request) {
        return hcClient.syncInvokeHttp(request, DcMeta.batchCreateDirectConnect);
    }

    public BatchCreateVirtualGatewaysResponse batchCreateVirtualGateways(BatchCreateVirtualGatewaysRequest request) {
        return hcClient.syncInvokeHttp(request, DcMeta.batchCreateVirtualGateways);
    }

    public BatchCreateVirtualInterfaceResponse batchCreateVirtualInterface(BatchCreateVirtualInterfaceRequest request) {
        return hcClient.syncInvokeHttp(request, DcMeta.batchCreateVirtualInterface);
    }

    public BatchDeleteDirectConnectResponse batchDeleteDirectConnect(BatchDeleteDirectConnectRequest request) {
        return hcClient.syncInvokeHttp(request, DcMeta.batchDeleteDirectConnect);
    }

    public BatchDeleteVirtualGatewaysResponse batchDeleteVirtualGateways(BatchDeleteVirtualGatewaysRequest request) {
        return hcClient.syncInvokeHttp(request, DcMeta.batchDeleteVirtualGateways);
    }

    public BatchDeleteVirtualInterfaceResponse batchDeleteVirtualInterface(BatchDeleteVirtualInterfaceRequest request) {
        return hcClient.syncInvokeHttp(request, DcMeta.batchDeleteVirtualInterface);
    }

    public BatchUpdateDirectConnectResponse batchUpdateDirectConnect(BatchUpdateDirectConnectRequest request) {
        return hcClient.syncInvokeHttp(request, DcMeta.batchUpdateDirectConnect);
    }

    public BatchUpdateVirtualGatewaysResponse batchUpdateVirtualGateways(BatchUpdateVirtualGatewaysRequest request) {
        return hcClient.syncInvokeHttp(request, DcMeta.batchUpdateVirtualGateways);
    }

    public BatchUpdateVirtualInterfaceResponse batchUpdateVirtualInterface(BatchUpdateVirtualInterfaceRequest request) {
        return hcClient.syncInvokeHttp(request, DcMeta.batchUpdateVirtualInterface);
    }

    public ListDirectConnectResponse listDirectConnect(ListDirectConnectRequest request) {
        return hcClient.syncInvokeHttp(request, DcMeta.listDirectConnect);
    }

    public ListVirtualGatewaysResponse listVirtualGateways(ListVirtualGatewaysRequest request) {
        return hcClient.syncInvokeHttp(request, DcMeta.listVirtualGateways);
    }

    public ListVirtualInterfaceResponse listVirtualInterface(ListVirtualInterfaceRequest request) {
        return hcClient.syncInvokeHttp(request, DcMeta.listVirtualInterface);
    }

    public ShowDirectConnectResponse showDirectConnect(ShowDirectConnectRequest request) {
        return hcClient.syncInvokeHttp(request, DcMeta.showDirectConnect);
    }

    public ShowVirtualGatewaysResponse showVirtualGateways(ShowVirtualGatewaysRequest request) {
        return hcClient.syncInvokeHttp(request, DcMeta.showVirtualGateways);
    }

    public ShowVirtualInterfaceResponse showVirtualInterface(ShowVirtualInterfaceRequest request) {
        return hcClient.syncInvokeHttp(request, DcMeta.showVirtualInterface);
    }

}