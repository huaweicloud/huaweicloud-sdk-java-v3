package com.huaweicloud.sdk.vpc.v2;

import java.util.List;
import java.util.Map;
import java.time.OffsetDateTime;

import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.core.http.HttpMethod;

import com.huaweicloud.sdk.vpc.v2.model.*;

@SuppressWarnings("unchecked")
public class VpcMeta {

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

    public static final HttpRequestDef<DeletePortRequest, DeletePortResponse> deletePort = genFordeletePort();

    private static HttpRequestDef<DeletePortRequest, DeletePortResponse> genFordeletePort() {
        // basic
        HttpRequestDef.Builder<DeletePortRequest, DeletePortResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeletePortRequest.class, DeletePortResponse.class)
                .withUri("/v1/{project_id}/ports/{port_id}");

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
                .withUri("/v1/{project_id}/security-groups/{security_group_id}");

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
                .withUri("/v1/{project_id}/security-group-rules/{security_group_rule_id}");

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
                .withUri("/v1/{project_id}/vpcs/{vpc_id}/subnets/{subnet_id}");

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

    public static final HttpRequestDef<ListPortsRequest, ListPortsResponse> listPorts = genForlistPorts();

    private static HttpRequestDef<ListPortsRequest, ListPortsResponse> genForlistPorts() {
        // basic
        HttpRequestDef.Builder<ListPortsRequest, ListPortsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListPortsRequest.class, ListPortsResponse.class)
                .withUri("/v1/{project_id}/ports");

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
                .withUri("/v1/{project_id}/security-group-rules");

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
                .withUri("/v1/{project_id}/security-groups");

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
                .withUri("/v1/{project_id}/subnets");

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

    public static final HttpRequestDef<ShowPortRequest, ShowPortResponse> showPort = genForshowPort();

    private static HttpRequestDef<ShowPortRequest, ShowPortResponse> genForshowPort() {
        // basic
        HttpRequestDef.Builder<ShowPortRequest, ShowPortResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowPortRequest.class, ShowPortResponse.class)
                .withUri("/v1/{project_id}/ports/{port_id}");

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
                .withUri("/v1/{project_id}/quotas");

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
                .withUri("/v1/{project_id}/security-groups/{security_group_id}");

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
                .withUri("/v1/{project_id}/security-group-rules/{security_group_rule_id}");

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
                .withUri("/v1/{project_id}/subnets/{subnet_id}");

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
                .withUri("/v1/{project_id}/privateips/{privateip_id}");

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
                .withUri("/v1/{project_id}/subnets/{subnet_id}/privateips");

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

    public static final HttpRequestDef<ShowPrivateipRequest, ShowPrivateipResponse> showPrivateip = genForshowPrivateip();

    private static HttpRequestDef<ShowPrivateipRequest, ShowPrivateipResponse> genForshowPrivateip() {
        // basic
        HttpRequestDef.Builder<ShowPrivateipRequest, ShowPrivateipResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowPrivateipRequest.class, ShowPrivateipResponse.class)
                .withUri("/v1/{project_id}/privateips/{privateip_id}");

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

    public static final HttpRequestDef<DeleteVpcRequest, DeleteVpcResponse> deleteVpc = genFordeleteVpc();

    private static HttpRequestDef<DeleteVpcRequest, DeleteVpcResponse> genFordeleteVpc() {
        // basic
        HttpRequestDef.Builder<DeleteVpcRequest, DeleteVpcResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteVpcRequest.class, DeleteVpcResponse.class)
                .withUri("/v1/{project_id}/vpcs/{vpc_id}");

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

    public static final HttpRequestDef<ListVpcsRequest, ListVpcsResponse> listVpcs = genForlistVpcs();

    private static HttpRequestDef<ListVpcsRequest, ListVpcsResponse> genForlistVpcs() {
        // basic
        HttpRequestDef.Builder<ListVpcsRequest, ListVpcsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListVpcsRequest.class, ListVpcsResponse.class)
                .withUri("/v1/{project_id}/vpcs");

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
                .withUri("/v1/{project_id}/vpcs/{vpc_id}");

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

