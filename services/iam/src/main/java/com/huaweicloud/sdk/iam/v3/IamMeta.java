package com.huaweicloud.sdk.iam.v3;

import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.iam.v3.model.*;
import java.util.List;
import java.util.Map;
import java.time.OffsetDateTime;

@SuppressWarnings("unchecked")
public class IamMeta {

    public static final HttpRequestDef<AssociateAgencyWithAllProjectsPermissionRequest, AssociateAgencyWithAllProjectsPermissionResponse> associateAgencyWithAllProjectsPermission = genForassociateAgencyWithAllProjectsPermission();

    private static HttpRequestDef<AssociateAgencyWithAllProjectsPermissionRequest, AssociateAgencyWithAllProjectsPermissionResponse> genForassociateAgencyWithAllProjectsPermission() {
        // basic
        HttpRequestDef.Builder<AssociateAgencyWithAllProjectsPermissionRequest, AssociateAgencyWithAllProjectsPermissionResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, AssociateAgencyWithAllProjectsPermissionRequest.class, AssociateAgencyWithAllProjectsPermissionResponse.class)
                .withUri("/v3.0/OS-INHERIT/domains/{domain_id}/agencies/{agency_id}/roles/{role_id}/inherited_to_projects")
                .withContentType("application/json");

        // requests
        builder.withRequestField("agency_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(AssociateAgencyWithAllProjectsPermissionRequest::getAgencyId, (req, v) -> {
                req.setAgencyId(v);
            })
        );
        builder.withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(AssociateAgencyWithAllProjectsPermissionRequest::getDomainId, (req, v) -> {
                req.setDomainId(v);
            })
        );
        builder.withRequestField("role_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(AssociateAgencyWithAllProjectsPermissionRequest::getRoleId, (req, v) -> {
                req.setRoleId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AssociateAgencyWithDomainPermissionRequest, AssociateAgencyWithDomainPermissionResponse> associateAgencyWithDomainPermission = genForassociateAgencyWithDomainPermission();

    private static HttpRequestDef<AssociateAgencyWithDomainPermissionRequest, AssociateAgencyWithDomainPermissionResponse> genForassociateAgencyWithDomainPermission() {
        // basic
        HttpRequestDef.Builder<AssociateAgencyWithDomainPermissionRequest, AssociateAgencyWithDomainPermissionResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, AssociateAgencyWithDomainPermissionRequest.class, AssociateAgencyWithDomainPermissionResponse.class)
                .withUri("/v3.0/OS-AGENCY/domains/{domain_id}/agencies/{agency_id}/roles/{role_id}")
                .withContentType("application/json");

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
                .withUri("/v3.0/OS-AGENCY/projects/{project_id}/agencies/{agency_id}/roles/{role_id}")
                .withContentType("application/json");

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

    public static final HttpRequestDef<CheckAllProjectsPermissionForAgencyRequest, CheckAllProjectsPermissionForAgencyResponse> checkAllProjectsPermissionForAgency = genForcheckAllProjectsPermissionForAgency();

    private static HttpRequestDef<CheckAllProjectsPermissionForAgencyRequest, CheckAllProjectsPermissionForAgencyResponse> genForcheckAllProjectsPermissionForAgency() {
        // basic
        HttpRequestDef.Builder<CheckAllProjectsPermissionForAgencyRequest, CheckAllProjectsPermissionForAgencyResponse> builder =
            HttpRequestDef.builder(HttpMethod.HEAD, CheckAllProjectsPermissionForAgencyRequest.class, CheckAllProjectsPermissionForAgencyResponse.class)
                .withUri("/v3.0/OS-INHERIT/domains/{domain_id}/agencies/{agency_id}/roles/{role_id}/inherited_to_projects")
                .withContentType("application/json");

        // requests
        builder.withRequestField("agency_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(CheckAllProjectsPermissionForAgencyRequest::getAgencyId, (req, v) -> {
                req.setAgencyId(v);
            })
        );
        builder.withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(CheckAllProjectsPermissionForAgencyRequest::getDomainId, (req, v) -> {
                req.setDomainId(v);
            })
        );
        builder.withRequestField("role_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(CheckAllProjectsPermissionForAgencyRequest::getRoleId, (req, v) -> {
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
                .withUri("/v3.0/OS-AGENCY/domains/{domain_id}/agencies/{agency_id}/roles/{role_id}")
                .withContentType("application/json");

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
                .withUri("/v3.0/OS-AGENCY/projects/{project_id}/agencies/{agency_id}/roles/{role_id}")
                .withContentType("application/json");

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

    public static final HttpRequestDef<CreateAgencyCustomPolicyRequest, CreateAgencyCustomPolicyResponse> createAgencyCustomPolicy = genForcreateAgencyCustomPolicy();

    private static HttpRequestDef<CreateAgencyCustomPolicyRequest, CreateAgencyCustomPolicyResponse> genForcreateAgencyCustomPolicy() {
        // basic
        HttpRequestDef.Builder<CreateAgencyCustomPolicyRequest, CreateAgencyCustomPolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateAgencyCustomPolicyRequest.class, CreateAgencyCustomPolicyResponse.class)
                .withUri("/v3.0/OS-ROLE/roles")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            CreateAgencyCustomPolicyRequestBody.class,
            f -> f.withMarshaller(CreateAgencyCustomPolicyRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateCloudServiceCustomPolicyRequest, CreateCloudServiceCustomPolicyResponse> createCloudServiceCustomPolicy = genForcreateCloudServiceCustomPolicy();

    private static HttpRequestDef<CreateCloudServiceCustomPolicyRequest, CreateCloudServiceCustomPolicyResponse> genForcreateCloudServiceCustomPolicy() {
        // basic
        HttpRequestDef.Builder<CreateCloudServiceCustomPolicyRequest, CreateCloudServiceCustomPolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateCloudServiceCustomPolicyRequest.class, CreateCloudServiceCustomPolicyResponse.class)
                .withUri("/v3.0/OS-ROLE/roles")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            CreateCloudServiceCustomPolicyRequestBody.class,
            f -> f.withMarshaller(CreateCloudServiceCustomPolicyRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateLoginTokenRequest, CreateLoginTokenResponse> createLoginToken = genForcreateLoginToken();

    private static HttpRequestDef<CreateLoginTokenRequest, CreateLoginTokenResponse> genForcreateLoginToken() {
        // basic
        HttpRequestDef.Builder<CreateLoginTokenRequest, CreateLoginTokenResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateLoginTokenRequest.class, CreateLoginTokenResponse.class)
                .withUri("/v3.0/OS-AUTH/securitytoken/logintokens")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            CreateLoginTokenRequestBody.class,
            f -> f.withMarshaller(CreateLoginTokenRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        builder.withResponseField(
            "X-Subject-LoginToken",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(
                CreateLoginTokenResponse::getXSubjectLoginToken,
                CreateLoginTokenResponse::setXSubjectLoginToken)
        );
        return builder.build();
    }

    public static final HttpRequestDef<CreateMetadataRequest, CreateMetadataResponse> createMetadata = genForcreateMetadata();

    private static HttpRequestDef<CreateMetadataRequest, CreateMetadataResponse> genForcreateMetadata() {
        // basic
        HttpRequestDef.Builder<CreateMetadataRequest, CreateMetadataResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateMetadataRequest.class, CreateMetadataResponse.class)
                .withUri("/v3-ext/OS-FEDERATION/identity_providers/{idp_id}/protocols/{protocol_id}/metadata")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("idp_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(CreateMetadataRequest::getIdpId, (req, v) -> {
                req.setIdpId(v);
            })
        );
        builder.withRequestField("protocol_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(CreateMetadataRequest::getProtocolId, (req, v) -> {
                req.setProtocolId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            CreateMetadataRequestBody.class,
            f -> f.withMarshaller(CreateMetadataRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateUnscopeTokenByIdpInitiatedRequest, CreateUnscopeTokenByIdpInitiatedResponse> createUnscopeTokenByIdpInitiated = genForcreateUnscopeTokenByIdpInitiated();

    private static HttpRequestDef<CreateUnscopeTokenByIdpInitiatedRequest, CreateUnscopeTokenByIdpInitiatedResponse> genForcreateUnscopeTokenByIdpInitiated() {
        // basic
        HttpRequestDef.Builder<CreateUnscopeTokenByIdpInitiatedRequest, CreateUnscopeTokenByIdpInitiatedResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateUnscopeTokenByIdpInitiatedRequest.class, CreateUnscopeTokenByIdpInitiatedResponse.class)
                .withUri("/v3.0/OS-FEDERATION/tokens")
                .withContentType("application/x-www-form-urlencoded");

        // requests
        builder.withRequestField("X-Idp-Id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(CreateUnscopeTokenByIdpInitiatedRequest::getXIdpId, (req, v) -> {
                req.setXIdpId(v);
            })
        );

        // response

        builder.withResponseField(
            "X-Subject-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(
                CreateUnscopeTokenByIdpInitiatedResponse::getXSubjectToken,
                CreateUnscopeTokenByIdpInitiatedResponse::setXSubjectToken)
        );
        return builder.build();
    }

    public static final HttpRequestDef<DeleteAgencyRequest, DeleteAgencyResponse> deleteAgency = genFordeleteAgency();

    private static HttpRequestDef<DeleteAgencyRequest, DeleteAgencyResponse> genFordeleteAgency() {
        // basic
        HttpRequestDef.Builder<DeleteAgencyRequest, DeleteAgencyResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteAgencyRequest.class, DeleteAgencyResponse.class)
                .withUri("/v3.0/OS-AGENCY/agencies/{agency_id}")
                .withContentType("application/json");

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

    public static final HttpRequestDef<DeleteCustomPolicyRequest, DeleteCustomPolicyResponse> deleteCustomPolicy = genFordeleteCustomPolicy();

    private static HttpRequestDef<DeleteCustomPolicyRequest, DeleteCustomPolicyResponse> genFordeleteCustomPolicy() {
        // basic
        HttpRequestDef.Builder<DeleteCustomPolicyRequest, DeleteCustomPolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteCustomPolicyRequest.class, DeleteCustomPolicyResponse.class)
                .withUri("/v3.0/OS-ROLE/roles/{role_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("role_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteCustomPolicyRequest::getRoleId, (req, v) -> {
                req.setRoleId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteDomainGroupInheritedRoleRequest, DeleteDomainGroupInheritedRoleResponse> deleteDomainGroupInheritedRole = genFordeleteDomainGroupInheritedRole();

    private static HttpRequestDef<DeleteDomainGroupInheritedRoleRequest, DeleteDomainGroupInheritedRoleResponse> genFordeleteDomainGroupInheritedRole() {
        // basic
        HttpRequestDef.Builder<DeleteDomainGroupInheritedRoleRequest, DeleteDomainGroupInheritedRoleResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteDomainGroupInheritedRoleRequest.class, DeleteDomainGroupInheritedRoleResponse.class)
                .withUri("/v3/OS-INHERIT/domains/{domain_id}/groups/{group_id}/roles/{role_id}/inherited_to_projects")
                .withContentType("application/json");

        // requests
        builder.withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteDomainGroupInheritedRoleRequest::getDomainId, (req, v) -> {
                req.setDomainId(v);
            })
        );
        builder.withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteDomainGroupInheritedRoleRequest::getGroupId, (req, v) -> {
                req.setGroupId(v);
            })
        );
        builder.withRequestField("role_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteDomainGroupInheritedRoleRequest::getRoleId, (req, v) -> {
                req.setRoleId(v);
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
                .withUri("/v3/groups/{group_id}/users/{user_id}")
                .withContentType("application/json");

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
                .withUri("/v3/domains/{domain_id}/groups/{group_id}/roles/{role_id}")
                .withContentType("application/json");

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
                .withUri("/v3/projects/{project_id}/groups/{group_id}/roles/{role_id}")
                .withContentType("application/json");

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
                .withUri("/v3/domains/{domain_id}/groups/{group_id}/roles/{role_id}")
                .withContentType("application/json");

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
                .withUri("/v3/projects/{project_id}/groups/{group_id}/roles/{role_id}")
                .withContentType("application/json");

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
                .withUri("/v3/groups/{group_id}/users/{user_id}")
                .withContentType("application/json");

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

    public static final HttpRequestDef<KeystoneCheckroleForGroupRequest, KeystoneCheckroleForGroupResponse> keystoneCheckroleForGroup = genForkeystoneCheckroleForGroup();

    private static HttpRequestDef<KeystoneCheckroleForGroupRequest, KeystoneCheckroleForGroupResponse> genForkeystoneCheckroleForGroup() {
        // basic
        HttpRequestDef.Builder<KeystoneCheckroleForGroupRequest, KeystoneCheckroleForGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.HEAD, KeystoneCheckroleForGroupRequest.class, KeystoneCheckroleForGroupResponse.class)
                .withUri("/v3/OS-INHERIT/domains/{domain_id}/groups/{group_id}/roles/{role_id}/inherited_to_projects")
                .withContentType("application/json");

        // requests
        builder.withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(KeystoneCheckroleForGroupRequest::getDomainId, (req, v) -> {
                req.setDomainId(v);
            })
        );
        builder.withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(KeystoneCheckroleForGroupRequest::getGroupId, (req, v) -> {
                req.setGroupId(v);
            })
        );
        builder.withRequestField("role_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(KeystoneCheckroleForGroupRequest::getRoleId, (req, v) -> {
                req.setRoleId(v);
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

    public static final HttpRequestDef<KeystoneCreateIdentityProviderRequest, KeystoneCreateIdentityProviderResponse> keystoneCreateIdentityProvider = genForkeystoneCreateIdentityProvider();

    private static HttpRequestDef<KeystoneCreateIdentityProviderRequest, KeystoneCreateIdentityProviderResponse> genForkeystoneCreateIdentityProvider() {
        // basic
        HttpRequestDef.Builder<KeystoneCreateIdentityProviderRequest, KeystoneCreateIdentityProviderResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, KeystoneCreateIdentityProviderRequest.class, KeystoneCreateIdentityProviderResponse.class)
                .withUri("/v3/OS-FEDERATION/identity_providers/{id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(KeystoneCreateIdentityProviderRequest::getId, (req, v) -> {
                req.setId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            KeystoneCreateIdentityProviderRequestBody.class,
            f -> f.withMarshaller(KeystoneCreateIdentityProviderRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<KeystoneCreateMappingRequest, KeystoneCreateMappingResponse> keystoneCreateMapping = genForkeystoneCreateMapping();

    private static HttpRequestDef<KeystoneCreateMappingRequest, KeystoneCreateMappingResponse> genForkeystoneCreateMapping() {
        // basic
        HttpRequestDef.Builder<KeystoneCreateMappingRequest, KeystoneCreateMappingResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, KeystoneCreateMappingRequest.class, KeystoneCreateMappingResponse.class)
                .withUri("/v3/OS-FEDERATION/mappings/{id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(KeystoneCreateMappingRequest::getId, (req, v) -> {
                req.setId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            KeystoneCreateMappingRequestBody.class,
            f -> f.withMarshaller(KeystoneCreateMappingRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<KeystoneCreateProjectRequest, KeystoneCreateProjectResponse> keystoneCreateProject = genForkeystoneCreateProject();

    private static HttpRequestDef<KeystoneCreateProjectRequest, KeystoneCreateProjectResponse> genForkeystoneCreateProject() {
        // basic
        HttpRequestDef.Builder<KeystoneCreateProjectRequest, KeystoneCreateProjectResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, KeystoneCreateProjectRequest.class, KeystoneCreateProjectResponse.class)
                .withUri("/v3/projects")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            KeystoneCreateProjectRequestBody.class,
            f -> f.withMarshaller(KeystoneCreateProjectRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<KeystoneCreateProtocolRequest, KeystoneCreateProtocolResponse> keystoneCreateProtocol = genForkeystoneCreateProtocol();

    private static HttpRequestDef<KeystoneCreateProtocolRequest, KeystoneCreateProtocolResponse> genForkeystoneCreateProtocol() {
        // basic
        HttpRequestDef.Builder<KeystoneCreateProtocolRequest, KeystoneCreateProtocolResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, KeystoneCreateProtocolRequest.class, KeystoneCreateProtocolResponse.class)
                .withUri("/v3/OS-FEDERATION/identity_providers/{idp_id}/protocols/{protocol_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("idp_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(KeystoneCreateProtocolRequest::getIdpId, (req, v) -> {
                req.setIdpId(v);
            })
        );
        builder.withRequestField("protocol_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(KeystoneCreateProtocolRequest::getProtocolId, (req, v) -> {
                req.setProtocolId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            KeystoneCreateProtocolRequestBody.class,
            f -> f.withMarshaller(KeystoneCreateProtocolRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<KeystoneCreateScopedTokenRequest, KeystoneCreateScopedTokenResponse> keystoneCreateScopedToken = genForkeystoneCreateScopedToken();

    private static HttpRequestDef<KeystoneCreateScopedTokenRequest, KeystoneCreateScopedTokenResponse> genForkeystoneCreateScopedToken() {
        // basic
        HttpRequestDef.Builder<KeystoneCreateScopedTokenRequest, KeystoneCreateScopedTokenResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, KeystoneCreateScopedTokenRequest.class, KeystoneCreateScopedTokenResponse.class)
                .withUri("/v3/auth/tokens")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            KeystoneCreateScopedTokenRequestBody.class,
            f -> f.withMarshaller(KeystoneCreateScopedTokenRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        builder.withResponseField(
            "X-Subject-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(
                KeystoneCreateScopedTokenResponse::getXSubjectToken,
                KeystoneCreateScopedTokenResponse::setXSubjectToken)
        );
        return builder.build();
    }

    public static final HttpRequestDef<KeystoneDeleteGroupRequest, KeystoneDeleteGroupResponse> keystoneDeleteGroup = genForkeystoneDeleteGroup();

    private static HttpRequestDef<KeystoneDeleteGroupRequest, KeystoneDeleteGroupResponse> genForkeystoneDeleteGroup() {
        // basic
        HttpRequestDef.Builder<KeystoneDeleteGroupRequest, KeystoneDeleteGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, KeystoneDeleteGroupRequest.class, KeystoneDeleteGroupResponse.class)
                .withUri("/v3/groups/{group_id}")
                .withContentType("application/json");

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

    public static final HttpRequestDef<KeystoneDeleteIdentityProviderRequest, KeystoneDeleteIdentityProviderResponse> keystoneDeleteIdentityProvider = genForkeystoneDeleteIdentityProvider();

    private static HttpRequestDef<KeystoneDeleteIdentityProviderRequest, KeystoneDeleteIdentityProviderResponse> genForkeystoneDeleteIdentityProvider() {
        // basic
        HttpRequestDef.Builder<KeystoneDeleteIdentityProviderRequest, KeystoneDeleteIdentityProviderResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, KeystoneDeleteIdentityProviderRequest.class, KeystoneDeleteIdentityProviderResponse.class)
                .withUri("/v3/OS-FEDERATION/identity_providers/{id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(KeystoneDeleteIdentityProviderRequest::getId, (req, v) -> {
                req.setId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<KeystoneDeleteMappingRequest, KeystoneDeleteMappingResponse> keystoneDeleteMapping = genForkeystoneDeleteMapping();

    private static HttpRequestDef<KeystoneDeleteMappingRequest, KeystoneDeleteMappingResponse> genForkeystoneDeleteMapping() {
        // basic
        HttpRequestDef.Builder<KeystoneDeleteMappingRequest, KeystoneDeleteMappingResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, KeystoneDeleteMappingRequest.class, KeystoneDeleteMappingResponse.class)
                .withUri("/v3/OS-FEDERATION/mappings/{id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(KeystoneDeleteMappingRequest::getId, (req, v) -> {
                req.setId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<KeystoneDeleteProtocolRequest, KeystoneDeleteProtocolResponse> keystoneDeleteProtocol = genForkeystoneDeleteProtocol();

    private static HttpRequestDef<KeystoneDeleteProtocolRequest, KeystoneDeleteProtocolResponse> genForkeystoneDeleteProtocol() {
        // basic
        HttpRequestDef.Builder<KeystoneDeleteProtocolRequest, KeystoneDeleteProtocolResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, KeystoneDeleteProtocolRequest.class, KeystoneDeleteProtocolResponse.class)
                .withUri("/v3/OS-FEDERATION/identity_providers/{idp_id}/protocols/{protocol_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("idp_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(KeystoneDeleteProtocolRequest::getIdpId, (req, v) -> {
                req.setIdpId(v);
            })
        );
        builder.withRequestField("protocol_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(KeystoneDeleteProtocolRequest::getProtocolId, (req, v) -> {
                req.setProtocolId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<KeystoneListAllProjectPermissionsForGroupRequest, KeystoneListAllProjectPermissionsForGroupResponse> keystoneListAllProjectPermissionsForGroup = genForkeystoneListAllProjectPermissionsForGroup();

    private static HttpRequestDef<KeystoneListAllProjectPermissionsForGroupRequest, KeystoneListAllProjectPermissionsForGroupResponse> genForkeystoneListAllProjectPermissionsForGroup() {
        // basic
        HttpRequestDef.Builder<KeystoneListAllProjectPermissionsForGroupRequest, KeystoneListAllProjectPermissionsForGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, KeystoneListAllProjectPermissionsForGroupRequest.class, KeystoneListAllProjectPermissionsForGroupResponse.class)
                .withUri("/v3/OS-INHERIT/domains/{domain_id}/groups/{group_id}/roles/inherited_to_projects")
                .withContentType("application/json");

        // requests
        builder.withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(KeystoneListAllProjectPermissionsForGroupRequest::getDomainId, (req, v) -> {
                req.setDomainId(v);
            })
        );
        builder.withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(KeystoneListAllProjectPermissionsForGroupRequest::getGroupId, (req, v) -> {
                req.setGroupId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<KeystoneListAuthDomainsRequest, KeystoneListAuthDomainsResponse> keystoneListAuthDomains = genForkeystoneListAuthDomains();

    private static HttpRequestDef<KeystoneListAuthDomainsRequest, KeystoneListAuthDomainsResponse> genForkeystoneListAuthDomains() {
        // basic
        HttpRequestDef.Builder<KeystoneListAuthDomainsRequest, KeystoneListAuthDomainsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, KeystoneListAuthDomainsRequest.class, KeystoneListAuthDomainsResponse.class)
                .withUri("/v3/auth/domains")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<KeystoneListAuthProjectsRequest, KeystoneListAuthProjectsResponse> keystoneListAuthProjects = genForkeystoneListAuthProjects();

    private static HttpRequestDef<KeystoneListAuthProjectsRequest, KeystoneListAuthProjectsResponse> genForkeystoneListAuthProjects() {
        // basic
        HttpRequestDef.Builder<KeystoneListAuthProjectsRequest, KeystoneListAuthProjectsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, KeystoneListAuthProjectsRequest.class, KeystoneListAuthProjectsResponse.class)
                .withUri("/v3/auth/projects")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<KeystoneListDomainPermissionsForGroupRequest, KeystoneListDomainPermissionsForGroupResponse> keystoneListDomainPermissionsForGroup = genForkeystoneListDomainPermissionsForGroup();

    private static HttpRequestDef<KeystoneListDomainPermissionsForGroupRequest, KeystoneListDomainPermissionsForGroupResponse> genForkeystoneListDomainPermissionsForGroup() {
        // basic
        HttpRequestDef.Builder<KeystoneListDomainPermissionsForGroupRequest, KeystoneListDomainPermissionsForGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, KeystoneListDomainPermissionsForGroupRequest.class, KeystoneListDomainPermissionsForGroupResponse.class)
                .withUri("/v3/domains/{domain_id}/groups/{group_id}/roles")
                .withContentType("application/json");

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

    public static final HttpRequestDef<KeystoneListEndpointsRequest, KeystoneListEndpointsResponse> keystoneListEndpoints = genForkeystoneListEndpoints();

    private static HttpRequestDef<KeystoneListEndpointsRequest, KeystoneListEndpointsResponse> genForkeystoneListEndpoints() {
        // basic
        HttpRequestDef.Builder<KeystoneListEndpointsRequest, KeystoneListEndpointsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, KeystoneListEndpointsRequest.class, KeystoneListEndpointsResponse.class)
                .withUri("/v3/endpoints")
                .withContentType("application/json");

        // requests
        builder.withRequestField("interface",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            KeystoneListEndpointsRequest.InterfaceEnum.class,
            f -> f.withMarshaller(KeystoneListEndpointsRequest::getInterface, (req, v) -> {
                req.setInterface(v);
            })
        );
        builder.withRequestField("service_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(KeystoneListEndpointsRequest::getServiceId, (req, v) -> {
                req.setServiceId(v);
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
                .withUri("/v3/groups")
                .withContentType("application/json");

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

    public static final HttpRequestDef<KeystoneListIdentityProvidersRequest, KeystoneListIdentityProvidersResponse> keystoneListIdentityProviders = genForkeystoneListIdentityProviders();

    private static HttpRequestDef<KeystoneListIdentityProvidersRequest, KeystoneListIdentityProvidersResponse> genForkeystoneListIdentityProviders() {
        // basic
        HttpRequestDef.Builder<KeystoneListIdentityProvidersRequest, KeystoneListIdentityProvidersResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, KeystoneListIdentityProvidersRequest.class, KeystoneListIdentityProvidersResponse.class)
                .withUri("/v3/OS-FEDERATION/identity_providers")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<KeystoneListMappingsRequest, KeystoneListMappingsResponse> keystoneListMappings = genForkeystoneListMappings();

    private static HttpRequestDef<KeystoneListMappingsRequest, KeystoneListMappingsResponse> genForkeystoneListMappings() {
        // basic
        HttpRequestDef.Builder<KeystoneListMappingsRequest, KeystoneListMappingsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, KeystoneListMappingsRequest.class, KeystoneListMappingsResponse.class)
                .withUri("/v3/OS-FEDERATION/mappings")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<KeystoneListPermissionsRequest, KeystoneListPermissionsResponse> keystoneListPermissions = genForkeystoneListPermissions();

    private static HttpRequestDef<KeystoneListPermissionsRequest, KeystoneListPermissionsResponse> genForkeystoneListPermissions() {
        // basic
        HttpRequestDef.Builder<KeystoneListPermissionsRequest, KeystoneListPermissionsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, KeystoneListPermissionsRequest.class, KeystoneListPermissionsResponse.class)
                .withUri("/v3/roles")
                .withContentType("application/json");

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
        builder.withRequestField("page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(KeystoneListPermissionsRequest::getPage, (req, v) -> {
                req.setPage(v);
            })
        );
        builder.withRequestField("per_page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(KeystoneListPermissionsRequest::getPerPage, (req, v) -> {
                req.setPerPage(v);
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
                .withUri("/v3/projects/{project_id}/groups/{group_id}/roles")
                .withContentType("application/json");

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

    public static final HttpRequestDef<KeystoneListProjectsRequest, KeystoneListProjectsResponse> keystoneListProjects = genForkeystoneListProjects();

    private static HttpRequestDef<KeystoneListProjectsRequest, KeystoneListProjectsResponse> genForkeystoneListProjects() {
        // basic
        HttpRequestDef.Builder<KeystoneListProjectsRequest, KeystoneListProjectsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, KeystoneListProjectsRequest.class, KeystoneListProjectsResponse.class)
                .withUri("/v3/projects")
                .withContentType("application/json");

        // requests
        builder.withRequestField("domain_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(KeystoneListProjectsRequest::getDomainId, (req, v) -> {
                req.setDomainId(v);
            })
        );
        builder.withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(KeystoneListProjectsRequest::getName, (req, v) -> {
                req.setName(v);
            })
        );
        builder.withRequestField("parent_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(KeystoneListProjectsRequest::getParentId, (req, v) -> {
                req.setParentId(v);
            })
        );
        builder.withRequestField("enabled",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Boolean.class,
            f -> f.withMarshaller(KeystoneListProjectsRequest::getEnabled, (req, v) -> {
                req.setEnabled(v);
            })
        );
        builder.withRequestField("is_domain",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Boolean.class,
            f -> f.withMarshaller(KeystoneListProjectsRequest::getIsDomain, (req, v) -> {
                req.setIsDomain(v);
            })
        );
        builder.withRequestField("page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(KeystoneListProjectsRequest::getPage, (req, v) -> {
                req.setPage(v);
            })
        );
        builder.withRequestField("per_page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(KeystoneListProjectsRequest::getPerPage, (req, v) -> {
                req.setPerPage(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<KeystoneListProjectsForUserRequest, KeystoneListProjectsForUserResponse> keystoneListProjectsForUser = genForkeystoneListProjectsForUser();

    private static HttpRequestDef<KeystoneListProjectsForUserRequest, KeystoneListProjectsForUserResponse> genForkeystoneListProjectsForUser() {
        // basic
        HttpRequestDef.Builder<KeystoneListProjectsForUserRequest, KeystoneListProjectsForUserResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, KeystoneListProjectsForUserRequest.class, KeystoneListProjectsForUserResponse.class)
                .withUri("/v3/users/{user_id}/projects")
                .withContentType("application/json");

        // requests
        builder.withRequestField("user_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(KeystoneListProjectsForUserRequest::getUserId, (req, v) -> {
                req.setUserId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<KeystoneListProtocolsRequest, KeystoneListProtocolsResponse> keystoneListProtocols = genForkeystoneListProtocols();

    private static HttpRequestDef<KeystoneListProtocolsRequest, KeystoneListProtocolsResponse> genForkeystoneListProtocols() {
        // basic
        HttpRequestDef.Builder<KeystoneListProtocolsRequest, KeystoneListProtocolsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, KeystoneListProtocolsRequest.class, KeystoneListProtocolsResponse.class)
                .withUri("/v3/OS-FEDERATION/identity_providers/{idp_id}/protocols")
                .withContentType("application/json");

        // requests
        builder.withRequestField("idp_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(KeystoneListProtocolsRequest::getIdpId, (req, v) -> {
                req.setIdpId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<KeystoneListRegionsRequest, KeystoneListRegionsResponse> keystoneListRegions = genForkeystoneListRegions();

    private static HttpRequestDef<KeystoneListRegionsRequest, KeystoneListRegionsResponse> genForkeystoneListRegions() {
        // basic
        HttpRequestDef.Builder<KeystoneListRegionsRequest, KeystoneListRegionsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, KeystoneListRegionsRequest.class, KeystoneListRegionsResponse.class)
                .withUri("/v3/regions")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<KeystoneListServicesRequest, KeystoneListServicesResponse> keystoneListServices = genForkeystoneListServices();

    private static HttpRequestDef<KeystoneListServicesRequest, KeystoneListServicesResponse> genForkeystoneListServices() {
        // basic
        HttpRequestDef.Builder<KeystoneListServicesRequest, KeystoneListServicesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, KeystoneListServicesRequest.class, KeystoneListServicesResponse.class)
                .withUri("/v3/services")
                .withContentType("application/json");

        // requests
        builder.withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(KeystoneListServicesRequest::getType, (req, v) -> {
                req.setType(v);
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
                .withUri("/v3/groups/{group_id}/users")
                .withContentType("application/json");

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

    public static final HttpRequestDef<KeystoneListVersionsRequest, KeystoneListVersionsResponse> keystoneListVersions = genForkeystoneListVersions();

    private static HttpRequestDef<KeystoneListVersionsRequest, KeystoneListVersionsResponse> genForkeystoneListVersions() {
        // basic
        HttpRequestDef.Builder<KeystoneListVersionsRequest, KeystoneListVersionsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, KeystoneListVersionsRequest.class, KeystoneListVersionsResponse.class)
                .withUri("/")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<KeystoneRemoveDomainPermissionFromGroupRequest, KeystoneRemoveDomainPermissionFromGroupResponse> keystoneRemoveDomainPermissionFromGroup = genForkeystoneRemoveDomainPermissionFromGroup();

    private static HttpRequestDef<KeystoneRemoveDomainPermissionFromGroupRequest, KeystoneRemoveDomainPermissionFromGroupResponse> genForkeystoneRemoveDomainPermissionFromGroup() {
        // basic
        HttpRequestDef.Builder<KeystoneRemoveDomainPermissionFromGroupRequest, KeystoneRemoveDomainPermissionFromGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, KeystoneRemoveDomainPermissionFromGroupRequest.class, KeystoneRemoveDomainPermissionFromGroupResponse.class)
                .withUri("/v3/domains/{domain_id}/groups/{group_id}/roles/{role_id}")
                .withContentType("application/json");

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
                .withUri("/v3/projects/{project_id}/groups/{group_id}/roles/{role_id}")
                .withContentType("application/json");

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
                .withUri("/v3/groups/{group_id}/users/{user_id}")
                .withContentType("application/json");

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

    public static final HttpRequestDef<KeystoneShowCatalogRequest, KeystoneShowCatalogResponse> keystoneShowCatalog = genForkeystoneShowCatalog();

    private static HttpRequestDef<KeystoneShowCatalogRequest, KeystoneShowCatalogResponse> genForkeystoneShowCatalog() {
        // basic
        HttpRequestDef.Builder<KeystoneShowCatalogRequest, KeystoneShowCatalogResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, KeystoneShowCatalogRequest.class, KeystoneShowCatalogResponse.class)
                .withUri("/v3/auth/catalog")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<KeystoneShowEndpointRequest, KeystoneShowEndpointResponse> keystoneShowEndpoint = genForkeystoneShowEndpoint();

    private static HttpRequestDef<KeystoneShowEndpointRequest, KeystoneShowEndpointResponse> genForkeystoneShowEndpoint() {
        // basic
        HttpRequestDef.Builder<KeystoneShowEndpointRequest, KeystoneShowEndpointResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, KeystoneShowEndpointRequest.class, KeystoneShowEndpointResponse.class)
                .withUri("/v3/endpoints/{endpoint_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("endpoint_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(KeystoneShowEndpointRequest::getEndpointId, (req, v) -> {
                req.setEndpointId(v);
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
                .withUri("/v3/groups/{group_id}")
                .withContentType("application/json");

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

    public static final HttpRequestDef<KeystoneShowIdentityProviderRequest, KeystoneShowIdentityProviderResponse> keystoneShowIdentityProvider = genForkeystoneShowIdentityProvider();

    private static HttpRequestDef<KeystoneShowIdentityProviderRequest, KeystoneShowIdentityProviderResponse> genForkeystoneShowIdentityProvider() {
        // basic
        HttpRequestDef.Builder<KeystoneShowIdentityProviderRequest, KeystoneShowIdentityProviderResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, KeystoneShowIdentityProviderRequest.class, KeystoneShowIdentityProviderResponse.class)
                .withUri("/v3/OS-FEDERATION/identity_providers/{id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(KeystoneShowIdentityProviderRequest::getId, (req, v) -> {
                req.setId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<KeystoneShowMappingRequest, KeystoneShowMappingResponse> keystoneShowMapping = genForkeystoneShowMapping();

    private static HttpRequestDef<KeystoneShowMappingRequest, KeystoneShowMappingResponse> genForkeystoneShowMapping() {
        // basic
        HttpRequestDef.Builder<KeystoneShowMappingRequest, KeystoneShowMappingResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, KeystoneShowMappingRequest.class, KeystoneShowMappingResponse.class)
                .withUri("/v3/OS-FEDERATION/mappings/{id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(KeystoneShowMappingRequest::getId, (req, v) -> {
                req.setId(v);
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
                .withUri("/v3/roles/{role_id}")
                .withContentType("application/json");

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

    public static final HttpRequestDef<KeystoneShowProjectRequest, KeystoneShowProjectResponse> keystoneShowProject = genForkeystoneShowProject();

    private static HttpRequestDef<KeystoneShowProjectRequest, KeystoneShowProjectResponse> genForkeystoneShowProject() {
        // basic
        HttpRequestDef.Builder<KeystoneShowProjectRequest, KeystoneShowProjectResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, KeystoneShowProjectRequest.class, KeystoneShowProjectResponse.class)
                .withUri("/v3/projects/{project_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(KeystoneShowProjectRequest::getProjectId, (req, v) -> {
                req.setProjectId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<KeystoneShowProtocolRequest, KeystoneShowProtocolResponse> keystoneShowProtocol = genForkeystoneShowProtocol();

    private static HttpRequestDef<KeystoneShowProtocolRequest, KeystoneShowProtocolResponse> genForkeystoneShowProtocol() {
        // basic
        HttpRequestDef.Builder<KeystoneShowProtocolRequest, KeystoneShowProtocolResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, KeystoneShowProtocolRequest.class, KeystoneShowProtocolResponse.class)
                .withUri("/v3/OS-FEDERATION/identity_providers/{idp_id}/protocols/{protocol_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("idp_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(KeystoneShowProtocolRequest::getIdpId, (req, v) -> {
                req.setIdpId(v);
            })
        );
        builder.withRequestField("protocol_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(KeystoneShowProtocolRequest::getProtocolId, (req, v) -> {
                req.setProtocolId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<KeystoneShowRegionRequest, KeystoneShowRegionResponse> keystoneShowRegion = genForkeystoneShowRegion();

    private static HttpRequestDef<KeystoneShowRegionRequest, KeystoneShowRegionResponse> genForkeystoneShowRegion() {
        // basic
        HttpRequestDef.Builder<KeystoneShowRegionRequest, KeystoneShowRegionResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, KeystoneShowRegionRequest.class, KeystoneShowRegionResponse.class)
                .withUri("/v3/regions/{region_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("region_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(KeystoneShowRegionRequest::getRegionId, (req, v) -> {
                req.setRegionId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<KeystoneShowSecurityComplianceRequest, KeystoneShowSecurityComplianceResponse> keystoneShowSecurityCompliance = genForkeystoneShowSecurityCompliance();

    private static HttpRequestDef<KeystoneShowSecurityComplianceRequest, KeystoneShowSecurityComplianceResponse> genForkeystoneShowSecurityCompliance() {
        // basic
        HttpRequestDef.Builder<KeystoneShowSecurityComplianceRequest, KeystoneShowSecurityComplianceResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, KeystoneShowSecurityComplianceRequest.class, KeystoneShowSecurityComplianceResponse.class)
                .withUri("/v3/domains/{domain_id}/config/security_compliance")
                .withContentType("application/json");

        // requests
        builder.withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(KeystoneShowSecurityComplianceRequest::getDomainId, (req, v) -> {
                req.setDomainId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<KeystoneShowSecurityComplianceByOptionRequest, KeystoneShowSecurityComplianceByOptionResponse> keystoneShowSecurityComplianceByOption = genForkeystoneShowSecurityComplianceByOption();

    private static HttpRequestDef<KeystoneShowSecurityComplianceByOptionRequest, KeystoneShowSecurityComplianceByOptionResponse> genForkeystoneShowSecurityComplianceByOption() {
        // basic
        HttpRequestDef.Builder<KeystoneShowSecurityComplianceByOptionRequest, KeystoneShowSecurityComplianceByOptionResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, KeystoneShowSecurityComplianceByOptionRequest.class, KeystoneShowSecurityComplianceByOptionResponse.class)
                .withUri("/v3/domains/{domain_id}/config/security_compliance/{option}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(KeystoneShowSecurityComplianceByOptionRequest::getDomainId, (req, v) -> {
                req.setDomainId(v);
            })
        );
        builder.withRequestField("option",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            KeystoneShowSecurityComplianceByOptionRequest.OptionEnum.class,
            f -> f.withMarshaller(KeystoneShowSecurityComplianceByOptionRequest::getOption, (req, v) -> {
                req.setOption(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<KeystoneShowServiceRequest, KeystoneShowServiceResponse> keystoneShowService = genForkeystoneShowService();

    private static HttpRequestDef<KeystoneShowServiceRequest, KeystoneShowServiceResponse> genForkeystoneShowService() {
        // basic
        HttpRequestDef.Builder<KeystoneShowServiceRequest, KeystoneShowServiceResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, KeystoneShowServiceRequest.class, KeystoneShowServiceResponse.class)
                .withUri("/v3/services/{service_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("service_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(KeystoneShowServiceRequest::getServiceId, (req, v) -> {
                req.setServiceId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<KeystoneShowVersionRequest, KeystoneShowVersionResponse> keystoneShowVersion = genForkeystoneShowVersion();

    private static HttpRequestDef<KeystoneShowVersionRequest, KeystoneShowVersionResponse> genForkeystoneShowVersion() {
        // basic
        HttpRequestDef.Builder<KeystoneShowVersionRequest, KeystoneShowVersionResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, KeystoneShowVersionRequest.class, KeystoneShowVersionResponse.class)
                .withUri("/v3")
                .withContentType("application/json");

        // requests

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

    public static final HttpRequestDef<KeystoneUpdateIdentityProviderRequest, KeystoneUpdateIdentityProviderResponse> keystoneUpdateIdentityProvider = genForkeystoneUpdateIdentityProvider();

    private static HttpRequestDef<KeystoneUpdateIdentityProviderRequest, KeystoneUpdateIdentityProviderResponse> genForkeystoneUpdateIdentityProvider() {
        // basic
        HttpRequestDef.Builder<KeystoneUpdateIdentityProviderRequest, KeystoneUpdateIdentityProviderResponse> builder =
            HttpRequestDef.builder(HttpMethod.PATCH, KeystoneUpdateIdentityProviderRequest.class, KeystoneUpdateIdentityProviderResponse.class)
                .withUri("/v3/OS-FEDERATION/identity_providers/{id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(KeystoneUpdateIdentityProviderRequest::getId, (req, v) -> {
                req.setId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            KeystoneUpdateIdentityProviderRequestBody.class,
            f -> f.withMarshaller(KeystoneUpdateIdentityProviderRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<KeystoneUpdateMappingRequest, KeystoneUpdateMappingResponse> keystoneUpdateMapping = genForkeystoneUpdateMapping();

    private static HttpRequestDef<KeystoneUpdateMappingRequest, KeystoneUpdateMappingResponse> genForkeystoneUpdateMapping() {
        // basic
        HttpRequestDef.Builder<KeystoneUpdateMappingRequest, KeystoneUpdateMappingResponse> builder =
            HttpRequestDef.builder(HttpMethod.PATCH, KeystoneUpdateMappingRequest.class, KeystoneUpdateMappingResponse.class)
                .withUri("/v3/OS-FEDERATION/mappings/{id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(KeystoneUpdateMappingRequest::getId, (req, v) -> {
                req.setId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            KeystoneUpdateMappingRequestBody.class,
            f -> f.withMarshaller(KeystoneUpdateMappingRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<KeystoneUpdateProjectRequest, KeystoneUpdateProjectResponse> keystoneUpdateProject = genForkeystoneUpdateProject();

    private static HttpRequestDef<KeystoneUpdateProjectRequest, KeystoneUpdateProjectResponse> genForkeystoneUpdateProject() {
        // basic
        HttpRequestDef.Builder<KeystoneUpdateProjectRequest, KeystoneUpdateProjectResponse> builder =
            HttpRequestDef.builder(HttpMethod.PATCH, KeystoneUpdateProjectRequest.class, KeystoneUpdateProjectResponse.class)
                .withUri("/v3/projects/{project_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(KeystoneUpdateProjectRequest::getProjectId, (req, v) -> {
                req.setProjectId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            KeystoneUpdateProjectRequestBody.class,
            f -> f.withMarshaller(KeystoneUpdateProjectRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<KeystoneUpdateProtocolRequest, KeystoneUpdateProtocolResponse> keystoneUpdateProtocol = genForkeystoneUpdateProtocol();

    private static HttpRequestDef<KeystoneUpdateProtocolRequest, KeystoneUpdateProtocolResponse> genForkeystoneUpdateProtocol() {
        // basic
        HttpRequestDef.Builder<KeystoneUpdateProtocolRequest, KeystoneUpdateProtocolResponse> builder =
            HttpRequestDef.builder(HttpMethod.PATCH, KeystoneUpdateProtocolRequest.class, KeystoneUpdateProtocolResponse.class)
                .withUri("/v3/OS-FEDERATION/identity_providers/{idp_id}/protocols/{protocol_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("idp_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(KeystoneUpdateProtocolRequest::getIdpId, (req, v) -> {
                req.setIdpId(v);
            })
        );
        builder.withRequestField("protocol_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(KeystoneUpdateProtocolRequest::getProtocolId, (req, v) -> {
                req.setProtocolId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            KeystoneUpdateProtocolRequestBody.class,
            f -> f.withMarshaller(KeystoneUpdateProtocolRequest::getBody, (req, v) -> {
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
                .withUri("/v3.0/OS-AGENCY/agencies")
                .withContentType("application/json");

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

    public static final HttpRequestDef<ListAllProjectsPermissionsForAgencyRequest, ListAllProjectsPermissionsForAgencyResponse> listAllProjectsPermissionsForAgency = genForlistAllProjectsPermissionsForAgency();

    private static HttpRequestDef<ListAllProjectsPermissionsForAgencyRequest, ListAllProjectsPermissionsForAgencyResponse> genForlistAllProjectsPermissionsForAgency() {
        // basic
        HttpRequestDef.Builder<ListAllProjectsPermissionsForAgencyRequest, ListAllProjectsPermissionsForAgencyResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAllProjectsPermissionsForAgencyRequest.class, ListAllProjectsPermissionsForAgencyResponse.class)
                .withUri("/v3.0/OS-INHERIT/domains/{domain_id}/agencies/{agency_id}/roles/inherited_to_projects")
                .withContentType("application/json");

        // requests
        builder.withRequestField("agency_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListAllProjectsPermissionsForAgencyRequest::getAgencyId, (req, v) -> {
                req.setAgencyId(v);
            })
        );
        builder.withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListAllProjectsPermissionsForAgencyRequest::getDomainId, (req, v) -> {
                req.setDomainId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCustomPoliciesRequest, ListCustomPoliciesResponse> listCustomPolicies = genForlistCustomPolicies();

    private static HttpRequestDef<ListCustomPoliciesRequest, ListCustomPoliciesResponse> genForlistCustomPolicies() {
        // basic
        HttpRequestDef.Builder<ListCustomPoliciesRequest, ListCustomPoliciesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListCustomPoliciesRequest.class, ListCustomPoliciesResponse.class)
                .withUri("/v3.0/OS-ROLE/roles")
                .withContentType("application/json");

        // requests
        builder.withRequestField("page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListCustomPoliciesRequest::getPage, (req, v) -> {
                req.setPage(v);
            })
        );
        builder.withRequestField("per_page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListCustomPoliciesRequest::getPerPage, (req, v) -> {
                req.setPerPage(v);
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
                .withUri("/v3.0/OS-AGENCY/domains/{domain_id}/agencies/{agency_id}/roles")
                .withContentType("application/json");

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
                .withUri("/v3.0/OS-AGENCY/projects/{project_id}/agencies/{agency_id}/roles")
                .withContentType("application/json");

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

    public static final HttpRequestDef<RemoveAllProjectsPermissionFromAgencyRequest, RemoveAllProjectsPermissionFromAgencyResponse> removeAllProjectsPermissionFromAgency = genForremoveAllProjectsPermissionFromAgency();

    private static HttpRequestDef<RemoveAllProjectsPermissionFromAgencyRequest, RemoveAllProjectsPermissionFromAgencyResponse> genForremoveAllProjectsPermissionFromAgency() {
        // basic
        HttpRequestDef.Builder<RemoveAllProjectsPermissionFromAgencyRequest, RemoveAllProjectsPermissionFromAgencyResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, RemoveAllProjectsPermissionFromAgencyRequest.class, RemoveAllProjectsPermissionFromAgencyResponse.class)
                .withUri("/v3.0/OS-INHERIT/domains/{domain_id}/agencies/{agency_id}/roles/{role_id}/inherited_to_projects")
                .withContentType("application/json");

        // requests
        builder.withRequestField("agency_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(RemoveAllProjectsPermissionFromAgencyRequest::getAgencyId, (req, v) -> {
                req.setAgencyId(v);
            })
        );
        builder.withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(RemoveAllProjectsPermissionFromAgencyRequest::getDomainId, (req, v) -> {
                req.setDomainId(v);
            })
        );
        builder.withRequestField("role_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(RemoveAllProjectsPermissionFromAgencyRequest::getRoleId, (req, v) -> {
                req.setRoleId(v);
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
                .withUri("/v3.0/OS-AGENCY/domains/{domain_id}/agencies/{agency_id}/roles/{role_id}")
                .withContentType("application/json");

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
                .withUri("/v3.0/OS-AGENCY/projects/{project_id}/agencies/{agency_id}/roles/{role_id}")
                .withContentType("application/json");

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
                .withUri("/v3.0/OS-AGENCY/agencies/{agency_id}")
                .withContentType("application/json");

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

    public static final HttpRequestDef<ShowCustomPolicyRequest, ShowCustomPolicyResponse> showCustomPolicy = genForshowCustomPolicy();

    private static HttpRequestDef<ShowCustomPolicyRequest, ShowCustomPolicyResponse> genForshowCustomPolicy() {
        // basic
        HttpRequestDef.Builder<ShowCustomPolicyRequest, ShowCustomPolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowCustomPolicyRequest.class, ShowCustomPolicyResponse.class)
                .withUri("/v3.0/OS-ROLE/roles/{role_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("role_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowCustomPolicyRequest::getRoleId, (req, v) -> {
                req.setRoleId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDomainApiAclPolicyRequest, ShowDomainApiAclPolicyResponse> showDomainApiAclPolicy = genForshowDomainApiAclPolicy();

    private static HttpRequestDef<ShowDomainApiAclPolicyRequest, ShowDomainApiAclPolicyResponse> genForshowDomainApiAclPolicy() {
        // basic
        HttpRequestDef.Builder<ShowDomainApiAclPolicyRequest, ShowDomainApiAclPolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowDomainApiAclPolicyRequest.class, ShowDomainApiAclPolicyResponse.class)
                .withUri("/v3.0/OS-SECURITYPOLICY/domains/{domain_id}/api-acl-policy")
                .withContentType("application/json");

        // requests
        builder.withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowDomainApiAclPolicyRequest::getDomainId, (req, v) -> {
                req.setDomainId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDomainConsoleAclPolicyRequest, ShowDomainConsoleAclPolicyResponse> showDomainConsoleAclPolicy = genForshowDomainConsoleAclPolicy();

    private static HttpRequestDef<ShowDomainConsoleAclPolicyRequest, ShowDomainConsoleAclPolicyResponse> genForshowDomainConsoleAclPolicy() {
        // basic
        HttpRequestDef.Builder<ShowDomainConsoleAclPolicyRequest, ShowDomainConsoleAclPolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowDomainConsoleAclPolicyRequest.class, ShowDomainConsoleAclPolicyResponse.class)
                .withUri("/v3.0/OS-SECURITYPOLICY/domains/{domain_id}/console-acl-policy")
                .withContentType("application/json");

        // requests
        builder.withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowDomainConsoleAclPolicyRequest::getDomainId, (req, v) -> {
                req.setDomainId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDomainLoginPolicyRequest, ShowDomainLoginPolicyResponse> showDomainLoginPolicy = genForshowDomainLoginPolicy();

    private static HttpRequestDef<ShowDomainLoginPolicyRequest, ShowDomainLoginPolicyResponse> genForshowDomainLoginPolicy() {
        // basic
        HttpRequestDef.Builder<ShowDomainLoginPolicyRequest, ShowDomainLoginPolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowDomainLoginPolicyRequest.class, ShowDomainLoginPolicyResponse.class)
                .withUri("/v3.0/OS-SECURITYPOLICY/domains/{domain_id}/login-policy")
                .withContentType("application/json");

        // requests
        builder.withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowDomainLoginPolicyRequest::getDomainId, (req, v) -> {
                req.setDomainId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDomainPasswordPolicyRequest, ShowDomainPasswordPolicyResponse> showDomainPasswordPolicy = genForshowDomainPasswordPolicy();

    private static HttpRequestDef<ShowDomainPasswordPolicyRequest, ShowDomainPasswordPolicyResponse> genForshowDomainPasswordPolicy() {
        // basic
        HttpRequestDef.Builder<ShowDomainPasswordPolicyRequest, ShowDomainPasswordPolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowDomainPasswordPolicyRequest.class, ShowDomainPasswordPolicyResponse.class)
                .withUri("/v3.0/OS-SECURITYPOLICY/domains/{domain_id}/password-policy")
                .withContentType("application/json");

        // requests
        builder.withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowDomainPasswordPolicyRequest::getDomainId, (req, v) -> {
                req.setDomainId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDomainProtectPolicyRequest, ShowDomainProtectPolicyResponse> showDomainProtectPolicy = genForshowDomainProtectPolicy();

    private static HttpRequestDef<ShowDomainProtectPolicyRequest, ShowDomainProtectPolicyResponse> genForshowDomainProtectPolicy() {
        // basic
        HttpRequestDef.Builder<ShowDomainProtectPolicyRequest, ShowDomainProtectPolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowDomainProtectPolicyRequest.class, ShowDomainProtectPolicyResponse.class)
                .withUri("/v3.0/OS-SECURITYPOLICY/domains/{domain_id}/protect-policy")
                .withContentType("application/json");

        // requests
        builder.withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowDomainProtectPolicyRequest::getDomainId, (req, v) -> {
                req.setDomainId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDomainQuotaRequest, ShowDomainQuotaResponse> showDomainQuota = genForshowDomainQuota();

    private static HttpRequestDef<ShowDomainQuotaRequest, ShowDomainQuotaResponse> genForshowDomainQuota() {
        // basic
        HttpRequestDef.Builder<ShowDomainQuotaRequest, ShowDomainQuotaResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowDomainQuotaRequest.class, ShowDomainQuotaResponse.class)
                .withUri("/v3.0/OS-QUOTA/domains/{domain_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowDomainQuotaRequest::getDomainId, (req, v) -> {
                req.setDomainId(v);
            })
        );
        builder.withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            ShowDomainQuotaRequest.TypeEnum.class,
            f -> f.withMarshaller(ShowDomainQuotaRequest::getType, (req, v) -> {
                req.setType(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowMetadataRequest, ShowMetadataResponse> showMetadata = genForshowMetadata();

    private static HttpRequestDef<ShowMetadataRequest, ShowMetadataResponse> genForshowMetadata() {
        // basic
        HttpRequestDef.Builder<ShowMetadataRequest, ShowMetadataResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowMetadataRequest.class, ShowMetadataResponse.class)
                .withUri("/v3-ext/OS-FEDERATION/identity_providers/{idp_id}/protocols/{protocol_id}/metadata")
                .withContentType("application/json");

        // requests
        builder.withRequestField("idp_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowMetadataRequest::getIdpId, (req, v) -> {
                req.setIdpId(v);
            })
        );
        builder.withRequestField("protocol_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowMetadataRequest::getProtocolId, (req, v) -> {
                req.setProtocolId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowProjectDetailsAndStatusRequest, ShowProjectDetailsAndStatusResponse> showProjectDetailsAndStatus = genForshowProjectDetailsAndStatus();

    private static HttpRequestDef<ShowProjectDetailsAndStatusRequest, ShowProjectDetailsAndStatusResponse> genForshowProjectDetailsAndStatus() {
        // basic
        HttpRequestDef.Builder<ShowProjectDetailsAndStatusRequest, ShowProjectDetailsAndStatusResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowProjectDetailsAndStatusRequest.class, ShowProjectDetailsAndStatusResponse.class)
                .withUri("/v3-ext/projects/{project_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowProjectDetailsAndStatusRequest::getProjectId, (req, v) -> {
                req.setProjectId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowProjectQuotaRequest, ShowProjectQuotaResponse> showProjectQuota = genForshowProjectQuota();

    private static HttpRequestDef<ShowProjectQuotaRequest, ShowProjectQuotaResponse> genForshowProjectQuota() {
        // basic
        HttpRequestDef.Builder<ShowProjectQuotaRequest, ShowProjectQuotaResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowProjectQuotaRequest.class, ShowProjectQuotaResponse.class)
                .withUri("/v3.0/OS-QUOTA/projects/{project_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowProjectQuotaRequest::getProjectId, (req, v) -> {
                req.setProjectId(v);
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

    public static final HttpRequestDef<UpdateAgencyCustomPolicyRequest, UpdateAgencyCustomPolicyResponse> updateAgencyCustomPolicy = genForupdateAgencyCustomPolicy();

    private static HttpRequestDef<UpdateAgencyCustomPolicyRequest, UpdateAgencyCustomPolicyResponse> genForupdateAgencyCustomPolicy() {
        // basic
        HttpRequestDef.Builder<UpdateAgencyCustomPolicyRequest, UpdateAgencyCustomPolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.PATCH, UpdateAgencyCustomPolicyRequest.class, UpdateAgencyCustomPolicyResponse.class)
                .withUri("/v3.0/OS-ROLE/roles/{role_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("role_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateAgencyCustomPolicyRequest::getRoleId, (req, v) -> {
                req.setRoleId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            UpdateAgencyCustomPolicyRequestBody.class,
            f -> f.withMarshaller(UpdateAgencyCustomPolicyRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateCloudServiceCustomPolicyRequest, UpdateCloudServiceCustomPolicyResponse> updateCloudServiceCustomPolicy = genForupdateCloudServiceCustomPolicy();

    private static HttpRequestDef<UpdateCloudServiceCustomPolicyRequest, UpdateCloudServiceCustomPolicyResponse> genForupdateCloudServiceCustomPolicy() {
        // basic
        HttpRequestDef.Builder<UpdateCloudServiceCustomPolicyRequest, UpdateCloudServiceCustomPolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.PATCH, UpdateCloudServiceCustomPolicyRequest.class, UpdateCloudServiceCustomPolicyResponse.class)
                .withUri("/v3.0/OS-ROLE/roles/{role_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("role_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateCloudServiceCustomPolicyRequest::getRoleId, (req, v) -> {
                req.setRoleId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            UpdateCloudServiceCustomPolicyRequestBody.class,
            f -> f.withMarshaller(UpdateCloudServiceCustomPolicyRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateDomainApiAclPolicyRequest, UpdateDomainApiAclPolicyResponse> updateDomainApiAclPolicy = genForupdateDomainApiAclPolicy();

    private static HttpRequestDef<UpdateDomainApiAclPolicyRequest, UpdateDomainApiAclPolicyResponse> genForupdateDomainApiAclPolicy() {
        // basic
        HttpRequestDef.Builder<UpdateDomainApiAclPolicyRequest, UpdateDomainApiAclPolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateDomainApiAclPolicyRequest.class, UpdateDomainApiAclPolicyResponse.class)
                .withUri("/v3.0/OS-SECURITYPOLICY/domains/{domain_id}/api-acl-policy")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateDomainApiAclPolicyRequest::getDomainId, (req, v) -> {
                req.setDomainId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            UpdateDomainApiAclPolicyRequestBody.class,
            f -> f.withMarshaller(UpdateDomainApiAclPolicyRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateDomainConsoleAclPolicyRequest, UpdateDomainConsoleAclPolicyResponse> updateDomainConsoleAclPolicy = genForupdateDomainConsoleAclPolicy();

    private static HttpRequestDef<UpdateDomainConsoleAclPolicyRequest, UpdateDomainConsoleAclPolicyResponse> genForupdateDomainConsoleAclPolicy() {
        // basic
        HttpRequestDef.Builder<UpdateDomainConsoleAclPolicyRequest, UpdateDomainConsoleAclPolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateDomainConsoleAclPolicyRequest.class, UpdateDomainConsoleAclPolicyResponse.class)
                .withUri("/v3.0/OS-SECURITYPOLICY/domains/{domain_id}/console-acl-policy")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateDomainConsoleAclPolicyRequest::getDomainId, (req, v) -> {
                req.setDomainId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            UpdateDomainConsoleAclPolicyRequestBody.class,
            f -> f.withMarshaller(UpdateDomainConsoleAclPolicyRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateDomainGroupInheritRoleRequest, UpdateDomainGroupInheritRoleResponse> updateDomainGroupInheritRole = genForupdateDomainGroupInheritRole();

    private static HttpRequestDef<UpdateDomainGroupInheritRoleRequest, UpdateDomainGroupInheritRoleResponse> genForupdateDomainGroupInheritRole() {
        // basic
        HttpRequestDef.Builder<UpdateDomainGroupInheritRoleRequest, UpdateDomainGroupInheritRoleResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateDomainGroupInheritRoleRequest.class, UpdateDomainGroupInheritRoleResponse.class)
                .withUri("/v3/OS-INHERIT/domains/{domain_id}/groups/{group_id}/roles/{role_id}/inherited_to_projects")
                .withContentType("application/json");

        // requests
        builder.withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateDomainGroupInheritRoleRequest::getDomainId, (req, v) -> {
                req.setDomainId(v);
            })
        );
        builder.withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateDomainGroupInheritRoleRequest::getGroupId, (req, v) -> {
                req.setGroupId(v);
            })
        );
        builder.withRequestField("role_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateDomainGroupInheritRoleRequest::getRoleId, (req, v) -> {
                req.setRoleId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateDomainLoginPolicyRequest, UpdateDomainLoginPolicyResponse> updateDomainLoginPolicy = genForupdateDomainLoginPolicy();

    private static HttpRequestDef<UpdateDomainLoginPolicyRequest, UpdateDomainLoginPolicyResponse> genForupdateDomainLoginPolicy() {
        // basic
        HttpRequestDef.Builder<UpdateDomainLoginPolicyRequest, UpdateDomainLoginPolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateDomainLoginPolicyRequest.class, UpdateDomainLoginPolicyResponse.class)
                .withUri("/v3.0/OS-SECURITYPOLICY/domains/{domain_id}/login-policy")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateDomainLoginPolicyRequest::getDomainId, (req, v) -> {
                req.setDomainId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            UpdateDomainLoginPolicyRequestBody.class,
            f -> f.withMarshaller(UpdateDomainLoginPolicyRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateDomainPasswordPolicyRequest, UpdateDomainPasswordPolicyResponse> updateDomainPasswordPolicy = genForupdateDomainPasswordPolicy();

    private static HttpRequestDef<UpdateDomainPasswordPolicyRequest, UpdateDomainPasswordPolicyResponse> genForupdateDomainPasswordPolicy() {
        // basic
        HttpRequestDef.Builder<UpdateDomainPasswordPolicyRequest, UpdateDomainPasswordPolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateDomainPasswordPolicyRequest.class, UpdateDomainPasswordPolicyResponse.class)
                .withUri("/v3.0/OS-SECURITYPOLICY/domains/{domain_id}/password-policy")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateDomainPasswordPolicyRequest::getDomainId, (req, v) -> {
                req.setDomainId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            UpdateDomainPasswordPolicyRequestBody.class,
            f -> f.withMarshaller(UpdateDomainPasswordPolicyRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateDomainProtectPolicyRequest, UpdateDomainProtectPolicyResponse> updateDomainProtectPolicy = genForupdateDomainProtectPolicy();

    private static HttpRequestDef<UpdateDomainProtectPolicyRequest, UpdateDomainProtectPolicyResponse> genForupdateDomainProtectPolicy() {
        // basic
        HttpRequestDef.Builder<UpdateDomainProtectPolicyRequest, UpdateDomainProtectPolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateDomainProtectPolicyRequest.class, UpdateDomainProtectPolicyResponse.class)
                .withUri("/v3.0/OS-SECURITYPOLICY/domains/{domain_id}/protect-policy")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateDomainProtectPolicyRequest::getDomainId, (req, v) -> {
                req.setDomainId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            UpdateDomainProtectPolicyRequestBody.class,
            f -> f.withMarshaller(UpdateDomainProtectPolicyRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateProjectStatusRequest, UpdateProjectStatusResponse> updateProjectStatus = genForupdateProjectStatus();

    private static HttpRequestDef<UpdateProjectStatusRequest, UpdateProjectStatusResponse> genForupdateProjectStatus() {
        // basic
        HttpRequestDef.Builder<UpdateProjectStatusRequest, UpdateProjectStatusResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateProjectStatusRequest.class, UpdateProjectStatusResponse.class)
                .withUri("/v3-ext/projects/{project_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateProjectStatusRequest::getProjectId, (req, v) -> {
                req.setProjectId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            UpdateProjectStatusRequestBody.class,
            f -> f.withMarshaller(UpdateProjectStatusRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreatePermanentAccessKeyRequest, CreatePermanentAccessKeyResponse> createPermanentAccessKey = genForcreatePermanentAccessKey();

    private static HttpRequestDef<CreatePermanentAccessKeyRequest, CreatePermanentAccessKeyResponse> genForcreatePermanentAccessKey() {
        // basic
        HttpRequestDef.Builder<CreatePermanentAccessKeyRequest, CreatePermanentAccessKeyResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreatePermanentAccessKeyRequest.class, CreatePermanentAccessKeyResponse.class)
                .withUri("/v3.0/OS-CREDENTIAL/credentials")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            CreatePermanentAccessKeyRequestBody.class,
            f -> f.withMarshaller(CreatePermanentAccessKeyRequest::getBody, (req, v) -> {
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

    public static final HttpRequestDef<DeletePermanentAccessKeyRequest, DeletePermanentAccessKeyResponse> deletePermanentAccessKey = genFordeletePermanentAccessKey();

    private static HttpRequestDef<DeletePermanentAccessKeyRequest, DeletePermanentAccessKeyResponse> genFordeletePermanentAccessKey() {
        // basic
        HttpRequestDef.Builder<DeletePermanentAccessKeyRequest, DeletePermanentAccessKeyResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeletePermanentAccessKeyRequest.class, DeletePermanentAccessKeyResponse.class)
                .withUri("/v3.0/OS-CREDENTIAL/credentials/{access_key}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("access_key",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeletePermanentAccessKeyRequest::getAccessKey, (req, v) -> {
                req.setAccessKey(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPermanentAccessKeysRequest, ListPermanentAccessKeysResponse> listPermanentAccessKeys = genForlistPermanentAccessKeys();

    private static HttpRequestDef<ListPermanentAccessKeysRequest, ListPermanentAccessKeysResponse> genForlistPermanentAccessKeys() {
        // basic
        HttpRequestDef.Builder<ListPermanentAccessKeysRequest, ListPermanentAccessKeysResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListPermanentAccessKeysRequest.class, ListPermanentAccessKeysResponse.class)
                .withUri("/v3.0/OS-CREDENTIAL/credentials")
                .withContentType("application/json");

        // requests
        builder.withRequestField("user_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListPermanentAccessKeysRequest::getUserId, (req, v) -> {
                req.setUserId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowPermanentAccessKeyRequest, ShowPermanentAccessKeyResponse> showPermanentAccessKey = genForshowPermanentAccessKey();

    private static HttpRequestDef<ShowPermanentAccessKeyRequest, ShowPermanentAccessKeyResponse> genForshowPermanentAccessKey() {
        // basic
        HttpRequestDef.Builder<ShowPermanentAccessKeyRequest, ShowPermanentAccessKeyResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowPermanentAccessKeyRequest.class, ShowPermanentAccessKeyResponse.class)
                .withUri("/v3.0/OS-CREDENTIAL/credentials/{access_key}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("access_key",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowPermanentAccessKeyRequest::getAccessKey, (req, v) -> {
                req.setAccessKey(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdatePermanentAccessKeyRequest, UpdatePermanentAccessKeyResponse> updatePermanentAccessKey = genForupdatePermanentAccessKey();

    private static HttpRequestDef<UpdatePermanentAccessKeyRequest, UpdatePermanentAccessKeyResponse> genForupdatePermanentAccessKey() {
        // basic
        HttpRequestDef.Builder<UpdatePermanentAccessKeyRequest, UpdatePermanentAccessKeyResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdatePermanentAccessKeyRequest.class, UpdatePermanentAccessKeyResponse.class)
                .withUri("/v3.0/OS-CREDENTIAL/credentials/{access_key}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("access_key",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdatePermanentAccessKeyRequest::getAccessKey, (req, v) -> {
                req.setAccessKey(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            UpdatePermanentAccessKeyRequestBody.class,
            f -> f.withMarshaller(UpdatePermanentAccessKeyRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateBindingDeviceRequest, CreateBindingDeviceResponse> createBindingDevice = genForcreateBindingDevice();

    private static HttpRequestDef<CreateBindingDeviceRequest, CreateBindingDeviceResponse> genForcreateBindingDevice() {
        // basic
        HttpRequestDef.Builder<CreateBindingDeviceRequest, CreateBindingDeviceResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, CreateBindingDeviceRequest.class, CreateBindingDeviceResponse.class)
                .withUri("/v3.0/OS-MFA/mfa-devices/bind")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            BindMfaDevice.class,
            f -> f.withMarshaller(CreateBindingDeviceRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateMfaDeviceRequest, CreateMfaDeviceResponse> createMfaDevice = genForcreateMfaDevice();

    private static HttpRequestDef<CreateMfaDeviceRequest, CreateMfaDeviceResponse> genForcreateMfaDevice() {
        // basic
        HttpRequestDef.Builder<CreateMfaDeviceRequest, CreateMfaDeviceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateMfaDeviceRequest.class, CreateMfaDeviceResponse.class)
                .withUri("/v3.0/OS-MFA/virtual-mfa-devices")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            CreateMfaDeviceReq.class,
            f -> f.withMarshaller(CreateMfaDeviceRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateUserRequest, CreateUserResponse> createUser = genForcreateUser();

    private static HttpRequestDef<CreateUserRequest, CreateUserResponse> genForcreateUser() {
        // basic
        HttpRequestDef.Builder<CreateUserRequest, CreateUserResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateUserRequest.class, CreateUserResponse.class)
                .withUri("/v3.0/OS-USER/users")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            CreateUserRequestBody.class,
            f -> f.withMarshaller(CreateUserRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteBindingDeviceRequest, DeleteBindingDeviceResponse> deleteBindingDevice = genFordeleteBindingDevice();

    private static HttpRequestDef<DeleteBindingDeviceRequest, DeleteBindingDeviceResponse> genFordeleteBindingDevice() {
        // basic
        HttpRequestDef.Builder<DeleteBindingDeviceRequest, DeleteBindingDeviceResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, DeleteBindingDeviceRequest.class, DeleteBindingDeviceResponse.class)
                .withUri("/v3.0/OS-MFA/mfa-devices/unbind")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            UnbindMfaDevice.class,
            f -> f.withMarshaller(DeleteBindingDeviceRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteMfaDeviceRequest, DeleteMfaDeviceResponse> deleteMfaDevice = genFordeleteMfaDevice();

    private static HttpRequestDef<DeleteMfaDeviceRequest, DeleteMfaDeviceResponse> genFordeleteMfaDevice() {
        // basic
        HttpRequestDef.Builder<DeleteMfaDeviceRequest, DeleteMfaDeviceResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteMfaDeviceRequest.class, DeleteMfaDeviceResponse.class)
                .withUri("/v3.0/OS-MFA/virtual-mfa-devices")
                .withContentType("application/json");

        // requests
        builder.withRequestField("user_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteMfaDeviceRequest::getUserId, (req, v) -> {
                req.setUserId(v);
            })
        );
        builder.withRequestField("serial_number",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteMfaDeviceRequest::getSerialNumber, (req, v) -> {
                req.setSerialNumber(v);
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

    public static final HttpRequestDef<KeystoneDeleteUserRequest, KeystoneDeleteUserResponse> keystoneDeleteUser = genForkeystoneDeleteUser();

    private static HttpRequestDef<KeystoneDeleteUserRequest, KeystoneDeleteUserResponse> genForkeystoneDeleteUser() {
        // basic
        HttpRequestDef.Builder<KeystoneDeleteUserRequest, KeystoneDeleteUserResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, KeystoneDeleteUserRequest.class, KeystoneDeleteUserResponse.class)
                .withUri("/v3/users/{user_id}")
                .withContentType("application/json");

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

    public static final HttpRequestDef<KeystoneListGroupsForUserRequest, KeystoneListGroupsForUserResponse> keystoneListGroupsForUser = genForkeystoneListGroupsForUser();

    private static HttpRequestDef<KeystoneListGroupsForUserRequest, KeystoneListGroupsForUserResponse> genForkeystoneListGroupsForUser() {
        // basic
        HttpRequestDef.Builder<KeystoneListGroupsForUserRequest, KeystoneListGroupsForUserResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, KeystoneListGroupsForUserRequest.class, KeystoneListGroupsForUserResponse.class)
                .withUri("/v3/users/{user_id}/groups")
                .withContentType("application/json");

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

    public static final HttpRequestDef<KeystoneListUsersRequest, KeystoneListUsersResponse> keystoneListUsers = genForkeystoneListUsers();

    private static HttpRequestDef<KeystoneListUsersRequest, KeystoneListUsersResponse> genForkeystoneListUsers() {
        // basic
        HttpRequestDef.Builder<KeystoneListUsersRequest, KeystoneListUsersResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, KeystoneListUsersRequest.class, KeystoneListUsersResponse.class)
                .withUri("/v3/users")
                .withContentType("application/json");

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

    public static final HttpRequestDef<KeystoneShowUserRequest, KeystoneShowUserResponse> keystoneShowUser = genForkeystoneShowUser();

    private static HttpRequestDef<KeystoneShowUserRequest, KeystoneShowUserResponse> genForkeystoneShowUser() {
        // basic
        HttpRequestDef.Builder<KeystoneShowUserRequest, KeystoneShowUserResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, KeystoneShowUserRequest.class, KeystoneShowUserResponse.class)
                .withUri("/v3/users/{user_id}")
                .withContentType("application/json");

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

    public static final HttpRequestDef<ListUserLoginProtectsRequest, ListUserLoginProtectsResponse> listUserLoginProtects = genForlistUserLoginProtects();

    private static HttpRequestDef<ListUserLoginProtectsRequest, ListUserLoginProtectsResponse> genForlistUserLoginProtects() {
        // basic
        HttpRequestDef.Builder<ListUserLoginProtectsRequest, ListUserLoginProtectsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListUserLoginProtectsRequest.class, ListUserLoginProtectsResponse.class)
                .withUri("/v3.0/OS-USER/login-protects")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListUserMfaDevicesRequest, ListUserMfaDevicesResponse> listUserMfaDevices = genForlistUserMfaDevices();

    private static HttpRequestDef<ListUserMfaDevicesRequest, ListUserMfaDevicesResponse> genForlistUserMfaDevices() {
        // basic
        HttpRequestDef.Builder<ListUserMfaDevicesRequest, ListUserMfaDevicesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListUserMfaDevicesRequest.class, ListUserMfaDevicesResponse.class)
                .withUri("/v3.0/OS-MFA/virtual-mfa-devices")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowUserRequest, ShowUserResponse> showUser = genForshowUser();

    private static HttpRequestDef<ShowUserRequest, ShowUserResponse> genForshowUser() {
        // basic
        HttpRequestDef.Builder<ShowUserRequest, ShowUserResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowUserRequest.class, ShowUserResponse.class)
                .withUri("/v3.0/OS-USER/users/{user_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("user_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowUserRequest::getUserId, (req, v) -> {
                req.setUserId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowUserLoginProtectRequest, ShowUserLoginProtectResponse> showUserLoginProtect = genForshowUserLoginProtect();

    private static HttpRequestDef<ShowUserLoginProtectRequest, ShowUserLoginProtectResponse> genForshowUserLoginProtect() {
        // basic
        HttpRequestDef.Builder<ShowUserLoginProtectRequest, ShowUserLoginProtectResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowUserLoginProtectRequest.class, ShowUserLoginProtectResponse.class)
                .withUri("/v3.0/OS-USER/users/{user_id}/login-protect")
                .withContentType("application/json");

        // requests
        builder.withRequestField("user_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowUserLoginProtectRequest::getUserId, (req, v) -> {
                req.setUserId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowUserMfaDeviceRequest, ShowUserMfaDeviceResponse> showUserMfaDevice = genForshowUserMfaDevice();

    private static HttpRequestDef<ShowUserMfaDeviceRequest, ShowUserMfaDeviceResponse> genForshowUserMfaDevice() {
        // basic
        HttpRequestDef.Builder<ShowUserMfaDeviceRequest, ShowUserMfaDeviceResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowUserMfaDeviceRequest.class, ShowUserMfaDeviceResponse.class)
                .withUri("/v3.0/OS-MFA/users/{user_id}/virtual-mfa-device")
                .withContentType("application/json");

        // requests
        builder.withRequestField("user_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowUserMfaDeviceRequest::getUserId, (req, v) -> {
                req.setUserId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateLoginProtectRequest, UpdateLoginProtectResponse> updateLoginProtect = genForupdateLoginProtect();

    private static HttpRequestDef<UpdateLoginProtectRequest, UpdateLoginProtectResponse> genForupdateLoginProtect() {
        // basic
        HttpRequestDef.Builder<UpdateLoginProtectRequest, UpdateLoginProtectResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateLoginProtectRequest.class, UpdateLoginProtectResponse.class)
                .withUri("/v3.0/OS-USER/users/{user_id}/login-protect")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("user_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateLoginProtectRequest::getUserId, (req, v) -> {
                req.setUserId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            UpdateLoginProjectReq.class,
            f -> f.withMarshaller(UpdateLoginProtectRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateUserRequest, UpdateUserResponse> updateUser = genForupdateUser();

    private static HttpRequestDef<UpdateUserRequest, UpdateUserResponse> genForupdateUser() {
        // basic
        HttpRequestDef.Builder<UpdateUserRequest, UpdateUserResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateUserRequest.class, UpdateUserResponse.class)
                .withUri("/v3.0/OS-USER/users/{user_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("user_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateUserRequest::getUserId, (req, v) -> {
                req.setUserId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            UpdateUserRequestBody.class,
            f -> f.withMarshaller(UpdateUserRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateUserInformationRequest, UpdateUserInformationResponse> updateUserInformation = genForupdateUserInformation();

    private static HttpRequestDef<UpdateUserInformationRequest, UpdateUserInformationResponse> genForupdateUserInformation() {
        // basic
        HttpRequestDef.Builder<UpdateUserInformationRequest, UpdateUserInformationResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateUserInformationRequest.class, UpdateUserInformationResponse.class)
                .withUri("/v3.0/OS-USER/users/{user_id}/info")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("user_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateUserInformationRequest::getUserId, (req, v) -> {
                req.setUserId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            UpdateUserInformationRequestBody.class,
            f -> f.withMarshaller(UpdateUserInformationRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<KeystoneCreateAgencyTokenRequest, KeystoneCreateAgencyTokenResponse> keystoneCreateAgencyToken = genForkeystoneCreateAgencyToken();

    private static HttpRequestDef<KeystoneCreateAgencyTokenRequest, KeystoneCreateAgencyTokenResponse> genForkeystoneCreateAgencyToken() {
        // basic
        HttpRequestDef.Builder<KeystoneCreateAgencyTokenRequest, KeystoneCreateAgencyTokenResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, KeystoneCreateAgencyTokenRequest.class, KeystoneCreateAgencyTokenResponse.class)
                .withUri("/v3/auth/tokens")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("nocatalog",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(KeystoneCreateAgencyTokenRequest::getNocatalog, (req, v) -> {
                req.setNocatalog(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            KeystoneCreateAgencyTokenRequestBody.class,
            f -> f.withMarshaller(KeystoneCreateAgencyTokenRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        builder.withResponseField(
            "X-Subject-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(
                KeystoneCreateAgencyTokenResponse::getXSubjectToken,
                KeystoneCreateAgencyTokenResponse::setXSubjectToken)
        );
        return builder.build();
    }

    public static final HttpRequestDef<KeystoneCreateUserTokenByPasswordRequest, KeystoneCreateUserTokenByPasswordResponse> keystoneCreateUserTokenByPassword = genForkeystoneCreateUserTokenByPassword();

    private static HttpRequestDef<KeystoneCreateUserTokenByPasswordRequest, KeystoneCreateUserTokenByPasswordResponse> genForkeystoneCreateUserTokenByPassword() {
        // basic
        HttpRequestDef.Builder<KeystoneCreateUserTokenByPasswordRequest, KeystoneCreateUserTokenByPasswordResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, KeystoneCreateUserTokenByPasswordRequest.class, KeystoneCreateUserTokenByPasswordResponse.class)
                .withUri("/v3/auth/tokens")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("nocatalog",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(KeystoneCreateUserTokenByPasswordRequest::getNocatalog, (req, v) -> {
                req.setNocatalog(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            KeystoneCreateUserTokenByPasswordRequestBody.class,
            f -> f.withMarshaller(KeystoneCreateUserTokenByPasswordRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        builder.withResponseField(
            "X-Subject-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(
                KeystoneCreateUserTokenByPasswordResponse::getXSubjectToken,
                KeystoneCreateUserTokenByPasswordResponse::setXSubjectToken)
        );
        return builder.build();
    }

    public static final HttpRequestDef<KeystoneCreateUserTokenByPasswordAndMfaRequest, KeystoneCreateUserTokenByPasswordAndMfaResponse> keystoneCreateUserTokenByPasswordAndMfa = genForkeystoneCreateUserTokenByPasswordAndMfa();

    private static HttpRequestDef<KeystoneCreateUserTokenByPasswordAndMfaRequest, KeystoneCreateUserTokenByPasswordAndMfaResponse> genForkeystoneCreateUserTokenByPasswordAndMfa() {
        // basic
        HttpRequestDef.Builder<KeystoneCreateUserTokenByPasswordAndMfaRequest, KeystoneCreateUserTokenByPasswordAndMfaResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, KeystoneCreateUserTokenByPasswordAndMfaRequest.class, KeystoneCreateUserTokenByPasswordAndMfaResponse.class)
                .withUri("/v3/auth/tokens")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("nocatalog",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(KeystoneCreateUserTokenByPasswordAndMfaRequest::getNocatalog, (req, v) -> {
                req.setNocatalog(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            KeystoneCreateUserTokenByPasswordAndMfaRequestBody.class,
            f -> f.withMarshaller(KeystoneCreateUserTokenByPasswordAndMfaRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        builder.withResponseField(
            "X-Subject-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(
                KeystoneCreateUserTokenByPasswordAndMfaResponse::getXSubjectToken,
                KeystoneCreateUserTokenByPasswordAndMfaResponse::setXSubjectToken)
        );
        return builder.build();
    }

    public static final HttpRequestDef<KeystoneValidateTokenRequest, KeystoneValidateTokenResponse> keystoneValidateToken = genForkeystoneValidateToken();

    private static HttpRequestDef<KeystoneValidateTokenRequest, KeystoneValidateTokenResponse> genForkeystoneValidateToken() {
        // basic
        HttpRequestDef.Builder<KeystoneValidateTokenRequest, KeystoneValidateTokenResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, KeystoneValidateTokenRequest.class, KeystoneValidateTokenResponse.class)
                .withUri("/v3/auth/tokens")
                .withContentType("application/json");

        // requests
        builder.withRequestField("nocatalog",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(KeystoneValidateTokenRequest::getNocatalog, (req, v) -> {
                req.setNocatalog(v);
            })
        );
        builder.withRequestField("X-Subject-Token",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(KeystoneValidateTokenRequest::getXSubjectToken, (req, v) -> {
                req.setXSubjectToken(v);
            })
        );

        // response

        builder.withResponseField(
            "X-Subject-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(
                KeystoneValidateTokenResponse::getXSubjectToken,
                KeystoneValidateTokenResponse::setXSubjectToken)
        );
        return builder.build();
    }

}
