package com.huaweicloud.sdk.codehub.v4;

import com.huaweicloud.sdk.codehub.v4.model.AddTenantTrustedIpAddressRequest;
import com.huaweicloud.sdk.codehub.v4.model.AddTenantTrustedIpAddressResponse;
import com.huaweicloud.sdk.codehub.v4.model.AddTrustedIpAddressRequest;
import com.huaweicloud.sdk.codehub.v4.model.AddTrustedIpAddressRequestBody;
import com.huaweicloud.sdk.codehub.v4.model.AddTrustedIpAddressResponse;
import com.huaweicloud.sdk.codehub.v4.model.AssociateGroupUserGroupRequest;
import com.huaweicloud.sdk.codehub.v4.model.AssociateGroupUserGroupResponse;
import com.huaweicloud.sdk.codehub.v4.model.AssociateRepositoryUserGroupRequest;
import com.huaweicloud.sdk.codehub.v4.model.AssociateRepositoryUserGroupResponse;
import com.huaweicloud.sdk.codehub.v4.model.CreateGroupRequest;
import com.huaweicloud.sdk.codehub.v4.model.CreateGroupRequestBody;
import com.huaweicloud.sdk.codehub.v4.model.CreateGroupResponse;
import com.huaweicloud.sdk.codehub.v4.model.DeleteGroupRequest;
import com.huaweicloud.sdk.codehub.v4.model.DeleteGroupResponse;
import com.huaweicloud.sdk.codehub.v4.model.DeleteTenantTrustedIpAddressRequest;
import com.huaweicloud.sdk.codehub.v4.model.DeleteTenantTrustedIpAddressResponse;
import com.huaweicloud.sdk.codehub.v4.model.DeleteTrustedIpAddressRequest;
import com.huaweicloud.sdk.codehub.v4.model.DeleteTrustedIpAddressResponse;
import com.huaweicloud.sdk.codehub.v4.model.GroupsManageableDto;
import com.huaweicloud.sdk.codehub.v4.model.ListManageableGroupsRequest;
import com.huaweicloud.sdk.codehub.v4.model.ListManageableGroupsResponse;
import com.huaweicloud.sdk.codehub.v4.model.ListTenantTrustedIpAddressesRequest;
import com.huaweicloud.sdk.codehub.v4.model.ListTenantTrustedIpAddressesResponse;
import com.huaweicloud.sdk.codehub.v4.model.ListTrustedIpAddressesRequest;
import com.huaweicloud.sdk.codehub.v4.model.ListTrustedIpAddressesResponse;
import com.huaweicloud.sdk.codehub.v4.model.LockRepositoryRequest;
import com.huaweicloud.sdk.codehub.v4.model.LockRepositoryResponse;
import com.huaweicloud.sdk.codehub.v4.model.ShowGroupRequest;
import com.huaweicloud.sdk.codehub.v4.model.ShowGroupResponse;
import com.huaweicloud.sdk.codehub.v4.model.TenantTrustedIpAddressDto;
import com.huaweicloud.sdk.codehub.v4.model.TrustedIpAddressDto;
import com.huaweicloud.sdk.codehub.v4.model.UnlockRepositoryRequest;
import com.huaweicloud.sdk.codehub.v4.model.UnlockRepositoryResponse;
import com.huaweicloud.sdk.codehub.v4.model.UpdateTenantTrustedIpAddressRequest;
import com.huaweicloud.sdk.codehub.v4.model.UpdateTenantTrustedIpAddressResponse;
import com.huaweicloud.sdk.codehub.v4.model.UpdateTrustedIpAddressRequest;
import com.huaweicloud.sdk.codehub.v4.model.UpdateTrustedIpAddressResponse;
import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;

import java.util.List;

@SuppressWarnings("unchecked")
public class CodeHubMeta {

    public static final HttpRequestDef<AssociateGroupUserGroupRequest, AssociateGroupUserGroupResponse> associateGroupUserGroup =
        genForAssociateGroupUserGroup();

