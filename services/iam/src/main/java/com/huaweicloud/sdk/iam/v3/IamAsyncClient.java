package com.huaweicloud.sdk.iam.v3;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
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
import com.huaweicloud.sdk.iam.v3.model.CheckAllProjectsPermissionForAgencyRequest;
import com.huaweicloud.sdk.iam.v3.model.CheckAllProjectsPermissionForAgencyResponse;
import com.huaweicloud.sdk.iam.v3.model.CheckDomainPermissionForAgencyRequest;
import com.huaweicloud.sdk.iam.v3.model.CheckDomainPermissionForAgencyResponse;
import com.huaweicloud.sdk.iam.v3.model.CheckProjectPermissionForAgencyRequest;
import com.huaweicloud.sdk.iam.v3.model.CheckProjectPermissionForAgencyResponse;
import com.huaweicloud.sdk.iam.v3.model.CreateAgencyCustomPolicyRequest;
import com.huaweicloud.sdk.iam.v3.model.CreateAgencyCustomPolicyResponse;
import com.huaweicloud.sdk.iam.v3.model.CreateAgencyRequest;
import com.huaweicloud.sdk.iam.v3.model.CreateAgencyResponse;
import com.huaweicloud.sdk.iam.v3.model.CreateBindingDeviceRequest;
import com.huaweicloud.sdk.iam.v3.model.CreateBindingDeviceResponse;
import com.huaweicloud.sdk.iam.v3.model.CreateCloudServiceCustomPolicyRequest;
import com.huaweicloud.sdk.iam.v3.model.CreateCloudServiceCustomPolicyResponse;
import com.huaweicloud.sdk.iam.v3.model.CreateLoginTokenRequest;
import com.huaweicloud.sdk.iam.v3.model.CreateLoginTokenResponse;
import com.huaweicloud.sdk.iam.v3.model.CreateMetadataRequest;
import com.huaweicloud.sdk.iam.v3.model.CreateMetadataResponse;
import com.huaweicloud.sdk.iam.v3.model.CreateMfaDeviceRequest;
import com.huaweicloud.sdk.iam.v3.model.CreateMfaDeviceResponse;
import com.huaweicloud.sdk.iam.v3.model.CreateOpenIdConnectConfigRequest;
import com.huaweicloud.sdk.iam.v3.model.CreateOpenIdConnectConfigResponse;
import com.huaweicloud.sdk.iam.v3.model.CreatePermanentAccessKeyRequest;
import com.huaweicloud.sdk.iam.v3.model.CreatePermanentAccessKeyResponse;
import com.huaweicloud.sdk.iam.v3.model.CreateTemporaryAccessKeyByAgencyRequest;
import com.huaweicloud.sdk.iam.v3.model.CreateTemporaryAccessKeyByAgencyResponse;
import com.huaweicloud.sdk.iam.v3.model.CreateTemporaryAccessKeyByTokenRequest;
import com.huaweicloud.sdk.iam.v3.model.CreateTemporaryAccessKeyByTokenResponse;
import com.huaweicloud.sdk.iam.v3.model.CreateTokenWithIdTokenRequest;
import com.huaweicloud.sdk.iam.v3.model.CreateTokenWithIdTokenResponse;
import com.huaweicloud.sdk.iam.v3.model.CreateUnscopedTokenWithIdTokenRequest;
import com.huaweicloud.sdk.iam.v3.model.CreateUnscopedTokenWithIdTokenResponse;
import com.huaweicloud.sdk.iam.v3.model.CreateUserRequest;
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
import com.huaweicloud.sdk.iam.v3.model.KeystoneCreateAgencyTokenResponse;
import com.huaweicloud.sdk.iam.v3.model.KeystoneCreateGroupRequest;
import com.huaweicloud.sdk.iam.v3.model.KeystoneCreateGroupResponse;
import com.huaweicloud.sdk.iam.v3.model.KeystoneCreateIdentityProviderRequest;
import com.huaweicloud.sdk.iam.v3.model.KeystoneCreateIdentityProviderResponse;
import com.huaweicloud.sdk.iam.v3.model.KeystoneCreateMappingRequest;
import com.huaweicloud.sdk.iam.v3.model.KeystoneCreateMappingResponse;
import com.huaweicloud.sdk.iam.v3.model.KeystoneCreateProjectRequest;
import com.huaweicloud.sdk.iam.v3.model.KeystoneCreateProjectResponse;
import com.huaweicloud.sdk.iam.v3.model.KeystoneCreateProtocolRequest;
import com.huaweicloud.sdk.iam.v3.model.KeystoneCreateProtocolResponse;
import com.huaweicloud.sdk.iam.v3.model.KeystoneCreateScopedTokenRequest;
import com.huaweicloud.sdk.iam.v3.model.KeystoneCreateScopedTokenResponse;
import com.huaweicloud.sdk.iam.v3.model.KeystoneCreateUserRequest;
import com.huaweicloud.sdk.iam.v3.model.KeystoneCreateUserResponse;
import com.huaweicloud.sdk.iam.v3.model.KeystoneCreateUserTokenByPasswordAndMfaRequest;
import com.huaweicloud.sdk.iam.v3.model.KeystoneCreateUserTokenByPasswordAndMfaResponse;
import com.huaweicloud.sdk.iam.v3.model.KeystoneCreateUserTokenByPasswordRequest;
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
import com.huaweicloud.sdk.iam.v3.model.KeystoneUpdateGroupResponse;
import com.huaweicloud.sdk.iam.v3.model.KeystoneUpdateIdentityProviderRequest;
import com.huaweicloud.sdk.iam.v3.model.KeystoneUpdateIdentityProviderResponse;
import com.huaweicloud.sdk.iam.v3.model.KeystoneUpdateMappingRequest;
import com.huaweicloud.sdk.iam.v3.model.KeystoneUpdateMappingResponse;
import com.huaweicloud.sdk.iam.v3.model.KeystoneUpdateProjectRequest;
import com.huaweicloud.sdk.iam.v3.model.KeystoneUpdateProjectResponse;
import com.huaweicloud.sdk.iam.v3.model.KeystoneUpdateProtocolRequest;
import com.huaweicloud.sdk.iam.v3.model.KeystoneUpdateProtocolResponse;
import com.huaweicloud.sdk.iam.v3.model.KeystoneUpdateUserByAdminRequest;
import com.huaweicloud.sdk.iam.v3.model.KeystoneUpdateUserByAdminResponse;
import com.huaweicloud.sdk.iam.v3.model.KeystoneUpdateUserPasswordRequest;
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
import com.huaweicloud.sdk.iam.v3.model.UpdateAgencyCustomPolicyRequest;
import com.huaweicloud.sdk.iam.v3.model.UpdateAgencyCustomPolicyResponse;
import com.huaweicloud.sdk.iam.v3.model.UpdateAgencyRequest;
import com.huaweicloud.sdk.iam.v3.model.UpdateAgencyResponse;
import com.huaweicloud.sdk.iam.v3.model.UpdateCloudServiceCustomPolicyRequest;
import com.huaweicloud.sdk.iam.v3.model.UpdateCloudServiceCustomPolicyResponse;
import com.huaweicloud.sdk.iam.v3.model.UpdateDomainApiAclPolicyRequest;
import com.huaweicloud.sdk.iam.v3.model.UpdateDomainApiAclPolicyResponse;
import com.huaweicloud.sdk.iam.v3.model.UpdateDomainConsoleAclPolicyRequest;
import com.huaweicloud.sdk.iam.v3.model.UpdateDomainConsoleAclPolicyResponse;
import com.huaweicloud.sdk.iam.v3.model.UpdateDomainGroupInheritRoleRequest;
import com.huaweicloud.sdk.iam.v3.model.UpdateDomainGroupInheritRoleResponse;
import com.huaweicloud.sdk.iam.v3.model.UpdateDomainLoginPolicyRequest;
import com.huaweicloud.sdk.iam.v3.model.UpdateDomainLoginPolicyResponse;
import com.huaweicloud.sdk.iam.v3.model.UpdateDomainPasswordPolicyRequest;
import com.huaweicloud.sdk.iam.v3.model.UpdateDomainPasswordPolicyResponse;
import com.huaweicloud.sdk.iam.v3.model.UpdateDomainProtectPolicyRequest;
import com.huaweicloud.sdk.iam.v3.model.UpdateDomainProtectPolicyResponse;
import com.huaweicloud.sdk.iam.v3.model.UpdateLoginProtectRequest;
import com.huaweicloud.sdk.iam.v3.model.UpdateLoginProtectResponse;
import com.huaweicloud.sdk.iam.v3.model.UpdateOpenIdConnectConfigRequest;
import com.huaweicloud.sdk.iam.v3.model.UpdateOpenIdConnectConfigResponse;
import com.huaweicloud.sdk.iam.v3.model.UpdatePermanentAccessKeyRequest;
import com.huaweicloud.sdk.iam.v3.model.UpdatePermanentAccessKeyResponse;
import com.huaweicloud.sdk.iam.v3.model.UpdateProjectStatusRequest;
import com.huaweicloud.sdk.iam.v3.model.UpdateProjectStatusResponse;
import com.huaweicloud.sdk.iam.v3.model.UpdateUserInformationRequest;
import com.huaweicloud.sdk.iam.v3.model.UpdateUserInformationResponse;
import com.huaweicloud.sdk.iam.v3.model.UpdateUserRequest;
import com.huaweicloud.sdk.iam.v3.model.UpdateUserResponse;

import java.util.concurrent.CompletableFuture;

public class IamAsyncClient {

    protected HcClient hcClient;

    public IamAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<IamAsyncClient> newBuilder() {
        ClientBuilder<IamAsyncClient> clientBuilder =
            new ClientBuilder<>(IamAsyncClient::new, "GlobalCredentials,BasicCredentials,IAMCredentials");
        return clientBuilder;
    }

