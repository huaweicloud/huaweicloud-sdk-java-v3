package com.huaweicloud.sdk.elb.v3;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

import com.huaweicloud.sdk.elb.v3.model.*;

public class ElbAsyncClient {
    protected HcClient hcClient;

    public ElbAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<ElbAsyncClient> newBuilder() {
        return new ClientBuilder<>(ElbAsyncClient::new);
    }


    public CompletableFuture<CreateCertificateResponse> createCertificateAsync(CreateCertificateRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.createCertificate);
    }

    public CompletableFuture<CreateHealthMonitorResponse> createHealthMonitorAsync(CreateHealthMonitorRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.createHealthMonitor);
    }

    public CompletableFuture<CreateL7PolicyResponse> createL7PolicyAsync(CreateL7PolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.createL7Policy);
    }

    public CompletableFuture<CreateL7RuleResponse> createL7RuleAsync(CreateL7RuleRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.createL7Rule);
    }

    public CompletableFuture<CreateListenerResponse> createListenerAsync(CreateListenerRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.createListener);
    }

    public CompletableFuture<CreateLoadBalancerResponse> createLoadBalancerAsync(CreateLoadBalancerRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.createLoadBalancer);
    }

    public CompletableFuture<CreateMemberResponse> createMemberAsync(CreateMemberRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.createMember);
    }

    public CompletableFuture<CreatePoolResponse> createPoolAsync(CreatePoolRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.createPool);
    }

    public CompletableFuture<DeleteCertificateResponse> deleteCertificateAsync(DeleteCertificateRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.deleteCertificate);
    }

    public CompletableFuture<DeleteHealthMonitorResponse> deleteHealthMonitorAsync(DeleteHealthMonitorRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.deleteHealthMonitor);
    }

    public CompletableFuture<DeleteL7PolicyResponse> deleteL7PolicyAsync(DeleteL7PolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.deleteL7Policy);
    }

    public CompletableFuture<DeleteL7RuleResponse> deleteL7RuleAsync(DeleteL7RuleRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.deleteL7Rule);
    }

    public CompletableFuture<DeleteListenerResponse> deleteListenerAsync(DeleteListenerRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.deleteListener);
    }

    public CompletableFuture<DeleteLoadBalancerResponse> deleteLoadBalancerAsync(DeleteLoadBalancerRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.deleteLoadBalancer);
    }

    public CompletableFuture<DeleteMemberResponse> deleteMemberAsync(DeleteMemberRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.deleteMember);
    }

    public CompletableFuture<DeletePoolResponse> deletePoolAsync(DeletePoolRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.deletePool);
    }

    public CompletableFuture<ListAvailabilityZonesResponse> listAvailabilityZonesAsync(ListAvailabilityZonesRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.listAvailabilityZones);
    }

    public CompletableFuture<ListCertificatesResponse> listCertificatesAsync(ListCertificatesRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.listCertificates);
    }

    public CompletableFuture<ListFlavorsResponse> listFlavorsAsync(ListFlavorsRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.listFlavors);
    }

    public CompletableFuture<ListHealthMonitorsResponse> listHealthMonitorsAsync(ListHealthMonitorsRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.listHealthMonitors);
    }

    public CompletableFuture<ListL7PoliciesResponse> listL7PoliciesAsync(ListL7PoliciesRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.listL7Policies);
    }

    public CompletableFuture<ListL7RulesResponse> listL7RulesAsync(ListL7RulesRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.listL7Rules);
    }

    public CompletableFuture<ListListenersResponse> listListenersAsync(ListListenersRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.listListeners);
    }

    public CompletableFuture<ListLoadBalancersResponse> listLoadBalancersAsync(ListLoadBalancersRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.listLoadBalancers);
    }

    public CompletableFuture<ListMembersResponse> listMembersAsync(ListMembersRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.listMembers);
    }

    public CompletableFuture<ListPoolsResponse> listPoolsAsync(ListPoolsRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.listPools);
    }

    public CompletableFuture<ShowCertificateResponse> showCertificateAsync(ShowCertificateRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.showCertificate);
    }

    public CompletableFuture<ShowFlavorResponse> showFlavorAsync(ShowFlavorRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.showFlavor);
    }

    public CompletableFuture<ShowHealthMonitorResponse> showHealthMonitorAsync(ShowHealthMonitorRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.showHealthMonitor);
    }

    public CompletableFuture<ShowL7PolicyResponse> showL7PolicyAsync(ShowL7PolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.showL7Policy);
    }

    public CompletableFuture<ShowL7RuleResponse> showL7RuleAsync(ShowL7RuleRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.showL7Rule);
    }

    public CompletableFuture<ShowListenerResponse> showListenerAsync(ShowListenerRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.showListener);
    }

    public CompletableFuture<ShowLoadBalancerResponse> showLoadBalancerAsync(ShowLoadBalancerRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.showLoadBalancer);
    }

    public CompletableFuture<ShowLoadBalancerStatusResponse> showLoadBalancerStatusAsync(ShowLoadBalancerStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.showLoadBalancerStatus);
    }

    public CompletableFuture<ShowMemberResponse> showMemberAsync(ShowMemberRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.showMember);
    }

    public CompletableFuture<ShowPoolResponse> showPoolAsync(ShowPoolRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.showPool);
    }

    public CompletableFuture<ShowQuotaResponse> showQuotaAsync(ShowQuotaRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.showQuota);
    }

    public CompletableFuture<ShowQuotaDefaultsResponse> showQuotaDefaultsAsync(ShowQuotaDefaultsRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.showQuotaDefaults);
    }

    public CompletableFuture<UpdateCertificateResponse> updateCertificateAsync(UpdateCertificateRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.updateCertificate);
    }

    public CompletableFuture<UpdateHealthMonitorResponse> updateHealthMonitorAsync(UpdateHealthMonitorRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.updateHealthMonitor);
    }

    public CompletableFuture<UpdateL7PolicyResponse> updateL7PolicyAsync(UpdateL7PolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.updateL7Policy);
    }

    public CompletableFuture<UpdateL7RuleResponse> updateL7RuleAsync(UpdateL7RuleRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.updateL7Rule);
    }

    public CompletableFuture<UpdateListenerResponse> updateListenerAsync(UpdateListenerRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.updateListener);
    }

    public CompletableFuture<UpdateLoadBalancerResponse> updateLoadBalancerAsync(UpdateLoadBalancerRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.updateLoadBalancer);
    }

    public CompletableFuture<UpdateMemberResponse> updateMemberAsync(UpdateMemberRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.updateMember);
    }

    public CompletableFuture<UpdatePoolResponse> updatePoolAsync(UpdatePoolRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.updatePool);
    }

    public CompletableFuture<CountPreoccupyIpNumResponse> countPreoccupyIpNumAsync(CountPreoccupyIpNumRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.countPreoccupyIpNum);
    }

    public CompletableFuture<CreateIpGroupResponse> createIpGroupAsync(CreateIpGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.createIpGroup);
    }

    public CompletableFuture<DeleteIpGroupResponse> deleteIpGroupAsync(DeleteIpGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.deleteIpGroup);
    }

    public CompletableFuture<ListIpGroupsResponse> listIpGroupsAsync(ListIpGroupsRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.listIpGroups);
    }

    public CompletableFuture<ShowIpGroupResponse> showIpGroupAsync(ShowIpGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.showIpGroup);
    }

    public CompletableFuture<UpdateIpGroupResponse> updateIpGroupAsync(UpdateIpGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.updateIpGroup);
    }

}