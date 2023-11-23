package com.huaweicloud.sdk.vpc.v3;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.vpc.v3.model.AddFirewallRulesRequest;
import com.huaweicloud.sdk.vpc.v3.model.AddFirewallRulesRequestBody;
import com.huaweicloud.sdk.vpc.v3.model.AddFirewallRulesResponse;
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
import com.huaweicloud.sdk.vpc.v3.model.BatchCreateSecurityGroupRulesRequest;
import com.huaweicloud.sdk.vpc.v3.model.BatchCreateSecurityGroupRulesRequestBody;
import com.huaweicloud.sdk.vpc.v3.model.BatchCreateSecurityGroupRulesResponse;
import com.huaweicloud.sdk.vpc.v3.model.BatchCreateSubNetworkInterfaceRequest;
import com.huaweicloud.sdk.vpc.v3.model.BatchCreateSubNetworkInterfaceRequestBody;
import com.huaweicloud.sdk.vpc.v3.model.BatchCreateSubNetworkInterfaceResponse;
import com.huaweicloud.sdk.vpc.v3.model.CreateAddressGroupRequest;
import com.huaweicloud.sdk.vpc.v3.model.CreateAddressGroupRequestBody;
import com.huaweicloud.sdk.vpc.v3.model.CreateAddressGroupResponse;
import com.huaweicloud.sdk.vpc.v3.model.CreateFirewallRequest;
import com.huaweicloud.sdk.vpc.v3.model.CreateFirewallRequestBody;
import com.huaweicloud.sdk.vpc.v3.model.CreateFirewallResponse;
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
import com.huaweicloud.sdk.vpc.v3.model.DisassociateSubnetFirewallRequestBody;
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
import com.huaweicloud.sdk.vpc.v3.model.UpdateAddressGroupRequestBody;
import com.huaweicloud.sdk.vpc.v3.model.UpdateAddressGroupResponse;
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
        genForaddSecurityGroups();

    private static HttpRequestDef<AddSecurityGroupsRequest, AddSecurityGroupsResponse> genForaddSecurityGroups() {
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
            f -> f.withMarshaller(AddSecurityGroupsRequest::getPortId, (req, v) -> {
                req.setPortId(v);
            }));
        builder.<AddSecurityGroupsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AddSecurityGroupsRequestBody.class),
            f -> f.withMarshaller(AddSecurityGroupsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddSourcesToTrafficMirrorSessionRequest, AddSourcesToTrafficMirrorSessionResponse> addSourcesToTrafficMirrorSession =
        genForaddSourcesToTrafficMirrorSession();

    private static HttpRequestDef<AddSourcesToTrafficMirrorSessionRequest, AddSourcesToTrafficMirrorSessionResponse> genForaddSourcesToTrafficMirrorSession() {
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
            f -> f.withMarshaller(AddSourcesToTrafficMirrorSessionRequest::getTrafficMirrorSessionId, (req, v) -> {
                req.setTrafficMirrorSessionId(v);
            }));
        builder.<AddSourcesToTrafficMirrorSessionRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AddSourcesToTrafficMirrorSessionRequestBody.class),
            f -> f.withMarshaller(AddSourcesToTrafficMirrorSessionRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchCreateSecurityGroupRulesRequest, BatchCreateSecurityGroupRulesResponse> batchCreateSecurityGroupRules =
        genForbatchCreateSecurityGroupRules();

    private static HttpRequestDef<BatchCreateSecurityGroupRulesRequest, BatchCreateSecurityGroupRulesResponse> genForbatchCreateSecurityGroupRules() {
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
            f -> f.withMarshaller(BatchCreateSecurityGroupRulesRequest::getSecurityGroupId, (req, v) -> {
                req.setSecurityGroupId(v);
            }));
        builder.<BatchCreateSecurityGroupRulesRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchCreateSecurityGroupRulesRequestBody.class),
            f -> f.withMarshaller(BatchCreateSecurityGroupRulesRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchCreateSubNetworkInterfaceRequest, BatchCreateSubNetworkInterfaceResponse> batchCreateSubNetworkInterface =
        genForbatchCreateSubNetworkInterface();

    private static HttpRequestDef<BatchCreateSubNetworkInterfaceRequest, BatchCreateSubNetworkInterfaceResponse> genForbatchCreateSubNetworkInterface() {
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
            f -> f.withMarshaller(BatchCreateSubNetworkInterfaceRequest::getBody, (req, v) -> {
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
                .withUri("/v3/{project_id}/vpc/security-groups")
                .withContentType("application/json");

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
            .withUri("/v3/{project_id}/vpc/security-group-rules")
            .withContentType("application/json");

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

    public static final HttpRequestDef<CreateSubNetworkInterfaceRequest, CreateSubNetworkInterfaceResponse> createSubNetworkInterface =
        genForcreateSubNetworkInterface();

    private static HttpRequestDef<CreateSubNetworkInterfaceRequest, CreateSubNetworkInterfaceResponse> genForcreateSubNetworkInterface() {
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
            f -> f.withMarshaller(CreateSubNetworkInterfaceRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateTrafficMirrorFilterRequest, CreateTrafficMirrorFilterResponse> createTrafficMirrorFilter =
        genForcreateTrafficMirrorFilter();

    private static HttpRequestDef<CreateTrafficMirrorFilterRequest, CreateTrafficMirrorFilterResponse> genForcreateTrafficMirrorFilter() {
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
            f -> f.withMarshaller(CreateTrafficMirrorFilterRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateTrafficMirrorFilterRuleRequest, CreateTrafficMirrorFilterRuleResponse> createTrafficMirrorFilterRule =
        genForcreateTrafficMirrorFilterRule();

    private static HttpRequestDef<CreateTrafficMirrorFilterRuleRequest, CreateTrafficMirrorFilterRuleResponse> genForcreateTrafficMirrorFilterRule() {
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
            f -> f.withMarshaller(CreateTrafficMirrorFilterRuleRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateTrafficMirrorSessionRequest, CreateTrafficMirrorSessionResponse> createTrafficMirrorSession =
        genForcreateTrafficMirrorSession();

    private static HttpRequestDef<CreateTrafficMirrorSessionRequest, CreateTrafficMirrorSessionResponse> genForcreateTrafficMirrorSession() {
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
            f -> f.withMarshaller(CreateTrafficMirrorSessionRequest::getBody, (req, v) -> {
                req.setBody(v);
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
            .withUri("/v3/{project_id}/vpc/security-groups/{security_group_id}")
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
            .withUri("/v3/{project_id}/vpc/security-group-rules/{security_group_rule_id}")
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

    public static final HttpRequestDef<DeleteSubNetworkInterfaceRequest, DeleteSubNetworkInterfaceResponse> deleteSubNetworkInterface =
        genFordeleteSubNetworkInterface();

    private static HttpRequestDef<DeleteSubNetworkInterfaceRequest, DeleteSubNetworkInterfaceResponse> genFordeleteSubNetworkInterface() {
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
            f -> f.withMarshaller(DeleteSubNetworkInterfaceRequest::getSubNetworkInterfaceId, (req, v) -> {
                req.setSubNetworkInterfaceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteTrafficMirrorFilterRequest, DeleteTrafficMirrorFilterResponse> deleteTrafficMirrorFilter =
        genFordeleteTrafficMirrorFilter();

    private static HttpRequestDef<DeleteTrafficMirrorFilterRequest, DeleteTrafficMirrorFilterResponse> genFordeleteTrafficMirrorFilter() {
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
            f -> f.withMarshaller(DeleteTrafficMirrorFilterRequest::getTrafficMirrorFilterId, (req, v) -> {
                req.setTrafficMirrorFilterId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteTrafficMirrorFilterRuleRequest, DeleteTrafficMirrorFilterRuleResponse> deleteTrafficMirrorFilterRule =
        genFordeleteTrafficMirrorFilterRule();

    private static HttpRequestDef<DeleteTrafficMirrorFilterRuleRequest, DeleteTrafficMirrorFilterRuleResponse> genFordeleteTrafficMirrorFilterRule() {
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
            f -> f.withMarshaller(DeleteTrafficMirrorFilterRuleRequest::getTrafficMirrorFilterRuleId, (req, v) -> {
                req.setTrafficMirrorFilterRuleId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteTrafficMirrorSessionRequest, DeleteTrafficMirrorSessionResponse> deleteTrafficMirrorSession =
        genFordeleteTrafficMirrorSession();

    private static HttpRequestDef<DeleteTrafficMirrorSessionRequest, DeleteTrafficMirrorSessionResponse> genFordeleteTrafficMirrorSession() {
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
            f -> f.withMarshaller(DeleteTrafficMirrorSessionRequest::getTrafficMirrorSessionId, (req, v) -> {
                req.setTrafficMirrorSessionId(v);
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
            .withUri("/v3/{project_id}/vpc/security-group-rules")
            .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSecurityGroupRulesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSecurityGroupRulesRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));
        builder.<List<String>>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListSecurityGroupRulesRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<List<String>>withRequestField("security_group_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListSecurityGroupRulesRequest::getSecurityGroupId, (req, v) -> {
                req.setSecurityGroupId(v);
            }));
        builder.<List<String>>withRequestField("protocol",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListSecurityGroupRulesRequest::getProtocol, (req, v) -> {
                req.setProtocol(v);
            }));
        builder.<List<String>>withRequestField("description",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListSecurityGroupRulesRequest::getDescription, (req, v) -> {
                req.setDescription(v);
            }));
        builder.<List<String>>withRequestField("remote_group_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListSecurityGroupRulesRequest::getRemoteGroupId, (req, v) -> {
                req.setRemoteGroupId(v);
            }));
        builder.<String>withRequestField("direction",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSecurityGroupRulesRequest::getDirection, (req, v) -> {
                req.setDirection(v);
            }));
        builder.<String>withRequestField("action",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSecurityGroupRulesRequest::getAction, (req, v) -> {
                req.setAction(v);
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
                .withUri("/v3/{project_id}/vpc/security-groups")
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
        builder.<List<String>>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListSecurityGroupsRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<List<String>>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListSecurityGroupsRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<List<String>>withRequestField("description",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListSecurityGroupsRequest::getDescription, (req, v) -> {
                req.setDescription(v);
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

    public static final HttpRequestDef<ListSubNetworkInterfacesRequest, ListSubNetworkInterfacesResponse> listSubNetworkInterfaces =
        genForlistSubNetworkInterfaces();

    private static HttpRequestDef<ListSubNetworkInterfacesRequest, ListSubNetworkInterfacesResponse> genForlistSubNetworkInterfaces() {
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
            f -> f.withMarshaller(ListSubNetworkInterfacesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSubNetworkInterfacesRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));
        builder.<List<String>>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListSubNetworkInterfacesRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<List<String>>withRequestField("virsubnet_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListSubNetworkInterfacesRequest::getVirsubnetId, (req, v) -> {
                req.setVirsubnetId(v);
            }));
        builder.<List<String>>withRequestField("private_ip_address",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListSubNetworkInterfacesRequest::getPrivateIpAddress, (req, v) -> {
                req.setPrivateIpAddress(v);
            }));
        builder.<List<String>>withRequestField("mac_address",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListSubNetworkInterfacesRequest::getMacAddress, (req, v) -> {
                req.setMacAddress(v);
            }));
        builder.<List<String>>withRequestField("vpc_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListSubNetworkInterfacesRequest::getVpcId, (req, v) -> {
                req.setVpcId(v);
            }));
        builder.<List<String>>withRequestField("description",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListSubNetworkInterfacesRequest::getDescription, (req, v) -> {
                req.setDescription(v);
            }));
        builder.<List<String>>withRequestField("parent_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListSubNetworkInterfacesRequest::getParentId, (req, v) -> {
                req.setParentId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTrafficMirrorFilterRulesRequest, ListTrafficMirrorFilterRulesResponse> listTrafficMirrorFilterRules =
        genForlistTrafficMirrorFilterRules();

    private static HttpRequestDef<ListTrafficMirrorFilterRulesRequest, ListTrafficMirrorFilterRulesResponse> genForlistTrafficMirrorFilterRules() {
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
            f -> f.withMarshaller(ListTrafficMirrorFilterRulesRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<String>withRequestField("description",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTrafficMirrorFilterRulesRequest::getDescription, (req, v) -> {
                req.setDescription(v);
            }));
        builder.<String>withRequestField("traffic_mirror_filter_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTrafficMirrorFilterRulesRequest::getTrafficMirrorFilterId, (req, v) -> {
                req.setTrafficMirrorFilterId(v);
            }));
        builder.<String>withRequestField("direction",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTrafficMirrorFilterRulesRequest::getDirection, (req, v) -> {
                req.setDirection(v);
            }));
        builder.<String>withRequestField("protocol",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTrafficMirrorFilterRulesRequest::getProtocol, (req, v) -> {
                req.setProtocol(v);
            }));
        builder.<String>withRequestField("source_cidr_block",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTrafficMirrorFilterRulesRequest::getSourceCidrBlock, (req, v) -> {
                req.setSourceCidrBlock(v);
            }));
        builder.<String>withRequestField("destination_cidr_block",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTrafficMirrorFilterRulesRequest::getDestinationCidrBlock, (req, v) -> {
                req.setDestinationCidrBlock(v);
            }));
        builder.<String>withRequestField("source_port_range",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTrafficMirrorFilterRulesRequest::getSourcePortRange, (req, v) -> {
                req.setSourcePortRange(v);
            }));
        builder.<String>withRequestField("destination_port_range",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTrafficMirrorFilterRulesRequest::getDestinationPortRange, (req, v) -> {
                req.setDestinationPortRange(v);
            }));
        builder.<String>withRequestField("action",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTrafficMirrorFilterRulesRequest::getAction, (req, v) -> {
                req.setAction(v);
            }));
        builder.<String>withRequestField("priority",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTrafficMirrorFilterRulesRequest::getPriority, (req, v) -> {
                req.setPriority(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTrafficMirrorFilterRulesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTrafficMirrorFilterRulesRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTrafficMirrorFiltersRequest, ListTrafficMirrorFiltersResponse> listTrafficMirrorFilters =
        genForlistTrafficMirrorFilters();

    private static HttpRequestDef<ListTrafficMirrorFiltersRequest, ListTrafficMirrorFiltersResponse> genForlistTrafficMirrorFilters() {
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
            f -> f.withMarshaller(ListTrafficMirrorFiltersRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTrafficMirrorFiltersRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<String>withRequestField("description",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTrafficMirrorFiltersRequest::getDescription, (req, v) -> {
                req.setDescription(v);
            }));
        builder.<String>withRequestField("created_at",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTrafficMirrorFiltersRequest::getCreatedAt, (req, v) -> {
                req.setCreatedAt(v);
            }));
        builder.<String>withRequestField("updated_at",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTrafficMirrorFiltersRequest::getUpdatedAt, (req, v) -> {
                req.setUpdatedAt(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTrafficMirrorFiltersRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTrafficMirrorFiltersRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTrafficMirrorSessionsRequest, ListTrafficMirrorSessionsResponse> listTrafficMirrorSessions =
        genForlistTrafficMirrorSessions();

    private static HttpRequestDef<ListTrafficMirrorSessionsRequest, ListTrafficMirrorSessionsResponse> genForlistTrafficMirrorSessions() {
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
            f -> f.withMarshaller(ListTrafficMirrorSessionsRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTrafficMirrorSessionsRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<String>withRequestField("description",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTrafficMirrorSessionsRequest::getDescription, (req, v) -> {
                req.setDescription(v);
            }));
        builder.<String>withRequestField("traffic_mirror_filter_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTrafficMirrorSessionsRequest::getTrafficMirrorFilterId, (req, v) -> {
                req.setTrafficMirrorFilterId(v);
            }));
        builder.<String>withRequestField("traffic_mirror_target_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTrafficMirrorSessionsRequest::getTrafficMirrorTargetId, (req, v) -> {
                req.setTrafficMirrorTargetId(v);
            }));
        builder.<String>withRequestField("traffic_mirror_target_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTrafficMirrorSessionsRequest::getTrafficMirrorTargetType, (req, v) -> {
                req.setTrafficMirrorTargetType(v);
            }));
        builder.<String>withRequestField("virtual_network_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTrafficMirrorSessionsRequest::getVirtualNetworkId, (req, v) -> {
                req.setVirtualNetworkId(v);
            }));
        builder.<String>withRequestField("packet_length",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTrafficMirrorSessionsRequest::getPacketLength, (req, v) -> {
                req.setPacketLength(v);
            }));
        builder.<String>withRequestField("priority",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTrafficMirrorSessionsRequest::getPriority, (req, v) -> {
                req.setPriority(v);
            }));
        builder.<String>withRequestField("enabled",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTrafficMirrorSessionsRequest::getEnabled, (req, v) -> {
                req.setEnabled(v);
            }));
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTrafficMirrorSessionsRequest::getType, (req, v) -> {
                req.setType(v);
            }));
        builder.<String>withRequestField("created_at",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTrafficMirrorSessionsRequest::getCreatedAt, (req, v) -> {
                req.setCreatedAt(v);
            }));
        builder.<String>withRequestField("updated_at",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTrafficMirrorSessionsRequest::getUpdatedAt, (req, v) -> {
                req.setUpdatedAt(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTrafficMirrorSessionsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTrafficMirrorSessionsRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<MigrateSubNetworkInterfaceRequest, MigrateSubNetworkInterfaceResponse> migrateSubNetworkInterface =
        genFormigrateSubNetworkInterface();

    private static HttpRequestDef<MigrateSubNetworkInterfaceRequest, MigrateSubNetworkInterfaceResponse> genFormigrateSubNetworkInterface() {
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
            f -> f.withMarshaller(MigrateSubNetworkInterfaceRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RemoveSecurityGroupsRequest, RemoveSecurityGroupsResponse> removeSecurityGroups =
        genForremoveSecurityGroups();

    private static HttpRequestDef<RemoveSecurityGroupsRequest, RemoveSecurityGroupsResponse> genForremoveSecurityGroups() {
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
            f -> f.withMarshaller(RemoveSecurityGroupsRequest::getPortId, (req, v) -> {
                req.setPortId(v);
            }));
        builder.<RemoveSecurityGroupsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RemoveSecurityGroupsRequestBody.class),
            f -> f.withMarshaller(RemoveSecurityGroupsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RemoveSourcesFromTrafficMirrorSessionRequest, RemoveSourcesFromTrafficMirrorSessionResponse> removeSourcesFromTrafficMirrorSession =
        genForremoveSourcesFromTrafficMirrorSession();

    private static HttpRequestDef<RemoveSourcesFromTrafficMirrorSessionRequest, RemoveSourcesFromTrafficMirrorSessionResponse> genForremoveSourcesFromTrafficMirrorSession() {
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
            f -> f.withMarshaller(RemoveSourcesFromTrafficMirrorSessionRequest::getTrafficMirrorSessionId, (req, v) -> {
                req.setTrafficMirrorSessionId(v);
            }));
        builder.<RemoveSourcesFromTrafficMirrorSessionRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RemoveSourcesFromTrafficMirrorSessionRequestBody.class),
            f -> f.withMarshaller(RemoveSourcesFromTrafficMirrorSessionRequest::getBody, (req, v) -> {
                req.setBody(v);
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
                .withUri("/v3/{project_id}/vpc/security-groups/{security_group_id}")
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
            .withUri("/v3/{project_id}/vpc/security-group-rules/{security_group_rule_id}")
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

    public static final HttpRequestDef<ShowSubNetworkInterfaceRequest, ShowSubNetworkInterfaceResponse> showSubNetworkInterface =
        genForshowSubNetworkInterface();

    private static HttpRequestDef<ShowSubNetworkInterfaceRequest, ShowSubNetworkInterfaceResponse> genForshowSubNetworkInterface() {
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
            f -> f.withMarshaller(ShowSubNetworkInterfaceRequest::getSubNetworkInterfaceId, (req, v) -> {
                req.setSubNetworkInterfaceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowSubNetworkInterfacesQuantityRequest, ShowSubNetworkInterfacesQuantityResponse> showSubNetworkInterfacesQuantity =
        genForshowSubNetworkInterfacesQuantity();

    private static HttpRequestDef<ShowSubNetworkInterfacesQuantityRequest, ShowSubNetworkInterfacesQuantityResponse> genForshowSubNetworkInterfacesQuantity() {
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
        genForshowTrafficMirrorFilter();

    private static HttpRequestDef<ShowTrafficMirrorFilterRequest, ShowTrafficMirrorFilterResponse> genForshowTrafficMirrorFilter() {
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
            f -> f.withMarshaller(ShowTrafficMirrorFilterRequest::getTrafficMirrorFilterId, (req, v) -> {
                req.setTrafficMirrorFilterId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTrafficMirrorFilterRuleRequest, ShowTrafficMirrorFilterRuleResponse> showTrafficMirrorFilterRule =
        genForshowTrafficMirrorFilterRule();

    private static HttpRequestDef<ShowTrafficMirrorFilterRuleRequest, ShowTrafficMirrorFilterRuleResponse> genForshowTrafficMirrorFilterRule() {
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
            f -> f.withMarshaller(ShowTrafficMirrorFilterRuleRequest::getTrafficMirrorFilterRuleId, (req, v) -> {
                req.setTrafficMirrorFilterRuleId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTrafficMirrorSessionRequest, ShowTrafficMirrorSessionResponse> showTrafficMirrorSession =
        genForshowTrafficMirrorSession();

    private static HttpRequestDef<ShowTrafficMirrorSessionRequest, ShowTrafficMirrorSessionResponse> genForshowTrafficMirrorSession() {
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
            f -> f.withMarshaller(ShowTrafficMirrorSessionRequest::getTrafficMirrorSessionId, (req, v) -> {
                req.setTrafficMirrorSessionId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateSecurityGroupRequest, UpdateSecurityGroupResponse> updateSecurityGroup =
        genForupdateSecurityGroup();

    private static HttpRequestDef<UpdateSecurityGroupRequest, UpdateSecurityGroupResponse> genForupdateSecurityGroup() {
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
            f -> f.withMarshaller(UpdateSecurityGroupRequest::getSecurityGroupId, (req, v) -> {
                req.setSecurityGroupId(v);
            }));
        builder.<UpdateSecurityGroupRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateSecurityGroupRequestBody.class),
            f -> f.withMarshaller(UpdateSecurityGroupRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateSubNetworkInterfaceRequest, UpdateSubNetworkInterfaceResponse> updateSubNetworkInterface =
        genForupdateSubNetworkInterface();

    private static HttpRequestDef<UpdateSubNetworkInterfaceRequest, UpdateSubNetworkInterfaceResponse> genForupdateSubNetworkInterface() {
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
            f -> f.withMarshaller(UpdateSubNetworkInterfaceRequest::getSubNetworkInterfaceId, (req, v) -> {
                req.setSubNetworkInterfaceId(v);
            }));
        builder.<UpdateSubNetworkInterfaceRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateSubNetworkInterfaceRequestBody.class),
            f -> f.withMarshaller(UpdateSubNetworkInterfaceRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateTrafficMirrorFilterRequest, UpdateTrafficMirrorFilterResponse> updateTrafficMirrorFilter =
        genForupdateTrafficMirrorFilter();

    private static HttpRequestDef<UpdateTrafficMirrorFilterRequest, UpdateTrafficMirrorFilterResponse> genForupdateTrafficMirrorFilter() {
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
            f -> f.withMarshaller(UpdateTrafficMirrorFilterRequest::getTrafficMirrorFilterId, (req, v) -> {
                req.setTrafficMirrorFilterId(v);
            }));
        builder.<UpdateTrafficMirrorFilterRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateTrafficMirrorFilterRequestBody.class),
            f -> f.withMarshaller(UpdateTrafficMirrorFilterRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateTrafficMirrorFilterRuleRequest, UpdateTrafficMirrorFilterRuleResponse> updateTrafficMirrorFilterRule =
        genForupdateTrafficMirrorFilterRule();

    private static HttpRequestDef<UpdateTrafficMirrorFilterRuleRequest, UpdateTrafficMirrorFilterRuleResponse> genForupdateTrafficMirrorFilterRule() {
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
            f -> f.withMarshaller(UpdateTrafficMirrorFilterRuleRequest::getTrafficMirrorFilterRuleId, (req, v) -> {
                req.setTrafficMirrorFilterRuleId(v);
            }));
        builder.<UpdateTrafficMirrorFilterRuleRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateTrafficMirrorFilterRuleRequestBody.class),
            f -> f.withMarshaller(UpdateTrafficMirrorFilterRuleRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateTrafficMirrorSessionRequest, UpdateTrafficMirrorSessionResponse> updateTrafficMirrorSession =
        genForupdateTrafficMirrorSession();

    private static HttpRequestDef<UpdateTrafficMirrorSessionRequest, UpdateTrafficMirrorSessionResponse> genForupdateTrafficMirrorSession() {
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
            f -> f.withMarshaller(UpdateTrafficMirrorSessionRequest::getTrafficMirrorSessionId, (req, v) -> {
                req.setTrafficMirrorSessionId(v);
            }));
        builder.<UpdateTrafficMirrorSessionRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateTrafficMirrorSessionRequestBody.class),
            f -> f.withMarshaller(UpdateTrafficMirrorSessionRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddFirewallRulesRequest, AddFirewallRulesResponse> addFirewallRules =
        genForaddFirewallRules();

    private static HttpRequestDef<AddFirewallRulesRequest, AddFirewallRulesResponse> genForaddFirewallRules() {
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
            f -> f.withMarshaller(AddFirewallRulesRequest::getFirewallId, (req, v) -> {
                req.setFirewallId(v);
            }));
        builder.<AddFirewallRulesRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AddFirewallRulesRequestBody.class),
            f -> f.withMarshaller(AddFirewallRulesRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AssociateSubnetFirewallRequest, AssociateSubnetFirewallResponse> associateSubnetFirewall =
        genForassociateSubnetFirewall();

    private static HttpRequestDef<AssociateSubnetFirewallRequest, AssociateSubnetFirewallResponse> genForassociateSubnetFirewall() {
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
            f -> f.withMarshaller(AssociateSubnetFirewallRequest::getFirewallId, (req, v) -> {
                req.setFirewallId(v);
            }));
        builder.<AssociateSubnetFirewallRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AssociateSubnetFirewallRequestBody.class),
            f -> f.withMarshaller(AssociateSubnetFirewallRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateFirewallRequest, CreateFirewallResponse> createFirewall =
        genForcreateFirewall();

    private static HttpRequestDef<CreateFirewallRequest, CreateFirewallResponse> genForcreateFirewall() {
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
            f -> f.withMarshaller(CreateFirewallRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteFirewallRequest, DeleteFirewallResponse> deleteFirewall =
        genFordeleteFirewall();

    private static HttpRequestDef<DeleteFirewallRequest, DeleteFirewallResponse> genFordeleteFirewall() {
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
            f -> f.withMarshaller(DeleteFirewallRequest::getFirewallId, (req, v) -> {
                req.setFirewallId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DisassociateSubnetFirewallRequest, DisassociateSubnetFirewallResponse> disassociateSubnetFirewall =
        genFordisassociateSubnetFirewall();

    private static HttpRequestDef<DisassociateSubnetFirewallRequest, DisassociateSubnetFirewallResponse> genFordisassociateSubnetFirewall() {
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
            f -> f.withMarshaller(DisassociateSubnetFirewallRequest::getFirewallId, (req, v) -> {
                req.setFirewallId(v);
            }));
        builder.<DisassociateSubnetFirewallRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DisassociateSubnetFirewallRequestBody.class),
            f -> f.withMarshaller(DisassociateSubnetFirewallRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListFirewallRequest, ListFirewallResponse> listFirewall = genForlistFirewall();

    private static HttpRequestDef<ListFirewallRequest, ListFirewallResponse> genForlistFirewall() {
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
            f -> f.withMarshaller(ListFirewallRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFirewallRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));
        builder.<List<String>>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListFirewallRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<List<String>>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListFirewallRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<ListFirewallRequest.StatusEnum>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListFirewallRequest.StatusEnum.class),
            f -> f.withMarshaller(ListFirewallRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            }));
        builder.<Boolean>withRequestField("admin_state_up",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListFirewallRequest::getAdminStateUp, (req, v) -> {
                req.setAdminStateUp(v);
            }));
        builder.<List<String>>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListFirewallRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RemoveFirewallRulesRequest, RemoveFirewallRulesResponse> removeFirewallRules =
        genForremoveFirewallRules();

    private static HttpRequestDef<RemoveFirewallRulesRequest, RemoveFirewallRulesResponse> genForremoveFirewallRules() {
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
            f -> f.withMarshaller(RemoveFirewallRulesRequest::getFirewallId, (req, v) -> {
                req.setFirewallId(v);
            }));
        builder.<RemoveFirewallRulesRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RemoveFirewallRulesRequestBody.class),
            f -> f.withMarshaller(RemoveFirewallRulesRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowFirewallRequest, ShowFirewallResponse> showFirewall = genForshowFirewall();

    private static HttpRequestDef<ShowFirewallRequest, ShowFirewallResponse> genForshowFirewall() {
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
            f -> f.withMarshaller(ShowFirewallRequest::getFirewallId, (req, v) -> {
                req.setFirewallId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateFirewallRequest, UpdateFirewallResponse> updateFirewall =
        genForupdateFirewall();

    private static HttpRequestDef<UpdateFirewallRequest, UpdateFirewallResponse> genForupdateFirewall() {
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
            f -> f.withMarshaller(UpdateFirewallRequest::getFirewallId, (req, v) -> {
                req.setFirewallId(v);
            }));
        builder.<UpdateFirewallRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateFirewallRequestBody.class),
            f -> f.withMarshaller(UpdateFirewallRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateFirewallRulesRequest, UpdateFirewallRulesResponse> updateFirewallRules =
        genForupdateFirewallRules();

    private static HttpRequestDef<UpdateFirewallRulesRequest, UpdateFirewallRulesResponse> genForupdateFirewallRules() {
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
            f -> f.withMarshaller(UpdateFirewallRulesRequest::getFirewallId, (req, v) -> {
                req.setFirewallId(v);
            }));
        builder.<UpdateFirewallRulesRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateFirewallRulesRequestBody.class),
            f -> f.withMarshaller(UpdateFirewallRulesRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateAddressGroupRequest, CreateAddressGroupResponse> createAddressGroup =
        genForcreateAddressGroup();

    private static HttpRequestDef<CreateAddressGroupRequest, CreateAddressGroupResponse> genForcreateAddressGroup() {
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
            f -> f.withMarshaller(CreateAddressGroupRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteAddressGroupRequest, DeleteAddressGroupResponse> deleteAddressGroup =
        genFordeleteAddressGroup();

    private static HttpRequestDef<DeleteAddressGroupRequest, DeleteAddressGroupResponse> genFordeleteAddressGroup() {
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
            f -> f.withMarshaller(DeleteAddressGroupRequest::getAddressGroupId, (req, v) -> {
                req.setAddressGroupId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteIpAddressGroupForceRequest, DeleteIpAddressGroupForceResponse> deleteIpAddressGroupForce =
        genFordeleteIpAddressGroupForce();

    private static HttpRequestDef<DeleteIpAddressGroupForceRequest, DeleteIpAddressGroupForceResponse> genFordeleteIpAddressGroupForce() {
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
            f -> f.withMarshaller(DeleteIpAddressGroupForceRequest::getAddressGroupId, (req, v) -> {
                req.setAddressGroupId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAddressGroupRequest, ListAddressGroupResponse> listAddressGroup =
        genForlistAddressGroup();

    private static HttpRequestDef<ListAddressGroupRequest, ListAddressGroupResponse> genForlistAddressGroup() {
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
            f -> f.withMarshaller(ListAddressGroupRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAddressGroupRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));
        builder.<List<String>>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListAddressGroupRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<List<String>>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListAddressGroupRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<Integer>withRequestField("ip_version",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAddressGroupRequest::getIpVersion, (req, v) -> {
                req.setIpVersion(v);
            }));
        builder.<List<String>>withRequestField("description",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListAddressGroupRequest::getDescription, (req, v) -> {
                req.setDescription(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAddressGroupRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAddressGroupRequest, ShowAddressGroupResponse> showAddressGroup =
        genForshowAddressGroup();

    private static HttpRequestDef<ShowAddressGroupRequest, ShowAddressGroupResponse> genForshowAddressGroup() {
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
            f -> f.withMarshaller(ShowAddressGroupRequest::getAddressGroupId, (req, v) -> {
                req.setAddressGroupId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateAddressGroupRequest, UpdateAddressGroupResponse> updateAddressGroup =
        genForupdateAddressGroup();

    private static HttpRequestDef<UpdateAddressGroupRequest, UpdateAddressGroupResponse> genForupdateAddressGroup() {
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
            f -> f.withMarshaller(UpdateAddressGroupRequest::getAddressGroupId, (req, v) -> {
                req.setAddressGroupId(v);
            }));
        builder.<UpdateAddressGroupRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateAddressGroupRequestBody.class),
            f -> f.withMarshaller(UpdateAddressGroupRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddVpcExtendCidrRequest, AddVpcExtendCidrResponse> addVpcExtendCidr =
        genForaddVpcExtendCidr();

    private static HttpRequestDef<AddVpcExtendCidrRequest, AddVpcExtendCidrResponse> genForaddVpcExtendCidr() {
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
            f -> f.withMarshaller(AddVpcExtendCidrRequest::getVpcId, (req, v) -> {
                req.setVpcId(v);
            }));
        builder.<AddVpcExtendCidrRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AddVpcExtendCidrRequestBody.class),
            f -> f.withMarshaller(AddVpcExtendCidrRequest::getBody, (req, v) -> {
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
                .withUri("/v3/{project_id}/vpc/vpcs")
                .withContentType("application/json");

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

    public static final HttpRequestDef<DeleteVpcRequest, DeleteVpcResponse> deleteVpc = genFordeleteVpc();

    private static HttpRequestDef<DeleteVpcRequest, DeleteVpcResponse> genFordeleteVpc() {
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
            f -> f.withMarshaller(DeleteVpcRequest::getVpcId, (req, v) -> {
                req.setVpcId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListVpcsRequest, ListVpcsResponse> listVpcs = genForlistVpcs();

    private static HttpRequestDef<ListVpcsRequest, ListVpcsResponse> genForlistVpcs() {
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
        builder.<List<String>>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListVpcsRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<List<String>>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListVpcsRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<List<String>>withRequestField("description",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListVpcsRequest::getDescription, (req, v) -> {
                req.setDescription(v);
            }));
        builder.<List<String>>withRequestField("cidr",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListVpcsRequest::getCidr, (req, v) -> {
                req.setCidr(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RemoveVpcExtendCidrRequest, RemoveVpcExtendCidrResponse> removeVpcExtendCidr =
        genForremoveVpcExtendCidr();

    private static HttpRequestDef<RemoveVpcExtendCidrRequest, RemoveVpcExtendCidrResponse> genForremoveVpcExtendCidr() {
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
            f -> f.withMarshaller(RemoveVpcExtendCidrRequest::getVpcId, (req, v) -> {
                req.setVpcId(v);
            }));
        builder.<RemoveVpcExtendCidrRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RemoveVpcExtendCidrRequestBody.class),
            f -> f.withMarshaller(RemoveVpcExtendCidrRequest::getBody, (req, v) -> {
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
                .withUri("/v3/{project_id}/vpc/vpcs/{vpc_id}")
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

    public static final HttpRequestDef<UpdateVpcRequest, UpdateVpcResponse> updateVpc = genForupdateVpc();

    private static HttpRequestDef<UpdateVpcRequest, UpdateVpcResponse> genForupdateVpc() {
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
