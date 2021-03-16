package com.huaweicloud.sdk.elb.v3;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
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
     * 创建证书
     * 创建证书。
     *
     * @param CreateCertificateRequest 请求对象
     * @return AsyncInvoker<CreateCertificateRequest, CreateCertificateResponse>
     */
    public AsyncInvoker<CreateCertificateRequest, CreateCertificateResponse> createCertificateAsyncInvoker(CreateCertificateRequest request) {
        return new AsyncInvoker<CreateCertificateRequest, CreateCertificateResponse>(request, ElbMeta.createCertificate, hcClient);
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
     * 创建健康检查
     * 创建健康检查。
     *
     * @param CreateHealthMonitorRequest 请求对象
     * @return AsyncInvoker<CreateHealthMonitorRequest, CreateHealthMonitorResponse>
     */
    public AsyncInvoker<CreateHealthMonitorRequest, CreateHealthMonitorResponse> createHealthMonitorAsyncInvoker(CreateHealthMonitorRequest request) {
        return new AsyncInvoker<CreateHealthMonitorRequest, CreateHealthMonitorResponse>(request, ElbMeta.createHealthMonitor, hcClient);
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
     * 创建转发策略
     * 创建转发策略.
     *
     * @param CreateL7PolicyRequest 请求对象
     * @return AsyncInvoker<CreateL7PolicyRequest, CreateL7PolicyResponse>
     */
    public AsyncInvoker<CreateL7PolicyRequest, CreateL7PolicyResponse> createL7PolicyAsyncInvoker(CreateL7PolicyRequest request) {
        return new AsyncInvoker<CreateL7PolicyRequest, CreateL7PolicyResponse>(request, ElbMeta.createL7Policy, hcClient);
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
     * 创建转发规则
     * 创建转发规则。
     *
     * @param CreateL7RuleRequest 请求对象
     * @return AsyncInvoker<CreateL7RuleRequest, CreateL7RuleResponse>
     */
    public AsyncInvoker<CreateL7RuleRequest, CreateL7RuleResponse> createL7RuleAsyncInvoker(CreateL7RuleRequest request) {
        return new AsyncInvoker<CreateL7RuleRequest, CreateL7RuleResponse>(request, ElbMeta.createL7Rule, hcClient);
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
     * 创建监听器
     * ElbV3 创建监听器。
     *
     * @param CreateListenerRequest 请求对象
     * @return AsyncInvoker<CreateListenerRequest, CreateListenerResponse>
     */
    public AsyncInvoker<CreateListenerRequest, CreateListenerResponse> createListenerAsyncInvoker(CreateListenerRequest request) {
        return new AsyncInvoker<CreateListenerRequest, CreateListenerResponse>(request, ElbMeta.createListener, hcClient);
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
     * 创建负载均衡器
     * 创建负载均衡器。 1.创建公网负载均衡器的场合，需要传入vpc_id。 2.创建内网负载均衡器的场合，需要传入vip_subnet_cidr_id。 3.创建内网双栈负载均衡器的场合，需要传入ipv6_vip_virsubnet_id。  关联有已有公网ip地址，需要传入publicip_ids 新建公网ip地址，需要传入publicip 包括IPV4私网类型，IPV4公网类型，IPV6私网，IPV6公网
     *
     * @param CreateLoadBalancerRequest 请求对象
     * @return AsyncInvoker<CreateLoadBalancerRequest, CreateLoadBalancerResponse>
     */
    public AsyncInvoker<CreateLoadBalancerRequest, CreateLoadBalancerResponse> createLoadBalancerAsyncInvoker(CreateLoadBalancerRequest request) {
        return new AsyncInvoker<CreateLoadBalancerRequest, CreateLoadBalancerResponse>(request, ElbMeta.createLoadBalancer, hcClient);
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
     * 创建后端服务器
     * 创建后端服务器。
     *
     * @param CreateMemberRequest 请求对象
     * @return AsyncInvoker<CreateMemberRequest, CreateMemberResponse>
     */
    public AsyncInvoker<CreateMemberRequest, CreateMemberResponse> createMemberAsyncInvoker(CreateMemberRequest request) {
        return new AsyncInvoker<CreateMemberRequest, CreateMemberResponse>(request, ElbMeta.createMember, hcClient);
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
     * 创建后端服务器组
     * 创建后端服务器组。
     *
     * @param CreatePoolRequest 请求对象
     * @return AsyncInvoker<CreatePoolRequest, CreatePoolResponse>
     */
    public AsyncInvoker<CreatePoolRequest, CreatePoolResponse> createPoolAsyncInvoker(CreatePoolRequest request) {
        return new AsyncInvoker<CreatePoolRequest, CreatePoolResponse>(request, ElbMeta.createPool, hcClient);
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
     * 删除证书
     * 删除SSL证书。
     *
     * @param DeleteCertificateRequest 请求对象
     * @return AsyncInvoker<DeleteCertificateRequest, DeleteCertificateResponse>
     */
    public AsyncInvoker<DeleteCertificateRequest, DeleteCertificateResponse> deleteCertificateAsyncInvoker(DeleteCertificateRequest request) {
        return new AsyncInvoker<DeleteCertificateRequest, DeleteCertificateResponse>(request, ElbMeta.deleteCertificate, hcClient);
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
     * 删除健康检查
     * 删除健康检查。
     *
     * @param DeleteHealthMonitorRequest 请求对象
     * @return AsyncInvoker<DeleteHealthMonitorRequest, DeleteHealthMonitorResponse>
     */
    public AsyncInvoker<DeleteHealthMonitorRequest, DeleteHealthMonitorResponse> deleteHealthMonitorAsyncInvoker(DeleteHealthMonitorRequest request) {
        return new AsyncInvoker<DeleteHealthMonitorRequest, DeleteHealthMonitorResponse>(request, ElbMeta.deleteHealthMonitor, hcClient);
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
     * 删除转发策略
     * 删除转发策略。
     *
     * @param DeleteL7PolicyRequest 请求对象
     * @return AsyncInvoker<DeleteL7PolicyRequest, DeleteL7PolicyResponse>
     */
    public AsyncInvoker<DeleteL7PolicyRequest, DeleteL7PolicyResponse> deleteL7PolicyAsyncInvoker(DeleteL7PolicyRequest request) {
        return new AsyncInvoker<DeleteL7PolicyRequest, DeleteL7PolicyResponse>(request, ElbMeta.deleteL7Policy, hcClient);
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
     * 删除转发规则
     * 删除转发规则。
     *
     * @param DeleteL7RuleRequest 请求对象
     * @return AsyncInvoker<DeleteL7RuleRequest, DeleteL7RuleResponse>
     */
    public AsyncInvoker<DeleteL7RuleRequest, DeleteL7RuleResponse> deleteL7RuleAsyncInvoker(DeleteL7RuleRequest request) {
        return new AsyncInvoker<DeleteL7RuleRequest, DeleteL7RuleResponse>(request, ElbMeta.deleteL7Rule, hcClient);
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
     * 删除监听器
     * 删除监听器。
     *
     * @param DeleteListenerRequest 请求对象
     * @return AsyncInvoker<DeleteListenerRequest, DeleteListenerResponse>
     */
    public AsyncInvoker<DeleteListenerRequest, DeleteListenerResponse> deleteListenerAsyncInvoker(DeleteListenerRequest request) {
        return new AsyncInvoker<DeleteListenerRequest, DeleteListenerResponse>(request, ElbMeta.deleteListener, hcClient);
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
     * 删除负载均衡器
     * 删除负载均衡器。
     *
     * @param DeleteLoadBalancerRequest 请求对象
     * @return AsyncInvoker<DeleteLoadBalancerRequest, DeleteLoadBalancerResponse>
     */
    public AsyncInvoker<DeleteLoadBalancerRequest, DeleteLoadBalancerResponse> deleteLoadBalancerAsyncInvoker(DeleteLoadBalancerRequest request) {
        return new AsyncInvoker<DeleteLoadBalancerRequest, DeleteLoadBalancerResponse>(request, ElbMeta.deleteLoadBalancer, hcClient);
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
     * 删除后端服务器
     * 删除后端服务器。
     *
     * @param DeleteMemberRequest 请求对象
     * @return AsyncInvoker<DeleteMemberRequest, DeleteMemberResponse>
     */
    public AsyncInvoker<DeleteMemberRequest, DeleteMemberResponse> deleteMemberAsyncInvoker(DeleteMemberRequest request) {
        return new AsyncInvoker<DeleteMemberRequest, DeleteMemberResponse>(request, ElbMeta.deleteMember, hcClient);
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
     * 删除后端服务器组
     * 删除后端服务器组。
     *
     * @param DeletePoolRequest 请求对象
     * @return AsyncInvoker<DeletePoolRequest, DeletePoolResponse>
     */
    public AsyncInvoker<DeletePoolRequest, DeletePoolResponse> deletePoolAsyncInvoker(DeletePoolRequest request) {
        return new AsyncInvoker<DeletePoolRequest, DeletePoolResponse>(request, ElbMeta.deletePool, hcClient);
    }

    /**
     * 后端服务器全局列表
     * 查询当前租户下的后端服务器列表。
     *
     * @param ListAllMembersRequest 请求对象
     * @return CompletableFuture<ListAllMembersResponse>
     */
    public CompletableFuture<ListAllMembersResponse> listAllMembersAsync(ListAllMembersRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.listAllMembers);
    }

    /**
     * 后端服务器全局列表
     * 查询当前租户下的后端服务器列表。
     *
     * @param ListAllMembersRequest 请求对象
     * @return AsyncInvoker<ListAllMembersRequest, ListAllMembersResponse>
     */
    public AsyncInvoker<ListAllMembersRequest, ListAllMembersResponse> listAllMembersAsyncInvoker(ListAllMembersRequest request) {
        return new AsyncInvoker<ListAllMembersRequest, ListAllMembersResponse>(request, ElbMeta.listAllMembers, hcClient);
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
     * 查询可用区列表
     * 返回租户创建LB时可使用的可用区列表情况。  返回的数据类型是可用区集合的列表，比如列表 [ [az1,az2],  [az2, az3] ] ，有两个可用区集合。在创建负载均衡器时，可以选择创建在多个可用区，但所选的多个可用区必须同属于其中一个可用区集合，如可以选择 az2和az3，但不能选择 az1和az3。
     *
     * @param ListAvailabilityZonesRequest 请求对象
     * @return AsyncInvoker<ListAvailabilityZonesRequest, ListAvailabilityZonesResponse>
     */
    public AsyncInvoker<ListAvailabilityZonesRequest, ListAvailabilityZonesResponse> listAvailabilityZonesAsyncInvoker(ListAvailabilityZonesRequest request) {
        return new AsyncInvoker<ListAvailabilityZonesRequest, ListAvailabilityZonesResponse>(request, ElbMeta.listAvailabilityZones, hcClient);
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
     * 证书列表
     * 查询SSL证书列表。
     *
     * @param ListCertificatesRequest 请求对象
     * @return AsyncInvoker<ListCertificatesRequest, ListCertificatesResponse>
     */
    public AsyncInvoker<ListCertificatesRequest, ListCertificatesResponse> listCertificatesAsyncInvoker(ListCertificatesRequest request) {
        return new AsyncInvoker<ListCertificatesRequest, ListCertificatesResponse>(request, ElbMeta.listCertificates, hcClient);
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
     * 查询规格列表
     * 查询所有的规格。
     *
     * @param ListFlavorsRequest 请求对象
     * @return AsyncInvoker<ListFlavorsRequest, ListFlavorsResponse>
     */
    public AsyncInvoker<ListFlavorsRequest, ListFlavorsResponse> listFlavorsAsyncInvoker(ListFlavorsRequest request) {
        return new AsyncInvoker<ListFlavorsRequest, ListFlavorsResponse>(request, ElbMeta.listFlavors, hcClient);
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
     * 查询健康检查列表
     * 健康检查列表。
     *
     * @param ListHealthMonitorsRequest 请求对象
     * @return AsyncInvoker<ListHealthMonitorsRequest, ListHealthMonitorsResponse>
     */
    public AsyncInvoker<ListHealthMonitorsRequest, ListHealthMonitorsResponse> listHealthMonitorsAsyncInvoker(ListHealthMonitorsRequest request) {
        return new AsyncInvoker<ListHealthMonitorsRequest, ListHealthMonitorsResponse>(request, ElbMeta.listHealthMonitors, hcClient);
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
     * 查询转发策略列表
     * 查询转发策略列表。
     *
     * @param ListL7PoliciesRequest 请求对象
     * @return AsyncInvoker<ListL7PoliciesRequest, ListL7PoliciesResponse>
     */
    public AsyncInvoker<ListL7PoliciesRequest, ListL7PoliciesResponse> listL7PoliciesAsyncInvoker(ListL7PoliciesRequest request) {
        return new AsyncInvoker<ListL7PoliciesRequest, ListL7PoliciesResponse>(request, ElbMeta.listL7Policies, hcClient);
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
     * 查询转发规则列表
     * 查询转发规则列表。
     *
     * @param ListL7RulesRequest 请求对象
     * @return AsyncInvoker<ListL7RulesRequest, ListL7RulesResponse>
     */
    public AsyncInvoker<ListL7RulesRequest, ListL7RulesResponse> listL7RulesAsyncInvoker(ListL7RulesRequest request) {
        return new AsyncInvoker<ListL7RulesRequest, ListL7RulesResponse>(request, ElbMeta.listL7Rules, hcClient);
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
     * 查询监听器列表
     * 查询监听器列表。
     *
     * @param ListListenersRequest 请求对象
     * @return AsyncInvoker<ListListenersRequest, ListListenersResponse>
     */
    public AsyncInvoker<ListListenersRequest, ListListenersResponse> listListenersAsyncInvoker(ListListenersRequest request) {
        return new AsyncInvoker<ListListenersRequest, ListListenersResponse>(request, ElbMeta.listListeners, hcClient);
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
     * 查询负载均衡器列表
     * 查询负载均衡器列表，支持过滤查询和分页查询
     *
     * @param ListLoadBalancersRequest 请求对象
     * @return AsyncInvoker<ListLoadBalancersRequest, ListLoadBalancersResponse>
     */
    public AsyncInvoker<ListLoadBalancersRequest, ListLoadBalancersResponse> listLoadBalancersAsyncInvoker(ListLoadBalancersRequest request) {
        return new AsyncInvoker<ListLoadBalancersRequest, ListLoadBalancersResponse>(request, ElbMeta.listLoadBalancers, hcClient);
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
     * 后端服务器列表
     * Pool下的后端服务器列表。
     *
     * @param ListMembersRequest 请求对象
     * @return AsyncInvoker<ListMembersRequest, ListMembersResponse>
     */
    public AsyncInvoker<ListMembersRequest, ListMembersResponse> listMembersAsyncInvoker(ListMembersRequest request) {
        return new AsyncInvoker<ListMembersRequest, ListMembersResponse>(request, ElbMeta.listMembers, hcClient);
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
     * 查询后端服务器组列表
     * 后端服务器组列表。
     *
     * @param ListPoolsRequest 请求对象
     * @return AsyncInvoker<ListPoolsRequest, ListPoolsResponse>
     */
    public AsyncInvoker<ListPoolsRequest, ListPoolsResponse> listPoolsAsyncInvoker(ListPoolsRequest request) {
        return new AsyncInvoker<ListPoolsRequest, ListPoolsResponse>(request, ElbMeta.listPools, hcClient);
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
     * 证书详情
     * 查询SSL证书详情。
     *
     * @param ShowCertificateRequest 请求对象
     * @return AsyncInvoker<ShowCertificateRequest, ShowCertificateResponse>
     */
    public AsyncInvoker<ShowCertificateRequest, ShowCertificateResponse> showCertificateAsyncInvoker(ShowCertificateRequest request) {
        return new AsyncInvoker<ShowCertificateRequest, ShowCertificateResponse>(request, ElbMeta.showCertificate, hcClient);
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
     * 查询规格详情
     * 查询规格的详情。
     *
     * @param ShowFlavorRequest 请求对象
     * @return AsyncInvoker<ShowFlavorRequest, ShowFlavorResponse>
     */
    public AsyncInvoker<ShowFlavorRequest, ShowFlavorResponse> showFlavorAsyncInvoker(ShowFlavorRequest request) {
        return new AsyncInvoker<ShowFlavorRequest, ShowFlavorResponse>(request, ElbMeta.showFlavor, hcClient);
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
     * 查询健康检查详情
     * 查询健康检查详情。
     *
     * @param ShowHealthMonitorRequest 请求对象
     * @return AsyncInvoker<ShowHealthMonitorRequest, ShowHealthMonitorResponse>
     */
    public AsyncInvoker<ShowHealthMonitorRequest, ShowHealthMonitorResponse> showHealthMonitorAsyncInvoker(ShowHealthMonitorRequest request) {
        return new AsyncInvoker<ShowHealthMonitorRequest, ShowHealthMonitorResponse>(request, ElbMeta.showHealthMonitor, hcClient);
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
     * 查询转发策略详情
     * 查询转发策略详情。
     *
     * @param ShowL7PolicyRequest 请求对象
     * @return AsyncInvoker<ShowL7PolicyRequest, ShowL7PolicyResponse>
     */
    public AsyncInvoker<ShowL7PolicyRequest, ShowL7PolicyResponse> showL7PolicyAsyncInvoker(ShowL7PolicyRequest request) {
        return new AsyncInvoker<ShowL7PolicyRequest, ShowL7PolicyResponse>(request, ElbMeta.showL7Policy, hcClient);
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
     * 查询转发规则详情
     * 查询转发规则详情
     *
     * @param ShowL7RuleRequest 请求对象
     * @return AsyncInvoker<ShowL7RuleRequest, ShowL7RuleResponse>
     */
    public AsyncInvoker<ShowL7RuleRequest, ShowL7RuleResponse> showL7RuleAsyncInvoker(ShowL7RuleRequest request) {
        return new AsyncInvoker<ShowL7RuleRequest, ShowL7RuleResponse>(request, ElbMeta.showL7Rule, hcClient);
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
     * 查询监听器详情
     * 监听器详情。
     *
     * @param ShowListenerRequest 请求对象
     * @return AsyncInvoker<ShowListenerRequest, ShowListenerResponse>
     */
    public AsyncInvoker<ShowListenerRequest, ShowListenerResponse> showListenerAsyncInvoker(ShowListenerRequest request) {
        return new AsyncInvoker<ShowListenerRequest, ShowListenerResponse>(request, ElbMeta.showListener, hcClient);
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
     * 查询负载均衡器详情
     * 查询负载均衡器详情
     *
     * @param ShowLoadBalancerRequest 请求对象
     * @return AsyncInvoker<ShowLoadBalancerRequest, ShowLoadBalancerResponse>
     */
    public AsyncInvoker<ShowLoadBalancerRequest, ShowLoadBalancerResponse> showLoadBalancerAsyncInvoker(ShowLoadBalancerRequest request) {
        return new AsyncInvoker<ShowLoadBalancerRequest, ShowLoadBalancerResponse>(request, ElbMeta.showLoadBalancer, hcClient);
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
     * 查询负载均衡器状态树
     * 查询负载均衡器状态树，列出负载均衡器关联的子资源的信息
     *
     * @param ShowLoadBalancerStatusRequest 请求对象
     * @return AsyncInvoker<ShowLoadBalancerStatusRequest, ShowLoadBalancerStatusResponse>
     */
    public AsyncInvoker<ShowLoadBalancerStatusRequest, ShowLoadBalancerStatusResponse> showLoadBalancerStatusAsyncInvoker(ShowLoadBalancerStatusRequest request) {
        return new AsyncInvoker<ShowLoadBalancerStatusRequest, ShowLoadBalancerStatusResponse>(request, ElbMeta.showLoadBalancerStatus, hcClient);
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
     * 后端服务器详情
     * 后端服务器详情
     *
     * @param ShowMemberRequest 请求对象
     * @return AsyncInvoker<ShowMemberRequest, ShowMemberResponse>
     */
    public AsyncInvoker<ShowMemberRequest, ShowMemberResponse> showMemberAsyncInvoker(ShowMemberRequest request) {
        return new AsyncInvoker<ShowMemberRequest, ShowMemberResponse>(request, ElbMeta.showMember, hcClient);
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
     * 查询后端服务器组详情
     * 后端服务器组详情。
     *
     * @param ShowPoolRequest 请求对象
     * @return AsyncInvoker<ShowPoolRequest, ShowPoolResponse>
     */
    public AsyncInvoker<ShowPoolRequest, ShowPoolResponse> showPoolAsyncInvoker(ShowPoolRequest request) {
        return new AsyncInvoker<ShowPoolRequest, ShowPoolResponse>(request, ElbMeta.showPool, hcClient);
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
     * 查询配额详情
     * 【不开放】查询特定项目的配额数。
     *
     * @param ShowQuotaRequest 请求对象
     * @return AsyncInvoker<ShowQuotaRequest, ShowQuotaResponse>
     */
    public AsyncInvoker<ShowQuotaRequest, ShowQuotaResponse> showQuotaAsyncInvoker(ShowQuotaRequest request) {
        return new AsyncInvoker<ShowQuotaRequest, ShowQuotaResponse>(request, ElbMeta.showQuota, hcClient);
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
     * 查询默认配额
     * 【不开放】查询默认配额数。
     *
     * @param ShowQuotaDefaultsRequest 请求对象
     * @return AsyncInvoker<ShowQuotaDefaultsRequest, ShowQuotaDefaultsResponse>
     */
    public AsyncInvoker<ShowQuotaDefaultsRequest, ShowQuotaDefaultsResponse> showQuotaDefaultsAsyncInvoker(ShowQuotaDefaultsRequest request) {
        return new AsyncInvoker<ShowQuotaDefaultsRequest, ShowQuotaDefaultsResponse>(request, ElbMeta.showQuotaDefaults, hcClient);
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
     * 更新证书
     * 更新SSL证书。
     *
     * @param UpdateCertificateRequest 请求对象
     * @return AsyncInvoker<UpdateCertificateRequest, UpdateCertificateResponse>
     */
    public AsyncInvoker<UpdateCertificateRequest, UpdateCertificateResponse> updateCertificateAsyncInvoker(UpdateCertificateRequest request) {
        return new AsyncInvoker<UpdateCertificateRequest, UpdateCertificateResponse>(request, ElbMeta.updateCertificate, hcClient);
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
     * 更新健康检查
     * 更新健康检查。
     *
     * @param UpdateHealthMonitorRequest 请求对象
     * @return AsyncInvoker<UpdateHealthMonitorRequest, UpdateHealthMonitorResponse>
     */
    public AsyncInvoker<UpdateHealthMonitorRequest, UpdateHealthMonitorResponse> updateHealthMonitorAsyncInvoker(UpdateHealthMonitorRequest request) {
        return new AsyncInvoker<UpdateHealthMonitorRequest, UpdateHealthMonitorResponse>(request, ElbMeta.updateHealthMonitor, hcClient);
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
     * 更新转发策略
     * 更新转发策略。
     *
     * @param UpdateL7PolicyRequest 请求对象
     * @return AsyncInvoker<UpdateL7PolicyRequest, UpdateL7PolicyResponse>
     */
    public AsyncInvoker<UpdateL7PolicyRequest, UpdateL7PolicyResponse> updateL7PolicyAsyncInvoker(UpdateL7PolicyRequest request) {
        return new AsyncInvoker<UpdateL7PolicyRequest, UpdateL7PolicyResponse>(request, ElbMeta.updateL7Policy, hcClient);
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
     * 更新转发规则
     * 更新转发规则。
     *
     * @param UpdateL7RuleRequest 请求对象
     * @return AsyncInvoker<UpdateL7RuleRequest, UpdateL7RuleResponse>
     */
    public AsyncInvoker<UpdateL7RuleRequest, UpdateL7RuleResponse> updateL7RuleAsyncInvoker(UpdateL7RuleRequest request) {
        return new AsyncInvoker<UpdateL7RuleRequest, UpdateL7RuleResponse>(request, ElbMeta.updateL7Rule, hcClient);
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
     * 更新监听器
     * 更新监听器。
     *
     * @param UpdateListenerRequest 请求对象
     * @return AsyncInvoker<UpdateListenerRequest, UpdateListenerResponse>
     */
    public AsyncInvoker<UpdateListenerRequest, UpdateListenerResponse> updateListenerAsyncInvoker(UpdateListenerRequest request) {
        return new AsyncInvoker<UpdateListenerRequest, UpdateListenerResponse>(request, ElbMeta.updateListener, hcClient);
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
     * 更新负载均衡器
     * 更新负载均衡器。
     *
     * @param UpdateLoadBalancerRequest 请求对象
     * @return AsyncInvoker<UpdateLoadBalancerRequest, UpdateLoadBalancerResponse>
     */
    public AsyncInvoker<UpdateLoadBalancerRequest, UpdateLoadBalancerResponse> updateLoadBalancerAsyncInvoker(UpdateLoadBalancerRequest request) {
        return new AsyncInvoker<UpdateLoadBalancerRequest, UpdateLoadBalancerResponse>(request, ElbMeta.updateLoadBalancer, hcClient);
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
     * 更新后端服务器
     * 如果member绑定的负载均衡器的provisioning status不是ACTIVE，则不能更新该member。
     *
     * @param UpdateMemberRequest 请求对象
     * @return AsyncInvoker<UpdateMemberRequest, UpdateMemberResponse>
     */
    public AsyncInvoker<UpdateMemberRequest, UpdateMemberResponse> updateMemberAsyncInvoker(UpdateMemberRequest request) {
        return new AsyncInvoker<UpdateMemberRequest, UpdateMemberResponse>(request, ElbMeta.updateMember, hcClient);
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
     * 更新后端服务器组
     * 更新后端服务器组。
     *
     * @param UpdatePoolRequest 请求对象
     * @return AsyncInvoker<UpdatePoolRequest, UpdatePoolResponse>
     */
    public AsyncInvoker<UpdatePoolRequest, UpdatePoolResponse> updatePoolAsyncInvoker(UpdatePoolRequest request) {
        return new AsyncInvoker<UpdatePoolRequest, UpdatePoolResponse>(request, ElbMeta.updatePool, hcClient);
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
     * 计算预占IP数
     * 计算创建一个负载均衡实例和第一个七层监听器需预占用的IP数
     *
     * @param CountPreoccupyIpNumRequest 请求对象
     * @return AsyncInvoker<CountPreoccupyIpNumRequest, CountPreoccupyIpNumResponse>
     */
    public AsyncInvoker<CountPreoccupyIpNumRequest, CountPreoccupyIpNumResponse> countPreoccupyIpNumAsyncInvoker(CountPreoccupyIpNumRequest request) {
        return new AsyncInvoker<CountPreoccupyIpNumRequest, CountPreoccupyIpNumResponse>(request, ElbMeta.countPreoccupyIpNum, hcClient);
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
     * 创建IP地址组
     * 创建ip地址组
     *
     * @param CreateIpGroupRequest 请求对象
     * @return AsyncInvoker<CreateIpGroupRequest, CreateIpGroupResponse>
     */
    public AsyncInvoker<CreateIpGroupRequest, CreateIpGroupResponse> createIpGroupAsyncInvoker(CreateIpGroupRequest request) {
        return new AsyncInvoker<CreateIpGroupRequest, CreateIpGroupResponse>(request, ElbMeta.createIpGroup, hcClient);
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
     * 删除IP地址组
     * 删除ip地址组。
     *
     * @param DeleteIpGroupRequest 请求对象
     * @return AsyncInvoker<DeleteIpGroupRequest, DeleteIpGroupResponse>
     */
    public AsyncInvoker<DeleteIpGroupRequest, DeleteIpGroupResponse> deleteIpGroupAsyncInvoker(DeleteIpGroupRequest request) {
        return new AsyncInvoker<DeleteIpGroupRequest, DeleteIpGroupResponse>(request, ElbMeta.deleteIpGroup, hcClient);
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
     * 查询IP地址组列表
     * 查询IP地址组列表
     *
     * @param ListIpGroupsRequest 请求对象
     * @return AsyncInvoker<ListIpGroupsRequest, ListIpGroupsResponse>
     */
    public AsyncInvoker<ListIpGroupsRequest, ListIpGroupsResponse> listIpGroupsAsyncInvoker(ListIpGroupsRequest request) {
        return new AsyncInvoker<ListIpGroupsRequest, ListIpGroupsResponse>(request, ElbMeta.listIpGroups, hcClient);
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
     * 查询IP地址组详情
     * 获取ip地址组详情
     *
     * @param ShowIpGroupRequest 请求对象
     * @return AsyncInvoker<ShowIpGroupRequest, ShowIpGroupResponse>
     */
    public AsyncInvoker<ShowIpGroupRequest, ShowIpGroupResponse> showIpGroupAsyncInvoker(ShowIpGroupRequest request) {
        return new AsyncInvoker<ShowIpGroupRequest, ShowIpGroupResponse>(request, ElbMeta.showIpGroup, hcClient);
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

    /**
     * 更新IP地址组
     * 更新ip地址组，只支持全量更新ip。
     *
     * @param UpdateIpGroupRequest 请求对象
     * @return AsyncInvoker<UpdateIpGroupRequest, UpdateIpGroupResponse>
     */
    public AsyncInvoker<UpdateIpGroupRequest, UpdateIpGroupResponse> updateIpGroupAsyncInvoker(UpdateIpGroupRequest request) {
        return new AsyncInvoker<UpdateIpGroupRequest, UpdateIpGroupResponse>(request, ElbMeta.updateIpGroup, hcClient);
    }

}