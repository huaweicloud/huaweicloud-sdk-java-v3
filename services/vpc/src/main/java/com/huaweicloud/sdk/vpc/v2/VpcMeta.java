package com.huaweicloud.sdk.vpc.v2;

import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.vpc.v2.model.*;
import java.util.List;
import java.util.Map;
import java.time.OffsetDateTime;

@SuppressWarnings("unchecked")
public class VpcMeta {

    public static final HttpRequestDef<AcceptVpcPeeringRequest, AcceptVpcPeeringResponse> acceptVpcPeering = genForacceptVpcPeering();

    private static HttpRequestDef<AcceptVpcPeeringRequest, AcceptVpcPeeringResponse> genForacceptVpcPeering() {
        // basic
        HttpRequestDef.Builder<AcceptVpcPeeringRequest, AcceptVpcPeeringResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, AcceptVpcPeeringRequest.class, AcceptVpcPeeringResponse.class)
                .withUri("/v2.0/vpc/peerings/{peering_id}/accept")
                .withContentType("application/json");

        // requests
        builder.withRequestField("peering_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(AcceptVpcPeeringRequest::getPeeringId, (req, v) -> {
                req.setPeeringId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreatePortRequest, CreatePortResponse> createPort = genForcreatePort();

    private static HttpRequestDef<CreatePortRequest, CreatePortResponse> genForcreatePort() {
        // basic
        HttpRequestDef.Builder<CreatePortRequest, CreatePortResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreatePortRequest.class, CreatePortResponse.class)
                .withUri("/v1/{project_id}/ports")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            CreatePortRequestBody.class,
            f -> f.withMarshaller(CreatePortRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateSecurityGroupRequest, CreateSecurityGroupResponse> createSecurityGroup = genForcreateSecurityGroup();

    private static HttpRequestDef<CreateSecurityGroupRequest, CreateSecurityGroupResponse> genForcreateSecurityGroup() {
        // basic
        HttpRequestDef.Builder<CreateSecurityGroupRequest, CreateSecurityGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateSecurityGroupRequest.class, CreateSecurityGroupResponse.class)
                .withUri("/v1/{project_id}/security-groups")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            CreateSecurityGroupRequestBody.class,
            f -> f.withMarshaller(CreateSecurityGroupRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateSecurityGroupRuleRequest, CreateSecurityGroupRuleResponse> createSecurityGroupRule = genForcreateSecurityGroupRule();

    private static HttpRequestDef<CreateSecurityGroupRuleRequest, CreateSecurityGroupRuleResponse> genForcreateSecurityGroupRule() {
        // basic
        HttpRequestDef.Builder<CreateSecurityGroupRuleRequest, CreateSecurityGroupRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateSecurityGroupRuleRequest.class, CreateSecurityGroupRuleResponse.class)
                .withUri("/v1/{project_id}/security-group-rules")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            CreateSecurityGroupRuleRequestBody.class,
            f -> f.withMarshaller(CreateSecurityGroupRuleRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateSubnetRequest, CreateSubnetResponse> createSubnet = genForcreateSubnet();

    private static HttpRequestDef<CreateSubnetRequest, CreateSubnetResponse> genForcreateSubnet() {
        // basic
        HttpRequestDef.Builder<CreateSubnetRequest, CreateSubnetResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateSubnetRequest.class, CreateSubnetResponse.class)
                .withUri("/v1/{project_id}/subnets")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            CreateSubnetRequestBody.class,
            f -> f.withMarshaller(CreateSubnetRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateVpcPeeringRequest, CreateVpcPeeringResponse> createVpcPeering = genForcreateVpcPeering();

    private static HttpRequestDef<CreateVpcPeeringRequest, CreateVpcPeeringResponse> genForcreateVpcPeering() {
        // basic
        HttpRequestDef.Builder<CreateVpcPeeringRequest, CreateVpcPeeringResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateVpcPeeringRequest.class, CreateVpcPeeringResponse.class)
                .withUri("/v2.0/vpc/peerings")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            CreateVpcPeeringRequestBody.class,
            f -> f.withMarshaller(CreateVpcPeeringRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeletePortRequest, DeletePortResponse> deletePort = genFordeletePort();

    private static HttpRequestDef<DeletePortRequest, DeletePortResponse> genFordeletePort() {
        // basic
        HttpRequestDef.Builder<DeletePortRequest, DeletePortResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeletePortRequest.class, DeletePortResponse.class)
                .withUri("/v1/{project_id}/ports/{port_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("port_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeletePortRequest::getPortId, (req, v) -> {
                req.setPortId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteSecurityGroupRequest, DeleteSecurityGroupResponse> deleteSecurityGroup = genFordeleteSecurityGroup();

    private static HttpRequestDef<DeleteSecurityGroupRequest, DeleteSecurityGroupResponse> genFordeleteSecurityGroup() {
        // basic
        HttpRequestDef.Builder<DeleteSecurityGroupRequest, DeleteSecurityGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteSecurityGroupRequest.class, DeleteSecurityGroupResponse.class)
                .withUri("/v1/{project_id}/security-groups/{security_group_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("security_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteSecurityGroupRequest::getSecurityGroupId, (req, v) -> {
                req.setSecurityGroupId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteSecurityGroupRuleRequest, DeleteSecurityGroupRuleResponse> deleteSecurityGroupRule = genFordeleteSecurityGroupRule();

    private static HttpRequestDef<DeleteSecurityGroupRuleRequest, DeleteSecurityGroupRuleResponse> genFordeleteSecurityGroupRule() {
        // basic
        HttpRequestDef.Builder<DeleteSecurityGroupRuleRequest, DeleteSecurityGroupRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteSecurityGroupRuleRequest.class, DeleteSecurityGroupRuleResponse.class)
                .withUri("/v1/{project_id}/security-group-rules/{security_group_rule_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("security_group_rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteSecurityGroupRuleRequest::getSecurityGroupRuleId, (req, v) -> {
                req.setSecurityGroupRuleId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteSubnetRequest, DeleteSubnetResponse> deleteSubnet = genFordeleteSubnet();

    private static HttpRequestDef<DeleteSubnetRequest, DeleteSubnetResponse> genFordeleteSubnet() {
        // basic
        HttpRequestDef.Builder<DeleteSubnetRequest, DeleteSubnetResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteSubnetRequest.class, DeleteSubnetResponse.class)
                .withUri("/v1/{project_id}/vpcs/{vpc_id}/subnets/{subnet_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("vpc_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteSubnetRequest::getVpcId, (req, v) -> {
                req.setVpcId(v);
            })
        );
        builder.withRequestField("subnet_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteSubnetRequest::getSubnetId, (req, v) -> {
                req.setSubnetId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteVpcPeeringRequest, DeleteVpcPeeringResponse> deleteVpcPeering = genFordeleteVpcPeering();

    private static HttpRequestDef<DeleteVpcPeeringRequest, DeleteVpcPeeringResponse> genFordeleteVpcPeering() {
        // basic
        HttpRequestDef.Builder<DeleteVpcPeeringRequest, DeleteVpcPeeringResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteVpcPeeringRequest.class, DeleteVpcPeeringResponse.class)
                .withUri("/v2.0/vpc/peerings/{peering_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("peering_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteVpcPeeringRequest::getPeeringId, (req, v) -> {
                req.setPeeringId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPortsRequest, ListPortsResponse> listPorts = genForlistPorts();

    private static HttpRequestDef<ListPortsRequest, ListPortsResponse> genForlistPorts() {
        // basic
        HttpRequestDef.Builder<ListPortsRequest, ListPortsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListPortsRequest.class, ListPortsResponse.class)
                .withUri("/v1/{project_id}/ports")
                .withContentType("application/json");

        // requests
        builder.withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListPortsRequest::getName, (req, v) -> {
                req.setName(v);
            })
        );
        builder.withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListPortsRequest::getId, (req, v) -> {
                req.setId(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListPortsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("admin_state_up",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Boolean.class,
            f -> f.withMarshaller(ListPortsRequest::getAdminStateUp, (req, v) -> {
                req.setAdminStateUp(v);
            })
        );
        builder.withRequestField("network_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListPortsRequest::getNetworkId, (req, v) -> {
                req.setNetworkId(v);
            })
        );
        builder.withRequestField("mac_address",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListPortsRequest::getMacAddress, (req, v) -> {
                req.setMacAddress(v);
            })
        );
        builder.withRequestField("device_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListPortsRequest::getDeviceId, (req, v) -> {
                req.setDeviceId(v);
            })
        );
        builder.withRequestField("device_owner",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            ListPortsRequest.DeviceOwnerEnum.class,
            f -> f.withMarshaller(ListPortsRequest::getDeviceOwner, (req, v) -> {
                req.setDeviceOwner(v);
            })
        );
        builder.withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            ListPortsRequest.StatusEnum.class,
            f -> f.withMarshaller(ListPortsRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            })
        );
        builder.withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListPortsRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            })
        );
        builder.withRequestField("fixed_ips",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListPortsRequest::getFixedIps, (req, v) -> {
                req.setFixedIps(v);
            })
        );
        builder.withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListPortsRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSecurityGroupRulesRequest, ListSecurityGroupRulesResponse> listSecurityGroupRules = genForlistSecurityGroupRules();

    private static HttpRequestDef<ListSecurityGroupRulesRequest, ListSecurityGroupRulesResponse> genForlistSecurityGroupRules() {
        // basic
        HttpRequestDef.Builder<ListSecurityGroupRulesRequest, ListSecurityGroupRulesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListSecurityGroupRulesRequest.class, ListSecurityGroupRulesResponse.class)
                .withUri("/v1/{project_id}/security-group-rules")
                .withContentType("application/json");

        // requests
        builder.withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListSecurityGroupRulesRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListSecurityGroupRulesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("security_group_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListSecurityGroupRulesRequest::getSecurityGroupId, (req, v) -> {
                req.setSecurityGroupId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSecurityGroupsRequest, ListSecurityGroupsResponse> listSecurityGroups = genForlistSecurityGroups();

    private static HttpRequestDef<ListSecurityGroupsRequest, ListSecurityGroupsResponse> genForlistSecurityGroups() {
        // basic
        HttpRequestDef.Builder<ListSecurityGroupsRequest, ListSecurityGroupsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListSecurityGroupsRequest.class, ListSecurityGroupsResponse.class)
                .withUri("/v1/{project_id}/security-groups")
                .withContentType("application/json");

        // requests
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListSecurityGroupsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListSecurityGroupsRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            })
        );
        builder.withRequestField("vpc_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListSecurityGroupsRequest::getVpcId, (req, v) -> {
                req.setVpcId(v);
            })
        );
        builder.withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListSecurityGroupsRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSubnetsRequest, ListSubnetsResponse> listSubnets = genForlistSubnets();

    private static HttpRequestDef<ListSubnetsRequest, ListSubnetsResponse> genForlistSubnets() {
        // basic
        HttpRequestDef.Builder<ListSubnetsRequest, ListSubnetsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListSubnetsRequest.class, ListSubnetsResponse.class)
                .withUri("/v1/{project_id}/subnets")
                .withContentType("application/json");

        // requests
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListSubnetsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListSubnetsRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            })
        );
        builder.withRequestField("vpc_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListSubnetsRequest::getVpcId, (req, v) -> {
                req.setVpcId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListVpcPeeringsRequest, ListVpcPeeringsResponse> listVpcPeerings = genForlistVpcPeerings();

    private static HttpRequestDef<ListVpcPeeringsRequest, ListVpcPeeringsResponse> genForlistVpcPeerings() {
        // basic
        HttpRequestDef.Builder<ListVpcPeeringsRequest, ListVpcPeeringsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListVpcPeeringsRequest.class, ListVpcPeeringsResponse.class)
                .withUri("/v2.0/vpc/peerings")
                .withContentType("application/json");

        // requests
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListVpcPeeringsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListVpcPeeringsRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            })
        );
        builder.withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListVpcPeeringsRequest::getId, (req, v) -> {
                req.setId(v);
            })
        );
        builder.withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListVpcPeeringsRequest::getName, (req, v) -> {
                req.setName(v);
            })
        );
        builder.withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            ListVpcPeeringsRequest.StatusEnum.class,
            f -> f.withMarshaller(ListVpcPeeringsRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            })
        );
        builder.withRequestField("tenant_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListVpcPeeringsRequest::getTenantId, (req, v) -> {
                req.setTenantId(v);
            })
        );
        builder.withRequestField("vpc_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListVpcPeeringsRequest::getVpcId, (req, v) -> {
                req.setVpcId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RejectVpcPeeringRequest, RejectVpcPeeringResponse> rejectVpcPeering = genForrejectVpcPeering();

    private static HttpRequestDef<RejectVpcPeeringRequest, RejectVpcPeeringResponse> genForrejectVpcPeering() {
        // basic
        HttpRequestDef.Builder<RejectVpcPeeringRequest, RejectVpcPeeringResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, RejectVpcPeeringRequest.class, RejectVpcPeeringResponse.class)
                .withUri("/v2.0/vpc/peerings/{peering_id}/reject")
                .withContentType("application/json");

        // requests
        builder.withRequestField("peering_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(RejectVpcPeeringRequest::getPeeringId, (req, v) -> {
                req.setPeeringId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowPortRequest, ShowPortResponse> showPort = genForshowPort();

    private static HttpRequestDef<ShowPortRequest, ShowPortResponse> genForshowPort() {
        // basic
        HttpRequestDef.Builder<ShowPortRequest, ShowPortResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowPortRequest.class, ShowPortResponse.class)
                .withUri("/v1/{project_id}/ports/{port_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("port_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowPortRequest::getPortId, (req, v) -> {
                req.setPortId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowQuotaRequest, ShowQuotaResponse> showQuota = genForshowQuota();

    private static HttpRequestDef<ShowQuotaRequest, ShowQuotaResponse> genForshowQuota() {
        // basic
        HttpRequestDef.Builder<ShowQuotaRequest, ShowQuotaResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowQuotaRequest.class, ShowQuotaResponse.class)
                .withUri("/v1/{project_id}/quotas")
                .withContentType("application/json");

        // requests
        builder.withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            ShowQuotaRequest.TypeEnum.class,
            f -> f.withMarshaller(ShowQuotaRequest::getType, (req, v) -> {
                req.setType(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowSecurityGroupRequest, ShowSecurityGroupResponse> showSecurityGroup = genForshowSecurityGroup();

    private static HttpRequestDef<ShowSecurityGroupRequest, ShowSecurityGroupResponse> genForshowSecurityGroup() {
        // basic
        HttpRequestDef.Builder<ShowSecurityGroupRequest, ShowSecurityGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowSecurityGroupRequest.class, ShowSecurityGroupResponse.class)
                .withUri("/v1/{project_id}/security-groups/{security_group_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("security_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowSecurityGroupRequest::getSecurityGroupId, (req, v) -> {
                req.setSecurityGroupId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowSecurityGroupRuleRequest, ShowSecurityGroupRuleResponse> showSecurityGroupRule = genForshowSecurityGroupRule();

    private static HttpRequestDef<ShowSecurityGroupRuleRequest, ShowSecurityGroupRuleResponse> genForshowSecurityGroupRule() {
        // basic
        HttpRequestDef.Builder<ShowSecurityGroupRuleRequest, ShowSecurityGroupRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowSecurityGroupRuleRequest.class, ShowSecurityGroupRuleResponse.class)
                .withUri("/v1/{project_id}/security-group-rules/{security_group_rule_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("security_group_rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowSecurityGroupRuleRequest::getSecurityGroupRuleId, (req, v) -> {
                req.setSecurityGroupRuleId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowSubnetRequest, ShowSubnetResponse> showSubnet = genForshowSubnet();

    private static HttpRequestDef<ShowSubnetRequest, ShowSubnetResponse> genForshowSubnet() {
        // basic
        HttpRequestDef.Builder<ShowSubnetRequest, ShowSubnetResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowSubnetRequest.class, ShowSubnetResponse.class)
                .withUri("/v1/{project_id}/subnets/{subnet_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("subnet_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowSubnetRequest::getSubnetId, (req, v) -> {
                req.setSubnetId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowVpcPeeringRequest, ShowVpcPeeringResponse> showVpcPeering = genForshowVpcPeering();

    private static HttpRequestDef<ShowVpcPeeringRequest, ShowVpcPeeringResponse> genForshowVpcPeering() {
        // basic
        HttpRequestDef.Builder<ShowVpcPeeringRequest, ShowVpcPeeringResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowVpcPeeringRequest.class, ShowVpcPeeringResponse.class)
                .withUri("/v2.0/vpc/peerings/{peering_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("peering_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowVpcPeeringRequest::getPeeringId, (req, v) -> {
                req.setPeeringId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdatePortRequest, UpdatePortResponse> updatePort = genForupdatePort();

    private static HttpRequestDef<UpdatePortRequest, UpdatePortResponse> genForupdatePort() {
        // basic
        HttpRequestDef.Builder<UpdatePortRequest, UpdatePortResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdatePortRequest.class, UpdatePortResponse.class)
                .withUri("/v1/{project_id}/ports/{port_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("port_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdatePortRequest::getPortId, (req, v) -> {
                req.setPortId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            UpdatePortRequestBody.class,
            f -> f.withMarshaller(UpdatePortRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateSubnetRequest, UpdateSubnetResponse> updateSubnet = genForupdateSubnet();

    private static HttpRequestDef<UpdateSubnetRequest, UpdateSubnetResponse> genForupdateSubnet() {
        // basic
        HttpRequestDef.Builder<UpdateSubnetRequest, UpdateSubnetResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateSubnetRequest.class, UpdateSubnetResponse.class)
                .withUri("/v1/{project_id}/vpcs/{vpc_id}/subnets/{subnet_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("vpc_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateSubnetRequest::getVpcId, (req, v) -> {
                req.setVpcId(v);
            })
        );
        builder.withRequestField("subnet_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateSubnetRequest::getSubnetId, (req, v) -> {
                req.setSubnetId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            UpdateSubnetRequestBody.class,
            f -> f.withMarshaller(UpdateSubnetRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateVpcPeeringRequest, UpdateVpcPeeringResponse> updateVpcPeering = genForupdateVpcPeering();

    private static HttpRequestDef<UpdateVpcPeeringRequest, UpdateVpcPeeringResponse> genForupdateVpcPeering() {
        // basic
        HttpRequestDef.Builder<UpdateVpcPeeringRequest, UpdateVpcPeeringResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateVpcPeeringRequest.class, UpdateVpcPeeringResponse.class)
                .withUri("/v2.0/vpc/peerings/{peering_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("peering_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateVpcPeeringRequest::getPeeringId, (req, v) -> {
                req.setPeeringId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            UpdateVpcPeeringRequestBody.class,
            f -> f.withMarshaller(UpdateVpcPeeringRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreatePrivateipRequest, CreatePrivateipResponse> createPrivateip = genForcreatePrivateip();

    private static HttpRequestDef<CreatePrivateipRequest, CreatePrivateipResponse> genForcreatePrivateip() {
        // basic
        HttpRequestDef.Builder<CreatePrivateipRequest, CreatePrivateipResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreatePrivateipRequest.class, CreatePrivateipResponse.class)
                .withUri("/v1/{project_id}/privateips")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            CreatePrivateipRequestBody.class,
            f -> f.withMarshaller(CreatePrivateipRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeletePrivateipRequest, DeletePrivateipResponse> deletePrivateip = genFordeletePrivateip();

    private static HttpRequestDef<DeletePrivateipRequest, DeletePrivateipResponse> genFordeletePrivateip() {
        // basic
        HttpRequestDef.Builder<DeletePrivateipRequest, DeletePrivateipResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeletePrivateipRequest.class, DeletePrivateipResponse.class)
                .withUri("/v1/{project_id}/privateips/{privateip_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("privateip_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeletePrivateipRequest::getPrivateipId, (req, v) -> {
                req.setPrivateipId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPrivateipsRequest, ListPrivateipsResponse> listPrivateips = genForlistPrivateips();

    private static HttpRequestDef<ListPrivateipsRequest, ListPrivateipsResponse> genForlistPrivateips() {
        // basic
        HttpRequestDef.Builder<ListPrivateipsRequest, ListPrivateipsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListPrivateipsRequest.class, ListPrivateipsResponse.class)
                .withUri("/v1/{project_id}/subnets/{subnet_id}/privateips")
                .withContentType("application/json");

        // requests
        builder.withRequestField("subnet_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListPrivateipsRequest::getSubnetId, (req, v) -> {
                req.setSubnetId(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListPrivateipsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListPrivateipsRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowNetworkIpAvailabilitiesRequest, ShowNetworkIpAvailabilitiesResponse> showNetworkIpAvailabilities = genForshowNetworkIpAvailabilities();

    private static HttpRequestDef<ShowNetworkIpAvailabilitiesRequest, ShowNetworkIpAvailabilitiesResponse> genForshowNetworkIpAvailabilities() {
        // basic
        HttpRequestDef.Builder<ShowNetworkIpAvailabilitiesRequest, ShowNetworkIpAvailabilitiesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowNetworkIpAvailabilitiesRequest.class, ShowNetworkIpAvailabilitiesResponse.class)
                .withUri("/v2.0/network-ip-availabilities/{network_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("network_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowNetworkIpAvailabilitiesRequest::getNetworkId, (req, v) -> {
                req.setNetworkId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowPrivateipRequest, ShowPrivateipResponse> showPrivateip = genForshowPrivateip();

    private static HttpRequestDef<ShowPrivateipRequest, ShowPrivateipResponse> genForshowPrivateip() {
        // basic
        HttpRequestDef.Builder<ShowPrivateipRequest, ShowPrivateipResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowPrivateipRequest.class, ShowPrivateipResponse.class)
                .withUri("/v1/{project_id}/privateips/{privateip_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("privateip_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowPrivateipRequest::getPrivateipId, (req, v) -> {
                req.setPrivateipId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<NeutronAddFirewallRuleRequest, NeutronAddFirewallRuleResponse> neutronAddFirewallRule = genForneutronAddFirewallRule();

    private static HttpRequestDef<NeutronAddFirewallRuleRequest, NeutronAddFirewallRuleResponse> genForneutronAddFirewallRule() {
        // basic
        HttpRequestDef.Builder<NeutronAddFirewallRuleRequest, NeutronAddFirewallRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, NeutronAddFirewallRuleRequest.class, NeutronAddFirewallRuleResponse.class)
                .withUri("/v2.0/fwaas/firewall_policies/{firewall_policy_id}/insert_rule")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("firewall_policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(NeutronAddFirewallRuleRequest::getFirewallPolicyId, (req, v) -> {
                req.setFirewallPolicyId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            NeutronInsertFirewallRuleRequestBody.class,
            f -> f.withMarshaller(NeutronAddFirewallRuleRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<NeutronCreateFirewallGroupRequest, NeutronCreateFirewallGroupResponse> neutronCreateFirewallGroup = genForneutronCreateFirewallGroup();

    private static HttpRequestDef<NeutronCreateFirewallGroupRequest, NeutronCreateFirewallGroupResponse> genForneutronCreateFirewallGroup() {
        // basic
        HttpRequestDef.Builder<NeutronCreateFirewallGroupRequest, NeutronCreateFirewallGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, NeutronCreateFirewallGroupRequest.class, NeutronCreateFirewallGroupResponse.class)
                .withUri("/v2.0/fwaas/firewall_groups")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            NeutronCreateFirewallGroupRequestBody.class,
            f -> f.withMarshaller(NeutronCreateFirewallGroupRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<NeutronCreateFirewallPolicyRequest, NeutronCreateFirewallPolicyResponse> neutronCreateFirewallPolicy = genForneutronCreateFirewallPolicy();

    private static HttpRequestDef<NeutronCreateFirewallPolicyRequest, NeutronCreateFirewallPolicyResponse> genForneutronCreateFirewallPolicy() {
        // basic
        HttpRequestDef.Builder<NeutronCreateFirewallPolicyRequest, NeutronCreateFirewallPolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, NeutronCreateFirewallPolicyRequest.class, NeutronCreateFirewallPolicyResponse.class)
                .withUri("/v2.0/fwaas/firewall_policies")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            NeutronCreateFirewallPolicyRequestBody.class,
            f -> f.withMarshaller(NeutronCreateFirewallPolicyRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<NeutronCreateFirewallRuleRequest, NeutronCreateFirewallRuleResponse> neutronCreateFirewallRule = genForneutronCreateFirewallRule();

    private static HttpRequestDef<NeutronCreateFirewallRuleRequest, NeutronCreateFirewallRuleResponse> genForneutronCreateFirewallRule() {
        // basic
        HttpRequestDef.Builder<NeutronCreateFirewallRuleRequest, NeutronCreateFirewallRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, NeutronCreateFirewallRuleRequest.class, NeutronCreateFirewallRuleResponse.class)
                .withUri("/v2.0/fwaas/firewall_rules")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            NeutronCreateFirewallRuleRequestBody.class,
            f -> f.withMarshaller(NeutronCreateFirewallRuleRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<NeutronDeleteFirewallGroupRequest, NeutronDeleteFirewallGroupResponse> neutronDeleteFirewallGroup = genForneutronDeleteFirewallGroup();

    private static HttpRequestDef<NeutronDeleteFirewallGroupRequest, NeutronDeleteFirewallGroupResponse> genForneutronDeleteFirewallGroup() {
        // basic
        HttpRequestDef.Builder<NeutronDeleteFirewallGroupRequest, NeutronDeleteFirewallGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, NeutronDeleteFirewallGroupRequest.class, NeutronDeleteFirewallGroupResponse.class)
                .withUri("/v2.0/fwaas/firewall_groups/{firewall_group_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("firewall_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(NeutronDeleteFirewallGroupRequest::getFirewallGroupId, (req, v) -> {
                req.setFirewallGroupId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<NeutronDeleteFirewallPolicyRequest, NeutronDeleteFirewallPolicyResponse> neutronDeleteFirewallPolicy = genForneutronDeleteFirewallPolicy();

    private static HttpRequestDef<NeutronDeleteFirewallPolicyRequest, NeutronDeleteFirewallPolicyResponse> genForneutronDeleteFirewallPolicy() {
        // basic
        HttpRequestDef.Builder<NeutronDeleteFirewallPolicyRequest, NeutronDeleteFirewallPolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, NeutronDeleteFirewallPolicyRequest.class, NeutronDeleteFirewallPolicyResponse.class)
                .withUri("/v2.0/fwaas/firewall_policies/{firewall_policy_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("firewall_policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(NeutronDeleteFirewallPolicyRequest::getFirewallPolicyId, (req, v) -> {
                req.setFirewallPolicyId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<NeutronDeleteFirewallRuleRequest, NeutronDeleteFirewallRuleResponse> neutronDeleteFirewallRule = genForneutronDeleteFirewallRule();

    private static HttpRequestDef<NeutronDeleteFirewallRuleRequest, NeutronDeleteFirewallRuleResponse> genForneutronDeleteFirewallRule() {
        // basic
        HttpRequestDef.Builder<NeutronDeleteFirewallRuleRequest, NeutronDeleteFirewallRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, NeutronDeleteFirewallRuleRequest.class, NeutronDeleteFirewallRuleResponse.class)
                .withUri("/v2.0/fwaas/firewall_rules/{firewall_rule_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("firewall_rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(NeutronDeleteFirewallRuleRequest::getFirewallRuleId, (req, v) -> {
                req.setFirewallRuleId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<NeutronListFirewallGroupsRequest, NeutronListFirewallGroupsResponse> neutronListFirewallGroups = genForneutronListFirewallGroups();

    private static HttpRequestDef<NeutronListFirewallGroupsRequest, NeutronListFirewallGroupsResponse> genForneutronListFirewallGroups() {
        // basic
        HttpRequestDef.Builder<NeutronListFirewallGroupsRequest, NeutronListFirewallGroupsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, NeutronListFirewallGroupsRequest.class, NeutronListFirewallGroupsResponse.class)
                .withUri("/v2.0/fwaas/firewall_groups")
                .withContentType("application/json");

        // requests
        builder.withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(NeutronListFirewallGroupsRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(NeutronListFirewallGroupsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            List.class,
            f -> f.withMarshaller(NeutronListFirewallGroupsRequest::getId, (req, v) -> {
                req.setId(v);
            })
        );
        builder.withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            List.class,
            f -> f.withMarshaller(NeutronListFirewallGroupsRequest::getName, (req, v) -> {
                req.setName(v);
            })
        );
        builder.withRequestField("description",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            List.class,
            f -> f.withMarshaller(NeutronListFirewallGroupsRequest::getDescription, (req, v) -> {
                req.setDescription(v);
            })
        );
        builder.withRequestField("ingress_firewall_policy_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(NeutronListFirewallGroupsRequest::getIngressFirewallPolicyId, (req, v) -> {
                req.setIngressFirewallPolicyId(v);
            })
        );
        builder.withRequestField("egress_firewall_policy_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(NeutronListFirewallGroupsRequest::getEgressFirewallPolicyId, (req, v) -> {
                req.setEgressFirewallPolicyId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<NeutronListFirewallPoliciesRequest, NeutronListFirewallPoliciesResponse> neutronListFirewallPolicies = genForneutronListFirewallPolicies();

    private static HttpRequestDef<NeutronListFirewallPoliciesRequest, NeutronListFirewallPoliciesResponse> genForneutronListFirewallPolicies() {
        // basic
        HttpRequestDef.Builder<NeutronListFirewallPoliciesRequest, NeutronListFirewallPoliciesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, NeutronListFirewallPoliciesRequest.class, NeutronListFirewallPoliciesResponse.class)
                .withUri("/v2.0/fwaas/firewall_policies")
                .withContentType("application/json");

        // requests
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(NeutronListFirewallPoliciesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(NeutronListFirewallPoliciesRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            })
        );
        builder.withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            List.class,
            f -> f.withMarshaller(NeutronListFirewallPoliciesRequest::getId, (req, v) -> {
                req.setId(v);
            })
        );
        builder.withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            List.class,
            f -> f.withMarshaller(NeutronListFirewallPoliciesRequest::getName, (req, v) -> {
                req.setName(v);
            })
        );
        builder.withRequestField("description",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            List.class,
            f -> f.withMarshaller(NeutronListFirewallPoliciesRequest::getDescription, (req, v) -> {
                req.setDescription(v);
            })
        );
        builder.withRequestField("tenant_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(NeutronListFirewallPoliciesRequest::getTenantId, (req, v) -> {
                req.setTenantId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<NeutronListFirewallRulesRequest, NeutronListFirewallRulesResponse> neutronListFirewallRules = genForneutronListFirewallRules();

    private static HttpRequestDef<NeutronListFirewallRulesRequest, NeutronListFirewallRulesResponse> genForneutronListFirewallRules() {
        // basic
        HttpRequestDef.Builder<NeutronListFirewallRulesRequest, NeutronListFirewallRulesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, NeutronListFirewallRulesRequest.class, NeutronListFirewallRulesResponse.class)
                .withUri("/v2.0/fwaas/firewall_rules")
                .withContentType("application/json");

        // requests
        builder.withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(NeutronListFirewallRulesRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(NeutronListFirewallRulesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            List.class,
            f -> f.withMarshaller(NeutronListFirewallRulesRequest::getId, (req, v) -> {
                req.setId(v);
            })
        );
        builder.withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            List.class,
            f -> f.withMarshaller(NeutronListFirewallRulesRequest::getName, (req, v) -> {
                req.setName(v);
            })
        );
        builder.withRequestField("description",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            List.class,
            f -> f.withMarshaller(NeutronListFirewallRulesRequest::getDescription, (req, v) -> {
                req.setDescription(v);
            })
        );
        builder.withRequestField("action",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(NeutronListFirewallRulesRequest::getAction, (req, v) -> {
                req.setAction(v);
            })
        );
        builder.withRequestField("tenant_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(NeutronListFirewallRulesRequest::getTenantId, (req, v) -> {
                req.setTenantId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<NeutronRemoveFirewallRuleRequest, NeutronRemoveFirewallRuleResponse> neutronRemoveFirewallRule = genForneutronRemoveFirewallRule();

    private static HttpRequestDef<NeutronRemoveFirewallRuleRequest, NeutronRemoveFirewallRuleResponse> genForneutronRemoveFirewallRule() {
        // basic
        HttpRequestDef.Builder<NeutronRemoveFirewallRuleRequest, NeutronRemoveFirewallRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, NeutronRemoveFirewallRuleRequest.class, NeutronRemoveFirewallRuleResponse.class)
                .withUri("/v2.0/fwaas/firewall_policies/{firewall_policy_id}/remove_rule")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("firewall_policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(NeutronRemoveFirewallRuleRequest::getFirewallPolicyId, (req, v) -> {
                req.setFirewallPolicyId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            NeutronRemoveFirewallRuleRequestBody.class,
            f -> f.withMarshaller(NeutronRemoveFirewallRuleRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<NeutronShowFirewallGroupRequest, NeutronShowFirewallGroupResponse> neutronShowFirewallGroup = genForneutronShowFirewallGroup();

    private static HttpRequestDef<NeutronShowFirewallGroupRequest, NeutronShowFirewallGroupResponse> genForneutronShowFirewallGroup() {
        // basic
        HttpRequestDef.Builder<NeutronShowFirewallGroupRequest, NeutronShowFirewallGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, NeutronShowFirewallGroupRequest.class, NeutronShowFirewallGroupResponse.class)
                .withUri("/v2.0/fwaas/firewall_groups/{firewall_group_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("firewall_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(NeutronShowFirewallGroupRequest::getFirewallGroupId, (req, v) -> {
                req.setFirewallGroupId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<NeutronShowFirewallPolicyRequest, NeutronShowFirewallPolicyResponse> neutronShowFirewallPolicy = genForneutronShowFirewallPolicy();

    private static HttpRequestDef<NeutronShowFirewallPolicyRequest, NeutronShowFirewallPolicyResponse> genForneutronShowFirewallPolicy() {
        // basic
        HttpRequestDef.Builder<NeutronShowFirewallPolicyRequest, NeutronShowFirewallPolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, NeutronShowFirewallPolicyRequest.class, NeutronShowFirewallPolicyResponse.class)
                .withUri("/v2.0/fwaas/firewall_policies/{firewall_policy_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("firewall_policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(NeutronShowFirewallPolicyRequest::getFirewallPolicyId, (req, v) -> {
                req.setFirewallPolicyId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<NeutronShowFirewallRuleRequest, NeutronShowFirewallRuleResponse> neutronShowFirewallRule = genForneutronShowFirewallRule();

    private static HttpRequestDef<NeutronShowFirewallRuleRequest, NeutronShowFirewallRuleResponse> genForneutronShowFirewallRule() {
        // basic
        HttpRequestDef.Builder<NeutronShowFirewallRuleRequest, NeutronShowFirewallRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, NeutronShowFirewallRuleRequest.class, NeutronShowFirewallRuleResponse.class)
                .withUri("/v2.0/fwaas/firewall_rules/{firewall_rule_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("firewall_rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(NeutronShowFirewallRuleRequest::getFirewallRuleId, (req, v) -> {
                req.setFirewallRuleId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<NeutronUpdateFirewallGroupRequest, NeutronUpdateFirewallGroupResponse> neutronUpdateFirewallGroup = genForneutronUpdateFirewallGroup();

    private static HttpRequestDef<NeutronUpdateFirewallGroupRequest, NeutronUpdateFirewallGroupResponse> genForneutronUpdateFirewallGroup() {
        // basic
        HttpRequestDef.Builder<NeutronUpdateFirewallGroupRequest, NeutronUpdateFirewallGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, NeutronUpdateFirewallGroupRequest.class, NeutronUpdateFirewallGroupResponse.class)
                .withUri("/v2.0/fwaas/firewall_groups/{firewall_group_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("firewall_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(NeutronUpdateFirewallGroupRequest::getFirewallGroupId, (req, v) -> {
                req.setFirewallGroupId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            NeutronUpdateFirewallGroupRequestBody.class,
            f -> f.withMarshaller(NeutronUpdateFirewallGroupRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<NeutronUpdateFirewallPolicyRequest, NeutronUpdateFirewallPolicyResponse> neutronUpdateFirewallPolicy = genForneutronUpdateFirewallPolicy();

    private static HttpRequestDef<NeutronUpdateFirewallPolicyRequest, NeutronUpdateFirewallPolicyResponse> genForneutronUpdateFirewallPolicy() {
        // basic
        HttpRequestDef.Builder<NeutronUpdateFirewallPolicyRequest, NeutronUpdateFirewallPolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, NeutronUpdateFirewallPolicyRequest.class, NeutronUpdateFirewallPolicyResponse.class)
                .withUri("/v2.0/fwaas/firewall_policies/{firewall_policy_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("firewall_policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(NeutronUpdateFirewallPolicyRequest::getFirewallPolicyId, (req, v) -> {
                req.setFirewallPolicyId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            NeutronUpdateFirewallPolicyRequestBody.class,
            f -> f.withMarshaller(NeutronUpdateFirewallPolicyRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<NeutronUpdateFirewallRuleRequest, NeutronUpdateFirewallRuleResponse> neutronUpdateFirewallRule = genForneutronUpdateFirewallRule();

    private static HttpRequestDef<NeutronUpdateFirewallRuleRequest, NeutronUpdateFirewallRuleResponse> genForneutronUpdateFirewallRule() {
        // basic
        HttpRequestDef.Builder<NeutronUpdateFirewallRuleRequest, NeutronUpdateFirewallRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, NeutronUpdateFirewallRuleRequest.class, NeutronUpdateFirewallRuleResponse.class)
                .withUri("/v2.0/fwaas/firewall_rules/{firewall_rule_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("firewall_rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(NeutronUpdateFirewallRuleRequest::getFirewallRuleId, (req, v) -> {
                req.setFirewallRuleId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            NeutronUpdateFirewallRuleRequestBody.class,
            f -> f.withMarshaller(NeutronUpdateFirewallRuleRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateVpcRequest, CreateVpcResponse> createVpc = genForcreateVpc();

    private static HttpRequestDef<CreateVpcRequest, CreateVpcResponse> genForcreateVpc() {
        // basic
        HttpRequestDef.Builder<CreateVpcRequest, CreateVpcResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateVpcRequest.class, CreateVpcResponse.class)
                .withUri("/v1/{project_id}/vpcs")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            CreateVpcRequestBody.class,
            f -> f.withMarshaller(CreateVpcRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateVpcRouteRequest, CreateVpcRouteResponse> createVpcRoute = genForcreateVpcRoute();

    private static HttpRequestDef<CreateVpcRouteRequest, CreateVpcRouteResponse> genForcreateVpcRoute() {
        // basic
        HttpRequestDef.Builder<CreateVpcRouteRequest, CreateVpcRouteResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateVpcRouteRequest.class, CreateVpcRouteResponse.class)
                .withUri("/v2.0/vpc/routes")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            CreateVpcRouteRequestBody.class,
            f -> f.withMarshaller(CreateVpcRouteRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteVpcRequest, DeleteVpcResponse> deleteVpc = genFordeleteVpc();

    private static HttpRequestDef<DeleteVpcRequest, DeleteVpcResponse> genFordeleteVpc() {
        // basic
        HttpRequestDef.Builder<DeleteVpcRequest, DeleteVpcResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteVpcRequest.class, DeleteVpcResponse.class)
                .withUri("/v1/{project_id}/vpcs/{vpc_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("vpc_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteVpcRequest::getVpcId, (req, v) -> {
                req.setVpcId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteVpcRouteRequest, DeleteVpcRouteResponse> deleteVpcRoute = genFordeleteVpcRoute();

    private static HttpRequestDef<DeleteVpcRouteRequest, DeleteVpcRouteResponse> genFordeleteVpcRoute() {
        // basic
        HttpRequestDef.Builder<DeleteVpcRouteRequest, DeleteVpcRouteResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteVpcRouteRequest.class, DeleteVpcRouteResponse.class)
                .withUri("/v2.0/vpc/routes/{route_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("route_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteVpcRouteRequest::getRouteId, (req, v) -> {
                req.setRouteId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListVpcRoutesRequest, ListVpcRoutesResponse> listVpcRoutes = genForlistVpcRoutes();

    private static HttpRequestDef<ListVpcRoutesRequest, ListVpcRoutesResponse> genForlistVpcRoutes() {
        // basic
        HttpRequestDef.Builder<ListVpcRoutesRequest, ListVpcRoutesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListVpcRoutesRequest.class, ListVpcRoutesResponse.class)
                .withUri("/v2.0/vpc/routes")
                .withContentType("application/json");

        // requests
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListVpcRoutesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListVpcRoutesRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            })
        );
        builder.withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListVpcRoutesRequest::getId, (req, v) -> {
                req.setId(v);
            })
        );
        builder.withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            ListVpcRoutesRequest.TypeEnum.class,
            f -> f.withMarshaller(ListVpcRoutesRequest::getType, (req, v) -> {
                req.setType(v);
            })
        );
        builder.withRequestField("vpc_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListVpcRoutesRequest::getVpcId, (req, v) -> {
                req.setVpcId(v);
            })
        );
        builder.withRequestField("destination",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListVpcRoutesRequest::getDestination, (req, v) -> {
                req.setDestination(v);
            })
        );
        builder.withRequestField("tenant_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListVpcRoutesRequest::getTenantId, (req, v) -> {
                req.setTenantId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListVpcsRequest, ListVpcsResponse> listVpcs = genForlistVpcs();

    private static HttpRequestDef<ListVpcsRequest, ListVpcsResponse> genForlistVpcs() {
        // basic
        HttpRequestDef.Builder<ListVpcsRequest, ListVpcsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListVpcsRequest.class, ListVpcsResponse.class)
                .withUri("/v1/{project_id}/vpcs")
                .withContentType("application/json");

        // requests
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListVpcsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListVpcsRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            })
        );
        builder.withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListVpcsRequest::getId, (req, v) -> {
                req.setId(v);
            })
        );
        builder.withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListVpcsRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowVpcRequest, ShowVpcResponse> showVpc = genForshowVpc();

    private static HttpRequestDef<ShowVpcRequest, ShowVpcResponse> genForshowVpc() {
        // basic
        HttpRequestDef.Builder<ShowVpcRequest, ShowVpcResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowVpcRequest.class, ShowVpcResponse.class)
                .withUri("/v1/{project_id}/vpcs/{vpc_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("vpc_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowVpcRequest::getVpcId, (req, v) -> {
                req.setVpcId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowVpcRouteRequest, ShowVpcRouteResponse> showVpcRoute = genForshowVpcRoute();

    private static HttpRequestDef<ShowVpcRouteRequest, ShowVpcRouteResponse> genForshowVpcRoute() {
        // basic
        HttpRequestDef.Builder<ShowVpcRouteRequest, ShowVpcRouteResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowVpcRouteRequest.class, ShowVpcRouteResponse.class)
                .withUri("/v2.0/vpc/routes/{route_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("route_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowVpcRouteRequest::getRouteId, (req, v) -> {
                req.setRouteId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateVpcRequest, UpdateVpcResponse> updateVpc = genForupdateVpc();

    private static HttpRequestDef<UpdateVpcRequest, UpdateVpcResponse> genForupdateVpc() {
        // basic
        HttpRequestDef.Builder<UpdateVpcRequest, UpdateVpcResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateVpcRequest.class, UpdateVpcResponse.class)
                .withUri("/v1/{project_id}/vpcs/{vpc_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("vpc_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateVpcRequest::getVpcId, (req, v) -> {
                req.setVpcId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            UpdateVpcRequestBody.class,
            f -> f.withMarshaller(UpdateVpcRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

}