    /**
     * 为委托授予所有项目服务权限
     *
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)为委托授予所有项目服务权限。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AssociateAgencyWithAllProjectsPermissionRequest 请求对象
     * @return CompletableFuture<AssociateAgencyWithAllProjectsPermissionResponse>
     */
    public CompletableFuture<AssociateAgencyWithAllProjectsPermissionResponse> associateAgencyWithAllProjectsPermissionAsync(
        AssociateAgencyWithAllProjectsPermissionRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.associateAgencyWithAllProjectsPermission);
    }

    /**
     * 为委托授予所有项目服务权限
     *
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)为委托授予所有项目服务权限。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AssociateAgencyWithAllProjectsPermissionRequest 请求对象
     * @return AsyncInvoker<AssociateAgencyWithAllProjectsPermissionRequest, AssociateAgencyWithAllProjectsPermissionResponse>
     */
    public AsyncInvoker<AssociateAgencyWithAllProjectsPermissionRequest, AssociateAgencyWithAllProjectsPermissionResponse> associateAgencyWithAllProjectsPermissionAsyncInvoker(
        AssociateAgencyWithAllProjectsPermissionRequest request) {
        return new AsyncInvoker<>(request, IamMeta.associateAgencyWithAllProjectsPermission, hcClient);
    }

    /**
     * 为委托授予全局服务权限
     *
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)为委托授予全局服务权限。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AssociateAgencyWithDomainPermissionRequest 请求对象
     * @return CompletableFuture<AssociateAgencyWithDomainPermissionResponse>
     */
    public CompletableFuture<AssociateAgencyWithDomainPermissionResponse> associateAgencyWithDomainPermissionAsync(
        AssociateAgencyWithDomainPermissionRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.associateAgencyWithDomainPermission);
    }

    /**
     * 为委托授予全局服务权限
     *
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)为委托授予全局服务权限。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AssociateAgencyWithDomainPermissionRequest 请求对象
     * @return AsyncInvoker<AssociateAgencyWithDomainPermissionRequest, AssociateAgencyWithDomainPermissionResponse>
     */
    public AsyncInvoker<AssociateAgencyWithDomainPermissionRequest, AssociateAgencyWithDomainPermissionResponse> associateAgencyWithDomainPermissionAsyncInvoker(
        AssociateAgencyWithDomainPermissionRequest request) {
        return new AsyncInvoker<>(request, IamMeta.associateAgencyWithDomainPermission, hcClient);
    }

    /**
     * 为委托授予项目服务权限
     *
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)为委托授予项目服务权限。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AssociateAgencyWithProjectPermissionRequest 请求对象
     * @return CompletableFuture<AssociateAgencyWithProjectPermissionResponse>
     */
    public CompletableFuture<AssociateAgencyWithProjectPermissionResponse> associateAgencyWithProjectPermissionAsync(
        AssociateAgencyWithProjectPermissionRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.associateAgencyWithProjectPermission);
    }

    /**
     * 为委托授予项目服务权限
     *
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)为委托授予项目服务权限。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AssociateAgencyWithProjectPermissionRequest 请求对象
     * @return AsyncInvoker<AssociateAgencyWithProjectPermissionRequest, AssociateAgencyWithProjectPermissionResponse>
     */
    public AsyncInvoker<AssociateAgencyWithProjectPermissionRequest, AssociateAgencyWithProjectPermissionResponse> associateAgencyWithProjectPermissionAsyncInvoker(
        AssociateAgencyWithProjectPermissionRequest request) {
        return new AsyncInvoker<>(request, IamMeta.associateAgencyWithProjectPermission, hcClient);
    }

    /**
     * 基于委托为企业项目授权
     *
     * 该接口可以基于委托为企业项目授权
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AssociateRoleToAgencyOnEnterpriseProjectRequest 请求对象
     * @return CompletableFuture<AssociateRoleToAgencyOnEnterpriseProjectResponse>
     */
    public CompletableFuture<AssociateRoleToAgencyOnEnterpriseProjectResponse> associateRoleToAgencyOnEnterpriseProjectAsync(
        AssociateRoleToAgencyOnEnterpriseProjectRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.associateRoleToAgencyOnEnterpriseProject);
    }

    /**
     * 基于委托为企业项目授权
     *
     * 该接口可以基于委托为企业项目授权
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AssociateRoleToAgencyOnEnterpriseProjectRequest 请求对象
     * @return AsyncInvoker<AssociateRoleToAgencyOnEnterpriseProjectRequest, AssociateRoleToAgencyOnEnterpriseProjectResponse>
     */
    public AsyncInvoker<AssociateRoleToAgencyOnEnterpriseProjectRequest, AssociateRoleToAgencyOnEnterpriseProjectResponse> associateRoleToAgencyOnEnterpriseProjectAsyncInvoker(
        AssociateRoleToAgencyOnEnterpriseProjectRequest request) {
        return new AsyncInvoker<>(request, IamMeta.associateRoleToAgencyOnEnterpriseProject, hcClient);
    }

    /**
     * 基于用户组为企业项目授权
     *
     * 该接口用于基于用户组为企业项目授权。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AssociateRoleToGroupOnEnterpriseProjectRequest 请求对象
     * @return CompletableFuture<AssociateRoleToGroupOnEnterpriseProjectResponse>
     */
    public CompletableFuture<AssociateRoleToGroupOnEnterpriseProjectResponse> associateRoleToGroupOnEnterpriseProjectAsync(
        AssociateRoleToGroupOnEnterpriseProjectRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.associateRoleToGroupOnEnterpriseProject);
    }

    /**
     * 基于用户组为企业项目授权
     *
     * 该接口用于基于用户组为企业项目授权。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AssociateRoleToGroupOnEnterpriseProjectRequest 请求对象
     * @return AsyncInvoker<AssociateRoleToGroupOnEnterpriseProjectRequest, AssociateRoleToGroupOnEnterpriseProjectResponse>
     */
    public AsyncInvoker<AssociateRoleToGroupOnEnterpriseProjectRequest, AssociateRoleToGroupOnEnterpriseProjectResponse> associateRoleToGroupOnEnterpriseProjectAsyncInvoker(
        AssociateRoleToGroupOnEnterpriseProjectRequest request) {
        return new AsyncInvoker<>(request, IamMeta.associateRoleToGroupOnEnterpriseProject, hcClient);
    }

    /**
     * 基于用户为企业项目授权
     *
     * 基于用户为企业项目授权。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AssociateRoleToUserOnEnterpriseProjectRequest 请求对象
     * @return CompletableFuture<AssociateRoleToUserOnEnterpriseProjectResponse>
     */
    public CompletableFuture<AssociateRoleToUserOnEnterpriseProjectResponse> associateRoleToUserOnEnterpriseProjectAsync(
        AssociateRoleToUserOnEnterpriseProjectRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.associateRoleToUserOnEnterpriseProject);
    }

    /**
     * 基于用户为企业项目授权
     *
     * 基于用户为企业项目授权。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AssociateRoleToUserOnEnterpriseProjectRequest 请求对象
     * @return AsyncInvoker<AssociateRoleToUserOnEnterpriseProjectRequest, AssociateRoleToUserOnEnterpriseProjectResponse>
     */
    public AsyncInvoker<AssociateRoleToUserOnEnterpriseProjectRequest, AssociateRoleToUserOnEnterpriseProjectResponse> associateRoleToUserOnEnterpriseProjectAsyncInvoker(
        AssociateRoleToUserOnEnterpriseProjectRequest request) {
        return new AsyncInvoker<>(request, IamMeta.associateRoleToUserOnEnterpriseProject, hcClient);
    }

    /**
     * 检查委托下是否具有所有项目服务权限
     *
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)检查委托是否具有所有项目服务权限。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckAllProjectsPermissionForAgencyRequest 请求对象
     * @return CompletableFuture<CheckAllProjectsPermissionForAgencyResponse>
     */
    public CompletableFuture<CheckAllProjectsPermissionForAgencyResponse> checkAllProjectsPermissionForAgencyAsync(
        CheckAllProjectsPermissionForAgencyRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.checkAllProjectsPermissionForAgency);
    }

    /**
     * 检查委托下是否具有所有项目服务权限
     *
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)检查委托是否具有所有项目服务权限。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckAllProjectsPermissionForAgencyRequest 请求对象
     * @return AsyncInvoker<CheckAllProjectsPermissionForAgencyRequest, CheckAllProjectsPermissionForAgencyResponse>
     */
    public AsyncInvoker<CheckAllProjectsPermissionForAgencyRequest, CheckAllProjectsPermissionForAgencyResponse> checkAllProjectsPermissionForAgencyAsyncInvoker(
        CheckAllProjectsPermissionForAgencyRequest request) {
        return new AsyncInvoker<>(request, IamMeta.checkAllProjectsPermissionForAgency, hcClient);
    }

    /**
     * 查询委托是否拥有全局服务权限
     *
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询委托是否拥有全局服务权限。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckDomainPermissionForAgencyRequest 请求对象
     * @return CompletableFuture<CheckDomainPermissionForAgencyResponse>
     */
    public CompletableFuture<CheckDomainPermissionForAgencyResponse> checkDomainPermissionForAgencyAsync(
        CheckDomainPermissionForAgencyRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.checkDomainPermissionForAgency);
    }

    /**
     * 查询委托是否拥有全局服务权限
     *
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询委托是否拥有全局服务权限。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckDomainPermissionForAgencyRequest 请求对象
     * @return AsyncInvoker<CheckDomainPermissionForAgencyRequest, CheckDomainPermissionForAgencyResponse>
     */
    public AsyncInvoker<CheckDomainPermissionForAgencyRequest, CheckDomainPermissionForAgencyResponse> checkDomainPermissionForAgencyAsyncInvoker(
        CheckDomainPermissionForAgencyRequest request) {
        return new AsyncInvoker<>(request, IamMeta.checkDomainPermissionForAgency, hcClient);
    }

    /**
     * 查询委托是否拥有项目服务权限
     *
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询委托是否拥有项目服务权限。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckProjectPermissionForAgencyRequest 请求对象
     * @return CompletableFuture<CheckProjectPermissionForAgencyResponse>
     */
    public CompletableFuture<CheckProjectPermissionForAgencyResponse> checkProjectPermissionForAgencyAsync(
        CheckProjectPermissionForAgencyRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.checkProjectPermissionForAgency);
    }

    /**
     * 查询委托是否拥有项目服务权限
     *
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询委托是否拥有项目服务权限。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckProjectPermissionForAgencyRequest 请求对象
     * @return AsyncInvoker<CheckProjectPermissionForAgencyRequest, CheckProjectPermissionForAgencyResponse>
     */
    public AsyncInvoker<CheckProjectPermissionForAgencyRequest, CheckProjectPermissionForAgencyResponse> checkProjectPermissionForAgencyAsyncInvoker(
        CheckProjectPermissionForAgencyRequest request) {
        return new AsyncInvoker<>(request, IamMeta.checkProjectPermissionForAgency, hcClient);
    }

    /**
     * 创建委托
     *
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)创建委托。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAgencyRequest 请求对象
     * @return CompletableFuture<CreateAgencyResponse>
     */
    public CompletableFuture<CreateAgencyResponse> createAgencyAsync(CreateAgencyRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.createAgency);
    }

    /**
     * 创建委托
     *
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)创建委托。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAgencyRequest 请求对象
     * @return AsyncInvoker<CreateAgencyRequest, CreateAgencyResponse>
     */
    public AsyncInvoker<CreateAgencyRequest, CreateAgencyResponse> createAgencyAsyncInvoker(
        CreateAgencyRequest request) {
        return new AsyncInvoker<>(request, IamMeta.createAgency, hcClient);
    }

    /**
     * 创建委托自定义策略
     *
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)创建委托自定义策略。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAgencyCustomPolicyRequest 请求对象
     * @return CompletableFuture<CreateAgencyCustomPolicyResponse>
     */
    public CompletableFuture<CreateAgencyCustomPolicyResponse> createAgencyCustomPolicyAsync(
        CreateAgencyCustomPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.createAgencyCustomPolicy);
    }

    /**
     * 创建委托自定义策略
     *
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)创建委托自定义策略。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAgencyCustomPolicyRequest 请求对象
     * @return AsyncInvoker<CreateAgencyCustomPolicyRequest, CreateAgencyCustomPolicyResponse>
     */
    public AsyncInvoker<CreateAgencyCustomPolicyRequest, CreateAgencyCustomPolicyResponse> createAgencyCustomPolicyAsyncInvoker(
        CreateAgencyCustomPolicyRequest request) {
        return new AsyncInvoker<>(request, IamMeta.createAgencyCustomPolicy, hcClient);
    }

    /**
     * 绑定MFA设备
     *
     * 该接口可以用于绑定MFA设备。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateBindingDeviceRequest 请求对象
     * @return CompletableFuture<CreateBindingDeviceResponse>
     */
    public CompletableFuture<CreateBindingDeviceResponse> createBindingDeviceAsync(CreateBindingDeviceRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.createBindingDevice);
    }

    /**
     * 绑定MFA设备
     *
     * 该接口可以用于绑定MFA设备。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateBindingDeviceRequest 请求对象
     * @return AsyncInvoker<CreateBindingDeviceRequest, CreateBindingDeviceResponse>
     */
    public AsyncInvoker<CreateBindingDeviceRequest, CreateBindingDeviceResponse> createBindingDeviceAsyncInvoker(
        CreateBindingDeviceRequest request) {
        return new AsyncInvoker<>(request, IamMeta.createBindingDevice, hcClient);
    }

    /**
     * 创建云服务自定义策略
     *
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)创建云服务自定义策略。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCloudServiceCustomPolicyRequest 请求对象
     * @return CompletableFuture<CreateCloudServiceCustomPolicyResponse>
     */
    public CompletableFuture<CreateCloudServiceCustomPolicyResponse> createCloudServiceCustomPolicyAsync(
        CreateCloudServiceCustomPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.createCloudServiceCustomPolicy);
    }

    /**
     * 创建云服务自定义策略
     *
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)创建云服务自定义策略。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCloudServiceCustomPolicyRequest 请求对象
     * @return AsyncInvoker<CreateCloudServiceCustomPolicyRequest, CreateCloudServiceCustomPolicyResponse>
     */
    public AsyncInvoker<CreateCloudServiceCustomPolicyRequest, CreateCloudServiceCustomPolicyResponse> createCloudServiceCustomPolicyAsyncInvoker(
        CreateCloudServiceCustomPolicyRequest request) {
        return new AsyncInvoker<>(request, IamMeta.createCloudServiceCustomPolicy, hcClient);
    }

    /**
     * 获取自定义代理登录票据
     *
     * 该接口用于用于获取自定义代理登录票据logintoken。logintoken是系统颁发给自定义代理用户的登录票据，承载用户的身份、session等信息。调用自定义代理URL登录云服务控制台时，可以使用本接口获取的logintoken进行认证。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * &gt; - logintoken的有效期为10分钟。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateLoginTokenRequest 请求对象
     * @return CompletableFuture<CreateLoginTokenResponse>
     */
    public CompletableFuture<CreateLoginTokenResponse> createLoginTokenAsync(CreateLoginTokenRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.createLoginToken);
    }

    /**
     * 获取自定义代理登录票据
     *
     * 该接口用于用于获取自定义代理登录票据logintoken。logintoken是系统颁发给自定义代理用户的登录票据，承载用户的身份、session等信息。调用自定义代理URL登录云服务控制台时，可以使用本接口获取的logintoken进行认证。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * &gt; - logintoken的有效期为10分钟。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateLoginTokenRequest 请求对象
     * @return AsyncInvoker<CreateLoginTokenRequest, CreateLoginTokenResponse>
     */
    public AsyncInvoker<CreateLoginTokenRequest, CreateLoginTokenResponse> createLoginTokenAsyncInvoker(
        CreateLoginTokenRequest request) {
        return new AsyncInvoker<>(request, IamMeta.createLoginToken, hcClient);
    }

    /**
     * 导入Metadata文件
     *
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)导入Metadata文件。
     * 
     * 账号在使用联邦认证功能前，需要先将Metadata文件导入到IAM中。Metadata文件是SAML 2.0协议约定的接口文件，包含访问接口地址和证书信息，请找企业管理员获取企业IdP的Metadata文件。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateMetadataRequest 请求对象
     * @return CompletableFuture<CreateMetadataResponse>
     */
    public CompletableFuture<CreateMetadataResponse> createMetadataAsync(CreateMetadataRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.createMetadata);
    }

    /**
     * 导入Metadata文件
     *
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)导入Metadata文件。
     * 
     * 账号在使用联邦认证功能前，需要先将Metadata文件导入到IAM中。Metadata文件是SAML 2.0协议约定的接口文件，包含访问接口地址和证书信息，请找企业管理员获取企业IdP的Metadata文件。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateMetadataRequest 请求对象
     * @return AsyncInvoker<CreateMetadataRequest, CreateMetadataResponse>
     */
    public AsyncInvoker<CreateMetadataRequest, CreateMetadataResponse> createMetadataAsyncInvoker(
        CreateMetadataRequest request) {
        return new AsyncInvoker<>(request, IamMeta.createMetadata, hcClient);
    }

    /**
     * 创建MFA设备
     *
     * 该接口可以用于创建MFA设备。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateMfaDeviceRequest 请求对象
     * @return CompletableFuture<CreateMfaDeviceResponse>
     */
    public CompletableFuture<CreateMfaDeviceResponse> createMfaDeviceAsync(CreateMfaDeviceRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.createMfaDevice);
    }

    /**
     * 创建MFA设备
     *
     * 该接口可以用于创建MFA设备。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateMfaDeviceRequest 请求对象
     * @return AsyncInvoker<CreateMfaDeviceRequest, CreateMfaDeviceResponse>
     */
    public AsyncInvoker<CreateMfaDeviceRequest, CreateMfaDeviceResponse> createMfaDeviceAsyncInvoker(
        CreateMfaDeviceRequest request) {
        return new AsyncInvoker<>(request, IamMeta.createMfaDevice, hcClient);
    }

    /**
     * 创建OpenId Connect身份提供商配置
     *
     * 创建OpenId Connect身份提供商配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateOpenIdConnectConfigRequest 请求对象
     * @return CompletableFuture<CreateOpenIdConnectConfigResponse>
     */
    public CompletableFuture<CreateOpenIdConnectConfigResponse> createOpenIdConnectConfigAsync(
        CreateOpenIdConnectConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.createOpenIdConnectConfig);
    }

    /**
     * 创建OpenId Connect身份提供商配置
     *
     * 创建OpenId Connect身份提供商配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateOpenIdConnectConfigRequest 请求对象
     * @return AsyncInvoker<CreateOpenIdConnectConfigRequest, CreateOpenIdConnectConfigResponse>
     */
    public AsyncInvoker<CreateOpenIdConnectConfigRequest, CreateOpenIdConnectConfigResponse> createOpenIdConnectConfigAsyncInvoker(
        CreateOpenIdConnectConfigRequest request) {
        return new AsyncInvoker<>(request, IamMeta.createOpenIdConnectConfig, hcClient);
    }

    /**
     * 获取联邦认证token(OpenId Connect Id token方式)
     *
     * 获取联邦认证token(OpenId Connect Id token方式)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTokenWithIdTokenRequest 请求对象
     * @return CompletableFuture<CreateTokenWithIdTokenResponse>
     */
    public CompletableFuture<CreateTokenWithIdTokenResponse> createTokenWithIdTokenAsync(
        CreateTokenWithIdTokenRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.createTokenWithIdToken);
    }

    /**
     * 获取联邦认证token(OpenId Connect Id token方式)
     *
     * 获取联邦认证token(OpenId Connect Id token方式)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTokenWithIdTokenRequest 请求对象
     * @return AsyncInvoker<CreateTokenWithIdTokenRequest, CreateTokenWithIdTokenResponse>
     */
    public AsyncInvoker<CreateTokenWithIdTokenRequest, CreateTokenWithIdTokenResponse> createTokenWithIdTokenAsyncInvoker(
        CreateTokenWithIdTokenRequest request) {
        return new AsyncInvoker<>(request, IamMeta.createTokenWithIdToken, hcClient);
    }

    /**
     * 获取联邦认证unscoped token(OpenId Connect Id token方式)
     *
     * 获取联邦认证token(OpenId Connect Id token方式)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateUnscopedTokenWithIdTokenRequest 请求对象
     * @return CompletableFuture<CreateUnscopedTokenWithIdTokenResponse>
     */
    public CompletableFuture<CreateUnscopedTokenWithIdTokenResponse> createUnscopedTokenWithIdTokenAsync(
        CreateUnscopedTokenWithIdTokenRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.createUnscopedTokenWithIdToken);
    }

    /**
     * 获取联邦认证unscoped token(OpenId Connect Id token方式)
     *
     * 获取联邦认证token(OpenId Connect Id token方式)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateUnscopedTokenWithIdTokenRequest 请求对象
     * @return AsyncInvoker<CreateUnscopedTokenWithIdTokenRequest, CreateUnscopedTokenWithIdTokenResponse>
     */
    public AsyncInvoker<CreateUnscopedTokenWithIdTokenRequest, CreateUnscopedTokenWithIdTokenResponse> createUnscopedTokenWithIdTokenAsyncInvoker(
        CreateUnscopedTokenWithIdTokenRequest request) {
        return new AsyncInvoker<>(request, IamMeta.createUnscopedTokenWithIdToken, hcClient);
    }

    /**
     * 删除委托
     *
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)删除委托。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAgencyRequest 请求对象
     * @return CompletableFuture<DeleteAgencyResponse>
     */
    public CompletableFuture<DeleteAgencyResponse> deleteAgencyAsync(DeleteAgencyRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.deleteAgency);
    }

    /**
     * 删除委托
     *
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)删除委托。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAgencyRequest 请求对象
     * @return AsyncInvoker<DeleteAgencyRequest, DeleteAgencyResponse>
     */
    public AsyncInvoker<DeleteAgencyRequest, DeleteAgencyResponse> deleteAgencyAsyncInvoker(
        DeleteAgencyRequest request) {
        return new AsyncInvoker<>(request, IamMeta.deleteAgency, hcClient);
    }

    /**
     * 解绑MFA设备
     *
     * 该接口可以用于解绑MFA设备
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteBindingDeviceRequest 请求对象
     * @return CompletableFuture<DeleteBindingDeviceResponse>
     */
    public CompletableFuture<DeleteBindingDeviceResponse> deleteBindingDeviceAsync(DeleteBindingDeviceRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.deleteBindingDevice);
    }

    /**
     * 解绑MFA设备
     *
     * 该接口可以用于解绑MFA设备
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteBindingDeviceRequest 请求对象
     * @return AsyncInvoker<DeleteBindingDeviceRequest, DeleteBindingDeviceResponse>
     */
    public AsyncInvoker<DeleteBindingDeviceRequest, DeleteBindingDeviceResponse> deleteBindingDeviceAsyncInvoker(
        DeleteBindingDeviceRequest request) {
        return new AsyncInvoker<>(request, IamMeta.deleteBindingDevice, hcClient);
    }

    /**
     * 删除自定义策略
     *
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)删除自定义策略。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteCustomPolicyRequest 请求对象
     * @return CompletableFuture<DeleteCustomPolicyResponse>
     */
    public CompletableFuture<DeleteCustomPolicyResponse> deleteCustomPolicyAsync(DeleteCustomPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.deleteCustomPolicy);
    }

    /**
     * 删除自定义策略
     *
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)删除自定义策略。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteCustomPolicyRequest 请求对象
     * @return AsyncInvoker<DeleteCustomPolicyRequest, DeleteCustomPolicyResponse>
     */
    public AsyncInvoker<DeleteCustomPolicyRequest, DeleteCustomPolicyResponse> deleteCustomPolicyAsyncInvoker(
        DeleteCustomPolicyRequest request) {
        return new AsyncInvoker<>(request, IamMeta.deleteCustomPolicy, hcClient);
    }

    /**
     * 移除用户组的所有项目服务权限
     *
     * 该接口可以用于移除用户组的所有项目服务权限。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDomainGroupInheritedRoleRequest 请求对象
     * @return CompletableFuture<DeleteDomainGroupInheritedRoleResponse>
     */
    public CompletableFuture<DeleteDomainGroupInheritedRoleResponse> deleteDomainGroupInheritedRoleAsync(
        DeleteDomainGroupInheritedRoleRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.deleteDomainGroupInheritedRole);
    }

    /**
     * 移除用户组的所有项目服务权限
     *
     * 该接口可以用于移除用户组的所有项目服务权限。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDomainGroupInheritedRoleRequest 请求对象
     * @return AsyncInvoker<DeleteDomainGroupInheritedRoleRequest, DeleteDomainGroupInheritedRoleResponse>
     */
    public AsyncInvoker<DeleteDomainGroupInheritedRoleRequest, DeleteDomainGroupInheritedRoleResponse> deleteDomainGroupInheritedRoleAsyncInvoker(
        DeleteDomainGroupInheritedRoleRequest request) {
        return new AsyncInvoker<>(request, IamMeta.deleteDomainGroupInheritedRole, hcClient);
    }

    /**
     * 删除MFA设备
     *
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)删除MFA设备。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteMfaDeviceRequest 请求对象
     * @return CompletableFuture<DeleteMfaDeviceResponse>
     */
    public CompletableFuture<DeleteMfaDeviceResponse> deleteMfaDeviceAsync(DeleteMfaDeviceRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.deleteMfaDevice);
    }

    /**
     * 删除MFA设备
     *
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)删除MFA设备。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteMfaDeviceRequest 请求对象
     * @return AsyncInvoker<DeleteMfaDeviceRequest, DeleteMfaDeviceResponse>
     */
    public AsyncInvoker<DeleteMfaDeviceRequest, DeleteMfaDeviceResponse> deleteMfaDeviceAsyncInvoker(
        DeleteMfaDeviceRequest request) {
        return new AsyncInvoker<>(request, IamMeta.deleteMfaDevice, hcClient);
    }

    /**
     * 添加IAM用户到用户组
     *
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)添加IAM用户到用户组。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request KeystoneAddUserToGroupRequest 请求对象
     * @return CompletableFuture<KeystoneAddUserToGroupResponse>
     */
    public CompletableFuture<KeystoneAddUserToGroupResponse> keystoneAddUserToGroupAsync(
        KeystoneAddUserToGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.keystoneAddUserToGroup);
    }

    /**
     * 添加IAM用户到用户组
     *
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)添加IAM用户到用户组。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request KeystoneAddUserToGroupRequest 请求对象
     * @return AsyncInvoker<KeystoneAddUserToGroupRequest, KeystoneAddUserToGroupResponse>
     */
    public AsyncInvoker<KeystoneAddUserToGroupRequest, KeystoneAddUserToGroupResponse> keystoneAddUserToGroupAsyncInvoker(
        KeystoneAddUserToGroupRequest request) {
        return new AsyncInvoker<>(request, IamMeta.keystoneAddUserToGroup, hcClient);
    }

    /**
     * 为用户组授予全局服务权限
     *
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)为用户组授予全局服务权限。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request KeystoneAssociateGroupWithDomainPermissionRequest 请求对象
     * @return CompletableFuture<KeystoneAssociateGroupWithDomainPermissionResponse>
     */
    public CompletableFuture<KeystoneAssociateGroupWithDomainPermissionResponse> keystoneAssociateGroupWithDomainPermissionAsync(
        KeystoneAssociateGroupWithDomainPermissionRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.keystoneAssociateGroupWithDomainPermission);
    }

    /**
     * 为用户组授予全局服务权限
     *
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)为用户组授予全局服务权限。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request KeystoneAssociateGroupWithDomainPermissionRequest 请求对象
     * @return AsyncInvoker<KeystoneAssociateGroupWithDomainPermissionRequest, KeystoneAssociateGroupWithDomainPermissionResponse>
     */
    public AsyncInvoker<KeystoneAssociateGroupWithDomainPermissionRequest, KeystoneAssociateGroupWithDomainPermissionResponse> keystoneAssociateGroupWithDomainPermissionAsyncInvoker(
        KeystoneAssociateGroupWithDomainPermissionRequest request) {
        return new AsyncInvoker<>(request, IamMeta.keystoneAssociateGroupWithDomainPermission, hcClient);
    }

    /**
     * 为用户组授予项目服务权限
     *
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)为用户组授予项目服务权限。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request KeystoneAssociateGroupWithProjectPermissionRequest 请求对象
     * @return CompletableFuture<KeystoneAssociateGroupWithProjectPermissionResponse>
     */
    public CompletableFuture<KeystoneAssociateGroupWithProjectPermissionResponse> keystoneAssociateGroupWithProjectPermissionAsync(
        KeystoneAssociateGroupWithProjectPermissionRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.keystoneAssociateGroupWithProjectPermission);
    }

    /**
     * 为用户组授予项目服务权限
     *
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)为用户组授予项目服务权限。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request KeystoneAssociateGroupWithProjectPermissionRequest 请求对象
     * @return AsyncInvoker<KeystoneAssociateGroupWithProjectPermissionRequest, KeystoneAssociateGroupWithProjectPermissionResponse>
     */
    public AsyncInvoker<KeystoneAssociateGroupWithProjectPermissionRequest, KeystoneAssociateGroupWithProjectPermissionResponse> keystoneAssociateGroupWithProjectPermissionAsyncInvoker(
        KeystoneAssociateGroupWithProjectPermissionRequest request) {
        return new AsyncInvoker<>(request, IamMeta.keystoneAssociateGroupWithProjectPermission, hcClient);
    }

    /**
     * 查询用户组是否拥有全局服务权限
     *
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询用户组是否拥有全局服务权限。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request KeystoneCheckDomainPermissionForGroupRequest 请求对象
     * @return CompletableFuture<KeystoneCheckDomainPermissionForGroupResponse>
     */
    public CompletableFuture<KeystoneCheckDomainPermissionForGroupResponse> keystoneCheckDomainPermissionForGroupAsync(
        KeystoneCheckDomainPermissionForGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.keystoneCheckDomainPermissionForGroup);
    }

    /**
     * 查询用户组是否拥有全局服务权限
     *
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询用户组是否拥有全局服务权限。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request KeystoneCheckDomainPermissionForGroupRequest 请求对象
     * @return AsyncInvoker<KeystoneCheckDomainPermissionForGroupRequest, KeystoneCheckDomainPermissionForGroupResponse>
     */
    public AsyncInvoker<KeystoneCheckDomainPermissionForGroupRequest, KeystoneCheckDomainPermissionForGroupResponse> keystoneCheckDomainPermissionForGroupAsyncInvoker(
        KeystoneCheckDomainPermissionForGroupRequest request) {
        return new AsyncInvoker<>(request, IamMeta.keystoneCheckDomainPermissionForGroup, hcClient);
    }

    /**
     * 查询用户组是否拥有项目服务权限
     *
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询用户组是否拥有项目服务权限。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request KeystoneCheckProjectPermissionForGroupRequest 请求对象
     * @return CompletableFuture<KeystoneCheckProjectPermissionForGroupResponse>
     */
    public CompletableFuture<KeystoneCheckProjectPermissionForGroupResponse> keystoneCheckProjectPermissionForGroupAsync(
        KeystoneCheckProjectPermissionForGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.keystoneCheckProjectPermissionForGroup);
    }

    /**
     * 查询用户组是否拥有项目服务权限
     *
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询用户组是否拥有项目服务权限。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request KeystoneCheckProjectPermissionForGroupRequest 请求对象
     * @return AsyncInvoker<KeystoneCheckProjectPermissionForGroupRequest, KeystoneCheckProjectPermissionForGroupResponse>
     */
    public AsyncInvoker<KeystoneCheckProjectPermissionForGroupRequest, KeystoneCheckProjectPermissionForGroupResponse> keystoneCheckProjectPermissionForGroupAsyncInvoker(
        KeystoneCheckProjectPermissionForGroupRequest request) {
        return new AsyncInvoker<>(request, IamMeta.keystoneCheckProjectPermissionForGroup, hcClient);
    }

    /**
     * 查询IAM用户是否在用户组中
     *
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询IAM用户是否在用户组中。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request KeystoneCheckUserInGroupRequest 请求对象
     * @return CompletableFuture<KeystoneCheckUserInGroupResponse>
     */
    public CompletableFuture<KeystoneCheckUserInGroupResponse> keystoneCheckUserInGroupAsync(
        KeystoneCheckUserInGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.keystoneCheckUserInGroup);
    }

    /**
     * 查询IAM用户是否在用户组中
     *
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询IAM用户是否在用户组中。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request KeystoneCheckUserInGroupRequest 请求对象
     * @return AsyncInvoker<KeystoneCheckUserInGroupRequest, KeystoneCheckUserInGroupResponse>
     */
    public AsyncInvoker<KeystoneCheckUserInGroupRequest, KeystoneCheckUserInGroupResponse> keystoneCheckUserInGroupAsyncInvoker(
        KeystoneCheckUserInGroupRequest request) {
        return new AsyncInvoker<>(request, IamMeta.keystoneCheckUserInGroup, hcClient);
    }

    /**
     * 查询用户组是否拥有所有项目指定权限
     *
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询用户组是否拥有所有项目指定权限。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request KeystoneCheckroleForGroupRequest 请求对象
     * @return CompletableFuture<KeystoneCheckroleForGroupResponse>
     */
    public CompletableFuture<KeystoneCheckroleForGroupResponse> keystoneCheckroleForGroupAsync(
        KeystoneCheckroleForGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.keystoneCheckroleForGroup);
    }

    /**
     * 查询用户组是否拥有所有项目指定权限
     *
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询用户组是否拥有所有项目指定权限。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request KeystoneCheckroleForGroupRequest 请求对象
     * @return AsyncInvoker<KeystoneCheckroleForGroupRequest, KeystoneCheckroleForGroupResponse>
     */
    public AsyncInvoker<KeystoneCheckroleForGroupRequest, KeystoneCheckroleForGroupResponse> keystoneCheckroleForGroupAsyncInvoker(
        KeystoneCheckroleForGroupRequest request) {
        return new AsyncInvoker<>(request, IamMeta.keystoneCheckroleForGroup, hcClient);
    }

    /**
     * 创建用户组
     *
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)创建用户组。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request KeystoneCreateGroupRequest 请求对象
     * @return CompletableFuture<KeystoneCreateGroupResponse>
     */
    public CompletableFuture<KeystoneCreateGroupResponse> keystoneCreateGroupAsync(KeystoneCreateGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.keystoneCreateGroup);
    }

    /**
     * 创建用户组
     *
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)创建用户组。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request KeystoneCreateGroupRequest 请求对象
     * @return AsyncInvoker<KeystoneCreateGroupRequest, KeystoneCreateGroupResponse>
     */
    public AsyncInvoker<KeystoneCreateGroupRequest, KeystoneCreateGroupResponse> keystoneCreateGroupAsyncInvoker(
        KeystoneCreateGroupRequest request) {
        return new AsyncInvoker<>(request, IamMeta.keystoneCreateGroup, hcClient);
    }

    /**
     * 注册身份提供商
     *
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)注册身份提供商。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request KeystoneCreateIdentityProviderRequest 请求对象
     * @return CompletableFuture<KeystoneCreateIdentityProviderResponse>
     */
    public CompletableFuture<KeystoneCreateIdentityProviderResponse> keystoneCreateIdentityProviderAsync(
        KeystoneCreateIdentityProviderRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.keystoneCreateIdentityProvider);
    }

    /**
     * 注册身份提供商
     *
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)注册身份提供商。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request KeystoneCreateIdentityProviderRequest 请求对象
     * @return AsyncInvoker<KeystoneCreateIdentityProviderRequest, KeystoneCreateIdentityProviderResponse>
     */
    public AsyncInvoker<KeystoneCreateIdentityProviderRequest, KeystoneCreateIdentityProviderResponse> keystoneCreateIdentityProviderAsyncInvoker(
        KeystoneCreateIdentityProviderRequest request) {
        return new AsyncInvoker<>(request, IamMeta.keystoneCreateIdentityProvider, hcClient);
    }

    /**
     * 注册映射
     *
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)注册映射。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request KeystoneCreateMappingRequest 请求对象
     * @return CompletableFuture<KeystoneCreateMappingResponse>
     */
    public CompletableFuture<KeystoneCreateMappingResponse> keystoneCreateMappingAsync(
        KeystoneCreateMappingRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.keystoneCreateMapping);
    }

    /**
     * 注册映射
     *
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)注册映射。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request KeystoneCreateMappingRequest 请求对象
     * @return AsyncInvoker<KeystoneCreateMappingRequest, KeystoneCreateMappingResponse>
     */
    public AsyncInvoker<KeystoneCreateMappingRequest, KeystoneCreateMappingResponse> keystoneCreateMappingAsyncInvoker(
        KeystoneCreateMappingRequest request) {
        return new AsyncInvoker<>(request, IamMeta.keystoneCreateMapping, hcClient);
    }

    /**
     * 创建项目
     *
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)创建项目。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request KeystoneCreateProjectRequest 请求对象
     * @return CompletableFuture<KeystoneCreateProjectResponse>
     */
    public CompletableFuture<KeystoneCreateProjectResponse> keystoneCreateProjectAsync(
        KeystoneCreateProjectRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.keystoneCreateProject);
    }

    /**
     * 创建项目
     *
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)创建项目。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request KeystoneCreateProjectRequest 请求对象
     * @return AsyncInvoker<KeystoneCreateProjectRequest, KeystoneCreateProjectResponse>
     */
    public AsyncInvoker<KeystoneCreateProjectRequest, KeystoneCreateProjectResponse> keystoneCreateProjectAsyncInvoker(
        KeystoneCreateProjectRequest request) {
        return new AsyncInvoker<>(request, IamMeta.keystoneCreateProject, hcClient);
    }

    /**
     * 注册协议
     *
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)注册协议（将协议关联到某一身份提供商）。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request KeystoneCreateProtocolRequest 请求对象
     * @return CompletableFuture<KeystoneCreateProtocolResponse>
     */
    public CompletableFuture<KeystoneCreateProtocolResponse> keystoneCreateProtocolAsync(
        KeystoneCreateProtocolRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.keystoneCreateProtocol);
    }

    /**
     * 注册协议
     *
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)注册协议（将协议关联到某一身份提供商）。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request KeystoneCreateProtocolRequest 请求对象
     * @return AsyncInvoker<KeystoneCreateProtocolRequest, KeystoneCreateProtocolResponse>
     */
    public AsyncInvoker<KeystoneCreateProtocolRequest, KeystoneCreateProtocolResponse> keystoneCreateProtocolAsyncInvoker(
        KeystoneCreateProtocolRequest request) {
        return new AsyncInvoker<>(request, IamMeta.keystoneCreateProtocol, hcClient);
    }

    /**
     * 获取联邦认证scoped token
     *
     * 该接口可以用于通过联邦认证方式获取scoped token。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request KeystoneCreateScopedTokenRequest 请求对象
     * @return CompletableFuture<KeystoneCreateScopedTokenResponse>
     */
    public CompletableFuture<KeystoneCreateScopedTokenResponse> keystoneCreateScopedTokenAsync(
        KeystoneCreateScopedTokenRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.keystoneCreateScopedToken);
    }

    /**
     * 获取联邦认证scoped token
     *
     * 该接口可以用于通过联邦认证方式获取scoped token。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request KeystoneCreateScopedTokenRequest 请求对象
     * @return AsyncInvoker<KeystoneCreateScopedTokenRequest, KeystoneCreateScopedTokenResponse>
     */
    public AsyncInvoker<KeystoneCreateScopedTokenRequest, KeystoneCreateScopedTokenResponse> keystoneCreateScopedTokenAsyncInvoker(
        KeystoneCreateScopedTokenRequest request) {
        return new AsyncInvoker<>(request, IamMeta.keystoneCreateScopedToken, hcClient);
    }

    /**
     * 删除用户组
     *
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)删除用户组。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request KeystoneDeleteGroupRequest 请求对象
     * @return CompletableFuture<KeystoneDeleteGroupResponse>
     */
    public CompletableFuture<KeystoneDeleteGroupResponse> keystoneDeleteGroupAsync(KeystoneDeleteGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.keystoneDeleteGroup);
    }

    /**
     * 删除用户组
     *
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)删除用户组。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request KeystoneDeleteGroupRequest 请求对象
     * @return AsyncInvoker<KeystoneDeleteGroupRequest, KeystoneDeleteGroupResponse>
     */
    public AsyncInvoker<KeystoneDeleteGroupRequest, KeystoneDeleteGroupResponse> keystoneDeleteGroupAsyncInvoker(
        KeystoneDeleteGroupRequest request) {
        return new AsyncInvoker<>(request, IamMeta.keystoneDeleteGroup, hcClient);
    }

    /**
     * 删除身份提供商
     *
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html) 删除身份提供商。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request KeystoneDeleteIdentityProviderRequest 请求对象
     * @return CompletableFuture<KeystoneDeleteIdentityProviderResponse>
     */
    public CompletableFuture<KeystoneDeleteIdentityProviderResponse> keystoneDeleteIdentityProviderAsync(
        KeystoneDeleteIdentityProviderRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.keystoneDeleteIdentityProvider);
    }

    /**
     * 删除身份提供商
     *
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html) 删除身份提供商。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request KeystoneDeleteIdentityProviderRequest 请求对象
     * @return AsyncInvoker<KeystoneDeleteIdentityProviderRequest, KeystoneDeleteIdentityProviderResponse>
     */
    public AsyncInvoker<KeystoneDeleteIdentityProviderRequest, KeystoneDeleteIdentityProviderResponse> keystoneDeleteIdentityProviderAsyncInvoker(
        KeystoneDeleteIdentityProviderRequest request) {
        return new AsyncInvoker<>(request, IamMeta.keystoneDeleteIdentityProvider, hcClient);
    }

    /**
     * 删除映射
     *
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)删除映射。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request KeystoneDeleteMappingRequest 请求对象
     * @return CompletableFuture<KeystoneDeleteMappingResponse>
     */
    public CompletableFuture<KeystoneDeleteMappingResponse> keystoneDeleteMappingAsync(
        KeystoneDeleteMappingRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.keystoneDeleteMapping);
    }

    /**
     * 删除映射
     *
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)删除映射。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request KeystoneDeleteMappingRequest 请求对象
     * @return AsyncInvoker<KeystoneDeleteMappingRequest, KeystoneDeleteMappingResponse>
     */
    public AsyncInvoker<KeystoneDeleteMappingRequest, KeystoneDeleteMappingResponse> keystoneDeleteMappingAsyncInvoker(
        KeystoneDeleteMappingRequest request) {
        return new AsyncInvoker<>(request, IamMeta.keystoneDeleteMapping, hcClient);
    }

    /**
     * 删除协议
     *
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)删除协议。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request KeystoneDeleteProtocolRequest 请求对象
     * @return CompletableFuture<KeystoneDeleteProtocolResponse>
     */
    public CompletableFuture<KeystoneDeleteProtocolResponse> keystoneDeleteProtocolAsync(
        KeystoneDeleteProtocolRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.keystoneDeleteProtocol);
    }

    /**
     * 删除协议
     *
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)删除协议。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request KeystoneDeleteProtocolRequest 请求对象
     * @return AsyncInvoker<KeystoneDeleteProtocolRequest, KeystoneDeleteProtocolResponse>
     */
    public AsyncInvoker<KeystoneDeleteProtocolRequest, KeystoneDeleteProtocolResponse> keystoneDeleteProtocolAsyncInvoker(
        KeystoneDeleteProtocolRequest request) {
        return new AsyncInvoker<>(request, IamMeta.keystoneDeleteProtocol, hcClient);
    }

    /**
     * 查询用户组的所有项目权限列表
     *
     * 该接口可以用于管理员查询用户组所有项目服务权限列表。 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request KeystoneListAllProjectPermissionsForGroupRequest 请求对象
     * @return CompletableFuture<KeystoneListAllProjectPermissionsForGroupResponse>
     */
    public CompletableFuture<KeystoneListAllProjectPermissionsForGroupResponse> keystoneListAllProjectPermissionsForGroupAsync(
        KeystoneListAllProjectPermissionsForGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.keystoneListAllProjectPermissionsForGroup);
    }

    /**
     * 查询用户组的所有项目权限列表
     *
     * 该接口可以用于管理员查询用户组所有项目服务权限列表。 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request KeystoneListAllProjectPermissionsForGroupRequest 请求对象
     * @return AsyncInvoker<KeystoneListAllProjectPermissionsForGroupRequest, KeystoneListAllProjectPermissionsForGroupResponse>
     */
    public AsyncInvoker<KeystoneListAllProjectPermissionsForGroupRequest, KeystoneListAllProjectPermissionsForGroupResponse> keystoneListAllProjectPermissionsForGroupAsyncInvoker(
        KeystoneListAllProjectPermissionsForGroupRequest request) {
        return new AsyncInvoker<>(request, IamMeta.keystoneListAllProjectPermissionsForGroup, hcClient);
    }

    /**
     * 查询IAM用户可以访问的账号详情
     *
     * 该接口可以用于查询IAM用户可以用访问的账号详情。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request KeystoneListAuthDomainsRequest 请求对象
     * @return CompletableFuture<KeystoneListAuthDomainsResponse>
     */
    public CompletableFuture<KeystoneListAuthDomainsResponse> keystoneListAuthDomainsAsync(
        KeystoneListAuthDomainsRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.keystoneListAuthDomains);
    }

    /**
     * 查询IAM用户可以访问的账号详情
     *
     * 该接口可以用于查询IAM用户可以用访问的账号详情。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request KeystoneListAuthDomainsRequest 请求对象
     * @return AsyncInvoker<KeystoneListAuthDomainsRequest, KeystoneListAuthDomainsResponse>
     */
    public AsyncInvoker<KeystoneListAuthDomainsRequest, KeystoneListAuthDomainsResponse> keystoneListAuthDomainsAsyncInvoker(
        KeystoneListAuthDomainsRequest request) {
        return new AsyncInvoker<>(request, IamMeta.keystoneListAuthDomains, hcClient);
    }

    /**
     * 查询IAM用户可以访问的项目列表
     *
     * 该接口可以用于查询IAM用户可以访问的项目列表。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request KeystoneListAuthProjectsRequest 请求对象
     * @return CompletableFuture<KeystoneListAuthProjectsResponse>
     */
    public CompletableFuture<KeystoneListAuthProjectsResponse> keystoneListAuthProjectsAsync(
        KeystoneListAuthProjectsRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.keystoneListAuthProjects);
    }

    /**
     * 查询IAM用户可以访问的项目列表
     *
     * 该接口可以用于查询IAM用户可以访问的项目列表。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request KeystoneListAuthProjectsRequest 请求对象
     * @return AsyncInvoker<KeystoneListAuthProjectsRequest, KeystoneListAuthProjectsResponse>
     */
    public AsyncInvoker<KeystoneListAuthProjectsRequest, KeystoneListAuthProjectsResponse> keystoneListAuthProjectsAsyncInvoker(
        KeystoneListAuthProjectsRequest request) {
        return new AsyncInvoker<>(request, IamMeta.keystoneListAuthProjects, hcClient);
    }

    /**
     * 查询全局服务中的用户组权限
     *
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询全局服务中的用户组权限。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request KeystoneListDomainPermissionsForGroupRequest 请求对象
     * @return CompletableFuture<KeystoneListDomainPermissionsForGroupResponse>
     */
    public CompletableFuture<KeystoneListDomainPermissionsForGroupResponse> keystoneListDomainPermissionsForGroupAsync(
        KeystoneListDomainPermissionsForGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.keystoneListDomainPermissionsForGroup);
    }

    /**
     * 查询全局服务中的用户组权限
     *
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询全局服务中的用户组权限。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request KeystoneListDomainPermissionsForGroupRequest 请求对象
     * @return AsyncInvoker<KeystoneListDomainPermissionsForGroupRequest, KeystoneListDomainPermissionsForGroupResponse>
     */
    public AsyncInvoker<KeystoneListDomainPermissionsForGroupRequest, KeystoneListDomainPermissionsForGroupResponse> keystoneListDomainPermissionsForGroupAsyncInvoker(
        KeystoneListDomainPermissionsForGroupRequest request) {
        return new AsyncInvoker<>(request, IamMeta.keystoneListDomainPermissionsForGroup, hcClient);
    }

    /**
     * 查询终端节点列表
     *
     * 该接口可以用于查询终端节点列表。终端节点用来提供服务访问入口。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request KeystoneListEndpointsRequest 请求对象
     * @return CompletableFuture<KeystoneListEndpointsResponse>
     */
    public CompletableFuture<KeystoneListEndpointsResponse> keystoneListEndpointsAsync(
        KeystoneListEndpointsRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.keystoneListEndpoints);
    }

    /**
     * 查询终端节点列表
     *
     * 该接口可以用于查询终端节点列表。终端节点用来提供服务访问入口。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request KeystoneListEndpointsRequest 请求对象
     * @return AsyncInvoker<KeystoneListEndpointsRequest, KeystoneListEndpointsResponse>
     */
    public AsyncInvoker<KeystoneListEndpointsRequest, KeystoneListEndpointsResponse> keystoneListEndpointsAsyncInvoker(
        KeystoneListEndpointsRequest request) {
        return new AsyncInvoker<>(request, IamMeta.keystoneListEndpoints, hcClient);
    }

    /**
     * 查询联邦用户可以访问的账号列表
     *
     * 该接口用于查询联邦用户可以访问的账号列表。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * &gt; - 推荐使用[查询IAM用户可以访问的账号详情](https://apiexplorer.developer.huaweicloud.com/apiexplorer/doc?product&#x3D;IAM&amp;api&#x3D;KeystoneQueryAccessibleDomainDetailsToUser)，该接口可以返回相同的响应格式。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request KeystoneListFederationDomainsRequest 请求对象
     * @return CompletableFuture<KeystoneListFederationDomainsResponse>
     */
    public CompletableFuture<KeystoneListFederationDomainsResponse> keystoneListFederationDomainsAsync(
        KeystoneListFederationDomainsRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.keystoneListFederationDomains);
    }

    /**
     * 查询联邦用户可以访问的账号列表
     *
     * 该接口用于查询联邦用户可以访问的账号列表。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * &gt; - 推荐使用[查询IAM用户可以访问的账号详情](https://apiexplorer.developer.huaweicloud.com/apiexplorer/doc?product&#x3D;IAM&amp;api&#x3D;KeystoneQueryAccessibleDomainDetailsToUser)，该接口可以返回相同的响应格式。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request KeystoneListFederationDomainsRequest 请求对象
     * @return AsyncInvoker<KeystoneListFederationDomainsRequest, KeystoneListFederationDomainsResponse>
     */
    public AsyncInvoker<KeystoneListFederationDomainsRequest, KeystoneListFederationDomainsResponse> keystoneListFederationDomainsAsyncInvoker(
        KeystoneListFederationDomainsRequest request) {
        return new AsyncInvoker<>(request, IamMeta.keystoneListFederationDomains, hcClient);
    }

    /**
     * 查询用户组列表
     *
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询用户组列表。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request KeystoneListGroupsRequest 请求对象
     * @return CompletableFuture<KeystoneListGroupsResponse>
     */
    public CompletableFuture<KeystoneListGroupsResponse> keystoneListGroupsAsync(KeystoneListGroupsRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.keystoneListGroups);
    }

    /**
     * 查询用户组列表
     *
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询用户组列表。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request KeystoneListGroupsRequest 请求对象
     * @return AsyncInvoker<KeystoneListGroupsRequest, KeystoneListGroupsResponse>
     */
    public AsyncInvoker<KeystoneListGroupsRequest, KeystoneListGroupsResponse> keystoneListGroupsAsyncInvoker(
        KeystoneListGroupsRequest request) {
        return new AsyncInvoker<>(request, IamMeta.keystoneListGroups, hcClient);
    }

    /**
     * 查询身份提供商列表
     *
     * 该接口可以用于查询身份提供商列表。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request KeystoneListIdentityProvidersRequest 请求对象
     * @return CompletableFuture<KeystoneListIdentityProvidersResponse>
     */
    public CompletableFuture<KeystoneListIdentityProvidersResponse> keystoneListIdentityProvidersAsync(
        KeystoneListIdentityProvidersRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.keystoneListIdentityProviders);
    }

    /**
     * 查询身份提供商列表
     *
     * 该接口可以用于查询身份提供商列表。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request KeystoneListIdentityProvidersRequest 请求对象
     * @return AsyncInvoker<KeystoneListIdentityProvidersRequest, KeystoneListIdentityProvidersResponse>
     */
    public AsyncInvoker<KeystoneListIdentityProvidersRequest, KeystoneListIdentityProvidersResponse> keystoneListIdentityProvidersAsyncInvoker(
        KeystoneListIdentityProvidersRequest request) {
        return new AsyncInvoker<>(request, IamMeta.keystoneListIdentityProviders, hcClient);
    }

    /**
     * 查询映射列表
     *
     * 该接口可以用于查询映射列表。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request KeystoneListMappingsRequest 请求对象
     * @return CompletableFuture<KeystoneListMappingsResponse>
     */
    public CompletableFuture<KeystoneListMappingsResponse> keystoneListMappingsAsync(
        KeystoneListMappingsRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.keystoneListMappings);
    }

    /**
     * 查询映射列表
     *
     * 该接口可以用于查询映射列表。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request KeystoneListMappingsRequest 请求对象
     * @return AsyncInvoker<KeystoneListMappingsRequest, KeystoneListMappingsResponse>
     */
    public AsyncInvoker<KeystoneListMappingsRequest, KeystoneListMappingsResponse> keystoneListMappingsAsyncInvoker(
        KeystoneListMappingsRequest request) {
        return new AsyncInvoker<>(request, IamMeta.keystoneListMappings, hcClient);
    }

    /**
     * 查询权限列表
     *
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询权限列表。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request KeystoneListPermissionsRequest 请求对象
     * @return CompletableFuture<KeystoneListPermissionsResponse>
     */
    public CompletableFuture<KeystoneListPermissionsResponse> keystoneListPermissionsAsync(
        KeystoneListPermissionsRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.keystoneListPermissions);
    }

    /**
     * 查询权限列表
     *
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询权限列表。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request KeystoneListPermissionsRequest 请求对象
     * @return AsyncInvoker<KeystoneListPermissionsRequest, KeystoneListPermissionsResponse>
     */
    public AsyncInvoker<KeystoneListPermissionsRequest, KeystoneListPermissionsResponse> keystoneListPermissionsAsyncInvoker(
        KeystoneListPermissionsRequest request) {
        return new AsyncInvoker<>(request, IamMeta.keystoneListPermissions, hcClient);
    }

    /**
     * 查询项目服务中的用户组权限
     *
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询项目服务中的用户组权限。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request KeystoneListProjectPermissionsForGroupRequest 请求对象
     * @return CompletableFuture<KeystoneListProjectPermissionsForGroupResponse>
     */
    public CompletableFuture<KeystoneListProjectPermissionsForGroupResponse> keystoneListProjectPermissionsForGroupAsync(
        KeystoneListProjectPermissionsForGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.keystoneListProjectPermissionsForGroup);
    }

    /**
     * 查询项目服务中的用户组权限
     *
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询项目服务中的用户组权限。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request KeystoneListProjectPermissionsForGroupRequest 请求对象
     * @return AsyncInvoker<KeystoneListProjectPermissionsForGroupRequest, KeystoneListProjectPermissionsForGroupResponse>
     */
    public AsyncInvoker<KeystoneListProjectPermissionsForGroupRequest, KeystoneListProjectPermissionsForGroupResponse> keystoneListProjectPermissionsForGroupAsyncInvoker(
        KeystoneListProjectPermissionsForGroupRequest request) {
        return new AsyncInvoker<>(request, IamMeta.keystoneListProjectPermissionsForGroup, hcClient);
    }

    /**
     * 查询指定条件下的项目列表
     *
     * 该接口可以用于查询指定条件下的项目列表。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request KeystoneListProjectsRequest 请求对象
     * @return CompletableFuture<KeystoneListProjectsResponse>
     */
    public CompletableFuture<KeystoneListProjectsResponse> keystoneListProjectsAsync(
        KeystoneListProjectsRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.keystoneListProjects);
    }

    /**
     * 查询指定条件下的项目列表
     *
     * 该接口可以用于查询指定条件下的项目列表。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request KeystoneListProjectsRequest 请求对象
     * @return AsyncInvoker<KeystoneListProjectsRequest, KeystoneListProjectsResponse>
     */
    public AsyncInvoker<KeystoneListProjectsRequest, KeystoneListProjectsResponse> keystoneListProjectsAsyncInvoker(
        KeystoneListProjectsRequest request) {
        return new AsyncInvoker<>(request, IamMeta.keystoneListProjects, hcClient);
    }

    /**
     * 查询指定IAM用户的项目列表
     *
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询指定IAM用户的项目列表，或IAM用户查询自己的项目列表。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request KeystoneListProjectsForUserRequest 请求对象
     * @return CompletableFuture<KeystoneListProjectsForUserResponse>
     */
    public CompletableFuture<KeystoneListProjectsForUserResponse> keystoneListProjectsForUserAsync(
        KeystoneListProjectsForUserRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.keystoneListProjectsForUser);
    }

    /**
     * 查询指定IAM用户的项目列表
     *
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询指定IAM用户的项目列表，或IAM用户查询自己的项目列表。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request KeystoneListProjectsForUserRequest 请求对象
     * @return AsyncInvoker<KeystoneListProjectsForUserRequest, KeystoneListProjectsForUserResponse>
     */
    public AsyncInvoker<KeystoneListProjectsForUserRequest, KeystoneListProjectsForUserResponse> keystoneListProjectsForUserAsyncInvoker(
        KeystoneListProjectsForUserRequest request) {
        return new AsyncInvoker<>(request, IamMeta.keystoneListProjectsForUser, hcClient);
    }

    /**
     * 查询协议列表
     *
     * 该接口可以用于查询协议列表。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request KeystoneListProtocolsRequest 请求对象
     * @return CompletableFuture<KeystoneListProtocolsResponse>
     */
    public CompletableFuture<KeystoneListProtocolsResponse> keystoneListProtocolsAsync(
        KeystoneListProtocolsRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.keystoneListProtocols);
    }

    /**
     * 查询协议列表
     *
     * 该接口可以用于查询协议列表。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request KeystoneListProtocolsRequest 请求对象
     * @return AsyncInvoker<KeystoneListProtocolsRequest, KeystoneListProtocolsResponse>
     */
    public AsyncInvoker<KeystoneListProtocolsRequest, KeystoneListProtocolsResponse> keystoneListProtocolsAsyncInvoker(
        KeystoneListProtocolsRequest request) {
        return new AsyncInvoker<>(request, IamMeta.keystoneListProtocols, hcClient);
    }

    /**
     * 查询区域列表
     *
     * 该接口可以用于查询区域列表。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request KeystoneListRegionsRequest 请求对象
     * @return CompletableFuture<KeystoneListRegionsResponse>
     */
    public CompletableFuture<KeystoneListRegionsResponse> keystoneListRegionsAsync(KeystoneListRegionsRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.keystoneListRegions);
    }

    /**
     * 查询区域列表
     *
     * 该接口可以用于查询区域列表。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request KeystoneListRegionsRequest 请求对象
     * @return AsyncInvoker<KeystoneListRegionsRequest, KeystoneListRegionsResponse>
     */
    public AsyncInvoker<KeystoneListRegionsRequest, KeystoneListRegionsResponse> keystoneListRegionsAsyncInvoker(
        KeystoneListRegionsRequest request) {
        return new AsyncInvoker<>(request, IamMeta.keystoneListRegions, hcClient);
    }

    /**
     * 查询服务列表
     *
     * 该接口可以用于查询服务列表。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request KeystoneListServicesRequest 请求对象
     * @return CompletableFuture<KeystoneListServicesResponse>
     */
    public CompletableFuture<KeystoneListServicesResponse> keystoneListServicesAsync(
        KeystoneListServicesRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.keystoneListServices);
    }

    /**
     * 查询服务列表
     *
     * 该接口可以用于查询服务列表。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request KeystoneListServicesRequest 请求对象
     * @return AsyncInvoker<KeystoneListServicesRequest, KeystoneListServicesResponse>
     */
    public AsyncInvoker<KeystoneListServicesRequest, KeystoneListServicesResponse> keystoneListServicesAsyncInvoker(
        KeystoneListServicesRequest request) {
        return new AsyncInvoker<>(request, IamMeta.keystoneListServices, hcClient);
    }

    /**
     * 查询版本信息列表
     *
     * 该接口用于查询Keystone API的版本信息。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request KeystoneListVersionsRequest 请求对象
     * @return CompletableFuture<KeystoneListVersionsResponse>
     */
    public CompletableFuture<KeystoneListVersionsResponse> keystoneListVersionsAsync(
        KeystoneListVersionsRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.keystoneListVersions);
    }

    /**
     * 查询版本信息列表
     *
     * 该接口用于查询Keystone API的版本信息。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request KeystoneListVersionsRequest 请求对象
     * @return AsyncInvoker<KeystoneListVersionsRequest, KeystoneListVersionsResponse>
     */
    public AsyncInvoker<KeystoneListVersionsRequest, KeystoneListVersionsResponse> keystoneListVersionsAsyncInvoker(
        KeystoneListVersionsRequest request) {
        return new AsyncInvoker<>(request, IamMeta.keystoneListVersions, hcClient);
    }

    /**
     * 移除用户组的全局服务权限
     *
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)移除用户组的全局服务权限。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request KeystoneRemoveDomainPermissionFromGroupRequest 请求对象
     * @return CompletableFuture<KeystoneRemoveDomainPermissionFromGroupResponse>
     */
    public CompletableFuture<KeystoneRemoveDomainPermissionFromGroupResponse> keystoneRemoveDomainPermissionFromGroupAsync(
        KeystoneRemoveDomainPermissionFromGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.keystoneRemoveDomainPermissionFromGroup);
    }

    /**
     * 移除用户组的全局服务权限
     *
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)移除用户组的全局服务权限。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request KeystoneRemoveDomainPermissionFromGroupRequest 请求对象
     * @return AsyncInvoker<KeystoneRemoveDomainPermissionFromGroupRequest, KeystoneRemoveDomainPermissionFromGroupResponse>
     */
    public AsyncInvoker<KeystoneRemoveDomainPermissionFromGroupRequest, KeystoneRemoveDomainPermissionFromGroupResponse> keystoneRemoveDomainPermissionFromGroupAsyncInvoker(
        KeystoneRemoveDomainPermissionFromGroupRequest request) {
        return new AsyncInvoker<>(request, IamMeta.keystoneRemoveDomainPermissionFromGroup, hcClient);
    }

    /**
     * 移除用户组的项目服务权限
     *
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)移除用户组的项目服务权限。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request KeystoneRemoveProjectPermissionFromGroupRequest 请求对象
     * @return CompletableFuture<KeystoneRemoveProjectPermissionFromGroupResponse>
     */
    public CompletableFuture<KeystoneRemoveProjectPermissionFromGroupResponse> keystoneRemoveProjectPermissionFromGroupAsync(
        KeystoneRemoveProjectPermissionFromGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.keystoneRemoveProjectPermissionFromGroup);
    }

    /**
     * 移除用户组的项目服务权限
     *
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)移除用户组的项目服务权限。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request KeystoneRemoveProjectPermissionFromGroupRequest 请求对象
     * @return AsyncInvoker<KeystoneRemoveProjectPermissionFromGroupRequest, KeystoneRemoveProjectPermissionFromGroupResponse>
     */
    public AsyncInvoker<KeystoneRemoveProjectPermissionFromGroupRequest, KeystoneRemoveProjectPermissionFromGroupResponse> keystoneRemoveProjectPermissionFromGroupAsyncInvoker(
        KeystoneRemoveProjectPermissionFromGroupRequest request) {
        return new AsyncInvoker<>(request, IamMeta.keystoneRemoveProjectPermissionFromGroup, hcClient);
    }

    /**
     * 移除用户组中的IAM用户
     *
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)移除用户组中的IAM用户。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request KeystoneRemoveUserFromGroupRequest 请求对象
     * @return CompletableFuture<KeystoneRemoveUserFromGroupResponse>
     */
    public CompletableFuture<KeystoneRemoveUserFromGroupResponse> keystoneRemoveUserFromGroupAsync(
        KeystoneRemoveUserFromGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.keystoneRemoveUserFromGroup);
    }

    /**
     * 移除用户组中的IAM用户
     *
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)移除用户组中的IAM用户。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request KeystoneRemoveUserFromGroupRequest 请求对象
     * @return AsyncInvoker<KeystoneRemoveUserFromGroupRequest, KeystoneRemoveUserFromGroupResponse>
     */
    public AsyncInvoker<KeystoneRemoveUserFromGroupRequest, KeystoneRemoveUserFromGroupResponse> keystoneRemoveUserFromGroupAsyncInvoker(
        KeystoneRemoveUserFromGroupRequest request) {
        return new AsyncInvoker<>(request, IamMeta.keystoneRemoveUserFromGroup, hcClient);
    }

    /**
     * 查询服务目录
     *
     * 该接口可以用于查询请求头中X-Auth-Token对应的服务目录。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request KeystoneShowCatalogRequest 请求对象
     * @return CompletableFuture<KeystoneShowCatalogResponse>
     */
    public CompletableFuture<KeystoneShowCatalogResponse> keystoneShowCatalogAsync(KeystoneShowCatalogRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.keystoneShowCatalog);
    }

    /**
     * 查询服务目录
     *
     * 该接口可以用于查询请求头中X-Auth-Token对应的服务目录。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request KeystoneShowCatalogRequest 请求对象
     * @return AsyncInvoker<KeystoneShowCatalogRequest, KeystoneShowCatalogResponse>
     */
    public AsyncInvoker<KeystoneShowCatalogRequest, KeystoneShowCatalogResponse> keystoneShowCatalogAsyncInvoker(
        KeystoneShowCatalogRequest request) {
        return new AsyncInvoker<>(request, IamMeta.keystoneShowCatalog, hcClient);
    }

    /**
     * 查询终端节点详情
     *
     * 该接口可以用于查询终端节点详情。终端节点用来提供服务访问入口。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request KeystoneShowEndpointRequest 请求对象
     * @return CompletableFuture<KeystoneShowEndpointResponse>
     */
    public CompletableFuture<KeystoneShowEndpointResponse> keystoneShowEndpointAsync(
        KeystoneShowEndpointRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.keystoneShowEndpoint);
    }

    /**
     * 查询终端节点详情
     *
     * 该接口可以用于查询终端节点详情。终端节点用来提供服务访问入口。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request KeystoneShowEndpointRequest 请求对象
     * @return AsyncInvoker<KeystoneShowEndpointRequest, KeystoneShowEndpointResponse>
     */
    public AsyncInvoker<KeystoneShowEndpointRequest, KeystoneShowEndpointResponse> keystoneShowEndpointAsyncInvoker(
        KeystoneShowEndpointRequest request) {
        return new AsyncInvoker<>(request, IamMeta.keystoneShowEndpoint, hcClient);
    }

    /**
     * 查询用户组详情
     *
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询用户组详情。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request KeystoneShowGroupRequest 请求对象
     * @return CompletableFuture<KeystoneShowGroupResponse>
     */
    public CompletableFuture<KeystoneShowGroupResponse> keystoneShowGroupAsync(KeystoneShowGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.keystoneShowGroup);
    }

    /**
     * 查询用户组详情
     *
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询用户组详情。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request KeystoneShowGroupRequest 请求对象
     * @return AsyncInvoker<KeystoneShowGroupRequest, KeystoneShowGroupResponse>
     */
    public AsyncInvoker<KeystoneShowGroupRequest, KeystoneShowGroupResponse> keystoneShowGroupAsyncInvoker(
        KeystoneShowGroupRequest request) {
        return new AsyncInvoker<>(request, IamMeta.keystoneShowGroup, hcClient);
    }

    /**
     * 查询身份提供商详情
     *
     * 该接口可以用于查询身份提供商详情。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request KeystoneShowIdentityProviderRequest 请求对象
     * @return CompletableFuture<KeystoneShowIdentityProviderResponse>
     */
    public CompletableFuture<KeystoneShowIdentityProviderResponse> keystoneShowIdentityProviderAsync(
        KeystoneShowIdentityProviderRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.keystoneShowIdentityProvider);
    }

    /**
     * 查询身份提供商详情
     *
     * 该接口可以用于查询身份提供商详情。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request KeystoneShowIdentityProviderRequest 请求对象
     * @return AsyncInvoker<KeystoneShowIdentityProviderRequest, KeystoneShowIdentityProviderResponse>
     */
    public AsyncInvoker<KeystoneShowIdentityProviderRequest, KeystoneShowIdentityProviderResponse> keystoneShowIdentityProviderAsyncInvoker(
        KeystoneShowIdentityProviderRequest request) {
        return new AsyncInvoker<>(request, IamMeta.keystoneShowIdentityProvider, hcClient);
    }

    /**
     * 查询映射详情
     *
     * 该接口可以用于查询映射详情。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request KeystoneShowMappingRequest 请求对象
     * @return CompletableFuture<KeystoneShowMappingResponse>
     */
    public CompletableFuture<KeystoneShowMappingResponse> keystoneShowMappingAsync(KeystoneShowMappingRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.keystoneShowMapping);
    }

    /**
     * 查询映射详情
     *
     * 该接口可以用于查询映射详情。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request KeystoneShowMappingRequest 请求对象
     * @return AsyncInvoker<KeystoneShowMappingRequest, KeystoneShowMappingResponse>
     */
    public AsyncInvoker<KeystoneShowMappingRequest, KeystoneShowMappingResponse> keystoneShowMappingAsyncInvoker(
        KeystoneShowMappingRequest request) {
        return new AsyncInvoker<>(request, IamMeta.keystoneShowMapping, hcClient);
    }

    /**
     * 查询权限详情
     *
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询权限详情。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request KeystoneShowPermissionRequest 请求对象
     * @return CompletableFuture<KeystoneShowPermissionResponse>
     */
    public CompletableFuture<KeystoneShowPermissionResponse> keystoneShowPermissionAsync(
        KeystoneShowPermissionRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.keystoneShowPermission);
    }

    /**
     * 查询权限详情
     *
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询权限详情。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request KeystoneShowPermissionRequest 请求对象
     * @return AsyncInvoker<KeystoneShowPermissionRequest, KeystoneShowPermissionResponse>
     */
    public AsyncInvoker<KeystoneShowPermissionRequest, KeystoneShowPermissionResponse> keystoneShowPermissionAsyncInvoker(
        KeystoneShowPermissionRequest request) {
        return new AsyncInvoker<>(request, IamMeta.keystoneShowPermission, hcClient);
    }

    /**
     * 查询项目详情
     *
     * 该接口可以用于查询项目详情。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request KeystoneShowProjectRequest 请求对象
     * @return CompletableFuture<KeystoneShowProjectResponse>
     */
    public CompletableFuture<KeystoneShowProjectResponse> keystoneShowProjectAsync(KeystoneShowProjectRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.keystoneShowProject);
    }

    /**
     * 查询项目详情
     *
     * 该接口可以用于查询项目详情。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request KeystoneShowProjectRequest 请求对象
     * @return AsyncInvoker<KeystoneShowProjectRequest, KeystoneShowProjectResponse>
     */
    public AsyncInvoker<KeystoneShowProjectRequest, KeystoneShowProjectResponse> keystoneShowProjectAsyncInvoker(
        KeystoneShowProjectRequest request) {
        return new AsyncInvoker<>(request, IamMeta.keystoneShowProject, hcClient);
    }

    /**
     * 查询协议详情
     *
     * 该接口可以用于查询协议详情。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request KeystoneShowProtocolRequest 请求对象
     * @return CompletableFuture<KeystoneShowProtocolResponse>
     */
    public CompletableFuture<KeystoneShowProtocolResponse> keystoneShowProtocolAsync(
        KeystoneShowProtocolRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.keystoneShowProtocol);
    }

    /**
     * 查询协议详情
     *
     * 该接口可以用于查询协议详情。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request KeystoneShowProtocolRequest 请求对象
     * @return AsyncInvoker<KeystoneShowProtocolRequest, KeystoneShowProtocolResponse>
     */
    public AsyncInvoker<KeystoneShowProtocolRequest, KeystoneShowProtocolResponse> keystoneShowProtocolAsyncInvoker(
        KeystoneShowProtocolRequest request) {
        return new AsyncInvoker<>(request, IamMeta.keystoneShowProtocol, hcClient);
    }

    /**
     * 查询区域详情
     *
     * 该接口可以用于查询区域详情。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request KeystoneShowRegionRequest 请求对象
     * @return CompletableFuture<KeystoneShowRegionResponse>
     */
    public CompletableFuture<KeystoneShowRegionResponse> keystoneShowRegionAsync(KeystoneShowRegionRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.keystoneShowRegion);
    }

    /**
     * 查询区域详情
     *
     * 该接口可以用于查询区域详情。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request KeystoneShowRegionRequest 请求对象
     * @return AsyncInvoker<KeystoneShowRegionRequest, KeystoneShowRegionResponse>
     */
    public AsyncInvoker<KeystoneShowRegionRequest, KeystoneShowRegionResponse> keystoneShowRegionAsyncInvoker(
        KeystoneShowRegionRequest request) {
        return new AsyncInvoker<>(request, IamMeta.keystoneShowRegion, hcClient);
    }

    /**
     * 查询账号密码强度策略
     *
     * 该接口可以用于查询账号密码强度策略，查询结果包括密码强度策略的正则表达式及其描述。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request KeystoneShowSecurityComplianceRequest 请求对象
     * @return CompletableFuture<KeystoneShowSecurityComplianceResponse>
     */
    public CompletableFuture<KeystoneShowSecurityComplianceResponse> keystoneShowSecurityComplianceAsync(
        KeystoneShowSecurityComplianceRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.keystoneShowSecurityCompliance);
    }

    /**
     * 查询账号密码强度策略
     *
     * 该接口可以用于查询账号密码强度策略，查询结果包括密码强度策略的正则表达式及其描述。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request KeystoneShowSecurityComplianceRequest 请求对象
     * @return AsyncInvoker<KeystoneShowSecurityComplianceRequest, KeystoneShowSecurityComplianceResponse>
     */
    public AsyncInvoker<KeystoneShowSecurityComplianceRequest, KeystoneShowSecurityComplianceResponse> keystoneShowSecurityComplianceAsyncInvoker(
        KeystoneShowSecurityComplianceRequest request) {
        return new AsyncInvoker<>(request, IamMeta.keystoneShowSecurityCompliance, hcClient);
    }

    /**
     * 按条件查询账号密码强度策略
     *
     * 该接口可以用于按条件查询账号密码强度策略，查询结果包括密码强度策略的正则表达式及其描述。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request KeystoneShowSecurityComplianceByOptionRequest 请求对象
     * @return CompletableFuture<KeystoneShowSecurityComplianceByOptionResponse>
     */
    public CompletableFuture<KeystoneShowSecurityComplianceByOptionResponse> keystoneShowSecurityComplianceByOptionAsync(
        KeystoneShowSecurityComplianceByOptionRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.keystoneShowSecurityComplianceByOption);
    }

    /**
     * 按条件查询账号密码强度策略
     *
     * 该接口可以用于按条件查询账号密码强度策略，查询结果包括密码强度策略的正则表达式及其描述。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request KeystoneShowSecurityComplianceByOptionRequest 请求对象
     * @return AsyncInvoker<KeystoneShowSecurityComplianceByOptionRequest, KeystoneShowSecurityComplianceByOptionResponse>
     */
    public AsyncInvoker<KeystoneShowSecurityComplianceByOptionRequest, KeystoneShowSecurityComplianceByOptionResponse> keystoneShowSecurityComplianceByOptionAsyncInvoker(
        KeystoneShowSecurityComplianceByOptionRequest request) {
        return new AsyncInvoker<>(request, IamMeta.keystoneShowSecurityComplianceByOption, hcClient);
    }

    /**
     * 查询服务详情
     *
     * 该接口可以用于查询服务详情。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request KeystoneShowServiceRequest 请求对象
     * @return CompletableFuture<KeystoneShowServiceResponse>
     */
    public CompletableFuture<KeystoneShowServiceResponse> keystoneShowServiceAsync(KeystoneShowServiceRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.keystoneShowService);
    }

    /**
     * 查询服务详情
     *
     * 该接口可以用于查询服务详情。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request KeystoneShowServiceRequest 请求对象
     * @return AsyncInvoker<KeystoneShowServiceRequest, KeystoneShowServiceResponse>
     */
    public AsyncInvoker<KeystoneShowServiceRequest, KeystoneShowServiceResponse> keystoneShowServiceAsyncInvoker(
        KeystoneShowServiceRequest request) {
        return new AsyncInvoker<>(request, IamMeta.keystoneShowService, hcClient);
    }

    /**
     * 查询版本信息
     *
     * 该接口用于查询Keystone API的3.0版本的信息。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request KeystoneShowVersionRequest 请求对象
     * @return CompletableFuture<KeystoneShowVersionResponse>
     */
    public CompletableFuture<KeystoneShowVersionResponse> keystoneShowVersionAsync(KeystoneShowVersionRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.keystoneShowVersion);
    }

    /**
     * 查询版本信息
     *
     * 该接口用于查询Keystone API的3.0版本的信息。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request KeystoneShowVersionRequest 请求对象
     * @return AsyncInvoker<KeystoneShowVersionRequest, KeystoneShowVersionResponse>
     */
    public AsyncInvoker<KeystoneShowVersionRequest, KeystoneShowVersionResponse> keystoneShowVersionAsyncInvoker(
        KeystoneShowVersionRequest request) {
        return new AsyncInvoker<>(request, IamMeta.keystoneShowVersion, hcClient);
    }

    /**
     * 更新用户组
     *
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)更新用户组信息。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request KeystoneUpdateGroupRequest 请求对象
     * @return CompletableFuture<KeystoneUpdateGroupResponse>
     */
    public CompletableFuture<KeystoneUpdateGroupResponse> keystoneUpdateGroupAsync(KeystoneUpdateGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.keystoneUpdateGroup);
    }

    /**
     * 更新用户组
     *
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)更新用户组信息。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request KeystoneUpdateGroupRequest 请求对象
     * @return AsyncInvoker<KeystoneUpdateGroupRequest, KeystoneUpdateGroupResponse>
     */
    public AsyncInvoker<KeystoneUpdateGroupRequest, KeystoneUpdateGroupResponse> keystoneUpdateGroupAsyncInvoker(
        KeystoneUpdateGroupRequest request) {
        return new AsyncInvoker<>(request, IamMeta.keystoneUpdateGroup, hcClient);
    }

    /**
     * 更新身份提供商
     *
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)更新身份提供商。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request KeystoneUpdateIdentityProviderRequest 请求对象
     * @return CompletableFuture<KeystoneUpdateIdentityProviderResponse>
     */
    public CompletableFuture<KeystoneUpdateIdentityProviderResponse> keystoneUpdateIdentityProviderAsync(
        KeystoneUpdateIdentityProviderRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.keystoneUpdateIdentityProvider);
    }

    /**
     * 更新身份提供商
     *
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)更新身份提供商。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request KeystoneUpdateIdentityProviderRequest 请求对象
     * @return AsyncInvoker<KeystoneUpdateIdentityProviderRequest, KeystoneUpdateIdentityProviderResponse>
     */
    public AsyncInvoker<KeystoneUpdateIdentityProviderRequest, KeystoneUpdateIdentityProviderResponse> keystoneUpdateIdentityProviderAsyncInvoker(
        KeystoneUpdateIdentityProviderRequest request) {
        return new AsyncInvoker<>(request, IamMeta.keystoneUpdateIdentityProvider, hcClient);
    }

    /**
     * 更新映射
     *
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)更新映射。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request KeystoneUpdateMappingRequest 请求对象
     * @return CompletableFuture<KeystoneUpdateMappingResponse>
     */
    public CompletableFuture<KeystoneUpdateMappingResponse> keystoneUpdateMappingAsync(
        KeystoneUpdateMappingRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.keystoneUpdateMapping);
    }

    /**
     * 更新映射
     *
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)更新映射。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request KeystoneUpdateMappingRequest 请求对象
     * @return AsyncInvoker<KeystoneUpdateMappingRequest, KeystoneUpdateMappingResponse>
     */
    public AsyncInvoker<KeystoneUpdateMappingRequest, KeystoneUpdateMappingResponse> keystoneUpdateMappingAsyncInvoker(
        KeystoneUpdateMappingRequest request) {
        return new AsyncInvoker<>(request, IamMeta.keystoneUpdateMapping, hcClient);
    }

    /**
     * 修改项目信息
     *
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)修改项目信息。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request KeystoneUpdateProjectRequest 请求对象
     * @return CompletableFuture<KeystoneUpdateProjectResponse>
     */
    public CompletableFuture<KeystoneUpdateProjectResponse> keystoneUpdateProjectAsync(
        KeystoneUpdateProjectRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.keystoneUpdateProject);
    }

    /**
     * 修改项目信息
     *
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)修改项目信息。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request KeystoneUpdateProjectRequest 请求对象
     * @return AsyncInvoker<KeystoneUpdateProjectRequest, KeystoneUpdateProjectResponse>
     */
    public AsyncInvoker<KeystoneUpdateProjectRequest, KeystoneUpdateProjectResponse> keystoneUpdateProjectAsyncInvoker(
        KeystoneUpdateProjectRequest request) {
        return new AsyncInvoker<>(request, IamMeta.keystoneUpdateProject, hcClient);
    }

    /**
     * 更新协议
     *
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)更新协议。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request KeystoneUpdateProtocolRequest 请求对象
     * @return CompletableFuture<KeystoneUpdateProtocolResponse>
     */
    public CompletableFuture<KeystoneUpdateProtocolResponse> keystoneUpdateProtocolAsync(
        KeystoneUpdateProtocolRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.keystoneUpdateProtocol);
    }

    /**
     * 更新协议
     *
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)更新协议。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request KeystoneUpdateProtocolRequest 请求对象
     * @return AsyncInvoker<KeystoneUpdateProtocolRequest, KeystoneUpdateProtocolResponse>
     */
    public AsyncInvoker<KeystoneUpdateProtocolRequest, KeystoneUpdateProtocolResponse> keystoneUpdateProtocolAsyncInvoker(
        KeystoneUpdateProtocolRequest request) {
        return new AsyncInvoker<>(request, IamMeta.keystoneUpdateProtocol, hcClient);
    }

    /**
     * 查询指定条件下的委托列表
     *
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询指定条件下的委托列表。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAgenciesRequest 请求对象
     * @return CompletableFuture<ListAgenciesResponse>
     */
    public CompletableFuture<ListAgenciesResponse> listAgenciesAsync(ListAgenciesRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.listAgencies);
    }

    /**
     * 查询指定条件下的委托列表
     *
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询指定条件下的委托列表。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAgenciesRequest 请求对象
     * @return AsyncInvoker<ListAgenciesRequest, ListAgenciesResponse>
     */
    public AsyncInvoker<ListAgenciesRequest, ListAgenciesResponse> listAgenciesAsyncInvoker(
        ListAgenciesRequest request) {
        return new AsyncInvoker<>(request, IamMeta.listAgencies, hcClient);
    }

    /**
     * 查询委托下的所有项目服务权限列表
     *
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询委托所有项目服务权限列表。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAllProjectsPermissionsForAgencyRequest 请求对象
     * @return CompletableFuture<ListAllProjectsPermissionsForAgencyResponse>
     */
    public CompletableFuture<ListAllProjectsPermissionsForAgencyResponse> listAllProjectsPermissionsForAgencyAsync(
        ListAllProjectsPermissionsForAgencyRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.listAllProjectsPermissionsForAgency);
    }

    /**
     * 查询委托下的所有项目服务权限列表
     *
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询委托所有项目服务权限列表。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAllProjectsPermissionsForAgencyRequest 请求对象
     * @return AsyncInvoker<ListAllProjectsPermissionsForAgencyRequest, ListAllProjectsPermissionsForAgencyResponse>
     */
    public AsyncInvoker<ListAllProjectsPermissionsForAgencyRequest, ListAllProjectsPermissionsForAgencyResponse> listAllProjectsPermissionsForAgencyAsyncInvoker(
        ListAllProjectsPermissionsForAgencyRequest request) {
        return new AsyncInvoker<>(request, IamMeta.listAllProjectsPermissionsForAgency, hcClient);
    }

    /**
     * 查询自定义策略列表
     *
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询自定义策略列表。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCustomPoliciesRequest 请求对象
     * @return CompletableFuture<ListCustomPoliciesResponse>
     */
    public CompletableFuture<ListCustomPoliciesResponse> listCustomPoliciesAsync(ListCustomPoliciesRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.listCustomPolicies);
    }

    /**
     * 查询自定义策略列表
     *
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询自定义策略列表。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCustomPoliciesRequest 请求对象
     * @return AsyncInvoker<ListCustomPoliciesRequest, ListCustomPoliciesResponse>
     */
    public AsyncInvoker<ListCustomPoliciesRequest, ListCustomPoliciesResponse> listCustomPoliciesAsyncInvoker(
        ListCustomPoliciesRequest request) {
        return new AsyncInvoker<>(request, IamMeta.listCustomPolicies, hcClient);
    }

    /**
     * 查询全局服务中的委托权限
     *
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询全局服务中的委托权限。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDomainPermissionsForAgencyRequest 请求对象
     * @return CompletableFuture<ListDomainPermissionsForAgencyResponse>
     */
    public CompletableFuture<ListDomainPermissionsForAgencyResponse> listDomainPermissionsForAgencyAsync(
        ListDomainPermissionsForAgencyRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.listDomainPermissionsForAgency);
    }

    /**
     * 查询全局服务中的委托权限
     *
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询全局服务中的委托权限。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDomainPermissionsForAgencyRequest 请求对象
     * @return AsyncInvoker<ListDomainPermissionsForAgencyRequest, ListDomainPermissionsForAgencyResponse>
     */
    public AsyncInvoker<ListDomainPermissionsForAgencyRequest, ListDomainPermissionsForAgencyResponse> listDomainPermissionsForAgencyAsyncInvoker(
        ListDomainPermissionsForAgencyRequest request) {
        return new AsyncInvoker<>(request, IamMeta.listDomainPermissionsForAgency, hcClient);
    }

    /**
     * 查询用户组关联的企业项目
     *
     * 该接口可用于查询用户组所关联的企业项目。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEnterpriseProjectsForGroupRequest 请求对象
     * @return CompletableFuture<ListEnterpriseProjectsForGroupResponse>
     */
    public CompletableFuture<ListEnterpriseProjectsForGroupResponse> listEnterpriseProjectsForGroupAsync(
        ListEnterpriseProjectsForGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.listEnterpriseProjectsForGroup);
    }

    /**
     * 查询用户组关联的企业项目
     *
     * 该接口可用于查询用户组所关联的企业项目。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEnterpriseProjectsForGroupRequest 请求对象
     * @return AsyncInvoker<ListEnterpriseProjectsForGroupRequest, ListEnterpriseProjectsForGroupResponse>
     */
    public AsyncInvoker<ListEnterpriseProjectsForGroupRequest, ListEnterpriseProjectsForGroupResponse> listEnterpriseProjectsForGroupAsyncInvoker(
        ListEnterpriseProjectsForGroupRequest request) {
        return new AsyncInvoker<>(request, IamMeta.listEnterpriseProjectsForGroup, hcClient);
    }

    /**
     * 查询用户直接关联的企业项目
     *
     * 该接口可用于查询用户所关联的企业项目。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEnterpriseProjectsForUserRequest 请求对象
     * @return CompletableFuture<ListEnterpriseProjectsForUserResponse>
     */
    public CompletableFuture<ListEnterpriseProjectsForUserResponse> listEnterpriseProjectsForUserAsync(
        ListEnterpriseProjectsForUserRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.listEnterpriseProjectsForUser);
    }

    /**
     * 查询用户直接关联的企业项目
     *
     * 该接口可用于查询用户所关联的企业项目。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEnterpriseProjectsForUserRequest 请求对象
     * @return AsyncInvoker<ListEnterpriseProjectsForUserRequest, ListEnterpriseProjectsForUserResponse>
     */
    public AsyncInvoker<ListEnterpriseProjectsForUserRequest, ListEnterpriseProjectsForUserResponse> listEnterpriseProjectsForUserAsyncInvoker(
        ListEnterpriseProjectsForUserRequest request) {
        return new AsyncInvoker<>(request, IamMeta.listEnterpriseProjectsForUser, hcClient);
    }

    /**
     * 查询企业项目关联的用户组
     *
     * 该接口可用于查询企业项目关联的用户组。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGroupsForEnterpriseProjectRequest 请求对象
     * @return CompletableFuture<ListGroupsForEnterpriseProjectResponse>
     */
    public CompletableFuture<ListGroupsForEnterpriseProjectResponse> listGroupsForEnterpriseProjectAsync(
        ListGroupsForEnterpriseProjectRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.listGroupsForEnterpriseProject);
    }

    /**
     * 查询企业项目关联的用户组
     *
     * 该接口可用于查询企业项目关联的用户组。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGroupsForEnterpriseProjectRequest 请求对象
     * @return AsyncInvoker<ListGroupsForEnterpriseProjectRequest, ListGroupsForEnterpriseProjectResponse>
     */
    public AsyncInvoker<ListGroupsForEnterpriseProjectRequest, ListGroupsForEnterpriseProjectResponse> listGroupsForEnterpriseProjectAsyncInvoker(
        ListGroupsForEnterpriseProjectRequest request) {
        return new AsyncInvoker<>(request, IamMeta.listGroupsForEnterpriseProject, hcClient);
    }

    /**
     * 查询项目服务中的委托权限
     *
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询项目服务中的委托权限。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectPermissionsForAgencyRequest 请求对象
     * @return CompletableFuture<ListProjectPermissionsForAgencyResponse>
     */
    public CompletableFuture<ListProjectPermissionsForAgencyResponse> listProjectPermissionsForAgencyAsync(
        ListProjectPermissionsForAgencyRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.listProjectPermissionsForAgency);
    }

    /**
     * 查询项目服务中的委托权限
     *
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询项目服务中的委托权限。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectPermissionsForAgencyRequest 请求对象
     * @return AsyncInvoker<ListProjectPermissionsForAgencyRequest, ListProjectPermissionsForAgencyResponse>
     */
    public AsyncInvoker<ListProjectPermissionsForAgencyRequest, ListProjectPermissionsForAgencyResponse> listProjectPermissionsForAgencyAsyncInvoker(
        ListProjectPermissionsForAgencyRequest request) {
        return new AsyncInvoker<>(request, IamMeta.listProjectPermissionsForAgency, hcClient);
    }

    /**
     * 查询企业项目关联用户组的权限
     *
     * 该接口可用于查询企业项目已关联用户组的权限。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRolesForGroupOnEnterpriseProjectRequest 请求对象
     * @return CompletableFuture<ListRolesForGroupOnEnterpriseProjectResponse>
     */
    public CompletableFuture<ListRolesForGroupOnEnterpriseProjectResponse> listRolesForGroupOnEnterpriseProjectAsync(
        ListRolesForGroupOnEnterpriseProjectRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.listRolesForGroupOnEnterpriseProject);
    }

    /**
     * 查询企业项目关联用户组的权限
     *
     * 该接口可用于查询企业项目已关联用户组的权限。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRolesForGroupOnEnterpriseProjectRequest 请求对象
     * @return AsyncInvoker<ListRolesForGroupOnEnterpriseProjectRequest, ListRolesForGroupOnEnterpriseProjectResponse>
     */
    public AsyncInvoker<ListRolesForGroupOnEnterpriseProjectRequest, ListRolesForGroupOnEnterpriseProjectResponse> listRolesForGroupOnEnterpriseProjectAsyncInvoker(
        ListRolesForGroupOnEnterpriseProjectRequest request) {
        return new AsyncInvoker<>(request, IamMeta.listRolesForGroupOnEnterpriseProject, hcClient);
    }

    /**
     * 查询企业项目直接关联用户的权限
     *
     * 该接口可用于查询企业项目直接关联用户的权限。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRolesForUserOnEnterpriseProjectRequest 请求对象
     * @return CompletableFuture<ListRolesForUserOnEnterpriseProjectResponse>
     */
    public CompletableFuture<ListRolesForUserOnEnterpriseProjectResponse> listRolesForUserOnEnterpriseProjectAsync(
        ListRolesForUserOnEnterpriseProjectRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.listRolesForUserOnEnterpriseProject);
    }

    /**
     * 查询企业项目直接关联用户的权限
     *
     * 该接口可用于查询企业项目直接关联用户的权限。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRolesForUserOnEnterpriseProjectRequest 请求对象
     * @return AsyncInvoker<ListRolesForUserOnEnterpriseProjectRequest, ListRolesForUserOnEnterpriseProjectResponse>
     */
    public AsyncInvoker<ListRolesForUserOnEnterpriseProjectRequest, ListRolesForUserOnEnterpriseProjectResponse> listRolesForUserOnEnterpriseProjectAsyncInvoker(
        ListRolesForUserOnEnterpriseProjectRequest request) {
        return new AsyncInvoker<>(request, IamMeta.listRolesForUserOnEnterpriseProject, hcClient);
    }

    /**
     * 查询企业项目直接关联用户
     *
     * 该接口可用于查询企业项目直接关联的用户。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUsersForEnterpriseProjectRequest 请求对象
     * @return CompletableFuture<ListUsersForEnterpriseProjectResponse>
     */
    public CompletableFuture<ListUsersForEnterpriseProjectResponse> listUsersForEnterpriseProjectAsync(
        ListUsersForEnterpriseProjectRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.listUsersForEnterpriseProject);
    }

    /**
     * 查询企业项目直接关联用户
     *
     * 该接口可用于查询企业项目直接关联的用户。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUsersForEnterpriseProjectRequest 请求对象
     * @return AsyncInvoker<ListUsersForEnterpriseProjectRequest, ListUsersForEnterpriseProjectResponse>
     */
    public AsyncInvoker<ListUsersForEnterpriseProjectRequest, ListUsersForEnterpriseProjectResponse> listUsersForEnterpriseProjectAsyncInvoker(
        ListUsersForEnterpriseProjectRequest request) {
        return new AsyncInvoker<>(request, IamMeta.listUsersForEnterpriseProject, hcClient);
    }

    /**
     * 移除委托下的所有项目服务权限
     *
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)移除委托的所有项目服务权限。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RemoveAllProjectsPermissionFromAgencyRequest 请求对象
     * @return CompletableFuture<RemoveAllProjectsPermissionFromAgencyResponse>
     */
    public CompletableFuture<RemoveAllProjectsPermissionFromAgencyResponse> removeAllProjectsPermissionFromAgencyAsync(
        RemoveAllProjectsPermissionFromAgencyRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.removeAllProjectsPermissionFromAgency);
    }

    /**
     * 移除委托下的所有项目服务权限
     *
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)移除委托的所有项目服务权限。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RemoveAllProjectsPermissionFromAgencyRequest 请求对象
     * @return AsyncInvoker<RemoveAllProjectsPermissionFromAgencyRequest, RemoveAllProjectsPermissionFromAgencyResponse>
     */
    public AsyncInvoker<RemoveAllProjectsPermissionFromAgencyRequest, RemoveAllProjectsPermissionFromAgencyResponse> removeAllProjectsPermissionFromAgencyAsyncInvoker(
        RemoveAllProjectsPermissionFromAgencyRequest request) {
        return new AsyncInvoker<>(request, IamMeta.removeAllProjectsPermissionFromAgency, hcClient);
    }

    /**
     * 移除委托的全局服务权限
     *
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)移除委托的全局服务权限。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RemoveDomainPermissionFromAgencyRequest 请求对象
     * @return CompletableFuture<RemoveDomainPermissionFromAgencyResponse>
     */
    public CompletableFuture<RemoveDomainPermissionFromAgencyResponse> removeDomainPermissionFromAgencyAsync(
        RemoveDomainPermissionFromAgencyRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.removeDomainPermissionFromAgency);
    }

    /**
     * 移除委托的全局服务权限
     *
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)移除委托的全局服务权限。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RemoveDomainPermissionFromAgencyRequest 请求对象
     * @return AsyncInvoker<RemoveDomainPermissionFromAgencyRequest, RemoveDomainPermissionFromAgencyResponse>
     */
    public AsyncInvoker<RemoveDomainPermissionFromAgencyRequest, RemoveDomainPermissionFromAgencyResponse> removeDomainPermissionFromAgencyAsyncInvoker(
        RemoveDomainPermissionFromAgencyRequest request) {
        return new AsyncInvoker<>(request, IamMeta.removeDomainPermissionFromAgency, hcClient);
    }

    /**
     * 移除委托的项目服务权限
     *
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)移除委托的项目服务权限。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RemoveProjectPermissionFromAgencyRequest 请求对象
     * @return CompletableFuture<RemoveProjectPermissionFromAgencyResponse>
     */
    public CompletableFuture<RemoveProjectPermissionFromAgencyResponse> removeProjectPermissionFromAgencyAsync(
        RemoveProjectPermissionFromAgencyRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.removeProjectPermissionFromAgency);
    }

    /**
     * 移除委托的项目服务权限
     *
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)移除委托的项目服务权限。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RemoveProjectPermissionFromAgencyRequest 请求对象
     * @return AsyncInvoker<RemoveProjectPermissionFromAgencyRequest, RemoveProjectPermissionFromAgencyResponse>
     */
    public AsyncInvoker<RemoveProjectPermissionFromAgencyRequest, RemoveProjectPermissionFromAgencyResponse> removeProjectPermissionFromAgencyAsyncInvoker(
        RemoveProjectPermissionFromAgencyRequest request) {
        return new AsyncInvoker<>(request, IamMeta.removeProjectPermissionFromAgency, hcClient);
    }

    /**
     * 删除企业项目关联委托的权限
     *
     * 该接口可以删除企业项目委托上的授权
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RevokeRoleFromAgencyOnEnterpriseProjectRequest 请求对象
     * @return CompletableFuture<RevokeRoleFromAgencyOnEnterpriseProjectResponse>
     */
    public CompletableFuture<RevokeRoleFromAgencyOnEnterpriseProjectResponse> revokeRoleFromAgencyOnEnterpriseProjectAsync(
        RevokeRoleFromAgencyOnEnterpriseProjectRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.revokeRoleFromAgencyOnEnterpriseProject);
    }

    /**
     * 删除企业项目关联委托的权限
     *
     * 该接口可以删除企业项目委托上的授权
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RevokeRoleFromAgencyOnEnterpriseProjectRequest 请求对象
     * @return AsyncInvoker<RevokeRoleFromAgencyOnEnterpriseProjectRequest, RevokeRoleFromAgencyOnEnterpriseProjectResponse>
     */
    public AsyncInvoker<RevokeRoleFromAgencyOnEnterpriseProjectRequest, RevokeRoleFromAgencyOnEnterpriseProjectResponse> revokeRoleFromAgencyOnEnterpriseProjectAsyncInvoker(
        RevokeRoleFromAgencyOnEnterpriseProjectRequest request) {
        return new AsyncInvoker<>(request, IamMeta.revokeRoleFromAgencyOnEnterpriseProject, hcClient);
    }

    /**
     * 删除企业项目关联用户组的权限
     *
     * 该接口用于删除企业项目关联用户组的权限。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RevokeRoleFromGroupOnEnterpriseProjectRequest 请求对象
     * @return CompletableFuture<RevokeRoleFromGroupOnEnterpriseProjectResponse>
     */
    public CompletableFuture<RevokeRoleFromGroupOnEnterpriseProjectResponse> revokeRoleFromGroupOnEnterpriseProjectAsync(
        RevokeRoleFromGroupOnEnterpriseProjectRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.revokeRoleFromGroupOnEnterpriseProject);
    }

    /**
     * 删除企业项目关联用户组的权限
     *
     * 该接口用于删除企业项目关联用户组的权限。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RevokeRoleFromGroupOnEnterpriseProjectRequest 请求对象
     * @return AsyncInvoker<RevokeRoleFromGroupOnEnterpriseProjectRequest, RevokeRoleFromGroupOnEnterpriseProjectResponse>
     */
    public AsyncInvoker<RevokeRoleFromGroupOnEnterpriseProjectRequest, RevokeRoleFromGroupOnEnterpriseProjectResponse> revokeRoleFromGroupOnEnterpriseProjectAsyncInvoker(
        RevokeRoleFromGroupOnEnterpriseProjectRequest request) {
        return new AsyncInvoker<>(request, IamMeta.revokeRoleFromGroupOnEnterpriseProject, hcClient);
    }

    /**
     * 删除企业项目直接关联用户的权限
     *
     * 删除企业项目直接关联用户的权限。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RevokeRoleFromUserOnEnterpriseProjectRequest 请求对象
     * @return CompletableFuture<RevokeRoleFromUserOnEnterpriseProjectResponse>
     */
    public CompletableFuture<RevokeRoleFromUserOnEnterpriseProjectResponse> revokeRoleFromUserOnEnterpriseProjectAsync(
        RevokeRoleFromUserOnEnterpriseProjectRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.revokeRoleFromUserOnEnterpriseProject);
    }

    /**
     * 删除企业项目直接关联用户的权限
     *
     * 删除企业项目直接关联用户的权限。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RevokeRoleFromUserOnEnterpriseProjectRequest 请求对象
     * @return AsyncInvoker<RevokeRoleFromUserOnEnterpriseProjectRequest, RevokeRoleFromUserOnEnterpriseProjectResponse>
     */
    public AsyncInvoker<RevokeRoleFromUserOnEnterpriseProjectRequest, RevokeRoleFromUserOnEnterpriseProjectResponse> revokeRoleFromUserOnEnterpriseProjectAsyncInvoker(
        RevokeRoleFromUserOnEnterpriseProjectRequest request) {
        return new AsyncInvoker<>(request, IamMeta.revokeRoleFromUserOnEnterpriseProject, hcClient);
    }

    /**
     * 查询委托详情
     *
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询委托详情。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAgencyRequest 请求对象
     * @return CompletableFuture<ShowAgencyResponse>
     */
    public CompletableFuture<ShowAgencyResponse> showAgencyAsync(ShowAgencyRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.showAgency);
    }

    /**
     * 查询委托详情
     *
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询委托详情。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAgencyRequest 请求对象
     * @return AsyncInvoker<ShowAgencyRequest, ShowAgencyResponse>
     */
    public AsyncInvoker<ShowAgencyRequest, ShowAgencyResponse> showAgencyAsyncInvoker(ShowAgencyRequest request) {
        return new AsyncInvoker<>(request, IamMeta.showAgency, hcClient);
    }

    /**
     * 查询自定义策略详情
     *
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询自定义策略详情。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCustomPolicyRequest 请求对象
     * @return CompletableFuture<ShowCustomPolicyResponse>
     */
    public CompletableFuture<ShowCustomPolicyResponse> showCustomPolicyAsync(ShowCustomPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.showCustomPolicy);
    }

    /**
     * 查询自定义策略详情
     *
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询自定义策略详情。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCustomPolicyRequest 请求对象
     * @return AsyncInvoker<ShowCustomPolicyRequest, ShowCustomPolicyResponse>
     */
    public AsyncInvoker<ShowCustomPolicyRequest, ShowCustomPolicyResponse> showCustomPolicyAsyncInvoker(
        ShowCustomPolicyRequest request) {
        return new AsyncInvoker<>(request, IamMeta.showCustomPolicy, hcClient);
    }

    /**
     * 查询账号接口访问策略
     *
     * 该接口可以用于查询账号接口访问控制策略。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDomainApiAclPolicyRequest 请求对象
     * @return CompletableFuture<ShowDomainApiAclPolicyResponse>
     */
    public CompletableFuture<ShowDomainApiAclPolicyResponse> showDomainApiAclPolicyAsync(
        ShowDomainApiAclPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.showDomainApiAclPolicy);
    }

    /**
     * 查询账号接口访问策略
     *
     * 该接口可以用于查询账号接口访问控制策略。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDomainApiAclPolicyRequest 请求对象
     * @return AsyncInvoker<ShowDomainApiAclPolicyRequest, ShowDomainApiAclPolicyResponse>
     */
    public AsyncInvoker<ShowDomainApiAclPolicyRequest, ShowDomainApiAclPolicyResponse> showDomainApiAclPolicyAsyncInvoker(
        ShowDomainApiAclPolicyRequest request) {
        return new AsyncInvoker<>(request, IamMeta.showDomainApiAclPolicy, hcClient);
    }

    /**
     * 查询账号控制台访问策略
     *
     * 该接口可以用于查询账号控制台访问控制策略。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDomainConsoleAclPolicyRequest 请求对象
     * @return CompletableFuture<ShowDomainConsoleAclPolicyResponse>
     */
    public CompletableFuture<ShowDomainConsoleAclPolicyResponse> showDomainConsoleAclPolicyAsync(
        ShowDomainConsoleAclPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.showDomainConsoleAclPolicy);
    }

    /**
     * 查询账号控制台访问策略
     *
     * 该接口可以用于查询账号控制台访问控制策略。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDomainConsoleAclPolicyRequest 请求对象
     * @return AsyncInvoker<ShowDomainConsoleAclPolicyRequest, ShowDomainConsoleAclPolicyResponse>
     */
    public AsyncInvoker<ShowDomainConsoleAclPolicyRequest, ShowDomainConsoleAclPolicyResponse> showDomainConsoleAclPolicyAsyncInvoker(
        ShowDomainConsoleAclPolicyRequest request) {
        return new AsyncInvoker<>(request, IamMeta.showDomainConsoleAclPolicy, hcClient);
    }

    /**
     * 查询账号登录策略
     *
     * 该接口可以用于查询账号登录策略。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDomainLoginPolicyRequest 请求对象
     * @return CompletableFuture<ShowDomainLoginPolicyResponse>
     */
    public CompletableFuture<ShowDomainLoginPolicyResponse> showDomainLoginPolicyAsync(
        ShowDomainLoginPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.showDomainLoginPolicy);
    }

    /**
     * 查询账号登录策略
     *
     * 该接口可以用于查询账号登录策略。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDomainLoginPolicyRequest 请求对象
     * @return AsyncInvoker<ShowDomainLoginPolicyRequest, ShowDomainLoginPolicyResponse>
     */
    public AsyncInvoker<ShowDomainLoginPolicyRequest, ShowDomainLoginPolicyResponse> showDomainLoginPolicyAsyncInvoker(
        ShowDomainLoginPolicyRequest request) {
        return new AsyncInvoker<>(request, IamMeta.showDomainLoginPolicy, hcClient);
    }

    /**
     * 查询账号密码策略
     *
     * 该接口可以用于查询账号密码策略。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDomainPasswordPolicyRequest 请求对象
     * @return CompletableFuture<ShowDomainPasswordPolicyResponse>
     */
    public CompletableFuture<ShowDomainPasswordPolicyResponse> showDomainPasswordPolicyAsync(
        ShowDomainPasswordPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.showDomainPasswordPolicy);
    }

    /**
     * 查询账号密码策略
     *
     * 该接口可以用于查询账号密码策略。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDomainPasswordPolicyRequest 请求对象
     * @return AsyncInvoker<ShowDomainPasswordPolicyRequest, ShowDomainPasswordPolicyResponse>
     */
    public AsyncInvoker<ShowDomainPasswordPolicyRequest, ShowDomainPasswordPolicyResponse> showDomainPasswordPolicyAsyncInvoker(
        ShowDomainPasswordPolicyRequest request) {
        return new AsyncInvoker<>(request, IamMeta.showDomainPasswordPolicy, hcClient);
    }

    /**
     * 查询账号操作保护策略
     *
     * 该接口可以用于查询账号操作保护策略。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDomainProtectPolicyRequest 请求对象
     * @return CompletableFuture<ShowDomainProtectPolicyResponse>
     */
    public CompletableFuture<ShowDomainProtectPolicyResponse> showDomainProtectPolicyAsync(
        ShowDomainProtectPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.showDomainProtectPolicy);
    }

    /**
     * 查询账号操作保护策略
     *
     * 该接口可以用于查询账号操作保护策略。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDomainProtectPolicyRequest 请求对象
     * @return AsyncInvoker<ShowDomainProtectPolicyRequest, ShowDomainProtectPolicyResponse>
     */
    public AsyncInvoker<ShowDomainProtectPolicyRequest, ShowDomainProtectPolicyResponse> showDomainProtectPolicyAsyncInvoker(
        ShowDomainProtectPolicyRequest request) {
        return new AsyncInvoker<>(request, IamMeta.showDomainProtectPolicy, hcClient);
    }

    /**
     * 查询账号配额
     *
     * 该接口可以用于查询账号配额。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDomainQuotaRequest 请求对象
     * @return CompletableFuture<ShowDomainQuotaResponse>
     */
    public CompletableFuture<ShowDomainQuotaResponse> showDomainQuotaAsync(ShowDomainQuotaRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.showDomainQuota);
    }

    /**
     * 查询账号配额
     *
     * 该接口可以用于查询账号配额。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDomainQuotaRequest 请求对象
     * @return AsyncInvoker<ShowDomainQuotaRequest, ShowDomainQuotaResponse>
     */
    public AsyncInvoker<ShowDomainQuotaRequest, ShowDomainQuotaResponse> showDomainQuotaAsyncInvoker(
        ShowDomainQuotaRequest request) {
        return new AsyncInvoker<>(request, IamMeta.showDomainQuota, hcClient);
    }

    /**
     * 查询指定账号中的授权记录
     *
     * 该接口用于查询指定账号中的授权记录。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDomainRoleAssignmentsRequest 请求对象
     * @return CompletableFuture<ShowDomainRoleAssignmentsResponse>
     */
    public CompletableFuture<ShowDomainRoleAssignmentsResponse> showDomainRoleAssignmentsAsync(
        ShowDomainRoleAssignmentsRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.showDomainRoleAssignments);
    }

    /**
     * 查询指定账号中的授权记录
     *
     * 该接口用于查询指定账号中的授权记录。
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDomainRoleAssignmentsRequest 请求对象
     * @return AsyncInvoker<ShowDomainRoleAssignmentsRequest, ShowDomainRoleAssignmentsResponse>
     */
    public AsyncInvoker<ShowDomainRoleAssignmentsRequest, ShowDomainRoleAssignmentsResponse> showDomainRoleAssignmentsAsyncInvoker(
        ShowDomainRoleAssignmentsRequest request) {
        return new AsyncInvoker<>(request, IamMeta.showDomainRoleAssignments, hcClient);
    }

    /**
     * 查询Metadata文件
     *
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询身份提供商导入到IAM中的Metadata文件。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMetadataRequest 请求对象
     * @return CompletableFuture<ShowMetadataResponse>
     */
    public CompletableFuture<ShowMetadataResponse> showMetadataAsync(ShowMetadataRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.showMetadata);
    }

    /**
     * 查询Metadata文件
     *
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询身份提供商导入到IAM中的Metadata文件。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMetadataRequest 请求对象
     * @return AsyncInvoker<ShowMetadataRequest, ShowMetadataResponse>
     */
    public AsyncInvoker<ShowMetadataRequest, ShowMetadataResponse> showMetadataAsyncInvoker(
        ShowMetadataRequest request) {
        return new AsyncInvoker<>(request, IamMeta.showMetadata, hcClient);
    }

    /**
     * 查询OpenId Connect身份提供商配置
     *
     * 查询OpenId Connect身份提供商配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowOpenIdConnectConfigRequest 请求对象
     * @return CompletableFuture<ShowOpenIdConnectConfigResponse>
     */
    public CompletableFuture<ShowOpenIdConnectConfigResponse> showOpenIdConnectConfigAsync(
        ShowOpenIdConnectConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.showOpenIdConnectConfig);
    }

    /**
     * 查询OpenId Connect身份提供商配置
     *
     * 查询OpenId Connect身份提供商配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowOpenIdConnectConfigRequest 请求对象
     * @return AsyncInvoker<ShowOpenIdConnectConfigRequest, ShowOpenIdConnectConfigResponse>
     */
    public AsyncInvoker<ShowOpenIdConnectConfigRequest, ShowOpenIdConnectConfigResponse> showOpenIdConnectConfigAsyncInvoker(
        ShowOpenIdConnectConfigRequest request) {
        return new AsyncInvoker<>(request, IamMeta.showOpenIdConnectConfig, hcClient);
    }

    /**
     * 查询项目详情与状态
     *
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询项目详情与状态。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowProjectDetailsAndStatusRequest 请求对象
     * @return CompletableFuture<ShowProjectDetailsAndStatusResponse>
     */
    public CompletableFuture<ShowProjectDetailsAndStatusResponse> showProjectDetailsAndStatusAsync(
        ShowProjectDetailsAndStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.showProjectDetailsAndStatus);
    }

    /**
     * 查询项目详情与状态
     *
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询项目详情与状态。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowProjectDetailsAndStatusRequest 请求对象
     * @return AsyncInvoker<ShowProjectDetailsAndStatusRequest, ShowProjectDetailsAndStatusResponse>
     */
    public AsyncInvoker<ShowProjectDetailsAndStatusRequest, ShowProjectDetailsAndStatusResponse> showProjectDetailsAndStatusAsyncInvoker(
        ShowProjectDetailsAndStatusRequest request) {
        return new AsyncInvoker<>(request, IamMeta.showProjectDetailsAndStatus, hcClient);
    }

    /**
     * 查询项目配额
     *
     * 该接口可以用于查询项目配额。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowProjectQuotaRequest 请求对象
     * @return CompletableFuture<ShowProjectQuotaResponse>
     */
    public CompletableFuture<ShowProjectQuotaResponse> showProjectQuotaAsync(ShowProjectQuotaRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.showProjectQuota);
    }

    /**
     * 查询项目配额
     *
     * 该接口可以用于查询项目配额。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowProjectQuotaRequest 请求对象
     * @return AsyncInvoker<ShowProjectQuotaRequest, ShowProjectQuotaResponse>
     */
    public AsyncInvoker<ShowProjectQuotaRequest, ShowProjectQuotaResponse> showProjectQuotaAsyncInvoker(
        ShowProjectQuotaRequest request) {
        return new AsyncInvoker<>(request, IamMeta.showProjectQuota, hcClient);
    }

    /**
     * 修改委托
     *
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)修改委托。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAgencyRequest 请求对象
     * @return CompletableFuture<UpdateAgencyResponse>
     */
    public CompletableFuture<UpdateAgencyResponse> updateAgencyAsync(UpdateAgencyRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.updateAgency);
    }

    /**
     * 修改委托
     *
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)修改委托。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAgencyRequest 请求对象
     * @return AsyncInvoker<UpdateAgencyRequest, UpdateAgencyResponse>
     */
    public AsyncInvoker<UpdateAgencyRequest, UpdateAgencyResponse> updateAgencyAsyncInvoker(
        UpdateAgencyRequest request) {
        return new AsyncInvoker<>(request, IamMeta.updateAgency, hcClient);
    }

    /**
     * 修改委托自定义策略
     *
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)修改委托自定义策略。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAgencyCustomPolicyRequest 请求对象
     * @return CompletableFuture<UpdateAgencyCustomPolicyResponse>
     */
    public CompletableFuture<UpdateAgencyCustomPolicyResponse> updateAgencyCustomPolicyAsync(
        UpdateAgencyCustomPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.updateAgencyCustomPolicy);
    }

    /**
     * 修改委托自定义策略
     *
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)修改委托自定义策略。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAgencyCustomPolicyRequest 请求对象
     * @return AsyncInvoker<UpdateAgencyCustomPolicyRequest, UpdateAgencyCustomPolicyResponse>
     */
    public AsyncInvoker<UpdateAgencyCustomPolicyRequest, UpdateAgencyCustomPolicyResponse> updateAgencyCustomPolicyAsyncInvoker(
        UpdateAgencyCustomPolicyRequest request) {
        return new AsyncInvoker<>(request, IamMeta.updateAgencyCustomPolicy, hcClient);
    }

    /**
     * 修改云服务自定义策略
     *
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)修改云服务自定义策略。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateCloudServiceCustomPolicyRequest 请求对象
     * @return CompletableFuture<UpdateCloudServiceCustomPolicyResponse>
     */
    public CompletableFuture<UpdateCloudServiceCustomPolicyResponse> updateCloudServiceCustomPolicyAsync(
        UpdateCloudServiceCustomPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.updateCloudServiceCustomPolicy);
    }

    /**
     * 修改云服务自定义策略
     *
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)修改云服务自定义策略。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateCloudServiceCustomPolicyRequest 请求对象
     * @return AsyncInvoker<UpdateCloudServiceCustomPolicyRequest, UpdateCloudServiceCustomPolicyResponse>
     */
    public AsyncInvoker<UpdateCloudServiceCustomPolicyRequest, UpdateCloudServiceCustomPolicyResponse> updateCloudServiceCustomPolicyAsyncInvoker(
        UpdateCloudServiceCustomPolicyRequest request) {
        return new AsyncInvoker<>(request, IamMeta.updateCloudServiceCustomPolicy, hcClient);
    }

    /**
     * 修改账号接口访问策略
     *
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)修改账号接口访问策略。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDomainApiAclPolicyRequest 请求对象
     * @return CompletableFuture<UpdateDomainApiAclPolicyResponse>
     */
    public CompletableFuture<UpdateDomainApiAclPolicyResponse> updateDomainApiAclPolicyAsync(
        UpdateDomainApiAclPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.updateDomainApiAclPolicy);
    }

    /**
     * 修改账号接口访问策略
     *
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)修改账号接口访问策略。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDomainApiAclPolicyRequest 请求对象
     * @return AsyncInvoker<UpdateDomainApiAclPolicyRequest, UpdateDomainApiAclPolicyResponse>
     */
    public AsyncInvoker<UpdateDomainApiAclPolicyRequest, UpdateDomainApiAclPolicyResponse> updateDomainApiAclPolicyAsyncInvoker(
        UpdateDomainApiAclPolicyRequest request) {
        return new AsyncInvoker<>(request, IamMeta.updateDomainApiAclPolicy, hcClient);
    }

    /**
     * 修改账号控制台访问策略
     *
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)修改账号控制台访问策略。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDomainConsoleAclPolicyRequest 请求对象
     * @return CompletableFuture<UpdateDomainConsoleAclPolicyResponse>
     */
    public CompletableFuture<UpdateDomainConsoleAclPolicyResponse> updateDomainConsoleAclPolicyAsync(
        UpdateDomainConsoleAclPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.updateDomainConsoleAclPolicy);
    }

    /**
     * 修改账号控制台访问策略
     *
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)修改账号控制台访问策略。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDomainConsoleAclPolicyRequest 请求对象
     * @return AsyncInvoker<UpdateDomainConsoleAclPolicyRequest, UpdateDomainConsoleAclPolicyResponse>
     */
    public AsyncInvoker<UpdateDomainConsoleAclPolicyRequest, UpdateDomainConsoleAclPolicyResponse> updateDomainConsoleAclPolicyAsyncInvoker(
        UpdateDomainConsoleAclPolicyRequest request) {
        return new AsyncInvoker<>(request, IamMeta.updateDomainConsoleAclPolicy, hcClient);
    }

    /**
     * 为用户组授予所有项目服务权限
     *
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)为用户组授予所有项目服务权限。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDomainGroupInheritRoleRequest 请求对象
     * @return CompletableFuture<UpdateDomainGroupInheritRoleResponse>
     */
    public CompletableFuture<UpdateDomainGroupInheritRoleResponse> updateDomainGroupInheritRoleAsync(
        UpdateDomainGroupInheritRoleRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.updateDomainGroupInheritRole);
    }

    /**
     * 为用户组授予所有项目服务权限
     *
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)为用户组授予所有项目服务权限。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDomainGroupInheritRoleRequest 请求对象
     * @return AsyncInvoker<UpdateDomainGroupInheritRoleRequest, UpdateDomainGroupInheritRoleResponse>
     */
    public AsyncInvoker<UpdateDomainGroupInheritRoleRequest, UpdateDomainGroupInheritRoleResponse> updateDomainGroupInheritRoleAsyncInvoker(
        UpdateDomainGroupInheritRoleRequest request) {
        return new AsyncInvoker<>(request, IamMeta.updateDomainGroupInheritRole, hcClient);
    }

    /**
     * 修改账号登录策略
     *
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)修改账号登录策略。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDomainLoginPolicyRequest 请求对象
     * @return CompletableFuture<UpdateDomainLoginPolicyResponse>
     */
    public CompletableFuture<UpdateDomainLoginPolicyResponse> updateDomainLoginPolicyAsync(
        UpdateDomainLoginPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.updateDomainLoginPolicy);
    }

    /**
     * 修改账号登录策略
     *
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)修改账号登录策略。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDomainLoginPolicyRequest 请求对象
     * @return AsyncInvoker<UpdateDomainLoginPolicyRequest, UpdateDomainLoginPolicyResponse>
     */
    public AsyncInvoker<UpdateDomainLoginPolicyRequest, UpdateDomainLoginPolicyResponse> updateDomainLoginPolicyAsyncInvoker(
        UpdateDomainLoginPolicyRequest request) {
        return new AsyncInvoker<>(request, IamMeta.updateDomainLoginPolicy, hcClient);
    }

    /**
     * 修改账号密码策略
     *
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)修改账号密码策略。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDomainPasswordPolicyRequest 请求对象
     * @return CompletableFuture<UpdateDomainPasswordPolicyResponse>
     */
    public CompletableFuture<UpdateDomainPasswordPolicyResponse> updateDomainPasswordPolicyAsync(
        UpdateDomainPasswordPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.updateDomainPasswordPolicy);
    }

    /**
     * 修改账号密码策略
     *
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)修改账号密码策略。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDomainPasswordPolicyRequest 请求对象
     * @return AsyncInvoker<UpdateDomainPasswordPolicyRequest, UpdateDomainPasswordPolicyResponse>
     */
    public AsyncInvoker<UpdateDomainPasswordPolicyRequest, UpdateDomainPasswordPolicyResponse> updateDomainPasswordPolicyAsyncInvoker(
        UpdateDomainPasswordPolicyRequest request) {
        return new AsyncInvoker<>(request, IamMeta.updateDomainPasswordPolicy, hcClient);
    }

    /**
     * 修改账号操作保护策略
     *
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)修改账号操作保护策略。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDomainProtectPolicyRequest 请求对象
     * @return CompletableFuture<UpdateDomainProtectPolicyResponse>
     */
    public CompletableFuture<UpdateDomainProtectPolicyResponse> updateDomainProtectPolicyAsync(
        UpdateDomainProtectPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.updateDomainProtectPolicy);
    }

    /**
     * 修改账号操作保护策略
     *
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)修改账号操作保护策略。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDomainProtectPolicyRequest 请求对象
     * @return AsyncInvoker<UpdateDomainProtectPolicyRequest, UpdateDomainProtectPolicyResponse>
     */
    public AsyncInvoker<UpdateDomainProtectPolicyRequest, UpdateDomainProtectPolicyResponse> updateDomainProtectPolicyAsyncInvoker(
        UpdateDomainProtectPolicyRequest request) {
        return new AsyncInvoker<>(request, IamMeta.updateDomainProtectPolicy, hcClient);
    }

    /**
     * 修改OpenId Connect身份提供商配置
     *
     * 修改OpenId Connect身份提供商配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateOpenIdConnectConfigRequest 请求对象
     * @return CompletableFuture<UpdateOpenIdConnectConfigResponse>
     */
    public CompletableFuture<UpdateOpenIdConnectConfigResponse> updateOpenIdConnectConfigAsync(
        UpdateOpenIdConnectConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.updateOpenIdConnectConfig);
    }

    /**
     * 修改OpenId Connect身份提供商配置
     *
     * 修改OpenId Connect身份提供商配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateOpenIdConnectConfigRequest 请求对象
     * @return AsyncInvoker<UpdateOpenIdConnectConfigRequest, UpdateOpenIdConnectConfigResponse>
     */
    public AsyncInvoker<UpdateOpenIdConnectConfigRequest, UpdateOpenIdConnectConfigResponse> updateOpenIdConnectConfigAsyncInvoker(
        UpdateOpenIdConnectConfigRequest request) {
        return new AsyncInvoker<>(request, IamMeta.updateOpenIdConnectConfig, hcClient);
    }

    /**
     * 设置项目状态
     *
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)设置项目状态。项目状态包括：正常、冻结。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateProjectStatusRequest 请求对象
     * @return CompletableFuture<UpdateProjectStatusResponse>
     */
    public CompletableFuture<UpdateProjectStatusResponse> updateProjectStatusAsync(UpdateProjectStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.updateProjectStatus);
    }

    /**
     * 设置项目状态
     *
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)设置项目状态。项目状态包括：正常、冻结。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateProjectStatusRequest 请求对象
     * @return AsyncInvoker<UpdateProjectStatusRequest, UpdateProjectStatusResponse>
     */
    public AsyncInvoker<UpdateProjectStatusRequest, UpdateProjectStatusResponse> updateProjectStatusAsyncInvoker(
        UpdateProjectStatusRequest request) {
        return new AsyncInvoker<>(request, IamMeta.updateProjectStatus, hcClient);
    }

    /**
     * 创建永久访问密钥
     *
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)给IAM用户创建永久访问密钥，或IAM用户给自己创建永久访问密钥。
     * 
     * 访问密钥（Access Key ID/Secret Access Key，简称AK/SK），是您通过开发工具（API、CLI、SDK）访问华为云时的身份凭证，不用于登录控制台。系统通过AK识别访问用户的身份，通过SK进行签名验证，通过加密签名验证可以确保请求的机密性、完整性和请求者身份的正确性。在控制台创建访问密钥的方式请参见：[访问密钥](https://support.huaweicloud.com/usermanual-ca/zh-cn_topic_0046606340.html) 。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePermanentAccessKeyRequest 请求对象
     * @return CompletableFuture<CreatePermanentAccessKeyResponse>
     */
    public CompletableFuture<CreatePermanentAccessKeyResponse> createPermanentAccessKeyAsync(
        CreatePermanentAccessKeyRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.createPermanentAccessKey);
    }

    /**
     * 创建永久访问密钥
     *
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)给IAM用户创建永久访问密钥，或IAM用户给自己创建永久访问密钥。
     * 
     * 访问密钥（Access Key ID/Secret Access Key，简称AK/SK），是您通过开发工具（API、CLI、SDK）访问华为云时的身份凭证，不用于登录控制台。系统通过AK识别访问用户的身份，通过SK进行签名验证，通过加密签名验证可以确保请求的机密性、完整性和请求者身份的正确性。在控制台创建访问密钥的方式请参见：[访问密钥](https://support.huaweicloud.com/usermanual-ca/zh-cn_topic_0046606340.html) 。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePermanentAccessKeyRequest 请求对象
     * @return AsyncInvoker<CreatePermanentAccessKeyRequest, CreatePermanentAccessKeyResponse>
     */
    public AsyncInvoker<CreatePermanentAccessKeyRequest, CreatePermanentAccessKeyResponse> createPermanentAccessKeyAsyncInvoker(
        CreatePermanentAccessKeyRequest request) {
        return new AsyncInvoker<>(request, IamMeta.createPermanentAccessKey, hcClient);
    }

    /**
     * 通过委托获取临时访问密钥
     *
     * 该接口可以用于通过委托来获取临时访问密钥（临时AK/SK）和securitytoken。
     * 
     * 临时AK/SK和securitytoken是系统颁发给IAM用户的临时访问令牌，有效期为15分钟至24小时，过期后需要重新获取。临时AK/SK和securitytoken遵循权限最小化原则。鉴权时，临时AK/SK和securitytoken必须同时使用，请求头中需要添加“x-security-token”字段，使用方法详情请参考：[API签名参考](https://support.huaweicloud.com/devg-apisign/api-sign-provide.html) 。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTemporaryAccessKeyByAgencyRequest 请求对象
     * @return CompletableFuture<CreateTemporaryAccessKeyByAgencyResponse>
     */
    public CompletableFuture<CreateTemporaryAccessKeyByAgencyResponse> createTemporaryAccessKeyByAgencyAsync(
        CreateTemporaryAccessKeyByAgencyRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.createTemporaryAccessKeyByAgency);
    }

    /**
     * 通过委托获取临时访问密钥
     *
     * 该接口可以用于通过委托来获取临时访问密钥（临时AK/SK）和securitytoken。
     * 
     * 临时AK/SK和securitytoken是系统颁发给IAM用户的临时访问令牌，有效期为15分钟至24小时，过期后需要重新获取。临时AK/SK和securitytoken遵循权限最小化原则。鉴权时，临时AK/SK和securitytoken必须同时使用，请求头中需要添加“x-security-token”字段，使用方法详情请参考：[API签名参考](https://support.huaweicloud.com/devg-apisign/api-sign-provide.html) 。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTemporaryAccessKeyByAgencyRequest 请求对象
     * @return AsyncInvoker<CreateTemporaryAccessKeyByAgencyRequest, CreateTemporaryAccessKeyByAgencyResponse>
     */
    public AsyncInvoker<CreateTemporaryAccessKeyByAgencyRequest, CreateTemporaryAccessKeyByAgencyResponse> createTemporaryAccessKeyByAgencyAsyncInvoker(
        CreateTemporaryAccessKeyByAgencyRequest request) {
        return new AsyncInvoker<>(request, IamMeta.createTemporaryAccessKeyByAgency, hcClient);
    }

    /**
     * 通过token获取临时访问密钥
     *
     * 该接口可以用于通过token来获取临时AK/SK和securitytoken。
     * 
     * 临时AK/SK和securitytoken是系统颁发给IAM用户的临时访问令牌，有效期为15分钟至24小时，过期后需要重新获取。临时AK/SK和securitytoken遵循权限最小化原则。鉴权时，临时AK/SK和securitytoken必须同时使用，请求头中需要添加“x-security-token”字段，使用方法详情请参考：[API签名参考](https://support.huaweicloud.com/devg-apisign/api-sign-provide.html)。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTemporaryAccessKeyByTokenRequest 请求对象
     * @return CompletableFuture<CreateTemporaryAccessKeyByTokenResponse>
     */
    public CompletableFuture<CreateTemporaryAccessKeyByTokenResponse> createTemporaryAccessKeyByTokenAsync(
        CreateTemporaryAccessKeyByTokenRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.createTemporaryAccessKeyByToken);
    }

    /**
     * 通过token获取临时访问密钥
     *
     * 该接口可以用于通过token来获取临时AK/SK和securitytoken。
     * 
     * 临时AK/SK和securitytoken是系统颁发给IAM用户的临时访问令牌，有效期为15分钟至24小时，过期后需要重新获取。临时AK/SK和securitytoken遵循权限最小化原则。鉴权时，临时AK/SK和securitytoken必须同时使用，请求头中需要添加“x-security-token”字段，使用方法详情请参考：[API签名参考](https://support.huaweicloud.com/devg-apisign/api-sign-provide.html)。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTemporaryAccessKeyByTokenRequest 请求对象
     * @return AsyncInvoker<CreateTemporaryAccessKeyByTokenRequest, CreateTemporaryAccessKeyByTokenResponse>
     */
    public AsyncInvoker<CreateTemporaryAccessKeyByTokenRequest, CreateTemporaryAccessKeyByTokenResponse> createTemporaryAccessKeyByTokenAsyncInvoker(
        CreateTemporaryAccessKeyByTokenRequest request) {
        return new AsyncInvoker<>(request, IamMeta.createTemporaryAccessKeyByToken, hcClient);
    }

    /**
     * 删除指定永久访问密钥
     *
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)删除IAM用户的指定永久访问密钥，或IAM用户删除自己的指定永久访问密钥。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePermanentAccessKeyRequest 请求对象
     * @return CompletableFuture<DeletePermanentAccessKeyResponse>
     */
    public CompletableFuture<DeletePermanentAccessKeyResponse> deletePermanentAccessKeyAsync(
        DeletePermanentAccessKeyRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.deletePermanentAccessKey);
    }

    /**
     * 删除指定永久访问密钥
     *
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)删除IAM用户的指定永久访问密钥，或IAM用户删除自己的指定永久访问密钥。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePermanentAccessKeyRequest 请求对象
     * @return AsyncInvoker<DeletePermanentAccessKeyRequest, DeletePermanentAccessKeyResponse>
     */
    public AsyncInvoker<DeletePermanentAccessKeyRequest, DeletePermanentAccessKeyResponse> deletePermanentAccessKeyAsyncInvoker(
        DeletePermanentAccessKeyRequest request) {
        return new AsyncInvoker<>(request, IamMeta.deletePermanentAccessKey, hcClient);
    }

    /**
     * 查询所有永久访问密钥
     *
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询IAM用户的所有永久访问密钥，或IAM用户查询自己的所有永久访问密钥。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPermanentAccessKeysRequest 请求对象
     * @return CompletableFuture<ListPermanentAccessKeysResponse>
     */
    public CompletableFuture<ListPermanentAccessKeysResponse> listPermanentAccessKeysAsync(
        ListPermanentAccessKeysRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.listPermanentAccessKeys);
    }

    /**
     * 查询所有永久访问密钥
     *
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询IAM用户的所有永久访问密钥，或IAM用户查询自己的所有永久访问密钥。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPermanentAccessKeysRequest 请求对象
     * @return AsyncInvoker<ListPermanentAccessKeysRequest, ListPermanentAccessKeysResponse>
     */
    public AsyncInvoker<ListPermanentAccessKeysRequest, ListPermanentAccessKeysResponse> listPermanentAccessKeysAsyncInvoker(
        ListPermanentAccessKeysRequest request) {
        return new AsyncInvoker<>(request, IamMeta.listPermanentAccessKeys, hcClient);
    }

    /**
     * 查询指定永久访问密钥
     *
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询IAM用户的指定永久访问密钥，或IAM用户查询自己的指定永久访问密钥。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPermanentAccessKeyRequest 请求对象
     * @return CompletableFuture<ShowPermanentAccessKeyResponse>
     */
    public CompletableFuture<ShowPermanentAccessKeyResponse> showPermanentAccessKeyAsync(
        ShowPermanentAccessKeyRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.showPermanentAccessKey);
    }

    /**
     * 查询指定永久访问密钥
     *
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询IAM用户的指定永久访问密钥，或IAM用户查询自己的指定永久访问密钥。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPermanentAccessKeyRequest 请求对象
     * @return AsyncInvoker<ShowPermanentAccessKeyRequest, ShowPermanentAccessKeyResponse>
     */
    public AsyncInvoker<ShowPermanentAccessKeyRequest, ShowPermanentAccessKeyResponse> showPermanentAccessKeyAsyncInvoker(
        ShowPermanentAccessKeyRequest request) {
        return new AsyncInvoker<>(request, IamMeta.showPermanentAccessKey, hcClient);
    }

    /**
     * 修改指定永久访问密钥
     *
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)修改IAM用户的指定永久访问密钥，或IAM用户修改自己的指定永久访问密钥。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePermanentAccessKeyRequest 请求对象
     * @return CompletableFuture<UpdatePermanentAccessKeyResponse>
     */
    public CompletableFuture<UpdatePermanentAccessKeyResponse> updatePermanentAccessKeyAsync(
        UpdatePermanentAccessKeyRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.updatePermanentAccessKey);
    }

    /**
     * 修改指定永久访问密钥
     *
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)修改IAM用户的指定永久访问密钥，或IAM用户修改自己的指定永久访问密钥。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePermanentAccessKeyRequest 请求对象
     * @return AsyncInvoker<UpdatePermanentAccessKeyRequest, UpdatePermanentAccessKeyResponse>
     */
    public AsyncInvoker<UpdatePermanentAccessKeyRequest, UpdatePermanentAccessKeyResponse> updatePermanentAccessKeyAsyncInvoker(
        UpdatePermanentAccessKeyRequest request) {
        return new AsyncInvoker<>(request, IamMeta.updatePermanentAccessKey, hcClient);
    }

    /**
     * 管理员创建IAM用户（推荐）
     *
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)创建IAM用户。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateUserRequest 请求对象
     * @return CompletableFuture<CreateUserResponse>
     */
    public CompletableFuture<CreateUserResponse> createUserAsync(CreateUserRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.createUser);
    }

    /**
     * 管理员创建IAM用户（推荐）
     *
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)创建IAM用户。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateUserRequest 请求对象
     * @return AsyncInvoker<CreateUserRequest, CreateUserResponse>
     */
    public AsyncInvoker<CreateUserRequest, CreateUserResponse> createUserAsyncInvoker(CreateUserRequest request) {
        return new AsyncInvoker<>(request, IamMeta.createUser, hcClient);
    }

    /**
     * 管理员创建IAM用户
     *
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)创建IAM用户。IAM用户首次登录时需要修改密码。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request KeystoneCreateUserRequest 请求对象
     * @return CompletableFuture<KeystoneCreateUserResponse>
     */
    public CompletableFuture<KeystoneCreateUserResponse> keystoneCreateUserAsync(KeystoneCreateUserRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.keystoneCreateUser);
    }

    /**
     * 管理员创建IAM用户
     *
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)创建IAM用户。IAM用户首次登录时需要修改密码。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request KeystoneCreateUserRequest 请求对象
     * @return AsyncInvoker<KeystoneCreateUserRequest, KeystoneCreateUserResponse>
     */
    public AsyncInvoker<KeystoneCreateUserRequest, KeystoneCreateUserResponse> keystoneCreateUserAsyncInvoker(
        KeystoneCreateUserRequest request) {
        return new AsyncInvoker<>(request, IamMeta.keystoneCreateUser, hcClient);
    }

    /**
     * 管理员删除IAM用户
     *
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)删除指定IAM用户。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request KeystoneDeleteUserRequest 请求对象
     * @return CompletableFuture<KeystoneDeleteUserResponse>
     */
    public CompletableFuture<KeystoneDeleteUserResponse> keystoneDeleteUserAsync(KeystoneDeleteUserRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.keystoneDeleteUser);
    }

    /**
     * 管理员删除IAM用户
     *
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)删除指定IAM用户。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request KeystoneDeleteUserRequest 请求对象
     * @return AsyncInvoker<KeystoneDeleteUserRequest, KeystoneDeleteUserResponse>
     */
    public AsyncInvoker<KeystoneDeleteUserRequest, KeystoneDeleteUserResponse> keystoneDeleteUserAsyncInvoker(
        KeystoneDeleteUserRequest request) {
        return new AsyncInvoker<>(request, IamMeta.keystoneDeleteUser, hcClient);
    }

    /**
     * 查询IAM用户所属用户组
     *
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询IAM用户所属用户组，或IAM用户查询自己所属用户组。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request KeystoneListGroupsForUserRequest 请求对象
     * @return CompletableFuture<KeystoneListGroupsForUserResponse>
     */
    public CompletableFuture<KeystoneListGroupsForUserResponse> keystoneListGroupsForUserAsync(
        KeystoneListGroupsForUserRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.keystoneListGroupsForUser);
    }

    /**
     * 查询IAM用户所属用户组
     *
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询IAM用户所属用户组，或IAM用户查询自己所属用户组。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request KeystoneListGroupsForUserRequest 请求对象
     * @return AsyncInvoker<KeystoneListGroupsForUserRequest, KeystoneListGroupsForUserResponse>
     */
    public AsyncInvoker<KeystoneListGroupsForUserRequest, KeystoneListGroupsForUserResponse> keystoneListGroupsForUserAsyncInvoker(
        KeystoneListGroupsForUserRequest request) {
        return new AsyncInvoker<>(request, IamMeta.keystoneListGroupsForUser, hcClient);
    }

    /**
     * 管理员查询IAM用户列表
     *
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询IAM用户列表。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request KeystoneListUsersRequest 请求对象
     * @return CompletableFuture<KeystoneListUsersResponse>
     */
    public CompletableFuture<KeystoneListUsersResponse> keystoneListUsersAsync(KeystoneListUsersRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.keystoneListUsers);
    }

    /**
     * 管理员查询IAM用户列表
     *
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询IAM用户列表。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request KeystoneListUsersRequest 请求对象
     * @return AsyncInvoker<KeystoneListUsersRequest, KeystoneListUsersResponse>
     */
    public AsyncInvoker<KeystoneListUsersRequest, KeystoneListUsersResponse> keystoneListUsersAsyncInvoker(
        KeystoneListUsersRequest request) {
        return new AsyncInvoker<>(request, IamMeta.keystoneListUsers, hcClient);
    }

    /**
     * 管理员查询用户组所包含的IAM用户
     *
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询用户组中所包含的IAM用户。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request KeystoneListUsersForGroupByAdminRequest 请求对象
     * @return CompletableFuture<KeystoneListUsersForGroupByAdminResponse>
     */
    public CompletableFuture<KeystoneListUsersForGroupByAdminResponse> keystoneListUsersForGroupByAdminAsync(
        KeystoneListUsersForGroupByAdminRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.keystoneListUsersForGroupByAdmin);
    }

    /**
     * 管理员查询用户组所包含的IAM用户
     *
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询用户组中所包含的IAM用户。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request KeystoneListUsersForGroupByAdminRequest 请求对象
     * @return AsyncInvoker<KeystoneListUsersForGroupByAdminRequest, KeystoneListUsersForGroupByAdminResponse>
     */
    public AsyncInvoker<KeystoneListUsersForGroupByAdminRequest, KeystoneListUsersForGroupByAdminResponse> keystoneListUsersForGroupByAdminAsyncInvoker(
        KeystoneListUsersForGroupByAdminRequest request) {
        return new AsyncInvoker<>(request, IamMeta.keystoneListUsersForGroupByAdmin, hcClient);
    }

    /**
     * 查询IAM用户详情
     *
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询IAM用户详情，或IAM用户查询自己的用户详情。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request KeystoneShowUserRequest 请求对象
     * @return CompletableFuture<KeystoneShowUserResponse>
     */
    public CompletableFuture<KeystoneShowUserResponse> keystoneShowUserAsync(KeystoneShowUserRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.keystoneShowUser);
    }

    /**
     * 查询IAM用户详情
     *
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询IAM用户详情，或IAM用户查询自己的用户详情。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request KeystoneShowUserRequest 请求对象
     * @return AsyncInvoker<KeystoneShowUserRequest, KeystoneShowUserResponse>
     */
    public AsyncInvoker<KeystoneShowUserRequest, KeystoneShowUserResponse> keystoneShowUserAsyncInvoker(
        KeystoneShowUserRequest request) {
        return new AsyncInvoker<>(request, IamMeta.keystoneShowUser, hcClient);
    }

    /**
     * 管理员修改IAM用户信息
     *
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)修改IAM用户信息。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request KeystoneUpdateUserByAdminRequest 请求对象
     * @return CompletableFuture<KeystoneUpdateUserByAdminResponse>
     */
    public CompletableFuture<KeystoneUpdateUserByAdminResponse> keystoneUpdateUserByAdminAsync(
        KeystoneUpdateUserByAdminRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.keystoneUpdateUserByAdmin);
    }

    /**
     * 管理员修改IAM用户信息
     *
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)修改IAM用户信息。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request KeystoneUpdateUserByAdminRequest 请求对象
     * @return AsyncInvoker<KeystoneUpdateUserByAdminRequest, KeystoneUpdateUserByAdminResponse>
     */
    public AsyncInvoker<KeystoneUpdateUserByAdminRequest, KeystoneUpdateUserByAdminResponse> keystoneUpdateUserByAdminAsyncInvoker(
        KeystoneUpdateUserByAdminRequest request) {
        return new AsyncInvoker<>(request, IamMeta.keystoneUpdateUserByAdmin, hcClient);
    }

    /**
     * 修改IAM用户密码
     *
     * 该接口可以用于IAM用户修改自己的密码。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request KeystoneUpdateUserPasswordRequest 请求对象
     * @return CompletableFuture<KeystoneUpdateUserPasswordResponse>
     */
    public CompletableFuture<KeystoneUpdateUserPasswordResponse> keystoneUpdateUserPasswordAsync(
        KeystoneUpdateUserPasswordRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.keystoneUpdateUserPassword);
    }

    /**
     * 修改IAM用户密码
     *
     * 该接口可以用于IAM用户修改自己的密码。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request KeystoneUpdateUserPasswordRequest 请求对象
     * @return AsyncInvoker<KeystoneUpdateUserPasswordRequest, KeystoneUpdateUserPasswordResponse>
     */
    public AsyncInvoker<KeystoneUpdateUserPasswordRequest, KeystoneUpdateUserPasswordResponse> keystoneUpdateUserPasswordAsyncInvoker(
        KeystoneUpdateUserPasswordRequest request) {
        return new AsyncInvoker<>(request, IamMeta.keystoneUpdateUserPassword, hcClient);
    }

    /**
     * 查询IAM用户的登录保护状态信息列表
     *
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询IAM用户的登录保护状态列表。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUserLoginProtectsRequest 请求对象
     * @return CompletableFuture<ListUserLoginProtectsResponse>
     */
    public CompletableFuture<ListUserLoginProtectsResponse> listUserLoginProtectsAsync(
        ListUserLoginProtectsRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.listUserLoginProtects);
    }

    /**
     * 查询IAM用户的登录保护状态信息列表
     *
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询IAM用户的登录保护状态列表。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUserLoginProtectsRequest 请求对象
     * @return AsyncInvoker<ListUserLoginProtectsRequest, ListUserLoginProtectsResponse>
     */
    public AsyncInvoker<ListUserLoginProtectsRequest, ListUserLoginProtectsResponse> listUserLoginProtectsAsyncInvoker(
        ListUserLoginProtectsRequest request) {
        return new AsyncInvoker<>(request, IamMeta.listUserLoginProtects, hcClient);
    }

    /**
     * 查询IAM用户的MFA绑定信息列表
     *
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询IAM用户的MFA绑定信息列表。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUserMfaDevicesRequest 请求对象
     * @return CompletableFuture<ListUserMfaDevicesResponse>
     */
    public CompletableFuture<ListUserMfaDevicesResponse> listUserMfaDevicesAsync(ListUserMfaDevicesRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.listUserMfaDevices);
    }

    /**
     * 查询IAM用户的MFA绑定信息列表
     *
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询IAM用户的MFA绑定信息列表。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUserMfaDevicesRequest 请求对象
     * @return AsyncInvoker<ListUserMfaDevicesRequest, ListUserMfaDevicesResponse>
     */
    public AsyncInvoker<ListUserMfaDevicesRequest, ListUserMfaDevicesResponse> listUserMfaDevicesAsyncInvoker(
        ListUserMfaDevicesRequest request) {
        return new AsyncInvoker<>(request, IamMeta.listUserMfaDevices, hcClient);
    }

    /**
     * 查询IAM用户详情（推荐）
     *
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询IAM用户详情，或IAM用户查询自己的详情。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowUserRequest 请求对象
     * @return CompletableFuture<ShowUserResponse>
     */
    public CompletableFuture<ShowUserResponse> showUserAsync(ShowUserRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.showUser);
    }

    /**
     * 查询IAM用户详情（推荐）
     *
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询IAM用户详情，或IAM用户查询自己的详情。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowUserRequest 请求对象
     * @return AsyncInvoker<ShowUserRequest, ShowUserResponse>
     */
    public AsyncInvoker<ShowUserRequest, ShowUserResponse> showUserAsyncInvoker(ShowUserRequest request) {
        return new AsyncInvoker<>(request, IamMeta.showUser, hcClient);
    }

    /**
     * 查询指定IAM用户的登录保护状态信息
     *
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询指定IAM用户的登录保护状态信息，或IAM用户查询自己的登录保护状态信息。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowUserLoginProtectRequest 请求对象
     * @return CompletableFuture<ShowUserLoginProtectResponse>
     */
    public CompletableFuture<ShowUserLoginProtectResponse> showUserLoginProtectAsync(
        ShowUserLoginProtectRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.showUserLoginProtect);
    }

    /**
     * 查询指定IAM用户的登录保护状态信息
     *
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询指定IAM用户的登录保护状态信息，或IAM用户查询自己的登录保护状态信息。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowUserLoginProtectRequest 请求对象
     * @return AsyncInvoker<ShowUserLoginProtectRequest, ShowUserLoginProtectResponse>
     */
    public AsyncInvoker<ShowUserLoginProtectRequest, ShowUserLoginProtectResponse> showUserLoginProtectAsyncInvoker(
        ShowUserLoginProtectRequest request) {
        return new AsyncInvoker<>(request, IamMeta.showUserLoginProtect, hcClient);
    }

    /**
     * 查询指定IAM用户的MFA绑定信息
     *
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询指定IAM用户的MFA绑定信息，或IAM用户查询自己的MFA绑定信息。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowUserMfaDeviceRequest 请求对象
     * @return CompletableFuture<ShowUserMfaDeviceResponse>
     */
    public CompletableFuture<ShowUserMfaDeviceResponse> showUserMfaDeviceAsync(ShowUserMfaDeviceRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.showUserMfaDevice);
    }

    /**
     * 查询指定IAM用户的MFA绑定信息
     *
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)查询指定IAM用户的MFA绑定信息，或IAM用户查询自己的MFA绑定信息。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowUserMfaDeviceRequest 请求对象
     * @return AsyncInvoker<ShowUserMfaDeviceRequest, ShowUserMfaDeviceResponse>
     */
    public AsyncInvoker<ShowUserMfaDeviceRequest, ShowUserMfaDeviceResponse> showUserMfaDeviceAsyncInvoker(
        ShowUserMfaDeviceRequest request) {
        return new AsyncInvoker<>(request, IamMeta.showUserMfaDevice, hcClient);
    }

    /**
     * 修改IAM用户登录保护状态信息
     *
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)修改账号操作保护。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateLoginProtectRequest 请求对象
     * @return CompletableFuture<UpdateLoginProtectResponse>
     */
    public CompletableFuture<UpdateLoginProtectResponse> updateLoginProtectAsync(UpdateLoginProtectRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.updateLoginProtect);
    }

    /**
     * 修改IAM用户登录保护状态信息
     *
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)修改账号操作保护。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateLoginProtectRequest 请求对象
     * @return AsyncInvoker<UpdateLoginProtectRequest, UpdateLoginProtectResponse>
     */
    public AsyncInvoker<UpdateLoginProtectRequest, UpdateLoginProtectResponse> updateLoginProtectAsyncInvoker(
        UpdateLoginProtectRequest request) {
        return new AsyncInvoker<>(request, IamMeta.updateLoginProtect, hcClient);
    }

    /**
     * 管理员修改IAM用户信息（推荐）
     *
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)修改IAM用户信息 。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateUserRequest 请求对象
     * @return CompletableFuture<UpdateUserResponse>
     */
    public CompletableFuture<UpdateUserResponse> updateUserAsync(UpdateUserRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.updateUser);
    }

    /**
     * 管理员修改IAM用户信息（推荐）
     *
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)修改IAM用户信息 。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateUserRequest 请求对象
     * @return AsyncInvoker<UpdateUserRequest, UpdateUserResponse>
     */
    public AsyncInvoker<UpdateUserRequest, UpdateUserResponse> updateUserAsyncInvoker(UpdateUserRequest request) {
        return new AsyncInvoker<>(request, IamMeta.updateUser, hcClient);
    }

    /**
     * 修改IAM用户信息（推荐）
     *
     * 该接口可以用于IAM用户修改自己的用户信息。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateUserInformationRequest 请求对象
     * @return CompletableFuture<UpdateUserInformationResponse>
     */
    public CompletableFuture<UpdateUserInformationResponse> updateUserInformationAsync(
        UpdateUserInformationRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.updateUserInformation);
    }

    /**
     * 修改IAM用户信息（推荐）
     *
     * 该接口可以用于IAM用户修改自己的用户信息。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateUserInformationRequest 请求对象
     * @return AsyncInvoker<UpdateUserInformationRequest, UpdateUserInformationResponse>
     */
    public AsyncInvoker<UpdateUserInformationRequest, UpdateUserInformationResponse> updateUserInformationAsyncInvoker(
        UpdateUserInformationRequest request) {
        return new AsyncInvoker<>(request, IamMeta.updateUserInformation, hcClient);
    }

    /**
     * 获取委托Token
     *
     * 该接口可以用于获取委托方的token。
     * 
     * 例如：A账号希望B账号管理自己的某些资源，所以A账号创建了委托给B账号，则A账号为委托方，B账号为被委托方。那么B账号可以通过该接口获取委托token。B账号仅能使用该token管理A账号的委托资源，不能管理自己账号中的资源。如果B账号需要管理自己账号中的资源，则需要获取自己的用户token。
     * 
     * token是系统颁发给用户的访问令牌，承载用户的身份、权限等信息。调用IAM以及其他云服务的接口时，可以使用本接口获取的token进行鉴权。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。如果使用全局区域的Endpoint调用，该token可以在所有区域使用；如果使用非全局区域的Endpoint调用，则该token仅在该区域生效，不能跨区域使用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * &gt; - token的有效期为24小时，建议进行缓存，避免频繁调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request KeystoneCreateAgencyTokenRequest 请求对象
     * @return CompletableFuture<KeystoneCreateAgencyTokenResponse>
     */
    public CompletableFuture<KeystoneCreateAgencyTokenResponse> keystoneCreateAgencyTokenAsync(
        KeystoneCreateAgencyTokenRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.keystoneCreateAgencyToken);
    }

    /**
     * 获取委托Token
     *
     * 该接口可以用于获取委托方的token。
     * 
     * 例如：A账号希望B账号管理自己的某些资源，所以A账号创建了委托给B账号，则A账号为委托方，B账号为被委托方。那么B账号可以通过该接口获取委托token。B账号仅能使用该token管理A账号的委托资源，不能管理自己账号中的资源。如果B账号需要管理自己账号中的资源，则需要获取自己的用户token。
     * 
     * token是系统颁发给用户的访问令牌，承载用户的身份、权限等信息。调用IAM以及其他云服务的接口时，可以使用本接口获取的token进行鉴权。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。如果使用全局区域的Endpoint调用，该token可以在所有区域使用；如果使用非全局区域的Endpoint调用，则该token仅在该区域生效，不能跨区域使用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * &gt; - token的有效期为24小时，建议进行缓存，避免频繁调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request KeystoneCreateAgencyTokenRequest 请求对象
     * @return AsyncInvoker<KeystoneCreateAgencyTokenRequest, KeystoneCreateAgencyTokenResponse>
     */
    public AsyncInvoker<KeystoneCreateAgencyTokenRequest, KeystoneCreateAgencyTokenResponse> keystoneCreateAgencyTokenAsyncInvoker(
        KeystoneCreateAgencyTokenRequest request) {
        return new AsyncInvoker<>(request, IamMeta.keystoneCreateAgencyToken, hcClient);
    }

    /**
     * 获取IAM用户Token（使用密码）
     *
     * 该接口可以用于通过用户名/密码的方式进行认证来获取IAM用户token。
     * 
     * token是系统颁发给IAM用户的访问令牌，承载用户的身份、权限等信息。调用IAM以及其他云服务的接口时，可以使用本接口获取的IAM用户token进行鉴权。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。如果使用全局区域的Endpoint调用，该token可以在所有区域使用；如果使用非全局区域的Endpoint调用，则该token仅在该区域生效，不能跨区域使用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * &gt; - token的有效期为24小时，建议进行缓存，避免频繁调用。
     * &gt; - 通过Postman获取用户token示例请参见：[如何通过Postman获取用户token](https://support.huaweicloud.com/iam_faq/iam_01_034.html)。
     * &gt; - 如果需要获取具有Security Administrator权限的token，请参见：[IAM 常见问题](https://support.huaweicloud.com/iam_faq/iam_01_0608.html)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request KeystoneCreateUserTokenByPasswordRequest 请求对象
     * @return CompletableFuture<KeystoneCreateUserTokenByPasswordResponse>
     */
    public CompletableFuture<KeystoneCreateUserTokenByPasswordResponse> keystoneCreateUserTokenByPasswordAsync(
        KeystoneCreateUserTokenByPasswordRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.keystoneCreateUserTokenByPassword);
    }

    /**
     * 获取IAM用户Token（使用密码）
     *
     * 该接口可以用于通过用户名/密码的方式进行认证来获取IAM用户token。
     * 
     * token是系统颁发给IAM用户的访问令牌，承载用户的身份、权限等信息。调用IAM以及其他云服务的接口时，可以使用本接口获取的IAM用户token进行鉴权。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。如果使用全局区域的Endpoint调用，该token可以在所有区域使用；如果使用非全局区域的Endpoint调用，则该token仅在该区域生效，不能跨区域使用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * &gt; - token的有效期为24小时，建议进行缓存，避免频繁调用。
     * &gt; - 通过Postman获取用户token示例请参见：[如何通过Postman获取用户token](https://support.huaweicloud.com/iam_faq/iam_01_034.html)。
     * &gt; - 如果需要获取具有Security Administrator权限的token，请参见：[IAM 常见问题](https://support.huaweicloud.com/iam_faq/iam_01_0608.html)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request KeystoneCreateUserTokenByPasswordRequest 请求对象
     * @return AsyncInvoker<KeystoneCreateUserTokenByPasswordRequest, KeystoneCreateUserTokenByPasswordResponse>
     */
    public AsyncInvoker<KeystoneCreateUserTokenByPasswordRequest, KeystoneCreateUserTokenByPasswordResponse> keystoneCreateUserTokenByPasswordAsyncInvoker(
        KeystoneCreateUserTokenByPasswordRequest request) {
        return new AsyncInvoker<>(request, IamMeta.keystoneCreateUserTokenByPassword, hcClient);
    }

    /**
     * 获取IAM用户Token（使用密码+虚拟MFA）
     *
     * 该接口可以用于通过用户名/密码+虚拟MFA的方式进行认证，在IAM用户开启了的登录保护功能，并选择通过虚拟MFA验证时获取IAM用户token。
     * 
     * token是系统颁发给用户的访问令牌，承载用户的身份、权限等信息。调用IAM以及其他云服务的接口时，可以使用本接口获取的token进行鉴权。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。如果使用全局区域的Endpoint调用，该token可以在所有区域使用；如果使用非全局区域的Endpoint调用，则该token仅在该区域生效，不能跨区域使用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * &gt; - token的有效期为24小时，建议进行缓存，避免频繁调用。
     * &gt; - 通过Postman获取用户token示例请参见：[如何通过Postman获取用户token](https://support.huaweicloud.com/iam_faq/iam_01_034.html)。
     * &gt; - 如果需要获取具有Security Administrator权限的token，请参见：[IAM 常见问题](https://support.huaweicloud.com/iam_faq/iam_01_0608.html)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request KeystoneCreateUserTokenByPasswordAndMfaRequest 请求对象
     * @return CompletableFuture<KeystoneCreateUserTokenByPasswordAndMfaResponse>
     */
    public CompletableFuture<KeystoneCreateUserTokenByPasswordAndMfaResponse> keystoneCreateUserTokenByPasswordAndMfaAsync(
        KeystoneCreateUserTokenByPasswordAndMfaRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.keystoneCreateUserTokenByPasswordAndMfa);
    }

    /**
     * 获取IAM用户Token（使用密码+虚拟MFA）
     *
     * 该接口可以用于通过用户名/密码+虚拟MFA的方式进行认证，在IAM用户开启了的登录保护功能，并选择通过虚拟MFA验证时获取IAM用户token。
     * 
     * token是系统颁发给用户的访问令牌，承载用户的身份、权限等信息。调用IAM以及其他云服务的接口时，可以使用本接口获取的token进行鉴权。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。如果使用全局区域的Endpoint调用，该token可以在所有区域使用；如果使用非全局区域的Endpoint调用，则该token仅在该区域生效，不能跨区域使用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * &gt; - token的有效期为24小时，建议进行缓存，避免频繁调用。
     * &gt; - 通过Postman获取用户token示例请参见：[如何通过Postman获取用户token](https://support.huaweicloud.com/iam_faq/iam_01_034.html)。
     * &gt; - 如果需要获取具有Security Administrator权限的token，请参见：[IAM 常见问题](https://support.huaweicloud.com/iam_faq/iam_01_0608.html)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request KeystoneCreateUserTokenByPasswordAndMfaRequest 请求对象
     * @return AsyncInvoker<KeystoneCreateUserTokenByPasswordAndMfaRequest, KeystoneCreateUserTokenByPasswordAndMfaResponse>
     */
    public AsyncInvoker<KeystoneCreateUserTokenByPasswordAndMfaRequest, KeystoneCreateUserTokenByPasswordAndMfaResponse> keystoneCreateUserTokenByPasswordAndMfaAsyncInvoker(
        KeystoneCreateUserTokenByPasswordAndMfaRequest request) {
        return new AsyncInvoker<>(request, IamMeta.keystoneCreateUserTokenByPasswordAndMfa, hcClient);
    }

    /**
     * 校验Token的有效性
     *
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)校验本账号中IAM用户token的有效性，或IAM用户校验自己token的有效性。管理员仅能校验本账号中IAM用户token的有效性，不能校验其他账号中IAM用户token的有效性。如果被校验的token有效，则返回该token的详细信息。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request KeystoneValidateTokenRequest 请求对象
     * @return CompletableFuture<KeystoneValidateTokenResponse>
     */
    public CompletableFuture<KeystoneValidateTokenResponse> keystoneValidateTokenAsync(
        KeystoneValidateTokenRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.keystoneValidateToken);
    }

    /**
     * 校验Token的有效性
     *
     * 该接口可以用于[管理员](https://support.huaweicloud.com/usermanual-iam/iam_01_0001.html)校验本账号中IAM用户token的有效性，或IAM用户校验自己token的有效性。管理员仅能校验本账号中IAM用户token的有效性，不能校验其他账号中IAM用户token的有效性。如果被校验的token有效，则返回该token的详细信息。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request KeystoneValidateTokenRequest 请求对象
     * @return AsyncInvoker<KeystoneValidateTokenRequest, KeystoneValidateTokenResponse>
     */
    public AsyncInvoker<KeystoneValidateTokenRequest, KeystoneValidateTokenResponse> keystoneValidateTokenAsyncInvoker(
        KeystoneValidateTokenRequest request) {
        return new AsyncInvoker<>(request, IamMeta.keystoneValidateToken, hcClient);
    }

}
