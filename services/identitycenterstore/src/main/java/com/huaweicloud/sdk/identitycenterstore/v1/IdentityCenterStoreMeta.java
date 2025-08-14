package com.huaweicloud.sdk.identitycenterstore.v1;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.identitycenterstore.v1.model.BatchDeleteSessionsReqBody;
import com.huaweicloud.sdk.identitycenterstore.v1.model.BatchDeleteSessionsRequest;
import com.huaweicloud.sdk.identitycenterstore.v1.model.BatchDeleteSessionsResponse;
import com.huaweicloud.sdk.identitycenterstore.v1.model.BatchListMfaDevicesForUserReqBody;
import com.huaweicloud.sdk.identitycenterstore.v1.model.BatchListMfaDevicesForUserRequest;
import com.huaweicloud.sdk.identitycenterstore.v1.model.BatchListMfaDevicesForUserResponse;
import com.huaweicloud.sdk.identitycenterstore.v1.model.CreateBearerTokenRequest;
import com.huaweicloud.sdk.identitycenterstore.v1.model.CreateBearerTokenResponse;
import com.huaweicloud.sdk.identitycenterstore.v1.model.CreateExternalIdPConfigurationForDirectoryRequest;
import com.huaweicloud.sdk.identitycenterstore.v1.model.CreateExternalIdPConfigurationForDirectoryResponse;
import com.huaweicloud.sdk.identitycenterstore.v1.model.CreateGroupMembershipReqBody;
import com.huaweicloud.sdk.identitycenterstore.v1.model.CreateGroupMembershipRequest;
import com.huaweicloud.sdk.identitycenterstore.v1.model.CreateGroupMembershipResponse;
import com.huaweicloud.sdk.identitycenterstore.v1.model.CreateGroupReqBody;
import com.huaweicloud.sdk.identitycenterstore.v1.model.CreateGroupRequest;
import com.huaweicloud.sdk.identitycenterstore.v1.model.CreateGroupResponse;
import com.huaweicloud.sdk.identitycenterstore.v1.model.CreateIDPReqBody;
import com.huaweicloud.sdk.identitycenterstore.v1.model.CreateProvisioningTenantRequest;
import com.huaweicloud.sdk.identitycenterstore.v1.model.CreateProvisioningTenantResponse;
import com.huaweicloud.sdk.identitycenterstore.v1.model.CreateSpCertificateRequest;
import com.huaweicloud.sdk.identitycenterstore.v1.model.CreateSpCertificateResponse;
import com.huaweicloud.sdk.identitycenterstore.v1.model.CreateUserReqBody;
import com.huaweicloud.sdk.identitycenterstore.v1.model.CreateUserRequest;
import com.huaweicloud.sdk.identitycenterstore.v1.model.CreateUserResponse;
import com.huaweicloud.sdk.identitycenterstore.v1.model.DeleteBearerTokenRequest;
import com.huaweicloud.sdk.identitycenterstore.v1.model.DeleteBearerTokenResponse;
import com.huaweicloud.sdk.identitycenterstore.v1.model.DeleteExternalIdPCertificateRequest;
import com.huaweicloud.sdk.identitycenterstore.v1.model.DeleteExternalIdPCertificateResponse;
import com.huaweicloud.sdk.identitycenterstore.v1.model.DeleteExternalIdPConfigurationForDirectoryRequest;
import com.huaweicloud.sdk.identitycenterstore.v1.model.DeleteExternalIdPConfigurationForDirectoryResponse;
import com.huaweicloud.sdk.identitycenterstore.v1.model.DeleteGroupMembershipRequest;
import com.huaweicloud.sdk.identitycenterstore.v1.model.DeleteGroupMembershipResponse;
import com.huaweicloud.sdk.identitycenterstore.v1.model.DeleteGroupRequest;
import com.huaweicloud.sdk.identitycenterstore.v1.model.DeleteGroupResponse;
import com.huaweicloud.sdk.identitycenterstore.v1.model.DeleteMfaDeviceForUserRequest;
import com.huaweicloud.sdk.identitycenterstore.v1.model.DeleteMfaDeviceForUserResponse;
import com.huaweicloud.sdk.identitycenterstore.v1.model.DeleteProvisioningTenantRequest;
import com.huaweicloud.sdk.identitycenterstore.v1.model.DeleteProvisioningTenantResponse;
import com.huaweicloud.sdk.identitycenterstore.v1.model.DeleteSpCertificateRequest;
import com.huaweicloud.sdk.identitycenterstore.v1.model.DeleteSpCertificateResponse;
import com.huaweicloud.sdk.identitycenterstore.v1.model.DeleteUserRequest;
import com.huaweicloud.sdk.identitycenterstore.v1.model.DeleteUserResponse;
import com.huaweicloud.sdk.identitycenterstore.v1.model.DescribeGroupMembershipRequest;
import com.huaweicloud.sdk.identitycenterstore.v1.model.DescribeGroupMembershipResponse;
import com.huaweicloud.sdk.identitycenterstore.v1.model.DescribeGroupRequest;
import com.huaweicloud.sdk.identitycenterstore.v1.model.DescribeGroupResponse;
import com.huaweicloud.sdk.identitycenterstore.v1.model.DescribeGroupsRequest;
import com.huaweicloud.sdk.identitycenterstore.v1.model.DescribeGroupsRequestBody;
import com.huaweicloud.sdk.identitycenterstore.v1.model.DescribeGroupsResponse;
import com.huaweicloud.sdk.identitycenterstore.v1.model.DescribePasswordPolicyRequest;
import com.huaweicloud.sdk.identitycenterstore.v1.model.DescribePasswordPolicyResponse;
import com.huaweicloud.sdk.identitycenterstore.v1.model.DescribeUserRequest;
import com.huaweicloud.sdk.identitycenterstore.v1.model.DescribeUserResponse;
import com.huaweicloud.sdk.identitycenterstore.v1.model.DescribeUsersRequest;
import com.huaweicloud.sdk.identitycenterstore.v1.model.DescribeUsersRequestBody;
import com.huaweicloud.sdk.identitycenterstore.v1.model.DescribeUsersResponse;
import com.huaweicloud.sdk.identitycenterstore.v1.model.DisableExternalIdPConfigurationForDirectoryRequest;
import com.huaweicloud.sdk.identitycenterstore.v1.model.DisableExternalIdPConfigurationForDirectoryResponse;
import com.huaweicloud.sdk.identitycenterstore.v1.model.DisableUserRequest;
import com.huaweicloud.sdk.identitycenterstore.v1.model.DisableUserResponse;
import com.huaweicloud.sdk.identitycenterstore.v1.model.EnableExternalIdPConfigurationForDirectoryRequest;
import com.huaweicloud.sdk.identitycenterstore.v1.model.EnableExternalIdPConfigurationForDirectoryResponse;
import com.huaweicloud.sdk.identitycenterstore.v1.model.EnableUserRequest;
import com.huaweicloud.sdk.identitycenterstore.v1.model.EnableUserResponse;
import com.huaweicloud.sdk.identitycenterstore.v1.model.GetGroupIdReqBody;
import com.huaweicloud.sdk.identitycenterstore.v1.model.GetGroupIdRequest;
import com.huaweicloud.sdk.identitycenterstore.v1.model.GetGroupIdResponse;
import com.huaweicloud.sdk.identitycenterstore.v1.model.GetGroupMembershipIdReqBody;
import com.huaweicloud.sdk.identitycenterstore.v1.model.GetGroupMembershipIdRequest;
import com.huaweicloud.sdk.identitycenterstore.v1.model.GetGroupMembershipIdResponse;
import com.huaweicloud.sdk.identitycenterstore.v1.model.GetIdentityStoreSummaryRequest;
import com.huaweicloud.sdk.identitycenterstore.v1.model.GetIdentityStoreSummaryResponse;
import com.huaweicloud.sdk.identitycenterstore.v1.model.GetSpConfigurationForDirectoryRequest;
import com.huaweicloud.sdk.identitycenterstore.v1.model.GetSpConfigurationForDirectoryResponse;
import com.huaweicloud.sdk.identitycenterstore.v1.model.GetUserIdReqBody;
import com.huaweicloud.sdk.identitycenterstore.v1.model.GetUserIdRequest;
import com.huaweicloud.sdk.identitycenterstore.v1.model.GetUserIdResponse;
import com.huaweicloud.sdk.identitycenterstore.v1.model.ImportExternalIdPCertificateReqBody;
import com.huaweicloud.sdk.identitycenterstore.v1.model.ImportExternalIdPCertificateRequest;
import com.huaweicloud.sdk.identitycenterstore.v1.model.ImportExternalIdPCertificateResponse;
import com.huaweicloud.sdk.identitycenterstore.v1.model.IsMemberInGroupsReqBody;
import com.huaweicloud.sdk.identitycenterstore.v1.model.IsMemberInGroupsRequest;
import com.huaweicloud.sdk.identitycenterstore.v1.model.IsMemberInGroupsResponse;
import com.huaweicloud.sdk.identitycenterstore.v1.model.ListBearerTokensRequest;
import com.huaweicloud.sdk.identitycenterstore.v1.model.ListBearerTokensResponse;
import com.huaweicloud.sdk.identitycenterstore.v1.model.ListExternalIdPCertificatesRequest;
import com.huaweicloud.sdk.identitycenterstore.v1.model.ListExternalIdPCertificatesResponse;
import com.huaweicloud.sdk.identitycenterstore.v1.model.ListExternalIdPConfigurationsForDirectoryRequest;
import com.huaweicloud.sdk.identitycenterstore.v1.model.ListExternalIdPConfigurationsForDirectoryResponse;
import com.huaweicloud.sdk.identitycenterstore.v1.model.ListGroupMembershipsForMemberRequest;
import com.huaweicloud.sdk.identitycenterstore.v1.model.ListGroupMembershipsForMemberResponse;
import com.huaweicloud.sdk.identitycenterstore.v1.model.ListGroupMembershipsRequest;
import com.huaweicloud.sdk.identitycenterstore.v1.model.ListGroupMembershipsResponse;
import com.huaweicloud.sdk.identitycenterstore.v1.model.ListGroupsRequest;
import com.huaweicloud.sdk.identitycenterstore.v1.model.ListGroupsResponse;
import com.huaweicloud.sdk.identitycenterstore.v1.model.ListProvisioningTenantsRequest;
import com.huaweicloud.sdk.identitycenterstore.v1.model.ListProvisioningTenantsResponse;
import com.huaweicloud.sdk.identitycenterstore.v1.model.ListSessionsRequest;
import com.huaweicloud.sdk.identitycenterstore.v1.model.ListSessionsResponse;
import com.huaweicloud.sdk.identitycenterstore.v1.model.ListSpCertificatesRequest;
import com.huaweicloud.sdk.identitycenterstore.v1.model.ListSpCertificatesResponse;
import com.huaweicloud.sdk.identitycenterstore.v1.model.ListUsersRequest;
import com.huaweicloud.sdk.identitycenterstore.v1.model.ListUsersResponse;
import com.huaweicloud.sdk.identitycenterstore.v1.model.RegisterMfaDeviceForUserRequest;
import com.huaweicloud.sdk.identitycenterstore.v1.model.RegisterMfaDeviceForUserResponse;
import com.huaweicloud.sdk.identitycenterstore.v1.model.ResetPwdModeRequest;
import com.huaweicloud.sdk.identitycenterstore.v1.model.ResetPwdModeResponse;
import com.huaweicloud.sdk.identitycenterstore.v1.model.SpCertificateDto;
import com.huaweicloud.sdk.identitycenterstore.v1.model.UpdateExternalIdPConfigurationForDirectoryReqBody;
import com.huaweicloud.sdk.identitycenterstore.v1.model.UpdateExternalIdPConfigurationForDirectoryRequest;
import com.huaweicloud.sdk.identitycenterstore.v1.model.UpdateExternalIdPConfigurationForDirectoryResponse;
import com.huaweicloud.sdk.identitycenterstore.v1.model.UpdateGroupReqBody;
import com.huaweicloud.sdk.identitycenterstore.v1.model.UpdateGroupRequest;
import com.huaweicloud.sdk.identitycenterstore.v1.model.UpdateGroupResponse;
import com.huaweicloud.sdk.identitycenterstore.v1.model.UpdateMfaDeviceForUserReqBody;
import com.huaweicloud.sdk.identitycenterstore.v1.model.UpdateMfaDeviceForUserRequest;
import com.huaweicloud.sdk.identitycenterstore.v1.model.UpdateMfaDeviceForUserResponse;
import com.huaweicloud.sdk.identitycenterstore.v1.model.UpdatePasswordPolicyReqBody;
import com.huaweicloud.sdk.identitycenterstore.v1.model.UpdatePasswordPolicyRequest;
import com.huaweicloud.sdk.identitycenterstore.v1.model.UpdatePasswordPolicyResponse;
import com.huaweicloud.sdk.identitycenterstore.v1.model.UpdatePwdModeReqBody;
import com.huaweicloud.sdk.identitycenterstore.v1.model.UpdateSpActiveCertificateRequest;
import com.huaweicloud.sdk.identitycenterstore.v1.model.UpdateSpActiveCertificateResponse;
import com.huaweicloud.sdk.identitycenterstore.v1.model.UpdateUserReqBody;
import com.huaweicloud.sdk.identitycenterstore.v1.model.UpdateUserRequest;
import com.huaweicloud.sdk.identitycenterstore.v1.model.UpdateUserResponse;
import com.huaweicloud.sdk.identitycenterstore.v1.model.VerifyEmailRequest;
import com.huaweicloud.sdk.identitycenterstore.v1.model.VerifyEmailResponse;

