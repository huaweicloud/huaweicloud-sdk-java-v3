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


    /**
     * 创建证书
     * 创建证书。
     *
     * @param CreateCertificateRequest 请求对象
     * @return CompletableFuture<CreateCertificateResponse>
     */
    public CompletableFuture<CreateCertificateResponse> createCertificateAsync(CreateCertificateRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.createCertificate);
    }

    /**
     * 创建健康检查
     * 创建健康检查。
     *
     * @param CreateHealthMonitorRequest 请求对象
     * @return CompletableFuture<CreateHealthMonitorResponse>
     */
    public CompletableFuture<CreateHealthMonitorResponse> createHealthMonitorAsync(CreateHealthMonitorRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.createHealthMonitor);
    }

    /**
     * 创建转发策略
     * 创建转发策略.
     *
     * @param CreateL7PolicyRequest 请求对象
     * @return CompletableFuture<CreateL7PolicyResponse>
     */
    public CompletableFuture<CreateL7PolicyResponse> createL7PolicyAsync(CreateL7PolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.createL7Policy);
    }

    /**
     * 创建转发规则
     * 创建转发规则。
     *
     * @param CreateL7RuleRequest 请求对象
     * @return CompletableFuture<CreateL7RuleResponse>
     */
    public CompletableFuture<CreateL7RuleResponse> createL7RuleAsync(CreateL7RuleRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.createL7Rule);
    }

    /**
     * 创建监听器
     * ElbV3 创建监听器。
     *
     * @param CreateListenerRequest 请求对象
     * @return CompletableFuture<CreateListenerResponse>
     */
    public CompletableFuture<CreateListenerResponse> createListenerAsync(CreateListenerRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.createListener);
    }

    /**
     * 创建负载均衡器
     * 创建负载均衡器。 1.创建公网负载均衡器的场合，需要传入vpc_id。 2.创建内网负载均衡器的场合，需要传入vip_subnet_cidr_id。 3.创建内网双栈负载均衡器的场合，需要传入ipv6_vip_virsubnet_id。  关联有已有公网ip地址，需要传入publicip_ids 新建公网ip地址，需要传入publicip 包括IPV4私网类型，IPV4公网类型，IPV6私网，IPV6公网
     *
     * @param CreateLoadBalancerRequest 请求对象
     * @return CompletableFuture<CreateLoadBalancerResponse>
     */
    public CompletableFuture<CreateLoadBalancerResponse> createLoadBalancerAsync(CreateLoadBalancerRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.createLoadBalancer);
    }

    /**
     * 创建后端服务器
     * 创建后端服务器。
     *
     * @param CreateMemberRequest 请求对象
     * @return CompletableFuture<CreateMemberResponse>
     */
    public CompletableFuture<CreateMemberResponse> createMemberAsync(CreateMemberRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.createMember);
    }

    /**
     * 创建后端服务器组
     * 创建后端服务器组。
     *
     * @param CreatePoolRequest 请求对象
     * @return CompletableFuture<CreatePoolResponse>
     */
    public CompletableFuture<CreatePoolResponse> createPoolAsync(CreatePoolRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.createPool);
    }

    /**
     * 删除证书
     * 删除SSL证书。
     *
     * @param DeleteCertificateRequest 请求对象
     * @return CompletableFuture<DeleteCertificateResponse>
     */
    public CompletableFuture<DeleteCertificateResponse> deleteCertificateAsync(DeleteCertificateRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.deleteCertificate);
    }

    /**
     * 删除健康检查
     * 删除健康检查。
     *
     * @param DeleteHealthMonitorRequest 请求对象
     * @return CompletableFuture<DeleteHealthMonitorResponse>
     */
    public CompletableFuture<DeleteHealthMonitorResponse> deleteHealthMonitorAsync(DeleteHealthMonitorRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.deleteHealthMonitor);
    }

    /**
     * 删除转发策略
     * 删除转发策略。
     *
     * @param DeleteL7PolicyRequest 请求对象
     * @return CompletableFuture<DeleteL7PolicyResponse>
     */
    public CompletableFuture<DeleteL7PolicyResponse> deleteL7PolicyAsync(DeleteL7PolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.deleteL7Policy);
    }

    /**
     * 删除转发规则
     * 删除转发规则。
     *
     * @param DeleteL7RuleRequest 请求对象
     * @return CompletableFuture<DeleteL7RuleResponse>
     */
    public CompletableFuture<DeleteL7RuleResponse> deleteL7RuleAsync(DeleteL7RuleRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.deleteL7Rule);
    }

    /**
     * 删除监听器
     * 删除监听器。
     *
     * @param DeleteListenerRequest 请求对象
     * @return CompletableFuture<DeleteListenerResponse>
     */
    public CompletableFuture<DeleteListenerResponse> deleteListenerAsync(DeleteListenerRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.deleteListener);
    }

    /**
     * 删除负载均衡器
     * 删除负载均衡器。
     *
     * @param DeleteLoadBalancerRequest 请求对象
     * @return CompletableFuture<DeleteLoadBalancerResponse>
     */
    public CompletableFuture<DeleteLoadBalancerResponse> deleteLoadBalancerAsync(DeleteLoadBalancerRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.deleteLoadBalancer);
    }

    /**
     * 删除后端服务器
     * 删除后端服务器。
     *
     * @param DeleteMemberRequest 请求对象
     * @return CompletableFuture<DeleteMemberResponse>
     */
    public CompletableFuture<DeleteMemberResponse> deleteMemberAsync(DeleteMemberRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.deleteMember);
    }

    /**
     * 删除后端服务器组
     * 删除后端服务器组。
     *
     * @param DeletePoolRequest 请求对象
     * @return CompletableFuture<DeletePoolResponse>
     */
    public CompletableFuture<DeletePoolResponse> deletePoolAsync(DeletePoolRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.deletePool);
    }

    /**
     * 查询可用区列表
     * 返回租户创建LB时可使用的可用区列表情况。  返回的数据类型是可用区集合的列表，比如列表 [ [az1,az2],  [az2, az3] ] ，有两个可用区集合。在创建负载均衡器时，可以选择创建在多个可用区，但所选的多个可用区必须同属于其中一个可用区集合，如可以选择 az2和az3，但不能选择 az1和az3。
     *
     * @param ListAvailabilityZonesRequest 请求对象
     * @return CompletableFuture<ListAvailabilityZonesResponse>
     */
    public CompletableFuture<ListAvailabilityZonesResponse> listAvailabilityZonesAsync(ListAvailabilityZonesRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.listAvailabilityZones);
    }

    /**
     * 证书列表
     * 查询SSL证书列表。
     *
     * @param ListCertificatesRequest 请求对象
     * @return CompletableFuture<ListCertificatesResponse>
     */
    public CompletableFuture<ListCertificatesResponse> listCertificatesAsync(ListCertificatesRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.listCertificates);
    }

    /**
     * 查询规格列表
     * 查询所有的规格。
     *
     * @param ListFlavorsRequest 请求对象
     * @return CompletableFuture<ListFlavorsResponse>
     */
    public CompletableFuture<ListFlavorsResponse> listFlavorsAsync(ListFlavorsRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.listFlavors);
    }

    /**
     * 查询健康检查列表
     * 健康检查列表。
     *
     * @param ListHealthMonitorsRequest 请求对象
     * @return CompletableFuture<ListHealthMonitorsResponse>
     */
    public CompletableFuture<ListHealthMonitorsResponse> listHealthMonitorsAsync(ListHealthMonitorsRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.listHealthMonitors);
    }

    /**
     * 查询转发策略列表
     * 查询转发策略列表。
     *
     * @param ListL7PoliciesRequest 请求对象
     * @return CompletableFuture<ListL7PoliciesResponse>
     */
    public CompletableFuture<ListL7PoliciesResponse> listL7PoliciesAsync(ListL7PoliciesRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.listL7Policies);
    }

    /**
     * 查询转发规则列表
     * 查询转发规则列表。
     *
     * @param ListL7RulesRequest 请求对象
     * @return CompletableFuture<ListL7RulesResponse>
     */
    public CompletableFuture<ListL7RulesResponse> listL7RulesAsync(ListL7RulesRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.listL7Rules);
    }

    /**
     * 查询监听器列表
     * 查询监听器列表。
     *
     * @param ListListenersRequest 请求对象
     * @return CompletableFuture<ListListenersResponse>
     */
    public CompletableFuture<ListListenersResponse> listListenersAsync(ListListenersRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.listListeners);
    }

    /**
     * 查询负载均衡器列表
     * 查询负载均衡器列表，支持过滤查询和分页查询
     *
     * @param ListLoadBalancersRequest 请求对象
     * @return CompletableFuture<ListLoadBalancersResponse>
     */
    public CompletableFuture<ListLoadBalancersResponse> listLoadBalancersAsync(ListLoadBalancersRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.listLoadBalancers);
    }

    /**
     * 后端服务器列表
     * Pool下的后端服务器列表。
     *
     * @param ListMembersRequest 请求对象
     * @return CompletableFuture<ListMembersResponse>
     */
    public CompletableFuture<ListMembersResponse> listMembersAsync(ListMembersRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.listMembers);
    }

    /**
     * 查询后端服务器组列表
     * 后端服务器组列表。
     *
     * @param ListPoolsRequest 请求对象
     * @return CompletableFuture<ListPoolsResponse>
     */
    public CompletableFuture<ListPoolsResponse> listPoolsAsync(ListPoolsRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.listPools);
    }

    /**
     * 证书详情
     * 查询SSL证书详情。
     *
     * @param ShowCertificateRequest 请求对象
     * @return CompletableFuture<ShowCertificateResponse>
     */
    public CompletableFuture<ShowCertificateResponse> showCertificateAsync(ShowCertificateRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.showCertificate);
    }

    /**
     * 查询规格详情
     * 查询规格的详情。
     *
     * @param ShowFlavorRequest 请求对象
     * @return CompletableFuture<ShowFlavorResponse>
     */
    public CompletableFuture<ShowFlavorResponse> showFlavorAsync(ShowFlavorRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.showFlavor);
    }

    /**
     * 查询健康检查详情
     * 查询健康检查详情。
     *
     * @param ShowHealthMonitorRequest 请求对象
     * @return CompletableFuture<ShowHealthMonitorResponse>
     */
    public CompletableFuture<ShowHealthMonitorResponse> showHealthMonitorAsync(ShowHealthMonitorRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.showHealthMonitor);
    }

    /**
     * 查询转发策略详情
     * 查询转发策略详情。
     *
     * @param ShowL7PolicyRequest 请求对象
     * @return CompletableFuture<ShowL7PolicyResponse>
     */
    public CompletableFuture<ShowL7PolicyResponse> showL7PolicyAsync(ShowL7PolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.showL7Policy);
    }

    /**
     * 查询转发规则详情
     * 查询转发规则详情
     *
     * @param ShowL7RuleRequest 请求对象
     * @return CompletableFuture<ShowL7RuleResponse>
     */
    public CompletableFuture<ShowL7RuleResponse> showL7RuleAsync(ShowL7RuleRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.showL7Rule);
    }

    /**
     * 查询监听器详情
     * 监听器详情。
     *
     * @param ShowListenerRequest 请求对象
     * @return CompletableFuture<ShowListenerResponse>
     */
    public CompletableFuture<ShowListenerResponse> showListenerAsync(ShowListenerRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.showListener);
    }

    /**
     * 查询负载均衡器详情
     * 查询负载均衡器详情
     *
     * @param ShowLoadBalancerRequest 请求对象
     * @return CompletableFuture<ShowLoadBalancerResponse>
     */
    public CompletableFuture<ShowLoadBalancerResponse> showLoadBalancerAsync(ShowLoadBalancerRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.showLoadBalancer);
    }

    /**
     * 查询负载均衡器状态树
     * 查询负载均衡器状态树，列出负载均衡器关联的子资源的信息
     *
     * @param ShowLoadBalancerStatusRequest 请求对象
     * @return CompletableFuture<ShowLoadBalancerStatusResponse>
     */
    public CompletableFuture<ShowLoadBalancerStatusResponse> showLoadBalancerStatusAsync(ShowLoadBalancerStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.showLoadBalancerStatus);
    }

    /**
     * 后端服务器详情
     * 后端服务器详情
     *
     * @param ShowMemberRequest 请求对象
     * @return CompletableFuture<ShowMemberResponse>
     */
    public CompletableFuture<ShowMemberResponse> showMemberAsync(ShowMemberRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.showMember);
    }

    /**
     * 查询后端服务器组详情
     * 后端服务器组详情。
     *
     * @param ShowPoolRequest 请求对象
     * @return CompletableFuture<ShowPoolResponse>
     */
    public CompletableFuture<ShowPoolResponse> showPoolAsync(ShowPoolRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.showPool);
    }

    /**
     * 查询配额详情
     * 【不开放】查询特定项目的配额数。
     *
     * @param ShowQuotaRequest 请求对象
     * @return CompletableFuture<ShowQuotaResponse>
     */
    public CompletableFuture<ShowQuotaResponse> showQuotaAsync(ShowQuotaRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.showQuota);
    }

    /**
     * 查询默认配额
     * 【不开放】查询默认配额数。
     *
     * @param ShowQuotaDefaultsRequest 请求对象
     * @return CompletableFuture<ShowQuotaDefaultsResponse>
     */
    public CompletableFuture<ShowQuotaDefaultsResponse> showQuotaDefaultsAsync(ShowQuotaDefaultsRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.showQuotaDefaults);
    }

    /**
     * 更新证书
     * 更新SSL证书。
     *
     * @param UpdateCertificateRequest 请求对象
     * @return CompletableFuture<UpdateCertificateResponse>
     */
    public CompletableFuture<UpdateCertificateResponse> updateCertificateAsync(UpdateCertificateRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.updateCertificate);
    }

    /**
     * 更新健康检查
     * 更新健康检查。
     *
     * @param UpdateHealthMonitorRequest 请求对象
     * @return CompletableFuture<UpdateHealthMonitorResponse>
     */
    public CompletableFuture<UpdateHealthMonitorResponse> updateHealthMonitorAsync(UpdateHealthMonitorRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.updateHealthMonitor);
    }

    /**
     * 更新转发策略
     * 更新转发策略。
     *
     * @param UpdateL7PolicyRequest 请求对象
     * @return CompletableFuture<UpdateL7PolicyResponse>
     */
    public CompletableFuture<UpdateL7PolicyResponse> updateL7PolicyAsync(UpdateL7PolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.updateL7Policy);
    }

    /**
     * 更新转发规则
     * 更新转发规则。
     *
     * @param UpdateL7RuleRequest 请求对象
     * @return CompletableFuture<UpdateL7RuleResponse>
     */
    public CompletableFuture<UpdateL7RuleResponse> updateL7RuleAsync(UpdateL7RuleRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.updateL7Rule);
    }

    /**
     * 更新监听器
     * 更新监听器。
     *
     * @param UpdateListenerRequest 请求对象
     * @return CompletableFuture<UpdateListenerResponse>
     */
    public CompletableFuture<UpdateListenerResponse> updateListenerAsync(UpdateListenerRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.updateListener);
    }

    /**
     * 更新负载均衡器
     * 更新负载均衡器。
     *
     * @param UpdateLoadBalancerRequest 请求对象
     * @return CompletableFuture<UpdateLoadBalancerResponse>
     */
    public CompletableFuture<UpdateLoadBalancerResponse> updateLoadBalancerAsync(UpdateLoadBalancerRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.updateLoadBalancer);
    }

    /**
     * 更新后端服务器
     * 如果member绑定的负载均衡器的provisioning status不是ACTIVE，则不能更新该member。
     *
     * @param UpdateMemberRequest 请求对象
     * @return CompletableFuture<UpdateMemberResponse>
     */
    public CompletableFuture<UpdateMemberResponse> updateMemberAsync(UpdateMemberRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.updateMember);
    }

    /**
     * 更新后端服务器组
     * 更新后端服务器组。
     *
     * @param UpdatePoolRequest 请求对象
     * @return CompletableFuture<UpdatePoolResponse>
     */
    public CompletableFuture<UpdatePoolResponse> updatePoolAsync(UpdatePoolRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.updatePool);
    }

    /**
     * 计算预占IP数
     * 计算创建一个负载均衡实例和第一个七层监听器需预占用的IP数
     *
     * @param CountPreoccupyIpNumRequest 请求对象
     * @return CompletableFuture<CountPreoccupyIpNumResponse>
     */
    public CompletableFuture<CountPreoccupyIpNumResponse> countPreoccupyIpNumAsync(CountPreoccupyIpNumRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.countPreoccupyIpNum);
    }

    /**
     * 创建IP地址组
     * 创建ip地址组
     *
     * @param CreateIpGroupRequest 请求对象
     * @return CompletableFuture<CreateIpGroupResponse>
     */
    public CompletableFuture<CreateIpGroupResponse> createIpGroupAsync(CreateIpGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.createIpGroup);
    }

    /**
     * 删除IP地址组
     * 删除ip地址组。
     *
     * @param DeleteIpGroupRequest 请求对象
     * @return CompletableFuture<DeleteIpGroupResponse>
     */
    public CompletableFuture<DeleteIpGroupResponse> deleteIpGroupAsync(DeleteIpGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.deleteIpGroup);
    }

    /**
     * 查询IP地址组列表
     * 查询IP地址组列表
     *
     * @param ListIpGroupsRequest 请求对象
     * @return CompletableFuture<ListIpGroupsResponse>
     */
    public CompletableFuture<ListIpGroupsResponse> listIpGroupsAsync(ListIpGroupsRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.listIpGroups);
    }

    /**
     * 查询IP地址组详情
     * 获取ip地址组详情
     *
     * @param ShowIpGroupRequest 请求对象
     * @return CompletableFuture<ShowIpGroupResponse>
     */
    public CompletableFuture<ShowIpGroupResponse> showIpGroupAsync(ShowIpGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.showIpGroup);
    }

    /**
     * 更新IP地址组
     * 更新ip地址组，只支持全量更新ip。
     *
     * @param UpdateIpGroupRequest 请求对象
     * @return CompletableFuture<UpdateIpGroupResponse>
     */
    public CompletableFuture<UpdateIpGroupResponse> updateIpGroupAsync(UpdateIpGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.updateIpGroup);
    }

}