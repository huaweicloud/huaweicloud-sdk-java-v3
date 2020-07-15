package com.huaweicloud.sdk.eip.v2;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.eip.v2.model.*;

public class EipClient {
    protected HcClient hcClient;

    public EipClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<EipClient> newBuilder() {
        return new ClientBuilder<>(EipClient::new);
    }

    public AddPublicipsIntoSharedBandwidthResponse addPublicipsIntoSharedBandwidth(AddPublicipsIntoSharedBandwidthRequest request) {
        return hcClient.syncInvokeHttp(request, EipMeta.addPublicipsIntoSharedBandwidth);
    }

    public BatchCreateSharedBandwidthsResponse batchCreateSharedBandwidths(BatchCreateSharedBandwidthsRequest request) {
        return hcClient.syncInvokeHttp(request, EipMeta.batchCreateSharedBandwidths);
    }

    public CreateSharedBandwidthResponse createSharedBandwidth(CreateSharedBandwidthRequest request) {
        return hcClient.syncInvokeHttp(request, EipMeta.createSharedBandwidth);
    }

    public DeleteSharedBandwidthResponse deleteSharedBandwidth(DeleteSharedBandwidthRequest request) {
        return hcClient.syncInvokeHttp(request, EipMeta.deleteSharedBandwidth);
    }

    public ListBandwidthsResponse listBandwidths(ListBandwidthsRequest request) {
        return hcClient.syncInvokeHttp(request, EipMeta.listBandwidths);
    }

    public ListQuotasResponse listQuotas(ListQuotasRequest request) {
        return hcClient.syncInvokeHttp(request, EipMeta.listQuotas);
    }

    public RemovePublicipsFromSharedBandwidthResponse removePublicipsFromSharedBandwidth(RemovePublicipsFromSharedBandwidthRequest request) {
        return hcClient.syncInvokeHttp(request, EipMeta.removePublicipsFromSharedBandwidth);
    }

    public ShowBandwidthResponse showBandwidth(ShowBandwidthRequest request) {
        return hcClient.syncInvokeHttp(request, EipMeta.showBandwidth);
    }

    public UpdateBandwidthResponse updateBandwidth(UpdateBandwidthRequest request) {
        return hcClient.syncInvokeHttp(request, EipMeta.updateBandwidth);
    }

    public UpdatePrePaidBandwidthResponse updatePrePaidBandwidth(UpdatePrePaidBandwidthRequest request) {
        return hcClient.syncInvokeHttp(request, EipMeta.updatePrePaidBandwidth);
    }

    public BatchCreatePublicipTagsResponse batchCreatePublicipTags(BatchCreatePublicipTagsRequest request) {
        return hcClient.syncInvokeHttp(request, EipMeta.batchCreatePublicipTags);
    }

    public BatchDeletePublicipTagsResponse batchDeletePublicipTags(BatchDeletePublicipTagsRequest request) {
        return hcClient.syncInvokeHttp(request, EipMeta.batchDeletePublicipTags);
    }

    public CreatePrePaidPublicipResponse createPrePaidPublicip(CreatePrePaidPublicipRequest request) {
        return hcClient.syncInvokeHttp(request, EipMeta.createPrePaidPublicip);
    }

    public CreatePublicipResponse createPublicip(CreatePublicipRequest request) {
        return hcClient.syncInvokeHttp(request, EipMeta.createPublicip);
    }

    public CreatePublicipTagResponse createPublicipTag(CreatePublicipTagRequest request) {
        return hcClient.syncInvokeHttp(request, EipMeta.createPublicipTag);
    }

    public DeletePublicipResponse deletePublicip(DeletePublicipRequest request) {
        return hcClient.syncInvokeHttp(request, EipMeta.deletePublicip);
    }

    public DeletePublicipTagResponse deletePublicipTag(DeletePublicipTagRequest request) {
        return hcClient.syncInvokeHttp(request, EipMeta.deletePublicipTag);
    }

    public ListPublicipTagsResponse listPublicipTags(ListPublicipTagsRequest request) {
        return hcClient.syncInvokeHttp(request, EipMeta.listPublicipTags);
    }

    public ListPublicipsResponse listPublicips(ListPublicipsRequest request) {
        return hcClient.syncInvokeHttp(request, EipMeta.listPublicips);
    }

    public ListPublicipsByTagsResponse listPublicipsByTags(ListPublicipsByTagsRequest request) {
        return hcClient.syncInvokeHttp(request, EipMeta.listPublicipsByTags);
    }

    public ShowPublicipResponse showPublicip(ShowPublicipRequest request) {
        return hcClient.syncInvokeHttp(request, EipMeta.showPublicip);
    }

    public ShowPublicipTagsResponse showPublicipTags(ShowPublicipTagsRequest request) {
        return hcClient.syncInvokeHttp(request, EipMeta.showPublicipTags);
    }

    public UpdatePublicipResponse updatePublicip(UpdatePublicipRequest request) {
        return hcClient.syncInvokeHttp(request, EipMeta.updatePublicip);
    }

    public NeutronCreateFloatingIpResponse neutronCreateFloatingIp(NeutronCreateFloatingIpRequest request) {
        return hcClient.syncInvokeHttp(request, EipMeta.neutronCreateFloatingIp);
    }

    public NeutronDeleteFloatingIpResponse neutronDeleteFloatingIp(NeutronDeleteFloatingIpRequest request) {
        return hcClient.syncInvokeHttp(request, EipMeta.neutronDeleteFloatingIp);
    }

    public NeutronListFloatingIpsResponse neutronListFloatingIps(NeutronListFloatingIpsRequest request) {
        return hcClient.syncInvokeHttp(request, EipMeta.neutronListFloatingIps);
    }

    public NeutronShowFloatingIpResponse neutronShowFloatingIp(NeutronShowFloatingIpRequest request) {
        return hcClient.syncInvokeHttp(request, EipMeta.neutronShowFloatingIp);
    }

    public NeutronUpdateFloatingIpResponse neutronUpdateFloatingIp(NeutronUpdateFloatingIpRequest request) {
        return hcClient.syncInvokeHttp(request, EipMeta.neutronUpdateFloatingIp);
    }

}