package com.huaweicloud.sdk.iam.v3;

import java.util.List;
import java.util.Map;
import java.time.OffsetDateTime;

import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.core.http.HttpMethod;

import com.huaweicloud.sdk.iam.v3.model.*;

@SuppressWarnings("unchecked")
public class IamMeta {

    public static final HttpRequestDef<AssociateAgencyWithDomainPermissionRequest, AssociateAgencyWithDomainPermissionResponse> associateAgencyWithDomainPermission = genForassociateAgencyWithDomainPermission();

    private static HttpRequestDef<AssociateAgencyWithDomainPermissionRequest, AssociateAgencyWithDomainPermissionResponse> genForassociateAgencyWithDomainPermission() {
        // basic
        HttpRequestDef.Builder<AssociateAgencyWithDomainPermissionRequest, AssociateAgencyWithDomainPermissionResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, AssociateAgencyWithDomainPermissionRequest.class, AssociateAgencyWithDomainPermissionResponse.class)
                .withUri("/v3.0/OS-AGENCY/domains/{domain_id}/agencies/{agency_id}/roles/{role_id}");

        // requests
        builder.withRequestField("domain_id",
                LocationType.Path,
                FieldExistence.NON_NULL_NON_EMPTY,
                String.class,
                f -> f.withMarshaller(AssociateAgencyWithDomainPermissionRequest::getDomainId, (req, v) -> {
                    req.setDomainId(v);
                })
        );
        builder.withRequestField("agency_id",
                LocationType.Path,
                FieldExistence.NON_NULL_NON_EMPTY,
                String.class,
                f -> f.withMarshaller(AssociateAgencyWithDomainPermissionRequest::getAgencyId, (req, v) -> {
                    req.setAgencyId(v);
                })
        );
        builder.withRequestField("role_id",
                LocationType.Path,
                FieldExistence.NON_NULL_NON_EMPTY,
                String.class,
                f -> f.withMarshaller(AssociateAgencyWithDomainPermissionRequest::getRoleId, (req, v) -> {
                    req.setRoleId(v);
                })
        );

        // response

