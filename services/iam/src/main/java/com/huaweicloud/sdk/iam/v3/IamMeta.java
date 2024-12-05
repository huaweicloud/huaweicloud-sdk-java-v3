package com.huaweicloud.sdk.iam.v3;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.iam.v3.model.AssociateAgencyWithAllProjectsPermissionRequest;
import com.huaweicloud.sdk.iam.v3.model.AssociateAgencyWithAllProjectsPermissionResponse;
import com.huaweicloud.sdk.iam.v3.model.AssociateAgencyWithDomainPermissionRequest;
import com.huaweicloud.sdk.iam.v3.model.AssociateAgencyWithDomainPermissionResponse;
import com.huaweicloud.sdk.iam.v3.model.AssociateAgencyWithProjectPermissionRequest;
import com.huaweicloud.sdk.iam.v3.model.AssociateAgencyWithProjectPermissionResponse;
import com.huaweicloud.sdk.iam.v3.model.AssociateRoleToAgencyOnEnterpriseProjectRequest;
import com.huaweicloud.sdk.iam.v3.model.AssociateRoleToAgencyOnEnterpriseProjectResponse;
import com.huaweicloud.sdk.iam.v3.model.AssociateRoleToGroupOnEnterpriseProjectRequest;
import com.huaweicloud.sdk.iam.v3.model.AssociateRoleToGroupOnEnterpriseProjectResponse;
import com.huaweicloud.sdk.iam.v3.model.AssociateRoleToUserOnEnterpriseProjectRequest;
import com.huaweicloud.sdk.iam.v3.model.AssociateRoleToUserOnEnterpriseProjectResponse;
import com.huaweicloud.sdk.iam.v3.model.BindMfaDevice;
import com.huaweicloud.sdk.iam.v3.model.CheckAllProjectsPermissionForAgencyRequest;
import com.huaweicloud.sdk.iam.v3.model.CheckAllProjectsPermissionForAgencyResponse;
import com.huaweicloud.sdk.iam.v3.model.CheckDomainPermissionForAgencyRequest;
import com.huaweicloud.sdk.iam.v3.model.CheckDomainPermissionForAgencyResponse;
import com.huaweicloud.sdk.iam.v3.model.CheckProjectPermissionForAgencyRequest;
import com.huaweicloud.sdk.iam.v3.model.CheckProjectPermissionForAgencyResponse;
import com.huaweicloud.sdk.iam.v3.model.CreateAgencyCustomPolicyRequest;
import com.huaweicloud.sdk.iam.v3.model.CreateAgencyCustomPolicyRequestBody;
import com.huaweicloud.sdk.iam.v3.model.CreateAgencyCustomPolicyResponse;
import com.huaweicloud.sdk.iam.v3.model.CreateAgencyEpPolicyAssignmentReqBody;
import com.huaweicloud.sdk.iam.v3.model.CreateAgencyRequest;
import com.huaweicloud.sdk.iam.v3.model.CreateAgencyRequestBody;
import com.huaweicloud.sdk.iam.v3.model.CreateAgencyResponse;
import com.huaweicloud.sdk.iam.v3.model.CreateBindingDeviceRequest;
import com.huaweicloud.sdk.iam.v3.model.CreateBindingDeviceResponse;
import com.huaweicloud.sdk.iam.v3.model.CreateCloudServiceCustomPolicyRequest;
import com.huaweicloud.sdk.iam.v3.model.CreateCloudServiceCustomPolicyRequestBody;
import com.huaweicloud.sdk.iam.v3.model.CreateCloudServiceCustomPolicyResponse;
import com.huaweicloud.sdk.iam.v3.model.CreateLoginTokenRequest;
import com.huaweicloud.sdk.iam.v3.model.CreateLoginTokenRequestBody;
import com.huaweicloud.sdk.iam.v3.model.CreateLoginTokenResponse;
import com.huaweicloud.sdk.iam.v3.model.CreateMetadataRequest;
import com.huaweicloud.sdk.iam.v3.model.CreateMetadataRequestBody;
import com.huaweicloud.sdk.iam.v3.model.CreateMetadataResponse;
import com.huaweicloud.sdk.iam.v3.model.CreateMfaDeviceReq;
import com.huaweicloud.sdk.iam.v3.model.CreateMfaDeviceRequest;
import com.huaweicloud.sdk.iam.v3.model.CreateMfaDeviceResponse;
import com.huaweicloud.sdk.iam.v3.model.CreateOpenIdConnectConfigRequest;
import com.huaweicloud.sdk.iam.v3.model.CreateOpenIdConnectConfigRequestBody;
import com.huaweicloud.sdk.iam.v3.model.CreateOpenIdConnectConfigResponse;
import com.huaweicloud.sdk.iam.v3.model.CreateOrDelAgencyEpPolicyAssignmentReqBody;
import com.huaweicloud.sdk.iam.v3.model.CreatePermanentAccessKeyRequest;
import com.huaweicloud.sdk.iam.v3.model.CreatePermanentAccessKeyRequestBody;
import com.huaweicloud.sdk.iam.v3.model.CreatePermanentAccessKeyResponse;
import com.huaweicloud.sdk.iam.v3.model.CreateTemporaryAccessKeyByAgencyRequest;
import com.huaweicloud.sdk.iam.v3.model.CreateTemporaryAccessKeyByAgencyRequestBody;
import com.huaweicloud.sdk.iam.v3.model.CreateTemporaryAccessKeyByAgencyResponse;
import com.huaweicloud.sdk.iam.v3.model.CreateTemporaryAccessKeyByTokenRequest;
import com.huaweicloud.sdk.iam.v3.model.CreateTemporaryAccessKeyByTokenRequestBody;
import com.huaweicloud.sdk.iam.v3.model.CreateTemporaryAccessKeyByTokenResponse;
import com.huaweicloud.sdk.iam.v3.model.CreateTokenWithIdTokenRequest;
import com.huaweicloud.sdk.iam.v3.model.CreateTokenWithIdTokenResponse;
import com.huaweicloud.sdk.iam.v3.model.CreateUnscopedTokenWithIdTokenRequest;
import com.huaweicloud.sdk.iam.v3.model.CreateUnscopedTokenWithIdTokenResponse;
import com.huaweicloud.sdk.iam.v3.model.CreateUserRequest;
import com.huaweicloud.sdk.iam.v3.model.CreateUserRequestBody;
import com.huaweicloud.sdk.iam.v3.model.CreateUserResponse;
import com.huaweicloud.sdk.iam.v3.model.DeleteAgencyRequest;
import com.huaweicloud.sdk.iam.v3.model.DeleteAgencyResponse;
import com.huaweicloud.sdk.iam.v3.model.DeleteBindingDeviceRequest;
import com.huaweicloud.sdk.iam.v3.model.DeleteBindingDeviceResponse;
import com.huaweicloud.sdk.iam.v3.model.DeleteCustomPolicyRequest;
import com.huaweicloud.sdk.iam.v3.model.DeleteCustomPolicyResponse;
import com.huaweicloud.sdk.iam.v3.model.DeleteDomainGroupInheritedRoleRequest;
import com.huaweicloud.sdk.iam.v3.model.DeleteDomainGroupInheritedRoleResponse;
import com.huaweicloud.sdk.iam.v3.model.DeleteMfaDeviceRequest;
import com.huaweicloud.sdk.iam.v3.model.DeleteMfaDeviceResponse;
import com.huaweicloud.sdk.iam.v3.model.DeletePermanentAccessKeyRequest;
import com.huaweicloud.sdk.iam.v3.model.DeletePermanentAccessKeyResponse;
import com.huaweicloud.sdk.iam.v3.model.GetIdTokenRequestBody;
import com.huaweicloud.sdk.iam.v3.model.KeystoneAddUserToGroupRequest;
import com.huaweicloud.sdk.iam.v3.model.KeystoneAddUserToGroupResponse;
import com.huaweicloud.sdk.iam.v3.model.KeystoneAssociateGroupWithDomainPermissionRequest;
import com.huaweicloud.sdk.iam.v3.model.KeystoneAssociateGroupWithDomainPermissionResponse;
import com.huaweicloud.sdk.iam.v3.model.KeystoneAssociateGroupWithProjectPermissionRequest;
import com.huaweicloud.sdk.iam.v3.model.KeystoneAssociateGroupWithProjectPermissionResponse;
import com.huaweicloud.sdk.iam.v3.model.KeystoneCheckDomainPermissionForGroupRequest;
import com.huaweicloud.sdk.iam.v3.model.KeystoneCheckDomainPermissionForGroupResponse;
import com.huaweicloud.sdk.iam.v3.model.KeystoneCheckProjectPermissionForGroupRequest;
import com.huaweicloud.sdk.iam.v3.model.KeystoneCheckProjectPermissionForGroupResponse;
import com.huaweicloud.sdk.iam.v3.model.KeystoneCheckUserInGroupRequest;
import com.huaweicloud.sdk.iam.v3.model.KeystoneCheckUserInGroupResponse;
import com.huaweicloud.sdk.iam.v3.model.KeystoneCheckroleForGroupRequest;
import com.huaweicloud.sdk.iam.v3.model.KeystoneCheckroleForGroupResponse;
import com.huaweicloud.sdk.iam.v3.model.KeystoneCreateAgencyTokenRequest;
import com.huaweicloud.sdk.iam.v3.model.KeystoneCreateAgencyTokenRequestBody;
import com.huaweicloud.sdk.iam.v3.model.KeystoneCreateAgencyTokenResponse;
import com.huaweicloud.sdk.iam.v3.model.KeystoneCreateGroupRequest;
import com.huaweicloud.sdk.iam.v3.model.KeystoneCreateGroupRequestBody;
import com.huaweicloud.sdk.iam.v3.model.KeystoneCreateGroupResponse;
import com.huaweicloud.sdk.iam.v3.model.KeystoneCreateIdentityProviderRequest;
import com.huaweicloud.sdk.iam.v3.model.KeystoneCreateIdentityProviderRequestBody;
import com.huaweicloud.sdk.iam.v3.model.KeystoneCreateIdentityProviderResponse;
import com.huaweicloud.sdk.iam.v3.model.KeystoneCreateMappingRequest;
import com.huaweicloud.sdk.iam.v3.model.KeystoneCreateMappingRequestBody;
import com.huaweicloud.sdk.iam.v3.model.KeystoneCreateMappingResponse;
import com.huaweicloud.sdk.iam.v3.model.KeystoneCreateProjectRequest;
import com.huaweicloud.sdk.iam.v3.model.KeystoneCreateProjectRequestBody;
import com.huaweicloud.sdk.iam.v3.model.KeystoneCreateProjectResponse;
import com.huaweicloud.sdk.iam.v3.model.KeystoneCreateProtocolRequest;
import com.huaweicloud.sdk.iam.v3.model.KeystoneCreateProtocolRequestBody;
import com.huaweicloud.sdk.iam.v3.model.KeystoneCreateProtocolResponse;
import com.huaweicloud.sdk.iam.v3.model.KeystoneCreateScopedTokenRequest;
import com.huaweicloud.sdk.iam.v3.model.KeystoneCreateScopedTokenRequestBody;
import com.huaweicloud.sdk.iam.v3.model.KeystoneCreateScopedTokenResponse;
import com.huaweicloud.sdk.iam.v3.model.KeystoneCreateUserRequest;
import com.huaweicloud.sdk.iam.v3.model.KeystoneCreateUserRequestBody;
import com.huaweicloud.sdk.iam.v3.model.KeystoneCreateUserResponse;
import com.huaweicloud.sdk.iam.v3.model.KeystoneCreateUserTokenByPasswordAndMfaRequest;
import com.huaweicloud.sdk.iam.v3.model.KeystoneCreateUserTokenByPasswordAndMfaRequestBody;
import com.huaweicloud.sdk.iam.v3.model.KeystoneCreateUserTokenByPasswordAndMfaResponse;
import com.huaweicloud.sdk.iam.v3.model.KeystoneCreateUserTokenByPasswordRequest;
import com.huaweicloud.sdk.iam.v3.model.KeystoneCreateUserTokenByPasswordRequestBody;
import com.huaweicloud.sdk.iam.v3.model.KeystoneCreateUserTokenByPasswordResponse;
import com.huaweicloud.sdk.iam.v3.model.KeystoneDeleteGroupRequest;
import com.huaweicloud.sdk.iam.v3.model.KeystoneDeleteGroupResponse;
import com.huaweicloud.sdk.iam.v3.model.KeystoneDeleteIdentityProviderRequest;
import com.huaweicloud.sdk.iam.v3.model.KeystoneDeleteIdentityProviderResponse;
import com.huaweicloud.sdk.iam.v3.model.KeystoneDeleteMappingRequest;
import com.huaweicloud.sdk.iam.v3.model.KeystoneDeleteMappingResponse;
import com.huaweicloud.sdk.iam.v3.model.KeystoneDeleteProtocolRequest;
import com.huaweicloud.sdk.iam.v3.model.KeystoneDeleteProtocolResponse;
import com.huaweicloud.sdk.iam.v3.model.KeystoneDeleteUserRequest;
import com.huaweicloud.sdk.iam.v3.model.KeystoneDeleteUserResponse;
import com.huaweicloud.sdk.iam.v3.model.KeystoneListAllProjectPermissionsForGroupRequest;
import com.huaweicloud.sdk.iam.v3.model.KeystoneListAllProjectPermissionsForGroupResponse;
import com.huaweicloud.sdk.iam.v3.model.KeystoneListAuthDomainsRequest;
import com.huaweicloud.sdk.iam.v3.model.KeystoneListAuthDomainsResponse;
import com.huaweicloud.sdk.iam.v3.model.KeystoneListAuthProjectsRequest;
import com.huaweicloud.sdk.iam.v3.model.KeystoneListAuthProjectsResponse;
import com.huaweicloud.sdk.iam.v3.model.KeystoneListDomainPermissionsForGroupRequest;
import com.huaweicloud.sdk.iam.v3.model.KeystoneListDomainPermissionsForGroupResponse;
import com.huaweicloud.sdk.iam.v3.model.KeystoneListEndpointsRequest;
import com.huaweicloud.sdk.iam.v3.model.KeystoneListEndpointsResponse;
import com.huaweicloud.sdk.iam.v3.model.KeystoneListFederationDomainsRequest;
import com.huaweicloud.sdk.iam.v3.model.KeystoneListFederationDomainsResponse;
import com.huaweicloud.sdk.iam.v3.model.KeystoneListFederationProjectsRequest;
import com.huaweicloud.sdk.iam.v3.model.KeystoneListFederationProjectsResponse;
import com.huaweicloud.sdk.iam.v3.model.KeystoneListGroupsForUserRequest;
import com.huaweicloud.sdk.iam.v3.model.KeystoneListGroupsForUserResponse;
import com.huaweicloud.sdk.iam.v3.model.KeystoneListGroupsRequest;
import com.huaweicloud.sdk.iam.v3.model.KeystoneListGroupsResponse;
import com.huaweicloud.sdk.iam.v3.model.KeystoneListIdentityProvidersRequest;
import com.huaweicloud.sdk.iam.v3.model.KeystoneListIdentityProvidersResponse;
import com.huaweicloud.sdk.iam.v3.model.KeystoneListMappingsRequest;
import com.huaweicloud.sdk.iam.v3.model.KeystoneListMappingsResponse;
import com.huaweicloud.sdk.iam.v3.model.KeystoneListPermissionsRequest;
import com.huaweicloud.sdk.iam.v3.model.KeystoneListPermissionsResponse;
import com.huaweicloud.sdk.iam.v3.model.KeystoneListProjectPermissionsForGroupRequest;
import com.huaweicloud.sdk.iam.v3.model.KeystoneListProjectPermissionsForGroupResponse;
import com.huaweicloud.sdk.iam.v3.model.KeystoneListProjectsForUserRequest;
import com.huaweicloud.sdk.iam.v3.model.KeystoneListProjectsForUserResponse;
import com.huaweicloud.sdk.iam.v3.model.KeystoneListProjectsRequest;
import com.huaweicloud.sdk.iam.v3.model.KeystoneListProjectsResponse;
import com.huaweicloud.sdk.iam.v3.model.KeystoneListProtocolsRequest;
import com.huaweicloud.sdk.iam.v3.model.KeystoneListProtocolsResponse;
import com.huaweicloud.sdk.iam.v3.model.KeystoneListRegionsRequest;
import com.huaweicloud.sdk.iam.v3.model.KeystoneListRegionsResponse;
import com.huaweicloud.sdk.iam.v3.model.KeystoneListServicesRequest;
import com.huaweicloud.sdk.iam.v3.model.KeystoneListServicesResponse;
import com.huaweicloud.sdk.iam.v3.model.KeystoneListUsersForGroupByAdminRequest;
import com.huaweicloud.sdk.iam.v3.model.KeystoneListUsersForGroupByAdminResponse;
import com.huaweicloud.sdk.iam.v3.model.KeystoneListUsersRequest;
import com.huaweicloud.sdk.iam.v3.model.KeystoneListUsersResponse;
import com.huaweicloud.sdk.iam.v3.model.KeystoneListVersionsRequest;
import com.huaweicloud.sdk.iam.v3.model.KeystoneListVersionsResponse;
import com.huaweicloud.sdk.iam.v3.model.KeystoneRemoveDomainPermissionFromGroupRequest;
import com.huaweicloud.sdk.iam.v3.model.KeystoneRemoveDomainPermissionFromGroupResponse;
import com.huaweicloud.sdk.iam.v3.model.KeystoneRemoveProjectPermissionFromGroupRequest;
import com.huaweicloud.sdk.iam.v3.model.KeystoneRemoveProjectPermissionFromGroupResponse;
import com.huaweicloud.sdk.iam.v3.model.KeystoneRemoveUserFromGroupRequest;
import com.huaweicloud.sdk.iam.v3.model.KeystoneRemoveUserFromGroupResponse;
import com.huaweicloud.sdk.iam.v3.model.KeystoneShowCatalogRequest;
import com.huaweicloud.sdk.iam.v3.model.KeystoneShowCatalogResponse;
import com.huaweicloud.sdk.iam.v3.model.KeystoneShowEndpointRequest;
import com.huaweicloud.sdk.iam.v3.model.KeystoneShowEndpointResponse;
import com.huaweicloud.sdk.iam.v3.model.KeystoneShowGroupRequest;
import com.huaweicloud.sdk.iam.v3.model.KeystoneShowGroupResponse;
import com.huaweicloud.sdk.iam.v3.model.KeystoneShowIdentityProviderRequest;
import com.huaweicloud.sdk.iam.v3.model.KeystoneShowIdentityProviderResponse;
import com.huaweicloud.sdk.iam.v3.model.KeystoneShowMappingRequest;
import com.huaweicloud.sdk.iam.v3.model.KeystoneShowMappingResponse;
import com.huaweicloud.sdk.iam.v3.model.KeystoneShowPermissionRequest;
import com.huaweicloud.sdk.iam.v3.model.KeystoneShowPermissionResponse;
import com.huaweicloud.sdk.iam.v3.model.KeystoneShowProjectRequest;
import com.huaweicloud.sdk.iam.v3.model.KeystoneShowProjectResponse;
import com.huaweicloud.sdk.iam.v3.model.KeystoneShowProtocolRequest;
import com.huaweicloud.sdk.iam.v3.model.KeystoneShowProtocolResponse;
import com.huaweicloud.sdk.iam.v3.model.KeystoneShowRegionRequest;
import com.huaweicloud.sdk.iam.v3.model.KeystoneShowRegionResponse;
import com.huaweicloud.sdk.iam.v3.model.KeystoneShowSecurityComplianceByOptionRequest;
import com.huaweicloud.sdk.iam.v3.model.KeystoneShowSecurityComplianceByOptionResponse;
import com.huaweicloud.sdk.iam.v3.model.KeystoneShowSecurityComplianceRequest;
import com.huaweicloud.sdk.iam.v3.model.KeystoneShowSecurityComplianceResponse;
import com.huaweicloud.sdk.iam.v3.model.KeystoneShowServiceRequest;
import com.huaweicloud.sdk.iam.v3.model.KeystoneShowServiceResponse;
import com.huaweicloud.sdk.iam.v3.model.KeystoneShowUserRequest;
import com.huaweicloud.sdk.iam.v3.model.KeystoneShowUserResponse;
import com.huaweicloud.sdk.iam.v3.model.KeystoneShowVersionRequest;
import com.huaweicloud.sdk.iam.v3.model.KeystoneShowVersionResponse;
import com.huaweicloud.sdk.iam.v3.model.KeystoneUpdateGroupRequest;
import com.huaweicloud.sdk.iam.v3.model.KeystoneUpdateGroupRequestBody;
import com.huaweicloud.sdk.iam.v3.model.KeystoneUpdateGroupResponse;
import com.huaweicloud.sdk.iam.v3.model.KeystoneUpdateIdentityProviderRequest;
import com.huaweicloud.sdk.iam.v3.model.KeystoneUpdateIdentityProviderRequestBody;
import com.huaweicloud.sdk.iam.v3.model.KeystoneUpdateIdentityProviderResponse;
import com.huaweicloud.sdk.iam.v3.model.KeystoneUpdateMappingRequest;
import com.huaweicloud.sdk.iam.v3.model.KeystoneUpdateMappingRequestBody;
import com.huaweicloud.sdk.iam.v3.model.KeystoneUpdateMappingResponse;
import com.huaweicloud.sdk.iam.v3.model.KeystoneUpdateProjectRequest;
import com.huaweicloud.sdk.iam.v3.model.KeystoneUpdateProjectRequestBody;
import com.huaweicloud.sdk.iam.v3.model.KeystoneUpdateProjectResponse;
import com.huaweicloud.sdk.iam.v3.model.KeystoneUpdateProtocolRequest;
import com.huaweicloud.sdk.iam.v3.model.KeystoneUpdateProtocolRequestBody;
import com.huaweicloud.sdk.iam.v3.model.KeystoneUpdateProtocolResponse;
import com.huaweicloud.sdk.iam.v3.model.KeystoneUpdateUserByAdminRequest;
import com.huaweicloud.sdk.iam.v3.model.KeystoneUpdateUserByAdminRequestBody;
import com.huaweicloud.sdk.iam.v3.model.KeystoneUpdateUserByAdminResponse;
import com.huaweicloud.sdk.iam.v3.model.KeystoneUpdateUserPasswordRequest;
import com.huaweicloud.sdk.iam.v3.model.KeystoneUpdateUserPasswordRequestBody;
import com.huaweicloud.sdk.iam.v3.model.KeystoneUpdateUserPasswordResponse;
import com.huaweicloud.sdk.iam.v3.model.KeystoneValidateTokenRequest;
import com.huaweicloud.sdk.iam.v3.model.KeystoneValidateTokenResponse;
import com.huaweicloud.sdk.iam.v3.model.ListAgenciesRequest;
import com.huaweicloud.sdk.iam.v3.model.ListAgenciesResponse;
import com.huaweicloud.sdk.iam.v3.model.ListAllProjectsPermissionsForAgencyRequest;
import com.huaweicloud.sdk.iam.v3.model.ListAllProjectsPermissionsForAgencyResponse;
import com.huaweicloud.sdk.iam.v3.model.ListCustomPoliciesRequest;
import com.huaweicloud.sdk.iam.v3.model.ListCustomPoliciesResponse;
import com.huaweicloud.sdk.iam.v3.model.ListDomainPermissionsForAgencyRequest;
import com.huaweicloud.sdk.iam.v3.model.ListDomainPermissionsForAgencyResponse;
import com.huaweicloud.sdk.iam.v3.model.ListEnterpriseProjectsForGroupRequest;
import com.huaweicloud.sdk.iam.v3.model.ListEnterpriseProjectsForGroupResponse;
import com.huaweicloud.sdk.iam.v3.model.ListEnterpriseProjectsForUserRequest;
import com.huaweicloud.sdk.iam.v3.model.ListEnterpriseProjectsForUserResponse;
import com.huaweicloud.sdk.iam.v3.model.ListGroupsForEnterpriseProjectRequest;
import com.huaweicloud.sdk.iam.v3.model.ListGroupsForEnterpriseProjectResponse;
import com.huaweicloud.sdk.iam.v3.model.ListPermanentAccessKeysRequest;
import com.huaweicloud.sdk.iam.v3.model.ListPermanentAccessKeysResponse;
import com.huaweicloud.sdk.iam.v3.model.ListProjectPermissionsForAgencyRequest;
import com.huaweicloud.sdk.iam.v3.model.ListProjectPermissionsForAgencyResponse;
import com.huaweicloud.sdk.iam.v3.model.ListRolesForGroupOnEnterpriseProjectRequest;
import com.huaweicloud.sdk.iam.v3.model.ListRolesForGroupOnEnterpriseProjectResponse;
import com.huaweicloud.sdk.iam.v3.model.ListRolesForUserOnEnterpriseProjectRequest;
import com.huaweicloud.sdk.iam.v3.model.ListRolesForUserOnEnterpriseProjectResponse;
import com.huaweicloud.sdk.iam.v3.model.ListUserLoginProtectsRequest;
import com.huaweicloud.sdk.iam.v3.model.ListUserLoginProtectsResponse;
import com.huaweicloud.sdk.iam.v3.model.ListUserMfaDevicesRequest;
import com.huaweicloud.sdk.iam.v3.model.ListUserMfaDevicesResponse;
import com.huaweicloud.sdk.iam.v3.model.ListUsersForEnterpriseProjectRequest;
import com.huaweicloud.sdk.iam.v3.model.ListUsersForEnterpriseProjectResponse;
import com.huaweicloud.sdk.iam.v3.model.RemoveAllProjectsPermissionFromAgencyRequest;
import com.huaweicloud.sdk.iam.v3.model.RemoveAllProjectsPermissionFromAgencyResponse;
import com.huaweicloud.sdk.iam.v3.model.RemoveDomainPermissionFromAgencyRequest;
import com.huaweicloud.sdk.iam.v3.model.RemoveDomainPermissionFromAgencyResponse;
import com.huaweicloud.sdk.iam.v3.model.RemoveProjectPermissionFromAgencyRequest;
import com.huaweicloud.sdk.iam.v3.model.RemoveProjectPermissionFromAgencyResponse;
import com.huaweicloud.sdk.iam.v3.model.RevokeRoleFromAgencyOnEnterpriseProjectRequest;
import com.huaweicloud.sdk.iam.v3.model.RevokeRoleFromAgencyOnEnterpriseProjectResponse;
import com.huaweicloud.sdk.iam.v3.model.RevokeRoleFromGroupOnEnterpriseProjectRequest;
import com.huaweicloud.sdk.iam.v3.model.RevokeRoleFromGroupOnEnterpriseProjectResponse;
import com.huaweicloud.sdk.iam.v3.model.RevokeRoleFromUserOnEnterpriseProjectRequest;
import com.huaweicloud.sdk.iam.v3.model.RevokeRoleFromUserOnEnterpriseProjectResponse;
import com.huaweicloud.sdk.iam.v3.model.ShowAgencyRequest;
import com.huaweicloud.sdk.iam.v3.model.ShowAgencyResponse;
import com.huaweicloud.sdk.iam.v3.model.ShowCustomPolicyRequest;
import com.huaweicloud.sdk.iam.v3.model.ShowCustomPolicyResponse;
import com.huaweicloud.sdk.iam.v3.model.ShowDomainApiAclPolicyRequest;
import com.huaweicloud.sdk.iam.v3.model.ShowDomainApiAclPolicyResponse;
import com.huaweicloud.sdk.iam.v3.model.ShowDomainConsoleAclPolicyRequest;
import com.huaweicloud.sdk.iam.v3.model.ShowDomainConsoleAclPolicyResponse;
import com.huaweicloud.sdk.iam.v3.model.ShowDomainLoginPolicyRequest;
import com.huaweicloud.sdk.iam.v3.model.ShowDomainLoginPolicyResponse;
import com.huaweicloud.sdk.iam.v3.model.ShowDomainPasswordPolicyRequest;
import com.huaweicloud.sdk.iam.v3.model.ShowDomainPasswordPolicyResponse;
import com.huaweicloud.sdk.iam.v3.model.ShowDomainProtectPolicyRequest;
import com.huaweicloud.sdk.iam.v3.model.ShowDomainProtectPolicyResponse;
import com.huaweicloud.sdk.iam.v3.model.ShowDomainQuotaRequest;
import com.huaweicloud.sdk.iam.v3.model.ShowDomainQuotaResponse;
import com.huaweicloud.sdk.iam.v3.model.ShowDomainRoleAssignmentsRequest;
import com.huaweicloud.sdk.iam.v3.model.ShowDomainRoleAssignmentsResponse;
import com.huaweicloud.sdk.iam.v3.model.ShowMetadataRequest;
import com.huaweicloud.sdk.iam.v3.model.ShowMetadataResponse;
import com.huaweicloud.sdk.iam.v3.model.ShowOpenIdConnectConfigRequest;
import com.huaweicloud.sdk.iam.v3.model.ShowOpenIdConnectConfigResponse;
import com.huaweicloud.sdk.iam.v3.model.ShowPermanentAccessKeyRequest;
import com.huaweicloud.sdk.iam.v3.model.ShowPermanentAccessKeyResponse;
import com.huaweicloud.sdk.iam.v3.model.ShowProjectDetailsAndStatusRequest;
import com.huaweicloud.sdk.iam.v3.model.ShowProjectDetailsAndStatusResponse;
import com.huaweicloud.sdk.iam.v3.model.ShowProjectQuotaRequest;
import com.huaweicloud.sdk.iam.v3.model.ShowProjectQuotaResponse;
import com.huaweicloud.sdk.iam.v3.model.ShowUserLoginProtectRequest;
import com.huaweicloud.sdk.iam.v3.model.ShowUserLoginProtectResponse;
import com.huaweicloud.sdk.iam.v3.model.ShowUserMfaDeviceRequest;
import com.huaweicloud.sdk.iam.v3.model.ShowUserMfaDeviceResponse;
import com.huaweicloud.sdk.iam.v3.model.ShowUserRequest;
import com.huaweicloud.sdk.iam.v3.model.ShowUserResponse;
import com.huaweicloud.sdk.iam.v3.model.UnbindMfaDevice;
import com.huaweicloud.sdk.iam.v3.model.UpdateAgencyCustomPolicyRequest;
import com.huaweicloud.sdk.iam.v3.model.UpdateAgencyCustomPolicyRequestBody;
import com.huaweicloud.sdk.iam.v3.model.UpdateAgencyCustomPolicyResponse;
import com.huaweicloud.sdk.iam.v3.model.UpdateAgencyRequest;
import com.huaweicloud.sdk.iam.v3.model.UpdateAgencyRequestBody;
import com.huaweicloud.sdk.iam.v3.model.UpdateAgencyResponse;
import com.huaweicloud.sdk.iam.v3.model.UpdateCloudServiceCustomPolicyRequest;
import com.huaweicloud.sdk.iam.v3.model.UpdateCloudServiceCustomPolicyRequestBody;
import com.huaweicloud.sdk.iam.v3.model.UpdateCloudServiceCustomPolicyResponse;
import com.huaweicloud.sdk.iam.v3.model.UpdateDomainApiAclPolicyRequest;
import com.huaweicloud.sdk.iam.v3.model.UpdateDomainApiAclPolicyRequestBody;
import com.huaweicloud.sdk.iam.v3.model.UpdateDomainApiAclPolicyResponse;
import com.huaweicloud.sdk.iam.v3.model.UpdateDomainConsoleAclPolicyRequest;
import com.huaweicloud.sdk.iam.v3.model.UpdateDomainConsoleAclPolicyRequestBody;
import com.huaweicloud.sdk.iam.v3.model.UpdateDomainConsoleAclPolicyResponse;
import com.huaweicloud.sdk.iam.v3.model.UpdateDomainGroupInheritRoleRequest;
import com.huaweicloud.sdk.iam.v3.model.UpdateDomainGroupInheritRoleResponse;
import com.huaweicloud.sdk.iam.v3.model.UpdateDomainLoginPolicyRequest;
import com.huaweicloud.sdk.iam.v3.model.UpdateDomainLoginPolicyRequestBody;
import com.huaweicloud.sdk.iam.v3.model.UpdateDomainLoginPolicyResponse;
import com.huaweicloud.sdk.iam.v3.model.UpdateDomainPasswordPolicyRequest;
import com.huaweicloud.sdk.iam.v3.model.UpdateDomainPasswordPolicyRequestBody;
import com.huaweicloud.sdk.iam.v3.model.UpdateDomainPasswordPolicyResponse;
import com.huaweicloud.sdk.iam.v3.model.UpdateDomainProtectPolicyRequest;
import com.huaweicloud.sdk.iam.v3.model.UpdateDomainProtectPolicyRequestBody;
import com.huaweicloud.sdk.iam.v3.model.UpdateDomainProtectPolicyResponse;
import com.huaweicloud.sdk.iam.v3.model.UpdateLoginProjectReq;
import com.huaweicloud.sdk.iam.v3.model.UpdateLoginProtectRequest;
import com.huaweicloud.sdk.iam.v3.model.UpdateLoginProtectResponse;
import com.huaweicloud.sdk.iam.v3.model.UpdateOpenIdConnectConfigRequest;
import com.huaweicloud.sdk.iam.v3.model.UpdateOpenIdConnectConfigRequestBody;
import com.huaweicloud.sdk.iam.v3.model.UpdateOpenIdConnectConfigResponse;
import com.huaweicloud.sdk.iam.v3.model.UpdatePermanentAccessKeyRequest;
import com.huaweicloud.sdk.iam.v3.model.UpdatePermanentAccessKeyRequestBody;
import com.huaweicloud.sdk.iam.v3.model.UpdatePermanentAccessKeyResponse;
import com.huaweicloud.sdk.iam.v3.model.UpdateProjectStatusRequest;
import com.huaweicloud.sdk.iam.v3.model.UpdateProjectStatusRequestBody;
import com.huaweicloud.sdk.iam.v3.model.UpdateProjectStatusResponse;
import com.huaweicloud.sdk.iam.v3.model.UpdateUserInformationRequest;
import com.huaweicloud.sdk.iam.v3.model.UpdateUserInformationRequestBody;
import com.huaweicloud.sdk.iam.v3.model.UpdateUserInformationResponse;
import com.huaweicloud.sdk.iam.v3.model.UpdateUserRequest;
import com.huaweicloud.sdk.iam.v3.model.UpdateUserRequestBody;
import com.huaweicloud.sdk.iam.v3.model.UpdateUserResponse;

