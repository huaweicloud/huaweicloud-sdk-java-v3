package com.huaweicloud.sdk.elb.v3;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
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
     * 创建证书
     * 创建证书。
     *
     * @param CreateCertificateRequest 请求对象
     * @return SyncInvoker<CreateCertificateRequest, CreateCertificateResponse>
     */
    public SyncInvoker<CreateCertificateRequest, CreateCertificateResponse> createCertificateInvoker(CreateCertificateRequest request) {
        return new SyncInvoker<CreateCertificateRequest, CreateCertificateResponse>(request, ElbMeta.createCertificate, hcClient);
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
     * 创建健康检查
     * 创建健康检查。
     *
     * @param CreateHealthMonitorRequest 请求对象
     * @return SyncInvoker<CreateHealthMonitorRequest, CreateHealthMonitorResponse>
     */
    public SyncInvoker<CreateHealthMonitorRequest, CreateHealthMonitorResponse> createHealthMonitorInvoker(CreateHealthMonitorRequest request) {
        return new SyncInvoker<CreateHealthMonitorRequest, CreateHealthMonitorResponse>(request, ElbMeta.createHealthMonitor, hcClient);
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
     * 创建转发策略
     * 创建转发策略.
     *
     * @param CreateL7PolicyRequest 请求对象
     * @return SyncInvoker<CreateL7PolicyRequest, CreateL7PolicyResponse>
     */
    public SyncInvoker<CreateL7PolicyRequest, CreateL7PolicyResponse> createL7PolicyInvoker(CreateL7PolicyRequest request) {
        return new SyncInvoker<CreateL7PolicyRequest, CreateL7PolicyResponse>(request, ElbMeta.createL7Policy, hcClient);
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
     * 创建转发规则
     * 创建转发规则。
     *
     * @param CreateL7RuleRequest 请求对象
     * @return SyncInvoker<CreateL7RuleRequest, CreateL7RuleResponse>
     */
    public SyncInvoker<CreateL7RuleRequest, CreateL7RuleResponse> createL7RuleInvoker(CreateL7RuleRequest request) {
        return new SyncInvoker<CreateL7RuleRequest, CreateL7RuleResponse>(request, ElbMeta.createL7Rule, hcClient);
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
     * 创建监听器
     * ElbV3 创建监听器。
     *
     * @param CreateListenerRequest 请求对象
     * @return SyncInvoker<CreateListenerRequest, CreateListenerResponse>
     */
    public SyncInvoker<CreateListenerRequest, CreateListenerResponse> createListenerInvoker(CreateListenerRequest request) {
        return new SyncInvoker<CreateListenerRequest, CreateListenerResponse>(request, ElbMeta.createListener, hcClient);
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
     * 创建负载均衡器
     * 创建负载均衡器。 1.创建公网负载均衡器的场合，需要传入vpc_id。 2.创建内网负载均衡器的场合，需要传入vip_subnet_cidr_id。 3.创建内网双栈负载均衡器的场合，需要传入ipv6_vip_virsubnet_id。  关联有已有公网ip地址，需要传入publicip_ids 新建公网ip地址，需要传入publicip 包括IPV4私网类型，IPV4公网类型，IPV6私网，IPV6公网
     *
     * @param CreateLoadBalancerRequest 请求对象
     * @return SyncInvoker<CreateLoadBalancerRequest, CreateLoadBalancerResponse>
     */
    public SyncInvoker<CreateLoadBalancerRequest, CreateLoadBalancerResponse> createLoadBalancerInvoker(CreateLoadBalancerRequest request) {
        return new SyncInvoker<CreateLoadBalancerRequest, CreateLoadBalancerResponse>(request, ElbMeta.createLoadBalancer, hcClient);
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
     * 创建后端服务器
     * 创建后端服务器。
     *
     * @param CreateMemberRequest 请求对象
     * @return SyncInvoker<CreateMemberRequest, CreateMemberResponse>
     */
    public SyncInvoker<CreateMemberRequest, CreateMemberResponse> createMemberInvoker(CreateMemberRequest request) {
        return new SyncInvoker<CreateMemberRequest, CreateMemberResponse>(request, ElbMeta.createMember, hcClient);
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
     * 创建后端服务器组
     * 创建后端服务器组。
     *
     * @param CreatePoolRequest 请求对象
     * @return SyncInvoker<CreatePoolRequest, CreatePoolResponse>
     */
    public SyncInvoker<CreatePoolRequest, CreatePoolResponse> createPoolInvoker(CreatePoolRequest request) {
        return new SyncInvoker<CreatePoolRequest, CreatePoolResponse>(request, ElbMeta.createPool, hcClient);
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
     * 删除证书
     * 删除SSL证书。
     *
     * @param DeleteCertificateRequest 请求对象
     * @return SyncInvoker<DeleteCertificateRequest, DeleteCertificateResponse>
     */
    public SyncInvoker<DeleteCertificateRequest, DeleteCertificateResponse> deleteCertificateInvoker(DeleteCertificateRequest request) {
        return new SyncInvoker<DeleteCertificateRequest, DeleteCertificateResponse>(request, ElbMeta.deleteCertificate, hcClient);
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
     * 删除健康检查
     * 删除健康检查。
     *
     * @param DeleteHealthMonitorRequest 请求对象
     * @return SyncInvoker<DeleteHealthMonitorRequest, DeleteHealthMonitorResponse>
     */
    public SyncInvoker<DeleteHealthMonitorRequest, DeleteHealthMonitorResponse> deleteHealthMonitorInvoker(DeleteHealthMonitorRequest request) {
        return new SyncInvoker<DeleteHealthMonitorRequest, DeleteHealthMonitorResponse>(request, ElbMeta.deleteHealthMonitor, hcClient);
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
     * 删除转发策略
     * 删除转发策略。
     *
     * @param DeleteL7PolicyRequest 请求对象
     * @return SyncInvoker<DeleteL7PolicyRequest, DeleteL7PolicyResponse>
     */
    public SyncInvoker<DeleteL7PolicyRequest, DeleteL7PolicyResponse> deleteL7PolicyInvoker(DeleteL7PolicyRequest request) {
        return new SyncInvoker<DeleteL7PolicyRequest, DeleteL7PolicyResponse>(request, ElbMeta.deleteL7Policy, hcClient);
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
     * 删除转发规则
     * 删除转发规则。
     *
     * @param DeleteL7RuleRequest 请求对象
     * @return SyncInvoker<DeleteL7RuleRequest, DeleteL7RuleResponse>
     */
    public SyncInvoker<DeleteL7RuleRequest, DeleteL7RuleResponse> deleteL7RuleInvoker(DeleteL7RuleRequest request) {
        return new SyncInvoker<DeleteL7RuleRequest, DeleteL7RuleResponse>(request, ElbMeta.deleteL7Rule, hcClient);
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
     * 删除监听器
     * 删除监听器。
     *
     * @param DeleteListenerRequest 请求对象
     * @return SyncInvoker<DeleteListenerRequest, DeleteListenerResponse>
     */
    public SyncInvoker<DeleteListenerRequest, DeleteListenerResponse> deleteListenerInvoker(DeleteListenerRequest request) {
        return new SyncInvoker<DeleteListenerRequest, DeleteListenerResponse>(request, ElbMeta.deleteListener, hcClient);
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
     * 删除负载均衡器
     * 删除负载均衡器。
     *
     * @param DeleteLoadBalancerRequest 请求对象
     * @return SyncInvoker<DeleteLoadBalancerRequest, DeleteLoadBalancerResponse>
     */
    public SyncInvoker<DeleteLoadBalancerRequest, DeleteLoadBalancerResponse> deleteLoadBalancerInvoker(DeleteLoadBalancerRequest request) {
        return new SyncInvoker<DeleteLoadBalancerRequest, DeleteLoadBalancerResponse>(request, ElbMeta.deleteLoadBalancer, hcClient);
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
     * 删除后端服务器
     * 删除后端服务器。
     *
     * @param DeleteMemberRequest 请求对象
     * @return SyncInvoker<DeleteMemberRequest, DeleteMemberResponse>
     */
    public SyncInvoker<DeleteMemberRequest, DeleteMemberResponse> deleteMemberInvoker(DeleteMemberRequest request) {
        return new SyncInvoker<DeleteMemberRequest, DeleteMemberResponse>(request, ElbMeta.deleteMember, hcClient);
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
     * 删除后端服务器组
     * 删除后端服务器组。
     *
     * @param DeletePoolRequest 请求对象
     * @return SyncInvoker<DeletePoolRequest, DeletePoolResponse>
     */
    public SyncInvoker<DeletePoolRequest, DeletePoolResponse> deletePoolInvoker(DeletePoolRequest request) {
        return new SyncInvoker<DeletePoolRequest, DeletePoolResponse>(request, ElbMeta.deletePool, hcClient);
    }

    /**
     * 后端服务器全局列表
     * 查询当前租户下的后端服务器列表。
     *
     * @param ListAllMembersRequest 请求对象
     * @return ListAllMembersResponse
     */
    public ListAllMembersResponse listAllMembers(ListAllMembersRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.listAllMembers);
    }

    /**
     * 后端服务器全局列表
     * 查询当前租户下的后端服务器列表。
     *
     * @param ListAllMembersRequest 请求对象
     * @return SyncInvoker<ListAllMembersRequest, ListAllMembersResponse>
     */
    public SyncInvoker<ListAllMembersRequest, ListAllMembersResponse> listAllMembersInvoker(ListAllMembersRequest request) {
        return new SyncInvoker<ListAllMembersRequest, ListAllMembersResponse>(request, ElbMeta.listAllMembers, hcClient);
    }

    /**
     * 查询可用区列表
     * 返回租户创建LB时可使用的可用区列表情况。  返回的数据类型是可用区集合的列表，比如列表 [ [az1,az2],  [az2, az3] ] ，有两个可用区集合。在创建负载均衡器时，可以选择创建在多个可用区，但所选的多个可用区必须同属于其中一个可用区集合，如可以选择 az2和az3，但不能选择 az1和az3。
     *
     * @param ListAvailabilityZonesRequest 请求对象
     * @return ListAvailabilityZonesResponse
     */
    public ListAvailabilityZonesResponse listAvailabilityZones(ListAvailabilityZonesRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.listAvailabilityZones);
    }

    /**
     * 查询可用区列表
     * 返回租户创建LB时可使用的可用区列表情况。  返回的数据类型是可用区集合的列表，比如列表 [ [az1,az2],  [az2, az3] ] ，有两个可用区集合。在创建负载均衡器时，可以选择创建在多个可用区，但所选的多个可用区必须同属于其中一个可用区集合，如可以选择 az2和az3，但不能选择 az1和az3。
     *
     * @param ListAvailabilityZonesRequest 请求对象
     * @return SyncInvoker<ListAvailabilityZonesRequest, ListAvailabilityZonesResponse>
     */
    public SyncInvoker<ListAvailabilityZonesRequest, ListAvailabilityZonesResponse> listAvailabilityZonesInvoker(ListAvailabilityZonesRequest request) {
        return new SyncInvoker<ListAvailabilityZonesRequest, ListAvailabilityZonesResponse>(request, ElbMeta.listAvailabilityZones, hcClient);
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
     * 证书列表
     * 查询SSL证书列表。
     *
     * @param ListCertificatesRequest 请求对象
     * @return SyncInvoker<ListCertificatesRequest, ListCertificatesResponse>
     */
    public SyncInvoker<ListCertificatesRequest, ListCertificatesResponse> listCertificatesInvoker(ListCertificatesRequest request) {
        return new SyncInvoker<ListCertificatesRequest, ListCertificatesResponse>(request, ElbMeta.listCertificates, hcClient);
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
     * 查询规格列表
     * 查询所有的规格。
     *
     * @param ListFlavorsRequest 请求对象
     * @return SyncInvoker<ListFlavorsRequest, ListFlavorsResponse>
     */
    public SyncInvoker<ListFlavorsRequest, ListFlavorsResponse> listFlavorsInvoker(ListFlavorsRequest request) {
        return new SyncInvoker<ListFlavorsRequest, ListFlavorsResponse>(request, ElbMeta.listFlavors, hcClient);
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
     * 查询健康检查列表
     * 健康检查列表。
     *
     * @param ListHealthMonitorsRequest 请求对象
     * @return SyncInvoker<ListHealthMonitorsRequest, ListHealthMonitorsResponse>
     */
    public SyncInvoker<ListHealthMonitorsRequest, ListHealthMonitorsResponse> listHealthMonitorsInvoker(ListHealthMonitorsRequest request) {
        return new SyncInvoker<ListHealthMonitorsRequest, ListHealthMonitorsResponse>(request, ElbMeta.listHealthMonitors, hcClient);
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
     * 查询转发策略列表
     * 查询转发策略列表。
     *
     * @param ListL7PoliciesRequest 请求对象
     * @return SyncInvoker<ListL7PoliciesRequest, ListL7PoliciesResponse>
     */
    public SyncInvoker<ListL7PoliciesRequest, ListL7PoliciesResponse> listL7PoliciesInvoker(ListL7PoliciesRequest request) {
        return new SyncInvoker<ListL7PoliciesRequest, ListL7PoliciesResponse>(request, ElbMeta.listL7Policies, hcClient);
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
     * 查询转发规则列表
     * 查询转发规则列表。
     *
     * @param ListL7RulesRequest 请求对象
     * @return SyncInvoker<ListL7RulesRequest, ListL7RulesResponse>
     */
    public SyncInvoker<ListL7RulesRequest, ListL7RulesResponse> listL7RulesInvoker(ListL7RulesRequest request) {
        return new SyncInvoker<ListL7RulesRequest, ListL7RulesResponse>(request, ElbMeta.listL7Rules, hcClient);
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
     * 查询监听器列表
     * 查询监听器列表。
     *
     * @param ListListenersRequest 请求对象
     * @return SyncInvoker<ListListenersRequest, ListListenersResponse>
     */
    public SyncInvoker<ListListenersRequest, ListListenersResponse> listListenersInvoker(ListListenersRequest request) {
        return new SyncInvoker<ListListenersRequest, ListListenersResponse>(request, ElbMeta.listListeners, hcClient);
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
     * 查询负载均衡器列表
     * 查询负载均衡器列表，支持过滤查询和分页查询
     *
     * @param ListLoadBalancersRequest 请求对象
     * @return SyncInvoker<ListLoadBalancersRequest, ListLoadBalancersResponse>
     */
    public SyncInvoker<ListLoadBalancersRequest, ListLoadBalancersResponse> listLoadBalancersInvoker(ListLoadBalancersRequest request) {
        return new SyncInvoker<ListLoadBalancersRequest, ListLoadBalancersResponse>(request, ElbMeta.listLoadBalancers, hcClient);
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
     * 后端服务器列表
     * Pool下的后端服务器列表。
     *
     * @param ListMembersRequest 请求对象
     * @return SyncInvoker<ListMembersRequest, ListMembersResponse>
     */
    public SyncInvoker<ListMembersRequest, ListMembersResponse> listMembersInvoker(ListMembersRequest request) {
        return new SyncInvoker<ListMembersRequest, ListMembersResponse>(request, ElbMeta.listMembers, hcClient);
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
     * 查询后端服务器组列表
     * 后端服务器组列表。
     *
     * @param ListPoolsRequest 请求对象
     * @return SyncInvoker<ListPoolsRequest, ListPoolsResponse>
     */
    public SyncInvoker<ListPoolsRequest, ListPoolsResponse> listPoolsInvoker(ListPoolsRequest request) {
        return new SyncInvoker<ListPoolsRequest, ListPoolsResponse>(request, ElbMeta.listPools, hcClient);
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
     * 证书详情
     * 查询SSL证书详情。
     *
     * @param ShowCertificateRequest 请求对象
     * @return SyncInvoker<ShowCertificateRequest, ShowCertificateResponse>
     */
    public SyncInvoker<ShowCertificateRequest, ShowCertificateResponse> showCertificateInvoker(ShowCertificateRequest request) {
        return new SyncInvoker<ShowCertificateRequest, ShowCertificateResponse>(request, ElbMeta.showCertificate, hcClient);
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
     * 查询规格详情
     * 查询规格的详情。
     *
     * @param ShowFlavorRequest 请求对象
     * @return SyncInvoker<ShowFlavorRequest, ShowFlavorResponse>
     */
    public SyncInvoker<ShowFlavorRequest, ShowFlavorResponse> showFlavorInvoker(ShowFlavorRequest request) {
        return new SyncInvoker<ShowFlavorRequest, ShowFlavorResponse>(request, ElbMeta.showFlavor, hcClient);
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
     * 查询健康检查详情
     * 查询健康检查详情。
     *
     * @param ShowHealthMonitorRequest 请求对象
     * @return SyncInvoker<ShowHealthMonitorRequest, ShowHealthMonitorResponse>
     */
    public SyncInvoker<ShowHealthMonitorRequest, ShowHealthMonitorResponse> showHealthMonitorInvoker(ShowHealthMonitorRequest request) {
        return new SyncInvoker<ShowHealthMonitorRequest, ShowHealthMonitorResponse>(request, ElbMeta.showHealthMonitor, hcClient);
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
     * 查询转发策略详情
     * 查询转发策略详情。
     *
     * @param ShowL7PolicyRequest 请求对象
     * @return SyncInvoker<ShowL7PolicyRequest, ShowL7PolicyResponse>
     */
    public SyncInvoker<ShowL7PolicyRequest, ShowL7PolicyResponse> showL7PolicyInvoker(ShowL7PolicyRequest request) {
        return new SyncInvoker<ShowL7PolicyRequest, ShowL7PolicyResponse>(request, ElbMeta.showL7Policy, hcClient);
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
     * 查询转发规则详情
     * 查询转发规则详情
     *
     * @param ShowL7RuleRequest 请求对象
     * @return SyncInvoker<ShowL7RuleRequest, ShowL7RuleResponse>
     */
    public SyncInvoker<ShowL7RuleRequest, ShowL7RuleResponse> showL7RuleInvoker(ShowL7RuleRequest request) {
        return new SyncInvoker<ShowL7RuleRequest, ShowL7RuleResponse>(request, ElbMeta.showL7Rule, hcClient);
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
     * 查询监听器详情
     * 监听器详情。
     *
     * @param ShowListenerRequest 请求对象
     * @return SyncInvoker<ShowListenerRequest, ShowListenerResponse>
     */
    public SyncInvoker<ShowListenerRequest, ShowListenerResponse> showListenerInvoker(ShowListenerRequest request) {
        return new SyncInvoker<ShowListenerRequest, ShowListenerResponse>(request, ElbMeta.showListener, hcClient);
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
     * 查询负载均衡器详情
     * 查询负载均衡器详情
     *
     * @param ShowLoadBalancerRequest 请求对象
     * @return SyncInvoker<ShowLoadBalancerRequest, ShowLoadBalancerResponse>
     */
    public SyncInvoker<ShowLoadBalancerRequest, ShowLoadBalancerResponse> showLoadBalancerInvoker(ShowLoadBalancerRequest request) {
        return new SyncInvoker<ShowLoadBalancerRequest, ShowLoadBalancerResponse>(request, ElbMeta.showLoadBalancer, hcClient);
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
     * 查询负载均衡器状态树
     * 查询负载均衡器状态树，列出负载均衡器关联的子资源的信息
     *
     * @param ShowLoadBalancerStatusRequest 请求对象
     * @return SyncInvoker<ShowLoadBalancerStatusRequest, ShowLoadBalancerStatusResponse>
     */
    public SyncInvoker<ShowLoadBalancerStatusRequest, ShowLoadBalancerStatusResponse> showLoadBalancerStatusInvoker(ShowLoadBalancerStatusRequest request) {
        return new SyncInvoker<ShowLoadBalancerStatusRequest, ShowLoadBalancerStatusResponse>(request, ElbMeta.showLoadBalancerStatus, hcClient);
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
     * 后端服务器详情
     * 后端服务器详情
     *
     * @param ShowMemberRequest 请求对象
     * @return SyncInvoker<ShowMemberRequest, ShowMemberResponse>
     */
    public SyncInvoker<ShowMemberRequest, ShowMemberResponse> showMemberInvoker(ShowMemberRequest request) {
        return new SyncInvoker<ShowMemberRequest, ShowMemberResponse>(request, ElbMeta.showMember, hcClient);
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
     * 查询后端服务器组详情
     * 后端服务器组详情。
     *
     * @param ShowPoolRequest 请求对象
     * @return SyncInvoker<ShowPoolRequest, ShowPoolResponse>
     */
    public SyncInvoker<ShowPoolRequest, ShowPoolResponse> showPoolInvoker(ShowPoolRequest request) {
        return new SyncInvoker<ShowPoolRequest, ShowPoolResponse>(request, ElbMeta.showPool, hcClient);
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
     * 查询配额详情
     * 【不开放】查询特定项目的配额数。
     *
     * @param ShowQuotaRequest 请求对象
     * @return SyncInvoker<ShowQuotaRequest, ShowQuotaResponse>
     */
    public SyncInvoker<ShowQuotaRequest, ShowQuotaResponse> showQuotaInvoker(ShowQuotaRequest request) {
        return new SyncInvoker<ShowQuotaRequest, ShowQuotaResponse>(request, ElbMeta.showQuota, hcClient);
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
     * 查询默认配额
     * 【不开放】查询默认配额数。
     *
     * @param ShowQuotaDefaultsRequest 请求对象
     * @return SyncInvoker<ShowQuotaDefaultsRequest, ShowQuotaDefaultsResponse>
     */
    public SyncInvoker<ShowQuotaDefaultsRequest, ShowQuotaDefaultsResponse> showQuotaDefaultsInvoker(ShowQuotaDefaultsRequest request) {
        return new SyncInvoker<ShowQuotaDefaultsRequest, ShowQuotaDefaultsResponse>(request, ElbMeta.showQuotaDefaults, hcClient);
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
     * 更新证书
     * 更新SSL证书。
     *
     * @param UpdateCertificateRequest 请求对象
     * @return SyncInvoker<UpdateCertificateRequest, UpdateCertificateResponse>
     */
    public SyncInvoker<UpdateCertificateRequest, UpdateCertificateResponse> updateCertificateInvoker(UpdateCertificateRequest request) {
        return new SyncInvoker<UpdateCertificateRequest, UpdateCertificateResponse>(request, ElbMeta.updateCertificate, hcClient);
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
     * 更新健康检查
     * 更新健康检查。
     *
     * @param UpdateHealthMonitorRequest 请求对象
     * @return SyncInvoker<UpdateHealthMonitorRequest, UpdateHealthMonitorResponse>
     */
    public SyncInvoker<UpdateHealthMonitorRequest, UpdateHealthMonitorResponse> updateHealthMonitorInvoker(UpdateHealthMonitorRequest request) {
        return new SyncInvoker<UpdateHealthMonitorRequest, UpdateHealthMonitorResponse>(request, ElbMeta.updateHealthMonitor, hcClient);
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
     * 更新转发策略
     * 更新转发策略。
     *
     * @param UpdateL7PolicyRequest 请求对象
     * @return SyncInvoker<UpdateL7PolicyRequest, UpdateL7PolicyResponse>
     */
    public SyncInvoker<UpdateL7PolicyRequest, UpdateL7PolicyResponse> updateL7PolicyInvoker(UpdateL7PolicyRequest request) {
        return new SyncInvoker<UpdateL7PolicyRequest, UpdateL7PolicyResponse>(request, ElbMeta.updateL7Policy, hcClient);
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
     * 更新转发规则
     * 更新转发规则。
     *
     * @param UpdateL7RuleRequest 请求对象
     * @return SyncInvoker<UpdateL7RuleRequest, UpdateL7RuleResponse>
     */
    public SyncInvoker<UpdateL7RuleRequest, UpdateL7RuleResponse> updateL7RuleInvoker(UpdateL7RuleRequest request) {
        return new SyncInvoker<UpdateL7RuleRequest, UpdateL7RuleResponse>(request, ElbMeta.updateL7Rule, hcClient);
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
     * 更新监听器
     * 更新监听器。
     *
     * @param UpdateListenerRequest 请求对象
     * @return SyncInvoker<UpdateListenerRequest, UpdateListenerResponse>
     */
    public SyncInvoker<UpdateListenerRequest, UpdateListenerResponse> updateListenerInvoker(UpdateListenerRequest request) {
        return new SyncInvoker<UpdateListenerRequest, UpdateListenerResponse>(request, ElbMeta.updateListener, hcClient);
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
     * 更新负载均衡器
     * 更新负载均衡器。
     *
     * @param UpdateLoadBalancerRequest 请求对象
     * @return SyncInvoker<UpdateLoadBalancerRequest, UpdateLoadBalancerResponse>
     */
    public SyncInvoker<UpdateLoadBalancerRequest, UpdateLoadBalancerResponse> updateLoadBalancerInvoker(UpdateLoadBalancerRequest request) {
        return new SyncInvoker<UpdateLoadBalancerRequest, UpdateLoadBalancerResponse>(request, ElbMeta.updateLoadBalancer, hcClient);
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
     * 更新后端服务器
     * 如果member绑定的负载均衡器的provisioning status不是ACTIVE，则不能更新该member。
     *
     * @param UpdateMemberRequest 请求对象
     * @return SyncInvoker<UpdateMemberRequest, UpdateMemberResponse>
     */
    public SyncInvoker<UpdateMemberRequest, UpdateMemberResponse> updateMemberInvoker(UpdateMemberRequest request) {
        return new SyncInvoker<UpdateMemberRequest, UpdateMemberResponse>(request, ElbMeta.updateMember, hcClient);
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
     * 更新后端服务器组
     * 更新后端服务器组。
     *
     * @param UpdatePoolRequest 请求对象
     * @return SyncInvoker<UpdatePoolRequest, UpdatePoolResponse>
     */
    public SyncInvoker<UpdatePoolRequest, UpdatePoolResponse> updatePoolInvoker(UpdatePoolRequest request) {
        return new SyncInvoker<UpdatePoolRequest, UpdatePoolResponse>(request, ElbMeta.updatePool, hcClient);
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
     * 计算预占IP数
     * 计算创建一个负载均衡实例和第一个七层监听器需预占用的IP数
     *
     * @param CountPreoccupyIpNumRequest 请求对象
     * @return SyncInvoker<CountPreoccupyIpNumRequest, CountPreoccupyIpNumResponse>
     */
    public SyncInvoker<CountPreoccupyIpNumRequest, CountPreoccupyIpNumResponse> countPreoccupyIpNumInvoker(CountPreoccupyIpNumRequest request) {
        return new SyncInvoker<CountPreoccupyIpNumRequest, CountPreoccupyIpNumResponse>(request, ElbMeta.countPreoccupyIpNum, hcClient);
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
     * 创建IP地址组
     * 创建ip地址组
     *
     * @param CreateIpGroupRequest 请求对象
     * @return SyncInvoker<CreateIpGroupRequest, CreateIpGroupResponse>
     */
    public SyncInvoker<CreateIpGroupRequest, CreateIpGroupResponse> createIpGroupInvoker(CreateIpGroupRequest request) {
        return new SyncInvoker<CreateIpGroupRequest, CreateIpGroupResponse>(request, ElbMeta.createIpGroup, hcClient);
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
     * 删除IP地址组
     * 删除ip地址组。
     *
     * @param DeleteIpGroupRequest 请求对象
     * @return SyncInvoker<DeleteIpGroupRequest, DeleteIpGroupResponse>
     */
    public SyncInvoker<DeleteIpGroupRequest, DeleteIpGroupResponse> deleteIpGroupInvoker(DeleteIpGroupRequest request) {
        return new SyncInvoker<DeleteIpGroupRequest, DeleteIpGroupResponse>(request, ElbMeta.deleteIpGroup, hcClient);
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
     * 查询IP地址组列表
     * 查询IP地址组列表
     *
     * @param ListIpGroupsRequest 请求对象
     * @return SyncInvoker<ListIpGroupsRequest, ListIpGroupsResponse>
     */
    public SyncInvoker<ListIpGroupsRequest, ListIpGroupsResponse> listIpGroupsInvoker(ListIpGroupsRequest request) {
        return new SyncInvoker<ListIpGroupsRequest, ListIpGroupsResponse>(request, ElbMeta.listIpGroups, hcClient);
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
     * 查询IP地址组详情
     * 获取ip地址组详情
     *
     * @param ShowIpGroupRequest 请求对象
     * @return SyncInvoker<ShowIpGroupRequest, ShowIpGroupResponse>
     */
    public SyncInvoker<ShowIpGroupRequest, ShowIpGroupResponse> showIpGroupInvoker(ShowIpGroupRequest request) {
        return new SyncInvoker<ShowIpGroupRequest, ShowIpGroupResponse>(request, ElbMeta.showIpGroup, hcClient);
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

    /**
     * 更新IP地址组
     * 更新ip地址组，只支持全量更新ip。
     *
     * @param UpdateIpGroupRequest 请求对象
     * @return SyncInvoker<UpdateIpGroupRequest, UpdateIpGroupResponse>
     */
    public SyncInvoker<UpdateIpGroupRequest, UpdateIpGroupResponse> updateIpGroupInvoker(UpdateIpGroupRequest request) {
        return new SyncInvoker<UpdateIpGroupRequest, UpdateIpGroupResponse>(request, ElbMeta.updateIpGroup, hcClient);
    }

}