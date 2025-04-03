package com.huaweicloud.sdk.identitycenterscim.v1;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.identitycenterscim.v1.model.CreateGroupReqBody;
import com.huaweicloud.sdk.identitycenterscim.v1.model.CreateGroupRequest;
import com.huaweicloud.sdk.identitycenterscim.v1.model.CreateGroupResponse;
import com.huaweicloud.sdk.identitycenterscim.v1.model.CreateUserReqBody;
import com.huaweicloud.sdk.identitycenterscim.v1.model.CreateUserRequest;
import com.huaweicloud.sdk.identitycenterscim.v1.model.CreateUserResponse;
import com.huaweicloud.sdk.identitycenterscim.v1.model.DeleteGroupRequest;
import com.huaweicloud.sdk.identitycenterscim.v1.model.DeleteGroupResponse;
import com.huaweicloud.sdk.identitycenterscim.v1.model.DeleteUserRequest;
import com.huaweicloud.sdk.identitycenterscim.v1.model.DeleteUserResponse;
import com.huaweicloud.sdk.identitycenterscim.v1.model.GetGroupRequest;
import com.huaweicloud.sdk.identitycenterscim.v1.model.GetGroupResponse;
import com.huaweicloud.sdk.identitycenterscim.v1.model.GetUserRequest;
import com.huaweicloud.sdk.identitycenterscim.v1.model.GetUserResponse;
import com.huaweicloud.sdk.identitycenterscim.v1.model.ListGroupsRequest;
import com.huaweicloud.sdk.identitycenterscim.v1.model.ListGroupsResponse;
import com.huaweicloud.sdk.identitycenterscim.v1.model.ListUsersRequest;
import com.huaweicloud.sdk.identitycenterscim.v1.model.ListUsersResponse;
import com.huaweicloud.sdk.identitycenterscim.v1.model.PatchGroupReqBody;
import com.huaweicloud.sdk.identitycenterscim.v1.model.PatchGroupRequest;
import com.huaweicloud.sdk.identitycenterscim.v1.model.PatchGroupResponse;
import com.huaweicloud.sdk.identitycenterscim.v1.model.PatchUserReqBody;
import com.huaweicloud.sdk.identitycenterscim.v1.model.PatchUserRequest;
import com.huaweicloud.sdk.identitycenterscim.v1.model.PatchUserResponse;
import com.huaweicloud.sdk.identitycenterscim.v1.model.PutUserRequest;
import com.huaweicloud.sdk.identitycenterscim.v1.model.PutUserResponse;
import com.huaweicloud.sdk.identitycenterscim.v1.model.ServiceProviderConfigRequest;
import com.huaweicloud.sdk.identitycenterscim.v1.model.ServiceProviderConfigResponse;
import com.huaweicloud.sdk.identitycenterscim.v1.model.UpdateUserReqBody;

@SuppressWarnings("unchecked")
public class IdentityCenterSCIMMeta {

    public static final HttpRequestDef<CreateGroupRequest, CreateGroupResponse> createGroup = genForCreateGroup();

