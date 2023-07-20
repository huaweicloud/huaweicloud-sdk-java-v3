package com.huaweicloud.sdk.elb.v2;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.elb.v2.model.BatchCreateListenerTagsRequest;
import com.huaweicloud.sdk.elb.v2.model.BatchCreateListenerTagsResponse;
import com.huaweicloud.sdk.elb.v2.model.BatchCreateLoadbalancerTagsRequest;
import com.huaweicloud.sdk.elb.v2.model.BatchCreateLoadbalancerTagsResponse;
import com.huaweicloud.sdk.elb.v2.model.BatchDeleteListenerTagsRequest;
import com.huaweicloud.sdk.elb.v2.model.BatchDeleteListenerTagsResponse;
import com.huaweicloud.sdk.elb.v2.model.BatchDeleteLoadbalancerTagsRequest;
import com.huaweicloud.sdk.elb.v2.model.BatchDeleteLoadbalancerTagsResponse;
import com.huaweicloud.sdk.elb.v2.model.CreateCertificateRequest;
import com.huaweicloud.sdk.elb.v2.model.CreateCertificateResponse;
import com.huaweicloud.sdk.elb.v2.model.CreateHealthmonitorRequest;
import com.huaweicloud.sdk.elb.v2.model.CreateHealthmonitorResponse;
import com.huaweicloud.sdk.elb.v2.model.CreateL7policyRequest;
import com.huaweicloud.sdk.elb.v2.model.CreateL7policyResponse;
import com.huaweicloud.sdk.elb.v2.model.CreateL7ruleRequest;
import com.huaweicloud.sdk.elb.v2.model.CreateL7ruleResponse;
import com.huaweicloud.sdk.elb.v2.model.CreateListenerRequest;
import com.huaweicloud.sdk.elb.v2.model.CreateListenerResponse;
import com.huaweicloud.sdk.elb.v2.model.CreateListenerTagsRequest;
import com.huaweicloud.sdk.elb.v2.model.CreateListenerTagsResponse;
import com.huaweicloud.sdk.elb.v2.model.CreateLoadbalancerRequest;
import com.huaweicloud.sdk.elb.v2.model.CreateLoadbalancerResponse;
import com.huaweicloud.sdk.elb.v2.model.CreateLoadbalancerTagsRequest;
import com.huaweicloud.sdk.elb.v2.model.CreateLoadbalancerTagsResponse;
import com.huaweicloud.sdk.elb.v2.model.CreateMemberRequest;
import com.huaweicloud.sdk.elb.v2.model.CreateMemberResponse;
import com.huaweicloud.sdk.elb.v2.model.CreatePoolRequest;
import com.huaweicloud.sdk.elb.v2.model.CreatePoolResponse;
import com.huaweicloud.sdk.elb.v2.model.CreateWhitelistRequest;
import com.huaweicloud.sdk.elb.v2.model.CreateWhitelistResponse;
import com.huaweicloud.sdk.elb.v2.model.DeleteCertificateRequest;
import com.huaweicloud.sdk.elb.v2.model.DeleteCertificateResponse;
import com.huaweicloud.sdk.elb.v2.model.DeleteHealthmonitorRequest;
import com.huaweicloud.sdk.elb.v2.model.DeleteHealthmonitorResponse;
import com.huaweicloud.sdk.elb.v2.model.DeleteL7policyRequest;
import com.huaweicloud.sdk.elb.v2.model.DeleteL7policyResponse;
import com.huaweicloud.sdk.elb.v2.model.DeleteL7ruleRequest;
import com.huaweicloud.sdk.elb.v2.model.DeleteL7ruleResponse;
import com.huaweicloud.sdk.elb.v2.model.DeleteListenerRequest;
import com.huaweicloud.sdk.elb.v2.model.DeleteListenerResponse;
import com.huaweicloud.sdk.elb.v2.model.DeleteListenerTagsRequest;
import com.huaweicloud.sdk.elb.v2.model.DeleteListenerTagsResponse;
import com.huaweicloud.sdk.elb.v2.model.DeleteLoadbalancerRequest;
import com.huaweicloud.sdk.elb.v2.model.DeleteLoadbalancerResponse;
import com.huaweicloud.sdk.elb.v2.model.DeleteLoadbalancerTagsRequest;
import com.huaweicloud.sdk.elb.v2.model.DeleteLoadbalancerTagsResponse;
import com.huaweicloud.sdk.elb.v2.model.DeleteMemberRequest;
import com.huaweicloud.sdk.elb.v2.model.DeleteMemberResponse;
import com.huaweicloud.sdk.elb.v2.model.DeletePoolRequest;
import com.huaweicloud.sdk.elb.v2.model.DeletePoolResponse;
import com.huaweicloud.sdk.elb.v2.model.DeleteWhitelistRequest;
import com.huaweicloud.sdk.elb.v2.model.DeleteWhitelistResponse;
import com.huaweicloud.sdk.elb.v2.model.ListCertificatesRequest;
import com.huaweicloud.sdk.elb.v2.model.ListCertificatesResponse;
import com.huaweicloud.sdk.elb.v2.model.ListHealthmonitorsRequest;
import com.huaweicloud.sdk.elb.v2.model.ListHealthmonitorsResponse;
import com.huaweicloud.sdk.elb.v2.model.ListL7policiesRequest;
import com.huaweicloud.sdk.elb.v2.model.ListL7policiesResponse;
import com.huaweicloud.sdk.elb.v2.model.ListL7rulesRequest;
import com.huaweicloud.sdk.elb.v2.model.ListL7rulesResponse;
import com.huaweicloud.sdk.elb.v2.model.ListListenerTagsRequest;
import com.huaweicloud.sdk.elb.v2.model.ListListenerTagsResponse;
import com.huaweicloud.sdk.elb.v2.model.ListListenersByTagsRequest;
import com.huaweicloud.sdk.elb.v2.model.ListListenersByTagsResponse;
import com.huaweicloud.sdk.elb.v2.model.ListListenersRequest;
import com.huaweicloud.sdk.elb.v2.model.ListListenersResponse;
import com.huaweicloud.sdk.elb.v2.model.ListLoadbalancerTagsRequest;
import com.huaweicloud.sdk.elb.v2.model.ListLoadbalancerTagsResponse;
import com.huaweicloud.sdk.elb.v2.model.ListLoadbalancersByTagsRequest;
import com.huaweicloud.sdk.elb.v2.model.ListLoadbalancersByTagsResponse;
import com.huaweicloud.sdk.elb.v2.model.ListLoadbalancersRequest;
import com.huaweicloud.sdk.elb.v2.model.ListLoadbalancersResponse;
import com.huaweicloud.sdk.elb.v2.model.ListMembersRequest;
import com.huaweicloud.sdk.elb.v2.model.ListMembersResponse;
import com.huaweicloud.sdk.elb.v2.model.ListPoolsRequest;
import com.huaweicloud.sdk.elb.v2.model.ListPoolsResponse;
import com.huaweicloud.sdk.elb.v2.model.ListWhitelistsRequest;
import com.huaweicloud.sdk.elb.v2.model.ListWhitelistsResponse;
import com.huaweicloud.sdk.elb.v2.model.ShowCertificateRequest;
import com.huaweicloud.sdk.elb.v2.model.ShowCertificateResponse;
import com.huaweicloud.sdk.elb.v2.model.ShowHealthmonitorsRequest;
import com.huaweicloud.sdk.elb.v2.model.ShowHealthmonitorsResponse;
import com.huaweicloud.sdk.elb.v2.model.ShowL7policyRequest;
import com.huaweicloud.sdk.elb.v2.model.ShowL7policyResponse;
import com.huaweicloud.sdk.elb.v2.model.ShowL7ruleRequest;
import com.huaweicloud.sdk.elb.v2.model.ShowL7ruleResponse;
import com.huaweicloud.sdk.elb.v2.model.ShowListenerRequest;
import com.huaweicloud.sdk.elb.v2.model.ShowListenerResponse;
import com.huaweicloud.sdk.elb.v2.model.ShowListenerTagsRequest;
import com.huaweicloud.sdk.elb.v2.model.ShowListenerTagsResponse;
import com.huaweicloud.sdk.elb.v2.model.ShowLoadbalancerRequest;
import com.huaweicloud.sdk.elb.v2.model.ShowLoadbalancerResponse;
import com.huaweicloud.sdk.elb.v2.model.ShowLoadbalancerTagsRequest;
import com.huaweicloud.sdk.elb.v2.model.ShowLoadbalancerTagsResponse;
import com.huaweicloud.sdk.elb.v2.model.ShowLoadbalancersStatusRequest;
import com.huaweicloud.sdk.elb.v2.model.ShowLoadbalancersStatusResponse;
import com.huaweicloud.sdk.elb.v2.model.ShowMemberRequest;
import com.huaweicloud.sdk.elb.v2.model.ShowMemberResponse;
import com.huaweicloud.sdk.elb.v2.model.ShowPoolRequest;
import com.huaweicloud.sdk.elb.v2.model.ShowPoolResponse;
import com.huaweicloud.sdk.elb.v2.model.ShowWhitelistRequest;
import com.huaweicloud.sdk.elb.v2.model.ShowWhitelistResponse;
import com.huaweicloud.sdk.elb.v2.model.UpdateCertificateRequest;
import com.huaweicloud.sdk.elb.v2.model.UpdateCertificateResponse;
import com.huaweicloud.sdk.elb.v2.model.UpdateHealthmonitorRequest;
import com.huaweicloud.sdk.elb.v2.model.UpdateHealthmonitorResponse;
import com.huaweicloud.sdk.elb.v2.model.UpdateL7policiesRequest;
import com.huaweicloud.sdk.elb.v2.model.UpdateL7policiesResponse;
import com.huaweicloud.sdk.elb.v2.model.UpdateL7ruleRequest;
import com.huaweicloud.sdk.elb.v2.model.UpdateL7ruleResponse;
import com.huaweicloud.sdk.elb.v2.model.UpdateListenerRequest;
import com.huaweicloud.sdk.elb.v2.model.UpdateListenerResponse;
import com.huaweicloud.sdk.elb.v2.model.UpdateLoadbalancerRequest;
import com.huaweicloud.sdk.elb.v2.model.UpdateLoadbalancerResponse;
import com.huaweicloud.sdk.elb.v2.model.UpdateMemberRequest;
import com.huaweicloud.sdk.elb.v2.model.UpdateMemberResponse;
import com.huaweicloud.sdk.elb.v2.model.UpdatePoolRequest;
import com.huaweicloud.sdk.elb.v2.model.UpdatePoolResponse;
import com.huaweicloud.sdk.elb.v2.model.UpdateWhitelistRequest;
import com.huaweicloud.sdk.elb.v2.model.UpdateWhitelistResponse;