@SuppressWarnings("unchecked")
public class IamMeta {

    public static final HttpRequestDef<AssociateAgencyWithAllProjectsPermissionRequest, AssociateAgencyWithAllProjectsPermissionResponse> associateAgencyWithAllProjectsPermission =
        genForAssociateAgencyWithAllProjectsPermission();

    private static HttpRequestDef<AssociateAgencyWithAllProjectsPermissionRequest, AssociateAgencyWithAllProjectsPermissionResponse> genForAssociateAgencyWithAllProjectsPermission() {
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
            f -> f.withMarshaller(AssociateAgencyWithAllProjectsPermissionRequest::getAgencyId,
                AssociateAgencyWithAllProjectsPermissionRequest::setAgencyId));
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AssociateAgencyWithAllProjectsPermissionRequest::getDomainId,
                AssociateAgencyWithAllProjectsPermissionRequest::setDomainId));
        builder.<String>withRequestField("role_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AssociateAgencyWithAllProjectsPermissionRequest::getRoleId,
                AssociateAgencyWithAllProjectsPermissionRequest::setRoleId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AssociateAgencyWithDomainPermissionRequest, AssociateAgencyWithDomainPermissionResponse> associateAgencyWithDomainPermission =
        genForAssociateAgencyWithDomainPermission();

    private static HttpRequestDef<AssociateAgencyWithDomainPermissionRequest, AssociateAgencyWithDomainPermissionResponse> genForAssociateAgencyWithDomainPermission() {
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
            f -> f.withMarshaller(AssociateAgencyWithDomainPermissionRequest::getDomainId,
                AssociateAgencyWithDomainPermissionRequest::setDomainId));
        builder.<String>withRequestField("agency_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AssociateAgencyWithDomainPermissionRequest::getAgencyId,
                AssociateAgencyWithDomainPermissionRequest::setAgencyId));
        builder.<String>withRequestField("role_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AssociateAgencyWithDomainPermissionRequest::getRoleId,
                AssociateAgencyWithDomainPermissionRequest::setRoleId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AssociateAgencyWithProjectPermissionRequest, AssociateAgencyWithProjectPermissionResponse> associateAgencyWithProjectPermission =
        genForAssociateAgencyWithProjectPermission();

    private static HttpRequestDef<AssociateAgencyWithProjectPermissionRequest, AssociateAgencyWithProjectPermissionResponse> genForAssociateAgencyWithProjectPermission() {
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
            f -> f.withMarshaller(AssociateAgencyWithProjectPermissionRequest::getProjectId,
                AssociateAgencyWithProjectPermissionRequest::setProjectId));
        builder.<String>withRequestField("agency_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AssociateAgencyWithProjectPermissionRequest::getAgencyId,
                AssociateAgencyWithProjectPermissionRequest::setAgencyId));
        builder.<String>withRequestField("role_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AssociateAgencyWithProjectPermissionRequest::getRoleId,
                AssociateAgencyWithProjectPermissionRequest::setRoleId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AssociateRoleToAgencyOnEnterpriseProjectRequest, AssociateRoleToAgencyOnEnterpriseProjectResponse> associateRoleToAgencyOnEnterpriseProject =
        genForAssociateRoleToAgencyOnEnterpriseProject();

    private static HttpRequestDef<AssociateRoleToAgencyOnEnterpriseProjectRequest, AssociateRoleToAgencyOnEnterpriseProjectResponse> genForAssociateRoleToAgencyOnEnterpriseProject() {
        // basic
        HttpRequestDef.Builder<AssociateRoleToAgencyOnEnterpriseProjectRequest, AssociateRoleToAgencyOnEnterpriseProjectResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    AssociateRoleToAgencyOnEnterpriseProjectRequest.class,
                    AssociateRoleToAgencyOnEnterpriseProjectResponse.class)
                .withName("AssociateRoleToAgencyOnEnterpriseProject")
                .withUri("/v3.0/OS-PERMISSION/subjects/agency/scopes/enterprise-project/role-assignments")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<CreateAgencyEpPolicyAssignmentReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateAgencyEpPolicyAssignmentReqBody.class),
            f -> f.withMarshaller(AssociateRoleToAgencyOnEnterpriseProjectRequest::getBody,
                AssociateRoleToAgencyOnEnterpriseProjectRequest::setBody));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(AssociateRoleToAgencyOnEnterpriseProjectResponse::getBody,
                AssociateRoleToAgencyOnEnterpriseProjectResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<AssociateRoleToGroupOnEnterpriseProjectRequest, AssociateRoleToGroupOnEnterpriseProjectResponse> associateRoleToGroupOnEnterpriseProject =
        genForAssociateRoleToGroupOnEnterpriseProject();

    private static HttpRequestDef<AssociateRoleToGroupOnEnterpriseProjectRequest, AssociateRoleToGroupOnEnterpriseProjectResponse> genForAssociateRoleToGroupOnEnterpriseProject() {
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
            f -> f.withMarshaller(AssociateRoleToGroupOnEnterpriseProjectRequest::getEnterpriseProjectId,
                AssociateRoleToGroupOnEnterpriseProjectRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AssociateRoleToGroupOnEnterpriseProjectRequest::getGroupId,
                AssociateRoleToGroupOnEnterpriseProjectRequest::setGroupId));
        builder.<String>withRequestField("role_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AssociateRoleToGroupOnEnterpriseProjectRequest::getRoleId,
                AssociateRoleToGroupOnEnterpriseProjectRequest::setRoleId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AssociateRoleToUserOnEnterpriseProjectRequest, AssociateRoleToUserOnEnterpriseProjectResponse> associateRoleToUserOnEnterpriseProject =
        genForAssociateRoleToUserOnEnterpriseProject();

    private static HttpRequestDef<AssociateRoleToUserOnEnterpriseProjectRequest, AssociateRoleToUserOnEnterpriseProjectResponse> genForAssociateRoleToUserOnEnterpriseProject() {
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
            f -> f.withMarshaller(AssociateRoleToUserOnEnterpriseProjectRequest::getEnterpriseProjectId,
                AssociateRoleToUserOnEnterpriseProjectRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("user_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AssociateRoleToUserOnEnterpriseProjectRequest::getUserId,
                AssociateRoleToUserOnEnterpriseProjectRequest::setUserId));
        builder.<String>withRequestField("role_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AssociateRoleToUserOnEnterpriseProjectRequest::getRoleId,
                AssociateRoleToUserOnEnterpriseProjectRequest::setRoleId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CheckAllProjectsPermissionForAgencyRequest, CheckAllProjectsPermissionForAgencyResponse> checkAllProjectsPermissionForAgency =
        genForCheckAllProjectsPermissionForAgency();

    private static HttpRequestDef<CheckAllProjectsPermissionForAgencyRequest, CheckAllProjectsPermissionForAgencyResponse> genForCheckAllProjectsPermissionForAgency() {
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
            f -> f.withMarshaller(CheckAllProjectsPermissionForAgencyRequest::getAgencyId,
                CheckAllProjectsPermissionForAgencyRequest::setAgencyId));
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CheckAllProjectsPermissionForAgencyRequest::getDomainId,
                CheckAllProjectsPermissionForAgencyRequest::setDomainId));
        builder.<String>withRequestField("role_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CheckAllProjectsPermissionForAgencyRequest::getRoleId,
                CheckAllProjectsPermissionForAgencyRequest::setRoleId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CheckDomainPermissionForAgencyRequest, CheckDomainPermissionForAgencyResponse> checkDomainPermissionForAgency =
        genForCheckDomainPermissionForAgency();

    private static HttpRequestDef<CheckDomainPermissionForAgencyRequest, CheckDomainPermissionForAgencyResponse> genForCheckDomainPermissionForAgency() {
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
            f -> f.withMarshaller(CheckDomainPermissionForAgencyRequest::getDomainId,
                CheckDomainPermissionForAgencyRequest::setDomainId));
        builder.<String>withRequestField("agency_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CheckDomainPermissionForAgencyRequest::getAgencyId,
                CheckDomainPermissionForAgencyRequest::setAgencyId));
        builder.<String>withRequestField("role_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CheckDomainPermissionForAgencyRequest::getRoleId,
                CheckDomainPermissionForAgencyRequest::setRoleId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CheckProjectPermissionForAgencyRequest, CheckProjectPermissionForAgencyResponse> checkProjectPermissionForAgency =
        genForCheckProjectPermissionForAgency();

    private static HttpRequestDef<CheckProjectPermissionForAgencyRequest, CheckProjectPermissionForAgencyResponse> genForCheckProjectPermissionForAgency() {
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
            f -> f.withMarshaller(CheckProjectPermissionForAgencyRequest::getProjectId,
                CheckProjectPermissionForAgencyRequest::setProjectId));
        builder.<String>withRequestField("agency_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CheckProjectPermissionForAgencyRequest::getAgencyId,
                CheckProjectPermissionForAgencyRequest::setAgencyId));
        builder.<String>withRequestField("role_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CheckProjectPermissionForAgencyRequest::getRoleId,
                CheckProjectPermissionForAgencyRequest::setRoleId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateAgencyRequest, CreateAgencyResponse> createAgency = genForCreateAgency();

    private static HttpRequestDef<CreateAgencyRequest, CreateAgencyResponse> genForCreateAgency() {
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
            f -> f.withMarshaller(CreateAgencyRequest::getBody, CreateAgencyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateAgencyCustomPolicyRequest, CreateAgencyCustomPolicyResponse> createAgencyCustomPolicy =
        genForCreateAgencyCustomPolicy();

    private static HttpRequestDef<CreateAgencyCustomPolicyRequest, CreateAgencyCustomPolicyResponse> genForCreateAgencyCustomPolicy() {
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
            f -> f.withMarshaller(CreateAgencyCustomPolicyRequest::getBody, CreateAgencyCustomPolicyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateBindingDeviceRequest, CreateBindingDeviceResponse> createBindingDevice =
        genForCreateBindingDevice();

    private static HttpRequestDef<CreateBindingDeviceRequest, CreateBindingDeviceResponse> genForCreateBindingDevice() {
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
            f -> f.withMarshaller(CreateBindingDeviceRequest::getBody, CreateBindingDeviceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateCloudServiceCustomPolicyRequest, CreateCloudServiceCustomPolicyResponse> createCloudServiceCustomPolicy =
        genForCreateCloudServiceCustomPolicy();

    private static HttpRequestDef<CreateCloudServiceCustomPolicyRequest, CreateCloudServiceCustomPolicyResponse> genForCreateCloudServiceCustomPolicy() {
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
            f -> f.withMarshaller(CreateCloudServiceCustomPolicyRequest::getBody,
                CreateCloudServiceCustomPolicyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateLoginTokenRequest, CreateLoginTokenResponse> createLoginToken =
        genForCreateLoginToken();

    private static HttpRequestDef<CreateLoginTokenRequest, CreateLoginTokenResponse> genForCreateLoginToken() {
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
            f -> f.withMarshaller(CreateLoginTokenRequest::getBody, CreateLoginTokenRequest::setBody));

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
        genForCreateMetadata();

    private static HttpRequestDef<CreateMetadataRequest, CreateMetadataResponse> genForCreateMetadata() {
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
            f -> f.withMarshaller(CreateMetadataRequest::getIdpId, CreateMetadataRequest::setIdpId));
        builder.<String>withRequestField("protocol_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateMetadataRequest::getProtocolId, CreateMetadataRequest::setProtocolId));
        builder.<CreateMetadataRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateMetadataRequestBody.class),
            f -> f.withMarshaller(CreateMetadataRequest::getBody, CreateMetadataRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateMfaDeviceRequest, CreateMfaDeviceResponse> createMfaDevice =
        genForCreateMfaDevice();

    private static HttpRequestDef<CreateMfaDeviceRequest, CreateMfaDeviceResponse> genForCreateMfaDevice() {
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
            f -> f.withMarshaller(CreateMfaDeviceRequest::getBody, CreateMfaDeviceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateOpenIdConnectConfigRequest, CreateOpenIdConnectConfigResponse> createOpenIdConnectConfig =
        genForCreateOpenIdConnectConfig();

    private static HttpRequestDef<CreateOpenIdConnectConfigRequest, CreateOpenIdConnectConfigResponse> genForCreateOpenIdConnectConfig() {
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
            f -> f.withMarshaller(CreateOpenIdConnectConfigRequest::getIdpId,
                CreateOpenIdConnectConfigRequest::setIdpId));
        builder.<CreateOpenIdConnectConfigRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateOpenIdConnectConfigRequestBody.class),
            f -> f.withMarshaller(CreateOpenIdConnectConfigRequest::getBody,
                CreateOpenIdConnectConfigRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateTokenWithIdTokenRequest, CreateTokenWithIdTokenResponse> createTokenWithIdToken =
        genForCreateTokenWithIdToken();

    private static HttpRequestDef<CreateTokenWithIdTokenRequest, CreateTokenWithIdTokenResponse> genForCreateTokenWithIdToken() {
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
            f -> f.withMarshaller(CreateTokenWithIdTokenRequest::getXIdpId, CreateTokenWithIdTokenRequest::setXIdpId));
        builder.<GetIdTokenRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(GetIdTokenRequestBody.class),
            f -> f.withMarshaller(CreateTokenWithIdTokenRequest::getBody, CreateTokenWithIdTokenRequest::setBody));

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
        genForCreateUnscopedTokenWithIdToken();

    private static HttpRequestDef<CreateUnscopedTokenWithIdTokenRequest, CreateUnscopedTokenWithIdTokenResponse> genForCreateUnscopedTokenWithIdToken() {
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
            f -> f.withMarshaller(CreateUnscopedTokenWithIdTokenRequest::getIdpId,
                CreateUnscopedTokenWithIdTokenRequest::setIdpId));
        builder.<String>withRequestField("protocol_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateUnscopedTokenWithIdTokenRequest::getProtocolId,
                CreateUnscopedTokenWithIdTokenRequest::setProtocolId));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateUnscopedTokenWithIdTokenRequest::getAuthorization,
                CreateUnscopedTokenWithIdTokenRequest::setAuthorization));

        // response

        builder.<String>withResponseField("X-Subject-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateUnscopedTokenWithIdTokenResponse::getXSubjectToken,
                CreateUnscopedTokenWithIdTokenResponse::setXSubjectToken));
        return builder.build();
    }

    public static final HttpRequestDef<DeleteAgencyRequest, DeleteAgencyResponse> deleteAgency = genForDeleteAgency();

    private static HttpRequestDef<DeleteAgencyRequest, DeleteAgencyResponse> genForDeleteAgency() {
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
            f -> f.withMarshaller(DeleteAgencyRequest::getAgencyId, DeleteAgencyRequest::setAgencyId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteBindingDeviceRequest, DeleteBindingDeviceResponse> deleteBindingDevice =
        genForDeleteBindingDevice();

    private static HttpRequestDef<DeleteBindingDeviceRequest, DeleteBindingDeviceResponse> genForDeleteBindingDevice() {
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
            f -> f.withMarshaller(DeleteBindingDeviceRequest::getBody, DeleteBindingDeviceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteCustomPolicyRequest, DeleteCustomPolicyResponse> deleteCustomPolicy =
        genForDeleteCustomPolicy();

    private static HttpRequestDef<DeleteCustomPolicyRequest, DeleteCustomPolicyResponse> genForDeleteCustomPolicy() {
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
            f -> f.withMarshaller(DeleteCustomPolicyRequest::getRoleId, DeleteCustomPolicyRequest::setRoleId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteDomainGroupInheritedRoleRequest, DeleteDomainGroupInheritedRoleResponse> deleteDomainGroupInheritedRole =
        genForDeleteDomainGroupInheritedRole();

    private static HttpRequestDef<DeleteDomainGroupInheritedRoleRequest, DeleteDomainGroupInheritedRoleResponse> genForDeleteDomainGroupInheritedRole() {
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
            f -> f.withMarshaller(DeleteDomainGroupInheritedRoleRequest::getDomainId,
                DeleteDomainGroupInheritedRoleRequest::setDomainId));
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDomainGroupInheritedRoleRequest::getGroupId,
                DeleteDomainGroupInheritedRoleRequest::setGroupId));
        builder.<String>withRequestField("role_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDomainGroupInheritedRoleRequest::getRoleId,
                DeleteDomainGroupInheritedRoleRequest::setRoleId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteMfaDeviceRequest, DeleteMfaDeviceResponse> deleteMfaDevice =
        genForDeleteMfaDevice();

    private static HttpRequestDef<DeleteMfaDeviceRequest, DeleteMfaDeviceResponse> genForDeleteMfaDevice() {
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
            f -> f.withMarshaller(DeleteMfaDeviceRequest::getUserId, DeleteMfaDeviceRequest::setUserId));
        builder.<String>withRequestField("serial_number",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteMfaDeviceRequest::getSerialNumber, DeleteMfaDeviceRequest::setSerialNumber));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<KeystoneAddUserToGroupRequest, KeystoneAddUserToGroupResponse> keystoneAddUserToGroup =
        genForKeystoneAddUserToGroup();

    private static HttpRequestDef<KeystoneAddUserToGroupRequest, KeystoneAddUserToGroupResponse> genForKeystoneAddUserToGroup() {
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
            f -> f.withMarshaller(KeystoneAddUserToGroupRequest::getGroupId,
                KeystoneAddUserToGroupRequest::setGroupId));
        builder.<String>withRequestField("user_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(KeystoneAddUserToGroupRequest::getUserId, KeystoneAddUserToGroupRequest::setUserId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<KeystoneAssociateGroupWithDomainPermissionRequest, KeystoneAssociateGroupWithDomainPermissionResponse> keystoneAssociateGroupWithDomainPermission =
        genForKeystoneAssociateGroupWithDomainPermission();

    private static HttpRequestDef<KeystoneAssociateGroupWithDomainPermissionRequest, KeystoneAssociateGroupWithDomainPermissionResponse> genForKeystoneAssociateGroupWithDomainPermission() {
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
            f -> f.withMarshaller(KeystoneAssociateGroupWithDomainPermissionRequest::getDomainId,
                KeystoneAssociateGroupWithDomainPermissionRequest::setDomainId));
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(KeystoneAssociateGroupWithDomainPermissionRequest::getGroupId,
                KeystoneAssociateGroupWithDomainPermissionRequest::setGroupId));
        builder.<String>withRequestField("role_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(KeystoneAssociateGroupWithDomainPermissionRequest::getRoleId,
                KeystoneAssociateGroupWithDomainPermissionRequest::setRoleId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<KeystoneAssociateGroupWithProjectPermissionRequest, KeystoneAssociateGroupWithProjectPermissionResponse> keystoneAssociateGroupWithProjectPermission =
        genForKeystoneAssociateGroupWithProjectPermission();

    private static HttpRequestDef<KeystoneAssociateGroupWithProjectPermissionRequest, KeystoneAssociateGroupWithProjectPermissionResponse> genForKeystoneAssociateGroupWithProjectPermission() {
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
            f -> f.withMarshaller(KeystoneAssociateGroupWithProjectPermissionRequest::getProjectId,
                KeystoneAssociateGroupWithProjectPermissionRequest::setProjectId));
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(KeystoneAssociateGroupWithProjectPermissionRequest::getGroupId,
                KeystoneAssociateGroupWithProjectPermissionRequest::setGroupId));
        builder.<String>withRequestField("role_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(KeystoneAssociateGroupWithProjectPermissionRequest::getRoleId,
                KeystoneAssociateGroupWithProjectPermissionRequest::setRoleId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<KeystoneCheckDomainPermissionForGroupRequest, KeystoneCheckDomainPermissionForGroupResponse> keystoneCheckDomainPermissionForGroup =
        genForKeystoneCheckDomainPermissionForGroup();

    private static HttpRequestDef<KeystoneCheckDomainPermissionForGroupRequest, KeystoneCheckDomainPermissionForGroupResponse> genForKeystoneCheckDomainPermissionForGroup() {
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
            f -> f.withMarshaller(KeystoneCheckDomainPermissionForGroupRequest::getDomainId,
                KeystoneCheckDomainPermissionForGroupRequest::setDomainId));
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(KeystoneCheckDomainPermissionForGroupRequest::getGroupId,
                KeystoneCheckDomainPermissionForGroupRequest::setGroupId));
        builder.<String>withRequestField("role_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(KeystoneCheckDomainPermissionForGroupRequest::getRoleId,
                KeystoneCheckDomainPermissionForGroupRequest::setRoleId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<KeystoneCheckProjectPermissionForGroupRequest, KeystoneCheckProjectPermissionForGroupResponse> keystoneCheckProjectPermissionForGroup =
        genForKeystoneCheckProjectPermissionForGroup();

    private static HttpRequestDef<KeystoneCheckProjectPermissionForGroupRequest, KeystoneCheckProjectPermissionForGroupResponse> genForKeystoneCheckProjectPermissionForGroup() {
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
            f -> f.withMarshaller(KeystoneCheckProjectPermissionForGroupRequest::getProjectId,
                KeystoneCheckProjectPermissionForGroupRequest::setProjectId));
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(KeystoneCheckProjectPermissionForGroupRequest::getGroupId,
                KeystoneCheckProjectPermissionForGroupRequest::setGroupId));
        builder.<String>withRequestField("role_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(KeystoneCheckProjectPermissionForGroupRequest::getRoleId,
                KeystoneCheckProjectPermissionForGroupRequest::setRoleId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<KeystoneCheckUserInGroupRequest, KeystoneCheckUserInGroupResponse> keystoneCheckUserInGroup =
        genForKeystoneCheckUserInGroup();

    private static HttpRequestDef<KeystoneCheckUserInGroupRequest, KeystoneCheckUserInGroupResponse> genForKeystoneCheckUserInGroup() {
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
            f -> f.withMarshaller(KeystoneCheckUserInGroupRequest::getGroupId,
                KeystoneCheckUserInGroupRequest::setGroupId));
        builder.<String>withRequestField("user_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(KeystoneCheckUserInGroupRequest::getUserId,
                KeystoneCheckUserInGroupRequest::setUserId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<KeystoneCheckroleForGroupRequest, KeystoneCheckroleForGroupResponse> keystoneCheckroleForGroup =
        genForKeystoneCheckroleForGroup();

    private static HttpRequestDef<KeystoneCheckroleForGroupRequest, KeystoneCheckroleForGroupResponse> genForKeystoneCheckroleForGroup() {
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
            f -> f.withMarshaller(KeystoneCheckroleForGroupRequest::getDomainId,
                KeystoneCheckroleForGroupRequest::setDomainId));
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(KeystoneCheckroleForGroupRequest::getGroupId,
                KeystoneCheckroleForGroupRequest::setGroupId));
        builder.<String>withRequestField("role_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(KeystoneCheckroleForGroupRequest::getRoleId,
                KeystoneCheckroleForGroupRequest::setRoleId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<KeystoneCreateGroupRequest, KeystoneCreateGroupResponse> keystoneCreateGroup =
        genForKeystoneCreateGroup();

    private static HttpRequestDef<KeystoneCreateGroupRequest, KeystoneCreateGroupResponse> genForKeystoneCreateGroup() {
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
            f -> f.withMarshaller(KeystoneCreateGroupRequest::getBody, KeystoneCreateGroupRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<KeystoneCreateIdentityProviderRequest, KeystoneCreateIdentityProviderResponse> keystoneCreateIdentityProvider =
        genForKeystoneCreateIdentityProvider();

    private static HttpRequestDef<KeystoneCreateIdentityProviderRequest, KeystoneCreateIdentityProviderResponse> genForKeystoneCreateIdentityProvider() {
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
            f -> f.withMarshaller(KeystoneCreateIdentityProviderRequest::getId,
                KeystoneCreateIdentityProviderRequest::setId));
        builder.<KeystoneCreateIdentityProviderRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(KeystoneCreateIdentityProviderRequestBody.class),
            f -> f.withMarshaller(KeystoneCreateIdentityProviderRequest::getBody,
                KeystoneCreateIdentityProviderRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<KeystoneCreateMappingRequest, KeystoneCreateMappingResponse> keystoneCreateMapping =
        genForKeystoneCreateMapping();

    private static HttpRequestDef<KeystoneCreateMappingRequest, KeystoneCreateMappingResponse> genForKeystoneCreateMapping() {
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
            f -> f.withMarshaller(KeystoneCreateMappingRequest::getId, KeystoneCreateMappingRequest::setId));
        builder.<KeystoneCreateMappingRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(KeystoneCreateMappingRequestBody.class),
            f -> f.withMarshaller(KeystoneCreateMappingRequest::getBody, KeystoneCreateMappingRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<KeystoneCreateProjectRequest, KeystoneCreateProjectResponse> keystoneCreateProject =
        genForKeystoneCreateProject();

    private static HttpRequestDef<KeystoneCreateProjectRequest, KeystoneCreateProjectResponse> genForKeystoneCreateProject() {
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
            f -> f.withMarshaller(KeystoneCreateProjectRequest::getBody, KeystoneCreateProjectRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<KeystoneCreateProtocolRequest, KeystoneCreateProtocolResponse> keystoneCreateProtocol =
        genForKeystoneCreateProtocol();

    private static HttpRequestDef<KeystoneCreateProtocolRequest, KeystoneCreateProtocolResponse> genForKeystoneCreateProtocol() {
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
            f -> f.withMarshaller(KeystoneCreateProtocolRequest::getIdpId, KeystoneCreateProtocolRequest::setIdpId));
        builder.<String>withRequestField("protocol_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(KeystoneCreateProtocolRequest::getProtocolId,
                KeystoneCreateProtocolRequest::setProtocolId));
        builder.<KeystoneCreateProtocolRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(KeystoneCreateProtocolRequestBody.class),
            f -> f.withMarshaller(KeystoneCreateProtocolRequest::getBody, KeystoneCreateProtocolRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<KeystoneCreateScopedTokenRequest, KeystoneCreateScopedTokenResponse> keystoneCreateScopedToken =
        genForKeystoneCreateScopedToken();

    private static HttpRequestDef<KeystoneCreateScopedTokenRequest, KeystoneCreateScopedTokenResponse> genForKeystoneCreateScopedToken() {
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
            f -> f.withMarshaller(KeystoneCreateScopedTokenRequest::getBody,
                KeystoneCreateScopedTokenRequest::setBody));

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
        genForKeystoneDeleteGroup();

    private static HttpRequestDef<KeystoneDeleteGroupRequest, KeystoneDeleteGroupResponse> genForKeystoneDeleteGroup() {
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
            f -> f.withMarshaller(KeystoneDeleteGroupRequest::getGroupId, KeystoneDeleteGroupRequest::setGroupId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<KeystoneDeleteIdentityProviderRequest, KeystoneDeleteIdentityProviderResponse> keystoneDeleteIdentityProvider =
        genForKeystoneDeleteIdentityProvider();

    private static HttpRequestDef<KeystoneDeleteIdentityProviderRequest, KeystoneDeleteIdentityProviderResponse> genForKeystoneDeleteIdentityProvider() {
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
            f -> f.withMarshaller(KeystoneDeleteIdentityProviderRequest::getId,
                KeystoneDeleteIdentityProviderRequest::setId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<KeystoneDeleteMappingRequest, KeystoneDeleteMappingResponse> keystoneDeleteMapping =
        genForKeystoneDeleteMapping();

    private static HttpRequestDef<KeystoneDeleteMappingRequest, KeystoneDeleteMappingResponse> genForKeystoneDeleteMapping() {
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
            f -> f.withMarshaller(KeystoneDeleteMappingRequest::getId, KeystoneDeleteMappingRequest::setId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<KeystoneDeleteProtocolRequest, KeystoneDeleteProtocolResponse> keystoneDeleteProtocol =
        genForKeystoneDeleteProtocol();

    private static HttpRequestDef<KeystoneDeleteProtocolRequest, KeystoneDeleteProtocolResponse> genForKeystoneDeleteProtocol() {
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
            f -> f.withMarshaller(KeystoneDeleteProtocolRequest::getIdpId, KeystoneDeleteProtocolRequest::setIdpId));
        builder.<String>withRequestField("protocol_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(KeystoneDeleteProtocolRequest::getProtocolId,
                KeystoneDeleteProtocolRequest::setProtocolId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<KeystoneListAllProjectPermissionsForGroupRequest, KeystoneListAllProjectPermissionsForGroupResponse> keystoneListAllProjectPermissionsForGroup =
        genForKeystoneListAllProjectPermissionsForGroup();

    private static HttpRequestDef<KeystoneListAllProjectPermissionsForGroupRequest, KeystoneListAllProjectPermissionsForGroupResponse> genForKeystoneListAllProjectPermissionsForGroup() {
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
            f -> f.withMarshaller(KeystoneListAllProjectPermissionsForGroupRequest::getDomainId,
                KeystoneListAllProjectPermissionsForGroupRequest::setDomainId));
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(KeystoneListAllProjectPermissionsForGroupRequest::getGroupId,
                KeystoneListAllProjectPermissionsForGroupRequest::setGroupId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<KeystoneListAuthDomainsRequest, KeystoneListAuthDomainsResponse> keystoneListAuthDomains =
        genForKeystoneListAuthDomains();

    private static HttpRequestDef<KeystoneListAuthDomainsRequest, KeystoneListAuthDomainsResponse> genForKeystoneListAuthDomains() {
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
        genForKeystoneListAuthProjects();

    private static HttpRequestDef<KeystoneListAuthProjectsRequest, KeystoneListAuthProjectsResponse> genForKeystoneListAuthProjects() {
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
        genForKeystoneListDomainPermissionsForGroup();

    private static HttpRequestDef<KeystoneListDomainPermissionsForGroupRequest, KeystoneListDomainPermissionsForGroupResponse> genForKeystoneListDomainPermissionsForGroup() {
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
            f -> f.withMarshaller(KeystoneListDomainPermissionsForGroupRequest::getDomainId,
                KeystoneListDomainPermissionsForGroupRequest::setDomainId));
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(KeystoneListDomainPermissionsForGroupRequest::getGroupId,
                KeystoneListDomainPermissionsForGroupRequest::setGroupId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<KeystoneListEndpointsRequest, KeystoneListEndpointsResponse> keystoneListEndpoints =
        genForKeystoneListEndpoints();

    private static HttpRequestDef<KeystoneListEndpointsRequest, KeystoneListEndpointsResponse> genForKeystoneListEndpoints() {
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
            f -> f.withMarshaller(KeystoneListEndpointsRequest::getInterface,
                KeystoneListEndpointsRequest::setInterface));
        builder.<String>withRequestField("service_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(KeystoneListEndpointsRequest::getServiceId,
                KeystoneListEndpointsRequest::setServiceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<KeystoneListFederationDomainsRequest, KeystoneListFederationDomainsResponse> keystoneListFederationDomains =
        genForKeystoneListFederationDomains();

    private static HttpRequestDef<KeystoneListFederationDomainsRequest, KeystoneListFederationDomainsResponse> genForKeystoneListFederationDomains() {
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

    public static final HttpRequestDef<KeystoneListFederationProjectsRequest, KeystoneListFederationProjectsResponse> keystoneListFederationProjects =
        genForKeystoneListFederationProjects();

    private static HttpRequestDef<KeystoneListFederationProjectsRequest, KeystoneListFederationProjectsResponse> genForKeystoneListFederationProjects() {
        // basic
        HttpRequestDef.Builder<KeystoneListFederationProjectsRequest, KeystoneListFederationProjectsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    KeystoneListFederationProjectsRequest.class,
                    KeystoneListFederationProjectsResponse.class)
                .withName("KeystoneListFederationProjects")
                .withUri("/v3/OS-FEDERATION/projects")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<KeystoneListGroupsRequest, KeystoneListGroupsResponse> keystoneListGroups =
        genForKeystoneListGroups();

    private static HttpRequestDef<KeystoneListGroupsRequest, KeystoneListGroupsResponse> genForKeystoneListGroups() {
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
            f -> f.withMarshaller(KeystoneListGroupsRequest::getDomainId, KeystoneListGroupsRequest::setDomainId));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(KeystoneListGroupsRequest::getName, KeystoneListGroupsRequest::setName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<KeystoneListIdentityProvidersRequest, KeystoneListIdentityProvidersResponse> keystoneListIdentityProviders =
        genForKeystoneListIdentityProviders();

    private static HttpRequestDef<KeystoneListIdentityProvidersRequest, KeystoneListIdentityProvidersResponse> genForKeystoneListIdentityProviders() {
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
        genForKeystoneListMappings();

    private static HttpRequestDef<KeystoneListMappingsRequest, KeystoneListMappingsResponse> genForKeystoneListMappings() {
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
        genForKeystoneListPermissions();

    private static HttpRequestDef<KeystoneListPermissionsRequest, KeystoneListPermissionsResponse> genForKeystoneListPermissions() {
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
            f -> f.withMarshaller(KeystoneListPermissionsRequest::getName, KeystoneListPermissionsRequest::setName));
        builder.<String>withRequestField("domain_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(KeystoneListPermissionsRequest::getDomainId,
                KeystoneListPermissionsRequest::setDomainId));
        builder.<Integer>withRequestField("page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(KeystoneListPermissionsRequest::getPage, KeystoneListPermissionsRequest::setPage));
        builder.<Integer>withRequestField("per_page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(KeystoneListPermissionsRequest::getPerPage,
                KeystoneListPermissionsRequest::setPerPage));
        builder.<String>withRequestField("permission_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(KeystoneListPermissionsRequest::getPermissionType,
                KeystoneListPermissionsRequest::setPermissionType));
        builder.<String>withRequestField("display_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(KeystoneListPermissionsRequest::getDisplayName,
                KeystoneListPermissionsRequest::setDisplayName));
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(KeystoneListPermissionsRequest::getType, KeystoneListPermissionsRequest::setType));
        builder.<String>withRequestField("catalog",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(KeystoneListPermissionsRequest::getCatalog,
                KeystoneListPermissionsRequest::setCatalog));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<KeystoneListProjectPermissionsForGroupRequest, KeystoneListProjectPermissionsForGroupResponse> keystoneListProjectPermissionsForGroup =
        genForKeystoneListProjectPermissionsForGroup();

    private static HttpRequestDef<KeystoneListProjectPermissionsForGroupRequest, KeystoneListProjectPermissionsForGroupResponse> genForKeystoneListProjectPermissionsForGroup() {
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
            f -> f.withMarshaller(KeystoneListProjectPermissionsForGroupRequest::getProjectId,
                KeystoneListProjectPermissionsForGroupRequest::setProjectId));
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(KeystoneListProjectPermissionsForGroupRequest::getGroupId,
                KeystoneListProjectPermissionsForGroupRequest::setGroupId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<KeystoneListProjectsRequest, KeystoneListProjectsResponse> keystoneListProjects =
        genForKeystoneListProjects();

    private static HttpRequestDef<KeystoneListProjectsRequest, KeystoneListProjectsResponse> genForKeystoneListProjects() {
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
            f -> f.withMarshaller(KeystoneListProjectsRequest::getDomainId, KeystoneListProjectsRequest::setDomainId));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(KeystoneListProjectsRequest::getName, KeystoneListProjectsRequest::setName));
        builder.<String>withRequestField("parent_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(KeystoneListProjectsRequest::getParentId, KeystoneListProjectsRequest::setParentId));
        builder.<Boolean>withRequestField("enabled",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(KeystoneListProjectsRequest::getEnabled, KeystoneListProjectsRequest::setEnabled));
        builder.<Boolean>withRequestField("is_domain",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(KeystoneListProjectsRequest::getIsDomain, KeystoneListProjectsRequest::setIsDomain));
        builder.<Integer>withRequestField("page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(KeystoneListProjectsRequest::getPage, KeystoneListProjectsRequest::setPage));
        builder.<Integer>withRequestField("per_page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(KeystoneListProjectsRequest::getPerPage, KeystoneListProjectsRequest::setPerPage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<KeystoneListProjectsForUserRequest, KeystoneListProjectsForUserResponse> keystoneListProjectsForUser =
        genForKeystoneListProjectsForUser();

    private static HttpRequestDef<KeystoneListProjectsForUserRequest, KeystoneListProjectsForUserResponse> genForKeystoneListProjectsForUser() {
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
            f -> f.withMarshaller(KeystoneListProjectsForUserRequest::getUserId,
                KeystoneListProjectsForUserRequest::setUserId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<KeystoneListProtocolsRequest, KeystoneListProtocolsResponse> keystoneListProtocols =
        genForKeystoneListProtocols();

    private static HttpRequestDef<KeystoneListProtocolsRequest, KeystoneListProtocolsResponse> genForKeystoneListProtocols() {
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
            f -> f.withMarshaller(KeystoneListProtocolsRequest::getIdpId, KeystoneListProtocolsRequest::setIdpId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<KeystoneListRegionsRequest, KeystoneListRegionsResponse> keystoneListRegions =
        genForKeystoneListRegions();

    private static HttpRequestDef<KeystoneListRegionsRequest, KeystoneListRegionsResponse> genForKeystoneListRegions() {
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
        genForKeystoneListServices();

    private static HttpRequestDef<KeystoneListServicesRequest, KeystoneListServicesResponse> genForKeystoneListServices() {
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
            f -> f.withMarshaller(KeystoneListServicesRequest::getType, KeystoneListServicesRequest::setType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<KeystoneListVersionsRequest, KeystoneListVersionsResponse> keystoneListVersions =
        genForKeystoneListVersions();

    private static HttpRequestDef<KeystoneListVersionsRequest, KeystoneListVersionsResponse> genForKeystoneListVersions() {
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
        genForKeystoneRemoveDomainPermissionFromGroup();

    private static HttpRequestDef<KeystoneRemoveDomainPermissionFromGroupRequest, KeystoneRemoveDomainPermissionFromGroupResponse> genForKeystoneRemoveDomainPermissionFromGroup() {
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
            f -> f.withMarshaller(KeystoneRemoveDomainPermissionFromGroupRequest::getDomainId,
                KeystoneRemoveDomainPermissionFromGroupRequest::setDomainId));
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(KeystoneRemoveDomainPermissionFromGroupRequest::getGroupId,
                KeystoneRemoveDomainPermissionFromGroupRequest::setGroupId));
        builder.<String>withRequestField("role_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(KeystoneRemoveDomainPermissionFromGroupRequest::getRoleId,
                KeystoneRemoveDomainPermissionFromGroupRequest::setRoleId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<KeystoneRemoveProjectPermissionFromGroupRequest, KeystoneRemoveProjectPermissionFromGroupResponse> keystoneRemoveProjectPermissionFromGroup =
        genForKeystoneRemoveProjectPermissionFromGroup();

    private static HttpRequestDef<KeystoneRemoveProjectPermissionFromGroupRequest, KeystoneRemoveProjectPermissionFromGroupResponse> genForKeystoneRemoveProjectPermissionFromGroup() {
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
            f -> f.withMarshaller(KeystoneRemoveProjectPermissionFromGroupRequest::getProjectId,
                KeystoneRemoveProjectPermissionFromGroupRequest::setProjectId));
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(KeystoneRemoveProjectPermissionFromGroupRequest::getGroupId,
                KeystoneRemoveProjectPermissionFromGroupRequest::setGroupId));
        builder.<String>withRequestField("role_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(KeystoneRemoveProjectPermissionFromGroupRequest::getRoleId,
                KeystoneRemoveProjectPermissionFromGroupRequest::setRoleId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<KeystoneRemoveUserFromGroupRequest, KeystoneRemoveUserFromGroupResponse> keystoneRemoveUserFromGroup =
        genForKeystoneRemoveUserFromGroup();

    private static HttpRequestDef<KeystoneRemoveUserFromGroupRequest, KeystoneRemoveUserFromGroupResponse> genForKeystoneRemoveUserFromGroup() {
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
            f -> f.withMarshaller(KeystoneRemoveUserFromGroupRequest::getGroupId,
                KeystoneRemoveUserFromGroupRequest::setGroupId));
        builder.<String>withRequestField("user_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(KeystoneRemoveUserFromGroupRequest::getUserId,
                KeystoneRemoveUserFromGroupRequest::setUserId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<KeystoneShowCatalogRequest, KeystoneShowCatalogResponse> keystoneShowCatalog =
        genForKeystoneShowCatalog();

    private static HttpRequestDef<KeystoneShowCatalogRequest, KeystoneShowCatalogResponse> genForKeystoneShowCatalog() {
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
        genForKeystoneShowEndpoint();

    private static HttpRequestDef<KeystoneShowEndpointRequest, KeystoneShowEndpointResponse> genForKeystoneShowEndpoint() {
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
            f -> f.withMarshaller(KeystoneShowEndpointRequest::getEndpointId,
                KeystoneShowEndpointRequest::setEndpointId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<KeystoneShowGroupRequest, KeystoneShowGroupResponse> keystoneShowGroup =
        genForKeystoneShowGroup();

    private static HttpRequestDef<KeystoneShowGroupRequest, KeystoneShowGroupResponse> genForKeystoneShowGroup() {
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
            f -> f.withMarshaller(KeystoneShowGroupRequest::getGroupId, KeystoneShowGroupRequest::setGroupId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<KeystoneShowIdentityProviderRequest, KeystoneShowIdentityProviderResponse> keystoneShowIdentityProvider =
        genForKeystoneShowIdentityProvider();

    private static HttpRequestDef<KeystoneShowIdentityProviderRequest, KeystoneShowIdentityProviderResponse> genForKeystoneShowIdentityProvider() {
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
            f -> f.withMarshaller(KeystoneShowIdentityProviderRequest::getId,
                KeystoneShowIdentityProviderRequest::setId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<KeystoneShowMappingRequest, KeystoneShowMappingResponse> keystoneShowMapping =
        genForKeystoneShowMapping();

    private static HttpRequestDef<KeystoneShowMappingRequest, KeystoneShowMappingResponse> genForKeystoneShowMapping() {
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
            f -> f.withMarshaller(KeystoneShowMappingRequest::getId, KeystoneShowMappingRequest::setId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<KeystoneShowPermissionRequest, KeystoneShowPermissionResponse> keystoneShowPermission =
        genForKeystoneShowPermission();

    private static HttpRequestDef<KeystoneShowPermissionRequest, KeystoneShowPermissionResponse> genForKeystoneShowPermission() {
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
            f -> f.withMarshaller(KeystoneShowPermissionRequest::getRoleId, KeystoneShowPermissionRequest::setRoleId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<KeystoneShowProjectRequest, KeystoneShowProjectResponse> keystoneShowProject =
        genForKeystoneShowProject();

    private static HttpRequestDef<KeystoneShowProjectRequest, KeystoneShowProjectResponse> genForKeystoneShowProject() {
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
            f -> f.withMarshaller(KeystoneShowProjectRequest::getProjectId, KeystoneShowProjectRequest::setProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<KeystoneShowProtocolRequest, KeystoneShowProtocolResponse> keystoneShowProtocol =
        genForKeystoneShowProtocol();

    private static HttpRequestDef<KeystoneShowProtocolRequest, KeystoneShowProtocolResponse> genForKeystoneShowProtocol() {
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
            f -> f.withMarshaller(KeystoneShowProtocolRequest::getIdpId, KeystoneShowProtocolRequest::setIdpId));
        builder.<String>withRequestField("protocol_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(KeystoneShowProtocolRequest::getProtocolId,
                KeystoneShowProtocolRequest::setProtocolId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<KeystoneShowRegionRequest, KeystoneShowRegionResponse> keystoneShowRegion =
        genForKeystoneShowRegion();

    private static HttpRequestDef<KeystoneShowRegionRequest, KeystoneShowRegionResponse> genForKeystoneShowRegion() {
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
            f -> f.withMarshaller(KeystoneShowRegionRequest::getRegionId, KeystoneShowRegionRequest::setRegionId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<KeystoneShowSecurityComplianceRequest, KeystoneShowSecurityComplianceResponse> keystoneShowSecurityCompliance =
        genForKeystoneShowSecurityCompliance();

    private static HttpRequestDef<KeystoneShowSecurityComplianceRequest, KeystoneShowSecurityComplianceResponse> genForKeystoneShowSecurityCompliance() {
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
            f -> f.withMarshaller(KeystoneShowSecurityComplianceRequest::getDomainId,
                KeystoneShowSecurityComplianceRequest::setDomainId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<KeystoneShowSecurityComplianceByOptionRequest, KeystoneShowSecurityComplianceByOptionResponse> keystoneShowSecurityComplianceByOption =
        genForKeystoneShowSecurityComplianceByOption();

    private static HttpRequestDef<KeystoneShowSecurityComplianceByOptionRequest, KeystoneShowSecurityComplianceByOptionResponse> genForKeystoneShowSecurityComplianceByOption() {
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
            f -> f.withMarshaller(KeystoneShowSecurityComplianceByOptionRequest::getDomainId,
                KeystoneShowSecurityComplianceByOptionRequest::setDomainId));
        builder.<KeystoneShowSecurityComplianceByOptionRequest.OptionEnum>withRequestField("option",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(KeystoneShowSecurityComplianceByOptionRequest.OptionEnum.class),
            f -> f.withMarshaller(KeystoneShowSecurityComplianceByOptionRequest::getOption,
                KeystoneShowSecurityComplianceByOptionRequest::setOption));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<KeystoneShowServiceRequest, KeystoneShowServiceResponse> keystoneShowService =
        genForKeystoneShowService();

    private static HttpRequestDef<KeystoneShowServiceRequest, KeystoneShowServiceResponse> genForKeystoneShowService() {
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
            f -> f.withMarshaller(KeystoneShowServiceRequest::getServiceId, KeystoneShowServiceRequest::setServiceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<KeystoneShowVersionRequest, KeystoneShowVersionResponse> keystoneShowVersion =
        genForKeystoneShowVersion();

    private static HttpRequestDef<KeystoneShowVersionRequest, KeystoneShowVersionResponse> genForKeystoneShowVersion() {
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
        genForKeystoneUpdateGroup();

    private static HttpRequestDef<KeystoneUpdateGroupRequest, KeystoneUpdateGroupResponse> genForKeystoneUpdateGroup() {
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
            f -> f.withMarshaller(KeystoneUpdateGroupRequest::getGroupId, KeystoneUpdateGroupRequest::setGroupId));
        builder.<KeystoneUpdateGroupRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(KeystoneUpdateGroupRequestBody.class),
            f -> f.withMarshaller(KeystoneUpdateGroupRequest::getBody, KeystoneUpdateGroupRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<KeystoneUpdateIdentityProviderRequest, KeystoneUpdateIdentityProviderResponse> keystoneUpdateIdentityProvider =
        genForKeystoneUpdateIdentityProvider();

    private static HttpRequestDef<KeystoneUpdateIdentityProviderRequest, KeystoneUpdateIdentityProviderResponse> genForKeystoneUpdateIdentityProvider() {
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
            f -> f.withMarshaller(KeystoneUpdateIdentityProviderRequest::getId,
                KeystoneUpdateIdentityProviderRequest::setId));
        builder.<KeystoneUpdateIdentityProviderRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(KeystoneUpdateIdentityProviderRequestBody.class),
            f -> f.withMarshaller(KeystoneUpdateIdentityProviderRequest::getBody,
                KeystoneUpdateIdentityProviderRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<KeystoneUpdateMappingRequest, KeystoneUpdateMappingResponse> keystoneUpdateMapping =
        genForKeystoneUpdateMapping();

    private static HttpRequestDef<KeystoneUpdateMappingRequest, KeystoneUpdateMappingResponse> genForKeystoneUpdateMapping() {
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
            f -> f.withMarshaller(KeystoneUpdateMappingRequest::getId, KeystoneUpdateMappingRequest::setId));
        builder.<KeystoneUpdateMappingRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(KeystoneUpdateMappingRequestBody.class),
            f -> f.withMarshaller(KeystoneUpdateMappingRequest::getBody, KeystoneUpdateMappingRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<KeystoneUpdateProjectRequest, KeystoneUpdateProjectResponse> keystoneUpdateProject =
        genForKeystoneUpdateProject();

    private static HttpRequestDef<KeystoneUpdateProjectRequest, KeystoneUpdateProjectResponse> genForKeystoneUpdateProject() {
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
            f -> f.withMarshaller(KeystoneUpdateProjectRequest::getProjectId,
                KeystoneUpdateProjectRequest::setProjectId));
        builder.<KeystoneUpdateProjectRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(KeystoneUpdateProjectRequestBody.class),
            f -> f.withMarshaller(KeystoneUpdateProjectRequest::getBody, KeystoneUpdateProjectRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<KeystoneUpdateProtocolRequest, KeystoneUpdateProtocolResponse> keystoneUpdateProtocol =
        genForKeystoneUpdateProtocol();

    private static HttpRequestDef<KeystoneUpdateProtocolRequest, KeystoneUpdateProtocolResponse> genForKeystoneUpdateProtocol() {
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
            f -> f.withMarshaller(KeystoneUpdateProtocolRequest::getIdpId, KeystoneUpdateProtocolRequest::setIdpId));
        builder.<String>withRequestField("protocol_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(KeystoneUpdateProtocolRequest::getProtocolId,
                KeystoneUpdateProtocolRequest::setProtocolId));
        builder.<KeystoneUpdateProtocolRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(KeystoneUpdateProtocolRequestBody.class),
            f -> f.withMarshaller(KeystoneUpdateProtocolRequest::getBody, KeystoneUpdateProtocolRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAgenciesRequest, ListAgenciesResponse> listAgencies = genForListAgencies();

    private static HttpRequestDef<ListAgenciesRequest, ListAgenciesResponse> genForListAgencies() {
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
            f -> f.withMarshaller(ListAgenciesRequest::getDomainId, ListAgenciesRequest::setDomainId));
        builder.<String>withRequestField("trust_domain_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAgenciesRequest::getTrustDomainId, ListAgenciesRequest::setTrustDomainId));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAgenciesRequest::getName, ListAgenciesRequest::setName));
        builder.<Integer>withRequestField("page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAgenciesRequest::getPage, ListAgenciesRequest::setPage));
        builder.<Integer>withRequestField("per_page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAgenciesRequest::getPerPage, ListAgenciesRequest::setPerPage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAllProjectsPermissionsForAgencyRequest, ListAllProjectsPermissionsForAgencyResponse> listAllProjectsPermissionsForAgency =
        genForListAllProjectsPermissionsForAgency();

    private static HttpRequestDef<ListAllProjectsPermissionsForAgencyRequest, ListAllProjectsPermissionsForAgencyResponse> genForListAllProjectsPermissionsForAgency() {
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
            f -> f.withMarshaller(ListAllProjectsPermissionsForAgencyRequest::getAgencyId,
                ListAllProjectsPermissionsForAgencyRequest::setAgencyId));
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAllProjectsPermissionsForAgencyRequest::getDomainId,
                ListAllProjectsPermissionsForAgencyRequest::setDomainId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCustomPoliciesRequest, ListCustomPoliciesResponse> listCustomPolicies =
        genForListCustomPolicies();

    private static HttpRequestDef<ListCustomPoliciesRequest, ListCustomPoliciesResponse> genForListCustomPolicies() {
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
            f -> f.withMarshaller(ListCustomPoliciesRequest::getPage, ListCustomPoliciesRequest::setPage));
        builder.<Integer>withRequestField("per_page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCustomPoliciesRequest::getPerPage, ListCustomPoliciesRequest::setPerPage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDomainPermissionsForAgencyRequest, ListDomainPermissionsForAgencyResponse> listDomainPermissionsForAgency =
        genForListDomainPermissionsForAgency();

    private static HttpRequestDef<ListDomainPermissionsForAgencyRequest, ListDomainPermissionsForAgencyResponse> genForListDomainPermissionsForAgency() {
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
            f -> f.withMarshaller(ListDomainPermissionsForAgencyRequest::getDomainId,
                ListDomainPermissionsForAgencyRequest::setDomainId));
        builder.<String>withRequestField("agency_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDomainPermissionsForAgencyRequest::getAgencyId,
                ListDomainPermissionsForAgencyRequest::setAgencyId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListEnterpriseProjectsForGroupRequest, ListEnterpriseProjectsForGroupResponse> listEnterpriseProjectsForGroup =
        genForListEnterpriseProjectsForGroup();

    private static HttpRequestDef<ListEnterpriseProjectsForGroupRequest, ListEnterpriseProjectsForGroupResponse> genForListEnterpriseProjectsForGroup() {
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
            f -> f.withMarshaller(ListEnterpriseProjectsForGroupRequest::getGroupId,
                ListEnterpriseProjectsForGroupRequest::setGroupId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListEnterpriseProjectsForUserRequest, ListEnterpriseProjectsForUserResponse> listEnterpriseProjectsForUser =
        genForListEnterpriseProjectsForUser();

    private static HttpRequestDef<ListEnterpriseProjectsForUserRequest, ListEnterpriseProjectsForUserResponse> genForListEnterpriseProjectsForUser() {
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
            f -> f.withMarshaller(ListEnterpriseProjectsForUserRequest::getUserId,
                ListEnterpriseProjectsForUserRequest::setUserId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListGroupsForEnterpriseProjectRequest, ListGroupsForEnterpriseProjectResponse> listGroupsForEnterpriseProject =
        genForListGroupsForEnterpriseProject();

    private static HttpRequestDef<ListGroupsForEnterpriseProjectRequest, ListGroupsForEnterpriseProjectResponse> genForListGroupsForEnterpriseProject() {
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
            f -> f.withMarshaller(ListGroupsForEnterpriseProjectRequest::getEnterpriseProjectId,
                ListGroupsForEnterpriseProjectRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListProjectPermissionsForAgencyRequest, ListProjectPermissionsForAgencyResponse> listProjectPermissionsForAgency =
        genForListProjectPermissionsForAgency();

    private static HttpRequestDef<ListProjectPermissionsForAgencyRequest, ListProjectPermissionsForAgencyResponse> genForListProjectPermissionsForAgency() {
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
            f -> f.withMarshaller(ListProjectPermissionsForAgencyRequest::getProjectId,
                ListProjectPermissionsForAgencyRequest::setProjectId));
        builder.<String>withRequestField("agency_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProjectPermissionsForAgencyRequest::getAgencyId,
                ListProjectPermissionsForAgencyRequest::setAgencyId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListRolesForGroupOnEnterpriseProjectRequest, ListRolesForGroupOnEnterpriseProjectResponse> listRolesForGroupOnEnterpriseProject =
        genForListRolesForGroupOnEnterpriseProject();

    private static HttpRequestDef<ListRolesForGroupOnEnterpriseProjectRequest, ListRolesForGroupOnEnterpriseProjectResponse> genForListRolesForGroupOnEnterpriseProject() {
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
            f -> f.withMarshaller(ListRolesForGroupOnEnterpriseProjectRequest::getEnterpriseProjectId,
                ListRolesForGroupOnEnterpriseProjectRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRolesForGroupOnEnterpriseProjectRequest::getGroupId,
                ListRolesForGroupOnEnterpriseProjectRequest::setGroupId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListRolesForUserOnEnterpriseProjectRequest, ListRolesForUserOnEnterpriseProjectResponse> listRolesForUserOnEnterpriseProject =
        genForListRolesForUserOnEnterpriseProject();

    private static HttpRequestDef<ListRolesForUserOnEnterpriseProjectRequest, ListRolesForUserOnEnterpriseProjectResponse> genForListRolesForUserOnEnterpriseProject() {
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
            f -> f.withMarshaller(ListRolesForUserOnEnterpriseProjectRequest::getEnterpriseProjectId,
                ListRolesForUserOnEnterpriseProjectRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("user_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRolesForUserOnEnterpriseProjectRequest::getUserId,
                ListRolesForUserOnEnterpriseProjectRequest::setUserId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListUsersForEnterpriseProjectRequest, ListUsersForEnterpriseProjectResponse> listUsersForEnterpriseProject =
        genForListUsersForEnterpriseProject();

    private static HttpRequestDef<ListUsersForEnterpriseProjectRequest, ListUsersForEnterpriseProjectResponse> genForListUsersForEnterpriseProject() {
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
            f -> f.withMarshaller(ListUsersForEnterpriseProjectRequest::getEnterpriseProjectId,
                ListUsersForEnterpriseProjectRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RemoveAllProjectsPermissionFromAgencyRequest, RemoveAllProjectsPermissionFromAgencyResponse> removeAllProjectsPermissionFromAgency =
        genForRemoveAllProjectsPermissionFromAgency();

    private static HttpRequestDef<RemoveAllProjectsPermissionFromAgencyRequest, RemoveAllProjectsPermissionFromAgencyResponse> genForRemoveAllProjectsPermissionFromAgency() {
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
            f -> f.withMarshaller(RemoveAllProjectsPermissionFromAgencyRequest::getAgencyId,
                RemoveAllProjectsPermissionFromAgencyRequest::setAgencyId));
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RemoveAllProjectsPermissionFromAgencyRequest::getDomainId,
                RemoveAllProjectsPermissionFromAgencyRequest::setDomainId));
        builder.<String>withRequestField("role_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RemoveAllProjectsPermissionFromAgencyRequest::getRoleId,
                RemoveAllProjectsPermissionFromAgencyRequest::setRoleId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RemoveDomainPermissionFromAgencyRequest, RemoveDomainPermissionFromAgencyResponse> removeDomainPermissionFromAgency =
        genForRemoveDomainPermissionFromAgency();

    private static HttpRequestDef<RemoveDomainPermissionFromAgencyRequest, RemoveDomainPermissionFromAgencyResponse> genForRemoveDomainPermissionFromAgency() {
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
            f -> f.withMarshaller(RemoveDomainPermissionFromAgencyRequest::getDomainId,
                RemoveDomainPermissionFromAgencyRequest::setDomainId));
        builder.<String>withRequestField("agency_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RemoveDomainPermissionFromAgencyRequest::getAgencyId,
                RemoveDomainPermissionFromAgencyRequest::setAgencyId));
        builder.<String>withRequestField("role_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RemoveDomainPermissionFromAgencyRequest::getRoleId,
                RemoveDomainPermissionFromAgencyRequest::setRoleId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RemoveProjectPermissionFromAgencyRequest, RemoveProjectPermissionFromAgencyResponse> removeProjectPermissionFromAgency =
        genForRemoveProjectPermissionFromAgency();

    private static HttpRequestDef<RemoveProjectPermissionFromAgencyRequest, RemoveProjectPermissionFromAgencyResponse> genForRemoveProjectPermissionFromAgency() {
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
            f -> f.withMarshaller(RemoveProjectPermissionFromAgencyRequest::getProjectId,
                RemoveProjectPermissionFromAgencyRequest::setProjectId));
        builder.<String>withRequestField("agency_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RemoveProjectPermissionFromAgencyRequest::getAgencyId,
                RemoveProjectPermissionFromAgencyRequest::setAgencyId));
        builder.<String>withRequestField("role_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RemoveProjectPermissionFromAgencyRequest::getRoleId,
                RemoveProjectPermissionFromAgencyRequest::setRoleId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RevokeRoleFromAgencyOnEnterpriseProjectRequest, RevokeRoleFromAgencyOnEnterpriseProjectResponse> revokeRoleFromAgencyOnEnterpriseProject =
        genForRevokeRoleFromAgencyOnEnterpriseProject();

    private static HttpRequestDef<RevokeRoleFromAgencyOnEnterpriseProjectRequest, RevokeRoleFromAgencyOnEnterpriseProjectResponse> genForRevokeRoleFromAgencyOnEnterpriseProject() {
        // basic
        HttpRequestDef.Builder<RevokeRoleFromAgencyOnEnterpriseProjectRequest, RevokeRoleFromAgencyOnEnterpriseProjectResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    RevokeRoleFromAgencyOnEnterpriseProjectRequest.class,
                    RevokeRoleFromAgencyOnEnterpriseProjectResponse.class)
                .withName("RevokeRoleFromAgencyOnEnterpriseProject")
                .withUri("/v3.0/OS-PERMISSION/subjects/agency/scopes/enterprise-project/role-assignments")
                .withContentType("application/json");

        // requests
        builder.<CreateOrDelAgencyEpPolicyAssignmentReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateOrDelAgencyEpPolicyAssignmentReqBody.class),
            f -> f.withMarshaller(RevokeRoleFromAgencyOnEnterpriseProjectRequest::getBody,
                RevokeRoleFromAgencyOnEnterpriseProjectRequest::setBody));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(RevokeRoleFromAgencyOnEnterpriseProjectResponse::getBody,
                RevokeRoleFromAgencyOnEnterpriseProjectResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<RevokeRoleFromGroupOnEnterpriseProjectRequest, RevokeRoleFromGroupOnEnterpriseProjectResponse> revokeRoleFromGroupOnEnterpriseProject =
        genForRevokeRoleFromGroupOnEnterpriseProject();

    private static HttpRequestDef<RevokeRoleFromGroupOnEnterpriseProjectRequest, RevokeRoleFromGroupOnEnterpriseProjectResponse> genForRevokeRoleFromGroupOnEnterpriseProject() {
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
            f -> f.withMarshaller(RevokeRoleFromGroupOnEnterpriseProjectRequest::getEnterpriseProjectId,
                RevokeRoleFromGroupOnEnterpriseProjectRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RevokeRoleFromGroupOnEnterpriseProjectRequest::getGroupId,
                RevokeRoleFromGroupOnEnterpriseProjectRequest::setGroupId));
        builder.<String>withRequestField("role_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RevokeRoleFromGroupOnEnterpriseProjectRequest::getRoleId,
                RevokeRoleFromGroupOnEnterpriseProjectRequest::setRoleId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RevokeRoleFromUserOnEnterpriseProjectRequest, RevokeRoleFromUserOnEnterpriseProjectResponse> revokeRoleFromUserOnEnterpriseProject =
        genForRevokeRoleFromUserOnEnterpriseProject();

    private static HttpRequestDef<RevokeRoleFromUserOnEnterpriseProjectRequest, RevokeRoleFromUserOnEnterpriseProjectResponse> genForRevokeRoleFromUserOnEnterpriseProject() {
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
            f -> f.withMarshaller(RevokeRoleFromUserOnEnterpriseProjectRequest::getEnterpriseProjectId,
                RevokeRoleFromUserOnEnterpriseProjectRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("user_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RevokeRoleFromUserOnEnterpriseProjectRequest::getUserId,
                RevokeRoleFromUserOnEnterpriseProjectRequest::setUserId));
        builder.<String>withRequestField("role_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RevokeRoleFromUserOnEnterpriseProjectRequest::getRoleId,
                RevokeRoleFromUserOnEnterpriseProjectRequest::setRoleId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAgencyRequest, ShowAgencyResponse> showAgency = genForShowAgency();

    private static HttpRequestDef<ShowAgencyRequest, ShowAgencyResponse> genForShowAgency() {
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
            f -> f.withMarshaller(ShowAgencyRequest::getAgencyId, ShowAgencyRequest::setAgencyId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowCustomPolicyRequest, ShowCustomPolicyResponse> showCustomPolicy =
        genForShowCustomPolicy();

    private static HttpRequestDef<ShowCustomPolicyRequest, ShowCustomPolicyResponse> genForShowCustomPolicy() {
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
            f -> f.withMarshaller(ShowCustomPolicyRequest::getRoleId, ShowCustomPolicyRequest::setRoleId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDomainApiAclPolicyRequest, ShowDomainApiAclPolicyResponse> showDomainApiAclPolicy =
        genForShowDomainApiAclPolicy();

    private static HttpRequestDef<ShowDomainApiAclPolicyRequest, ShowDomainApiAclPolicyResponse> genForShowDomainApiAclPolicy() {
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
            f -> f.withMarshaller(ShowDomainApiAclPolicyRequest::getDomainId,
                ShowDomainApiAclPolicyRequest::setDomainId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDomainConsoleAclPolicyRequest, ShowDomainConsoleAclPolicyResponse> showDomainConsoleAclPolicy =
        genForShowDomainConsoleAclPolicy();

    private static HttpRequestDef<ShowDomainConsoleAclPolicyRequest, ShowDomainConsoleAclPolicyResponse> genForShowDomainConsoleAclPolicy() {
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
            f -> f.withMarshaller(ShowDomainConsoleAclPolicyRequest::getDomainId,
                ShowDomainConsoleAclPolicyRequest::setDomainId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDomainLoginPolicyRequest, ShowDomainLoginPolicyResponse> showDomainLoginPolicy =
        genForShowDomainLoginPolicy();

    private static HttpRequestDef<ShowDomainLoginPolicyRequest, ShowDomainLoginPolicyResponse> genForShowDomainLoginPolicy() {
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
            f -> f.withMarshaller(ShowDomainLoginPolicyRequest::getDomainId,
                ShowDomainLoginPolicyRequest::setDomainId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDomainPasswordPolicyRequest, ShowDomainPasswordPolicyResponse> showDomainPasswordPolicy =
        genForShowDomainPasswordPolicy();

    private static HttpRequestDef<ShowDomainPasswordPolicyRequest, ShowDomainPasswordPolicyResponse> genForShowDomainPasswordPolicy() {
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
            f -> f.withMarshaller(ShowDomainPasswordPolicyRequest::getDomainId,
                ShowDomainPasswordPolicyRequest::setDomainId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDomainProtectPolicyRequest, ShowDomainProtectPolicyResponse> showDomainProtectPolicy =
        genForShowDomainProtectPolicy();

    private static HttpRequestDef<ShowDomainProtectPolicyRequest, ShowDomainProtectPolicyResponse> genForShowDomainProtectPolicy() {
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
            f -> f.withMarshaller(ShowDomainProtectPolicyRequest::getDomainId,
                ShowDomainProtectPolicyRequest::setDomainId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDomainQuotaRequest, ShowDomainQuotaResponse> showDomainQuota =
        genForShowDomainQuota();

    private static HttpRequestDef<ShowDomainQuotaRequest, ShowDomainQuotaResponse> genForShowDomainQuota() {
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
            f -> f.withMarshaller(ShowDomainQuotaRequest::getDomainId, ShowDomainQuotaRequest::setDomainId));
        builder.<ShowDomainQuotaRequest.TypeEnum>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowDomainQuotaRequest.TypeEnum.class),
            f -> f.withMarshaller(ShowDomainQuotaRequest::getType, ShowDomainQuotaRequest::setType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDomainRoleAssignmentsRequest, ShowDomainRoleAssignmentsResponse> showDomainRoleAssignments =
        genForShowDomainRoleAssignments();

    private static HttpRequestDef<ShowDomainRoleAssignmentsRequest, ShowDomainRoleAssignmentsResponse> genForShowDomainRoleAssignments() {
        // basic
        HttpRequestDef.Builder<ShowDomainRoleAssignmentsRequest, ShowDomainRoleAssignmentsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowDomainRoleAssignmentsRequest.class,
                    ShowDomainRoleAssignmentsResponse.class)
                .withName("ShowDomainRoleAssignments")
                .withUri("/v3.0/OS-PERMISSION/role-assignments")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDomainRoleAssignmentsRequest::getDomainId,
                ShowDomainRoleAssignmentsRequest::setDomainId));
        builder.<String>withRequestField("role_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDomainRoleAssignmentsRequest::getRoleId,
                ShowDomainRoleAssignmentsRequest::setRoleId));
        builder.<String>withRequestField("subject",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDomainRoleAssignmentsRequest::getSubject,
                ShowDomainRoleAssignmentsRequest::setSubject));
        builder.<String>withRequestField("subject.user_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDomainRoleAssignmentsRequest::getSubjectUserId,
                ShowDomainRoleAssignmentsRequest::setSubjectUserId));
        builder.<String>withRequestField("subject.group_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDomainRoleAssignmentsRequest::getSubjectGroupId,
                ShowDomainRoleAssignmentsRequest::setSubjectGroupId));
        builder.<String>withRequestField("subject.agency_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDomainRoleAssignmentsRequest::getSubjectAgencyId,
                ShowDomainRoleAssignmentsRequest::setSubjectAgencyId));
        builder.<String>withRequestField("scope",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDomainRoleAssignmentsRequest::getScope,
                ShowDomainRoleAssignmentsRequest::setScope));
        builder.<String>withRequestField("scope.project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDomainRoleAssignmentsRequest::getScopeProjectId,
                ShowDomainRoleAssignmentsRequest::setScopeProjectId));
        builder.<String>withRequestField("scope.domain_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDomainRoleAssignmentsRequest::getScopeDomainId,
                ShowDomainRoleAssignmentsRequest::setScopeDomainId));
        builder.<String>withRequestField("scope.enterprise_projects_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDomainRoleAssignmentsRequest::getScopeEnterpriseProjectsId,
                ShowDomainRoleAssignmentsRequest::setScopeEnterpriseProjectsId));
        builder.<Boolean>withRequestField("is_inherited",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ShowDomainRoleAssignmentsRequest::getIsInherited,
                ShowDomainRoleAssignmentsRequest::setIsInherited));
        builder.<Boolean>withRequestField("include_group",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ShowDomainRoleAssignmentsRequest::getIncludeGroup,
                ShowDomainRoleAssignmentsRequest::setIncludeGroup));
        builder.<Integer>withRequestField("page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowDomainRoleAssignmentsRequest::getPage,
                ShowDomainRoleAssignmentsRequest::setPage));
        builder.<Integer>withRequestField("per_page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowDomainRoleAssignmentsRequest::getPerPage,
                ShowDomainRoleAssignmentsRequest::setPerPage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowMetadataRequest, ShowMetadataResponse> showMetadata = genForShowMetadata();

    private static HttpRequestDef<ShowMetadataRequest, ShowMetadataResponse> genForShowMetadata() {
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
            f -> f.withMarshaller(ShowMetadataRequest::getIdpId, ShowMetadataRequest::setIdpId));
        builder.<String>withRequestField("protocol_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMetadataRequest::getProtocolId, ShowMetadataRequest::setProtocolId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowOpenIdConnectConfigRequest, ShowOpenIdConnectConfigResponse> showOpenIdConnectConfig =
        genForShowOpenIdConnectConfig();

    private static HttpRequestDef<ShowOpenIdConnectConfigRequest, ShowOpenIdConnectConfigResponse> genForShowOpenIdConnectConfig() {
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
            f -> f.withMarshaller(ShowOpenIdConnectConfigRequest::getIdpId, ShowOpenIdConnectConfigRequest::setIdpId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowProjectDetailsAndStatusRequest, ShowProjectDetailsAndStatusResponse> showProjectDetailsAndStatus =
        genForShowProjectDetailsAndStatus();

    private static HttpRequestDef<ShowProjectDetailsAndStatusRequest, ShowProjectDetailsAndStatusResponse> genForShowProjectDetailsAndStatus() {
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
            f -> f.withMarshaller(ShowProjectDetailsAndStatusRequest::getProjectId,
                ShowProjectDetailsAndStatusRequest::setProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowProjectQuotaRequest, ShowProjectQuotaResponse> showProjectQuota =
        genForShowProjectQuota();

    private static HttpRequestDef<ShowProjectQuotaRequest, ShowProjectQuotaResponse> genForShowProjectQuota() {
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
            f -> f.withMarshaller(ShowProjectQuotaRequest::getProjectId, ShowProjectQuotaRequest::setProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateAgencyRequest, UpdateAgencyResponse> updateAgency = genForUpdateAgency();

    private static HttpRequestDef<UpdateAgencyRequest, UpdateAgencyResponse> genForUpdateAgency() {
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
            f -> f.withMarshaller(UpdateAgencyRequest::getAgencyId, UpdateAgencyRequest::setAgencyId));
        builder.<UpdateAgencyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateAgencyRequestBody.class),
            f -> f.withMarshaller(UpdateAgencyRequest::getBody, UpdateAgencyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateAgencyCustomPolicyRequest, UpdateAgencyCustomPolicyResponse> updateAgencyCustomPolicy =
        genForUpdateAgencyCustomPolicy();

    private static HttpRequestDef<UpdateAgencyCustomPolicyRequest, UpdateAgencyCustomPolicyResponse> genForUpdateAgencyCustomPolicy() {
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
            f -> f.withMarshaller(UpdateAgencyCustomPolicyRequest::getRoleId,
                UpdateAgencyCustomPolicyRequest::setRoleId));
        builder.<UpdateAgencyCustomPolicyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateAgencyCustomPolicyRequestBody.class),
            f -> f.withMarshaller(UpdateAgencyCustomPolicyRequest::getBody, UpdateAgencyCustomPolicyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateCloudServiceCustomPolicyRequest, UpdateCloudServiceCustomPolicyResponse> updateCloudServiceCustomPolicy =
        genForUpdateCloudServiceCustomPolicy();

    private static HttpRequestDef<UpdateCloudServiceCustomPolicyRequest, UpdateCloudServiceCustomPolicyResponse> genForUpdateCloudServiceCustomPolicy() {
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
            f -> f.withMarshaller(UpdateCloudServiceCustomPolicyRequest::getRoleId,
                UpdateCloudServiceCustomPolicyRequest::setRoleId));
        builder.<UpdateCloudServiceCustomPolicyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateCloudServiceCustomPolicyRequestBody.class),
            f -> f.withMarshaller(UpdateCloudServiceCustomPolicyRequest::getBody,
                UpdateCloudServiceCustomPolicyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateDomainApiAclPolicyRequest, UpdateDomainApiAclPolicyResponse> updateDomainApiAclPolicy =
        genForUpdateDomainApiAclPolicy();

    private static HttpRequestDef<UpdateDomainApiAclPolicyRequest, UpdateDomainApiAclPolicyResponse> genForUpdateDomainApiAclPolicy() {
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
            f -> f.withMarshaller(UpdateDomainApiAclPolicyRequest::getDomainId,
                UpdateDomainApiAclPolicyRequest::setDomainId));
        builder.<UpdateDomainApiAclPolicyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateDomainApiAclPolicyRequestBody.class),
            f -> f.withMarshaller(UpdateDomainApiAclPolicyRequest::getBody, UpdateDomainApiAclPolicyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateDomainConsoleAclPolicyRequest, UpdateDomainConsoleAclPolicyResponse> updateDomainConsoleAclPolicy =
        genForUpdateDomainConsoleAclPolicy();

    private static HttpRequestDef<UpdateDomainConsoleAclPolicyRequest, UpdateDomainConsoleAclPolicyResponse> genForUpdateDomainConsoleAclPolicy() {
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
            f -> f.withMarshaller(UpdateDomainConsoleAclPolicyRequest::getDomainId,
                UpdateDomainConsoleAclPolicyRequest::setDomainId));
        builder.<UpdateDomainConsoleAclPolicyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdateDomainConsoleAclPolicyRequestBody.class),
            f -> f.withMarshaller(UpdateDomainConsoleAclPolicyRequest::getBody,
                UpdateDomainConsoleAclPolicyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateDomainGroupInheritRoleRequest, UpdateDomainGroupInheritRoleResponse> updateDomainGroupInheritRole =
        genForUpdateDomainGroupInheritRole();

    private static HttpRequestDef<UpdateDomainGroupInheritRoleRequest, UpdateDomainGroupInheritRoleResponse> genForUpdateDomainGroupInheritRole() {
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
            f -> f.withMarshaller(UpdateDomainGroupInheritRoleRequest::getDomainId,
                UpdateDomainGroupInheritRoleRequest::setDomainId));
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDomainGroupInheritRoleRequest::getGroupId,
                UpdateDomainGroupInheritRoleRequest::setGroupId));
        builder.<String>withRequestField("role_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDomainGroupInheritRoleRequest::getRoleId,
                UpdateDomainGroupInheritRoleRequest::setRoleId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateDomainLoginPolicyRequest, UpdateDomainLoginPolicyResponse> updateDomainLoginPolicy =
        genForUpdateDomainLoginPolicy();

    private static HttpRequestDef<UpdateDomainLoginPolicyRequest, UpdateDomainLoginPolicyResponse> genForUpdateDomainLoginPolicy() {
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
            f -> f.withMarshaller(UpdateDomainLoginPolicyRequest::getDomainId,
                UpdateDomainLoginPolicyRequest::setDomainId));
        builder.<UpdateDomainLoginPolicyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateDomainLoginPolicyRequestBody.class),
            f -> f.withMarshaller(UpdateDomainLoginPolicyRequest::getBody, UpdateDomainLoginPolicyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateDomainPasswordPolicyRequest, UpdateDomainPasswordPolicyResponse> updateDomainPasswordPolicy =
        genForUpdateDomainPasswordPolicy();

    private static HttpRequestDef<UpdateDomainPasswordPolicyRequest, UpdateDomainPasswordPolicyResponse> genForUpdateDomainPasswordPolicy() {
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
            f -> f.withMarshaller(UpdateDomainPasswordPolicyRequest::getDomainId,
                UpdateDomainPasswordPolicyRequest::setDomainId));
        builder.<UpdateDomainPasswordPolicyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateDomainPasswordPolicyRequestBody.class),
            f -> f.withMarshaller(UpdateDomainPasswordPolicyRequest::getBody,
                UpdateDomainPasswordPolicyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateDomainProtectPolicyRequest, UpdateDomainProtectPolicyResponse> updateDomainProtectPolicy =
        genForUpdateDomainProtectPolicy();

    private static HttpRequestDef<UpdateDomainProtectPolicyRequest, UpdateDomainProtectPolicyResponse> genForUpdateDomainProtectPolicy() {
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
            f -> f.withMarshaller(UpdateDomainProtectPolicyRequest::getDomainId,
                UpdateDomainProtectPolicyRequest::setDomainId));
        builder.<UpdateDomainProtectPolicyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateDomainProtectPolicyRequestBody.class),
            f -> f.withMarshaller(UpdateDomainProtectPolicyRequest::getBody,
                UpdateDomainProtectPolicyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateOpenIdConnectConfigRequest, UpdateOpenIdConnectConfigResponse> updateOpenIdConnectConfig =
        genForUpdateOpenIdConnectConfig();

    private static HttpRequestDef<UpdateOpenIdConnectConfigRequest, UpdateOpenIdConnectConfigResponse> genForUpdateOpenIdConnectConfig() {
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
            f -> f.withMarshaller(UpdateOpenIdConnectConfigRequest::getIdpId,
                UpdateOpenIdConnectConfigRequest::setIdpId));
        builder.<UpdateOpenIdConnectConfigRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateOpenIdConnectConfigRequestBody.class),
            f -> f.withMarshaller(UpdateOpenIdConnectConfigRequest::getBody,
                UpdateOpenIdConnectConfigRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateProjectStatusRequest, UpdateProjectStatusResponse> updateProjectStatus =
        genForUpdateProjectStatus();

    private static HttpRequestDef<UpdateProjectStatusRequest, UpdateProjectStatusResponse> genForUpdateProjectStatus() {
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
            f -> f.withMarshaller(UpdateProjectStatusRequest::getProjectId, UpdateProjectStatusRequest::setProjectId));
        builder.<UpdateProjectStatusRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateProjectStatusRequestBody.class),
            f -> f.withMarshaller(UpdateProjectStatusRequest::getBody, UpdateProjectStatusRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreatePermanentAccessKeyRequest, CreatePermanentAccessKeyResponse> createPermanentAccessKey =
        genForCreatePermanentAccessKey();

    private static HttpRequestDef<CreatePermanentAccessKeyRequest, CreatePermanentAccessKeyResponse> genForCreatePermanentAccessKey() {
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
            f -> f.withMarshaller(CreatePermanentAccessKeyRequest::getBody, CreatePermanentAccessKeyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateTemporaryAccessKeyByAgencyRequest, CreateTemporaryAccessKeyByAgencyResponse> createTemporaryAccessKeyByAgency =
        genForCreateTemporaryAccessKeyByAgency();

    private static HttpRequestDef<CreateTemporaryAccessKeyByAgencyRequest, CreateTemporaryAccessKeyByAgencyResponse> genForCreateTemporaryAccessKeyByAgency() {
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
            f -> f.withMarshaller(CreateTemporaryAccessKeyByAgencyRequest::getBody,
                CreateTemporaryAccessKeyByAgencyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateTemporaryAccessKeyByTokenRequest, CreateTemporaryAccessKeyByTokenResponse> createTemporaryAccessKeyByToken =
        genForCreateTemporaryAccessKeyByToken();

    private static HttpRequestDef<CreateTemporaryAccessKeyByTokenRequest, CreateTemporaryAccessKeyByTokenResponse> genForCreateTemporaryAccessKeyByToken() {
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
            f -> f.withMarshaller(CreateTemporaryAccessKeyByTokenRequest::getBody,
                CreateTemporaryAccessKeyByTokenRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeletePermanentAccessKeyRequest, DeletePermanentAccessKeyResponse> deletePermanentAccessKey =
        genForDeletePermanentAccessKey();

    private static HttpRequestDef<DeletePermanentAccessKeyRequest, DeletePermanentAccessKeyResponse> genForDeletePermanentAccessKey() {
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
            f -> f.withMarshaller(DeletePermanentAccessKeyRequest::getAccessKey,
                DeletePermanentAccessKeyRequest::setAccessKey));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPermanentAccessKeysRequest, ListPermanentAccessKeysResponse> listPermanentAccessKeys =
        genForListPermanentAccessKeys();

    private static HttpRequestDef<ListPermanentAccessKeysRequest, ListPermanentAccessKeysResponse> genForListPermanentAccessKeys() {
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
            f -> f.withMarshaller(ListPermanentAccessKeysRequest::getUserId,
                ListPermanentAccessKeysRequest::setUserId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowPermanentAccessKeyRequest, ShowPermanentAccessKeyResponse> showPermanentAccessKey =
        genForShowPermanentAccessKey();

    private static HttpRequestDef<ShowPermanentAccessKeyRequest, ShowPermanentAccessKeyResponse> genForShowPermanentAccessKey() {
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
            f -> f.withMarshaller(ShowPermanentAccessKeyRequest::getAccessKey,
                ShowPermanentAccessKeyRequest::setAccessKey));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdatePermanentAccessKeyRequest, UpdatePermanentAccessKeyResponse> updatePermanentAccessKey =
        genForUpdatePermanentAccessKey();

    private static HttpRequestDef<UpdatePermanentAccessKeyRequest, UpdatePermanentAccessKeyResponse> genForUpdatePermanentAccessKey() {
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
            f -> f.withMarshaller(UpdatePermanentAccessKeyRequest::getAccessKey,
                UpdatePermanentAccessKeyRequest::setAccessKey));
        builder.<UpdatePermanentAccessKeyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdatePermanentAccessKeyRequestBody.class),
            f -> f.withMarshaller(UpdatePermanentAccessKeyRequest::getBody, UpdatePermanentAccessKeyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateUserRequest, CreateUserResponse> createUser = genForCreateUser();

    private static HttpRequestDef<CreateUserRequest, CreateUserResponse> genForCreateUser() {
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
            f -> f.withMarshaller(CreateUserRequest::getBody, CreateUserRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<KeystoneCreateUserRequest, KeystoneCreateUserResponse> keystoneCreateUser =
        genForKeystoneCreateUser();

    private static HttpRequestDef<KeystoneCreateUserRequest, KeystoneCreateUserResponse> genForKeystoneCreateUser() {
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
            f -> f.withMarshaller(KeystoneCreateUserRequest::getBody, KeystoneCreateUserRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<KeystoneDeleteUserRequest, KeystoneDeleteUserResponse> keystoneDeleteUser =
        genForKeystoneDeleteUser();

    private static HttpRequestDef<KeystoneDeleteUserRequest, KeystoneDeleteUserResponse> genForKeystoneDeleteUser() {
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
            f -> f.withMarshaller(KeystoneDeleteUserRequest::getUserId, KeystoneDeleteUserRequest::setUserId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<KeystoneListGroupsForUserRequest, KeystoneListGroupsForUserResponse> keystoneListGroupsForUser =
        genForKeystoneListGroupsForUser();

    private static HttpRequestDef<KeystoneListGroupsForUserRequest, KeystoneListGroupsForUserResponse> genForKeystoneListGroupsForUser() {
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
            f -> f.withMarshaller(KeystoneListGroupsForUserRequest::getUserId,
                KeystoneListGroupsForUserRequest::setUserId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<KeystoneListUsersRequest, KeystoneListUsersResponse> keystoneListUsers =
        genForKeystoneListUsers();

    private static HttpRequestDef<KeystoneListUsersRequest, KeystoneListUsersResponse> genForKeystoneListUsers() {
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
            f -> f.withMarshaller(KeystoneListUsersRequest::getDomainId, KeystoneListUsersRequest::setDomainId));
        builder.<Boolean>withRequestField("enabled",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(KeystoneListUsersRequest::getEnabled, KeystoneListUsersRequest::setEnabled));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(KeystoneListUsersRequest::getName, KeystoneListUsersRequest::setName));
        builder.<String>withRequestField("password_expires_at",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(KeystoneListUsersRequest::getPasswordExpiresAt,
                KeystoneListUsersRequest::setPasswordExpiresAt));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<KeystoneListUsersForGroupByAdminRequest, KeystoneListUsersForGroupByAdminResponse> keystoneListUsersForGroupByAdmin =
        genForKeystoneListUsersForGroupByAdmin();

    private static HttpRequestDef<KeystoneListUsersForGroupByAdminRequest, KeystoneListUsersForGroupByAdminResponse> genForKeystoneListUsersForGroupByAdmin() {
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
            f -> f.withMarshaller(KeystoneListUsersForGroupByAdminRequest::getGroupId,
                KeystoneListUsersForGroupByAdminRequest::setGroupId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<KeystoneShowUserRequest, KeystoneShowUserResponse> keystoneShowUser =
        genForKeystoneShowUser();

    private static HttpRequestDef<KeystoneShowUserRequest, KeystoneShowUserResponse> genForKeystoneShowUser() {
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
            f -> f.withMarshaller(KeystoneShowUserRequest::getUserId, KeystoneShowUserRequest::setUserId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<KeystoneUpdateUserByAdminRequest, KeystoneUpdateUserByAdminResponse> keystoneUpdateUserByAdmin =
        genForKeystoneUpdateUserByAdmin();

    private static HttpRequestDef<KeystoneUpdateUserByAdminRequest, KeystoneUpdateUserByAdminResponse> genForKeystoneUpdateUserByAdmin() {
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
            f -> f.withMarshaller(KeystoneUpdateUserByAdminRequest::getUserId,
                KeystoneUpdateUserByAdminRequest::setUserId));
        builder.<KeystoneUpdateUserByAdminRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(KeystoneUpdateUserByAdminRequestBody.class),
            f -> f.withMarshaller(KeystoneUpdateUserByAdminRequest::getBody,
                KeystoneUpdateUserByAdminRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<KeystoneUpdateUserPasswordRequest, KeystoneUpdateUserPasswordResponse> keystoneUpdateUserPassword =
        genForKeystoneUpdateUserPassword();

    private static HttpRequestDef<KeystoneUpdateUserPasswordRequest, KeystoneUpdateUserPasswordResponse> genForKeystoneUpdateUserPassword() {
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
            f -> f.withMarshaller(KeystoneUpdateUserPasswordRequest::getUserId,
                KeystoneUpdateUserPasswordRequest::setUserId));
        builder.<KeystoneUpdateUserPasswordRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(KeystoneUpdateUserPasswordRequestBody.class),
            f -> f.withMarshaller(KeystoneUpdateUserPasswordRequest::getBody,
                KeystoneUpdateUserPasswordRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListUserLoginProtectsRequest, ListUserLoginProtectsResponse> listUserLoginProtects =
        genForListUserLoginProtects();

    private static HttpRequestDef<ListUserLoginProtectsRequest, ListUserLoginProtectsResponse> genForListUserLoginProtects() {
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
        genForListUserMfaDevices();

    private static HttpRequestDef<ListUserMfaDevicesRequest, ListUserMfaDevicesResponse> genForListUserMfaDevices() {
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

    public static final HttpRequestDef<ShowUserRequest, ShowUserResponse> showUser = genForShowUser();

    private static HttpRequestDef<ShowUserRequest, ShowUserResponse> genForShowUser() {
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
            f -> f.withMarshaller(ShowUserRequest::getUserId, ShowUserRequest::setUserId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowUserLoginProtectRequest, ShowUserLoginProtectResponse> showUserLoginProtect =
        genForShowUserLoginProtect();

    private static HttpRequestDef<ShowUserLoginProtectRequest, ShowUserLoginProtectResponse> genForShowUserLoginProtect() {
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
            f -> f.withMarshaller(ShowUserLoginProtectRequest::getUserId, ShowUserLoginProtectRequest::setUserId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowUserMfaDeviceRequest, ShowUserMfaDeviceResponse> showUserMfaDevice =
        genForShowUserMfaDevice();

    private static HttpRequestDef<ShowUserMfaDeviceRequest, ShowUserMfaDeviceResponse> genForShowUserMfaDevice() {
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
            f -> f.withMarshaller(ShowUserMfaDeviceRequest::getUserId, ShowUserMfaDeviceRequest::setUserId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateLoginProtectRequest, UpdateLoginProtectResponse> updateLoginProtect =
        genForUpdateLoginProtect();

    private static HttpRequestDef<UpdateLoginProtectRequest, UpdateLoginProtectResponse> genForUpdateLoginProtect() {
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
            f -> f.withMarshaller(UpdateLoginProtectRequest::getUserId, UpdateLoginProtectRequest::setUserId));
        builder.<UpdateLoginProjectReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateLoginProjectReq.class),
            f -> f.withMarshaller(UpdateLoginProtectRequest::getBody, UpdateLoginProtectRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateUserRequest, UpdateUserResponse> updateUser = genForUpdateUser();

    private static HttpRequestDef<UpdateUserRequest, UpdateUserResponse> genForUpdateUser() {
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
            f -> f.withMarshaller(UpdateUserRequest::getUserId, UpdateUserRequest::setUserId));
        builder.<UpdateUserRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateUserRequestBody.class),
            f -> f.withMarshaller(UpdateUserRequest::getBody, UpdateUserRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateUserInformationRequest, UpdateUserInformationResponse> updateUserInformation =
        genForUpdateUserInformation();

    private static HttpRequestDef<UpdateUserInformationRequest, UpdateUserInformationResponse> genForUpdateUserInformation() {
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
            f -> f.withMarshaller(UpdateUserInformationRequest::getUserId, UpdateUserInformationRequest::setUserId));
        builder.<UpdateUserInformationRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateUserInformationRequestBody.class),
            f -> f.withMarshaller(UpdateUserInformationRequest::getBody, UpdateUserInformationRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<KeystoneCreateAgencyTokenRequest, KeystoneCreateAgencyTokenResponse> keystoneCreateAgencyToken =
        genForKeystoneCreateAgencyToken();

    private static HttpRequestDef<KeystoneCreateAgencyTokenRequest, KeystoneCreateAgencyTokenResponse> genForKeystoneCreateAgencyToken() {
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
            f -> f.withMarshaller(KeystoneCreateAgencyTokenRequest::getNocatalog,
                KeystoneCreateAgencyTokenRequest::setNocatalog));
        builder.<KeystoneCreateAgencyTokenRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(KeystoneCreateAgencyTokenRequestBody.class),
            f -> f.withMarshaller(KeystoneCreateAgencyTokenRequest::getBody,
                KeystoneCreateAgencyTokenRequest::setBody));

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
        genForKeystoneCreateUserTokenByPassword();

    private static HttpRequestDef<KeystoneCreateUserTokenByPasswordRequest, KeystoneCreateUserTokenByPasswordResponse> genForKeystoneCreateUserTokenByPassword() {
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
            f -> f.withMarshaller(KeystoneCreateUserTokenByPasswordRequest::getNocatalog,
                KeystoneCreateUserTokenByPasswordRequest::setNocatalog));
        builder.<KeystoneCreateUserTokenByPasswordRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(KeystoneCreateUserTokenByPasswordRequestBody.class),
            f -> f.withMarshaller(KeystoneCreateUserTokenByPasswordRequest::getBody,
                KeystoneCreateUserTokenByPasswordRequest::setBody));

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
        genForKeystoneCreateUserTokenByPasswordAndMfa();

    private static HttpRequestDef<KeystoneCreateUserTokenByPasswordAndMfaRequest, KeystoneCreateUserTokenByPasswordAndMfaResponse> genForKeystoneCreateUserTokenByPasswordAndMfa() {
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
            f -> f.withMarshaller(KeystoneCreateUserTokenByPasswordAndMfaRequest::getNocatalog,
                KeystoneCreateUserTokenByPasswordAndMfaRequest::setNocatalog));
        builder.<KeystoneCreateUserTokenByPasswordAndMfaRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(KeystoneCreateUserTokenByPasswordAndMfaRequestBody.class),
            f -> f.withMarshaller(KeystoneCreateUserTokenByPasswordAndMfaRequest::getBody,
                KeystoneCreateUserTokenByPasswordAndMfaRequest::setBody));

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
        genForKeystoneValidateToken();

    private static HttpRequestDef<KeystoneValidateTokenRequest, KeystoneValidateTokenResponse> genForKeystoneValidateToken() {
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
            f -> f.withMarshaller(KeystoneValidateTokenRequest::getNocatalog,
                KeystoneValidateTokenRequest::setNocatalog));
        builder.<String>withRequestField("X-Subject-Token",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(KeystoneValidateTokenRequest::getXSubjectToken,
                KeystoneValidateTokenRequest::setXSubjectToken));

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
