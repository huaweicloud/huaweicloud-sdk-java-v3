package com.huaweicloud.sdk.vpc.v2;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.vpc.v2.model.AcceptVpcPeeringRequest;
import com.huaweicloud.sdk.vpc.v2.model.AcceptVpcPeeringResponse;
import com.huaweicloud.sdk.vpc.v2.model.AssociateRouteTableRequest;
import com.huaweicloud.sdk.vpc.v2.model.AssociateRouteTableResponse;
import com.huaweicloud.sdk.vpc.v2.model.BatchCreateSubnetTagsRequest;
import com.huaweicloud.sdk.vpc.v2.model.BatchCreateSubnetTagsResponse;
import com.huaweicloud.sdk.vpc.v2.model.BatchCreateVpcTagsRequest;
import com.huaweicloud.sdk.vpc.v2.model.BatchCreateVpcTagsResponse;
import com.huaweicloud.sdk.vpc.v2.model.BatchDeleteSubnetTagsRequest;
import com.huaweicloud.sdk.vpc.v2.model.BatchDeleteSubnetTagsResponse;
import com.huaweicloud.sdk.vpc.v2.model.BatchDeleteVpcTagsRequest;
import com.huaweicloud.sdk.vpc.v2.model.BatchDeleteVpcTagsResponse;
import com.huaweicloud.sdk.vpc.v2.model.CreateFlowLogRequest;
import com.huaweicloud.sdk.vpc.v2.model.CreateFlowLogResponse;
import com.huaweicloud.sdk.vpc.v2.model.CreatePortRequest;
import com.huaweicloud.sdk.vpc.v2.model.CreatePortResponse;
import com.huaweicloud.sdk.vpc.v2.model.CreatePrivateipRequest;
import com.huaweicloud.sdk.vpc.v2.model.CreatePrivateipResponse;
import com.huaweicloud.sdk.vpc.v2.model.CreateRouteTableRequest;
import com.huaweicloud.sdk.vpc.v2.model.CreateRouteTableResponse;
import com.huaweicloud.sdk.vpc.v2.model.CreateSecurityGroupRequest;
import com.huaweicloud.sdk.vpc.v2.model.CreateSecurityGroupResponse;
import com.huaweicloud.sdk.vpc.v2.model.CreateSecurityGroupRuleRequest;
import com.huaweicloud.sdk.vpc.v2.model.CreateSecurityGroupRuleResponse;
import com.huaweicloud.sdk.vpc.v2.model.CreateSubnetRequest;
import com.huaweicloud.sdk.vpc.v2.model.CreateSubnetResponse;
import com.huaweicloud.sdk.vpc.v2.model.CreateSubnetTagRequest;
import com.huaweicloud.sdk.vpc.v2.model.CreateSubnetTagResponse;
import com.huaweicloud.sdk.vpc.v2.model.CreateVpcPeeringRequest;
import com.huaweicloud.sdk.vpc.v2.model.CreateVpcPeeringResponse;
import com.huaweicloud.sdk.vpc.v2.model.CreateVpcRequest;
import com.huaweicloud.sdk.vpc.v2.model.CreateVpcResourceTagRequest;
import com.huaweicloud.sdk.vpc.v2.model.CreateVpcResourceTagResponse;
import com.huaweicloud.sdk.vpc.v2.model.CreateVpcResponse;
import com.huaweicloud.sdk.vpc.v2.model.CreateVpcRouteRequest;
import com.huaweicloud.sdk.vpc.v2.model.CreateVpcRouteResponse;
import com.huaweicloud.sdk.vpc.v2.model.DeleteFlowLogRequest;
import com.huaweicloud.sdk.vpc.v2.model.DeleteFlowLogResponse;
import com.huaweicloud.sdk.vpc.v2.model.DeletePortRequest;
import com.huaweicloud.sdk.vpc.v2.model.DeletePortResponse;
import com.huaweicloud.sdk.vpc.v2.model.DeletePrivateipRequest;
import com.huaweicloud.sdk.vpc.v2.model.DeletePrivateipResponse;
import com.huaweicloud.sdk.vpc.v2.model.DeleteRouteTableRequest;
import com.huaweicloud.sdk.vpc.v2.model.DeleteRouteTableResponse;
import com.huaweicloud.sdk.vpc.v2.model.DeleteSecurityGroupRequest;
import com.huaweicloud.sdk.vpc.v2.model.DeleteSecurityGroupResponse;
import com.huaweicloud.sdk.vpc.v2.model.DeleteSecurityGroupRuleRequest;
import com.huaweicloud.sdk.vpc.v2.model.DeleteSecurityGroupRuleResponse;
import com.huaweicloud.sdk.vpc.v2.model.DeleteSubnetRequest;
import com.huaweicloud.sdk.vpc.v2.model.DeleteSubnetResponse;
import com.huaweicloud.sdk.vpc.v2.model.DeleteSubnetTagRequest;
import com.huaweicloud.sdk.vpc.v2.model.DeleteSubnetTagResponse;
import com.huaweicloud.sdk.vpc.v2.model.DeleteVpcPeeringRequest;
import com.huaweicloud.sdk.vpc.v2.model.DeleteVpcPeeringResponse;
import com.huaweicloud.sdk.vpc.v2.model.DeleteVpcRequest;
import com.huaweicloud.sdk.vpc.v2.model.DeleteVpcResponse;
import com.huaweicloud.sdk.vpc.v2.model.DeleteVpcRouteRequest;
import com.huaweicloud.sdk.vpc.v2.model.DeleteVpcRouteResponse;
import com.huaweicloud.sdk.vpc.v2.model.DeleteVpcTagRequest;
import com.huaweicloud.sdk.vpc.v2.model.DeleteVpcTagResponse;
import com.huaweicloud.sdk.vpc.v2.model.DisassociateRouteTableRequest;
import com.huaweicloud.sdk.vpc.v2.model.DisassociateRouteTableResponse;
import com.huaweicloud.sdk.vpc.v2.model.ListApiVersionRequest;
import com.huaweicloud.sdk.vpc.v2.model.ListApiVersionResponse;
import com.huaweicloud.sdk.vpc.v2.model.ListFlowLogsRequest;
import com.huaweicloud.sdk.vpc.v2.model.ListFlowLogsResponse;
import com.huaweicloud.sdk.vpc.v2.model.ListPortsRequest;
import com.huaweicloud.sdk.vpc.v2.model.ListPortsResponse;
import com.huaweicloud.sdk.vpc.v2.model.ListPrivateipsRequest;
import com.huaweicloud.sdk.vpc.v2.model.ListPrivateipsResponse;
import com.huaweicloud.sdk.vpc.v2.model.ListRouteTablesRequest;
import com.huaweicloud.sdk.vpc.v2.model.ListRouteTablesResponse;
import com.huaweicloud.sdk.vpc.v2.model.ListSecurityGroupRulesRequest;
import com.huaweicloud.sdk.vpc.v2.model.ListSecurityGroupRulesResponse;
import com.huaweicloud.sdk.vpc.v2.model.ListSecurityGroupsRequest;
import com.huaweicloud.sdk.vpc.v2.model.ListSecurityGroupsResponse;
import com.huaweicloud.sdk.vpc.v2.model.ListSubnetTagsRequest;
import com.huaweicloud.sdk.vpc.v2.model.ListSubnetTagsResponse;
import com.huaweicloud.sdk.vpc.v2.model.ListSubnetsByTagsRequest;
import com.huaweicloud.sdk.vpc.v2.model.ListSubnetsByTagsResponse;
import com.huaweicloud.sdk.vpc.v2.model.ListSubnetsRequest;
import com.huaweicloud.sdk.vpc.v2.model.ListSubnetsResponse;
import com.huaweicloud.sdk.vpc.v2.model.ListVpcPeeringsRequest;
import com.huaweicloud.sdk.vpc.v2.model.ListVpcPeeringsResponse;
import com.huaweicloud.sdk.vpc.v2.model.ListVpcRoutesRequest;
import com.huaweicloud.sdk.vpc.v2.model.ListVpcRoutesResponse;
import com.huaweicloud.sdk.vpc.v2.model.ListVpcTagsRequest;
import com.huaweicloud.sdk.vpc.v2.model.ListVpcTagsResponse;
import com.huaweicloud.sdk.vpc.v2.model.ListVpcsByTagsRequest;
import com.huaweicloud.sdk.vpc.v2.model.ListVpcsByTagsResponse;
import com.huaweicloud.sdk.vpc.v2.model.ListVpcsRequest;
import com.huaweicloud.sdk.vpc.v2.model.ListVpcsResponse;
import com.huaweicloud.sdk.vpc.v2.model.NeutronAddFirewallRuleRequest;
import com.huaweicloud.sdk.vpc.v2.model.NeutronAddFirewallRuleResponse;
import com.huaweicloud.sdk.vpc.v2.model.NeutronAddRouterInterfaceRequest;
import com.huaweicloud.sdk.vpc.v2.model.NeutronAddRouterInterfaceResponse;
import com.huaweicloud.sdk.vpc.v2.model.NeutronCreateFirewallGroupRequest;
import com.huaweicloud.sdk.vpc.v2.model.NeutronCreateFirewallGroupResponse;
import com.huaweicloud.sdk.vpc.v2.model.NeutronCreateFirewallPolicyRequest;
import com.huaweicloud.sdk.vpc.v2.model.NeutronCreateFirewallPolicyResponse;
import com.huaweicloud.sdk.vpc.v2.model.NeutronCreateFirewallRuleRequest;
import com.huaweicloud.sdk.vpc.v2.model.NeutronCreateFirewallRuleResponse;
import com.huaweicloud.sdk.vpc.v2.model.NeutronCreateNetworkRequest;
import com.huaweicloud.sdk.vpc.v2.model.NeutronCreateNetworkResponse;
import com.huaweicloud.sdk.vpc.v2.model.NeutronCreatePortRequest;
import com.huaweicloud.sdk.vpc.v2.model.NeutronCreatePortResponse;
import com.huaweicloud.sdk.vpc.v2.model.NeutronCreateRouterRequest;
import com.huaweicloud.sdk.vpc.v2.model.NeutronCreateRouterResponse;
import com.huaweicloud.sdk.vpc.v2.model.NeutronCreateSecurityGroupRequest;
import com.huaweicloud.sdk.vpc.v2.model.NeutronCreateSecurityGroupResponse;
import com.huaweicloud.sdk.vpc.v2.model.NeutronCreateSecurityGroupRuleRequest;
import com.huaweicloud.sdk.vpc.v2.model.NeutronCreateSecurityGroupRuleResponse;
import com.huaweicloud.sdk.vpc.v2.model.NeutronCreateSubnetRequest;
import com.huaweicloud.sdk.vpc.v2.model.NeutronCreateSubnetResponse;
import com.huaweicloud.sdk.vpc.v2.model.NeutronDeleteFirewallGroupRequest;
import com.huaweicloud.sdk.vpc.v2.model.NeutronDeleteFirewallGroupResponse;
import com.huaweicloud.sdk.vpc.v2.model.NeutronDeleteFirewallPolicyRequest;
import com.huaweicloud.sdk.vpc.v2.model.NeutronDeleteFirewallPolicyResponse;
import com.huaweicloud.sdk.vpc.v2.model.NeutronDeleteFirewallRuleRequest;
import com.huaweicloud.sdk.vpc.v2.model.NeutronDeleteFirewallRuleResponse;
import com.huaweicloud.sdk.vpc.v2.model.NeutronDeleteNetworkRequest;
import com.huaweicloud.sdk.vpc.v2.model.NeutronDeleteNetworkResponse;
import com.huaweicloud.sdk.vpc.v2.model.NeutronDeletePortRequest;
import com.huaweicloud.sdk.vpc.v2.model.NeutronDeletePortResponse;
import com.huaweicloud.sdk.vpc.v2.model.NeutronDeleteRouterRequest;
import com.huaweicloud.sdk.vpc.v2.model.NeutronDeleteRouterResponse;
import com.huaweicloud.sdk.vpc.v2.model.NeutronDeleteSecurityGroupRequest;
import com.huaweicloud.sdk.vpc.v2.model.NeutronDeleteSecurityGroupResponse;
import com.huaweicloud.sdk.vpc.v2.model.NeutronDeleteSecurityGroupRuleRequest;
import com.huaweicloud.sdk.vpc.v2.model.NeutronDeleteSecurityGroupRuleResponse;
import com.huaweicloud.sdk.vpc.v2.model.NeutronDeleteSubnetRequest;
import com.huaweicloud.sdk.vpc.v2.model.NeutronDeleteSubnetResponse;
import com.huaweicloud.sdk.vpc.v2.model.NeutronListFirewallGroupsRequest;
import com.huaweicloud.sdk.vpc.v2.model.NeutronListFirewallGroupsResponse;
import com.huaweicloud.sdk.vpc.v2.model.NeutronListFirewallPoliciesRequest;
import com.huaweicloud.sdk.vpc.v2.model.NeutronListFirewallPoliciesResponse;
import com.huaweicloud.sdk.vpc.v2.model.NeutronListFirewallRulesRequest;
import com.huaweicloud.sdk.vpc.v2.model.NeutronListFirewallRulesResponse;
import com.huaweicloud.sdk.vpc.v2.model.NeutronListNetworksRequest;
import com.huaweicloud.sdk.vpc.v2.model.NeutronListNetworksResponse;
import com.huaweicloud.sdk.vpc.v2.model.NeutronListPortsRequest;
import com.huaweicloud.sdk.vpc.v2.model.NeutronListPortsResponse;
import com.huaweicloud.sdk.vpc.v2.model.NeutronListRoutersRequest;
import com.huaweicloud.sdk.vpc.v2.model.NeutronListRoutersResponse;
import com.huaweicloud.sdk.vpc.v2.model.NeutronListSecurityGroupRulesRequest;
import com.huaweicloud.sdk.vpc.v2.model.NeutronListSecurityGroupRulesResponse;
import com.huaweicloud.sdk.vpc.v2.model.NeutronListSecurityGroupsRequest;
import com.huaweicloud.sdk.vpc.v2.model.NeutronListSecurityGroupsResponse;
import com.huaweicloud.sdk.vpc.v2.model.NeutronListSubnetsRequest;
import com.huaweicloud.sdk.vpc.v2.model.NeutronListSubnetsResponse;
import com.huaweicloud.sdk.vpc.v2.model.NeutronRemoveFirewallRuleRequest;
import com.huaweicloud.sdk.vpc.v2.model.NeutronRemoveFirewallRuleResponse;
import com.huaweicloud.sdk.vpc.v2.model.NeutronRemoveRouterInterfaceRequest;
import com.huaweicloud.sdk.vpc.v2.model.NeutronRemoveRouterInterfaceResponse;
import com.huaweicloud.sdk.vpc.v2.model.NeutronShowFirewallGroupRequest;
import com.huaweicloud.sdk.vpc.v2.model.NeutronShowFirewallGroupResponse;
import com.huaweicloud.sdk.vpc.v2.model.NeutronShowFirewallPolicyRequest;
import com.huaweicloud.sdk.vpc.v2.model.NeutronShowFirewallPolicyResponse;
import com.huaweicloud.sdk.vpc.v2.model.NeutronShowFirewallRuleRequest;
import com.huaweicloud.sdk.vpc.v2.model.NeutronShowFirewallRuleResponse;
import com.huaweicloud.sdk.vpc.v2.model.NeutronShowNetworkRequest;
import com.huaweicloud.sdk.vpc.v2.model.NeutronShowNetworkResponse;
import com.huaweicloud.sdk.vpc.v2.model.NeutronShowPortRequest;
import com.huaweicloud.sdk.vpc.v2.model.NeutronShowPortResponse;
import com.huaweicloud.sdk.vpc.v2.model.NeutronShowRouterRequest;
import com.huaweicloud.sdk.vpc.v2.model.NeutronShowRouterResponse;
import com.huaweicloud.sdk.vpc.v2.model.NeutronShowSecurityGroupRequest;
import com.huaweicloud.sdk.vpc.v2.model.NeutronShowSecurityGroupResponse;
import com.huaweicloud.sdk.vpc.v2.model.NeutronShowSecurityGroupRuleRequest;
import com.huaweicloud.sdk.vpc.v2.model.NeutronShowSecurityGroupRuleResponse;
import com.huaweicloud.sdk.vpc.v2.model.NeutronShowSubnetRequest;
import com.huaweicloud.sdk.vpc.v2.model.NeutronShowSubnetResponse;
import com.huaweicloud.sdk.vpc.v2.model.NeutronUpdateFirewallGroupRequest;
import com.huaweicloud.sdk.vpc.v2.model.NeutronUpdateFirewallGroupResponse;
import com.huaweicloud.sdk.vpc.v2.model.NeutronUpdateFirewallPolicyRequest;
import com.huaweicloud.sdk.vpc.v2.model.NeutronUpdateFirewallPolicyResponse;
import com.huaweicloud.sdk.vpc.v2.model.NeutronUpdateFirewallRuleRequest;
import com.huaweicloud.sdk.vpc.v2.model.NeutronUpdateFirewallRuleResponse;
import com.huaweicloud.sdk.vpc.v2.model.NeutronUpdateNetworkRequest;
import com.huaweicloud.sdk.vpc.v2.model.NeutronUpdateNetworkResponse;
import com.huaweicloud.sdk.vpc.v2.model.NeutronUpdatePortRequest;
import com.huaweicloud.sdk.vpc.v2.model.NeutronUpdatePortResponse;
import com.huaweicloud.sdk.vpc.v2.model.NeutronUpdateRouterRequest;
import com.huaweicloud.sdk.vpc.v2.model.NeutronUpdateRouterResponse;
import com.huaweicloud.sdk.vpc.v2.model.NeutronUpdateSecurityGroupRequest;
import com.huaweicloud.sdk.vpc.v2.model.NeutronUpdateSecurityGroupResponse;
import com.huaweicloud.sdk.vpc.v2.model.NeutronUpdateSubnetRequest;
import com.huaweicloud.sdk.vpc.v2.model.NeutronUpdateSubnetResponse;
import com.huaweicloud.sdk.vpc.v2.model.RejectVpcPeeringRequest;
import com.huaweicloud.sdk.vpc.v2.model.RejectVpcPeeringResponse;
import com.huaweicloud.sdk.vpc.v2.model.ShowFlowLogRequest;
import com.huaweicloud.sdk.vpc.v2.model.ShowFlowLogResponse;
import com.huaweicloud.sdk.vpc.v2.model.ShowNetworkIpAvailabilitiesRequest;
import com.huaweicloud.sdk.vpc.v2.model.ShowNetworkIpAvailabilitiesResponse;
import com.huaweicloud.sdk.vpc.v2.model.ShowPortRequest;
import com.huaweicloud.sdk.vpc.v2.model.ShowPortResponse;
import com.huaweicloud.sdk.vpc.v2.model.ShowPrivateipRequest;
import com.huaweicloud.sdk.vpc.v2.model.ShowPrivateipResponse;
import com.huaweicloud.sdk.vpc.v2.model.ShowQuotaRequest;
import com.huaweicloud.sdk.vpc.v2.model.ShowQuotaResponse;
import com.huaweicloud.sdk.vpc.v2.model.ShowRouteTableRequest;
import com.huaweicloud.sdk.vpc.v2.model.ShowRouteTableResponse;
import com.huaweicloud.sdk.vpc.v2.model.ShowSecurityGroupRequest;
import com.huaweicloud.sdk.vpc.v2.model.ShowSecurityGroupResponse;
import com.huaweicloud.sdk.vpc.v2.model.ShowSecurityGroupRuleRequest;
import com.huaweicloud.sdk.vpc.v2.model.ShowSecurityGroupRuleResponse;
import com.huaweicloud.sdk.vpc.v2.model.ShowSubnetRequest;
import com.huaweicloud.sdk.vpc.v2.model.ShowSubnetResponse;
import com.huaweicloud.sdk.vpc.v2.model.ShowSubnetTagsRequest;
import com.huaweicloud.sdk.vpc.v2.model.ShowSubnetTagsResponse;
import com.huaweicloud.sdk.vpc.v2.model.ShowVpcPeeringRequest;
import com.huaweicloud.sdk.vpc.v2.model.ShowVpcPeeringResponse;
import com.huaweicloud.sdk.vpc.v2.model.ShowVpcRequest;
import com.huaweicloud.sdk.vpc.v2.model.ShowVpcResponse;
import com.huaweicloud.sdk.vpc.v2.model.ShowVpcRouteRequest;
import com.huaweicloud.sdk.vpc.v2.model.ShowVpcRouteResponse;
import com.huaweicloud.sdk.vpc.v2.model.ShowVpcTagsRequest;
import com.huaweicloud.sdk.vpc.v2.model.ShowVpcTagsResponse;
import com.huaweicloud.sdk.vpc.v2.model.UpdateFlowLogRequest;
import com.huaweicloud.sdk.vpc.v2.model.UpdateFlowLogResponse;
import com.huaweicloud.sdk.vpc.v2.model.UpdatePortRequest;
import com.huaweicloud.sdk.vpc.v2.model.UpdatePortResponse;
import com.huaweicloud.sdk.vpc.v2.model.UpdateRouteTableRequest;
import com.huaweicloud.sdk.vpc.v2.model.UpdateRouteTableResponse;
import com.huaweicloud.sdk.vpc.v2.model.UpdateSubnetRequest;
import com.huaweicloud.sdk.vpc.v2.model.UpdateSubnetResponse;
import com.huaweicloud.sdk.vpc.v2.model.UpdateVpcPeeringRequest;
import com.huaweicloud.sdk.vpc.v2.model.UpdateVpcPeeringResponse;
import com.huaweicloud.sdk.vpc.v2.model.UpdateVpcRequest;
import com.huaweicloud.sdk.vpc.v2.model.UpdateVpcResponse;

