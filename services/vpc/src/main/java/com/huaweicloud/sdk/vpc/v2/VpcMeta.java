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
import com.huaweicloud.sdk.vpc.v2.model.BatchCreateSubnetTagsRequest;
import com.huaweicloud.sdk.vpc.v2.model.BatchCreateSubnetTagsRequestBody;
import com.huaweicloud.sdk.vpc.v2.model.BatchCreateSubnetTagsResponse;
import com.huaweicloud.sdk.vpc.v2.model.BatchCreateVpcTagsRequest;
import com.huaweicloud.sdk.vpc.v2.model.BatchCreateVpcTagsRequestBody;
import com.huaweicloud.sdk.vpc.v2.model.BatchCreateVpcTagsResponse;
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
        genForacceptVpcPeering();

    private static HttpRequestDef<AcceptVpcPeeringRequest, AcceptVpcPeeringResponse> genForacceptVpcPeering() {
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
            f -> f.withMarshaller(AcceptVpcPeeringRequest::getPeeringId, (req, v) -> {
                req.setPeeringId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AssociateRouteTableRequest, AssociateRouteTableResponse> associateRouteTable =
        genForassociateRouteTable();

    private static HttpRequestDef<AssociateRouteTableRequest, AssociateRouteTableResponse> genForassociateRouteTable() {
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
            f -> f.withMarshaller(AssociateRouteTableRequest::getRoutetableId, (req, v) -> {
                req.setRoutetableId(v);
            }));
        builder.<RoutetableAssociateReqbody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RoutetableAssociateReqbody.class),
            f -> f.withMarshaller(AssociateRouteTableRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchCreateSubnetTagsRequest, BatchCreateSubnetTagsResponse> batchCreateSubnetTags =
        genForbatchCreateSubnetTags();

    private static HttpRequestDef<BatchCreateSubnetTagsRequest, BatchCreateSubnetTagsResponse> genForbatchCreateSubnetTags() {
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
            f -> f.withMarshaller(BatchCreateSubnetTagsRequest::getSubnetId, (req, v) -> {
                req.setSubnetId(v);
            }));
        builder.<BatchCreateSubnetTagsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchCreateSubnetTagsRequestBody.class),
            f -> f.withMarshaller(BatchCreateSubnetTagsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteSubnetTagsRequest, BatchDeleteSubnetTagsResponse> batchDeleteSubnetTags =
        genForbatchDeleteSubnetTags();

    private static HttpRequestDef<BatchDeleteSubnetTagsRequest, BatchDeleteSubnetTagsResponse> genForbatchDeleteSubnetTags() {
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
            f -> f.withMarshaller(BatchDeleteSubnetTagsRequest::getSubnetId, (req, v) -> {
                req.setSubnetId(v);
            }));
        builder.<BatchDeleteSubnetTagsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchDeleteSubnetTagsRequestBody.class),
            f -> f.withMarshaller(BatchDeleteSubnetTagsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateFlowLogRequest, CreateFlowLogResponse> createFlowLog =
        genForcreateFlowLog();

    private static HttpRequestDef<CreateFlowLogRequest, CreateFlowLogResponse> genForcreateFlowLog() {
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
            f -> f.withMarshaller(CreateFlowLogRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreatePortRequest, CreatePortResponse> createPort = genForcreatePort();

    private static HttpRequestDef<CreatePortRequest, CreatePortResponse> genForcreatePort() {
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
            f -> f.withMarshaller(CreatePortRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateRouteTableRequest, CreateRouteTableResponse> createRouteTable =
        genForcreateRouteTable();

    private static HttpRequestDef<CreateRouteTableRequest, CreateRouteTableResponse> genForcreateRouteTable() {
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
            f -> f.withMarshaller(CreateRouteTableRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateSecurityGroupRequest, CreateSecurityGroupResponse> createSecurityGroup =
        genForcreateSecurityGroup();

    private static HttpRequestDef<CreateSecurityGroupRequest, CreateSecurityGroupResponse> genForcreateSecurityGroup() {
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
            f -> f.withMarshaller(CreateSecurityGroupRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateSecurityGroupRuleRequest, CreateSecurityGroupRuleResponse> createSecurityGroupRule =
        genForcreateSecurityGroupRule();

    private static HttpRequestDef<CreateSecurityGroupRuleRequest, CreateSecurityGroupRuleResponse> genForcreateSecurityGroupRule() {
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
            f -> f.withMarshaller(CreateSecurityGroupRuleRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateSubnetRequest, CreateSubnetResponse> createSubnet = genForcreateSubnet();

    private static HttpRequestDef<CreateSubnetRequest, CreateSubnetResponse> genForcreateSubnet() {
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
            f -> f.withMarshaller(CreateSubnetRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateSubnetTagRequest, CreateSubnetTagResponse> createSubnetTag =
        genForcreateSubnetTag();

    private static HttpRequestDef<CreateSubnetTagRequest, CreateSubnetTagResponse> genForcreateSubnetTag() {
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
            f -> f.withMarshaller(CreateSubnetTagRequest::getSubnetId, (req, v) -> {
                req.setSubnetId(v);
            }));
        builder.<CreateSubnetTagRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateSubnetTagRequestBody.class),
            f -> f.withMarshaller(CreateSubnetTagRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateVpcPeeringRequest, CreateVpcPeeringResponse> createVpcPeering =
        genForcreateVpcPeering();

    private static HttpRequestDef<CreateVpcPeeringRequest, CreateVpcPeeringResponse> genForcreateVpcPeering() {
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
            f -> f.withMarshaller(CreateVpcPeeringRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteFlowLogRequest, DeleteFlowLogResponse> deleteFlowLog =
        genFordeleteFlowLog();

    private static HttpRequestDef<DeleteFlowLogRequest, DeleteFlowLogResponse> genFordeleteFlowLog() {
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
            f -> f.withMarshaller(DeleteFlowLogRequest::getFlowlogId, (req, v) -> {
                req.setFlowlogId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeletePortRequest, DeletePortResponse> deletePort = genFordeletePort();

    private static HttpRequestDef<DeletePortRequest, DeletePortResponse> genFordeletePort() {
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
            f -> f.withMarshaller(DeletePortRequest::getPortId, (req, v) -> {
                req.setPortId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteRouteTableRequest, DeleteRouteTableResponse> deleteRouteTable =
        genFordeleteRouteTable();

    private static HttpRequestDef<DeleteRouteTableRequest, DeleteRouteTableResponse> genFordeleteRouteTable() {
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
            f -> f.withMarshaller(DeleteRouteTableRequest::getRoutetableId, (req, v) -> {
                req.setRoutetableId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteSecurityGroupRequest, DeleteSecurityGroupResponse> deleteSecurityGroup =
        genFordeleteSecurityGroup();

    private static HttpRequestDef<DeleteSecurityGroupRequest, DeleteSecurityGroupResponse> genFordeleteSecurityGroup() {
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
            f -> f.withMarshaller(DeleteSecurityGroupRequest::getSecurityGroupId, (req, v) -> {
                req.setSecurityGroupId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteSecurityGroupRuleRequest, DeleteSecurityGroupRuleResponse> deleteSecurityGroupRule =
        genFordeleteSecurityGroupRule();

    private static HttpRequestDef<DeleteSecurityGroupRuleRequest, DeleteSecurityGroupRuleResponse> genFordeleteSecurityGroupRule() {
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
            f -> f.withMarshaller(DeleteSecurityGroupRuleRequest::getSecurityGroupRuleId, (req, v) -> {
                req.setSecurityGroupRuleId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteSubnetRequest, DeleteSubnetResponse> deleteSubnet = genFordeleteSubnet();

    private static HttpRequestDef<DeleteSubnetRequest, DeleteSubnetResponse> genFordeleteSubnet() {
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
            f -> f.withMarshaller(DeleteSubnetRequest::getVpcId, (req, v) -> {
                req.setVpcId(v);
            }));
        builder.<String>withRequestField("subnet_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteSubnetRequest::getSubnetId, (req, v) -> {
                req.setSubnetId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteSubnetTagRequest, DeleteSubnetTagResponse> deleteSubnetTag =
        genFordeleteSubnetTag();

    private static HttpRequestDef<DeleteSubnetTagRequest, DeleteSubnetTagResponse> genFordeleteSubnetTag() {
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
            f -> f.withMarshaller(DeleteSubnetTagRequest::getSubnetId, (req, v) -> {
                req.setSubnetId(v);
            }));
        builder.<String>withRequestField("key",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteSubnetTagRequest::getKey, (req, v) -> {
                req.setKey(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteVpcPeeringRequest, DeleteVpcPeeringResponse> deleteVpcPeering =
        genFordeleteVpcPeering();

    private static HttpRequestDef<DeleteVpcPeeringRequest, DeleteVpcPeeringResponse> genFordeleteVpcPeering() {
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
            f -> f.withMarshaller(DeleteVpcPeeringRequest::getPeeringId, (req, v) -> {
                req.setPeeringId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DisassociateRouteTableRequest, DisassociateRouteTableResponse> disassociateRouteTable =
        genFordisassociateRouteTable();

    private static HttpRequestDef<DisassociateRouteTableRequest, DisassociateRouteTableResponse> genFordisassociateRouteTable() {
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
            f -> f.withMarshaller(DisassociateRouteTableRequest::getRoutetableId, (req, v) -> {
                req.setRoutetableId(v);
            }));
        builder.<RoutetableAssociateReqbody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RoutetableAssociateReqbody.class),
            f -> f.withMarshaller(DisassociateRouteTableRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListFlowLogsRequest, ListFlowLogsResponse> listFlowLogs = genForlistFlowLogs();

    private static HttpRequestDef<ListFlowLogsRequest, ListFlowLogsResponse> genForlistFlowLogs() {
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
            f -> f.withMarshaller(ListFlowLogsRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFlowLogsRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<String>withRequestField("tenant_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFlowLogsRequest::getTenantId, (req, v) -> {
                req.setTenantId(v);
            }));
        builder.<String>withRequestField("description",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFlowLogsRequest::getDescription, (req, v) -> {
                req.setDescription(v);
            }));
        builder.<ListFlowLogsRequest.ResourceTypeEnum>withRequestField("resource_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListFlowLogsRequest.ResourceTypeEnum.class),
            f -> f.withMarshaller(ListFlowLogsRequest::getResourceType, (req, v) -> {
                req.setResourceType(v);
            }));
        builder.<String>withRequestField("resource_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFlowLogsRequest::getResourceId, (req, v) -> {
                req.setResourceId(v);
            }));
        builder.<ListFlowLogsRequest.TrafficTypeEnum>withRequestField("traffic_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListFlowLogsRequest.TrafficTypeEnum.class),
            f -> f.withMarshaller(ListFlowLogsRequest::getTrafficType, (req, v) -> {
                req.setTrafficType(v);
            }));
        builder.<String>withRequestField("log_group_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFlowLogsRequest::getLogGroupId, (req, v) -> {
                req.setLogGroupId(v);
            }));
        builder.<String>withRequestField("log_topic_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFlowLogsRequest::getLogTopicId, (req, v) -> {
                req.setLogTopicId(v);
            }));
        builder.<ListFlowLogsRequest.LogStoreTypeEnum>withRequestField("log_store_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListFlowLogsRequest.LogStoreTypeEnum.class),
            f -> f.withMarshaller(ListFlowLogsRequest::getLogStoreType, (req, v) -> {
                req.setLogStoreType(v);
            }));
        builder.<ListFlowLogsRequest.StatusEnum>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListFlowLogsRequest.StatusEnum.class),
            f -> f.withMarshaller(ListFlowLogsRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            }));
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFlowLogsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFlowLogsRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPortsRequest, ListPortsResponse> listPorts = genForlistPorts();

    private static HttpRequestDef<ListPortsRequest, ListPortsResponse> genForlistPorts() {
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
            f -> f.withMarshaller(ListPortsRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPortsRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPortsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Boolean>withRequestField("admin_state_up",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListPortsRequest::getAdminStateUp, (req, v) -> {
                req.setAdminStateUp(v);
            }));
        builder.<String>withRequestField("network_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPortsRequest::getNetworkId, (req, v) -> {
                req.setNetworkId(v);
            }));
        builder.<String>withRequestField("mac_address",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPortsRequest::getMacAddress, (req, v) -> {
                req.setMacAddress(v);
            }));
        builder.<String>withRequestField("device_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPortsRequest::getDeviceId, (req, v) -> {
                req.setDeviceId(v);
            }));
        builder.<ListPortsRequest.DeviceOwnerEnum>withRequestField("device_owner",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListPortsRequest.DeviceOwnerEnum.class),
            f -> f.withMarshaller(ListPortsRequest::getDeviceOwner, (req, v) -> {
                req.setDeviceOwner(v);
            }));
        builder.<ListPortsRequest.StatusEnum>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListPortsRequest.StatusEnum.class),
            f -> f.withMarshaller(ListPortsRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            }));
        builder.<List<String>>withRequestField("security_groups",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPortsRequest::getSecurityGroups, (req, v) -> {
                req.setSecurityGroups(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPortsRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));
        builder.<List<String>>withRequestField("fixed_ips",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPortsRequest::getFixedIps, (req, v) -> {
                req.setFixedIps(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPortsRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<Boolean>withRequestField("enable_efi",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListPortsRequest::getEnableEfi, (req, v) -> {
                req.setEnableEfi(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListRouteTablesRequest, ListRouteTablesResponse> listRouteTables =
        genForlistRouteTables();

    private static HttpRequestDef<ListRouteTablesRequest, ListRouteTablesResponse> genForlistRouteTables() {
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
            f -> f.withMarshaller(ListRouteTablesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRouteTablesRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRouteTablesRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<String>withRequestField("vpc_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRouteTablesRequest::getVpcId, (req, v) -> {
                req.setVpcId(v);
            }));
        builder.<String>withRequestField("subnet_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRouteTablesRequest::getSubnetId, (req, v) -> {
                req.setSubnetId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSecurityGroupRulesRequest, ListSecurityGroupRulesResponse> listSecurityGroupRules =
        genForlistSecurityGroupRules();

    private static HttpRequestDef<ListSecurityGroupRulesRequest, ListSecurityGroupRulesResponse> genForlistSecurityGroupRules() {
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
            f -> f.withMarshaller(ListSecurityGroupRulesRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSecurityGroupRulesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("security_group_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSecurityGroupRulesRequest::getSecurityGroupId, (req, v) -> {
                req.setSecurityGroupId(v);
            }));
        builder.<String>withRequestField("remote_ip_prefix",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSecurityGroupRulesRequest::getRemoteIpPrefix, (req, v) -> {
                req.setRemoteIpPrefix(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSecurityGroupsRequest, ListSecurityGroupsResponse> listSecurityGroups =
        genForlistSecurityGroups();

    private static HttpRequestDef<ListSecurityGroupsRequest, ListSecurityGroupsResponse> genForlistSecurityGroups() {
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
            f -> f.withMarshaller(ListSecurityGroupsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSecurityGroupsRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));
        builder.<String>withRequestField("vpc_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSecurityGroupsRequest::getVpcId, (req, v) -> {
                req.setVpcId(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSecurityGroupsRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSubnetTagsRequest, ListSubnetTagsResponse> listSubnetTags =
        genForlistSubnetTags();

    private static HttpRequestDef<ListSubnetTagsRequest, ListSubnetTagsResponse> genForlistSubnetTags() {
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

    public static final HttpRequestDef<ListSubnetsRequest, ListSubnetsResponse> listSubnets = genForlistSubnets();

    private static HttpRequestDef<ListSubnetsRequest, ListSubnetsResponse> genForlistSubnets() {
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
            f -> f.withMarshaller(ListSubnetsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSubnetsRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));
        builder.<String>withRequestField("vpc_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSubnetsRequest::getVpcId, (req, v) -> {
                req.setVpcId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSubnetsByTagsRequest, ListSubnetsByTagsResponse> listSubnetsByTags =
        genForlistSubnetsByTags();

    private static HttpRequestDef<ListSubnetsByTagsRequest, ListSubnetsByTagsResponse> genForlistSubnetsByTags() {
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
            f -> f.withMarshaller(ListSubnetsByTagsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListVpcPeeringsRequest, ListVpcPeeringsResponse> listVpcPeerings =
        genForlistVpcPeerings();

    private static HttpRequestDef<ListVpcPeeringsRequest, ListVpcPeeringsResponse> genForlistVpcPeerings() {
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
            f -> f.withMarshaller(ListVpcPeeringsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVpcPeeringsRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVpcPeeringsRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVpcPeeringsRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<ListVpcPeeringsRequest.StatusEnum>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListVpcPeeringsRequest.StatusEnum.class),
            f -> f.withMarshaller(ListVpcPeeringsRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            }));
        builder.<String>withRequestField("tenant_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVpcPeeringsRequest::getTenantId, (req, v) -> {
                req.setTenantId(v);
            }));
        builder.<String>withRequestField("vpc_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVpcPeeringsRequest::getVpcId, (req, v) -> {
                req.setVpcId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RejectVpcPeeringRequest, RejectVpcPeeringResponse> rejectVpcPeering =
        genForrejectVpcPeering();

    private static HttpRequestDef<RejectVpcPeeringRequest, RejectVpcPeeringResponse> genForrejectVpcPeering() {
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
            f -> f.withMarshaller(RejectVpcPeeringRequest::getPeeringId, (req, v) -> {
                req.setPeeringId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowFlowLogRequest, ShowFlowLogResponse> showFlowLog = genForshowFlowLog();

    private static HttpRequestDef<ShowFlowLogRequest, ShowFlowLogResponse> genForshowFlowLog() {
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
            f -> f.withMarshaller(ShowFlowLogRequest::getFlowlogId, (req, v) -> {
                req.setFlowlogId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowPortRequest, ShowPortResponse> showPort = genForshowPort();

    private static HttpRequestDef<ShowPortRequest, ShowPortResponse> genForshowPort() {
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
            f -> f.withMarshaller(ShowPortRequest::getPortId, (req, v) -> {
                req.setPortId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowQuotaRequest, ShowQuotaResponse> showQuota = genForshowQuota();

    private static HttpRequestDef<ShowQuotaRequest, ShowQuotaResponse> genForshowQuota() {
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
            f -> f.withMarshaller(ShowQuotaRequest::getType, (req, v) -> {
                req.setType(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowRouteTableRequest, ShowRouteTableResponse> showRouteTable =
        genForshowRouteTable();

    private static HttpRequestDef<ShowRouteTableRequest, ShowRouteTableResponse> genForshowRouteTable() {
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
            f -> f.withMarshaller(ShowRouteTableRequest::getRoutetableId, (req, v) -> {
                req.setRoutetableId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowSecurityGroupRequest, ShowSecurityGroupResponse> showSecurityGroup =
        genForshowSecurityGroup();

    private static HttpRequestDef<ShowSecurityGroupRequest, ShowSecurityGroupResponse> genForshowSecurityGroup() {
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
            f -> f.withMarshaller(ShowSecurityGroupRequest::getSecurityGroupId, (req, v) -> {
                req.setSecurityGroupId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowSecurityGroupRuleRequest, ShowSecurityGroupRuleResponse> showSecurityGroupRule =
        genForshowSecurityGroupRule();

    private static HttpRequestDef<ShowSecurityGroupRuleRequest, ShowSecurityGroupRuleResponse> genForshowSecurityGroupRule() {
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
            f -> f.withMarshaller(ShowSecurityGroupRuleRequest::getSecurityGroupRuleId, (req, v) -> {
                req.setSecurityGroupRuleId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowSubnetRequest, ShowSubnetResponse> showSubnet = genForshowSubnet();

    private static HttpRequestDef<ShowSubnetRequest, ShowSubnetResponse> genForshowSubnet() {
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
            f -> f.withMarshaller(ShowSubnetRequest::getSubnetId, (req, v) -> {
                req.setSubnetId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowSubnetTagsRequest, ShowSubnetTagsResponse> showSubnetTags =
        genForshowSubnetTags();

    private static HttpRequestDef<ShowSubnetTagsRequest, ShowSubnetTagsResponse> genForshowSubnetTags() {
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
            f -> f.withMarshaller(ShowSubnetTagsRequest::getSubnetId, (req, v) -> {
                req.setSubnetId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowVpcPeeringRequest, ShowVpcPeeringResponse> showVpcPeering =
        genForshowVpcPeering();

    private static HttpRequestDef<ShowVpcPeeringRequest, ShowVpcPeeringResponse> genForshowVpcPeering() {
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
            f -> f.withMarshaller(ShowVpcPeeringRequest::getPeeringId, (req, v) -> {
                req.setPeeringId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateFlowLogRequest, UpdateFlowLogResponse> updateFlowLog =
        genForupdateFlowLog();

    private static HttpRequestDef<UpdateFlowLogRequest, UpdateFlowLogResponse> genForupdateFlowLog() {
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
            f -> f.withMarshaller(UpdateFlowLogRequest::getFlowlogId, (req, v) -> {
                req.setFlowlogId(v);
            }));
        builder.<UpdateFlowLogReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateFlowLogReqBody.class),
            f -> f.withMarshaller(UpdateFlowLogRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdatePortRequest, UpdatePortResponse> updatePort = genForupdatePort();

    private static HttpRequestDef<UpdatePortRequest, UpdatePortResponse> genForupdatePort() {
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
            f -> f.withMarshaller(UpdatePortRequest::getPortId, (req, v) -> {
                req.setPortId(v);
            }));
        builder.<UpdatePortRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdatePortRequestBody.class),
            f -> f.withMarshaller(UpdatePortRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateRouteTableRequest, UpdateRouteTableResponse> updateRouteTable =
        genForupdateRouteTable();

    private static HttpRequestDef<UpdateRouteTableRequest, UpdateRouteTableResponse> genForupdateRouteTable() {
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
            f -> f.withMarshaller(UpdateRouteTableRequest::getRoutetableId, (req, v) -> {
                req.setRoutetableId(v);
            }));
        builder.<UpdateRoutetableReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateRoutetableReqBody.class),
            f -> f.withMarshaller(UpdateRouteTableRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateSubnetRequest, UpdateSubnetResponse> updateSubnet = genForupdateSubnet();

    private static HttpRequestDef<UpdateSubnetRequest, UpdateSubnetResponse> genForupdateSubnet() {
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
            f -> f.withMarshaller(UpdateSubnetRequest::getVpcId, (req, v) -> {
                req.setVpcId(v);
            }));
        builder.<String>withRequestField("subnet_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateSubnetRequest::getSubnetId, (req, v) -> {
                req.setSubnetId(v);
            }));
        builder.<UpdateSubnetRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateSubnetRequestBody.class),
            f -> f.withMarshaller(UpdateSubnetRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateVpcPeeringRequest, UpdateVpcPeeringResponse> updateVpcPeering =
        genForupdateVpcPeering();

    private static HttpRequestDef<UpdateVpcPeeringRequest, UpdateVpcPeeringResponse> genForupdateVpcPeering() {
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
            f -> f.withMarshaller(UpdateVpcPeeringRequest::getPeeringId, (req, v) -> {
                req.setPeeringId(v);
            }));
        builder.<UpdateVpcPeeringRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateVpcPeeringRequestBody.class),
            f -> f.withMarshaller(UpdateVpcPeeringRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreatePrivateipRequest, CreatePrivateipResponse> createPrivateip =
        genForcreatePrivateip();

    private static HttpRequestDef<CreatePrivateipRequest, CreatePrivateipResponse> genForcreatePrivateip() {
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
            f -> f.withMarshaller(CreatePrivateipRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeletePrivateipRequest, DeletePrivateipResponse> deletePrivateip =
        genFordeletePrivateip();

    private static HttpRequestDef<DeletePrivateipRequest, DeletePrivateipResponse> genFordeletePrivateip() {
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
            f -> f.withMarshaller(DeletePrivateipRequest::getPrivateipId, (req, v) -> {
                req.setPrivateipId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPrivateipsRequest, ListPrivateipsResponse> listPrivateips =
        genForlistPrivateips();

    private static HttpRequestDef<ListPrivateipsRequest, ListPrivateipsResponse> genForlistPrivateips() {
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
            f -> f.withMarshaller(ListPrivateipsRequest::getSubnetId, (req, v) -> {
                req.setSubnetId(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPrivateipsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPrivateipsRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowNetworkIpAvailabilitiesRequest, ShowNetworkIpAvailabilitiesResponse> showNetworkIpAvailabilities =
        genForshowNetworkIpAvailabilities();

    private static HttpRequestDef<ShowNetworkIpAvailabilitiesRequest, ShowNetworkIpAvailabilitiesResponse> genForshowNetworkIpAvailabilities() {
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
            f -> f.withMarshaller(ShowNetworkIpAvailabilitiesRequest::getNetworkId, (req, v) -> {
                req.setNetworkId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowPrivateipRequest, ShowPrivateipResponse> showPrivateip =
        genForshowPrivateip();

    private static HttpRequestDef<ShowPrivateipRequest, ShowPrivateipResponse> genForshowPrivateip() {
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
            f -> f.withMarshaller(ShowPrivateipRequest::getPrivateipId, (req, v) -> {
                req.setPrivateipId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<NeutronAddRouterInterfaceRequest, NeutronAddRouterInterfaceResponse> neutronAddRouterInterface =
        genForneutronAddRouterInterface();

    private static HttpRequestDef<NeutronAddRouterInterfaceRequest, NeutronAddRouterInterfaceResponse> genForneutronAddRouterInterface() {
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
            f -> f.withMarshaller(NeutronAddRouterInterfaceRequest::getRouterId, (req, v) -> {
                req.setRouterId(v);
            }));
        builder.<RouterInterfaceRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RouterInterfaceRequestBody.class),
            f -> f.withMarshaller(NeutronAddRouterInterfaceRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<NeutronCreateNetworkRequest, NeutronCreateNetworkResponse> neutronCreateNetwork =
        genForneutronCreateNetwork();

    private static HttpRequestDef<NeutronCreateNetworkRequest, NeutronCreateNetworkResponse> genForneutronCreateNetwork() {
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
            f -> f.withMarshaller(NeutronCreateNetworkRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<NeutronCreatePortRequest, NeutronCreatePortResponse> neutronCreatePort =
        genForneutronCreatePort();

    private static HttpRequestDef<NeutronCreatePortRequest, NeutronCreatePortResponse> genForneutronCreatePort() {
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
            f -> f.withMarshaller(NeutronCreatePortRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<NeutronCreateRouterRequest, NeutronCreateRouterResponse> neutronCreateRouter =
        genForneutronCreateRouter();

    private static HttpRequestDef<NeutronCreateRouterRequest, NeutronCreateRouterResponse> genForneutronCreateRouter() {
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
            f -> f.withMarshaller(NeutronCreateRouterRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<NeutronCreateSecurityGroupRequest, NeutronCreateSecurityGroupResponse> neutronCreateSecurityGroup =
        genForneutronCreateSecurityGroup();

    private static HttpRequestDef<NeutronCreateSecurityGroupRequest, NeutronCreateSecurityGroupResponse> genForneutronCreateSecurityGroup() {
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
            f -> f.withMarshaller(NeutronCreateSecurityGroupRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<NeutronCreateSecurityGroupRuleRequest, NeutronCreateSecurityGroupRuleResponse> neutronCreateSecurityGroupRule =
        genForneutronCreateSecurityGroupRule();

    private static HttpRequestDef<NeutronCreateSecurityGroupRuleRequest, NeutronCreateSecurityGroupRuleResponse> genForneutronCreateSecurityGroupRule() {
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
            f -> f.withMarshaller(NeutronCreateSecurityGroupRuleRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<NeutronCreateSubnetRequest, NeutronCreateSubnetResponse> neutronCreateSubnet =
        genForneutronCreateSubnet();

    private static HttpRequestDef<NeutronCreateSubnetRequest, NeutronCreateSubnetResponse> genForneutronCreateSubnet() {
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
            f -> f.withMarshaller(NeutronCreateSubnetRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<NeutronDeleteNetworkRequest, NeutronDeleteNetworkResponse> neutronDeleteNetwork =
        genForneutronDeleteNetwork();

    private static HttpRequestDef<NeutronDeleteNetworkRequest, NeutronDeleteNetworkResponse> genForneutronDeleteNetwork() {
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
            f -> f.withMarshaller(NeutronDeleteNetworkRequest::getNetworkId, (req, v) -> {
                req.setNetworkId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<NeutronDeletePortRequest, NeutronDeletePortResponse> neutronDeletePort =
        genForneutronDeletePort();

    private static HttpRequestDef<NeutronDeletePortRequest, NeutronDeletePortResponse> genForneutronDeletePort() {
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
            f -> f.withMarshaller(NeutronDeletePortRequest::getPortId, (req, v) -> {
                req.setPortId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<NeutronDeleteRouterRequest, NeutronDeleteRouterResponse> neutronDeleteRouter =
        genForneutronDeleteRouter();

    private static HttpRequestDef<NeutronDeleteRouterRequest, NeutronDeleteRouterResponse> genForneutronDeleteRouter() {
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
            f -> f.withMarshaller(NeutronDeleteRouterRequest::getRouterId, (req, v) -> {
                req.setRouterId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<NeutronDeleteSecurityGroupRequest, NeutronDeleteSecurityGroupResponse> neutronDeleteSecurityGroup =
        genForneutronDeleteSecurityGroup();

    private static HttpRequestDef<NeutronDeleteSecurityGroupRequest, NeutronDeleteSecurityGroupResponse> genForneutronDeleteSecurityGroup() {
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
            f -> f.withMarshaller(NeutronDeleteSecurityGroupRequest::getSecurityGroupId, (req, v) -> {
                req.setSecurityGroupId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<NeutronDeleteSecurityGroupRuleRequest, NeutronDeleteSecurityGroupRuleResponse> neutronDeleteSecurityGroupRule =
        genForneutronDeleteSecurityGroupRule();

    private static HttpRequestDef<NeutronDeleteSecurityGroupRuleRequest, NeutronDeleteSecurityGroupRuleResponse> genForneutronDeleteSecurityGroupRule() {
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
            f -> f.withMarshaller(NeutronDeleteSecurityGroupRuleRequest::getSecurityGroupRuleId, (req, v) -> {
                req.setSecurityGroupRuleId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<NeutronDeleteSubnetRequest, NeutronDeleteSubnetResponse> neutronDeleteSubnet =
        genForneutronDeleteSubnet();

    private static HttpRequestDef<NeutronDeleteSubnetRequest, NeutronDeleteSubnetResponse> genForneutronDeleteSubnet() {
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
            f -> f.withMarshaller(NeutronDeleteSubnetRequest::getSubnetId, (req, v) -> {
                req.setSubnetId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<NeutronListNetworksRequest, NeutronListNetworksResponse> neutronListNetworks =
        genForneutronListNetworks();

    private static HttpRequestDef<NeutronListNetworksRequest, NeutronListNetworksResponse> genForneutronListNetworks() {
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
            f -> f.withMarshaller(NeutronListNetworksRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(NeutronListNetworksRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(NeutronListNetworksRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(NeutronListNetworksRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(NeutronListNetworksRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            }));
        builder.<Boolean>withRequestField("shared",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(NeutronListNetworksRequest::getShared, (req, v) -> {
                req.setShared(v);
            }));
        builder.<Boolean>withRequestField("router:external",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(NeutronListNetworksRequest::getRouterExternal, (req, v) -> {
                req.setRouterExternal(v);
            }));
        builder.<Boolean>withRequestField("admin_state_up",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(NeutronListNetworksRequest::getAdminStateUp, (req, v) -> {
                req.setAdminStateUp(v);
            }));
        builder.<String>withRequestField("provider:network_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(NeutronListNetworksRequest::getProviderNetworkType, (req, v) -> {
                req.setProviderNetworkType(v);
            }));
        builder.<String>withRequestField("tenant_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(NeutronListNetworksRequest::getTenantId, (req, v) -> {
                req.setTenantId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<NeutronListPortsRequest, NeutronListPortsResponse> neutronListPorts =
        genForneutronListPorts();

    private static HttpRequestDef<NeutronListPortsRequest, NeutronListPortsResponse> genForneutronListPorts() {
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
            f -> f.withMarshaller(NeutronListPortsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(NeutronListPortsRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(NeutronListPortsRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(NeutronListPortsRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<Boolean>withRequestField("admin_state_up",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(NeutronListPortsRequest::getAdminStateUp, (req, v) -> {
                req.setAdminStateUp(v);
            }));
        builder.<String>withRequestField("network_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(NeutronListPortsRequest::getNetworkId, (req, v) -> {
                req.setNetworkId(v);
            }));
        builder.<String>withRequestField("mac_address",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(NeutronListPortsRequest::getMacAddress, (req, v) -> {
                req.setMacAddress(v);
            }));
        builder.<String>withRequestField("device_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(NeutronListPortsRequest::getDeviceId, (req, v) -> {
                req.setDeviceId(v);
            }));
        builder.<String>withRequestField("device_owner",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(NeutronListPortsRequest::getDeviceOwner, (req, v) -> {
                req.setDeviceOwner(v);
            }));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(NeutronListPortsRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            }));
        builder.<List<String>>withRequestField("security_groups",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(NeutronListPortsRequest::getSecurityGroups, (req, v) -> {
                req.setSecurityGroups(v);
            }));
        builder.<List<String>>withRequestField("fixed_ips",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(NeutronListPortsRequest::getFixedIps, (req, v) -> {
                req.setFixedIps(v);
            }));
        builder.<String>withRequestField("tenant_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(NeutronListPortsRequest::getTenantId, (req, v) -> {
                req.setTenantId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<NeutronListRoutersRequest, NeutronListRoutersResponse> neutronListRouters =
        genForneutronListRouters();

    private static HttpRequestDef<NeutronListRoutersRequest, NeutronListRoutersResponse> genForneutronListRouters() {
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
            f -> f.withMarshaller(NeutronListRoutersRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(NeutronListRoutersRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(NeutronListRoutersRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(NeutronListRoutersRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            }));
        builder.<String>withRequestField("tenant_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(NeutronListRoutersRequest::getTenantId, (req, v) -> {
                req.setTenantId(v);
            }));
        builder.<Boolean>withRequestField("admin_state_up",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(NeutronListRoutersRequest::getAdminStateUp, (req, v) -> {
                req.setAdminStateUp(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<NeutronListSecurityGroupRulesRequest, NeutronListSecurityGroupRulesResponse> neutronListSecurityGroupRules =
        genForneutronListSecurityGroupRules();

    private static HttpRequestDef<NeutronListSecurityGroupRulesRequest, NeutronListSecurityGroupRulesResponse> genForneutronListSecurityGroupRules() {
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
            f -> f.withMarshaller(NeutronListSecurityGroupRulesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(NeutronListSecurityGroupRulesRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(NeutronListSecurityGroupRulesRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<String>withRequestField("direction",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(NeutronListSecurityGroupRulesRequest::getDirection, (req, v) -> {
                req.setDirection(v);
            }));
        builder.<String>withRequestField("protocol",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(NeutronListSecurityGroupRulesRequest::getProtocol, (req, v) -> {
                req.setProtocol(v);
            }));
        builder.<String>withRequestField("ethertype",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(NeutronListSecurityGroupRulesRequest::getEthertype, (req, v) -> {
                req.setEthertype(v);
            }));
        builder.<String>withRequestField("description",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(NeutronListSecurityGroupRulesRequest::getDescription, (req, v) -> {
                req.setDescription(v);
            }));
        builder.<String>withRequestField("remote_ip_prefix",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(NeutronListSecurityGroupRulesRequest::getRemoteIpPrefix, (req, v) -> {
                req.setRemoteIpPrefix(v);
            }));
        builder.<String>withRequestField("remote_group_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(NeutronListSecurityGroupRulesRequest::getRemoteGroupId, (req, v) -> {
                req.setRemoteGroupId(v);
            }));
        builder.<String>withRequestField("security_group_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(NeutronListSecurityGroupRulesRequest::getSecurityGroupId, (req, v) -> {
                req.setSecurityGroupId(v);
            }));
        builder.<String>withRequestField("port_range_max",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(NeutronListSecurityGroupRulesRequest::getPortRangeMax, (req, v) -> {
                req.setPortRangeMax(v);
            }));
        builder.<String>withRequestField("port_range_min",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(NeutronListSecurityGroupRulesRequest::getPortRangeMin, (req, v) -> {
                req.setPortRangeMin(v);
            }));
        builder.<String>withRequestField("tenant_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(NeutronListSecurityGroupRulesRequest::getTenantId, (req, v) -> {
                req.setTenantId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<NeutronListSecurityGroupsRequest, NeutronListSecurityGroupsResponse> neutronListSecurityGroups =
        genForneutronListSecurityGroups();

    private static HttpRequestDef<NeutronListSecurityGroupsRequest, NeutronListSecurityGroupsResponse> genForneutronListSecurityGroups() {
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
            f -> f.withMarshaller(NeutronListSecurityGroupsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(NeutronListSecurityGroupsRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(NeutronListSecurityGroupsRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(NeutronListSecurityGroupsRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<String>withRequestField("description",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(NeutronListSecurityGroupsRequest::getDescription, (req, v) -> {
                req.setDescription(v);
            }));
        builder.<String>withRequestField("tenant_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(NeutronListSecurityGroupsRequest::getTenantId, (req, v) -> {
                req.setTenantId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<NeutronListSubnetsRequest, NeutronListSubnetsResponse> neutronListSubnets =
        genForneutronListSubnets();

    private static HttpRequestDef<NeutronListSubnetsRequest, NeutronListSubnetsResponse> genForneutronListSubnets() {
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
            f -> f.withMarshaller(NeutronListSubnetsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(NeutronListSubnetsRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(NeutronListSubnetsRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<String>withRequestField("cidr",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(NeutronListSubnetsRequest::getCidr, (req, v) -> {
                req.setCidr(v);
            }));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(NeutronListSubnetsRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<Boolean>withRequestField("enable_dhcp",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(NeutronListSubnetsRequest::getEnableDhcp, (req, v) -> {
                req.setEnableDhcp(v);
            }));
        builder.<String>withRequestField("network_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(NeutronListSubnetsRequest::getNetworkId, (req, v) -> {
                req.setNetworkId(v);
            }));
        builder.<Integer>withRequestField("ip_version",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(NeutronListSubnetsRequest::getIpVersion, (req, v) -> {
                req.setIpVersion(v);
            }));
        builder.<String>withRequestField("gateway_ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(NeutronListSubnetsRequest::getGatewayIp, (req, v) -> {
                req.setGatewayIp(v);
            }));
        builder.<String>withRequestField("tenant_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(NeutronListSubnetsRequest::getTenantId, (req, v) -> {
                req.setTenantId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<NeutronRemoveRouterInterfaceRequest, NeutronRemoveRouterInterfaceResponse> neutronRemoveRouterInterface =
        genForneutronRemoveRouterInterface();

    private static HttpRequestDef<NeutronRemoveRouterInterfaceRequest, NeutronRemoveRouterInterfaceResponse> genForneutronRemoveRouterInterface() {
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
            f -> f.withMarshaller(NeutronRemoveRouterInterfaceRequest::getRouterId, (req, v) -> {
                req.setRouterId(v);
            }));
        builder.<RouterInterfaceRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RouterInterfaceRequestBody.class),
            f -> f.withMarshaller(NeutronRemoveRouterInterfaceRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<NeutronShowNetworkRequest, NeutronShowNetworkResponse> neutronShowNetwork =
        genForneutronShowNetwork();

    private static HttpRequestDef<NeutronShowNetworkRequest, NeutronShowNetworkResponse> genForneutronShowNetwork() {
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
            f -> f.withMarshaller(NeutronShowNetworkRequest::getNetworkId, (req, v) -> {
                req.setNetworkId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<NeutronShowPortRequest, NeutronShowPortResponse> neutronShowPort =
        genForneutronShowPort();

    private static HttpRequestDef<NeutronShowPortRequest, NeutronShowPortResponse> genForneutronShowPort() {
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
            f -> f.withMarshaller(NeutronShowPortRequest::getPortId, (req, v) -> {
                req.setPortId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<NeutronShowRouterRequest, NeutronShowRouterResponse> neutronShowRouter =
        genForneutronShowRouter();

    private static HttpRequestDef<NeutronShowRouterRequest, NeutronShowRouterResponse> genForneutronShowRouter() {
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
            f -> f.withMarshaller(NeutronShowRouterRequest::getRouterId, (req, v) -> {
                req.setRouterId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<NeutronShowSecurityGroupRequest, NeutronShowSecurityGroupResponse> neutronShowSecurityGroup =
        genForneutronShowSecurityGroup();

    private static HttpRequestDef<NeutronShowSecurityGroupRequest, NeutronShowSecurityGroupResponse> genForneutronShowSecurityGroup() {
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
            f -> f.withMarshaller(NeutronShowSecurityGroupRequest::getSecurityGroupId, (req, v) -> {
                req.setSecurityGroupId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<NeutronShowSecurityGroupRuleRequest, NeutronShowSecurityGroupRuleResponse> neutronShowSecurityGroupRule =
        genForneutronShowSecurityGroupRule();

    private static HttpRequestDef<NeutronShowSecurityGroupRuleRequest, NeutronShowSecurityGroupRuleResponse> genForneutronShowSecurityGroupRule() {
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
            f -> f.withMarshaller(NeutronShowSecurityGroupRuleRequest::getSecurityGroupRuleId, (req, v) -> {
                req.setSecurityGroupRuleId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<NeutronShowSubnetRequest, NeutronShowSubnetResponse> neutronShowSubnet =
        genForneutronShowSubnet();

    private static HttpRequestDef<NeutronShowSubnetRequest, NeutronShowSubnetResponse> genForneutronShowSubnet() {
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
            f -> f.withMarshaller(NeutronShowSubnetRequest::getSubnetId, (req, v) -> {
                req.setSubnetId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<NeutronUpdateNetworkRequest, NeutronUpdateNetworkResponse> neutronUpdateNetwork =
        genForneutronUpdateNetwork();

    private static HttpRequestDef<NeutronUpdateNetworkRequest, NeutronUpdateNetworkResponse> genForneutronUpdateNetwork() {
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
            f -> f.withMarshaller(NeutronUpdateNetworkRequest::getNetworkId, (req, v) -> {
                req.setNetworkId(v);
            }));
        builder.<NeutronUpdateNetworkRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(NeutronUpdateNetworkRequestBody.class),
            f -> f.withMarshaller(NeutronUpdateNetworkRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<NeutronUpdatePortRequest, NeutronUpdatePortResponse> neutronUpdatePort =
        genForneutronUpdatePort();

    private static HttpRequestDef<NeutronUpdatePortRequest, NeutronUpdatePortResponse> genForneutronUpdatePort() {
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
            f -> f.withMarshaller(NeutronUpdatePortRequest::getPortId, (req, v) -> {
                req.setPortId(v);
            }));
        builder.<NeutronUpdatePortRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(NeutronUpdatePortRequestBody.class),
            f -> f.withMarshaller(NeutronUpdatePortRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<NeutronUpdateRouterRequest, NeutronUpdateRouterResponse> neutronUpdateRouter =
        genForneutronUpdateRouter();

    private static HttpRequestDef<NeutronUpdateRouterRequest, NeutronUpdateRouterResponse> genForneutronUpdateRouter() {
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
            f -> f.withMarshaller(NeutronUpdateRouterRequest::getRouterId, (req, v) -> {
                req.setRouterId(v);
            }));
        builder.<NeutronUpdateRouterRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(NeutronUpdateRouterRequestBody.class),
            f -> f.withMarshaller(NeutronUpdateRouterRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<NeutronUpdateSecurityGroupRequest, NeutronUpdateSecurityGroupResponse> neutronUpdateSecurityGroup =
        genForneutronUpdateSecurityGroup();

    private static HttpRequestDef<NeutronUpdateSecurityGroupRequest, NeutronUpdateSecurityGroupResponse> genForneutronUpdateSecurityGroup() {
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
            f -> f.withMarshaller(NeutronUpdateSecurityGroupRequest::getSecurityGroupId, (req, v) -> {
                req.setSecurityGroupId(v);
            }));
        builder.<NeutronUpdateSecurityGroupRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(NeutronUpdateSecurityGroupRequestBody.class),
            f -> f.withMarshaller(NeutronUpdateSecurityGroupRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<NeutronUpdateSubnetRequest, NeutronUpdateSubnetResponse> neutronUpdateSubnet =
        genForneutronUpdateSubnet();

    private static HttpRequestDef<NeutronUpdateSubnetRequest, NeutronUpdateSubnetResponse> genForneutronUpdateSubnet() {
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
            f -> f.withMarshaller(NeutronUpdateSubnetRequest::getSubnetId, (req, v) -> {
                req.setSubnetId(v);
            }));
        builder.<NeutronUpdateSubnetRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(NeutronUpdateSubnetRequestBody.class),
            f -> f.withMarshaller(NeutronUpdateSubnetRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<NeutronAddFirewallRuleRequest, NeutronAddFirewallRuleResponse> neutronAddFirewallRule =
        genForneutronAddFirewallRule();

    private static HttpRequestDef<NeutronAddFirewallRuleRequest, NeutronAddFirewallRuleResponse> genForneutronAddFirewallRule() {
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
            f -> f.withMarshaller(NeutronAddFirewallRuleRequest::getFirewallPolicyId, (req, v) -> {
                req.setFirewallPolicyId(v);
            }));
        builder.<NeutronInsertFirewallRuleRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(NeutronInsertFirewallRuleRequestBody.class),
            f -> f.withMarshaller(NeutronAddFirewallRuleRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<NeutronCreateFirewallGroupRequest, NeutronCreateFirewallGroupResponse> neutronCreateFirewallGroup =
        genForneutronCreateFirewallGroup();

    private static HttpRequestDef<NeutronCreateFirewallGroupRequest, NeutronCreateFirewallGroupResponse> genForneutronCreateFirewallGroup() {
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
            f -> f.withMarshaller(NeutronCreateFirewallGroupRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<NeutronCreateFirewallPolicyRequest, NeutronCreateFirewallPolicyResponse> neutronCreateFirewallPolicy =
        genForneutronCreateFirewallPolicy();

    private static HttpRequestDef<NeutronCreateFirewallPolicyRequest, NeutronCreateFirewallPolicyResponse> genForneutronCreateFirewallPolicy() {
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
            f -> f.withMarshaller(NeutronCreateFirewallPolicyRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<NeutronCreateFirewallRuleRequest, NeutronCreateFirewallRuleResponse> neutronCreateFirewallRule =
        genForneutronCreateFirewallRule();

    private static HttpRequestDef<NeutronCreateFirewallRuleRequest, NeutronCreateFirewallRuleResponse> genForneutronCreateFirewallRule() {
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
            f -> f.withMarshaller(NeutronCreateFirewallRuleRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<NeutronDeleteFirewallGroupRequest, NeutronDeleteFirewallGroupResponse> neutronDeleteFirewallGroup =
        genForneutronDeleteFirewallGroup();

    private static HttpRequestDef<NeutronDeleteFirewallGroupRequest, NeutronDeleteFirewallGroupResponse> genForneutronDeleteFirewallGroup() {
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
            f -> f.withMarshaller(NeutronDeleteFirewallGroupRequest::getFirewallGroupId, (req, v) -> {
                req.setFirewallGroupId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<NeutronDeleteFirewallPolicyRequest, NeutronDeleteFirewallPolicyResponse> neutronDeleteFirewallPolicy =
        genForneutronDeleteFirewallPolicy();

    private static HttpRequestDef<NeutronDeleteFirewallPolicyRequest, NeutronDeleteFirewallPolicyResponse> genForneutronDeleteFirewallPolicy() {
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
            f -> f.withMarshaller(NeutronDeleteFirewallPolicyRequest::getFirewallPolicyId, (req, v) -> {
                req.setFirewallPolicyId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<NeutronDeleteFirewallRuleRequest, NeutronDeleteFirewallRuleResponse> neutronDeleteFirewallRule =
        genForneutronDeleteFirewallRule();

    private static HttpRequestDef<NeutronDeleteFirewallRuleRequest, NeutronDeleteFirewallRuleResponse> genForneutronDeleteFirewallRule() {
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
            f -> f.withMarshaller(NeutronDeleteFirewallRuleRequest::getFirewallRuleId, (req, v) -> {
                req.setFirewallRuleId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<NeutronListFirewallGroupsRequest, NeutronListFirewallGroupsResponse> neutronListFirewallGroups =
        genForneutronListFirewallGroups();

    private static HttpRequestDef<NeutronListFirewallGroupsRequest, NeutronListFirewallGroupsResponse> genForneutronListFirewallGroups() {
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
            f -> f.withMarshaller(NeutronListFirewallGroupsRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(NeutronListFirewallGroupsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<List<String>>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(NeutronListFirewallGroupsRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<List<String>>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(NeutronListFirewallGroupsRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<List<String>>withRequestField("description",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(NeutronListFirewallGroupsRequest::getDescription, (req, v) -> {
                req.setDescription(v);
            }));
        builder.<String>withRequestField("ingress_firewall_policy_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(NeutronListFirewallGroupsRequest::getIngressFirewallPolicyId, (req, v) -> {
                req.setIngressFirewallPolicyId(v);
            }));
        builder.<String>withRequestField("egress_firewall_policy_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(NeutronListFirewallGroupsRequest::getEgressFirewallPolicyId, (req, v) -> {
                req.setEgressFirewallPolicyId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<NeutronListFirewallPoliciesRequest, NeutronListFirewallPoliciesResponse> neutronListFirewallPolicies =
        genForneutronListFirewallPolicies();

    private static HttpRequestDef<NeutronListFirewallPoliciesRequest, NeutronListFirewallPoliciesResponse> genForneutronListFirewallPolicies() {
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
            f -> f.withMarshaller(NeutronListFirewallPoliciesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(NeutronListFirewallPoliciesRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));
        builder.<List<String>>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(NeutronListFirewallPoliciesRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<List<String>>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(NeutronListFirewallPoliciesRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<List<String>>withRequestField("description",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(NeutronListFirewallPoliciesRequest::getDescription, (req, v) -> {
                req.setDescription(v);
            }));
        builder.<String>withRequestField("tenant_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(NeutronListFirewallPoliciesRequest::getTenantId, (req, v) -> {
                req.setTenantId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<NeutronListFirewallRulesRequest, NeutronListFirewallRulesResponse> neutronListFirewallRules =
        genForneutronListFirewallRules();

    private static HttpRequestDef<NeutronListFirewallRulesRequest, NeutronListFirewallRulesResponse> genForneutronListFirewallRules() {
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
            f -> f.withMarshaller(NeutronListFirewallRulesRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(NeutronListFirewallRulesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<List<String>>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(NeutronListFirewallRulesRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<List<String>>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(NeutronListFirewallRulesRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<List<String>>withRequestField("description",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(NeutronListFirewallRulesRequest::getDescription, (req, v) -> {
                req.setDescription(v);
            }));
        builder.<String>withRequestField("action",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(NeutronListFirewallRulesRequest::getAction, (req, v) -> {
                req.setAction(v);
            }));
        builder.<String>withRequestField("tenant_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(NeutronListFirewallRulesRequest::getTenantId, (req, v) -> {
                req.setTenantId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<NeutronRemoveFirewallRuleRequest, NeutronRemoveFirewallRuleResponse> neutronRemoveFirewallRule =
        genForneutronRemoveFirewallRule();

    private static HttpRequestDef<NeutronRemoveFirewallRuleRequest, NeutronRemoveFirewallRuleResponse> genForneutronRemoveFirewallRule() {
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
            f -> f.withMarshaller(NeutronRemoveFirewallRuleRequest::getFirewallPolicyId, (req, v) -> {
                req.setFirewallPolicyId(v);
            }));
        builder.<NeutronRemoveFirewallRuleRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(NeutronRemoveFirewallRuleRequestBody.class),
            f -> f.withMarshaller(NeutronRemoveFirewallRuleRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<NeutronShowFirewallGroupRequest, NeutronShowFirewallGroupResponse> neutronShowFirewallGroup =
        genForneutronShowFirewallGroup();

    private static HttpRequestDef<NeutronShowFirewallGroupRequest, NeutronShowFirewallGroupResponse> genForneutronShowFirewallGroup() {
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
            f -> f.withMarshaller(NeutronShowFirewallGroupRequest::getFirewallGroupId, (req, v) -> {
                req.setFirewallGroupId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<NeutronShowFirewallPolicyRequest, NeutronShowFirewallPolicyResponse> neutronShowFirewallPolicy =
        genForneutronShowFirewallPolicy();

    private static HttpRequestDef<NeutronShowFirewallPolicyRequest, NeutronShowFirewallPolicyResponse> genForneutronShowFirewallPolicy() {
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
            f -> f.withMarshaller(NeutronShowFirewallPolicyRequest::getFirewallPolicyId, (req, v) -> {
                req.setFirewallPolicyId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<NeutronShowFirewallRuleRequest, NeutronShowFirewallRuleResponse> neutronShowFirewallRule =
        genForneutronShowFirewallRule();

    private static HttpRequestDef<NeutronShowFirewallRuleRequest, NeutronShowFirewallRuleResponse> genForneutronShowFirewallRule() {
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
            f -> f.withMarshaller(NeutronShowFirewallRuleRequest::getFirewallRuleId, (req, v) -> {
                req.setFirewallRuleId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<NeutronUpdateFirewallGroupRequest, NeutronUpdateFirewallGroupResponse> neutronUpdateFirewallGroup =
        genForneutronUpdateFirewallGroup();

    private static HttpRequestDef<NeutronUpdateFirewallGroupRequest, NeutronUpdateFirewallGroupResponse> genForneutronUpdateFirewallGroup() {
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
            f -> f.withMarshaller(NeutronUpdateFirewallGroupRequest::getFirewallGroupId, (req, v) -> {
                req.setFirewallGroupId(v);
            }));
        builder.<NeutronUpdateFirewallGroupRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(NeutronUpdateFirewallGroupRequestBody.class),
            f -> f.withMarshaller(NeutronUpdateFirewallGroupRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<NeutronUpdateFirewallPolicyRequest, NeutronUpdateFirewallPolicyResponse> neutronUpdateFirewallPolicy =
        genForneutronUpdateFirewallPolicy();

    private static HttpRequestDef<NeutronUpdateFirewallPolicyRequest, NeutronUpdateFirewallPolicyResponse> genForneutronUpdateFirewallPolicy() {
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
            f -> f.withMarshaller(NeutronUpdateFirewallPolicyRequest::getFirewallPolicyId, (req, v) -> {
                req.setFirewallPolicyId(v);
            }));
        builder.<NeutronUpdateFirewallPolicyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(NeutronUpdateFirewallPolicyRequestBody.class),
            f -> f.withMarshaller(NeutronUpdateFirewallPolicyRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<NeutronUpdateFirewallRuleRequest, NeutronUpdateFirewallRuleResponse> neutronUpdateFirewallRule =
        genForneutronUpdateFirewallRule();

    private static HttpRequestDef<NeutronUpdateFirewallRuleRequest, NeutronUpdateFirewallRuleResponse> genForneutronUpdateFirewallRule() {
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
            f -> f.withMarshaller(NeutronUpdateFirewallRuleRequest::getFirewallRuleId, (req, v) -> {
                req.setFirewallRuleId(v);
            }));
        builder.<NeutronUpdateFirewallRuleRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(NeutronUpdateFirewallRuleRequestBody.class),
            f -> f.withMarshaller(NeutronUpdateFirewallRuleRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListApiVersionRequest, ListApiVersionResponse> listApiVersion =
        genForlistApiVersion();

    private static HttpRequestDef<ListApiVersionRequest, ListApiVersionResponse> genForlistApiVersion() {
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
        genForbatchCreateVpcTags();

    private static HttpRequestDef<BatchCreateVpcTagsRequest, BatchCreateVpcTagsResponse> genForbatchCreateVpcTags() {
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
            f -> f.withMarshaller(BatchCreateVpcTagsRequest::getVpcId, (req, v) -> {
                req.setVpcId(v);
            }));
        builder.<BatchCreateVpcTagsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchCreateVpcTagsRequestBody.class),
            f -> f.withMarshaller(BatchCreateVpcTagsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteVpcTagsRequest, BatchDeleteVpcTagsResponse> batchDeleteVpcTags =
        genForbatchDeleteVpcTags();

    private static HttpRequestDef<BatchDeleteVpcTagsRequest, BatchDeleteVpcTagsResponse> genForbatchDeleteVpcTags() {
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
            f -> f.withMarshaller(BatchDeleteVpcTagsRequest::getVpcId, (req, v) -> {
                req.setVpcId(v);
            }));
        builder.<BatchDeleteVpcTagsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchDeleteVpcTagsRequestBody.class),
            f -> f.withMarshaller(BatchDeleteVpcTagsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateVpcRequest, CreateVpcResponse> createVpc = genForcreateVpc();

    private static HttpRequestDef<CreateVpcRequest, CreateVpcResponse> genForcreateVpc() {
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
            f -> f.withMarshaller(CreateVpcRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateVpcResourceTagRequest, CreateVpcResourceTagResponse> createVpcResourceTag =
        genForcreateVpcResourceTag();

    private static HttpRequestDef<CreateVpcResourceTagRequest, CreateVpcResourceTagResponse> genForcreateVpcResourceTag() {
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
            f -> f.withMarshaller(CreateVpcResourceTagRequest::getVpcId, (req, v) -> {
                req.setVpcId(v);
            }));
        builder.<CreateVpcResourceTagRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateVpcResourceTagRequestBody.class),
            f -> f.withMarshaller(CreateVpcResourceTagRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateVpcRouteRequest, CreateVpcRouteResponse> createVpcRoute =
        genForcreateVpcRoute();

    private static HttpRequestDef<CreateVpcRouteRequest, CreateVpcRouteResponse> genForcreateVpcRoute() {
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
            f -> f.withMarshaller(CreateVpcRouteRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteVpcRequest, DeleteVpcResponse> deleteVpc = genFordeleteVpc();

    private static HttpRequestDef<DeleteVpcRequest, DeleteVpcResponse> genFordeleteVpc() {
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
            f -> f.withMarshaller(DeleteVpcRequest::getVpcId, (req, v) -> {
                req.setVpcId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteVpcRouteRequest, DeleteVpcRouteResponse> deleteVpcRoute =
        genFordeleteVpcRoute();

    private static HttpRequestDef<DeleteVpcRouteRequest, DeleteVpcRouteResponse> genFordeleteVpcRoute() {
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
            f -> f.withMarshaller(DeleteVpcRouteRequest::getRouteId, (req, v) -> {
                req.setRouteId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteVpcTagRequest, DeleteVpcTagResponse> deleteVpcTag = genFordeleteVpcTag();

    private static HttpRequestDef<DeleteVpcTagRequest, DeleteVpcTagResponse> genFordeleteVpcTag() {
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
            f -> f.withMarshaller(DeleteVpcTagRequest::getVpcId, (req, v) -> {
                req.setVpcId(v);
            }));
        builder.<String>withRequestField("key",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteVpcTagRequest::getKey, (req, v) -> {
                req.setKey(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListVpcRoutesRequest, ListVpcRoutesResponse> listVpcRoutes =
        genForlistVpcRoutes();

    private static HttpRequestDef<ListVpcRoutesRequest, ListVpcRoutesResponse> genForlistVpcRoutes() {
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
            f -> f.withMarshaller(ListVpcRoutesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVpcRoutesRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVpcRoutesRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<ListVpcRoutesRequest.TypeEnum>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListVpcRoutesRequest.TypeEnum.class),
            f -> f.withMarshaller(ListVpcRoutesRequest::getType, (req, v) -> {
                req.setType(v);
            }));
        builder.<String>withRequestField("vpc_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVpcRoutesRequest::getVpcId, (req, v) -> {
                req.setVpcId(v);
            }));
        builder.<String>withRequestField("destination",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVpcRoutesRequest::getDestination, (req, v) -> {
                req.setDestination(v);
            }));
        builder.<String>withRequestField("tenant_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVpcRoutesRequest::getTenantId, (req, v) -> {
                req.setTenantId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListVpcTagsRequest, ListVpcTagsResponse> listVpcTags = genForlistVpcTags();

    private static HttpRequestDef<ListVpcTagsRequest, ListVpcTagsResponse> genForlistVpcTags() {
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

    public static final HttpRequestDef<ListVpcsRequest, ListVpcsResponse> listVpcs = genForlistVpcs();

    private static HttpRequestDef<ListVpcsRequest, ListVpcsResponse> genForlistVpcs() {
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
            f -> f.withMarshaller(ListVpcsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVpcsRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVpcsRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVpcsRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListVpcsByTagsRequest, ListVpcsByTagsResponse> listVpcsByTags =
        genForlistVpcsByTags();

    private static HttpRequestDef<ListVpcsByTagsRequest, ListVpcsByTagsResponse> genForlistVpcsByTags() {
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
            f -> f.withMarshaller(ListVpcsByTagsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowVpcRequest, ShowVpcResponse> showVpc = genForshowVpc();

    private static HttpRequestDef<ShowVpcRequest, ShowVpcResponse> genForshowVpc() {
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
            f -> f.withMarshaller(ShowVpcRequest::getVpcId, (req, v) -> {
                req.setVpcId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowVpcRouteRequest, ShowVpcRouteResponse> showVpcRoute = genForshowVpcRoute();

    private static HttpRequestDef<ShowVpcRouteRequest, ShowVpcRouteResponse> genForshowVpcRoute() {
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
            f -> f.withMarshaller(ShowVpcRouteRequest::getRouteId, (req, v) -> {
                req.setRouteId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowVpcTagsRequest, ShowVpcTagsResponse> showVpcTags = genForshowVpcTags();

    private static HttpRequestDef<ShowVpcTagsRequest, ShowVpcTagsResponse> genForshowVpcTags() {
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
            f -> f.withMarshaller(ShowVpcTagsRequest::getVpcId, (req, v) -> {
                req.setVpcId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateVpcRequest, UpdateVpcResponse> updateVpc = genForupdateVpc();

    private static HttpRequestDef<UpdateVpcRequest, UpdateVpcResponse> genForupdateVpc() {
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
            f -> f.withMarshaller(UpdateVpcRequest::getVpcId, (req, v) -> {
                req.setVpcId(v);
            }));
        builder.<UpdateVpcRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateVpcRequestBody.class),
            f -> f.withMarshaller(UpdateVpcRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

}
