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

    public CompletableFuture<DeleteAgencyResponse> deleteAgencyAsync(DeleteAgencyRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.deleteAgency);
    }

    public CompletableFuture<KeystoneAddUserToGroupResponse> keystoneAddUserToGroupAsync(KeystoneAddUserToGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.keystoneAddUserToGroup);
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

    public CompletableFuture<KeystoneCreateUserResponse> keystoneCreateUserAsync(KeystoneCreateUserRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.keystoneCreateUser);
    }

    public CompletableFuture<KeystoneDeleteGroupResponse> keystoneDeleteGroupAsync(KeystoneDeleteGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.keystoneDeleteGroup);
    }

    public CompletableFuture<KeystoneDeleteUserResponse> keystoneDeleteUserAsync(KeystoneDeleteUserRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.keystoneDeleteUser);
    }

    public CompletableFuture<KeystoneListDomainPermissionsForGroupResponse> keystoneListDomainPermissionsForGroupAsync(KeystoneListDomainPermissionsForGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.keystoneListDomainPermissionsForGroup);
    }

    public CompletableFuture<KeystoneListGroupsResponse> keystoneListGroupsAsync(KeystoneListGroupsRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.keystoneListGroups);
    }

    public CompletableFuture<KeystoneListGroupsForUserResponse> keystoneListGroupsForUserAsync(KeystoneListGroupsForUserRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.keystoneListGroupsForUser);
    }

    public CompletableFuture<KeystoneListPermissionsResponse> keystoneListPermissionsAsync(KeystoneListPermissionsRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.keystoneListPermissions);
    }

    public CompletableFuture<KeystoneListProjectPermissionsForGroupResponse> keystoneListProjectPermissionsForGroupAsync(KeystoneListProjectPermissionsForGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.keystoneListProjectPermissionsForGroup);
    }

    public CompletableFuture<KeystoneListUsersResponse> keystoneListUsersAsync(KeystoneListUsersRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.keystoneListUsers);
    }

    public CompletableFuture<KeystoneListUsersForGroupByAdminResponse> keystoneListUsersForGroupByAdminAsync(KeystoneListUsersForGroupByAdminRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.keystoneListUsersForGroupByAdmin);
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

    public CompletableFuture<KeystoneShowGroupResponse> keystoneShowGroupAsync(KeystoneShowGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.keystoneShowGroup);
    }

    public CompletableFuture<KeystoneShowPermissionResponse> keystoneShowPermissionAsync(KeystoneShowPermissionRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.keystoneShowPermission);
    }

    public CompletableFuture<KeystoneShowUserResponse> keystoneShowUserAsync(KeystoneShowUserRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.keystoneShowUser);
    }

    public CompletableFuture<KeystoneUpdateGroupResponse> keystoneUpdateGroupAsync(KeystoneUpdateGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.keystoneUpdateGroup);
    }

    public CompletableFuture<KeystoneUpdateUserByAdminResponse> keystoneUpdateUserByAdminAsync(KeystoneUpdateUserByAdminRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.keystoneUpdateUserByAdmin);
    }

    public CompletableFuture<KeystoneUpdateUserPasswordResponse> keystoneUpdateUserPasswordAsync(KeystoneUpdateUserPasswordRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.keystoneUpdateUserPassword);
    }

    public CompletableFuture<ListAgenciesResponse> listAgenciesAsync(ListAgenciesRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.listAgencies);
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

    public CompletableFuture<UpdateAgencyResponse> updateAgencyAsync(UpdateAgencyRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.updateAgency);
    }

    public CompletableFuture<CreateTemporaryAccessKeyByAgencyResponse> createTemporaryAccessKeyByAgencyAsync(CreateTemporaryAccessKeyByAgencyRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.createTemporaryAccessKeyByAgency);
    }

    public CompletableFuture<CreateTemporaryAccessKeyByTokenResponse> createTemporaryAccessKeyByTokenAsync(CreateTemporaryAccessKeyByTokenRequest request) {
        return hcClient.asyncInvokeHttp(request, IamMeta.createTemporaryAccessKeyByToken);
    }

}