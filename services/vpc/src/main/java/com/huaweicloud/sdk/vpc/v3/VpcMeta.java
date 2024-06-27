package com.huaweicloud.sdk.vpc.v3;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.vpc.v3.model.AddClouddcnSubnetsTagsRequest;
import com.huaweicloud.sdk.vpc.v3.model.AddClouddcnSubnetsTagsResponse;
import com.huaweicloud.sdk.vpc.v3.model.AddFirewallRulesRequest;
import com.huaweicloud.sdk.vpc.v3.model.AddFirewallRulesRequestBody;
import com.huaweicloud.sdk.vpc.v3.model.AddFirewallRulesResponse;
import com.huaweicloud.sdk.vpc.v3.model.AddResourceTagsRequestBody;
import com.huaweicloud.sdk.vpc.v3.model.AddSecurityGroupsRequest;
import com.huaweicloud.sdk.vpc.v3.model.AddSecurityGroupsRequestBody;
import com.huaweicloud.sdk.vpc.v3.model.AddSecurityGroupsResponse;
import com.huaweicloud.sdk.vpc.v3.model.AddSourcesToTrafficMirrorSessionRequest;
import com.huaweicloud.sdk.vpc.v3.model.AddSourcesToTrafficMirrorSessionRequestBody;
import com.huaweicloud.sdk.vpc.v3.model.AddSourcesToTrafficMirrorSessionResponse;
import com.huaweicloud.sdk.vpc.v3.model.AddVpcExtendCidrRequest;
import com.huaweicloud.sdk.vpc.v3.model.AddVpcExtendCidrRequestBody;
import com.huaweicloud.sdk.vpc.v3.model.AddVpcExtendCidrResponse;
import com.huaweicloud.sdk.vpc.v3.model.AssociateSubnetFirewallRequest;
import com.huaweicloud.sdk.vpc.v3.model.AssociateSubnetFirewallRequestBody;
import com.huaweicloud.sdk.vpc.v3.model.AssociateSubnetFirewallResponse;
import com.huaweicloud.sdk.vpc.v3.model.BatchCreateClouddcnSubnetsTagsRequest;
import com.huaweicloud.sdk.vpc.v3.model.BatchCreateClouddcnSubnetsTagsResponse;
import com.huaweicloud.sdk.vpc.v3.model.BatchCreateFirewallTagsRequest;
import com.huaweicloud.sdk.vpc.v3.model.BatchCreateFirewallTagsRequestBody;
import com.huaweicloud.sdk.vpc.v3.model.BatchCreateFirewallTagsResponse;
import com.huaweicloud.sdk.vpc.v3.model.BatchCreatePortTagsRequest;
import com.huaweicloud.sdk.vpc.v3.model.BatchCreatePortTagsRequestBody;
import com.huaweicloud.sdk.vpc.v3.model.BatchCreatePortTagsResponse;
import com.huaweicloud.sdk.vpc.v3.model.BatchCreateRequestBody;
import com.huaweicloud.sdk.vpc.v3.model.BatchCreateSecurityGroupRulesRequest;
import com.huaweicloud.sdk.vpc.v3.model.BatchCreateSecurityGroupRulesRequestBody;
import com.huaweicloud.sdk.vpc.v3.model.BatchCreateSecurityGroupRulesResponse;
import com.huaweicloud.sdk.vpc.v3.model.BatchCreateSubNetworkInterfaceRequest;
import com.huaweicloud.sdk.vpc.v3.model.BatchCreateSubNetworkInterfaceRequestBody;
import com.huaweicloud.sdk.vpc.v3.model.BatchCreateSubNetworkInterfaceResponse;
import com.huaweicloud.sdk.vpc.v3.model.BatchDeleteClouddcnSubnetsTagsRequest;
import com.huaweicloud.sdk.vpc.v3.model.BatchDeleteClouddcnSubnetsTagsResponse;
import com.huaweicloud.sdk.vpc.v3.model.BatchDeleteFirewallTagsRequest;
import com.huaweicloud.sdk.vpc.v3.model.BatchDeleteFirewallTagsRequestBody;
import com.huaweicloud.sdk.vpc.v3.model.BatchDeleteFirewallTagsResponse;
import com.huaweicloud.sdk.vpc.v3.model.BatchDeletePortTagsRequest;
import com.huaweicloud.sdk.vpc.v3.model.BatchDeletePortTagsRequestBody;
import com.huaweicloud.sdk.vpc.v3.model.BatchDeletePortTagsResponse;
import com.huaweicloud.sdk.vpc.v3.model.BatchDeleteRequestBody;
import com.huaweicloud.sdk.vpc.v3.model.CountFirewallsByTagsRequest;
import com.huaweicloud.sdk.vpc.v3.model.CountFirewallsByTagsRequestBody;
import com.huaweicloud.sdk.vpc.v3.model.CountFirewallsByTagsResponse;
import com.huaweicloud.sdk.vpc.v3.model.CountPortsByTagsRequest;
import com.huaweicloud.sdk.vpc.v3.model.CountPortsByTagsRequestBody;
import com.huaweicloud.sdk.vpc.v3.model.CountPortsByTagsResponse;
import com.huaweicloud.sdk.vpc.v3.model.CreateAddressGroupRequest;
import com.huaweicloud.sdk.vpc.v3.model.CreateAddressGroupRequestBody;
import com.huaweicloud.sdk.vpc.v3.model.CreateAddressGroupResponse;
import com.huaweicloud.sdk.vpc.v3.model.CreateClouddcnSubnetRequest;
import com.huaweicloud.sdk.vpc.v3.model.CreateClouddcnSubnetRequestBody;
import com.huaweicloud.sdk.vpc.v3.model.CreateClouddcnSubnetResponse;
import com.huaweicloud.sdk.vpc.v3.model.CreateFirewallRequest;
import com.huaweicloud.sdk.vpc.v3.model.CreateFirewallRequestBody;
import com.huaweicloud.sdk.vpc.v3.model.CreateFirewallResponse;
import com.huaweicloud.sdk.vpc.v3.model.CreateFirewallTagRequest;
import com.huaweicloud.sdk.vpc.v3.model.CreateFirewallTagRequestBody;
import com.huaweicloud.sdk.vpc.v3.model.CreateFirewallTagResponse;
import com.huaweicloud.sdk.vpc.v3.model.CreatePortTagRequest;
import com.huaweicloud.sdk.vpc.v3.model.CreatePortTagRequestBody;
import com.huaweicloud.sdk.vpc.v3.model.CreatePortTagResponse;
import com.huaweicloud.sdk.vpc.v3.model.CreateSecurityGroupRequest;
import com.huaweicloud.sdk.vpc.v3.model.CreateSecurityGroupRequestBody;
import com.huaweicloud.sdk.vpc.v3.model.CreateSecurityGroupResponse;
import com.huaweicloud.sdk.vpc.v3.model.CreateSecurityGroupRuleRequest;
import com.huaweicloud.sdk.vpc.v3.model.CreateSecurityGroupRuleRequestBody;
import com.huaweicloud.sdk.vpc.v3.model.CreateSecurityGroupRuleResponse;
import com.huaweicloud.sdk.vpc.v3.model.CreateSubNetworkInterfaceRequest;
import com.huaweicloud.sdk.vpc.v3.model.CreateSubNetworkInterfaceRequestBody;
import com.huaweicloud.sdk.vpc.v3.model.CreateSubNetworkInterfaceResponse;
import com.huaweicloud.sdk.vpc.v3.model.CreateTrafficMirrorFilterRequest;
import com.huaweicloud.sdk.vpc.v3.model.CreateTrafficMirrorFilterRequestBody;
import com.huaweicloud.sdk.vpc.v3.model.CreateTrafficMirrorFilterResponse;
import com.huaweicloud.sdk.vpc.v3.model.CreateTrafficMirrorFilterRuleRequest;
import com.huaweicloud.sdk.vpc.v3.model.CreateTrafficMirrorFilterRuleRequestBody;
import com.huaweicloud.sdk.vpc.v3.model.CreateTrafficMirrorFilterRuleResponse;
import com.huaweicloud.sdk.vpc.v3.model.CreateTrafficMirrorSessionRequest;
import com.huaweicloud.sdk.vpc.v3.model.CreateTrafficMirrorSessionRequestBody;
import com.huaweicloud.sdk.vpc.v3.model.CreateTrafficMirrorSessionResponse;
import com.huaweicloud.sdk.vpc.v3.model.CreateVpcRequest;
import com.huaweicloud.sdk.vpc.v3.model.CreateVpcRequestBody;
import com.huaweicloud.sdk.vpc.v3.model.CreateVpcResponse;
import com.huaweicloud.sdk.vpc.v3.model.DeleteAddressGroupRequest;
import com.huaweicloud.sdk.vpc.v3.model.DeleteAddressGroupResponse;
import com.huaweicloud.sdk.vpc.v3.model.DeleteClouddcnSubnetRequest;
import com.huaweicloud.sdk.vpc.v3.model.DeleteClouddcnSubnetResponse;
import com.huaweicloud.sdk.vpc.v3.model.DeleteClouddcnSubnetsTagRequest;
import com.huaweicloud.sdk.vpc.v3.model.DeleteClouddcnSubnetsTagResponse;
import com.huaweicloud.sdk.vpc.v3.model.DeleteFirewallRequest;
import com.huaweicloud.sdk.vpc.v3.model.DeleteFirewallResponse;
import com.huaweicloud.sdk.vpc.v3.model.DeleteFirewallTagRequest;
import com.huaweicloud.sdk.vpc.v3.model.DeleteFirewallTagResponse;
import com.huaweicloud.sdk.vpc.v3.model.DeleteIpAddressGroupForceRequest;
import com.huaweicloud.sdk.vpc.v3.model.DeleteIpAddressGroupForceResponse;
import com.huaweicloud.sdk.vpc.v3.model.DeletePortTagRequest;
import com.huaweicloud.sdk.vpc.v3.model.DeletePortTagResponse;
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
import com.huaweicloud.sdk.vpc.v3.model.DisassociateSubnetFirewallRequestBody;
import com.huaweicloud.sdk.vpc.v3.model.DisassociateSubnetFirewallResponse;
import com.huaweicloud.sdk.vpc.v3.model.ListAddressGroupRequest;
import com.huaweicloud.sdk.vpc.v3.model.ListAddressGroupResponse;
import com.huaweicloud.sdk.vpc.v3.model.ListClouddcnSubnetsCountFilterTagsRequest;
import com.huaweicloud.sdk.vpc.v3.model.ListClouddcnSubnetsCountFilterTagsResponse;
import com.huaweicloud.sdk.vpc.v3.model.ListClouddcnSubnetsFilterTagsRequest;
import com.huaweicloud.sdk.vpc.v3.model.ListClouddcnSubnetsFilterTagsResponse;
import com.huaweicloud.sdk.vpc.v3.model.ListClouddcnSubnetsRequest;
import com.huaweicloud.sdk.vpc.v3.model.ListClouddcnSubnetsResponse;
import com.huaweicloud.sdk.vpc.v3.model.ListClouddcnSubnetsTagsRequest;
import com.huaweicloud.sdk.vpc.v3.model.ListClouddcnSubnetsTagsResponse;
import com.huaweicloud.sdk.vpc.v3.model.ListFirewallRequest;
import com.huaweicloud.sdk.vpc.v3.model.ListFirewallResponse;
import com.huaweicloud.sdk.vpc.v3.model.ListFirewallTagsRequest;
import com.huaweicloud.sdk.vpc.v3.model.ListFirewallTagsResponse;
import com.huaweicloud.sdk.vpc.v3.model.ListFirewallsByTagsRequest;
import com.huaweicloud.sdk.vpc.v3.model.ListFirewallsByTagsRequestBody;
import com.huaweicloud.sdk.vpc.v3.model.ListFirewallsByTagsResponse;
import com.huaweicloud.sdk.vpc.v3.model.ListPortTagsRequest;
import com.huaweicloud.sdk.vpc.v3.model.ListPortTagsResponse;
import com.huaweicloud.sdk.vpc.v3.model.ListPortsByTagsRequest;
import com.huaweicloud.sdk.vpc.v3.model.ListPortsByTagsRequestBody;
import com.huaweicloud.sdk.vpc.v3.model.ListPortsByTagsResponse;
import com.huaweicloud.sdk.vpc.v3.model.ListResourcesByTagsRequestBody;
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
import com.huaweicloud.sdk.vpc.v3.model.MigrateSubNetworkInterfaceRequestBody;
import com.huaweicloud.sdk.vpc.v3.model.MigrateSubNetworkInterfaceResponse;
import com.huaweicloud.sdk.vpc.v3.model.RemoveFirewallRulesRequest;
import com.huaweicloud.sdk.vpc.v3.model.RemoveFirewallRulesRequestBody;
import com.huaweicloud.sdk.vpc.v3.model.RemoveFirewallRulesResponse;
import com.huaweicloud.sdk.vpc.v3.model.RemoveSecurityGroupsRequest;
import com.huaweicloud.sdk.vpc.v3.model.RemoveSecurityGroupsRequestBody;
import com.huaweicloud.sdk.vpc.v3.model.RemoveSecurityGroupsResponse;
import com.huaweicloud.sdk.vpc.v3.model.RemoveSourcesFromTrafficMirrorSessionRequest;
import com.huaweicloud.sdk.vpc.v3.model.RemoveSourcesFromTrafficMirrorSessionRequestBody;
import com.huaweicloud.sdk.vpc.v3.model.RemoveSourcesFromTrafficMirrorSessionResponse;
import com.huaweicloud.sdk.vpc.v3.model.RemoveVpcExtendCidrRequest;
import com.huaweicloud.sdk.vpc.v3.model.RemoveVpcExtendCidrRequestBody;
import com.huaweicloud.sdk.vpc.v3.model.RemoveVpcExtendCidrResponse;
import com.huaweicloud.sdk.vpc.v3.model.ShowAddressGroupRequest;
import com.huaweicloud.sdk.vpc.v3.model.ShowAddressGroupResponse;
import com.huaweicloud.sdk.vpc.v3.model.ShowClouddcnSubnetRequest;
import com.huaweicloud.sdk.vpc.v3.model.ShowClouddcnSubnetResponse;
import com.huaweicloud.sdk.vpc.v3.model.ShowClouddcnSubnetsTagsRequest;
import com.huaweicloud.sdk.vpc.v3.model.ShowClouddcnSubnetsTagsResponse;
import com.huaweicloud.sdk.vpc.v3.model.ShowFirewallRequest;
import com.huaweicloud.sdk.vpc.v3.model.ShowFirewallResponse;
import com.huaweicloud.sdk.vpc.v3.model.ShowFirewallTagsRequest;
import com.huaweicloud.sdk.vpc.v3.model.ShowFirewallTagsResponse;
import com.huaweicloud.sdk.vpc.v3.model.ShowPortTagsRequest;
import com.huaweicloud.sdk.vpc.v3.model.ShowPortTagsResponse;
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
import com.huaweicloud.sdk.vpc.v3.model.UpdateAddressGroupRequestBody;
import com.huaweicloud.sdk.vpc.v3.model.UpdateAddressGroupResponse;
import com.huaweicloud.sdk.vpc.v3.model.UpdateClouddcnSubnetRequest;
import com.huaweicloud.sdk.vpc.v3.model.UpdateClouddcnSubnetRequestBody;
import com.huaweicloud.sdk.vpc.v3.model.UpdateClouddcnSubnetResponse;
import com.huaweicloud.sdk.vpc.v3.model.UpdateFirewallRequest;
import com.huaweicloud.sdk.vpc.v3.model.UpdateFirewallRequestBody;
import com.huaweicloud.sdk.vpc.v3.model.UpdateFirewallResponse;
import com.huaweicloud.sdk.vpc.v3.model.UpdateFirewallRulesRequest;
import com.huaweicloud.sdk.vpc.v3.model.UpdateFirewallRulesRequestBody;
import com.huaweicloud.sdk.vpc.v3.model.UpdateFirewallRulesResponse;
import com.huaweicloud.sdk.vpc.v3.model.UpdateSecurityGroupRequest;
import com.huaweicloud.sdk.vpc.v3.model.UpdateSecurityGroupRequestBody;
import com.huaweicloud.sdk.vpc.v3.model.UpdateSecurityGroupResponse;
import com.huaweicloud.sdk.vpc.v3.model.UpdateSubNetworkInterfaceRequest;
import com.huaweicloud.sdk.vpc.v3.model.UpdateSubNetworkInterfaceRequestBody;
import com.huaweicloud.sdk.vpc.v3.model.UpdateSubNetworkInterfaceResponse;
import com.huaweicloud.sdk.vpc.v3.model.UpdateTrafficMirrorFilterRequest;
import com.huaweicloud.sdk.vpc.v3.model.UpdateTrafficMirrorFilterRequestBody;
import com.huaweicloud.sdk.vpc.v3.model.UpdateTrafficMirrorFilterResponse;
import com.huaweicloud.sdk.vpc.v3.model.UpdateTrafficMirrorFilterRuleRequest;
import com.huaweicloud.sdk.vpc.v3.model.UpdateTrafficMirrorFilterRuleRequestBody;
import com.huaweicloud.sdk.vpc.v3.model.UpdateTrafficMirrorFilterRuleResponse;
import com.huaweicloud.sdk.vpc.v3.model.UpdateTrafficMirrorSessionRequest;
import com.huaweicloud.sdk.vpc.v3.model.UpdateTrafficMirrorSessionRequestBody;
import com.huaweicloud.sdk.vpc.v3.model.UpdateTrafficMirrorSessionResponse;
import com.huaweicloud.sdk.vpc.v3.model.UpdateVpcRequest;
import com.huaweicloud.sdk.vpc.v3.model.UpdateVpcRequestBody;
import com.huaweicloud.sdk.vpc.v3.model.UpdateVpcResponse;

