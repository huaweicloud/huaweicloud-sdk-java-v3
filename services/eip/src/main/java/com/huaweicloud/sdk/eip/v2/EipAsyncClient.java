package com.huaweicloud.sdk.eip.v2;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

import com.huaweicloud.sdk.eip.v2.model.*;

public class EipAsyncClient {
    protected HcClient hcClient;

    public EipAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<EipAsyncClient> newBuilder() {
        return new ClientBuilder<>(EipAsyncClient::new);
    }


    public CompletableFuture<AddPublicipsIntoSharedBandwidthResponse> addPublicipsIntoSharedBandwidthAsync(AddPublicipsIntoSharedBandwidthRequest request) {
        return hcClient.asyncInvokeHttp(request, EipMeta.addPublicipsIntoSharedBandwidth);
    }

    public CompletableFuture<BatchCreateSharedBandwidthsResponse> batchCreateSharedBandwidthsAsync(BatchCreateSharedBandwidthsRequest request) {
        return hcClient.asyncInvokeHttp(request, EipMeta.batchCreateSharedBandwidths);
    }

    public CompletableFuture<CreateSharedBandwidthResponse> createSharedBandwidthAsync(CreateSharedBandwidthRequest request) {
        return hcClient.asyncInvokeHttp(request, EipMeta.createSharedBandwidth);
    }

    public CompletableFuture<DeleteSharedBandwidthResponse> deleteSharedBandwidthAsync(DeleteSharedBandwidthRequest request) {
        return hcClient.asyncInvokeHttp(request, EipMeta.deleteSharedBandwidth);
    }

    public CompletableFuture<ListBandwidthsResponse> listBandwidthsAsync(ListBandwidthsRequest request) {
        return hcClient.asyncInvokeHttp(request, EipMeta.listBandwidths);
    }

    public CompletableFuture<ListQuotasResponse> listQuotasAsync(ListQuotasRequest request) {
        return hcClient.asyncInvokeHttp(request, EipMeta.listQuotas);
    }

    public CompletableFuture<RemovePublicipsFromSharedBandwidthResponse> removePublicipsFromSharedBandwidthAsync(RemovePublicipsFromSharedBandwidthRequest request) {
        return hcClient.asyncInvokeHttp(request, EipMeta.removePublicipsFromSharedBandwidth);
    }

    public CompletableFuture<ShowBandwidthResponse> showBandwidthAsync(ShowBandwidthRequest request) {
        return hcClient.asyncInvokeHttp(request, EipMeta.showBandwidth);
    }

    public CompletableFuture<UpdateBandwidthResponse> updateBandwidthAsync(UpdateBandwidthRequest request) {
        return hcClient.asyncInvokeHttp(request, EipMeta.updateBandwidth);
    }

    public CompletableFuture<UpdatePrePaidBandwidthResponse> updatePrePaidBandwidthAsync(UpdatePrePaidBandwidthRequest request) {
        return hcClient.asyncInvokeHttp(request, EipMeta.updatePrePaidBandwidth);
    }

    public CompletableFuture<BatchCreatePublicipTagsResponse> batchCreatePublicipTagsAsync(BatchCreatePublicipTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, EipMeta.batchCreatePublicipTags);
    }

    public CompletableFuture<BatchDeletePublicipTagsResponse> batchDeletePublicipTagsAsync(BatchDeletePublicipTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, EipMeta.batchDeletePublicipTags);
    }

    public CompletableFuture<CreatePrePaidPublicipResponse> createPrePaidPublicipAsync(CreatePrePaidPublicipRequest request) {
        return hcClient.asyncInvokeHttp(request, EipMeta.createPrePaidPublicip);
    }

    public CompletableFuture<CreatePublicipResponse> createPublicipAsync(CreatePublicipRequest request) {
        return hcClient.asyncInvokeHttp(request, EipMeta.createPublicip);
    }

    public CompletableFuture<CreatePublicipTagResponse> createPublicipTagAsync(CreatePublicipTagRequest request) {
        return hcClient.asyncInvokeHttp(request, EipMeta.createPublicipTag);
    }

    public CompletableFuture<DeletePublicipResponse> deletePublicipAsync(DeletePublicipRequest request) {
        return hcClient.asyncInvokeHttp(request, EipMeta.deletePublicip);
    }

    public CompletableFuture<DeletePublicipTagResponse> deletePublicipTagAsync(DeletePublicipTagRequest request) {
        return hcClient.asyncInvokeHttp(request, EipMeta.deletePublicipTag);
    }

    public CompletableFuture<ListPublicipTagsResponse> listPublicipTagsAsync(ListPublicipTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, EipMeta.listPublicipTags);
    }

    public CompletableFuture<ListPublicipsResponse> listPublicipsAsync(ListPublicipsRequest request) {
        return hcClient.asyncInvokeHttp(request, EipMeta.listPublicips);
    }

    public CompletableFuture<ListPublicipsByTagsResponse> listPublicipsByTagsAsync(ListPublicipsByTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, EipMeta.listPublicipsByTags);
    }

    public CompletableFuture<ShowPublicipResponse> showPublicipAsync(ShowPublicipRequest request) {
        return hcClient.asyncInvokeHttp(request, EipMeta.showPublicip);
    }

    public CompletableFuture<ShowPublicipTagsResponse> showPublicipTagsAsync(ShowPublicipTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, EipMeta.showPublicipTags);
    }

    public CompletableFuture<UpdatePublicipResponse> updatePublicipAsync(UpdatePublicipRequest request) {
        return hcClient.asyncInvokeHttp(request, EipMeta.updatePublicip);
    }

    public CompletableFuture<NeutronCreateFloatingIpResponse> neutronCreateFloatingIpAsync(NeutronCreateFloatingIpRequest request) {
        return hcClient.asyncInvokeHttp(request, EipMeta.neutronCreateFloatingIp);
    }

    public CompletableFuture<NeutronDeleteFloatingIpResponse> neutronDeleteFloatingIpAsync(NeutronDeleteFloatingIpRequest request) {
        return hcClient.asyncInvokeHttp(request, EipMeta.neutronDeleteFloatingIp);
    }

    public CompletableFuture<NeutronListFloatingIpsResponse> neutronListFloatingIpsAsync(NeutronListFloatingIpsRequest request) {
        return hcClient.asyncInvokeHttp(request, EipMeta.neutronListFloatingIps);
    }

    public CompletableFuture<NeutronShowFloatingIpResponse> neutronShowFloatingIpAsync(NeutronShowFloatingIpRequest request) {
        return hcClient.asyncInvokeHttp(request, EipMeta.neutronShowFloatingIp);
    }

    public CompletableFuture<NeutronUpdateFloatingIpResponse> neutronUpdateFloatingIpAsync(NeutronUpdateFloatingIpRequest request) {
        return hcClient.asyncInvokeHttp(request, EipMeta.neutronUpdateFloatingIp);
    }

}