package com.huaweicloud.sdk.vpc.v2;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.vpc.v2.model.AcceptVpcPeeringRequest;
import com.huaweicloud.sdk.vpc.v2.model.AcceptVpcPeeringResponse;
import com.huaweicloud.sdk.vpc.v2.model.AssociateRouteTableRequest;
import com.huaweicloud.sdk.vpc.v2.model.AssociateRouteTableResponse;
import com.huaweicloud.sdk.vpc.v2.model.BatchCreateSecurityGroupTagsRequest;
import com.huaweicloud.sdk.vpc.v2.model.BatchCreateSecurityGroupTagsRequestBody;
import com.huaweicloud.sdk.vpc.v2.model.BatchCreateSecurityGroupTagsResponse;
import com.huaweicloud.sdk.vpc.v2.model.BatchCreateSubnetTagsRequest;
import com.huaweicloud.sdk.vpc.v2.model.BatchCreateSubnetTagsRequestBody;
import com.huaweicloud.sdk.vpc.v2.model.BatchCreateSubnetTagsResponse;
import com.huaweicloud.sdk.vpc.v2.model.BatchCreateVpcTagsRequest;
import com.huaweicloud.sdk.vpc.v2.model.BatchCreateVpcTagsRequestBody;
import com.huaweicloud.sdk.vpc.v2.model.BatchCreateVpcTagsResponse;
import com.huaweicloud.sdk.vpc.v2.model.BatchDeleteSecurityGroupTagsRequest;
import com.huaweicloud.sdk.vpc.v2.model.BatchDeleteSecurityGroupTagsRequestBody;
import com.huaweicloud.sdk.vpc.v2.model.BatchDeleteSecurityGroupTagsResponse;
import com.huaweicloud.sdk.vpc.v2.model.BatchDeleteSubnetTagsRequest;
import com.huaweicloud.sdk.vpc.v2.model.BatchDeleteSubnetTagsRequestBody;
import com.huaweicloud.sdk.vpc.v2.model.BatchDeleteSubnetTagsResponse;
import com.huaweicloud.sdk.vpc.v2.model.BatchDeleteVpcTagsRequest;
import com.huaweicloud.sdk.vpc.v2.model.BatchDeleteVpcTagsRequestBody;
import com.huaweicloud.sdk.vpc.v2.model.BatchDeleteVpcTagsResponse;
import com.huaweicloud.sdk.vpc.v2.model.CreateFlowLogReqBody;
import com.huaweicloud.sdk.vpc.v2.model.CreateFlowLogRequest;
import com.huaweicloud.sdk.vpc.v2.model.CreateFlowLogResponse;
import com.huaweicloud.sdk.vpc.v2.model.CreatePortRequest;
import com.huaweicloud.sdk.vpc.v2.model.CreatePortRequestBody;
import com.huaweicloud.sdk.vpc.v2.model.CreatePortResponse;
import com.huaweicloud.sdk.vpc.v2.model.CreatePrivateipRequest;
import com.huaweicloud.sdk.vpc.v2.model.CreatePrivateipRequestBody;
import com.huaweicloud.sdk.vpc.v2.model.CreatePrivateipResponse;
import com.huaweicloud.sdk.vpc.v2.model.CreateRouteTableRequest;
import com.huaweicloud.sdk.vpc.v2.model.CreateRouteTableResponse;
import com.huaweicloud.sdk.vpc.v2.model.CreateRoutetableReqBody;
import com.huaweicloud.sdk.vpc.v2.model.CreateSecurityGroupRequest;
import com.huaweicloud.sdk.vpc.v2.model.CreateSecurityGroupRequestBody;
import com.huaweicloud.sdk.vpc.v2.model.CreateSecurityGroupResponse;
import com.huaweicloud.sdk.vpc.v2.model.CreateSecurityGroupRuleRequest;
import com.huaweicloud.sdk.vpc.v2.model.CreateSecurityGroupRuleRequestBody;
import com.huaweicloud.sdk.vpc.v2.model.CreateSecurityGroupRuleResponse;
import com.huaweicloud.sdk.vpc.v2.model.CreateSecurityGroupTagRequest;
import com.huaweicloud.sdk.vpc.v2.model.CreateSecurityGroupTagRequestBody;
import com.huaweicloud.sdk.vpc.v2.model.CreateSecurityGroupTagResponse;
import com.huaweicloud.sdk.vpc.v2.model.CreateSubnetRequest;
import com.huaweicloud.sdk.vpc.v2.model.CreateSubnetRequestBody;
import com.huaweicloud.sdk.vpc.v2.model.CreateSubnetResponse;
import com.huaweicloud.sdk.vpc.v2.model.CreateSubnetTagRequest;
import com.huaweicloud.sdk.vpc.v2.model.CreateSubnetTagRequestBody;
import com.huaweicloud.sdk.vpc.v2.model.CreateSubnetTagResponse;
import com.huaweicloud.sdk.vpc.v2.model.CreateVpcPeeringRequest;
import com.huaweicloud.sdk.vpc.v2.model.CreateVpcPeeringRequestBody;
import com.huaweicloud.sdk.vpc.v2.model.CreateVpcPeeringResponse;
import com.huaweicloud.sdk.vpc.v2.model.CreateVpcRequest;
import com.huaweicloud.sdk.vpc.v2.model.CreateVpcRequestBody;
import com.huaweicloud.sdk.vpc.v2.model.CreateVpcResourceTagRequest;
import com.huaweicloud.sdk.vpc.v2.model.CreateVpcResourceTagRequestBody;
import com.huaweicloud.sdk.vpc.v2.model.CreateVpcResourceTagResponse;
import com.huaweicloud.sdk.vpc.v2.model.CreateVpcResponse;
import com.huaweicloud.sdk.vpc.v2.model.CreateVpcRouteRequest;
import com.huaweicloud.sdk.vpc.v2.model.CreateVpcRouteRequestBody;
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
import com.huaweicloud.sdk.vpc.v2.model.DeleteSecurityGroupTagRequest;
import com.huaweicloud.sdk.vpc.v2.model.DeleteSecurityGroupTagResponse;
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
import com.huaweicloud.sdk.vpc.v2.model.ListSecurityGroupTagsRequest;
import com.huaweicloud.sdk.vpc.v2.model.ListSecurityGroupTagsResponse;
import com.huaweicloud.sdk.vpc.v2.model.ListSecurityGroupsByTagsRequest;
import com.huaweicloud.sdk.vpc.v2.model.ListSecurityGroupsByTagsRequestBody;
import com.huaweicloud.sdk.vpc.v2.model.ListSecurityGroupsByTagsResponse;
import com.huaweicloud.sdk.vpc.v2.model.ListSecurityGroupsRequest;
import com.huaweicloud.sdk.vpc.v2.model.ListSecurityGroupsResponse;
import com.huaweicloud.sdk.vpc.v2.model.ListSubnetTagsRequest;
import com.huaweicloud.sdk.vpc.v2.model.ListSubnetTagsResponse;
import com.huaweicloud.sdk.vpc.v2.model.ListSubnetsByTagsRequest;
import com.huaweicloud.sdk.vpc.v2.model.ListSubnetsByTagsRequestBody;
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
import com.huaweicloud.sdk.vpc.v2.model.ListVpcsByTagsRequestBody;
import com.huaweicloud.sdk.vpc.v2.model.ListVpcsByTagsResponse;
import com.huaweicloud.sdk.vpc.v2.model.ListVpcsRequest;
import com.huaweicloud.sdk.vpc.v2.model.ListVpcsResponse;
import com.huaweicloud.sdk.vpc.v2.model.NeutronAddFirewallRuleRequest;
import com.huaweicloud.sdk.vpc.v2.model.NeutronAddFirewallRuleResponse;
import com.huaweicloud.sdk.vpc.v2.model.NeutronAddRouterInterfaceRequest;
import com.huaweicloud.sdk.vpc.v2.model.NeutronAddRouterInterfaceResponse;
import com.huaweicloud.sdk.vpc.v2.model.NeutronCreateFirewallGroupRequest;
import com.huaweicloud.sdk.vpc.v2.model.NeutronCreateFirewallGroupRequestBody;
import com.huaweicloud.sdk.vpc.v2.model.NeutronCreateFirewallGroupResponse;
import com.huaweicloud.sdk.vpc.v2.model.NeutronCreateFirewallPolicyRequest;
import com.huaweicloud.sdk.vpc.v2.model.NeutronCreateFirewallPolicyRequestBody;
import com.huaweicloud.sdk.vpc.v2.model.NeutronCreateFirewallPolicyResponse;
import com.huaweicloud.sdk.vpc.v2.model.NeutronCreateFirewallRuleRequest;
import com.huaweicloud.sdk.vpc.v2.model.NeutronCreateFirewallRuleRequestBody;
import com.huaweicloud.sdk.vpc.v2.model.NeutronCreateFirewallRuleResponse;
import com.huaweicloud.sdk.vpc.v2.model.NeutronCreateNetworkRequest;
import com.huaweicloud.sdk.vpc.v2.model.NeutronCreateNetworkRequestBody;
import com.huaweicloud.sdk.vpc.v2.model.NeutronCreateNetworkResponse;
import com.huaweicloud.sdk.vpc.v2.model.NeutronCreatePortRequest;
import com.huaweicloud.sdk.vpc.v2.model.NeutronCreatePortRequestBody;
import com.huaweicloud.sdk.vpc.v2.model.NeutronCreatePortResponse;
import com.huaweicloud.sdk.vpc.v2.model.NeutronCreateRouterRequest;
import com.huaweicloud.sdk.vpc.v2.model.NeutronCreateRouterRequestBody;
import com.huaweicloud.sdk.vpc.v2.model.NeutronCreateRouterResponse;
import com.huaweicloud.sdk.vpc.v2.model.NeutronCreateSecurityGroupRequest;
import com.huaweicloud.sdk.vpc.v2.model.NeutronCreateSecurityGroupRequestBody;
import com.huaweicloud.sdk.vpc.v2.model.NeutronCreateSecurityGroupResponse;
import com.huaweicloud.sdk.vpc.v2.model.NeutronCreateSecurityGroupRuleRequest;
import com.huaweicloud.sdk.vpc.v2.model.NeutronCreateSecurityGroupRuleRequestBody;
import com.huaweicloud.sdk.vpc.v2.model.NeutronCreateSecurityGroupRuleResponse;
import com.huaweicloud.sdk.vpc.v2.model.NeutronCreateSubnetRequest;
import com.huaweicloud.sdk.vpc.v2.model.NeutronCreateSubnetRequestBody;
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
import com.huaweicloud.sdk.vpc.v2.model.NeutronInsertFirewallRuleRequestBody;
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
import com.huaweicloud.sdk.vpc.v2.model.NeutronRemoveFirewallRuleRequestBody;
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
import com.huaweicloud.sdk.vpc.v2.model.NeutronUpdateFirewallGroupRequestBody;
import com.huaweicloud.sdk.vpc.v2.model.NeutronUpdateFirewallGroupResponse;
import com.huaweicloud.sdk.vpc.v2.model.NeutronUpdateFirewallPolicyRequest;
import com.huaweicloud.sdk.vpc.v2.model.NeutronUpdateFirewallPolicyRequestBody;
import com.huaweicloud.sdk.vpc.v2.model.NeutronUpdateFirewallPolicyResponse;
import com.huaweicloud.sdk.vpc.v2.model.NeutronUpdateFirewallRuleRequest;
import com.huaweicloud.sdk.vpc.v2.model.NeutronUpdateFirewallRuleRequestBody;
import com.huaweicloud.sdk.vpc.v2.model.NeutronUpdateFirewallRuleResponse;
import com.huaweicloud.sdk.vpc.v2.model.NeutronUpdateNetworkRequest;
import com.huaweicloud.sdk.vpc.v2.model.NeutronUpdateNetworkRequestBody;
import com.huaweicloud.sdk.vpc.v2.model.NeutronUpdateNetworkResponse;
import com.huaweicloud.sdk.vpc.v2.model.NeutronUpdatePortRequest;
import com.huaweicloud.sdk.vpc.v2.model.NeutronUpdatePortRequestBody;
import com.huaweicloud.sdk.vpc.v2.model.NeutronUpdatePortResponse;
import com.huaweicloud.sdk.vpc.v2.model.NeutronUpdateRouterRequest;
import com.huaweicloud.sdk.vpc.v2.model.NeutronUpdateRouterRequestBody;
import com.huaweicloud.sdk.vpc.v2.model.NeutronUpdateRouterResponse;
import com.huaweicloud.sdk.vpc.v2.model.NeutronUpdateSecurityGroupRequest;
import com.huaweicloud.sdk.vpc.v2.model.NeutronUpdateSecurityGroupRequestBody;
import com.huaweicloud.sdk.vpc.v2.model.NeutronUpdateSecurityGroupResponse;
import com.huaweicloud.sdk.vpc.v2.model.NeutronUpdateSubnetRequest;
import com.huaweicloud.sdk.vpc.v2.model.NeutronUpdateSubnetRequestBody;
import com.huaweicloud.sdk.vpc.v2.model.NeutronUpdateSubnetResponse;
import com.huaweicloud.sdk.vpc.v2.model.RejectVpcPeeringRequest;
import com.huaweicloud.sdk.vpc.v2.model.RejectVpcPeeringResponse;
import com.huaweicloud.sdk.vpc.v2.model.RouterInterfaceRequestBody;
import com.huaweicloud.sdk.vpc.v2.model.RoutetableAssociateReqbody;
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
import com.huaweicloud.sdk.vpc.v2.model.ShowSecurityGroupTagsRequest;
import com.huaweicloud.sdk.vpc.v2.model.ShowSecurityGroupTagsResponse;
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
import com.huaweicloud.sdk.vpc.v2.model.UpdateFlowLogReqBody;
import com.huaweicloud.sdk.vpc.v2.model.UpdateFlowLogRequest;
import com.huaweicloud.sdk.vpc.v2.model.UpdateFlowLogResponse;
import com.huaweicloud.sdk.vpc.v2.model.UpdatePortRequest;
import com.huaweicloud.sdk.vpc.v2.model.UpdatePortRequestBody;
import com.huaweicloud.sdk.vpc.v2.model.UpdatePortResponse;
import com.huaweicloud.sdk.vpc.v2.model.UpdateRouteTableRequest;
import com.huaweicloud.sdk.vpc.v2.model.UpdateRouteTableResponse;
import com.huaweicloud.sdk.vpc.v2.model.UpdateRoutetableReqBody;
import com.huaweicloud.sdk.vpc.v2.model.UpdateSubnetRequest;
import com.huaweicloud.sdk.vpc.v2.model.UpdateSubnetRequestBody;
import com.huaweicloud.sdk.vpc.v2.model.UpdateSubnetResponse;
import com.huaweicloud.sdk.vpc.v2.model.UpdateVpcPeeringRequest;
import com.huaweicloud.sdk.vpc.v2.model.UpdateVpcPeeringRequestBody;
import com.huaweicloud.sdk.vpc.v2.model.UpdateVpcPeeringResponse;
import com.huaweicloud.sdk.vpc.v2.model.UpdateVpcRequest;
import com.huaweicloud.sdk.vpc.v2.model.UpdateVpcRequestBody;
import com.huaweicloud.sdk.vpc.v2.model.UpdateVpcResponse;

import java.util.List;

@SuppressWarnings("unchecked")
public class VpcMeta {

    public static final HttpRequestDef<AcceptVpcPeeringRequest, AcceptVpcPeeringResponse> acceptVpcPeering =
        genForAcceptVpcPeering();

