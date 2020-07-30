package com.huaweicloud.sdk.iam.v3;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.iam.v3.model.*;

public class IamClient {
    protected HcClient hcClient;

    public IamClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<IamClient> newBuilder() {
        return new ClientBuilder<>(IamClient::new, "GlobalCredentials");
    }

    public AssociateAgencyWithDomainPermissionResponse associateAgencyWithDomainPermission(AssociateAgencyWithDomainPermissionRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.associateAgencyWithDomainPermission);
    }

    public AssociateAgencyWithProjectPermissionResponse associateAgencyWithProjectPermission(AssociateAgencyWithProjectPermissionRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.associateAgencyWithProjectPermission);
    }

    public CheckDomainPermissionForAgencyResponse checkDomainPermissionForAgency(CheckDomainPermissionForAgencyRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.checkDomainPermissionForAgency);
    }

    public CheckProjectPermissionForAgencyResponse checkProjectPermissionForAgency(CheckProjectPermissionForAgencyRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.checkProjectPermissionForAgency);
    }

    public CreateAgencyResponse createAgency(CreateAgencyRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.createAgency);
    }

    public CreateAgencyCustomPolicyResponse createAgencyCustomPolicy(CreateAgencyCustomPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.createAgencyCustomPolicy);
    }

    public CreateCloudServiceCustomPolicyResponse createCloudServiceCustomPolicy(CreateCloudServiceCustomPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.createCloudServiceCustomPolicy);
    }

    public DeleteAgencyResponse deleteAgency(DeleteAgencyRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.deleteAgency);
    }

    public DeleteCustomPolicyResponse deleteCustomPolicy(DeleteCustomPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.deleteCustomPolicy);
    }

    public KeystoneAddUserToGroupResponse keystoneAddUserToGroup(KeystoneAddUserToGroupRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneAddUserToGroup);
    }

    public KeystoneAssociateGroupWithAllProjectPermissionResponse keystoneAssociateGroupWithAllProjectPermission(KeystoneAssociateGroupWithAllProjectPermissionRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneAssociateGroupWithAllProjectPermission);
    }

    public KeystoneAssociateGroupWithDomainPermissionResponse keystoneAssociateGroupWithDomainPermission(KeystoneAssociateGroupWithDomainPermissionRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneAssociateGroupWithDomainPermission);
    }

    public KeystoneAssociateGroupWithProjectPermissionResponse keystoneAssociateGroupWithProjectPermission(KeystoneAssociateGroupWithProjectPermissionRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneAssociateGroupWithProjectPermission);
    }

    public KeystoneCheckDomainPermissionForGroupResponse keystoneCheckDomainPermissionForGroup(KeystoneCheckDomainPermissionForGroupRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneCheckDomainPermissionForGroup);
    }

    public KeystoneCheckProjectPermissionForGroupResponse keystoneCheckProjectPermissionForGroup(KeystoneCheckProjectPermissionForGroupRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneCheckProjectPermissionForGroup);
    }

    public KeystoneCheckUserInGroupResponse keystoneCheckUserInGroup(KeystoneCheckUserInGroupRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneCheckUserInGroup);
    }

    public KeystoneCreateGroupResponse keystoneCreateGroup(KeystoneCreateGroupRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneCreateGroup);
    }

    public KeystoneCreateProjectResponse keystoneCreateProject(KeystoneCreateProjectRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneCreateProject);
    }

    public KeystoneDeleteGroupResponse keystoneDeleteGroup(KeystoneDeleteGroupRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneDeleteGroup);
    }

    public KeystoneListAuthDomainsResponse keystoneListAuthDomains(KeystoneListAuthDomainsRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneListAuthDomains);
    }

    public KeystoneListAuthProjectsResponse keystoneListAuthProjects(KeystoneListAuthProjectsRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneListAuthProjects);
    }

    public KeystoneListDomainPermissionsForGroupResponse keystoneListDomainPermissionsForGroup(KeystoneListDomainPermissionsForGroupRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneListDomainPermissionsForGroup);
    }

    public KeystoneListEndpointsResponse keystoneListEndpoints(KeystoneListEndpointsRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneListEndpoints);
    }

    public KeystoneListGroupsResponse keystoneListGroups(KeystoneListGroupsRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneListGroups);
    }

    public KeystoneListPermissionsResponse keystoneListPermissions(KeystoneListPermissionsRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneListPermissions);
    }

    public KeystoneListProjectPermissionsForGroupResponse keystoneListProjectPermissionsForGroup(KeystoneListProjectPermissionsForGroupRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneListProjectPermissionsForGroup);
    }

    public KeystoneListProjectsResponse keystoneListProjects(KeystoneListProjectsRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneListProjects);
    }

    public KeystoneListProjectsForUserResponse keystoneListProjectsForUser(KeystoneListProjectsForUserRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneListProjectsForUser);
    }

    public KeystoneListRegionsResponse keystoneListRegions(KeystoneListRegionsRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneListRegions);
    }

    public KeystoneListServicesResponse keystoneListServices(KeystoneListServicesRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneListServices);
    }

    public KeystoneListUsersForGroupByAdminResponse keystoneListUsersForGroupByAdmin(KeystoneListUsersForGroupByAdminRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneListUsersForGroupByAdmin);
    }

    public KeystoneListVersionsResponse keystoneListVersions(KeystoneListVersionsRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneListVersions);
    }

    public KeystoneRemoveDomainPermissionFromGroupResponse keystoneRemoveDomainPermissionFromGroup(KeystoneRemoveDomainPermissionFromGroupRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneRemoveDomainPermissionFromGroup);
    }

    public KeystoneRemoveProjectPermissionFromGroupResponse keystoneRemoveProjectPermissionFromGroup(KeystoneRemoveProjectPermissionFromGroupRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneRemoveProjectPermissionFromGroup);
    }

    public KeystoneRemoveUserFromGroupResponse keystoneRemoveUserFromGroup(KeystoneRemoveUserFromGroupRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneRemoveUserFromGroup);
    }

    public KeystoneShowCatalogResponse keystoneShowCatalog(KeystoneShowCatalogRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneShowCatalog);
    }

    public KeystoneShowEndpointResponse keystoneShowEndpoint(KeystoneShowEndpointRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneShowEndpoint);
    }

    public KeystoneShowGroupResponse keystoneShowGroup(KeystoneShowGroupRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneShowGroup);
    }

    public KeystoneShowPermissionResponse keystoneShowPermission(KeystoneShowPermissionRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneShowPermission);
    }

    public KeystoneShowProjectResponse keystoneShowProject(KeystoneShowProjectRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneShowProject);
    }

    public KeystoneShowRegionResponse keystoneShowRegion(KeystoneShowRegionRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneShowRegion);
    }

    public KeystoneShowSecurityComplianceResponse keystoneShowSecurityCompliance(KeystoneShowSecurityComplianceRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneShowSecurityCompliance);
    }

    public KeystoneShowSecurityComplianceByOptionResponse keystoneShowSecurityComplianceByOption(KeystoneShowSecurityComplianceByOptionRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneShowSecurityComplianceByOption);
    }

    public KeystoneShowServiceResponse keystoneShowService(KeystoneShowServiceRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneShowService);
    }

    public KeystoneShowVersionResponse keystoneShowVersion(KeystoneShowVersionRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneShowVersion);
    }

    public KeystoneUpdateGroupResponse keystoneUpdateGroup(KeystoneUpdateGroupRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneUpdateGroup);
    }

    public KeystoneUpdateProjectResponse keystoneUpdateProject(KeystoneUpdateProjectRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneUpdateProject);
    }

    public ListAgenciesResponse listAgencies(ListAgenciesRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.listAgencies);
    }

    public ListCustomPoliciesResponse listCustomPolicies(ListCustomPoliciesRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.listCustomPolicies);
    }

    public ListDomainPermissionsForAgencyResponse listDomainPermissionsForAgency(ListDomainPermissionsForAgencyRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.listDomainPermissionsForAgency);
    }

    public ListProjectPermissionsForAgencyResponse listProjectPermissionsForAgency(ListProjectPermissionsForAgencyRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.listProjectPermissionsForAgency);
    }

    public RemoveDomainPermissionFromAgencyResponse removeDomainPermissionFromAgency(RemoveDomainPermissionFromAgencyRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.removeDomainPermissionFromAgency);
    }

    public RemoveProjectPermissionFromAgencyResponse removeProjectPermissionFromAgency(RemoveProjectPermissionFromAgencyRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.removeProjectPermissionFromAgency);
    }

    public ShowAgencyResponse showAgency(ShowAgencyRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.showAgency);
    }

    public ShowCustomPolicyResponse showCustomPolicy(ShowCustomPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.showCustomPolicy);
    }

    public ShowProjectDetailsAndStatusResponse showProjectDetailsAndStatus(ShowProjectDetailsAndStatusRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.showProjectDetailsAndStatus);
    }

    public UpdateAgencyResponse updateAgency(UpdateAgencyRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.updateAgency);
    }

    public UpdateAgencyCustomPolicyResponse updateAgencyCustomPolicy(UpdateAgencyCustomPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.updateAgencyCustomPolicy);
    }

    public UpdateCloudServiceCustomPolicyResponse updateCloudServiceCustomPolicy(UpdateCloudServiceCustomPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.updateCloudServiceCustomPolicy);
    }

    public UpdateProjectStatusResponse updateProjectStatus(UpdateProjectStatusRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.updateProjectStatus);
    }

    public CreatePermanentAccessKeyResponse createPermanentAccessKey(CreatePermanentAccessKeyRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.createPermanentAccessKey);
    }

    public CreateTemporaryAccessKeyByAgencyResponse createTemporaryAccessKeyByAgency(CreateTemporaryAccessKeyByAgencyRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.createTemporaryAccessKeyByAgency);
    }

    public CreateTemporaryAccessKeyByTokenResponse createTemporaryAccessKeyByToken(CreateTemporaryAccessKeyByTokenRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.createTemporaryAccessKeyByToken);
    }

    public DeletePermanentAccessKeyResponse deletePermanentAccessKey(DeletePermanentAccessKeyRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.deletePermanentAccessKey);
    }

    public ListPermanentAccessKeysResponse listPermanentAccessKeys(ListPermanentAccessKeysRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.listPermanentAccessKeys);
    }

    public ShowPermanentAccessKeyResponse showPermanentAccessKey(ShowPermanentAccessKeyRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.showPermanentAccessKey);
    }

    public UpdatePermanentAccessKeyResponse updatePermanentAccessKey(UpdatePermanentAccessKeyRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.updatePermanentAccessKey);
    }

    public CreateUserResponse createUser(CreateUserRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.createUser);
    }

    public KeystoneCreateUserResponse keystoneCreateUser(KeystoneCreateUserRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneCreateUser);
    }

    public KeystoneDeleteUserResponse keystoneDeleteUser(KeystoneDeleteUserRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneDeleteUser);
    }

    public KeystoneListGroupsForUserResponse keystoneListGroupsForUser(KeystoneListGroupsForUserRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneListGroupsForUser);
    }

    public KeystoneListUsersResponse keystoneListUsers(KeystoneListUsersRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneListUsers);
    }

    public KeystoneShowUserResponse keystoneShowUser(KeystoneShowUserRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneShowUser);
    }

    public KeystoneUpdateUserByAdminResponse keystoneUpdateUserByAdmin(KeystoneUpdateUserByAdminRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneUpdateUserByAdmin);
    }

    public KeystoneUpdateUserPasswordResponse keystoneUpdateUserPassword(KeystoneUpdateUserPasswordRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneUpdateUserPassword);
    }

    public ShowUserResponse showUser(ShowUserRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.showUser);
    }

    public UpdateUserResponse updateUser(UpdateUserRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.updateUser);
    }

    public UpdateUserInformationResponse updateUserInformation(UpdateUserInformationRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.updateUserInformation);
    }

}