    private static HttpRequestDef<CreateGroupRequest, CreateGroupResponse> genForCreateGroup() {
        // basic
        HttpRequestDef.Builder<CreateGroupRequest, CreateGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateGroupRequest.class, CreateGroupResponse.class)
                .withName("CreateGroup")
                .withUri("/{tenant_id}/scim/v2/Groups")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("tenant_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateGroupRequest::getTenantId, CreateGroupRequest::setTenantId));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateGroupRequest::getAuthorization, CreateGroupRequest::setAuthorization));
        builder.<CreateGroupReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
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
                .withUri("/{tenant_id}/scim/v2/Groups/{group_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("tenant_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteGroupRequest::getTenantId, DeleteGroupRequest::setTenantId));
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteGroupRequest::getGroupId, DeleteGroupRequest::setGroupId));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteGroupRequest::getAuthorization, DeleteGroupRequest::setAuthorization));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<GetGroupRequest, GetGroupResponse> getGroup = genForGetGroup();

    private static HttpRequestDef<GetGroupRequest, GetGroupResponse> genForGetGroup() {
        // basic
        HttpRequestDef.Builder<GetGroupRequest, GetGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, GetGroupRequest.class, GetGroupResponse.class)
                .withName("GetGroup")
                .withUri("/{tenant_id}/scim/v2/Groups/{group_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("tenant_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetGroupRequest::getTenantId, GetGroupRequest::setTenantId));
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetGroupRequest::getGroupId, GetGroupRequest::setGroupId));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetGroupRequest::getAuthorization, GetGroupRequest::setAuthorization));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListGroupsRequest, ListGroupsResponse> listGroups = genForListGroups();

    private static HttpRequestDef<ListGroupsRequest, ListGroupsResponse> genForListGroups() {
        // basic
        HttpRequestDef.Builder<ListGroupsRequest, ListGroupsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListGroupsRequest.class, ListGroupsResponse.class)
                .withName("ListGroups")
                .withUri("/{tenant_id}/scim/v2/Groups")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("tenant_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGroupsRequest::getTenantId, ListGroupsRequest::setTenantId));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGroupsRequest::getAuthorization, ListGroupsRequest::setAuthorization));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<PatchGroupRequest, PatchGroupResponse> patchGroup = genForPatchGroup();

    private static HttpRequestDef<PatchGroupRequest, PatchGroupResponse> genForPatchGroup() {
        // basic
        HttpRequestDef.Builder<PatchGroupRequest, PatchGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.PATCH, PatchGroupRequest.class, PatchGroupResponse.class)
                .withName("PatchGroup")
                .withUri("/{tenant_id}/scim/v2/Groups/{group_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("tenant_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(PatchGroupRequest::getTenantId, PatchGroupRequest::setTenantId));
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(PatchGroupRequest::getGroupId, PatchGroupRequest::setGroupId));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(PatchGroupRequest::getAuthorization, PatchGroupRequest::setAuthorization));
        builder.<PatchGroupReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(PatchGroupReqBody.class),
            f -> f.withMarshaller(PatchGroupRequest::getBody, PatchGroupRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ServiceProviderConfigRequest, ServiceProviderConfigResponse> serviceProviderConfig =
        genForServiceProviderConfig();

    private static HttpRequestDef<ServiceProviderConfigRequest, ServiceProviderConfigResponse> genForServiceProviderConfig() {
        // basic
        HttpRequestDef.Builder<ServiceProviderConfigRequest, ServiceProviderConfigResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ServiceProviderConfigRequest.class, ServiceProviderConfigResponse.class)
            .withName("ServiceProviderConfig")
            .withUri("/{tenant_id}/scim/v2/ServiceProviderConfig")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("tenant_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ServiceProviderConfigRequest::getTenantId,
                ServiceProviderConfigRequest::setTenantId));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ServiceProviderConfigRequest::getAuthorization,
                ServiceProviderConfigRequest::setAuthorization));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateUserRequest, CreateUserResponse> createUser = genForCreateUser();

    private static HttpRequestDef<CreateUserRequest, CreateUserResponse> genForCreateUser() {
        // basic
        HttpRequestDef.Builder<CreateUserRequest, CreateUserResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateUserRequest.class, CreateUserResponse.class)
                .withName("CreateUser")
                .withUri("/{tenant_id}/scim/v2/Users")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("tenant_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateUserRequest::getTenantId, CreateUserRequest::setTenantId));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateUserRequest::getAuthorization, CreateUserRequest::setAuthorization));
        builder.<CreateUserReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
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
                .withUri("/{tenant_id}/scim/v2/Users/{user_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("tenant_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteUserRequest::getTenantId, DeleteUserRequest::setTenantId));
        builder.<String>withRequestField("user_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteUserRequest::getUserId, DeleteUserRequest::setUserId));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteUserRequest::getAuthorization, DeleteUserRequest::setAuthorization));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<GetUserRequest, GetUserResponse> getUser = genForGetUser();

    private static HttpRequestDef<GetUserRequest, GetUserResponse> genForGetUser() {
        // basic
        HttpRequestDef.Builder<GetUserRequest, GetUserResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, GetUserRequest.class, GetUserResponse.class)
                .withName("GetUser")
                .withUri("/{tenant_id}/scim/v2/Users/{user_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("tenant_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetUserRequest::getTenantId, GetUserRequest::setTenantId));
        builder.<String>withRequestField("user_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetUserRequest::getUserId, GetUserRequest::setUserId));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetUserRequest::getAuthorization, GetUserRequest::setAuthorization));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListUsersRequest, ListUsersResponse> listUsers = genForListUsers();

    private static HttpRequestDef<ListUsersRequest, ListUsersResponse> genForListUsers() {
        // basic
        HttpRequestDef.Builder<ListUsersRequest, ListUsersResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListUsersRequest.class, ListUsersResponse.class)
                .withName("ListUsers")
                .withUri("/{tenant_id}/scim/v2/Users")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("tenant_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUsersRequest::getTenantId, ListUsersRequest::setTenantId));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUsersRequest::getAuthorization, ListUsersRequest::setAuthorization));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<PatchUserRequest, PatchUserResponse> patchUser = genForPatchUser();

    private static HttpRequestDef<PatchUserRequest, PatchUserResponse> genForPatchUser() {
        // basic
        HttpRequestDef.Builder<PatchUserRequest, PatchUserResponse> builder =
            HttpRequestDef.builder(HttpMethod.PATCH, PatchUserRequest.class, PatchUserResponse.class)
                .withName("PatchUser")
                .withUri("/{tenant_id}/scim/v2/Users/{user_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("tenant_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(PatchUserRequest::getTenantId, PatchUserRequest::setTenantId));
        builder.<String>withRequestField("user_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(PatchUserRequest::getUserId, PatchUserRequest::setUserId));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(PatchUserRequest::getAuthorization, PatchUserRequest::setAuthorization));
        builder.<PatchUserReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(PatchUserReqBody.class),
            f -> f.withMarshaller(PatchUserRequest::getBody, PatchUserRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<PutUserRequest, PutUserResponse> putUser = genForPutUser();

    private static HttpRequestDef<PutUserRequest, PutUserResponse> genForPutUser() {
        // basic
        HttpRequestDef.Builder<PutUserRequest, PutUserResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, PutUserRequest.class, PutUserResponse.class)
                .withName("PutUser")
                .withUri("/{tenant_id}/scim/v2/Users/{user_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("tenant_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(PutUserRequest::getTenantId, PutUserRequest::setTenantId));
        builder.<String>withRequestField("user_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(PutUserRequest::getUserId, PutUserRequest::setUserId));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(PutUserRequest::getAuthorization, PutUserRequest::setAuthorization));
        builder.<UpdateUserReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdateUserReqBody.class),
            f -> f.withMarshaller(PutUserRequest::getBody, PutUserRequest::setBody));

        // response

        return builder.build();
    }

}
