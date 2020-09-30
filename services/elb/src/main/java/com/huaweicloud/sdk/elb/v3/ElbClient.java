package com.huaweicloud.sdk.elb.v3;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.elb.v3.model.*;

public class ElbClient {
    protected HcClient hcClient;

    public ElbClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<ElbClient> newBuilder() {
        return new ClientBuilder<>(ElbClient::new);
    }


    /**
     * 创建证书
     * 创建证书。
     *
     * @param CreateCertificateRequest 请求对象
     * @return CreateCertificateResponse
     */
    public CreateCertificateResponse createCertificate(CreateCertificateRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.createCertificate);
    }

    /**
     * 创建健康检查
     * 创建健康检查。
     *
     * @param CreateHealthMonitorRequest 请求对象
     * @return CreateHealthMonitorResponse
     */
    public CreateHealthMonitorResponse createHealthMonitor(CreateHealthMonitorRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.createHealthMonitor);
    }

    /**
     * 创建转发策略
     * 创建转发策略.
     *
     * @param CreateL7PolicyRequest 请求对象
     * @return CreateL7PolicyResponse
     */
    public CreateL7PolicyResponse createL7Policy(CreateL7PolicyRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.createL7Policy);
    }

    /**
     * 创建转发规则
     * 创建转发规则。
     *
     * @param CreateL7RuleRequest 请求对象
     * @return CreateL7RuleResponse
     */
    public CreateL7RuleResponse createL7Rule(CreateL7RuleRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.createL7Rule);
    }

    /**
     * 创建监听器
     * ElbV3 创建监听器。
     *
     * @param CreateListenerRequest 请求对象
     * @return CreateListenerResponse
     */
    public CreateListenerResponse createListener(CreateListenerRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.createListener);
    }

    /**
     * 创建负载均衡器
     * 创建负载均衡器。 1.创建公网负载均衡器的场合，需要传入vpc_id。 2.创建内网负载均衡器的场合，需要传入vip_subnet_cidr_id。 3.创建内网双栈负载均衡器的场合，需要传入ipv6_vip_virsubnet_id。  关联有已有公网ip地址，需要传入publicip_ids 新建公网ip地址，需要传入publicip 包括IPV4私网类型，IPV4公网类型，IPV6私网，IPV6公网
     *
     * @param CreateLoadBalancerRequest 请求对象
     * @return CreateLoadBalancerResponse
     */
    public CreateLoadBalancerResponse createLoadBalancer(CreateLoadBalancerRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.createLoadBalancer);
    }

    /**
     * 创建后端服务器
     * 创建后端服务器。
     *
     * @param CreateMemberRequest 请求对象
     * @return CreateMemberResponse
     */
    public CreateMemberResponse createMember(CreateMemberRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.createMember);
    }

    /**
     * 创建后端服务器组
     * 创建后端服务器组。
     *
     * @param CreatePoolRequest 请求对象
     * @return CreatePoolResponse
     */
    public CreatePoolResponse createPool(CreatePoolRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.createPool);
    }

    /**
     * 删除证书
     * 删除SSL证书。
     *
     * @param DeleteCertificateRequest 请求对象
     * @return DeleteCertificateResponse
     */
    public DeleteCertificateResponse deleteCertificate(DeleteCertificateRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.deleteCertificate);
    }

    /**
     * 删除健康检查
     * 删除健康检查。
     *
     * @param DeleteHealthMonitorRequest 请求对象
     * @return DeleteHealthMonitorResponse
     */
    public DeleteHealthMonitorResponse deleteHealthMonitor(DeleteHealthMonitorRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.deleteHealthMonitor);
    }

    /**
     * 删除转发策略
     * 删除转发策略。
     *
     * @param DeleteL7PolicyRequest 请求对象
     * @return DeleteL7PolicyResponse
     */
    public DeleteL7PolicyResponse deleteL7Policy(DeleteL7PolicyRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.deleteL7Policy);
    }

    /**
     * 删除转发规则
     * 删除转发规则。
     *
     * @param DeleteL7RuleRequest 请求对象
     * @return DeleteL7RuleResponse
     */
    public DeleteL7RuleResponse deleteL7Rule(DeleteL7RuleRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.deleteL7Rule);
    }

    /**
     * 删除监听器
     * 删除监听器。
     *
     * @param DeleteListenerRequest 请求对象
     * @return DeleteListenerResponse
     */
    public DeleteListenerResponse deleteListener(DeleteListenerRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.deleteListener);
    }

    /**
     * 删除负载均衡器
     * 删除负载均衡器。
     *
     * @param DeleteLoadBalancerRequest 请求对象
     * @return DeleteLoadBalancerResponse
     */
    public DeleteLoadBalancerResponse deleteLoadBalancer(DeleteLoadBalancerRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.deleteLoadBalancer);
    }

    /**
     * 删除后端服务器
     * 删除后端服务器。
     *
     * @param DeleteMemberRequest 请求对象
     * @return DeleteMemberResponse
     */
    public DeleteMemberResponse deleteMember(DeleteMemberRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.deleteMember);
    }

    /**
     * 删除后端服务器组
     * 删除后端服务器组。
     *
     * @param DeletePoolRequest 请求对象
     * @return DeletePoolResponse
     */
    public DeletePoolResponse deletePool(DeletePoolRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.deletePool);
    }

    /**
     * 查询创建LB可用的可用区
     * 返回用户可使用的可用区的列表情况
     *
     * @param ListAvailabilityZonesRequest 请求对象
     * @return ListAvailabilityZonesResponse
     */
    public ListAvailabilityZonesResponse listAvailabilityZones(ListAvailabilityZonesRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.listAvailabilityZones);
    }

    /**
     * 证书列表
     * 查询SSL证书列表。
     *
     * @param ListCertificatesRequest 请求对象
     * @return ListCertificatesResponse
     */
    public ListCertificatesResponse listCertificates(ListCertificatesRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.listCertificates);
    }

    /**
     * 查询规格列表
     * 查询所有的规格。
     *
     * @param ListFlavorsRequest 请求对象
     * @return ListFlavorsResponse
     */
    public ListFlavorsResponse listFlavors(ListFlavorsRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.listFlavors);
    }

    /**
     * 查询健康检查列表
     * 健康检查列表。
     *
     * @param ListHealthMonitorsRequest 请求对象
     * @return ListHealthMonitorsResponse
     */
    public ListHealthMonitorsResponse listHealthMonitors(ListHealthMonitorsRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.listHealthMonitors);
    }

    /**
     * 查询转发策略列表
     * 查询转发策略列表。
     *
     * @param ListL7PoliciesRequest 请求对象
     * @return ListL7PoliciesResponse
     */
    public ListL7PoliciesResponse listL7Policies(ListL7PoliciesRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.listL7Policies);
    }

    /**
     * 查询转发规则列表
     * 查询转发规则列表。
     *
     * @param ListL7RulesRequest 请求对象
     * @return ListL7RulesResponse
     */
    public ListL7RulesResponse listL7Rules(ListL7RulesRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.listL7Rules);
    }

    /**
     * 查询监听器列表
     * 查询监听器列表。
     *
     * @param ListListenersRequest 请求对象
     * @return ListListenersResponse
     */
    public ListListenersResponse listListeners(ListListenersRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.listListeners);
    }

    /**
     * 查询负载均衡器列表
     * 查询负载均衡器列表，支持过滤查询和分页查询
     *
     * @param ListLoadBalancersRequest 请求对象
     * @return ListLoadBalancersResponse
     */
    public ListLoadBalancersResponse listLoadBalancers(ListLoadBalancersRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.listLoadBalancers);
    }

    /**
     * 后端服务器列表
     * Pool下的后端服务器列表。
     *
     * @param ListMembersRequest 请求对象
     * @return ListMembersResponse
     */
    public ListMembersResponse listMembers(ListMembersRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.listMembers);
    }

    /**
     * 查询后端服务器组列表
     * 后端服务器组列表。
     *
     * @param ListPoolsRequest 请求对象
     * @return ListPoolsResponse
     */
    public ListPoolsResponse listPools(ListPoolsRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.listPools);
    }

    /**
     * 证书详情
     * 查询SSL证书详情。
     *
     * @param ShowCertificateRequest 请求对象
     * @return ShowCertificateResponse
     */
    public ShowCertificateResponse showCertificate(ShowCertificateRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.showCertificate);
    }

    /**
     * 查询规格详情
     * 查询规格的详情。
     *
     * @param ShowFlavorRequest 请求对象
     * @return ShowFlavorResponse
     */
    public ShowFlavorResponse showFlavor(ShowFlavorRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.showFlavor);
    }

    /**
     * 查询健康检查详情
     * 查询健康检查详情。
     *
     * @param ShowHealthMonitorRequest 请求对象
     * @return ShowHealthMonitorResponse
     */
    public ShowHealthMonitorResponse showHealthMonitor(ShowHealthMonitorRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.showHealthMonitor);
    }

    /**
     * 查询转发策略详情
     * 查询转发策略详情。
     *
     * @param ShowL7PolicyRequest 请求对象
     * @return ShowL7PolicyResponse
     */
    public ShowL7PolicyResponse showL7Policy(ShowL7PolicyRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.showL7Policy);
    }

    /**
     * 查询转发规则详情
     * 查询转发规则详情
     *
     * @param ShowL7RuleRequest 请求对象
     * @return ShowL7RuleResponse
     */
    public ShowL7RuleResponse showL7Rule(ShowL7RuleRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.showL7Rule);
    }

    /**
     * 查询监听器详情
     * 监听器详情。
     *
     * @param ShowListenerRequest 请求对象
     * @return ShowListenerResponse
     */
    public ShowListenerResponse showListener(ShowListenerRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.showListener);
    }

    /**
     * 查询负载均衡器详情
     * 查询负载均衡器详情
     *
     * @param ShowLoadBalancerRequest 请求对象
     * @return ShowLoadBalancerResponse
     */
    public ShowLoadBalancerResponse showLoadBalancer(ShowLoadBalancerRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.showLoadBalancer);
    }

    /**
     * 查询负载均衡器状态树
     * 查询负载均衡器状态树，列出负载均衡器关联的子资源的信息
     *
     * @param ShowLoadBalancerStatusRequest 请求对象
     * @return ShowLoadBalancerStatusResponse
     */
    public ShowLoadBalancerStatusResponse showLoadBalancerStatus(ShowLoadBalancerStatusRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.showLoadBalancerStatus);
    }

    /**
     * 后端服务器详情
     * 后端服务器详情
     *
     * @param ShowMemberRequest 请求对象
     * @return ShowMemberResponse
     */
    public ShowMemberResponse showMember(ShowMemberRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.showMember);
    }

    /**
     * 查询后端服务器组详情
     * 后端服务器组详情。
     *
     * @param ShowPoolRequest 请求对象
     * @return ShowPoolResponse
     */
    public ShowPoolResponse showPool(ShowPoolRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.showPool);
    }

    /**
     * 查询配额详情
     * 【不开放】查询特定项目的配额数。
     *
     * @param ShowQuotaRequest 请求对象
     * @return ShowQuotaResponse
     */
    public ShowQuotaResponse showQuota(ShowQuotaRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.showQuota);
    }

    /**
     * 查询默认配额
     * 【不开放】查询默认配额数。
     *
     * @param ShowQuotaDefaultsRequest 请求对象
     * @return ShowQuotaDefaultsResponse
     */
    public ShowQuotaDefaultsResponse showQuotaDefaults(ShowQuotaDefaultsRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.showQuotaDefaults);
    }

    /**
     * 更新证书
     * 更新SSL证书。
     *
     * @param UpdateCertificateRequest 请求对象
     * @return UpdateCertificateResponse
     */
    public UpdateCertificateResponse updateCertificate(UpdateCertificateRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.updateCertificate);
    }

    /**
     * 更新健康检查
     * 更新健康检查。
     *
     * @param UpdateHealthMonitorRequest 请求对象
     * @return UpdateHealthMonitorResponse
     */
    public UpdateHealthMonitorResponse updateHealthMonitor(UpdateHealthMonitorRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.updateHealthMonitor);
    }

    /**
     * 更新转发策略
     * 更新转发策略。
     *
     * @param UpdateL7PolicyRequest 请求对象
     * @return UpdateL7PolicyResponse
     */
    public UpdateL7PolicyResponse updateL7Policy(UpdateL7PolicyRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.updateL7Policy);
    }

    /**
     * 更新转发规则
     * 更新转发规则。
     *
     * @param UpdateL7RuleRequest 请求对象
     * @return UpdateL7RuleResponse
     */
    public UpdateL7RuleResponse updateL7Rule(UpdateL7RuleRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.updateL7Rule);
    }

    /**
     * 更新监听器
     * 更新监听器。
     *
     * @param UpdateListenerRequest 请求对象
     * @return UpdateListenerResponse
     */
    public UpdateListenerResponse updateListener(UpdateListenerRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.updateListener);
    }

    /**
     * 更新负载均衡器
     * 更新负载均衡器。
     *
     * @param UpdateLoadBalancerRequest 请求对象
     * @return UpdateLoadBalancerResponse
     */
    public UpdateLoadBalancerResponse updateLoadBalancer(UpdateLoadBalancerRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.updateLoadBalancer);
    }

    /**
     * 更新后端服务器
     * 如果member绑定的负载均衡器的provisioning status不是ACTIVE，则不能更新该member。
     *
     * @param UpdateMemberRequest 请求对象
     * @return UpdateMemberResponse
     */
    public UpdateMemberResponse updateMember(UpdateMemberRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.updateMember);
    }

    /**
     * 更新后端服务器组
     * 更新后端服务器组。
     *
     * @param UpdatePoolRequest 请求对象
     * @return UpdatePoolResponse
     */
    public UpdatePoolResponse updatePool(UpdatePoolRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.updatePool);
    }

    /**
     * 计算预占IP数
     * 计算创建一个负载均衡实例和第一个七层监听器需预占用的IP数
     *
     * @param CountPreoccupyIpNumRequest 请求对象
     * @return CountPreoccupyIpNumResponse
     */
    public CountPreoccupyIpNumResponse countPreoccupyIpNum(CountPreoccupyIpNumRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.countPreoccupyIpNum);
    }

    /**
     * 创建IP地址组
     * 创建ip地址组
     *
     * @param CreateIpGroupRequest 请求对象
     * @return CreateIpGroupResponse
     */
    public CreateIpGroupResponse createIpGroup(CreateIpGroupRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.createIpGroup);
    }

    /**
     * 删除IP地址组
     * 删除ip地址组。
     *
     * @param DeleteIpGroupRequest 请求对象
     * @return DeleteIpGroupResponse
     */
    public DeleteIpGroupResponse deleteIpGroup(DeleteIpGroupRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.deleteIpGroup);
    }

    /**
     * 查询IP地址组列表
     * 查询IP地址组列表
     *
     * @param ListIpGroupsRequest 请求对象
     * @return ListIpGroupsResponse
     */
    public ListIpGroupsResponse listIpGroups(ListIpGroupsRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.listIpGroups);
    }

    /**
     * 查询IP地址组详情
     * 获取ip地址组详情
     *
     * @param ShowIpGroupRequest 请求对象
     * @return ShowIpGroupResponse
     */
    public ShowIpGroupResponse showIpGroup(ShowIpGroupRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.showIpGroup);
    }

    /**
     * 更新IP地址组
     * 更新ip地址组，只支持全量更新ip。
     *
     * @param UpdateIpGroupRequest 请求对象
     * @return UpdateIpGroupResponse
     */
    public UpdateIpGroupResponse updateIpGroup(UpdateIpGroupRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.updateIpGroup);
    }

}