    private static HttpRequestDef<AcceptVpcPeeringRequest, AcceptVpcPeeringResponse> genForAcceptVpcPeering() {
        // basic
        HttpRequestDef.Builder<AcceptVpcPeeringRequest, AcceptVpcPeeringResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, AcceptVpcPeeringRequest.class, AcceptVpcPeeringResponse.class)
                .withName("AcceptVpcPeering")
                .withUri("/v2.0/vpc/peerings/{peering_id}/accept")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("peering_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AcceptVpcPeeringRequest::getPeeringId, AcceptVpcPeeringRequest::setPeeringId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AssociateRouteTableRequest, AssociateRouteTableResponse> associateRouteTable =
        genForAssociateRouteTable();

    private static HttpRequestDef<AssociateRouteTableRequest, AssociateRouteTableResponse> genForAssociateRouteTable() {
        // basic
        HttpRequestDef.Builder<AssociateRouteTableRequest, AssociateRouteTableResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AssociateRouteTableRequest.class, AssociateRouteTableResponse.class)
                .withName("AssociateRouteTable")
                .withUri("/v1/{project_id}/routetables/{routetable_id}/action")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("routetable_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AssociateRouteTableRequest::getRoutetableId,
                AssociateRouteTableRequest::setRoutetableId));
        builder.<RoutetableAssociateReqbody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RoutetableAssociateReqbody.class),
            f -> f.withMarshaller(AssociateRouteTableRequest::getBody, AssociateRouteTableRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchCreateSecurityGroupTagsRequest, BatchCreateSecurityGroupTagsResponse> batchCreateSecurityGroupTags =
        genForBatchCreateSecurityGroupTags();

    private static HttpRequestDef<BatchCreateSecurityGroupTagsRequest, BatchCreateSecurityGroupTagsResponse> genForBatchCreateSecurityGroupTags() {
        // basic
        HttpRequestDef.Builder<BatchCreateSecurityGroupTagsRequest, BatchCreateSecurityGroupTagsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    BatchCreateSecurityGroupTagsRequest.class,
                    BatchCreateSecurityGroupTagsResponse.class)
                .withName("BatchCreateSecurityGroupTags")
                .withUri("/v2.0/{project_id}/security-groups/{security_group_id}/tags/action")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("security_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchCreateSecurityGroupTagsRequest::getSecurityGroupId,
                BatchCreateSecurityGroupTagsRequest::setSecurityGroupId));
        builder.<BatchCreateSecurityGroupTagsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchCreateSecurityGroupTagsRequestBody.class),
            f -> f.withMarshaller(BatchCreateSecurityGroupTagsRequest::getBody,
                BatchCreateSecurityGroupTagsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchCreateSubnetTagsRequest, BatchCreateSubnetTagsResponse> batchCreateSubnetTags =
        genForBatchCreateSubnetTags();

    private static HttpRequestDef<BatchCreateSubnetTagsRequest, BatchCreateSubnetTagsResponse> genForBatchCreateSubnetTags() {
        // basic
        HttpRequestDef.Builder<BatchCreateSubnetTagsRequest, BatchCreateSubnetTagsResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, BatchCreateSubnetTagsRequest.class, BatchCreateSubnetTagsResponse.class)
            .withName("BatchCreateSubnetTags")
            .withUri("/v2.0/{project_id}/subnets/{subnet_id}/tags/action")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("subnet_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchCreateSubnetTagsRequest::getSubnetId,
                BatchCreateSubnetTagsRequest::setSubnetId));
        builder.<BatchCreateSubnetTagsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchCreateSubnetTagsRequestBody.class),
            f -> f.withMarshaller(BatchCreateSubnetTagsRequest::getBody, BatchCreateSubnetTagsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteSecurityGroupTagsRequest, BatchDeleteSecurityGroupTagsResponse> batchDeleteSecurityGroupTags =
        genForBatchDeleteSecurityGroupTags();

    private static HttpRequestDef<BatchDeleteSecurityGroupTagsRequest, BatchDeleteSecurityGroupTagsResponse> genForBatchDeleteSecurityGroupTags() {
        // basic
        HttpRequestDef.Builder<BatchDeleteSecurityGroupTagsRequest, BatchDeleteSecurityGroupTagsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    BatchDeleteSecurityGroupTagsRequest.class,
                    BatchDeleteSecurityGroupTagsResponse.class)
                .withName("BatchDeleteSecurityGroupTags")
                .withUri("/v2.0/{project_id}/security-groups/{security_group_id}/tags/action")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("security_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeleteSecurityGroupTagsRequest::getSecurityGroupId,
                BatchDeleteSecurityGroupTagsRequest::setSecurityGroupId));
        builder.<BatchDeleteSecurityGroupTagsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchDeleteSecurityGroupTagsRequestBody.class),
            f -> f.withMarshaller(BatchDeleteSecurityGroupTagsRequest::getBody,
                BatchDeleteSecurityGroupTagsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteSubnetTagsRequest, BatchDeleteSubnetTagsResponse> batchDeleteSubnetTags =
        genForBatchDeleteSubnetTags();

    private static HttpRequestDef<BatchDeleteSubnetTagsRequest, BatchDeleteSubnetTagsResponse> genForBatchDeleteSubnetTags() {
        // basic
        HttpRequestDef.Builder<BatchDeleteSubnetTagsRequest, BatchDeleteSubnetTagsResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, BatchDeleteSubnetTagsRequest.class, BatchDeleteSubnetTagsResponse.class)
            .withName("BatchDeleteSubnetTags")
            .withUri("/v2.0/{project_id}/subnets/{subnet_id}/tags/action")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("subnet_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeleteSubnetTagsRequest::getSubnetId,
                BatchDeleteSubnetTagsRequest::setSubnetId));
        builder.<BatchDeleteSubnetTagsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchDeleteSubnetTagsRequestBody.class),
            f -> f.withMarshaller(BatchDeleteSubnetTagsRequest::getBody, BatchDeleteSubnetTagsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateFlowLogRequest, CreateFlowLogResponse> createFlowLog =
        genForCreateFlowLog();

    private static HttpRequestDef<CreateFlowLogRequest, CreateFlowLogResponse> genForCreateFlowLog() {
        // basic
        HttpRequestDef.Builder<CreateFlowLogRequest, CreateFlowLogResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateFlowLogRequest.class, CreateFlowLogResponse.class)
                .withName("CreateFlowLog")
                .withUri("/v1/{project_id}/fl/flow_logs")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<CreateFlowLogReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateFlowLogReqBody.class),
            f -> f.withMarshaller(CreateFlowLogRequest::getBody, CreateFlowLogRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreatePortRequest, CreatePortResponse> createPort = genForCreatePort();

    private static HttpRequestDef<CreatePortRequest, CreatePortResponse> genForCreatePort() {
        // basic
        HttpRequestDef.Builder<CreatePortRequest, CreatePortResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreatePortRequest.class, CreatePortResponse.class)
                .withName("CreatePort")
                .withUri("/v1/{project_id}/ports")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<CreatePortRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreatePortRequestBody.class),
            f -> f.withMarshaller(CreatePortRequest::getBody, CreatePortRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateRouteTableRequest, CreateRouteTableResponse> createRouteTable =
        genForCreateRouteTable();

    private static HttpRequestDef<CreateRouteTableRequest, CreateRouteTableResponse> genForCreateRouteTable() {
        // basic
        HttpRequestDef.Builder<CreateRouteTableRequest, CreateRouteTableResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateRouteTableRequest.class, CreateRouteTableResponse.class)
                .withName("CreateRouteTable")
                .withUri("/v1/{project_id}/routetables")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<CreateRoutetableReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateRoutetableReqBody.class),
            f -> f.withMarshaller(CreateRouteTableRequest::getBody, CreateRouteTableRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateSecurityGroupRequest, CreateSecurityGroupResponse> createSecurityGroup =
        genForCreateSecurityGroup();

    private static HttpRequestDef<CreateSecurityGroupRequest, CreateSecurityGroupResponse> genForCreateSecurityGroup() {
        // basic
        HttpRequestDef.Builder<CreateSecurityGroupRequest, CreateSecurityGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateSecurityGroupRequest.class, CreateSecurityGroupResponse.class)
                .withName("CreateSecurityGroup")
                .withUri("/v1/{project_id}/security-groups")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<CreateSecurityGroupRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateSecurityGroupRequestBody.class),
            f -> f.withMarshaller(CreateSecurityGroupRequest::getBody, CreateSecurityGroupRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateSecurityGroupRuleRequest, CreateSecurityGroupRuleResponse> createSecurityGroupRule =
        genForCreateSecurityGroupRule();

    private static HttpRequestDef<CreateSecurityGroupRuleRequest, CreateSecurityGroupRuleResponse> genForCreateSecurityGroupRule() {
        // basic
        HttpRequestDef.Builder<CreateSecurityGroupRuleRequest, CreateSecurityGroupRuleResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateSecurityGroupRuleRequest.class, CreateSecurityGroupRuleResponse.class)
            .withName("CreateSecurityGroupRule")
            .withUri("/v1/{project_id}/security-group-rules")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<CreateSecurityGroupRuleRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateSecurityGroupRuleRequestBody.class),
            f -> f.withMarshaller(CreateSecurityGroupRuleRequest::getBody, CreateSecurityGroupRuleRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateSecurityGroupTagRequest, CreateSecurityGroupTagResponse> createSecurityGroupTag =
        genForCreateSecurityGroupTag();

    private static HttpRequestDef<CreateSecurityGroupTagRequest, CreateSecurityGroupTagResponse> genForCreateSecurityGroupTag() {
        // basic
        HttpRequestDef.Builder<CreateSecurityGroupTagRequest, CreateSecurityGroupTagResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateSecurityGroupTagRequest.class, CreateSecurityGroupTagResponse.class)
            .withName("CreateSecurityGroupTag")
            .withUri("/v2.0/{project_id}/security-groups/{security_group_id}/tags")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("security_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateSecurityGroupTagRequest::getSecurityGroupId,
                CreateSecurityGroupTagRequest::setSecurityGroupId));
        builder.<CreateSecurityGroupTagRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateSecurityGroupTagRequestBody.class),
            f -> f.withMarshaller(CreateSecurityGroupTagRequest::getBody, CreateSecurityGroupTagRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateSubnetRequest, CreateSubnetResponse> createSubnet = genForCreateSubnet();

    private static HttpRequestDef<CreateSubnetRequest, CreateSubnetResponse> genForCreateSubnet() {
        // basic
        HttpRequestDef.Builder<CreateSubnetRequest, CreateSubnetResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateSubnetRequest.class, CreateSubnetResponse.class)
                .withName("CreateSubnet")
                .withUri("/v1/{project_id}/subnets")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<CreateSubnetRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateSubnetRequestBody.class),
            f -> f.withMarshaller(CreateSubnetRequest::getBody, CreateSubnetRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateSubnetTagRequest, CreateSubnetTagResponse> createSubnetTag =
        genForCreateSubnetTag();

    private static HttpRequestDef<CreateSubnetTagRequest, CreateSubnetTagResponse> genForCreateSubnetTag() {
        // basic
        HttpRequestDef.Builder<CreateSubnetTagRequest, CreateSubnetTagResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateSubnetTagRequest.class, CreateSubnetTagResponse.class)
                .withName("CreateSubnetTag")
                .withUri("/v2.0/{project_id}/subnets/{subnet_id}/tags")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("subnet_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateSubnetTagRequest::getSubnetId, CreateSubnetTagRequest::setSubnetId));
        builder.<CreateSubnetTagRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateSubnetTagRequestBody.class),
            f -> f.withMarshaller(CreateSubnetTagRequest::getBody, CreateSubnetTagRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateVpcPeeringRequest, CreateVpcPeeringResponse> createVpcPeering =
        genForCreateVpcPeering();

    private static HttpRequestDef<CreateVpcPeeringRequest, CreateVpcPeeringResponse> genForCreateVpcPeering() {
        // basic
        HttpRequestDef.Builder<CreateVpcPeeringRequest, CreateVpcPeeringResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateVpcPeeringRequest.class, CreateVpcPeeringResponse.class)
                .withName("CreateVpcPeering")
                .withUri("/v2.0/vpc/peerings")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<CreateVpcPeeringRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateVpcPeeringRequestBody.class),
            f -> f.withMarshaller(CreateVpcPeeringRequest::getBody, CreateVpcPeeringRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteFlowLogRequest, DeleteFlowLogResponse> deleteFlowLog =
        genForDeleteFlowLog();

    private static HttpRequestDef<DeleteFlowLogRequest, DeleteFlowLogResponse> genForDeleteFlowLog() {
        // basic
        HttpRequestDef.Builder<DeleteFlowLogRequest, DeleteFlowLogResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteFlowLogRequest.class, DeleteFlowLogResponse.class)
                .withName("DeleteFlowLog")
                .withUri("/v1/{project_id}/fl/flow_logs/{flowlog_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("flowlog_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteFlowLogRequest::getFlowlogId, DeleteFlowLogRequest::setFlowlogId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeletePortRequest, DeletePortResponse> deletePort = genForDeletePort();

    private static HttpRequestDef<DeletePortRequest, DeletePortResponse> genForDeletePort() {
        // basic
        HttpRequestDef.Builder<DeletePortRequest, DeletePortResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeletePortRequest.class, DeletePortResponse.class)
                .withName("DeletePort")
                .withUri("/v1/{project_id}/ports/{port_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("port_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletePortRequest::getPortId, DeletePortRequest::setPortId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteRouteTableRequest, DeleteRouteTableResponse> deleteRouteTable =
        genForDeleteRouteTable();

    private static HttpRequestDef<DeleteRouteTableRequest, DeleteRouteTableResponse> genForDeleteRouteTable() {
        // basic
        HttpRequestDef.Builder<DeleteRouteTableRequest, DeleteRouteTableResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteRouteTableRequest.class, DeleteRouteTableResponse.class)
                .withName("DeleteRouteTable")
                .withUri("/v1/{project_id}/routetables/{routetable_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("routetable_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteRouteTableRequest::getRoutetableId, DeleteRouteTableRequest::setRoutetableId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteSecurityGroupRequest, DeleteSecurityGroupResponse> deleteSecurityGroup =
        genForDeleteSecurityGroup();

    private static HttpRequestDef<DeleteSecurityGroupRequest, DeleteSecurityGroupResponse> genForDeleteSecurityGroup() {
        // basic
        HttpRequestDef.Builder<DeleteSecurityGroupRequest, DeleteSecurityGroupResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteSecurityGroupRequest.class, DeleteSecurityGroupResponse.class)
            .withName("DeleteSecurityGroup")
            .withUri("/v1/{project_id}/security-groups/{security_group_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("security_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteSecurityGroupRequest::getSecurityGroupId,
                DeleteSecurityGroupRequest::setSecurityGroupId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteSecurityGroupRuleRequest, DeleteSecurityGroupRuleResponse> deleteSecurityGroupRule =
        genForDeleteSecurityGroupRule();

    private static HttpRequestDef<DeleteSecurityGroupRuleRequest, DeleteSecurityGroupRuleResponse> genForDeleteSecurityGroupRule() {
        // basic
        HttpRequestDef.Builder<DeleteSecurityGroupRuleRequest, DeleteSecurityGroupRuleResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteSecurityGroupRuleRequest.class, DeleteSecurityGroupRuleResponse.class)
            .withName("DeleteSecurityGroupRule")
            .withUri("/v1/{project_id}/security-group-rules/{security_group_rule_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("security_group_rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteSecurityGroupRuleRequest::getSecurityGroupRuleId,
                DeleteSecurityGroupRuleRequest::setSecurityGroupRuleId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteSecurityGroupTagRequest, DeleteSecurityGroupTagResponse> deleteSecurityGroupTag =
        genForDeleteSecurityGroupTag();

    private static HttpRequestDef<DeleteSecurityGroupTagRequest, DeleteSecurityGroupTagResponse> genForDeleteSecurityGroupTag() {
        // basic
        HttpRequestDef.Builder<DeleteSecurityGroupTagRequest, DeleteSecurityGroupTagResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteSecurityGroupTagRequest.class, DeleteSecurityGroupTagResponse.class)
            .withName("DeleteSecurityGroupTag")
            .withUri("/v2.0/{project_id}/security-groups/{security_group_id}/tags/{key}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("key",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteSecurityGroupTagRequest::getKey, DeleteSecurityGroupTagRequest::setKey));
        builder.<String>withRequestField("security_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteSecurityGroupTagRequest::getSecurityGroupId,
                DeleteSecurityGroupTagRequest::setSecurityGroupId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteSubnetRequest, DeleteSubnetResponse> deleteSubnet = genForDeleteSubnet();

    private static HttpRequestDef<DeleteSubnetRequest, DeleteSubnetResponse> genForDeleteSubnet() {
        // basic
        HttpRequestDef.Builder<DeleteSubnetRequest, DeleteSubnetResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteSubnetRequest.class, DeleteSubnetResponse.class)
                .withName("DeleteSubnet")
                .withUri("/v1/{project_id}/vpcs/{vpc_id}/subnets/{subnet_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("vpc_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteSubnetRequest::getVpcId, DeleteSubnetRequest::setVpcId));
        builder.<String>withRequestField("subnet_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteSubnetRequest::getSubnetId, DeleteSubnetRequest::setSubnetId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteSubnetTagRequest, DeleteSubnetTagResponse> deleteSubnetTag =
        genForDeleteSubnetTag();

    private static HttpRequestDef<DeleteSubnetTagRequest, DeleteSubnetTagResponse> genForDeleteSubnetTag() {
        // basic
        HttpRequestDef.Builder<DeleteSubnetTagRequest, DeleteSubnetTagResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteSubnetTagRequest.class, DeleteSubnetTagResponse.class)
                .withName("DeleteSubnetTag")
                .withUri("/v2.0/{project_id}/subnets/{subnet_id}/tags/{key}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("subnet_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteSubnetTagRequest::getSubnetId, DeleteSubnetTagRequest::setSubnetId));
        builder.<String>withRequestField("key",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteSubnetTagRequest::getKey, DeleteSubnetTagRequest::setKey));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteVpcPeeringRequest, DeleteVpcPeeringResponse> deleteVpcPeering =
        genForDeleteVpcPeering();

    private static HttpRequestDef<DeleteVpcPeeringRequest, DeleteVpcPeeringResponse> genForDeleteVpcPeering() {
        // basic
        HttpRequestDef.Builder<DeleteVpcPeeringRequest, DeleteVpcPeeringResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteVpcPeeringRequest.class, DeleteVpcPeeringResponse.class)
                .withName("DeleteVpcPeering")
                .withUri("/v2.0/vpc/peerings/{peering_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("peering_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteVpcPeeringRequest::getPeeringId, DeleteVpcPeeringRequest::setPeeringId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DisassociateRouteTableRequest, DisassociateRouteTableResponse> disassociateRouteTable =
        genForDisassociateRouteTable();

    private static HttpRequestDef<DisassociateRouteTableRequest, DisassociateRouteTableResponse> genForDisassociateRouteTable() {
        // basic
        HttpRequestDef.Builder<DisassociateRouteTableRequest, DisassociateRouteTableResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, DisassociateRouteTableRequest.class, DisassociateRouteTableResponse.class)
            .withName("DisassociateRouteTable")
            .withUri("/v1/{project_id}/routetables/{routetable_id}/action")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("routetable_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DisassociateRouteTableRequest::getRoutetableId,
                DisassociateRouteTableRequest::setRoutetableId));
        builder.<RoutetableAssociateReqbody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RoutetableAssociateReqbody.class),
            f -> f.withMarshaller(DisassociateRouteTableRequest::getBody, DisassociateRouteTableRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListFlowLogsRequest, ListFlowLogsResponse> listFlowLogs = genForListFlowLogs();

    private static HttpRequestDef<ListFlowLogsRequest, ListFlowLogsResponse> genForListFlowLogs() {
        // basic
        HttpRequestDef.Builder<ListFlowLogsRequest, ListFlowLogsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListFlowLogsRequest.class, ListFlowLogsResponse.class)
                .withName("ListFlowLogs")
                .withUri("/v1/{project_id}/fl/flow_logs")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFlowLogsRequest::getId, ListFlowLogsRequest::setId));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFlowLogsRequest::getName, ListFlowLogsRequest::setName));
        builder.<String>withRequestField("tenant_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFlowLogsRequest::getTenantId, ListFlowLogsRequest::setTenantId));
        builder.<String>withRequestField("description",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFlowLogsRequest::getDescription, ListFlowLogsRequest::setDescription));
        builder.<ListFlowLogsRequest.ResourceTypeEnum>withRequestField("resource_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListFlowLogsRequest.ResourceTypeEnum.class),
            f -> f.withMarshaller(ListFlowLogsRequest::getResourceType, ListFlowLogsRequest::setResourceType));
        builder.<String>withRequestField("resource_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFlowLogsRequest::getResourceId, ListFlowLogsRequest::setResourceId));
        builder.<ListFlowLogsRequest.TrafficTypeEnum>withRequestField("traffic_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListFlowLogsRequest.TrafficTypeEnum.class),
            f -> f.withMarshaller(ListFlowLogsRequest::getTrafficType, ListFlowLogsRequest::setTrafficType));
        builder.<String>withRequestField("log_group_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFlowLogsRequest::getLogGroupId, ListFlowLogsRequest::setLogGroupId));
        builder.<String>withRequestField("log_topic_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFlowLogsRequest::getLogTopicId, ListFlowLogsRequest::setLogTopicId));
        builder.<ListFlowLogsRequest.LogStoreTypeEnum>withRequestField("log_store_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListFlowLogsRequest.LogStoreTypeEnum.class),
            f -> f.withMarshaller(ListFlowLogsRequest::getLogStoreType, ListFlowLogsRequest::setLogStoreType));
        builder.<ListFlowLogsRequest.StatusEnum>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListFlowLogsRequest.StatusEnum.class),
            f -> f.withMarshaller(ListFlowLogsRequest::getStatus, ListFlowLogsRequest::setStatus));
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFlowLogsRequest::getLimit, ListFlowLogsRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFlowLogsRequest::getMarker, ListFlowLogsRequest::setMarker));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPortsRequest, ListPortsResponse> listPorts = genForListPorts();

    private static HttpRequestDef<ListPortsRequest, ListPortsResponse> genForListPorts() {
        // basic
        HttpRequestDef.Builder<ListPortsRequest, ListPortsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListPortsRequest.class, ListPortsResponse.class)
                .withName("ListPorts")
                .withUri("/v1/{project_id}/ports")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPortsRequest::getName, ListPortsRequest::setName));
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPortsRequest::getId, ListPortsRequest::setId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPortsRequest::getLimit, ListPortsRequest::setLimit));
        builder.<Boolean>withRequestField("admin_state_up",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListPortsRequest::getAdminStateUp, ListPortsRequest::setAdminStateUp));
        builder.<String>withRequestField("network_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPortsRequest::getNetworkId, ListPortsRequest::setNetworkId));
        builder.<String>withRequestField("mac_address",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPortsRequest::getMacAddress, ListPortsRequest::setMacAddress));
        builder.<String>withRequestField("device_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPortsRequest::getDeviceId, ListPortsRequest::setDeviceId));
        builder.<ListPortsRequest.DeviceOwnerEnum>withRequestField("device_owner",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListPortsRequest.DeviceOwnerEnum.class),
            f -> f.withMarshaller(ListPortsRequest::getDeviceOwner, ListPortsRequest::setDeviceOwner));
        builder.<ListPortsRequest.StatusEnum>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListPortsRequest.StatusEnum.class),
            f -> f.withMarshaller(ListPortsRequest::getStatus, ListPortsRequest::setStatus));
        builder.<List<String>>withRequestField("security_groups",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPortsRequest::getSecurityGroups, ListPortsRequest::setSecurityGroups));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPortsRequest::getMarker, ListPortsRequest::setMarker));
        builder.<List<String>>withRequestField("fixed_ips",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPortsRequest::getFixedIps, ListPortsRequest::setFixedIps));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPortsRequest::getEnterpriseProjectId, ListPortsRequest::setEnterpriseProjectId));
        builder.<Boolean>withRequestField("enable_efi",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListPortsRequest::getEnableEfi, ListPortsRequest::setEnableEfi));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListRouteTablesRequest, ListRouteTablesResponse> listRouteTables =
        genForListRouteTables();

    private static HttpRequestDef<ListRouteTablesRequest, ListRouteTablesResponse> genForListRouteTables() {
        // basic
        HttpRequestDef.Builder<ListRouteTablesRequest, ListRouteTablesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListRouteTablesRequest.class, ListRouteTablesResponse.class)
                .withName("ListRouteTables")
                .withUri("/v1/{project_id}/routetables")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRouteTablesRequest::getLimit, ListRouteTablesRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRouteTablesRequest::getMarker, ListRouteTablesRequest::setMarker));
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRouteTablesRequest::getId, ListRouteTablesRequest::setId));
        builder.<String>withRequestField("vpc_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRouteTablesRequest::getVpcId, ListRouteTablesRequest::setVpcId));
        builder.<String>withRequestField("subnet_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRouteTablesRequest::getSubnetId, ListRouteTablesRequest::setSubnetId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSecurityGroupRulesRequest, ListSecurityGroupRulesResponse> listSecurityGroupRules =
        genForListSecurityGroupRules();

    private static HttpRequestDef<ListSecurityGroupRulesRequest, ListSecurityGroupRulesResponse> genForListSecurityGroupRules() {
        // basic
        HttpRequestDef.Builder<ListSecurityGroupRulesRequest, ListSecurityGroupRulesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListSecurityGroupRulesRequest.class, ListSecurityGroupRulesResponse.class)
            .withName("ListSecurityGroupRules")
            .withUri("/v1/{project_id}/security-group-rules")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSecurityGroupRulesRequest::getMarker, ListSecurityGroupRulesRequest::setMarker));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSecurityGroupRulesRequest::getLimit, ListSecurityGroupRulesRequest::setLimit));
        builder.<String>withRequestField("security_group_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSecurityGroupRulesRequest::getSecurityGroupId,
                ListSecurityGroupRulesRequest::setSecurityGroupId));
        builder.<String>withRequestField("remote_ip_prefix",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSecurityGroupRulesRequest::getRemoteIpPrefix,
                ListSecurityGroupRulesRequest::setRemoteIpPrefix));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSecurityGroupTagsRequest, ListSecurityGroupTagsResponse> listSecurityGroupTags =
        genForListSecurityGroupTags();

    private static HttpRequestDef<ListSecurityGroupTagsRequest, ListSecurityGroupTagsResponse> genForListSecurityGroupTags() {
        // basic
        HttpRequestDef.Builder<ListSecurityGroupTagsRequest, ListSecurityGroupTagsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListSecurityGroupTagsRequest.class, ListSecurityGroupTagsResponse.class)
            .withName("ListSecurityGroupTags")
            .withUri("/v2.0/{project_id}/security-groups/tags")
            .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSecurityGroupsRequest, ListSecurityGroupsResponse> listSecurityGroups =
        genForListSecurityGroups();

    private static HttpRequestDef<ListSecurityGroupsRequest, ListSecurityGroupsResponse> genForListSecurityGroups() {
        // basic
        HttpRequestDef.Builder<ListSecurityGroupsRequest, ListSecurityGroupsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListSecurityGroupsRequest.class, ListSecurityGroupsResponse.class)
                .withName("ListSecurityGroups")
                .withUri("/v1/{project_id}/security-groups")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSecurityGroupsRequest::getLimit, ListSecurityGroupsRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSecurityGroupsRequest::getMarker, ListSecurityGroupsRequest::setMarker));
        builder.<String>withRequestField("vpc_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSecurityGroupsRequest::getVpcId, ListSecurityGroupsRequest::setVpcId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSecurityGroupsRequest::getEnterpriseProjectId,
                ListSecurityGroupsRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSecurityGroupsByTagsRequest, ListSecurityGroupsByTagsResponse> listSecurityGroupsByTags =
        genForListSecurityGroupsByTags();

    private static HttpRequestDef<ListSecurityGroupsByTagsRequest, ListSecurityGroupsByTagsResponse> genForListSecurityGroupsByTags() {
        // basic
        HttpRequestDef.Builder<ListSecurityGroupsByTagsRequest, ListSecurityGroupsByTagsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, ListSecurityGroupsByTagsRequest.class, ListSecurityGroupsByTagsResponse.class)
                .withName("ListSecurityGroupsByTags")
                .withUri("/v2.0/{project_id}/security-groups/resource_instances/action")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<ListSecurityGroupsByTagsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListSecurityGroupsByTagsRequestBody.class),
            f -> f.withMarshaller(ListSecurityGroupsByTagsRequest::getBody, ListSecurityGroupsByTagsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSubnetTagsRequest, ListSubnetTagsResponse> listSubnetTags =
        genForListSubnetTags();

    private static HttpRequestDef<ListSubnetTagsRequest, ListSubnetTagsResponse> genForListSubnetTags() {
        // basic
        HttpRequestDef.Builder<ListSubnetTagsRequest, ListSubnetTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListSubnetTagsRequest.class, ListSubnetTagsResponse.class)
                .withName("ListSubnetTags")
                .withUri("/v2.0/{project_id}/subnets/tags")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSubnetsRequest, ListSubnetsResponse> listSubnets = genForListSubnets();

    private static HttpRequestDef<ListSubnetsRequest, ListSubnetsResponse> genForListSubnets() {
        // basic
        HttpRequestDef.Builder<ListSubnetsRequest, ListSubnetsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListSubnetsRequest.class, ListSubnetsResponse.class)
                .withName("ListSubnets")
                .withUri("/v1/{project_id}/subnets")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSubnetsRequest::getLimit, ListSubnetsRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSubnetsRequest::getMarker, ListSubnetsRequest::setMarker));
        builder.<String>withRequestField("vpc_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSubnetsRequest::getVpcId, ListSubnetsRequest::setVpcId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSubnetsByTagsRequest, ListSubnetsByTagsResponse> listSubnetsByTags =
        genForListSubnetsByTags();

    private static HttpRequestDef<ListSubnetsByTagsRequest, ListSubnetsByTagsResponse> genForListSubnetsByTags() {
        // basic
        HttpRequestDef.Builder<ListSubnetsByTagsRequest, ListSubnetsByTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListSubnetsByTagsRequest.class, ListSubnetsByTagsResponse.class)
                .withName("ListSubnetsByTags")
                .withUri("/v2.0/{project_id}/subnets/resource_instances/action")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<ListSubnetsByTagsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListSubnetsByTagsRequestBody.class),
            f -> f.withMarshaller(ListSubnetsByTagsRequest::getBody, ListSubnetsByTagsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListVpcPeeringsRequest, ListVpcPeeringsResponse> listVpcPeerings =
        genForListVpcPeerings();

    private static HttpRequestDef<ListVpcPeeringsRequest, ListVpcPeeringsResponse> genForListVpcPeerings() {
        // basic
        HttpRequestDef.Builder<ListVpcPeeringsRequest, ListVpcPeeringsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListVpcPeeringsRequest.class, ListVpcPeeringsResponse.class)
                .withName("ListVpcPeerings")
                .withUri("/v2.0/vpc/peerings")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListVpcPeeringsRequest::getLimit, ListVpcPeeringsRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVpcPeeringsRequest::getMarker, ListVpcPeeringsRequest::setMarker));
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVpcPeeringsRequest::getId, ListVpcPeeringsRequest::setId));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVpcPeeringsRequest::getName, ListVpcPeeringsRequest::setName));
        builder.<ListVpcPeeringsRequest.StatusEnum>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListVpcPeeringsRequest.StatusEnum.class),
            f -> f.withMarshaller(ListVpcPeeringsRequest::getStatus, ListVpcPeeringsRequest::setStatus));
        builder.<String>withRequestField("tenant_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVpcPeeringsRequest::getTenantId, ListVpcPeeringsRequest::setTenantId));
        builder.<String>withRequestField("vpc_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVpcPeeringsRequest::getVpcId, ListVpcPeeringsRequest::setVpcId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RejectVpcPeeringRequest, RejectVpcPeeringResponse> rejectVpcPeering =
        genForRejectVpcPeering();

    private static HttpRequestDef<RejectVpcPeeringRequest, RejectVpcPeeringResponse> genForRejectVpcPeering() {
        // basic
        HttpRequestDef.Builder<RejectVpcPeeringRequest, RejectVpcPeeringResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, RejectVpcPeeringRequest.class, RejectVpcPeeringResponse.class)
                .withName("RejectVpcPeering")
                .withUri("/v2.0/vpc/peerings/{peering_id}/reject")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("peering_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RejectVpcPeeringRequest::getPeeringId, RejectVpcPeeringRequest::setPeeringId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowFlowLogRequest, ShowFlowLogResponse> showFlowLog = genForShowFlowLog();

    private static HttpRequestDef<ShowFlowLogRequest, ShowFlowLogResponse> genForShowFlowLog() {
        // basic
        HttpRequestDef.Builder<ShowFlowLogRequest, ShowFlowLogResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowFlowLogRequest.class, ShowFlowLogResponse.class)
                .withName("ShowFlowLog")
                .withUri("/v1/{project_id}/fl/flow_logs/{flowlog_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("flowlog_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowFlowLogRequest::getFlowlogId, ShowFlowLogRequest::setFlowlogId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowPortRequest, ShowPortResponse> showPort = genForShowPort();

    private static HttpRequestDef<ShowPortRequest, ShowPortResponse> genForShowPort() {
        // basic
        HttpRequestDef.Builder<ShowPortRequest, ShowPortResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowPortRequest.class, ShowPortResponse.class)
                .withName("ShowPort")
                .withUri("/v1/{project_id}/ports/{port_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("port_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPortRequest::getPortId, ShowPortRequest::setPortId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowQuotaRequest, ShowQuotaResponse> showQuota = genForShowQuota();

    private static HttpRequestDef<ShowQuotaRequest, ShowQuotaResponse> genForShowQuota() {
        // basic
        HttpRequestDef.Builder<ShowQuotaRequest, ShowQuotaResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowQuotaRequest.class, ShowQuotaResponse.class)
                .withName("ShowQuota")
                .withUri("/v1/{project_id}/quotas")
                .withContentType("application/json");

        // requests
        builder.<ShowQuotaRequest.TypeEnum>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowQuotaRequest.TypeEnum.class),
            f -> f.withMarshaller(ShowQuotaRequest::getType, ShowQuotaRequest::setType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowRouteTableRequest, ShowRouteTableResponse> showRouteTable =
        genForShowRouteTable();

    private static HttpRequestDef<ShowRouteTableRequest, ShowRouteTableResponse> genForShowRouteTable() {
        // basic
        HttpRequestDef.Builder<ShowRouteTableRequest, ShowRouteTableResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowRouteTableRequest.class, ShowRouteTableResponse.class)
                .withName("ShowRouteTable")
                .withUri("/v1/{project_id}/routetables/{routetable_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("routetable_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRouteTableRequest::getRoutetableId, ShowRouteTableRequest::setRoutetableId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowSecurityGroupRequest, ShowSecurityGroupResponse> showSecurityGroup =
        genForShowSecurityGroup();

    private static HttpRequestDef<ShowSecurityGroupRequest, ShowSecurityGroupResponse> genForShowSecurityGroup() {
        // basic
        HttpRequestDef.Builder<ShowSecurityGroupRequest, ShowSecurityGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowSecurityGroupRequest.class, ShowSecurityGroupResponse.class)
                .withName("ShowSecurityGroup")
                .withUri("/v1/{project_id}/security-groups/{security_group_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("security_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSecurityGroupRequest::getSecurityGroupId,
                ShowSecurityGroupRequest::setSecurityGroupId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowSecurityGroupRuleRequest, ShowSecurityGroupRuleResponse> showSecurityGroupRule =
        genForShowSecurityGroupRule();

    private static HttpRequestDef<ShowSecurityGroupRuleRequest, ShowSecurityGroupRuleResponse> genForShowSecurityGroupRule() {
        // basic
        HttpRequestDef.Builder<ShowSecurityGroupRuleRequest, ShowSecurityGroupRuleResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowSecurityGroupRuleRequest.class, ShowSecurityGroupRuleResponse.class)
            .withName("ShowSecurityGroupRule")
            .withUri("/v1/{project_id}/security-group-rules/{security_group_rule_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("security_group_rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSecurityGroupRuleRequest::getSecurityGroupRuleId,
                ShowSecurityGroupRuleRequest::setSecurityGroupRuleId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowSecurityGroupTagsRequest, ShowSecurityGroupTagsResponse> showSecurityGroupTags =
        genForShowSecurityGroupTags();

    private static HttpRequestDef<ShowSecurityGroupTagsRequest, ShowSecurityGroupTagsResponse> genForShowSecurityGroupTags() {
        // basic
        HttpRequestDef.Builder<ShowSecurityGroupTagsRequest, ShowSecurityGroupTagsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowSecurityGroupTagsRequest.class, ShowSecurityGroupTagsResponse.class)
            .withName("ShowSecurityGroupTags")
            .withUri("/v2.0/{project_id}/security-groups/{security_group_id}/tags")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("security_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSecurityGroupTagsRequest::getSecurityGroupId,
                ShowSecurityGroupTagsRequest::setSecurityGroupId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowSubnetRequest, ShowSubnetResponse> showSubnet = genForShowSubnet();

    private static HttpRequestDef<ShowSubnetRequest, ShowSubnetResponse> genForShowSubnet() {
        // basic
        HttpRequestDef.Builder<ShowSubnetRequest, ShowSubnetResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowSubnetRequest.class, ShowSubnetResponse.class)
                .withName("ShowSubnet")
                .withUri("/v1/{project_id}/subnets/{subnet_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("subnet_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSubnetRequest::getSubnetId, ShowSubnetRequest::setSubnetId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowSubnetTagsRequest, ShowSubnetTagsResponse> showSubnetTags =
        genForShowSubnetTags();

    private static HttpRequestDef<ShowSubnetTagsRequest, ShowSubnetTagsResponse> genForShowSubnetTags() {
        // basic
        HttpRequestDef.Builder<ShowSubnetTagsRequest, ShowSubnetTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowSubnetTagsRequest.class, ShowSubnetTagsResponse.class)
                .withName("ShowSubnetTags")
                .withUri("/v2.0/{project_id}/subnets/{subnet_id}/tags")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("subnet_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSubnetTagsRequest::getSubnetId, ShowSubnetTagsRequest::setSubnetId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowVpcPeeringRequest, ShowVpcPeeringResponse> showVpcPeering =
        genForShowVpcPeering();

    private static HttpRequestDef<ShowVpcPeeringRequest, ShowVpcPeeringResponse> genForShowVpcPeering() {
        // basic
        HttpRequestDef.Builder<ShowVpcPeeringRequest, ShowVpcPeeringResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowVpcPeeringRequest.class, ShowVpcPeeringResponse.class)
                .withName("ShowVpcPeering")
                .withUri("/v2.0/vpc/peerings/{peering_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("peering_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowVpcPeeringRequest::getPeeringId, ShowVpcPeeringRequest::setPeeringId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateFlowLogRequest, UpdateFlowLogResponse> updateFlowLog =
        genForUpdateFlowLog();

    private static HttpRequestDef<UpdateFlowLogRequest, UpdateFlowLogResponse> genForUpdateFlowLog() {
        // basic
        HttpRequestDef.Builder<UpdateFlowLogRequest, UpdateFlowLogResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateFlowLogRequest.class, UpdateFlowLogResponse.class)
                .withName("UpdateFlowLog")
                .withUri("/v1/{project_id}/fl/flow_logs/{flowlog_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("flowlog_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateFlowLogRequest::getFlowlogId, UpdateFlowLogRequest::setFlowlogId));
        builder.<UpdateFlowLogReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateFlowLogReqBody.class),
            f -> f.withMarshaller(UpdateFlowLogRequest::getBody, UpdateFlowLogRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdatePortRequest, UpdatePortResponse> updatePort = genForUpdatePort();

    private static HttpRequestDef<UpdatePortRequest, UpdatePortResponse> genForUpdatePort() {
        // basic
        HttpRequestDef.Builder<UpdatePortRequest, UpdatePortResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdatePortRequest.class, UpdatePortResponse.class)
                .withName("UpdatePort")
                .withUri("/v1/{project_id}/ports/{port_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("port_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePortRequest::getPortId, UpdatePortRequest::setPortId));
        builder.<UpdatePortRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdatePortRequestBody.class),
            f -> f.withMarshaller(UpdatePortRequest::getBody, UpdatePortRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateRouteTableRequest, UpdateRouteTableResponse> updateRouteTable =
        genForUpdateRouteTable();

    private static HttpRequestDef<UpdateRouteTableRequest, UpdateRouteTableResponse> genForUpdateRouteTable() {
        // basic
        HttpRequestDef.Builder<UpdateRouteTableRequest, UpdateRouteTableResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateRouteTableRequest.class, UpdateRouteTableResponse.class)
                .withName("UpdateRouteTable")
                .withUri("/v1/{project_id}/routetables/{routetable_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("routetable_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateRouteTableRequest::getRoutetableId, UpdateRouteTableRequest::setRoutetableId));
        builder.<UpdateRoutetableReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateRoutetableReqBody.class),
            f -> f.withMarshaller(UpdateRouteTableRequest::getBody, UpdateRouteTableRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateSubnetRequest, UpdateSubnetResponse> updateSubnet = genForUpdateSubnet();

    private static HttpRequestDef<UpdateSubnetRequest, UpdateSubnetResponse> genForUpdateSubnet() {
        // basic
        HttpRequestDef.Builder<UpdateSubnetRequest, UpdateSubnetResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateSubnetRequest.class, UpdateSubnetResponse.class)
                .withName("UpdateSubnet")
                .withUri("/v1/{project_id}/vpcs/{vpc_id}/subnets/{subnet_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("vpc_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateSubnetRequest::getVpcId, UpdateSubnetRequest::setVpcId));
        builder.<String>withRequestField("subnet_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateSubnetRequest::getSubnetId, UpdateSubnetRequest::setSubnetId));
        builder.<UpdateSubnetRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateSubnetRequestBody.class),
            f -> f.withMarshaller(UpdateSubnetRequest::getBody, UpdateSubnetRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateVpcPeeringRequest, UpdateVpcPeeringResponse> updateVpcPeering =
        genForUpdateVpcPeering();

    private static HttpRequestDef<UpdateVpcPeeringRequest, UpdateVpcPeeringResponse> genForUpdateVpcPeering() {
        // basic
        HttpRequestDef.Builder<UpdateVpcPeeringRequest, UpdateVpcPeeringResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateVpcPeeringRequest.class, UpdateVpcPeeringResponse.class)
                .withName("UpdateVpcPeering")
                .withUri("/v2.0/vpc/peerings/{peering_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("peering_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateVpcPeeringRequest::getPeeringId, UpdateVpcPeeringRequest::setPeeringId));
        builder.<UpdateVpcPeeringRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateVpcPeeringRequestBody.class),
            f -> f.withMarshaller(UpdateVpcPeeringRequest::getBody, UpdateVpcPeeringRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreatePrivateipRequest, CreatePrivateipResponse> createPrivateip =
        genForCreatePrivateip();

    private static HttpRequestDef<CreatePrivateipRequest, CreatePrivateipResponse> genForCreatePrivateip() {
        // basic
        HttpRequestDef.Builder<CreatePrivateipRequest, CreatePrivateipResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreatePrivateipRequest.class, CreatePrivateipResponse.class)
                .withName("CreatePrivateip")
                .withUri("/v1/{project_id}/privateips")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<CreatePrivateipRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreatePrivateipRequestBody.class),
            f -> f.withMarshaller(CreatePrivateipRequest::getBody, CreatePrivateipRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeletePrivateipRequest, DeletePrivateipResponse> deletePrivateip =
        genForDeletePrivateip();

    private static HttpRequestDef<DeletePrivateipRequest, DeletePrivateipResponse> genForDeletePrivateip() {
        // basic
        HttpRequestDef.Builder<DeletePrivateipRequest, DeletePrivateipResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeletePrivateipRequest.class, DeletePrivateipResponse.class)
                .withName("DeletePrivateip")
                .withUri("/v1/{project_id}/privateips/{privateip_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("privateip_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletePrivateipRequest::getPrivateipId, DeletePrivateipRequest::setPrivateipId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPrivateipsRequest, ListPrivateipsResponse> listPrivateips =
        genForListPrivateips();

    private static HttpRequestDef<ListPrivateipsRequest, ListPrivateipsResponse> genForListPrivateips() {
        // basic
        HttpRequestDef.Builder<ListPrivateipsRequest, ListPrivateipsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListPrivateipsRequest.class, ListPrivateipsResponse.class)
                .withName("ListPrivateips")
                .withUri("/v1/{project_id}/subnets/{subnet_id}/privateips")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("subnet_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPrivateipsRequest::getSubnetId, ListPrivateipsRequest::setSubnetId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPrivateipsRequest::getLimit, ListPrivateipsRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPrivateipsRequest::getMarker, ListPrivateipsRequest::setMarker));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowNetworkIpAvailabilitiesRequest, ShowNetworkIpAvailabilitiesResponse> showNetworkIpAvailabilities =
        genForShowNetworkIpAvailabilities();

    private static HttpRequestDef<ShowNetworkIpAvailabilitiesRequest, ShowNetworkIpAvailabilitiesResponse> genForShowNetworkIpAvailabilities() {
        // basic
        HttpRequestDef.Builder<ShowNetworkIpAvailabilitiesRequest, ShowNetworkIpAvailabilitiesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowNetworkIpAvailabilitiesRequest.class,
                    ShowNetworkIpAvailabilitiesResponse.class)
                .withName("ShowNetworkIpAvailabilities")
                .withUri("/v2.0/network-ip-availabilities/{network_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("network_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowNetworkIpAvailabilitiesRequest::getNetworkId,
                ShowNetworkIpAvailabilitiesRequest::setNetworkId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowPrivateipRequest, ShowPrivateipResponse> showPrivateip =
        genForShowPrivateip();

    private static HttpRequestDef<ShowPrivateipRequest, ShowPrivateipResponse> genForShowPrivateip() {
        // basic
        HttpRequestDef.Builder<ShowPrivateipRequest, ShowPrivateipResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowPrivateipRequest.class, ShowPrivateipResponse.class)
                .withName("ShowPrivateip")
                .withUri("/v1/{project_id}/privateips/{privateip_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("privateip_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPrivateipRequest::getPrivateipId, ShowPrivateipRequest::setPrivateipId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<NeutronAddRouterInterfaceRequest, NeutronAddRouterInterfaceResponse> neutronAddRouterInterface =
        genForNeutronAddRouterInterface();

    private static HttpRequestDef<NeutronAddRouterInterfaceRequest, NeutronAddRouterInterfaceResponse> genForNeutronAddRouterInterface() {
        // basic
        HttpRequestDef.Builder<NeutronAddRouterInterfaceRequest, NeutronAddRouterInterfaceResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    NeutronAddRouterInterfaceRequest.class,
                    NeutronAddRouterInterfaceResponse.class)
                .withName("NeutronAddRouterInterface")
                .withUri("/v2.0/routers/{router_id}/add_router_interface")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("router_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(NeutronAddRouterInterfaceRequest::getRouterId,
                NeutronAddRouterInterfaceRequest::setRouterId));
        builder.<RouterInterfaceRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RouterInterfaceRequestBody.class),
            f -> f.withMarshaller(NeutronAddRouterInterfaceRequest::getBody,
                NeutronAddRouterInterfaceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<NeutronCreateNetworkRequest, NeutronCreateNetworkResponse> neutronCreateNetwork =
        genForNeutronCreateNetwork();

    private static HttpRequestDef<NeutronCreateNetworkRequest, NeutronCreateNetworkResponse> genForNeutronCreateNetwork() {
        // basic
        HttpRequestDef.Builder<NeutronCreateNetworkRequest, NeutronCreateNetworkResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, NeutronCreateNetworkRequest.class, NeutronCreateNetworkResponse.class)
            .withName("NeutronCreateNetwork")
            .withUri("/v2.0/networks")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<NeutronCreateNetworkRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(NeutronCreateNetworkRequestBody.class),
            f -> f.withMarshaller(NeutronCreateNetworkRequest::getBody, NeutronCreateNetworkRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<NeutronCreatePortRequest, NeutronCreatePortResponse> neutronCreatePort =
        genForNeutronCreatePort();

    private static HttpRequestDef<NeutronCreatePortRequest, NeutronCreatePortResponse> genForNeutronCreatePort() {
        // basic
        HttpRequestDef.Builder<NeutronCreatePortRequest, NeutronCreatePortResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, NeutronCreatePortRequest.class, NeutronCreatePortResponse.class)
                .withName("NeutronCreatePort")
                .withUri("/v2.0/ports")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<NeutronCreatePortRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(NeutronCreatePortRequestBody.class),
            f -> f.withMarshaller(NeutronCreatePortRequest::getBody, NeutronCreatePortRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<NeutronCreateRouterRequest, NeutronCreateRouterResponse> neutronCreateRouter =
        genForNeutronCreateRouter();

    private static HttpRequestDef<NeutronCreateRouterRequest, NeutronCreateRouterResponse> genForNeutronCreateRouter() {
        // basic
        HttpRequestDef.Builder<NeutronCreateRouterRequest, NeutronCreateRouterResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, NeutronCreateRouterRequest.class, NeutronCreateRouterResponse.class)
                .withName("NeutronCreateRouter")
                .withUri("/v2.0/routers")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<NeutronCreateRouterRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(NeutronCreateRouterRequestBody.class),
            f -> f.withMarshaller(NeutronCreateRouterRequest::getBody, NeutronCreateRouterRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<NeutronCreateSecurityGroupRequest, NeutronCreateSecurityGroupResponse> neutronCreateSecurityGroup =
        genForNeutronCreateSecurityGroup();

    private static HttpRequestDef<NeutronCreateSecurityGroupRequest, NeutronCreateSecurityGroupResponse> genForNeutronCreateSecurityGroup() {
        // basic
        HttpRequestDef.Builder<NeutronCreateSecurityGroupRequest, NeutronCreateSecurityGroupResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    NeutronCreateSecurityGroupRequest.class,
                    NeutronCreateSecurityGroupResponse.class)
                .withName("NeutronCreateSecurityGroup")
                .withUri("/v2.0/security-groups")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<NeutronCreateSecurityGroupRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(NeutronCreateSecurityGroupRequestBody.class),
            f -> f.withMarshaller(NeutronCreateSecurityGroupRequest::getBody,
                NeutronCreateSecurityGroupRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<NeutronCreateSecurityGroupRuleRequest, NeutronCreateSecurityGroupRuleResponse> neutronCreateSecurityGroupRule =
        genForNeutronCreateSecurityGroupRule();

    private static HttpRequestDef<NeutronCreateSecurityGroupRuleRequest, NeutronCreateSecurityGroupRuleResponse> genForNeutronCreateSecurityGroupRule() {
        // basic
        HttpRequestDef.Builder<NeutronCreateSecurityGroupRuleRequest, NeutronCreateSecurityGroupRuleResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    NeutronCreateSecurityGroupRuleRequest.class,
                    NeutronCreateSecurityGroupRuleResponse.class)
                .withName("NeutronCreateSecurityGroupRule")
                .withUri("/v2.0/security-group-rules")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<NeutronCreateSecurityGroupRuleRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(NeutronCreateSecurityGroupRuleRequestBody.class),
            f -> f.withMarshaller(NeutronCreateSecurityGroupRuleRequest::getBody,
                NeutronCreateSecurityGroupRuleRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<NeutronCreateSubnetRequest, NeutronCreateSubnetResponse> neutronCreateSubnet =
        genForNeutronCreateSubnet();

    private static HttpRequestDef<NeutronCreateSubnetRequest, NeutronCreateSubnetResponse> genForNeutronCreateSubnet() {
        // basic
        HttpRequestDef.Builder<NeutronCreateSubnetRequest, NeutronCreateSubnetResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, NeutronCreateSubnetRequest.class, NeutronCreateSubnetResponse.class)
                .withName("NeutronCreateSubnet")
                .withUri("/v2.0/subnets")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<NeutronCreateSubnetRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(NeutronCreateSubnetRequestBody.class),
            f -> f.withMarshaller(NeutronCreateSubnetRequest::getBody, NeutronCreateSubnetRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<NeutronDeleteNetworkRequest, NeutronDeleteNetworkResponse> neutronDeleteNetwork =
        genForNeutronDeleteNetwork();

    private static HttpRequestDef<NeutronDeleteNetworkRequest, NeutronDeleteNetworkResponse> genForNeutronDeleteNetwork() {
        // basic
        HttpRequestDef.Builder<NeutronDeleteNetworkRequest, NeutronDeleteNetworkResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, NeutronDeleteNetworkRequest.class, NeutronDeleteNetworkResponse.class)
            .withName("NeutronDeleteNetwork")
            .withUri("/v2.0/networks/{network_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("network_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(NeutronDeleteNetworkRequest::getNetworkId,
                NeutronDeleteNetworkRequest::setNetworkId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<NeutronDeletePortRequest, NeutronDeletePortResponse> neutronDeletePort =
        genForNeutronDeletePort();

    private static HttpRequestDef<NeutronDeletePortRequest, NeutronDeletePortResponse> genForNeutronDeletePort() {
        // basic
        HttpRequestDef.Builder<NeutronDeletePortRequest, NeutronDeletePortResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, NeutronDeletePortRequest.class, NeutronDeletePortResponse.class)
                .withName("NeutronDeletePort")
                .withUri("/v2.0/ports/{port_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("port_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(NeutronDeletePortRequest::getPortId, NeutronDeletePortRequest::setPortId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<NeutronDeleteRouterRequest, NeutronDeleteRouterResponse> neutronDeleteRouter =
        genForNeutronDeleteRouter();

    private static HttpRequestDef<NeutronDeleteRouterRequest, NeutronDeleteRouterResponse> genForNeutronDeleteRouter() {
        // basic
        HttpRequestDef.Builder<NeutronDeleteRouterRequest, NeutronDeleteRouterResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, NeutronDeleteRouterRequest.class, NeutronDeleteRouterResponse.class)
            .withName("NeutronDeleteRouter")
            .withUri("/v2.0/routers/{router_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("router_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(NeutronDeleteRouterRequest::getRouterId, NeutronDeleteRouterRequest::setRouterId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<NeutronDeleteSecurityGroupRequest, NeutronDeleteSecurityGroupResponse> neutronDeleteSecurityGroup =
        genForNeutronDeleteSecurityGroup();

    private static HttpRequestDef<NeutronDeleteSecurityGroupRequest, NeutronDeleteSecurityGroupResponse> genForNeutronDeleteSecurityGroup() {
        // basic
        HttpRequestDef.Builder<NeutronDeleteSecurityGroupRequest, NeutronDeleteSecurityGroupResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    NeutronDeleteSecurityGroupRequest.class,
                    NeutronDeleteSecurityGroupResponse.class)
                .withName("NeutronDeleteSecurityGroup")
                .withUri("/v2.0/security-groups/{security_group_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("security_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(NeutronDeleteSecurityGroupRequest::getSecurityGroupId,
                NeutronDeleteSecurityGroupRequest::setSecurityGroupId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<NeutronDeleteSecurityGroupRuleRequest, NeutronDeleteSecurityGroupRuleResponse> neutronDeleteSecurityGroupRule =
        genForNeutronDeleteSecurityGroupRule();

    private static HttpRequestDef<NeutronDeleteSecurityGroupRuleRequest, NeutronDeleteSecurityGroupRuleResponse> genForNeutronDeleteSecurityGroupRule() {
        // basic
        HttpRequestDef.Builder<NeutronDeleteSecurityGroupRuleRequest, NeutronDeleteSecurityGroupRuleResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    NeutronDeleteSecurityGroupRuleRequest.class,
                    NeutronDeleteSecurityGroupRuleResponse.class)
                .withName("NeutronDeleteSecurityGroupRule")
                .withUri("/v2.0/security-group-rules/{security_group_rule_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("security_group_rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(NeutronDeleteSecurityGroupRuleRequest::getSecurityGroupRuleId,
                NeutronDeleteSecurityGroupRuleRequest::setSecurityGroupRuleId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<NeutronDeleteSubnetRequest, NeutronDeleteSubnetResponse> neutronDeleteSubnet =
        genForNeutronDeleteSubnet();

    private static HttpRequestDef<NeutronDeleteSubnetRequest, NeutronDeleteSubnetResponse> genForNeutronDeleteSubnet() {
        // basic
        HttpRequestDef.Builder<NeutronDeleteSubnetRequest, NeutronDeleteSubnetResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, NeutronDeleteSubnetRequest.class, NeutronDeleteSubnetResponse.class)
            .withName("NeutronDeleteSubnet")
            .withUri("/v2.0/subnets/{subnet_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("subnet_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(NeutronDeleteSubnetRequest::getSubnetId, NeutronDeleteSubnetRequest::setSubnetId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<NeutronListNetworksRequest, NeutronListNetworksResponse> neutronListNetworks =
        genForNeutronListNetworks();

    private static HttpRequestDef<NeutronListNetworksRequest, NeutronListNetworksResponse> genForNeutronListNetworks() {
        // basic
        HttpRequestDef.Builder<NeutronListNetworksRequest, NeutronListNetworksResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, NeutronListNetworksRequest.class, NeutronListNetworksResponse.class)
                .withName("NeutronListNetworks")
                .withUri("/v2.0/networks")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(NeutronListNetworksRequest::getLimit, NeutronListNetworksRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(NeutronListNetworksRequest::getMarker, NeutronListNetworksRequest::setMarker));
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(NeutronListNetworksRequest::getId, NeutronListNetworksRequest::setId));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(NeutronListNetworksRequest::getName, NeutronListNetworksRequest::setName));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(NeutronListNetworksRequest::getStatus, NeutronListNetworksRequest::setStatus));
        builder.<Boolean>withRequestField("shared",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(NeutronListNetworksRequest::getShared, NeutronListNetworksRequest::setShared));
        builder.<Boolean>withRequestField("router:external",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(NeutronListNetworksRequest::getRouterExternal,
                NeutronListNetworksRequest::setRouterExternal));
        builder.<Boolean>withRequestField("admin_state_up",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(NeutronListNetworksRequest::getAdminStateUp,
                NeutronListNetworksRequest::setAdminStateUp));
        builder.<String>withRequestField("provider:network_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(NeutronListNetworksRequest::getProviderNetworkType,
                NeutronListNetworksRequest::setProviderNetworkType));
        builder.<String>withRequestField("tenant_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(NeutronListNetworksRequest::getTenantId, NeutronListNetworksRequest::setTenantId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<NeutronListPortsRequest, NeutronListPortsResponse> neutronListPorts =
        genForNeutronListPorts();

    private static HttpRequestDef<NeutronListPortsRequest, NeutronListPortsResponse> genForNeutronListPorts() {
        // basic
        HttpRequestDef.Builder<NeutronListPortsRequest, NeutronListPortsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, NeutronListPortsRequest.class, NeutronListPortsResponse.class)
                .withName("NeutronListPorts")
                .withUri("/v2.0/ports")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(NeutronListPortsRequest::getLimit, NeutronListPortsRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(NeutronListPortsRequest::getMarker, NeutronListPortsRequest::setMarker));
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(NeutronListPortsRequest::getId, NeutronListPortsRequest::setId));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(NeutronListPortsRequest::getName, NeutronListPortsRequest::setName));
        builder.<Boolean>withRequestField("admin_state_up",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(NeutronListPortsRequest::getAdminStateUp, NeutronListPortsRequest::setAdminStateUp));
        builder.<String>withRequestField("network_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(NeutronListPortsRequest::getNetworkId, NeutronListPortsRequest::setNetworkId));
        builder.<String>withRequestField("mac_address",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(NeutronListPortsRequest::getMacAddress, NeutronListPortsRequest::setMacAddress));
        builder.<String>withRequestField("device_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(NeutronListPortsRequest::getDeviceId, NeutronListPortsRequest::setDeviceId));
        builder.<String>withRequestField("device_owner",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(NeutronListPortsRequest::getDeviceOwner, NeutronListPortsRequest::setDeviceOwner));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(NeutronListPortsRequest::getStatus, NeutronListPortsRequest::setStatus));
        builder.<List<String>>withRequestField("security_groups",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(NeutronListPortsRequest::getSecurityGroups,
                NeutronListPortsRequest::setSecurityGroups));
        builder.<List<String>>withRequestField("fixed_ips",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(NeutronListPortsRequest::getFixedIps, NeutronListPortsRequest::setFixedIps));
        builder.<String>withRequestField("tenant_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(NeutronListPortsRequest::getTenantId, NeutronListPortsRequest::setTenantId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<NeutronListRoutersRequest, NeutronListRoutersResponse> neutronListRouters =
        genForNeutronListRouters();

    private static HttpRequestDef<NeutronListRoutersRequest, NeutronListRoutersResponse> genForNeutronListRouters() {
        // basic
        HttpRequestDef.Builder<NeutronListRoutersRequest, NeutronListRoutersResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, NeutronListRoutersRequest.class, NeutronListRoutersResponse.class)
                .withName("NeutronListRouters")
                .withUri("/v2.0/routers")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(NeutronListRoutersRequest::getLimit, NeutronListRoutersRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(NeutronListRoutersRequest::getMarker, NeutronListRoutersRequest::setMarker));
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(NeutronListRoutersRequest::getId, NeutronListRoutersRequest::setId));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(NeutronListRoutersRequest::getStatus, NeutronListRoutersRequest::setStatus));
        builder.<String>withRequestField("tenant_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(NeutronListRoutersRequest::getTenantId, NeutronListRoutersRequest::setTenantId));
        builder.<Boolean>withRequestField("admin_state_up",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(NeutronListRoutersRequest::getAdminStateUp,
                NeutronListRoutersRequest::setAdminStateUp));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<NeutronListSecurityGroupRulesRequest, NeutronListSecurityGroupRulesResponse> neutronListSecurityGroupRules =
        genForNeutronListSecurityGroupRules();

    private static HttpRequestDef<NeutronListSecurityGroupRulesRequest, NeutronListSecurityGroupRulesResponse> genForNeutronListSecurityGroupRules() {
        // basic
        HttpRequestDef.Builder<NeutronListSecurityGroupRulesRequest, NeutronListSecurityGroupRulesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    NeutronListSecurityGroupRulesRequest.class,
                    NeutronListSecurityGroupRulesResponse.class)
                .withName("NeutronListSecurityGroupRules")
                .withUri("/v2.0/security-group-rules")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(NeutronListSecurityGroupRulesRequest::getLimit,
                NeutronListSecurityGroupRulesRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(NeutronListSecurityGroupRulesRequest::getMarker,
                NeutronListSecurityGroupRulesRequest::setMarker));
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(NeutronListSecurityGroupRulesRequest::getId,
                NeutronListSecurityGroupRulesRequest::setId));
        builder.<String>withRequestField("direction",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(NeutronListSecurityGroupRulesRequest::getDirection,
                NeutronListSecurityGroupRulesRequest::setDirection));
        builder.<String>withRequestField("protocol",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(NeutronListSecurityGroupRulesRequest::getProtocol,
                NeutronListSecurityGroupRulesRequest::setProtocol));
        builder.<String>withRequestField("ethertype",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(NeutronListSecurityGroupRulesRequest::getEthertype,
                NeutronListSecurityGroupRulesRequest::setEthertype));
        builder.<String>withRequestField("description",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(NeutronListSecurityGroupRulesRequest::getDescription,
                NeutronListSecurityGroupRulesRequest::setDescription));
        builder.<String>withRequestField("remote_ip_prefix",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(NeutronListSecurityGroupRulesRequest::getRemoteIpPrefix,
                NeutronListSecurityGroupRulesRequest::setRemoteIpPrefix));
        builder.<String>withRequestField("remote_group_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(NeutronListSecurityGroupRulesRequest::getRemoteGroupId,
                NeutronListSecurityGroupRulesRequest::setRemoteGroupId));
        builder.<String>withRequestField("security_group_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(NeutronListSecurityGroupRulesRequest::getSecurityGroupId,
                NeutronListSecurityGroupRulesRequest::setSecurityGroupId));
        builder.<String>withRequestField("port_range_max",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(NeutronListSecurityGroupRulesRequest::getPortRangeMax,
                NeutronListSecurityGroupRulesRequest::setPortRangeMax));
        builder.<String>withRequestField("port_range_min",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(NeutronListSecurityGroupRulesRequest::getPortRangeMin,
                NeutronListSecurityGroupRulesRequest::setPortRangeMin));
        builder.<String>withRequestField("tenant_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(NeutronListSecurityGroupRulesRequest::getTenantId,
                NeutronListSecurityGroupRulesRequest::setTenantId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<NeutronListSecurityGroupsRequest, NeutronListSecurityGroupsResponse> neutronListSecurityGroups =
        genForNeutronListSecurityGroups();

    private static HttpRequestDef<NeutronListSecurityGroupsRequest, NeutronListSecurityGroupsResponse> genForNeutronListSecurityGroups() {
        // basic
        HttpRequestDef.Builder<NeutronListSecurityGroupsRequest, NeutronListSecurityGroupsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    NeutronListSecurityGroupsRequest.class,
                    NeutronListSecurityGroupsResponse.class)
                .withName("NeutronListSecurityGroups")
                .withUri("/v2.0/security-groups")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(NeutronListSecurityGroupsRequest::getLimit,
                NeutronListSecurityGroupsRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(NeutronListSecurityGroupsRequest::getMarker,
                NeutronListSecurityGroupsRequest::setMarker));
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(NeutronListSecurityGroupsRequest::getId, NeutronListSecurityGroupsRequest::setId));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(NeutronListSecurityGroupsRequest::getName,
                NeutronListSecurityGroupsRequest::setName));
        builder.<String>withRequestField("description",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(NeutronListSecurityGroupsRequest::getDescription,
                NeutronListSecurityGroupsRequest::setDescription));
        builder.<String>withRequestField("tenant_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(NeutronListSecurityGroupsRequest::getTenantId,
                NeutronListSecurityGroupsRequest::setTenantId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<NeutronListSubnetsRequest, NeutronListSubnetsResponse> neutronListSubnets =
        genForNeutronListSubnets();

    private static HttpRequestDef<NeutronListSubnetsRequest, NeutronListSubnetsResponse> genForNeutronListSubnets() {
        // basic
        HttpRequestDef.Builder<NeutronListSubnetsRequest, NeutronListSubnetsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, NeutronListSubnetsRequest.class, NeutronListSubnetsResponse.class)
                .withName("NeutronListSubnets")
                .withUri("/v2.0/subnets")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(NeutronListSubnetsRequest::getLimit, NeutronListSubnetsRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(NeutronListSubnetsRequest::getMarker, NeutronListSubnetsRequest::setMarker));
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(NeutronListSubnetsRequest::getId, NeutronListSubnetsRequest::setId));
        builder.<String>withRequestField("cidr",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(NeutronListSubnetsRequest::getCidr, NeutronListSubnetsRequest::setCidr));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(NeutronListSubnetsRequest::getName, NeutronListSubnetsRequest::setName));
        builder.<Boolean>withRequestField("enable_dhcp",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(NeutronListSubnetsRequest::getEnableDhcp, NeutronListSubnetsRequest::setEnableDhcp));
        builder.<String>withRequestField("network_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(NeutronListSubnetsRequest::getNetworkId, NeutronListSubnetsRequest::setNetworkId));
        builder.<Integer>withRequestField("ip_version",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(NeutronListSubnetsRequest::getIpVersion, NeutronListSubnetsRequest::setIpVersion));
        builder.<String>withRequestField("gateway_ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(NeutronListSubnetsRequest::getGatewayIp, NeutronListSubnetsRequest::setGatewayIp));
        builder.<String>withRequestField("tenant_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(NeutronListSubnetsRequest::getTenantId, NeutronListSubnetsRequest::setTenantId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<NeutronRemoveRouterInterfaceRequest, NeutronRemoveRouterInterfaceResponse> neutronRemoveRouterInterface =
        genForNeutronRemoveRouterInterface();

    private static HttpRequestDef<NeutronRemoveRouterInterfaceRequest, NeutronRemoveRouterInterfaceResponse> genForNeutronRemoveRouterInterface() {
        // basic
        HttpRequestDef.Builder<NeutronRemoveRouterInterfaceRequest, NeutronRemoveRouterInterfaceResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    NeutronRemoveRouterInterfaceRequest.class,
                    NeutronRemoveRouterInterfaceResponse.class)
                .withName("NeutronRemoveRouterInterface")
                .withUri("/v2.0/routers/{router_id}/remove_router_interface")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("router_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(NeutronRemoveRouterInterfaceRequest::getRouterId,
                NeutronRemoveRouterInterfaceRequest::setRouterId));
        builder.<RouterInterfaceRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RouterInterfaceRequestBody.class),
            f -> f.withMarshaller(NeutronRemoveRouterInterfaceRequest::getBody,
                NeutronRemoveRouterInterfaceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<NeutronShowNetworkRequest, NeutronShowNetworkResponse> neutronShowNetwork =
        genForNeutronShowNetwork();

    private static HttpRequestDef<NeutronShowNetworkRequest, NeutronShowNetworkResponse> genForNeutronShowNetwork() {
        // basic
        HttpRequestDef.Builder<NeutronShowNetworkRequest, NeutronShowNetworkResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, NeutronShowNetworkRequest.class, NeutronShowNetworkResponse.class)
                .withName("NeutronShowNetwork")
                .withUri("/v2.0/networks/{network_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("network_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(NeutronShowNetworkRequest::getNetworkId, NeutronShowNetworkRequest::setNetworkId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<NeutronShowPortRequest, NeutronShowPortResponse> neutronShowPort =
        genForNeutronShowPort();

    private static HttpRequestDef<NeutronShowPortRequest, NeutronShowPortResponse> genForNeutronShowPort() {
        // basic
        HttpRequestDef.Builder<NeutronShowPortRequest, NeutronShowPortResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, NeutronShowPortRequest.class, NeutronShowPortResponse.class)
                .withName("NeutronShowPort")
                .withUri("/v2.0/ports/{port_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("port_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(NeutronShowPortRequest::getPortId, NeutronShowPortRequest::setPortId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<NeutronShowRouterRequest, NeutronShowRouterResponse> neutronShowRouter =
        genForNeutronShowRouter();

    private static HttpRequestDef<NeutronShowRouterRequest, NeutronShowRouterResponse> genForNeutronShowRouter() {
        // basic
        HttpRequestDef.Builder<NeutronShowRouterRequest, NeutronShowRouterResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, NeutronShowRouterRequest.class, NeutronShowRouterResponse.class)
                .withName("NeutronShowRouter")
                .withUri("/v2.0/routers/{router_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("router_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(NeutronShowRouterRequest::getRouterId, NeutronShowRouterRequest::setRouterId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<NeutronShowSecurityGroupRequest, NeutronShowSecurityGroupResponse> neutronShowSecurityGroup =
        genForNeutronShowSecurityGroup();

    private static HttpRequestDef<NeutronShowSecurityGroupRequest, NeutronShowSecurityGroupResponse> genForNeutronShowSecurityGroup() {
        // basic
        HttpRequestDef.Builder<NeutronShowSecurityGroupRequest, NeutronShowSecurityGroupResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, NeutronShowSecurityGroupRequest.class, NeutronShowSecurityGroupResponse.class)
                .withName("NeutronShowSecurityGroup")
                .withUri("/v2.0/security-groups/{security_group_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("security_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(NeutronShowSecurityGroupRequest::getSecurityGroupId,
                NeutronShowSecurityGroupRequest::setSecurityGroupId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<NeutronShowSecurityGroupRuleRequest, NeutronShowSecurityGroupRuleResponse> neutronShowSecurityGroupRule =
        genForNeutronShowSecurityGroupRule();

    private static HttpRequestDef<NeutronShowSecurityGroupRuleRequest, NeutronShowSecurityGroupRuleResponse> genForNeutronShowSecurityGroupRule() {
        // basic
        HttpRequestDef.Builder<NeutronShowSecurityGroupRuleRequest, NeutronShowSecurityGroupRuleResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    NeutronShowSecurityGroupRuleRequest.class,
                    NeutronShowSecurityGroupRuleResponse.class)
                .withName("NeutronShowSecurityGroupRule")
                .withUri("/v2.0/security-group-rules/{security_group_rule_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("security_group_rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(NeutronShowSecurityGroupRuleRequest::getSecurityGroupRuleId,
                NeutronShowSecurityGroupRuleRequest::setSecurityGroupRuleId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<NeutronShowSubnetRequest, NeutronShowSubnetResponse> neutronShowSubnet =
        genForNeutronShowSubnet();

    private static HttpRequestDef<NeutronShowSubnetRequest, NeutronShowSubnetResponse> genForNeutronShowSubnet() {
        // basic
        HttpRequestDef.Builder<NeutronShowSubnetRequest, NeutronShowSubnetResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, NeutronShowSubnetRequest.class, NeutronShowSubnetResponse.class)
                .withName("NeutronShowSubnet")
                .withUri("/v2.0/subnets/{subnet_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("subnet_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(NeutronShowSubnetRequest::getSubnetId, NeutronShowSubnetRequest::setSubnetId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<NeutronUpdateNetworkRequest, NeutronUpdateNetworkResponse> neutronUpdateNetwork =
        genForNeutronUpdateNetwork();

    private static HttpRequestDef<NeutronUpdateNetworkRequest, NeutronUpdateNetworkResponse> genForNeutronUpdateNetwork() {
        // basic
        HttpRequestDef.Builder<NeutronUpdateNetworkRequest, NeutronUpdateNetworkResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, NeutronUpdateNetworkRequest.class, NeutronUpdateNetworkResponse.class)
            .withName("NeutronUpdateNetwork")
            .withUri("/v2.0/networks/{network_id}")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("network_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(NeutronUpdateNetworkRequest::getNetworkId,
                NeutronUpdateNetworkRequest::setNetworkId));
        builder.<NeutronUpdateNetworkRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(NeutronUpdateNetworkRequestBody.class),
            f -> f.withMarshaller(NeutronUpdateNetworkRequest::getBody, NeutronUpdateNetworkRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<NeutronUpdatePortRequest, NeutronUpdatePortResponse> neutronUpdatePort =
        genForNeutronUpdatePort();

    private static HttpRequestDef<NeutronUpdatePortRequest, NeutronUpdatePortResponse> genForNeutronUpdatePort() {
        // basic
        HttpRequestDef.Builder<NeutronUpdatePortRequest, NeutronUpdatePortResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, NeutronUpdatePortRequest.class, NeutronUpdatePortResponse.class)
                .withName("NeutronUpdatePort")
                .withUri("/v2.0/ports/{port_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("port_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(NeutronUpdatePortRequest::getPortId, NeutronUpdatePortRequest::setPortId));
        builder.<NeutronUpdatePortRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(NeutronUpdatePortRequestBody.class),
            f -> f.withMarshaller(NeutronUpdatePortRequest::getBody, NeutronUpdatePortRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<NeutronUpdateRouterRequest, NeutronUpdateRouterResponse> neutronUpdateRouter =
        genForNeutronUpdateRouter();

    private static HttpRequestDef<NeutronUpdateRouterRequest, NeutronUpdateRouterResponse> genForNeutronUpdateRouter() {
        // basic
        HttpRequestDef.Builder<NeutronUpdateRouterRequest, NeutronUpdateRouterResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, NeutronUpdateRouterRequest.class, NeutronUpdateRouterResponse.class)
                .withName("NeutronUpdateRouter")
                .withUri("/v2.0/routers/{router_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("router_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(NeutronUpdateRouterRequest::getRouterId, NeutronUpdateRouterRequest::setRouterId));
        builder.<NeutronUpdateRouterRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(NeutronUpdateRouterRequestBody.class),
            f -> f.withMarshaller(NeutronUpdateRouterRequest::getBody, NeutronUpdateRouterRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<NeutronUpdateSecurityGroupRequest, NeutronUpdateSecurityGroupResponse> neutronUpdateSecurityGroup =
        genForNeutronUpdateSecurityGroup();

    private static HttpRequestDef<NeutronUpdateSecurityGroupRequest, NeutronUpdateSecurityGroupResponse> genForNeutronUpdateSecurityGroup() {
        // basic
        HttpRequestDef.Builder<NeutronUpdateSecurityGroupRequest, NeutronUpdateSecurityGroupResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    NeutronUpdateSecurityGroupRequest.class,
                    NeutronUpdateSecurityGroupResponse.class)
                .withName("NeutronUpdateSecurityGroup")
                .withUri("/v2.0/security-groups/{security_group_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("security_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(NeutronUpdateSecurityGroupRequest::getSecurityGroupId,
                NeutronUpdateSecurityGroupRequest::setSecurityGroupId));
        builder.<NeutronUpdateSecurityGroupRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(NeutronUpdateSecurityGroupRequestBody.class),
            f -> f.withMarshaller(NeutronUpdateSecurityGroupRequest::getBody,
                NeutronUpdateSecurityGroupRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<NeutronUpdateSubnetRequest, NeutronUpdateSubnetResponse> neutronUpdateSubnet =
        genForNeutronUpdateSubnet();

    private static HttpRequestDef<NeutronUpdateSubnetRequest, NeutronUpdateSubnetResponse> genForNeutronUpdateSubnet() {
        // basic
        HttpRequestDef.Builder<NeutronUpdateSubnetRequest, NeutronUpdateSubnetResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, NeutronUpdateSubnetRequest.class, NeutronUpdateSubnetResponse.class)
                .withName("NeutronUpdateSubnet")
                .withUri("/v2.0/subnets/{subnet_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("subnet_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(NeutronUpdateSubnetRequest::getSubnetId, NeutronUpdateSubnetRequest::setSubnetId));
        builder.<NeutronUpdateSubnetRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(NeutronUpdateSubnetRequestBody.class),
            f -> f.withMarshaller(NeutronUpdateSubnetRequest::getBody, NeutronUpdateSubnetRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<NeutronAddFirewallRuleRequest, NeutronAddFirewallRuleResponse> neutronAddFirewallRule =
        genForNeutronAddFirewallRule();

    private static HttpRequestDef<NeutronAddFirewallRuleRequest, NeutronAddFirewallRuleResponse> genForNeutronAddFirewallRule() {
        // basic
        HttpRequestDef.Builder<NeutronAddFirewallRuleRequest, NeutronAddFirewallRuleResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, NeutronAddFirewallRuleRequest.class, NeutronAddFirewallRuleResponse.class)
            .withName("NeutronAddFirewallRule")
            .withUri("/v2.0/fwaas/firewall_policies/{firewall_policy_id}/insert_rule")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("firewall_policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(NeutronAddFirewallRuleRequest::getFirewallPolicyId,
                NeutronAddFirewallRuleRequest::setFirewallPolicyId));
        builder.<NeutronInsertFirewallRuleRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(NeutronInsertFirewallRuleRequestBody.class),
            f -> f.withMarshaller(NeutronAddFirewallRuleRequest::getBody, NeutronAddFirewallRuleRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<NeutronCreateFirewallGroupRequest, NeutronCreateFirewallGroupResponse> neutronCreateFirewallGroup =
        genForNeutronCreateFirewallGroup();

    private static HttpRequestDef<NeutronCreateFirewallGroupRequest, NeutronCreateFirewallGroupResponse> genForNeutronCreateFirewallGroup() {
        // basic
        HttpRequestDef.Builder<NeutronCreateFirewallGroupRequest, NeutronCreateFirewallGroupResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    NeutronCreateFirewallGroupRequest.class,
                    NeutronCreateFirewallGroupResponse.class)
                .withName("NeutronCreateFirewallGroup")
                .withUri("/v2.0/fwaas/firewall_groups")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<NeutronCreateFirewallGroupRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(NeutronCreateFirewallGroupRequestBody.class),
            f -> f.withMarshaller(NeutronCreateFirewallGroupRequest::getBody,
                NeutronCreateFirewallGroupRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<NeutronCreateFirewallPolicyRequest, NeutronCreateFirewallPolicyResponse> neutronCreateFirewallPolicy =
        genForNeutronCreateFirewallPolicy();

    private static HttpRequestDef<NeutronCreateFirewallPolicyRequest, NeutronCreateFirewallPolicyResponse> genForNeutronCreateFirewallPolicy() {
        // basic
        HttpRequestDef.Builder<NeutronCreateFirewallPolicyRequest, NeutronCreateFirewallPolicyResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    NeutronCreateFirewallPolicyRequest.class,
                    NeutronCreateFirewallPolicyResponse.class)
                .withName("NeutronCreateFirewallPolicy")
                .withUri("/v2.0/fwaas/firewall_policies")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<NeutronCreateFirewallPolicyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(NeutronCreateFirewallPolicyRequestBody.class),
            f -> f.withMarshaller(NeutronCreateFirewallPolicyRequest::getBody,
                NeutronCreateFirewallPolicyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<NeutronCreateFirewallRuleRequest, NeutronCreateFirewallRuleResponse> neutronCreateFirewallRule =
        genForNeutronCreateFirewallRule();

    private static HttpRequestDef<NeutronCreateFirewallRuleRequest, NeutronCreateFirewallRuleResponse> genForNeutronCreateFirewallRule() {
        // basic
        HttpRequestDef.Builder<NeutronCreateFirewallRuleRequest, NeutronCreateFirewallRuleResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    NeutronCreateFirewallRuleRequest.class,
                    NeutronCreateFirewallRuleResponse.class)
                .withName("NeutronCreateFirewallRule")
                .withUri("/v2.0/fwaas/firewall_rules")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<NeutronCreateFirewallRuleRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(NeutronCreateFirewallRuleRequestBody.class),
            f -> f.withMarshaller(NeutronCreateFirewallRuleRequest::getBody,
                NeutronCreateFirewallRuleRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<NeutronDeleteFirewallGroupRequest, NeutronDeleteFirewallGroupResponse> neutronDeleteFirewallGroup =
        genForNeutronDeleteFirewallGroup();

    private static HttpRequestDef<NeutronDeleteFirewallGroupRequest, NeutronDeleteFirewallGroupResponse> genForNeutronDeleteFirewallGroup() {
        // basic
        HttpRequestDef.Builder<NeutronDeleteFirewallGroupRequest, NeutronDeleteFirewallGroupResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    NeutronDeleteFirewallGroupRequest.class,
                    NeutronDeleteFirewallGroupResponse.class)
                .withName("NeutronDeleteFirewallGroup")
                .withUri("/v2.0/fwaas/firewall_groups/{firewall_group_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("firewall_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(NeutronDeleteFirewallGroupRequest::getFirewallGroupId,
                NeutronDeleteFirewallGroupRequest::setFirewallGroupId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<NeutronDeleteFirewallPolicyRequest, NeutronDeleteFirewallPolicyResponse> neutronDeleteFirewallPolicy =
        genForNeutronDeleteFirewallPolicy();

    private static HttpRequestDef<NeutronDeleteFirewallPolicyRequest, NeutronDeleteFirewallPolicyResponse> genForNeutronDeleteFirewallPolicy() {
        // basic
        HttpRequestDef.Builder<NeutronDeleteFirewallPolicyRequest, NeutronDeleteFirewallPolicyResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    NeutronDeleteFirewallPolicyRequest.class,
                    NeutronDeleteFirewallPolicyResponse.class)
                .withName("NeutronDeleteFirewallPolicy")
                .withUri("/v2.0/fwaas/firewall_policies/{firewall_policy_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("firewall_policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(NeutronDeleteFirewallPolicyRequest::getFirewallPolicyId,
                NeutronDeleteFirewallPolicyRequest::setFirewallPolicyId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<NeutronDeleteFirewallRuleRequest, NeutronDeleteFirewallRuleResponse> neutronDeleteFirewallRule =
        genForNeutronDeleteFirewallRule();

    private static HttpRequestDef<NeutronDeleteFirewallRuleRequest, NeutronDeleteFirewallRuleResponse> genForNeutronDeleteFirewallRule() {
        // basic
        HttpRequestDef.Builder<NeutronDeleteFirewallRuleRequest, NeutronDeleteFirewallRuleResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    NeutronDeleteFirewallRuleRequest.class,
                    NeutronDeleteFirewallRuleResponse.class)
                .withName("NeutronDeleteFirewallRule")
                .withUri("/v2.0/fwaas/firewall_rules/{firewall_rule_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("firewall_rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(NeutronDeleteFirewallRuleRequest::getFirewallRuleId,
                NeutronDeleteFirewallRuleRequest::setFirewallRuleId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<NeutronListFirewallGroupsRequest, NeutronListFirewallGroupsResponse> neutronListFirewallGroups =
        genForNeutronListFirewallGroups();

    private static HttpRequestDef<NeutronListFirewallGroupsRequest, NeutronListFirewallGroupsResponse> genForNeutronListFirewallGroups() {
        // basic
        HttpRequestDef.Builder<NeutronListFirewallGroupsRequest, NeutronListFirewallGroupsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    NeutronListFirewallGroupsRequest.class,
                    NeutronListFirewallGroupsResponse.class)
                .withName("NeutronListFirewallGroups")
                .withUri("/v2.0/fwaas/firewall_groups")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(NeutronListFirewallGroupsRequest::getMarker,
                NeutronListFirewallGroupsRequest::setMarker));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(NeutronListFirewallGroupsRequest::getLimit,
                NeutronListFirewallGroupsRequest::setLimit));
        builder.<List<String>>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(NeutronListFirewallGroupsRequest::getId, NeutronListFirewallGroupsRequest::setId));
        builder.<List<String>>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(NeutronListFirewallGroupsRequest::getName,
                NeutronListFirewallGroupsRequest::setName));
        builder.<List<String>>withRequestField("description",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(NeutronListFirewallGroupsRequest::getDescription,
                NeutronListFirewallGroupsRequest::setDescription));
        builder.<String>withRequestField("ingress_firewall_policy_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(NeutronListFirewallGroupsRequest::getIngressFirewallPolicyId,
                NeutronListFirewallGroupsRequest::setIngressFirewallPolicyId));
        builder.<String>withRequestField("egress_firewall_policy_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(NeutronListFirewallGroupsRequest::getEgressFirewallPolicyId,
                NeutronListFirewallGroupsRequest::setEgressFirewallPolicyId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<NeutronListFirewallPoliciesRequest, NeutronListFirewallPoliciesResponse> neutronListFirewallPolicies =
        genForNeutronListFirewallPolicies();

    private static HttpRequestDef<NeutronListFirewallPoliciesRequest, NeutronListFirewallPoliciesResponse> genForNeutronListFirewallPolicies() {
        // basic
        HttpRequestDef.Builder<NeutronListFirewallPoliciesRequest, NeutronListFirewallPoliciesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    NeutronListFirewallPoliciesRequest.class,
                    NeutronListFirewallPoliciesResponse.class)
                .withName("NeutronListFirewallPolicies")
                .withUri("/v2.0/fwaas/firewall_policies")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(NeutronListFirewallPoliciesRequest::getLimit,
                NeutronListFirewallPoliciesRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(NeutronListFirewallPoliciesRequest::getMarker,
                NeutronListFirewallPoliciesRequest::setMarker));
        builder.<List<String>>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(NeutronListFirewallPoliciesRequest::getId,
                NeutronListFirewallPoliciesRequest::setId));
        builder.<List<String>>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(NeutronListFirewallPoliciesRequest::getName,
                NeutronListFirewallPoliciesRequest::setName));
        builder.<List<String>>withRequestField("description",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(NeutronListFirewallPoliciesRequest::getDescription,
                NeutronListFirewallPoliciesRequest::setDescription));
        builder.<String>withRequestField("tenant_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(NeutronListFirewallPoliciesRequest::getTenantId,
                NeutronListFirewallPoliciesRequest::setTenantId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<NeutronListFirewallRulesRequest, NeutronListFirewallRulesResponse> neutronListFirewallRules =
        genForNeutronListFirewallRules();

    private static HttpRequestDef<NeutronListFirewallRulesRequest, NeutronListFirewallRulesResponse> genForNeutronListFirewallRules() {
        // basic
        HttpRequestDef.Builder<NeutronListFirewallRulesRequest, NeutronListFirewallRulesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, NeutronListFirewallRulesRequest.class, NeutronListFirewallRulesResponse.class)
                .withName("NeutronListFirewallRules")
                .withUri("/v2.0/fwaas/firewall_rules")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(NeutronListFirewallRulesRequest::getMarker,
                NeutronListFirewallRulesRequest::setMarker));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(NeutronListFirewallRulesRequest::getLimit,
                NeutronListFirewallRulesRequest::setLimit));
        builder.<List<String>>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(NeutronListFirewallRulesRequest::getId, NeutronListFirewallRulesRequest::setId));
        builder.<List<String>>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(NeutronListFirewallRulesRequest::getName, NeutronListFirewallRulesRequest::setName));
        builder.<List<String>>withRequestField("description",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(NeutronListFirewallRulesRequest::getDescription,
                NeutronListFirewallRulesRequest::setDescription));
        builder.<String>withRequestField("action",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(NeutronListFirewallRulesRequest::getAction,
                NeutronListFirewallRulesRequest::setAction));
        builder.<String>withRequestField("tenant_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(NeutronListFirewallRulesRequest::getTenantId,
                NeutronListFirewallRulesRequest::setTenantId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<NeutronRemoveFirewallRuleRequest, NeutronRemoveFirewallRuleResponse> neutronRemoveFirewallRule =
        genForNeutronRemoveFirewallRule();

    private static HttpRequestDef<NeutronRemoveFirewallRuleRequest, NeutronRemoveFirewallRuleResponse> genForNeutronRemoveFirewallRule() {
        // basic
        HttpRequestDef.Builder<NeutronRemoveFirewallRuleRequest, NeutronRemoveFirewallRuleResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    NeutronRemoveFirewallRuleRequest.class,
                    NeutronRemoveFirewallRuleResponse.class)
                .withName("NeutronRemoveFirewallRule")
                .withUri("/v2.0/fwaas/firewall_policies/{firewall_policy_id}/remove_rule")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("firewall_policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(NeutronRemoveFirewallRuleRequest::getFirewallPolicyId,
                NeutronRemoveFirewallRuleRequest::setFirewallPolicyId));
        builder.<NeutronRemoveFirewallRuleRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(NeutronRemoveFirewallRuleRequestBody.class),
            f -> f.withMarshaller(NeutronRemoveFirewallRuleRequest::getBody,
                NeutronRemoveFirewallRuleRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<NeutronShowFirewallGroupRequest, NeutronShowFirewallGroupResponse> neutronShowFirewallGroup =
        genForNeutronShowFirewallGroup();

    private static HttpRequestDef<NeutronShowFirewallGroupRequest, NeutronShowFirewallGroupResponse> genForNeutronShowFirewallGroup() {
        // basic
        HttpRequestDef.Builder<NeutronShowFirewallGroupRequest, NeutronShowFirewallGroupResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, NeutronShowFirewallGroupRequest.class, NeutronShowFirewallGroupResponse.class)
                .withName("NeutronShowFirewallGroup")
                .withUri("/v2.0/fwaas/firewall_groups/{firewall_group_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("firewall_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(NeutronShowFirewallGroupRequest::getFirewallGroupId,
                NeutronShowFirewallGroupRequest::setFirewallGroupId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<NeutronShowFirewallPolicyRequest, NeutronShowFirewallPolicyResponse> neutronShowFirewallPolicy =
        genForNeutronShowFirewallPolicy();

    private static HttpRequestDef<NeutronShowFirewallPolicyRequest, NeutronShowFirewallPolicyResponse> genForNeutronShowFirewallPolicy() {
        // basic
        HttpRequestDef.Builder<NeutronShowFirewallPolicyRequest, NeutronShowFirewallPolicyResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    NeutronShowFirewallPolicyRequest.class,
                    NeutronShowFirewallPolicyResponse.class)
                .withName("NeutronShowFirewallPolicy")
                .withUri("/v2.0/fwaas/firewall_policies/{firewall_policy_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("firewall_policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(NeutronShowFirewallPolicyRequest::getFirewallPolicyId,
                NeutronShowFirewallPolicyRequest::setFirewallPolicyId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<NeutronShowFirewallRuleRequest, NeutronShowFirewallRuleResponse> neutronShowFirewallRule =
        genForNeutronShowFirewallRule();

    private static HttpRequestDef<NeutronShowFirewallRuleRequest, NeutronShowFirewallRuleResponse> genForNeutronShowFirewallRule() {
        // basic
        HttpRequestDef.Builder<NeutronShowFirewallRuleRequest, NeutronShowFirewallRuleResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, NeutronShowFirewallRuleRequest.class, NeutronShowFirewallRuleResponse.class)
            .withName("NeutronShowFirewallRule")
            .withUri("/v2.0/fwaas/firewall_rules/{firewall_rule_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("firewall_rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(NeutronShowFirewallRuleRequest::getFirewallRuleId,
                NeutronShowFirewallRuleRequest::setFirewallRuleId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<NeutronUpdateFirewallGroupRequest, NeutronUpdateFirewallGroupResponse> neutronUpdateFirewallGroup =
        genForNeutronUpdateFirewallGroup();

    private static HttpRequestDef<NeutronUpdateFirewallGroupRequest, NeutronUpdateFirewallGroupResponse> genForNeutronUpdateFirewallGroup() {
        // basic
        HttpRequestDef.Builder<NeutronUpdateFirewallGroupRequest, NeutronUpdateFirewallGroupResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    NeutronUpdateFirewallGroupRequest.class,
                    NeutronUpdateFirewallGroupResponse.class)
                .withName("NeutronUpdateFirewallGroup")
                .withUri("/v2.0/fwaas/firewall_groups/{firewall_group_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("firewall_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(NeutronUpdateFirewallGroupRequest::getFirewallGroupId,
                NeutronUpdateFirewallGroupRequest::setFirewallGroupId));
        builder.<NeutronUpdateFirewallGroupRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(NeutronUpdateFirewallGroupRequestBody.class),
            f -> f.withMarshaller(NeutronUpdateFirewallGroupRequest::getBody,
                NeutronUpdateFirewallGroupRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<NeutronUpdateFirewallPolicyRequest, NeutronUpdateFirewallPolicyResponse> neutronUpdateFirewallPolicy =
        genForNeutronUpdateFirewallPolicy();

    private static HttpRequestDef<NeutronUpdateFirewallPolicyRequest, NeutronUpdateFirewallPolicyResponse> genForNeutronUpdateFirewallPolicy() {
        // basic
        HttpRequestDef.Builder<NeutronUpdateFirewallPolicyRequest, NeutronUpdateFirewallPolicyResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    NeutronUpdateFirewallPolicyRequest.class,
                    NeutronUpdateFirewallPolicyResponse.class)
                .withName("NeutronUpdateFirewallPolicy")
                .withUri("/v2.0/fwaas/firewall_policies/{firewall_policy_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("firewall_policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(NeutronUpdateFirewallPolicyRequest::getFirewallPolicyId,
                NeutronUpdateFirewallPolicyRequest::setFirewallPolicyId));
        builder.<NeutronUpdateFirewallPolicyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(NeutronUpdateFirewallPolicyRequestBody.class),
            f -> f.withMarshaller(NeutronUpdateFirewallPolicyRequest::getBody,
                NeutronUpdateFirewallPolicyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<NeutronUpdateFirewallRuleRequest, NeutronUpdateFirewallRuleResponse> neutronUpdateFirewallRule =
        genForNeutronUpdateFirewallRule();

    private static HttpRequestDef<NeutronUpdateFirewallRuleRequest, NeutronUpdateFirewallRuleResponse> genForNeutronUpdateFirewallRule() {
        // basic
        HttpRequestDef.Builder<NeutronUpdateFirewallRuleRequest, NeutronUpdateFirewallRuleResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    NeutronUpdateFirewallRuleRequest.class,
                    NeutronUpdateFirewallRuleResponse.class)
                .withName("NeutronUpdateFirewallRule")
                .withUri("/v2.0/fwaas/firewall_rules/{firewall_rule_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("firewall_rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(NeutronUpdateFirewallRuleRequest::getFirewallRuleId,
                NeutronUpdateFirewallRuleRequest::setFirewallRuleId));
        builder.<NeutronUpdateFirewallRuleRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(NeutronUpdateFirewallRuleRequestBody.class),
            f -> f.withMarshaller(NeutronUpdateFirewallRuleRequest::getBody,
                NeutronUpdateFirewallRuleRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListApiVersionRequest, ListApiVersionResponse> listApiVersion =
        genForListApiVersion();

    private static HttpRequestDef<ListApiVersionRequest, ListApiVersionResponse> genForListApiVersion() {
        // basic
        HttpRequestDef.Builder<ListApiVersionRequest, ListApiVersionResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListApiVersionRequest.class, ListApiVersionResponse.class)
                .withName("ListApiVersion")
                .withUri("/")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchCreateVpcTagsRequest, BatchCreateVpcTagsResponse> batchCreateVpcTags =
        genForBatchCreateVpcTags();

    private static HttpRequestDef<BatchCreateVpcTagsRequest, BatchCreateVpcTagsResponse> genForBatchCreateVpcTags() {
        // basic
        HttpRequestDef.Builder<BatchCreateVpcTagsRequest, BatchCreateVpcTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchCreateVpcTagsRequest.class, BatchCreateVpcTagsResponse.class)
                .withName("BatchCreateVpcTags")
                .withUri("/v2.0/{project_id}/vpcs/{vpc_id}/tags/action")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("vpc_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchCreateVpcTagsRequest::getVpcId, BatchCreateVpcTagsRequest::setVpcId));
        builder.<BatchCreateVpcTagsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchCreateVpcTagsRequestBody.class),
            f -> f.withMarshaller(BatchCreateVpcTagsRequest::getBody, BatchCreateVpcTagsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteVpcTagsRequest, BatchDeleteVpcTagsResponse> batchDeleteVpcTags =
        genForBatchDeleteVpcTags();

    private static HttpRequestDef<BatchDeleteVpcTagsRequest, BatchDeleteVpcTagsResponse> genForBatchDeleteVpcTags() {
        // basic
        HttpRequestDef.Builder<BatchDeleteVpcTagsRequest, BatchDeleteVpcTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchDeleteVpcTagsRequest.class, BatchDeleteVpcTagsResponse.class)
                .withName("BatchDeleteVpcTags")
                .withUri("/v2.0/{project_id}/vpcs/{vpc_id}/tags/action")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("vpc_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeleteVpcTagsRequest::getVpcId, BatchDeleteVpcTagsRequest::setVpcId));
        builder.<BatchDeleteVpcTagsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchDeleteVpcTagsRequestBody.class),
            f -> f.withMarshaller(BatchDeleteVpcTagsRequest::getBody, BatchDeleteVpcTagsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateVpcRequest, CreateVpcResponse> createVpc = genForCreateVpc();

    private static HttpRequestDef<CreateVpcRequest, CreateVpcResponse> genForCreateVpc() {
        // basic
        HttpRequestDef.Builder<CreateVpcRequest, CreateVpcResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateVpcRequest.class, CreateVpcResponse.class)
                .withName("CreateVpc")
                .withUri("/v1/{project_id}/vpcs")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<CreateVpcRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateVpcRequestBody.class),
            f -> f.withMarshaller(CreateVpcRequest::getBody, CreateVpcRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateVpcResourceTagRequest, CreateVpcResourceTagResponse> createVpcResourceTag =
        genForCreateVpcResourceTag();

    private static HttpRequestDef<CreateVpcResourceTagRequest, CreateVpcResourceTagResponse> genForCreateVpcResourceTag() {
        // basic
        HttpRequestDef.Builder<CreateVpcResourceTagRequest, CreateVpcResourceTagResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateVpcResourceTagRequest.class, CreateVpcResourceTagResponse.class)
            .withName("CreateVpcResourceTag")
            .withUri("/v2.0/{project_id}/vpcs/{vpc_id}/tags")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("vpc_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateVpcResourceTagRequest::getVpcId, CreateVpcResourceTagRequest::setVpcId));
        builder.<CreateVpcResourceTagRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateVpcResourceTagRequestBody.class),
            f -> f.withMarshaller(CreateVpcResourceTagRequest::getBody, CreateVpcResourceTagRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateVpcRouteRequest, CreateVpcRouteResponse> createVpcRoute =
        genForCreateVpcRoute();

    private static HttpRequestDef<CreateVpcRouteRequest, CreateVpcRouteResponse> genForCreateVpcRoute() {
        // basic
        HttpRequestDef.Builder<CreateVpcRouteRequest, CreateVpcRouteResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateVpcRouteRequest.class, CreateVpcRouteResponse.class)
                .withName("CreateVpcRoute")
                .withUri("/v2.0/vpc/routes")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<CreateVpcRouteRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateVpcRouteRequestBody.class),
            f -> f.withMarshaller(CreateVpcRouteRequest::getBody, CreateVpcRouteRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteVpcRequest, DeleteVpcResponse> deleteVpc = genForDeleteVpc();

    private static HttpRequestDef<DeleteVpcRequest, DeleteVpcResponse> genForDeleteVpc() {
        // basic
        HttpRequestDef.Builder<DeleteVpcRequest, DeleteVpcResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteVpcRequest.class, DeleteVpcResponse.class)
                .withName("DeleteVpc")
                .withUri("/v1/{project_id}/vpcs/{vpc_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("vpc_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteVpcRequest::getVpcId, DeleteVpcRequest::setVpcId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteVpcRouteRequest, DeleteVpcRouteResponse> deleteVpcRoute =
        genForDeleteVpcRoute();

    private static HttpRequestDef<DeleteVpcRouteRequest, DeleteVpcRouteResponse> genForDeleteVpcRoute() {
        // basic
        HttpRequestDef.Builder<DeleteVpcRouteRequest, DeleteVpcRouteResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteVpcRouteRequest.class, DeleteVpcRouteResponse.class)
                .withName("DeleteVpcRoute")
                .withUri("/v2.0/vpc/routes/{route_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("route_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteVpcRouteRequest::getRouteId, DeleteVpcRouteRequest::setRouteId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteVpcTagRequest, DeleteVpcTagResponse> deleteVpcTag = genForDeleteVpcTag();

    private static HttpRequestDef<DeleteVpcTagRequest, DeleteVpcTagResponse> genForDeleteVpcTag() {
        // basic
        HttpRequestDef.Builder<DeleteVpcTagRequest, DeleteVpcTagResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteVpcTagRequest.class, DeleteVpcTagResponse.class)
                .withName("DeleteVpcTag")
                .withUri("/v2.0/{project_id}/vpcs/{vpc_id}/tags/{key}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("vpc_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteVpcTagRequest::getVpcId, DeleteVpcTagRequest::setVpcId));
        builder.<String>withRequestField("key",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteVpcTagRequest::getKey, DeleteVpcTagRequest::setKey));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListVpcRoutesRequest, ListVpcRoutesResponse> listVpcRoutes =
        genForListVpcRoutes();

    private static HttpRequestDef<ListVpcRoutesRequest, ListVpcRoutesResponse> genForListVpcRoutes() {
        // basic
        HttpRequestDef.Builder<ListVpcRoutesRequest, ListVpcRoutesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListVpcRoutesRequest.class, ListVpcRoutesResponse.class)
                .withName("ListVpcRoutes")
                .withUri("/v2.0/vpc/routes")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListVpcRoutesRequest::getLimit, ListVpcRoutesRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVpcRoutesRequest::getMarker, ListVpcRoutesRequest::setMarker));
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVpcRoutesRequest::getId, ListVpcRoutesRequest::setId));
        builder.<ListVpcRoutesRequest.TypeEnum>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListVpcRoutesRequest.TypeEnum.class),
            f -> f.withMarshaller(ListVpcRoutesRequest::getType, ListVpcRoutesRequest::setType));
        builder.<String>withRequestField("vpc_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVpcRoutesRequest::getVpcId, ListVpcRoutesRequest::setVpcId));
        builder.<String>withRequestField("destination",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVpcRoutesRequest::getDestination, ListVpcRoutesRequest::setDestination));
        builder.<String>withRequestField("tenant_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVpcRoutesRequest::getTenantId, ListVpcRoutesRequest::setTenantId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListVpcTagsRequest, ListVpcTagsResponse> listVpcTags = genForListVpcTags();

    private static HttpRequestDef<ListVpcTagsRequest, ListVpcTagsResponse> genForListVpcTags() {
        // basic
        HttpRequestDef.Builder<ListVpcTagsRequest, ListVpcTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListVpcTagsRequest.class, ListVpcTagsResponse.class)
                .withName("ListVpcTags")
                .withUri("/v2.0/{project_id}/vpcs/tags")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListVpcsRequest, ListVpcsResponse> listVpcs = genForListVpcs();

    private static HttpRequestDef<ListVpcsRequest, ListVpcsResponse> genForListVpcs() {
        // basic
        HttpRequestDef.Builder<ListVpcsRequest, ListVpcsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListVpcsRequest.class, ListVpcsResponse.class)
                .withName("ListVpcs")
                .withUri("/v1/{project_id}/vpcs")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListVpcsRequest::getLimit, ListVpcsRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVpcsRequest::getMarker, ListVpcsRequest::setMarker));
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVpcsRequest::getId, ListVpcsRequest::setId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVpcsRequest::getEnterpriseProjectId, ListVpcsRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListVpcsByTagsRequest, ListVpcsByTagsResponse> listVpcsByTags =
        genForListVpcsByTags();

    private static HttpRequestDef<ListVpcsByTagsRequest, ListVpcsByTagsResponse> genForListVpcsByTags() {
        // basic
        HttpRequestDef.Builder<ListVpcsByTagsRequest, ListVpcsByTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListVpcsByTagsRequest.class, ListVpcsByTagsResponse.class)
                .withName("ListVpcsByTags")
                .withUri("/v2.0/{project_id}/vpcs/resource_instances/action")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<ListVpcsByTagsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListVpcsByTagsRequestBody.class),
            f -> f.withMarshaller(ListVpcsByTagsRequest::getBody, ListVpcsByTagsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowVpcRequest, ShowVpcResponse> showVpc = genForShowVpc();

    private static HttpRequestDef<ShowVpcRequest, ShowVpcResponse> genForShowVpc() {
        // basic
        HttpRequestDef.Builder<ShowVpcRequest, ShowVpcResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowVpcRequest.class, ShowVpcResponse.class)
                .withName("ShowVpc")
                .withUri("/v1/{project_id}/vpcs/{vpc_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("vpc_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowVpcRequest::getVpcId, ShowVpcRequest::setVpcId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowVpcRouteRequest, ShowVpcRouteResponse> showVpcRoute = genForShowVpcRoute();

    private static HttpRequestDef<ShowVpcRouteRequest, ShowVpcRouteResponse> genForShowVpcRoute() {
        // basic
        HttpRequestDef.Builder<ShowVpcRouteRequest, ShowVpcRouteResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowVpcRouteRequest.class, ShowVpcRouteResponse.class)
                .withName("ShowVpcRoute")
                .withUri("/v2.0/vpc/routes/{route_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("route_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowVpcRouteRequest::getRouteId, ShowVpcRouteRequest::setRouteId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowVpcTagsRequest, ShowVpcTagsResponse> showVpcTags = genForShowVpcTags();

    private static HttpRequestDef<ShowVpcTagsRequest, ShowVpcTagsResponse> genForShowVpcTags() {
        // basic
        HttpRequestDef.Builder<ShowVpcTagsRequest, ShowVpcTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowVpcTagsRequest.class, ShowVpcTagsResponse.class)
                .withName("ShowVpcTags")
                .withUri("/v2.0/{project_id}/vpcs/{vpc_id}/tags")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("vpc_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowVpcTagsRequest::getVpcId, ShowVpcTagsRequest::setVpcId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateVpcRequest, UpdateVpcResponse> updateVpc = genForUpdateVpc();

    private static HttpRequestDef<UpdateVpcRequest, UpdateVpcResponse> genForUpdateVpc() {
        // basic
        HttpRequestDef.Builder<UpdateVpcRequest, UpdateVpcResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateVpcRequest.class, UpdateVpcResponse.class)
                .withName("UpdateVpc")
                .withUri("/v1/{project_id}/vpcs/{vpc_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("vpc_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateVpcRequest::getVpcId, UpdateVpcRequest::setVpcId));
        builder.<UpdateVpcRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateVpcRequestBody.class),
            f -> f.withMarshaller(UpdateVpcRequest::getBody, UpdateVpcRequest::setBody));

        // response

        return builder.build();
    }

}
