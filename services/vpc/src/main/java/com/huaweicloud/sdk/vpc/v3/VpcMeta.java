package com.huaweicloud.sdk.vpc.v3;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.vpc.v3.model.*;

import java.util.List;

@SuppressWarnings("unchecked")
public class VpcMeta {

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
