package com.huaweicloud.sdk.vpc.v2;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
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
     * 接受对等连接请求
     *
     * 租户A名下的VPC申请和租户B的VPC建立对等连接，需要等待租户B接受该请求。此接口用于租户接受其他租户发起的对等连接请求。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AcceptVpcPeeringRequest 请求对象
     * @return AcceptVpcPeeringResponse
     */
    public AcceptVpcPeeringResponse acceptVpcPeering(AcceptVpcPeeringRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.acceptVpcPeering);
    }

    /**
     * 接受对等连接请求
     *
     * 租户A名下的VPC申请和租户B的VPC建立对等连接，需要等待租户B接受该请求。此接口用于租户接受其他租户发起的对等连接请求。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AcceptVpcPeeringRequest 请求对象
     * @return SyncInvoker<AcceptVpcPeeringRequest, AcceptVpcPeeringResponse>
     */
    public SyncInvoker<AcceptVpcPeeringRequest, AcceptVpcPeeringResponse> acceptVpcPeeringInvoker(
        AcceptVpcPeeringRequest request) {
        return new SyncInvoker<AcceptVpcPeeringRequest, AcceptVpcPeeringResponse>(request, VpcMeta.acceptVpcPeering,
            hcClient);
    }

    /**
     * 子网关联路由表
     *
     * 路由表关联子网。子网关联路由表A后，再关联B，不需要先跟路由表A解关联再关联路由表B
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AssociateRouteTableRequest 请求对象
     * @return AssociateRouteTableResponse
     */
    public AssociateRouteTableResponse associateRouteTable(AssociateRouteTableRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.associateRouteTable);
    }

    /**
     * 子网关联路由表
     *
     * 路由表关联子网。子网关联路由表A后，再关联B，不需要先跟路由表A解关联再关联路由表B
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AssociateRouteTableRequest 请求对象
     * @return SyncInvoker<AssociateRouteTableRequest, AssociateRouteTableResponse>
     */
    public SyncInvoker<AssociateRouteTableRequest, AssociateRouteTableResponse> associateRouteTableInvoker(
        AssociateRouteTableRequest request) {
        return new SyncInvoker<AssociateRouteTableRequest, AssociateRouteTableResponse>(request,
            VpcMeta.associateRouteTable, hcClient);
    }

    /**
     * 批量创建子网资源标签
     *
     * 为指定的子网资源实例批量添加标签。
     * 此接口为幂等接口：创建时如果请求体中存在重复key则报错。创建时，不允许设置重复key数据，如果数据库已存在该key，就覆盖value的值。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchCreateSubnetTagsRequest 请求对象
     * @return BatchCreateSubnetTagsResponse
     */
    public BatchCreateSubnetTagsResponse batchCreateSubnetTags(BatchCreateSubnetTagsRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.batchCreateSubnetTags);
    }

    /**
     * 批量创建子网资源标签
     *
     * 为指定的子网资源实例批量添加标签。
     * 此接口为幂等接口：创建时如果请求体中存在重复key则报错。创建时，不允许设置重复key数据，如果数据库已存在该key，就覆盖value的值。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchCreateSubnetTagsRequest 请求对象
     * @return SyncInvoker<BatchCreateSubnetTagsRequest, BatchCreateSubnetTagsResponse>
     */
    public SyncInvoker<BatchCreateSubnetTagsRequest, BatchCreateSubnetTagsResponse> batchCreateSubnetTagsInvoker(
        BatchCreateSubnetTagsRequest request) {
        return new SyncInvoker<BatchCreateSubnetTagsRequest, BatchCreateSubnetTagsResponse>(request,
            VpcMeta.batchCreateSubnetTags, hcClient);
    }

    /**
     * 批量删除子网资源标签
     *
     * 为指定的子网资源实例批量删除标签
     * 此接口为幂等接口：删除时，如果删除的标签不存在，默认处理成功；删除时不对标签字符集范围做校验。删除时tags结构体不能缺失，key不能为空，或者空字符串。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchDeleteSubnetTagsRequest 请求对象
     * @return BatchDeleteSubnetTagsResponse
     */
    public BatchDeleteSubnetTagsResponse batchDeleteSubnetTags(BatchDeleteSubnetTagsRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.batchDeleteSubnetTags);
    }

    /**
     * 批量删除子网资源标签
     *
     * 为指定的子网资源实例批量删除标签
     * 此接口为幂等接口：删除时，如果删除的标签不存在，默认处理成功；删除时不对标签字符集范围做校验。删除时tags结构体不能缺失，key不能为空，或者空字符串。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchDeleteSubnetTagsRequest 请求对象
     * @return SyncInvoker<BatchDeleteSubnetTagsRequest, BatchDeleteSubnetTagsResponse>
     */
    public SyncInvoker<BatchDeleteSubnetTagsRequest, BatchDeleteSubnetTagsResponse> batchDeleteSubnetTagsInvoker(
        BatchDeleteSubnetTagsRequest request) {
        return new SyncInvoker<BatchDeleteSubnetTagsRequest, BatchDeleteSubnetTagsResponse>(request,
            VpcMeta.batchDeleteSubnetTags, hcClient);
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
     * @param CreateFlowLogRequest 请求对象
     * @return CreateFlowLogResponse
     */
    public CreateFlowLogResponse createFlowLog(CreateFlowLogRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.createFlowLog);
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
     * @param CreateFlowLogRequest 请求对象
     * @return SyncInvoker<CreateFlowLogRequest, CreateFlowLogResponse>
     */
    public SyncInvoker<CreateFlowLogRequest, CreateFlowLogResponse> createFlowLogInvoker(CreateFlowLogRequest request) {
        return new SyncInvoker<CreateFlowLogRequest, CreateFlowLogResponse>(request, VpcMeta.createFlowLog, hcClient);
    }

    /**
     * 创建端口
     *
     * 创建端口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreatePortRequest 请求对象
     * @return CreatePortResponse
     */
    public CreatePortResponse createPort(CreatePortRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.createPort);
    }

    /**
     * 创建端口
     *
     * 创建端口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreatePortRequest 请求对象
     * @return SyncInvoker<CreatePortRequest, CreatePortResponse>
     */
    public SyncInvoker<CreatePortRequest, CreatePortResponse> createPortInvoker(CreatePortRequest request) {
        return new SyncInvoker<CreatePortRequest, CreatePortResponse>(request, VpcMeta.createPort, hcClient);
    }

    /**
     * 创建路由表
     *
     * 创建路由表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateRouteTableRequest 请求对象
     * @return CreateRouteTableResponse
     */
    public CreateRouteTableResponse createRouteTable(CreateRouteTableRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.createRouteTable);
    }

    /**
     * 创建路由表
     *
     * 创建路由表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateRouteTableRequest 请求对象
     * @return SyncInvoker<CreateRouteTableRequest, CreateRouteTableResponse>
     */
    public SyncInvoker<CreateRouteTableRequest, CreateRouteTableResponse> createRouteTableInvoker(
        CreateRouteTableRequest request) {
        return new SyncInvoker<CreateRouteTableRequest, CreateRouteTableResponse>(request, VpcMeta.createRouteTable,
            hcClient);
    }

    /**
     * 创建安全组
     *
     * 创建安全组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateSecurityGroupRequest 请求对象
     * @return CreateSecurityGroupResponse
     */
    public CreateSecurityGroupResponse createSecurityGroup(CreateSecurityGroupRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.createSecurityGroup);
    }

    /**
     * 创建安全组
     *
     * 创建安全组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateSecurityGroupRequest 请求对象
     * @return SyncInvoker<CreateSecurityGroupRequest, CreateSecurityGroupResponse>
     */
    public SyncInvoker<CreateSecurityGroupRequest, CreateSecurityGroupResponse> createSecurityGroupInvoker(
        CreateSecurityGroupRequest request) {
        return new SyncInvoker<CreateSecurityGroupRequest, CreateSecurityGroupResponse>(request,
            VpcMeta.createSecurityGroup, hcClient);
    }

    /**
     * 创建安全组规则
     *
     * 创建安全组规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateSecurityGroupRuleRequest 请求对象
     * @return CreateSecurityGroupRuleResponse
     */
    public CreateSecurityGroupRuleResponse createSecurityGroupRule(CreateSecurityGroupRuleRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.createSecurityGroupRule);
    }

    /**
     * 创建安全组规则
     *
     * 创建安全组规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateSecurityGroupRuleRequest 请求对象
     * @return SyncInvoker<CreateSecurityGroupRuleRequest, CreateSecurityGroupRuleResponse>
     */
    public SyncInvoker<CreateSecurityGroupRuleRequest, CreateSecurityGroupRuleResponse> createSecurityGroupRuleInvoker(
        CreateSecurityGroupRuleRequest request) {
        return new SyncInvoker<CreateSecurityGroupRuleRequest, CreateSecurityGroupRuleResponse>(request,
            VpcMeta.createSecurityGroupRule, hcClient);
    }

    /**
     * 创建子网
     *
     * 创建子网。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateSubnetRequest 请求对象
     * @return CreateSubnetResponse
     */
    public CreateSubnetResponse createSubnet(CreateSubnetRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.createSubnet);
    }

    /**
     * 创建子网
     *
     * 创建子网。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateSubnetRequest 请求对象
     * @return SyncInvoker<CreateSubnetRequest, CreateSubnetResponse>
     */
    public SyncInvoker<CreateSubnetRequest, CreateSubnetResponse> createSubnetInvoker(CreateSubnetRequest request) {
        return new SyncInvoker<CreateSubnetRequest, CreateSubnetResponse>(request, VpcMeta.createSubnet, hcClient);
    }

    /**
     * 创建子网资源标签
     *
     * 给指定子网资源实例增加标签信息。
     * 此接口为幂等接口：创建时，如果创建的标签已经存在（key相同），则覆盖。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateSubnetTagRequest 请求对象
     * @return CreateSubnetTagResponse
     */
    public CreateSubnetTagResponse createSubnetTag(CreateSubnetTagRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.createSubnetTag);
    }

    /**
     * 创建子网资源标签
     *
     * 给指定子网资源实例增加标签信息。
     * 此接口为幂等接口：创建时，如果创建的标签已经存在（key相同），则覆盖。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateSubnetTagRequest 请求对象
     * @return SyncInvoker<CreateSubnetTagRequest, CreateSubnetTagResponse>
     */
    public SyncInvoker<CreateSubnetTagRequest, CreateSubnetTagResponse> createSubnetTagInvoker(
        CreateSubnetTagRequest request) {
        return new SyncInvoker<CreateSubnetTagRequest, CreateSubnetTagResponse>(request, VpcMeta.createSubnetTag,
            hcClient);
    }

    /**
     * 创建对等连接
     *
     * 创建对等连接。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateVpcPeeringRequest 请求对象
     * @return CreateVpcPeeringResponse
     */
    public CreateVpcPeeringResponse createVpcPeering(CreateVpcPeeringRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.createVpcPeering);
    }

    /**
     * 创建对等连接
     *
     * 创建对等连接。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateVpcPeeringRequest 请求对象
     * @return SyncInvoker<CreateVpcPeeringRequest, CreateVpcPeeringResponse>
     */
    public SyncInvoker<CreateVpcPeeringRequest, CreateVpcPeeringResponse> createVpcPeeringInvoker(
        CreateVpcPeeringRequest request) {
        return new SyncInvoker<CreateVpcPeeringRequest, CreateVpcPeeringResponse>(request, VpcMeta.createVpcPeering,
            hcClient);
    }

    /**
     * 删除流日志
     *
     * 删除流日志
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteFlowLogRequest 请求对象
     * @return DeleteFlowLogResponse
     */
    public DeleteFlowLogResponse deleteFlowLog(DeleteFlowLogRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.deleteFlowLog);
    }

    /**
     * 删除流日志
     *
     * 删除流日志
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteFlowLogRequest 请求对象
     * @return SyncInvoker<DeleteFlowLogRequest, DeleteFlowLogResponse>
     */
    public SyncInvoker<DeleteFlowLogRequest, DeleteFlowLogResponse> deleteFlowLogInvoker(DeleteFlowLogRequest request) {
        return new SyncInvoker<DeleteFlowLogRequest, DeleteFlowLogResponse>(request, VpcMeta.deleteFlowLog, hcClient);
    }

    /**
     * 删除端口
     *
     * 删除端口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeletePortRequest 请求对象
     * @return DeletePortResponse
     */
    public DeletePortResponse deletePort(DeletePortRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.deletePort);
    }

    /**
     * 删除端口
     *
     * 删除端口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeletePortRequest 请求对象
     * @return SyncInvoker<DeletePortRequest, DeletePortResponse>
     */
    public SyncInvoker<DeletePortRequest, DeletePortResponse> deletePortInvoker(DeletePortRequest request) {
        return new SyncInvoker<DeletePortRequest, DeletePortResponse>(request, VpcMeta.deletePort, hcClient);
    }

    /**
     * 删除路由表
     *
     * 删除路由表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteRouteTableRequest 请求对象
     * @return DeleteRouteTableResponse
     */
    public DeleteRouteTableResponse deleteRouteTable(DeleteRouteTableRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.deleteRouteTable);
    }

    /**
     * 删除路由表
     *
     * 删除路由表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteRouteTableRequest 请求对象
     * @return SyncInvoker<DeleteRouteTableRequest, DeleteRouteTableResponse>
     */
    public SyncInvoker<DeleteRouteTableRequest, DeleteRouteTableResponse> deleteRouteTableInvoker(
        DeleteRouteTableRequest request) {
        return new SyncInvoker<DeleteRouteTableRequest, DeleteRouteTableResponse>(request, VpcMeta.deleteRouteTable,
            hcClient);
    }

    /**
     * 删除安全组
     *
     * 删除安全组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteSecurityGroupRequest 请求对象
     * @return DeleteSecurityGroupResponse
     */
    public DeleteSecurityGroupResponse deleteSecurityGroup(DeleteSecurityGroupRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.deleteSecurityGroup);
    }

    /**
     * 删除安全组
     *
     * 删除安全组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteSecurityGroupRequest 请求对象
     * @return SyncInvoker<DeleteSecurityGroupRequest, DeleteSecurityGroupResponse>
     */
    public SyncInvoker<DeleteSecurityGroupRequest, DeleteSecurityGroupResponse> deleteSecurityGroupInvoker(
        DeleteSecurityGroupRequest request) {
        return new SyncInvoker<DeleteSecurityGroupRequest, DeleteSecurityGroupResponse>(request,
            VpcMeta.deleteSecurityGroup, hcClient);
    }

    /**
     * 删除安全组规则
     *
     * 删除安全组规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteSecurityGroupRuleRequest 请求对象
     * @return DeleteSecurityGroupRuleResponse
     */
    public DeleteSecurityGroupRuleResponse deleteSecurityGroupRule(DeleteSecurityGroupRuleRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.deleteSecurityGroupRule);
    }

    /**
     * 删除安全组规则
     *
     * 删除安全组规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteSecurityGroupRuleRequest 请求对象
     * @return SyncInvoker<DeleteSecurityGroupRuleRequest, DeleteSecurityGroupRuleResponse>
     */
    public SyncInvoker<DeleteSecurityGroupRuleRequest, DeleteSecurityGroupRuleResponse> deleteSecurityGroupRuleInvoker(
        DeleteSecurityGroupRuleRequest request) {
        return new SyncInvoker<DeleteSecurityGroupRuleRequest, DeleteSecurityGroupRuleResponse>(request,
            VpcMeta.deleteSecurityGroupRule, hcClient);
    }

    /**
     * 删除子网
     *
     * 删除子网
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteSubnetRequest 请求对象
     * @return DeleteSubnetResponse
     */
    public DeleteSubnetResponse deleteSubnet(DeleteSubnetRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.deleteSubnet);
    }

    /**
     * 删除子网
     *
     * 删除子网
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteSubnetRequest 请求对象
     * @return SyncInvoker<DeleteSubnetRequest, DeleteSubnetResponse>
     */
    public SyncInvoker<DeleteSubnetRequest, DeleteSubnetResponse> deleteSubnetInvoker(DeleteSubnetRequest request) {
        return new SyncInvoker<DeleteSubnetRequest, DeleteSubnetResponse>(request, VpcMeta.deleteSubnet, hcClient);
    }

    /**
     * 删除子网资源标签
     *
     * 删除指定子网资源实例的标签信息。
     * 该接口为幂等接口：删除的key不存在报404，Key不能为空或者空字符串
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteSubnetTagRequest 请求对象
     * @return DeleteSubnetTagResponse
     */
    public DeleteSubnetTagResponse deleteSubnetTag(DeleteSubnetTagRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.deleteSubnetTag);
    }

    /**
     * 删除子网资源标签
     *
     * 删除指定子网资源实例的标签信息。
     * 该接口为幂等接口：删除的key不存在报404，Key不能为空或者空字符串
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteSubnetTagRequest 请求对象
     * @return SyncInvoker<DeleteSubnetTagRequest, DeleteSubnetTagResponse>
     */
    public SyncInvoker<DeleteSubnetTagRequest, DeleteSubnetTagResponse> deleteSubnetTagInvoker(
        DeleteSubnetTagRequest request) {
        return new SyncInvoker<DeleteSubnetTagRequest, DeleteSubnetTagResponse>(request, VpcMeta.deleteSubnetTag,
            hcClient);
    }

    /**
     * 删除对等连接
     *
     * 删除对等连接。
     * 可以在在本端或对端任何一端删除对等连接。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteVpcPeeringRequest 请求对象
     * @return DeleteVpcPeeringResponse
     */
    public DeleteVpcPeeringResponse deleteVpcPeering(DeleteVpcPeeringRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.deleteVpcPeering);
    }

    /**
     * 删除对等连接
     *
     * 删除对等连接。
     * 可以在在本端或对端任何一端删除对等连接。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteVpcPeeringRequest 请求对象
     * @return SyncInvoker<DeleteVpcPeeringRequest, DeleteVpcPeeringResponse>
     */
    public SyncInvoker<DeleteVpcPeeringRequest, DeleteVpcPeeringResponse> deleteVpcPeeringInvoker(
        DeleteVpcPeeringRequest request) {
        return new SyncInvoker<DeleteVpcPeeringRequest, DeleteVpcPeeringResponse>(request, VpcMeta.deleteVpcPeering,
            hcClient);
    }

    /**
     * 子网解关联路由表
     *
     * 子网解关联路由表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DisassociateRouteTableRequest 请求对象
     * @return DisassociateRouteTableResponse
     */
    public DisassociateRouteTableResponse disassociateRouteTable(DisassociateRouteTableRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.disassociateRouteTable);
    }

    /**
     * 子网解关联路由表
     *
     * 子网解关联路由表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DisassociateRouteTableRequest 请求对象
     * @return SyncInvoker<DisassociateRouteTableRequest, DisassociateRouteTableResponse>
     */
    public SyncInvoker<DisassociateRouteTableRequest, DisassociateRouteTableResponse> disassociateRouteTableInvoker(
        DisassociateRouteTableRequest request) {
        return new SyncInvoker<DisassociateRouteTableRequest, DisassociateRouteTableResponse>(request,
            VpcMeta.disassociateRouteTable, hcClient);
    }

    /**
     * 查询流日志列表
     *
     * 查询提交请求的租户的所有流日志列表，并根据过滤条件进行过滤
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListFlowLogsRequest 请求对象
     * @return ListFlowLogsResponse
     */
    public ListFlowLogsResponse listFlowLogs(ListFlowLogsRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.listFlowLogs);
    }

    /**
     * 查询流日志列表
     *
     * 查询提交请求的租户的所有流日志列表，并根据过滤条件进行过滤
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListFlowLogsRequest 请求对象
     * @return SyncInvoker<ListFlowLogsRequest, ListFlowLogsResponse>
     */
    public SyncInvoker<ListFlowLogsRequest, ListFlowLogsResponse> listFlowLogsInvoker(ListFlowLogsRequest request) {
        return new SyncInvoker<ListFlowLogsRequest, ListFlowLogsResponse>(request, VpcMeta.listFlowLogs, hcClient);
    }

    /**
     * 查询端口列表
     *
     * 查询提交请求的租户的所有端口，单次查询最多返回2000条数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPortsRequest 请求对象
     * @return ListPortsResponse
     */
    public ListPortsResponse listPorts(ListPortsRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.listPorts);
    }

    /**
     * 查询端口列表
     *
     * 查询提交请求的租户的所有端口，单次查询最多返回2000条数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPortsRequest 请求对象
     * @return SyncInvoker<ListPortsRequest, ListPortsResponse>
     */
    public SyncInvoker<ListPortsRequest, ListPortsResponse> listPortsInvoker(ListPortsRequest request) {
        return new SyncInvoker<ListPortsRequest, ListPortsResponse>(request, VpcMeta.listPorts, hcClient);
    }

    /**
     * 查询路由表列表
     *
     * 查询提交请求的帐户的所有路由表列表，并根据过滤条件进行过滤
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRouteTablesRequest 请求对象
     * @return ListRouteTablesResponse
     */
    public ListRouteTablesResponse listRouteTables(ListRouteTablesRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.listRouteTables);
    }

    /**
     * 查询路由表列表
     *
     * 查询提交请求的帐户的所有路由表列表，并根据过滤条件进行过滤
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRouteTablesRequest 请求对象
     * @return SyncInvoker<ListRouteTablesRequest, ListRouteTablesResponse>
     */
    public SyncInvoker<ListRouteTablesRequest, ListRouteTablesResponse> listRouteTablesInvoker(
        ListRouteTablesRequest request) {
        return new SyncInvoker<ListRouteTablesRequest, ListRouteTablesResponse>(request, VpcMeta.listRouteTables,
            hcClient);
    }

    /**
     * 查询安全组规则列表
     *
     * 查询安全组规则列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSecurityGroupRulesRequest 请求对象
     * @return ListSecurityGroupRulesResponse
     */
    public ListSecurityGroupRulesResponse listSecurityGroupRules(ListSecurityGroupRulesRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.listSecurityGroupRules);
    }

    /**
     * 查询安全组规则列表
     *
     * 查询安全组规则列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSecurityGroupRulesRequest 请求对象
     * @return SyncInvoker<ListSecurityGroupRulesRequest, ListSecurityGroupRulesResponse>
     */
    public SyncInvoker<ListSecurityGroupRulesRequest, ListSecurityGroupRulesResponse> listSecurityGroupRulesInvoker(
        ListSecurityGroupRulesRequest request) {
        return new SyncInvoker<ListSecurityGroupRulesRequest, ListSecurityGroupRulesResponse>(request,
            VpcMeta.listSecurityGroupRules, hcClient);
    }

    /**
     * 查询安全组列表
     *
     * 查询安全组列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSecurityGroupsRequest 请求对象
     * @return ListSecurityGroupsResponse
     */
    public ListSecurityGroupsResponse listSecurityGroups(ListSecurityGroupsRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.listSecurityGroups);
    }

    /**
     * 查询安全组列表
     *
     * 查询安全组列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSecurityGroupsRequest 请求对象
     * @return SyncInvoker<ListSecurityGroupsRequest, ListSecurityGroupsResponse>
     */
    public SyncInvoker<ListSecurityGroupsRequest, ListSecurityGroupsResponse> listSecurityGroupsInvoker(
        ListSecurityGroupsRequest request) {
        return new SyncInvoker<ListSecurityGroupsRequest, ListSecurityGroupsResponse>(request,
            VpcMeta.listSecurityGroups, hcClient);
    }

    /**
     * 查询子网项目标签
     *
     * 查询租户在指定区域和实例类型的所有标签集合
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSubnetTagsRequest 请求对象
     * @return ListSubnetTagsResponse
     */
    public ListSubnetTagsResponse listSubnetTags(ListSubnetTagsRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.listSubnetTags);
    }

    /**
     * 查询子网项目标签
     *
     * 查询租户在指定区域和实例类型的所有标签集合
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSubnetTagsRequest 请求对象
     * @return SyncInvoker<ListSubnetTagsRequest, ListSubnetTagsResponse>
     */
    public SyncInvoker<ListSubnetTagsRequest, ListSubnetTagsResponse> listSubnetTagsInvoker(
        ListSubnetTagsRequest request) {
        return new SyncInvoker<ListSubnetTagsRequest, ListSubnetTagsResponse>(request, VpcMeta.listSubnetTags,
            hcClient);
    }

    /**
     * 查询子网列表
     *
     * 查询子网列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSubnetsRequest 请求对象
     * @return ListSubnetsResponse
     */
    public ListSubnetsResponse listSubnets(ListSubnetsRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.listSubnets);
    }

    /**
     * 查询子网列表
     *
     * 查询子网列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSubnetsRequest 请求对象
     * @return SyncInvoker<ListSubnetsRequest, ListSubnetsResponse>
     */
    public SyncInvoker<ListSubnetsRequest, ListSubnetsResponse> listSubnetsInvoker(ListSubnetsRequest request) {
        return new SyncInvoker<ListSubnetsRequest, ListSubnetsResponse>(request, VpcMeta.listSubnets, hcClient);
    }

    /**
     * 查询子网资源实例
     *
     * 使用标签过滤实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSubnetsByTagsRequest 请求对象
     * @return ListSubnetsByTagsResponse
     */
    public ListSubnetsByTagsResponse listSubnetsByTags(ListSubnetsByTagsRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.listSubnetsByTags);
    }

    /**
     * 查询子网资源实例
     *
     * 使用标签过滤实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSubnetsByTagsRequest 请求对象
     * @return SyncInvoker<ListSubnetsByTagsRequest, ListSubnetsByTagsResponse>
     */
    public SyncInvoker<ListSubnetsByTagsRequest, ListSubnetsByTagsResponse> listSubnetsByTagsInvoker(
        ListSubnetsByTagsRequest request) {
        return new SyncInvoker<ListSubnetsByTagsRequest, ListSubnetsByTagsResponse>(request, VpcMeta.listSubnetsByTags,
            hcClient);
    }

    /**
     * 查询对等连接列表
     *
     * 查询提交请求的租户的所有对等连接。根据过滤条件进行过滤。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListVpcPeeringsRequest 请求对象
     * @return ListVpcPeeringsResponse
     */
    public ListVpcPeeringsResponse listVpcPeerings(ListVpcPeeringsRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.listVpcPeerings);
    }

    /**
     * 查询对等连接列表
     *
     * 查询提交请求的租户的所有对等连接。根据过滤条件进行过滤。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListVpcPeeringsRequest 请求对象
     * @return SyncInvoker<ListVpcPeeringsRequest, ListVpcPeeringsResponse>
     */
    public SyncInvoker<ListVpcPeeringsRequest, ListVpcPeeringsResponse> listVpcPeeringsInvoker(
        ListVpcPeeringsRequest request) {
        return new SyncInvoker<ListVpcPeeringsRequest, ListVpcPeeringsResponse>(request, VpcMeta.listVpcPeerings,
            hcClient);
    }

    /**
     * 拒绝对等连接请求
     *
     * 租户A名下的VPC申请和租户B的VPC建立对等连接，需要等待租户B接受该请求。此接口用于租户拒绝其他租户发起的对等连接请求。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RejectVpcPeeringRequest 请求对象
     * @return RejectVpcPeeringResponse
     */
    public RejectVpcPeeringResponse rejectVpcPeering(RejectVpcPeeringRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.rejectVpcPeering);
    }

    /**
     * 拒绝对等连接请求
     *
     * 租户A名下的VPC申请和租户B的VPC建立对等连接，需要等待租户B接受该请求。此接口用于租户拒绝其他租户发起的对等连接请求。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RejectVpcPeeringRequest 请求对象
     * @return SyncInvoker<RejectVpcPeeringRequest, RejectVpcPeeringResponse>
     */
    public SyncInvoker<RejectVpcPeeringRequest, RejectVpcPeeringResponse> rejectVpcPeeringInvoker(
        RejectVpcPeeringRequest request) {
        return new SyncInvoker<RejectVpcPeeringRequest, RejectVpcPeeringResponse>(request, VpcMeta.rejectVpcPeering,
            hcClient);
    }

    /**
     * 查询流日志
     *
     * 查询流日志详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowFlowLogRequest 请求对象
     * @return ShowFlowLogResponse
     */
    public ShowFlowLogResponse showFlowLog(ShowFlowLogRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.showFlowLog);
    }

    /**
     * 查询流日志
     *
     * 查询流日志详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowFlowLogRequest 请求对象
     * @return SyncInvoker<ShowFlowLogRequest, ShowFlowLogResponse>
     */
    public SyncInvoker<ShowFlowLogRequest, ShowFlowLogResponse> showFlowLogInvoker(ShowFlowLogRequest request) {
        return new SyncInvoker<ShowFlowLogRequest, ShowFlowLogResponse>(request, VpcMeta.showFlowLog, hcClient);
    }

    /**
     * 查询端口
     *
     * 查询单个端口详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPortRequest 请求对象
     * @return ShowPortResponse
     */
    public ShowPortResponse showPort(ShowPortRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.showPort);
    }

    /**
     * 查询端口
     *
     * 查询单个端口详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPortRequest 请求对象
     * @return SyncInvoker<ShowPortRequest, ShowPortResponse>
     */
    public SyncInvoker<ShowPortRequest, ShowPortResponse> showPortInvoker(ShowPortRequest request) {
        return new SyncInvoker<ShowPortRequest, ShowPortResponse>(request, VpcMeta.showPort, hcClient);
    }

    /**
     * 查询配额
     *
     * 查询单租户在VPC服务下的网络资源配额，包括vpc配额、子网配额、安全组配额、安全组规则配额、弹性公网IP配额，vpn配额等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowQuotaRequest 请求对象
     * @return ShowQuotaResponse
     */
    public ShowQuotaResponse showQuota(ShowQuotaRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.showQuota);
    }

    /**
     * 查询配额
     *
     * 查询单租户在VPC服务下的网络资源配额，包括vpc配额、子网配额、安全组配额、安全组规则配额、弹性公网IP配额，vpn配额等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowQuotaRequest 请求对象
     * @return SyncInvoker<ShowQuotaRequest, ShowQuotaResponse>
     */
    public SyncInvoker<ShowQuotaRequest, ShowQuotaResponse> showQuotaInvoker(ShowQuotaRequest request) {
        return new SyncInvoker<ShowQuotaRequest, ShowQuotaResponse>(request, VpcMeta.showQuota, hcClient);
    }

    /**
     * 查询路由表
     *
     * 查询路由表详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowRouteTableRequest 请求对象
     * @return ShowRouteTableResponse
     */
    public ShowRouteTableResponse showRouteTable(ShowRouteTableRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.showRouteTable);
    }

    /**
     * 查询路由表
     *
     * 查询路由表详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowRouteTableRequest 请求对象
     * @return SyncInvoker<ShowRouteTableRequest, ShowRouteTableResponse>
     */
    public SyncInvoker<ShowRouteTableRequest, ShowRouteTableResponse> showRouteTableInvoker(
        ShowRouteTableRequest request) {
        return new SyncInvoker<ShowRouteTableRequest, ShowRouteTableResponse>(request, VpcMeta.showRouteTable,
            hcClient);
    }

    /**
     * 查询安全组
     *
     * 查询单个安全组详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowSecurityGroupRequest 请求对象
     * @return ShowSecurityGroupResponse
     */
    public ShowSecurityGroupResponse showSecurityGroup(ShowSecurityGroupRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.showSecurityGroup);
    }

    /**
     * 查询安全组
     *
     * 查询单个安全组详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowSecurityGroupRequest 请求对象
     * @return SyncInvoker<ShowSecurityGroupRequest, ShowSecurityGroupResponse>
     */
    public SyncInvoker<ShowSecurityGroupRequest, ShowSecurityGroupResponse> showSecurityGroupInvoker(
        ShowSecurityGroupRequest request) {
        return new SyncInvoker<ShowSecurityGroupRequest, ShowSecurityGroupResponse>(request, VpcMeta.showSecurityGroup,
            hcClient);
    }

    /**
     * 查询安全组规则
     *
     * 查询单个安全组规则详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowSecurityGroupRuleRequest 请求对象
     * @return ShowSecurityGroupRuleResponse
     */
    public ShowSecurityGroupRuleResponse showSecurityGroupRule(ShowSecurityGroupRuleRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.showSecurityGroupRule);
    }

    /**
     * 查询安全组规则
     *
     * 查询单个安全组规则详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowSecurityGroupRuleRequest 请求对象
     * @return SyncInvoker<ShowSecurityGroupRuleRequest, ShowSecurityGroupRuleResponse>
     */
    public SyncInvoker<ShowSecurityGroupRuleRequest, ShowSecurityGroupRuleResponse> showSecurityGroupRuleInvoker(
        ShowSecurityGroupRuleRequest request) {
        return new SyncInvoker<ShowSecurityGroupRuleRequest, ShowSecurityGroupRuleResponse>(request,
            VpcMeta.showSecurityGroupRule, hcClient);
    }

    /**
     * 查询子网
     *
     * 查询子网详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowSubnetRequest 请求对象
     * @return ShowSubnetResponse
     */
    public ShowSubnetResponse showSubnet(ShowSubnetRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.showSubnet);
    }

    /**
     * 查询子网
     *
     * 查询子网详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowSubnetRequest 请求对象
     * @return SyncInvoker<ShowSubnetRequest, ShowSubnetResponse>
     */
    public SyncInvoker<ShowSubnetRequest, ShowSubnetResponse> showSubnetInvoker(ShowSubnetRequest request) {
        return new SyncInvoker<ShowSubnetRequest, ShowSubnetResponse>(request, VpcMeta.showSubnet, hcClient);
    }

    /**
     * 查询子网资源标签
     *
     * 查询指定子网实例的标签信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowSubnetTagsRequest 请求对象
     * @return ShowSubnetTagsResponse
     */
    public ShowSubnetTagsResponse showSubnetTags(ShowSubnetTagsRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.showSubnetTags);
    }

    /**
     * 查询子网资源标签
     *
     * 查询指定子网实例的标签信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowSubnetTagsRequest 请求对象
     * @return SyncInvoker<ShowSubnetTagsRequest, ShowSubnetTagsResponse>
     */
    public SyncInvoker<ShowSubnetTagsRequest, ShowSubnetTagsResponse> showSubnetTagsInvoker(
        ShowSubnetTagsRequest request) {
        return new SyncInvoker<ShowSubnetTagsRequest, ShowSubnetTagsResponse>(request, VpcMeta.showSubnetTags,
            hcClient);
    }

    /**
     * 查询对等连接
     *
     * 查询对等连接详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowVpcPeeringRequest 请求对象
     * @return ShowVpcPeeringResponse
     */
    public ShowVpcPeeringResponse showVpcPeering(ShowVpcPeeringRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.showVpcPeering);
    }

    /**
     * 查询对等连接
     *
     * 查询对等连接详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowVpcPeeringRequest 请求对象
     * @return SyncInvoker<ShowVpcPeeringRequest, ShowVpcPeeringResponse>
     */
    public SyncInvoker<ShowVpcPeeringRequest, ShowVpcPeeringResponse> showVpcPeeringInvoker(
        ShowVpcPeeringRequest request) {
        return new SyncInvoker<ShowVpcPeeringRequest, ShowVpcPeeringResponse>(request, VpcMeta.showVpcPeering,
            hcClient);
    }

    /**
     * 更新流日志
     *
     * 更新流日志
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateFlowLogRequest 请求对象
     * @return UpdateFlowLogResponse
     */
    public UpdateFlowLogResponse updateFlowLog(UpdateFlowLogRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.updateFlowLog);
    }

    /**
     * 更新流日志
     *
     * 更新流日志
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateFlowLogRequest 请求对象
     * @return SyncInvoker<UpdateFlowLogRequest, UpdateFlowLogResponse>
     */
    public SyncInvoker<UpdateFlowLogRequest, UpdateFlowLogResponse> updateFlowLogInvoker(UpdateFlowLogRequest request) {
        return new SyncInvoker<UpdateFlowLogRequest, UpdateFlowLogResponse>(request, VpcMeta.updateFlowLog, hcClient);
    }

    /**
     * 更新端口
     *
     * 更新端口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdatePortRequest 请求对象
     * @return UpdatePortResponse
     */
    public UpdatePortResponse updatePort(UpdatePortRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.updatePort);
    }

    /**
     * 更新端口
     *
     * 更新端口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdatePortRequest 请求对象
     * @return SyncInvoker<UpdatePortRequest, UpdatePortResponse>
     */
    public SyncInvoker<UpdatePortRequest, UpdatePortResponse> updatePortInvoker(UpdatePortRequest request) {
        return new SyncInvoker<UpdatePortRequest, UpdatePortResponse>(request, VpcMeta.updatePort, hcClient);
    }

    /**
     * 更新路由表
     *
     * 更新路由表，包括可以更新路由表的名称，描述，以及新增、更新、删除路由条目
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateRouteTableRequest 请求对象
     * @return UpdateRouteTableResponse
     */
    public UpdateRouteTableResponse updateRouteTable(UpdateRouteTableRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.updateRouteTable);
    }

    /**
     * 更新路由表
     *
     * 更新路由表，包括可以更新路由表的名称，描述，以及新增、更新、删除路由条目
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateRouteTableRequest 请求对象
     * @return SyncInvoker<UpdateRouteTableRequest, UpdateRouteTableResponse>
     */
    public SyncInvoker<UpdateRouteTableRequest, UpdateRouteTableResponse> updateRouteTableInvoker(
        UpdateRouteTableRequest request) {
        return new SyncInvoker<UpdateRouteTableRequest, UpdateRouteTableResponse>(request, VpcMeta.updateRouteTable,
            hcClient);
    }

    /**
     * 更新子网
     *
     * 更新子网。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateSubnetRequest 请求对象
     * @return UpdateSubnetResponse
     */
    public UpdateSubnetResponse updateSubnet(UpdateSubnetRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.updateSubnet);
    }

    /**
     * 更新子网
     *
     * 更新子网。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateSubnetRequest 请求对象
     * @return SyncInvoker<UpdateSubnetRequest, UpdateSubnetResponse>
     */
    public SyncInvoker<UpdateSubnetRequest, UpdateSubnetResponse> updateSubnetInvoker(UpdateSubnetRequest request) {
        return new SyncInvoker<UpdateSubnetRequest, UpdateSubnetResponse>(request, VpcMeta.updateSubnet, hcClient);
    }

    /**
     * 更新对等连接
     *
     * 更新对等连接。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateVpcPeeringRequest 请求对象
     * @return UpdateVpcPeeringResponse
     */
    public UpdateVpcPeeringResponse updateVpcPeering(UpdateVpcPeeringRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.updateVpcPeering);
    }

    /**
     * 更新对等连接
     *
     * 更新对等连接。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateVpcPeeringRequest 请求对象
     * @return SyncInvoker<UpdateVpcPeeringRequest, UpdateVpcPeeringResponse>
     */
    public SyncInvoker<UpdateVpcPeeringRequest, UpdateVpcPeeringResponse> updateVpcPeeringInvoker(
        UpdateVpcPeeringRequest request) {
        return new SyncInvoker<UpdateVpcPeeringRequest, UpdateVpcPeeringResponse>(request, VpcMeta.updateVpcPeering,
            hcClient);
    }

    /**
     * 申请私有IP
     *
     * 申请私有IP。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreatePrivateipRequest 请求对象
     * @return CreatePrivateipResponse
     */
    public CreatePrivateipResponse createPrivateip(CreatePrivateipRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.createPrivateip);
    }

    /**
     * 申请私有IP
     *
     * 申请私有IP。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreatePrivateipRequest 请求对象
     * @return SyncInvoker<CreatePrivateipRequest, CreatePrivateipResponse>
     */
    public SyncInvoker<CreatePrivateipRequest, CreatePrivateipResponse> createPrivateipInvoker(
        CreatePrivateipRequest request) {
        return new SyncInvoker<CreatePrivateipRequest, CreatePrivateipResponse>(request, VpcMeta.createPrivateip,
            hcClient);
    }

    /**
     * 删除私有IP
     *
     * 删除私有IP。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeletePrivateipRequest 请求对象
     * @return DeletePrivateipResponse
     */
    public DeletePrivateipResponse deletePrivateip(DeletePrivateipRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.deletePrivateip);
    }

    /**
     * 删除私有IP
     *
     * 删除私有IP。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeletePrivateipRequest 请求对象
     * @return SyncInvoker<DeletePrivateipRequest, DeletePrivateipResponse>
     */
    public SyncInvoker<DeletePrivateipRequest, DeletePrivateipResponse> deletePrivateipInvoker(
        DeletePrivateipRequest request) {
        return new SyncInvoker<DeletePrivateipRequest, DeletePrivateipResponse>(request, VpcMeta.deletePrivateip,
            hcClient);
    }

    /**
     * 查询私有IP列表
     *
     * 查询指定子网下的私有IP列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPrivateipsRequest 请求对象
     * @return ListPrivateipsResponse
     */
    public ListPrivateipsResponse listPrivateips(ListPrivateipsRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.listPrivateips);
    }

    /**
     * 查询私有IP列表
     *
     * 查询指定子网下的私有IP列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPrivateipsRequest 请求对象
     * @return SyncInvoker<ListPrivateipsRequest, ListPrivateipsResponse>
     */
    public SyncInvoker<ListPrivateipsRequest, ListPrivateipsResponse> listPrivateipsInvoker(
        ListPrivateipsRequest request) {
        return new SyncInvoker<ListPrivateipsRequest, ListPrivateipsResponse>(request, VpcMeta.listPrivateips,
            hcClient);
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
     * @param ShowNetworkIpAvailabilitiesRequest 请求对象
     * @return ShowNetworkIpAvailabilitiesResponse
     */
    public ShowNetworkIpAvailabilitiesResponse showNetworkIpAvailabilities(ShowNetworkIpAvailabilitiesRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.showNetworkIpAvailabilities);
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
     * @param ShowNetworkIpAvailabilitiesRequest 请求对象
     * @return SyncInvoker<ShowNetworkIpAvailabilitiesRequest, ShowNetworkIpAvailabilitiesResponse>
     */
    public SyncInvoker<ShowNetworkIpAvailabilitiesRequest, ShowNetworkIpAvailabilitiesResponse> showNetworkIpAvailabilitiesInvoker(
        ShowNetworkIpAvailabilitiesRequest request) {
        return new SyncInvoker<ShowNetworkIpAvailabilitiesRequest, ShowNetworkIpAvailabilitiesResponse>(request,
            VpcMeta.showNetworkIpAvailabilities, hcClient);
    }

    /**
     * 查询私有IP
     *
     * 指定ID查询私有IP。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPrivateipRequest 请求对象
     * @return ShowPrivateipResponse
     */
    public ShowPrivateipResponse showPrivateip(ShowPrivateipRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.showPrivateip);
    }

    /**
     * 查询私有IP
     *
     * 指定ID查询私有IP。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPrivateipRequest 请求对象
     * @return SyncInvoker<ShowPrivateipRequest, ShowPrivateipResponse>
     */
    public SyncInvoker<ShowPrivateipRequest, ShowPrivateipResponse> showPrivateipInvoker(ShowPrivateipRequest request) {
        return new SyncInvoker<ShowPrivateipRequest, ShowPrivateipResponse>(request, VpcMeta.showPrivateip, hcClient);
    }

    /**
     * 路由器添加接口
     *
     * 添加路由器接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param NeutronAddRouterInterfaceRequest 请求对象
     * @return NeutronAddRouterInterfaceResponse
     */
    public NeutronAddRouterInterfaceResponse neutronAddRouterInterface(NeutronAddRouterInterfaceRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.neutronAddRouterInterface);
    }

    /**
     * 路由器添加接口
     *
     * 添加路由器接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param NeutronAddRouterInterfaceRequest 请求对象
     * @return SyncInvoker<NeutronAddRouterInterfaceRequest, NeutronAddRouterInterfaceResponse>
     */
    public SyncInvoker<NeutronAddRouterInterfaceRequest, NeutronAddRouterInterfaceResponse> neutronAddRouterInterfaceInvoker(
        NeutronAddRouterInterfaceRequest request) {
        return new SyncInvoker<NeutronAddRouterInterfaceRequest, NeutronAddRouterInterfaceResponse>(request,
            VpcMeta.neutronAddRouterInterface, hcClient);
    }

    /**
     * 创建网络
     *
     * 创建网络
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param NeutronCreateNetworkRequest 请求对象
     * @return NeutronCreateNetworkResponse
     */
    public NeutronCreateNetworkResponse neutronCreateNetwork(NeutronCreateNetworkRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.neutronCreateNetwork);
    }

    /**
     * 创建网络
     *
     * 创建网络
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param NeutronCreateNetworkRequest 请求对象
     * @return SyncInvoker<NeutronCreateNetworkRequest, NeutronCreateNetworkResponse>
     */
    public SyncInvoker<NeutronCreateNetworkRequest, NeutronCreateNetworkResponse> neutronCreateNetworkInvoker(
        NeutronCreateNetworkRequest request) {
        return new SyncInvoker<NeutronCreateNetworkRequest, NeutronCreateNetworkResponse>(request,
            VpcMeta.neutronCreateNetwork, hcClient);
    }

    /**
     * 创建端口
     *
     * 创建端口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param NeutronCreatePortRequest 请求对象
     * @return NeutronCreatePortResponse
     */
    public NeutronCreatePortResponse neutronCreatePort(NeutronCreatePortRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.neutronCreatePort);
    }

    /**
     * 创建端口
     *
     * 创建端口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param NeutronCreatePortRequest 请求对象
     * @return SyncInvoker<NeutronCreatePortRequest, NeutronCreatePortResponse>
     */
    public SyncInvoker<NeutronCreatePortRequest, NeutronCreatePortResponse> neutronCreatePortInvoker(
        NeutronCreatePortRequest request) {
        return new SyncInvoker<NeutronCreatePortRequest, NeutronCreatePortResponse>(request, VpcMeta.neutronCreatePort,
            hcClient);
    }

    /**
     * 创建路由器
     *
     * 创建路由器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param NeutronCreateRouterRequest 请求对象
     * @return NeutronCreateRouterResponse
     */
    public NeutronCreateRouterResponse neutronCreateRouter(NeutronCreateRouterRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.neutronCreateRouter);
    }

    /**
     * 创建路由器
     *
     * 创建路由器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param NeutronCreateRouterRequest 请求对象
     * @return SyncInvoker<NeutronCreateRouterRequest, NeutronCreateRouterResponse>
     */
    public SyncInvoker<NeutronCreateRouterRequest, NeutronCreateRouterResponse> neutronCreateRouterInvoker(
        NeutronCreateRouterRequest request) {
        return new SyncInvoker<NeutronCreateRouterRequest, NeutronCreateRouterResponse>(request,
            VpcMeta.neutronCreateRouter, hcClient);
    }

    /**
     * 创建安全组
     *
     * 创建安全组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param NeutronCreateSecurityGroupRequest 请求对象
     * @return NeutronCreateSecurityGroupResponse
     */
    public NeutronCreateSecurityGroupResponse neutronCreateSecurityGroup(NeutronCreateSecurityGroupRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.neutronCreateSecurityGroup);
    }

    /**
     * 创建安全组
     *
     * 创建安全组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param NeutronCreateSecurityGroupRequest 请求对象
     * @return SyncInvoker<NeutronCreateSecurityGroupRequest, NeutronCreateSecurityGroupResponse>
     */
    public SyncInvoker<NeutronCreateSecurityGroupRequest, NeutronCreateSecurityGroupResponse> neutronCreateSecurityGroupInvoker(
        NeutronCreateSecurityGroupRequest request) {
        return new SyncInvoker<NeutronCreateSecurityGroupRequest, NeutronCreateSecurityGroupResponse>(request,
            VpcMeta.neutronCreateSecurityGroup, hcClient);
    }

    /**
     * 创建安全组规则
     *
     * 创建安全组规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param NeutronCreateSecurityGroupRuleRequest 请求对象
     * @return NeutronCreateSecurityGroupRuleResponse
     */
    public NeutronCreateSecurityGroupRuleResponse neutronCreateSecurityGroupRule(
        NeutronCreateSecurityGroupRuleRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.neutronCreateSecurityGroupRule);
    }

    /**
     * 创建安全组规则
     *
     * 创建安全组规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param NeutronCreateSecurityGroupRuleRequest 请求对象
     * @return SyncInvoker<NeutronCreateSecurityGroupRuleRequest, NeutronCreateSecurityGroupRuleResponse>
     */
    public SyncInvoker<NeutronCreateSecurityGroupRuleRequest, NeutronCreateSecurityGroupRuleResponse> neutronCreateSecurityGroupRuleInvoker(
        NeutronCreateSecurityGroupRuleRequest request) {
        return new SyncInvoker<NeutronCreateSecurityGroupRuleRequest, NeutronCreateSecurityGroupRuleResponse>(request,
            VpcMeta.neutronCreateSecurityGroupRule, hcClient);
    }

    /**
     * 创建子网
     *
     * 创建子网。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param NeutronCreateSubnetRequest 请求对象
     * @return NeutronCreateSubnetResponse
     */
    public NeutronCreateSubnetResponse neutronCreateSubnet(NeutronCreateSubnetRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.neutronCreateSubnet);
    }

    /**
     * 创建子网
     *
     * 创建子网。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param NeutronCreateSubnetRequest 请求对象
     * @return SyncInvoker<NeutronCreateSubnetRequest, NeutronCreateSubnetResponse>
     */
    public SyncInvoker<NeutronCreateSubnetRequest, NeutronCreateSubnetResponse> neutronCreateSubnetInvoker(
        NeutronCreateSubnetRequest request) {
        return new SyncInvoker<NeutronCreateSubnetRequest, NeutronCreateSubnetResponse>(request,
            VpcMeta.neutronCreateSubnet, hcClient);
    }

    /**
     * 删除网络
     *
     * 删除网络
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param NeutronDeleteNetworkRequest 请求对象
     * @return NeutronDeleteNetworkResponse
     */
    public NeutronDeleteNetworkResponse neutronDeleteNetwork(NeutronDeleteNetworkRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.neutronDeleteNetwork);
    }

    /**
     * 删除网络
     *
     * 删除网络
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param NeutronDeleteNetworkRequest 请求对象
     * @return SyncInvoker<NeutronDeleteNetworkRequest, NeutronDeleteNetworkResponse>
     */
    public SyncInvoker<NeutronDeleteNetworkRequest, NeutronDeleteNetworkResponse> neutronDeleteNetworkInvoker(
        NeutronDeleteNetworkRequest request) {
        return new SyncInvoker<NeutronDeleteNetworkRequest, NeutronDeleteNetworkResponse>(request,
            VpcMeta.neutronDeleteNetwork, hcClient);
    }

    /**
     * 删除端口
     *
     * 删除端口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param NeutronDeletePortRequest 请求对象
     * @return NeutronDeletePortResponse
     */
    public NeutronDeletePortResponse neutronDeletePort(NeutronDeletePortRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.neutronDeletePort);
    }

    /**
     * 删除端口
     *
     * 删除端口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param NeutronDeletePortRequest 请求对象
     * @return SyncInvoker<NeutronDeletePortRequest, NeutronDeletePortResponse>
     */
    public SyncInvoker<NeutronDeletePortRequest, NeutronDeletePortResponse> neutronDeletePortInvoker(
        NeutronDeletePortRequest request) {
        return new SyncInvoker<NeutronDeletePortRequest, NeutronDeletePortResponse>(request, VpcMeta.neutronDeletePort,
            hcClient);
    }

    /**
     * 删除路由器
     *
     * 删除路由器
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param NeutronDeleteRouterRequest 请求对象
     * @return NeutronDeleteRouterResponse
     */
    public NeutronDeleteRouterResponse neutronDeleteRouter(NeutronDeleteRouterRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.neutronDeleteRouter);
    }

    /**
     * 删除路由器
     *
     * 删除路由器
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param NeutronDeleteRouterRequest 请求对象
     * @return SyncInvoker<NeutronDeleteRouterRequest, NeutronDeleteRouterResponse>
     */
    public SyncInvoker<NeutronDeleteRouterRequest, NeutronDeleteRouterResponse> neutronDeleteRouterInvoker(
        NeutronDeleteRouterRequest request) {
        return new SyncInvoker<NeutronDeleteRouterRequest, NeutronDeleteRouterResponse>(request,
            VpcMeta.neutronDeleteRouter, hcClient);
    }

    /**
     * 删除安全组
     *
     * 删除安全组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param NeutronDeleteSecurityGroupRequest 请求对象
     * @return NeutronDeleteSecurityGroupResponse
     */
    public NeutronDeleteSecurityGroupResponse neutronDeleteSecurityGroup(NeutronDeleteSecurityGroupRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.neutronDeleteSecurityGroup);
    }

    /**
     * 删除安全组
     *
     * 删除安全组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param NeutronDeleteSecurityGroupRequest 请求对象
     * @return SyncInvoker<NeutronDeleteSecurityGroupRequest, NeutronDeleteSecurityGroupResponse>
     */
    public SyncInvoker<NeutronDeleteSecurityGroupRequest, NeutronDeleteSecurityGroupResponse> neutronDeleteSecurityGroupInvoker(
        NeutronDeleteSecurityGroupRequest request) {
        return new SyncInvoker<NeutronDeleteSecurityGroupRequest, NeutronDeleteSecurityGroupResponse>(request,
            VpcMeta.neutronDeleteSecurityGroup, hcClient);
    }

    /**
     * 删除安全组规则
     *
     * 删除安全组规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param NeutronDeleteSecurityGroupRuleRequest 请求对象
     * @return NeutronDeleteSecurityGroupRuleResponse
     */
    public NeutronDeleteSecurityGroupRuleResponse neutronDeleteSecurityGroupRule(
        NeutronDeleteSecurityGroupRuleRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.neutronDeleteSecurityGroupRule);
    }

    /**
     * 删除安全组规则
     *
     * 删除安全组规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param NeutronDeleteSecurityGroupRuleRequest 请求对象
     * @return SyncInvoker<NeutronDeleteSecurityGroupRuleRequest, NeutronDeleteSecurityGroupRuleResponse>
     */
    public SyncInvoker<NeutronDeleteSecurityGroupRuleRequest, NeutronDeleteSecurityGroupRuleResponse> neutronDeleteSecurityGroupRuleInvoker(
        NeutronDeleteSecurityGroupRuleRequest request) {
        return new SyncInvoker<NeutronDeleteSecurityGroupRuleRequest, NeutronDeleteSecurityGroupRuleResponse>(request,
            VpcMeta.neutronDeleteSecurityGroupRule, hcClient);
    }

    /**
     * 删除子网
     *
     * 删除子网
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param NeutronDeleteSubnetRequest 请求对象
     * @return NeutronDeleteSubnetResponse
     */
    public NeutronDeleteSubnetResponse neutronDeleteSubnet(NeutronDeleteSubnetRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.neutronDeleteSubnet);
    }

    /**
     * 删除子网
     *
     * 删除子网
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param NeutronDeleteSubnetRequest 请求对象
     * @return SyncInvoker<NeutronDeleteSubnetRequest, NeutronDeleteSubnetResponse>
     */
    public SyncInvoker<NeutronDeleteSubnetRequest, NeutronDeleteSubnetResponse> neutronDeleteSubnetInvoker(
        NeutronDeleteSubnetRequest request) {
        return new SyncInvoker<NeutronDeleteSubnetRequest, NeutronDeleteSubnetResponse>(request,
            VpcMeta.neutronDeleteSubnet, hcClient);
    }

    /**
     * 查询网络列表
     *
     * 查询提交请求的租户的所有网络，单次查询最多返回2000条数据，超过2000后会返回分页标记。分页查询请参考分页查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param NeutronListNetworksRequest 请求对象
     * @return NeutronListNetworksResponse
     */
    public NeutronListNetworksResponse neutronListNetworks(NeutronListNetworksRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.neutronListNetworks);
    }

    /**
     * 查询网络列表
     *
     * 查询提交请求的租户的所有网络，单次查询最多返回2000条数据，超过2000后会返回分页标记。分页查询请参考分页查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param NeutronListNetworksRequest 请求对象
     * @return SyncInvoker<NeutronListNetworksRequest, NeutronListNetworksResponse>
     */
    public SyncInvoker<NeutronListNetworksRequest, NeutronListNetworksResponse> neutronListNetworksInvoker(
        NeutronListNetworksRequest request) {
        return new SyncInvoker<NeutronListNetworksRequest, NeutronListNetworksResponse>(request,
            VpcMeta.neutronListNetworks, hcClient);
    }

    /**
     * 查询端口列表
     *
     * 查询提交请求的租户的所有端口，单次查询最多返回2000条数据，超过2000后会返回分页标记。分页查询请参考分页查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param NeutronListPortsRequest 请求对象
     * @return NeutronListPortsResponse
     */
    public NeutronListPortsResponse neutronListPorts(NeutronListPortsRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.neutronListPorts);
    }

    /**
     * 查询端口列表
     *
     * 查询提交请求的租户的所有端口，单次查询最多返回2000条数据，超过2000后会返回分页标记。分页查询请参考分页查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param NeutronListPortsRequest 请求对象
     * @return SyncInvoker<NeutronListPortsRequest, NeutronListPortsResponse>
     */
    public SyncInvoker<NeutronListPortsRequest, NeutronListPortsResponse> neutronListPortsInvoker(
        NeutronListPortsRequest request) {
        return new SyncInvoker<NeutronListPortsRequest, NeutronListPortsResponse>(request, VpcMeta.neutronListPorts,
            hcClient);
    }

    /**
     * 查询路由器列表
     *
     * 查询提交请求的租户有权限操作的所有路由器信息，单次查询最多返回2000条数据，超过2000后会返回分页标记。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param NeutronListRoutersRequest 请求对象
     * @return NeutronListRoutersResponse
     */
    public NeutronListRoutersResponse neutronListRouters(NeutronListRoutersRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.neutronListRouters);
    }

    /**
     * 查询路由器列表
     *
     * 查询提交请求的租户有权限操作的所有路由器信息，单次查询最多返回2000条数据，超过2000后会返回分页标记。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param NeutronListRoutersRequest 请求对象
     * @return SyncInvoker<NeutronListRoutersRequest, NeutronListRoutersResponse>
     */
    public SyncInvoker<NeutronListRoutersRequest, NeutronListRoutersResponse> neutronListRoutersInvoker(
        NeutronListRoutersRequest request) {
        return new SyncInvoker<NeutronListRoutersRequest, NeutronListRoutersResponse>(request,
            VpcMeta.neutronListRouters, hcClient);
    }

    /**
     * 查询安全组规则列表
     *
     * 查询提交请求的租户有权限查看的所有安全组规则。单次查询最多返回2000条数据，超过2000后会返回分页标记。分页查询请参考分页查询
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param NeutronListSecurityGroupRulesRequest 请求对象
     * @return NeutronListSecurityGroupRulesResponse
     */
    public NeutronListSecurityGroupRulesResponse neutronListSecurityGroupRules(
        NeutronListSecurityGroupRulesRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.neutronListSecurityGroupRules);
    }

    /**
     * 查询安全组规则列表
     *
     * 查询提交请求的租户有权限查看的所有安全组规则。单次查询最多返回2000条数据，超过2000后会返回分页标记。分页查询请参考分页查询
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param NeutronListSecurityGroupRulesRequest 请求对象
     * @return SyncInvoker<NeutronListSecurityGroupRulesRequest, NeutronListSecurityGroupRulesResponse>
     */
    public SyncInvoker<NeutronListSecurityGroupRulesRequest, NeutronListSecurityGroupRulesResponse> neutronListSecurityGroupRulesInvoker(
        NeutronListSecurityGroupRulesRequest request) {
        return new SyncInvoker<NeutronListSecurityGroupRulesRequest, NeutronListSecurityGroupRulesResponse>(request,
            VpcMeta.neutronListSecurityGroupRules, hcClient);
    }

    /**
     * 查询安全组列表
     *
     * 查询提交请求租户的所有安全组，单次查询最多返回2000条数据，超过2000后会返回分页标记。分页查询请参考分页查询 。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param NeutronListSecurityGroupsRequest 请求对象
     * @return NeutronListSecurityGroupsResponse
     */
    public NeutronListSecurityGroupsResponse neutronListSecurityGroups(NeutronListSecurityGroupsRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.neutronListSecurityGroups);
    }

    /**
     * 查询安全组列表
     *
     * 查询提交请求租户的所有安全组，单次查询最多返回2000条数据，超过2000后会返回分页标记。分页查询请参考分页查询 。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param NeutronListSecurityGroupsRequest 请求对象
     * @return SyncInvoker<NeutronListSecurityGroupsRequest, NeutronListSecurityGroupsResponse>
     */
    public SyncInvoker<NeutronListSecurityGroupsRequest, NeutronListSecurityGroupsResponse> neutronListSecurityGroupsInvoker(
        NeutronListSecurityGroupsRequest request) {
        return new SyncInvoker<NeutronListSecurityGroupsRequest, NeutronListSecurityGroupsResponse>(request,
            VpcMeta.neutronListSecurityGroups, hcClient);
    }

    /**
     * 查询子网列表
     *
     * 查询提交请求租户的所有子网，单次查询最多返回2000条数据，超过2000后会返回分页标记。分页查询请参考分页查询 。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param NeutronListSubnetsRequest 请求对象
     * @return NeutronListSubnetsResponse
     */
    public NeutronListSubnetsResponse neutronListSubnets(NeutronListSubnetsRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.neutronListSubnets);
    }

    /**
     * 查询子网列表
     *
     * 查询提交请求租户的所有子网，单次查询最多返回2000条数据，超过2000后会返回分页标记。分页查询请参考分页查询 。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param NeutronListSubnetsRequest 请求对象
     * @return SyncInvoker<NeutronListSubnetsRequest, NeutronListSubnetsResponse>
     */
    public SyncInvoker<NeutronListSubnetsRequest, NeutronListSubnetsResponse> neutronListSubnetsInvoker(
        NeutronListSubnetsRequest request) {
        return new SyncInvoker<NeutronListSubnetsRequest, NeutronListSubnetsResponse>(request,
            VpcMeta.neutronListSubnets, hcClient);
    }

    /**
     * 路由器删除接口
     *
     * 删除路由器接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param NeutronRemoveRouterInterfaceRequest 请求对象
     * @return NeutronRemoveRouterInterfaceResponse
     */
    public NeutronRemoveRouterInterfaceResponse neutronRemoveRouterInterface(
        NeutronRemoveRouterInterfaceRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.neutronRemoveRouterInterface);
    }

    /**
     * 路由器删除接口
     *
     * 删除路由器接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param NeutronRemoveRouterInterfaceRequest 请求对象
     * @return SyncInvoker<NeutronRemoveRouterInterfaceRequest, NeutronRemoveRouterInterfaceResponse>
     */
    public SyncInvoker<NeutronRemoveRouterInterfaceRequest, NeutronRemoveRouterInterfaceResponse> neutronRemoveRouterInterfaceInvoker(
        NeutronRemoveRouterInterfaceRequest request) {
        return new SyncInvoker<NeutronRemoveRouterInterfaceRequest, NeutronRemoveRouterInterfaceResponse>(request,
            VpcMeta.neutronRemoveRouterInterface, hcClient);
    }

    /**
     * 查询网络
     *
     * 查询指定的网络详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param NeutronShowNetworkRequest 请求对象
     * @return NeutronShowNetworkResponse
     */
    public NeutronShowNetworkResponse neutronShowNetwork(NeutronShowNetworkRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.neutronShowNetwork);
    }

    /**
     * 查询网络
     *
     * 查询指定的网络详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param NeutronShowNetworkRequest 请求对象
     * @return SyncInvoker<NeutronShowNetworkRequest, NeutronShowNetworkResponse>
     */
    public SyncInvoker<NeutronShowNetworkRequest, NeutronShowNetworkResponse> neutronShowNetworkInvoker(
        NeutronShowNetworkRequest request) {
        return new SyncInvoker<NeutronShowNetworkRequest, NeutronShowNetworkResponse>(request,
            VpcMeta.neutronShowNetwork, hcClient);
    }

    /**
     * 查询端口
     *
     * 查询端口详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param NeutronShowPortRequest 请求对象
     * @return NeutronShowPortResponse
     */
    public NeutronShowPortResponse neutronShowPort(NeutronShowPortRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.neutronShowPort);
    }

    /**
     * 查询端口
     *
     * 查询端口详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param NeutronShowPortRequest 请求对象
     * @return SyncInvoker<NeutronShowPortRequest, NeutronShowPortResponse>
     */
    public SyncInvoker<NeutronShowPortRequest, NeutronShowPortResponse> neutronShowPortInvoker(
        NeutronShowPortRequest request) {
        return new SyncInvoker<NeutronShowPortRequest, NeutronShowPortResponse>(request, VpcMeta.neutronShowPort,
            hcClient);
    }

    /**
     * 查询路由器
     *
     * 查询路由器详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param NeutronShowRouterRequest 请求对象
     * @return NeutronShowRouterResponse
     */
    public NeutronShowRouterResponse neutronShowRouter(NeutronShowRouterRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.neutronShowRouter);
    }

    /**
     * 查询路由器
     *
     * 查询路由器详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param NeutronShowRouterRequest 请求对象
     * @return SyncInvoker<NeutronShowRouterRequest, NeutronShowRouterResponse>
     */
    public SyncInvoker<NeutronShowRouterRequest, NeutronShowRouterResponse> neutronShowRouterInvoker(
        NeutronShowRouterRequest request) {
        return new SyncInvoker<NeutronShowRouterRequest, NeutronShowRouterResponse>(request, VpcMeta.neutronShowRouter,
            hcClient);
    }

    /**
     * 查询安全组
     *
     * 查询安全组详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param NeutronShowSecurityGroupRequest 请求对象
     * @return NeutronShowSecurityGroupResponse
     */
    public NeutronShowSecurityGroupResponse neutronShowSecurityGroup(NeutronShowSecurityGroupRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.neutronShowSecurityGroup);
    }

    /**
     * 查询安全组
     *
     * 查询安全组详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param NeutronShowSecurityGroupRequest 请求对象
     * @return SyncInvoker<NeutronShowSecurityGroupRequest, NeutronShowSecurityGroupResponse>
     */
    public SyncInvoker<NeutronShowSecurityGroupRequest, NeutronShowSecurityGroupResponse> neutronShowSecurityGroupInvoker(
        NeutronShowSecurityGroupRequest request) {
        return new SyncInvoker<NeutronShowSecurityGroupRequest, NeutronShowSecurityGroupResponse>(request,
            VpcMeta.neutronShowSecurityGroup, hcClient);
    }

    /**
     * 查询安全组规则
     *
     * 查询安全组规则详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param NeutronShowSecurityGroupRuleRequest 请求对象
     * @return NeutronShowSecurityGroupRuleResponse
     */
    public NeutronShowSecurityGroupRuleResponse neutronShowSecurityGroupRule(
        NeutronShowSecurityGroupRuleRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.neutronShowSecurityGroupRule);
    }

    /**
     * 查询安全组规则
     *
     * 查询安全组规则详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param NeutronShowSecurityGroupRuleRequest 请求对象
     * @return SyncInvoker<NeutronShowSecurityGroupRuleRequest, NeutronShowSecurityGroupRuleResponse>
     */
    public SyncInvoker<NeutronShowSecurityGroupRuleRequest, NeutronShowSecurityGroupRuleResponse> neutronShowSecurityGroupRuleInvoker(
        NeutronShowSecurityGroupRuleRequest request) {
        return new SyncInvoker<NeutronShowSecurityGroupRuleRequest, NeutronShowSecurityGroupRuleResponse>(request,
            VpcMeta.neutronShowSecurityGroupRule, hcClient);
    }

    /**
     * 查询子网
     *
     * 查询子网详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param NeutronShowSubnetRequest 请求对象
     * @return NeutronShowSubnetResponse
     */
    public NeutronShowSubnetResponse neutronShowSubnet(NeutronShowSubnetRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.neutronShowSubnet);
    }

    /**
     * 查询子网
     *
     * 查询子网详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param NeutronShowSubnetRequest 请求对象
     * @return SyncInvoker<NeutronShowSubnetRequest, NeutronShowSubnetResponse>
     */
    public SyncInvoker<NeutronShowSubnetRequest, NeutronShowSubnetResponse> neutronShowSubnetInvoker(
        NeutronShowSubnetRequest request) {
        return new SyncInvoker<NeutronShowSubnetRequest, NeutronShowSubnetResponse>(request, VpcMeta.neutronShowSubnet,
            hcClient);
    }

    /**
     * 更新网络
     *
     * 更新网络
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param NeutronUpdateNetworkRequest 请求对象
     * @return NeutronUpdateNetworkResponse
     */
    public NeutronUpdateNetworkResponse neutronUpdateNetwork(NeutronUpdateNetworkRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.neutronUpdateNetwork);
    }

    /**
     * 更新网络
     *
     * 更新网络
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param NeutronUpdateNetworkRequest 请求对象
     * @return SyncInvoker<NeutronUpdateNetworkRequest, NeutronUpdateNetworkResponse>
     */
    public SyncInvoker<NeutronUpdateNetworkRequest, NeutronUpdateNetworkResponse> neutronUpdateNetworkInvoker(
        NeutronUpdateNetworkRequest request) {
        return new SyncInvoker<NeutronUpdateNetworkRequest, NeutronUpdateNetworkResponse>(request,
            VpcMeta.neutronUpdateNetwork, hcClient);
    }

    /**
     * 更新端口
     *
     * 更新端口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param NeutronUpdatePortRequest 请求对象
     * @return NeutronUpdatePortResponse
     */
    public NeutronUpdatePortResponse neutronUpdatePort(NeutronUpdatePortRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.neutronUpdatePort);
    }

    /**
     * 更新端口
     *
     * 更新端口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param NeutronUpdatePortRequest 请求对象
     * @return SyncInvoker<NeutronUpdatePortRequest, NeutronUpdatePortResponse>
     */
    public SyncInvoker<NeutronUpdatePortRequest, NeutronUpdatePortResponse> neutronUpdatePortInvoker(
        NeutronUpdatePortRequest request) {
        return new SyncInvoker<NeutronUpdatePortRequest, NeutronUpdatePortResponse>(request, VpcMeta.neutronUpdatePort,
            hcClient);
    }

    /**
     * 更新路由器
     *
     * 更新路由器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param NeutronUpdateRouterRequest 请求对象
     * @return NeutronUpdateRouterResponse
     */
    public NeutronUpdateRouterResponse neutronUpdateRouter(NeutronUpdateRouterRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.neutronUpdateRouter);
    }

    /**
     * 更新路由器
     *
     * 更新路由器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param NeutronUpdateRouterRequest 请求对象
     * @return SyncInvoker<NeutronUpdateRouterRequest, NeutronUpdateRouterResponse>
     */
    public SyncInvoker<NeutronUpdateRouterRequest, NeutronUpdateRouterResponse> neutronUpdateRouterInvoker(
        NeutronUpdateRouterRequest request) {
        return new SyncInvoker<NeutronUpdateRouterRequest, NeutronUpdateRouterResponse>(request,
            VpcMeta.neutronUpdateRouter, hcClient);
    }

    /**
     * 更新安全组
     *
     * 更新安全组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param NeutronUpdateSecurityGroupRequest 请求对象
     * @return NeutronUpdateSecurityGroupResponse
     */
    public NeutronUpdateSecurityGroupResponse neutronUpdateSecurityGroup(NeutronUpdateSecurityGroupRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.neutronUpdateSecurityGroup);
    }

    /**
     * 更新安全组
     *
     * 更新安全组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param NeutronUpdateSecurityGroupRequest 请求对象
     * @return SyncInvoker<NeutronUpdateSecurityGroupRequest, NeutronUpdateSecurityGroupResponse>
     */
    public SyncInvoker<NeutronUpdateSecurityGroupRequest, NeutronUpdateSecurityGroupResponse> neutronUpdateSecurityGroupInvoker(
        NeutronUpdateSecurityGroupRequest request) {
        return new SyncInvoker<NeutronUpdateSecurityGroupRequest, NeutronUpdateSecurityGroupResponse>(request,
            VpcMeta.neutronUpdateSecurityGroup, hcClient);
    }

    /**
     * 更新子网
     *
     * 更新子网
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param NeutronUpdateSubnetRequest 请求对象
     * @return NeutronUpdateSubnetResponse
     */
    public NeutronUpdateSubnetResponse neutronUpdateSubnet(NeutronUpdateSubnetRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.neutronUpdateSubnet);
    }

    /**
     * 更新子网
     *
     * 更新子网
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param NeutronUpdateSubnetRequest 请求对象
     * @return SyncInvoker<NeutronUpdateSubnetRequest, NeutronUpdateSubnetResponse>
     */
    public SyncInvoker<NeutronUpdateSubnetRequest, NeutronUpdateSubnetResponse> neutronUpdateSubnetInvoker(
        NeutronUpdateSubnetRequest request) {
        return new SyncInvoker<NeutronUpdateSubnetRequest, NeutronUpdateSubnetResponse>(request,
            VpcMeta.neutronUpdateSubnet, hcClient);
    }

    /**
     * 插入网络ACL规则
     *
     * 插入一条网络ACL规则到某一网络ACL策略中。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param NeutronAddFirewallRuleRequest 请求对象
     * @return NeutronAddFirewallRuleResponse
     */
    public NeutronAddFirewallRuleResponse neutronAddFirewallRule(NeutronAddFirewallRuleRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.neutronAddFirewallRule);
    }

    /**
     * 插入网络ACL规则
     *
     * 插入一条网络ACL规则到某一网络ACL策略中。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param NeutronAddFirewallRuleRequest 请求对象
     * @return SyncInvoker<NeutronAddFirewallRuleRequest, NeutronAddFirewallRuleResponse>
     */
    public SyncInvoker<NeutronAddFirewallRuleRequest, NeutronAddFirewallRuleResponse> neutronAddFirewallRuleInvoker(
        NeutronAddFirewallRuleRequest request) {
        return new SyncInvoker<NeutronAddFirewallRuleRequest, NeutronAddFirewallRuleResponse>(request,
            VpcMeta.neutronAddFirewallRule, hcClient);
    }

    /**
     * 创建网络ACL组
     *
     * 创建网络ACL组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param NeutronCreateFirewallGroupRequest 请求对象
     * @return NeutronCreateFirewallGroupResponse
     */
    public NeutronCreateFirewallGroupResponse neutronCreateFirewallGroup(NeutronCreateFirewallGroupRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.neutronCreateFirewallGroup);
    }

    /**
     * 创建网络ACL组
     *
     * 创建网络ACL组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param NeutronCreateFirewallGroupRequest 请求对象
     * @return SyncInvoker<NeutronCreateFirewallGroupRequest, NeutronCreateFirewallGroupResponse>
     */
    public SyncInvoker<NeutronCreateFirewallGroupRequest, NeutronCreateFirewallGroupResponse> neutronCreateFirewallGroupInvoker(
        NeutronCreateFirewallGroupRequest request) {
        return new SyncInvoker<NeutronCreateFirewallGroupRequest, NeutronCreateFirewallGroupResponse>(request,
            VpcMeta.neutronCreateFirewallGroup, hcClient);
    }

    /**
     * 创建网络ACL策略
     *
     * 创建网络ACL策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param NeutronCreateFirewallPolicyRequest 请求对象
     * @return NeutronCreateFirewallPolicyResponse
     */
    public NeutronCreateFirewallPolicyResponse neutronCreateFirewallPolicy(NeutronCreateFirewallPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.neutronCreateFirewallPolicy);
    }

    /**
     * 创建网络ACL策略
     *
     * 创建网络ACL策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param NeutronCreateFirewallPolicyRequest 请求对象
     * @return SyncInvoker<NeutronCreateFirewallPolicyRequest, NeutronCreateFirewallPolicyResponse>
     */
    public SyncInvoker<NeutronCreateFirewallPolicyRequest, NeutronCreateFirewallPolicyResponse> neutronCreateFirewallPolicyInvoker(
        NeutronCreateFirewallPolicyRequest request) {
        return new SyncInvoker<NeutronCreateFirewallPolicyRequest, NeutronCreateFirewallPolicyResponse>(request,
            VpcMeta.neutronCreateFirewallPolicy, hcClient);
    }

    /**
     * 创建网络ACL规则
     *
     * 创建网络ACL规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param NeutronCreateFirewallRuleRequest 请求对象
     * @return NeutronCreateFirewallRuleResponse
     */
    public NeutronCreateFirewallRuleResponse neutronCreateFirewallRule(NeutronCreateFirewallRuleRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.neutronCreateFirewallRule);
    }

    /**
     * 创建网络ACL规则
     *
     * 创建网络ACL规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param NeutronCreateFirewallRuleRequest 请求对象
     * @return SyncInvoker<NeutronCreateFirewallRuleRequest, NeutronCreateFirewallRuleResponse>
     */
    public SyncInvoker<NeutronCreateFirewallRuleRequest, NeutronCreateFirewallRuleResponse> neutronCreateFirewallRuleInvoker(
        NeutronCreateFirewallRuleRequest request) {
        return new SyncInvoker<NeutronCreateFirewallRuleRequest, NeutronCreateFirewallRuleResponse>(request,
            VpcMeta.neutronCreateFirewallRule, hcClient);
    }

    /**
     * 删除网络ACL组
     *
     * 删除网络ACL组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param NeutronDeleteFirewallGroupRequest 请求对象
     * @return NeutronDeleteFirewallGroupResponse
     */
    public NeutronDeleteFirewallGroupResponse neutronDeleteFirewallGroup(NeutronDeleteFirewallGroupRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.neutronDeleteFirewallGroup);
    }

    /**
     * 删除网络ACL组
     *
     * 删除网络ACL组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param NeutronDeleteFirewallGroupRequest 请求对象
     * @return SyncInvoker<NeutronDeleteFirewallGroupRequest, NeutronDeleteFirewallGroupResponse>
     */
    public SyncInvoker<NeutronDeleteFirewallGroupRequest, NeutronDeleteFirewallGroupResponse> neutronDeleteFirewallGroupInvoker(
        NeutronDeleteFirewallGroupRequest request) {
        return new SyncInvoker<NeutronDeleteFirewallGroupRequest, NeutronDeleteFirewallGroupResponse>(request,
            VpcMeta.neutronDeleteFirewallGroup, hcClient);
    }

    /**
     * 删除网络ACL策略
     *
     * 删除网络ACL策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param NeutronDeleteFirewallPolicyRequest 请求对象
     * @return NeutronDeleteFirewallPolicyResponse
     */
    public NeutronDeleteFirewallPolicyResponse neutronDeleteFirewallPolicy(NeutronDeleteFirewallPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.neutronDeleteFirewallPolicy);
    }

    /**
     * 删除网络ACL策略
     *
     * 删除网络ACL策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param NeutronDeleteFirewallPolicyRequest 请求对象
     * @return SyncInvoker<NeutronDeleteFirewallPolicyRequest, NeutronDeleteFirewallPolicyResponse>
     */
    public SyncInvoker<NeutronDeleteFirewallPolicyRequest, NeutronDeleteFirewallPolicyResponse> neutronDeleteFirewallPolicyInvoker(
        NeutronDeleteFirewallPolicyRequest request) {
        return new SyncInvoker<NeutronDeleteFirewallPolicyRequest, NeutronDeleteFirewallPolicyResponse>(request,
            VpcMeta.neutronDeleteFirewallPolicy, hcClient);
    }

    /**
     * 删除网络ACL规则
     *
     * 删除网络ACL规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param NeutronDeleteFirewallRuleRequest 请求对象
     * @return NeutronDeleteFirewallRuleResponse
     */
    public NeutronDeleteFirewallRuleResponse neutronDeleteFirewallRule(NeutronDeleteFirewallRuleRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.neutronDeleteFirewallRule);
    }

    /**
     * 删除网络ACL规则
     *
     * 删除网络ACL规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param NeutronDeleteFirewallRuleRequest 请求对象
     * @return SyncInvoker<NeutronDeleteFirewallRuleRequest, NeutronDeleteFirewallRuleResponse>
     */
    public SyncInvoker<NeutronDeleteFirewallRuleRequest, NeutronDeleteFirewallRuleResponse> neutronDeleteFirewallRuleInvoker(
        NeutronDeleteFirewallRuleRequest request) {
        return new SyncInvoker<NeutronDeleteFirewallRuleRequest, NeutronDeleteFirewallRuleResponse>(request,
            VpcMeta.neutronDeleteFirewallRule, hcClient);
    }

    /**
     * 查询所有网络ACL组
     *
     * 查询提交请求的租户有权限操作的所有网络ACL组信息。单次查询最多返回2000条数据，超过2000后会返回分页标记。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param NeutronListFirewallGroupsRequest 请求对象
     * @return NeutronListFirewallGroupsResponse
     */
    public NeutronListFirewallGroupsResponse neutronListFirewallGroups(NeutronListFirewallGroupsRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.neutronListFirewallGroups);
    }

    /**
     * 查询所有网络ACL组
     *
     * 查询提交请求的租户有权限操作的所有网络ACL组信息。单次查询最多返回2000条数据，超过2000后会返回分页标记。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param NeutronListFirewallGroupsRequest 请求对象
     * @return SyncInvoker<NeutronListFirewallGroupsRequest, NeutronListFirewallGroupsResponse>
     */
    public SyncInvoker<NeutronListFirewallGroupsRequest, NeutronListFirewallGroupsResponse> neutronListFirewallGroupsInvoker(
        NeutronListFirewallGroupsRequest request) {
        return new SyncInvoker<NeutronListFirewallGroupsRequest, NeutronListFirewallGroupsResponse>(request,
            VpcMeta.neutronListFirewallGroups, hcClient);
    }

    /**
     * 查询所有网络ACL策略
     *
     * 查询提交请求的租户有权限操作的所有网络ACL策略信息。单次查询最多返回2000条数据，超过2000后会返回分页标记。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param NeutronListFirewallPoliciesRequest 请求对象
     * @return NeutronListFirewallPoliciesResponse
     */
    public NeutronListFirewallPoliciesResponse neutronListFirewallPolicies(NeutronListFirewallPoliciesRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.neutronListFirewallPolicies);
    }

    /**
     * 查询所有网络ACL策略
     *
     * 查询提交请求的租户有权限操作的所有网络ACL策略信息。单次查询最多返回2000条数据，超过2000后会返回分页标记。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param NeutronListFirewallPoliciesRequest 请求对象
     * @return SyncInvoker<NeutronListFirewallPoliciesRequest, NeutronListFirewallPoliciesResponse>
     */
    public SyncInvoker<NeutronListFirewallPoliciesRequest, NeutronListFirewallPoliciesResponse> neutronListFirewallPoliciesInvoker(
        NeutronListFirewallPoliciesRequest request) {
        return new SyncInvoker<NeutronListFirewallPoliciesRequest, NeutronListFirewallPoliciesResponse>(request,
            VpcMeta.neutronListFirewallPolicies, hcClient);
    }

    /**
     * 查询所有网络ACL规则
     *
     * 查询提交请求的租户有权限操作的所有网络ACL规则信息。单次查询最多返回2000条数据，超过2000后会返回分页标记。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param NeutronListFirewallRulesRequest 请求对象
     * @return NeutronListFirewallRulesResponse
     */
    public NeutronListFirewallRulesResponse neutronListFirewallRules(NeutronListFirewallRulesRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.neutronListFirewallRules);
    }

    /**
     * 查询所有网络ACL规则
     *
     * 查询提交请求的租户有权限操作的所有网络ACL规则信息。单次查询最多返回2000条数据，超过2000后会返回分页标记。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param NeutronListFirewallRulesRequest 请求对象
     * @return SyncInvoker<NeutronListFirewallRulesRequest, NeutronListFirewallRulesResponse>
     */
    public SyncInvoker<NeutronListFirewallRulesRequest, NeutronListFirewallRulesResponse> neutronListFirewallRulesInvoker(
        NeutronListFirewallRulesRequest request) {
        return new SyncInvoker<NeutronListFirewallRulesRequest, NeutronListFirewallRulesResponse>(request,
            VpcMeta.neutronListFirewallRules, hcClient);
    }

    /**
     * 移除网络ACL规则
     *
     * 从某一网络ACL策略中移除一条网络ACL规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param NeutronRemoveFirewallRuleRequest 请求对象
     * @return NeutronRemoveFirewallRuleResponse
     */
    public NeutronRemoveFirewallRuleResponse neutronRemoveFirewallRule(NeutronRemoveFirewallRuleRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.neutronRemoveFirewallRule);
    }

    /**
     * 移除网络ACL规则
     *
     * 从某一网络ACL策略中移除一条网络ACL规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param NeutronRemoveFirewallRuleRequest 请求对象
     * @return SyncInvoker<NeutronRemoveFirewallRuleRequest, NeutronRemoveFirewallRuleResponse>
     */
    public SyncInvoker<NeutronRemoveFirewallRuleRequest, NeutronRemoveFirewallRuleResponse> neutronRemoveFirewallRuleInvoker(
        NeutronRemoveFirewallRuleRequest request) {
        return new SyncInvoker<NeutronRemoveFirewallRuleRequest, NeutronRemoveFirewallRuleResponse>(request,
            VpcMeta.neutronRemoveFirewallRule, hcClient);
    }

    /**
     * 查询特定网络ACL组详情
     *
     * 查询特定网络ACL组详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param NeutronShowFirewallGroupRequest 请求对象
     * @return NeutronShowFirewallGroupResponse
     */
    public NeutronShowFirewallGroupResponse neutronShowFirewallGroup(NeutronShowFirewallGroupRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.neutronShowFirewallGroup);
    }

    /**
     * 查询特定网络ACL组详情
     *
     * 查询特定网络ACL组详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param NeutronShowFirewallGroupRequest 请求对象
     * @return SyncInvoker<NeutronShowFirewallGroupRequest, NeutronShowFirewallGroupResponse>
     */
    public SyncInvoker<NeutronShowFirewallGroupRequest, NeutronShowFirewallGroupResponse> neutronShowFirewallGroupInvoker(
        NeutronShowFirewallGroupRequest request) {
        return new SyncInvoker<NeutronShowFirewallGroupRequest, NeutronShowFirewallGroupResponse>(request,
            VpcMeta.neutronShowFirewallGroup, hcClient);
    }

    /**
     * 查询特定网络ACL策略详情
     *
     * 查询特定网络ACL策略详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param NeutronShowFirewallPolicyRequest 请求对象
     * @return NeutronShowFirewallPolicyResponse
     */
    public NeutronShowFirewallPolicyResponse neutronShowFirewallPolicy(NeutronShowFirewallPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.neutronShowFirewallPolicy);
    }

    /**
     * 查询特定网络ACL策略详情
     *
     * 查询特定网络ACL策略详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param NeutronShowFirewallPolicyRequest 请求对象
     * @return SyncInvoker<NeutronShowFirewallPolicyRequest, NeutronShowFirewallPolicyResponse>
     */
    public SyncInvoker<NeutronShowFirewallPolicyRequest, NeutronShowFirewallPolicyResponse> neutronShowFirewallPolicyInvoker(
        NeutronShowFirewallPolicyRequest request) {
        return new SyncInvoker<NeutronShowFirewallPolicyRequest, NeutronShowFirewallPolicyResponse>(request,
            VpcMeta.neutronShowFirewallPolicy, hcClient);
    }

    /**
     * 查询特定网络ACL规则
     *
     * 查询特定网络ACL规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param NeutronShowFirewallRuleRequest 请求对象
     * @return NeutronShowFirewallRuleResponse
     */
    public NeutronShowFirewallRuleResponse neutronShowFirewallRule(NeutronShowFirewallRuleRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.neutronShowFirewallRule);
    }

    /**
     * 查询特定网络ACL规则
     *
     * 查询特定网络ACL规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param NeutronShowFirewallRuleRequest 请求对象
     * @return SyncInvoker<NeutronShowFirewallRuleRequest, NeutronShowFirewallRuleResponse>
     */
    public SyncInvoker<NeutronShowFirewallRuleRequest, NeutronShowFirewallRuleResponse> neutronShowFirewallRuleInvoker(
        NeutronShowFirewallRuleRequest request) {
        return new SyncInvoker<NeutronShowFirewallRuleRequest, NeutronShowFirewallRuleResponse>(request,
            VpcMeta.neutronShowFirewallRule, hcClient);
    }

    /**
     * 更新网络ACL组
     *
     * 更新网络ACL组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param NeutronUpdateFirewallGroupRequest 请求对象
     * @return NeutronUpdateFirewallGroupResponse
     */
    public NeutronUpdateFirewallGroupResponse neutronUpdateFirewallGroup(NeutronUpdateFirewallGroupRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.neutronUpdateFirewallGroup);
    }

    /**
     * 更新网络ACL组
     *
     * 更新网络ACL组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param NeutronUpdateFirewallGroupRequest 请求对象
     * @return SyncInvoker<NeutronUpdateFirewallGroupRequest, NeutronUpdateFirewallGroupResponse>
     */
    public SyncInvoker<NeutronUpdateFirewallGroupRequest, NeutronUpdateFirewallGroupResponse> neutronUpdateFirewallGroupInvoker(
        NeutronUpdateFirewallGroupRequest request) {
        return new SyncInvoker<NeutronUpdateFirewallGroupRequest, NeutronUpdateFirewallGroupResponse>(request,
            VpcMeta.neutronUpdateFirewallGroup, hcClient);
    }

    /**
     * 更新网络ACL策略
     *
     * 更新网络ACL策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param NeutronUpdateFirewallPolicyRequest 请求对象
     * @return NeutronUpdateFirewallPolicyResponse
     */
    public NeutronUpdateFirewallPolicyResponse neutronUpdateFirewallPolicy(NeutronUpdateFirewallPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.neutronUpdateFirewallPolicy);
    }

    /**
     * 更新网络ACL策略
     *
     * 更新网络ACL策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param NeutronUpdateFirewallPolicyRequest 请求对象
     * @return SyncInvoker<NeutronUpdateFirewallPolicyRequest, NeutronUpdateFirewallPolicyResponse>
     */
    public SyncInvoker<NeutronUpdateFirewallPolicyRequest, NeutronUpdateFirewallPolicyResponse> neutronUpdateFirewallPolicyInvoker(
        NeutronUpdateFirewallPolicyRequest request) {
        return new SyncInvoker<NeutronUpdateFirewallPolicyRequest, NeutronUpdateFirewallPolicyResponse>(request,
            VpcMeta.neutronUpdateFirewallPolicy, hcClient);
    }

    /**
     * 更新网络ACL规则
     *
     * 更新网络ACL规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param NeutronUpdateFirewallRuleRequest 请求对象
     * @return NeutronUpdateFirewallRuleResponse
     */
    public NeutronUpdateFirewallRuleResponse neutronUpdateFirewallRule(NeutronUpdateFirewallRuleRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.neutronUpdateFirewallRule);
    }

    /**
     * 更新网络ACL规则
     *
     * 更新网络ACL规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param NeutronUpdateFirewallRuleRequest 请求对象
     * @return SyncInvoker<NeutronUpdateFirewallRuleRequest, NeutronUpdateFirewallRuleResponse>
     */
    public SyncInvoker<NeutronUpdateFirewallRuleRequest, NeutronUpdateFirewallRuleResponse> neutronUpdateFirewallRuleInvoker(
        NeutronUpdateFirewallRuleRequest request) {
        return new SyncInvoker<NeutronUpdateFirewallRuleRequest, NeutronUpdateFirewallRuleResponse>(request,
            VpcMeta.neutronUpdateFirewallRule, hcClient);
    }

    /**
     * 查询API版本信息列表
     *
     * 返回当前API所有可用的版本（仅针对OpenStack原生接口）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListApiVersionRequest 请求对象
     * @return ListApiVersionResponse
     */
    public ListApiVersionResponse listApiVersion(ListApiVersionRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.listApiVersion);
    }

    /**
     * 查询API版本信息列表
     *
     * 返回当前API所有可用的版本（仅针对OpenStack原生接口）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListApiVersionRequest 请求对象
     * @return SyncInvoker<ListApiVersionRequest, ListApiVersionResponse>
     */
    public SyncInvoker<ListApiVersionRequest, ListApiVersionResponse> listApiVersionInvoker(
        ListApiVersionRequest request) {
        return new SyncInvoker<ListApiVersionRequest, ListApiVersionResponse>(request, VpcMeta.listApiVersion,
            hcClient);
    }

    /**
     * 批量创建VPC资源标签
     *
     * 为指定的VPC资源实例批量添加标签。
     * 此接口为幂等接口：创建时如果请求体中存在重复key则报错。创建时，不允许设置重复key数据，如果数据库已存在该key，就覆盖value的值。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchCreateVpcTagsRequest 请求对象
     * @return BatchCreateVpcTagsResponse
     */
    public BatchCreateVpcTagsResponse batchCreateVpcTags(BatchCreateVpcTagsRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.batchCreateVpcTags);
    }

    /**
     * 批量创建VPC资源标签
     *
     * 为指定的VPC资源实例批量添加标签。
     * 此接口为幂等接口：创建时如果请求体中存在重复key则报错。创建时，不允许设置重复key数据，如果数据库已存在该key，就覆盖value的值。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchCreateVpcTagsRequest 请求对象
     * @return SyncInvoker<BatchCreateVpcTagsRequest, BatchCreateVpcTagsResponse>
     */
    public SyncInvoker<BatchCreateVpcTagsRequest, BatchCreateVpcTagsResponse> batchCreateVpcTagsInvoker(
        BatchCreateVpcTagsRequest request) {
        return new SyncInvoker<BatchCreateVpcTagsRequest, BatchCreateVpcTagsResponse>(request,
            VpcMeta.batchCreateVpcTags, hcClient);
    }

    /**
     * 批量删除VPC资源标签
     *
     * 为指定的VPC资源实例批量删除标签。
     * 此接口为幂等接口：删除时，如果删除的标签不存在，默认处理成功；删除时不对标签字符集范围做校验。删除时tags结构体不能缺失，key不能为空，或者空字符串。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchDeleteVpcTagsRequest 请求对象
     * @return BatchDeleteVpcTagsResponse
     */
    public BatchDeleteVpcTagsResponse batchDeleteVpcTags(BatchDeleteVpcTagsRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.batchDeleteVpcTags);
    }

    /**
     * 批量删除VPC资源标签
     *
     * 为指定的VPC资源实例批量删除标签。
     * 此接口为幂等接口：删除时，如果删除的标签不存在，默认处理成功；删除时不对标签字符集范围做校验。删除时tags结构体不能缺失，key不能为空，或者空字符串。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchDeleteVpcTagsRequest 请求对象
     * @return SyncInvoker<BatchDeleteVpcTagsRequest, BatchDeleteVpcTagsResponse>
     */
    public SyncInvoker<BatchDeleteVpcTagsRequest, BatchDeleteVpcTagsResponse> batchDeleteVpcTagsInvoker(
        BatchDeleteVpcTagsRequest request) {
        return new SyncInvoker<BatchDeleteVpcTagsRequest, BatchDeleteVpcTagsResponse>(request,
            VpcMeta.batchDeleteVpcTags, hcClient);
    }

    /**
     * 创建VPC
     *
     * 创建虚拟私有云。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateVpcRequest 请求对象
     * @return CreateVpcResponse
     */
    public CreateVpcResponse createVpc(CreateVpcRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.createVpc);
    }

    /**
     * 创建VPC
     *
     * 创建虚拟私有云。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateVpcRequest 请求对象
     * @return SyncInvoker<CreateVpcRequest, CreateVpcResponse>
     */
    public SyncInvoker<CreateVpcRequest, CreateVpcResponse> createVpcInvoker(CreateVpcRequest request) {
        return new SyncInvoker<CreateVpcRequest, CreateVpcResponse>(request, VpcMeta.createVpc, hcClient);
    }

    /**
     * 创建VPC资源标签
     *
     * 给指定VPC资源实例增加标签信息
     * 此接口为幂等接口：创建时，如果创建的标签已经存在（key相同），则覆盖。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateVpcResourceTagRequest 请求对象
     * @return CreateVpcResourceTagResponse
     */
    public CreateVpcResourceTagResponse createVpcResourceTag(CreateVpcResourceTagRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.createVpcResourceTag);
    }

    /**
     * 创建VPC资源标签
     *
     * 给指定VPC资源实例增加标签信息
     * 此接口为幂等接口：创建时，如果创建的标签已经存在（key相同），则覆盖。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateVpcResourceTagRequest 请求对象
     * @return SyncInvoker<CreateVpcResourceTagRequest, CreateVpcResourceTagResponse>
     */
    public SyncInvoker<CreateVpcResourceTagRequest, CreateVpcResourceTagResponse> createVpcResourceTagInvoker(
        CreateVpcResourceTagRequest request) {
        return new SyncInvoker<CreateVpcResourceTagRequest, CreateVpcResourceTagResponse>(request,
            VpcMeta.createVpcResourceTag, hcClient);
    }

    /**
     * 创建VPC路由
     *
     * 创建路由
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateVpcRouteRequest 请求对象
     * @return CreateVpcRouteResponse
     */
    public CreateVpcRouteResponse createVpcRoute(CreateVpcRouteRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.createVpcRoute);
    }

    /**
     * 创建VPC路由
     *
     * 创建路由
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateVpcRouteRequest 请求对象
     * @return SyncInvoker<CreateVpcRouteRequest, CreateVpcRouteResponse>
     */
    public SyncInvoker<CreateVpcRouteRequest, CreateVpcRouteResponse> createVpcRouteInvoker(
        CreateVpcRouteRequest request) {
        return new SyncInvoker<CreateVpcRouteRequest, CreateVpcRouteResponse>(request, VpcMeta.createVpcRoute,
            hcClient);
    }

    /**
     * 删除VPC
     *
     * 删除虚拟私有云。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteVpcRequest 请求对象
     * @return DeleteVpcResponse
     */
    public DeleteVpcResponse deleteVpc(DeleteVpcRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.deleteVpc);
    }

    /**
     * 删除VPC
     *
     * 删除虚拟私有云。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteVpcRequest 请求对象
     * @return SyncInvoker<DeleteVpcRequest, DeleteVpcResponse>
     */
    public SyncInvoker<DeleteVpcRequest, DeleteVpcResponse> deleteVpcInvoker(DeleteVpcRequest request) {
        return new SyncInvoker<DeleteVpcRequest, DeleteVpcResponse>(request, VpcMeta.deleteVpc, hcClient);
    }

    /**
     * 删除VPC路由
     *
     * 删除路由
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteVpcRouteRequest 请求对象
     * @return DeleteVpcRouteResponse
     */
    public DeleteVpcRouteResponse deleteVpcRoute(DeleteVpcRouteRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.deleteVpcRoute);
    }

    /**
     * 删除VPC路由
     *
     * 删除路由
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteVpcRouteRequest 请求对象
     * @return SyncInvoker<DeleteVpcRouteRequest, DeleteVpcRouteResponse>
     */
    public SyncInvoker<DeleteVpcRouteRequest, DeleteVpcRouteResponse> deleteVpcRouteInvoker(
        DeleteVpcRouteRequest request) {
        return new SyncInvoker<DeleteVpcRouteRequest, DeleteVpcRouteResponse>(request, VpcMeta.deleteVpcRoute,
            hcClient);
    }

    /**
     * 删除VPC资源标签
     *
     * 删除指定VPC资源实例的标签信息
     * 该接口为幂等接口：删除的key不存在报404，Key不能为空或者空字符串
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteVpcTagRequest 请求对象
     * @return DeleteVpcTagResponse
     */
    public DeleteVpcTagResponse deleteVpcTag(DeleteVpcTagRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.deleteVpcTag);
    }

    /**
     * 删除VPC资源标签
     *
     * 删除指定VPC资源实例的标签信息
     * 该接口为幂等接口：删除的key不存在报404，Key不能为空或者空字符串
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteVpcTagRequest 请求对象
     * @return SyncInvoker<DeleteVpcTagRequest, DeleteVpcTagResponse>
     */
    public SyncInvoker<DeleteVpcTagRequest, DeleteVpcTagResponse> deleteVpcTagInvoker(DeleteVpcTagRequest request) {
        return new SyncInvoker<DeleteVpcTagRequest, DeleteVpcTagResponse>(request, VpcMeta.deleteVpcTag, hcClient);
    }

    /**
     * 查询VPC路由列表
     *
     * 查询提交请求的租户的所有路由列表，并根据过滤条件进行过滤。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListVpcRoutesRequest 请求对象
     * @return ListVpcRoutesResponse
     */
    public ListVpcRoutesResponse listVpcRoutes(ListVpcRoutesRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.listVpcRoutes);
    }

    /**
     * 查询VPC路由列表
     *
     * 查询提交请求的租户的所有路由列表，并根据过滤条件进行过滤。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListVpcRoutesRequest 请求对象
     * @return SyncInvoker<ListVpcRoutesRequest, ListVpcRoutesResponse>
     */
    public SyncInvoker<ListVpcRoutesRequest, ListVpcRoutesResponse> listVpcRoutesInvoker(ListVpcRoutesRequest request) {
        return new SyncInvoker<ListVpcRoutesRequest, ListVpcRoutesResponse>(request, VpcMeta.listVpcRoutes, hcClient);
    }

    /**
     * 查询VPC项目标签
     *
     * 查询租户在指定区域和实例类型的所有标签集合
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListVpcTagsRequest 请求对象
     * @return ListVpcTagsResponse
     */
    public ListVpcTagsResponse listVpcTags(ListVpcTagsRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.listVpcTags);
    }

    /**
     * 查询VPC项目标签
     *
     * 查询租户在指定区域和实例类型的所有标签集合
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListVpcTagsRequest 请求对象
     * @return SyncInvoker<ListVpcTagsRequest, ListVpcTagsResponse>
     */
    public SyncInvoker<ListVpcTagsRequest, ListVpcTagsResponse> listVpcTagsInvoker(ListVpcTagsRequest request) {
        return new SyncInvoker<ListVpcTagsRequest, ListVpcTagsResponse>(request, VpcMeta.listVpcTags, hcClient);
    }

    /**
     * 查询VPC列表
     *
     * 查询虚拟私有云列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListVpcsRequest 请求对象
     * @return ListVpcsResponse
     */
    public ListVpcsResponse listVpcs(ListVpcsRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.listVpcs);
    }

    /**
     * 查询VPC列表
     *
     * 查询虚拟私有云列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListVpcsRequest 请求对象
     * @return SyncInvoker<ListVpcsRequest, ListVpcsResponse>
     */
    public SyncInvoker<ListVpcsRequest, ListVpcsResponse> listVpcsInvoker(ListVpcsRequest request) {
        return new SyncInvoker<ListVpcsRequest, ListVpcsResponse>(request, VpcMeta.listVpcs, hcClient);
    }

    /**
     * 查询VPC资源实例
     *
     * 使用标签过滤实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListVpcsByTagsRequest 请求对象
     * @return ListVpcsByTagsResponse
     */
    public ListVpcsByTagsResponse listVpcsByTags(ListVpcsByTagsRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.listVpcsByTags);
    }

    /**
     * 查询VPC资源实例
     *
     * 使用标签过滤实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListVpcsByTagsRequest 请求对象
     * @return SyncInvoker<ListVpcsByTagsRequest, ListVpcsByTagsResponse>
     */
    public SyncInvoker<ListVpcsByTagsRequest, ListVpcsByTagsResponse> listVpcsByTagsInvoker(
        ListVpcsByTagsRequest request) {
        return new SyncInvoker<ListVpcsByTagsRequest, ListVpcsByTagsResponse>(request, VpcMeta.listVpcsByTags,
            hcClient);
    }

    /**
     * 查询VPC
     *
     * 查询虚拟私有云。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowVpcRequest 请求对象
     * @return ShowVpcResponse
     */
    public ShowVpcResponse showVpc(ShowVpcRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.showVpc);
    }

    /**
     * 查询VPC
     *
     * 查询虚拟私有云。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowVpcRequest 请求对象
     * @return SyncInvoker<ShowVpcRequest, ShowVpcResponse>
     */
    public SyncInvoker<ShowVpcRequest, ShowVpcResponse> showVpcInvoker(ShowVpcRequest request) {
        return new SyncInvoker<ShowVpcRequest, ShowVpcResponse>(request, VpcMeta.showVpc, hcClient);
    }

    /**
     * 查询VPC路由
     *
     * 查询路由详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowVpcRouteRequest 请求对象
     * @return ShowVpcRouteResponse
     */
    public ShowVpcRouteResponse showVpcRoute(ShowVpcRouteRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.showVpcRoute);
    }

    /**
     * 查询VPC路由
     *
     * 查询路由详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowVpcRouteRequest 请求对象
     * @return SyncInvoker<ShowVpcRouteRequest, ShowVpcRouteResponse>
     */
    public SyncInvoker<ShowVpcRouteRequest, ShowVpcRouteResponse> showVpcRouteInvoker(ShowVpcRouteRequest request) {
        return new SyncInvoker<ShowVpcRouteRequest, ShowVpcRouteResponse>(request, VpcMeta.showVpcRoute, hcClient);
    }

    /**
     * 查询VPC资源标签
     *
     * 查询指定VPC实例的标签信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowVpcTagsRequest 请求对象
     * @return ShowVpcTagsResponse
     */
    public ShowVpcTagsResponse showVpcTags(ShowVpcTagsRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.showVpcTags);
    }

    /**
     * 查询VPC资源标签
     *
     * 查询指定VPC实例的标签信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowVpcTagsRequest 请求对象
     * @return SyncInvoker<ShowVpcTagsRequest, ShowVpcTagsResponse>
     */
    public SyncInvoker<ShowVpcTagsRequest, ShowVpcTagsResponse> showVpcTagsInvoker(ShowVpcTagsRequest request) {
        return new SyncInvoker<ShowVpcTagsRequest, ShowVpcTagsResponse>(request, VpcMeta.showVpcTags, hcClient);
    }

    /**
     * 更新VPC
     *
     * 更新虚拟私有云。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateVpcRequest 请求对象
     * @return UpdateVpcResponse
     */
    public UpdateVpcResponse updateVpc(UpdateVpcRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.updateVpc);
    }

    /**
     * 更新VPC
     *
     * 更新虚拟私有云。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateVpcRequest 请求对象
     * @return SyncInvoker<UpdateVpcRequest, UpdateVpcResponse>
     */
    public SyncInvoker<UpdateVpcRequest, UpdateVpcResponse> updateVpcInvoker(UpdateVpcRequest request) {
        return new SyncInvoker<UpdateVpcRequest, UpdateVpcResponse>(request, VpcMeta.updateVpc, hcClient);
    }

}
