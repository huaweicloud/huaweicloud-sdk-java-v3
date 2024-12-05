package com.huaweicloud.sdk.iam.v3;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
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

public class IamClient {

    protected HcClient hcClient;

    public IamClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<IamClient> newBuilder() {
        ClientBuilder<IamClient> clientBuilder =
            new ClientBuilder<>(IamClient::new, "GlobalCredentials,BasicCredentials,IAMCredentials");
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
     * @return AssociateAgencyWithAllProjectsPermissionResponse
     */
    public AssociateAgencyWithAllProjectsPermissionResponse associateAgencyWithAllProjectsPermission(
        AssociateAgencyWithAllProjectsPermissionRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.associateAgencyWithAllProjectsPermission);
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
     * @return SyncInvoker<AssociateAgencyWithAllProjectsPermissionRequest, AssociateAgencyWithAllProjectsPermissionResponse>
     */
    public SyncInvoker<AssociateAgencyWithAllProjectsPermissionRequest, AssociateAgencyWithAllProjectsPermissionResponse> associateAgencyWithAllProjectsPermissionInvoker(
        AssociateAgencyWithAllProjectsPermissionRequest request) {
        return new SyncInvoker<>(request, IamMeta.associateAgencyWithAllProjectsPermission, hcClient);
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
     * @return AssociateAgencyWithDomainPermissionResponse
     */
    public AssociateAgencyWithDomainPermissionResponse associateAgencyWithDomainPermission(
        AssociateAgencyWithDomainPermissionRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.associateAgencyWithDomainPermission);
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
     * @return SyncInvoker<AssociateAgencyWithDomainPermissionRequest, AssociateAgencyWithDomainPermissionResponse>
     */
    public SyncInvoker<AssociateAgencyWithDomainPermissionRequest, AssociateAgencyWithDomainPermissionResponse> associateAgencyWithDomainPermissionInvoker(
        AssociateAgencyWithDomainPermissionRequest request) {
        return new SyncInvoker<>(request, IamMeta.associateAgencyWithDomainPermission, hcClient);
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
     * @return AssociateAgencyWithProjectPermissionResponse
     */
    public AssociateAgencyWithProjectPermissionResponse associateAgencyWithProjectPermission(
        AssociateAgencyWithProjectPermissionRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.associateAgencyWithProjectPermission);
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
     * @return SyncInvoker<AssociateAgencyWithProjectPermissionRequest, AssociateAgencyWithProjectPermissionResponse>
     */
    public SyncInvoker<AssociateAgencyWithProjectPermissionRequest, AssociateAgencyWithProjectPermissionResponse> associateAgencyWithProjectPermissionInvoker(
        AssociateAgencyWithProjectPermissionRequest request) {
        return new SyncInvoker<>(request, IamMeta.associateAgencyWithProjectPermission, hcClient);
    }

    /**
     * 基于委托为企业项目授权
     *
     * 该接口可以基于委托为企业项目授权
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AssociateRoleToAgencyOnEnterpriseProjectRequest 请求对象
     * @return AssociateRoleToAgencyOnEnterpriseProjectResponse
     */
    public AssociateRoleToAgencyOnEnterpriseProjectResponse associateRoleToAgencyOnEnterpriseProject(
        AssociateRoleToAgencyOnEnterpriseProjectRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.associateRoleToAgencyOnEnterpriseProject);
    }

    /**
     * 基于委托为企业项目授权
     *
     * 该接口可以基于委托为企业项目授权
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AssociateRoleToAgencyOnEnterpriseProjectRequest 请求对象
     * @return SyncInvoker<AssociateRoleToAgencyOnEnterpriseProjectRequest, AssociateRoleToAgencyOnEnterpriseProjectResponse>
     */
    public SyncInvoker<AssociateRoleToAgencyOnEnterpriseProjectRequest, AssociateRoleToAgencyOnEnterpriseProjectResponse> associateRoleToAgencyOnEnterpriseProjectInvoker(
        AssociateRoleToAgencyOnEnterpriseProjectRequest request) {
        return new SyncInvoker<>(request, IamMeta.associateRoleToAgencyOnEnterpriseProject, hcClient);
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
     * @return AssociateRoleToGroupOnEnterpriseProjectResponse
     */
    public AssociateRoleToGroupOnEnterpriseProjectResponse associateRoleToGroupOnEnterpriseProject(
        AssociateRoleToGroupOnEnterpriseProjectRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.associateRoleToGroupOnEnterpriseProject);
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
     * @return SyncInvoker<AssociateRoleToGroupOnEnterpriseProjectRequest, AssociateRoleToGroupOnEnterpriseProjectResponse>
     */
    public SyncInvoker<AssociateRoleToGroupOnEnterpriseProjectRequest, AssociateRoleToGroupOnEnterpriseProjectResponse> associateRoleToGroupOnEnterpriseProjectInvoker(
        AssociateRoleToGroupOnEnterpriseProjectRequest request) {
        return new SyncInvoker<>(request, IamMeta.associateRoleToGroupOnEnterpriseProject, hcClient);
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
     * @return AssociateRoleToUserOnEnterpriseProjectResponse
     */
    public AssociateRoleToUserOnEnterpriseProjectResponse associateRoleToUserOnEnterpriseProject(
        AssociateRoleToUserOnEnterpriseProjectRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.associateRoleToUserOnEnterpriseProject);
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
     * @return SyncInvoker<AssociateRoleToUserOnEnterpriseProjectRequest, AssociateRoleToUserOnEnterpriseProjectResponse>
     */
    public SyncInvoker<AssociateRoleToUserOnEnterpriseProjectRequest, AssociateRoleToUserOnEnterpriseProjectResponse> associateRoleToUserOnEnterpriseProjectInvoker(
        AssociateRoleToUserOnEnterpriseProjectRequest request) {
        return new SyncInvoker<>(request, IamMeta.associateRoleToUserOnEnterpriseProject, hcClient);
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
     * @return CheckAllProjectsPermissionForAgencyResponse
     */
    public CheckAllProjectsPermissionForAgencyResponse checkAllProjectsPermissionForAgency(
        CheckAllProjectsPermissionForAgencyRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.checkAllProjectsPermissionForAgency);
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
     * @return SyncInvoker<CheckAllProjectsPermissionForAgencyRequest, CheckAllProjectsPermissionForAgencyResponse>
     */
    public SyncInvoker<CheckAllProjectsPermissionForAgencyRequest, CheckAllProjectsPermissionForAgencyResponse> checkAllProjectsPermissionForAgencyInvoker(
        CheckAllProjectsPermissionForAgencyRequest request) {
        return new SyncInvoker<>(request, IamMeta.checkAllProjectsPermissionForAgency, hcClient);
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
     * @return CheckDomainPermissionForAgencyResponse
     */
    public CheckDomainPermissionForAgencyResponse checkDomainPermissionForAgency(
        CheckDomainPermissionForAgencyRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.checkDomainPermissionForAgency);
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
     * @return SyncInvoker<CheckDomainPermissionForAgencyRequest, CheckDomainPermissionForAgencyResponse>
     */
    public SyncInvoker<CheckDomainPermissionForAgencyRequest, CheckDomainPermissionForAgencyResponse> checkDomainPermissionForAgencyInvoker(
        CheckDomainPermissionForAgencyRequest request) {
        return new SyncInvoker<>(request, IamMeta.checkDomainPermissionForAgency, hcClient);
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
     * @return CheckProjectPermissionForAgencyResponse
     */
    public CheckProjectPermissionForAgencyResponse checkProjectPermissionForAgency(
        CheckProjectPermissionForAgencyRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.checkProjectPermissionForAgency);
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
     * @return SyncInvoker<CheckProjectPermissionForAgencyRequest, CheckProjectPermissionForAgencyResponse>
     */
    public SyncInvoker<CheckProjectPermissionForAgencyRequest, CheckProjectPermissionForAgencyResponse> checkProjectPermissionForAgencyInvoker(
        CheckProjectPermissionForAgencyRequest request) {
        return new SyncInvoker<>(request, IamMeta.checkProjectPermissionForAgency, hcClient);
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
     * @return CreateAgencyResponse
     */
    public CreateAgencyResponse createAgency(CreateAgencyRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.createAgency);
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
     * @return SyncInvoker<CreateAgencyRequest, CreateAgencyResponse>
     */
    public SyncInvoker<CreateAgencyRequest, CreateAgencyResponse> createAgencyInvoker(CreateAgencyRequest request) {
        return new SyncInvoker<>(request, IamMeta.createAgency, hcClient);
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
     * @return CreateAgencyCustomPolicyResponse
     */
    public CreateAgencyCustomPolicyResponse createAgencyCustomPolicy(CreateAgencyCustomPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.createAgencyCustomPolicy);
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
     * @return SyncInvoker<CreateAgencyCustomPolicyRequest, CreateAgencyCustomPolicyResponse>
     */
    public SyncInvoker<CreateAgencyCustomPolicyRequest, CreateAgencyCustomPolicyResponse> createAgencyCustomPolicyInvoker(
        CreateAgencyCustomPolicyRequest request) {
        return new SyncInvoker<>(request, IamMeta.createAgencyCustomPolicy, hcClient);
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
     * @return CreateBindingDeviceResponse
     */
    public CreateBindingDeviceResponse createBindingDevice(CreateBindingDeviceRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.createBindingDevice);
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
     * @return SyncInvoker<CreateBindingDeviceRequest, CreateBindingDeviceResponse>
     */
    public SyncInvoker<CreateBindingDeviceRequest, CreateBindingDeviceResponse> createBindingDeviceInvoker(
        CreateBindingDeviceRequest request) {
        return new SyncInvoker<>(request, IamMeta.createBindingDevice, hcClient);
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
     * @return CreateCloudServiceCustomPolicyResponse
     */
    public CreateCloudServiceCustomPolicyResponse createCloudServiceCustomPolicy(
        CreateCloudServiceCustomPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.createCloudServiceCustomPolicy);
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
     * @return SyncInvoker<CreateCloudServiceCustomPolicyRequest, CreateCloudServiceCustomPolicyResponse>
     */
    public SyncInvoker<CreateCloudServiceCustomPolicyRequest, CreateCloudServiceCustomPolicyResponse> createCloudServiceCustomPolicyInvoker(
        CreateCloudServiceCustomPolicyRequest request) {
        return new SyncInvoker<>(request, IamMeta.createCloudServiceCustomPolicy, hcClient);
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
     * @return CreateLoginTokenResponse
     */
    public CreateLoginTokenResponse createLoginToken(CreateLoginTokenRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.createLoginToken);
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
     * @return SyncInvoker<CreateLoginTokenRequest, CreateLoginTokenResponse>
     */
    public SyncInvoker<CreateLoginTokenRequest, CreateLoginTokenResponse> createLoginTokenInvoker(
        CreateLoginTokenRequest request) {
        return new SyncInvoker<>(request, IamMeta.createLoginToken, hcClient);
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
     * @return CreateMetadataResponse
     */
    public CreateMetadataResponse createMetadata(CreateMetadataRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.createMetadata);
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
     * @return SyncInvoker<CreateMetadataRequest, CreateMetadataResponse>
     */
    public SyncInvoker<CreateMetadataRequest, CreateMetadataResponse> createMetadataInvoker(
        CreateMetadataRequest request) {
        return new SyncInvoker<>(request, IamMeta.createMetadata, hcClient);
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
     * @return CreateMfaDeviceResponse
     */
    public CreateMfaDeviceResponse createMfaDevice(CreateMfaDeviceRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.createMfaDevice);
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
     * @return SyncInvoker<CreateMfaDeviceRequest, CreateMfaDeviceResponse>
     */
    public SyncInvoker<CreateMfaDeviceRequest, CreateMfaDeviceResponse> createMfaDeviceInvoker(
        CreateMfaDeviceRequest request) {
        return new SyncInvoker<>(request, IamMeta.createMfaDevice, hcClient);
    }

    /**
     * 创建OpenId Connect身份提供商配置
     *
     * 创建OpenId Connect身份提供商配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateOpenIdConnectConfigRequest 请求对象
     * @return CreateOpenIdConnectConfigResponse
     */
    public CreateOpenIdConnectConfigResponse createOpenIdConnectConfig(CreateOpenIdConnectConfigRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.createOpenIdConnectConfig);
    }

    /**
     * 创建OpenId Connect身份提供商配置
     *
     * 创建OpenId Connect身份提供商配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateOpenIdConnectConfigRequest 请求对象
     * @return SyncInvoker<CreateOpenIdConnectConfigRequest, CreateOpenIdConnectConfigResponse>
     */
    public SyncInvoker<CreateOpenIdConnectConfigRequest, CreateOpenIdConnectConfigResponse> createOpenIdConnectConfigInvoker(
        CreateOpenIdConnectConfigRequest request) {
        return new SyncInvoker<>(request, IamMeta.createOpenIdConnectConfig, hcClient);
    }

    /**
     * 获取联邦认证token(OpenId Connect Id token方式)
     *
     * 获取联邦认证token(OpenId Connect Id token方式)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTokenWithIdTokenRequest 请求对象
     * @return CreateTokenWithIdTokenResponse
     */
    public CreateTokenWithIdTokenResponse createTokenWithIdToken(CreateTokenWithIdTokenRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.createTokenWithIdToken);
    }

    /**
     * 获取联邦认证token(OpenId Connect Id token方式)
     *
     * 获取联邦认证token(OpenId Connect Id token方式)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTokenWithIdTokenRequest 请求对象
     * @return SyncInvoker<CreateTokenWithIdTokenRequest, CreateTokenWithIdTokenResponse>
     */
    public SyncInvoker<CreateTokenWithIdTokenRequest, CreateTokenWithIdTokenResponse> createTokenWithIdTokenInvoker(
        CreateTokenWithIdTokenRequest request) {
        return new SyncInvoker<>(request, IamMeta.createTokenWithIdToken, hcClient);
    }

    /**
     * 获取联邦认证unscoped token(OpenId Connect Id token方式)
     *
     * 获取联邦认证token(OpenId Connect Id token方式)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateUnscopedTokenWithIdTokenRequest 请求对象
     * @return CreateUnscopedTokenWithIdTokenResponse
     */
    public CreateUnscopedTokenWithIdTokenResponse createUnscopedTokenWithIdToken(
        CreateUnscopedTokenWithIdTokenRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.createUnscopedTokenWithIdToken);
    }

    /**
     * 获取联邦认证unscoped token(OpenId Connect Id token方式)
     *
     * 获取联邦认证token(OpenId Connect Id token方式)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateUnscopedTokenWithIdTokenRequest 请求对象
     * @return SyncInvoker<CreateUnscopedTokenWithIdTokenRequest, CreateUnscopedTokenWithIdTokenResponse>
     */
    public SyncInvoker<CreateUnscopedTokenWithIdTokenRequest, CreateUnscopedTokenWithIdTokenResponse> createUnscopedTokenWithIdTokenInvoker(
        CreateUnscopedTokenWithIdTokenRequest request) {
        return new SyncInvoker<>(request, IamMeta.createUnscopedTokenWithIdToken, hcClient);
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
     * @return DeleteAgencyResponse
     */
    public DeleteAgencyResponse deleteAgency(DeleteAgencyRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.deleteAgency);
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
     * @return SyncInvoker<DeleteAgencyRequest, DeleteAgencyResponse>
     */
    public SyncInvoker<DeleteAgencyRequest, DeleteAgencyResponse> deleteAgencyInvoker(DeleteAgencyRequest request) {
        return new SyncInvoker<>(request, IamMeta.deleteAgency, hcClient);
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
     * @return DeleteBindingDeviceResponse
     */
    public DeleteBindingDeviceResponse deleteBindingDevice(DeleteBindingDeviceRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.deleteBindingDevice);
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
     * @return SyncInvoker<DeleteBindingDeviceRequest, DeleteBindingDeviceResponse>
     */
    public SyncInvoker<DeleteBindingDeviceRequest, DeleteBindingDeviceResponse> deleteBindingDeviceInvoker(
        DeleteBindingDeviceRequest request) {
        return new SyncInvoker<>(request, IamMeta.deleteBindingDevice, hcClient);
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
     * @return DeleteCustomPolicyResponse
     */
    public DeleteCustomPolicyResponse deleteCustomPolicy(DeleteCustomPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.deleteCustomPolicy);
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
     * @return SyncInvoker<DeleteCustomPolicyRequest, DeleteCustomPolicyResponse>
     */
    public SyncInvoker<DeleteCustomPolicyRequest, DeleteCustomPolicyResponse> deleteCustomPolicyInvoker(
        DeleteCustomPolicyRequest request) {
        return new SyncInvoker<>(request, IamMeta.deleteCustomPolicy, hcClient);
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
     * @return DeleteDomainGroupInheritedRoleResponse
     */
    public DeleteDomainGroupInheritedRoleResponse deleteDomainGroupInheritedRole(
        DeleteDomainGroupInheritedRoleRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.deleteDomainGroupInheritedRole);
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
     * @return SyncInvoker<DeleteDomainGroupInheritedRoleRequest, DeleteDomainGroupInheritedRoleResponse>
     */
    public SyncInvoker<DeleteDomainGroupInheritedRoleRequest, DeleteDomainGroupInheritedRoleResponse> deleteDomainGroupInheritedRoleInvoker(
        DeleteDomainGroupInheritedRoleRequest request) {
        return new SyncInvoker<>(request, IamMeta.deleteDomainGroupInheritedRole, hcClient);
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
     * @return DeleteMfaDeviceResponse
     */
    public DeleteMfaDeviceResponse deleteMfaDevice(DeleteMfaDeviceRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.deleteMfaDevice);
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
     * @return SyncInvoker<DeleteMfaDeviceRequest, DeleteMfaDeviceResponse>
     */
    public SyncInvoker<DeleteMfaDeviceRequest, DeleteMfaDeviceResponse> deleteMfaDeviceInvoker(
        DeleteMfaDeviceRequest request) {
        return new SyncInvoker<>(request, IamMeta.deleteMfaDevice, hcClient);
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
     * @return KeystoneAddUserToGroupResponse
     */
    public KeystoneAddUserToGroupResponse keystoneAddUserToGroup(KeystoneAddUserToGroupRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneAddUserToGroup);
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
     * @return SyncInvoker<KeystoneAddUserToGroupRequest, KeystoneAddUserToGroupResponse>
     */
    public SyncInvoker<KeystoneAddUserToGroupRequest, KeystoneAddUserToGroupResponse> keystoneAddUserToGroupInvoker(
        KeystoneAddUserToGroupRequest request) {
        return new SyncInvoker<>(request, IamMeta.keystoneAddUserToGroup, hcClient);
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
     * @return KeystoneAssociateGroupWithDomainPermissionResponse
     */
    public KeystoneAssociateGroupWithDomainPermissionResponse keystoneAssociateGroupWithDomainPermission(
        KeystoneAssociateGroupWithDomainPermissionRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneAssociateGroupWithDomainPermission);
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
     * @return SyncInvoker<KeystoneAssociateGroupWithDomainPermissionRequest, KeystoneAssociateGroupWithDomainPermissionResponse>
     */
    public SyncInvoker<KeystoneAssociateGroupWithDomainPermissionRequest, KeystoneAssociateGroupWithDomainPermissionResponse> keystoneAssociateGroupWithDomainPermissionInvoker(
        KeystoneAssociateGroupWithDomainPermissionRequest request) {
        return new SyncInvoker<>(request, IamMeta.keystoneAssociateGroupWithDomainPermission, hcClient);
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
     * @return KeystoneAssociateGroupWithProjectPermissionResponse
     */
    public KeystoneAssociateGroupWithProjectPermissionResponse keystoneAssociateGroupWithProjectPermission(
        KeystoneAssociateGroupWithProjectPermissionRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneAssociateGroupWithProjectPermission);
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
     * @return SyncInvoker<KeystoneAssociateGroupWithProjectPermissionRequest, KeystoneAssociateGroupWithProjectPermissionResponse>
     */
    public SyncInvoker<KeystoneAssociateGroupWithProjectPermissionRequest, KeystoneAssociateGroupWithProjectPermissionResponse> keystoneAssociateGroupWithProjectPermissionInvoker(
        KeystoneAssociateGroupWithProjectPermissionRequest request) {
        return new SyncInvoker<>(request, IamMeta.keystoneAssociateGroupWithProjectPermission, hcClient);
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
     * @return KeystoneCheckDomainPermissionForGroupResponse
     */
    public KeystoneCheckDomainPermissionForGroupResponse keystoneCheckDomainPermissionForGroup(
        KeystoneCheckDomainPermissionForGroupRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneCheckDomainPermissionForGroup);
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
     * @return SyncInvoker<KeystoneCheckDomainPermissionForGroupRequest, KeystoneCheckDomainPermissionForGroupResponse>
     */
    public SyncInvoker<KeystoneCheckDomainPermissionForGroupRequest, KeystoneCheckDomainPermissionForGroupResponse> keystoneCheckDomainPermissionForGroupInvoker(
        KeystoneCheckDomainPermissionForGroupRequest request) {
        return new SyncInvoker<>(request, IamMeta.keystoneCheckDomainPermissionForGroup, hcClient);
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
     * @return KeystoneCheckProjectPermissionForGroupResponse
     */
    public KeystoneCheckProjectPermissionForGroupResponse keystoneCheckProjectPermissionForGroup(
        KeystoneCheckProjectPermissionForGroupRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneCheckProjectPermissionForGroup);
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
     * @return SyncInvoker<KeystoneCheckProjectPermissionForGroupRequest, KeystoneCheckProjectPermissionForGroupResponse>
     */
    public SyncInvoker<KeystoneCheckProjectPermissionForGroupRequest, KeystoneCheckProjectPermissionForGroupResponse> keystoneCheckProjectPermissionForGroupInvoker(
        KeystoneCheckProjectPermissionForGroupRequest request) {
        return new SyncInvoker<>(request, IamMeta.keystoneCheckProjectPermissionForGroup, hcClient);
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
     * @return KeystoneCheckUserInGroupResponse
     */
    public KeystoneCheckUserInGroupResponse keystoneCheckUserInGroup(KeystoneCheckUserInGroupRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneCheckUserInGroup);
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
     * @return SyncInvoker<KeystoneCheckUserInGroupRequest, KeystoneCheckUserInGroupResponse>
     */
    public SyncInvoker<KeystoneCheckUserInGroupRequest, KeystoneCheckUserInGroupResponse> keystoneCheckUserInGroupInvoker(
        KeystoneCheckUserInGroupRequest request) {
        return new SyncInvoker<>(request, IamMeta.keystoneCheckUserInGroup, hcClient);
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
     * @return KeystoneCheckroleForGroupResponse
     */
    public KeystoneCheckroleForGroupResponse keystoneCheckroleForGroup(KeystoneCheckroleForGroupRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneCheckroleForGroup);
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
     * @return SyncInvoker<KeystoneCheckroleForGroupRequest, KeystoneCheckroleForGroupResponse>
     */
    public SyncInvoker<KeystoneCheckroleForGroupRequest, KeystoneCheckroleForGroupResponse> keystoneCheckroleForGroupInvoker(
        KeystoneCheckroleForGroupRequest request) {
        return new SyncInvoker<>(request, IamMeta.keystoneCheckroleForGroup, hcClient);
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
     * @return KeystoneCreateGroupResponse
     */
    public KeystoneCreateGroupResponse keystoneCreateGroup(KeystoneCreateGroupRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneCreateGroup);
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
     * @return SyncInvoker<KeystoneCreateGroupRequest, KeystoneCreateGroupResponse>
     */
    public SyncInvoker<KeystoneCreateGroupRequest, KeystoneCreateGroupResponse> keystoneCreateGroupInvoker(
        KeystoneCreateGroupRequest request) {
        return new SyncInvoker<>(request, IamMeta.keystoneCreateGroup, hcClient);
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
     * @return KeystoneCreateIdentityProviderResponse
     */
    public KeystoneCreateIdentityProviderResponse keystoneCreateIdentityProvider(
        KeystoneCreateIdentityProviderRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneCreateIdentityProvider);
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
     * @return SyncInvoker<KeystoneCreateIdentityProviderRequest, KeystoneCreateIdentityProviderResponse>
     */
    public SyncInvoker<KeystoneCreateIdentityProviderRequest, KeystoneCreateIdentityProviderResponse> keystoneCreateIdentityProviderInvoker(
        KeystoneCreateIdentityProviderRequest request) {
        return new SyncInvoker<>(request, IamMeta.keystoneCreateIdentityProvider, hcClient);
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
     * @return KeystoneCreateMappingResponse
     */
    public KeystoneCreateMappingResponse keystoneCreateMapping(KeystoneCreateMappingRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneCreateMapping);
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
     * @return SyncInvoker<KeystoneCreateMappingRequest, KeystoneCreateMappingResponse>
     */
    public SyncInvoker<KeystoneCreateMappingRequest, KeystoneCreateMappingResponse> keystoneCreateMappingInvoker(
        KeystoneCreateMappingRequest request) {
        return new SyncInvoker<>(request, IamMeta.keystoneCreateMapping, hcClient);
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
     * @return KeystoneCreateProjectResponse
     */
    public KeystoneCreateProjectResponse keystoneCreateProject(KeystoneCreateProjectRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneCreateProject);
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
     * @return SyncInvoker<KeystoneCreateProjectRequest, KeystoneCreateProjectResponse>
     */
    public SyncInvoker<KeystoneCreateProjectRequest, KeystoneCreateProjectResponse> keystoneCreateProjectInvoker(
        KeystoneCreateProjectRequest request) {
        return new SyncInvoker<>(request, IamMeta.keystoneCreateProject, hcClient);
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
     * @return KeystoneCreateProtocolResponse
     */
    public KeystoneCreateProtocolResponse keystoneCreateProtocol(KeystoneCreateProtocolRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneCreateProtocol);
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
     * @return SyncInvoker<KeystoneCreateProtocolRequest, KeystoneCreateProtocolResponse>
     */
    public SyncInvoker<KeystoneCreateProtocolRequest, KeystoneCreateProtocolResponse> keystoneCreateProtocolInvoker(
        KeystoneCreateProtocolRequest request) {
        return new SyncInvoker<>(request, IamMeta.keystoneCreateProtocol, hcClient);
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
     * @return KeystoneCreateScopedTokenResponse
     */
    public KeystoneCreateScopedTokenResponse keystoneCreateScopedToken(KeystoneCreateScopedTokenRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneCreateScopedToken);
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
     * @return SyncInvoker<KeystoneCreateScopedTokenRequest, KeystoneCreateScopedTokenResponse>
     */
    public SyncInvoker<KeystoneCreateScopedTokenRequest, KeystoneCreateScopedTokenResponse> keystoneCreateScopedTokenInvoker(
        KeystoneCreateScopedTokenRequest request) {
        return new SyncInvoker<>(request, IamMeta.keystoneCreateScopedToken, hcClient);
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
     * @return KeystoneDeleteGroupResponse
     */
    public KeystoneDeleteGroupResponse keystoneDeleteGroup(KeystoneDeleteGroupRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneDeleteGroup);
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
     * @return SyncInvoker<KeystoneDeleteGroupRequest, KeystoneDeleteGroupResponse>
     */
    public SyncInvoker<KeystoneDeleteGroupRequest, KeystoneDeleteGroupResponse> keystoneDeleteGroupInvoker(
        KeystoneDeleteGroupRequest request) {
        return new SyncInvoker<>(request, IamMeta.keystoneDeleteGroup, hcClient);
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
     * @return KeystoneDeleteIdentityProviderResponse
     */
    public KeystoneDeleteIdentityProviderResponse keystoneDeleteIdentityProvider(
        KeystoneDeleteIdentityProviderRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneDeleteIdentityProvider);
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
     * @return SyncInvoker<KeystoneDeleteIdentityProviderRequest, KeystoneDeleteIdentityProviderResponse>
     */
    public SyncInvoker<KeystoneDeleteIdentityProviderRequest, KeystoneDeleteIdentityProviderResponse> keystoneDeleteIdentityProviderInvoker(
        KeystoneDeleteIdentityProviderRequest request) {
        return new SyncInvoker<>(request, IamMeta.keystoneDeleteIdentityProvider, hcClient);
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
     * @return KeystoneDeleteMappingResponse
     */
    public KeystoneDeleteMappingResponse keystoneDeleteMapping(KeystoneDeleteMappingRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneDeleteMapping);
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
     * @return SyncInvoker<KeystoneDeleteMappingRequest, KeystoneDeleteMappingResponse>
     */
    public SyncInvoker<KeystoneDeleteMappingRequest, KeystoneDeleteMappingResponse> keystoneDeleteMappingInvoker(
        KeystoneDeleteMappingRequest request) {
        return new SyncInvoker<>(request, IamMeta.keystoneDeleteMapping, hcClient);
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
     * @return KeystoneDeleteProtocolResponse
     */
    public KeystoneDeleteProtocolResponse keystoneDeleteProtocol(KeystoneDeleteProtocolRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneDeleteProtocol);
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
     * @return SyncInvoker<KeystoneDeleteProtocolRequest, KeystoneDeleteProtocolResponse>
     */
    public SyncInvoker<KeystoneDeleteProtocolRequest, KeystoneDeleteProtocolResponse> keystoneDeleteProtocolInvoker(
        KeystoneDeleteProtocolRequest request) {
        return new SyncInvoker<>(request, IamMeta.keystoneDeleteProtocol, hcClient);
    }

    /**
     * 查询用户组的所有项目权限列表
     *
     * 该接口可以用于管理员查询用户组所有项目服务权限列表。 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request KeystoneListAllProjectPermissionsForGroupRequest 请求对象
     * @return KeystoneListAllProjectPermissionsForGroupResponse
     */
    public KeystoneListAllProjectPermissionsForGroupResponse keystoneListAllProjectPermissionsForGroup(
        KeystoneListAllProjectPermissionsForGroupRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneListAllProjectPermissionsForGroup);
    }

    /**
     * 查询用户组的所有项目权限列表
     *
     * 该接口可以用于管理员查询用户组所有项目服务权限列表。 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request KeystoneListAllProjectPermissionsForGroupRequest 请求对象
     * @return SyncInvoker<KeystoneListAllProjectPermissionsForGroupRequest, KeystoneListAllProjectPermissionsForGroupResponse>
     */
    public SyncInvoker<KeystoneListAllProjectPermissionsForGroupRequest, KeystoneListAllProjectPermissionsForGroupResponse> keystoneListAllProjectPermissionsForGroupInvoker(
        KeystoneListAllProjectPermissionsForGroupRequest request) {
        return new SyncInvoker<>(request, IamMeta.keystoneListAllProjectPermissionsForGroup, hcClient);
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
     * @return KeystoneListAuthDomainsResponse
     */
    public KeystoneListAuthDomainsResponse keystoneListAuthDomains(KeystoneListAuthDomainsRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneListAuthDomains);
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
     * @return SyncInvoker<KeystoneListAuthDomainsRequest, KeystoneListAuthDomainsResponse>
     */
    public SyncInvoker<KeystoneListAuthDomainsRequest, KeystoneListAuthDomainsResponse> keystoneListAuthDomainsInvoker(
        KeystoneListAuthDomainsRequest request) {
        return new SyncInvoker<>(request, IamMeta.keystoneListAuthDomains, hcClient);
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
     * @return KeystoneListAuthProjectsResponse
     */
    public KeystoneListAuthProjectsResponse keystoneListAuthProjects(KeystoneListAuthProjectsRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneListAuthProjects);
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
     * @return SyncInvoker<KeystoneListAuthProjectsRequest, KeystoneListAuthProjectsResponse>
     */
    public SyncInvoker<KeystoneListAuthProjectsRequest, KeystoneListAuthProjectsResponse> keystoneListAuthProjectsInvoker(
        KeystoneListAuthProjectsRequest request) {
        return new SyncInvoker<>(request, IamMeta.keystoneListAuthProjects, hcClient);
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
     * @return KeystoneListDomainPermissionsForGroupResponse
     */
    public KeystoneListDomainPermissionsForGroupResponse keystoneListDomainPermissionsForGroup(
        KeystoneListDomainPermissionsForGroupRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneListDomainPermissionsForGroup);
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
     * @return SyncInvoker<KeystoneListDomainPermissionsForGroupRequest, KeystoneListDomainPermissionsForGroupResponse>
     */
    public SyncInvoker<KeystoneListDomainPermissionsForGroupRequest, KeystoneListDomainPermissionsForGroupResponse> keystoneListDomainPermissionsForGroupInvoker(
        KeystoneListDomainPermissionsForGroupRequest request) {
        return new SyncInvoker<>(request, IamMeta.keystoneListDomainPermissionsForGroup, hcClient);
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
     * @return KeystoneListEndpointsResponse
     */
    public KeystoneListEndpointsResponse keystoneListEndpoints(KeystoneListEndpointsRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneListEndpoints);
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
     * @return SyncInvoker<KeystoneListEndpointsRequest, KeystoneListEndpointsResponse>
     */
    public SyncInvoker<KeystoneListEndpointsRequest, KeystoneListEndpointsResponse> keystoneListEndpointsInvoker(
        KeystoneListEndpointsRequest request) {
        return new SyncInvoker<>(request, IamMeta.keystoneListEndpoints, hcClient);
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
     * @return KeystoneListFederationDomainsResponse
     */
    public KeystoneListFederationDomainsResponse keystoneListFederationDomains(
        KeystoneListFederationDomainsRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneListFederationDomains);
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
     * @return SyncInvoker<KeystoneListFederationDomainsRequest, KeystoneListFederationDomainsResponse>
     */
    public SyncInvoker<KeystoneListFederationDomainsRequest, KeystoneListFederationDomainsResponse> keystoneListFederationDomainsInvoker(
        KeystoneListFederationDomainsRequest request) {
        return new SyncInvoker<>(request, IamMeta.keystoneListFederationDomains, hcClient);
    }

    /**
     * 查询联邦用户可以访问的项目列表
     *
     * 该接口可以用于查询联邦用户可以访问的项目列表。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * &gt; - 推荐使用[查询IAM用户可以访问的项目列表](https://apiexplorer.developer.huaweicloud.com/apiexplorer/doc?product&#x3D;IAM&amp;api&#x3D;KeystoneListAccessibleProjectsToUser)，该接口可以返回相同的响应格式。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request KeystoneListFederationProjectsRequest 请求对象
     * @return KeystoneListFederationProjectsResponse
     */
    public KeystoneListFederationProjectsResponse keystoneListFederationProjects(
        KeystoneListFederationProjectsRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneListFederationProjects);
    }

    /**
     * 查询联邦用户可以访问的项目列表
     *
     * 该接口可以用于查询联邦用户可以访问的项目列表。
     * 
     * 该接口可以使用全局区域的Endpoint和其他区域的Endpoint调用。IAM的Endpoint请参见：[地区和终端节点](https://developer.huaweicloud.com/endpoint?IAM)。
     * &gt; - 推荐使用[查询IAM用户可以访问的项目列表](https://apiexplorer.developer.huaweicloud.com/apiexplorer/doc?product&#x3D;IAM&amp;api&#x3D;KeystoneListAccessibleProjectsToUser)，该接口可以返回相同的响应格式。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request KeystoneListFederationProjectsRequest 请求对象
     * @return SyncInvoker<KeystoneListFederationProjectsRequest, KeystoneListFederationProjectsResponse>
     */
    public SyncInvoker<KeystoneListFederationProjectsRequest, KeystoneListFederationProjectsResponse> keystoneListFederationProjectsInvoker(
        KeystoneListFederationProjectsRequest request) {
        return new SyncInvoker<>(request, IamMeta.keystoneListFederationProjects, hcClient);
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
     * @return KeystoneListGroupsResponse
     */
    public KeystoneListGroupsResponse keystoneListGroups(KeystoneListGroupsRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneListGroups);
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
     * @return SyncInvoker<KeystoneListGroupsRequest, KeystoneListGroupsResponse>
     */
    public SyncInvoker<KeystoneListGroupsRequest, KeystoneListGroupsResponse> keystoneListGroupsInvoker(
        KeystoneListGroupsRequest request) {
        return new SyncInvoker<>(request, IamMeta.keystoneListGroups, hcClient);
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
     * @return KeystoneListIdentityProvidersResponse
     */
    public KeystoneListIdentityProvidersResponse keystoneListIdentityProviders(
        KeystoneListIdentityProvidersRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneListIdentityProviders);
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
     * @return SyncInvoker<KeystoneListIdentityProvidersRequest, KeystoneListIdentityProvidersResponse>
     */
    public SyncInvoker<KeystoneListIdentityProvidersRequest, KeystoneListIdentityProvidersResponse> keystoneListIdentityProvidersInvoker(
        KeystoneListIdentityProvidersRequest request) {
        return new SyncInvoker<>(request, IamMeta.keystoneListIdentityProviders, hcClient);
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
     * @return KeystoneListMappingsResponse
     */
    public KeystoneListMappingsResponse keystoneListMappings(KeystoneListMappingsRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneListMappings);
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
     * @return SyncInvoker<KeystoneListMappingsRequest, KeystoneListMappingsResponse>
     */
    public SyncInvoker<KeystoneListMappingsRequest, KeystoneListMappingsResponse> keystoneListMappingsInvoker(
        KeystoneListMappingsRequest request) {
        return new SyncInvoker<>(request, IamMeta.keystoneListMappings, hcClient);
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
     * @return KeystoneListPermissionsResponse
     */
    public KeystoneListPermissionsResponse keystoneListPermissions(KeystoneListPermissionsRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneListPermissions);
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
     * @return SyncInvoker<KeystoneListPermissionsRequest, KeystoneListPermissionsResponse>
     */
    public SyncInvoker<KeystoneListPermissionsRequest, KeystoneListPermissionsResponse> keystoneListPermissionsInvoker(
        KeystoneListPermissionsRequest request) {
        return new SyncInvoker<>(request, IamMeta.keystoneListPermissions, hcClient);
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
     * @return KeystoneListProjectPermissionsForGroupResponse
     */
    public KeystoneListProjectPermissionsForGroupResponse keystoneListProjectPermissionsForGroup(
        KeystoneListProjectPermissionsForGroupRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneListProjectPermissionsForGroup);
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
     * @return SyncInvoker<KeystoneListProjectPermissionsForGroupRequest, KeystoneListProjectPermissionsForGroupResponse>
     */
    public SyncInvoker<KeystoneListProjectPermissionsForGroupRequest, KeystoneListProjectPermissionsForGroupResponse> keystoneListProjectPermissionsForGroupInvoker(
        KeystoneListProjectPermissionsForGroupRequest request) {
        return new SyncInvoker<>(request, IamMeta.keystoneListProjectPermissionsForGroup, hcClient);
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
     * @return KeystoneListProjectsResponse
     */
    public KeystoneListProjectsResponse keystoneListProjects(KeystoneListProjectsRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneListProjects);
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
     * @return SyncInvoker<KeystoneListProjectsRequest, KeystoneListProjectsResponse>
     */
    public SyncInvoker<KeystoneListProjectsRequest, KeystoneListProjectsResponse> keystoneListProjectsInvoker(
        KeystoneListProjectsRequest request) {
        return new SyncInvoker<>(request, IamMeta.keystoneListProjects, hcClient);
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
     * @return KeystoneListProjectsForUserResponse
     */
    public KeystoneListProjectsForUserResponse keystoneListProjectsForUser(KeystoneListProjectsForUserRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneListProjectsForUser);
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
     * @return SyncInvoker<KeystoneListProjectsForUserRequest, KeystoneListProjectsForUserResponse>
     */
    public SyncInvoker<KeystoneListProjectsForUserRequest, KeystoneListProjectsForUserResponse> keystoneListProjectsForUserInvoker(
        KeystoneListProjectsForUserRequest request) {
        return new SyncInvoker<>(request, IamMeta.keystoneListProjectsForUser, hcClient);
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
     * @return KeystoneListProtocolsResponse
     */
    public KeystoneListProtocolsResponse keystoneListProtocols(KeystoneListProtocolsRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneListProtocols);
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
     * @return SyncInvoker<KeystoneListProtocolsRequest, KeystoneListProtocolsResponse>
     */
    public SyncInvoker<KeystoneListProtocolsRequest, KeystoneListProtocolsResponse> keystoneListProtocolsInvoker(
        KeystoneListProtocolsRequest request) {
        return new SyncInvoker<>(request, IamMeta.keystoneListProtocols, hcClient);
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
     * @return KeystoneListRegionsResponse
     */
    public KeystoneListRegionsResponse keystoneListRegions(KeystoneListRegionsRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneListRegions);
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
     * @return SyncInvoker<KeystoneListRegionsRequest, KeystoneListRegionsResponse>
     */
    public SyncInvoker<KeystoneListRegionsRequest, KeystoneListRegionsResponse> keystoneListRegionsInvoker(
        KeystoneListRegionsRequest request) {
        return new SyncInvoker<>(request, IamMeta.keystoneListRegions, hcClient);
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
     * @return KeystoneListServicesResponse
     */
    public KeystoneListServicesResponse keystoneListServices(KeystoneListServicesRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneListServices);
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
     * @return SyncInvoker<KeystoneListServicesRequest, KeystoneListServicesResponse>
     */
    public SyncInvoker<KeystoneListServicesRequest, KeystoneListServicesResponse> keystoneListServicesInvoker(
        KeystoneListServicesRequest request) {
        return new SyncInvoker<>(request, IamMeta.keystoneListServices, hcClient);
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
     * @return KeystoneListVersionsResponse
     */
    public KeystoneListVersionsResponse keystoneListVersions(KeystoneListVersionsRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneListVersions);
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
     * @return SyncInvoker<KeystoneListVersionsRequest, KeystoneListVersionsResponse>
     */
    public SyncInvoker<KeystoneListVersionsRequest, KeystoneListVersionsResponse> keystoneListVersionsInvoker(
        KeystoneListVersionsRequest request) {
        return new SyncInvoker<>(request, IamMeta.keystoneListVersions, hcClient);
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
     * @return KeystoneRemoveDomainPermissionFromGroupResponse
     */
    public KeystoneRemoveDomainPermissionFromGroupResponse keystoneRemoveDomainPermissionFromGroup(
        KeystoneRemoveDomainPermissionFromGroupRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneRemoveDomainPermissionFromGroup);
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
     * @return SyncInvoker<KeystoneRemoveDomainPermissionFromGroupRequest, KeystoneRemoveDomainPermissionFromGroupResponse>
     */
    public SyncInvoker<KeystoneRemoveDomainPermissionFromGroupRequest, KeystoneRemoveDomainPermissionFromGroupResponse> keystoneRemoveDomainPermissionFromGroupInvoker(
        KeystoneRemoveDomainPermissionFromGroupRequest request) {
        return new SyncInvoker<>(request, IamMeta.keystoneRemoveDomainPermissionFromGroup, hcClient);
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
     * @return KeystoneRemoveProjectPermissionFromGroupResponse
     */
    public KeystoneRemoveProjectPermissionFromGroupResponse keystoneRemoveProjectPermissionFromGroup(
        KeystoneRemoveProjectPermissionFromGroupRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneRemoveProjectPermissionFromGroup);
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
     * @return SyncInvoker<KeystoneRemoveProjectPermissionFromGroupRequest, KeystoneRemoveProjectPermissionFromGroupResponse>
     */
    public SyncInvoker<KeystoneRemoveProjectPermissionFromGroupRequest, KeystoneRemoveProjectPermissionFromGroupResponse> keystoneRemoveProjectPermissionFromGroupInvoker(
        KeystoneRemoveProjectPermissionFromGroupRequest request) {
        return new SyncInvoker<>(request, IamMeta.keystoneRemoveProjectPermissionFromGroup, hcClient);
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
     * @return KeystoneRemoveUserFromGroupResponse
     */
    public KeystoneRemoveUserFromGroupResponse keystoneRemoveUserFromGroup(KeystoneRemoveUserFromGroupRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneRemoveUserFromGroup);
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
     * @return SyncInvoker<KeystoneRemoveUserFromGroupRequest, KeystoneRemoveUserFromGroupResponse>
     */
    public SyncInvoker<KeystoneRemoveUserFromGroupRequest, KeystoneRemoveUserFromGroupResponse> keystoneRemoveUserFromGroupInvoker(
        KeystoneRemoveUserFromGroupRequest request) {
        return new SyncInvoker<>(request, IamMeta.keystoneRemoveUserFromGroup, hcClient);
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
     * @return KeystoneShowCatalogResponse
     */
    public KeystoneShowCatalogResponse keystoneShowCatalog(KeystoneShowCatalogRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneShowCatalog);
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
     * @return SyncInvoker<KeystoneShowCatalogRequest, KeystoneShowCatalogResponse>
     */
    public SyncInvoker<KeystoneShowCatalogRequest, KeystoneShowCatalogResponse> keystoneShowCatalogInvoker(
        KeystoneShowCatalogRequest request) {
        return new SyncInvoker<>(request, IamMeta.keystoneShowCatalog, hcClient);
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
     * @return KeystoneShowEndpointResponse
     */
    public KeystoneShowEndpointResponse keystoneShowEndpoint(KeystoneShowEndpointRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneShowEndpoint);
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
     * @return SyncInvoker<KeystoneShowEndpointRequest, KeystoneShowEndpointResponse>
     */
    public SyncInvoker<KeystoneShowEndpointRequest, KeystoneShowEndpointResponse> keystoneShowEndpointInvoker(
        KeystoneShowEndpointRequest request) {
        return new SyncInvoker<>(request, IamMeta.keystoneShowEndpoint, hcClient);
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
     * @return KeystoneShowGroupResponse
     */
    public KeystoneShowGroupResponse keystoneShowGroup(KeystoneShowGroupRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneShowGroup);
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
     * @return SyncInvoker<KeystoneShowGroupRequest, KeystoneShowGroupResponse>
     */
    public SyncInvoker<KeystoneShowGroupRequest, KeystoneShowGroupResponse> keystoneShowGroupInvoker(
        KeystoneShowGroupRequest request) {
        return new SyncInvoker<>(request, IamMeta.keystoneShowGroup, hcClient);
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
     * @return KeystoneShowIdentityProviderResponse
     */
    public KeystoneShowIdentityProviderResponse keystoneShowIdentityProvider(
        KeystoneShowIdentityProviderRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneShowIdentityProvider);
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
     * @return SyncInvoker<KeystoneShowIdentityProviderRequest, KeystoneShowIdentityProviderResponse>
     */
    public SyncInvoker<KeystoneShowIdentityProviderRequest, KeystoneShowIdentityProviderResponse> keystoneShowIdentityProviderInvoker(
        KeystoneShowIdentityProviderRequest request) {
        return new SyncInvoker<>(request, IamMeta.keystoneShowIdentityProvider, hcClient);
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
     * @return KeystoneShowMappingResponse
     */
    public KeystoneShowMappingResponse keystoneShowMapping(KeystoneShowMappingRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneShowMapping);
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
     * @return SyncInvoker<KeystoneShowMappingRequest, KeystoneShowMappingResponse>
     */
    public SyncInvoker<KeystoneShowMappingRequest, KeystoneShowMappingResponse> keystoneShowMappingInvoker(
        KeystoneShowMappingRequest request) {
        return new SyncInvoker<>(request, IamMeta.keystoneShowMapping, hcClient);
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
     * @return KeystoneShowPermissionResponse
     */
    public KeystoneShowPermissionResponse keystoneShowPermission(KeystoneShowPermissionRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneShowPermission);
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
     * @return SyncInvoker<KeystoneShowPermissionRequest, KeystoneShowPermissionResponse>
     */
    public SyncInvoker<KeystoneShowPermissionRequest, KeystoneShowPermissionResponse> keystoneShowPermissionInvoker(
        KeystoneShowPermissionRequest request) {
        return new SyncInvoker<>(request, IamMeta.keystoneShowPermission, hcClient);
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
     * @return KeystoneShowProjectResponse
     */
    public KeystoneShowProjectResponse keystoneShowProject(KeystoneShowProjectRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneShowProject);
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
     * @return SyncInvoker<KeystoneShowProjectRequest, KeystoneShowProjectResponse>
     */
    public SyncInvoker<KeystoneShowProjectRequest, KeystoneShowProjectResponse> keystoneShowProjectInvoker(
        KeystoneShowProjectRequest request) {
        return new SyncInvoker<>(request, IamMeta.keystoneShowProject, hcClient);
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
     * @return KeystoneShowProtocolResponse
     */
    public KeystoneShowProtocolResponse keystoneShowProtocol(KeystoneShowProtocolRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneShowProtocol);
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
     * @return SyncInvoker<KeystoneShowProtocolRequest, KeystoneShowProtocolResponse>
     */
    public SyncInvoker<KeystoneShowProtocolRequest, KeystoneShowProtocolResponse> keystoneShowProtocolInvoker(
        KeystoneShowProtocolRequest request) {
        return new SyncInvoker<>(request, IamMeta.keystoneShowProtocol, hcClient);
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
     * @return KeystoneShowRegionResponse
     */
    public KeystoneShowRegionResponse keystoneShowRegion(KeystoneShowRegionRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneShowRegion);
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
     * @return SyncInvoker<KeystoneShowRegionRequest, KeystoneShowRegionResponse>
     */
    public SyncInvoker<KeystoneShowRegionRequest, KeystoneShowRegionResponse> keystoneShowRegionInvoker(
        KeystoneShowRegionRequest request) {
        return new SyncInvoker<>(request, IamMeta.keystoneShowRegion, hcClient);
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
     * @return KeystoneShowSecurityComplianceResponse
     */
    public KeystoneShowSecurityComplianceResponse keystoneShowSecurityCompliance(
        KeystoneShowSecurityComplianceRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneShowSecurityCompliance);
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
     * @return SyncInvoker<KeystoneShowSecurityComplianceRequest, KeystoneShowSecurityComplianceResponse>
     */
    public SyncInvoker<KeystoneShowSecurityComplianceRequest, KeystoneShowSecurityComplianceResponse> keystoneShowSecurityComplianceInvoker(
        KeystoneShowSecurityComplianceRequest request) {
        return new SyncInvoker<>(request, IamMeta.keystoneShowSecurityCompliance, hcClient);
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
     * @return KeystoneShowSecurityComplianceByOptionResponse
     */
    public KeystoneShowSecurityComplianceByOptionResponse keystoneShowSecurityComplianceByOption(
        KeystoneShowSecurityComplianceByOptionRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneShowSecurityComplianceByOption);
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
     * @return SyncInvoker<KeystoneShowSecurityComplianceByOptionRequest, KeystoneShowSecurityComplianceByOptionResponse>
     */
    public SyncInvoker<KeystoneShowSecurityComplianceByOptionRequest, KeystoneShowSecurityComplianceByOptionResponse> keystoneShowSecurityComplianceByOptionInvoker(
        KeystoneShowSecurityComplianceByOptionRequest request) {
        return new SyncInvoker<>(request, IamMeta.keystoneShowSecurityComplianceByOption, hcClient);
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
     * @return KeystoneShowServiceResponse
     */
    public KeystoneShowServiceResponse keystoneShowService(KeystoneShowServiceRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneShowService);
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
     * @return SyncInvoker<KeystoneShowServiceRequest, KeystoneShowServiceResponse>
     */
    public SyncInvoker<KeystoneShowServiceRequest, KeystoneShowServiceResponse> keystoneShowServiceInvoker(
        KeystoneShowServiceRequest request) {
        return new SyncInvoker<>(request, IamMeta.keystoneShowService, hcClient);
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
     * @return KeystoneShowVersionResponse
     */
    public KeystoneShowVersionResponse keystoneShowVersion(KeystoneShowVersionRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneShowVersion);
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
     * @return SyncInvoker<KeystoneShowVersionRequest, KeystoneShowVersionResponse>
     */
    public SyncInvoker<KeystoneShowVersionRequest, KeystoneShowVersionResponse> keystoneShowVersionInvoker(
        KeystoneShowVersionRequest request) {
        return new SyncInvoker<>(request, IamMeta.keystoneShowVersion, hcClient);
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
     * @return KeystoneUpdateGroupResponse
     */
    public KeystoneUpdateGroupResponse keystoneUpdateGroup(KeystoneUpdateGroupRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneUpdateGroup);
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
     * @return SyncInvoker<KeystoneUpdateGroupRequest, KeystoneUpdateGroupResponse>
     */
    public SyncInvoker<KeystoneUpdateGroupRequest, KeystoneUpdateGroupResponse> keystoneUpdateGroupInvoker(
        KeystoneUpdateGroupRequest request) {
        return new SyncInvoker<>(request, IamMeta.keystoneUpdateGroup, hcClient);
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
     * @return KeystoneUpdateIdentityProviderResponse
     */
    public KeystoneUpdateIdentityProviderResponse keystoneUpdateIdentityProvider(
        KeystoneUpdateIdentityProviderRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneUpdateIdentityProvider);
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
     * @return SyncInvoker<KeystoneUpdateIdentityProviderRequest, KeystoneUpdateIdentityProviderResponse>
     */
    public SyncInvoker<KeystoneUpdateIdentityProviderRequest, KeystoneUpdateIdentityProviderResponse> keystoneUpdateIdentityProviderInvoker(
        KeystoneUpdateIdentityProviderRequest request) {
        return new SyncInvoker<>(request, IamMeta.keystoneUpdateIdentityProvider, hcClient);
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
     * @return KeystoneUpdateMappingResponse
     */
    public KeystoneUpdateMappingResponse keystoneUpdateMapping(KeystoneUpdateMappingRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneUpdateMapping);
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
     * @return SyncInvoker<KeystoneUpdateMappingRequest, KeystoneUpdateMappingResponse>
     */
    public SyncInvoker<KeystoneUpdateMappingRequest, KeystoneUpdateMappingResponse> keystoneUpdateMappingInvoker(
        KeystoneUpdateMappingRequest request) {
        return new SyncInvoker<>(request, IamMeta.keystoneUpdateMapping, hcClient);
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
     * @return KeystoneUpdateProjectResponse
     */
    public KeystoneUpdateProjectResponse keystoneUpdateProject(KeystoneUpdateProjectRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneUpdateProject);
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
     * @return SyncInvoker<KeystoneUpdateProjectRequest, KeystoneUpdateProjectResponse>
     */
    public SyncInvoker<KeystoneUpdateProjectRequest, KeystoneUpdateProjectResponse> keystoneUpdateProjectInvoker(
        KeystoneUpdateProjectRequest request) {
        return new SyncInvoker<>(request, IamMeta.keystoneUpdateProject, hcClient);
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
     * @return KeystoneUpdateProtocolResponse
     */
    public KeystoneUpdateProtocolResponse keystoneUpdateProtocol(KeystoneUpdateProtocolRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneUpdateProtocol);
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
     * @return SyncInvoker<KeystoneUpdateProtocolRequest, KeystoneUpdateProtocolResponse>
     */
    public SyncInvoker<KeystoneUpdateProtocolRequest, KeystoneUpdateProtocolResponse> keystoneUpdateProtocolInvoker(
        KeystoneUpdateProtocolRequest request) {
        return new SyncInvoker<>(request, IamMeta.keystoneUpdateProtocol, hcClient);
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
     * @return ListAgenciesResponse
     */
    public ListAgenciesResponse listAgencies(ListAgenciesRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.listAgencies);
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
     * @return SyncInvoker<ListAgenciesRequest, ListAgenciesResponse>
     */
    public SyncInvoker<ListAgenciesRequest, ListAgenciesResponse> listAgenciesInvoker(ListAgenciesRequest request) {
        return new SyncInvoker<>(request, IamMeta.listAgencies, hcClient);
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
     * @return ListAllProjectsPermissionsForAgencyResponse
     */
    public ListAllProjectsPermissionsForAgencyResponse listAllProjectsPermissionsForAgency(
        ListAllProjectsPermissionsForAgencyRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.listAllProjectsPermissionsForAgency);
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
     * @return SyncInvoker<ListAllProjectsPermissionsForAgencyRequest, ListAllProjectsPermissionsForAgencyResponse>
     */
    public SyncInvoker<ListAllProjectsPermissionsForAgencyRequest, ListAllProjectsPermissionsForAgencyResponse> listAllProjectsPermissionsForAgencyInvoker(
        ListAllProjectsPermissionsForAgencyRequest request) {
        return new SyncInvoker<>(request, IamMeta.listAllProjectsPermissionsForAgency, hcClient);
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
     * @return ListCustomPoliciesResponse
     */
    public ListCustomPoliciesResponse listCustomPolicies(ListCustomPoliciesRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.listCustomPolicies);
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
     * @return SyncInvoker<ListCustomPoliciesRequest, ListCustomPoliciesResponse>
     */
    public SyncInvoker<ListCustomPoliciesRequest, ListCustomPoliciesResponse> listCustomPoliciesInvoker(
        ListCustomPoliciesRequest request) {
        return new SyncInvoker<>(request, IamMeta.listCustomPolicies, hcClient);
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
     * @return ListDomainPermissionsForAgencyResponse
     */
    public ListDomainPermissionsForAgencyResponse listDomainPermissionsForAgency(
        ListDomainPermissionsForAgencyRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.listDomainPermissionsForAgency);
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
     * @return SyncInvoker<ListDomainPermissionsForAgencyRequest, ListDomainPermissionsForAgencyResponse>
     */
    public SyncInvoker<ListDomainPermissionsForAgencyRequest, ListDomainPermissionsForAgencyResponse> listDomainPermissionsForAgencyInvoker(
        ListDomainPermissionsForAgencyRequest request) {
        return new SyncInvoker<>(request, IamMeta.listDomainPermissionsForAgency, hcClient);
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
     * @return ListEnterpriseProjectsForGroupResponse
     */
    public ListEnterpriseProjectsForGroupResponse listEnterpriseProjectsForGroup(
        ListEnterpriseProjectsForGroupRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.listEnterpriseProjectsForGroup);
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
     * @return SyncInvoker<ListEnterpriseProjectsForGroupRequest, ListEnterpriseProjectsForGroupResponse>
     */
    public SyncInvoker<ListEnterpriseProjectsForGroupRequest, ListEnterpriseProjectsForGroupResponse> listEnterpriseProjectsForGroupInvoker(
        ListEnterpriseProjectsForGroupRequest request) {
        return new SyncInvoker<>(request, IamMeta.listEnterpriseProjectsForGroup, hcClient);
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
     * @return ListEnterpriseProjectsForUserResponse
     */
    public ListEnterpriseProjectsForUserResponse listEnterpriseProjectsForUser(
        ListEnterpriseProjectsForUserRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.listEnterpriseProjectsForUser);
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
     * @return SyncInvoker<ListEnterpriseProjectsForUserRequest, ListEnterpriseProjectsForUserResponse>
     */
    public SyncInvoker<ListEnterpriseProjectsForUserRequest, ListEnterpriseProjectsForUserResponse> listEnterpriseProjectsForUserInvoker(
        ListEnterpriseProjectsForUserRequest request) {
        return new SyncInvoker<>(request, IamMeta.listEnterpriseProjectsForUser, hcClient);
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
     * @return ListGroupsForEnterpriseProjectResponse
     */
    public ListGroupsForEnterpriseProjectResponse listGroupsForEnterpriseProject(
        ListGroupsForEnterpriseProjectRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.listGroupsForEnterpriseProject);
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
     * @return SyncInvoker<ListGroupsForEnterpriseProjectRequest, ListGroupsForEnterpriseProjectResponse>
     */
    public SyncInvoker<ListGroupsForEnterpriseProjectRequest, ListGroupsForEnterpriseProjectResponse> listGroupsForEnterpriseProjectInvoker(
        ListGroupsForEnterpriseProjectRequest request) {
        return new SyncInvoker<>(request, IamMeta.listGroupsForEnterpriseProject, hcClient);
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
     * @return ListProjectPermissionsForAgencyResponse
     */
    public ListProjectPermissionsForAgencyResponse listProjectPermissionsForAgency(
        ListProjectPermissionsForAgencyRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.listProjectPermissionsForAgency);
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
     * @return SyncInvoker<ListProjectPermissionsForAgencyRequest, ListProjectPermissionsForAgencyResponse>
     */
    public SyncInvoker<ListProjectPermissionsForAgencyRequest, ListProjectPermissionsForAgencyResponse> listProjectPermissionsForAgencyInvoker(
        ListProjectPermissionsForAgencyRequest request) {
        return new SyncInvoker<>(request, IamMeta.listProjectPermissionsForAgency, hcClient);
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
     * @return ListRolesForGroupOnEnterpriseProjectResponse
     */
    public ListRolesForGroupOnEnterpriseProjectResponse listRolesForGroupOnEnterpriseProject(
        ListRolesForGroupOnEnterpriseProjectRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.listRolesForGroupOnEnterpriseProject);
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
     * @return SyncInvoker<ListRolesForGroupOnEnterpriseProjectRequest, ListRolesForGroupOnEnterpriseProjectResponse>
     */
    public SyncInvoker<ListRolesForGroupOnEnterpriseProjectRequest, ListRolesForGroupOnEnterpriseProjectResponse> listRolesForGroupOnEnterpriseProjectInvoker(
        ListRolesForGroupOnEnterpriseProjectRequest request) {
        return new SyncInvoker<>(request, IamMeta.listRolesForGroupOnEnterpriseProject, hcClient);
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
     * @return ListRolesForUserOnEnterpriseProjectResponse
     */
    public ListRolesForUserOnEnterpriseProjectResponse listRolesForUserOnEnterpriseProject(
        ListRolesForUserOnEnterpriseProjectRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.listRolesForUserOnEnterpriseProject);
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
     * @return SyncInvoker<ListRolesForUserOnEnterpriseProjectRequest, ListRolesForUserOnEnterpriseProjectResponse>
     */
    public SyncInvoker<ListRolesForUserOnEnterpriseProjectRequest, ListRolesForUserOnEnterpriseProjectResponse> listRolesForUserOnEnterpriseProjectInvoker(
        ListRolesForUserOnEnterpriseProjectRequest request) {
        return new SyncInvoker<>(request, IamMeta.listRolesForUserOnEnterpriseProject, hcClient);
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
     * @return ListUsersForEnterpriseProjectResponse
     */
    public ListUsersForEnterpriseProjectResponse listUsersForEnterpriseProject(
        ListUsersForEnterpriseProjectRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.listUsersForEnterpriseProject);
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
     * @return SyncInvoker<ListUsersForEnterpriseProjectRequest, ListUsersForEnterpriseProjectResponse>
     */
    public SyncInvoker<ListUsersForEnterpriseProjectRequest, ListUsersForEnterpriseProjectResponse> listUsersForEnterpriseProjectInvoker(
        ListUsersForEnterpriseProjectRequest request) {
        return new SyncInvoker<>(request, IamMeta.listUsersForEnterpriseProject, hcClient);
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
     * @return RemoveAllProjectsPermissionFromAgencyResponse
     */
    public RemoveAllProjectsPermissionFromAgencyResponse removeAllProjectsPermissionFromAgency(
        RemoveAllProjectsPermissionFromAgencyRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.removeAllProjectsPermissionFromAgency);
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
     * @return SyncInvoker<RemoveAllProjectsPermissionFromAgencyRequest, RemoveAllProjectsPermissionFromAgencyResponse>
     */
    public SyncInvoker<RemoveAllProjectsPermissionFromAgencyRequest, RemoveAllProjectsPermissionFromAgencyResponse> removeAllProjectsPermissionFromAgencyInvoker(
        RemoveAllProjectsPermissionFromAgencyRequest request) {
        return new SyncInvoker<>(request, IamMeta.removeAllProjectsPermissionFromAgency, hcClient);
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
     * @return RemoveDomainPermissionFromAgencyResponse
     */
    public RemoveDomainPermissionFromAgencyResponse removeDomainPermissionFromAgency(
        RemoveDomainPermissionFromAgencyRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.removeDomainPermissionFromAgency);
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
     * @return SyncInvoker<RemoveDomainPermissionFromAgencyRequest, RemoveDomainPermissionFromAgencyResponse>
     */
    public SyncInvoker<RemoveDomainPermissionFromAgencyRequest, RemoveDomainPermissionFromAgencyResponse> removeDomainPermissionFromAgencyInvoker(
        RemoveDomainPermissionFromAgencyRequest request) {
        return new SyncInvoker<>(request, IamMeta.removeDomainPermissionFromAgency, hcClient);
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
     * @return RemoveProjectPermissionFromAgencyResponse
     */
    public RemoveProjectPermissionFromAgencyResponse removeProjectPermissionFromAgency(
        RemoveProjectPermissionFromAgencyRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.removeProjectPermissionFromAgency);
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
     * @return SyncInvoker<RemoveProjectPermissionFromAgencyRequest, RemoveProjectPermissionFromAgencyResponse>
     */
    public SyncInvoker<RemoveProjectPermissionFromAgencyRequest, RemoveProjectPermissionFromAgencyResponse> removeProjectPermissionFromAgencyInvoker(
        RemoveProjectPermissionFromAgencyRequest request) {
        return new SyncInvoker<>(request, IamMeta.removeProjectPermissionFromAgency, hcClient);
    }

    /**
     * 删除企业项目关联委托的权限
     *
     * 该接口可以删除企业项目委托上的授权
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RevokeRoleFromAgencyOnEnterpriseProjectRequest 请求对象
     * @return RevokeRoleFromAgencyOnEnterpriseProjectResponse
     */
    public RevokeRoleFromAgencyOnEnterpriseProjectResponse revokeRoleFromAgencyOnEnterpriseProject(
        RevokeRoleFromAgencyOnEnterpriseProjectRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.revokeRoleFromAgencyOnEnterpriseProject);
    }

    /**
     * 删除企业项目关联委托的权限
     *
     * 该接口可以删除企业项目委托上的授权
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RevokeRoleFromAgencyOnEnterpriseProjectRequest 请求对象
     * @return SyncInvoker<RevokeRoleFromAgencyOnEnterpriseProjectRequest, RevokeRoleFromAgencyOnEnterpriseProjectResponse>
     */
    public SyncInvoker<RevokeRoleFromAgencyOnEnterpriseProjectRequest, RevokeRoleFromAgencyOnEnterpriseProjectResponse> revokeRoleFromAgencyOnEnterpriseProjectInvoker(
        RevokeRoleFromAgencyOnEnterpriseProjectRequest request) {
        return new SyncInvoker<>(request, IamMeta.revokeRoleFromAgencyOnEnterpriseProject, hcClient);
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
     * @return RevokeRoleFromGroupOnEnterpriseProjectResponse
     */
    public RevokeRoleFromGroupOnEnterpriseProjectResponse revokeRoleFromGroupOnEnterpriseProject(
        RevokeRoleFromGroupOnEnterpriseProjectRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.revokeRoleFromGroupOnEnterpriseProject);
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
     * @return SyncInvoker<RevokeRoleFromGroupOnEnterpriseProjectRequest, RevokeRoleFromGroupOnEnterpriseProjectResponse>
     */
    public SyncInvoker<RevokeRoleFromGroupOnEnterpriseProjectRequest, RevokeRoleFromGroupOnEnterpriseProjectResponse> revokeRoleFromGroupOnEnterpriseProjectInvoker(
        RevokeRoleFromGroupOnEnterpriseProjectRequest request) {
        return new SyncInvoker<>(request, IamMeta.revokeRoleFromGroupOnEnterpriseProject, hcClient);
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
     * @return RevokeRoleFromUserOnEnterpriseProjectResponse
     */
    public RevokeRoleFromUserOnEnterpriseProjectResponse revokeRoleFromUserOnEnterpriseProject(
        RevokeRoleFromUserOnEnterpriseProjectRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.revokeRoleFromUserOnEnterpriseProject);
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
     * @return SyncInvoker<RevokeRoleFromUserOnEnterpriseProjectRequest, RevokeRoleFromUserOnEnterpriseProjectResponse>
     */
    public SyncInvoker<RevokeRoleFromUserOnEnterpriseProjectRequest, RevokeRoleFromUserOnEnterpriseProjectResponse> revokeRoleFromUserOnEnterpriseProjectInvoker(
        RevokeRoleFromUserOnEnterpriseProjectRequest request) {
        return new SyncInvoker<>(request, IamMeta.revokeRoleFromUserOnEnterpriseProject, hcClient);
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
     * @return ShowAgencyResponse
     */
    public ShowAgencyResponse showAgency(ShowAgencyRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.showAgency);
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
     * @return SyncInvoker<ShowAgencyRequest, ShowAgencyResponse>
     */
    public SyncInvoker<ShowAgencyRequest, ShowAgencyResponse> showAgencyInvoker(ShowAgencyRequest request) {
        return new SyncInvoker<>(request, IamMeta.showAgency, hcClient);
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
     * @return ShowCustomPolicyResponse
     */
    public ShowCustomPolicyResponse showCustomPolicy(ShowCustomPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.showCustomPolicy);
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
     * @return SyncInvoker<ShowCustomPolicyRequest, ShowCustomPolicyResponse>
     */
    public SyncInvoker<ShowCustomPolicyRequest, ShowCustomPolicyResponse> showCustomPolicyInvoker(
        ShowCustomPolicyRequest request) {
        return new SyncInvoker<>(request, IamMeta.showCustomPolicy, hcClient);
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
     * @return ShowDomainApiAclPolicyResponse
     */
    public ShowDomainApiAclPolicyResponse showDomainApiAclPolicy(ShowDomainApiAclPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.showDomainApiAclPolicy);
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
     * @return SyncInvoker<ShowDomainApiAclPolicyRequest, ShowDomainApiAclPolicyResponse>
     */
    public SyncInvoker<ShowDomainApiAclPolicyRequest, ShowDomainApiAclPolicyResponse> showDomainApiAclPolicyInvoker(
        ShowDomainApiAclPolicyRequest request) {
        return new SyncInvoker<>(request, IamMeta.showDomainApiAclPolicy, hcClient);
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
     * @return ShowDomainConsoleAclPolicyResponse
     */
    public ShowDomainConsoleAclPolicyResponse showDomainConsoleAclPolicy(ShowDomainConsoleAclPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.showDomainConsoleAclPolicy);
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
     * @return SyncInvoker<ShowDomainConsoleAclPolicyRequest, ShowDomainConsoleAclPolicyResponse>
     */
    public SyncInvoker<ShowDomainConsoleAclPolicyRequest, ShowDomainConsoleAclPolicyResponse> showDomainConsoleAclPolicyInvoker(
        ShowDomainConsoleAclPolicyRequest request) {
        return new SyncInvoker<>(request, IamMeta.showDomainConsoleAclPolicy, hcClient);
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
     * @return ShowDomainLoginPolicyResponse
     */
    public ShowDomainLoginPolicyResponse showDomainLoginPolicy(ShowDomainLoginPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.showDomainLoginPolicy);
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
     * @return SyncInvoker<ShowDomainLoginPolicyRequest, ShowDomainLoginPolicyResponse>
     */
    public SyncInvoker<ShowDomainLoginPolicyRequest, ShowDomainLoginPolicyResponse> showDomainLoginPolicyInvoker(
        ShowDomainLoginPolicyRequest request) {
        return new SyncInvoker<>(request, IamMeta.showDomainLoginPolicy, hcClient);
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
     * @return ShowDomainPasswordPolicyResponse
     */
    public ShowDomainPasswordPolicyResponse showDomainPasswordPolicy(ShowDomainPasswordPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.showDomainPasswordPolicy);
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
     * @return SyncInvoker<ShowDomainPasswordPolicyRequest, ShowDomainPasswordPolicyResponse>
     */
    public SyncInvoker<ShowDomainPasswordPolicyRequest, ShowDomainPasswordPolicyResponse> showDomainPasswordPolicyInvoker(
        ShowDomainPasswordPolicyRequest request) {
        return new SyncInvoker<>(request, IamMeta.showDomainPasswordPolicy, hcClient);
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
     * @return ShowDomainProtectPolicyResponse
     */
    public ShowDomainProtectPolicyResponse showDomainProtectPolicy(ShowDomainProtectPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.showDomainProtectPolicy);
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
     * @return SyncInvoker<ShowDomainProtectPolicyRequest, ShowDomainProtectPolicyResponse>
     */
    public SyncInvoker<ShowDomainProtectPolicyRequest, ShowDomainProtectPolicyResponse> showDomainProtectPolicyInvoker(
        ShowDomainProtectPolicyRequest request) {
        return new SyncInvoker<>(request, IamMeta.showDomainProtectPolicy, hcClient);
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
     * @return ShowDomainQuotaResponse
     */
    public ShowDomainQuotaResponse showDomainQuota(ShowDomainQuotaRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.showDomainQuota);
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
     * @return SyncInvoker<ShowDomainQuotaRequest, ShowDomainQuotaResponse>
     */
    public SyncInvoker<ShowDomainQuotaRequest, ShowDomainQuotaResponse> showDomainQuotaInvoker(
        ShowDomainQuotaRequest request) {
        return new SyncInvoker<>(request, IamMeta.showDomainQuota, hcClient);
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
     * @return ShowDomainRoleAssignmentsResponse
     */
    public ShowDomainRoleAssignmentsResponse showDomainRoleAssignments(ShowDomainRoleAssignmentsRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.showDomainRoleAssignments);
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
     * @return SyncInvoker<ShowDomainRoleAssignmentsRequest, ShowDomainRoleAssignmentsResponse>
     */
    public SyncInvoker<ShowDomainRoleAssignmentsRequest, ShowDomainRoleAssignmentsResponse> showDomainRoleAssignmentsInvoker(
        ShowDomainRoleAssignmentsRequest request) {
        return new SyncInvoker<>(request, IamMeta.showDomainRoleAssignments, hcClient);
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
     * @return ShowMetadataResponse
     */
    public ShowMetadataResponse showMetadata(ShowMetadataRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.showMetadata);
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
     * @return SyncInvoker<ShowMetadataRequest, ShowMetadataResponse>
     */
    public SyncInvoker<ShowMetadataRequest, ShowMetadataResponse> showMetadataInvoker(ShowMetadataRequest request) {
        return new SyncInvoker<>(request, IamMeta.showMetadata, hcClient);
    }

    /**
     * 查询OpenId Connect身份提供商配置
     *
     * 查询OpenId Connect身份提供商配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowOpenIdConnectConfigRequest 请求对象
     * @return ShowOpenIdConnectConfigResponse
     */
    public ShowOpenIdConnectConfigResponse showOpenIdConnectConfig(ShowOpenIdConnectConfigRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.showOpenIdConnectConfig);
    }

    /**
     * 查询OpenId Connect身份提供商配置
     *
     * 查询OpenId Connect身份提供商配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowOpenIdConnectConfigRequest 请求对象
     * @return SyncInvoker<ShowOpenIdConnectConfigRequest, ShowOpenIdConnectConfigResponse>
     */
    public SyncInvoker<ShowOpenIdConnectConfigRequest, ShowOpenIdConnectConfigResponse> showOpenIdConnectConfigInvoker(
        ShowOpenIdConnectConfigRequest request) {
        return new SyncInvoker<>(request, IamMeta.showOpenIdConnectConfig, hcClient);
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
     * @return ShowProjectDetailsAndStatusResponse
     */
    public ShowProjectDetailsAndStatusResponse showProjectDetailsAndStatus(ShowProjectDetailsAndStatusRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.showProjectDetailsAndStatus);
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
     * @return SyncInvoker<ShowProjectDetailsAndStatusRequest, ShowProjectDetailsAndStatusResponse>
     */
    public SyncInvoker<ShowProjectDetailsAndStatusRequest, ShowProjectDetailsAndStatusResponse> showProjectDetailsAndStatusInvoker(
        ShowProjectDetailsAndStatusRequest request) {
        return new SyncInvoker<>(request, IamMeta.showProjectDetailsAndStatus, hcClient);
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
     * @return ShowProjectQuotaResponse
     */
    public ShowProjectQuotaResponse showProjectQuota(ShowProjectQuotaRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.showProjectQuota);
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
     * @return SyncInvoker<ShowProjectQuotaRequest, ShowProjectQuotaResponse>
     */
    public SyncInvoker<ShowProjectQuotaRequest, ShowProjectQuotaResponse> showProjectQuotaInvoker(
        ShowProjectQuotaRequest request) {
        return new SyncInvoker<>(request, IamMeta.showProjectQuota, hcClient);
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
     * @return UpdateAgencyResponse
     */
    public UpdateAgencyResponse updateAgency(UpdateAgencyRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.updateAgency);
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
     * @return SyncInvoker<UpdateAgencyRequest, UpdateAgencyResponse>
     */
    public SyncInvoker<UpdateAgencyRequest, UpdateAgencyResponse> updateAgencyInvoker(UpdateAgencyRequest request) {
        return new SyncInvoker<>(request, IamMeta.updateAgency, hcClient);
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
     * @return UpdateAgencyCustomPolicyResponse
     */
    public UpdateAgencyCustomPolicyResponse updateAgencyCustomPolicy(UpdateAgencyCustomPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.updateAgencyCustomPolicy);
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
     * @return SyncInvoker<UpdateAgencyCustomPolicyRequest, UpdateAgencyCustomPolicyResponse>
     */
    public SyncInvoker<UpdateAgencyCustomPolicyRequest, UpdateAgencyCustomPolicyResponse> updateAgencyCustomPolicyInvoker(
        UpdateAgencyCustomPolicyRequest request) {
        return new SyncInvoker<>(request, IamMeta.updateAgencyCustomPolicy, hcClient);
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
     * @return UpdateCloudServiceCustomPolicyResponse
     */
    public UpdateCloudServiceCustomPolicyResponse updateCloudServiceCustomPolicy(
        UpdateCloudServiceCustomPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.updateCloudServiceCustomPolicy);
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
     * @return SyncInvoker<UpdateCloudServiceCustomPolicyRequest, UpdateCloudServiceCustomPolicyResponse>
     */
    public SyncInvoker<UpdateCloudServiceCustomPolicyRequest, UpdateCloudServiceCustomPolicyResponse> updateCloudServiceCustomPolicyInvoker(
        UpdateCloudServiceCustomPolicyRequest request) {
        return new SyncInvoker<>(request, IamMeta.updateCloudServiceCustomPolicy, hcClient);
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
     * @return UpdateDomainApiAclPolicyResponse
     */
    public UpdateDomainApiAclPolicyResponse updateDomainApiAclPolicy(UpdateDomainApiAclPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.updateDomainApiAclPolicy);
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
     * @return SyncInvoker<UpdateDomainApiAclPolicyRequest, UpdateDomainApiAclPolicyResponse>
     */
    public SyncInvoker<UpdateDomainApiAclPolicyRequest, UpdateDomainApiAclPolicyResponse> updateDomainApiAclPolicyInvoker(
        UpdateDomainApiAclPolicyRequest request) {
        return new SyncInvoker<>(request, IamMeta.updateDomainApiAclPolicy, hcClient);
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
     * @return UpdateDomainConsoleAclPolicyResponse
     */
    public UpdateDomainConsoleAclPolicyResponse updateDomainConsoleAclPolicy(
        UpdateDomainConsoleAclPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.updateDomainConsoleAclPolicy);
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
     * @return SyncInvoker<UpdateDomainConsoleAclPolicyRequest, UpdateDomainConsoleAclPolicyResponse>
     */
    public SyncInvoker<UpdateDomainConsoleAclPolicyRequest, UpdateDomainConsoleAclPolicyResponse> updateDomainConsoleAclPolicyInvoker(
        UpdateDomainConsoleAclPolicyRequest request) {
        return new SyncInvoker<>(request, IamMeta.updateDomainConsoleAclPolicy, hcClient);
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
     * @return UpdateDomainGroupInheritRoleResponse
     */
    public UpdateDomainGroupInheritRoleResponse updateDomainGroupInheritRole(
        UpdateDomainGroupInheritRoleRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.updateDomainGroupInheritRole);
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
     * @return SyncInvoker<UpdateDomainGroupInheritRoleRequest, UpdateDomainGroupInheritRoleResponse>
     */
    public SyncInvoker<UpdateDomainGroupInheritRoleRequest, UpdateDomainGroupInheritRoleResponse> updateDomainGroupInheritRoleInvoker(
        UpdateDomainGroupInheritRoleRequest request) {
        return new SyncInvoker<>(request, IamMeta.updateDomainGroupInheritRole, hcClient);
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
     * @return UpdateDomainLoginPolicyResponse
     */
    public UpdateDomainLoginPolicyResponse updateDomainLoginPolicy(UpdateDomainLoginPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.updateDomainLoginPolicy);
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
     * @return SyncInvoker<UpdateDomainLoginPolicyRequest, UpdateDomainLoginPolicyResponse>
     */
    public SyncInvoker<UpdateDomainLoginPolicyRequest, UpdateDomainLoginPolicyResponse> updateDomainLoginPolicyInvoker(
        UpdateDomainLoginPolicyRequest request) {
        return new SyncInvoker<>(request, IamMeta.updateDomainLoginPolicy, hcClient);
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
     * @return UpdateDomainPasswordPolicyResponse
     */
    public UpdateDomainPasswordPolicyResponse updateDomainPasswordPolicy(UpdateDomainPasswordPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.updateDomainPasswordPolicy);
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
     * @return SyncInvoker<UpdateDomainPasswordPolicyRequest, UpdateDomainPasswordPolicyResponse>
     */
    public SyncInvoker<UpdateDomainPasswordPolicyRequest, UpdateDomainPasswordPolicyResponse> updateDomainPasswordPolicyInvoker(
        UpdateDomainPasswordPolicyRequest request) {
        return new SyncInvoker<>(request, IamMeta.updateDomainPasswordPolicy, hcClient);
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
     * @return UpdateDomainProtectPolicyResponse
     */
    public UpdateDomainProtectPolicyResponse updateDomainProtectPolicy(UpdateDomainProtectPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.updateDomainProtectPolicy);
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
     * @return SyncInvoker<UpdateDomainProtectPolicyRequest, UpdateDomainProtectPolicyResponse>
     */
    public SyncInvoker<UpdateDomainProtectPolicyRequest, UpdateDomainProtectPolicyResponse> updateDomainProtectPolicyInvoker(
        UpdateDomainProtectPolicyRequest request) {
        return new SyncInvoker<>(request, IamMeta.updateDomainProtectPolicy, hcClient);
    }

    /**
     * 修改OpenId Connect身份提供商配置
     *
     * 修改OpenId Connect身份提供商配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateOpenIdConnectConfigRequest 请求对象
     * @return UpdateOpenIdConnectConfigResponse
     */
    public UpdateOpenIdConnectConfigResponse updateOpenIdConnectConfig(UpdateOpenIdConnectConfigRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.updateOpenIdConnectConfig);
    }

    /**
     * 修改OpenId Connect身份提供商配置
     *
     * 修改OpenId Connect身份提供商配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateOpenIdConnectConfigRequest 请求对象
     * @return SyncInvoker<UpdateOpenIdConnectConfigRequest, UpdateOpenIdConnectConfigResponse>
     */
    public SyncInvoker<UpdateOpenIdConnectConfigRequest, UpdateOpenIdConnectConfigResponse> updateOpenIdConnectConfigInvoker(
        UpdateOpenIdConnectConfigRequest request) {
        return new SyncInvoker<>(request, IamMeta.updateOpenIdConnectConfig, hcClient);
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
     * @return UpdateProjectStatusResponse
     */
    public UpdateProjectStatusResponse updateProjectStatus(UpdateProjectStatusRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.updateProjectStatus);
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
     * @return SyncInvoker<UpdateProjectStatusRequest, UpdateProjectStatusResponse>
     */
    public SyncInvoker<UpdateProjectStatusRequest, UpdateProjectStatusResponse> updateProjectStatusInvoker(
        UpdateProjectStatusRequest request) {
        return new SyncInvoker<>(request, IamMeta.updateProjectStatus, hcClient);
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
     * @return CreatePermanentAccessKeyResponse
     */
    public CreatePermanentAccessKeyResponse createPermanentAccessKey(CreatePermanentAccessKeyRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.createPermanentAccessKey);
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
     * @return SyncInvoker<CreatePermanentAccessKeyRequest, CreatePermanentAccessKeyResponse>
     */
    public SyncInvoker<CreatePermanentAccessKeyRequest, CreatePermanentAccessKeyResponse> createPermanentAccessKeyInvoker(
        CreatePermanentAccessKeyRequest request) {
        return new SyncInvoker<>(request, IamMeta.createPermanentAccessKey, hcClient);
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
     * @return CreateTemporaryAccessKeyByAgencyResponse
     */
    public CreateTemporaryAccessKeyByAgencyResponse createTemporaryAccessKeyByAgency(
        CreateTemporaryAccessKeyByAgencyRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.createTemporaryAccessKeyByAgency);
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
     * @return SyncInvoker<CreateTemporaryAccessKeyByAgencyRequest, CreateTemporaryAccessKeyByAgencyResponse>
     */
    public SyncInvoker<CreateTemporaryAccessKeyByAgencyRequest, CreateTemporaryAccessKeyByAgencyResponse> createTemporaryAccessKeyByAgencyInvoker(
        CreateTemporaryAccessKeyByAgencyRequest request) {
        return new SyncInvoker<>(request, IamMeta.createTemporaryAccessKeyByAgency, hcClient);
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
     * @return CreateTemporaryAccessKeyByTokenResponse
     */
    public CreateTemporaryAccessKeyByTokenResponse createTemporaryAccessKeyByToken(
        CreateTemporaryAccessKeyByTokenRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.createTemporaryAccessKeyByToken);
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
     * @return SyncInvoker<CreateTemporaryAccessKeyByTokenRequest, CreateTemporaryAccessKeyByTokenResponse>
     */
    public SyncInvoker<CreateTemporaryAccessKeyByTokenRequest, CreateTemporaryAccessKeyByTokenResponse> createTemporaryAccessKeyByTokenInvoker(
        CreateTemporaryAccessKeyByTokenRequest request) {
        return new SyncInvoker<>(request, IamMeta.createTemporaryAccessKeyByToken, hcClient);
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
     * @return DeletePermanentAccessKeyResponse
     */
    public DeletePermanentAccessKeyResponse deletePermanentAccessKey(DeletePermanentAccessKeyRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.deletePermanentAccessKey);
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
     * @return SyncInvoker<DeletePermanentAccessKeyRequest, DeletePermanentAccessKeyResponse>
     */
    public SyncInvoker<DeletePermanentAccessKeyRequest, DeletePermanentAccessKeyResponse> deletePermanentAccessKeyInvoker(
        DeletePermanentAccessKeyRequest request) {
        return new SyncInvoker<>(request, IamMeta.deletePermanentAccessKey, hcClient);
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
     * @return ListPermanentAccessKeysResponse
     */
    public ListPermanentAccessKeysResponse listPermanentAccessKeys(ListPermanentAccessKeysRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.listPermanentAccessKeys);
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
     * @return SyncInvoker<ListPermanentAccessKeysRequest, ListPermanentAccessKeysResponse>
     */
    public SyncInvoker<ListPermanentAccessKeysRequest, ListPermanentAccessKeysResponse> listPermanentAccessKeysInvoker(
        ListPermanentAccessKeysRequest request) {
        return new SyncInvoker<>(request, IamMeta.listPermanentAccessKeys, hcClient);
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
     * @return ShowPermanentAccessKeyResponse
     */
    public ShowPermanentAccessKeyResponse showPermanentAccessKey(ShowPermanentAccessKeyRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.showPermanentAccessKey);
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
     * @return SyncInvoker<ShowPermanentAccessKeyRequest, ShowPermanentAccessKeyResponse>
     */
    public SyncInvoker<ShowPermanentAccessKeyRequest, ShowPermanentAccessKeyResponse> showPermanentAccessKeyInvoker(
        ShowPermanentAccessKeyRequest request) {
        return new SyncInvoker<>(request, IamMeta.showPermanentAccessKey, hcClient);
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
     * @return UpdatePermanentAccessKeyResponse
     */
    public UpdatePermanentAccessKeyResponse updatePermanentAccessKey(UpdatePermanentAccessKeyRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.updatePermanentAccessKey);
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
     * @return SyncInvoker<UpdatePermanentAccessKeyRequest, UpdatePermanentAccessKeyResponse>
     */
    public SyncInvoker<UpdatePermanentAccessKeyRequest, UpdatePermanentAccessKeyResponse> updatePermanentAccessKeyInvoker(
        UpdatePermanentAccessKeyRequest request) {
        return new SyncInvoker<>(request, IamMeta.updatePermanentAccessKey, hcClient);
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
     * @return CreateUserResponse
     */
    public CreateUserResponse createUser(CreateUserRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.createUser);
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
     * @return SyncInvoker<CreateUserRequest, CreateUserResponse>
     */
    public SyncInvoker<CreateUserRequest, CreateUserResponse> createUserInvoker(CreateUserRequest request) {
        return new SyncInvoker<>(request, IamMeta.createUser, hcClient);
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
     * @return KeystoneCreateUserResponse
     */
    public KeystoneCreateUserResponse keystoneCreateUser(KeystoneCreateUserRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneCreateUser);
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
     * @return SyncInvoker<KeystoneCreateUserRequest, KeystoneCreateUserResponse>
     */
    public SyncInvoker<KeystoneCreateUserRequest, KeystoneCreateUserResponse> keystoneCreateUserInvoker(
        KeystoneCreateUserRequest request) {
        return new SyncInvoker<>(request, IamMeta.keystoneCreateUser, hcClient);
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
     * @return KeystoneDeleteUserResponse
     */
    public KeystoneDeleteUserResponse keystoneDeleteUser(KeystoneDeleteUserRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneDeleteUser);
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
     * @return SyncInvoker<KeystoneDeleteUserRequest, KeystoneDeleteUserResponse>
     */
    public SyncInvoker<KeystoneDeleteUserRequest, KeystoneDeleteUserResponse> keystoneDeleteUserInvoker(
        KeystoneDeleteUserRequest request) {
        return new SyncInvoker<>(request, IamMeta.keystoneDeleteUser, hcClient);
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
     * @return KeystoneListGroupsForUserResponse
     */
    public KeystoneListGroupsForUserResponse keystoneListGroupsForUser(KeystoneListGroupsForUserRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneListGroupsForUser);
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
     * @return SyncInvoker<KeystoneListGroupsForUserRequest, KeystoneListGroupsForUserResponse>
     */
    public SyncInvoker<KeystoneListGroupsForUserRequest, KeystoneListGroupsForUserResponse> keystoneListGroupsForUserInvoker(
        KeystoneListGroupsForUserRequest request) {
        return new SyncInvoker<>(request, IamMeta.keystoneListGroupsForUser, hcClient);
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
     * @return KeystoneListUsersResponse
     */
    public KeystoneListUsersResponse keystoneListUsers(KeystoneListUsersRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneListUsers);
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
     * @return SyncInvoker<KeystoneListUsersRequest, KeystoneListUsersResponse>
     */
    public SyncInvoker<KeystoneListUsersRequest, KeystoneListUsersResponse> keystoneListUsersInvoker(
        KeystoneListUsersRequest request) {
        return new SyncInvoker<>(request, IamMeta.keystoneListUsers, hcClient);
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
     * @return KeystoneListUsersForGroupByAdminResponse
     */
    public KeystoneListUsersForGroupByAdminResponse keystoneListUsersForGroupByAdmin(
        KeystoneListUsersForGroupByAdminRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneListUsersForGroupByAdmin);
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
     * @return SyncInvoker<KeystoneListUsersForGroupByAdminRequest, KeystoneListUsersForGroupByAdminResponse>
     */
    public SyncInvoker<KeystoneListUsersForGroupByAdminRequest, KeystoneListUsersForGroupByAdminResponse> keystoneListUsersForGroupByAdminInvoker(
        KeystoneListUsersForGroupByAdminRequest request) {
        return new SyncInvoker<>(request, IamMeta.keystoneListUsersForGroupByAdmin, hcClient);
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
     * @return KeystoneShowUserResponse
     */
    public KeystoneShowUserResponse keystoneShowUser(KeystoneShowUserRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneShowUser);
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
     * @return SyncInvoker<KeystoneShowUserRequest, KeystoneShowUserResponse>
     */
    public SyncInvoker<KeystoneShowUserRequest, KeystoneShowUserResponse> keystoneShowUserInvoker(
        KeystoneShowUserRequest request) {
        return new SyncInvoker<>(request, IamMeta.keystoneShowUser, hcClient);
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
     * @return KeystoneUpdateUserByAdminResponse
     */
    public KeystoneUpdateUserByAdminResponse keystoneUpdateUserByAdmin(KeystoneUpdateUserByAdminRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneUpdateUserByAdmin);
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
     * @return SyncInvoker<KeystoneUpdateUserByAdminRequest, KeystoneUpdateUserByAdminResponse>
     */
    public SyncInvoker<KeystoneUpdateUserByAdminRequest, KeystoneUpdateUserByAdminResponse> keystoneUpdateUserByAdminInvoker(
        KeystoneUpdateUserByAdminRequest request) {
        return new SyncInvoker<>(request, IamMeta.keystoneUpdateUserByAdmin, hcClient);
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
     * @return KeystoneUpdateUserPasswordResponse
     */
    public KeystoneUpdateUserPasswordResponse keystoneUpdateUserPassword(KeystoneUpdateUserPasswordRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneUpdateUserPassword);
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
     * @return SyncInvoker<KeystoneUpdateUserPasswordRequest, KeystoneUpdateUserPasswordResponse>
     */
    public SyncInvoker<KeystoneUpdateUserPasswordRequest, KeystoneUpdateUserPasswordResponse> keystoneUpdateUserPasswordInvoker(
        KeystoneUpdateUserPasswordRequest request) {
        return new SyncInvoker<>(request, IamMeta.keystoneUpdateUserPassword, hcClient);
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
     * @return ListUserLoginProtectsResponse
     */
    public ListUserLoginProtectsResponse listUserLoginProtects(ListUserLoginProtectsRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.listUserLoginProtects);
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
     * @return SyncInvoker<ListUserLoginProtectsRequest, ListUserLoginProtectsResponse>
     */
    public SyncInvoker<ListUserLoginProtectsRequest, ListUserLoginProtectsResponse> listUserLoginProtectsInvoker(
        ListUserLoginProtectsRequest request) {
        return new SyncInvoker<>(request, IamMeta.listUserLoginProtects, hcClient);
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
     * @return ListUserMfaDevicesResponse
     */
    public ListUserMfaDevicesResponse listUserMfaDevices(ListUserMfaDevicesRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.listUserMfaDevices);
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
     * @return SyncInvoker<ListUserMfaDevicesRequest, ListUserMfaDevicesResponse>
     */
    public SyncInvoker<ListUserMfaDevicesRequest, ListUserMfaDevicesResponse> listUserMfaDevicesInvoker(
        ListUserMfaDevicesRequest request) {
        return new SyncInvoker<>(request, IamMeta.listUserMfaDevices, hcClient);
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
     * @return ShowUserResponse
     */
    public ShowUserResponse showUser(ShowUserRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.showUser);
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
     * @return SyncInvoker<ShowUserRequest, ShowUserResponse>
     */
    public SyncInvoker<ShowUserRequest, ShowUserResponse> showUserInvoker(ShowUserRequest request) {
        return new SyncInvoker<>(request, IamMeta.showUser, hcClient);
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
     * @return ShowUserLoginProtectResponse
     */
    public ShowUserLoginProtectResponse showUserLoginProtect(ShowUserLoginProtectRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.showUserLoginProtect);
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
     * @return SyncInvoker<ShowUserLoginProtectRequest, ShowUserLoginProtectResponse>
     */
    public SyncInvoker<ShowUserLoginProtectRequest, ShowUserLoginProtectResponse> showUserLoginProtectInvoker(
        ShowUserLoginProtectRequest request) {
        return new SyncInvoker<>(request, IamMeta.showUserLoginProtect, hcClient);
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
     * @return ShowUserMfaDeviceResponse
     */
    public ShowUserMfaDeviceResponse showUserMfaDevice(ShowUserMfaDeviceRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.showUserMfaDevice);
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
     * @return SyncInvoker<ShowUserMfaDeviceRequest, ShowUserMfaDeviceResponse>
     */
    public SyncInvoker<ShowUserMfaDeviceRequest, ShowUserMfaDeviceResponse> showUserMfaDeviceInvoker(
        ShowUserMfaDeviceRequest request) {
        return new SyncInvoker<>(request, IamMeta.showUserMfaDevice, hcClient);
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
     * @return UpdateLoginProtectResponse
     */
    public UpdateLoginProtectResponse updateLoginProtect(UpdateLoginProtectRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.updateLoginProtect);
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
     * @return SyncInvoker<UpdateLoginProtectRequest, UpdateLoginProtectResponse>
     */
    public SyncInvoker<UpdateLoginProtectRequest, UpdateLoginProtectResponse> updateLoginProtectInvoker(
        UpdateLoginProtectRequest request) {
        return new SyncInvoker<>(request, IamMeta.updateLoginProtect, hcClient);
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
     * @return UpdateUserResponse
     */
    public UpdateUserResponse updateUser(UpdateUserRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.updateUser);
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
     * @return SyncInvoker<UpdateUserRequest, UpdateUserResponse>
     */
    public SyncInvoker<UpdateUserRequest, UpdateUserResponse> updateUserInvoker(UpdateUserRequest request) {
        return new SyncInvoker<>(request, IamMeta.updateUser, hcClient);
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
     * @return UpdateUserInformationResponse
     */
    public UpdateUserInformationResponse updateUserInformation(UpdateUserInformationRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.updateUserInformation);
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
     * @return SyncInvoker<UpdateUserInformationRequest, UpdateUserInformationResponse>
     */
    public SyncInvoker<UpdateUserInformationRequest, UpdateUserInformationResponse> updateUserInformationInvoker(
        UpdateUserInformationRequest request) {
        return new SyncInvoker<>(request, IamMeta.updateUserInformation, hcClient);
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
     * @return KeystoneCreateAgencyTokenResponse
     */
    public KeystoneCreateAgencyTokenResponse keystoneCreateAgencyToken(KeystoneCreateAgencyTokenRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneCreateAgencyToken);
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
     * @return SyncInvoker<KeystoneCreateAgencyTokenRequest, KeystoneCreateAgencyTokenResponse>
     */
    public SyncInvoker<KeystoneCreateAgencyTokenRequest, KeystoneCreateAgencyTokenResponse> keystoneCreateAgencyTokenInvoker(
        KeystoneCreateAgencyTokenRequest request) {
        return new SyncInvoker<>(request, IamMeta.keystoneCreateAgencyToken, hcClient);
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
     * @return KeystoneCreateUserTokenByPasswordResponse
     */
    public KeystoneCreateUserTokenByPasswordResponse keystoneCreateUserTokenByPassword(
        KeystoneCreateUserTokenByPasswordRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneCreateUserTokenByPassword);
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
     * @return SyncInvoker<KeystoneCreateUserTokenByPasswordRequest, KeystoneCreateUserTokenByPasswordResponse>
     */
    public SyncInvoker<KeystoneCreateUserTokenByPasswordRequest, KeystoneCreateUserTokenByPasswordResponse> keystoneCreateUserTokenByPasswordInvoker(
        KeystoneCreateUserTokenByPasswordRequest request) {
        return new SyncInvoker<>(request, IamMeta.keystoneCreateUserTokenByPassword, hcClient);
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
     * @return KeystoneCreateUserTokenByPasswordAndMfaResponse
     */
    public KeystoneCreateUserTokenByPasswordAndMfaResponse keystoneCreateUserTokenByPasswordAndMfa(
        KeystoneCreateUserTokenByPasswordAndMfaRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneCreateUserTokenByPasswordAndMfa);
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
     * @return SyncInvoker<KeystoneCreateUserTokenByPasswordAndMfaRequest, KeystoneCreateUserTokenByPasswordAndMfaResponse>
     */
    public SyncInvoker<KeystoneCreateUserTokenByPasswordAndMfaRequest, KeystoneCreateUserTokenByPasswordAndMfaResponse> keystoneCreateUserTokenByPasswordAndMfaInvoker(
        KeystoneCreateUserTokenByPasswordAndMfaRequest request) {
        return new SyncInvoker<>(request, IamMeta.keystoneCreateUserTokenByPasswordAndMfa, hcClient);
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
     * @return KeystoneValidateTokenResponse
     */
    public KeystoneValidateTokenResponse keystoneValidateToken(KeystoneValidateTokenRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneValidateToken);
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
     * @return SyncInvoker<KeystoneValidateTokenRequest, KeystoneValidateTokenResponse>
     */
    public SyncInvoker<KeystoneValidateTokenRequest, KeystoneValidateTokenResponse> keystoneValidateTokenInvoker(
        KeystoneValidateTokenRequest request) {
        return new SyncInvoker<>(request, IamMeta.keystoneValidateToken, hcClient);
    }

}
