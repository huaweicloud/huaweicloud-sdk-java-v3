package com.huaweicloud.sdk.iam.v3;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import java.util.function.Function;

import com.huaweicloud.sdk.iam.v3.model.*;

public class IamClient {
    protected HcClient hcClient;

    public IamClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<IamClient> newBuilder() {
        return new ClientBuilder<>(IamClient::new);
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

    public DeleteAgencyResponse deleteAgency(DeleteAgencyRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.deleteAgency);
    }

    public KeystoneAddUserToGroupResponse keystoneAddUserToGroup(KeystoneAddUserToGroupRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneAddUserToGroup);
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

    public KeystoneCreateUserResponse keystoneCreateUser(KeystoneCreateUserRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneCreateUser);
    }

    public KeystoneDeleteGroupResponse keystoneDeleteGroup(KeystoneDeleteGroupRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneDeleteGroup);
    }

    public KeystoneDeleteUserResponse keystoneDeleteUser(KeystoneDeleteUserRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneDeleteUser);
    }

    public KeystoneListDomainPermissionsForGroupResponse keystoneListDomainPermissionsForGroup(KeystoneListDomainPermissionsForGroupRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneListDomainPermissionsForGroup);
    }

    public KeystoneListGroupsResponse keystoneListGroups(KeystoneListGroupsRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneListGroups);
    }

    public KeystoneListGroupsForUserResponse keystoneListGroupsForUser(KeystoneListGroupsForUserRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneListGroupsForUser);
    }

    public KeystoneListPermissionsResponse keystoneListPermissions(KeystoneListPermissionsRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneListPermissions);
    }

    public KeystoneListProjectPermissionsForGroupResponse keystoneListProjectPermissionsForGroup(KeystoneListProjectPermissionsForGroupRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneListProjectPermissionsForGroup);
    }

    public KeystoneListUsersResponse keystoneListUsers(KeystoneListUsersRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneListUsers);
    }

    public KeystoneListUsersForGroupByAdminResponse keystoneListUsersForGroupByAdmin(KeystoneListUsersForGroupByAdminRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneListUsersForGroupByAdmin);
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

    public KeystoneShowGroupResponse keystoneShowGroup(KeystoneShowGroupRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneShowGroup);
    }

    public KeystoneShowPermissionResponse keystoneShowPermission(KeystoneShowPermissionRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneShowPermission);
    }

    public KeystoneShowUserResponse keystoneShowUser(KeystoneShowUserRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneShowUser);
    }

    public KeystoneUpdateGroupResponse keystoneUpdateGroup(KeystoneUpdateGroupRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneUpdateGroup);
    }

    public KeystoneUpdateUserByAdminResponse keystoneUpdateUserByAdmin(KeystoneUpdateUserByAdminRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneUpdateUserByAdmin);
    }

    public KeystoneUpdateUserPasswordResponse keystoneUpdateUserPassword(KeystoneUpdateUserPasswordRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.keystoneUpdateUserPassword);
    }

    public ListAgenciesResponse listAgencies(ListAgenciesRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.listAgencies);
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

    public UpdateAgencyResponse updateAgency(UpdateAgencyRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.updateAgency);
    }

    public CreateTemporaryAccessKeyByAgencyResponse createTemporaryAccessKeyByAgency(CreateTemporaryAccessKeyByAgencyRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.createTemporaryAccessKeyByAgency);
    }

    public CreateTemporaryAccessKeyByTokenResponse createTemporaryAccessKeyByToken(CreateTemporaryAccessKeyByTokenRequest request) {
        return hcClient.syncInvokeHttp(request, IamMeta.createTemporaryAccessKeyByToken);
    }

}