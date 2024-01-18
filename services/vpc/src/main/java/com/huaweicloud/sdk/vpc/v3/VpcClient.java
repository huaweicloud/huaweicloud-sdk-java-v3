package com.huaweicloud.sdk.vpc.v3;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.vpc.v3.model.AddFirewallRulesRequest;
import com.huaweicloud.sdk.vpc.v3.model.AddFirewallRulesResponse;
import com.huaweicloud.sdk.vpc.v3.model.AddSecurityGroupsRequest;
import com.huaweicloud.sdk.vpc.v3.model.AddSecurityGroupsResponse;
import com.huaweicloud.sdk.vpc.v3.model.AddSourcesToTrafficMirrorSessionRequest;
import com.huaweicloud.sdk.vpc.v3.model.AddSourcesToTrafficMirrorSessionResponse;
import com.huaweicloud.sdk.vpc.v3.model.AddVpcExtendCidrRequest;
import com.huaweicloud.sdk.vpc.v3.model.AddVpcExtendCidrResponse;
import com.huaweicloud.sdk.vpc.v3.model.AssociateSubnetFirewallRequest;
import com.huaweicloud.sdk.vpc.v3.model.AssociateSubnetFirewallResponse;
import com.huaweicloud.sdk.vpc.v3.model.BatchCreateSecurityGroupRulesRequest;
import com.huaweicloud.sdk.vpc.v3.model.BatchCreateSecurityGroupRulesResponse;
import com.huaweicloud.sdk.vpc.v3.model.BatchCreateSubNetworkInterfaceRequest;
import com.huaweicloud.sdk.vpc.v3.model.BatchCreateSubNetworkInterfaceResponse;
import com.huaweicloud.sdk.vpc.v3.model.CreateAddressGroupRequest;
import com.huaweicloud.sdk.vpc.v3.model.CreateAddressGroupResponse;
import com.huaweicloud.sdk.vpc.v3.model.CreateFirewallRequest;
import com.huaweicloud.sdk.vpc.v3.model.CreateFirewallResponse;
import com.huaweicloud.sdk.vpc.v3.model.CreateSecurityGroupRequest;
import com.huaweicloud.sdk.vpc.v3.model.CreateSecurityGroupResponse;
import com.huaweicloud.sdk.vpc.v3.model.CreateSecurityGroupRuleRequest;
import com.huaweicloud.sdk.vpc.v3.model.CreateSecurityGroupRuleResponse;
import com.huaweicloud.sdk.vpc.v3.model.CreateSubNetworkInterfaceRequest;
import com.huaweicloud.sdk.vpc.v3.model.CreateSubNetworkInterfaceResponse;
import com.huaweicloud.sdk.vpc.v3.model.CreateTrafficMirrorFilterRequest;
import com.huaweicloud.sdk.vpc.v3.model.CreateTrafficMirrorFilterResponse;
import com.huaweicloud.sdk.vpc.v3.model.CreateTrafficMirrorFilterRuleRequest;
import com.huaweicloud.sdk.vpc.v3.model.CreateTrafficMirrorFilterRuleResponse;
import com.huaweicloud.sdk.vpc.v3.model.CreateTrafficMirrorSessionRequest;
import com.huaweicloud.sdk.vpc.v3.model.CreateTrafficMirrorSessionResponse;
import com.huaweicloud.sdk.vpc.v3.model.CreateVpcRequest;
import com.huaweicloud.sdk.vpc.v3.model.CreateVpcResponse;
import com.huaweicloud.sdk.vpc.v3.model.DeleteAddressGroupRequest;
import com.huaweicloud.sdk.vpc.v3.model.DeleteAddressGroupResponse;
import com.huaweicloud.sdk.vpc.v3.model.DeleteFirewallRequest;
import com.huaweicloud.sdk.vpc.v3.model.DeleteFirewallResponse;
import com.huaweicloud.sdk.vpc.v3.model.DeleteIpAddressGroupForceRequest;
import com.huaweicloud.sdk.vpc.v3.model.DeleteIpAddressGroupForceResponse;
import com.huaweicloud.sdk.vpc.v3.model.DeleteSecurityGroupRequest;
import com.huaweicloud.sdk.vpc.v3.model.DeleteSecurityGroupResponse;
import com.huaweicloud.sdk.vpc.v3.model.DeleteSecurityGroupRuleRequest;
import com.huaweicloud.sdk.vpc.v3.model.DeleteSecurityGroupRuleResponse;
import com.huaweicloud.sdk.vpc.v3.model.DeleteSubNetworkInterfaceRequest;
import com.huaweicloud.sdk.vpc.v3.model.DeleteSubNetworkInterfaceResponse;
import com.huaweicloud.sdk.vpc.v3.model.DeleteTrafficMirrorFilterRequest;
import com.huaweicloud.sdk.vpc.v3.model.DeleteTrafficMirrorFilterResponse;
import com.huaweicloud.sdk.vpc.v3.model.DeleteTrafficMirrorFilterRuleRequest;
import com.huaweicloud.sdk.vpc.v3.model.DeleteTrafficMirrorFilterRuleResponse;
import com.huaweicloud.sdk.vpc.v3.model.DeleteTrafficMirrorSessionRequest;
import com.huaweicloud.sdk.vpc.v3.model.DeleteTrafficMirrorSessionResponse;
import com.huaweicloud.sdk.vpc.v3.model.DeleteVpcRequest;
import com.huaweicloud.sdk.vpc.v3.model.DeleteVpcResponse;
import com.huaweicloud.sdk.vpc.v3.model.DisassociateSubnetFirewallRequest;
import com.huaweicloud.sdk.vpc.v3.model.DisassociateSubnetFirewallResponse;
import com.huaweicloud.sdk.vpc.v3.model.ListAddressGroupRequest;
import com.huaweicloud.sdk.vpc.v3.model.ListAddressGroupResponse;
import com.huaweicloud.sdk.vpc.v3.model.ListFirewallRequest;
import com.huaweicloud.sdk.vpc.v3.model.ListFirewallResponse;
import com.huaweicloud.sdk.vpc.v3.model.ListSecurityGroupRulesRequest;
import com.huaweicloud.sdk.vpc.v3.model.ListSecurityGroupRulesResponse;
import com.huaweicloud.sdk.vpc.v3.model.ListSecurityGroupsRequest;
import com.huaweicloud.sdk.vpc.v3.model.ListSecurityGroupsResponse;
import com.huaweicloud.sdk.vpc.v3.model.ListSubNetworkInterfacesRequest;
import com.huaweicloud.sdk.vpc.v3.model.ListSubNetworkInterfacesResponse;
import com.huaweicloud.sdk.vpc.v3.model.ListTrafficMirrorFilterRulesRequest;
import com.huaweicloud.sdk.vpc.v3.model.ListTrafficMirrorFilterRulesResponse;
import com.huaweicloud.sdk.vpc.v3.model.ListTrafficMirrorFiltersRequest;
import com.huaweicloud.sdk.vpc.v3.model.ListTrafficMirrorFiltersResponse;
import com.huaweicloud.sdk.vpc.v3.model.ListTrafficMirrorSessionsRequest;
import com.huaweicloud.sdk.vpc.v3.model.ListTrafficMirrorSessionsResponse;
import com.huaweicloud.sdk.vpc.v3.model.ListVpcsRequest;
import com.huaweicloud.sdk.vpc.v3.model.ListVpcsResponse;
import com.huaweicloud.sdk.vpc.v3.model.MigrateSubNetworkInterfaceRequest;
import com.huaweicloud.sdk.vpc.v3.model.MigrateSubNetworkInterfaceResponse;
import com.huaweicloud.sdk.vpc.v3.model.RemoveFirewallRulesRequest;
import com.huaweicloud.sdk.vpc.v3.model.RemoveFirewallRulesResponse;
import com.huaweicloud.sdk.vpc.v3.model.RemoveSecurityGroupsRequest;
import com.huaweicloud.sdk.vpc.v3.model.RemoveSecurityGroupsResponse;
import com.huaweicloud.sdk.vpc.v3.model.RemoveSourcesFromTrafficMirrorSessionRequest;
import com.huaweicloud.sdk.vpc.v3.model.RemoveSourcesFromTrafficMirrorSessionResponse;
import com.huaweicloud.sdk.vpc.v3.model.RemoveVpcExtendCidrRequest;
import com.huaweicloud.sdk.vpc.v3.model.RemoveVpcExtendCidrResponse;
import com.huaweicloud.sdk.vpc.v3.model.ShowAddressGroupRequest;
import com.huaweicloud.sdk.vpc.v3.model.ShowAddressGroupResponse;
import com.huaweicloud.sdk.vpc.v3.model.ShowFirewallRequest;
import com.huaweicloud.sdk.vpc.v3.model.ShowFirewallResponse;
import com.huaweicloud.sdk.vpc.v3.model.ShowSecurityGroupRequest;
import com.huaweicloud.sdk.vpc.v3.model.ShowSecurityGroupResponse;
import com.huaweicloud.sdk.vpc.v3.model.ShowSecurityGroupRuleRequest;
import com.huaweicloud.sdk.vpc.v3.model.ShowSecurityGroupRuleResponse;
import com.huaweicloud.sdk.vpc.v3.model.ShowSubNetworkInterfaceRequest;
import com.huaweicloud.sdk.vpc.v3.model.ShowSubNetworkInterfaceResponse;
import com.huaweicloud.sdk.vpc.v3.model.ShowSubNetworkInterfacesQuantityRequest;
import com.huaweicloud.sdk.vpc.v3.model.ShowSubNetworkInterfacesQuantityResponse;
import com.huaweicloud.sdk.vpc.v3.model.ShowTrafficMirrorFilterRequest;
import com.huaweicloud.sdk.vpc.v3.model.ShowTrafficMirrorFilterResponse;
import com.huaweicloud.sdk.vpc.v3.model.ShowTrafficMirrorFilterRuleRequest;
import com.huaweicloud.sdk.vpc.v3.model.ShowTrafficMirrorFilterRuleResponse;
import com.huaweicloud.sdk.vpc.v3.model.ShowTrafficMirrorSessionRequest;
import com.huaweicloud.sdk.vpc.v3.model.ShowTrafficMirrorSessionResponse;
import com.huaweicloud.sdk.vpc.v3.model.ShowVpcRequest;
import com.huaweicloud.sdk.vpc.v3.model.ShowVpcResponse;
import com.huaweicloud.sdk.vpc.v3.model.UpdateAddressGroupRequest;
import com.huaweicloud.sdk.vpc.v3.model.UpdateAddressGroupResponse;
import com.huaweicloud.sdk.vpc.v3.model.UpdateFirewallRequest;
import com.huaweicloud.sdk.vpc.v3.model.UpdateFirewallResponse;
import com.huaweicloud.sdk.vpc.v3.model.UpdateFirewallRulesRequest;
import com.huaweicloud.sdk.vpc.v3.model.UpdateFirewallRulesResponse;
import com.huaweicloud.sdk.vpc.v3.model.UpdateSecurityGroupRequest;
import com.huaweicloud.sdk.vpc.v3.model.UpdateSecurityGroupResponse;
import com.huaweicloud.sdk.vpc.v3.model.UpdateSubNetworkInterfaceRequest;
import com.huaweicloud.sdk.vpc.v3.model.UpdateSubNetworkInterfaceResponse;
import com.huaweicloud.sdk.vpc.v3.model.UpdateTrafficMirrorFilterRequest;
import com.huaweicloud.sdk.vpc.v3.model.UpdateTrafficMirrorFilterResponse;
import com.huaweicloud.sdk.vpc.v3.model.UpdateTrafficMirrorFilterRuleRequest;
import com.huaweicloud.sdk.vpc.v3.model.UpdateTrafficMirrorFilterRuleResponse;
import com.huaweicloud.sdk.vpc.v3.model.UpdateTrafficMirrorSessionRequest;
import com.huaweicloud.sdk.vpc.v3.model.UpdateTrafficMirrorSessionResponse;
import com.huaweicloud.sdk.vpc.v3.model.UpdateVpcRequest;
import com.huaweicloud.sdk.vpc.v3.model.UpdateVpcResponse;

