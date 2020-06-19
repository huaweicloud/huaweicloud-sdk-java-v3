package com.huaweicloud.sdk.iam.v3;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

import com.huaweicloud.sdk.iam.v3.model.*;

public class IamAsyncClient {
    protected HcClient hcClient;

    public IamAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<IamAsyncClient> newBuilder() {
        return new ClientBuilder<>(IamAsyncClient::new);
    }


    public CompletableFuture<AssociateAgencyWithDomainPermissionResponse> associateAgencyWithDomainPermissionAsync(AssociateAgencyWithDomainPermissionRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.associateAgencyWithDomainPermission);
    }

    public CompletableFuture<AssociateAgencyWithProjectPermissionResponse> associateAgencyWithProjectPermissionAsync(AssociateAgencyWithProjectPermissionRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.associateAgencyWithProjectPermission);
    }

    public CompletableFuture<CheckDomainPermissionForAgencyResponse> checkDomainPermissionForAgencyAsync(CheckDomainPermissionForAgencyRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.checkDomainPermissionForAgency);
    }

    public CompletableFuture<CheckProjectPermissionForAgencyResponse> checkProjectPermissionForAgencyAsync(CheckProjectPermissionForAgencyRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.checkProjectPermissionForAgency);
    }

    public CompletableFuture<CreateAgencyResponse> createAgencyAsync(CreateAgencyRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.createAgency);
    }

    public CompletableFuture<CreateAgencyCustomPolicyResponse> createAgencyCustomPolicyAsync(CreateAgencyCustomPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.createAgencyCustomPolicy);
    }

    public CompletableFuture<CreateCloudServiceCustomPolicyResponse> createCloudServiceCustomPolicyAsync(CreateCloudServiceCustomPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.createCloudServiceCustomPolicy);
    }

    public CompletableFuture<DeleteAgencyResponse> deleteAgencyAsync(DeleteAgencyRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.deleteAgency);
    }

    public CompletableFuture<DeleteCustomPolicyResponse> deleteCustomPolicyAsync(DeleteCustomPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.deleteCustomPolicy);
    }

    public CompletableFuture<KeystoneAddUserToGroupResponse> keystoneAddUserToGroupAsync(KeystoneAddUserToGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.keystoneAddUserToGroup);
    }

    public CompletableFuture<KeystoneAssociateGroupWithAllProjectPermissionResponse> keystoneAssociateGroupWithAllProjectPermissionAsync(KeystoneAssociateGroupWithAllProjectPermissionRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.keystoneAssociateGroupWithAllProjectPermission);
    }

    public CompletableFuture<KeystoneAssociateGroupWithDomainPermissionResponse> keystoneAssociateGroupWithDomainPermissionAsync(KeystoneAssociateGroupWithDomainPermissionRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.keystoneAssociateGroupWithDomainPermission);
    }

    public CompletableFuture<KeystoneAssociateGroupWithProjectPermissionResponse> keystoneAssociateGroupWithProjectPermissionAsync(KeystoneAssociateGroupWithProjectPermissionRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.keystoneAssociateGroupWithProjectPermission);
    }

    public CompletableFuture<KeystoneCheckDomainPermissionForGroupResponse> keystoneCheckDomainPermissionForGroupAsync(KeystoneCheckDomainPermissionForGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.keystoneCheckDomainPermissionForGroup);
    }

    public CompletableFuture<KeystoneCheckProjectPermissionForGroupResponse> keystoneCheckProjectPermissionForGroupAsync(KeystoneCheckProjectPermissionForGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.keystoneCheckProjectPermissionForGroup);
    }

    public CompletableFuture<KeystoneCheckUserInGroupResponse> keystoneCheckUserInGroupAsync(KeystoneCheckUserInGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.keystoneCheckUserInGroup);
    }

    public CompletableFuture<KeystoneCreateGroupResponse> keystoneCreateGroupAsync(KeystoneCreateGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.keystoneCreateGroup);
    }

    public CompletableFuture<KeystoneCreateProjectResponse> keystoneCreateProjectAsync(KeystoneCreateProjectRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.keystoneCreateProject);
    }

    public CompletableFuture<KeystoneDeleteGroupResponse> keystoneDeleteGroupAsync(KeystoneDeleteGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.keystoneDeleteGroup);
    }

    public CompletableFuture<KeystoneListAuthDomainsResponse> keystoneListAuthDomainsAsync(KeystoneListAuthDomainsRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.keystoneListAuthDomains);
    }

    public CompletableFuture<KeystoneListAuthProjectsResponse> keystoneListAuthProjectsAsync(KeystoneListAuthProjectsRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.keystoneListAuthProjects);
    }

    public CompletableFuture<KeystoneListDomainPermissionsForGroupResponse> keystoneListDomainPermissionsForGroupAsync(KeystoneListDomainPermissionsForGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.keystoneListDomainPermissionsForGroup);
    }

    public CompletableFuture<KeystoneListEndpointsResponse> keystoneListEndpointsAsync(KeystoneListEndpointsRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.keystoneListEndpoints);
    }

    public CompletableFuture<KeystoneListGroupsResponse> keystoneListGroupsAsync(KeystoneListGroupsRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.keystoneListGroups);
    }

    public CompletableFuture<KeystoneListPermissionsResponse> keystoneListPermissionsAsync(KeystoneListPermissionsRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.keystoneListPermissions);
    }

    public CompletableFuture<KeystoneListProjectPermissionsForGroupResponse> keystoneListProjectPermissionsForGroupAsync(KeystoneListProjectPermissionsForGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.keystoneListProjectPermissionsForGroup);
    }

    public CompletableFuture<KeystoneListProjectsResponse> keystoneListProjectsAsync(KeystoneListProjectsRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.keystoneListProjects);
    }

    public CompletableFuture<KeystoneListProjectsForUserResponse> keystoneListProjectsForUserAsync(KeystoneListProjectsForUserRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.keystoneListProjectsForUser);
    }

    public CompletableFuture<KeystoneListRegionsResponse> keystoneListRegionsAsync(KeystoneListRegionsRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.keystoneListRegions);
    }

    public CompletableFuture<KeystoneListServicesResponse> keystoneListServicesAsync(KeystoneListServicesRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.keystoneListServices);
    }

    public CompletableFuture<KeystoneListUsersForGroupByAdminResponse> keystoneListUsersForGroupByAdminAsync(KeystoneListUsersForGroupByAdminRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.keystoneListUsersForGroupByAdmin);
    }

    public CompletableFuture<KeystoneListVersionsResponse> keystoneListVersionsAsync(KeystoneListVersionsRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.keystoneListVersions);
    }

    public CompletableFuture<KeystoneRemoveDomainPermissionFromGroupResponse> keystoneRemoveDomainPermissionFromGroupAsync(KeystoneRemoveDomainPermissionFromGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.keystoneRemoveDomainPermissionFromGroup);
    }

    public CompletableFuture<KeystoneRemoveProjectPermissionFromGroupResponse> keystoneRemoveProjectPermissionFromGroupAsync(KeystoneRemoveProjectPermissionFromGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.keystoneRemoveProjectPermissionFromGroup);
    }

    public CompletableFuture<KeystoneRemoveUserFromGroupResponse> keystoneRemoveUserFromGroupAsync(KeystoneRemoveUserFromGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.keystoneRemoveUserFromGroup);
    }

    public CompletableFuture<KeystoneShowCatalogResponse> keystoneShowCatalogAsync(KeystoneShowCatalogRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.keystoneShowCatalog);
    }

    public CompletableFuture<KeystoneShowEndpointResponse> keystoneShowEndpointAsync(KeystoneShowEndpointRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.keystoneShowEndpoint);
    }

    public CompletableFuture<KeystoneShowGroupResponse> keystoneShowGroupAsync(KeystoneShowGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.keystoneShowGroup);
    }

    public CompletableFuture<KeystoneShowPermissionResponse> keystoneShowPermissionAsync(KeystoneShowPermissionRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.keystoneShowPermission);
    }

    public CompletableFuture<KeystoneShowProjectResponse> keystoneShowProjectAsync(KeystoneShowProjectRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.keystoneShowProject);
    }

    public CompletableFuture<KeystoneShowRegionResponse> keystoneShowRegionAsync(KeystoneShowRegionRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.keystoneShowRegion);
    }

    public CompletableFuture<KeystoneShowSecurityComplianceResponse> keystoneShowSecurityComplianceAsync(KeystoneShowSecurityComplianceRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.keystoneShowSecurityCompliance);
    }

    public CompletableFuture<KeystoneShowSecurityComplianceByOptionResponse> keystoneShowSecurityComplianceByOptionAsync(KeystoneShowSecurityComplianceByOptionRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.keystoneShowSecurityComplianceByOption);
    }

    public CompletableFuture<KeystoneShowServiceResponse> keystoneShowServiceAsync(KeystoneShowServiceRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.keystoneShowService);
    }

    public CompletableFuture<KeystoneShowVersionResponse> keystoneShowVersionAsync(KeystoneShowVersionRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.keystoneShowVersion);
    }

    public CompletableFuture<KeystoneUpdateGroupResponse> keystoneUpdateGroupAsync(KeystoneUpdateGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.keystoneUpdateGroup);
    }

    public CompletableFuture<KeystoneUpdateProjectResponse> keystoneUpdateProjectAsync(KeystoneUpdateProjectRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.keystoneUpdateProject);
    }

    public CompletableFuture<ListAgenciesResponse> listAgenciesAsync(ListAgenciesRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.listAgencies);
    }

    public CompletableFuture<ListCustomPoliciesResponse> listCustomPoliciesAsync(ListCustomPoliciesRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.listCustomPolicies);
    }

    public CompletableFuture<ListDomainPermissionsForAgencyResponse> listDomainPermissionsForAgencyAsync(ListDomainPermissionsForAgencyRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.listDomainPermissionsForAgency);
    }

    public CompletableFuture<ListProjectPermissionsForAgencyResponse> listProjectPermissionsForAgencyAsync(ListProjectPermissionsForAgencyRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.listProjectPermissionsForAgency);
    }

    public CompletableFuture<RemoveDomainPermissionFromAgencyResponse> removeDomainPermissionFromAgencyAsync(RemoveDomainPermissionFromAgencyRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.removeDomainPermissionFromAgency);
    }

    public CompletableFuture<RemoveProjectPermissionFromAgencyResponse> removeProjectPermissionFromAgencyAsync(RemoveProjectPermissionFromAgencyRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.removeProjectPermissionFromAgency);
    }

    public CompletableFuture<ShowAgencyResponse> showAgencyAsync(ShowAgencyRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.showAgency);
    }

    public CompletableFuture<ShowCustomPolicyResponse> showCustomPolicyAsync(ShowCustomPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.showCustomPolicy);
    }

    public CompletableFuture<ShowProjectDetailsAndStatusResponse> showProjectDetailsAndStatusAsync(ShowProjectDetailsAndStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.showProjectDetailsAndStatus);
    }

    public CompletableFuture<UpdateAgencyResponse> updateAgencyAsync(UpdateAgencyRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.updateAgency);
    }

    public CompletableFuture<UpdateAgencyCustomPolicyResponse> updateAgencyCustomPolicyAsync(UpdateAgencyCustomPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.updateAgencyCustomPolicy);
    }

    public CompletableFuture<UpdateCloudServiceCustomPolicyResponse> updateCloudServiceCustomPolicyAsync(UpdateCloudServiceCustomPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.updateCloudServiceCustomPolicy);
    }

    public CompletableFuture<UpdateProjectStatusResponse> updateProjectStatusAsync(UpdateProjectStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.updateProjectStatus);
    }

    public CompletableFuture<CreatePermanentAccessKeyResponse> createPermanentAccessKeyAsync(CreatePermanentAccessKeyRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.createPermanentAccessKey);
    }

    public CompletableFuture<CreateTemporaryAccessKeyByAgencyResponse> createTemporaryAccessKeyByAgencyAsync(CreateTemporaryAccessKeyByAgencyRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.createTemporaryAccessKeyByAgency);
    }

    public CompletableFuture<CreateTemporaryAccessKeyByTokenResponse> createTemporaryAccessKeyByTokenAsync(CreateTemporaryAccessKeyByTokenRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.createTemporaryAccessKeyByToken);
    }

    public CompletableFuture<DeletePermanentAccessKeyResponse> deletePermanentAccessKeyAsync(DeletePermanentAccessKeyRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.deletePermanentAccessKey);
    }

    public CompletableFuture<ListPermanentAccessKeysResponse> listPermanentAccessKeysAsync(ListPermanentAccessKeysRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.listPermanentAccessKeys);
    }

    public CompletableFuture<ShowPermanentAccessKeyResponse> showPermanentAccessKeyAsync(ShowPermanentAccessKeyRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.showPermanentAccessKey);
    }

    public CompletableFuture<UpdatePermanentAccessKeyResponse> updatePermanentAccessKeyAsync(UpdatePermanentAccessKeyRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.updatePermanentAccessKey);
    }

    public CompletableFuture<CreateUserResponse> createUserAsync(CreateUserRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.createUser);
    }

    public CompletableFuture<KeystoneCreateUserResponse> keystoneCreateUserAsync(KeystoneCreateUserRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.keystoneCreateUser);
    }

    public CompletableFuture<KeystoneDeleteUserResponse> keystoneDeleteUserAsync(KeystoneDeleteUserRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.keystoneDeleteUser);
    }

    public CompletableFuture<KeystoneListGroupsForUserResponse> keystoneListGroupsForUserAsync(KeystoneListGroupsForUserRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.keystoneListGroupsForUser);
    }

    public CompletableFuture<KeystoneListUsersResponse> keystoneListUsersAsync(KeystoneListUsersRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.keystoneListUsers);
    }

    public CompletableFuture<KeystoneShowUserResponse> keystoneShowUserAsync(KeystoneShowUserRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.keystoneShowUser);
    }

    public CompletableFuture<KeystoneUpdateUserByAdminResponse> keystoneUpdateUserByAdminAsync(KeystoneUpdateUserByAdminRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.keystoneUpdateUserByAdmin);
    }

    public CompletableFuture<KeystoneUpdateUserPasswordResponse> keystoneUpdateUserPasswordAsync(KeystoneUpdateUserPasswordRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.keystoneUpdateUserPassword);
    }

    public CompletableFuture<ShowUserResponse> showUserAsync(ShowUserRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.showUser);
    }

    public CompletableFuture<UpdateUserResponse> updateUserAsync(UpdateUserRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.updateUser);
    }

    public CompletableFuture<UpdateUserInformationResponse> updateUserInformationAsync(UpdateUserInformationRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.updateUserInformation);
    }

}