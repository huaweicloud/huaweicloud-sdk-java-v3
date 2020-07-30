package com.huaweicloud.sdk.vpc.v2;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.vpc.v2.model.*;

public class VpcClient {
    protected HcClient hcClient;

    public VpcClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<VpcClient> newBuilder() {
        return new ClientBuilder<>(VpcClient::new);
    }

    public AcceptVpcPeeringResponse acceptVpcPeering(AcceptVpcPeeringRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.acceptVpcPeering);
    }

    public CreatePortResponse createPort(CreatePortRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.createPort);
    }

    public CreateSecurityGroupResponse createSecurityGroup(CreateSecurityGroupRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.createSecurityGroup);
    }

    public CreateSecurityGroupRuleResponse createSecurityGroupRule(CreateSecurityGroupRuleRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.createSecurityGroupRule);
    }

    public CreateSubnetResponse createSubnet(CreateSubnetRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.createSubnet);
    }

    public CreateVpcPeeringResponse createVpcPeering(CreateVpcPeeringRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.createVpcPeering);
    }

    public DeletePortResponse deletePort(DeletePortRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.deletePort);
    }

    public DeleteSecurityGroupResponse deleteSecurityGroup(DeleteSecurityGroupRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.deleteSecurityGroup);
    }

    public DeleteSecurityGroupRuleResponse deleteSecurityGroupRule(DeleteSecurityGroupRuleRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.deleteSecurityGroupRule);
    }

    public DeleteSubnetResponse deleteSubnet(DeleteSubnetRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.deleteSubnet);
    }

    public DeleteVpcPeeringResponse deleteVpcPeering(DeleteVpcPeeringRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.deleteVpcPeering);
    }

    public ListPortsResponse listPorts(ListPortsRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.listPorts);
    }

    public ListSecurityGroupRulesResponse listSecurityGroupRules(ListSecurityGroupRulesRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.listSecurityGroupRules);
    }

    public ListSecurityGroupsResponse listSecurityGroups(ListSecurityGroupsRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.listSecurityGroups);
    }

    public ListSubnetsResponse listSubnets(ListSubnetsRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.listSubnets);
    }

    public ListVpcPeeringsResponse listVpcPeerings(ListVpcPeeringsRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.listVpcPeerings);
    }

    public RejectVpcPeeringResponse rejectVpcPeering(RejectVpcPeeringRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.rejectVpcPeering);
    }

    public ShowPortResponse showPort(ShowPortRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.showPort);
    }

    public ShowQuotaResponse showQuota(ShowQuotaRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.showQuota);
    }

    public ShowSecurityGroupResponse showSecurityGroup(ShowSecurityGroupRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.showSecurityGroup);
    }

    public ShowSecurityGroupRuleResponse showSecurityGroupRule(ShowSecurityGroupRuleRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.showSecurityGroupRule);
    }

    public ShowSubnetResponse showSubnet(ShowSubnetRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.showSubnet);
    }

    public ShowVpcPeeringResponse showVpcPeering(ShowVpcPeeringRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.showVpcPeering);
    }

    public UpdatePortResponse updatePort(UpdatePortRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.updatePort);
    }

    public UpdateSubnetResponse updateSubnet(UpdateSubnetRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.updateSubnet);
    }

    public UpdateVpcPeeringResponse updateVpcPeering(UpdateVpcPeeringRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.updateVpcPeering);
    }

    public CreatePrivateipResponse createPrivateip(CreatePrivateipRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.createPrivateip);
    }

    public DeletePrivateipResponse deletePrivateip(DeletePrivateipRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.deletePrivateip);
    }

    public ListPrivateipsResponse listPrivateips(ListPrivateipsRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.listPrivateips);
    }

    public ShowPrivateipResponse showPrivateip(ShowPrivateipRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.showPrivateip);
    }

    public CreateVpcResponse createVpc(CreateVpcRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.createVpc);
    }

    public CreateVpcRouteResponse createVpcRoute(CreateVpcRouteRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.createVpcRoute);
    }

    public DeleteVpcResponse deleteVpc(DeleteVpcRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.deleteVpc);
    }

    public DeleteVpcRouteResponse deleteVpcRoute(DeleteVpcRouteRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.deleteVpcRoute);
    }

    public ListVpcRoutesResponse listVpcRoutes(ListVpcRoutesRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.listVpcRoutes);
    }

    public ListVpcsResponse listVpcs(ListVpcsRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.listVpcs);
    }

    public ShowVpcResponse showVpc(ShowVpcRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.showVpc);
    }

    public ShowVpcRouteResponse showVpcRoute(ShowVpcRouteRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.showVpcRoute);
    }

    public UpdateVpcResponse updateVpc(UpdateVpcRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.updateVpc);
    }

}