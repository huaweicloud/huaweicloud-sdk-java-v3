package com.huaweicloud.sdk.vpc.v3;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

import com.huaweicloud.sdk.vpc.v3.model.*;

public class VpcAsyncClient {
    protected HcClient hcClient;

    public VpcAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<VpcAsyncClient> newBuilder() {
        return new ClientBuilder<>(VpcAsyncClient::new);
    }


    public CompletableFuture<BatchCreateSubNetworkInterfaceV3Response> batchCreateSubNetworkInterfaceV3Async(BatchCreateSubNetworkInterfaceV3Request request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.batchCreateSubNetworkInterfaceV3);
    }

    public CompletableFuture<CreateSubNetworkInterfaceResponse> createSubNetworkInterfaceAsync(CreateSubNetworkInterfaceRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.createSubNetworkInterface);
    }

    public CompletableFuture<DeleteSubNetworkInterfaceResponse> deleteSubNetworkInterfaceAsync(DeleteSubNetworkInterfaceRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.deleteSubNetworkInterface);
    }

    public CompletableFuture<ListSubNetworkInterfacesResponse> listSubNetworkInterfacesAsync(ListSubNetworkInterfacesRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.listSubNetworkInterfaces);
    }

    public CompletableFuture<ShowSubNetworkInterfaceResponse> showSubNetworkInterfaceAsync(ShowSubNetworkInterfaceRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.showSubNetworkInterface);
    }

    public CompletableFuture<ShowSubNetworkInterfacesQuantityResponse> showSubNetworkInterfacesQuantityAsync(ShowSubNetworkInterfacesQuantityRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.showSubNetworkInterfacesQuantity);
    }

    public CompletableFuture<UpdateSubNetworkInterfaceResponse> updateSubNetworkInterfaceAsync(UpdateSubNetworkInterfaceRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.updateSubNetworkInterface);
    }

}