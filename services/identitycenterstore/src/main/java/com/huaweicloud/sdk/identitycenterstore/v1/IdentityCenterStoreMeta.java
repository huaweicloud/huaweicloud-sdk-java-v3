package com.huaweicloud.sdk.identitycenterstore.v1;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.identitycenterstore.v1.model.CreateGroupMembershipReqBody;
import com.huaweicloud.sdk.identitycenterstore.v1.model.CreateGroupMembershipRequest;
import com.huaweicloud.sdk.identitycenterstore.v1.model.CreateGroupMembershipResponse;
import com.huaweicloud.sdk.identitycenterstore.v1.model.CreateGroupReqBody;
import com.huaweicloud.sdk.identitycenterstore.v1.model.CreateGroupRequest;
import com.huaweicloud.sdk.identitycenterstore.v1.model.CreateGroupResponse;
import com.huaweicloud.sdk.identitycenterstore.v1.model.CreateUserReqBody;
import com.huaweicloud.sdk.identitycenterstore.v1.model.CreateUserRequest;
import com.huaweicloud.sdk.identitycenterstore.v1.model.CreateUserResponse;
import com.huaweicloud.sdk.identitycenterstore.v1.model.DeleteGroupMembershipRequest;
import com.huaweicloud.sdk.identitycenterstore.v1.model.DeleteGroupMembershipResponse;
import com.huaweicloud.sdk.identitycenterstore.v1.model.DeleteGroupRequest;
import com.huaweicloud.sdk.identitycenterstore.v1.model.DeleteGroupResponse;
import com.huaweicloud.sdk.identitycenterstore.v1.model.DeleteUserRequest;
import com.huaweicloud.sdk.identitycenterstore.v1.model.DeleteUserResponse;
import com.huaweicloud.sdk.identitycenterstore.v1.model.DescribeGroupMembershipRequest;
import com.huaweicloud.sdk.identitycenterstore.v1.model.DescribeGroupMembershipResponse;
import com.huaweicloud.sdk.identitycenterstore.v1.model.DescribeGroupRequest;
import com.huaweicloud.sdk.identitycenterstore.v1.model.DescribeGroupResponse;
import com.huaweicloud.sdk.identitycenterstore.v1.model.DescribeUserRequest;
import com.huaweicloud.sdk.identitycenterstore.v1.model.DescribeUserResponse;
import com.huaweicloud.sdk.identitycenterstore.v1.model.GetGroupIdReqBody;
import com.huaweicloud.sdk.identitycenterstore.v1.model.GetGroupIdRequest;
import com.huaweicloud.sdk.identitycenterstore.v1.model.GetGroupIdResponse;
import com.huaweicloud.sdk.identitycenterstore.v1.model.GetGroupMembershipIdReqBody;
import com.huaweicloud.sdk.identitycenterstore.v1.model.GetGroupMembershipIdRequest;
import com.huaweicloud.sdk.identitycenterstore.v1.model.GetGroupMembershipIdResponse;
import com.huaweicloud.sdk.identitycenterstore.v1.model.GetUserIdReqBody;
import com.huaweicloud.sdk.identitycenterstore.v1.model.GetUserIdRequest;
import com.huaweicloud.sdk.identitycenterstore.v1.model.GetUserIdResponse;
import com.huaweicloud.sdk.identitycenterstore.v1.model.IsMemberInGroupsReqBody;
import com.huaweicloud.sdk.identitycenterstore.v1.model.IsMemberInGroupsRequest;
import com.huaweicloud.sdk.identitycenterstore.v1.model.IsMemberInGroupsResponse;
import com.huaweicloud.sdk.identitycenterstore.v1.model.ListGroupMembershipsForMemberRequest;
import com.huaweicloud.sdk.identitycenterstore.v1.model.ListGroupMembershipsForMemberResponse;
import com.huaweicloud.sdk.identitycenterstore.v1.model.ListGroupMembershipsRequest;
import com.huaweicloud.sdk.identitycenterstore.v1.model.ListGroupMembershipsResponse;
import com.huaweicloud.sdk.identitycenterstore.v1.model.ListGroupsRequest;
import com.huaweicloud.sdk.identitycenterstore.v1.model.ListGroupsResponse;
import com.huaweicloud.sdk.identitycenterstore.v1.model.ListUsersRequest;
import com.huaweicloud.sdk.identitycenterstore.v1.model.ListUsersResponse;
import com.huaweicloud.sdk.identitycenterstore.v1.model.UpdateGroupReqBody;
import com.huaweicloud.sdk.identitycenterstore.v1.model.UpdateGroupRequest;
import com.huaweicloud.sdk.identitycenterstore.v1.model.UpdateGroupResponse;
import com.huaweicloud.sdk.identitycenterstore.v1.model.UpdateUserReqBody;
import com.huaweicloud.sdk.identitycenterstore.v1.model.UpdateUserRequest;
import com.huaweicloud.sdk.identitycenterstore.v1.model.UpdateUserResponse;

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

}