import java.util.List;

@SuppressWarnings("unchecked")
public class VpcMeta {

    public static final HttpRequestDef<AddSecurityGroupsRequest, AddSecurityGroupsResponse> addSecurityGroups =
        genForAddSecurityGroups();

    private static HttpRequestDef<AddSecurityGroupsRequest, AddSecurityGroupsResponse> genForAddSecurityGroups() {
        // basic
        HttpRequestDef.Builder<AddSecurityGroupsRequest, AddSecurityGroupsResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, AddSecurityGroupsRequest.class, AddSecurityGroupsResponse.class)
                .withName("AddSecurityGroups")
                .withUri("/v3/{project_id}/ports/{port_id}/insert-security-groups")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("port_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddSecurityGroupsRequest::getPortId, AddSecurityGroupsRequest::setPortId));
        builder.<AddSecurityGroupsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AddSecurityGroupsRequestBody.class),
            f -> f.withMarshaller(AddSecurityGroupsRequest::getBody, AddSecurityGroupsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddSourcesToTrafficMirrorSessionRequest, AddSourcesToTrafficMirrorSessionResponse> addSourcesToTrafficMirrorSession =
        genForAddSourcesToTrafficMirrorSession();

    private static HttpRequestDef<AddSourcesToTrafficMirrorSessionRequest, AddSourcesToTrafficMirrorSessionResponse> genForAddSourcesToTrafficMirrorSession() {
        // basic
        HttpRequestDef.Builder<AddSourcesToTrafficMirrorSessionRequest, AddSourcesToTrafficMirrorSessionResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    AddSourcesToTrafficMirrorSessionRequest.class,
                    AddSourcesToTrafficMirrorSessionResponse.class)
                .withName("AddSourcesToTrafficMirrorSession")
                .withUri("/v3/{project_id}/vpc/traffic-mirror-sessions/{traffic_mirror_session_id}/add-sources")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("traffic_mirror_session_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddSourcesToTrafficMirrorSessionRequest::getTrafficMirrorSessionId,
                AddSourcesToTrafficMirrorSessionRequest::setTrafficMirrorSessionId));
        builder.<AddSourcesToTrafficMirrorSessionRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AddSourcesToTrafficMirrorSessionRequestBody.class),
            f -> f.withMarshaller(AddSourcesToTrafficMirrorSessionRequest::getBody,
                AddSourcesToTrafficMirrorSessionRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchCreatePortTagsRequest, BatchCreatePortTagsResponse> batchCreatePortTags =
        genForBatchCreatePortTags();

    private static HttpRequestDef<BatchCreatePortTagsRequest, BatchCreatePortTagsResponse> genForBatchCreatePortTags() {
        // basic
        HttpRequestDef.Builder<BatchCreatePortTagsRequest, BatchCreatePortTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchCreatePortTagsRequest.class, BatchCreatePortTagsResponse.class)
                .withName("BatchCreatePortTags")
                .withUri("/v3/{project_id}/ports/{port_id}/tags/create")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("port_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchCreatePortTagsRequest::getPortId, BatchCreatePortTagsRequest::setPortId));
        builder.<BatchCreatePortTagsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(BatchCreatePortTagsRequestBody.class),
            f -> f.withMarshaller(BatchCreatePortTagsRequest::getBody, BatchCreatePortTagsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchCreateSecurityGroupRulesRequest, BatchCreateSecurityGroupRulesResponse> batchCreateSecurityGroupRules =
        genForBatchCreateSecurityGroupRules();

    private static HttpRequestDef<BatchCreateSecurityGroupRulesRequest, BatchCreateSecurityGroupRulesResponse> genForBatchCreateSecurityGroupRules() {
        // basic
        HttpRequestDef.Builder<BatchCreateSecurityGroupRulesRequest, BatchCreateSecurityGroupRulesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    BatchCreateSecurityGroupRulesRequest.class,
                    BatchCreateSecurityGroupRulesResponse.class)
                .withName("BatchCreateSecurityGroupRules")
                .withUri("/v3/{project_id}/vpc/security-groups/{security_group_id}/security-group-rules/batch-create")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("security_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchCreateSecurityGroupRulesRequest::getSecurityGroupId,
                BatchCreateSecurityGroupRulesRequest::setSecurityGroupId));
        builder.<BatchCreateSecurityGroupRulesRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchCreateSecurityGroupRulesRequestBody.class),
            f -> f.withMarshaller(BatchCreateSecurityGroupRulesRequest::getBody,
                BatchCreateSecurityGroupRulesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchCreateSubNetworkInterfaceRequest, BatchCreateSubNetworkInterfaceResponse> batchCreateSubNetworkInterface =
        genForBatchCreateSubNetworkInterface();

    private static HttpRequestDef<BatchCreateSubNetworkInterfaceRequest, BatchCreateSubNetworkInterfaceResponse> genForBatchCreateSubNetworkInterface() {
        // basic
        HttpRequestDef.Builder<BatchCreateSubNetworkInterfaceRequest, BatchCreateSubNetworkInterfaceResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    BatchCreateSubNetworkInterfaceRequest.class,
                    BatchCreateSubNetworkInterfaceResponse.class)
                .withName("BatchCreateSubNetworkInterface")
                .withUri("/v3/{project_id}/vpc/sub-network-interfaces/batch-create")
                .withContentType("application/json");

        // requests
        builder.<BatchCreateSubNetworkInterfaceRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchCreateSubNetworkInterfaceRequestBody.class),
            f -> f.withMarshaller(BatchCreateSubNetworkInterfaceRequest::getBody,
                BatchCreateSubNetworkInterfaceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeletePortTagsRequest, BatchDeletePortTagsResponse> batchDeletePortTags =
        genForBatchDeletePortTags();

    private static HttpRequestDef<BatchDeletePortTagsRequest, BatchDeletePortTagsResponse> genForBatchDeletePortTags() {
        // basic
        HttpRequestDef.Builder<BatchDeletePortTagsRequest, BatchDeletePortTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchDeletePortTagsRequest.class, BatchDeletePortTagsResponse.class)
                .withName("BatchDeletePortTags")
                .withUri("/v3/{project_id}/ports/{port_id}/tags/delete")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("port_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeletePortTagsRequest::getPortId, BatchDeletePortTagsRequest::setPortId));
        builder.<BatchDeletePortTagsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(BatchDeletePortTagsRequestBody.class),
            f -> f.withMarshaller(BatchDeletePortTagsRequest::getBody, BatchDeletePortTagsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CountPortsByTagsRequest, CountPortsByTagsResponse> countPortsByTags =
        genForCountPortsByTags();

    private static HttpRequestDef<CountPortsByTagsRequest, CountPortsByTagsResponse> genForCountPortsByTags() {
        // basic
        HttpRequestDef.Builder<CountPortsByTagsRequest, CountPortsByTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CountPortsByTagsRequest.class, CountPortsByTagsResponse.class)
                .withName("CountPortsByTags")
                .withUri("/v3/{project_id}/ports/resource-instances/count")
                .withContentType("application/json");

        // requests
        builder.<CountPortsByTagsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CountPortsByTagsRequestBody.class),
            f -> f.withMarshaller(CountPortsByTagsRequest::getBody, CountPortsByTagsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreatePortTagRequest, CreatePortTagResponse> createPortTag =
        genForCreatePortTag();

    private static HttpRequestDef<CreatePortTagRequest, CreatePortTagResponse> genForCreatePortTag() {
        // basic
        HttpRequestDef.Builder<CreatePortTagRequest, CreatePortTagResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreatePortTagRequest.class, CreatePortTagResponse.class)
                .withName("CreatePortTag")
                .withUri("/v3/{project_id}/ports/{port_id}/tags")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("port_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreatePortTagRequest::getPortId, CreatePortTagRequest::setPortId));
        builder.<CreatePortTagRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreatePortTagRequestBody.class),
            f -> f.withMarshaller(CreatePortTagRequest::getBody, CreatePortTagRequest::setBody));

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
                .withUri("/v3/{project_id}/vpc/security-groups")
                .withContentType("application/json");

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
            .withUri("/v3/{project_id}/vpc/security-group-rules")
            .withContentType("application/json");

        // requests
        builder.<CreateSecurityGroupRuleRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateSecurityGroupRuleRequestBody.class),
            f -> f.withMarshaller(CreateSecurityGroupRuleRequest::getBody, CreateSecurityGroupRuleRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateSubNetworkInterfaceRequest, CreateSubNetworkInterfaceResponse> createSubNetworkInterface =
        genForCreateSubNetworkInterface();

    private static HttpRequestDef<CreateSubNetworkInterfaceRequest, CreateSubNetworkInterfaceResponse> genForCreateSubNetworkInterface() {
        // basic
        HttpRequestDef.Builder<CreateSubNetworkInterfaceRequest, CreateSubNetworkInterfaceResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateSubNetworkInterfaceRequest.class,
                    CreateSubNetworkInterfaceResponse.class)
                .withName("CreateSubNetworkInterface")
                .withUri("/v3/{project_id}/vpc/sub-network-interfaces")
                .withContentType("application/json");

        // requests
        builder.<CreateSubNetworkInterfaceRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateSubNetworkInterfaceRequestBody.class),
            f -> f.withMarshaller(CreateSubNetworkInterfaceRequest::getBody,
                CreateSubNetworkInterfaceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateTrafficMirrorFilterRequest, CreateTrafficMirrorFilterResponse> createTrafficMirrorFilter =
        genForCreateTrafficMirrorFilter();

    private static HttpRequestDef<CreateTrafficMirrorFilterRequest, CreateTrafficMirrorFilterResponse> genForCreateTrafficMirrorFilter() {
        // basic
        HttpRequestDef.Builder<CreateTrafficMirrorFilterRequest, CreateTrafficMirrorFilterResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateTrafficMirrorFilterRequest.class,
                    CreateTrafficMirrorFilterResponse.class)
                .withName("CreateTrafficMirrorFilter")
                .withUri("/v3/{project_id}/vpc/traffic-mirror-filters")
                .withContentType("application/json");

        // requests
        builder.<CreateTrafficMirrorFilterRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateTrafficMirrorFilterRequestBody.class),
            f -> f.withMarshaller(CreateTrafficMirrorFilterRequest::getBody,
                CreateTrafficMirrorFilterRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateTrafficMirrorFilterRuleRequest, CreateTrafficMirrorFilterRuleResponse> createTrafficMirrorFilterRule =
        genForCreateTrafficMirrorFilterRule();

    private static HttpRequestDef<CreateTrafficMirrorFilterRuleRequest, CreateTrafficMirrorFilterRuleResponse> genForCreateTrafficMirrorFilterRule() {
        // basic
        HttpRequestDef.Builder<CreateTrafficMirrorFilterRuleRequest, CreateTrafficMirrorFilterRuleResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateTrafficMirrorFilterRuleRequest.class,
                    CreateTrafficMirrorFilterRuleResponse.class)
                .withName("CreateTrafficMirrorFilterRule")
                .withUri("/v3/{project_id}/vpc/traffic-mirror-filter-rules")
                .withContentType("application/json");

        // requests
        builder.<CreateTrafficMirrorFilterRuleRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateTrafficMirrorFilterRuleRequestBody.class),
            f -> f.withMarshaller(CreateTrafficMirrorFilterRuleRequest::getBody,
                CreateTrafficMirrorFilterRuleRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateTrafficMirrorSessionRequest, CreateTrafficMirrorSessionResponse> createTrafficMirrorSession =
        genForCreateTrafficMirrorSession();

    private static HttpRequestDef<CreateTrafficMirrorSessionRequest, CreateTrafficMirrorSessionResponse> genForCreateTrafficMirrorSession() {
        // basic
        HttpRequestDef.Builder<CreateTrafficMirrorSessionRequest, CreateTrafficMirrorSessionResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateTrafficMirrorSessionRequest.class,
                    CreateTrafficMirrorSessionResponse.class)
                .withName("CreateTrafficMirrorSession")
                .withUri("/v3/{project_id}/vpc/traffic-mirror-sessions")
                .withContentType("application/json");

        // requests
        builder.<CreateTrafficMirrorSessionRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateTrafficMirrorSessionRequestBody.class),
            f -> f.withMarshaller(CreateTrafficMirrorSessionRequest::getBody,
                CreateTrafficMirrorSessionRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeletePortTagRequest, DeletePortTagResponse> deletePortTag =
        genForDeletePortTag();

    private static HttpRequestDef<DeletePortTagRequest, DeletePortTagResponse> genForDeletePortTag() {
        // basic
        HttpRequestDef.Builder<DeletePortTagRequest, DeletePortTagResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeletePortTagRequest.class, DeletePortTagResponse.class)
                .withName("DeletePortTag")
                .withUri("/v3/{project_id}/ports/{port_id}/tags/{tag_key}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("port_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletePortTagRequest::getPortId, DeletePortTagRequest::setPortId));
        builder.<String>withRequestField("tag_key",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletePortTagRequest::getTagKey, DeletePortTagRequest::setTagKey));

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
            .withUri("/v3/{project_id}/vpc/security-groups/{security_group_id}")
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
            .withUri("/v3/{project_id}/vpc/security-group-rules/{security_group_rule_id}")
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

    public static final HttpRequestDef<DeleteSubNetworkInterfaceRequest, DeleteSubNetworkInterfaceResponse> deleteSubNetworkInterface =
        genForDeleteSubNetworkInterface();

    private static HttpRequestDef<DeleteSubNetworkInterfaceRequest, DeleteSubNetworkInterfaceResponse> genForDeleteSubNetworkInterface() {
        // basic
        HttpRequestDef.Builder<DeleteSubNetworkInterfaceRequest, DeleteSubNetworkInterfaceResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteSubNetworkInterfaceRequest.class,
                    DeleteSubNetworkInterfaceResponse.class)
                .withName("DeleteSubNetworkInterface")
                .withUri("/v3/{project_id}/vpc/sub-network-interfaces/{sub_network_interface_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("sub_network_interface_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteSubNetworkInterfaceRequest::getSubNetworkInterfaceId,
                DeleteSubNetworkInterfaceRequest::setSubNetworkInterfaceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteTrafficMirrorFilterRequest, DeleteTrafficMirrorFilterResponse> deleteTrafficMirrorFilter =
        genForDeleteTrafficMirrorFilter();

    private static HttpRequestDef<DeleteTrafficMirrorFilterRequest, DeleteTrafficMirrorFilterResponse> genForDeleteTrafficMirrorFilter() {
        // basic
        HttpRequestDef.Builder<DeleteTrafficMirrorFilterRequest, DeleteTrafficMirrorFilterResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteTrafficMirrorFilterRequest.class,
                    DeleteTrafficMirrorFilterResponse.class)
                .withName("DeleteTrafficMirrorFilter")
                .withUri("/v3/{project_id}/vpc/traffic-mirror-filters/{traffic_mirror_filter_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("traffic_mirror_filter_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTrafficMirrorFilterRequest::getTrafficMirrorFilterId,
                DeleteTrafficMirrorFilterRequest::setTrafficMirrorFilterId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteTrafficMirrorFilterRuleRequest, DeleteTrafficMirrorFilterRuleResponse> deleteTrafficMirrorFilterRule =
        genForDeleteTrafficMirrorFilterRule();

    private static HttpRequestDef<DeleteTrafficMirrorFilterRuleRequest, DeleteTrafficMirrorFilterRuleResponse> genForDeleteTrafficMirrorFilterRule() {
        // basic
        HttpRequestDef.Builder<DeleteTrafficMirrorFilterRuleRequest, DeleteTrafficMirrorFilterRuleResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteTrafficMirrorFilterRuleRequest.class,
                    DeleteTrafficMirrorFilterRuleResponse.class)
                .withName("DeleteTrafficMirrorFilterRule")
                .withUri("/v3/{project_id}/vpc/traffic-mirror-filter-rules/{traffic_mirror_filter_rule_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("traffic_mirror_filter_rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTrafficMirrorFilterRuleRequest::getTrafficMirrorFilterRuleId,
                DeleteTrafficMirrorFilterRuleRequest::setTrafficMirrorFilterRuleId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteTrafficMirrorSessionRequest, DeleteTrafficMirrorSessionResponse> deleteTrafficMirrorSession =
        genForDeleteTrafficMirrorSession();

    private static HttpRequestDef<DeleteTrafficMirrorSessionRequest, DeleteTrafficMirrorSessionResponse> genForDeleteTrafficMirrorSession() {
        // basic
        HttpRequestDef.Builder<DeleteTrafficMirrorSessionRequest, DeleteTrafficMirrorSessionResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteTrafficMirrorSessionRequest.class,
                    DeleteTrafficMirrorSessionResponse.class)
                .withName("DeleteTrafficMirrorSession")
                .withUri("/v3/{project_id}/vpc/traffic-mirror-sessions/{traffic_mirror_session_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("traffic_mirror_session_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTrafficMirrorSessionRequest::getTrafficMirrorSessionId,
                DeleteTrafficMirrorSessionRequest::setTrafficMirrorSessionId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPortTagsRequest, ListPortTagsResponse> listPortTags = genForListPortTags();

    private static HttpRequestDef<ListPortTagsRequest, ListPortTagsResponse> genForListPortTags() {
        // basic
        HttpRequestDef.Builder<ListPortTagsRequest, ListPortTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListPortTagsRequest.class, ListPortTagsResponse.class)
                .withName("ListPortTags")
                .withUri("/v3/{project_id}/ports/tags")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPortTagsRequest::getLimit, ListPortTagsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPortTagsRequest::getOffset, ListPortTagsRequest::setOffset));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPortsByTagsRequest, ListPortsByTagsResponse> listPortsByTags =
        genForListPortsByTags();

    private static HttpRequestDef<ListPortsByTagsRequest, ListPortsByTagsResponse> genForListPortsByTags() {
        // basic
        HttpRequestDef.Builder<ListPortsByTagsRequest, ListPortsByTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListPortsByTagsRequest.class, ListPortsByTagsResponse.class)
                .withName("ListPortsByTags")
                .withUri("/v3/{project_id}/ports/resource-instances/filter")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPortsByTagsRequest::getLimit, ListPortsByTagsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPortsByTagsRequest::getOffset, ListPortsByTagsRequest::setOffset));
        builder.<ListPortsByTagsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListPortsByTagsRequestBody.class),
            f -> f.withMarshaller(ListPortsByTagsRequest::getBody, ListPortsByTagsRequest::setBody));

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
            .withUri("/v3/{project_id}/vpc/security-group-rules")
            .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSecurityGroupRulesRequest::getLimit, ListSecurityGroupRulesRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSecurityGroupRulesRequest::getMarker, ListSecurityGroupRulesRequest::setMarker));
        builder.<List<String>>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListSecurityGroupRulesRequest::getId, ListSecurityGroupRulesRequest::setId));
        builder.<List<String>>withRequestField("security_group_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListSecurityGroupRulesRequest::getSecurityGroupId,
                ListSecurityGroupRulesRequest::setSecurityGroupId));
        builder.<List<String>>withRequestField("protocol",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListSecurityGroupRulesRequest::getProtocol,
                ListSecurityGroupRulesRequest::setProtocol));
        builder.<List<String>>withRequestField("description",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListSecurityGroupRulesRequest::getDescription,
                ListSecurityGroupRulesRequest::setDescription));
        builder.<List<String>>withRequestField("remote_group_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListSecurityGroupRulesRequest::getRemoteGroupId,
                ListSecurityGroupRulesRequest::setRemoteGroupId));
        builder.<String>withRequestField("direction",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSecurityGroupRulesRequest::getDirection,
                ListSecurityGroupRulesRequest::setDirection));
        builder.<String>withRequestField("action",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSecurityGroupRulesRequest::getAction, ListSecurityGroupRulesRequest::setAction));
        builder.<String>withRequestField("remote_ip_prefix",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSecurityGroupRulesRequest::getRemoteIpPrefix,
                ListSecurityGroupRulesRequest::setRemoteIpPrefix));

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
                .withUri("/v3/{project_id}/vpc/security-groups")
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
        builder.<List<String>>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListSecurityGroupsRequest::getId, ListSecurityGroupsRequest::setId));
        builder.<List<String>>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListSecurityGroupsRequest::getName, ListSecurityGroupsRequest::setName));
        builder.<List<String>>withRequestField("description",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListSecurityGroupsRequest::getDescription,
                ListSecurityGroupsRequest::setDescription));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSecurityGroupsRequest::getEnterpriseProjectId,
                ListSecurityGroupsRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSubNetworkInterfacesRequest, ListSubNetworkInterfacesResponse> listSubNetworkInterfaces =
        genForListSubNetworkInterfaces();

    private static HttpRequestDef<ListSubNetworkInterfacesRequest, ListSubNetworkInterfacesResponse> genForListSubNetworkInterfaces() {
        // basic
        HttpRequestDef.Builder<ListSubNetworkInterfacesRequest, ListSubNetworkInterfacesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ListSubNetworkInterfacesRequest.class, ListSubNetworkInterfacesResponse.class)
                .withName("ListSubNetworkInterfaces")
                .withUri("/v3/{project_id}/vpc/sub-network-interfaces")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSubNetworkInterfacesRequest::getLimit,
                ListSubNetworkInterfacesRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSubNetworkInterfacesRequest::getMarker,
                ListSubNetworkInterfacesRequest::setMarker));
        builder.<List<String>>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListSubNetworkInterfacesRequest::getId, ListSubNetworkInterfacesRequest::setId));
        builder.<List<String>>withRequestField("virsubnet_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListSubNetworkInterfacesRequest::getVirsubnetId,
                ListSubNetworkInterfacesRequest::setVirsubnetId));
        builder.<List<String>>withRequestField("private_ip_address",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListSubNetworkInterfacesRequest::getPrivateIpAddress,
                ListSubNetworkInterfacesRequest::setPrivateIpAddress));
        builder.<List<String>>withRequestField("mac_address",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListSubNetworkInterfacesRequest::getMacAddress,
                ListSubNetworkInterfacesRequest::setMacAddress));
        builder.<List<String>>withRequestField("vpc_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListSubNetworkInterfacesRequest::getVpcId,
                ListSubNetworkInterfacesRequest::setVpcId));
        builder.<List<String>>withRequestField("description",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListSubNetworkInterfacesRequest::getDescription,
                ListSubNetworkInterfacesRequest::setDescription));
        builder.<List<String>>withRequestField("parent_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListSubNetworkInterfacesRequest::getParentId,
                ListSubNetworkInterfacesRequest::setParentId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTrafficMirrorFilterRulesRequest, ListTrafficMirrorFilterRulesResponse> listTrafficMirrorFilterRules =
        genForListTrafficMirrorFilterRules();

    private static HttpRequestDef<ListTrafficMirrorFilterRulesRequest, ListTrafficMirrorFilterRulesResponse> genForListTrafficMirrorFilterRules() {
        // basic
        HttpRequestDef.Builder<ListTrafficMirrorFilterRulesRequest, ListTrafficMirrorFilterRulesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListTrafficMirrorFilterRulesRequest.class,
                    ListTrafficMirrorFilterRulesResponse.class)
                .withName("ListTrafficMirrorFilterRules")
                .withUri("/v3/{project_id}/vpc/traffic-mirror-filter-rules")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTrafficMirrorFilterRulesRequest::getId,
                ListTrafficMirrorFilterRulesRequest::setId));
        builder.<String>withRequestField("description",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTrafficMirrorFilterRulesRequest::getDescription,
                ListTrafficMirrorFilterRulesRequest::setDescription));
        builder.<String>withRequestField("traffic_mirror_filter_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTrafficMirrorFilterRulesRequest::getTrafficMirrorFilterId,
                ListTrafficMirrorFilterRulesRequest::setTrafficMirrorFilterId));
        builder.<String>withRequestField("direction",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTrafficMirrorFilterRulesRequest::getDirection,
                ListTrafficMirrorFilterRulesRequest::setDirection));
        builder.<String>withRequestField("protocol",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTrafficMirrorFilterRulesRequest::getProtocol,
                ListTrafficMirrorFilterRulesRequest::setProtocol));
        builder.<String>withRequestField("source_cidr_block",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTrafficMirrorFilterRulesRequest::getSourceCidrBlock,
                ListTrafficMirrorFilterRulesRequest::setSourceCidrBlock));
        builder.<String>withRequestField("destination_cidr_block",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTrafficMirrorFilterRulesRequest::getDestinationCidrBlock,
                ListTrafficMirrorFilterRulesRequest::setDestinationCidrBlock));
        builder.<String>withRequestField("source_port_range",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTrafficMirrorFilterRulesRequest::getSourcePortRange,
                ListTrafficMirrorFilterRulesRequest::setSourcePortRange));
        builder.<String>withRequestField("destination_port_range",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTrafficMirrorFilterRulesRequest::getDestinationPortRange,
                ListTrafficMirrorFilterRulesRequest::setDestinationPortRange));
        builder.<String>withRequestField("action",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTrafficMirrorFilterRulesRequest::getAction,
                ListTrafficMirrorFilterRulesRequest::setAction));
        builder.<String>withRequestField("priority",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTrafficMirrorFilterRulesRequest::getPriority,
                ListTrafficMirrorFilterRulesRequest::setPriority));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTrafficMirrorFilterRulesRequest::getLimit,
                ListTrafficMirrorFilterRulesRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTrafficMirrorFilterRulesRequest::getMarker,
                ListTrafficMirrorFilterRulesRequest::setMarker));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTrafficMirrorFiltersRequest, ListTrafficMirrorFiltersResponse> listTrafficMirrorFilters =
        genForListTrafficMirrorFilters();

    private static HttpRequestDef<ListTrafficMirrorFiltersRequest, ListTrafficMirrorFiltersResponse> genForListTrafficMirrorFilters() {
        // basic
        HttpRequestDef.Builder<ListTrafficMirrorFiltersRequest, ListTrafficMirrorFiltersResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ListTrafficMirrorFiltersRequest.class, ListTrafficMirrorFiltersResponse.class)
                .withName("ListTrafficMirrorFilters")
                .withUri("/v3/{project_id}/vpc/traffic-mirror-filters")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTrafficMirrorFiltersRequest::getId, ListTrafficMirrorFiltersRequest::setId));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTrafficMirrorFiltersRequest::getName, ListTrafficMirrorFiltersRequest::setName));
        builder.<String>withRequestField("description",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTrafficMirrorFiltersRequest::getDescription,
                ListTrafficMirrorFiltersRequest::setDescription));
        builder.<String>withRequestField("created_at",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTrafficMirrorFiltersRequest::getCreatedAt,
                ListTrafficMirrorFiltersRequest::setCreatedAt));
        builder.<String>withRequestField("updated_at",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTrafficMirrorFiltersRequest::getUpdatedAt,
                ListTrafficMirrorFiltersRequest::setUpdatedAt));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTrafficMirrorFiltersRequest::getLimit,
                ListTrafficMirrorFiltersRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTrafficMirrorFiltersRequest::getMarker,
                ListTrafficMirrorFiltersRequest::setMarker));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTrafficMirrorSessionsRequest, ListTrafficMirrorSessionsResponse> listTrafficMirrorSessions =
        genForListTrafficMirrorSessions();

    private static HttpRequestDef<ListTrafficMirrorSessionsRequest, ListTrafficMirrorSessionsResponse> genForListTrafficMirrorSessions() {
        // basic
        HttpRequestDef.Builder<ListTrafficMirrorSessionsRequest, ListTrafficMirrorSessionsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListTrafficMirrorSessionsRequest.class,
                    ListTrafficMirrorSessionsResponse.class)
                .withName("ListTrafficMirrorSessions")
                .withUri("/v3/{project_id}/vpc/traffic-mirror-sessions")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTrafficMirrorSessionsRequest::getId, ListTrafficMirrorSessionsRequest::setId));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTrafficMirrorSessionsRequest::getName,
                ListTrafficMirrorSessionsRequest::setName));
        builder.<String>withRequestField("description",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTrafficMirrorSessionsRequest::getDescription,
                ListTrafficMirrorSessionsRequest::setDescription));
        builder.<String>withRequestField("traffic_mirror_filter_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTrafficMirrorSessionsRequest::getTrafficMirrorFilterId,
                ListTrafficMirrorSessionsRequest::setTrafficMirrorFilterId));
        builder.<String>withRequestField("traffic_mirror_target_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTrafficMirrorSessionsRequest::getTrafficMirrorTargetId,
                ListTrafficMirrorSessionsRequest::setTrafficMirrorTargetId));
        builder.<String>withRequestField("traffic_mirror_target_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTrafficMirrorSessionsRequest::getTrafficMirrorTargetType,
                ListTrafficMirrorSessionsRequest::setTrafficMirrorTargetType));
        builder.<String>withRequestField("virtual_network_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTrafficMirrorSessionsRequest::getVirtualNetworkId,
                ListTrafficMirrorSessionsRequest::setVirtualNetworkId));
        builder.<String>withRequestField("packet_length",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTrafficMirrorSessionsRequest::getPacketLength,
                ListTrafficMirrorSessionsRequest::setPacketLength));
        builder.<String>withRequestField("priority",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTrafficMirrorSessionsRequest::getPriority,
                ListTrafficMirrorSessionsRequest::setPriority));
        builder.<String>withRequestField("enabled",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTrafficMirrorSessionsRequest::getEnabled,
                ListTrafficMirrorSessionsRequest::setEnabled));
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTrafficMirrorSessionsRequest::getType,
                ListTrafficMirrorSessionsRequest::setType));
        builder.<String>withRequestField("created_at",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTrafficMirrorSessionsRequest::getCreatedAt,
                ListTrafficMirrorSessionsRequest::setCreatedAt));
        builder.<String>withRequestField("updated_at",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTrafficMirrorSessionsRequest::getUpdatedAt,
                ListTrafficMirrorSessionsRequest::setUpdatedAt));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTrafficMirrorSessionsRequest::getLimit,
                ListTrafficMirrorSessionsRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTrafficMirrorSessionsRequest::getMarker,
                ListTrafficMirrorSessionsRequest::setMarker));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<MigrateSubNetworkInterfaceRequest, MigrateSubNetworkInterfaceResponse> migrateSubNetworkInterface =
        genForMigrateSubNetworkInterface();

    private static HttpRequestDef<MigrateSubNetworkInterfaceRequest, MigrateSubNetworkInterfaceResponse> genForMigrateSubNetworkInterface() {
        // basic
        HttpRequestDef.Builder<MigrateSubNetworkInterfaceRequest, MigrateSubNetworkInterfaceResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    MigrateSubNetworkInterfaceRequest.class,
                    MigrateSubNetworkInterfaceResponse.class)
                .withName("MigrateSubNetworkInterface")
                .withUri("/v3/{project_id}/vpc/sub-network-interfaces/migrate")
                .withContentType("application/json");

        // requests
        builder.<MigrateSubNetworkInterfaceRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(MigrateSubNetworkInterfaceRequestBody.class),
            f -> f.withMarshaller(MigrateSubNetworkInterfaceRequest::getBody,
                MigrateSubNetworkInterfaceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RemoveSecurityGroupsRequest, RemoveSecurityGroupsResponse> removeSecurityGroups =
        genForRemoveSecurityGroups();

    private static HttpRequestDef<RemoveSecurityGroupsRequest, RemoveSecurityGroupsResponse> genForRemoveSecurityGroups() {
        // basic
        HttpRequestDef.Builder<RemoveSecurityGroupsRequest, RemoveSecurityGroupsResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, RemoveSecurityGroupsRequest.class, RemoveSecurityGroupsResponse.class)
            .withName("RemoveSecurityGroups")
            .withUri("/v3/{project_id}/ports/{port_id}/remove-security-groups")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("port_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RemoveSecurityGroupsRequest::getPortId, RemoveSecurityGroupsRequest::setPortId));
        builder.<RemoveSecurityGroupsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RemoveSecurityGroupsRequestBody.class),
            f -> f.withMarshaller(RemoveSecurityGroupsRequest::getBody, RemoveSecurityGroupsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RemoveSourcesFromTrafficMirrorSessionRequest, RemoveSourcesFromTrafficMirrorSessionResponse> removeSourcesFromTrafficMirrorSession =
        genForRemoveSourcesFromTrafficMirrorSession();

    private static HttpRequestDef<RemoveSourcesFromTrafficMirrorSessionRequest, RemoveSourcesFromTrafficMirrorSessionResponse> genForRemoveSourcesFromTrafficMirrorSession() {
        // basic
        HttpRequestDef.Builder<RemoveSourcesFromTrafficMirrorSessionRequest, RemoveSourcesFromTrafficMirrorSessionResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    RemoveSourcesFromTrafficMirrorSessionRequest.class,
                    RemoveSourcesFromTrafficMirrorSessionResponse.class)
                .withName("RemoveSourcesFromTrafficMirrorSession")
                .withUri("/v3/{project_id}/vpc/traffic-mirror-sessions/{traffic_mirror_session_id}/remove-sources")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("traffic_mirror_session_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RemoveSourcesFromTrafficMirrorSessionRequest::getTrafficMirrorSessionId,
                RemoveSourcesFromTrafficMirrorSessionRequest::setTrafficMirrorSessionId));
        builder.<RemoveSourcesFromTrafficMirrorSessionRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RemoveSourcesFromTrafficMirrorSessionRequestBody.class),
            f -> f.withMarshaller(RemoveSourcesFromTrafficMirrorSessionRequest::getBody,
                RemoveSourcesFromTrafficMirrorSessionRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowPortTagsRequest, ShowPortTagsResponse> showPortTags = genForShowPortTags();

    private static HttpRequestDef<ShowPortTagsRequest, ShowPortTagsResponse> genForShowPortTags() {
        // basic
        HttpRequestDef.Builder<ShowPortTagsRequest, ShowPortTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowPortTagsRequest.class, ShowPortTagsResponse.class)
                .withName("ShowPortTags")
                .withUri("/v3/{project_id}/ports/{port_id}/tags")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("port_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPortTagsRequest::getPortId, ShowPortTagsRequest::setPortId));

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
                .withUri("/v3/{project_id}/vpc/security-groups/{security_group_id}")
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
            .withUri("/v3/{project_id}/vpc/security-group-rules/{security_group_rule_id}")
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

    public static final HttpRequestDef<ShowSubNetworkInterfaceRequest, ShowSubNetworkInterfaceResponse> showSubNetworkInterface =
        genForShowSubNetworkInterface();

    private static HttpRequestDef<ShowSubNetworkInterfaceRequest, ShowSubNetworkInterfaceResponse> genForShowSubNetworkInterface() {
        // basic
        HttpRequestDef.Builder<ShowSubNetworkInterfaceRequest, ShowSubNetworkInterfaceResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowSubNetworkInterfaceRequest.class, ShowSubNetworkInterfaceResponse.class)
            .withName("ShowSubNetworkInterface")
            .withUri("/v3/{project_id}/vpc/sub-network-interfaces/{sub_network_interface_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("sub_network_interface_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSubNetworkInterfaceRequest::getSubNetworkInterfaceId,
                ShowSubNetworkInterfaceRequest::setSubNetworkInterfaceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowSubNetworkInterfacesQuantityRequest, ShowSubNetworkInterfacesQuantityResponse> showSubNetworkInterfacesQuantity =
        genForShowSubNetworkInterfacesQuantity();

    private static HttpRequestDef<ShowSubNetworkInterfacesQuantityRequest, ShowSubNetworkInterfacesQuantityResponse> genForShowSubNetworkInterfacesQuantity() {
        // basic
        HttpRequestDef.Builder<ShowSubNetworkInterfacesQuantityRequest, ShowSubNetworkInterfacesQuantityResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowSubNetworkInterfacesQuantityRequest.class,
                    ShowSubNetworkInterfacesQuantityResponse.class)
                .withName("ShowSubNetworkInterfacesQuantity")
                .withUri("/v3/{project_id}/vpc/sub-network-interfaces/count")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTrafficMirrorFilterRequest, ShowTrafficMirrorFilterResponse> showTrafficMirrorFilter =
        genForShowTrafficMirrorFilter();

    private static HttpRequestDef<ShowTrafficMirrorFilterRequest, ShowTrafficMirrorFilterResponse> genForShowTrafficMirrorFilter() {
        // basic
        HttpRequestDef.Builder<ShowTrafficMirrorFilterRequest, ShowTrafficMirrorFilterResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowTrafficMirrorFilterRequest.class, ShowTrafficMirrorFilterResponse.class)
            .withName("ShowTrafficMirrorFilter")
            .withUri("/v3/{project_id}/vpc/traffic-mirror-filters/{traffic_mirror_filter_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("traffic_mirror_filter_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTrafficMirrorFilterRequest::getTrafficMirrorFilterId,
                ShowTrafficMirrorFilterRequest::setTrafficMirrorFilterId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTrafficMirrorFilterRuleRequest, ShowTrafficMirrorFilterRuleResponse> showTrafficMirrorFilterRule =
        genForShowTrafficMirrorFilterRule();

    private static HttpRequestDef<ShowTrafficMirrorFilterRuleRequest, ShowTrafficMirrorFilterRuleResponse> genForShowTrafficMirrorFilterRule() {
        // basic
        HttpRequestDef.Builder<ShowTrafficMirrorFilterRuleRequest, ShowTrafficMirrorFilterRuleResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowTrafficMirrorFilterRuleRequest.class,
                    ShowTrafficMirrorFilterRuleResponse.class)
                .withName("ShowTrafficMirrorFilterRule")
                .withUri("/v3/{project_id}/vpc/traffic-mirror-filter-rules/{traffic_mirror_filter_rule_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("traffic_mirror_filter_rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTrafficMirrorFilterRuleRequest::getTrafficMirrorFilterRuleId,
                ShowTrafficMirrorFilterRuleRequest::setTrafficMirrorFilterRuleId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTrafficMirrorSessionRequest, ShowTrafficMirrorSessionResponse> showTrafficMirrorSession =
        genForShowTrafficMirrorSession();

    private static HttpRequestDef<ShowTrafficMirrorSessionRequest, ShowTrafficMirrorSessionResponse> genForShowTrafficMirrorSession() {
        // basic
        HttpRequestDef.Builder<ShowTrafficMirrorSessionRequest, ShowTrafficMirrorSessionResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ShowTrafficMirrorSessionRequest.class, ShowTrafficMirrorSessionResponse.class)
                .withName("ShowTrafficMirrorSession")
                .withUri("/v3/{project_id}/vpc/traffic-mirror-sessions/{traffic_mirror_session_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("traffic_mirror_session_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTrafficMirrorSessionRequest::getTrafficMirrorSessionId,
                ShowTrafficMirrorSessionRequest::setTrafficMirrorSessionId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateSecurityGroupRequest, UpdateSecurityGroupResponse> updateSecurityGroup =
        genForUpdateSecurityGroup();

    private static HttpRequestDef<UpdateSecurityGroupRequest, UpdateSecurityGroupResponse> genForUpdateSecurityGroup() {
        // basic
        HttpRequestDef.Builder<UpdateSecurityGroupRequest, UpdateSecurityGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateSecurityGroupRequest.class, UpdateSecurityGroupResponse.class)
                .withName("UpdateSecurityGroup")
                .withUri("/v3/{project_id}/vpc/security-groups/{security_group_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("security_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateSecurityGroupRequest::getSecurityGroupId,
                UpdateSecurityGroupRequest::setSecurityGroupId));
        builder.<UpdateSecurityGroupRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateSecurityGroupRequestBody.class),
            f -> f.withMarshaller(UpdateSecurityGroupRequest::getBody, UpdateSecurityGroupRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateSubNetworkInterfaceRequest, UpdateSubNetworkInterfaceResponse> updateSubNetworkInterface =
        genForUpdateSubNetworkInterface();

    private static HttpRequestDef<UpdateSubNetworkInterfaceRequest, UpdateSubNetworkInterfaceResponse> genForUpdateSubNetworkInterface() {
        // basic
        HttpRequestDef.Builder<UpdateSubNetworkInterfaceRequest, UpdateSubNetworkInterfaceResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateSubNetworkInterfaceRequest.class,
                    UpdateSubNetworkInterfaceResponse.class)
                .withName("UpdateSubNetworkInterface")
                .withUri("/v3/{project_id}/vpc/sub-network-interfaces/{sub_network_interface_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("sub_network_interface_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateSubNetworkInterfaceRequest::getSubNetworkInterfaceId,
                UpdateSubNetworkInterfaceRequest::setSubNetworkInterfaceId));
        builder.<UpdateSubNetworkInterfaceRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateSubNetworkInterfaceRequestBody.class),
            f -> f.withMarshaller(UpdateSubNetworkInterfaceRequest::getBody,
                UpdateSubNetworkInterfaceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateTrafficMirrorFilterRequest, UpdateTrafficMirrorFilterResponse> updateTrafficMirrorFilter =
        genForUpdateTrafficMirrorFilter();

    private static HttpRequestDef<UpdateTrafficMirrorFilterRequest, UpdateTrafficMirrorFilterResponse> genForUpdateTrafficMirrorFilter() {
        // basic
        HttpRequestDef.Builder<UpdateTrafficMirrorFilterRequest, UpdateTrafficMirrorFilterResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateTrafficMirrorFilterRequest.class,
                    UpdateTrafficMirrorFilterResponse.class)
                .withName("UpdateTrafficMirrorFilter")
                .withUri("/v3/{project_id}/vpc/traffic-mirror-filters/{traffic_mirror_filter_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("traffic_mirror_filter_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateTrafficMirrorFilterRequest::getTrafficMirrorFilterId,
                UpdateTrafficMirrorFilterRequest::setTrafficMirrorFilterId));
        builder.<UpdateTrafficMirrorFilterRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateTrafficMirrorFilterRequestBody.class),
            f -> f.withMarshaller(UpdateTrafficMirrorFilterRequest::getBody,
                UpdateTrafficMirrorFilterRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateTrafficMirrorFilterRuleRequest, UpdateTrafficMirrorFilterRuleResponse> updateTrafficMirrorFilterRule =
        genForUpdateTrafficMirrorFilterRule();

    private static HttpRequestDef<UpdateTrafficMirrorFilterRuleRequest, UpdateTrafficMirrorFilterRuleResponse> genForUpdateTrafficMirrorFilterRule() {
        // basic
        HttpRequestDef.Builder<UpdateTrafficMirrorFilterRuleRequest, UpdateTrafficMirrorFilterRuleResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateTrafficMirrorFilterRuleRequest.class,
                    UpdateTrafficMirrorFilterRuleResponse.class)
                .withName("UpdateTrafficMirrorFilterRule")
                .withUri("/v3/{project_id}/vpc/traffic-mirror-filter-rules/{traffic_mirror_filter_rule_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("traffic_mirror_filter_rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateTrafficMirrorFilterRuleRequest::getTrafficMirrorFilterRuleId,
                UpdateTrafficMirrorFilterRuleRequest::setTrafficMirrorFilterRuleId));
        builder.<UpdateTrafficMirrorFilterRuleRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateTrafficMirrorFilterRuleRequestBody.class),
            f -> f.withMarshaller(UpdateTrafficMirrorFilterRuleRequest::getBody,
                UpdateTrafficMirrorFilterRuleRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateTrafficMirrorSessionRequest, UpdateTrafficMirrorSessionResponse> updateTrafficMirrorSession =
        genForUpdateTrafficMirrorSession();

    private static HttpRequestDef<UpdateTrafficMirrorSessionRequest, UpdateTrafficMirrorSessionResponse> genForUpdateTrafficMirrorSession() {
        // basic
        HttpRequestDef.Builder<UpdateTrafficMirrorSessionRequest, UpdateTrafficMirrorSessionResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateTrafficMirrorSessionRequest.class,
                    UpdateTrafficMirrorSessionResponse.class)
                .withName("UpdateTrafficMirrorSession")
                .withUri("/v3/{project_id}/vpc/traffic-mirror-sessions/{traffic_mirror_session_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("traffic_mirror_session_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateTrafficMirrorSessionRequest::getTrafficMirrorSessionId,
                UpdateTrafficMirrorSessionRequest::setTrafficMirrorSessionId));
        builder.<UpdateTrafficMirrorSessionRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateTrafficMirrorSessionRequestBody.class),
            f -> f.withMarshaller(UpdateTrafficMirrorSessionRequest::getBody,
                UpdateTrafficMirrorSessionRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddFirewallRulesRequest, AddFirewallRulesResponse> addFirewallRules =
        genForAddFirewallRules();

    private static HttpRequestDef<AddFirewallRulesRequest, AddFirewallRulesResponse> genForAddFirewallRules() {
        // basic
        HttpRequestDef.Builder<AddFirewallRulesRequest, AddFirewallRulesResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, AddFirewallRulesRequest.class, AddFirewallRulesResponse.class)
                .withName("AddFirewallRules")
                .withUri("/v3/{project_id}/vpc/firewalls/{firewall_id}/insert-rules")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("firewall_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddFirewallRulesRequest::getFirewallId, AddFirewallRulesRequest::setFirewallId));
        builder.<AddFirewallRulesRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AddFirewallRulesRequestBody.class),
            f -> f.withMarshaller(AddFirewallRulesRequest::getBody, AddFirewallRulesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AssociateSubnetFirewallRequest, AssociateSubnetFirewallResponse> associateSubnetFirewall =
        genForAssociateSubnetFirewall();

    private static HttpRequestDef<AssociateSubnetFirewallRequest, AssociateSubnetFirewallResponse> genForAssociateSubnetFirewall() {
        // basic
        HttpRequestDef.Builder<AssociateSubnetFirewallRequest, AssociateSubnetFirewallResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, AssociateSubnetFirewallRequest.class, AssociateSubnetFirewallResponse.class)
            .withName("AssociateSubnetFirewall")
            .withUri("/v3/{project_id}/vpc/firewalls/{firewall_id}/associate-subnets")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("firewall_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AssociateSubnetFirewallRequest::getFirewallId,
                AssociateSubnetFirewallRequest::setFirewallId));
        builder.<AssociateSubnetFirewallRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AssociateSubnetFirewallRequestBody.class),
            f -> f.withMarshaller(AssociateSubnetFirewallRequest::getBody, AssociateSubnetFirewallRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchCreateFirewallTagsRequest, BatchCreateFirewallTagsResponse> batchCreateFirewallTags =
        genForBatchCreateFirewallTags();

    private static HttpRequestDef<BatchCreateFirewallTagsRequest, BatchCreateFirewallTagsResponse> genForBatchCreateFirewallTags() {
        // basic
        HttpRequestDef.Builder<BatchCreateFirewallTagsRequest, BatchCreateFirewallTagsResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, BatchCreateFirewallTagsRequest.class, BatchCreateFirewallTagsResponse.class)
            .withName("BatchCreateFirewallTags")
            .withUri("/v3/{project_id}/firewalls/{firewall_id}/tags/create")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("firewall_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchCreateFirewallTagsRequest::getFirewallId,
                BatchCreateFirewallTagsRequest::setFirewallId));
        builder.<BatchCreateFirewallTagsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(BatchCreateFirewallTagsRequestBody.class),
            f -> f.withMarshaller(BatchCreateFirewallTagsRequest::getBody, BatchCreateFirewallTagsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteFirewallTagsRequest, BatchDeleteFirewallTagsResponse> batchDeleteFirewallTags =
        genForBatchDeleteFirewallTags();

    private static HttpRequestDef<BatchDeleteFirewallTagsRequest, BatchDeleteFirewallTagsResponse> genForBatchDeleteFirewallTags() {
        // basic
        HttpRequestDef.Builder<BatchDeleteFirewallTagsRequest, BatchDeleteFirewallTagsResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, BatchDeleteFirewallTagsRequest.class, BatchDeleteFirewallTagsResponse.class)
            .withName("BatchDeleteFirewallTags")
            .withUri("/v3/{project_id}/firewalls/{firewall_id}/tags/delete")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("firewall_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeleteFirewallTagsRequest::getFirewallId,
                BatchDeleteFirewallTagsRequest::setFirewallId));
        builder.<BatchDeleteFirewallTagsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(BatchDeleteFirewallTagsRequestBody.class),
            f -> f.withMarshaller(BatchDeleteFirewallTagsRequest::getBody, BatchDeleteFirewallTagsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CountFirewallsByTagsRequest, CountFirewallsByTagsResponse> countFirewallsByTags =
        genForCountFirewallsByTags();

    private static HttpRequestDef<CountFirewallsByTagsRequest, CountFirewallsByTagsResponse> genForCountFirewallsByTags() {
        // basic
        HttpRequestDef.Builder<CountFirewallsByTagsRequest, CountFirewallsByTagsResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CountFirewallsByTagsRequest.class, CountFirewallsByTagsResponse.class)
            .withName("CountFirewallsByTags")
            .withUri("/v3/{project_id}/firewalls/resource-instances/count")
            .withContentType("application/json");

        // requests
        builder.<CountFirewallsByTagsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CountFirewallsByTagsRequestBody.class),
            f -> f.withMarshaller(CountFirewallsByTagsRequest::getBody, CountFirewallsByTagsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateFirewallRequest, CreateFirewallResponse> createFirewall =
        genForCreateFirewall();

    private static HttpRequestDef<CreateFirewallRequest, CreateFirewallResponse> genForCreateFirewall() {
        // basic
        HttpRequestDef.Builder<CreateFirewallRequest, CreateFirewallResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateFirewallRequest.class, CreateFirewallResponse.class)
                .withName("CreateFirewall")
                .withUri("/v3/{project_id}/vpc/firewalls")
                .withContentType("application/json");

        // requests
        builder.<CreateFirewallRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateFirewallRequestBody.class),
            f -> f.withMarshaller(CreateFirewallRequest::getBody, CreateFirewallRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateFirewallTagRequest, CreateFirewallTagResponse> createFirewallTag =
        genForCreateFirewallTag();

    private static HttpRequestDef<CreateFirewallTagRequest, CreateFirewallTagResponse> genForCreateFirewallTag() {
        // basic
        HttpRequestDef.Builder<CreateFirewallTagRequest, CreateFirewallTagResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateFirewallTagRequest.class, CreateFirewallTagResponse.class)
                .withName("CreateFirewallTag")
                .withUri("/v3/{project_id}/firewalls/{firewall_id}/tags")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("firewall_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateFirewallTagRequest::getFirewallId, CreateFirewallTagRequest::setFirewallId));
        builder.<CreateFirewallTagRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateFirewallTagRequestBody.class),
            f -> f.withMarshaller(CreateFirewallTagRequest::getBody, CreateFirewallTagRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteFirewallRequest, DeleteFirewallResponse> deleteFirewall =
        genForDeleteFirewall();

    private static HttpRequestDef<DeleteFirewallRequest, DeleteFirewallResponse> genForDeleteFirewall() {
        // basic
        HttpRequestDef.Builder<DeleteFirewallRequest, DeleteFirewallResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteFirewallRequest.class, DeleteFirewallResponse.class)
                .withName("DeleteFirewall")
                .withUri("/v3/{project_id}/vpc/firewalls/{firewall_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("firewall_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteFirewallRequest::getFirewallId, DeleteFirewallRequest::setFirewallId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteFirewallTagRequest, DeleteFirewallTagResponse> deleteFirewallTag =
        genForDeleteFirewallTag();

    private static HttpRequestDef<DeleteFirewallTagRequest, DeleteFirewallTagResponse> genForDeleteFirewallTag() {
        // basic
        HttpRequestDef.Builder<DeleteFirewallTagRequest, DeleteFirewallTagResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteFirewallTagRequest.class, DeleteFirewallTagResponse.class)
                .withName("DeleteFirewallTag")
                .withUri("/v3/{project_id}/firewalls/{firewall_id}/tags/{tag_key}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("firewall_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteFirewallTagRequest::getFirewallId, DeleteFirewallTagRequest::setFirewallId));
        builder.<String>withRequestField("tag_key",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteFirewallTagRequest::getTagKey, DeleteFirewallTagRequest::setTagKey));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DisassociateSubnetFirewallRequest, DisassociateSubnetFirewallResponse> disassociateSubnetFirewall =
        genForDisassociateSubnetFirewall();

    private static HttpRequestDef<DisassociateSubnetFirewallRequest, DisassociateSubnetFirewallResponse> genForDisassociateSubnetFirewall() {
        // basic
        HttpRequestDef.Builder<DisassociateSubnetFirewallRequest, DisassociateSubnetFirewallResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    DisassociateSubnetFirewallRequest.class,
                    DisassociateSubnetFirewallResponse.class)
                .withName("DisassociateSubnetFirewall")
                .withUri("/v3/{project_id}/vpc/firewalls/{firewall_id}/disassociate-subnets")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("firewall_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DisassociateSubnetFirewallRequest::getFirewallId,
                DisassociateSubnetFirewallRequest::setFirewallId));
        builder.<DisassociateSubnetFirewallRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DisassociateSubnetFirewallRequestBody.class),
            f -> f.withMarshaller(DisassociateSubnetFirewallRequest::getBody,
                DisassociateSubnetFirewallRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListFirewallRequest, ListFirewallResponse> listFirewall = genForListFirewall();

    private static HttpRequestDef<ListFirewallRequest, ListFirewallResponse> genForListFirewall() {
        // basic
        HttpRequestDef.Builder<ListFirewallRequest, ListFirewallResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListFirewallRequest.class, ListFirewallResponse.class)
                .withName("ListFirewall")
                .withUri("/v3/{project_id}/vpc/firewalls")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListFirewallRequest::getLimit, ListFirewallRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFirewallRequest::getMarker, ListFirewallRequest::setMarker));
        builder.<List<String>>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListFirewallRequest::getId, ListFirewallRequest::setId));
        builder.<List<String>>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListFirewallRequest::getName, ListFirewallRequest::setName));
        builder.<ListFirewallRequest.StatusEnum>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListFirewallRequest.StatusEnum.class),
            f -> f.withMarshaller(ListFirewallRequest::getStatus, ListFirewallRequest::setStatus));
        builder.<Boolean>withRequestField("admin_state_up",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListFirewallRequest::getAdminStateUp, ListFirewallRequest::setAdminStateUp));
        builder.<List<String>>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListFirewallRequest::getEnterpriseProjectId,
                ListFirewallRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListFirewallTagsRequest, ListFirewallTagsResponse> listFirewallTags =
        genForListFirewallTags();

    private static HttpRequestDef<ListFirewallTagsRequest, ListFirewallTagsResponse> genForListFirewallTags() {
        // basic
        HttpRequestDef.Builder<ListFirewallTagsRequest, ListFirewallTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListFirewallTagsRequest.class, ListFirewallTagsResponse.class)
                .withName("ListFirewallTags")
                .withUri("/v3/{project_id}/firewalls/tags")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListFirewallTagsRequest::getLimit, ListFirewallTagsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListFirewallTagsRequest::getOffset, ListFirewallTagsRequest::setOffset));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListFirewallsByTagsRequest, ListFirewallsByTagsResponse> listFirewallsByTags =
        genForListFirewallsByTags();

    private static HttpRequestDef<ListFirewallsByTagsRequest, ListFirewallsByTagsResponse> genForListFirewallsByTags() {
        // basic
        HttpRequestDef.Builder<ListFirewallsByTagsRequest, ListFirewallsByTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListFirewallsByTagsRequest.class, ListFirewallsByTagsResponse.class)
                .withName("ListFirewallsByTags")
                .withUri("/v3/{project_id}/firewalls/resource-instances/filter")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListFirewallsByTagsRequest::getLimit, ListFirewallsByTagsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListFirewallsByTagsRequest::getOffset, ListFirewallsByTagsRequest::setOffset));
        builder.<ListFirewallsByTagsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListFirewallsByTagsRequestBody.class),
            f -> f.withMarshaller(ListFirewallsByTagsRequest::getBody, ListFirewallsByTagsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RemoveFirewallRulesRequest, RemoveFirewallRulesResponse> removeFirewallRules =
        genForRemoveFirewallRules();

    private static HttpRequestDef<RemoveFirewallRulesRequest, RemoveFirewallRulesResponse> genForRemoveFirewallRules() {
        // basic
        HttpRequestDef.Builder<RemoveFirewallRulesRequest, RemoveFirewallRulesResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, RemoveFirewallRulesRequest.class, RemoveFirewallRulesResponse.class)
                .withName("RemoveFirewallRules")
                .withUri("/v3/{project_id}/vpc/firewalls/{firewall_id}/remove-rules")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("firewall_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RemoveFirewallRulesRequest::getFirewallId,
                RemoveFirewallRulesRequest::setFirewallId));
        builder.<RemoveFirewallRulesRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RemoveFirewallRulesRequestBody.class),
            f -> f.withMarshaller(RemoveFirewallRulesRequest::getBody, RemoveFirewallRulesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowFirewallRequest, ShowFirewallResponse> showFirewall = genForShowFirewall();

    private static HttpRequestDef<ShowFirewallRequest, ShowFirewallResponse> genForShowFirewall() {
        // basic
        HttpRequestDef.Builder<ShowFirewallRequest, ShowFirewallResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowFirewallRequest.class, ShowFirewallResponse.class)
                .withName("ShowFirewall")
                .withUri("/v3/{project_id}/vpc/firewalls/{firewall_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("firewall_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowFirewallRequest::getFirewallId, ShowFirewallRequest::setFirewallId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowFirewallTagsRequest, ShowFirewallTagsResponse> showFirewallTags =
        genForShowFirewallTags();

    private static HttpRequestDef<ShowFirewallTagsRequest, ShowFirewallTagsResponse> genForShowFirewallTags() {
        // basic
        HttpRequestDef.Builder<ShowFirewallTagsRequest, ShowFirewallTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowFirewallTagsRequest.class, ShowFirewallTagsResponse.class)
                .withName("ShowFirewallTags")
                .withUri("/v3/{project_id}/firewalls/{firewall_id}/tags")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("firewall_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowFirewallTagsRequest::getFirewallId, ShowFirewallTagsRequest::setFirewallId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateFirewallRequest, UpdateFirewallResponse> updateFirewall =
        genForUpdateFirewall();

    private static HttpRequestDef<UpdateFirewallRequest, UpdateFirewallResponse> genForUpdateFirewall() {
        // basic
        HttpRequestDef.Builder<UpdateFirewallRequest, UpdateFirewallResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateFirewallRequest.class, UpdateFirewallResponse.class)
                .withName("UpdateFirewall")
                .withUri("/v3/{project_id}/vpc/firewalls/{firewall_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("firewall_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateFirewallRequest::getFirewallId, UpdateFirewallRequest::setFirewallId));
        builder.<UpdateFirewallRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateFirewallRequestBody.class),
            f -> f.withMarshaller(UpdateFirewallRequest::getBody, UpdateFirewallRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateFirewallRulesRequest, UpdateFirewallRulesResponse> updateFirewallRules =
        genForUpdateFirewallRules();

    private static HttpRequestDef<UpdateFirewallRulesRequest, UpdateFirewallRulesResponse> genForUpdateFirewallRules() {
        // basic
        HttpRequestDef.Builder<UpdateFirewallRulesRequest, UpdateFirewallRulesResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateFirewallRulesRequest.class, UpdateFirewallRulesResponse.class)
                .withName("UpdateFirewallRules")
                .withUri("/v3/{project_id}/vpc/firewalls/{firewall_id}/update-rules")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("firewall_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateFirewallRulesRequest::getFirewallId,
                UpdateFirewallRulesRequest::setFirewallId));
        builder.<UpdateFirewallRulesRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateFirewallRulesRequestBody.class),
            f -> f.withMarshaller(UpdateFirewallRulesRequest::getBody, UpdateFirewallRulesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddClouddcnSubnetsTagsRequest, AddClouddcnSubnetsTagsResponse> addClouddcnSubnetsTags =
        genForAddClouddcnSubnetsTags();

    private static HttpRequestDef<AddClouddcnSubnetsTagsRequest, AddClouddcnSubnetsTagsResponse> genForAddClouddcnSubnetsTags() {
        // basic
        HttpRequestDef.Builder<AddClouddcnSubnetsTagsRequest, AddClouddcnSubnetsTagsResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, AddClouddcnSubnetsTagsRequest.class, AddClouddcnSubnetsTagsResponse.class)
            .withName("AddClouddcnSubnetsTags")
            .withUri("/v3/{project_id}/clouddcn-subnets/{resource_id}/tags")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddClouddcnSubnetsTagsRequest::getResourceId,
                AddClouddcnSubnetsTagsRequest::setResourceId));
        builder.<AddResourceTagsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AddResourceTagsRequestBody.class),
            f -> f.withMarshaller(AddClouddcnSubnetsTagsRequest::getBody, AddClouddcnSubnetsTagsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchCreateClouddcnSubnetsTagsRequest, BatchCreateClouddcnSubnetsTagsResponse> batchCreateClouddcnSubnetsTags =
        genForBatchCreateClouddcnSubnetsTags();

    private static HttpRequestDef<BatchCreateClouddcnSubnetsTagsRequest, BatchCreateClouddcnSubnetsTagsResponse> genForBatchCreateClouddcnSubnetsTags() {
        // basic
        HttpRequestDef.Builder<BatchCreateClouddcnSubnetsTagsRequest, BatchCreateClouddcnSubnetsTagsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    BatchCreateClouddcnSubnetsTagsRequest.class,
                    BatchCreateClouddcnSubnetsTagsResponse.class)
                .withName("BatchCreateClouddcnSubnetsTags")
                .withUri("/v3/{project_id}/clouddcn-subnets/{resource_id}/tags/create")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchCreateClouddcnSubnetsTagsRequest::getResourceId,
                BatchCreateClouddcnSubnetsTagsRequest::setResourceId));
        builder.<BatchCreateRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchCreateRequestBody.class),
            f -> f.withMarshaller(BatchCreateClouddcnSubnetsTagsRequest::getBody,
                BatchCreateClouddcnSubnetsTagsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteClouddcnSubnetsTagsRequest, BatchDeleteClouddcnSubnetsTagsResponse> batchDeleteClouddcnSubnetsTags =
        genForBatchDeleteClouddcnSubnetsTags();

    private static HttpRequestDef<BatchDeleteClouddcnSubnetsTagsRequest, BatchDeleteClouddcnSubnetsTagsResponse> genForBatchDeleteClouddcnSubnetsTags() {
        // basic
        HttpRequestDef.Builder<BatchDeleteClouddcnSubnetsTagsRequest, BatchDeleteClouddcnSubnetsTagsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    BatchDeleteClouddcnSubnetsTagsRequest.class,
                    BatchDeleteClouddcnSubnetsTagsResponse.class)
                .withName("BatchDeleteClouddcnSubnetsTags")
                .withUri("/v3/{project_id}/clouddcn-subnets/{resource_id}/tags/delete")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeleteClouddcnSubnetsTagsRequest::getResourceId,
                BatchDeleteClouddcnSubnetsTagsRequest::setResourceId));
        builder.<BatchDeleteRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchDeleteRequestBody.class),
            f -> f.withMarshaller(BatchDeleteClouddcnSubnetsTagsRequest::getBody,
                BatchDeleteClouddcnSubnetsTagsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateClouddcnSubnetRequest, CreateClouddcnSubnetResponse> createClouddcnSubnet =
        genForCreateClouddcnSubnet();

    private static HttpRequestDef<CreateClouddcnSubnetRequest, CreateClouddcnSubnetResponse> genForCreateClouddcnSubnet() {
        // basic
        HttpRequestDef.Builder<CreateClouddcnSubnetRequest, CreateClouddcnSubnetResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateClouddcnSubnetRequest.class, CreateClouddcnSubnetResponse.class)
            .withName("CreateClouddcnSubnet")
            .withUri("/v3/{project_id}/vpc/clouddcn-subnets")
            .withContentType("application/json");

        // requests
        builder.<CreateClouddcnSubnetRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateClouddcnSubnetRequestBody.class),
            f -> f.withMarshaller(CreateClouddcnSubnetRequest::getBody, CreateClouddcnSubnetRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteClouddcnSubnetRequest, DeleteClouddcnSubnetResponse> deleteClouddcnSubnet =
        genForDeleteClouddcnSubnet();

    private static HttpRequestDef<DeleteClouddcnSubnetRequest, DeleteClouddcnSubnetResponse> genForDeleteClouddcnSubnet() {
        // basic
        HttpRequestDef.Builder<DeleteClouddcnSubnetRequest, DeleteClouddcnSubnetResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteClouddcnSubnetRequest.class, DeleteClouddcnSubnetResponse.class)
            .withName("DeleteClouddcnSubnet")
            .withUri("/v3/{project_id}/vpc/clouddcn-subnets/{clouddcn_subnet_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("clouddcn_subnet_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteClouddcnSubnetRequest::getClouddcnSubnetId,
                DeleteClouddcnSubnetRequest::setClouddcnSubnetId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteClouddcnSubnetsTagRequest, DeleteClouddcnSubnetsTagResponse> deleteClouddcnSubnetsTag =
        genForDeleteClouddcnSubnetsTag();

    private static HttpRequestDef<DeleteClouddcnSubnetsTagRequest, DeleteClouddcnSubnetsTagResponse> genForDeleteClouddcnSubnetsTag() {
        // basic
        HttpRequestDef.Builder<DeleteClouddcnSubnetsTagRequest, DeleteClouddcnSubnetsTagResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteClouddcnSubnetsTagRequest.class,
                    DeleteClouddcnSubnetsTagResponse.class)
                .withName("DeleteClouddcnSubnetsTag")
                .withUri("/v3/{project_id}/clouddcn-subnets/{resource_id}/tags/{tag_key}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteClouddcnSubnetsTagRequest::getResourceId,
                DeleteClouddcnSubnetsTagRequest::setResourceId));
        builder.<String>withRequestField("tag_key",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteClouddcnSubnetsTagRequest::getTagKey,
                DeleteClouddcnSubnetsTagRequest::setTagKey));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListClouddcnSubnetsRequest, ListClouddcnSubnetsResponse> listClouddcnSubnets =
        genForListClouddcnSubnets();

    private static HttpRequestDef<ListClouddcnSubnetsRequest, ListClouddcnSubnetsResponse> genForListClouddcnSubnets() {
        // basic
        HttpRequestDef.Builder<ListClouddcnSubnetsRequest, ListClouddcnSubnetsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListClouddcnSubnetsRequest.class, ListClouddcnSubnetsResponse.class)
                .withName("ListClouddcnSubnets")
                .withUri("/v3/{project_id}/vpc/clouddcn-subnets")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListClouddcnSubnetsRequest::getLimit, ListClouddcnSubnetsRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListClouddcnSubnetsRequest::getMarker, ListClouddcnSubnetsRequest::setMarker));
        builder.<String>withRequestField("vpc_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListClouddcnSubnetsRequest::getVpcId, ListClouddcnSubnetsRequest::setVpcId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListClouddcnSubnetsCountFilterTagsRequest, ListClouddcnSubnetsCountFilterTagsResponse> listClouddcnSubnetsCountFilterTags =
        genForListClouddcnSubnetsCountFilterTags();

    private static HttpRequestDef<ListClouddcnSubnetsCountFilterTagsRequest, ListClouddcnSubnetsCountFilterTagsResponse> genForListClouddcnSubnetsCountFilterTags() {
        // basic
        HttpRequestDef.Builder<ListClouddcnSubnetsCountFilterTagsRequest, ListClouddcnSubnetsCountFilterTagsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ListClouddcnSubnetsCountFilterTagsRequest.class,
                    ListClouddcnSubnetsCountFilterTagsResponse.class)
                .withName("ListClouddcnSubnetsCountFilterTags")
                .withUri("/v3/{project_id}/clouddcn-subnets/resource-instances/count")
                .withContentType("application/json");

        // requests
        builder.<ListResourcesByTagsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListResourcesByTagsRequestBody.class),
            f -> f.withMarshaller(ListClouddcnSubnetsCountFilterTagsRequest::getBody,
                ListClouddcnSubnetsCountFilterTagsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListClouddcnSubnetsFilterTagsRequest, ListClouddcnSubnetsFilterTagsResponse> listClouddcnSubnetsFilterTags =
        genForListClouddcnSubnetsFilterTags();

    private static HttpRequestDef<ListClouddcnSubnetsFilterTagsRequest, ListClouddcnSubnetsFilterTagsResponse> genForListClouddcnSubnetsFilterTags() {
        // basic
        HttpRequestDef.Builder<ListClouddcnSubnetsFilterTagsRequest, ListClouddcnSubnetsFilterTagsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ListClouddcnSubnetsFilterTagsRequest.class,
                    ListClouddcnSubnetsFilterTagsResponse.class)
                .withName("ListClouddcnSubnetsFilterTags")
                .withUri("/v3/{project_id}/clouddcn-subnets/resource-instances/filter")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListClouddcnSubnetsFilterTagsRequest::getLimit,
                ListClouddcnSubnetsFilterTagsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListClouddcnSubnetsFilterTagsRequest::getOffset,
                ListClouddcnSubnetsFilterTagsRequest::setOffset));
        builder.<ListResourcesByTagsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListResourcesByTagsRequestBody.class),
            f -> f.withMarshaller(ListClouddcnSubnetsFilterTagsRequest::getBody,
                ListClouddcnSubnetsFilterTagsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListClouddcnSubnetsTagsRequest, ListClouddcnSubnetsTagsResponse> listClouddcnSubnetsTags =
        genForListClouddcnSubnetsTags();

    private static HttpRequestDef<ListClouddcnSubnetsTagsRequest, ListClouddcnSubnetsTagsResponse> genForListClouddcnSubnetsTags() {
        // basic
        HttpRequestDef.Builder<ListClouddcnSubnetsTagsRequest, ListClouddcnSubnetsTagsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListClouddcnSubnetsTagsRequest.class, ListClouddcnSubnetsTagsResponse.class)
            .withName("ListClouddcnSubnetsTags")
            .withUri("/v3/{project_id}/clouddcn-subnets/tags")
            .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowClouddcnSubnetRequest, ShowClouddcnSubnetResponse> showClouddcnSubnet =
        genForShowClouddcnSubnet();

    private static HttpRequestDef<ShowClouddcnSubnetRequest, ShowClouddcnSubnetResponse> genForShowClouddcnSubnet() {
        // basic
        HttpRequestDef.Builder<ShowClouddcnSubnetRequest, ShowClouddcnSubnetResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowClouddcnSubnetRequest.class, ShowClouddcnSubnetResponse.class)
                .withName("ShowClouddcnSubnet")
                .withUri("/v3/{project_id}/vpc/clouddcn-subnets/{clouddcn_subnet_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("clouddcn_subnet_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowClouddcnSubnetRequest::getClouddcnSubnetId,
                ShowClouddcnSubnetRequest::setClouddcnSubnetId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowClouddcnSubnetsTagsRequest, ShowClouddcnSubnetsTagsResponse> showClouddcnSubnetsTags =
        genForShowClouddcnSubnetsTags();

    private static HttpRequestDef<ShowClouddcnSubnetsTagsRequest, ShowClouddcnSubnetsTagsResponse> genForShowClouddcnSubnetsTags() {
        // basic
        HttpRequestDef.Builder<ShowClouddcnSubnetsTagsRequest, ShowClouddcnSubnetsTagsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowClouddcnSubnetsTagsRequest.class, ShowClouddcnSubnetsTagsResponse.class)
            .withName("ShowClouddcnSubnetsTags")
            .withUri("/v3/{project_id}/clouddcn-subnets/{resource_id}/tags")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowClouddcnSubnetsTagsRequest::getResourceId,
                ShowClouddcnSubnetsTagsRequest::setResourceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateClouddcnSubnetRequest, UpdateClouddcnSubnetResponse> updateClouddcnSubnet =
        genForUpdateClouddcnSubnet();

    private static HttpRequestDef<UpdateClouddcnSubnetRequest, UpdateClouddcnSubnetResponse> genForUpdateClouddcnSubnet() {
        // basic
        HttpRequestDef.Builder<UpdateClouddcnSubnetRequest, UpdateClouddcnSubnetResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateClouddcnSubnetRequest.class, UpdateClouddcnSubnetResponse.class)
            .withName("UpdateClouddcnSubnet")
            .withUri("/v3/{project_id}/vpc/clouddcn-subnets/{clouddcn_subnet_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("clouddcn_subnet_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateClouddcnSubnetRequest::getClouddcnSubnetId,
                UpdateClouddcnSubnetRequest::setClouddcnSubnetId));
        builder.<UpdateClouddcnSubnetRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateClouddcnSubnetRequestBody.class),
            f -> f.withMarshaller(UpdateClouddcnSubnetRequest::getBody, UpdateClouddcnSubnetRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateAddressGroupRequest, CreateAddressGroupResponse> createAddressGroup =
        genForCreateAddressGroup();

    private static HttpRequestDef<CreateAddressGroupRequest, CreateAddressGroupResponse> genForCreateAddressGroup() {
        // basic
        HttpRequestDef.Builder<CreateAddressGroupRequest, CreateAddressGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateAddressGroupRequest.class, CreateAddressGroupResponse.class)
                .withName("CreateAddressGroup")
                .withUri("/v3/{project_id}/vpc/address-groups")
                .withContentType("application/json");

        // requests
        builder.<CreateAddressGroupRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateAddressGroupRequestBody.class),
            f -> f.withMarshaller(CreateAddressGroupRequest::getBody, CreateAddressGroupRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteAddressGroupRequest, DeleteAddressGroupResponse> deleteAddressGroup =
        genForDeleteAddressGroup();

    private static HttpRequestDef<DeleteAddressGroupRequest, DeleteAddressGroupResponse> genForDeleteAddressGroup() {
        // basic
        HttpRequestDef.Builder<DeleteAddressGroupRequest, DeleteAddressGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteAddressGroupRequest.class, DeleteAddressGroupResponse.class)
                .withName("DeleteAddressGroup")
                .withUri("/v3/{project_id}/vpc/address-groups/{address_group_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("address_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAddressGroupRequest::getAddressGroupId,
                DeleteAddressGroupRequest::setAddressGroupId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteIpAddressGroupForceRequest, DeleteIpAddressGroupForceResponse> deleteIpAddressGroupForce =
        genForDeleteIpAddressGroupForce();

    private static HttpRequestDef<DeleteIpAddressGroupForceRequest, DeleteIpAddressGroupForceResponse> genForDeleteIpAddressGroupForce() {
        // basic
        HttpRequestDef.Builder<DeleteIpAddressGroupForceRequest, DeleteIpAddressGroupForceResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteIpAddressGroupForceRequest.class,
                    DeleteIpAddressGroupForceResponse.class)
                .withName("DeleteIpAddressGroupForce")
                .withUri("/v3/{project_id}/vpc/address-groups/{address_group_id}/force")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("address_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteIpAddressGroupForceRequest::getAddressGroupId,
                DeleteIpAddressGroupForceRequest::setAddressGroupId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAddressGroupRequest, ListAddressGroupResponse> listAddressGroup =
        genForListAddressGroup();

    private static HttpRequestDef<ListAddressGroupRequest, ListAddressGroupResponse> genForListAddressGroup() {
        // basic
        HttpRequestDef.Builder<ListAddressGroupRequest, ListAddressGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAddressGroupRequest.class, ListAddressGroupResponse.class)
                .withName("ListAddressGroup")
                .withUri("/v3/{project_id}/vpc/address-groups")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAddressGroupRequest::getLimit, ListAddressGroupRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAddressGroupRequest::getMarker, ListAddressGroupRequest::setMarker));
        builder.<List<String>>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListAddressGroupRequest::getId, ListAddressGroupRequest::setId));
        builder.<List<String>>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListAddressGroupRequest::getName, ListAddressGroupRequest::setName));
        builder.<Integer>withRequestField("ip_version",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAddressGroupRequest::getIpVersion, ListAddressGroupRequest::setIpVersion));
        builder.<List<String>>withRequestField("description",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListAddressGroupRequest::getDescription, ListAddressGroupRequest::setDescription));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAddressGroupRequest::getEnterpriseProjectId,
                ListAddressGroupRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAddressGroupRequest, ShowAddressGroupResponse> showAddressGroup =
        genForShowAddressGroup();

    private static HttpRequestDef<ShowAddressGroupRequest, ShowAddressGroupResponse> genForShowAddressGroup() {
        // basic
        HttpRequestDef.Builder<ShowAddressGroupRequest, ShowAddressGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowAddressGroupRequest.class, ShowAddressGroupResponse.class)
                .withName("ShowAddressGroup")
                .withUri("/v3/{project_id}/vpc/address-groups/{address_group_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("address_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAddressGroupRequest::getAddressGroupId,
                ShowAddressGroupRequest::setAddressGroupId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateAddressGroupRequest, UpdateAddressGroupResponse> updateAddressGroup =
        genForUpdateAddressGroup();

    private static HttpRequestDef<UpdateAddressGroupRequest, UpdateAddressGroupResponse> genForUpdateAddressGroup() {
        // basic
        HttpRequestDef.Builder<UpdateAddressGroupRequest, UpdateAddressGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateAddressGroupRequest.class, UpdateAddressGroupResponse.class)
                .withName("UpdateAddressGroup")
                .withUri("/v3/{project_id}/vpc/address-groups/{address_group_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("address_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAddressGroupRequest::getAddressGroupId,
                UpdateAddressGroupRequest::setAddressGroupId));
        builder.<UpdateAddressGroupRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateAddressGroupRequestBody.class),
            f -> f.withMarshaller(UpdateAddressGroupRequest::getBody, UpdateAddressGroupRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddVpcExtendCidrRequest, AddVpcExtendCidrResponse> addVpcExtendCidr =
        genForAddVpcExtendCidr();

    private static HttpRequestDef<AddVpcExtendCidrRequest, AddVpcExtendCidrResponse> genForAddVpcExtendCidr() {
        // basic
        HttpRequestDef.Builder<AddVpcExtendCidrRequest, AddVpcExtendCidrResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, AddVpcExtendCidrRequest.class, AddVpcExtendCidrResponse.class)
                .withName("AddVpcExtendCidr")
                .withUri("/v3/{project_id}/vpc/vpcs/{vpc_id}/add-extend-cidr")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("vpc_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddVpcExtendCidrRequest::getVpcId, AddVpcExtendCidrRequest::setVpcId));
        builder.<AddVpcExtendCidrRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AddVpcExtendCidrRequestBody.class),
            f -> f.withMarshaller(AddVpcExtendCidrRequest::getBody, AddVpcExtendCidrRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateVpcRequest, CreateVpcResponse> createVpc = genForCreateVpc();

    private static HttpRequestDef<CreateVpcRequest, CreateVpcResponse> genForCreateVpc() {
        // basic
        HttpRequestDef.Builder<CreateVpcRequest, CreateVpcResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateVpcRequest.class, CreateVpcResponse.class)
                .withName("CreateVpc")
                .withUri("/v3/{project_id}/vpc/vpcs")
                .withContentType("application/json");

        // requests
        builder.<CreateVpcRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateVpcRequestBody.class),
            f -> f.withMarshaller(CreateVpcRequest::getBody, CreateVpcRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteVpcRequest, DeleteVpcResponse> deleteVpc = genForDeleteVpc();

    private static HttpRequestDef<DeleteVpcRequest, DeleteVpcResponse> genForDeleteVpc() {
        // basic
        HttpRequestDef.Builder<DeleteVpcRequest, DeleteVpcResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteVpcRequest.class, DeleteVpcResponse.class)
                .withName("DeleteVpc")
                .withUri("/v3/{project_id}/vpc/vpcs/{vpc_id}")
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

    public static final HttpRequestDef<ListVpcsRequest, ListVpcsResponse> listVpcs = genForListVpcs();

    private static HttpRequestDef<ListVpcsRequest, ListVpcsResponse> genForListVpcs() {
        // basic
        HttpRequestDef.Builder<ListVpcsRequest, ListVpcsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListVpcsRequest.class, ListVpcsResponse.class)
                .withName("ListVpcs")
                .withUri("/v3/{project_id}/vpc/vpcs")
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
        builder.<List<String>>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListVpcsRequest::getId, ListVpcsRequest::setId));
        builder.<List<String>>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListVpcsRequest::getName, ListVpcsRequest::setName));
        builder.<List<String>>withRequestField("description",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListVpcsRequest::getDescription, ListVpcsRequest::setDescription));
        builder.<List<String>>withRequestField("cidr",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListVpcsRequest::getCidr, ListVpcsRequest::setCidr));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RemoveVpcExtendCidrRequest, RemoveVpcExtendCidrResponse> removeVpcExtendCidr =
        genForRemoveVpcExtendCidr();

    private static HttpRequestDef<RemoveVpcExtendCidrRequest, RemoveVpcExtendCidrResponse> genForRemoveVpcExtendCidr() {
        // basic
        HttpRequestDef.Builder<RemoveVpcExtendCidrRequest, RemoveVpcExtendCidrResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, RemoveVpcExtendCidrRequest.class, RemoveVpcExtendCidrResponse.class)
                .withName("RemoveVpcExtendCidr")
                .withUri("/v3/{project_id}/vpc/vpcs/{vpc_id}/remove-extend-cidr")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("vpc_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RemoveVpcExtendCidrRequest::getVpcId, RemoveVpcExtendCidrRequest::setVpcId));
        builder.<RemoveVpcExtendCidrRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RemoveVpcExtendCidrRequestBody.class),
            f -> f.withMarshaller(RemoveVpcExtendCidrRequest::getBody, RemoveVpcExtendCidrRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowVpcRequest, ShowVpcResponse> showVpc = genForShowVpc();

    private static HttpRequestDef<ShowVpcRequest, ShowVpcResponse> genForShowVpc() {
        // basic
        HttpRequestDef.Builder<ShowVpcRequest, ShowVpcResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowVpcRequest.class, ShowVpcResponse.class)
                .withName("ShowVpc")
                .withUri("/v3/{project_id}/vpc/vpcs/{vpc_id}")
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

    public static final HttpRequestDef<UpdateVpcRequest, UpdateVpcResponse> updateVpc = genForUpdateVpc();

    private static HttpRequestDef<UpdateVpcRequest, UpdateVpcResponse> genForUpdateVpc() {
        // basic
        HttpRequestDef.Builder<UpdateVpcRequest, UpdateVpcResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateVpcRequest.class, UpdateVpcResponse.class)
                .withName("UpdateVpc")
                .withUri("/v3/{project_id}/vpc/vpcs/{vpc_id}")
                .withContentType("application/json");

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