        return builder.build();

    }

    public static final HttpRequestDef<AssociateAgencyWithProjectPermissionRequest, AssociateAgencyWithProjectPermissionResponse> associateAgencyWithProjectPermission = genForassociateAgencyWithProjectPermission();

    private static HttpRequestDef<AssociateAgencyWithProjectPermissionRequest, AssociateAgencyWithProjectPermissionResponse> genForassociateAgencyWithProjectPermission() {
        // basic
        HttpRequestDef.Builder<AssociateAgencyWithProjectPermissionRequest, AssociateAgencyWithProjectPermissionResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, AssociateAgencyWithProjectPermissionRequest.class, AssociateAgencyWithProjectPermissionResponse.class)
                .withUri("/v3.0/OS-AGENCY/projects/{project_id}/agencies/{agency_id}/roles/{role_id}");

        // requests
        builder.withRequestField("project_id",
                LocationType.Path,
                FieldExistence.NON_NULL_NON_EMPTY,
                String.class,
                f -> f.withMarshaller(AssociateAgencyWithProjectPermissionRequest::getProjectId, (req, v) -> {
                    req.setProjectId(v);
                })
        );
        builder.withRequestField("agency_id",
                LocationType.Path,
                FieldExistence.NON_NULL_NON_EMPTY,
                String.class,
                f -> f.withMarshaller(AssociateAgencyWithProjectPermissionRequest::getAgencyId, (req, v) -> {
                    req.setAgencyId(v);
                })
        );
        builder.withRequestField("role_id",
                LocationType.Path,
                FieldExistence.NON_NULL_NON_EMPTY,
                String.class,
                f -> f.withMarshaller(AssociateAgencyWithProjectPermissionRequest::getRoleId, (req, v) -> {
                    req.setRoleId(v);
                })
        );

        // response

        return builder.build();

    }

    public static final HttpRequestDef<CheckDomainPermissionForAgencyRequest, CheckDomainPermissionForAgencyResponse> checkDomainPermissionForAgency = genForcheckDomainPermissionForAgency();

    private static HttpRequestDef<CheckDomainPermissionForAgencyRequest, CheckDomainPermissionForAgencyResponse> genForcheckDomainPermissionForAgency() {
        // basic
        HttpRequestDef.Builder<CheckDomainPermissionForAgencyRequest, CheckDomainPermissionForAgencyResponse> builder =
            HttpRequestDef.builder(HttpMethod.HEAD, CheckDomainPermissionForAgencyRequest.class, CheckDomainPermissionForAgencyResponse.class)
                .withUri("/v3.0/OS-AGENCY/domains/{domain_id}/agencies/{agency_id}/roles/{role_id}");

        // requests
        builder.withRequestField("domain_id",
                LocationType.Path,
                FieldExistence.NON_NULL_NON_EMPTY,
                String.class,
                f -> f.withMarshaller(CheckDomainPermissionForAgencyRequest::getDomainId, (req, v) -> {
                    req.setDomainId(v);
                })
        );
        builder.withRequestField("agency_id",
                LocationType.Path,
                FieldExistence.NON_NULL_NON_EMPTY,
                String.class,
                f -> f.withMarshaller(CheckDomainPermissionForAgencyRequest::getAgencyId, (req, v) -> {
                    req.setAgencyId(v);
                })
        );
        builder.withRequestField("role_id",
                LocationType.Path,
                FieldExistence.NON_NULL_NON_EMPTY,
                String.class,
                f -> f.withMarshaller(CheckDomainPermissionForAgencyRequest::getRoleId, (req, v) -> {
                    req.setRoleId(v);
                })
        );

        // response

        return builder.build();

    }

    public static final HttpRequestDef<CheckProjectPermissionForAgencyRequest, CheckProjectPermissionForAgencyResponse> checkProjectPermissionForAgency = genForcheckProjectPermissionForAgency();

    private static HttpRequestDef<CheckProjectPermissionForAgencyRequest, CheckProjectPermissionForAgencyResponse> genForcheckProjectPermissionForAgency() {
        // basic
        HttpRequestDef.Builder<CheckProjectPermissionForAgencyRequest, CheckProjectPermissionForAgencyResponse> builder =
            HttpRequestDef.builder(HttpMethod.HEAD, CheckProjectPermissionForAgencyRequest.class, CheckProjectPermissionForAgencyResponse.class)
                .withUri("/v3.0/OS-AGENCY/projects/{project_id}/agencies/{agency_id}/roles/{role_id}");

        // requests
        builder.withRequestField("project_id",
                LocationType.Path,
                FieldExistence.NON_NULL_NON_EMPTY,
                String.class,
                f -> f.withMarshaller(CheckProjectPermissionForAgencyRequest::getProjectId, (req, v) -> {
                    req.setProjectId(v);
                })
        );
        builder.withRequestField("agency_id",
                LocationType.Path,
                FieldExistence.NON_NULL_NON_EMPTY,
                String.class,
                f -> f.withMarshaller(CheckProjectPermissionForAgencyRequest::getAgencyId, (req, v) -> {
                    req.setAgencyId(v);
                })
        );
        builder.withRequestField("role_id",
                LocationType.Path,
                FieldExistence.NON_NULL_NON_EMPTY,
                String.class,
                f -> f.withMarshaller(CheckProjectPermissionForAgencyRequest::getRoleId, (req, v) -> {
                    req.setRoleId(v);
                })
        );

        // response

        return builder.build();

    }

    public static final HttpRequestDef<CreateAgencyRequest, CreateAgencyResponse> createAgency = genForcreateAgency();

    private static HttpRequestDef<CreateAgencyRequest, CreateAgencyResponse> genForcreateAgency() {
        // basic
        HttpRequestDef.Builder<CreateAgencyRequest, CreateAgencyResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateAgencyRequest.class, CreateAgencyResponse.class)
                .withUri("/v3.0/OS-AGENCY/agencies")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("body",
                LocationType.Body,
                FieldExistence.NON_NULL_NON_EMPTY,
                CreateAgencyRequestBody.class,
                f -> f.withMarshaller(CreateAgencyRequest::getBody, (req, v) -> {
                    req.setBody(v);
                })
        );

        // response

        return builder.build();

    }

    public static final HttpRequestDef<DeleteAgencyRequest, DeleteAgencyResponse> deleteAgency = genFordeleteAgency();

    private static HttpRequestDef<DeleteAgencyRequest, DeleteAgencyResponse> genFordeleteAgency() {
        // basic
        HttpRequestDef.Builder<DeleteAgencyRequest, DeleteAgencyResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteAgencyRequest.class, DeleteAgencyResponse.class)
                .withUri("/v3.0/OS-AGENCY/agencies/{agency_id}");

        // requests
        builder.withRequestField("agency_id",
                LocationType.Path,
                FieldExistence.NON_NULL_NON_EMPTY,
                String.class,
                f -> f.withMarshaller(DeleteAgencyRequest::getAgencyId, (req, v) -> {
                    req.setAgencyId(v);
                })
        );

        // response

        return builder.build();

    }

    public static final HttpRequestDef<KeystoneAddUserToGroupRequest, KeystoneAddUserToGroupResponse> keystoneAddUserToGroup = genForkeystoneAddUserToGroup();

    private static HttpRequestDef<KeystoneAddUserToGroupRequest, KeystoneAddUserToGroupResponse> genForkeystoneAddUserToGroup() {
        // basic
        HttpRequestDef.Builder<KeystoneAddUserToGroupRequest, KeystoneAddUserToGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, KeystoneAddUserToGroupRequest.class, KeystoneAddUserToGroupResponse.class)
                .withUri("/v3/groups/{group_id}/users/{user_id}");

        // requests
        builder.withRequestField("group_id",
                LocationType.Path,
                FieldExistence.NON_NULL_NON_EMPTY,
                String.class,
                f -> f.withMarshaller(KeystoneAddUserToGroupRequest::getGroupId, (req, v) -> {
                    req.setGroupId(v);
                })
        );
        builder.withRequestField("user_id",
                LocationType.Path,
                FieldExistence.NON_NULL_NON_EMPTY,
                String.class,
                f -> f.withMarshaller(KeystoneAddUserToGroupRequest::getUserId, (req, v) -> {
                    req.setUserId(v);
                })
        );

        // response

        return builder.build();

    }

    public static final HttpRequestDef<KeystoneAssociateGroupWithDomainPermissionRequest, KeystoneAssociateGroupWithDomainPermissionResponse> keystoneAssociateGroupWithDomainPermission = genForkeystoneAssociateGroupWithDomainPermission();

    private static HttpRequestDef<KeystoneAssociateGroupWithDomainPermissionRequest, KeystoneAssociateGroupWithDomainPermissionResponse> genForkeystoneAssociateGroupWithDomainPermission() {
        // basic
        HttpRequestDef.Builder<KeystoneAssociateGroupWithDomainPermissionRequest, KeystoneAssociateGroupWithDomainPermissionResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, KeystoneAssociateGroupWithDomainPermissionRequest.class, KeystoneAssociateGroupWithDomainPermissionResponse.class)
                .withUri("/v3/domains/{domain_id}/groups/{group_id}/roles/{role_id}");

        // requests
        builder.withRequestField("domain_id",
                LocationType.Path,
                FieldExistence.NON_NULL_NON_EMPTY,
                String.class,
                f -> f.withMarshaller(KeystoneAssociateGroupWithDomainPermissionRequest::getDomainId, (req, v) -> {
                    req.setDomainId(v);
                })
        );
        builder.withRequestField("group_id",
                LocationType.Path,
                FieldExistence.NON_NULL_NON_EMPTY,
                String.class,
                f -> f.withMarshaller(KeystoneAssociateGroupWithDomainPermissionRequest::getGroupId, (req, v) -> {
                    req.setGroupId(v);
                })
        );
        builder.withRequestField("role_id",
                LocationType.Path,
                FieldExistence.NON_NULL_NON_EMPTY,
                String.class,
                f -> f.withMarshaller(KeystoneAssociateGroupWithDomainPermissionRequest::getRoleId, (req, v) -> {
                    req.setRoleId(v);
                })
        );

        // response

        return builder.build();

    }

    public static final HttpRequestDef<KeystoneAssociateGroupWithProjectPermissionRequest, KeystoneAssociateGroupWithProjectPermissionResponse> keystoneAssociateGroupWithProjectPermission = genForkeystoneAssociateGroupWithProjectPermission();

    private static HttpRequestDef<KeystoneAssociateGroupWithProjectPermissionRequest, KeystoneAssociateGroupWithProjectPermissionResponse> genForkeystoneAssociateGroupWithProjectPermission() {
        // basic
        HttpRequestDef.Builder<KeystoneAssociateGroupWithProjectPermissionRequest, KeystoneAssociateGroupWithProjectPermissionResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, KeystoneAssociateGroupWithProjectPermissionRequest.class, KeystoneAssociateGroupWithProjectPermissionResponse.class)
                .withUri("/v3/projects/{project_id}/groups/{group_id}/roles/{role_id}");

        // requests
        builder.withRequestField("project_id",
                LocationType.Path,
                FieldExistence.NON_NULL_NON_EMPTY,
                String.class,
                f -> f.withMarshaller(KeystoneAssociateGroupWithProjectPermissionRequest::getProjectId, (req, v) -> {
                    req.setProjectId(v);
                })
        );
        builder.withRequestField("group_id",
                LocationType.Path,
                FieldExistence.NON_NULL_NON_EMPTY,
                String.class,
                f -> f.withMarshaller(KeystoneAssociateGroupWithProjectPermissionRequest::getGroupId, (req, v) -> {
                    req.setGroupId(v);
                })
        );
        builder.withRequestField("role_id",
                LocationType.Path,
                FieldExistence.NON_NULL_NON_EMPTY,
                String.class,
                f -> f.withMarshaller(KeystoneAssociateGroupWithProjectPermissionRequest::getRoleId, (req, v) -> {
                    req.setRoleId(v);
                })
        );

        // response

        return builder.build();

    }

    public static final HttpRequestDef<KeystoneCheckDomainPermissionForGroupRequest, KeystoneCheckDomainPermissionForGroupResponse> keystoneCheckDomainPermissionForGroup = genForkeystoneCheckDomainPermissionForGroup();

    private static HttpRequestDef<KeystoneCheckDomainPermissionForGroupRequest, KeystoneCheckDomainPermissionForGroupResponse> genForkeystoneCheckDomainPermissionForGroup() {
        // basic
        HttpRequestDef.Builder<KeystoneCheckDomainPermissionForGroupRequest, KeystoneCheckDomainPermissionForGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.HEAD, KeystoneCheckDomainPermissionForGroupRequest.class, KeystoneCheckDomainPermissionForGroupResponse.class)
                .withUri("/v3/domains/{domain_id}/groups/{group_id}/roles/{role_id}");

        // requests
        builder.withRequestField("domain_id",
                LocationType.Path,
                FieldExistence.NON_NULL_NON_EMPTY,
                String.class,
                f -> f.withMarshaller(KeystoneCheckDomainPermissionForGroupRequest::getDomainId, (req, v) -> {
                    req.setDomainId(v);
                })
        );
        builder.withRequestField("group_id",
                LocationType.Path,
                FieldExistence.NON_NULL_NON_EMPTY,
                String.class,
                f -> f.withMarshaller(KeystoneCheckDomainPermissionForGroupRequest::getGroupId, (req, v) -> {
                    req.setGroupId(v);
                })
        );
        builder.withRequestField("role_id",
                LocationType.Path,
                FieldExistence.NON_NULL_NON_EMPTY,
                String.class,
                f -> f.withMarshaller(KeystoneCheckDomainPermissionForGroupRequest::getRoleId, (req, v) -> {
                    req.setRoleId(v);
                })
        );

        // response

        return builder.build();

    }

    public static final HttpRequestDef<KeystoneCheckProjectPermissionForGroupRequest, KeystoneCheckProjectPermissionForGroupResponse> keystoneCheckProjectPermissionForGroup = genForkeystoneCheckProjectPermissionForGroup();

    private static HttpRequestDef<KeystoneCheckProjectPermissionForGroupRequest, KeystoneCheckProjectPermissionForGroupResponse> genForkeystoneCheckProjectPermissionForGroup() {
        // basic
        HttpRequestDef.Builder<KeystoneCheckProjectPermissionForGroupRequest, KeystoneCheckProjectPermissionForGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.HEAD, KeystoneCheckProjectPermissionForGroupRequest.class, KeystoneCheckProjectPermissionForGroupResponse.class)
                .withUri("/v3/projects/{project_id}/groups/{group_id}/roles/{role_id}");

        // requests
        builder.withRequestField("project_id",
                LocationType.Path,
                FieldExistence.NON_NULL_NON_EMPTY,
                String.class,
                f -> f.withMarshaller(KeystoneCheckProjectPermissionForGroupRequest::getProjectId, (req, v) -> {
                    req.setProjectId(v);
                })
        );
        builder.withRequestField("group_id",
                LocationType.Path,
                FieldExistence.NON_NULL_NON_EMPTY,
                String.class,
                f -> f.withMarshaller(KeystoneCheckProjectPermissionForGroupRequest::getGroupId, (req, v) -> {
                    req.setGroupId(v);
                })
        );
        builder.withRequestField("role_id",
                LocationType.Path,
                FieldExistence.NON_NULL_NON_EMPTY,
                String.class,
                f -> f.withMarshaller(KeystoneCheckProjectPermissionForGroupRequest::getRoleId, (req, v) -> {
                    req.setRoleId(v);
                })
        );

        // response

        return builder.build();

    }

    public static final HttpRequestDef<KeystoneCheckUserInGroupRequest, KeystoneCheckUserInGroupResponse> keystoneCheckUserInGroup = genForkeystoneCheckUserInGroup();

    private static HttpRequestDef<KeystoneCheckUserInGroupRequest, KeystoneCheckUserInGroupResponse> genForkeystoneCheckUserInGroup() {
        // basic
        HttpRequestDef.Builder<KeystoneCheckUserInGroupRequest, KeystoneCheckUserInGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.HEAD, KeystoneCheckUserInGroupRequest.class, KeystoneCheckUserInGroupResponse.class)
                .withUri("/v3/groups/{group_id}/users/{user_id}");

        // requests
        builder.withRequestField("group_id",
                LocationType.Path,
                FieldExistence.NON_NULL_NON_EMPTY,
                String.class,
                f -> f.withMarshaller(KeystoneCheckUserInGroupRequest::getGroupId, (req, v) -> {
                    req.setGroupId(v);
                })
        );
        builder.withRequestField("user_id",
                LocationType.Path,
                FieldExistence.NON_NULL_NON_EMPTY,
                String.class,
                f -> f.withMarshaller(KeystoneCheckUserInGroupRequest::getUserId, (req, v) -> {
                    req.setUserId(v);
                })
        );

        // response

        return builder.build();

    }

    public static final HttpRequestDef<KeystoneCreateGroupRequest, KeystoneCreateGroupResponse> keystoneCreateGroup = genForkeystoneCreateGroup();

    private static HttpRequestDef<KeystoneCreateGroupRequest, KeystoneCreateGroupResponse> genForkeystoneCreateGroup() {
        // basic
        HttpRequestDef.Builder<KeystoneCreateGroupRequest, KeystoneCreateGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, KeystoneCreateGroupRequest.class, KeystoneCreateGroupResponse.class)
                .withUri("/v3/groups")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("body",
                LocationType.Body,
                FieldExistence.NON_NULL_NON_EMPTY,
                KeystoneCreateGroupRequestBody.class,
                f -> f.withMarshaller(KeystoneCreateGroupRequest::getBody, (req, v) -> {
                    req.setBody(v);
                })
        );

        // response

        return builder.build();

    }

    public static final HttpRequestDef<KeystoneCreateUserRequest, KeystoneCreateUserResponse> keystoneCreateUser = genForkeystoneCreateUser();

    private static HttpRequestDef<KeystoneCreateUserRequest, KeystoneCreateUserResponse> genForkeystoneCreateUser() {
        // basic
        HttpRequestDef.Builder<KeystoneCreateUserRequest, KeystoneCreateUserResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, KeystoneCreateUserRequest.class, KeystoneCreateUserResponse.class)
                .withUri("/v3/users")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("body",
                LocationType.Body,
                FieldExistence.NON_NULL_NON_EMPTY,
                KeystoneCreateUserRequestBody.class,
                f -> f.withMarshaller(KeystoneCreateUserRequest::getBody, (req, v) -> {
                    req.setBody(v);
                })
        );

        // response

        return builder.build();

    }

    public static final HttpRequestDef<KeystoneDeleteGroupRequest, KeystoneDeleteGroupResponse> keystoneDeleteGroup = genForkeystoneDeleteGroup();

    private static HttpRequestDef<KeystoneDeleteGroupRequest, KeystoneDeleteGroupResponse> genForkeystoneDeleteGroup() {
        // basic
        HttpRequestDef.Builder<KeystoneDeleteGroupRequest, KeystoneDeleteGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, KeystoneDeleteGroupRequest.class, KeystoneDeleteGroupResponse.class)
                .withUri("/v3/groups/{group_id}");

        // requests
        builder.withRequestField("group_id",
                LocationType.Path,
                FieldExistence.NON_NULL_NON_EMPTY,
                String.class,
                f -> f.withMarshaller(KeystoneDeleteGroupRequest::getGroupId, (req, v) -> {
                    req.setGroupId(v);
                })
        );

        // response

        return builder.build();

    }

    public static final HttpRequestDef<KeystoneDeleteUserRequest, KeystoneDeleteUserResponse> keystoneDeleteUser = genForkeystoneDeleteUser();

    private static HttpRequestDef<KeystoneDeleteUserRequest, KeystoneDeleteUserResponse> genForkeystoneDeleteUser() {
        // basic
        HttpRequestDef.Builder<KeystoneDeleteUserRequest, KeystoneDeleteUserResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, KeystoneDeleteUserRequest.class, KeystoneDeleteUserResponse.class)
                .withUri("/v3/users/{user_id}");

        // requests
        builder.withRequestField("user_id",
                LocationType.Path,
                FieldExistence.NON_NULL_NON_EMPTY,
                String.class,
                f -> f.withMarshaller(KeystoneDeleteUserRequest::getUserId, (req, v) -> {
                    req.setUserId(v);
                })
        );

        // response

        return builder.build();

    }

    public static final HttpRequestDef<KeystoneListDomainPermissionsForGroupRequest, KeystoneListDomainPermissionsForGroupResponse> keystoneListDomainPermissionsForGroup = genForkeystoneListDomainPermissionsForGroup();

    private static HttpRequestDef<KeystoneListDomainPermissionsForGroupRequest, KeystoneListDomainPermissionsForGroupResponse> genForkeystoneListDomainPermissionsForGroup() {
        // basic
        HttpRequestDef.Builder<KeystoneListDomainPermissionsForGroupRequest, KeystoneListDomainPermissionsForGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, KeystoneListDomainPermissionsForGroupRequest.class, KeystoneListDomainPermissionsForGroupResponse.class)
                .withUri("/v3/domains/{domain_id}/groups/{group_id}/roles");

        // requests
        builder.withRequestField("domain_id",
                LocationType.Path,
                FieldExistence.NON_NULL_NON_EMPTY,
                String.class,
                f -> f.withMarshaller(KeystoneListDomainPermissionsForGroupRequest::getDomainId, (req, v) -> {
                    req.setDomainId(v);
                })
        );
        builder.withRequestField("group_id",
                LocationType.Path,
                FieldExistence.NON_NULL_NON_EMPTY,
                String.class,
                f -> f.withMarshaller(KeystoneListDomainPermissionsForGroupRequest::getGroupId, (req, v) -> {
                    req.setGroupId(v);
                })
        );

        // response

        return builder.build();

    }

    public static final HttpRequestDef<KeystoneListGroupsRequest, KeystoneListGroupsResponse> keystoneListGroups = genForkeystoneListGroups();

    private static HttpRequestDef<KeystoneListGroupsRequest, KeystoneListGroupsResponse> genForkeystoneListGroups() {
        // basic
        HttpRequestDef.Builder<KeystoneListGroupsRequest, KeystoneListGroupsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, KeystoneListGroupsRequest.class, KeystoneListGroupsResponse.class)
                .withUri("/v3/groups");

        // requests
        builder.withRequestField("domain_id",
                LocationType.Query,
                FieldExistence.NULL_IGNORE,
                String.class,
                f -> f.withMarshaller(KeystoneListGroupsRequest::getDomainId, (req, v) -> {
                    req.setDomainId(v);
                })
        );
        builder.withRequestField("name",
                LocationType.Query,
                FieldExistence.NULL_IGNORE,
                String.class,
                f -> f.withMarshaller(KeystoneListGroupsRequest::getName, (req, v) -> {
                    req.setName(v);
                })
        );

        // response

        return builder.build();

    }

    public static final HttpRequestDef<KeystoneListGroupsForUserRequest, KeystoneListGroupsForUserResponse> keystoneListGroupsForUser = genForkeystoneListGroupsForUser();

    private static HttpRequestDef<KeystoneListGroupsForUserRequest, KeystoneListGroupsForUserResponse> genForkeystoneListGroupsForUser() {
        // basic
        HttpRequestDef.Builder<KeystoneListGroupsForUserRequest, KeystoneListGroupsForUserResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, KeystoneListGroupsForUserRequest.class, KeystoneListGroupsForUserResponse.class)
                .withUri("/v3/users/{user_id}/groups");

        // requests
        builder.withRequestField("user_id",
                LocationType.Path,
                FieldExistence.NON_NULL_NON_EMPTY,
                String.class,
                f -> f.withMarshaller(KeystoneListGroupsForUserRequest::getUserId, (req, v) -> {
                    req.setUserId(v);
                })
        );

        // response

        return builder.build();

    }

    public static final HttpRequestDef<KeystoneListPermissionsRequest, KeystoneListPermissionsResponse> keystoneListPermissions = genForkeystoneListPermissions();

    private static HttpRequestDef<KeystoneListPermissionsRequest, KeystoneListPermissionsResponse> genForkeystoneListPermissions() {
        // basic
        HttpRequestDef.Builder<KeystoneListPermissionsRequest, KeystoneListPermissionsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, KeystoneListPermissionsRequest.class, KeystoneListPermissionsResponse.class)
                .withUri("/v3/roles");

        // requests
        builder.withRequestField("name",
                LocationType.Query,
                FieldExistence.NULL_IGNORE,
                String.class,
                f -> f.withMarshaller(KeystoneListPermissionsRequest::getName, (req, v) -> {
                    req.setName(v);
                })
        );
        builder.withRequestField("domain_id",
                LocationType.Query,
                FieldExistence.NULL_IGNORE,
                String.class,
                f -> f.withMarshaller(KeystoneListPermissionsRequest::getDomainId, (req, v) -> {
                    req.setDomainId(v);
                })
        );

        // response

        return builder.build();

    }

    public static final HttpRequestDef<KeystoneListProjectPermissionsForGroupRequest, KeystoneListProjectPermissionsForGroupResponse> keystoneListProjectPermissionsForGroup = genForkeystoneListProjectPermissionsForGroup();

    private static HttpRequestDef<KeystoneListProjectPermissionsForGroupRequest, KeystoneListProjectPermissionsForGroupResponse> genForkeystoneListProjectPermissionsForGroup() {
        // basic
        HttpRequestDef.Builder<KeystoneListProjectPermissionsForGroupRequest, KeystoneListProjectPermissionsForGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, KeystoneListProjectPermissionsForGroupRequest.class, KeystoneListProjectPermissionsForGroupResponse.class)
                .withUri("/v3/projects/{project_id}/groups/{group_id}/roles");

        // requests
        builder.withRequestField("project_id",
                LocationType.Path,
                FieldExistence.NON_NULL_NON_EMPTY,
                String.class,
                f -> f.withMarshaller(KeystoneListProjectPermissionsForGroupRequest::getProjectId, (req, v) -> {
                    req.setProjectId(v);
                })
        );
        builder.withRequestField("group_id",
                LocationType.Path,
                FieldExistence.NON_NULL_NON_EMPTY,
                String.class,
                f -> f.withMarshaller(KeystoneListProjectPermissionsForGroupRequest::getGroupId, (req, v) -> {
                    req.setGroupId(v);
                })
        );

        // response

        return builder.build();

    }

    public static final HttpRequestDef<KeystoneListUsersRequest, KeystoneListUsersResponse> keystoneListUsers = genForkeystoneListUsers();

    private static HttpRequestDef<KeystoneListUsersRequest, KeystoneListUsersResponse> genForkeystoneListUsers() {
        // basic
        HttpRequestDef.Builder<KeystoneListUsersRequest, KeystoneListUsersResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, KeystoneListUsersRequest.class, KeystoneListUsersResponse.class)
                .withUri("/v3/users");

        // requests
        builder.withRequestField("domain_id",
                LocationType.Query,
                FieldExistence.NULL_IGNORE,
                String.class,
                f -> f.withMarshaller(KeystoneListUsersRequest::getDomainId, (req, v) -> {
                    req.setDomainId(v);
                })
        );
        builder.withRequestField("enabled",
                LocationType.Query,
                FieldExistence.NULL_IGNORE,
                Boolean.class,
                f -> f.withMarshaller(KeystoneListUsersRequest::getEnabled, (req, v) -> {
                    req.setEnabled(v);
                })
        );
        builder.withRequestField("name",
                LocationType.Query,
                FieldExistence.NULL_IGNORE,
                String.class,
                f -> f.withMarshaller(KeystoneListUsersRequest::getName, (req, v) -> {
                    req.setName(v);
                })
        );
        builder.withRequestField("password_expires_at",
                LocationType.Query,
                FieldExistence.NULL_IGNORE,
                String.class,
                f -> f.withMarshaller(KeystoneListUsersRequest::getPasswordExpiresAt, (req, v) -> {
                    req.setPasswordExpiresAt(v);
                })
        );

        // response

        return builder.build();

    }

    public static final HttpRequestDef<KeystoneListUsersForGroupByAdminRequest, KeystoneListUsersForGroupByAdminResponse> keystoneListUsersForGroupByAdmin = genForkeystoneListUsersForGroupByAdmin();

    private static HttpRequestDef<KeystoneListUsersForGroupByAdminRequest, KeystoneListUsersForGroupByAdminResponse> genForkeystoneListUsersForGroupByAdmin() {
        // basic
        HttpRequestDef.Builder<KeystoneListUsersForGroupByAdminRequest, KeystoneListUsersForGroupByAdminResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, KeystoneListUsersForGroupByAdminRequest.class, KeystoneListUsersForGroupByAdminResponse.class)
                .withUri("/v3/groups/{group_id}/users");

        // requests
        builder.withRequestField("group_id",
                LocationType.Path,
                FieldExistence.NON_NULL_NON_EMPTY,
                String.class,
                f -> f.withMarshaller(KeystoneListUsersForGroupByAdminRequest::getGroupId, (req, v) -> {
                    req.setGroupId(v);
                })
        );

        // response

        return builder.build();

    }

    public static final HttpRequestDef<KeystoneRemoveDomainPermissionFromGroupRequest, KeystoneRemoveDomainPermissionFromGroupResponse> keystoneRemoveDomainPermissionFromGroup = genForkeystoneRemoveDomainPermissionFromGroup();

    private static HttpRequestDef<KeystoneRemoveDomainPermissionFromGroupRequest, KeystoneRemoveDomainPermissionFromGroupResponse> genForkeystoneRemoveDomainPermissionFromGroup() {
        // basic
        HttpRequestDef.Builder<KeystoneRemoveDomainPermissionFromGroupRequest, KeystoneRemoveDomainPermissionFromGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, KeystoneRemoveDomainPermissionFromGroupRequest.class, KeystoneRemoveDomainPermissionFromGroupResponse.class)
                .withUri("/v3/domains/{domain_id}/groups/{group_id}/roles/{role_id}");

        // requests
        builder.withRequestField("domain_id",
                LocationType.Path,
                FieldExistence.NON_NULL_NON_EMPTY,
                String.class,
                f -> f.withMarshaller(KeystoneRemoveDomainPermissionFromGroupRequest::getDomainId, (req, v) -> {
                    req.setDomainId(v);
                })
        );
        builder.withRequestField("group_id",
                LocationType.Path,
                FieldExistence.NON_NULL_NON_EMPTY,
                String.class,
                f -> f.withMarshaller(KeystoneRemoveDomainPermissionFromGroupRequest::getGroupId, (req, v) -> {
                    req.setGroupId(v);
                })
        );
        builder.withRequestField("role_id",
                LocationType.Path,
                FieldExistence.NON_NULL_NON_EMPTY,
                String.class,
                f -> f.withMarshaller(KeystoneRemoveDomainPermissionFromGroupRequest::getRoleId, (req, v) -> {
                    req.setRoleId(v);
                })
        );

        // response

        return builder.build();

    }

    public static final HttpRequestDef<KeystoneRemoveProjectPermissionFromGroupRequest, KeystoneRemoveProjectPermissionFromGroupResponse> keystoneRemoveProjectPermissionFromGroup = genForkeystoneRemoveProjectPermissionFromGroup();

    private static HttpRequestDef<KeystoneRemoveProjectPermissionFromGroupRequest, KeystoneRemoveProjectPermissionFromGroupResponse> genForkeystoneRemoveProjectPermissionFromGroup() {
        // basic
        HttpRequestDef.Builder<KeystoneRemoveProjectPermissionFromGroupRequest, KeystoneRemoveProjectPermissionFromGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, KeystoneRemoveProjectPermissionFromGroupRequest.class, KeystoneRemoveProjectPermissionFromGroupResponse.class)
                .withUri("/v3/projects/{project_id}/groups/{group_id}/roles/{role_id}");

        // requests
        builder.withRequestField("project_id",
                LocationType.Path,
                FieldExistence.NON_NULL_NON_EMPTY,
                String.class,
                f -> f.withMarshaller(KeystoneRemoveProjectPermissionFromGroupRequest::getProjectId, (req, v) -> {
                    req.setProjectId(v);
                })
        );
        builder.withRequestField("group_id",
                LocationType.Path,
                FieldExistence.NON_NULL_NON_EMPTY,
                String.class,
                f -> f.withMarshaller(KeystoneRemoveProjectPermissionFromGroupRequest::getGroupId, (req, v) -> {
                    req.setGroupId(v);
                })
        );
        builder.withRequestField("role_id",
                LocationType.Path,
                FieldExistence.NON_NULL_NON_EMPTY,
                String.class,
                f -> f.withMarshaller(KeystoneRemoveProjectPermissionFromGroupRequest::getRoleId, (req, v) -> {
                    req.setRoleId(v);
                })
        );

        // response

        return builder.build();

    }

    public static final HttpRequestDef<KeystoneRemoveUserFromGroupRequest, KeystoneRemoveUserFromGroupResponse> keystoneRemoveUserFromGroup = genForkeystoneRemoveUserFromGroup();

    private static HttpRequestDef<KeystoneRemoveUserFromGroupRequest, KeystoneRemoveUserFromGroupResponse> genForkeystoneRemoveUserFromGroup() {
        // basic
        HttpRequestDef.Builder<KeystoneRemoveUserFromGroupRequest, KeystoneRemoveUserFromGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, KeystoneRemoveUserFromGroupRequest.class, KeystoneRemoveUserFromGroupResponse.class)
                .withUri("/v3/groups/{group_id}/users/{user_id}");

        // requests
        builder.withRequestField("group_id",
                LocationType.Path,
                FieldExistence.NON_NULL_NON_EMPTY,
                String.class,
                f -> f.withMarshaller(KeystoneRemoveUserFromGroupRequest::getGroupId, (req, v) -> {
                    req.setGroupId(v);
                })
        );
        builder.withRequestField("user_id",
                LocationType.Path,
                FieldExistence.NON_NULL_NON_EMPTY,
                String.class,
                f -> f.withMarshaller(KeystoneRemoveUserFromGroupRequest::getUserId, (req, v) -> {
                    req.setUserId(v);
                })
        );

        // response

        return builder.build();

    }

    public static final HttpRequestDef<KeystoneShowGroupRequest, KeystoneShowGroupResponse> keystoneShowGroup = genForkeystoneShowGroup();

    private static HttpRequestDef<KeystoneShowGroupRequest, KeystoneShowGroupResponse> genForkeystoneShowGroup() {
        // basic
        HttpRequestDef.Builder<KeystoneShowGroupRequest, KeystoneShowGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, KeystoneShowGroupRequest.class, KeystoneShowGroupResponse.class)
                .withUri("/v3/groups/{group_id}");

        // requests
        builder.withRequestField("group_id",
                LocationType.Path,
                FieldExistence.NON_NULL_NON_EMPTY,
                String.class,
                f -> f.withMarshaller(KeystoneShowGroupRequest::getGroupId, (req, v) -> {
                    req.setGroupId(v);
                })
        );

        // response

        return builder.build();

    }

    public static final HttpRequestDef<KeystoneShowPermissionRequest, KeystoneShowPermissionResponse> keystoneShowPermission = genForkeystoneShowPermission();

    private static HttpRequestDef<KeystoneShowPermissionRequest, KeystoneShowPermissionResponse> genForkeystoneShowPermission() {
        // basic
        HttpRequestDef.Builder<KeystoneShowPermissionRequest, KeystoneShowPermissionResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, KeystoneShowPermissionRequest.class, KeystoneShowPermissionResponse.class)
                .withUri("/v3/roles/{role_id}");

        // requests
        builder.withRequestField("role_id",
                LocationType.Path,
                FieldExistence.NON_NULL_NON_EMPTY,
                String.class,
                f -> f.withMarshaller(KeystoneShowPermissionRequest::getRoleId, (req, v) -> {
                    req.setRoleId(v);
                })
        );

        // response

        return builder.build();

    }

    public static final HttpRequestDef<KeystoneShowUserRequest, KeystoneShowUserResponse> keystoneShowUser = genForkeystoneShowUser();

    private static HttpRequestDef<KeystoneShowUserRequest, KeystoneShowUserResponse> genForkeystoneShowUser() {
        // basic
        HttpRequestDef.Builder<KeystoneShowUserRequest, KeystoneShowUserResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, KeystoneShowUserRequest.class, KeystoneShowUserResponse.class)
                .withUri("/v3/users/{user_id}");

        // requests
        builder.withRequestField("user_id",
                LocationType.Path,
                FieldExistence.NON_NULL_NON_EMPTY,
                String.class,
                f -> f.withMarshaller(KeystoneShowUserRequest::getUserId, (req, v) -> {
                    req.setUserId(v);
                })
        );

        // response

        return builder.build();

    }

    public static final HttpRequestDef<KeystoneUpdateGroupRequest, KeystoneUpdateGroupResponse> keystoneUpdateGroup = genForkeystoneUpdateGroup();

    private static HttpRequestDef<KeystoneUpdateGroupRequest, KeystoneUpdateGroupResponse> genForkeystoneUpdateGroup() {
        // basic
        HttpRequestDef.Builder<KeystoneUpdateGroupRequest, KeystoneUpdateGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.PATCH, KeystoneUpdateGroupRequest.class, KeystoneUpdateGroupResponse.class)
                .withUri("/v3/groups/{group_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("group_id",
                LocationType.Path,
                FieldExistence.NON_NULL_NON_EMPTY,
                String.class,
                f -> f.withMarshaller(KeystoneUpdateGroupRequest::getGroupId, (req, v) -> {
                    req.setGroupId(v);
                })
        );
        builder.withRequestField("body",
                LocationType.Body,
                FieldExistence.NON_NULL_NON_EMPTY,
                KeystoneUpdateGroupRequestBody.class,
                f -> f.withMarshaller(KeystoneUpdateGroupRequest::getBody, (req, v) -> {
                    req.setBody(v);
                })
        );

        // response

        return builder.build();

    }

    public static final HttpRequestDef<KeystoneUpdateUserByAdminRequest, KeystoneUpdateUserByAdminResponse> keystoneUpdateUserByAdmin = genForkeystoneUpdateUserByAdmin();

    private static HttpRequestDef<KeystoneUpdateUserByAdminRequest, KeystoneUpdateUserByAdminResponse> genForkeystoneUpdateUserByAdmin() {
        // basic
        HttpRequestDef.Builder<KeystoneUpdateUserByAdminRequest, KeystoneUpdateUserByAdminResponse> builder =
            HttpRequestDef.builder(HttpMethod.PATCH, KeystoneUpdateUserByAdminRequest.class, KeystoneUpdateUserByAdminResponse.class)
                .withUri("/v3/users/{user_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("user_id",
                LocationType.Path,
                FieldExistence.NON_NULL_NON_EMPTY,
                String.class,
                f -> f.withMarshaller(KeystoneUpdateUserByAdminRequest::getUserId, (req, v) -> {
                    req.setUserId(v);
                })
        );
        builder.withRequestField("body",
                LocationType.Body,
                FieldExistence.NON_NULL_NON_EMPTY,
                KeystoneUpdateUserByAdminRequestBody.class,
                f -> f.withMarshaller(KeystoneUpdateUserByAdminRequest::getBody, (req, v) -> {
                    req.setBody(v);
                })
        );

        // response

        return builder.build();

    }

    public static final HttpRequestDef<KeystoneUpdateUserPasswordRequest, KeystoneUpdateUserPasswordResponse> keystoneUpdateUserPassword = genForkeystoneUpdateUserPassword();

    private static HttpRequestDef<KeystoneUpdateUserPasswordRequest, KeystoneUpdateUserPasswordResponse> genForkeystoneUpdateUserPassword() {
        // basic
        HttpRequestDef.Builder<KeystoneUpdateUserPasswordRequest, KeystoneUpdateUserPasswordResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, KeystoneUpdateUserPasswordRequest.class, KeystoneUpdateUserPasswordResponse.class)
                .withUri("/v3/users/{user_id}/password")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("user_id",
                LocationType.Path,
                FieldExistence.NON_NULL_NON_EMPTY,
                String.class,
                f -> f.withMarshaller(KeystoneUpdateUserPasswordRequest::getUserId, (req, v) -> {
                    req.setUserId(v);
                })
        );
        builder.withRequestField("body",
                LocationType.Body,
                FieldExistence.NON_NULL_NON_EMPTY,
                KeystoneUpdateUserPasswordRequestBody.class,
                f -> f.withMarshaller(KeystoneUpdateUserPasswordRequest::getBody, (req, v) -> {
                    req.setBody(v);
                })
        );

        // response

        return builder.build();

    }

    public static final HttpRequestDef<ListAgenciesRequest, ListAgenciesResponse> listAgencies = genForlistAgencies();

    private static HttpRequestDef<ListAgenciesRequest, ListAgenciesResponse> genForlistAgencies() {
        // basic
        HttpRequestDef.Builder<ListAgenciesRequest, ListAgenciesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAgenciesRequest.class, ListAgenciesResponse.class)
                .withUri("/v3.0/OS-AGENCY/agencies");

        // requests
        builder.withRequestField("domain_id",
                LocationType.Query,
                FieldExistence.NON_NULL_NON_EMPTY,
                String.class,
                f -> f.withMarshaller(ListAgenciesRequest::getDomainId, (req, v) -> {
                    req.setDomainId(v);
                })
        );
        builder.withRequestField("trust_domain_id",
                LocationType.Query,
                FieldExistence.NULL_IGNORE,
                String.class,
                f -> f.withMarshaller(ListAgenciesRequest::getTrustDomainId, (req, v) -> {
                    req.setTrustDomainId(v);
                })
        );
        builder.withRequestField("name",
                LocationType.Query,
                FieldExistence.NULL_IGNORE,
                String.class,
                f -> f.withMarshaller(ListAgenciesRequest::getName, (req, v) -> {
                    req.setName(v);
                })
        );

        // response

        return builder.build();

    }

    public static final HttpRequestDef<ListDomainPermissionsForAgencyRequest, ListDomainPermissionsForAgencyResponse> listDomainPermissionsForAgency = genForlistDomainPermissionsForAgency();

    private static HttpRequestDef<ListDomainPermissionsForAgencyRequest, ListDomainPermissionsForAgencyResponse> genForlistDomainPermissionsForAgency() {
        // basic
        HttpRequestDef.Builder<ListDomainPermissionsForAgencyRequest, ListDomainPermissionsForAgencyResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListDomainPermissionsForAgencyRequest.class, ListDomainPermissionsForAgencyResponse.class)
                .withUri("/v3.0/OS-AGENCY/domains/{domain_id}/agencies/{agency_id}/roles");

        // requests
        builder.withRequestField("domain_id",
                LocationType.Path,
                FieldExistence.NON_NULL_NON_EMPTY,
                String.class,
                f -> f.withMarshaller(ListDomainPermissionsForAgencyRequest::getDomainId, (req, v) -> {
                    req.setDomainId(v);
                })
        );
        builder.withRequestField("agency_id",
                LocationType.Path,
                FieldExistence.NON_NULL_NON_EMPTY,
                String.class,
                f -> f.withMarshaller(ListDomainPermissionsForAgencyRequest::getAgencyId, (req, v) -> {
                    req.setAgencyId(v);
                })
        );

        // response

        return builder.build();

    }

    public static final HttpRequestDef<ListProjectPermissionsForAgencyRequest, ListProjectPermissionsForAgencyResponse> listProjectPermissionsForAgency = genForlistProjectPermissionsForAgency();

    private static HttpRequestDef<ListProjectPermissionsForAgencyRequest, ListProjectPermissionsForAgencyResponse> genForlistProjectPermissionsForAgency() {
        // basic
        HttpRequestDef.Builder<ListProjectPermissionsForAgencyRequest, ListProjectPermissionsForAgencyResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListProjectPermissionsForAgencyRequest.class, ListProjectPermissionsForAgencyResponse.class)
                .withUri("/v3.0/OS-AGENCY/projects/{project_id}/agencies/{agency_id}/roles");

        // requests
        builder.withRequestField("project_id",
                LocationType.Path,
                FieldExistence.NON_NULL_NON_EMPTY,
                String.class,
                f -> f.withMarshaller(ListProjectPermissionsForAgencyRequest::getProjectId, (req, v) -> {
                    req.setProjectId(v);
                })
        );
        builder.withRequestField("agency_id",
                LocationType.Path,
                FieldExistence.NON_NULL_NON_EMPTY,
                String.class,
                f -> f.withMarshaller(ListProjectPermissionsForAgencyRequest::getAgencyId, (req, v) -> {
                    req.setAgencyId(v);
                })
        );

        // response

        return builder.build();

    }

    public static final HttpRequestDef<RemoveDomainPermissionFromAgencyRequest, RemoveDomainPermissionFromAgencyResponse> removeDomainPermissionFromAgency = genForremoveDomainPermissionFromAgency();

    private static HttpRequestDef<RemoveDomainPermissionFromAgencyRequest, RemoveDomainPermissionFromAgencyResponse> genForremoveDomainPermissionFromAgency() {
        // basic
        HttpRequestDef.Builder<RemoveDomainPermissionFromAgencyRequest, RemoveDomainPermissionFromAgencyResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, RemoveDomainPermissionFromAgencyRequest.class, RemoveDomainPermissionFromAgencyResponse.class)
                .withUri("/v3.0/OS-AGENCY/domains/{domain_id}/agencies/{agency_id}/roles/{role_id}");

        // requests
        builder.withRequestField("domain_id",
                LocationType.Path,
                FieldExistence.NON_NULL_NON_EMPTY,
                String.class,
                f -> f.withMarshaller(RemoveDomainPermissionFromAgencyRequest::getDomainId, (req, v) -> {
                    req.setDomainId(v);
                })
        );
        builder.withRequestField("agency_id",
                LocationType.Path,
                FieldExistence.NON_NULL_NON_EMPTY,
                String.class,
                f -> f.withMarshaller(RemoveDomainPermissionFromAgencyRequest::getAgencyId, (req, v) -> {
                    req.setAgencyId(v);
                })
        );
        builder.withRequestField("role_id",
                LocationType.Path,
                FieldExistence.NON_NULL_NON_EMPTY,
                String.class,
                f -> f.withMarshaller(RemoveDomainPermissionFromAgencyRequest::getRoleId, (req, v) -> {
                    req.setRoleId(v);
                })
        );

        // response

        return builder.build();

    }

    public static final HttpRequestDef<RemoveProjectPermissionFromAgencyRequest, RemoveProjectPermissionFromAgencyResponse> removeProjectPermissionFromAgency = genForremoveProjectPermissionFromAgency();

    private static HttpRequestDef<RemoveProjectPermissionFromAgencyRequest, RemoveProjectPermissionFromAgencyResponse> genForremoveProjectPermissionFromAgency() {
        // basic
        HttpRequestDef.Builder<RemoveProjectPermissionFromAgencyRequest, RemoveProjectPermissionFromAgencyResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, RemoveProjectPermissionFromAgencyRequest.class, RemoveProjectPermissionFromAgencyResponse.class)
                .withUri("/v3.0/OS-AGENCY/projects/{project_id}/agencies/{agency_id}/roles/{role_id}");

        // requests
        builder.withRequestField("project_id",
                LocationType.Path,
                FieldExistence.NON_NULL_NON_EMPTY,
                String.class,
                f -> f.withMarshaller(RemoveProjectPermissionFromAgencyRequest::getProjectId, (req, v) -> {
                    req.setProjectId(v);
                })
        );
        builder.withRequestField("agency_id",
                LocationType.Path,
                FieldExistence.NON_NULL_NON_EMPTY,
                String.class,
                f -> f.withMarshaller(RemoveProjectPermissionFromAgencyRequest::getAgencyId, (req, v) -> {
                    req.setAgencyId(v);
                })
        );
        builder.withRequestField("role_id",
                LocationType.Path,
                FieldExistence.NON_NULL_NON_EMPTY,
                String.class,
                f -> f.withMarshaller(RemoveProjectPermissionFromAgencyRequest::getRoleId, (req, v) -> {
                    req.setRoleId(v);
                })
        );

        // response

        return builder.build();

    }

    public static final HttpRequestDef<ShowAgencyRequest, ShowAgencyResponse> showAgency = genForshowAgency();

    private static HttpRequestDef<ShowAgencyRequest, ShowAgencyResponse> genForshowAgency() {
        // basic
        HttpRequestDef.Builder<ShowAgencyRequest, ShowAgencyResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowAgencyRequest.class, ShowAgencyResponse.class)
                .withUri("/v3.0/OS-AGENCY/agencies/{agency_id}");

        // requests
        builder.withRequestField("agency_id",
                LocationType.Path,
                FieldExistence.NON_NULL_NON_EMPTY,
                String.class,
                f -> f.withMarshaller(ShowAgencyRequest::getAgencyId, (req, v) -> {
                    req.setAgencyId(v);
                })
        );

        // response

        return builder.build();

    }

    public static final HttpRequestDef<UpdateAgencyRequest, UpdateAgencyResponse> updateAgency = genForupdateAgency();

    private static HttpRequestDef<UpdateAgencyRequest, UpdateAgencyResponse> genForupdateAgency() {
        // basic
        HttpRequestDef.Builder<UpdateAgencyRequest, UpdateAgencyResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateAgencyRequest.class, UpdateAgencyResponse.class)
                .withUri("/v3.0/OS-AGENCY/agencies/{agency_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("agency_id",
                LocationType.Path,
                FieldExistence.NON_NULL_NON_EMPTY,
                String.class,
                f -> f.withMarshaller(UpdateAgencyRequest::getAgencyId, (req, v) -> {
                    req.setAgencyId(v);
                })
        );
        builder.withRequestField("body",
                LocationType.Body,
                FieldExistence.NON_NULL_NON_EMPTY,
                UpdateAgencyRequestBody.class,
                f -> f.withMarshaller(UpdateAgencyRequest::getBody, (req, v) -> {
                    req.setBody(v);
                })
        );

        // response

        return builder.build();

    }

    public static final HttpRequestDef<CreateTemporaryAccessKeyByAgencyRequest, CreateTemporaryAccessKeyByAgencyResponse> createTemporaryAccessKeyByAgency = genForcreateTemporaryAccessKeyByAgency();

    private static HttpRequestDef<CreateTemporaryAccessKeyByAgencyRequest, CreateTemporaryAccessKeyByAgencyResponse> genForcreateTemporaryAccessKeyByAgency() {
        // basic
        HttpRequestDef.Builder<CreateTemporaryAccessKeyByAgencyRequest, CreateTemporaryAccessKeyByAgencyResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateTemporaryAccessKeyByAgencyRequest.class, CreateTemporaryAccessKeyByAgencyResponse.class)
                .withUri("/v3.0/OS-CREDENTIAL/securitytokens")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("body",
                LocationType.Body,
                FieldExistence.NON_NULL_NON_EMPTY,
                CreateTemporaryAccessKeyByAgencyRequestBody.class,
                f -> f.withMarshaller(CreateTemporaryAccessKeyByAgencyRequest::getBody, (req, v) -> {
                    req.setBody(v);
                })
        );

        // response

        return builder.build();

    }

    public static final HttpRequestDef<CreateTemporaryAccessKeyByTokenRequest, CreateTemporaryAccessKeyByTokenResponse> createTemporaryAccessKeyByToken = genForcreateTemporaryAccessKeyByToken();

    private static HttpRequestDef<CreateTemporaryAccessKeyByTokenRequest, CreateTemporaryAccessKeyByTokenResponse> genForcreateTemporaryAccessKeyByToken() {
        // basic
        HttpRequestDef.Builder<CreateTemporaryAccessKeyByTokenRequest, CreateTemporaryAccessKeyByTokenResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateTemporaryAccessKeyByTokenRequest.class, CreateTemporaryAccessKeyByTokenResponse.class)
                .withUri("/v3.0/OS-CREDENTIAL/securitytokens")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("body",
                LocationType.Body,
                FieldExistence.NON_NULL_NON_EMPTY,
                CreateTemporaryAccessKeyByTokenRequestBody.class,
                f -> f.withMarshaller(CreateTemporaryAccessKeyByTokenRequest::getBody, (req, v) -> {
                    req.setBody(v);
                })
        );

        // response

        return builder.build();

    }

}