import java.util.concurrent.CompletableFuture;

public class VpcAsyncClient {

    protected HcClient hcClient;

    public VpcAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<VpcAsyncClient> newBuilder() {
        ClientBuilder<VpcAsyncClient> clientBuilder = new ClientBuilder<>(VpcAsyncClient::new);
        return clientBuilder;
    }

    /**
     * 接受对等连接请求
     *
     * 租户A名下的VPC申请和租户B的VPC建立对等连接，需要等待租户B接受该请求。此接口用于租户接受其他租户发起的对等连接请求。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AcceptVpcPeeringRequest 请求对象
     * @return CompletableFuture<AcceptVpcPeeringResponse>
     */
    public CompletableFuture<AcceptVpcPeeringResponse> acceptVpcPeeringAsync(AcceptVpcPeeringRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.acceptVpcPeering);
    }

    /**
     * 接受对等连接请求
     *
     * 租户A名下的VPC申请和租户B的VPC建立对等连接，需要等待租户B接受该请求。此接口用于租户接受其他租户发起的对等连接请求。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AcceptVpcPeeringRequest 请求对象
     * @return AsyncInvoker<AcceptVpcPeeringRequest, AcceptVpcPeeringResponse>
     */
    public AsyncInvoker<AcceptVpcPeeringRequest, AcceptVpcPeeringResponse> acceptVpcPeeringAsyncInvoker(
        AcceptVpcPeeringRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.acceptVpcPeering, hcClient);
    }

    /**
     * 子网关联路由表
     *
     * 路由表关联子网。子网关联路由表A后，再关联B，不需要先跟路由表A解关联再关联路由表B
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AssociateRouteTableRequest 请求对象
     * @return CompletableFuture<AssociateRouteTableResponse>
     */
    public CompletableFuture<AssociateRouteTableResponse> associateRouteTableAsync(AssociateRouteTableRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.associateRouteTable);
    }

    /**
     * 子网关联路由表
     *
     * 路由表关联子网。子网关联路由表A后，再关联B，不需要先跟路由表A解关联再关联路由表B
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AssociateRouteTableRequest 请求对象
     * @return AsyncInvoker<AssociateRouteTableRequest, AssociateRouteTableResponse>
     */
    public AsyncInvoker<AssociateRouteTableRequest, AssociateRouteTableResponse> associateRouteTableAsyncInvoker(
        AssociateRouteTableRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.associateRouteTable, hcClient);
    }

    /**
     * 批量创建子网资源标签
     *
     * 为指定的子网资源实例批量添加标签。
     * 此接口为幂等接口：创建时如果请求体中存在重复key则报错。创建时，不允许设置重复key数据，如果数据库已存在该key，就覆盖value的值。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateSubnetTagsRequest 请求对象
     * @return CompletableFuture<BatchCreateSubnetTagsResponse>
     */
    public CompletableFuture<BatchCreateSubnetTagsResponse> batchCreateSubnetTagsAsync(
        BatchCreateSubnetTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.batchCreateSubnetTags);
    }

    /**
     * 批量创建子网资源标签
     *
     * 为指定的子网资源实例批量添加标签。
     * 此接口为幂等接口：创建时如果请求体中存在重复key则报错。创建时，不允许设置重复key数据，如果数据库已存在该key，就覆盖value的值。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateSubnetTagsRequest 请求对象
     * @return AsyncInvoker<BatchCreateSubnetTagsRequest, BatchCreateSubnetTagsResponse>
     */
    public AsyncInvoker<BatchCreateSubnetTagsRequest, BatchCreateSubnetTagsResponse> batchCreateSubnetTagsAsyncInvoker(
        BatchCreateSubnetTagsRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.batchCreateSubnetTags, hcClient);
    }

    /**
     * 批量删除子网资源标签
     *
     * 为指定的子网资源实例批量删除标签
     * 此接口为幂等接口：删除时，如果删除的标签不存在，默认处理成功；删除时不对标签字符集范围做校验。删除时tags结构体不能缺失，key不能为空，或者空字符串。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteSubnetTagsRequest 请求对象
     * @return CompletableFuture<BatchDeleteSubnetTagsResponse>
     */
    public CompletableFuture<BatchDeleteSubnetTagsResponse> batchDeleteSubnetTagsAsync(
        BatchDeleteSubnetTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.batchDeleteSubnetTags);
    }

    /**
     * 批量删除子网资源标签
     *
     * 为指定的子网资源实例批量删除标签
     * 此接口为幂等接口：删除时，如果删除的标签不存在，默认处理成功；删除时不对标签字符集范围做校验。删除时tags结构体不能缺失，key不能为空，或者空字符串。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteSubnetTagsRequest 请求对象
     * @return AsyncInvoker<BatchDeleteSubnetTagsRequest, BatchDeleteSubnetTagsResponse>
     */
    public AsyncInvoker<BatchDeleteSubnetTagsRequest, BatchDeleteSubnetTagsResponse> batchDeleteSubnetTagsAsyncInvoker(
        BatchDeleteSubnetTagsRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.batchDeleteSubnetTags, hcClient);
    }

    /**
     * 创建流日志
     *
     * 创建流日志。
     * 流日志功能可以记录虚拟私有云中的流量信息，帮助您检查和优化安全组和网络ACL防火墙控制规则、监控网络流量、进行网络攻击分析等。
     * VPC流日志功能需要与云日志服务LTS结合使用，请先在云日志服务中创建日志组和日志主题，然后再创建VPC流日志。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateFlowLogRequest 请求对象
     * @return CompletableFuture<CreateFlowLogResponse>
     */
    public CompletableFuture<CreateFlowLogResponse> createFlowLogAsync(CreateFlowLogRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.createFlowLog);
    }

    /**
     * 创建流日志
     *
     * 创建流日志。
     * 流日志功能可以记录虚拟私有云中的流量信息，帮助您检查和优化安全组和网络ACL防火墙控制规则、监控网络流量、进行网络攻击分析等。
     * VPC流日志功能需要与云日志服务LTS结合使用，请先在云日志服务中创建日志组和日志主题，然后再创建VPC流日志。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateFlowLogRequest 请求对象
     * @return AsyncInvoker<CreateFlowLogRequest, CreateFlowLogResponse>
     */
    public AsyncInvoker<CreateFlowLogRequest, CreateFlowLogResponse> createFlowLogAsyncInvoker(
        CreateFlowLogRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.createFlowLog, hcClient);
    }

    /**
     * 创建端口
     *
     * 创建端口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePortRequest 请求对象
     * @return CompletableFuture<CreatePortResponse>
     */
    public CompletableFuture<CreatePortResponse> createPortAsync(CreatePortRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.createPort);
    }

    /**
     * 创建端口
     *
     * 创建端口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePortRequest 请求对象
     * @return AsyncInvoker<CreatePortRequest, CreatePortResponse>
     */
    public AsyncInvoker<CreatePortRequest, CreatePortResponse> createPortAsyncInvoker(CreatePortRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.createPort, hcClient);
    }

    /**
     * 创建路由表
     *
     * 创建路由表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateRouteTableRequest 请求对象
     * @return CompletableFuture<CreateRouteTableResponse>
     */
    public CompletableFuture<CreateRouteTableResponse> createRouteTableAsync(CreateRouteTableRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.createRouteTable);
    }

    /**
     * 创建路由表
     *
     * 创建路由表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateRouteTableRequest 请求对象
     * @return AsyncInvoker<CreateRouteTableRequest, CreateRouteTableResponse>
     */
    public AsyncInvoker<CreateRouteTableRequest, CreateRouteTableResponse> createRouteTableAsyncInvoker(
        CreateRouteTableRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.createRouteTable, hcClient);
    }

    /**
     * 创建安全组
     *
     * 创建安全组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSecurityGroupRequest 请求对象
     * @return CompletableFuture<CreateSecurityGroupResponse>
     */
    public CompletableFuture<CreateSecurityGroupResponse> createSecurityGroupAsync(CreateSecurityGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.createSecurityGroup);
    }

    /**
     * 创建安全组
     *
     * 创建安全组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSecurityGroupRequest 请求对象
     * @return AsyncInvoker<CreateSecurityGroupRequest, CreateSecurityGroupResponse>
     */
    public AsyncInvoker<CreateSecurityGroupRequest, CreateSecurityGroupResponse> createSecurityGroupAsyncInvoker(
        CreateSecurityGroupRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.createSecurityGroup, hcClient);
    }

    /**
     * 创建安全组规则
     *
     * 创建安全组规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSecurityGroupRuleRequest 请求对象
     * @return CompletableFuture<CreateSecurityGroupRuleResponse>
     */
    public CompletableFuture<CreateSecurityGroupRuleResponse> createSecurityGroupRuleAsync(
        CreateSecurityGroupRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.createSecurityGroupRule);
    }

    /**
     * 创建安全组规则
     *
     * 创建安全组规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSecurityGroupRuleRequest 请求对象
     * @return AsyncInvoker<CreateSecurityGroupRuleRequest, CreateSecurityGroupRuleResponse>
     */
    public AsyncInvoker<CreateSecurityGroupRuleRequest, CreateSecurityGroupRuleResponse> createSecurityGroupRuleAsyncInvoker(
        CreateSecurityGroupRuleRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.createSecurityGroupRule, hcClient);
    }

    /**
     * 创建子网
     *
     * 创建子网。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSubnetRequest 请求对象
     * @return CompletableFuture<CreateSubnetResponse>
     */
    public CompletableFuture<CreateSubnetResponse> createSubnetAsync(CreateSubnetRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.createSubnet);
    }

    /**
     * 创建子网
     *
     * 创建子网。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSubnetRequest 请求对象
     * @return AsyncInvoker<CreateSubnetRequest, CreateSubnetResponse>
     */
    public AsyncInvoker<CreateSubnetRequest, CreateSubnetResponse> createSubnetAsyncInvoker(
        CreateSubnetRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.createSubnet, hcClient);
    }

    /**
     * 创建子网资源标签
     *
     * 给指定子网资源实例增加标签信息。
     * 此接口为幂等接口：创建时，如果创建的标签已经存在（key相同），则覆盖。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSubnetTagRequest 请求对象
     * @return CompletableFuture<CreateSubnetTagResponse>
     */
    public CompletableFuture<CreateSubnetTagResponse> createSubnetTagAsync(CreateSubnetTagRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.createSubnetTag);
    }

    /**
     * 创建子网资源标签
     *
     * 给指定子网资源实例增加标签信息。
     * 此接口为幂等接口：创建时，如果创建的标签已经存在（key相同），则覆盖。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSubnetTagRequest 请求对象
     * @return AsyncInvoker<CreateSubnetTagRequest, CreateSubnetTagResponse>
     */
    public AsyncInvoker<CreateSubnetTagRequest, CreateSubnetTagResponse> createSubnetTagAsyncInvoker(
        CreateSubnetTagRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.createSubnetTag, hcClient);
    }

    /**
     * 创建对等连接
     *
     * 创建对等连接。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateVpcPeeringRequest 请求对象
     * @return CompletableFuture<CreateVpcPeeringResponse>
     */
    public CompletableFuture<CreateVpcPeeringResponse> createVpcPeeringAsync(CreateVpcPeeringRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.createVpcPeering);
    }

    /**
     * 创建对等连接
     *
     * 创建对等连接。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateVpcPeeringRequest 请求对象
     * @return AsyncInvoker<CreateVpcPeeringRequest, CreateVpcPeeringResponse>
     */
    public AsyncInvoker<CreateVpcPeeringRequest, CreateVpcPeeringResponse> createVpcPeeringAsyncInvoker(
        CreateVpcPeeringRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.createVpcPeering, hcClient);
    }

    /**
     * 删除流日志
     *
     * 删除流日志
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteFlowLogRequest 请求对象
     * @return CompletableFuture<DeleteFlowLogResponse>
     */
    public CompletableFuture<DeleteFlowLogResponse> deleteFlowLogAsync(DeleteFlowLogRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.deleteFlowLog);
    }

    /**
     * 删除流日志
     *
     * 删除流日志
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteFlowLogRequest 请求对象
     * @return AsyncInvoker<DeleteFlowLogRequest, DeleteFlowLogResponse>
     */
    public AsyncInvoker<DeleteFlowLogRequest, DeleteFlowLogResponse> deleteFlowLogAsyncInvoker(
        DeleteFlowLogRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.deleteFlowLog, hcClient);
    }

    /**
     * 删除端口
     *
     * 删除端口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePortRequest 请求对象
     * @return CompletableFuture<DeletePortResponse>
     */
    public CompletableFuture<DeletePortResponse> deletePortAsync(DeletePortRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.deletePort);
    }

    /**
     * 删除端口
     *
     * 删除端口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePortRequest 请求对象
     * @return AsyncInvoker<DeletePortRequest, DeletePortResponse>
     */
    public AsyncInvoker<DeletePortRequest, DeletePortResponse> deletePortAsyncInvoker(DeletePortRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.deletePort, hcClient);
    }

    /**
     * 删除路由表
     *
     * 删除路由表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteRouteTableRequest 请求对象
     * @return CompletableFuture<DeleteRouteTableResponse>
     */
    public CompletableFuture<DeleteRouteTableResponse> deleteRouteTableAsync(DeleteRouteTableRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.deleteRouteTable);
    }

    /**
     * 删除路由表
     *
     * 删除路由表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteRouteTableRequest 请求对象
     * @return AsyncInvoker<DeleteRouteTableRequest, DeleteRouteTableResponse>
     */
    public AsyncInvoker<DeleteRouteTableRequest, DeleteRouteTableResponse> deleteRouteTableAsyncInvoker(
        DeleteRouteTableRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.deleteRouteTable, hcClient);
    }

    /**
     * 删除安全组
     *
     * 删除安全组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSecurityGroupRequest 请求对象
     * @return CompletableFuture<DeleteSecurityGroupResponse>
     */
    public CompletableFuture<DeleteSecurityGroupResponse> deleteSecurityGroupAsync(DeleteSecurityGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.deleteSecurityGroup);
    }

    /**
     * 删除安全组
     *
     * 删除安全组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSecurityGroupRequest 请求对象
     * @return AsyncInvoker<DeleteSecurityGroupRequest, DeleteSecurityGroupResponse>
     */
    public AsyncInvoker<DeleteSecurityGroupRequest, DeleteSecurityGroupResponse> deleteSecurityGroupAsyncInvoker(
        DeleteSecurityGroupRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.deleteSecurityGroup, hcClient);
    }

    /**
     * 删除安全组规则
     *
     * 删除安全组规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSecurityGroupRuleRequest 请求对象
     * @return CompletableFuture<DeleteSecurityGroupRuleResponse>
     */
    public CompletableFuture<DeleteSecurityGroupRuleResponse> deleteSecurityGroupRuleAsync(
        DeleteSecurityGroupRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.deleteSecurityGroupRule);
    }

    /**
     * 删除安全组规则
     *
     * 删除安全组规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSecurityGroupRuleRequest 请求对象
     * @return AsyncInvoker<DeleteSecurityGroupRuleRequest, DeleteSecurityGroupRuleResponse>
     */
    public AsyncInvoker<DeleteSecurityGroupRuleRequest, DeleteSecurityGroupRuleResponse> deleteSecurityGroupRuleAsyncInvoker(
        DeleteSecurityGroupRuleRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.deleteSecurityGroupRule, hcClient);
    }

    /**
     * 删除子网
     *
     * 删除子网
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSubnetRequest 请求对象
     * @return CompletableFuture<DeleteSubnetResponse>
     */
    public CompletableFuture<DeleteSubnetResponse> deleteSubnetAsync(DeleteSubnetRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.deleteSubnet);
    }

    /**
     * 删除子网
     *
     * 删除子网
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSubnetRequest 请求对象
     * @return AsyncInvoker<DeleteSubnetRequest, DeleteSubnetResponse>
     */
    public AsyncInvoker<DeleteSubnetRequest, DeleteSubnetResponse> deleteSubnetAsyncInvoker(
        DeleteSubnetRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.deleteSubnet, hcClient);
    }

    /**
     * 删除子网资源标签
     *
     * 删除指定子网资源实例的标签信息。
     * 该接口为幂等接口：删除的key不存在报404，Key不能为空或者空字符串
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSubnetTagRequest 请求对象
     * @return CompletableFuture<DeleteSubnetTagResponse>
     */
    public CompletableFuture<DeleteSubnetTagResponse> deleteSubnetTagAsync(DeleteSubnetTagRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.deleteSubnetTag);
    }

    /**
     * 删除子网资源标签
     *
     * 删除指定子网资源实例的标签信息。
     * 该接口为幂等接口：删除的key不存在报404，Key不能为空或者空字符串
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSubnetTagRequest 请求对象
     * @return AsyncInvoker<DeleteSubnetTagRequest, DeleteSubnetTagResponse>
     */
    public AsyncInvoker<DeleteSubnetTagRequest, DeleteSubnetTagResponse> deleteSubnetTagAsyncInvoker(
        DeleteSubnetTagRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.deleteSubnetTag, hcClient);
    }

    /**
     * 删除对等连接
     *
     * 删除对等连接。
     * 可以在在本端或对端任何一端删除对等连接。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteVpcPeeringRequest 请求对象
     * @return CompletableFuture<DeleteVpcPeeringResponse>
     */
    public CompletableFuture<DeleteVpcPeeringResponse> deleteVpcPeeringAsync(DeleteVpcPeeringRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.deleteVpcPeering);
    }

    /**
     * 删除对等连接
     *
     * 删除对等连接。
     * 可以在在本端或对端任何一端删除对等连接。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteVpcPeeringRequest 请求对象
     * @return AsyncInvoker<DeleteVpcPeeringRequest, DeleteVpcPeeringResponse>
     */
    public AsyncInvoker<DeleteVpcPeeringRequest, DeleteVpcPeeringResponse> deleteVpcPeeringAsyncInvoker(
        DeleteVpcPeeringRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.deleteVpcPeering, hcClient);
    }

    /**
     * 子网解关联路由表
     *
     * 子网解关联路由表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisassociateRouteTableRequest 请求对象
     * @return CompletableFuture<DisassociateRouteTableResponse>
     */
    public CompletableFuture<DisassociateRouteTableResponse> disassociateRouteTableAsync(
        DisassociateRouteTableRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.disassociateRouteTable);
    }

    /**
     * 子网解关联路由表
     *
     * 子网解关联路由表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisassociateRouteTableRequest 请求对象
     * @return AsyncInvoker<DisassociateRouteTableRequest, DisassociateRouteTableResponse>
     */
    public AsyncInvoker<DisassociateRouteTableRequest, DisassociateRouteTableResponse> disassociateRouteTableAsyncInvoker(
        DisassociateRouteTableRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.disassociateRouteTable, hcClient);
    }

    /**
     * 查询流日志列表
     *
     * 查询提交请求的租户的所有流日志列表，并根据过滤条件进行过滤
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFlowLogsRequest 请求对象
     * @return CompletableFuture<ListFlowLogsResponse>
     */
    public CompletableFuture<ListFlowLogsResponse> listFlowLogsAsync(ListFlowLogsRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.listFlowLogs);
    }

    /**
     * 查询流日志列表
     *
     * 查询提交请求的租户的所有流日志列表，并根据过滤条件进行过滤
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFlowLogsRequest 请求对象
     * @return AsyncInvoker<ListFlowLogsRequest, ListFlowLogsResponse>
     */
    public AsyncInvoker<ListFlowLogsRequest, ListFlowLogsResponse> listFlowLogsAsyncInvoker(
        ListFlowLogsRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.listFlowLogs, hcClient);
    }

    /**
     * 查询端口列表
     *
     * 查询提交请求的租户的所有端口，单次查询最多返回2000条数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPortsRequest 请求对象
     * @return CompletableFuture<ListPortsResponse>
     */
    public CompletableFuture<ListPortsResponse> listPortsAsync(ListPortsRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.listPorts);
    }

    /**
     * 查询端口列表
     *
     * 查询提交请求的租户的所有端口，单次查询最多返回2000条数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPortsRequest 请求对象
     * @return AsyncInvoker<ListPortsRequest, ListPortsResponse>
     */
    public AsyncInvoker<ListPortsRequest, ListPortsResponse> listPortsAsyncInvoker(ListPortsRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.listPorts, hcClient);
    }

    /**
     * 查询路由表列表
     *
     * 查询提交请求的帐户的所有路由表列表，并根据过滤条件进行过滤
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRouteTablesRequest 请求对象
     * @return CompletableFuture<ListRouteTablesResponse>
     */
    public CompletableFuture<ListRouteTablesResponse> listRouteTablesAsync(ListRouteTablesRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.listRouteTables);
    }

    /**
     * 查询路由表列表
     *
     * 查询提交请求的帐户的所有路由表列表，并根据过滤条件进行过滤
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRouteTablesRequest 请求对象
     * @return AsyncInvoker<ListRouteTablesRequest, ListRouteTablesResponse>
     */
    public AsyncInvoker<ListRouteTablesRequest, ListRouteTablesResponse> listRouteTablesAsyncInvoker(
        ListRouteTablesRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.listRouteTables, hcClient);
    }

    /**
     * 查询安全组规则列表
     *
     * 查询安全组规则列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSecurityGroupRulesRequest 请求对象
     * @return CompletableFuture<ListSecurityGroupRulesResponse>
     */
    public CompletableFuture<ListSecurityGroupRulesResponse> listSecurityGroupRulesAsync(
        ListSecurityGroupRulesRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.listSecurityGroupRules);
    }

    /**
     * 查询安全组规则列表
     *
     * 查询安全组规则列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSecurityGroupRulesRequest 请求对象
     * @return AsyncInvoker<ListSecurityGroupRulesRequest, ListSecurityGroupRulesResponse>
     */
    public AsyncInvoker<ListSecurityGroupRulesRequest, ListSecurityGroupRulesResponse> listSecurityGroupRulesAsyncInvoker(
        ListSecurityGroupRulesRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.listSecurityGroupRules, hcClient);
    }

    /**
     * 查询安全组列表
     *
     * 查询安全组列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSecurityGroupsRequest 请求对象
     * @return CompletableFuture<ListSecurityGroupsResponse>
     */
    public CompletableFuture<ListSecurityGroupsResponse> listSecurityGroupsAsync(ListSecurityGroupsRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.listSecurityGroups);
    }

    /**
     * 查询安全组列表
     *
     * 查询安全组列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSecurityGroupsRequest 请求对象
     * @return AsyncInvoker<ListSecurityGroupsRequest, ListSecurityGroupsResponse>
     */
    public AsyncInvoker<ListSecurityGroupsRequest, ListSecurityGroupsResponse> listSecurityGroupsAsyncInvoker(
        ListSecurityGroupsRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.listSecurityGroups, hcClient);
    }

    /**
     * 查询子网项目标签
     *
     * 查询租户在指定区域和实例类型的所有标签集合
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSubnetTagsRequest 请求对象
     * @return CompletableFuture<ListSubnetTagsResponse>
     */
    public CompletableFuture<ListSubnetTagsResponse> listSubnetTagsAsync(ListSubnetTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.listSubnetTags);
    }

    /**
     * 查询子网项目标签
     *
     * 查询租户在指定区域和实例类型的所有标签集合
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSubnetTagsRequest 请求对象
     * @return AsyncInvoker<ListSubnetTagsRequest, ListSubnetTagsResponse>
     */
    public AsyncInvoker<ListSubnetTagsRequest, ListSubnetTagsResponse> listSubnetTagsAsyncInvoker(
        ListSubnetTagsRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.listSubnetTags, hcClient);
    }

    /**
     * 查询子网列表
     *
     * 查询子网列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSubnetsRequest 请求对象
     * @return CompletableFuture<ListSubnetsResponse>
     */
    public CompletableFuture<ListSubnetsResponse> listSubnetsAsync(ListSubnetsRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.listSubnets);
    }

    /**
     * 查询子网列表
     *
     * 查询子网列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSubnetsRequest 请求对象
     * @return AsyncInvoker<ListSubnetsRequest, ListSubnetsResponse>
     */
    public AsyncInvoker<ListSubnetsRequest, ListSubnetsResponse> listSubnetsAsyncInvoker(ListSubnetsRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.listSubnets, hcClient);
    }

    /**
     * 查询子网资源实例
     *
     * 使用标签过滤实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSubnetsByTagsRequest 请求对象
     * @return CompletableFuture<ListSubnetsByTagsResponse>
     */
    public CompletableFuture<ListSubnetsByTagsResponse> listSubnetsByTagsAsync(ListSubnetsByTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.listSubnetsByTags);
    }

    /**
     * 查询子网资源实例
     *
     * 使用标签过滤实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSubnetsByTagsRequest 请求对象
     * @return AsyncInvoker<ListSubnetsByTagsRequest, ListSubnetsByTagsResponse>
     */
    public AsyncInvoker<ListSubnetsByTagsRequest, ListSubnetsByTagsResponse> listSubnetsByTagsAsyncInvoker(
        ListSubnetsByTagsRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.listSubnetsByTags, hcClient);
    }

    /**
     * 查询对等连接列表
     *
     * 查询提交请求的租户的所有对等连接。根据过滤条件进行过滤。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVpcPeeringsRequest 请求对象
     * @return CompletableFuture<ListVpcPeeringsResponse>
     */
    public CompletableFuture<ListVpcPeeringsResponse> listVpcPeeringsAsync(ListVpcPeeringsRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.listVpcPeerings);
    }

    /**
     * 查询对等连接列表
     *
     * 查询提交请求的租户的所有对等连接。根据过滤条件进行过滤。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVpcPeeringsRequest 请求对象
     * @return AsyncInvoker<ListVpcPeeringsRequest, ListVpcPeeringsResponse>
     */
    public AsyncInvoker<ListVpcPeeringsRequest, ListVpcPeeringsResponse> listVpcPeeringsAsyncInvoker(
        ListVpcPeeringsRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.listVpcPeerings, hcClient);
    }

    /**
     * 拒绝对等连接请求
     *
     * 租户A名下的VPC申请和租户B的VPC建立对等连接，需要等待租户B接受该请求。此接口用于租户拒绝其他租户发起的对等连接请求。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RejectVpcPeeringRequest 请求对象
     * @return CompletableFuture<RejectVpcPeeringResponse>
     */
    public CompletableFuture<RejectVpcPeeringResponse> rejectVpcPeeringAsync(RejectVpcPeeringRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.rejectVpcPeering);
    }

    /**
     * 拒绝对等连接请求
     *
     * 租户A名下的VPC申请和租户B的VPC建立对等连接，需要等待租户B接受该请求。此接口用于租户拒绝其他租户发起的对等连接请求。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RejectVpcPeeringRequest 请求对象
     * @return AsyncInvoker<RejectVpcPeeringRequest, RejectVpcPeeringResponse>
     */
    public AsyncInvoker<RejectVpcPeeringRequest, RejectVpcPeeringResponse> rejectVpcPeeringAsyncInvoker(
        RejectVpcPeeringRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.rejectVpcPeering, hcClient);
    }

    /**
     * 查询流日志
     *
     * 查询流日志详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFlowLogRequest 请求对象
     * @return CompletableFuture<ShowFlowLogResponse>
     */
    public CompletableFuture<ShowFlowLogResponse> showFlowLogAsync(ShowFlowLogRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.showFlowLog);
    }

    /**
     * 查询流日志
     *
     * 查询流日志详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFlowLogRequest 请求对象
     * @return AsyncInvoker<ShowFlowLogRequest, ShowFlowLogResponse>
     */
    public AsyncInvoker<ShowFlowLogRequest, ShowFlowLogResponse> showFlowLogAsyncInvoker(ShowFlowLogRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.showFlowLog, hcClient);
    }

    /**
     * 查询端口
     *
     * 查询单个端口详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPortRequest 请求对象
     * @return CompletableFuture<ShowPortResponse>
     */
    public CompletableFuture<ShowPortResponse> showPortAsync(ShowPortRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.showPort);
    }

    /**
     * 查询端口
     *
     * 查询单个端口详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPortRequest 请求对象
     * @return AsyncInvoker<ShowPortRequest, ShowPortResponse>
     */
    public AsyncInvoker<ShowPortRequest, ShowPortResponse> showPortAsyncInvoker(ShowPortRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.showPort, hcClient);
    }

    /**
     * 查询配额
     *
     * 查询单租户在VPC服务下的网络资源配额，包括vpc配额、子网配额、安全组配额、安全组规则配额、弹性公网IP配额，vpn配额等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowQuotaRequest 请求对象
     * @return CompletableFuture<ShowQuotaResponse>
     */
    public CompletableFuture<ShowQuotaResponse> showQuotaAsync(ShowQuotaRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.showQuota);
    }

    /**
     * 查询配额
     *
     * 查询单租户在VPC服务下的网络资源配额，包括vpc配额、子网配额、安全组配额、安全组规则配额、弹性公网IP配额，vpn配额等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowQuotaRequest 请求对象
     * @return AsyncInvoker<ShowQuotaRequest, ShowQuotaResponse>
     */
    public AsyncInvoker<ShowQuotaRequest, ShowQuotaResponse> showQuotaAsyncInvoker(ShowQuotaRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.showQuota, hcClient);
    }

    /**
     * 查询路由表
     *
     * 查询路由表详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRouteTableRequest 请求对象
     * @return CompletableFuture<ShowRouteTableResponse>
     */
    public CompletableFuture<ShowRouteTableResponse> showRouteTableAsync(ShowRouteTableRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.showRouteTable);
    }

    /**
     * 查询路由表
     *
     * 查询路由表详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRouteTableRequest 请求对象
     * @return AsyncInvoker<ShowRouteTableRequest, ShowRouteTableResponse>
     */
    public AsyncInvoker<ShowRouteTableRequest, ShowRouteTableResponse> showRouteTableAsyncInvoker(
        ShowRouteTableRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.showRouteTable, hcClient);
    }

    /**
     * 查询安全组
     *
     * 查询单个安全组详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSecurityGroupRequest 请求对象
     * @return CompletableFuture<ShowSecurityGroupResponse>
     */
    public CompletableFuture<ShowSecurityGroupResponse> showSecurityGroupAsync(ShowSecurityGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.showSecurityGroup);
    }

    /**
     * 查询安全组
     *
     * 查询单个安全组详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSecurityGroupRequest 请求对象
     * @return AsyncInvoker<ShowSecurityGroupRequest, ShowSecurityGroupResponse>
     */
    public AsyncInvoker<ShowSecurityGroupRequest, ShowSecurityGroupResponse> showSecurityGroupAsyncInvoker(
        ShowSecurityGroupRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.showSecurityGroup, hcClient);
    }

    /**
     * 查询安全组规则
     *
     * 查询单个安全组规则详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSecurityGroupRuleRequest 请求对象
     * @return CompletableFuture<ShowSecurityGroupRuleResponse>
     */
    public CompletableFuture<ShowSecurityGroupRuleResponse> showSecurityGroupRuleAsync(
        ShowSecurityGroupRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.showSecurityGroupRule);
    }

    /**
     * 查询安全组规则
     *
     * 查询单个安全组规则详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSecurityGroupRuleRequest 请求对象
     * @return AsyncInvoker<ShowSecurityGroupRuleRequest, ShowSecurityGroupRuleResponse>
     */
    public AsyncInvoker<ShowSecurityGroupRuleRequest, ShowSecurityGroupRuleResponse> showSecurityGroupRuleAsyncInvoker(
        ShowSecurityGroupRuleRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.showSecurityGroupRule, hcClient);
    }

    /**
     * 查询子网
     *
     * 查询子网详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSubnetRequest 请求对象
     * @return CompletableFuture<ShowSubnetResponse>
     */
    public CompletableFuture<ShowSubnetResponse> showSubnetAsync(ShowSubnetRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.showSubnet);
    }

    /**
     * 查询子网
     *
     * 查询子网详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSubnetRequest 请求对象
     * @return AsyncInvoker<ShowSubnetRequest, ShowSubnetResponse>
     */
    public AsyncInvoker<ShowSubnetRequest, ShowSubnetResponse> showSubnetAsyncInvoker(ShowSubnetRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.showSubnet, hcClient);
    }

    /**
     * 查询子网资源标签
     *
     * 查询指定子网实例的标签信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSubnetTagsRequest 请求对象
     * @return CompletableFuture<ShowSubnetTagsResponse>
     */
    public CompletableFuture<ShowSubnetTagsResponse> showSubnetTagsAsync(ShowSubnetTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.showSubnetTags);
    }

    /**
     * 查询子网资源标签
     *
     * 查询指定子网实例的标签信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSubnetTagsRequest 请求对象
     * @return AsyncInvoker<ShowSubnetTagsRequest, ShowSubnetTagsResponse>
     */
    public AsyncInvoker<ShowSubnetTagsRequest, ShowSubnetTagsResponse> showSubnetTagsAsyncInvoker(
        ShowSubnetTagsRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.showSubnetTags, hcClient);
    }

    /**
     * 查询对等连接
     *
     * 查询对等连接详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowVpcPeeringRequest 请求对象
     * @return CompletableFuture<ShowVpcPeeringResponse>
     */
    public CompletableFuture<ShowVpcPeeringResponse> showVpcPeeringAsync(ShowVpcPeeringRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.showVpcPeering);
    }

    /**
     * 查询对等连接
     *
     * 查询对等连接详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowVpcPeeringRequest 请求对象
     * @return AsyncInvoker<ShowVpcPeeringRequest, ShowVpcPeeringResponse>
     */
    public AsyncInvoker<ShowVpcPeeringRequest, ShowVpcPeeringResponse> showVpcPeeringAsyncInvoker(
        ShowVpcPeeringRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.showVpcPeering, hcClient);
    }

    /**
     * 更新流日志
     *
     * 更新流日志
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateFlowLogRequest 请求对象
     * @return CompletableFuture<UpdateFlowLogResponse>
     */
    public CompletableFuture<UpdateFlowLogResponse> updateFlowLogAsync(UpdateFlowLogRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.updateFlowLog);
    }

    /**
     * 更新流日志
     *
     * 更新流日志
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateFlowLogRequest 请求对象
     * @return AsyncInvoker<UpdateFlowLogRequest, UpdateFlowLogResponse>
     */
    public AsyncInvoker<UpdateFlowLogRequest, UpdateFlowLogResponse> updateFlowLogAsyncInvoker(
        UpdateFlowLogRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.updateFlowLog, hcClient);
    }

    /**
     * 更新端口
     *
     * 更新端口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePortRequest 请求对象
     * @return CompletableFuture<UpdatePortResponse>
     */
    public CompletableFuture<UpdatePortResponse> updatePortAsync(UpdatePortRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.updatePort);
    }

    /**
     * 更新端口
     *
     * 更新端口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePortRequest 请求对象
     * @return AsyncInvoker<UpdatePortRequest, UpdatePortResponse>
     */
    public AsyncInvoker<UpdatePortRequest, UpdatePortResponse> updatePortAsyncInvoker(UpdatePortRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.updatePort, hcClient);
    }

    /**
     * 更新路由表
     *
     * 更新路由表，包括可以更新路由表的名称，描述，以及新增、更新、删除路由条目
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateRouteTableRequest 请求对象
     * @return CompletableFuture<UpdateRouteTableResponse>
     */
    public CompletableFuture<UpdateRouteTableResponse> updateRouteTableAsync(UpdateRouteTableRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.updateRouteTable);
    }

    /**
     * 更新路由表
     *
     * 更新路由表，包括可以更新路由表的名称，描述，以及新增、更新、删除路由条目
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateRouteTableRequest 请求对象
     * @return AsyncInvoker<UpdateRouteTableRequest, UpdateRouteTableResponse>
     */
    public AsyncInvoker<UpdateRouteTableRequest, UpdateRouteTableResponse> updateRouteTableAsyncInvoker(
        UpdateRouteTableRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.updateRouteTable, hcClient);
    }

    /**
     * 更新子网
     *
     * 更新子网。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSubnetRequest 请求对象
     * @return CompletableFuture<UpdateSubnetResponse>
     */
    public CompletableFuture<UpdateSubnetResponse> updateSubnetAsync(UpdateSubnetRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.updateSubnet);
    }

    /**
     * 更新子网
     *
     * 更新子网。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSubnetRequest 请求对象
     * @return AsyncInvoker<UpdateSubnetRequest, UpdateSubnetResponse>
     */
    public AsyncInvoker<UpdateSubnetRequest, UpdateSubnetResponse> updateSubnetAsyncInvoker(
        UpdateSubnetRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.updateSubnet, hcClient);
    }

    /**
     * 更新对等连接
     *
     * 更新对等连接。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateVpcPeeringRequest 请求对象
     * @return CompletableFuture<UpdateVpcPeeringResponse>
     */
    public CompletableFuture<UpdateVpcPeeringResponse> updateVpcPeeringAsync(UpdateVpcPeeringRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.updateVpcPeering);
    }

    /**
     * 更新对等连接
     *
     * 更新对等连接。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateVpcPeeringRequest 请求对象
     * @return AsyncInvoker<UpdateVpcPeeringRequest, UpdateVpcPeeringResponse>
     */
    public AsyncInvoker<UpdateVpcPeeringRequest, UpdateVpcPeeringResponse> updateVpcPeeringAsyncInvoker(
        UpdateVpcPeeringRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.updateVpcPeering, hcClient);
    }

    /**
     * 申请私有IP
     *
     * 申请私有IP。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePrivateipRequest 请求对象
     * @return CompletableFuture<CreatePrivateipResponse>
     */
    public CompletableFuture<CreatePrivateipResponse> createPrivateipAsync(CreatePrivateipRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.createPrivateip);
    }

    /**
     * 申请私有IP
     *
     * 申请私有IP。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePrivateipRequest 请求对象
     * @return AsyncInvoker<CreatePrivateipRequest, CreatePrivateipResponse>
     */
    public AsyncInvoker<CreatePrivateipRequest, CreatePrivateipResponse> createPrivateipAsyncInvoker(
        CreatePrivateipRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.createPrivateip, hcClient);
    }

    /**
     * 删除私有IP
     *
     * 删除私有IP。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePrivateipRequest 请求对象
     * @return CompletableFuture<DeletePrivateipResponse>
     */
    public CompletableFuture<DeletePrivateipResponse> deletePrivateipAsync(DeletePrivateipRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.deletePrivateip);
    }

    /**
     * 删除私有IP
     *
     * 删除私有IP。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePrivateipRequest 请求对象
     * @return AsyncInvoker<DeletePrivateipRequest, DeletePrivateipResponse>
     */
    public AsyncInvoker<DeletePrivateipRequest, DeletePrivateipResponse> deletePrivateipAsyncInvoker(
        DeletePrivateipRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.deletePrivateip, hcClient);
    }

    /**
     * 查询私有IP列表
     *
     * 查询指定子网下的私有IP列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPrivateipsRequest 请求对象
     * @return CompletableFuture<ListPrivateipsResponse>
     */
    public CompletableFuture<ListPrivateipsResponse> listPrivateipsAsync(ListPrivateipsRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.listPrivateips);
    }

    /**
     * 查询私有IP列表
     *
     * 查询指定子网下的私有IP列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPrivateipsRequest 请求对象
     * @return AsyncInvoker<ListPrivateipsRequest, ListPrivateipsResponse>
     */
    public AsyncInvoker<ListPrivateipsRequest, ListPrivateipsResponse> listPrivateipsAsyncInvoker(
        ListPrivateipsRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.listPrivateips, hcClient);
    }

    /**
     * 查询网络IP使用情况
     *
     * 显示一个指定网络中的IPv4地址使用情况。
     * 包括此网络中的IP总数以及已用IP总数，以及网络下每一个子网的IP地址总数和可用IP地址总数。
     * 
     * &gt; 须知
     * 
     * - 系统预留地址指的是子网的第1个以及最后4个地址，一般用于网关、DHCP等服务。
     * - 这里以及下文描述的IP地址总数、已用IP地址总数不包含系统预留地址。
     * - 在分配IP时，用户可以指定系统预留的IP地址。但是不论IP是如何分配的，只要是处于系统预留IP地址段的IP均不会被统计到已用IP地址数目和IP地址总数中。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowNetworkIpAvailabilitiesRequest 请求对象
     * @return CompletableFuture<ShowNetworkIpAvailabilitiesResponse>
     */
    public CompletableFuture<ShowNetworkIpAvailabilitiesResponse> showNetworkIpAvailabilitiesAsync(
        ShowNetworkIpAvailabilitiesRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.showNetworkIpAvailabilities);
    }

    /**
     * 查询网络IP使用情况
     *
     * 显示一个指定网络中的IPv4地址使用情况。
     * 包括此网络中的IP总数以及已用IP总数，以及网络下每一个子网的IP地址总数和可用IP地址总数。
     * 
     * &gt; 须知
     * 
     * - 系统预留地址指的是子网的第1个以及最后4个地址，一般用于网关、DHCP等服务。
     * - 这里以及下文描述的IP地址总数、已用IP地址总数不包含系统预留地址。
     * - 在分配IP时，用户可以指定系统预留的IP地址。但是不论IP是如何分配的，只要是处于系统预留IP地址段的IP均不会被统计到已用IP地址数目和IP地址总数中。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowNetworkIpAvailabilitiesRequest 请求对象
     * @return AsyncInvoker<ShowNetworkIpAvailabilitiesRequest, ShowNetworkIpAvailabilitiesResponse>
     */
    public AsyncInvoker<ShowNetworkIpAvailabilitiesRequest, ShowNetworkIpAvailabilitiesResponse> showNetworkIpAvailabilitiesAsyncInvoker(
        ShowNetworkIpAvailabilitiesRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.showNetworkIpAvailabilities, hcClient);
    }

    /**
     * 查询私有IP
     *
     * 指定ID查询私有IP。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPrivateipRequest 请求对象
     * @return CompletableFuture<ShowPrivateipResponse>
     */
    public CompletableFuture<ShowPrivateipResponse> showPrivateipAsync(ShowPrivateipRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.showPrivateip);
    }

    /**
     * 查询私有IP
     *
     * 指定ID查询私有IP。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPrivateipRequest 请求对象
     * @return AsyncInvoker<ShowPrivateipRequest, ShowPrivateipResponse>
     */
    public AsyncInvoker<ShowPrivateipRequest, ShowPrivateipResponse> showPrivateipAsyncInvoker(
        ShowPrivateipRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.showPrivateip, hcClient);
    }

    /**
     * 路由器添加接口
     *
     * 添加路由器接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request NeutronAddRouterInterfaceRequest 请求对象
     * @return CompletableFuture<NeutronAddRouterInterfaceResponse>
     */
    public CompletableFuture<NeutronAddRouterInterfaceResponse> neutronAddRouterInterfaceAsync(
        NeutronAddRouterInterfaceRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.neutronAddRouterInterface);
    }

    /**
     * 路由器添加接口
     *
     * 添加路由器接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request NeutronAddRouterInterfaceRequest 请求对象
     * @return AsyncInvoker<NeutronAddRouterInterfaceRequest, NeutronAddRouterInterfaceResponse>
     */
    public AsyncInvoker<NeutronAddRouterInterfaceRequest, NeutronAddRouterInterfaceResponse> neutronAddRouterInterfaceAsyncInvoker(
        NeutronAddRouterInterfaceRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.neutronAddRouterInterface, hcClient);
    }

    /**
     * 创建网络
     *
     * 创建网络
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request NeutronCreateNetworkRequest 请求对象
     * @return CompletableFuture<NeutronCreateNetworkResponse>
     */
    public CompletableFuture<NeutronCreateNetworkResponse> neutronCreateNetworkAsync(
        NeutronCreateNetworkRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.neutronCreateNetwork);
    }

    /**
     * 创建网络
     *
     * 创建网络
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request NeutronCreateNetworkRequest 请求对象
     * @return AsyncInvoker<NeutronCreateNetworkRequest, NeutronCreateNetworkResponse>
     */
    public AsyncInvoker<NeutronCreateNetworkRequest, NeutronCreateNetworkResponse> neutronCreateNetworkAsyncInvoker(
        NeutronCreateNetworkRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.neutronCreateNetwork, hcClient);
    }

    /**
     * 创建端口
     *
     * 创建端口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request NeutronCreatePortRequest 请求对象
     * @return CompletableFuture<NeutronCreatePortResponse>
     */
    public CompletableFuture<NeutronCreatePortResponse> neutronCreatePortAsync(NeutronCreatePortRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.neutronCreatePort);
    }

    /**
     * 创建端口
     *
     * 创建端口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request NeutronCreatePortRequest 请求对象
     * @return AsyncInvoker<NeutronCreatePortRequest, NeutronCreatePortResponse>
     */
    public AsyncInvoker<NeutronCreatePortRequest, NeutronCreatePortResponse> neutronCreatePortAsyncInvoker(
        NeutronCreatePortRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.neutronCreatePort, hcClient);
    }

    /**
     * 创建路由器
     *
     * 创建路由器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request NeutronCreateRouterRequest 请求对象
     * @return CompletableFuture<NeutronCreateRouterResponse>
     */
    public CompletableFuture<NeutronCreateRouterResponse> neutronCreateRouterAsync(NeutronCreateRouterRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.neutronCreateRouter);
    }

    /**
     * 创建路由器
     *
     * 创建路由器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request NeutronCreateRouterRequest 请求对象
     * @return AsyncInvoker<NeutronCreateRouterRequest, NeutronCreateRouterResponse>
     */
    public AsyncInvoker<NeutronCreateRouterRequest, NeutronCreateRouterResponse> neutronCreateRouterAsyncInvoker(
        NeutronCreateRouterRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.neutronCreateRouter, hcClient);
    }

    /**
     * 创建安全组
     *
     * 创建安全组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request NeutronCreateSecurityGroupRequest 请求对象
     * @return CompletableFuture<NeutronCreateSecurityGroupResponse>
     */
    public CompletableFuture<NeutronCreateSecurityGroupResponse> neutronCreateSecurityGroupAsync(
        NeutronCreateSecurityGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.neutronCreateSecurityGroup);
    }

    /**
     * 创建安全组
     *
     * 创建安全组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request NeutronCreateSecurityGroupRequest 请求对象
     * @return AsyncInvoker<NeutronCreateSecurityGroupRequest, NeutronCreateSecurityGroupResponse>
     */
    public AsyncInvoker<NeutronCreateSecurityGroupRequest, NeutronCreateSecurityGroupResponse> neutronCreateSecurityGroupAsyncInvoker(
        NeutronCreateSecurityGroupRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.neutronCreateSecurityGroup, hcClient);
    }

    /**
     * 创建安全组规则
     *
     * 创建安全组规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request NeutronCreateSecurityGroupRuleRequest 请求对象
     * @return CompletableFuture<NeutronCreateSecurityGroupRuleResponse>
     */
    public CompletableFuture<NeutronCreateSecurityGroupRuleResponse> neutronCreateSecurityGroupRuleAsync(
        NeutronCreateSecurityGroupRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.neutronCreateSecurityGroupRule);
    }

    /**
     * 创建安全组规则
     *
     * 创建安全组规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request NeutronCreateSecurityGroupRuleRequest 请求对象
     * @return AsyncInvoker<NeutronCreateSecurityGroupRuleRequest, NeutronCreateSecurityGroupRuleResponse>
     */
    public AsyncInvoker<NeutronCreateSecurityGroupRuleRequest, NeutronCreateSecurityGroupRuleResponse> neutronCreateSecurityGroupRuleAsyncInvoker(
        NeutronCreateSecurityGroupRuleRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.neutronCreateSecurityGroupRule, hcClient);
    }

    /**
     * 创建子网
     *
     * 创建子网。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request NeutronCreateSubnetRequest 请求对象
     * @return CompletableFuture<NeutronCreateSubnetResponse>
     */
    public CompletableFuture<NeutronCreateSubnetResponse> neutronCreateSubnetAsync(NeutronCreateSubnetRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.neutronCreateSubnet);
    }

    /**
     * 创建子网
     *
     * 创建子网。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request NeutronCreateSubnetRequest 请求对象
     * @return AsyncInvoker<NeutronCreateSubnetRequest, NeutronCreateSubnetResponse>
     */
    public AsyncInvoker<NeutronCreateSubnetRequest, NeutronCreateSubnetResponse> neutronCreateSubnetAsyncInvoker(
        NeutronCreateSubnetRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.neutronCreateSubnet, hcClient);
    }

    /**
     * 删除网络
     *
     * 删除网络
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request NeutronDeleteNetworkRequest 请求对象
     * @return CompletableFuture<NeutronDeleteNetworkResponse>
     */
    public CompletableFuture<NeutronDeleteNetworkResponse> neutronDeleteNetworkAsync(
        NeutronDeleteNetworkRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.neutronDeleteNetwork);
    }

    /**
     * 删除网络
     *
     * 删除网络
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request NeutronDeleteNetworkRequest 请求对象
     * @return AsyncInvoker<NeutronDeleteNetworkRequest, NeutronDeleteNetworkResponse>
     */
    public AsyncInvoker<NeutronDeleteNetworkRequest, NeutronDeleteNetworkResponse> neutronDeleteNetworkAsyncInvoker(
        NeutronDeleteNetworkRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.neutronDeleteNetwork, hcClient);
    }

    /**
     * 删除端口
     *
     * 删除端口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request NeutronDeletePortRequest 请求对象
     * @return CompletableFuture<NeutronDeletePortResponse>
     */
    public CompletableFuture<NeutronDeletePortResponse> neutronDeletePortAsync(NeutronDeletePortRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.neutronDeletePort);
    }

    /**
     * 删除端口
     *
     * 删除端口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request NeutronDeletePortRequest 请求对象
     * @return AsyncInvoker<NeutronDeletePortRequest, NeutronDeletePortResponse>
     */
    public AsyncInvoker<NeutronDeletePortRequest, NeutronDeletePortResponse> neutronDeletePortAsyncInvoker(
        NeutronDeletePortRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.neutronDeletePort, hcClient);
    }

    /**
     * 删除路由器
     *
     * 删除路由器
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request NeutronDeleteRouterRequest 请求对象
     * @return CompletableFuture<NeutronDeleteRouterResponse>
     */
    public CompletableFuture<NeutronDeleteRouterResponse> neutronDeleteRouterAsync(NeutronDeleteRouterRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.neutronDeleteRouter);
    }

    /**
     * 删除路由器
     *
     * 删除路由器
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request NeutronDeleteRouterRequest 请求对象
     * @return AsyncInvoker<NeutronDeleteRouterRequest, NeutronDeleteRouterResponse>
     */
    public AsyncInvoker<NeutronDeleteRouterRequest, NeutronDeleteRouterResponse> neutronDeleteRouterAsyncInvoker(
        NeutronDeleteRouterRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.neutronDeleteRouter, hcClient);
    }

    /**
     * 删除安全组
     *
     * 删除安全组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request NeutronDeleteSecurityGroupRequest 请求对象
     * @return CompletableFuture<NeutronDeleteSecurityGroupResponse>
     */
    public CompletableFuture<NeutronDeleteSecurityGroupResponse> neutronDeleteSecurityGroupAsync(
        NeutronDeleteSecurityGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.neutronDeleteSecurityGroup);
    }

    /**
     * 删除安全组
     *
     * 删除安全组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request NeutronDeleteSecurityGroupRequest 请求对象
     * @return AsyncInvoker<NeutronDeleteSecurityGroupRequest, NeutronDeleteSecurityGroupResponse>
     */
    public AsyncInvoker<NeutronDeleteSecurityGroupRequest, NeutronDeleteSecurityGroupResponse> neutronDeleteSecurityGroupAsyncInvoker(
        NeutronDeleteSecurityGroupRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.neutronDeleteSecurityGroup, hcClient);
    }

    /**
     * 删除安全组规则
     *
     * 删除安全组规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request NeutronDeleteSecurityGroupRuleRequest 请求对象
     * @return CompletableFuture<NeutronDeleteSecurityGroupRuleResponse>
     */
    public CompletableFuture<NeutronDeleteSecurityGroupRuleResponse> neutronDeleteSecurityGroupRuleAsync(
        NeutronDeleteSecurityGroupRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.neutronDeleteSecurityGroupRule);
    }

    /**
     * 删除安全组规则
     *
     * 删除安全组规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request NeutronDeleteSecurityGroupRuleRequest 请求对象
     * @return AsyncInvoker<NeutronDeleteSecurityGroupRuleRequest, NeutronDeleteSecurityGroupRuleResponse>
     */
    public AsyncInvoker<NeutronDeleteSecurityGroupRuleRequest, NeutronDeleteSecurityGroupRuleResponse> neutronDeleteSecurityGroupRuleAsyncInvoker(
        NeutronDeleteSecurityGroupRuleRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.neutronDeleteSecurityGroupRule, hcClient);
    }

    /**
     * 删除子网
     *
     * 删除子网
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request NeutronDeleteSubnetRequest 请求对象
     * @return CompletableFuture<NeutronDeleteSubnetResponse>
     */
    public CompletableFuture<NeutronDeleteSubnetResponse> neutronDeleteSubnetAsync(NeutronDeleteSubnetRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.neutronDeleteSubnet);
    }

    /**
     * 删除子网
     *
     * 删除子网
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request NeutronDeleteSubnetRequest 请求对象
     * @return AsyncInvoker<NeutronDeleteSubnetRequest, NeutronDeleteSubnetResponse>
     */
    public AsyncInvoker<NeutronDeleteSubnetRequest, NeutronDeleteSubnetResponse> neutronDeleteSubnetAsyncInvoker(
        NeutronDeleteSubnetRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.neutronDeleteSubnet, hcClient);
    }

    /**
     * 查询网络列表
     *
     * 查询提交请求的租户的所有网络，单次查询最多返回2000条数据，超过2000后会返回分页标记。分页查询请参考分页查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request NeutronListNetworksRequest 请求对象
     * @return CompletableFuture<NeutronListNetworksResponse>
     */
    public CompletableFuture<NeutronListNetworksResponse> neutronListNetworksAsync(NeutronListNetworksRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.neutronListNetworks);
    }

    /**
     * 查询网络列表
     *
     * 查询提交请求的租户的所有网络，单次查询最多返回2000条数据，超过2000后会返回分页标记。分页查询请参考分页查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request NeutronListNetworksRequest 请求对象
     * @return AsyncInvoker<NeutronListNetworksRequest, NeutronListNetworksResponse>
     */
    public AsyncInvoker<NeutronListNetworksRequest, NeutronListNetworksResponse> neutronListNetworksAsyncInvoker(
        NeutronListNetworksRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.neutronListNetworks, hcClient);
    }

    /**
     * 查询端口列表
     *
     * 查询提交请求的租户的所有端口，单次查询最多返回2000条数据，超过2000后会返回分页标记。分页查询请参考分页查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request NeutronListPortsRequest 请求对象
     * @return CompletableFuture<NeutronListPortsResponse>
     */
    public CompletableFuture<NeutronListPortsResponse> neutronListPortsAsync(NeutronListPortsRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.neutronListPorts);
    }

    /**
     * 查询端口列表
     *
     * 查询提交请求的租户的所有端口，单次查询最多返回2000条数据，超过2000后会返回分页标记。分页查询请参考分页查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request NeutronListPortsRequest 请求对象
     * @return AsyncInvoker<NeutronListPortsRequest, NeutronListPortsResponse>
     */
    public AsyncInvoker<NeutronListPortsRequest, NeutronListPortsResponse> neutronListPortsAsyncInvoker(
        NeutronListPortsRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.neutronListPorts, hcClient);
    }

    /**
     * 查询路由器列表
     *
     * 查询提交请求的租户有权限操作的所有路由器信息，单次查询最多返回2000条数据，超过2000后会返回分页标记。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request NeutronListRoutersRequest 请求对象
     * @return CompletableFuture<NeutronListRoutersResponse>
     */
    public CompletableFuture<NeutronListRoutersResponse> neutronListRoutersAsync(NeutronListRoutersRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.neutronListRouters);
    }

    /**
     * 查询路由器列表
     *
     * 查询提交请求的租户有权限操作的所有路由器信息，单次查询最多返回2000条数据，超过2000后会返回分页标记。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request NeutronListRoutersRequest 请求对象
     * @return AsyncInvoker<NeutronListRoutersRequest, NeutronListRoutersResponse>
     */
    public AsyncInvoker<NeutronListRoutersRequest, NeutronListRoutersResponse> neutronListRoutersAsyncInvoker(
        NeutronListRoutersRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.neutronListRouters, hcClient);
    }

    /**
     * 查询安全组规则列表
     *
     * 查询提交请求的租户有权限查看的所有安全组规则。单次查询最多返回2000条数据，超过2000后会返回分页标记。分页查询请参考分页查询
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request NeutronListSecurityGroupRulesRequest 请求对象
     * @return CompletableFuture<NeutronListSecurityGroupRulesResponse>
     */
    public CompletableFuture<NeutronListSecurityGroupRulesResponse> neutronListSecurityGroupRulesAsync(
        NeutronListSecurityGroupRulesRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.neutronListSecurityGroupRules);
    }

    /**
     * 查询安全组规则列表
     *
     * 查询提交请求的租户有权限查看的所有安全组规则。单次查询最多返回2000条数据，超过2000后会返回分页标记。分页查询请参考分页查询
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request NeutronListSecurityGroupRulesRequest 请求对象
     * @return AsyncInvoker<NeutronListSecurityGroupRulesRequest, NeutronListSecurityGroupRulesResponse>
     */
    public AsyncInvoker<NeutronListSecurityGroupRulesRequest, NeutronListSecurityGroupRulesResponse> neutronListSecurityGroupRulesAsyncInvoker(
        NeutronListSecurityGroupRulesRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.neutronListSecurityGroupRules, hcClient);
    }

    /**
     * 查询安全组列表
     *
     * 查询提交请求租户的所有安全组，单次查询最多返回2000条数据，超过2000后会返回分页标记。分页查询请参考分页查询 。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request NeutronListSecurityGroupsRequest 请求对象
     * @return CompletableFuture<NeutronListSecurityGroupsResponse>
     */
    public CompletableFuture<NeutronListSecurityGroupsResponse> neutronListSecurityGroupsAsync(
        NeutronListSecurityGroupsRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.neutronListSecurityGroups);
    }

    /**
     * 查询安全组列表
     *
     * 查询提交请求租户的所有安全组，单次查询最多返回2000条数据，超过2000后会返回分页标记。分页查询请参考分页查询 。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request NeutronListSecurityGroupsRequest 请求对象
     * @return AsyncInvoker<NeutronListSecurityGroupsRequest, NeutronListSecurityGroupsResponse>
     */
    public AsyncInvoker<NeutronListSecurityGroupsRequest, NeutronListSecurityGroupsResponse> neutronListSecurityGroupsAsyncInvoker(
        NeutronListSecurityGroupsRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.neutronListSecurityGroups, hcClient);
    }

    /**
     * 查询子网列表
     *
     * 查询提交请求租户的所有子网，单次查询最多返回2000条数据，超过2000后会返回分页标记。分页查询请参考分页查询 。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request NeutronListSubnetsRequest 请求对象
     * @return CompletableFuture<NeutronListSubnetsResponse>
     */
    public CompletableFuture<NeutronListSubnetsResponse> neutronListSubnetsAsync(NeutronListSubnetsRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.neutronListSubnets);
    }

    /**
     * 查询子网列表
     *
     * 查询提交请求租户的所有子网，单次查询最多返回2000条数据，超过2000后会返回分页标记。分页查询请参考分页查询 。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request NeutronListSubnetsRequest 请求对象
     * @return AsyncInvoker<NeutronListSubnetsRequest, NeutronListSubnetsResponse>
     */
    public AsyncInvoker<NeutronListSubnetsRequest, NeutronListSubnetsResponse> neutronListSubnetsAsyncInvoker(
        NeutronListSubnetsRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.neutronListSubnets, hcClient);
    }

    /**
     * 路由器删除接口
     *
     * 删除路由器接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request NeutronRemoveRouterInterfaceRequest 请求对象
     * @return CompletableFuture<NeutronRemoveRouterInterfaceResponse>
     */
    public CompletableFuture<NeutronRemoveRouterInterfaceResponse> neutronRemoveRouterInterfaceAsync(
        NeutronRemoveRouterInterfaceRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.neutronRemoveRouterInterface);
    }

    /**
     * 路由器删除接口
     *
     * 删除路由器接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request NeutronRemoveRouterInterfaceRequest 请求对象
     * @return AsyncInvoker<NeutronRemoveRouterInterfaceRequest, NeutronRemoveRouterInterfaceResponse>
     */
    public AsyncInvoker<NeutronRemoveRouterInterfaceRequest, NeutronRemoveRouterInterfaceResponse> neutronRemoveRouterInterfaceAsyncInvoker(
        NeutronRemoveRouterInterfaceRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.neutronRemoveRouterInterface, hcClient);
    }

    /**
     * 查询网络
     *
     * 查询指定的网络详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request NeutronShowNetworkRequest 请求对象
     * @return CompletableFuture<NeutronShowNetworkResponse>
     */
    public CompletableFuture<NeutronShowNetworkResponse> neutronShowNetworkAsync(NeutronShowNetworkRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.neutronShowNetwork);
    }

    /**
     * 查询网络
     *
     * 查询指定的网络详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request NeutronShowNetworkRequest 请求对象
     * @return AsyncInvoker<NeutronShowNetworkRequest, NeutronShowNetworkResponse>
     */
    public AsyncInvoker<NeutronShowNetworkRequest, NeutronShowNetworkResponse> neutronShowNetworkAsyncInvoker(
        NeutronShowNetworkRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.neutronShowNetwork, hcClient);
    }

    /**
     * 查询端口
     *
     * 查询端口详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request NeutronShowPortRequest 请求对象
     * @return CompletableFuture<NeutronShowPortResponse>
     */
    public CompletableFuture<NeutronShowPortResponse> neutronShowPortAsync(NeutronShowPortRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.neutronShowPort);
    }

    /**
     * 查询端口
     *
     * 查询端口详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request NeutronShowPortRequest 请求对象
     * @return AsyncInvoker<NeutronShowPortRequest, NeutronShowPortResponse>
     */
    public AsyncInvoker<NeutronShowPortRequest, NeutronShowPortResponse> neutronShowPortAsyncInvoker(
        NeutronShowPortRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.neutronShowPort, hcClient);
    }

    /**
     * 查询路由器
     *
     * 查询路由器详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request NeutronShowRouterRequest 请求对象
     * @return CompletableFuture<NeutronShowRouterResponse>
     */
    public CompletableFuture<NeutronShowRouterResponse> neutronShowRouterAsync(NeutronShowRouterRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.neutronShowRouter);
    }

    /**
     * 查询路由器
     *
     * 查询路由器详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request NeutronShowRouterRequest 请求对象
     * @return AsyncInvoker<NeutronShowRouterRequest, NeutronShowRouterResponse>
     */
    public AsyncInvoker<NeutronShowRouterRequest, NeutronShowRouterResponse> neutronShowRouterAsyncInvoker(
        NeutronShowRouterRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.neutronShowRouter, hcClient);
    }

    /**
     * 查询安全组
     *
     * 查询安全组详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request NeutronShowSecurityGroupRequest 请求对象
     * @return CompletableFuture<NeutronShowSecurityGroupResponse>
     */
    public CompletableFuture<NeutronShowSecurityGroupResponse> neutronShowSecurityGroupAsync(
        NeutronShowSecurityGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.neutronShowSecurityGroup);
    }

    /**
     * 查询安全组
     *
     * 查询安全组详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request NeutronShowSecurityGroupRequest 请求对象
     * @return AsyncInvoker<NeutronShowSecurityGroupRequest, NeutronShowSecurityGroupResponse>
     */
    public AsyncInvoker<NeutronShowSecurityGroupRequest, NeutronShowSecurityGroupResponse> neutronShowSecurityGroupAsyncInvoker(
        NeutronShowSecurityGroupRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.neutronShowSecurityGroup, hcClient);
    }

    /**
     * 查询安全组规则
     *
     * 查询安全组规则详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request NeutronShowSecurityGroupRuleRequest 请求对象
     * @return CompletableFuture<NeutronShowSecurityGroupRuleResponse>
     */
    public CompletableFuture<NeutronShowSecurityGroupRuleResponse> neutronShowSecurityGroupRuleAsync(
        NeutronShowSecurityGroupRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.neutronShowSecurityGroupRule);
    }

    /**
     * 查询安全组规则
     *
     * 查询安全组规则详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request NeutronShowSecurityGroupRuleRequest 请求对象
     * @return AsyncInvoker<NeutronShowSecurityGroupRuleRequest, NeutronShowSecurityGroupRuleResponse>
     */
    public AsyncInvoker<NeutronShowSecurityGroupRuleRequest, NeutronShowSecurityGroupRuleResponse> neutronShowSecurityGroupRuleAsyncInvoker(
        NeutronShowSecurityGroupRuleRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.neutronShowSecurityGroupRule, hcClient);
    }

    /**
     * 查询子网
     *
     * 查询子网详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request NeutronShowSubnetRequest 请求对象
     * @return CompletableFuture<NeutronShowSubnetResponse>
     */
    public CompletableFuture<NeutronShowSubnetResponse> neutronShowSubnetAsync(NeutronShowSubnetRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.neutronShowSubnet);
    }

    /**
     * 查询子网
     *
     * 查询子网详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request NeutronShowSubnetRequest 请求对象
     * @return AsyncInvoker<NeutronShowSubnetRequest, NeutronShowSubnetResponse>
     */
    public AsyncInvoker<NeutronShowSubnetRequest, NeutronShowSubnetResponse> neutronShowSubnetAsyncInvoker(
        NeutronShowSubnetRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.neutronShowSubnet, hcClient);
    }

    /**
     * 更新网络
     *
     * 更新网络
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request NeutronUpdateNetworkRequest 请求对象
     * @return CompletableFuture<NeutronUpdateNetworkResponse>
     */
    public CompletableFuture<NeutronUpdateNetworkResponse> neutronUpdateNetworkAsync(
        NeutronUpdateNetworkRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.neutronUpdateNetwork);
    }

    /**
     * 更新网络
     *
     * 更新网络
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request NeutronUpdateNetworkRequest 请求对象
     * @return AsyncInvoker<NeutronUpdateNetworkRequest, NeutronUpdateNetworkResponse>
     */
    public AsyncInvoker<NeutronUpdateNetworkRequest, NeutronUpdateNetworkResponse> neutronUpdateNetworkAsyncInvoker(
        NeutronUpdateNetworkRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.neutronUpdateNetwork, hcClient);
    }

    /**
     * 更新端口
     *
     * 更新端口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request NeutronUpdatePortRequest 请求对象
     * @return CompletableFuture<NeutronUpdatePortResponse>
     */
    public CompletableFuture<NeutronUpdatePortResponse> neutronUpdatePortAsync(NeutronUpdatePortRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.neutronUpdatePort);
    }

    /**
     * 更新端口
     *
     * 更新端口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request NeutronUpdatePortRequest 请求对象
     * @return AsyncInvoker<NeutronUpdatePortRequest, NeutronUpdatePortResponse>
     */
    public AsyncInvoker<NeutronUpdatePortRequest, NeutronUpdatePortResponse> neutronUpdatePortAsyncInvoker(
        NeutronUpdatePortRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.neutronUpdatePort, hcClient);
    }

    /**
     * 更新路由器
     *
     * 更新路由器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request NeutronUpdateRouterRequest 请求对象
     * @return CompletableFuture<NeutronUpdateRouterResponse>
     */
    public CompletableFuture<NeutronUpdateRouterResponse> neutronUpdateRouterAsync(NeutronUpdateRouterRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.neutronUpdateRouter);
    }

    /**
     * 更新路由器
     *
     * 更新路由器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request NeutronUpdateRouterRequest 请求对象
     * @return AsyncInvoker<NeutronUpdateRouterRequest, NeutronUpdateRouterResponse>
     */
    public AsyncInvoker<NeutronUpdateRouterRequest, NeutronUpdateRouterResponse> neutronUpdateRouterAsyncInvoker(
        NeutronUpdateRouterRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.neutronUpdateRouter, hcClient);
    }

    /**
     * 更新安全组
     *
     * 更新安全组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request NeutronUpdateSecurityGroupRequest 请求对象
     * @return CompletableFuture<NeutronUpdateSecurityGroupResponse>
     */
    public CompletableFuture<NeutronUpdateSecurityGroupResponse> neutronUpdateSecurityGroupAsync(
        NeutronUpdateSecurityGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.neutronUpdateSecurityGroup);
    }

    /**
     * 更新安全组
     *
     * 更新安全组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request NeutronUpdateSecurityGroupRequest 请求对象
     * @return AsyncInvoker<NeutronUpdateSecurityGroupRequest, NeutronUpdateSecurityGroupResponse>
     */
    public AsyncInvoker<NeutronUpdateSecurityGroupRequest, NeutronUpdateSecurityGroupResponse> neutronUpdateSecurityGroupAsyncInvoker(
        NeutronUpdateSecurityGroupRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.neutronUpdateSecurityGroup, hcClient);
    }

    /**
     * 更新子网
     *
     * 更新子网
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request NeutronUpdateSubnetRequest 请求对象
     * @return CompletableFuture<NeutronUpdateSubnetResponse>
     */
    public CompletableFuture<NeutronUpdateSubnetResponse> neutronUpdateSubnetAsync(NeutronUpdateSubnetRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.neutronUpdateSubnet);
    }

    /**
     * 更新子网
     *
     * 更新子网
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request NeutronUpdateSubnetRequest 请求对象
     * @return AsyncInvoker<NeutronUpdateSubnetRequest, NeutronUpdateSubnetResponse>
     */
    public AsyncInvoker<NeutronUpdateSubnetRequest, NeutronUpdateSubnetResponse> neutronUpdateSubnetAsyncInvoker(
        NeutronUpdateSubnetRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.neutronUpdateSubnet, hcClient);
    }

    /**
     * 插入网络ACL规则
     *
     * 插入一条网络ACL规则到某一网络ACL策略中。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request NeutronAddFirewallRuleRequest 请求对象
     * @return CompletableFuture<NeutronAddFirewallRuleResponse>
     */
    public CompletableFuture<NeutronAddFirewallRuleResponse> neutronAddFirewallRuleAsync(
        NeutronAddFirewallRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.neutronAddFirewallRule);
    }

    /**
     * 插入网络ACL规则
     *
     * 插入一条网络ACL规则到某一网络ACL策略中。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request NeutronAddFirewallRuleRequest 请求对象
     * @return AsyncInvoker<NeutronAddFirewallRuleRequest, NeutronAddFirewallRuleResponse>
     */
    public AsyncInvoker<NeutronAddFirewallRuleRequest, NeutronAddFirewallRuleResponse> neutronAddFirewallRuleAsyncInvoker(
        NeutronAddFirewallRuleRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.neutronAddFirewallRule, hcClient);
    }

    /**
     * 创建网络ACL组
     *
     * 创建网络ACL组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request NeutronCreateFirewallGroupRequest 请求对象
     * @return CompletableFuture<NeutronCreateFirewallGroupResponse>
     */
    public CompletableFuture<NeutronCreateFirewallGroupResponse> neutronCreateFirewallGroupAsync(
        NeutronCreateFirewallGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.neutronCreateFirewallGroup);
    }

    /**
     * 创建网络ACL组
     *
     * 创建网络ACL组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request NeutronCreateFirewallGroupRequest 请求对象
     * @return AsyncInvoker<NeutronCreateFirewallGroupRequest, NeutronCreateFirewallGroupResponse>
     */
    public AsyncInvoker<NeutronCreateFirewallGroupRequest, NeutronCreateFirewallGroupResponse> neutronCreateFirewallGroupAsyncInvoker(
        NeutronCreateFirewallGroupRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.neutronCreateFirewallGroup, hcClient);
    }

    /**
     * 创建网络ACL策略
     *
     * 创建网络ACL策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request NeutronCreateFirewallPolicyRequest 请求对象
     * @return CompletableFuture<NeutronCreateFirewallPolicyResponse>
     */
    public CompletableFuture<NeutronCreateFirewallPolicyResponse> neutronCreateFirewallPolicyAsync(
        NeutronCreateFirewallPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.neutronCreateFirewallPolicy);
    }

    /**
     * 创建网络ACL策略
     *
     * 创建网络ACL策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request NeutronCreateFirewallPolicyRequest 请求对象
     * @return AsyncInvoker<NeutronCreateFirewallPolicyRequest, NeutronCreateFirewallPolicyResponse>
     */
    public AsyncInvoker<NeutronCreateFirewallPolicyRequest, NeutronCreateFirewallPolicyResponse> neutronCreateFirewallPolicyAsyncInvoker(
        NeutronCreateFirewallPolicyRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.neutronCreateFirewallPolicy, hcClient);
    }

    /**
     * 创建网络ACL规则
     *
     * 创建网络ACL规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request NeutronCreateFirewallRuleRequest 请求对象
     * @return CompletableFuture<NeutronCreateFirewallRuleResponse>
     */
    public CompletableFuture<NeutronCreateFirewallRuleResponse> neutronCreateFirewallRuleAsync(
        NeutronCreateFirewallRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.neutronCreateFirewallRule);
    }

    /**
     * 创建网络ACL规则
     *
     * 创建网络ACL规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request NeutronCreateFirewallRuleRequest 请求对象
     * @return AsyncInvoker<NeutronCreateFirewallRuleRequest, NeutronCreateFirewallRuleResponse>
     */
    public AsyncInvoker<NeutronCreateFirewallRuleRequest, NeutronCreateFirewallRuleResponse> neutronCreateFirewallRuleAsyncInvoker(
        NeutronCreateFirewallRuleRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.neutronCreateFirewallRule, hcClient);
    }

    /**
     * 删除网络ACL组
     *
     * 删除网络ACL组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request NeutronDeleteFirewallGroupRequest 请求对象
     * @return CompletableFuture<NeutronDeleteFirewallGroupResponse>
     */
    public CompletableFuture<NeutronDeleteFirewallGroupResponse> neutronDeleteFirewallGroupAsync(
        NeutronDeleteFirewallGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.neutronDeleteFirewallGroup);
    }

    /**
     * 删除网络ACL组
     *
     * 删除网络ACL组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request NeutronDeleteFirewallGroupRequest 请求对象
     * @return AsyncInvoker<NeutronDeleteFirewallGroupRequest, NeutronDeleteFirewallGroupResponse>
     */
    public AsyncInvoker<NeutronDeleteFirewallGroupRequest, NeutronDeleteFirewallGroupResponse> neutronDeleteFirewallGroupAsyncInvoker(
        NeutronDeleteFirewallGroupRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.neutronDeleteFirewallGroup, hcClient);
    }

    /**
     * 删除网络ACL策略
     *
     * 删除网络ACL策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request NeutronDeleteFirewallPolicyRequest 请求对象
     * @return CompletableFuture<NeutronDeleteFirewallPolicyResponse>
     */
    public CompletableFuture<NeutronDeleteFirewallPolicyResponse> neutronDeleteFirewallPolicyAsync(
        NeutronDeleteFirewallPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.neutronDeleteFirewallPolicy);
    }

    /**
     * 删除网络ACL策略
     *
     * 删除网络ACL策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request NeutronDeleteFirewallPolicyRequest 请求对象
     * @return AsyncInvoker<NeutronDeleteFirewallPolicyRequest, NeutronDeleteFirewallPolicyResponse>
     */
    public AsyncInvoker<NeutronDeleteFirewallPolicyRequest, NeutronDeleteFirewallPolicyResponse> neutronDeleteFirewallPolicyAsyncInvoker(
        NeutronDeleteFirewallPolicyRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.neutronDeleteFirewallPolicy, hcClient);
    }

    /**
     * 删除网络ACL规则
     *
     * 删除网络ACL规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request NeutronDeleteFirewallRuleRequest 请求对象
     * @return CompletableFuture<NeutronDeleteFirewallRuleResponse>
     */
    public CompletableFuture<NeutronDeleteFirewallRuleResponse> neutronDeleteFirewallRuleAsync(
        NeutronDeleteFirewallRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.neutronDeleteFirewallRule);
    }

    /**
     * 删除网络ACL规则
     *
     * 删除网络ACL规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request NeutronDeleteFirewallRuleRequest 请求对象
     * @return AsyncInvoker<NeutronDeleteFirewallRuleRequest, NeutronDeleteFirewallRuleResponse>
     */
    public AsyncInvoker<NeutronDeleteFirewallRuleRequest, NeutronDeleteFirewallRuleResponse> neutronDeleteFirewallRuleAsyncInvoker(
        NeutronDeleteFirewallRuleRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.neutronDeleteFirewallRule, hcClient);
    }

    /**
     * 查询所有网络ACL组
     *
     * 查询提交请求的租户有权限操作的所有网络ACL组信息。单次查询最多返回2000条数据，超过2000后会返回分页标记。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request NeutronListFirewallGroupsRequest 请求对象
     * @return CompletableFuture<NeutronListFirewallGroupsResponse>
     */
    public CompletableFuture<NeutronListFirewallGroupsResponse> neutronListFirewallGroupsAsync(
        NeutronListFirewallGroupsRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.neutronListFirewallGroups);
    }

    /**
     * 查询所有网络ACL组
     *
     * 查询提交请求的租户有权限操作的所有网络ACL组信息。单次查询最多返回2000条数据，超过2000后会返回分页标记。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request NeutronListFirewallGroupsRequest 请求对象
     * @return AsyncInvoker<NeutronListFirewallGroupsRequest, NeutronListFirewallGroupsResponse>
     */
    public AsyncInvoker<NeutronListFirewallGroupsRequest, NeutronListFirewallGroupsResponse> neutronListFirewallGroupsAsyncInvoker(
        NeutronListFirewallGroupsRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.neutronListFirewallGroups, hcClient);
    }

    /**
     * 查询所有网络ACL策略
     *
     * 查询提交请求的租户有权限操作的所有网络ACL策略信息。单次查询最多返回2000条数据，超过2000后会返回分页标记。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request NeutronListFirewallPoliciesRequest 请求对象
     * @return CompletableFuture<NeutronListFirewallPoliciesResponse>
     */
    public CompletableFuture<NeutronListFirewallPoliciesResponse> neutronListFirewallPoliciesAsync(
        NeutronListFirewallPoliciesRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.neutronListFirewallPolicies);
    }

    /**
     * 查询所有网络ACL策略
     *
     * 查询提交请求的租户有权限操作的所有网络ACL策略信息。单次查询最多返回2000条数据，超过2000后会返回分页标记。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request NeutronListFirewallPoliciesRequest 请求对象
     * @return AsyncInvoker<NeutronListFirewallPoliciesRequest, NeutronListFirewallPoliciesResponse>
     */
    public AsyncInvoker<NeutronListFirewallPoliciesRequest, NeutronListFirewallPoliciesResponse> neutronListFirewallPoliciesAsyncInvoker(
        NeutronListFirewallPoliciesRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.neutronListFirewallPolicies, hcClient);
    }

    /**
     * 查询所有网络ACL规则
     *
     * 查询提交请求的租户有权限操作的所有网络ACL规则信息。单次查询最多返回2000条数据，超过2000后会返回分页标记。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request NeutronListFirewallRulesRequest 请求对象
     * @return CompletableFuture<NeutronListFirewallRulesResponse>
     */
    public CompletableFuture<NeutronListFirewallRulesResponse> neutronListFirewallRulesAsync(
        NeutronListFirewallRulesRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.neutronListFirewallRules);
    }

    /**
     * 查询所有网络ACL规则
     *
     * 查询提交请求的租户有权限操作的所有网络ACL规则信息。单次查询最多返回2000条数据，超过2000后会返回分页标记。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request NeutronListFirewallRulesRequest 请求对象
     * @return AsyncInvoker<NeutronListFirewallRulesRequest, NeutronListFirewallRulesResponse>
     */
    public AsyncInvoker<NeutronListFirewallRulesRequest, NeutronListFirewallRulesResponse> neutronListFirewallRulesAsyncInvoker(
        NeutronListFirewallRulesRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.neutronListFirewallRules, hcClient);
    }

    /**
     * 移除网络ACL规则
     *
     * 从某一网络ACL策略中移除一条网络ACL规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request NeutronRemoveFirewallRuleRequest 请求对象
     * @return CompletableFuture<NeutronRemoveFirewallRuleResponse>
     */
    public CompletableFuture<NeutronRemoveFirewallRuleResponse> neutronRemoveFirewallRuleAsync(
        NeutronRemoveFirewallRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.neutronRemoveFirewallRule);
    }

    /**
     * 移除网络ACL规则
     *
     * 从某一网络ACL策略中移除一条网络ACL规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request NeutronRemoveFirewallRuleRequest 请求对象
     * @return AsyncInvoker<NeutronRemoveFirewallRuleRequest, NeutronRemoveFirewallRuleResponse>
     */
    public AsyncInvoker<NeutronRemoveFirewallRuleRequest, NeutronRemoveFirewallRuleResponse> neutronRemoveFirewallRuleAsyncInvoker(
        NeutronRemoveFirewallRuleRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.neutronRemoveFirewallRule, hcClient);
    }

    /**
     * 查询特定网络ACL组详情
     *
     * 查询特定网络ACL组详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request NeutronShowFirewallGroupRequest 请求对象
     * @return CompletableFuture<NeutronShowFirewallGroupResponse>
     */
    public CompletableFuture<NeutronShowFirewallGroupResponse> neutronShowFirewallGroupAsync(
        NeutronShowFirewallGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.neutronShowFirewallGroup);
    }

    /**
     * 查询特定网络ACL组详情
     *
     * 查询特定网络ACL组详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request NeutronShowFirewallGroupRequest 请求对象
     * @return AsyncInvoker<NeutronShowFirewallGroupRequest, NeutronShowFirewallGroupResponse>
     */
    public AsyncInvoker<NeutronShowFirewallGroupRequest, NeutronShowFirewallGroupResponse> neutronShowFirewallGroupAsyncInvoker(
        NeutronShowFirewallGroupRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.neutronShowFirewallGroup, hcClient);
    }

    /**
     * 查询特定网络ACL策略详情
     *
     * 查询特定网络ACL策略详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request NeutronShowFirewallPolicyRequest 请求对象
     * @return CompletableFuture<NeutronShowFirewallPolicyResponse>
     */
    public CompletableFuture<NeutronShowFirewallPolicyResponse> neutronShowFirewallPolicyAsync(
        NeutronShowFirewallPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.neutronShowFirewallPolicy);
    }

    /**
     * 查询特定网络ACL策略详情
     *
     * 查询特定网络ACL策略详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request NeutronShowFirewallPolicyRequest 请求对象
     * @return AsyncInvoker<NeutronShowFirewallPolicyRequest, NeutronShowFirewallPolicyResponse>
     */
    public AsyncInvoker<NeutronShowFirewallPolicyRequest, NeutronShowFirewallPolicyResponse> neutronShowFirewallPolicyAsyncInvoker(
        NeutronShowFirewallPolicyRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.neutronShowFirewallPolicy, hcClient);
    }

    /**
     * 查询特定网络ACL规则
     *
     * 查询特定网络ACL规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request NeutronShowFirewallRuleRequest 请求对象
     * @return CompletableFuture<NeutronShowFirewallRuleResponse>
     */
    public CompletableFuture<NeutronShowFirewallRuleResponse> neutronShowFirewallRuleAsync(
        NeutronShowFirewallRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.neutronShowFirewallRule);
    }

    /**
     * 查询特定网络ACL规则
     *
     * 查询特定网络ACL规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request NeutronShowFirewallRuleRequest 请求对象
     * @return AsyncInvoker<NeutronShowFirewallRuleRequest, NeutronShowFirewallRuleResponse>
     */
    public AsyncInvoker<NeutronShowFirewallRuleRequest, NeutronShowFirewallRuleResponse> neutronShowFirewallRuleAsyncInvoker(
        NeutronShowFirewallRuleRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.neutronShowFirewallRule, hcClient);
    }

    /**
     * 更新网络ACL组
     *
     * 更新网络ACL组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request NeutronUpdateFirewallGroupRequest 请求对象
     * @return CompletableFuture<NeutronUpdateFirewallGroupResponse>
     */
    public CompletableFuture<NeutronUpdateFirewallGroupResponse> neutronUpdateFirewallGroupAsync(
        NeutronUpdateFirewallGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.neutronUpdateFirewallGroup);
    }

    /**
     * 更新网络ACL组
     *
     * 更新网络ACL组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request NeutronUpdateFirewallGroupRequest 请求对象
     * @return AsyncInvoker<NeutronUpdateFirewallGroupRequest, NeutronUpdateFirewallGroupResponse>
     */
    public AsyncInvoker<NeutronUpdateFirewallGroupRequest, NeutronUpdateFirewallGroupResponse> neutronUpdateFirewallGroupAsyncInvoker(
        NeutronUpdateFirewallGroupRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.neutronUpdateFirewallGroup, hcClient);
    }

    /**
     * 更新网络ACL策略
     *
     * 更新网络ACL策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request NeutronUpdateFirewallPolicyRequest 请求对象
     * @return CompletableFuture<NeutronUpdateFirewallPolicyResponse>
     */
    public CompletableFuture<NeutronUpdateFirewallPolicyResponse> neutronUpdateFirewallPolicyAsync(
        NeutronUpdateFirewallPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.neutronUpdateFirewallPolicy);
    }

    /**
     * 更新网络ACL策略
     *
     * 更新网络ACL策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request NeutronUpdateFirewallPolicyRequest 请求对象
     * @return AsyncInvoker<NeutronUpdateFirewallPolicyRequest, NeutronUpdateFirewallPolicyResponse>
     */
    public AsyncInvoker<NeutronUpdateFirewallPolicyRequest, NeutronUpdateFirewallPolicyResponse> neutronUpdateFirewallPolicyAsyncInvoker(
        NeutronUpdateFirewallPolicyRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.neutronUpdateFirewallPolicy, hcClient);
    }

    /**
     * 更新网络ACL规则
     *
     * 更新网络ACL规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request NeutronUpdateFirewallRuleRequest 请求对象
     * @return CompletableFuture<NeutronUpdateFirewallRuleResponse>
     */
    public CompletableFuture<NeutronUpdateFirewallRuleResponse> neutronUpdateFirewallRuleAsync(
        NeutronUpdateFirewallRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.neutronUpdateFirewallRule);
    }

    /**
     * 更新网络ACL规则
     *
     * 更新网络ACL规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request NeutronUpdateFirewallRuleRequest 请求对象
     * @return AsyncInvoker<NeutronUpdateFirewallRuleRequest, NeutronUpdateFirewallRuleResponse>
     */
    public AsyncInvoker<NeutronUpdateFirewallRuleRequest, NeutronUpdateFirewallRuleResponse> neutronUpdateFirewallRuleAsyncInvoker(
        NeutronUpdateFirewallRuleRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.neutronUpdateFirewallRule, hcClient);
    }

    /**
     * 查询API版本信息列表
     *
     * 返回当前API所有可用的版本（仅针对OpenStack原生接口）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApiVersionRequest 请求对象
     * @return CompletableFuture<ListApiVersionResponse>
     */
    public CompletableFuture<ListApiVersionResponse> listApiVersionAsync(ListApiVersionRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.listApiVersion);
    }

    /**
     * 查询API版本信息列表
     *
     * 返回当前API所有可用的版本（仅针对OpenStack原生接口）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApiVersionRequest 请求对象
     * @return AsyncInvoker<ListApiVersionRequest, ListApiVersionResponse>
     */
    public AsyncInvoker<ListApiVersionRequest, ListApiVersionResponse> listApiVersionAsyncInvoker(
        ListApiVersionRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.listApiVersion, hcClient);
    }

    /**
     * 批量创建VPC资源标签
     *
     * 为指定的VPC资源实例批量添加标签。
     * 此接口为幂等接口：创建时如果请求体中存在重复key则报错。创建时，不允许设置重复key数据，如果数据库已存在该key，就覆盖value的值。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateVpcTagsRequest 请求对象
     * @return CompletableFuture<BatchCreateVpcTagsResponse>
     */
    public CompletableFuture<BatchCreateVpcTagsResponse> batchCreateVpcTagsAsync(BatchCreateVpcTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.batchCreateVpcTags);
    }

    /**
     * 批量创建VPC资源标签
     *
     * 为指定的VPC资源实例批量添加标签。
     * 此接口为幂等接口：创建时如果请求体中存在重复key则报错。创建时，不允许设置重复key数据，如果数据库已存在该key，就覆盖value的值。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateVpcTagsRequest 请求对象
     * @return AsyncInvoker<BatchCreateVpcTagsRequest, BatchCreateVpcTagsResponse>
     */
    public AsyncInvoker<BatchCreateVpcTagsRequest, BatchCreateVpcTagsResponse> batchCreateVpcTagsAsyncInvoker(
        BatchCreateVpcTagsRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.batchCreateVpcTags, hcClient);
    }

    /**
     * 批量删除VPC资源标签
     *
     * 为指定的VPC资源实例批量删除标签。
     * 此接口为幂等接口：删除时，如果删除的标签不存在，默认处理成功；删除时不对标签字符集范围做校验。删除时tags结构体不能缺失，key不能为空，或者空字符串。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteVpcTagsRequest 请求对象
     * @return CompletableFuture<BatchDeleteVpcTagsResponse>
     */
    public CompletableFuture<BatchDeleteVpcTagsResponse> batchDeleteVpcTagsAsync(BatchDeleteVpcTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.batchDeleteVpcTags);
    }

    /**
     * 批量删除VPC资源标签
     *
     * 为指定的VPC资源实例批量删除标签。
     * 此接口为幂等接口：删除时，如果删除的标签不存在，默认处理成功；删除时不对标签字符集范围做校验。删除时tags结构体不能缺失，key不能为空，或者空字符串。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteVpcTagsRequest 请求对象
     * @return AsyncInvoker<BatchDeleteVpcTagsRequest, BatchDeleteVpcTagsResponse>
     */
    public AsyncInvoker<BatchDeleteVpcTagsRequest, BatchDeleteVpcTagsResponse> batchDeleteVpcTagsAsyncInvoker(
        BatchDeleteVpcTagsRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.batchDeleteVpcTags, hcClient);
    }

    /**
     * 创建VPC
     *
     * 创建虚拟私有云。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateVpcRequest 请求对象
     * @return CompletableFuture<CreateVpcResponse>
     */
    public CompletableFuture<CreateVpcResponse> createVpcAsync(CreateVpcRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.createVpc);
    }

    /**
     * 创建VPC
     *
     * 创建虚拟私有云。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateVpcRequest 请求对象
     * @return AsyncInvoker<CreateVpcRequest, CreateVpcResponse>
     */
    public AsyncInvoker<CreateVpcRequest, CreateVpcResponse> createVpcAsyncInvoker(CreateVpcRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.createVpc, hcClient);
    }

    /**
     * 创建VPC资源标签
     *
     * 给指定VPC资源实例增加标签信息
     * 此接口为幂等接口：创建时，如果创建的标签已经存在（key相同），则覆盖。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateVpcResourceTagRequest 请求对象
     * @return CompletableFuture<CreateVpcResourceTagResponse>
     */
    public CompletableFuture<CreateVpcResourceTagResponse> createVpcResourceTagAsync(
        CreateVpcResourceTagRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.createVpcResourceTag);
    }

    /**
     * 创建VPC资源标签
     *
     * 给指定VPC资源实例增加标签信息
     * 此接口为幂等接口：创建时，如果创建的标签已经存在（key相同），则覆盖。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateVpcResourceTagRequest 请求对象
     * @return AsyncInvoker<CreateVpcResourceTagRequest, CreateVpcResourceTagResponse>
     */
    public AsyncInvoker<CreateVpcResourceTagRequest, CreateVpcResourceTagResponse> createVpcResourceTagAsyncInvoker(
        CreateVpcResourceTagRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.createVpcResourceTag, hcClient);
    }

    /**
     * 创建VPC路由
     *
     * 创建路由
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateVpcRouteRequest 请求对象
     * @return CompletableFuture<CreateVpcRouteResponse>
     */
    public CompletableFuture<CreateVpcRouteResponse> createVpcRouteAsync(CreateVpcRouteRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.createVpcRoute);
    }

    /**
     * 创建VPC路由
     *
     * 创建路由
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateVpcRouteRequest 请求对象
     * @return AsyncInvoker<CreateVpcRouteRequest, CreateVpcRouteResponse>
     */
    public AsyncInvoker<CreateVpcRouteRequest, CreateVpcRouteResponse> createVpcRouteAsyncInvoker(
        CreateVpcRouteRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.createVpcRoute, hcClient);
    }

    /**
     * 删除VPC
     *
     * 删除虚拟私有云。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteVpcRequest 请求对象
     * @return CompletableFuture<DeleteVpcResponse>
     */
    public CompletableFuture<DeleteVpcResponse> deleteVpcAsync(DeleteVpcRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.deleteVpc);
    }

    /**
     * 删除VPC
     *
     * 删除虚拟私有云。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteVpcRequest 请求对象
     * @return AsyncInvoker<DeleteVpcRequest, DeleteVpcResponse>
     */
    public AsyncInvoker<DeleteVpcRequest, DeleteVpcResponse> deleteVpcAsyncInvoker(DeleteVpcRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.deleteVpc, hcClient);
    }

    /**
     * 删除VPC路由
     *
     * 删除路由
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteVpcRouteRequest 请求对象
     * @return CompletableFuture<DeleteVpcRouteResponse>
     */
    public CompletableFuture<DeleteVpcRouteResponse> deleteVpcRouteAsync(DeleteVpcRouteRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.deleteVpcRoute);
    }

    /**
     * 删除VPC路由
     *
     * 删除路由
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteVpcRouteRequest 请求对象
     * @return AsyncInvoker<DeleteVpcRouteRequest, DeleteVpcRouteResponse>
     */
    public AsyncInvoker<DeleteVpcRouteRequest, DeleteVpcRouteResponse> deleteVpcRouteAsyncInvoker(
        DeleteVpcRouteRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.deleteVpcRoute, hcClient);
    }

    /**
     * 删除VPC资源标签
     *
     * 删除指定VPC资源实例的标签信息
     * 该接口为幂等接口：删除的key不存在报404，Key不能为空或者空字符串
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteVpcTagRequest 请求对象
     * @return CompletableFuture<DeleteVpcTagResponse>
     */
    public CompletableFuture<DeleteVpcTagResponse> deleteVpcTagAsync(DeleteVpcTagRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.deleteVpcTag);
    }

    /**
     * 删除VPC资源标签
     *
     * 删除指定VPC资源实例的标签信息
     * 该接口为幂等接口：删除的key不存在报404，Key不能为空或者空字符串
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteVpcTagRequest 请求对象
     * @return AsyncInvoker<DeleteVpcTagRequest, DeleteVpcTagResponse>
     */
    public AsyncInvoker<DeleteVpcTagRequest, DeleteVpcTagResponse> deleteVpcTagAsyncInvoker(
        DeleteVpcTagRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.deleteVpcTag, hcClient);
    }

    /**
     * 查询VPC路由列表
     *
     * 查询提交请求的租户的所有路由列表，并根据过滤条件进行过滤。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVpcRoutesRequest 请求对象
     * @return CompletableFuture<ListVpcRoutesResponse>
     */
    public CompletableFuture<ListVpcRoutesResponse> listVpcRoutesAsync(ListVpcRoutesRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.listVpcRoutes);
    }

    /**
     * 查询VPC路由列表
     *
     * 查询提交请求的租户的所有路由列表，并根据过滤条件进行过滤。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVpcRoutesRequest 请求对象
     * @return AsyncInvoker<ListVpcRoutesRequest, ListVpcRoutesResponse>
     */
    public AsyncInvoker<ListVpcRoutesRequest, ListVpcRoutesResponse> listVpcRoutesAsyncInvoker(
        ListVpcRoutesRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.listVpcRoutes, hcClient);
    }

    /**
     * 查询VPC项目标签
     *
     * 查询租户在指定区域和实例类型的所有标签集合
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVpcTagsRequest 请求对象
     * @return CompletableFuture<ListVpcTagsResponse>
     */
    public CompletableFuture<ListVpcTagsResponse> listVpcTagsAsync(ListVpcTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.listVpcTags);
    }

    /**
     * 查询VPC项目标签
     *
     * 查询租户在指定区域和实例类型的所有标签集合
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVpcTagsRequest 请求对象
     * @return AsyncInvoker<ListVpcTagsRequest, ListVpcTagsResponse>
     */
    public AsyncInvoker<ListVpcTagsRequest, ListVpcTagsResponse> listVpcTagsAsyncInvoker(ListVpcTagsRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.listVpcTags, hcClient);
    }

    /**
     * 查询VPC列表
     *
     * 查询虚拟私有云列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVpcsRequest 请求对象
     * @return CompletableFuture<ListVpcsResponse>
     */
    public CompletableFuture<ListVpcsResponse> listVpcsAsync(ListVpcsRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.listVpcs);
    }

    /**
     * 查询VPC列表
     *
     * 查询虚拟私有云列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVpcsRequest 请求对象
     * @return AsyncInvoker<ListVpcsRequest, ListVpcsResponse>
     */
    public AsyncInvoker<ListVpcsRequest, ListVpcsResponse> listVpcsAsyncInvoker(ListVpcsRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.listVpcs, hcClient);
    }

    /**
     * 查询VPC资源实例
     *
     * 使用标签过滤实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVpcsByTagsRequest 请求对象
     * @return CompletableFuture<ListVpcsByTagsResponse>
     */
    public CompletableFuture<ListVpcsByTagsResponse> listVpcsByTagsAsync(ListVpcsByTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.listVpcsByTags);
    }

    /**
     * 查询VPC资源实例
     *
     * 使用标签过滤实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVpcsByTagsRequest 请求对象
     * @return AsyncInvoker<ListVpcsByTagsRequest, ListVpcsByTagsResponse>
     */
    public AsyncInvoker<ListVpcsByTagsRequest, ListVpcsByTagsResponse> listVpcsByTagsAsyncInvoker(
        ListVpcsByTagsRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.listVpcsByTags, hcClient);
    }

    /**
     * 查询VPC
     *
     * 查询虚拟私有云。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowVpcRequest 请求对象
     * @return CompletableFuture<ShowVpcResponse>
     */
    public CompletableFuture<ShowVpcResponse> showVpcAsync(ShowVpcRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.showVpc);
    }

    /**
     * 查询VPC
     *
     * 查询虚拟私有云。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowVpcRequest 请求对象
     * @return AsyncInvoker<ShowVpcRequest, ShowVpcResponse>
     */
    public AsyncInvoker<ShowVpcRequest, ShowVpcResponse> showVpcAsyncInvoker(ShowVpcRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.showVpc, hcClient);
    }

    /**
     * 查询VPC路由
     *
     * 查询路由详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowVpcRouteRequest 请求对象
     * @return CompletableFuture<ShowVpcRouteResponse>
     */
    public CompletableFuture<ShowVpcRouteResponse> showVpcRouteAsync(ShowVpcRouteRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.showVpcRoute);
    }

    /**
     * 查询VPC路由
     *
     * 查询路由详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowVpcRouteRequest 请求对象
     * @return AsyncInvoker<ShowVpcRouteRequest, ShowVpcRouteResponse>
     */
    public AsyncInvoker<ShowVpcRouteRequest, ShowVpcRouteResponse> showVpcRouteAsyncInvoker(
        ShowVpcRouteRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.showVpcRoute, hcClient);
    }

    /**
     * 查询VPC资源标签
     *
     * 查询指定VPC实例的标签信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowVpcTagsRequest 请求对象
     * @return CompletableFuture<ShowVpcTagsResponse>
     */
    public CompletableFuture<ShowVpcTagsResponse> showVpcTagsAsync(ShowVpcTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.showVpcTags);
    }

    /**
     * 查询VPC资源标签
     *
     * 查询指定VPC实例的标签信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowVpcTagsRequest 请求对象
     * @return AsyncInvoker<ShowVpcTagsRequest, ShowVpcTagsResponse>
     */
    public AsyncInvoker<ShowVpcTagsRequest, ShowVpcTagsResponse> showVpcTagsAsyncInvoker(ShowVpcTagsRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.showVpcTags, hcClient);
    }

    /**
     * 更新VPC
     *
     * 更新虚拟私有云。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateVpcRequest 请求对象
     * @return CompletableFuture<UpdateVpcResponse>
     */
    public CompletableFuture<UpdateVpcResponse> updateVpcAsync(UpdateVpcRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.updateVpc);
    }

    /**
     * 更新VPC
     *
     * 更新虚拟私有云。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateVpcRequest 请求对象
     * @return AsyncInvoker<UpdateVpcRequest, UpdateVpcResponse>
     */
    public AsyncInvoker<UpdateVpcRequest, UpdateVpcResponse> updateVpcAsyncInvoker(UpdateVpcRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.updateVpc, hcClient);
    }

}
