package com.huaweicloud.sdk.elb.v2;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.elb.v2.model.*;

public class ElbAsyncClient {
    protected HcClient hcClient;

    public ElbAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<ElbAsyncClient> newBuilder() {
        return new ClientBuilder<>(ElbAsyncClient::new);
    }


    /**
     * 创建健康检查
     * 给后端云服务器组添加健康检查
     *
     * @param CreateHealthmonitorRequest 请求对象
     * @return CompletableFuture<CreateHealthmonitorResponse>
     */
    public CompletableFuture<CreateHealthmonitorResponse> createHealthmonitorAsync(CreateHealthmonitorRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.createHealthmonitor);
    }

    /**
     * 创建健康检查
     * 给后端云服务器组添加健康检查
     *
     * @param CreateHealthmonitorRequest 请求对象
     * @return AsyncInvoker<CreateHealthmonitorRequest, CreateHealthmonitorResponse>
     */
    public AsyncInvoker<CreateHealthmonitorRequest, CreateHealthmonitorResponse> createHealthmonitorAsyncInvoker(CreateHealthmonitorRequest request) {
        return new AsyncInvoker<CreateHealthmonitorRequest, CreateHealthmonitorResponse>(request, ElbMeta.createHealthmonitor, hcClient);
    }

    /**
     * 创建转发策略
     * 创建listener关联的转发策略
     *
     * @param CreateL7policyRequest 请求对象
     * @return CompletableFuture<CreateL7policyResponse>
     */
    public CompletableFuture<CreateL7policyResponse> createL7policyAsync(CreateL7policyRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.createL7policy);
    }

    /**
     * 创建转发策略
     * 创建listener关联的转发策略
     *
     * @param CreateL7policyRequest 请求对象
     * @return AsyncInvoker<CreateL7policyRequest, CreateL7policyResponse>
     */
    public AsyncInvoker<CreateL7policyRequest, CreateL7policyResponse> createL7policyAsyncInvoker(CreateL7policyRequest request) {
        return new AsyncInvoker<CreateL7policyRequest, CreateL7policyResponse>(request, ElbMeta.createL7policy, hcClient);
    }

    /**
     * 创建转发规则
     * 创建转发规则
     *
     * @param CreateL7ruleRequest 请求对象
     * @return CompletableFuture<CreateL7ruleResponse>
     */
    public CompletableFuture<CreateL7ruleResponse> createL7ruleAsync(CreateL7ruleRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.createL7rule);
    }

    /**
     * 创建转发规则
     * 创建转发规则
     *
     * @param CreateL7ruleRequest 请求对象
     * @return AsyncInvoker<CreateL7ruleRequest, CreateL7ruleResponse>
     */
    public AsyncInvoker<CreateL7ruleRequest, CreateL7ruleResponse> createL7ruleAsyncInvoker(CreateL7ruleRequest request) {
        return new AsyncInvoker<CreateL7ruleRequest, CreateL7ruleResponse>(request, ElbMeta.createL7rule, hcClient);
    }

    /**
     * 创建监听器
     * 创建与负载均衡器绑定的监听器。
     *
     * @param CreateListenerRequest 请求对象
     * @return CompletableFuture<CreateListenerResponse>
     */
    public CompletableFuture<CreateListenerResponse> createListenerAsync(CreateListenerRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.createListener);
    }

    /**
     * 创建监听器
     * 创建与负载均衡器绑定的监听器。
     *
     * @param CreateListenerRequest 请求对象
     * @return AsyncInvoker<CreateListenerRequest, CreateListenerResponse>
     */
    public AsyncInvoker<CreateListenerRequest, CreateListenerResponse> createListenerAsyncInvoker(CreateListenerRequest request) {
        return new AsyncInvoker<CreateListenerRequest, CreateListenerResponse>(request, ElbMeta.createListener, hcClient);
    }

    /**
     * 创建负载均衡器
     * 创建私网类型的增强型负载均衡器。创建成功后，该接口会返回创建的增强型负载均衡器的ID、所属子网ID、负载均衡器IP等详细信息。若要创建公网类型的增强型负载均衡器，还需调用创建浮动IP的接口，将浮动IP与私网负载均衡器的vip_port_id绑定。
     *
     * @param CreateLoadbalancerRequest 请求对象
     * @return CompletableFuture<CreateLoadbalancerResponse>
     */
    public CompletableFuture<CreateLoadbalancerResponse> createLoadbalancerAsync(CreateLoadbalancerRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.createLoadbalancer);
    }

    /**
     * 创建负载均衡器
     * 创建私网类型的增强型负载均衡器。创建成功后，该接口会返回创建的增强型负载均衡器的ID、所属子网ID、负载均衡器IP等详细信息。若要创建公网类型的增强型负载均衡器，还需调用创建浮动IP的接口，将浮动IP与私网负载均衡器的vip_port_id绑定。
     *
     * @param CreateLoadbalancerRequest 请求对象
     * @return AsyncInvoker<CreateLoadbalancerRequest, CreateLoadbalancerResponse>
     */
    public AsyncInvoker<CreateLoadbalancerRequest, CreateLoadbalancerResponse> createLoadbalancerAsyncInvoker(CreateLoadbalancerRequest request) {
        return new AsyncInvoker<CreateLoadbalancerRequest, CreateLoadbalancerResponse>(request, ElbMeta.createLoadbalancer, hcClient);
    }

    /**
     * 创建后端云服务器
     * 添加属于某个后端云服务器组的后端云服务器。
     *
     * @param CreateMemberRequest 请求对象
     * @return CompletableFuture<CreateMemberResponse>
     */
    public CompletableFuture<CreateMemberResponse> createMemberAsync(CreateMemberRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.createMember);
    }

    /**
     * 创建后端云服务器
     * 添加属于某个后端云服务器组的后端云服务器。
     *
     * @param CreateMemberRequest 请求对象
     * @return AsyncInvoker<CreateMemberRequest, CreateMemberResponse>
     */
    public AsyncInvoker<CreateMemberRequest, CreateMemberResponse> createMemberAsyncInvoker(CreateMemberRequest request) {
        return new AsyncInvoker<CreateMemberRequest, CreateMemberResponse>(request, ElbMeta.createMember, hcClient);
    }

    /**
     * 创建后端云服务器组
     * 创建后端云服务器组。将多个后端云服务器添加到后端云服务器组中后，请求会在后端云服务器间按后端云服务器组的负载均衡算法和后端云服务器的权重来做请求分发。
     *
     * @param CreatePoolRequest 请求对象
     * @return CompletableFuture<CreatePoolResponse>
     */
    public CompletableFuture<CreatePoolResponse> createPoolAsync(CreatePoolRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.createPool);
    }

    /**
     * 创建后端云服务器组
     * 创建后端云服务器组。将多个后端云服务器添加到后端云服务器组中后，请求会在后端云服务器间按后端云服务器组的负载均衡算法和后端云服务器的权重来做请求分发。
     *
     * @param CreatePoolRequest 请求对象
     * @return AsyncInvoker<CreatePoolRequest, CreatePoolResponse>
     */
    public AsyncInvoker<CreatePoolRequest, CreatePoolResponse> createPoolAsyncInvoker(CreatePoolRequest request) {
        return new AsyncInvoker<CreatePoolRequest, CreatePoolResponse>(request, ElbMeta.createPool, hcClient);
    }

    /**
     * 创建白名单
     * 创建白名单，控制监听器的访问权限。若开启了白名单功能，只有白名单中放通的IP可以访问该监听器的后端服务。
     *
     * @param CreateWhitelistRequest 请求对象
     * @return CompletableFuture<CreateWhitelistResponse>
     */
    public CompletableFuture<CreateWhitelistResponse> createWhitelistAsync(CreateWhitelistRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.createWhitelist);
    }

    /**
     * 创建白名单
     * 创建白名单，控制监听器的访问权限。若开启了白名单功能，只有白名单中放通的IP可以访问该监听器的后端服务。
     *
     * @param CreateWhitelistRequest 请求对象
     * @return AsyncInvoker<CreateWhitelistRequest, CreateWhitelistResponse>
     */
    public AsyncInvoker<CreateWhitelistRequest, CreateWhitelistResponse> createWhitelistAsyncInvoker(CreateWhitelistRequest request) {
        return new AsyncInvoker<CreateWhitelistRequest, CreateWhitelistResponse>(request, ElbMeta.createWhitelist, hcClient);
    }

    /**
     * 删除健康检查
     * 删除健康检查
     *
     * @param DeleteHealthmonitorRequest 请求对象
     * @return CompletableFuture<DeleteHealthmonitorResponse>
     */
    public CompletableFuture<DeleteHealthmonitorResponse> deleteHealthmonitorAsync(DeleteHealthmonitorRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.deleteHealthmonitor);
    }

    /**
     * 删除健康检查
     * 删除健康检查
     *
     * @param DeleteHealthmonitorRequest 请求对象
     * @return AsyncInvoker<DeleteHealthmonitorRequest, DeleteHealthmonitorResponse>
     */
    public AsyncInvoker<DeleteHealthmonitorRequest, DeleteHealthmonitorResponse> deleteHealthmonitorAsyncInvoker(DeleteHealthmonitorRequest request) {
        return new AsyncInvoker<DeleteHealthmonitorRequest, DeleteHealthmonitorResponse>(request, ElbMeta.deleteHealthmonitor, hcClient);
    }

    /**
     * 删除转发策略
     * 删除转发策略
     *
     * @param DeleteL7policyRequest 请求对象
     * @return CompletableFuture<DeleteL7policyResponse>
     */
    public CompletableFuture<DeleteL7policyResponse> deleteL7policyAsync(DeleteL7policyRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.deleteL7policy);
    }

    /**
     * 删除转发策略
     * 删除转发策略
     *
     * @param DeleteL7policyRequest 请求对象
     * @return AsyncInvoker<DeleteL7policyRequest, DeleteL7policyResponse>
     */
    public AsyncInvoker<DeleteL7policyRequest, DeleteL7policyResponse> deleteL7policyAsyncInvoker(DeleteL7policyRequest request) {
        return new AsyncInvoker<DeleteL7policyRequest, DeleteL7policyResponse>(request, ElbMeta.deleteL7policy, hcClient);
    }

    /**
     * 删除转发规则
     * 删除转发规则
     *
     * @param DeleteL7ruleRequest 请求对象
     * @return CompletableFuture<DeleteL7ruleResponse>
     */
    public CompletableFuture<DeleteL7ruleResponse> deleteL7ruleAsync(DeleteL7ruleRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.deleteL7rule);
    }

    /**
     * 删除转发规则
     * 删除转发规则
     *
     * @param DeleteL7ruleRequest 请求对象
     * @return AsyncInvoker<DeleteL7ruleRequest, DeleteL7ruleResponse>
     */
    public AsyncInvoker<DeleteL7ruleRequest, DeleteL7ruleResponse> deleteL7ruleAsyncInvoker(DeleteL7ruleRequest request) {
        return new AsyncInvoker<DeleteL7ruleRequest, DeleteL7ruleResponse>(request, ElbMeta.deleteL7rule, hcClient);
    }

    /**
     * 删除监听器
     * 根据指定ID删除监听器。提供级联删除选项，当选择级联删除时，删除和负载均衡器关联的转发规则、转发策略、白名单、标签等。
     *
     * @param DeleteListenerRequest 请求对象
     * @return CompletableFuture<DeleteListenerResponse>
     */
    public CompletableFuture<DeleteListenerResponse> deleteListenerAsync(DeleteListenerRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.deleteListener);
    }

    /**
     * 删除监听器
     * 根据指定ID删除监听器。提供级联删除选项，当选择级联删除时，删除和负载均衡器关联的转发规则、转发策略、白名单、标签等。
     *
     * @param DeleteListenerRequest 请求对象
     * @return AsyncInvoker<DeleteListenerRequest, DeleteListenerResponse>
     */
    public AsyncInvoker<DeleteListenerRequest, DeleteListenerResponse> deleteListenerAsyncInvoker(DeleteListenerRequest request) {
        return new AsyncInvoker<DeleteListenerRequest, DeleteListenerResponse>(request, ElbMeta.deleteListener, hcClient);
    }

    /**
     * 删除负载均衡
     * 根据指定ID删除负载均衡器。提供级联删除选项，当选择级联删除时，删除和负载均衡器关联的监听器、后端云服务器组、后端云服务器、健康检查、转发策略、转发规则、白名单、标签等
     *
     * @param DeleteLoadbalancerRequest 请求对象
     * @return CompletableFuture<DeleteLoadbalancerResponse>
     */
    public CompletableFuture<DeleteLoadbalancerResponse> deleteLoadbalancerAsync(DeleteLoadbalancerRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.deleteLoadbalancer);
    }

    /**
     * 删除负载均衡
     * 根据指定ID删除负载均衡器。提供级联删除选项，当选择级联删除时，删除和负载均衡器关联的监听器、后端云服务器组、后端云服务器、健康检查、转发策略、转发规则、白名单、标签等
     *
     * @param DeleteLoadbalancerRequest 请求对象
     * @return AsyncInvoker<DeleteLoadbalancerRequest, DeleteLoadbalancerResponse>
     */
    public AsyncInvoker<DeleteLoadbalancerRequest, DeleteLoadbalancerResponse> deleteLoadbalancerAsyncInvoker(DeleteLoadbalancerRequest request) {
        return new AsyncInvoker<DeleteLoadbalancerRequest, DeleteLoadbalancerResponse>(request, ElbMeta.deleteLoadbalancer, hcClient);
    }

    /**
     * 删除后端云服务器
     * 删除后端云服务器
     *
     * @param DeleteMemberRequest 请求对象
     * @return CompletableFuture<DeleteMemberResponse>
     */
    public CompletableFuture<DeleteMemberResponse> deleteMemberAsync(DeleteMemberRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.deleteMember);
    }

    /**
     * 删除后端云服务器
     * 删除后端云服务器
     *
     * @param DeleteMemberRequest 请求对象
     * @return AsyncInvoker<DeleteMemberRequest, DeleteMemberResponse>
     */
    public AsyncInvoker<DeleteMemberRequest, DeleteMemberResponse> deleteMemberAsyncInvoker(DeleteMemberRequest request) {
        return new AsyncInvoker<DeleteMemberRequest, DeleteMemberResponse>(request, ElbMeta.deleteMember, hcClient);
    }

    /**
     * 删除后端云服务器组
     * 删除后端云服务器组。
     *
     * @param DeletePoolRequest 请求对象
     * @return CompletableFuture<DeletePoolResponse>
     */
    public CompletableFuture<DeletePoolResponse> deletePoolAsync(DeletePoolRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.deletePool);
    }

    /**
     * 删除后端云服务器组
     * 删除后端云服务器组。
     *
     * @param DeletePoolRequest 请求对象
     * @return AsyncInvoker<DeletePoolRequest, DeletePoolResponse>
     */
    public AsyncInvoker<DeletePoolRequest, DeletePoolResponse> deletePoolAsyncInvoker(DeletePoolRequest request) {
        return new AsyncInvoker<DeletePoolRequest, DeletePoolResponse>(request, ElbMeta.deletePool, hcClient);
    }

    /**
     * 删除白名单
     * 删除白名单
     *
     * @param DeleteWhitelistRequest 请求对象
     * @return CompletableFuture<DeleteWhitelistResponse>
     */
    public CompletableFuture<DeleteWhitelistResponse> deleteWhitelistAsync(DeleteWhitelistRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.deleteWhitelist);
    }

    /**
     * 删除白名单
     * 删除白名单
     *
     * @param DeleteWhitelistRequest 请求对象
     * @return AsyncInvoker<DeleteWhitelistRequest, DeleteWhitelistResponse>
     */
    public AsyncInvoker<DeleteWhitelistRequest, DeleteWhitelistResponse> deleteWhitelistAsyncInvoker(DeleteWhitelistRequest request) {
        return new AsyncInvoker<DeleteWhitelistRequest, DeleteWhitelistResponse>(request, ElbMeta.deleteWhitelist, hcClient);
    }

    /**
     * 查询健康检查列表
     * 查询健康检查列表
     *
     * @param ListHealthmonitorsRequest 请求对象
     * @return CompletableFuture<ListHealthmonitorsResponse>
     */
    public CompletableFuture<ListHealthmonitorsResponse> listHealthmonitorsAsync(ListHealthmonitorsRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.listHealthmonitors);
    }

    /**
     * 查询健康检查列表
     * 查询健康检查列表
     *
     * @param ListHealthmonitorsRequest 请求对象
     * @return AsyncInvoker<ListHealthmonitorsRequest, ListHealthmonitorsResponse>
     */
    public AsyncInvoker<ListHealthmonitorsRequest, ListHealthmonitorsResponse> listHealthmonitorsAsyncInvoker(ListHealthmonitorsRequest request) {
        return new AsyncInvoker<ListHealthmonitorsRequest, ListHealthmonitorsResponse>(request, ElbMeta.listHealthmonitors, hcClient);
    }

    /**
     * 查询转发策略列表
     * 查询转发策略。支持过滤查询和分页查询。
     *
     * @param ListL7policiesRequest 请求对象
     * @return CompletableFuture<ListL7policiesResponse>
     */
    public CompletableFuture<ListL7policiesResponse> listL7policiesAsync(ListL7policiesRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.listL7policies);
    }

    /**
     * 查询转发策略列表
     * 查询转发策略。支持过滤查询和分页查询。
     *
     * @param ListL7policiesRequest 请求对象
     * @return AsyncInvoker<ListL7policiesRequest, ListL7policiesResponse>
     */
    public AsyncInvoker<ListL7policiesRequest, ListL7policiesResponse> listL7policiesAsyncInvoker(ListL7policiesRequest request) {
        return new AsyncInvoker<ListL7policiesRequest, ListL7policiesResponse>(request, ElbMeta.listL7policies, hcClient);
    }

    /**
     * 查询转发规则列表
     * 查询指定转发策略下关联的转发规则列表
     *
     * @param ListL7rulesRequest 请求对象
     * @return CompletableFuture<ListL7rulesResponse>
     */
    public CompletableFuture<ListL7rulesResponse> listL7rulesAsync(ListL7rulesRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.listL7rules);
    }

    /**
     * 查询转发规则列表
     * 查询指定转发策略下关联的转发规则列表
     *
     * @param ListL7rulesRequest 请求对象
     * @return AsyncInvoker<ListL7rulesRequest, ListL7rulesResponse>
     */
    public AsyncInvoker<ListL7rulesRequest, ListL7rulesResponse> listL7rulesAsyncInvoker(ListL7rulesRequest request) {
        return new AsyncInvoker<ListL7rulesRequest, ListL7rulesResponse>(request, ElbMeta.listL7rules, hcClient);
    }

    /**
     * 查询监听器列表
     * 查询监听器列表。支持过滤查询和分页查询。可以通过监听器ID、协议类型、监听端口号、关联的后端云服务器的IP等查询监听器。
     *
     * @param ListListenersRequest 请求对象
     * @return CompletableFuture<ListListenersResponse>
     */
    public CompletableFuture<ListListenersResponse> listListenersAsync(ListListenersRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.listListeners);
    }

    /**
     * 查询监听器列表
     * 查询监听器列表。支持过滤查询和分页查询。可以通过监听器ID、协议类型、监听端口号、关联的后端云服务器的IP等查询监听器。
     *
     * @param ListListenersRequest 请求对象
     * @return AsyncInvoker<ListListenersRequest, ListListenersResponse>
     */
    public AsyncInvoker<ListListenersRequest, ListListenersResponse> listListenersAsyncInvoker(ListListenersRequest request) {
        return new AsyncInvoker<ListListenersRequest, ListListenersResponse>(request, ElbMeta.listListeners, hcClient);
    }

    /**
     * 查询负载均衡列表
     * 查询负载均衡器列表。
     *
     * @param ListLoadbalancersRequest 请求对象
     * @return CompletableFuture<ListLoadbalancersResponse>
     */
    public CompletableFuture<ListLoadbalancersResponse> listLoadbalancersAsync(ListLoadbalancersRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.listLoadbalancers);
    }

    /**
     * 查询负载均衡列表
     * 查询负载均衡器列表。
     *
     * @param ListLoadbalancersRequest 请求对象
     * @return AsyncInvoker<ListLoadbalancersRequest, ListLoadbalancersResponse>
     */
    public AsyncInvoker<ListLoadbalancersRequest, ListLoadbalancersResponse> listLoadbalancersAsyncInvoker(ListLoadbalancersRequest request) {
        return new AsyncInvoker<ListLoadbalancersRequest, ListLoadbalancersResponse>(request, ElbMeta.listLoadbalancers, hcClient);
    }

    /**
     * 查询后端云服务器列表
     * 添加属于某个后端云服务器组的后端云服务器。
     *
     * @param ListMembersRequest 请求对象
     * @return CompletableFuture<ListMembersResponse>
     */
    public CompletableFuture<ListMembersResponse> listMembersAsync(ListMembersRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.listMembers);
    }

    /**
     * 查询后端云服务器列表
     * 添加属于某个后端云服务器组的后端云服务器。
     *
     * @param ListMembersRequest 请求对象
     * @return AsyncInvoker<ListMembersRequest, ListMembersResponse>
     */
    public AsyncInvoker<ListMembersRequest, ListMembersResponse> listMembersAsyncInvoker(ListMembersRequest request) {
        return new AsyncInvoker<ListMembersRequest, ListMembersResponse>(request, ElbMeta.listMembers, hcClient);
    }

    /**
     * 查询后端云服务器组列表
     * 查询后端云服务器组列表。
     *
     * @param ListPoolsRequest 请求对象
     * @return CompletableFuture<ListPoolsResponse>
     */
    public CompletableFuture<ListPoolsResponse> listPoolsAsync(ListPoolsRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.listPools);
    }

    /**
     * 查询后端云服务器组列表
     * 查询后端云服务器组列表。
     *
     * @param ListPoolsRequest 请求对象
     * @return AsyncInvoker<ListPoolsRequest, ListPoolsResponse>
     */
    public AsyncInvoker<ListPoolsRequest, ListPoolsResponse> listPoolsAsyncInvoker(ListPoolsRequest request) {
        return new AsyncInvoker<ListPoolsRequest, ListPoolsResponse>(request, ElbMeta.listPools, hcClient);
    }

    /**
     * 查询白名单列表
     * 查询白名单，支持过滤查询和分页查询。
     *
     * @param ListWhitelistsRequest 请求对象
     * @return CompletableFuture<ListWhitelistsResponse>
     */
    public CompletableFuture<ListWhitelistsResponse> listWhitelistsAsync(ListWhitelistsRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.listWhitelists);
    }

    /**
     * 查询白名单列表
     * 查询白名单，支持过滤查询和分页查询。
     *
     * @param ListWhitelistsRequest 请求对象
     * @return AsyncInvoker<ListWhitelistsRequest, ListWhitelistsResponse>
     */
    public AsyncInvoker<ListWhitelistsRequest, ListWhitelistsResponse> listWhitelistsAsyncInvoker(ListWhitelistsRequest request) {
        return new AsyncInvoker<ListWhitelistsRequest, ListWhitelistsResponse>(request, ElbMeta.listWhitelists, hcClient);
    }

    /**
     * 查询健康检查详情
     * 根据指定ID查询健康检查详情。
     *
     * @param ShowHealthmonitorsRequest 请求对象
     * @return CompletableFuture<ShowHealthmonitorsResponse>
     */
    public CompletableFuture<ShowHealthmonitorsResponse> showHealthmonitorsAsync(ShowHealthmonitorsRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.showHealthmonitors);
    }

    /**
     * 查询健康检查详情
     * 根据指定ID查询健康检查详情。
     *
     * @param ShowHealthmonitorsRequest 请求对象
     * @return AsyncInvoker<ShowHealthmonitorsRequest, ShowHealthmonitorsResponse>
     */
    public AsyncInvoker<ShowHealthmonitorsRequest, ShowHealthmonitorsResponse> showHealthmonitorsAsyncInvoker(ShowHealthmonitorsRequest request) {
        return new AsyncInvoker<ShowHealthmonitorsRequest, ShowHealthmonitorsResponse>(request, ElbMeta.showHealthmonitors, hcClient);
    }

    /**
     * 查询转发策略详情
     * 根据指定ID查询转发策略详情。
     *
     * @param ShowL7policyRequest 请求对象
     * @return CompletableFuture<ShowL7policyResponse>
     */
    public CompletableFuture<ShowL7policyResponse> showL7policyAsync(ShowL7policyRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.showL7policy);
    }

    /**
     * 查询转发策略详情
     * 根据指定ID查询转发策略详情。
     *
     * @param ShowL7policyRequest 请求对象
     * @return AsyncInvoker<ShowL7policyRequest, ShowL7policyResponse>
     */
    public AsyncInvoker<ShowL7policyRequest, ShowL7policyResponse> showL7policyAsyncInvoker(ShowL7policyRequest request) {
        return new AsyncInvoker<ShowL7policyRequest, ShowL7policyResponse>(request, ElbMeta.showL7policy, hcClient);
    }

    /**
     * 查询转发规则详情
     * 根据指定ID查询某转发策略下关联的转发规则详情。
     *
     * @param ShowL7ruleRequest 请求对象
     * @return CompletableFuture<ShowL7ruleResponse>
     */
    public CompletableFuture<ShowL7ruleResponse> showL7ruleAsync(ShowL7ruleRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.showL7rule);
    }

    /**
     * 查询转发规则详情
     * 根据指定ID查询某转发策略下关联的转发规则详情。
     *
     * @param ShowL7ruleRequest 请求对象
     * @return AsyncInvoker<ShowL7ruleRequest, ShowL7ruleResponse>
     */
    public AsyncInvoker<ShowL7ruleRequest, ShowL7ruleResponse> showL7ruleAsyncInvoker(ShowL7ruleRequest request) {
        return new AsyncInvoker<ShowL7ruleRequest, ShowL7ruleResponse>(request, ElbMeta.showL7rule, hcClient);
    }

    /**
     * 查询监听器详情
     * 根据指定ID查询监听器详情。
     *
     * @param ShowListenerRequest 请求对象
     * @return CompletableFuture<ShowListenerResponse>
     */
    public CompletableFuture<ShowListenerResponse> showListenerAsync(ShowListenerRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.showListener);
    }

    /**
     * 查询监听器详情
     * 根据指定ID查询监听器详情。
     *
     * @param ShowListenerRequest 请求对象
     * @return AsyncInvoker<ShowListenerRequest, ShowListenerResponse>
     */
    public AsyncInvoker<ShowListenerRequest, ShowListenerResponse> showListenerAsyncInvoker(ShowListenerRequest request) {
        return new AsyncInvoker<ShowListenerRequest, ShowListenerResponse>(request, ElbMeta.showListener, hcClient);
    }

    /**
     * 查询负载均衡详情
     * 根据指定负载均衡器ID查询负载均衡器详情
     *
     * @param ShowLoadbalancerRequest 请求对象
     * @return CompletableFuture<ShowLoadbalancerResponse>
     */
    public CompletableFuture<ShowLoadbalancerResponse> showLoadbalancerAsync(ShowLoadbalancerRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.showLoadbalancer);
    }

    /**
     * 查询负载均衡详情
     * 根据指定负载均衡器ID查询负载均衡器详情
     *
     * @param ShowLoadbalancerRequest 请求对象
     * @return AsyncInvoker<ShowLoadbalancerRequest, ShowLoadbalancerResponse>
     */
    public AsyncInvoker<ShowLoadbalancerRequest, ShowLoadbalancerResponse> showLoadbalancerAsyncInvoker(ShowLoadbalancerRequest request) {
        return new AsyncInvoker<ShowLoadbalancerRequest, ShowLoadbalancerResponse>(request, ElbMeta.showLoadbalancer, hcClient);
    }

    /**
     * 查询负载均衡状态树
     * 查询负载均衡器状态树。可通过该接口查询负载均衡器关联的监听器、后端云服务器组、后端云服务器、健康检查、转发策略、转发规则的主要信息，了解负载均衡器下资源的拓扑情况。
     *
     * @param ShowLoadbalancersStatusRequest 请求对象
     * @return CompletableFuture<ShowLoadbalancersStatusResponse>
     */
    public CompletableFuture<ShowLoadbalancersStatusResponse> showLoadbalancersStatusAsync(ShowLoadbalancersStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.showLoadbalancersStatus);
    }

    /**
     * 查询负载均衡状态树
     * 查询负载均衡器状态树。可通过该接口查询负载均衡器关联的监听器、后端云服务器组、后端云服务器、健康检查、转发策略、转发规则的主要信息，了解负载均衡器下资源的拓扑情况。
     *
     * @param ShowLoadbalancersStatusRequest 请求对象
     * @return AsyncInvoker<ShowLoadbalancersStatusRequest, ShowLoadbalancersStatusResponse>
     */
    public AsyncInvoker<ShowLoadbalancersStatusRequest, ShowLoadbalancersStatusResponse> showLoadbalancersStatusAsyncInvoker(ShowLoadbalancersStatusRequest request) {
        return new AsyncInvoker<ShowLoadbalancersStatusRequest, ShowLoadbalancersStatusResponse>(request, ElbMeta.showLoadbalancersStatus, hcClient);
    }

    /**
     * 查询后端云服务器详情
     * 根据指定ID查询后端云服务器详情。
     *
     * @param ShowMemberRequest 请求对象
     * @return CompletableFuture<ShowMemberResponse>
     */
    public CompletableFuture<ShowMemberResponse> showMemberAsync(ShowMemberRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.showMember);
    }

    /**
     * 查询后端云服务器详情
     * 根据指定ID查询后端云服务器详情。
     *
     * @param ShowMemberRequest 请求对象
     * @return AsyncInvoker<ShowMemberRequest, ShowMemberResponse>
     */
    public AsyncInvoker<ShowMemberRequest, ShowMemberResponse> showMemberAsyncInvoker(ShowMemberRequest request) {
        return new AsyncInvoker<ShowMemberRequest, ShowMemberResponse>(request, ElbMeta.showMember, hcClient);
    }

    /**
     * 查询后端云服务器组详情
     * 根据指定ID查询后端云服务器组详情。
     *
     * @param ShowPoolRequest 请求对象
     * @return CompletableFuture<ShowPoolResponse>
     */
    public CompletableFuture<ShowPoolResponse> showPoolAsync(ShowPoolRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.showPool);
    }

    /**
     * 查询后端云服务器组详情
     * 根据指定ID查询后端云服务器组详情。
     *
     * @param ShowPoolRequest 请求对象
     * @return AsyncInvoker<ShowPoolRequest, ShowPoolResponse>
     */
    public AsyncInvoker<ShowPoolRequest, ShowPoolResponse> showPoolAsyncInvoker(ShowPoolRequest request) {
        return new AsyncInvoker<ShowPoolRequest, ShowPoolResponse>(request, ElbMeta.showPool, hcClient);
    }

    /**
     * 查询白名单详情
     * 根据指定ID查询白名单详情。
     *
     * @param ShowWhitelistRequest 请求对象
     * @return CompletableFuture<ShowWhitelistResponse>
     */
    public CompletableFuture<ShowWhitelistResponse> showWhitelistAsync(ShowWhitelistRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.showWhitelist);
    }

    /**
     * 查询白名单详情
     * 根据指定ID查询白名单详情。
     *
     * @param ShowWhitelistRequest 请求对象
     * @return AsyncInvoker<ShowWhitelistRequest, ShowWhitelistResponse>
     */
    public AsyncInvoker<ShowWhitelistRequest, ShowWhitelistResponse> showWhitelistAsyncInvoker(ShowWhitelistRequest request) {
        return new AsyncInvoker<ShowWhitelistRequest, ShowWhitelistResponse>(request, ElbMeta.showWhitelist, hcClient);
    }

    /**
     * 更新健康检查
     * 更新健康检查
     *
     * @param UpdateHealthmonitorRequest 请求对象
     * @return CompletableFuture<UpdateHealthmonitorResponse>
     */
    public CompletableFuture<UpdateHealthmonitorResponse> updateHealthmonitorAsync(UpdateHealthmonitorRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.updateHealthmonitor);
    }

    /**
     * 更新健康检查
     * 更新健康检查
     *
     * @param UpdateHealthmonitorRequest 请求对象
     * @return AsyncInvoker<UpdateHealthmonitorRequest, UpdateHealthmonitorResponse>
     */
    public AsyncInvoker<UpdateHealthmonitorRequest, UpdateHealthmonitorResponse> updateHealthmonitorAsyncInvoker(UpdateHealthmonitorRequest request) {
        return new AsyncInvoker<UpdateHealthmonitorRequest, UpdateHealthmonitorResponse>(request, ElbMeta.updateHealthmonitor, hcClient);
    }

    /**
     * 更新转发策略
     * 更新转发策略
     *
     * @param UpdateL7policiesRequest 请求对象
     * @return CompletableFuture<UpdateL7policiesResponse>
     */
    public CompletableFuture<UpdateL7policiesResponse> updateL7policiesAsync(UpdateL7policiesRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.updateL7policies);
    }

    /**
     * 更新转发策略
     * 更新转发策略
     *
     * @param UpdateL7policiesRequest 请求对象
     * @return AsyncInvoker<UpdateL7policiesRequest, UpdateL7policiesResponse>
     */
    public AsyncInvoker<UpdateL7policiesRequest, UpdateL7policiesResponse> updateL7policiesAsyncInvoker(UpdateL7policiesRequest request) {
        return new AsyncInvoker<UpdateL7policiesRequest, UpdateL7policiesResponse>(request, ElbMeta.updateL7policies, hcClient);
    }

    /**
     * 更新转发规则
     * 更新指定的转发规则
     *
     * @param UpdateL7ruleRequest 请求对象
     * @return CompletableFuture<UpdateL7ruleResponse>
     */
    public CompletableFuture<UpdateL7ruleResponse> updateL7ruleAsync(UpdateL7ruleRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.updateL7rule);
    }

    /**
     * 更新转发规则
     * 更新指定的转发规则
     *
     * @param UpdateL7ruleRequest 请求对象
     * @return AsyncInvoker<UpdateL7ruleRequest, UpdateL7ruleResponse>
     */
    public AsyncInvoker<UpdateL7ruleRequest, UpdateL7ruleResponse> updateL7ruleAsyncInvoker(UpdateL7ruleRequest request) {
        return new AsyncInvoker<UpdateL7ruleRequest, UpdateL7ruleResponse>(request, ElbMeta.updateL7rule, hcClient);
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
     * @param UpdateLoadbalancerRequest 请求对象
     * @return CompletableFuture<UpdateLoadbalancerResponse>
     */
    public CompletableFuture<UpdateLoadbalancerResponse> updateLoadbalancerAsync(UpdateLoadbalancerRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.updateLoadbalancer);
    }

    /**
     * 更新负载均衡器
     * 更新负载均衡器。
     *
     * @param UpdateLoadbalancerRequest 请求对象
     * @return AsyncInvoker<UpdateLoadbalancerRequest, UpdateLoadbalancerResponse>
     */
    public AsyncInvoker<UpdateLoadbalancerRequest, UpdateLoadbalancerResponse> updateLoadbalancerAsyncInvoker(UpdateLoadbalancerRequest request) {
        return new AsyncInvoker<UpdateLoadbalancerRequest, UpdateLoadbalancerResponse>(request, ElbMeta.updateLoadbalancer, hcClient);
    }

    /**
     * 更新后端云服务器
     * 更新后端云服务器
     *
     * @param UpdateMemberRequest 请求对象
     * @return CompletableFuture<UpdateMemberResponse>
     */
    public CompletableFuture<UpdateMemberResponse> updateMemberAsync(UpdateMemberRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.updateMember);
    }

    /**
     * 更新后端云服务器
     * 更新后端云服务器
     *
     * @param UpdateMemberRequest 请求对象
     * @return AsyncInvoker<UpdateMemberRequest, UpdateMemberResponse>
     */
    public AsyncInvoker<UpdateMemberRequest, UpdateMemberResponse> updateMemberAsyncInvoker(UpdateMemberRequest request) {
        return new AsyncInvoker<UpdateMemberRequest, UpdateMemberResponse>(request, ElbMeta.updateMember, hcClient);
    }

    /**
     * 更新后端云服务器组
     * 更新后端云服务器组。
     *
     * @param UpdatePoolRequest 请求对象
     * @return CompletableFuture<UpdatePoolResponse>
     */
    public CompletableFuture<UpdatePoolResponse> updatePoolAsync(UpdatePoolRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.updatePool);
    }

    /**
     * 更新后端云服务器组
     * 更新后端云服务器组。
     *
     * @param UpdatePoolRequest 请求对象
     * @return AsyncInvoker<UpdatePoolRequest, UpdatePoolResponse>
     */
    public AsyncInvoker<UpdatePoolRequest, UpdatePoolResponse> updatePoolAsyncInvoker(UpdatePoolRequest request) {
        return new AsyncInvoker<UpdatePoolRequest, UpdatePoolResponse>(request, ElbMeta.updatePool, hcClient);
    }

    /**
     * 更新白名单
     * 更新白名单。可以打开或关闭白名单，或更新访问控制的IP。
     *
     * @param UpdateWhitelistRequest 请求对象
     * @return CompletableFuture<UpdateWhitelistResponse>
     */
    public CompletableFuture<UpdateWhitelistResponse> updateWhitelistAsync(UpdateWhitelistRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.updateWhitelist);
    }

    /**
     * 更新白名单
     * 更新白名单。可以打开或关闭白名单，或更新访问控制的IP。
     *
     * @param UpdateWhitelistRequest 请求对象
     * @return AsyncInvoker<UpdateWhitelistRequest, UpdateWhitelistResponse>
     */
    public AsyncInvoker<UpdateWhitelistRequest, UpdateWhitelistResponse> updateWhitelistAsyncInvoker(UpdateWhitelistRequest request) {
        return new AsyncInvoker<UpdateWhitelistRequest, UpdateWhitelistResponse>(request, ElbMeta.updateWhitelist, hcClient);
    }

    /**
     * 创建SSL证书
     * 创建SSL证书。将监听器和SSL证书绑定后，可以通过负载均衡器实现服务端认证，后端服务器只要提供HTTP服务就能实现安全可靠的连接。
     *
     * @param CreateCertificateRequest 请求对象
     * @return CompletableFuture<CreateCertificateResponse>
     */
    public CompletableFuture<CreateCertificateResponse> createCertificateAsync(CreateCertificateRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.createCertificate);
    }

    /**
     * 创建SSL证书
     * 创建SSL证书。将监听器和SSL证书绑定后，可以通过负载均衡器实现服务端认证，后端服务器只要提供HTTP服务就能实现安全可靠的连接。
     *
     * @param CreateCertificateRequest 请求对象
     * @return AsyncInvoker<CreateCertificateRequest, CreateCertificateResponse>
     */
    public AsyncInvoker<CreateCertificateRequest, CreateCertificateResponse> createCertificateAsyncInvoker(CreateCertificateRequest request) {
        return new AsyncInvoker<CreateCertificateRequest, CreateCertificateResponse>(request, ElbMeta.createCertificate, hcClient);
    }

    /**
     * 删除SSL证书
     * 删除指定的SSL证书
     *
     * @param DeleteCertificateRequest 请求对象
     * @return CompletableFuture<DeleteCertificateResponse>
     */
    public CompletableFuture<DeleteCertificateResponse> deleteCertificateAsync(DeleteCertificateRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.deleteCertificate);
    }

    /**
     * 删除SSL证书
     * 删除指定的SSL证书
     *
     * @param DeleteCertificateRequest 请求对象
     * @return AsyncInvoker<DeleteCertificateRequest, DeleteCertificateResponse>
     */
    public AsyncInvoker<DeleteCertificateRequest, DeleteCertificateResponse> deleteCertificateAsyncInvoker(DeleteCertificateRequest request) {
        return new AsyncInvoker<DeleteCertificateRequest, DeleteCertificateResponse>(request, ElbMeta.deleteCertificate, hcClient);
    }

    /**
     * 查询SSL证书列表
     * 查询SSL证书。支持过滤查询和分页查询。
     *
     * @param ListCertificatesRequest 请求对象
     * @return CompletableFuture<ListCertificatesResponse>
     */
    public CompletableFuture<ListCertificatesResponse> listCertificatesAsync(ListCertificatesRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.listCertificates);
    }

    /**
     * 查询SSL证书列表
     * 查询SSL证书。支持过滤查询和分页查询。
     *
     * @param ListCertificatesRequest 请求对象
     * @return AsyncInvoker<ListCertificatesRequest, ListCertificatesResponse>
     */
    public AsyncInvoker<ListCertificatesRequest, ListCertificatesResponse> listCertificatesAsyncInvoker(ListCertificatesRequest request) {
        return new AsyncInvoker<ListCertificatesRequest, ListCertificatesResponse>(request, ElbMeta.listCertificates, hcClient);
    }

    /**
     * 查询SSL证书详情
     * 查询指定SSL证书的详情信息。
     *
     * @param ShowCertificateRequest 请求对象
     * @return CompletableFuture<ShowCertificateResponse>
     */
    public CompletableFuture<ShowCertificateResponse> showCertificateAsync(ShowCertificateRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.showCertificate);
    }

    /**
     * 查询SSL证书详情
     * 查询指定SSL证书的详情信息。
     *
     * @param ShowCertificateRequest 请求对象
     * @return AsyncInvoker<ShowCertificateRequest, ShowCertificateResponse>
     */
    public AsyncInvoker<ShowCertificateRequest, ShowCertificateResponse> showCertificateAsyncInvoker(ShowCertificateRequest request) {
        return new AsyncInvoker<ShowCertificateRequest, ShowCertificateResponse>(request, ElbMeta.showCertificate, hcClient);
    }

    /**
     * 更新SSL证书
     * 更新指定的SSL证书
     *
     * @param UpdateCertificateRequest 请求对象
     * @return CompletableFuture<UpdateCertificateResponse>
     */
    public CompletableFuture<UpdateCertificateResponse> updateCertificateAsync(UpdateCertificateRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.updateCertificate);
    }

    /**
     * 更新SSL证书
     * 更新指定的SSL证书
     *
     * @param UpdateCertificateRequest 请求对象
     * @return AsyncInvoker<UpdateCertificateRequest, UpdateCertificateResponse>
     */
    public AsyncInvoker<UpdateCertificateRequest, UpdateCertificateResponse> updateCertificateAsyncInvoker(UpdateCertificateRequest request) {
        return new AsyncInvoker<UpdateCertificateRequest, UpdateCertificateResponse>(request, ElbMeta.updateCertificate, hcClient);
    }

}