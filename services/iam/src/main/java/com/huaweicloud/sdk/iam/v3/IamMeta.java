package com.huaweicloud.sdk.iam.v3;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.iam.v3.model.*;

@SuppressWarnings("unchecked")
public class IamMeta {

    public static final HttpRequestDef<AssociateAgencyWithAllProjectsPermissionRequest, AssociateAgencyWithAllProjectsPermissionResponse> associateAgencyWithAllProjectsPermission =
        genForassociateAgencyWithAllProjectsPermission();

    private static HttpRequestDef<AssociateAgencyWithAllProjectsPermissionRequest, AssociateAgencyWithAllProjectsPermissionResponse> genForassociateAgencyWithAllProjectsPermission() {
        // basic
        HttpRequestDef.Builder<AssociateAgencyWithAllProjectsPermissionRequest, AssociateAgencyWithAllProjectsPermissionResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    AssociateAgencyWithAllProjectsPermissionRequest.class,
                    AssociateAgencyWithAllProjectsPermissionResponse.class)
                .withName("AssociateAgencyWithAllProjectsPermission")
                .withUri(
                    "/v3.0/OS-INHERIT/domains/{domain_id}/agencies/{agency_id}/roles/{role_id}/inherited_to_projects")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("agency_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AssociateAgencyWithAllProjectsPermissionRequest::getAgencyId, (req, v) -> {
                req.setAgencyId(v);
            }));
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AssociateAgencyWithAllProjectsPermissionRequest::getDomainId, (req, v) -> {
                req.setDomainId(v);
            }));
        builder.<String>withRequestField("role_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AssociateAgencyWithAllProjectsPermissionRequest::getRoleId, (req, v) -> {
                req.setRoleId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AssociateAgencyWithDomainPermissionRequest, AssociateAgencyWithDomainPermissionResponse> associateAgencyWithDomainPermission =
        genForassociateAgencyWithDomainPermission();

    private static HttpRequestDef<AssociateAgencyWithDomainPermissionRequest, AssociateAgencyWithDomainPermissionResponse> genForassociateAgencyWithDomainPermission() {
        // basic
        HttpRequestDef.Builder<AssociateAgencyWithDomainPermissionRequest, AssociateAgencyWithDomainPermissionResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    AssociateAgencyWithDomainPermissionRequest.class,
                    AssociateAgencyWithDomainPermissionResponse.class)
                .withName("AssociateAgencyWithDomainPermission")
                .withUri("/v3.0/OS-AGENCY/domains/{domain_id}/agencies/{agency_id}/roles/{role_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AssociateAgencyWithDomainPermissionRequest::getDomainId, (req, v) -> {
                req.setDomainId(v);
            }));
        builder.<String>withRequestField("agency_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AssociateAgencyWithDomainPermissionRequest::getAgencyId, (req, v) -> {
                req.setAgencyId(v);
            }));
        builder.<String>withRequestField("role_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AssociateAgencyWithDomainPermissionRequest::getRoleId, (req, v) -> {
                req.setRoleId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AssociateAgencyWithProjectPermissionRequest, AssociateAgencyWithProjectPermissionResponse> associateAgencyWithProjectPermission =
        genForassociateAgencyWithProjectPermission();

    private static HttpRequestDef<AssociateAgencyWithProjectPermissionRequest, AssociateAgencyWithProjectPermissionResponse> genForassociateAgencyWithProjectPermission() {
        // basic
        HttpRequestDef.Builder<AssociateAgencyWithProjectPermissionRequest, AssociateAgencyWithProjectPermissionResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    AssociateAgencyWithProjectPermissionRequest.class,
                    AssociateAgencyWithProjectPermissionResponse.class)
                .withName("AssociateAgencyWithProjectPermission")
                .withUri("/v3.0/OS-AGENCY/projects/{project_id}/agencies/{agency_id}/roles/{role_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AssociateAgencyWithProjectPermissionRequest::getProjectId, (req, v) -> {
                req.setProjectId(v);
            }));
        builder.<String>withRequestField("agency_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AssociateAgencyWithProjectPermissionRequest::getAgencyId, (req, v) -> {
                req.setAgencyId(v);
            }));
        builder.<String>withRequestField("role_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AssociateAgencyWithProjectPermissionRequest::getRoleId, (req, v) -> {
                req.setRoleId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AssociateRoleToGroupOnEnterpriseProjectRequest, AssociateRoleToGroupOnEnterpriseProjectResponse> associateRoleToGroupOnEnterpriseProject =
        genForassociateRoleToGroupOnEnterpriseProject();

    private static HttpRequestDef<AssociateRoleToGroupOnEnterpriseProjectRequest, AssociateRoleToGroupOnEnterpriseProjectResponse> genForassociateRoleToGroupOnEnterpriseProject() {
        // basic
        HttpRequestDef.Builder<AssociateRoleToGroupOnEnterpriseProjectRequest, AssociateRoleToGroupOnEnterpriseProjectResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    AssociateRoleToGroupOnEnterpriseProjectRequest.class,
                    AssociateRoleToGroupOnEnterpriseProjectResponse.class)
                .withName("AssociateRoleToGroupOnEnterpriseProject")
                .withUri(
                    "/v3.0/OS-PERMISSION/enterprise-projects/{enterprise_project_id}/groups/{group_id}/roles/{role_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AssociateRoleToGroupOnEnterpriseProjectRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AssociateRoleToGroupOnEnterpriseProjectRequest::getGroupId, (req, v) -> {
                req.setGroupId(v);
            }));
        builder.<String>withRequestField("role_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AssociateRoleToGroupOnEnterpriseProjectRequest::getRoleId, (req, v) -> {
                req.setRoleId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AssociateRoleToUserOnEnterpriseProjectRequest, AssociateRoleToUserOnEnterpriseProjectResponse> associateRoleToUserOnEnterpriseProject =
        genForassociateRoleToUserOnEnterpriseProject();

    private static HttpRequestDef<AssociateRoleToUserOnEnterpriseProjectRequest, AssociateRoleToUserOnEnterpriseProjectResponse> genForassociateRoleToUserOnEnterpriseProject() {
        // basic
        HttpRequestDef.Builder<AssociateRoleToUserOnEnterpriseProjectRequest, AssociateRoleToUserOnEnterpriseProjectResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    AssociateRoleToUserOnEnterpriseProjectRequest.class,
                    AssociateRoleToUserOnEnterpriseProjectResponse.class)
                .withName("AssociateRoleToUserOnEnterpriseProject")
                .withUri(
                    "/v3.0/OS-PERMISSION/enterprise-projects/{enterprise_project_id}/users/{user_id}/roles/{role_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AssociateRoleToUserOnEnterpriseProjectRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<String>withRequestField("user_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AssociateRoleToUserOnEnterpriseProjectRequest::getUserId, (req, v) -> {
                req.setUserId(v);
            }));
        builder.<String>withRequestField("role_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AssociateRoleToUserOnEnterpriseProjectRequest::getRoleId, (req, v) -> {
                req.setRoleId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CheckAllProjectsPermissionForAgencyRequest, CheckAllProjectsPermissionForAgencyResponse> checkAllProjectsPermissionForAgency =
        genForcheckAllProjectsPermissionForAgency();

    private static HttpRequestDef<CheckAllProjectsPermissionForAgencyRequest, CheckAllProjectsPermissionForAgencyResponse> genForcheckAllProjectsPermissionForAgency() {
        // basic
        HttpRequestDef.Builder<CheckAllProjectsPermissionForAgencyRequest, CheckAllProjectsPermissionForAgencyResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.HEAD,
                    CheckAllProjectsPermissionForAgencyRequest.class,
                    CheckAllProjectsPermissionForAgencyResponse.class)
                .withName("CheckAllProjectsPermissionForAgency")
                .withUri(
                    "/v3.0/OS-INHERIT/domains/{domain_id}/agencies/{agency_id}/roles/{role_id}/inherited_to_projects")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("agency_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CheckAllProjectsPermissionForAgencyRequest::getAgencyId, (req, v) -> {
                req.setAgencyId(v);
            }));
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CheckAllProjectsPermissionForAgencyRequest::getDomainId, (req, v) -> {
                req.setDomainId(v);
            }));
        builder.<String>withRequestField("role_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CheckAllProjectsPermissionForAgencyRequest::getRoleId, (req, v) -> {
                req.setRoleId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CheckDomainPermissionForAgencyRequest, CheckDomainPermissionForAgencyResponse> checkDomainPermissionForAgency =
        genForcheckDomainPermissionForAgency();

    private static HttpRequestDef<CheckDomainPermissionForAgencyRequest, CheckDomainPermissionForAgencyResponse> genForcheckDomainPermissionForAgency() {
        // basic
        HttpRequestDef.Builder<CheckDomainPermissionForAgencyRequest, CheckDomainPermissionForAgencyResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.HEAD,
                    CheckDomainPermissionForAgencyRequest.class,
                    CheckDomainPermissionForAgencyResponse.class)
                .withName("CheckDomainPermissionForAgency")
                .withUri("/v3.0/OS-AGENCY/domains/{domain_id}/agencies/{agency_id}/roles/{role_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CheckDomainPermissionForAgencyRequest::getDomainId, (req, v) -> {
                req.setDomainId(v);
            }));
        builder.<String>withRequestField("agency_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CheckDomainPermissionForAgencyRequest::getAgencyId, (req, v) -> {
                req.setAgencyId(v);
            }));
        builder.<String>withRequestField("role_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CheckDomainPermissionForAgencyRequest::getRoleId, (req, v) -> {
                req.setRoleId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CheckProjectPermissionForAgencyRequest, CheckProjectPermissionForAgencyResponse> checkProjectPermissionForAgency =
        genForcheckProjectPermissionForAgency();

    private static HttpRequestDef<CheckProjectPermissionForAgencyRequest, CheckProjectPermissionForAgencyResponse> genForcheckProjectPermissionForAgency() {
        // basic
        HttpRequestDef.Builder<CheckProjectPermissionForAgencyRequest, CheckProjectPermissionForAgencyResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.HEAD,
                    CheckProjectPermissionForAgencyRequest.class,
                    CheckProjectPermissionForAgencyResponse.class)
                .withName("CheckProjectPermissionForAgency")
                .withUri("/v3.0/OS-AGENCY/projects/{project_id}/agencies/{agency_id}/roles/{role_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CheckProjectPermissionForAgencyRequest::getProjectId, (req, v) -> {
                req.setProjectId(v);
            }));
        builder.<String>withRequestField("agency_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CheckProjectPermissionForAgencyRequest::getAgencyId, (req, v) -> {
                req.setAgencyId(v);
            }));
        builder.<String>withRequestField("role_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CheckProjectPermissionForAgencyRequest::getRoleId, (req, v) -> {
                req.setRoleId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateAgencyRequest, CreateAgencyResponse> createAgency = genForcreateAgency();

    private static HttpRequestDef<CreateAgencyRequest, CreateAgencyResponse> genForcreateAgency() {
        // basic
        HttpRequestDef.Builder<CreateAgencyRequest, CreateAgencyResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateAgencyRequest.class, CreateAgencyResponse.class)
                .withName("CreateAgency")
                .withUri("/v3.0/OS-AGENCY/agencies")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<CreateAgencyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateAgencyRequestBody.class),
            f -> f.withMarshaller(CreateAgencyRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateAgencyCustomPolicyRequest, CreateAgencyCustomPolicyResponse> createAgencyCustomPolicy =
        genForcreateAgencyCustomPolicy();

    private static HttpRequestDef<CreateAgencyCustomPolicyRequest, CreateAgencyCustomPolicyResponse> genForcreateAgencyCustomPolicy() {
        // basic
        HttpRequestDef.Builder<CreateAgencyCustomPolicyRequest, CreateAgencyCustomPolicyResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, CreateAgencyCustomPolicyRequest.class, CreateAgencyCustomPolicyResponse.class)
                .withName("CreateAgencyCustomPolicy")
                .withUri("/v3.0/OS-ROLE/roles")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<CreateAgencyCustomPolicyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateAgencyCustomPolicyRequestBody.class),
            f -> f.withMarshaller(CreateAgencyCustomPolicyRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateCloudServiceCustomPolicyRequest, CreateCloudServiceCustomPolicyResponse> createCloudServiceCustomPolicy =
        genForcreateCloudServiceCustomPolicy();

    private static HttpRequestDef<CreateCloudServiceCustomPolicyRequest, CreateCloudServiceCustomPolicyResponse> genForcreateCloudServiceCustomPolicy() {
        // basic
        HttpRequestDef.Builder<CreateCloudServiceCustomPolicyRequest, CreateCloudServiceCustomPolicyResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateCloudServiceCustomPolicyRequest.class,
                    CreateCloudServiceCustomPolicyResponse.class)
                .withName("CreateCloudServiceCustomPolicy")
                .withUri("/v3.0/OS-ROLE/roles")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<CreateCloudServiceCustomPolicyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateCloudServiceCustomPolicyRequestBody.class),
            f -> f.withMarshaller(CreateCloudServiceCustomPolicyRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateLoginTokenRequest, CreateLoginTokenResponse> createLoginToken =
        genForcreateLoginToken();

    private static HttpRequestDef<CreateLoginTokenRequest, CreateLoginTokenResponse> genForcreateLoginToken() {
        // basic
        HttpRequestDef.Builder<CreateLoginTokenRequest, CreateLoginTokenResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateLoginTokenRequest.class, CreateLoginTokenResponse.class)
                .withName("CreateLoginToken")
                .withUri("/v3.0/OS-AUTH/securitytoken/logintokens")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<CreateLoginTokenRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateLoginTokenRequestBody.class),
            f -> f.withMarshaller(CreateLoginTokenRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        builder.<String>withResponseField("X-Subject-LoginToken",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateLoginTokenResponse::getXSubjectLoginToken,
                CreateLoginTokenResponse::setXSubjectLoginToken));
        return builder.build();
    }

    public static final HttpRequestDef<CreateMetadataRequest, CreateMetadataResponse> createMetadata =
        genForcreateMetadata();

    private static HttpRequestDef<CreateMetadataRequest, CreateMetadataResponse> genForcreateMetadata() {
        // basic
        HttpRequestDef.Builder<CreateMetadataRequest, CreateMetadataResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateMetadataRequest.class, CreateMetadataResponse.class)
                .withName("CreateMetadata")
                .withUri("/v3-ext/OS-FEDERATION/identity_providers/{idp_id}/protocols/{protocol_id}/metadata")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("idp_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateMetadataRequest::getIdpId, (req, v) -> {
                req.setIdpId(v);
            }));
        builder.<String>withRequestField("protocol_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateMetadataRequest::getProtocolId, (req, v) -> {
                req.setProtocolId(v);
            }));
        builder.<CreateMetadataRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateMetadataRequestBody.class),
            f -> f.withMarshaller(CreateMetadataRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateOpenIdConnectConfigRequest, CreateOpenIdConnectConfigResponse> createOpenIdConnectConfig =
        genForcreateOpenIdConnectConfig();

    private static HttpRequestDef<CreateOpenIdConnectConfigRequest, CreateOpenIdConnectConfigResponse> genForcreateOpenIdConnectConfig() {
        // basic
        HttpRequestDef.Builder<CreateOpenIdConnectConfigRequest, CreateOpenIdConnectConfigResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateOpenIdConnectConfigRequest.class,
                    CreateOpenIdConnectConfigResponse.class)
                .withName("CreateOpenIdConnectConfig")
                .withUri("/v3.0/OS-FEDERATION/identity-providers/{idp_id}/openid-connect-config")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("idp_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateOpenIdConnectConfigRequest::getIdpId, (req, v) -> {
                req.setIdpId(v);
            }));
        builder.<CreateOpenIdConnectConfigRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateOpenIdConnectConfigRequestBody.class),
            f -> f.withMarshaller(CreateOpenIdConnectConfigRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateTokenWithIdTokenRequest, CreateTokenWithIdTokenResponse> createTokenWithIdToken =
        genForcreateTokenWithIdToken();

    private static HttpRequestDef<CreateTokenWithIdTokenRequest, CreateTokenWithIdTokenResponse> genForcreateTokenWithIdToken() {
        // basic
        HttpRequestDef.Builder<CreateTokenWithIdTokenRequest, CreateTokenWithIdTokenResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateTokenWithIdTokenRequest.class, CreateTokenWithIdTokenResponse.class)
            .withName("CreateTokenWithIdToken")
            .withUri("/v3.0/OS-AUTH/id-token/tokens")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("X-Idp-Id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateTokenWithIdTokenRequest::getXIdpId, (req, v) -> {
                req.setXIdpId(v);
            }));
        builder.<GetIdTokenRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(GetIdTokenRequestBody.class),
            f -> f.withMarshaller(CreateTokenWithIdTokenRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        builder.<String>withResponseField("X-Subject-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateTokenWithIdTokenResponse::getXSubjectToken,
                CreateTokenWithIdTokenResponse::setXSubjectToken));
        return builder.build();
    }

    public static final HttpRequestDef<CreateUnscopedTokenWithIdTokenRequest, CreateUnscopedTokenWithIdTokenResponse> createUnscopedTokenWithIdToken =
        genForcreateUnscopedTokenWithIdToken();

    private static HttpRequestDef<CreateUnscopedTokenWithIdTokenRequest, CreateUnscopedTokenWithIdTokenResponse> genForcreateUnscopedTokenWithIdToken() {
        // basic
        HttpRequestDef.Builder<CreateUnscopedTokenWithIdTokenRequest, CreateUnscopedTokenWithIdTokenResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateUnscopedTokenWithIdTokenRequest.class,
                    CreateUnscopedTokenWithIdTokenResponse.class)
                .withName("CreateUnscopedTokenWithIdToken")
                .withUri("/v3/OS-FEDERATION/identity_providers/{idp_id}/protocols/{protocol_id}/auth")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("idp_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateUnscopedTokenWithIdTokenRequest::getIdpId, (req, v) -> {
                req.setIdpId(v);
            }));
        builder.<String>withRequestField("protocol_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateUnscopedTokenWithIdTokenRequest::getProtocolId, (req, v) -> {
                req.setProtocolId(v);
            }));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateUnscopedTokenWithIdTokenRequest::getAuthorization, (req, v) -> {
                req.setAuthorization(v);
            }));

        // response

        builder.<String>withResponseField("X-Subject-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateUnscopedTokenWithIdTokenResponse::getXSubjectToken,
                CreateUnscopedTokenWithIdTokenResponse::setXSubjectToken));
        return builder.build();
    }

    public static final HttpRequestDef<DeleteAgencyRequest, DeleteAgencyResponse> deleteAgency = genFordeleteAgency();

    private static HttpRequestDef<DeleteAgencyRequest, DeleteAgencyResponse> genFordeleteAgency() {
        // basic
        HttpRequestDef.Builder<DeleteAgencyRequest, DeleteAgencyResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteAgencyRequest.class, DeleteAgencyResponse.class)
                .withName("DeleteAgency")
                .withUri("/v3.0/OS-AGENCY/agencies/{agency_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("agency_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAgencyRequest::getAgencyId, (req, v) -> {
                req.setAgencyId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteCustomPolicyRequest, DeleteCustomPolicyResponse> deleteCustomPolicy =
        genFordeleteCustomPolicy();

    private static HttpRequestDef<DeleteCustomPolicyRequest, DeleteCustomPolicyResponse> genFordeleteCustomPolicy() {
        // basic
        HttpRequestDef.Builder<DeleteCustomPolicyRequest, DeleteCustomPolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteCustomPolicyRequest.class, DeleteCustomPolicyResponse.class)
                .withName("DeleteCustomPolicy")
                .withUri("/v3.0/OS-ROLE/roles/{role_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("role_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteCustomPolicyRequest::getRoleId, (req, v) -> {
                req.setRoleId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteDomainGroupInheritedRoleRequest, DeleteDomainGroupInheritedRoleResponse> deleteDomainGroupInheritedRole =
        genFordeleteDomainGroupInheritedRole();

    private static HttpRequestDef<DeleteDomainGroupInheritedRoleRequest, DeleteDomainGroupInheritedRoleResponse> genFordeleteDomainGroupInheritedRole() {
        // basic
        HttpRequestDef.Builder<DeleteDomainGroupInheritedRoleRequest, DeleteDomainGroupInheritedRoleResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteDomainGroupInheritedRoleRequest.class,
                    DeleteDomainGroupInheritedRoleResponse.class)
                .withName("DeleteDomainGroupInheritedRole")
                .withUri("/v3/OS-INHERIT/domains/{domain_id}/groups/{group_id}/roles/{role_id}/inherited_to_projects")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDomainGroupInheritedRoleRequest::getDomainId, (req, v) -> {
                req.setDomainId(v);
            }));
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDomainGroupInheritedRoleRequest::getGroupId, (req, v) -> {
                req.setGroupId(v);
            }));
        builder.<String>withRequestField("role_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDomainGroupInheritedRoleRequest::getRoleId, (req, v) -> {
                req.setRoleId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<KeystoneAddUserToGroupRequest, KeystoneAddUserToGroupResponse> keystoneAddUserToGroup =
        genForkeystoneAddUserToGroup();

    private static HttpRequestDef<KeystoneAddUserToGroupRequest, KeystoneAddUserToGroupResponse> genForkeystoneAddUserToGroup() {
        // basic
        HttpRequestDef.Builder<KeystoneAddUserToGroupRequest, KeystoneAddUserToGroupResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, KeystoneAddUserToGroupRequest.class, KeystoneAddUserToGroupResponse.class)
            .withName("KeystoneAddUserToGroup")
            .withUri("/v3/groups/{group_id}/users/{user_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(KeystoneAddUserToGroupRequest::getGroupId, (req, v) -> {
                req.setGroupId(v);
            }));
        builder.<String>withRequestField("user_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(KeystoneAddUserToGroupRequest::getUserId, (req, v) -> {
                req.setUserId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<KeystoneAssociateGroupWithDomainPermissionRequest, KeystoneAssociateGroupWithDomainPermissionResponse> keystoneAssociateGroupWithDomainPermission =
        genForkeystoneAssociateGroupWithDomainPermission();

    private static HttpRequestDef<KeystoneAssociateGroupWithDomainPermissionRequest, KeystoneAssociateGroupWithDomainPermissionResponse> genForkeystoneAssociateGroupWithDomainPermission() {
        // basic
        HttpRequestDef.Builder<KeystoneAssociateGroupWithDomainPermissionRequest, KeystoneAssociateGroupWithDomainPermissionResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    KeystoneAssociateGroupWithDomainPermissionRequest.class,
                    KeystoneAssociateGroupWithDomainPermissionResponse.class)
                .withName("KeystoneAssociateGroupWithDomainPermission")
                .withUri("/v3/domains/{domain_id}/groups/{group_id}/roles/{role_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(KeystoneAssociateGroupWithDomainPermissionRequest::getDomainId, (req, v) -> {
                req.setDomainId(v);
            }));
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(KeystoneAssociateGroupWithDomainPermissionRequest::getGroupId, (req, v) -> {
                req.setGroupId(v);
            }));
        builder.<String>withRequestField("role_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(KeystoneAssociateGroupWithDomainPermissionRequest::getRoleId, (req, v) -> {
                req.setRoleId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<KeystoneAssociateGroupWithProjectPermissionRequest, KeystoneAssociateGroupWithProjectPermissionResponse> keystoneAssociateGroupWithProjectPermission =
        genForkeystoneAssociateGroupWithProjectPermission();

    private static HttpRequestDef<KeystoneAssociateGroupWithProjectPermissionRequest, KeystoneAssociateGroupWithProjectPermissionResponse> genForkeystoneAssociateGroupWithProjectPermission() {
        // basic
        HttpRequestDef.Builder<KeystoneAssociateGroupWithProjectPermissionRequest, KeystoneAssociateGroupWithProjectPermissionResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    KeystoneAssociateGroupWithProjectPermissionRequest.class,
                    KeystoneAssociateGroupWithProjectPermissionResponse.class)
                .withName("KeystoneAssociateGroupWithProjectPermission")
                .withUri("/v3/projects/{project_id}/groups/{group_id}/roles/{role_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(KeystoneAssociateGroupWithProjectPermissionRequest::getProjectId, (req, v) -> {
                req.setProjectId(v);
            }));
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(KeystoneAssociateGroupWithProjectPermissionRequest::getGroupId, (req, v) -> {
                req.setGroupId(v);
            }));
        builder.<String>withRequestField("role_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(KeystoneAssociateGroupWithProjectPermissionRequest::getRoleId, (req, v) -> {
                req.setRoleId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<KeystoneCheckDomainPermissionForGroupRequest, KeystoneCheckDomainPermissionForGroupResponse> keystoneCheckDomainPermissionForGroup =
        genForkeystoneCheckDomainPermissionForGroup();

    private static HttpRequestDef<KeystoneCheckDomainPermissionForGroupRequest, KeystoneCheckDomainPermissionForGroupResponse> genForkeystoneCheckDomainPermissionForGroup() {
        // basic
        HttpRequestDef.Builder<KeystoneCheckDomainPermissionForGroupRequest, KeystoneCheckDomainPermissionForGroupResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.HEAD,
                    KeystoneCheckDomainPermissionForGroupRequest.class,
                    KeystoneCheckDomainPermissionForGroupResponse.class)
                .withName("KeystoneCheckDomainPermissionForGroup")
                .withUri("/v3/domains/{domain_id}/groups/{group_id}/roles/{role_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(KeystoneCheckDomainPermissionForGroupRequest::getDomainId, (req, v) -> {
                req.setDomainId(v);
            }));
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(KeystoneCheckDomainPermissionForGroupRequest::getGroupId, (req, v) -> {
                req.setGroupId(v);
            }));
        builder.<String>withRequestField("role_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(KeystoneCheckDomainPermissionForGroupRequest::getRoleId, (req, v) -> {
                req.setRoleId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<KeystoneCheckProjectPermissionForGroupRequest, KeystoneCheckProjectPermissionForGroupResponse> keystoneCheckProjectPermissionForGroup =
        genForkeystoneCheckProjectPermissionForGroup();

    private static HttpRequestDef<KeystoneCheckProjectPermissionForGroupRequest, KeystoneCheckProjectPermissionForGroupResponse> genForkeystoneCheckProjectPermissionForGroup() {
        // basic
        HttpRequestDef.Builder<KeystoneCheckProjectPermissionForGroupRequest, KeystoneCheckProjectPermissionForGroupResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.HEAD,
                    KeystoneCheckProjectPermissionForGroupRequest.class,
                    KeystoneCheckProjectPermissionForGroupResponse.class)
                .withName("KeystoneCheckProjectPermissionForGroup")
                .withUri("/v3/projects/{project_id}/groups/{group_id}/roles/{role_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(KeystoneCheckProjectPermissionForGroupRequest::getProjectId, (req, v) -> {
                req.setProjectId(v);
            }));
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(KeystoneCheckProjectPermissionForGroupRequest::getGroupId, (req, v) -> {
                req.setGroupId(v);
            }));
        builder.<String>withRequestField("role_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(KeystoneCheckProjectPermissionForGroupRequest::getRoleId, (req, v) -> {
                req.setRoleId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<KeystoneCheckUserInGroupRequest, KeystoneCheckUserInGroupResponse> keystoneCheckUserInGroup =
        genForkeystoneCheckUserInGroup();

    private static HttpRequestDef<KeystoneCheckUserInGroupRequest, KeystoneCheckUserInGroupResponse> genForkeystoneCheckUserInGroup() {
        // basic
        HttpRequestDef.Builder<KeystoneCheckUserInGroupRequest, KeystoneCheckUserInGroupResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.HEAD, KeystoneCheckUserInGroupRequest.class, KeystoneCheckUserInGroupResponse.class)
                .withName("KeystoneCheckUserInGroup")
                .withUri("/v3/groups/{group_id}/users/{user_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(KeystoneCheckUserInGroupRequest::getGroupId, (req, v) -> {
                req.setGroupId(v);
            }));
        builder.<String>withRequestField("user_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(KeystoneCheckUserInGroupRequest::getUserId, (req, v) -> {
                req.setUserId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<KeystoneCheckroleForGroupRequest, KeystoneCheckroleForGroupResponse> keystoneCheckroleForGroup =
        genForkeystoneCheckroleForGroup();

    private static HttpRequestDef<KeystoneCheckroleForGroupRequest, KeystoneCheckroleForGroupResponse> genForkeystoneCheckroleForGroup() {
        // basic
        HttpRequestDef.Builder<KeystoneCheckroleForGroupRequest, KeystoneCheckroleForGroupResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.HEAD,
                    KeystoneCheckroleForGroupRequest.class,
                    KeystoneCheckroleForGroupResponse.class)
                .withName("KeystoneCheckroleForGroup")
                .withUri("/v3/OS-INHERIT/domains/{domain_id}/groups/{group_id}/roles/{role_id}/inherited_to_projects")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(KeystoneCheckroleForGroupRequest::getDomainId, (req, v) -> {
                req.setDomainId(v);
            }));
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(KeystoneCheckroleForGroupRequest::getGroupId, (req, v) -> {
                req.setGroupId(v);
            }));
        builder.<String>withRequestField("role_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(KeystoneCheckroleForGroupRequest::getRoleId, (req, v) -> {
                req.setRoleId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<KeystoneCreateGroupRequest, KeystoneCreateGroupResponse> keystoneCreateGroup =
        genForkeystoneCreateGroup();

    private static HttpRequestDef<KeystoneCreateGroupRequest, KeystoneCreateGroupResponse> genForkeystoneCreateGroup() {
        // basic
        HttpRequestDef.Builder<KeystoneCreateGroupRequest, KeystoneCreateGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, KeystoneCreateGroupRequest.class, KeystoneCreateGroupResponse.class)
                .withName("KeystoneCreateGroup")
                .withUri("/v3/groups")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<KeystoneCreateGroupRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(KeystoneCreateGroupRequestBody.class),
            f -> f.withMarshaller(KeystoneCreateGroupRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<KeystoneCreateIdentityProviderRequest, KeystoneCreateIdentityProviderResponse> keystoneCreateIdentityProvider =
        genForkeystoneCreateIdentityProvider();

    private static HttpRequestDef<KeystoneCreateIdentityProviderRequest, KeystoneCreateIdentityProviderResponse> genForkeystoneCreateIdentityProvider() {
        // basic
        HttpRequestDef.Builder<KeystoneCreateIdentityProviderRequest, KeystoneCreateIdentityProviderResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    KeystoneCreateIdentityProviderRequest.class,
                    KeystoneCreateIdentityProviderResponse.class)
                .withName("KeystoneCreateIdentityProvider")
                .withUri("/v3/OS-FEDERATION/identity_providers/{id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(KeystoneCreateIdentityProviderRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<KeystoneCreateIdentityProviderRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(KeystoneCreateIdentityProviderRequestBody.class),
            f -> f.withMarshaller(KeystoneCreateIdentityProviderRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<KeystoneCreateMappingRequest, KeystoneCreateMappingResponse> keystoneCreateMapping =
        genForkeystoneCreateMapping();

    private static HttpRequestDef<KeystoneCreateMappingRequest, KeystoneCreateMappingResponse> genForkeystoneCreateMapping() {
        // basic
        HttpRequestDef.Builder<KeystoneCreateMappingRequest, KeystoneCreateMappingResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, KeystoneCreateMappingRequest.class, KeystoneCreateMappingResponse.class)
            .withName("KeystoneCreateMapping")
            .withUri("/v3/OS-FEDERATION/mappings/{id}")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(KeystoneCreateMappingRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<KeystoneCreateMappingRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(KeystoneCreateMappingRequestBody.class),
            f -> f.withMarshaller(KeystoneCreateMappingRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<KeystoneCreateProjectRequest, KeystoneCreateProjectResponse> keystoneCreateProject =
        genForkeystoneCreateProject();

    private static HttpRequestDef<KeystoneCreateProjectRequest, KeystoneCreateProjectResponse> genForkeystoneCreateProject() {
        // basic
        HttpRequestDef.Builder<KeystoneCreateProjectRequest, KeystoneCreateProjectResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, KeystoneCreateProjectRequest.class, KeystoneCreateProjectResponse.class)
            .withName("KeystoneCreateProject")
            .withUri("/v3/projects")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<KeystoneCreateProjectRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(KeystoneCreateProjectRequestBody.class),
            f -> f.withMarshaller(KeystoneCreateProjectRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<KeystoneCreateProtocolRequest, KeystoneCreateProtocolResponse> keystoneCreateProtocol =
        genForkeystoneCreateProtocol();

    private static HttpRequestDef<KeystoneCreateProtocolRequest, KeystoneCreateProtocolResponse> genForkeystoneCreateProtocol() {
        // basic
        HttpRequestDef.Builder<KeystoneCreateProtocolRequest, KeystoneCreateProtocolResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, KeystoneCreateProtocolRequest.class, KeystoneCreateProtocolResponse.class)
            .withName("KeystoneCreateProtocol")
            .withUri("/v3/OS-FEDERATION/identity_providers/{idp_id}/protocols/{protocol_id}")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("idp_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(KeystoneCreateProtocolRequest::getIdpId, (req, v) -> {
                req.setIdpId(v);
            }));
        builder.<String>withRequestField("protocol_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(KeystoneCreateProtocolRequest::getProtocolId, (req, v) -> {
                req.setProtocolId(v);
            }));
        builder.<KeystoneCreateProtocolRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(KeystoneCreateProtocolRequestBody.class),
            f -> f.withMarshaller(KeystoneCreateProtocolRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<KeystoneCreateScopedTokenRequest, KeystoneCreateScopedTokenResponse> keystoneCreateScopedToken =
        genForkeystoneCreateScopedToken();

    private static HttpRequestDef<KeystoneCreateScopedTokenRequest, KeystoneCreateScopedTokenResponse> genForkeystoneCreateScopedToken() {
        // basic
        HttpRequestDef.Builder<KeystoneCreateScopedTokenRequest, KeystoneCreateScopedTokenResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    KeystoneCreateScopedTokenRequest.class,
                    KeystoneCreateScopedTokenResponse.class)
                .withName("KeystoneCreateScopedToken")
                .withUri("/v3/auth/tokens")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<KeystoneCreateScopedTokenRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(KeystoneCreateScopedTokenRequestBody.class),
            f -> f.withMarshaller(KeystoneCreateScopedTokenRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        builder.<String>withResponseField("X-Subject-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(KeystoneCreateScopedTokenResponse::getXSubjectToken,
                KeystoneCreateScopedTokenResponse::setXSubjectToken));
        return builder.build();
    }

    public static final HttpRequestDef<KeystoneDeleteGroupRequest, KeystoneDeleteGroupResponse> keystoneDeleteGroup =
        genForkeystoneDeleteGroup();

    private static HttpRequestDef<KeystoneDeleteGroupRequest, KeystoneDeleteGroupResponse> genForkeystoneDeleteGroup() {
        // basic
        HttpRequestDef.Builder<KeystoneDeleteGroupRequest, KeystoneDeleteGroupResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, KeystoneDeleteGroupRequest.class, KeystoneDeleteGroupResponse.class)
            .withName("KeystoneDeleteGroup")
            .withUri("/v3/groups/{group_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(KeystoneDeleteGroupRequest::getGroupId, (req, v) -> {
                req.setGroupId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<KeystoneDeleteIdentityProviderRequest, KeystoneDeleteIdentityProviderResponse> keystoneDeleteIdentityProvider =
        genForkeystoneDeleteIdentityProvider();

    private static HttpRequestDef<KeystoneDeleteIdentityProviderRequest, KeystoneDeleteIdentityProviderResponse> genForkeystoneDeleteIdentityProvider() {
        // basic
        HttpRequestDef.Builder<KeystoneDeleteIdentityProviderRequest, KeystoneDeleteIdentityProviderResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    KeystoneDeleteIdentityProviderRequest.class,
                    KeystoneDeleteIdentityProviderResponse.class)
                .withName("KeystoneDeleteIdentityProvider")
                .withUri("/v3/OS-FEDERATION/identity_providers/{id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(KeystoneDeleteIdentityProviderRequest::getId, (req, v) -> {
                req.setId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<KeystoneDeleteMappingRequest, KeystoneDeleteMappingResponse> keystoneDeleteMapping =
        genForkeystoneDeleteMapping();

    private static HttpRequestDef<KeystoneDeleteMappingRequest, KeystoneDeleteMappingResponse> genForkeystoneDeleteMapping() {
        // basic
        HttpRequestDef.Builder<KeystoneDeleteMappingRequest, KeystoneDeleteMappingResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, KeystoneDeleteMappingRequest.class, KeystoneDeleteMappingResponse.class)
            .withName("KeystoneDeleteMapping")
            .withUri("/v3/OS-FEDERATION/mappings/{id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(KeystoneDeleteMappingRequest::getId, (req, v) -> {
                req.setId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<KeystoneDeleteProtocolRequest, KeystoneDeleteProtocolResponse> keystoneDeleteProtocol =
        genForkeystoneDeleteProtocol();

    private static HttpRequestDef<KeystoneDeleteProtocolRequest, KeystoneDeleteProtocolResponse> genForkeystoneDeleteProtocol() {
        // basic
        HttpRequestDef.Builder<KeystoneDeleteProtocolRequest, KeystoneDeleteProtocolResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, KeystoneDeleteProtocolRequest.class, KeystoneDeleteProtocolResponse.class)
            .withName("KeystoneDeleteProtocol")
            .withUri("/v3/OS-FEDERATION/identity_providers/{idp_id}/protocols/{protocol_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("idp_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(KeystoneDeleteProtocolRequest::getIdpId, (req, v) -> {
                req.setIdpId(v);
            }));
        builder.<String>withRequestField("protocol_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(KeystoneDeleteProtocolRequest::getProtocolId, (req, v) -> {
                req.setProtocolId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<KeystoneListAllProjectPermissionsForGroupRequest, KeystoneListAllProjectPermissionsForGroupResponse> keystoneListAllProjectPermissionsForGroup =
        genForkeystoneListAllProjectPermissionsForGroup();

    private static HttpRequestDef<KeystoneListAllProjectPermissionsForGroupRequest, KeystoneListAllProjectPermissionsForGroupResponse> genForkeystoneListAllProjectPermissionsForGroup() {
        // basic
        HttpRequestDef.Builder<KeystoneListAllProjectPermissionsForGroupRequest, KeystoneListAllProjectPermissionsForGroupResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    KeystoneListAllProjectPermissionsForGroupRequest.class,
                    KeystoneListAllProjectPermissionsForGroupResponse.class)
                .withName("KeystoneListAllProjectPermissionsForGroup")
                .withUri("/v3/OS-INHERIT/domains/{domain_id}/groups/{group_id}/roles/inherited_to_projects")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(KeystoneListAllProjectPermissionsForGroupRequest::getDomainId, (req, v) -> {
                req.setDomainId(v);
            }));
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(KeystoneListAllProjectPermissionsForGroupRequest::getGroupId, (req, v) -> {
                req.setGroupId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<KeystoneListAuthDomainsRequest, KeystoneListAuthDomainsResponse> keystoneListAuthDomains =
        genForkeystoneListAuthDomains();

    private static HttpRequestDef<KeystoneListAuthDomainsRequest, KeystoneListAuthDomainsResponse> genForkeystoneListAuthDomains() {
        // basic
        HttpRequestDef.Builder<KeystoneListAuthDomainsRequest, KeystoneListAuthDomainsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, KeystoneListAuthDomainsRequest.class, KeystoneListAuthDomainsResponse.class)
            .withName("KeystoneListAuthDomains")
            .withUri("/v3/auth/domains")
            .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<KeystoneListAuthProjectsRequest, KeystoneListAuthProjectsResponse> keystoneListAuthProjects =
        genForkeystoneListAuthProjects();

    private static HttpRequestDef<KeystoneListAuthProjectsRequest, KeystoneListAuthProjectsResponse> genForkeystoneListAuthProjects() {
        // basic
        HttpRequestDef.Builder<KeystoneListAuthProjectsRequest, KeystoneListAuthProjectsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, KeystoneListAuthProjectsRequest.class, KeystoneListAuthProjectsResponse.class)
                .withName("KeystoneListAuthProjects")
                .withUri("/v3/auth/projects")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<KeystoneListDomainPermissionsForGroupRequest, KeystoneListDomainPermissionsForGroupResponse> keystoneListDomainPermissionsForGroup =
        genForkeystoneListDomainPermissionsForGroup();

    private static HttpRequestDef<KeystoneListDomainPermissionsForGroupRequest, KeystoneListDomainPermissionsForGroupResponse> genForkeystoneListDomainPermissionsForGroup() {
        // basic
        HttpRequestDef.Builder<KeystoneListDomainPermissionsForGroupRequest, KeystoneListDomainPermissionsForGroupResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    KeystoneListDomainPermissionsForGroupRequest.class,
                    KeystoneListDomainPermissionsForGroupResponse.class)
                .withName("KeystoneListDomainPermissionsForGroup")
                .withUri("/v3/domains/{domain_id}/groups/{group_id}/roles")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(KeystoneListDomainPermissionsForGroupRequest::getDomainId, (req, v) -> {
                req.setDomainId(v);
            }));
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(KeystoneListDomainPermissionsForGroupRequest::getGroupId, (req, v) -> {
                req.setGroupId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<KeystoneListEndpointsRequest, KeystoneListEndpointsResponse> keystoneListEndpoints =
        genForkeystoneListEndpoints();

    private static HttpRequestDef<KeystoneListEndpointsRequest, KeystoneListEndpointsResponse> genForkeystoneListEndpoints() {
        // basic
        HttpRequestDef.Builder<KeystoneListEndpointsRequest, KeystoneListEndpointsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, KeystoneListEndpointsRequest.class, KeystoneListEndpointsResponse.class)
            .withName("KeystoneListEndpoints")
            .withUri("/v3/endpoints")
            .withContentType("application/json");

        // requests
        builder.<KeystoneListEndpointsRequest.InterfaceEnum>withRequestField("interface",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(KeystoneListEndpointsRequest.InterfaceEnum.class),
            f -> f.withMarshaller(KeystoneListEndpointsRequest::getInterface, (req, v) -> {
                req.setInterface(v);
            }));
        builder.<String>withRequestField("service_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(KeystoneListEndpointsRequest::getServiceId, (req, v) -> {
                req.setServiceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<KeystoneListFederationDomainsRequest, KeystoneListFederationDomainsResponse> keystoneListFederationDomains =
        genForkeystoneListFederationDomains();

    private static HttpRequestDef<KeystoneListFederationDomainsRequest, KeystoneListFederationDomainsResponse> genForkeystoneListFederationDomains() {
        // basic
        HttpRequestDef.Builder<KeystoneListFederationDomainsRequest, KeystoneListFederationDomainsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    KeystoneListFederationDomainsRequest.class,
                    KeystoneListFederationDomainsResponse.class)
                .withName("KeystoneListFederationDomains")
                .withUri("/v3/OS-FEDERATION/domains")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<KeystoneListGroupsRequest, KeystoneListGroupsResponse> keystoneListGroups =
        genForkeystoneListGroups();

    private static HttpRequestDef<KeystoneListGroupsRequest, KeystoneListGroupsResponse> genForkeystoneListGroups() {
        // basic
        HttpRequestDef.Builder<KeystoneListGroupsRequest, KeystoneListGroupsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, KeystoneListGroupsRequest.class, KeystoneListGroupsResponse.class)
                .withName("KeystoneListGroups")
                .withUri("/v3/groups")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(KeystoneListGroupsRequest::getDomainId, (req, v) -> {
                req.setDomainId(v);
            }));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(KeystoneListGroupsRequest::getName, (req, v) -> {
                req.setName(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<KeystoneListIdentityProvidersRequest, KeystoneListIdentityProvidersResponse> keystoneListIdentityProviders =
        genForkeystoneListIdentityProviders();

    private static HttpRequestDef<KeystoneListIdentityProvidersRequest, KeystoneListIdentityProvidersResponse> genForkeystoneListIdentityProviders() {
        // basic
        HttpRequestDef.Builder<KeystoneListIdentityProvidersRequest, KeystoneListIdentityProvidersResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    KeystoneListIdentityProvidersRequest.class,
                    KeystoneListIdentityProvidersResponse.class)
                .withName("KeystoneListIdentityProviders")
                .withUri("/v3/OS-FEDERATION/identity_providers")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<KeystoneListMappingsRequest, KeystoneListMappingsResponse> keystoneListMappings =
        genForkeystoneListMappings();

    private static HttpRequestDef<KeystoneListMappingsRequest, KeystoneListMappingsResponse> genForkeystoneListMappings() {
        // basic
        HttpRequestDef.Builder<KeystoneListMappingsRequest, KeystoneListMappingsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, KeystoneListMappingsRequest.class, KeystoneListMappingsResponse.class)
            .withName("KeystoneListMappings")
            .withUri("/v3/OS-FEDERATION/mappings")
            .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<KeystoneListPermissionsRequest, KeystoneListPermissionsResponse> keystoneListPermissions =
        genForkeystoneListPermissions();

    private static HttpRequestDef<KeystoneListPermissionsRequest, KeystoneListPermissionsResponse> genForkeystoneListPermissions() {
        // basic
        HttpRequestDef.Builder<KeystoneListPermissionsRequest, KeystoneListPermissionsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, KeystoneListPermissionsRequest.class, KeystoneListPermissionsResponse.class)
            .withName("KeystoneListPermissions")
            .withUri("/v3/roles")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(KeystoneListPermissionsRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<String>withRequestField("domain_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(KeystoneListPermissionsRequest::getDomainId, (req, v) -> {
                req.setDomainId(v);
            }));
        builder.<Integer>withRequestField("page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(KeystoneListPermissionsRequest::getPage, (req, v) -> {
                req.setPage(v);
            }));
        builder.<Integer>withRequestField("per_page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(KeystoneListPermissionsRequest::getPerPage, (req, v) -> {
                req.setPerPage(v);
            }));
        builder.<String>withRequestField("permission_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(KeystoneListPermissionsRequest::getPermissionType, (req, v) -> {
                req.setPermissionType(v);
            }));
        builder.<String>withRequestField("display_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(KeystoneListPermissionsRequest::getDisplayName, (req, v) -> {
                req.setDisplayName(v);
            }));
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(KeystoneListPermissionsRequest::getType, (req, v) -> {
                req.setType(v);
            }));
        builder.<String>withRequestField("catalog",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(KeystoneListPermissionsRequest::getCatalog, (req, v) -> {
                req.setCatalog(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<KeystoneListProjectPermissionsForGroupRequest, KeystoneListProjectPermissionsForGroupResponse> keystoneListProjectPermissionsForGroup =
        genForkeystoneListProjectPermissionsForGroup();

    private static HttpRequestDef<KeystoneListProjectPermissionsForGroupRequest, KeystoneListProjectPermissionsForGroupResponse> genForkeystoneListProjectPermissionsForGroup() {
        // basic
        HttpRequestDef.Builder<KeystoneListProjectPermissionsForGroupRequest, KeystoneListProjectPermissionsForGroupResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    KeystoneListProjectPermissionsForGroupRequest.class,
                    KeystoneListProjectPermissionsForGroupResponse.class)
                .withName("KeystoneListProjectPermissionsForGroup")
                .withUri("/v3/projects/{project_id}/groups/{group_id}/roles")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(KeystoneListProjectPermissionsForGroupRequest::getProjectId, (req, v) -> {
                req.setProjectId(v);
            }));
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(KeystoneListProjectPermissionsForGroupRequest::getGroupId, (req, v) -> {
                req.setGroupId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<KeystoneListProjectsRequest, KeystoneListProjectsResponse> keystoneListProjects =
        genForkeystoneListProjects();

    private static HttpRequestDef<KeystoneListProjectsRequest, KeystoneListProjectsResponse> genForkeystoneListProjects() {
        // basic
        HttpRequestDef.Builder<KeystoneListProjectsRequest, KeystoneListProjectsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, KeystoneListProjectsRequest.class, KeystoneListProjectsResponse.class)
            .withName("KeystoneListProjects")
            .withUri("/v3/projects")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(KeystoneListProjectsRequest::getDomainId, (req, v) -> {
                req.setDomainId(v);
            }));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(KeystoneListProjectsRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<String>withRequestField("parent_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(KeystoneListProjectsRequest::getParentId, (req, v) -> {
                req.setParentId(v);
            }));
        builder.<Boolean>withRequestField("enabled",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(KeystoneListProjectsRequest::getEnabled, (req, v) -> {
                req.setEnabled(v);
            }));
        builder.<Boolean>withRequestField("is_domain",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(KeystoneListProjectsRequest::getIsDomain, (req, v) -> {
                req.setIsDomain(v);
            }));
        builder.<Integer>withRequestField("page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(KeystoneListProjectsRequest::getPage, (req, v) -> {
                req.setPage(v);
            }));
        builder.<Integer>withRequestField("per_page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(KeystoneListProjectsRequest::getPerPage, (req, v) -> {
                req.setPerPage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<KeystoneListProjectsForUserRequest, KeystoneListProjectsForUserResponse> keystoneListProjectsForUser =
        genForkeystoneListProjectsForUser();

    private static HttpRequestDef<KeystoneListProjectsForUserRequest, KeystoneListProjectsForUserResponse> genForkeystoneListProjectsForUser() {
        // basic
        HttpRequestDef.Builder<KeystoneListProjectsForUserRequest, KeystoneListProjectsForUserResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    KeystoneListProjectsForUserRequest.class,
                    KeystoneListProjectsForUserResponse.class)
                .withName("KeystoneListProjectsForUser")
                .withUri("/v3/users/{user_id}/projects")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("user_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(KeystoneListProjectsForUserRequest::getUserId, (req, v) -> {
                req.setUserId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<KeystoneListProtocolsRequest, KeystoneListProtocolsResponse> keystoneListProtocols =
        genForkeystoneListProtocols();

    private static HttpRequestDef<KeystoneListProtocolsRequest, KeystoneListProtocolsResponse> genForkeystoneListProtocols() {
        // basic
        HttpRequestDef.Builder<KeystoneListProtocolsRequest, KeystoneListProtocolsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, KeystoneListProtocolsRequest.class, KeystoneListProtocolsResponse.class)
            .withName("KeystoneListProtocols")
            .withUri("/v3/OS-FEDERATION/identity_providers/{idp_id}/protocols")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("idp_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(KeystoneListProtocolsRequest::getIdpId, (req, v) -> {
                req.setIdpId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<KeystoneListRegionsRequest, KeystoneListRegionsResponse> keystoneListRegions =
        genForkeystoneListRegions();

    private static HttpRequestDef<KeystoneListRegionsRequest, KeystoneListRegionsResponse> genForkeystoneListRegions() {
        // basic
        HttpRequestDef.Builder<KeystoneListRegionsRequest, KeystoneListRegionsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, KeystoneListRegionsRequest.class, KeystoneListRegionsResponse.class)
                .withName("KeystoneListRegions")
                .withUri("/v3/regions")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<KeystoneListServicesRequest, KeystoneListServicesResponse> keystoneListServices =
        genForkeystoneListServices();

    private static HttpRequestDef<KeystoneListServicesRequest, KeystoneListServicesResponse> genForkeystoneListServices() {
        // basic
        HttpRequestDef.Builder<KeystoneListServicesRequest, KeystoneListServicesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, KeystoneListServicesRequest.class, KeystoneListServicesResponse.class)
            .withName("KeystoneListServices")
            .withUri("/v3/services")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(KeystoneListServicesRequest::getType, (req, v) -> {
                req.setType(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<KeystoneListUsersForGroupByAdminRequest, KeystoneListUsersForGroupByAdminResponse> keystoneListUsersForGroupByAdmin =
        genForkeystoneListUsersForGroupByAdmin();

    private static HttpRequestDef<KeystoneListUsersForGroupByAdminRequest, KeystoneListUsersForGroupByAdminResponse> genForkeystoneListUsersForGroupByAdmin() {
        // basic
        HttpRequestDef.Builder<KeystoneListUsersForGroupByAdminRequest, KeystoneListUsersForGroupByAdminResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    KeystoneListUsersForGroupByAdminRequest.class,
                    KeystoneListUsersForGroupByAdminResponse.class)
                .withName("KeystoneListUsersForGroupByAdmin")
                .withUri("/v3/groups/{group_id}/users")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(KeystoneListUsersForGroupByAdminRequest::getGroupId, (req, v) -> {
                req.setGroupId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<KeystoneListVersionsRequest, KeystoneListVersionsResponse> keystoneListVersions =
        genForkeystoneListVersions();

    private static HttpRequestDef<KeystoneListVersionsRequest, KeystoneListVersionsResponse> genForkeystoneListVersions() {
        // basic
        HttpRequestDef.Builder<KeystoneListVersionsRequest, KeystoneListVersionsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, KeystoneListVersionsRequest.class, KeystoneListVersionsResponse.class)
            .withName("KeystoneListVersions")
            .withUri("/")
            .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<KeystoneRemoveDomainPermissionFromGroupRequest, KeystoneRemoveDomainPermissionFromGroupResponse> keystoneRemoveDomainPermissionFromGroup =
        genForkeystoneRemoveDomainPermissionFromGroup();

    private static HttpRequestDef<KeystoneRemoveDomainPermissionFromGroupRequest, KeystoneRemoveDomainPermissionFromGroupResponse> genForkeystoneRemoveDomainPermissionFromGroup() {
        // basic
        HttpRequestDef.Builder<KeystoneRemoveDomainPermissionFromGroupRequest, KeystoneRemoveDomainPermissionFromGroupResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    KeystoneRemoveDomainPermissionFromGroupRequest.class,
                    KeystoneRemoveDomainPermissionFromGroupResponse.class)
                .withName("KeystoneRemoveDomainPermissionFromGroup")
                .withUri("/v3/domains/{domain_id}/groups/{group_id}/roles/{role_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(KeystoneRemoveDomainPermissionFromGroupRequest::getDomainId, (req, v) -> {
                req.setDomainId(v);
            }));
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(KeystoneRemoveDomainPermissionFromGroupRequest::getGroupId, (req, v) -> {
                req.setGroupId(v);
            }));
        builder.<String>withRequestField("role_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(KeystoneRemoveDomainPermissionFromGroupRequest::getRoleId, (req, v) -> {
                req.setRoleId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<KeystoneRemoveProjectPermissionFromGroupRequest, KeystoneRemoveProjectPermissionFromGroupResponse> keystoneRemoveProjectPermissionFromGroup =
        genForkeystoneRemoveProjectPermissionFromGroup();

    private static HttpRequestDef<KeystoneRemoveProjectPermissionFromGroupRequest, KeystoneRemoveProjectPermissionFromGroupResponse> genForkeystoneRemoveProjectPermissionFromGroup() {
        // basic
        HttpRequestDef.Builder<KeystoneRemoveProjectPermissionFromGroupRequest, KeystoneRemoveProjectPermissionFromGroupResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    KeystoneRemoveProjectPermissionFromGroupRequest.class,
                    KeystoneRemoveProjectPermissionFromGroupResponse.class)
                .withName("KeystoneRemoveProjectPermissionFromGroup")
                .withUri("/v3/projects/{project_id}/groups/{group_id}/roles/{role_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(KeystoneRemoveProjectPermissionFromGroupRequest::getProjectId, (req, v) -> {
                req.setProjectId(v);
            }));
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(KeystoneRemoveProjectPermissionFromGroupRequest::getGroupId, (req, v) -> {
                req.setGroupId(v);
            }));
        builder.<String>withRequestField("role_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(KeystoneRemoveProjectPermissionFromGroupRequest::getRoleId, (req, v) -> {
                req.setRoleId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<KeystoneRemoveUserFromGroupRequest, KeystoneRemoveUserFromGroupResponse> keystoneRemoveUserFromGroup =
        genForkeystoneRemoveUserFromGroup();

    private static HttpRequestDef<KeystoneRemoveUserFromGroupRequest, KeystoneRemoveUserFromGroupResponse> genForkeystoneRemoveUserFromGroup() {
        // basic
        HttpRequestDef.Builder<KeystoneRemoveUserFromGroupRequest, KeystoneRemoveUserFromGroupResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    KeystoneRemoveUserFromGroupRequest.class,
                    KeystoneRemoveUserFromGroupResponse.class)
                .withName("KeystoneRemoveUserFromGroup")
                .withUri("/v3/groups/{group_id}/users/{user_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(KeystoneRemoveUserFromGroupRequest::getGroupId, (req, v) -> {
                req.setGroupId(v);
            }));
        builder.<String>withRequestField("user_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(KeystoneRemoveUserFromGroupRequest::getUserId, (req, v) -> {
                req.setUserId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<KeystoneShowCatalogRequest, KeystoneShowCatalogResponse> keystoneShowCatalog =
        genForkeystoneShowCatalog();

    private static HttpRequestDef<KeystoneShowCatalogRequest, KeystoneShowCatalogResponse> genForkeystoneShowCatalog() {
        // basic
        HttpRequestDef.Builder<KeystoneShowCatalogRequest, KeystoneShowCatalogResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, KeystoneShowCatalogRequest.class, KeystoneShowCatalogResponse.class)
                .withName("KeystoneShowCatalog")
                .withUri("/v3/auth/catalog")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<KeystoneShowEndpointRequest, KeystoneShowEndpointResponse> keystoneShowEndpoint =
        genForkeystoneShowEndpoint();

    private static HttpRequestDef<KeystoneShowEndpointRequest, KeystoneShowEndpointResponse> genForkeystoneShowEndpoint() {
        // basic
        HttpRequestDef.Builder<KeystoneShowEndpointRequest, KeystoneShowEndpointResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, KeystoneShowEndpointRequest.class, KeystoneShowEndpointResponse.class)
            .withName("KeystoneShowEndpoint")
            .withUri("/v3/endpoints/{endpoint_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("endpoint_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(KeystoneShowEndpointRequest::getEndpointId, (req, v) -> {
                req.setEndpointId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<KeystoneShowGroupRequest, KeystoneShowGroupResponse> keystoneShowGroup =
        genForkeystoneShowGroup();

    private static HttpRequestDef<KeystoneShowGroupRequest, KeystoneShowGroupResponse> genForkeystoneShowGroup() {
        // basic
        HttpRequestDef.Builder<KeystoneShowGroupRequest, KeystoneShowGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, KeystoneShowGroupRequest.class, KeystoneShowGroupResponse.class)
                .withName("KeystoneShowGroup")
                .withUri("/v3/groups/{group_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(KeystoneShowGroupRequest::getGroupId, (req, v) -> {
                req.setGroupId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<KeystoneShowIdentityProviderRequest, KeystoneShowIdentityProviderResponse> keystoneShowIdentityProvider =
        genForkeystoneShowIdentityProvider();

    private static HttpRequestDef<KeystoneShowIdentityProviderRequest, KeystoneShowIdentityProviderResponse> genForkeystoneShowIdentityProvider() {
        // basic
        HttpRequestDef.Builder<KeystoneShowIdentityProviderRequest, KeystoneShowIdentityProviderResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    KeystoneShowIdentityProviderRequest.class,
                    KeystoneShowIdentityProviderResponse.class)
                .withName("KeystoneShowIdentityProvider")
                .withUri("/v3/OS-FEDERATION/identity_providers/{id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(KeystoneShowIdentityProviderRequest::getId, (req, v) -> {
                req.setId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<KeystoneShowMappingRequest, KeystoneShowMappingResponse> keystoneShowMapping =
        genForkeystoneShowMapping();

    private static HttpRequestDef<KeystoneShowMappingRequest, KeystoneShowMappingResponse> genForkeystoneShowMapping() {
        // basic
        HttpRequestDef.Builder<KeystoneShowMappingRequest, KeystoneShowMappingResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, KeystoneShowMappingRequest.class, KeystoneShowMappingResponse.class)
                .withName("KeystoneShowMapping")
                .withUri("/v3/OS-FEDERATION/mappings/{id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(KeystoneShowMappingRequest::getId, (req, v) -> {
                req.setId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<KeystoneShowPermissionRequest, KeystoneShowPermissionResponse> keystoneShowPermission =
        genForkeystoneShowPermission();

    private static HttpRequestDef<KeystoneShowPermissionRequest, KeystoneShowPermissionResponse> genForkeystoneShowPermission() {
        // basic
        HttpRequestDef.Builder<KeystoneShowPermissionRequest, KeystoneShowPermissionResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, KeystoneShowPermissionRequest.class, KeystoneShowPermissionResponse.class)
            .withName("KeystoneShowPermission")
            .withUri("/v3/roles/{role_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("role_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(KeystoneShowPermissionRequest::getRoleId, (req, v) -> {
                req.setRoleId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<KeystoneShowProjectRequest, KeystoneShowProjectResponse> keystoneShowProject =
        genForkeystoneShowProject();

    private static HttpRequestDef<KeystoneShowProjectRequest, KeystoneShowProjectResponse> genForkeystoneShowProject() {
        // basic
        HttpRequestDef.Builder<KeystoneShowProjectRequest, KeystoneShowProjectResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, KeystoneShowProjectRequest.class, KeystoneShowProjectResponse.class)
                .withName("KeystoneShowProject")
                .withUri("/v3/projects/{project_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(KeystoneShowProjectRequest::getProjectId, (req, v) -> {
                req.setProjectId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<KeystoneShowProtocolRequest, KeystoneShowProtocolResponse> keystoneShowProtocol =
        genForkeystoneShowProtocol();

    private static HttpRequestDef<KeystoneShowProtocolRequest, KeystoneShowProtocolResponse> genForkeystoneShowProtocol() {
        // basic
        HttpRequestDef.Builder<KeystoneShowProtocolRequest, KeystoneShowProtocolResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, KeystoneShowProtocolRequest.class, KeystoneShowProtocolResponse.class)
            .withName("KeystoneShowProtocol")
            .withUri("/v3/OS-FEDERATION/identity_providers/{idp_id}/protocols/{protocol_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("idp_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(KeystoneShowProtocolRequest::getIdpId, (req, v) -> {
                req.setIdpId(v);
            }));
        builder.<String>withRequestField("protocol_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(KeystoneShowProtocolRequest::getProtocolId, (req, v) -> {
                req.setProtocolId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<KeystoneShowRegionRequest, KeystoneShowRegionResponse> keystoneShowRegion =
        genForkeystoneShowRegion();

    private static HttpRequestDef<KeystoneShowRegionRequest, KeystoneShowRegionResponse> genForkeystoneShowRegion() {
        // basic
        HttpRequestDef.Builder<KeystoneShowRegionRequest, KeystoneShowRegionResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, KeystoneShowRegionRequest.class, KeystoneShowRegionResponse.class)
                .withName("KeystoneShowRegion")
                .withUri("/v3/regions/{region_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("region_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(KeystoneShowRegionRequest::getRegionId, (req, v) -> {
                req.setRegionId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<KeystoneShowSecurityComplianceRequest, KeystoneShowSecurityComplianceResponse> keystoneShowSecurityCompliance =
        genForkeystoneShowSecurityCompliance();

    private static HttpRequestDef<KeystoneShowSecurityComplianceRequest, KeystoneShowSecurityComplianceResponse> genForkeystoneShowSecurityCompliance() {
        // basic
        HttpRequestDef.Builder<KeystoneShowSecurityComplianceRequest, KeystoneShowSecurityComplianceResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    KeystoneShowSecurityComplianceRequest.class,
                    KeystoneShowSecurityComplianceResponse.class)
                .withName("KeystoneShowSecurityCompliance")
                .withUri("/v3/domains/{domain_id}/config/security_compliance")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(KeystoneShowSecurityComplianceRequest::getDomainId, (req, v) -> {
                req.setDomainId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<KeystoneShowSecurityComplianceByOptionRequest, KeystoneShowSecurityComplianceByOptionResponse> keystoneShowSecurityComplianceByOption =
        genForkeystoneShowSecurityComplianceByOption();

    private static HttpRequestDef<KeystoneShowSecurityComplianceByOptionRequest, KeystoneShowSecurityComplianceByOptionResponse> genForkeystoneShowSecurityComplianceByOption() {
        // basic
        HttpRequestDef.Builder<KeystoneShowSecurityComplianceByOptionRequest, KeystoneShowSecurityComplianceByOptionResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    KeystoneShowSecurityComplianceByOptionRequest.class,
                    KeystoneShowSecurityComplianceByOptionResponse.class)
                .withName("KeystoneShowSecurityComplianceByOption")
                .withUri("/v3/domains/{domain_id}/config/security_compliance/{option}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(KeystoneShowSecurityComplianceByOptionRequest::getDomainId, (req, v) -> {
                req.setDomainId(v);
            }));
        builder.<KeystoneShowSecurityComplianceByOptionRequest.OptionEnum>withRequestField("option",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(KeystoneShowSecurityComplianceByOptionRequest.OptionEnum.class),
            f -> f.withMarshaller(KeystoneShowSecurityComplianceByOptionRequest::getOption, (req, v) -> {
                req.setOption(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<KeystoneShowServiceRequest, KeystoneShowServiceResponse> keystoneShowService =
        genForkeystoneShowService();

    private static HttpRequestDef<KeystoneShowServiceRequest, KeystoneShowServiceResponse> genForkeystoneShowService() {
        // basic
        HttpRequestDef.Builder<KeystoneShowServiceRequest, KeystoneShowServiceResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, KeystoneShowServiceRequest.class, KeystoneShowServiceResponse.class)
                .withName("KeystoneShowService")
                .withUri("/v3/services/{service_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("service_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(KeystoneShowServiceRequest::getServiceId, (req, v) -> {
                req.setServiceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<KeystoneShowVersionRequest, KeystoneShowVersionResponse> keystoneShowVersion =
        genForkeystoneShowVersion();

    private static HttpRequestDef<KeystoneShowVersionRequest, KeystoneShowVersionResponse> genForkeystoneShowVersion() {
        // basic
        HttpRequestDef.Builder<KeystoneShowVersionRequest, KeystoneShowVersionResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, KeystoneShowVersionRequest.class, KeystoneShowVersionResponse.class)
                .withName("KeystoneShowVersion")
                .withUri("/v3")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<KeystoneUpdateGroupRequest, KeystoneUpdateGroupResponse> keystoneUpdateGroup =
        genForkeystoneUpdateGroup();

    private static HttpRequestDef<KeystoneUpdateGroupRequest, KeystoneUpdateGroupResponse> genForkeystoneUpdateGroup() {
        // basic
        HttpRequestDef.Builder<KeystoneUpdateGroupRequest, KeystoneUpdateGroupResponse> builder = HttpRequestDef
            .builder(HttpMethod.PATCH, KeystoneUpdateGroupRequest.class, KeystoneUpdateGroupResponse.class)
            .withName("KeystoneUpdateGroup")
            .withUri("/v3/groups/{group_id}")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(KeystoneUpdateGroupRequest::getGroupId, (req, v) -> {
                req.setGroupId(v);
            }));
        builder.<KeystoneUpdateGroupRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(KeystoneUpdateGroupRequestBody.class),
            f -> f.withMarshaller(KeystoneUpdateGroupRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<KeystoneUpdateIdentityProviderRequest, KeystoneUpdateIdentityProviderResponse> keystoneUpdateIdentityProvider =
        genForkeystoneUpdateIdentityProvider();

    private static HttpRequestDef<KeystoneUpdateIdentityProviderRequest, KeystoneUpdateIdentityProviderResponse> genForkeystoneUpdateIdentityProvider() {
        // basic
        HttpRequestDef.Builder<KeystoneUpdateIdentityProviderRequest, KeystoneUpdateIdentityProviderResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PATCH,
                    KeystoneUpdateIdentityProviderRequest.class,
                    KeystoneUpdateIdentityProviderResponse.class)
                .withName("KeystoneUpdateIdentityProvider")
                .withUri("/v3/OS-FEDERATION/identity_providers/{id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(KeystoneUpdateIdentityProviderRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<KeystoneUpdateIdentityProviderRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(KeystoneUpdateIdentityProviderRequestBody.class),
            f -> f.withMarshaller(KeystoneUpdateIdentityProviderRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<KeystoneUpdateMappingRequest, KeystoneUpdateMappingResponse> keystoneUpdateMapping =
        genForkeystoneUpdateMapping();

    private static HttpRequestDef<KeystoneUpdateMappingRequest, KeystoneUpdateMappingResponse> genForkeystoneUpdateMapping() {
        // basic
        HttpRequestDef.Builder<KeystoneUpdateMappingRequest, KeystoneUpdateMappingResponse> builder = HttpRequestDef
            .builder(HttpMethod.PATCH, KeystoneUpdateMappingRequest.class, KeystoneUpdateMappingResponse.class)
            .withName("KeystoneUpdateMapping")
            .withUri("/v3/OS-FEDERATION/mappings/{id}")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(KeystoneUpdateMappingRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<KeystoneUpdateMappingRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(KeystoneUpdateMappingRequestBody.class),
            f -> f.withMarshaller(KeystoneUpdateMappingRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<KeystoneUpdateProjectRequest, KeystoneUpdateProjectResponse> keystoneUpdateProject =
        genForkeystoneUpdateProject();

    private static HttpRequestDef<KeystoneUpdateProjectRequest, KeystoneUpdateProjectResponse> genForkeystoneUpdateProject() {
        // basic
        HttpRequestDef.Builder<KeystoneUpdateProjectRequest, KeystoneUpdateProjectResponse> builder = HttpRequestDef
            .builder(HttpMethod.PATCH, KeystoneUpdateProjectRequest.class, KeystoneUpdateProjectResponse.class)
            .withName("KeystoneUpdateProject")
            .withUri("/v3/projects/{project_id}")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(KeystoneUpdateProjectRequest::getProjectId, (req, v) -> {
                req.setProjectId(v);
            }));
        builder.<KeystoneUpdateProjectRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(KeystoneUpdateProjectRequestBody.class),
            f -> f.withMarshaller(KeystoneUpdateProjectRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<KeystoneUpdateProtocolRequest, KeystoneUpdateProtocolResponse> keystoneUpdateProtocol =
        genForkeystoneUpdateProtocol();

    private static HttpRequestDef<KeystoneUpdateProtocolRequest, KeystoneUpdateProtocolResponse> genForkeystoneUpdateProtocol() {
        // basic
        HttpRequestDef.Builder<KeystoneUpdateProtocolRequest, KeystoneUpdateProtocolResponse> builder = HttpRequestDef
            .builder(HttpMethod.PATCH, KeystoneUpdateProtocolRequest.class, KeystoneUpdateProtocolResponse.class)
            .withName("KeystoneUpdateProtocol")
            .withUri("/v3/OS-FEDERATION/identity_providers/{idp_id}/protocols/{protocol_id}")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("idp_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(KeystoneUpdateProtocolRequest::getIdpId, (req, v) -> {
                req.setIdpId(v);
            }));
        builder.<String>withRequestField("protocol_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(KeystoneUpdateProtocolRequest::getProtocolId, (req, v) -> {
                req.setProtocolId(v);
            }));
        builder.<KeystoneUpdateProtocolRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(KeystoneUpdateProtocolRequestBody.class),
            f -> f.withMarshaller(KeystoneUpdateProtocolRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAgenciesRequest, ListAgenciesResponse> listAgencies = genForlistAgencies();

    private static HttpRequestDef<ListAgenciesRequest, ListAgenciesResponse> genForlistAgencies() {
        // basic
        HttpRequestDef.Builder<ListAgenciesRequest, ListAgenciesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAgenciesRequest.class, ListAgenciesResponse.class)
                .withName("ListAgencies")
                .withUri("/v3.0/OS-AGENCY/agencies")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAgenciesRequest::getDomainId, (req, v) -> {
                req.setDomainId(v);
            }));
        builder.<String>withRequestField("trust_domain_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAgenciesRequest::getTrustDomainId, (req, v) -> {
                req.setTrustDomainId(v);
            }));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAgenciesRequest::getName, (req, v) -> {
                req.setName(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAllProjectsPermissionsForAgencyRequest, ListAllProjectsPermissionsForAgencyResponse> listAllProjectsPermissionsForAgency =
        genForlistAllProjectsPermissionsForAgency();

    private static HttpRequestDef<ListAllProjectsPermissionsForAgencyRequest, ListAllProjectsPermissionsForAgencyResponse> genForlistAllProjectsPermissionsForAgency() {
        // basic
        HttpRequestDef.Builder<ListAllProjectsPermissionsForAgencyRequest, ListAllProjectsPermissionsForAgencyResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListAllProjectsPermissionsForAgencyRequest.class,
                    ListAllProjectsPermissionsForAgencyResponse.class)
                .withName("ListAllProjectsPermissionsForAgency")
                .withUri("/v3.0/OS-INHERIT/domains/{domain_id}/agencies/{agency_id}/roles/inherited_to_projects")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("agency_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAllProjectsPermissionsForAgencyRequest::getAgencyId, (req, v) -> {
                req.setAgencyId(v);
            }));
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAllProjectsPermissionsForAgencyRequest::getDomainId, (req, v) -> {
                req.setDomainId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCustomPoliciesRequest, ListCustomPoliciesResponse> listCustomPolicies =
        genForlistCustomPolicies();

    private static HttpRequestDef<ListCustomPoliciesRequest, ListCustomPoliciesResponse> genForlistCustomPolicies() {
        // basic
        HttpRequestDef.Builder<ListCustomPoliciesRequest, ListCustomPoliciesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListCustomPoliciesRequest.class, ListCustomPoliciesResponse.class)
                .withName("ListCustomPolicies")
                .withUri("/v3.0/OS-ROLE/roles")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCustomPoliciesRequest::getPage, (req, v) -> {
                req.setPage(v);
            }));
        builder.<Integer>withRequestField("per_page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCustomPoliciesRequest::getPerPage, (req, v) -> {
                req.setPerPage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDomainPermissionsForAgencyRequest, ListDomainPermissionsForAgencyResponse> listDomainPermissionsForAgency =
        genForlistDomainPermissionsForAgency();

    private static HttpRequestDef<ListDomainPermissionsForAgencyRequest, ListDomainPermissionsForAgencyResponse> genForlistDomainPermissionsForAgency() {
        // basic
        HttpRequestDef.Builder<ListDomainPermissionsForAgencyRequest, ListDomainPermissionsForAgencyResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListDomainPermissionsForAgencyRequest.class,
                    ListDomainPermissionsForAgencyResponse.class)
                .withName("ListDomainPermissionsForAgency")
                .withUri("/v3.0/OS-AGENCY/domains/{domain_id}/agencies/{agency_id}/roles")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDomainPermissionsForAgencyRequest::getDomainId, (req, v) -> {
                req.setDomainId(v);
            }));
        builder.<String>withRequestField("agency_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDomainPermissionsForAgencyRequest::getAgencyId, (req, v) -> {
                req.setAgencyId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListEnterpriseProjectsForGroupRequest, ListEnterpriseProjectsForGroupResponse> listEnterpriseProjectsForGroup =
        genForlistEnterpriseProjectsForGroup();

    private static HttpRequestDef<ListEnterpriseProjectsForGroupRequest, ListEnterpriseProjectsForGroupResponse> genForlistEnterpriseProjectsForGroup() {
        // basic
        HttpRequestDef.Builder<ListEnterpriseProjectsForGroupRequest, ListEnterpriseProjectsForGroupResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListEnterpriseProjectsForGroupRequest.class,
                    ListEnterpriseProjectsForGroupResponse.class)
                .withName("ListEnterpriseProjectsForGroup")
                .withUri("/v3.0/OS-PERMISSION/groups/{group_id}/enterprise-projects")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEnterpriseProjectsForGroupRequest::getGroupId, (req, v) -> {
                req.setGroupId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListEnterpriseProjectsForUserRequest, ListEnterpriseProjectsForUserResponse> listEnterpriseProjectsForUser =
        genForlistEnterpriseProjectsForUser();

    private static HttpRequestDef<ListEnterpriseProjectsForUserRequest, ListEnterpriseProjectsForUserResponse> genForlistEnterpriseProjectsForUser() {
        // basic
        HttpRequestDef.Builder<ListEnterpriseProjectsForUserRequest, ListEnterpriseProjectsForUserResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListEnterpriseProjectsForUserRequest.class,
                    ListEnterpriseProjectsForUserResponse.class)
                .withName("ListEnterpriseProjectsForUser")
                .withUri("/v3.0/OS-PERMISSION/users/{user_id}/enterprise-projects")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("user_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEnterpriseProjectsForUserRequest::getUserId, (req, v) -> {
                req.setUserId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListGroupsForEnterpriseProjectRequest, ListGroupsForEnterpriseProjectResponse> listGroupsForEnterpriseProject =
        genForlistGroupsForEnterpriseProject();

    private static HttpRequestDef<ListGroupsForEnterpriseProjectRequest, ListGroupsForEnterpriseProjectResponse> genForlistGroupsForEnterpriseProject() {
        // basic
        HttpRequestDef.Builder<ListGroupsForEnterpriseProjectRequest, ListGroupsForEnterpriseProjectResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListGroupsForEnterpriseProjectRequest.class,
                    ListGroupsForEnterpriseProjectResponse.class)
                .withName("ListGroupsForEnterpriseProject")
                .withUri("/v3.0/OS-PERMISSION/enterprise-projects/{enterprise_project_id}/groups")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGroupsForEnterpriseProjectRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListProjectPermissionsForAgencyRequest, ListProjectPermissionsForAgencyResponse> listProjectPermissionsForAgency =
        genForlistProjectPermissionsForAgency();

    private static HttpRequestDef<ListProjectPermissionsForAgencyRequest, ListProjectPermissionsForAgencyResponse> genForlistProjectPermissionsForAgency() {
        // basic
        HttpRequestDef.Builder<ListProjectPermissionsForAgencyRequest, ListProjectPermissionsForAgencyResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListProjectPermissionsForAgencyRequest.class,
                    ListProjectPermissionsForAgencyResponse.class)
                .withName("ListProjectPermissionsForAgency")
                .withUri("/v3.0/OS-AGENCY/projects/{project_id}/agencies/{agency_id}/roles")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProjectPermissionsForAgencyRequest::getProjectId, (req, v) -> {
                req.setProjectId(v);
            }));
        builder.<String>withRequestField("agency_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProjectPermissionsForAgencyRequest::getAgencyId, (req, v) -> {
                req.setAgencyId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListRolesForGroupOnEnterpriseProjectRequest, ListRolesForGroupOnEnterpriseProjectResponse> listRolesForGroupOnEnterpriseProject =
        genForlistRolesForGroupOnEnterpriseProject();

    private static HttpRequestDef<ListRolesForGroupOnEnterpriseProjectRequest, ListRolesForGroupOnEnterpriseProjectResponse> genForlistRolesForGroupOnEnterpriseProject() {
        // basic
        HttpRequestDef.Builder<ListRolesForGroupOnEnterpriseProjectRequest, ListRolesForGroupOnEnterpriseProjectResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListRolesForGroupOnEnterpriseProjectRequest.class,
                    ListRolesForGroupOnEnterpriseProjectResponse.class)
                .withName("ListRolesForGroupOnEnterpriseProject")
                .withUri("/v3.0/OS-PERMISSION/enterprise-projects/{enterprise_project_id}/groups/{group_id}/roles")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRolesForGroupOnEnterpriseProjectRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRolesForGroupOnEnterpriseProjectRequest::getGroupId, (req, v) -> {
                req.setGroupId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListRolesForUserOnEnterpriseProjectRequest, ListRolesForUserOnEnterpriseProjectResponse> listRolesForUserOnEnterpriseProject =
        genForlistRolesForUserOnEnterpriseProject();

    private static HttpRequestDef<ListRolesForUserOnEnterpriseProjectRequest, ListRolesForUserOnEnterpriseProjectResponse> genForlistRolesForUserOnEnterpriseProject() {
        // basic
        HttpRequestDef.Builder<ListRolesForUserOnEnterpriseProjectRequest, ListRolesForUserOnEnterpriseProjectResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListRolesForUserOnEnterpriseProjectRequest.class,
                    ListRolesForUserOnEnterpriseProjectResponse.class)
                .withName("ListRolesForUserOnEnterpriseProject")
                .withUri("/v3.0/OS-PERMISSION/enterprise-projects/{enterprise_project_id}/users/{user_id}/roles")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRolesForUserOnEnterpriseProjectRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<String>withRequestField("user_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRolesForUserOnEnterpriseProjectRequest::getUserId, (req, v) -> {
                req.setUserId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListUsersForEnterpriseProjectRequest, ListUsersForEnterpriseProjectResponse> listUsersForEnterpriseProject =
        genForlistUsersForEnterpriseProject();

    private static HttpRequestDef<ListUsersForEnterpriseProjectRequest, ListUsersForEnterpriseProjectResponse> genForlistUsersForEnterpriseProject() {
        // basic
        HttpRequestDef.Builder<ListUsersForEnterpriseProjectRequest, ListUsersForEnterpriseProjectResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListUsersForEnterpriseProjectRequest.class,
                    ListUsersForEnterpriseProjectResponse.class)
                .withName("ListUsersForEnterpriseProject")
                .withUri("/v3.0/OS-PERMISSION/enterprise-projects/{enterprise_project_id}/users")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUsersForEnterpriseProjectRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RemoveAllProjectsPermissionFromAgencyRequest, RemoveAllProjectsPermissionFromAgencyResponse> removeAllProjectsPermissionFromAgency =
        genForremoveAllProjectsPermissionFromAgency();

    private static HttpRequestDef<RemoveAllProjectsPermissionFromAgencyRequest, RemoveAllProjectsPermissionFromAgencyResponse> genForremoveAllProjectsPermissionFromAgency() {
        // basic
        HttpRequestDef.Builder<RemoveAllProjectsPermissionFromAgencyRequest, RemoveAllProjectsPermissionFromAgencyResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    RemoveAllProjectsPermissionFromAgencyRequest.class,
                    RemoveAllProjectsPermissionFromAgencyResponse.class)
                .withName("RemoveAllProjectsPermissionFromAgency")
                .withUri(
                    "/v3.0/OS-INHERIT/domains/{domain_id}/agencies/{agency_id}/roles/{role_id}/inherited_to_projects")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("agency_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RemoveAllProjectsPermissionFromAgencyRequest::getAgencyId, (req, v) -> {
                req.setAgencyId(v);
            }));
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RemoveAllProjectsPermissionFromAgencyRequest::getDomainId, (req, v) -> {
                req.setDomainId(v);
            }));
        builder.<String>withRequestField("role_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RemoveAllProjectsPermissionFromAgencyRequest::getRoleId, (req, v) -> {
                req.setRoleId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RemoveDomainPermissionFromAgencyRequest, RemoveDomainPermissionFromAgencyResponse> removeDomainPermissionFromAgency =
        genForremoveDomainPermissionFromAgency();

    private static HttpRequestDef<RemoveDomainPermissionFromAgencyRequest, RemoveDomainPermissionFromAgencyResponse> genForremoveDomainPermissionFromAgency() {
        // basic
        HttpRequestDef.Builder<RemoveDomainPermissionFromAgencyRequest, RemoveDomainPermissionFromAgencyResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    RemoveDomainPermissionFromAgencyRequest.class,
                    RemoveDomainPermissionFromAgencyResponse.class)
                .withName("RemoveDomainPermissionFromAgency")
                .withUri("/v3.0/OS-AGENCY/domains/{domain_id}/agencies/{agency_id}/roles/{role_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RemoveDomainPermissionFromAgencyRequest::getDomainId, (req, v) -> {
                req.setDomainId(v);
            }));
        builder.<String>withRequestField("agency_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RemoveDomainPermissionFromAgencyRequest::getAgencyId, (req, v) -> {
                req.setAgencyId(v);
            }));
        builder.<String>withRequestField("role_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RemoveDomainPermissionFromAgencyRequest::getRoleId, (req, v) -> {
                req.setRoleId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RemoveProjectPermissionFromAgencyRequest, RemoveProjectPermissionFromAgencyResponse> removeProjectPermissionFromAgency =
        genForremoveProjectPermissionFromAgency();

    private static HttpRequestDef<RemoveProjectPermissionFromAgencyRequest, RemoveProjectPermissionFromAgencyResponse> genForremoveProjectPermissionFromAgency() {
        // basic
        HttpRequestDef.Builder<RemoveProjectPermissionFromAgencyRequest, RemoveProjectPermissionFromAgencyResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    RemoveProjectPermissionFromAgencyRequest.class,
                    RemoveProjectPermissionFromAgencyResponse.class)
                .withName("RemoveProjectPermissionFromAgency")
                .withUri("/v3.0/OS-AGENCY/projects/{project_id}/agencies/{agency_id}/roles/{role_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RemoveProjectPermissionFromAgencyRequest::getProjectId, (req, v) -> {
                req.setProjectId(v);
            }));
        builder.<String>withRequestField("agency_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RemoveProjectPermissionFromAgencyRequest::getAgencyId, (req, v) -> {
                req.setAgencyId(v);
            }));
        builder.<String>withRequestField("role_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RemoveProjectPermissionFromAgencyRequest::getRoleId, (req, v) -> {
                req.setRoleId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RevokeRoleFromGroupOnEnterpriseProjectRequest, RevokeRoleFromGroupOnEnterpriseProjectResponse> revokeRoleFromGroupOnEnterpriseProject =
        genForrevokeRoleFromGroupOnEnterpriseProject();

    private static HttpRequestDef<RevokeRoleFromGroupOnEnterpriseProjectRequest, RevokeRoleFromGroupOnEnterpriseProjectResponse> genForrevokeRoleFromGroupOnEnterpriseProject() {
        // basic
        HttpRequestDef.Builder<RevokeRoleFromGroupOnEnterpriseProjectRequest, RevokeRoleFromGroupOnEnterpriseProjectResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    RevokeRoleFromGroupOnEnterpriseProjectRequest.class,
                    RevokeRoleFromGroupOnEnterpriseProjectResponse.class)
                .withName("RevokeRoleFromGroupOnEnterpriseProject")
                .withUri(
                    "/v3.0/OS-PERMISSION/enterprise-projects/{enterprise_project_id}/groups/{group_id}/roles/{role_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RevokeRoleFromGroupOnEnterpriseProjectRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RevokeRoleFromGroupOnEnterpriseProjectRequest::getGroupId, (req, v) -> {
                req.setGroupId(v);
            }));
        builder.<String>withRequestField("role_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RevokeRoleFromGroupOnEnterpriseProjectRequest::getRoleId, (req, v) -> {
                req.setRoleId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RevokeRoleFromUserOnEnterpriseProjectRequest, RevokeRoleFromUserOnEnterpriseProjectResponse> revokeRoleFromUserOnEnterpriseProject =
        genForrevokeRoleFromUserOnEnterpriseProject();

    private static HttpRequestDef<RevokeRoleFromUserOnEnterpriseProjectRequest, RevokeRoleFromUserOnEnterpriseProjectResponse> genForrevokeRoleFromUserOnEnterpriseProject() {
        // basic
        HttpRequestDef.Builder<RevokeRoleFromUserOnEnterpriseProjectRequest, RevokeRoleFromUserOnEnterpriseProjectResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    RevokeRoleFromUserOnEnterpriseProjectRequest.class,
                    RevokeRoleFromUserOnEnterpriseProjectResponse.class)
                .withName("RevokeRoleFromUserOnEnterpriseProject")
                .withUri(
                    "/v3.0/OS-PERMISSION/enterprise-projects/{enterprise_project_id}/users/{user_id}/roles/{role_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RevokeRoleFromUserOnEnterpriseProjectRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<String>withRequestField("user_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RevokeRoleFromUserOnEnterpriseProjectRequest::getUserId, (req, v) -> {
                req.setUserId(v);
            }));
        builder.<String>withRequestField("role_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RevokeRoleFromUserOnEnterpriseProjectRequest::getRoleId, (req, v) -> {
                req.setRoleId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAgencyRequest, ShowAgencyResponse> showAgency = genForshowAgency();

    private static HttpRequestDef<ShowAgencyRequest, ShowAgencyResponse> genForshowAgency() {
        // basic
        HttpRequestDef.Builder<ShowAgencyRequest, ShowAgencyResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowAgencyRequest.class, ShowAgencyResponse.class)
                .withName("ShowAgency")
                .withUri("/v3.0/OS-AGENCY/agencies/{agency_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("agency_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAgencyRequest::getAgencyId, (req, v) -> {
                req.setAgencyId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowCustomPolicyRequest, ShowCustomPolicyResponse> showCustomPolicy =
        genForshowCustomPolicy();

    private static HttpRequestDef<ShowCustomPolicyRequest, ShowCustomPolicyResponse> genForshowCustomPolicy() {
        // basic
        HttpRequestDef.Builder<ShowCustomPolicyRequest, ShowCustomPolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowCustomPolicyRequest.class, ShowCustomPolicyResponse.class)
                .withName("ShowCustomPolicy")
                .withUri("/v3.0/OS-ROLE/roles/{role_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("role_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCustomPolicyRequest::getRoleId, (req, v) -> {
                req.setRoleId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDomainApiAclPolicyRequest, ShowDomainApiAclPolicyResponse> showDomainApiAclPolicy =
        genForshowDomainApiAclPolicy();

    private static HttpRequestDef<ShowDomainApiAclPolicyRequest, ShowDomainApiAclPolicyResponse> genForshowDomainApiAclPolicy() {
        // basic
        HttpRequestDef.Builder<ShowDomainApiAclPolicyRequest, ShowDomainApiAclPolicyResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowDomainApiAclPolicyRequest.class, ShowDomainApiAclPolicyResponse.class)
            .withName("ShowDomainApiAclPolicy")
            .withUri("/v3.0/OS-SECURITYPOLICY/domains/{domain_id}/api-acl-policy")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDomainApiAclPolicyRequest::getDomainId, (req, v) -> {
                req.setDomainId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDomainConsoleAclPolicyRequest, ShowDomainConsoleAclPolicyResponse> showDomainConsoleAclPolicy =
        genForshowDomainConsoleAclPolicy();

    private static HttpRequestDef<ShowDomainConsoleAclPolicyRequest, ShowDomainConsoleAclPolicyResponse> genForshowDomainConsoleAclPolicy() {
        // basic
        HttpRequestDef.Builder<ShowDomainConsoleAclPolicyRequest, ShowDomainConsoleAclPolicyResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowDomainConsoleAclPolicyRequest.class,
                    ShowDomainConsoleAclPolicyResponse.class)
                .withName("ShowDomainConsoleAclPolicy")
                .withUri("/v3.0/OS-SECURITYPOLICY/domains/{domain_id}/console-acl-policy")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDomainConsoleAclPolicyRequest::getDomainId, (req, v) -> {
                req.setDomainId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDomainLoginPolicyRequest, ShowDomainLoginPolicyResponse> showDomainLoginPolicy =
        genForshowDomainLoginPolicy();

    private static HttpRequestDef<ShowDomainLoginPolicyRequest, ShowDomainLoginPolicyResponse> genForshowDomainLoginPolicy() {
        // basic
        HttpRequestDef.Builder<ShowDomainLoginPolicyRequest, ShowDomainLoginPolicyResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowDomainLoginPolicyRequest.class, ShowDomainLoginPolicyResponse.class)
            .withName("ShowDomainLoginPolicy")
            .withUri("/v3.0/OS-SECURITYPOLICY/domains/{domain_id}/login-policy")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDomainLoginPolicyRequest::getDomainId, (req, v) -> {
                req.setDomainId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDomainPasswordPolicyRequest, ShowDomainPasswordPolicyResponse> showDomainPasswordPolicy =
        genForshowDomainPasswordPolicy();

    private static HttpRequestDef<ShowDomainPasswordPolicyRequest, ShowDomainPasswordPolicyResponse> genForshowDomainPasswordPolicy() {
        // basic
        HttpRequestDef.Builder<ShowDomainPasswordPolicyRequest, ShowDomainPasswordPolicyResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ShowDomainPasswordPolicyRequest.class, ShowDomainPasswordPolicyResponse.class)
                .withName("ShowDomainPasswordPolicy")
                .withUri("/v3.0/OS-SECURITYPOLICY/domains/{domain_id}/password-policy")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDomainPasswordPolicyRequest::getDomainId, (req, v) -> {
                req.setDomainId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDomainProtectPolicyRequest, ShowDomainProtectPolicyResponse> showDomainProtectPolicy =
        genForshowDomainProtectPolicy();

    private static HttpRequestDef<ShowDomainProtectPolicyRequest, ShowDomainProtectPolicyResponse> genForshowDomainProtectPolicy() {
        // basic
        HttpRequestDef.Builder<ShowDomainProtectPolicyRequest, ShowDomainProtectPolicyResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowDomainProtectPolicyRequest.class, ShowDomainProtectPolicyResponse.class)
            .withName("ShowDomainProtectPolicy")
            .withUri("/v3.0/OS-SECURITYPOLICY/domains/{domain_id}/protect-policy")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDomainProtectPolicyRequest::getDomainId, (req, v) -> {
                req.setDomainId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDomainQuotaRequest, ShowDomainQuotaResponse> showDomainQuota =
        genForshowDomainQuota();

    private static HttpRequestDef<ShowDomainQuotaRequest, ShowDomainQuotaResponse> genForshowDomainQuota() {
        // basic
        HttpRequestDef.Builder<ShowDomainQuotaRequest, ShowDomainQuotaResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowDomainQuotaRequest.class, ShowDomainQuotaResponse.class)
                .withName("ShowDomainQuota")
                .withUri("/v3.0/OS-QUOTA/domains/{domain_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDomainQuotaRequest::getDomainId, (req, v) -> {
                req.setDomainId(v);
            }));
        builder.<ShowDomainQuotaRequest.TypeEnum>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowDomainQuotaRequest.TypeEnum.class),
            f -> f.withMarshaller(ShowDomainQuotaRequest::getType, (req, v) -> {
                req.setType(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowMetadataRequest, ShowMetadataResponse> showMetadata = genForshowMetadata();

    private static HttpRequestDef<ShowMetadataRequest, ShowMetadataResponse> genForshowMetadata() {
        // basic
        HttpRequestDef.Builder<ShowMetadataRequest, ShowMetadataResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowMetadataRequest.class, ShowMetadataResponse.class)
                .withName("ShowMetadata")
                .withUri("/v3-ext/OS-FEDERATION/identity_providers/{idp_id}/protocols/{protocol_id}/metadata")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("idp_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMetadataRequest::getIdpId, (req, v) -> {
                req.setIdpId(v);
            }));
        builder.<String>withRequestField("protocol_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMetadataRequest::getProtocolId, (req, v) -> {
                req.setProtocolId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowOpenIdConnectConfigRequest, ShowOpenIdConnectConfigResponse> showOpenIdConnectConfig =
        genForshowOpenIdConnectConfig();

    private static HttpRequestDef<ShowOpenIdConnectConfigRequest, ShowOpenIdConnectConfigResponse> genForshowOpenIdConnectConfig() {
        // basic
        HttpRequestDef.Builder<ShowOpenIdConnectConfigRequest, ShowOpenIdConnectConfigResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowOpenIdConnectConfigRequest.class, ShowOpenIdConnectConfigResponse.class)
            .withName("ShowOpenIdConnectConfig")
            .withUri("/v3.0/OS-FEDERATION/identity-providers/{idp_id}/openid-connect-config")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("idp_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowOpenIdConnectConfigRequest::getIdpId, (req, v) -> {
                req.setIdpId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowProjectDetailsAndStatusRequest, ShowProjectDetailsAndStatusResponse> showProjectDetailsAndStatus =
        genForshowProjectDetailsAndStatus();

    private static HttpRequestDef<ShowProjectDetailsAndStatusRequest, ShowProjectDetailsAndStatusResponse> genForshowProjectDetailsAndStatus() {
        // basic
        HttpRequestDef.Builder<ShowProjectDetailsAndStatusRequest, ShowProjectDetailsAndStatusResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowProjectDetailsAndStatusRequest.class,
                    ShowProjectDetailsAndStatusResponse.class)
                .withName("ShowProjectDetailsAndStatus")
                .withUri("/v3-ext/projects/{project_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowProjectDetailsAndStatusRequest::getProjectId, (req, v) -> {
                req.setProjectId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowProjectQuotaRequest, ShowProjectQuotaResponse> showProjectQuota =
        genForshowProjectQuota();

    private static HttpRequestDef<ShowProjectQuotaRequest, ShowProjectQuotaResponse> genForshowProjectQuota() {
        // basic
        HttpRequestDef.Builder<ShowProjectQuotaRequest, ShowProjectQuotaResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowProjectQuotaRequest.class, ShowProjectQuotaResponse.class)
                .withName("ShowProjectQuota")
                .withUri("/v3.0/OS-QUOTA/projects/{project_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowProjectQuotaRequest::getProjectId, (req, v) -> {
                req.setProjectId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateAgencyRequest, UpdateAgencyResponse> updateAgency = genForupdateAgency();

    private static HttpRequestDef<UpdateAgencyRequest, UpdateAgencyResponse> genForupdateAgency() {
        // basic
        HttpRequestDef.Builder<UpdateAgencyRequest, UpdateAgencyResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateAgencyRequest.class, UpdateAgencyResponse.class)
                .withName("UpdateAgency")
                .withUri("/v3.0/OS-AGENCY/agencies/{agency_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("agency_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAgencyRequest::getAgencyId, (req, v) -> {
                req.setAgencyId(v);
            }));
        builder.<UpdateAgencyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateAgencyRequestBody.class),
            f -> f.withMarshaller(UpdateAgencyRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateAgencyCustomPolicyRequest, UpdateAgencyCustomPolicyResponse> updateAgencyCustomPolicy =
        genForupdateAgencyCustomPolicy();

    private static HttpRequestDef<UpdateAgencyCustomPolicyRequest, UpdateAgencyCustomPolicyResponse> genForupdateAgencyCustomPolicy() {
        // basic
        HttpRequestDef.Builder<UpdateAgencyCustomPolicyRequest, UpdateAgencyCustomPolicyResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PATCH,
                    UpdateAgencyCustomPolicyRequest.class,
                    UpdateAgencyCustomPolicyResponse.class)
                .withName("UpdateAgencyCustomPolicy")
                .withUri("/v3.0/OS-ROLE/roles/{role_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("role_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAgencyCustomPolicyRequest::getRoleId, (req, v) -> {
                req.setRoleId(v);
            }));
        builder.<UpdateAgencyCustomPolicyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateAgencyCustomPolicyRequestBody.class),
            f -> f.withMarshaller(UpdateAgencyCustomPolicyRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateCloudServiceCustomPolicyRequest, UpdateCloudServiceCustomPolicyResponse> updateCloudServiceCustomPolicy =
        genForupdateCloudServiceCustomPolicy();

    private static HttpRequestDef<UpdateCloudServiceCustomPolicyRequest, UpdateCloudServiceCustomPolicyResponse> genForupdateCloudServiceCustomPolicy() {
        // basic
        HttpRequestDef.Builder<UpdateCloudServiceCustomPolicyRequest, UpdateCloudServiceCustomPolicyResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PATCH,
                    UpdateCloudServiceCustomPolicyRequest.class,
                    UpdateCloudServiceCustomPolicyResponse.class)
                .withName("UpdateCloudServiceCustomPolicy")
                .withUri("/v3.0/OS-ROLE/roles/{role_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("role_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateCloudServiceCustomPolicyRequest::getRoleId, (req, v) -> {
                req.setRoleId(v);
            }));
        builder.<UpdateCloudServiceCustomPolicyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateCloudServiceCustomPolicyRequestBody.class),
            f -> f.withMarshaller(UpdateCloudServiceCustomPolicyRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateDomainApiAclPolicyRequest, UpdateDomainApiAclPolicyResponse> updateDomainApiAclPolicy =
        genForupdateDomainApiAclPolicy();

    private static HttpRequestDef<UpdateDomainApiAclPolicyRequest, UpdateDomainApiAclPolicyResponse> genForupdateDomainApiAclPolicy() {
        // basic
        HttpRequestDef.Builder<UpdateDomainApiAclPolicyRequest, UpdateDomainApiAclPolicyResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT, UpdateDomainApiAclPolicyRequest.class, UpdateDomainApiAclPolicyResponse.class)
                .withName("UpdateDomainApiAclPolicy")
                .withUri("/v3.0/OS-SECURITYPOLICY/domains/{domain_id}/api-acl-policy")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDomainApiAclPolicyRequest::getDomainId, (req, v) -> {
                req.setDomainId(v);
            }));
        builder.<UpdateDomainApiAclPolicyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateDomainApiAclPolicyRequestBody.class),
            f -> f.withMarshaller(UpdateDomainApiAclPolicyRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateDomainConsoleAclPolicyRequest, UpdateDomainConsoleAclPolicyResponse> updateDomainConsoleAclPolicy =
        genForupdateDomainConsoleAclPolicy();

    private static HttpRequestDef<UpdateDomainConsoleAclPolicyRequest, UpdateDomainConsoleAclPolicyResponse> genForupdateDomainConsoleAclPolicy() {
        // basic
        HttpRequestDef.Builder<UpdateDomainConsoleAclPolicyRequest, UpdateDomainConsoleAclPolicyResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateDomainConsoleAclPolicyRequest.class,
                    UpdateDomainConsoleAclPolicyResponse.class)
                .withName("UpdateDomainConsoleAclPolicy")
                .withUri("/v3.0/OS-SECURITYPOLICY/domains/{domain_id}/console-acl-policy")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDomainConsoleAclPolicyRequest::getDomainId, (req, v) -> {
                req.setDomainId(v);
            }));
        builder.<UpdateDomainConsoleAclPolicyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdateDomainConsoleAclPolicyRequestBody.class),
            f -> f.withMarshaller(UpdateDomainConsoleAclPolicyRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateDomainGroupInheritRoleRequest, UpdateDomainGroupInheritRoleResponse> updateDomainGroupInheritRole =
        genForupdateDomainGroupInheritRole();

    private static HttpRequestDef<UpdateDomainGroupInheritRoleRequest, UpdateDomainGroupInheritRoleResponse> genForupdateDomainGroupInheritRole() {
        // basic
        HttpRequestDef.Builder<UpdateDomainGroupInheritRoleRequest, UpdateDomainGroupInheritRoleResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateDomainGroupInheritRoleRequest.class,
                    UpdateDomainGroupInheritRoleResponse.class)
                .withName("UpdateDomainGroupInheritRole")
                .withUri("/v3/OS-INHERIT/domains/{domain_id}/groups/{group_id}/roles/{role_id}/inherited_to_projects")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDomainGroupInheritRoleRequest::getDomainId, (req, v) -> {
                req.setDomainId(v);
            }));
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDomainGroupInheritRoleRequest::getGroupId, (req, v) -> {
                req.setGroupId(v);
            }));
        builder.<String>withRequestField("role_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDomainGroupInheritRoleRequest::getRoleId, (req, v) -> {
                req.setRoleId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateDomainLoginPolicyRequest, UpdateDomainLoginPolicyResponse> updateDomainLoginPolicy =
        genForupdateDomainLoginPolicy();

    private static HttpRequestDef<UpdateDomainLoginPolicyRequest, UpdateDomainLoginPolicyResponse> genForupdateDomainLoginPolicy() {
        // basic
        HttpRequestDef.Builder<UpdateDomainLoginPolicyRequest, UpdateDomainLoginPolicyResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateDomainLoginPolicyRequest.class, UpdateDomainLoginPolicyResponse.class)
            .withName("UpdateDomainLoginPolicy")
            .withUri("/v3.0/OS-SECURITYPOLICY/domains/{domain_id}/login-policy")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDomainLoginPolicyRequest::getDomainId, (req, v) -> {
                req.setDomainId(v);
            }));
        builder.<UpdateDomainLoginPolicyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateDomainLoginPolicyRequestBody.class),
            f -> f.withMarshaller(UpdateDomainLoginPolicyRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateDomainPasswordPolicyRequest, UpdateDomainPasswordPolicyResponse> updateDomainPasswordPolicy =
        genForupdateDomainPasswordPolicy();

    private static HttpRequestDef<UpdateDomainPasswordPolicyRequest, UpdateDomainPasswordPolicyResponse> genForupdateDomainPasswordPolicy() {
        // basic
        HttpRequestDef.Builder<UpdateDomainPasswordPolicyRequest, UpdateDomainPasswordPolicyResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateDomainPasswordPolicyRequest.class,
                    UpdateDomainPasswordPolicyResponse.class)
                .withName("UpdateDomainPasswordPolicy")
                .withUri("/v3.0/OS-SECURITYPOLICY/domains/{domain_id}/password-policy")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDomainPasswordPolicyRequest::getDomainId, (req, v) -> {
                req.setDomainId(v);
            }));
        builder.<UpdateDomainPasswordPolicyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateDomainPasswordPolicyRequestBody.class),
            f -> f.withMarshaller(UpdateDomainPasswordPolicyRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateDomainProtectPolicyRequest, UpdateDomainProtectPolicyResponse> updateDomainProtectPolicy =
        genForupdateDomainProtectPolicy();

    private static HttpRequestDef<UpdateDomainProtectPolicyRequest, UpdateDomainProtectPolicyResponse> genForupdateDomainProtectPolicy() {
        // basic
        HttpRequestDef.Builder<UpdateDomainProtectPolicyRequest, UpdateDomainProtectPolicyResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateDomainProtectPolicyRequest.class,
                    UpdateDomainProtectPolicyResponse.class)
                .withName("UpdateDomainProtectPolicy")
                .withUri("/v3.0/OS-SECURITYPOLICY/domains/{domain_id}/protect-policy")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDomainProtectPolicyRequest::getDomainId, (req, v) -> {
                req.setDomainId(v);
            }));
        builder.<UpdateDomainProtectPolicyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateDomainProtectPolicyRequestBody.class),
            f -> f.withMarshaller(UpdateDomainProtectPolicyRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateOpenIdConnectConfigRequest, UpdateOpenIdConnectConfigResponse> updateOpenIdConnectConfig =
        genForupdateOpenIdConnectConfig();

    private static HttpRequestDef<UpdateOpenIdConnectConfigRequest, UpdateOpenIdConnectConfigResponse> genForupdateOpenIdConnectConfig() {
        // basic
        HttpRequestDef.Builder<UpdateOpenIdConnectConfigRequest, UpdateOpenIdConnectConfigResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateOpenIdConnectConfigRequest.class,
                    UpdateOpenIdConnectConfigResponse.class)
                .withName("UpdateOpenIdConnectConfig")
                .withUri("/v3.0/OS-FEDERATION/identity-providers/{idp_id}/openid-connect-config")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("idp_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateOpenIdConnectConfigRequest::getIdpId, (req, v) -> {
                req.setIdpId(v);
            }));
        builder.<UpdateOpenIdConnectConfigRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateOpenIdConnectConfigRequestBody.class),
            f -> f.withMarshaller(UpdateOpenIdConnectConfigRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateProjectStatusRequest, UpdateProjectStatusResponse> updateProjectStatus =
        genForupdateProjectStatus();

    private static HttpRequestDef<UpdateProjectStatusRequest, UpdateProjectStatusResponse> genForupdateProjectStatus() {
        // basic
        HttpRequestDef.Builder<UpdateProjectStatusRequest, UpdateProjectStatusResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateProjectStatusRequest.class, UpdateProjectStatusResponse.class)
                .withName("UpdateProjectStatus")
                .withUri("/v3-ext/projects/{project_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateProjectStatusRequest::getProjectId, (req, v) -> {
                req.setProjectId(v);
            }));
        builder.<UpdateProjectStatusRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateProjectStatusRequestBody.class),
            f -> f.withMarshaller(UpdateProjectStatusRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreatePermanentAccessKeyRequest, CreatePermanentAccessKeyResponse> createPermanentAccessKey =
        genForcreatePermanentAccessKey();

    private static HttpRequestDef<CreatePermanentAccessKeyRequest, CreatePermanentAccessKeyResponse> genForcreatePermanentAccessKey() {
        // basic
        HttpRequestDef.Builder<CreatePermanentAccessKeyRequest, CreatePermanentAccessKeyResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, CreatePermanentAccessKeyRequest.class, CreatePermanentAccessKeyResponse.class)
                .withName("CreatePermanentAccessKey")
                .withUri("/v3.0/OS-CREDENTIAL/credentials")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<CreatePermanentAccessKeyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreatePermanentAccessKeyRequestBody.class),
            f -> f.withMarshaller(CreatePermanentAccessKeyRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateTemporaryAccessKeyByAgencyRequest, CreateTemporaryAccessKeyByAgencyResponse> createTemporaryAccessKeyByAgency =
        genForcreateTemporaryAccessKeyByAgency();

    private static HttpRequestDef<CreateTemporaryAccessKeyByAgencyRequest, CreateTemporaryAccessKeyByAgencyResponse> genForcreateTemporaryAccessKeyByAgency() {
        // basic
        HttpRequestDef.Builder<CreateTemporaryAccessKeyByAgencyRequest, CreateTemporaryAccessKeyByAgencyResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateTemporaryAccessKeyByAgencyRequest.class,
                    CreateTemporaryAccessKeyByAgencyResponse.class)
                .withName("CreateTemporaryAccessKeyByAgency")
                .withUri("/v3.0/OS-CREDENTIAL/securitytokens")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<CreateTemporaryAccessKeyByAgencyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateTemporaryAccessKeyByAgencyRequestBody.class),
            f -> f.withMarshaller(CreateTemporaryAccessKeyByAgencyRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateTemporaryAccessKeyByTokenRequest, CreateTemporaryAccessKeyByTokenResponse> createTemporaryAccessKeyByToken =
        genForcreateTemporaryAccessKeyByToken();

    private static HttpRequestDef<CreateTemporaryAccessKeyByTokenRequest, CreateTemporaryAccessKeyByTokenResponse> genForcreateTemporaryAccessKeyByToken() {
        // basic
        HttpRequestDef.Builder<CreateTemporaryAccessKeyByTokenRequest, CreateTemporaryAccessKeyByTokenResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateTemporaryAccessKeyByTokenRequest.class,
                    CreateTemporaryAccessKeyByTokenResponse.class)
                .withName("CreateTemporaryAccessKeyByToken")
                .withUri("/v3.0/OS-CREDENTIAL/securitytokens")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<CreateTemporaryAccessKeyByTokenRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateTemporaryAccessKeyByTokenRequestBody.class),
            f -> f.withMarshaller(CreateTemporaryAccessKeyByTokenRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeletePermanentAccessKeyRequest, DeletePermanentAccessKeyResponse> deletePermanentAccessKey =
        genFordeletePermanentAccessKey();

    private static HttpRequestDef<DeletePermanentAccessKeyRequest, DeletePermanentAccessKeyResponse> genFordeletePermanentAccessKey() {
        // basic
        HttpRequestDef.Builder<DeletePermanentAccessKeyRequest, DeletePermanentAccessKeyResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeletePermanentAccessKeyRequest.class,
                    DeletePermanentAccessKeyResponse.class)
                .withName("DeletePermanentAccessKey")
                .withUri("/v3.0/OS-CREDENTIAL/credentials/{access_key}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("access_key",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletePermanentAccessKeyRequest::getAccessKey, (req, v) -> {
                req.setAccessKey(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPermanentAccessKeysRequest, ListPermanentAccessKeysResponse> listPermanentAccessKeys =
        genForlistPermanentAccessKeys();

    private static HttpRequestDef<ListPermanentAccessKeysRequest, ListPermanentAccessKeysResponse> genForlistPermanentAccessKeys() {
        // basic
        HttpRequestDef.Builder<ListPermanentAccessKeysRequest, ListPermanentAccessKeysResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListPermanentAccessKeysRequest.class, ListPermanentAccessKeysResponse.class)
            .withName("ListPermanentAccessKeys")
            .withUri("/v3.0/OS-CREDENTIAL/credentials")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("user_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPermanentAccessKeysRequest::getUserId, (req, v) -> {
                req.setUserId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowPermanentAccessKeyRequest, ShowPermanentAccessKeyResponse> showPermanentAccessKey =
        genForshowPermanentAccessKey();

    private static HttpRequestDef<ShowPermanentAccessKeyRequest, ShowPermanentAccessKeyResponse> genForshowPermanentAccessKey() {
        // basic
        HttpRequestDef.Builder<ShowPermanentAccessKeyRequest, ShowPermanentAccessKeyResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowPermanentAccessKeyRequest.class, ShowPermanentAccessKeyResponse.class)
            .withName("ShowPermanentAccessKey")
            .withUri("/v3.0/OS-CREDENTIAL/credentials/{access_key}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("access_key",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPermanentAccessKeyRequest::getAccessKey, (req, v) -> {
                req.setAccessKey(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdatePermanentAccessKeyRequest, UpdatePermanentAccessKeyResponse> updatePermanentAccessKey =
        genForupdatePermanentAccessKey();

    private static HttpRequestDef<UpdatePermanentAccessKeyRequest, UpdatePermanentAccessKeyResponse> genForupdatePermanentAccessKey() {
        // basic
        HttpRequestDef.Builder<UpdatePermanentAccessKeyRequest, UpdatePermanentAccessKeyResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT, UpdatePermanentAccessKeyRequest.class, UpdatePermanentAccessKeyResponse.class)
                .withName("UpdatePermanentAccessKey")
                .withUri("/v3.0/OS-CREDENTIAL/credentials/{access_key}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("access_key",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePermanentAccessKeyRequest::getAccessKey, (req, v) -> {
                req.setAccessKey(v);
            }));
        builder.<UpdatePermanentAccessKeyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdatePermanentAccessKeyRequestBody.class),
            f -> f.withMarshaller(UpdatePermanentAccessKeyRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateBindingDeviceRequest, CreateBindingDeviceResponse> createBindingDevice =
        genForcreateBindingDevice();

    private static HttpRequestDef<CreateBindingDeviceRequest, CreateBindingDeviceResponse> genForcreateBindingDevice() {
        // basic
        HttpRequestDef.Builder<CreateBindingDeviceRequest, CreateBindingDeviceResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, CreateBindingDeviceRequest.class, CreateBindingDeviceResponse.class)
                .withName("CreateBindingDevice")
                .withUri("/v3.0/OS-MFA/mfa-devices/bind")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<BindMfaDevice>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BindMfaDevice.class),
            f -> f.withMarshaller(CreateBindingDeviceRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateMfaDeviceRequest, CreateMfaDeviceResponse> createMfaDevice =
        genForcreateMfaDevice();

    private static HttpRequestDef<CreateMfaDeviceRequest, CreateMfaDeviceResponse> genForcreateMfaDevice() {
        // basic
        HttpRequestDef.Builder<CreateMfaDeviceRequest, CreateMfaDeviceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateMfaDeviceRequest.class, CreateMfaDeviceResponse.class)
                .withName("CreateMfaDevice")
                .withUri("/v3.0/OS-MFA/virtual-mfa-devices")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<CreateMfaDeviceReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateMfaDeviceReq.class),
            f -> f.withMarshaller(CreateMfaDeviceRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateUserRequest, CreateUserResponse> createUser = genForcreateUser();

    private static HttpRequestDef<CreateUserRequest, CreateUserResponse> genForcreateUser() {
        // basic
        HttpRequestDef.Builder<CreateUserRequest, CreateUserResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateUserRequest.class, CreateUserResponse.class)
                .withName("CreateUser")
                .withUri("/v3.0/OS-USER/users")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<CreateUserRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateUserRequestBody.class),
            f -> f.withMarshaller(CreateUserRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteBindingDeviceRequest, DeleteBindingDeviceResponse> deleteBindingDevice =
        genFordeleteBindingDevice();

    private static HttpRequestDef<DeleteBindingDeviceRequest, DeleteBindingDeviceResponse> genFordeleteBindingDevice() {
        // basic
        HttpRequestDef.Builder<DeleteBindingDeviceRequest, DeleteBindingDeviceResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, DeleteBindingDeviceRequest.class, DeleteBindingDeviceResponse.class)
                .withName("DeleteBindingDevice")
                .withUri("/v3.0/OS-MFA/mfa-devices/unbind")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<UnbindMfaDevice>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UnbindMfaDevice.class),
            f -> f.withMarshaller(DeleteBindingDeviceRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteMfaDeviceRequest, DeleteMfaDeviceResponse> deleteMfaDevice =
        genFordeleteMfaDevice();

    private static HttpRequestDef<DeleteMfaDeviceRequest, DeleteMfaDeviceResponse> genFordeleteMfaDevice() {
        // basic
        HttpRequestDef.Builder<DeleteMfaDeviceRequest, DeleteMfaDeviceResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteMfaDeviceRequest.class, DeleteMfaDeviceResponse.class)
                .withName("DeleteMfaDevice")
                .withUri("/v3.0/OS-MFA/virtual-mfa-devices")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("user_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteMfaDeviceRequest::getUserId, (req, v) -> {
                req.setUserId(v);
            }));
        builder.<String>withRequestField("serial_number",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteMfaDeviceRequest::getSerialNumber, (req, v) -> {
                req.setSerialNumber(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<KeystoneCreateUserRequest, KeystoneCreateUserResponse> keystoneCreateUser =
        genForkeystoneCreateUser();

    private static HttpRequestDef<KeystoneCreateUserRequest, KeystoneCreateUserResponse> genForkeystoneCreateUser() {
        // basic
        HttpRequestDef.Builder<KeystoneCreateUserRequest, KeystoneCreateUserResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, KeystoneCreateUserRequest.class, KeystoneCreateUserResponse.class)
                .withName("KeystoneCreateUser")
                .withUri("/v3/users")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<KeystoneCreateUserRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(KeystoneCreateUserRequestBody.class),
            f -> f.withMarshaller(KeystoneCreateUserRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<KeystoneDeleteUserRequest, KeystoneDeleteUserResponse> keystoneDeleteUser =
        genForkeystoneDeleteUser();

    private static HttpRequestDef<KeystoneDeleteUserRequest, KeystoneDeleteUserResponse> genForkeystoneDeleteUser() {
        // basic
        HttpRequestDef.Builder<KeystoneDeleteUserRequest, KeystoneDeleteUserResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, KeystoneDeleteUserRequest.class, KeystoneDeleteUserResponse.class)
                .withName("KeystoneDeleteUser")
                .withUri("/v3/users/{user_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("user_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(KeystoneDeleteUserRequest::getUserId, (req, v) -> {
                req.setUserId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<KeystoneListGroupsForUserRequest, KeystoneListGroupsForUserResponse> keystoneListGroupsForUser =
        genForkeystoneListGroupsForUser();

    private static HttpRequestDef<KeystoneListGroupsForUserRequest, KeystoneListGroupsForUserResponse> genForkeystoneListGroupsForUser() {
        // basic
        HttpRequestDef.Builder<KeystoneListGroupsForUserRequest, KeystoneListGroupsForUserResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    KeystoneListGroupsForUserRequest.class,
                    KeystoneListGroupsForUserResponse.class)
                .withName("KeystoneListGroupsForUser")
                .withUri("/v3/users/{user_id}/groups")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("user_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(KeystoneListGroupsForUserRequest::getUserId, (req, v) -> {
                req.setUserId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<KeystoneListUsersRequest, KeystoneListUsersResponse> keystoneListUsers =
        genForkeystoneListUsers();

    private static HttpRequestDef<KeystoneListUsersRequest, KeystoneListUsersResponse> genForkeystoneListUsers() {
        // basic
        HttpRequestDef.Builder<KeystoneListUsersRequest, KeystoneListUsersResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, KeystoneListUsersRequest.class, KeystoneListUsersResponse.class)
                .withName("KeystoneListUsers")
                .withUri("/v3/users")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(KeystoneListUsersRequest::getDomainId, (req, v) -> {
                req.setDomainId(v);
            }));
        builder.<Boolean>withRequestField("enabled",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(KeystoneListUsersRequest::getEnabled, (req, v) -> {
                req.setEnabled(v);
            }));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(KeystoneListUsersRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<String>withRequestField("password_expires_at",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(KeystoneListUsersRequest::getPasswordExpiresAt, (req, v) -> {
                req.setPasswordExpiresAt(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<KeystoneShowUserRequest, KeystoneShowUserResponse> keystoneShowUser =
        genForkeystoneShowUser();

    private static HttpRequestDef<KeystoneShowUserRequest, KeystoneShowUserResponse> genForkeystoneShowUser() {
        // basic
        HttpRequestDef.Builder<KeystoneShowUserRequest, KeystoneShowUserResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, KeystoneShowUserRequest.class, KeystoneShowUserResponse.class)
                .withName("KeystoneShowUser")
                .withUri("/v3/users/{user_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("user_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(KeystoneShowUserRequest::getUserId, (req, v) -> {
                req.setUserId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<KeystoneUpdateUserByAdminRequest, KeystoneUpdateUserByAdminResponse> keystoneUpdateUserByAdmin =
        genForkeystoneUpdateUserByAdmin();

    private static HttpRequestDef<KeystoneUpdateUserByAdminRequest, KeystoneUpdateUserByAdminResponse> genForkeystoneUpdateUserByAdmin() {
        // basic
        HttpRequestDef.Builder<KeystoneUpdateUserByAdminRequest, KeystoneUpdateUserByAdminResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PATCH,
                    KeystoneUpdateUserByAdminRequest.class,
                    KeystoneUpdateUserByAdminResponse.class)
                .withName("KeystoneUpdateUserByAdmin")
                .withUri("/v3/users/{user_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("user_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(KeystoneUpdateUserByAdminRequest::getUserId, (req, v) -> {
                req.setUserId(v);
            }));
        builder.<KeystoneUpdateUserByAdminRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(KeystoneUpdateUserByAdminRequestBody.class),
            f -> f.withMarshaller(KeystoneUpdateUserByAdminRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<KeystoneUpdateUserPasswordRequest, KeystoneUpdateUserPasswordResponse> keystoneUpdateUserPassword =
        genForkeystoneUpdateUserPassword();

    private static HttpRequestDef<KeystoneUpdateUserPasswordRequest, KeystoneUpdateUserPasswordResponse> genForkeystoneUpdateUserPassword() {
        // basic
        HttpRequestDef.Builder<KeystoneUpdateUserPasswordRequest, KeystoneUpdateUserPasswordResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    KeystoneUpdateUserPasswordRequest.class,
                    KeystoneUpdateUserPasswordResponse.class)
                .withName("KeystoneUpdateUserPassword")
                .withUri("/v3/users/{user_id}/password")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("user_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(KeystoneUpdateUserPasswordRequest::getUserId, (req, v) -> {
                req.setUserId(v);
            }));
        builder.<KeystoneUpdateUserPasswordRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(KeystoneUpdateUserPasswordRequestBody.class),
            f -> f.withMarshaller(KeystoneUpdateUserPasswordRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListUserLoginProtectsRequest, ListUserLoginProtectsResponse> listUserLoginProtects =
        genForlistUserLoginProtects();

    private static HttpRequestDef<ListUserLoginProtectsRequest, ListUserLoginProtectsResponse> genForlistUserLoginProtects() {
        // basic
        HttpRequestDef.Builder<ListUserLoginProtectsRequest, ListUserLoginProtectsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListUserLoginProtectsRequest.class, ListUserLoginProtectsResponse.class)
            .withName("ListUserLoginProtects")
            .withUri("/v3.0/OS-USER/login-protects")
            .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListUserMfaDevicesRequest, ListUserMfaDevicesResponse> listUserMfaDevices =
        genForlistUserMfaDevices();

    private static HttpRequestDef<ListUserMfaDevicesRequest, ListUserMfaDevicesResponse> genForlistUserMfaDevices() {
        // basic
        HttpRequestDef.Builder<ListUserMfaDevicesRequest, ListUserMfaDevicesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListUserMfaDevicesRequest.class, ListUserMfaDevicesResponse.class)
                .withName("ListUserMfaDevices")
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
                .withName("ShowUser")
                .withUri("/v3.0/OS-USER/users/{user_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("user_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowUserRequest::getUserId, (req, v) -> {
                req.setUserId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowUserLoginProtectRequest, ShowUserLoginProtectResponse> showUserLoginProtect =
        genForshowUserLoginProtect();

    private static HttpRequestDef<ShowUserLoginProtectRequest, ShowUserLoginProtectResponse> genForshowUserLoginProtect() {
        // basic
        HttpRequestDef.Builder<ShowUserLoginProtectRequest, ShowUserLoginProtectResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowUserLoginProtectRequest.class, ShowUserLoginProtectResponse.class)
            .withName("ShowUserLoginProtect")
            .withUri("/v3.0/OS-USER/users/{user_id}/login-protect")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("user_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowUserLoginProtectRequest::getUserId, (req, v) -> {
                req.setUserId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowUserMfaDeviceRequest, ShowUserMfaDeviceResponse> showUserMfaDevice =
        genForshowUserMfaDevice();

    private static HttpRequestDef<ShowUserMfaDeviceRequest, ShowUserMfaDeviceResponse> genForshowUserMfaDevice() {
        // basic
        HttpRequestDef.Builder<ShowUserMfaDeviceRequest, ShowUserMfaDeviceResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowUserMfaDeviceRequest.class, ShowUserMfaDeviceResponse.class)
                .withName("ShowUserMfaDevice")
                .withUri("/v3.0/OS-MFA/users/{user_id}/virtual-mfa-device")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("user_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowUserMfaDeviceRequest::getUserId, (req, v) -> {
                req.setUserId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateLoginProtectRequest, UpdateLoginProtectResponse> updateLoginProtect =
        genForupdateLoginProtect();

    private static HttpRequestDef<UpdateLoginProtectRequest, UpdateLoginProtectResponse> genForupdateLoginProtect() {
        // basic
        HttpRequestDef.Builder<UpdateLoginProtectRequest, UpdateLoginProtectResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateLoginProtectRequest.class, UpdateLoginProtectResponse.class)
                .withName("UpdateLoginProtect")
                .withUri("/v3.0/OS-USER/users/{user_id}/login-protect")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("user_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateLoginProtectRequest::getUserId, (req, v) -> {
                req.setUserId(v);
            }));
        builder.<UpdateLoginProjectReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateLoginProjectReq.class),
            f -> f.withMarshaller(UpdateLoginProtectRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateUserRequest, UpdateUserResponse> updateUser = genForupdateUser();

    private static HttpRequestDef<UpdateUserRequest, UpdateUserResponse> genForupdateUser() {
        // basic
        HttpRequestDef.Builder<UpdateUserRequest, UpdateUserResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateUserRequest.class, UpdateUserResponse.class)
                .withName("UpdateUser")
                .withUri("/v3.0/OS-USER/users/{user_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("user_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateUserRequest::getUserId, (req, v) -> {
                req.setUserId(v);
            }));
        builder.<UpdateUserRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateUserRequestBody.class),
            f -> f.withMarshaller(UpdateUserRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateUserInformationRequest, UpdateUserInformationResponse> updateUserInformation =
        genForupdateUserInformation();

    private static HttpRequestDef<UpdateUserInformationRequest, UpdateUserInformationResponse> genForupdateUserInformation() {
        // basic
        HttpRequestDef.Builder<UpdateUserInformationRequest, UpdateUserInformationResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateUserInformationRequest.class, UpdateUserInformationResponse.class)
            .withName("UpdateUserInformation")
            .withUri("/v3.0/OS-USER/users/{user_id}/info")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("user_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateUserInformationRequest::getUserId, (req, v) -> {
                req.setUserId(v);
            }));
        builder.<UpdateUserInformationRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateUserInformationRequestBody.class),
            f -> f.withMarshaller(UpdateUserInformationRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<KeystoneCreateAgencyTokenRequest, KeystoneCreateAgencyTokenResponse> keystoneCreateAgencyToken =
        genForkeystoneCreateAgencyToken();

    private static HttpRequestDef<KeystoneCreateAgencyTokenRequest, KeystoneCreateAgencyTokenResponse> genForkeystoneCreateAgencyToken() {
        // basic
        HttpRequestDef.Builder<KeystoneCreateAgencyTokenRequest, KeystoneCreateAgencyTokenResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    KeystoneCreateAgencyTokenRequest.class,
                    KeystoneCreateAgencyTokenResponse.class)
                .withName("KeystoneCreateAgencyToken")
                .withUri("/v3/auth/tokens")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("nocatalog",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(KeystoneCreateAgencyTokenRequest::getNocatalog, (req, v) -> {
                req.setNocatalog(v);
            }));
        builder.<KeystoneCreateAgencyTokenRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(KeystoneCreateAgencyTokenRequestBody.class),
            f -> f.withMarshaller(KeystoneCreateAgencyTokenRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        builder.<String>withResponseField("X-Subject-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(KeystoneCreateAgencyTokenResponse::getXSubjectToken,
                KeystoneCreateAgencyTokenResponse::setXSubjectToken));
        return builder.build();
    }

    public static final HttpRequestDef<KeystoneCreateUserTokenByPasswordRequest, KeystoneCreateUserTokenByPasswordResponse> keystoneCreateUserTokenByPassword =
        genForkeystoneCreateUserTokenByPassword();

    private static HttpRequestDef<KeystoneCreateUserTokenByPasswordRequest, KeystoneCreateUserTokenByPasswordResponse> genForkeystoneCreateUserTokenByPassword() {
        // basic
        HttpRequestDef.Builder<KeystoneCreateUserTokenByPasswordRequest, KeystoneCreateUserTokenByPasswordResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    KeystoneCreateUserTokenByPasswordRequest.class,
                    KeystoneCreateUserTokenByPasswordResponse.class)
                .withName("KeystoneCreateUserTokenByPassword")
                .withUri("/v3/auth/tokens")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("nocatalog",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(KeystoneCreateUserTokenByPasswordRequest::getNocatalog, (req, v) -> {
                req.setNocatalog(v);
            }));
        builder.<KeystoneCreateUserTokenByPasswordRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(KeystoneCreateUserTokenByPasswordRequestBody.class),
            f -> f.withMarshaller(KeystoneCreateUserTokenByPasswordRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        builder.<String>withResponseField("X-Subject-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(KeystoneCreateUserTokenByPasswordResponse::getXSubjectToken,
                KeystoneCreateUserTokenByPasswordResponse::setXSubjectToken));
        return builder.build();
    }

    public static final HttpRequestDef<KeystoneCreateUserTokenByPasswordAndMfaRequest, KeystoneCreateUserTokenByPasswordAndMfaResponse> keystoneCreateUserTokenByPasswordAndMfa =
        genForkeystoneCreateUserTokenByPasswordAndMfa();

    private static HttpRequestDef<KeystoneCreateUserTokenByPasswordAndMfaRequest, KeystoneCreateUserTokenByPasswordAndMfaResponse> genForkeystoneCreateUserTokenByPasswordAndMfa() {
        // basic
        HttpRequestDef.Builder<KeystoneCreateUserTokenByPasswordAndMfaRequest, KeystoneCreateUserTokenByPasswordAndMfaResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    KeystoneCreateUserTokenByPasswordAndMfaRequest.class,
                    KeystoneCreateUserTokenByPasswordAndMfaResponse.class)
                .withName("KeystoneCreateUserTokenByPasswordAndMfa")
                .withUri("/v3/auth/tokens")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("nocatalog",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(KeystoneCreateUserTokenByPasswordAndMfaRequest::getNocatalog, (req, v) -> {
                req.setNocatalog(v);
            }));
        builder.<KeystoneCreateUserTokenByPasswordAndMfaRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(KeystoneCreateUserTokenByPasswordAndMfaRequestBody.class),
            f -> f.withMarshaller(KeystoneCreateUserTokenByPasswordAndMfaRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        builder.<String>withResponseField("X-Subject-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(KeystoneCreateUserTokenByPasswordAndMfaResponse::getXSubjectToken,
                KeystoneCreateUserTokenByPasswordAndMfaResponse::setXSubjectToken));
        return builder.build();
    }

    public static final HttpRequestDef<KeystoneValidateTokenRequest, KeystoneValidateTokenResponse> keystoneValidateToken =
        genForkeystoneValidateToken();

    private static HttpRequestDef<KeystoneValidateTokenRequest, KeystoneValidateTokenResponse> genForkeystoneValidateToken() {
        // basic
        HttpRequestDef.Builder<KeystoneValidateTokenRequest, KeystoneValidateTokenResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, KeystoneValidateTokenRequest.class, KeystoneValidateTokenResponse.class)
            .withName("KeystoneValidateToken")
            .withUri("/v3/auth/tokens")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("nocatalog",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(KeystoneValidateTokenRequest::getNocatalog, (req, v) -> {
                req.setNocatalog(v);
            }));
        builder.<String>withRequestField("X-Subject-Token",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(KeystoneValidateTokenRequest::getXSubjectToken, (req, v) -> {
                req.setXSubjectToken(v);
            }));

        // response

        builder.<String>withResponseField("X-Subject-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(KeystoneValidateTokenResponse::getXSubjectToken,
                KeystoneValidateTokenResponse::setXSubjectToken));
        return builder.build();
    }

}