    private static HttpRequestDef<AssociateGroupUserGroupRequest, AssociateGroupUserGroupResponse> genForAssociateGroupUserGroup() {
        // basic
        HttpRequestDef.Builder<AssociateGroupUserGroupRequest, AssociateGroupUserGroupResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, AssociateGroupUserGroupRequest.class, AssociateGroupUserGroupResponse.class)
            .withName("AssociateGroupUserGroup")
            .withUri("/v4/{project_id}/groups/{group_id}/user-group/{user_group_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AssociateGroupUserGroupRequest::getProjectId,
                AssociateGroupUserGroupRequest::setProjectId));
        builder.<Integer>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(AssociateGroupUserGroupRequest::getGroupId,
                AssociateGroupUserGroupRequest::setGroupId));
        builder.<String>withRequestField("user_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AssociateGroupUserGroupRequest::getUserGroupId,
                AssociateGroupUserGroupRequest::setUserGroupId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AssociateRepositoryUserGroupRequest, AssociateRepositoryUserGroupResponse> associateRepositoryUserGroup =
        genForAssociateRepositoryUserGroup();

    private static HttpRequestDef<AssociateRepositoryUserGroupRequest, AssociateRepositoryUserGroupResponse> genForAssociateRepositoryUserGroup() {
        // basic
        HttpRequestDef.Builder<AssociateRepositoryUserGroupRequest, AssociateRepositoryUserGroupResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    AssociateRepositoryUserGroupRequest.class,
                    AssociateRepositoryUserGroupResponse.class)
                .withName("AssociateRepositoryUserGroup")
                .withUri("/v4/{project_id}/repositories/{repository_id}/user-group/{user_group_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AssociateRepositoryUserGroupRequest::getProjectId,
                AssociateRepositoryUserGroupRequest::setProjectId));
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(AssociateRepositoryUserGroupRequest::getRepositoryId,
                AssociateRepositoryUserGroupRequest::setRepositoryId));
        builder.<String>withRequestField("user_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AssociateRepositoryUserGroupRequest::getUserGroupId,
                AssociateRepositoryUserGroupRequest::setUserGroupId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateGroupRequest, CreateGroupResponse> createGroup = genForCreateGroup();

    private static HttpRequestDef<CreateGroupRequest, CreateGroupResponse> genForCreateGroup() {
        // basic
        HttpRequestDef.Builder<CreateGroupRequest, CreateGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateGroupRequest.class, CreateGroupResponse.class)
                .withName("CreateGroup")
                .withUri("/v4/{project_id}/groups")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateGroupRequest::getProjectId, CreateGroupRequest::setProjectId));
        builder.<CreateGroupRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateGroupRequestBody.class),
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
                .withUri("/v4/{project_id}/groups/{group_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteGroupRequest::getProjectId, DeleteGroupRequest::setProjectId));
        builder.<Integer>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(DeleteGroupRequest::getGroupId, DeleteGroupRequest::setGroupId));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteGroupResponse::getBody, DeleteGroupResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<ListManageableGroupsRequest, ListManageableGroupsResponse> listManageableGroups =
        genForListManageableGroups();

    private static HttpRequestDef<ListManageableGroupsRequest, ListManageableGroupsResponse> genForListManageableGroups() {
        // basic
        HttpRequestDef.Builder<ListManageableGroupsRequest, ListManageableGroupsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListManageableGroupsRequest.class, ListManageableGroupsResponse.class)
            .withName("ListManageableGroups")
            .withUri("/v4/{project_id}/manageable-groups")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListManageableGroupsRequest::getProjectId,
                ListManageableGroupsRequest::setProjectId));
        builder.<ListManageableGroupsRequest.ScopeEnum>withRequestField("scope",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListManageableGroupsRequest.ScopeEnum.class),
            f -> f.withMarshaller(ListManageableGroupsRequest::getScope, ListManageableGroupsRequest::setScope));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListManageableGroupsRequest::getOffset, ListManageableGroupsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListManageableGroupsRequest::getLimit, ListManageableGroupsRequest::setLimit));

        // response
        builder.<List<GroupsManageableDto>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListManageableGroupsResponse::getBody, ListManageableGroupsResponse::setBody)
                .withInnerContainerType(GroupsManageableDto.class));

        builder.<String>withResponseField("X-Total",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListManageableGroupsResponse::getXTotal, ListManageableGroupsResponse::setXTotal));
        return builder.build();
    }

    public static final HttpRequestDef<ShowGroupRequest, ShowGroupResponse> showGroup = genForShowGroup();

    private static HttpRequestDef<ShowGroupRequest, ShowGroupResponse> genForShowGroup() {
        // basic
        HttpRequestDef.Builder<ShowGroupRequest, ShowGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowGroupRequest.class, ShowGroupResponse.class)
                .withName("ShowGroup")
                .withUri("/v4/{project_id}/groups/{group_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGroupRequest::getProjectId, ShowGroupRequest::setProjectId));
        builder.<Integer>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowGroupRequest::getGroupId, ShowGroupRequest::setGroupId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddTrustedIpAddressRequest, AddTrustedIpAddressResponse> addTrustedIpAddress =
        genForAddTrustedIpAddress();

    private static HttpRequestDef<AddTrustedIpAddressRequest, AddTrustedIpAddressResponse> genForAddTrustedIpAddress() {
        // basic
        HttpRequestDef.Builder<AddTrustedIpAddressRequest, AddTrustedIpAddressResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AddTrustedIpAddressRequest.class, AddTrustedIpAddressResponse.class)
                .withName("AddTrustedIpAddress")
                .withUri("/v4/projects/{id}/trusted-ip-addresses")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(AddTrustedIpAddressRequest::getId, AddTrustedIpAddressRequest::setId));
        builder.<AddTrustedIpAddressRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AddTrustedIpAddressRequestBody.class),
            f -> f.withMarshaller(AddTrustedIpAddressRequest::getBody, AddTrustedIpAddressRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteTrustedIpAddressRequest, DeleteTrustedIpAddressResponse> deleteTrustedIpAddress =
        genForDeleteTrustedIpAddress();

    private static HttpRequestDef<DeleteTrustedIpAddressRequest, DeleteTrustedIpAddressResponse> genForDeleteTrustedIpAddress() {
        // basic
        HttpRequestDef.Builder<DeleteTrustedIpAddressRequest, DeleteTrustedIpAddressResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteTrustedIpAddressRequest.class, DeleteTrustedIpAddressResponse.class)
            .withName("DeleteTrustedIpAddress")
            .withUri("/v4/projects/{id}/trusted-ip-addresses/{ip_id}")
            .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(DeleteTrustedIpAddressRequest::getId, DeleteTrustedIpAddressRequest::setId));
        builder.<Integer>withRequestField("ip_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(DeleteTrustedIpAddressRequest::getIpId, DeleteTrustedIpAddressRequest::setIpId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTrustedIpAddressesRequest, ListTrustedIpAddressesResponse> listTrustedIpAddresses =
        genForListTrustedIpAddresses();

    private static HttpRequestDef<ListTrustedIpAddressesRequest, ListTrustedIpAddressesResponse> genForListTrustedIpAddresses() {
        // basic
        HttpRequestDef.Builder<ListTrustedIpAddressesRequest, ListTrustedIpAddressesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListTrustedIpAddressesRequest.class, ListTrustedIpAddressesResponse.class)
            .withName("ListTrustedIpAddresses")
            .withUri("/v4/projects/{id}/trusted-ip-addresses")
            .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTrustedIpAddressesRequest::getId, ListTrustedIpAddressesRequest::setId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTrustedIpAddressesRequest::getOffset, ListTrustedIpAddressesRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTrustedIpAddressesRequest::getLimit, ListTrustedIpAddressesRequest::setLimit));

        // response
        builder.<List<TrustedIpAddressDto>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListTrustedIpAddressesResponse::getBody, ListTrustedIpAddressesResponse::setBody)
                .withInnerContainerType(TrustedIpAddressDto.class));

        builder.<String>withResponseField("X-Total",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListTrustedIpAddressesResponse::getXTotal,
                ListTrustedIpAddressesResponse::setXTotal));
        return builder.build();
    }

    public static final HttpRequestDef<LockRepositoryRequest, LockRepositoryResponse> lockRepository =
        genForLockRepository();

    private static HttpRequestDef<LockRepositoryRequest, LockRepositoryResponse> genForLockRepository() {
        // basic
        HttpRequestDef.Builder<LockRepositoryRequest, LockRepositoryResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, LockRepositoryRequest.class, LockRepositoryResponse.class)
                .withName("LockRepository")
                .withUri("/v4/{project_id}/repositories/{repository_id}/lock")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(LockRepositoryRequest::getProjectId, LockRepositoryRequest::setProjectId));
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(LockRepositoryRequest::getRepositoryId, LockRepositoryRequest::setRepositoryId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UnlockRepositoryRequest, UnlockRepositoryResponse> unlockRepository =
        genForUnlockRepository();

    private static HttpRequestDef<UnlockRepositoryRequest, UnlockRepositoryResponse> genForUnlockRepository() {
        // basic
        HttpRequestDef.Builder<UnlockRepositoryRequest, UnlockRepositoryResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UnlockRepositoryRequest.class, UnlockRepositoryResponse.class)
                .withName("UnlockRepository")
                .withUri("/v4/{project_id}/repositories/{repository_id}/unlock")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UnlockRepositoryRequest::getProjectId, UnlockRepositoryRequest::setProjectId));
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(UnlockRepositoryRequest::getRepositoryId, UnlockRepositoryRequest::setRepositoryId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateTrustedIpAddressRequest, UpdateTrustedIpAddressResponse> updateTrustedIpAddress =
        genForUpdateTrustedIpAddress();

    private static HttpRequestDef<UpdateTrustedIpAddressRequest, UpdateTrustedIpAddressResponse> genForUpdateTrustedIpAddress() {
        // basic
        HttpRequestDef.Builder<UpdateTrustedIpAddressRequest, UpdateTrustedIpAddressResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateTrustedIpAddressRequest.class, UpdateTrustedIpAddressResponse.class)
            .withName("UpdateTrustedIpAddress")
            .withUri("/v4/projects/{id}/trusted-ip-addresses/{ip_id}")
            .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(UpdateTrustedIpAddressRequest::getId, UpdateTrustedIpAddressRequest::setId));
        builder.<Integer>withRequestField("ip_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(UpdateTrustedIpAddressRequest::getIpId, UpdateTrustedIpAddressRequest::setIpId));
        builder.<AddTrustedIpAddressRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AddTrustedIpAddressRequestBody.class),
            f -> f.withMarshaller(UpdateTrustedIpAddressRequest::getBody, UpdateTrustedIpAddressRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddTenantTrustedIpAddressRequest, AddTenantTrustedIpAddressResponse> addTenantTrustedIpAddress =
        genForAddTenantTrustedIpAddress();

    private static HttpRequestDef<AddTenantTrustedIpAddressRequest, AddTenantTrustedIpAddressResponse> genForAddTenantTrustedIpAddress() {
        // basic
        HttpRequestDef.Builder<AddTenantTrustedIpAddressRequest, AddTenantTrustedIpAddressResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    AddTenantTrustedIpAddressRequest.class,
                    AddTenantTrustedIpAddressResponse.class)
                .withName("AddTenantTrustedIpAddress")
                .withUri("/v4/tenant/trusted-ip-addresses")
                .withContentType("application/json");

        // requests
        builder.<AddTrustedIpAddressRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AddTrustedIpAddressRequestBody.class),
            f -> f.withMarshaller(AddTenantTrustedIpAddressRequest::getBody,
                AddTenantTrustedIpAddressRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteTenantTrustedIpAddressRequest, DeleteTenantTrustedIpAddressResponse> deleteTenantTrustedIpAddress =
        genForDeleteTenantTrustedIpAddress();

    private static HttpRequestDef<DeleteTenantTrustedIpAddressRequest, DeleteTenantTrustedIpAddressResponse> genForDeleteTenantTrustedIpAddress() {
        // basic
        HttpRequestDef.Builder<DeleteTenantTrustedIpAddressRequest, DeleteTenantTrustedIpAddressResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteTenantTrustedIpAddressRequest.class,
                    DeleteTenantTrustedIpAddressResponse.class)
                .withName("DeleteTenantTrustedIpAddress")
                .withUri("/v4/tenant/trusted-ip-addresses/{ip_id}")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("ip_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(DeleteTenantTrustedIpAddressRequest::getIpId,
                DeleteTenantTrustedIpAddressRequest::setIpId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTenantTrustedIpAddressesRequest, ListTenantTrustedIpAddressesResponse> listTenantTrustedIpAddresses =
        genForListTenantTrustedIpAddresses();

    private static HttpRequestDef<ListTenantTrustedIpAddressesRequest, ListTenantTrustedIpAddressesResponse> genForListTenantTrustedIpAddresses() {
        // basic
        HttpRequestDef.Builder<ListTenantTrustedIpAddressesRequest, ListTenantTrustedIpAddressesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListTenantTrustedIpAddressesRequest.class,
                    ListTenantTrustedIpAddressesResponse.class)
                .withName("ListTenantTrustedIpAddresses")
                .withUri("/v4/tenant/trusted-ip-addresses")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTenantTrustedIpAddressesRequest::getOffset,
                ListTenantTrustedIpAddressesRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTenantTrustedIpAddressesRequest::getLimit,
                ListTenantTrustedIpAddressesRequest::setLimit));

        // response
        builder.<List<TenantTrustedIpAddressDto>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f
                .withMarshaller(ListTenantTrustedIpAddressesResponse::getBody,
                    ListTenantTrustedIpAddressesResponse::setBody)
                .withInnerContainerType(TenantTrustedIpAddressDto.class));

        builder.<String>withResponseField("X-Total",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListTenantTrustedIpAddressesResponse::getXTotal,
                ListTenantTrustedIpAddressesResponse::setXTotal));
        return builder.build();
    }

    public static final HttpRequestDef<UpdateTenantTrustedIpAddressRequest, UpdateTenantTrustedIpAddressResponse> updateTenantTrustedIpAddress =
        genForUpdateTenantTrustedIpAddress();

    private static HttpRequestDef<UpdateTenantTrustedIpAddressRequest, UpdateTenantTrustedIpAddressResponse> genForUpdateTenantTrustedIpAddress() {
        // basic
        HttpRequestDef.Builder<UpdateTenantTrustedIpAddressRequest, UpdateTenantTrustedIpAddressResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateTenantTrustedIpAddressRequest.class,
                    UpdateTenantTrustedIpAddressResponse.class)
                .withName("UpdateTenantTrustedIpAddress")
                .withUri("/v4/tenant/trusted-ip-addresses/{ip_id}")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("ip_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(UpdateTenantTrustedIpAddressRequest::getIpId,
                UpdateTenantTrustedIpAddressRequest::setIpId));
        builder.<AddTrustedIpAddressRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AddTrustedIpAddressRequestBody.class),
            f -> f.withMarshaller(UpdateTenantTrustedIpAddressRequest::getBody,
                UpdateTenantTrustedIpAddressRequest::setBody));

        // response

        return builder.build();
    }

}