public class VpcClient {

    protected HcClient hcClient;

    public VpcClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<VpcClient> newBuilder() {
        ClientBuilder<VpcClient> clientBuilder = new ClientBuilder<>(VpcClient::new);
        return clientBuilder;
    }

    /**
     * 端口插入安全组
     *
     * 端口插入安全组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddSecurityGroupsRequest 请求对象
     * @return AddSecurityGroupsResponse
     */
    public AddSecurityGroupsResponse addSecurityGroups(AddSecurityGroupsRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.addSecurityGroups);
    }

    /**
     * 端口插入安全组
     *
     * 端口插入安全组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddSecurityGroupsRequest 请求对象
     * @return SyncInvoker<AddSecurityGroupsRequest, AddSecurityGroupsResponse>
     */
    public SyncInvoker<AddSecurityGroupsRequest, AddSecurityGroupsResponse> addSecurityGroupsInvoker(
        AddSecurityGroupsRequest request) {
        return new SyncInvoker<>(request, VpcMeta.addSecurityGroups, hcClient);
    }

    /**
     * 流量镜像会话添加镜像源
     *
     * 流量镜像会话添加镜像源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddSourcesToTrafficMirrorSessionRequest 请求对象
     * @return AddSourcesToTrafficMirrorSessionResponse
     */
    public AddSourcesToTrafficMirrorSessionResponse addSourcesToTrafficMirrorSession(
        AddSourcesToTrafficMirrorSessionRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.addSourcesToTrafficMirrorSession);
    }

    /**
     * 流量镜像会话添加镜像源
     *
     * 流量镜像会话添加镜像源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddSourcesToTrafficMirrorSessionRequest 请求对象
     * @return SyncInvoker<AddSourcesToTrafficMirrorSessionRequest, AddSourcesToTrafficMirrorSessionResponse>
     */
    public SyncInvoker<AddSourcesToTrafficMirrorSessionRequest, AddSourcesToTrafficMirrorSessionResponse> addSourcesToTrafficMirrorSessionInvoker(
        AddSourcesToTrafficMirrorSessionRequest request) {
        return new SyncInvoker<>(request, VpcMeta.addSourcesToTrafficMirrorSession, hcClient);
    }

    /**
     * 批量创建安全组规则
     *
     * 在特定安全组下批量创建安全组规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateSecurityGroupRulesRequest 请求对象
     * @return BatchCreateSecurityGroupRulesResponse
     */
    public BatchCreateSecurityGroupRulesResponse batchCreateSecurityGroupRules(
        BatchCreateSecurityGroupRulesRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.batchCreateSecurityGroupRules);
    }

    /**
     * 批量创建安全组规则
     *
     * 在特定安全组下批量创建安全组规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateSecurityGroupRulesRequest 请求对象
     * @return SyncInvoker<BatchCreateSecurityGroupRulesRequest, BatchCreateSecurityGroupRulesResponse>
     */
    public SyncInvoker<BatchCreateSecurityGroupRulesRequest, BatchCreateSecurityGroupRulesResponse> batchCreateSecurityGroupRulesInvoker(
        BatchCreateSecurityGroupRulesRequest request) {
        return new SyncInvoker<>(request, VpcMeta.batchCreateSecurityGroupRules, hcClient);
    }

    /**
     * 批量创建辅助弹性网卡
     *
     * 批量创建辅助弹性网卡
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateSubNetworkInterfaceRequest 请求对象
     * @return BatchCreateSubNetworkInterfaceResponse
     */
    public BatchCreateSubNetworkInterfaceResponse batchCreateSubNetworkInterface(
        BatchCreateSubNetworkInterfaceRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.batchCreateSubNetworkInterface);
    }

    /**
     * 批量创建辅助弹性网卡
     *
     * 批量创建辅助弹性网卡
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateSubNetworkInterfaceRequest 请求对象
     * @return SyncInvoker<BatchCreateSubNetworkInterfaceRequest, BatchCreateSubNetworkInterfaceResponse>
     */
    public SyncInvoker<BatchCreateSubNetworkInterfaceRequest, BatchCreateSubNetworkInterfaceResponse> batchCreateSubNetworkInterfaceInvoker(
        BatchCreateSubNetworkInterfaceRequest request) {
        return new SyncInvoker<>(request, VpcMeta.batchCreateSubNetworkInterface, hcClient);
    }

    /**
     * 创建安全组
     *
     * 创建安全组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSecurityGroupRequest 请求对象
     * @return CreateSecurityGroupResponse
     */
    public CreateSecurityGroupResponse createSecurityGroup(CreateSecurityGroupRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.createSecurityGroup);
    }

    /**
     * 创建安全组
     *
     * 创建安全组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSecurityGroupRequest 请求对象
     * @return SyncInvoker<CreateSecurityGroupRequest, CreateSecurityGroupResponse>
     */
    public SyncInvoker<CreateSecurityGroupRequest, CreateSecurityGroupResponse> createSecurityGroupInvoker(
        CreateSecurityGroupRequest request) {
        return new SyncInvoker<>(request, VpcMeta.createSecurityGroup, hcClient);
    }

    /**
     * 创建安全组规则
     *
     * 创建安全组规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSecurityGroupRuleRequest 请求对象
     * @return CreateSecurityGroupRuleResponse
     */
    public CreateSecurityGroupRuleResponse createSecurityGroupRule(CreateSecurityGroupRuleRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.createSecurityGroupRule);
    }

    /**
     * 创建安全组规则
     *
     * 创建安全组规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSecurityGroupRuleRequest 请求对象
     * @return SyncInvoker<CreateSecurityGroupRuleRequest, CreateSecurityGroupRuleResponse>
     */
    public SyncInvoker<CreateSecurityGroupRuleRequest, CreateSecurityGroupRuleResponse> createSecurityGroupRuleInvoker(
        CreateSecurityGroupRuleRequest request) {
        return new SyncInvoker<>(request, VpcMeta.createSecurityGroupRule, hcClient);
    }

    /**
     * 创建辅助弹性网卡
     *
     * 创建辅助弹性网卡
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSubNetworkInterfaceRequest 请求对象
     * @return CreateSubNetworkInterfaceResponse
     */
    public CreateSubNetworkInterfaceResponse createSubNetworkInterface(CreateSubNetworkInterfaceRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.createSubNetworkInterface);
    }

    /**
     * 创建辅助弹性网卡
     *
     * 创建辅助弹性网卡
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSubNetworkInterfaceRequest 请求对象
     * @return SyncInvoker<CreateSubNetworkInterfaceRequest, CreateSubNetworkInterfaceResponse>
     */
    public SyncInvoker<CreateSubNetworkInterfaceRequest, CreateSubNetworkInterfaceResponse> createSubNetworkInterfaceInvoker(
        CreateSubNetworkInterfaceRequest request) {
        return new SyncInvoker<>(request, VpcMeta.createSubNetworkInterface, hcClient);
    }

    /**
     * 创建流量镜像筛选条件
     *
     * 创建流量镜像筛选条件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTrafficMirrorFilterRequest 请求对象
     * @return CreateTrafficMirrorFilterResponse
     */
    public CreateTrafficMirrorFilterResponse createTrafficMirrorFilter(CreateTrafficMirrorFilterRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.createTrafficMirrorFilter);
    }

    /**
     * 创建流量镜像筛选条件
     *
     * 创建流量镜像筛选条件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTrafficMirrorFilterRequest 请求对象
     * @return SyncInvoker<CreateTrafficMirrorFilterRequest, CreateTrafficMirrorFilterResponse>
     */
    public SyncInvoker<CreateTrafficMirrorFilterRequest, CreateTrafficMirrorFilterResponse> createTrafficMirrorFilterInvoker(
        CreateTrafficMirrorFilterRequest request) {
        return new SyncInvoker<>(request, VpcMeta.createTrafficMirrorFilter, hcClient);
    }

    /**
     * 创建流量镜像筛选规则
     *
     * 创建流量镜像筛选规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTrafficMirrorFilterRuleRequest 请求对象
     * @return CreateTrafficMirrorFilterRuleResponse
     */
    public CreateTrafficMirrorFilterRuleResponse createTrafficMirrorFilterRule(
        CreateTrafficMirrorFilterRuleRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.createTrafficMirrorFilterRule);
    }

    /**
     * 创建流量镜像筛选规则
     *
     * 创建流量镜像筛选规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTrafficMirrorFilterRuleRequest 请求对象
     * @return SyncInvoker<CreateTrafficMirrorFilterRuleRequest, CreateTrafficMirrorFilterRuleResponse>
     */
    public SyncInvoker<CreateTrafficMirrorFilterRuleRequest, CreateTrafficMirrorFilterRuleResponse> createTrafficMirrorFilterRuleInvoker(
        CreateTrafficMirrorFilterRuleRequest request) {
        return new SyncInvoker<>(request, VpcMeta.createTrafficMirrorFilterRule, hcClient);
    }

    /**
     * 创建流量镜像会话
     *
     * 创建流量镜像会话
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTrafficMirrorSessionRequest 请求对象
     * @return CreateTrafficMirrorSessionResponse
     */
    public CreateTrafficMirrorSessionResponse createTrafficMirrorSession(CreateTrafficMirrorSessionRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.createTrafficMirrorSession);
    }

    /**
     * 创建流量镜像会话
     *
     * 创建流量镜像会话
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTrafficMirrorSessionRequest 请求对象
     * @return SyncInvoker<CreateTrafficMirrorSessionRequest, CreateTrafficMirrorSessionResponse>
     */
    public SyncInvoker<CreateTrafficMirrorSessionRequest, CreateTrafficMirrorSessionResponse> createTrafficMirrorSessionInvoker(
        CreateTrafficMirrorSessionRequest request) {
        return new SyncInvoker<>(request, VpcMeta.createTrafficMirrorSession, hcClient);
    }

    /**
     * 删除安全组
     *
     * 删除安全组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSecurityGroupRequest 请求对象
     * @return DeleteSecurityGroupResponse
     */
    public DeleteSecurityGroupResponse deleteSecurityGroup(DeleteSecurityGroupRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.deleteSecurityGroup);
    }

    /**
     * 删除安全组
     *
     * 删除安全组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSecurityGroupRequest 请求对象
     * @return SyncInvoker<DeleteSecurityGroupRequest, DeleteSecurityGroupResponse>
     */
    public SyncInvoker<DeleteSecurityGroupRequest, DeleteSecurityGroupResponse> deleteSecurityGroupInvoker(
        DeleteSecurityGroupRequest request) {
        return new SyncInvoker<>(request, VpcMeta.deleteSecurityGroup, hcClient);
    }

    /**
     * 删除安全组规则
     *
     * 删除安全组规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSecurityGroupRuleRequest 请求对象
     * @return DeleteSecurityGroupRuleResponse
     */
    public DeleteSecurityGroupRuleResponse deleteSecurityGroupRule(DeleteSecurityGroupRuleRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.deleteSecurityGroupRule);
    }

    /**
     * 删除安全组规则
     *
     * 删除安全组规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSecurityGroupRuleRequest 请求对象
     * @return SyncInvoker<DeleteSecurityGroupRuleRequest, DeleteSecurityGroupRuleResponse>
     */
    public SyncInvoker<DeleteSecurityGroupRuleRequest, DeleteSecurityGroupRuleResponse> deleteSecurityGroupRuleInvoker(
        DeleteSecurityGroupRuleRequest request) {
        return new SyncInvoker<>(request, VpcMeta.deleteSecurityGroupRule, hcClient);
    }

    /**
     * 删除辅助弹性网卡
     *
     * 删除辅助弹性网卡
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSubNetworkInterfaceRequest 请求对象
     * @return DeleteSubNetworkInterfaceResponse
     */
    public DeleteSubNetworkInterfaceResponse deleteSubNetworkInterface(DeleteSubNetworkInterfaceRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.deleteSubNetworkInterface);
    }

    /**
     * 删除辅助弹性网卡
     *
     * 删除辅助弹性网卡
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSubNetworkInterfaceRequest 请求对象
     * @return SyncInvoker<DeleteSubNetworkInterfaceRequest, DeleteSubNetworkInterfaceResponse>
     */
    public SyncInvoker<DeleteSubNetworkInterfaceRequest, DeleteSubNetworkInterfaceResponse> deleteSubNetworkInterfaceInvoker(
        DeleteSubNetworkInterfaceRequest request) {
        return new SyncInvoker<>(request, VpcMeta.deleteSubNetworkInterface, hcClient);
    }

    /**
     * 删除流量镜像筛选条件
     *
     * 删除流量镜像筛选条件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTrafficMirrorFilterRequest 请求对象
     * @return DeleteTrafficMirrorFilterResponse
     */
    public DeleteTrafficMirrorFilterResponse deleteTrafficMirrorFilter(DeleteTrafficMirrorFilterRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.deleteTrafficMirrorFilter);
    }

    /**
     * 删除流量镜像筛选条件
     *
     * 删除流量镜像筛选条件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTrafficMirrorFilterRequest 请求对象
     * @return SyncInvoker<DeleteTrafficMirrorFilterRequest, DeleteTrafficMirrorFilterResponse>
     */
    public SyncInvoker<DeleteTrafficMirrorFilterRequest, DeleteTrafficMirrorFilterResponse> deleteTrafficMirrorFilterInvoker(
        DeleteTrafficMirrorFilterRequest request) {
        return new SyncInvoker<>(request, VpcMeta.deleteTrafficMirrorFilter, hcClient);
    }

    /**
     * 删除流量镜像筛选规则
     *
     * 删除流量镜像筛选规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTrafficMirrorFilterRuleRequest 请求对象
     * @return DeleteTrafficMirrorFilterRuleResponse
     */
    public DeleteTrafficMirrorFilterRuleResponse deleteTrafficMirrorFilterRule(
        DeleteTrafficMirrorFilterRuleRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.deleteTrafficMirrorFilterRule);
    }

    /**
     * 删除流量镜像筛选规则
     *
     * 删除流量镜像筛选规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTrafficMirrorFilterRuleRequest 请求对象
     * @return SyncInvoker<DeleteTrafficMirrorFilterRuleRequest, DeleteTrafficMirrorFilterRuleResponse>
     */
    public SyncInvoker<DeleteTrafficMirrorFilterRuleRequest, DeleteTrafficMirrorFilterRuleResponse> deleteTrafficMirrorFilterRuleInvoker(
        DeleteTrafficMirrorFilterRuleRequest request) {
        return new SyncInvoker<>(request, VpcMeta.deleteTrafficMirrorFilterRule, hcClient);
    }

    /**
     * 删除流量镜像会话
     *
     * 删除流量镜像会话
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTrafficMirrorSessionRequest 请求对象
     * @return DeleteTrafficMirrorSessionResponse
     */
    public DeleteTrafficMirrorSessionResponse deleteTrafficMirrorSession(DeleteTrafficMirrorSessionRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.deleteTrafficMirrorSession);
    }

    /**
     * 删除流量镜像会话
     *
     * 删除流量镜像会话
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTrafficMirrorSessionRequest 请求对象
     * @return SyncInvoker<DeleteTrafficMirrorSessionRequest, DeleteTrafficMirrorSessionResponse>
     */
    public SyncInvoker<DeleteTrafficMirrorSessionRequest, DeleteTrafficMirrorSessionResponse> deleteTrafficMirrorSessionInvoker(
        DeleteTrafficMirrorSessionRequest request) {
        return new SyncInvoker<>(request, VpcMeta.deleteTrafficMirrorSession, hcClient);
    }

    /**
     * 查询安全组规则列表
     *
     * 查询安全组规则列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSecurityGroupRulesRequest 请求对象
     * @return ListSecurityGroupRulesResponse
     */
    public ListSecurityGroupRulesResponse listSecurityGroupRules(ListSecurityGroupRulesRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.listSecurityGroupRules);
    }

    /**
     * 查询安全组规则列表
     *
     * 查询安全组规则列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSecurityGroupRulesRequest 请求对象
     * @return SyncInvoker<ListSecurityGroupRulesRequest, ListSecurityGroupRulesResponse>
     */
    public SyncInvoker<ListSecurityGroupRulesRequest, ListSecurityGroupRulesResponse> listSecurityGroupRulesInvoker(
        ListSecurityGroupRulesRequest request) {
        return new SyncInvoker<>(request, VpcMeta.listSecurityGroupRules, hcClient);
    }

    /**
     * 查询安全组列表
     *
     * 查询某租户下的安全组列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSecurityGroupsRequest 请求对象
     * @return ListSecurityGroupsResponse
     */
    public ListSecurityGroupsResponse listSecurityGroups(ListSecurityGroupsRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.listSecurityGroups);
    }

    /**
     * 查询安全组列表
     *
     * 查询某租户下的安全组列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSecurityGroupsRequest 请求对象
     * @return SyncInvoker<ListSecurityGroupsRequest, ListSecurityGroupsResponse>
     */
    public SyncInvoker<ListSecurityGroupsRequest, ListSecurityGroupsResponse> listSecurityGroupsInvoker(
        ListSecurityGroupsRequest request) {
        return new SyncInvoker<>(request, VpcMeta.listSecurityGroups, hcClient);
    }

    /**
     * 查询租户下辅助弹性网卡列表
     *
     * 查询辅助弹性网卡列表，单次查询最多返回2000条数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSubNetworkInterfacesRequest 请求对象
     * @return ListSubNetworkInterfacesResponse
     */
    public ListSubNetworkInterfacesResponse listSubNetworkInterfaces(ListSubNetworkInterfacesRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.listSubNetworkInterfaces);
    }

    /**
     * 查询租户下辅助弹性网卡列表
     *
     * 查询辅助弹性网卡列表，单次查询最多返回2000条数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSubNetworkInterfacesRequest 请求对象
     * @return SyncInvoker<ListSubNetworkInterfacesRequest, ListSubNetworkInterfacesResponse>
     */
    public SyncInvoker<ListSubNetworkInterfacesRequest, ListSubNetworkInterfacesResponse> listSubNetworkInterfacesInvoker(
        ListSubNetworkInterfacesRequest request) {
        return new SyncInvoker<>(request, VpcMeta.listSubNetworkInterfaces, hcClient);
    }

    /**
     * 查询流量镜像筛选规则列表
     *
     * 查询流量镜像筛选规则列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTrafficMirrorFilterRulesRequest 请求对象
     * @return ListTrafficMirrorFilterRulesResponse
     */
    public ListTrafficMirrorFilterRulesResponse listTrafficMirrorFilterRules(
        ListTrafficMirrorFilterRulesRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.listTrafficMirrorFilterRules);
    }

    /**
     * 查询流量镜像筛选规则列表
     *
     * 查询流量镜像筛选规则列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTrafficMirrorFilterRulesRequest 请求对象
     * @return SyncInvoker<ListTrafficMirrorFilterRulesRequest, ListTrafficMirrorFilterRulesResponse>
     */
    public SyncInvoker<ListTrafficMirrorFilterRulesRequest, ListTrafficMirrorFilterRulesResponse> listTrafficMirrorFilterRulesInvoker(
        ListTrafficMirrorFilterRulesRequest request) {
        return new SyncInvoker<>(request, VpcMeta.listTrafficMirrorFilterRules, hcClient);
    }

    /**
     * 查询流量镜像筛选条件列表
     *
     * 查询流量镜像筛选条件列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTrafficMirrorFiltersRequest 请求对象
     * @return ListTrafficMirrorFiltersResponse
     */
    public ListTrafficMirrorFiltersResponse listTrafficMirrorFilters(ListTrafficMirrorFiltersRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.listTrafficMirrorFilters);
    }

    /**
     * 查询流量镜像筛选条件列表
     *
     * 查询流量镜像筛选条件列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTrafficMirrorFiltersRequest 请求对象
     * @return SyncInvoker<ListTrafficMirrorFiltersRequest, ListTrafficMirrorFiltersResponse>
     */
    public SyncInvoker<ListTrafficMirrorFiltersRequest, ListTrafficMirrorFiltersResponse> listTrafficMirrorFiltersInvoker(
        ListTrafficMirrorFiltersRequest request) {
        return new SyncInvoker<>(request, VpcMeta.listTrafficMirrorFilters, hcClient);
    }

    /**
     * 查询流量镜像会话列表
     *
     * 查询流量镜像会话列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTrafficMirrorSessionsRequest 请求对象
     * @return ListTrafficMirrorSessionsResponse
     */
    public ListTrafficMirrorSessionsResponse listTrafficMirrorSessions(ListTrafficMirrorSessionsRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.listTrafficMirrorSessions);
    }

    /**
     * 查询流量镜像会话列表
     *
     * 查询流量镜像会话列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTrafficMirrorSessionsRequest 请求对象
     * @return SyncInvoker<ListTrafficMirrorSessionsRequest, ListTrafficMirrorSessionsResponse>
     */
    public SyncInvoker<ListTrafficMirrorSessionsRequest, ListTrafficMirrorSessionsResponse> listTrafficMirrorSessionsInvoker(
        ListTrafficMirrorSessionsRequest request) {
        return new SyncInvoker<>(request, VpcMeta.listTrafficMirrorSessions, hcClient);
    }

    /**
     * 迁移辅助弹性网卡
     *
     * 批量迁移辅助弹性网卡
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request MigrateSubNetworkInterfaceRequest 请求对象
     * @return MigrateSubNetworkInterfaceResponse
     */
    public MigrateSubNetworkInterfaceResponse migrateSubNetworkInterface(MigrateSubNetworkInterfaceRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.migrateSubNetworkInterface);
    }

    /**
     * 迁移辅助弹性网卡
     *
     * 批量迁移辅助弹性网卡
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request MigrateSubNetworkInterfaceRequest 请求对象
     * @return SyncInvoker<MigrateSubNetworkInterfaceRequest, MigrateSubNetworkInterfaceResponse>
     */
    public SyncInvoker<MigrateSubNetworkInterfaceRequest, MigrateSubNetworkInterfaceResponse> migrateSubNetworkInterfaceInvoker(
        MigrateSubNetworkInterfaceRequest request) {
        return new SyncInvoker<>(request, VpcMeta.migrateSubNetworkInterface, hcClient);
    }

    /**
     * 端口移除安全组
     *
     * 端口移除安全组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RemoveSecurityGroupsRequest 请求对象
     * @return RemoveSecurityGroupsResponse
     */
    public RemoveSecurityGroupsResponse removeSecurityGroups(RemoveSecurityGroupsRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.removeSecurityGroups);
    }

    /**
     * 端口移除安全组
     *
     * 端口移除安全组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RemoveSecurityGroupsRequest 请求对象
     * @return SyncInvoker<RemoveSecurityGroupsRequest, RemoveSecurityGroupsResponse>
     */
    public SyncInvoker<RemoveSecurityGroupsRequest, RemoveSecurityGroupsResponse> removeSecurityGroupsInvoker(
        RemoveSecurityGroupsRequest request) {
        return new SyncInvoker<>(request, VpcMeta.removeSecurityGroups, hcClient);
    }

    /**
     * 流量镜像会话移除镜像源
     *
     * 流量镜像会话移除镜像源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RemoveSourcesFromTrafficMirrorSessionRequest 请求对象
     * @return RemoveSourcesFromTrafficMirrorSessionResponse
     */
    public RemoveSourcesFromTrafficMirrorSessionResponse removeSourcesFromTrafficMirrorSession(
        RemoveSourcesFromTrafficMirrorSessionRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.removeSourcesFromTrafficMirrorSession);
    }

    /**
     * 流量镜像会话移除镜像源
     *
     * 流量镜像会话移除镜像源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RemoveSourcesFromTrafficMirrorSessionRequest 请求对象
     * @return SyncInvoker<RemoveSourcesFromTrafficMirrorSessionRequest, RemoveSourcesFromTrafficMirrorSessionResponse>
     */
    public SyncInvoker<RemoveSourcesFromTrafficMirrorSessionRequest, RemoveSourcesFromTrafficMirrorSessionResponse> removeSourcesFromTrafficMirrorSessionInvoker(
        RemoveSourcesFromTrafficMirrorSessionRequest request) {
        return new SyncInvoker<>(request, VpcMeta.removeSourcesFromTrafficMirrorSession, hcClient);
    }

    /**
     * 查询安全组
     *
     * 查询单个安全组详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSecurityGroupRequest 请求对象
     * @return ShowSecurityGroupResponse
     */
    public ShowSecurityGroupResponse showSecurityGroup(ShowSecurityGroupRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.showSecurityGroup);
    }

    /**
     * 查询安全组
     *
     * 查询单个安全组详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSecurityGroupRequest 请求对象
     * @return SyncInvoker<ShowSecurityGroupRequest, ShowSecurityGroupResponse>
     */
    public SyncInvoker<ShowSecurityGroupRequest, ShowSecurityGroupResponse> showSecurityGroupInvoker(
        ShowSecurityGroupRequest request) {
        return new SyncInvoker<>(request, VpcMeta.showSecurityGroup, hcClient);
    }

    /**
     * 查询安全组规则
     *
     * 查询单个安全组规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSecurityGroupRuleRequest 请求对象
     * @return ShowSecurityGroupRuleResponse
     */
    public ShowSecurityGroupRuleResponse showSecurityGroupRule(ShowSecurityGroupRuleRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.showSecurityGroupRule);
    }

    /**
     * 查询安全组规则
     *
     * 查询单个安全组规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSecurityGroupRuleRequest 请求对象
     * @return SyncInvoker<ShowSecurityGroupRuleRequest, ShowSecurityGroupRuleResponse>
     */
    public SyncInvoker<ShowSecurityGroupRuleRequest, ShowSecurityGroupRuleResponse> showSecurityGroupRuleInvoker(
        ShowSecurityGroupRuleRequest request) {
        return new SyncInvoker<>(request, VpcMeta.showSecurityGroupRule, hcClient);
    }

    /**
     * 查询租户下辅助弹性网卡
     *
     * 查询辅助弹性网卡详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSubNetworkInterfaceRequest 请求对象
     * @return ShowSubNetworkInterfaceResponse
     */
    public ShowSubNetworkInterfaceResponse showSubNetworkInterface(ShowSubNetworkInterfaceRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.showSubNetworkInterface);
    }

    /**
     * 查询租户下辅助弹性网卡
     *
     * 查询辅助弹性网卡详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSubNetworkInterfaceRequest 请求对象
     * @return SyncInvoker<ShowSubNetworkInterfaceRequest, ShowSubNetworkInterfaceResponse>
     */
    public SyncInvoker<ShowSubNetworkInterfaceRequest, ShowSubNetworkInterfaceResponse> showSubNetworkInterfaceInvoker(
        ShowSubNetworkInterfaceRequest request) {
        return new SyncInvoker<>(request, VpcMeta.showSubNetworkInterface, hcClient);
    }

    /**
     * 查询租户下辅助弹性网卡数目
     *
     * 查询辅助弹性网卡数目
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSubNetworkInterfacesQuantityRequest 请求对象
     * @return ShowSubNetworkInterfacesQuantityResponse
     */
    public ShowSubNetworkInterfacesQuantityResponse showSubNetworkInterfacesQuantity(
        ShowSubNetworkInterfacesQuantityRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.showSubNetworkInterfacesQuantity);
    }

    /**
     * 查询租户下辅助弹性网卡数目
     *
     * 查询辅助弹性网卡数目
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSubNetworkInterfacesQuantityRequest 请求对象
     * @return SyncInvoker<ShowSubNetworkInterfacesQuantityRequest, ShowSubNetworkInterfacesQuantityResponse>
     */
    public SyncInvoker<ShowSubNetworkInterfacesQuantityRequest, ShowSubNetworkInterfacesQuantityResponse> showSubNetworkInterfacesQuantityInvoker(
        ShowSubNetworkInterfacesQuantityRequest request) {
        return new SyncInvoker<>(request, VpcMeta.showSubNetworkInterfacesQuantity, hcClient);
    }

    /**
     * 查询流量镜像筛选条件详情
     *
     * 查询流量镜像筛选条件详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTrafficMirrorFilterRequest 请求对象
     * @return ShowTrafficMirrorFilterResponse
     */
    public ShowTrafficMirrorFilterResponse showTrafficMirrorFilter(ShowTrafficMirrorFilterRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.showTrafficMirrorFilter);
    }

    /**
     * 查询流量镜像筛选条件详情
     *
     * 查询流量镜像筛选条件详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTrafficMirrorFilterRequest 请求对象
     * @return SyncInvoker<ShowTrafficMirrorFilterRequest, ShowTrafficMirrorFilterResponse>
     */
    public SyncInvoker<ShowTrafficMirrorFilterRequest, ShowTrafficMirrorFilterResponse> showTrafficMirrorFilterInvoker(
        ShowTrafficMirrorFilterRequest request) {
        return new SyncInvoker<>(request, VpcMeta.showTrafficMirrorFilter, hcClient);
    }

    /**
     * 查询流量镜像筛选规则详情
     *
     * 查询流量镜像筛选规则详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTrafficMirrorFilterRuleRequest 请求对象
     * @return ShowTrafficMirrorFilterRuleResponse
     */
    public ShowTrafficMirrorFilterRuleResponse showTrafficMirrorFilterRule(ShowTrafficMirrorFilterRuleRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.showTrafficMirrorFilterRule);
    }

    /**
     * 查询流量镜像筛选规则详情
     *
     * 查询流量镜像筛选规则详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTrafficMirrorFilterRuleRequest 请求对象
     * @return SyncInvoker<ShowTrafficMirrorFilterRuleRequest, ShowTrafficMirrorFilterRuleResponse>
     */
    public SyncInvoker<ShowTrafficMirrorFilterRuleRequest, ShowTrafficMirrorFilterRuleResponse> showTrafficMirrorFilterRuleInvoker(
        ShowTrafficMirrorFilterRuleRequest request) {
        return new SyncInvoker<>(request, VpcMeta.showTrafficMirrorFilterRule, hcClient);
    }

    /**
     * 查询流量镜像会话详情
     *
     * 查询流量镜像会话详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTrafficMirrorSessionRequest 请求对象
     * @return ShowTrafficMirrorSessionResponse
     */
    public ShowTrafficMirrorSessionResponse showTrafficMirrorSession(ShowTrafficMirrorSessionRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.showTrafficMirrorSession);
    }

    /**
     * 查询流量镜像会话详情
     *
     * 查询流量镜像会话详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTrafficMirrorSessionRequest 请求对象
     * @return SyncInvoker<ShowTrafficMirrorSessionRequest, ShowTrafficMirrorSessionResponse>
     */
    public SyncInvoker<ShowTrafficMirrorSessionRequest, ShowTrafficMirrorSessionResponse> showTrafficMirrorSessionInvoker(
        ShowTrafficMirrorSessionRequest request) {
        return new SyncInvoker<>(request, VpcMeta.showTrafficMirrorSession, hcClient);
    }

    /**
     * 更新安全组
     *
     * 更新安全组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSecurityGroupRequest 请求对象
     * @return UpdateSecurityGroupResponse
     */
    public UpdateSecurityGroupResponse updateSecurityGroup(UpdateSecurityGroupRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.updateSecurityGroup);
    }

    /**
     * 更新安全组
     *
     * 更新安全组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSecurityGroupRequest 请求对象
     * @return SyncInvoker<UpdateSecurityGroupRequest, UpdateSecurityGroupResponse>
     */
    public SyncInvoker<UpdateSecurityGroupRequest, UpdateSecurityGroupResponse> updateSecurityGroupInvoker(
        UpdateSecurityGroupRequest request) {
        return new SyncInvoker<>(request, VpcMeta.updateSecurityGroup, hcClient);
    }

    /**
     * 更新辅助弹性网卡
     *
     * 更新辅助弹性网卡
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSubNetworkInterfaceRequest 请求对象
     * @return UpdateSubNetworkInterfaceResponse
     */
    public UpdateSubNetworkInterfaceResponse updateSubNetworkInterface(UpdateSubNetworkInterfaceRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.updateSubNetworkInterface);
    }

    /**
     * 更新辅助弹性网卡
     *
     * 更新辅助弹性网卡
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSubNetworkInterfaceRequest 请求对象
     * @return SyncInvoker<UpdateSubNetworkInterfaceRequest, UpdateSubNetworkInterfaceResponse>
     */
    public SyncInvoker<UpdateSubNetworkInterfaceRequest, UpdateSubNetworkInterfaceResponse> updateSubNetworkInterfaceInvoker(
        UpdateSubNetworkInterfaceRequest request) {
        return new SyncInvoker<>(request, VpcMeta.updateSubNetworkInterface, hcClient);
    }

    /**
     * 更新流量镜像筛选条件
     *
     * 更新流量镜像筛选条件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTrafficMirrorFilterRequest 请求对象
     * @return UpdateTrafficMirrorFilterResponse
     */
    public UpdateTrafficMirrorFilterResponse updateTrafficMirrorFilter(UpdateTrafficMirrorFilterRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.updateTrafficMirrorFilter);
    }

    /**
     * 更新流量镜像筛选条件
     *
     * 更新流量镜像筛选条件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTrafficMirrorFilterRequest 请求对象
     * @return SyncInvoker<UpdateTrafficMirrorFilterRequest, UpdateTrafficMirrorFilterResponse>
     */
    public SyncInvoker<UpdateTrafficMirrorFilterRequest, UpdateTrafficMirrorFilterResponse> updateTrafficMirrorFilterInvoker(
        UpdateTrafficMirrorFilterRequest request) {
        return new SyncInvoker<>(request, VpcMeta.updateTrafficMirrorFilter, hcClient);
    }

    /**
     * 更新流量镜像筛选规则
     *
     * 更新流量镜像筛选规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTrafficMirrorFilterRuleRequest 请求对象
     * @return UpdateTrafficMirrorFilterRuleResponse
     */
    public UpdateTrafficMirrorFilterRuleResponse updateTrafficMirrorFilterRule(
        UpdateTrafficMirrorFilterRuleRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.updateTrafficMirrorFilterRule);
    }

    /**
     * 更新流量镜像筛选规则
     *
     * 更新流量镜像筛选规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTrafficMirrorFilterRuleRequest 请求对象
     * @return SyncInvoker<UpdateTrafficMirrorFilterRuleRequest, UpdateTrafficMirrorFilterRuleResponse>
     */
    public SyncInvoker<UpdateTrafficMirrorFilterRuleRequest, UpdateTrafficMirrorFilterRuleResponse> updateTrafficMirrorFilterRuleInvoker(
        UpdateTrafficMirrorFilterRuleRequest request) {
        return new SyncInvoker<>(request, VpcMeta.updateTrafficMirrorFilterRule, hcClient);
    }

    /**
     * 更新流量镜像会话
     *
     * 更新流量镜像会话
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTrafficMirrorSessionRequest 请求对象
     * @return UpdateTrafficMirrorSessionResponse
     */
    public UpdateTrafficMirrorSessionResponse updateTrafficMirrorSession(UpdateTrafficMirrorSessionRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.updateTrafficMirrorSession);
    }

    /**
     * 更新流量镜像会话
     *
     * 更新流量镜像会话
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTrafficMirrorSessionRequest 请求对象
     * @return SyncInvoker<UpdateTrafficMirrorSessionRequest, UpdateTrafficMirrorSessionResponse>
     */
    public SyncInvoker<UpdateTrafficMirrorSessionRequest, UpdateTrafficMirrorSessionResponse> updateTrafficMirrorSessionInvoker(
        UpdateTrafficMirrorSessionRequest request) {
        return new SyncInvoker<>(request, VpcMeta.updateTrafficMirrorSession, hcClient);
    }

    /**
     * 网络ACL插入规则
     *
     * 网络ACL插入规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddFirewallRulesRequest 请求对象
     * @return AddFirewallRulesResponse
     */
    public AddFirewallRulesResponse addFirewallRules(AddFirewallRulesRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.addFirewallRules);
    }

    /**
     * 网络ACL插入规则
     *
     * 网络ACL插入规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddFirewallRulesRequest 请求对象
     * @return SyncInvoker<AddFirewallRulesRequest, AddFirewallRulesResponse>
     */
    public SyncInvoker<AddFirewallRulesRequest, AddFirewallRulesResponse> addFirewallRulesInvoker(
        AddFirewallRulesRequest request) {
        return new SyncInvoker<>(request, VpcMeta.addFirewallRules, hcClient);
    }

    /**
     * 网络ACL绑定子网
     *
     * 网络ACL绑定子网
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AssociateSubnetFirewallRequest 请求对象
     * @return AssociateSubnetFirewallResponse
     */
    public AssociateSubnetFirewallResponse associateSubnetFirewall(AssociateSubnetFirewallRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.associateSubnetFirewall);
    }

    /**
     * 网络ACL绑定子网
     *
     * 网络ACL绑定子网
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AssociateSubnetFirewallRequest 请求对象
     * @return SyncInvoker<AssociateSubnetFirewallRequest, AssociateSubnetFirewallResponse>
     */
    public SyncInvoker<AssociateSubnetFirewallRequest, AssociateSubnetFirewallResponse> associateSubnetFirewallInvoker(
        AssociateSubnetFirewallRequest request) {
        return new SyncInvoker<>(request, VpcMeta.associateSubnetFirewall, hcClient);
    }

    /**
     * 创建网络ACL
     *
     * 创建网络ACL
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateFirewallRequest 请求对象
     * @return CreateFirewallResponse
     */
    public CreateFirewallResponse createFirewall(CreateFirewallRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.createFirewall);
    }

    /**
     * 创建网络ACL
     *
     * 创建网络ACL
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateFirewallRequest 请求对象
     * @return SyncInvoker<CreateFirewallRequest, CreateFirewallResponse>
     */
    public SyncInvoker<CreateFirewallRequest, CreateFirewallResponse> createFirewallInvoker(
        CreateFirewallRequest request) {
        return new SyncInvoker<>(request, VpcMeta.createFirewall, hcClient);
    }

    /**
     * 删除网络ACL
     *
     * 删除网络ACL
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteFirewallRequest 请求对象
     * @return DeleteFirewallResponse
     */
    public DeleteFirewallResponse deleteFirewall(DeleteFirewallRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.deleteFirewall);
    }

    /**
     * 删除网络ACL
     *
     * 删除网络ACL
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteFirewallRequest 请求对象
     * @return SyncInvoker<DeleteFirewallRequest, DeleteFirewallResponse>
     */
    public SyncInvoker<DeleteFirewallRequest, DeleteFirewallResponse> deleteFirewallInvoker(
        DeleteFirewallRequest request) {
        return new SyncInvoker<>(request, VpcMeta.deleteFirewall, hcClient);
    }

    /**
     * 网络ACL解绑子网
     *
     * 网络ACL解绑子网
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisassociateSubnetFirewallRequest 请求对象
     * @return DisassociateSubnetFirewallResponse
     */
    public DisassociateSubnetFirewallResponse disassociateSubnetFirewall(DisassociateSubnetFirewallRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.disassociateSubnetFirewall);
    }

    /**
     * 网络ACL解绑子网
     *
     * 网络ACL解绑子网
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisassociateSubnetFirewallRequest 请求对象
     * @return SyncInvoker<DisassociateSubnetFirewallRequest, DisassociateSubnetFirewallResponse>
     */
    public SyncInvoker<DisassociateSubnetFirewallRequest, DisassociateSubnetFirewallResponse> disassociateSubnetFirewallInvoker(
        DisassociateSubnetFirewallRequest request) {
        return new SyncInvoker<>(request, VpcMeta.disassociateSubnetFirewall, hcClient);
    }

    /**
     * 查询网络ACL列表
     *
     * 查询网络ACL列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFirewallRequest 请求对象
     * @return ListFirewallResponse
     */
    public ListFirewallResponse listFirewall(ListFirewallRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.listFirewall);
    }

    /**
     * 查询网络ACL列表
     *
     * 查询网络ACL列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFirewallRequest 请求对象
     * @return SyncInvoker<ListFirewallRequest, ListFirewallResponse>
     */
    public SyncInvoker<ListFirewallRequest, ListFirewallResponse> listFirewallInvoker(ListFirewallRequest request) {
        return new SyncInvoker<>(request, VpcMeta.listFirewall, hcClient);
    }

    /**
     * 网络ACL移除规则
     *
     * 网络ACL移除规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RemoveFirewallRulesRequest 请求对象
     * @return RemoveFirewallRulesResponse
     */
    public RemoveFirewallRulesResponse removeFirewallRules(RemoveFirewallRulesRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.removeFirewallRules);
    }

    /**
     * 网络ACL移除规则
     *
     * 网络ACL移除规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RemoveFirewallRulesRequest 请求对象
     * @return SyncInvoker<RemoveFirewallRulesRequest, RemoveFirewallRulesResponse>
     */
    public SyncInvoker<RemoveFirewallRulesRequest, RemoveFirewallRulesResponse> removeFirewallRulesInvoker(
        RemoveFirewallRulesRequest request) {
        return new SyncInvoker<>(request, VpcMeta.removeFirewallRules, hcClient);
    }

    /**
     * 查询网络ACL详情
     *
     * 查询网络ACL详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFirewallRequest 请求对象
     * @return ShowFirewallResponse
     */
    public ShowFirewallResponse showFirewall(ShowFirewallRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.showFirewall);
    }

    /**
     * 查询网络ACL详情
     *
     * 查询网络ACL详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFirewallRequest 请求对象
     * @return SyncInvoker<ShowFirewallRequest, ShowFirewallResponse>
     */
    public SyncInvoker<ShowFirewallRequest, ShowFirewallResponse> showFirewallInvoker(ShowFirewallRequest request) {
        return new SyncInvoker<>(request, VpcMeta.showFirewall, hcClient);
    }

    /**
     * 更新网络ACL
     *
     * 更新网络ACL
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateFirewallRequest 请求对象
     * @return UpdateFirewallResponse
     */
    public UpdateFirewallResponse updateFirewall(UpdateFirewallRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.updateFirewall);
    }

    /**
     * 更新网络ACL
     *
     * 更新网络ACL
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateFirewallRequest 请求对象
     * @return SyncInvoker<UpdateFirewallRequest, UpdateFirewallResponse>
     */
    public SyncInvoker<UpdateFirewallRequest, UpdateFirewallResponse> updateFirewallInvoker(
        UpdateFirewallRequest request) {
        return new SyncInvoker<>(request, VpcMeta.updateFirewall, hcClient);
    }

    /**
     * 网络ACL更新规则
     *
     * 网络ACL更新规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateFirewallRulesRequest 请求对象
     * @return UpdateFirewallRulesResponse
     */
    public UpdateFirewallRulesResponse updateFirewallRules(UpdateFirewallRulesRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.updateFirewallRules);
    }

    /**
     * 网络ACL更新规则
     *
     * 网络ACL更新规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateFirewallRulesRequest 请求对象
     * @return SyncInvoker<UpdateFirewallRulesRequest, UpdateFirewallRulesResponse>
     */
    public SyncInvoker<UpdateFirewallRulesRequest, UpdateFirewallRulesResponse> updateFirewallRulesInvoker(
        UpdateFirewallRulesRequest request) {
        return new SyncInvoker<>(request, VpcMeta.updateFirewallRules, hcClient);
    }

    /**
     * 创建地址组
     *
     * 创建地址组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAddressGroupRequest 请求对象
     * @return CreateAddressGroupResponse
     */
    public CreateAddressGroupResponse createAddressGroup(CreateAddressGroupRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.createAddressGroup);
    }

    /**
     * 创建地址组
     *
     * 创建地址组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAddressGroupRequest 请求对象
     * @return SyncInvoker<CreateAddressGroupRequest, CreateAddressGroupResponse>
     */
    public SyncInvoker<CreateAddressGroupRequest, CreateAddressGroupResponse> createAddressGroupInvoker(
        CreateAddressGroupRequest request) {
        return new SyncInvoker<>(request, VpcMeta.createAddressGroup, hcClient);
    }

    /**
     * 删除地址组
     *
     * 删除地址组，非强制删除，删除前请确保未被其他资源引用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAddressGroupRequest 请求对象
     * @return DeleteAddressGroupResponse
     */
    public DeleteAddressGroupResponse deleteAddressGroup(DeleteAddressGroupRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.deleteAddressGroup);
    }

    /**
     * 删除地址组
     *
     * 删除地址组，非强制删除，删除前请确保未被其他资源引用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAddressGroupRequest 请求对象
     * @return SyncInvoker<DeleteAddressGroupRequest, DeleteAddressGroupResponse>
     */
    public SyncInvoker<DeleteAddressGroupRequest, DeleteAddressGroupResponse> deleteAddressGroupInvoker(
        DeleteAddressGroupRequest request) {
        return new SyncInvoker<>(request, VpcMeta.deleteAddressGroup, hcClient);
    }

    /**
     * 强制删除地址组
     *
     * 强制删除地址组，删除的地址组与安全组规则关联时，会删除地址组与关联的安全组规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteIpAddressGroupForceRequest 请求对象
     * @return DeleteIpAddressGroupForceResponse
     */
    public DeleteIpAddressGroupForceResponse deleteIpAddressGroupForce(DeleteIpAddressGroupForceRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.deleteIpAddressGroupForce);
    }

    /**
     * 强制删除地址组
     *
     * 强制删除地址组，删除的地址组与安全组规则关联时，会删除地址组与关联的安全组规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteIpAddressGroupForceRequest 请求对象
     * @return SyncInvoker<DeleteIpAddressGroupForceRequest, DeleteIpAddressGroupForceResponse>
     */
    public SyncInvoker<DeleteIpAddressGroupForceRequest, DeleteIpAddressGroupForceResponse> deleteIpAddressGroupForceInvoker(
        DeleteIpAddressGroupForceRequest request) {
        return new SyncInvoker<>(request, VpcMeta.deleteIpAddressGroupForce, hcClient);
    }

    /**
     * 查询地址组列表
     *
     * 查询地址组列表，根据过滤条件进行过滤。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAddressGroupRequest 请求对象
     * @return ListAddressGroupResponse
     */
    public ListAddressGroupResponse listAddressGroup(ListAddressGroupRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.listAddressGroup);
    }

    /**
     * 查询地址组列表
     *
     * 查询地址组列表，根据过滤条件进行过滤。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAddressGroupRequest 请求对象
     * @return SyncInvoker<ListAddressGroupRequest, ListAddressGroupResponse>
     */
    public SyncInvoker<ListAddressGroupRequest, ListAddressGroupResponse> listAddressGroupInvoker(
        ListAddressGroupRequest request) {
        return new SyncInvoker<>(request, VpcMeta.listAddressGroup, hcClient);
    }

    /**
     * 查询地址组
     *
     * 查询地址组详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAddressGroupRequest 请求对象
     * @return ShowAddressGroupResponse
     */
    public ShowAddressGroupResponse showAddressGroup(ShowAddressGroupRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.showAddressGroup);
    }

    /**
     * 查询地址组
     *
     * 查询地址组详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAddressGroupRequest 请求对象
     * @return SyncInvoker<ShowAddressGroupRequest, ShowAddressGroupResponse>
     */
    public SyncInvoker<ShowAddressGroupRequest, ShowAddressGroupResponse> showAddressGroupInvoker(
        ShowAddressGroupRequest request) {
        return new SyncInvoker<>(request, VpcMeta.showAddressGroup, hcClient);
    }

    /**
     * 更新地址组
     *
     * 更新地址组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAddressGroupRequest 请求对象
     * @return UpdateAddressGroupResponse
     */
    public UpdateAddressGroupResponse updateAddressGroup(UpdateAddressGroupRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.updateAddressGroup);
    }

    /**
     * 更新地址组
     *
     * 更新地址组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAddressGroupRequest 请求对象
     * @return SyncInvoker<UpdateAddressGroupRequest, UpdateAddressGroupResponse>
     */
    public SyncInvoker<UpdateAddressGroupRequest, UpdateAddressGroupResponse> updateAddressGroupInvoker(
        UpdateAddressGroupRequest request) {
        return new SyncInvoker<>(request, VpcMeta.updateAddressGroup, hcClient);
    }

    /**
     * 添加VPC扩展网段
     *
     * 添加VPC的扩展网段
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddVpcExtendCidrRequest 请求对象
     * @return AddVpcExtendCidrResponse
     */
    public AddVpcExtendCidrResponse addVpcExtendCidr(AddVpcExtendCidrRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.addVpcExtendCidr);
    }

    /**
     * 添加VPC扩展网段
     *
     * 添加VPC的扩展网段
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddVpcExtendCidrRequest 请求对象
     * @return SyncInvoker<AddVpcExtendCidrRequest, AddVpcExtendCidrResponse>
     */
    public SyncInvoker<AddVpcExtendCidrRequest, AddVpcExtendCidrResponse> addVpcExtendCidrInvoker(
        AddVpcExtendCidrRequest request) {
        return new SyncInvoker<>(request, VpcMeta.addVpcExtendCidr, hcClient);
    }

    /**
     * 创建VPC
     *
     * 创建虚拟私有云
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateVpcRequest 请求对象
     * @return CreateVpcResponse
     */
    public CreateVpcResponse createVpc(CreateVpcRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.createVpc);
    }

    /**
     * 创建VPC
     *
     * 创建虚拟私有云
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateVpcRequest 请求对象
     * @return SyncInvoker<CreateVpcRequest, CreateVpcResponse>
     */
    public SyncInvoker<CreateVpcRequest, CreateVpcResponse> createVpcInvoker(CreateVpcRequest request) {
        return new SyncInvoker<>(request, VpcMeta.createVpc, hcClient);
    }

    /**
     * 删除VPC
     *
     * 删除VPC
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteVpcRequest 请求对象
     * @return DeleteVpcResponse
     */
    public DeleteVpcResponse deleteVpc(DeleteVpcRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.deleteVpc);
    }

    /**
     * 删除VPC
     *
     * 删除VPC
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteVpcRequest 请求对象
     * @return SyncInvoker<DeleteVpcRequest, DeleteVpcResponse>
     */
    public SyncInvoker<DeleteVpcRequest, DeleteVpcResponse> deleteVpcInvoker(DeleteVpcRequest request) {
        return new SyncInvoker<>(request, VpcMeta.deleteVpc, hcClient);
    }

    /**
     * 查询VPC列表
     *
     * 查询vpc列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVpcsRequest 请求对象
     * @return ListVpcsResponse
     */
    public ListVpcsResponse listVpcs(ListVpcsRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.listVpcs);
    }

    /**
     * 查询VPC列表
     *
     * 查询vpc列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVpcsRequest 请求对象
     * @return SyncInvoker<ListVpcsRequest, ListVpcsResponse>
     */
    public SyncInvoker<ListVpcsRequest, ListVpcsResponse> listVpcsInvoker(ListVpcsRequest request) {
        return new SyncInvoker<>(request, VpcMeta.listVpcs, hcClient);
    }

    /**
     * 移除VPC扩展网段
     *
     * 移除VPC扩展网段
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RemoveVpcExtendCidrRequest 请求对象
     * @return RemoveVpcExtendCidrResponse
     */
    public RemoveVpcExtendCidrResponse removeVpcExtendCidr(RemoveVpcExtendCidrRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.removeVpcExtendCidr);
    }

    /**
     * 移除VPC扩展网段
     *
     * 移除VPC扩展网段
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RemoveVpcExtendCidrRequest 请求对象
     * @return SyncInvoker<RemoveVpcExtendCidrRequest, RemoveVpcExtendCidrResponse>
     */
    public SyncInvoker<RemoveVpcExtendCidrRequest, RemoveVpcExtendCidrResponse> removeVpcExtendCidrInvoker(
        RemoveVpcExtendCidrRequest request) {
        return new SyncInvoker<>(request, VpcMeta.removeVpcExtendCidr, hcClient);
    }

    /**
     * 查询VPC详情
     *
     * 查询vpc详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowVpcRequest 请求对象
     * @return ShowVpcResponse
     */
    public ShowVpcResponse showVpc(ShowVpcRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.showVpc);
    }

    /**
     * 查询VPC详情
     *
     * 查询vpc详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowVpcRequest 请求对象
     * @return SyncInvoker<ShowVpcRequest, ShowVpcResponse>
     */
    public SyncInvoker<ShowVpcRequest, ShowVpcResponse> showVpcInvoker(ShowVpcRequest request) {
        return new SyncInvoker<>(request, VpcMeta.showVpc, hcClient);
    }

    /**
     * 更新VPC
     *
     * 更新vpc
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateVpcRequest 请求对象
     * @return UpdateVpcResponse
     */
    public UpdateVpcResponse updateVpc(UpdateVpcRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.updateVpc);
    }

    /**
     * 更新VPC
     *
     * 更新vpc
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateVpcRequest 请求对象
     * @return SyncInvoker<UpdateVpcRequest, UpdateVpcResponse>
     */
    public SyncInvoker<UpdateVpcRequest, UpdateVpcResponse> updateVpcInvoker(UpdateVpcRequest request) {
        return new SyncInvoker<>(request, VpcMeta.updateVpc, hcClient);
    }

}
