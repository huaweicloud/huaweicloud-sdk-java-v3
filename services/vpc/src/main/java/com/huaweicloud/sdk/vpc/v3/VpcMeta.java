package com.huaweicloud.sdk.vpc.v3;

import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.vpc.v3.model.*;
import java.util.List;
import java.util.Map;
import java.time.OffsetDateTime;

@SuppressWarnings("unchecked")
public class VpcMeta {

    public static final HttpRequestDef<BatchCreateSubNetworkInterfaceRequest, BatchCreateSubNetworkInterfaceResponse> batchCreateSubNetworkInterface = genForbatchCreateSubNetworkInterface();

    private static HttpRequestDef<BatchCreateSubNetworkInterfaceRequest, BatchCreateSubNetworkInterfaceResponse> genForbatchCreateSubNetworkInterface() {
        // basic
        HttpRequestDef.Builder<BatchCreateSubNetworkInterfaceRequest, BatchCreateSubNetworkInterfaceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchCreateSubNetworkInterfaceRequest.class, BatchCreateSubNetworkInterfaceResponse.class)
                .withName("BatchCreateSubNetworkInterface")
                .withUri("/v3/{project_id}/vpc/sub-network-interfaces/batch-create")
                .withContentType("application/json");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            BatchCreateSubNetworkInterfaceRequestBody.class,
            f -> f.withMarshaller(BatchCreateSubNetworkInterfaceRequest::getBody, (req, v) -> {
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
                .withName("CreateSecurityGroup")
                .withUri("/v3/{project_id}/vpc/security-groups")
                .withContentType("application/json");

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
                .withName("CreateSecurityGroupRule")
                .withUri("/v3/{project_id}/vpc/security-group-rules")
                .withContentType("application/json");

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

    public static final HttpRequestDef<CreateSubNetworkInterfaceRequest, CreateSubNetworkInterfaceResponse> createSubNetworkInterface = genForcreateSubNetworkInterface();

    private static HttpRequestDef<CreateSubNetworkInterfaceRequest, CreateSubNetworkInterfaceResponse> genForcreateSubNetworkInterface() {
        // basic
        HttpRequestDef.Builder<CreateSubNetworkInterfaceRequest, CreateSubNetworkInterfaceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateSubNetworkInterfaceRequest.class, CreateSubNetworkInterfaceResponse.class)
                .withName("CreateSubNetworkInterface")
                .withUri("/v3/{project_id}/vpc/sub-network-interfaces")
                .withContentType("application/json");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            CreateSubNetworkInterfaceRequestBody.class,
            f -> f.withMarshaller(CreateSubNetworkInterfaceRequest::getBody, (req, v) -> {
                req.setBody(v);
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
                .withName("DeleteSecurityGroup")
                .withUri("/v3/{project_id}/vpc/security-groups/{security_group_id}")
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
                .withName("DeleteSecurityGroupRule")
                .withUri("/v3/{project_id}/vpc/security-group-rules/{security_group_rule_id}")
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

    public static final HttpRequestDef<DeleteSubNetworkInterfaceRequest, DeleteSubNetworkInterfaceResponse> deleteSubNetworkInterface = genFordeleteSubNetworkInterface();

    private static HttpRequestDef<DeleteSubNetworkInterfaceRequest, DeleteSubNetworkInterfaceResponse> genFordeleteSubNetworkInterface() {
        // basic
        HttpRequestDef.Builder<DeleteSubNetworkInterfaceRequest, DeleteSubNetworkInterfaceResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteSubNetworkInterfaceRequest.class, DeleteSubNetworkInterfaceResponse.class)
                .withName("DeleteSubNetworkInterface")
                .withUri("/v3/{project_id}/vpc/sub-network-interfaces/{sub_network_interface_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("sub_network_interface_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteSubNetworkInterfaceRequest::getSubNetworkInterfaceId, (req, v) -> {
                req.setSubNetworkInterfaceId(v);
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
                .withName("ListSecurityGroupRules")
                .withUri("/v3/{project_id}/vpc/security-group-rules")
                .withContentType("application/json");

        // requests
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListSecurityGroupRulesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListSecurityGroupRulesRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            })
        );
        builder.withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            List.class,
            f -> f.withMarshaller(ListSecurityGroupRulesRequest::getId, (req, v) -> {
                req.setId(v);
            })
        );
        builder.withRequestField("security_group_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            List.class,
            f -> f.withMarshaller(ListSecurityGroupRulesRequest::getSecurityGroupId, (req, v) -> {
                req.setSecurityGroupId(v);
            })
        );
        builder.withRequestField("protocol",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            List.class,
            f -> f.withMarshaller(ListSecurityGroupRulesRequest::getProtocol, (req, v) -> {
                req.setProtocol(v);
            })
        );
        builder.withRequestField("description",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            List.class,
            f -> f.withMarshaller(ListSecurityGroupRulesRequest::getDescription, (req, v) -> {
                req.setDescription(v);
            })
        );
        builder.withRequestField("remote_group_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            List.class,
            f -> f.withMarshaller(ListSecurityGroupRulesRequest::getRemoteGroupId, (req, v) -> {
                req.setRemoteGroupId(v);
            })
        );
        builder.withRequestField("direction",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListSecurityGroupRulesRequest::getDirection, (req, v) -> {
                req.setDirection(v);
            })
        );
        builder.withRequestField("action",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListSecurityGroupRulesRequest::getAction, (req, v) -> {
                req.setAction(v);
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
                .withName("ListSecurityGroups")
                .withUri("/v3/{project_id}/vpc/security-groups")
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
        builder.withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            List.class,
            f -> f.withMarshaller(ListSecurityGroupsRequest::getId, (req, v) -> {
                req.setId(v);
            })
        );
        builder.withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            List.class,
            f -> f.withMarshaller(ListSecurityGroupsRequest::getName, (req, v) -> {
                req.setName(v);
            })
        );
        builder.withRequestField("description",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            List.class,
            f -> f.withMarshaller(ListSecurityGroupsRequest::getDescription, (req, v) -> {
                req.setDescription(v);
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

    public static final HttpRequestDef<ListSubNetworkInterfacesRequest, ListSubNetworkInterfacesResponse> listSubNetworkInterfaces = genForlistSubNetworkInterfaces();

    private static HttpRequestDef<ListSubNetworkInterfacesRequest, ListSubNetworkInterfacesResponse> genForlistSubNetworkInterfaces() {
        // basic
        HttpRequestDef.Builder<ListSubNetworkInterfacesRequest, ListSubNetworkInterfacesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListSubNetworkInterfacesRequest.class, ListSubNetworkInterfacesResponse.class)
                .withName("ListSubNetworkInterfaces")
                .withUri("/v3/{project_id}/vpc/sub-network-interfaces")
                .withContentType("application/json");

        // requests
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListSubNetworkInterfacesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListSubNetworkInterfacesRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            })
        );
        builder.withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            List.class,
            f -> f.withMarshaller(ListSubNetworkInterfacesRequest::getId, (req, v) -> {
                req.setId(v);
            })
        );
        builder.withRequestField("virsubnet_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            List.class,
            f -> f.withMarshaller(ListSubNetworkInterfacesRequest::getVirsubnetId, (req, v) -> {
                req.setVirsubnetId(v);
            })
        );
        builder.withRequestField("private_ip_address",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            List.class,
            f -> f.withMarshaller(ListSubNetworkInterfacesRequest::getPrivateIpAddress, (req, v) -> {
                req.setPrivateIpAddress(v);
            })
        );
        builder.withRequestField("mac_address",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            List.class,
            f -> f.withMarshaller(ListSubNetworkInterfacesRequest::getMacAddress, (req, v) -> {
                req.setMacAddress(v);
            })
        );
        builder.withRequestField("vpc_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            List.class,
            f -> f.withMarshaller(ListSubNetworkInterfacesRequest::getVpcId, (req, v) -> {
                req.setVpcId(v);
            })
        );
        builder.withRequestField("description",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            List.class,
            f -> f.withMarshaller(ListSubNetworkInterfacesRequest::getDescription, (req, v) -> {
                req.setDescription(v);
            })
        );
        builder.withRequestField("parent_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            List.class,
            f -> f.withMarshaller(ListSubNetworkInterfacesRequest::getParentId, (req, v) -> {
                req.setParentId(v);
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
                .withName("ShowSecurityGroup")
                .withUri("/v3/{project_id}/vpc/security-groups/{security_group_id}")
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
                .withName("ShowSecurityGroupRule")
                .withUri("/v3/{project_id}/vpc/security-group-rules/{security_group_rule_id}")
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

    public static final HttpRequestDef<ShowSubNetworkInterfaceRequest, ShowSubNetworkInterfaceResponse> showSubNetworkInterface = genForshowSubNetworkInterface();

    private static HttpRequestDef<ShowSubNetworkInterfaceRequest, ShowSubNetworkInterfaceResponse> genForshowSubNetworkInterface() {
        // basic
        HttpRequestDef.Builder<ShowSubNetworkInterfaceRequest, ShowSubNetworkInterfaceResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowSubNetworkInterfaceRequest.class, ShowSubNetworkInterfaceResponse.class)
                .withName("ShowSubNetworkInterface")
                .withUri("/v3/{project_id}/vpc/sub-network-interfaces/{sub_network_interface_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("sub_network_interface_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowSubNetworkInterfaceRequest::getSubNetworkInterfaceId, (req, v) -> {
                req.setSubNetworkInterfaceId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowSubNetworkInterfacesQuantityRequest, ShowSubNetworkInterfacesQuantityResponse> showSubNetworkInterfacesQuantity = genForshowSubNetworkInterfacesQuantity();

    private static HttpRequestDef<ShowSubNetworkInterfacesQuantityRequest, ShowSubNetworkInterfacesQuantityResponse> genForshowSubNetworkInterfacesQuantity() {
        // basic
        HttpRequestDef.Builder<ShowSubNetworkInterfacesQuantityRequest, ShowSubNetworkInterfacesQuantityResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowSubNetworkInterfacesQuantityRequest.class, ShowSubNetworkInterfacesQuantityResponse.class)
                .withName("ShowSubNetworkInterfacesQuantity")
                .withUri("/v3/{project_id}/vpc/sub-network-interfaces/count")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateSecurityGroupRequest, UpdateSecurityGroupResponse> updateSecurityGroup = genForupdateSecurityGroup();

    private static HttpRequestDef<UpdateSecurityGroupRequest, UpdateSecurityGroupResponse> genForupdateSecurityGroup() {
        // basic
        HttpRequestDef.Builder<UpdateSecurityGroupRequest, UpdateSecurityGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateSecurityGroupRequest.class, UpdateSecurityGroupResponse.class)
                .withName("UpdateSecurityGroup")
                .withUri("/v3/{project_id}/vpc/security-groups/{security_group_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("security_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateSecurityGroupRequest::getSecurityGroupId, (req, v) -> {
                req.setSecurityGroupId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            UpdateSecurityGroupRequestBody.class,
            f -> f.withMarshaller(UpdateSecurityGroupRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateSubNetworkInterfaceRequest, UpdateSubNetworkInterfaceResponse> updateSubNetworkInterface = genForupdateSubNetworkInterface();

    private static HttpRequestDef<UpdateSubNetworkInterfaceRequest, UpdateSubNetworkInterfaceResponse> genForupdateSubNetworkInterface() {
        // basic
        HttpRequestDef.Builder<UpdateSubNetworkInterfaceRequest, UpdateSubNetworkInterfaceResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateSubNetworkInterfaceRequest.class, UpdateSubNetworkInterfaceResponse.class)
                .withName("UpdateSubNetworkInterface")
                .withUri("/v3/{project_id}/vpc/sub-network-interfaces/{sub_network_interface_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("sub_network_interface_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateSubNetworkInterfaceRequest::getSubNetworkInterfaceId, (req, v) -> {
                req.setSubNetworkInterfaceId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            UpdateSubNetworkInterfaceRequestBody.class,
            f -> f.withMarshaller(UpdateSubNetworkInterfaceRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

}