import java.util.concurrent.CompletableFuture;

public class ElbAsyncClient {

    protected HcClient hcClient;

    public ElbAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<ElbAsyncClient> newBuilder() {
        ClientBuilder<ElbAsyncClient> clientBuilder = new ClientBuilder<>(ElbAsyncClient::new);
        return clientBuilder;
    }

    /**
     * 批量添加监听器标签
     *
     * 批量添加监听器标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchCreateListenerTagsRequest 请求对象
     * @return CompletableFuture<BatchCreateListenerTagsResponse>
     */
    public CompletableFuture<BatchCreateListenerTagsResponse> batchCreateListenerTagsAsync(
        BatchCreateListenerTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.batchCreateListenerTags);
    }

    /**
     * 批量添加监听器标签
     *
     * 批量添加监听器标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchCreateListenerTagsRequest 请求对象
     * @return AsyncInvoker<BatchCreateListenerTagsRequest, BatchCreateListenerTagsResponse>
     */
    public AsyncInvoker<BatchCreateListenerTagsRequest, BatchCreateListenerTagsResponse> batchCreateListenerTagsAsyncInvoker(
        BatchCreateListenerTagsRequest request) {
        return new AsyncInvoker<BatchCreateListenerTagsRequest, BatchCreateListenerTagsResponse>(request,
            ElbMeta.batchCreateListenerTags, hcClient);
    }

    /**
     * 批量添加负载均衡器标签
     *
     * 批量添加负载均衡器标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchCreateLoadbalancerTagsRequest 请求对象
     * @return CompletableFuture<BatchCreateLoadbalancerTagsResponse>
     */
    public CompletableFuture<BatchCreateLoadbalancerTagsResponse> batchCreateLoadbalancerTagsAsync(
        BatchCreateLoadbalancerTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.batchCreateLoadbalancerTags);
    }

    /**
     * 批量添加负载均衡器标签
     *
     * 批量添加负载均衡器标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchCreateLoadbalancerTagsRequest 请求对象
     * @return AsyncInvoker<BatchCreateLoadbalancerTagsRequest, BatchCreateLoadbalancerTagsResponse>
     */
    public AsyncInvoker<BatchCreateLoadbalancerTagsRequest, BatchCreateLoadbalancerTagsResponse> batchCreateLoadbalancerTagsAsyncInvoker(
        BatchCreateLoadbalancerTagsRequest request) {
        return new AsyncInvoker<BatchCreateLoadbalancerTagsRequest, BatchCreateLoadbalancerTagsResponse>(request,
            ElbMeta.batchCreateLoadbalancerTags, hcClient);
    }

    /**
     * 批量删除监听器标签
     *
     * 批量删除监听器标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchDeleteListenerTagsRequest 请求对象
     * @return CompletableFuture<BatchDeleteListenerTagsResponse>
     */
    public CompletableFuture<BatchDeleteListenerTagsResponse> batchDeleteListenerTagsAsync(
        BatchDeleteListenerTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.batchDeleteListenerTags);
    }

    /**
     * 批量删除监听器标签
     *
     * 批量删除监听器标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchDeleteListenerTagsRequest 请求对象
     * @return AsyncInvoker<BatchDeleteListenerTagsRequest, BatchDeleteListenerTagsResponse>
     */
    public AsyncInvoker<BatchDeleteListenerTagsRequest, BatchDeleteListenerTagsResponse> batchDeleteListenerTagsAsyncInvoker(
        BatchDeleteListenerTagsRequest request) {
        return new AsyncInvoker<BatchDeleteListenerTagsRequest, BatchDeleteListenerTagsResponse>(request,
            ElbMeta.batchDeleteListenerTags, hcClient);
    }

    /**
     * 批量删除负载均衡器标签
     *
     * 批量删除负载均衡器标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchDeleteLoadbalancerTagsRequest 请求对象
     * @return CompletableFuture<BatchDeleteLoadbalancerTagsResponse>
     */
    public CompletableFuture<BatchDeleteLoadbalancerTagsResponse> batchDeleteLoadbalancerTagsAsync(
        BatchDeleteLoadbalancerTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.batchDeleteLoadbalancerTags);
    }

    /**
     * 批量删除负载均衡器标签
     *
     * 批量删除负载均衡器标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchDeleteLoadbalancerTagsRequest 请求对象
     * @return AsyncInvoker<BatchDeleteLoadbalancerTagsRequest, BatchDeleteLoadbalancerTagsResponse>
     */
    public AsyncInvoker<BatchDeleteLoadbalancerTagsRequest, BatchDeleteLoadbalancerTagsResponse> batchDeleteLoadbalancerTagsAsyncInvoker(
        BatchDeleteLoadbalancerTagsRequest request) {
        return new AsyncInvoker<BatchDeleteLoadbalancerTagsRequest, BatchDeleteLoadbalancerTagsResponse>(request,
            ElbMeta.batchDeleteLoadbalancerTags, hcClient);
    }

    /**
     * 创建健康检查
     *
     * 给后端云服务器组添加健康检查
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateHealthmonitorRequest 请求对象
     * @return CompletableFuture<CreateHealthmonitorResponse>
     */
    public CompletableFuture<CreateHealthmonitorResponse> createHealthmonitorAsync(CreateHealthmonitorRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.createHealthmonitor);
    }

    /**
     * 创建健康检查
     *
     * 给后端云服务器组添加健康检查
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateHealthmonitorRequest 请求对象
     * @return AsyncInvoker<CreateHealthmonitorRequest, CreateHealthmonitorResponse>
     */
    public AsyncInvoker<CreateHealthmonitorRequest, CreateHealthmonitorResponse> createHealthmonitorAsyncInvoker(
        CreateHealthmonitorRequest request) {
        return new AsyncInvoker<CreateHealthmonitorRequest, CreateHealthmonitorResponse>(request,
            ElbMeta.createHealthmonitor, hcClient);
    }

    /**
     * 创建转发策略
     *
     * 创建listener关联的转发策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateL7policyRequest 请求对象
     * @return CompletableFuture<CreateL7policyResponse>
     */
    public CompletableFuture<CreateL7policyResponse> createL7policyAsync(CreateL7policyRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.createL7policy);
    }

    /**
     * 创建转发策略
     *
     * 创建listener关联的转发策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateL7policyRequest 请求对象
     * @return AsyncInvoker<CreateL7policyRequest, CreateL7policyResponse>
     */
    public AsyncInvoker<CreateL7policyRequest, CreateL7policyResponse> createL7policyAsyncInvoker(
        CreateL7policyRequest request) {
        return new AsyncInvoker<CreateL7policyRequest, CreateL7policyResponse>(request, ElbMeta.createL7policy,
            hcClient);
    }

    /**
     * 创建转发规则
     *
     * 创建转发规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateL7ruleRequest 请求对象
     * @return CompletableFuture<CreateL7ruleResponse>
     */
    public CompletableFuture<CreateL7ruleResponse> createL7ruleAsync(CreateL7ruleRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.createL7rule);
    }

    /**
     * 创建转发规则
     *
     * 创建转发规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateL7ruleRequest 请求对象
     * @return AsyncInvoker<CreateL7ruleRequest, CreateL7ruleResponse>
     */
    public AsyncInvoker<CreateL7ruleRequest, CreateL7ruleResponse> createL7ruleAsyncInvoker(
        CreateL7ruleRequest request) {
        return new AsyncInvoker<CreateL7ruleRequest, CreateL7ruleResponse>(request, ElbMeta.createL7rule, hcClient);
    }

    /**
     * 创建监听器
     *
     * 创建与负载均衡器绑定的监听器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateListenerRequest 请求对象
     * @return CompletableFuture<CreateListenerResponse>
     */
    public CompletableFuture<CreateListenerResponse> createListenerAsync(CreateListenerRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.createListener);
    }

    /**
     * 创建监听器
     *
     * 创建与负载均衡器绑定的监听器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateListenerRequest 请求对象
     * @return AsyncInvoker<CreateListenerRequest, CreateListenerResponse>
     */
    public AsyncInvoker<CreateListenerRequest, CreateListenerResponse> createListenerAsyncInvoker(
        CreateListenerRequest request) {
        return new AsyncInvoker<CreateListenerRequest, CreateListenerResponse>(request, ElbMeta.createListener,
            hcClient);
    }

    /**
     * 添加监听器标签
     *
     * 给指定监听器添加标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateListenerTagsRequest 请求对象
     * @return CompletableFuture<CreateListenerTagsResponse>
     */
    public CompletableFuture<CreateListenerTagsResponse> createListenerTagsAsync(CreateListenerTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.createListenerTags);
    }

    /**
     * 添加监听器标签
     *
     * 给指定监听器添加标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateListenerTagsRequest 请求对象
     * @return AsyncInvoker<CreateListenerTagsRequest, CreateListenerTagsResponse>
     */
    public AsyncInvoker<CreateListenerTagsRequest, CreateListenerTagsResponse> createListenerTagsAsyncInvoker(
        CreateListenerTagsRequest request) {
        return new AsyncInvoker<CreateListenerTagsRequest, CreateListenerTagsResponse>(request,
            ElbMeta.createListenerTags, hcClient);
    }

    /**
     * 创建负载均衡器
     *
     * 创建私网类型的增强型负载均衡器。创建成功后，该接口会返回创建的增强型负载均衡器的ID、所属子网ID、负载均衡器IP等详细信息。若要创建公网类型的增强型负载均衡器，还需调用创建浮动IP的接口，将浮动IP与私网负载均衡器的vip_port_id绑定。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateLoadbalancerRequest 请求对象
     * @return CompletableFuture<CreateLoadbalancerResponse>
     */
    public CompletableFuture<CreateLoadbalancerResponse> createLoadbalancerAsync(CreateLoadbalancerRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.createLoadbalancer);
    }

    /**
     * 创建负载均衡器
     *
     * 创建私网类型的增强型负载均衡器。创建成功后，该接口会返回创建的增强型负载均衡器的ID、所属子网ID、负载均衡器IP等详细信息。若要创建公网类型的增强型负载均衡器，还需调用创建浮动IP的接口，将浮动IP与私网负载均衡器的vip_port_id绑定。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateLoadbalancerRequest 请求对象
     * @return AsyncInvoker<CreateLoadbalancerRequest, CreateLoadbalancerResponse>
     */
    public AsyncInvoker<CreateLoadbalancerRequest, CreateLoadbalancerResponse> createLoadbalancerAsyncInvoker(
        CreateLoadbalancerRequest request) {
        return new AsyncInvoker<CreateLoadbalancerRequest, CreateLoadbalancerResponse>(request,
            ElbMeta.createLoadbalancer, hcClient);
    }

    /**
     * 添加负载均衡器标签
     *
     * 给指定负载均衡器添加标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateLoadbalancerTagsRequest 请求对象
     * @return CompletableFuture<CreateLoadbalancerTagsResponse>
     */
    public CompletableFuture<CreateLoadbalancerTagsResponse> createLoadbalancerTagsAsync(
        CreateLoadbalancerTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.createLoadbalancerTags);
    }

    /**
     * 添加负载均衡器标签
     *
     * 给指定负载均衡器添加标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateLoadbalancerTagsRequest 请求对象
     * @return AsyncInvoker<CreateLoadbalancerTagsRequest, CreateLoadbalancerTagsResponse>
     */
    public AsyncInvoker<CreateLoadbalancerTagsRequest, CreateLoadbalancerTagsResponse> createLoadbalancerTagsAsyncInvoker(
        CreateLoadbalancerTagsRequest request) {
        return new AsyncInvoker<CreateLoadbalancerTagsRequest, CreateLoadbalancerTagsResponse>(request,
            ElbMeta.createLoadbalancerTags, hcClient);
    }

    /**
     * 创建后端云服务器
     *
     * 添加属于某个后端云服务器组的后端云服务器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateMemberRequest 请求对象
     * @return CompletableFuture<CreateMemberResponse>
     */
    public CompletableFuture<CreateMemberResponse> createMemberAsync(CreateMemberRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.createMember);
    }

    /**
     * 创建后端云服务器
     *
     * 添加属于某个后端云服务器组的后端云服务器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateMemberRequest 请求对象
     * @return AsyncInvoker<CreateMemberRequest, CreateMemberResponse>
     */
    public AsyncInvoker<CreateMemberRequest, CreateMemberResponse> createMemberAsyncInvoker(
        CreateMemberRequest request) {
        return new AsyncInvoker<CreateMemberRequest, CreateMemberResponse>(request, ElbMeta.createMember, hcClient);
    }

    /**
     * 创建后端云服务器组
     *
     * 创建后端云服务器组。将多个后端云服务器添加到后端云服务器组中后，请求会在后端云服务器间按后端云服务器组的负载均衡算法和后端云服务器的权重来做请求分发。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreatePoolRequest 请求对象
     * @return CompletableFuture<CreatePoolResponse>
     */
    public CompletableFuture<CreatePoolResponse> createPoolAsync(CreatePoolRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.createPool);
    }

    /**
     * 创建后端云服务器组
     *
     * 创建后端云服务器组。将多个后端云服务器添加到后端云服务器组中后，请求会在后端云服务器间按后端云服务器组的负载均衡算法和后端云服务器的权重来做请求分发。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreatePoolRequest 请求对象
     * @return AsyncInvoker<CreatePoolRequest, CreatePoolResponse>
     */
    public AsyncInvoker<CreatePoolRequest, CreatePoolResponse> createPoolAsyncInvoker(CreatePoolRequest request) {
        return new AsyncInvoker<CreatePoolRequest, CreatePoolResponse>(request, ElbMeta.createPool, hcClient);
    }

    /**
     * 创建白名单
     *
     * 创建白名单，控制监听器的访问权限。若开启了白名单功能，只有白名单中放通的IP可以访问该监听器的后端服务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateWhitelistRequest 请求对象
     * @return CompletableFuture<CreateWhitelistResponse>
     */
    public CompletableFuture<CreateWhitelistResponse> createWhitelistAsync(CreateWhitelistRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.createWhitelist);
    }

    /**
     * 创建白名单
     *
     * 创建白名单，控制监听器的访问权限。若开启了白名单功能，只有白名单中放通的IP可以访问该监听器的后端服务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateWhitelistRequest 请求对象
     * @return AsyncInvoker<CreateWhitelistRequest, CreateWhitelistResponse>
     */
    public AsyncInvoker<CreateWhitelistRequest, CreateWhitelistResponse> createWhitelistAsyncInvoker(
        CreateWhitelistRequest request) {
        return new AsyncInvoker<CreateWhitelistRequest, CreateWhitelistResponse>(request, ElbMeta.createWhitelist,
            hcClient);
    }

    /**
     * 删除健康检查
     *
     * 删除健康检查
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteHealthmonitorRequest 请求对象
     * @return CompletableFuture<DeleteHealthmonitorResponse>
     */
    public CompletableFuture<DeleteHealthmonitorResponse> deleteHealthmonitorAsync(DeleteHealthmonitorRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.deleteHealthmonitor);
    }

    /**
     * 删除健康检查
     *
     * 删除健康检查
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteHealthmonitorRequest 请求对象
     * @return AsyncInvoker<DeleteHealthmonitorRequest, DeleteHealthmonitorResponse>
     */
    public AsyncInvoker<DeleteHealthmonitorRequest, DeleteHealthmonitorResponse> deleteHealthmonitorAsyncInvoker(
        DeleteHealthmonitorRequest request) {
        return new AsyncInvoker<DeleteHealthmonitorRequest, DeleteHealthmonitorResponse>(request,
            ElbMeta.deleteHealthmonitor, hcClient);
    }

    /**
     * 删除转发策略
     *
     * 删除转发策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteL7policyRequest 请求对象
     * @return CompletableFuture<DeleteL7policyResponse>
     */
    public CompletableFuture<DeleteL7policyResponse> deleteL7policyAsync(DeleteL7policyRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.deleteL7policy);
    }

    /**
     * 删除转发策略
     *
     * 删除转发策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteL7policyRequest 请求对象
     * @return AsyncInvoker<DeleteL7policyRequest, DeleteL7policyResponse>
     */
    public AsyncInvoker<DeleteL7policyRequest, DeleteL7policyResponse> deleteL7policyAsyncInvoker(
        DeleteL7policyRequest request) {
        return new AsyncInvoker<DeleteL7policyRequest, DeleteL7policyResponse>(request, ElbMeta.deleteL7policy,
            hcClient);
    }

    /**
     * 删除转发规则
     *
     * 删除转发规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteL7ruleRequest 请求对象
     * @return CompletableFuture<DeleteL7ruleResponse>
     */
    public CompletableFuture<DeleteL7ruleResponse> deleteL7ruleAsync(DeleteL7ruleRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.deleteL7rule);
    }

    /**
     * 删除转发规则
     *
     * 删除转发规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteL7ruleRequest 请求对象
     * @return AsyncInvoker<DeleteL7ruleRequest, DeleteL7ruleResponse>
     */
    public AsyncInvoker<DeleteL7ruleRequest, DeleteL7ruleResponse> deleteL7ruleAsyncInvoker(
        DeleteL7ruleRequest request) {
        return new AsyncInvoker<DeleteL7ruleRequest, DeleteL7ruleResponse>(request, ElbMeta.deleteL7rule, hcClient);
    }

    /**
     * 删除监听器
     *
     * 根据指定ID删除监听器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteListenerRequest 请求对象
     * @return CompletableFuture<DeleteListenerResponse>
     */
    public CompletableFuture<DeleteListenerResponse> deleteListenerAsync(DeleteListenerRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.deleteListener);
    }

    /**
     * 删除监听器
     *
     * 根据指定ID删除监听器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteListenerRequest 请求对象
     * @return AsyncInvoker<DeleteListenerRequest, DeleteListenerResponse>
     */
    public AsyncInvoker<DeleteListenerRequest, DeleteListenerResponse> deleteListenerAsyncInvoker(
        DeleteListenerRequest request) {
        return new AsyncInvoker<DeleteListenerRequest, DeleteListenerResponse>(request, ElbMeta.deleteListener,
            hcClient);
    }

    /**
     * 删除监听器标签
     *
     * 删除监听器的某个key对应的标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteListenerTagsRequest 请求对象
     * @return CompletableFuture<DeleteListenerTagsResponse>
     */
    public CompletableFuture<DeleteListenerTagsResponse> deleteListenerTagsAsync(DeleteListenerTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.deleteListenerTags);
    }

    /**
     * 删除监听器标签
     *
     * 删除监听器的某个key对应的标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteListenerTagsRequest 请求对象
     * @return AsyncInvoker<DeleteListenerTagsRequest, DeleteListenerTagsResponse>
     */
    public AsyncInvoker<DeleteListenerTagsRequest, DeleteListenerTagsResponse> deleteListenerTagsAsyncInvoker(
        DeleteListenerTagsRequest request) {
        return new AsyncInvoker<DeleteListenerTagsRequest, DeleteListenerTagsResponse>(request,
            ElbMeta.deleteListenerTags, hcClient);
    }

    /**
     * 删除负载均衡
     *
     * 根据指定ID删除负载均衡器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteLoadbalancerRequest 请求对象
     * @return CompletableFuture<DeleteLoadbalancerResponse>
     */
    public CompletableFuture<DeleteLoadbalancerResponse> deleteLoadbalancerAsync(DeleteLoadbalancerRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.deleteLoadbalancer);
    }

    /**
     * 删除负载均衡
     *
     * 根据指定ID删除负载均衡器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteLoadbalancerRequest 请求对象
     * @return AsyncInvoker<DeleteLoadbalancerRequest, DeleteLoadbalancerResponse>
     */
    public AsyncInvoker<DeleteLoadbalancerRequest, DeleteLoadbalancerResponse> deleteLoadbalancerAsyncInvoker(
        DeleteLoadbalancerRequest request) {
        return new AsyncInvoker<DeleteLoadbalancerRequest, DeleteLoadbalancerResponse>(request,
            ElbMeta.deleteLoadbalancer, hcClient);
    }

    /**
     * 删除负载均衡标签
     *
     * 删除负载均衡器的某个key对应的标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteLoadbalancerTagsRequest 请求对象
     * @return CompletableFuture<DeleteLoadbalancerTagsResponse>
     */
    public CompletableFuture<DeleteLoadbalancerTagsResponse> deleteLoadbalancerTagsAsync(
        DeleteLoadbalancerTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.deleteLoadbalancerTags);
    }

    /**
     * 删除负载均衡标签
     *
     * 删除负载均衡器的某个key对应的标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteLoadbalancerTagsRequest 请求对象
     * @return AsyncInvoker<DeleteLoadbalancerTagsRequest, DeleteLoadbalancerTagsResponse>
     */
    public AsyncInvoker<DeleteLoadbalancerTagsRequest, DeleteLoadbalancerTagsResponse> deleteLoadbalancerTagsAsyncInvoker(
        DeleteLoadbalancerTagsRequest request) {
        return new AsyncInvoker<DeleteLoadbalancerTagsRequest, DeleteLoadbalancerTagsResponse>(request,
            ElbMeta.deleteLoadbalancerTags, hcClient);
    }

    /**
     * 删除后端云服务器
     *
     * 删除后端云服务器
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteMemberRequest 请求对象
     * @return CompletableFuture<DeleteMemberResponse>
     */
    public CompletableFuture<DeleteMemberResponse> deleteMemberAsync(DeleteMemberRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.deleteMember);
    }

    /**
     * 删除后端云服务器
     *
     * 删除后端云服务器
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteMemberRequest 请求对象
     * @return AsyncInvoker<DeleteMemberRequest, DeleteMemberResponse>
     */
    public AsyncInvoker<DeleteMemberRequest, DeleteMemberResponse> deleteMemberAsyncInvoker(
        DeleteMemberRequest request) {
        return new AsyncInvoker<DeleteMemberRequest, DeleteMemberResponse>(request, ElbMeta.deleteMember, hcClient);
    }

    /**
     * 删除后端云服务器组
     *
     * 删除后端云服务器组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeletePoolRequest 请求对象
     * @return CompletableFuture<DeletePoolResponse>
     */
    public CompletableFuture<DeletePoolResponse> deletePoolAsync(DeletePoolRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.deletePool);
    }

    /**
     * 删除后端云服务器组
     *
     * 删除后端云服务器组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeletePoolRequest 请求对象
     * @return AsyncInvoker<DeletePoolRequest, DeletePoolResponse>
     */
    public AsyncInvoker<DeletePoolRequest, DeletePoolResponse> deletePoolAsyncInvoker(DeletePoolRequest request) {
        return new AsyncInvoker<DeletePoolRequest, DeletePoolResponse>(request, ElbMeta.deletePool, hcClient);
    }

    /**
     * 删除白名单
     *
     * 删除白名单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteWhitelistRequest 请求对象
     * @return CompletableFuture<DeleteWhitelistResponse>
     */
    public CompletableFuture<DeleteWhitelistResponse> deleteWhitelistAsync(DeleteWhitelistRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.deleteWhitelist);
    }

    /**
     * 删除白名单
     *
     * 删除白名单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteWhitelistRequest 请求对象
     * @return AsyncInvoker<DeleteWhitelistRequest, DeleteWhitelistResponse>
     */
    public AsyncInvoker<DeleteWhitelistRequest, DeleteWhitelistResponse> deleteWhitelistAsyncInvoker(
        DeleteWhitelistRequest request) {
        return new AsyncInvoker<DeleteWhitelistRequest, DeleteWhitelistResponse>(request, ElbMeta.deleteWhitelist,
            hcClient);
    }

    /**
     * 查询健康检查列表
     *
     * 查询健康检查列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListHealthmonitorsRequest 请求对象
     * @return CompletableFuture<ListHealthmonitorsResponse>
     */
    public CompletableFuture<ListHealthmonitorsResponse> listHealthmonitorsAsync(ListHealthmonitorsRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.listHealthmonitors);
    }

    /**
     * 查询健康检查列表
     *
     * 查询健康检查列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListHealthmonitorsRequest 请求对象
     * @return AsyncInvoker<ListHealthmonitorsRequest, ListHealthmonitorsResponse>
     */
    public AsyncInvoker<ListHealthmonitorsRequest, ListHealthmonitorsResponse> listHealthmonitorsAsyncInvoker(
        ListHealthmonitorsRequest request) {
        return new AsyncInvoker<ListHealthmonitorsRequest, ListHealthmonitorsResponse>(request,
            ElbMeta.listHealthmonitors, hcClient);
    }

    /**
     * 查询转发策略列表
     *
     * 查询转发策略。支持过滤查询和分页查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListL7policiesRequest 请求对象
     * @return CompletableFuture<ListL7policiesResponse>
     */
    public CompletableFuture<ListL7policiesResponse> listL7policiesAsync(ListL7policiesRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.listL7policies);
    }

    /**
     * 查询转发策略列表
     *
     * 查询转发策略。支持过滤查询和分页查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListL7policiesRequest 请求对象
     * @return AsyncInvoker<ListL7policiesRequest, ListL7policiesResponse>
     */
    public AsyncInvoker<ListL7policiesRequest, ListL7policiesResponse> listL7policiesAsyncInvoker(
        ListL7policiesRequest request) {
        return new AsyncInvoker<ListL7policiesRequest, ListL7policiesResponse>(request, ElbMeta.listL7policies,
            hcClient);
    }

    /**
     * 查询转发规则列表
     *
     * 查询指定转发策略下关联的转发规则列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListL7rulesRequest 请求对象
     * @return CompletableFuture<ListL7rulesResponse>
     */
    public CompletableFuture<ListL7rulesResponse> listL7rulesAsync(ListL7rulesRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.listL7rules);
    }

    /**
     * 查询转发规则列表
     *
     * 查询指定转发策略下关联的转发规则列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListL7rulesRequest 请求对象
     * @return AsyncInvoker<ListL7rulesRequest, ListL7rulesResponse>
     */
    public AsyncInvoker<ListL7rulesRequest, ListL7rulesResponse> listL7rulesAsyncInvoker(ListL7rulesRequest request) {
        return new AsyncInvoker<ListL7rulesRequest, ListL7rulesResponse>(request, ElbMeta.listL7rules, hcClient);
    }

    /**
     * 查询所有监听器的标签列表
     *
     * 查询指定项目下所有监听器的标签列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListListenerTagsRequest 请求对象
     * @return CompletableFuture<ListListenerTagsResponse>
     */
    public CompletableFuture<ListListenerTagsResponse> listListenerTagsAsync(ListListenerTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.listListenerTags);
    }

    /**
     * 查询所有监听器的标签列表
     *
     * 查询指定项目下所有监听器的标签列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListListenerTagsRequest 请求对象
     * @return AsyncInvoker<ListListenerTagsRequest, ListListenerTagsResponse>
     */
    public AsyncInvoker<ListListenerTagsRequest, ListListenerTagsResponse> listListenerTagsAsyncInvoker(
        ListListenerTagsRequest request) {
        return new AsyncInvoker<ListListenerTagsRequest, ListListenerTagsResponse>(request, ElbMeta.listListenerTags,
            hcClient);
    }

    /**
     * 查询监听器列表
     *
     * 查询监听器列表。支持过滤查询和分页查询。可以通过监听器ID、协议类型、监听端口号、关联的后端云服务器的IP等查询监听器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListListenersRequest 请求对象
     * @return CompletableFuture<ListListenersResponse>
     */
    public CompletableFuture<ListListenersResponse> listListenersAsync(ListListenersRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.listListeners);
    }

    /**
     * 查询监听器列表
     *
     * 查询监听器列表。支持过滤查询和分页查询。可以通过监听器ID、协议类型、监听端口号、关联的后端云服务器的IP等查询监听器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListListenersRequest 请求对象
     * @return AsyncInvoker<ListListenersRequest, ListListenersResponse>
     */
    public AsyncInvoker<ListListenersRequest, ListListenersResponse> listListenersAsyncInvoker(
        ListListenersRequest request) {
        return new AsyncInvoker<ListListenersRequest, ListListenersResponse>(request, ElbMeta.listListeners, hcClient);
    }

    /**
     * 根据标签查询监听器
     *
     * 根据标签过滤查询监听器实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListListenersByTagsRequest 请求对象
     * @return CompletableFuture<ListListenersByTagsResponse>
     */
    public CompletableFuture<ListListenersByTagsResponse> listListenersByTagsAsync(ListListenersByTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.listListenersByTags);
    }

    /**
     * 根据标签查询监听器
     *
     * 根据标签过滤查询监听器实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListListenersByTagsRequest 请求对象
     * @return AsyncInvoker<ListListenersByTagsRequest, ListListenersByTagsResponse>
     */
    public AsyncInvoker<ListListenersByTagsRequest, ListListenersByTagsResponse> listListenersByTagsAsyncInvoker(
        ListListenersByTagsRequest request) {
        return new AsyncInvoker<ListListenersByTagsRequest, ListListenersByTagsResponse>(request,
            ElbMeta.listListenersByTags, hcClient);
    }

    /**
     * 查询所有负载均衡器的标签列表
     *
     * 查询指定项目下所有负载均衡器的标签列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListLoadbalancerTagsRequest 请求对象
     * @return CompletableFuture<ListLoadbalancerTagsResponse>
     */
    public CompletableFuture<ListLoadbalancerTagsResponse> listLoadbalancerTagsAsync(
        ListLoadbalancerTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.listLoadbalancerTags);
    }

    /**
     * 查询所有负载均衡器的标签列表
     *
     * 查询指定项目下所有负载均衡器的标签列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListLoadbalancerTagsRequest 请求对象
     * @return AsyncInvoker<ListLoadbalancerTagsRequest, ListLoadbalancerTagsResponse>
     */
    public AsyncInvoker<ListLoadbalancerTagsRequest, ListLoadbalancerTagsResponse> listLoadbalancerTagsAsyncInvoker(
        ListLoadbalancerTagsRequest request) {
        return new AsyncInvoker<ListLoadbalancerTagsRequest, ListLoadbalancerTagsResponse>(request,
            ElbMeta.listLoadbalancerTags, hcClient);
    }

    /**
     * 查询负载均衡列表
     *
     * 查询负载均衡器列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListLoadbalancersRequest 请求对象
     * @return CompletableFuture<ListLoadbalancersResponse>
     */
    public CompletableFuture<ListLoadbalancersResponse> listLoadbalancersAsync(ListLoadbalancersRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.listLoadbalancers);
    }

    /**
     * 查询负载均衡列表
     *
     * 查询负载均衡器列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListLoadbalancersRequest 请求对象
     * @return AsyncInvoker<ListLoadbalancersRequest, ListLoadbalancersResponse>
     */
    public AsyncInvoker<ListLoadbalancersRequest, ListLoadbalancersResponse> listLoadbalancersAsyncInvoker(
        ListLoadbalancersRequest request) {
        return new AsyncInvoker<ListLoadbalancersRequest, ListLoadbalancersResponse>(request, ElbMeta.listLoadbalancers,
            hcClient);
    }

    /**
     * 根据标签查询负载均衡器
     *
     * 根据标签过滤查询负载均衡实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListLoadbalancersByTagsRequest 请求对象
     * @return CompletableFuture<ListLoadbalancersByTagsResponse>
     */
    public CompletableFuture<ListLoadbalancersByTagsResponse> listLoadbalancersByTagsAsync(
        ListLoadbalancersByTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.listLoadbalancersByTags);
    }

    /**
     * 根据标签查询负载均衡器
     *
     * 根据标签过滤查询负载均衡实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListLoadbalancersByTagsRequest 请求对象
     * @return AsyncInvoker<ListLoadbalancersByTagsRequest, ListLoadbalancersByTagsResponse>
     */
    public AsyncInvoker<ListLoadbalancersByTagsRequest, ListLoadbalancersByTagsResponse> listLoadbalancersByTagsAsyncInvoker(
        ListLoadbalancersByTagsRequest request) {
        return new AsyncInvoker<ListLoadbalancersByTagsRequest, ListLoadbalancersByTagsResponse>(request,
            ElbMeta.listLoadbalancersByTags, hcClient);
    }

    /**
     * 查询后端云服务器列表
     *
     * 查询属于某个后端云服务器组的后端云服务器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListMembersRequest 请求对象
     * @return CompletableFuture<ListMembersResponse>
     */
    public CompletableFuture<ListMembersResponse> listMembersAsync(ListMembersRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.listMembers);
    }

    /**
     * 查询后端云服务器列表
     *
     * 查询属于某个后端云服务器组的后端云服务器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListMembersRequest 请求对象
     * @return AsyncInvoker<ListMembersRequest, ListMembersResponse>
     */
    public AsyncInvoker<ListMembersRequest, ListMembersResponse> listMembersAsyncInvoker(ListMembersRequest request) {
        return new AsyncInvoker<ListMembersRequest, ListMembersResponse>(request, ElbMeta.listMembers, hcClient);
    }

    /**
     * 查询后端云服务器组列表
     *
     * 查询后端云服务器组列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPoolsRequest 请求对象
     * @return CompletableFuture<ListPoolsResponse>
     */
    public CompletableFuture<ListPoolsResponse> listPoolsAsync(ListPoolsRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.listPools);
    }

    /**
     * 查询后端云服务器组列表
     *
     * 查询后端云服务器组列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPoolsRequest 请求对象
     * @return AsyncInvoker<ListPoolsRequest, ListPoolsResponse>
     */
    public AsyncInvoker<ListPoolsRequest, ListPoolsResponse> listPoolsAsyncInvoker(ListPoolsRequest request) {
        return new AsyncInvoker<ListPoolsRequest, ListPoolsResponse>(request, ElbMeta.listPools, hcClient);
    }

    /**
     * 查询白名单列表
     *
     * 查询白名单，支持过滤查询和分页查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListWhitelistsRequest 请求对象
     * @return CompletableFuture<ListWhitelistsResponse>
     */
    public CompletableFuture<ListWhitelistsResponse> listWhitelistsAsync(ListWhitelistsRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.listWhitelists);
    }

    /**
     * 查询白名单列表
     *
     * 查询白名单，支持过滤查询和分页查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListWhitelistsRequest 请求对象
     * @return AsyncInvoker<ListWhitelistsRequest, ListWhitelistsResponse>
     */
    public AsyncInvoker<ListWhitelistsRequest, ListWhitelistsResponse> listWhitelistsAsyncInvoker(
        ListWhitelistsRequest request) {
        return new AsyncInvoker<ListWhitelistsRequest, ListWhitelistsResponse>(request, ElbMeta.listWhitelists,
            hcClient);
    }

    /**
     * 查询健康检查详情
     *
     * 根据指定ID查询健康检查详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowHealthmonitorsRequest 请求对象
     * @return CompletableFuture<ShowHealthmonitorsResponse>
     */
    public CompletableFuture<ShowHealthmonitorsResponse> showHealthmonitorsAsync(ShowHealthmonitorsRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.showHealthmonitors);
    }

    /**
     * 查询健康检查详情
     *
     * 根据指定ID查询健康检查详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowHealthmonitorsRequest 请求对象
     * @return AsyncInvoker<ShowHealthmonitorsRequest, ShowHealthmonitorsResponse>
     */
    public AsyncInvoker<ShowHealthmonitorsRequest, ShowHealthmonitorsResponse> showHealthmonitorsAsyncInvoker(
        ShowHealthmonitorsRequest request) {
        return new AsyncInvoker<ShowHealthmonitorsRequest, ShowHealthmonitorsResponse>(request,
            ElbMeta.showHealthmonitors, hcClient);
    }

    /**
     * 查询转发策略详情
     *
     * 根据指定ID查询转发策略详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowL7policyRequest 请求对象
     * @return CompletableFuture<ShowL7policyResponse>
     */
    public CompletableFuture<ShowL7policyResponse> showL7policyAsync(ShowL7policyRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.showL7policy);
    }

    /**
     * 查询转发策略详情
     *
     * 根据指定ID查询转发策略详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowL7policyRequest 请求对象
     * @return AsyncInvoker<ShowL7policyRequest, ShowL7policyResponse>
     */
    public AsyncInvoker<ShowL7policyRequest, ShowL7policyResponse> showL7policyAsyncInvoker(
        ShowL7policyRequest request) {
        return new AsyncInvoker<ShowL7policyRequest, ShowL7policyResponse>(request, ElbMeta.showL7policy, hcClient);
    }

    /**
     * 查询转发规则详情
     *
     * 根据指定ID查询某转发策略下关联的转发规则详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowL7ruleRequest 请求对象
     * @return CompletableFuture<ShowL7ruleResponse>
     */
    public CompletableFuture<ShowL7ruleResponse> showL7ruleAsync(ShowL7ruleRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.showL7rule);
    }

    /**
     * 查询转发规则详情
     *
     * 根据指定ID查询某转发策略下关联的转发规则详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowL7ruleRequest 请求对象
     * @return AsyncInvoker<ShowL7ruleRequest, ShowL7ruleResponse>
     */
    public AsyncInvoker<ShowL7ruleRequest, ShowL7ruleResponse> showL7ruleAsyncInvoker(ShowL7ruleRequest request) {
        return new AsyncInvoker<ShowL7ruleRequest, ShowL7ruleResponse>(request, ElbMeta.showL7rule, hcClient);
    }

    /**
     * 查询监听器详情
     *
     * 根据指定ID查询监听器详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowListenerRequest 请求对象
     * @return CompletableFuture<ShowListenerResponse>
     */
    public CompletableFuture<ShowListenerResponse> showListenerAsync(ShowListenerRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.showListener);
    }

    /**
     * 查询监听器详情
     *
     * 根据指定ID查询监听器详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowListenerRequest 请求对象
     * @return AsyncInvoker<ShowListenerRequest, ShowListenerResponse>
     */
    public AsyncInvoker<ShowListenerRequest, ShowListenerResponse> showListenerAsyncInvoker(
        ShowListenerRequest request) {
        return new AsyncInvoker<ShowListenerRequest, ShowListenerResponse>(request, ElbMeta.showListener, hcClient);
    }

    /**
     * 查询监听器的标签详情
     *
     * 查询指定监听器的所有标签信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowListenerTagsRequest 请求对象
     * @return CompletableFuture<ShowListenerTagsResponse>
     */
    public CompletableFuture<ShowListenerTagsResponse> showListenerTagsAsync(ShowListenerTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.showListenerTags);
    }

    /**
     * 查询监听器的标签详情
     *
     * 查询指定监听器的所有标签信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowListenerTagsRequest 请求对象
     * @return AsyncInvoker<ShowListenerTagsRequest, ShowListenerTagsResponse>
     */
    public AsyncInvoker<ShowListenerTagsRequest, ShowListenerTagsResponse> showListenerTagsAsyncInvoker(
        ShowListenerTagsRequest request) {
        return new AsyncInvoker<ShowListenerTagsRequest, ShowListenerTagsResponse>(request, ElbMeta.showListenerTags,
            hcClient);
    }

    /**
     * 查询负载均衡详情
     *
     * 根据指定负载均衡器ID查询负载均衡器详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowLoadbalancerRequest 请求对象
     * @return CompletableFuture<ShowLoadbalancerResponse>
     */
    public CompletableFuture<ShowLoadbalancerResponse> showLoadbalancerAsync(ShowLoadbalancerRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.showLoadbalancer);
    }

    /**
     * 查询负载均衡详情
     *
     * 根据指定负载均衡器ID查询负载均衡器详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowLoadbalancerRequest 请求对象
     * @return AsyncInvoker<ShowLoadbalancerRequest, ShowLoadbalancerResponse>
     */
    public AsyncInvoker<ShowLoadbalancerRequest, ShowLoadbalancerResponse> showLoadbalancerAsyncInvoker(
        ShowLoadbalancerRequest request) {
        return new AsyncInvoker<ShowLoadbalancerRequest, ShowLoadbalancerResponse>(request, ElbMeta.showLoadbalancer,
            hcClient);
    }

    /**
     * 查询负载均衡器的标签详情
     *
     * 查询指定负载均衡器的所有标签信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowLoadbalancerTagsRequest 请求对象
     * @return CompletableFuture<ShowLoadbalancerTagsResponse>
     */
    public CompletableFuture<ShowLoadbalancerTagsResponse> showLoadbalancerTagsAsync(
        ShowLoadbalancerTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.showLoadbalancerTags);
    }

    /**
     * 查询负载均衡器的标签详情
     *
     * 查询指定负载均衡器的所有标签信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowLoadbalancerTagsRequest 请求对象
     * @return AsyncInvoker<ShowLoadbalancerTagsRequest, ShowLoadbalancerTagsResponse>
     */
    public AsyncInvoker<ShowLoadbalancerTagsRequest, ShowLoadbalancerTagsResponse> showLoadbalancerTagsAsyncInvoker(
        ShowLoadbalancerTagsRequest request) {
        return new AsyncInvoker<ShowLoadbalancerTagsRequest, ShowLoadbalancerTagsResponse>(request,
            ElbMeta.showLoadbalancerTags, hcClient);
    }

    /**
     * 查询负载均衡状态树
     *
     * 查询负载均衡器状态树。可通过该接口查询负载均衡器关联的监听器、后端云服务器组、后端云服务器、健康检查、转发策略、转发规则的主要信息，了解负载均衡器下资源的拓扑情况。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowLoadbalancersStatusRequest 请求对象
     * @return CompletableFuture<ShowLoadbalancersStatusResponse>
     */
    public CompletableFuture<ShowLoadbalancersStatusResponse> showLoadbalancersStatusAsync(
        ShowLoadbalancersStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.showLoadbalancersStatus);
    }

    /**
     * 查询负载均衡状态树
     *
     * 查询负载均衡器状态树。可通过该接口查询负载均衡器关联的监听器、后端云服务器组、后端云服务器、健康检查、转发策略、转发规则的主要信息，了解负载均衡器下资源的拓扑情况。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowLoadbalancersStatusRequest 请求对象
     * @return AsyncInvoker<ShowLoadbalancersStatusRequest, ShowLoadbalancersStatusResponse>
     */
    public AsyncInvoker<ShowLoadbalancersStatusRequest, ShowLoadbalancersStatusResponse> showLoadbalancersStatusAsyncInvoker(
        ShowLoadbalancersStatusRequest request) {
        return new AsyncInvoker<ShowLoadbalancersStatusRequest, ShowLoadbalancersStatusResponse>(request,
            ElbMeta.showLoadbalancersStatus, hcClient);
    }

    /**
     * 查询后端云服务器详情
     *
     * 根据指定ID查询后端云服务器详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowMemberRequest 请求对象
     * @return CompletableFuture<ShowMemberResponse>
     */
    public CompletableFuture<ShowMemberResponse> showMemberAsync(ShowMemberRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.showMember);
    }

    /**
     * 查询后端云服务器详情
     *
     * 根据指定ID查询后端云服务器详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowMemberRequest 请求对象
     * @return AsyncInvoker<ShowMemberRequest, ShowMemberResponse>
     */
    public AsyncInvoker<ShowMemberRequest, ShowMemberResponse> showMemberAsyncInvoker(ShowMemberRequest request) {
        return new AsyncInvoker<ShowMemberRequest, ShowMemberResponse>(request, ElbMeta.showMember, hcClient);
    }

    /**
     * 查询后端云服务器组详情
     *
     * 根据指定ID查询后端云服务器组详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPoolRequest 请求对象
     * @return CompletableFuture<ShowPoolResponse>
     */
    public CompletableFuture<ShowPoolResponse> showPoolAsync(ShowPoolRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.showPool);
    }

    /**
     * 查询后端云服务器组详情
     *
     * 根据指定ID查询后端云服务器组详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPoolRequest 请求对象
     * @return AsyncInvoker<ShowPoolRequest, ShowPoolResponse>
     */
    public AsyncInvoker<ShowPoolRequest, ShowPoolResponse> showPoolAsyncInvoker(ShowPoolRequest request) {
        return new AsyncInvoker<ShowPoolRequest, ShowPoolResponse>(request, ElbMeta.showPool, hcClient);
    }

    /**
     * 查询白名单详情
     *
     * 根据指定ID查询白名单详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowWhitelistRequest 请求对象
     * @return CompletableFuture<ShowWhitelistResponse>
     */
    public CompletableFuture<ShowWhitelistResponse> showWhitelistAsync(ShowWhitelistRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.showWhitelist);
    }

    /**
     * 查询白名单详情
     *
     * 根据指定ID查询白名单详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowWhitelistRequest 请求对象
     * @return AsyncInvoker<ShowWhitelistRequest, ShowWhitelistResponse>
     */
    public AsyncInvoker<ShowWhitelistRequest, ShowWhitelistResponse> showWhitelistAsyncInvoker(
        ShowWhitelistRequest request) {
        return new AsyncInvoker<ShowWhitelistRequest, ShowWhitelistResponse>(request, ElbMeta.showWhitelist, hcClient);
    }

    /**
     * 更新健康检查
     *
     * 更新健康检查
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateHealthmonitorRequest 请求对象
     * @return CompletableFuture<UpdateHealthmonitorResponse>
     */
    public CompletableFuture<UpdateHealthmonitorResponse> updateHealthmonitorAsync(UpdateHealthmonitorRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.updateHealthmonitor);
    }

    /**
     * 更新健康检查
     *
     * 更新健康检查
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateHealthmonitorRequest 请求对象
     * @return AsyncInvoker<UpdateHealthmonitorRequest, UpdateHealthmonitorResponse>
     */
    public AsyncInvoker<UpdateHealthmonitorRequest, UpdateHealthmonitorResponse> updateHealthmonitorAsyncInvoker(
        UpdateHealthmonitorRequest request) {
        return new AsyncInvoker<UpdateHealthmonitorRequest, UpdateHealthmonitorResponse>(request,
            ElbMeta.updateHealthmonitor, hcClient);
    }

    /**
     * 更新转发策略
     *
     * 更新转发策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateL7policiesRequest 请求对象
     * @return CompletableFuture<UpdateL7policiesResponse>
     */
    public CompletableFuture<UpdateL7policiesResponse> updateL7policiesAsync(UpdateL7policiesRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.updateL7policies);
    }

    /**
     * 更新转发策略
     *
     * 更新转发策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateL7policiesRequest 请求对象
     * @return AsyncInvoker<UpdateL7policiesRequest, UpdateL7policiesResponse>
     */
    public AsyncInvoker<UpdateL7policiesRequest, UpdateL7policiesResponse> updateL7policiesAsyncInvoker(
        UpdateL7policiesRequest request) {
        return new AsyncInvoker<UpdateL7policiesRequest, UpdateL7policiesResponse>(request, ElbMeta.updateL7policies,
            hcClient);
    }

    /**
     * 更新转发规则
     *
     * 更新指定的转发规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateL7ruleRequest 请求对象
     * @return CompletableFuture<UpdateL7ruleResponse>
     */
    public CompletableFuture<UpdateL7ruleResponse> updateL7ruleAsync(UpdateL7ruleRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.updateL7rule);
    }

    /**
     * 更新转发规则
     *
     * 更新指定的转发规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateL7ruleRequest 请求对象
     * @return AsyncInvoker<UpdateL7ruleRequest, UpdateL7ruleResponse>
     */
    public AsyncInvoker<UpdateL7ruleRequest, UpdateL7ruleResponse> updateL7ruleAsyncInvoker(
        UpdateL7ruleRequest request) {
        return new AsyncInvoker<UpdateL7ruleRequest, UpdateL7ruleResponse>(request, ElbMeta.updateL7rule, hcClient);
    }

    /**
     * 更新监听器
     *
     * 更新监听器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateListenerRequest 请求对象
     * @return CompletableFuture<UpdateListenerResponse>
     */
    public CompletableFuture<UpdateListenerResponse> updateListenerAsync(UpdateListenerRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.updateListener);
    }

    /**
     * 更新监听器
     *
     * 更新监听器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateListenerRequest 请求对象
     * @return AsyncInvoker<UpdateListenerRequest, UpdateListenerResponse>
     */
    public AsyncInvoker<UpdateListenerRequest, UpdateListenerResponse> updateListenerAsyncInvoker(
        UpdateListenerRequest request) {
        return new AsyncInvoker<UpdateListenerRequest, UpdateListenerResponse>(request, ElbMeta.updateListener,
            hcClient);
    }

    /**
     * 更新负载均衡器
     *
     * 更新负载均衡器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateLoadbalancerRequest 请求对象
     * @return CompletableFuture<UpdateLoadbalancerResponse>
     */
    public CompletableFuture<UpdateLoadbalancerResponse> updateLoadbalancerAsync(UpdateLoadbalancerRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.updateLoadbalancer);
    }

    /**
     * 更新负载均衡器
     *
     * 更新负载均衡器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateLoadbalancerRequest 请求对象
     * @return AsyncInvoker<UpdateLoadbalancerRequest, UpdateLoadbalancerResponse>
     */
    public AsyncInvoker<UpdateLoadbalancerRequest, UpdateLoadbalancerResponse> updateLoadbalancerAsyncInvoker(
        UpdateLoadbalancerRequest request) {
        return new AsyncInvoker<UpdateLoadbalancerRequest, UpdateLoadbalancerResponse>(request,
            ElbMeta.updateLoadbalancer, hcClient);
    }

    /**
     * 更新后端云服务器
     *
     * 更新后端云服务器
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateMemberRequest 请求对象
     * @return CompletableFuture<UpdateMemberResponse>
     */
    public CompletableFuture<UpdateMemberResponse> updateMemberAsync(UpdateMemberRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.updateMember);
    }

    /**
     * 更新后端云服务器
     *
     * 更新后端云服务器
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateMemberRequest 请求对象
     * @return AsyncInvoker<UpdateMemberRequest, UpdateMemberResponse>
     */
    public AsyncInvoker<UpdateMemberRequest, UpdateMemberResponse> updateMemberAsyncInvoker(
        UpdateMemberRequest request) {
        return new AsyncInvoker<UpdateMemberRequest, UpdateMemberResponse>(request, ElbMeta.updateMember, hcClient);
    }

    /**
     * 更新后端云服务器组
     *
     * 更新后端云服务器组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdatePoolRequest 请求对象
     * @return CompletableFuture<UpdatePoolResponse>
     */
    public CompletableFuture<UpdatePoolResponse> updatePoolAsync(UpdatePoolRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.updatePool);
    }

    /**
     * 更新后端云服务器组
     *
     * 更新后端云服务器组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdatePoolRequest 请求对象
     * @return AsyncInvoker<UpdatePoolRequest, UpdatePoolResponse>
     */
    public AsyncInvoker<UpdatePoolRequest, UpdatePoolResponse> updatePoolAsyncInvoker(UpdatePoolRequest request) {
        return new AsyncInvoker<UpdatePoolRequest, UpdatePoolResponse>(request, ElbMeta.updatePool, hcClient);
    }

    /**
     * 更新白名单
     *
     * 更新白名单。可以打开或关闭白名单，或更新访问控制的IP。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateWhitelistRequest 请求对象
     * @return CompletableFuture<UpdateWhitelistResponse>
     */
    public CompletableFuture<UpdateWhitelistResponse> updateWhitelistAsync(UpdateWhitelistRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.updateWhitelist);
    }

    /**
     * 更新白名单
     *
     * 更新白名单。可以打开或关闭白名单，或更新访问控制的IP。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateWhitelistRequest 请求对象
     * @return AsyncInvoker<UpdateWhitelistRequest, UpdateWhitelistResponse>
     */
    public AsyncInvoker<UpdateWhitelistRequest, UpdateWhitelistResponse> updateWhitelistAsyncInvoker(
        UpdateWhitelistRequest request) {
        return new AsyncInvoker<UpdateWhitelistRequest, UpdateWhitelistResponse>(request, ElbMeta.updateWhitelist,
            hcClient);
    }

    /**
     * 创建SSL证书
     *
     * 创建SSL证书。将监听器和SSL证书绑定后，可以通过负载均衡器实现服务端认证，后端服务器只要提供HTTP服务就能实现安全可靠的连接。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateCertificateRequest 请求对象
     * @return CompletableFuture<CreateCertificateResponse>
     */
    public CompletableFuture<CreateCertificateResponse> createCertificateAsync(CreateCertificateRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.createCertificate);
    }

    /**
     * 创建SSL证书
     *
     * 创建SSL证书。将监听器和SSL证书绑定后，可以通过负载均衡器实现服务端认证，后端服务器只要提供HTTP服务就能实现安全可靠的连接。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateCertificateRequest 请求对象
     * @return AsyncInvoker<CreateCertificateRequest, CreateCertificateResponse>
     */
    public AsyncInvoker<CreateCertificateRequest, CreateCertificateResponse> createCertificateAsyncInvoker(
        CreateCertificateRequest request) {
        return new AsyncInvoker<CreateCertificateRequest, CreateCertificateResponse>(request, ElbMeta.createCertificate,
            hcClient);
    }

    /**
     * 删除SSL证书
     *
     * 删除指定的SSL证书
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteCertificateRequest 请求对象
     * @return CompletableFuture<DeleteCertificateResponse>
     */
    public CompletableFuture<DeleteCertificateResponse> deleteCertificateAsync(DeleteCertificateRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.deleteCertificate);
    }

    /**
     * 删除SSL证书
     *
     * 删除指定的SSL证书
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteCertificateRequest 请求对象
     * @return AsyncInvoker<DeleteCertificateRequest, DeleteCertificateResponse>
     */
    public AsyncInvoker<DeleteCertificateRequest, DeleteCertificateResponse> deleteCertificateAsyncInvoker(
        DeleteCertificateRequest request) {
        return new AsyncInvoker<DeleteCertificateRequest, DeleteCertificateResponse>(request, ElbMeta.deleteCertificate,
            hcClient);
    }

    /**
     * 查询SSL证书列表
     *
     * 查询SSL证书。支持过滤查询和分页查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListCertificatesRequest 请求对象
     * @return CompletableFuture<ListCertificatesResponse>
     */
    public CompletableFuture<ListCertificatesResponse> listCertificatesAsync(ListCertificatesRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.listCertificates);
    }

    /**
     * 查询SSL证书列表
     *
     * 查询SSL证书。支持过滤查询和分页查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListCertificatesRequest 请求对象
     * @return AsyncInvoker<ListCertificatesRequest, ListCertificatesResponse>
     */
    public AsyncInvoker<ListCertificatesRequest, ListCertificatesResponse> listCertificatesAsyncInvoker(
        ListCertificatesRequest request) {
        return new AsyncInvoker<ListCertificatesRequest, ListCertificatesResponse>(request, ElbMeta.listCertificates,
            hcClient);
    }

    /**
     * 查询SSL证书详情
     *
     * 查询指定SSL证书的详情信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowCertificateRequest 请求对象
     * @return CompletableFuture<ShowCertificateResponse>
     */
    public CompletableFuture<ShowCertificateResponse> showCertificateAsync(ShowCertificateRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.showCertificate);
    }

    /**
     * 查询SSL证书详情
     *
     * 查询指定SSL证书的详情信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowCertificateRequest 请求对象
     * @return AsyncInvoker<ShowCertificateRequest, ShowCertificateResponse>
     */
    public AsyncInvoker<ShowCertificateRequest, ShowCertificateResponse> showCertificateAsyncInvoker(
        ShowCertificateRequest request) {
        return new AsyncInvoker<ShowCertificateRequest, ShowCertificateResponse>(request, ElbMeta.showCertificate,
            hcClient);
    }

    /**
     * 更新SSL证书
     *
     * 更新指定的SSL证书
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateCertificateRequest 请求对象
     * @return CompletableFuture<UpdateCertificateResponse>
     */
    public CompletableFuture<UpdateCertificateResponse> updateCertificateAsync(UpdateCertificateRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.updateCertificate);
    }

    /**
     * 更新SSL证书
     *
     * 更新指定的SSL证书
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateCertificateRequest 请求对象
     * @return AsyncInvoker<UpdateCertificateRequest, UpdateCertificateResponse>
     */
    public AsyncInvoker<UpdateCertificateRequest, UpdateCertificateResponse> updateCertificateAsyncInvoker(
        UpdateCertificateRequest request) {
        return new AsyncInvoker<UpdateCertificateRequest, UpdateCertificateResponse>(request, ElbMeta.updateCertificate,
            hcClient);
    }

}