import java.util.List;

@SuppressWarnings("unchecked")
public class IdentityCenterStoreMeta {

    public static final HttpRequestDef<CreateGroupRequest, CreateGroupResponse> createGroup = genForCreateGroup();

    private static HttpRequestDef<CreateGroupRequest, CreateGroupResponse> genForCreateGroup() {
        // basic
        HttpRequestDef.Builder<CreateGroupRequest, CreateGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateGroupRequest.class, CreateGroupResponse.class)
                .withName("CreateGroup")
                .withUri("/v1/identity-stores/{identity_store_id}/groups")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identity_store_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateGroupRequest::getIdentityStoreId, CreateGroupRequest::setIdentityStoreId));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateGroupRequest::getXSecurityToken, CreateGroupRequest::setXSecurityToken));
        builder.<CreateGroupReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateGroupReqBody.class),
            f -> f.withMarshaller(CreateGroupRequest::getBody, CreateGroupRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteGroupRequest, DeleteGroupResponse> deleteGroup = genForDeleteGroup();

    private static HttpRequestDef<DeleteGroupRequest, DeleteGroupResponse> genForDeleteGroup() {
        // basic
        HttpRequestDef.Builder<DeleteGroupRequest, DeleteGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteGroupRequest.class, DeleteGroupResponse.class)
                .withName("DeleteGroup")
                .withUri("/v1/identity-stores/{identity_store_id}/groups/{group_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identity_store_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteGroupRequest::getIdentityStoreId, DeleteGroupRequest::setIdentityStoreId));
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteGroupRequest::getGroupId, DeleteGroupRequest::setGroupId));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteGroupRequest::getXSecurityToken, DeleteGroupRequest::setXSecurityToken));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DescribeGroupRequest, DescribeGroupResponse> describeGroup =
        genForDescribeGroup();

    private static HttpRequestDef<DescribeGroupRequest, DescribeGroupResponse> genForDescribeGroup() {
        // basic
        HttpRequestDef.Builder<DescribeGroupRequest, DescribeGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, DescribeGroupRequest.class, DescribeGroupResponse.class)
                .withName("DescribeGroup")
                .withUri("/v1/identity-stores/{identity_store_id}/groups/{group_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identity_store_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DescribeGroupRequest::getIdentityStoreId, DescribeGroupRequest::setIdentityStoreId));
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DescribeGroupRequest::getGroupId, DescribeGroupRequest::setGroupId));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DescribeGroupRequest::getXSecurityToken, DescribeGroupRequest::setXSecurityToken));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DescribeGroupsRequest, DescribeGroupsResponse> describeGroups =
        genForDescribeGroups();

    private static HttpRequestDef<DescribeGroupsRequest, DescribeGroupsResponse> genForDescribeGroups() {
        // basic
        HttpRequestDef.Builder<DescribeGroupsRequest, DescribeGroupsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, DescribeGroupsRequest.class, DescribeGroupsResponse.class)
                .withName("DescribeGroups")
                .withUri("/v1/identity-stores/{identity_store_id}/groups/batch-query")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identity_store_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DescribeGroupsRequest::getIdentityStoreId,
                DescribeGroupsRequest::setIdentityStoreId));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DescribeGroupsRequest::getXSecurityToken, DescribeGroupsRequest::setXSecurityToken));
        builder.<DescribeGroupsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DescribeGroupsRequestBody.class),
            f -> f.withMarshaller(DescribeGroupsRequest::getBody, DescribeGroupsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<GetGroupIdRequest, GetGroupIdResponse> getGroupId = genForGetGroupId();

    private static HttpRequestDef<GetGroupIdRequest, GetGroupIdResponse> genForGetGroupId() {
        // basic
        HttpRequestDef.Builder<GetGroupIdRequest, GetGroupIdResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, GetGroupIdRequest.class, GetGroupIdResponse.class)
                .withName("GetGroupId")
                .withUri("/v1/identity-stores/{identity_store_id}/groups/retrieve-group-id")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identity_store_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetGroupIdRequest::getIdentityStoreId, GetGroupIdRequest::setIdentityStoreId));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetGroupIdRequest::getXSecurityToken, GetGroupIdRequest::setXSecurityToken));
        builder.<GetGroupIdReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(GetGroupIdReqBody.class),
            f -> f.withMarshaller(GetGroupIdRequest::getBody, GetGroupIdRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListGroupsRequest, ListGroupsResponse> listGroups = genForListGroups();

    private static HttpRequestDef<ListGroupsRequest, ListGroupsResponse> genForListGroups() {
        // basic
        HttpRequestDef.Builder<ListGroupsRequest, ListGroupsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListGroupsRequest.class, ListGroupsResponse.class)
                .withName("ListGroups")
                .withUri("/v1/identity-stores/{identity_store_id}/groups")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identity_store_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGroupsRequest::getIdentityStoreId, ListGroupsRequest::setIdentityStoreId));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGroupsRequest::getMarker, ListGroupsRequest::setMarker));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListGroupsRequest::getLimit, ListGroupsRequest::setLimit));
        builder.<String>withRequestField("display_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGroupsRequest::getDisplayName, ListGroupsRequest::setDisplayName));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGroupsRequest::getXSecurityToken, ListGroupsRequest::setXSecurityToken));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateGroupRequest, UpdateGroupResponse> updateGroup = genForUpdateGroup();

    private static HttpRequestDef<UpdateGroupRequest, UpdateGroupResponse> genForUpdateGroup() {
        // basic
        HttpRequestDef.Builder<UpdateGroupRequest, UpdateGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateGroupRequest.class, UpdateGroupResponse.class)
                .withName("UpdateGroup")
                .withUri("/v1/identity-stores/{identity_store_id}/groups/{group_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identity_store_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateGroupRequest::getIdentityStoreId, UpdateGroupRequest::setIdentityStoreId));
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateGroupRequest::getGroupId, UpdateGroupRequest::setGroupId));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateGroupRequest::getXSecurityToken, UpdateGroupRequest::setXSecurityToken));
        builder.<UpdateGroupReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateGroupReqBody.class),
            f -> f.withMarshaller(UpdateGroupRequest::getBody, UpdateGroupRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateGroupMembershipRequest, CreateGroupMembershipResponse> createGroupMembership =
        genForCreateGroupMembership();

    private static HttpRequestDef<CreateGroupMembershipRequest, CreateGroupMembershipResponse> genForCreateGroupMembership() {
        // basic
        HttpRequestDef.Builder<CreateGroupMembershipRequest, CreateGroupMembershipResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateGroupMembershipRequest.class, CreateGroupMembershipResponse.class)
            .withName("CreateGroupMembership")
            .withUri("/v1/identity-stores/{identity_store_id}/group-memberships")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identity_store_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateGroupMembershipRequest::getIdentityStoreId,
                CreateGroupMembershipRequest::setIdentityStoreId));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateGroupMembershipRequest::getXSecurityToken,
                CreateGroupMembershipRequest::setXSecurityToken));
        builder.<CreateGroupMembershipReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateGroupMembershipReqBody.class),
            f -> f.withMarshaller(CreateGroupMembershipRequest::getBody, CreateGroupMembershipRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteGroupMembershipRequest, DeleteGroupMembershipResponse> deleteGroupMembership =
        genForDeleteGroupMembership();

    private static HttpRequestDef<DeleteGroupMembershipRequest, DeleteGroupMembershipResponse> genForDeleteGroupMembership() {
        // basic
        HttpRequestDef.Builder<DeleteGroupMembershipRequest, DeleteGroupMembershipResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteGroupMembershipRequest.class, DeleteGroupMembershipResponse.class)
            .withName("DeleteGroupMembership")
            .withUri("/v1/identity-stores/{identity_store_id}/group-memberships/{membership_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identity_store_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteGroupMembershipRequest::getIdentityStoreId,
                DeleteGroupMembershipRequest::setIdentityStoreId));
        builder.<String>withRequestField("membership_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteGroupMembershipRequest::getMembershipId,
                DeleteGroupMembershipRequest::setMembershipId));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteGroupMembershipRequest::getXSecurityToken,
                DeleteGroupMembershipRequest::setXSecurityToken));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DescribeGroupMembershipRequest, DescribeGroupMembershipResponse> describeGroupMembership =
        genForDescribeGroupMembership();

    private static HttpRequestDef<DescribeGroupMembershipRequest, DescribeGroupMembershipResponse> genForDescribeGroupMembership() {
        // basic
        HttpRequestDef.Builder<DescribeGroupMembershipRequest, DescribeGroupMembershipResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, DescribeGroupMembershipRequest.class, DescribeGroupMembershipResponse.class)
            .withName("DescribeGroupMembership")
            .withUri("/v1/identity-stores/{identity_store_id}/group-memberships/{membership_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identity_store_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DescribeGroupMembershipRequest::getIdentityStoreId,
                DescribeGroupMembershipRequest::setIdentityStoreId));
        builder.<String>withRequestField("membership_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DescribeGroupMembershipRequest::getMembershipId,
                DescribeGroupMembershipRequest::setMembershipId));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DescribeGroupMembershipRequest::getXSecurityToken,
                DescribeGroupMembershipRequest::setXSecurityToken));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<GetGroupMembershipIdRequest, GetGroupMembershipIdResponse> getGroupMembershipId =
        genForGetGroupMembershipId();

    private static HttpRequestDef<GetGroupMembershipIdRequest, GetGroupMembershipIdResponse> genForGetGroupMembershipId() {
        // basic
        HttpRequestDef.Builder<GetGroupMembershipIdRequest, GetGroupMembershipIdResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, GetGroupMembershipIdRequest.class, GetGroupMembershipIdResponse.class)
            .withName("GetGroupMembershipId")
            .withUri("/v1/identity-stores/{identity_store_id}/group-memberships/retrieve-group-membership-id")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identity_store_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetGroupMembershipIdRequest::getIdentityStoreId,
                GetGroupMembershipIdRequest::setIdentityStoreId));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetGroupMembershipIdRequest::getXSecurityToken,
                GetGroupMembershipIdRequest::setXSecurityToken));
        builder.<GetGroupMembershipIdReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(GetGroupMembershipIdReqBody.class),
            f -> f.withMarshaller(GetGroupMembershipIdRequest::getBody, GetGroupMembershipIdRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<IsMemberInGroupsRequest, IsMemberInGroupsResponse> isMemberInGroups =
        genForIsMemberInGroups();

    private static HttpRequestDef<IsMemberInGroupsRequest, IsMemberInGroupsResponse> genForIsMemberInGroups() {
        // basic
        HttpRequestDef.Builder<IsMemberInGroupsRequest, IsMemberInGroupsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, IsMemberInGroupsRequest.class, IsMemberInGroupsResponse.class)
                .withName("IsMemberInGroups")
                .withUri("/v1/identity-stores/{identity_store_id}/is-member-in-groups")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identity_store_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(IsMemberInGroupsRequest::getIdentityStoreId,
                IsMemberInGroupsRequest::setIdentityStoreId));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(IsMemberInGroupsRequest::getXSecurityToken,
                IsMemberInGroupsRequest::setXSecurityToken));
        builder.<IsMemberInGroupsReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(IsMemberInGroupsReqBody.class),
            f -> f.withMarshaller(IsMemberInGroupsRequest::getBody, IsMemberInGroupsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListGroupMembershipsRequest, ListGroupMembershipsResponse> listGroupMemberships =
        genForListGroupMemberships();

    private static HttpRequestDef<ListGroupMembershipsRequest, ListGroupMembershipsResponse> genForListGroupMemberships() {
        // basic
        HttpRequestDef.Builder<ListGroupMembershipsRequest, ListGroupMembershipsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListGroupMembershipsRequest.class, ListGroupMembershipsResponse.class)
            .withName("ListGroupMemberships")
            .withUri("/v1/identity-stores/{identity_store_id}/group-memberships")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identity_store_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGroupMembershipsRequest::getIdentityStoreId,
                ListGroupMembershipsRequest::setIdentityStoreId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListGroupMembershipsRequest::getLimit, ListGroupMembershipsRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGroupMembershipsRequest::getMarker, ListGroupMembershipsRequest::setMarker));
        builder.<String>withRequestField("group_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGroupMembershipsRequest::getGroupId, ListGroupMembershipsRequest::setGroupId));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGroupMembershipsRequest::getXSecurityToken,
                ListGroupMembershipsRequest::setXSecurityToken));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListGroupMembershipsForMemberRequest, ListGroupMembershipsForMemberResponse> listGroupMembershipsForMember =
        genForListGroupMembershipsForMember();

    private static HttpRequestDef<ListGroupMembershipsForMemberRequest, ListGroupMembershipsForMemberResponse> genForListGroupMembershipsForMember() {
        // basic
        HttpRequestDef.Builder<ListGroupMembershipsForMemberRequest, ListGroupMembershipsForMemberResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListGroupMembershipsForMemberRequest.class,
                    ListGroupMembershipsForMemberResponse.class)
                .withName("ListGroupMembershipsForMember")
                .withUri("/v1/identity-stores/{identity_store_id}/group-memberships-for-member")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identity_store_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGroupMembershipsForMemberRequest::getIdentityStoreId,
                ListGroupMembershipsForMemberRequest::setIdentityStoreId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListGroupMembershipsForMemberRequest::getLimit,
                ListGroupMembershipsForMemberRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGroupMembershipsForMemberRequest::getMarker,
                ListGroupMembershipsForMemberRequest::setMarker));
        builder.<String>withRequestField("user_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGroupMembershipsForMemberRequest::getUserId,
                ListGroupMembershipsForMemberRequest::setUserId));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGroupMembershipsForMemberRequest::getXSecurityToken,
                ListGroupMembershipsForMemberRequest::setXSecurityToken));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateExternalIdPConfigurationForDirectoryRequest, CreateExternalIdPConfigurationForDirectoryResponse> createExternalIdPConfigurationForDirectory =
        genForCreateExternalIdPConfigurationForDirectory();

    private static HttpRequestDef<CreateExternalIdPConfigurationForDirectoryRequest, CreateExternalIdPConfigurationForDirectoryResponse> genForCreateExternalIdPConfigurationForDirectory() {
        // basic
        HttpRequestDef.Builder<CreateExternalIdPConfigurationForDirectoryRequest, CreateExternalIdPConfigurationForDirectoryResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateExternalIdPConfigurationForDirectoryRequest.class,
                    CreateExternalIdPConfigurationForDirectoryResponse.class)
                .withName("CreateExternalIdPConfigurationForDirectory")
                .withUri("/v1/identity-stores/{identity_store_id}/external-idp")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identity_store_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateExternalIdPConfigurationForDirectoryRequest::getIdentityStoreId,
                CreateExternalIdPConfigurationForDirectoryRequest::setIdentityStoreId));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateExternalIdPConfigurationForDirectoryRequest::getXSecurityToken,
                CreateExternalIdPConfigurationForDirectoryRequest::setXSecurityToken));
        builder.<CreateIDPReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateIDPReqBody.class),
            f -> f.withMarshaller(CreateExternalIdPConfigurationForDirectoryRequest::getBody,
                CreateExternalIdPConfigurationForDirectoryRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteExternalIdPCertificateRequest, DeleteExternalIdPCertificateResponse> deleteExternalIdPCertificate =
        genForDeleteExternalIdPCertificate();

    private static HttpRequestDef<DeleteExternalIdPCertificateRequest, DeleteExternalIdPCertificateResponse> genForDeleteExternalIdPCertificate() {
        // basic
        HttpRequestDef.Builder<DeleteExternalIdPCertificateRequest, DeleteExternalIdPCertificateResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteExternalIdPCertificateRequest.class,
                    DeleteExternalIdPCertificateResponse.class)
                .withName("DeleteExternalIdPCertificate")
                .withUri("/v1/identity-stores/{identity_store_id}/external-idp/{idp_id}/certificate/{certificate_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identity_store_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteExternalIdPCertificateRequest::getIdentityStoreId,
                DeleteExternalIdPCertificateRequest::setIdentityStoreId));
        builder.<String>withRequestField("certificate_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteExternalIdPCertificateRequest::getCertificateId,
                DeleteExternalIdPCertificateRequest::setCertificateId));
        builder.<String>withRequestField("idp_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteExternalIdPCertificateRequest::getIdpId,
                DeleteExternalIdPCertificateRequest::setIdpId));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteExternalIdPCertificateRequest::getXSecurityToken,
                DeleteExternalIdPCertificateRequest::setXSecurityToken));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteExternalIdPConfigurationForDirectoryRequest, DeleteExternalIdPConfigurationForDirectoryResponse> deleteExternalIdPConfigurationForDirectory =
        genForDeleteExternalIdPConfigurationForDirectory();

    private static HttpRequestDef<DeleteExternalIdPConfigurationForDirectoryRequest, DeleteExternalIdPConfigurationForDirectoryResponse> genForDeleteExternalIdPConfigurationForDirectory() {
        // basic
        HttpRequestDef.Builder<DeleteExternalIdPConfigurationForDirectoryRequest, DeleteExternalIdPConfigurationForDirectoryResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteExternalIdPConfigurationForDirectoryRequest.class,
                    DeleteExternalIdPConfigurationForDirectoryResponse.class)
                .withName("DeleteExternalIdPConfigurationForDirectory")
                .withUri("/v1/identity-stores/{identity_store_id}/external-idp/{idp_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identity_store_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteExternalIdPConfigurationForDirectoryRequest::getIdentityStoreId,
                DeleteExternalIdPConfigurationForDirectoryRequest::setIdentityStoreId));
        builder.<String>withRequestField("idp_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteExternalIdPConfigurationForDirectoryRequest::getIdpId,
                DeleteExternalIdPConfigurationForDirectoryRequest::setIdpId));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteExternalIdPConfigurationForDirectoryRequest::getXSecurityToken,
                DeleteExternalIdPConfigurationForDirectoryRequest::setXSecurityToken));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DisableExternalIdPConfigurationForDirectoryRequest, DisableExternalIdPConfigurationForDirectoryResponse> disableExternalIdPConfigurationForDirectory =
        genForDisableExternalIdPConfigurationForDirectory();

    private static HttpRequestDef<DisableExternalIdPConfigurationForDirectoryRequest, DisableExternalIdPConfigurationForDirectoryResponse> genForDisableExternalIdPConfigurationForDirectory() {
        // basic
        HttpRequestDef.Builder<DisableExternalIdPConfigurationForDirectoryRequest, DisableExternalIdPConfigurationForDirectoryResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    DisableExternalIdPConfigurationForDirectoryRequest.class,
                    DisableExternalIdPConfigurationForDirectoryResponse.class)
                .withName("DisableExternalIdPConfigurationForDirectory")
                .withUri("/v1/identity-stores/{identity_store_id}/external-idp/{idp_id}/disable")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identity_store_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DisableExternalIdPConfigurationForDirectoryRequest::getIdentityStoreId,
                DisableExternalIdPConfigurationForDirectoryRequest::setIdentityStoreId));
        builder.<String>withRequestField("idp_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DisableExternalIdPConfigurationForDirectoryRequest::getIdpId,
                DisableExternalIdPConfigurationForDirectoryRequest::setIdpId));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DisableExternalIdPConfigurationForDirectoryRequest::getXSecurityToken,
                DisableExternalIdPConfigurationForDirectoryRequest::setXSecurityToken));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<EnableExternalIdPConfigurationForDirectoryRequest, EnableExternalIdPConfigurationForDirectoryResponse> enableExternalIdPConfigurationForDirectory =
        genForEnableExternalIdPConfigurationForDirectory();

    private static HttpRequestDef<EnableExternalIdPConfigurationForDirectoryRequest, EnableExternalIdPConfigurationForDirectoryResponse> genForEnableExternalIdPConfigurationForDirectory() {
        // basic
        HttpRequestDef.Builder<EnableExternalIdPConfigurationForDirectoryRequest, EnableExternalIdPConfigurationForDirectoryResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    EnableExternalIdPConfigurationForDirectoryRequest.class,
                    EnableExternalIdPConfigurationForDirectoryResponse.class)
                .withName("EnableExternalIdPConfigurationForDirectory")
                .withUri("/v1/identity-stores/{identity_store_id}/external-idp/{idp_id}/enable")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identity_store_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(EnableExternalIdPConfigurationForDirectoryRequest::getIdentityStoreId,
                EnableExternalIdPConfigurationForDirectoryRequest::setIdentityStoreId));
        builder.<String>withRequestField("idp_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(EnableExternalIdPConfigurationForDirectoryRequest::getIdpId,
                EnableExternalIdPConfigurationForDirectoryRequest::setIdpId));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(EnableExternalIdPConfigurationForDirectoryRequest::getXSecurityToken,
                EnableExternalIdPConfigurationForDirectoryRequest::setXSecurityToken));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ImportExternalIdPCertificateRequest, ImportExternalIdPCertificateResponse> importExternalIdPCertificate =
        genForImportExternalIdPCertificate();

    private static HttpRequestDef<ImportExternalIdPCertificateRequest, ImportExternalIdPCertificateResponse> genForImportExternalIdPCertificate() {
        // basic
        HttpRequestDef.Builder<ImportExternalIdPCertificateRequest, ImportExternalIdPCertificateResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ImportExternalIdPCertificateRequest.class,
                    ImportExternalIdPCertificateResponse.class)
                .withName("ImportExternalIdPCertificate")
                .withUri("/v1/identity-stores/{identity_store_id}/external-idp/{idp_id}/certificate")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identity_store_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ImportExternalIdPCertificateRequest::getIdentityStoreId,
                ImportExternalIdPCertificateRequest::setIdentityStoreId));
        builder.<String>withRequestField("idp_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ImportExternalIdPCertificateRequest::getIdpId,
                ImportExternalIdPCertificateRequest::setIdpId));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ImportExternalIdPCertificateRequest::getXSecurityToken,
                ImportExternalIdPCertificateRequest::setXSecurityToken));
        builder.<ImportExternalIdPCertificateReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ImportExternalIdPCertificateReqBody.class),
            f -> f.withMarshaller(ImportExternalIdPCertificateRequest::getBody,
                ImportExternalIdPCertificateRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListExternalIdPCertificatesRequest, ListExternalIdPCertificatesResponse> listExternalIdPCertificates =
        genForListExternalIdPCertificates();

    private static HttpRequestDef<ListExternalIdPCertificatesRequest, ListExternalIdPCertificatesResponse> genForListExternalIdPCertificates() {
        // basic
        HttpRequestDef.Builder<ListExternalIdPCertificatesRequest, ListExternalIdPCertificatesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListExternalIdPCertificatesRequest.class,
                    ListExternalIdPCertificatesResponse.class)
                .withName("ListExternalIdPCertificates")
                .withUri("/v1/identity-stores/{identity_store_id}/external-idp/{idp_id}/certificate")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identity_store_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListExternalIdPCertificatesRequest::getIdentityStoreId,
                ListExternalIdPCertificatesRequest::setIdentityStoreId));
        builder.<String>withRequestField("idp_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListExternalIdPCertificatesRequest::getIdpId,
                ListExternalIdPCertificatesRequest::setIdpId));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListExternalIdPCertificatesRequest::getXSecurityToken,
                ListExternalIdPCertificatesRequest::setXSecurityToken));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListExternalIdPConfigurationsForDirectoryRequest, ListExternalIdPConfigurationsForDirectoryResponse> listExternalIdPConfigurationsForDirectory =
        genForListExternalIdPConfigurationsForDirectory();

    private static HttpRequestDef<ListExternalIdPConfigurationsForDirectoryRequest, ListExternalIdPConfigurationsForDirectoryResponse> genForListExternalIdPConfigurationsForDirectory() {
        // basic
        HttpRequestDef.Builder<ListExternalIdPConfigurationsForDirectoryRequest, ListExternalIdPConfigurationsForDirectoryResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListExternalIdPConfigurationsForDirectoryRequest.class,
                    ListExternalIdPConfigurationsForDirectoryResponse.class)
                .withName("ListExternalIdPConfigurationsForDirectory")
                .withUri("/v1/identity-stores/{identity_store_id}/external-idp")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identity_store_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListExternalIdPConfigurationsForDirectoryRequest::getIdentityStoreId,
                ListExternalIdPConfigurationsForDirectoryRequest::setIdentityStoreId));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListExternalIdPConfigurationsForDirectoryRequest::getXSecurityToken,
                ListExternalIdPConfigurationsForDirectoryRequest::setXSecurityToken));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateExternalIdPConfigurationForDirectoryRequest, UpdateExternalIdPConfigurationForDirectoryResponse> updateExternalIdPConfigurationForDirectory =
        genForUpdateExternalIdPConfigurationForDirectory();

    private static HttpRequestDef<UpdateExternalIdPConfigurationForDirectoryRequest, UpdateExternalIdPConfigurationForDirectoryResponse> genForUpdateExternalIdPConfigurationForDirectory() {
        // basic
        HttpRequestDef.Builder<UpdateExternalIdPConfigurationForDirectoryRequest, UpdateExternalIdPConfigurationForDirectoryResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateExternalIdPConfigurationForDirectoryRequest.class,
                    UpdateExternalIdPConfigurationForDirectoryResponse.class)
                .withName("UpdateExternalIdPConfigurationForDirectory")
                .withUri("/v1/identity-stores/{identity_store_id}/external-idp/{idp_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identity_store_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateExternalIdPConfigurationForDirectoryRequest::getIdentityStoreId,
                UpdateExternalIdPConfigurationForDirectoryRequest::setIdentityStoreId));
        builder.<String>withRequestField("idp_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateExternalIdPConfigurationForDirectoryRequest::getIdpId,
                UpdateExternalIdPConfigurationForDirectoryRequest::setIdpId));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateExternalIdPConfigurationForDirectoryRequest::getXSecurityToken,
                UpdateExternalIdPConfigurationForDirectoryRequest::setXSecurityToken));
        builder.<UpdateExternalIdPConfigurationForDirectoryReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateExternalIdPConfigurationForDirectoryReqBody.class),
            f -> f.withMarshaller(UpdateExternalIdPConfigurationForDirectoryRequest::getBody,
                UpdateExternalIdPConfigurationForDirectoryRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DescribePasswordPolicyRequest, DescribePasswordPolicyResponse> describePasswordPolicy =
        genForDescribePasswordPolicy();

    private static HttpRequestDef<DescribePasswordPolicyRequest, DescribePasswordPolicyResponse> genForDescribePasswordPolicy() {
        // basic
        HttpRequestDef.Builder<DescribePasswordPolicyRequest, DescribePasswordPolicyResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, DescribePasswordPolicyRequest.class, DescribePasswordPolicyResponse.class)
            .withName("DescribePasswordPolicy")
            .withUri("/v1/identity-stores/{identity_store_id}/password-policy")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identity_store_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DescribePasswordPolicyRequest::getIdentityStoreId,
                DescribePasswordPolicyRequest::setIdentityStoreId));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DescribePasswordPolicyRequest::getXSecurityToken,
                DescribePasswordPolicyRequest::setXSecurityToken));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdatePasswordPolicyRequest, UpdatePasswordPolicyResponse> updatePasswordPolicy =
        genForUpdatePasswordPolicy();

    private static HttpRequestDef<UpdatePasswordPolicyRequest, UpdatePasswordPolicyResponse> genForUpdatePasswordPolicy() {
        // basic
        HttpRequestDef.Builder<UpdatePasswordPolicyRequest, UpdatePasswordPolicyResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdatePasswordPolicyRequest.class, UpdatePasswordPolicyResponse.class)
            .withName("UpdatePasswordPolicy")
            .withUri("/v1/identity-stores/{identity_store_id}/password-policy")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identity_store_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePasswordPolicyRequest::getIdentityStoreId,
                UpdatePasswordPolicyRequest::setIdentityStoreId));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePasswordPolicyRequest::getXSecurityToken,
                UpdatePasswordPolicyRequest::setXSecurityToken));
        builder.<UpdatePasswordPolicyReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdatePasswordPolicyReqBody.class),
            f -> f.withMarshaller(UpdatePasswordPolicyRequest::getBody, UpdatePasswordPolicyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateSpCertificateRequest, CreateSpCertificateResponse> createSpCertificate =
        genForCreateSpCertificate();

    private static HttpRequestDef<CreateSpCertificateRequest, CreateSpCertificateResponse> genForCreateSpCertificate() {
        // basic
        HttpRequestDef.Builder<CreateSpCertificateRequest, CreateSpCertificateResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateSpCertificateRequest.class, CreateSpCertificateResponse.class)
                .withName("CreateSpCertificate")
                .withUri("/v1/identity-stores/{identity_store_id}/saml-certificates")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identity_store_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateSpCertificateRequest::getIdentityStoreId,
                CreateSpCertificateRequest::setIdentityStoreId));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateSpCertificateRequest::getXSecurityToken,
                CreateSpCertificateRequest::setXSecurityToken));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteSpCertificateRequest, DeleteSpCertificateResponse> deleteSpCertificate =
        genForDeleteSpCertificate();

    private static HttpRequestDef<DeleteSpCertificateRequest, DeleteSpCertificateResponse> genForDeleteSpCertificate() {
        // basic
        HttpRequestDef.Builder<DeleteSpCertificateRequest, DeleteSpCertificateResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteSpCertificateRequest.class, DeleteSpCertificateResponse.class)
            .withName("DeleteSpCertificate")
            .withUri("/v1/identity-stores/{identity_store_id}/saml-certificates/{certificate_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identity_store_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteSpCertificateRequest::getIdentityStoreId,
                DeleteSpCertificateRequest::setIdentityStoreId));
        builder.<String>withRequestField("certificate_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteSpCertificateRequest::getCertificateId,
                DeleteSpCertificateRequest::setCertificateId));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteSpCertificateRequest::getXSecurityToken,
                DeleteSpCertificateRequest::setXSecurityToken));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<GetSpConfigurationForDirectoryRequest, GetSpConfigurationForDirectoryResponse> getSpConfigurationForDirectory =
        genForGetSpConfigurationForDirectory();

    private static HttpRequestDef<GetSpConfigurationForDirectoryRequest, GetSpConfigurationForDirectoryResponse> genForGetSpConfigurationForDirectory() {
        // basic
        HttpRequestDef.Builder<GetSpConfigurationForDirectoryRequest, GetSpConfigurationForDirectoryResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    GetSpConfigurationForDirectoryRequest.class,
                    GetSpConfigurationForDirectoryResponse.class)
                .withName("GetSpConfigurationForDirectory")
                .withUri("/v1/identity-stores/{identity_store_id}/sp-config")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identity_store_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetSpConfigurationForDirectoryRequest::getIdentityStoreId,
                GetSpConfigurationForDirectoryRequest::setIdentityStoreId));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetSpConfigurationForDirectoryRequest::getXSecurityToken,
                GetSpConfigurationForDirectoryRequest::setXSecurityToken));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSpCertificatesRequest, ListSpCertificatesResponse> listSpCertificates =
        genForListSpCertificates();

    private static HttpRequestDef<ListSpCertificatesRequest, ListSpCertificatesResponse> genForListSpCertificates() {
        // basic
        HttpRequestDef.Builder<ListSpCertificatesRequest, ListSpCertificatesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListSpCertificatesRequest.class, ListSpCertificatesResponse.class)
                .withName("ListSpCertificates")
                .withUri("/v1/identity-stores/{identity_store_id}/saml-certificates")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identity_store_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSpCertificatesRequest::getIdentityStoreId,
                ListSpCertificatesRequest::setIdentityStoreId));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSpCertificatesRequest::getXSecurityToken,
                ListSpCertificatesRequest::setXSecurityToken));

        // response
        builder.<List<SpCertificateDto>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListSpCertificatesResponse::getBody, ListSpCertificatesResponse::setBody)
                .withInnerContainerType(SpCertificateDto.class));

        return builder.build();
    }

    public static final HttpRequestDef<UpdateSpActiveCertificateRequest, UpdateSpActiveCertificateResponse> updateSpActiveCertificate =
        genForUpdateSpActiveCertificate();

    private static HttpRequestDef<UpdateSpActiveCertificateRequest, UpdateSpActiveCertificateResponse> genForUpdateSpActiveCertificate() {
        // basic
        HttpRequestDef.Builder<UpdateSpActiveCertificateRequest, UpdateSpActiveCertificateResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    UpdateSpActiveCertificateRequest.class,
                    UpdateSpActiveCertificateResponse.class)
                .withName("UpdateSpActiveCertificate")
                .withUri("/v1/identity-stores/{identity_store_id}/saml-certificates/{certificate_id}/active")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identity_store_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateSpActiveCertificateRequest::getIdentityStoreId,
                UpdateSpActiveCertificateRequest::setIdentityStoreId));
        builder.<String>withRequestField("certificate_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateSpActiveCertificateRequest::getCertificateId,
                UpdateSpActiveCertificateRequest::setCertificateId));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateSpActiveCertificateRequest::getXSecurityToken,
                UpdateSpActiveCertificateRequest::setXSecurityToken));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<GetIdentityStoreSummaryRequest, GetIdentityStoreSummaryResponse> getIdentityStoreSummary =
        genForGetIdentityStoreSummary();

    private static HttpRequestDef<GetIdentityStoreSummaryRequest, GetIdentityStoreSummaryResponse> genForGetIdentityStoreSummary() {
        // basic
        HttpRequestDef.Builder<GetIdentityStoreSummaryRequest, GetIdentityStoreSummaryResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, GetIdentityStoreSummaryRequest.class, GetIdentityStoreSummaryResponse.class)
            .withName("GetIdentityStoreSummary")
            .withUri("/v1/identity-stores/{identity_store_id}/identity-store-summary")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identity_store_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetIdentityStoreSummaryRequest::getIdentityStoreId,
                GetIdentityStoreSummaryRequest::setIdentityStoreId));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetIdentityStoreSummaryRequest::getXSecurityToken,
                GetIdentityStoreSummaryRequest::setXSecurityToken));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateBearerTokenRequest, CreateBearerTokenResponse> createBearerToken =
        genForCreateBearerToken();

    private static HttpRequestDef<CreateBearerTokenRequest, CreateBearerTokenResponse> genForCreateBearerToken() {
        // basic
        HttpRequestDef.Builder<CreateBearerTokenRequest, CreateBearerTokenResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateBearerTokenRequest.class, CreateBearerTokenResponse.class)
                .withName("CreateBearerToken")
                .withUri("/v1/identity-stores/{identity_store_id}/tenant/{tenant_id}/bearer-token")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identity_store_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateBearerTokenRequest::getIdentityStoreId,
                CreateBearerTokenRequest::setIdentityStoreId));
        builder.<String>withRequestField("tenant_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateBearerTokenRequest::getTenantId, CreateBearerTokenRequest::setTenantId));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateBearerTokenRequest::getXSecurityToken,
                CreateBearerTokenRequest::setXSecurityToken));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateProvisioningTenantRequest, CreateProvisioningTenantResponse> createProvisioningTenant =
        genForCreateProvisioningTenant();

    private static HttpRequestDef<CreateProvisioningTenantRequest, CreateProvisioningTenantResponse> genForCreateProvisioningTenant() {
        // basic
        HttpRequestDef.Builder<CreateProvisioningTenantRequest, CreateProvisioningTenantResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, CreateProvisioningTenantRequest.class, CreateProvisioningTenantResponse.class)
                .withName("CreateProvisioningTenant")
                .withUri("/v1/identity-stores/{identity_store_id}/provision-tenant")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identity_store_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateProvisioningTenantRequest::getIdentityStoreId,
                CreateProvisioningTenantRequest::setIdentityStoreId));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateProvisioningTenantRequest::getXSecurityToken,
                CreateProvisioningTenantRequest::setXSecurityToken));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteBearerTokenRequest, DeleteBearerTokenResponse> deleteBearerToken =
        genForDeleteBearerToken();

    private static HttpRequestDef<DeleteBearerTokenRequest, DeleteBearerTokenResponse> genForDeleteBearerToken() {
        // basic
        HttpRequestDef.Builder<DeleteBearerTokenRequest, DeleteBearerTokenResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteBearerTokenRequest.class, DeleteBearerTokenResponse.class)
                .withName("DeleteBearerToken")
                .withUri("/v1/identity-stores/{identity_store_id}/tenant/{tenant_id}/bearer-token/{token_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identity_store_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteBearerTokenRequest::getIdentityStoreId,
                DeleteBearerTokenRequest::setIdentityStoreId));
        builder.<String>withRequestField("tenant_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteBearerTokenRequest::getTenantId, DeleteBearerTokenRequest::setTenantId));
        builder.<String>withRequestField("token_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteBearerTokenRequest::getTokenId, DeleteBearerTokenRequest::setTokenId));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteBearerTokenRequest::getXSecurityToken,
                DeleteBearerTokenRequest::setXSecurityToken));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteProvisioningTenantRequest, DeleteProvisioningTenantResponse> deleteProvisioningTenant =
        genForDeleteProvisioningTenant();

    private static HttpRequestDef<DeleteProvisioningTenantRequest, DeleteProvisioningTenantResponse> genForDeleteProvisioningTenant() {
        // basic
        HttpRequestDef.Builder<DeleteProvisioningTenantRequest, DeleteProvisioningTenantResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteProvisioningTenantRequest.class,
                    DeleteProvisioningTenantResponse.class)
                .withName("DeleteProvisioningTenant")
                .withUri("/v1/identity-stores/{identity_store_id}/tenant/{tenant_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identity_store_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteProvisioningTenantRequest::getIdentityStoreId,
                DeleteProvisioningTenantRequest::setIdentityStoreId));
        builder.<String>withRequestField("tenant_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteProvisioningTenantRequest::getTenantId,
                DeleteProvisioningTenantRequest::setTenantId));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteProvisioningTenantRequest::getXSecurityToken,
                DeleteProvisioningTenantRequest::setXSecurityToken));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListBearerTokensRequest, ListBearerTokensResponse> listBearerTokens =
        genForListBearerTokens();

    private static HttpRequestDef<ListBearerTokensRequest, ListBearerTokensResponse> genForListBearerTokens() {
        // basic
        HttpRequestDef.Builder<ListBearerTokensRequest, ListBearerTokensResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListBearerTokensRequest.class, ListBearerTokensResponse.class)
                .withName("ListBearerTokens")
                .withUri("/v1/identity-stores/{identity_store_id}/tenant/{tenant_id}/bearer-token")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identity_store_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBearerTokensRequest::getIdentityStoreId,
                ListBearerTokensRequest::setIdentityStoreId));
        builder.<String>withRequestField("tenant_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBearerTokensRequest::getTenantId, ListBearerTokensRequest::setTenantId));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBearerTokensRequest::getXSecurityToken,
                ListBearerTokensRequest::setXSecurityToken));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListProvisioningTenantsRequest, ListProvisioningTenantsResponse> listProvisioningTenants =
        genForListProvisioningTenants();

    private static HttpRequestDef<ListProvisioningTenantsRequest, ListProvisioningTenantsResponse> genForListProvisioningTenants() {
        // basic
        HttpRequestDef.Builder<ListProvisioningTenantsRequest, ListProvisioningTenantsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListProvisioningTenantsRequest.class, ListProvisioningTenantsResponse.class)
            .withName("ListProvisioningTenants")
            .withUri("/v1/identity-stores/{identity_store_id}/provision-tenant")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identity_store_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProvisioningTenantsRequest::getIdentityStoreId,
                ListProvisioningTenantsRequest::setIdentityStoreId));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProvisioningTenantsRequest::getXSecurityToken,
                ListProvisioningTenantsRequest::setXSecurityToken));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteSessionsRequest, BatchDeleteSessionsResponse> batchDeleteSessions =
        genForBatchDeleteSessions();

    private static HttpRequestDef<BatchDeleteSessionsRequest, BatchDeleteSessionsResponse> genForBatchDeleteSessions() {
        // basic
        HttpRequestDef.Builder<BatchDeleteSessionsRequest, BatchDeleteSessionsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchDeleteSessionsRequest.class, BatchDeleteSessionsResponse.class)
                .withName("BatchDeleteSessions")
                .withUri("/v1/identity-stores/{identity_store_id}/users/{user_id}/sessions/batch-delete")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identity_store_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeleteSessionsRequest::getIdentityStoreId,
                BatchDeleteSessionsRequest::setIdentityStoreId));
        builder.<String>withRequestField("user_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeleteSessionsRequest::getUserId, BatchDeleteSessionsRequest::setUserId));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeleteSessionsRequest::getXSecurityToken,
                BatchDeleteSessionsRequest::setXSecurityToken));
        builder.<BatchDeleteSessionsReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(BatchDeleteSessionsReqBody.class),
            f -> f.withMarshaller(BatchDeleteSessionsRequest::getBody, BatchDeleteSessionsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchListMfaDevicesForUserRequest, BatchListMfaDevicesForUserResponse> batchListMfaDevicesForUser =
        genForBatchListMfaDevicesForUser();

    private static HttpRequestDef<BatchListMfaDevicesForUserRequest, BatchListMfaDevicesForUserResponse> genForBatchListMfaDevicesForUser() {
        // basic
        HttpRequestDef.Builder<BatchListMfaDevicesForUserRequest, BatchListMfaDevicesForUserResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    BatchListMfaDevicesForUserRequest.class,
                    BatchListMfaDevicesForUserResponse.class)
                .withName("BatchListMfaDevicesForUser")
                .withUri("/v1/identity-stores/{identity_store_id}/users/retrieve-mfa-devices")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identity_store_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchListMfaDevicesForUserRequest::getIdentityStoreId,
                BatchListMfaDevicesForUserRequest::setIdentityStoreId));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchListMfaDevicesForUserRequest::getXSecurityToken,
                BatchListMfaDevicesForUserRequest::setXSecurityToken));
        builder.<BatchListMfaDevicesForUserReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchListMfaDevicesForUserReqBody.class),
            f -> f.withMarshaller(BatchListMfaDevicesForUserRequest::getBody,
                BatchListMfaDevicesForUserRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateUserRequest, CreateUserResponse> createUser = genForCreateUser();

    private static HttpRequestDef<CreateUserRequest, CreateUserResponse> genForCreateUser() {
        // basic
        HttpRequestDef.Builder<CreateUserRequest, CreateUserResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateUserRequest.class, CreateUserResponse.class)
                .withName("CreateUser")
                .withUri("/v1/identity-stores/{identity_store_id}/users")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identity_store_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateUserRequest::getIdentityStoreId, CreateUserRequest::setIdentityStoreId));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateUserRequest::getXSecurityToken, CreateUserRequest::setXSecurityToken));
        builder.<CreateUserReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateUserReqBody.class),
            f -> f.withMarshaller(CreateUserRequest::getBody, CreateUserRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteMfaDeviceForUserRequest, DeleteMfaDeviceForUserResponse> deleteMfaDeviceForUser =
        genForDeleteMfaDeviceForUser();

    private static HttpRequestDef<DeleteMfaDeviceForUserRequest, DeleteMfaDeviceForUserResponse> genForDeleteMfaDeviceForUser() {
        // basic
        HttpRequestDef.Builder<DeleteMfaDeviceForUserRequest, DeleteMfaDeviceForUserResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteMfaDeviceForUserRequest.class, DeleteMfaDeviceForUserResponse.class)
            .withName("DeleteMfaDeviceForUser")
            .withUri("/v1/identity-stores/{identity_store_id}/users/{user_id}/mfa-devices/{device_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identity_store_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteMfaDeviceForUserRequest::getIdentityStoreId,
                DeleteMfaDeviceForUserRequest::setIdentityStoreId));
        builder.<String>withRequestField("user_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteMfaDeviceForUserRequest::getUserId, DeleteMfaDeviceForUserRequest::setUserId));
        builder.<String>withRequestField("device_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteMfaDeviceForUserRequest::getDeviceId,
                DeleteMfaDeviceForUserRequest::setDeviceId));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteMfaDeviceForUserRequest::getXSecurityToken,
                DeleteMfaDeviceForUserRequest::setXSecurityToken));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteUserRequest, DeleteUserResponse> deleteUser = genForDeleteUser();

    private static HttpRequestDef<DeleteUserRequest, DeleteUserResponse> genForDeleteUser() {
        // basic
        HttpRequestDef.Builder<DeleteUserRequest, DeleteUserResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteUserRequest.class, DeleteUserResponse.class)
                .withName("DeleteUser")
                .withUri("/v1/identity-stores/{identity_store_id}/users/{user_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identity_store_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteUserRequest::getIdentityStoreId, DeleteUserRequest::setIdentityStoreId));
        builder.<String>withRequestField("user_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteUserRequest::getUserId, DeleteUserRequest::setUserId));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteUserRequest::getXSecurityToken, DeleteUserRequest::setXSecurityToken));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DescribeUserRequest, DescribeUserResponse> describeUser = genForDescribeUser();

    private static HttpRequestDef<DescribeUserRequest, DescribeUserResponse> genForDescribeUser() {
        // basic
        HttpRequestDef.Builder<DescribeUserRequest, DescribeUserResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, DescribeUserRequest.class, DescribeUserResponse.class)
                .withName("DescribeUser")
                .withUri("/v1/identity-stores/{identity_store_id}/users/{user_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identity_store_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DescribeUserRequest::getIdentityStoreId, DescribeUserRequest::setIdentityStoreId));
        builder.<String>withRequestField("user_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DescribeUserRequest::getUserId, DescribeUserRequest::setUserId));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DescribeUserRequest::getXSecurityToken, DescribeUserRequest::setXSecurityToken));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DescribeUsersRequest, DescribeUsersResponse> describeUsers =
        genForDescribeUsers();

    private static HttpRequestDef<DescribeUsersRequest, DescribeUsersResponse> genForDescribeUsers() {
        // basic
        HttpRequestDef.Builder<DescribeUsersRequest, DescribeUsersResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, DescribeUsersRequest.class, DescribeUsersResponse.class)
                .withName("DescribeUsers")
                .withUri("/v1/identity-stores/{identity_store_id}/users/batch-query")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identity_store_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DescribeUsersRequest::getIdentityStoreId, DescribeUsersRequest::setIdentityStoreId));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DescribeUsersRequest::getXSecurityToken, DescribeUsersRequest::setXSecurityToken));
        builder.<DescribeUsersRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DescribeUsersRequestBody.class),
            f -> f.withMarshaller(DescribeUsersRequest::getBody, DescribeUsersRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DisableUserRequest, DisableUserResponse> disableUser = genForDisableUser();

    private static HttpRequestDef<DisableUserRequest, DisableUserResponse> genForDisableUser() {
        // basic
        HttpRequestDef.Builder<DisableUserRequest, DisableUserResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, DisableUserRequest.class, DisableUserResponse.class)
                .withName("DisableUser")
                .withUri("/v1/identity-stores/{identity_store_id}/users/{user_id}/disable")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identity_store_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DisableUserRequest::getIdentityStoreId, DisableUserRequest::setIdentityStoreId));
        builder.<String>withRequestField("user_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DisableUserRequest::getUserId, DisableUserRequest::setUserId));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DisableUserRequest::getXSecurityToken, DisableUserRequest::setXSecurityToken));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<EnableUserRequest, EnableUserResponse> enableUser = genForEnableUser();

    private static HttpRequestDef<EnableUserRequest, EnableUserResponse> genForEnableUser() {
        // basic
        HttpRequestDef.Builder<EnableUserRequest, EnableUserResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, EnableUserRequest.class, EnableUserResponse.class)
                .withName("EnableUser")
                .withUri("/v1/identity-stores/{identity_store_id}/users/{user_id}/enable")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identity_store_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(EnableUserRequest::getIdentityStoreId, EnableUserRequest::setIdentityStoreId));
        builder.<String>withRequestField("user_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(EnableUserRequest::getUserId, EnableUserRequest::setUserId));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(EnableUserRequest::getXSecurityToken, EnableUserRequest::setXSecurityToken));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<GetUserIdRequest, GetUserIdResponse> getUserId = genForGetUserId();

    private static HttpRequestDef<GetUserIdRequest, GetUserIdResponse> genForGetUserId() {
        // basic
        HttpRequestDef.Builder<GetUserIdRequest, GetUserIdResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, GetUserIdRequest.class, GetUserIdResponse.class)
                .withName("GetUserId")
                .withUri("/v1/identity-stores/{identity_store_id}/users/retrieve-user-id")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identity_store_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetUserIdRequest::getIdentityStoreId, GetUserIdRequest::setIdentityStoreId));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetUserIdRequest::getXSecurityToken, GetUserIdRequest::setXSecurityToken));
        builder.<GetUserIdReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(GetUserIdReqBody.class),
            f -> f.withMarshaller(GetUserIdRequest::getBody, GetUserIdRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSessionsRequest, ListSessionsResponse> listSessions = genForListSessions();

    private static HttpRequestDef<ListSessionsRequest, ListSessionsResponse> genForListSessions() {
        // basic
        HttpRequestDef.Builder<ListSessionsRequest, ListSessionsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListSessionsRequest.class, ListSessionsResponse.class)
                .withName("ListSessions")
                .withUri("/v1/identity-stores/{identity_store_id}/users/{user_id}/sessions")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identity_store_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSessionsRequest::getIdentityStoreId, ListSessionsRequest::setIdentityStoreId));
        builder.<String>withRequestField("user_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSessionsRequest::getUserId, ListSessionsRequest::setUserId));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSessionsRequest::getXSecurityToken, ListSessionsRequest::setXSecurityToken));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListUsersRequest, ListUsersResponse> listUsers = genForListUsers();

    private static HttpRequestDef<ListUsersRequest, ListUsersResponse> genForListUsers() {
        // basic
        HttpRequestDef.Builder<ListUsersRequest, ListUsersResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListUsersRequest.class, ListUsersResponse.class)
                .withName("ListUsers")
                .withUri("/v1/identity-stores/{identity_store_id}/users")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identity_store_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUsersRequest::getIdentityStoreId, ListUsersRequest::setIdentityStoreId));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUsersRequest::getMarker, ListUsersRequest::setMarker));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListUsersRequest::getLimit, ListUsersRequest::setLimit));
        builder.<String>withRequestField("user_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUsersRequest::getUserName, ListUsersRequest::setUserName));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUsersRequest::getXSecurityToken, ListUsersRequest::setXSecurityToken));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RegisterMfaDeviceForUserRequest, RegisterMfaDeviceForUserResponse> registerMfaDeviceForUser =
        genForRegisterMfaDeviceForUser();

    private static HttpRequestDef<RegisterMfaDeviceForUserRequest, RegisterMfaDeviceForUserResponse> genForRegisterMfaDeviceForUser() {
        // basic
        HttpRequestDef.Builder<RegisterMfaDeviceForUserRequest, RegisterMfaDeviceForUserResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, RegisterMfaDeviceForUserRequest.class, RegisterMfaDeviceForUserResponse.class)
                .withName("RegisterMfaDeviceForUser")
                .withUri("/v1/identity-stores/{identity_store_id}/users/{user_id}/mfa-devices/register-mfa-device")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identity_store_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RegisterMfaDeviceForUserRequest::getIdentityStoreId,
                RegisterMfaDeviceForUserRequest::setIdentityStoreId));
        builder.<String>withRequestField("user_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RegisterMfaDeviceForUserRequest::getUserId,
                RegisterMfaDeviceForUserRequest::setUserId));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RegisterMfaDeviceForUserRequest::getXSecurityToken,
                RegisterMfaDeviceForUserRequest::setXSecurityToken));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ResetPwdModeRequest, ResetPwdModeResponse> resetPwdMode = genForResetPwdMode();

    private static HttpRequestDef<ResetPwdModeRequest, ResetPwdModeResponse> genForResetPwdMode() {
        // basic
        HttpRequestDef.Builder<ResetPwdModeRequest, ResetPwdModeResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ResetPwdModeRequest.class, ResetPwdModeResponse.class)
                .withName("ResetPwdMode")
                .withUri("/v1/identity-stores/{identity_store_id}/users/{user_id}/reset-password")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identity_store_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ResetPwdModeRequest::getIdentityStoreId, ResetPwdModeRequest::setIdentityStoreId));
        builder.<String>withRequestField("user_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ResetPwdModeRequest::getUserId, ResetPwdModeRequest::setUserId));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ResetPwdModeRequest::getXSecurityToken, ResetPwdModeRequest::setXSecurityToken));
        builder.<UpdatePwdModeReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdatePwdModeReqBody.class),
            f -> f.withMarshaller(ResetPwdModeRequest::getBody, ResetPwdModeRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateMfaDeviceForUserRequest, UpdateMfaDeviceForUserResponse> updateMfaDeviceForUser =
        genForUpdateMfaDeviceForUser();

    private static HttpRequestDef<UpdateMfaDeviceForUserRequest, UpdateMfaDeviceForUserResponse> genForUpdateMfaDeviceForUser() {
        // basic
        HttpRequestDef.Builder<UpdateMfaDeviceForUserRequest, UpdateMfaDeviceForUserResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateMfaDeviceForUserRequest.class, UpdateMfaDeviceForUserResponse.class)
            .withName("UpdateMfaDeviceForUser")
            .withUri("/v1/identity-stores/{identity_store_id}/users/{user_id}/mfa-devices/{device_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identity_store_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateMfaDeviceForUserRequest::getIdentityStoreId,
                UpdateMfaDeviceForUserRequest::setIdentityStoreId));
        builder.<String>withRequestField("user_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateMfaDeviceForUserRequest::getUserId, UpdateMfaDeviceForUserRequest::setUserId));
        builder.<String>withRequestField("device_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateMfaDeviceForUserRequest::getDeviceId,
                UpdateMfaDeviceForUserRequest::setDeviceId));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateMfaDeviceForUserRequest::getXSecurityToken,
                UpdateMfaDeviceForUserRequest::setXSecurityToken));
        builder.<UpdateMfaDeviceForUserReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdateMfaDeviceForUserReqBody.class),
            f -> f.withMarshaller(UpdateMfaDeviceForUserRequest::getBody, UpdateMfaDeviceForUserRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateUserRequest, UpdateUserResponse> updateUser = genForUpdateUser();

    private static HttpRequestDef<UpdateUserRequest, UpdateUserResponse> genForUpdateUser() {
        // basic
        HttpRequestDef.Builder<UpdateUserRequest, UpdateUserResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateUserRequest.class, UpdateUserResponse.class)
                .withName("UpdateUser")
                .withUri("/v1/identity-stores/{identity_store_id}/users/{user_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identity_store_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateUserRequest::getIdentityStoreId, UpdateUserRequest::setIdentityStoreId));
        builder.<String>withRequestField("user_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateUserRequest::getUserId, UpdateUserRequest::setUserId));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateUserRequest::getXSecurityToken, UpdateUserRequest::setXSecurityToken));
        builder.<UpdateUserReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateUserReqBody.class),
            f -> f.withMarshaller(UpdateUserRequest::getBody, UpdateUserRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<VerifyEmailRequest, VerifyEmailResponse> verifyEmail = genForVerifyEmail();

    private static HttpRequestDef<VerifyEmailRequest, VerifyEmailResponse> genForVerifyEmail() {
        // basic
        HttpRequestDef.Builder<VerifyEmailRequest, VerifyEmailResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, VerifyEmailRequest.class, VerifyEmailResponse.class)
                .withName("VerifyEmail")
                .withUri("/v1/identity-stores/{identity_store_id}/users/{user_id}/verify-email")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identity_store_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(VerifyEmailRequest::getIdentityStoreId, VerifyEmailRequest::setIdentityStoreId));
        builder.<String>withRequestField("user_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(VerifyEmailRequest::getUserId, VerifyEmailRequest::setUserId));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(VerifyEmailRequest::getXSecurityToken, VerifyEmailRequest::setXSecurityToken));

        // response

        return builder.build();
    }

}
