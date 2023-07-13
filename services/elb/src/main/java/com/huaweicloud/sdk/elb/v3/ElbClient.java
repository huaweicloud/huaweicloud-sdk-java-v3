package com.huaweicloud.sdk.elb.v3;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
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
     * 批量创建后端服务器
     *
     * 在指定pool下批量创建后端服务器。一次最多添加200个。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchCreateMembersRequest 请求对象
     * @return BatchCreateMembersResponse
     */
    public BatchCreateMembersResponse batchCreateMembers(BatchCreateMembersRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.batchCreateMembers);
    }

    /**
     * 批量创建后端服务器
     *
     * 在指定pool下批量创建后端服务器。一次最多添加200个。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchCreateMembersRequest 请求对象
     * @return SyncInvoker<BatchCreateMembersRequest, BatchCreateMembersResponse>
     */
    public SyncInvoker<BatchCreateMembersRequest, BatchCreateMembersResponse> batchCreateMembersInvoker(
        BatchCreateMembersRequest request) {
        return new SyncInvoker<BatchCreateMembersRequest, BatchCreateMembersResponse>(request,
            ElbMeta.batchCreateMembers, hcClient);
    }

    /**
     * 批量删除后端服务器
     *
     * 在指定pool下批量删除后端服务器。一次最多添加200个。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchDeleteMembersRequest 请求对象
     * @return BatchDeleteMembersResponse
     */
    public BatchDeleteMembersResponse batchDeleteMembers(BatchDeleteMembersRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.batchDeleteMembers);
    }

    /**
     * 批量删除后端服务器
     *
     * 在指定pool下批量删除后端服务器。一次最多添加200个。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchDeleteMembersRequest 请求对象
     * @return SyncInvoker<BatchDeleteMembersRequest, BatchDeleteMembersResponse>
     */
    public SyncInvoker<BatchDeleteMembersRequest, BatchDeleteMembersResponse> batchDeleteMembersInvoker(
        BatchDeleteMembersRequest request) {
        return new SyncInvoker<BatchDeleteMembersRequest, BatchDeleteMembersResponse>(request,
            ElbMeta.batchDeleteMembers, hcClient);
    }

    /**
     * 批量更新后端服务器
     *
     * 在指定pool下批量更新后端服务器。一次最多添加200个。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchUpdateMembersRequest 请求对象
     * @return BatchUpdateMembersResponse
     */
    public BatchUpdateMembersResponse batchUpdateMembers(BatchUpdateMembersRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.batchUpdateMembers);
    }

    /**
     * 批量更新后端服务器
     *
     * 在指定pool下批量更新后端服务器。一次最多添加200个。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchUpdateMembersRequest 请求对象
     * @return SyncInvoker<BatchUpdateMembersRequest, BatchUpdateMembersResponse>
     */
    public SyncInvoker<BatchUpdateMembersRequest, BatchUpdateMembersResponse> batchUpdateMembersInvoker(
        BatchUpdateMembersRequest request) {
        return new SyncInvoker<BatchUpdateMembersRequest, BatchUpdateMembersResponse>(request,
            ElbMeta.batchUpdateMembers, hcClient);
    }

    /**
     * 批量更新转发策略优先级
     *
     * 批量更新转发策略的优先级。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchUpdatePoliciesPriorityRequest 请求对象
     * @return BatchUpdatePoliciesPriorityResponse
     */
    public BatchUpdatePoliciesPriorityResponse batchUpdatePoliciesPriority(BatchUpdatePoliciesPriorityRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.batchUpdatePoliciesPriority);
    }

    /**
     * 批量更新转发策略优先级
     *
     * 批量更新转发策略的优先级。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchUpdatePoliciesPriorityRequest 请求对象
     * @return SyncInvoker<BatchUpdatePoliciesPriorityRequest, BatchUpdatePoliciesPriorityResponse>
     */
    public SyncInvoker<BatchUpdatePoliciesPriorityRequest, BatchUpdatePoliciesPriorityResponse> batchUpdatePoliciesPriorityInvoker(
        BatchUpdatePoliciesPriorityRequest request) {
        return new SyncInvoker<BatchUpdatePoliciesPriorityRequest, BatchUpdatePoliciesPriorityResponse>(request,
            ElbMeta.batchUpdatePoliciesPriority, hcClient);
    }

    /**
     * 变更负载均衡器计费模式
     *
     * 负载均衡器计费模式变更，当前支持的计费模式变更为：
     * 1. 按需计费转包周期计费；
     * 2. 按需按规格计费转按需按使用量计费；
     * 3. 按需按使用量计费转按需按规格计费；
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ChangeLoadbalancerChargeModeRequest 请求对象
     * @return ChangeLoadbalancerChargeModeResponse
     */
    public ChangeLoadbalancerChargeModeResponse changeLoadbalancerChargeMode(
        ChangeLoadbalancerChargeModeRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.changeLoadbalancerChargeMode);
    }

    /**
     * 变更负载均衡器计费模式
     *
     * 负载均衡器计费模式变更，当前支持的计费模式变更为：
     * 1. 按需计费转包周期计费；
     * 2. 按需按规格计费转按需按使用量计费；
     * 3. 按需按使用量计费转按需按规格计费；
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ChangeLoadbalancerChargeModeRequest 请求对象
     * @return SyncInvoker<ChangeLoadbalancerChargeModeRequest, ChangeLoadbalancerChargeModeResponse>
     */
    public SyncInvoker<ChangeLoadbalancerChargeModeRequest, ChangeLoadbalancerChargeModeResponse> changeLoadbalancerChargeModeInvoker(
        ChangeLoadbalancerChargeModeRequest request) {
        return new SyncInvoker<ChangeLoadbalancerChargeModeRequest, ChangeLoadbalancerChargeModeResponse>(request,
            ElbMeta.changeLoadbalancerChargeMode, hcClient);
    }

    /**
     * 创建证书
     *
     * 创建证书。用于HTTPS协议监听器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateCertificateRequest 请求对象
     * @return CreateCertificateResponse
     */
    public CreateCertificateResponse createCertificate(CreateCertificateRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.createCertificate);
    }

    /**
     * 创建证书
     *
     * 创建证书。用于HTTPS协议监听器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateCertificateRequest 请求对象
     * @return SyncInvoker<CreateCertificateRequest, CreateCertificateResponse>
     */
    public SyncInvoker<CreateCertificateRequest, CreateCertificateResponse> createCertificateInvoker(
        CreateCertificateRequest request) {
        return new SyncInvoker<CreateCertificateRequest, CreateCertificateResponse>(request, ElbMeta.createCertificate,
            hcClient);
    }

    /**
     * 创建健康检查
     *
     * 创建健康检查。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateHealthMonitorRequest 请求对象
     * @return CreateHealthMonitorResponse
     */
    public CreateHealthMonitorResponse createHealthMonitor(CreateHealthMonitorRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.createHealthMonitor);
    }

    /**
     * 创建健康检查
     *
     * 创建健康检查。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateHealthMonitorRequest 请求对象
     * @return SyncInvoker<CreateHealthMonitorRequest, CreateHealthMonitorResponse>
     */
    public SyncInvoker<CreateHealthMonitorRequest, CreateHealthMonitorResponse> createHealthMonitorInvoker(
        CreateHealthMonitorRequest request) {
        return new SyncInvoker<CreateHealthMonitorRequest, CreateHealthMonitorResponse>(request,
            ElbMeta.createHealthMonitor, hcClient);
    }

    /**
     * 创建转发策略
     *
     * 创建七层转发策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateL7PolicyRequest 请求对象
     * @return CreateL7PolicyResponse
     */
    public CreateL7PolicyResponse createL7Policy(CreateL7PolicyRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.createL7Policy);
    }

    /**
     * 创建转发策略
     *
     * 创建七层转发策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateL7PolicyRequest 请求对象
     * @return SyncInvoker<CreateL7PolicyRequest, CreateL7PolicyResponse>
     */
    public SyncInvoker<CreateL7PolicyRequest, CreateL7PolicyResponse> createL7PolicyInvoker(
        CreateL7PolicyRequest request) {
        return new SyncInvoker<CreateL7PolicyRequest, CreateL7PolicyResponse>(request, ElbMeta.createL7Policy,
            hcClient);
    }

    /**
     * 创建转发规则
     *
     * 创建七层转发规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateL7RuleRequest 请求对象
     * @return CreateL7RuleResponse
     */
    public CreateL7RuleResponse createL7Rule(CreateL7RuleRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.createL7Rule);
    }

    /**
     * 创建转发规则
     *
     * 创建七层转发规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateL7RuleRequest 请求对象
     * @return SyncInvoker<CreateL7RuleRequest, CreateL7RuleResponse>
     */
    public SyncInvoker<CreateL7RuleRequest, CreateL7RuleResponse> createL7RuleInvoker(CreateL7RuleRequest request) {
        return new SyncInvoker<CreateL7RuleRequest, CreateL7RuleResponse>(request, ElbMeta.createL7Rule, hcClient);
    }

    /**
     * 创建监听器
     *
     * 创建监听器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateListenerRequest 请求对象
     * @return CreateListenerResponse
     */
    public CreateListenerResponse createListener(CreateListenerRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.createListener);
    }

    /**
     * 创建监听器
     *
     * 创建监听器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateListenerRequest 请求对象
     * @return SyncInvoker<CreateListenerRequest, CreateListenerResponse>
     */
    public SyncInvoker<CreateListenerRequest, CreateListenerResponse> createListenerInvoker(
        CreateListenerRequest request) {
        return new SyncInvoker<CreateListenerRequest, CreateListenerResponse>(request, ElbMeta.createListener,
            hcClient);
    }

    /**
     * 创建负载均衡器
     *
     * 创建负载均衡器。
     * 1. 若要创建内网IPv4负载均衡器，则需要设置vip_subnet_cidr_id。
     * 2. 若要创建公网IPv4负载均衡器，则需要设置publicip，以及设置vpc_id和vip_subnet_cidr_id这两个参数中的一个。
     * 3. 若要绑定有已有公网IPv4地址，
     * 则需要设置publicip_ids，以及设置vpc_id和vip_subnet_cidr_id这两个参数中的一个。
     * 4. 若要创建内网双栈负载均衡器，则需要设置ipv6_vip_virsubnet_id。
     * 5. 若要创建公网双栈负载均衡器，则需要设置ipv6_vip_virsubnet_id和ipv6_bandwidth。
     * 6. 不支持绑定已有未使用的内网IPv4、内网IPv6或公网IPv6地址。
     * 
     * [&gt; 不支持创建IPv6地址负载均衡器](tag:dt,dt_test)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateLoadBalancerRequest 请求对象
     * @return CreateLoadBalancerResponse
     */
    public CreateLoadBalancerResponse createLoadBalancer(CreateLoadBalancerRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.createLoadBalancer);
    }

    /**
     * 创建负载均衡器
     *
     * 创建负载均衡器。
     * 1. 若要创建内网IPv4负载均衡器，则需要设置vip_subnet_cidr_id。
     * 2. 若要创建公网IPv4负载均衡器，则需要设置publicip，以及设置vpc_id和vip_subnet_cidr_id这两个参数中的一个。
     * 3. 若要绑定有已有公网IPv4地址，
     * 则需要设置publicip_ids，以及设置vpc_id和vip_subnet_cidr_id这两个参数中的一个。
     * 4. 若要创建内网双栈负载均衡器，则需要设置ipv6_vip_virsubnet_id。
     * 5. 若要创建公网双栈负载均衡器，则需要设置ipv6_vip_virsubnet_id和ipv6_bandwidth。
     * 6. 不支持绑定已有未使用的内网IPv4、内网IPv6或公网IPv6地址。
     * 
     * [&gt; 不支持创建IPv6地址负载均衡器](tag:dt,dt_test)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateLoadBalancerRequest 请求对象
     * @return SyncInvoker<CreateLoadBalancerRequest, CreateLoadBalancerResponse>
     */
    public SyncInvoker<CreateLoadBalancerRequest, CreateLoadBalancerResponse> createLoadBalancerInvoker(
        CreateLoadBalancerRequest request) {
        return new SyncInvoker<CreateLoadBalancerRequest, CreateLoadBalancerResponse>(request,
            ElbMeta.createLoadBalancer, hcClient);
    }

    /**
     * 创建云日志
     *
     * 创建云日志。[荷兰region不支持云日志功能，请勿使用。](tag:dt)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateLogtankRequest 请求对象
     * @return CreateLogtankResponse
     */
    public CreateLogtankResponse createLogtank(CreateLogtankRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.createLogtank);
    }

    /**
     * 创建云日志
     *
     * 创建云日志。[荷兰region不支持云日志功能，请勿使用。](tag:dt)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateLogtankRequest 请求对象
     * @return SyncInvoker<CreateLogtankRequest, CreateLogtankResponse>
     */
    public SyncInvoker<CreateLogtankRequest, CreateLogtankResponse> createLogtankInvoker(CreateLogtankRequest request) {
        return new SyncInvoker<CreateLogtankRequest, CreateLogtankResponse>(request, ElbMeta.createLogtank, hcClient);
    }

    /**
     * 创建后端服务器
     *
     * 创建后端服务器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateMemberRequest 请求对象
     * @return CreateMemberResponse
     */
    public CreateMemberResponse createMember(CreateMemberRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.createMember);
    }

    /**
     * 创建后端服务器
     *
     * 创建后端服务器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateMemberRequest 请求对象
     * @return SyncInvoker<CreateMemberRequest, CreateMemberResponse>
     */
    public SyncInvoker<CreateMemberRequest, CreateMemberResponse> createMemberInvoker(CreateMemberRequest request) {
        return new SyncInvoker<CreateMemberRequest, CreateMemberResponse>(request, ElbMeta.createMember, hcClient);
    }

    /**
     * 创建后端服务器组
     *
     * 创建后端服务器组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreatePoolRequest 请求对象
     * @return CreatePoolResponse
     */
    public CreatePoolResponse createPool(CreatePoolRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.createPool);
    }

    /**
     * 创建后端服务器组
     *
     * 创建后端服务器组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreatePoolRequest 请求对象
     * @return SyncInvoker<CreatePoolRequest, CreatePoolResponse>
     */
    public SyncInvoker<CreatePoolRequest, CreatePoolResponse> createPoolInvoker(CreatePoolRequest request) {
        return new SyncInvoker<CreatePoolRequest, CreatePoolResponse>(request, ElbMeta.createPool, hcClient);
    }

    /**
     * 创建自定义安全策略
     *
     * 创建自定义安全策略。用于在创建HTTPS监听器时，请求参数中指定security_policy_id来设置监听器的自定义安全策略。
     * 
     * [荷兰region不支持自定义安全策略功能，请勿使用。](tag:dt)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateSecurityPolicyRequest 请求对象
     * @return CreateSecurityPolicyResponse
     */
    public CreateSecurityPolicyResponse createSecurityPolicy(CreateSecurityPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.createSecurityPolicy);
    }

    /**
     * 创建自定义安全策略
     *
     * 创建自定义安全策略。用于在创建HTTPS监听器时，请求参数中指定security_policy_id来设置监听器的自定义安全策略。
     * 
     * [荷兰region不支持自定义安全策略功能，请勿使用。](tag:dt)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateSecurityPolicyRequest 请求对象
     * @return SyncInvoker<CreateSecurityPolicyRequest, CreateSecurityPolicyResponse>
     */
    public SyncInvoker<CreateSecurityPolicyRequest, CreateSecurityPolicyResponse> createSecurityPolicyInvoker(
        CreateSecurityPolicyRequest request) {
        return new SyncInvoker<CreateSecurityPolicyRequest, CreateSecurityPolicyResponse>(request,
            ElbMeta.createSecurityPolicy, hcClient);
    }

    /**
     * 删除证书
     *
     * 删除证书。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteCertificateRequest 请求对象
     * @return DeleteCertificateResponse
     */
    public DeleteCertificateResponse deleteCertificate(DeleteCertificateRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.deleteCertificate);
    }

    /**
     * 删除证书
     *
     * 删除证书。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteCertificateRequest 请求对象
     * @return SyncInvoker<DeleteCertificateRequest, DeleteCertificateResponse>
     */
    public SyncInvoker<DeleteCertificateRequest, DeleteCertificateResponse> deleteCertificateInvoker(
        DeleteCertificateRequest request) {
        return new SyncInvoker<DeleteCertificateRequest, DeleteCertificateResponse>(request, ElbMeta.deleteCertificate,
            hcClient);
    }

    /**
     * 删除健康检查
     *
     * 删除健康检查。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteHealthMonitorRequest 请求对象
     * @return DeleteHealthMonitorResponse
     */
    public DeleteHealthMonitorResponse deleteHealthMonitor(DeleteHealthMonitorRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.deleteHealthMonitor);
    }

    /**
     * 删除健康检查
     *
     * 删除健康检查。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteHealthMonitorRequest 请求对象
     * @return SyncInvoker<DeleteHealthMonitorRequest, DeleteHealthMonitorResponse>
     */
    public SyncInvoker<DeleteHealthMonitorRequest, DeleteHealthMonitorResponse> deleteHealthMonitorInvoker(
        DeleteHealthMonitorRequest request) {
        return new SyncInvoker<DeleteHealthMonitorRequest, DeleteHealthMonitorResponse>(request,
            ElbMeta.deleteHealthMonitor, hcClient);
    }

    /**
     * 删除转发策略
     *
     * 删除七层转发策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteL7PolicyRequest 请求对象
     * @return DeleteL7PolicyResponse
     */
    public DeleteL7PolicyResponse deleteL7Policy(DeleteL7PolicyRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.deleteL7Policy);
    }

    /**
     * 删除转发策略
     *
     * 删除七层转发策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteL7PolicyRequest 请求对象
     * @return SyncInvoker<DeleteL7PolicyRequest, DeleteL7PolicyResponse>
     */
    public SyncInvoker<DeleteL7PolicyRequest, DeleteL7PolicyResponse> deleteL7PolicyInvoker(
        DeleteL7PolicyRequest request) {
        return new SyncInvoker<DeleteL7PolicyRequest, DeleteL7PolicyResponse>(request, ElbMeta.deleteL7Policy,
            hcClient);
    }

    /**
     * 删除转发规则
     *
     * 删除七层转发规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteL7RuleRequest 请求对象
     * @return DeleteL7RuleResponse
     */
    public DeleteL7RuleResponse deleteL7Rule(DeleteL7RuleRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.deleteL7Rule);
    }

    /**
     * 删除转发规则
     *
     * 删除七层转发规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteL7RuleRequest 请求对象
     * @return SyncInvoker<DeleteL7RuleRequest, DeleteL7RuleResponse>
     */
    public SyncInvoker<DeleteL7RuleRequest, DeleteL7RuleResponse> deleteL7RuleInvoker(DeleteL7RuleRequest request) {
        return new SyncInvoker<DeleteL7RuleRequest, DeleteL7RuleResponse>(request, ElbMeta.deleteL7Rule, hcClient);
    }

    /**
     * 删除监听器
     *
     * 删除监听器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteListenerRequest 请求对象
     * @return DeleteListenerResponse
     */
    public DeleteListenerResponse deleteListener(DeleteListenerRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.deleteListener);
    }

    /**
     * 删除监听器
     *
     * 删除监听器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteListenerRequest 请求对象
     * @return SyncInvoker<DeleteListenerRequest, DeleteListenerResponse>
     */
    public SyncInvoker<DeleteListenerRequest, DeleteListenerResponse> deleteListenerInvoker(
        DeleteListenerRequest request) {
        return new SyncInvoker<DeleteListenerRequest, DeleteListenerResponse>(request, ElbMeta.deleteListener,
            hcClient);
    }

    /**
     * 级联删除监听器
     *
     * 删除监听器且级联删除其下子资源（删除监听器、转发策略等，解绑后端服务器组）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteListenerForceRequest 请求对象
     * @return DeleteListenerForceResponse
     */
    public DeleteListenerForceResponse deleteListenerForce(DeleteListenerForceRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.deleteListenerForce);
    }

    /**
     * 级联删除监听器
     *
     * 删除监听器且级联删除其下子资源（删除监听器、转发策略等，解绑后端服务器组）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteListenerForceRequest 请求对象
     * @return SyncInvoker<DeleteListenerForceRequest, DeleteListenerForceResponse>
     */
    public SyncInvoker<DeleteListenerForceRequest, DeleteListenerForceResponse> deleteListenerForceInvoker(
        DeleteListenerForceRequest request) {
        return new SyncInvoker<DeleteListenerForceRequest, DeleteListenerForceResponse>(request,
            ElbMeta.deleteListenerForce, hcClient);
    }

    /**
     * 删除负载均衡器
     *
     * 删除负载均衡器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteLoadBalancerRequest 请求对象
     * @return DeleteLoadBalancerResponse
     */
    public DeleteLoadBalancerResponse deleteLoadBalancer(DeleteLoadBalancerRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.deleteLoadBalancer);
    }

    /**
     * 删除负载均衡器
     *
     * 删除负载均衡器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteLoadBalancerRequest 请求对象
     * @return SyncInvoker<DeleteLoadBalancerRequest, DeleteLoadBalancerResponse>
     */
    public SyncInvoker<DeleteLoadBalancerRequest, DeleteLoadBalancerResponse> deleteLoadBalancerInvoker(
        DeleteLoadBalancerRequest request) {
        return new SyncInvoker<DeleteLoadBalancerRequest, DeleteLoadBalancerResponse>(request,
            ElbMeta.deleteLoadBalancer, hcClient);
    }

    /**
     * 级联删除负载均衡器
     *
     * 删除负载均衡器且级联删除其下子资源（删除负载均衡器及其绑定的监听器、后端服务器组、后端服务器等一系列资源）
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteLoadBalancerForceRequest 请求对象
     * @return DeleteLoadBalancerForceResponse
     */
    public DeleteLoadBalancerForceResponse deleteLoadBalancerForce(DeleteLoadBalancerForceRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.deleteLoadBalancerForce);
    }

    /**
     * 级联删除负载均衡器
     *
     * 删除负载均衡器且级联删除其下子资源（删除负载均衡器及其绑定的监听器、后端服务器组、后端服务器等一系列资源）
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteLoadBalancerForceRequest 请求对象
     * @return SyncInvoker<DeleteLoadBalancerForceRequest, DeleteLoadBalancerForceResponse>
     */
    public SyncInvoker<DeleteLoadBalancerForceRequest, DeleteLoadBalancerForceResponse> deleteLoadBalancerForceInvoker(
        DeleteLoadBalancerForceRequest request) {
        return new SyncInvoker<DeleteLoadBalancerForceRequest, DeleteLoadBalancerForceResponse>(request,
            ElbMeta.deleteLoadBalancerForce, hcClient);
    }

    /**
     * 删除云日志
     *
     * 删除云日志。[荷兰region不支持云日志功能，请勿使用。](tag:dt)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteLogtankRequest 请求对象
     * @return DeleteLogtankResponse
     */
    public DeleteLogtankResponse deleteLogtank(DeleteLogtankRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.deleteLogtank);
    }

    /**
     * 删除云日志
     *
     * 删除云日志。[荷兰region不支持云日志功能，请勿使用。](tag:dt)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteLogtankRequest 请求对象
     * @return SyncInvoker<DeleteLogtankRequest, DeleteLogtankResponse>
     */
    public SyncInvoker<DeleteLogtankRequest, DeleteLogtankResponse> deleteLogtankInvoker(DeleteLogtankRequest request) {
        return new SyncInvoker<DeleteLogtankRequest, DeleteLogtankResponse>(request, ElbMeta.deleteLogtank, hcClient);
    }

    /**
     * 删除后端服务器
     *
     * 删除后端服务器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteMemberRequest 请求对象
     * @return DeleteMemberResponse
     */
    public DeleteMemberResponse deleteMember(DeleteMemberRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.deleteMember);
    }

    /**
     * 删除后端服务器
     *
     * 删除后端服务器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteMemberRequest 请求对象
     * @return SyncInvoker<DeleteMemberRequest, DeleteMemberResponse>
     */
    public SyncInvoker<DeleteMemberRequest, DeleteMemberResponse> deleteMemberInvoker(DeleteMemberRequest request) {
        return new SyncInvoker<DeleteMemberRequest, DeleteMemberResponse>(request, ElbMeta.deleteMember, hcClient);
    }

    /**
     * 删除后端服务器组
     *
     * 删除后端服务器组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeletePoolRequest 请求对象
     * @return DeletePoolResponse
     */
    public DeletePoolResponse deletePool(DeletePoolRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.deletePool);
    }

    /**
     * 删除后端服务器组
     *
     * 删除后端服务器组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeletePoolRequest 请求对象
     * @return SyncInvoker<DeletePoolRequest, DeletePoolResponse>
     */
    public SyncInvoker<DeletePoolRequest, DeletePoolResponse> deletePoolInvoker(DeletePoolRequest request) {
        return new SyncInvoker<DeletePoolRequest, DeletePoolResponse>(request, ElbMeta.deletePool, hcClient);
    }

    /**
     * 删除自定义安全策略
     *
     * 删除自定义安全策略。[荷兰region不支持自定义安全策略功能，请勿使用。](tag:dt)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteSecurityPolicyRequest 请求对象
     * @return DeleteSecurityPolicyResponse
     */
    public DeleteSecurityPolicyResponse deleteSecurityPolicy(DeleteSecurityPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.deleteSecurityPolicy);
    }

    /**
     * 删除自定义安全策略
     *
     * 删除自定义安全策略。[荷兰region不支持自定义安全策略功能，请勿使用。](tag:dt)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteSecurityPolicyRequest 请求对象
     * @return SyncInvoker<DeleteSecurityPolicyRequest, DeleteSecurityPolicyResponse>
     */
    public SyncInvoker<DeleteSecurityPolicyRequest, DeleteSecurityPolicyResponse> deleteSecurityPolicyInvoker(
        DeleteSecurityPolicyRequest request) {
        return new SyncInvoker<DeleteSecurityPolicyRequest, DeleteSecurityPolicyResponse>(request,
            ElbMeta.deleteSecurityPolicy, hcClient);
    }

    /**
     * 后端服务器全局列表
     *
     * 查询当前租户下的后端服务器列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAllMembersRequest 请求对象
     * @return ListAllMembersResponse
     */
    public ListAllMembersResponse listAllMembers(ListAllMembersRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.listAllMembers);
    }

    /**
     * 后端服务器全局列表
     *
     * 查询当前租户下的后端服务器列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAllMembersRequest 请求对象
     * @return SyncInvoker<ListAllMembersRequest, ListAllMembersResponse>
     */
    public SyncInvoker<ListAllMembersRequest, ListAllMembersResponse> listAllMembersInvoker(
        ListAllMembersRequest request) {
        return new SyncInvoker<ListAllMembersRequest, ListAllMembersResponse>(request, ElbMeta.listAllMembers,
            hcClient);
    }

    /**
     * 查询可用区列表
     *
     * 返回租户创建LB时可使用的可用区集合列表情况。
     * 
     * - 默认情况下，会返回一个可用区集合。
     * 在（如创建LB）设置可用区时，填写的可用区必须包含在可用区集合中、为这个可用区集合的子集。
     * 
     * - 特殊场景下，部分客户要求负载均衡只能创建在指定可用区集合中，此时会返回客户定制的可用区集合。
     * 返回可用区集合可能为一个也可能为多个，比如列表有两个可用区集合\\[az1,az2\\],\\[az2,az3\\]。
     * 在创建负载均衡器时，可以选择创建在多个可用区，但所选的多个可用区必须同属于其中一个可用区集合，
     * 如可以选az2和az3，但不能选择az1和az3。你可以选择多个可用区，只要这些可用区在一个子集中
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAvailabilityZonesRequest 请求对象
     * @return ListAvailabilityZonesResponse
     */
    public ListAvailabilityZonesResponse listAvailabilityZones(ListAvailabilityZonesRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.listAvailabilityZones);
    }

    /**
     * 查询可用区列表
     *
     * 返回租户创建LB时可使用的可用区集合列表情况。
     * 
     * - 默认情况下，会返回一个可用区集合。
     * 在（如创建LB）设置可用区时，填写的可用区必须包含在可用区集合中、为这个可用区集合的子集。
     * 
     * - 特殊场景下，部分客户要求负载均衡只能创建在指定可用区集合中，此时会返回客户定制的可用区集合。
     * 返回可用区集合可能为一个也可能为多个，比如列表有两个可用区集合\\[az1,az2\\],\\[az2,az3\\]。
     * 在创建负载均衡器时，可以选择创建在多个可用区，但所选的多个可用区必须同属于其中一个可用区集合，
     * 如可以选az2和az3，但不能选择az1和az3。你可以选择多个可用区，只要这些可用区在一个子集中
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAvailabilityZonesRequest 请求对象
     * @return SyncInvoker<ListAvailabilityZonesRequest, ListAvailabilityZonesResponse>
     */
    public SyncInvoker<ListAvailabilityZonesRequest, ListAvailabilityZonesResponse> listAvailabilityZonesInvoker(
        ListAvailabilityZonesRequest request) {
        return new SyncInvoker<ListAvailabilityZonesRequest, ListAvailabilityZonesResponse>(request,
            ElbMeta.listAvailabilityZones, hcClient);
    }

    /**
     * 查询证书列表
     *
     * 查询证书列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListCertificatesRequest 请求对象
     * @return ListCertificatesResponse
     */
    public ListCertificatesResponse listCertificates(ListCertificatesRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.listCertificates);
    }

    /**
     * 查询证书列表
     *
     * 查询证书列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListCertificatesRequest 请求对象
     * @return SyncInvoker<ListCertificatesRequest, ListCertificatesResponse>
     */
    public SyncInvoker<ListCertificatesRequest, ListCertificatesResponse> listCertificatesInvoker(
        ListCertificatesRequest request) {
        return new SyncInvoker<ListCertificatesRequest, ListCertificatesResponse>(request, ElbMeta.listCertificates,
            hcClient);
    }

    /**
     * 查询规格列表
     *
     * 查询租户在当前region下可用的负载均衡规格列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListFlavorsRequest 请求对象
     * @return ListFlavorsResponse
     */
    public ListFlavorsResponse listFlavors(ListFlavorsRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.listFlavors);
    }

    /**
     * 查询规格列表
     *
     * 查询租户在当前region下可用的负载均衡规格列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListFlavorsRequest 请求对象
     * @return SyncInvoker<ListFlavorsRequest, ListFlavorsResponse>
     */
    public SyncInvoker<ListFlavorsRequest, ListFlavorsResponse> listFlavorsInvoker(ListFlavorsRequest request) {
        return new SyncInvoker<ListFlavorsRequest, ListFlavorsResponse>(request, ElbMeta.listFlavors, hcClient);
    }

    /**
     * 查询健康检查列表
     *
     * 健康检查列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListHealthMonitorsRequest 请求对象
     * @return ListHealthMonitorsResponse
     */
    public ListHealthMonitorsResponse listHealthMonitors(ListHealthMonitorsRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.listHealthMonitors);
    }

    /**
     * 查询健康检查列表
     *
     * 健康检查列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListHealthMonitorsRequest 请求对象
     * @return SyncInvoker<ListHealthMonitorsRequest, ListHealthMonitorsResponse>
     */
    public SyncInvoker<ListHealthMonitorsRequest, ListHealthMonitorsResponse> listHealthMonitorsInvoker(
        ListHealthMonitorsRequest request) {
        return new SyncInvoker<ListHealthMonitorsRequest, ListHealthMonitorsResponse>(request,
            ElbMeta.listHealthMonitors, hcClient);
    }

    /**
     * 查询转发策略列表
     *
     * 查询七层转发策略列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListL7PoliciesRequest 请求对象
     * @return ListL7PoliciesResponse
     */
    public ListL7PoliciesResponse listL7Policies(ListL7PoliciesRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.listL7Policies);
    }

    /**
     * 查询转发策略列表
     *
     * 查询七层转发策略列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListL7PoliciesRequest 请求对象
     * @return SyncInvoker<ListL7PoliciesRequest, ListL7PoliciesResponse>
     */
    public SyncInvoker<ListL7PoliciesRequest, ListL7PoliciesResponse> listL7PoliciesInvoker(
        ListL7PoliciesRequest request) {
        return new SyncInvoker<ListL7PoliciesRequest, ListL7PoliciesResponse>(request, ElbMeta.listL7Policies,
            hcClient);
    }

    /**
     * 查询转发规则列表
     *
     * 查询转发规则列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListL7RulesRequest 请求对象
     * @return ListL7RulesResponse
     */
    public ListL7RulesResponse listL7Rules(ListL7RulesRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.listL7Rules);
    }

    /**
     * 查询转发规则列表
     *
     * 查询转发规则列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListL7RulesRequest 请求对象
     * @return SyncInvoker<ListL7RulesRequest, ListL7RulesResponse>
     */
    public SyncInvoker<ListL7RulesRequest, ListL7RulesResponse> listL7RulesInvoker(ListL7RulesRequest request) {
        return new SyncInvoker<ListL7RulesRequest, ListL7RulesResponse>(request, ElbMeta.listL7Rules, hcClient);
    }

    /**
     * 查询监听器列表
     *
     * 查询监听器列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListListenersRequest 请求对象
     * @return ListListenersResponse
     */
    public ListListenersResponse listListeners(ListListenersRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.listListeners);
    }

    /**
     * 查询监听器列表
     *
     * 查询监听器列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListListenersRequest 请求对象
     * @return SyncInvoker<ListListenersRequest, ListListenersResponse>
     */
    public SyncInvoker<ListListenersRequest, ListListenersResponse> listListenersInvoker(ListListenersRequest request) {
        return new SyncInvoker<ListListenersRequest, ListListenersResponse>(request, ElbMeta.listListeners, hcClient);
    }

    /**
     * 查询负载均衡器列表
     *
     * 查询负载均衡器列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListLoadBalancersRequest 请求对象
     * @return ListLoadBalancersResponse
     */
    public ListLoadBalancersResponse listLoadBalancers(ListLoadBalancersRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.listLoadBalancers);
    }

    /**
     * 查询负载均衡器列表
     *
     * 查询负载均衡器列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListLoadBalancersRequest 请求对象
     * @return SyncInvoker<ListLoadBalancersRequest, ListLoadBalancersResponse>
     */
    public SyncInvoker<ListLoadBalancersRequest, ListLoadBalancersResponse> listLoadBalancersInvoker(
        ListLoadBalancersRequest request) {
        return new SyncInvoker<ListLoadBalancersRequest, ListLoadBalancersResponse>(request, ElbMeta.listLoadBalancers,
            hcClient);
    }

    /**
     * 查询云日志列表
     *
     * 查询云日志列表。[荷兰region不支持云日志功能，请勿使用。](tag:dt)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListLogtanksRequest 请求对象
     * @return ListLogtanksResponse
     */
    public ListLogtanksResponse listLogtanks(ListLogtanksRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.listLogtanks);
    }

    /**
     * 查询云日志列表
     *
     * 查询云日志列表。[荷兰region不支持云日志功能，请勿使用。](tag:dt)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListLogtanksRequest 请求对象
     * @return SyncInvoker<ListLogtanksRequest, ListLogtanksResponse>
     */
    public SyncInvoker<ListLogtanksRequest, ListLogtanksResponse> listLogtanksInvoker(ListLogtanksRequest request) {
        return new SyncInvoker<ListLogtanksRequest, ListLogtanksResponse>(request, ElbMeta.listLogtanks, hcClient);
    }

    /**
     * 查询后端服务器列表
     *
     * Pool下的后端服务器列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListMembersRequest 请求对象
     * @return ListMembersResponse
     */
    public ListMembersResponse listMembers(ListMembersRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.listMembers);
    }

    /**
     * 查询后端服务器列表
     *
     * Pool下的后端服务器列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListMembersRequest 请求对象
     * @return SyncInvoker<ListMembersRequest, ListMembersResponse>
     */
    public SyncInvoker<ListMembersRequest, ListMembersResponse> listMembersInvoker(ListMembersRequest request) {
        return new SyncInvoker<ListMembersRequest, ListMembersResponse>(request, ElbMeta.listMembers, hcClient);
    }

    /**
     * 查询后端服务器组列表
     *
     * 后端服务器组列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPoolsRequest 请求对象
     * @return ListPoolsResponse
     */
    public ListPoolsResponse listPools(ListPoolsRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.listPools);
    }

    /**
     * 查询后端服务器组列表
     *
     * 后端服务器组列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPoolsRequest 请求对象
     * @return SyncInvoker<ListPoolsRequest, ListPoolsResponse>
     */
    public SyncInvoker<ListPoolsRequest, ListPoolsResponse> listPoolsInvoker(ListPoolsRequest request) {
        return new SyncInvoker<ListPoolsRequest, ListPoolsResponse>(request, ElbMeta.listPools, hcClient);
    }

    /**
     * 查询配额使用详情
     *
     * 查询指定项目中负载均衡相关的各类资源的当前配额和已使用配额信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListQuotaDetailsRequest 请求对象
     * @return ListQuotaDetailsResponse
     */
    public ListQuotaDetailsResponse listQuotaDetails(ListQuotaDetailsRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.listQuotaDetails);
    }

    /**
     * 查询配额使用详情
     *
     * 查询指定项目中负载均衡相关的各类资源的当前配额和已使用配额信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListQuotaDetailsRequest 请求对象
     * @return SyncInvoker<ListQuotaDetailsRequest, ListQuotaDetailsResponse>
     */
    public SyncInvoker<ListQuotaDetailsRequest, ListQuotaDetailsResponse> listQuotaDetailsInvoker(
        ListQuotaDetailsRequest request) {
        return new SyncInvoker<ListQuotaDetailsRequest, ListQuotaDetailsResponse>(request, ElbMeta.listQuotaDetails,
            hcClient);
    }

    /**
     * 查询自定义安全策略列表
     *
     * 查询自定义安全策略列表。[荷兰region不支持自定义安全策略功能，请勿使用。](tag:dt)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSecurityPoliciesRequest 请求对象
     * @return ListSecurityPoliciesResponse
     */
    public ListSecurityPoliciesResponse listSecurityPolicies(ListSecurityPoliciesRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.listSecurityPolicies);
    }

    /**
     * 查询自定义安全策略列表
     *
     * 查询自定义安全策略列表。[荷兰region不支持自定义安全策略功能，请勿使用。](tag:dt)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSecurityPoliciesRequest 请求对象
     * @return SyncInvoker<ListSecurityPoliciesRequest, ListSecurityPoliciesResponse>
     */
    public SyncInvoker<ListSecurityPoliciesRequest, ListSecurityPoliciesResponse> listSecurityPoliciesInvoker(
        ListSecurityPoliciesRequest request) {
        return new SyncInvoker<ListSecurityPoliciesRequest, ListSecurityPoliciesResponse>(request,
            ElbMeta.listSecurityPolicies, hcClient);
    }

    /**
     * 查询系统安全策略列表
     *
     * 查询系统安全策略列表。
     * 
     * 系统安全策略为预置的所有租户通用的安全策略，租户不可新增或修改。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSystemSecurityPoliciesRequest 请求对象
     * @return ListSystemSecurityPoliciesResponse
     */
    public ListSystemSecurityPoliciesResponse listSystemSecurityPolicies(ListSystemSecurityPoliciesRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.listSystemSecurityPolicies);
    }

    /**
     * 查询系统安全策略列表
     *
     * 查询系统安全策略列表。
     * 
     * 系统安全策略为预置的所有租户通用的安全策略，租户不可新增或修改。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSystemSecurityPoliciesRequest 请求对象
     * @return SyncInvoker<ListSystemSecurityPoliciesRequest, ListSystemSecurityPoliciesResponse>
     */
    public SyncInvoker<ListSystemSecurityPoliciesRequest, ListSystemSecurityPoliciesResponse> listSystemSecurityPoliciesInvoker(
        ListSystemSecurityPoliciesRequest request) {
        return new SyncInvoker<ListSystemSecurityPoliciesRequest, ListSystemSecurityPoliciesResponse>(request,
            ElbMeta.listSystemSecurityPolicies, hcClient);
    }

    /**
     * 查询证书详情
     *
     * 查询证书详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowCertificateRequest 请求对象
     * @return ShowCertificateResponse
     */
    public ShowCertificateResponse showCertificate(ShowCertificateRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.showCertificate);
    }

    /**
     * 查询证书详情
     *
     * 查询证书详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowCertificateRequest 请求对象
     * @return SyncInvoker<ShowCertificateRequest, ShowCertificateResponse>
     */
    public SyncInvoker<ShowCertificateRequest, ShowCertificateResponse> showCertificateInvoker(
        ShowCertificateRequest request) {
        return new SyncInvoker<ShowCertificateRequest, ShowCertificateResponse>(request, ElbMeta.showCertificate,
            hcClient);
    }

    /**
     * 查询规格详情
     *
     * 查询规格的详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowFlavorRequest 请求对象
     * @return ShowFlavorResponse
     */
    public ShowFlavorResponse showFlavor(ShowFlavorRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.showFlavor);
    }

    /**
     * 查询规格详情
     *
     * 查询规格的详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowFlavorRequest 请求对象
     * @return SyncInvoker<ShowFlavorRequest, ShowFlavorResponse>
     */
    public SyncInvoker<ShowFlavorRequest, ShowFlavorResponse> showFlavorInvoker(ShowFlavorRequest request) {
        return new SyncInvoker<ShowFlavorRequest, ShowFlavorResponse>(request, ElbMeta.showFlavor, hcClient);
    }

    /**
     * 查询健康检查详情
     *
     * 查询健康检查详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowHealthMonitorRequest 请求对象
     * @return ShowHealthMonitorResponse
     */
    public ShowHealthMonitorResponse showHealthMonitor(ShowHealthMonitorRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.showHealthMonitor);
    }

    /**
     * 查询健康检查详情
     *
     * 查询健康检查详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowHealthMonitorRequest 请求对象
     * @return SyncInvoker<ShowHealthMonitorRequest, ShowHealthMonitorResponse>
     */
    public SyncInvoker<ShowHealthMonitorRequest, ShowHealthMonitorResponse> showHealthMonitorInvoker(
        ShowHealthMonitorRequest request) {
        return new SyncInvoker<ShowHealthMonitorRequest, ShowHealthMonitorResponse>(request, ElbMeta.showHealthMonitor,
            hcClient);
    }

    /**
     * 查询转发策略详情
     *
     * 查询七层转发策略详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowL7PolicyRequest 请求对象
     * @return ShowL7PolicyResponse
     */
    public ShowL7PolicyResponse showL7Policy(ShowL7PolicyRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.showL7Policy);
    }

    /**
     * 查询转发策略详情
     *
     * 查询七层转发策略详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowL7PolicyRequest 请求对象
     * @return SyncInvoker<ShowL7PolicyRequest, ShowL7PolicyResponse>
     */
    public SyncInvoker<ShowL7PolicyRequest, ShowL7PolicyResponse> showL7PolicyInvoker(ShowL7PolicyRequest request) {
        return new SyncInvoker<ShowL7PolicyRequest, ShowL7PolicyResponse>(request, ElbMeta.showL7Policy, hcClient);
    }

    /**
     * 查询转发规则详情
     *
     * 查询七层转发规则详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowL7RuleRequest 请求对象
     * @return ShowL7RuleResponse
     */
    public ShowL7RuleResponse showL7Rule(ShowL7RuleRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.showL7Rule);
    }

    /**
     * 查询转发规则详情
     *
     * 查询七层转发规则详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowL7RuleRequest 请求对象
     * @return SyncInvoker<ShowL7RuleRequest, ShowL7RuleResponse>
     */
    public SyncInvoker<ShowL7RuleRequest, ShowL7RuleResponse> showL7RuleInvoker(ShowL7RuleRequest request) {
        return new SyncInvoker<ShowL7RuleRequest, ShowL7RuleResponse>(request, ElbMeta.showL7Rule, hcClient);
    }

    /**
     * 查询监听器详情
     *
     * 监听器详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowListenerRequest 请求对象
     * @return ShowListenerResponse
     */
    public ShowListenerResponse showListener(ShowListenerRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.showListener);
    }

    /**
     * 查询监听器详情
     *
     * 监听器详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowListenerRequest 请求对象
     * @return SyncInvoker<ShowListenerRequest, ShowListenerResponse>
     */
    public SyncInvoker<ShowListenerRequest, ShowListenerResponse> showListenerInvoker(ShowListenerRequest request) {
        return new SyncInvoker<ShowListenerRequest, ShowListenerResponse>(request, ElbMeta.showListener, hcClient);
    }

    /**
     * 查询负载均衡器详情
     *
     * 查询负载均衡器详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowLoadBalancerRequest 请求对象
     * @return ShowLoadBalancerResponse
     */
    public ShowLoadBalancerResponse showLoadBalancer(ShowLoadBalancerRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.showLoadBalancer);
    }

    /**
     * 查询负载均衡器详情
     *
     * 查询负载均衡器详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowLoadBalancerRequest 请求对象
     * @return SyncInvoker<ShowLoadBalancerRequest, ShowLoadBalancerResponse>
     */
    public SyncInvoker<ShowLoadBalancerRequest, ShowLoadBalancerResponse> showLoadBalancerInvoker(
        ShowLoadBalancerRequest request) {
        return new SyncInvoker<ShowLoadBalancerRequest, ShowLoadBalancerResponse>(request, ElbMeta.showLoadBalancer,
            hcClient);
    }

    /**
     * 查询负载均衡器状态树
     *
     * 查询负载均衡器状态树，包括负载均衡器及其关联的子资源的状态信息。
     * 注意：该接口中的operating_status不一定与对应资源的operating_status相同。
     * 如：当Member的admin_state_up&#x3D;false且operating_status&#x3D;OFFLINE时，
     * 该接口返回member的operating_status&#x3D;DISABLE。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowLoadBalancerStatusRequest 请求对象
     * @return ShowLoadBalancerStatusResponse
     */
    public ShowLoadBalancerStatusResponse showLoadBalancerStatus(ShowLoadBalancerStatusRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.showLoadBalancerStatus);
    }

    /**
     * 查询负载均衡器状态树
     *
     * 查询负载均衡器状态树，包括负载均衡器及其关联的子资源的状态信息。
     * 注意：该接口中的operating_status不一定与对应资源的operating_status相同。
     * 如：当Member的admin_state_up&#x3D;false且operating_status&#x3D;OFFLINE时，
     * 该接口返回member的operating_status&#x3D;DISABLE。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowLoadBalancerStatusRequest 请求对象
     * @return SyncInvoker<ShowLoadBalancerStatusRequest, ShowLoadBalancerStatusResponse>
     */
    public SyncInvoker<ShowLoadBalancerStatusRequest, ShowLoadBalancerStatusResponse> showLoadBalancerStatusInvoker(
        ShowLoadBalancerStatusRequest request) {
        return new SyncInvoker<ShowLoadBalancerStatusRequest, ShowLoadBalancerStatusResponse>(request,
            ElbMeta.showLoadBalancerStatus, hcClient);
    }

    /**
     * 查询云日志详情
     *
     * 云日志详情。[荷兰region不支持云日志功能，请勿使用。](tag:dt)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowLogtankRequest 请求对象
     * @return ShowLogtankResponse
     */
    public ShowLogtankResponse showLogtank(ShowLogtankRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.showLogtank);
    }

    /**
     * 查询云日志详情
     *
     * 云日志详情。[荷兰region不支持云日志功能，请勿使用。](tag:dt)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowLogtankRequest 请求对象
     * @return SyncInvoker<ShowLogtankRequest, ShowLogtankResponse>
     */
    public SyncInvoker<ShowLogtankRequest, ShowLogtankResponse> showLogtankInvoker(ShowLogtankRequest request) {
        return new SyncInvoker<ShowLogtankRequest, ShowLogtankResponse>(request, ElbMeta.showLogtank, hcClient);
    }

    /**
     * 查询后端服务器详情
     *
     * 后端服务器详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowMemberRequest 请求对象
     * @return ShowMemberResponse
     */
    public ShowMemberResponse showMember(ShowMemberRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.showMember);
    }

    /**
     * 查询后端服务器详情
     *
     * 后端服务器详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowMemberRequest 请求对象
     * @return SyncInvoker<ShowMemberRequest, ShowMemberResponse>
     */
    public SyncInvoker<ShowMemberRequest, ShowMemberResponse> showMemberInvoker(ShowMemberRequest request) {
        return new SyncInvoker<ShowMemberRequest, ShowMemberResponse>(request, ElbMeta.showMember, hcClient);
    }

    /**
     * 查询后端服务器组详情
     *
     * 后端服务器组详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPoolRequest 请求对象
     * @return ShowPoolResponse
     */
    public ShowPoolResponse showPool(ShowPoolRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.showPool);
    }

    /**
     * 查询后端服务器组详情
     *
     * 后端服务器组详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPoolRequest 请求对象
     * @return SyncInvoker<ShowPoolRequest, ShowPoolResponse>
     */
    public SyncInvoker<ShowPoolRequest, ShowPoolResponse> showPoolInvoker(ShowPoolRequest request) {
        return new SyncInvoker<ShowPoolRequest, ShowPoolResponse>(request, ElbMeta.showPool, hcClient);
    }

    /**
     * 查询配额详情
     *
     * 查询指定项目中负载均衡相关的各类资源的当前配额。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowQuotaRequest 请求对象
     * @return ShowQuotaResponse
     */
    public ShowQuotaResponse showQuota(ShowQuotaRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.showQuota);
    }

    /**
     * 查询配额详情
     *
     * 查询指定项目中负载均衡相关的各类资源的当前配额。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowQuotaRequest 请求对象
     * @return SyncInvoker<ShowQuotaRequest, ShowQuotaResponse>
     */
    public SyncInvoker<ShowQuotaRequest, ShowQuotaResponse> showQuotaInvoker(ShowQuotaRequest request) {
        return new SyncInvoker<ShowQuotaRequest, ShowQuotaResponse>(request, ElbMeta.showQuota, hcClient);
    }

    /**
     * 查询自定义安全策略详情
     *
     * 查询自定义安全策略详情。[荷兰region不支持自定义安全策略功能，请勿使用。](tag:dt)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowSecurityPolicyRequest 请求对象
     * @return ShowSecurityPolicyResponse
     */
    public ShowSecurityPolicyResponse showSecurityPolicy(ShowSecurityPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.showSecurityPolicy);
    }

    /**
     * 查询自定义安全策略详情
     *
     * 查询自定义安全策略详情。[荷兰region不支持自定义安全策略功能，请勿使用。](tag:dt)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowSecurityPolicyRequest 请求对象
     * @return SyncInvoker<ShowSecurityPolicyRequest, ShowSecurityPolicyResponse>
     */
    public SyncInvoker<ShowSecurityPolicyRequest, ShowSecurityPolicyResponse> showSecurityPolicyInvoker(
        ShowSecurityPolicyRequest request) {
        return new SyncInvoker<ShowSecurityPolicyRequest, ShowSecurityPolicyResponse>(request,
            ElbMeta.showSecurityPolicy, hcClient);
    }

    /**
     * 更新证书
     *
     * 更新证书。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateCertificateRequest 请求对象
     * @return UpdateCertificateResponse
     */
    public UpdateCertificateResponse updateCertificate(UpdateCertificateRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.updateCertificate);
    }

    /**
     * 更新证书
     *
     * 更新证书。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateCertificateRequest 请求对象
     * @return SyncInvoker<UpdateCertificateRequest, UpdateCertificateResponse>
     */
    public SyncInvoker<UpdateCertificateRequest, UpdateCertificateResponse> updateCertificateInvoker(
        UpdateCertificateRequest request) {
        return new SyncInvoker<UpdateCertificateRequest, UpdateCertificateResponse>(request, ElbMeta.updateCertificate,
            hcClient);
    }

    /**
     * 更新健康检查
     *
     * 更新健康检查。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateHealthMonitorRequest 请求对象
     * @return UpdateHealthMonitorResponse
     */
    public UpdateHealthMonitorResponse updateHealthMonitor(UpdateHealthMonitorRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.updateHealthMonitor);
    }

    /**
     * 更新健康检查
     *
     * 更新健康检查。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateHealthMonitorRequest 请求对象
     * @return SyncInvoker<UpdateHealthMonitorRequest, UpdateHealthMonitorResponse>
     */
    public SyncInvoker<UpdateHealthMonitorRequest, UpdateHealthMonitorResponse> updateHealthMonitorInvoker(
        UpdateHealthMonitorRequest request) {
        return new SyncInvoker<UpdateHealthMonitorRequest, UpdateHealthMonitorResponse>(request,
            ElbMeta.updateHealthMonitor, hcClient);
    }

    /**
     * 更新转发策略
     *
     * 更新七层转发策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateL7PolicyRequest 请求对象
     * @return UpdateL7PolicyResponse
     */
    public UpdateL7PolicyResponse updateL7Policy(UpdateL7PolicyRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.updateL7Policy);
    }

    /**
     * 更新转发策略
     *
     * 更新七层转发策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateL7PolicyRequest 请求对象
     * @return SyncInvoker<UpdateL7PolicyRequest, UpdateL7PolicyResponse>
     */
    public SyncInvoker<UpdateL7PolicyRequest, UpdateL7PolicyResponse> updateL7PolicyInvoker(
        UpdateL7PolicyRequest request) {
        return new SyncInvoker<UpdateL7PolicyRequest, UpdateL7PolicyResponse>(request, ElbMeta.updateL7Policy,
            hcClient);
    }

    /**
     * 更新转发规则
     *
     * 更新七层转发规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateL7RuleRequest 请求对象
     * @return UpdateL7RuleResponse
     */
    public UpdateL7RuleResponse updateL7Rule(UpdateL7RuleRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.updateL7Rule);
    }

    /**
     * 更新转发规则
     *
     * 更新七层转发规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateL7RuleRequest 请求对象
     * @return SyncInvoker<UpdateL7RuleRequest, UpdateL7RuleResponse>
     */
    public SyncInvoker<UpdateL7RuleRequest, UpdateL7RuleResponse> updateL7RuleInvoker(UpdateL7RuleRequest request) {
        return new SyncInvoker<UpdateL7RuleRequest, UpdateL7RuleResponse>(request, ElbMeta.updateL7Rule, hcClient);
    }

    /**
     * 更新监听器
     *
     * 更新监听器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateListenerRequest 请求对象
     * @return UpdateListenerResponse
     */
    public UpdateListenerResponse updateListener(UpdateListenerRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.updateListener);
    }

    /**
     * 更新监听器
     *
     * 更新监听器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateListenerRequest 请求对象
     * @return SyncInvoker<UpdateListenerRequest, UpdateListenerResponse>
     */
    public SyncInvoker<UpdateListenerRequest, UpdateListenerResponse> updateListenerInvoker(
        UpdateListenerRequest request) {
        return new SyncInvoker<UpdateListenerRequest, UpdateListenerResponse>(request, ElbMeta.updateListener,
            hcClient);
    }

    /**
     * 更新负载均衡器
     *
     * 更新负载均衡器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateLoadBalancerRequest 请求对象
     * @return UpdateLoadBalancerResponse
     */
    public UpdateLoadBalancerResponse updateLoadBalancer(UpdateLoadBalancerRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.updateLoadBalancer);
    }

    /**
     * 更新负载均衡器
     *
     * 更新负载均衡器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateLoadBalancerRequest 请求对象
     * @return SyncInvoker<UpdateLoadBalancerRequest, UpdateLoadBalancerResponse>
     */
    public SyncInvoker<UpdateLoadBalancerRequest, UpdateLoadBalancerResponse> updateLoadBalancerInvoker(
        UpdateLoadBalancerRequest request) {
        return new SyncInvoker<UpdateLoadBalancerRequest, UpdateLoadBalancerResponse>(request,
            ElbMeta.updateLoadBalancer, hcClient);
    }

    /**
     * 更新云日志
     *
     * 更新云日志。[荷兰region不支持云日志功能，请勿使用。](tag:dt)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateLogtankRequest 请求对象
     * @return UpdateLogtankResponse
     */
    public UpdateLogtankResponse updateLogtank(UpdateLogtankRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.updateLogtank);
    }

    /**
     * 更新云日志
     *
     * 更新云日志。[荷兰region不支持云日志功能，请勿使用。](tag:dt)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateLogtankRequest 请求对象
     * @return SyncInvoker<UpdateLogtankRequest, UpdateLogtankResponse>
     */
    public SyncInvoker<UpdateLogtankRequest, UpdateLogtankResponse> updateLogtankInvoker(UpdateLogtankRequest request) {
        return new SyncInvoker<UpdateLogtankRequest, UpdateLogtankResponse>(request, ElbMeta.updateLogtank, hcClient);
    }

    /**
     * 更新后端服务器
     *
     * 更新后端服务器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateMemberRequest 请求对象
     * @return UpdateMemberResponse
     */
    public UpdateMemberResponse updateMember(UpdateMemberRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.updateMember);
    }

    /**
     * 更新后端服务器
     *
     * 更新后端服务器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateMemberRequest 请求对象
     * @return SyncInvoker<UpdateMemberRequest, UpdateMemberResponse>
     */
    public SyncInvoker<UpdateMemberRequest, UpdateMemberResponse> updateMemberInvoker(UpdateMemberRequest request) {
        return new SyncInvoker<UpdateMemberRequest, UpdateMemberResponse>(request, ElbMeta.updateMember, hcClient);
    }

    /**
     * 更新后端服务器组
     *
     * 更新后端服务器组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdatePoolRequest 请求对象
     * @return UpdatePoolResponse
     */
    public UpdatePoolResponse updatePool(UpdatePoolRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.updatePool);
    }

    /**
     * 更新后端服务器组
     *
     * 更新后端服务器组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdatePoolRequest 请求对象
     * @return SyncInvoker<UpdatePoolRequest, UpdatePoolResponse>
     */
    public SyncInvoker<UpdatePoolRequest, UpdatePoolResponse> updatePoolInvoker(UpdatePoolRequest request) {
        return new SyncInvoker<UpdatePoolRequest, UpdatePoolResponse>(request, ElbMeta.updatePool, hcClient);
    }

    /**
     * 更新自定义安全策略
     *
     * 更新自定义安全策略。[荷兰region不支持自定义安全策略功能，请勿使用。](tag:dt)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateSecurityPolicyRequest 请求对象
     * @return UpdateSecurityPolicyResponse
     */
    public UpdateSecurityPolicyResponse updateSecurityPolicy(UpdateSecurityPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.updateSecurityPolicy);
    }

    /**
     * 更新自定义安全策略
     *
     * 更新自定义安全策略。[荷兰region不支持自定义安全策略功能，请勿使用。](tag:dt)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateSecurityPolicyRequest 请求对象
     * @return SyncInvoker<UpdateSecurityPolicyRequest, UpdateSecurityPolicyResponse>
     */
    public SyncInvoker<UpdateSecurityPolicyRequest, UpdateSecurityPolicyResponse> updateSecurityPolicyInvoker(
        UpdateSecurityPolicyRequest request) {
        return new SyncInvoker<UpdateSecurityPolicyRequest, UpdateSecurityPolicyResponse>(request,
            ElbMeta.updateSecurityPolicy, hcClient);
    }

    /**
     * 查询API版本列表信息
     *
     * 返回ELB当前所有可用的API版本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListApiVersionsRequest 请求对象
     * @return ListApiVersionsResponse
     */
    public ListApiVersionsResponse listApiVersions(ListApiVersionsRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.listApiVersions);
    }

    /**
     * 查询API版本列表信息
     *
     * 返回ELB当前所有可用的API版本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListApiVersionsRequest 请求对象
     * @return SyncInvoker<ListApiVersionsRequest, ListApiVersionsResponse>
     */
    public SyncInvoker<ListApiVersionsRequest, ListApiVersionsResponse> listApiVersionsInvoker(
        ListApiVersionsRequest request) {
        return new SyncInvoker<ListApiVersionsRequest, ListApiVersionsResponse>(request, ElbMeta.listApiVersions,
            hcClient);
    }

    /**
     * 删除IP地址组的IP列表项
     *
     * 批量删除IP地址组的IP列表信息。[荷兰region不支持该API](tag:dt,dt_test)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchDeleteIpListRequest 请求对象
     * @return BatchDeleteIpListResponse
     */
    public BatchDeleteIpListResponse batchDeleteIpList(BatchDeleteIpListRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.batchDeleteIpList);
    }

    /**
     * 删除IP地址组的IP列表项
     *
     * 批量删除IP地址组的IP列表信息。[荷兰region不支持该API](tag:dt,dt_test)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchDeleteIpListRequest 请求对象
     * @return SyncInvoker<BatchDeleteIpListRequest, BatchDeleteIpListResponse>
     */
    public SyncInvoker<BatchDeleteIpListRequest, BatchDeleteIpListResponse> batchDeleteIpListInvoker(
        BatchDeleteIpListRequest request) {
        return new SyncInvoker<BatchDeleteIpListRequest, BatchDeleteIpListResponse>(request, ElbMeta.batchDeleteIpList,
            hcClient);
    }

    /**
     * 计算预占IP数
     *
     * 计算以下几种场景的预占用IP数量：
     * 
     * - 计算创建LB的第一个七层监听器后总占用IP数量：
     * 传入loadbalancer_id、l7_flavor_id为空、ip_target_enable不传或为false。
     * 
     * - 计算LB规格变更或开启跨VPC后总占用IP数量：
     * 传入参数loadbalancer_id，及l7_flavor_id不为空或ip_target_enable为true。
     * 
     * - 计算创建LB所需IP数量：传入参数availability_zone_id，
     * 及可选参数l7_flavor_id、ip_target_enable、ip_version，不能传loadbalancer_id。
     * 
     * 说明：
     * - 计算出来的预占IP数大于等于最终实际占用的IP数。
     * - 总占用IP数量，即整个LB所占用的IP数量。
     * 
     * [不支持传入l7_flavor_id](tag:hcso,fcs,fcs_vm,mix,hcso_g42,hcso_g42_b)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CountPreoccupyIpNumRequest 请求对象
     * @return CountPreoccupyIpNumResponse
     */
    public CountPreoccupyIpNumResponse countPreoccupyIpNum(CountPreoccupyIpNumRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.countPreoccupyIpNum);
    }

    /**
     * 计算预占IP数
     *
     * 计算以下几种场景的预占用IP数量：
     * 
     * - 计算创建LB的第一个七层监听器后总占用IP数量：
     * 传入loadbalancer_id、l7_flavor_id为空、ip_target_enable不传或为false。
     * 
     * - 计算LB规格变更或开启跨VPC后总占用IP数量：
     * 传入参数loadbalancer_id，及l7_flavor_id不为空或ip_target_enable为true。
     * 
     * - 计算创建LB所需IP数量：传入参数availability_zone_id，
     * 及可选参数l7_flavor_id、ip_target_enable、ip_version，不能传loadbalancer_id。
     * 
     * 说明：
     * - 计算出来的预占IP数大于等于最终实际占用的IP数。
     * - 总占用IP数量，即整个LB所占用的IP数量。
     * 
     * [不支持传入l7_flavor_id](tag:hcso,fcs,fcs_vm,mix,hcso_g42,hcso_g42_b)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CountPreoccupyIpNumRequest 请求对象
     * @return SyncInvoker<CountPreoccupyIpNumRequest, CountPreoccupyIpNumResponse>
     */
    public SyncInvoker<CountPreoccupyIpNumRequest, CountPreoccupyIpNumResponse> countPreoccupyIpNumInvoker(
        CountPreoccupyIpNumRequest request) {
        return new SyncInvoker<CountPreoccupyIpNumRequest, CountPreoccupyIpNumResponse>(request,
            ElbMeta.countPreoccupyIpNum, hcClient);
    }

    /**
     * 创建IP地址组
     *
     * 创建IP地址组。输入的ip可为ip地址或者CIDR子网，支持IPV4和IPV6。
     * 
     * 需要注意0.0.0.0与0.0.0.0/32视为重复，0:0:0:0:0:0:0:1与::1与::1/128视为重复，只会保存其中一个。
     * 
     * [荷兰region不支持IP地址组功能，请勿使用。](tag:dt)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateIpGroupRequest 请求对象
     * @return CreateIpGroupResponse
     */
    public CreateIpGroupResponse createIpGroup(CreateIpGroupRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.createIpGroup);
    }

    /**
     * 创建IP地址组
     *
     * 创建IP地址组。输入的ip可为ip地址或者CIDR子网，支持IPV4和IPV6。
     * 
     * 需要注意0.0.0.0与0.0.0.0/32视为重复，0:0:0:0:0:0:0:1与::1与::1/128视为重复，只会保存其中一个。
     * 
     * [荷兰region不支持IP地址组功能，请勿使用。](tag:dt)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateIpGroupRequest 请求对象
     * @return SyncInvoker<CreateIpGroupRequest, CreateIpGroupResponse>
     */
    public SyncInvoker<CreateIpGroupRequest, CreateIpGroupResponse> createIpGroupInvoker(CreateIpGroupRequest request) {
        return new SyncInvoker<CreateIpGroupRequest, CreateIpGroupResponse>(request, ElbMeta.createIpGroup, hcClient);
    }

    /**
     * 删除IP地址组
     *
     * 删除ip地址组。[荷兰region不支持IP地址组功能，请勿使用。](tag:dt)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteIpGroupRequest 请求对象
     * @return DeleteIpGroupResponse
     */
    public DeleteIpGroupResponse deleteIpGroup(DeleteIpGroupRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.deleteIpGroup);
    }

    /**
     * 删除IP地址组
     *
     * 删除ip地址组。[荷兰region不支持IP地址组功能，请勿使用。](tag:dt)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteIpGroupRequest 请求对象
     * @return SyncInvoker<DeleteIpGroupRequest, DeleteIpGroupResponse>
     */
    public SyncInvoker<DeleteIpGroupRequest, DeleteIpGroupResponse> deleteIpGroupInvoker(DeleteIpGroupRequest request) {
        return new SyncInvoker<DeleteIpGroupRequest, DeleteIpGroupResponse>(request, ElbMeta.deleteIpGroup, hcClient);
    }

    /**
     * 查询IP地址组列表
     *
     * 查询IP地址组列表。[荷兰region不支持IP地址组功能，请勿使用。](tag:dt)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListIpGroupsRequest 请求对象
     * @return ListIpGroupsResponse
     */
    public ListIpGroupsResponse listIpGroups(ListIpGroupsRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.listIpGroups);
    }

    /**
     * 查询IP地址组列表
     *
     * 查询IP地址组列表。[荷兰region不支持IP地址组功能，请勿使用。](tag:dt)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListIpGroupsRequest 请求对象
     * @return SyncInvoker<ListIpGroupsRequest, ListIpGroupsResponse>
     */
    public SyncInvoker<ListIpGroupsRequest, ListIpGroupsResponse> listIpGroupsInvoker(ListIpGroupsRequest request) {
        return new SyncInvoker<ListIpGroupsRequest, ListIpGroupsResponse>(request, ElbMeta.listIpGroups, hcClient);
    }

    /**
     * 查询IP地址组详情
     *
     * 获取IP地址组详情。[荷兰region不支持IP地址组功能，请勿使用。](tag:dt)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowIpGroupRequest 请求对象
     * @return ShowIpGroupResponse
     */
    public ShowIpGroupResponse showIpGroup(ShowIpGroupRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.showIpGroup);
    }

    /**
     * 查询IP地址组详情
     *
     * 获取IP地址组详情。[荷兰region不支持IP地址组功能，请勿使用。](tag:dt)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowIpGroupRequest 请求对象
     * @return SyncInvoker<ShowIpGroupRequest, ShowIpGroupResponse>
     */
    public SyncInvoker<ShowIpGroupRequest, ShowIpGroupResponse> showIpGroupInvoker(ShowIpGroupRequest request) {
        return new SyncInvoker<ShowIpGroupRequest, ShowIpGroupResponse>(request, ElbMeta.showIpGroup, hcClient);
    }

    /**
     * 更新IP地址组
     *
     * 更新IP地址组，只支持全量更新IP。即IP地址组中的ip_list将被全量覆盖，不在请求参数中的IP地址将被移除。
     * 输入的ip可为ip地址或者CIDR子网，支持IPV4和IPV6。
     * 
     * 需要注意0.0.0.0与0.0.0.0/32视为重复，0:0:0:0:0:0:0:1与::1与::1/128视为重复，只会保存其中一个。
     * 
     * [荷兰region不支持IP地址组功能，请勿使用。](tag:dt)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateIpGroupRequest 请求对象
     * @return UpdateIpGroupResponse
     */
    public UpdateIpGroupResponse updateIpGroup(UpdateIpGroupRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.updateIpGroup);
    }

    /**
     * 更新IP地址组
     *
     * 更新IP地址组，只支持全量更新IP。即IP地址组中的ip_list将被全量覆盖，不在请求参数中的IP地址将被移除。
     * 输入的ip可为ip地址或者CIDR子网，支持IPV4和IPV6。
     * 
     * 需要注意0.0.0.0与0.0.0.0/32视为重复，0:0:0:0:0:0:0:1与::1与::1/128视为重复，只会保存其中一个。
     * 
     * [荷兰region不支持IP地址组功能，请勿使用。](tag:dt)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateIpGroupRequest 请求对象
     * @return SyncInvoker<UpdateIpGroupRequest, UpdateIpGroupResponse>
     */
    public SyncInvoker<UpdateIpGroupRequest, UpdateIpGroupResponse> updateIpGroupInvoker(UpdateIpGroupRequest request) {
        return new SyncInvoker<UpdateIpGroupRequest, UpdateIpGroupResponse>(request, ElbMeta.updateIpGroup, hcClient);
    }

    /**
     * 更新IP地址组的IP列表项
     *
     * 更新IP地址组的IP列表信息。[荷兰region不支持该API](tag:dt,dt_test)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateIpListRequest 请求对象
     * @return UpdateIpListResponse
     */
    public UpdateIpListResponse updateIpList(UpdateIpListRequest request) {
        return hcClient.syncInvokeHttp(request, ElbMeta.updateIpList);
    }

    /**
     * 更新IP地址组的IP列表项
     *
     * 更新IP地址组的IP列表信息。[荷兰region不支持该API](tag:dt,dt_test)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateIpListRequest 请求对象
     * @return SyncInvoker<UpdateIpListRequest, UpdateIpListResponse>
     */
    public SyncInvoker<UpdateIpListRequest, UpdateIpListResponse> updateIpListInvoker(UpdateIpListRequest request) {
        return new SyncInvoker<UpdateIpListRequest, UpdateIpListResponse>(request, ElbMeta.updateIpList, hcClient);
    }

}
